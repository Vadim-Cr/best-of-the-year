package org.learning.greeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class MyGreetingController {


    @GetMapping("/")
    @ResponseBody
    public String greeting() {
        return "Ciao";
    }

    @GetMapping("home")
    public String home(Model model) {
        String yourName = "Vadim";
        model.addAttribute("yourName", yourName);
        return "home";
    }

    private List<String> getBestMovies() {
        List<String> movies = new ArrayList<>();
        movies.add("Terminator");
        movies.add("Matrix");
        movies.add("Lord Of The Rings");
        movies.add("Nausicaa of The Valey of the Wind");
        return movies;
    }

    //    NEW ADDRESS BEST MOVIES
    @GetMapping("my-movies")
    public String bestMovies(Model model) {
        model.addAttribute("bestMovies", String.join(", ", getBestMovies()));
        return "my-movies";
    }

    private List<String> getBestSongs() {

//        METODO ALTERNATIVO, FORSE PIU' BRREVE
        String[] songsArray = {"Mambo #5", "Inndia - by Inna", "In your Eyes - by Kylie Minogue", "Amaranth - by Nightwish"};
        return Arrays.asList(songsArray);

    }

    //    NEW ADDRESS BEST SONGS
    @GetMapping("my-songs")
    public String bestSongs(Model model) {
        model.addAttribute("bestSongs", String.join(", ", getBestSongs()));
        return "my-songs";
    }
}

