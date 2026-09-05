/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_408
 *  net.minecraft.class_437
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_408;
import net.minecraft.class_437;
import ruhack.phobia.at;
import ruhack.phobia.au;
import ruhack.phobia.mu;
import ruhack.phobia.mw;
import ruhack.phobia.mx;
import ruhack.phobia.my;

public abstract class ar
implements au {
    private long outlineAppearAt;
    protected float lastTickDelta;
    protected int width;
    protected String name;
    public static final boolean a;
    protected final int defaultY;
    private static long[] dgwk;
    protected boolean enabled;
    protected int height;
    static final long hk = -2344334616803875337L;
    public static final int b;
    protected int x;
    private static int[] dgwd;
    protected final int defaultX;
    private static int[] dgwc;
    public static final boolean c;
    protected final class_310 mc;
    protected boolean draggable;
    protected int y;
    private static long[] dgwj;
    protected final mu scaleAnimation;

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void playAppear() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = ar.hk - ar.dgwe("dhgd", dgwi(int ), (int)95)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ar.dgwe("dhge", dgwb(int ), (int)159)) break;
            v0 /* !! */  = (long)ar.dgwe("dhgf", dgwb(int ), (int)160);
        }
        var3_1 = ar.c;
        v1 /* !! */  = ar.hk;
        block55: while (true) {
            switch ((int)v1 /* !! */ ) {
                case 830246724: {
                    v1 /* !! */  = (long)(ar.dgwe("dhgh", dgwi(int ), (int)97) - ar.dgwe("dhgg", dgwi(int ), (int)96));
                    continue block55;
                }
                case 985720311: {
                    break block55;
                }
            }
            break;
        }
        var2_2 /* !! */  = ar.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block56: while (true) {
            block87: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v2 /* !! */  = ar.hk;
                        block57: while (true) {
                            switch ((int)v2 /* !! */ ) {
                                case -1938568302: {
                                    v3 = ar.dgwe("dhgj", dgwi(int ), (int)99);
                                    ** GOTO lbl32
                                }
                                case -1876611691: {
                                    v3 = ar.dgwe("dhgk", dgwi(int ), (int)100);
                                    ** GOTO lbl32
                                }
                                case -2629764: {
                                    v3 = ar.dgwe("dhgl", dgwi(int ), (int)101);
lbl32:
                                    // 3 sources

                                    v2 /* !! */  = (long)(v3 - ar.dgwe("dhgi", dgwi(int ), (int)98));
                                    continue block57;
                                }
                                case 985720311: {
                                    break block57;
                                }
                            }
                            break;
                        }
                        var1_3 = ar.a;
                        if (var3_1) {
                            throw null;
                        }
                        if (var1_3 || var1_3) return;
                        v4 /* !! */  = ar.hk;
                        block58: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -1454785899: {
                                    v5 = ar.dgwe("dhgn", dgwi(int ), (int)103);
                                    ** GOTO lbl50
                                }
                                case 985720311: {
                                    break block58;
                                }
                                case 1061153075: {
                                    v5 = ar.dgwe("dhgo", dgwi(int ), (int)104);
lbl50:
                                    // 2 sources

                                    v4 /* !! */  = (long)(v5 - ar.dgwe("dhgm", dgwi(int ), (int)102));
                                    continue block58;
                                }
                            }
                            break;
                        }
                        v6 = ar.dgwe("dhgp", dgwb(int ), (int)161);
                        while (true) {
                            if ((v7 /* !! */  = (cfr_temp_2 = ar.hk - ar.dgwe("dhgq", dgwi(int ), (int)105)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v7 /* !! */  == ar.dgwe("dhgr", dgwb(int ), (int)162)) {
                                this.scaleAnimation.setMs((int)v6);
                                if (var1_3) return;
                                break;
                            }
                            v7 /* !! */  = (long)ar.dgwe("dhgs", dgwb(int ), (int)163);
                        }
                        if (var1_3) return;
                        v8 /* !! */  = ar.hk;
                        block60: while (true) {
                            switch ((int)v8 /* !! */ ) {
                                case 985720311: {
                                    break block60;
                                }
                                case 1026266455: {
                                    v8 /* !! */  = (long)(ar.dgwe("dhgu", dgwi(int ), (int)107) - ar.dgwe("dhgt", dgwi(int ), (int)106));
                                    continue block60;
                                }
                            }
                            break;
                        }
                        v9 /* !! */  = ar.hk;
                        block61: while (true) {
                            switch ((int)v9 /* !! */ ) {
                                case 700737092: {
                                    v10 = ar.dgwe("dhgw", dgwi(int ), (int)109);
                                    ** GOTO lbl80
                                }
                                case 985720311: {
                                    break block61;
                                }
                                case 1446675942: {
                                    v10 = ar.dgwe("dhgx", dgwi(int ), (int)110);
lbl80:
                                    // 2 sources

                                    v9 /* !! */  = (long)(v10 - ar.dgwe("dhgv", dgwi(int ), (int)108));
                                    continue block61;
                                }
                            }
                            break;
                        }
                        v11 /* !! */  = ar.hk;
                        block62: while (true) {
                            switch ((int)v11 /* !! */ ) {
                                case -31499510: {
                                    v12 = ar.dgwe("dhgz", dgwi(int ), (int)112);
                                    ** GOTO lbl95
                                }
                                case 450436684: {
                                    v12 = ar.dgwe("dhha", dgwi(int ), (int)113);
                                    ** GOTO lbl95
                                }
                                case 985720311: {
                                    break block62;
                                }
                                case 1054697111: {
                                    v12 = ar.dgwe("dhhb", dgwi(int ), (int)114);
lbl95:
                                    // 3 sources

                                    v11 /* !! */  = (long)(v12 - ar.dgwe("dhgy", dgwi(int ), (int)111));
                                    continue block62;
                                }
                            }
                            break;
                        }
                        this.scaleAnimation.setDirection(mx.FORWARDS);
                        if (var1_3 || var1_3) return;
                        v13 /* !! */  = ar.hk;
                        block63: while (true) {
                            switch ((int)v13 /* !! */ ) {
                                case -1714176102: {
                                    v13 /* !! */  = (long)(ar.dgwe("dhhd", dgwi(int ), (int)116) - ar.dgwe("dhhc", dgwi(int ), (int)115));
                                    continue block63;
                                }
                                case 985720311: {
                                    break block63;
                                }
                            }
                            break;
                        }
                        v14 /* !! */  = ar.hk;
                        block64: while (true) {
                            switch ((int)v14 /* !! */ ) {
                                case 126700815: {
                                    v15 = ar.dgwe("dhhf", dgwi(int ), (int)118);
                                    ** GOTO lbl118
                                }
                                case 156119605: {
                                    v15 = ar.dgwe("dhhg", dgwi(int ), (int)119);
                                    ** GOTO lbl118
                                }
                                case 479237569: {
                                    v15 = ar.dgwe("dhhh", dgwi(int ), (int)120);
lbl118:
                                    // 3 sources

                                    v14 /* !! */  = (long)(v15 - ar.dgwe("dhhe", dgwi(int ), (int)117));
                                    continue block64;
                                }
                                case 985720311: {
                                    break block64;
                                }
                            }
                            break;
                        }
                        this.scaleAnimation.reset();
                        if (var1_3 || var1_3) return;
                        while (true) {
                            if ((v16 /* !! */  = (cfr_temp_3 = ar.hk - ar.dgwe("dhhi", dgwi(int ), (int)121)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v16 /* !! */  != ar.dgwe("dhhj", dgwb(int ), (int)164)) ** GOTO lbl129
                            v17 = System.currentTimeMillis();
                            ** GOTO lbl183
lbl129:
                            // 1 sources

                            v16 /* !! */  = (long)ar.dgwe("dhhk", dgwb(int ), (int)165);
                        }
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)ar.dgwe("dhho", dgwb(int ), (int)168);
                        cfr_temp_0 = 2;
                        if (var3_1) {
                            throw null;
                        }
                        break block87;
                    }
                    case 1: {
                        var2_2 /* !! */  = (int)ar.dgwe("dhhp", dgwb(int ), (int)169);
                        cfr_temp_0 = 9;
                        if (var3_1) {
                            throw null;
                        }
                        break block87;
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)ar.dgwe("dhhq", dgwb(int ), (int)170);
                        cfr_temp_0 = 10;
                        if (var3_1) {
                            throw null;
                        }
                        break block87;
                    }
                    case 4: {
                        var2_2 /* !! */  = (int)ar.dgwe("dhhs", dgwb(int ), (int)172);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 8: {
                        var2_2 /* !! */  = (int)ar.dgwe("dhhw", dgwb(int ), (int)176);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 9: {
                        var2_2 /* !! */  = (int)ar.dgwe("dhhx", dgwb(int ), (int)177);
                        cfr_temp_0 = 7;
                        if (var3_1) {
                            throw null;
                        }
                        break block87;
                    }
                    case 10: {
                        var2_2 /* !! */  = (int)ar.dgwe("dhhy", dgwb(int ), (int)178);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 6: {
                        ** GOTO lbl174
                    }
                    case 11: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)ar.dgwe("dhhz", dgwb(int ), (int)179);
                        if (var3_1) {
                            throw null;
                        }
lbl174:
                        // 3 sources

                        var2_2 /* !! */  = (int)ar.dgwe("dhhu", dgwb(int ), (int)174);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 7: {
                        var2_2 /* !! */  = (int)ar.dgwe("dhhv", dgwb(int ), (int)175);
                        cfr_temp_0 = 5;
                        if (var3_1) {
                            throw null;
                        }
                        break block87;
                    }
lbl183:
                    // 1 sources

                    while (true) {
                        if ((v18 /* !! */  = (cfr_temp_4 = ar.hk - ar.dgwe("dhhl", dgwi(int ), (int)122)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v18 /* !! */  == ar.dgwe("dhhm", dgwb(int ), (int)166)) {
                            this.outlineAppearAt = v17;
                            if (var1_3) return;
                            break;
                        }
                        v18 /* !! */  = (long)ar.dgwe("dhhn", dgwb(int ), (int)167);
                    }
                    if (!var1_3) return;
                    return;
                    case 3: {
                        var2_2 /* !! */  = (int)ar.dgwe("dhhr", dgwb(int ), (int)171);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 5: 
                }
                ** GOTO lbl202
            }
            do {
                if (true) continue block56;
lbl202:
                // 2 sources

                var2_2 /* !! */  = (int)ar.dgwe("dhht", dgwb(int ), (int)173);
                cfr_temp_0 = 3;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void startAnimation() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ar.hk - ar.dgwe("dhff", dgwi(int ), (int)79)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ar.dgwe("dhfg", dgwb(int ), (int)151)) break;
            v0 /* !! */  = (long)ar.dgwe("dhfh", dgwb(int ), (int)152);
        }
        var3_1 = ar.c;
        v1 /* !! */  = ar.hk;
        if (true) ** GOTO lbl12
        block34: while (true) {
            v1 /* !! */  = (long)(v2 - ar.dgwe("dhfi", dgwi(int ), (int)80));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1991074066: {
                    v2 = ar.dgwe("dhfj", dgwi(int ), (int)81);
                    continue block34;
                }
                case 985720311: {
                    break block34;
                }
                case 1445488326: {
                    v2 = ar.dgwe("dhfk", dgwi(int ), (int)82);
                    continue block34;
                }
            }
            break;
        }
        var2_2 /* !! */  = ar.b;
        v3 /* !! */  = ar.hk;
        if (true) ** GOTO lbl26
        block35: while (true) {
            v3 /* !! */  = (long)(v4 - ar.dgwe("dhfl", dgwi(int ), (int)83));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1853333255: {
                    v4 = ar.dgwe("dhfm", dgwi(int ), (int)84);
                    continue block35;
                }
                case -656877253: {
                    v4 = ar.dgwe("dhfn", dgwi(int ), (int)85);
                    continue block35;
                }
                case 985720311: {
                    break block35;
                }
            }
            break;
        }
        var1_3 = ar.a;
        if (var3_1) {
            throw null;
lbl38:
            // 2 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl38
        v5 /* !! */  = ar.hk;
        if (true) ** GOTO lbl45
        block37: while (true) {
            v5 /* !! */  = (long)(ar.dgwe("dhfp", dgwi(int ), (int)87) - ar.dgwe("dhfo", dgwi(int ), (int)86));
lbl45:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 985720311: {
                    break block37;
                }
                case 1166662175: {
                    continue block37;
                }
            }
            break;
        }
        v6 /* !! */  = ar.hk;
        if (true) ** GOTO lbl54
        block38: while (true) {
            v6 /* !! */  = (long)(v7 - ar.dgwe("dhfq", dgwi(int ), (int)88));
lbl54:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 417969601: {
                    v7 = ar.dgwe("dhfr", dgwi(int ), (int)89);
                    continue block38;
                }
                case 965175745: {
                    v7 = ar.dgwe("dhfs", dgwi(int ), (int)90);
                    continue block38;
                }
                case 985720311: {
                    break block38;
                }
                case 1784424030: {
                    v7 = ar.dgwe("dhft", dgwi(int ), (int)91);
                    continue block38;
                }
            }
            break;
        }
        v8 /* !! */  = ar.hk;
        if (true) ** GOTO lbl70
        block39: while (true) {
            v8 /* !! */  = (long)(v9 - ar.dgwe("dhfu", dgwi(int ), (int)92));
lbl70:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1068856355: {
                    v9 = ar.dgwe("dhfv", dgwi(int ), (int)93);
                    continue block39;
                }
                case 985720311: {
                    break block39;
                }
                case 1249874879: {
                    v9 = ar.dgwe("dhfw", dgwi(int ), (int)94);
                    continue block39;
                }
            }
            break;
        }
        this.scaleAnimation.setDirection(mx.FORWARDS);
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block25 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl85:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ar.dgwe("dhfx", dgwb(int ), (int)153);
                    if (!var3_1) break block25;
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)ar.dgwe("dhfy", dgwb(int ), (int)154);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ar.dgwe("dhfz", dgwb(int ), (int)155);
                if (!var3_1) break;
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)ar.dgwe("dhga", dgwb(int ), (int)156);
                if (!var3_1) ** GOTO lbl85
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)ar.dgwe("dhgb", dgwb(int ), (int)157);
                if (!var3_1) break;
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)ar.dgwe("dhgc", dgwb(int ), (int)158);
        ** while (!var3_1)
lbl110:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ar(String var1_1, int var2_2, int var3_3, int var4_4, int var5_5, boolean var6_6) {
        var8_7 /* !! */  = ar.b;
        super();
        if (var8_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.enabled = ar.dgwe("dgwf", dgwb(int ), (int)0);
                this.draggable = ar.dgwe("dgwg", dgwb(int ), (int)1);
                this.mc = class_310.method_1551();
                this.scaleAnimation = new mw().setMs((int)ar.dgwe("dgwh", dgwb(int ), (int)2)).setValue(1.0);
                this.lastTickDelta = 0.0f;
                this.outlineAppearAt = (long)ar.dgwe("dgwl", dgwi(int ), (int)0);
                this.name = var1_1;
                this.x = var2_2;
                this.y = var3_3;
                this.defaultX = var2_2;
                this.defaultY = var3_3;
                this.width = var4_4;
                this.height = var5_5;
                this.draggable = var6_6;
                return;
            }
lbl21:
            // 2 sources

            case 0: {
                var8_7 /* !! */  = (int)ar.dgwe("dgwm", dgwb(int ), (int)3);
                ** GOTO lbl57
            }
lbl24:
            // 2 sources

            case 1: {
                var8_7 /* !! */  = (int)ar.dgwe("dgwn", dgwb(int ), (int)4);
                ** GOTO lbl36
            }
            case 2: {
                var8_7 /* !! */  = (int)ar.dgwe("dgwo", dgwb(int ), (int)5);
                ** GOTO lbl24
            }
lbl30:
            // 2 sources

            case 3: {
                var8_7 /* !! */  = (int)ar.dgwe("dgwp", dgwb(int ), (int)6);
                ** GOTO lbl48
            }
lbl33:
            // 2 sources

            case 4: {
                var8_7 /* !! */  = (int)ar.dgwe("dgwq", dgwb(int ), (int)7);
                break;
            }
lbl36:
            // 2 sources

            case 5: {
                var8_7 /* !! */  = (int)ar.dgwe("dgwr", dgwb(int ), (int)8);
                ** GOTO lbl42
            }
lbl39:
            // 2 sources

            case 6: {
                var8_7 /* !! */  = (int)ar.dgwe("dgws", dgwb(int ), (int)9);
                break;
            }
lbl42:
            // 2 sources

            case 7: {
                var8_7 /* !! */  = (int)ar.dgwe("dgwt", dgwb(int ), (int)10);
                ** GOTO lbl48
            }
            case 8: {
                var8_7 /* !! */  = (int)ar.dgwe("dgwu", dgwb(int ), (int)11);
                ** GOTO lbl30
            }
lbl48:
            // 4 sources

            case 9: {
                var8_7 /* !! */  = (int)ar.dgwe("dgwv", dgwb(int ), (int)12);
                ** GOTO lbl64
            }
            case 10: {
                var8_7 /* !! */  = (int)ar.dgwe("dgww", dgwb(int ), (int)13);
                ** GOTO lbl21
            }
            case 11: {
                var8_7 /* !! */  = (int)ar.dgwe("dgwx", dgwb(int ), (int)14);
                ** GOTO lbl39
            }
lbl57:
            // 3 sources

            case 12: {
                var8_7 /* !! */  = (int)ar.dgwe("dgwy", dgwb(int ), (int)15);
                ** GOTO lbl33
            }
            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_7 /* !! */  = (int)ar.dgwe("dgwz", dgwb(int ), (int)16);
                    ** GOTO lbl48
                    break;
                }
            }
