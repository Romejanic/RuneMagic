package com.web2201.runemagic.item;

import com.web2201.runemagic.reference.Names;
import com.web2201.runemagic.reference.Textures;

import net.minecraft.item.Item;

public class ItemSoulShard extends Item {
	
	public ItemSoulShard(){
		super();
		this.setUnlocalizedName(Names.Items.SOUL_SHARD);
		this.setTextureName(Textures.Items.SOUL_SHARD);
	}

}
