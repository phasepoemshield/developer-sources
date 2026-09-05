/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00303
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07047
 *  minecraft.class07084
 *  minecraft.class07126
 *  minecraft.class07209
 */
package minecraft;

import minecraft.class00303;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07084;
import minecraft.class07126;
import minecraft.class07209;

public final class class08846
extends Enum<class08846> {
    public static final /* enum */ class08846 field_55070 = new class08846(true, (class03556<class07084>)class07047.P, 11.0f, class04909.UT, class04909.Ub, 16545810);
    public static final /* enum */ class08846 field_55071 = new class08846(false, (class03556<class07084>)class07047.Z, 7.0f, class04909.Uj, class04909.Uv, 0x5F5F5F);
    final boolean field_55072;
    final class03556<class07084> field_55073;
    final float field_55074;
    final class04891 field_55075;
    final class04891 field_55076;
    private final int field_55077;
    private static final /* synthetic */ class08846[] field_55078;

    public class08846 L() {
        return class08846.N(!this.field_55072);
    }

    private class08846(boolean bl, class03556<class07084> class035562, float f, class04891 class048912, class04891 class048913, int n2) {
        this.field_55072 = bl;
        this.field_55073 = class035562;
        this.field_55074 = f;
        this.field_55075 = class048912;
        this.field_55076 = class048913;
        this.field_55077 = n2;
    }

    public static class08846[] values() {
        return (class08846[])field_55078.clone();
    }

    public static class08846 valueOf(String string) {
        return Enum.valueOf(class08846.class, string);
    }

    public class04891 i() {
        return this.field_55075;
    }

    public boolean u() {
        return this.field_55072;
    }

    public class00500 y() {
        return this.N().W();
    }

    public void N(class04782 class047822, class07209 class072092, class06069 class060692) {
        class06889 class068892 = class072092.method_46558();
        double d = 0.5 + class060692.U();
        class06889 class068893 = new class06889(class060692.U() - 0.5, class060692.U() + 1.0, class060692.U() - 0.5);
        class06889 class068894 = class068892.i(class068893.L(d));
        class00303 class003032 = new class00303(class068894, this.field_55077, (int)(20.0 * d));
        class047822.method_65096((class07126)class003032, class068892.M, class068892.B, class068892.Z, 1, 0.0, 0.0, 0.0, 0.0);
    }

    public class00891 N() {
        return this.field_55072 ? class00869.nx : class00869.nD;
    }

    public static class08846 N(boolean bl) {
        return bl ? field_55070 : field_55071;
    }

    private static /* synthetic */ class08846[] R() {
        return new class08846[]{field_55070, field_55071};
    }

    static {
        field_55078 = class08846.R();
    }
}

