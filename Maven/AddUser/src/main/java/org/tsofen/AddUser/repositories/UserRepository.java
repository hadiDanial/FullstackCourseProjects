package org.tsofen.AddUser.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.tsofen.AddUser.beans.User;

public interface UserRepository extends CrudRepository<User, Integer>
{
	public User findByName(String name);
	public User findByEmail(String email);
	
}
