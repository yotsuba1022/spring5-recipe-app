package idv.carl.recipe.domain;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/**
 * @author Carl Lu
 */
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;

    //private Difficulty difficulty;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredient> ingredients;

    @Lob
    private Byte[] image;

    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;

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

    public Integer getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(Integer prepTime) {
        this.prepTime = prepTime;
    }

    public Integer getCookTime() {
        return cookTime;
    }

    public void setCookTime(Integer cookTime) {
        this.cookTime = cookTime;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(id, recipe.id) && Objects.equals(description, recipe.description) && Objects.equals(prepTime,
                recipe.prepTime) && Objects.equals(cookTime, recipe.cookTime) && Objects.equals(servings, recipe.servings)
                && Objects.equals(source, recipe.source) && Objects.equals(url, recipe.url) && Objects.equals(directions,
                recipe.directions) && Objects.equals(ingredients, recipe.ingredients) && Arrays.equals(image, recipe.image)
                && Objects.equals(notes, recipe.notes);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(id, description, prepTime, cookTime, servings, source, url, directions, ingredients, notes);
        result = 31 * result + Arrays.hashCode(image);
        return result;
    }

    @Override
    public String toString() {
        return "Recipe{" + "id=" + id + ", description='" + description + '\'' + ", prepTime=" + prepTime + ", cookTime="
                + cookTime + ", servings=" + servings + ", source='" + source + '\'' + ", url='" + url + '\'' + ", directions='"
                + directions + '\'' + ", ingredients=" + ingredients + ", image=" + Arrays.toString(image) + ", notes=" + notes
                + '}';
    }

}
