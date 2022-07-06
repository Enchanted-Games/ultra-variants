package games.enchanted.registers;

import java.util.function.Supplier;

import dev.architectury.registry.registries.RegistrySupplier;
import games.enchanted.UltraVariants;
import games.enchanted.properties.BlockProperties;
import net.minecraft.block.Block;
import net.minecraft.block.LadderBlock;
import net.minecraft.block.LeverBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

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
		() -> new Block(BlockProperties.EXAMPLE_METAL),
		BlockProperties.GENERIC_BLOCK_ITEM
	);

    public static final RegistrySupplier<Block> SPRUCE_LADDER = register("spruce_ladder", () -> new LadderBlock(BlockProperties.LADDER_BLOCK), BlockProperties.GENERIC_BLOCK_ITEM);
    public static final RegistrySupplier<Block> STONE_CLIMBING_PEBBLES = register("stone_climbing_pebbles", () -> new LadderBlock(BlockProperties.STONE_LADDER_BLOCK), BlockProperties.GENERIC_BLOCK_ITEM);
	
    public static final RegistrySupplier<Block> SPRUCE_LEVER = register("spruce_lever", () -> new LeverBlock(BlockProperties.STONE_LEVER_BLOCK), BlockProperties.GENERIC_BLOCK_ITEM);
    public static final RegistrySupplier<Block> BIRCH_LEVER = register("birch_lever", () -> new LeverBlock(BlockProperties.STONE_LEVER_BLOCK), BlockProperties.GENERIC_BLOCK_ITEM);


    public static void init(){}
}