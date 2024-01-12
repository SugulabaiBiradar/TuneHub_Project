package com.tunehubproject6.example6.services;

import java.util.List;

import com.tunehubproject6.example6.entities.PlayList;

public interface PlayListService
{
	public void addPlayList(PlayList playlist);
	public List<PlayList> fetchAllPlayLists();
}
