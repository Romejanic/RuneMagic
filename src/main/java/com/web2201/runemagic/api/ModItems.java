package com.web2201.runemagic.api;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.web2201.runemagic.RuneMagic;
import com.web2201.runemagic.armor.ItemArcanicArmor;
import com.web2201.runemagic.item.ItemGoldGlaze;
import com.web2201.runemagic.item.ItemGoldString;
import com.web2201.runemagic.item.ItemInfusedMasterGem;
import com.web2201.runemagic.item.ItemMasterBinder;
import com.web2201.runemagic.item.ItemMasterBlade;
import com.web2201.runemagic.item.ItemMasterGem;
import com.web2201.runemagic.item.ItemMasterPickaxe;
import com.web2201.runemagic.item.ItemSoulCollector;
import com.web2201.runemagic.item.ItemArcanicCore;
import com.web2201.runemagic.item.ItemSoulFragment;
import com.web2201.runemagic.item.ItemSoulGem;
import com.web2201.runemagic.item.ItemSoulShard;
import com.web2201.runemagic.reference.Names;
import com.web2201.runemagic.reference.Textures;
import com.web2201.runemagic.runes.RuneBinding;
import com.web2201.runemagic.runes.RuneWindwalker;
import com.web2201.runemagic.baubles.FireResistRing;
import com.web2201.runemagic.baubles.SoulPendant;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	
	//Items
	
	public static Item SoulShard;
	public static Item SoulCore;
	public static Item MasterBinder;
	public static Item MasterBlade;
	public static Item MasterGem;
	public static Item MasterBow;
	public static Item InfusedMasterGem;
	public static Item SoulCollector;
	public static Item MasterPickaxe;
	public static Item GoldGlaze;
	public static Item SoulFragment;
	public static Item SoulGem;
	public static Item GoldString;
	
	
	//Runes
	
	public static Item RuneBinding;
	public static Item RuneWindwalker;
	
	
	
	//Baubles
	
	public static Item FireResistRing;
	public static Item SoulPendant;
	
	
	//Armor
	
	public static Item MasterHelm;
	public static Item MasterChestplate;
	public static Item MasterLeg;
	public static Item MasterBoot;
	
	
	//Materials
	//string, harvest, maxUses, efficiency, damage, enchantability 
	
	public static ToolMaterial Arcan = EnumHelper.addToolMaterial("Arcan", 5, 3000, 18.0F, 50, 40);
	public static ToolMaterial ArcanTool = EnumHelper.addToolMaterial("ArcanTool", 6, 4500, 30.0F, 5, 40);
	public static ArmorMaterial ArcanArmor = EnumHelper.addArmorMaterial("ArcanArmor", 40, new int[]{5, 10, 8, 5}, 40 );
	
	//Armor ID's
	
	private static int AA1;
	private static int AA2;
	private static int AA3;
	private static int AA4;
	
	
	
	public static void init() 
	{
		//Normal Items
		MasterBlade = new ItemMasterBlade(Arcan).setCreativeTab(RuneMagic.arcanaTab);
		MasterGem = new ItemMasterGem().setCreativeTab(RuneMagic.arcanaTab);
		InfusedMasterGem = new ItemInfusedMasterGem().setCreativeTab(RuneMagic.arcanaTab);
	    SoulCore = new ItemArcanicCore().setCreativeTab(RuneMagic.arcanaTab);
		SoulShard = new ItemSoulShard().setCreativeTab(RuneMagic.arcanaTab);
		MasterBinder = new ItemMasterBinder().setCreativeTab(RuneMagic.arcanaTab);
		SoulCollector = new ItemSoulCollector().setCreativeTab(RuneMagic.arcanaTab);
		MasterPickaxe = new ItemMasterPickaxe(ArcanTool).setCreativeTab(RuneMagic.arcanaTab);
		GoldGlaze = new ItemGoldGlaze().setCreativeTab(RuneMagic.arcanaTab);
		SoulFragment = new ItemSoulFragment().setCreativeTab(RuneMagic.arcanaTab);
		SoulGem = new ItemSoulGem().setCreativeTab(RuneMagic.arcanaTab);
		GoldString = new ItemGoldString().setCreativeTab(RuneMagic.arcanaTab);
		
		//Armor
		MasterHelm = new ItemArcanicArmor(ArcanArmor, AA1, 0).setUnlocalizedName(Names.Items.MASTER_HELM).setCreativeTab(RuneMagic.arcanaTab).setTextureName(Textures.Items.MASTER_HELM);
		MasterChestplate = new ItemArcanicArmor(ArcanArmor, AA2, 1).setUnlocalizedName(Names.Items.MASTER_CHESTPLATE).setCreativeTab(RuneMagic.arcanaTab).setTextureName(Textures.Items.MASTER_CHESTPLATE);
		MasterLeg = new ItemArcanicArmor(ArcanArmor, AA3, 2).setUnlocalizedName(Names.Items.MASTER_LEG).setCreativeTab(RuneMagic.arcanaTab).setTextureName(Textures.Items.MASTER_LEG);
		MasterBoot = new ItemArcanicArmor(ArcanArmor, AA4, 3).setUnlocalizedName(Names.Items.MASTER_BOOT).setCreativeTab(RuneMagic.arcanaTab).setTextureName(Textures.Items.MASTER_BOOT);
		
		//Runes and rune bindings
		RuneBinding = new RuneBinding().setCreativeTab(RuneMagic.arcanaTab);
		RuneWindwalker = new RuneWindwalker().setCreativeTab(RuneMagic.arcanaTab);
		
		//Baubles
		FireResistRing = new FireResistRing().setCreativeTab(RuneMagic.arcanaTab);
		SoulPendant = new SoulPendant().setCreativeTab(RuneMagic.arcanaTab);
		
	}
	
	public static void GameRegistry()
	{
		GameRegistry.registerItem(MasterBlade, "MasterBlade");
		GameRegistry.registerItem(SoulCollector, "SoulCollector");
		GameRegistry.registerItem(MasterHelm, "MasterHelm");
		GameRegistry.registerItem(MasterChestplate, "MasterChestplate");
		GameRegistry.registerItem(MasterLeg, "MasterLeg");
		GameRegistry.registerItem(MasterBoot, "MasterBoot");
		GameRegistry.registerItem(MasterPickaxe, "MasterPickaxe");
		
		GameRegistry.registerItem(GoldGlaze, "GoldGlaze");
		GameRegistry.registerItem(MasterGem, "MasterGem");
		GameRegistry.registerItem(InfusedMasterGem, "InfusedMasterGem");
		GameRegistry.registerItem(MasterBinder, "ArcanicBinder");
		GameRegistry.registerItem(SoulCore, "ArcanicCore");
		GameRegistry.registerItem(SoulShard, "ArcanicShard");
		GameRegistry.registerItem(SoulFragment, "SoulFrag");
		GameRegistry.registerItem(GoldString, "GoldString");
		GameRegistry.registerItem(SoulGem, "SoulGem");
		
		GameRegistry.registerItem(RuneBinding, "RuneBinding");
		GameRegistry.registerItem(RuneWindwalker, "RuneWindwalker");
		
		GameRegistry.registerItem(FireResistRing, "FireResistRing");
		GameRegistry.registerItem(SoulPendant, "SoulPendant");
		
		
		GameRegistry.addShapedRecipe(
				new ItemStack(ModItems.FireResistRing), new Object[] {
					"III", 
					"IPI", 
					"III", 
					Character.valueOf('I'), new ItemStack(Items.iron_ingot), 
					Character.valueOf('P'), new ItemStack(Items.potionitem,1,8227)});
		
		GameRegistry.addShapedRecipe(
				new ItemStack(ModItems.SoulFragment), new Object[] {
					"SSS",
					"SSS",
					"SSS",
					Character.valueOf('S'), new ItemStack(ModItems.SoulShard)});
		
		GameRegistry.addShapedRecipe(
				new ItemStack(ModItems.SoulGem), new Object[] {
					"FFF",
					"FFF",
					"FFF",
					Character.valueOf('F'), new ItemStack(ModItems.SoulFragment)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.GoldString), new Object[]{new ItemStack(Items.string), new ItemStack(Items.gold_nugget)});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.SoulPendant), new Object[]{
			"sSs",
			"S S",
			"GSs",
			Character.valueOf('S'), new ItemStack(ModItems.GoldString),
			Character.valueOf('G'), new ItemStack(ModItems.SoulGem),
			Character.valueOf('s'), new ItemStack(Items.string)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.GoldGlaze), new Object[]{new ItemStack(Items.potionitem/*plain water bottle*/), new ItemStack(Items.gold_nugget)});
	}
	
	
	
	

}


