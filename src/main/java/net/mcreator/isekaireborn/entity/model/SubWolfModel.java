package net.mcreator.isekaireborn.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.isekaireborn.entity.SubWolfEntity;

public class SubWolfModel extends GeoModel<SubWolfEntity> {
	@Override
	public ResourceLocation getAnimationResource(SubWolfEntity entity) {
		return new ResourceLocation("isekai_reborn", "animations/shadowwolfsub.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SubWolfEntity entity) {
		return new ResourceLocation("isekai_reborn", "geo/shadowwolfsub.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SubWolfEntity entity) {
		return new ResourceLocation("isekai_reborn", "textures/entities/" + entity.getTexture() + ".png");
	}

}
