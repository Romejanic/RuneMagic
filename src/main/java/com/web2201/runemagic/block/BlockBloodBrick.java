package com.web2201.runemagic.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.web2201.runemagic.reference.Names;
import com.web2201.runemagic.reference.Textures;

public class BlockBloodBrick extends Block {

	public BlockBloodBrick() {
		super(Material.ground);
		this.setBlockName(Names.Blocks.BLOOD_BRICK);
		this.setBlockTextureName(Textures.Blocks.ARCANIC_BRICK);
		this.setHardness(0.2F);

	}

}
