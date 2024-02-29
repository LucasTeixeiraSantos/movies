package br.com.lucasts.screenmatch;

import br.com.lucasts.screenmatch.model.DadosEpisodio;
import br.com.lucasts.screenmatch.model.DadosSerie;
import br.com.lucasts.screenmatch.model.DadosTemporada;
import br.com.lucasts.screenmatch.principal.Principal;
import br.com.lucasts.screenmatch.repository.SerieRepository;
import br.com.lucasts.screenmatch.service.ConsumoApi;
import br.com.lucasts.screenmatch.service.ConverteDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

    @Autowired
    private SerieRepository repositorio;

    public static void main(String[] args) {
        SpringApplication.run(ScreenmatchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal(repositorio);
        principal.exibeMenu();
    }
}