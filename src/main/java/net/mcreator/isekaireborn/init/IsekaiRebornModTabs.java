
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.isekaireborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.isekaireborn.IsekaiRebornMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IsekaiRebornModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IsekaiRebornMod.MODID);
	public static final RegistryObject<CreativeModeTab> ISEKAI_REBORN_AGAIN = REGISTRY.register("isekai_reborn_again",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.isekai_reborn.isekai_reborn_again")).icon(() -> new ItemStack(IsekaiRebornModItems.HOLY_SWORD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(IsekaiRebornModItems.HOLY_SWORD.get());
				tabData.accept(IsekaiRebornModItems.HOLY_SWORD_BROKEN.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(IsekaiRebornModItems.CHAOS_DRAGON_SPAWN_EGG.get());
			tabData.accept(IsekaiRebornModItems.SUCCUBUSPARTS_SPAWN_EGG.get());
			tabData.accept(IsekaiRebornModItems.SUCCUBUS_SPAWN_EGG.get());
			tabData.accept(IsekaiRebornModItems.DIRE_WOLF_ALPHA_SPAWN_EGG.get());
			tabData.accept(IsekaiRebornModItems.SUB_WOLF_SPAWN_EGG.get());
			tabData.accept(IsekaiRebornModItems.GIANT_BOAR_SPAWN_EGG.get());
			tabData.accept(IsekaiRebornModItems.BOARLING_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(IsekaiRebornModBlocks.BLUE_GLO_SHROOMLING.get().asItem());
			tabData.accept(IsekaiRebornModBlocks.PINK_GLO_SHROOMLING.get().asItem());
			tabData.accept(IsekaiRebornModBlocks.GREEN_GLO_SHROOMLING.get().asItem());
		}
	}
}
