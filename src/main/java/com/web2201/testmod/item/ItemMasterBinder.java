package com.web2201.testmod.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.web2201.testmod.reference.Names;
import com.web2201.testmod.reference.Textures;

public class ItemMasterBinder extends Item {
	
	public ItemMasterBinder(){
		super();
		this.setUnlocalizedName(Names.Items.MASTER_BINDER);
		this.setTextureName(Textures.Items.ARCANIC_BINDER);
		
	}
	
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack){
		
		return false;
	}

}
