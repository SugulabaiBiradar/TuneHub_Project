package com.tunehubproject6.example6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunehubproject6.example6.entities.PlayList;

public interface PlayListRepository extends JpaRepository<PlayList, Integer> 
{

}
