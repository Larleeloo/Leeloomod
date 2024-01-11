package net.leeloo.leeloomod.item;

import net.leeloo.leeloomod.LeelooMod;
import net.leeloo.leeloomod.block.ModBlocks;
import net.leeloo.leeloomod.entity.ModEntities;
import net.leeloo.leeloomod.entity.custom.ModBoatEntity;
import net.leeloo.leeloomod.item.custom.*;
import net.leeloo.leeloomod.sound.ModSounds;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LeelooMod.MOD_ID);

    public static final RegistryObject<Item> FAB_OAK = ITEMS.register("fab_oak",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLOCK_FAB = ITEMS.register("block_fab",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FAB_ACACIA = ITEMS.register("fab_acacia",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FAB_BIRCH = ITEMS.register("fab_birch",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FAB_CHERRY = ITEMS.register("fab_cherry",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FAB_CRIMSON = ITEMS.register("fab_crimson",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FAB_DARK_OAK = ITEMS.register("fab_dark_oak",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FAB_JUNGLE = ITEMS.register("fab_jungle",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FAB_MANGROVE = ITEMS.register("fab_mangrove",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FAB_SPRUCE = ITEMS.register("fab_spruce",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FAB_WARPED = ITEMS.register("fab_warped",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STRANGE_DEBRIS = ITEMS.register("strange_debris",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAUVINITE = ITEMS.register("mauvinite",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAUVINITE_HELMET = ITEMS.register("mauvinite_helmet",
            () -> new ModArmorItem(ModArmorMaterials.MAUVINITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MAUVINITE_CHESTPLATE = ITEMS.register("mauvinite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MAUVINITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> MAUVINITE_LEGGINGS = ITEMS.register("mauvinite_leggings",
            () -> new ArmorItem(ModArmorMaterials.MAUVINITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> MAUVINITE_BOOTS = ITEMS.register("mauvinite_boots",
            () -> new ArmorItem(ModArmorMaterials.MAUVINITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> MAUVINITE_PICKAXE = ITEMS.register("mauvinite_pickaxe",
            ()-> new PickaxeItem(ModToolTiers.MAUVINITE,1,1,new Item.Properties()));
    public static final RegistryObject<Item> MAUVINITE_SHARD = ITEMS.register("mauvinite_shard",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MAUVINITE_SWORD = ITEMS.register("mauvinite_sword",
            ()-> new SwordItem(ModToolTiers.MAUVINITE,5,2,new Item.Properties()));


/*    public static final RegistryObject<Item> MAUVINITE_SHOVEL = ITEMS.register("mauvinite_shovel",
            ()-> new ShovelItem(ModToolTiers.MAUVINITE,1,1,new Item.Properties()));

    public static final RegistryObject<Item> MAUVINITE_AXE = ITEMS.register("mauvinite_axe",
            ()-> new AxeItem(ModToolTiers.MAUVINITE,6,1,new Item.Properties()));*/

    public static final RegistryObject<Item> MYSTERIOUS_FOSSIL = ITEMS.register("mysterious_fossil",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNKNOWN_FOSSIL = ITEMS.register("unknown_fossil",
            ()-> new Item(new Item.Properties()));



    /**************************************************/

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));

    public static final RegistryObject<Item> SAPPHIRE_STAFF = ITEMS.register("sapphire_staff",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
            () -> new FuelItem(new Item.Properties(), 400));


    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(ModToolTiers.SAPPHIRE, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> STRAWBERRY_SEEDS = ITEMS.register("strawberry_seeds",
            () -> new ItemNameBlockItem(ModBlocks.STRAWBERRY_CROP.get(), new Item.Properties()));

    public static final RegistryObject<Item> CORN_SEEDS = ITEMS.register("corn_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CORN_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> CORN = ITEMS.register("corn",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BAR_BRAWL_MUSIC_DISC = ITEMS.register("bar_brawl_music_disc",
            () -> new RecordItem(6, ModSounds.BAR_BRAWL, new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> RHINO_SPANW_EGG = ITEMS.register("rhino_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.RHINO, 0x7e9680, 0xc5d1c5, new Item.Properties()));

    public static final RegistryObject<Item> PINE_SIGN = ITEMS.register("pine_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.PINE_SIGN.get(), ModBlocks.PINE_WALL_SIGN.get()));
    public static final RegistryObject<Item> PINE_HANGING_SIGN = ITEMS.register("pine_hanging_sign",
            () -> new HangingSignItem(ModBlocks.PINE_HANGING_SIGN.get(), ModBlocks.PINE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> PINE_BOAT = ITEMS.register("pine_boat",
            () -> new ModBoatItem(false, ModBoatEntity.Type.PINE, new Item.Properties()));
    public static final RegistryObject<Item> PINE_CHEST_BOAT = ITEMS.register("pine_chest_boat",
            () -> new ModBoatItem(true, ModBoatEntity.Type.PINE, new Item.Properties()));

    public static final RegistryObject<Item> DICE = ITEMS.register("dice",
            () -> new DiceItem(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
