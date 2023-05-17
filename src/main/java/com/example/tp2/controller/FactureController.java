package com.example.tp2.controller;

import com.example.tp2.model.Facture;
import com.example.tp2.service.ClientService;
import com.example.tp2.service.FactureService;
import com.example.tp2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("factures")
public class FactureController {
    @Autowired
    FactureService factureService;
    @Autowired
    ClientService clientService;
    @Autowired
    ProductService produitService;

    @GetMapping
    public String all(Model model) {
        model.addAttribute("factures", factureService.fetchAll());
        return "factures/factures";
    }

    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("facture", new Facture());
        model.addAttribute("clients", clientService.fetchAll());
        model.addAttribute("produits", produitService.fetchAll());
        return "factures/add";
    }

    @PostMapping("create")
    public String createPost(@ModelAttribute Facture facture) {
        factureService.save(facture);
        return "redirect:/factures";
    }

    @GetMapping("edit/{id}")
    public String editGet(Model model, @PathVariable int id) {
        model.addAttribute("facture", factureService.fetchById(id));
        model.addAttribute("clients", clientService.fetchAll());
        model.addAttribute("produits", produitService.fetchAll());
        return "factures/edit";
    }

    @PostMapping("edit/{id}")
    public String editGet(@ModelAttribute Facture facture) {
        factureService.save(facture);
        return "redirect:/factures";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable int id) {
        factureService.delete(id);
        return "redirect:/factures";
    }
}
