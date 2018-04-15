package idv.carl.recipe.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Carl Lu
 */
@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

    public Notes() {
    }

    public boolean canEqual(Object other) {
        return other instanceof Notes;
    }

}
