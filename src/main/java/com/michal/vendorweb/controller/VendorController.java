package com.michal.vendorweb.controller;

import com.michal.vendorweb.entities.Vendor;
import com.michal.vendorweb.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class VendorController {
    @Autowired
    VendorService vendorService;


    @RequestMapping("showCreate")
    public String showCreate(){
        return "createVendor";
    }

    @RequestMapping("/saveVendor")
    public String createVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap){
        Vendor vendorSaved = vendorService.saveVendor(vendor);
        String msg = "Vendor saved with id: " + vendorSaved.getId();
        modelMap.addAttribute("msg", msg);
        return "createVendor";
    }

    @RequestMapping("showVendors")
    public String showVendors(ModelMap modelMap){
          List<Vendor> vendorList = vendorService.getAllVendors();
          modelMap.addAttribute("vendorList", vendorList);
          return "showVendors";
    }

    @RequestMapping("deleteVendor")
    public String deleteVendor(@RequestParam int id, ModelMap modelMap){
        vendorService.deleteVendor(id);
        return showVendors(modelMap);
    }

    @RequestMapping("showUpdate")
    public String showUpdate(@RequestParam int id, ModelMap map){
        Vendor vendor = vendorService.getVendorById(id);
        map.addAttribute("vendor", vendor);
        return "updateVendor";
    }

    @RequestMapping("updateVendor")
    public String updateVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap){
        vendorService.updateVendor(vendor);
        return showVendors(modelMap);
    }

}
