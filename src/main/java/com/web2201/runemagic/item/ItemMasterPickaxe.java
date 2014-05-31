package com.web2201.runemagic.item;

import com.web2201.runemagic.api.ModItems;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemMasterPickaxe extends ItemPickaxe {

	public ItemMasterPickaxe(int ID, ToolMaterial ArcanTool) {
		super(ArcanTool);
		this.setUnlocalizedName("ItemMasterPickaxe");
		this.bFull3D = true;
	}
	
	 public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	    {	
			 
	        return false;
	    } 
	 
	
}
