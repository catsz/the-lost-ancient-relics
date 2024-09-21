package net.griffin.artifacts.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.griffin.artifacts.TheLostAncientRelics;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block ARKANIUM_STONE_ORE = registerBlock("arkanium_stone_ore", new ExperienceDroppingBlock(UniformIntProvider.create(5, 10), AbstractBlock.Settings.create().strength(3f, 3f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block ARKANIUM_DEEPSLATE_ORE = registerBlock("arkanium_deepslate_ore", new ExperienceDroppingBlock(UniformIntProvider.create(6, 12), AbstractBlock.Settings.create().strength(4.5f, 3f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static void registerBlocks() {
        TheLostAncientRelics.LOGGER.info("Registering blocks");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ARKANIUM_STONE_ORE);
            entries.add(ARKANIUM_DEEPSLATE_ORE);
        });
    }

    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TheLostAncientRelics.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TheLostAncientRelics.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
}
