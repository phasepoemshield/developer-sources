/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11909
 *  net.minecraft.class_2561
 *  net.minecraft.class_332
 *  net.minecraft.class_437
 *  org.joml.Matrix4f
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.joml.Matrix4f;
import ruhack.phobia.hj;
import ruhack.phobia.ki;
import ruhack.phobia.kq;
import ruhack.phobia.kv;
import ruhack.phobia.lh;
import ruhack.phobia.md;
import ruhack.phobia.nd;

public final class me
extends class_437 {
    public static final int b;
    private static long[] jvor;
    private static final long OPEN_DURATION_NS = 220000000L;
    private static int[] jvnz;
    private int hoveredSlot;
    public static final long rx = -7749815586007154217L;
    private static int[] jvnx;
    private int pendingUseSlot;
    private long openedAt;
    private final hj helper;
    public static final boolean a;
    private static final float BASE_THICKNESS = 31.0f;
    private static long[] jvoq;
    private final class_437 parent;
    private static final long CLOSE_DURATION_NS = 160000000L;
    private float visualScale;
    private long closingAt;
    public static final boolean c;
    private static final float[] SECTOR_CENTER_ANGLES;
    private static final float SECTOR_DEGREES = 106.0f;
    private boolean closing;
    private static final float BASE_SIZE = 142.0f;

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void startClosing() {
        v0 /* !! */  = me.rx;
        block41: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -381550121: {
                    break block41;
                }
                case 2086217514: {
                    v0 /* !! */  = (long)(me.jvoa("jwbw", jvop(int ), (int)41) - me.jvoa("jwbv", jvop(int ), (int)40));
                    continue block41;
                }
            }
            break;
        }
        var3_1 = me.c;
        while (true) {
            block66: {
                if ((v1 /* !! */  = (cfr_temp_1 = me.rx - me.jvoa("jwby", jvop(int ), (int)42)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  != me.jvoa("jwbz", jvnw(int ), (int)206)) break block66;
                var2_2 /* !! */  = me.b;
                v2 /* !! */  = me.rx;
                if (true) ** GOTO lbl22
            }
            v1 /* !! */  = (long)me.jvoa("jwca", jvnw(int ), (int)207);
        }
        block43: while (true) {
            v2 /* !! */  = (long)(v3 - me.jvoa("jwcc", jvop(int ), (int)43));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -405899837: {
                    v3 = me.jvoa("jwcd", jvop(int ), (int)44);
                    continue block43;
                }
                case -381550121: {
                    break block43;
                }
                case 98350036: {
                    v3 = me.jvoa("jwce", jvop(int ), (int)45);
                    continue block43;
                }
            }
            break;
        }
        var1_3 = me.a;
        if (var3_1) {
            throw null;
        }
        if (var1_3 || var1_3) return;
        v4 /* !! */  = me.rx;
        if (true) ** GOTO lbl39
        block44: while (true) {
            v4 /* !! */  = (long)(v5 - me.jvoa("jwcg", jvop(int ), (int)46));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1306085912: {
                    v5 = me.jvoa("jwci", jvop(int ), (int)47);
                    continue block44;
                }
                case -1169644146: {
                    v5 = me.jvoa("jwck", jvop(int ), (int)48);
                    continue block44;
                }
                case -381550121: {
                    break block44;
                }
                case 891871028: {
                    v5 = me.jvoa("jwcl", jvop(int ), (int)49);
                    continue block44;
                }
            }
            break;
        }
        if (this.closing) {
            if (var1_3) return;
            return;
        }
        if (var1_3 || var1_3) return;
        v6 = me.jvoa("jwcn", jvnw(int ), (int)208);
        v7 /* !! */  = me.rx;
        block45: while (true) {
            switch ((int)v7 /* !! */ ) {
                case -381550121: {
                    break block45;
                }
                case 1042996161: {
                    v7 /* !! */  = (long)(me.jvoa("jwcq", jvop(int ), (int)51) - me.jvoa("jwco", jvop(int ), (int)50));
                    continue block45;
                }
            }
            break;
        }
        this.closing = v6;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block46: while (true) {
            block67: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 || var1_3) return;
                        v8 /* !! */  = me.rx;
                        block47: while (true) {
                            switch ((int)v8 /* !! */ ) {
                                case -381550121: {
                                    break block47;
                                }
                                case 505599969: {
                                    v8 /* !! */  = (long)(me.jvoa("jwct", jvop(int ), (int)53) - me.jvoa("jwcs", jvop(int ), (int)52));
                                    continue block47;
                                }
                            }
                            break;
                        }
                        v9 = System.nanoTime();
                        v10 /* !! */  = me.rx;
                        block48: while (true) {
                            switch ((int)v10 /* !! */ ) {
                                case -1533995971: {
                                    v10 /* !! */  = (long)(me.jvoa("jwcw", jvop(int ), (int)55) - me.jvoa("jwcv", jvop(int ), (int)54));
                                    continue block48;
                                }
                                case -381550121: {
                                    break block48;
                                }
                            }
                            break;
                        }
                        this.closingAt = v9;
                        if (!var1_3 && !var1_3) return;
                        return;
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)me.jvoa("jwcy", jvnw(int ), (int)209);
                        cfr_temp_0 = 2;
                        if (var3_1) {
                            throw null;
                        }
                        break block67;
                    }
                    case 1: {
                        var2_2 /* !! */  = (int)me.jvoa("jwda", jvnw(int ), (int)210);
                        if (!var3_1) ** break;
                        throw null;
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)me.jvoa("jwdb", jvnw(int ), (int)211);
                        cfr_temp_0 = 4;
                        if (var3_1) {
                            throw null;
                        }
                        break block67;
                    }
                    case 6: {
                        var2_2 /* !! */  = (int)me.jvoa("jwdh", jvnw(int ), (int)215);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 4: {
                        ** GOTO lbl130
                    }
                    case 8: {
                        var2_2 /* !! */  = (int)me.jvoa("jwdl", jvnw(int ), (int)217);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)me.jvoa("jwdd", jvnw(int ), (int)212);
                        if (!var3_1) ** break;
                        throw null;
                    }
                    case 10: {
                        do {
                            var2_2 /* !! */  = (int)me.jvoa("jwdo", jvnw(int ), (int)219);
                        } while (!var3_1);
                        throw null;
                    }
                    case 11: {
                        var2_2 /* !! */  = (int)me.jvoa("jwdp", jvnw(int ), (int)220);
                        if (var3_1) {
                            throw null;
                        }
lbl130:
                        // 3 sources

                        var2_2 /* !! */  = (int)me.jvoa("jwde", jvnw(int ), (int)213);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 9: {
                        var2_2 /* !! */  = (int)me.jvoa("jwdm", jvnw(int ), (int)218);
                        cfr_temp_0 = 7;
                        if (var3_1) {
                            throw null;
                        }
                        break block67;
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)me.jvoa("jwdg", jvnw(int ), (int)214);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 7: 
                }
                ** GOTO lbl148
            }
            do {
                if (true) continue block46;
lbl148:
                // 2 sources

                var2_2 /* !! */  = (int)me.jvoa("jwdj", jvnw(int ), (int)216);
                cfr_temp_0 = 5;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float wrappedDegrees(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = me.rx - me.jvoa("jwwy", jvop(int ), (int)115)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == me.jvoa("jwwz", jvnw(int ), (int)445)) break;
            v0 /* !! */  = (long)me.jvoa("jwxb", jvnw(int ), (int)446);
        }
        var5_2 = me.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = me.rx - me.jvoa("jwxc", jvop(int ), (int)116)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == me.jvoa("jwxd", jvnw(int ), (int)447)) break;
            v1 /* !! */  = (long)me.jvoa("jwxe", jvnw(int ), (int)448);
        }
        var4_3 /* !! */  = me.b;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = me.rx - me.jvoa("jwxf", jvop(int ), (int)117)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == me.jvoa("jwxg", jvnw(int ), (int)449)) break;
                    v2 /* !! */  = (long)me.jvoa("jwxh", jvnw(int ), (int)450);
                }
                var3_4 = me.a;
                if (var5_2) {
                    throw null;
lbl27:
                    // 8 sources

                    return (float)me.jvoa("jwxi", jvqu(int ), (int)451);
                }
                if (var3_4 || var3_4) ** GOTO lbl27
                var2_5 = var1_1 % me.jvoa("jwxk", jvqu(int ), (int)452);
                if (var3_4 || var3_4) ** GOTO lbl27
                if (!(var2_5 > me.jvoa("jwxn", jvqu(int ), (int)453))) ** GOTO lbl36
                if (var3_4) ** GOTO lbl27
                var2_5 -= me.jvoa("jwxp", jvqu(int ), (int)454);
                if (var3_4) ** GOTO lbl27
lbl36:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl27
                if (!(var2_5 < me.jvoa("jwxr", jvqu(int ), (int)455))) ** GOTO lbl41
                if (var3_4) ** GOTO lbl27
                var2_5 += me.jvoa("jwxt", jvqu(int ), (int)456);
                if (var3_4) ** GOTO lbl27
lbl41:
                // 2 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return var2_5;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)me.jvoa("jwxw", jvnw(int ), (int)457);
                    if (!var5_2) break block0;
                    throw null;
                }
            }
            case 1: {
                var4_3 /* !! */  = (int)me.jvoa("jwxy", jvnw(int ), (int)458);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl68
            }
lbl54:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)me.jvoa("jwya", jvnw(int ), (int)459);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl64
            }
lbl59:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)me.jvoa("jwyc", jvnw(int ), (int)460);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl97
            }
lbl64:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)me.jvoa("jwyd", jvnw(int ), (int)461);
                if (!var5_2) ** GOTO lbl54
                throw null;
            }
lbl68:
            // 3 sources

            case 5: {
                var4_3 /* !! */  = (int)me.jvoa("jwye", jvnw(int ), (int)462);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl93
            }
lbl73:
            // 3 sources

            case 6: {
                var4_3 /* !! */  = (int)me.jvoa("jwyf", jvnw(int ), (int)463);
                if (!var5_2) break;
                throw null;
            }
            case 7: {
                var4_3 /* !! */  = (int)me.jvoa("jwyh", jvnw(int ), (int)464);
                if (!var5_2) ** GOTO lbl73
                throw null;
            }
            case 8: {
                var4_3 /* !! */  = (int)me.jvoa("jwyj", jvnw(int ), (int)465);
                if (!var5_2) ** GOTO lbl59
                throw null;
            }
            case 9: {
                var4_3 /* !! */  = (int)me.jvoa("jwyl", jvnw(int ), (int)466);
                if (!var5_2) ** GOTO lbl73
                throw null;
            }
            case 10: {
                var4_3 /* !! */  = (int)me.jvoa("jwym", jvnw(int ), (int)467);
                if (!var5_2) ** GOTO lbl68
                throw null;
            }
lbl93:
            // 2 sources

            case 11: {
                var4_3 /* !! */  = (int)me.jvoa("jwyn", jvnw(int ), (int)468);
                if (!var5_2) break;
                throw null;
            }
lbl97:
            // 2 sources

            case 12: {
                do {
                    var4_3 /* !! */  = (int)me.jvoa("jwyo", jvnw(int ), (int)469);
                } while (!var5_2);
                throw null;
            }
            case 13: 
        }
        var4_3 /* !! */  = (int)me.jvoa("jwyp", jvnw(int ), (int)470);
        ** while (!var5_2)
lbl105:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean method_25421() {
        block27: {
            v0 /* !! */  = me.rx;
            if (true) ** GOTO lbl5
            block17: while (true) {
                v0 /* !! */  = (long)(v1 - me.jvoa("jvzt", jvop(int ), (int)19));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1106172030: {
                        v1 = me.jvoa("jvzu", jvop(int ), (int)20);
                        continue block17;
                    }
                    case -381550121: {
                        break block17;
                    }
                    case 1325731406: {
                        v1 = me.jvoa("jvzv", jvop(int ), (int)21);
                        continue block17;
                    }
                }
                break;
            }
            var3_1 = me.c;
            while (true) {
                block28: {
                    if ((v2 /* !! */  = (cfr_temp_1 = me.rx - me.jvoa("jvzw", jvop(int ), (int)22)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  != me.jvoa("jvzy", jvnw(int ), (int)190)) break block28;
                    var2_2 /* !! */  = me.b;
                    v3 /* !! */  = me.rx;
                    if (true) ** GOTO lbl27
                }
                v2 /* !! */  = (long)me.jvoa("jvzz", jvnw(int ), (int)191);
            }
            block19: while (true) {
                v3 /* !! */  = (long)(v4 - me.jvoa("jwaa", jvop(int ), (int)23));
lbl27:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -417430227: {
                        v4 = me.jvoa("jwab", jvop(int ), (int)24);
                        continue block19;
                    }
                    case -381550121: {
                        break block19;
                    }
                    case 263425726: {
                        v4 = me.jvoa("jwac", jvop(int ), (int)25);
                        continue block19;
                    }
                    case 994995684: {
                        v4 = me.jvoa("jwad", jvop(int ), (int)26);
                        continue block19;
                    }
                }
                break;
            }
            var1_3 = me.a;
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block20: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var3_1) {
                            throw null;
                        }
                        if (var1_3 || var1_3) {
                            return (boolean)me.jvoa("jwaj", jvnw(int ), (int)192);
                        }
                        return (boolean)me.jvoa("jwak", jvnw(int ), (int)193);
                    }
                    case 0: {
                        ** break;
                    }
                    case 2: {
                        do {
                            var2_2 /* !! */  = (int)me.jvoa("jwao", jvnw(int ), (int)196);
                        } while (!var3_1);
                        throw null;
                    }
                    case 3: {
                        break block27;
                    }
lbl59:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)me.jvoa("jwam", jvnw(int ), (int)194);
                        cfr_temp_0 = 1;
                        if (!var3_1) continue block20;
                        throw null;
                    }
                    case 1: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)me.jvoa("jwan", jvnw(int ), (int)195);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)me.jvoa("jwap", jvnw(int ), (int)197);
        ** while (!var3_1)
lbl73:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void method_25394(class_332 var1_1, int var2_2, int var3_3, float var4_4) {
        block175: {
            block174: {
                var19_5 = me.c;
                var18_6 /* !! */  = me.b;
                var17_7 = me.a;
                if (var19_5) {
                    throw null;
lbl6:
                    // 45 sources

                    return;
                }
                if (var17_7 || var17_7) ** GOTO lbl6
                this.helper.validateSelections();
                if (var17_7 || var17_7) ** GOTO lbl6
                var5_8 = System.nanoTime();
                if (var17_7 || var17_7) ** GOTO lbl6
                if (!this.closing) break block174;
                if (var17_7 || var17_7) ** GOTO lbl6
                var7_9 = this.clamp01((float)(var5_8 - this.closingAt) / me.jvoa("jvqw", jvqu(int ), (int)30));
                if (var17_7 || var17_7) ** GOTO lbl6
                var8_10 = 1.0f - this.easeInCubic(var7_9);
                if (var17_7 || var17_7) ** GOTO lbl6
                this.visualScale = 1.0f - this.easeInCubic(var7_9) * me.jvoa("jvqy", jvqu(int ), (int)31);
                if (var17_7 || var17_7) ** GOTO lbl6
                if (!(var7_9 >= 1.0f)) break block175;
                if (var17_7 || var17_7) ** GOTO lbl6
                this.finishClosing();
                if (var17_7 || var17_7) ** GOTO lbl6
                return;
            }
            if (var17_7 || var17_7) ** GOTO lbl6
            var7_9 = this.clamp01((float)(var5_8 - this.openedAt) / me.jvoa("jvqz", jvqu(int ), (int)32));
            if (var17_7 || var17_7) ** GOTO lbl6
            var8_10 = this.easeOutCubic(var7_9);
            if (var17_7 || var17_7) ** GOTO lbl6
            this.visualScale = (float)(me.jvoa("jvrb", jvqu(int ), (int)33) + this.easeOutBack(var7_9) * me.jvoa("jvrc", jvqu(int ), (int)34));
            if (var17_7) ** GOTO lbl6
        }
        if (var17_7 || var17_7) ** GOTO lbl6
        var9_11 = (float)ki.getFixedScaledWidth() / 2.0f;
        if (var17_7 || var17_7) ** GOTO lbl6
        var10_12 = (float)ki.getFixedScaledHeight() / 2.0f;
        if (var17_7 || var17_7) ** GOTO lbl6
        var11_13 = me.jvoa("jvre", jvqu(int ), (int)35) * this.visualScale;
        if (var17_7 || var17_7) ** GOTO lbl6
        var12_14 = me.jvoa("jvrf", jvqu(int ), (int)36) * this.visualScale;
        if (var17_7 || var17_7) ** GOTO lbl6
        if (this.closing) {
            v0 /* !! */  = me.jvoa("jvrh", jvnw(int ), (int)37);
            if (var19_5) {
                throw null;
            }
        } else {
            v0 /* !! */  = (CallSite)this.findSector(ki.convertX(var2_2), ki.convertY(var3_3), var9_11, var10_12, (float)var11_13, (float)var12_14);
        }
        this.hoveredSlot = (int)v0 /* !! */ ;
        if (var17_7 || var17_7) ** GOTO lbl6
        var13_15 = nd.getClientColor();
        if (var17_7 || var17_7) ** GOTO lbl6
        var14_16 = new int[3];
        if (var17_7 || var17_7) ** GOTO lbl6
        var15_17 = me.jvoa("jvrj", jvnw(int ), (int)38);
        if (var17_7) ** GOTO lbl6
        block88: while (true) {
            if (var17_7 || var17_7) ** GOTO lbl6
            if (var15_17 >= var14_16.length) ** GOTO lbl89
            if (var17_7) ** GOTO lbl6
            if (var18_6 /* !! */  == 0) ** GOTO lbl-1000
            switch (var18_6 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var17_7) ** GOTO lbl6
                    if (var15_17 != this.hoveredSlot) ** GOTO lbl73
                    if (var17_7 || var17_7) ** GOTO lbl6
                    var14_16[var15_17] = nd.multAlpha(var13_15, var8_10 * me.jvoa("jvrl", jvqu(int ), (int)39));
                    if (var17_7) ** GOTO lbl6
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl84
lbl73:
                    // 1 sources

                    if (var17_7 || var17_7) ** GOTO lbl6
                    if (this.helper.getSelectedPotion((int)var15_17).method_7960()) ** GOTO lbl81
                    if (var17_7 || var17_7) ** GOTO lbl6
                    var14_16[var15_17] = nd.multAlpha(nd.rgba((int)me.jvoa("jvrn", jvnw(int ), (int)40), (int)me.jvoa("jvro", jvnw(int ), (int)41), (int)me.jvoa("jvrp", jvnw(int ), (int)42), (int)me.jvoa("jvrq", jvnw(int ), (int)43)), var8_10);
                    if (var17_7) ** GOTO lbl6
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl84
lbl81:
                    // 1 sources

                    if (var17_7 || var17_7) ** GOTO lbl6
                    var14_16[var15_17] = nd.multAlpha(nd.rgba((int)me.jvoa("jvrs", jvnw(int ), (int)44), (int)me.jvoa("jvrt", jvnw(int ), (int)45), (int)me.jvoa("jvru", jvnw(int ), (int)46), (int)me.jvoa("jvrv", jvnw(int ), (int)47)), var8_10);
                    if (var17_7) ** GOTO lbl6
lbl84:
                    // 3 sources

                    if (var17_7 || var17_7) ** GOTO lbl6
                    ++var15_17;
                    if (var17_7) ** GOTO lbl6
                    if (!var19_5) continue block88;
                    throw null;
                }
lbl89:
                // 1 sources

                if (var17_7 || var17_7) ** GOTO lbl6
                var15_18 = ki.createProjection();
                if (var17_7 || var17_7) ** GOTO lbl6
                ki.addOverrideTask((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$render$0(org.joml.Matrix4f float float float float int[] ), ()V)((Matrix4f)var15_18, (float)var9_11, (float)var11_13, (float)var10_12, (float)var12_14, (int[])var14_16));
                if (var17_7 || var17_7) ** GOTO lbl6
                this.drawCenterText(var1_1, var9_11, var10_12, var8_10, this.visualScale);
                if (var17_7 || var17_7) ** GOTO lbl6
                var16_19 = me.jvoa("jvrz", jvnw(int ), (int)48);
                if (var17_7) ** GOTO lbl6
                do {
                    if (var17_7 || var17_7) ** GOTO lbl6
                    if (var16_19 >= me.jvoa("jvsa", jvnw(int ), (int)49)) ** GOTO lbl108
                    if (var17_7 || var17_7) ** GOTO lbl6
                    this.drawSlotContent(var1_1, (int)var16_19, var9_11, var10_12, (float)var11_13, (float)var12_14, var8_10);
                    if (var17_7 || var17_7) ** GOTO lbl6
                    ++var16_19;
                    if (var17_7) ** GOTO lbl6
                } while (!var19_5);
                throw null;
lbl108:
                // 1 sources

                if (var17_7 || var17_7) ** GOTO lbl6
                this.drawHint(var1_1, var9_11, var10_12, (float)var11_13, var8_10);
                if (!var17_7 && !var17_7) ** break;
                ** continue;
                return;
                case 0: {
                    var18_6 /* !! */  = (int)me.jvoa("jvsd", jvnw(int ), (int)50);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl359
                }
lbl118:
                // 2 sources

                case 1: {
                    var18_6 /* !! */  = (int)me.jvoa("jvsf", jvnw(int ), (int)51);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl453
                }
lbl123:
                // 3 sources

                case 2: {
                    var18_6 /* !! */  = (int)me.jvoa("jvsg", jvnw(int ), (int)52);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl210
                }
lbl128:
                // 2 sources

                case 3: {
                    var18_6 /* !! */  = (int)me.jvoa("jvsi", jvnw(int ), (int)53);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl196
                }
lbl133:
                // 3 sources

                case 4: {
                    var18_6 /* !! */  = (int)me.jvoa("jvsj", jvnw(int ), (int)54);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl315
                }
lbl138:
                // 2 sources

                case 5: {
                    var18_6 /* !! */  = (int)me.jvoa("jvsk", jvnw(int ), (int)55);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl210
                }
lbl143:
                // 2 sources

                case 6: {
                    var18_6 /* !! */  = (int)me.jvoa("jvsm", jvnw(int ), (int)56);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl477
                }
lbl148:
                // 2 sources

                case 7: {
                    var18_6 /* !! */  = (int)me.jvoa("jvsn", jvnw(int ), (int)57);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl415
                }
lbl153:
                // 2 sources

                case 8: {
                    var18_6 /* !! */  = (int)me.jvoa("jvsp", jvnw(int ), (int)58);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl252
                }
lbl158:
                // 3 sources

                case 9: {
                    var18_6 /* !! */  = (int)me.jvoa("jvsq", jvnw(int ), (int)59);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl398
                }
lbl163:
                // 2 sources

                case 10: {
                    var18_6 /* !! */  = (int)me.jvoa("jvsr", jvnw(int ), (int)60);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl196
                }
lbl168:
                // 2 sources

                case 11: {
                    var18_6 /* !! */  = (int)me.jvoa("jvst", jvnw(int ), (int)61);
                    if (!var19_5) ** GOTO lbl163
                    throw null;
                }
lbl172:
                // 2 sources

                case 12: {
                    var18_6 /* !! */  = (int)me.jvoa("jvsu", jvnw(int ), (int)62);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl181
                }
                case 13: {
                    var18_6 /* !! */  = (int)me.jvoa("jvsv", jvnw(int ), (int)63);
                    if (!var19_5) ** GOTO lbl148
                    throw null;
                }
lbl181:
                // 3 sources

                case 14: {
                    var18_6 /* !! */  = (int)me.jvoa("jvsx", jvnw(int ), (int)64);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl284
                }
lbl186:
                // 2 sources

                case 15: {
                    var18_6 /* !! */  = (int)me.jvoa("jvsy", jvnw(int ), (int)65);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl388
                }
lbl191:
                // 3 sources

                case 16: {
                    var18_6 /* !! */  = (int)me.jvoa("jvta", jvnw(int ), (int)66);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl315
                }
lbl196:
                // 3 sources

                case 17: {
                    var18_6 /* !! */  = (int)me.jvoa("jvtb", jvnw(int ), (int)67);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl284
                }
                case 18: {
                    var18_6 /* !! */  = (int)me.jvoa("jvtc", jvnw(int ), (int)68);
                    if (!var19_5) ** GOTO lbl128
                    throw null;
                }
lbl205:
                // 2 sources

                case 19: {
                    var18_6 /* !! */  = (int)me.jvoa("jvte", jvnw(int ), (int)69);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl388
                }
lbl210:
                // 3 sources

                case 20: {
                    var18_6 /* !! */  = (int)me.jvoa("jvtf", jvnw(int ), (int)70);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl424
                }
lbl215:
                // 3 sources

                case 21: {
                    var18_6 /* !! */  = (int)me.jvoa("jvth", jvnw(int ), (int)71);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl428
                }
                case 22: {
                    var18_6 /* !! */  = (int)me.jvoa("jvti", jvnw(int ), (int)72);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl284
                }
                case 23: {
                    var18_6 /* !! */  = (int)me.jvoa("jvtk", jvnw(int ), (int)73);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl261
                }
lbl230:
                // 2 sources

                case 24: {
                    var18_6 /* !! */  = (int)me.jvoa("jvtl", jvnw(int ), (int)74);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl380
                }
                case 25: {
                    var18_6 /* !! */  = (int)me.jvoa("jvtn", jvnw(int ), (int)75);
                    if (!var19_5) ** GOTO lbl133
                    throw null;
                }
                case 26: {
                    var18_6 /* !! */  = (int)me.jvoa("jvto", jvnw(int ), (int)76);
                    if (!var19_5) ** GOTO lbl143
                    throw null;
                }
                case 27: {
                    var18_6 /* !! */  = (int)me.jvoa("jvtp", jvnw(int ), (int)77);
                    if (!var19_5) ** GOTO lbl138
                    throw null;
                }
                case 28: {
                    var18_6 /* !! */  = (int)me.jvoa("jvtr", jvnw(int ), (int)78);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl319
                }
lbl252:
                // 3 sources

                case 29: {
                    var18_6 /* !! */  = (int)me.jvoa("jvts", jvnw(int ), (int)79);
                    if (!var19_5) ** GOTO lbl191
                    throw null;
                }
                case 30: {
                    var18_6 /* !! */  = (int)me.jvoa("jvtu", jvnw(int ), (int)80);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl437
                }
lbl261:
                // 2 sources

                case 31: {
                    var18_6 /* !! */  = (int)me.jvoa("jvtv", jvnw(int ), (int)81);
                    if (!var19_5) ** GOTO lbl168
                    throw null;
                }
lbl265:
                // 3 sources

                case 32: {
                    var18_6 /* !! */  = (int)me.jvoa("jvtx", jvnw(int ), (int)82);
                    if (!var19_5) ** GOTO lbl215
                    throw null;
                }
lbl269:
                // 2 sources

                case 33: {
                    var18_6 /* !! */  = (int)me.jvoa("jvty", jvnw(int ), (int)83);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl359
                }
lbl274:
                // 3 sources

                case 34: {
                    var18_6 /* !! */  = (int)me.jvoa("jvua", jvnw(int ), (int)84);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl449
                }
lbl279:
                // 2 sources

                case 35: {
                    var18_6 /* !! */  = (int)me.jvoa("jvub", jvnw(int ), (int)85);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl481
                }
lbl284:
                // 5 sources

                case 36: {
                    var18_6 /* !! */  = (int)me.jvoa("jvuc", jvnw(int ), (int)86);
                    if (!var19_5) ** GOTO lbl158
                    throw null;
                }
                case 37: {
                    var18_6 /* !! */  = (int)me.jvoa("jvue", jvnw(int ), (int)87);
                    if (!var19_5) ** GOTO lbl274
                    throw null;
                }
                case 38: {
                    var18_6 /* !! */  = (int)me.jvoa("jvuf", jvnw(int ), (int)88);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl441
                }
                case 39: {
                    var18_6 /* !! */  = (int)me.jvoa("jvuh", jvnw(int ), (int)89);
                    if (!var19_5) ** GOTO lbl265
                    throw null;
                }
                case 40: {
                    var18_6 /* !! */  = (int)me.jvoa("jvui", jvnw(int ), (int)90);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl461
                }
                case 41: {
                    var18_6 /* !! */  = (int)me.jvoa("jvuk", jvnw(int ), (int)91);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl465
                }
                case 42: {
                    var18_6 /* !! */  = (int)me.jvoa("jvul", jvnw(int ), (int)92);
                    if (!var19_5) ** GOTO lbl274
                    throw null;
                }
lbl315:
                // 4 sources

                case 43: {
                    var18_6 /* !! */  = (int)me.jvoa("jvun", jvnw(int ), (int)93);
                    if (!var19_5) ** GOTO lbl279
                    throw null;
                }
lbl319:
                // 2 sources

                case 44: {
                    var18_6 /* !! */  = (int)me.jvoa("jvuo", jvnw(int ), (int)94);
                    if (!var19_5) ** GOTO lbl118
                    throw null;
                }
                case 45: {
                    var18_6 /* !! */  = (int)me.jvoa("jvuq", jvnw(int ), (int)95);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl453
                }
                case 46: {
                    var18_6 /* !! */  = (int)me.jvoa("jvus", jvnw(int ), (int)96);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl461
                }
                case 47: {
                    var18_6 /* !! */  = (int)me.jvoa("jvut", jvnw(int ), (int)97);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl411
                }
                case 48: {
                    var18_6 /* !! */  = (int)me.jvoa("jvuv", jvnw(int ), (int)98);
                    if (!var19_5) ** GOTO lbl205
                    throw null;
                }
lbl342:
                // 2 sources

                case 49: {
                    var18_6 /* !! */  = (int)me.jvoa("jvuw", jvnw(int ), (int)99);
                    if (!var19_5) ** GOTO lbl265
                    throw null;
                }
lbl346:
                // 2 sources

                case 50: {
                    var18_6 /* !! */  = (int)me.jvoa("jvuy", jvnw(int ), (int)100);
                    if (!var19_5) ** GOTO lbl181
                    throw null;
                }
                case 51: {
                    var18_6 /* !! */  = (int)me.jvoa("jvuz", jvnw(int ), (int)101);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl453
                }
lbl355:
                // 2 sources

                case 52: {
                    var18_6 /* !! */  = (int)me.jvoa("jvvb", jvnw(int ), (int)102);
                    if (!var19_5) ** GOTO lbl215
                    throw null;
                }
lbl359:
                // 4 sources

                case 53: {
                    var18_6 /* !! */  = (int)me.jvoa("jvvc", jvnw(int ), (int)103);
                    if (!var19_5) ** GOTO lbl133
                    throw null;
                }
                case 54: {
                    var18_6 /* !! */  = (int)me.jvoa("jvve", jvnw(int ), (int)104);
                    if (!var19_5) ** GOTO lbl123
                    throw null;
                }
lbl367:
                // 2 sources

                case 55: {
                    var18_6 /* !! */  = (int)me.jvoa("jvvf", jvnw(int ), (int)105);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl432
                }
                case 56: {
                    var18_6 /* !! */  = (int)me.jvoa("jvvh", jvnw(int ), (int)106);
                    if (!var19_5) ** GOTO lbl158
                    throw null;
                }
lbl376:
                // 2 sources

                case 57: {
                    var18_6 /* !! */  = (int)me.jvoa("jvvi", jvnw(int ), (int)107);
                    if (!var19_5) ** GOTO lbl269
                    throw null;
                }
lbl380:
                // 2 sources

                case 58: {
                    var18_6 /* !! */  = (int)me.jvoa("jvvk", jvnw(int ), (int)108);
                    if (!var19_5) ** GOTO lbl315
                    throw null;
                }
lbl384:
                // 2 sources

                case 59: {
                    var18_6 /* !! */  = (int)me.jvoa("jvvl", jvnw(int ), (int)109);
                    if (!var19_5) ** GOTO lbl153
                    throw null;
                }
lbl388:
                // 4 sources

                case 60: {
                    var18_6 /* !! */  = (int)me.jvoa("jvvn", jvnw(int ), (int)110);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl398
                }
                case 61: {
                    var18_6 /* !! */  = (int)me.jvoa("jvvo", jvnw(int ), (int)111);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl441
                }
lbl398:
                // 3 sources

                case 62: {
                    var18_6 /* !! */  = (int)me.jvoa("jvvq", jvnw(int ), (int)112);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl445
                }
                case 63: {
                    var18_6 /* !! */  = (int)me.jvoa("jvvr", jvnw(int ), (int)113);
                    if (!var19_5) ** GOTO lbl355
                    throw null;
                }
lbl407:
                // 2 sources

                case 64: {
                    var18_6 /* !! */  = (int)me.jvoa("jvvt", jvnw(int ), (int)114);
                    if (!var19_5) ** GOTO lbl346
                    throw null;
                }
lbl411:
                // 2 sources

                case 65: {
                    var18_6 /* !! */  = (int)me.jvoa("jvvu", jvnw(int ), (int)115);
                    if (!var19_5) ** GOTO lbl172
                    throw null;
                }
lbl415:
                // 3 sources

                case 66: {
                    var18_6 /* !! */  = (int)me.jvoa("jvvw", jvnw(int ), (int)116);
                    if (!var19_5) ** GOTO lbl376
                    throw null;
                }
                case 67: {
                    var18_6 /* !! */  = (int)me.jvoa("jvvx", jvnw(int ), (int)117);
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl457
                }
lbl424:
                // 2 sources

                case 68: {
                    var18_6 /* !! */  = (int)me.jvoa("jvvz", jvnw(int ), (int)118);
                    if (!var19_5) ** GOTO lbl415
                    throw null;
                }
lbl428:
                // 2 sources

                case 69: {
                    var18_6 /* !! */  = (int)me.jvoa("jvwb", jvnw(int ), (int)119);
                    if (!var19_5) ** GOTO lbl123
                    throw null;
                }
lbl432:
                // 3 sources

                case 70: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var18_6 /* !! */  = (int)me.jvoa("jvwc", jvnw(int ), (int)120);
                        if (!var19_5) ** GOTO lbl384
                        throw null;
                    }
                }
