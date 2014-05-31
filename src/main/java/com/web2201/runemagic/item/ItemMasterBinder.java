package com.web2201.runemagic.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.web2201.runemagic.reference.Names;
import com.web2201.runemagic.reference.Textures;

public class ItemMasterBinder extends Item {
	
	public ItemMasterBinder(int ID){
		super();
		this.setUnlocalizedName(Names.Items.MASTER_BINDER);
		this.setTextureName(Textures.Items.MASTER_BINDER);
		
	}
	
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack){
		
		return false;
	}

}
