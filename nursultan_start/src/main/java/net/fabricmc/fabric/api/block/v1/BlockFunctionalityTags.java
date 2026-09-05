/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class03530
 *  minecraft.class04227
 *  minecraft.class05946
 */
package net.fabricmc.fabric.api.block.v1;

import minecraft.class00891;
import minecraft.class01894;
import minecraft.class03530;
import minecraft.class04227;
import minecraft.class05946;

public final class BlockFunctionalityTags {
    public static final class03530<class00891> CAN_CLIMB_TRAPDOOR_ABOVE = BlockFunctionalityTags.create("can_climb_trapdoor_above");

    private static class03530<class00891> create(String string) {
        return class03530.N((class05946)class04227.Z, (class01894)class01894.N((String)"fabric", (String)string));
    }

    private BlockFunctionalityTags() {
    }
}

