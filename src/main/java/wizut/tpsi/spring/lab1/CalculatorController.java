package wizut.tpsi.spring.lab1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculatorController {

    @RequestMapping("/calculator")
    public String calculator(Model model, Integer x, Integer y) {
        model.addAttribute("x", x);
        model.addAttribute("dzialanie", '+');
        model.addAttribute("y", y);
        model.addAttribute("wynik", (x+y));    

        return "calculator";
    }

    @RequestMapping("/calculator_3")
    public String calculator_3(Model model, CalculatorForm operacja) {
        model.addAttribute("x", operacja.getX());
        model.addAttribute("y", operacja.getY());
        model.addAttribute("dzialanie", operacja.getDzialanie());
        switch(operacja.getDzialanie()){
            case '+':
                model.addAttribute("wynik", (operacja.getX()+operacja.getY()));
                break;
            case '-':
                model.addAttribute("wynik", (operacja.getX()-operacja.getY()));
                break;
            case '*':
                model.addAttribute("wynik", (operacja.getX()*operacja.getY()));
                break;
                
        } 
        return "calculator";
    }
}