lbl64:
            // 2 sources

            case 14: {
                var8_7 /* !! */  = (int)ar.dgwe("dgxa", dgwb(int ), (int)17);
                break;
            }
            case 15: {
                var8_7 /* !! */  = (int)ar.dgwe("dgxb", dgwb(int ), (int)18);
                ** GOTO lbl57
            }
            case 16: 
        }
        var8_7 /* !! */  = (int)ar.dgwe("dgxc", dgwb(int ), (int)19);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected boolean isChat(class_437 var1_1) {
        v0 /* !! */  = ar.hk;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(ar.dgwe("dhiy", dgwi(int ), (int)133) - ar.dgwe("dhix", dgwi(int ), (int)132));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -866568252: {
                    continue block14;
                }
                case 985720311: {
                    break block14;
                }
            }
            break;
        }
        var4_2 = ar.c;
        v1 /* !! */  = ar.hk;
        if (true) ** GOTO lbl15
        block15: while (true) {
            v1 /* !! */  = (long)(ar.dgwe("dhja", dgwi(int ), (int)135) - ar.dgwe("dhiz", dgwi(int ), (int)134));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1355153769: {
                    continue block15;
                }
                case 985720311: {
                    break block15;
                }
            }
            break;
        }
        var3_3 /* !! */  = ar.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ar.hk - ar.dgwe("dhjb", dgwi(int ), (int)136)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ar.dgwe("dhjc", dgwb(int ), (int)194)) break;
            v2 /* !! */  = (long)ar.dgwe("dhjd", dgwb(int ), (int)195);
        }
        var2_4 = ar.a;
        if (var4_2) {
            throw null;
lbl30:
            // 2 sources

            return (boolean)ar.dgwe("dhje", dgwb(int ), (int)196);
        }
        if (var2_4) ** GOTO lbl30
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                return var1_1 instanceof class_408;
            }
lbl38:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)ar.dgwe("dhjf", dgwb(int ), (int)197);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ar.dgwe("dhjg", dgwb(int ), (int)198);
                    if (!var4_2) ** GOTO lbl38
                    throw null;
                }
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)ar.dgwe("dhjh", dgwb(int ), (int)199);
                } while (!var4_2);
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)ar.dgwe("dhji", dgwb(int ), (int)200);
        ** while (!var4_2)
lbl55:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public int getHeight() {
        boolean bl2;
        Object object = hk;
        boolean bl3 = true;
        block11: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - ar.dgwe("dhrg", dgwi(int ), (int)206);
            }
            switch ((int)object) {
                case -1098147743: {
                    callSite = ar.dgwe("dhrh", dgwi(int ), (int)207);
                    continue block11;
                }
                case 407794082: {
                    callSite = ar.dgwe("dhri", dgwi(int ), (int)208);
                    continue block11;
                }
                case 985720311: {
                    break block11;
                }
                case 1299596976: {
                    callSite = ar.dgwe("dhrj", dgwi(int ), (int)209);
                    continue block11;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = hk;
        boolean bl5 = true;
        block12: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite - ar.dgwe("dhrk", dgwi(int ), (int)210);
            }
            switch ((int)object2) {
                case 693764819: {
                    callSite = ar.dgwe("dhrl", dgwi(int ), (int)211);
                    continue block12;
                }
                case 985720311: {
                    break block12;
                }
                case 1946865345: {
                    callSite = ar.dgwe("dhrm", dgwi(int ), (int)212);
                    continue block12;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = hk - ar.dgwe("dhrn", dgwi(int ), (int)213)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == ar.dgwe("dhro", dgwb(int ), (int)303)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = ar.dgwe("dhrp", dgwb(int ), (int)304);
        }
        if (bl2) return (int)ar.dgwe("dhrq", dgwb(int ), (int)305);
        if (bl2) return (int)ar.dgwe("dhrq", dgwb(int ), (int)305);
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = hk - ar.dgwe("dhrr", dgwi(int ), (int)214)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == ar.dgwe("dhrs", dgwb(int ), (int)306)) {
                return this.height;
            }
            object4 = ar.dgwe("dhrt", dgwb(int ), (int)307);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public String getName() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ar.hk - ar.dgwe("dhne", dgwi(int ), (int)161)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ar.dgwe("dhnf", dgwb(int ), (int)246)) break;
            v0 /* !! */  = (long)ar.dgwe("dhng", dgwb(int ), (int)247);
        }
        var3_1 = ar.c;
        v1 /* !! */  = ar.hk;
        if (true) ** GOTO lbl12
        block21: while (true) {
            v1 /* !! */  = (long)(ar.dgwe("dhnl", dgwi(int ), (int)163) - ar.dgwe("dhnk", dgwi(int ), (int)162));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 695728125: {
                    continue block21;
                }
                case 985720311: {
                    break block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = ar.b;
        v2 /* !! */  = ar.hk;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - ar.dgwe("dhnm", dgwi(int ), (int)164));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -823147449: {
                    v3 = ar.dgwe("dhnn", dgwi(int ), (int)165);
                    continue block22;
                }
                case 985720311: {
                    break block22;
                }
                case 1657714976: {
                    v3 = ar.dgwe("dhno", dgwi(int ), (int)166);
                    continue block22;
                }
            }
            break;
        }
        var1_3 = ar.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = ar.hk;
                if (true) ** GOTO lbl44
                block24: while (true) {
                    v4 /* !! */  = (long)(v5 - ar.dgwe("dhnp", dgwi(int ), (int)167));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 373314709: {
                            v5 = ar.dgwe("dhnr", dgwi(int ), (int)168);
                            continue block24;
                        }
                        case 985720311: {
                            break block24;
                        }
                        case 1596590146: {
                            v5 = ar.dgwe("dhns", dgwi(int ), (int)169);
                            continue block24;
                        }
                    }
                    break;
                }
                return this.name;
            }
            case 0: {
                var2_2 /* !! */  = (int)ar.dgwe("dhnt", dgwb(int ), (int)248);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ar.dgwe("dhnu", dgwb(int ), (int)249);
                    if (!var3_1) break block9;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ar.dgwe("dhnv", dgwb(int ), (int)250);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ar.dgwe("dhnw", dgwb(int ), (int)251);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    public abstract void drawDraggable(class_332 var1, int var2);

    private static /* synthetic */ void dhtv() {
        ar.dgwk[100] = 5073819470534020618L;
        ar.dgwk[101] = 371009949619939278L;
        ar.dgwk[102] = -3966965164931965976L;
        ar.dgwk[103] = 1481603557963419167L;
        ar.dgwk[104] = -7731766256170800067L;
        ar.dgwk[105] = -5259708033374028508L;
        ar.dgwk[106] = -6924721817826889514L;
        ar.dgwk[107] = -3879618619195361163L;
        ar.dgwk[108] = 4242957987994999768L;
        ar.dgwk[109] = -7100367875922495206L;
        ar.dgwk[110] = -7190675161156082045L;
        ar.dgwk[111] = -1643069570468821088L;
        ar.dgwk[112] = -1572744739924957847L;
        ar.dgwk[113] = 4824036096347310266L;
        ar.dgwk[114] = -4251292193573364823L;
        ar.dgwk[115] = 1541403001689488776L;
        ar.dgwk[116] = 5599727327605116549L;
        ar.dgwk[117] = 7495768987726959440L;
        ar.dgwk[118] = 4830879330649292337L;
        ar.dgwk[119] = 2714060450897230445L;
        ar.dgwk[120] = -5491287512055064595L;
        ar.dgwk[121] = 4595125127930673286L;
        ar.dgwk[122] = 3216771106281384451L;
        ar.dgwk[123] = 2359290073140639836L;
        ar.dgwk[124] = 835922024038350886L;
        ar.dgwk[125] = 3630107228731393611L;
        ar.dgwk[126] = 8430190835522101862L;
        ar.dgwk[127] = -2554253874603026405L;
        ar.dgwk[128] = -2321643095908914617L;
        ar.dgwk[129] = -5785208327682152558L;
        ar.dgwk[130] = 6414342205447854935L;
        ar.dgwk[131] = 4114362759084242631L;
        ar.dgwk[132] = -2964846086622832455L;
        ar.dgwk[133] = 4574956524956357905L;
        ar.dgwk[134] = 652718594707484739L;
        ar.dgwk[135] = 8991152939953363438L;
        ar.dgwk[136] = 7232590333614436860L;
        ar.dgwk[137] = -6847578203608258473L;
        ar.dgwk[138] = -2659244764232443542L;
        ar.dgwk[139] = -8285910007059620476L;
        ar.dgwk[140] = -8299987333522639433L;
        ar.dgwk[141] = -7569379166492311445L;
        ar.dgwk[142] = 3104912701869782877L;
        ar.dgwk[143] = -316696629179379892L;
        ar.dgwk[144] = -4360394553717484734L;
        ar.dgwk[145] = -2487216992163165490L;
        ar.dgwk[146] = -4217721468039658500L;
        ar.dgwk[147] = 33969514790350958L;
        ar.dgwk[148] = -5657083413118765684L;
        ar.dgwk[149] = -2240631191095669903L;
        ar.dgwk[150] = -6309258814781232627L;
        ar.dgwk[151] = 3634423234857301436L;
        ar.dgwk[152] = -8164627079488943286L;
        ar.dgwk[153] = -5806789773912732103L;
        ar.dgwk[154] = -2406321896140963943L;
        ar.dgwk[155] = -8023359994607787269L;
        ar.dgwk[156] = 4404289810787430878L;
        ar.dgwk[157] = 9142276743030382792L;
        ar.dgwk[158] = 4190887697401166426L;
        ar.dgwk[159] = 432667288191405460L;
        ar.dgwk[160] = 3507888680241438668L;
        ar.dgwk[161] = 2955138919780572133L;
        ar.dgwk[162] = 2023058719902147841L;
        ar.dgwk[163] = 997122540757614071L;
        ar.dgwk[164] = 337288729670299596L;
        ar.dgwk[165] = -1648402363222058970L;
        ar.dgwk[166] = 256075413289587572L;
        ar.dgwk[167] = -2385252252455797567L;
        ar.dgwk[168] = 5607252934344237939L;
        ar.dgwk[169] = -1166622028313707868L;
        ar.dgwk[170] = 301375469905348259L;
        ar.dgwk[171] = -8878211683363173347L;
        ar.dgwk[172] = 6150137015897860288L;
        ar.dgwk[173] = 5653091931777630191L;
        ar.dgwk[174] = 7643189945427869302L;
        ar.dgwk[175] = 6564448904715344168L;
        ar.dgwk[176] = -1290265395413473424L;
        ar.dgwk[177] = 4964827012892025135L;
        ar.dgwk[178] = -7115000992108121128L;
        ar.dgwk[179] = 5263091795491411995L;
        ar.dgwk[180] = 2097530107358958206L;
        ar.dgwk[181] = 8403181266161770351L;
        ar.dgwk[182] = -6306226532083438576L;
        ar.dgwk[183] = -4810867748423794668L;
        ar.dgwk[184] = 5938717136960368028L;
        ar.dgwk[185] = 3310195597390830428L;
        ar.dgwk[186] = 3253313812829678960L;
        ar.dgwk[187] = 6994425283543934175L;
        ar.dgwk[188] = -1468751749100737310L;
        ar.dgwk[189] = -4095789808208188450L;
        ar.dgwk[190] = 6344170194059091561L;
        ar.dgwk[191] = 992458885440643918L;
        ar.dgwk[192] = -7713392268779282683L;
        ar.dgwk[193] = 6369158263286213731L;
        ar.dgwk[194] = -3481657564173324298L;
        ar.dgwk[195] = 4680313437391723361L;
        ar.dgwk[196] = 2061987526574548361L;
        ar.dgwk[197] = 5097315864775844934L;
        ar.dgwk[198] = 2274254498285742828L;
        ar.dgwk[199] = -7937017390397573575L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void render(class_332 var1_1, float var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ar.hk - ar.dgwe("dgyj", dgwi(int ), (int)19)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ar.dgwe("dgyk", dgwb(int ), (int)34)) break;
            v0 /* !! */  = (long)ar.dgwe("dgyl", dgwb(int ), (int)35);
        }
        var6_3 = ar.c;
        v1 /* !! */  = ar.hk;
        if (true) ** GOTO lbl11
        block35: while (true) {
            v1 /* !! */  = (long)(v2 - ar.dgwe("dgym", dgwi(int ), (int)20));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 189694993: {
                    v2 = ar.dgwe("dgyn", dgwi(int ), (int)21);
                    continue block35;
                }
                case 560271633: {
                    v2 = ar.dgwe("dgyo", dgwi(int ), (int)22);
                    continue block35;
                }
                case 985720311: {
                    break block35;
                }
            }
            break;
        }
        var5_4 /* !! */  = ar.b;
        v3 /* !! */  = ar.hk;
        if (true) ** GOTO lbl25
        block36: while (true) {
            v3 /* !! */  = (long)(v4 - ar.dgwe("dgyp", dgwi(int ), (int)23));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -650377130: {
                    v4 = ar.dgwe("dgyq", dgwi(int ), (int)24);
                    continue block36;
                }
                case 912239125: {
                    v4 = ar.dgwe("dgyr", dgwi(int ), (int)25);
                    continue block36;
                }
                case 985720311: {
                    break block36;
                }
                case 1601267816: {
                    v4 = ar.dgwe("dgys", dgwi(int ), (int)26);
                    continue block36;
                }
            }
            break;
        }
        var4_5 = ar.a;
        if (var6_3) {
            throw null;
lbl40:
            // 7 sources

            return;
        }
        if (var4_5 || var4_5) ** GOTO lbl40
        v5 /* !! */  = ar.hk;
        if (true) ** GOTO lbl47
        block38: while (true) {
            v5 /* !! */  = (long)(v6 - ar.dgwe("dgyt", dgwi(int ), (int)27));
lbl47:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 591004483: {
                    v6 = ar.dgwe("dgyu", dgwi(int ), (int)28);
                    continue block38;
                }
                case 985720311: {
                    break block38;
                }
                case 2094563849: {
                    v6 = ar.dgwe("dgyv", dgwi(int ), (int)29);
                    continue block38;
                }
            }
            break;
        }
        this.lastTickDelta = var2_2;
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_5 || var4_5) ** GOTO lbl40
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = ar.hk - ar.dgwe("dgyw", dgwi(int ), (int)30)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ar.dgwe("dgyx", dgwb(int ), (int)36)) break;
                    v7 /* !! */  = (long)ar.dgwe("dgyy", dgwb(int ), (int)37);
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = ar.hk - ar.dgwe("dgyz", dgwi(int ), (int)31)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ar.dgwe("dgza", dgwb(int ), (int)38)) break;
                    v8 /* !! */  = (long)ar.dgwe("dgzb", dgwb(int ), (int)39);
                }
                this.scaleAnimation.update();
                if (var4_5 || var4_5) ** GOTO lbl40
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = ar.hk - ar.dgwe("dgzc", dgwi(int ), (int)32)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ar.dgwe("dgzd", dgwb(int ), (int)40)) break;
                    v9 /* !! */  = (long)ar.dgwe("dgze", dgwb(int ), (int)41);
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = ar.hk - ar.dgwe("dgzf", dgwi(int ), (int)33)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ar.dgwe("dgzg", dgwb(int ), (int)42)) break;
                    v10 /* !! */  = (long)ar.dgwe("dgzh", dgwb(int ), (int)43);
                }
                v11 = this.scaleAnimation.getOutput();
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = ar.hk - ar.dgwe("dgzi", dgwi(int ), (int)34)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ar.dgwe("dgzj", dgwb(int ), (int)44)) break;
                    v12 /* !! */  = (long)ar.dgwe("dgzk", dgwb(int ), (int)45);
                }
                v13 = v11.floatValue();
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_6 = ar.hk - ar.dgwe("dgzl", dgwi(int ), (int)35)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == ar.dgwe("dgzm", dgwb(int ), (int)46)) break;
                    v14 /* !! */  = (long)ar.dgwe("dgzn", dgwb(int ), (int)47);
                }
                var3_6 = my.clamp01(v13);
                if (var4_5 || var4_5) ** GOTO lbl40
                if (!(var3_6 <= ar.dgwe("dgzp", dgzo(int ), (int)48))) ** GOTO lbl100
                if (var4_5) ** GOTO lbl40
                return;
