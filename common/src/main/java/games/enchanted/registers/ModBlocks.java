package games.enchanted.registers;

import java.util.function.Supplier;

import dev.architectury.registry.registries.RegistrySupplier;
import games.enchanted.UltraVariants;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;

public class ModBlocks{
    private static RegistrySupplier<Block> register(String name, Supplier<Block> block, Item.Settings itemSettings) {
		// register block
		RegistrySupplier<Block> blockSupplied = UltraVariants.BLOCKS.register(name, block);
		// register block item
		UltraVariants.ITEMS.register(name, () -> new BlockItem(blockSupplied.get(), itemSettings));

		UltraVariants.ALL_BLOCKS.add(blockSupplied);

		return blockSupplied;
	}

    // register block
	public static final RegistrySupplier<Block> TEST_BLOCK = register(
		"test_block",
		() -> new Block(Block.Settings.copy(Blocks.STONE_BRICKS)),
		new Settings().maxCount(4)
	);


    public static void init(){}
}