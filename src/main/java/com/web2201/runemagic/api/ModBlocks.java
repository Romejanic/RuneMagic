package com.web2201.runemagic.api;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

import com.web2201.runemagic.RuneMagic;
import com.web2201.runemagic.block.BlockBloodBrick;
import com.web2201.runemagic.block.BlockBloodStone;
import com.web2201.runemagic.block.tileentity.TransformationFurnaceTileEntity;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block BloodStone;
	public static Block BloodBrick;	
	
	public static void preInit(){
		
		BloodStone = new BlockBloodStone().setCreativeTab(RuneMagic.arcanaTab);
		BloodBrick = new BlockBloodBrick().setCreativeTab(RuneMagic.arcanaTab);
	}
	
	public static void GameRegistry(){
		
		GameRegistry.registerBlock(BloodStone, "ArcanicStone");
		GameRegistry.registerBlock(BloodBrick, "ArcanicBrick");
		GameRegistry.addRecipe(new ItemStack(ModBlocks.BloodBrick, 4), "XX ", "XX ", "   ", 'X', ModBlocks.BloodStone);
	}

}
