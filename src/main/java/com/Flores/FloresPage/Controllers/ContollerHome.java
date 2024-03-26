package com.Flores.FloresPage.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ContollerHome {
   @GetMapping("/")
    public String HomePage(){
        return "PageHome";
    }

}
