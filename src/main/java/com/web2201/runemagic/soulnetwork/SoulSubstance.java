package com.web2201.runemagic.soulnetwork;

import net.minecraft.nbt.NBTTagCompound;

public class SoulSubstance extends net.minecraft.world.WorldSavedData {

	public int initSoulSubstance;
	
	public SoulSubstance(String par1Str) {
		super(par1Str);
		initSoulSubstance = 0;
	}
	

	@Override
	public void readFromNBT(NBTTagCompound nbttagcompound) {
		
		initSoulSubstance = nbttagcompound.getInteger("initSoulSubstance");

		
	}

	@Override
	public void writeToNBT(NBTTagCompound nbttagcompound) {
		
		nbttagcompound.setInteger("initSoulSubstance", initSoulSubstance);
		
		
	}

}
