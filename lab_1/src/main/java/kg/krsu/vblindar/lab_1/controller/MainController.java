package kg.krsu.vblindar.lab_1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class MainController {


    @GetMapping
    public String getIndex(){
        return "index";
    }

}
