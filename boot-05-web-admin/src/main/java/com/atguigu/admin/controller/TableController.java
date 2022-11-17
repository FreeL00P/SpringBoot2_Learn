package com.atguigu.admin.controller;

import com.atguigu.admin.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

/**
 * TableController
 *
 * @author fj
 * @date 2022/9/22 20:02
 */
@Controller
public class TableController {
    @GetMapping("/basic_table")
    public String basicTable(){
        return "table/basic_table";
    }
    @GetMapping("/dynamic_table")
    public String dynamicTable(Model model){
        List<User> users= Arrays.asList(new User("zhansgan","password",11,"男","12433@gmail.com"),
                new User("zhansgan","password",11,"男","12433@gmail.com"),
                new User("zhansgan","password",11,"男","12433@gmail.com"));
        model.addAttribute("users",users);
        return "table/dynamic_table";
    }
    @GetMapping("/editable_table")
    public String editableTable(){
        return "table/editable_table";
    }
    @GetMapping("/pricing_table")
    public String pricingTable(){
        return "table/pricing_table";
    }
    @GetMapping("/responsive_table")
    public String responsiveTable() {
        return "table/responsive_table";
    }
}