lbl100:
                // 1 sources

                if (var4_5 || var4_5) ** GOTO lbl40
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_7 = ar.hk - ar.dgwe("dgzq", dgwi(int ), (int)36)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == ar.dgwe("dgzr", dgwb(int ), (int)49)) break;
                    v15 /* !! */  = (long)ar.dgwe("dgzs", dgwb(int ), (int)50);
                }
                this.drawAppearing(var1_1, var3_6);
                if (!var4_5 && !var4_5) ** break;
                ** continue;
                return;
            }
lbl110:
            // 2 sources

            case 0: {
                var5_4 /* !! */  = (int)ar.dgwe("dgzt", dgwb(int ), (int)51);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 1: {
                var5_4 /* !! */  = (int)ar.dgwe("dgzu", dgwb(int ), (int)52);
                if (var6_3) {
                    throw null;
                }
            }
lbl119:
            // 4 sources

            case 2: {
                do {
                    var5_4 /* !! */  = (int)ar.dgwe("dgzv", dgwb(int ), (int)53);
                } while (!var6_3);
                throw null;
            }
lbl124:
            // 3 sources

            case 3: {
                var5_4 /* !! */  = (int)ar.dgwe("dgzw", dgwb(int ), (int)54);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl148
            }
            case 4: {
                var5_4 /* !! */  = (int)ar.dgwe("dgzx", dgwb(int ), (int)55);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl139
            }
            case 5: {
                var5_4 /* !! */  = (int)ar.dgwe("dgzy", dgwb(int ), (int)56);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl139:
            // 2 sources

            case 6: {
                var5_4 /* !! */  = (int)ar.dgwe("dgzz", dgwb(int ), (int)57);
                if (!var6_3) ** GOTO lbl124
                throw null;
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)ar.dgwe("dhaa", dgwb(int ), (int)58);
                    if (!var6_3) ** GOTO lbl110
                    throw null;
                }
            }
lbl148:
            // 2 sources

            case 8: {
                var5_4 /* !! */  = (int)ar.dgwe("dhab", dgwb(int ), (int)59);
                if (!var6_3) ** GOTO lbl119
                throw null;
            }
lbl152:
            // 2 sources

            case 9: {
                var5_4 /* !! */  = (int)ar.dgwe("dhac", dgwb(int ), (int)60);
                if (var6_3) {
                    throw null;
                }
            }
            case 10: {
                var5_4 /* !! */  = (int)ar.dgwe("dhad", dgwb(int ), (int)61);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl173
            }
lbl161:
            // 5 sources

            case 11: {
                var5_4 /* !! */  = (int)ar.dgwe("dhae", dgwb(int ), (int)62);
                if (!var6_3) ** GOTO lbl124
                throw null;
            }
            case 12: {
                var5_4 /* !! */  = (int)ar.dgwe("dhaf", dgwb(int ), (int)63);
                if (!var6_3) ** GOTO lbl161
                throw null;
            }
            case 13: {
                var5_4 /* !! */  = (int)ar.dgwe("dhag", dgwb(int ), (int)64);
                if (!var6_3) ** GOTO lbl161
                throw null;
            }
lbl173:
            // 2 sources

            case 14: {
                var5_4 /* !! */  = (int)ar.dgwe("dhah", dgwb(int ), (int)65);
                if (!var6_3) ** GOTO lbl161
                throw null;
            }
            case 15: 
        }
        var5_4 /* !! */  = (int)ar.dgwe("dhai", dgwb(int ), (int)66);
        ** while (!var6_3)
lbl180:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dhts() {
        ar.dgwj[100] = 7994305615623211951L;
        ar.dgwj[101] = -941777125035126370L;
        ar.dgwj[102] = -5253740329045577856L;
        ar.dgwj[103] = 8895487658015386415L;
        ar.dgwj[104] = -4853575966032339255L;
        ar.dgwj[105] = -2614551858261947227L;
        ar.dgwj[106] = -2537934376637064321L;
        ar.dgwj[107] = 2078204161918893109L;
        ar.dgwj[108] = 7819783850851233929L;
        ar.dgwj[109] = 4546069514463007548L;
        ar.dgwj[110] = 972227350045671174L;
        ar.dgwj[111] = 3153349105025348905L;
        ar.dgwj[112] = -7710980509332131666L;
        ar.dgwj[113] = 8974361148235224265L;
        ar.dgwj[114] = 6863859170667842297L;
        ar.dgwj[115] = -1378385776679206085L;
        ar.dgwj[116] = -2749546141956952929L;
        ar.dgwj[117] = 1151992335212116178L;
        ar.dgwj[118] = 2669483493757921442L;
        ar.dgwj[119] = -6056065417807931483L;
        ar.dgwj[120] = -5412266637915824057L;
        ar.dgwj[121] = 5873368615875870064L;
        ar.dgwj[122] = 8220790636804729025L;
        ar.dgwj[123] = -2302682191954232393L;
        ar.dgwj[124] = 3874020394566221314L;
        ar.dgwj[125] = -648004705811144841L;
        ar.dgwj[126] = -6565153658679027169L;
        ar.dgwj[127] = 1387054674199013140L;
        ar.dgwj[128] = 2430502169074693222L;
        ar.dgwj[129] = -1869599540863188950L;
        ar.dgwj[130] = -2806089535317455135L;
        ar.dgwj[131] = -6169226907211229138L;
        ar.dgwj[132] = 3300597218794241302L;
        ar.dgwj[133] = 129441781911989578L;
        ar.dgwj[134] = 5829464756813064421L;
        ar.dgwj[135] = 3432033738510611909L;
        ar.dgwj[136] = 4262553522262660783L;
        ar.dgwj[137] = -242259758196207631L;
        ar.dgwj[138] = -3003604972714368999L;
        ar.dgwj[139] = 7624174738725054093L;
        ar.dgwj[140] = -6079153840954120554L;
        ar.dgwj[141] = 6020189146662349977L;
        ar.dgwj[142] = -269267133378405829L;
        ar.dgwj[143] = 8544395966624570542L;
        ar.dgwj[144] = 1087238853795579973L;
        ar.dgwj[145] = -3397086100556223510L;
        ar.dgwj[146] = -1478765993675699884L;
        ar.dgwj[147] = 3968185991116236253L;
        ar.dgwj[148] = -3901571216901867819L;
        ar.dgwj[149] = -2822002767041988953L;
        ar.dgwj[150] = -3198559180796665818L;
        ar.dgwj[151] = -5528459516018061214L;
        ar.dgwj[152] = -1074010681862603088L;
        ar.dgwj[153] = 3562693642109541590L;
        ar.dgwj[154] = 8001015391854687139L;
        ar.dgwj[155] = 6733906062399602868L;
        ar.dgwj[156] = -8165305067980342220L;
        ar.dgwj[157] = -2453719068260654315L;
        ar.dgwj[158] = 6385394193600299173L;
        ar.dgwj[159] = -7299547799439304174L;
        ar.dgwj[160] = 415788560215064073L;
        ar.dgwj[161] = -3821761547094434787L;
        ar.dgwj[162] = -6633021674643857451L;
        ar.dgwj[163] = -8756061952585867180L;
        ar.dgwj[164] = -1130362211150511273L;
        ar.dgwj[165] = -7929477165748717146L;
        ar.dgwj[166] = -5558367945736677833L;
        ar.dgwj[167] = -6567740836180913350L;
        ar.dgwj[168] = -6825685879294410120L;
        ar.dgwj[169] = -4400245108776982932L;
        ar.dgwj[170] = 7224274740927706761L;
        ar.dgwj[171] = 8012491973560535708L;
        ar.dgwj[172] = 5693122640742748878L;
        ar.dgwj[173] = 3872582111669176255L;
        ar.dgwj[174] = 7131265677332599009L;
        ar.dgwj[175] = 5939913010780644296L;
        ar.dgwj[176] = -5242601191347725187L;
        ar.dgwj[177] = 7339552939041062788L;
        ar.dgwj[178] = -8642918706860383795L;
        ar.dgwj[179] = 7260145193457044968L;
        ar.dgwj[180] = 3340575045618214943L;
        ar.dgwj[181] = -2714392972084320087L;
        ar.dgwj[182] = 5870510642693756341L;
        ar.dgwj[183] = -444172072265379884L;
        ar.dgwj[184] = -8071783171280064020L;
        ar.dgwj[185] = 2229998112763280256L;
        ar.dgwj[186] = 4227280616068135005L;
        ar.dgwj[187] = -5388919360592579966L;
        ar.dgwj[188] = 2893709366478264452L;
        ar.dgwj[189] = 5238972452373187128L;
        ar.dgwj[190] = -1918725608487750795L;
        ar.dgwj[191] = -1858354195074701004L;
        ar.dgwj[192] = 485785707380415682L;
        ar.dgwj[193] = -7189770773927346447L;
        ar.dgwj[194] = 9174271104694868961L;
        ar.dgwj[195] = -3255329404202594957L;
        ar.dgwj[196] = 2331409297752886069L;
        ar.dgwj[197] = 4643535364128127669L;
        ar.dgwj[198] = 2088463897703596324L;
        ar.dgwj[199] = -1600048219450185402L;
    }

    private static /* synthetic */ int dgwb(int n2) {
        return dgwc[n2] ^ dgwd[n2];
    }

    private static /* synthetic */ void dhtq() {
        ar.dgwd[300] = 1827366125;
        ar.dgwd[301] = -346389376;
        ar.dgwd[302] = -240610348;
        ar.dgwd[303] = -1378391882;
        ar.dgwd[304] = 891663711;
        ar.dgwd[305] = -1484635269;
        ar.dgwd[306] = 538743689;
        ar.dgwd[307] = -1758911968;
        ar.dgwd[308] = -1831997656;
        ar.dgwd[309] = -1777758781;
        ar.dgwd[310] = -1380149202;
        ar.dgwd[311] = 1890507413;
        ar.dgwd[312] = 138108142;
        ar.dgwd[313] = 98733017;
        ar.dgwd[314] = 1502268787;
        ar.dgwd[315] = -1518962392;
        ar.dgwd[316] = 1398094097;
        ar.dgwd[317] = -2041973777;
        ar.dgwd[318] = -1050105185;
        ar.dgwd[319] = -144897503;
        ar.dgwd[320] = 500652340;
        ar.dgwd[321] = 442525593;
        ar.dgwd[322] = 262207020;
        ar.dgwd[323] = -373265931;
        ar.dgwd[324] = -140763098;
        ar.dgwd[325] = 1978800290;
        ar.dgwd[326] = 1559430544;
        ar.dgwd[327] = 1533158097;
        ar.dgwd[328] = 1788539537;
        ar.dgwd[329] = -324962019;
        ar.dgwd[330] = 166070391;
        ar.dgwd[331] = -1713047614;
        ar.dgwd[332] = -1476497702;
        ar.dgwd[333] = 590608264;
        ar.dgwd[334] = 1410695167;
        ar.dgwd[335] = -1031490157;
        ar.dgwd[336] = 892152179;
        ar.dgwd[337] = -221778439;
    }

    private static /* synthetic */ void dhtp() {
        ar.dgwd[200] = -1026274153;
        ar.dgwd[201] = -1538563258;
        ar.dgwd[202] = -412259423;
        ar.dgwd[203] = -2038010598;
        ar.dgwd[204] = 1260611531;
        ar.dgwd[205] = -2038275624;
        ar.dgwd[206] = 2124078280;
        ar.dgwd[207] = 1563733800;
        ar.dgwd[208] = 1848117998;
        ar.dgwd[209] = -1955593723;
        ar.dgwd[210] = 1185553832;
        ar.dgwd[211] = 1377206702;
        ar.dgwd[212] = -689926675;
        ar.dgwd[213] = 1067679749;
        ar.dgwd[214] = -1880754091;
        ar.dgwd[215] = -386934675;
        ar.dgwd[216] = 96036002;
        ar.dgwd[217] = 954339887;
        ar.dgwd[218] = -1219494360;
        ar.dgwd[219] = 737019119;
        ar.dgwd[220] = 433843533;
        ar.dgwd[221] = 1045383218;
        ar.dgwd[222] = 1919605013;
        ar.dgwd[223] = 643501652;
        ar.dgwd[224] = -1807127259;
        ar.dgwd[225] = 1499876527;
        ar.dgwd[226] = -169713298;
        ar.dgwd[227] = 791096675;
        ar.dgwd[228] = 736050593;
        ar.dgwd[229] = -2083281717;
        ar.dgwd[230] = 301184388;
        ar.dgwd[231] = 1541171281;
        ar.dgwd[232] = -2132990427;
        ar.dgwd[233] = -149949169;
        ar.dgwd[234] = 1732568659;
        ar.dgwd[235] = -2104842275;
        ar.dgwd[236] = -1338223473;
        ar.dgwd[237] = 414009150;
        ar.dgwd[238] = 579439739;
        ar.dgwd[239] = 281863882;
        ar.dgwd[240] = 919886582;
        ar.dgwd[241] = 340289681;
        ar.dgwd[242] = 1539698368;
        ar.dgwd[243] = 1467587394;
        ar.dgwd[244] = 969367850;
        ar.dgwd[245] = 1167488475;
        ar.dgwd[246] = -420885048;
        ar.dgwd[247] = 626696068;
        ar.dgwd[248] = -698409054;
        ar.dgwd[249] = -1036214488;
        ar.dgwd[250] = -466509989;
        ar.dgwd[251] = -602805104;
        ar.dgwd[252] = -167532876;
        ar.dgwd[253] = -901680099;
        ar.dgwd[254] = 1434805850;
        ar.dgwd[255] = -1720178812;
        ar.dgwd[256] = 1679393047;
        ar.dgwd[257] = -414502005;
        ar.dgwd[258] = 1449099960;
        ar.dgwd[259] = 530226939;
        ar.dgwd[260] = 805744824;
        ar.dgwd[261] = 285206732;
        ar.dgwd[262] = 1308028618;
        ar.dgwd[263] = -431126631;
        ar.dgwd[264] = -1940851323;
        ar.dgwd[265] = 1713510500;
        ar.dgwd[266] = 1961609129;
        ar.dgwd[267] = 760038892;
        ar.dgwd[268] = 507465348;
        ar.dgwd[269] = 1822079271;
        ar.dgwd[270] = -1293287166;
        ar.dgwd[271] = -249454023;
        ar.dgwd[272] = 800050347;
        ar.dgwd[273] = -665775821;
        ar.dgwd[274] = 709723781;
        ar.dgwd[275] = -1591431653;
        ar.dgwd[276] = -543704591;
        ar.dgwd[277] = -1913788113;
        ar.dgwd[278] = -720127742;
        ar.dgwd[279] = 1345927936;
        ar.dgwd[280] = -2010804339;
        ar.dgwd[281] = 166542118;
        ar.dgwd[282] = 571158532;
        ar.dgwd[283] = -1764625063;
        ar.dgwd[284] = 269898592;
        ar.dgwd[285] = 1887669711;
        ar.dgwd[286] = -267094324;
        ar.dgwd[287] = 594514059;
        ar.dgwd[288] = -1077356957;
        ar.dgwd[289] = -1280507388;
        ar.dgwd[290] = -1067615294;
        ar.dgwd[291] = -1127483500;
        ar.dgwd[292] = -554291219;
        ar.dgwd[293] = 652118629;
        ar.dgwd[294] = -616441162;
        ar.dgwd[295] = -822767434;
        ar.dgwd[296] = 856263793;
        ar.dgwd[297] = 230922439;
        ar.dgwd[298] = -1176497170;
        ar.dgwd[299] = -2021579822;
    }

    public static /* synthetic */ CallSite dgwe(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int getWidth() {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = hk - ar.dgwe("dhqq", dgwi(int ), (int)201)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == ar.dgwe("dhqr", dgwb(int ), (int)292)) break;
            object = ar.dgwe("dhqs", dgwb(int ), (int)293);
        }
        boolean bl2 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = hk - ar.dgwe("dhqt", dgwi(int ), (int)202)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == ar.dgwe("dhqu", dgwb(int ), (int)294)) break;
            object = ar.dgwe("dhqv", dgwb(int ), (int)295);
        }
        int n2 = b;
        Object object = hk;
        block6: while (true) {
            switch ((int)object) {
                case -1084782952: {
                    object = ar.dgwe("dhqx", dgwi(int ), (int)204) - ar.dgwe("dhqw", dgwi(int ), (int)203);
                    continue block6;
                }
                case 985720311: {
                    break block6;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return (int)ar.dgwe("dhqy", dgwb(int ), (int)296);
        if (bl3) return (int)ar.dgwe("dhqy", dgwb(int ), (int)296);
        while (true) {
            long l4;
            Object object2;
            if ((object2 = (l4 = hk - ar.dgwe("dhqz", dgwi(int ), (int)205)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object2 == ar.dgwe("dhra", dgwb(int ), (int)297)) {
                return this.width;
            }
            object2 = ar.dgwe("dhrb", dgwb(int ), (int)298);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void setHeight(int n2) {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = hk - ar.dgwe("dhsr", dgwi(int ), (int)222)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == ar.dgwe("dhss", dgwb(int ), (int)324)) break;
            object = ar.dgwe("dhst", dgwb(int ), (int)325);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = hk - ar.dgwe("dhsu", dgwi(int ), (int)223)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == ar.dgwe("dhsv", dgwb(int ), (int)326)) break;
            object = ar.dgwe("dhsw", dgwb(int ), (int)327);
        }
        int n3 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = hk - ar.dgwe("dhsx", dgwi(int ), (int)224)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == ar.dgwe("dhsy", dgwb(int ), (int)328)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = ar.dgwe("dhsz", dgwb(int ), (int)329);
        }
        if (bl2 || bl2) return;
        while (true) {
            long l5;
            Object object;
            if ((object = (l5 = hk - ar.dgwe("dhta", dgwi(int ), (int)225)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object == ar.dgwe("dhtb", dgwb(int ), (int)330)) {
                this.height = n2;
                if (bl2) return;
                break;
            }
            object = ar.dgwe("dhtc", dgwb(int ), (int)331);
        }
        if (!bl2) return;
    }

    /*
     * Exception decompiling
     */
    private void drawAppearing(class_332 var1_1, float var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 44[SWITCH]
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

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean visible() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = hk - ar.dgwe("dheq", dgwi(int ), (int)76)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == ar.dgwe("dher", dgwb(int ), (int)139)) break;
            object = ar.dgwe("dhes", dgwb(int ), (int)140);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = hk - ar.dgwe("dhet", dgwi(int ), (int)77)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == ar.dgwe("dheu", dgwb(int ), (int)141)) break;
            object = ar.dgwe("dhev", dgwb(int ), (int)142);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = hk - ar.dgwe("dhew", dgwi(int ), (int)78)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == ar.dgwe("dhex", dgwb(int ), (int)143)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = ar.dgwe("dhey", dgwb(int ), (int)144);
        }
        if (!bl2 && !bl2) {
            return (boolean)ar.dgwe("dhfa", dgwb(int ), (int)146);
        }
        if (n2 == 0) return (boolean)ar.dgwe("dhez", dgwb(int ), (int)145);
        switch (n2) {
            default: {
                return (boolean)ar.dgwe("dhez", dgwb(int ), (int)145);
            }
            case 2: {
                CallSite callSite = ar.dgwe("dhfd", dgwb(int ), (int)149);
                if (bl3) {
                    throw null;
                }
            }
            case 0: {
                CallSite callSite = ar.dgwe("dhfb", dgwb(int ), (int)147);
                if (bl3) {
                    throw null;
                }
            }
            case 1: {
                do {
                    CallSite callSite = ar.dgwe("dhfc", dgwb(int ), (int)148);
                } while (!bl3);
                throw null;
            }
            case 3: 
        }
        do {
            CallSite callSite = ar.dgwe("dhfe", dgwb(int ), (int)150);
        } while (!bl3);
        throw null;
    }

    private static /* synthetic */ void dhtm() {
        ar.dgwc[300] = 1827366124;
        ar.dgwc[301] = -346389373;
        ar.dgwc[302] = -240610345;
        ar.dgwc[303] = -1378391881;
        ar.dgwc[304] = 1162082442;
        ar.dgwc[305] = 151128077;
        ar.dgwc[306] = 538743688;
        ar.dgwc[307] = 1576855694;
        ar.dgwc[308] = -1831997655;
        ar.dgwc[309] = -1777758783;
        ar.dgwc[310] = -1380149202;
        ar.dgwc[311] = 1890507412;
        ar.dgwc[312] = 138108143;
        ar.dgwc[313] = -924838619;
        ar.dgwc[314] = -1502268788;
        ar.dgwc[315] = 510615457;
        ar.dgwc[316] = 1398094096;
        ar.dgwc[317] = 1296548575;
        ar.dgwc[318] = -1050105187;
        ar.dgwc[319] = -144897501;
        ar.dgwc[320] = 500652340;
        ar.dgwc[321] = 442525592;
        ar.dgwc[322] = 262207016;
        ar.dgwc[323] = -373265929;
        ar.dgwc[324] = -140763097;
        ar.dgwc[325] = 1272556805;
        ar.dgwc[326] = -1559430545;
        ar.dgwc[327] = 815743852;
        ar.dgwc[328] = -1788539538;
        ar.dgwc[329] = -1803209164;
        ar.dgwc[330] = -166070392;
        ar.dgwc[331] = 1742439347;
        ar.dgwc[332] = -1476497704;
        ar.dgwc[333] = 590608265;
        ar.dgwc[334] = 1410695166;
        ar.dgwc[335] = -1031490160;
        ar.dgwc[336] = 892152183;
        ar.dgwc[337] = -221778440;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void setWidth(int var1_1) {
        v0 /* !! */  = ar.hk;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(v1 - ar.dgwe("dhry", dgwi(int ), (int)215));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -57760196: {
                    v1 = ar.dgwe("dhrz", dgwi(int ), (int)216);
                    continue block14;
                }
                case 985720311: {
                    break block14;
                }
                case 1343047149: {
                    v1 = ar.dgwe("dhsa", dgwi(int ), (int)217);
                    continue block14;
                }
                case 1939253976: {
                    v1 = ar.dgwe("dhsb", dgwi(int ), (int)218);
                    continue block14;
                }
            }
            break;
        }
        var4_2 = ar.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ar.hk - ar.dgwe("dhsc", dgwi(int ), (int)219)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ar.dgwe("dhsd", dgwb(int ), (int)312)) break;
            v2 /* !! */  = (long)ar.dgwe("dhse", dgwb(int ), (int)313);
        }
        var3_3 /* !! */  = ar.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ar.hk - ar.dgwe("dhsf", dgwi(int ), (int)220)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ar.dgwe("dhsg", dgwb(int ), (int)314)) break;
            v3 /* !! */  = (long)ar.dgwe("dhsh", dgwb(int ), (int)315);
        }
        var2_4 = ar.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
