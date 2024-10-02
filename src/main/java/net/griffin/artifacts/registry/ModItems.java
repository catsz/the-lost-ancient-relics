package net.griffin.artifacts.registry;

import net.griffin.artifacts.TheLostAncientRelics;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ARKANIUM = registerItem("arkanium", new Item(new Item.Settings()));

    public static void registerItems() {
        TheLostAncientRelics.LOGGER.info("Registering" + TheLostAncientRelics.MOD_ID + " Items");
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TheLostAncientRelics.MOD_ID, name), item);
    }
}
