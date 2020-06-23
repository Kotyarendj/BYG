package voronoiaoc.byg.core.registries;

import voronoiaoc.byg.common.properties.BYGBlockProperties;
import voronoiaoc.byg.common.properties.blocks.BYGSaplingProperties;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.BYGSaplingToTree;
import voronoiaoc.byg.core.byglists.BYGBlockList;

public class BYGBlockRegistry {

    public static void registerBlocks() {
                //Plank BYGBlockRenders
                BYGBlockList.ASPEN_PLANKS = new BYGBlockProperties.BYGPlanks("aspen_planks");
                BYGBlockList.BAOBAB_PLANKS = new BYGBlockProperties.BYGPlanks("baobab_planks");
                BYGBlockList.BLUE_ENCHANTED_PLANKS = new BYGBlockProperties.BYGPlanks("blue_enchanted_planks");
                BYGBlockList.CHERRY_PLANKS = new BYGBlockProperties.BYGPlanks("cherry_planks");
                BYGBlockList.CIKA_PLANKS = new BYGBlockProperties.BYGPlanks("cika_planks");
                BYGBlockList.CYPRESS_PLANKS = new BYGBlockProperties.BYGPlanks("cypress_planks");
                BYGBlockList.EBONY_PLANKS = new BYGBlockProperties.BYGPlanks("ebony_planks");
                BYGBlockList.FIR_PLANKS = new BYGBlockProperties.BYGPlanks("fir_planks");
                BYGBlockList.GREEN_ENCHANTED_PLANKS = new BYGBlockProperties.BYGPlanks("green_enchanted_planks");
                BYGBlockList.HOLLY_PLANKS = new BYGBlockProperties.BYGPlanks("holly_planks");
                BYGBlockList.JACARANDA_PLANKS = new BYGBlockProperties.BYGPlanks("jacaranda_planks");
                BYGBlockList.MAHOGANY_PLANKS = new BYGBlockProperties.BYGPlanks("mahogany_planks");
                BYGBlockList.MANGROVE_PLANKS = new BYGBlockProperties.BYGPlanks("mangrove_planks");
                BYGBlockList.MAPLE_PLANKS = new BYGBlockProperties.BYGPlanks("maple_planks");
                BYGBlockList.PINE_PLANKS = new BYGBlockProperties.BYGPlanks("pine_planks");
                BYGBlockList.RAINBOW_EUCALYPTUS_PLANKS = new BYGBlockProperties.BYGPlanks("rainbow_eucalyptus_planks");
                BYGBlockList.REDWOOD_PLANKS = new BYGBlockProperties.BYGPlanks("redwood_planks");
                BYGBlockList.SKYRIS_PLANKS = new BYGBlockProperties.BYGPlanks("skyris_planks");
                BYGBlockList.WILLOW_PLANKS = new BYGBlockProperties.BYGPlanks("willow_planks");
                BYGBlockList.WITCH_HAZEL_PLANKS = new BYGBlockProperties.BYGPlanks("witch_hazel_planks");
                BYGBlockList.ZELKOVA_PLANKS = new BYGBlockProperties.BYGPlanks("zelkova_planks");

                //Bookshelf BYGBlockRenders
                BYGBlockList.ASPEN_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("aspen_bookshelf");
                BYGBlockList.BAOBAB_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("baobab_bookshelf");
                BYGBlockList.BLUE_ENCHANTED_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("blue_enchanted_bookshelf");
                BYGBlockList.CHERRY_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("cherry_bookshelf");
                BYGBlockList.CIKA_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("cika_bookshelf");
                BYGBlockList.CYPRESS_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("cypress_bookshelf");
                BYGBlockList.EBONY_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("ebony_bookshelf");
                BYGBlockList.FIR_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("fir_bookshelf");
                BYGBlockList.GREEN_ENCHANTED_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("green_enchanted_bookshelf");
                BYGBlockList.HOLLY_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("holly_bookshelf");
                BYGBlockList.JACARANDA_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("jacaranda_bookshelf");
                BYGBlockList.MAHOGANY_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("mahogany_bookshelf");
                BYGBlockList.MANGROVE_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("mangrove_bookshelf");
                BYGBlockList.MAPLE_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("maple_bookshelf");
                BYGBlockList.PINE_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("pine_bookshelf");
                BYGBlockList.RAINBOW_EUCALYPTUS_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("rainbow_eucalyptus_bookshelf");
                BYGBlockList.REDWOOD_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("redwood_bookshelf");
                BYGBlockList.SKYRIS_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("skyris_bookshelf");
                BYGBlockList.WILLOW_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("willow_bookshelf");
                BYGBlockList.WITCH_HAZEL_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("witch_hazel_bookshelf");
                BYGBlockList.ZELKOVA_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("zelkova_bookshelf");

                //Doors
                BYGBlockList.ASPEN_DOOR = new BYGBlockProperties.BYGDoors("aspen_door");
                BYGBlockList.BAOBAB_DOOR = new BYGBlockProperties.BYGDoors("baobab_door");
                BYGBlockList.BLUE_ENCHANTED_DOOR = new BYGBlockProperties.BYGDoors("blue_enchanted_door");
                BYGBlockList.CHERRY_DOOR = new BYGBlockProperties.BYGDoors("cherry_door");
                BYGBlockList.CIKA_DOOR = new BYGBlockProperties.BYGDoors("cika_door");
                BYGBlockList.CYPRESS_DOOR = new BYGBlockProperties.BYGDoors("cypress_door");
                BYGBlockList.EBONY_DOOR = new BYGBlockProperties.BYGDoors("ebony_door");
                BYGBlockList.FIR_DOOR = new BYGBlockProperties.BYGDoors("fir_door");
                BYGBlockList.GREEN_ENCHANTED_DOOR = new BYGBlockProperties.BYGDoors("green_enchanted_door");
                BYGBlockList.HOLLY_DOOR = new BYGBlockProperties.BYGDoors("holly_door");
                BYGBlockList.JACARANDA_DOOR = new BYGBlockProperties.BYGDoors("jacaranda_door");
                BYGBlockList.MAHOGANY_DOOR = new BYGBlockProperties.BYGDoors("mahogany_door");
                BYGBlockList.MANGROVE_DOOR = new BYGBlockProperties.BYGDoors("mangrove_door");
                BYGBlockList.MAPLE_DOOR = new BYGBlockProperties.BYGDoors("maple_door");
                BYGBlockList.PINE_DOOR = new BYGBlockProperties.BYGDoors("pine_door");
                BYGBlockList.RAINBOW_EUCALYPTUS_DOOR = new BYGBlockProperties.BYGDoors("rainbow_eucalyptus_door");
                BYGBlockList.REDWOOD_DOOR = new BYGBlockProperties.BYGDoors("redwood_door");
                BYGBlockList.SKYRIS_DOOR = new BYGBlockProperties.BYGDoors("skyris_door");
                BYGBlockList.WILLOW_DOOR = new BYGBlockProperties.BYGDoors("willow_door");
                BYGBlockList.WITCH_HAZEL_DOOR = new BYGBlockProperties.BYGDoors("witch_hazel_door");
                BYGBlockList.ZELKOVA_DOOR = new BYGBlockProperties.BYGDoors("zelkova_door");

                //Pressure Plate BYGBlockRenders
                BYGBlockList.ASPEN_PRESSURE_PLATE = new BYGBlockProperties.BYGPressurePlate("aspen_pressure_plate");
                BYGBlockList.BAOBAB_PRESSURE_PLATE = new BYGBlockProperties.BYGPressurePlate("baobab_pressure_plate");
                BYGBlockList.BLUE_ENCHANTED_PRESSURE_PLATE = new BYGBlockProperties.BYGPressurePlate("blue_enchanted_pressure_plate");
                BYGBlockList.CHERRY_PRESSURE_PLATE = new BYGBlockProperties.BYGPressurePlate("cherry_pressure_plate");
                BYGBlockList.CIKA_PRESSURE_PLATE = new BYGBlockProperties.BYGPressurePlate("cika_pressure_plate");
                BYGBlockList.CYPRESS_PRESSURE_PLATE = new BYGBlockProperties.BYGPressurePlate("cypress_pressure_plate");
                BYGBlockList.EBONY_PRESSURE_PLATE = new BYGBlockProperties.BYGPressurePlate("ebony_pressure_plate");
                BYGBlockList.FIR_PRESSURE_PLATE = new BYGBlockProperties.BYGPressurePlate("fir_pressure_plate");
                BYGBlockList.GREEN_ENCHANTED_PRESSURE_PLATE = new BYGBlockProperties.BYGPressurePlate("green_enchanted_pressure_plate");
                BYGBlockList.HOLLY_PRESSURE_PLATE = new BYGBlockProperties.BYGPressurePlate("holly_pressure_plate");
                BYGBlockList.JACARANDA_PRESSURE_PLATE = new BYGBlockProperties.BYGPressurePlate("jacaranda_pressure_plate");
                BYGBlockList.MAHOGANY_PRESSURE_PLATE = new BYGBlockProperties.BYGPressurePlate("mahogany_pressure_plate");
                BYGBlockList.MANGROVE_PRESSURE_PLATE = new BYGBlockProperties.BYGPressurePlate("mangrove_pressure_plate");
                BYGBlockList.MAPLE_PRESSURE_PLATE = new BYGBlockProperties.BYGPressurePlate("maple_pressure_plate");
                BYGBlockList.PINE_PRESSURE_PLATE = new BYGBlockProperties.BYGPressurePlate("pine_pressure_plate");
                BYGBlockList.RAINBOW_EUCALYPTUS_PRESSURE_PLATE = new BYGBlockProperties.BYGPressurePlate("rainbow_eucalyptus_pressure_plate");
                BYGBlockList.REDWOOD_PRESSURE_PLATE = new BYGBlockProperties.BYGPressurePlate("redwood_pressure_plate");
                BYGBlockList.SKYRIS_PRESSURE_PLATE = new BYGBlockProperties.BYGPressurePlate("skyris_pressure_plate");
                BYGBlockList.WILLOW_PRESSURE_PLATE = new BYGBlockProperties.BYGPressurePlate("willow_pressure_plate");
                BYGBlockList.WITCH_HAZEL_PRESSURE_PLATE = new BYGBlockProperties.BYGPressurePlate("witch_hazel_pressure_plate");
                BYGBlockList.ZELKOVA_PRESSURE_PLATE = new BYGBlockProperties.BYGPressurePlate("zelkova_pressure_plate");

                //Button BYGBlockRenders
                BYGBlockList.ASPEN_BUTTON = new BYGBlockProperties.BYGButtons("aspen_button");
                BYGBlockList.BAOBAB_BUTTON = new BYGBlockProperties.BYGButtons("baobab_button");
                BYGBlockList.BLUE_ENCHANTED_BUTTON = new BYGBlockProperties.BYGButtons("blue_enchanted_button");
                BYGBlockList.CHERRY_BUTTON = new BYGBlockProperties.BYGButtons("cherry_button");
                BYGBlockList.CIKA_BUTTON = new BYGBlockProperties.BYGButtons("cika_button");
                BYGBlockList.CYPRESS_BUTTON = new BYGBlockProperties.BYGButtons("cypress_button");
                BYGBlockList.EBONY_BUTTON = new BYGBlockProperties.BYGButtons("ebony_button");
                BYGBlockList.FIR_BUTTON = new BYGBlockProperties.BYGButtons("fir_button");
                BYGBlockList.GREEN_ENCHANTED_BUTTON = new BYGBlockProperties.BYGButtons("green_enchanted_button");
                BYGBlockList.HOLLY_BUTTON = new BYGBlockProperties.BYGButtons("holly_button");
                BYGBlockList.JACARANDA_BUTTON = new BYGBlockProperties.BYGButtons("jacaranda_button");
                BYGBlockList.MAHOGANY_BUTTON = new BYGBlockProperties.BYGButtons("mahogany_button");
                BYGBlockList.MANGROVE_BUTTON = new BYGBlockProperties.BYGButtons("mangrove_button");
                BYGBlockList.MAPLE_BUTTON = new BYGBlockProperties.BYGButtons("maple_button");
                BYGBlockList.PINE_BUTTON = new BYGBlockProperties.BYGButtons("pine_button");
                BYGBlockList.RAINBOW_EUCALYPTUS_BUTTON = new BYGBlockProperties.BYGButtons("rainbow_eucalyptus_button");
                BYGBlockList.REDWOOD_BUTTON = new BYGBlockProperties.BYGButtons("redwood_button");
                BYGBlockList.SKYRIS_BUTTON = new BYGBlockProperties.BYGButtons("skyris_button");
                BYGBlockList.WILLOW_BUTTON = new BYGBlockProperties.BYGButtons("willow_button");
                BYGBlockList.WITCH_HAZEL_BUTTON = new BYGBlockProperties.BYGButtons("witch_hazel_button");
                BYGBlockList.ZELKOVA_BUTTON = new BYGBlockProperties.BYGButtons("zelkova_button");

                //Trapdoor BYGBlockRenders
                BYGBlockList.ASPEN_TRAPDOOR = new BYGBlockProperties.BYGTrapdoors("aspen_trapdoor");
                BYGBlockList.BAOBAB_TRAPDOOR = new BYGBlockProperties.BYGTrapdoors("baobab_trapdoor");
                BYGBlockList.BLUE_ENCHANTED_TRAPDOOR = new BYGBlockProperties.BYGTrapdoors("blue_enchanted_trapdoor");
                BYGBlockList.CHERRY_TRAPDOOR = new BYGBlockProperties.BYGTrapdoors("cherry_trapdoor");
                BYGBlockList.CIKA_TRAPDOOR = new BYGBlockProperties.BYGTrapdoors("cika_trapdoor");
                BYGBlockList.CYPRESS_TRAPDOOR = new BYGBlockProperties.BYGTrapdoors("cypress_trapdoor");
                BYGBlockList.EBONY_TRAPDOOR = new BYGBlockProperties.BYGTrapdoors("ebony_trapdoor");
                BYGBlockList.FIR_TRAPDOOR = new BYGBlockProperties.BYGTrapdoors("fir_trapdoor");
                BYGBlockList.GREEN_ENCHANTED_TRAPDOOR = new BYGBlockProperties.BYGTrapdoors("green_enchanted_trapdoor");
                BYGBlockList.HOLLY_TRAPDOOR = new BYGBlockProperties.BYGTrapdoors("holly_trapdoor");
                BYGBlockList.JACARANDA_TRAPDOOR = new BYGBlockProperties.BYGTrapdoors("jacaranda_trapdoor");
                BYGBlockList.MAHOGANY_TRAPDOOR = new BYGBlockProperties.BYGTrapdoors("mahogany_trapdoor");
                BYGBlockList.MANGROVE_TRAPDOOR = new BYGBlockProperties.BYGTrapdoors("mangrove_trapdoor");
                BYGBlockList.MAPLE_TRAPDOOR = new BYGBlockProperties.BYGTrapdoors("maple_trapdoor");
                BYGBlockList.PINE_TRAPDOOR = new BYGBlockProperties.BYGTrapdoors("pine_trapdoor");
                BYGBlockList.RAINBOW_EUCALYPTUS_TRAPDOOR = new BYGBlockProperties.BYGTrapdoors("rainbow_eucalyptus_trapdoor");
                BYGBlockList.REDWOOD_TRAPDOOR = new BYGBlockProperties.BYGTrapdoors("redwood_trapdoor");
                BYGBlockList.SKYRIS_TRAPDOOR = new BYGBlockProperties.BYGTrapdoors("skyris_trapdoor");
                BYGBlockList.WILLOW_TRAPDOOR = new BYGBlockProperties.BYGTrapdoors("willow_trapdoor");
                BYGBlockList.WITCH_HAZEL_TRAPDOOR = new BYGBlockProperties.BYGTrapdoors("witch_hazel_trapdoor");
                BYGBlockList.ZELKOVA_TRAPDOOR = new BYGBlockProperties.BYGTrapdoors("zelkova_trapdoor");


                //Crafting Table BYGBlockRenders
                BYGBlockList.ASPEN_CRAFTING_TABLE = new BYGBlockProperties.BYGCraftingTable("aspen_crafting_table");
                BYGBlockList.BAOBAB_CRAFTING_TABLE = new BYGBlockProperties.BYGCraftingTable("baobab_crafting_table");
                BYGBlockList.BLUE_ENCHANTED_CRAFTING_TABLE = new BYGBlockProperties.BYGCraftingTable("blue_enchanted_crafting_table");
                BYGBlockList.CHERRY_CRAFTING_TABLE = new BYGBlockProperties.BYGCraftingTable("cherry_crafting_table");
                BYGBlockList.CIKA_CRAFTING_TABLE = new BYGBlockProperties.BYGCraftingTable("cika_crafting_table");
                BYGBlockList.CYPRESS_CRAFTING_TABLE = new BYGBlockProperties.BYGCraftingTable("cypress_crafting_table");
                BYGBlockList.EBONY_CRAFTING_TABLE = new BYGBlockProperties.BYGCraftingTable("ebony_crafting_table");
                BYGBlockList.FIR_CRAFTING_TABLE = new BYGBlockProperties.BYGCraftingTable("fir_crafting_table");
                BYGBlockList.GREEN_ENCHANTED_CRAFTING_TABLE = new BYGBlockProperties.BYGCraftingTable("green_enchanted_crafting_table");
                BYGBlockList.HOLLY_CRAFTING_TABLE = new BYGBlockProperties.BYGCraftingTable("holly_crafting_table");
                BYGBlockList.JACARANDA_CRAFTING_TABLE = new BYGBlockProperties.BYGCraftingTable("jacaranda_crafting_table");
                BYGBlockList.MAHOGANY_CRAFTING_TABLE = new BYGBlockProperties.BYGCraftingTable("mahogany_crafting_table");
                BYGBlockList.MANGROVE_CRAFTING_TABLE = new BYGBlockProperties.BYGCraftingTable("mangrove_crafting_table");
                BYGBlockList.MAPLE_CRAFTING_TABLE = new BYGBlockProperties.BYGCraftingTable("maple_crafting_table");
                BYGBlockList.PINE_CRAFTING_TABLE = new BYGBlockProperties.BYGCraftingTable("pine_crafting_table");
                BYGBlockList.RAINBOW_EUCALYPTUS_CRAFTING_TABLE = new BYGBlockProperties.BYGCraftingTable("rainbow_eucalyptus_crafting_table");
                BYGBlockList.REDWOOD_CRAFTING_TABLE = new BYGBlockProperties.BYGCraftingTable("redwood_crafting_table");
                BYGBlockList.SKYRIS_CRAFTING_TABLE = new BYGBlockProperties.BYGCraftingTable("skyris_crafting_table");
                BYGBlockList.WILLOW_CRAFTING_TABLE = new BYGBlockProperties.BYGCraftingTable("willow_crafting_table");
                BYGBlockList.WITCH_HAZEL_CRAFTING_TABLE = new BYGBlockProperties.BYGCraftingTable("witch_hazel_crafting_table");
                BYGBlockList.ZELKOVA_CRAFTING_TABLE = new BYGBlockProperties.BYGCraftingTable("zelkova_crafting_table");

                //Fence Gate BYGBlockRenders
                BYGBlockList.ASPEN_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("aspen_fence_gate");
                BYGBlockList.BAOBAB_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("baobab_fence_gate");
                BYGBlockList.BLUE_ENCHANTED_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("blue_enchanted_fence_gate");
                BYGBlockList.CHERRY_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("cherry_fence_gate");
                BYGBlockList.CIKA_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("cika_fence_gate");
                BYGBlockList.CYPRESS_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("cypress_fence_gate");
                BYGBlockList.EBONY_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("ebony_fence_gate");
                BYGBlockList.FIR_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("fir_fence_gate");
                BYGBlockList.GREEN_ENCHANTED_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("green_enchanted_fence_gate");
                BYGBlockList.HOLLY_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("holly_fence_gate");
                BYGBlockList.JACARANDA_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("jacaranda_fence_gate");
                BYGBlockList.MAHOGANY_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("mahogany_fence_gate");
                BYGBlockList.MANGROVE_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("mangrove_fence_gate");
                BYGBlockList.MAPLE_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("maple_fence_gate");
                BYGBlockList.PINE_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("pine_fence_gate");
                BYGBlockList.RAINBOW_EUCALYPTUS_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("rainbow_eucalyptus_fence_gate");
                BYGBlockList.REDWOOD_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("redwood_fence_gate");
                BYGBlockList.SKYRIS_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("skyris_fence_gate");
                BYGBlockList.WILLOW_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("willow_fence_gate");
                BYGBlockList.WITCH_HAZEL_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("witch_hazel_fence_gate");
                BYGBlockList.ZELKOVA_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("zelkova_fence_gate");

                //Slabs
                BYGBlockList.ASPEN_SLAB = new BYGBlockProperties.BYGWoodSlab("aspen_slab");
                BYGBlockList.BAOBAB_SLAB = new BYGBlockProperties.BYGWoodSlab("baobab_slab");
                BYGBlockList.BLUE_ENCHANTED_SLAB = new BYGBlockProperties.BYGWoodSlab("blue_enchanted_slab");
                BYGBlockList.CHERRY_SLAB = new BYGBlockProperties.BYGWoodSlab("cherry_slab");
                BYGBlockList.CIKA_SLAB = new BYGBlockProperties.BYGWoodSlab("cika_slab");
                BYGBlockList.CYPRESS_SLAB = new BYGBlockProperties.BYGWoodSlab("cypress_slab");
                BYGBlockList.EBONY_SLAB = new BYGBlockProperties.BYGWoodSlab("ebony_slab");
                BYGBlockList.FIR_SLAB = new BYGBlockProperties.BYGWoodSlab("fir_slab");
                BYGBlockList.GREEN_ENCHANTED_SLAB = new BYGBlockProperties.BYGWoodSlab("green_enchanted_slab");
                BYGBlockList.HOLLY_SLAB = new BYGBlockProperties.BYGWoodSlab("holly_slab");
                BYGBlockList.JACARANDA_SLAB = new BYGBlockProperties.BYGWoodSlab("jacaranda_slab");
                BYGBlockList.MAHOGANY_SLAB = new BYGBlockProperties.BYGWoodSlab("mahogany_slab");
                BYGBlockList.MANGROVE_SLAB = new BYGBlockProperties.BYGWoodSlab("mangrove_slab");
                BYGBlockList.MAPLE_SLAB = new BYGBlockProperties.BYGWoodSlab("maple_slab");
                BYGBlockList.PINE_SLAB = new BYGBlockProperties.BYGWoodSlab("pine_slab");
                BYGBlockList.RAINBOW_EUCALYPTUS_SLAB = new BYGBlockProperties.BYGWoodSlab("rainbow_eucalyptus_slab");
                BYGBlockList.REDWOOD_SLAB = new BYGBlockProperties.BYGWoodSlab("redwood_slab");
                BYGBlockList.SKYRIS_SLAB = new BYGBlockProperties.BYGWoodSlab("skyris_slab");
                BYGBlockList.WILLOW_SLAB = new BYGBlockProperties.BYGWoodSlab("willow_slab");
                BYGBlockList.WITCH_HAZEL_SLAB = new BYGBlockProperties.BYGWoodSlab("witch_hazel_slab");
                BYGBlockList.ZELKOVA_SLAB = new BYGBlockProperties.BYGWoodSlab("zelkova_slab");

                //Stairs BYGBlockRenders
                BYGBlockList.ASPEN_STAIRS = new BYGBlockProperties.BYGWoodStairs("aspen_stairs");
                BYGBlockList.BAOBAB_STAIRS = new BYGBlockProperties.BYGWoodStairs("baobab_stairs");
                BYGBlockList.BLUE_ENCHANTED_STAIRS = new BYGBlockProperties.BYGWoodStairs("blue_enchanted_stairs");
                BYGBlockList.CHERRY_STAIRS = new BYGBlockProperties.BYGWoodStairs("cherry_stairs");
                BYGBlockList.CIKA_STAIRS = new BYGBlockProperties.BYGWoodStairs("cika_stairs");
                BYGBlockList.CYPRESS_STAIRS = new BYGBlockProperties.BYGWoodStairs("cypress_stairs");
                BYGBlockList.EBONY_STAIRS = new BYGBlockProperties.BYGWoodStairs("ebony_stairs");
                BYGBlockList.FIR_STAIRS = new BYGBlockProperties.BYGWoodStairs("fir_stairs");
                BYGBlockList.GREEN_ENCHANTED_STAIRS = new BYGBlockProperties.BYGWoodStairs("green_enchanted_stairs");
                BYGBlockList.HOLLY_STAIRS = new BYGBlockProperties.BYGWoodStairs("holly_stairs");
                BYGBlockList.JACARANDA_STAIRS = new BYGBlockProperties.BYGWoodStairs("jacaranda_stairs");
                BYGBlockList.MAHOGANY_STAIRS = new BYGBlockProperties.BYGWoodStairs("mahogany_stairs");
                BYGBlockList.MANGROVE_STAIRS = new BYGBlockProperties.BYGWoodStairs("mangrove_stairs");
                BYGBlockList.MAPLE_STAIRS = new BYGBlockProperties.BYGWoodStairs("maple_stairs");
                BYGBlockList.PINE_STAIRS = new BYGBlockProperties.BYGWoodStairs("pine_stairs");
                BYGBlockList.RAINBOW_EUCALYPTUS_STAIRS = new BYGBlockProperties.BYGWoodStairs("rainbow_eucalyptus_stairs");
                BYGBlockList.REDWOOD_STAIRS = new BYGBlockProperties.BYGWoodStairs("redwood_stairs");
                BYGBlockList.SKYRIS_STAIRS = new BYGBlockProperties.BYGWoodStairs("skyris_stairs");
                BYGBlockList.WILLOW_STAIRS = new BYGBlockProperties.BYGWoodStairs("willow_stairs");
                BYGBlockList.WITCH_HAZEL_STAIRS = new BYGBlockProperties.BYGWoodStairs("witch_hazel_stairs");
                BYGBlockList.ZELKOVA_STAIRS = new BYGBlockProperties.BYGWoodStairs("zelkova_stairs");

                //Fence BYGBlockRenders
                BYGBlockList.ASPEN_FENCE = new BYGBlockProperties.BYGFence("aspen_fence");
                BYGBlockList.BAOBAB_FENCE = new BYGBlockProperties.BYGFence("baobab_fence");
                BYGBlockList.BLUE_ENCHANTED_FENCE = new BYGBlockProperties.BYGFence("blue_enchanted_fence");
                BYGBlockList.CHERRY_FENCE = new BYGBlockProperties.BYGFence("cherry_fence");
                BYGBlockList.CIKA_FENCE = new BYGBlockProperties.BYGFence("cika_fence");
                BYGBlockList.CYPRESS_FENCE = new BYGBlockProperties.BYGFence("cypress_fence");
                BYGBlockList.EBONY_FENCE = new BYGBlockProperties.BYGFence("ebony_fence");
                BYGBlockList.FIR_FENCE = new BYGBlockProperties.BYGFence("fir_fence");
                BYGBlockList.GREEN_ENCHANTED_FENCE = new BYGBlockProperties.BYGFence("green_enchanted_fence");
                BYGBlockList.HOLLY_FENCE = new BYGBlockProperties.BYGFence("holly_fence");
                BYGBlockList.JACARANDA_FENCE = new BYGBlockProperties.BYGFence("jacaranda_fence");
                BYGBlockList.MAHOGANY_FENCE = new BYGBlockProperties.BYGFence("mahogany_fence");
                BYGBlockList.MANGROVE_FENCE = new BYGBlockProperties.BYGFence("mangrove_fence");
                BYGBlockList.MAPLE_FENCE = new BYGBlockProperties.BYGFence("maple_fence");
                BYGBlockList.PINE_FENCE = new BYGBlockProperties.BYGFence("pine_fence");
                BYGBlockList.RAINBOW_EUCALYPTUS_FENCE = new BYGBlockProperties.BYGFence("rainbow_eucalyptus_fence");
                BYGBlockList.REDWOOD_FENCE = new BYGBlockProperties.BYGFence("redwood_fence");
                BYGBlockList.SKYRIS_FENCE = new BYGBlockProperties.BYGFence("skyris_fence");
                BYGBlockList.WILLOW_FENCE = new BYGBlockProperties.BYGFence("willow_fence");
                BYGBlockList.WITCH_HAZEL_FENCE = new BYGBlockProperties.BYGFence("witch_hazel_fence");
                BYGBlockList.ZELKOVA_FENCE = new BYGBlockProperties.BYGFence("zelkova_fence");

                //Ground BYGBlockRenders
                BYGBlockList.PEAT = new BYGBlockProperties.BYGGrassBlock("peat");
                BYGBlockList.MEADOW_GRASSBLOCK = new BYGBlockProperties.BYGMeadowGrass("meadow_grass_block");
                BYGBlockList.GLOWCELIUM = new BYGBlockProperties.BYGGlowcelium("glowcelium_block");
                BYGBlockList.MEADOW_DIRT = new BYGBlockProperties.BYGDirt("meadow_dirt");
                BYGBlockList.MUD_BLOCK = new BYGBlockProperties.BYGMud("mud_block");
                BYGBlockList.MUD_BRICKS = new BYGBlockProperties.BYGDirt("mud_bricks");

//                Sapling BYGBlockRenders
                BYGBlockList.ASPEN_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.AspenSaplingToTree(),"aspen_sapling");
                BYGBlockList.BAOBAB_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.BaobabSaplingToTree(), "baobab_sapling");
                BYGBlockList.BLUE_ENCHANTED_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.BlueEnchantedSaplingToTree(),"blue_enchanted_sapling");
                BYGBlockList.BLUE_SPRUCE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.BlueSpruceSaplingToTree(), "blue_spruce_sapling");
                BYGBlockList.BROWN_BIRCH_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.BrownBirchSaplingToTree(), "brown_birch_sapling");
                BYGBlockList.BROWN_OAK_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.BrownOakSaplingToTree(), "brown_oak_sapling");
                BYGBlockList.CIKA_SAPLING = new BYGBlockProperties.BYGFlower("cika_sapling");
                BYGBlockList.CYPRESS_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.CypressSaplingToTree(),"cypress_sapling");
                BYGBlockList.EBONY_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.EbonySaplingToTree(),"ebony_sapling");
                BYGBlockList.FIR_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.FirSaplingToTree(), "fir_sapling");
                BYGBlockList.GREEN_ENCHANTED_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.GreenEnchantedSaplingToTree(),"green_enchanted_sapling");
                BYGBlockList.HOLLY_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.HollySaplingToTree(),"holly_sapling");
                BYGBlockList.JACARANDA_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.JacarandaSaplingToTree(), "jacaranda_sapling");
                BYGBlockList.INDIGO_JACARANDA_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.IndigoJacarandaSaplingToTree(), "indigo_jacaranda_sapling");
                BYGBlockList.JOSHUA_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.JoshuaSaplingToTree(),"joshua_sapling");
                BYGBlockList.MAHOGANY_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.MahogonySaplingToTree(), "mahogany_sapling");
                BYGBlockList.MANGROVE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.MangroveSaplingToTree(),"mangrove_sapling");
                BYGBlockList.MAPLE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.MapleSaplingToTree(),"maple_sapling");
                BYGBlockList.ORANGE_BIRCH_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.OrangeBirchSaplingToTree(), "orange_birch_sapling");
                BYGBlockList.ORANGE_OAK_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.OrangeOakSaplingToTree(), "orange_oak_sapling");
                BYGBlockList.ORANGE_SPRUCE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.OrangeSpruceSaplingToTree(), "orange_spruce_sapling");
                BYGBlockList.ORCHARD_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.OrchardSaplingToTree(),"orchard_sapling");
                BYGBlockList.PALO_VERDE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.PaloVerdeSaplingToTree(),"palo_verde_sapling");
                BYGBlockList.PINE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.PineSaplingToTree(),"pine_sapling");
                BYGBlockList.PINK_CHERRY_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.PinkCherrySaplingToTree(),"pink_cherry_sapling");
                BYGBlockList.RAINBOW_EUCALYPTUS_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.RainbowEucalyptusSaplingToTree(),"rainbow_eucalyptus_sapling");
                BYGBlockList.RED_BIRCH_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.RedBirchSaplingToTree(), "red_birch_sapling");
                BYGBlockList.RED_MAPLE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.RedMapleSaplingToTree(),"red_maple_sapling");
                BYGBlockList.RED_OAK_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.RedOakSaplingToTree(), "red_oak_sapling");
                BYGBlockList.RED_SPRUCE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.RedSpruceSaplingToTree(), "red_spruce_sapling");
                BYGBlockList.REDWOOD_SAPLING = new BYGBlockProperties.BYGFlower("redwood_sapling");
                BYGBlockList.SILVER_MAPLE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.SilverMapleSaplingToTree(),"silver_maple_sapling");
                BYGBlockList.SKYRIS_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.SkyrisSaplingToTree(), "skyris_sapling");
                BYGBlockList.WHITE_CHERRY_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.WhiteCherrySaplingToTree(),"white_cherry_sapling");
                BYGBlockList.WILLOW_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.WillowSaplingToTree(),"willow_sapling");
                BYGBlockList.WITCH_HAZEL_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.WitchHazelSaplingToTree(),"witch_hazel_sapling");
                BYGBlockList.YELLOW_BIRCH_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.YellowBirchSaplingToTree(), "yellow_birch_sapling");
                BYGBlockList.YELLOW_SPRUCE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.YellowSpruceSaplingToTree(), "yellow_spruce_sapling");
                BYGBlockList.ZELKOVA_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.ZelkovaSaplingToTree(),"zelkova_sapling");

                //Leaf BYGBlockRenders
                BYGBlockList.ASPEN_LEAVES = new BYGBlockProperties.BYGLeaves("aspen_leaves");
                BYGBlockList.BAOBAB_LEAVES = new BYGBlockProperties.BYGLeaves("baobab_leaves");
                BYGBlockList.BLOOMING_WITCH_HAZEL_LEAVES = new BYGBlockProperties.BYGBloomingWitchhazelLeaves("blooming_witch_hazel_leaves");
                BYGBlockList.BLUE_ENCHANTED_LEAVES = new BYGBlockProperties.BYGBloomingWitchhazelLeaves("blue_enchanted_leaves");
                BYGBlockList.BLUE_SPRUCE_LEAVES = new BYGBlockProperties.BYGLeaves("blue_spruce_leaves");
                BYGBlockList.BROWN_BIRCH_LEAVES = new BYGBlockProperties.BYGLeaves("brown_birch_leaves");
                BYGBlockList.BROWN_OAK_LEAVES = new BYGBlockProperties.BYGLeaves("brown_oak_leaves");
                BYGBlockList.CIKA_LEAVES = new BYGBlockProperties.BYGLeaves("cika_leaves");
                BYGBlockList.CYPRESS_LEAVES = new BYGBlockProperties.BYGLeaves("cypress_leaves");
                BYGBlockList.EBONY_LEAVES = new BYGBlockProperties.BYGLeaves("ebony_leaves");
                BYGBlockList.FIR_LEAVES = new BYGBlockProperties.BYGLeaves("fir_leaves");
                BYGBlockList.FLOWERING_ORCHARD_LEAVES = new BYGBlockProperties.BYGLeaves("flowering_orchard_leaves");
                BYGBlockList.FLOWERING_PALO_VERDE_LEAVES = new BYGBlockProperties.BYGLeaves("flowering_palo_verde_leaves");
                BYGBlockList.GREEN_ENCHANTED_LEAVES = new BYGBlockProperties.BYGBloomingWitchhazelLeaves("green_enchanted_leaves");
                BYGBlockList.HOLLY_BERRY_LEAVES = new BYGBlockProperties.BYGLeaves("holly_berry_leaves");
                BYGBlockList.HOLLY_LEAVES = new BYGBlockProperties.BYGLeaves("holly_leaves");
                BYGBlockList.JACARANDA_LEAVES = new BYGBlockProperties.BYGLeaves("jacaranda_leaves");
                BYGBlockList.INDIGO_JACARANDA_LEAVES = new BYGBlockProperties.BYGLeaves("indigo_jacaranda_leaves");
                BYGBlockList.JOSHUA_LEAVES = new BYGBlockProperties.BYGLeaves("joshua_leaves");
                BYGBlockList.RIPE_JOSHUA_LEAVES = new BYGBlockProperties.BYGLeaves("ripe_joshua_leaves");
                BYGBlockList.MAHOGANY_LEAVES = new BYGBlockProperties.BYGLeaves("mahogany_leaves");
                BYGBlockList.MANGROVE_LEAVES = new BYGBlockProperties.BYGLeaves("mangrove_leaves");
                BYGBlockList.MAPLE_LEAVES = new BYGBlockProperties.BYGLeaves("maple_leaves");
                BYGBlockList.ORANGE_BIRCH_LEAVES = new BYGBlockProperties.BYGLeaves("orange_birch_leaves");
                BYGBlockList.ORANGE_OAK_LEAVES = new BYGBlockProperties.BYGLeaves("orange_oak_leaves");
                BYGBlockList.ORANGE_SPRUCE_LEAVES = new BYGBlockProperties.BYGLeaves("orange_spruce_leaves");
                BYGBlockList.ORCHARD_LEAVES = new BYGBlockProperties.BYGLeaves("orchard_leaves");
                BYGBlockList.PALO_VERDE_LEAVES = new BYGBlockProperties.BYGLeaves("palo_verde_leaves");
                BYGBlockList.PINE_LEAVES = new BYGBlockProperties.BYGLeaves("pine_leaves");
                BYGBlockList.PINK_CHERRY_LEAVES = new BYGBlockProperties.BYGLeaves("pink_cherry_leaves");
                BYGBlockList.RAINBOW_EUCALYPTUS_LEAVES = new BYGBlockProperties.BYGLeaves("rainbow_eucalyptus_leaves");
                BYGBlockList.RED_BIRCH_LEAVES = new BYGBlockProperties.BYGLeaves("red_birch_leaves");
                BYGBlockList.RED_MAPLE_LEAVES = new BYGBlockProperties.BYGLeaves("red_maple_leaves");
                BYGBlockList.RED_OAK_LEAVES = new BYGBlockProperties.BYGLeaves("red_oak_leaves");
                BYGBlockList.RED_SPRUCE_LEAVES = new BYGBlockProperties.BYGLeaves("red_spruce_leaves");
                BYGBlockList.REDWOOD_LEAVES = new BYGBlockProperties.BYGLeaves("redwood_leaves");
                BYGBlockList.RIPE_ORCHARD_LEAVES = new BYGBlockProperties.BYGLeaves("ripe_orchard_leaves");
                BYGBlockList.SILVER_MAPLE_LEAVES = new BYGBlockProperties.BYGLeaves("silver_maple_leaves");
                BYGBlockList.SKYRIS_LEAVES_GREEN_APPLE = new BYGBlockProperties.BYGLeaves("green_apple_skyris_leaves");
                BYGBlockList.SKYRIS_LEAVES = new BYGBlockProperties.BYGLeaves("skyris_leaves");
                BYGBlockList.WHITE_CHERRY_LEAVES = new BYGBlockProperties.BYGLeaves("white_cherry_leaves");
                BYGBlockList.WILLOW_LEAVES = new BYGBlockProperties.BYGLeaves("willow_leaves");
                BYGBlockList.WITCH_HAZEL_LEAVES = new BYGBlockProperties.BYGLeaves("witch_hazel_leaves");
                BYGBlockList.YELLOW_BIRCH_LEAVES = new BYGBlockProperties.BYGLeaves("yellow_birch_leaves");
                BYGBlockList.YELLOW_SPRUCE_LEAVES = new BYGBlockProperties.BYGLeaves("yellow_spruce_leaves");
                BYGBlockList.ZELKOVA_LEAVES = new BYGBlockProperties.BYGLeaves("zelkova_leaves");

                //Plant BYGBlockRenders
                BYGBlockList.GREEN_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("green_mushroom_block");
                BYGBlockList.MILKCAP_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("weeping_milkcap_mushroom_block");
                BYGBlockList.BLEWIT_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("wood_blewit_mushroom_block");
                BYGBlockList.PUFF_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("black_puff_mushroom_block");
                BYGBlockList.WHITE_MUSHROOM_STEM = new BYGBlockProperties.BlockHugeMushroom("white_mushroom_stem");
                BYGBlockList.BROWN_MUSHROOM_STEM = new BYGBlockProperties.BlockHugeMushroom("brown_mushroom_stem");
                BYGBlockList.BLUE_GLOWSHROOM_BLOCK = new BYGBlockProperties.BlockHugeGlowshroom("blue_glowshroom_block");
                BYGBlockList.PURPLE_GLOWSHROOM_BLOCK = new BYGBlockProperties.BlockHugeGlowshroom("purple_glowshroom_block");
                BYGBlockList.RED_GLOWSHROOM_STEM = new BYGBlockProperties.BlockHugeGlowshroom("red_glowshroom_stem");
                BYGBlockList.YELLOW_GLOWSHROOM_STEM = new BYGBlockProperties.BlockHugeGlowshroom("yellow_glowshroom_stem");

                BYGBlockList.CATTAIL = new BYGBlockProperties.BlockCattail("cattail");
                BYGBlockList.REEDS = new BYGBlockProperties.BlockCattail("reeds");
                BYGBlockList.HORSEWEED = new BYGBlockProperties.BYGFlower("horseweed");
                BYGBlockList.MINI_CACTUS = new BYGBlockProperties.BYGDesertPlant("mini_cactus");
                BYGBlockList.PRICKLY_PEAR_CACTUS = new BYGBlockProperties.BYGDesertPlant("prickly_pear_cactus");
                BYGBlockList.WINTER_SUCCULENT = new BYGBlockProperties.BYGFlower("winter_succulent");
                BYGBlockList.SHORT_GRASS = new BYGBlockProperties.BYGTallGrass("short_grass");
                BYGBlockList.TALL_PRAIRIE_GRASS = new BYGBlockProperties.BYGDoublePlant("tall_prairie_grass");
                BYGBlockList.BLUE_GLOWCANE = new BYGBlockProperties.BYGBLUEGlowCane("blue_glowcane");
                BYGBlockList.RED_GLOWCANE = new BYGBlockProperties.BYGREDGlowCane("red_glowcane");
                BYGBlockList.PURPLE_GLOWCANE = new BYGBlockProperties.BYGPURPLEGlowCane("purple_glowcane");
                BYGBlockList.PINK_GLOWCANE = new BYGBlockProperties.BYGPINKGlowCane("pink_glowcane");
                BYGBlockList.POISON_IVY = new BYGBlockProperties.BYGPoisonIvy("poison_ivy");
                BYGBlockList.SKYRIS_VINE = new BYGBlockProperties.BYGSkyrisVine("skyris_vine");
                BYGBlockList.BLUEBERRY_BUSH = new BYGBlockProperties.BYGBerryBush("blueberry_bush");
                BYGBlockList.TINY_LILYPADS = new BYGBlockProperties.BYGLily("tiny_lilypads");
                BYGBlockList.WATER_SILK = new BYGBlockProperties.BYGWaterSilk("water_silk");
                BYGBlockList.WEEPING_ROOTS = new BYGBlockProperties.BYGHangingVine("weeping_roots");
                BYGBlockList.WEEPING_ROOTS_PLANT = new BYGBlockProperties.BYGHangingVinePlant("weeping_roots_plant");

                BYGBlockList.WINTER_GRASS = new BYGBlockProperties.BYGWinterTallGrass("winter_grass");
                BYGBlockList.WEED_GRASS = new BYGBlockProperties.BYGTallGrass("weed_grass");
                BYGBlockList.WILTED_GRASS = new BYGBlockProperties.BYGTallGrass("wilted_grass");
                BYGBlockList.SHORT_BEACH_GRASS = new BYGBlockProperties.BYGBeachGrass("short_beach_grass");
                BYGBlockList.BEACH_GRASS = new BYGBlockProperties.BYGBeachGrass("beach_grass");
                BYGBlockList.LEAF_PILE = new BYGBlockProperties.BYGLeafPile("leaf_pile");
                BYGBlockList.CLOVER_PATCH = new BYGBlockProperties.BYGLeafPile("clover_patch");
                BYGBlockList.FLOWER_PATCH = new BYGBlockProperties.BYGLeafPile("flower_patch");


                //Nether BYGBlockRenders
                BYGBlockList.OVERGROWN_NETHERRACK = new BYGBlockProperties.OvergrownNetherrack("overgrown_netherrack");
                BYGBlockList.NETHER_BRISTLE = new BYGBlockProperties.BYGDoubleDamagePlant("nether_bristle");

                BYGBlockList.WARPED_CACTUS = new BYGBlockProperties.BYGWarpedCacti("warped_cactus");
                BYGBlockList.WARPED_BUSH = new BYGBlockProperties.BYGWarpedBush("warped_bush");
                BYGBlockList.WARPED_CORAL_BLOCK = new BYGBlockProperties.BYGWarpedCoralBlock("warped_coral_block");
                BYGBlockList.WARPED_CORAL = new BYGBlockProperties.BYGWarpedCoral("warped_coral");
                BYGBlockList.WARPED_CORAL_FAN = new BYGBlockProperties.BYGWarpedFanCoral("warped_coral_fan");
                BYGBlockList.WARPED_CORAL_WALL_FAN = new BYGBlockProperties.BYGWarpedWallFanCoral("warped_coral_wall_fan");
                BYGBlockList.NYLIUM_SOUL_SAND = new BYGBlockProperties.BYGNyliumSoulSand("nylium_soul_sand");
                BYGBlockList.NYLIUM_SOUL_SOIL = new BYGBlockProperties.BYGNyliumSoulSoil("nylium_soul_soil");

                BYGBlockList.SYTHIAN_NYLIUM = new BYGBlockProperties.BYGSythianNylium("sythian_nylium");
                BYGBlockList.SYTHIAN_ROOTS = new BYGBlockProperties.SythianPlant("sythian_roots");
                BYGBlockList.SYTHIAN_SPROUT = new BYGBlockProperties.SythianPlant("sythian_sprout");
                BYGBlockList.SYTHIAN_STALK_BLOCK = new BYGBlockProperties.SythianStalk("sythian_stalk_block");
                BYGBlockList.SYTHIAN_SCAFFOLDING = new BYGBlockProperties.BYGScaffolding("sythian_scaffolding");
                BYGBlockList.SYTHIAN_SAPLING = new BYGBlockProperties.SythianSapling("sythian_sapling");

                //End BYGBlockRenders
                BYGBlockList.IVIS_PHYLIUM = new BYGBlockProperties.BYGIvisPhylium("ivis_phylium");
                BYGBlockList.IVIS_ROOTS = new BYGBlockProperties.BYGIvisPlant("ivis_roots");
                BYGBlockList.IVIS_SPROUT = new BYGBlockProperties.BYGIvisPlant("ivis_sprout");


                //GlowcaneItem BYGBlockRenders
                BYGBlockList.BLUE_GLOWCANE_BLOCK = new BYGBlockProperties.BYGGlowCaneBlock("blue_glowcane_block");
                BYGBlockList.RED_GLOWCANE_BLOCK = new BYGBlockProperties.BYGGlowCaneBlock("red_glowcane_block");
                BYGBlockList.PINK_GLOWCANE_BLOCK = new BYGBlockProperties.BYGGlowCaneBlock("pink_glowcane_block");
                BYGBlockList.PURPLE_GLOWCANE_BLOCK = new BYGBlockProperties.BYGGlowCaneBlock("purple_glowcane_block");

                //Decoration Blocks
                BYGBlockList.GLOWSTONE_LAMP = new BYGBlockProperties.BYGGlowCaneBlock("glowstone_lamp");
                BYGBlockList.PERVADED_NETHERRACK = new BYGBlockProperties.BYGPervadedNetherrack("pervaded_netherrack");
                BYGBlockList.GLOWSTONE_LANTERN = new BYGBlockProperties.BYGLantern("glowstone_lantern");
                BYGBlockList.PACKED_BLACK_ICE = new BYGBlockProperties.BYGPackedIceBlock("packed_black_ice");
                BYGBlockList.BLACK_ICE = new BYGBlockProperties.BYGIceBlock("black_ice");
                BYGBlockList.FROST_MAGMA = new BYGBlockProperties.BYGFrostMagma("frost_magma");
                BYGBlockList.PINK_CHERRY_FOLIAGE = new BYGBlockProperties.BYGLeafFoilage("pink_cherry_foliage");
                BYGBlockList.WHITE_CHERRY_FOLIAGE = new BYGBlockProperties.BYGLeafFoilage("white_cherry_foliage");


                //Petal BYGBlockRenders
                BYGBlockList.WHITE_PETAL = new BYGBlockProperties.BYGPetal("white_petal_block");
                BYGBlockList.RED_PETAL = new BYGBlockProperties.BYGPetal("red_petal_block");
                BYGBlockList.PURPLE_PETAL = new BYGBlockProperties.BYGPetal("purple_petal_block");
                BYGBlockList.BLUE_PETAL = new BYGBlockProperties.BYGPetal("blue_petal_block");
                BYGBlockList.LIGHT_BLUE_PETAL = new BYGBlockProperties.BYGPetal("light_blue_petal_block");
                BYGBlockList.YELLOW_PETAL = new BYGBlockProperties.BYGPetal("yellow_petal_block");
                BYGBlockList.PLANT_STEM = new BYGBlockProperties.BYGLog("plant_stem");
                BYGBlockList.POLLEN_BLOCK = new BYGBlockProperties.BYGPollen("pollen_block");

                //Sand BYGBlockRenders
                BYGBlockList.BLACK_SAND = new BYGBlockProperties.BYGSand(5197647, "black_sand");
                BYGBlockList.BLACK_SANDSTONE = new BYGBlockProperties.BYGStone("black_sandstone");
                BYGBlockList.BLACK_CHISELED_SANDSTONE = new BYGBlockProperties.BYGStone("black_chiseled_sandstone");
                BYGBlockList.BLACK_CUT_SANDSTONE = new BYGBlockProperties.BYGStone("black_cut_sandstone");
                BYGBlockList.BLACK_SMOOTH_SANDSTONE = new BYGBlockProperties.BYGStone("black_smooth_sandstone");

                BYGBlockList.WHITE_SAND = new BYGBlockProperties.BYGSand(15395562, "white_sand");
                BYGBlockList.WHITE_SANDSTONE = new BYGBlockProperties.BYGStone("white_sandstone");
                BYGBlockList.WHITE_CHISELED_SANDSTONE = new BYGBlockProperties.BYGStone("white_chiseled_sandstone");
                BYGBlockList.WHITE_CUT_SANDSTONE = new BYGBlockProperties.BYGStone("white_cut_sandstone");
                BYGBlockList.WHITE_SMOOTH_SANDSTONE = new BYGBlockProperties.BYGStone("white_smooth_sandstone");

                BYGBlockList.BLUE_SAND = new BYGBlockProperties.BYGSand(13559021, "blue_sand");
                BYGBlockList.BLUE_SANDSTONE = new BYGBlockProperties.BYGStone("blue_sandstone");
                BYGBlockList.BLUE_CHISELED_SANDSTONE = new BYGBlockProperties.BYGStone("blue_chiseled_sandstone");
                BYGBlockList.BLUE_CUT_SANDSTONE = new BYGBlockProperties.BYGStone("blue_cut_sandstone");
                BYGBlockList.BLUE_SMOOTH_SANDSTONE = new BYGBlockProperties.BYGStone("blue_smooth_sandstone");

                BYGBlockList.PURPLE_SAND = new BYGBlockProperties.BYGSand(12887002, "purple_sand");
                BYGBlockList.PURPLE_SANDSTONE = new BYGBlockProperties.BYGStone("purple_sandstone");
                BYGBlockList.PURPLE_CHISELED_SANDSTONE = new BYGBlockProperties.BYGStone("purple_chiseled_sandstone");
                BYGBlockList.PURPLE_CUT_SANDSTONE = new BYGBlockProperties.BYGStone("purple_cut_sandstone");
                BYGBlockList.PURPLE_SMOOTH_SANDSTONE = new BYGBlockProperties.BYGStone("purple_smooth_sandstone");

                BYGBlockList.PINK_SAND = new BYGBlockProperties.BYGSand(15585004, "pink_sand");
                BYGBlockList.PINK_SANDSTONE = new BYGBlockProperties.BYGStone("pink_sandstone");
                BYGBlockList.PINK_CHISELED_SANDSTONE = new BYGBlockProperties.BYGStone("pink_chiseled_sandstone");
                BYGBlockList.PINK_CUT_SANDSTONE = new BYGBlockProperties.BYGStone("pink_cut_sandstone");
                BYGBlockList.PINK_SMOOTH_SANDSTONE = new BYGBlockProperties.BYGStone("pink_smooth_sandstone");

                //Log BYGBlockRenders
                BYGBlockList.ASPEN_LOG = new BYGBlockProperties.BYGLog("aspen_log");
                BYGBlockList.BAOBAB_LOG = new BYGBlockProperties.BYGLog("baobab_log");
                BYGBlockList.BLUE_ENCHANTED_LOG = new BYGBlockProperties.BYGLog("blue_enchanted_log");
                BYGBlockList.CHERRY_LOG = new BYGBlockProperties.BYGLog("cherry_log");
                BYGBlockList.CIKA_LOG = new BYGBlockProperties.BYGLog("cika_log");
                BYGBlockList.CYPRESS_LOG = new BYGBlockProperties.BYGLog("cypress_log");
                BYGBlockList.EBONY_LOG = new BYGBlockProperties.BYGLog("ebony_log");
                BYGBlockList.FIR_LOG = new BYGBlockProperties.BYGLog("fir_log");
                BYGBlockList.GREEN_ENCHANTED_LOG = new BYGBlockProperties.BYGLog("green_enchanted_log");
                BYGBlockList.HOLLY_LOG = new BYGBlockProperties.BYGLog("holly_log");
                BYGBlockList.JACARANDA_LOG = new BYGBlockProperties.BYGLog("jacaranda_log");
                BYGBlockList.MAHOGANY_LOG = new BYGBlockProperties.BYGLog("mahogany_log");
                BYGBlockList.MANGROVE_LOG = new BYGBlockProperties.BYGLog("mangrove_log");
                BYGBlockList.MAPLE_LOG = new BYGBlockProperties.BYGLog("maple_log");
                BYGBlockList.PALO_VERDE_LOG = new BYGBlockProperties.BYGLog("palo_verde_log");
                BYGBlockList.PINE_LOG = new BYGBlockProperties.BYGLog("pine_log");
                BYGBlockList.RAINBOW_EUCALYPTUS_LOG = new BYGBlockProperties.BYGLog("rainbow_eucalyptus_log");
                BYGBlockList.REDWOOD_LOG = new BYGBlockProperties.BYGLog("redwood_log");
                BYGBlockList.SKYRIS_LOG = new BYGBlockProperties.BYGLog("skyris_log");
                BYGBlockList.WILLOW_LOG = new BYGBlockProperties.BYGLog("willow_log");
                BYGBlockList.WITCH_HAZEL_LOG = new BYGBlockProperties.BYGLog("witch_hazel_log");
                BYGBlockList.ZELKOVA_LOG = new BYGBlockProperties.BYGLog("zelkova_log");

                BYGBlockList.ASPEN_WOOD = new BYGBlockProperties.BYGWood("aspen_wood");
                BYGBlockList.BAOBAB_WOOD = new BYGBlockProperties.BYGWood("baobab_wood");
                BYGBlockList.BLUE_ENCHANTED_WOOD = new BYGBlockProperties.BYGWood("blue_enchanted_wood");
                BYGBlockList.CHERRY_WOOD = new BYGBlockProperties.BYGWood("cherry_wood");
                BYGBlockList.CIKA_WOOD = new BYGBlockProperties.BYGWood("cika_wood");
                BYGBlockList.CYPRESS_WOOD = new BYGBlockProperties.BYGWood("cypress_wood");
                BYGBlockList.EBONY_WOOD = new BYGBlockProperties.BYGWood("ebony_wood");
                BYGBlockList.FIR_WOOD = new BYGBlockProperties.BYGWood("fir_wood");
                BYGBlockList.GREEN_ENCHANTED_WOOD = new BYGBlockProperties.BYGWood("green_enchanted_wood");
                BYGBlockList.HOLLY_WOOD = new BYGBlockProperties.BYGWood("holly_wood");
                BYGBlockList.JACARANDA_WOOD = new BYGBlockProperties.BYGWood("jacaranda_wood");
                BYGBlockList.MAHOGANY_WOOD = new BYGBlockProperties.BYGWood("mahogany_wood");
                BYGBlockList.MANGROVE_WOOD = new BYGBlockProperties.BYGWood("mangrove_wood");
                BYGBlockList.MAPLE_WOOD = new BYGBlockProperties.BYGWood("maple_wood");
                BYGBlockList.PALO_VERDE_WOOD = new BYGBlockProperties.BYGWood("palo_verde_wood");
                BYGBlockList.PINE_WOOD = new BYGBlockProperties.BYGWood("pine_wood");
                BYGBlockList.RAINBOW_EUCALYPTUS_WOOD = new BYGBlockProperties.BYGWood("rainbow_eucalyptus_wood");
                BYGBlockList.REDWOOD_WOOD = new BYGBlockProperties.BYGWood("redwood_wood");
                BYGBlockList.SKYRIS_WOOD = new BYGBlockProperties.BYGWood("skyris_wood");
                BYGBlockList.WILLOW_WOOD = new BYGBlockProperties.BYGWood("willow_wood");
                BYGBlockList.WITCH_HAZEL_WOOD = new BYGBlockProperties.BYGWood("witch_hazel_wood");
                BYGBlockList.ZELKOVA_WOOD = new BYGBlockProperties.BYGWood("zelkova_wood");

                //Mushroom BYGBlockRenders
                BYGBlockList.BLACK_PUFF = new BYGBlockProperties.BlockMushroom("black_puff");
                BYGBlockList.WEEPING_MILKCAP = new BYGBlockProperties.BlockMushroom("weeping_milkcap");
                BYGBlockList.WOOD_BLEWIT = new BYGBlockProperties.BlockMushroom("wood_blewit");
                BYGBlockList.GREEN_MUSHSHROOM = new BYGBlockProperties.BlockMushroom("green_mushroom");
                BYGBlockList.BLUE_GLOWSHROOM = new BYGBlockProperties.BlockGlowshroom("blue_glowshroom");
                BYGBlockList.PURPLE_GLOWSHROOM = new BYGBlockProperties.BlockGlowshroom("purple_glowshroom");

                //Ore BYGBlockRenders
                BYGBlockList.PENDORITE_ORE = new BYGBlockProperties.BYGOrePendorite("pendorite_ore");
                BYGBlockList.AMETRINE_ORE = new BYGBlockProperties.BYGOreAmetrine("ametrine_ore");
                BYGBlockList.PENDORITE_BLOCK = new BYGBlockProperties.BYGOrePendorite("pendorite_block");
                BYGBlockList.AMETRINE_BLOCK = new BYGBlockProperties.BYGOreAmetrine("ametrine_block");

                //StoneBlocks
                BYGBlockList.DACITE = new BYGBlockProperties.BYGStone("dacite");
                BYGBlockList.DACITE_SLAB = new BYGBlockProperties.BYGStoneSlab("dacite_slab");
                BYGBlockList.DACITE_STAIRS = new BYGBlockProperties.BYGStoneStairs("dacite_stairs");
                BYGBlockList.DACITE_WALL = new BYGBlockProperties.BYGStoneWall("dacite_wall");
                BYGBlockList.DACITE_BRICKS = new BYGBlockProperties.BYGStone("dacite_bricks");
                BYGBlockList.DACITE_BRICK_SLAB = new BYGBlockProperties.BYGStoneSlab("dacite_brick_slab");
                BYGBlockList.DACITE_BRICK_STAIRS = new BYGBlockProperties.BYGStoneStairs("dacite_brick_stairs");
                BYGBlockList.DACITE_BRICK_WALL = new BYGBlockProperties.BYGStoneWall("dacite_brick_wall");
                BYGBlockList.DACITE_COBBLESTONE = new BYGBlockProperties.BYGStone("dacite_cobblestone");
                BYGBlockList.DACITE_COBBLESTONE_SLAB = new BYGBlockProperties.BYGStoneSlab("dacite_cobblestone_slab");
                BYGBlockList.DACITE_COBBLESTONE_STAIRS = new BYGBlockProperties.BYGStoneStairs("dacite_cobblestone_stairs");
                BYGBlockList.DACITE_COBBLESTONE_WALL = new BYGBlockProperties.BYGStoneWall("dacite_cobblestone_wall");
                BYGBlockList.DACITE_PILLAR = new BYGBlockProperties.BYGPillar("dacite_pillar");
                BYGBlockList.DACITE_TILE = new BYGBlockProperties.BYGStone("dacite_tile");
                BYGBlockList.DACITE_TILE_SLAB = new BYGBlockProperties.BYGStoneSlab("dacite_tile_slab");
                BYGBlockList.DACITE_TILE_STAIRS = new BYGBlockProperties.BYGStoneStairs("dacite_tile_stairs");
                BYGBlockList.DACITE_TILE_WALL = new BYGBlockProperties.BYGStoneWall("dacite_tile_wall");

                BYGBlockList.RED_ROCK = new BYGBlockProperties.BYGStone("red_rock");
                BYGBlockList.RED_ROCK_SLAB = new BYGBlockProperties.BYGStoneSlab("red_rock_slab");
                BYGBlockList.RED_ROCK_STAIRS = new BYGBlockProperties.BYGStoneStairs("red_rock_stairs");
                BYGBlockList.RED_ROCK_WALL = new BYGBlockProperties.BYGStoneWall("red_rock_wall");
                BYGBlockList.RED_ROCK_BRICKS = new BYGBlockProperties.BYGStone("red_rock_bricks");
                BYGBlockList.RED_ROCK_BRICK_SLAB = new BYGBlockProperties.BYGStoneSlab("red_rock_brick_slab");
                BYGBlockList.RED_ROCK_BRICK_STAIRS = new BYGBlockProperties.BYGStoneStairs("red_rock_brick_stairs");
                BYGBlockList.RED_ROCK_BRICK_WALL = new BYGBlockProperties.BYGStoneWall("red_rock_brick_wall");
                BYGBlockList.CRACKED_RED_ROCK_BRICKS = new BYGBlockProperties.BYGStone("cracked_red_rock_bricks");
                BYGBlockList.CRACKED_RED_ROCK_BRICK_SLAB = new BYGBlockProperties.BYGStoneSlab("cracked_red_rock_brick_slab");
                BYGBlockList.CRACKED_RED_ROCK_BRICK_STAIRS = new BYGBlockProperties.BYGStoneStairs("cracked_red_rock_brick_stairs");
                BYGBlockList.CRACKED_RED_ROCK_BRICK_WALL = new BYGBlockProperties.BYGStoneWall("cracked_red_rock_brick_wall");
                BYGBlockList.CHISELED_RED_ROCK_BRICKS = new BYGBlockProperties.BYGStone("chiseled_red_rock_bricks");
                BYGBlockList.CHISELED_RED_ROCK_BRICK_SLAB = new BYGBlockProperties.BYGStoneSlab("chiseled_red_rock_brick_slab");
                BYGBlockList.CHISELED_RED_ROCK_BRICK_STAIRS = new BYGBlockProperties.BYGStoneStairs("chiseled_red_rock_brick_stairs");
                BYGBlockList.CHISELED_RED_ROCK_BRICK_WALL = new BYGBlockProperties.BYGStoneWall("chiseled_red_rock_brick_wall");
                BYGBlockList.MOSSY_RED_ROCK_BRICKS = new BYGBlockProperties.BYGStone("mossy_red_rock_bricks");
                BYGBlockList.MOSSY_RED_ROCK_BRICK_SLAB = new BYGBlockProperties.BYGStoneSlab("mossy_red_rock_brick_slab");
                BYGBlockList.MOSSY_RED_ROCK_BRICK_STAIRS = new BYGBlockProperties.BYGStoneStairs("mossy_red_rock_brick_stairs");
                BYGBlockList.MOSSY_RED_ROCK_BRICK_WALL = new BYGBlockProperties.BYGStoneWall("mossy_red_rock_brick_wall");

                BYGBlockList.MOSSY_STONE = new BYGBlockProperties.BYGStone("mossy_stone");
                BYGBlockList.MOSSY_STONE_SLAB = new BYGBlockProperties.BYGStoneSlab("mossy_stone_slab");
                BYGBlockList.MOSSY_STONE_STAIRS = new BYGBlockProperties.BYGStoneStairs("mossy_stone_stairs");
                BYGBlockList.MOSSY_STONE_WALL = new BYGBlockProperties.BYGStoneWall("mossy_stone_wall");

                BYGBlockList.PODZOL_DACITE = new BYGBlockProperties.BlockOvergrownDaciteBlock("podzol_dacite");
