package tm.pusher.web;

import org.springframework.stereotype.Controller;
import java.util.ArrayList;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import tm.pusher.constants.GeneralConstants;
import tm.pusher.constants.PusherConstants;
import tm.pusher.model.Product;

@Controller
@SessionAttributes(GeneralConstants.ID_SESSION_SHOPPING_CART)
public class IndexController {
    @RequestMapping(method=RequestMethod.GET, value="/")
    public ModelAndView index(Model model) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("index");
        modelAndView.addObject("pusher_app_key", PusherConstants.PUSHER_APP_KEY);
        modelAndView.addObject("pusher_channel", PusherConstants.CHANNEL_NAME);

        if(!model.containsAttribute(GeneralConstants.ID_SESSION_SHOPPING_CART)) {
            model.addAttribute(GeneralConstants.ID_SESSION_SHOPPING_CART, new ArrayList<Product>());
        }

        return modelAndView;
    }
}
