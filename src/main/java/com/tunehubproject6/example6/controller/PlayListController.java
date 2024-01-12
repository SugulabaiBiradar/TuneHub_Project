package com.tunehubproject6.example6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.tunehubproject6.example6.entities.PlayList;
import com.tunehubproject6.example6.entities.Song;
import com.tunehubproject6.example6.services.PlayListService;
import com.tunehubproject6.example6.services.SongService;

@Controller
public class PlayListController  
{
	@Autowired
	SongService songService;
	
	@Autowired
	PlayListService playListService;
	
	@GetMapping("/createPlayList")
	public String createPlayList(Model model)
	{
		List<Song> songList=songService.fetchAllSongs();
		model.addAttribute("songs", songList);
		return "createPlayList";
	}
	
	@PostMapping("/addPlayList")
	public String addPlayList(@ModelAttribute PlayList playlist)
	{
		//update play list table
		playListService.addPlayList(playlist);
		
		//update song table
		List<Song> songList=playlist.getSongs();
		
		for(Song s : songList)
		{
			s.getPlaylists().add(playlist);
			
			//update song object in database
			songService.updateSong(s);
		}
		return "adminHome";
	}
	
	@GetMapping("/viewPlayLists")
	public String viewPlayLists(Model model)
	{
		List<PlayList> allPlayLists=playListService.fetchAllPlayLists();
		model.addAttribute("allPlayLists", allPlayLists);
		return "displayPlayLists";
	}
}