lbl437:
                // 2 sources

                case 71: {
                    var18_6 /* !! */  = (int)me.jvoa("jvwe", jvnw(int ), (int)121);
                    if (!var19_5) ** GOTO lbl191
                    throw null;
                }
lbl441:
                // 4 sources

                case 72: {
                    var18_6 /* !! */  = (int)me.jvoa("jvwf", jvnw(int ), (int)122);
                    if (!var19_5) ** GOTO lbl388
                    throw null;
                }
lbl445:
                // 2 sources

                case 73: {
                    var18_6 /* !! */  = (int)me.jvoa("jvwh", jvnw(int ), (int)123);
                    if (!var19_5) ** GOTO lbl342
                    throw null;
                }
lbl449:
                // 3 sources

                case 74: {
                    var18_6 /* !! */  = (int)me.jvoa("jvwk", jvnw(int ), (int)124);
                    if (!var19_5) ** GOTO lbl359
                    throw null;
                }
lbl453:
                // 4 sources

                case 75: {
                    var18_6 /* !! */  = (int)me.jvoa("jvwl", jvnw(int ), (int)125);
                    if (!var19_5) ** GOTO lbl367
                    throw null;
                }
lbl457:
                // 2 sources

                case 76: {
                    var18_6 /* !! */  = (int)me.jvoa("jvwn", jvnw(int ), (int)126);
                    if (!var19_5) ** GOTO lbl186
                    throw null;
                }
lbl461:
                // 3 sources

                case 77: {
                    var18_6 /* !! */  = (int)me.jvoa("jvwp", jvnw(int ), (int)127);
                    if (!var19_5) ** GOTO lbl284
                    throw null;
                }
lbl465:
                // 2 sources

                case 78: {
                    var18_6 /* !! */  = (int)me.jvoa("jvwq", jvnw(int ), (int)128);
                    if (!var19_5) ** GOTO lbl230
                    throw null;
                }
                case 79: {
                    var18_6 /* !! */  = (int)me.jvoa("jvws", jvnw(int ), (int)129);
                    if (!var19_5) ** GOTO lbl441
                    throw null;
                }
                case 80: {
                    var18_6 /* !! */  = (int)me.jvoa("jvwt", jvnw(int ), (int)130);
                    if (!var19_5) ** GOTO lbl432
                    throw null;
                }
lbl477:
                // 2 sources

                case 81: {
                    var18_6 /* !! */  = (int)me.jvoa("jvwv", jvnw(int ), (int)131);
                    if (!var19_5) ** GOTO lbl407
                    throw null;
                }
lbl481:
                // 2 sources

                case 82: {
                    var18_6 /* !! */  = (int)me.jvoa("jvwx", jvnw(int ), (int)132);
                    if (!var19_5) ** GOTO lbl449
                    throw null;
                }
                case 83: {
                    var18_6 /* !! */  = (int)me.jvoa("jvwy", jvnw(int ), (int)133);
                    if (!var19_5) ** GOTO lbl252
                    throw null;
                }
                case 84: 
            }
            break;
        }
        var18_6 /* !! */  = (int)me.jvoa("jvxa", jvnw(int ), (int)134);
        ** while (!var19_5)
lbl492:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float easeOutBack(float var1_1) {
        v0 /* !! */  = me.rx;
        if (true) ** GOTO lbl5
        block33: while (true) {
            v0 /* !! */  = (long)(me.jvoa("jxfx", jvop(int ), (int)161) - me.jvoa("jxfw", jvop(int ), (int)160));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -381550121: {
                    break block33;
                }
                case 61127491: {
                    continue block33;
                }
            }
            break;
        }
        var8_2 = me.c;
        v1 /* !! */  = me.rx;
        if (true) ** GOTO lbl15
        block34: while (true) {
            v1 /* !! */  = (long)(v2 - me.jvoa("jxfy", jvop(int ), (int)162));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -681577602: {
                    v2 = me.jvoa("jxga", jvop(int ), (int)163);
                    continue block34;
                }
                case -381550121: {
                    break block34;
                }
                case 126883431: {
                    v2 = me.jvoa("jxgc", jvop(int ), (int)164);
                    continue block34;
                }
                case 1417874586: {
                    v2 = me.jvoa("jxgd", jvop(int ), (int)165);
                    continue block34;
                }
            }
            break;
        }
        var7_3 /* !! */  = me.b;
        v3 /* !! */  = me.rx;
        if (true) ** GOTO lbl32
        block35: while (true) {
            v3 /* !! */  = (long)(me.jvoa("jxgh", jvop(int ), (int)167) - me.jvoa("jxgf", jvop(int ), (int)166));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -381550121: {
                    break block35;
                }
                case 230021796: {
                    continue block35;
                }
            }
            break;
        }
        var6_4 = me.a;
        if (var8_2) {
            throw null;
lbl40:
            // 6 sources

            return (float)me.jvoa("jxgj", jvqu(int ), (int)522);
        }
        if (var6_4) ** GOTO lbl40
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4) ** GOTO lbl40
                v4 /* !! */  = me.rx;
                if (true) ** GOTO lbl51
                block37: while (true) {
                    v4 /* !! */  = (long)(v5 - me.jvoa("jxgl", jvop(int ), (int)168));
lbl51:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -381550121: {
                            break block37;
                        }
                        case 8048641: {
                            v5 = me.jvoa("jxgn", jvop(int ), (int)169);
                            continue block37;
                        }
                        case 1338669589: {
                            v5 = me.jvoa("jxgp", jvop(int ), (int)170);
                            continue block37;
                        }
                    }
                    break;
                }
                var2_5 = this.clamp01(var1_1);
                if (var6_4 || var6_4) ** GOTO lbl40
                var3_6 = me.jvoa("jxgr", jvqu(int ), (int)523);
                if (var6_4 || var6_4) ** GOTO lbl40
                var4_7 = var3_6 + 1.0f;
                if (var6_4 || var6_4) ** GOTO lbl40
                var5_8 = var2_5 - 1.0f;
                if (!var6_4 && !var6_4) ** break;
                ** continue;
                return 1.0f + var4_7 * var5_8 * var5_8 * var5_8 + var3_6 * var5_8 * var5_8;
            }
lbl70:
            // 2 sources

            case 0: {
                var7_3 /* !! */  = (int)me.jvoa("jxgv", jvnw(int ), (int)524);
                if (!var8_2) break;
                throw null;
            }
lbl74:
            // 2 sources

            case 1: {
                do {
                    var7_3 /* !! */  = (int)me.jvoa("jxgx", jvnw(int ), (int)525);
                } while (!var8_2);
                throw null;
            }
            case 2: {
                var7_3 /* !! */  = (int)me.jvoa("jxgz", jvnw(int ), (int)526);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl84:
            // 3 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)me.jvoa("jxhb", jvnw(int ), (int)527);
                    if (!var8_2) ** GOTO lbl70
                    throw null;
                }
            }
lbl89:
            // 2 sources

            case 4: {
                var7_3 /* !! */  = (int)me.jvoa("jxhd", jvnw(int ), (int)528);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl98
            }
            case 5: {
                var7_3 /* !! */  = (int)me.jvoa("jxhe", jvnw(int ), (int)529);
                if (!var8_2) break;
                throw null;
            }
lbl98:
            // 2 sources

            case 6: {
                var7_3 /* !! */  = (int)me.jvoa("jxhg", jvnw(int ), (int)530);
                if (!var8_2) ** GOTO lbl89
                throw null;
            }
            case 7: {
                var7_3 /* !! */  = (int)me.jvoa("jxhi", jvnw(int ), (int)531);
                if (!var8_2) ** GOTO lbl84
                throw null;
            }
            case 8: {
                var7_3 /* !! */  = (int)me.jvoa("jxhk", jvnw(int ), (int)532);
                if (!var8_2) ** GOTO lbl84
                throw null;
            }
            case 9: {
                var7_3 /* !! */  = (int)me.jvoa("jxhm", jvnw(int ), (int)533);
                if (!var8_2) ** GOTO lbl74
                throw null;
            }
lbl114:
            // 2 sources

            case 10: {
                var7_3 /* !! */  = (int)me.jvoa("jxho", jvnw(int ), (int)534);
                if (!var8_2) break;
                throw null;
            }
            case 11: 
        }
        var7_3 /* !! */  = (int)me.jvoa("jxhp", jvnw(int ), (int)535);
        ** while (!var8_2)
lbl121:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public me(hj var1_1, class_437 var2_2) {
        var4_3 /* !! */  = me.b;
        super((class_2561)class_2561.method_43470((String)"BuffHelper"));
        this.hoveredSlot = (int)me.jvoa("jvob", jvnw(int ), (int)0);
        this.pendingUseSlot = (int)me.jvoa("jvoc", jvnw(int ), (int)1);
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block10: while (true) {
            block13: {
                switch (cfr_temp_0 == -2147483648 ? var4_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        this.visualScale = 1.0f;
                        this.helper = var1_1;
                        this.parent = var2_2;
                        return;
                    }
                    case 5: {
                        while (true) {
                            var4_3 /* !! */  = (int)me.jvoa("jvok", jvnw(int ), (int)7);
                        }
                    }
                    case 7: {
                        var4_3 /* !! */  = (int)me.jvoa("jvom", jvnw(int ), (int)9);
                        ** GOTO lbl-1000
                    }
                    case 0: {
                        var4_3 /* !! */  = (int)me.jvoa("jvoe", jvnw(int ), (int)2);
                    }
                    case 6: {
                        var4_3 /* !! */  = (int)me.jvoa("jvol", jvnw(int ), (int)8);
                    }
                    case 3: lbl-1000:
                    // 2 sources

                    {
                        var4_3 /* !! */  = (int)me.jvoa("jvoh", jvnw(int ), (int)5);
                    }
                    case 4: {
                        var4_3 /* !! */  = (int)me.jvoa("jvoj", jvnw(int ), (int)6);
                        cfr_temp_0 = 0;
                        break block13;
                    }
                    case 1: {
                        var4_3 /* !! */  = (int)me.jvoa("jvof", jvnw(int ), (int)3);
                    }
                    case 2: 
                }
                ** GOTO lbl38
            }
            while (true) {
                if (true) continue block10;
lbl38:
                // 2 sources

                var4_3 /* !! */  = (int)me.jvoa("jvog", jvnw(int ), (int)4);
                cfr_temp_0 = 1;
            }
            break;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void method_25419() {
        boolean bl2;
        Object object = rx;
        boolean bl3 = true;
        block18: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - me.jvoa("jwaq", jvop(int ), (int)27);
            }
            switch ((int)object) {
                case -717761206: {
                    callSite = me.jvoa("jwar", jvop(int ), (int)28);
                    continue block18;
                }
                case -381550121: {
                    break block18;
                }
                case -40671388: {
                    callSite = me.jvoa("jwas", jvop(int ), (int)29);
                    continue block18;
                }
                case 176934585: {
                    callSite = me.jvoa("jwat", jvop(int ), (int)30);
                    continue block18;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = rx;
        boolean bl5 = true;
        block19: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite - me.jvoa("jwau", jvop(int ), (int)31);
            }
            switch ((int)object2) {
                case -1394228314: {
                    callSite = me.jvoa("jwav", jvop(int ), (int)32);
                    continue block19;
                }
                case -381550121: {
                    break block19;
                }
                case 1547149648: {
                    callSite = me.jvoa("jwaw", jvop(int ), (int)33);
                    continue block19;
                }
                case 2074676977: {
                    callSite = me.jvoa("jwax", jvop(int ), (int)34);
                    continue block19;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = rx - me.jvoa("jway", jvop(int ), (int)35)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == me.jvoa("jwaz", jvnw(int ), (int)198)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = me.jvoa("jwba", jvnw(int ), (int)199);
        }
        if (bl2 || bl2) return;
        Object object4 = rx;
        boolean bl6 = true;
        block21: while (true) {
            CallSite callSite;
            if (!bl6 || (bl6 = false) || !true) {
                object4 = callSite - me.jvoa("jwbc", jvop(int ), (int)36);
            }
            switch ((int)object4) {
                case -1905482533: {
                    callSite = me.jvoa("jwbd", jvop(int ), (int)37);
                    continue block21;
                }
                case -1018921812: {
                    callSite = me.jvoa("jwbf", jvop(int ), (int)38);
                    continue block21;
                }
                case -698555843: {
                    callSite = me.jvoa("jwbg", jvop(int ), (int)39);
                    continue block21;
                }
                case -381550121: {
                    break block21;
                }
            }
            break;
        }
        this.startClosing();
        if (!bl2 && !bl2) return;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void finishClosing() {
        block88: {
            v0 /* !! */  = me.rx;
            if (true) ** GOTO lbl5
            block56: while (true) {
                v0 /* !! */  = (long)(me.jvoa("jwdv", jvop(int ), (int)57) - me.jvoa("jwdu", jvop(int ), (int)56));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -381550121: {
                        break block56;
                    }
                    case -314815909: {
                        continue block56;
                    }
                }
                break;
            }
            var4_1 = me.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_0 = me.rx - me.jvoa("jwdx", jvop(int ), (int)58)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == me.jvoa("jwdy", jvnw(int ), (int)221)) break;
                v1 /* !! */  = (long)me.jvoa("jwdz", jvnw(int ), (int)222);
            }
            var3_2 /* !! */  = me.b;
            v2 /* !! */  = me.rx;
            if (true) ** GOTO lbl21
            block58: while (true) {
                v2 /* !! */  = (long)(v3 - me.jvoa("jweb", jvop(int ), (int)59));
lbl21:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1615883477: {
                        v3 = me.jvoa("jwec", jvop(int ), (int)60);
                        continue block58;
                    }
                    case -928172452: {
                        v3 = me.jvoa("jwed", jvop(int ), (int)61);
                        continue block58;
                    }
                    case -381550121: {
                        break block58;
                    }
                    case -51596161: {
                        v3 = me.jvoa("jwee", jvop(int ), (int)62);
                        continue block58;
                    }
                }
                break;
            }
            var2_3 = me.a;
            if (var4_1) {
                throw null;
lbl36:
                // 11 sources

                return;
            }
            if (var2_3 || var2_3) ** GOTO lbl36
            v4 /* !! */  = me.rx;
            if (true) ** GOTO lbl43
            block60: while (true) {
                v4 /* !! */  = (long)(me.jvoa("jwei", jvop(int ), (int)64) - me.jvoa("jweg", jvop(int ), (int)63));
lbl43:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -381550121: {
                        break block60;
                    }
                    case 1054558127: {
                        continue block60;
                    }
                }
                break;
            }
            if (this.field_22787 != null) break block88;
            if (var2_3) ** GOTO lbl36
            return;
        }
        if (var2_3) ** GOTO lbl36
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl36
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = me.rx - me.jvoa("jwek", jvop(int ), (int)65)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == me.jvoa("jwel", jvnw(int ), (int)223)) break;
                    v5 /* !! */  = (long)me.jvoa("jwem", jvnw(int ), (int)224);
                }
                var1_4 = this.pendingUseSlot;
                if (var2_3 || var2_3) ** GOTO lbl36
                v6 = me.jvoa("jweo", jvnw(int ), (int)225);
                v7 /* !! */  = me.rx;
                if (true) ** GOTO lbl69
                block62: while (true) {
                    v7 /* !! */  = (long)(v8 - me.jvoa("jwep", jvop(int ), (int)66));
lbl69:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -472965321: {
                            v8 = me.jvoa("jwer", jvop(int ), (int)67);
                            continue block62;
                        }
                        case -381550121: {
                            break block62;
                        }
                        case 594515333: {
                            v8 = me.jvoa("jwes", jvop(int ), (int)68);
                            continue block62;
                        }
                        case 1083728402: {
                            v8 = me.jvoa("jweu", jvop(int ), (int)69);
                            continue block62;
                        }
                    }
                    break;
                }
                this.pendingUseSlot = (int)v6;
                if (var2_3 || var2_3) ** GOTO lbl36
                if (var1_4 < 0) ** GOTO lbl117
                if (var2_3 || var2_3) ** GOTO lbl36
                v9 /* !! */  = me.rx;
                if (true) ** GOTO lbl89
                block63: while (true) {
                    v9 /* !! */  = (long)(v10 - me.jvoa("jwew", jvop(int ), (int)70));
lbl89:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -627805501: {
                            v10 = me.jvoa("jwex", jvop(int ), (int)71);
                            continue block63;
                        }
                        case -381550121: {
                            break block63;
                        }
                        case 1067687107: {
                            v10 = me.jvoa("jwey", jvop(int ), (int)72);
                            continue block63;
                        }
                    }
                    break;
                }
                v11 /* !! */  = me.rx;
                if (true) ** GOTO lbl102
                block64: while (true) {
                    v11 /* !! */  = (long)(v12 - me.jvoa("jwez", jvop(int ), (int)73));
lbl102:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -381550121: {
                            break block64;
                        }
                        case 1571870167: {
                            v12 = me.jvoa("jwfb", jvop(int ), (int)74);
                            continue block64;
                        }
                        case 2115447020: {
                            v12 = me.jvoa("jwfc", jvop(int ), (int)75);
                            continue block64;
                        }
                    }
                    break;
                }
                this.helper.usePotion(var1_4);
                if (var2_3) ** GOTO lbl36
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl139
lbl117:
                // 1 sources

                if (var2_3 || var2_3) ** GOTO lbl36
                v13 /* !! */  = me.rx;
                if (true) ** GOTO lbl122
                block65: while (true) {
                    v13 /* !! */  = (long)(me.jvoa("jwfg", jvop(int ), (int)77) - me.jvoa("jwff", jvop(int ), (int)76));
lbl122:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -381550121: {
                            break block65;
                        }
                        case 1196686255: {
                            continue block65;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_2 = me.rx - me.jvoa("jwfi", jvop(int ), (int)78)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == me.jvoa("jwfk", jvnw(int ), (int)226)) break;
                    v14 /* !! */  = (long)me.jvoa("jwfl", jvnw(int ), (int)227);
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_3 = me.rx - me.jvoa("jwfm", jvop(int ), (int)79)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == me.jvoa("jwfn", jvnw(int ), (int)228)) break;
                    v15 /* !! */  = (long)me.jvoa("jwfo", jvnw(int ), (int)229);
                }
                this.field_22787.method_1507(this.parent);
                if (var2_3) ** GOTO lbl36