lbl35:
                    // 2 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl35
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ar.hk - ar.dgwe("dhsi", dgwi(int ), (int)221)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ar.dgwe("dhsj", dgwb(int ), (int)316)) break;
                    v4 /* !! */  = (long)ar.dgwe("dhsk", dgwb(int ), (int)317);
                }
                this.width = var1_1;
                if (var2_4 || var2_4) ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)ar.dgwe("dhsl", dgwb(int ), (int)318);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl56
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)ar.dgwe("dhsm", dgwb(int ), (int)319);
                } while (!var4_2);
                throw null;
            }
lbl56:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)ar.dgwe("dhsn", dgwb(int ), (int)320);
                if (!var4_2) break;
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)ar.dgwe("dhso", dgwb(int ), (int)321);
                if (!var4_2) break;
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)ar.dgwe("dhsp", dgwb(int ), (int)322);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)ar.dgwe("dhsq", dgwb(int ), (int)323);
        ** while (!var4_2)
lbl72:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dhtj() {
        ar.dgwc[0] = -1702613129;
        ar.dgwc[1] = -136568742;
        ar.dgwc[2] = -287976046;
        ar.dgwc[3] = 1476024981;
        ar.dgwc[4] = -976387182;
        ar.dgwc[5] = -930254905;
        ar.dgwc[6] = -2094051202;
        ar.dgwc[7] = 959419383;
        ar.dgwc[8] = -2091449257;
        ar.dgwc[9] = -1823190938;
        ar.dgwc[10] = 389568860;
        ar.dgwc[11] = 25098613;
        ar.dgwc[12] = 1233299597;
        ar.dgwc[13] = 1610370990;
        ar.dgwc[14] = 817330519;
        ar.dgwc[15] = 991569825;
        ar.dgwc[16] = 132157046;
        ar.dgwc[17] = 1966802782;
        ar.dgwc[18] = 1660875696;
        ar.dgwc[19] = 2072749179;
        ar.dgwc[20] = 1619357710;
        ar.dgwc[21] = 1324642111;
        ar.dgwc[22] = -1161005965;
        ar.dgwc[23] = -658250801;
        ar.dgwc[24] = 1933176485;
        ar.dgwc[25] = 1382550229;
        ar.dgwc[26] = 930606371;
        ar.dgwc[27] = 255390296;
        ar.dgwc[28] = -1343019983;
        ar.dgwc[29] = 201726259;
        ar.dgwc[30] = -1135964249;
        ar.dgwc[31] = -976771791;
        ar.dgwc[32] = -1492572282;
        ar.dgwc[33] = -1134667045;
        ar.dgwc[34] = -1642094902;
        ar.dgwc[35] = -813052673;
        ar.dgwc[36] = 1807167914;
        ar.dgwc[37] = -515631863;
        ar.dgwc[38] = 478126186;
        ar.dgwc[39] = -1487540542;
        ar.dgwc[40] = -1529546116;
        ar.dgwc[41] = -939572886;
        ar.dgwc[42] = -417739557;
        ar.dgwc[43] = 1958490406;
        ar.dgwc[44] = 1497801877;
        ar.dgwc[45] = -305970694;
        ar.dgwc[46] = -1415523202;
        ar.dgwc[47] = -913124133;
        ar.dgwc[48] = -227153531;
        ar.dgwc[49] = -1044219566;
        ar.dgwc[50] = -1164172413;
        ar.dgwc[51] = 1084639337;
        ar.dgwc[52] = 383072343;
        ar.dgwc[53] = 911187013;
        ar.dgwc[54] = -104306235;
        ar.dgwc[55] = 958877865;
        ar.dgwc[56] = 619210021;
        ar.dgwc[57] = 711057425;
        ar.dgwc[58] = 2053439766;
        ar.dgwc[59] = -831823759;
        ar.dgwc[60] = 2080730297;
        ar.dgwc[61] = -1534967414;
        ar.dgwc[62] = -921744539;
        ar.dgwc[63] = 2095512879;
        ar.dgwc[64] = 495437679;
        ar.dgwc[65] = -2105538718;
        ar.dgwc[66] = -1068003799;
        ar.dgwc[67] = 1974706351;
        ar.dgwc[68] = 209378683;
        ar.dgwc[69] = 1782752143;
        ar.dgwc[70] = 548732114;
        ar.dgwc[71] = -1619642861;
        ar.dgwc[72] = 84107065;
        ar.dgwc[73] = -1497854334;
        ar.dgwc[74] = -1029402149;
        ar.dgwc[75] = 124172256;
        ar.dgwc[76] = 360497330;
        ar.dgwc[77] = -1316088436;
        ar.dgwc[78] = 1959643932;
        ar.dgwc[79] = 955990201;
        ar.dgwc[80] = -1376039765;
        ar.dgwc[81] = 1620276334;
        ar.dgwc[82] = 1078402830;
        ar.dgwc[83] = 299015856;
        ar.dgwc[84] = 1358579599;
        ar.dgwc[85] = 833119485;
        ar.dgwc[86] = 646240672;
        ar.dgwc[87] = -1425007003;
        ar.dgwc[88] = -1666492134;
        ar.dgwc[89] = 441041923;
        ar.dgwc[90] = 1334027894;
        ar.dgwc[91] = -1746657823;
        ar.dgwc[92] = -1641482200;
        ar.dgwc[93] = -781004216;
        ar.dgwc[94] = 1706512243;
        ar.dgwc[95] = -1327313286;
        ar.dgwc[96] = -1767334520;
        ar.dgwc[97] = 584878789;
        ar.dgwc[98] = 1637962983;
        ar.dgwc[99] = -498733102;
    }

    private static /* synthetic */ void dhtk() {
        ar.dgwc[100] = 1989924218;
        ar.dgwc[101] = 988440098;
        ar.dgwc[102] = 1089591472;
        ar.dgwc[103] = 1683238937;
        ar.dgwc[104] = -993129243;
        ar.dgwc[105] = 77062238;
        ar.dgwc[106] = 395482726;
        ar.dgwc[107] = 612593859;
        ar.dgwc[108] = -1140278212;
        ar.dgwc[109] = 1723097168;
        ar.dgwc[110] = -1825918735;
        ar.dgwc[111] = 228737140;
        ar.dgwc[112] = 1872805467;
        ar.dgwc[113] = 1287742065;
        ar.dgwc[114] = -889716050;
        ar.dgwc[115] = 1454549217;
        ar.dgwc[116] = -1030444460;
        ar.dgwc[117] = 1029594983;
        ar.dgwc[118] = -1808827913;
        ar.dgwc[119] = -362174952;
        ar.dgwc[120] = 1645798650;
        ar.dgwc[121] = 331564673;
        ar.dgwc[122] = 0x5EA5E55E;
        ar.dgwc[123] = 1069534312;
        ar.dgwc[124] = 1026914440;
        ar.dgwc[125] = -1438988174;
        ar.dgwc[126] = -1956530063;
        ar.dgwc[127] = 124545582;
        ar.dgwc[128] = -522043777;
        ar.dgwc[129] = 438259084;
        ar.dgwc[130] = -1562520554;
        ar.dgwc[131] = -129975105;
        ar.dgwc[132] = -1060771092;
        ar.dgwc[133] = 1356914976;
        ar.dgwc[134] = 1782386621;
        ar.dgwc[135] = 489876431;
        ar.dgwc[136] = -789420021;
        ar.dgwc[137] = -1572163359;
        ar.dgwc[138] = -584975915;
        ar.dgwc[139] = 449683777;
        ar.dgwc[140] = -1892684301;
        ar.dgwc[141] = 639385418;
        ar.dgwc[142] = 1090945647;
        ar.dgwc[143] = -2020965650;
        ar.dgwc[144] = -1583617861;
        ar.dgwc[145] = -1817107233;
        ar.dgwc[146] = 653834403;
        ar.dgwc[147] = 453200820;
        ar.dgwc[148] = -861887133;
        ar.dgwc[149] = 1511141682;
        ar.dgwc[150] = 94058292;
        ar.dgwc[151] = 814133927;
        ar.dgwc[152] = 1754447964;
        ar.dgwc[153] = 820245833;
        ar.dgwc[154] = -1761331080;
        ar.dgwc[155] = -963729082;
        ar.dgwc[156] = 492217098;
        ar.dgwc[157] = -617546000;
        ar.dgwc[158] = 1863475461;
        ar.dgwc[159] = -1018676610;
        ar.dgwc[160] = 1697678536;
        ar.dgwc[161] = 1252872477;
        ar.dgwc[162] = -724757454;
        ar.dgwc[163] = 1527518422;
        ar.dgwc[164] = -1684074263;
        ar.dgwc[165] = 508215671;
        ar.dgwc[166] = 131594508;
        ar.dgwc[167] = 600865472;
        ar.dgwc[168] = -474799145;
        ar.dgwc[169] = 1500489397;
        ar.dgwc[170] = -1735180784;
        ar.dgwc[171] = 474396705;
        ar.dgwc[172] = 1901960013;
        ar.dgwc[173] = -907166212;
        ar.dgwc[174] = 2055265892;
        ar.dgwc[175] = -1185926643;
        ar.dgwc[176] = -738707851;
        ar.dgwc[177] = -1695859326;
        ar.dgwc[178] = -1349184153;
        ar.dgwc[179] = 1741698054;
        ar.dgwc[180] = -195990666;
        ar.dgwc[181] = -1506161112;
        ar.dgwc[182] = -371314115;
        ar.dgwc[183] = -108905783;
        ar.dgwc[184] = -2067203025;
        ar.dgwc[185] = 255636467;
        ar.dgwc[186] = 377192460;
        ar.dgwc[187] = 702994067;
        ar.dgwc[188] = 994000571;
        ar.dgwc[189] = 711063765;
        ar.dgwc[190] = 1965178000;
        ar.dgwc[191] = 175778796;
        ar.dgwc[192] = -1711731016;
        ar.dgwc[193] = -1634204824;
        ar.dgwc[194] = -1743898710;
        ar.dgwc[195] = -1358989447;
        ar.dgwc[196] = 312069277;
        ar.dgwc[197] = -1360539683;
        ar.dgwc[198] = 377948803;
        ar.dgwc[199] = -1898644806;
    }

    private static /* synthetic */ long dgwi(int n2) {
        return dgwj[n2] ^ dgwk[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void setX(int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ar.hk - ar.dgwe("dhpe", dgwi(int ), (int)187)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ar.dgwe("dhpf", dgwb(int ), (int)268)) break;
            v0 /* !! */  = (long)ar.dgwe("dhpg", dgwb(int ), (int)269);
        }
        var4_2 = ar.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ar.hk - ar.dgwe("dhph", dgwi(int ), (int)188)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ar.dgwe("dhpi", dgwb(int ), (int)270)) break;
            v1 /* !! */  = (long)ar.dgwe("dhpj", dgwb(int ), (int)271);
        }
        var3_3 /* !! */  = ar.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ar.hk - ar.dgwe("dhpk", dgwi(int ), (int)189)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ar.dgwe("dhpl", dgwb(int ), (int)272)) break;
            v2 /* !! */  = (long)ar.dgwe("dhpm", dgwb(int ), (int)273);
        }
        var2_4 = ar.a;
        if (var4_2) {
            throw null;
lbl21:
            // 2 sources

            return;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl21
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = ar.hk - ar.dgwe("dhpn", dgwi(int ), (int)190)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ar.dgwe("dhpo", dgwb(int ), (int)274)) break;
                    v3 /* !! */  = (long)ar.dgwe("dhpp", dgwb(int ), (int)275);
                }
                this.x = var1_1;
                if (var2_4 || var2_4) ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)ar.dgwe("dhpq", dgwb(int ), (int)276);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl52
            }
