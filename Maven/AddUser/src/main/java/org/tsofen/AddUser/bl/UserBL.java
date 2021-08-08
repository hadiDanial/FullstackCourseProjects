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
	
	public void updateUser(User user)
	{
		List<User> users = userRepo.findAllByName(user.getName());
		if(users.size() == 0)
		{
			addUser(user);
		}
		else if(users.size()==1)
		{
			User toUpdate = users.get(0);
			toUpdate.updateUser(user);
			userRepo.save(toUpdate);
		}
	}
	
	public void addUser(User user)
	{
		userRepo.save(user);
	}
}
