package games.enchanted.properties;

import games.enchanted.UltraVariants;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemProperties {
    public static final Item.Settings GROUP_MISC = new Item.Settings().group(ItemGroup.MISC);
    
    public static final Item.Settings GENERIC_ITEM = new Item.Settings().group(UltraVariants.MOD_ITEMS_GROUP);
    
}
