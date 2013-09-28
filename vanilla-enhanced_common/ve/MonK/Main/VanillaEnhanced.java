package ve.MonK.Main;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import ve.MonK.blocks.Blocks;
import ve.MonK.items.Items;
import ve.MonK.lib.ConfigurationHandler;
import ve.MonK.lib.Recipes;
import ve.MonK.lib.Reference;
import ve.MonK.lib.RemoveHandler;
import ve.MonK.lib.vanillaenhancedTab;
import ve.MonK.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

	@Mod( modid = Reference.ID, name = Reference.NAME, version = Reference.VERSION)
	@NetworkMod( channels = {Reference.CHANNEL}, clientSideRequired = true, serverSideRequired = true )

public class VanillaEnhanced {
	
	@SidedProxy( clientSide = Reference.PROXY_LOCATION + ".ClientProxy", serverSide = Reference.PROXY_LOCATION + ".CommonProxy")
    public static CommonProxy proxy;
	public static CreativeTabs vanillaenhanced = new vanillaenhancedTab(CreativeTabs.getNextID(), Reference.NAME);
	
	
	@EventHandler
    public static void load ( FMLPreInitializationEvent event ) {
		ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.ID + File.separator + Reference.ID + ".cfg"));
		proxy.initRenderers();
        proxy.initSounds();
        Items.init();
        Blocks.init();
	
	}
	
	@EventHandler
    public static void load ( FMLInitializationEvent event ) {
		RemoveHandler.init();
		Recipes.init();
        LanguageRegistry.instance().addStringLocalization("itemGroup." + Reference.NAME, "en_US", Reference.NAME);        
        Items.addNames();
        Blocks.addNames();
        MinecraftForge.setToolClass(Items.toolPickFlintItem, "pickaxe", 0);
	
	}
	
	
	
	@EventHandler
    public static void load ( FMLPostInitializationEvent event ) {
	
		
	}
}
	
	
	
