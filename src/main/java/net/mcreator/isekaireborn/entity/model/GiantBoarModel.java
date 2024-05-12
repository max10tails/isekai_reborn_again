package net.mcreator.isekaireborn.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.isekaireborn.entity.GiantBoarEntity;

public class GiantBoarModel extends GeoModel<GiantBoarEntity> {
	@Override
	public ResourceLocation getAnimationResource(GiantBoarEntity entity) {
		return new ResourceLocation("isekai_reborn", "animations/giantboar.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GiantBoarEntity entity) {
		return new ResourceLocation("isekai_reborn", "geo/giantboar.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GiantBoarEntity entity) {
		return new ResourceLocation("isekai_reborn", "textures/entities/" + entity.getTexture() + ".png");
	}

}
