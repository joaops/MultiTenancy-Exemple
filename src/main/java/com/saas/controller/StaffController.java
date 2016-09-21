package com.saas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.saas.login.Login;
import com.saas.po.Staff;
import com.saas.service.StaffService;

/**
 * Camada de controle
 * @author zhao
 */
@Controller
public class StaffController {
    
    /**
     * A lógica de negócios
     */
    @Autowired
    private StaffService service;
    
    /**
     * Consulta de informações do usuário
     * @param model
     * @return
     */
    @RequestMapping(value="/stafflist.do")
    public String list(Model model) {
        Login.setTenantId("tenant_2");
        List<Staff> staff1 = null;
        
        try {
            staff1 = service.getAllStaff();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
	}
        
        model.addAttribute("list", staff1);
        
        //Login.setTenantId("tenant_2");
        //List<Staff> staff2 = null;
        //Staff staff = null;
        //try {
            //staff = service.getStaff(1);
        //} catch (Exception e) {
            //TODO Auto-generated catch block
            //e.printStackTrace();
        //}
        //staff2.addAll(staff1);
        //model.addAttribute("list", staff);
        return "staff_list";
    }
    
}