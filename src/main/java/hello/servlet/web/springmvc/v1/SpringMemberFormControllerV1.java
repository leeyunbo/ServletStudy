package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
Controller, RequestMapping이 Class 레벨로 달려있는 클래스는 RequestMappingHandlerMapping에 의해 처리가
RequestMappingHandlerMapping에 isHandler() 메서드에 해당 로직이 들어가있음!
 */
@Controller
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        System.out.println("SpringMemberFormControllerV1.process");
        return new ModelAndView("new-form");
    }
}
