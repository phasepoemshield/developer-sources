/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_2561
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import ruhack.phobia.eu;
import ruhack.phobia.f;
import ruhack.phobia.i;
import ruhack.phobia.mk;

public final class p
extends f {
    private static int[] apjm = new int[107];
    private static long[] aplo;
    public static final boolean c;
    public static final int b;
    private static final long ch = -7791402236598427824L;
    private static long[] apln;
    public static final boolean a;
    private final mk client;
    private static int[] apjn;

    static {
        apjn = new int[107];
        p.appn();
        p.appo();
        p.appp();
        p.appq();
        apln = new long[44];
        aplo = new long[44];
        p.appr();
        p.apps();
    }

    private static /* synthetic */ long aplm(int n2) {
        return apln[n2] ^ aplo[n2];
    }

    private static /* synthetic */ void appo() {
        p.apjm[100] = 1036792085;
        p.apjm[101] = -1742057274;
        p.apjm[102] = -890659882;
        p.apjm[103] = -987747732;
        p.apjm[104] = -493273482;
        p.apjm[105] = -1496032220;
        p.apjm[106] = 1074150336;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static String join(String[] var0, int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = p.ch - p.apjo("apor", aplm(int ), (int)34)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == p.apjo("apos", apjl(int ), (int)95)) break;
            v0 /* !! */  = (long)p.apjo("apot", apjl(int ), (int)96);
        }
        var4_2 = p.c;
        v1 /* !! */  = p.ch;
        if (true) ** GOTO lbl11
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - p.apjo("apou", aplm(int ), (int)35));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1460688314: {
                    v2 = p.apjo("apov", aplm(int ), (int)36);
                    continue block17;
                }
                case 1230888784: {
                    break block17;
                }
                case 2043325044: {
                    v2 = p.apjo("apow", aplm(int ), (int)37);
                    continue block17;
                }
            }
            break;
        }
        var3_3 /* !! */  = p.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = p.ch - p.apjo("apox", aplm(int ), (int)38)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == p.apjo("apoy", apjl(int ), (int)97)) break;
            v3 /* !! */  = (long)p.apjo("apoz", apjl(int ), (int)98);
        }
        var2_4 = p.a;
        if (!var4_2) ** GOTO lbl33
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl33:
                // 1 sources

                if (var2_4 || var2_4) continue block19;
                v4 = var0.length;
                v5 /* !! */  = p.ch;
                if (true) ** GOTO lbl39
                block20: while (true) {
                    v5 /* !! */  = (long)(v6 - p.apjo("appa", aplm(int ), (int)39));
lbl39:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -860910832: {
                            v6 = p.apjo("appb", aplm(int ), (int)40);
                            continue block20;
                        }
                        case -67918117: {
                            v6 = p.apjo("appc", aplm(int ), (int)41);
                            continue block20;
                        }
                        case 1230888784: {
                            break block20;
                        }
                    }
                    break;
                }
                v7 = Arrays.copyOfRange(var0, var1_1, v4);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = p.ch - p.apjo("appd", aplm(int ), (int)42)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == p.apjo("appe", apjl(int ), (int)99)) break;
                    v8 /* !! */  = (long)p.apjo("appf", apjl(int ), (int)100);
                }
                v9 = String.join((CharSequence)" ", v7);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = p.ch - p.apjo("appg", aplm(int ), (int)43)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == p.apjo("apph", apjl(int ), (int)101)) break;
                    v10 /* !! */  = (long)p.apjo("appi", apjl(int ), (int)102);
                }
                return v9.trim();
