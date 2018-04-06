package idv.carl.recipe.repositories;

import idv.carl.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author Carl Lu
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);

}
