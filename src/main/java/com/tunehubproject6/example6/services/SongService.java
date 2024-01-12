package com.tunehubproject6.example6.services;

import java.util.List;

import com.tunehubproject6.example6.entities.Song;

public interface SongService 
{
	public void addSong(Song song);
	public List<Song> fetchAllSongs();
	public boolean songExists(String name);
	public void updateSong(Song song);
}
