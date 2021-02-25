package com.zhenyue.techcenter.mockserver.annotation1.impl;

import com.zhenyue.techcenter.mockserver.annotation1.CmdTag;
import com.zhenyue.techcenter.mockserver.annotation1.OperateContextService;
import com.zhenyue.techcenter.mockserver.annotation1.OperateHandleService;
import org.apache.commons.codec.binary.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OperateContextServiceImpl implements OperateContextService {

    @Autowired
    private List<OperateHandleService> list;

    @Resource(name = "NonOperateServiceImpl")
    private NonOperateServiceImpl nonOperateService;

    @Override
    public OperateHandleService getContext(String cmd) {
        OperateHandleService service = list.stream().filter(f ->
                StringUtils.equals(cmd, f.getClass().getAnnotation(CmdTag.class).value()))
                .findFirst()
                .orElse(nonOperateService);
        return service;
    }
}
