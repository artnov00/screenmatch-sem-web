package br.com.alura.screematch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias({"Title", "Titulo"}) String title,
                         @JsonAlias("imdbRating") String imdbRating,
                         @JsonAlias("totalSeasons") Integer totalSeasons) {
}