lbl40:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)ar.dgwe("dhpr", dgwb(int ), (int)277);
                if (!var4_2) break;
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)ar.dgwe("dhps", dgwb(int ), (int)278);
                if (var4_2) {
                    throw null;
                }
            }
            case 3: {
                var3_3 /* !! */  = (int)ar.dgwe("dhpt", dgwb(int ), (int)279);
                if (!var4_2) ** GOTO lbl40
                throw null;
            }
lbl52:
            // 2 sources

            case 4: {
                do {
                    var3_3 /* !! */  = (int)ar.dgwe("dhpu", dgwb(int ), (int)280);
                } while (!var4_2);
                throw null;
            }
            case 5: 
        }
        do {
            var3_3 /* !! */  = (int)ar.dgwe("dhpv", dgwb(int ), (int)281);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public int getY() {
        v0 /* !! */  = ar.hk;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(ar.dgwe("dhoo", dgwi(int ), (int)180) - ar.dgwe("dhon", dgwi(int ), (int)179));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 985720311: {
                    break block16;
                }
                case 1427526020: {
                    continue block16;
                }
            }
            break;
        }
        var3_1 = ar.c;
        v1 /* !! */  = ar.hk;
        if (true) ** GOTO lbl15
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - ar.dgwe("dhop", dgwi(int ), (int)181));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2124466537: {
                    v2 = ar.dgwe("dhoq", dgwi(int ), (int)182);
                    continue block17;
                }
                case -1504742848: {
                    v2 = ar.dgwe("dhor", dgwi(int ), (int)183);
                    continue block17;
                }
                case -618191431: {
                    v2 = ar.dgwe("dhos", dgwi(int ), (int)184);
                    continue block17;
                }
                case 985720311: {
                    break block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = ar.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_0 = ar.hk - ar.dgwe("dhot", dgwi(int ), (int)185)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ar.dgwe("dhou", dgwb(int ), (int)259)) break;
                    v3 /* !! */  = (long)ar.dgwe("dhov", dgwb(int ), (int)260);
                }
                var1_3 = ar.a;
                if (var3_1) {
                    throw null;
                    return (int)ar.dgwe("dhow", dgwb(int ), (int)261);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = ar.hk - ar.dgwe("dhox", dgwi(int ), (int)186)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ar.dgwe("dhoy", dgwb(int ), (int)262)) break;
                    v4 /* !! */  = (long)ar.dgwe("dhoz", dgwb(int ), (int)263);
                }
                return this.y;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)ar.dgwe("dhpa", dgwb(int ), (int)264);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ar.dgwe("dhpb", dgwb(int ), (int)265);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ar.dgwe("dhpc", dgwb(int ), (int)266);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ar.dgwe("dhpd", dgwb(int ), (int)267);
        ** while (!var3_1)
lbl67:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dhtw() {
        ar.dgwk[200] = 1722012985772046629L;
        ar.dgwk[201] = -5672141330306043751L;
        ar.dgwk[202] = -5977982553268247409L;
        ar.dgwk[203] = -4222956320954960903L;
        ar.dgwk[204] = 2445883650017484197L;
        ar.dgwk[205] = -6705483869094457305L;
        ar.dgwk[206] = 189214526563879189L;
        ar.dgwk[207] = -135717581390671668L;
        ar.dgwk[208] = 1278434853047260397L;
        ar.dgwk[209] = -7511458832649027408L;
        ar.dgwk[210] = -1549669372215196059L;
        ar.dgwk[211] = 204804922837158150L;
        ar.dgwk[212] = -1344166727853732547L;
        ar.dgwk[213] = 1116767877345386954L;
        ar.dgwk[214] = 4136099339369271702L;
        ar.dgwk[215] = 4388322854941213116L;
        ar.dgwk[216] = 8146427462971713400L;
        ar.dgwk[217] = -4160360043855848112L;
        ar.dgwk[218] = -5973604464610164887L;
        ar.dgwk[219] = 5893883959708006739L;
        ar.dgwk[220] = -3987893347613090674L;
        ar.dgwk[221] = -1135186526135116809L;
        ar.dgwk[222] = 8228716699333579320L;
        ar.dgwk[223] = 1535811463839007125L;
        ar.dgwk[224] = 9171487003289783689L;
        ar.dgwk[225] = 3749142384128910218L;
    }

    private static /* synthetic */ void dhtt() {
        ar.dgwj[200] = 2303621300119760483L;
        ar.dgwj[201] = -2765955721020193869L;
        ar.dgwj[202] = 8803110827290154001L;
        ar.dgwj[203] = -1879928651605360001L;
        ar.dgwj[204] = 2725022124615974866L;
        ar.dgwj[205] = 7520364560325776294L;
        ar.dgwj[206] = -2313820504446333113L;
        ar.dgwj[207] = 7025869214004843457L;
        ar.dgwj[208] = -2961160857223446099L;
        ar.dgwj[209] = 295043736644756591L;
        ar.dgwj[210] = -8784889968220033881L;
        ar.dgwj[211] = -4854866432879009206L;
        ar.dgwj[212] = 2607082009931025356L;
        ar.dgwj[213] = -5989311910839683914L;
        ar.dgwj[214] = -915530864204272606L;
        ar.dgwj[215] = -5970483512479299955L;
        ar.dgwj[216] = -3616736281211541930L;
        ar.dgwj[217] = 9202867340066861925L;
        ar.dgwj[218] = -2266371791774254253L;
        ar.dgwj[219] = -7812079376522612048L;
        ar.dgwj[220] = -5039306996658085435L;
        ar.dgwj[221] = 8204302585689907108L;
        ar.dgwj[222] = -3163692840504232197L;
        ar.dgwj[223] = 751553241346852437L;
        ar.dgwj[224] = 3909289729970933533L;
        ar.dgwj[225] = 810205751724307395L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean isEnabled() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ar.hk - ar.dgwe("dhkr", dgwi(int ), (int)151)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ar.dgwe("dhks", dgwb(int ), (int)221)) break;
            v0 /* !! */  = (long)ar.dgwe("dhkt", dgwb(int ), (int)222);
        }
        var3_1 = ar.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ar.hk - ar.dgwe("dhkv", dgwi(int ), (int)152)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ar.dgwe("dhkw", dgwb(int ), (int)223)) break;
            v1 /* !! */  = (long)ar.dgwe("dhky", dgwb(int ), (int)224);
        }
        var2_2 = ar.b;
        v2 /* !! */  = ar.hk;
        if (true) ** GOTO lbl19
        block7: while (true) {
            v2 /* !! */  = (long)(v3 - ar.dgwe("dhkz", dgwi(int ), (int)153));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -245124374: {
                    v3 = ar.dgwe("dhlb", dgwi(int ), (int)154);
                    continue block7;
                }
                case -64938531: {
                    v3 = ar.dgwe("dhlc", dgwi(int ), (int)155);
                    continue block7;
                }
                case 985720311: {
                    break block7;
                }
            }
            break;
        }
        var1_3 = ar.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return (boolean)ar.dgwe("dhle", dgwb(int ), (int)225);
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = ar.hk - ar.dgwe("dhlh", dgwi(int ), (int)156)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == ar.dgwe("dhli", dgwb(int ), (int)226)) break;
            v4 /* !! */  = (long)ar.dgwe("dhlj", dgwb(int ), (int)227);
        }
        return this.enabled;
    }

    static {
        dgwc = new int[338];
        dgwd = new int[338];
        ar.dhtj();
        ar.dhtk();
        ar.dhtl();
        ar.dhtm();
        ar.dhtn();
        ar.dhto();
        ar.dhtp();
        ar.dhtq();
        dgwj = new long[226];
        dgwk = new long[226];
        ar.dhtr();
        ar.dhts();
        ar.dhtt();
        ar.dhtu();
        ar.dhtv();
        ar.dhtw();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public int getX() {
        v0 /* !! */  = ar.hk;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - ar.dgwe("dhnx", dgwi(int ), (int)170));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 679789173: {
                    v1 = ar.dgwe("dhny", dgwi(int ), (int)171);
                    continue block20;
                }
                case 897309392: {
                    v1 = ar.dgwe("dhnz", dgwi(int ), (int)172);
                    continue block20;
                }
                case 941946264: {
                    v1 = ar.dgwe("dhoa", dgwi(int ), (int)173);
                    continue block20;
                }
                case 985720311: {
                    break block20;
                }
            }
            break;
        }
        var3_1 = ar.c;
        v2 /* !! */  = ar.hk;
        if (true) ** GOTO lbl22
        block21: while (true) {
            v2 /* !! */  = (long)(ar.dgwe("dhoc", dgwi(int ), (int)175) - ar.dgwe("dhob", dgwi(int ), (int)174));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 985720311: {
                    break block21;
                }
                case 1055973562: {
                    continue block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = ar.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ar.hk - ar.dgwe("dhod", dgwi(int ), (int)176)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ar.dgwe("dhoe", dgwb(int ), (int)252)) break;
            v3 /* !! */  = (long)ar.dgwe("dhof", dgwb(int ), (int)253);
        }
        var1_3 = ar.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return (int)ar.dgwe("dhog", dgwb(int ), (int)254);
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = ar.hk;
                if (true) ** GOTO lbl48
                block24: while (true) {
                    v4 /* !! */  = (long)(ar.dgwe("dhoi", dgwi(int ), (int)178) - ar.dgwe("dhoh", dgwi(int ), (int)177));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -769204910: {
                            continue block24;
                        }
                        case 985720311: {
                            break block24;
                        }
                    }
                    break;
                }
                return this.x;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)ar.dgwe("dhoj", dgwb(int ), (int)255);
                } while (!var3_1);
                throw null;
            }
lbl59:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ar.dgwe("dhok", dgwb(int ), (int)256);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ar.dgwe("dhol", dgwb(int ), (int)257);
                if (!var3_1) ** GOTO lbl59
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)ar.dgwe("dhom", dgwb(int ), (int)258);
        } while (!var3_1);
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public float getLastTickDelta() {
        block25: {
            v0 /* !! */  = ar.hk;
            block10: while (true) {
                switch ((int)v0 /* !! */ ) {
                    case 985720311: {
                        break block10;
                    }
                    case 1670104682: {
                        v0 /* !! */  = (long)(ar.dgwe("dhkc", dgwi(int ), (int)147) - ar.dgwe("dhkb", dgwi(int ), (int)146));
                        continue block10;
                    }
                }
                break;
            }
            var3_1 = ar.c;
            while (true) {
                block26: {
                    if ((v1 /* !! */  = (cfr_temp_1 = ar.hk - ar.dgwe("dhkd", dgwi(int ), (int)148)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v1 /* !! */  != ar.dgwe("dhke", dgwb(int ), (int)210)) break block26;
                    var2_2 /* !! */  = ar.b;
                    if (var2_2 /* !! */  != 0) {
                        break;
                    }
                    ** GOTO lbl-1000
                }
                v1 /* !! */  = (long)ar.dgwe("dhkf", dgwb(int ), (int)211);
            }
            cfr_temp_0 = -2147483648;
            block12: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v2 /* !! */  = (cfr_temp_2 = ar.hk - ar.dgwe("dhkg", dgwi(int ), (int)149)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v2 /* !! */  == ar.dgwe("dhkh", dgwb(int ), (int)212)) {
                                var1_3 = ar.a;
                                if (var3_1) {
                                    throw null;
                                }
                                break;
                            }
                            v2 /* !! */  = (long)ar.dgwe("dhki", dgwb(int ), (int)213);
                        }
                        if (var1_3 != false) return (float)ar.dgwe("dhkj", dgzo(int ), (int)214);
                        if (var1_3 != false) return (float)ar.dgwe("dhkj", dgzo(int ), (int)214);
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_3 = ar.hk - ar.dgwe("dhkk", dgwi(int ), (int)150)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v3 /* !! */  == ar.dgwe("dhkl", dgwb(int ), (int)215)) {
                                return this.lastTickDelta;
                            }
                            v3 /* !! */  = (long)ar.dgwe("dhkm", dgwb(int ), (int)216);
                        }
                    }
                    case 0: {
                        ** break;
                    }
                    case 3: {
                        break block25;
                    }
