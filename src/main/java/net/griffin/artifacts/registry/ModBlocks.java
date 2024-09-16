package net.griffin.artifacts.registry;

public class ModBlocks {

    public static void registerBlocks() {
        //register needed events for blocks in this function
    }

    public static void registerBlock(String name, BlockType type) {
        /* TODO:
        steps:
        1. have a custom resource pack for a specific block state or biome
        2. have a custom way of knowing if the block is the actual block or a man made block. possibly metadata (https://github.com/FabricMC/fabric/tree/1.21.1/fabric-data-attachment-api-v1)
        3. detect when the block starts breaking and the tool the person is using then set the block break stage using the Set Block Destroy Stage (https://wiki.vg/Protocol#Set_Block_Destroy_Stage) packet
        optional:
        detect events for explosions and explosion power and distance to be able to have custom blast protection. it is also possible this is just doable server side as the server is what actually destroys blocks. a sync packet will likely need to be sent to make sure ghost blocks do not appear.
         */
    }

    public enum BlockType {
        Note,
        Mushroom,
        Display
    }
}
