package ve.MonK.items;

import ve.MonK.Main.VanillaEnhanced;
import ve.MonK.lib.ItemNames;
import ve.MonK.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class pickHeadIronItem extends Item {
	
	public pickHeadIronItem(int id) {
        super(id);
        
        this.setCreativeTab(VanillaEnhanced.vanillaenhanced);
        this.setUnlocalizedName(ItemNames.pickHeadIronItem_unlocalizedName);
        
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) {
        itemIcon = icon.registerIcon(Reference.ID.toLowerCase() + ":" + ItemNames.pickHeadIronItem_unlocalizedName);
        
    }

}
