/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_310
 */
package ruhack.phobia;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_310;
import ruhack.phobia.kk;
import ruhack.phobia.kl;
import ruhack.phobia.kr;
import ruhack.phobia.kv;
import ruhack.phobia.kw;
import ruhack.phobia.ld;
import ruhack.phobia.lf;
import ruhack.phobia.lg;

public final class lc {
    public static final boolean c;
    private static int[] itec;
    private static long[] iteo;
    private static int[] iteb;
    private static long[] itep;
    public static final boolean a;
    public static final int b;
    private static final long qh = -2603205966291060504L;

    private static /* synthetic */ void itnm() {
        lc.itep[0] = 2511433555071541463L;
        lc.itep[1] = 554503544738363667L;
        lc.itep[2] = -7120600368097730922L;
        lc.itep[3] = 6305995551786370329L;
        lc.itep[4] = 3587132111608350976L;
        lc.itep[5] = 6821565935358097411L;
        lc.itep[6] = 7619144831869582260L;
        lc.itep[7] = -8351743664189334002L;
        lc.itep[8] = -6709953473142247212L;
        lc.itep[9] = -5066723828426556157L;
        lc.itep[10] = -208876789348979943L;
        lc.itep[11] = 2298522048627785240L;
        lc.itep[12] = -8171919082412757002L;
        lc.itep[13] = 5429581800367439447L;
        lc.itep[14] = 21168055145830425L;
        lc.itep[15] = -2416717890601644231L;
        lc.itep[16] = -247011296305512392L;
        lc.itep[17] = 2893087868071999743L;
        lc.itep[18] = -2818608308412463543L;
        lc.itep[19] = 7993786618744466082L;
        lc.itep[20] = 5345680165598009152L;
        lc.itep[21] = 5981958665829581611L;
        lc.itep[22] = 7092258537742214964L;
        lc.itep[23] = 4565817916483507060L;
        lc.itep[24] = 8441078492044270044L;
        lc.itep[25] = -4262371521954617846L;
        lc.itep[26] = -3483603693306560357L;
        lc.itep[27] = -7008623691869046926L;
        lc.itep[28] = 4499929857122931660L;
        lc.itep[29] = -8281388176231208935L;
        lc.itep[30] = -4945415319506197773L;
        lc.itep[31] = -7943032021200221783L;
        lc.itep[32] = -600760278475844555L;
        lc.itep[33] = -6173719294158574179L;
        lc.itep[34] = -2919053108929771241L;
        lc.itep[35] = 6406117523011617264L;
        lc.itep[36] = 6738157347532485858L;
        lc.itep[37] = 325324990496700688L;
        lc.itep[38] = 1017965214319297353L;
        lc.itep[39] = -4684967626727627264L;
        lc.itep[40] = -4053655709448178126L;
        lc.itep[41] = 2664458676390696893L;
        lc.itep[42] = -4191707911569809919L;
        lc.itep[43] = 2607507202031824590L;
        lc.itep[44] = -5769165859533547290L;
        lc.itep[45] = 8049861508659504280L;
        lc.itep[46] = -7094783649130963891L;
        lc.itep[47] = -6568890920651639823L;
        lc.itep[48] = -9032935862873939557L;
        lc.itep[49] = 9013293486383167218L;
        lc.itep[50] = -7427631773177322L;
        lc.itep[51] = 6296454649523932689L;
        lc.itep[52] = 1389416565930413604L;
    }