lbl61:
                // 2 sources

                case 0: {
                    var3_3 /* !! */  = (int)p.apjo("appj", apjl(int ), (int)103);
                    if (!var4_2) break block19;
                    throw null;
                }
                case 1: {
                    var3_3 /* !! */  = (int)p.apjo("appk", apjl(int ), (int)104);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 2: {
                    var3_3 /* !! */  = (int)p.apjo("appl", apjl(int ), (int)105);
                    if (!var4_2) ** GOTO lbl61
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var3_3 /* !! */  = (int)p.apjo("appm", apjl(int ), (int)106);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void execute(String var1_1, String[] var2_2) {
        var7_3 = p.c;
        var6_4 /* !! */  = p.b;
        var5_5 = p.a;
        if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_3) {
                    throw null;
lbl9:
                    // 20 sources

                    return;
                }
                if (var5_5 || var5_5) ** GOTO lbl9
                if (var2_2.length != 0) ** GOTO lbl17
                if (var5_5 || var5_5) ** GOTO lbl9
                this.usage();
                if (var5_5 || var5_5) ** GOTO lbl9
                return;
lbl17:
                // 1 sources

                if (var5_5 || var5_5) ** GOTO lbl9
                if (eu.showIrcInChat()) ** GOTO lbl23
                if (var5_5 || var5_5) ** GOTO lbl9
                this.logDirect(class_2561.method_43470((String)"Irc \u043d\u0435 \u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0451\u043d, \u0432\u043a\u043b\u044e\u0447\u0438\u0442\u0435 \u0432 \u043c\u043e\u0434\u0443\u043b\u0435 Communication").method_27692(class_124.field_1061));
                if (var5_5 || var5_5) ** GOTO lbl9
                return;
lbl23:
                // 1 sources

                if (var5_5 || var5_5) ** GOTO lbl9
                this.client.startFromProfile();
                if (var5_5 || var5_5) ** GOTO lbl9
                var3_6 = var2_2[0].equalsIgnoreCase("dm");
                if (var5_5 || var5_5) ** GOTO lbl9
                if (!var3_6) ** GOTO lbl41
                if (var5_5 || var5_5) ** GOTO lbl9
                if (var2_2.length >= p.apjo("apjt", apjl(int ), (int)4)) ** GOTO lbl35
                if (var5_5 || var5_5) ** GOTO lbl9
                this.usage();
                if (var5_5 || var5_5) ** GOTO lbl9
                return;
lbl35:
                // 1 sources

                if (var5_5 || var5_5) ** GOTO lbl9
                var4_7 = this.client.sendDirectMessage(var2_2[1], p.join(var2_2, (int)p.apjo("apju", apjl(int ), (int)5)));
                if (var5_5 || var5_5) ** GOTO lbl9
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl44
lbl41:
                // 1 sources

                if (var5_5 || var5_5) ** GOTO lbl9
                var4_7 = this.client.sendMessage(p.join(var2_2, (int)p.apjo("apjv", apjl(int ), (int)6)));
                if (var5_5) ** GOTO lbl9
lbl44:
                // 2 sources

                if (var5_5 || var5_5) ** GOTO lbl9
                if (var4_7) ** GOTO lbl49
                if (var5_5 || var5_5) ** GOTO lbl9
                this.logDirect(class_2561.method_43470((String)"IRC \u0435\u0449\u0451 \u043d\u0435 \u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0451\u043d \u0438\u043b\u0438 \u0441\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u0435 \u043d\u0435\u043a\u043e\u0440\u0440\u0435\u043a\u0442\u043d\u043e").method_27692(class_124.field_1061));
                if (var5_5) ** GOTO lbl9
lbl49:
                // 2 sources

                if (!var5_5 && !var5_5) ** break;
                ** continue;
                return;
            }
lbl52:
            // 3 sources

            case 0: {
                var6_4 /* !! */  = (int)p.apjo("apjw", apjl(int ), (int)7);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl57:
            // 3 sources

            case 1: {
                var6_4 /* !! */  = (int)p.apjo("apjx", apjl(int ), (int)8);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl62:
            // 3 sources

            case 2: {
                var6_4 /* !! */  = (int)p.apjo("apjy", apjl(int ), (int)9);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl169
            }
            case 3: {
                var6_4 /* !! */  = (int)p.apjo("apjz", apjl(int ), (int)10);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 4: {
                var6_4 /* !! */  = (int)p.apjo("apka", apjl(int ), (int)11);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl77:
            // 2 sources

            case 5: {
                var6_4 /* !! */  = (int)p.apjo("apkb", apjl(int ), (int)12);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl130
            }
            case 6: {
                var6_4 /* !! */  = (int)p.apjo("apkc", apjl(int ), (int)13);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl87:
            // 2 sources

            case 7: {
                var6_4 /* !! */  = (int)p.apjo("apkd", apjl(int ), (int)14);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl92:
            // 3 sources

            case 8: {
                var6_4 /* !! */  = (int)p.apjo("apke", apjl(int ), (int)15);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl134
            }
            case 9: {
                var6_4 /* !! */  = (int)p.apjo("apkf", apjl(int ), (int)16);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 10: {
                var6_4 /* !! */  = (int)p.apjo("apkg", apjl(int ), (int)17);
                if (!var7_3) ** GOTO lbl57
                throw null;
            }
            case 11: {
                var6_4 /* !! */  = (int)p.apjo("apkh", apjl(int ), (int)18);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl111:
            // 3 sources

            case 12: {
                var6_4 /* !! */  = (int)p.apjo("apki", apjl(int ), (int)19);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl218
            }
            case 13: {
                var6_4 /* !! */  = (int)p.apjo("apkj", apjl(int ), (int)20);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl121:
            // 2 sources

            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_4 /* !! */  = (int)p.apjo("apkk", apjl(int ), (int)21);
                    if (!var7_3) ** GOTO lbl57
                    throw null;
                }
            }
            case 15: {
                var6_4 /* !! */  = (int)p.apjo("apkl", apjl(int ), (int)22);
                if (!var7_3) ** GOTO lbl111
                throw null;
            }
lbl130:
            // 2 sources

            case 16: {
                var6_4 /* !! */  = (int)p.apjo("apkm", apjl(int ), (int)23);
                if (!var7_3) ** GOTO lbl92
                throw null;
            }
lbl134:
            // 2 sources

            case 17: {
                var6_4 /* !! */  = (int)p.apjo("apkn", apjl(int ), (int)24);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl139:
            // 2 sources

            case 18: {
                var6_4 /* !! */  = (int)p.apjo("apko", apjl(int ), (int)25);
                if (var7_3) {
                    throw null;
                }
            }
lbl143:
            // 5 sources

            case 19: {
                var6_4 /* !! */  = (int)p.apjo("apkp", apjl(int ), (int)26);
                if (!var7_3) ** GOTO lbl52
                throw null;
            }
lbl147:
            // 2 sources

            case 20: {
                var6_4 /* !! */  = (int)p.apjo("apkq", apjl(int ), (int)27);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 21: {
                var6_4 /* !! */  = (int)p.apjo("apkr", apjl(int ), (int)28);
                if (!var7_3) ** GOTO lbl121
                throw null;
            }
lbl156:
            // 4 sources

            case 22: {
                var6_4 /* !! */  = (int)p.apjo("apks", apjl(int ), (int)29);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl161:
            // 2 sources

            case 23: {
                var6_4 /* !! */  = (int)p.apjo("apkt", apjl(int ), (int)30);
                if (!var7_3) ** GOTO lbl77
                throw null;
            }
lbl165:
            // 3 sources

            case 24: {
                var6_4 /* !! */  = (int)p.apjo("apku", apjl(int ), (int)31);
                if (!var7_3) ** GOTO lbl147
                throw null;
            }
lbl169:
            // 2 sources

            case 25: {
                var6_4 /* !! */  = (int)p.apjo("apkv", apjl(int ), (int)32);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl194
            }
lbl174:
            // 4 sources

            case 26: {
                var6_4 /* !! */  = (int)p.apjo("apkw", apjl(int ), (int)33);
                if (!var7_3) ** GOTO lbl62
                throw null;
            }
            case 27: {
                var6_4 /* !! */  = (int)p.apjo("apkx", apjl(int ), (int)34);
                if (!var7_3) ** GOTO lbl143
                throw null;
            }
            case 28: {
                var6_4 /* !! */  = (int)p.apjo("apky", apjl(int ), (int)35);
                if (!var7_3) ** GOTO lbl52
                throw null;
            }
lbl186:
            // 2 sources

            case 29: {
                var6_4 /* !! */  = (int)p.apjo("apkz", apjl(int ), (int)36);
                if (!var7_3) ** GOTO lbl62
                throw null;
            }
            case 30: {
                var6_4 /* !! */  = (int)p.apjo("apla", apjl(int ), (int)37);
                if (!var7_3) ** GOTO lbl92
                throw null;
            }
lbl194:
            // 2 sources

            case 31: {
                var6_4 /* !! */  = (int)p.apjo("aplb", apjl(int ), (int)38);
                if (!var7_3) ** GOTO lbl174
                throw null;
            }
            case 32: {
                var6_4 /* !! */  = (int)p.apjo("aplc", apjl(int ), (int)39);
                if (!var7_3) ** GOTO lbl139
                throw null;
            }
lbl202:
            // 3 sources

            case 33: {
                var6_4 /* !! */  = (int)p.apjo("apld", apjl(int ), (int)40);
                if (!var7_3) ** GOTO lbl156
                throw null;
            }
lbl206:
            // 2 sources

            case 34: {
                var6_4 /* !! */  = (int)p.apjo("aple", apjl(int ), (int)41);
                if (!var7_3) break;
                throw null;
            }
            case 35: {
                var6_4 /* !! */  = (int)p.apjo("aplf", apjl(int ), (int)42);
                if (!var7_3) ** GOTO lbl161
                throw null;
            }
lbl214:
            // 2 sources

            case 36: {
                var6_4 /* !! */  = (int)p.apjo("aplg", apjl(int ), (int)43);
                if (!var7_3) ** GOTO lbl202
                throw null;
            }
lbl218:
            // 2 sources

            case 37: {
                var6_4 /* !! */  = (int)p.apjo("aplh", apjl(int ), (int)44);
                if (!var7_3) ** GOTO lbl87
                throw null;
            }
lbl222:
            // 3 sources

            case 38: {
                var6_4 /* !! */  = (int)p.apjo("apli", apjl(int ), (int)45);
                if (!var7_3) ** GOTO lbl156
                throw null;
            }
            case 39: {
                var6_4 /* !! */  = (int)p.apjo("aplj", apjl(int ), (int)46);
                if (!var7_3) break;
                throw null;
            }
            case 40: {
                var6_4 /* !! */  = (int)p.apjo("aplk", apjl(int ), (int)47);
                if (!var7_3) ** GOTO lbl206
                throw null;
            }
            case 41: 
        }
        var6_4 /* !! */  = (int)p.apjo("apll", apjl(int ), (int)48);
        ** while (!var7_3)
lbl237:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public p() {
        var2_1 /* !! */  = p.b;
        super("irc", "\u041e\u0442\u043f\u0440\u0430\u0432\u0438\u0442\u044c \u0441\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u0435 \u0432 IRC", new String[0]);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.client = mk.INSTANCE;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)p.apjo("apjp", apjl(int ), (int)0);
                    break block0;
                    break;
                }
            }
            case 1: {
                var2_1 /* !! */  = (int)p.apjo("apjq", apjl(int ), (int)1);
                break;
            }
            case 2: {
                while (true) {
                    var2_1 /* !! */  = (int)p.apjo("apjr", apjl(int ), (int)2);
                }
            }
            case 3: 
        }
        var2_1 /* !! */  = (int)p.apjo("apjs", apjl(int ), (int)3);
        ** while (true)
    }

    private static /* synthetic */ void appn() {
        p.apjm[0] = 1692609159;
        p.apjm[1] = 136380111;
        p.apjm[2] = 1549208933;
        p.apjm[3] = -278447221;
        p.apjm[4] = 1025431222;
        p.apjm[5] = 1208118113;
        p.apjm[6] = 1575600256;
        p.apjm[7] = -1269904690;
        p.apjm[8] = -1473326071;
        p.apjm[9] = -1052828464;
        p.apjm[10] = -1504620961;
        p.apjm[11] = -2031047993;
        p.apjm[12] = 38021708;
        p.apjm[13] = 1295184929;
        p.apjm[14] = 1924486990;
        p.apjm[15] = -582006310;
        p.apjm[16] = 141484065;
        p.apjm[17] = 2056213507;
        p.apjm[18] = -1373303487;
        p.apjm[19] = 1940400506;
        p.apjm[20] = 1419845447;
        p.apjm[21] = -1780571244;
        p.apjm[22] = 1036122445;
        p.apjm[23] = -956290602;
        p.apjm[24] = -495929274;
        p.apjm[25] = -1653163731;
        p.apjm[26] = -892525610;
        p.apjm[27] = -1925212644;
        p.apjm[28] = 1167318214;
        p.apjm[29] = -1426558353;
        p.apjm[30] = -1164864227;
        p.apjm[31] = 2146424452;
        p.apjm[32] = 227484401;
        p.apjm[33] = -375719264;
        p.apjm[34] = 341991546;
        p.apjm[35] = -211358073;
        p.apjm[36] = -891804524;
        p.apjm[37] = -2023389274;
        p.apjm[38] = 647081520;
        p.apjm[39] = 1112221674;
        p.apjm[40] = -636399064;
        p.apjm[41] = -2006807331;
        p.apjm[42] = -542541397;
        p.apjm[43] = -1088712595;
        p.apjm[44] = -415709012;
        p.apjm[45] = -1711035310;
        p.apjm[46] = 277214820;
        p.apjm[47] = 957361344;
        p.apjm[48] = 2112700945;
        p.apjm[49] = 378599198;
        p.apjm[50] = -992047065;
        p.apjm[51] = 970678708;
        p.apjm[52] = 1656588472;
        p.apjm[53] = -1472447746;
        p.apjm[54] = -11225376;
        p.apjm[55] = 1763477013;
        p.apjm[56] = 921498020;
        p.apjm[57] = 505271362;
        p.apjm[58] = 320031140;
        p.apjm[59] = -1597814260;
        p.apjm[60] = 892250990;
        p.apjm[61] = -1410491929;
        p.apjm[62] = 1705037594;
        p.apjm[63] = -414934405;
        p.apjm[64] = 432900129;
        p.apjm[65] = -1214631362;
        p.apjm[66] = -847439960;
        p.apjm[67] = -470094159;
        p.apjm[68] = 990362284;
        p.apjm[69] = 275450865;
        p.apjm[70] = 299735459;
        p.apjm[71] = 312296642;
        p.apjm[72] = -1923821704;
        p.apjm[73] = -690360952;
        p.apjm[74] = 1415153499;
        p.apjm[75] = 1584369941;
        p.apjm[76] = 467137691;
        p.apjm[77] = -887523786;
        p.apjm[78] = 291879998;
        p.apjm[79] = 1272038715;
        p.apjm[80] = 792368759;
        p.apjm[81] = -1920918014;
        p.apjm[82] = 1866236277;
        p.apjm[83] = -1725298022;
        p.apjm[84] = 1563128214;
        p.apjm[85] = -1691824013;
        p.apjm[86] = -706964163;
        p.apjm[87] = -427538249;
        p.apjm[88] = -709060537;
        p.apjm[89] = 576732009;
        p.apjm[90] = -335326793;
        p.apjm[91] = -2132942362;
        p.apjm[92] = -1386716029;
        p.apjm[93] = 153728084;
        p.apjm[94] = -760955186;
        p.apjm[95] = -674419909;
        p.apjm[96] = -1265220624;
        p.apjm[97] = -2074349823;
        p.apjm[98] = -705064077;
        p.apjm[99] = 1417744803;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public Stream<String> tabComplete(String var1_1, String[] var2_2) {
        block40: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = p.ch - p.apjo("aplp", aplm(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == p.apjo("aplq", apjl(int ), (int)49)) break;
                v0 /* !! */  = (long)p.apjo("aplr", apjl(int ), (int)50);
            }
            var5_3 = p.c;
            v1 /* !! */  = p.ch;
            if (true) ** GOTO lbl11
            block23: while (true) {
                v1 /* !! */  = (long)(v2 - p.apjo("apls", aplm(int ), (int)1));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -695221093: {
                        v2 = p.apjo("aplt", aplm(int ), (int)2);
                        continue block23;
                    }
                    case 1213410233: {
                        v2 = p.apjo("aplu", aplm(int ), (int)3);
                        continue block23;
                    }
                    case 1230888784: {
                        break block23;
                    }
                }
                break;
            }
            var4_4 /* !! */  = p.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = p.ch - p.apjo("aplv", aplm(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == p.apjo("aplw", apjl(int ), (int)51)) break;
                v3 /* !! */  = (long)p.apjo("aplx", apjl(int ), (int)52);
            }
            var3_5 = p.a;
            if (var5_3) {
                throw null;
lbl29:
                // 4 sources

                return null;
            }
            if (var3_5 || var3_5) ** GOTO lbl29
            if (var2_2.length != p.apjo("aply", apjl(int ), (int)53)) break block40;
            if (var3_5 || var3_5) ** GOTO lbl29
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = p.ch - p.apjo("aplz", aplm(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == p.apjo("apma", apjl(int ), (int)54)) break;
                v4 /* !! */  = (long)p.apjo("apmb", apjl(int ), (int)55);
            }
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_3 = p.ch - p.apjo("apmc", aplm(int ), (int)6)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == p.apjo("apmd", apjl(int ), (int)56)) break;
                v5 /* !! */  = (long)p.apjo("apme", apjl(int ), (int)57);
            }
            v6 = new i();
            v7 = var2_2[0];
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_4 = p.ch - p.apjo("apmf", aplm(int ), (int)7)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == p.apjo("apmg", apjl(int ), (int)58)) break;
                v8 /* !! */  = (long)p.apjo("apmh", apjl(int ), (int)59);
            }
            v9 = v6.filterPrefix(v7);
            v10 = new String[]{"dm"};
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_5 = p.ch - p.apjo("apmi", aplm(int ), (int)8)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == p.apjo("apmj", apjl(int ), (int)60)) break;
                v11 /* !! */  = (long)p.apjo("apmk", apjl(int ), (int)61);
            }
            v12 = v9.append(v10);
            v13 /* !! */  = p.ch;
            if (true) ** GOTO lbl63
            block30: while (true) {
                v13 /* !! */  = (long)(v14 - p.apjo("apml", aplm(int ), (int)9));
lbl63:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1173984505: {
                        v14 = p.apjo("apmm", aplm(int ), (int)10);
                        continue block30;
                    }
                    case -522062311: {
                        v14 = p.apjo("apmn", aplm(int ), (int)11);
                        continue block30;
                    }
                    case 977486447: {
                        v14 = p.apjo("apmo", aplm(int ), (int)12);
                        continue block30;
                    }
                    case 1230888784: {
                        break block30;
                    }
                }
                break;
            }
            return v12.stream();
        }
        if (var3_5) ** GOTO lbl29
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        block11 : switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var3_5) ** break;
                ** continue;
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_6 = p.ch - p.apjo("apmp", aplm(int ), (int)13)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == p.apjo("apmq", apjl(int ), (int)62)) break;
                    v15 /* !! */  = (long)p.apjo("apmr", apjl(int ), (int)63);
                }
                return Stream.empty();
            }
