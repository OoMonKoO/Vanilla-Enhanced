package ve.MonK.lib;

import ve.MonK.items.Items;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	public static void init() {
		
		// SHAPED //
		
		GameRegistry.addRecipe(new ItemStack(Items.breadDoughItem), new Object[] {
            "   ","was","   ",
            'w', Items.flourItem, 'a', Item.bucketWater, 's', Item.sugar });
		
		
		GameRegistry.addRecipe(new ItemStack(Items.flourItem, 3), new Object[] {
			"sss","www","www",
			's', Block.stone, 'w', Item.wheat });
		
		
		GameRegistry.addRecipe(new ItemStack(Items.axeHeadStoneItem), new Object[] {
			"sss","s  ","   ",
			's', Block.stone});
		
		
		GameRegistry.addRecipe(new ItemStack(Items.axeHeadIronItem), new Object[] {
			" ii", "  i", "   ",
			'i', Item.ingotIron});
		
		
		GameRegistry.addRecipe(new ItemStack(Items.pickHeadStoneItem), new Object[] {
			"sss", "  s", "  s",
			's', Block.stone});
		
		
		GameRegistry.addRecipe(new ItemStack(Items.pickHeadIronItem), new Object[] {
			"ppp", "  p", "  p",
			'p', Item.ingotIron});
		
		
		GameRegistry.addRecipe(new ItemStack(Items.shovelHeadWoodItem), new Object[] {
			" ww", "  w", "   ",
			'w', Block.wood});
		
		
		GameRegistry.addRecipe(new ItemStack(Items.shovelHeadStoneItem), new Object[] {
			" ss", "  s", "   ",
			's', Block.stone});
		
		
		GameRegistry.addRecipe(new ItemStack(Items.shovelHeadIronItem), new Object[] {
			" ii", "  i", "   ",
			'i', Item.ingotIron});
		
		
		GameRegistry.addRecipe(new ItemStack(Items.toolHandleItem), new Object[] {
			" s ", " s ", " s ",
			's', Item.stick});
		
		
		GameRegistry.addRecipe(new ItemStack(Item.axeStone), new Object[] {
			"  t"," h ","h  ",
			't', Items.axeHeadStoneItem, 'h', Items.toolHandleItem});
		
		
		GameRegistry.addRecipe(new ItemStack(Item.axeIron), new Object[] {
			"  r", " h ", "  h",
			'r', Items.axeHeadIronItem, 'h', Items.toolHandleItem});
		
		
		GameRegistry.addRecipe(new ItemStack(Items.toolPickFlintItem), new Object[] {
			" ff", " hf", "h  ",
			'c', Block.cobblestone, 'h', Items.toolHandleItem, 'f', Item.flint});
		
		
		GameRegistry.addRecipe(new ItemStack(Item.pickaxeStone), new Object[] {
			"  p", " h ", "h  ",
			'p', Items.pickHeadStoneItem, 'h', Items.toolHandleItem});
		
		
		GameRegistry.addRecipe(new ItemStack(Item.pickaxeIron), new Object[] {
			"  p", " h ", "h  ",
			'p', Items.pickHeadIronItem, 'h', Items.toolHandleItem});
		
		
		GameRegistry.addRecipe(new ItemStack(Item.shovelWood), new Object[] {
			"  w", " h ", "h  ",
			'w', Items.shovelHeadWoodItem, 'h', Items.toolHandleItem});
		
		
		GameRegistry.addRecipe(new ItemStack(Item.shovelStone), new Object[] {
			"  s", " h ", "h  ",
			's', Items.shovelHeadStoneItem, 'h', Items.toolHandleItem});
		
		
		GameRegistry.addRecipe(new ItemStack(Item.shovelIron), new Object[] {
			"  s", " h ", "h  ",
			's', Items.shovelHeadIronItem, 'h', Items.toolHandleItem});
		
		/** HANDSAW **/
		
		for(int i = 0; i < Items.toolSawItem.getMaxDamage(); i++){
		GameRegistry.addRecipe(new ItemStack(Block.planks,2,0), new Object[] {
			"h  ", "w  ", "   ", 'w', new ItemStack(Block.wood,1,0) , 'h', new ItemStack(Items.toolSawItem,1, i-1)});}
		
		for(int i = 0; i < Items.toolSawItem.getMaxDamage(); i++){
			GameRegistry.addRecipe(new ItemStack(Block.planks,2,1), new Object[] {
				"h  ", "w  ", "   ", 'w', new ItemStack(Block.wood,1,1) , 'h', new ItemStack(Items.toolSawItem,1, i-1)});}
		
		for(int i = 0; i < Items.toolSawItem.getMaxDamage(); i++){
			GameRegistry.addRecipe(new ItemStack(Block.planks,2,2), new Object[] {
				"h  ", "w  ", "   ", 'w', new ItemStack(Block.wood,1,2) , 'h', new ItemStack(Items.toolSawItem,1, i-1)});}
		
		for(int i = 0; i < Items.toolSawItem.getMaxDamage(); i++){
			GameRegistry.addRecipe(new ItemStack(Block.planks,2,3), new Object[] {
				"h  ", "w  ", "   ", 'w', new ItemStack(Block.wood,1,3) , 'h', new ItemStack(Items.toolSawItem,1, i-1)});}
		
		
		
		
		
		
			
	// FURNACE //
	{
		FurnaceRecipes.smelting().addSmelting(Items.breadDoughItem.itemID , new ItemStack(Item.bread), 0.1F);
		FurnaceRecipes.smelting().addSmelting(Item.reed.itemID, new ItemStack(Item.sugar), 0.1F);}
	}
}

		
	


