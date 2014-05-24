package com.web2201.testmod.item;

import com.web2201.testmod.reference.Names;
import com.web2201.testmod.reference.Textures;

import net.minecraft.item.Item;

public class ItemSoulShard extends Item {
	
	public ItemSoulShard(){
		super();
		this.setUnlocalizedName(Names.Items.SOUL_SHARD);
		this.setTextureName(Textures.Items.ARCANIC_SHARD);
	}

}
