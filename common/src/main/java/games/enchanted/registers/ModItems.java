package games.enchanted.registers;

import com.google.common.base.Supplier;

import dev.architectury.registry.registries.RegistrySupplier;
import games.enchanted.UltraVariants;
import net.minecraft.item.Item;

public class ModItems {
    private static RegistrySupplier<Item> register(String name, Supplier<Item> item) {
		// register item
		return UltraVariants.ITEMS.register(name, item);
	}

    // register block
	public static final RegistrySupplier<Item> TEST_ITEM = register(
		"test_item",
		() -> new Item(new Item.Settings().maxCount(4))
	);


    public static void init(){}
}