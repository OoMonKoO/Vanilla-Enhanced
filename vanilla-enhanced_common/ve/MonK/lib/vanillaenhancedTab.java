package ve.MonK.lib;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class vanillaenhancedTab extends CreativeTabs {
	
	public vanillaenhancedTab(int id, String name) {
        super(id, name);
    }

    @Override
    public int getTabIconItemIndex() {
        return Block.beacon.blockID;
        
    }

}