lbl139:
                // 2 sources

                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)me.jvoa("jwfq", jvnw(int ), (int)230);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl187
            }
            case 1: {
                var3_2 /* !! */  = (int)me.jvoa("jwfs", jvnw(int ), (int)231);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl223
            }
            case 2: {
                var3_2 /* !! */  = (int)me.jvoa("jwft", jvnw(int ), (int)232);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl157:
            // 4 sources

            case 3: {
                var3_2 /* !! */  = (int)me.jvoa("jwfv", jvnw(int ), (int)233);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl177
            }
            case 4: {
                var3_2 /* !! */  = (int)me.jvoa("jwfw", jvnw(int ), (int)234);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl167:
            // 2 sources

            case 5: {
                var3_2 /* !! */  = (int)me.jvoa("jwfy", jvnw(int ), (int)235);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl205
            }
            case 6: {
                var3_2 /* !! */  = (int)me.jvoa("jwfz", jvnw(int ), (int)236);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl177:
            // 3 sources

            case 7: {
                var3_2 /* !! */  = (int)me.jvoa("jwgb", jvnw(int ), (int)237);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)me.jvoa("jwgd", jvnw(int ), (int)238);
                    if (!var4_1) ** GOTO lbl157
                    throw null;
                }
            }
lbl187:
            // 4 sources

            case 9: {
                var3_2 /* !! */  = (int)me.jvoa("jwge", jvnw(int ), (int)239);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl196
            }
            case 10: {
                var3_2 /* !! */  = (int)me.jvoa("jwgg", jvnw(int ), (int)240);
                if (!var4_1) ** GOTO lbl177
                throw null;
            }
lbl196:
            // 2 sources

            case 11: {
                var3_2 /* !! */  = (int)me.jvoa("jwgh", jvnw(int ), (int)241);
                if (!var4_1) ** GOTO lbl157
                throw null;
            }
            case 12: {
                do {
                    var3_2 /* !! */  = (int)me.jvoa("jwgj", jvnw(int ), (int)242);
                } while (!var4_1);
                throw null;
            }
lbl205:
            // 2 sources

            case 13: {
                var3_2 /* !! */  = (int)me.jvoa("jwgk", jvnw(int ), (int)243);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl210:
            // 3 sources

            case 14: {
                var3_2 /* !! */  = (int)me.jvoa("jwgm", jvnw(int ), (int)244);
                if (!var4_1) ** GOTO lbl187
                throw null;
            }
            case 15: {
                var3_2 /* !! */  = (int)me.jvoa("jwgn", jvnw(int ), (int)245);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl219:
            // 3 sources

            case 16: {
                var3_2 /* !! */  = (int)me.jvoa("jwgp", jvnw(int ), (int)246);
                if (!var4_1) ** GOTO lbl157
                throw null;
            }
lbl223:
            // 3 sources

            case 17: {
                var3_2 /* !! */  = (int)me.jvoa("jwgr", jvnw(int ), (int)247);
                if (!var4_1) ** GOTO lbl167
                throw null;
            }
lbl227:
            // 2 sources

            case 18: {
                var3_2 /* !! */  = (int)me.jvoa("jwgs", jvnw(int ), (int)248);
                if (!var4_1) ** GOTO lbl210
                throw null;
            }
            case 19: 
        }
        var3_2 /* !! */  = (int)me.jvoa("jwgu", jvnw(int ), (int)249);
        ** while (!var4_1)
lbl234:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jxma() {
        me.jvoq[100] = -2778560623030792845L;
        me.jvoq[101] = -4255142749489995864L;
        me.jvoq[102] = 4789716384607181697L;
        me.jvoq[103] = 3308146583989298307L;
        me.jvoq[104] = 2483028712821596768L;
        me.jvoq[105] = -3026027066806005811L;
        me.jvoq[106] = 5660957769614070701L;
        me.jvoq[107] = 2967160279214745393L;
        me.jvoq[108] = -1003808506810003186L;
        me.jvoq[109] = -5676075090539994012L;
        me.jvoq[110] = 3312345406544557180L;
        me.jvoq[111] = -4255315667450178819L;
        me.jvoq[112] = 8562013959418223930L;
        me.jvoq[113] = 5660547677969849742L;
        me.jvoq[114] = -8900191610631852194L;
        me.jvoq[115] = 5771922795682655557L;
        me.jvoq[116] = 2706360194836298816L;
        me.jvoq[117] = -2393771323350656869L;
        me.jvoq[118] = -1001467391588019148L;
        me.jvoq[119] = 7893326729290544282L;
        me.jvoq[120] = -5260416156173058858L;
        me.jvoq[121] = -3227749896711271998L;
        me.jvoq[122] = -962748794308160758L;
        me.jvoq[123] = -8280271240844514964L;
        me.jvoq[124] = -6943683110498624250L;
        me.jvoq[125] = -3904085258283551304L;
        me.jvoq[126] = 476410660233074981L;
        me.jvoq[127] = 7983399835994395904L;
        me.jvoq[128] = -2348366304270077215L;
        me.jvoq[129] = 4046959722606333254L;
        me.jvoq[130] = 7912476245806150700L;
        me.jvoq[131] = 1216343636385123886L;
        me.jvoq[132] = 37964065269155824L;
        me.jvoq[133] = 326904527164972726L;
        me.jvoq[134] = -578839006621543305L;
        me.jvoq[135] = -3400939083159469446L;
        me.jvoq[136] = 8030167320647845708L;
        me.jvoq[137] = 250247541165946820L;
        me.jvoq[138] = -7963277835032350927L;
        me.jvoq[139] = 7191943777578059093L;
        me.jvoq[140] = -8679695965702232826L;
        me.jvoq[141] = -2466330487247564238L;
        me.jvoq[142] = 9205322457974561614L;
        me.jvoq[143] = -2124624194030394467L;
        me.jvoq[144] = -4720550495908835821L;
        me.jvoq[145] = -4533134458050669678L;
        me.jvoq[146] = -5585541759419676478L;
        me.jvoq[147] = -4975103254157796833L;
        me.jvoq[148] = -6740084397373217319L;
        me.jvoq[149] = -1685555880664019550L;
        me.jvoq[150] = 5286151481777243110L;
        me.jvoq[151] = 174370582778921900L;
        me.jvoq[152] = -1690992893700533021L;
        me.jvoq[153] = 4544665055846350732L;
        me.jvoq[154] = 4100996028337105290L;
        me.jvoq[155] = 7321580234170135819L;
        me.jvoq[156] = -4288393027107932280L;
        me.jvoq[157] = 2721117544983253130L;
        me.jvoq[158] = 8529313922251397997L;
        me.jvoq[159] = -5223526417643556036L;
        me.jvoq[160] = -442057133969791043L;
        me.jvoq[161] = -9009290705827708374L;
        me.jvoq[162] = -5646785669272436375L;
        me.jvoq[163] = -2050195474296693241L;
        me.jvoq[164] = -2832963508666907509L;
        me.jvoq[165] = 3200349466553166597L;
        me.jvoq[166] = 1047443810691157394L;
        me.jvoq[167] = 6184859126390128301L;
        me.jvoq[168] = 307789896870472918L;
        me.jvoq[169] = -4082252538436591601L;
        me.jvoq[170] = 7352688531550095800L;
        me.jvoq[171] = 4015859445560550905L;
        me.jvoq[172] = -6632753107832836846L;
        me.jvoq[173] = 8681408708889806971L;
        me.jvoq[174] = 6911037521611068169L;
        me.jvoq[175] = -1700123177064725203L;
        me.jvoq[176] = -683466105442284256L;
        me.jvoq[177] = -1955606852878904284L;
        me.jvoq[178] = -5428948350120990970L;
        me.jvoq[179] = 6164246748216313813L;
        me.jvoq[180] = -7648955009739532578L;
        me.jvoq[181] = 6653088931526671297L;
    }

    private static /* synthetic */ void jxmp() {
        me.jvor[100] = -5843639243208818340L;
        me.jvor[101] = -8969997660735616515L;
        me.jvor[102] = -1316645311642332257L;
        me.jvor[103] = 5190388792160377349L;
        me.jvor[104] = -7229534620773433167L;
        me.jvor[105] = 2958104074884941024L;
        me.jvor[106] = 5779531442110849910L;
        me.jvor[107] = -3115500715046278135L;
        me.jvor[108] = -2419022523333277159L;
        me.jvor[109] = -7558282844383354279L;
        me.jvor[110] = -3634950804733420295L;
        me.jvor[111] = -6589735945797298784L;
        me.jvor[112] = 6532927152199253910L;
        me.jvor[113] = 1041971159987999315L;
        me.jvor[114] = 2269416647462170231L;
        me.jvor[115] = -7405676237281897497L;
        me.jvor[116] = -5436265108129896040L;
        me.jvor[117] = 152203775357903438L;
        me.jvor[118] = -5750674744008852322L;
        me.jvor[119] = 8644242913668152588L;
        me.jvor[120] = 8943634832913986724L;
        me.jvor[121] = -8923617679782504825L;
        me.jvor[122] = -4420487865859504231L;
        me.jvor[123] = 2222377046641100147L;
        me.jvor[124] = -6459103309881177459L;
        me.jvor[125] = 1688967323236474652L;
        me.jvor[126] = -102552261101813211L;
        me.jvor[127] = 2365478560378278519L;
        me.jvor[128] = -7806140289840936225L;
        me.jvor[129] = -8223035751509582813L;
        me.jvor[130] = 451783997286168797L;
        me.jvor[131] = 2396755437999086023L;
        me.jvor[132] = 2011995872879727712L;
        me.jvor[133] = 3733618664329891182L;
        me.jvor[134] = -7338998922439002335L;
        me.jvor[135] = -4157602516530682194L;
        me.jvor[136] = -9013161015139051636L;
        me.jvor[137] = -2542711995956041709L;
        me.jvor[138] = -6719969734916249717L;
        me.jvor[139] = -3998793635636074188L;
        me.jvor[140] = -6630953108213880940L;
        me.jvor[141] = 970195442574563413L;
        me.jvor[142] = 5533858886873272266L;
        me.jvor[143] = -2823665070992274804L;
        me.jvor[144] = -7554869626126957061L;
        me.jvor[145] = -430974684196009228L;
        me.jvor[146] = 5187479954954049526L;
        me.jvor[147] = -5782999720651253725L;
        me.jvor[148] = 7737516232025883571L;
        me.jvor[149] = 2811470262867820807L;
        me.jvor[150] = 8457558881374682978L;
        me.jvor[151] = 7919798194688348289L;
        me.jvor[152] = 2307268239834827688L;
        me.jvor[153] = 7742405770590133676L;
        me.jvor[154] = 3967083574254052274L;
        me.jvor[155] = -6311471450951945936L;
        me.jvor[156] = -4684260904351345527L;
        me.jvor[157] = 6278156216559962167L;
        me.jvor[158] = -6938570494806728851L;
        me.jvor[159] = -1615670120904187904L;
        me.jvor[160] = 5100744632243008696L;
        me.jvor[161] = 920730084329869860L;
        me.jvor[162] = -2773950576335180721L;
        me.jvor[163] = 8793555600348542705L;
        me.jvor[164] = -6486606788402998689L;
        me.jvor[165] = -5597421423708684833L;
        me.jvor[166] = -544386019979979515L;
        me.jvor[167] = 7279074613547675079L;
        me.jvor[168] = 3322962876372927178L;
        me.jvor[169] = 997651229485664630L;
        me.jvor[170] = -8097988504895109012L;
        me.jvor[171] = 9138801065631137528L;
        me.jvor[172] = -5658874643509566886L;
        me.jvor[173] = 5533426641833051824L;
        me.jvor[174] = -831919014062782818L;
        me.jvor[175] = -6814784562674765749L;
        me.jvor[176] = -6282297726034787394L;
        me.jvor[177] = -1775399458909354917L;
        me.jvor[178] = 6971904714933262742L;
        me.jvor[179] = -5750676496676193444L;
        me.jvor[180] = -1233255438012743487L;
        me.jvor[181] = 6953606150588229317L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void centeredText(class_332 var1_1, String var2_2, float var3_3, float var4_4, float var5_5, int var6_6) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = me.rx - me.jvoa("jwrf", jvop(int ), (int)100)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == me.jvoa("jwrg", jvnw(int ), (int)387)) break;
            v0 /* !! */  = (long)me.jvoa("jwri", jvnw(int ), (int)388);
        }
        var9_7 = me.c;
        v1 /* !! */  = me.rx;
        if (true) ** GOTO lbl11
        block26: while (true) {
            v1 /* !! */  = (long)(v2 - me.jvoa("jwrj", jvop(int ), (int)101));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -381550121: {
                    break block26;
                }
                case -329335452: {
                    v2 = me.jvoa("jwrl", jvop(int ), (int)102);
                    continue block26;
                }
                case -297077904: {
                    v2 = me.jvoa("jwrn", jvop(int ), (int)103);
                    continue block26;
                }
            }
            break;
        }
        var8_8 /* !! */  = me.b;
        v3 /* !! */  = me.rx;
        if (true) ** GOTO lbl25
        block27: while (true) {
            v3 /* !! */  = (long)(v4 - me.jvoa("jwrp", jvop(int ), (int)104));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1554875179: {
                    v4 = me.jvoa("jwrr", jvop(int ), (int)105);
                    continue block27;
                }
                case -930772783: {
                    v4 = me.jvoa("jwrs", jvop(int ), (int)106);
                    continue block27;
                }
                case -537156411: {
                    v4 = me.jvoa("jwru", jvop(int ), (int)107);
                    continue block27;
                }
                case -381550121: {
                    break block27;
                }
            }
            break;
        }
        var7_9 = me.a;
        if (var9_7) {
            throw null;
lbl40:
            // 2 sources

            return;
        }
        if (var8_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_9 || var7_9) ** GOTO lbl40
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = me.rx - me.jvoa("jwrw", jvop(int ), (int)108)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == me.jvoa("jwrz", jvnw(int ), (int)389)) break;
                    v5 /* !! */  = (long)me.jvoa("jwsb", jvnw(int ), (int)390);
                }
                v6 /* !! */  = me.rx;
                if (true) ** GOTO lbl55
                block30: while (true) {
                    v6 /* !! */  = (long)(v7 - me.jvoa("jwsd", jvop(int ), (int)109));
lbl55:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1683010744: {
                            v7 = me.jvoa("jwsf", jvop(int ), (int)110);
                            continue block30;
                        }
                        case -1120759994: {
                            v7 = me.jvoa("jwsh", jvop(int ), (int)111);
                            continue block30;
                        }
                        case -381550121: {
                            break block30;
                        }
                        case 625007779: {
                            v7 = me.jvoa("jwsj", jvop(int ), (int)112);
                            continue block30;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = me.rx - me.jvoa("jwsk", jvop(int ), (int)113)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == me.jvoa("jwsl", jvnw(int ), (int)391)) break;
                    v8 /* !! */  = (long)me.jvoa("jwsn", jvnw(int ), (int)392);
                }
                v9 = var3_3 - kq.width(kv.BOLD, var2_2, var5_5) / 2.0f;
                v10 = me.jvoa("jwsp", jvnw(int ), (int)393);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = me.rx - me.jvoa("jwsq", jvop(int ), (int)114)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == me.jvoa("jwss", jvnw(int ), (int)394)) break;
                    v11 /* !! */  = (long)me.jvoa("jwst", jvnw(int ), (int)395);
                }
                kq.text(var1_1, kv.BOLD, var2_2, v9, var4_4, var5_5, var6_6, (boolean)v10);
                if (var7_9 || var7_9) ** continue;
                return;
            }
lbl82:
            // 2 sources

            case 0: {
                var8_8 /* !! */  = (int)me.jvoa("jwsv", jvnw(int ), (int)396);
                if (var9_7) {
                    throw null;
                }
                ** GOTO lbl92
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var8_8 /* !! */  = (int)me.jvoa("jwsx", jvnw(int ), (int)397);
                    if (!var9_7) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl92:
            // 2 sources

            case 2: {
                var8_8 /* !! */  = (int)me.jvoa("jwsz", jvnw(int ), (int)398);
                if (var9_7) {
                    throw null;
                }
                ** GOTO lbl101
            }
            case 3: {
                var8_8 /* !! */  = (int)me.jvoa("jwtc", jvnw(int ), (int)399);
                if (!var9_7) ** GOTO lbl82
                throw null;
            }
lbl101:
            // 2 sources

            case 4: {
                do {
                    var8_8 /* !! */  = (int)me.jvoa("jwte", jvnw(int ), (int)400);
                } while (!var9_7);
                throw null;
            }
            case 5: 
        }
        var8_8 /* !! */  = (int)me.jvoa("jwtg", jvnw(int ), (int)401);
        ** while (!var9_7)
