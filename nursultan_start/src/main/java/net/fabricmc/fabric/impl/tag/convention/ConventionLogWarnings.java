/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00751
 *  minecraft.class01012
 *  minecraft.class01022
 *  minecraft.class01226
 *  minecraft.class01894
 *  minecraft.class03530
 *  minecraft.class04227
 *  minecraft.class05946
 *  net.fabricmc.api.ModInitializer
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents
 *  net.fabricmc.fabric.api.tag.convention.v1.ConventionalBiomeTags
 *  net.fabricmc.fabric.api.tag.convention.v1.ConventionalBlockTags
 *  net.fabricmc.fabric.api.tag.convention.v1.ConventionalEnchantmentTags
 *  net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags
 *  net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags
 *  net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags
 *  net.fabricmc.fabric.api.tag.convention.v2.ConventionalEnchantmentTags
 *  net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags
 *  net.fabricmc.loader.api.FabricLoader
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.tag.convention;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.AbstractMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import minecraft.class00751;
import minecraft.class01012;
import minecraft.class01022;
import minecraft.class01226;
import minecraft.class01894;
import minecraft.class03530;
import minecraft.class04227;
import minecraft.class05946;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalBiomeTags;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalEnchantmentTags;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.fabricmc.fabric.impl.tag.convention.ConventionLogWarnings$LogWarningMode;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConventionLogWarnings
implements ModInitializer {
    private static Logger LOGGER = LoggerFactory.getLogger(ConventionLogWarnings.class);
    private static final ConventionLogWarnings$LogWarningMode LOG_LEGACY_WARNING_MODE = ConventionLogWarnings.setupLogWarningModeProperty();
    private static final Map<class03530<?>, class03530<?>> LEGACY_C_TAGS = Map.ofEntries(ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalBlockTags.MOVEMENT_RESTRICTED, ConventionalBlockTags.RELOCATION_NOT_SUPPORTED), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalBlockTags.QUARTZ_ORES, ConventionalBlockTags.QUARTZ_ORES), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalBlockTags.WOODEN_BARRELS, ConventionalBlockTags.WOODEN_BARRELS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalBlockTags.SANDSTONE_BLOCKS, ConventionalBlockTags.SANDSTONE_BLOCKS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalBlockTags.SANDSTONE_STAIRS, ConventionalBlockTags.SANDSTONE_STAIRS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalBlockTags.SANDSTONE_SLABS, ConventionalBlockTags.SANDSTONE_SLABS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalBlockTags.RED_SANDSTONE_BLOCKS, ConventionalBlockTags.RED_SANDSTONE_BLOCKS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalBlockTags.RED_SANDSTONE_STAIRS, ConventionalBlockTags.RED_SANDSTONE_STAIRS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalBlockTags.RED_SANDSTONE_SLABS, ConventionalBlockTags.RED_SANDSTONE_SLABS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalBlockTags.UNCOLORED_SANDSTONE_BLOCKS, ConventionalBlockTags.UNCOLORED_SANDSTONE_BLOCKS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalBlockTags.UNCOLORED_SANDSTONE_STAIRS, ConventionalBlockTags.UNCOLORED_SANDSTONE_STAIRS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalBlockTags.UNCOLORED_SANDSTONE_SLABS, ConventionalBlockTags.UNCOLORED_SANDSTONE_SLABS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.QUARTZ_ORES, ConventionalItemTags.QUARTZ_ORES), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.WOODEN_BARRELS, ConventionalItemTags.WOODEN_BARRELS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.SANDSTONE_BLOCKS, ConventionalItemTags.SANDSTONE_BLOCKS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.SANDSTONE_STAIRS, ConventionalItemTags.SANDSTONE_STAIRS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.SANDSTONE_SLABS, ConventionalItemTags.SANDSTONE_SLABS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.RED_SANDSTONE_BLOCKS, ConventionalItemTags.RED_SANDSTONE_BLOCKS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.RED_SANDSTONE_STAIRS, ConventionalItemTags.RED_SANDSTONE_STAIRS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.RED_SANDSTONE_SLABS, ConventionalItemTags.RED_SANDSTONE_SLABS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.UNCOLORED_SANDSTONE_BLOCKS, ConventionalItemTags.UNCOLORED_SANDSTONE_BLOCKS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.UNCOLORED_SANDSTONE_STAIRS, ConventionalItemTags.UNCOLORED_SANDSTONE_STAIRS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.BLACK_DYES, ConventionalItemTags.BLACK_DYES), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.BLUE_DYES, ConventionalItemTags.BLUE_DYES), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.BROWN_DYES, ConventionalItemTags.BROWN_DYES), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.GREEN_DYES, ConventionalItemTags.GREEN_DYES), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.RED_DYES, ConventionalItemTags.RED_DYES), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.WHITE_DYES, ConventionalItemTags.WHITE_DYES), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.YELLOW_DYES, ConventionalItemTags.YELLOW_DYES), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.LIGHT_BLUE_DYES, ConventionalItemTags.LIGHT_BLUE_DYES), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.LIGHT_GRAY_DYES, ConventionalItemTags.LIGHT_GRAY_DYES), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.LIME_DYES, ConventionalItemTags.LIME_DYES), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.MAGENTA_DYES, ConventionalItemTags.MAGENTA_DYES), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.ORANGE_DYES, ConventionalItemTags.ORANGE_DYES), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.PINK_DYES, ConventionalItemTags.PINK_DYES), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.CYAN_DYES, ConventionalItemTags.CYAN_DYES), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.GRAY_DYES, ConventionalItemTags.GRAY_DYES), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.PURPLE_DYES, ConventionalItemTags.PURPLE_DYES), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.RAW_IRON_ORES, ConventionalItemTags.IRON_RAW_MATERIALS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.RAW_GOLD_ORES, ConventionalItemTags.GOLD_RAW_MATERIALS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.DIAMONDS, ConventionalItemTags.DIAMOND_GEMS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.LAPIS, ConventionalItemTags.LAPIS_GEMS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.EMERALDS, ConventionalItemTags.EMERALD_GEMS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.QUARTZ, ConventionalItemTags.QUARTZ_GEMS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.SHEARS, ConventionalItemTags.SHEAR_TOOLS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.SPEARS, ConventionalItemTags.SPEAR_TOOLS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.BOWS, ConventionalItemTags.BOW_TOOLS), ConventionLogWarnings.createMapEntry(net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags.SHIELDS, ConventionalItemTags.SHIELD_TOOLS), ConventionLogWarnings.createMapEntry(ConventionalEnchantmentTags.INCREASES_BLOCK_DROPS, net.fabricmc.fabric.api.tag.convention.v2.ConventionalEnchantmentTags.INCREASE_BLOCK_DROPS), ConventionLogWarnings.createMapEntry(ConventionalEnchantmentTags.INCREASES_ENTITY_DROPS, net.fabricmc.fabric.api.tag.convention.v2.ConventionalEnchantmentTags.INCREASE_ENTITY_DROPS), ConventionLogWarnings.createMapEntry(ConventionalEnchantmentTags.ENTITY_MOVEMENT_ENHANCEMENT, net.fabricmc.fabric.api.tag.convention.v2.ConventionalEnchantmentTags.ENTITY_SPEED_ENHANCEMENTS), ConventionLogWarnings.createMapEntry(ConventionalEnchantmentTags.ENTITY_DEFENSE_ENHANCEMENT, net.fabricmc.fabric.api.tag.convention.v2.ConventionalEnchantmentTags.ENTITY_DEFENSE_ENHANCEMENTS), ConventionLogWarnings.createMapEntry(ConventionalBiomeTags.IN_NETHER, net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags.IS_NETHER), ConventionLogWarnings.createMapEntry(ConventionalBiomeTags.IN_THE_END, net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags.IS_END), ConventionLogWarnings.createMapEntry(ConventionalBiomeTags.IN_OVERWORLD, net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags.IS_OVERWORLD), ConventionLogWarnings.createMapEntry(ConventionalBiomeTags.CAVES, net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags.IS_CAVE), ConventionLogWarnings.createMapEntry(ConventionalBiomeTags.CLIMATE_COLD, net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags.IS_COLD), ConventionLogWarnings.createMapEntry(ConventionalBiomeTags.CLIMATE_TEMPERATE, net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags.IS_TEMPERATE), ConventionLogWarnings.createMapEntry(ConventionalBiomeTags.CLIMATE_HOT, net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags.IS_HOT), ConventionLogWarnings.createMapEntry(ConventionalBiomeTags.CLIMATE_WET, net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags.IS_WET), ConventionLogWarnings.createMapEntry(ConventionalBiomeTags.CLIMATE_DRY, net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags.IS_DRY), ConventionLogWarnings.createMapEntry(ConventionalBiomeTags.VEGETATION_DENSE, net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags.IS_VEGETATION_DENSE), ConventionLogWarnings.createMapEntry(ConventionalBiomeTags.VEGETATION_SPARSE, net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags.IS_VEGETATION_SPARSE), ConventionLogWarnings.createMapEntry(ConventionalBiomeTags.TREE_CONIFEROUS, net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags.IS_CONIFEROUS_TREE), ConventionLogWarnings.createMapEntry(ConventionalBiomeTags.TREE_DECIDUOUS, net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags.IS_DECIDUOUS_TREE), ConventionLogWarnings.createMapEntry(ConventionalBiomeTags.TREE_JUNGLE, net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags.IS_JUNGLE_TREE), ConventionLogWarnings.createMapEntry(ConventionalBiomeTags.TREE_SAVANNA, net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags.IS_SAVANNA_TREE), ConventionLogWarnings.createMapEntry(ConventionalBiomeTags.MOUNTAIN_PEAK, net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags.IS_MOUNTAIN_PEAK), ConventionLogWarnings.createMapEntry(ConventionalBiomeTags.MOUNTAIN_SLOPE, net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags.IS_MOUNTAIN_SLOPE), ConventionLogWarnings.createMapEntry(ConventionalBiomeTags.END_ISLANDS, net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags.IS_OUTER_END_ISLAND), ConventionLogWarnings.createMapEntry(ConventionalBiomeTags.NETHER_FORESTS, net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags.IS_NETHER_FOREST), ConventionLogWarnings.createMapEntry(ConventionalBiomeTags.FLOWER_FORESTS, net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags.IS_FLOWER_FOREST), ConventionLogWarnings.createMapEntry(class04227.Z, "barrel", ConventionalBlockTags.BARRELS), ConventionLogWarnings.createMapEntry(class04227.Z, "chest", ConventionalBlockTags.CHESTS), ConventionLogWarnings.createMapEntry(class04227.Z, "wooden_chests", ConventionalBlockTags.WOODEN_CHESTS), ConventionLogWarnings.createMapEntry(class04227.Z, "glass", ConventionalBlockTags.GLASS_BLOCKS), ConventionLogWarnings.createMapEntry(class04227.Z, "glass_pane", ConventionalBlockTags.GLASS_PANES), ConventionLogWarnings.createMapEntry(class04227.Z, "immobile", ConventionalBlockTags.RELOCATION_NOT_SUPPORTED), ConventionLogWarnings.createMapEntry(class04227.Z, "stone", ConventionalBlockTags.STONES), ConventionLogWarnings.createMapEntry(class04227.Z, "cobblestone", ConventionalBlockTags.COBBLESTONES), ConventionLogWarnings.createMapEntry(class04227.Z, "workbench", ConventionalBlockTags.VILLAGER_JOB_SITES), ConventionLogWarnings.createMapEntry(class04227.Z, "workbenches", ConventionalBlockTags.VILLAGER_JOB_SITES), ConventionLogWarnings.createMapEntry(class04227.Z, "workstation", ConventionalBlockTags.VILLAGER_JOB_SITES), ConventionLogWarnings.createMapEntry(class04227.Z, "workstations", ConventionalBlockTags.VILLAGER_JOB_SITES), ConventionLogWarnings.createMapEntry(class04227.Z, "crafting_table", ConventionalBlockTags.PLAYER_WORKSTATIONS_CRAFTING_TABLES), ConventionLogWarnings.createMapEntry(class04227.Z, "crafting_tables", ConventionalBlockTags.PLAYER_WORKSTATIONS_CRAFTING_TABLES), ConventionLogWarnings.createMapEntry(class04227.Z, "furnace", ConventionalBlockTags.PLAYER_WORKSTATIONS_FURNACES), ConventionLogWarnings.createMapEntry(class04227.Z, "furnaces", ConventionalBlockTags.PLAYER_WORKSTATIONS_FURNACES), ConventionLogWarnings.createMapEntry(class04227.F, "axes", class01226.Ly), ConventionLogWarnings.createMapEntry(class04227.F, "pickaxes", class01226.Lu), ConventionLogWarnings.createMapEntry(class04227.F, "hoes", class01226.LL), ConventionLogWarnings.createMapEntry(class04227.F, "shovels", class01226.Li), ConventionLogWarnings.createMapEntry(class04227.F, "swords", class01226.LN), ConventionLogWarnings.createMapEntry(ConventionLogWarnings.createTagKeyUnderFabric(class04227.F, "axes"), class01226.Ly), ConventionLogWarnings.createMapEntry(ConventionLogWarnings.createTagKeyUnderFabric(class04227.F, "pickaxes"), class01226.Lu), ConventionLogWarnings.createMapEntry(ConventionLogWarnings.createTagKeyUnderFabric(class04227.F, "hoes"), class01226.LL), ConventionLogWarnings.createMapEntry(ConventionLogWarnings.createTagKeyUnderFabric(class04227.F, "shovels"), class01226.Li), ConventionLogWarnings.createMapEntry(ConventionLogWarnings.createTagKeyUnderFabric(class04227.F, "swords"), class01226.LN), ConventionLogWarnings.createMapEntry(class04227.F, "wrenches", ConventionalItemTags.WRENCH_TOOLS), ConventionLogWarnings.createMapEntry(class04227.F, "tools/wrenches", ConventionalItemTags.WRENCH_TOOLS), ConventionLogWarnings.createMapEntry(class04227.F, "barrel", ConventionalItemTags.BARRELS), ConventionLogWarnings.createMapEntry(class04227.F, "chest", ConventionalItemTags.CHESTS), ConventionLogWarnings.createMapEntry(class04227.F, "glass", ConventionalItemTags.GLASS_BLOCKS), ConventionLogWarnings.createMapEntry(class04227.F, "glass_pane", ConventionalItemTags.GLASS_PANES), ConventionLogWarnings.createMapEntry(class04227.F, "glowstone_dusts", ConventionalItemTags.GLOWSTONE_DUSTS), ConventionLogWarnings.createMapEntry(class04227.F, "redstone_dusts", ConventionalItemTags.REDSTONE_DUSTS), ConventionLogWarnings.createMapEntry(class04227.F, "stone", ConventionalItemTags.STONES), ConventionLogWarnings.createMapEntry(class04227.F, "string", ConventionalItemTags.STRINGS), ConventionLogWarnings.createMapEntry(class04227.F, "sticks", ConventionalItemTags.WOODEN_RODS), ConventionLogWarnings.createMapEntry(class04227.F, "wooden_rods", ConventionalItemTags.WOODEN_RODS), ConventionLogWarnings.createMapEntry(class04227.F, "food", ConventionalItemTags.FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "fruit", ConventionalItemTags.FRUIT_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "fruits", ConventionalItemTags.FRUIT_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "vegetable", ConventionalItemTags.VEGETABLE_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "vegetables", ConventionalItemTags.VEGETABLE_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "berry", ConventionalItemTags.BERRY_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "berries", ConventionalItemTags.BERRY_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "bread", ConventionalItemTags.BREAD_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "breads", ConventionalItemTags.BREAD_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "cookie", ConventionalItemTags.COOKIE_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "cookies", ConventionalItemTags.COOKIE_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "raw_meat", ConventionalItemTags.RAW_MEAT_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "raw_meats", ConventionalItemTags.RAW_MEAT_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "raw_fish", ConventionalItemTags.RAW_FISH_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "raw_fishes", ConventionalItemTags.RAW_FISH_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "cooked_meat", ConventionalItemTags.COOKED_MEAT_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "cooked_meats", ConventionalItemTags.COOKED_MEAT_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "cooked_fish", ConventionalItemTags.COOKED_FISH_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "cooked_fishes", ConventionalItemTags.COOKED_FISH_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "soup", ConventionalItemTags.SOUP_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "soups", ConventionalItemTags.SOUP_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "stew", ConventionalItemTags.SOUP_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "stews", ConventionalItemTags.SOUP_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "candy", ConventionalItemTags.CANDY_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "candies", ConventionalItemTags.CANDY_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "pie", ConventionalItemTags.PIE_FOODS), ConventionLogWarnings.createMapEntry(class04227.F, "pies", ConventionalItemTags.PIE_FOODS), ConventionLogWarnings.createMapEntry(class03530.N((class05946)class04227.F, (class01894)class01894.N((String)"minecraft", (String)"music_discs")), ConventionalItemTags.MUSIC_DISCS), ConventionLogWarnings.createMapEntry(class03530.N((class05946)class04227.F, (class01894)class01894.N((String)"minecraft", (String)"tall_flowers")), ConventionalItemTags.TALL_FLOWERS), ConventionLogWarnings.createMapEntry(class03530.N((class05946)class04227.F, (class01894)class01894.N((String)"minecraft", (String)"flowers")), ConventionalItemTags.FLOWERS), ConventionLogWarnings.createMapEntry(class03530.N((class05946)class04227.Z, (class01894)class01894.N((String)"minecraft", (String)"tall_flowers")), ConventionalBlockTags.TALL_FLOWERS));

    private static void setupLegacyTagWarning() {
        ServerLifecycleEvents.SERVER_STARTED.register(class027962 -> {
            ObjectArrayList objectArrayList = new ObjectArrayList();
            class01022 class010222 = class027962.yt();
            class010222.method_40311().forEach(arg_0 -> ConventionLogWarnings.lambda$setupLegacyTagWarning$1((List)objectArrayList, arg_0));
            if (objectArrayList.isEmpty()) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\n\tDev warning - Legacy Tags detected. Please migrate your old tags to our new format that follows better conventions!\n\tSee classes under net.fabricmc.fabric.api.tag.convention.v2 package for all tags.\n\n\tNOTE: Many tags have been moved around or renamed. Some new ones were added so please review the new tags.\n\tAnd make sure you follow tag conventions for new tags! The convention is `c` with nouns generally being plural and adjectives being singular.\n\tYou can disable this message by this system property to your runs: `-Dfabric-tag-conventions-v1.legacyTagWarning=SILENCED`.\n\tTo see individual legacy tags found, set the system property to `-Dfabric-tag-conventions-v1.legacyTagWarning=VERBOSE` instead. Default is `SHORT`.\n");
            if (LOG_LEGACY_WARNING_MODE.isVerbose()) {
                stringBuilder.append("\nLegacy tags and their replacement:");
                for (class03530 class035302 : objectArrayList) {
                    stringBuilder.append("\n     ").append(class035302).append("  ->  ").append(LEGACY_C_TAGS.get(class035302));
                }
            }
            LOGGER.warn(stringBuilder.toString());
            if (LOG_LEGACY_WARNING_MODE == ConventionLogWarnings$LogWarningMode.FAIL) {
                throw new RuntimeException("Legacy Tag validation failed");
            }
        });
    }

    private static <T> class03530<T> createTagKeyUnderFabric(class05946<class00751<T>> class059462, String string) {
        return class03530.N(class059462, (class01894)class01894.N((String)"fabric", (String)string));
    }

    private static <T> AbstractMap.SimpleEntry<class03530<T>, class03530<T>> createMapEntry(class05946<class00751<T>> class059462, String string, class03530<T> class035302) {
        return new AbstractMap.SimpleEntry<class03530<T>, class03530<T>>(ConventionLogWarnings.createTagKeyUnderC(class059462, string), class035302);
    }

    private static <T> AbstractMap.SimpleEntry<class03530<T>, class03530<T>> createMapEntry(class03530<T> class035302, class03530<T> class035303) {
        return new AbstractMap.SimpleEntry<class03530<T>, class03530<T>>(class035302, class035303);
    }

    private static <T> AbstractMap.SimpleEntry<class03530<T>, class03530<T>> createMapEntry(class05946<class00751<T>> class059462, String string, String string2) {
        return new AbstractMap.SimpleEntry<class03530<T>, class03530<T>>(ConventionLogWarnings.createTagKeyUnderC(class059462, string), ConventionLogWarnings.createTagKeyUnderC(class059462, string2));
    }

    private static <T> class03530<T> createTagKeyUnderC(class05946<class00751<T>> class059462, String string) {
        return class03530.N(class059462, (class01894)class01894.N((String)"c", (String)string));
    }

    private static ConventionLogWarnings$LogWarningMode setupLogWarningModeProperty() {
        String string = System.getProperty("fabric-tag-conventions-v1.legacyTagWarning", ConventionLogWarnings$LogWarningMode.SHORT.name()).toUpperCase(Locale.ROOT);
        try {
            return ConventionLogWarnings$LogWarningMode.valueOf(string);
        }
        catch (Exception exception) {
            LOGGER.error("Unknown entry `{}` for property `fabric-tag-conventions-v1.legacyTagWarning`.", (Object)string);
            return ConventionLogWarnings$LogWarningMode.SILENCED;
        }
    }

    private static /* synthetic */ void lambda$setupLegacyTagWarning$1(List list, class01012 class010122) {
        if (class010122.N().N().y().equals("minecraft")) {
            class010122.y().U().forEach(class035522 -> {
                class03530 class035302 = class03530.N((class05946)class010122.N(), (class01894)class035522.B().y());
                if (LEGACY_C_TAGS.containsKey(class035302)) {
                    list.add(class035302);
                }
            });
        }
    }

    public void onInitialize() {
        if (FabricLoader.getInstance().isDevelopmentEnvironment() && LOG_LEGACY_WARNING_MODE != ConventionLogWarnings$LogWarningMode.SILENCED) {
            ConventionLogWarnings.setupLegacyTagWarning();
        }
    }
}

