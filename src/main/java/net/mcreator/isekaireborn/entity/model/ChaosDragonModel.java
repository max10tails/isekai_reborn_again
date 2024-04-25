package net.mcreator.isekaireborn.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.isekaireborn.entity.ChaosDragonEntity;

public class ChaosDragonModel extends GeoModel<ChaosDragonEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChaosDragonEntity entity) {
		return new ResourceLocation("isekai_reborn", "animations/chaosdragon1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChaosDragonEntity entity) {
		return new ResourceLocation("isekai_reborn", "geo/chaosdragon1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChaosDragonEntity entity) {
		return new ResourceLocation("isekai_reborn", "textures/entities/" + entity.getTexture() + ".png");
	}

}
