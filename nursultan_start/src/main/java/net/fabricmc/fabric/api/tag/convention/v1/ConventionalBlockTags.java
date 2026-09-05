/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class03530
 *  net.fabricmc.fabric.impl.tag.convention.TagRegistration
 */
package net.fabricmc.fabric.api.tag.convention.v1;

import minecraft.class00891;
import minecraft.class03530;
import net.fabricmc.fabric.impl.tag.convention.TagRegistration;

@Deprecated
public final class ConventionalBlockTags {
    public static final class03530<class00891> ORES = ConventionalBlockTags.register("ores");
    public static final class03530<class00891> QUARTZ_ORES = ConventionalBlockTags.register("quartz_ores");
    public static final class03530<class00891> BOOKSHELVES = ConventionalBlockTags.register("bookshelves");
    public static final class03530<class00891> CHESTS = ConventionalBlockTags.register("chests");
    public static final class03530<class00891> GLASS_BLOCKS = ConventionalBlockTags.register("glass_blocks");
    public static final class03530<class00891> GLASS_PANES = ConventionalBlockTags.register("glass_panes");
    public static final class03530<class00891> SHULKER_BOXES = ConventionalBlockTags.register("shulker_boxes");
    public static final class03530<class00891> WOODEN_BARRELS = ConventionalBlockTags.register("wooden_barrels");
    public static final class03530<class00891> BUDDING_BLOCKS = ConventionalBlockTags.register("budding_blocks");
    public static final class03530<class00891> BUDS = ConventionalBlockTags.register("buds");
    public static final class03530<class00891> CLUSTERS = ConventionalBlockTags.register("clusters");
    public static final class03530<class00891> VILLAGER_JOB_SITES = ConventionalBlockTags.register("villager_job_sites");
    public static final class03530<class00891> SANDSTONE_BLOCKS = ConventionalBlockTags.register("sandstone_blocks");
    public static final class03530<class00891> SANDSTONE_SLABS = ConventionalBlockTags.register("sandstone_slabs");
    public static final class03530<class00891> SANDSTONE_STAIRS = ConventionalBlockTags.register("sandstone_stairs");
    public static final class03530<class00891> RED_SANDSTONE_BLOCKS = ConventionalBlockTags.register("red_sandstone_blocks");
    public static final class03530<class00891> RED_SANDSTONE_SLABS = ConventionalBlockTags.register("red_sandstone_slabs");
    public static final class03530<class00891> RED_SANDSTONE_STAIRS = ConventionalBlockTags.register("red_sandstone_stairs");
    public static final class03530<class00891> UNCOLORED_SANDSTONE_BLOCKS = ConventionalBlockTags.register("uncolored_sandstone_blocks");
    public static final class03530<class00891> UNCOLORED_SANDSTONE_SLABS = ConventionalBlockTags.register("uncolored_sandstone_slabs");
    public static final class03530<class00891> UNCOLORED_SANDSTONE_STAIRS = ConventionalBlockTags.register("uncolored_sandstone_stairs");
    public static final class03530<class00891> MOVEMENT_RESTRICTED = ConventionalBlockTags.register("movement_restricted");

    private ConventionalBlockTags() {
    }

    private static class03530<class00891> register(String string) {
        return TagRegistration.BLOCK_TAG_REGISTRATION.registerC(string);
    }
}

