
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.isekaireborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.isekaireborn.entity.SuccubuspartsEntity;
import net.mcreator.isekaireborn.entity.SuccubusEntity;
import net.mcreator.isekaireborn.entity.SubWolfEntity;
import net.mcreator.isekaireborn.entity.GiantBoarEntity;
import net.mcreator.isekaireborn.entity.DireWolfAlphaEntity;
import net.mcreator.isekaireborn.entity.ChaosDragonEntity;
import net.mcreator.isekaireborn.entity.BoarlingEntity;
import net.mcreator.isekaireborn.IsekaiRebornMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IsekaiRebornModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, IsekaiRebornMod.MODID);
	public static final RegistryObject<EntityType<ChaosDragonEntity>> CHAOS_DRAGON = register("chaos_dragon",
			EntityType.Builder.<ChaosDragonEntity>of(ChaosDragonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChaosDragonEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SuccubuspartsEntity>> SUCCUBUSPARTS = register("succubusparts",
			EntityType.Builder.<SuccubuspartsEntity>of(SuccubuspartsEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SuccubuspartsEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SuccubusEntity>> SUCCUBUS = register("succubus",
			EntityType.Builder.<SuccubusEntity>of(SuccubusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SuccubusEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DireWolfAlphaEntity>> DIRE_WOLF_ALPHA = register("dire_wolf_alpha",
			EntityType.Builder.<DireWolfAlphaEntity>of(DireWolfAlphaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DireWolfAlphaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SubWolfEntity>> SUB_WOLF = register("sub_wolf",
			EntityType.Builder.<SubWolfEntity>of(SubWolfEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SubWolfEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GiantBoarEntity>> GIANT_BOAR = register("giant_boar",
			EntityType.Builder.<GiantBoarEntity>of(GiantBoarEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GiantBoarEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BoarlingEntity>> BOARLING = register("boarling",
			EntityType.Builder.<BoarlingEntity>of(BoarlingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BoarlingEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ChaosDragonEntity.init();
			SuccubuspartsEntity.init();
			SuccubusEntity.init();
			DireWolfAlphaEntity.init();
			SubWolfEntity.init();
			GiantBoarEntity.init();
			BoarlingEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CHAOS_DRAGON.get(), ChaosDragonEntity.createAttributes().build());
		event.put(SUCCUBUSPARTS.get(), SuccubuspartsEntity.createAttributes().build());
		event.put(SUCCUBUS.get(), SuccubusEntity.createAttributes().build());
		event.put(DIRE_WOLF_ALPHA.get(), DireWolfAlphaEntity.createAttributes().build());
		event.put(SUB_WOLF.get(), SubWolfEntity.createAttributes().build());
		event.put(GIANT_BOAR.get(), GiantBoarEntity.createAttributes().build());
		event.put(BOARLING.get(), BoarlingEntity.createAttributes().build());
	}
}
