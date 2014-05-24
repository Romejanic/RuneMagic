package com.web2201.testmod.item;

import com.web2201.testmod.reference.Names;
import com.web2201.testmod.reference.Textures;

import net.minecraft.item.Item;

public class ItemArcanicShard extends Item {
	
	public ItemArcanicShard(){
		super();
		this.setUnlocalizedName(Names.Items.ARCANIC_SHARD);
		this.setTextureName(Textures.Items.ARCANIC_SHARD);
	}

}
