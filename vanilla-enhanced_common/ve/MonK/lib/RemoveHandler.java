package ve.MonK.lib;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

public class RemoveHandler {

	public static void init() {
		
	
	Collection<Item> removeSet = new HashSet();
	Collections.addAll(removeSet,
	new Item[] {
			
	 Item.bread, Item.sugar, Item.axeWood, Item.pickaxeWood, Item.shovelWood, Item.hoeWood, 
	 Item.axeStone, Item.axeIron, Item.axeGold, Item.hoeGold, Item.pickaxeStone, Item.pickaxeGold,
	 Item.pickaxeIron, Item.shovelIron, Item.hoeIron, Item.shovelStone
	 
	 
	}
	);
	Iterator<IRecipe> iterator1 = CraftingManager.getInstance().getRecipeList().iterator();

	while (iterator1.hasNext())
	{
	IRecipe recipe = iterator1.next();
	if (recipe == null)
	continue;
	ItemStack output = recipe.getRecipeOutput();
	if (output != null && output.getItem() != null && removeSet.contains(output.getItem()))
	iterator1.remove();}
	
		}
	
}

	
	
	
	

