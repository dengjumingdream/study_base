package com.zhenyue.techcenter.mockserver.spring.annotation.impl;

import cn.hutool.core.util.StrUtil;
import com.zhenyue.techcenter.mockserver.spring.annotation.OrderNotifyContextService;
import com.zhenyue.techcenter.mockserver.spring.annotation.OrderNotifyHandleService;
import com.zhenyue.techcenter.mockserver.spring.annotation.RequestTag;
import org.apache.commons.codec.binary.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderNotifyContextServiceImpl implements OrderNotifyContextService {

    @Autowired
    private List<OrderNotifyHandleService> handleServiceList;

    @Resource(name = "NonSupportNotifyHandleServiceImpl")
    private OrderNotifyHandleService nonsupportService;

    @Override
    public OrderNotifyHandleService getContext(String tag) {
        if (StrUtil.hasBlank(tag)) {
            return nonsupportService;
        }

        // 对比注解中的value和tag
        OrderNotifyHandleService handleService = handleServiceList.stream()
                .filter(f -> StringUtils.equals(tag, f.getClass().getAnnotation(RequestTag.class).value()))
                .findFirst()
                .orElse(nonsupportService);
        return handleService;
    }
}
