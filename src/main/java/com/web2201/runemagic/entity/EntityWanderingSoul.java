package com.web2201.runemagic.entity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import com.web2201.runemagic.api.ModItems;

public class EntityWanderingSoul extends EntityMob{

	public EntityWanderingSoul(World par1World) {
		super(par1World);
		this.setSize(1.0F, 1.9F);
		this.tasks.addTask(0, new EntityAIWander(this, 0.5D));
		this.tasks.addTask(2, new EntityAILookIdle(this));
		this.tasks.addTask(3, new EntityAISwimming(this));
		this.tasks.addTask(4, new EntityAITempt(this, 0.5D, Items.book, false));
		this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 20.0F));
	}
	
	public boolean isAIEnabled(){
		return true;
	}
	
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
	}
	
	protected Item getDropItem(){
		return ModItems.SoulShard;
	}

}
