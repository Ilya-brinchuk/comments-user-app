package com.brynchuk.commentsuserapp.controllers;

import com.brynchuk.commentsuserapp.model.Comment;
import com.brynchuk.commentsuserapp.repository.CommentsRepository;
import com.brynchuk.commentsuserapp.service.DummyService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UsersController {
    private final DummyService dummyService;
    private final CommentsRepository repository;

    @Autowired
    public UsersController(DummyService dummyService, CommentsRepository repository) {
        this.dummyService = dummyService;
        this.repository = repository;
    }

    @GetMapping("/users")
    public ModelAndView example() {
        List<Comment> dataList = repository.findAll() ;
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject("dataList", dataList);
        List<Comment> comments = dummyService.getComments();
        return modelAndView;
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
        if (authentication != null) {
            new SecurityContextLogoutHandler().logout(request, response, authentication);
        }
        return "redirect:/login?logout";
    }
}
