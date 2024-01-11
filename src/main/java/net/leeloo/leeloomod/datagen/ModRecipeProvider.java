package net.leeloo.leeloomod.datagen;

import net.leeloo.leeloomod.LeelooMod;
import net.leeloo.leeloomod.block.ModBlocks;
import net.leeloo.leeloomod.item.ModItems;
import net.leeloo.leeloomod.util.ModTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> SAPPHIRE_SMELTABLES = List.of(ModItems.RAW_SAPPHIRE.get(),
            ModBlocks.SAPPHIRE_ORE.get(), ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModBlocks.NETHER_SAPPHIRE_ORE.get(),
            ModBlocks.END_STONE_SAPPHIRE_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAUVINITE_REFINER.get())
                .pattern("ICI")
                .pattern("IMI")
                .pattern("ICI")
                .define('I', Items.IRON_BLOCK)
                .define('C', Items.COPPER_BLOCK)
                .define('M', ModItems.MAUVINITE.get())
                .unlockedBy(getHasName(ModItems.MAUVINITE.get()), has(Items.IRON_BLOCK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MAUVINITE.get(), 1)
                .pattern("MMM")
                .pattern("MAM")
                .pattern("MMM")
                .define('M', ModItems.MAUVINITE_SHARD.get())
                .define('A', ModBlocks.AMBER_BLOCK.get())
                .unlockedBy(getHasName(ModItems.MAUVINITE_SHARD.get()), has(ModBlocks.AMBER_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.AMBER_BLOCK.get(), 1)
                .requires(ModItems.AMBER.get(), 9)
                .unlockedBy(getHasName(ModItems.AMBER.get()), has(ModItems.UNKNOWN_FOSSIL.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AMBER.get(), 9)
                .requires(ModBlocks.AMBER_BLOCK.get(), 1)
                .unlockedBy(getHasName(ModItems.AMBER.get()), has(ModItems.UNKNOWN_FOSSIL.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ENCAPSULATED_MAUVINITE.get())
                .pattern("GML")
                .pattern("MMM")
                .pattern("LMG")
                .define('L', ModBlocks.LAVA_SPONGE_BLOCK_FULL.get())
                .define('G', Items.GLASS)
                .define('M', ModItems.MAUVINITE.get())
                .unlockedBy(getHasName(ModItems.MAUVINITE.get()), has(Items.NETHERITE_BLOCK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MAUVINITE_SHARD.get())
                .pattern("MMM")
                .pattern("MAM")
                .pattern("MMM")
                .define('A', ModItems.AMBER.get())
                .define('M', ModItems.STRANGE_DEBRIS.get())
                .unlockedBy(getHasName(ModItems.STRANGE_DEBRIS.get()), has(ModItems.AMBER.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FAB_ACACIA.get(), 1)
                .requires(ModItems.BLOCK_FAB.get(), 1)
                .requires(Blocks.ACACIA_LOG, 1)
                .unlockedBy(getHasName(ModItems.BLOCK_FAB.get()), has(Blocks.ACACIA_LOG))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FAB_BIRCH.get(), 1)
                .requires(ModItems.BLOCK_FAB.get(), 1)
                .requires(Blocks.BIRCH_LOG,1)
                .unlockedBy(getHasName(ModItems.BLOCK_FAB.get()), has(Blocks.BIRCH_LOG))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FAB_CHERRY.get(), 1)
                .requires(ModItems.BLOCK_FAB.get(), 1)
                .requires(Blocks.CHERRY_LOG,1)
                .unlockedBy(getHasName(ModItems.BLOCK_FAB.get()), has(Blocks.CHERRY_LOG))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FAB_CRIMSON.get(), 1)
                .requires(ModItems.BLOCK_FAB.get(), 1)
                .requires(Blocks.CRIMSON_STEM,1)
                .unlockedBy(getHasName(ModItems.BLOCK_FAB.get()), has(Blocks.CRIMSON_STEM))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FAB_DARK_OAK.get(), 1)
                .requires(ModItems.BLOCK_FAB.get(), 1)
                .requires(Blocks.DARK_OAK_LOG,1)
                .unlockedBy(getHasName(ModItems.BLOCK_FAB.get()), has(Blocks.DARK_OAK_LOG))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FAB_JUNGLE.get(), 1)
                .requires(ModItems.BLOCK_FAB.get(), 1)
                .requires(Blocks.JUNGLE_LOG,1)
                .unlockedBy(getHasName(ModItems.BLOCK_FAB.get()), has(Blocks.JUNGLE_LOG))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FAB_MANGROVE.get(), 1)
                .requires(ModItems.BLOCK_FAB.get(), 1)
                .requires(Blocks.MANGROVE_LOG,1)
                .unlockedBy(getHasName(ModItems.BLOCK_FAB.get()), has(Blocks.MANGROVE_LOG))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FAB_OAK.get(), 1)
                .requires(ModItems.BLOCK_FAB.get(), 1)
                .requires(Blocks.OAK_LOG,1)
                .unlockedBy(getHasName(ModItems.BLOCK_FAB.get()), has(Blocks.OAK_LOG))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FAB_SPRUCE.get(), 1)
                .requires(ModItems.BLOCK_FAB.get(), 1)
                .requires(Blocks.SPRUCE_LOG,1)
                .unlockedBy(getHasName(ModItems.BLOCK_FAB.get()), has(Blocks.SPRUCE_LOG))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FAB_WARPED.get(), 1)
                .requires(ModItems.BLOCK_FAB.get(), 1)
                .requires(Blocks.WARPED_STEM,1)
                .unlockedBy(getHasName(ModItems.BLOCK_FAB.get()), has(Blocks.WARPED_STEM))
                .save(pWriter);


        SmithingTransformRecipeBuilder.smithing
                        (Ingredient.of(ModBlocks.ENCAPSULATED_MAUVINITE.get()),
                                Ingredient.of(Items.NETHERITE_HELMET),
                                Ingredient.of(ModItems.MAUVINITE.get()),
                                RecipeCategory.MISC,
                                ModItems.MAUVINITE_HELMET.get())
                .unlocks(getHasName(ModItems.MAUVINITE_HELMET.get()), has(ModTags.Items.MAUVINITE_ARMOR_TAG))
                        .save(pWriter,"mauvinite_helmet_from_smithing_table");

        SmithingTransformRecipeBuilder.smithing
                        (Ingredient.of(ModBlocks.ENCAPSULATED_MAUVINITE.get()),
                                Ingredient.of(Items.NETHERITE_CHESTPLATE),
                                Ingredient.of(ModItems.MAUVINITE.get()),
                                RecipeCategory.MISC,
                                ModItems.MAUVINITE_CHESTPLATE.get())
                .unlocks(getHasName(ModItems.MAUVINITE_CHESTPLATE.get()), has(ModTags.Items.MAUVINITE_ARMOR_TAG))
                .save(pWriter,"mauvinite_chestplate_from_smithing_table");

        SmithingTransformRecipeBuilder.smithing
                        (Ingredient.of(ModBlocks.ENCAPSULATED_MAUVINITE.get()),
                                Ingredient.of(Items.NETHERITE_LEGGINGS),
                                Ingredient.of(ModItems.MAUVINITE.get()),
                                RecipeCategory.MISC,
                                ModItems.MAUVINITE_LEGGINGS.get())
                .unlocks(getHasName(ModItems.MAUVINITE_LEGGINGS.get()), has(ModTags.Items.MAUVINITE_ARMOR_TAG))
                .save(pWriter,"mauvinite_leggings_from_smithing_table");

        SmithingTransformRecipeBuilder.smithing
                        (Ingredient.of(ModBlocks.ENCAPSULATED_MAUVINITE.get()),
                                Ingredient.of(Items.NETHERITE_BOOTS),
                                Ingredient.of(ModItems.MAUVINITE.get()),
                                RecipeCategory.MISC,
                                ModItems.MAUVINITE_BOOTS.get())
                .unlocks(getHasName(ModItems.MAUVINITE_BOOTS.get()), has(ModTags.Items.MAUVINITE_ARMOR_TAG))
                .save(pWriter,"mauvinite_boots_from_smithing_table");

        SmithingTransformRecipeBuilder.smithing
                        (Ingredient.of(ModBlocks.ENCAPSULATED_MAUVINITE.get()),
                                Ingredient.of(Items.NETHERITE_PICKAXE),
                                Ingredient.of(ModItems.MAUVINITE.get()),
                                RecipeCategory.MISC,
                                ModItems.MAUVINITE_PICKAXE.get())
                .unlocks(getHasName(ModItems.MAUVINITE_PICKAXE.get()), has(ModTags.Items.MAUVINITE_ITEM_TAG))
                .save(pWriter,"mauvinite_pickaxe_from_smithing_table");

        SmithingTransformRecipeBuilder.smithing
                        (Ingredient.of(ModBlocks.ENCAPSULATED_MAUVINITE.get()),
                                Ingredient.of(Items.NETHERITE_SWORD),
                                Ingredient.of(ModItems.MAUVINITE.get()),
                                RecipeCategory.MISC,
                                ModItems.MAUVINITE_SWORD.get())
                .unlocks(getHasName(ModItems.MAUVINITE_SWORD.get()), has(ModTags.Items.MAUVINITE_ITEM_TAG))
                .save(pWriter,"mauvinite_sword_from_smithing_table");

        /*********************/

        oreSmelting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f, 200, "sapphire");
        oreBlasting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f, 100, "sapphire");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 9)
                .requires(ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  LeelooMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
