/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Random;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import ruhack.phobia.hx;
import ruhack.phobia.hy;
import ruhack.phobia.ms;
import ruhack.phobia.mt;
import ruhack.phobia.ov;
import ruhack.phobia.ow;

public class ic
extends hx {
    private float lastStepPitch;
    public static final boolean c;
    private static final long nb = -1545751933976112963L;
    private static long[] fxaf;
    private long sideDetourStartedAt;
    private final hy fallback;
    private int detourTickCounter;
    private float sideDetourStartYaw;
    private float lastStepYaw;
    private static final long SIDE_DETOUR_DURATION_MS = 350L;
    private static int[] fxam;
    private float sideDetourTargetYaw;
    public static final boolean a;
    private static final long SIDE_DETOUR_TURN_MS = 140L;
    private static final float WANDER_SIGMA = 0.09f;
    private static long[] fxag;
    private final Random random;
    private int lastDetourTick;
    private float wanderYaw;
    private static final int SIDE_DETOUR_INTERVAL_TICKS = 40;
    public static final int b;
    private static final float SIDE_DETOUR_ANGLE = 35.0f;
    private long lastCallAt;
    private final mt model;
    private float sideDetourPitch;
    private float wanderPitch;
    private int lastEntityId;
    private long sideDetourUntil;
    private static final float WANDER_THETA = 0.042f;
    private static int[] fxal;

    private static /* synthetic */ long fxae(int n2) {
        return fxaf[n2] ^ fxag[n2];
    }

    private static /* synthetic */ void gbed() {
        ic.fxaf[200] = -1463070267283009808L;
        ic.fxaf[201] = -8924673518295593827L;
        ic.fxaf[202] = 6666237375679677745L;
        ic.fxaf[203] = 8534525227167938096L;
        ic.fxaf[204] = -2421437301327736306L;
        ic.fxaf[205] = 7255402540200731984L;
        ic.fxaf[206] = 188093850060070906L;
        ic.fxaf[207] = -5557336102213462122L;
        ic.fxaf[208] = 6677513343409653192L;
        ic.fxaf[209] = 6854970714585211715L;
        ic.fxaf[210] = -1200681097469843830L;
        ic.fxaf[211] = -4095530136795442629L;
        ic.fxaf[212] = 5912529301457694486L;
        ic.fxaf[213] = -7810253266787472734L;
        ic.fxaf[214] = -1639421314470784659L;
        ic.fxaf[215] = -7659601116678568550L;
        ic.fxaf[216] = -174713344274548043L;
        ic.fxaf[217] = 8910083347342458482L;
        ic.fxaf[218] = 3308312335423758140L;
        ic.fxaf[219] = 6183731548788227302L;
        ic.fxaf[220] = 4712222595448767512L;
    }

    private static /* synthetic */ void gaak() {
        ic.fxal[200] = 1602690846;
        ic.fxal[201] = 1192179808;
        ic.fxal[202] = -858427908;
        ic.fxal[203] = -1207652290;
        ic.fxal[204] = 1192134022;
        ic.fxal[205] = 936183080;
        ic.fxal[206] = -326224495;
        ic.fxal[207] = 1939351014;
        ic.fxal[208] = 637944892;
        ic.fxal[209] = -463819981;
        ic.fxal[210] = 505180194;
        ic.fxal[211] = -734305713;
        ic.fxal[212] = 485508776;
        ic.fxal[213] = -467124249;
        ic.fxal[214] = 32424094;
        ic.fxal[215] = -1140777938;
        ic.fxal[216] = 1847813635;
        ic.fxal[217] = -2088693263;
        ic.fxal[218] = 1295967759;
        ic.fxal[219] = -637620352;
        ic.fxal[220] = 878104041;
        ic.fxal[221] = -975011457;
        ic.fxal[222] = 381635047;
        ic.fxal[223] = 433348834;
        ic.fxal[224] = -992422184;
        ic.fxal[225] = 1222535401;
        ic.fxal[226] = 1998279042;
        ic.fxal[227] = 2016089765;
        ic.fxal[228] = -1494399108;
        ic.fxal[229] = -1098384156;
        ic.fxal[230] = -1733719285;
        ic.fxal[231] = -1080355150;
        ic.fxal[232] = -1860554936;
        ic.fxal[233] = -319535200;
        ic.fxal[234] = -1072953720;
        ic.fxal[235] = 1990428686;
        ic.fxal[236] = -974531406;
        ic.fxal[237] = 482838325;
        ic.fxal[238] = 363874286;
        ic.fxal[239] = 1686297650;
        ic.fxal[240] = 2054330019;
        ic.fxal[241] = -1846654163;
        ic.fxal[242] = 1341313912;
        ic.fxal[243] = -868667121;
        ic.fxal[244] = 428718590;
        ic.fxal[245] = 1072163910;
        ic.fxal[246] = -780430176;
        ic.fxal[247] = 1792551088;
        ic.fxal[248] = -1049952051;
        ic.fxal[249] = -681302227;
        ic.fxal[250] = 1718655792;
        ic.fxal[251] = 531279918;
        ic.fxal[252] = -436860814;
        ic.fxal[253] = -646128397;
        ic.fxal[254] = -282824304;
        ic.fxal[255] = -641910470;
        ic.fxal[256] = -188998515;
        ic.fxal[257] = 2001206695;
        ic.fxal[258] = 524754104;
        ic.fxal[259] = -499208364;
        ic.fxal[260] = -1490583747;
        ic.fxal[261] = -1088970742;
        ic.fxal[262] = -1396179969;
        ic.fxal[263] = 659317670;
        ic.fxal[264] = -881251490;
        ic.fxal[265] = 681100725;
        ic.fxal[266] = 1102015977;
        ic.fxal[267] = -1765323644;
        ic.fxal[268] = -72774287;
        ic.fxal[269] = 1986512344;
        ic.fxal[270] = -1944470435;
        ic.fxal[271] = -397595472;
        ic.fxal[272] = 408733155;
        ic.fxal[273] = -563560646;
        ic.fxal[274] = 1418914648;
        ic.fxal[275] = -2038246814;
        ic.fxal[276] = -1541030132;
        ic.fxal[277] = -130750431;
        ic.fxal[278] = -928563940;
        ic.fxal[279] = 2128175843;
        ic.fxal[280] = -2021001487;
        ic.fxal[281] = -872514173;
        ic.fxal[282] = -1982578731;
        ic.fxal[283] = -247565721;
        ic.fxal[284] = 2140531815;
        ic.fxal[285] = -103337963;
        ic.fxal[286] = 1899185152;
        ic.fxal[287] = -6021348;
        ic.fxal[288] = -153281543;
        ic.fxal[289] = 902715610;
        ic.fxal[290] = -595742752;
        ic.fxal[291] = 1114038748;
        ic.fxal[292] = -1580352829;
        ic.fxal[293] = -1157703916;
        ic.fxal[294] = -1384056437;
        ic.fxal[295] = -1863292664;
        ic.fxal[296] = -1911122394;
        ic.fxal[297] = -909499642;
        ic.fxal[298] = -1432625076;
        ic.fxal[299] = -2099242566;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float randGauss() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = nb - ic.fxai("fzuu", fxae(int ), (int)195)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == ic.fxai("fzuv", fxak(int ), (int)429)) break;
            object = ic.fxai("fzuw", fxak(int ), (int)430);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = nb - ic.fxai("fzux", fxae(int ), (int)196)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == ic.fxai("fzuy", fxak(int ), (int)431)) break;
            object = ic.fxai("fzva", fxak(int ), (int)432);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = nb - ic.fxai("fzvc", fxae(int ), (int)197)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == ic.fxai("fzve", fxak(int ), (int)433)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = ic.fxai("fzvg", fxak(int ), (int)434);
        }
        if (bl2) return (float)ic.fxai("fzvi", fxki(int ), (int)435);
        if (bl2) return (float)ic.fxai("fzvi", fxki(int ), (int)435);
        Object object = nb;
        block7: while (true) {
            switch ((int)object) {
                case -1324085238: {
                    object = ic.fxai("fzvl", fxae(int ), (int)199) - ic.fxai("fzvk", fxae(int ), (int)198);
                    continue block7;
                }
                case 1216024765: {
                    break block7;
                }
            }
            break;
        }
        while (true) {
            long l5;
            Object object2;
            if ((object2 = (l5 = nb - ic.fxai("fzvn", fxae(int ), (int)200)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object2 == ic.fxai("fzvp", fxak(int ), (int)436)) {
                return (float)this.random.nextGaussian();
            }
            object2 = ic.fxai("fzvr", fxak(int ), (int)437);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void resetWander() {
        v0 /* !! */  = ic.nb;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - ic.fxai("fxck", fxae(int ), (int)10));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1963874392: {
                    v1 = ic.fxai("fxcl", fxae(int ), (int)11);
                    continue block22;
                }
                case -951796015: {
                    v1 = ic.fxai("fxcm", fxae(int ), (int)12);
                    continue block22;
                }
                case -247669102: {
                    v1 = ic.fxai("fxcn", fxae(int ), (int)13);
                    continue block22;
                }
                case 1216024765: {
                    break block22;
                }
            }
            break;
        }
        var3_1 = ic.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ic.nb - ic.fxai("fxco", fxae(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ic.fxai("fxcq", fxak(int ), (int)26)) break;
            v2 /* !! */  = (long)ic.fxai("fxct", fxak(int ), (int)27);
        }
        var2_2 /* !! */  = ic.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ic.nb - ic.fxai("fxcv", fxae(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ic.fxai("fxcw", fxak(int ), (int)28)) break;
            v3 /* !! */  = (long)ic.fxai("fxcx", fxak(int ), (int)29);
        }
        var1_3 = ic.a;
        if (var3_1) {
            throw null;
lbl32:
            // 4 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = ic.nb - ic.fxai("fxcz", fxae(int ), (int)16)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ic.fxai("fxdb", fxak(int ), (int)30)) break;
            v4 /* !! */  = (long)ic.fxai("fxdc", fxak(int ), (int)31);
        }
        v5 = this.randGauss();
        v6 /* !! */  = ic.nb;
        if (true) ** GOTO lbl45
        block27: while (true) {
            v6 /* !! */  = (long)(v7 - ic.fxai("fxde", fxae(int ), (int)17));
lbl45:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1273222486: {
                    v7 = ic.fxai("fxdf", fxae(int ), (int)18);
                    continue block27;
                }
                case 72873549: {
                    v7 = ic.fxai("fxdg", fxae(int ), (int)19);
                    continue block27;
                }
                case 1216024765: {
                    break block27;
                }
                case 1490079154: {
                    v7 = ic.fxai("fxdh", fxae(int ), (int)20);
                    continue block27;
                }
            }
            break;
        }
        this.wanderYaw = v5;
        if (var1_3 || var1_3) ** GOTO lbl32
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = ic.nb - ic.fxai("fxdj", fxae(int ), (int)21)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == ic.fxai("fxdk", fxak(int ), (int)32)) break;
            v8 /* !! */  = (long)ic.fxai("fxdo", fxak(int ), (int)33);
        }
        v9 = this.randGauss();
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_4 = ic.nb - ic.fxai("fxdp", fxae(int ), (int)22)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == ic.fxai("fxdq", fxak(int ), (int)34)) break;
            v10 /* !! */  = (long)ic.fxai("fxds", fxak(int ), (int)35);
        }
        this.wanderPitch = v9;
        if (var1_3) ** GOTO lbl32
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)ic.fxai("fxdt", fxak(int ), (int)36);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl102
            }
lbl83:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)ic.fxai("fxdu", fxak(int ), (int)37);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl93
            }
            case 2: {
                var2_2 /* !! */  = (int)ic.fxai("fxdv", fxak(int ), (int)38);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl97
            }
lbl93:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ic.fxai("fxdx", fxak(int ), (int)39);
                if (!var3_1) ** GOTO lbl83
                throw null;
            }
lbl97:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ic.fxai("fxdy", fxak(int ), (int)40);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl106
            }
lbl102:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)ic.fxai("fxdz", fxak(int ), (int)41);
                if (!var3_1) ** GOTO lbl83
                throw null;
            }
