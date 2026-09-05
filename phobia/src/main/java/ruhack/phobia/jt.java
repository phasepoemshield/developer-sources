/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.ka;
import ruhack.phobia.kb;
import ruhack.phobia.ke;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.kh;
import ruhack.phobia.nj;

public class jt
extends ds {
    public static final boolean c;
    private static long[] jerk;
    public static final int b;
    private static int[] jerp;
    private static int[] jero;
    public static final boolean a;
    private static long[] jerj;
    static final long re = 251678342597769755L;

    private static /* synthetic */ float jesg(int n2) {
        return Float.intBitsToFloat(jero[n2] ^ jerp[n2]);
    }

    private static /* synthetic */ void jetd() {
        jt.jerp[0] = -828596982;
        jt.jerp[1] = -2072161931;
        jt.jerp[2] = -1748204779;
        jt.jerp[3] = 533241334;
        jt.jerp[4] = 938463015;
        jt.jerp[5] = 1416453300;
        jt.jerp[6] = 1366291929;
        jt.jerp[7] = 786272152;
        jt.jerp[8] = 1950048589;
        jt.jerp[9] = 1890901188;
        jt.jerp[10] = -1735712081;
        jt.jerp[11] = 1358839296;
        jt.jerp[12] = 62958072;
        jt.jerp[13] = 489675364;
        jt.jerp[14] = 1425004812;
        jt.jerp[15] = -2131484358;
        jt.jerp[16] = -1769218388;
        jt.jerp[17] = 588155894;
        jt.jerp[18] = 503754006;
        jt.jerp[19] = 2088690543;
        jt.jerp[20] = -1075398323;
        jt.jerp[21] = -255269691;
        jt.jerp[22] = 739724118;
        jt.jerp[23] = -1119634290;
        jt.jerp[24] = -1278749451;
        jt.jerp[25] = -1151364279;
        jt.jerp[26] = 1142281132;
        jt.jerp[27] = -807115735;
        jt.jerp[28] = -1357216760;
        jt.jerp[29] = 565714858;
    }

    public static /* synthetic */ CallSite jerl(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    public jt() {
        int n2 = b;
        boolean bl2 = a;
        super("TestModule", "\u041c\u043e\u0434\u0443\u043b\u044c \u0434\u043b\u044f \u0442\u0435\u0441\u0442\u043e\u0432", du.RENDER);
        jx[] jxArray = new jx[10];
        jxArray[jt.jerl("jesd", jern(int ), (int)6)] = new ke("Multi Select", "\u0412\u044b\u0431\u0435\u0440\u0438 \u043d\u0435\u0441\u043a\u043e\u043b\u044c\u043a\u043e").value("Option 1", "Option 2", "Option 3", "Option 4", "Option 5");
        jxArray[jt.jerl("jese", jern(int ), (int)7)] = new kb("Tint", "\u0412\u043a\u043b\u044e\u0447\u0438\u0442\u044c \u044d\u0444\u0444\u0435\u043a\u0442 \u0442\u0438\u043d\u0442\u0430");
        jxArray[jt.jerl("jesf", jern(int ), (int)8)] = new kg("Tint Period", "\u0427\u0430\u0441\u0442\u043e\u0442\u0430 \u043c\u0438\u0433\u0430\u043d\u0438\u044f", (float)jt.jerl("jesh", jesg(int ), (int)9)).range((int)jt.jerl("jesi", jern(int ), (int)10), (int)jt.jerl("jesj", jern(int ), (int)11)).suffix(" \u043c\u0441");
        jxArray[jt.jerl("jesk", jern(int ), (int)12)] = new kg("Speed Two Color", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043f\u0435\u0440\u0435\u043b\u0438\u0432\u0430\u043d\u0438\u044f \u0446\u0432\u0435\u0442\u043e\u0432", (float)jt.jerl("jesl", jesg(int ), (int)13)).range((int)jt.jerl("jesm", jern(int ), (int)14), (int)jt.jerl("jesn", jern(int ), (int)15));
        jxArray[jt.jerl("jeso", jern(int ), (int)16)] = new kb("Show HUD", "\u042d\u0442\u0430 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 \u043f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u043e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0442\u044c \u0433\u0440\u0430\u0444\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u0438\u043d\u0442\u0435\u0440\u0444\u0435\u0439\u0441 \u043f\u043e\u0432\u0435\u0440\u0445 \u0438\u0433\u0440\u044b, \u043f\u0440\u0435\u0434\u043e\u0441\u0442\u0430\u0432\u043b\u044f\u044f \u0432\u0430\u0436\u043d\u0443\u044e \u0438\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u044e \u0432 \u0440\u0435\u0430\u043b\u044c\u043d\u043e\u043c \u0432\u0440\u0435\u043c\u0435\u043d\u0438 \u0434\u043b\u044f \u043b\u0443\u0447\u0448\u0435\u0433\u043e \u043a\u043e\u043d\u0442\u0440\u043e\u043b\u044f \u0441\u0438\u0442\u0443\u0430\u0446\u0438\u0438.").setValue((boolean)jt.jerl("jesp", jern(int ), (int)17));
        jxArray[jt.jerl("jesq", jern(int ), (int)18)] = new kg("Animation Speed", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0430\u043d\u0438\u043c\u0430\u0446\u0438\u0438 \u0438\u043d\u0442\u0435\u0440\u0444\u0435\u0439\u0441\u0430 \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u044f\u0435\u0442 \u043d\u0430\u0441\u043a\u043e\u043b\u044c\u043a\u043e \u043f\u043b\u0430\u0432\u043d\u043e \u0438 \u0431\u044b\u0441\u0442\u0440\u043e \u0431\u0443\u0434\u0443\u0442 \u043e\u0442\u043a\u0440\u044b\u0432\u0430\u0442\u044c\u0441\u044f \u043e\u043a\u043d\u0430 \u0438 \u043f\u0435\u0440\u0435\u043a\u043b\u044e\u0447\u0430\u0442\u044c\u0441\u044f \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u044b \u0443\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u044f \u0432 \u0447\u0438\u0442\u0435.", (float)jt.jerl("jesr", jesg(int ), (int)19)).range((int)jt.jerl("jess", jern(int ), (int)20), (int)jt.jerl("jest", jern(int ), (int)21));
        jxArray[jt.jerl("jesu", jern(int ), (int)22)] = new kf("Select", "\u0412\u044b\u0431\u043e\u0440 \u0440\u0435\u0436\u0438\u043c\u0430 \u0440\u0430\u0431\u043e\u0442\u044b \u043c\u043e\u0434\u0443\u043b\u044f \u043f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0430\u0434\u0430\u043f\u0442\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b \u043f\u043e\u0434 \u0440\u0430\u0437\u043d\u044b\u0435 \u0438\u0433\u0440\u043e\u0432\u044b\u0435 \u0441\u0438\u0442\u0443\u0430\u0446\u0438\u0438 \u0438 \u0441\u0435\u0440\u0432\u0435\u0440\u0430 \u0441 \u0440\u0430\u0437\u043b\u0438\u0447\u043d\u043e\u0439 \u0437\u0430\u0449\u0438\u0442\u043e\u0439.", "Totem", "Use", "Drink", "Totem", "Function", "Pickup");
        jxArray[jt.jerl("jesv", jern(int ), (int)23)] = new ke("Multi Select", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u043d\u0435\u0441\u043a\u043e\u043b\u044c\u043a\u043e \u0444\u0443\u043d\u043a\u0446\u0438\u0439 \u043e\u0434\u043d\u043e\u0432\u0440\u0435\u043c\u0435\u043d\u043d\u043e \u0434\u043b\u044f \u0441\u043e\u0437\u0434\u0430\u043d\u0438\u044f \u0443\u043d\u0438\u043a\u0430\u043b\u044c\u043d\u043e\u0439 \u043a\u043e\u043c\u0431\u0438\u043d\u0430\u0446\u0438\u0438 \u0441\u043f\u043e\u0441\u043e\u0431\u043d\u043e\u0441\u0442\u0435\u0439, \u043a\u043e\u0442\u043e\u0440\u0430\u044f \u0431\u0443\u0434\u0435\u0442 \u0440\u0430\u0431\u043e\u0442\u0430\u0442\u044c \u0441\u0438\u043d\u0445\u0440\u043e\u043d\u043d\u043e.").value("KillAura", "Fly", "Speed", "KillAura", "WallHack").selected("KillAura", "Fly");
        jxArray[jt.jerl("jesw", jern(int ), (int)24)] = new kh("Text", "\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043f\u0440\u043e\u0438\u0437\u0432\u043e\u043b\u044c\u043d\u044b\u0439 \u0442\u0435\u043a\u0441\u0442 \u0434\u043b\u044f \u043a\u0430\u0441\u0442\u043e\u043c\u0438\u0437\u0430\u0446\u0438\u0438 \u0432\u0438\u0437\u0443\u0430\u043b\u044c\u043d\u044b\u0445 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u043e\u0432 \u0438\u043b\u0438 \u0443\u043a\u0430\u0437\u0430\u043d\u0438\u044f \u0441\u043f\u0435\u0446\u0438\u0444\u0438\u0447\u0435\u0441\u043a\u0438\u0445 \u043f\u0430\u0440\u0430\u043c\u0435\u0442\u0440\u043e\u0432 \u0440\u0430\u0431\u043e\u0442\u044b \u0434\u0430\u043d\u043d\u043e\u0433\u043e \u043c\u043e\u0434\u0443\u043b\u044f.", "Default text");
        jxArray[jt.jerl("jesx", jern(int ), (int)25)] = new ka("Key", "\u041a\u043b\u0430\u0432\u0438\u0448\u0430 \u0434\u043b\u044f \u0432\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f");
        this.settings(jxArray);
    }

    private static /* synthetic */ int jern(int n2) {
        return jero[n2] ^ jerp[n2];
    }

    static {
        jero = new int[30];
        jerp = new int[30];
        jt.jetc();
        jt.jetd();
        jerj = new long[8];
        jerk = new long[8];
        jt.jete();
        jt.jetf();
    }

    private static /* synthetic */ void jetc() {
        jt.jero[0] = 828596981;
        jt.jero[1] = 1351274418;
        jt.jero[2] = -1748204780;
        jt.jero[3] = 533241332;
        jt.jero[4] = 938463012;
        jt.jero[5] = 1416453303;
        jt.jero[6] = 1366291929;
        jt.jero[7] = 786272153;
        jt.jero[8] = 1950048591;
        jt.jero[9] = 888986820;
        jt.jero[10] = -1735711909;
        jt.jero[11] = 1358838448;
        jt.jero[12] = 62958075;
        jt.jero[13] = 1558698596;
        jt.jero[14] = 1425004803;
        jt.jero[15] = -2131484408;
        jt.jero[16] = -1769218392;
        jt.jero[17] = 588155895;
        jt.jero[18] = 503754003;
        jt.jero[19] = 1023337327;
        jt.jero[20] = -1075398324;
        jt.jero[21] = -255269681;
        jt.jero[22] = 739724112;
        jt.jero[23] = -1119634295;
        jt.jero[24] = -1278749443;
        jt.jero[25] = -1151364288;
        jt.jero[26] = 1142281135;
        jt.jero[27] = -807115735;
        jt.jero[28] = -1357216758;
        jt.jero[29] = 565714859;
    }

    private static /* synthetic */ long jeri(int n2) {
        return jerj[n2] ^ jerk[n2];
    }

    private static /* synthetic */ void jete() {
        jt.jerj[0] = -9064221901938923449L;
        jt.jerj[1] = 4435105272071843167L;
        jt.jerj[2] = -1431171347420781973L;
        jt.jerj[3] = -6536491686697240380L;
        jt.jerj[4] = -876423668981757709L;
        jt.jerj[5] = 8248983924340815415L;
        jt.jerj[6] = 5871916531332054847L;
        jt.jerj[7] = 4652569954866041523L;
    }

    private static /* synthetic */ void jetf() {
        jt.jerk[0] = -8675966966286592295L;
        jt.jerk[1] = 7861575678123650619L;
        jt.jerk[2] = 2835244740377874313L;
        jt.jerk[3] = -1176811685449032945L;
        jt.jerk[4] = -6372521063692951215L;
        jt.jerk[5] = 6753237852319561834L;
        jt.jerk[6] = 3354195626497898951L;
        jt.jerk[7] = 5543731922338152118L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static jt getInstance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jt.re - jt.jerl("jerm", jeri(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jt.jerl("jerq", jern(int ), (int)0)) break;
            v0 /* !! */  = (long)jt.jerl("jerr", jern(int ), (int)1);
        }
        var2 = jt.c;
        v1 /* !! */  = jt.re;
        if (true) ** GOTO lbl12
        block20: while (true) {
            v1 /* !! */  = (long)(jt.jerl("jert", jeri(int ), (int)2) - jt.jerl("jers", jeri(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2144142821: {
                    break block20;
                }
                case -1932364683: {
                    continue block20;
                }
            }
            break;
        }
        var1_1 /* !! */  = jt.b;
        v2 /* !! */  = jt.re;
        if (true) ** GOTO lbl22
        block21: while (true) {
            v2 /* !! */  = (long)(jt.jerl("jerv", jeri(int ), (int)4) - jt.jerl("jeru", jeri(int ), (int)3));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2144142821: {
                    break block21;
                }
                case -1458345133: {
                    continue block21;
                }
            }
            break;
        }
        var0_2 = jt.a;
        if (var2) {
            throw null;
lbl30:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl30
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                v3 /* !! */  = jt.re;
                if (true) ** GOTO lbl41
                block23: while (true) {
                    v3 /* !! */  = (long)(v4 - jt.jerl("jerw", jeri(int ), (int)5));
lbl41:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2144142821: {
                            break block23;
                        }
                        case -345523797: {
                            v4 = jt.jerl("jerx", jeri(int ), (int)6);
                            continue block23;
                        }
                        case 1388145484: {
                            v4 = jt.jerl("jery", jeri(int ), (int)7);
                            continue block23;
                        }
                    }
                    break;
                }
                return nj.get(jt.class);
            }
lbl51:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)jt.jerl("jerz", jern(int ), (int)2);
                if (!var2) break;
                throw null;
            }
            case 1: {
                var1_1 /* !! */  = (int)jt.jerl("jesa", jern(int ), (int)3);
                if (var2) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)jt.jerl("jesb", jern(int ), (int)4);
                    if (!var2) ** GOTO lbl51
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)jt.jerl("jesc", jern(int ), (int)5);
        ** while (!var2)
lbl67:
        // 1 sources

        throw null;
    }
}

