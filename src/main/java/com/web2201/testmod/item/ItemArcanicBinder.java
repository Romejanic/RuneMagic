package com.web2201.testmod.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.web2201.testmod.reference.Names;
import com.web2201.testmod.reference.Textures;

public class ItemArcanicBinder extends Item {
	
	public ItemArcanicBinder(){
		super();
		this.setUnlocalizedName(Names.Items.ARCANIC_BINDER);
		this.setTextureName(Textures.Items.ARCANIC_BINDER);
		
	}
	
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack){
		
		return false;
	}

}