lbl89:
            // 3 sources

            case 0: {
                var4_4 /* !! */  = (int)p.apjo("apms", apjl(int ), (int)64);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl117
            }
            case 1: {
                var4_4 /* !! */  = (int)p.apjo("apmt", apjl(int ), (int)65);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl108
            }
lbl99:
            // 2 sources

            case 2: {
                do {
                    var4_4 /* !! */  = (int)p.apjo("apmu", apjl(int ), (int)66);
                } while (!var5_3);
                throw null;
            }
            case 3: {
                var4_4 /* !! */  = (int)p.apjo("apmv", apjl(int ), (int)67);
                if (!var5_3) ** GOTO lbl99
                throw null;
            }
lbl108:
            // 2 sources

            case 4: {
                var4_4 /* !! */  = (int)p.apjo("apmw", apjl(int ), (int)68);
                if (!var5_3) ** GOTO lbl89
                throw null;
            }
            case 5: {
                var4_4 /* !! */  = (int)p.apjo("apmx", apjl(int ), (int)69);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl121
            }
lbl117:
            // 2 sources

            case 6: {
                var4_4 /* !! */  = (int)p.apjo("apmy", apjl(int ), (int)70);
                if (!var5_3) ** GOTO lbl89
                throw null;
            }
lbl121:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)p.apjo("apmz", apjl(int ), (int)71);
                    if (!var5_3) break block11;
                    throw null;
                }
            }
            case 8: 
        }
        var4_4 /* !! */  = (int)p.apjo("apna", apjl(int ), (int)72);
        ** while (!var5_3)
