package net.mcreator.isekaireborn.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.isekaireborn.entity.DireWolfAlphaEntity;

public class DireWolfAlphaModel extends GeoModel<DireWolfAlphaEntity> {
	@Override
	public ResourceLocation getAnimationResource(DireWolfAlphaEntity entity) {
		return new ResourceLocation("isekai_reborn", "animations/shadowwolf.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DireWolfAlphaEntity entity) {
		return new ResourceLocation("isekai_reborn", "geo/shadowwolf.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DireWolfAlphaEntity entity) {
		return new ResourceLocation("isekai_reborn", "textures/entities/" + entity.getTexture() + ".png");
	}

}
