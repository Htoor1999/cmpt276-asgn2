package cmpt276.asgn2.controllers;

import java.util.List;
import java.util.ArrayList;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import cmpt276.asgn2.models.Users;

@Controller
public class UsersController {
    @GetMapping("/users/view")
   
    public String getAllUsers(Model model){
        System.out.println("Getting all users");
       //get all users from database
        List<Users> users = new ArrayList<>();
        users.add(new Users("bobby",3001));
        users.add(new Users("john",3002));
        //end of database call

        model.addAttribute("us", users);
        return "users/showAll";
    }
}
