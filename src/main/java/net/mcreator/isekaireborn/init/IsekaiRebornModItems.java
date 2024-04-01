
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.isekaireborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.isekaireborn.item.HolySwordLevel4Item;
import net.mcreator.isekaireborn.item.HolySwordLevel3Item;
import net.mcreator.isekaireborn.item.HolySwordLevel2Item;
import net.mcreator.isekaireborn.item.HolySwordLevel1Item;
import net.mcreator.isekaireborn.item.HolySwordItem;
import net.mcreator.isekaireborn.item.HolySwordFullPowerItem;
import net.mcreator.isekaireborn.item.HolySwordBrokenItem;
import net.mcreator.isekaireborn.IsekaiRebornMod;

public class IsekaiRebornModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IsekaiRebornMod.MODID);
	public static final RegistryObject<Item> HOLY_SWORD = REGISTRY.register("holy_sword", () -> new HolySwordItem());
	public static final RegistryObject<Item> HOLY_SWORD_LEVEL_1 = REGISTRY.register("holy_sword_level_1", () -> new HolySwordLevel1Item());
	public static final RegistryObject<Item> HOLY_SWORD_LEVEL_2 = REGISTRY.register("holy_sword_level_2", () -> new HolySwordLevel2Item());
	public static final RegistryObject<Item> HOLY_SWORD_LEVEL_3 = REGISTRY.register("holy_sword_level_3", () -> new HolySwordLevel3Item());
	public static final RegistryObject<Item> HOLY_SWORD_LEVEL_4 = REGISTRY.register("holy_sword_level_4", () -> new HolySwordLevel4Item());
	public static final RegistryObject<Item> HOLY_SWORD_FULL_POWER = REGISTRY.register("holy_sword_full_power", () -> new HolySwordFullPowerItem());
	public static final RegistryObject<Item> HOLY_SWORD_BROKEN = REGISTRY.register("holy_sword_broken", () -> new HolySwordBrokenItem());
}
