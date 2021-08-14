package org.tsofen.AddUser.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tsofen.AddUser.beans.Role;
import org.tsofen.AddUser.beans.User;
import org.tsofen.AddUser.bl.UserBL;

@RestController
@RequestMapping("User")
public class UserController
{
	@Autowired
	UserBL userBL;
	

	@GetMapping("addUser")
	public String addUser(String name, String email, int phone, String password, boolean active, String productGroups, String role)
	{
		Role r = Role.getRoleByName(role);
		User user = new User(name, email, phone, password, active, productGroups, r);
		return userBL.updateUser(user);
	}
}
