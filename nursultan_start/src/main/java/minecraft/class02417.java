/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class00394
 *  minecraft.class00436
 *  minecraft.class00473
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class00891
 *  minecraft.class01056
 *  minecraft.class01904
 *  minecraft.class01979
 *  minecraft.class02135
 *  minecraft.class02142
 *  minecraft.class02206
 *  minecraft.class02261
 *  minecraft.class02274
 *  minecraft.class02284
 *  minecraft.class02615
 *  minecraft.class03386
 *  minecraft.class03448
 *  minecraft.class03556
 *  minecraft.class03627
 *  minecraft.class04007
 *  minecraft.class04227
 *  minecraft.class04485
 *  minecraft.class04500
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05363
 *  minecraft.class05543
 *  minecraft.class05836
 *  minecraft.class06069
 *  minecraft.class06202
 *  minecraft.class06342
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06889
 *  minecraft.class06944
 *  minecraft.class07092
 *  minecraft.class07103
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07134
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class07752
 *  minecraft.class08092
 */
package minecraft;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;
import minecraft.class00040;
import minecraft.class00044;
import minecraft.class00394;
import minecraft.class00436;
import minecraft.class00473;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class00891;
import minecraft.class01056;
import minecraft.class01904;
import minecraft.class01979;
import minecraft.class02135;
import minecraft.class02142;
import minecraft.class02206;
import minecraft.class02261;
import minecraft.class02274;
import minecraft.class02284;
import minecraft.class02615;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class03556;
import minecraft.class03627;
import minecraft.class04007;
import minecraft.class04227;
import minecraft.class04485;
import minecraft.class04500;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class05543;
import minecraft.class05836;
import minecraft.class06069;
import minecraft.class06202;
import minecraft.class06342;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06889;
import minecraft.class06944;
import minecraft.class07092;
import minecraft.class07103;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07134;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07752;
import minecraft.class08092;

public class class02417 {
    private final class06202 N;
    private final class03448 y;
    private final Map<class07209, class00044> L = new HashMap<class07209, class00044>();

    public class02417(class06202 class062022, class03448 class034482) {
        this.N = class062022;
        this.y = class034482;
    }

    private void y(class07209 class072092) {
        this.N(class072092);
        this.N((class07299)this.y, class072092, false);
    }

