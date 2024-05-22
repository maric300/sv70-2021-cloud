package com.example.sv702021cloudkolokvijum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    @Autowired
    private IFilmRepository filmRepository;

    public Film createFilm(Film film) {
        return filmRepository.save(film);
    }

    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }
}