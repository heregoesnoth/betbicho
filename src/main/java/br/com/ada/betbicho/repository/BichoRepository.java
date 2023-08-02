package br.com.ada.betbicho.repository;

import br.com.ada.betbicho.entity.Bicho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BichoRepository extends JpaRepository<Bicho, Long> {
}
