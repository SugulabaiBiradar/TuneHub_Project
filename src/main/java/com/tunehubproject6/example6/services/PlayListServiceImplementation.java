package com.tunehubproject6.example6.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunehubproject6.example6.entities.PlayList;
import com.tunehubproject6.example6.repositories.PlayListRepository;

@Service
public class PlayListServiceImplementation implements PlayListService
{

	@Autowired
	PlayListRepository repo;
	
	@Override
	public void addPlayList(PlayList playlist) 
	{
		repo.save(playlist);	
	}

	@Override
	public List<PlayList> fetchAllPlayLists()
	{
		return repo.findAll();
	}
}