    public static /* synthetic */ CallSite itee(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int itdz(int n2) {
        return iteb[n2] ^ itec[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void reloadOnRenderThread() {
        v0 /* !! */  = lc.qh;
        if (true) ** GOTO lbl5
        block89: while (true) {
            v0 /* !! */  = (long)(lc.itee("ithh", iten(int ), (int)15) - lc.itee("ithg", iten(int ), (int)14));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -126375725: {
                    continue block89;
                }
                case 1309358312: {
                    break block89;
                }
            }
            break;
        }
        var2 = lc.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = lc.qh - lc.itee("ithj", iten(int ), (int)16)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == lc.itee("ithk", itdz(int ), (int)28)) break;
            v1 /* !! */  = (long)lc.itee("ithl", itdz(int ), (int)29);
        }
        var1_1 /* !! */  = lc.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = lc.qh - lc.itee("ithm", iten(int ), (int)17)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == lc.itee("ithn", itdz(int ), (int)30)) break;
            v2 /* !! */  = (long)lc.itee("itho", itdz(int ), (int)31);
        }
        var0_2 = lc.a;
        if (var2) {
            throw null;
lbl25:
            // 15 sources

            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl25
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = lc.qh - lc.itee("ithq", iten(int ), (int)18)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == lc.itee("iths", itdz(int ), (int)32)) break;
            v3 /* !! */  = (long)lc.itee("itht", itdz(int ), (int)33);
        }
        ld.shutdown();
        if (var0_2 || var0_2) ** GOTO lbl25
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_3 = lc.qh - lc.itee("ithv", iten(int ), (int)19)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == lc.itee("ithw", itdz(int ), (int)34)) break;
            v4 /* !! */  = (long)lc.itee("ithy", itdz(int ), (int)35);
        }
        kw.shutdown();
        if (var0_2 || var0_2) ** GOTO lbl25
        v5 /* !! */  = lc.qh;
        if (true) ** GOTO lbl46
        block95: while (true) {
            v5 /* !! */  = (long)(lc.itee("itib", iten(int ), (int)21) - lc.itee("ithz", iten(int ), (int)20));
lbl46:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -2025403703: {
                    continue block95;
                }
                case 1309358312: {
                    break block95;
                }
            }
            break;
        }
        lg.shutdown();
        if (var0_2 || var0_2) ** GOTO lbl25
        v6 /* !! */  = lc.qh;
        if (true) ** GOTO lbl57
        block96: while (true) {
            v6 /* !! */  = (long)(v7 - lc.itee("itic", iten(int ), (int)22));
lbl57:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -642466210: {
                    v7 = lc.itee("itie", iten(int ), (int)23);
                    continue block96;
                }
                case -2700541: {
                    v7 = lc.itee("itig", iten(int ), (int)24);
                    continue block96;
                }
                case 1309358312: {
                    break block96;
                }
                case 2059403162: {
                    v7 = lc.itee("itih", iten(int ), (int)25);
                    continue block96;
                }
            }
            break;
        }
        lf.shutdown();
        if (var0_2 || var0_2) ** GOTO lbl25
        v8 /* !! */  = lc.qh;
        if (true) ** GOTO lbl75
        block97: while (true) {
            v8 /* !! */  = (long)(v9 - lc.itee("itij", iten(int ), (int)26));
lbl75:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1917236959: {
                    v9 = lc.itee("itik", iten(int ), (int)27);
                    continue block97;
                }
                case 212104119: {
                    v9 = lc.itee("itim", iten(int ), (int)28);
                    continue block97;
                }
                case 1309358312: {
                    break block97;
                }
            }
            break;
        }
        kk.shutdown();
        if (var0_2 || var0_2) ** GOTO lbl25
        v10 /* !! */  = lc.qh;
        if (true) ** GOTO lbl90
        block98: while (true) {
            v10 /* !! */  = (long)(v11 - lc.itee("itio", iten(int ), (int)29));
lbl90:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case 661269: {
                    v11 = lc.itee("itip", iten(int ), (int)30);
                    continue block98;
                }
                case 235540352: {
                    v11 = lc.itee("itiq", iten(int ), (int)31);
                    continue block98;
                }
                case 1306885939: {
                    v11 = lc.itee("itis", iten(int ), (int)32);
                    continue block98;
                }
                case 1309358312: {
                    break block98;
                }
            }
            break;
        }
        kl.shutdown();
        if (var0_2 || var0_2) ** GOTO lbl25
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_4 = lc.qh - lc.itee("itiu", iten(int ), (int)33)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == lc.itee("itiv", itdz(int ), (int)36)) break;
            v12 /* !! */  = (long)lc.itee("itix", itdz(int ), (int)37);
        }
        kr.shutdown();
        if (var0_2 || var0_2) ** GOTO lbl25
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_5 = lc.qh - lc.itee("itiy", iten(int ), (int)34)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == lc.itee("itja", itdz(int ), (int)38)) break;
            v13 /* !! */  = (long)lc.itee("itjb", itdz(int ), (int)39);
        }
        kv.shutdown();
        if (var0_2 || var0_2) ** GOTO lbl25
        v14 /* !! */  = lc.qh;
        if (true) ** GOTO lbl122
        block101: while (true) {
            v14 /* !! */  = (long)(v15 - lc.itee("itjd", iten(int ), (int)35));
lbl122:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -2083136418: {
                    v15 = lc.itee("itje", iten(int ), (int)36);
                    continue block101;
                }
                case -1838648451: {
                    v15 = lc.itee("itjg", iten(int ), (int)37);
                    continue block101;
                }
                case 1309358312: {
                    break block101;
                }
                case 1869769311: {
                    v15 = lc.itee("itjh", iten(int ), (int)38);
                    continue block101;
                }
            }
            break;
        }
        lg.init();
        if (var0_2 || var0_2) ** GOTO lbl25
        v16 /* !! */  = lc.qh;
        if (true) ** GOTO lbl140
        block102: while (true) {
            v16 /* !! */  = (long)(v17 - lc.itee("itji", iten(int ), (int)39));
lbl140:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -32910447: {
                    v17 = lc.itee("itjj", iten(int ), (int)40);
                    continue block102;
                }
                case 1309358312: {
                    break block102;
                }
                case 1820234050: {
                    v17 = lc.itee("itjk", iten(int ), (int)41);
                    continue block102;
                }
            }
            break;
        }
        lf.init();
        if (var0_2 || var0_2) ** GOTO lbl25
        v18 /* !! */  = lc.qh;
        if (true) ** GOTO lbl155
        block103: while (true) {
            v18 /* !! */  = (long)(lc.itee("itjm", iten(int ), (int)43) - lc.itee("itjl", iten(int ), (int)42));
lbl155:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -1826162782: {
                    continue block103;
                }
                case 1309358312: {
                    break block103;
                }
            }
            break;
        }
        kk.init();
        if (var0_2 || var0_2) ** GOTO lbl25
        v19 /* !! */  = lc.qh;
        if (true) ** GOTO lbl166
        block104: while (true) {
            v19 /* !! */  = (long)(v20 - lc.itee("itjn", iten(int ), (int)44));
lbl166:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case 1174814590: {
                    v20 = lc.itee("itjo", iten(int ), (int)45);
                    continue block104;
                }
                case 1309358312: {
                    break block104;
                }
                case 1920720346: {
                    v20 = lc.itee("itjp", iten(int ), (int)46);
                    continue block104;
                }
            }
            break;
        }
        kl.init();
        if (var0_2 || var0_2) ** GOTO lbl25
        v21 /* !! */  = lc.qh;
        if (true) ** GOTO lbl181
        block105: while (true) {
            v21 /* !! */  = (long)(v22 - lc.itee("itjq", iten(int ), (int)47));
lbl181:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -1711119321: {
                    v22 = lc.itee("itjr", iten(int ), (int)48);
                    continue block105;
                }
                case -193153735: {
                    v22 = lc.itee("itjs", iten(int ), (int)49);
                    continue block105;
                }
                case 351195289: {
                    v22 = lc.itee("itjt", iten(int ), (int)50);
                    continue block105;
                }
                case 1309358312: {
                    break block105;
                }
            }
            break;
        }
        kv.init();
        if (var0_2 || var0_2) ** GOTO lbl25
        v23 /* !! */  = lc.qh;
        if (true) ** GOTO lbl199
        block106: while (true) {
            v23 /* !! */  = (long)(lc.itee("itjv", iten(int ), (int)52) - lc.itee("itju", iten(int ), (int)51));
lbl199:
            // 2 sources

            switch ((int)v23 /* !! */ ) {
                case -1903724566: {
                    continue block106;
                }
                case 1309358312: {
                    break block106;
                }
            }
            break;
        }
        kr.init();
        ** while (var0_2 || var0_2)
