/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00624
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class07027
 *  minecraft.class07131
 *  minecraft.class07734
 */
package com.viaversion.viafabricplus.features.block.interaction;

import minecraft.class00624;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class07027;
import minecraft.class07131;
import minecraft.class07734;

public final class Block1_14 {
    public static boolean isExceptBlockForAttachWithPiston(class00891 class008912) {
        return class008912 instanceof class07027 || class008912 instanceof class07131 || class008912 instanceof class00624 || class008912 instanceof class07734 || class008912 == class00869.MO || class008912 == class00869.MZ || class008912 == class00869.ND || class008912 == class00869.io || class008912 == class00869.iT || class008912 == class00869.zN || class008912 == class00869.yq || class008912 == class00869.yd || class008912 == class00869.yK;
    }
}