lbl48:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)ar.dgwe("dhkn", dgwb(int ), (int)217);
                        cfr_temp_0 = 1;
                        if (!var3_1) continue block12;
                        throw null;
                    }
                    case 1: {
                        var2_2 /* !! */  = (int)ar.dgwe("dhko", dgwb(int ), (int)218);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)ar.dgwe("dhkp", dgwb(int ), (int)219);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)ar.dgwe("dhkq", dgwb(int ), (int)220);
        ** while (!var3_1)
lbl66:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dhtr() {
        ar.dgwj[0] = 7111078864389329333L;
        ar.dgwj[1] = 8269671403159767298L;
        ar.dgwj[2] = 8128638893772633001L;
        ar.dgwj[3] = 5256267240054021351L;
        ar.dgwj[4] = -3939904976148357538L;
        ar.dgwj[5] = 7651755170634198684L;
        ar.dgwj[6] = 5093924321206245252L;
        ar.dgwj[7] = -4723213943967051471L;
        ar.dgwj[8] = 4857195361479798888L;
        ar.dgwj[9] = -6816171567936733375L;
        ar.dgwj[10] = 324613412582374681L;
        ar.dgwj[11] = -6928789743725686623L;
        ar.dgwj[12] = -6768749367513965089L;
        ar.dgwj[13] = -3394502307608238431L;
        ar.dgwj[14] = -226413846534752036L;
        ar.dgwj[15] = -4106864743619953102L;
        ar.dgwj[16] = 2551132816609100350L;
        ar.dgwj[17] = -5448429519104726164L;
        ar.dgwj[18] = 2922989114011311710L;
        ar.dgwj[19] = -1704934601777049316L;
        ar.dgwj[20] = 5604262357217148525L;
        ar.dgwj[21] = 8796123360282665601L;
        ar.dgwj[22] = -6724564165723648809L;
        ar.dgwj[23] = -7440075534642170357L;
        ar.dgwj[24] = -8694999124920096634L;
        ar.dgwj[25] = -1327990042156426127L;
        ar.dgwj[26] = 5887429112009024193L;
        ar.dgwj[27] = 6929612263679742659L;
        ar.dgwj[28] = 3043187672285808041L;
        ar.dgwj[29] = -194460811842060317L;
        ar.dgwj[30] = 8168106309840481833L;
        ar.dgwj[31] = 3158841984905683520L;
        ar.dgwj[32] = 5659831195210992175L;
        ar.dgwj[33] = -1215871993526476913L;
        ar.dgwj[34] = 3370081139879387622L;
        ar.dgwj[35] = 4696921757648741430L;
        ar.dgwj[36] = 7830563490514240153L;
        ar.dgwj[37] = 2582698054020621270L;
        ar.dgwj[38] = -6473816647253354036L;
        ar.dgwj[39] = 8340461561865939539L;
        ar.dgwj[40] = 3921340883921571012L;
        ar.dgwj[41] = 5238510563670919210L;
        ar.dgwj[42] = -7041016813417532405L;
        ar.dgwj[43] = 2382323894952219457L;
        ar.dgwj[44] = 777124510625289030L;
        ar.dgwj[45] = -680266005045939949L;
        ar.dgwj[46] = 180723711892748072L;
        ar.dgwj[47] = 7498831366167426842L;
        ar.dgwj[48] = -6665647293337090118L;
        ar.dgwj[49] = -2393437143406215175L;
        ar.dgwj[50] = -8193958769422034469L;
        ar.dgwj[51] = -992398484302276690L;
        ar.dgwj[52] = -2389772475353613904L;
        ar.dgwj[53] = -3825610104770132101L;
        ar.dgwj[54] = 8380346900662387195L;
        ar.dgwj[55] = -7961633532688318633L;
        ar.dgwj[56] = -2778055586779604444L;
        ar.dgwj[57] = 2183047162525892508L;
        ar.dgwj[58] = -6360972123767054626L;
        ar.dgwj[59] = 638133436254942536L;
        ar.dgwj[60] = 1850351280234556126L;
        ar.dgwj[61] = -1662779770470592455L;
        ar.dgwj[62] = 3519311940367698321L;
        ar.dgwj[63] = -6649975555982576372L;
        ar.dgwj[64] = -3886770383340877361L;
        ar.dgwj[65] = -7182669767059531824L;
        ar.dgwj[66] = 1188499633290765840L;
        ar.dgwj[67] = -5846937026177597285L;
        ar.dgwj[68] = 254264771085296155L;
        ar.dgwj[69] = -1864617507973588589L;
        ar.dgwj[70] = -1035539404574993624L;
        ar.dgwj[71] = 6903952194385002242L;
        ar.dgwj[72] = -7678473216662127611L;
        ar.dgwj[73] = -1301782736561957724L;
        ar.dgwj[74] = 1321685112863305769L;
        ar.dgwj[75] = -1717875031065068284L;
        ar.dgwj[76] = -2026605954232736885L;
        ar.dgwj[77] = -5953077061537603764L;
        ar.dgwj[78] = 4775828138746602315L;
        ar.dgwj[79] = -4889526512882795794L;
        ar.dgwj[80] = 1290456928957705206L;
        ar.dgwj[81] = -1637120530378979774L;
        ar.dgwj[82] = 9150035092679348677L;
        ar.dgwj[83] = -3750162538823256458L;
        ar.dgwj[84] = -3553117031319713942L;
        ar.dgwj[85] = -409272215760854204L;
        ar.dgwj[86] = -5616551996764676562L;
        ar.dgwj[87] = 922508344277057885L;
        ar.dgwj[88] = 5872717124727498349L;
        ar.dgwj[89] = -7005968852693840129L;
        ar.dgwj[90] = 1210036566113727511L;
        ar.dgwj[91] = 4164256983152714144L;
        ar.dgwj[92] = -161305516132128878L;
        ar.dgwj[93] = -8590371105880631799L;
        ar.dgwj[94] = 2154575791983543868L;
        ar.dgwj[95] = -1109377392635579166L;
        ar.dgwj[96] = -5000212244575492358L;
        ar.dgwj[97] = 2944292367178718782L;
        ar.dgwj[98] = -6218255227880161821L;
        ar.dgwj[99] = 5026934588273300584L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void drawPanelOutline(class_332 var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int var8_8, float var9_9) {
        block46: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ar.hk - ar.dgwe("dhcx", dgwi(int ), (int)57)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ar.dgwe("dhcy", dgwb(int ), (int)113)) break;
                v0 /* !! */  = (long)ar.dgwe("dhcz", dgwb(int ), (int)114);
            }
            var12_10 = ar.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = ar.hk - ar.dgwe("dhda", dgwi(int ), (int)58)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == ar.dgwe("dhdb", dgwb(int ), (int)115)) break;
                v1 /* !! */  = (long)ar.dgwe("dhdc", dgwb(int ), (int)116);
            }
            var11_11 /* !! */  = ar.b;
            v2 /* !! */  = ar.hk;
            if (true) ** GOTO lbl17
            block31: while (true) {
                v2 /* !! */  = (long)(ar.dgwe("dhde", dgwi(int ), (int)60) - ar.dgwe("dhdd", dgwi(int ), (int)59));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case 612029959: {
                        continue block31;
                    }
                    case 985720311: {
                        break block31;
                    }
                }
                break;
            }
            var10_12 = ar.a;
            if (var12_10) {
                throw null;
lbl25:
                // 6 sources

                return;
            }
            if (var10_12 || var10_12) ** GOTO lbl25
            v3 /* !! */  = ar.hk;
            if (true) ** GOTO lbl32
            block33: while (true) {
                v3 /* !! */  = (long)(ar.dgwe("dhdg", dgwi(int ), (int)62) - ar.dgwe("dhdf", dgwi(int ), (int)61));
lbl32:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 658803552: {
                        continue block33;
                    }
                    case 985720311: {
                        break block33;
                    }
                }
                break;
            }
            if (this.outlineAppearAt >= ar.dgwe("dhdh", dgwi(int ), (int)63)) break block46;
            if (var10_12) ** GOTO lbl25
            v4 /* !! */  = ar.hk;
            if (true) ** GOTO lbl43
            block34: while (true) {
                v4 /* !! */  = (long)(v5 - ar.dgwe("dhdi", dgwi(int ), (int)64));
lbl43:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case 648757050: {
                        v5 = ar.dgwe("dhdj", dgwi(int ), (int)65);
                        continue block34;
                    }
                    case 985720311: {
                        break block34;
                    }
                    case 1368903094: {
                        v5 = ar.dgwe("dhdk", dgwi(int ), (int)66);
                        continue block34;
                    }
                }
                break;
            }
            v6 = System.currentTimeMillis();
            v7 /* !! */  = ar.hk;
            if (true) ** GOTO lbl57
            block35: while (true) {
                v7 /* !! */  = (long)(ar.dgwe("dhdm", dgwi(int ), (int)68) - ar.dgwe("dhdl", dgwi(int ), (int)67));
lbl57:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case 644556071: {
                        continue block35;
                    }
                    case 985720311: {
                        break block35;
                    }
                }
                break;
            }
            this.outlineAppearAt = v6;
            if (var10_12) ** GOTO lbl25
        }
        if (var10_12) ** GOTO lbl25
        if (var11_11 /* !! */  == 0) ** GOTO lbl-1000
        switch (var11_11 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var10_12) ** GOTO lbl25
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = ar.hk - ar.dgwe("dhdn", dgwi(int ), (int)69)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ar.dgwe("dhdo", dgwb(int ), (int)117)) break;
                    v8 /* !! */  = (long)ar.dgwe("dhdp", dgwb(int ), (int)118);
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = ar.hk - ar.dgwe("dhdq", dgwi(int ), (int)70)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ar.dgwe("dhdr", dgwb(int ), (int)119)) break;
                    v9 /* !! */  = (long)ar.dgwe("dhds", dgwb(int ), (int)120);
                }
                at.panelOutline(var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8, var9_9, this.outlineAppearAt);
                if (!var10_12 && !var10_12) ** break;
                ** continue;
                return;
            }
            case 0: {
                var11_11 /* !! */  = (int)ar.dgwe("dhdt", dgwb(int ), (int)121);
                if (var12_10) {
                    throw null;
                }
                ** GOTO lbl94
            }
lbl89:
            // 3 sources

            case 1: {
                var11_11 /* !! */  = (int)ar.dgwe("dhdu", dgwb(int ), (int)122);
                if (var12_10) {
                    throw null;
                }
                ** GOTO lbl112
            }
lbl94:
            // 2 sources

            case 2: {
                var11_11 /* !! */  = (int)ar.dgwe("dhdv", dgwb(int ), (int)123);
                if (var12_10) {
                    throw null;
                }
                ** GOTO lbl103
            }
lbl99:
            // 2 sources

            case 3: {
                var11_11 /* !! */  = (int)ar.dgwe("dhdw", dgwb(int ), (int)124);
                if (!var12_10) break;
                throw null;
            }
lbl103:
            // 2 sources

            case 4: {
                var11_11 /* !! */  = (int)ar.dgwe("dhdx", dgwb(int ), (int)125);
                if (!var12_10) ** GOTO lbl89
                throw null;
            }
lbl107:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var11_11 /* !! */  = (int)ar.dgwe("dhdy", dgwb(int ), (int)126);
                    if (!var12_10) ** GOTO lbl89
                    throw null;
                }
            }
lbl112:
            // 2 sources

            case 6: {
                var11_11 /* !! */  = (int)ar.dgwe("dhdz", dgwb(int ), (int)127);
                if (!var12_10) ** GOTO lbl107
                throw null;
            }
            case 7: {
                var11_11 /* !! */  = (int)ar.dgwe("dhea", dgwb(int ), (int)128);
                if (!var12_10) break;
                throw null;
            }
            case 8: {
                var11_11 /* !! */  = (int)ar.dgwe("dheb", dgwb(int ), (int)129);
                if (!var12_10) ** GOTO lbl99
                throw null;
            }
            case 9: 
        }
        var11_11 /* !! */  = (int)ar.dgwe("dhec", dgwb(int ), (int)130);
        ** while (!var12_10)
lbl127:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void tick() {
        v0 /* !! */  = ar.hk;
        if (true) ** GOTO lbl5
        block11: while (true) {
            v0 /* !! */  = (long)(v1 - ar.dgwe("dhed", dgwi(int ), (int)71));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -827962725: {
                    v1 = ar.dgwe("dhee", dgwi(int ), (int)72);
                    continue block11;
                }
                case 586287209: {
                    v1 = ar.dgwe("dhef", dgwi(int ), (int)73);
                    continue block11;
                }
                case 985720311: {
                    break block11;
                }
            }
            break;
        }
        var3_1 = ar.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ar.hk - ar.dgwe("dheg", dgwi(int ), (int)74)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ar.dgwe("dheh", dgwb(int ), (int)131)) break;
            v2 /* !! */  = (long)ar.dgwe("dhei", dgwb(int ), (int)132);
        }
        var2_2 /* !! */  = ar.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ar.hk - ar.dgwe("dhej", dgwi(int ), (int)75)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ar.dgwe("dhek", dgwb(int ), (int)133)) break;
            v3 /* !! */  = (long)ar.dgwe("dhel", dgwb(int ), (int)134);
        }
        var1_3 = ar.a;
        if (var3_1) {
            throw null;
            return;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ar.dgwe("dhem", dgwb(int ), (int)135);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl43:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)ar.dgwe("dhen", dgwb(int ), (int)136);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ar.dgwe("dheo", dgwb(int ), (int)137);
                if (!var3_1) ** GOTO lbl43
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ar.dgwe("dhep", dgwb(int ), (int)138);
        ** while (!var3_1)
lbl55:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void stopAnimation() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ar.hk - ar.dgwe("dhia", dgwi(int ), (int)123)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ar.dgwe("dhib", dgwb(int ), (int)180)) break;
            v0 /* !! */  = (long)ar.dgwe("dhic", dgwb(int ), (int)181);
        }
        var3_1 = ar.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ar.hk - ar.dgwe("dhid", dgwi(int ), (int)124)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ar.dgwe("dhie", dgwb(int ), (int)182)) break;
            v1 /* !! */  = (long)ar.dgwe("dhif", dgwb(int ), (int)183);
        }
        var2_2 /* !! */  = ar.b;
        v2 /* !! */  = ar.hk;
        if (true) ** GOTO lbl19
        block19: while (true) {
            v2 /* !! */  = (long)(ar.dgwe("dhih", dgwi(int ), (int)126) - ar.dgwe("dhig", dgwi(int ), (int)125));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1490645144: {
                    continue block19;
                }
                case 985720311: {
                    break block19;
                }
            }
            break;
        }
        var1_3 = ar.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ar.hk - ar.dgwe("dhii", dgwi(int ), (int)127)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ar.dgwe("dhij", dgwb(int ), (int)184)) break;
                    v3 /* !! */  = (long)ar.dgwe("dhik", dgwb(int ), (int)185);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = ar.hk - ar.dgwe("dhil", dgwi(int ), (int)128)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ar.dgwe("dhim", dgwb(int ), (int)186)) break;
                    v4 /* !! */  = (long)ar.dgwe("dhin", dgwb(int ), (int)187);
                }
                v5 /* !! */  = ar.hk;
                if (true) ** GOTO lbl49
                block23: while (true) {
                    v5 /* !! */  = (long)(v6 - ar.dgwe("dhio", dgwi(int ), (int)129));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -463338416: {
                            v6 = ar.dgwe("dhip", dgwi(int ), (int)130);
                            continue block23;
                        }
                        case 640826845: {
                            v6 = ar.dgwe("dhiq", dgwi(int ), (int)131);
                            continue block23;
                        }
                        case 985720311: {
                            break block23;
                        }
                    }
                    break;
                }
                this.scaleAnimation.setDirection(mx.BACKWARDS);
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl61:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)ar.dgwe("dhir", dgwb(int ), (int)188);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl78
            }
lbl66:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ar.dgwe("dhis", dgwb(int ), (int)189);
                if (!var3_1) ** GOTO lbl61
                throw null;
            }
lbl70:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ar.dgwe("dhit", dgwb(int ), (int)190);
                if (!var3_1) ** GOTO lbl66
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)ar.dgwe("dhiu", dgwb(int ), (int)191);
                if (!var3_1) ** GOTO lbl70
                throw null;
            }