lbl106:
            // 2 sources

            case 6: {
                do {
                    var2_2 /* !! */  = (int)ic.fxai("fxea", fxak(int ), (int)42);
                } while (!var3_1);
                throw null;
            }
            case 7: 
        }
        do {
            var2_2 /* !! */  = (int)ic.fxai("fxeb", fxak(int ), (int)43);
        } while (!var3_1);
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void resetPlaybackState() {
        while (true) {
            block77: {
                if ((v0 /* !! */  = (cfr_temp_1 = ic.nb - ic.fxai("fxeh", fxae(int ), (int)23)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  != ic.fxai("fxei", fxak(int ), (int)44)) break block77;
                var3_1 = ic.c;
                v1 /* !! */  = ic.nb;
                if (true) ** GOTO lbl13
            }
            v0 /* !! */  = (long)ic.fxai("fxej", fxak(int ), (int)45);
        }
        block41: while (true) {
            v1 /* !! */  = (long)(v2 - ic.fxai("fxel", fxae(int ), (int)24));
lbl13:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1159403183: {
                    v2 = ic.fxai("fxem", fxae(int ), (int)25);
                    continue block41;
                }
                case 464937908: {
                    v2 = ic.fxai("fxen", fxae(int ), (int)26);
                    continue block41;
                }
                case 977770835: {
                    v2 = ic.fxai("fxep", fxae(int ), (int)27);
                    continue block41;
                }
                case 1216024765: {
                    break block41;
                }
            }
            break;
        }
        var2_2 /* !! */  = ic.b;
        v3 /* !! */  = ic.nb;
        if (true) ** GOTO lbl30
        block42: while (true) {
            v3 /* !! */  = (long)(v4 - ic.fxai("fxeq", fxae(int ), (int)28));
lbl30:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1888423281: {
                    v4 = ic.fxai("fxes", fxae(int ), (int)29);
                    continue block42;
                }
                case -1094636729: {
                    v4 = ic.fxai("fxet", fxae(int ), (int)30);
                    continue block42;
                }
                case 1216024765: {
                    break block42;
                }
                case 1642944915: {
                    v4 = ic.fxai("fxeu", fxae(int ), (int)31);
                    continue block42;
                }
            }
            break;
        }
        var1_3 = ic.a;
        if (var3_1) {
            throw null;
        }
        if (var1_3 || var1_3) return;
        v5 /* !! */  = ic.nb;
        block43: while (true) {
            switch ((int)v5 /* !! */ ) {
                case -2120007262: {
                    v5 /* !! */  = (long)(ic.fxai("fxex", fxae(int ), (int)33) - ic.fxai("fxew", fxae(int ), (int)32));
                    continue block43;
                }
                case 1216024765: {
                    break block43;
                }
            }
            break;
        }
        this.lastStepYaw = 0.0f;
        if (var1_3 || var1_3) return;
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = ic.nb - ic.fxai("fxfb", fxae(int ), (int)34)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 /* !! */  == ic.fxai("fxfc", fxak(int ), (int)46)) {
                this.lastStepPitch = 0.0f;
                if (var1_3) return;
                break;
            }
            v6 /* !! */  = (long)ic.fxai("fxfe", fxak(int ), (int)47);
        }
        if (var1_3) return;
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = ic.nb - ic.fxai("fxff", fxae(int ), (int)35)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 /* !! */  == ic.fxai("fxfh", fxak(int ), (int)48)) {
                this.resetWander();
                if (var1_3) return;
                break;
            }
            v7 /* !! */  = (long)ic.fxai("fxfi", fxak(int ), (int)49);
        }
        if (var1_3) return;
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_4 = ic.nb - ic.fxai("fxfk", fxae(int ), (int)36)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v8 /* !! */  == ic.fxai("fxfl", fxak(int ), (int)50)) {
                this.resetSideDetour();
                if (var1_3) return;
                break;
            }
            v8 /* !! */  = (long)ic.fxai("fxfm", fxak(int ), (int)51);
        }
        if (var1_3) return;
        v9 /* !! */  = ic.nb;
        block47: while (true) {
            switch ((int)v9 /* !! */ ) {
                case 1216024765: {
                    break block47;
                }
                case 2095718215: {
                    v9 /* !! */  = (long)(ic.fxai("fxfp", fxae(int ), (int)38) - ic.fxai("fxfo", fxae(int ), (int)37));
                    continue block47;
                }
            }
            break;
        }
        v10 /* !! */  = ic.nb;
        block48: while (true) {
            switch ((int)v10 /* !! */ ) {
                case -899955885: {
                    v10 /* !! */  = (long)(ic.fxai("fxfu", fxae(int ), (int)40) - ic.fxai("fxft", fxae(int ), (int)39));
                    continue block48;
                }
                case 1216024765: {
                    break block48;
                }
            }
            break;
        }
        this.model.resetPlayback();
        if (var1_3) return;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block49: while (true) {
            block78: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (!var1_3) return;
                        return;
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)ic.fxai("fxgd", fxak(int ), (int)57);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)ic.fxai("fxga", fxak(int ), (int)55);
                        cfr_temp_0 = 4;
                        if (var3_1) {
                            throw null;
                        }
                        break block78;
                    }
                    case 6: {
                        var2_2 /* !! */  = (int)ic.fxai("fxge", fxak(int ), (int)58);
                        cfr_temp_0 = 0;
                        if (var3_1) {
                            throw null;
                        }
                        break block78;
                    }
                    case 7: {
                        var2_2 /* !! */  = (int)ic.fxai("fxgg", fxak(int ), (int)59);
                        cfr_temp_0 = 9;
                        if (var3_1) {
                            throw null;
                        }
                        break block78;
                    }
                    case 8: {
                        var2_2 /* !! */  = (int)ic.fxai("fxgh", fxak(int ), (int)60);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 1: {
                        var2_2 /* !! */  = (int)ic.fxai("fxfy", fxak(int ), (int)53);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: {
                        do {
                            var2_2 /* !! */  = (int)ic.fxai("fxfz", fxak(int ), (int)54);
                        } while (!var3_1);
                        throw null;
                    }
                    case 9: {
                        var2_2 /* !! */  = (int)ic.fxai("fxgj", fxak(int ), (int)61);
                        cfr_temp_0 = 4;
                        if (var3_1) {
                            throw null;
                        }
                        break block78;
                    }
                    case 11: {
                        ** GOTO lbl173
                    }
                    case 13: {
                        ** GOTO lbl170
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)ic.fxai("fxfw", fxak(int ), (int)52);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 4: {
                        var2_2 /* !! */  = (int)ic.fxai("fxgb", fxak(int ), (int)56);
                        cfr_temp_0 = 0;
                        if (var3_1) {
                            throw null;
                        }
                        break block78;
                    }
                    case 10: {
                        var2_2 /* !! */  = (int)ic.fxai("fxgk", fxak(int ), (int)62);
                        if (!var3_1) ** break;
                        throw null;
lbl170:
                        // 2 sources

                        var2_2 /* !! */  = (int)ic.fxai("fxgr", fxak(int ), (int)65);
                        if (var3_1) {
                            throw null;
                        }
lbl173:
                        // 3 sources

                        var2_2 /* !! */  = (int)ic.fxai("fxgm", fxak(int ), (int)63);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 12: 
                }
                ** GOTO lbl181
            }
            do {
                if (true) continue block49;
lbl181:
                // 2 sources

                var2_2 /* !! */  = (int)ic.fxai("fxgp", fxak(int ), (int)64);
                cfr_temp_0 = 10;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ int fxak(int n2) {
        return fxal[n2] ^ fxam[n2];
    }

    private static /* synthetic */ void gabw() {
        ic.fxal[400] = -16113333;
        ic.fxal[401] = 985707297;
        ic.fxal[402] = -1558652089;
        ic.fxal[403] = -2140461822;
        ic.fxal[404] = -1006413789;
        ic.fxal[405] = -545490928;
        ic.fxal[406] = -846694227;
        ic.fxal[407] = 1563440673;
        ic.fxal[408] = -1281199793;
        ic.fxal[409] = -89829661;
        ic.fxal[410] = -1166572477;
        ic.fxal[411] = -11559835;
        ic.fxal[412] = 1069935708;
        ic.fxal[413] = 25339268;
        ic.fxal[414] = -1976058950;
        ic.fxal[415] = -210702007;
        ic.fxal[416] = 168210860;
        ic.fxal[417] = 1925809203;
        ic.fxal[418] = 1934364391;
        ic.fxal[419] = -1423912717;
        ic.fxal[420] = -721096738;
        ic.fxal[421] = 1182665745;
        ic.fxal[422] = -1331412545;
        ic.fxal[423] = -1318368557;
        ic.fxal[424] = 195356522;
        ic.fxal[425] = -1825878818;
        ic.fxal[426] = 652667402;
        ic.fxal[427] = -1900733397;
        ic.fxal[428] = -1018184661;
        ic.fxal[429] = 90698510;
        ic.fxal[430] = 2052565264;
        ic.fxal[431] = -345921423;
        ic.fxal[432] = -252925186;
        ic.fxal[433] = -2122051270;
        ic.fxal[434] = 2046126730;
        ic.fxal[435] = 1517788033;
        ic.fxal[436] = -1532548639;
        ic.fxal[437] = -593775391;
        ic.fxal[438] = 842164707;
        ic.fxal[439] = -873459289;
        ic.fxal[440] = -1004837125;
        ic.fxal[441] = -1564936464;
        ic.fxal[442] = -926226978;
        ic.fxal[443] = 1337872451;
        ic.fxal[444] = 1408221233;
        ic.fxal[445] = -1273547332;
        ic.fxal[446] = 419174308;
        ic.fxal[447] = 897445669;
        ic.fxal[448] = 761001858;
        ic.fxal[449] = 1980849177;
        ic.fxal[450] = 194604406;
        ic.fxal[451] = 757146215;
        ic.fxal[452] = 1408157015;
        ic.fxal[453] = -687289186;
        ic.fxal[454] = -938393653;
        ic.fxal[455] = -1089112452;
        ic.fxal[456] = 1604164114;
        ic.fxal[457] = 240218687;
        ic.fxal[458] = 1592605400;
        ic.fxal[459] = -71415588;
        ic.fxal[460] = 890975820;
        ic.fxal[461] = 1172956880;
        ic.fxal[462] = -2027254287;
        ic.fxal[463] = -1947053545;
    }

    private static /* synthetic */ void gabc() {
        ic.fxal[300] = 1904475928;
        ic.fxal[301] = 26166230;
        ic.fxal[302] = 569504325;
        ic.fxal[303] = -90532266;
        ic.fxal[304] = 1966637322;
        ic.fxal[305] = -1760798551;
        ic.fxal[306] = 48117961;
        ic.fxal[307] = 1976014437;
        ic.fxal[308] = -887045002;
        ic.fxal[309] = -825106354;
        ic.fxal[310] = 1744019594;
        ic.fxal[311] = 1138860830;
        ic.fxal[312] = 1629397187;
        ic.fxal[313] = -943345830;
        ic.fxal[314] = -1625056145;
        ic.fxal[315] = 1737136101;
        ic.fxal[316] = -1755399582;
        ic.fxal[317] = -231089479;
        ic.fxal[318] = 1027883057;
        ic.fxal[319] = 2079557509;
        ic.fxal[320] = -121756491;
        ic.fxal[321] = -1250396934;
        ic.fxal[322] = -1273457230;
        ic.fxal[323] = -1111255808;
        ic.fxal[324] = -1679922834;
        ic.fxal[325] = -998655060;
        ic.fxal[326] = 390921969;
        ic.fxal[327] = 1830530890;
        ic.fxal[328] = -1577153995;
        ic.fxal[329] = 45601287;
        ic.fxal[330] = -1011145437;
        ic.fxal[331] = 1577643850;
        ic.fxal[332] = -1205505349;
        ic.fxal[333] = -544215477;
        ic.fxal[334] = 1348798888;
        ic.fxal[335] = -1771069655;
        ic.fxal[336] = -688026428;
        ic.fxal[337] = 1701385048;
        ic.fxal[338] = -1047786644;
        ic.fxal[339] = 1378168247;
        ic.fxal[340] = -1215795932;
        ic.fxal[341] = -1971138912;
        ic.fxal[342] = -605948315;
        ic.fxal[343] = 1680839005;
        ic.fxal[344] = 969722355;
        ic.fxal[345] = 631212649;
        ic.fxal[346] = 510095254;
        ic.fxal[347] = 1401741474;
        ic.fxal[348] = 1846554847;
        ic.fxal[349] = -1242537365;
        ic.fxal[350] = 84693678;
        ic.fxal[351] = -1813110307;
        ic.fxal[352] = -464440823;
        ic.fxal[353] = -2055168526;
        ic.fxal[354] = -1695820525;
        ic.fxal[355] = -1005807762;
        ic.fxal[356] = 533590019;
        ic.fxal[357] = -122904461;
        ic.fxal[358] = 161972705;
        ic.fxal[359] = 810617837;
        ic.fxal[360] = -2001843096;
        ic.fxal[361] = 792556127;
        ic.fxal[362] = -2123537623;
        ic.fxal[363] = 402973588;
        ic.fxal[364] = 1671963388;
        ic.fxal[365] = 1773161144;
        ic.fxal[366] = 287763529;
        ic.fxal[367] = 2021455054;
        ic.fxal[368] = 1508329617;
        ic.fxal[369] = 1002682562;
        ic.fxal[370] = -2011989374;
        ic.fxal[371] = -1708495358;
        ic.fxal[372] = 929373546;
        ic.fxal[373] = -455800328;
        ic.fxal[374] = 1974883807;
        ic.fxal[375] = -2005183240;
        ic.fxal[376] = 85783354;
        ic.fxal[377] = -1746329728;
        ic.fxal[378] = -1048929152;
        ic.fxal[379] = 156244876;
        ic.fxal[380] = -1910420038;
        ic.fxal[381] = 642113993;
        ic.fxal[382] = 790393151;
        ic.fxal[383] = -2008994528;
        ic.fxal[384] = -1960374408;
        ic.fxal[385] = -140750251;
        ic.fxal[386] = 78946578;
        ic.fxal[387] = 1117864228;
        ic.fxal[388] = 1125068609;
        ic.fxal[389] = -164183453;
        ic.fxal[390] = -150309558;
        ic.fxal[391] = 1122660254;
        ic.fxal[392] = 1060473757;
        ic.fxal[393] = 1924762448;
        ic.fxal[394] = 607993242;
        ic.fxal[395] = 1883105465;
        ic.fxal[396] = -1229005492;
        ic.fxal[397] = -1377920985;
        ic.fxal[398] = 1662260470;
        ic.fxal[399] = 1487118402;
    }

    private static /* synthetic */ void gbeg() {
        ic.fxag[100] = -8814671738717921196L;
        ic.fxag[101] = -7093566960334623567L;
        ic.fxag[102] = -7647011995478034255L;
        ic.fxag[103] = -2481555622280086014L;
        ic.fxag[104] = 5385767215669773370L;
        ic.fxag[105] = 8340317866368442918L;
        ic.fxag[106] = -6959475966826280285L;
        ic.fxag[107] = 956345678046196040L;
        ic.fxag[108] = -4354212660756389723L;
        ic.fxag[109] = -8481471348117945343L;
        ic.fxag[110] = 3079192109864142623L;
        ic.fxag[111] = 4491216425804338936L;
        ic.fxag[112] = -3305895962627298620L;
        ic.fxag[113] = 4596139111552773246L;
        ic.fxag[114] = -6023701637881128757L;
        ic.fxag[115] = 4605882021367095412L;
        ic.fxag[116] = 8723792228140708107L;
        ic.fxag[117] = -3511967839059055742L;
        ic.fxag[118] = 2252403985416186021L;
        ic.fxag[119] = 5469761002457958530L;
        ic.fxag[120] = 186985745162939321L;
        ic.fxag[121] = 4733792304230534768L;
        ic.fxag[122] = -1403997151321019070L;
        ic.fxag[123] = 1515919561063865681L;
        ic.fxag[124] = 3340333156018382741L;
        ic.fxag[125] = -8905731177983553545L;
        ic.fxag[126] = 8498632098554192060L;
        ic.fxag[127] = 3001359397507442303L;
        ic.fxag[128] = -761523555782322670L;
        ic.fxag[129] = -5289805872569419923L;
        ic.fxag[130] = 417470511417423936L;
        ic.fxag[131] = 5146141058061623270L;
        ic.fxag[132] = -6014188557670660510L;
        ic.fxag[133] = 1270505416997427389L;
        ic.fxag[134] = 3473146205078770847L;
        ic.fxag[135] = -2801214757408235515L;
        ic.fxag[136] = 4674091999759711620L;
        ic.fxag[137] = -6403528275622207946L;
        ic.fxag[138] = 3812068924541482947L;
        ic.fxag[139] = -2618806300555902896L;
        ic.fxag[140] = -6631854672911251106L;
        ic.fxag[141] = -440728828139003494L;
        ic.fxag[142] = -7636983596250266777L;
        ic.fxag[143] = -7532362065700183724L;
        ic.fxag[144] = 4170616463854572605L;
        ic.fxag[145] = 6382388558336997564L;
        ic.fxag[146] = 4403651733095486315L;
        ic.fxag[147] = 3336496718734874117L;
        ic.fxag[148] = 8057731834837448669L;
        ic.fxag[149] = 2684696084906628165L;
        ic.fxag[150] = -8145503392820934458L;
        ic.fxag[151] = -4293285201716693358L;
        ic.fxag[152] = 7625499176066145273L;
        ic.fxag[153] = -3738740457928755960L;
        ic.fxag[154] = -4040486577508827689L;
        ic.fxag[155] = 871437526507614636L;
        ic.fxag[156] = -925356644050813081L;
        ic.fxag[157] = -3171650414385831268L;
        ic.fxag[158] = 5140891014156321553L;
        ic.fxag[159] = 51593827902715441L;
        ic.fxag[160] = 8324747002642370813L;
        ic.fxag[161] = -302924266171598401L;
        ic.fxag[162] = -4416616200004079989L;
        ic.fxag[163] = 7072574897693617179L;
        ic.fxag[164] = -7688556168271462166L;
        ic.fxag[165] = -5277572524178363992L;
        ic.fxag[166] = -3821898605586287443L;
        ic.fxag[167] = 3634829253642859688L;
        ic.fxag[168] = -341952085043129542L;
        ic.fxag[169] = -4355966534943940154L;
        ic.fxag[170] = -5636209180126274037L;
        ic.fxag[171] = 3687365762601570638L;
        ic.fxag[172] = -778258984567325281L;
        ic.fxag[173] = 4452220524456277331L;
        ic.fxag[174] = 763681921611691163L;
        ic.fxag[175] = -4196945903868066827L;
        ic.fxag[176] = -6197359797529511690L;
        ic.fxag[177] = 4414444252398123229L;
        ic.fxag[178] = 3702476183089833708L;
        ic.fxag[179] = 8569365237046491385L;
        ic.fxag[180] = 5101846547144945173L;
        ic.fxag[181] = -8628834909010915237L;
        ic.fxag[182] = -6242174729586515012L;
        ic.fxag[183] = 155686398130602213L;
        ic.fxag[184] = -3967663333475829774L;
        ic.fxag[185] = 1786846784223887702L;
        ic.fxag[186] = -1095811696861151073L;
        ic.fxag[187] = 5667996690492033746L;
        ic.fxag[188] = 3810628307227276525L;
        ic.fxag[189] = 693264848043917120L;
        ic.fxag[190] = 944284129860577866L;
        ic.fxag[191] = 3011832429310519921L;
        ic.fxag[192] = 6313308564893423517L;
        ic.fxag[193] = 2328785973825170318L;
        ic.fxag[194] = 1106055392074035557L;
        ic.fxag[195] = 4016110004658532802L;
        ic.fxag[196] = -4074139284483707365L;
        ic.fxag[197] = -4155667580670844788L;
        ic.fxag[198] = -9103947474794228827L;
        ic.fxag[199] = 5560326745195905738L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov smoothReset(ov var1_1, ov var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ic.nb - ic.fxai("fzck", fxae(int ), (int)139)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ic.fxai("fzcl", fxak(int ), (int)273)) break;
            v0 /* !! */  = (long)ic.fxai("fzcn", fxak(int ), (int)274);
        }
        var11_3 = ic.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ic.nb - ic.fxai("fzco", fxae(int ), (int)140)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ic.fxai("fzcq", fxak(int ), (int)275)) break;
            v1 /* !! */  = (long)ic.fxai("fzcr", fxak(int ), (int)276);
        }
        var10_4 /* !! */  = ic.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ic.nb - ic.fxai("fzcs", fxae(int ), (int)141)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ic.fxai("fzct", fxak(int ), (int)277)) break;
            v2 /* !! */  = (long)ic.fxai("fzcu", fxak(int ), (int)278);
        }
        var9_5 = ic.a;
        if (var11_3) {
            throw null;
lbl21:
            // 12 sources

            return null;
        }
        if (var9_5 || var9_5) ** GOTO lbl21
        if (var2_2 == null) ** GOTO lbl33
        if (var9_5) ** GOTO lbl21
        if (var10_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 = var2_2;
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl33:
            // 1 sources

            if (var9_5 || var9_5) ** GOTO lbl21
            v4 /* !! */  = ic.nb;
            if (true) ** GOTO lbl38
            block70: while (true) {
                v4 /* !! */  = (long)(ic.fxai("fzcw", fxae(int ), (int)143) - ic.fxai("fzcv", fxae(int ), (int)142));
lbl38:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case 1216024765: {
                        break block70;
                    }
                    case 1637502770: {
                        continue block70;
                    }
                }
                break;
            }
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_3 = ic.nb - ic.fxai("fzcx", fxae(int ), (int)144)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == ic.fxai("fzcy", fxak(int ), (int)279)) break;
                v5 /* !! */  = (long)ic.fxai("fzda", fxak(int ), (int)280);
            }
            v6 /* !! */  = ic.nb;
            if (true) ** GOTO lbl52
            block72: while (true) {
                v6 /* !! */  = (long)(ic.fxai("fzdc", fxae(int ), (int)146) - ic.fxai("fzdb", fxae(int ), (int)145));
lbl52:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1872010099: {
                        continue block72;
                    }
                    case 1216024765: {
                        break block72;
                    }
                }
                break;
            }
            v7 = ic.mc.field_1724;
            v8 /* !! */  = ic.nb;
            if (true) ** GOTO lbl62
            block73: while (true) {
                v8 /* !! */  = (long)(ic.fxai("fzdf", fxae(int ), (int)148) - ic.fxai("fzdd", fxae(int ), (int)147));
lbl62:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case 825638770: {
                        continue block73;
                    }
                    case 1216024765: {
                        break block73;
                    }
                }
                break;
            }
            v9 = v7.method_36454();
            v10 /* !! */  = ic.nb;
            if (true) ** GOTO lbl72
            block74: while (true) {
                v10 /* !! */  = (long)(ic.fxai("fzdj", fxae(int ), (int)150) - ic.fxai("fzdi", fxae(int ), (int)149));
lbl72:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case 390193187: {
                        continue block74;
                    }
                    case 1216024765: {
                        break block74;
                    }
                }
                break;
            }
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_4 = ic.nb - ic.fxai("fzdl", fxae(int ), (int)151)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == ic.fxai("fzdm", fxak(int ), (int)281)) break;
                v11 /* !! */  = (long)ic.fxai("fzdo", fxak(int ), (int)282);
            }
            v12 = ic.mc.field_1724;
            v13 /* !! */  = ic.nb;
            if (true) ** GOTO lbl87
            block76: while (true) {
                v13 /* !! */  = (long)(v14 - ic.fxai("fzdp", fxae(int ), (int)152));
lbl87:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -337310251: {
                        v14 = ic.fxai("fzdq", fxae(int ), (int)153);
                        continue block76;
                    }
                    case 1216024765: {
                        break block76;
                    }
                    case 1630617339: {
                        v14 = ic.fxai("fzds", fxae(int ), (int)154);
                        continue block76;
                    }
                    case 1830219999: {
                        v14 = ic.fxai("fzdt", fxae(int ), (int)155);
                        continue block76;
                    }
                }
                break;
            }
            v15 = v12.method_36455();
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_5 = ic.nb - ic.fxai("fzdu", fxae(int ), (int)156)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v16 /* !! */  == ic.fxai("fzdv", fxak(int ), (int)283)) {
                    v3 = new ov(v9, v15);
                    break;
                }
                v16 /* !! */  = (long)ic.fxai("fzdw", fxak(int ), (int)284);
            }