lbl109:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite jvoa(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void jxjx() {
        me.jvnx[300] = -1569221077;
        me.jvnx[301] = 1967704862;
        me.jvnx[302] = 267139743;
        me.jvnx[303] = -1082311972;
        me.jvnx[304] = -816918138;
        me.jvnx[305] = 1687489861;
        me.jvnx[306] = -208734836;
        me.jvnx[307] = 760255692;
        me.jvnx[308] = -90324143;
        me.jvnx[309] = -1734491799;
        me.jvnx[310] = -1339584957;
        me.jvnx[311] = 1503972158;
        me.jvnx[312] = 1028336076;
        me.jvnx[313] = -1694890011;
        me.jvnx[314] = 1532587201;
        me.jvnx[315] = 216039674;
        me.jvnx[316] = -598031368;
        me.jvnx[317] = -1782347016;
        me.jvnx[318] = -1002699067;
        me.jvnx[319] = 1554433981;
        me.jvnx[320] = -2095787917;
        me.jvnx[321] = -656255018;
        me.jvnx[322] = -573993994;
        me.jvnx[323] = -1482616310;
        me.jvnx[324] = 934317992;
        me.jvnx[325] = -426220126;
        me.jvnx[326] = -1582681440;
        me.jvnx[327] = -2138398788;
        me.jvnx[328] = -1538767361;
        me.jvnx[329] = -1135710418;
        me.jvnx[330] = -1006850842;
        me.jvnx[331] = -355963971;
        me.jvnx[332] = 1957785053;
        me.jvnx[333] = -1671577104;
        me.jvnx[334] = 1417935473;
        me.jvnx[335] = 1013599477;
        me.jvnx[336] = -505129775;
        me.jvnx[337] = 993085538;
        me.jvnx[338] = 1551618836;
        me.jvnx[339] = 1677724606;
        me.jvnx[340] = 1221043025;
        me.jvnx[341] = -730833769;
        me.jvnx[342] = -1080455830;
        me.jvnx[343] = -1688901183;
        me.jvnx[344] = 309356805;
        me.jvnx[345] = -1834495572;
        me.jvnx[346] = 1515966075;
        me.jvnx[347] = 1951690158;
        me.jvnx[348] = 64475737;
        me.jvnx[349] = -355711680;
        me.jvnx[350] = 2020844146;
        me.jvnx[351] = -2095224366;
        me.jvnx[352] = 462254939;
        me.jvnx[353] = -1464155073;
        me.jvnx[354] = -1676281002;
        me.jvnx[355] = -1646753347;
        me.jvnx[356] = 1890287573;
        me.jvnx[357] = -1600442607;
        me.jvnx[358] = 1732396995;
        me.jvnx[359] = 1610409781;
        me.jvnx[360] = -861121167;
        me.jvnx[361] = -10878739;
        me.jvnx[362] = -1622975002;
        me.jvnx[363] = -1148884151;
        me.jvnx[364] = -1543406328;
        me.jvnx[365] = 866475012;
        me.jvnx[366] = 1412616459;
        me.jvnx[367] = -1866727348;
        me.jvnx[368] = 1673812362;
        me.jvnx[369] = -2118942286;
        me.jvnx[370] = 682886350;
        me.jvnx[371] = 147314292;
        me.jvnx[372] = 463991313;
        me.jvnx[373] = -1344858514;
        me.jvnx[374] = -1281519761;
        me.jvnx[375] = 2125710172;
        me.jvnx[376] = -1848208403;
        me.jvnx[377] = -347612579;
        me.jvnx[378] = -1046691066;
        me.jvnx[379] = 1517157080;
        me.jvnx[380] = -237160589;
        me.jvnx[381] = 1103935405;
        me.jvnx[382] = 1900572692;
        me.jvnx[383] = 563260116;
        me.jvnx[384] = -479075203;
        me.jvnx[385] = 811485482;
        me.jvnx[386] = -1378536389;
        me.jvnx[387] = 1901641229;
        me.jvnx[388] = -2131102016;
        me.jvnx[389] = 1741661679;
        me.jvnx[390] = 1528869840;
        me.jvnx[391] = -173582463;
        me.jvnx[392] = -229320654;
        me.jvnx[393] = 540693505;
        me.jvnx[394] = 502326252;
        me.jvnx[395] = 361422213;
        me.jvnx[396] = 411373382;
        me.jvnx[397] = -984000631;
        me.jvnx[398] = 1417799585;
        me.jvnx[399] = 219948350;
    }

    private static /* synthetic */ void jxkd() {
        me.jvnx[400] = -692477260;
        me.jvnx[401] = 1327351256;
        me.jvnx[402] = -1901091120;
        me.jvnx[403] = -1462496683;
        me.jvnx[404] = 736720224;
        me.jvnx[405] = 1307492251;
        me.jvnx[406] = -879279682;
        me.jvnx[407] = 1299118276;
        me.jvnx[408] = 1234501045;
        me.jvnx[409] = 1641854233;
        me.jvnx[410] = -710288601;
        me.jvnx[411] = -2120803325;
        me.jvnx[412] = 12097443;
        me.jvnx[413] = -1941776619;
        me.jvnx[414] = -711745404;
        me.jvnx[415] = -1542694556;
        me.jvnx[416] = 1114983685;
        me.jvnx[417] = -2143101705;
        me.jvnx[418] = -778316464;
        me.jvnx[419] = 688747501;
        me.jvnx[420] = -1941780858;
        me.jvnx[421] = -2033572825;
        me.jvnx[422] = -1280864776;
        me.jvnx[423] = -1143767388;
        me.jvnx[424] = 1298094448;
        me.jvnx[425] = 1201060722;
        me.jvnx[426] = 1715763409;
        me.jvnx[427] = 741804456;
        me.jvnx[428] = 2087282235;
        me.jvnx[429] = 1317607934;
        me.jvnx[430] = -305463935;
        me.jvnx[431] = -673385341;
        me.jvnx[432] = -954336503;
        me.jvnx[433] = 1422100404;
        me.jvnx[434] = -1485969063;
        me.jvnx[435] = -2086466585;
        me.jvnx[436] = -805956379;
        me.jvnx[437] = -371591167;
        me.jvnx[438] = -490924047;
        me.jvnx[439] = -665398135;
        me.jvnx[440] = -1159261972;
        me.jvnx[441] = 1413308220;
        me.jvnx[442] = -930885009;
        me.jvnx[443] = -243062434;
        me.jvnx[444] = 1103110732;
        me.jvnx[445] = -2059898455;
        me.jvnx[446] = 2090250964;
        me.jvnx[447] = 1911971894;
        me.jvnx[448] = -909438197;
        me.jvnx[449] = 396017773;
        me.jvnx[450] = -1807512531;
        me.jvnx[451] = -1611196759;
        me.jvnx[452] = 1123533107;
        me.jvnx[453] = -1919328248;
        me.jvnx[454] = -1997078117;
        me.jvnx[455] = -1708453964;
        me.jvnx[456] = -968005708;
        me.jvnx[457] = -1714447098;
        me.jvnx[458] = 682123654;
        me.jvnx[459] = -552784075;
        me.jvnx[460] = -413160774;
        me.jvnx[461] = 831158559;
        me.jvnx[462] = -1844416343;
        me.jvnx[463] = -184328687;
        me.jvnx[464] = 503056160;
        me.jvnx[465] = 1139698403;
        me.jvnx[466] = 1681351361;
        me.jvnx[467] = -803477769;
        me.jvnx[468] = 978086251;
        me.jvnx[469] = -1541464737;
        me.jvnx[470] = 726898174;
        me.jvnx[471] = -1250774526;
        me.jvnx[472] = 1655424038;
        me.jvnx[473] = -1498996574;
        me.jvnx[474] = -1141295115;
        me.jvnx[475] = 1057554124;
        me.jvnx[476] = -1190381448;
        me.jvnx[477] = -1500010506;
        me.jvnx[478] = 954116314;
        me.jvnx[479] = -2071368201;
        me.jvnx[480] = 619737143;
        me.jvnx[481] = 362327229;
        me.jvnx[482] = -1403773446;
        me.jvnx[483] = 134299679;
        me.jvnx[484] = -402403316;
        me.jvnx[485] = -1365103079;
        me.jvnx[486] = -1716639068;
        me.jvnx[487] = -2008512584;
        me.jvnx[488] = -443802426;
        me.jvnx[489] = -796884494;
        me.jvnx[490] = 1247123898;
        me.jvnx[491] = -1830854494;
        me.jvnx[492] = -996964517;
        me.jvnx[493] = 853074941;
        me.jvnx[494] = -1709606749;
        me.jvnx[495] = 764189146;
        me.jvnx[496] = 1302002128;
        me.jvnx[497] = -1896198819;
        me.jvnx[498] = 1142160045;
        me.jvnx[499] = -1006813951;
    }

    private static /* synthetic */ long jvop(int n2) {
        return jvoq[n2] ^ jvor[n2];
    }

    private static /* synthetic */ void jxkz() {
        me.jvnz[300] = 1009661298;
        me.jvnz[301] = -1967704863;
        me.jvnz[302] = -1735257199;
        me.jvnz[303] = -30590244;
        me.jvnz[304] = -1887298229;
        me.jvnz[305] = 1687490004;
        me.jvnz[306] = -208734971;
        me.jvnz[307] = 760255570;
        me.jvnz[308] = -90324050;
        me.jvnz[309] = 1734491798;
        me.jvnz[310] = 629054411;
        me.jvnz[311] = 1503972157;
        me.jvnz[312] = 1028336075;
        me.jvnz[313] = -1694890009;
        me.jvnz[314] = 1532587211;
        me.jvnz[315] = 216039667;
        me.jvnz[316] = -598031364;
        me.jvnz[317] = -1782347014;
        me.jvnz[318] = -1002699066;
        me.jvnz[319] = 1554433977;
        me.jvnz[320] = -2095787914;
        me.jvnz[321] = -656255017;
        me.jvnz[322] = -573993985;
        me.jvnz[323] = -1482616314;
        me.jvnz[324] = 1998830747;
        me.jvnz[325] = -1484233310;
        me.jvnz[326] = -1582681505;
        me.jvnz[327] = -2138398909;
        me.jvnz[328] = -1538767616;
        me.jvnz[329] = -1135710255;
        me.jvnz[330] = -1006850986;
        me.jvnz[331] = -355964133;
        me.jvnz[332] = 1957784931;
        me.jvnz[333] = -1671577329;
        me.jvnz[334] = 1788503019;
        me.jvnz[335] = 2113555701;
        me.jvnz[336] = -574127141;
        me.jvnz[337] = 2058438754;
        me.jvnz[338] = 503042836;
        me.jvnz[339] = 1677724606;
        me.jvnz[340] = 1221043025;
        me.jvnz[341] = -730833777;
        me.jvnz[342] = -1080455865;
        me.jvnz[343] = -1688901141;
        me.jvnz[344] = 309356846;
        me.jvnz[345] = -1834495556;
        me.jvnz[346] = 1515966032;
        me.jvnz[347] = 1951690174;
        me.jvnz[348] = 64475733;
        me.jvnz[349] = -355711657;
        me.jvnz[350] = 2020844133;
        me.jvnz[351] = -2095224377;
        me.jvnz[352] = 462254932;
        me.jvnz[353] = -1464155081;
        me.jvnz[354] = -1676280969;
        me.jvnz[355] = -1646753363;
        me.jvnz[356] = 1890287573;
        me.jvnz[357] = -1600442624;
        me.jvnz[358] = 1732397002;
        me.jvnz[359] = 1610409774;
        me.jvnz[360] = -861121190;
        me.jvnz[361] = -10878774;
        me.jvnz[362] = -1622975033;
        me.jvnz[363] = -1148884125;
        me.jvnz[364] = -1543406295;
        me.jvnz[365] = 866475012;
        me.jvnz[366] = 1412616464;
        me.jvnz[367] = -1866727352;
        me.jvnz[368] = 1673812356;
        me.jvnz[369] = -2118942314;
        me.jvnz[370] = 682886357;
        me.jvnz[371] = 147314299;
        me.jvnz[372] = 463991325;
        me.jvnz[373] = -1344858554;
        me.jvnz[374] = -1281519771;
        me.jvnz[375] = 2125710148;
        me.jvnz[376] = -1848208440;
        me.jvnz[377] = -347612580;
        me.jvnz[378] = -1046691064;
        me.jvnz[379] = 1517157077;
        me.jvnz[380] = -237160590;
        me.jvnz[381] = 1103935367;
        me.jvnz[382] = 1900572683;
        me.jvnz[383] = 563260114;
        me.jvnz[384] = -479075247;
        me.jvnz[385] = 811485441;
        me.jvnz[386] = -1378536421;
        me.jvnz[387] = -1901641230;
        me.jvnz[388] = -319886634;
        me.jvnz[389] = -1741661680;
        me.jvnz[390] = 88410303;
        me.jvnz[391] = 173582462;
        me.jvnz[392] = -44075048;
        me.jvnz[393] = 540693504;
        me.jvnz[394] = -502326253;
        me.jvnz[395] = 546698670;
        me.jvnz[396] = 411373380;
        me.jvnz[397] = -984000628;
        me.jvnz[398] = 1417799585;
        me.jvnz[399] = 219948347;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int findSector(float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6) {
        block72: {
            block74: {
                block73: {
                    var16_7 = me.c;
                    var15_8 /* !! */  = me.b;
                    var14_9 = me.a;
                    if (var16_7) {
                        throw null;
lbl6:
                        // 19 sources

                        return (int)me.jvoa("jwtn", jvnw(int ), (int)402);
                    }
                    if (var14_9 || var14_9) ** GOTO lbl6
                    var7_10 = var1_1 - var3_3;
                    if (var14_9 || var14_9) ** GOTO lbl6
                    var8_11 = var2_2 - var4_4;
                    if (var14_9 || var14_9) ** GOTO lbl6
                    var9_12 = (float)Math.sqrt(var7_10 * var7_10 + var8_11 * var8_11);
                    if (var14_9 || var14_9) ** GOTO lbl6
                    var10_13 = var5_5 / 2.0f + me.jvoa("jwts", jvqu(int ), (int)403);
                    if (var14_9 || var14_9) ** GOTO lbl6
                    var11_14 = var5_5 / 2.0f - var6_6 - me.jvoa("jwtu", jvqu(int ), (int)404);
                    if (var14_9 || var14_9) ** GOTO lbl6
                    if (var9_12 < var11_14) break block73;
                    if (var14_9) ** GOTO lbl6
                    if (!(var9_12 > var10_13)) break block74;
                    if (var14_9) ** GOTO lbl6
                }
                if (var14_9 || var14_9) ** GOTO lbl6
                return (int)me.jvoa("jwtz", jvnw(int ), (int)405);
            }
            if (var14_9 || var14_9) ** GOTO lbl6
            var12_15 = (float)Math.toDegrees(Math.atan2(var8_11, var7_10));
            if (var14_9 || var14_9) ** GOTO lbl6
            var13_16 = me.jvoa("jwuc", jvnw(int ), (int)406);
            if (var14_9) ** GOTO lbl6
            do {
                block75: {
                    if (var14_9 || var14_9) ** GOTO lbl6
                    if (var13_16 >= me.SECTOR_CENTER_ANGLES.length) break block72;
                    if (var14_9 || var14_9) ** GOTO lbl6
                    if (!(Math.abs(this.wrappedDegrees(var12_15 - me.SECTOR_CENTER_ANGLES[var13_16])) <= me.jvoa("jwug", jvqu(int ), (int)407))) break block75;
                    if (var14_9 || var14_9) ** GOTO lbl6
                    return (int)var13_16;
                }
                if (var14_9 || var14_9) ** GOTO lbl6
                ++var13_16;
                if (var14_9) ** GOTO lbl6
            } while (!var16_7);
            throw null;
        }
        if (var14_9) ** GOTO lbl6
        if (var15_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var15_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var14_9) ** break;
                ** continue;
                return (int)me.jvoa("jwuj", jvnw(int ), (int)408);
            }
            case 0: {
                var15_8 /* !! */  = (int)me.jvoa("jwul", jvnw(int ), (int)409);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl58:
            // 6 sources

            case 1: {
                var15_8 /* !! */  = (int)me.jvoa("jwum", jvnw(int ), (int)410);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl63:
            // 2 sources

            case 2: {
                var15_8 /* !! */  = (int)me.jvoa("jwuo", jvnw(int ), (int)411);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl208
            }
            case 3: {
                var15_8 /* !! */  = (int)me.jvoa("jwuq", jvnw(int ), (int)412);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl126
            }
lbl73:
            // 2 sources

            case 4: {
                var15_8 /* !! */  = (int)me.jvoa("jwus", jvnw(int ), (int)413);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl192
            }
lbl78:
            // 2 sources

            case 5: {
                var15_8 /* !! */  = (int)me.jvoa("jwut", jvnw(int ), (int)414);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl112
            }
            case 6: {
                var15_8 /* !! */  = (int)me.jvoa("jwuu", jvnw(int ), (int)415);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl192
            }
lbl88:
            // 2 sources

            case 7: {
                var15_8 /* !! */  = (int)me.jvoa("jwuw", jvnw(int ), (int)416);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl112
            }
lbl93:
            // 2 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var15_8 /* !! */  = (int)me.jvoa("jwuy", jvnw(int ), (int)417);
                    if (var16_7) {
                        throw null;
                    }
                    ** GOTO lbl192
                    break;
                }
            }
            case 9: {
                var15_8 /* !! */  = (int)me.jvoa("jwva", jvnw(int ), (int)418);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl104:
            // 2 sources

            case 10: {
                var15_8 /* !! */  = (int)me.jvoa("jwvb", jvnw(int ), (int)419);
                if (var16_7) {
                    throw null;
                }
            }
            case 11: {
                var15_8 /* !! */  = (int)me.jvoa("jwvd", jvnw(int ), (int)420);
                if (!var16_7) ** GOTO lbl104
                throw null;
            }
lbl112:
            // 3 sources

            case 12: {
                var15_8 /* !! */  = (int)me.jvoa("jwvf", jvnw(int ), (int)421);
                if (!var16_7) ** GOTO lbl58
                throw null;
            }
lbl116:
            // 2 sources

            case 13: {
                var15_8 /* !! */  = (int)me.jvoa("jwvh", jvnw(int ), (int)422);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 14: {
                do {
                    var15_8 /* !! */  = (int)me.jvoa("jwvi", jvnw(int ), (int)423);
                } while (!var16_7);
                throw null;
            }
lbl126:
            // 4 sources

            case 15: {
                var15_8 /* !! */  = (int)me.jvoa("jwvk", jvnw(int ), (int)424);
                if (!var16_7) ** GOTO lbl58
                throw null;
            }
            case 16: {
                var15_8 /* !! */  = (int)me.jvoa("jwvm", jvnw(int ), (int)425);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl188
            }
            case 17: {
                var15_8 /* !! */  = (int)me.jvoa("jwvo", jvnw(int ), (int)426);
                if (!var16_7) ** GOTO lbl78
                throw null;
            }
lbl139:
            // 2 sources

            case 18: {
                var15_8 /* !! */  = (int)me.jvoa("jwvq", jvnw(int ), (int)427);
                if (!var16_7) ** GOTO lbl73
                throw null;
            }
            case 19: {
                var15_8 /* !! */  = (int)me.jvoa("jwvr", jvnw(int ), (int)428);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl148:
            // 2 sources

            case 20: {
                var15_8 /* !! */  = (int)me.jvoa("jwvt", jvnw(int ), (int)429);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl153:
            // 2 sources

            case 21: {
                var15_8 /* !! */  = (int)me.jvoa("jwvv", jvnw(int ), (int)430);
                if (!var16_7) ** GOTO lbl126
                throw null;
            }
lbl157:
            // 2 sources

            case 22: {
                var15_8 /* !! */  = (int)me.jvoa("jwvx", jvnw(int ), (int)431);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl188
            }
            case 23: {
                var15_8 /* !! */  = (int)me.jvoa("jwvy", jvnw(int ), (int)432);
                if (!var16_7) ** GOTO lbl148
                throw null;
            }
lbl166:
            // 2 sources

            case 24: {
                var15_8 /* !! */  = (int)me.jvoa("jwvz", jvnw(int ), (int)433);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl200
            }
            case 25: {
                var15_8 /* !! */  = (int)me.jvoa("jwwb", jvnw(int ), (int)434);
                if (!var16_7) ** GOTO lbl153
                throw null;
            }
lbl175:
            // 2 sources

            case 26: {
                var15_8 /* !! */  = (int)me.jvoa("jwwd", jvnw(int ), (int)435);
                if (!var16_7) ** GOTO lbl93
                throw null;
            }
            case 27: {
                var15_8 /* !! */  = (int)me.jvoa("jwwe", jvnw(int ), (int)436);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl184:
            // 2 sources

            case 28: {
                var15_8 /* !! */  = (int)me.jvoa("jwwf", jvnw(int ), (int)437);
                if (!var16_7) ** GOTO lbl63
                throw null;
            }
lbl188:
            // 4 sources

            case 29: {
                var15_8 /* !! */  = (int)me.jvoa("jwwg", jvnw(int ), (int)438);
                if (!var16_7) ** GOTO lbl126
                throw null;
            }
lbl192:
            // 4 sources

            case 30: {
                var15_8 /* !! */  = (int)me.jvoa("jwwh", jvnw(int ), (int)439);
                if (!var16_7) ** GOTO lbl58
                throw null;
            }
            case 31: {
                var15_8 /* !! */  = (int)me.jvoa("jwwk", jvnw(int ), (int)440);
                if (!var16_7) ** GOTO lbl88
                throw null;
            }
lbl200:
            // 2 sources

            case 32: {
                var15_8 /* !! */  = (int)me.jvoa("jwwm", jvnw(int ), (int)441);
                if (!var16_7) ** GOTO lbl116
                throw null;
            }
            case 33: {
                var15_8 /* !! */  = (int)me.jvoa("jwwp", jvnw(int ), (int)442);
                if (!var16_7) ** GOTO lbl58
                throw null;
            }
lbl208:
            // 3 sources

            case 34: {
                var15_8 /* !! */  = (int)me.jvoa("jwws", jvnw(int ), (int)443);
                if (!var16_7) ** GOTO lbl58
                throw null;
            }
            case 35: 
        }
        var15_8 /* !! */  = (int)me.jvoa("jwwv", jvnw(int ), (int)444);
        ** while (!var16_7)
lbl215:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void method_25426() {
        v0 /* !! */  = me.rx;
        if (true) ** GOTO lbl5
        block39: while (true) {
            v0 /* !! */  = (long)(v1 - me.jvoa("jvos", jvop(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1984494833: {
                    v1 = me.jvoa("jvot", jvop(int ), (int)1);
                    continue block39;
                }
                case -381550121: {
                    break block39;
                }
                case -209256018: {
                    v1 = me.jvoa("jvov", jvop(int ), (int)2);
                    continue block39;
                }
            }
            break;
        }
        var3_1 = me.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = me.rx - me.jvoa("jvow", jvop(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == me.jvoa("jvox", jvnw(int ), (int)10)) break;
            v2 /* !! */  = (long)me.jvoa("jvoy", jvnw(int ), (int)11);
        }
        var2_2 /* !! */  = me.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = me.rx - me.jvoa("jvpa", jvop(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == me.jvoa("jvpb", jvnw(int ), (int)12)) break;
            v3 /* !! */  = (long)me.jvoa("jvpc", jvnw(int ), (int)13);
        }
        var1_3 = me.a;
        if (var3_1) {
            throw null;
lbl29:
            // 5 sources

            return;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl29
                v4 /* !! */  = me.rx;
                if (true) ** GOTO lbl39
                block43: while (true) {
                    v4 /* !! */  = (long)(me.jvoa("jvpf", jvop(int ), (int)6) - me.jvoa("jvpe", jvop(int ), (int)5));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1197096360: {
                            continue block43;
                        }
                        case -381550121: {
                            break block43;
                        }
                    }
                    break;
                }
                v5 = System.nanoTime();
                v6 /* !! */  = me.rx;
                if (true) ** GOTO lbl49
                block44: while (true) {
                    v6 /* !! */  = (long)(v7 - me.jvoa("jvpg", jvop(int ), (int)7));
lbl49:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1691096115: {
                            v7 = me.jvoa("jvph", jvop(int ), (int)8);
                            continue block44;
                        }
                        case -1452974511: {
                            v7 = me.jvoa("jvpj", jvop(int ), (int)9);
                            continue block44;
                        }
                        case -838087813: {
                            v7 = me.jvoa("jvpk", jvop(int ), (int)10);
                            continue block44;
                        }
                        case -381550121: {
                            break block44;
                        }
                    }
                    break;
                }
                this.openedAt = v5;
                if (var1_3 || var1_3) ** GOTO lbl29
                v8 = me.jvoa("jvpl", jvop(int ), (int)11);
                v9 /* !! */  = me.rx;
                if (true) ** GOTO lbl68
                block45: while (true) {
                    v9 /* !! */  = (long)(v10 - me.jvoa("jvpn", jvop(int ), (int)12));
lbl68:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1949082136: {
                            v10 = me.jvoa("jvpo", jvop(int ), (int)13);
                            continue block45;
                        }
                        case -1848790821: {
                            v10 = me.jvoa("jvpp", jvop(int ), (int)14);
                            continue block45;
                        }
                        case -1592995322: {
                            v10 = me.jvoa("jvpq", jvop(int ), (int)15);
                            continue block45;
                        }
                        case -381550121: {
                            break block45;
                        }
                    }
                    break;
                }
                this.closingAt = (long)v8;
                if (var1_3 || var1_3) ** GOTO lbl29
                v11 = me.jvoa("jvps", jvnw(int ), (int)14);
                v12 /* !! */  = me.rx;
                if (true) ** GOTO lbl87
                block46: while (true) {
                    v12 /* !! */  = (long)(me.jvoa("jvpv", jvop(int ), (int)17) - me.jvoa("jvpt", jvop(int ), (int)16));
lbl87:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -381550121: {
                            break block46;
                        }
                        case 1645266570: {
                            continue block46;
                        }
                    }
                    break;
                }
                this.closing = v11;
                if (var1_3 || var1_3) ** GOTO lbl29
                v13 = me.jvoa("jvpw", jvnw(int ), (int)15);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_2 = me.rx - me.jvoa("jvpx", jvop(int ), (int)18)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == me.jvoa("jvpy", jvnw(int ), (int)16)) break;
                    v14 /* !! */  = (long)me.jvoa("jvqa", jvnw(int ), (int)17);
                }
                this.pendingUseSlot = (int)v13;
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl103:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)me.jvoa("jvqb", jvnw(int ), (int)18);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl108:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)me.jvoa("jvqc", jvnw(int ), (int)19);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl135
            }
            case 2: {
                var2_2 /* !! */  = (int)me.jvoa("jvqe", jvnw(int ), (int)20);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl118:
            // 5 sources

            case 3: {
                var2_2 /* !! */  = (int)me.jvoa("jvqf", jvnw(int ), (int)21);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl123:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)me.jvoa("jvqg", jvnw(int ), (int)22);
                if (!var3_1) ** GOTO lbl108
                throw null;
            }
lbl127:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)me.jvoa("jvqi", jvnw(int ), (int)23);
                if (!var3_1) ** GOTO lbl118
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)me.jvoa("jvqj", jvnw(int ), (int)24);
                if (!var3_1) ** GOTO lbl118
                throw null;
            }
lbl135:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)me.jvoa("jvqk", jvnw(int ), (int)25);
                if (!var3_1) ** GOTO lbl118
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)me.jvoa("jvqm", jvnw(int ), (int)26);
                if (!var3_1) ** GOTO lbl118
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)me.jvoa("jvqn", jvnw(int ), (int)27);
                if (!var3_1) ** GOTO lbl103
                throw null;
            }
