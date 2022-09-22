package io.kalipo.prototype;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SinglePageAppController {
    @RequestMapping(value={
            "/badges",
            "/logs",
            "/users",
            "/autons",
    })
    public String index() {
        return "/";
    }

}
