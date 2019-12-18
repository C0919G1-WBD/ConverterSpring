package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class convertController {

    @GetMapping("home")
    public ModelAndView viewHome() {
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }

    @PostMapping("result")
    public ModelAndView viewResult(@RequestParam float usd) {
        float vnd = usd * 22000;
        ModelAndView modelAndView = new ModelAndView("result");
        modelAndView.addObject("usd",usd);
        modelAndView.addObject("vnd",vnd);
        return modelAndView;
    }
}