lbl206:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl210:
            // 3 sources

            case 0: {
                var1_1 /* !! */  = (int)lc.itee("itjy", itdz(int ), (int)40);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl230
            }
            case 1: {
                var1_1 /* !! */  = (int)lc.itee("itkb", itdz(int ), (int)41);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl254
            }
            case 2: {
                var1_1 /* !! */  = (int)lc.itee("itke", itdz(int ), (int)42);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl249
            }
            case 3: {
                var1_1 /* !! */  = (int)lc.itee("itkg", itdz(int ), (int)43);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl303
            }
lbl230:
            // 2 sources

            case 4: {
                var1_1 /* !! */  = (int)lc.itee("itkh", itdz(int ), (int)44);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl303
            }
lbl235:
            // 4 sources

            case 5: {
                var1_1 /* !! */  = (int)lc.itee("itki", itdz(int ), (int)45);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl328
            }
            case 6: {
                var1_1 /* !! */  = (int)lc.itee("itkj", itdz(int ), (int)46);
                if (!var2) ** GOTO lbl235
                throw null;
            }
            case 7: {
                var1_1 /* !! */  = (int)lc.itee("itkk", itdz(int ), (int)47);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl328
            }
lbl249:
            // 4 sources

            case 8: {
                var1_1 /* !! */  = (int)lc.itee("itkl", itdz(int ), (int)48);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl259
            }
