import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RequiredArgsConstructor
@Controller
public class HomeController {
    @RequestMapping(value = {"/","/api-docs","/v3/api-docs"})
    public RedirectView redirect() {
        return new RedirectView("/swagger-ui.html");
    }
}
