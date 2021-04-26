package hello.servlet.web.springmvc.old;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 옛날에 사용하던 컨트롤러 인터페이스
 * Controller 인터페이스를 실행해줄 어뎁터를 어떻게 찾지?
 * 핸들러 매핑은 어떻게 해서 어떻게 이 OldController를 찾아낸거지?
 * -> 스프링 부트가 핸들러매핑과 핸들러어댑터들을 자동으로 등록한다.
 *
 * <<==HandlerMapping==>
 * 우선순위 0 - RequestMappingHandlerMapping : @RequestMapping, @Controller와 같은 에노테이션 기반 컨트롤러를 찾음
 * 우선순위 1 - BeanNameUrlHandlerMapping : @Component("스프링 빈 이름")과 같이 스프링 빈의 이름으로 핸들러를 찾는다.
 *
 * <<==HandlerAdapter==>
 * ...
 */
@Component("/springmvc/old-controller")
public class OldController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("OldController.handleRequest");
        return new ModelAndView("new-form");
    }
}
