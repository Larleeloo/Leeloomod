package net.leeloo.leeloomod.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.leeloo.leeloomod.LeelooMod;
import net.leeloo.leeloomod.recipe.GemPolishingRecipe;
import net.leeloo.leeloomod.recipe.MauviniteRefiningRecipe;
import net.leeloo.leeloomod.screen.GemPolishingStationScreen;
import net.leeloo.leeloomod.screen.MauviniteRefiningScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;

@JeiPlugin
public class JEITutorialModPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(LeelooMod.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new GemPolishingCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<GemPolishingRecipe> polishingRecipes = recipeManager.getAllRecipesFor(GemPolishingRecipe.Type.INSTANCE);
        registration.addRecipes(GemPolishingCategory.GEM_POLISHING_TYPE, polishingRecipes);

        List<MauviniteRefiningRecipe> refiningRecipes = recipeManager.getAllRecipesFor(MauviniteRefiningRecipe.Type.INSTANCE);
        registration.addRecipes(MauviniteRefiningCategory.MAUVINITE_REFINING_TYPE, refiningRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(GemPolishingStationScreen.class, 60, 30, 20, 30,
                GemPolishingCategory.GEM_POLISHING_TYPE);

        registration.addRecipeClickArea(MauviniteRefiningScreen.class, 60, 30, 20, 30,
                MauviniteRefiningCategory.MAUVINITE_REFINING_TYPE);
    }
}
