/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.textures.TextureFormat
 */
package ruhack.phobia;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import java.awt.image.BufferedImage;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import ruhack.phobia.kw;

class kw$GifAnimation {
    private final List<Integer> delays;
    static private long[] bepz;
    static public final boolean a;
    private final List<GpuTextureView> views;
    static public final int b;
    static private int[] belj;
    static final long cz = 2979297095424603073L;
    static private int[] beli;
    private int totalDuration;
    static public final boolean c;
    static private long[] bepy;
    private final List<GpuTexture> textures;

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String lambda$upload$0(int var0) {
        block36: {
            v0 /* !! */  = kw$GifAnimation.cz;
            if (true) ** GOTO lbl5
            block26: while (true) {
                v0 /* !! */  = (long)(v1 - kw$GifAnimation.belk("beww", bepx(int ), (int)59));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -387295824: {
                        v1 = kw$GifAnimation.belk("bewx", bepx(int ), (int)60);
                        continue block26;
                    }
                    case -234297068: {
                        v1 = kw$GifAnimation.belk("bewy", bepx(int ), (int)61);
                        continue block26;
                    }
                    case 1562571713: {
                        break block26;
                    }
                }
                break;
            }
            var3_1 = kw$GifAnimation.c;
            v2 /* !! */  = kw$GifAnimation.cz;
            block27: while (true) {
                switch ((int)v2 /* !! */ ) {
                    case 897812506: {
                        v2 /* !! */  = (long)(kw$GifAnimation.belk("bexa", bepx(int ), (int)63) - kw$GifAnimation.belk("bewz", bepx(int ), (int)62));
                        continue block27;
                    }
                    case 1562571713: {
                        break block27;
                    }
                }
                break;
            }
            var2_2 /* !! */  = kw$GifAnimation.b;
            v3 /* !! */  = kw$GifAnimation.cz;
            if (true) ** GOTO lbl28
            block28: while (true) {
                v3 /* !! */  = (long)(v4 - kw$GifAnimation.belk("bexb", bepx(int ), (int)64));
lbl28:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1813257806: {
                        v4 = kw$GifAnimation.belk("bexc", bepx(int ), (int)65);
                        continue block28;
                    }
                    case 1560686501: {
                        v4 = kw$GifAnimation.belk("bexd", bepx(int ), (int)66);
                        continue block28;
                    }
                    case 1562571713: {
                        break block28;
                    }
                }
                break;
            }
            var1_3 = kw$GifAnimation.a;
            if (var3_1) {
                throw null;
            }
            if (var1_3 || var1_3) break block36;
            v5 /* !! */  = kw$GifAnimation.cz;
            ** GOTO lbl50
        }
        if (var2_2 /* !! */  == 0) return null;
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: {
                    return null;
                }