lbl129:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void usage() {
        v0 /* !! */  = p.ch;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(p.apjo("apns", aplm(int ), (int)23) - p.apjo("apnr", aplm(int ), (int)22));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1477058304: {
                    continue block22;
                }
                case 1230888784: {
                    break block22;
                }
            }
            break;
        }
        var3_1 = p.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = p.ch - p.apjo("apnt", aplm(int ), (int)24)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == p.apjo("apnu", apjl(int ), (int)81)) break;
            v1 /* !! */  = (long)p.apjo("apnv", apjl(int ), (int)82);
        }
        var2_2 /* !! */  = p.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = p.ch - p.apjo("apnw", aplm(int ), (int)25)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == p.apjo("apnx", apjl(int ), (int)83)) break;
            v2 /* !! */  = (long)p.apjo("apny", apjl(int ), (int)84);
        }
        var1_3 = p.a;
        if (var3_1) {
            throw null;
lbl25:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl25
        v3 /* !! */  = p.ch;
        if (true) ** GOTO lbl32
        block26: while (true) {
            v3 /* !! */  = (long)(v4 - p.apjo("apnz", aplm(int ), (int)26));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -323611214: {
                    v4 = p.apjo("apoa", aplm(int ), (int)27);
                    continue block26;
                }
                case 822062533: {
                    v4 = p.apjo("apob", aplm(int ), (int)28);
                    continue block26;
                }
                case 925018360: {
                    v4 = p.apjo("apoc", aplm(int ), (int)29);
                    continue block26;
                }
                case 1230888784: {
                    break block26;
                }
            }
            break;
        }
        v5 = class_2561.method_43470((String)"\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435: .irc <\u0442\u0435\u043a\u0441\u0442> | .irc dm <login> <\u0442\u0435\u043a\u0441\u0442>");
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = p.ch - p.apjo("apod", aplm(int ), (int)30)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == p.apjo("apoe", apjl(int ), (int)85)) break;
            v6 /* !! */  = (long)p.apjo("apof", apjl(int ), (int)86);
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = p.ch - p.apjo("apog", aplm(int ), (int)31)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == p.apjo("apoh", apjl(int ), (int)87)) break;
            v7 /* !! */  = (long)p.apjo("apoi", apjl(int ), (int)88);
        }
        v8 = v5.method_27692(class_124.field_1080);
        v9 /* !! */  = p.ch;
        if (true) ** GOTO lbl60
        block29: while (true) {
            v9 /* !! */  = (long)(p.apjo("apok", aplm(int ), (int)33) - p.apjo("apoj", aplm(int ), (int)32));
lbl60:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -2018715864: {
                    continue block29;
                }
                case 1230888784: {
                    break block29;
                }
            }
            break;
        }
        this.logDirect(v8);
        if (var1_3) ** GOTO lbl25
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
                do {
                    var2_2 /* !! */  = (int)p.apjo("apol", apjl(int ), (int)89);
                } while (!var3_1);
                throw null;
            }