lbl107:
            // 2 sources

            var3_6 = v3;
            if (var9_5 || var9_5) ** GOTO lbl21
            v17 /* !! */  = ic.nb;
            if (true) ** GOTO lbl113
            block78: while (true) {
                v17 /* !! */  = (long)(ic.fxai("fzeb", fxae(int ), (int)158) - ic.fxai("fzdy", fxae(int ), (int)157));
lbl113:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -33602635: {
                        continue block78;
                    }
                    case 1216024765: {
                        break block78;
                    }
                }
                break;
            }
            var4_7 = ow.calculateDelta(var1_1, var3_6);
            if (var9_5 || var9_5) ** GOTO lbl21
            while (true) {
                if ((v18 /* !! */  = (cfr_temp_6 = ic.nb - ic.fxai("fzee", fxae(int ), (int)159)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v18 /* !! */  == ic.fxai("fzeg", fxak(int ), (int)285)) break;
                v18 /* !! */  = (long)ic.fxai("fzeh", fxak(int ), (int)286);
            }
            var5_8 = var4_7.getYaw();
            if (var9_5 || var9_5) ** GOTO lbl21
            v19 /* !! */  = ic.nb;
            if (true) ** GOTO lbl131
            block80: while (true) {
                v19 /* !! */  = (long)(v20 - ic.fxai("fzej", fxae(int ), (int)160));
lbl131:
                // 2 sources

                switch ((int)v19 /* !! */ ) {
                    case -1791856560: {
                        v20 = ic.fxai("fzek", fxae(int ), (int)161);
                        continue block80;
                    }
                    case 1216024765: {
                        break block80;
                    }
                    case 1439644834: {
                        v20 = ic.fxai("fzel", fxae(int ), (int)162);
                        continue block80;
                    }
                    case 1791746902: {
                        v20 = ic.fxai("fzep", fxae(int ), (int)163);
                        continue block80;
                    }
                }
                break;
            }
            var6_9 = var4_7.getPitch();
            if (var9_5 || var9_5) ** GOTO lbl21
            v21 = var5_8;
            v22 = var6_9;
            while (true) {
                if ((v23 /* !! */  = (cfr_temp_7 = ic.nb - ic.fxai("fzes", fxae(int ), (int)164)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v23 /* !! */  == ic.fxai("fzeu", fxak(int ), (int)287)) break;
                v23 /* !! */  = (long)ic.fxai("fzev", fxak(int ), (int)288);
            }
            var7_10 = (float)Math.hypot(v21, v22);
            if (var9_5 || var9_5) ** GOTO lbl21
            if (!(var7_10 < ic.fxai("fzex", fxki(int ), (int)289))) ** GOTO lbl164
            if (var9_5 || var9_5) ** GOTO lbl21
            while (true) {
                if ((v24 /* !! */  = (cfr_temp_8 = ic.nb - ic.fxai("fzey", fxae(int ), (int)165)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v24 /* !! */  == ic.fxai("fzez", fxak(int ), (int)290)) break;
                v24 /* !! */  = (long)ic.fxai("fzfd", fxak(int ), (int)291);
            }
            this.resetPlaybackState();
            if (var9_5 || var9_5) ** GOTO lbl21
            return var3_6;
lbl164:
            // 1 sources

            if (var9_5 || var9_5) ** GOTO lbl21
            v25 = var7_10 * ic.fxai("fzfh", fxki(int ), (int)292);
            v26 = ic.fxai("fzfi", fxki(int ), (int)293);
            v27 = ic.fxai("fzfk", fxki(int ), (int)294);
            while (true) {
                if ((v28 /* !! */  = (cfr_temp_9 = ic.nb - ic.fxai("fzfl", fxae(int ), (int)166)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                if (v28 /* !! */  == ic.fxai("fzfm", fxak(int ), (int)295)) break;
                v28 /* !! */  = (long)ic.fxai("fzfn", fxak(int ), (int)296);
            }
            var8_11 = class_3532.method_15363((float)v25, (float)v26, (float)v27);
            if (!var9_5 && !var9_5) ** break;
            ** continue;
            v29 = ic.fxai("fzft", fxki(int ), (int)297);
            v30 = ic.fxai("fzfu", fxki(int ), (int)298);
            v31 = ic.fxai("fzfv", fxki(int ), (int)299);
            v32 = ic.fxai("fzfw", fxki(int ), (int)300);
            v33 = ic.fxai("fzfx", fxki(int ), (int)301);
            v34 = ic.fxai("fzfy", fxki(int ), (int)302);
            v35 /* !! */  = ic.nb;
            if (true) ** GOTO lbl186
            block84: while (true) {
                v35 /* !! */  = (long)(v36 - ic.fxai("fzgb", fxae(int ), (int)167));
lbl186:
                // 2 sources

                switch ((int)v35 /* !! */ ) {
                    case -402471562: {
                        v36 = ic.fxai("fzgj", fxae(int ), (int)168);
                        continue block84;
                    }
                    case -59116907: {
                        v36 = ic.fxai("fzgm", fxae(int ), (int)169);
                        continue block84;
                    }
                    case 741739032: {
                        v36 = ic.fxai("fzgp", fxae(int ), (int)170);
                        continue block84;
                    }
                    case 1216024765: {
                        break block84;
                    }
                }
                break;
            }
            return this.stepToward(var1_1, var3_6, var8_11, (float)v29, (float)v30, (float)v31, (float)v32, (float)v33, (float)v34);
lbl199:
            // 2 sources

            case 0: {
                var10_4 /* !! */  = (int)ic.fxai("fzgq", fxak(int ), (int)303);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl290
            }
lbl204:
            // 3 sources

            case 1: {
                var10_4 /* !! */  = (int)ic.fxai("fzgt", fxak(int ), (int)304);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl238
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_4 /* !! */  = (int)ic.fxai("fzgx", fxak(int ), (int)305);
                    if (var11_3) {
                        throw null;
                    }
                    ** GOTO lbl220
                    break;
                }
            }
            case 3: {
                var10_4 /* !! */  = (int)ic.fxai("fzha", fxak(int ), (int)306);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl248
            }
lbl220:
            // 2 sources

            case 4: {
                var10_4 /* !! */  = (int)ic.fxai("fzhi", fxak(int ), (int)307);
                if (var11_3) {
                    throw null;
                }
            }
            case 5: {
                var10_4 /* !! */  = (int)ic.fxai("fzhk", fxak(int ), (int)308);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl266
            }
lbl229:
            // 2 sources

            case 6: {
                var10_4 /* !! */  = (int)ic.fxai("fzho", fxak(int ), (int)309);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl298
            }
            case 7: {
                var10_4 /* !! */  = (int)ic.fxai("fzhr", fxak(int ), (int)310);
                if (!var11_3) ** GOTO lbl229
                throw null;
            }
lbl238:
            // 3 sources

            case 8: {
                var10_4 /* !! */  = (int)ic.fxai("fzhs", fxak(int ), (int)311);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl253
            }
            case 9: {
                var10_4 /* !! */  = (int)ic.fxai("fzht", fxak(int ), (int)312);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl248:
            // 3 sources

            case 10: {
                var10_4 /* !! */  = (int)ic.fxai("fzhv", fxak(int ), (int)313);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl294
            }
lbl253:
            // 2 sources

            case 11: {
                var10_4 /* !! */  = (int)ic.fxai("fzib", fxak(int ), (int)314);
                if (!var11_3) ** GOTO lbl248
                throw null;
            }
            case 12: {
                var10_4 /* !! */  = (int)ic.fxai("fzid", fxak(int ), (int)315);
                if (!var11_3) ** GOTO lbl204
                throw null;
            }
            case 13: {
                var10_4 /* !! */  = (int)ic.fxai("fzie", fxak(int ), (int)316);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl276
            }
lbl266:
            // 2 sources

            case 14: {
                var10_4 /* !! */  = (int)ic.fxai("fzif", fxak(int ), (int)317);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl302
            }
            case 15: {
                var10_4 /* !! */  = (int)ic.fxai("fzig", fxak(int ), (int)318);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl311
            }
lbl276:
            // 2 sources

            case 16: {
                var10_4 /* !! */  = (int)ic.fxai("fzih", fxak(int ), (int)319);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl290
            }
lbl281:
            // 2 sources

            case 17: {
                var10_4 /* !! */  = (int)ic.fxai("fzik", fxak(int ), (int)320);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl290
            }
lbl286:
            // 2 sources

            case 18: {
                var10_4 /* !! */  = (int)ic.fxai("fziq", fxak(int ), (int)321);
                if (!var11_3) ** GOTO lbl238
                throw null;
            }
lbl290:
            // 4 sources

            case 19: {
                var10_4 /* !! */  = (int)ic.fxai("fzir", fxak(int ), (int)322);
                if (!var11_3) break;
                throw null;
            }
lbl294:
            // 2 sources

            case 20: {
                var10_4 /* !! */  = (int)ic.fxai("fzis", fxak(int ), (int)323);
                if (var11_3) {
                    throw null;
                }
            }
lbl298:
            // 4 sources

            case 21: {
                var10_4 /* !! */  = (int)ic.fxai("fzit", fxak(int ), (int)324);
                if (!var11_3) ** GOTO lbl199
                throw null;
            }
lbl302:
            // 2 sources

            case 22: {
                var10_4 /* !! */  = (int)ic.fxai("fziu", fxak(int ), (int)325);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl311
            }
            case 23: {
                var10_4 /* !! */  = (int)ic.fxai("fziv", fxak(int ), (int)326);
                if (!var11_3) ** GOTO lbl204
                throw null;
            }
lbl311:
            // 3 sources

            case 24: {
                var10_4 /* !! */  = (int)ic.fxai("fziw", fxak(int ), (int)327);
                if (!var11_3) ** GOTO lbl286
                throw null;
            }
            case 25: 
        }
        var10_4 /* !! */  = (int)ic.fxai("fzjb", fxak(int ), (int)328);
        ** while (!var11_3)
lbl318:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fzyx() {
        ic.fxal[0] = -1101549464;
        ic.fxal[1] = -300773549;
        ic.fxal[2] = -848757890;
        ic.fxal[3] = 413824322;
        ic.fxal[4] = -1841270329;
        ic.fxal[5] = 2016824137;
        ic.fxal[6] = 1371619488;
        ic.fxal[7] = 2066336968;
        ic.fxal[8] = -761746536;
        ic.fxal[9] = 196391703;
        ic.fxal[10] = 364401350;
        ic.fxal[11] = -541316228;
        ic.fxal[12] = -1757959938;
        ic.fxal[13] = 1160819298;
        ic.fxal[14] = 2122416857;
        ic.fxal[15] = 907212886;
        ic.fxal[16] = -669627823;
        ic.fxal[17] = -1375258356;
        ic.fxal[18] = 413170037;
        ic.fxal[19] = -2001004593;
        ic.fxal[20] = 1564449940;
        ic.fxal[21] = -974028618;
        ic.fxal[22] = -745764022;
        ic.fxal[23] = -695060303;
        ic.fxal[24] = -80332000;
        ic.fxal[25] = 1834137684;
        ic.fxal[26] = 62650938;
        ic.fxal[27] = -527324815;
        ic.fxal[28] = 1898504856;
        ic.fxal[29] = -1342859577;
        ic.fxal[30] = 2054948679;
        ic.fxal[31] = -1062487017;
        ic.fxal[32] = -507154870;
        ic.fxal[33] = -733188581;
        ic.fxal[34] = 1203177114;
        ic.fxal[35] = -1092327623;
        ic.fxal[36] = -1680396199;
        ic.fxal[37] = -1853132954;
        ic.fxal[38] = -1903485031;
        ic.fxal[39] = 995588361;
        ic.fxal[40] = 1774091923;
        ic.fxal[41] = -264407192;
        ic.fxal[42] = 1952903986;
        ic.fxal[43] = -1550554289;
        ic.fxal[44] = 1898874535;
        ic.fxal[45] = -296376723;
        ic.fxal[46] = -2032807242;
        ic.fxal[47] = 1382519828;
        ic.fxal[48] = 2109383684;
        ic.fxal[49] = 873810064;
        ic.fxal[50] = 447328200;
        ic.fxal[51] = 2059668344;
        ic.fxal[52] = 1895996940;
        ic.fxal[53] = 1507493545;
        ic.fxal[54] = -1242715365;
        ic.fxal[55] = -1087945956;
        ic.fxal[56] = -187688523;
        ic.fxal[57] = -1566307405;
        ic.fxal[58] = 1920899205;
        ic.fxal[59] = 884919053;
        ic.fxal[60] = 328441968;
        ic.fxal[61] = 1156853646;
        ic.fxal[62] = 1273872611;
        ic.fxal[63] = -892683071;
        ic.fxal[64] = -73457160;
        ic.fxal[65] = -1254727926;
        ic.fxal[66] = 1132064041;
        ic.fxal[67] = -1599567276;
        ic.fxal[68] = 0x22B992B9;
        ic.fxal[69] = 1287540623;
        ic.fxal[70] = -1864024467;
        ic.fxal[71] = -1779949226;
        ic.fxal[72] = -1270068254;
        ic.fxal[73] = -12043319;
        ic.fxal[74] = -1275225080;
        ic.fxal[75] = -105190427;
        ic.fxal[76] = -71531260;
        ic.fxal[77] = -1576026978;
        ic.fxal[78] = -1787692261;
        ic.fxal[79] = -273556889;
        ic.fxal[80] = 1030721602;
        ic.fxal[81] = 1038495182;
        ic.fxal[82] = 108489879;
        ic.fxal[83] = -2087326379;
        ic.fxal[84] = 614891872;
        ic.fxal[85] = 1099429343;
        ic.fxal[86] = 884267856;
        ic.fxal[87] = -1712699562;
        ic.fxal[88] = 940903648;
        ic.fxal[89] = -534357109;
        ic.fxal[90] = -1061786219;
        ic.fxal[91] = 1092249326;
        ic.fxal[92] = -242670537;
        ic.fxal[93] = 970512086;
        ic.fxal[94] = 1011430977;
        ic.fxal[95] = 1247472034;
        ic.fxal[96] = -241642216;
        ic.fxal[97] = -1554234160;
        ic.fxal[98] = 1461386714;
        ic.fxal[99] = -1985230333;
    }

    private static /* synthetic */ void gbdx() {
        ic.fxam[400] = -16113328;
        ic.fxam[401] = 985707298;
        ic.fxam[402] = -1558652088;
        ic.fxam[403] = -2140461822;
        ic.fxam[404] = -1006413774;
        ic.fxam[405] = -545490933;
        ic.fxam[406] = -846694227;
        ic.fxam[407] = 1563440672;
        ic.fxam[408] = 1262029792;
        ic.fxam[409] = -89829662;
        ic.fxam[410] = 84246643;
        ic.fxam[411] = 1113822292;
        ic.fxam[412] = 41794992;
        ic.fxam[413] = -25339269;
        ic.fxam[414] = -996226604;
        ic.fxam[415] = -210702008;
        ic.fxam[416] = 1186246699;
        ic.fxam[417] = -807039998;
        ic.fxam[418] = 1324637963;
        ic.fxam[419] = 1423912716;
        ic.fxam[420] = -250387754;
        ic.fxam[421] = 1182665748;
        ic.fxam[422] = -1331412552;
        ic.fxam[423] = -1318368558;
        ic.fxam[424] = 195356523;
        ic.fxam[425] = -1825878822;
        ic.fxam[426] = 652667406;
        ic.fxam[427] = -1900733398;
        ic.fxam[428] = -1018184660;
        ic.fxam[429] = 90698511;
        ic.fxam[430] = -1571990738;
        ic.fxam[431] = 345921422;
        ic.fxam[432] = 1582839088;
        ic.fxam[433] = 2122051269;
        ic.fxam[434] = 178512987;
        ic.fxam[435] = 1699382880;
        ic.fxam[436] = -1532548640;
        ic.fxam[437] = -751673443;
        ic.fxam[438] = 842164706;
        ic.fxam[439] = -873459289;
        ic.fxam[440] = -1004837128;
        ic.fxam[441] = -1564936462;
        ic.fxam[442] = -926226977;
        ic.fxam[443] = -645033955;
        ic.fxam[444] = 1408221232;
        ic.fxam[445] = 1399448065;
        ic.fxam[446] = -419174309;
        ic.fxam[447] = 350366839;
        ic.fxam[448] = -761001859;
        ic.fxam[449] = -146184504;
        ic.fxam[450] = 194604407;
        ic.fxam[451] = -11787137;
        ic.fxam[452] = -1408157016;
        ic.fxam[453] = -1752472348;
        ic.fxam[454] = -938393654;
        ic.fxam[455] = 503882595;
        ic.fxam[456] = -1604164115;
        ic.fxam[457] = 35639891;
        ic.fxam[458] = 1592605400;
        ic.fxam[459] = -71415591;
        ic.fxam[460] = 890975816;
        ic.fxam[461] = 1172956885;
        ic.fxam[462] = -2027254283;
        ic.fxam[463] = -1947053550;
    }

    private static /* synthetic */ void gbeb() {
        ic.fxaf[100] = -5022640852471963564L;
        ic.fxaf[101] = -6748380121433322793L;
        ic.fxaf[102] = -6196852915464734543L;
        ic.fxaf[103] = -2481555622280086014L;
        ic.fxaf[104] = 5385767215669773668L;
        ic.fxaf[105] = 8340317866368442918L;
        ic.fxaf[106] = -6959475966826280285L;
        ic.fxaf[107] = 7020219844743077460L;
        ic.fxaf[108] = 5151902446639997316L;
        ic.fxaf[109] = 8886626109807872979L;
        ic.fxaf[110] = 6311566461432813095L;
        ic.fxaf[111] = -9133607561162699240L;
        ic.fxaf[112] = -7532906947331359655L;
        ic.fxaf[113] = 666155554629572442L;
        ic.fxaf[114] = -3050318735509423947L;
        ic.fxaf[115] = 1125040247396060045L;
        ic.fxaf[116] = -7993950428201873237L;
        ic.fxaf[117] = 5280237371469773498L;
        ic.fxaf[118] = 1994155248537279435L;
        ic.fxaf[119] = 7723866545523236975L;
        ic.fxaf[120] = 7650163250868615786L;
        ic.fxaf[121] = 3664773324159992555L;
        ic.fxaf[122] = -3053500289483002860L;
        ic.fxaf[123] = -2786473224799409548L;
        ic.fxaf[124] = 317256200099261364L;
        ic.fxaf[125] = 2843388176246938163L;
        ic.fxaf[126] = 5874045304604483622L;
        ic.fxaf[127] = 3001359397507442303L;
        ic.fxaf[128] = -2127700204101348802L;
        ic.fxaf[129] = 3784779407804608367L;
        ic.fxaf[130] = 417470511417423936L;
        ic.fxaf[131] = -8346010435973546209L;
        ic.fxaf[132] = -4115767365007968934L;
        ic.fxaf[133] = 6795410157656502019L;
        ic.fxaf[134] = -3999569519022609551L;
        ic.fxaf[135] = 2095266556241001139L;
        ic.fxaf[136] = 7333079156611049619L;
        ic.fxaf[137] = -4397437778170092684L;
        ic.fxaf[138] = 3325201833433623912L;
        ic.fxaf[139] = 5336940036745301132L;
        ic.fxaf[140] = 8535513377476988551L;
        ic.fxaf[141] = -5026322677096875006L;
        ic.fxaf[142] = 1776472183222984636L;
        ic.fxaf[143] = -4117062916640572025L;
        ic.fxaf[144] = 1725609660448978444L;
        ic.fxaf[145] = -2025901344260330003L;
        ic.fxaf[146] = -7650044368229108756L;
        ic.fxaf[147] = -8674226495910241427L;
        ic.fxaf[148] = 1894699752228654386L;
        ic.fxaf[149] = 2620898510591468456L;
        ic.fxaf[150] = 8985859313693617509L;
        ic.fxaf[151] = -704372317791901815L;
        ic.fxaf[152] = 580162816916805518L;
        ic.fxaf[153] = 6948825512372231899L;
        ic.fxaf[154] = -764041405987633500L;
        ic.fxaf[155] = -2874264756380885434L;
        ic.fxaf[156] = -8709925553022605655L;
        ic.fxaf[157] = -4345852226504793157L;
        ic.fxaf[158] = -4133924152351169705L;
        ic.fxaf[159] = -3859913317256597342L;
        ic.fxaf[160] = -2403085611941038553L;
        ic.fxaf[161] = -3994127059370637831L;
        ic.fxaf[162] = -3405094029961596833L;
        ic.fxaf[163] = 7725508158568573784L;
        ic.fxaf[164] = 1321028876455844124L;
        ic.fxaf[165] = 9143987750719839850L;
        ic.fxaf[166] = 4472104587438059280L;
        ic.fxaf[167] = -785788478671284192L;
        ic.fxaf[168] = -5554839220769898473L;
        ic.fxaf[169] = 6396843379310674549L;
        ic.fxaf[170] = 1934648966949419610L;
        ic.fxaf[171] = 6785335911947698601L;
        ic.fxaf[172] = 2028334357557052059L;
        ic.fxaf[173] = -8675889540713992443L;
        ic.fxaf[174] = 1858941224976169232L;
        ic.fxaf[175] = -5917642541148315847L;
        ic.fxaf[176] = 7998162671848577700L;
        ic.fxaf[177] = 8850156897087975260L;
        ic.fxaf[178] = -7833440659557136812L;
        ic.fxaf[179] = -6364745920297194540L;
        ic.fxaf[180] = -8825403522155405337L;
        ic.fxaf[181] = 7780612483812604554L;
        ic.fxaf[182] = 3362507824410064186L;
        ic.fxaf[183] = 3437363940123641962L;
        ic.fxaf[184] = -6491648084562275799L;
        ic.fxaf[185] = 5161639525058022112L;
        ic.fxaf[186] = 780962804674785148L;
        ic.fxaf[187] = -5814779144579173756L;
        ic.fxaf[188] = -2636850483678690344L;
        ic.fxaf[189] = 6565214418437051322L;
        ic.fxaf[190] = -1000489643699896469L;
        ic.fxaf[191] = -4840032386088251806L;
        ic.fxaf[192] = 4064718987847093972L;
        ic.fxaf[193] = -15161729507846984L;
        ic.fxaf[194] = -2249209742716129144L;
        ic.fxaf[195] = -2317714280184282379L;
        ic.fxaf[196] = -8194798348112235884L;
        ic.fxaf[197] = -639672216434560924L;
        ic.fxaf[198] = -1587836186582228702L;
        ic.fxaf[199] = -4425964804400337968L;
    }

    private static /* synthetic */ void fzzn() {
        ic.fxal[100] = 1691746466;
        ic.fxal[101] = 838354172;
        ic.fxal[102] = 715345994;
        ic.fxal[103] = 1850255932;
        ic.fxal[104] = -1442258476;
        ic.fxal[105] = -1496679366;
        ic.fxal[106] = -158200921;
        ic.fxal[107] = -1037182979;
        ic.fxal[108] = -268065990;
        ic.fxal[109] = -612723173;
        ic.fxal[110] = 1051697728;
        ic.fxal[111] = -572813022;
        ic.fxal[112] = 823585900;
        ic.fxal[113] = -271053594;
        ic.fxal[114] = -47314708;
        ic.fxal[115] = -862146090;
        ic.fxal[116] = 1949129549;
        ic.fxal[117] = 998276207;
        ic.fxal[118] = -766783793;
        ic.fxal[119] = 575512063;
        ic.fxal[120] = -40068599;
        ic.fxal[121] = -1247595691;
        ic.fxal[122] = -592361258;
        ic.fxal[123] = 503483222;
        ic.fxal[124] = 1424793219;
        ic.fxal[125] = 1854077121;
        ic.fxal[126] = -635287661;
        ic.fxal[127] = 929129152;
        ic.fxal[128] = -786416350;
        ic.fxal[129] = -863599203;
        ic.fxal[130] = 990286232;
        ic.fxal[131] = -423137870;
        ic.fxal[132] = 838291185;
        ic.fxal[133] = -713542900;
        ic.fxal[134] = -109113628;
        ic.fxal[135] = -1674993955;
        ic.fxal[136] = 1834804808;
        ic.fxal[137] = -748601389;
        ic.fxal[138] = 1048635799;
        ic.fxal[139] = 1556921221;
        ic.fxal[140] = -112976498;
        ic.fxal[141] = -290413598;
        ic.fxal[142] = 1347611586;
        ic.fxal[143] = 306995428;
        ic.fxal[144] = -288328555;
        ic.fxal[145] = 1526588867;
        ic.fxal[146] = 1967794868;
        ic.fxal[147] = 1615687333;
        ic.fxal[148] = -1209442418;
        ic.fxal[149] = -824013581;
        ic.fxal[150] = -2074766766;
        ic.fxal[151] = -2136614180;
        ic.fxal[152] = -1821067758;
        ic.fxal[153] = 1343083877;
        ic.fxal[154] = 1021127119;
        ic.fxal[155] = -905957154;
        ic.fxal[156] = 402324480;
        ic.fxal[157] = 1489800289;
        ic.fxal[158] = -764208203;
        ic.fxal[159] = -928956311;
        ic.fxal[160] = -1590446759;
        ic.fxal[161] = 1534669703;
        ic.fxal[162] = 438427400;
        ic.fxal[163] = -967130572;
        ic.fxal[164] = 572995245;
        ic.fxal[165] = 954652220;
        ic.fxal[166] = -2012998796;
        ic.fxal[167] = 505279247;
        ic.fxal[168] = -1099518704;
        ic.fxal[169] = -1826935552;
        ic.fxal[170] = -1853367469;
        ic.fxal[171] = -582128330;
        ic.fxal[172] = 1496467867;
        ic.fxal[173] = 332594197;
        ic.fxal[174] = 210294897;
        ic.fxal[175] = -1591886054;
        ic.fxal[176] = -1313813974;
        ic.fxal[177] = 9815749;
        ic.fxal[178] = 310971949;
        ic.fxal[179] = -1253537172;
        ic.fxal[180] = -564473654;
        ic.fxal[181] = 1791772182;
        ic.fxal[182] = -1425913453;
        ic.fxal[183] = -1555159226;
        ic.fxal[184] = -1118905057;
        ic.fxal[185] = 1570151210;
        ic.fxal[186] = -1857174235;
        ic.fxal[187] = -895658471;
        ic.fxal[188] = 988463638;
        ic.fxal[189] = -1384252981;
        ic.fxal[190] = 1048475322;
        ic.fxal[191] = -1017731072;
        ic.fxal[192] = 55814203;
        ic.fxal[193] = 353372532;
        ic.fxal[194] = 35253142;
        ic.fxal[195] = -1306097416;
        ic.fxal[196] = 293497230;
        ic.fxal[197] = -1255636959;
        ic.fxal[198] = 773715486;
        ic.fxal[199] = -1260721582;
    }

    private static /* synthetic */ void gadp() {
        ic.fxam[100] = 1691746470;
        ic.fxam[101] = 838354165;
        ic.fxam[102] = 715345994;
        ic.fxam[103] = 1850255920;
        ic.fxam[104] = -1442258473;
        ic.fxam[105] = -1496679367;
        ic.fxam[106] = -158200915;
        ic.fxam[107] = -1037182984;
        ic.fxam[108] = -268065991;
        ic.fxam[109] = -612723178;
        ic.fxam[110] = 1051697730;
        ic.fxam[111] = -572813021;
        ic.fxam[112] = 823585888;
        ic.fxam[113] = -271053586;
        ic.fxam[114] = -47314707;
        ic.fxam[115] = -862146130;
        ic.fxam[116] = 1250119478;
        ic.fxam[117] = 86927380;
        ic.fxam[118] = -315979423;
        ic.fxam[119] = 532176752;
        ic.fxam[120] = -1072445920;
        ic.fxam[121] = -2010353796;
        ic.fxam[122] = -1633597226;
        ic.fxam[123] = 1608682326;
        ic.fxam[124] = 1424793264;
        ic.fxam[125] = 1854077157;
        ic.fxam[126] = -635287624;
        ic.fxam[127] = 929129162;
        ic.fxam[128] = -786416347;
        ic.fxam[129] = -863599230;
        ic.fxam[130] = 990286228;
        ic.fxam[131] = -423137896;
        ic.fxam[132] = 838291178;
        ic.fxam[133] = -713542875;
        ic.fxam[134] = -109113642;
        ic.fxam[135] = -1674993935;
        ic.fxam[136] = 1834804818;
        ic.fxam[137] = -748601372;
        ic.fxam[138] = 1048635807;
        ic.fxam[139] = 1556921270;
        ic.fxam[140] = -112976508;
        ic.fxam[141] = -290413575;
        ic.fxam[142] = 1347611611;
        ic.fxam[143] = 306995445;
        ic.fxam[144] = -288328525;
        ic.fxam[145] = 1526588906;
        ic.fxam[146] = 1967794833;
        ic.fxam[147] = 1615687347;
        ic.fxam[148] = -1209442414;
        ic.fxam[149] = -824013591;
        ic.fxam[150] = -2074766724;
        ic.fxam[151] = -2136614165;
        ic.fxam[152] = -1821067769;
        ic.fxam[153] = 1343083900;
        ic.fxam[154] = 1021127131;
        ic.fxam[155] = -905957162;
        ic.fxam[156] = 402324510;
        ic.fxam[157] = 1489800288;
        ic.fxam[158] = -764208251;
        ic.fxam[159] = -928956307;
        ic.fxam[160] = -1590446784;
        ic.fxam[161] = 1534669739;
        ic.fxam[162] = 438427455;
        ic.fxam[163] = -967130581;
        ic.fxam[164] = 572995235;
        ic.fxam[165] = 954652208;
        ic.fxam[166] = -2012998831;
        ic.fxam[167] = 505279255;
        ic.fxam[168] = -1099518716;
        ic.fxam[169] = -1826935514;
        ic.fxam[170] = -1853367465;
        ic.fxam[171] = -582128383;
        ic.fxam[172] = 1496467860;
        ic.fxam[173] = 332594187;
        ic.fxam[174] = 210294868;
        ic.fxam[175] = -1591886069;
        ic.fxam[176] = -1313813969;
        ic.fxam[177] = 9815749;
        ic.fxam[178] = 310971916;
        ic.fxam[179] = -1253537173;
        ic.fxam[180] = -564473645;
        ic.fxam[181] = 1791772171;
        ic.fxam[182] = -1425913454;
        ic.fxam[183] = -1555159186;
        ic.fxam[184] = -1118905057;
        ic.fxam[185] = 530225962;
        ic.fxam[186] = 1396819237;
        ic.fxam[187] = -1986963943;
        ic.fxam[188] = 2058011158;
        ic.fxam[189] = 1875507659;
        ic.fxam[190] = 2093643450;
        ic.fxam[191] = -1017731032;
        ic.fxam[192] = 55814188;
        ic.fxam[193] = 353372530;
        ic.fxam[194] = 35253120;
        ic.fxam[195] = -1306097447;
        ic.fxam[196] = 293497254;
        ic.fxam[197] = -1255636945;
        ic.fxam[198] = 773715476;
        ic.fxam[199] = -1260721570;
    }

    private static /* synthetic */ void gbei() {
        ic.fxag[200] = 6504310005230614521L;
        ic.fxag[201] = 2096701665829443636L;
        ic.fxag[202] = 1372698682652726925L;
        ic.fxag[203] = -1280736838854160112L;
        ic.fxag[204] = 7096830017098274051L;
        ic.fxag[205] = 6622171814327558039L;
        ic.fxag[206] = 5907895131562256203L;
        ic.fxag[207] = -2977221454432029295L;
        ic.fxag[208] = -1678051419395005399L;
        ic.fxag[209] = 7236397219234898342L;
        ic.fxag[210] = -1107099758535401034L;
        ic.fxag[211] = 696219060525332328L;
        ic.fxag[212] = 1300843283030306582L;
        ic.fxag[213] = 3982590338128550184L;
        ic.fxag[214] = 170107771482313345L;
        ic.fxag[215] = -3047915098251180646L;
        ic.fxag[216] = 9067479974711583645L;
        ic.fxag[217] = 6892409922696699974L;
        ic.fxag[218] = 8451407161926968350L;
        ic.fxag[219] = 1572045530360839398L;
        ic.fxag[220] = 2657901672771142689L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public class_243 randomValue() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ic.nb - ic.fxai("fzwc", fxae(int ), (int)201)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ic.fxai("fzwe", fxak(int ), (int)442)) break;
            v0 /* !! */  = (long)ic.fxai("fzwf", fxak(int ), (int)443);
        }
        var5_1 = ic.c;
        v1 /* !! */  = ic.nb;
        if (true) ** GOTO lbl12
        block23: while (true) {
            v1 /* !! */  = (long)(ic.fxai("fzwl", fxae(int ), (int)203) - ic.fxai("fzwk", fxae(int ), (int)202));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 335134460: {
                    continue block23;
                }
                case 1216024765: {
                    break block23;
                }
            }
            break;
        }
        var4_2 /* !! */  = ic.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ic.nb - ic.fxai("fzwm", fxae(int ), (int)204)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ic.fxai("fzwn", fxak(int ), (int)444)) break;
            v2 /* !! */  = (long)ic.fxai("fzwo", fxak(int ), (int)445);
        }
        var3_3 = ic.a;
        if (var5_1) {
            throw null;
lbl27:
            // 3 sources

            return null;
        }
        if (var3_3) ** GOTO lbl27
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3) ** GOTO lbl27
                var1_4 = ic.fxai("fzwr", fxhg(int ), (int)205);
                if (!var3_3 && !var3_3) ** break;
                ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ic.nb - ic.fxai("fzws", fxae(int ), (int)206)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ic.fxai("fzwy", fxak(int ), (int)446)) break;
                    v3 /* !! */  = (long)ic.fxai("fzwz", fxak(int ), (int)447);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = ic.nb - ic.fxai("fzxa", fxae(int ), (int)207)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ic.fxai("fzxb", fxak(int ), (int)448)) break;
                    v4 /* !! */  = (long)ic.fxai("fzxc", fxak(int ), (int)449);
                }
                v5 /* !! */  = ic.nb;
                if (true) ** GOTO lbl53
                block28: while (true) {
                    v5 /* !! */  = (long)(v6 - ic.fxai("fzxd", fxae(int ), (int)208));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2140055608: {
                            v6 = ic.fxai("fzxf", fxae(int ), (int)209);
                            continue block28;
                        }
                        case -2139113291: {
                            v6 = ic.fxai("fzxl", fxae(int ), (int)210);
                            continue block28;
                        }
                        case 104801451: {
                            v6 = ic.fxai("fzxm", fxae(int ), (int)211);
                            continue block28;
                        }
                        case 1216024765: {
                            break block28;
                        }
                    }
                    break;
                }
                v7 = (this.random.nextDouble() * ic.fxai("fzxn", fxhg(int ), (int)212) - 1.0) * var1_4;
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = ic.nb - ic.fxai("fzxo", fxae(int ), (int)213)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == ic.fxai("fzxp", fxak(int ), (int)450)) break;
                    v8 /* !! */  = (long)ic.fxai("fzxq", fxak(int ), (int)451);
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_5 = ic.nb - ic.fxai("fzxt", fxae(int ), (int)214)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == ic.fxai("fzxv", fxak(int ), (int)452)) break;
                    v9 /* !! */  = (long)ic.fxai("fzxw", fxak(int ), (int)453);
                }
                v10 = (this.random.nextDouble() * ic.fxai("fzxx", fxhg(int ), (int)215) - 1.0) * var1_4;
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_6 = ic.nb - ic.fxai("fzxz", fxae(int ), (int)216)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == ic.fxai("fzyb", fxak(int ), (int)454)) break;
                    v11 /* !! */  = (long)ic.fxai("fzyd", fxak(int ), (int)455);
                }
                v12 /* !! */  = ic.nb;
                if (true) ** GOTO lbl89
                block32: while (true) {
                    v12 /* !! */  = (long)(ic.fxai("fzyg", fxae(int ), (int)218) - ic.fxai("fzye", fxae(int ), (int)217));
lbl89:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -617260924: {
                            continue block32;
                        }
                        case 1216024765: {
                            break block32;
                        }
                    }
                    break;
                }
                v13 = (this.random.nextDouble() * ic.fxai("fzyh", fxhg(int ), (int)219) - 1.0) * var1_4;
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_7 = ic.nb - ic.fxai("fzyi", fxae(int ), (int)220)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v14 /* !! */  == ic.fxai("fzyk", fxak(int ), (int)456)) break;
                    v14 /* !! */  = (long)ic.fxai("fzyl", fxak(int ), (int)457);
                }
                return new class_243(v7, v10, v13);
            }
