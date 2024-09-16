package net.griffin.artifacts.registry;

import com.mojang.brigadier.arguments.StringArgumentType;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.griffin.artifacts.TheLostAncientRelics;
import net.minecraft.server.command.CommandManager;

public class ModCommands {

    public static void registerCommands() {
        TheLostAncientRelics.LOGGER.info("Registering Mod Commands");
        CommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess, environment) -> {
            dispatcher.register(CommandManager.literal("artifactgive").then(CommandManager.argument("blockType", StringArgumentType.string()).executes(context -> {
                //TODO: allow giving of custom blocks and items and an amount of the item
                String type = StringArgumentType.getString(context, "blockType");
                return 1;
            })));
        }));
    }
}
