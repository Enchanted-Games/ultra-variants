package games.enchanted;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.base.Suppliers;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registries;
import dev.architectury.registry.registries.RegistrySupplier;
import games.enchanted.registers.ModBlocks;
import games.enchanted.registers.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;

public class UltraVariants {
    // mod name
    public static final String modName = "Ultra Variants";
    public static final String MOD_ID = "ultravariants";

    // set up logger
	public static final Logger LOGGER = LogManager.getLogger(modName);
    public static final String loggerID = "[" + MOD_ID + "] ";

    public static void logString(String string){
        LOGGER.info(loggerID + string);
    }

    // registries
    public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registry.BLOCK_KEY);
	public static final Set<RegistrySupplier<Block>> ALL_BLOCKS = new HashSet<>();
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_KEY);

    // creative tabs
    public static final ItemGroup MOD_ITEMS_GROUP = CreativeTabRegistry.create(new Identifier(MOD_ID, "items"),
            () -> new ItemStack(ModItems.TEST_ITEM.get()));
    public static final ItemGroup MOD_BLOCKS_GROUP = CreativeTabRegistry.create(new Identifier(MOD_ID, "blocks"),
            () -> new ItemStack(ModBlocks.SPRUCE_LADDER.get()));


    public static void init() {
        ModBlocks.init();
		BLOCKS.register();
        
        ModItems.init();
		ITEMS.register();
    }
}
