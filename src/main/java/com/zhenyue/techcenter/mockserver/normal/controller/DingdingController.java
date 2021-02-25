package com.zhenyue.techcenter.mockserver.normal.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("test")
public class DingdingController {

    /**
     *   查询
     * @param
     * @return
     */
    @CrossOrigin
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(String code, String state) {
        System.out.println("code:" +  code);
        System.out.println("state:" + state);
        return "hello,wold";
    }
}
