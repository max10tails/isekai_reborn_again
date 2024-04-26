
package net.mcreator.isekaireborn.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.isekaireborn.entity.SuccubuspartsEntity;
import net.mcreator.isekaireborn.client.model.Modelsuccubusparts;

public class SuccubuspartsRenderer extends MobRenderer<SuccubuspartsEntity, Modelsuccubusparts<SuccubuspartsEntity>> {
	public SuccubuspartsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsuccubusparts(context.bakeLayer(Modelsuccubusparts.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SuccubuspartsEntity entity) {
		return new ResourceLocation("isekai_reborn:textures/entities/succubuswingandtail.png");
	}
}
