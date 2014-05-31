package com.web2201.runemagic.item;

import com.web2201.runemagic.reference.Names;
import com.web2201.runemagic.reference.Textures;

import net.minecraft.item.Item;

public class ItemSoulShard extends Item {
	
	public ItemSoulShard(int ID){
		super();
		this.setUnlocalizedName(Names.Items.ARCANIC_SHARD);
		this.setTextureName(Textures.Items.ARCANIC_SHARD);
	}

}