    public void y(int n, class07209 class072092, int n2) {
        class06069 class060692 = this.y.field_9229;
        switch (n) {
            case 1035: {
                this.y.method_45446(class072092, class04909.uu, class04911.field_15245, 1.0f, 1.0f, false);
                break;
            }
            case 1033: {
                this.y.method_45446(class072092, class04909.Ro, class04911.field_15245, 1.0f, 1.0f, false);
                break;
            }
            case 1034: {
                this.y.method_45446(class072092, class04909.RJ, class04911.field_15245, 1.0f, 1.0f, false);
                break;
            }
            case 1032: {
                this.N.Nr().N((class00044)class00040.y((class04891)class04909.ln, (float)(class060692.z() * 0.4f + 0.8f), (float)0.25f));
                break;
            }
            case 1001: {
                this.y.method_45446(class072092, class04909.Zj, class04911.field_15245, 1.0f, 1.2f, false);
                break;
            }
            case 1000: {
                this.y.method_45446(class072092, class04909.Zb, class04911.field_15245, 1.0f, 1.0f, false);
                break;
            }
            case 1049: {
                this.y.method_45446(class072092, class04909.BE, class04911.field_15245, 1.0f, 1.0f, false);
                break;
            }
            case 1050: {
                this.y.method_45446(class072092, class04909.BW, class04911.field_15245, 1.0f, 1.0f, false);
                break;
            }
            case 1004: {
                this.y.method_45446(class072092, class04909.Ug, class04911.field_15254, 1.0f, 1.2f, false);
                break;
            }
            case 1002: {
                this.y.method_45446(class072092, class04909.Zv, class04911.field_15245, 1.0f, 1.2f, false);
                break;
            }
            case 1051: {
                this.y.method_45446(class072092, class04909.Ie, class04911.field_15245, 0.5f, 0.4f / (this.y.method_8409().z() * 0.4f + 0.8f), false);
                break;
            }
            case 2010: {
                this.N(n2, class072092, class060692, class07107.Nz);
                break;
            }
            case 2000: {
                this.N(n2, class072092, class060692, class07107.NZ);
                break;
            }
            case 2003: {
                double d = (double)class072092.method_10263() + 0.5;
                double d2 = class072092.method_10264();
                double d3 = (double)class072092.method_10260() + 0.5;
                for (int i = 0; i < 8; ++i) {
                    this.y.method_8406((class07126)new class07092(class07107.S, new class06584((class07310)class06570.nG)), d, d2, d3, class060692.E() * 0.15, class060692.U() * 0.2, class060692.E() * 0.15);
                }
                for (double d4 = 0.0; d4 < Math.PI * 2; d4 += 0.15707963267948966) {
                    this.y.method_8406((class07126)class07107.NM, d + Math.cos(d4) * 5.0, d2 - 0.4, d3 + Math.sin(d4) * 5.0, Math.cos(d4) * -5.0, 0.0, Math.sin(d4) * -5.0);
                    this.y.method_8406((class07126)class07107.NM, d + Math.cos(d4) * 5.0, d2 - 0.4, d3 + Math.sin(d4) * 5.0, Math.cos(d4) * -7.0, 0.0, Math.sin(d4) * -7.0);
                }
                break;
            }
            case 2002: 
            case 2007: {
                class06889 class068892 = class06889.L((class00753)class072092);
                for (int i = 0; i < 8; ++i) {
                    this.y.method_8406((class07126)new class07092(class07107.S, new class06584((class07310)class06570.lO)), class068892.M, class068892.B, class068892.Z, class060692.E() * 0.15, class060692.U() * 0.2, class060692.E() * 0.15);
                }
                float f = (float)(n2 >> 16 & 0xFF) / 255.0f;
                float f2 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                float f3 = (float)(n2 >> 0 & 0xFF) / 255.0f;
                class07103 var9 = n == 2007 ? class07107.C : class07107.T;
                for (int i = 0; i < 100; ++i) {
                    double d = class060692.U() * 4.0;
                    double d5 = class060692.U() * Math.PI * 2.0;
                    double d6 = Math.cos(d5) * d;
                    double d7 = 0.01 + class060692.U() * 0.5;
                    double d8 = Math.sin(d5) * d;
                    float f4 = 0.75f + class060692.z() * 0.25f;
                    class00436 class004362 = class00436.N((class07103)var9, (float)(f * f4), (float)(f2 * f4), (float)(f3 * f4), (float)((float)d));
                    this.y.method_8406((class07126)class004362, class068892.M + d6 * 0.1, class068892.B + 0.3, class068892.Z + d8 * 0.1, d6, d7, d8);
                }
                this.y.method_45446(class072092, class04909.QB, class04911.field_15254, 1.0f, class060692.z() * 0.1f + 0.9f, false);
                break;
            }
            case 2001: {
                class00500 class005002 = class00891.N((int)n2);
                if (!class005002.P()) {
                    class07752 class077522 = class005002.O();
                    this.y.method_45446(class072092, class077522.L(), class04911.field_15245, (class077522.N() + 1.0f) / 2.0f, class077522.y() * 0.8f, false);
                }
                this.y.method_31595(class072092, class005002);
                break;
            }
            case 3008: {
                class00500 class005003 = class00891.N((int)n2);
                class00891 class008912 = class005003.i();
                if (class008912 instanceof class01979) {
                    class01979 class019792 = (class01979)class008912;
                    this.y.method_45446(class072092, class019792.u(), class04911.field_15248, 1.0f, 1.0f, false);
                }
                this.y.method_31595(class072092, class005003);
                break;
            }
            case 2004: {
                for (int i = 0; i < 20; ++i) {
                    double d = (double)class072092.method_10263() + 0.5 + (class060692.U() - 0.5) * 2.0;
                    double d9 = (double)class072092.method_10264() + 0.5 + (class060692.U() - 0.5) * 2.0;
                    double d10 = (double)class072092.method_10260() + 0.5 + (class060692.U() - 0.5) * 2.0;
                    this.y.method_8406((class07126)class07107.NZ, d, d9, d10, 0.0, 0.0, 0.0);
                    this.y.method_8406((class07126)class07107.J, d, d9, d10, 0.0, 0.0, 0.0);
                }
                break;
            }
            case 3011: {
                class04485.N((class07299)this.y, (class07209)class072092, (class06069)class060692, (class07134)class04500.N((int)n2).field_50188);
                break;
            }
            case 3012: {
                this.y.method_45446(class072092, class04909.mx, class04911.field_15245, 1.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, true);
                class04485.N((class07299)this.y, (class07209)class072092, (class06069)class060692, (class07134)class04500.N((int)n2).field_50188);
                break;
            }
            case 3021: {
                this.y.method_45446(class072092, class04909.mh, class04911.field_15245, 1.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, true);
                class04485.N((class07299)this.y, (class07209)class072092, (class06069)class060692, (class07134)class04500.N((int)n2).field_50188);
                break;
            }
            case 3013: {
                this.y.method_45446(class072092, class04909.PN, class04911.field_15245, 1.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, true);
                class04485.N((class07299)this.y, (class07209)class072092, (class06069)class060692, (int)n2, (class07126)class07107.yL);
                break;
            }
            case 3019: {
                this.y.method_45446(class072092, class04909.PN, class04911.field_15245, 1.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, true);
                class04485.N((class07299)this.y, (class07209)class072092, (class06069)class060692, (int)n2, (class07126)class07107.yu);
                break;
            }
            case 3020: {
                this.y.method_45446(class072092, class04909.Py, class04911.field_15245, n2 == 0 ? 0.3f : 1.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, true);
                class04485.N((class07299)this.y, (class07209)class072092, (class06069)class060692, (int)0, (class07126)class07107.yu);
                class04485.N((class07299)this.y, (class07209)class072092, (class06069)class060692);
                break;
            }
            case 3014: {
                this.y.method_45446(class072092, class04909.PM, class04911.field_15245, 1.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, true);
                class04485.y((class07299)this.y, (class07209)class072092, (class06069)class060692);
                break;
            }
            case 3017: {
                class04485.y((class07299)this.y, (class07209)class072092, (class06069)class060692);
                break;
            }
            case 3015: {
                class00394 class003942 = this.y.method_8321(class072092);
                if (!(class003942 instanceof class02261)) break;
                class02261 class022612 = (class02261)class003942;
                class02284.N((class07299)this.y, (class07209)class022612.d(), (class00500)class022612.w(), (class02274)class022612.L(), (class07126)(n2 == 0 ? class07107.Nc : class07107.X));
                this.y.method_45446(class072092, class04909.OA, class04911.field_15245, 1.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, true);
                break;
            }
            case 3016: {
                class02284.N((class07299)this.y, (class07209)class072092, (class07126)(n2 == 0 ? class07107.Nc : class07107.X));
                this.y.method_45446(class072092, class04909.Ox, class04911.field_15245, 1.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, true);
                break;
            }
            case 3018: {
                for (int i = 0; i < 10; ++i) {
                    double d = class060692.E() * 0.02;
                    double d11 = class060692.E() * 0.02;
                    double d12 = class060692.E() * 0.02;
                    this.y.method_8406((class07126)class07107.NR, (double)class072092.method_10263() + class060692.U(), (double)class072092.method_10264() + class060692.U(), (double)class072092.method_10260() + class060692.U(), d, d11, d12);
                }
                this.y.method_45446(class072092, class04909.Re, class04911.field_15245, 1.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, true);
                break;
            }
            case 1505: {
                class06944.N((class07284)this.y, (class07209)class072092, (int)n2);
                this.y.method_45446(class072092, class04909.LK, class04911.field_15245, 1.0f, 1.0f, false);
                break;
            }
            case 2011: {
                class02615.N((class07284)this.y, (class07209)class072092, (int)n2, (class07126)class07107.F);
                break;
            }
            case 2012: {
                class02615.N((class07284)this.y, (class07209)class072092, (int)n2, (class07126)class07107.F);
                break;
            }
            case 3009: {
                class02615.N((class07299)this.y, (class07209)class072092, (class07126)class07107.yN, (class02142)class02135.y((int)3, (int)6));
                break;
            }
            case 3002: {
                if (n2 >= 0 && n2 < class07185.field_23780.length) {
                    class02615.N((class07185)class07185.field_23780[n2], (class07299)this.y, (class07209)class072092, (double)0.125, (class07126)class07107.ND, (class02135)class02135.y((int)10, (int)19));
                    break;
                }
                class02615.N((class07299)this.y, (class07209)class072092, (class07126)class07107.ND, (class02142)class02135.y((int)3, (int)5));
                break;
            }
            case 2013: {
                class02615.N((class07284)this.y, (class07209)class072092, (int)n2);
                break;
            }
            case 3006: {
                int n3 = n2 >> 6;
                if (n3 > 0) {
                    if (class060692.z() < 0.3f + (float)n3 * 0.1f) {
                        float f = 0.15f + 0.02f * (float)n3 * (float)n3 * class060692.z();
                        float f5 = 0.4f + 0.3f * (float)n3 * class060692.z();
                        this.y.method_45446(class072092, class04909.da, class04911.field_15245, f, f5, false);
                    }
                    byte by = (byte)(n2 & 0x3F);
                    class02135 class021352 = class02135.y((int)0, (int)n3);
                    float f = 0.005f;
                    Supplier<class06889> supplier = () -> new class06889(class04995.N((class06069)class060692, (double)-0.005f, (double)0.005f), class04995.N((class06069)class060692, (double)-0.005f, (double)0.005f), class04995.N((class06069)class060692, (double)-0.005f, (double)0.005f));
                    if (by == 0) {
                        for (class07211 class072112 : class07211.values()) {
                            float f6 = class072112 == class07211.field_11033 ? (float)Math.PI : 0.0f;
                            double d = class072112.z() == class07185.field_11052 ? 0.65 : 0.57;
                            class02615.N((class07299)this.y, (class07209)class072092, (class07126)new class01904(f6), (class02142)class021352, (class07211)class072112, supplier, (double)d);
                        }
                    } else {
                        for (class07211 class072113 : class05543.N((byte)by)) {
                            float f7 = class072113 == class07211.field_11036 ? (float)Math.PI : 0.0f;
                            double d = 0.35;
                            class02615.N((class07299)this.y, (class07209)class072092, (class07126)new class01904(f7), (class02142)class021352, (class07211)class072113, supplier, (double)0.35);
                        }
                    }
                } else {
                    this.y.method_45446(class072092, class04909.da, class04911.field_15245, 1.0f, 1.0f, false);
                    boolean bl = this.y.method_8320(class072092).W((class07290)this.y, class072092);
                    int n4 = bl ? 40 : 20;
                    float f = bl ? 0.45f : 0.25f;
                    float f8 = 0.07f;
                    for (int i = 0; i < n4; ++i) {
                        float f9 = 2.0f * class060692.z() - 1.0f;
                        float f10 = 2.0f * class060692.z() - 1.0f;
                        float f11 = 2.0f * class060692.z() - 1.0f;
                        this.y.method_8406((class07126)class07107.c, (double)class072092.method_10263() + 0.5 + (double)(f9 * f), (double)class072092.method_10264() + 0.5 + (double)(f10 * f), (double)class072092.method_10260() + 0.5 + (double)(f11 * f), (double)(f9 * 0.07f), (double)(f10 * 0.07f), (double)(f11 * 0.07f));
                    }
                }
                break;
            }
            case 3007: {
                boolean bl;
                for (int i = 0; i < 10; ++i) {
                    this.y.method_8406((class07126)new class03627(i * 5), (double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + class04007.i, (double)class072092.method_10260() + 0.5, 0.0, 0.0, 0.0);
                }
                class00500 class005004 = this.y.method_8320(class072092);
                boolean bl2 = bl = class005004.y((class08092)class06665.q) && (Boolean)class005004.L((class08092)class06665.q) != false;
                if (bl) break;
                this.y.method_8486((double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + class04007.i, (double)class072092.method_10260() + 0.5, class04909.wW, class04911.field_15245, 2.0f, 0.6f + this.y.field_9229.z() * 0.4f, false);
                break;
            }
            case 3003: {
                class02615.N((class07299)this.y, (class07209)class072092, (class07126)class07107.NS, (class02142)class02135.y((int)3, (int)5));
                this.y.method_45446(class072092, class04909.Pk, class04911.field_15245, 1.0f, 1.0f, false);
                break;
            }
            case 3004: {
                class02615.N((class07299)this.y, (class07209)class072092, (class07126)class07107.Nx, (class02142)class02135.y((int)3, (int)5));
                break;
            }
            case 3005: {
                class02615.N((class07299)this.y, (class07209)class072092, (class07126)class07107.Nh, (class02142)class02135.y((int)3, (int)5));
                break;
            }
            case 2008: {
                this.y.method_8406((class07126)class07107.l, (double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.5, (double)class072092.method_10260() + 0.5, 0.0, 0.0, 0.0);
                break;
            }
            case 1500: {
                class05836.N((class07299)this.y, (class07209)class072092, (n2 > 0 ? 1 : 0) != 0);
                break;
            }
            case 1504: {
                class06342.N((class07299)this.y, (class07209)class072092, (class00500)this.y.method_8320(class072092));
                break;
            }
            case 1501: {
                this.y.method_45446(class072092, class04909.sC, class04911.field_15245, 0.5f, 2.6f + (class060692.z() - class060692.z()) * 0.8f, false);
                for (int i = 0; i < 8; ++i) {
                    this.y.method_8406((class07126)class07107.Ny, (double)class072092.method_10263() + class060692.U(), (double)class072092.method_10264() + 1.2, (double)class072092.method_10260() + class060692.U(), 0.0, 0.0, 0.0);
                }
                break;
            }
            case 1502: {
                this.y.method_45446(class072092, class04909.dM, class04911.field_15245, 0.5f, 2.6f + (class060692.z() - class060692.z()) * 0.8f, false);
                for (int i = 0; i < 5; ++i) {
                    double d = (double)class072092.method_10263() + class060692.U() * 0.6 + 0.2;
                    double d13 = (double)class072092.method_10264() + class060692.U() * 0.6 + 0.2;
                    double d14 = (double)class072092.method_10260() + class060692.U() * 0.6 + 0.2;
                    this.y.method_8406((class07126)class07107.NZ, d, d13, d14, 0.0, 0.0, 0.0);
                }
                break;
            }
            case 1503: {
                this.y.method_45446(class072092, class04909.Uu, class04911.field_15245, 1.0f, 1.0f, false);
                for (int i = 0; i < 16; ++i) {
                    double d = (double)class072092.method_10263() + (5.0 + class060692.U() * 6.0) / 16.0;
                    double d15 = (double)class072092.method_10264() + 0.8125;
                    double d16 = (double)class072092.method_10260() + (5.0 + class060692.U() * 6.0) / 16.0;
                    this.y.method_8406((class07126)class07107.NZ, d, d15, d16, 0.0, 0.0, 0.0);
                }
                break;
            }
            case 2006: {
                for (int i = 0; i < 200; ++i) {
                    float f = class060692.z() * 4.0f;
                    float f12 = class060692.z() * ((float)Math.PI * 2);
                    double d = class04995.P((double)f12) * f;
                    double d17 = 0.01 + class060692.U() * 0.5;
                    double d18 = class04995.m((double)f12) * f;
                    this.y.method_8406((class07126)class00473.N((class07103)class07107.Z, (float)f), (double)class072092.method_10263() + d * 0.1, (double)class072092.method_10264() + 0.3, (double)class072092.method_10260() + d18 * 0.1, d, d17, d18);
                }
                if (n2 != 1) break;
                this.y.method_45446(class072092, class04909.zV, class04911.field_15251, 1.0f, class060692.z() * 0.1f + 0.9f, false);
                break;
            }
            case 2009: {
                for (int i = 0; i < 8; ++i) {
                    this.y.method_8406((class07126)class07107.i, (double)class072092.method_10263() + class060692.U(), (double)class072092.method_10264() + 1.2, (double)class072092.method_10260() + class060692.U(), 0.0, 0.0, 0.0);
                }
                break;
            }
            case 1009: {
                if (n2 == 0) {
                    this.y.method_45446(class072092, class04909.Uq, class04911.field_15245, 0.5f, 2.6f + (class060692.z() - class060692.z()) * 0.8f, false);
                    break;
                }
                if (n2 != 1) break;
                this.y.method_45446(class072092, class04909.Ef, class04911.field_15245, 0.7f, 1.6f + (class060692.z() - class060692.z()) * 0.4f, false);
                break;
            }
            case 1029: {
                this.y.method_45446(class072092, class04909.S, class04911.field_15245, 1.0f, class060692.z() * 0.1f + 0.9f, false);
                break;
            }
            case 1030: {
                this.y.method_45446(class072092, class04909.Ny, class04911.field_15245, 1.0f, class060692.z() * 0.1f + 0.9f, false);
                break;
            }
            case 1044: {
                this.y.method_45446(class072092, class04909.YY, class04911.field_15245, 1.0f, this.y.field_9229.z() * 0.1f + 0.9f, false);
                break;
            }
            case 1031: {
                this.y.method_45446(class072092, class04909.h, class04911.field_15245, 0.3f, this.y.field_9229.z() * 0.1f + 0.9f, false);
                break;
            }
            case 1039: {
                this.y.method_45446(class072092, class04909.GB, class04911.field_15251, 0.3f, this.y.field_9229.z() * 0.1f + 0.9f, false);
                break;
            }
            case 1010: {
                this.y.method_30349().L(class04227.yz).L(n2).ifPresent(class035292 -> this.N((class03556<class02206>)class035292, class072092));
                break;
            }
            case 1011: {
                this.y(class072092);
                break;
            }
            case 1015: {
                this.y.method_45446(class072092, class04909.Wu, class04911.field_15251, 10.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, false);
                break;
            }
            case 1017: {
                this.y.method_45446(class072092, class04909.zX, class04911.field_15251, 10.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, false);
                break;
            }
            case 1016: {
                this.y.method_45446(class072092, class04909.WL, class04911.field_15251, 10.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, false);
                break;
            }
            case 1019: {
                this.y.method_45446(class072092, class04909.Jq, class04911.field_15251, 2.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, false);
                break;
            }
            case 1022: {
                this.y.method_45446(class072092, class04909.If, class04911.field_15251, 2.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, false);
                break;
            }
            case 1021: {
                this.y.method_45446(class072092, class04909.JV, class04911.field_15251, 2.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, false);
                break;
            }
            case 1020: {
                this.y.method_45446(class072092, class04909.JK, class04911.field_15251, 2.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, false);
                break;
            }
            case 1018: {
                this.y.method_45446(class072092, class04909.LG, class04911.field_15251, 2.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, false);
                break;
            }
            case 1024: {
                this.y.method_45446(class072092, class04909.Ix, class04911.field_15251, 2.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, false);
                break;
            }
            case 1026: {
                this.y.method_45446(class072092, class04909.JC, class04911.field_15251, 2.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, false);
                break;
            }
            case 1027: {
                this.y.method_45446(class072092, class04909.om, class04911.field_15251, 2.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, false);
                break;
            }
            case 1040: {
                this.y.method_45446(class072092, class04909.Je, class04911.field_15251, 2.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, false);
                break;
            }
            case 1041: {
                this.y.method_45446(class072092, class04909.Pr, class04911.field_15251, 2.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, false);
                break;
            }
            case 1025: {
                this.y.method_45446(class072092, class04909.yS, class04911.field_15254, 0.05f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, false);
                break;
            }
            case 1042: {
                this.y.method_45446(class072092, class04909.mi, class04911.field_15245, 1.0f, this.y.field_9229.z() * 0.1f + 0.9f, false);
                break;
            }
            case 1043: {
                this.y.method_45446(class072092, class04909.LV, class04911.field_15245, 1.0f, this.y.field_9229.z() * 0.1f + 0.9f, false);
                break;
            }
            case 3000: {
                this.y.method_17452((class07126)class07107.G, true, (double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.5, (double)class072092.method_10260() + 0.5, 0.0, 0.0, 0.0);
                this.y.method_45446(class072092, class04909.UL, class04911.field_15245, 10.0f, (1.0f + (this.y.field_9229.z() - this.y.field_9229.z()) * 0.2f) * 0.7f, false);
                break;
            }
            case 3001: {
                this.y.method_45446(class072092, class04909.zH, class04911.field_15251, 64.0f, 0.8f + this.y.field_9229.z() * 0.3f, false);
                break;
            }
            case 1045: {
                this.y.method_45446(class072092, class04909.zi, class04911.field_15245, 2.0f, this.y.field_9229.z() * 0.1f + 0.9f, false);
                break;
            }
            case 1046: {
                this.y.method_45446(class072092, class04909.zB, class04911.field_15245, 2.0f, this.y.field_9229.z() * 0.1f + 0.9f, false);
                break;
            }
            case 1047: {
                this.y.method_45446(class072092, class04909.zZ, class04911.field_15245, 2.0f, this.y.field_9229.z() * 0.1f + 0.9f, false);
                break;
            }
            case 1048: {
                this.y.method_45446(class072092, class04909.kz, class04911.field_15251, 2.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f, false);
            }
        }
    }

    private void N(class07299 class072992, class07209 class072092, boolean bl) {
        Iterator var5 = class072992.N(class07438.class, new class00734(class072092).M(3.0)).iterator();
        while (var5.hasNext()) {
            ((class07438)var5.next()).method_6006(class072092, bl);
        }
    }

    public void N(int n, class07209 class072092, int n2) {
        switch (n) {
            case 1023: 
            case 1028: 
            case 1038: {
                class05363 class053632 = ((class03386)this.N.i_5).s();
                if (!class053632.Z()) break;
                class06889 class068892 = class06889.y((class00753)class072092).u(class053632.y()).u();
                class06889 class068893 = class053632.y().i(class068892.L(2.0));
                if (n == 1023) {
                    this.y.method_8486(class068893.M, class068893.B, class068893.Z, class04909.Jy, class04911.field_15251, 1.0f, 1.0f, false);
                    break;
                }
                if (n == 1038) {
                    this.y.method_8486(class068893.M, class068893.B, class068893.Z, class04909.Ui, class04911.field_15251, 1.0f, 1.0f, false);
                    break;
                }
                this.y.method_8486(class068893.M, class068893.B, class068893.Z, class04909.zK, class04911.field_15251, 5.0f, 1.0f, false);
            }
        }
    }

    private void N(int n, class07209 class072092, class06069 class060692, class07134 class071342) {
        class07211 class072112 = class07211.N((int)n);
        int n2 = class072112.P();
        int n3 = class072112.s();
        int n4 = class072112.T();
        for (int i = 0; i < 10; ++i) {
            double d = class060692.U() * 0.2 + 0.01;
            double d2 = (double)class072092.method_10263() + (double)n2 * 0.6 + 0.5 + (double)n2 * 0.01 + (class060692.U() - 0.5) * (double)n4 * 0.5;
            double d3 = (double)class072092.method_10264() + (double)n3 * 0.6 + 0.5 + (double)n3 * 0.01 + (class060692.U() - 0.5) * (double)n3 * 0.5;
            double d4 = (double)class072092.method_10260() + (double)n4 * 0.6 + 0.5 + (double)n4 * 0.01 + (class060692.U() - 0.5) * (double)n2 * 0.5;
            double d5 = (double)n2 * d + class060692.E() * 0.01;
            double d6 = (double)n3 * d + class060692.E() * 0.01;
            double d7 = (double)n4 * d + class060692.E() * 0.01;
            this.y.method_8406((class07126)class071342, d2, d3, d4, d5, d6, d7);
        }
    }

    private void N(class03556<class02206> class035562, class07209 class072092) {
        this.N(class072092);
        class02206 class022062 = (class02206)class035562.N();
        class00040 class000402 = class00040.N((class04891)((class04891)class022062.y().N()), (class06889)class06889.y((class00753)class072092));
        this.L.put(class072092, (class00044)class000402);
        this.N.Nr().N((class00044)class000402);
        ((class01056)this.N.i_6).N(class022062.L());
        this.N((class07299)this.y, class072092, true);
    }

    private void N(class07209 class072092) {
        class00044 class000442 = this.L.remove(class072092);
        if (class000442 != null) {
            this.N.Nr().y(class000442);
        }
    }
}

