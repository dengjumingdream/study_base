package com.zhenyue.techcenter.mockserver.spring.annotation.model;

public class VendorOrderNotifyRequest {
    /**
     * 数据
     */
    private String data;

    /**
     * 依据tag判断事件类型
     */
    private String tag;

    /**
     * 创建时间
     */
    private long createTime;

    /**
     * 签名
     */
    private String sign;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
