package net.leeloo.leeloomod.util;

import net.minecraft.world.item.crafting.Ingredient;

import java.util.stream.Stream;

public class ModIngredients {
    private final Ingredient.Value[] values;
    public ModIngredients(Stream<? extends Ingredient.Value> pValues) {
        this.values = pValues.toArray((p_43933_) -> {
            return new Ingredient.Value[p_43933_];
        });


    }
}
