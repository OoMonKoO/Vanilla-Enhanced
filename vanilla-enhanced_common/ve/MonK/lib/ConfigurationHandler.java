package ve.MonK.lib;

import java.io.File;
import java.util.logging.Level;
import cpw.mods.fml.common.FMLLog;
import net.minecraftforge.common.Configuration;

public class ConfigurationHandler {
	
	static Configuration config = new Configuration();
    public static void init(File file){
        
        config = new Configuration(file);
        
        try{
            
            config.load();
            
            ItemIDs.flourItem_ID = config.get(Configuration.CATEGORY_ITEM, ItemNames.flourItem_name, ItemIDs.flourItem_ID_DEFAULT).getInt(ItemIDs.flourItem_ID_DEFAULT);
            ItemIDs.breadDoughItem_ID = config.get(Configuration.CATEGORY_ITEM, ItemNames.breadDoughItem_name, ItemIDs.breadDoughItem_ID_DEFAULT).getInt(ItemIDs.breadDoughItem_ID_DEFAULT);
            ItemIDs.axeHeadStoneItem_ID = config.get(Configuration.CATEGORY_ITEM, ItemNames.axeHeadStoneItem_name, ItemIDs.axeHeadStoneItem_ID_DEFAULT).getInt(ItemIDs.axeHeadStoneItem_ID_DEFAULT);
            ItemIDs.toolHandleItem_ID = config.get(Configuration.CATEGORY_ITEM, ItemNames.toolHandleItem_name, ItemIDs.toolHandleItem_ID_DEFAULT).getInt(ItemIDs.toolHandleItem_ID_DEFAULT);
            ItemIDs.axeHeadIronItem_ID = config.get(Configuration.CATEGORY_ITEM, ItemNames.axeHeadIronItem_name, ItemIDs.axeHeadIronItem_ID_DEFAULT).getInt(ItemIDs.axeHeadIronItem_ID_DEFAULT);
	        ItemIDs.toolPickFlintItem_ID = config.get(Configuration.CATEGORY_ITEM, ItemNames.toolPickFlintItem_name, ItemIDs.toolPickFlintItem_ID_DEFAULT).getInt(ItemIDs.toolPickFlintItem_ID_DEFAULT);
            ItemIDs.pickHeadStoneItem_ID = config.get(Configuration.CATEGORY_ITEM, ItemNames.pickHeadStoneItem_name, ItemIDs.pickHeadStoneItem_ID_DEFAULT).getInt(ItemIDs.pickHeadStoneItem_ID_DEFAULT);
            ItemIDs.pickHeadIronItem_ID = config.get(Configuration.CATEGORY_ITEM, ItemNames.pickHeadIronItem_name, ItemIDs.pickHeadIronItem_ID_DEFAULT).getInt(ItemIDs.pickHeadIronItem_ID_DEFAULT);
            ItemIDs.shovelHeadStoneItem_ID = config.get(Configuration.CATEGORY_ITEM, ItemNames.shovelHeadStoneItem_name, ItemIDs.shovelHeadStoneItem_ID_DEFAULT).getInt(ItemIDs.shovelHeadStoneItem_ID_DEFAULT);
            ItemIDs.shovelHeadWoodItem_ID = config.get(Configuration.CATEGORY_ITEM, ItemNames.shovelHeadWoodItem_name, ItemIDs.shovelHeadWoodItem_ID_DEFAULT).getInt(ItemIDs.shovelHeadWoodItem_ID_DEFAULT);

            
            
            
            

}
catch(Exception e){
            
            FMLLog.log(Level.SEVERE, e, Reference.ID + " has trouble loading the config");
        }
        finally{
            
            config.save();
        }
        
    }
    
}
    