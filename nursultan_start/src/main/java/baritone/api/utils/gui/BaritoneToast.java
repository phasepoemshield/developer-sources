/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class06086
 *  minecraft.class06095
 *  minecraft.class06132
 *  minecraft.class06202
 */
package baritone.api.utils.gui;

import minecraft.class00392;
import minecraft.class06086;
import minecraft.class06095;
import minecraft.class06132;
import minecraft.class06202;

public class BaritoneToast {
    private static final class06095 BARITONE_TOAST_ID = new class06095(5000L);

    public static void addOrUpdate(class00392 class003922, class00392 class003923) {
        class06132.y((class06086)class06202.Nq().m(), (class06095)BARITONE_TOAST_ID, (class00392)class003922, (class00392)class003923);
    }
}

