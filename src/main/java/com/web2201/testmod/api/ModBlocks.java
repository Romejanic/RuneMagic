package com.web2201.testmod.api;

import com.web2201.testmod.TestMod;
import com.web2201.testmod.block.BlockBloodBrick;
import com.web2201.testmod.block.BlockBloodStone;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class ModBlocks {
	
	public static Block BloodStone;
	public static Block BloodBrick;
	
	
	public static void preInit(){
		
		BloodStone = new BlockBloodStone().setCreativeTab(TestMod.arcanaTab);
		BloodBrick = new BlockBloodBrick().setCreativeTab(TestMod.arcanaTab);
		
	
	}
	
	public static void GameRegistry(){
		
		GameRegistry.registerBlock(BloodStone, "ArcanicStone");
		GameRegistry.registerBlock(BloodBrick, "ArcanicBrick");
		GameRegistry.addRecipe(new ItemStack(ModBlocks.BloodBrick, 4), "XX ", "XX ", "   ", 'X', ModBlocks.BloodStone);
	}

}
