package com.wunanyu.cloud.note.data.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //刷新git
@RequestMapping("ndata")
public class NoteDataController {

	@Value("${from}")
	private String from;
	@Value("${note.data}")
	private String noteData;

	@GetMapping("/from")
	public String getfrom() {
		return from;
	}
	
	@GetMapping("/d")
	public String getNotedata() {
		return noteData;
	}
}
