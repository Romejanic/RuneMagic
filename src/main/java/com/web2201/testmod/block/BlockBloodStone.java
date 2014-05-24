package com.web2201.testmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.web2201.testmod.reference.Names;
import com.web2201.testmod.reference.Textures;

public class BlockBloodStone extends Block {

	public BlockBloodStone() {
		super(Material.ground);
		this.setBlockTextureName(Textures.Blocks.ARCANIC_STONE);
		this.setBlockName(Names.Blocks.BLOOD_STONE);
		this.setHardness(0.2F);
		
	
		
		
	}

		
}
	