lbl147:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)me.jvoa("jvqo", jvnw(int ), (int)28);
                if (!var3_1) ** GOTO lbl135
                throw null;
            }
            case 11: 
        }
        do {
            var2_2 /* !! */  = (int)me.jvoa("jvqq", jvnw(int ), (int)29);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void jxjq() {
        me.jvnx[200] = -598046425;
        me.jvnx[201] = 1054790326;
        me.jvnx[202] = 227924948;
        me.jvnx[203] = -1810201128;
        me.jvnx[204] = 762443473;
        me.jvnx[205] = 346048909;
        me.jvnx[206] = -1846368699;
        me.jvnx[207] = 1379520752;
        me.jvnx[208] = -129965477;
        me.jvnx[209] = -1377187419;
        me.jvnx[210] = -1460244475;
        me.jvnx[211] = 10222246;
        me.jvnx[212] = -1893693666;
        me.jvnx[213] = 809220940;
        me.jvnx[214] = 305072364;
        me.jvnx[215] = 1520740963;
        me.jvnx[216] = -617982173;
        me.jvnx[217] = -925324115;
        me.jvnx[218] = -1930915562;
        me.jvnx[219] = 117210865;
        me.jvnx[220] = -464426813;
        me.jvnx[221] = 127645219;
        me.jvnx[222] = 1252470953;
        me.jvnx[223] = -1767259801;
        me.jvnx[224] = 1992526229;
        me.jvnx[225] = 1293849114;
        me.jvnx[226] = 1564047049;
        me.jvnx[227] = -1015921330;
        me.jvnx[228] = -1272645908;
        me.jvnx[229] = -1553440199;
        me.jvnx[230] = -1172155804;
        me.jvnx[231] = 192542155;
        me.jvnx[232] = 286538513;
        me.jvnx[233] = 1666908654;
        me.jvnx[234] = -1783697997;
        me.jvnx[235] = 1153599282;
        me.jvnx[236] = 124302722;
        me.jvnx[237] = 1870175568;
        me.jvnx[238] = -854128927;
        me.jvnx[239] = -27623531;
        me.jvnx[240] = -1896869038;
        me.jvnx[241] = 1088211541;
        me.jvnx[242] = 1909060212;
        me.jvnx[243] = -1497534805;
        me.jvnx[244] = 658555932;
        me.jvnx[245] = 532532852;
        me.jvnx[246] = -868039164;
        me.jvnx[247] = -726938660;
        me.jvnx[248] = -2084149472;
        me.jvnx[249] = 1857375070;
        me.jvnx[250] = -1752446797;
        me.jvnx[251] = -86825317;
        me.jvnx[252] = -1958336950;
        me.jvnx[253] = 760150392;
        me.jvnx[254] = -2023222163;
        me.jvnx[255] = -646615137;
        me.jvnx[256] = 1328137133;
        me.jvnx[257] = -1279080144;
        me.jvnx[258] = 1351271077;
        me.jvnx[259] = 174747418;
        me.jvnx[260] = -142521226;
        me.jvnx[261] = 1503021343;
        me.jvnx[262] = -1474293255;
        me.jvnx[263] = 1224511845;
        me.jvnx[264] = -482955353;
        me.jvnx[265] = 1413971472;
        me.jvnx[266] = -904608658;
        me.jvnx[267] = -859626828;
        me.jvnx[268] = -772959682;
        me.jvnx[269] = 1494845367;
        me.jvnx[270] = -414965034;
        me.jvnx[271] = -544589554;
        me.jvnx[272] = 1035812370;
        me.jvnx[273] = 460568177;
        me.jvnx[274] = 394039369;
        me.jvnx[275] = 1440337419;
        me.jvnx[276] = -1080462333;
        me.jvnx[277] = 1589773439;
        me.jvnx[278] = 1265563724;
        me.jvnx[279] = -117528706;
        me.jvnx[280] = -2061864057;
        me.jvnx[281] = -1254358777;
        me.jvnx[282] = -278071528;
        me.jvnx[283] = -893790973;
        me.jvnx[284] = 1839439661;
        me.jvnx[285] = -737603803;
        me.jvnx[286] = -1641097907;
        me.jvnx[287] = 130270934;
        me.jvnx[288] = -2132052991;
        me.jvnx[289] = -1516202887;
        me.jvnx[290] = -2117785153;
        me.jvnx[291] = -1600372958;
        me.jvnx[292] = -2116106000;
        me.jvnx[293] = -1609891940;
        me.jvnx[294] = -1631374867;
        me.jvnx[295] = -1443846807;
        me.jvnx[296] = 1107593341;
        me.jvnx[297] = -1617770464;
        me.jvnx[298] = 1357658878;
        me.jvnx[299] = 403686968;
    }

    private static /* synthetic */ void jxle() {
        me.jvnz[400] = -692477259;
        me.jvnz[401] = 1327351258;
        me.jvnz[402] = -1272710120;
        me.jvnz[403] = -392949163;
        me.jvnz[404] = 1806267744;
        me.jvnz[405] = -1307492252;
        me.jvnz[406] = -879279682;
        me.jvnz[407] = 255523012;
        me.jvnz[408] = -1234501046;
        me.jvnz[409] = 1641854230;
        me.jvnz[410] = -710288580;
        me.jvnz[411] = -2120803305;
        me.jvnz[412] = 12097453;
        me.jvnz[413] = -1941776633;
        me.jvnz[414] = -711745390;
        me.jvnz[415] = -1542694529;
        me.jvnz[416] = 1114983693;
        me.jvnz[417] = -2143101698;
        me.jvnz[418] = -778316469;
        me.jvnz[419] = 688747514;
        me.jvnz[420] = -1941780856;
        me.jvnz[421] = -2033572809;
        me.jvnz[422] = -1280864783;
        me.jvnz[423] = -1143767373;
        me.jvnz[424] = 1298094450;
        me.jvnz[425] = 1201060711;
        me.jvnz[426] = 1715763394;
        me.jvnz[427] = 741804456;
        me.jvnz[428] = 2087282209;
        me.jvnz[429] = 1317607932;
        me.jvnz[430] = -305463901;
        me.jvnz[431] = -673385331;
        me.jvnz[432] = -954336508;
        me.jvnz[433] = 1422100392;
        me.jvnz[434] = -1485969068;
        me.jvnz[435] = -2086466576;
        me.jvnz[436] = -805956358;
        me.jvnz[437] = -371591136;
        me.jvnz[438] = -490924060;
        me.jvnz[439] = -665398115;
        me.jvnz[440] = -1159261984;
        me.jvnz[441] = 1413308192;
        me.jvnz[442] = -930885017;
        me.jvnz[443] = -243062461;
        me.jvnz[444] = 1103110764;
        me.jvnz[445] = 2059898454;
        me.jvnz[446] = -1243093959;
        me.jvnz[447] = 1911971895;
        me.jvnz[448] = -2049288927;
        me.jvnz[449] = -396017774;
        me.jvnz[450] = 1912133330;
        me.jvnz[451] = -1583374787;
        me.jvnz[452] = 21217587;
        me.jvnz[453] = -827498488;
        me.jvnz[454] = -884801125;
        me.jvnz[455] = 1495207860;
        me.jvnz[456] = -2047252556;
        me.jvnz[457] = -1714447091;
        me.jvnz[458] = 682123655;
        me.jvnz[459] = -552784080;
        me.jvnz[460] = -413160773;
        me.jvnz[461] = 831158546;
        me.jvnz[462] = -1844416340;
        me.jvnz[463] = -184328682;
        me.jvnz[464] = 503056163;
        me.jvnz[465] = 1139698405;
        me.jvnz[466] = 1681351364;
        me.jvnz[467] = -803477771;
        me.jvnz[468] = 978086248;
        me.jvnz[469] = -1541464744;
        me.jvnz[470] = 726898172;
        me.jvnz[471] = 1250774525;
        me.jvnz[472] = -601954949;
        me.jvnz[473] = 1498996573;
        me.jvnz[474] = -706621593;
        me.jvnz[475] = -1057554125;
        me.jvnz[476] = 1527784088;
        me.jvnz[477] = 1500010505;
        me.jvnz[478] = -725416840;
        me.jvnz[479] = -2071368201;
        me.jvnz[480] = 619737150;
        me.jvnz[481] = 362327231;
        me.jvnz[482] = -1403773446;
        me.jvnz[483] = 134299672;
        me.jvnz[484] = -402403317;
        me.jvnz[485] = -1365103075;
        me.jvnz[486] = -1716639070;
        me.jvnz[487] = -2008512584;
        me.jvnz[488] = -443802426;
        me.jvnz[489] = 796884493;
        me.jvnz[490] = -1477461510;
        me.jvnz[491] = 1830854493;
        me.jvnz[492] = -353466155;
        me.jvnz[493] = 214797997;
        me.jvnz[494] = -1709606752;
        me.jvnz[495] = 764189144;
        me.jvnz[496] = 1302002128;
        me.jvnz[497] = -1896198818;
        me.jvnz[498] = -1142160046;
        me.jvnz[499] = 295529964;
    }

    private static /* synthetic */ void jxlq() {
        me.jvoq[0] = 7150266633675775415L;
        me.jvoq[1] = -8747167486218782718L;
        me.jvoq[2] = -4775432516556218929L;
        me.jvoq[3] = -4595312924972196570L;
        me.jvoq[4] = 1205372917973119761L;
        me.jvoq[5] = 4334030661580420652L;
        me.jvoq[6] = 5799191959161238610L;
        me.jvoq[7] = 1487881745132766230L;
        me.jvoq[8] = -4816762646445491854L;
        me.jvoq[9] = -8876676180136502083L;
        me.jvoq[10] = 2796304576351762769L;
        me.jvoq[11] = 8559515307787014389L;
        me.jvoq[12] = 7444354510124977108L;
        me.jvoq[13] = 7595128694481952280L;
        me.jvoq[14] = -2592004466741574441L;
        me.jvoq[15] = -1010578078185110414L;
        me.jvoq[16] = 5347816304204916522L;
        me.jvoq[17] = -3066664595308587584L;
        me.jvoq[18] = 5757611392036649483L;
        me.jvoq[19] = 246058150757383496L;
        me.jvoq[20] = 3505697919541886714L;
        me.jvoq[21] = 6173622290971519241L;
        me.jvoq[22] = -7742827559089747461L;
        me.jvoq[23] = 5394577303246017631L;
        me.jvoq[24] = -2203043598163439422L;
        me.jvoq[25] = -2709265926611231720L;
        me.jvoq[26] = 8149562447349266233L;
        me.jvoq[27] = 7505412075967021378L;
        me.jvoq[28] = -9026923668850046052L;
        me.jvoq[29] = -8460961414151021088L;
        me.jvoq[30] = 3396852028505321378L;
        me.jvoq[31] = 1037405450140173984L;
        me.jvoq[32] = -2260723981568983093L;
        me.jvoq[33] = -275514652611220859L;
        me.jvoq[34] = 386740236475896677L;
        me.jvoq[35] = 7502074498210636885L;
        me.jvoq[36] = 4120335881122143403L;
        me.jvoq[37] = 3906091500940355633L;
        me.jvoq[38] = 4176621061873958054L;
        me.jvoq[39] = -5182831814968019562L;
        me.jvoq[40] = 1389075077000164173L;
        me.jvoq[41] = 6484771972269839404L;
        me.jvoq[42] = -6526607820943467016L;
        me.jvoq[43] = -8833134559604740795L;
        me.jvoq[44] = -2082418630173719155L;
        me.jvoq[45] = -5259647060085968643L;
        me.jvoq[46] = 4603079857472646355L;
        me.jvoq[47] = -4242782447980242783L;
        me.jvoq[48] = 7662405921118577668L;
        me.jvoq[49] = -4238616035182803959L;
        me.jvoq[50] = 692644195704098190L;
        me.jvoq[51] = 5887233228257162242L;
        me.jvoq[52] = -798411524507084293L;
        me.jvoq[53] = 693508320819794181L;
        me.jvoq[54] = -1581008630360921094L;
        me.jvoq[55] = 3953256300387998315L;
        me.jvoq[56] = -7040670488808833478L;
        me.jvoq[57] = -5660906885597730168L;
        me.jvoq[58] = 6967356309167097500L;
        me.jvoq[59] = 2753019384729355619L;
        me.jvoq[60] = 2171828132313838656L;
        me.jvoq[61] = 5283228200974082236L;
        me.jvoq[62] = -1814188568092831325L;
        me.jvoq[63] = 7078319854250890246L;
        me.jvoq[64] = -6969942512028881090L;
        me.jvoq[65] = 2414480593844265926L;
        me.jvoq[66] = 2245208788008284291L;
        me.jvoq[67] = 4845887116463099115L;
        me.jvoq[68] = -8033043390745356243L;
        me.jvoq[69] = 7121296843472302442L;
        me.jvoq[70] = -285595973197845337L;
        me.jvoq[71] = -2324025297206083426L;
        me.jvoq[72] = -7404581880657845827L;
        me.jvoq[73] = 6889294495172847773L;
        me.jvoq[74] = -8032881414520964360L;
        me.jvoq[75] = 8947953773753990934L;
        me.jvoq[76] = 6446656645806734107L;
        me.jvoq[77] = 3023093859326243251L;
        me.jvoq[78] = 8425078634658175655L;
        me.jvoq[79] = 7070213216599499024L;
        me.jvoq[80] = 8537667014976942928L;
        me.jvoq[81] = -3593830137102007369L;
        me.jvoq[82] = 5461293870779667221L;
        me.jvoq[83] = -8380563490349869923L;
        me.jvoq[84] = -251773277725301027L;
        me.jvoq[85] = -6106853151086860983L;
        me.jvoq[86] = -8740716117283045147L;
        me.jvoq[87] = 4756277992048768198L;
        me.jvoq[88] = 5260252371520636973L;
        me.jvoq[89] = 2183161857315266380L;
        me.jvoq[90] = -9075809599920050878L;
        me.jvoq[91] = -1765945926855708917L;
        me.jvoq[92] = 5907929019500607760L;
        me.jvoq[93] = -4925767992166212698L;
        me.jvoq[94] = 3667023488543344607L;
        me.jvoq[95] = -1592834454637378278L;
        me.jvoq[96] = 4644531722309611054L;
        me.jvoq[97] = -2673917434676382348L;
        me.jvoq[98] = -7854578135796339331L;
        me.jvoq[99] = 2527127546274815551L;
    }

    private static /* synthetic */ void jxjl() {
        me.jvnx[100] = -1519182273;
        me.jvnx[101] = -2066825321;
        me.jvnx[102] = -585081298;
        me.jvnx[103] = 622294793;
        me.jvnx[104] = 1064680072;
        me.jvnx[105] = -1017418295;
        me.jvnx[106] = 870092330;
        me.jvnx[107] = 163206198;
        me.jvnx[108] = -1576331654;
        me.jvnx[109] = -315538108;
        me.jvnx[110] = 876641817;
        me.jvnx[111] = 742335525;
        me.jvnx[112] = -335442536;
        me.jvnx[113] = -323277300;
        me.jvnx[114] = 749199340;
        me.jvnx[115] = 1921096888;
        me.jvnx[116] = -963775943;
        me.jvnx[117] = -120272806;
        me.jvnx[118] = -1443337559;
        me.jvnx[119] = 1115024020;
        me.jvnx[120] = -1670489268;
        me.jvnx[121] = -480730576;
        me.jvnx[122] = 412719525;
        me.jvnx[123] = -1711001885;
        me.jvnx[124] = 7339160;
        me.jvnx[125] = -493934215;
        me.jvnx[126] = -1421996396;
        me.jvnx[127] = -328486565;
        me.jvnx[128] = -1619322987;
        me.jvnx[129] = 73783550;
        me.jvnx[130] = 816436337;
        me.jvnx[131] = -1924468598;
        me.jvnx[132] = 1357207304;
        me.jvnx[133] = 46821496;
        me.jvnx[134] = 211807542;
        me.jvnx[135] = -208147201;
        me.jvnx[136] = -755224786;
        me.jvnx[137] = 552611749;
        me.jvnx[138] = 976020862;
        me.jvnx[139] = 307865558;
        me.jvnx[140] = -1229057880;
        me.jvnx[141] = -596549513;
        me.jvnx[142] = -26517993;
        me.jvnx[143] = -1592817309;
        me.jvnx[144] = 902989290;
        me.jvnx[145] = 2046275546;
        me.jvnx[146] = -1017462430;
        me.jvnx[147] = -1339400967;
        me.jvnx[148] = -968979131;
        me.jvnx[149] = -1372971949;
        me.jvnx[150] = 946837325;
        me.jvnx[151] = 1224696214;
        me.jvnx[152] = 1767097675;
        me.jvnx[153] = 1339259739;
        me.jvnx[154] = 697839131;
        me.jvnx[155] = 159905768;
        me.jvnx[156] = -198296560;
        me.jvnx[157] = -577709214;
        me.jvnx[158] = -970487854;
        me.jvnx[159] = 1087195301;
        me.jvnx[160] = 16644817;
        me.jvnx[161] = -291551352;
        me.jvnx[162] = 1323550294;
        me.jvnx[163] = -26856328;
        me.jvnx[164] = 1184275545;
        me.jvnx[165] = -698045083;
        me.jvnx[166] = 1800700540;
        me.jvnx[167] = -668884448;
        me.jvnx[168] = -1064270218;
        me.jvnx[169] = 333048803;
        me.jvnx[170] = 857262803;
        me.jvnx[171] = 849137649;
        me.jvnx[172] = 854365840;
        me.jvnx[173] = -2082975901;
        me.jvnx[174] = -799819974;
        me.jvnx[175] = -212104759;
        me.jvnx[176] = 300177822;
        me.jvnx[177] = 1152187577;
        me.jvnx[178] = 1840891529;
        me.jvnx[179] = -1141740704;
        me.jvnx[180] = -291626917;
        me.jvnx[181] = 1584992412;
        me.jvnx[182] = -2068283613;
        me.jvnx[183] = 1949404681;
        me.jvnx[184] = 220038342;
        me.jvnx[185] = 789411910;
        me.jvnx[186] = -371917078;
        me.jvnx[187] = -280999028;
        me.jvnx[188] = 1547580609;
        me.jvnx[189] = 626902502;
        me.jvnx[190] = -1730045128;
        me.jvnx[191] = 1470978542;
        me.jvnx[192] = 1840646336;
        me.jvnx[193] = -1615300048;
        me.jvnx[194] = -1579485755;
        me.jvnx[195] = 60970754;
        me.jvnx[196] = -101531215;
        me.jvnx[197] = 697999083;
        me.jvnx[198] = -1950915833;
        me.jvnx[199] = 1999977528;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float easeOutCubic(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = me.rx - me.jvoa("jxdd", jvop(int ), (int)145)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == me.jvoa("jxdf", jvnw(int ), (int)498)) break;
            v0 /* !! */  = (long)me.jvoa("jxdh", jvnw(int ), (int)499);
        }
        var5_2 = me.c;
        v1 /* !! */  = me.rx;
        if (true) ** GOTO lbl12
        block15: while (true) {
            v1 /* !! */  = (long)(v2 - me.jvoa("jxdi", jvop(int ), (int)146));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2045749506: {
                    v2 = me.jvoa("jxdk", jvop(int ), (int)147);
                    continue block15;
                }
                case -1568617525: {
                    v2 = me.jvoa("jxdm", jvop(int ), (int)148);
                    continue block15;
                }
                case -381550121: {
                    break block15;
                }
                case 1454440312: {
                    v2 = me.jvoa("jxdn", jvop(int ), (int)149);
                    continue block15;
                }
            }
            break;
        }
        var4_3 /* !! */  = me.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = me.rx - me.jvoa("jxdp", jvop(int ), (int)150)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == me.jvoa("jxdr", jvnw(int ), (int)500)) break;
            v3 /* !! */  = (long)me.jvoa("jxds", jvnw(int ), (int)501);
        }
        var3_4 = me.a;
        if (var5_2) {
            throw null;
lbl34:
            // 3 sources

            return (float)me.jvoa("jxdu", jvqu(int ), (int)502);
        }
        if (var3_4) ** GOTO lbl34
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl34
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = me.rx - me.jvoa("jxdw", jvop(int ), (int)151)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == me.jvoa("jxdy", jvnw(int ), (int)503)) break;
                    v4 /* !! */  = (long)me.jvoa("jxdz", jvnw(int ), (int)504);
                }
                var2_5 = 1.0f - this.clamp01(var1_1);
                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return 1.0f - var2_5 * var2_5 * var2_5;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)me.jvoa("jxea", jvnw(int ), (int)505);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl66
                    break;
                }
            }
lbl57:
            // 2 sources

            case 1: {
                var4_3 /* !! */  = (int)me.jvoa("jxeb", jvnw(int ), (int)506);
                if (var5_2) {
                    throw null;
                }
            }
lbl61:
            // 4 sources

            case 2: {
                do {
                    var4_3 /* !! */  = (int)me.jvoa("jxec", jvnw(int ), (int)507);
                } while (!var5_2);
                throw null;
            }
lbl66:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)me.jvoa("jxed", jvnw(int ), (int)508);
                if (!var5_2) ** GOTO lbl61
                throw null;
            }
            case 4: {
                var4_3 /* !! */  = (int)me.jvoa("jxee", jvnw(int ), (int)509);
                if (!var5_2) ** GOTO lbl57
                throw null;
            }
            case 5: 
        }
        var4_3 /* !! */  = (int)me.jvoa("jxef", jvnw(int ), (int)510);
        ** while (!var5_2)
lbl77:
        // 1 sources

        throw null;
    }

    static {
        jvnx = new int[544];
        jvnz = new int[544];
        me.jxjc();
        me.jxjl();
        me.jxjq();
        me.jxjx();
        me.jxkd();
        me.jxkk();
        me.jxko();
        me.jxkt();
        me.jxky();
        me.jxkz();
        me.jxle();
        me.jxlm();
        jvoq = new long[182];
        jvor = new long[182];
        me.jxlq();
        me.jxma();
        me.jxmi();
        me.jxmp();
        SECTOR_CENTER_ANGLES = new float[]{90.0f, -30.0f, -150.0f};
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ void lambda$render$0(Matrix4f var0, float var1_1, float var2_2, float var3_3, float var4_4, int[] var5_5) {
        v0 /* !! */  = me.rx;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - me.jvoa("jxhu", jvop(int ), (int)171));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1658589685: {
                    v1 = me.jvoa("jxhv", jvop(int ), (int)172);
                    continue block23;
                }
                case -381550121: {
                    break block23;
                }
                case -169000577: {
                    v1 = me.jvoa("jxhw", jvop(int ), (int)173);
                    continue block23;
                }
                case 1441491121: {
                    v1 = me.jvoa("jxhx", jvop(int ), (int)174);
                    continue block23;
                }
            }
            break;
        }
        var8_6 = me.c;
        v2 /* !! */  = me.rx;
        if (true) ** GOTO lbl22
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - me.jvoa("jxhy", jvop(int ), (int)175));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1917364957: {
                    v3 = me.jvoa("jxhz", jvop(int ), (int)176);
                    continue block24;
                }
                case -381550121: {
                    break block24;
                }
                case 1093821843: {
                    v3 = me.jvoa("jxia", jvop(int ), (int)177);
                    continue block24;
                }
                case 1942795333: {
                    v3 = me.jvoa("jxib", jvop(int ), (int)178);
                    continue block24;
                }
            }
            break;
        }
        var7_7 /* !! */  = me.b;
        if (var7_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = me.rx;
                if (true) ** GOTO lbl42
                block25: while (true) {
                    v4 /* !! */  = (long)(me.jvoa("jxie", jvop(int ), (int)180) - me.jvoa("jxic", jvop(int ), (int)179));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -381550121: {
                            break block25;
                        }
                        case 357995251: {
                            continue block25;
                        }
                    }
                    break;
                }
                var6_8 = me.a;
                if (var8_6) {
                    throw null;
lbl50:
                    // 2 sources

                    return;
                }
                if (var6_8 || var6_8) ** GOTO lbl50
                v5 = var1_1 - var2_2 / 2.0f;
                v6 = var3_3 - var2_2 / 2.0f;
                v7 = me.jvoa("jxij", jvqu(int ), (int)536);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_0 = me.rx - me.jvoa("jxim", jvop(int ), (int)181)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == me.jvoa("jxio", jvnw(int ), (int)537)) break;
                    v8 /* !! */  = (long)me.jvoa("jxiq", jvnw(int ), (int)538);
                }
                lh.draw(var0, v5, v6, var2_2, var4_4, (float)v7, 0.0f, var5_5);
                if (!var6_8) ** break;
                ** continue;
                return;
            }
            case 0: {
                var7_7 /* !! */  = (int)me.jvoa("jxis", jvnw(int ), (int)539);
                if (var8_6) {
                    throw null;
                }
                ** GOTO lbl79
            }
lbl70:
            // 2 sources

            case 1: {
                var7_7 /* !! */  = (int)me.jvoa("jxit", jvnw(int ), (int)540);
                if (var8_6) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_7 /* !! */  = (int)me.jvoa("jxiu", jvnw(int ), (int)541);
                    if (!var8_6) ** GOTO lbl70
                    throw null;
                }
            }
lbl79:
            // 2 sources

            case 3: {
                var7_7 /* !! */  = (int)me.jvoa("jxiw", jvnw(int ), (int)542);
                if (!var8_6) break;
                throw null;
            }
            case 4: 
        }
        var7_7 /* !! */  = (int)me.jvoa("jxiy", jvnw(int ), (int)543);
        ** while (!var8_6)
