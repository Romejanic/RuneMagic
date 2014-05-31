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
import com.web2201.runemagic.item.ItemInfusedMasterGem;
import com.web2201.runemagic.item.ItemMasterBinder;
import com.web2201.runemagic.item.ItemMasterBlade;
import com.web2201.runemagic.item.ItemMasterGem;
import com.web2201.runemagic.item.ItemMasterPickaxe;
import com.web2201.runemagic.item.ItemSoulCollector;
import com.web2201.runemagic.item.ItemArcanicCore;
import com.web2201.runemagic.item.ItemSoulShard;
import com.web2201.runemagic.reference.Names;
import com.web2201.runemagic.reference.Textures;
import com.web2201.runemagic.runes.RuneBinding;
import com.web2201.runemagic.runes.RuneWindwalker;
import com.web2201.runemagic.baubles.FireResistRing;
import com.web2201.runemagic.baubles.SoulPendant;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	
	//ID's
	public static int MasterBladeID = 3250;
	public static int MasterGemID = 3251;
	public static int InfusedMasterGemID = 3252;
	public static int MasterHelmID = 3253;
	public static int MasterChestplateID = 3254;
	public static int MasterLegID = 3255;
	public static int MasterBootID = 3256;
	public static int SoulCoreID = 3257;
	public static int SoulShardID = 3258;
	public static int MasterBinderID = 3259;
	public static int SoulCollectorID = 3260;
	public static int MasterPickaxeID = 3261;
	public static int RuneBindingID = 3262;
	public static int GoldGlazeID = 3263;
	
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
		MasterBlade = new ItemMasterBlade(MasterBladeID, Arcan).setCreativeTab(RuneMagic.arcanaTab);
		MasterGem = new ItemMasterGem(MasterGemID).setCreativeTab(RuneMagic.arcanaTab);
		InfusedMasterGem = new ItemInfusedMasterGem(InfusedMasterGemID).setCreativeTab(RuneMagic.arcanaTab);
	    SoulCore = new ItemArcanicCore(SoulCoreID).setCreativeTab(RuneMagic.arcanaTab);
		SoulShard = new ItemSoulShard(SoulShardID).setCreativeTab(RuneMagic.arcanaTab);
		MasterBinder = new ItemMasterBinder(MasterBinderID).setCreativeTab(RuneMagic.arcanaTab);
		SoulCollector = new ItemSoulCollector(SoulCollectorID).setCreativeTab(RuneMagic.arcanaTab);
		MasterPickaxe = new ItemMasterPickaxe(MasterPickaxeID, ArcanTool).setCreativeTab(RuneMagic.arcanaTab);
		GoldGlaze = new ItemGoldGlaze(GoldGlazeID);
		
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
		GameRegistry.registerItem(GoldGlaze, "GoldGlaze");
		
		GameRegistry.registerItem(RuneBinding, "RuneBinding");
		GameRegistry.registerItem(RuneWindwalker, "RuneWindwalker");
		
		GameRegistry.registerItem(FireResistRing, "FireResistRing");
		
		
		GameRegistry.addShapedRecipe(
				new ItemStack(ModItems.FireResistRing), new Object[] {
					"III", 
					"IPI", 
					"III", 
					Character.valueOf('I'), new ItemStack(Items.iron_ingot), 
					Character.valueOf('P'), new ItemStack(Items.potionitem,1,8227)});
	}
	
	
	

}


