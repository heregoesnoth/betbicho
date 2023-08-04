package br.com.ada.betbicho.repository;

import br.com.ada.betbicho.entity.Bicho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BichoRepository extends JpaRepository<Bicho, Long> {

    Optional<Bicho> getBichoByNome(String nome);
    Optional<Bicho> getByNome(String nome);
    Optional<Bicho> findByNome(String nome);
    Optional<Bicho> findBichoByNome(String nome);

}
