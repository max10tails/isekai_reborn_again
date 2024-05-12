package net.mcreator.isekaireborn.procedures;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.isekaireborn.entity.SubWolfEntity;
import net.mcreator.isekaireborn.entity.DireWolfAlphaEntity;

public class SubWolfOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof DireWolfAlphaEntity || (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof SubWolfEntity) {
			if (entity instanceof Mob) {
				try {
					((Mob) entity).setTarget(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
