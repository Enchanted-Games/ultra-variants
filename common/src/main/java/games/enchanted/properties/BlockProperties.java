package games.enchanted.properties;

import games.enchanted.UltraVariants;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;

public class BlockProperties {
    // block properties
    public static final Block.Settings EXAMPLE_METAL = Block.Settings.of(Material.METAL).strength(4.0f);

    public static final Block.Settings LADDER_BLOCK = Block.Settings.of(Material.DECORATION).strength(0.4f).sounds(BlockSoundGroup.LADDER).nonOpaque();
    public static final Block.Settings STONE_LADDER_BLOCK = Block.Settings.of(Material.DECORATION).strength(1f).sounds(BlockSoundGroup.STONE).nonOpaque();

    public static final Block.Settings STONE_LEVER_BLOCK = Block.Settings.of(Material.DECORATION).noCollision().strength(0.5f).sounds(BlockSoundGroup.WOOD);

    // block item properties
    public static final Item.Settings GENERIC_BLOCK_ITEM = new Item.Settings().group(UltraVariants.MOD_BLOCKS_GROUP);
}
