package com.web2201.runemagic.api;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.web2201.runemagic.RuneMagic;
import com.web2201.runemagic.armor.ItemArcanicArmor;
import com.web2201.runemagic.item.ItemInfusedMasterGem;
import com.web2201.runemagic.item.ItemMasterBinder;
import com.web2201.runemagic.item.ItemMasterBlade;
import com.web2201.runemagic.item.ItemMasterGem;
import com.web2201.runemagic.item.ItemMasterPickaxe;
import com.web2201.runemagic.item.ItemSoulCollector;
import com.web2201.runemagic.item.ItemSoulCore;
import com.web2201.runemagic.item.ItemSoulShard;
import com.web2201.runemagic.reference.Textures;
import com.web2201.runemagic.runes.RuneBinding;

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
	
	
	
	//Runes
	
	public static Item RuneBinding;
	

	

	
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
		
		MasterBlade = new ItemMasterBlade(Arcan).setCreativeTab(RuneMagic.arcanaTab).setTextureName(Textures.Items.MASTER_BLADE).setUnlocalizedName("ItemMasterBlade");
		MasterGem = new ItemMasterGem().setCreativeTab(RuneMagic.arcanaTab).setUnlocalizedName("ItemMasterGem").setTextureName(Textures.Items.MASTER_GEM);
		InfusedMasterGem = new ItemInfusedMasterGem().setCreativeTab(RuneMagic.arcanaTab).setUnlocalizedName("ItemInfusedMasterGem").setTextureName(Textures.Items.INFUSED_MASTER_GEM);
		MasterHelm = new ItemArcanicArmor(ArcanArmor, AA1, 0).setUnlocalizedName("ItemMasterHelm").setCreativeTab(RuneMagic.arcanaTab).setTextureName(Textures.Items.MASTER_HELM);
		MasterChestplate = new ItemArcanicArmor(ArcanArmor, AA2, 1).setUnlocalizedName("ItemMasterChestplate").setCreativeTab(RuneMagic.arcanaTab).setTextureName(Textures.Items.MASTER_CHESTPLATE);
		MasterLeg = new ItemArcanicArmor(ArcanArmor, AA3, 2).setUnlocalizedName("ItemMasterLeg").setCreativeTab(RuneMagic.arcanaTab).setTextureName(Textures.Items.MASTER_LEG);
		MasterBoot = new ItemArcanicArmor(ArcanArmor, AA4, 3).setUnlocalizedName("ItemMasterBoot").setCreativeTab(RuneMagic.arcanaTab).setTextureName(Textures.Items.MASTER_BOOT);
	    SoulCore = new ItemSoulCore().setUnlocalizedName("ItemArcanicCore").setCreativeTab(RuneMagic.arcanaTab).setTextureName(Textures.Items.ARCANIC_CORE);
		SoulShard = new ItemSoulShard().setUnlocalizedName("ItemArcanicShard").setCreativeTab(RuneMagic.arcanaTab).setTextureName(Textures.Items.ARCANIC_SHARD);
		MasterBinder = new ItemMasterBinder().setUnlocalizedName("ItemMasterBinder").setCreativeTab(RuneMagic.arcanaTab).setTextureName(Textures.Items.ARCANIC_BINDER);
		SoulCollector = new ItemSoulCollector(1).setUnlocalizedName("ItemSoulCollector").setCreativeTab(RuneMagic.arcanaTab);
		MasterPickaxe = new ItemMasterPickaxe(ArcanTool).setCreativeTab(RuneMagic.arcanaTab).setUnlocalizedName("ItemMasterPickaxe").setTextureName(Textures.Items.MASTER_PICKAXE);
		
		RuneBinding = new RuneBinding().setCreativeTab(RuneMagic.arcanaTab).setUnlocalizedName("RuneBinding").setTextureName(Textures.Items.RUNE_BINDING);
		

	}
	
	public static void GameRegistry()
	{
		
		GameRegistry.registerItem(MasterBinder, "ArcanicBinder");
		GameRegistry.registerItem(SoulCore, "ArcanicCore");
		GameRegistry.registerItem(SoulShard, "ArcanicShard");
		GameRegistry.registerItem(MasterBlade, "MasterBlade");
		GameRegistry.registerItem(MasterGem, "MasterGem");
		GameRegistry.registerItem(InfusedMasterGem, "InfusedMasterGem");
		GameRegistry.registerItem(SoulCollector, "SoulCollector");
		GameRegistry.registerItem(MasterHelm, "MasterHelm");
		GameRegistry.registerItem(MasterChestplate, "MasterChestplate");
		GameRegistry.registerItem(MasterLeg, "MasterLeg");
		GameRegistry.registerItem(MasterBoot, "MasterBoot");
		GameRegistry.registerItem(MasterPickaxe, "MasterPickaxe");
		
		GameRegistry.registerItem(RuneBinding, "RuneBinding");
		
		
		
		
		
	}
	
	
	

}


