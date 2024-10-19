/**
 * 
 */
package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.Saint;
import com.example.demo.services.SaintService;

/**
 * 
 */
@Controller
@RequestMapping("/saints")
public class SaintController {

    @Autowired
    private SaintService saintService;

    @GetMapping
    public String listSaints(Model model) {
    	model.addAttribute("title", "Saints");
        model.addAttribute("saints", saintService.getAllSaints());
        return "saints/list";
    }

    @GetMapping("/new")
    public String showNewForm(Model model) {
        model.addAttribute("saint", new Saint());
        return "saints/form";
    }

    @PostMapping
    public String saveSaint(@ModelAttribute("saint") Saint saint) {
        saintService.saveSaint(saint);
        return "redirect:/saints";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
    	Saint saint = saintService.getSaintById(id);
        model.addAttribute("saint", saint);
        return "saints/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteSaint(@PathVariable Long id) {
        saintService.deleteSaint(id);
        return "redirect:/saints";
    }

}