lbl50:
                // 1 sources

                block30: while (true) {
                    switch ((int)v5 /* !! */ ) {
                        case -1858526880: {
                            v6 = kw$GifAnimation.belk("bexf", bepx(int ), (int)68);
                            ** GOTO lbl60
                        }
                        case -829854847: {
                            v6 = kw$GifAnimation.belk("bexg", bepx(int ), (int)69);
                            ** GOTO lbl60
                        }
                        case 477268584: {
                            v6 = kw$GifAnimation.belk("bexh", bepx(int ), (int)70);
lbl60:
                            // 3 sources

                            v5 /* !! */  = (long)(v6 - kw$GifAnimation.belk("bexe", bepx(int ), (int)67));
                            continue block30;
                        }
                        case 1562571713: {
                            return "gif_" + var0;
                        }
                    }
                    break;
                }
                return "gif_" + var0;
                case 2: {
                    var2_2 /* !! */  = (int)kw$GifAnimation.belk("bexl", belh(int ), (int)163);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 3: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)kw$GifAnimation.belk("bexm", belh(int ), (int)164);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 0: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)kw$GifAnimation.belk("bexj", belh(int ), (int)161);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: 
            }
            break;
        }
        if (true) ** GOTO lbl83
        do {
            if (true) ** continue;
lbl83:
            // 2 sources

            var2_2 /* !! */  = (int)kw$GifAnimation.belk("bexk", belh(int ), (int)162);
            cfr_temp_0 = 0;
        } while (!var3_1);
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void upload(BufferedImage var1_1, String var2_2, int var3_3) {
        block98: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = kw$GifAnimation.cz - kw$GifAnimation.belk("beqa", bepx(int ), (int)0)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == kw$GifAnimation.belk("beqb", belh(int ), (int)53)) break;
                v0 /* !! */  = (long)kw$GifAnimation.belk("beqc", belh(int ), (int)54);
            }
            var8_4 = kw$GifAnimation.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_2 = kw$GifAnimation.cz - kw$GifAnimation.belk("beqd", bepx(int ), (int)1)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == kw$GifAnimation.belk("beqe", belh(int ), (int)55)) break;
                v1 /* !! */  = (long)kw$GifAnimation.belk("beqf", belh(int ), (int)56);
            }
            var7_5 /* !! */  = kw$GifAnimation.b;
            v2 /* !! */  = kw$GifAnimation.cz;
            block54: while (true) {
                switch ((int)v2 /* !! */ ) {
                    case -30966070: {
                        v2 /* !! */  = (long)(kw$GifAnimation.belk("beqh", bepx(int ), (int)3) - kw$GifAnimation.belk("beqg", bepx(int ), (int)2));
                        continue block54;
                    }
                    case 1562571713: {
                        break block54;
                    }
                }
                break;
            }
            var6_6 = kw$GifAnimation.a;
            if (var8_4) {
                throw null;
            }
            if (var6_6) return;
            if (var7_5 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block55: do {
                switch (cfr_temp_0 == -2147483648 ? var7_5 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var6_6) return;
                        v3 /* !! */  = kw$GifAnimation.cz;
                        block56: while (true) {
                            switch ((int)v3 /* !! */ ) {
                                case 364106734: {
                                    v4 = kw$GifAnimation.belk("beqk", bepx(int ), (int)5);
                                    ** GOTO lbl44
                                }
                                case 704412512: {
                                    v4 = kw$GifAnimation.belk("beql", bepx(int ), (int)6);
                                    ** GOTO lbl44
                                }
                                case 1562571713: {
                                    break block56;
                                }
                                case 1956598415: {
                                    v4 = kw$GifAnimation.belk("beqm", bepx(int ), (int)7);
lbl44:
                                    // 3 sources

                                    v3 /* !! */  = (long)(v4 - kw$GifAnimation.belk("beqi", bepx(int ), (int)4));
                                    continue block56;
                                }
                            }
                            break;
                        }
                        var4_7 = kw.toNative(var1_1, var2_2);
                        if (var6_6 || var6_6) return;
                        v5 /* !! */  = kw$GifAnimation.cz;
                        block57: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case -752302864: {
                                    v5 /* !! */  = (long)(kw$GifAnimation.belk("beqo", bepx(int ), (int)9) - kw$GifAnimation.belk("beqn", bepx(int ), (int)8));
                                    continue block57;
                                }
                                case 1562571713: {
                                    break block57;
                                }
                            }
                            break;
                        }
                        v6 = RenderSystem.getDevice();
                        v7 /* !! */  = kw$GifAnimation.cz;
                        block58: while (true) {
                            switch ((int)v7 /* !! */ ) {
                                case -872947775: {
                                    v8 = kw$GifAnimation.belk("beqq", bepx(int ), (int)11);
                                    ** GOTO lbl68
                                }
                                case 476922381: {
                                    v8 = kw$GifAnimation.belk("beqr", bepx(int ), (int)12);
                                    ** GOTO lbl68
                                }
                                case 749797894: {
                                    v8 = kw$GifAnimation.belk("beqs", bepx(int ), (int)13);
lbl68:
                                    // 3 sources

                                    v7 /* !! */  = (long)(v8 - kw$GifAnimation.belk("beqp", bepx(int ), (int)10));
                                    continue block58;
                                }
                                case 1562571713: {
                                    break block58;
                                }
                            }
                            break;
                        }
                        v9 = (Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$upload$0(int ), ()Ljava/lang/String;)((int)var3_3);
                        v10 = kw$GifAnimation.belk("beqt", belh(int ), (int)57);
                        while (true) {
                            if ((v11 /* !! */  = (cfr_temp_3 = kw$GifAnimation.cz - kw$GifAnimation.belk("bequ", bepx(int ), (int)14)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v11 /* !! */  != kw$GifAnimation.belk("beqv", belh(int ), (int)58)) {
                                v11 /* !! */  = (long)kw$GifAnimation.belk("beqw", belh(int ), (int)59);
                                continue;
                            }
                            break block98;
                            break;
                        }
                    }
                    case 0: {
                        var7_5 /* !! */  = (int)kw$GifAnimation.belk("besn", belh(int ), (int)82);
                        cfr_temp_0 = 12;
                        if (!var8_4) continue block55;
                        throw null;
                    }
                    case 3: {
                        var7_5 /* !! */  = (int)kw$GifAnimation.belk("besr", belh(int ), (int)85);
                        cfr_temp_0 = 12;
                        if (!var8_4) continue block55;
                        throw null;
                    }
                    case 4: {
                        var7_5 /* !! */  = (int)kw$GifAnimation.belk("bess", belh(int ), (int)86);
                        cfr_temp_0 = 5;
                        if (!var8_4) continue block55;
                        throw null;
                    }
                    case 6: {
                        var7_5 /* !! */  = (int)kw$GifAnimation.belk("besu", belh(int ), (int)88);
                        if (var8_4) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 8: {
                        var7_5 /* !! */  = (int)kw$GifAnimation.belk("besw", belh(int ), (int)90);
                        if (var8_4) {
                            throw null;
                        }
                    }
                    case 1: {
                        ** GOTO lbl136
                    }
                    case 10: {
                        do {
                            var7_5 /* !! */  = (int)kw$GifAnimation.belk("besy", belh(int ), (int)92);
                        } while (!var8_4);
                        throw null;
                    }
                    case 13: {
                        var7_5 /* !! */  = (int)kw$GifAnimation.belk("betc", belh(int ), (int)95);
                        if (var8_4) {
                            throw null;
                        }
                    }
                    case 5: {
                        var7_5 /* !! */  = (int)kw$GifAnimation.belk("best", belh(int ), (int)87);
                        if (var8_4) {
                            throw null;
                        }
                    }
                    case 9: {
                        var7_5 /* !! */  = (int)kw$GifAnimation.belk("besx", belh(int ), (int)91);
                        if (var8_4) {
                            throw null;
                        }
                    }
                    case 12: {
                        var7_5 /* !! */  = (int)kw$GifAnimation.belk("betb", belh(int ), (int)94);
                        if (var8_4) {
                            throw null;
                        }
                    }
                    case 14: {
                        var7_5 /* !! */  = (int)kw$GifAnimation.belk("betd", belh(int ), (int)96);
                        cfr_temp_0 = 11;
                        if (!var8_4) continue block55;
                        throw null;
                    }
                    case 15: lbl-1000:
                    // 2 sources

                    {
                        var7_5 /* !! */  = (int)kw$GifAnimation.belk("bete", belh(int ), (int)97);
                        if (var8_4) {
                            throw null;
                        }
lbl136:
                        // 3 sources

                        var7_5 /* !! */  = (int)kw$GifAnimation.belk("beso", belh(int ), (int)83);
                        if (var8_4) {
                            throw null;
                        }
                    }
                    case 2: {
                        var7_5 /* !! */  = (int)kw$GifAnimation.belk("besq", belh(int ), (int)84);
                        if (var8_4) {
                            throw null;
                        }
                    }
                    case 11: {
                        var7_5 /* !! */  = (int)kw$GifAnimation.belk("besz", belh(int ), (int)93);
                        if (var8_4) {
                            throw null;
                        }
                    }
                    case 7: 
                }
                break;
            } while (true);
            do {
                var7_5 /* !! */  = (int)kw$GifAnimation.belk("besv", belh(int ), (int)89);
            } while (!var8_4);
            throw null;
        }
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_4 = kw$GifAnimation.cz - kw$GifAnimation.belk("beqx", bepx(int ), (int)15)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == kw$GifAnimation.belk("beqy", belh(int ), (int)60)) break;
            v12 /* !! */  = (long)kw$GifAnimation.belk("beqz", belh(int ), (int)61);
        }
        v13 = var1_1.getWidth();
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_5 = kw$GifAnimation.cz - kw$GifAnimation.belk("bera", bepx(int ), (int)16)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == kw$GifAnimation.belk("berb", belh(int ), (int)62)) break;
            v14 /* !! */  = (long)kw$GifAnimation.belk("berc", belh(int ), (int)63);
        }
        v15 = var1_1.getHeight();
        v16 = kw$GifAnimation.belk("berd", belh(int ), (int)64);
        v17 = kw$GifAnimation.belk("bere", belh(int ), (int)65);
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_6 = kw$GifAnimation.cz - kw$GifAnimation.belk("berf", bepx(int ), (int)17)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == kw$GifAnimation.belk("berg", belh(int ), (int)66)) {
                var5_8 = v6.createTexture(v9, (int)v10, TextureFormat.RGBA8, v13, v15, (int)v16, (int)v17);
                if (var6_6) return;
                break;
            }
            v18 /* !! */  = (long)kw$GifAnimation.belk("beri", belh(int ), (int)67);
        }
        if (var6_6) return;
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_7 = kw$GifAnimation.cz - kw$GifAnimation.belk("berj", bepx(int ), (int)18)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == kw$GifAnimation.belk("berk", belh(int ), (int)68)) break;
            v19 /* !! */  = (long)kw$GifAnimation.belk("berl", belh(int ), (int)69);
        }
        v20 = RenderSystem.getDevice();
        while (true) {
            if ((v21 /* !! */  = (cfr_temp_8 = kw$GifAnimation.cz - kw$GifAnimation.belk("berm", bepx(int ), (int)19)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v21 /* !! */  == kw$GifAnimation.belk("bern", belh(int ), (int)70)) break;
            v21 /* !! */  = (long)kw$GifAnimation.belk("bero", belh(int ), (int)71);
        }
        v22 = v20.createCommandEncoder();
        while (true) {
            if ((v23 /* !! */  = (cfr_temp_9 = kw$GifAnimation.cz - kw$GifAnimation.belk("berp", bepx(int ), (int)20)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v23 /* !! */  == kw$GifAnimation.belk("berq", belh(int ), (int)72)) {
                v22.writeToTexture(var5_8, var4_7);
                if (var6_6) return;
                break;
            }
            v23 /* !! */  = (long)kw$GifAnimation.belk("berr", belh(int ), (int)73);
        }
        if (var6_6) return;
        while (true) {
            if ((v24 /* !! */  = (cfr_temp_10 = kw$GifAnimation.cz - kw$GifAnimation.belk("bers", bepx(int ), (int)21)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v24 /* !! */  == kw$GifAnimation.belk("bert", belh(int ), (int)74)) {
                var4_7.close();
                if (var6_6) return;
                break;
            }
            v24 /* !! */  = (long)kw$GifAnimation.belk("beru", belh(int ), (int)75);
        }
        if (var6_6) return;
        v25 /* !! */  = kw$GifAnimation.cz;
        block69: while (true) {
            switch ((int)v25 /* !! */ ) {
                case -760300695: {
                    v25 /* !! */  = (long)(kw$GifAnimation.belk("berw", bepx(int ), (int)23) - kw$GifAnimation.belk("berv", bepx(int ), (int)22));
                    continue block69;
                }
                case 1562571713: {
                    break block69;
                }
            }
            break;
        }
        while (true) {
            if ((v26 /* !! */  = (cfr_temp_11 = kw$GifAnimation.cz - kw$GifAnimation.belk("berx", bepx(int ), (int)24)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v26 /* !! */  == kw$GifAnimation.belk("berz", belh(int ), (int)76)) {
                this.textures.add(var5_8);
                if (var6_6) return;
                break;
            }
            v26 /* !! */  = (long)kw$GifAnimation.belk("besa", belh(int ), (int)77);
        }
        if (var6_6) return;
        v27 /* !! */  = kw$GifAnimation.cz;
        if (true) ** GOTO lbl229
        block71: while (true) {
            v27 /* !! */  = (long)(v28 - kw$GifAnimation.belk("besb", bepx(int ), (int)25));
lbl229:
            // 2 sources

            switch ((int)v27 /* !! */ ) {
                case -1984992920: {
                    v28 = kw$GifAnimation.belk("besc", bepx(int ), (int)26);
                    continue block71;
                }
                case -157957060: {
                    v28 = kw$GifAnimation.belk("besd", bepx(int ), (int)27);
                    continue block71;
                }
                case 1562571713: {
                    break block71;
                }
            }
            break;
        }
        while (true) {
            if ((v29 /* !! */  = (cfr_temp_12 = kw$GifAnimation.cz - kw$GifAnimation.belk("bese", bepx(int ), (int)28)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
            if (v29 /* !! */  == kw$GifAnimation.belk("besf", belh(int ), (int)78)) break;
            v29 /* !! */  = (long)kw$GifAnimation.belk("besg", belh(int ), (int)79);
        }
        v30 = RenderSystem.getDevice();
        while (true) {
            block99: {
                if ((v31 /* !! */  = (cfr_temp_13 = kw$GifAnimation.cz - kw$GifAnimation.belk("besh", bepx(int ), (int)29)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                if (v31 /* !! */  != kw$GifAnimation.belk("besi", belh(int ), (int)80)) break block99;
                v32 = v30.createTextureView(var5_8);
                v33 /* !! */  = kw$GifAnimation.cz;
                if (true) ** GOTO lbl255
            }
            v31 /* !! */  = (long)kw$GifAnimation.belk("besj", belh(int ), (int)81);
        }
        block74: while (true) {
            v33 /* !! */  = (long)(v34 - kw$GifAnimation.belk("besk", bepx(int ), (int)30));
lbl255:
            // 2 sources

            switch ((int)v33 /* !! */ ) {
                case -1835315003: {
                    v34 = kw$GifAnimation.belk("besl", bepx(int ), (int)31);
                    continue block74;
                }
                case -300766564: {
                    v34 = kw$GifAnimation.belk("besm", bepx(int ), (int)32);
                    continue block74;
                }
                case 1562571713: {
                    break block74;
                }
            }
            break;
        }
        this.views.add(v32);
        if (!var6_6 && !var6_6) return;
    }

    private static void bexs() {
        kw$GifAnimation.bepy[0] = 2653995508426170747L;
        kw$GifAnimation.bepy[1] = 4902344901631012944L;
        kw$GifAnimation.bepy[2] = 7993423974369885492L;
        kw$GifAnimation.bepy[3] = -6245381605965732341L;
        kw$GifAnimation.bepy[4] = -5860714817566271293L;
        kw$GifAnimation.bepy[5] = -7212920148023962654L;
        kw$GifAnimation.bepy[6] = 1018264817881814970L;
        kw$GifAnimation.bepy[7] = -8692376617466359239L;
        kw$GifAnimation.bepy[8] = 7389291096089782210L;
        kw$GifAnimation.bepy[9] = -8734871573247711338L;
        kw$GifAnimation.bepy[10] = 7111571502024039923L;
        kw$GifAnimation.bepy[11] = 4806347659530212489L;
        kw$GifAnimation.bepy[12] = -7945524973825694463L;
        kw$GifAnimation.bepy[13] = 1103441981472012629L;
        kw$GifAnimation.bepy[14] = -9087835664874807998L;
        kw$GifAnimation.bepy[15] = 6882431332819476591L;
        kw$GifAnimation.bepy[16] = -2759097547124204628L;
        kw$GifAnimation.bepy[17] = -9018351770084395746L;
        kw$GifAnimation.bepy[18] = 6119459205691487601L;
        kw$GifAnimation.bepy[19] = 265779043181813689L;
        kw$GifAnimation.bepy[20] = 3030100458315337741L;
        kw$GifAnimation.bepy[21] = -8263659973020229271L;
        kw$GifAnimation.bepy[22] = 1965432612527249962L;
        kw$GifAnimation.bepy[23] = 8479288967714458009L;
        kw$GifAnimation.bepy[24] = 3272192902935217486L;
        kw$GifAnimation.bepy[25] = 4527835629817165970L;
        kw$GifAnimation.bepy[26] = -6155878150350057403L;
        kw$GifAnimation.bepy[27] = -5758542578684396667L;
        kw$GifAnimation.bepy[28] = 4019967511798389560L;
        kw$GifAnimation.bepy[29] = 7091026503360706964L;
        kw$GifAnimation.bepy[30] = 5901482113520365635L;
        kw$GifAnimation.bepy[31] = 232254254343077281L;
        kw$GifAnimation.bepy[32] = -9171925755487363884L;
        kw$GifAnimation.bepy[33] = 9115395156851262271L;
        kw$GifAnimation.bepy[34] = 5997402391273807913L;
        kw$GifAnimation.bepy[35] = 8565965147112462996L;
        kw$GifAnimation.bepy[36] = -4193704923655955756L;
        kw$GifAnimation.bepy[37] = -5262143314475114591L;
        kw$GifAnimation.bepy[38] = -8932997879209246432L;
        kw$GifAnimation.bepy[39] = -3102425031680876307L;
        kw$GifAnimation.bepy[40] = 5351242919324303158L;
        kw$GifAnimation.bepy[41] = 2670954166512521674L;
        kw$GifAnimation.bepy[42] = 2931191890988316463L;
        kw$GifAnimation.bepy[43] = -2418579904752197448L;
        kw$GifAnimation.bepy[44] = 8568536455031479612L;
        kw$GifAnimation.bepy[45] = -1134217422911007319L;
        kw$GifAnimation.bepy[46] = 6911640299815022634L;
        kw$GifAnimation.bepy[47] = -2737856499303154995L;
        kw$GifAnimation.bepy[48] = 5298791251901220353L;
        kw$GifAnimation.bepy[49] = -482908797315625742L;
        kw$GifAnimation.bepy[50] = 6529211596159002337L;
        kw$GifAnimation.bepy[51] = 3670705876647080530L;
        kw$GifAnimation.bepy[52] = 3058489906444648393L;
        kw$GifAnimation.bepy[53] = -4801499714613068514L;
        kw$GifAnimation.bepy[54] = 3350406724741539729L;
        kw$GifAnimation.bepy[55] = -7254606867350027232L;
        kw$GifAnimation.bepy[56] = 8109249179431592190L;
        kw$GifAnimation.bepy[57] = -815985293364958507L;
        kw$GifAnimation.bepy[58] = -8966024527393987167L;
        kw$GifAnimation.bepy[59] = -1305171667739558643L;
        kw$GifAnimation.bepy[60] = 1058422818351414543L;
        kw$GifAnimation.bepy[61] = -7345606734083125472L;
        kw$GifAnimation.bepy[62] = 3156743920056046716L;
        kw$GifAnimation.bepy[63] = -5324271050635384811L;
        kw$GifAnimation.bepy[64] = 5596038329236688315L;
        kw$GifAnimation.bepy[65] = -6751549111193909864L;
        kw$GifAnimation.bepy[66] = -6437169551607933811L;
        kw$GifAnimation.bepy[67] = 5919014324481223799L;
        kw$GifAnimation.bepy[68] = -2493901728427910306L;
        kw$GifAnimation.bepy[69] = 1597504675963074685L;
        kw$GifAnimation.bepy[70] = 1055904645646794479L;
    }

    private static int belh(int n2) {
        return beli[n2] ^ belj[n2];
    }

    /*
     * Exception decompiling
     */
    kw$GifAnimation(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static void bexn() {
        kw$GifAnimation.beli[0] = 1821075790;
        kw$GifAnimation.beli[1] = -1110983438;
        kw$GifAnimation.beli[2] = -392177064;
        kw$GifAnimation.beli[3] = 898682477;
        kw$GifAnimation.beli[4] = 1918622716;
        kw$GifAnimation.beli[5] = 1301244602;
        kw$GifAnimation.beli[6] = -488721634;
        kw$GifAnimation.beli[7] = -1758550190;
        kw$GifAnimation.beli[8] = 1407333272;
        kw$GifAnimation.beli[9] = 1345153912;
        kw$GifAnimation.beli[10] = 1321852601;
        kw$GifAnimation.beli[11] = -1869346593;
        kw$GifAnimation.beli[12] = 1129566000;
        kw$GifAnimation.beli[13] = 1321981160;
        kw$GifAnimation.beli[14] = 411861590;
        kw$GifAnimation.beli[15] = -1728436428;
        kw$GifAnimation.beli[16] = 296929010;
        kw$GifAnimation.beli[17] = -2057042167;
        kw$GifAnimation.beli[18] = 1996035803;
        kw$GifAnimation.beli[19] = 261704848;
        kw$GifAnimation.beli[20] = 1780493811;
        kw$GifAnimation.beli[21] = -2143315921;
        kw$GifAnimation.beli[22] = -1771890057;
        kw$GifAnimation.beli[23] = 1212442943;
        kw$GifAnimation.beli[24] = 1368338322;
        kw$GifAnimation.beli[25] = -1595588573;
        kw$GifAnimation.beli[26] = -1884398790;
        kw$GifAnimation.beli[27] = -749519966;
        kw$GifAnimation.beli[28] = 948262962;
        kw$GifAnimation.beli[29] = -532051157;
        kw$GifAnimation.beli[30] = -1031121824;
        kw$GifAnimation.beli[31] = 604142529;
        kw$GifAnimation.beli[32] = 713400071;
        kw$GifAnimation.beli[33] = 1129533752;
        kw$GifAnimation.beli[34] = 2118339542;
        kw$GifAnimation.beli[35] = -1190943754;
        kw$GifAnimation.beli[36] = 1250494406;
        kw$GifAnimation.beli[37] = 1765817316;
        kw$GifAnimation.beli[38] = -990238422;
        kw$GifAnimation.beli[39] = 980173113;
        kw$GifAnimation.beli[40] = -557782608;
        kw$GifAnimation.beli[41] = -780805050;
        kw$GifAnimation.beli[42] = 749679928;
        kw$GifAnimation.beli[43] = 684650608;
        kw$GifAnimation.beli[44] = 218904308;
        kw$GifAnimation.beli[45] = 605033517;
        kw$GifAnimation.beli[46] = 798702629;
        kw$GifAnimation.beli[47] = -1455004115;
        kw$GifAnimation.beli[48] = 105534613;
        kw$GifAnimation.beli[49] = 642111545;
        kw$GifAnimation.beli[50] = 353747031;
        kw$GifAnimation.beli[51] = 1138567763;
        kw$GifAnimation.beli[52] = 2118866681;
        kw$GifAnimation.beli[53] = -2092766403;
        kw$GifAnimation.beli[54] = 1728757035;
        kw$GifAnimation.beli[55] = -395671419;
        kw$GifAnimation.beli[56] = 1164488889;
        kw$GifAnimation.beli[57] = 244859109;
        kw$GifAnimation.beli[58] = 442485708;
        kw$GifAnimation.beli[59] = -1624071884;
        kw$GifAnimation.beli[60] = -2007206741;
        kw$GifAnimation.beli[61] = -661407871;
        kw$GifAnimation.beli[62] = 679762181;
        kw$GifAnimation.beli[63] = 1071902784;
        kw$GifAnimation.beli[64] = -502489895;
        kw$GifAnimation.beli[65] = 1671422692;
        kw$GifAnimation.beli[66] = 2112337588;
        kw$GifAnimation.beli[67] = -1664631914;
        kw$GifAnimation.beli[68] = -144617237;
        kw$GifAnimation.beli[69] = 9350856;
        kw$GifAnimation.beli[70] = -641181329;
        kw$GifAnimation.beli[71] = -270826231;
        kw$GifAnimation.beli[72] = 1820305764;
        kw$GifAnimation.beli[73] = 14663444;
        kw$GifAnimation.beli[74] = -1941569127;
        kw$GifAnimation.beli[75] = -456264083;
        kw$GifAnimation.beli[76] = 139686995;
        kw$GifAnimation.beli[77] = -477448444;
        kw$GifAnimation.beli[78] = -22262019;
        kw$GifAnimation.beli[79] = -1382849932;
        kw$GifAnimation.beli[80] = -356157419;
        kw$GifAnimation.beli[81] = 1941653550;
        kw$GifAnimation.beli[82] = -1768759862;
        kw$GifAnimation.beli[83] = -1402474685;
        kw$GifAnimation.beli[84] = 1043835634;
        kw$GifAnimation.beli[85] = -1072258486;
        kw$GifAnimation.beli[86] = -514478234;
        kw$GifAnimation.beli[87] = -1450141857;
        kw$GifAnimation.beli[88] = -129436966;
        kw$GifAnimation.beli[89] = 1008422443;
        kw$GifAnimation.beli[90] = -34943897;
        kw$GifAnimation.beli[91] = -2021990201;
        kw$GifAnimation.beli[92] = 1234905360;
        kw$GifAnimation.beli[93] = 664511930;
        kw$GifAnimation.beli[94] = 2010925032;
        kw$GifAnimation.beli[95] = -1533821169;
        kw$GifAnimation.beli[96] = -1300831886;
        kw$GifAnimation.beli[97] = -782556242;
        kw$GifAnimation.beli[98] = -1549299969;
        kw$GifAnimation.beli[99] = -1338780013;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public GpuTextureView getCurrentFrame() {
        block70: {
            block69: {
                var8_1 = kw$GifAnimation.c;
                var7_2 /* !! */  = kw$GifAnimation.b;
                var6_3 = kw$GifAnimation.a;
                if (var8_1) {
                    throw null;
lbl6:
                    // 16 sources

                    return null;
                }
                if (var6_3 || var6_3) ** GOTO lbl6
                if (!this.views.isEmpty()) break block69;
                if (var6_3 || var6_3) ** GOTO lbl6
                return null;
            }
            if (var6_3 || var6_3) ** GOTO lbl6
            if (this.totalDuration > 0) break block70;
            if (var6_3 || var6_3) ** GOTO lbl6
            return this.views.get((int)kw$GifAnimation.belk("betg", belh(int ), (int)98));
        }
        if (var6_3 || var6_3) ** GOTO lbl6
        var1_4 = System.currentTimeMillis() % (long)this.totalDuration;
        if (var6_3 || var6_3) ** GOTO lbl6
        var3_5 = kw$GifAnimation.belk("beth", bepx(int ), (int)33);
        if (var6_3 || var6_3) ** GOTO lbl6
        var5_6 = kw$GifAnimation.belk("beti", belh(int ), (int)99);
        if (var6_3) ** GOTO lbl6
        block35: while (true) {
            if (var6_3 || var6_3) ** GOTO lbl6
            if (var5_6 >= this.views.size()) ** GOTO lbl43
            if (var6_3) ** GOTO lbl6
            if (var7_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var7_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var6_3) ** GOTO lbl6
                    var3_5 += (long)this.delays.get((int)var5_6).intValue();
                    if (var6_3 || var6_3) ** GOTO lbl6
                    if (var1_4 >= var3_5) ** GOTO lbl38
                    if (var6_3 || var6_3) ** GOTO lbl6
                    return this.views.get((int)var5_6);
lbl38:
                    // 1 sources

                    if (var6_3 || var6_3) ** GOTO lbl6
                    ++var5_6;
                    if (var6_3) ** GOTO lbl6
                    if (!var8_1) continue block35;
                    throw null;
                }
lbl43:
                // 1 sources

                if (!var6_3 && !var6_3) ** break;
                ** continue;
                return this.views.get(this.views.size() - kw$GifAnimation.belk("betj", belh(int ), (int)100));
lbl46:
                // 2 sources

                case 0: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("betk", belh(int ), (int)101);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl163
                }
                case 1: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("betl", belh(int ), (int)102);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl153
                }
                case 2: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("betm", belh(int ), (int)103);
                    if (!var8_1) ** GOTO lbl46
                    throw null;
                }
                case 3: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("betn", belh(int ), (int)104);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl105
                }
lbl65:
                // 2 sources

                case 4: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("beto", belh(int ), (int)105);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl158
                }
lbl70:
                // 2 sources

                case 5: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("betp", belh(int ), (int)106);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl182
                }
lbl75:
                // 2 sources

                case 6: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("betq", belh(int ), (int)107);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl186
                }
                case 7: {
                    do {
                        var7_2 /* !! */  = (int)kw$GifAnimation.belk("betr", belh(int ), (int)108);
                    } while (!var8_1);
                    throw null;
                }
lbl85:
                // 2 sources

                case 8: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var7_2 /* !! */  = (int)kw$GifAnimation.belk("bets", belh(int ), (int)109);
                        if (var8_1) {
                            throw null;
                        }
                        ** GOTO lbl140
                        break;
                    }
                }
                case 9: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("bett", belh(int ), (int)110);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl158
                }
lbl96:
                // 2 sources

                case 10: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("betu", belh(int ), (int)111);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl136
                }
lbl101:
                // 2 sources

                case 11: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("betw", belh(int ), (int)112);
                    if (!var8_1) ** GOTO lbl96
                    throw null;
                }
lbl105:
                // 3 sources

                case 12: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("betx", belh(int ), (int)113);
                    if (!var8_1) ** GOTO lbl65
                    throw null;
                }
                case 13: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("bety", belh(int ), (int)114);
                    if (!var8_1) ** GOTO lbl101
                    throw null;
                }
                case 14: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("betz", belh(int ), (int)115);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl173
                }
lbl118:
                // 2 sources

                case 15: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("beua", belh(int ), (int)116);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl136
                }
                case 16: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("beub", belh(int ), (int)117);
                    if (!var8_1) ** GOTO lbl70
                    throw null;
                }
