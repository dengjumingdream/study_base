package com.zhenyue.techcenter.mockserver.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private String roleid;
    private String rolename;
    private Date createTime;
    private Integer rolelevel;
    private Integer viplevel;
    private Integer status;
    private String reason;

    //平台id
    private String platid;
    //区服
    private String serverRegion;

    private Integer ifMonitor;
}
