package net.leeloo.leeloomod.recipe;

import net.leeloo.leeloomod.LeelooMod;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, LeelooMod.MOD_ID);

    public static final RegistryObject<RecipeSerializer<GemPolishingRecipe>> GEM_POLISHING_SERIALIZER =
            SERIALIZERS.register("gem_polishing", () -> GemPolishingRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<MauviniteRefiningRecipe>> MAUVINITE_REFINING_SERIALIZER =
            SERIALIZERS.register("mauvinite_refining", () -> MauviniteRefiningRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