lbl127:
                // 2 sources

                case 17: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("beuc", belh(int ), (int)118);
                    if (!var8_1) ** GOTO lbl105
                    throw null;
                }
                case 18: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("beud", belh(int ), (int)119);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl186
                }
lbl136:
                // 4 sources

                case 19: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("beue", belh(int ), (int)120);
                    if (!var8_1) ** GOTO lbl85
                    throw null;
                }
lbl140:
                // 2 sources

                case 20: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("beuf", belh(int ), (int)121);
                    if (!var8_1) ** GOTO lbl136
                    throw null;
                }
                case 21: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("beug", belh(int ), (int)122);
                    if (!var8_1) ** GOTO lbl118
                    throw null;
                }
                case 22: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("beuh", belh(int ), (int)123);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl182
                }
lbl153:
                // 2 sources

                case 23: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("beui", belh(int ), (int)124);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl177
                }
lbl158:
                // 3 sources

                case 24: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("beuj", belh(int ), (int)125);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl173
                }
lbl163:
                // 3 sources

                case 25: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("beuk", belh(int ), (int)126);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl177
                }
                case 26: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("beul", belh(int ), (int)127);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl177
                }
lbl173:
                // 3 sources

                case 27: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("beum", belh(int ), (int)128);
                    if (!var8_1) ** GOTO lbl163
                    throw null;
                }
