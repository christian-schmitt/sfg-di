package guru.springframewrok.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by cs on 12.10.20.
 */
@Service
public class PropertyGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello, world! - Property";
    }

}
