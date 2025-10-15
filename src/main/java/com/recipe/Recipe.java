package com.recipe;

import jakarta.persistence.*;

@Entity
public class Recipe {
    @Id
    @SequenceGenerator(name = "recipe_sequence", sequenceName = "recipe_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "recipe_sequence")
    private long id;

    private String name;
    private String ingredients;
    private String instructions;
    private int prepTime;
    private int servings;

    public Recipe() {

    }

    public Recipe(long id) {
        this.id = id;
    }

    public Recipe(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }
}
