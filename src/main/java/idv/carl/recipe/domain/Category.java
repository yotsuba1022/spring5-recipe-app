package idv.carl.recipe.domain;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

/**
 * @author Carl Lu
 */
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id) && Objects.equals(description, category.description) && Objects.equals(recipes,
                category.recipes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, recipes);
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", description='" + description + '\'' + ", recipes=" + recipes + '}';
    }

}
