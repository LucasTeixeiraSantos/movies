package br.com.lucasts.screenmatch.repository;

import br.com.lucasts.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
}
