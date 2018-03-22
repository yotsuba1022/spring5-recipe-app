package idv.carl.recipe.repositories;

import idv.carl.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Carl Lu
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
