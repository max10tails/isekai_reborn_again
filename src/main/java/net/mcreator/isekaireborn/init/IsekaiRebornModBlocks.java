
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.isekaireborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.isekaireborn.block.BlueGloShroomlingBlock;
import net.mcreator.isekaireborn.IsekaiRebornMod;

public class IsekaiRebornModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, IsekaiRebornMod.MODID);
	public static final RegistryObject<Block> BLUE_GLO_SHROOMLING = REGISTRY.register("blue_glo_shroomling", () -> new BlueGloShroomlingBlock());
}