lbl78:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)p.apjo("apom", apjl(int ), (int)90);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl87
            }
            case 2: {
                var2_2 /* !! */  = (int)p.apjo("apon", apjl(int ), (int)91);
                if (!var3_1) break;
                throw null;
            }
lbl87:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)p.apjo("apoo", apjl(int ), (int)92);
                if (var3_1) {
                    throw null;
                }
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)p.apjo("apop", apjl(int ), (int)93);
                    if (!var3_1) ** GOTO lbl78
                    throw null;
                }
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)p.apjo("apoq", apjl(int ), (int)94);
        ** while (!var3_1)
lbl99:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void appr() {
        p.apln[0] = 5254542912709956970L;
        p.apln[1] = -6406643202066854114L;
        p.apln[2] = -7842553274993785897L;
        p.apln[3] = -8857629262568106896L;
        p.apln[4] = -2688303783718469590L;
        p.apln[5] = -8138700487099929518L;
        p.apln[6] = 3020425388197418930L;
        p.apln[7] = -381833348666698081L;
        p.apln[8] = -3316544225200178604L;
        p.apln[9] = 7989673745314136962L;
        p.apln[10] = 1525525359634121059L;
        p.apln[11] = 6800712058918928727L;
        p.apln[12] = -6091114269543037412L;
        p.apln[13] = -7430063651816364354L;
        p.apln[14] = 9011915901518408596L;
        p.apln[15] = 2448187595634346807L;
        p.apln[16] = -8566941335107248635L;
        p.apln[17] = -8056214725651365508L;
        p.apln[18] = -1632695362296833227L;
        p.apln[19] = -4523819958546830075L;
        p.apln[20] = -3750973765152927830L;
        p.apln[21] = -3966328597316555691L;
        p.apln[22] = 988479684358152288L;
        p.apln[23] = 2573648319704879699L;
        p.apln[24] = 3743825272912576098L;
        p.apln[25] = -5549614380389673510L;
        p.apln[26] = -5206911561694492973L;
        p.apln[27] = 2758608225633070755L;
        p.apln[28] = 5984777082315933628L;
        p.apln[29] = -8924736837707303132L;
        p.apln[30] = 1925085067952353925L;
        p.apln[31] = 843761933376171595L;
        p.apln[32] = -4684717535533075155L;
        p.apln[33] = 8522371099076543102L;
        p.apln[34] = -6300602455094141767L;
        p.apln[35] = 2156610120605557640L;
        p.apln[36] = 8627182541004208204L;
        p.apln[37] = 6312997829673522074L;
        p.apln[38] = -2990911609151838793L;
        p.apln[39] = 9169969166217282309L;
        p.apln[40] = 6409723876950532317L;
        p.apln[41] = -3100087151929857328L;
        p.apln[42] = -1547549617140835011L;
        p.apln[43] = 7864266717911117491L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public List<String> getLongDesc() {
        v0 /* !! */  = p.ch;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - p.apjo("apnb", aplm(int ), (int)14));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1839007783: {
                    v1 = p.apjo("apnc", aplm(int ), (int)15);
                    continue block16;
                }
                case -517625506: {
                    v1 = p.apjo("apnd", aplm(int ), (int)16);
                    continue block16;
                }
                case 1230888784: {
                    break block16;
                }
            }
            break;
        }
        var3_1 = p.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = p.ch - p.apjo("apne", aplm(int ), (int)17)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == p.apjo("apnf", apjl(int ), (int)73)) break;
            v2 /* !! */  = (long)p.apjo("apng", apjl(int ), (int)74);
        }
        var2_2 /* !! */  = p.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = p.ch;
                if (true) ** GOTO lbl29
                block18: while (true) {
                    v3 /* !! */  = (long)(v4 - p.apjo("apnh", aplm(int ), (int)18));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 42616797: {
                            v4 = p.apjo("apni", aplm(int ), (int)19);
                            continue block18;
                        }
                        case 760226353: {
                            v4 = p.apjo("apnj", aplm(int ), (int)20);
                            continue block18;
                        }
                        case 1230888784: {
                            break block18;
                        }
                    }
                    break;
                }
                var1_3 = p.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = p.ch - p.apjo("apnk", aplm(int ), (int)21)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == p.apjo("apnl", apjl(int ), (int)75)) break;
                    v5 /* !! */  = (long)p.apjo("apnm", apjl(int ), (int)76);
                }
                return List.of("\u041e\u0442\u043f\u0440\u0430\u0432\u043b\u044f\u0435\u0442 \u0441\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u044f \u0432 IRC.", "> irc <\u0442\u0435\u043a\u0441\u0442> - \u043d\u0430\u043f\u0438\u0441\u0430\u0442\u044c \u0432 \u043e\u0431\u0449\u0438\u0439 \u0447\u0430\u0442", "> irc dm <login> <\u0442\u0435\u043a\u0441\u0442> - \u043d\u0430\u043f\u0438\u0441\u0430\u0442\u044c \u0432 \u043b\u0438\u0447\u043d\u044b\u0435 \u0441\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u044f");
            }