lbl86:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jxky() {
        me.jvnz[200] = -598046430;
        me.jvnz[201] = 1054790322;
        me.jvnz[202] = 227924951;
        me.jvnz[203] = -1810201123;
        me.jvnz[204] = 762443473;
        me.jvnz[205] = 346048911;
        me.jvnz[206] = 1846368698;
        me.jvnz[207] = -643237676;
        me.jvnz[208] = -129965478;
        me.jvnz[209] = -1377187410;
        me.jvnz[210] = -1460244467;
        me.jvnz[211] = 10222253;
        me.jvnz[212] = -1893693665;
        me.jvnz[213] = 809220943;
        me.jvnz[214] = 305072359;
        me.jvnz[215] = 1520740970;
        me.jvnz[216] = -617982175;
        me.jvnz[217] = -925324113;
        me.jvnz[218] = -1930915566;
        me.jvnz[219] = 117210865;
        me.jvnz[220] = -464426806;
        me.jvnz[221] = -127645220;
        me.jvnz[222] = 42020064;
        me.jvnz[223] = 1767259800;
        me.jvnz[224] = 1371445168;
        me.jvnz[225] = -1293849115;
        me.jvnz[226] = -1564047050;
        me.jvnz[227] = -417812528;
        me.jvnz[228] = 1272645907;
        me.jvnz[229] = -2079620834;
        me.jvnz[230] = -1172155788;
        me.jvnz[231] = 192542149;
        me.jvnz[232] = 286538526;
        me.jvnz[233] = 1666908654;
        me.jvnz[234] = -1783697990;
        me.jvnz[235] = 1153599285;
        me.jvnz[236] = 124302738;
        me.jvnz[237] = 1870175579;
        me.jvnz[238] = -854128927;
        me.jvnz[239] = -27623535;
        me.jvnz[240] = -1896869028;
        me.jvnz[241] = 1088211539;
        me.jvnz[242] = 1909060208;
        me.jvnz[243] = -1497534789;
        me.jvnz[244] = 658555920;
        me.jvnz[245] = 532532858;
        me.jvnz[246] = -868039161;
        me.jvnz[247] = -726938669;
        me.jvnz[248] = -2084149472;
        me.jvnz[249] = 1857375053;
        me.jvnz[250] = -696006477;
        me.jvnz[251] = -1173012227;
        me.jvnz[252] = -901372342;
        me.jvnz[253] = 760150410;
        me.jvnz[254] = -2023222142;
        me.jvnz[255] = -646615193;
        me.jvnz[256] = 1328137042;
        me.jvnz[257] = 1279080143;
        me.jvnz[258] = -1351271078;
        me.jvnz[259] = 174747530;
        me.jvnz[260] = -142521103;
        me.jvnz[261] = 1503021441;
        me.jvnz[262] = -1474293498;
        me.jvnz[263] = 1224511919;
        me.jvnz[264] = -482955507;
        me.jvnz[265] = 1413971695;
        me.jvnz[266] = -904608623;
        me.jvnz[267] = -1937562956;
        me.jvnz[268] = -772959703;
        me.jvnz[269] = 1494845366;
        me.jvnz[270] = -414965033;
        me.jvnz[271] = -544589553;
        me.jvnz[272] = 1035812382;
        me.jvnz[273] = 460568166;
        me.jvnz[274] = 394039384;
        me.jvnz[275] = 1440337427;
        me.jvnz[276] = -1080462325;
        me.jvnz[277] = 1589773413;
        me.jvnz[278] = 1265563727;
        me.jvnz[279] = -117528718;
        me.jvnz[280] = -2061864055;
        me.jvnz[281] = -1254358765;
        me.jvnz[282] = -278071550;
        me.jvnz[283] = -893790974;
        me.jvnz[284] = 1839439651;
        me.jvnz[285] = -737603793;
        me.jvnz[286] = -1641097892;
        me.jvnz[287] = 130270915;
        me.jvnz[288] = -2132052988;
        me.jvnz[289] = -1516202888;
        me.jvnz[290] = -2117785160;
        me.jvnz[291] = -1600372960;
        me.jvnz[292] = -2116105998;
        me.jvnz[293] = -1609891945;
        me.jvnz[294] = -1631374849;
        me.jvnz[295] = -1443846795;
        me.jvnz[296] = 1107593339;
        me.jvnz[297] = -1617770437;
        me.jvnz[298] = 1357658868;
        me.jvnz[299] = -403686969;
    }

    private static /* synthetic */ void jxkt() {
        me.jvnz[100] = -1519182336;
        me.jvnz[101] = -2066825290;
        me.jvnz[102] = -585081241;
        me.jvnz[103] = 622294823;
        me.jvnz[104] = 1064680100;
        me.jvnz[105] = -1017418368;
        me.jvnz[106] = 870092394;
        me.jvnz[107] = 163206242;
        me.jvnz[108] = -1576331693;
        me.jvnz[109] = -315538050;
        me.jvnz[110] = 876641842;
        me.jvnz[111] = 742335499;
        me.jvnz[112] = -335442467;
        me.jvnz[113] = -323277247;
        me.jvnz[114] = 749199328;
        me.jvnz[115] = 1921096847;
        me.jvnz[116] = -963775873;
        me.jvnz[117] = -120272802;
        me.jvnz[118] = -1443337500;
        me.jvnz[119] = 1115024028;
        me.jvnz[120] = -1670489224;
        me.jvnz[121] = -480730511;
        me.jvnz[122] = 412719537;
        me.jvnz[123] = -1711001920;
        me.jvnz[124] = 7339228;
        me.jvnz[125] = -493934236;
        me.jvnz[126] = -1421996368;
        me.jvnz[127] = -328486576;
        me.jvnz[128] = -1619322969;
        me.jvnz[129] = 73783537;
        me.jvnz[130] = 816436342;
        me.jvnz[131] = -1924468597;
        me.jvnz[132] = 1357207317;
        me.jvnz[133] = 46821477;
        me.jvnz[134] = 211807544;
        me.jvnz[135] = -208147202;
        me.jvnz[136] = -755224785;
        me.jvnz[137] = 1677602725;
        me.jvnz[138] = 2077549950;
        me.jvnz[139] = -307865559;
        me.jvnz[140] = -1229057879;
        me.jvnz[141] = -596549514;
        me.jvnz[142] = -26517994;
        me.jvnz[143] = -1592817310;
        me.jvnz[144] = 902989291;
        me.jvnz[145] = 2046275576;
        me.jvnz[146] = -1017462453;
        me.jvnz[147] = -1339400967;
        me.jvnz[148] = -968979091;
        me.jvnz[149] = -1372971917;
        me.jvnz[150] = 946837334;
        me.jvnz[151] = 1224696220;
        me.jvnz[152] = 1767097671;
        me.jvnz[153] = 1339259733;
        me.jvnz[154] = 697839125;
        me.jvnz[155] = 159905789;
        me.jvnz[156] = -198296568;
        me.jvnz[157] = -577709189;
        me.jvnz[158] = -970487814;
        me.jvnz[159] = 1087195313;
        me.jvnz[160] = 16644805;
        me.jvnz[161] = -291551313;
        me.jvnz[162] = 1323550277;
        me.jvnz[163] = -26856357;
        me.jvnz[164] = 1184275573;
        me.jvnz[165] = -698045071;
        me.jvnz[166] = 1800700533;
        me.jvnz[167] = -668884471;
        me.jvnz[168] = -1064270212;
        me.jvnz[169] = 333048826;
        me.jvnz[170] = 857262843;
        me.jvnz[171] = 849137629;
        me.jvnz[172] = 854365829;
        me.jvnz[173] = -2082975875;
        me.jvnz[174] = -799819983;
        me.jvnz[175] = -212104721;
        me.jvnz[176] = 300177812;
        me.jvnz[177] = 1152187567;
        me.jvnz[178] = 1840891529;
        me.jvnz[179] = -1141740686;
        me.jvnz[180] = -291626918;
        me.jvnz[181] = 1584992393;
        me.jvnz[182] = -2068283639;
        me.jvnz[183] = 1949404692;
        me.jvnz[184] = 220038347;
        me.jvnz[185] = 789411916;
        me.jvnz[186] = -371917066;
        me.jvnz[187] = -280998997;
        me.jvnz[188] = 1547580653;
        me.jvnz[189] = 626902469;
        me.jvnz[190] = 1730045127;
        me.jvnz[191] = -309486640;
        me.jvnz[192] = 1840646336;
        me.jvnz[193] = -1615300048;
        me.jvnz[194] = -1579485756;
        me.jvnz[195] = 60970754;
        me.jvnz[196] = -101531216;
        me.jvnz[197] = 697999082;
        me.jvnz[198] = 1950915832;
        me.jvnz[199] = -1606899120;
    }

    private static /* synthetic */ void jxjc() {
        me.jvnx[0] = 1940772698;
        me.jvnx[1] = -2143812642;
        me.jvnx[2] = -511394896;
        me.jvnx[3] = 2113353519;
        me.jvnx[4] = -236618142;
        me.jvnx[5] = 2023205763;
        me.jvnx[6] = 17227064;
        me.jvnx[7] = 838115273;
        me.jvnx[8] = -1405242365;
        me.jvnx[9] = 1723470218;
        me.jvnx[10] = 1938636828;
        me.jvnx[11] = 1036701153;
        me.jvnx[12] = -1212088217;
        me.jvnx[13] = 869280067;
        me.jvnx[14] = -429265797;
        me.jvnx[15] = 1804538839;
        me.jvnx[16] = -60225609;
        me.jvnx[17] = 553897130;
        me.jvnx[18] = 757522689;
        me.jvnx[19] = -1110854302;
        me.jvnx[20] = -1304887904;
        me.jvnx[21] = 1544831323;
        me.jvnx[22] = 852790927;
        me.jvnx[23] = -392628447;
        me.jvnx[24] = -1097204930;
        me.jvnx[25] = 950061153;
        me.jvnx[26] = 971207658;
        me.jvnx[27] = 1619238242;
        me.jvnx[28] = -1203883104;
        me.jvnx[29] = -1209888886;
        me.jvnx[30] = 745830145;
        me.jvnx[31] = -148220848;
        me.jvnx[32] = 753386344;
        me.jvnx[33] = 1897047377;
        me.jvnx[34] = 134483016;
        me.jvnx[35] = 647732544;
        me.jvnx[36] = -521223395;
        me.jvnx[37] = 581011884;
        me.jvnx[38] = -613057171;
        me.jvnx[39] = 1567757771;
        me.jvnx[40] = 1870541439;
        me.jvnx[41] = -1136355169;
        me.jvnx[42] = -1280251201;
        me.jvnx[43] = -2137750398;
        me.jvnx[44] = 1353360006;
        me.jvnx[45] = 922254009;
        me.jvnx[46] = -1659887800;
        me.jvnx[47] = 434758686;
        me.jvnx[48] = 585667828;
        me.jvnx[49] = -53245765;
        me.jvnx[50] = 982610937;
        me.jvnx[51] = 225213831;
        me.jvnx[52] = 287698747;
        me.jvnx[53] = 570747688;
        me.jvnx[54] = -1387166401;
        me.jvnx[55] = 1444885245;
        me.jvnx[56] = 1847269750;
        me.jvnx[57] = -48884243;
        me.jvnx[58] = 990911873;
        me.jvnx[59] = -451162298;
        me.jvnx[60] = 1701831218;
        me.jvnx[61] = -1428564764;
        me.jvnx[62] = -2035448043;
        me.jvnx[63] = 2124002927;
        me.jvnx[64] = -137676555;
        me.jvnx[65] = 1049188544;
        me.jvnx[66] = 662140224;
        me.jvnx[67] = 433400845;
        me.jvnx[68] = 773462173;
        me.jvnx[69] = 1040647977;
        me.jvnx[70] = 98304836;
        me.jvnx[71] = -1910595876;
        me.jvnx[72] = -129289753;
        me.jvnx[73] = -1418259248;
        me.jvnx[74] = 311193773;
        me.jvnx[75] = -1444179283;
        me.jvnx[76] = -1182651899;
        me.jvnx[77] = 1910122767;
        me.jvnx[78] = -947873804;
        me.jvnx[79] = -1841754283;
        me.jvnx[80] = 547259829;
        me.jvnx[81] = 39228884;
        me.jvnx[82] = -1276686234;
        me.jvnx[83] = 53067530;
        me.jvnx[84] = -182481650;
        me.jvnx[85] = 2141249073;
        me.jvnx[86] = -601936570;
        me.jvnx[87] = -1396173400;
        me.jvnx[88] = -416299452;
        me.jvnx[89] = 884775617;
        me.jvnx[90] = 1754681995;
        me.jvnx[91] = 41364391;
        me.jvnx[92] = -80228294;
        me.jvnx[93] = -1067779986;
        me.jvnx[94] = 1629966344;
        me.jvnx[95] = -551341276;
        me.jvnx[96] = -1358841969;
        me.jvnx[97] = 1454134167;
        me.jvnx[98] = -1586219311;
        me.jvnx[99] = -169041688;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float easeInCubic(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = me.rx - me.jvoa("jxej", jvop(int ), (int)152)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == me.jvoa("jxel", jvnw(int ), (int)511)) break;
            v0 /* !! */  = (long)me.jvoa("jxen", jvnw(int ), (int)512);
        }
        var5_2 = me.c;
        v1 /* !! */  = me.rx;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - me.jvoa("jxeo", jvop(int ), (int)153));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1168015738: {
                    v2 = me.jvoa("jxeq", jvop(int ), (int)154);
                    continue block19;
                }
                case -1075994173: {
                    v2 = me.jvoa("jxes", jvop(int ), (int)155);
                    continue block19;
                }
                case -381550121: {
                    break block19;
                }
                case 1011419918: {
                    v2 = me.jvoa("jxeu", jvop(int ), (int)156);
                    continue block19;
                }
            }
            break;
        }
        var4_3 /* !! */  = me.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = me.rx - me.jvoa("jxew", jvop(int ), (int)157)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == me.jvoa("jxex", jvnw(int ), (int)513)) break;
            v3 /* !! */  = (long)me.jvoa("jxez", jvnw(int ), (int)514);
        }
        var3_4 = me.a;
        if (var5_2) {
            throw null;
lbl34:
            // 3 sources

            return (float)me.jvoa("jxfb", jvqu(int ), (int)515);
        }
        if (var3_4 || var3_4) ** GOTO lbl34
        v4 /* !! */  = me.rx;
        if (true) ** GOTO lbl41
        block22: while (true) {
            v4 /* !! */  = (long)(me.jvoa("jxff", jvop(int ), (int)159) - me.jvoa("jxfd", jvop(int ), (int)158));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -381550121: {
                    break block22;
                }
                case 909630648: {
                    continue block22;
                }
            }
            break;
        }
        var2_5 = this.clamp01(var1_1);
        if (var3_4) ** GOTO lbl34
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var3_4) ** break;
                ** continue;
                return var2_5 * var2_5 * var2_5;
            }
            case 0: {
                var4_3 /* !! */  = (int)me.jvoa("jxfh", jvnw(int ), (int)516);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl64
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)me.jvoa("jxfj", jvnw(int ), (int)517);
                    if (!var5_2) break block10;
                    throw null;
                }
            }
lbl64:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)me.jvoa("jxfl", jvnw(int ), (int)518);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl73
            }
            case 3: {
                var4_3 /* !! */  = (int)me.jvoa("jxfo", jvnw(int ), (int)519);
                if (!var5_2) break;
                throw null;
            }
lbl73:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)me.jvoa("jxfq", jvnw(int ), (int)520);
                if (!var5_2) break;
                throw null;
            }
            case 5: 
        }
        var4_3 /* !! */  = (int)me.jvoa("jxfr", jvnw(int ), (int)521);
        ** while (!var5_2)
