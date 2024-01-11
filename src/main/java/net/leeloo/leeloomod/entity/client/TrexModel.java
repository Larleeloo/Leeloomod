package net.leeloo.leeloomod.entity.client;// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.leeloo.leeloomod.entity.animations.ModAnimationDefinitions;
import net.leeloo.leeloomod.entity.custom.TrexEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class TrexModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart trex;
	private final ModelPart head;

	public TrexModel(ModelPart root) {
		this.trex = root.getChild("trex");
		this.head = trex.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition trex = partdefinition.addOrReplaceChild("trex", CubeListBuilder.create(), PartPose.offset(0.0504F, 10.0F, -8.645F));

		PartDefinition head = trex.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_lower_teeth_r1 = head.addOrReplaceChild("left_lower_teeth_r1", CubeListBuilder.create().texOffs(0, 2).addBox(0.9688F, 0.875F, -5.8125F, 0.0F, 0.7813F, 4.2813F, new CubeDeformation(0.0F))
				.texOffs(22, 3).addBox(-1.0313F, 0.8438F, -5.8125F, 0.0F, 0.7188F, 4.2813F, new CubeDeformation(0.0F))
				.texOffs(14, 40).addBox(-1.0313F, 1.2813F, -5.8125F, 2.0F, 1.4063F, 4.2813F, new CubeDeformation(0.0F))
				.texOffs(16, 28).addBox(-2.0313F, -2.0F, -2.0F, 4.0F, 8.0625F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition center_upper_teeth_r1 = head.addOrReplaceChild("center_upper_teeth_r1", CubeListBuilder.create().texOffs(22, 18).addBox(-1.0313F, 1.9063F, -5.3438F, 2.0F, 0.5F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 3).addBox(0.9688F, 1.7188F, -5.3438F, 0.0F, 0.75F, 4.2813F, new CubeDeformation(0.0F))
				.texOffs(0, 10).addBox(-1.0313F, 1.5313F, -5.3438F, 0.0F, 0.9063F, 3.4688F, new CubeDeformation(0.0F))
				.texOffs(22, 41).addBox(-0.3125F, -1.0625F, -4.8438F, 0.5625F, 0.5938F, 3.7813F, new CubeDeformation(0.0F))
				.texOffs(22, 0).addBox(-2.1719F, -2.0F, -2.8125F, 4.2813F, 4.0F, 2.875F, new CubeDeformation(0.0F))
				.texOffs(28, 38).addBox(-1.0313F, -0.6563F, -5.3438F, 2.0F, 2.625F, 4.2813F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition body = trex.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.7656F, 1.7188F, 6.1767F, 7.4688F, 5.4063F, 7.9375F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition spine_main_r1 = body.addOrReplaceChild("spine_main_r1", CubeListBuilder.create().texOffs(0, 15).addBox(0.0F, -1.9688F, -11.6875F, 0.0F, 5.5938F, 10.0312F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0313F, 1.1436F, 14.2756F, -0.3927F, 0.0F, 0.0F));

		PartDefinition torso_r1 = body.addOrReplaceChild("torso_r1", CubeListBuilder.create().texOffs(0, 13).addBox(-3.8125F, -2.0F, 2.625F, 8.0F, 6.2813F, 6.125F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2188F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition left_leg = body.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(40, 38).addBox(-1.2891F, -2.1394F, 0.2377F, 2.4688F, 4.0F, 2.2813F, new CubeDeformation(0.0F))
				.texOffs(0, 15).addBox(0.0546F, 0.8808F, -2.7223F, 0.0F, 1.0F, 3.1563F, new CubeDeformation(0.0F))
				.texOffs(43, 27).addBox(-0.5079F, 0.8808F, -1.5973F, 1.0313F, 1.0F, 1.9375F, new CubeDeformation(0.0F)), PartPose.offset(2.7266F, 12.0456F, 9.2828F));

		PartDefinition left_outer_toenail_r1 = left_leg.addOrReplaceChild("left_outer_toenail_r1", CubeListBuilder.create().texOffs(43, 17).addBox(0.7656F, 2.1094F, -0.625F, 1.0313F, 1.0F, 1.9375F, new CubeDeformation(0.0F))
				.texOffs(0, 14).addBox(1.3281F, 2.1094F, -1.75F, 0.0F, 1.0F, 3.1563F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0548F, -1.2286F, -0.9723F, 0.0F, -0.3927F, 0.0F));

		PartDefinition left_center_toenail_r1 = left_leg.addOrReplaceChild("left_center_toenail_r1", CubeListBuilder.create().texOffs(22, 14).addBox(-1.2344F, 2.1094F, -1.75F, 0.0F, 1.0F, 3.1563F, new CubeDeformation(0.0F))
				.texOffs(0, 45).addBox(-1.7969F, 2.1094F, -0.625F, 1.0313F, 1.0F, 1.9375F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0548F, -1.2286F, -0.9723F, 0.0F, 0.3927F, 0.0F));

		PartDefinition left_knee_r1 = left_leg.addOrReplaceChild("left_knee_r1", CubeListBuilder.create().texOffs(36, 0).addBox(-2.0781F, 1.2969F, -5.2969F, 3.25F, 3.375F, 3.2188F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4765F, -6.5925F, 2.9408F, 0.3927F, 0.0F, 0.0F));

		PartDefinition left_thigh_r1 = left_leg.addOrReplaceChild("left_thigh_r1", CubeListBuilder.create().texOffs(0, 35).addBox(-2.2031F, -1.8906F, -2.7656F, 3.6563F, 6.625F, 3.2188F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4765F, -6.5925F, 2.9408F, -0.3927F, 0.0F, 0.0F));

		PartDefinition right_leg = body.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 0).addBox(-1.2891F, -2.1394F, 0.2377F, 2.4688F, 4.0F, 2.2813F, new CubeDeformation(0.0F))
				.texOffs(33, 0).addBox(-0.5079F, 0.8808F, -1.5973F, 1.0313F, 1.0F, 1.9375F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(0.0546F, 0.8808F, -2.7223F, 0.0F, 1.0F, 3.1563F, new CubeDeformation(0.0F)), PartPose.offset(-2.8046F, 12.0456F, 9.2828F));

		PartDefinition right_center_toenail_r1 = right_leg.addOrReplaceChild("right_center_toenail_r1", CubeListBuilder.create().texOffs(0, 11).addBox(1.3281F, 2.1094F, -1.75F, 0.0F, 1.0F, 3.1563F, new CubeDeformation(0.0F))
				.texOffs(28, 28).addBox(0.7656F, 2.1094F, -0.625F, 1.0313F, 1.0F, 1.9375F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0548F, -1.2286F, -0.9723F, 0.0F, -0.3927F, 0.0F));

		PartDefinition right_outer_toenail_r1 = right_leg.addOrReplaceChild("right_outer_toenail_r1", CubeListBuilder.create().texOffs(0, 13).addBox(-1.2344F, 2.1094F, -1.75F, 0.0F, 1.0F, 3.1563F, new CubeDeformation(0.0F))
				.texOffs(42, 10).addBox(-1.7969F, 2.1094F, -0.625F, 1.0313F, 1.0F, 1.9375F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0548F, -1.2286F, -0.9723F, 0.0F, 0.3927F, 0.0F));

		PartDefinition right_knee_r1 = right_leg.addOrReplaceChild("right_knee_r1", CubeListBuilder.create().texOffs(34, 17).addBox(-2.0781F, 1.2969F, -5.2969F, 3.25F, 3.375F, 3.2188F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4765F, -6.5925F, 2.9408F, 0.3927F, 0.0F, 0.0F));

		PartDefinition right_thigh_r1 = right_leg.addOrReplaceChild("right_thigh_r1", CubeListBuilder.create().texOffs(32, 28).addBox(-2.2031F, -1.8906F, -2.7656F, 3.6563F, 6.625F, 3.2188F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4765F, -6.5925F, 2.9408F, -0.3927F, 0.0F, 0.0F));

		PartDefinition left_arm = body.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_outside_claw_r1 = left_arm.addOrReplaceChild("left_outside_claw_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.375F, -0.1719F, -1.2031F, 0.0F, 0.4688F, 0.75F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.2188F, -0.1719F, -1.2031F, 0.0F, 0.4688F, 0.75F, new CubeDeformation(0.0F))
				.texOffs(5, 1).addBox(-0.3125F, -0.1719F, -0.4219F, 0.8125F, 0.4688F, 0.75F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4097F, 7.8985F, 1.5911F, 0.0F, 0.7854F, 0.0F));

		PartDefinition left_forearm_r1 = left_arm.addOrReplaceChild("left_forearm_r1", CubeListBuilder.create().texOffs(42, 23).addBox(-0.3906F, 0.5781F, -3.0156F, 0.8438F, 1.3125F, 2.9063F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7344F, 4.8115F, 2.917F, 0.7854F, 0.0F, 0.0F));

		PartDefinition left_arm_r1 = left_arm.addOrReplaceChild("left_arm_r1", CubeListBuilder.create().texOffs(44, 44).addBox(-0.5469F, -1.6406F, -0.8281F, 1.0938F, 3.5938F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7344F, 4.8115F, 2.917F, 0.3927F, 0.0F, 0.0F));

		PartDefinition right_arm = body.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_inside_claw_r1 = right_arm.addOrReplaceChild("right_inside_claw_r1", CubeListBuilder.create().texOffs(0, 0).addBox(1.2813F, -0.2344F, -0.8437F, 0.0F, 0.4688F, 0.75F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.4419F, 7.961F, 0.7404F, 0.0F, -0.3927F, 0.0F));

		PartDefinition right_outside_claw_r1 = right_arm.addOrReplaceChild("right_outside_claw_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.2344F, -0.375F, 0.0F, 0.4688F, 0.75F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5841F, 7.961F, 0.6071F, 0.0F, -0.3927F, 0.0F));

		PartDefinition right_hand_r1 = right_arm.addOrReplaceChild("right_hand_r1", CubeListBuilder.create().texOffs(5, 0).addBox(0.0625F, -0.2344F, -0.75F, 0.8125F, 0.4688F, 0.75F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0884F, 7.961F, 1.4917F, 0.0F, -0.3927F, 0.0F));

		PartDefinition right_forearm_r1 = right_arm.addOrReplaceChild("right_forearm_r1", CubeListBuilder.create().texOffs(42, 6).addBox(-0.3906F, 0.5781F, -3.0156F, 0.8438F, 1.3125F, 2.9063F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7969F, 4.8115F, 2.917F, 0.7854F, 0.0F, 0.0F));

		PartDefinition right_arm_r1 = right_arm.addOrReplaceChild("right_arm_r1", CubeListBuilder.create().texOffs(38, 44).addBox(-0.5469F, -1.6406F, -0.8281F, 1.0938F, 3.5938F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7969F, 4.8115F, 2.917F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition spine_middle_r1 = tail.addOrReplaceChild("spine_middle_r1", CubeListBuilder.create().texOffs(0, 25).addBox(1.625F, -3.0312F, -9.4063F, 0.0F, 1.75F, 8.4375F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6563F, 1.1506F, 19.8934F, 0.3927F, 0.0F, 0.0F));

		PartDefinition spine_tail_r1 = tail.addOrReplaceChild("spine_tail_r1", CubeListBuilder.create().texOffs(0, 23).addBox(1.625F, -1.4687F, -2.8125F, 0.0F, 1.8438F, 8.4375F, new CubeDeformation(0.0F))
				.texOffs(20, 17).addBox(-0.1094F, 0.2813F, -2.8125F, 3.4688F, 2.6563F, 8.4375F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6563F, 1.1506F, 19.8934F, -0.3927F, 0.0F, 0.0F));

		PartDefinition tail_base_r1 = tail.addOrReplaceChild("tail_base_r1", CubeListBuilder.create().texOffs(24, 7).addBox(-3.125F, -1.4025F, 4.125F, 6.0625F, 3.9375F, 5.625F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0625F, 5.1838F, 8.6767F, 0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw,headPitch,ageInTicks);

		this.animateWalk(ModAnimationDefinitions.WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((TrexEntity) entity).idleAnimationState, ModAnimationDefinitions.IDLE,ageInTicks,1f);

	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}
	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		trex.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return trex;
	}
}