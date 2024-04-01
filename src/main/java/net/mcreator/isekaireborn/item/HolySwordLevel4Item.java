
package net.mcreator.isekaireborn.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class HolySwordLevel4Item extends SwordItem {
	public HolySwordLevel4Item() {
		super(new Tier() {
			public int getUses() {
				return 2001;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 18f;
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
		}, 3, 1.8f, new Item.Properties().fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}