lbl80:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jxkk() {
        me.jvnx[500] = 1734896723;
        me.jvnx[501] = -2098277832;
        me.jvnx[502] = 656987847;
        me.jvnx[503] = 1891218580;
        me.jvnx[504] = 1776154365;
        me.jvnx[505] = 243471600;
        me.jvnx[506] = 2112383889;
        me.jvnx[507] = -1761915583;
        me.jvnx[508] = -1842388073;
        me.jvnx[509] = -1886741650;
        me.jvnx[510] = -780269078;
        me.jvnx[511] = 1282615777;
        me.jvnx[512] = -604815105;
        me.jvnx[513] = -1105096463;
        me.jvnx[514] = 1167598341;
        me.jvnx[515] = 363256472;
        me.jvnx[516] = 1296712313;
        me.jvnx[517] = 1575094882;
        me.jvnx[518] = 1203901187;
        me.jvnx[519] = 833264763;
        me.jvnx[520] = 604521332;
        me.jvnx[521] = -2029747653;
        me.jvnx[522] = -1935625806;
        me.jvnx[523] = 1435086827;
        me.jvnx[524] = 1826298715;
        me.jvnx[525] = 536598381;
        me.jvnx[526] = -1098291469;
        me.jvnx[527] = -679467285;
        me.jvnx[528] = -2055328591;
        me.jvnx[529] = -1604858212;
        me.jvnx[530] = -1582217573;
        me.jvnx[531] = -1822790349;
        me.jvnx[532] = 1383867831;
        me.jvnx[533] = 1783737982;
        me.jvnx[534] = -1221802782;
        me.jvnx[535] = -1274887119;
        me.jvnx[536] = -554894495;
        me.jvnx[537] = -1792199813;
        me.jvnx[538] = 718615194;
        me.jvnx[539] = 1638046078;
        me.jvnx[540] = -458795671;
        me.jvnx[541] = 645007082;
        me.jvnx[542] = 1298888811;
        me.jvnx[543] = 1001006782;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void drawHint(class_332 var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
        block65: {
            block64: {
                v0 /* !! */  = me.rx;
                if (true) ** GOTO lbl5
                block42: while (true) {
                    v0 /* !! */  = (long)(v1 - me.jvoa("jwko", jvop(int ), (int)80));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1946621852: {
                            v1 = me.jvoa("jwkq", jvop(int ), (int)81);
                            continue block42;
                        }
                        case -1177941420: {
                            v1 = me.jvoa("jwkr", jvop(int ), (int)82);
                            continue block42;
                        }
                        case -381550121: {
                            break block42;
                        }
                        case -37763595: {
                            v1 = me.jvoa("jwks", jvop(int ), (int)83);
                            continue block42;
                        }
                    }
                    break;
                }
                var8_6 = me.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = me.rx - me.jvoa("jwkt", jvop(int ), (int)84)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == me.jvoa("jwkv", jvnw(int ), (int)299)) break;
                    v2 /* !! */  = (long)me.jvoa("jwkw", jvnw(int ), (int)300);
                }
                var7_7 /* !! */  = me.b;
                v3 /* !! */  = me.rx;
                if (true) ** GOTO lbl28
                block44: while (true) {
                    v3 /* !! */  = (long)(v4 - me.jvoa("jwkx", jvop(int ), (int)85));
lbl28:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -381550121: {
                            break block44;
                        }
                        case 890102719: {
                            v4 = me.jvoa("jwky", jvop(int ), (int)86);
                            continue block44;
                        }
                        case 2016100500: {
                            v4 = me.jvoa("jwla", jvop(int ), (int)87);
                            continue block44;
                        }
                    }
                    break;
                }
                var6_8 = me.a;
                if (var8_6) {
                    throw null;
lbl40:
                    // 6 sources

                    return;
                }
                if (var6_8 || var6_8) ** GOTO lbl40
                v5 /* !! */  = me.rx;
                if (true) ** GOTO lbl47
                block46: while (true) {
                    v5 /* !! */  = (long)(v6 - me.jvoa("jwlb", jvop(int ), (int)88));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1914846971: {
                            v6 = me.jvoa("jwld", jvop(int ), (int)89);
                            continue block46;
                        }
                        case -1184332557: {
                            v6 = me.jvoa("jwle", jvop(int ), (int)90);
                            continue block46;
                        }
                        case -711469588: {
                            v6 = me.jvoa("jwlf", jvop(int ), (int)91);
                            continue block46;
                        }
                        case -381550121: {
                            break block46;
                        }
                    }
                    break;
                }
                if (!kq.hasFonts()) break block64;
                if (var6_8) ** GOTO lbl40
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = me.rx - me.jvoa("jwlg", jvop(int ), (int)92)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == me.jvoa("jwli", jvnw(int ), (int)301)) break;
                    v7 /* !! */  = (long)me.jvoa("jwlj", jvnw(int ), (int)302);
                }
                if (kv.BOLD != null) break block65;
                if (var6_8) ** GOTO lbl40
            }
            if (var6_8 || var6_8) ** GOTO lbl40
            return;
        }
        if (var6_8 || var6_8) ** GOTO lbl40
        v8 = var3_3 + var4_4 / 2.0f + me.jvoa("jwll", jvqu(int ), (int)303);
        v9 = me.jvoa("jwlm", jvqu(int ), (int)304);
        v10 = me.jvoa("jwln", jvnw(int ), (int)305);
        v11 = me.jvoa("jwlp", jvnw(int ), (int)306);
        v12 = me.jvoa("jwlq", jvnw(int ), (int)307);
        v13 = me.jvoa("jwlr", jvnw(int ), (int)308);
        v14 /* !! */  = me.rx;
        if (true) ** GOTO lbl83
        block48: while (true) {
            v14 /* !! */  = (long)(v15 - me.jvoa("jwls", jvop(int ), (int)93));
lbl83:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -885227322: {
                    v15 = me.jvoa("jwlu", jvop(int ), (int)94);
                    continue block48;
                }
                case -720841220: {
                    v15 = me.jvoa("jwlv", jvop(int ), (int)95);
                    continue block48;
                }
                case -381550121: {
                    break block48;
                }
                case 2145807659: {
                    v15 = me.jvoa("jwly", jvop(int ), (int)96);
                    continue block48;
                }
            }
            break;
        }
        v16 = nd.rgba((int)v10, (int)v11, (int)v12, (int)v13);
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_2 = me.rx - me.jvoa("jwma", jvop(int ), (int)97)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == me.jvoa("jwmb", jvnw(int ), (int)309)) break;
            v17 /* !! */  = (long)me.jvoa("jwmc", jvnw(int ), (int)310);
        }
        v18 = nd.multAlpha(v16, var5_5);
        v19 /* !! */  = me.rx;
        if (true) ** GOTO lbl106
        block50: while (true) {
            v19 /* !! */  = (long)(me.jvoa("jwmf", jvop(int ), (int)99) - me.jvoa("jwmd", jvop(int ), (int)98));
lbl106:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -381550121: {
                    break block50;
                }
                case 1865389696: {
                    continue block50;
                }
            }
            break;
        }
        this.centeredText(var1_1, "\u041b\u041a\u041c \u2014 \u0432\u044b\u0431\u0440\u0430\u0442\u044c / \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c    \u041f\u041a\u041c \u2014 \u043e\u0447\u0438\u0441\u0442\u0438\u0442\u044c", var2_2, v8, (float)v9, v18);
        if (var7_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var6_8 && !var6_8) ** break;
                ** continue;
                return;
            }
            case 0: {
                var7_7 /* !! */  = (int)me.jvoa("jwmg", jvnw(int ), (int)311);
                if (var8_6) {
                    throw null;
                }
                ** GOTO lbl137
            }
            case 1: {
                var7_7 /* !! */  = (int)me.jvoa("jwmi", jvnw(int ), (int)312);
                if (var8_6) {
                    throw null;
                }
            }
            case 2: {
                var7_7 /* !! */  = (int)me.jvoa("jwmj", jvnw(int ), (int)313);
                if (var8_6) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl132:
            // 2 sources

            case 3: {
                var7_7 /* !! */  = (int)me.jvoa("jwml", jvnw(int ), (int)314);
                if (var8_6) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl137:
            // 2 sources

            case 4: {
                var7_7 /* !! */  = (int)me.jvoa("jwmm", jvnw(int ), (int)315);
                if (var8_6) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl142:
            // 3 sources

            case 5: {
                var7_7 /* !! */  = (int)me.jvoa("jwmn", jvnw(int ), (int)316);
                if (var8_6) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 6: {
                var7_7 /* !! */  = (int)me.jvoa("jwmo", jvnw(int ), (int)317);
                if (!var8_6) ** GOTO lbl142
                throw null;
            }
            case 7: {
                var7_7 /* !! */  = (int)me.jvoa("jwmp", jvnw(int ), (int)318);
                if (var8_6) {
                    throw null;
                }
            }
lbl155:
            // 5 sources

            case 8: {
                var7_7 /* !! */  = (int)me.jvoa("jwmr", jvnw(int ), (int)319);
                if (var8_6) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 9: {
                var7_7 /* !! */  = (int)me.jvoa("jwms", jvnw(int ), (int)320);
                if (!var8_6) ** GOTO lbl155
                throw null;
            }
lbl164:
            // 3 sources

            case 10: {
                var7_7 /* !! */  = (int)me.jvoa("jwmu", jvnw(int ), (int)321);
                if (!var8_6) ** GOTO lbl132
                throw null;
            }
lbl168:
            // 3 sources

            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_7 /* !! */  = (int)me.jvoa("jwmv", jvnw(int ), (int)322);
                    if (!var8_6) ** GOTO lbl142
                    throw null;
                }
            }
            case 12: 
        }
        var7_7 /* !! */  = (int)me.jvoa("jwmw", jvnw(int ), (int)323);
        ** while (!var8_6)
lbl176:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jxlm() {
        me.jvnz[500] = -1734896724;
        me.jvnz[501] = -1838302615;
        me.jvnz[502] = 434650021;
        me.jvnz[503] = -1891218581;
        me.jvnz[504] = 1075600345;
        me.jvnz[505] = 243471601;
        me.jvnz[506] = 2112383889;
        me.jvnz[507] = -1761915582;
        me.jvnz[508] = -1842388076;
        me.jvnz[509] = -1886741650;
        me.jvnz[510] = -780269073;
        me.jvnz[511] = -1282615778;
        me.jvnz[512] = 1048270292;
        me.jvnz[513] = 1105096462;
        me.jvnz[514] = 1947535736;
        me.jvnz[515] = 698311640;
        me.jvnz[516] = 1296712312;
        me.jvnz[517] = 1575094883;
        me.jvnz[518] = 1203901186;
        me.jvnz[519] = 833264766;
        me.jvnz[520] = 604521332;
        me.jvnz[521] = -2029747656;
        me.jvnz[522] = -1278144308;
        me.jvnz[523] = 1783653003;
        me.jvnz[524] = 1826298714;
        me.jvnz[525] = 536598380;
        me.jvnz[526] = -1098291467;
        me.jvnz[527] = -679467294;
        me.jvnz[528] = -2055328590;
        me.jvnz[529] = -1604858218;
        me.jvnz[530] = -1582217576;
        me.jvnz[531] = -1822790349;
        me.jvnz[532] = 1383867827;
        me.jvnz[533] = 1783737972;
        me.jvnz[534] = -1221802780;
        me.jvnz[535] = -1274887113;
        me.jvnz[536] = -1673987231;
        me.jvnz[537] = 1792199812;
        me.jvnz[538] = 487225209;
        me.jvnz[539] = 1638046076;
        me.jvnz[540] = -458795669;
        me.jvnz[541] = 645007082;
        me.jvnz[542] = 1298888810;
        me.jvnz[543] = 1001006782;
    }

    private static /* synthetic */ void jxmi() {
        me.jvor[0] = 689816598581108488L;
        me.jvor[1] = 3539471164030473531L;
        me.jvor[2] = 8244162262567032609L;
        me.jvor[3] = 5349052720367108079L;
        me.jvor[4] = 758308591805147185L;
        me.jvor[5] = 1442947777059710694L;
        me.jvor[6] = 872557775619421824L;
        me.jvor[7] = -4541079208821687629L;
        me.jvor[8] = 5269958352752569344L;
        me.jvor[9] = 3232882956061425054L;
        me.jvor[10] = -7238804862936597133L;
        me.jvor[11] = 8559515307787014389L;
        me.jvor[12] = 5560744490040759372L;
        me.jvor[13] = -6790678208952654994L;
        me.jvor[14] = -4445637233149214449L;
        me.jvor[15] = 6909051735619548559L;
        me.jvor[16] = -3903652921247789031L;
        me.jvor[17] = 4014185351687613033L;
        me.jvor[18] = -1477042967635418627L;
        me.jvor[19] = 7923368650063541773L;
        me.jvor[20] = 7426461018073957330L;
        me.jvor[21] = 1014638664570743102L;
        me.jvor[22] = 921296777667137316L;
        me.jvor[23] = 8859226365747607366L;
        me.jvor[24] = 2064135217734783367L;
        me.jvor[25] = -9098685977859183651L;
        me.jvor[26] = -5905066656032074693L;
        me.jvor[27] = 4139479467390265229L;
        me.jvor[28] = 1919570193209618462L;
        me.jvor[29] = -305770345476550190L;
        me.jvor[30] = -7450252347759336564L;
        me.jvor[31] = 4224242135133624811L;
        me.jvor[32] = 1301599768311166242L;
        me.jvor[33] = 6917682151246508093L;
        me.jvor[34] = -6731384204821007931L;
        me.jvor[35] = -2517988460110920739L;
        me.jvor[36] = 5240810991789283118L;
        me.jvor[37] = -2010190451093450020L;
        me.jvor[38] = -3677866761982772530L;
        me.jvor[39] = -2590511695104961982L;
        me.jvor[40] = -2507681924391158380L;
        me.jvor[41] = -5230765134201432453L;
        me.jvor[42] = -294117676846124009L;
        me.jvor[43] = -3075899051611682969L;
        me.jvor[44] = 8855856712984809056L;
        me.jvor[45] = 7900464317952488860L;
        me.jvor[46] = -2400577714320742475L;
        me.jvor[47] = -1334140843267137054L;
        me.jvor[48] = -6572808497220583717L;
        me.jvor[49] = -7223000510627551804L;
        me.jvor[50] = 7871293994847526210L;
        me.jvor[51] = -1737770793984266548L;
        me.jvor[52] = -2014598285256413899L;
        me.jvor[53] = 5469982018148983862L;
        me.jvor[54] = -8117470456821941593L;
        me.jvor[55] = 6822038038497378334L;
        me.jvor[56] = -2206138317793049254L;
        me.jvor[57] = -4318812667598588876L;
        me.jvor[58] = -3917416352848221869L;
        me.jvor[59] = -8052547293693909400L;
        me.jvor[60] = 8794348336288155881L;
        me.jvor[61] = -5320727461193201612L;
        me.jvor[62] = 3318636810952525692L;
        me.jvor[63] = 2645452792130578960L;
        me.jvor[64] = 4875384670080330375L;
        me.jvor[65] = -1373387391256729108L;
        me.jvor[66] = 5202418853604970993L;
        me.jvor[67] = 7061666788929837104L;
        me.jvor[68] = 1178322456915736076L;
        me.jvor[69] = -1417980771550147347L;
        me.jvor[70] = -4899425993020791366L;
        me.jvor[71] = 9143849972205789285L;
        me.jvor[72] = -5004486658062538645L;
        me.jvor[73] = -4309457876042437251L;
        me.jvor[74] = 44493603992917933L;
        me.jvor[75] = 2267823696376676559L;
        me.jvor[76] = 5600247280983161074L;
        me.jvor[77] = -3236485821926993385L;
        me.jvor[78] = -5418851013829005419L;
        me.jvor[79] = 1149489438371826463L;
        me.jvor[80] = 6248318771625613933L;
        me.jvor[81] = -2467183671602337586L;
        me.jvor[82] = -1463666597266329462L;
        me.jvor[83] = 8251076819166721286L;
        me.jvor[84] = 5975497956825885308L;
        me.jvor[85] = 6213819948367119622L;
        me.jvor[86] = -5500463970340634477L;
        me.jvor[87] = -6512966709809936260L;
        me.jvor[88] = 3416691202983641898L;
        me.jvor[89] = 4827973644332051061L;
        me.jvor[90] = -2157878625754031344L;
        me.jvor[91] = -7859747636213131586L;
        me.jvor[92] = 7413417462016904007L;
        me.jvor[93] = 1193051618668237768L;
        me.jvor[94] = -3390435239176924701L;
        me.jvor[95] = -5522555558822855924L;
        me.jvor[96] = -8745782497410278055L;
        me.jvor[97] = -2761515557905743425L;
        me.jvor[98] = 5451253421132661502L;
        me.jvor[99] = 2324973589432931030L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void drawSlotContent(class_332 var1_1, int var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7) {
        var20_8 = me.c;
        var19_9 /* !! */  = me.b;
        var18_10 = me.a;
        if (var20_8) {
            throw null;
lbl6:
            // 24 sources

            return;
        }
        if (var18_10 || var18_10) ** GOTO lbl6
        var8_11 = Math.toRadians(me.SECTOR_CENTER_ANGLES[var2_2]);
        if (var18_10 || var18_10) ** GOTO lbl6
        var10_12 = var5_5 / 2.0f - var6_6 / 2.0f;
        if (var18_10 || var18_10) ** GOTO lbl6
        var11_13 = var3_3 + (float)Math.cos(var8_11) * var10_12;
        if (var18_10) ** GOTO lbl6
        if (var19_9 /* !! */  == 0) ** GOTO lbl-1000
        switch (var19_9 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var18_10) ** GOTO lbl6
                var12_14 = var4_4 + (float)Math.sin(var8_11) * var10_12;
                if (var18_10 || var18_10) ** GOTO lbl6
                var13_15 = this.helper.getSelectedPotion(var2_2);
                if (var18_10 || var18_10) ** GOTO lbl6
                if (!var13_15.method_7960()) ** GOTO lbl41
                if (var18_10 || var18_10) ** GOTO lbl6
                if (!kq.hasFonts()) ** GOTO lbl39
                if (var18_10) ** GOTO lbl6
                if (kv.BOLD == null) ** GOTO lbl39
                if (var18_10 || var18_10) ** GOTO lbl6
                v0 = var12_14 - me.jvoa("jwnb", jvqu(int ), (int)324) * this.visualScale;
                v1 = me.jvoa("jwnd", jvqu(int ), (int)325) * this.visualScale;
                if (var2_2 == this.hoveredSlot) {
                    v2 = nd.rgba((int)me.jvoa("jwne", jvnw(int ), (int)326), (int)me.jvoa("jwnf", jvnw(int ), (int)327), (int)me.jvoa("jwng", jvnw(int ), (int)328), (int)me.jvoa("jwnh", jvnw(int ), (int)329));
                    if (var20_8) {
                        throw null;
                    }
                } else {
                    v2 = nd.rgba((int)me.jvoa("jwnj", jvnw(int ), (int)330), (int)me.jvoa("jwnk", jvnw(int ), (int)331), (int)me.jvoa("jwnl", jvnw(int ), (int)332), (int)me.jvoa("jwnm", jvnw(int ), (int)333));
                }
                this.centeredText(var1_1, "+", var11_13, v0, (float)v1, nd.multAlpha(v2, var7_7));
                if (var18_10) ** GOTO lbl6
lbl39:
                // 3 sources

                if (var18_10 || var18_10) ** GOTO lbl6
                return;
lbl41:
                // 1 sources

                if (var18_10 || var18_10) ** GOTO lbl6
                if (!(var7_7 < me.jvoa("jwno", jvqu(int ), (int)334))) ** GOTO lbl45
                if (var18_10) ** GOTO lbl6
                return;
lbl45:
                // 1 sources

                if (var18_10 || var18_10) ** GOTO lbl6
                var14_16 = me.jvoa("jwnp", jvqu(int ), (int)335) * this.visualScale;
                if (var18_10 || var18_10) ** GOTO lbl6
                var15_17 = Math.max((float)me.jvoa("jwnr", jvqu(int ), (int)336), ki.getScaleFactor());
                if (var18_10 || var18_10) ** GOTO lbl6
                var16_18 = var14_16 / var15_17;
                if (var18_10 || var18_10) ** GOTO lbl6
                var17_19 = var1_1.method_51448();
                if (var18_10 || var18_10) ** GOTO lbl6
                var17_19.pushMatrix();
                if (var18_10 || var18_10) ** GOTO lbl6
                var17_19.translate(var11_13 / var15_17 - var16_18 / 2.0f, var12_14 / var15_17 - var16_18 / 2.0f);
                if (var18_10 || var18_10) ** GOTO lbl6
                var17_19.scale((float)(var16_18 / me.jvoa("jwnu", jvqu(int ), (int)337)), (float)(var16_18 / me.jvoa("jwnv", jvqu(int ), (int)338)));
                if (var18_10 || var18_10) ** GOTO lbl6
                var1_1.method_51427(var13_15, (int)me.jvoa("jwnx", jvnw(int ), (int)339), (int)me.jvoa("jwny", jvnw(int ), (int)340));
                if (var18_10 || var18_10) ** GOTO lbl6
                var17_19.popMatrix();
                if (!var18_10 && !var18_10) ** break;
                ** continue;
                return;
            }
            case 0: {
                var19_9 /* !! */  = (int)me.jvoa("jwnz", jvnw(int ), (int)341);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl224
            }
            case 1: {
                var19_9 /* !! */  = (int)me.jvoa("jwob", jvnw(int ), (int)342);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 2: {
                var19_9 /* !! */  = (int)me.jvoa("jwoc", jvnw(int ), (int)343);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl85:
            // 3 sources

            case 3: {
                var19_9 /* !! */  = (int)me.jvoa("jwoe", jvnw(int ), (int)344);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl90:
            // 2 sources

            case 4: {
                var19_9 /* !! */  = (int)me.jvoa("jwof", jvnw(int ), (int)345);
                if (!var20_8) ** GOTO lbl85
                throw null;
            }
lbl94:
            // 3 sources

            case 5: {
                var19_9 /* !! */  = (int)me.jvoa("jwog", jvnw(int ), (int)346);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl167
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var19_9 /* !! */  = (int)me.jvoa("jwoi", jvnw(int ), (int)347);
                    if (var20_8) {
                        throw null;
                    }
                    ** GOTO lbl127
                    break;
                }
            }
lbl105:
            // 3 sources

            case 7: {
                var19_9 /* !! */  = (int)me.jvoa("jwoj", jvnw(int ), (int)348);
                if (!var20_8) ** GOTO lbl85
                throw null;
            }
lbl109:
            // 3 sources

            case 8: {
                var19_9 /* !! */  = (int)me.jvoa("jwok", jvnw(int ), (int)349);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl114:
            // 2 sources

            case 9: {
                var19_9 /* !! */  = (int)me.jvoa("jwom", jvnw(int ), (int)350);
                if (!var20_8) ** GOTO lbl109
                throw null;
            }
            case 10: {
                var19_9 /* !! */  = (int)me.jvoa("jwon", jvnw(int ), (int)351);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl123:
            // 2 sources

            case 11: {
                var19_9 /* !! */  = (int)me.jvoa("jwop", jvnw(int ), (int)352);
                if (!var20_8) ** GOTO lbl105
                throw null;
            }
lbl127:
            // 4 sources

            case 12: {
                var19_9 /* !! */  = (int)me.jvoa("jwoq", jvnw(int ), (int)353);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl216
            }
            case 13: {
                var19_9 /* !! */  = (int)me.jvoa("jwos", jvnw(int ), (int)354);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl137:
            // 2 sources

            case 14: {
                var19_9 /* !! */  = (int)me.jvoa("jwot", jvnw(int ), (int)355);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 15: {
                var19_9 /* !! */  = (int)me.jvoa("jwou", jvnw(int ), (int)356);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl248
            }
            case 16: {
                var19_9 /* !! */  = (int)me.jvoa("jwow", jvnw(int ), (int)357);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl270
            }
lbl152:
            // 2 sources

            case 17: {
                var19_9 /* !! */  = (int)me.jvoa("jwox", jvnw(int ), (int)358);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl157:
            // 2 sources

            case 18: {
                var19_9 /* !! */  = (int)me.jvoa("jwoy", jvnw(int ), (int)359);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl162:
            // 2 sources

            case 19: {
                var19_9 /* !! */  = (int)me.jvoa("jwpa", jvnw(int ), (int)360);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl200
            }
lbl167:
            // 3 sources

            case 20: {
                var19_9 /* !! */  = (int)me.jvoa("jwpb", jvnw(int ), (int)361);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl220
            }
            case 21: {
                var19_9 /* !! */  = (int)me.jvoa("jwpd", jvnw(int ), (int)362);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl270
            }
            case 22: {
                var19_9 /* !! */  = (int)me.jvoa("jwpe", jvnw(int ), (int)363);
                if (!var20_8) ** GOTO lbl105
                throw null;
            }
            case 23: {
                var19_9 /* !! */  = (int)me.jvoa("jwpg", jvnw(int ), (int)364);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl186:
            // 2 sources

            case 24: {
                do {
                    var19_9 /* !! */  = (int)me.jvoa("jwph", jvnw(int ), (int)365);
                } while (!var20_8);
                throw null;
            }
lbl191:
            // 3 sources

            case 25: {
                var19_9 /* !! */  = (int)me.jvoa("jwpj", jvnw(int ), (int)366);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl196:
            // 2 sources

            case 26: {
                var19_9 /* !! */  = (int)me.jvoa("jwpk", jvnw(int ), (int)367);
                if (!var20_8) ** GOTO lbl191
                throw null;
            }
lbl200:
            // 2 sources

            case 27: {
                var19_9 /* !! */  = (int)me.jvoa("jwpl", jvnw(int ), (int)368);
                if (!var20_8) ** GOTO lbl157
                throw null;
            }
lbl204:
            // 4 sources

            case 28: {
                var19_9 /* !! */  = (int)me.jvoa("jwpn", jvnw(int ), (int)369);
                if (!var20_8) ** GOTO lbl94
                throw null;
            }
            case 29: {
                var19_9 /* !! */  = (int)me.jvoa("jwpo", jvnw(int ), (int)370);
                if (!var20_8) ** GOTO lbl127
                throw null;
            }
lbl212:
            // 3 sources

            case 30: {
                var19_9 /* !! */  = (int)me.jvoa("jwpq", jvnw(int ), (int)371);
                if (!var20_8) ** GOTO lbl114
                throw null;
            }
lbl216:
            // 2 sources

            case 31: {
                var19_9 /* !! */  = (int)me.jvoa("jwpr", jvnw(int ), (int)372);
                if (!var20_8) ** GOTO lbl90
                throw null;
            }
lbl220:
            // 3 sources

            case 32: {
                var19_9 /* !! */  = (int)me.jvoa("jwpt", jvnw(int ), (int)373);
                if (!var20_8) ** GOTO lbl127
                throw null;
            }
lbl224:
            // 3 sources

            case 33: {
                var19_9 /* !! */  = (int)me.jvoa("jwpu", jvnw(int ), (int)374);
                if (!var20_8) ** GOTO lbl162
                throw null;
            }
            case 34: {
                var19_9 /* !! */  = (int)me.jvoa("jwpw", jvnw(int ), (int)375);
                if (!var20_8) ** GOTO lbl204
                throw null;
            }
lbl232:
            // 2 sources

            case 35: {
                var19_9 /* !! */  = (int)me.jvoa("jwpx", jvnw(int ), (int)376);
                if (!var20_8) ** GOTO lbl152
                throw null;
            }
lbl236:
            // 3 sources

            case 36: {
                var19_9 /* !! */  = (int)me.jvoa("jwpy", jvnw(int ), (int)377);
                if (!var20_8) ** GOTO lbl191
                throw null;
            }
            case 37: {
                var19_9 /* !! */  = (int)me.jvoa("jwpz", jvnw(int ), (int)378);
                if (!var20_8) ** GOTO lbl137
                throw null;
            }
            case 38: {
                var19_9 /* !! */  = (int)me.jvoa("jwqc", jvnw(int ), (int)379);
                if (!var20_8) ** GOTO lbl123
                throw null;
            }
lbl248:
            // 2 sources

            case 39: {
                var19_9 /* !! */  = (int)me.jvoa("jwqd", jvnw(int ), (int)380);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 40: {
                var19_9 /* !! */  = (int)me.jvoa("jwqe", jvnw(int ), (int)381);
                if (!var20_8) ** GOTO lbl212
                throw null;
            }
lbl257:
            // 3 sources

            case 41: {
                do {
                    var19_9 /* !! */  = (int)me.jvoa("jwqf", jvnw(int ), (int)382);
                } while (!var20_8);
                throw null;
            }
            case 42: {
                var19_9 /* !! */  = (int)me.jvoa("jwqg", jvnw(int ), (int)383);
                if (!var20_8) ** GOTO lbl232
                throw null;
            }
            case 43: {
                var19_9 /* !! */  = (int)me.jvoa("jwqw", jvnw(int ), (int)384);
                if (!var20_8) ** GOTO lbl94
                throw null;
            }
lbl270:
            // 3 sources

            case 44: {
                var19_9 /* !! */  = (int)me.jvoa("jwqx", jvnw(int ), (int)385);
                if (!var20_8) ** GOTO lbl109
                throw null;
            }
            case 45: 
        }
        var19_9 /* !! */  = (int)me.jvoa("jwqy", jvnw(int ), (int)386);
        ** while (!var20_8)
lbl277:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float jvqu(int n2) {
        return Float.intBitsToFloat(jvnx[n2] ^ jvnz[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float clamp01(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = me.rx - me.jvoa("jxbr", jvop(int ), (int)135)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == me.jvoa("jxbt", jvnw(int ), (int)489)) break;
            v0 /* !! */  = (long)me.jvoa("jxbu", jvnw(int ), (int)490);
        }
        var4_2 = me.c;
        v1 /* !! */  = me.rx;
        if (true) ** GOTO lbl12
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - me.jvoa("jxbw", jvop(int ), (int)136));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1403892255: {
                    v2 = me.jvoa("jxby", jvop(int ), (int)137);
                    continue block21;
                }
                case -459111681: {
                    v2 = me.jvoa("jxca", jvop(int ), (int)138);
                    continue block21;
                }
                case -381550121: {
                    break block21;
                }
            }
            break;
        }
        var3_3 /* !! */  = me.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = me.rx - me.jvoa("jxcb", jvop(int ), (int)139)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == me.jvoa("jxcd", jvnw(int ), (int)491)) break;
            v3 /* !! */  = (long)me.jvoa("jxcf", jvnw(int ), (int)492);
        }
        var2_4 = me.a;
        if (var4_2) {
            throw null;
            return (float)me.jvoa("jxch", jvqu(int ), (int)493);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                v4 /* !! */  = me.rx;
                if (true) ** GOTO lbl41
                block24: while (true) {
                    v4 /* !! */  = (long)(v5 - me.jvoa("jxck", jvop(int ), (int)140));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1603156849: {
                            v5 = me.jvoa("jxcm", jvop(int ), (int)141);
                            continue block24;
                        }
                        case -780499055: {
                            v5 = me.jvoa("jxco", jvop(int ), (int)142);
                            continue block24;
                        }
                        case -381550121: {
                            break block24;
                        }
                    }
                    break;
                }
                v6 = Math.min(1.0f, var1_1);
                v7 /* !! */  = me.rx;
                if (true) ** GOTO lbl55
                block25: while (true) {
                    v7 /* !! */  = (long)(me.jvoa("jxcr", jvop(int ), (int)144) - me.jvoa("jxcp", jvop(int ), (int)143));
lbl55:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1831181414: {
                            continue block25;
                        }
                        case -381550121: {
                            break block25;
                        }
                    }
                    break;
                }
                return Math.max(0.0f, v6);
            }
lbl61:
            // 2 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)me.jvoa("jxct", jvnw(int ), (int)494);
                } while (!var4_2);
                throw null;
            }
lbl66:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)me.jvoa("jxcw", jvnw(int ), (int)495);
                if (!var4_2) ** GOTO lbl61
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)me.jvoa("jxcx", jvnw(int ), (int)496);
                if (!var4_2) ** GOTO lbl66
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)me.jvoa("jxcz", jvnw(int ), (int)497);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private String slotCaption(int var1_1) {
        block55: {
            v0 /* !! */  = me.rx;
            if (true) ** GOTO lbl5
            block33: while (true) {
                v0 /* !! */  = (long)(v1 - me.jvoa("jwyy", jvop(int ), (int)118));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1157564868: {
                        v1 = me.jvoa("jwyz", jvop(int ), (int)119);
                        continue block33;
                    }
                    case -381550121: {
                        break block33;
                    }
                    case 972747626: {
                        v1 = me.jvoa("jwza", jvop(int ), (int)120);
                        continue block33;
                    }
                    case 1065684784: {
                        v1 = me.jvoa("jwzc", jvop(int ), (int)121);
                        continue block33;
                    }
                }
                break;
            }
            var5_2 = me.c;
            v2 /* !! */  = me.rx;
            if (true) ** GOTO lbl22
            block34: while (true) {
                v2 /* !! */  = (long)(v3 - me.jvoa("jwzf", jvop(int ), (int)122));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -381550121: {
                        break block34;
                    }
                    case 1129508670: {
                        v3 = me.jvoa("jwzh", jvop(int ), (int)123);
                        continue block34;
                    }
                    case 1776405382: {
                        v3 = me.jvoa("jwzj", jvop(int ), (int)124);
                        continue block34;
                    }
                }
                break;
            }
            var4_3 /* !! */  = me.b;
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_0 = me.rx - me.jvoa("jwzl", jvop(int ), (int)125)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == me.jvoa("jwzn", jvnw(int ), (int)471)) break;
                v4 /* !! */  = (long)me.jvoa("jwzp", jvnw(int ), (int)472);
            }
            var3_4 = me.a;
            if (var5_2) {
                throw null;
lbl40:
                // 5 sources

                return null;
            }
            if (var3_4 || var3_4) ** GOTO lbl40
            v5 /* !! */  = me.rx;
            if (true) ** GOTO lbl47
            block37: while (true) {
                v5 /* !! */  = (long)(v6 - me.jvoa("jwzr", jvop(int ), (int)126));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -381550121: {
                        break block37;
                    }
                    case 766279853: {
                        v6 = me.jvoa("jwzt", jvop(int ), (int)127);
                        continue block37;
                    }
                    case 967942405: {
                        v6 = me.jvoa("jwzv", jvop(int ), (int)128);
                        continue block37;
                    }
                    case 1892709971: {
                        v6 = me.jvoa("jwzx", jvop(int ), (int)129);
                        continue block37;
                    }
                }
                break;
            }
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_1 = me.rx - me.jvoa("jwzz", jvop(int ), (int)130)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == me.jvoa("jxac", jvnw(int ), (int)473)) break;
                v7 /* !! */  = (long)me.jvoa("jxae", jvnw(int ), (int)474);
            }
            var2_5 = this.helper.getSelectedPotion(var1_1);
            if (var3_4 || var3_4) ** GOTO lbl40
            v8 /* !! */  = me.rx;
            if (true) ** GOTO lbl70
            block39: while (true) {
                v8 /* !! */  = (long)(me.jvoa("jxaj", jvop(int ), (int)132) - me.jvoa("jxah", jvop(int ), (int)131));
lbl70:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -889378032: {
                        continue block39;
                    }
                    case -381550121: {
                        break block39;
                    }
                }
                break;
            }
            if (!var2_5.method_7960()) break block55;
            if (var3_4) ** GOTO lbl40
            v9 = "\u0412\u044b\u0431\u0440\u0430\u0442\u044c \u0431\u0430\u0444";
            if (var5_2) {
                throw null;
            }
            ** GOTO lbl101
        }
        if (var3_4) ** GOTO lbl40
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var3_4) ** break;
                ** continue;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = me.rx - me.jvoa("jxan", jvop(int ), (int)133)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == me.jvoa("jxap", jvnw(int ), (int)475)) break;
                    v10 /* !! */  = (long)me.jvoa("jxar", jvnw(int ), (int)476);
                }
                v11 = var2_5.method_7964();
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_3 = me.rx - me.jvoa("jxat", jvop(int ), (int)134)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == me.jvoa("jxav", jvnw(int ), (int)477)) {
                        v9 = v11.getString();
                        break;
                    }
                    v12 /* !! */  = (long)me.jvoa("jxaw", jvnw(int ), (int)478);
                }
lbl101:
                // 2 sources

                return v9;
            }
lbl102:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)me.jvoa("jxay", jvnw(int ), (int)479);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl125
            }
            case 1: {
                var4_3 /* !! */  = (int)me.jvoa("jxba", jvnw(int ), (int)480);
                if (var5_2) {
                    throw null;
                }
            }
lbl111:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)me.jvoa("jxbc", jvnw(int ), (int)481);
                    if (!var5_2) ** GOTO lbl102
                    throw null;
                }
            }
            case 3: {
                var4_3 /* !! */  = (int)me.jvoa("jxbe", jvnw(int ), (int)482);
                if (!var5_2) ** GOTO lbl111
                throw null;
            }
            case 4: {
                var4_3 /* !! */  = (int)me.jvoa("jxbf", jvnw(int ), (int)483);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl125:
            // 3 sources

            case 5: {
                var4_3 /* !! */  = (int)me.jvoa("jxbg", jvnw(int ), (int)484);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl130:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)me.jvoa("jxbi", jvnw(int ), (int)485);
                if (!var5_2) ** GOTO lbl125
                throw null;
            }
lbl134:
            // 2 sources

            case 7: {
                var4_3 /* !! */  = (int)me.jvoa("jxbk", jvnw(int ), (int)486);
                if (!var5_2) ** GOTO lbl130
                throw null;
            }
lbl138:
            // 2 sources

            case 8: {
                do {
                    var4_3 /* !! */  = (int)me.jvoa("jxbl", jvnw(int ), (int)487);
                } while (!var5_2);
                throw null;
            }
            case 9: 
        }
        var4_3 /* !! */  = (int)me.jvoa("jxbm", jvnw(int ), (int)488);
        ** while (!var5_2)
