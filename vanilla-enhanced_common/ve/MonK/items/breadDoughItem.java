package ve.MonK.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import ve.MonK.Main.VanillaEnhanced;
import ve.MonK.lib.ItemNames;
import ve.MonK.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class breadDoughItem extends Item {

	public breadDoughItem(int id) {
        super(id);
        
        this.setCreativeTab(VanillaEnhanced.vanillaenhanced);
        this.setUnlocalizedName(ItemNames.breadDoughItem_unlocalizedName);
        
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) {
        itemIcon = icon.registerIcon(Reference.ID.toLowerCase() + ":" + ItemNames.breadDoughItem_unlocalizedName);
        
    }
}
