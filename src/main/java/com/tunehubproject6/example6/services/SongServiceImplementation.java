package com.tunehubproject6.example6.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunehubproject6.example6.entities.Song;
import com.tunehubproject6.example6.repositories.SongRepository;

@Service
public class SongServiceImplementation implements SongService
{
	@Autowired
	SongRepository repo;

	@Override
	public void addSong(Song song) 
	{
		repo.save(song);
	}

	@Override
	public List<Song> fetchAllSongs() 
	{
		return repo.findAll();
	}

	@Override
	public boolean songExists(String name)
	{
		Song song=repo.findByName(name);
		if(song==null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	@Override
	public void updateSong(Song song)
	{
		repo.save(song);
	}
}
