package net.mcreator.isekaireborn.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.isekaireborn.entity.SubWolfEntity;

import java.util.List;
import java.util.Comparator;

public class DireWolfAlphaOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		Entity enemy = null;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof SubWolfEntity) {
			if (entity instanceof Mob) {
				try {
					((Mob) entity).setTarget(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		enemy = entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null;
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof SubWolfEntity) {
					if (entityiterator instanceof Mob _entity && enemy instanceof LivingEntity _ent)
						_entity.setTarget(_ent);
				}
			}
		}
	}
}
