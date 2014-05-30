package com.web2201.runemagic.block.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.web2201.runemagic.block.tileentity.TransformationFurnaceTileEntity;

import cpw.mods.fml.common.network.IGuiHandler;

public class TransformationFurnaceGuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		switch(ID){
		case 0:
			if(entity != null && entity instanceof TransformationFurnaceTileEntity){
				return new TransformationFurnaceContainer(player.inventory, (TransformationFurnaceTileEntity) entity);
			}else{
				return null;
			}
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		switch(ID){
		case 0:
			if(entity != null && entity instanceof TransformationFurnaceTileEntity){
				return new TransformationFurnaceGui(player.inventory, (TransformationFurnaceTileEntity) entity);
				
			
		}
		}
		
		return null;
	}

}