//                BYGBlockList.DACITE_FARMLAND = new BYGBlockProperties.BYGDaciteFarmland("dacite_farmland");
                BYGBlockList.OVERGROWN_DACITE = new BYGBlockProperties.BlockOvergrownDaciteBlock("overgrown_dacite");
                BYGBlockList.OVERGROWN_STONE = new BYGBlockProperties.BlockOvergrownStoneBlock("overgrown_stone");
//                BYGBlockList.STONE_FARMLAND = new BYGBlockProperties.BYGStoneFarmland("stone_farmland");
                BYGBlockList.ROCKY_STONE = new BYGBlockProperties.BYGStone("rocky_stone");
                BYGBlockList.ROCKY_SLAB = new BYGBlockProperties.BYGStoneSlab("rocky_stone_slab");
                BYGBlockList.ROCKY_STAIRS = new BYGBlockProperties.BYGStoneStairs("rocky_stone_stairs");
                BYGBlockList.ROCKY_WALL = new BYGBlockProperties.BYGStoneWall("rocky_stone_wall");

                BYGBlockList.SCORIA_STONE = new BYGBlockProperties.BYGStone("scoria_stone");
                BYGBlockList.SCORIA_SLAB = new BYGBlockProperties.BYGStoneSlab("scoria_stone_slab");
                BYGBlockList.SCORIA_STAIRS = new BYGBlockProperties.BYGStoneStairs("scoria_stone_stairs");
                BYGBlockList.SCORIA_WALL = new BYGBlockProperties.BYGStoneWall("scoria_stone_wall");
                BYGBlockList.SCORIA_COBBLESTONE = new BYGBlockProperties.BYGStone("scoria_cobblestone");
                BYGBlockList.SCORIA_COBBLESTONE_SLAB = new BYGBlockProperties.BYGStoneSlab("scoria_cobblestone_slab");
                BYGBlockList.SCORIA_COBBLESTONE_STAIRS = new BYGBlockProperties.BYGStoneStairs("scoria_cobblestone_stairs");
                BYGBlockList.SCORIA_COBBLESTONE_WALL = new BYGBlockProperties.BYGStoneWall("scoria_cobblestone_wall");
                BYGBlockList.SCORIA_PILLAR = new BYGBlockProperties.BYGPillar("scoria_pillar");
                BYGBlockList.SCORIA_STONEBRICKS = new BYGBlockProperties.BYGStone("scoria_stonebricks");
                BYGBlockList.SCORIA_STONEBRICK_SLAB = new BYGBlockProperties.BYGStoneSlab("scoria_stonebrick_slab");
                BYGBlockList.SCORIA_STONEBRICK_STAIRS = new BYGBlockProperties.BYGStoneStairs("scoria_stonebrick_stairs");
                BYGBlockList.SCORIA_STONEBRICK_WALL = new BYGBlockProperties.BYGStoneWall("scoria_stonebrick_wall");

                BYGBlockList.SOAPSTONE = new BYGBlockProperties.BYGStone("soapstone");
                BYGBlockList.SOAPSTONE_SLAB = new BYGBlockProperties.BYGStoneSlab("soapstone_slab");
                BYGBlockList.SOAPSTONE_STAIRS = new BYGBlockProperties.BYGStoneStairs("soapstone_stairs");
                BYGBlockList.SOAPSTONE_WALL = new BYGBlockProperties.BYGStoneWall("soapstone_wall");
                BYGBlockList.POLISHED_SOAPSTONE = new BYGBlockProperties.BYGStone("polished_soapstone");
                BYGBlockList.POLISHED_SOAPSTONE_SLAB = new BYGBlockProperties.BYGStoneSlab("polished_soapstone_slab");
                BYGBlockList.POLISHED_SOAPSTONE_STAIRS = new BYGBlockProperties.BYGStoneStairs("polished_soapstone_stairs");
                BYGBlockList.POLISHED_SOAPSTONE_WALL = new BYGBlockProperties.BYGStoneWall("polished_soapstone_wall");
                BYGBlockList.SOAPSTONE_BRICKS = new BYGBlockProperties.BYGStone("soapstone_bricks");
                BYGBlockList.SOAPSTONE_BRICK_SLAB = new BYGBlockProperties.BYGStoneSlab("soapstone_brick_slab");
                BYGBlockList.SOAPSTONE_BRICK_STAIRS = new BYGBlockProperties.BYGStoneStairs("soapstone_brick_stairs");
                BYGBlockList.SOAPSTONE_BRICK_WALL = new BYGBlockProperties.BYGStoneWall("soapstone_brick_wall");
                BYGBlockList.SOAPSTONE_PILLAR = new BYGBlockProperties.BYGPillar("soapstone_pillar");
                BYGBlockList.SOAPSTONE_TILE = new BYGBlockProperties.BYGStone("soapstone_tile");
                BYGBlockList.SOAPSTONE_TILE_SLAB = new BYGBlockProperties.BYGStoneSlab("soapstone_tile_slab");
                BYGBlockList.SOAPSTONE_TILE_STAIRS = new BYGBlockProperties.BYGStoneStairs("soapstone_tile_stairs");
                BYGBlockList.SOAPSTONE_TILE_WALL = new BYGBlockProperties.BYGStoneWall("soapstone_tile_wall");