lbl254:
            // 3 sources

            case 9: {
                var1_1 /* !! */  = (int)lc.itee("itko", itdz(int ), (int)49);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl315
            }
lbl259:
            // 2 sources

            case 10: {
                var1_1 /* !! */  = (int)lc.itee("itkr", itdz(int ), (int)50);
                if (!var2) ** GOTO lbl235
                throw null;
            }
lbl263:
            // 2 sources

            case 11: {
                var1_1 /* !! */  = (int)lc.itee("itku", itdz(int ), (int)51);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl303
            }
            case 12: {
                var1_1 /* !! */  = (int)lc.itee("itkw", itdz(int ), (int)52);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl311
            }
lbl273:
            // 2 sources

            case 13: {
                var1_1 /* !! */  = (int)lc.itee("itky", itdz(int ), (int)53);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl315
            }
            case 14: {
                var1_1 /* !! */  = (int)lc.itee("itlb", itdz(int ), (int)54);
                if (!var2) ** GOTO lbl210
                throw null;
            }
            case 15: {
                var1_1 /* !! */  = (int)lc.itee("itle", itdz(int ), (int)55);
                if (!var2) ** GOTO lbl210
                throw null;
            }
lbl286:
            // 2 sources

            case 16: {
                var1_1 /* !! */  = (int)lc.itee("itlh", itdz(int ), (int)56);
                if (!var2) ** GOTO lbl235
                throw null;
            }
lbl290:
            // 2 sources

            case 17: {
                var1_1 /* !! */  = (int)lc.itee("itlk", itdz(int ), (int)57);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl332
            }
lbl295:
            // 2 sources

            case 18: {
                var1_1 /* !! */  = (int)lc.itee("itln", itdz(int ), (int)58);
                if (!var2) ** GOTO lbl254
                throw null;
            }
lbl299:
            // 2 sources

            case 19: {
                var1_1 /* !! */  = (int)lc.itee("itlq", itdz(int ), (int)59);
                if (!var2) break;
                throw null;
            }
lbl303:
            // 4 sources

            case 20: {
                var1_1 /* !! */  = (int)lc.itee("itlt", itdz(int ), (int)60);
                if (!var2) ** GOTO lbl249
                throw null;
            }
            case 21: {
                var1_1 /* !! */  = (int)lc.itee("itlv", itdz(int ), (int)61);
                if (!var2) ** GOTO lbl273
                throw null;
            }
lbl311:
            // 3 sources

            case 22: {
                var1_1 /* !! */  = (int)lc.itee("itly", itdz(int ), (int)62);
                if (!var2) ** GOTO lbl290
                throw null;
            }
lbl315:
            // 3 sources

            case 23: {
                var1_1 /* !! */  = (int)lc.itee("itma", itdz(int ), (int)63);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl345
            }
            case 24: {
                var1_1 /* !! */  = (int)lc.itee("itmc", itdz(int ), (int)64);
                if (!var2) ** GOTO lbl311
                throw null;
            }
            case 25: {
                var1_1 /* !! */  = (int)lc.itee("itmg", itdz(int ), (int)65);
                if (!var2) ** GOTO lbl249
                throw null;
            }
lbl328:
            // 3 sources

            case 26: {
                var1_1 /* !! */  = (int)lc.itee("itmi", itdz(int ), (int)66);
                if (!var2) ** GOTO lbl299
                throw null;
            }
