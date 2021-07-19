package org.fqh.security.manage.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiong1184
 * @date 2021/6/30 23:38
 */
@RestController
public class TestCtrl {

    @GetMapping("hello")
    public String test(){
        return "security";
    }
}