lbl102:
            // 3 sources

            case 0: {
                var4_2 /* !! */  = (int)ic.fxai("fzyn", fxak(int ), (int)458);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl117
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)ic.fxai("fzyr", fxak(int ), (int)459);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl117
                    break;
                }
            }
            case 2: {
                var4_2 /* !! */  = (int)ic.fxai("fzys", fxak(int ), (int)460);
                if (!var5_1) ** GOTO lbl102
                throw null;
            }
lbl117:
            // 3 sources

            case 3: {
                var4_2 /* !! */  = (int)ic.fxai("fzyt", fxak(int ), (int)461);
                if (!var5_1) ** GOTO lbl102
                throw null;
            }
            case 4: {
                do {
                    var4_2 /* !! */  = (int)ic.fxai("fzyu", fxak(int ), (int)462);
                } while (!var5_1);
                throw null;
            }
            case 5: 
        }
        var4_2 /* !! */  = (int)ic.fxai("fzyv", fxak(int ), (int)463);
        ** while (!var5_1)
lbl129:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float fxki(int n2) {
        return Float.intBitsToFloat(fxal[n2] ^ fxam[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov stepToward(ov var1_1, ov var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, float var9_9) {
        var21_10 = ic.c;
        var20_11 /* !! */  = ic.b;
        var19_12 = ic.a;
        if (var21_10) {
            throw null;
lbl6:
            // 19 sources

            return null;
        }
        if (var19_12 || var19_12) ** GOTO lbl6
        var10_13 = ow.calculateDelta(var1_1, var2_2);
        if (var19_12) ** GOTO lbl6
        if (var20_11 /* !! */  == 0) ** GOTO lbl-1000
        switch (var20_11 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var19_12) ** GOTO lbl6
                var11_14 = var10_13.getYaw();
                if (var19_12 || var19_12) ** GOTO lbl6
                var12_15 = var10_13.getPitch();
                if (var19_12 || var19_12) ** GOTO lbl6
                var13_16 = (float)Math.hypot(var11_14, var12_15);
                if (var19_12 || var19_12) ** GOTO lbl6
                if (!(var13_16 < ic.fxai("fzjj", fxki(int ), (int)329))) ** GOTO lbl24
                if (var19_12 || var19_12) ** GOTO lbl6
                return var1_1;
lbl24:
                // 1 sources

                if (var19_12 || var19_12) ** GOTO lbl6
                if (ms.isReady()) ** GOTO lbl28
                if (var19_12 || var19_12) ** GOTO lbl6
                return this.fallbackStep(var1_1, var11_14, var12_15, var13_16, var8_8, var9_9);
lbl28:
                // 1 sources

                if (var19_12 || var19_12) ** GOTO lbl6
                var14_17 = this.model.next(var11_14, var12_15, var3_3);
                if (var19_12 || var19_12) ** GOTO lbl6
                if (var14_17 != null) ** GOTO lbl34
                if (var19_12 || var19_12) ** GOTO lbl6
                return this.fallbackStep(var1_1, var11_14, var12_15, var13_16, var8_8, var9_9);
lbl34:
                // 1 sources

                if (var19_12 || var19_12) ** GOTO lbl6
                var15_18 = var4_4 + this.random.nextFloat() * var5_5;
                if (var19_12 || var19_12) ** GOTO lbl6
                var16_19 = var6_6 + this.random.nextFloat() * var7_7;
                if (var19_12 || var19_12) ** GOTO lbl6
                var17_20 = class_3532.method_15363((float)(this.lastStepYaw * var16_19 + var14_17[0] * var15_18 * (1.0f - var16_19)), (float)(-var8_8), (float)var8_8);
                if (var19_12 || var19_12) ** GOTO lbl6
                var18_21 = class_3532.method_15363((float)(this.lastStepPitch * var16_19 + var14_17[1] * var15_18 * (1.0f - var16_19)), (float)(-var9_9), (float)var9_9);
                if (var19_12 || var19_12) ** GOTO lbl6
                this.lastStepYaw = var17_20;
                if (var19_12 || var19_12) ** GOTO lbl6
                this.lastStepPitch = var18_21;
                if (!var19_12 && !var19_12) ** break;
                ** continue;
                return new ov(var1_1.getYaw() + var17_20, class_3532.method_15363((float)(var1_1.getPitch() + var18_21), (float)ic.fxai("fzjy", fxki(int ), (int)330), (float)ic.fxai("fzkf", fxki(int ), (int)331)));
            }
lbl49:
            // 3 sources

            case 0: {
                var20_11 /* !! */  = (int)ic.fxai("fzkh", fxak(int ), (int)332);
                if (var21_10) {
                    throw null;
                }
                ** GOTO lbl80
            }
            case 1: {
                var20_11 /* !! */  = (int)ic.fxai("fzkj", fxak(int ), (int)333);
                if (var21_10) {
                    throw null;
                }
                ** GOTO lbl210
            }
            case 2: {
                var20_11 /* !! */  = (int)ic.fxai("fzkl", fxak(int ), (int)334);
                if (var21_10) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl64:
            // 2 sources

            case 3: {
                var20_11 /* !! */  = (int)ic.fxai("fzkn", fxak(int ), (int)335);
                if (var21_10) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl69:
            // 3 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var20_11 /* !! */  = (int)ic.fxai("fzkp", fxak(int ), (int)336);
                    if (var21_10) {
                        throw null;
                    }
                    ** GOTO lbl90
                    break;
                }
            }
            case 5: {
                var20_11 /* !! */  = (int)ic.fxai("fzkr", fxak(int ), (int)337);
                if (var21_10) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl80:
            // 2 sources

            case 6: {
                var20_11 /* !! */  = (int)ic.fxai("fzku", fxak(int ), (int)338);
                if (var21_10) {
                    throw null;
                }
                ** GOTO lbl105
            }
            case 7: {
                var20_11 /* !! */  = (int)ic.fxai("fzkw", fxak(int ), (int)339);
                if (var21_10) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl90:
            // 2 sources

            case 8: {
                var20_11 /* !! */  = (int)ic.fxai("fzky", fxak(int ), (int)340);
                if (var21_10) {
                    throw null;
                }
                ** GOTO lbl210
            }
            case 9: {
                var20_11 /* !! */  = (int)ic.fxai("fzla", fxak(int ), (int)341);
                if (var21_10) {
                    throw null;
                }
                ** GOTO lbl115
            }
            case 10: {
                var20_11 /* !! */  = (int)ic.fxai("fzlc", fxak(int ), (int)342);
                if (var21_10) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl105:
            // 3 sources

            case 11: {
                var20_11 /* !! */  = (int)ic.fxai("fzle", fxak(int ), (int)343);
                if (var21_10) {
                    throw null;
                }
                ** GOTO lbl214
            }
            case 12: {
                var20_11 /* !! */  = (int)ic.fxai("fzlg", fxak(int ), (int)344);
                if (var21_10) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl115:
            // 2 sources

            case 13: {
                var20_11 /* !! */  = (int)ic.fxai("fzlh", fxak(int ), (int)345);
                if (var21_10) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl120:
            // 4 sources

            case 14: {
                var20_11 /* !! */  = (int)ic.fxai("fzlj", fxak(int ), (int)346);
                if (var21_10) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl125:
            // 2 sources

            case 15: {
                var20_11 /* !! */  = (int)ic.fxai("fzlk", fxak(int ), (int)347);
                if (!var21_10) break;
                throw null;
            }
            case 16: {
                var20_11 /* !! */  = (int)ic.fxai("fzll", fxak(int ), (int)348);
                if (var21_10) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl134:
            // 3 sources

            case 17: {
                var20_11 /* !! */  = (int)ic.fxai("fzlm", fxak(int ), (int)349);
                if (var21_10) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 18: {
                var20_11 /* !! */  = (int)ic.fxai("fzlo", fxak(int ), (int)350);
                if (!var21_10) ** GOTO lbl134
                throw null;
            }
            case 19: {
                var20_11 /* !! */  = (int)ic.fxai("fzlr", fxak(int ), (int)351);
                if (!var21_10) ** GOTO lbl120
                throw null;
            }
            case 20: {
                var20_11 /* !! */  = (int)ic.fxai("fzlt", fxak(int ), (int)352);
                if (!var21_10) ** GOTO lbl49
                throw null;
            }
lbl151:
            // 4 sources

            case 21: {
                var20_11 /* !! */  = (int)ic.fxai("fzlu", fxak(int ), (int)353);
                if (var21_10) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl156:
            // 3 sources

            case 22: {
                var20_11 /* !! */  = (int)ic.fxai("fzlv", fxak(int ), (int)354);
                if (!var21_10) ** GOTO lbl151
                throw null;
            }
            case 23: {
                var20_11 /* !! */  = (int)ic.fxai("fzly", fxak(int ), (int)355);
                if (var21_10) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 24: {
                var20_11 /* !! */  = (int)ic.fxai("fzma", fxak(int ), (int)356);
                if (!var21_10) ** GOTO lbl105
                throw null;
            }
            case 25: {
                var20_11 /* !! */  = (int)ic.fxai("fzmc", fxak(int ), (int)357);
                if (!var21_10) ** GOTO lbl69
                throw null;
            }
            case 26: {
                var20_11 /* !! */  = (int)ic.fxai("fzmf", fxak(int ), (int)358);
                if (!var21_10) break;
                throw null;
            }
lbl177:
            // 2 sources

            case 27: {
                var20_11 /* !! */  = (int)ic.fxai("fzmh", fxak(int ), (int)359);
                if (!var21_10) ** GOTO lbl64
                throw null;
            }
lbl181:
            // 2 sources

            case 28: {
                var20_11 /* !! */  = (int)ic.fxai("fzmj", fxak(int ), (int)360);
                if (var21_10) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl186:
            // 2 sources

            case 29: {
                var20_11 /* !! */  = (int)ic.fxai("fzmm", fxak(int ), (int)361);
                if (!var21_10) ** GOTO lbl69
                throw null;
            }
lbl190:
            // 2 sources

            case 30: {
                var20_11 /* !! */  = (int)ic.fxai("fzmo", fxak(int ), (int)362);
                if (!var21_10) ** GOTO lbl120
                throw null;
            }
            case 31: {
                var20_11 /* !! */  = (int)ic.fxai("fzmq", fxak(int ), (int)363);
                if (!var21_10) ** GOTO lbl156
                throw null;
            }
lbl198:
            // 3 sources

            case 32: {
                var20_11 /* !! */  = (int)ic.fxai("fzmt", fxak(int ), (int)364);
                if (!var21_10) ** GOTO lbl120
                throw null;
            }
lbl202:
            // 3 sources

            case 33: {
                var20_11 /* !! */  = (int)ic.fxai("fzmx", fxak(int ), (int)365);
                if (!var21_10) ** GOTO lbl181
                throw null;
            }
lbl206:
            // 2 sources

            case 34: {
                var20_11 /* !! */  = (int)ic.fxai("fznc", fxak(int ), (int)366);
                if (!var21_10) ** GOTO lbl177
                throw null;
            }
lbl210:
            // 6 sources

            case 35: {
                var20_11 /* !! */  = (int)ic.fxai("fznf", fxak(int ), (int)367);
                if (!var21_10) ** GOTO lbl49
                throw null;
            }
lbl214:
            // 2 sources

            case 36: {
                var20_11 /* !! */  = (int)ic.fxai("fzni", fxak(int ), (int)368);
                if (!var21_10) ** GOTO lbl186
                throw null;
            }
lbl218:
            // 2 sources

            case 37: {
                var20_11 /* !! */  = (int)ic.fxai("fznl", fxak(int ), (int)369);
                if (!var21_10) ** GOTO lbl125
                throw null;
            }
            case 38: {
                var20_11 /* !! */  = (int)ic.fxai("fznm", fxak(int ), (int)370);
                if (!var21_10) ** GOTO lbl134
                throw null;
            }
            case 39: 
        }
        var20_11 /* !! */  = (int)ic.fxai("fznn", fxak(int ), (int)371);
        ** while (!var21_10)
lbl229:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gael() {
        ic.fxam[200] = 1602690827;
        ic.fxam[201] = 1192179789;
        ic.fxam[202] = -858427918;
        ic.fxam[203] = -1207652319;
        ic.fxam[204] = 1192134049;
        ic.fxam[205] = 936183041;
        ic.fxam[206] = -326224504;
        ic.fxam[207] = 1939350976;
        ic.fxam[208] = 637944865;
        ic.fxam[209] = -463820010;
        ic.fxam[210] = 505180169;
        ic.fxam[211] = -734305704;
        ic.fxam[212] = 485508781;
        ic.fxam[213] = -467124277;
        ic.fxam[214] = 32424064;
        ic.fxam[215] = -1140777979;
        ic.fxam[216] = 1847813633;
        ic.fxam[217] = -2088693253;
        ic.fxam[218] = 1295967783;
        ic.fxam[219] = -637620311;
        ic.fxam[220] = 878104041;
        ic.fxam[221] = -975011458;
        ic.fxam[222] = 381635065;
        ic.fxam[223] = 433348845;
        ic.fxam[224] = -992422158;
        ic.fxam[225] = 1222535375;
        ic.fxam[226] = 1998279045;
        ic.fxam[227] = 2016089733;
        ic.fxam[228] = -1494399132;
        ic.fxam[229] = -1098384146;
        ic.fxam[230] = -1733719292;
        ic.fxam[231] = -1080355145;
        ic.fxam[232] = -1860554898;
        ic.fxam[233] = -319535224;
        ic.fxam[234] = -1072953683;
        ic.fxam[235] = 1990428701;
        ic.fxam[236] = -974531421;
        ic.fxam[237] = -482838326;
        ic.fxam[238] = -2087805570;
        ic.fxam[239] = 1686297651;
        ic.fxam[240] = -1171744717;
        ic.fxam[241] = 1846654162;
        ic.fxam[242] = 1198666228;
        ic.fxam[243] = 868667120;
        ic.fxam[244] = -1801592574;
        ic.fxam[245] = -1072163911;
        ic.fxam[246] = -423133896;
        ic.fxam[247] = -354932560;
        ic.fxam[248] = 1049952050;
        ic.fxam[249] = -524559574;
        ic.fxam[250] = 1718655792;
        ic.fxam[251] = 531279919;
        ic.fxam[252] = -1636554812;
        ic.fxam[253] = -646128398;
        ic.fxam[254] = -1303372584;
        ic.fxam[255] = -641910468;
        ic.fxam[256] = -188998521;
        ic.fxam[257] = 2001206688;
        ic.fxam[258] = 524754111;
        ic.fxam[259] = -499208368;
        ic.fxam[260] = -1490583763;
        ic.fxam[261] = -1088970725;
        ic.fxam[262] = -1396179969;
        ic.fxam[263] = 659317678;
        ic.fxam[264] = -881251496;
        ic.fxam[265] = 681100734;
        ic.fxam[266] = 1102015976;
        ic.fxam[267] = -1765323643;
        ic.fxam[268] = -72774281;
        ic.fxam[269] = 1986512328;
        ic.fxam[270] = -1944470448;
        ic.fxam[271] = -397595459;
        ic.fxam[272] = 408733163;
        ic.fxam[273] = -563560645;
        ic.fxam[274] = 737422589;
        ic.fxam[275] = -2038246813;
        ic.fxam[276] = 413114898;
        ic.fxam[277] = 130750430;
        ic.fxam[278] = 1557666333;
        ic.fxam[279] = -2128175844;
        ic.fxam[280] = -1291959259;
        ic.fxam[281] = 872514172;
        ic.fxam[282] = 1303403002;
        ic.fxam[283] = 247565720;
        ic.fxam[284] = -1052647033;
        ic.fxam[285] = -103337964;
        ic.fxam[286] = -28807218;
        ic.fxam[287] = -6021347;
        ic.fxam[288] = -1923538114;
        ic.fxam[289] = 192769001;
        ic.fxam[290] = -595742751;
        ic.fxam[291] = -500232413;
        ic.fxam[292] = -1624515419;
        ic.fxam[293] = -92350700;
        ic.fxam[294] = -335480437;
        ic.fxam[295] = 1863292663;
        ic.fxam[296] = -428567481;
        ic.fxam[297] = -154829009;
        ic.fxam[298] = -1799866554;
        ic.fxam[299] = -1086075216;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void onTargetLost() {
        v0 /* !! */  = ic.nb;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - ic.fxai("fxbb", fxae(int ), (int)1));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1655078339: {
                    v1 = ic.fxai("fxbc", fxae(int ), (int)2);
                    continue block20;
                }
                case 1155431946: {
                    v1 = ic.fxai("fxbd", fxae(int ), (int)3);
                    continue block20;
                }
                case 1216024765: {
                    break block20;
                }
                case 1984365834: {
                    v1 = ic.fxai("fxbe", fxae(int ), (int)4);
                    continue block20;
                }
            }
            break;
        }
        var3_1 = ic.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ic.nb - ic.fxai("fxbh", fxae(int ), (int)5)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ic.fxai("fxbi", fxak(int ), (int)11)) break;
            v2 /* !! */  = (long)ic.fxai("fxbj", fxak(int ), (int)12);
        }
        var2_2 /* !! */  = ic.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ic.nb - ic.fxai("fxbl", fxae(int ), (int)6)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ic.fxai("fxbm", fxak(int ), (int)13)) break;
            v3 /* !! */  = (long)ic.fxai("fxbn", fxak(int ), (int)14);
        }
        var1_3 = ic.a;
        if (var3_1) {
            throw null;
lbl32:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        v4 = ic.fxai("fxbo", fxak(int ), (int)15);
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = ic.nb - ic.fxai("fxbq", fxae(int ), (int)7)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ic.fxai("fxbr", fxak(int ), (int)16)) break;
            v5 /* !! */  = (long)ic.fxai("fxbs", fxak(int ), (int)17);
        }
        this.lastEntityId = (int)v4;
        if (var1_3 || var1_3) ** GOTO lbl32
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v6 /* !! */  = ic.nb;
                if (true) ** GOTO lbl50
                block25: while (true) {
                    v6 /* !! */  = (long)(ic.fxai("fxbu", fxae(int ), (int)9) - ic.fxai("fxbt", fxae(int ), (int)8));
lbl50:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -611728047: {
                            continue block25;
                        }
                        case 1216024765: {
                            break block25;
                        }
                    }
                    break;
                }
                this.resetSideDetour();
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)ic.fxai("fxbv", fxak(int ), (int)18);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl82
            }
lbl63:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)ic.fxai("fxbw", fxak(int ), (int)19);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl73
            }
            case 2: {
                var2_2 /* !! */  = (int)ic.fxai("fxbz", fxak(int ), (int)20);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl82
            }
lbl73:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ic.fxai("fxca", fxak(int ), (int)21);
                if (!var3_1) ** GOTO lbl63
                throw null;
            }
lbl77:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ic.fxai("fxcc", fxak(int ), (int)22);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl87
            }