lbl177:
                // 4 sources

                case 28: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("beuo", belh(int ), (int)129);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl186
                }
lbl182:
                // 3 sources

                case 29: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("beup", belh(int ), (int)130);
                    if (!var8_1) ** GOTO lbl127
                    throw null;
                }
lbl186:
                // 4 sources

                case 30: {
                    var7_2 /* !! */  = (int)kw$GifAnimation.belk("beuq", belh(int ), (int)131);
                    if (!var8_1) ** GOTO lbl75
                    throw null;
                }
                case 31: 
            }
            break;
        }
        var7_2 /* !! */  = (int)kw$GifAnimation.belk("beur", belh(int ), (int)132);
        ** while (!var8_1)
lbl193:
        // 1 sources

        throw null;
    }

    private static void bexr() {
        kw$GifAnimation.belj[100] = 1081481627;
        kw$GifAnimation.belj[101] = 323591077;
        kw$GifAnimation.belj[102] = -191974813;
        kw$GifAnimation.belj[103] = -788077436;
        kw$GifAnimation.belj[104] = 2055706893;
        kw$GifAnimation.belj[105] = -610205259;
        kw$GifAnimation.belj[106] = -1875863532;
        kw$GifAnimation.belj[107] = -1433428983;
        kw$GifAnimation.belj[108] = 2111846272;
        kw$GifAnimation.belj[109] = -1063188547;
        kw$GifAnimation.belj[110] = 980926052;
        kw$GifAnimation.belj[111] = -83118092;
        kw$GifAnimation.belj[112] = -1763525417;
        kw$GifAnimation.belj[113] = 1173691741;
        kw$GifAnimation.belj[114] = 1635152698;
        kw$GifAnimation.belj[115] = -843990718;
        kw$GifAnimation.belj[116] = 1890036925;
        kw$GifAnimation.belj[117] = 1818719843;
        kw$GifAnimation.belj[118] = 1368843913;
        kw$GifAnimation.belj[119] = 840465207;
        kw$GifAnimation.belj[120] = 73380345;
        kw$GifAnimation.belj[121] = -727304813;
        kw$GifAnimation.belj[122] = -1934985277;
        kw$GifAnimation.belj[123] = 205612487;
        kw$GifAnimation.belj[124] = -2094994682;
        kw$GifAnimation.belj[125] = -1360396373;
        kw$GifAnimation.belj[126] = 2073814672;
        kw$GifAnimation.belj[127] = -752295368;
        kw$GifAnimation.belj[128] = 23325666;
        kw$GifAnimation.belj[129] = -1773913439;
        kw$GifAnimation.belj[130] = 1715952315;
        kw$GifAnimation.belj[131] = 467072516;
        kw$GifAnimation.belj[132] = 443451686;
        kw$GifAnimation.belj[133] = 1560613833;
        kw$GifAnimation.belj[134] = -1053732486;
        kw$GifAnimation.belj[135] = -1401860276;
        kw$GifAnimation.belj[136] = -350691859;
        kw$GifAnimation.belj[137] = 689997514;
        kw$GifAnimation.belj[138] = -1715756940;
        kw$GifAnimation.belj[139] = -1647057366;
        kw$GifAnimation.belj[140] = 2144431192;
        kw$GifAnimation.belj[141] = 2004197146;
        kw$GifAnimation.belj[142] = 337797473;
        kw$GifAnimation.belj[143] = 831428782;
        kw$GifAnimation.belj[144] = -1440013195;
        kw$GifAnimation.belj[145] = -1634450035;
        kw$GifAnimation.belj[146] = -876128402;
        kw$GifAnimation.belj[147] = -867524206;
        kw$GifAnimation.belj[148] = 1509912330;
        kw$GifAnimation.belj[149] = -1146562048;
        kw$GifAnimation.belj[150] = 2100785018;
        kw$GifAnimation.belj[151] = 1365010841;
        kw$GifAnimation.belj[152] = -664347267;
        kw$GifAnimation.belj[153] = 593994116;
        kw$GifAnimation.belj[154] = -1816659939;
        kw$GifAnimation.belj[155] = 288570027;
        kw$GifAnimation.belj[156] = 1225798158;
        kw$GifAnimation.belj[157] = 2124392481;
        kw$GifAnimation.belj[158] = 856508375;
        kw$GifAnimation.belj[159] = 758367806;
        kw$GifAnimation.belj[160] = -128121149;
        kw$GifAnimation.belj[161] = 1111614094;
        kw$GifAnimation.belj[162] = 1901673111;
        kw$GifAnimation.belj[163] = -1374070384;
        kw$GifAnimation.belj[164] = -215658168;
    }

    private static void bexo() {
        kw$GifAnimation.beli[100] = 1081481626;
        kw$GifAnimation.beli[101] = 323591074;
        kw$GifAnimation.beli[102] = -191974803;
        kw$GifAnimation.beli[103] = -788077423;
        kw$GifAnimation.beli[104] = 2055706910;
        kw$GifAnimation.beli[105] = -610205267;
        kw$GifAnimation.beli[106] = -1875863523;
        kw$GifAnimation.beli[107] = -1433428977;
        kw$GifAnimation.beli[108] = 2111846300;
        kw$GifAnimation.beli[109] = -1063188551;
        kw$GifAnimation.beli[110] = 980926057;
        kw$GifAnimation.beli[111] = -83118102;
        kw$GifAnimation.beli[112] = -1763525425;
        kw$GifAnimation.beli[113] = 1173691723;
        kw$GifAnimation.beli[114] = 1635152692;
        kw$GifAnimation.beli[115] = -843990694;
        kw$GifAnimation.beli[116] = 1890036905;
        kw$GifAnimation.beli[117] = 1818719849;
        kw$GifAnimation.beli[118] = 1368843928;
        kw$GifAnimation.beli[119] = 840465210;
        kw$GifAnimation.beli[120] = 73380337;
        kw$GifAnimation.beli[121] = -727304801;
        kw$GifAnimation.beli[122] = -1934985276;
        kw$GifAnimation.beli[123] = 205612490;
        kw$GifAnimation.beli[124] = -2094994668;
        kw$GifAnimation.beli[125] = -1360396384;
        kw$GifAnimation.beli[126] = 2073814658;
        kw$GifAnimation.beli[127] = -752295379;
        kw$GifAnimation.beli[128] = 23325685;
        kw$GifAnimation.beli[129] = -1773913437;
        kw$GifAnimation.beli[130] = 1715952311;
        kw$GifAnimation.beli[131] = 467072523;
        kw$GifAnimation.beli[132] = 443451711;
        kw$GifAnimation.beli[133] = -1560613834;
        kw$GifAnimation.beli[134] = -159287029;
        kw$GifAnimation.beli[135] = -1401860275;
        kw$GifAnimation.beli[136] = -1025934902;
        kw$GifAnimation.beli[137] = -689997515;
        kw$GifAnimation.beli[138] = 1810523125;
        kw$GifAnimation.beli[139] = -1647057365;
        kw$GifAnimation.beli[140] = -1455942824;
        kw$GifAnimation.beli[141] = -2004197147;
        kw$GifAnimation.beli[142] = 780639094;
        kw$GifAnimation.beli[143] = 831428783;
        kw$GifAnimation.beli[144] = -386755939;
        kw$GifAnimation.beli[145] = -1634450036;
        kw$GifAnimation.beli[146] = -847027600;
        kw$GifAnimation.beli[147] = -867524205;
        kw$GifAnimation.beli[148] = -1833098864;
        kw$GifAnimation.beli[149] = -1146562041;
        kw$GifAnimation.beli[150] = 2100785022;
        kw$GifAnimation.beli[151] = 1365010832;
        kw$GifAnimation.beli[152] = -664347267;
        kw$GifAnimation.beli[153] = 593994119;
        kw$GifAnimation.beli[154] = -1816659939;
        kw$GifAnimation.beli[155] = 288570029;
        kw$GifAnimation.beli[156] = 1225798155;
        kw$GifAnimation.beli[157] = 2124392487;
        kw$GifAnimation.beli[158] = 856508370;
        kw$GifAnimation.beli[159] = 758367797;
        kw$GifAnimation.beli[160] = -128121150;
        kw$GifAnimation.beli[161] = 1111614092;
        kw$GifAnimation.beli[162] = 1901673111;
        kw$GifAnimation.beli[163] = -1374070383;
        kw$GifAnimation.beli[164] = -215658166;
    }

    static {
        beli = new int[165];
        belj = new int[165];
        kw$GifAnimation.bexn();
        kw$GifAnimation.bexo();
        kw$GifAnimation.bexp();
        kw$GifAnimation.bexr();
        bepy = new long[71];
        bepz = new long[71];
        kw$GifAnimation.bexs();
        kw$GifAnimation.bexu();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void dispose() {
        v0 /* !! */  = kw$GifAnimation.cz;
        if (true) ** GOTO lbl5
        block41: while (true) {
            v0 /* !! */  = (long)(kw$GifAnimation.belk("beut", bepx(int ), (int)35) - kw$GifAnimation.belk("beus", bepx(int ), (int)34));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1144494574: {
                    continue block41;
                }
                case 1562571713: {
                    break block41;
                }
            }
            break;
        }
        var3_1 = kw$GifAnimation.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = kw$GifAnimation.cz - kw$GifAnimation.belk("beuu", bepx(int ), (int)36)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == kw$GifAnimation.belk("beuv", belh(int ), (int)133)) break;
            v1 /* !! */  = (long)kw$GifAnimation.belk("beuw", belh(int ), (int)134);
        }
        var2_2 /* !! */  = kw$GifAnimation.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = kw$GifAnimation.cz - kw$GifAnimation.belk("beux", bepx(int ), (int)37)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kw$GifAnimation.belk("beuy", belh(int ), (int)135)) break;
            v2 /* !! */  = (long)kw$GifAnimation.belk("beuz", belh(int ), (int)136);
        }
        var1_3 = kw$GifAnimation.a;
        if (var3_1) {
            throw null;
lbl25:
            // 5 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl25
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = kw$GifAnimation.cz - kw$GifAnimation.belk("beva", bepx(int ), (int)38)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == kw$GifAnimation.belk("bevb", belh(int ), (int)137)) break;
            v3 /* !! */  = (long)kw$GifAnimation.belk("bevc", belh(int ), (int)138);
        }
        v4 /* !! */  = kw$GifAnimation.cz;
        if (true) ** GOTO lbl37
        block46: while (true) {
            v4 /* !! */  = (long)(v5 - kw$GifAnimation.belk("bevd", bepx(int ), (int)39));
lbl37:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -490889011: {
                    v5 = kw$GifAnimation.belk("beve", bepx(int ), (int)40);
                    continue block46;
                }
                case -256996747: {
                    v5 = kw$GifAnimation.belk("bevg", bepx(int ), (int)41);
                    continue block46;
                }
                case 1259307857: {
                    v5 = kw$GifAnimation.belk("bevh", bepx(int ), (int)42);
                    continue block46;
                }
                case 1562571713: {
                    break block46;
                }
            }
            break;
        }
        v6 = (Consumer<GpuTextureView>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, close(), (Lcom/mojang/blaze3d/textures/GpuTextureView;)V)();
        v7 /* !! */  = kw$GifAnimation.cz;
        if (true) ** GOTO lbl54
        block47: while (true) {
            v7 /* !! */  = (long)(v8 - kw$GifAnimation.belk("bevi", bepx(int ), (int)43));
lbl54:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -2073034539: {
                    v8 = kw$GifAnimation.belk("bevj", bepx(int ), (int)44);
                    continue block47;
                }
                case -462549264: {
                    v8 = kw$GifAnimation.belk("bevk", bepx(int ), (int)45);
                    continue block47;
                }
                case 743616798: {
                    v8 = kw$GifAnimation.belk("bevl", bepx(int ), (int)46);
                    continue block47;
                }
                case 1562571713: {
                    break block47;
                }
            }
            break;
        }
        this.views.forEach(v6);
        if (var1_3 || var1_3) ** GOTO lbl25
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_3 = kw$GifAnimation.cz - kw$GifAnimation.belk("bevm", bepx(int ), (int)47)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == kw$GifAnimation.belk("bevn", belh(int ), (int)139)) break;
            v9 /* !! */  = (long)kw$GifAnimation.belk("bevo", belh(int ), (int)140);
        }
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_4 = kw$GifAnimation.cz - kw$GifAnimation.belk("bevp", bepx(int ), (int)48)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == kw$GifAnimation.belk("bevq", belh(int ), (int)141)) break;
            v10 /* !! */  = (long)kw$GifAnimation.belk("bevr", belh(int ), (int)142);
        }
        v11 = (Consumer<GpuTexture>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, close(), (Lcom/mojang/blaze3d/textures/GpuTexture;)V)();
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_5 = kw$GifAnimation.cz - kw$GifAnimation.belk("bevs", bepx(int ), (int)49)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == kw$GifAnimation.belk("bevt", belh(int ), (int)143)) break;
            v12 /* !! */  = (long)kw$GifAnimation.belk("bevu", belh(int ), (int)144);
        }
        this.textures.forEach(v11);
        if (var1_3 || var1_3) ** GOTO lbl25
        v13 /* !! */  = kw$GifAnimation.cz;
        if (true) ** GOTO lbl90
        block51: while (true) {
            v13 /* !! */  = (long)(v14 - kw$GifAnimation.belk("bevv", bepx(int ), (int)50));
lbl90:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -2021570330: {
                    v14 = kw$GifAnimation.belk("bevw", bepx(int ), (int)51);
                    continue block51;
                }
                case -1210618413: {
                    v14 = kw$GifAnimation.belk("bevx", bepx(int ), (int)52);
                    continue block51;
                }
                case 1562571713: {
                    break block51;
                }
            }
            break;
        }
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_6 = kw$GifAnimation.cz - kw$GifAnimation.belk("bevy", bepx(int ), (int)53)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == kw$GifAnimation.belk("bevz", belh(int ), (int)145)) break;
            v15 /* !! */  = (long)kw$GifAnimation.belk("bewb", belh(int ), (int)146);
        }
        this.views.clear();
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl25
                v16 /* !! */  = kw$GifAnimation.cz;
                if (true) ** GOTO lbl113
                block53: while (true) {
                    v16 /* !! */  = (long)(v17 - kw$GifAnimation.belk("bewc", bepx(int ), (int)54));
lbl113:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1549171408: {
                            v17 = kw$GifAnimation.belk("bewd", bepx(int ), (int)55);
                            continue block53;
                        }
                        case 497223611: {
                            v17 = kw$GifAnimation.belk("bewe", bepx(int ), (int)56);
                            continue block53;
                        }
                        case 1562571713: {
                            break block53;
                        }
                        case 1968517726: {
                            v17 = kw$GifAnimation.belk("bewf", bepx(int ), (int)57);
                            continue block53;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_7 = kw$GifAnimation.cz - kw$GifAnimation.belk("bewg", bepx(int ), (int)58)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == kw$GifAnimation.belk("bewh", belh(int ), (int)147)) break;
                    v18 /* !! */  = (long)kw$GifAnimation.belk("bewi", belh(int ), (int)148);
                }
                this.textures.clear();
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)kw$GifAnimation.belk("bewj", belh(int ), (int)149);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl142
            }
            case 1: {
                var2_2 /* !! */  = (int)kw$GifAnimation.belk("bewk", belh(int ), (int)150);
                if (!var3_1) break;
                throw null;
            }
