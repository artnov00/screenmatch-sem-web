package br.com.alura.screematch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe); // "<T> T" Uma classe de um determinado formato vai transformar o json em uma determindada classe.
}
