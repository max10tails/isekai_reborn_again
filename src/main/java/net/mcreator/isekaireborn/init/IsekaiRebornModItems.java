
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.isekaireborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

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
	public static final RegistryObject<Item> BLUE_GLO_SHROOMLING = block(IsekaiRebornModBlocks.BLUE_GLO_SHROOMLING);
	public static final RegistryObject<Item> PINK_GLO_SHROOMLING = block(IsekaiRebornModBlocks.PINK_GLO_SHROOMLING);
	public static final RegistryObject<Item> GREEN_GLO_SHROOMLING = block(IsekaiRebornModBlocks.GREEN_GLO_SHROOMLING);
	public static final RegistryObject<Item> CHAOS_DRAGON_SPAWN_EGG = REGISTRY.register("chaos_dragon_spawn_egg", () -> new ForgeSpawnEggItem(IsekaiRebornModEntities.CHAOS_DRAGON, -16724737, -3407617, new Item.Properties()));
	public static final RegistryObject<Item> SUCCUBUSPARTS_SPAWN_EGG = REGISTRY.register("succubusparts_spawn_egg", () -> new ForgeSpawnEggItem(IsekaiRebornModEntities.SUCCUBUSPARTS, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> SUCCUBUS_SPAWN_EGG = REGISTRY.register("succubus_spawn_egg", () -> new ForgeSpawnEggItem(IsekaiRebornModEntities.SUCCUBUS, -3407872, -3407821, new Item.Properties()));
	public static final RegistryObject<Item> DIRE_WOLF_ALPHA_SPAWN_EGG = REGISTRY.register("dire_wolf_alpha_spawn_egg", () -> new ForgeSpawnEggItem(IsekaiRebornModEntities.DIRE_WOLF_ALPHA, -6710887, -1, new Item.Properties()));
	public static final RegistryObject<Item> SUB_WOLF_SPAWN_EGG = REGISTRY.register("sub_wolf_spawn_egg", () -> new ForgeSpawnEggItem(IsekaiRebornModEntities.SUB_WOLF, -1, -6710887, new Item.Properties()));
	public static final RegistryObject<Item> GIANT_BOAR_SPAWN_EGG = REGISTRY.register("giant_boar_spawn_egg", () -> new ForgeSpawnEggItem(IsekaiRebornModEntities.GIANT_BOAR, -10092544, -10079488, new Item.Properties()));
	public static final RegistryObject<Item> BOARLING_SPAWN_EGG = REGISTRY.register("boarling_spawn_egg", () -> new ForgeSpawnEggItem(IsekaiRebornModEntities.BOARLING, -6750208, -10079488, new Item.Properties()));

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
