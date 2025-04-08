package com.springboot.apihw.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/get")
public class GetController {
    @GetMapping("/movie")
    public String getName(){
        return "타이타닉";
    }

    @GetMapping("/member/{movie}/{genre}/{director}")
    public String findByEmail(@PathVariable("movie") String movie, @PathVariable("genre") String genre,
                              @PathVariable("director") String director ) {
        return "movie: " +movie+ ", genre: " + genre+", director: " + director;
    }

    @GetMapping("/member/{cast}/{runtime}")
    public String findByEmail(@PathVariable("cast") String cast, @PathVariable("runtime") String runtime) {
        return "cast: " +cast+ ", runtime: " + runtime;
    }


}
