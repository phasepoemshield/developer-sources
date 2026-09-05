/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01089
 *  minecraft.class01321
 *  minecraft.class03597
 *  minecraft.class04141
 *  minecraft.class04161
 *  minecraft.class04654
 *  minecraft.class04897
 *  minecraft.class05096
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class05407
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.net.URI;
import java.util.List;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01089;
import minecraft.class01321;
import minecraft.class01883;
import minecraft.class01894;
import minecraft.class03597;
import minecraft.class04141;
import minecraft.class04161;
import minecraft.class04654;
import minecraft.class04897;
import minecraft.class05096;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class05407;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

public class class01891
extends class05407 {
    private static final class00392 N = class00392.L((String)"mco.selectServer.popup");
    private static final class00392 y = class00392.L((String)"mco.selectServer.close");
    private static final class01894 L = class01894.y("popup/background");
    private static final class01894 u = class01894.y("icon/trial_available");
    private static final class01883 i = new class01883(class01894.y("widget/cross_button"), class01894.y("widget/cross_button_highlighted"));
    private static final int R = 195;
    private static final int M = 152;
    private static final int B = 6;
    private static final int Z = 4;
    private static final int z = 10;
    private static final int U = 320;
    private static final int E = 172;
    private static final int W = 100;
    private static final int m = 99;
    private static final int P = 100;
    private static List<class01894> s = List.of();
    private final class05096 T;
    private final boolean b;
    private @Nullable class05362 j;
    private int v;
    private int n;

    private int L() {
        return this.N() + 320;
    }

    public class01891(class05096 class050962, boolean bl) {
        super(N);
        this.T = class050962;
        this.b = bl;
    }

    private int u() {
        return this.y() + 172;
    }

    private int y() {
        return (this.field_22790 - 172) / 2;
    }

    public static void N(class01089 class010892) {
        s = class010892.y("textures/gui/images", class018942 -> class018942.N().endsWith(".png")).keySet().stream().filter(class018942 -> class018942.y().equals("realms")).toList();
    }

    public static void N(class01054 class010542, class05362 class053622) {
        int n = 8;
        class010542.N(class08394.Na, u, class053622.method_46426() + class053622.method_25368() - 8 - 4, class053622.method_46427() + class053622.method_25364() / 2 - 4, 8, 8);
    }

    private int N() {
        return (this.field_22789 - 320) / 2;
    }

    public void method_25426() {
        this.T.method_25410(this.field_22789, this.field_22790);
        if (this.b) {
            this.j = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"mco.selectServer.trial"), (class05361)class01321.y((class05096)this, (URI)class03597.T)).N(this.L() - 10 - 99, this.u() - 10 - 4 - 40, 99, 20).N());
        }
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"mco.selectServer.buy"), (class05361)class01321.y((class05096)this, (URI)class03597.b)).N(this.L() - 10 - 99, this.u() - 10 - 20, 99, 20).N());
        ((class04897)this.method_37063((class04654)new class04897(this.N() + 4, this.y() + 4, 14, 14, i, class053622 -> this.method_25419(), y))).method_47400(class04141.N((class00392)y));
        int n = 142 - (this.b ? 40 : 20);
        class04161 class041612 = new class04161(this.L() - 10 - 100, this.y() + 10, 100, n, N, this.field_22793);
        if (class041612.L()) {
            class041612.method_25358(94);
        }
        this.method_37063((class04654)class041612);
    }

    public void method_25393() {
        super.method_25393();
        if (++this.n > 100) {
            this.n = 0;
            this.v = (this.v + 1) % s.size();
        }
    }

    public void method_25420(class01054 class010542, int n, int n2, float f) {
        this.T.method_25420(class010542, -1, -1, f);
        class010542.L();
        this.T.method_25394(class010542, -1, -1, f);
        class010542.L();
        this.method_52752(class010542);
        class010542.N(class08394.Na, L, this.N(), this.y(), 320, 172);
        if (!s.isEmpty()) {
            class010542.N(class08394.Na, s.get(this.v), this.N() + 10, this.y() + 10, 0.0f, 0.0f, 195, 152, 195, 152);
        }
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        if (this.j != null) {
            class01891.N(class010542, this.j);
        }
    }

    public void method_25419() {
        this.field_22787.N(this.T);
    }
}