lbl82:
            // 3 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ic.fxai("fxcd", fxak(int ), (int)23);
                    if (!var3_1) ** GOTO lbl63
                    throw null;
                }
            }
lbl87:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)ic.fxai("fxcf", fxak(int ), (int)24);
                if (!var3_1) ** GOTO lbl77
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)ic.fxai("fxcg", fxak(int ), (int)25);
        ** while (!var3_1)
lbl94:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ic() {
        var2_1 /* !! */  = ic.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("Funtime222");
                this.fallback = new hy();
                this.model = ms.get();
                this.random = new Random((long)(ic.fxai("fxaj", fxae(int ), (int)0) ^ System.nanoTime()));
                this.lastEntityId = (int)ic.fxai("fxan", fxak(int ), (int)0);
                this.lastDetourTick = (int)ic.fxai("fxao", fxak(int ), (int)1);
                this.resetWander();
                return;
            }
lbl13:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)ic.fxai("fxaq", fxak(int ), (int)2);
                ** GOTO lbl31
            }
lbl16:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ic.fxai("fxar", fxak(int ), (int)3);
                    ** GOTO lbl23
                    break;
                }
            }
            case 2: {
                var2_1 /* !! */  = (int)ic.fxai("fxas", fxak(int ), (int)4);
                ** GOTO lbl25
            }
lbl23:
            // 3 sources

            case 3: {
                var2_1 /* !! */  = (int)ic.fxai("fxau", fxak(int ), (int)5);
            }
lbl25:
            // 4 sources

            case 4: {
                var2_1 /* !! */  = (int)ic.fxai("fxav", fxak(int ), (int)6);
                ** GOTO lbl13
            }
            case 5: {
                var2_1 /* !! */  = (int)ic.fxai("fxaw", fxak(int ), (int)7);
                ** GOTO lbl16
            }
lbl31:
            // 2 sources

            case 6: {
                var2_1 /* !! */  = (int)ic.fxai("fxax", fxak(int ), (int)8);
                ** GOTO lbl23
            }
            case 7: {
                var2_1 /* !! */  = (int)ic.fxai("fxaz", fxak(int ), (int)9);
                ** GOTO lbl25
            }
            case 8: 
        }
        var2_1 /* !! */  = (int)ic.fxai("fxba", fxak(int ), (int)10);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public ov limitAngleChange(ov var1_1, ov var2_2, class_243 var3_3, class_1297 var4_4) {
        block110: {
            block109: {
                var18_5 = ic.c;
                var17_6 /* !! */  = ic.b;
                var16_7 = ic.a;
                if (var18_5) {
                    throw null;
lbl6:
                    // 29 sources

                    return null;
                }
                if (var16_7 || var16_7) ** GOTO lbl6
                if (ic.mc.field_1724 != null) break block109;
                if (var16_7 || var16_7) ** GOTO lbl6
                return var1_1;
            }
            if (var16_7 || var16_7) ** GOTO lbl6
            if (var4_4 != null) break block110;
            if (var16_7 || var16_7) ** GOTO lbl6
            return this.smoothReset(var1_1, var2_2);
        }
        if (var16_7) ** GOTO lbl6
        if (var17_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var17_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var16_7) ** GOTO lbl6
                var5_8 = var4_4.method_5628();
                if (var16_7 || var16_7) ** GOTO lbl6
                if (var5_8 == this.lastEntityId) ** GOTO lbl37
                if (var16_7 || var16_7) ** GOTO lbl6
                this.lastEntityId = var5_8;
                if (var16_7 || var16_7) ** GOTO lbl6
                this.lastStepYaw = 0.0f;
                if (var16_7 || var16_7) ** GOTO lbl6
                this.lastStepPitch = 0.0f;
                if (var16_7 || var16_7) ** GOTO lbl6
                this.resetSideDetour();
                if (var16_7 || var16_7) ** GOTO lbl6
                this.model.resetPlayback();
                if (var16_7) ** GOTO lbl6
lbl37:
                // 2 sources

                if (var16_7 || var16_7) ** GOTO lbl6
                var6_9 = System.currentTimeMillis();
                if (var16_7 || var16_7) ** GOTO lbl6
                var8_10 = this.updateSideDetour(var1_1, var6_9);
                if (var16_7 || var16_7) ** GOTO lbl6
                if (var8_10 == null) ** GOTO lbl45
                if (var16_7 || var16_7) ** GOTO lbl6
                return var8_10;
lbl45:
                // 1 sources

                if (var16_7 || var16_7) ** GOTO lbl6
                if (var6_9 - this.lastCallAt <= ic.fxai("fymb", fxae(int ), (int)98) + (long)this.random.nextInt((int)ic.fxai("fymg", fxak(int ), (int)115))) ** GOTO lbl50
                if (var16_7 || var16_7) ** GOTO lbl6
                this.model.resetPlayback();
                if (var16_7) ** GOTO lbl6
lbl50:
                // 2 sources

                if (var16_7 || var16_7) ** GOTO lbl6
                this.lastCallAt = var6_9;
                if (var16_7 || var16_7) ** GOTO lbl6
                this.advanceWander();
                if (var16_7 || var16_7) ** GOTO lbl6
                var9_11 = this.blocksTo(var4_4);
                if (var16_7 || var16_7) ** GOTO lbl6
                var11_12 = (float)Math.toDegrees(Math.atan((double)var4_4.method_17681() * ic.fxai("fymi", fxhg(int ), (int)99) / Math.max((double)ic.fxai("fymk", fxhg(int ), (int)100), var9_11)));
                if (var16_7 || var16_7) ** GOTO lbl6
                var12_13 = (float)Math.toDegrees(Math.atan((double)var4_4.method_17682() * ic.fxai("fymn", fxhg(int ), (int)101) / Math.max((double)ic.fxai("fymo", fxhg(int ), (int)102), var9_11)));
                if (var16_7 || var16_7) ** GOTO lbl6
                var13_14 = this.wanderYaw * var11_12 * ic.fxai("fyms", fxki(int ), (int)116);
                if (var16_7 || var16_7) ** GOTO lbl6
                var14_15 = this.wanderPitch * var12_13 * ic.fxai("fymt", fxki(int ), (int)117);
                if (var16_7 || var16_7) ** GOTO lbl6
                var15_16 = new ov(var2_2.getYaw() + var13_14, var2_2.getPitch() + var14_15);
                if (!var16_7 && !var16_7) ** break;
                ** continue;
                return this.stepToward(var1_1, var15_16, this.hitRadius(var4_4, var9_11), (float)ic.fxai("fymz", fxki(int ), (int)118), (float)ic.fxai("fynb", fxki(int ), (int)119), (float)ic.fxai("fync", fxki(int ), (int)120), (float)ic.fxai("fynd", fxki(int ), (int)121), (float)ic.fxai("fyne", fxki(int ), (int)122), (float)ic.fxai("fynf", fxki(int ), (int)123));
            }
lbl69:
            // 3 sources

            case 0: {
                var17_6 /* !! */  = (int)ic.fxai("fyng", fxak(int ), (int)124);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl113
            }
            case 1: {
                var17_6 /* !! */  = (int)ic.fxai("fyni", fxak(int ), (int)125);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl79:
            // 2 sources

            case 2: {
                var17_6 /* !! */  = (int)ic.fxai("fynk", fxak(int ), (int)126);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl89
            }
            case 3: {
                var17_6 /* !! */  = (int)ic.fxai("fynm", fxak(int ), (int)127);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl89:
            // 3 sources

            case 4: {
                var17_6 /* !! */  = (int)ic.fxai("fynp", fxak(int ), (int)128);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl299
            }
            case 5: {
                var17_6 /* !! */  = (int)ic.fxai("fynq", fxak(int ), (int)129);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl138
            }
            case 6: {
                var17_6 /* !! */  = (int)ic.fxai("fyns", fxak(int ), (int)130);
                if (!var18_5) break;
                throw null;
            }
lbl103:
            // 3 sources

            case 7: {
                var17_6 /* !! */  = (int)ic.fxai("fynu", fxak(int ), (int)131);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl142
            }
            case 8: {
                var17_6 /* !! */  = (int)ic.fxai("fynw", fxak(int ), (int)132);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl113:
            // 2 sources

            case 9: {
                var17_6 /* !! */  = (int)ic.fxai("fyny", fxak(int ), (int)133);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl118:
            // 3 sources

            case 10: {
                var17_6 /* !! */  = (int)ic.fxai("fyoa", fxak(int ), (int)134);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl319
            }
lbl123:
            // 2 sources

            case 11: {
                var17_6 /* !! */  = (int)ic.fxai("fyoc", fxak(int ), (int)135);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl323
            }
            case 12: {
                var17_6 /* !! */  = (int)ic.fxai("fyoe", fxak(int ), (int)136);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl133:
            // 3 sources

            case 13: {
                var17_6 /* !! */  = (int)ic.fxai("fyog", fxak(int ), (int)137);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl138:
            // 2 sources

            case 14: {
                var17_6 /* !! */  = (int)ic.fxai("fyoh", fxak(int ), (int)138);
                if (!var18_5) ** GOTO lbl69
                throw null;
            }
lbl142:
            // 2 sources

            case 15: {
                var17_6 /* !! */  = (int)ic.fxai("fyok", fxak(int ), (int)139);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl274
            }
            case 16: {
                var17_6 /* !! */  = (int)ic.fxai("fyom", fxak(int ), (int)140);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl152:
            // 2 sources

            case 17: {
                var17_6 /* !! */  = (int)ic.fxai("fyoo", fxak(int ), (int)141);
                if (!var18_5) ** GOTO lbl123
                throw null;
            }
lbl156:
            // 5 sources

            case 18: {
                var17_6 /* !! */  = (int)ic.fxai("fyoq", fxak(int ), (int)142);
                if (!var18_5) ** GOTO lbl118
                throw null;
            }
            case 19: {
                var17_6 /* !! */  = (int)ic.fxai("fyos", fxak(int ), (int)143);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl206
            }
lbl165:
            // 3 sources

            case 20: {
                do {
                    var17_6 /* !! */  = (int)ic.fxai("fyou", fxak(int ), (int)144);
                } while (!var18_5);
                throw null;
            }
lbl170:
            // 2 sources

            case 21: {
                var17_6 /* !! */  = (int)ic.fxai("fyov", fxak(int ), (int)145);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl270
            }
            case 22: {
                var17_6 /* !! */  = (int)ic.fxai("fyow", fxak(int ), (int)146);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 23: {
                do {
                    var17_6 /* !! */  = (int)ic.fxai("fyox", fxak(int ), (int)147);
                } while (!var18_5);
                throw null;
            }
lbl185:
            // 2 sources

            case 24: {
                var17_6 /* !! */  = (int)ic.fxai("fyoy", fxak(int ), (int)148);
                if (!var18_5) ** GOTO lbl165
                throw null;
            }
lbl189:
            // 2 sources

            case 25: {
                var17_6 /* !! */  = (int)ic.fxai("fyoz", fxak(int ), (int)149);
                if (!var18_5) ** GOTO lbl133
                throw null;
            }
            case 26: {
                var17_6 /* !! */  = (int)ic.fxai("fypa", fxak(int ), (int)150);
                if (var18_5) {
                    throw null;
                }
            }
            case 27: {
                var17_6 /* !! */  = (int)ic.fxai("fypb", fxak(int ), (int)151);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl238
            }
            case 28: {
                var17_6 /* !! */  = (int)ic.fxai("fypc", fxak(int ), (int)152);
                if (!var18_5) ** GOTO lbl69
                throw null;
            }
lbl206:
            // 3 sources

            case 29: {
                var17_6 /* !! */  = (int)ic.fxai("fypg", fxak(int ), (int)153);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl278
            }
            case 30: {
                var17_6 /* !! */  = (int)ic.fxai("fyph", fxak(int ), (int)154);
                if (!var18_5) ** GOTO lbl189
                throw null;
            }
lbl215:
            // 3 sources

            case 31: {
                var17_6 /* !! */  = (int)ic.fxai("fypk", fxak(int ), (int)155);
                if (!var18_5) ** GOTO lbl103
                throw null;
            }
lbl219:
            // 5 sources

            case 32: {
                var17_6 /* !! */  = (int)ic.fxai("fypm", fxak(int ), (int)156);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl295
            }
            case 33: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var17_6 /* !! */  = (int)ic.fxai("fypp", fxak(int ), (int)157);
                    if (!var18_5) ** GOTO lbl215
                    throw null;
                }
            }
lbl229:
            // 2 sources

            case 34: {
                var17_6 /* !! */  = (int)ic.fxai("fyps", fxak(int ), (int)158);
                if (!var18_5) ** GOTO lbl79
                throw null;
            }
            case 35: {
                var17_6 /* !! */  = (int)ic.fxai("fypt", fxak(int ), (int)159);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl238:
            // 3 sources

            case 36: {
                var17_6 /* !! */  = (int)ic.fxai("fypx", fxak(int ), (int)160);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl323
            }
            case 37: {
                var17_6 /* !! */  = (int)ic.fxai("fyqa", fxak(int ), (int)161);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl319
            }
            case 38: {
                var17_6 /* !! */  = (int)ic.fxai("fyqd", fxak(int ), (int)162);
                if (!var18_5) ** GOTO lbl133
                throw null;
            }
lbl252:
            // 3 sources

            case 39: {
                do {
                    var17_6 /* !! */  = (int)ic.fxai("fyqe", fxak(int ), (int)163);
                } while (!var18_5);
                throw null;
            }
lbl257:
            // 3 sources

            case 40: {
                var17_6 /* !! */  = (int)ic.fxai("fyqi", fxak(int ), (int)164);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl274
            }
            case 41: {
                var17_6 /* !! */  = (int)ic.fxai("fyqk", fxak(int ), (int)165);
                if (!var18_5) ** GOTO lbl170
                throw null;
            }
            case 42: {
                var17_6 /* !! */  = (int)ic.fxai("fyqn", fxak(int ), (int)166);
                if (!var18_5) ** GOTO lbl103
                throw null;
            }
lbl270:
            // 2 sources

            case 43: {
                var17_6 /* !! */  = (int)ic.fxai("fyqo", fxak(int ), (int)167);
                if (!var18_5) ** GOTO lbl219
                throw null;
            }
lbl274:
            // 3 sources

            case 44: {
                var17_6 /* !! */  = (int)ic.fxai("fyqp", fxak(int ), (int)168);
                if (!var18_5) ** GOTO lbl89
                throw null;
            }
lbl278:
            // 2 sources

            case 45: {
                var17_6 /* !! */  = (int)ic.fxai("fyqq", fxak(int ), (int)169);
                if (!var18_5) ** GOTO lbl219
                throw null;
            }
            case 46: {
                var17_6 /* !! */  = (int)ic.fxai("fyqs", fxak(int ), (int)170);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl303
            }
            case 47: {
                var17_6 /* !! */  = (int)ic.fxai("fyqz", fxak(int ), (int)171);
                if (!var18_5) ** GOTO lbl206
                throw null;
            }
            case 48: {
                var17_6 /* !! */  = (int)ic.fxai("fyra", fxak(int ), (int)172);
                if (!var18_5) ** GOTO lbl215
                throw null;
            }
lbl295:
            // 2 sources

            case 49: {
                var17_6 /* !! */  = (int)ic.fxai("fyrb", fxak(int ), (int)173);
                if (!var18_5) ** GOTO lbl185
                throw null;
            }
lbl299:
            // 3 sources

            case 50: {
                var17_6 /* !! */  = (int)ic.fxai("fyrc", fxak(int ), (int)174);
                if (!var18_5) ** GOTO lbl156
                throw null;
            }
lbl303:
            // 2 sources

            case 51: {
                var17_6 /* !! */  = (int)ic.fxai("fyrd", fxak(int ), (int)175);
                if (!var18_5) ** GOTO lbl299
                throw null;
            }
            case 52: {
                var17_6 /* !! */  = (int)ic.fxai("fyrg", fxak(int ), (int)176);
                if (!var18_5) ** GOTO lbl118
                throw null;
            }
            case 53: {
                var17_6 /* !! */  = (int)ic.fxai("fyrj", fxak(int ), (int)177);
                if (!var18_5) ** GOTO lbl156
                throw null;
            }
            case 54: {
                var17_6 /* !! */  = (int)ic.fxai("fyrn", fxak(int ), (int)178);
                if (!var18_5) ** GOTO lbl219
                throw null;
            }
lbl319:
            // 3 sources

            case 55: {
                var17_6 /* !! */  = (int)ic.fxai("fyro", fxak(int ), (int)179);
                if (!var18_5) ** GOTO lbl156
                throw null;
            }
lbl323:
            // 3 sources

            case 56: {
                var17_6 /* !! */  = (int)ic.fxai("fyrq", fxak(int ), (int)180);
                if (!var18_5) ** GOTO lbl156
                throw null;
            }
            case 57: 
        }
        var17_6 /* !! */  = (int)ic.fxai("fyrs", fxak(int ), (int)181);
        ** while (!var18_5)
lbl330:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gbdz() {
        ic.fxaf[0] = -8543831664982524527L;
        ic.fxaf[1] = -2191066049647215150L;
        ic.fxaf[2] = 3068433514991534738L;
        ic.fxaf[3] = 7226042116436817752L;
        ic.fxaf[4] = -83473607289910195L;
        ic.fxaf[5] = -1550188235200012749L;
        ic.fxaf[6] = -4864752758795072851L;
        ic.fxaf[7] = 2314631243254030060L;
        ic.fxaf[8] = -8939401151899038490L;
        ic.fxaf[9] = -2683994020941193440L;
        ic.fxaf[10] = 6878205704278899602L;
        ic.fxaf[11] = 174592851156980673L;
        ic.fxaf[12] = 9217047338988331793L;
        ic.fxaf[13] = -7295786867127708893L;
        ic.fxaf[14] = -1249533294799029283L;
        ic.fxaf[15] = -6223263967481633754L;
        ic.fxaf[16] = -8762651828625613307L;
        ic.fxaf[17] = 5672262758256400537L;
        ic.fxaf[18] = -7521935533790023635L;
        ic.fxaf[19] = -1889452973139927385L;
        ic.fxaf[20] = -754556143469775047L;
        ic.fxaf[21] = 9129398450647932364L;
        ic.fxaf[22] = 8682042811063770837L;
        ic.fxaf[23] = -5959932029390892277L;
        ic.fxaf[24] = 1338447251960499744L;
        ic.fxaf[25] = -4015679933199252490L;
        ic.fxaf[26] = -594990802964908979L;
        ic.fxaf[27] = -7995981807402785393L;
        ic.fxaf[28] = 590425250056741806L;
        ic.fxaf[29] = -6996001147293950678L;
        ic.fxaf[30] = 1850055051313497004L;
        ic.fxaf[31] = -4524377474800024884L;
        ic.fxaf[32] = -1875441963861008530L;
        ic.fxaf[33] = -2494479744504188580L;
        ic.fxaf[34] = -3198447653987743526L;
        ic.fxaf[35] = -785382646353418472L;
        ic.fxaf[36] = -1064208910062506761L;
        ic.fxaf[37] = 8297447844817320170L;
        ic.fxaf[38] = -3048930612477018594L;
        ic.fxaf[39] = 5473820517448051670L;
        ic.fxaf[40] = 2334045374364525852L;
        ic.fxaf[41] = -7894249468812572760L;
        ic.fxaf[42] = 1616936738090488703L;
        ic.fxaf[43] = -2715940409295764558L;
        ic.fxaf[44] = 1927606549461059318L;
        ic.fxaf[45] = 7322290411332102918L;
        ic.fxaf[46] = -3566133776037379240L;
        ic.fxaf[47] = 7798865855879559224L;
        ic.fxaf[48] = -7332437258901754442L;
        ic.fxaf[49] = 6434006340903115644L;
        ic.fxaf[50] = -4872932033334014006L;
        ic.fxaf[51] = 72097515420512196L;
        ic.fxaf[52] = -6904057857664013641L;
        ic.fxaf[53] = -3668309204894360985L;
        ic.fxaf[54] = -266406076541417618L;
        ic.fxaf[55] = 3840737562577999415L;
        ic.fxaf[56] = 8934674371148762050L;
        ic.fxaf[57] = -1276529985988650990L;
        ic.fxaf[58] = -29620871709688105L;
        ic.fxaf[59] = -763368302196070279L;
        ic.fxaf[60] = 7435097171929954868L;
        ic.fxaf[61] = -863445001986275857L;
        ic.fxaf[62] = -6749924518100750654L;
        ic.fxaf[63] = 6892935953379864443L;
        ic.fxaf[64] = -1266097469536281660L;
        ic.fxaf[65] = 1142801106548200281L;
        ic.fxaf[66] = -2159977931147863367L;
        ic.fxaf[67] = -4840149738212841845L;
        ic.fxaf[68] = -4897419239417190372L;
        ic.fxaf[69] = -2993892584098838219L;
        ic.fxaf[70] = -9177502084067587275L;
        ic.fxaf[71] = -18436647613694018L;
        ic.fxaf[72] = 5860714912018188298L;
        ic.fxaf[73] = -1487027771740579825L;
        ic.fxaf[74] = 5200769637049975528L;
        ic.fxaf[75] = -715562613111780929L;
        ic.fxaf[76] = 7873340947376232118L;
        ic.fxaf[77] = -8923987128956674974L;
        ic.fxaf[78] = -3309016650198434037L;
        ic.fxaf[79] = -2607310374241460529L;
        ic.fxaf[80] = -8856667922853864638L;
        ic.fxaf[81] = 2953329897394829543L;
        ic.fxaf[82] = -7255951767504625608L;
        ic.fxaf[83] = -9168211159846256380L;
        ic.fxaf[84] = -483544411773104342L;
        ic.fxaf[85] = -3526212001402156471L;
        ic.fxaf[86] = -6423335648536432896L;
        ic.fxaf[87] = 6253356866775656114L;
        ic.fxaf[88] = 5129614734499165084L;
        ic.fxaf[89] = -6584835518975981338L;
        ic.fxaf[90] = -2935997149859335187L;
        ic.fxaf[91] = -6852265117464963514L;
        ic.fxaf[92] = 4277174191797835051L;
        ic.fxaf[93] = -2033268067206407795L;
        ic.fxaf[94] = -4928561526218145615L;
        ic.fxaf[95] = 299408477398977335L;
        ic.fxaf[96] = -3499782310774757895L;
        ic.fxaf[97] = -6812863688561749742L;
        ic.fxaf[98] = -8978961998488358002L;
        ic.fxaf[99] = -3066089539208376462L;
    }

    public static /* synthetic */ CallSite fxai(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private double blocksTo(class_1297 var1_1) {
        block74: {
            v0 /* !! */  = ic.nb;
            if (true) ** GOTO lbl5
            block50: while (true) {
                v0 /* !! */  = (long)(ic.fxai("fxgt", fxae(int ), (int)42) - ic.fxai("fxgs", fxae(int ), (int)41));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -817808541: {
                        continue block50;
                    }
                    case 1216024765: {
                        break block50;
                    }
                }
                break;
            }
            var4_2 = ic.c;
            v1 /* !! */  = ic.nb;
            if (true) ** GOTO lbl15
            block51: while (true) {
                v1 /* !! */  = (long)(v2 - ic.fxai("fxgu", fxae(int ), (int)43));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -183061956: {
                        v2 = ic.fxai("fxgy", fxae(int ), (int)44);
                        continue block51;
                    }
                    case 1216024765: {
                        break block51;
                    }
                    case 1501560903: {
                        v2 = ic.fxai("fxgz", fxae(int ), (int)45);
                        continue block51;
                    }
                }
                break;
            }
            var3_3 /* !! */  = ic.b;
            v3 /* !! */  = ic.nb;
            if (true) ** GOTO lbl29
            block52: while (true) {
                v3 /* !! */  = (long)(ic.fxai("fxhc", fxae(int ), (int)47) - ic.fxai("fxhb", fxae(int ), (int)46));
lbl29:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 1216024765: {
                        break block52;
                    }
                    case 1643479214: {
                        continue block52;
                    }
                }
                break;
            }
            var2_4 = ic.a;
            if (var4_2) {
                throw null;
lbl37:
                // 6 sources

                return (double)ic.fxai("fxho", fxhg(int ), (int)48);
            }
            if (var2_4 || var2_4) ** GOTO lbl37
            v4 /* !! */  = ic.nb;
            if (true) ** GOTO lbl44
            block54: while (true) {
                v4 /* !! */  = (long)(v5 - ic.fxai("fxhp", fxae(int ), (int)49));
lbl44:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case 1208675229: {
                        v5 = ic.fxai("fxhq", fxae(int ), (int)50);
                        continue block54;
                    }
                    case 1216024765: {
                        break block54;
                    }
                    case 1805279405: {
                        v5 = ic.fxai("fxhr", fxae(int ), (int)51);
                        continue block54;
                    }
                }
                break;
            }
            v6 /* !! */  = ic.nb;
            if (true) ** GOTO lbl57
            block55: while (true) {
                v6 /* !! */  = (long)(ic.fxai("fxht", fxae(int ), (int)53) - ic.fxai("fxhs", fxae(int ), (int)52));
lbl57:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -591101993: {
                        continue block55;
                    }
                    case 1216024765: {
                        break block55;
                    }
                }
                break;
            }
            if (ic.mc.field_1724 == null) break block74;
            if (var2_4) ** GOTO lbl37
            if (var1_1 != null) ** GOTO lbl73
            if (var2_4) ** GOTO lbl37
        }
        if (var2_4) ** GOTO lbl37
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl37
                return (double)ic.fxai("fxhx", fxhg(int ), (int)54);
            }
lbl73:
            // 1 sources

            if (!var2_4 && !var2_4) ** break;
            ** continue;
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_0 = ic.nb - ic.fxai("fxhz", fxae(int ), (int)55)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == ic.fxai("fxia", fxak(int ), (int)66)) break;
                v7 /* !! */  = (long)ic.fxai("fxib", fxak(int ), (int)67);
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_1 = ic.nb - ic.fxai("fxid", fxae(int ), (int)56)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == ic.fxai("fxie", fxak(int ), (int)68)) break;
                v8 /* !! */  = (long)ic.fxai("fxif", fxak(int ), (int)69);
            }
            v9 = ic.mc.field_1724;
            v10 /* !! */  = ic.nb;
            if (true) ** GOTO lbl90
            block58: while (true) {
                v10 /* !! */  = (long)(ic.fxai("fxij", fxae(int ), (int)58) - ic.fxai("fxii", fxae(int ), (int)57));
lbl90:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case 1216024765: {
                        break block58;
                    }
                    case 1650860046: {
                        continue block58;
                    }
                }
                break;
            }
            v11 = v9.method_33571();
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_2 = ic.nb - ic.fxai("fxik", fxae(int ), (int)59)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == ic.fxai("fxil", fxak(int ), (int)70)) break;
                v12 /* !! */  = (long)ic.fxai("fxim", fxak(int ), (int)71);
            }
            v13 = var1_1.method_73189();
            v14 /* !! */  = ic.nb;
            if (true) ** GOTO lbl106
            block60: while (true) {
                v14 /* !! */  = (long)(v15 - ic.fxai("fxin", fxae(int ), (int)60));
lbl106:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -1170601739: {
                        v15 = ic.fxai("fxip", fxae(int ), (int)61);
                        continue block60;
                    }
                    case 1216024765: {
                        break block60;
                    }
                    case 1487605127: {
                        v15 = ic.fxai("fxis", fxae(int ), (int)62);
                        continue block60;
                    }
                    case 2009183362: {
                        v15 = ic.fxai("fxit", fxae(int ), (int)63);
                        continue block60;
                    }
                }
                break;
            }
            v16 = (double)var1_1.method_17682() * ic.fxai("fxiu", fxhg(int ), (int)64);
            v17 /* !! */  = ic.nb;
            if (true) ** GOTO lbl123
            block61: while (true) {
                v17 /* !! */  = (long)(v18 - ic.fxai("fxiw", fxae(int ), (int)65));
lbl123:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -250533990: {
                        v18 = ic.fxai("fxix", fxae(int ), (int)66);
                        continue block61;
                    }
                    case -197493527: {
                        v18 = ic.fxai("fxiy", fxae(int ), (int)67);
                        continue block61;
                    }
                    case 1216024765: {
                        break block61;
                    }
                }
                break;
            }
            v19 = v13.method_1031(0.0, v16, 0.0);
            while (true) {
                if ((v20 /* !! */  = (cfr_temp_3 = ic.nb - ic.fxai("fxja", fxae(int ), (int)68)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v20 /* !! */  == ic.fxai("fxjd", fxak(int ), (int)72)) break;
                v20 /* !! */  = (long)ic.fxai("fxje", fxak(int ), (int)73);
            }
            return v11.method_1022(v19);
            case 0: {
                do {
                    var3_3 /* !! */  = (int)ic.fxai("fxjf", fxak(int ), (int)74);
                } while (!var4_2);
                throw null;
            }
lbl144:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)ic.fxai("fxjg", fxak(int ), (int)75);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)ic.fxai("fxjh", fxak(int ), (int)76);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl153:
            // 3 sources

            case 3: {
                var3_3 /* !! */  = (int)ic.fxai("fxjj", fxak(int ), (int)77);
                if (var4_2) {
                    throw null;
                }
            }
