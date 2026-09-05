/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class07752
 */
package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.stream.Stream;
import minecraft.class01963;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class07752;

public final class class01960
extends Record {
    private final String name;
    private final boolean canOpenByHand;
    private final boolean canOpenByWindCharge;
    private final boolean canButtonBeActivatedByArrows;
    private final class01963 pressurePlateSensitivity;
    private final class07752 soundType;
    private final class04891 doorClose;
    private final class04891 doorOpen;
    private final class04891 trapdoorClose;
    private final class04891 trapdoorOpen;
    private final class04891 pressurePlateClickOff;
    private final class04891 pressurePlateClickOn;
    private final class04891 buttonClickOff;
    private final class04891 buttonClickOn;
    private static final Map<String, class01960> J = new Object2ObjectArrayMap();
    public static final Codec<class01960> N = Codec.stringResolver(class01960::y, J::get);
    public static final class01960 y = class01960.N(new class01960("iron", false, false, false, class01963.field_11361, class07752.yb, class04909.sT, class04909.sb, class04909.sd, class04909.sw, class04909.Tx, class04909.TD, class04909.QG, class04909.Ql));
    public static final class01960 L = class01960.N(new class01960("copper", true, true, false, class01963.field_11361, class07752.Nz, class04909.Mn, class04909.Mt, class04909.Mr, class04909.BN, class04909.Tx, class04909.TD, class04909.QG, class04909.Ql));
    public static final class01960 u = class01960.N(new class01960("gold", false, true, false, class01963.field_11361, class07752.M, class04909.sT, class04909.sb, class04909.sd, class04909.sw, class04909.Tx, class04909.TD, class04909.QG, class04909.Ql));
    public static final class01960 i = class01960.N(new class01960("stone", true, true, false, class01963.field_11362, class07752.R, class04909.sT, class04909.sb, class04909.sd, class04909.sw, class04909.QY, class04909.QQ, class04909.QG, class04909.Ql));
    public static final class01960 R = class01960.N(new class01960("polished_blackstone", true, true, false, class01963.field_11362, class07752.R, class04909.sT, class04909.sb, class04909.sd, class04909.sw, class04909.QY, class04909.QQ, class04909.QG, class04909.Ql));
    public static final class01960 M = class01960.N(new class01960("oak"));
    public static final class01960 B = class01960.N(new class01960("spruce"));
    public static final class01960 Z = class01960.N(new class01960("birch"));
    public static final class01960 z = class01960.N(new class01960("acacia"));
    public static final class01960 U = class01960.N(new class01960("cherry", true, true, true, class01963.field_11361, class07752.ND, class04909.RR, class04909.RM, class04909.RB, class04909.RZ, class04909.RE, class04909.RW, class04909.Rz, class04909.RU));
    public static final class01960 E = class01960.N(new class01960("jungle"));
    public static final class01960 W = class01960.N(new class01960("dark_oak"));
    public static final class01960 m = class01960.N(new class01960("pale_oak"));
    public static final class01960 P = class01960.N(new class01960("crimson", true, true, true, class01963.field_11361, class07752.Nx, class04909.vT, class04909.vb, class04909.vj, class04909.vv, class04909.vG, class04909.vl, class04909.vn, class04909.vt));
    public static final class01960 s = class01960.N(new class01960("warped", true, true, true, class01963.field_11361, class07752.Nx, class04909.vT, class04909.vb, class04909.vj, class04909.vv, class04909.vG, class04909.vl, class04909.vn, class04909.vt));
    public static final class01960 T = class01960.N(new class01960("mangrove"));
    public static final class01960 b = class01960.N(new class01960("bamboo", true, true, true, class01963.field_11361, class07752.NS, class04909.yk, class04909.yY, class04909.yQ, class04909.yO, class04909.yJ, class04909.yo, class04909.yg, class04909.yI));

    public boolean L() {
        return this.canOpenByHand;
    }

    public class07752 M() {
        return this.soundType;
    }

    public class04891 P() {
        return this.buttonClickOn;
    }

    public class01960(String string) {
        this(string, true, true, true, class01963.field_11361, class07752.y, class04909.Jz, class04909.JU, class04909.JE, class04909.JW, class04909.Js, class04909.JT, class04909.Jm, class04909.JP);
    }

    public class01960(String string, boolean bl, boolean bl2, boolean bl3, class01963 class019632, class07752 class077522, class04891 class048912, class04891 class048913, class04891 class048914, class04891 class048915, class04891 class048916, class04891 class048917, class04891 class048918, class04891 class048919) {
        this.name = string;
        this.canOpenByHand = bl;
        this.canOpenByWindCharge = bl2;
        this.canButtonBeActivatedByArrows = bl3;
        this.pressurePlateSensitivity = class019632;
        this.soundType = class077522;
        this.doorClose = class048912;
        this.doorOpen = class048913;
        this.trapdoorClose = class048914;
        this.trapdoorOpen = class048915;
        this.pressurePlateClickOff = class048916;
        this.pressurePlateClickOn = class048917;
        this.buttonClickOff = class048918;
        this.buttonClickOn = class048919;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01960.class, "name;canOpenByHand;canOpenByWindCharge;canButtonBeActivatedByArrows;pressurePlateSensitivity;soundType;doorClose;doorOpen;trapdoorClose;trapdoorOpen;pressurePlateClickOff;pressurePlateClickOn;buttonClickOff;buttonClickOn", "name", "canOpenByHand", "canOpenByWindCharge", "canButtonBeActivatedByArrows", "pressurePlateSensitivity", "soundType", "doorClose", "doorOpen", "trapdoorClose", "trapdoorOpen", "pressurePlateClickOff", "pressurePlateClickOn", "buttonClickOff", "buttonClickOn"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01960.class, "name;canOpenByHand;canOpenByWindCharge;canButtonBeActivatedByArrows;pressurePlateSensitivity;soundType;doorClose;doorOpen;trapdoorClose;trapdoorOpen;pressurePlateClickOff;pressurePlateClickOn;buttonClickOff;buttonClickOn", "name", "canOpenByHand", "canOpenByWindCharge", "canButtonBeActivatedByArrows", "pressurePlateSensitivity", "soundType", "doorClose", "doorOpen", "trapdoorClose", "trapdoorOpen", "pressurePlateClickOff", "pressurePlateClickOn", "buttonClickOff", "buttonClickOn"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01960.class, "name;canOpenByHand;canOpenByWindCharge;canButtonBeActivatedByArrows;pressurePlateSensitivity;soundType;doorClose;doorOpen;trapdoorClose;trapdoorOpen;pressurePlateClickOff;pressurePlateClickOn;buttonClickOff;buttonClickOn", "name", "canOpenByHand", "canOpenByWindCharge", "canButtonBeActivatedByArrows", "pressurePlateSensitivity", "soundType", "doorClose", "doorOpen", "trapdoorClose", "trapdoorOpen", "pressurePlateClickOff", "pressurePlateClickOn", "buttonClickOff", "buttonClickOn"}, this);
    }

    public class04891 B() {
        return this.doorClose;
    }

    public class04891 Z() {
        return this.doorOpen;
    }

    public boolean i() {
        return this.canButtonBeActivatedByArrows;
    }

    public class04891 m() {
        return this.buttonClickOff;
    }

    public class04891 U() {
        return this.trapdoorOpen;
    }

    public class04891 z() {
        return this.trapdoorClose;
    }

    public boolean u() {
        return this.canOpenByWindCharge;
    }

    public String y() {
        return this.name;
    }

    public class04891 E() {
        return this.pressurePlateClickOff;
    }

    public static class01960 N(class01960 class019602) {
        J.put(class019602.name, class019602);
        return class019602;
    }

    public static Stream<class01960> N() {
        return J.values().stream();
    }

    public class04891 W() {
        return this.pressurePlateClickOn;
    }

    public class01963 R() {
        return this.pressurePlateSensitivity;
    }
}

