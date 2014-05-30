package com.web2201.runemagic.block.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

import com.web2201.runemagic.block.tileentity.TransformationFurnaceTileEntity;

public class TransformationFurnaceContainer extends Container {

	private TransformationFurnaceTileEntity TransformationFurnaceTileEntity;
	
	public TransformationFurnaceContainer(InventoryPlayer invPlayer, TransformationFurnaceTileEntity entity){
		
		this.TransformationFurnaceTileEntity = entity;
	}
		
	
	
	@Override
	public boolean canInteractWith(EntityPlayer var1) {
		
		return TransformationFurnaceTileEntity.isUseableByPlayer(var1);
	}

}