lbl157:
            // 4 sources

            case 4: {
                var3_3 /* !! */  = (int)ic.fxai("fxjk", fxak(int ), (int)78);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 5: {
                var3_3 /* !! */  = (int)ic.fxai("fxjl", fxak(int ), (int)79);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 6: {
                var3_3 /* !! */  = (int)ic.fxai("fxjn", fxak(int ), (int)80);
                if (!var4_2) ** GOTO lbl153
                throw null;
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ic.fxai("fxjo", fxak(int ), (int)81);
                    if (!var4_2) ** GOTO lbl153
                    throw null;
                }
            }
lbl176:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)ic.fxai("fxjp", fxak(int ), (int)82);
                if (!var4_2) ** GOTO lbl144
                throw null;
            }
lbl180:
            // 3 sources

            case 9: {
                var3_3 /* !! */  = (int)ic.fxai("fxjr", fxak(int ), (int)83);
                if (!var4_2) ** GOTO lbl157
                throw null;
            }
            case 10: 
        }
        var3_3 /* !! */  = (int)ic.fxai("fxjs", fxak(int ), (int)84);
        ** while (!var4_2)
lbl187:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov updateSideDetour(ov var1_1, long var2_2) {
        var9_3 = ic.c;
        var8_4 /* !! */  = ic.b;
        var7_5 = ic.a;
        if (var9_3) {
            throw null;
lbl6:
            // 23 sources

            return null;
        }
        if (var7_5 || var7_5) ** GOTO lbl6
        var4_6 = ic.mc.field_1724.field_6012;
        if (var7_5 || var7_5) ** GOTO lbl6
        if (var4_6 == this.lastDetourTick) ** GOTO lbl20
        if (var7_5 || var7_5) ** GOTO lbl6
        this.lastDetourTick = var4_6;
        if (var7_5 || var7_5) ** GOTO lbl6
        this.detourTickCounter += ic.fxai("fyrz", fxak(int ), (int)182);
        if (var8_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_5) ** GOTO lbl6
lbl20:
                // 2 sources

                if (var7_5 || var7_5) ** GOTO lbl6
                if (this.detourTickCounter < ic.fxai("fysc", fxak(int ), (int)183)) ** GOTO lbl43
                if (var7_5) ** GOTO lbl6
                if (this.sideDetourUntil != ic.fxai("fyse", fxae(int ), (int)103)) ** GOTO lbl43
                if (var7_5 || var7_5) ** GOTO lbl6
                this.detourTickCounter = (int)ic.fxai("fysg", fxak(int ), (int)184);
                if (var7_5 || var7_5) ** GOTO lbl6
                this.sideDetourStartedAt = var2_2;
                if (var7_5 || var7_5) ** GOTO lbl6
                this.sideDetourUntil = var2_2 + ic.fxai("fysi", fxae(int ), (int)104);
                if (var7_5 || var7_5) ** GOTO lbl6
                this.sideDetourStartYaw = var1_1.getYaw();
                if (var7_5 || var7_5) ** GOTO lbl6
                if (this.random.nextBoolean()) {
                    v0 = ic.fxai("fysj", fxki(int ), (int)185);
                    if (var9_3) {
                        throw null;
                    }
                } else {
                    v0 = ic.fxai("fyso", fxki(int ), (int)186);
                }
                this.sideDetourTargetYaw = this.sideDetourStartYaw + v0;
                if (var7_5 || var7_5) ** GOTO lbl6
                this.sideDetourPitch = var1_1.getPitch();
                if (var7_5) ** GOTO lbl6
lbl43:
                // 3 sources

                if (var7_5 || var7_5) ** GOTO lbl6
                if (this.sideDetourUntil != ic.fxai("fysr", fxae(int ), (int)105)) ** GOTO lbl47
                if (var7_5 || var7_5) ** GOTO lbl6
                return null;
lbl47:
                // 1 sources

                if (var7_5 || var7_5) ** GOTO lbl6
                if (var2_2 < this.sideDetourUntil) ** GOTO lbl53
                if (var7_5 || var7_5) ** GOTO lbl6
                this.sideDetourUntil = (long)ic.fxai("fyst", fxae(int ), (int)106);
                if (var7_5 || var7_5) ** GOTO lbl6
                return null;
lbl53:
                // 1 sources

                if (var7_5 || var7_5) ** GOTO lbl6
                var5_7 = class_3532.method_15363((float)((float)(var2_2 - this.sideDetourStartedAt) / ic.fxai("fysu", fxki(int ), (int)187)), (float)0.0f, (float)1.0f);
                if (var7_5 || var7_5) ** GOTO lbl6
                var5_7 = var5_7 * var5_7 * (ic.fxai("fysw", fxki(int ), (int)188) - 2.0f * var5_7);
                if (var7_5 || var7_5) ** GOTO lbl6
                var6_8 = class_3532.method_15393((float)(this.sideDetourTargetYaw - this.sideDetourStartYaw));
                if (!var7_5 && !var7_5) ** break;
                ** continue;
                return new ov(this.sideDetourStartYaw + var6_8 * var5_7, class_3532.method_15363((float)this.sideDetourPitch, (float)ic.fxai("fyta", fxki(int ), (int)189), (float)ic.fxai("fytb", fxki(int ), (int)190)));
            }
