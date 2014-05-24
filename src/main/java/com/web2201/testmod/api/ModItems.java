package com.web2201.testmod.api;

import com.web2201.testmod.TestMod;
import com.web2201.testmod.armor.ItemArcanicArmor;
import com.web2201.testmod.item.ItemInfusedMasterGem;
import com.web2201.testmod.item.ItemMasterBinder;
import com.web2201.testmod.item.ItemMasterBlade;
import com.web2201.testmod.item.ItemMasterGem;
import com.web2201.testmod.item.ItemSoulCollector;
import com.web2201.testmod.item.ItemSoulCore;
import com.web2201.testmod.item.ItemSoulShard;
import com.web2201.testmod.reference.Textures;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.init.Items;
import net.minecraftforge.common.util.EnumHelper;

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
	
	//Armor
	
	public static Item MasterHelm;
	public static Item MasterChestplate;
	public static Item MasterLeg;
	public static Item MasterBoot;
	
	//Materials
	
	public static ToolMaterial Arcan = EnumHelper.addToolMaterial("Arcan", 5, 3000, 12.0F, 10, 40);
	public static ArmorMaterial ArcanArmor = EnumHelper.addArmorMaterial("ArcanArmor", 40, new int[]{5, 10, 8, 5}, 40 );
	
	//Armor ID's
	
	private static int AA1;
	private static int AA2;
	private static int AA3;
	private static int AA4;
	
	
	
	public static void init() {
		
		MasterBlade = new ItemMasterBlade(Arcan).setCreativeTab(TestMod.arcanaTab).setTextureName(Textures.Items.MASTER_BLADE).setUnlocalizedName("ItemMasterBlade");
		MasterGem = new ItemMasterGem().setCreativeTab(TestMod.arcanaTab).setUnlocalizedName("ItemMasterGem").setTextureName(Textures.Items.MASTER_GEM);
		InfusedMasterGem = new ItemInfusedMasterGem().setCreativeTab(TestMod.arcanaTab).setUnlocalizedName("ItemInfusedMasterGem").setTextureName(Textures.Items.INFUSED_MASTER_GEM);
		MasterHelm = new ItemArcanicArmor(ArcanArmor, AA1, 0).setUnlocalizedName("ItemMasterHelm").setCreativeTab(TestMod.arcanaTab).setTextureName("testmod:MasterHelm");
		MasterChestplate = new ItemArcanicArmor(ArcanArmor, AA2, 1).setUnlocalizedName("ItemMasterChestplate").setCreativeTab(TestMod.arcanaTab).setTextureName("testmod:MasterChestplate");
		MasterLeg = new ItemArcanicArmor(ArcanArmor, AA3, 2).setUnlocalizedName("ItemMasterLeg").setCreativeTab(TestMod.arcanaTab).setTextureName("testmod:MasterLeg");
		MasterBoot = new ItemArcanicArmor(ArcanArmor, AA4, 3).setUnlocalizedName("ItemMasterBoot").setCreativeTab(TestMod.arcanaTab).setTextureName("testmod:MasterBoot");
	    SoulCore = new ItemSoulCore().setUnlocalizedName("ItemArcanicCore").setCreativeTab(TestMod.arcanaTab).setTextureName(Textures.Items.ARCANIC_CORE);
		SoulShard = new ItemSoulShard().setUnlocalizedName("ItemArcanicShard").setCreativeTab(TestMod.arcanaTab).setTextureName(Textures.Items.ARCANIC_SHARD);
		MasterBinder = new ItemMasterBinder().setUnlocalizedName("ItemMasterBinder").setCreativeTab(TestMod.arcanaTab).setTextureName(Textures.Items.ARCANIC_BINDER);
		SoulCollector = new ItemSoulCollector(1).setUnlocalizedName("ItemSoulCollector").setCreativeTab(TestMod.arcanaTab);
	}
	
	public static void GameRegistry(){
		
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
	}
	
	
	

}


