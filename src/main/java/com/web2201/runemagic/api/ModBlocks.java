package com.web2201.runemagic.api;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

import com.web2201.runemagic.RuneMagic;
import com.web2201.runemagic.block.BlockArcanicBrick;
import com.web2201.runemagic.block.BlockArcanicStone;
import com.web2201.runemagic.block.BlockRuneInfuser;
import com.web2201.runemagic.reference.Names;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block BloodStone;
	public static Block BloodBrick;
	public static Block RuneInfuserIdle;
	public static Block RuneInfuserActive;
	
	public static void preInit(){
		
		BloodStone = new BlockArcanicStone().setCreativeTab(RuneMagic.arcanaTab);
		BloodBrick = new BlockArcanicBrick().setCreativeTab(RuneMagic.arcanaTab);
		
		RuneInfuserIdle = new BlockRuneInfuser(false).setBlockName(Names.Blocks.RUNE_INFUSER_IDLE).setCreativeTab(RuneMagic.arcanaTab);
		RuneInfuserActive = new BlockRuneInfuser(true).setBlockName(Names.Blocks.RUNE_INFUSER_ACTIVE).setLightLevel(0.625F);
	}
	
	public static void GameRegistry(){
		
		GameRegistry.registerBlock(BloodStone, "ArcanicStone");
		GameRegistry.registerBlock(BloodBrick, "ArcanicBrick");
		GameRegistry.registerBlock(RuneInfuserIdle, "RuneInfuserIdle");
		GameRegistry.registerBlock(RuneInfuserActive, "RuneInfuserActive");
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.BloodBrick, 4), "XX", "XX", 'X', ModBlocks.BloodStone);
	}

}
