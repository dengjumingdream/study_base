package com.zhenyue.techcenter.mockserver.spring.annotation;

public interface OrderNotifyContextService {
    OrderNotifyHandleService getContext(String tag);
}

