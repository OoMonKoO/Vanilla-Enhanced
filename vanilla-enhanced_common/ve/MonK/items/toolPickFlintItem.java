package ve.MonK.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import ve.MonK.Main.VanillaEnhanced;
import ve.MonK.lib.ItemNames;
import ve.MonK.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class toolPickFlintItem extends ItemPickaxe {
		
	public toolPickFlintItem(int id, EnumToolMaterial par2EnumToolMaterial) {
        super(id, par2EnumToolMaterial);
        this.setUnlocalizedName(ItemNames.toolPickFlintItem_unlocalizedName);
        this.setCreativeTab(VanillaEnhanced.vanillaenhanced);
        this.setMaxStackSize(1); 
        this.setMaxDamage(22);
  
    }

        
    
 @Override
     @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) {
        itemIcon = icon.registerIcon(Reference.ID.toLowerCase() + ":" + ItemNames.toolPickFlintItem_unlocalizedName); }

}
