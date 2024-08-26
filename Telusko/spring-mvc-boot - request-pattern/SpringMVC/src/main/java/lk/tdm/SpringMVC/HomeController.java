package lk.tdm.SpringMVC;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){
//        System.out.println("Home Page requested.!");
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1") int i,@RequestParam("num2") int j , HttpSession session){

        int num3 = i+j;

        session.setAttribute("num3", num3);

        return "result.jsp";
    }

}
