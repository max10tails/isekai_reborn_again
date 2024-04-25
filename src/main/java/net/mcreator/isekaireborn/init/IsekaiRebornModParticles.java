
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.isekaireborn.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.isekaireborn.client.particle.PurpleflameParticle;
import net.mcreator.isekaireborn.client.particle.GreenflameParticle;
import net.mcreator.isekaireborn.client.particle.FlameParticle;
import net.mcreator.isekaireborn.client.particle.BlueFlameParticle;
import net.mcreator.isekaireborn.client.particle.BlackflameParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class IsekaiRebornModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(IsekaiRebornModParticleTypes.BLUE_FLAME.get(), BlueFlameParticle::provider);
		event.registerSpriteSet(IsekaiRebornModParticleTypes.FLAME.get(), FlameParticle::provider);
		event.registerSpriteSet(IsekaiRebornModParticleTypes.PURPLEFLAME.get(), PurpleflameParticle::provider);
		event.registerSpriteSet(IsekaiRebornModParticleTypes.BLACKFLAME.get(), BlackflameParticle::provider);
		event.registerSpriteSet(IsekaiRebornModParticleTypes.GREENFLAME.get(), GreenflameParticle::provider);
	}
}
