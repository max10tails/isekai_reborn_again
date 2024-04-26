
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.isekaireborn.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.isekaireborn.client.model.Modelsuccubusparts;
import net.mcreator.isekaireborn.client.model.Modelsuccubus;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class IsekaiRebornModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelsuccubusparts.LAYER_LOCATION, Modelsuccubusparts::createBodyLayer);
		event.registerLayerDefinition(Modelsuccubus.LAYER_LOCATION, Modelsuccubus::createBodyLayer);
	}
}
