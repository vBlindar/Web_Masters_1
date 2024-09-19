package kg.krsu.vblindar.lab_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/index")
public class MainController {

    @GetMapping()
    public String getIndex(Model model){
        Map<String,String> map = new HashMap<>();
        map.put("name", "Блиндар Владислав Алексеевич");
        map.put("speciality","Программный инженер");
        map.put("course","Магистратура, 1 курс");
        map.put("group","ЕПИМ-24");
        model.addAllAttributes(map);
        return "index";
    }
}
