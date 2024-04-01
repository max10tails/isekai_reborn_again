
package net.mcreator.isekaireborn.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class HolySwordFullPowerItem extends SwordItem {
	public HolySwordFullPowerItem() {
		super(new Tier() {
			public int getUses() {
				return 3001;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 28f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, 2f, new Item.Properties().fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
