package idv.carl.recipe.controllers;

import idv.carl.recipe.domain.Category;
import idv.carl.recipe.domain.UnitOfMeasure;
import idv.carl.recipe.repositories.CategoryRepository;
import idv.carl.recipe.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * @author Carl Lu
 */
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat id is: " + categoryOptional.get().getId());
        System.out.println("Unit of measure id is: " + unitOfMeasure.get().getId());

        return "index";
    }

}
