package com.web2201.runemagic.api;

import com.web2201.runemagic.RuneMagic;
import com.web2201.runemagic.block.BlockBloodBrick;
import com.web2201.runemagic.block.BlockBloodStone;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

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