lbl146:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jxko() {
        me.jvnz[0] = -1940772699;
        me.jvnz[1] = 2143812641;
        me.jvnz[2] = -511394892;
        me.jvnz[3] = 2113353513;
        me.jvnz[4] = -236618138;
        me.jvnz[5] = 2023205760;
        me.jvnz[6] = 17227070;
        me.jvnz[7] = 838115279;
        me.jvnz[8] = -1405242363;
        me.jvnz[9] = 1723470216;
        me.jvnz[10] = 1938636829;
        me.jvnz[11] = 151942305;
        me.jvnz[12] = 1212088216;
        me.jvnz[13] = 696331730;
        me.jvnz[14] = -429265797;
        me.jvnz[15] = -1804538840;
        me.jvnz[16] = 60225608;
        me.jvnz[17] = -799789740;
        me.jvnz[18] = 757522695;
        me.jvnz[19] = -1110854303;
        me.jvnz[20] = -1304887895;
        me.jvnz[21] = 1544831324;
        me.jvnz[22] = 852790916;
        me.jvnz[23] = -392628448;
        me.jvnz[24] = -1097204932;
        me.jvnz[25] = 950061160;
        me.jvnz[26] = 971207656;
        me.jvnz[27] = 1619238244;
        me.jvnz[28] = -1203883097;
        me.jvnz[29] = -1209888886;
        me.jvnz[30] = 1634525569;
        me.jvnz[31] = -921565764;
        me.jvnz[32] = 1639320984;
        me.jvnz[33] = 1314196293;
        me.jvnz[34] = 912608230;
        me.jvnz[35] = 1704303936;
        me.jvnz[36] = -1592343779;
        me.jvnz[37] = -581011885;
        me.jvnz[38] = -613057171;
        me.jvnz[39] = 1644242680;
        me.jvnz[40] = 1870541362;
        me.jvnz[41] = -1136355166;
        me.jvnz[42] = -1280251169;
        me.jvnz[43] = -2137750403;
        me.jvnz[44] = 1353360027;
        me.jvnz[45] = 922253984;
        me.jvnz[46] = -1659887762;
        me.jvnz[47] = 434758881;
        me.jvnz[48] = 585667828;
        me.jvnz[49] = -53245768;
        me.jvnz[50] = 982610919;
        me.jvnz[51] = 225213900;
        me.jvnz[52] = 287698694;
        me.jvnz[53] = 570747675;
        me.jvnz[54] = -1387166429;
        me.jvnz[55] = 1444885222;
        me.jvnz[56] = 1847269723;
        me.jvnz[57] = -48884285;
        me.jvnz[58] = 990911939;
        me.jvnz[59] = -451162244;
        me.jvnz[60] = 1701831188;
        me.jvnz[61] = -1428564812;
        me.jvnz[62] = -2035448037;
        me.jvnz[63] = 2124002909;
        me.jvnz[64] = -137676551;
        me.jvnz[65] = 1049188484;
        me.jvnz[66] = 662140270;
        me.jvnz[67] = 433400837;
        me.jvnz[68] = 773462225;
        me.jvnz[69] = 1040647965;
        me.jvnz[70] = 98304860;
        me.jvnz[71] = -1910595843;
        me.jvnz[72] = -129289741;
        me.jvnz[73] = -1418259262;
        me.jvnz[74] = 311193751;
        me.jvnz[75] = -1444179327;
        me.jvnz[76] = -1182651876;
        me.jvnz[77] = 1910122831;
        me.jvnz[78] = -947873827;
        me.jvnz[79] = -1841754270;
        me.jvnz[80] = 547259779;
        me.jvnz[81] = 39228868;
        me.jvnz[82] = -1276686302;
        me.jvnz[83] = 53067566;
        me.jvnz[84] = -182481622;
        me.jvnz[85] = 2141249027;
        me.jvnz[86] = -601936629;
        me.jvnz[87] = -1396173427;
        me.jvnz[88] = -416299401;
        me.jvnz[89] = 884775640;
        me.jvnz[90] = 1754682019;
        me.jvnz[91] = 41364461;
        me.jvnz[92] = -80228349;
        me.jvnz[93] = -1067780038;
        me.jvnz[94] = 1629966408;
        me.jvnz[95] = -551341215;
        me.jvnz[96] = -1358841936;
        me.jvnz[97] = 1454134224;
        me.jvnz[98] = -1586219290;
        me.jvnz[99] = -169041722;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void drawCenterText(class_332 var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
        block68: {
            block67: {
                block66: {
                    block65: {
                        var12_6 = me.c;
                        var11_7 /* !! */  = me.b;
                        var10_8 = me.a;
                        if (var12_6) {
                            throw null;
lbl6:
                            // 16 sources

                            return;
                        }
                        if (var10_8 || var10_8) ** GOTO lbl6
                        if (!kq.hasFonts()) break block65;
                        if (var10_8) ** GOTO lbl6
                        if (kv.BOLD != null) break block66;
                        if (var10_8) ** GOTO lbl6
                    }
                    if (var10_8 || var10_8) ** GOTO lbl6
                    return;
                }
                if (var10_8 || var10_8) ** GOTO lbl6
                var6_9 = me.jvoa("jwgx", jvqu(int ), (int)250) * var5_5;
                if (var10_8 || var10_8) ** GOTO lbl6
                var7_10 = me.jvoa("jwgy", jvqu(int ), (int)251) * var5_5;
                if (var10_8 || var10_8) ** GOTO lbl6
                this.centeredText(var1_1, "BuffHelper", var2_2, var3_3 - me.jvoa("jwha", jvqu(int ), (int)252) * var5_5, (float)var6_9, nd.multAlpha(nd.rgba((int)me.jvoa("jwhb", jvnw(int ), (int)253), (int)me.jvoa("jwhc", jvnw(int ), (int)254), (int)me.jvoa("jwhe", jvnw(int ), (int)255), (int)me.jvoa("jwhf", jvnw(int ), (int)256)), var4_4));
                if (var10_8 || var10_8) ** GOTO lbl6
                if (this.hoveredSlot != me.jvoa("jwhg", jvnw(int ), (int)257)) break block67;
                if (var10_8) ** GOTO lbl6
                v0 = "3 \u0441\u043b\u043e\u0442\u0430";
                if (var12_6) {
                    throw null;
                }
                break block68;
            }
            if (var10_8 || var10_8) ** GOTO lbl6
            v0 = var8_11 = this.slotCaption(this.hoveredSlot);
        }
        if (var10_8) ** GOTO lbl6
        if (var11_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var11_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var10_8) ** GOTO lbl6
                if (this.hoveredSlot != me.jvoa("jwhj", jvnw(int ), (int)258)) ** GOTO lbl45
                if (var10_8 || var10_8) ** GOTO lbl6
                v1 = nd.rgba((int)me.jvoa("jwhk", jvnw(int ), (int)259), (int)me.jvoa("jwhl", jvnw(int ), (int)260), (int)me.jvoa("jwhm", jvnw(int ), (int)261), (int)me.jvoa("jwho", jvnw(int ), (int)262));
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl47
lbl45:
                // 1 sources

                if (var10_8 || var10_8) ** GOTO lbl6
                v1 = var9_12 = nd.rgba((int)me.jvoa("jwhp", jvnw(int ), (int)263), (int)me.jvoa("jwhr", jvnw(int ), (int)264), (int)me.jvoa("jwhs", jvnw(int ), (int)265), (int)me.jvoa("jwht", jvnw(int ), (int)266));
lbl47:
                // 2 sources

                if (var10_8 || var10_8) ** GOTO lbl6
                this.centeredText(var1_1, var8_11, var2_2, var3_3 + me.jvoa("jwhv", jvqu(int ), (int)267) * var5_5, (float)var7_10, nd.multAlpha(var9_12, var4_4));
                if (!var10_8 && !var10_8) ** break;
                ** continue;
                return;
            }
lbl52:
            // 2 sources

            case 0: {
                var11_7 /* !! */  = (int)me.jvoa("jwhw", jvnw(int ), (int)268);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl148
            }
            case 1: {
                var11_7 /* !! */  = (int)me.jvoa("jwhy", jvnw(int ), (int)269);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 2: {
                var11_7 /* !! */  = (int)me.jvoa("jwhz", jvnw(int ), (int)270);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl137
            }
            case 3: {
                var11_7 /* !! */  = (int)me.jvoa("jwib", jvnw(int ), (int)271);
                if (!var12_6) ** GOTO lbl52
                throw null;
            }
lbl71:
            // 2 sources

            case 4: {
                var11_7 /* !! */  = (int)me.jvoa("jwic", jvnw(int ), (int)272);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl76:
            // 3 sources

            case 5: {
                var11_7 /* !! */  = (int)me.jvoa("jwie", jvnw(int ), (int)273);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl91
            }
            case 6: {
                var11_7 /* !! */  = (int)me.jvoa("jwif", jvnw(int ), (int)274);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl86:
            // 2 sources

            case 7: {
                var11_7 /* !! */  = (int)me.jvoa("jwig", jvnw(int ), (int)275);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl91:
            // 2 sources

            case 8: {
                var11_7 /* !! */  = (int)me.jvoa("jwii", jvnw(int ), (int)276);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl137
            }
            case 9: {
                var11_7 /* !! */  = (int)me.jvoa("jwij", jvnw(int ), (int)277);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl128
            }
            case 10: {
                var11_7 /* !! */  = (int)me.jvoa("jwil", jvnw(int ), (int)278);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl106:
            // 2 sources

            case 11: {
                var11_7 /* !! */  = (int)me.jvoa("jwim", jvnw(int ), (int)279);
                if (!var12_6) ** GOTO lbl71
                throw null;
            }
            case 12: {
                var11_7 /* !! */  = (int)me.jvoa("jwio", jvnw(int ), (int)280);
                if (var12_6) {
                    throw null;
                }
            }
            case 13: {
                var11_7 /* !! */  = (int)me.jvoa("jwip", jvnw(int ), (int)281);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl119:
            // 3 sources

            case 14: {
                var11_7 /* !! */  = (int)me.jvoa("jwiz", jvnw(int ), (int)282);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl153
            }
lbl124:
            // 3 sources

            case 15: {
                var11_7 /* !! */  = (int)me.jvoa("jwjb", jvnw(int ), (int)283);
                if (!var12_6) ** GOTO lbl106
                throw null;
            }
lbl128:
            // 3 sources

            case 16: {
                var11_7 /* !! */  = (int)me.jvoa("jwjd", jvnw(int ), (int)284);
                if (!var12_6) ** GOTO lbl124
                throw null;
            }
lbl132:
            // 2 sources

            case 17: {
                var11_7 /* !! */  = (int)me.jvoa("jwjf", jvnw(int ), (int)285);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl137:
            // 4 sources

            case 18: {
                var11_7 /* !! */  = (int)me.jvoa("jwjh", jvnw(int ), (int)286);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl177
            }
            case 19: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var11_7 /* !! */  = (int)me.jvoa("jwjo", jvnw(int ), (int)287);
                    if (var12_6) {
                        throw null;
                    }
                    ** GOTO lbl161
                    break;
                }
            }
lbl148:
            // 4 sources

            case 20: {
                var11_7 /* !! */  = (int)me.jvoa("jwjq", jvnw(int ), (int)288);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl173
            }
lbl153:
            // 2 sources

            case 21: {
                var11_7 /* !! */  = (int)me.jvoa("jwjs", jvnw(int ), (int)289);
                if (!var12_6) ** GOTO lbl119
                throw null;
            }
lbl157:
            // 3 sources

            case 22: {
                var11_7 /* !! */  = (int)me.jvoa("jwju", jvnw(int ), (int)290);
                if (var12_6) {
                    throw null;
                }
            }
lbl161:
            // 4 sources

            case 23: {
                var11_7 /* !! */  = (int)me.jvoa("jwjw", jvnw(int ), (int)291);
                if (!var12_6) ** GOTO lbl124
                throw null;
            }
            case 24: {
                var11_7 /* !! */  = (int)me.jvoa("jwjy", jvnw(int ), (int)292);
                if (!var12_6) ** GOTO lbl119
                throw null;
            }
lbl169:
            // 2 sources

            case 25: {
                var11_7 /* !! */  = (int)me.jvoa("jwka", jvnw(int ), (int)293);
                if (!var12_6) ** GOTO lbl132
                throw null;
            }
lbl173:
            // 2 sources

            case 26: {
                var11_7 /* !! */  = (int)me.jvoa("jwkc", jvnw(int ), (int)294);
                if (!var12_6) ** GOTO lbl76
                throw null;
            }
lbl177:
            // 2 sources

            case 27: {
                var11_7 /* !! */  = (int)me.jvoa("jwke", jvnw(int ), (int)295);
                if (!var12_6) ** GOTO lbl86
                throw null;
            }
lbl181:
            // 2 sources

            case 28: {
                var11_7 /* !! */  = (int)me.jvoa("jwkg", jvnw(int ), (int)296);
                if (!var12_6) ** GOTO lbl169
                throw null;
            }
            case 29: {
                var11_7 /* !! */  = (int)me.jvoa("jwki", jvnw(int ), (int)297);
                if (!var12_6) ** GOTO lbl76
                throw null;
            }
            case 30: 
        }
        var11_7 /* !! */  = (int)me.jvoa("jwkk", jvnw(int ), (int)298);
        ** while (!var12_6)
lbl192:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int jvnw(int n2) {
        return jvnx[n2] ^ jvnz[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean method_25402(class_11909 var1_1, boolean var2_2) {
        block91: {
            block90: {
                block89: {
                    block88: {
                        block87: {
                            block86: {
                                var10_3 = me.c;
                                var9_4 /* !! */  = me.b;
                                var8_5 = me.a;
                                if (var10_3) {
                                    throw null;
lbl6:
                                    // 24 sources

                                    return (boolean)me.jvoa("jvxc", jvnw(int ), (int)135);
                                }
                                if (var8_5 || var8_5) ** GOTO lbl6
                                if (!this.closing) break block86;
                                if (var8_5) ** GOTO lbl6
                                return (boolean)me.jvoa("jvxd", jvnw(int ), (int)136);
                            }
                            if (var8_5 || var8_5) ** GOTO lbl6
                            var3_6 = (float)ki.getFixedScaledWidth() / 2.0f;
                            if (var8_5 || var8_5) ** GOTO lbl6
                            var4_7 = (float)ki.getFixedScaledHeight() / 2.0f;
                            if (var8_5 || var8_5) ** GOTO lbl6
                            var5_8 = me.jvoa("jvxf", jvqu(int ), (int)137) * this.visualScale;
                            if (var8_5 || var8_5) ** GOTO lbl6
                            var6_9 = me.jvoa("jvxg", jvqu(int ), (int)138) * this.visualScale;
                            if (var8_5 || var8_5) ** GOTO lbl6
                            var7_10 = this.findSector(ki.convertX((float)var1_1.comp_4798()), ki.convertY((float)var1_1.comp_4799()), var3_6, var4_7, (float)var5_8, (float)var6_9);
                            if (var8_5 || var8_5) ** GOTO lbl6
                            if (var7_10 != me.jvoa("jvxi", jvnw(int ), (int)139)) break block87;
                            if (var8_5) ** GOTO lbl6
                            return (boolean)me.jvoa("jvxj", jvnw(int ), (int)140);
                        }
                        if (var8_5 || var8_5) ** GOTO lbl6
                        if (var1_1.method_74245() != me.jvoa("jvxk", jvnw(int ), (int)141)) break block88;
                        if (var8_5 || var8_5) ** GOTO lbl6
                        this.helper.clearPotion(var7_10);
                        if (var8_5 || var8_5) ** GOTO lbl6
                        return (boolean)me.jvoa("jvxl", jvnw(int ), (int)142);
                    }
                    if (var8_5 || var8_5) ** GOTO lbl6
                    if (var1_1.method_74245() == 0) break block89;
                    if (var8_5) ** GOTO lbl6
                    return (boolean)me.jvoa("jvxm", jvnw(int ), (int)143);
                }
                if (var8_5 || var8_5) ** GOTO lbl6
                if (!this.helper.getSelectedPotion(var7_10).method_7960()) break block90;
                if (var8_5 || var8_5) ** GOTO lbl6
                if (this.field_22787 == null) break block91;
                if (var8_5) ** GOTO lbl6
                if (this.field_22787.field_1724 == null) break block91;
                if (var8_5 || var8_5) ** GOTO lbl6
                this.field_22787.method_1507((class_437)new md(this.field_22787.field_1724, this.helper, this, var7_10));
                if (var8_5) ** GOTO lbl6
                if (var10_3) {
                    throw null;
                }
                break block91;
            }
            if (var8_5 || var8_5) ** GOTO lbl6
            this.pendingUseSlot = var7_10;
            if (var8_5 || var8_5) ** GOTO lbl6
            this.startClosing();
            if (var8_5) ** GOTO lbl6
        }
        if (var8_5) ** GOTO lbl6
        if (var9_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var8_5) ** break;
                ** continue;
                return (boolean)me.jvoa("jvxn", jvnw(int ), (int)144);
            }
            case 0: {
                var9_4 /* !! */  = (int)me.jvoa("jvxo", jvnw(int ), (int)145);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 1: {
                var9_4 /* !! */  = (int)me.jvoa("jvxp", jvnw(int ), (int)146);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl76:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_4 /* !! */  = (int)me.jvoa("jvxq", jvnw(int ), (int)147);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl182
                    break;
                }
            }
lbl82:
            // 3 sources

            case 3: {
                var9_4 /* !! */  = (int)me.jvoa("jvxr", jvnw(int ), (int)148);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 4: {
                var9_4 /* !! */  = (int)me.jvoa("jvxs", jvnw(int ), (int)149);
                if (var10_3) {
                    throw null;
                }
            }
            case 5: {
                var9_4 /* !! */  = (int)me.jvoa("jvxt", jvnw(int ), (int)150);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl146
            }
            case 6: {
                var9_4 /* !! */  = (int)me.jvoa("jvxu", jvnw(int ), (int)151);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 7: {
                var9_4 /* !! */  = (int)me.jvoa("jvxv", jvnw(int ), (int)152);
                if (!var10_3) ** GOTO lbl76
                throw null;
            }
lbl105:
            // 4 sources

            case 8: {
                var9_4 /* !! */  = (int)me.jvoa("jvxx", jvnw(int ), (int)153);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl146
            }
            case 9: {
                var9_4 /* !! */  = (int)me.jvoa("jvxz", jvnw(int ), (int)154);
                if (!var10_3) break;
                throw null;
            }
            case 10: {
                var9_4 /* !! */  = (int)me.jvoa("jvya", jvnw(int ), (int)155);
                if (var10_3) {
                    throw null;
                }
            }
lbl118:
            // 5 sources

            case 11: {
                var9_4 /* !! */  = (int)me.jvoa("jvyb", jvnw(int ), (int)156);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl249
            }
lbl123:
            // 2 sources

            case 12: {
                var9_4 /* !! */  = (int)me.jvoa("jvyc", jvnw(int ), (int)157);
                if (!var10_3) ** GOTO lbl82
                throw null;
            }
lbl127:
            // 3 sources

            case 13: {
                var9_4 /* !! */  = (int)me.jvoa("jvye", jvnw(int ), (int)158);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl249
            }
            case 14: {
                do {
                    var9_4 /* !! */  = (int)me.jvoa("jvyf", jvnw(int ), (int)159);
                } while (!var10_3);
                throw null;
            }
lbl137:
            // 3 sources

            case 15: {
                var9_4 /* !! */  = (int)me.jvoa("jvyh", jvnw(int ), (int)160);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl142:
            // 2 sources

            case 16: {
                var9_4 /* !! */  = (int)me.jvoa("jvyi", jvnw(int ), (int)161);
                if (!var10_3) ** GOTO lbl105
                throw null;
            }
lbl146:
            // 5 sources

            case 17: {
                var9_4 /* !! */  = (int)me.jvoa("jvyj", jvnw(int ), (int)162);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 18: {
                var9_4 /* !! */  = (int)me.jvoa("jvyk", jvnw(int ), (int)163);
                if (!var10_3) ** GOTO lbl137
                throw null;
            }
lbl155:
            // 4 sources

            case 19: {
                var9_4 /* !! */  = (int)me.jvoa("jvyl", jvnw(int ), (int)164);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl160:
            // 2 sources

            case 20: {
                var9_4 /* !! */  = (int)me.jvoa("jvym", jvnw(int ), (int)165);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl165:
            // 2 sources

            case 21: {
                var9_4 /* !! */  = (int)me.jvoa("jvyn", jvnw(int ), (int)166);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl170:
            // 3 sources

            case 22: {
                var9_4 /* !! */  = (int)me.jvoa("jvyp", jvnw(int ), (int)167);
                if (!var10_3) ** GOTO lbl118
                throw null;
            }
            case 23: {
                var9_4 /* !! */  = (int)me.jvoa("jvyq", jvnw(int ), (int)168);
                if (!var10_3) ** GOTO lbl155
                throw null;
            }
lbl178:
            // 2 sources

            case 24: {
                var9_4 /* !! */  = (int)me.jvoa("jvyr", jvnw(int ), (int)169);
                if (!var10_3) ** GOTO lbl137
                throw null;
            }
lbl182:
            // 2 sources

            case 25: {
                var9_4 /* !! */  = (int)me.jvoa("jvys", jvnw(int ), (int)170);
                if (!var10_3) break;
                throw null;
            }
            case 26: {
                var9_4 /* !! */  = (int)me.jvoa("jvyt", jvnw(int ), (int)171);
                if (!var10_3) ** GOTO lbl142
                throw null;
            }
lbl190:
            // 2 sources

            case 27: {
                var9_4 /* !! */  = (int)me.jvoa("jvyu", jvnw(int ), (int)172);
                if (!var10_3) break;
                throw null;
            }
            case 28: {
                var9_4 /* !! */  = (int)me.jvoa("jvyw", jvnw(int ), (int)173);
                if (!var10_3) ** GOTO lbl118
                throw null;
            }
            case 29: {
                var9_4 /* !! */  = (int)me.jvoa("jvyx", jvnw(int ), (int)174);
                if (!var10_3) ** GOTO lbl105
                throw null;
            }
lbl202:
            // 2 sources

            case 30: {
                var9_4 /* !! */  = (int)me.jvoa("jvyz", jvnw(int ), (int)175);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl229
            }
            case 31: {
                var9_4 /* !! */  = (int)me.jvoa("jvza", jvnw(int ), (int)176);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl249
            }
lbl212:
            // 3 sources

            case 32: {
                var9_4 /* !! */  = (int)me.jvoa("jvzb", jvnw(int ), (int)177);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl229
            }
            case 33: {
                var9_4 /* !! */  = (int)me.jvoa("jvzc", jvnw(int ), (int)178);
                if (!var10_3) ** GOTO lbl123
                throw null;
            }
lbl221:
            // 2 sources

            case 34: {
                var9_4 /* !! */  = (int)me.jvoa("jvzd", jvnw(int ), (int)179);
                if (!var10_3) ** GOTO lbl82
                throw null;
            }
            case 35: {
                var9_4 /* !! */  = (int)me.jvoa("jvze", jvnw(int ), (int)180);
                if (!var10_3) ** GOTO lbl212
                throw null;
            }
lbl229:
            // 3 sources

            case 36: {
                var9_4 /* !! */  = (int)me.jvoa("jvzf", jvnw(int ), (int)181);
                if (!var10_3) ** GOTO lbl170
                throw null;
            }
            case 37: {
                var9_4 /* !! */  = (int)me.jvoa("jvzh", jvnw(int ), (int)182);
                if (!var10_3) ** GOTO lbl105
                throw null;
            }
            case 38: {
                var9_4 /* !! */  = (int)me.jvoa("jvzj", jvnw(int ), (int)183);
                if (!var10_3) ** GOTO lbl178
                throw null;
            }
            case 39: {
                var9_4 /* !! */  = (int)me.jvoa("jvzk", jvnw(int ), (int)184);
                if (!var10_3) ** GOTO lbl160
                throw null;
            }
lbl245:
            // 2 sources

            case 40: {
                var9_4 /* !! */  = (int)me.jvoa("jvzm", jvnw(int ), (int)185);
                if (!var10_3) ** GOTO lbl146
                throw null;
            }
lbl249:
            // 4 sources

            case 41: {
                var9_4 /* !! */  = (int)me.jvoa("jvzn", jvnw(int ), (int)186);
                if (!var10_3) ** GOTO lbl146
                throw null;
            }
            case 42: {
                var9_4 /* !! */  = (int)me.jvoa("jvzo", jvnw(int ), (int)187);
                if (!var10_3) ** GOTO lbl245
                throw null;
            }
            case 43: {
                var9_4 /* !! */  = (int)me.jvoa("jvzp", jvnw(int ), (int)188);
                if (!var10_3) ** GOTO lbl127
                throw null;
            }
            case 44: 
        }
        var9_4 /* !! */  = (int)me.jvoa("jvzr", jvnw(int ), (int)189);
        ** while (!var10_3)
lbl264:
        // 1 sources

        throw null;
    }
}

