package com.web2201.runemagic.entity;

import net.minecraft.entity.EntityList;

import com.web2201.runemagic.RuneMagic;
import com.web2201.runemagic.reference.Names;

import cpw.mods.fml.common.registry.EntityRegistry;

public class RMEntity {
	public static void MainRegistry(){
		registerEntity();
	}
	
	public static void registerEntity(){
		createEntity(EntityWanderingSoul.class, Names.Mobs.SOUL_MOB, 0x2A2A2A, 0x5DD2EF);
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColour, int spotColour){
		int randomID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomID);
		EntityRegistry.registerModEntity(entityClass, entityName, randomID, RuneMagic.modInstance, 64, 1, true);
		createEgg(randomID, solidColour, spotColour);
	}

	private static void createEgg(int randomID, int solidColour, int spotColour) {
		EntityList.entityEggs.put(Integer.valueOf(randomID), new EntityList.EntityEggInfo(randomID, solidColour, spotColour));
	}
}
