package org.ck.clientui.controller;

/*
 * @author Boris cissoko
 * @project microservice-commandes
 * @created 25/01/2023 - /17:52
 */

import org.ck.clientui.beans.ProductBean;
import org.ck.clientui.proxy.MicroServiceProduitsProxy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClientController {

    private final MicroServiceProduitsProxy produitsProxy;

    public ClientController(MicroServiceProduitsProxy produitsProxy){
        this.produitsProxy = produitsProxy;
    }

    @RequestMapping("/")
    public String accueil(Model model) {

        List<ProductBean> produits =  produitsProxy.listeDesProduits();
        model.addAttribute("produits", produits);
        return "Accueil";
    }

    @RequestMapping("/details-produit/{id}")
    public String ficheProduit(@PathVariable int id, Model model){
        ProductBean produit = produitsProxy.recupererUnProduit(id);
        model.addAttribute("produit", produit);
        return "FicheProduit";
    }
}