lbl142:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)kw$GifAnimation.belk("bewl", belh(int ), (int)151);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 3: {
                var2_2 /* !! */  = (int)kw$GifAnimation.belk("bewm", belh(int ), (int)152);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 4: {
                var2_2 /* !! */  = (int)kw$GifAnimation.belk("bewn", belh(int ), (int)153);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl157:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)kw$GifAnimation.belk("bewo", belh(int ), (int)154);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 6: {
                var2_2 /* !! */  = (int)kw$GifAnimation.belk("bewp", belh(int ), (int)155);
                if (!var3_1) ** GOTO lbl142
                throw null;
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)kw$GifAnimation.belk("bewq", belh(int ), (int)156);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl176
                    break;
                }
            }
lbl172:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)kw$GifAnimation.belk("bews", belh(int ), (int)157);
                if (var3_1) {
                    throw null;
                }
            }
lbl176:
            // 5 sources

            case 9: {
                var2_2 /* !! */  = (int)kw$GifAnimation.belk("bewt", belh(int ), (int)158);
                if (!var3_1) ** GOTO lbl142
                throw null;
            }
lbl180:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)kw$GifAnimation.belk("bewu", belh(int ), (int)159);
                if (!var3_1) ** GOTO lbl172
                throw null;
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)kw$GifAnimation.belk("bewv", belh(int ), (int)160);
        ** while (!var3_1)
