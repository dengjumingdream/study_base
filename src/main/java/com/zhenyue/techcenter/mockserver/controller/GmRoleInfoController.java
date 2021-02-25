package com.zhenyue.techcenter.mockserver.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSort;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Api(tags = "2.0.2版本-20200226")
@ApiSort(0)
@RestController
@RequestMapping("/local/checkbox")
public class GmRoleInfoController {

    /**
     *   查询
     * @param
     * @return
     */
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ApiOperationSupport(order = 1)
    @ApiOperation(value = "消息", notes = "消息", tags = "1.0")
    public String query() {
        return "Hello world";
    }
}
