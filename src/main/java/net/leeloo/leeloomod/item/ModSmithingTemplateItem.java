package net.leeloo.leeloomod.item;

import net.leeloo.leeloomod.LeelooMod;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.SmithingTemplateItem;

import java.util.List;

public class ModSmithingTemplateItem extends SmithingTemplateItem {

    private static final ResourceLocation EMPTY_SLOT_HELMET = new ResourceLocation("item/empty_armor_slot_helmet");
    private static final ResourceLocation EMPTY_SLOT_CHESTPLATE = new ResourceLocation("item/empty_armor_slot_chestplate");
    private static final ResourceLocation EMPTY_SLOT_LEGGINGS = new ResourceLocation("item/empty_armor_slot_leggings");
    private static final ResourceLocation EMPTY_SLOT_BOOTS = new ResourceLocation("item/empty_armor_slot_boots");
    private static final ResourceLocation EMPTY_SLOT_HOE = new ResourceLocation("item/empty_slot_hoe");
    private static final ResourceLocation EMPTY_SLOT_AXE = new ResourceLocation("item/empty_slot_axe");
    private static final ResourceLocation EMPTY_SLOT_SWORD = new ResourceLocation("item/empty_slot_sword");
    private static final ResourceLocation EMPTY_SLOT_SHOVEL = new ResourceLocation("item/empty_slot_shovel");
    private static final ResourceLocation EMPTY_SLOT_PICKAXE = new ResourceLocation("item/empty_slot_pickaxe");
    private static final ResourceLocation EMPTY_SLOT_INGOT = new ResourceLocation("item/empty_slot_ingot");

    public ModSmithingTemplateItem(Component p_266834_, Component p_267043_, Component p_267048_, Component p_267278_, Component p_267090_, List<ResourceLocation> p_266755_, List<ResourceLocation> p_267060_) {
        super(p_266834_, p_267043_, p_267048_, p_267278_, p_267090_, p_266755_, p_267060_);
    }

    public static ModSmithingTemplateItem createAnimusUpgradeTemplate() {
        return new ModSmithingTemplateItem(
                Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(LeelooMod.MOD_ID,"smithing_template.animus_upgrade.applies_to"))).withStyle(ChatFormatting.BLUE),
                Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(LeelooMod.MOD_ID,"smithing_template.netherite_upgrade.ingredients"))).withStyle(ChatFormatting.BLUE),
                Component.translatable(Util.makeDescriptionId("upgrade", new ResourceLocation(LeelooMod.MOD_ID,"animus_upgrade"))).withStyle(ChatFormatting.GRAY),
                Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(LeelooMod.MOD_ID,"smithing_template.animus.base_slot_description"))),
                Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(LeelooMod.MOD_ID, "smithing_template.animus_upgrade.additions_slot_description"))),
                List.of(EMPTY_SLOT_HELMET, EMPTY_SLOT_SWORD, EMPTY_SLOT_CHESTPLATE, EMPTY_SLOT_PICKAXE, EMPTY_SLOT_LEGGINGS, EMPTY_SLOT_AXE, EMPTY_SLOT_BOOTS, EMPTY_SLOT_HOE, EMPTY_SLOT_SHOVEL),
                List.of(EMPTY_SLOT_INGOT)
        );
    }
}
