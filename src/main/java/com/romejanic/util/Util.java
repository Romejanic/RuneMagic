package com.romejanic.util;

import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.EntityPlayer;

/**
* @author Romejanic
*/
public class ModUtilities {

  /**
  *
  * Grab a EntityPlayer instance on the server.
  *
  */
  public static EntityPlayer getPlayer(String username) {
  
      return MinecraftServer.getServer().getConfigurationManager().getPlayerForName(username);
  
  }

}
