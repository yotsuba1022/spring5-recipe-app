package idv.carl.recipe.services;

import idv.carl.recipe.domain.Recipe;

import java.util.Set;

/**
 * @author Carl Lu
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

}
