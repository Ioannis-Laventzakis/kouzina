package com.kouzina.kouzina.controller;

import com.kouzina.kouzina.model.MenuItem;
import com.kouzina.kouzina.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MenuController {

    @Autowired
    private MenuItemRepository menuItemRepository;

    @GetMapping("/menu")
    public String showMenu(Model model) {
        model.addAttribute("items", menuItemRepository.findAll());
        return "menu";
    }

    @GetMapping("/menu/add")
    public String showAddForm(Model model) {
        model.addAttribute("menuItem", new MenuItem());
        return "add-menu-item";
    }

    @PostMapping("/menu/add")
    public String addMenuItem(@ModelAttribute MenuItem menuItem) {
        menuItemRepository.save(menuItem);
        return "redirect:/menu";
    }
    @GetMapping("/")
    public String showHome() {
        return "redirect:/menu";
    }
}
