package org.tsofen.AddUser.bl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tsofen.AddUser.beans.User;
import org.tsofen.AddUser.repositories.UserRepository;

@Service
public class UserBL
{
	@Autowired
	UserRepository userRepo;
	
	public String updateUser(User user)
	{
		String returnString = ""; 
		User userToFind = userRepo.findByEmail(user.getEmail());
		if(userToFind == null)
		{
			addUser(user);
			returnString = "Added new user:<br>" + user.toString();
		}
		else
		{
			returnString = "Updated user:<br>" + userToFind.toString() + "<br>To:<br>" + user.toString();
			userToFind.updateUser(user);
			userRepo.save(userToFind);
		}
		return returnString;
	}
	
	public void addUser(User user)
	{
		userRepo.save(user);
	}
}
