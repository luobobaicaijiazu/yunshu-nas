package top.itning.yunshu.yunshunas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author itning
 * @date 2019/7/17 20:29
 */
@Controller
public class FrameController {
    @GetMapping("/down_queue")
    public String downQueue() {
        return "down_queue";
    }

    @GetMapping("/log")
    public String log() {
        return "log";
    }
}
