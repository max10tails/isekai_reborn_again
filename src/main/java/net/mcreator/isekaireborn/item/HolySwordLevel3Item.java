
package net.mcreator.isekaireborn.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class HolySwordLevel3Item extends SwordItem {
	public HolySwordLevel3Item() {
		super(new Tier() {
			public int getUses() {
				return 1001;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 13f;
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
		}, 3, 1.6f, new Item.Properties().fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
