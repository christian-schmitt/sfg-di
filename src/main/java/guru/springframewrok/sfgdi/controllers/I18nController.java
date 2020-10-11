package guru.springframewrok.sfgdi.controllers;

import guru.springframewrok.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by cs on 12.10.20.
 */
@Controller
public class I18nController {
    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting() {
       return greetingService.sayGreeting();
    }
}
