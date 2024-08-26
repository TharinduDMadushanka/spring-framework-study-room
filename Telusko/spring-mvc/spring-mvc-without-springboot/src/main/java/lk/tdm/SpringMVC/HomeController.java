package lk.tdm.SpringMVC;

import lk.tdm.SpringMVC.model.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute
    public void modelData(Model model){
        model.addAttribute("name","TDM" );

    }

    @RequestMapping("/home")
    public String home(){
        return "index";
    }


    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute() Alien a){

//        m.addAttribute("alien",a);

        return "result";
    }

}
