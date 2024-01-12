package com.tunehubproject6.example6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunehubproject6.example6.entities.Users;

public interface UsersRepository 
extends JpaRepository<Users, Integer>
{
	public Users findByEmail(String email);
}