lbl78:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ar.dgwe("dhiv", dgwb(int ), (int)192);
                if (!var3_1) ** GOTO lbl61
                throw null;
            }
            case 5: 
        }
        do {
            var2_2 /* !! */  = (int)ar.dgwe("dhiw", dgwb(int ), (int)193);
        } while (!var3_1);
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void setEnabled(boolean var1_1) {
        block25: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = ar.hk - ar.dgwe("dhlt", dgwi(int ), (int)157)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ar.dgwe("dhlv", dgwb(int ), (int)232)) break;
                v0 /* !! */  = (long)ar.dgwe("dhlw", dgwb(int ), (int)233);
            }
            var4_2 = ar.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_2 = ar.hk - ar.dgwe("dhly", dgwi(int ), (int)158)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == ar.dgwe("dhma", dgwb(int ), (int)234)) break;
                v1 /* !! */  = (long)ar.dgwe("dhmb", dgwb(int ), (int)235);
            }
            var3_3 /* !! */  = ar.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_3 = ar.hk - ar.dgwe("dhme", dgwi(int ), (int)159)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == ar.dgwe("dhmf", dgwb(int ), (int)236)) {
                    var2_4 = ar.a;
                    if (var4_2) {
                        throw null;
                    }
                    break;
                }
                v2 /* !! */  = (long)ar.dgwe("dhmg", dgwb(int ), (int)237);
            }
            if (var2_4 || var2_4) return;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_4 = ar.hk - ar.dgwe("dhmh", dgwi(int ), (int)160)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == ar.dgwe("dhmi", dgwb(int ), (int)238)) {
                    this.enabled = var1_1;
                    if (var2_4) return;
                    break;
                }
                v3 /* !! */  = (long)ar.dgwe("dhmj", dgwb(int ), (int)239);
            }
            if (var2_4) {
                return;
            }
            if (var3_3 /* !! */  == 0) return;
            cfr_temp_0 = -2147483648;
            block12: do {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: {
                        return;
                    }
                    case 0: {
                        ** break;
                    }
                    case 4: {
                        var3_3 /* !! */  = (int)ar.dgwe("dhmz", dgwb(int ), (int)244);
                        cfr_temp_0 = 1;
                        if (!var4_2) continue block12;
                        throw null;
                    }
                    case 5: {
                        break block25;
                    }
lbl48:
                    // 2 sources

                    while (true) {
                        var3_3 /* !! */  = (int)ar.dgwe("dhml", dgwb(int ), (int)240);
                        cfr_temp_0 = 3;
                        if (!var4_2) continue block12;
                        throw null;
                    }
                    case 3: {
                        var3_3 /* !! */  = (int)ar.dgwe("dhmx", dgwb(int ), (int)243);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)ar.dgwe("dhmt", dgwb(int ), (int)242);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 1: 
                }
                break;
            } while (true);
            var3_3 /* !! */  = (int)ar.dgwe("dhms", dgwb(int ), (int)241);
            if (var4_2) {
                throw null;
            }
        }
        var3_3 /* !! */  = (int)ar.dgwe("dhna", dgwb(int ), (int)245);
        ** while (!var4_2)
lbl70:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dhtl() {
        ar.dgwc[200] = -1026274153;
        ar.dgwc[201] = -1538563257;
        ar.dgwc[202] = 1214618680;
        ar.dgwc[203] = -2038010598;
        ar.dgwc[204] = -1260611532;
        ar.dgwc[205] = 471451104;
        ar.dgwc[206] = 2124078283;
        ar.dgwc[207] = 1563733802;
        ar.dgwc[208] = 1848117998;
        ar.dgwc[209] = -1955593721;
        ar.dgwc[210] = -1185553833;
        ar.dgwc[211] = 1247423075;
        ar.dgwc[212] = 689926674;
        ar.dgwc[213] = -1253318981;
        ar.dgwc[214] = -1332052206;
        ar.dgwc[215] = 386934674;
        ar.dgwc[216] = -844757233;
        ar.dgwc[217] = 954339884;
        ar.dgwc[218] = -1219494360;
        ar.dgwc[219] = 737019117;
        ar.dgwc[220] = 433843535;
        ar.dgwc[221] = 1045383219;
        ar.dgwc[222] = 94844910;
        ar.dgwc[223] = -643501653;
        ar.dgwc[224] = -1271249354;
        ar.dgwc[225] = 1499876526;
        ar.dgwc[226] = -169713297;
        ar.dgwc[227] = 226172512;
        ar.dgwc[228] = 736050594;
        ar.dgwc[229] = -2083281717;
        ar.dgwc[230] = 301184388;
        ar.dgwc[231] = 1541171281;
        ar.dgwc[232] = -2132990428;
        ar.dgwc[233] = -1523456800;
        ar.dgwc[234] = -1732568660;
        ar.dgwc[235] = 490759824;
        ar.dgwc[236] = -1338223474;
        ar.dgwc[237] = -2009113541;
        ar.dgwc[238] = -579439740;
        ar.dgwc[239] = 448114131;
        ar.dgwc[240] = 919886581;
        ar.dgwc[241] = 340289682;
        ar.dgwc[242] = 1539698371;
        ar.dgwc[243] = 1467587399;
        ar.dgwc[244] = 969367854;
        ar.dgwc[245] = 1167488475;
        ar.dgwc[246] = 420885047;
        ar.dgwc[247] = -188120717;
        ar.dgwc[248] = -698409053;
        ar.dgwc[249] = -1036214488;
        ar.dgwc[250] = -466509991;
        ar.dgwc[251] = -602805104;
        ar.dgwc[252] = 167532875;
        ar.dgwc[253] = -619684136;
        ar.dgwc[254] = 1949986913;
        ar.dgwc[255] = -1720178811;
        ar.dgwc[256] = 1679393046;
        ar.dgwc[257] = -414502006;
        ar.dgwc[258] = 1449099962;
        ar.dgwc[259] = -530226940;
        ar.dgwc[260] = 2019023374;
        ar.dgwc[261] = -585997196;
        ar.dgwc[262] = -1308028619;
        ar.dgwc[263] = -431129842;
        ar.dgwc[264] = -1940851321;
        ar.dgwc[265] = 1713510500;
        ar.dgwc[266] = 1961609130;
        ar.dgwc[267] = 760038895;
        ar.dgwc[268] = 507465349;
        ar.dgwc[269] = 158878479;
        ar.dgwc[270] = -1293287165;
        ar.dgwc[271] = 437851479;
        ar.dgwc[272] = 800050346;
        ar.dgwc[273] = -184418747;
        ar.dgwc[274] = 709723780;
        ar.dgwc[275] = 1261533423;
        ar.dgwc[276] = -543704588;
        ar.dgwc[277] = -1913788117;
        ar.dgwc[278] = -720127744;
        ar.dgwc[279] = 1345927941;
        ar.dgwc[280] = -2010804339;
        ar.dgwc[281] = 166542119;
        ar.dgwc[282] = -571158533;
        ar.dgwc[283] = -410852806;
        ar.dgwc[284] = -269898593;
        ar.dgwc[285] = 1714226726;
        ar.dgwc[286] = -267094321;
        ar.dgwc[287] = 594514057;
        ar.dgwc[288] = -1077356957;
        ar.dgwc[289] = -1280507392;
        ar.dgwc[290] = -1067615294;
        ar.dgwc[291] = -1127483504;
        ar.dgwc[292] = 554291218;
        ar.dgwc[293] = 1465562811;
        ar.dgwc[294] = -616441161;
        ar.dgwc[295] = 2002965504;
        ar.dgwc[296] = 1420150762;
        ar.dgwc[297] = 230922438;
        ar.dgwc[298] = -874995025;
        ar.dgwc[299] = -2021579824;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isDraggable() {
        v0 /* !! */  = ar.hk;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - ar.dgwe("dhjj", dgwi(int ), (int)137));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 985720311: {
                    break block17;
                }
                case 1319147226: {
                    v1 = ar.dgwe("dhjk", dgwi(int ), (int)138);
                    continue block17;
                }
                case 1918957337: {
                    v1 = ar.dgwe("dhjl", dgwi(int ), (int)139);
                    continue block17;
                }
                case 1940284553: {
                    v1 = ar.dgwe("dhjm", dgwi(int ), (int)140);
                    continue block17;
                }
            }
            break;
        }
        var3_1 = ar.c;
        v2 /* !! */  = ar.hk;
        if (true) ** GOTO lbl22
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - ar.dgwe("dhjn", dgwi(int ), (int)141));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -966019043: {
                    v3 = ar.dgwe("dhjo", dgwi(int ), (int)142);
                    continue block18;
                }
                case 985720311: {
                    break block18;
                }
                case 1895505413: {
                    v3 = ar.dgwe("dhjp", dgwi(int ), (int)143);
                    continue block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = ar.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ar.hk - ar.dgwe("dhjq", dgwi(int ), (int)144)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == ar.dgwe("dhjr", dgwb(int ), (int)201)) break;
            v4 /* !! */  = (long)ar.dgwe("dhjs", dgwb(int ), (int)202);
        }
        var1_3 = ar.a;
        if (var3_1) {
            throw null;
lbl41:
            // 2 sources

            return (boolean)ar.dgwe("dhjt", dgwb(int ), (int)203);
        }
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ar.hk - ar.dgwe("dhju", dgwi(int ), (int)145)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ar.dgwe("dhjv", dgwb(int ), (int)204)) break;
                    v5 /* !! */  = (long)ar.dgwe("dhjw", dgwb(int ), (int)205);
                }
                return this.draggable;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ar.dgwe("dhjx", dgwb(int ), (int)206);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl60:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)ar.dgwe("dhjy", dgwb(int ), (int)207);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ar.dgwe("dhjz", dgwb(int ), (int)208);
                if (!var3_1) ** GOTO lbl60
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ar.dgwe("dhka", dgwb(int ), (int)209);
        ** while (!var3_1)
lbl72:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void setY(int var1_1) {
        v0 /* !! */  = ar.hk;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - ar.dgwe("dhpw", dgwi(int ), (int)191));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1262934029: {
                    v1 = ar.dgwe("dhpx", dgwi(int ), (int)192);
                    continue block20;
                }
                case 763938343: {
                    v1 = ar.dgwe("dhpy", dgwi(int ), (int)193);
                    continue block20;
                }
                case 799866938: {
                    v1 = ar.dgwe("dhpz", dgwi(int ), (int)194);
                    continue block20;
                }
                case 985720311: {
                    break block20;
                }
            }
            break;
        }
        var4_2 = ar.c;
        v2 /* !! */  = ar.hk;
        if (true) ** GOTO lbl22
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - ar.dgwe("dhqa", dgwi(int ), (int)195));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1995045279: {
                    v3 = ar.dgwe("dhqb", dgwi(int ), (int)196);
                    continue block21;
                }
                case -1465667455: {
                    v3 = ar.dgwe("dhqc", dgwi(int ), (int)197);
                    continue block21;
                }
                case -858659851: {
                    v3 = ar.dgwe("dhqd", dgwi(int ), (int)198);
                    continue block21;
                }
                case 985720311: {
                    break block21;
                }
            }
            break;
        }
        var3_3 /* !! */  = ar.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ar.hk - ar.dgwe("dhqe", dgwi(int ), (int)199)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ar.dgwe("dhqf", dgwb(int ), (int)282)) break;
            v4 /* !! */  = (long)ar.dgwe("dhqg", dgwb(int ), (int)283);
        }
        var2_4 = ar.a;
        if (var4_2) {
            throw null;
lbl43:
            // 2 sources

            return;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl43
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ar.hk - ar.dgwe("dhqh", dgwi(int ), (int)200)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ar.dgwe("dhqi", dgwb(int ), (int)284)) break;
                    v5 /* !! */  = (long)ar.dgwe("dhqj", dgwb(int ), (int)285);
                }
                this.y = var1_1;
                if (var2_4 || var2_4) ** continue;
                return;
            }
lbl57:
            // 4 sources

            case 0: {
                var3_3 /* !! */  = (int)ar.dgwe("dhqk", dgwb(int ), (int)286);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)ar.dgwe("dhql", dgwb(int ), (int)287);
                if (!var4_2) ** GOTO lbl57
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)ar.dgwe("dhqm", dgwb(int ), (int)288);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: {
                var3_3 /* !! */  = (int)ar.dgwe("dhqn", dgwb(int ), (int)289);
                if (!var4_2) ** GOTO lbl57
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)ar.dgwe("dhqo", dgwb(int ), (int)290);
                if (!var4_2) ** GOTO lbl57
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)ar.dgwe("dhqp", dgwb(int ), (int)291);
        ** while (!var4_2)
