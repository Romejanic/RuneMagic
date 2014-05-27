package com.web2201.runemagic.item;

import net.minecraft.item.Item;

import com.web2201.runemagic.reference.Names;
import com.web2201.runemagic.reference.Textures;

public class ItemSoulCore extends Item {
	
	public ItemSoulCore(){
		super();
		this.setUnlocalizedName(Names.Items.SOUL_CORE);
		this.setTextureName(Textures.Items.ARCANIC_CORE);
	}

}