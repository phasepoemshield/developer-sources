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
package dev.isxander.yacl3.gui.utils;

import minecraft.class04655;
import minecraft.class06202;
import minecraft.class07533;
import minecraft.class07536;
import minecraft.class08844;

public final class KeyUtils {
    private KeyUtils() {
    }

    public static int getDigit(int n) {
        int n2 = n - 48;
        return n2 >= 0 && n2 <= 9 ? n2 : -1;
    }

    public static boolean isUp(int n) {
        return n == 265;
    }

    public static boolean isCopy(int n, int n2) {
        return n == 67 && KeyUtils.hasControlDown(n2) && !KeyUtils.hasShiftDown(n2) && !KeyUtils.hasAltDown(n2);
    }

    public static boolean isLeft(int n) {
        return n == 263;
    }

    public static boolean isCut(int n, int n2) {
        return n == 88 && KeyUtils.hasControlDown(n2) && !KeyUtils.hasShiftDown(n2) && !KeyUtils.hasAltDown(n2);
    }

    public static boolean isPaste(int n, int n2) {
        return n == 86 && KeyUtils.hasControlDown(n2) && !KeyUtils.hasShiftDown(n2) && !KeyUtils.hasAltDown(n2);
    }

    public static boolean isEscape(int n) {
        return n == 256;
    }

    public static boolean isDown(int n) {
        return n == 264;
    }

    public static boolean hasAltDown(int n) {
        return (n & 4) != 0;
    }

    public static boolean isRight(int n) {
        return n == 262;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean hasControlDown() {
        class08844 class088442 = class06202.Nq().Nt();
        if (class04655.N((class08844)class088442, (int)341)) return true;
        if (!class04655.N((class08844)class088442, (int)345)) return false;
        return true;
    }

    public static boolean hasControlDown(int n) {
        return (n & (class07536.m() == class07533.field_1137 ? 8 : 2)) != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean hasShiftDown() {
        class08844 class088442 = class06202.Nq().Nt();
        if (class04655.N((class08844)class088442, (int)340)) return true;
        if (!class04655.N((class08844)class088442, (int)344)) return false;
        return true;
    }

    public static boolean hasShiftDown(int n) {
        return (n & 1) != 0;
    }

    public static boolean isSelectAll(int n, int n2) {
        return n == 65 && KeyUtils.hasControlDown(n2) && !KeyUtils.hasShiftDown(n2) && !KeyUtils.hasAltDown(n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean isSelection(int n) {
        if (n == 257) return true;
        if (n == 32) return true;
        if (n != 335) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean isConfirmation(int n) {
        if (n == 257) return true;
        if (n != 335) return false;
        return true;
    }

    public static boolean isCycleFocus(int n) {
        return n == 258;
    }
}

