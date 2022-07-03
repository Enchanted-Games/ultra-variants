package games.enchanted.registers;

import com.google.common.base.Supplier;

import dev.architectury.registry.fuel.FuelRegistry;
import dev.architectury.registry.registries.RegistrySupplier;
import games.enchanted.UltraVariants;
import games.enchanted.properties.ItemProperties;
import net.minecraft.item.Item;

public class ModItems {
		// register item
    private static RegistrySupplier<Item> register(String name, Supplier<Item> item) {
		return UltraVariants.ITEMS.register(name, item);
	}
		// register fuel
		
    private static RegistrySupplier<Item> registerFuel(String name, Supplier<Item> item, Integer fuelValue) {
		// final ItemConvertible[] fuelItems = {item.get()};
        // FuelRegistry.register(fuelValue, fuelItems);

		// register item
		return UltraVariants.ITEMS.register(name, () -> {
			Item itemRegistered = item.get();
			FuelRegistry.register(fuelValue, itemRegistered);
			return itemRegistered;
		  });
	}

    // test item
	public static final RegistrySupplier<Item> TEST_ITEM = register(
		"test_item",
		() -> new Item(ItemProperties.GENERIC_ITEM)
	);
	
	// sticks
    public static RegistrySupplier<Item> SPRUCE_STICK = registerFuel("spruce_stick", () -> new Item(ItemProperties.GENERIC_ITEM), 100);
    public static RegistrySupplier<Item> BIRCH_STICK = registerFuel("birch_stick", () -> new Item(ItemProperties.GENERIC_ITEM), 100);
    public static RegistrySupplier<Item> JUNGLE_STICK = registerFuel("jungle_stick", () -> new Item(ItemProperties.GENERIC_ITEM), 100);
    public static RegistrySupplier<Item> ACACIA_STICK = registerFuel("acacia_stick", () -> new Item(ItemProperties.GENERIC_ITEM), 100);
    public static RegistrySupplier<Item> DARK_OAK_STICK = registerFuel("dark_oak_stick", () -> new Item(ItemProperties.GENERIC_ITEM), 100);
    public static RegistrySupplier<Item> MANGROVE_STICK = registerFuel("mangrove_stick", () -> new Item(ItemProperties.GENERIC_ITEM), 100);
	
    public static RegistrySupplier<Item> CRIMSON_STICK = register("crimson_stick", () -> new Item(ItemProperties.GENERIC_ITEM));
    public static RegistrySupplier<Item> WARPED_STICK = register("warped_stick", () -> new Item(ItemProperties.GENERIC_ITEM));

	// rods
    public static RegistrySupplier<Item> STONE_ROD = register("stone_rod", () -> new Item(ItemProperties.GENERIC_ITEM));
    public static RegistrySupplier<Item> BLACKSTONE_ROD = register("blackstone_rod", () -> new Item(ItemProperties.GENERIC_ITEM));
    public static RegistrySupplier<Item> DEEPSLATE_ROD = register("deepslate_rod", () -> new Item(ItemProperties.GENERIC_ITEM));

    public static void init(){}
}