lbl81:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dhto() {
        ar.dgwd[100] = 1989924215;
        ar.dgwd[101] = 988440119;
        ar.dgwd[102] = 1089591465;
        ar.dgwd[103] = 1683238928;
        ar.dgwd[104] = -993129240;
        ar.dgwd[105] = 77062220;
        ar.dgwd[106] = 395482739;
        ar.dgwd[107] = 612593870;
        ar.dgwd[108] = -1140278231;
        ar.dgwd[109] = 1723097182;
        ar.dgwd[110] = -1825918749;
        ar.dgwd[111] = 228737138;
        ar.dgwd[112] = 1872805450;
        ar.dgwd[113] = -1287742066;
        ar.dgwd[114] = 1206605980;
        ar.dgwd[115] = -1454549218;
        ar.dgwd[116] = 1518188147;
        ar.dgwd[117] = 1029594982;
        ar.dgwd[118] = -564960121;
        ar.dgwd[119] = -362174951;
        ar.dgwd[120] = 1199182840;
        ar.dgwd[121] = 331564673;
        ar.dgwd[122] = 1587930461;
        ar.dgwd[123] = 1069534313;
        ar.dgwd[124] = 1026914446;
        ar.dgwd[125] = -1438988176;
        ar.dgwd[126] = -1956530055;
        ar.dgwd[127] = 124545581;
        ar.dgwd[128] = -522043785;
        ar.dgwd[129] = 438259086;
        ar.dgwd[130] = -1562520546;
        ar.dgwd[131] = 129975104;
        ar.dgwd[132] = -2083572049;
        ar.dgwd[133] = 1356914977;
        ar.dgwd[134] = 33467247;
        ar.dgwd[135] = 489876428;
        ar.dgwd[136] = -789420022;
        ar.dgwd[137] = -1572163360;
        ar.dgwd[138] = -584975915;
        ar.dgwd[139] = 449683776;
        ar.dgwd[140] = 1959617878;
        ar.dgwd[141] = -639385419;
        ar.dgwd[142] = 340022699;
        ar.dgwd[143] = -2020965649;
        ar.dgwd[144] = 1633414868;
        ar.dgwd[145] = -1817107234;
        ar.dgwd[146] = 653834402;
        ar.dgwd[147] = 453200823;
        ar.dgwd[148] = -861887136;
        ar.dgwd[149] = 1511141682;
        ar.dgwd[150] = 94058293;
        ar.dgwd[151] = -814133928;
        ar.dgwd[152] = 454432996;
        ar.dgwd[153] = 820245837;
        ar.dgwd[154] = -1761331079;
        ar.dgwd[155] = -963729086;
        ar.dgwd[156] = 492217103;
        ar.dgwd[157] = -617545997;
        ar.dgwd[158] = 1863475457;
        ar.dgwd[159] = 1018676609;
        ar.dgwd[160] = -1544784121;
        ar.dgwd[161] = 1252872377;
        ar.dgwd[162] = 724757453;
        ar.dgwd[163] = -1427062534;
        ar.dgwd[164] = 1684074262;
        ar.dgwd[165] = 2025305429;
        ar.dgwd[166] = -131594509;
        ar.dgwd[167] = 18840823;
        ar.dgwd[168] = -474799152;
        ar.dgwd[169] = 1500489405;
        ar.dgwd[170] = -1735180774;
        ar.dgwd[171] = 474396710;
        ar.dgwd[172] = 1901960011;
        ar.dgwd[173] = -907166220;
        ar.dgwd[174] = 2055265900;
        ar.dgwd[175] = -1185926643;
        ar.dgwd[176] = -738707850;
        ar.dgwd[177] = -1695859323;
        ar.dgwd[178] = -1349184157;
        ar.dgwd[179] = 1741698054;
        ar.dgwd[180] = -195990665;
        ar.dgwd[181] = -180473044;
        ar.dgwd[182] = 371314114;
        ar.dgwd[183] = -1302641874;
        ar.dgwd[184] = -2067203026;
        ar.dgwd[185] = -209390807;
        ar.dgwd[186] = -377192461;
        ar.dgwd[187] = -1030818208;
        ar.dgwd[188] = 994000568;
        ar.dgwd[189] = 711063765;
        ar.dgwd[190] = 1965178001;
        ar.dgwd[191] = 175778797;
        ar.dgwd[192] = -1711731016;
        ar.dgwd[193] = -1634204821;
        ar.dgwd[194] = 1743898709;
        ar.dgwd[195] = 1457174134;
        ar.dgwd[196] = 312069277;
        ar.dgwd[197] = -1360539681;
        ar.dgwd[198] = 377948801;
        ar.dgwd[199] = -1898644806;
    }

    private static /* synthetic */ void dhtn() {
        ar.dgwd[0] = -1702613130;
        ar.dgwd[1] = -136568741;
        ar.dgwd[2] = -287976258;
        ar.dgwd[3] = 1476024986;
        ar.dgwd[4] = -976387182;
        ar.dgwd[5] = -930254905;
        ar.dgwd[6] = -2094051210;
        ar.dgwd[7] = 959419383;
        ar.dgwd[8] = -2091449262;
        ar.dgwd[9] = -1823190936;
        ar.dgwd[10] = 389568859;
        ar.dgwd[11] = 25098621;
        ar.dgwd[12] = 1233299613;
        ar.dgwd[13] = 1610370978;
        ar.dgwd[14] = 817330519;
        ar.dgwd[15] = 991569831;
        ar.dgwd[16] = 132157054;
        ar.dgwd[17] = 1966802779;
        ar.dgwd[18] = 1660875698;
        ar.dgwd[19] = 2072749182;
        ar.dgwd[20] = -1619357711;
        ar.dgwd[21] = 1593067720;
        ar.dgwd[22] = 1161005964;
        ar.dgwd[23] = -693566116;
        ar.dgwd[24] = -1933176486;
        ar.dgwd[25] = -800686576;
        ar.dgwd[26] = 930606375;
        ar.dgwd[27] = 255390296;
        ar.dgwd[28] = -1343019984;
        ar.dgwd[29] = 201726263;
        ar.dgwd[30] = -1135964250;
        ar.dgwd[31] = -976771786;
        ar.dgwd[32] = -1492572283;
        ar.dgwd[33] = -1134667042;
        ar.dgwd[34] = 1642094901;
        ar.dgwd[35] = 1053572421;
        ar.dgwd[36] = -1807167915;
        ar.dgwd[37] = -1681900626;
        ar.dgwd[38] = -478126187;
        ar.dgwd[39] = 558288428;
        ar.dgwd[40] = -1529546115;
        ar.dgwd[41] = 1082560729;
        ar.dgwd[42] = 417739556;
        ar.dgwd[43] = -1386995137;
        ar.dgwd[44] = -1497801878;
        ar.dgwd[45] = 891712097;
        ar.dgwd[46] = 1415523201;
        ar.dgwd[47] = -994698515;
        ar.dgwd[48] = -833208689;
        ar.dgwd[49] = 1044219565;
        ar.dgwd[50] = 513306105;
        ar.dgwd[51] = 1084639338;
        ar.dgwd[52] = 383072337;
        ar.dgwd[53] = 911187011;
        ar.dgwd[54] = -104306226;
        ar.dgwd[55] = 958877870;
        ar.dgwd[56] = 619210018;
        ar.dgwd[57] = 711057429;
        ar.dgwd[58] = 2053439773;
        ar.dgwd[59] = -831823745;
        ar.dgwd[60] = 2080730301;
        ar.dgwd[61] = -1534967419;
        ar.dgwd[62] = -921744531;
        ar.dgwd[63] = 2095512878;
        ar.dgwd[64] = 495437664;
        ar.dgwd[65] = -2105538715;
        ar.dgwd[66] = -1068003803;
        ar.dgwd[67] = 1974706350;
        ar.dgwd[68] = 77981089;
        ar.dgwd[69] = -1782752144;
        ar.dgwd[70] = 615478137;
        ar.dgwd[71] = -603376109;
        ar.dgwd[72] = -84107066;
        ar.dgwd[73] = 681654035;
        ar.dgwd[74] = 1029402148;
        ar.dgwd[75] = -1484907117;
        ar.dgwd[76] = 360497331;
        ar.dgwd[77] = 472908786;
        ar.dgwd[78] = 902679324;
        ar.dgwd[79] = -955990202;
        ar.dgwd[80] = -1307129682;
        ar.dgwd[81] = -1620276335;
        ar.dgwd[82] = 165369682;
        ar.dgwd[83] = -299015857;
        ar.dgwd[84] = 941541102;
        ar.dgwd[85] = 833119484;
        ar.dgwd[86] = 882362470;
        ar.dgwd[87] = -1425006997;
        ar.dgwd[88] = -1666492141;
        ar.dgwd[89] = 441041929;
        ar.dgwd[90] = 1334027902;
        ar.dgwd[91] = -1746657823;
        ar.dgwd[92] = -1641482194;
        ar.dgwd[93] = -781004224;
        ar.dgwd[94] = 1706512227;
        ar.dgwd[95] = -1327313294;
        ar.dgwd[96] = -1767334525;
        ar.dgwd[97] = 584878785;
        ar.dgwd[98] = 1637962984;
        ar.dgwd[99] = -498733118;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void resetPosition() {
        v0 /* !! */  = ar.hk;
        if (true) ** GOTO lbl5
        block33: while (true) {
            v0 /* !! */  = (long)(v1 - ar.dgwe("dgxd", dgwi(int ), (int)1));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2040743417: {
                    v1 = ar.dgwe("dgxe", dgwi(int ), (int)2);
                    continue block33;
                }
                case -834071158: {
                    v1 = ar.dgwe("dgxf", dgwi(int ), (int)3);
                    continue block33;
                }
                case 985720311: {
                    break block33;
                }
                case 1050774878: {
                    v1 = ar.dgwe("dgxg", dgwi(int ), (int)4);
                    continue block33;
                }
            }
            break;
        }
        var3_1 = ar.c;
        v2 /* !! */  = ar.hk;
        if (true) ** GOTO lbl22
        block34: while (true) {
            v2 /* !! */  = (long)(v3 - ar.dgwe("dgxh", dgwi(int ), (int)5));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -588302307: {
                    v3 = ar.dgwe("dgxi", dgwi(int ), (int)6);
                    continue block34;
                }
                case 985720311: {
                    break block34;
                }
                case 1134049882: {
                    v3 = ar.dgwe("dgxj", dgwi(int ), (int)7);
                    continue block34;
                }
            }
            break;
        }
        var2_2 /* !! */  = ar.b;
        v4 /* !! */  = ar.hk;
        if (true) ** GOTO lbl36
        block35: while (true) {
            v4 /* !! */  = (long)(v5 - ar.dgwe("dgxk", dgwi(int ), (int)8));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -535848112: {
                    v5 = ar.dgwe("dgxl", dgwi(int ), (int)9);
                    continue block35;
                }
                case 985720311: {
                    break block35;
                }
                case 1238777194: {
                    v5 = ar.dgwe("dgxm", dgwi(int ), (int)10);
                    continue block35;
                }
                case 1827472585: {
                    v5 = ar.dgwe("dgxn", dgwi(int ), (int)11);
                    continue block35;
                }
            }
            break;
        }
        var1_3 = ar.a;
        if (var3_1) {
            throw null;
lbl51:
            // 4 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl51
        v6 /* !! */  = ar.hk;
        if (true) ** GOTO lbl58
        block37: while (true) {
            v6 /* !! */  = (long)(v7 - ar.dgwe("dgxo", dgwi(int ), (int)12));
lbl58:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -2022605858: {
                    v7 = ar.dgwe("dgxp", dgwi(int ), (int)13);
                    continue block37;
                }
                case -867269156: {
                    v7 = ar.dgwe("dgxq", dgwi(int ), (int)14);
                    continue block37;
                }
                case -816279507: {
                    v7 = ar.dgwe("dgxr", dgwi(int ), (int)15);
                    continue block37;
                }
                case 985720311: {
                    break block37;
                }
            }
            break;
        }
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_0 = ar.hk - ar.dgwe("dgxs", dgwi(int ), (int)16)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == ar.dgwe("dgxt", dgwb(int ), (int)20)) break;
            v8 /* !! */  = (long)ar.dgwe("dgxu", dgwb(int ), (int)21);
        }
        this.x = this.defaultX;
        if (var1_3 || var1_3) ** GOTO lbl51
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_1 = ar.hk - ar.dgwe("dgxv", dgwi(int ), (int)17)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == ar.dgwe("dgxw", dgwb(int ), (int)22)) break;
            v9 /* !! */  = (long)ar.dgwe("dgxx", dgwb(int ), (int)23);
        }
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_2 = ar.hk - ar.dgwe("dgxy", dgwi(int ), (int)18)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == ar.dgwe("dgxz", dgwb(int ), (int)24)) break;
            v10 /* !! */  = (long)ar.dgwe("dgya", dgwb(int ), (int)25);
        }
        this.y = this.defaultY;
        if (var1_3) ** GOTO lbl51
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                return;
            }
lbl95:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)ar.dgwe("dgyb", dgwb(int ), (int)26);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl100:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ar.dgwe("dgyc", dgwb(int ), (int)27);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl110
            }
            case 2: {
                var2_2 /* !! */  = (int)ar.dgwe("dgyd", dgwb(int ), (int)28);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl110:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ar.dgwe("dgye", dgwb(int ), (int)29);
                if (!var3_1) ** GOTO lbl95
                throw null;
            }
lbl114:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)ar.dgwe("dgyf", dgwb(int ), (int)30);
                if (!var3_1) ** GOTO lbl95
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)ar.dgwe("dgyg", dgwb(int ), (int)31);
                if (!var3_1) ** GOTO lbl100
                throw null;
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ar.dgwe("dgyh", dgwb(int ), (int)32);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)ar.dgwe("dgyi", dgwb(int ), (int)33);
        ** while (!var3_1)
lbl130:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dhtu() {
        ar.dgwk[0] = -7111078864389329334L;
        ar.dgwk[1] = -813864071834814655L;
        ar.dgwk[2] = -3627721256800459035L;
        ar.dgwk[3] = -1506339020575699390L;
        ar.dgwk[4] = 7417571762601590579L;
        ar.dgwk[5] = 6296550151919507265L;
        ar.dgwk[6] = 7035634116549686530L;
        ar.dgwk[7] = -8358850873242927867L;
        ar.dgwk[8] = -6644512896772329914L;
        ar.dgwk[9] = 6007228813069687157L;
        ar.dgwk[10] = -5230069598205742176L;
        ar.dgwk[11] = -1473212271260531710L;
        ar.dgwk[12] = 3456605503778612724L;
        ar.dgwk[13] = -1835201170905066653L;
        ar.dgwk[14] = 2307113141611723064L;
        ar.dgwk[15] = -8477517437246077304L;
        ar.dgwk[16] = -4481609056669546353L;
        ar.dgwk[17] = -2581137108401072234L;
        ar.dgwk[18] = 1362640089585063164L;
        ar.dgwk[19] = -6148567761241971342L;
        ar.dgwk[20] = 6405423993658621129L;
        ar.dgwk[21] = -5875135374410048374L;
        ar.dgwk[22] = -5953668275251430484L;
        ar.dgwk[23] = -2059214466678052441L;
        ar.dgwk[24] = -964471605894502569L;
        ar.dgwk[25] = 3792311114791491742L;
        ar.dgwk[26] = 4097194923110954274L;
        ar.dgwk[27] = 8154884374119906802L;
        ar.dgwk[28] = 8938421156457621271L;
        ar.dgwk[29] = 1409213481474821977L;
        ar.dgwk[30] = 6965952723222552003L;
        ar.dgwk[31] = 6876002232990348113L;
        ar.dgwk[32] = -3491723630957087788L;
        ar.dgwk[33] = -461758318223096093L;
        ar.dgwk[34] = 7602166959109840490L;
        ar.dgwk[35] = 3310213730189868735L;
        ar.dgwk[36] = 5646796993531276975L;
        ar.dgwk[37] = -6089463551334323214L;
        ar.dgwk[38] = 8021631845528015918L;
        ar.dgwk[39] = -1322751129518593466L;
        ar.dgwk[40] = -5548480511067923498L;
        ar.dgwk[41] = 3093963988988280567L;
        ar.dgwk[42] = 5889057074060261720L;
        ar.dgwk[43] = 1120305454973067903L;
        ar.dgwk[44] = 4416529267388920146L;
        ar.dgwk[45] = 2490341603155914207L;
        ar.dgwk[46] = 3152351196752890025L;
        ar.dgwk[47] = -8029799465908227096L;
        ar.dgwk[48] = 295493067105926279L;
        ar.dgwk[49] = 3423200144215689014L;
        ar.dgwk[50] = -5032364612156030714L;
        ar.dgwk[51] = 6542616461958729418L;
        ar.dgwk[52] = 6161143307473141331L;
        ar.dgwk[53] = -55054342766113915L;
        ar.dgwk[54] = -8109169155279936084L;
        ar.dgwk[55] = -8420228694380727851L;
        ar.dgwk[56] = 1901112463240122744L;
        ar.dgwk[57] = 4262790577973634124L;
        ar.dgwk[58] = -2937836349953997858L;
        ar.dgwk[59] = -5153983365704260349L;
        ar.dgwk[60] = 970136630943931693L;
        ar.dgwk[61] = 8814109328473660684L;
        ar.dgwk[62] = -2260353557463540621L;
        ar.dgwk[63] = -6649975555982576372L;
        ar.dgwk[64] = 4513210147080650430L;
        ar.dgwk[65] = 6754075580245686276L;
        ar.dgwk[66] = 1479661185851915805L;
        ar.dgwk[67] = 7717001709149732672L;
        ar.dgwk[68] = 956764330447241524L;
        ar.dgwk[69] = 2894573624133673216L;
        ar.dgwk[70] = 5386738515167700313L;
        ar.dgwk[71] = -7236330556131248304L;
        ar.dgwk[72] = -7398283824924950108L;
        ar.dgwk[73] = 5853610598921903266L;
        ar.dgwk[74] = 2120690689678708330L;
        ar.dgwk[75] = 4933514677397281345L;
        ar.dgwk[76] = 8049783070045918365L;
        ar.dgwk[77] = -1108049964783872020L;
        ar.dgwk[78] = -1793193854306569112L;
        ar.dgwk[79] = -1616419535851990293L;
        ar.dgwk[80] = -7482389714968867096L;
        ar.dgwk[81] = 5102818989583133950L;
        ar.dgwk[82] = 6158614031295401888L;
        ar.dgwk[83] = -1640745364050240503L;
        ar.dgwk[84] = 4173436386116900730L;
        ar.dgwk[85] = 8234418311287316639L;
        ar.dgwk[86] = 6539524536994640508L;
        ar.dgwk[87] = 1101314098311490194L;
        ar.dgwk[88] = -2247636612313987055L;
        ar.dgwk[89] = -1739610079223558058L;
        ar.dgwk[90] = -4832224627842759412L;
        ar.dgwk[91] = 7911886470004585120L;
        ar.dgwk[92] = -6328595561111035411L;
        ar.dgwk[93] = -6632606496600082870L;
        ar.dgwk[94] = 6176629855652039010L;
        ar.dgwk[95] = -3865645283161373039L;
        ar.dgwk[96] = -193649260496971072L;
        ar.dgwk[97] = 5168813108350147559L;
        ar.dgwk[98] = 2855426201567880500L;
        ar.dgwk[99] = 1116531387329433688L;
    }

    private static /* synthetic */ float dgzo(int n2) {
        return Float.intBitsToFloat(dgwc[n2] ^ dgwd[n2]);
    }
}

