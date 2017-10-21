package com.aharibi.services;

import com.aharibi.commands.RecipeCommand;
import com.aharibi.domain.Recipe;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RecipeService {

    Flux<Recipe> getRecipes();

    Mono<Recipe> findById(String id);

    Mono<RecipeCommand> saveRecipeCommand(RecipeCommand command);

    Mono<RecipeCommand> findCommandById(String aLong);

    Mono<Void> deleteById(String id);
}
