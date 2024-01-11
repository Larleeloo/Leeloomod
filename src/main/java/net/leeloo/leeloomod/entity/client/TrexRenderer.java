package net.leeloo.leeloomod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.leeloo.leeloomod.LeelooMod;
import net.leeloo.leeloomod.entity.custom.TrexEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class TrexRenderer extends MobRenderer<TrexEntity, TrexModel<TrexEntity>> {
    public TrexRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new TrexModel<>(pContext.bakeLayer(ModModelLayers.TREX_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(TrexEntity pEntity) {
        return new ResourceLocation(LeelooMod.MOD_ID, "textures/entity/trex_texture.png");
    }

    @Override
    public void render(TrexEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
