
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.isekaireborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.isekaireborn.IsekaiRebornMod;

public class IsekaiRebornModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, IsekaiRebornMod.MODID);
	public static final RegistryObject<SimpleParticleType> BLUE_FLAME = REGISTRY.register("blue_flame", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> FLAME = REGISTRY.register("flame", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> PURPLEFLAME = REGISTRY.register("purpleflame", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> BLACKFLAME = REGISTRY.register("blackflame", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> GREENFLAME = REGISTRY.register("greenflame", () -> new SimpleParticleType(false));
}
