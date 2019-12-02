package com.hwua.controller;

import com.hwua.pojo.Product;
import com.hwua.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.UUID;

@Controller
public class ProductController {
    @Autowired
    private ProductServiceImpl productService;
    @RequestMapping("/findAllProduct")
    public ModelAndView findAllProduct()throws Exception{
        ModelAndView view = new ModelAndView("/pages/product-list");
        List<Product> products = productService.findall();
        view.addObject("productList", products);
        return view;
    }
    @RequestMapping("/addProduct")
    public ModelAndView addProduct(Product product)throws Exception{
        ModelAndView view = new ModelAndView("redirect:/findAllProduct");
        String id =String.valueOf(UUID.randomUUID()) ;
        product.setId(id);
        productService.addProduct(product);
        return view;
    }
    @RequestMapping("/delProduct/{id}")
    public ModelAndView delProduct(@PathVariable("id")String id)throws Exception{
        ModelAndView view = new ModelAndView("redirect:/findAllProduct");
        productService.delProduct(id);
        return view;
    }
}
