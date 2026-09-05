/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntList
 *  me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod
 *  minecraft.class01894
 *  minecraft.class02329
 *  minecraft.class02827
 *  minecraft.class02835
 *  minecraft.class03386
 *  minecraft.class03448
 *  minecraft.class04410
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06148
 *  minecraft.class06202
 *  minecraft.class06563
 *  minecraft.class07103
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07536
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Iterator;
import java.util.List;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import minecraft.class01894;
import minecraft.class02329;
import minecraft.class02827;
import minecraft.class02835;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class04302;
import minecraft.class04410;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06148;
import minecraft.class06202;
import minecraft.class06563;
import minecraft.class07103;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07536;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04303
extends class06148 {
    private static final double[][] N = new double[][]{{0.0, 0.2}, {0.2, 0.2}, {0.2, 0.6}, {0.6, 0.6}, {0.6, 0.2}, {0.2, 0.2}, {0.2, 0.0}, {0.4, 0.0}, {0.4, -0.6}, {0.2, -0.6}, {0.2, -0.4}, {0.0, -0.4}};
    private static final double[][] y = new double[][]{{0.0, 1.0}, {0.3455, 0.309}, {0.9511, 0.309}, {0.3795918367346939, -0.12653061224489795}, {0.6122448979591837, -0.8040816326530612}, {0.0, -0.35918367346938773}};
    private int L;
    private final class04410 u;
    private final List<class02827> i;
    private boolean R;
    private final class01894 M = class01894.N((String)"minecraft", (String)"firework");

    public class04303(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class04410 class044102, List<class02827> list) {
        super(class034482, d, d2, d3);
        this.field_3852 = d4;
        this.field_3869 = d5;
        this.field_3850 = d6;
        this.u = class044102;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Cannot create firework starter with no explosions");
        }
        this.i = list;
        this.field_3847 = list.size() * 2 - 1;
        Iterator<class02827> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().i()) continue;
            this.R = true;
            this.field_3847 += 15;
            break;
        }
    }

    private void N(double d, double[][] dArray, IntList intList, IntList intList2, boolean bl, boolean bl2, boolean bl3) {
        double d2 = dArray[0][0];
        double d3 = dArray[0][1];
        this.N(this.field_3874, this.field_3854, this.field_3871, d2 * d, d3 * d, 0.0, intList, intList2, bl, bl2);
        float f = this.field_3840.z() * (float)Math.PI;
        double d4 = bl3 ? 0.034 : 0.34;
        for (int i = 0; i < 3; ++i) {
            double d5 = (double)f + (double)((float)i * (float)Math.PI) * d4;
            double d6 = d2;
            double d7 = d3;
            for (int j = 1; j < dArray.length; ++j) {
                double d8 = dArray[j][0];
                double d9 = dArray[j][1];
                for (double d10 = 0.25; d10 <= 1.0; d10 += 0.25) {
                    double d11 = class04995.u((double)d10, (double)d6, (double)d8) * d;
                    double d12 = class04995.u((double)d10, (double)d7, (double)d9) * d;
                    double d13 = d11 * Math.sin(d5);
                    d11 *= Math.cos(d5);
                    for (double d14 = -1.0; d14 <= 1.0; d14 += 2.0) {
                        this.N(this.field_3874, this.field_3854, this.field_3871, d11 * d14, d12, d13 * d14, intList, intList2, bl, bl2);
                    }
                }
                d6 = d8;
                d7 = d9;
            }
        }
    }

    private void N(IntList intList, IntList intList2, boolean bl, boolean bl2) {
        double d = this.field_3840.E() * 0.05;
        double d2 = this.field_3840.E() * 0.05;
        for (int i = 0; i < 70; ++i) {
            double d3 = this.field_3852 * 0.5 + this.field_3840.E() * 0.15 + d;
            double d4 = this.field_3850 * 0.5 + this.field_3840.E() * 0.15 + d2;
            double d5 = this.field_3869 * 0.5 + this.field_3840.U() * 0.5;
            this.N(this.field_3874, this.field_3854, this.field_3871, d3, d5, d4, intList, intList2, bl, bl2);
        }
    }

    public void N(double d, double d2, double d3, double d4, double d5, double d6, IntList intList, IntList intList2, boolean bl, boolean bl2, CallbackInfo callbackInfo) {
        if (!SodiumExtraClientMod.options().particleSettings.otherMap.computeIfAbsent(this.M, class018942 -> true).booleanValue() || !SodiumExtraClientMod.options().particleSettings.particles) {
            callbackInfo.cancel();
        }
    }

    private boolean N() {
        return ((class03386)class06202.Nq().i_5).s().y().L(this.field_3874, this.field_3854, this.field_3871) >= 256.0;
    }

    private void N(double d, double d2, double d3, double d4, double d5, double d6, IntList intList, IntList intList2, boolean bl, boolean bl2) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(d, d2, d3, d4, d5, d6, intList, intList2, bl, bl2, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class04302 class043022 = (class04302)this.u.N((class07126)class07107.g, d, d2, d3, d4, d5, d6);
        class043022.N(bl);
        class043022.y(bl2);
        class043022.method_74308(0.99f);
        class043022.N((Integer)class07536.N_77((List)intList, (class06069)this.field_3840));
        if (!intList2.isEmpty()) {
            class043022.y((Integer)class07536.N_77((List)intList2, (class06069)this.field_3840));
        }
    }

    private void N(double d, int n, IntList intList, IntList intList2, boolean bl, boolean bl2) {
        double d2 = this.field_3874;
        double d3 = this.field_3854;
        double d4 = this.field_3871;
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                for (int k = -n; k <= n; ++k) {
                    double d5 = (double)j + (this.field_3840.U() - this.field_3840.U()) * 0.5;
                    double d6 = (double)i + (this.field_3840.U() - this.field_3840.U()) * 0.5;
                    double d7 = (double)k + (this.field_3840.U() - this.field_3840.U()) * 0.5;
                    double d8 = Math.sqrt(d5 * d5 + d6 * d6 + d7 * d7) / d + this.field_3840.E() * 0.05;
                    this.N(d2, d3, d4, d5 / d8, d6 / d8, d7 / d8, intList, intList2, bl, bl2);
                    if (i == -n || i == n || j == -n || j == n) continue;
                    k += n * 2 - 1;
                }
            }
        }
    }

    public void method_3070() {
        int n;
        if (this.L == 0) {
            n = this.N();
            boolean bl = false;
            if (this.i.size() >= 3) {
                bl = true;
            } else {
                for (class02827 class028272 : this.i) {
                    if (class028272.N() != class02835.field_7977) continue;
                    bl = true;
                    break;
                }
            }
            class04891 class048912 = bl ? (n != 0 ? class04909.UQ : class04909.UY) : (n != 0 ? class04909.Uk : class04909.Uw);
            this.field_3851.method_8486(this.field_3874, this.field_3854, this.field_3871, class048912, class04911.field_15256, 20.0f, 0.95f + this.field_3840.z() * 0.1f, true);
        }
        if (this.L % 2 == 0 && this.L / 2 < this.i.size()) {
            n = this.L / 2;
            class02827 class028273 = this.i.get(n);
            boolean bl = class028273.u();
            boolean bl2 = class028273.i();
            IntList intList = class028273.y();
            IntList intList2 = class028273.L();
            if (intList.isEmpty()) {
                intList = IntList.of((int)class06563.field_7963.i());
            }
            switch (class028273.N()) {
                case field_7976: {
                    this.N(0.25, 2, intList, intList2, bl, bl2);
                    break;
                }
                case field_7977: {
                    this.N(0.5, 4, intList, intList2, bl, bl2);
                    break;
                }
                case field_7973: {
                    this.N(0.5, y, intList, intList2, bl, bl2, false);
                    break;
                }
                case field_7974: {
                    this.N(0.5, N, intList, intList2, bl, bl2, true);
                    break;
                }
                case field_7970: {
                    this.N(intList, intList2, bl, bl2);
                }
            }
            int n2 = intList.getInt(0);
            this.u.N((class07126)class02329.N((class07103)class07107.p, (int)n2), this.field_3874, this.field_3854, this.field_3871, 0.0, 0.0, 0.0);
        }
        ++this.L;
        if (this.L > this.field_3847) {
            if (this.R) {
                n = this.N() ? 1 : 0;
                class04891 class048913 = n != 0 ? class04909.UJ : class04909.UI;
                this.field_3851.method_8486(this.field_3874, this.field_3854, this.field_3871, class048913, class04911.field_15256, 20.0f, 0.9f + this.field_3840.z() * 0.15f, true);
            }
            this.method_3085();
        }
    }
}

