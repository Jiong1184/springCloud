package org.fqh.gateway.manage.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiong1184
 * @date 2021/7/1 0:23
 */
@RestController
public class TestCtrl {

    @GetMapping("hello")
    public String hello(){
        return "gateway";
    }
}
