// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsuccubusparts<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "succubusparts"), "main");
	private final ModelPart Body;
	private final ModelPart Head;

	public Modelsuccubusparts(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leftwing = Body.addOrReplaceChild("leftwing", CubeListBuilder.create(),
				PartPose.offset(1.5F, 7.0F, 1.0F));

		PartDefinition cube_r1 = leftwing.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.225F, 0.5F, -5.0F, 1.0F, 1.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2188F, 1.6107F, 2.9939F, -0.6128F, 0.806F, -0.1382F));

		PartDefinition leftwingtip = leftwing.addOrReplaceChild("leftwingtip", CubeListBuilder.create(),
				PartPose.offset(6.0F, 5.0F, 5.0F));

		PartDefinition cube_r2 = leftwingtip.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(39, 2).addBox(0.0F, -9.15F, -1.5F, 0.0F, 12.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.506F, -2.0309F, 1.5083F, -0.9182F, 0.806F, -0.1382F));

		PartDefinition rightwing = Body.addOrReplaceChild("rightwing", CubeListBuilder.create(),
				PartPose.offset(-1.5F, 7.0F, 1.0F));

		PartDefinition cube_r3 = rightwing.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-0.775F, 0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.2188F, 1.6107F, 2.9939F, -0.6128F, -0.806F, 0.1382F));

		PartDefinition rightwingtip = rightwing.addOrReplaceChild("rightwingtip", CubeListBuilder.create(),
				PartPose.offset(-6.0F, 5.0F, 5.0F));

		PartDefinition cube_r4 = rightwingtip.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(39, 2).mirror()
						.addBox(0.0F, -9.15F, -1.5F, 0.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.506F, -2.0309F, 1.5083F, -0.9182F, -0.806F, 0.1382F));

		PartDefinition tail = Body.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(0.0F, 9.0F, 0.0F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.225F, -0.225F, -3.0F, 0.45F, 0.45F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.05F, 2.3034F, 1.7224F, -1.0036F, 0.0F, 0.0F));

		PartDefinition bone = tail.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 5.0F, 3.3F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.175F, 0.075F, -2.0F, 0.35F, 0.4F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.05F, 1.5203F, 1.1089F, -1.1345F, 0.0F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 4.3F, 2.2F));

		PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(1, 1).addBox(-0.15F, 0.225F, -2.5F, 0.3F, 0.25F, 4.525F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.05F, 1.1974F, 1.6892F, -0.7854F, 0.0F, 0.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 2.8F, 2.8F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(36, 28).addBox(-1.15F, -0.1F, -2.925F, 7.0F, 0.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3371F, -0.5873F, -0.5905F, -1.5708F, -0.7854F, 1.5708F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Dragon = Head.addOrReplaceChild("Dragon", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body2 = Dragon.addOrReplaceChild("Body2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 7.0F, -7.0F));

		PartDefinition Neck = Body2.addOrReplaceChild("Neck", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -2.5F, -2.0F, 2.0071F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck.addOrReplaceChild("Neck4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -1.8F, 1.1F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Neck4_s = Neck4.addOrReplaceChild("Neck4_s", CubeListBuilder.create(),
				PartPose.offset(0.0F, 1.5731F, -0.88F));

		PartDefinition Neck3 = Neck4.addOrReplaceChild("Neck3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.9855F, -1.4911F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Neck3_s = Neck3.addOrReplaceChild("Neck3_s", CubeListBuilder.create(),
				PartPose.offset(0.0F, -2.1676F, 1.1904F));

		PartDefinition Neck2 = Neck3.addOrReplaceChild("Neck2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -2.7359F, 0.334F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Neck2_s = Neck2.addOrReplaceChild("Neck2_s", CubeListBuilder.create(),
				PartPose.offset(0.0F, -2.5047F, 0.0462F));

		PartDefinition Neck1 = Neck2.addOrReplaceChild("Neck1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -4.0975F, -0.3202F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Head2 = Neck1.addOrReplaceChild("Head2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -6.6319F, -0.795F, -0.2618F, 0.0F, 0.0F));

		PartDefinition HornLeft5 = Head2.addOrReplaceChild("HornLeft5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.0F, -2.1667F, 1.8181F, 0.0F, 0.3491F, 0.0F));

		PartDefinition HornLeft5_r1 = HornLeft5.addOrReplaceChild("HornLeft5_r1",
				CubeListBuilder.create().texOffs(24, 27).addBox(-0.112F, -0.5431F, -2.453F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9523F, 1.7795F, 17.6914F, 1.2853F, -0.2622F, 0.4358F));

		PartDefinition HornLeft5_r2 = HornLeft5.addOrReplaceChild("HornLeft5_r2",
				CubeListBuilder.create().texOffs(3, 22).addBox(0.6002F, -0.8847F, -5.0209F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9523F, 1.7795F, 17.6914F, 1.2245F, 0.0999F, 1.143F));

		PartDefinition HornRight5 = Head2.addOrReplaceChild("HornRight5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.0F, -2.1667F, 1.8181F, 0.0F, -0.3491F, 0.0F));

		PartDefinition HornRight5_r1 = HornRight5.addOrReplaceChild("HornRight5_r1",
				CubeListBuilder.create().texOffs(24, 27).addBox(-0.9187F, -0.5367F, -2.3634F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9172F, 1.8121F, 17.7172F, 1.2676F, 0.2558F, -0.4704F));

		PartDefinition HornRight5_r2 = HornRight5.addOrReplaceChild("HornRight5_r2",
				CubeListBuilder.create().texOffs(3, 22).addBox(-2.6109F, -0.8759F, -4.9892F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9172F, 1.8121F, 17.7172F, 1.2155F, -0.1157F, -1.1722F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
	}
}