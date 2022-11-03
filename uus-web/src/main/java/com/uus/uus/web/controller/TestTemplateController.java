package com.uus.uus.web.controller;

import com.uus.uus.common.vo.ResultInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestTemplateController {

    @GetMapping("/api/test")
    public ResultInfo testApi() {
        return ResultInfo.success("test api");
    }

}