lbl51:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)p.apjo("apnn", apjl(int ), (int)77);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl60
            }
            case 1: {
                var2_2 /* !! */  = (int)p.apjo("apno", apjl(int ), (int)78);
                if (!var3_1) ** GOTO lbl51
                throw null;
            }
lbl60:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)p.apjo("apnp", apjl(int ), (int)79);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)p.apjo("apnq", apjl(int ), (int)80);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void appp() {
        p.apjn[0] = 1692609157;
        p.apjn[1] = 136380110;
        p.apjn[2] = 1549208934;
        p.apjn[3] = -278447224;
        p.apjn[4] = 1025431221;
        p.apjn[5] = 1208118115;
        p.apjn[6] = 1575600256;
        p.apjn[7] = -1269904699;
        p.apjn[8] = -1473326053;
        p.apjn[9] = -1052828451;
        p.apjn[10] = -1504620967;
        p.apjn[11] = -2031047982;
        p.apjn[12] = 38021711;
        p.apjn[13] = 1295184947;
        p.apjn[14] = 1924486991;
        p.apjn[15] = -582006333;
        p.apjn[16] = 141484086;
        p.apjn[17] = 2056213518;
        p.apjn[18] = -1373303474;
        p.apjn[19] = 1940400501;
        p.apjn[20] = 1419845455;
        p.apjn[21] = -1780571255;
        p.apjn[22] = 1036122432;
        p.apjn[23] = -956290573;
        p.apjn[24] = -495929268;
        p.apjn[25] = -1653163720;
        p.apjn[26] = -892525628;
        p.apjn[27] = -1925212645;
        p.apjn[28] = 1167318244;
        p.apjn[29] = -1426558356;
        p.apjn[30] = -1164864227;
        p.apjn[31] = 2146424449;
        p.apjn[32] = 227484391;
        p.apjn[33] = -375719244;
        p.apjn[34] = 341991532;
        p.apjn[35] = -211358062;
        p.apjn[36] = -891804526;
        p.apjn[37] = -2023389275;
        p.apjn[38] = 647081505;
        p.apjn[39] = 1112221692;
        p.apjn[40] = -636399068;
        p.apjn[41] = -2006807330;
        p.apjn[42] = -542541393;
        p.apjn[43] = -1088712627;
        p.apjn[44] = -415709008;
        p.apjn[45] = -1711035322;
        p.apjn[46] = 277214847;
        p.apjn[47] = 957361370;
        p.apjn[48] = 2112700981;
        p.apjn[49] = -378599199;
        p.apjn[50] = -1031179541;
        p.apjn[51] = -970678709;
        p.apjn[52] = 357570505;
        p.apjn[53] = -1472447745;
        p.apjn[54] = 11225375;
        p.apjn[55] = -1831110493;
        p.apjn[56] = -921498021;
        p.apjn[57] = 672291620;
        p.apjn[58] = -320031141;
        p.apjn[59] = -647253967;
        p.apjn[60] = -892250991;
        p.apjn[61] = -1240736413;
        p.apjn[62] = -1705037595;
        p.apjn[63] = -1462944026;
        p.apjn[64] = 432900133;
        p.apjn[65] = -1214631366;
        p.apjn[66] = -847439956;
        p.apjn[67] = -470094155;
        p.apjn[68] = 990362285;
        p.apjn[69] = 275450866;
        p.apjn[70] = 299735461;
        p.apjn[71] = 312296644;
        p.apjn[72] = -1923821699;
        p.apjn[73] = 690360951;
        p.apjn[74] = 100346670;
        p.apjn[75] = 1584369940;
        p.apjn[76] = -2040109519;
        p.apjn[77] = -887523786;
        p.apjn[78] = 291879997;
        p.apjn[79] = 1272038712;
        p.apjn[80] = 792368759;
        p.apjn[81] = 1920918013;
        p.apjn[82] = 38733147;
        p.apjn[83] = 1725298021;
        p.apjn[84] = 2177200;
        p.apjn[85] = 1691824012;
        p.apjn[86] = 970134825;
        p.apjn[87] = 427538248;
        p.apjn[88] = -1764139328;
        p.apjn[89] = 576732010;
        p.apjn[90] = -335326794;
        p.apjn[91] = -2132942364;
        p.apjn[92] = -1386716031;
        p.apjn[93] = 153728084;
        p.apjn[94] = -760955186;
        p.apjn[95] = 674419908;
        p.apjn[96] = -145940178;
        p.apjn[97] = 2074349822;
        p.apjn[98] = -35991350;
        p.apjn[99] = 1417744802;
    }

    private static /* synthetic */ int apjl(int n2) {
        return apjm[n2] ^ apjn[n2];
    }

    public static /* synthetic */ CallSite apjo(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void appq() {
        p.apjn[100] = 2056621633;
        p.apjn[101] = 1742057273;
        p.apjn[102] = 127029037;
        p.apjn[103] = -987747731;
        p.apjn[104] = -493273484;
        p.apjn[105] = -1496032217;
        p.apjn[106] = 1074150336;
    }

    private static /* synthetic */ void apps() {
        p.aplo[0] = 1917942554179719206L;
        p.aplo[1] = 7014866732069927385L;
        p.aplo[2] = -1107461161352730657L;
        p.aplo[3] = -2996074876600844000L;
        p.aplo[4] = 2965469215053757121L;
        p.aplo[5] = 1389834356229059538L;
        p.aplo[6] = 2043099342896701858L;
        p.aplo[7] = 5776931925743182378L;
        p.aplo[8] = -4849570426131089084L;
        p.aplo[9] = 8973082900358969021L;
        p.aplo[10] = -5513202827184582567L;
        p.aplo[11] = -3478829690533733099L;
        p.aplo[12] = 6921756504918871333L;
        p.aplo[13] = 3516781563691610242L;
        p.aplo[14] = 5789218582125850070L;
        p.aplo[15] = 7285548504777079175L;
        p.aplo[16] = 7083370053366707076L;
        p.aplo[17] = -8040950057333157934L;
        p.aplo[18] = -9050731227197001327L;
        p.aplo[19] = -8646304043527124291L;
        p.aplo[20] = -2902643742140590224L;
        p.aplo[21] = 6364820678435021048L;
        p.aplo[22] = -4346739440463509395L;
        p.aplo[23] = -7086660126627969566L;
        p.aplo[24] = 8589324200274122792L;
        p.aplo[25] = -5202946293623370438L;
        p.aplo[26] = -8713889396086614956L;
        p.aplo[27] = 5275214172494093154L;
        p.aplo[28] = -3171533436648347650L;
        p.aplo[29] = -5521275783667827011L;
        p.aplo[30] = 2678272888084860620L;
        p.aplo[31] = -6438391305113712433L;
        p.aplo[32] = -1671618691558383538L;
        p.aplo[33] = 2909751450804226848L;
        p.aplo[34] = -3949934684239783927L;
        p.aplo[35] = 48325247751221086L;
        p.aplo[36] = -2894106333020311567L;
        p.aplo[37] = 5309826045240905597L;
        p.aplo[38] = -4634526620164494167L;
        p.aplo[39] = -5434135363719230573L;
        p.aplo[40] = 989575132345500775L;
        p.aplo[41] = 4165562435569527563L;
        p.aplo[42] = 7911853989601327816L;
        p.aplo[43] = 3302994345882214279L;
    }
}

