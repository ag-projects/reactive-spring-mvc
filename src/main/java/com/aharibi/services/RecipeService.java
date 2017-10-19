package com.aharibi.services;

import com.aharibi.commands.RecipeCommand;
import com.aharibi.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(String id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(String aLong);

    void deleteById(String id);
}
