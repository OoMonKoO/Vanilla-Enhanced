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

public class RemoveHandlerBlocks {
	public static void init() {
		
		Iterator<IRecipe> iterator = CraftingManager.getInstance().getRecipeList().iterator();

		while (iterator.hasNext())
		{
		        IRecipe recipe = iterator.next();
		        if (recipe == null)
		                continue;
		        ItemStack output = recipe.getRecipeOutput();
		        if (output != null && output.itemID == Block.planks.blockID)
		        	
		                iterator.remove();
		}
	}
	
	
		}

	

