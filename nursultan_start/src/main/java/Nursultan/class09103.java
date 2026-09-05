/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  minecraft.class00405
 *  minecraft.class00949
 *  minecraft.class01590
 *  minecraft.class01923
 *  minecraft.class05272
 *  minecraft.class06202
 *  minecraft.class07948
 *  minecraft.class09006
 */
package Nursultan;

import Nursultan.class09091;
import com.mojang.blaze3d.textures.GpuTextureView;
import minecraft.class00405;
import minecraft.class00949;
import minecraft.class01590;
import minecraft.class01923;
import minecraft.class05272;
import minecraft.class06202;
import minecraft.class07948;
import minecraft.class09006;

public class class09103 {
    public static Object N_0;
    public static Object N_1;

    private class09103() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        class09103.N();
    }

    public static class09091 N(int n, class00405 class004052) {
        class09006 class090062;
        class05272 class052722;
        class00405 class004053 = class004052 == null ? class00405.N : class004052;
        class07948 class079482 = ((class01590)class06202.Nq().i_3).N(n, class004053);
        if (!(class079482 instanceof class05272) || (class052722 = (class05272)class079482).N() == class01923.field_37899) {
            return null;
        }
        GpuTextureView gpuTextureView = class052722.u;
        if (!(gpuTextureView instanceof class09006) || (class090062 = (class09006)gpuTextureView).isClosed()) {
            return null;
        }
        return new class09091(class090062.texture().N(), class052722.i, class052722.M, class052722.R, class052722.B, class052722.Z, class052722.z, class052722.U, class052722.E, class052722.N().N(class004053.L()));
    }

    private static void N() {
        N_0 = Float.valueOf(9.0f);
        N_1 = Float.valueOf(7.0f);
    }

    public static boolean N(class00405 class004052) {
        if (class004052 == null) {
            return false;
        }
        class00949 class009492 = class004052.E();
        return class009492 != class00949.y && !class00949.y.equals((Object)class009492);
    }

    public static boolean N(int n) {
        return n >= 57344 && n <= 63743 || n >= 983040 && n <= 1048573 || n >= 0x100000 && n <= 1114109;
    }
}

