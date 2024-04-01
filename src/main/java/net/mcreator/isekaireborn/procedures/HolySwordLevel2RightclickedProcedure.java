package net.mcreator.isekaireborn.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class HolySwordLevel2RightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double precision = 0;
		double range2 = 0;
		double range = 0;
		double delay2 = 0;
		double cooldown2 = 0;
		double width2 = 0;
		double speed = 0;
		double delay = 0;
		double size = 0;
		double size2 = 0;
		double cooldown = 0;
		double width = 0;
		double precision2 = 0;
		double speed2 = 0;
		if (precision == 0 && precision >= 10) {
			precision = precision - 10;
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
		if (precision == 1 && precision >= 25) {
			precision = precision - 25;
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
			speed = 2;
			precision = 5;
			width = 3;
			size = 12;
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
			for (int index1 = 0; index1 < (int) (entity.getPersistentData().getDouble("range") * precision); index1++) {
				delay = delay + speed / precision;
				IsekaiRebornMod.queueServerWork((int) delay, () -> {
					entity.getPersistentData().putDouble("sx", (entity.getPersistentData().getDouble("sx") + entity.getPersistentData().getDouble("x+") * (-0.2)));
					entity.getPersistentData().putDouble("sy", (entity.getPersistentData().getDouble("sy") + entity.getPersistentData().getDouble("y+") * (-0.2)));
					entity.getPersistentData().putDouble("sz", (entity.getPersistentData().getDouble("sz") + entity.getPersistentData().getDouble("z+") * (-0.2)));
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FLAME, (entity.getPersistentData().getDouble("sx")), (entity.getPersistentData().getDouble("sy")), (entity.getPersistentData().getDouble("sz")),
								(int) (50 * Math.ceil(entity.getPersistentData().getDouble("width") + entity.getPersistentData().getDouble("size"))), (entity.getPersistentData().getDouble("width")), (entity.getPersistentData().getDouble("size")),
								(entity.getPersistentData().getDouble("width")), 0);
					{
						final Vec3 _center = new Vec3((entity.getPersistentData().getDouble("sx")), (entity.getPersistentData().getDouble("sy")), (entity.getPersistentData().getDouble("sz")));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(Math.ceil(entity.getPersistentData().getDouble("width") + entity.getPersistentData().getDouble("size")) / 2d), e -> true)
								.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (!(entity == entityiterator || entityiterator instanceof ExperienceOrb || entityiterator instanceof ItemEntity)) {
								entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 30);
								if ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) == 0) {
									entity.getPersistentData().putDouble("kill", 1);
								}
							}
						}
					}
				});
			}
		}
		if (precision == 2 && precision >= 30) {
			precision = precision - 30;
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
			speed = 2;
			precision = 5;
			width = 4;
			size = 12;
			range = 30;
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
			entity.getPersistentData().putDouble("rotation", 0);
			for (int index2 = 0; index2 < (int) (entity.getPersistentData().getDouble("range") * precision); index2++) {
				delay = delay + speed / precision;
				IsekaiRebornMod.queueServerWork((int) delay, () -> {
					entity.getPersistentData().putDouble("sx", (entity.getPersistentData().getDouble("sx") + entity.getPersistentData().getDouble("x+") * (-0.2)));
					entity.getPersistentData().putDouble("sy", (entity.getPersistentData().getDouble("sy") + entity.getPersistentData().getDouble("y+") * (-0.2)));
					entity.getPersistentData().putDouble("sz", (entity.getPersistentData().getDouble("sz") + entity.getPersistentData().getDouble("z+") * (-0.2)));
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FLAME, (entity.getPersistentData().getDouble("sx")), (entity.getPersistentData().getDouble("sy")), (entity.getPersistentData().getDouble("sz")),
								(int) (50 * Math.ceil(entity.getPersistentData().getDouble("width") + entity.getPersistentData().getDouble("size"))), (entity.getPersistentData().getDouble("width")), (entity.getPersistentData().getDouble("size")),
								(entity.getPersistentData().getDouble("width")), 0);
					{
						final Vec3 _center = new Vec3((entity.getPersistentData().getDouble("sx")), (entity.getPersistentData().getDouble("sy")), (entity.getPersistentData().getDouble("sz")));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(Math.ceil(entity.getPersistentData().getDouble("width") + entity.getPersistentData().getDouble("size")) / 2d), e -> true)
								.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (!(entity == entityiterator || entityiterator instanceof ExperienceOrb || entityiterator instanceof ItemEntity)) {
								entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 25);
								if ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) == 0) {
									entity.getPersistentData().putDouble("kill", 1);
								}
							}
						}
					}
				});
			}
		}
		if (precision == 2 && precision >= 30) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			cooldown2 = 2;
			speed2 = 2;
			precision2 = 5;
			width2 = 12;
			size2 = 4;
			range2 = 30;
			delay2 = 0;
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (cooldown2 * 20));
			entity.getPersistentData().putDouble("range2", 0);
			entity.getPersistentData().putDouble("sx2", (entity.getX()));
			entity.getPersistentData().putDouble("sy2", (entity.getY() + 1.2));
			entity.getPersistentData().putDouble("sz2", (entity.getZ()));
			entity.getPersistentData().putDouble("tx2",
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(range2)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()));
			entity.getPersistentData().putDouble("ty2",
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(range2)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()));
			entity.getPersistentData().putDouble("tz2",
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(range2)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
			entity.getPersistentData().putDouble("range2", Math.sqrt(Math.pow(entity.getPersistentData().getDouble("sx2") - entity.getPersistentData().getDouble("tx2"), 0)
					+ Math.pow(entity.getPersistentData().getDouble("sy2") - entity.getPersistentData().getDouble("ty2"), 0) + Math.pow(entity.getPersistentData().getDouble("sz2") - entity.getPersistentData().getDouble("tz2"), 0)));
			entity.getPersistentData().putDouble("x+2", ((entity.getPersistentData().getDouble("sx2") - entity.getPersistentData().getDouble("tx2")) / entity.getPersistentData().getDouble("range2")));
			entity.getPersistentData().putDouble("y+2", ((entity.getPersistentData().getDouble("sy2") - entity.getPersistentData().getDouble("ty2")) / entity.getPersistentData().getDouble("range2")));
			entity.getPersistentData().putDouble("z+2", ((entity.getPersistentData().getDouble("sz2") - entity.getPersistentData().getDouble("tz2")) / entity.getPersistentData().getDouble("range2")));
			entity.getPersistentData().putDouble("size2", (size2 / 10));
			entity.getPersistentData().putDouble("width2", (width2 / 10));
			entity.getPersistentData().putDouble("rotation2", 0);
			for (int index3 = 0; index3 < (int) (entity.getPersistentData().getDouble("range2") * precision2); index3++) {
				delay2 = delay2 + speed2 / precision2;
				IsekaiRebornMod.queueServerWork((int) delay2, () -> {
					entity.getPersistentData().putDouble("sx2", (entity.getPersistentData().getDouble("sx2") + entity.getPersistentData().getDouble("x+2") * (-0.2)));
					entity.getPersistentData().putDouble("sy2", (entity.getPersistentData().getDouble("sy2") + entity.getPersistentData().getDouble("y+2") * (-0.2)));
					entity.getPersistentData().putDouble("sz2", (entity.getPersistentData().getDouble("sz2") + entity.getPersistentData().getDouble("z+2") * (-0.2)));
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FLAME, (entity.getPersistentData().getDouble("sx2")), (entity.getPersistentData().getDouble("sy2")), (entity.getPersistentData().getDouble("sz2")),
								(int) (50 * Math.ceil(entity.getPersistentData().getDouble("width2") + entity.getPersistentData().getDouble("size2"))), (entity.getPersistentData().getDouble("width2")), (entity.getPersistentData().getDouble("size2")),
								(entity.getPersistentData().getDouble("width2")), 0);
					{
						final Vec3 _center = new Vec3((entity.getPersistentData().getDouble("sx2")), (entity.getPersistentData().getDouble("sy2")), (entity.getPersistentData().getDouble("sz2")));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(Math.ceil(entity.getPersistentData().getDouble("width2") + entity.getPersistentData().getDouble("size2")) / 2d), e -> true)
								.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (!(entity == entityiterator || entityiterator instanceof ExperienceOrb || entityiterator instanceof ItemEntity)) {
								entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 25);
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
