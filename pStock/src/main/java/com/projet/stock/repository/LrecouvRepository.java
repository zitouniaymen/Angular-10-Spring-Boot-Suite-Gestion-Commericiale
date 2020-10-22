package com.projet.stock.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projet.stock.model.Lrecouv;
@Repository
public interface LrecouvRepository extends JpaRepository<Lrecouv, Long>{
	Iterable<Lrecouv> findAllByNumero(int numero);
}
