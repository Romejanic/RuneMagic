package com.web2201.testmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.web2201.testmod.reference.Names;
import com.web2201.testmod.reference.Textures;

public class BlockArcanicBrick extends Block {

	public BlockArcanicBrick() {
		super(Material.ground);
		this.setBlockName(Names.Blocks.ARCANIC_BRICK);
		this.setBlockTextureName(Textures.Blocks.ARCANIC_BRICK);
		this.setHardness(0.2F);

	}

}
