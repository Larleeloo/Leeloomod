package net.leeloo.leeloomod.event;

import net.leeloo.leeloomod.LeelooMod;
import net.leeloo.leeloomod.entity.ModEntities;
import net.leeloo.leeloomod.entity.custom.RhinoEntity;
import net.leeloo.leeloomod.entity.custom.TrexEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = LeelooMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.RHINO.get(), RhinoEntity.createAttributes().build());
        event.put(ModEntities.TREX.get(), TrexEntity.createAttributes().build());
    }
}
