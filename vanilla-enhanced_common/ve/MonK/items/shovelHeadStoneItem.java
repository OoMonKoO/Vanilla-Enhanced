package ve.MonK.items;

import ve.MonK.Main.VanillaEnhanced;
import ve.MonK.lib.ItemNames;
import ve.MonK.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class shovelHeadStoneItem extends Item {
	
	public shovelHeadStoneItem(int id) {
        super(id);
        
        this.setCreativeTab(VanillaEnhanced.vanillaenhanced);
        this.setUnlocalizedName(ItemNames.shovelHeadStoneItem_unlocalizedName);
        
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) {
        itemIcon = icon.registerIcon(Reference.ID.toLowerCase() + ":" + ItemNames.shovelHeadStoneItem_unlocalizedName);
        
    }
}
