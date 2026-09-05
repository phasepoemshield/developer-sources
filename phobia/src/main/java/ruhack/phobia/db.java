/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_437
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_437;
import ruhack.phobia.az;

public class db
implements az {
    public static final int b;
    private static final long ip = 6093108799434079752L;
    private static long[] dpza;
    private static int[] dpzj;
    public class_437 screen;
    public static final boolean c;
    public static final boolean a;
    private static int[] dpzl;
    private static long[] dpyy;

    public db(class_437 class_4372) {
        int n2 = b;
        boolean bl2 = a;
        this.screen = class_4372;
    }

    private static /* synthetic */ void dqct() {
        db.dpza[0] = -7439908974746017928L;
        db.dpza[1] = -2883122711549265550L;
        db.dpza[2] = 344192282916601675L;
        db.dpza[3] = -6707113429759421918L;
        db.dpza[4] = -3246869156804080450L;
        db.dpza[5] = 7881446749444034612L;
        db.dpza[6] = -5351246756156302712L;
        db.dpza[7] = 2903614516919405439L;
        db.dpza[8] = 4290936785508355066L;
        db.dpza[9] = 7509887653967105521L;
        db.dpza[10] = 2718280599675869949L;
        db.dpza[11] = 8856379977525139366L;
        db.dpza[12] = 5743082605606057994L;
        db.dpza[13] = -1073271908329691772L;
        db.dpza[14] = 7484710465331639356L;
        db.dpza[15] = 2098016999511529835L;
    }

    private static /* synthetic */ void dqcg() {
        db.dpzl[0] = -52103039;
        db.dpzl[1] = 1283295003;
        db.dpzl[2] = 35348055;
        db.dpzl[3] = -2118807178;
        db.dpzl[4] = 1401246143;
        db.dpzl[5] = -547920047;
        db.dpzl[6] = -868997402;
        db.dpzl[7] = -1023615323;
        db.dpzl[8] = -903279409;
        db.dpzl[9] = 1043474331;
        db.dpzl[10] = 550804515;
        db.dpzl[11] = -1136892766;
        db.dpzl[12] = 558558557;
        db.dpzl[13] = 1608727525;
        db.dpzl[14] = -1163023845;
        db.dpzl[15] = 233591568;
        db.dpzl[16] = 2061578188;
        db.dpzl[17] = 186461036;
        db.dpzl[18] = -508419490;
        db.dpzl[19] = -276456908;
        db.dpzl[20] = 1263903165;
        db.dpzl[21] = -1499742886;
    }

    public static /* synthetic */ CallSite dpzc(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_437 getScreen() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = db.ip - db.dpzc("dpzg", dpyw(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == db.dpzc("dpzm", dpzi(int ), (int)0)) break;
            v0 /* !! */  = (long)db.dpzc("dpzo", dpzi(int ), (int)1);
        }
        var3_1 = db.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = db.ip - db.dpzc("dpzq", dpyw(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == db.dpzc("dpzu", dpzi(int ), (int)2)) break;
            v1 /* !! */  = (long)db.dpzc("dpzv", dpzi(int ), (int)3);
        }
        var2_2 /* !! */  = db.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = db.ip - db.dpzc("dpzw", dpyw(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == db.dpzc("dpzx", dpzi(int ), (int)4)) break;
            v2 /* !! */  = (long)db.dpzc("dpzy", dpzi(int ), (int)5);
        }
        var1_3 = db.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = db.ip;
                if (true) ** GOTO lbl35
                block16: while (true) {
                    v3 /* !! */  = (long)(v4 - db.dpzc("dpzz", dpyw(int ), (int)3));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1996049067: {
                            v4 = db.dpzc("dqab", dpyw(int ), (int)4);
                            continue block16;
                        }
                        case -1949804668: {
                            v4 = db.dpzc("dqag", dpyw(int ), (int)5);
                            continue block16;
                        }
                        case -1609351672: {
                            break block16;
                        }
                        case 719732685: {
                            v4 = db.dpzc("dqah", dpyw(int ), (int)6);
                            continue block16;
                        }
                    }
                    break;
                }
                return this.screen;
            }
lbl48:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)db.dpzc("dqaj", dpzi(int ), (int)6);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)db.dpzc("dqak", dpzi(int ), (int)7);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)db.dpzc("dqal", dpzi(int ), (int)8);
                    if (!var3_1) ** GOTO lbl48
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)db.dpzc("dqam", dpzi(int ), (int)9);
        ** while (!var3_1)