lbl187:
        // 1 sources

        throw null;
    }

    private static void bexp() {
        kw$GifAnimation.belj[0] = 1821075790;
        kw$GifAnimation.belj[1] = -1110983437;
        kw$GifAnimation.belj[2] = -392177063;
        kw$GifAnimation.belj[3] = 898682477;
        kw$GifAnimation.belj[4] = 1918622716;
        kw$GifAnimation.belj[5] = 1301244602;
        kw$GifAnimation.belj[6] = -488721636;
        kw$GifAnimation.belj[7] = -1758550179;
        kw$GifAnimation.belj[8] = 1407333265;
        kw$GifAnimation.belj[9] = 1345153882;
        kw$GifAnimation.belj[10] = 1321852591;
        kw$GifAnimation.belj[11] = -1869346621;
        kw$GifAnimation.belj[12] = 1129566004;
        kw$GifAnimation.belj[13] = 1321981155;
        kw$GifAnimation.belj[14] = 411861580;
        kw$GifAnimation.belj[15] = -1728436441;
        kw$GifAnimation.belj[16] = 296928976;
        kw$GifAnimation.belj[17] = -2057042129;
        kw$GifAnimation.belj[18] = 1996035826;
        kw$GifAnimation.belj[19] = 261704883;
        kw$GifAnimation.belj[20] = 1780493798;
        kw$GifAnimation.belj[21] = -2143315934;
        kw$GifAnimation.belj[22] = -1771890089;
        kw$GifAnimation.belj[23] = 1212442905;
        kw$GifAnimation.belj[24] = 1368338335;
        kw$GifAnimation.belj[25] = -1595588558;
        kw$GifAnimation.belj[26] = -1884398820;
        kw$GifAnimation.belj[27] = -749519948;
        kw$GifAnimation.belj[28] = 948262944;
        kw$GifAnimation.belj[29] = -532051159;
        kw$GifAnimation.belj[30] = -1031121854;
        kw$GifAnimation.belj[31] = 604142573;
        kw$GifAnimation.belj[32] = 713400097;
        kw$GifAnimation.belj[33] = 1129533737;
        kw$GifAnimation.belj[34] = 2118339548;
        kw$GifAnimation.belj[35] = -1190943776;
        kw$GifAnimation.belj[36] = 1250494400;
        kw$GifAnimation.belj[37] = 1765817328;
        kw$GifAnimation.belj[38] = -990238458;
        kw$GifAnimation.belj[39] = 980173118;
        kw$GifAnimation.belj[40] = -557782638;
        kw$GifAnimation.belj[41] = -780805027;
        kw$GifAnimation.belj[42] = 749679893;
        kw$GifAnimation.belj[43] = 684650612;
        kw$GifAnimation.belj[44] = 218904315;
        kw$GifAnimation.belj[45] = 605033523;
        kw$GifAnimation.belj[46] = 798702607;
        kw$GifAnimation.belj[47] = -1455004148;
        kw$GifAnimation.belj[48] = 105534655;
        kw$GifAnimation.belj[49] = 642111515;
        kw$GifAnimation.belj[50] = 353747037;
        kw$GifAnimation.belj[51] = 1138567764;
        kw$GifAnimation.belj[52] = 2118866648;
        kw$GifAnimation.belj[53] = -2092766404;
        kw$GifAnimation.belj[54] = -909724023;
        kw$GifAnimation.belj[55] = -395671420;
        kw$GifAnimation.belj[56] = 12506547;
        kw$GifAnimation.belj[57] = 244859104;
        kw$GifAnimation.belj[58] = -442485709;
        kw$GifAnimation.belj[59] = -1204582515;
        kw$GifAnimation.belj[60] = -2007206742;
        kw$GifAnimation.belj[61] = 425032766;
        kw$GifAnimation.belj[62] = 679762180;
        kw$GifAnimation.belj[63] = -1200037189;
        kw$GifAnimation.belj[64] = -502489896;
        kw$GifAnimation.belj[65] = 1671422693;
        kw$GifAnimation.belj[66] = 2112337589;
        kw$GifAnimation.belj[67] = 1483582587;
        kw$GifAnimation.belj[68] = 144617236;
        kw$GifAnimation.belj[69] = 265786717;
        kw$GifAnimation.belj[70] = 641181328;
        kw$GifAnimation.belj[71] = 1171410201;
        kw$GifAnimation.belj[72] = 1820305765;
        kw$GifAnimation.belj[73] = 1807254337;
        kw$GifAnimation.belj[74] = 1941569126;
        kw$GifAnimation.belj[75] = -1529954998;
        kw$GifAnimation.belj[76] = -139686996;
        kw$GifAnimation.belj[77] = 2106441590;
        kw$GifAnimation.belj[78] = -22262020;
        kw$GifAnimation.belj[79] = -588440530;
        kw$GifAnimation.belj[80] = -356157420;
        kw$GifAnimation.belj[81] = 1223665902;
        kw$GifAnimation.belj[82] = -1768759860;
        kw$GifAnimation.belj[83] = -1402474673;
        kw$GifAnimation.belj[84] = 1043835639;
        kw$GifAnimation.belj[85] = -1072258491;
        kw$GifAnimation.belj[86] = -514478235;
        kw$GifAnimation.belj[87] = -1450141860;
        kw$GifAnimation.belj[88] = -129436970;
        kw$GifAnimation.belj[89] = 1008422441;
        kw$GifAnimation.belj[90] = -34943899;
        kw$GifAnimation.belj[91] = -2021990196;
        kw$GifAnimation.belj[92] = 1234905369;
        kw$GifAnimation.belj[93] = 664511932;
        kw$GifAnimation.belj[94] = 2010925036;
        kw$GifAnimation.belj[95] = -1533821175;
        kw$GifAnimation.belj[96] = -1300831877;
        kw$GifAnimation.belj[97] = -782556255;
        kw$GifAnimation.belj[98] = -1549299969;
        kw$GifAnimation.belj[99] = -1338780013;
    }

    public static CallSite belk(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static void bexu() {
        kw$GifAnimation.bepz[0] = -8229890784711789122L;
        kw$GifAnimation.bepz[1] = -7144244798373136513L;
        kw$GifAnimation.bepz[2] = 1734299175395519977L;
        kw$GifAnimation.bepz[3] = -8018027923119742106L;
        kw$GifAnimation.bepz[4] = -8698252437474240775L;
        kw$GifAnimation.bepz[5] = -2005913073728752197L;
        kw$GifAnimation.bepz[6] = -2835778859741190570L;
        kw$GifAnimation.bepz[7] = 2900002344715644128L;
        kw$GifAnimation.bepz[8] = -591061916427308929L;
        kw$GifAnimation.bepz[9] = -7523043666755718285L;
        kw$GifAnimation.bepz[10] = 1181502709977748803L;
        kw$GifAnimation.bepz[11] = -6211129250340949996L;
        kw$GifAnimation.bepz[12] = 6465729850701487478L;
        kw$GifAnimation.bepz[13] = 4552560695268834356L;
        kw$GifAnimation.bepz[14] = -222083889808774710L;
        kw$GifAnimation.bepz[15] = 5076754672488342488L;
        kw$GifAnimation.bepz[16] = 5484017463497165163L;
        kw$GifAnimation.bepz[17] = 1114657758815184549L;
        kw$GifAnimation.bepz[18] = 2820191663515784447L;
        kw$GifAnimation.bepz[19] = 6747292759866698224L;
        kw$GifAnimation.bepz[20] = -3036405034551200058L;
        kw$GifAnimation.bepz[21] = -3983661044335385538L;
        kw$GifAnimation.bepz[22] = 7033226805540771074L;
        kw$GifAnimation.bepz[23] = -107821184500619593L;
        kw$GifAnimation.bepz[24] = 4974451656239737970L;
        kw$GifAnimation.bepz[25] = -3244079489319338586L;
        kw$GifAnimation.bepz[26] = -5087111955594113911L;
        kw$GifAnimation.bepz[27] = 7880615390319716019L;
        kw$GifAnimation.bepz[28] = -1234731993590288664L;
        kw$GifAnimation.bepz[29] = -7676452643611769691L;
        kw$GifAnimation.bepz[30] = -3859307127077259183L;
        kw$GifAnimation.bepz[31] = 5598843552447718932L;
        kw$GifAnimation.bepz[32] = -9130041845558910306L;
        kw$GifAnimation.bepz[33] = 9115395156851262271L;
        kw$GifAnimation.bepz[34] = -6486453202350344340L;
        kw$GifAnimation.bepz[35] = -7339697500980789162L;
        kw$GifAnimation.bepz[36] = -5133836881117712996L;
        kw$GifAnimation.bepz[37] = -5984801724578315836L;
        kw$GifAnimation.bepz[38] = -2683180359145178921L;
        kw$GifAnimation.bepz[39] = 4714035014852976755L;
        kw$GifAnimation.bepz[40] = -2548207355226156398L;
        kw$GifAnimation.bepz[41] = -5528860063194126766L;
        kw$GifAnimation.bepz[42] = 7568454338731971353L;
        kw$GifAnimation.bepz[43] = -2381669373321202938L;
        kw$GifAnimation.bepz[44] = -4855823418978246140L;
        kw$GifAnimation.bepz[45] = 2931154030136851429L;
        kw$GifAnimation.bepz[46] = -4723779289638271612L;
        kw$GifAnimation.bepz[47] = 849190830203879489L;
        kw$GifAnimation.bepz[48] = 2654236201082414556L;
        kw$GifAnimation.bepz[49] = 682032840140384410L;
        kw$GifAnimation.bepz[50] = -1174274517139533448L;
        kw$GifAnimation.bepz[51] = -402945290897113998L;
        kw$GifAnimation.bepz[52] = -7211884129869027140L;
        kw$GifAnimation.bepz[53] = 1531538638740051606L;
        kw$GifAnimation.bepz[54] = 6212730301994813198L;
        kw$GifAnimation.bepz[55] = 2465146623656832006L;
        kw$GifAnimation.bepz[56] = 4138229701924060876L;
        kw$GifAnimation.bepz[57] = 3608790872600049254L;
        kw$GifAnimation.bepz[58] = 3014274136646945437L;
        kw$GifAnimation.bepz[59] = -1272887457627552096L;
        kw$GifAnimation.bepz[60] = -6220586714253837426L;
        kw$GifAnimation.bepz[61] = -8842102812603762065L;
        kw$GifAnimation.bepz[62] = -433034620128714306L;
        kw$GifAnimation.bepz[63] = -8838811435640053300L;
        kw$GifAnimation.bepz[64] = 4261655230465043128L;
        kw$GifAnimation.bepz[65] = -2835601748654775390L;
        kw$GifAnimation.bepz[66] = -7226169343893910042L;
        kw$GifAnimation.bepz[67] = -8928183609570416551L;
        kw$GifAnimation.bepz[68] = -8107099461496366610L;
        kw$GifAnimation.bepz[69] = -8532101869576785884L;
        kw$GifAnimation.bepz[70] = -7819726314959100633L;
    }

    private static long bepx(int n2) {
        return bepy[n2] ^ bepz[n2];
    }
}