lbl332:
            // 2 sources

            case 27: {
                var1_1 /* !! */  = (int)lc.itee("itml", itdz(int ), (int)67);
                if (!var2) ** GOTO lbl286
                throw null;
            }
            case 28: {
                var1_1 /* !! */  = (int)lc.itee("itmn", itdz(int ), (int)68);
                if (var2) {
                    throw null;
                }
            }
            case 29: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)lc.itee("itmp", itdz(int ), (int)69);
                    if (!var2) ** GOTO lbl263
                    throw null;
                }
            }
lbl345:
            // 2 sources

            case 30: {
                var1_1 /* !! */  = (int)lc.itee("itmr", itdz(int ), (int)70);
                if (!var2) ** GOTO lbl295
                throw null;
            }
            case 31: 
        }
        var1_1 /* !! */  = (int)lc.itee("itmt", itdz(int ), (int)71);
        ** while (!var2)
lbl352:
        // 1 sources

        throw null;
    }

    static {
        iteb = new int[72];
        itec = new int[72];
        lc.itmw();
        lc.itnc();
        iteo = new long[53];
        itep = new long[53];
        lc.itng();
        lc.itnm();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private lc() {
        var2_1 /* !! */  = lc.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                return;
            }
            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)lc.itee("itef", itdz(int ), (int)0);
                }
            }
            case 1: {
                var2_1 /* !! */  = (int)lc.itee("iteh", itdz(int ), (int)1);
            }
            case 2: 
        }
        while (true) {
            var2_1 /* !! */  = (int)lc.itee("itei", itdz(int ), (int)2);
        }
    }

    private static /* synthetic */ void itnc() {
        lc.itec[0] = -2026571704;
        lc.itec[1] = 2118835320;
        lc.itec[2] = -1334309037;
        lc.itec[3] = -1575058857;
        lc.itec[4] = 1943299100;
        lc.itec[5] = -789145101;
        lc.itec[6] = -2052458698;
        lc.itec[7] = -641685637;
        lc.itec[8] = 128445896;
        lc.itec[9] = -1827939962;
        lc.itec[10] = 839724155;
        lc.itec[11] = 356147089;
        lc.itec[12] = -1399745500;
        lc.itec[13] = -1350109380;
        lc.itec[14] = -1409299289;
        lc.itec[15] = 618623947;
        lc.itec[16] = 357867601;
        lc.itec[17] = -240695905;
        lc.itec[18] = 284694248;
        lc.itec[19] = -459733543;
        lc.itec[20] = 1700200625;
        lc.itec[21] = -1808403727;
        lc.itec[22] = -954008363;
        lc.itec[23] = -55963345;
        lc.itec[24] = -466562346;
        lc.itec[25] = 449716935;
        lc.itec[26] = -437920950;
        lc.itec[27] = 1689486497;
        lc.itec[28] = -650329375;
        lc.itec[29] = -597924278;
        lc.itec[30] = -1313344684;
        lc.itec[31] = 259053765;
        lc.itec[32] = -472694409;
        lc.itec[33] = -752466998;
        lc.itec[34] = -1453128874;
        lc.itec[35] = -385827710;
        lc.itec[36] = -1116974805;
        lc.itec[37] = -1436883191;
        lc.itec[38] = -1985439541;
        lc.itec[39] = 371519024;
        lc.itec[40] = -1643445678;
        lc.itec[41] = -1296014226;
        lc.itec[42] = -2037329271;
        lc.itec[43] = 1117113271;
        lc.itec[44] = 1756772370;
        lc.itec[45] = -1594333844;
        lc.itec[46] = -823511772;
        lc.itec[47] = 944900103;
        lc.itec[48] = 576606056;
        lc.itec[49] = -1261226109;
        lc.itec[50] = 963892305;
        lc.itec[51] = 1283979394;
        lc.itec[52] = -898334371;
        lc.itec[53] = 682512468;
        lc.itec[54] = 461237660;
        lc.itec[55] = -191060224;
        lc.itec[56] = -1758784475;
        lc.itec[57] = -10439171;
        lc.itec[58] = 1860356968;
        lc.itec[59] = -546421445;
        lc.itec[60] = -1402217600;
        lc.itec[61] = 1991868846;
        lc.itec[62] = -207268370;
        lc.itec[63] = -472808578;
        lc.itec[64] = 1225513827;
        lc.itec[65] = -775194756;
        lc.itec[66] = 200880261;
        lc.itec[67] = -318693733;
        lc.itec[68] = 549712087;
        lc.itec[69] = 2042218356;
        lc.itec[70] = -10950877;
        lc.itec[71] = -442246879;
    }

    private static /* synthetic */ void itng() {
        lc.iteo[0] = -5544956975024817310L;
        lc.iteo[1] = 4232908387663228033L;
        lc.iteo[2] = -5527582395392323867L;
        lc.iteo[3] = -3093837164019944040L;
        lc.iteo[4] = 6349505767072010240L;
        lc.iteo[5] = -6613995496024766456L;
        lc.iteo[6] = 3125175146106461734L;
        lc.iteo[7] = -9082456134339543881L;
        lc.iteo[8] = -3571179426927630961L;
        lc.iteo[9] = 7875681547333990911L;
        lc.iteo[10] = -3006586540132678296L;
        lc.iteo[11] = -309515173484937447L;
        lc.iteo[12] = -9031227831194924343L;
        lc.iteo[13] = -8600149477209819185L;
        lc.iteo[14] = -291059200087706325L;
        lc.iteo[15] = -7351623767935899044L;
        lc.iteo[16] = -3177740563695091782L;
        lc.iteo[17] = -6279626705927177529L;
        lc.iteo[18] = -1999111842076726752L;
        lc.iteo[19] = -2052414462664081035L;
        lc.iteo[20] = -5794769243453721907L;
        lc.iteo[21] = -814928543788695387L;
        lc.iteo[22] = -8879588810039944192L;
        lc.iteo[23] = -184972786444653746L;
        lc.iteo[24] = -3376167988297609431L;
        lc.iteo[25] = -2691600563377949194L;
        lc.iteo[26] = 4213438570935104878L;
        lc.iteo[27] = 5902534031905479940L;
        lc.iteo[28] = 6783094555718901031L;
        lc.iteo[29] = -1017063350152063427L;
        lc.iteo[30] = -1688243388451990614L;
        lc.iteo[31] = 6252209599103709860L;
        lc.iteo[32] = 779928182044471103L;
        lc.iteo[33] = -2496301793415980286L;
        lc.iteo[34] = 1873897935447411504L;
        lc.iteo[35] = -2918697036250929970L;
        lc.iteo[36] = -3067484908590214756L;
        lc.iteo[37] = -6404109071233442552L;
        lc.iteo[38] = -3077978502131501972L;
        lc.iteo[39] = -4880487880550869189L;
        lc.iteo[40] = -2687653096257955849L;
        lc.iteo[41] = -7887469567564536104L;
        lc.iteo[42] = -5932942362883470776L;
        lc.iteo[43] = -5094512949002747024L;
        lc.iteo[44] = -6478523310817265218L;
        lc.iteo[45] = 4554366121833475165L;
        lc.iteo[46] = -7600138406954026292L;
        lc.iteo[47] = -9023736452112807954L;
        lc.iteo[48] = 4861540777044254109L;
        lc.iteo[49] = 3547667628613274818L;
        lc.iteo[50] = -3910448078657010412L;
        lc.iteo[51] = -4635977802925589852L;
        lc.iteo[52] = -693566540642291145L;
    }

    private static /* synthetic */ long iten(int n2) {
        return iteo[n2] ^ itep[n2];
    }

    private static /* synthetic */ void itmw() {
        lc.iteb[0] = -2026571704;
        lc.iteb[1] = 2118835320;
        lc.iteb[2] = -1334309037;
        lc.iteb[3] = -1575058858;
        lc.iteb[4] = -1646389895;
        lc.iteb[5] = 789145100;
        lc.iteb[6] = -2032069271;
        lc.iteb[7] = 641685636;
        lc.iteb[8] = 1384556054;
        lc.iteb[9] = 1827939961;
        lc.iteb[10] = 376664597;
        lc.iteb[11] = 356147088;
        lc.iteb[12] = -437484934;
        lc.iteb[13] = -1350109380;
        lc.iteb[14] = -1409299287;
        lc.iteb[15] = 618623951;
        lc.iteb[16] = 357867612;
        lc.iteb[17] = -240695909;
        lc.iteb[18] = 284694248;
        lc.iteb[19] = -459733548;
        lc.iteb[20] = 1700200630;
        lc.iteb[21] = -1808403713;
        lc.iteb[22] = -954008354;
        lc.iteb[23] = -55963347;
        lc.iteb[24] = -466562344;
        lc.iteb[25] = 449716933;
        lc.iteb[26] = -437920950;
        lc.iteb[27] = 1689486504;
        lc.iteb[28] = 650329374;
        lc.iteb[29] = 1019085546;
        lc.iteb[30] = -1313344683;
        lc.iteb[31] = 1982596165;
        lc.iteb[32] = 472694408;
        lc.iteb[33] = -1968955368;
        lc.iteb[34] = -1453128873;
        lc.iteb[35] = -399439626;
        lc.iteb[36] = 1116974804;
        lc.iteb[37] = 1970993190;
        lc.iteb[38] = -1985439542;
        lc.iteb[39] = 301723613;
        lc.iteb[40] = -1643445667;
        lc.iteb[41] = -1296014215;
        lc.iteb[42] = -2037329256;
        lc.iteb[43] = 1117113272;
        lc.iteb[44] = 1756772373;
        lc.iteb[45] = -1594333855;
        lc.iteb[46] = -823511746;
        lc.iteb[47] = 944900124;
        lc.iteb[48] = 576606079;
        lc.iteb[49] = -1261226081;
        lc.iteb[50] = 963892307;
        lc.iteb[51] = 1283979406;
        lc.iteb[52] = -898334387;
        lc.iteb[53] = 682512452;
        lc.iteb[54] = 461237639;
        lc.iteb[55] = -191060216;
        lc.iteb[56] = -1758784473;
        lc.iteb[57] = -10439198;
        lc.iteb[58] = 1860356962;
        lc.iteb[59] = -546421461;
        lc.iteb[60] = -1402217573;
        lc.iteb[61] = 1991868853;
        lc.iteb[62] = -207268381;
        lc.iteb[63] = -472808580;
        lc.iteb[64] = 1225513850;
        lc.iteb[65] = -775194775;
        lc.iteb[66] = 200880265;
        lc.iteb[67] = -318693733;
        lc.iteb[68] = 549712078;
        lc.iteb[69] = 2042218337;
        lc.iteb[70] = -10950876;
        lc.iteb[71] = -442246879;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void reload() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lc.qh - lc.itee("iteq", iten(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == lc.itee("ites", itdz(int ), (int)3)) break;
            v0 /* !! */  = (long)lc.itee("itet", itdz(int ), (int)4);
        }
        var3 = lc.c;
        v1 /* !! */  = lc.qh;
        if (true) ** GOTO lbl11
        block33: while (true) {
            v1 /* !! */  = (long)(v2 - lc.itee("itev", iten(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1513322831: {
                    v2 = lc.itee("itew", iten(int ), (int)2);
                    continue block33;
                }
                case 317578756: {
                    v2 = lc.itee("itey", iten(int ), (int)3);
                    continue block33;
                }
                case 417687294: {
                    v2 = lc.itee("itez", iten(int ), (int)4);
                    continue block33;
                }
                case 1309358312: {
                    break block33;
                }
            }
            break;
        }
        var2_1 /* !! */  = lc.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = lc.qh - lc.itee("itfb", iten(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == lc.itee("itfc", itdz(int ), (int)5)) break;
            v3 /* !! */  = (long)lc.itee("itfe", itdz(int ), (int)6);
        }
        var1_2 = lc.a;
        if (var3) {
            throw null;
lbl32:
            // 7 sources

            return;
        }
        if (var1_2 || var1_2) ** GOTO lbl32
        v4 /* !! */  = lc.qh;
        if (true) ** GOTO lbl39
        block36: while (true) {
            v4 /* !! */  = (long)(lc.itee("itfh", iten(int ), (int)7) - lc.itee("itfg", iten(int ), (int)6));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 1309358312: {
                    break block36;
                }
                case 1360719721: {
                    continue block36;
                }
            }
            break;
        }
        var0_3 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, reloadOnRenderThread(), ()V)();
        if (var1_2 || var1_2) ** GOTO lbl32
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = lc.qh;
                if (true) ** GOTO lbl53
                block37: while (true) {
                    v5 /* !! */  = (long)(v6 - lc.itee("itfk", iten(int ), (int)8));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -412321885: {
                            v6 = lc.itee("itfl", iten(int ), (int)9);
                            continue block37;
                        }
                        case -141743803: {
                            v6 = lc.itee("itfm", iten(int ), (int)10);
                            continue block37;
                        }
                        case 1309358312: {
                            break block37;
                        }
                    }
                    break;
                }
                if (!RenderSystem.isOnRenderThread()) ** GOTO lbl74
                if (var1_2 || var1_2) ** GOTO lbl32
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = lc.qh - lc.itee("itfo", iten(int ), (int)11)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == lc.itee("itfq", itdz(int ), (int)7)) break;
                    v7 /* !! */  = (long)lc.itee("itfr", itdz(int ), (int)8);
                }
                var0_3.run();
                if (var1_2) ** GOTO lbl32
                if (var3) {
                    throw null;
                }
                ** GOTO lbl88
