package net.mcreator.isekaireborn.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelsuccubus<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("isekai_reborn", "modelsuccubus"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart left_arm;
	public final ModelPart right_arm;
	public final ModelPart left_leg;
	public final ModelPart right_leg;

	public Modelsuccubus(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.33F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(64, 52).addBox(0.0F, 0.0F, 0.0F, 0.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(64, 46).addBox(0.0F, 0.0F, 0.0F, 0.0F, 18.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(40, 26).addBox(-2.5F, 0.0F, -1.5F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.2F)).texOffs(40, 16)
				.addBox(-2.5F, -1.0F, -1.5F, 5.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 33).addBox(-3.0F, 6.0F, -1.5F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition bone7 = body2.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(25, 70).addBox(-2.5F, -1.0F, -1.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.19F)), PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, -0.7418F, 0.0F, 0.0F));
		PartDefinition bone = body2.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(41, 40).addBox(-2.5F, -1.0F, -1.6F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, -0.7418F, 0.0F, 0.0F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(32, 16).mirror().addBox(0.0086F, -1.1305F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(32, 30).mirror()
				.addBox(0.0086F, -1.1305F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offset(2.9F, 2.0F, 0.0F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(24, 16).addBox(-2.0086F, -1.1305F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 30).addBox(-2.0086F, -1.1305F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.1F)),
				PartPose.offset(-2.825F, 2.0F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(64, 52).mirror().addBox(-2.0F, 3.0F, 0.0F, 0.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, 9.0F, 0.0F));
		PartDefinition left_leg2 = left_leg.addOrReplaceChild("left_leg2", CubeListBuilder.create().texOffs(12, 16).addBox(-1.9F, -3.0F, -1.5F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.1F, 3.0F, 0.0F));
		PartDefinition left_leg_sub_1 = left_leg2.addOrReplaceChild("left_leg_sub_1", CubeListBuilder.create().texOffs(12, 34).mirror().addBox(-1.69F, -3.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.2F)).mirror(false).texOffs(12, 43).mirror()
				.addBox(-1.67F, -2.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(64, 52).addBox(2.0F, 3.0F, 0.0F, 0.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 9.0F, 0.0F));
		PartDefinition right_leg2 = right_leg.addOrReplaceChild("right_leg2",
				CubeListBuilder.create().texOffs(0, 34).addBox(-1.31F, -4.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.2F)).texOffs(0, 43).addBox(-1.33F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.3F)),
				PartPose.offset(0.1F, 4.0F, 0.0F));
		PartDefinition right_leg_sub_1 = right_leg2.addOrReplaceChild("right_leg_sub_1", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-1.1F, -4.0F, -1.5F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
