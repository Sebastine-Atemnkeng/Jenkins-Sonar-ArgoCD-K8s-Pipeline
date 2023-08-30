import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String getHomePage() {
        return "index"; // This should match the name of your HTML file (without the extension)
    }
}