lbl74:
                // 1 sources

                if (var1_2 || var1_2) ** GOTO lbl32
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = lc.qh - lc.itee("itfu", iten(int ), (int)12)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == lc.itee("itfw", itdz(int ), (int)9)) break;
                    v8 /* !! */  = (long)lc.itee("itfx", itdz(int ), (int)10);
                }
                v9 = class_310.method_1551();
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = lc.qh - lc.itee("itfz", iten(int ), (int)13)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == lc.itee("itga", itdz(int ), (int)11)) break;
                    v10 /* !! */  = (long)lc.itee("itgc", itdz(int ), (int)12);
                }
                v9.execute(var0_3);
                if (var1_2) ** GOTO lbl32
lbl88:
                // 2 sources

                if (!var1_2 && !var1_2) ** break;
                ** continue;
                return;
            }
lbl91:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)lc.itee("itge", itdz(int ), (int)13);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl116
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)lc.itee("itgf", itdz(int ), (int)14);
                    if (!var3) ** GOTO lbl91
                    throw null;
                }
            }
            case 2: {
                var2_1 /* !! */  = (int)lc.itee("itgi", itdz(int ), (int)15);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl120
            }
            case 3: {
                var2_1 /* !! */  = (int)lc.itee("itgj", itdz(int ), (int)16);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl111:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)lc.itee("itgk", itdz(int ), (int)17);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl116:
            // 4 sources

            case 5: {
                var2_1 /* !! */  = (int)lc.itee("itgm", itdz(int ), (int)18);
                if (!var3) ** GOTO lbl111
                throw null;
            }
