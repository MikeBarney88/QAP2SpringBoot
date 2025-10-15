package com.recipe;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    public Recipe findByName(String name);

    public Recipe findByServings(int servings);
}