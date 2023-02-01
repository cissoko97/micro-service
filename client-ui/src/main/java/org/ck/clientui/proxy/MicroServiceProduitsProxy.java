package org.ck.clientui.proxy;

/*
 * @author Boris Cissoko
 * @project microservice-commandes
 * @created 25/01/2023 - /20:13
 */


import org.ck.clientui.beans.ProductBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "microservice-produits", url = "localhost:9001")
public interface MicroServiceProduitsProxy {
    @GetMapping(value = "/Produits")
    List<ProductBean> listeDesProduits();

    @GetMapping(value = "/Produits/{id}")
    ProductBean recupererUnProduit(@PathVariable("id") int id);
}