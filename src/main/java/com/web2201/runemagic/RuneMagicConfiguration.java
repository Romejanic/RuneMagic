package com.web2201.runemagic;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class RuneMagicConfiguration extends Configuration {
	
	public static Configuration config;
	
	public static void init(File file)
	{
		
		config = new Configuration(file);
		
		try
		{
			
			config.load();
		}
		finally
		{
			
			config.save();
		}
	}
	
	public static void set(String categoryName, String propertyName, String newValue)
	{
		config.load();
		if (config.getCategoryNames().contains(categoryName))
		{
			if (config.getCategory(categoryName).containsKey(propertyName))
			{
				config.getCategory(categoryName).get(propertyName).set(newValue);
			}
		}
		
		config.save();
		
	}
		
		
	}


