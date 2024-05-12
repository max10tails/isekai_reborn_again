package net.mcreator.isekaireborn.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.isekaireborn.entity.BoarlingEntity;

public class BoarlingModel extends GeoModel<BoarlingEntity> {
	@Override
	public ResourceLocation getAnimationResource(BoarlingEntity entity) {
		return new ResourceLocation("isekai_reborn", "animations/boarling.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BoarlingEntity entity) {
		return new ResourceLocation("isekai_reborn", "geo/boarling.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BoarlingEntity entity) {
		return new ResourceLocation("isekai_reborn", "textures/entities/" + entity.getTexture() + ".png");
	}

}
