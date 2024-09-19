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

    @GetMapping("/studentForm")
    public String showForm() {
        return "studentForm";
    }

    @GetMapping("/submitForm")
    public String submitFormWithParams(@RequestParam("name") String name,
                                       @RequestParam("group") String group,
                                       @RequestParam("speciality") String speciality,
                                       Model model) {
        model.addAttribute("name", name);
        model.addAttribute("group", group);
        model.addAttribute("speciality", speciality);
        return "studentInfo";
    }

    @GetMapping("/submitForm/{name}/{group}/{speciality}")
    public String submitFormWithPathVariables(@PathVariable("name") String name,
                                              @PathVariable("group") String group,
                                              @PathVariable("speciality") String speciality,
                                              Model model) {
        model.addAttribute("name", name);
        model.addAttribute("group", group);
        model.addAttribute("speciality", speciality);
        return "studentInfo";
    }


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