lbl62:
            // 4 sources

            case 0: {
                var8_4 /* !! */  = (int)ic.fxai("fytf", fxak(int ), (int)191);
                if (var9_3) {
                    throw null;
                }
            }
            case 1: {
                var8_4 /* !! */  = (int)ic.fxai("fyti", fxak(int ), (int)192);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl71:
            // 2 sources

            case 2: {
                var8_4 /* !! */  = (int)ic.fxai("fytk", fxak(int ), (int)193);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl215
            }
lbl76:
            // 2 sources

            case 3: {
                var8_4 /* !! */  = (int)ic.fxai("fytp", fxak(int ), (int)194);
                if (!var9_3) ** GOTO lbl62
                throw null;
            }
lbl80:
            // 2 sources

            case 4: {
                var8_4 /* !! */  = (int)ic.fxai("fytq", fxak(int ), (int)195);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 5: {
                var8_4 /* !! */  = (int)ic.fxai("fytr", fxak(int ), (int)196);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl90:
            // 2 sources

            case 6: {
                var8_4 /* !! */  = (int)ic.fxai("fyts", fxak(int ), (int)197);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl115
            }
            case 7: {
                var8_4 /* !! */  = (int)ic.fxai("fytt", fxak(int ), (int)198);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl100:
            // 2 sources

            case 8: {
                var8_4 /* !! */  = (int)ic.fxai("fytu", fxak(int ), (int)199);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl115
            }
            case 9: {
                var8_4 /* !! */  = (int)ic.fxai("fytw", fxak(int ), (int)200);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl110:
            // 3 sources

            case 10: {
                var8_4 /* !! */  = (int)ic.fxai("fyub", fxak(int ), (int)201);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl115:
            // 5 sources

            case 11: {
                var8_4 /* !! */  = (int)ic.fxai("fyud", fxak(int ), (int)202);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl120:
            // 3 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var8_4 /* !! */  = (int)ic.fxai("fyuf", fxak(int ), (int)203);
                    if (!var9_3) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 13: {
                var8_4 /* !! */  = (int)ic.fxai("fyug", fxak(int ), (int)204);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl223
            }
            case 14: {
                var8_4 /* !! */  = (int)ic.fxai("fyuh", fxak(int ), (int)205);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 15: {
                var8_4 /* !! */  = (int)ic.fxai("fyui", fxak(int ), (int)206);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl140:
            // 2 sources

            case 16: {
                var8_4 /* !! */  = (int)ic.fxai("fyuj", fxak(int ), (int)207);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 17: {
                var8_4 /* !! */  = (int)ic.fxai("fyum", fxak(int ), (int)208);
                if (!var9_3) ** GOTO lbl76
                throw null;
            }
lbl149:
            // 2 sources

            case 18: {
                var8_4 /* !! */  = (int)ic.fxai("fyun", fxak(int ), (int)209);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl154:
            // 3 sources

            case 19: {
                var8_4 /* !! */  = (int)ic.fxai("fyuo", fxak(int ), (int)210);
                if (!var9_3) ** GOTO lbl120
                throw null;
            }
            case 20: {
                var8_4 /* !! */  = (int)ic.fxai("fyur", fxak(int ), (int)211);
                if (!var9_3) ** GOTO lbl140
                throw null;
            }
            case 21: {
                var8_4 /* !! */  = (int)ic.fxai("fyuu", fxak(int ), (int)212);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl248
            }
lbl167:
            // 3 sources

            case 22: {
                var8_4 /* !! */  = (int)ic.fxai("fyuv", fxak(int ), (int)213);
                if (!var9_3) ** GOTO lbl62
                throw null;
            }
            case 23: {
                var8_4 /* !! */  = (int)ic.fxai("fyuw", fxak(int ), (int)214);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 24: {
                var8_4 /* !! */  = (int)ic.fxai("fyvb", fxak(int ), (int)215);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 25: {
                var8_4 /* !! */  = (int)ic.fxai("fyvd", fxak(int ), (int)216);
                if (!var9_3) ** GOTO lbl90
                throw null;
            }
            case 26: {
                var8_4 /* !! */  = (int)ic.fxai("fyvf", fxak(int ), (int)217);
                if (!var9_3) ** GOTO lbl100
                throw null;
            }
lbl189:
            // 2 sources

            case 27: {
                var8_4 /* !! */  = (int)ic.fxai("fyvg", fxak(int ), (int)218);
                if (var9_3) {
                    throw null;
                }
            }
lbl193:
            // 6 sources

            case 28: {
                var8_4 /* !! */  = (int)ic.fxai("fyvh", fxak(int ), (int)219);
                if (!var9_3) ** GOTO lbl154
                throw null;
            }
lbl197:
            // 2 sources

            case 29: {
                var8_4 /* !! */  = (int)ic.fxai("fyvi", fxak(int ), (int)220);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 30: {
                var8_4 /* !! */  = (int)ic.fxai("fyvj", fxak(int ), (int)221);
                if (!var9_3) ** GOTO lbl149
                throw null;
            }
lbl206:
            // 4 sources

            case 31: {
                do {
                    var8_4 /* !! */  = (int)ic.fxai("fyvr", fxak(int ), (int)222);
                } while (!var9_3);
                throw null;
            }
            case 32: {
                var8_4 /* !! */  = (int)ic.fxai("fyvs", fxak(int ), (int)223);
                if (!var9_3) ** GOTO lbl206
                throw null;
            }
lbl215:
            // 2 sources

            case 33: {
                var8_4 /* !! */  = (int)ic.fxai("fyvt", fxak(int ), (int)224);
                if (!var9_3) ** GOTO lbl193
                throw null;
            }
lbl219:
            // 4 sources

            case 34: {
                var8_4 /* !! */  = (int)ic.fxai("fyvu", fxak(int ), (int)225);
                if (!var9_3) ** GOTO lbl62
                throw null;
            }
lbl223:
            // 2 sources

            case 35: {
                var8_4 /* !! */  = (int)ic.fxai("fyvw", fxak(int ), (int)226);
                if (!var9_3) ** GOTO lbl154
                throw null;
            }
lbl227:
            // 2 sources

            case 36: {
                var8_4 /* !! */  = (int)ic.fxai("fyvy", fxak(int ), (int)227);
                if (!var9_3) ** GOTO lbl193
                throw null;
            }
lbl231:
            // 2 sources

            case 37: {
                var8_4 /* !! */  = (int)ic.fxai("fywa", fxak(int ), (int)228);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl244
            }
            case 38: {
                var8_4 /* !! */  = (int)ic.fxai("fywf", fxak(int ), (int)229);
                if (!var9_3) ** GOTO lbl197
                throw null;
            }
            case 39: {
                var8_4 /* !! */  = (int)ic.fxai("fywg", fxak(int ), (int)230);
                if (!var9_3) ** GOTO lbl80
                throw null;
            }
lbl244:
            // 3 sources

            case 40: {
                var8_4 /* !! */  = (int)ic.fxai("fywi", fxak(int ), (int)231);
                if (!var9_3) ** GOTO lbl110
                throw null;
            }
lbl248:
            // 2 sources

            case 41: {
                var8_4 /* !! */  = (int)ic.fxai("fywk", fxak(int ), (int)232);
                if (!var9_3) ** GOTO lbl71
                throw null;
            }
            case 42: {
                var8_4 /* !! */  = (int)ic.fxai("fywn", fxak(int ), (int)233);
                if (!var9_3) ** GOTO lbl244
                throw null;
            }
            case 43: {
                var8_4 /* !! */  = (int)ic.fxai("fywo", fxak(int ), (int)234);
                if (!var9_3) ** GOTO lbl110
                throw null;
            }
lbl260:
            // 2 sources

            case 44: {
                var8_4 /* !! */  = (int)ic.fxai("fywp", fxak(int ), (int)235);
                if (!var9_3) ** GOTO lbl206
                throw null;
            }
            case 45: 
        }
        var8_4 /* !! */  = (int)ic.fxai("fywr", fxak(int ), (int)236);
        ** while (!var9_3)
lbl267:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ double fxhg(int n2) {
        return Double.longBitsToDouble(fxaf[n2] ^ fxag[n2]);
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void advanceWander() {
        v0 /* !! */  = ic.nb;
        if (true) ** GOTO lbl5
        block41: while (true) {
            v0 /* !! */  = (long)(v1 - ic.fxai("fzro", fxae(int ), (int)171));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1216024765: {
                    break block41;
                }
                case 1534116303: {
                    v1 = ic.fxai("fzrp", fxae(int ), (int)172);
                    continue block41;
                }
                case 1794104840: {
                    v1 = ic.fxai("fzrq", fxae(int ), (int)173);
                    continue block41;
                }
            }
            break;
        }
        var3_1 = ic.c;
        v2 /* !! */  = ic.nb;
        if (true) ** GOTO lbl19
        block42: while (true) {
            v2 /* !! */  = (long)(v3 - ic.fxai("fzrs", fxae(int ), (int)174));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1941165199: {
                    v3 = ic.fxai("fzru", fxae(int ), (int)175);
                    continue block42;
                }
                case -1584108698: {
                    v3 = ic.fxai("fzrw", fxae(int ), (int)176);
                    continue block42;
                }
                case 1193737545: {
                    v3 = ic.fxai("fzrx", fxae(int ), (int)177);
                    continue block42;
                }
                case 1216024765: {
                    break block42;
                }
            }
            break;
        }
        var2_2 /* !! */  = ic.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = ic.nb - ic.fxai("fzrz", fxae(int ), (int)178)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ic.fxai("fzsa", fxak(int ), (int)407)) {
                var1_3 = ic.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v4 /* !! */  = (long)ic.fxai("fzsd", fxak(int ), (int)408);
        }
        if (var1_3 || var1_3) return;
        while (true) {
            block68: {
                if ((v5 /* !! */  = (cfr_temp_2 = ic.nb - ic.fxai("fzsf", fxae(int ), (int)179)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  != ic.fxai("fzsh", fxak(int ), (int)409)) break block68;
                v6 = ic.fxai("fzsk", fxki(int ), (int)411);
                v7 /* !! */  = ic.nb;
                if (true) ** GOTO lbl53
            }
            v5 /* !! */  = (long)ic.fxai("fzsj", fxak(int ), (int)410);
        }
        block45: while (true) {
            v7 /* !! */  = (long)(v8 - ic.fxai("fzsm", fxae(int ), (int)180));
lbl53:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 579473472: {
                    v8 = ic.fxai("fzsr", fxae(int ), (int)181);
                    continue block45;
                }
                case 1216024765: {
                    break block45;
                }
                case 1290948017: {
                    v8 = ic.fxai("fzss", fxae(int ), (int)182);
                    continue block45;
                }
            }
            break;
        }
        v9 = v6 * this.wanderYaw;
        v10 = ic.fxai("fzst", fxki(int ), (int)412);
        v11 /* !! */  = ic.nb;
        if (true) ** GOTO lbl68
        block46: while (true) {
            v11 /* !! */  = (long)(v12 - ic.fxai("fzsu", fxae(int ), (int)183));
lbl68:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -934739717: {
                    v12 = ic.fxai("fzsy", fxae(int ), (int)184);
                    continue block46;
                }
                case 226186849: {
                    v12 = ic.fxai("fzta", fxae(int ), (int)185);
                    continue block46;
                }
                case 1216024765: {
                    break block46;
                }
            }
            break;
        }
        v13 = this.wanderYaw + (v9 + v10 * this.randGauss());
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_3 = ic.nb - ic.fxai("fztb", fxae(int ), (int)186)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == ic.fxai("fztc", fxak(int ), (int)413)) {
                this.wanderYaw = v13;
                if (var1_3) return;
                break;
            }
            v14 /* !! */  = (long)ic.fxai("fztd", fxak(int ), (int)414);
        }
        if (var1_3) return;
        while (true) {
            block69: {
                if ((v15 /* !! */  = (cfr_temp_4 = ic.nb - ic.fxai("fzte", fxae(int ), (int)187)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  != ic.fxai("fztf", fxak(int ), (int)415)) break block69;
                v16 = ic.fxai("fzth", fxki(int ), (int)417);
                v17 /* !! */  = ic.nb;
                if (true) ** GOTO lbl98
            }
            v15 /* !! */  = (long)ic.fxai("fztg", fxak(int ), (int)416);
        }
        block49: while (true) {
            v17 /* !! */  = (long)(v18 - ic.fxai("fzti", fxae(int ), (int)188));
lbl98:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -1107039299: {
                    v18 = ic.fxai("fztj", fxae(int ), (int)189);
                    continue block49;
                }
                case -115448019: {
                    v18 = ic.fxai("fztk", fxae(int ), (int)190);
                    continue block49;
                }
                case 863674674: {
                    v18 = ic.fxai("fztl", fxae(int ), (int)191);
                    continue block49;
                }
                case 1216024765: {
                    break block49;
                }
            }
            break;
        }
        v19 = v16 * this.wanderPitch;
        v20 = ic.fxai("fztm", fxki(int ), (int)418);
        while (true) {
            if ((v21 /* !! */  = (cfr_temp_5 = ic.nb - ic.fxai("fztt", fxae(int ), (int)192)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v21 /* !! */  == ic.fxai("fztu", fxak(int ), (int)419)) break;
            v21 /* !! */  = (long)ic.fxai("fztv", fxak(int ), (int)420);
        }
        v22 = this.wanderPitch + (v19 + v20 * this.randGauss());
        v23 /* !! */  = ic.nb;
        block51: while (true) {
            switch ((int)v23 /* !! */ ) {
                case -1159142285: {
                    v23 /* !! */  = (long)(ic.fxai("fzty", fxae(int ), (int)194) - ic.fxai("fztx", fxae(int ), (int)193));
                    continue block51;
                }
                case 1216024765: {
                    break block51;
                }
            }
            break;
        }
        this.wanderPitch = v22;
        if (var1_3 || var1_3) {
            return;
        }
        if (var2_2 /* !! */  == 0) return;
        cfr_temp_0 = -2147483648;
        block52: do {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: {
                    return;
                }
                case 1: {
                    var2_2 /* !! */  = (int)ic.fxai("fzud", fxak(int ), (int)422);
                    cfr_temp_0 = 4;
                    if (!var3_1) continue block52;
                    throw null;
                }
                case 6: {
                    var2_2 /* !! */  = (int)ic.fxai("fzun", fxak(int ), (int)427);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 5: {
                    var2_2 /* !! */  = (int)ic.fxai("fzul", fxak(int ), (int)426);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 0: {
                    var2_2 /* !! */  = (int)ic.fxai("fzua", fxak(int ), (int)421);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)ic.fxai("fzuf", fxak(int ), (int)423);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 3: {
                    ** GOTO lbl162
                }
                case 7: {
                    var2_2 /* !! */  = (int)ic.fxai("fzuq", fxak(int ), (int)428);
                    if (var3_1) {
                        throw null;
                    }
lbl162:
                    // 3 sources

                    var2_2 /* !! */  = (int)ic.fxai("fzuh", fxak(int ), (int)424);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 4: 
            }
            break;
        } while (true);
        do {
            var2_2 /* !! */  = (int)ic.fxai("fzuj", fxak(int ), (int)425);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void gaex() {
        ic.fxam[300] = 1291206039;
        ic.fxam[301] = 1089422294;
        ic.fxam[302] = 1624371781;
        ic.fxam[303] = -90532286;
        ic.fxam[304] = 1966637330;
        ic.fxam[305] = -1760798534;
        ic.fxam[306] = 48117952;
        ic.fxam[307] = 1976014438;
        ic.fxam[308] = -887045007;
        ic.fxam[309] = -825106360;
        ic.fxam[310] = 1744019611;
        ic.fxam[311] = 1138860813;
        ic.fxam[312] = 1629397191;
        ic.fxam[313] = -943345840;
        ic.fxam[314] = -1625056149;
        ic.fxam[315] = 1737136115;
        ic.fxam[316] = -1755399580;
        ic.fxam[317] = -231089481;
        ic.fxam[318] = 1027883041;
        ic.fxam[319] = 2079557504;
        ic.fxam[320] = -121756482;
        ic.fxam[321] = -1250396952;
        ic.fxam[322] = -1273457245;
        ic.fxam[323] = -1111255800;
        ic.fxam[324] = -1679922848;
        ic.fxam[325] = -998655057;
        ic.fxam[326] = 390921952;
        ic.fxam[327] = 1830530895;
        ic.fxam[328] = -1577154014;
        ic.fxam[329] = 942981224;
        ic.fxam[330] = 17769763;
        ic.fxam[331] = 482144074;
        ic.fxam[332] = -1205505382;
        ic.fxam[333] = -544215464;
        ic.fxam[334] = 1348798892;
        ic.fxam[335] = -1771069652;
        ic.fxam[336] = -688026414;
        ic.fxam[337] = 1701385050;
        ic.fxam[338] = -1047786628;
        ic.fxam[339] = 1378168224;
        ic.fxam[340] = -1215795910;
        ic.fxam[341] = -1971138883;
        ic.fxam[342] = -605948304;
        ic.fxam[343] = 1680838994;
        ic.fxam[344] = 969722336;
        ic.fxam[345] = 631212652;
        ic.fxam[346] = 510095249;
        ic.fxam[347] = 1401741491;
        ic.fxam[348] = 1846554846;
        ic.fxam[349] = -1242537393;
        ic.fxam[350] = 84693674;
        ic.fxam[351] = -1813110275;
        ic.fxam[352] = -464440814;
        ic.fxam[353] = -2055168527;
        ic.fxam[354] = -1695820519;
        ic.fxam[355] = -1005807755;
        ic.fxam[356] = 533590036;
        ic.fxam[357] = -122904477;
        ic.fxam[358] = 161972714;
        ic.fxam[359] = 810617839;
        ic.fxam[360] = -2001843100;
        ic.fxam[361] = 792556127;
        ic.fxam[362] = -2123537631;
        ic.fxam[363] = 402973591;
        ic.fxam[364] = 1671963363;
        ic.fxam[365] = 1773161135;
        ic.fxam[366] = 287763542;
        ic.fxam[367] = 2021455085;
        ic.fxam[368] = 1508329604;
        ic.fxam[369] = 1002682575;
        ic.fxam[370] = -2011989369;
        ic.fxam[371] = -1708495343;
        ic.fxam[372] = 166347075;
        ic.fxam[373] = -623225391;
        ic.fxam[374] = 1256881449;
        ic.fxam[375] = -1216460224;
        ic.fxam[376] = 1067442517;
        ic.fxam[377] = 1432166272;
        ic.fxam[378] = -2083611520;
        ic.fxam[379] = 156244894;
        ic.fxam[380] = -1910420064;
        ic.fxam[381] = 642113992;
        ic.fxam[382] = 790393136;
        ic.fxam[383] = -2008994507;
        ic.fxam[384] = -1960374419;
        ic.fxam[385] = -140750251;
        ic.fxam[386] = 78946579;
        ic.fxam[387] = 1117864253;
        ic.fxam[388] = 1125068635;
        ic.fxam[389] = -164183431;
        ic.fxam[390] = -150309557;
        ic.fxam[391] = 1122660253;
        ic.fxam[392] = 1060473750;
        ic.fxam[393] = 1924762450;
        ic.fxam[394] = 607993243;
        ic.fxam[395] = 1883105457;
        ic.fxam[396] = -1229005495;
        ic.fxam[397] = -1377920981;
        ic.fxam[398] = 1662260466;
        ic.fxam[399] = 1487118414;
    }

    static {
        fxal = new int[464];
        fxam = new int[464];
        ic.fzyx();
        ic.fzzn();
        ic.gaak();
        ic.gabc();
        ic.gabw();
        ic.gaco();
        ic.gadp();
        ic.gael();
        ic.gaex();
        ic.gbdx();
        fxaf = new long[221];
        fxag = new long[221];
        ic.gbdz();
        ic.gbeb();
        ic.gbed();
        ic.gbee();
        ic.gbeg();
        ic.gbei();
    }

    private static /* synthetic */ void gaco() {
        ic.fxam[0] = 1045934184;
        ic.fxam[1] = 1846710099;
        ic.fxam[2] = -848757895;
        ic.fxam[3] = 413824320;
        ic.fxam[4] = -1841270331;
        ic.fxam[5] = 2016824139;
        ic.fxam[6] = 1371619491;
        ic.fxam[7] = 2066336972;
        ic.fxam[8] = -761746535;
        ic.fxam[9] = 196391698;
        ic.fxam[10] = 364401345;
        ic.fxam[11] = -541316227;
        ic.fxam[12] = -1470594654;
        ic.fxam[13] = 1160819299;
        ic.fxam[14] = 2046430737;
        ic.fxam[15] = -1240270762;
        ic.fxam[16] = 669627822;
        ic.fxam[17] = -69907142;
        ic.fxam[18] = 413170033;
        ic.fxam[19] = -2001004597;
        ic.fxam[20] = 1564449937;
        ic.fxam[21] = -974028621;
        ic.fxam[22] = -745764021;
        ic.fxam[23] = -695060300;
        ic.fxam[24] = -80331995;
        ic.fxam[25] = 1834137682;
        ic.fxam[26] = 62650939;
        ic.fxam[27] = 1076233540;
        ic.fxam[28] = 1898504857;
        ic.fxam[29] = 894632449;
        ic.fxam[30] = 2054948678;
        ic.fxam[31] = 1730329725;
        ic.fxam[32] = -507154869;
        ic.fxam[33] = -2054130053;
        ic.fxam[34] = -1203177115;
        ic.fxam[35] = 1633118179;
        ic.fxam[36] = -1680396195;
        ic.fxam[37] = -1853132954;
        ic.fxam[38] = -1903485032;
        ic.fxam[39] = 995588366;
        ic.fxam[40] = 1774091921;
        ic.fxam[41] = -264407189;
        ic.fxam[42] = 1952903990;
        ic.fxam[43] = -1550554293;
        ic.fxam[44] = -1898874536;
        ic.fxam[45] = 222703386;
        ic.fxam[46] = 2032807241;
        ic.fxam[47] = -1158034948;
        ic.fxam[48] = -2109383685;
        ic.fxam[49] = 1010495062;
        ic.fxam[50] = -447328201;
        ic.fxam[51] = -790983833;
        ic.fxam[52] = 1895996928;
        ic.fxam[53] = 1507493551;
        ic.fxam[54] = -1242715374;
        ic.fxam[55] = -1087945956;
        ic.fxam[56] = -187688521;
        ic.fxam[57] = -1566307407;
        ic.fxam[58] = 1920899203;
        ic.fxam[59] = 884919049;
        ic.fxam[60] = 328441978;
        ic.fxam[61] = 1156853643;
        ic.fxam[62] = 1273872623;
        ic.fxam[63] = -892683068;
        ic.fxam[64] = -73457157;
        ic.fxam[65] = -1254727934;
        ic.fxam[66] = 1132064040;
        ic.fxam[67] = 413321425;
        ic.fxam[68] = -582587066;
        ic.fxam[69] = -1627244015;
        ic.fxam[70] = -1864024468;
        ic.fxam[71] = -1667363948;
        ic.fxam[72] = 1270068253;
        ic.fxam[73] = 204902913;
        ic.fxam[74] = -1275225075;
        ic.fxam[75] = -105190425;
        ic.fxam[76] = -71531261;
        ic.fxam[77] = -1576026981;
        ic.fxam[78] = -1787692264;
        ic.fxam[79] = -273556896;
        ic.fxam[80] = 1030721601;
        ic.fxam[81] = 1038495179;
        ic.fxam[82] = 108489887;
        ic.fxam[83] = -2087326369;
        ic.fxam[84] = 614891873;
        ic.fxam[85] = -1099429344;
        ic.fxam[86] = -1231596305;
        ic.fxam[87] = -1712699561;
        ic.fxam[88] = -1807277784;
        ic.fxam[89] = 534357108;
        ic.fxam[90] = 261371377;
        ic.fxam[91] = 2122216697;
        ic.fxam[92] = -834067401;
        ic.fxam[93] = -970512087;
        ic.fxam[94] = 478059395;
        ic.fxam[95] = -1247472035;
        ic.fxam[96] = -163665945;
        ic.fxam[97] = -1676638179;
        ic.fxam[98] = 1750479127;
        ic.fxam[99] = -926168573;
    }

    private static /* synthetic */ void gbee() {
        ic.fxag[0] = -8543768248822319908L;
        ic.fxag[1] = 3317755659896292736L;
        ic.fxag[2] = -769660304710011363L;
        ic.fxag[3] = -5663062904356484607L;
        ic.fxag[4] = 4340686000693779358L;
        ic.fxag[5] = 4568180627502063179L;
        ic.fxag[6] = 6161870939415707937L;
        ic.fxag[7] = -2806440685273380016L;
        ic.fxag[8] = -7577031583514075806L;
        ic.fxag[9] = 6588208459782070637L;
        ic.fxag[10] = 8078283714711002717L;
        ic.fxag[11] = -9090904055187044654L;
        ic.fxag[12] = 6899801169138271880L;
        ic.fxag[13] = 4677512320119178243L;
        ic.fxag[14] = 5750175310556143639L;
        ic.fxag[15] = 911776805347349236L;
        ic.fxag[16] = 11713539018826288L;
        ic.fxag[17] = -638466869888562066L;
        ic.fxag[18] = 8905941722773435089L;
        ic.fxag[19] = -1724225619396522366L;
        ic.fxag[20] = -1719582666573702093L;
        ic.fxag[21] = -6418503464579552172L;
        ic.fxag[22] = -7849793712016120822L;
        ic.fxag[23] = -858201078403555770L;
        ic.fxag[24] = 7623054359516775276L;
        ic.fxag[25] = 1290427771652783854L;
        ic.fxag[26] = -6520017533053409793L;
        ic.fxag[27] = 2144686224780976692L;
        ic.fxag[28] = -5896240612170610315L;
        ic.fxag[29] = 1421627165428259988L;
        ic.fxag[30] = 4262587437881344123L;
        ic.fxag[31] = -2318333338412364426L;
        ic.fxag[32] = 4867033926599213590L;
        ic.fxag[33] = 8524627919948465095L;
        ic.fxag[34] = 2854897259720158476L;
        ic.fxag[35] = -7497891720806015615L;
        ic.fxag[36] = -8927376615977191196L;
        ic.fxag[37] = -3440477804103347189L;
        ic.fxag[38] = 3409968122717295829L;
        ic.fxag[39] = -9002305241768192100L;
        ic.fxag[40] = 1683481410602757214L;
        ic.fxag[41] = -7111497549377178220L;
        ic.fxag[42] = 6035477771340194400L;
        ic.fxag[43] = -3659465026394181203L;
        ic.fxag[44] = 8367147833920367444L;
        ic.fxag[45] = 718035092942333618L;
        ic.fxag[46] = -4804542665277285098L;
        ic.fxag[47] = 4537424816261186171L;
        ic.fxag[48] = -6487886220569070898L;
        ic.fxag[49] = 5745911117491442199L;
        ic.fxag[50] = 4904674959915100214L;
        ic.fxag[51] = -5678097771861732076L;
        ic.fxag[52] = -8635687658037835651L;
        ic.fxag[53] = 1958559386628718845L;
        ic.fxag[54] = -4874714395248277650L;
        ic.fxag[55] = -33144978937628381L;
        ic.fxag[56] = 826886192562339488L;
        ic.fxag[57] = 6307676673353587865L;
        ic.fxag[58] = -6567458375199038946L;
        ic.fxag[59] = 5542270816696177858L;
        ic.fxag[60] = 4029377300741689382L;
        ic.fxag[61] = -2252646888814449380L;
        ic.fxag[62] = 2415022924593207336L;
        ic.fxag[63] = -5033705823902616558L;
        ic.fxag[64] = -3346760497381450812L;
        ic.fxag[65] = 6893311935057466728L;
        ic.fxag[66] = -3301595205751765734L;
        ic.fxag[67] = 2549421726513825993L;
        ic.fxag[68] = 5770536062387938093L;
        ic.fxag[69] = -4399189391687533373L;
        ic.fxag[70] = 1031852146568325333L;
        ic.fxag[71] = -4025421695400249045L;
        ic.fxag[72] = 7977406736882321418L;
        ic.fxag[73] = -8851026116231852332L;
        ic.fxag[74] = -7702767140417683997L;
        ic.fxag[75] = 8900740352335634798L;
        ic.fxag[76] = -2125446107427762922L;
        ic.fxag[77] = 5646346573854850261L;
        ic.fxag[78] = -1300411216391192821L;
        ic.fxag[79] = 3244786702874059502L;
        ic.fxag[80] = 7984953659014511260L;
        ic.fxag[81] = -868560652452885875L;
        ic.fxag[82] = 8742059924000033141L;
        ic.fxag[83] = -626444077689790759L;
        ic.fxag[84] = 3719365176682408934L;
        ic.fxag[85] = 7211600479161248066L;
        ic.fxag[86] = -5716108369515735559L;
        ic.fxag[87] = 7577415157222581938L;
        ic.fxag[88] = -6275704481532319289L;
        ic.fxag[89] = 1845417422350466050L;
        ic.fxag[90] = -825613791322062073L;
        ic.fxag[91] = -8280815392663503441L;
        ic.fxag[92] = -6372928124038398259L;
        ic.fxag[93] = -4788810827128835298L;
        ic.fxag[94] = 7397111125195152187L;
        ic.fxag[95] = -4233851950246032575L;
        ic.fxag[96] = 4818635365310322739L;
        ic.fxag[97] = 2631014176217148921L;
        ic.fxag[98] = -8978961998488358158L;
        ic.fxag[99] = -1543872865157148814L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void resetSideDetour() {
        block90: {
            block89: {
                v0 /* !! */  = ic.nb;
                if (true) ** GOTO lbl5
                block56: while (true) {
                    v0 /* !! */  = (long)(v1 - ic.fxai("fywz", fxae(int ), (int)107));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1185592464: {
                            v1 = ic.fxai("fyxa", fxae(int ), (int)108);
                            continue block56;
                        }
                        case 1216024765: {
                            break block56;
                        }
                        case 2077337359: {
                            v1 = ic.fxai("fyxb", fxae(int ), (int)109);
                            continue block56;
                        }
                    }
                    break;
                }
                var3_1 = ic.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = ic.nb - ic.fxai("fyxg", fxae(int ), (int)110)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == ic.fxai("fyxi", fxak(int ), (int)237)) break;
                    v2 /* !! */  = (long)ic.fxai("fyxk", fxak(int ), (int)238);
                }
                var2_2 /* !! */  = ic.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = ic.nb - ic.fxai("fyxl", fxae(int ), (int)111)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ic.fxai("fyxn", fxak(int ), (int)239)) break;
                    v3 /* !! */  = (long)ic.fxai("fyxo", fxak(int ), (int)240);
                }
                var1_3 = ic.a;
                if (var3_1) {
                    throw null;
lbl29:
                    // 9 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl29
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ic.nb - ic.fxai("fyxr", fxae(int ), (int)112)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ic.fxai("fyxt", fxak(int ), (int)241)) break;
                    v4 /* !! */  = (long)ic.fxai("fyxv", fxak(int ), (int)242);
                }
                v5 /* !! */  = ic.nb;
                if (true) ** GOTO lbl41
                block61: while (true) {
                    v5 /* !! */  = (long)(v6 - ic.fxai("fyxw", fxae(int ), (int)113));
lbl41:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1076456416: {
                            v6 = ic.fxai("fyxy", fxae(int ), (int)114);
                            continue block61;
                        }
                        case 105993397: {
                            v6 = ic.fxai("fyxz", fxae(int ), (int)115);
                            continue block61;
                        }
                        case 506068659: {
                            v6 = ic.fxai("fyyb", fxae(int ), (int)116);
                            continue block61;
                        }
                        case 1216024765: {
                            break block61;
                        }
                    }
                    break;
                }
                if (ic.mc.field_1724 == null) break block89;
                v7 /* !! */  = ic.nb;
                if (true) ** GOTO lbl58
                block62: while (true) {
                    v7 /* !! */  = (long)(v8 - ic.fxai("fyyc", fxae(int ), (int)117));
lbl58:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1629444826: {
                            v8 = ic.fxai("fyyd", fxae(int ), (int)118);
                            continue block62;
                        }
                        case 247301087: {
                            v8 = ic.fxai("fyyf", fxae(int ), (int)119);
                            continue block62;
                        }
                        case 1216024765: {
                            break block62;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = ic.nb - ic.fxai("fyyh", fxae(int ), (int)120)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ic.fxai("fyyn", fxak(int ), (int)243)) break;
                    v9 /* !! */  = (long)ic.fxai("fyyo", fxak(int ), (int)244);
                }
                v10 = ic.mc.field_1724;
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = ic.nb - ic.fxai("fyyp", fxae(int ), (int)121)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ic.fxai("fyys", fxak(int ), (int)245)) break;
                    v11 /* !! */  = (long)ic.fxai("fyyu", fxak(int ), (int)246);
                }
                v12 /* !! */  = (CallSite)v10.field_6012;
                if (var3_1) {
                    throw null;
                }
                break block90;
            }
            v12 /* !! */  = ic.fxai("fyyw", fxak(int ), (int)247);
        }
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_5 = ic.nb - ic.fxai("fyyx", fxae(int ), (int)122)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == ic.fxai("fyyy", fxak(int ), (int)248)) break;
            v13 /* !! */  = (long)ic.fxai("fyyz", fxak(int ), (int)249);
        }
        this.lastDetourTick = (int)v12 /* !! */ ;
        if (var1_3 || var1_3) ** GOTO lbl29
        v14 = ic.fxai("fyza", fxak(int ), (int)250);
        v15 /* !! */  = ic.nb;
        if (true) ** GOTO lbl97
        block66: while (true) {
            v15 /* !! */  = (long)(v16 - ic.fxai("fyzb", fxae(int ), (int)123));
lbl97:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -1706630768: {
                    v16 = ic.fxai("fyzc", fxae(int ), (int)124);
                    continue block66;
                }
                case 852735340: {
                    v16 = ic.fxai("fyzd", fxae(int ), (int)125);
                    continue block66;
                }
                case 1216024765: {
                    break block66;
                }
                case 1366683266: {
                    v16 = ic.fxai("fyze", fxae(int ), (int)126);
                    continue block66;
                }
            }
            break;
        }
        this.detourTickCounter = (int)v14;
        if (var1_3 || var1_3) ** GOTO lbl29
        v17 = ic.fxai("fyzf", fxae(int ), (int)127);
        v18 /* !! */  = ic.nb;
        if (true) ** GOTO lbl116
        block67: while (true) {
            v18 /* !! */  = (long)(ic.fxai("fyzt", fxae(int ), (int)129) - ic.fxai("fyzr", fxae(int ), (int)128));
lbl116:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case 717176709: {
                    continue block67;
                }
                case 1216024765: {
                    break block67;
                }
            }
            break;
        }
        this.sideDetourUntil = (long)v17;
        if (var1_3 || var1_3) ** GOTO lbl29
        v19 = ic.fxai("fyzu", fxae(int ), (int)130);
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_6 = ic.nb - ic.fxai("fyzv", fxae(int ), (int)131)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == ic.fxai("fyzw", fxak(int ), (int)251)) break;
            v20 /* !! */  = (long)ic.fxai("fyzx", fxak(int ), (int)252);
        }
        this.sideDetourStartedAt = (long)v19;
        if (var1_3 || var1_3) ** GOTO lbl29
        v21 /* !! */  = ic.nb;
        if (true) ** GOTO lbl135
        block69: while (true) {
            v21 /* !! */  = (long)(v22 - ic.fxai("fyzz", fxae(int ), (int)132));
lbl135:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -949032020: {
                    v22 = ic.fxai("fzag", fxae(int ), (int)133);
                    continue block69;
                }
                case 1216024765: {
                    break block69;
                }
                case 1943747562: {
                    v22 = ic.fxai("fzah", fxae(int ), (int)134);
                    continue block69;
                }
            }
            break;
        }
        this.sideDetourStartYaw = 0.0f;
        if (var1_3) ** GOTO lbl29
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl29
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_7 = ic.nb - ic.fxai("fzai", fxae(int ), (int)135)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == ic.fxai("fzaj", fxak(int ), (int)253)) break;
                    v23 /* !! */  = (long)ic.fxai("fzal", fxak(int ), (int)254);
                }
                this.sideDetourTargetYaw = 0.0f;
                if (var1_3 || var1_3) ** GOTO lbl29
                v24 /* !! */  = ic.nb;
                if (true) ** GOTO lbl161
                block71: while (true) {
                    v24 /* !! */  = (long)(v25 - ic.fxai("fzan", fxae(int ), (int)136));
lbl161:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -534430426: {
                            v25 = ic.fxai("fzap", fxae(int ), (int)137);
                            continue block71;
                        }
                        case 1084972995: {
                            v25 = ic.fxai("fzat", fxae(int ), (int)138);
                            continue block71;
                        }
                        case 1216024765: {
                            break block71;
                        }
                    }
                    break;
                }
                this.sideDetourPitch = 0.0f;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)ic.fxai("fzau", fxak(int ), (int)255);
                if (!var3_1) break;
                throw null;
            }
