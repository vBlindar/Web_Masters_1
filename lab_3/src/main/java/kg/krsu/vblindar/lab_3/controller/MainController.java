package kg.krsu.vblindar.lab_3.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
// http://localhost:8080/index/%D0%91%D0%BB%D0%B8%D0%BD%D0%B4%D0%B0%D1%80%20%D0%92%D0%BB%D0%B0%D0%B4%D0%B8%D1%81%D0%BB%D0%B0%D0%B2/dev/3/epim
    @GetMapping("/{name}/{speciality}/{course}/{group}")
    public String getIndexByPath(Model model,
                           @PathVariable String name,
                           @PathVariable String course,
                           @PathVariable String group,
                           @PathVariable String speciality){
        Map<String,String> map = new HashMap<>();
        map.put("name", name);
        map.put("speciality",speciality);
        map.put("course",course);
        map.put("group",group);
        model.addAllAttributes(map);
        return "index";
    }

    // http://localhost:8080/index/param?name=vlad&speciality=dev&course=2&group=epim24

    @GetMapping("/param")
    public String getIndexByParam(Model model,
                           @RequestParam String name,
                           @RequestParam String course,
                           @RequestParam String speciality,
                           @RequestParam String group){

        Map<String,String> map = new HashMap<>();
        map.put("name", name);
        map.put("speciality",speciality);
        map.put("course",course);
        map.put("group",group);
        model.addAllAttributes(map);

        return "index";
    }

}