lbl120:
            // 3 sources

            case 6: {
                var2_1 /* !! */  = (int)lc.itee("itgn", itdz(int ), (int)19);
                if (!var3) ** GOTO lbl116
                throw null;
            }
lbl124:
            // 2 sources

            case 7: {
                do {
                    var2_1 /* !! */  = (int)lc.itee("itgp", itdz(int ), (int)20);
                } while (!var3);
                throw null;
            }
            case 8: {
                var2_1 /* !! */  = (int)lc.itee("itgq", itdz(int ), (int)21);
                if (!var3) ** GOTO lbl116
                throw null;
            }
lbl133:
            // 2 sources

            case 9: {
                var2_1 /* !! */  = (int)lc.itee("itgr", itdz(int ), (int)22);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl138:
            // 2 sources

            case 10: {
                var2_1 /* !! */  = (int)lc.itee("itgt", itdz(int ), (int)23);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl143:
            // 2 sources

            case 11: {
                var2_1 /* !! */  = (int)lc.itee("itgv", itdz(int ), (int)24);
                if (!var3) ** GOTO lbl124
                throw null;
            }
lbl147:
            // 2 sources

            case 12: {
                do {
                    var2_1 /* !! */  = (int)lc.itee("itgx", itdz(int ), (int)25);
                } while (!var3);
                throw null;
            }
            case 13: {
                var2_1 /* !! */  = (int)lc.itee("itgy", itdz(int ), (int)26);
                if (!var3) ** GOTO lbl133
                throw null;
            }
            case 14: 
        }
        var2_1 /* !! */  = (int)lc.itee("itgz", itdz(int ), (int)27);
        ** while (!var3)
lbl159:
        // 1 sources

        throw null;
    }
}

