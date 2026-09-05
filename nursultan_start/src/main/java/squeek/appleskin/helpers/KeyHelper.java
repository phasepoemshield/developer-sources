/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04655
 *  minecraft.class06202
 *  minecraft.class07533
 *  minecraft.class07536
 *  minecraft.class08844
 */
package squeek.appleskin.helpers;

import minecraft.class04655;
import minecraft.class06202;
import minecraft.class07533;
import minecraft.class07536;
import minecraft.class08844;

public class KeyHelper {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean isShiftKeyDown() {
        class08844 class088442 = class06202.Nq().Nt();
        if (class04655.N((class08844)class088442, (int)340)) return true;
        if (!class04655.N((class08844)class088442, (int)344)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean isCtrlKeyDown() {
        class08844 class088442 = class06202.Nq().Nt();
        if (class04655.N((class08844)class088442, (int)341)) return true;
        if (class04655.N((class08844)class088442, (int)345)) {
            return true;
        }
        boolean bl = false;
        boolean bl2 = bl;
        if (bl2) return bl2;
        if (class07536.m() != class07533.field_1137) return bl2;
        if (class04655.N((class08844)class088442, (int)343)) return true;
        if (!class04655.N((class08844)class088442, (int)347)) return false;
        return true;
    }
}

