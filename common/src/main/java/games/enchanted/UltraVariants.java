package games.enchanted;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.base.Suppliers;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registries;
import dev.architectury.registry.registries.RegistrySupplier;
import games.enchanted.registers.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;

public class UltraVariants {
    
    public static final String MOD_ID = "ultravariants";
    public static final String loggerID = "[" + MOD_ID + "] ";

    // mod name
    public static final String modName = "Ultra Variants";
	public static final Logger LOGGER = LogManager.getLogger(modName);

    public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));

    // registries
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registry.BLOCK_KEY);
	public static final Set<RegistrySupplier<Block>> ALL_BLOCKS = new HashSet<>();
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_KEY);


    public static void init() {
        ModBlocks.init();

		BLOCKS.register();
		ITEMS.register();


        // System.out.println(ExampleExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
