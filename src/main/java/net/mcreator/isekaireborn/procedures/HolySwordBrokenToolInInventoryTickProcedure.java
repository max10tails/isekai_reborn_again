package net.mcreator.isekaireborn.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class HolySwordBrokenToolInInventoryTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		IsekaiRebornMod.queueServerWork(2400, () -> {
			if (entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel
					&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone()
					&& !(entity instanceof ServerPlayer _plr1 && _plr1.level() instanceof ServerLevel
							&& _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone())
					&& !(entity instanceof ServerPlayer _plr2 && _plr2.level() instanceof ServerLevel
							&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone())
					&& !(entity instanceof ServerPlayer _plr3 && _plr3.level() instanceof ServerLevel
							&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:white_gem"))).isDone())
					&& !(entity instanceof ServerPlayer _plr4 && _plr4.level() instanceof ServerLevel
							&& _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:purple_gem"))).isDone())
					&& !(entity instanceof ServerPlayer _plr5 && _plr5.level() instanceof ServerLevel
							&& _plr5.getAdvancements().getOrStartProgress(_plr5.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone())) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IsekaiRebornModItems.DELETED_MOD_ELEMENT.get())) : false) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(IsekaiRebornModItems.DELETED_MOD_ELEMENT.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(IsekaiRebornModItems.DELETED_MOD_ELEMENT.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
			if (entity instanceof ServerPlayer _plr9 && _plr9.level() instanceof ServerLevel
					&& _plr9.getAdvancements().getOrStartProgress(_plr9.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone() && entity instanceof ServerPlayer _plr10
					&& _plr10.level() instanceof ServerLevel && _plr10.getAdvancements().getOrStartProgress(_plr10.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone()
					&& !(entity instanceof ServerPlayer _plr11 && _plr11.level() instanceof ServerLevel
							&& _plr11.getAdvancements().getOrStartProgress(_plr11.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone())
					&& !(entity instanceof ServerPlayer _plr12 && _plr12.level() instanceof ServerLevel
							&& _plr12.getAdvancements().getOrStartProgress(_plr12.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:white_gem"))).isDone())
					&& !(entity instanceof ServerPlayer _plr13 && _plr13.level() instanceof ServerLevel
							&& _plr13.getAdvancements().getOrStartProgress(_plr13.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:purple_gem"))).isDone())
					&& !(entity instanceof ServerPlayer _plr14 && _plr14.level() instanceof ServerLevel
							&& _plr14.getAdvancements().getOrStartProgress(_plr14.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone())) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IsekaiRebornModItems.DELETED_MOD_ELEMENT.get())) : false) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(IsekaiRebornModItems.DELETED_MOD_ELEMENT.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(IsekaiRebornModItems.HOLY_SWORD_LEVEL_1.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
			if (entity instanceof ServerPlayer _plr18 && _plr18.level() instanceof ServerLevel
					&& _plr18.getAdvancements().getOrStartProgress(_plr18.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone() && entity instanceof ServerPlayer _plr19
					&& _plr19.level() instanceof ServerLevel && _plr19.getAdvancements().getOrStartProgress(_plr19.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone()
					&& entity instanceof ServerPlayer _plr20 && _plr20.level() instanceof ServerLevel
					&& _plr20.getAdvancements().getOrStartProgress(_plr20.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone()
					&& !(entity instanceof ServerPlayer _plr21 && _plr21.level() instanceof ServerLevel
							&& _plr21.getAdvancements().getOrStartProgress(_plr21.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:white_gem"))).isDone())
					&& !(entity instanceof ServerPlayer _plr22 && _plr22.level() instanceof ServerLevel
							&& _plr22.getAdvancements().getOrStartProgress(_plr22.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:purple_gem"))).isDone())
					&& !(entity instanceof ServerPlayer _plr23 && _plr23.level() instanceof ServerLevel
							&& _plr23.getAdvancements().getOrStartProgress(_plr23.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone())) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IsekaiRebornModItems.DELETED_MOD_ELEMENT.get())) : false) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(IsekaiRebornModItems.DELETED_MOD_ELEMENT.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(IsekaiRebornModItems.HOLY_SWORD_LEVEL_2.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
			if (entity instanceof ServerPlayer _plr27 && _plr27.level() instanceof ServerLevel
					&& _plr27.getAdvancements().getOrStartProgress(_plr27.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone() && entity instanceof ServerPlayer _plr28
					&& _plr28.level() instanceof ServerLevel && _plr28.getAdvancements().getOrStartProgress(_plr28.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone()
					&& entity instanceof ServerPlayer _plr29 && _plr29.level() instanceof ServerLevel
					&& _plr29.getAdvancements().getOrStartProgress(_plr29.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone() && entity instanceof ServerPlayer _plr30
					&& _plr30.level() instanceof ServerLevel && _plr30.getAdvancements().getOrStartProgress(_plr30.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:white_gem"))).isDone()
					&& !(entity instanceof ServerPlayer _plr31 && _plr31.level() instanceof ServerLevel
							&& _plr31.getAdvancements().getOrStartProgress(_plr31.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:purple_gem"))).isDone())
					&& !(entity instanceof ServerPlayer _plr32 && _plr32.level() instanceof ServerLevel
							&& _plr32.getAdvancements().getOrStartProgress(_plr32.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone())) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IsekaiRebornModItems.DELETED_MOD_ELEMENT.get())) : false) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(IsekaiRebornModItems.DELETED_MOD_ELEMENT.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(IsekaiRebornModItems.HOLY_SWORD_LEVEL_3.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
			if (entity instanceof ServerPlayer _plr36 && _plr36.level() instanceof ServerLevel
					&& _plr36.getAdvancements().getOrStartProgress(_plr36.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone() && entity instanceof ServerPlayer _plr37
					&& _plr37.level() instanceof ServerLevel && _plr37.getAdvancements().getOrStartProgress(_plr37.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone()
					&& entity instanceof ServerPlayer _plr38 && _plr38.level() instanceof ServerLevel
					&& _plr38.getAdvancements().getOrStartProgress(_plr38.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone() && entity instanceof ServerPlayer _plr39
					&& _plr39.level() instanceof ServerLevel && _plr39.getAdvancements().getOrStartProgress(_plr39.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:white_gem"))).isDone()
					&& entity instanceof ServerPlayer _plr40 && _plr40.level() instanceof ServerLevel
					&& _plr40.getAdvancements().getOrStartProgress(_plr40.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:purple_gem"))).isDone() && !(entity instanceof ServerPlayer _plr41
							&& _plr41.level() instanceof ServerLevel && _plr41.getAdvancements().getOrStartProgress(_plr41.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone())) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IsekaiRebornModItems.DELETED_MOD_ELEMENT.get())) : false) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(IsekaiRebornModItems.DELETED_MOD_ELEMENT.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(IsekaiRebornModItems.HOLY_SWORD_LEVEL_4.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
			if (entity instanceof ServerPlayer _plr45 && _plr45.level() instanceof ServerLevel
					&& _plr45.getAdvancements().getOrStartProgress(_plr45.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone() && entity instanceof ServerPlayer _plr46
					&& _plr46.level() instanceof ServerLevel && _plr46.getAdvancements().getOrStartProgress(_plr46.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone()
					&& entity instanceof ServerPlayer _plr47 && _plr47.level() instanceof ServerLevel
					&& _plr47.getAdvancements().getOrStartProgress(_plr47.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone() && entity instanceof ServerPlayer _plr48
					&& _plr48.level() instanceof ServerLevel && _plr48.getAdvancements().getOrStartProgress(_plr48.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:white_gem"))).isDone()
					&& entity instanceof ServerPlayer _plr49 && _plr49.level() instanceof ServerLevel
					&& _plr49.getAdvancements().getOrStartProgress(_plr49.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:purple_gem"))).isDone() && entity instanceof ServerPlayer _plr50
					&& _plr50.level() instanceof ServerLevel && _plr50.getAdvancements().getOrStartProgress(_plr50.server.getAdvancements().getAdvancement(new ResourceLocation("isekai_reborn:deleted_mod_element"))).isDone()) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IsekaiRebornModItems.DELETED_MOD_ELEMENT.get())) : false) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(IsekaiRebornModItems.DELETED_MOD_ELEMENT.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(IsekaiRebornModItems.DELETED_MOD_ELEMENT.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
		});
	}
}
