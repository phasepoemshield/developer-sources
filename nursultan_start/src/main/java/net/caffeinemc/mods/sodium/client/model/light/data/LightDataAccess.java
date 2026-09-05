/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00772
 *  minecraft.class03042
 *  minecraft.class03063
 *  minecraft.class03082
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07295
 *  net.caffeinemc.mods.sodium.client.services.PlatformBlockAccess
 */
package net.caffeinemc.mods.sodium.client.model.light.data;

import minecraft.class00500;
import minecraft.class00772;
import minecraft.class03042;
import minecraft.class03063;
import minecraft.class03082;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07295;
import net.caffeinemc.mods.sodium.client.services.PlatformBlockAccess;

public abstract class LightDataAccess {
    private final class07218 pos = new class07218();
    protected class07295 level;

    public class07295 getLevel() {
        return this.level;
    }

    public int get(int n, int n2, int n3, class07211 class072112, class07211 class072113) {
        return this.get(n + class072112.P() + class072113.P(), n2 + class072112.s() + class072113.s(), n3 + class072112.T() + class072113.T());
    }

    public abstract int get(int var1, int var2, int var3);

    public int get(class07209 class072092) {
        return this.get(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public int get(int n, int n2, int n3, class07211 class072112) {
        return this.get(n + class072112.P(), n2 + class072112.s(), n3 + class072112.T());
    }

    public int get(class07209 class072092, class07211 class072112) {
        return this.get(class072092.method_10263(), class072092.method_10264(), class072092.method_10260(), class072112);
    }

    protected int compute(int n, int n2, int n3) {
        int n4;
        int n5;
        class07218 class072182 = this.pos.N(n, n2, n3);
        class07295 class072952 = this.level;
        class00500 class005002 = class072952.method_8320((class07209)class072182);
        boolean bl = class005002.y((class07290)class072952, (class07209)class072182);
        boolean bl2 = class005002.U((class07290)class072952, (class07209)class072182) && class005002.z() != 0;
        boolean bl3 = class005002.t();
        boolean bl4 = class005002.W((class07290)class072952, (class07209)class072182);
        int n6 = PlatformBlockAccess.getInstance().getLightEmission(class005002, class072952, (class07209)class072182);
        if (bl3 && n6 == 0) {
            n5 = 0;
            n4 = 0;
        } else if (bl) {
            n5 = class072952.method_8314(class00772.field_9282, (class07209)class072182);
            n4 = class072952.method_8314(class00772.field_9284, (class07209)class072182);
        } else {
            int n7 = class03063.N((class03082)class03082.N, (class07295)class072952, (class00500)class005002, (class07209)class072182);
            n5 = class03042.N((int)n7);
            n4 = class03042.y((int)n7);
        }
        float f = class005002.L((class07290)class072952, (class07209)class072182);
        return LightDataAccess.packFC(bl4) | LightDataAccess.packFO(bl3) | LightDataAccess.packOP(bl2) | LightDataAccess.packEM(bl) | LightDataAccess.packAO(f) | LightDataAccess.packLU(n6) | LightDataAccess.packSL(n4) | LightDataAccess.packBL(n5);
    }

    public static int getLightmap(int n) {
        return class03042.N((int)Math.max(LightDataAccess.unpackBL(n), LightDataAccess.unpackLU(n)), (int)LightDataAccess.unpackSL(n));
    }

    public static int getEmissiveLightmap(int n) {
        if (LightDataAccess.unpackEM(n)) {
            return 0xF000F0;
        }
        return LightDataAccess.getLightmap(n);
    }

    public static int packFC(boolean bl) {
        return (bl ? 1 : 0) << 31;
    }

    public static float unpackAO(int n) {
        int n2 = n >>> 12 & 0xFFFF;
        return (float)n2 * 2.4414062E-4f;
    }

    public static int unpackBL(int n) {
        return n & 0xF;
    }

    public static boolean unpackEM(int n) {
        return (n >>> 28 & 1) != 0;
    }

    public static int packLU(int n) {
        return (n & 0xF) << 8;
    }

    public static int packFO(boolean bl) {
        return (bl ? 1 : 0) << 30;
    }

    public static int packEM(boolean bl) {
        return (bl ? 1 : 0) << 28;
    }

    public static int packSL(int n) {
        return (n & 0xF) << 4;
    }

    public static int unpackLU(int n) {
        return n >>> 8 & 0xF;
    }

    public static int packBL(int n) {
        return n & 0xF;
    }

    public static int packAO(float f) {
        int n = (int)(f * 4096.0f);
        return (n & 0xFFFF) << 12;
    }

    public static boolean unpackFO(int n) {
        return (n >>> 30 & 1) != 0;
    }

    public static int packOP(boolean bl) {
        return (bl ? 1 : 0) << 29;
    }

    public static int unpackSL(int n) {
        return n >>> 4 & 0xF;
    }

    public static boolean unpackFC(int n) {
        return (n >>> 31 & 1) != 0;
    }

    public static boolean unpackOP(int n) {
        return (n >>> 29 & 1) != 0;
    }
}

