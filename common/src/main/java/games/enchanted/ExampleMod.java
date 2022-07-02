package games.enchanted;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;

public class ExampleMod {
    
    public static final String MOD_ID = "ultravariations";
    public static final String loggerID = "[" + MOD_ID + "] ";

    // mod name
    public static final String modName = "Ultra Ladders";
	public static final Logger LOGGER = LogManager.getLogger(modName);

    // registries
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registry.BLOCK_KEY);
	public static final Set<RegistrySupplier<Block>> ALL_BLOCKS = new HashSet<>();
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_KEY);

    // register block
	public static final RegistrySupplier<Block> MOSSY_STONE_CORNER_PILLAR = register("mossy_stone_corner_pillar", () -> new Block(Block.Settings.copy(Blocks.STONE_BRICKS)));

    // register block function
    protected static RegistrySupplier<Block> register(String name, Supplier<Block> block) {
		RegistrySupplier<Block> blockSupplied = BLOCKS.register(name, block);
		LOGGER.info("Registered " + name + " as a Block");

		ALL_BLOCKS.add(blockSupplied);

		return blockSupplied;
	}


    public static void init() {
		BLOCKS.register();
		ITEMS.register();

        System.out.println(ExampleExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
