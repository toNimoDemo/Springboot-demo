package com.lehaha.SpringbootDemo.demos.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/user/demo")
    public Response getDemoResponse() {
        Data data = new Data("ceo", 1, "董事长", "1", "2023-12-20 11:45:00", 0);
        return new Response(20000, "操作成功", data);
    }

}