//                Stripped Log BYGBlockRenders
                BYGBlockList.STRIPPED_ASPEN_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_aspen_log");
                BYGBlockList.STRIPPED_BAOBAB_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_baobab_log");
                BYGBlockList.STRIPPED_BLUE_ENCHANTED_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_blue_enchanted_log");
                BYGBlockList.STRIPPED_CHERRY_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_cherry_log");
                BYGBlockList.STRIPPED_CIKA_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_cika_log");
                BYGBlockList.STRIPPED_CYPRESS_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_cypress_log");
                BYGBlockList.STRIPPED_EBONY_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_ebony_log");
                BYGBlockList.STRIPPED_FIR_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_fir_log");
                BYGBlockList.STRIPPED_GREEN_ENCHANTED_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_green_enchanted_log");
                BYGBlockList.STRIPPED_HOLLY_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_holly_log");
                BYGBlockList.STRIPPED_JACARANDA_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_jacaranda_log");
                BYGBlockList.STRIPPED_MAHOGANY_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_mahogany_log");
                BYGBlockList.STRIPPED_MANGROVE_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_mangrove_log");
                BYGBlockList.STRIPPED_MAPLE_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_maple_log");
                BYGBlockList.STRIPPED_PALO_VERDE_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_palo_verde_log");
                BYGBlockList.STRIPPED_PINE_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_pine_log");
                BYGBlockList.STRIPPED_RAINBOW_EUCALYPTUS_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_rainbow_eucalyptus_log");
                BYGBlockList.STRIPPED_SKYRIS_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_skyris_log");
                BYGBlockList.STRIPPED_WILLOW_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_willow_log");
                BYGBlockList.STRIPPED_REDWOOD_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_redwood_log");
                BYGBlockList.STRIPPED_WITCH_HAZEL_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_witch_hazel_log");
                BYGBlockList.STRIPPED_ZELKOVA_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_zelkova_log");

                //Stripped Wood BYGBlockRenders
                BYGBlockList.STRIPPED_ASPEN_WOOD = new BYGBlockProperties.BYGWood("stripped_aspen_wood");
                BYGBlockList.STRIPPED_BAOBAB_WOOD = new BYGBlockProperties.BYGWood("stripped_baobab_wood");
                BYGBlockList.STRIPPED_BLUE_ENCHANTED_WOOD = new BYGBlockProperties.BYGWood("stripped_blue_enchanted_wood");
                BYGBlockList.STRIPPED_CHERRY_WOOD = new BYGBlockProperties.BYGWood("stripped_cherry_wood");
                BYGBlockList.STRIPPED_CIKA_WOOD = new BYGBlockProperties.BYGWood("stripped_cika_wood");
                BYGBlockList.STRIPPED_CYPRESS_WOOD = new BYGBlockProperties.BYGWood("stripped_cypress_wood");
                BYGBlockList.STRIPPED_EBONY_WOOD = new BYGBlockProperties.BYGWood("stripped_ebony_wood");
                BYGBlockList.STRIPPED_FIR_WOOD = new BYGBlockProperties.BYGWood("stripped_fir_wood");
                BYGBlockList.STRIPPED_GREEN_ENCHANTED_WOOD = new BYGBlockProperties.BYGWood("stripped_green_enchanted_wood");
                BYGBlockList.STRIPPED_HOLLY_WOOD = new BYGBlockProperties.BYGWood("stripped_holly_wood");
                BYGBlockList.STRIPPED_JACARANDA_WOOD = new BYGBlockProperties.BYGWood("stripped_jacaranda_wood");
                BYGBlockList.STRIPPED_MAHOGANY_WOOD = new BYGBlockProperties.BYGWood("stripped_mahogany_wood");
                BYGBlockList.STRIPPED_MANGROVE_WOOD = new BYGBlockProperties.BYGWood("stripped_mangrove_wood");
                BYGBlockList.STRIPPED_MAPLE_WOOD = new BYGBlockProperties.BYGWood("stripped_maple_wood");
                BYGBlockList.STRIPPED_PALO_VERDE_WOOD = new BYGBlockProperties.BYGWood("stripped_palo_verde_wood");
                BYGBlockList.STRIPPED_PINE_WOOD = new BYGBlockProperties.BYGWood("stripped_pine_wood");
                BYGBlockList.STRIPPED_RAINBOW_EUCALYPTUS_WOOD = new BYGBlockProperties.BYGWood("stripped_rainbow_eucalyptus_wood");
                BYGBlockList.STRIPPED_SKYRIS_WOOD = new BYGBlockProperties.BYGWood("stripped_skyris_wood");
                BYGBlockList.STRIPPED_WILLOW_WOOD = new BYGBlockProperties.BYGWood("stripped_willow_wood");
                BYGBlockList.STRIPPED_REDWOOD_WOOD = new BYGBlockProperties.BYGWood("stripped_redwood_wood");
                BYGBlockList.STRIPPED_WITCH_HAZEL_WOOD = new BYGBlockProperties.BYGWood("stripped_witch_hazel_wood");
                BYGBlockList.STRIPPED_ZELKOVA_WOOD = new BYGBlockProperties.BYGWood("stripped_zelkova_wood");

                //Flower BYGBlockRenders
                BYGBlockList.TALL_PINK_ALLIUM = new BYGBlockProperties.BYGDoublePlant("tall_pink_allium");
                BYGBlockList.TALL_ALLIUM = new BYGBlockProperties.BYGDoublePlant("tall_allium");
                BYGBlockList.ALLIUM_FLOWER_BUSH = new BYGBlockProperties.BYGTallAllium("allium_flower_bush");
                BYGBlockList.ALPINE_BELLFLOWER = new BYGBlockProperties.BYGFlower("alpine_bellflower");
                BYGBlockList.AMARANTH = new BYGBlockProperties.BYGAmaranth("amaranth");
                BYGBlockList.ANGELICA = new BYGBlockProperties.BYGFlower("angelica");
                BYGBlockList.AZALEA = new BYGBlockProperties.BYGDoublePlant("azalea");
                BYGBlockList.BEGONIA = new BYGBlockProperties.BYGFlower("begonia");
                BYGBlockList.BISTORT = new BYGBlockProperties.BYGFlower("bistort");
                BYGBlockList.BLUE_SAGE = new BYGBlockProperties.BYGFlower("blue_sage");
                BYGBlockList.CALIFORNIA_POPPY = new BYGBlockProperties.BYGFlower("california_poppy");
                BYGBlockList.CROCUS = new BYGBlockProperties.BYGFlower("crocus");
                BYGBlockList.BLACK_ROSE = new BYGBlockProperties.BYGFlower("black_rose");
                BYGBlockList.CYAN_AMARANTH = new BYGBlockProperties.BYGAmaranth("cyan_amaranth");
                BYGBlockList.CYAN_ROSE = new BYGBlockProperties.BYGFlower("cyan_rose");
                BYGBlockList.CYAN_TULIP = new BYGBlockProperties.BYGFlower("cyan_tulip");
                BYGBlockList.DAFFODIL = new BYGBlockProperties.BYGFlower("daffodil");
                BYGBlockList.DELPHINIUM = new BYGBlockProperties.BYGDoublePlant("delphinium");
                BYGBlockList.FAIRY_SLIPPER = new BYGBlockProperties.BYGFairySlipperFlower("fairy_slipper");
                BYGBlockList.FIRECRACKER_FLOWER_BUSH = new BYGBlockProperties.BYGFlower("firecracker_flower_bush");
                BYGBlockList.FOXGLOVE = new BYGBlockProperties.BYGDoublePlant("foxglove");
                BYGBlockList.GOLDEN_SPINED_CACTUS = new BYGBlockProperties.BYGDesertPlant("golden_spined_cactus");
                BYGBlockList.GREEN_TULIP = new BYGBlockProperties.BYGFlower("green_tulip");
                BYGBlockList.GUZMANIA = new BYGBlockProperties.BYGFlower("guzmania");
                BYGBlockList.INCAN_LILY = new BYGBlockProperties.BYGFlower("incan_lily");
                BYGBlockList.IRIS = new BYGBlockProperties.BYGFlower("iris");
                BYGBlockList.JAPANESE_ORCHID = new BYGBlockProperties.BYGDoublePlant("japanese_orchid");
                BYGBlockList.KOVAN_FLOWER = new BYGBlockProperties.BYGFlower("kovan_flower");
                BYGBlockList.LAZARUS_BELLFLOWER = new BYGBlockProperties.BYGFlower("lazarus_bellflower");
                BYGBlockList.LOLIPOP_FLOWER = new BYGBlockProperties.BYGFlower("lolipop_flower");
                BYGBlockList.MAGENTA_AMARANTH = new BYGBlockProperties.BYGAmaranth("magenta_amaranth");
                BYGBlockList.MAGENTA_TULIP = new BYGBlockProperties.BYGFlower("magenta_tulip");
                BYGBlockList.ORANGE_AMARANTH = new BYGBlockProperties.BYGFlower("orange_amaranth");
                BYGBlockList.ORANGE_DAISY = new BYGBlockProperties.BYGFlower("orange_daisy");
                BYGBlockList.ORSIRIA_ROSE = new BYGBlockProperties.BYGFlower("osiria_rose");
                BYGBlockList.PEACH_LEATHER_FLOWER = new BYGBlockProperties.BYGFlower("peach_leather_flower");
                BYGBlockList.PINK_ALLIUM = new BYGBlockProperties.BYGFlower("pink_allium");
                BYGBlockList.PINK_ALLIUM_FLOWER_BUSH = new BYGBlockProperties.BYGPinkTallAllium("pink_allium_flower_bush");
                BYGBlockList.PINK_ANEMONE = new BYGBlockProperties.BYGFlower("pink_anemone");
                BYGBlockList.PINK_DAFFODIL = new BYGBlockProperties.BYGFlower("pink_daffodil");
                BYGBlockList.PINK_ORCHID = new BYGBlockProperties.BYGFlower("pink_orchid");
                BYGBlockList.PRAIRIE_GRASS = new BYGBlockProperties.BYGPrairieGrass("prairie_grass");
                BYGBlockList.PROTEA_FLOWER = new BYGBlockProperties.BYGFlower("protea_flower");
                BYGBlockList.PURPLE_AMARANTH = new BYGBlockProperties.BYGAmaranth("purple_amaranth");
                BYGBlockList.PURPLE_ORCHID = new BYGBlockProperties.BYGFlower("purple_orchid");
                BYGBlockList.PURPLE_SAGE = new BYGBlockProperties.BYGFlower("purple_sage");
                BYGBlockList.PURPLE_TULIP = new BYGBlockProperties.BYGFlower("purple_tulip");
                BYGBlockList.RED_CORNFLOWER = new BYGBlockProperties.BYGFlower("red_cornflower");
                BYGBlockList.RED_ORCHID = new BYGBlockProperties.BYGFlower("red_orchid");
                BYGBlockList.RICHEA = new BYGBlockProperties.BYGFlower("richea");
                BYGBlockList.ROSE = new BYGBlockProperties.BYGFlower("rose");
                BYGBlockList.SNOWDROPS = new BYGBlockProperties.BYGSnowyPlant("snowdrops");
                BYGBlockList.SILVER_VASE_FLOWER = new BYGBlockProperties.BYGFlower("silver_vase_flower");
                BYGBlockList.TORCH_GINGER = new BYGBlockProperties.BYGFlower("torch_ginger");
                BYGBlockList.VIOLET_LEATHER_FLOWER = new BYGBlockProperties.BYGFlower("violet_leather_flower");
                BYGBlockList.WHITE_ANEMONE = new BYGBlockProperties.BYGFlower("white_anemone");
                BYGBlockList.WHITE_SAGE = new BYGBlockProperties.BYGFlower("white_sage");
                BYGBlockList.WINTER_CYCLAMEN = new BYGBlockProperties.BYGSnowyPlant("winter_cyclamen");
                BYGBlockList.WINTER_ROSE = new BYGBlockProperties.BYGSnowyPlant("winter_rose");
                BYGBlockList.WINTER_SCILLA = new BYGBlockProperties.BYGSnowyPlant("winter_scilla");
                BYGBlockList.YELLOW_DAFFODIL = new BYGBlockProperties.BYGFlower("yellow_daffodil");
                BYGBlockList.YELLOW_TULIP = new BYGBlockProperties.BYGFlower("yellow_tulip");
    }
}