lbl64:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int dpzi(int n2) {
        return dpzj[n2] ^ dpzl[n2];
    }

    private static /* synthetic */ void dqco() {
        db.dpyy[0] = 8813702940142737308L;
        db.dpyy[1] = -6725011411642405275L;
        db.dpyy[2] = 5762893771882590229L;
        db.dpyy[3] = -8116994100148935959L;
        db.dpyy[4] = -5783208620137360592L;
        db.dpyy[5] = 3244082957631642401L;
        db.dpyy[6] = -703866885815155017L;
        db.dpyy[7] = 3125933240532523020L;
        db.dpyy[8] = -8875279305057554631L;
        db.dpyy[9] = -9033428348568595050L;
        db.dpyy[10] = 7683328767441470064L;
        db.dpyy[11] = 8357617273191969826L;
        db.dpyy[12] = 3650463184902456027L;
        db.dpyy[13] = 3456706725278578897L;
        db.dpyy[14] = 4743966895352890490L;
        db.dpyy[15] = -5701962076104866032L;
    }

    private static /* synthetic */ long dpyw(int n2) {
        return dpyy[n2] ^ dpza[n2];
    }

    static {
        dpzj = new int[22];
        dpzl = new int[22];
        db.dqcb();
        db.dqcg();
        dpyy = new long[16];
        dpza = new long[16];
        db.dqco();
        db.dqct();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setScreen(class_437 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = db.ip - db.dpzc("dqan", dpyw(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == db.dpzc("dqao", dpzi(int ), (int)10)) break;
            v0 /* !! */  = (long)db.dpzc("dqap", dpzi(int ), (int)11);
        }
        var4_2 = db.c;
        v1 /* !! */  = db.ip;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - db.dpzc("dqar", dpyw(int ), (int)8));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1609351672: {
                    break block19;
                }
                case 373349164: {
                    v2 = db.dpzc("dqat", dpyw(int ), (int)9);
                    continue block19;
                }
                case 1792484269: {
                    v2 = db.dpzc("dqau", dpyw(int ), (int)10);
                    continue block19;
                }
            }
            break;
        }
        var3_3 /* !! */  = db.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = db.ip - db.dpzc("dqax", dpyw(int ), (int)11)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == db.dpzc("dqaz", dpzi(int ), (int)12)) break;
            v3 /* !! */  = (long)db.dpzc("dqbb", dpzi(int ), (int)13);
        }
        var2_4 = db.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
lbl34:
                    // 2 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl34
                v4 /* !! */  = db.ip;
                if (true) ** GOTO lbl41
                block22: while (true) {
                    v4 /* !! */  = (long)(v5 - db.dpzc("dqbe", dpyw(int ), (int)12));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1609351672: {
                            break block22;
                        }
                        case -996001421: {
                            v5 = db.dpzc("dqbg", dpyw(int ), (int)13);
                            continue block22;
                        }
                        case 449604537: {
                            v5 = db.dpzc("dqbi", dpyw(int ), (int)14);
                            continue block22;
                        }
                        case 734697184: {
                            v5 = db.dpzc("dqbj", dpyw(int ), (int)15);
                            continue block22;
                        }
                    }
                    break;
                }
                this.screen = var1_1;
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl57:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)db.dpzc("dqbk", dpzi(int ), (int)14);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl70
            }
lbl62:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)db.dpzc("dqbm", dpzi(int ), (int)15);
                if (!var4_2) ** GOTO lbl57
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)db.dpzc("dqbp", dpzi(int ), (int)16);
                if (!var4_2) ** GOTO lbl57
                throw null;
            }
lbl70:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)db.dpzc("dqbq", dpzi(int ), (int)17);
                    if (!var4_2) ** GOTO lbl62
                    throw null;
                }
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)db.dpzc("dqbs", dpzi(int ), (int)18);
        ** while (!var4_2)
lbl78:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dqcb() {
        db.dpzj[0] = -52103040;
        db.dpzj[1] = 1204782215;
        db.dpzj[2] = -35348056;
        db.dpzj[3] = 725524135;
        db.dpzj[4] = 1401246142;
        db.dpzj[5] = -1331719206;
        db.dpzj[6] = -868997402;
        db.dpzj[7] = -1023615323;
        db.dpzj[8] = -903279412;
        db.dpzj[9] = 1043474330;
        db.dpzj[10] = 550804514;
        db.dpzj[11] = -1142334142;
        db.dpzj[12] = 558558556;
        db.dpzj[13] = 692187438;
        db.dpzj[14] = -1163023845;
        db.dpzj[15] = 233591570;
        db.dpzj[16] = 2061578189;
        db.dpzj[17] = 186461038;
        db.dpzj[18] = -508419489;
        db.dpzj[19] = -276456907;
        db.dpzj[20] = 1263903164;
        db.dpzj[21] = -1499742888;
    }
}

