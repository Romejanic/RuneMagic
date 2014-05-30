package com.web2201.runemagic.block.gui;

import java.io.IOException;

import org.lwjgl.opengl.GL11;

import com.web2201.runemagic.block.tileentity.TransformationFurnaceTileEntity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class TransformationFurnaceGui extends GuiContainer {
	
	public static final ResourceLocation texture = new ResourceLocation("runemagic:/textures/gui/TransformationFurnaceGui.png");

	public TransformationFurnaceGui(InventoryPlayer playerinv, TransformationFurnaceTileEntity tileentity) {
		super(new TransformationFurnaceContainer(playerinv, tileentity));
		
		 xSize = 300;
		 ySize = 200;
		
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2,
			int var3) {
		GL11.glColor4f(1F, 1F, 1F, 1F);
		try{
			Minecraft.getMinecraft().getResourceManager().getResource(texture);
		}catch (IOException e){
			System.out.println("Texture has not been loaded yet");
			
			e.printStackTrace();
			
		}
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
		
	}

}