lbl178:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)ic.fxai("fzax", fxak(int ), (int)256);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 2: {
                var2_2 /* !! */  = (int)ic.fxai("fzba", fxak(int ), (int)257);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl202
            }
            case 3: {
                var2_2 /* !! */  = (int)ic.fxai("fzbc", fxak(int ), (int)258);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl220
            }
            case 4: {
                var2_2 /* !! */  = (int)ic.fxai("fzbf", fxak(int ), (int)259);
                if (!var3_1) ** GOTO lbl178
                throw null;
            }
lbl197:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)ic.fxai("fzbg", fxak(int ), (int)260);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl202:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)ic.fxai("fzbj", fxak(int ), (int)261);
                if (!var3_1) ** GOTO lbl178
                throw null;
            }
lbl206:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)ic.fxai("fzbk", fxak(int ), (int)262);
                if (!var3_1) ** GOTO lbl197
                throw null;
            }
lbl210:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)ic.fxai("fzbm", fxak(int ), (int)263);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl244
            }
            case 9: {
                do {
                    var2_2 /* !! */  = (int)ic.fxai("fzbn", fxak(int ), (int)264);
                } while (!var3_1);
                throw null;
            }
lbl220:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)ic.fxai("fzbp", fxak(int ), (int)265);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl248
            }
            case 11: {
                var2_2 /* !! */  = (int)ic.fxai("fzbr", fxak(int ), (int)266);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl248
            }
lbl230:
            // 2 sources

            case 12: {
                do {
                    var2_2 /* !! */  = (int)ic.fxai("fzbt", fxak(int ), (int)267);
                } while (!var3_1);
                throw null;
            }
            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ic.fxai("fzbu", fxak(int ), (int)268);
                    if (!var3_1) ** GOTO lbl210
                    throw null;
                }
            }
lbl240:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)ic.fxai("fzbx", fxak(int ), (int)269);
                if (!var3_1) ** GOTO lbl210
                throw null;
            }
lbl244:
            // 2 sources

            case 15: {
                var2_2 /* !! */  = (int)ic.fxai("fzbz", fxak(int ), (int)270);
                if (!var3_1) ** GOTO lbl240
                throw null;
            }
lbl248:
            // 3 sources

            case 16: {
                var2_2 /* !! */  = (int)ic.fxai("fzcb", fxak(int ), (int)271);
                if (!var3_1) ** GOTO lbl206
                throw null;
            }
            case 17: 
        }
        var2_2 /* !! */  = (int)ic.fxai("fzce", fxak(int ), (int)272);
        ** while (!var3_1)
lbl255:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private float hitRadius(class_1297 var1_1, double var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = ic.nb - ic.fxai("fxjw", fxae(int ), (int)69)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ic.fxai("fxjx", fxak(int ), (int)85)) break;
            v0 /* !! */  = (long)ic.fxai("fxjy", fxak(int ), (int)86);
        }
        var10_3 = ic.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_2 = ic.nb - ic.fxai("fxjz", fxae(int ), (int)70)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ic.fxai("fxkc", fxak(int ), (int)87)) break;
            v1 /* !! */  = (long)ic.fxai("fxkd", fxak(int ), (int)88);
        }
        var9_4 /* !! */  = ic.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_3 = ic.nb - ic.fxai("fxkf", fxae(int ), (int)71)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ic.fxai("fxkg", fxak(int ), (int)89)) {
                var8_5 = ic.a;
                if (var10_3) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)ic.fxai("fxkh", fxak(int ), (int)90);
        }
        if (var8_5 != false) return (float)ic.fxai("fxkm", fxki(int ), (int)91);
        if (var8_5 != false) return (float)ic.fxai("fxkm", fxki(int ), (int)91);
        if (var1_1 == null) {
            if (var8_5 != false) return (float)ic.fxai("fxkm", fxki(int ), (int)91);
            if (var8_5 != false) return (float)ic.fxai("fxkm", fxki(int ), (int)91);
            return (float)ic.fxai("fxko", fxki(int ), (int)92);
        }
        if (var8_5 != false) return (float)ic.fxai("fxkm", fxki(int ), (int)91);
        if (var9_4 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block55: while (true) {
            block83: {
                switch (cfr_temp_0 == -2147483648 ? var9_4 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var8_5 != false) return (float)ic.fxai("fxkm", fxki(int ), (int)91);
                        v3 = ic.fxai("fxkp", fxhg(int ), (int)72);
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_4 = ic.nb - ic.fxai("fxkq", fxae(int ), (int)73)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v4 /* !! */  != ic.fxai("fxkr", fxak(int ), (int)93)) ** GOTO lbl44
                            var4_6 = Math.max((double)v3, var2_2);
                            if (var8_5 != false) return (float)ic.fxai("fxkm", fxki(int ), (int)91);
                            if (var8_5 != false) return (float)ic.fxai("fxkm", fxki(int ), (int)91);
                            v5 /* !! */  = ic.nb;
                            if (true) ** GOTO lbl97
lbl44:
                            // 1 sources

                            v4 /* !! */  = (long)ic.fxai("fxks", fxak(int ), (int)94);
                        }
                    }
                    case 2: {
                        var9_4 /* !! */  = (int)ic.fxai("fyks", fxak(int ), (int)102);
                        if (var10_3) {
                            throw null;
                        }
                    }
                    case 0: {
                        var9_4 /* !! */  = (int)ic.fxai("fykp", fxak(int ), (int)100);
                        cfr_temp_0 = 3;
                        if (var10_3) {
                            throw null;
                        }
                        break block83;
                    }
                    case 4: {
                        var9_4 /* !! */  = (int)ic.fxai("fykv", fxak(int ), (int)104);
                        if (var10_3) {
                            throw null;
                        }
                    }
                    case 1: {
                        var9_4 /* !! */  = (int)ic.fxai("fykr", fxak(int ), (int)101);
                        if (var10_3) {
                            throw null;
                        }
                    }
                    case 3: {
                        var9_4 /* !! */  = (int)ic.fxai("fykt", fxak(int ), (int)103);
                        cfr_temp_0 = 8;
                        if (var10_3) {
                            throw null;
                        }
                        break block83;
                    }
                    case 5: {
                        var9_4 /* !! */  = (int)ic.fxai("fyky", fxak(int ), (int)105);
                        if (var10_3) {
                            throw null;
                        }
                        ** GOTO lbl201
                    }
                    case 6: {
                        var9_4 /* !! */  = (int)ic.fxai("fylb", fxak(int ), (int)106);
                        cfr_temp_0 = 9;
                        if (var10_3) {
                            throw null;
                        }
                        break block83;
                    }
                    case 7: {
                        var9_4 /* !! */  = (int)ic.fxai("fyle", fxak(int ), (int)107);
                        if (var10_3) {
                            throw null;
                        }
                        ** GOTO lbl201
                    }
                    case 9: {
                        ** GOTO lbl204
                    }
                    case 13: {
                        var9_4 /* !! */  = (int)ic.fxai("fylr", fxak(int ), (int)113);
                        if (var10_3) {
                            throw null;
                        }
                        ** GOTO lbl201
                    }
                    case 14: {
                        ** GOTO lbl201
                    }
                    block57: while (true) {
                        v5 /* !! */  = (long)(v6 - ic.fxai("fxkt", fxae(int ), (int)74));
lbl97:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case -1889135679: {
                                v6 = ic.fxai("fxkw", fxae(int ), (int)75);
                                continue block57;
                            }
                            case -110907562: {
                                v6 = ic.fxai("fyik", fxae(int ), (int)76);
                                continue block57;
                            }
                            case 1216024765: {
                                break block57;
                            }
                            case 1313079755: {
                                v6 = ic.fxai("fyil", fxae(int ), (int)77);
                                continue block57;
                            }
                        }
                        break;
                    }
                    v7 = (double)var1_1.method_17681() * ic.fxai("fyim", fxhg(int ), (int)78) / var4_6;
                    v8 /* !! */  = ic.nb;
                    if (true) ** GOTO lbl114
                    block58: while (true) {
                        v8 /* !! */  = (long)(v9 - ic.fxai("fyin", fxae(int ), (int)79));
lbl114:
                        // 2 sources

                        switch ((int)v8 /* !! */ ) {
                            case -269197754: {
                                v9 = ic.fxai("fyio", fxae(int ), (int)80);
                                continue block58;
                            }
                            case 1216024765: {
                                break block58;
                            }
                            case 1417908532: {
                                v9 = ic.fxai("fyiw", fxae(int ), (int)81);
                                continue block58;
                            }
                            case 1590448215: {
                                v9 = ic.fxai("fyiy", fxae(int ), (int)82);
                                continue block58;
                            }
                        }
                        break;
                    }
                    v10 = Math.atan(v7);
                    v11 /* !! */  = ic.nb;
                    block59: while (true) {
                        switch ((int)v11 /* !! */ ) {
                            case 1216024765: {
                                break block59;
                            }
                            case 1236137591: {
                                v11 /* !! */  = (long)(ic.fxai("fyjc", fxae(int ), (int)84) - ic.fxai("fyja", fxae(int ), (int)83));
                                continue block59;
                            }
                        }
                        break;
                    }
                    var6_7 = (float)Math.toDegrees(v10);
                    if (var8_5 != false) return (float)ic.fxai("fxkm", fxki(int ), (int)91);
                    if (var8_5 != false) return (float)ic.fxai("fxkm", fxki(int ), (int)91);
                    v12 /* !! */  = ic.nb;
                    block60: while (true) {
                        switch ((int)v12 /* !! */ ) {
                            case 1216024765: {
                                break block60;
                            }
                            case 1411155345: {
                                v12 /* !! */  = (long)(ic.fxai("fyjg", fxae(int ), (int)86) - ic.fxai("fyje", fxae(int ), (int)85));
                                continue block60;
                            }
                        }
                        break;
                    }
                    v13 = (double)var1_1.method_17682() * ic.fxai("fyjj", fxhg(int ), (int)87) / var4_6;
                    v14 /* !! */  = ic.nb;
                    if (true) ** GOTO lbl151
                    block61: while (true) {
                        v14 /* !! */  = (long)(v15 - ic.fxai("fyjl", fxae(int ), (int)88));
lbl151:
                        // 2 sources

                        switch ((int)v14 /* !! */ ) {
                            case -2011940554: {
                                v15 = ic.fxai("fyjm", fxae(int ), (int)89);
                                continue block61;
                            }
                            case 1216024765: {
                                break block61;
                            }
                            case 1686689125: {
                                v15 = ic.fxai("fyjo", fxae(int ), (int)90);
                                continue block61;
                            }
                        }
                        break;
                    }
                    v16 = Math.atan(v13);
                    while (true) {
                        if ((v17 /* !! */  = (cfr_temp_5 = ic.nb - ic.fxai("fyjq", fxae(int ), (int)91)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v17 /* !! */  != ic.fxai("fyju", fxak(int ), (int)95)) ** GOTO lbl169
                        var7_8 = (float)Math.toDegrees(v16);
                        if (var8_5 != false) return (float)ic.fxai("fxkm", fxki(int ), (int)91);
                        if (var8_5 != false) return (float)ic.fxai("fxkm", fxki(int ), (int)91);
                        v18 /* !! */  = ic.nb;
                        if (true) ** GOTO lbl173
lbl169:
                        // 1 sources

                        v17 /* !! */  = (long)ic.fxai("fyka", fxak(int ), (int)96);
                    }
                    block63: while (true) {
                        v18 /* !! */  = (long)(v19 - ic.fxai("fykd", fxae(int ), (int)92));
lbl173:
                        // 2 sources

                        switch ((int)v18 /* !! */ ) {
                            case -1809430937: {
                                v19 = ic.fxai("fykf", fxae(int ), (int)93);
                                continue block63;
                            }
                            case 468481165: {
                                v19 = ic.fxai("fykg", fxae(int ), (int)94);
                                continue block63;
                            }
                            case 880622268: {
                                v19 = ic.fxai("fykh", fxae(int ), (int)95);
                                continue block63;
                            }
                            case 1216024765: {
                                break block63;
                            }
                        }
                        break;
                    }
                    v20 = Math.min(var6_7, var7_8) * ic.fxai("fyki", fxki(int ), (int)97);
                    v21 = ic.fxai("fykl", fxki(int ), (int)98);
                    v22 = ic.fxai("fykm", fxki(int ), (int)99);
                    v23 /* !! */  = ic.nb;
                    block64: while (true) {
                        switch ((int)v23 /* !! */ ) {
                            case 1216024765: {
                                return class_3532.method_15363((float)v20, (float)v21, (float)v22);
                            }
                            case 1567571543: {
                                v23 /* !! */  = (long)(ic.fxai("fyko", fxae(int ), (int)97) - ic.fxai("fykn", fxae(int ), (int)96));
                                continue block64;
                            }
                        }
                        break;
                    }
                    return class_3532.method_15363((float)v20, (float)v21, (float)v22);
                    case 8: {
                        var9_4 /* !! */  = (int)ic.fxai("fylf", fxak(int ), (int)108);
                        if (var10_3) {
                            throw null;
                        }
lbl201:
                        // 6 sources

                        var9_4 /* !! */  = (int)ic.fxai("fyls", fxak(int ), (int)114);
                        if (var10_3) {
                            throw null;
                        }
lbl204:
                        // 3 sources

                        var9_4 /* !! */  = (int)ic.fxai("fylh", fxak(int ), (int)109);
                        if (var10_3) {
                            throw null;
                        }
                    }
                    case 12: {
                        var9_4 /* !! */  = (int)ic.fxai("fylp", fxak(int ), (int)112);
                        if (var10_3) {
                            throw null;
                        }
                    }
                    case 11: {
                        var9_4 /* !! */  = (int)ic.fxai("fylm", fxak(int ), (int)111);
                        if (var10_3) {
                            throw null;
                        }
                    }
                    case 10: 
                }
                ** GOTO lbl220
            }
            do {
                if (true) continue block55;
lbl220:
                // 2 sources

                var9_4 /* !! */  = (int)ic.fxai("fylj", fxak(int ), (int)110);
                cfr_temp_0 = 8;
            } while (!var10_3);
            break;
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private ov fallbackStep(ov ov2, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        float f8;
        block6: {
            block4: {
                boolean bl2;
                block5: {
                    boolean bl3 = c;
                    int n2 = b;
                    bl2 = a;
                    if (bl3) {
                        throw null;
                    }
                    if (bl2 || bl2) break block4;
                    reference var7_10 = ic.fxai("fznt", fxki(int ), (int)372) + this.random.nextFloat() * ic.fxai("fznu", fxki(int ), (int)373);
                    if (bl2 || bl2) break block4;
                    f8 = class_3532.method_15363((float)(f2 * var7_10), (float)(-f5), (float)f5);
                    if (bl2 || bl2) break block4;
                    f7 = class_3532.method_15363((float)(f3 * var7_10 * ic.fxai("fzny", fxki(int ), (int)374)), (float)(-f6), (float)f6);
                    if (bl2 || bl2) break block4;
                    float f9 = (float)Math.hypot(f8, f7);
                    if (bl2 || bl2) break block4;
                    float f10 = Math.min(f5, f4 * ic.fxai("fzod", fxki(int ), (int)375));
                    if (bl2 || bl2) break block4;
                    if (!(f9 > f10)) break block5;
                    if (bl2) break block4;
                    if (!(f9 > ic.fxai("fzoe", fxki(int ), (int)376))) break block5;
                    if (bl2 || bl2) break block4;
                    float f11 = f10 / f9;
                    if (bl2 || bl2) break block4;
                    f8 *= f11;
                    if (bl2 || bl2) break block4;
                    f7 *= f11;
                    if (bl2) break block4;
                }
                if (bl2 || bl2) break block4;
                this.lastStepYaw = f8;
                if (bl2 || bl2) break block4;
                this.lastStepPitch = f7;
                if (!bl2 && !bl2) break block6;
            }
            return null;
        }
        return new ov(ov2.getYaw() + f8, class_3532.method_15363((float)(ov2.getPitch() + f7), (float)ic.fxai("fzoo", fxki(int ), (int)377), (float)ic.fxai("fzoq", fxki(int ), (int)378)));
    }
}

