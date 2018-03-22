package idv.carl.recipe.repositories;

import idv.carl.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Carl Lu
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
