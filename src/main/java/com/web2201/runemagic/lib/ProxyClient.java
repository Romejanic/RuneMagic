package com.web2201.runemagic.lib;

import net.minecraft.client.model.ModelBiped;
import com.web2201.runemagic.entity.EntityWanderingSoul;
import com.web2201.runemagic.render.RenderWanderingSoul;

import cpw.mods.fml.client.registry.RenderingRegistry;


public class ProxyClient extends ProxyCommon {
	
	public void registerRenderInformation(){
		RenderingRegistry.registerEntityRenderingHandler(EntityWanderingSoul.class, new RenderWanderingSoul(new ModelBiped(), 0));
	}
			
}


