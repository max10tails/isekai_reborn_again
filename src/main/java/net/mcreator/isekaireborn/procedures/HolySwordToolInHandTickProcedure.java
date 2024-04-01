package net.mcreator.isekaireborn.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.isekaireborn.init.IsekaiRebornModItems;

public class HolySwordToolInHandTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getDamageValue() == 1) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(IsekaiRebornModItems.HOLY_SWORD.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(IsekaiRebornModItems.HOLY_SWORD_BROKEN.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}
