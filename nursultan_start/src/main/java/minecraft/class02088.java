/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class06069
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class01054;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class06069;
import minecraft.class08394;

public class class02088 {
    public static final class01894 N = class01894.y((String)"textures/gui/title/minecraft.png");
    public static final class01894 y = class01894.y((String)"textures/gui/title/minceraft.png");
    public static final class01894 L = class01894.y((String)"textures/gui/title/edition.png");
    public static final int u = 256;
    public static final int i = 44;
    private static final int M = 256;
    private static final int B = 64;
    private static final int Z = 128;
    private static final int z = 14;
    private static final int U = 128;
    private static final int E = 16;
    public static final int R = 30;
    private static final int W = 7;
    private final boolean m = (double)class06069.u().z() < 1.0E-4;
    private final boolean P;

    public class02088(boolean bl) {
        this.P = bl;
    }

    public void N(class01054 class010542, int n, float f) {
        this.N(class010542, n, f, 30);
    }

    public boolean N() {
        return this.P;
    }

    public void N(class01054 class010542, int n, float f, int n2) {
        int n3 = n / 2 - 128;
        int n4 = class02566.y((float)(this.P ? 1.0f : f));
        class010542.N(class08394.Na, this.m ? y : N, n3, n2, 0.0f, 0.0f, 256, 44, 256, 64, n4);
        int n5 = n / 2 - 64;
        int n6 = n2 + 44 - 7;
        class010542.N(class08394.Na, L, n5, n6, 0.0f, 0.0f, 128, 14, 128, 16, n4);
    }
}

