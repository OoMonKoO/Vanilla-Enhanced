package ve.MonK.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import ve.MonK.lib.ItemIDs;
import ve.MonK.lib.ItemNames;

public class Items {
	
	public static Item breadDoughItem;
	public static Item flourItem;
	public static Item axeHeadStoneItem;
	public static Item axeHeadIronItem;
	public static Item toolHandleItem;
	public static Item toolPickFlintItem;
	public static Item pickHeadStoneItem;
	public static Item pickHeadIronItem;
	public static Item shovelHeadStoneItem;
	public static Item shovelHeadWoodItem;

	
	
	public static void init() {
		
		breadDoughItem = new breadDoughItem(ItemIDs.breadDoughItem_ID);
		flourItem = new flourItem(ItemIDs.flourItem_ID);
		axeHeadStoneItem = new axeHeadStoneItem(ItemIDs.axeHeadStoneItem_ID);
		axeHeadIronItem = new axeHeadIronItem(ItemIDs.axeHeadIronItem_ID);
		toolHandleItem = new toolHandleItem(ItemIDs.toolHandleItem_ID);
		toolPickFlintItem = new toolPickFlintItem(ItemIDs.toolPickFlintItem_ID, EnumToolMaterial.GOLD);
		pickHeadStoneItem = new pickHeadStoneItem(ItemIDs.pickHeadStoneItem_ID);
		pickHeadIronItem = new pickHeadIronItem(ItemIDs.pickHeadIronItem_ID);
		shovelHeadStoneItem = new shovelHeadStoneItem(ItemIDs.shovelHeadStoneItem_ID);
		shovelHeadWoodItem = new shovelHeadWoodItem(ItemIDs.shovelHeadWoodItem_ID);
		
		
		
	}

	
	
	
	
	public static void addNames() {
		
		LanguageRegistry.addName(breadDoughItem,  ItemNames.breadDoughItem_name);
		LanguageRegistry.addName(flourItem, ItemNames.flourItem_name);
		LanguageRegistry.addName(axeHeadStoneItem, ItemNames.axeHeadStoneItem_name);
		LanguageRegistry.addName(axeHeadIronItem, ItemNames.axeHeadIronItem_name);
		LanguageRegistry.addName(toolHandleItem, ItemNames.toolHandleItem_name);
		LanguageRegistry.addName(toolPickFlintItem, ItemNames.toolPickFlintItem_name);
		LanguageRegistry.addName(pickHeadStoneItem, ItemNames.pickHeadStoneItem_name);
		LanguageRegistry.addName(pickHeadIronItem, ItemNames.pickHeadIronItem_name);
		LanguageRegistry.addName(shovelHeadStoneItem, ItemNames.shovelHeadStoneItem_name);
		LanguageRegistry.addName(shovelHeadWoodItem, ItemNames.shovelHeadWoodItem_name);
		
	}

}
