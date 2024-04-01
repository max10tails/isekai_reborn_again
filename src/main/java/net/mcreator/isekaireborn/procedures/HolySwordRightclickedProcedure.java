package net.mcreator.isekaireborn.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class HolySwordRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double delay = 0;
		double size = 0;
		double precision = 0;
		double cooldown = 0;
		double width = 0;
		double range = 0;
		double speed = 0;
		if (delay == 0 && delay >= 10) {
			delay = delay - 10;
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			cooldown = 2;
			speed = 3;
			precision = 5;
			width = 3;
			size = 3;
			range = 20;
			delay = 0;
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (cooldown * 20));
			entity.getPersistentData().putDouble("range", 0);
			entity.getPersistentData().putDouble("sx", (entity.getX()));
			entity.getPersistentData().putDouble("sy", (entity.getY() + 1.2));
			entity.getPersistentData().putDouble("sz", (entity.getZ()));
			entity.getPersistentData().putDouble("tx",
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(range)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()));
			entity.getPersistentData().putDouble("ty",
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(range)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()));
			entity.getPersistentData().putDouble("tz",
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(range)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
			entity.getPersistentData().putDouble("range", Math.sqrt(Math.pow(entity.getPersistentData().getDouble("sx") - entity.getPersistentData().getDouble("tx"), 0)
					+ Math.pow(entity.getPersistentData().getDouble("sy") - entity.getPersistentData().getDouble("ty"), 0) + Math.pow(entity.getPersistentData().getDouble("sz") - entity.getPersistentData().getDouble("tz"), 0)));
			entity.getPersistentData().putDouble("x+", ((entity.getPersistentData().getDouble("sx") - entity.getPersistentData().getDouble("tx")) / entity.getPersistentData().getDouble("range")));
			entity.getPersistentData().putDouble("y+", ((entity.getPersistentData().getDouble("sy") - entity.getPersistentData().getDouble("ty")) / entity.getPersistentData().getDouble("range")));
			entity.getPersistentData().putDouble("z+", ((entity.getPersistentData().getDouble("sz") - entity.getPersistentData().getDouble("tz")) / entity.getPersistentData().getDouble("range")));
			entity.getPersistentData().putDouble("size", (size / 10));
			entity.getPersistentData().putDouble("width", (width / 10));
			for (int index0 = 0; index0 < (int) (entity.getPersistentData().getDouble("range") * precision); index0++) {
				delay = delay + speed / precision;
				IsekaiRebornMod.queueServerWork((int) delay, () -> {
					entity.getPersistentData().putDouble("sx", (entity.getPersistentData().getDouble("sx") + entity.getPersistentData().getDouble("x+") * (-0.2)));
					entity.getPersistentData().putDouble("sy", (entity.getPersistentData().getDouble("sy") + entity.getPersistentData().getDouble("y+") * (-0.2)));
					entity.getPersistentData().putDouble("sz", (entity.getPersistentData().getDouble("sz") + entity.getPersistentData().getDouble("z+") * (-0.2)));
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SOUL_FIRE_FLAME, (entity.getPersistentData().getDouble("sx")), (entity.getPersistentData().getDouble("sy")), (entity.getPersistentData().getDouble("sz")), 10,
								(entity.getPersistentData().getDouble("width")), (entity.getPersistentData().getDouble("size")), (entity.getPersistentData().getDouble("width")), 0);
					{
						final Vec3 _center = new Vec3((entity.getPersistentData().getDouble("sx")), (entity.getPersistentData().getDouble("sy")), (entity.getPersistentData().getDouble("sz")));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(Math.ceil(entity.getPersistentData().getDouble("width") + entity.getPersistentData().getDouble("size")) / 2d), e -> true)
								.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (!(entity == entityiterator || entityiterator instanceof ExperienceOrb || entityiterator instanceof ItemEntity)) {
								entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 20);
								if ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) == 0) {
									entity.getPersistentData().putDouble("kill", 1);
								}
							}
						}
					}
				});
			}
		}
	}
}
