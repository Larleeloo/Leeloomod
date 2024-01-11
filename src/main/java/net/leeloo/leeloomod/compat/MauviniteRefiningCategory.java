package net.leeloo.leeloomod.compat;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.leeloo.leeloomod.LeelooMod;
import net.leeloo.leeloomod.block.ModBlocks;
import net.leeloo.leeloomod.recipe.MauviniteRefiningRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class MauviniteRefiningCategory implements IRecipeCategory<MauviniteRefiningRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(LeelooMod.MOD_ID, "mauvinite_refining");
    public static final ResourceLocation TEXTURE = new ResourceLocation(LeelooMod.MOD_ID,
            "textures/gui/mauvinite_refining_gui.png");

    public static final RecipeType<MauviniteRefiningRecipe> MAUVINITE_REFINING_TYPE =
            new RecipeType<>(UID, MauviniteRefiningRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public MauviniteRefiningCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.MAUVINITE_REFINER.get()));
    }

    @Override
    public RecipeType<MauviniteRefiningRecipe> getRecipeType() {
        return MAUVINITE_REFINING_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("block.tutorialmod.mauvinite_refiner");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, MauviniteRefiningRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 80, 11).addIngredients(recipe.getIngredients().get(0));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 59).addItemStack(recipe.getResultItem(null));
    }
}
