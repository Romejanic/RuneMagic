package com.web2201.runemagic.item;

import net.minecraft.item.Item;

import com.web2201.runemagic.reference.Names;
import com.web2201.runemagic.reference.Textures;

public class ItemArcanicCore extends Item {
	
	public ItemArcanicCore(int ID){
		super();
		this.setUnlocalizedName(Names.Items.ARCANIC_CORE);
		this.setTextureName(Textures.Items.ARCANIC_CORE);
	}

}
