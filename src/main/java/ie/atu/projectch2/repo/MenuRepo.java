package ie.atu.projectch2.repo;

import ie.atu.projectch2.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MenuRepo extends JpaRepository<Menu, Long> {
    Optional<Menu> findById(Long id);
}
