/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00189
 *  minecraft.class01631
 *  minecraft.class01683
 *  minecraft.class03458
 *  minecraft.class06202
 */
package de.maxhenkel.voicechat.gui;

import java.util.UUID;
import minecraft.class00189;
import minecraft.class01631;
import minecraft.class01683;
import minecraft.class03458;
import minecraft.class06202;

public class GameProfileUtils {
    private static final class06202 mc = class06202.Nq();

    public static class01631 getSkin(UUID uUID) {
        class01683 class016832 = mc.NE();
        if (class016832 == null) {
            return class00189.N((UUID)uUID);
        }
        class03458 class034582 = class016832.N(uUID);
        if (class034582 == null) {
            return class00189.N((UUID)uUID);
        }
        return class034582.M();
    }
}

