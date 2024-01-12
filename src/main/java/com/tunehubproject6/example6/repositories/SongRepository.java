package com.tunehubproject6.example6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunehubproject6.example6.entities.Song;

public interface SongRepository extends JpaRepository<Song, Integer>
{
	public Song findByName(String name);
}
