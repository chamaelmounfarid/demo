package repositories;

import entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface CompteRepository extends JpaRepository <Compte,Long> {
}
