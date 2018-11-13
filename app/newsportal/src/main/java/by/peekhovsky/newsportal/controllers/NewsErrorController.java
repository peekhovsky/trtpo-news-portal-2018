package by.peekhovsky.newsportal.controllers;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class NewsErrorController implements ErrorController {

    @RequestMapping("/auth_fail")
    public String handleErrorFailure(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("auth_fail", true);
        return "redirect:/";
    }


    @RequestMapping("/error")
    public String handleError(HttpServletRequest request, ModelMap model) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if (status != null) {
            Integer statusCode = Integer.valueOf(status.toString());

            if (statusCode == HttpStatus.NOT_FOUND.value()) {
                model.addAttribute("message", "404: Not found");
                return "error";
            }
            else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                model.addAttribute("message", "500: Internal server error.");
                return "error";
            }
            else if (statusCode == HttpStatus.BAD_REQUEST.value()) {
                model.addAttribute("message", "400: Bad request error.");
                return "error";
            }
        }
        return "error";
    }
    @Override
    public String getErrorPath() {
        return "/error";
    }
}