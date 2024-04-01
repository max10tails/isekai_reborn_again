package net.mcreator.isekaireborn.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class HolySwordToolInHandTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getDamageValue() == 1) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(IsekaiRebornModItems.DELETED_MOD_ELEMENT.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(IsekaiRebornModItems.DELETED_MOD_ELEMENT.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}
