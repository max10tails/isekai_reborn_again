
package net.mcreator.isekaireborn.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.isekaireborn.entity.SuccubusEntity;
import net.mcreator.isekaireborn.client.model.Modelsuccubus;

public class SuccubusRenderer extends MobRenderer<SuccubusEntity, Modelsuccubus<SuccubusEntity>> {
	public SuccubusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsuccubus(context.bakeLayer(Modelsuccubus.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SuccubusEntity entity) {
		return new ResourceLocation("isekai_reborn:textures/entities/succubiskinred.png");
	}
}
