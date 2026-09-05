/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_2338;

final class jv$ChestTimer {
    public static final boolean c;
    private long duration;
    private final class_2338 pos;
    private static long[] kdxh;
    private static long[] kdxi;
    private long startedAt;
    private static int[] kdwx;
    private static final long sd = 5492904392353745761L;
    public static final int b;
    private int anarchy;
    public static final boolean a;
    private static int[] kdww;

    private static /* synthetic */ void keah() {
        jv$ChestTimer.kdxi[0] = 336674938652738855L;
        jv$ChestTimer.kdxi[1] = -5516531894218810586L;
        jv$ChestTimer.kdxi[2] = -3631298833308911509L;
        jv$ChestTimer.kdxi[3] = -7377429632384494290L;
        jv$ChestTimer.kdxi[4] = -8924568235597693301L;
        jv$ChestTimer.kdxi[5] = -1667558902976096930L;
        jv$ChestTimer.kdxi[6] = 3416445606164552930L;
        jv$ChestTimer.kdxi[7] = -3409562096004585779L;
        jv$ChestTimer.kdxi[8] = 3601140078463302061L;
        jv$ChestTimer.kdxi[9] = 966351495680003994L;
        jv$ChestTimer.kdxi[10] = -39505468629258175L;
        jv$ChestTimer.kdxi[11] = 5858199002413926778L;
        jv$ChestTimer.kdxi[12] = -4042001775555263440L;
        jv$ChestTimer.kdxi[13] = -3000190685286870405L;
        jv$ChestTimer.kdxi[14] = -657400412925864039L;
        jv$ChestTimer.kdxi[15] = 2191876727774602904L;
        jv$ChestTimer.kdxi[16] = -4306348061831199095L;
        jv$ChestTimer.kdxi[17] = 1451642838097297293L;
        jv$ChestTimer.kdxi[18] = -66840420724582087L;
        jv$ChestTimer.kdxi[19] = -6277679376328355420L;
        jv$ChestTimer.kdxi[20] = 7597933595449913328L;
        jv$ChestTimer.kdxi[21] = 153561489276730969L;
        jv$ChestTimer.kdxi[22] = -8411204140705023949L;
        jv$ChestTimer.kdxi[23] = -5843207909874400226L;
        jv$ChestTimer.kdxi[24] = 799323918189732740L;
        jv$ChestTimer.kdxi[25] = 5026817415259736915L;
        jv$ChestTimer.kdxi[26] = -348524530111831206L;
        jv$ChestTimer.kdxi[27] = -4482340947093100544L;
        jv$ChestTimer.kdxi[28] = -697465135637050346L;
        jv$ChestTimer.kdxi[29] = 1884530634233415658L;
        jv$ChestTimer.kdxi[30] = 3388300638238385789L;
        jv$ChestTimer.kdxi[31] = 4619149514389347146L;
        jv$ChestTimer.kdxi[32] = 1716984073732632231L;
        jv$ChestTimer.kdxi[33] = 86927876193439865L;
        jv$ChestTimer.kdxi[34] = 8257560936906212110L;
        jv$ChestTimer.kdxi[35] = 2433106050352120695L;
        jv$ChestTimer.kdxi[36] = -4098255725665379964L;
        jv$ChestTimer.kdxi[37] = -4313486035284665987L;
        jv$ChestTimer.kdxi[38] = 277546773825334503L;
        jv$ChestTimer.kdxi[39] = 3034710493906050559L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void update(long var1_1, int var3_2) {
        block74: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = jv$ChestTimer.sd - jv$ChestTimer.kdwy("kdxj", kdxg(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == jv$ChestTimer.kdwy("kdxk", kdwv(int ), (int)7)) break;
                v0 /* !! */  = (long)jv$ChestTimer.kdwy("kdxl", kdwv(int ), (int)8);
            }
            var6_3 = jv$ChestTimer.c;
            v1 /* !! */  = jv$ChestTimer.sd;
            if (true) ** GOTO lbl11
            block48: while (true) {
                v1 /* !! */  = (long)(v2 - jv$ChestTimer.kdwy("kdxm", kdxg(int ), (int)1));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -914997750: {
                        v2 = jv$ChestTimer.kdwy("kdxn", kdxg(int ), (int)2);
                        continue block48;
                    }
                    case 64319274: {
                        v2 = jv$ChestTimer.kdwy("kdxo", kdxg(int ), (int)3);
                        continue block48;
                    }
                    case 862817121: {
                        break block48;
                    }
                    case 2014888157: {
                        v2 = jv$ChestTimer.kdwy("kdxp", kdxg(int ), (int)4);
                        continue block48;
                    }
                }
                break;
            }
            var5_4 /* !! */  = jv$ChestTimer.b;
            v3 /* !! */  = jv$ChestTimer.sd;
            if (true) ** GOTO lbl28
            block49: while (true) {
                v3 /* !! */  = (long)(v4 - jv$ChestTimer.kdwy("kdxq", kdxg(int ), (int)5));
lbl28:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -2005531550: {
                        v4 = jv$ChestTimer.kdwy("kdxr", kdxg(int ), (int)6);
                        continue block49;
                    }
                    case 281608043: {
                        v4 = jv$ChestTimer.kdwy("kdxs", kdxg(int ), (int)7);
                        continue block49;
                    }
                    case 862817121: {
                        break block49;
                    }
                }
                break;
            }
            var4_5 = jv$ChestTimer.a;
            if (var6_3) {
                throw null;
lbl40:
                // 8 sources

                return;
            }
            if (var4_5 || var4_5) ** GOTO lbl40
            v5 = var1_1 / jv$ChestTimer.kdwy("kdxt", kdxg(int ), (int)8);
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_1 = jv$ChestTimer.sd - jv$ChestTimer.kdwy("kdxu", kdxg(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == jv$ChestTimer.kdwy("kdxv", kdwv(int ), (int)9)) break;
                v6 /* !! */  = (long)jv$ChestTimer.kdwy("kdxw", kdwv(int ), (int)10);
            }
            v7 = v5 - this.remaining() / jv$ChestTimer.kdwy("kdxx", kdxg(int ), (int)10);
            v8 /* !! */  = jv$ChestTimer.sd;
            if (true) ** GOTO lbl54
            block52: while (true) {
                v8 /* !! */  = (long)(jv$ChestTimer.kdwy("kdxz", kdxg(int ), (int)12) - jv$ChestTimer.kdwy("kdxy", kdxg(int ), (int)11));
lbl54:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -1870149004: {
                        continue block52;
                    }
                    case 862817121: {
                        break block52;
                    }
                }
                break;
            }
            if (Math.abs(v7) > jv$ChestTimer.kdwy("kdya", kdxg(int ), (int)13)) break block74;
            if (var4_5) ** GOTO lbl40
            v9 /* !! */  = jv$ChestTimer.sd;
            if (true) ** GOTO lbl65
            block53: while (true) {
                v9 /* !! */  = (long)(v10 - jv$ChestTimer.kdwy("kdyb", kdxg(int ), (int)14));
lbl65:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1694639222: {
                        v10 = jv$ChestTimer.kdwy("kdyc", kdxg(int ), (int)15);
                        continue block53;
                    }
                    case 862817121: {
                        break block53;
                    }
                    case 1370219696: {
                        v10 = jv$ChestTimer.kdwy("kdyd", kdxg(int ), (int)16);
                        continue block53;
                    }
                    case 1860276182: {
                        v10 = jv$ChestTimer.kdwy("kdye", kdxg(int ), (int)17);
                        continue block53;
                    }
                }
                break;
            }
            if (this.anarchy == var3_2) ** GOTO lbl123
            if (var4_5) ** GOTO lbl40
        }
        if (var4_5 || var4_5) ** GOTO lbl40
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_2 = jv$ChestTimer.sd - jv$ChestTimer.kdwy("kdyf", kdxg(int ), (int)18)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == jv$ChestTimer.kdwy("kdyg", kdwv(int ), (int)11)) break;
            v11 /* !! */  = (long)jv$ChestTimer.kdwy("kdyh", kdwv(int ), (int)12);
        }
        this.duration = var1_1;
        if (var4_5 || var4_5) ** GOTO lbl40
        v12 /* !! */  = jv$ChestTimer.sd;
        if (true) ** GOTO lbl92
        block55: while (true) {
            v12 /* !! */  = (long)(v13 - jv$ChestTimer.kdwy("kdyi", kdxg(int ), (int)19));
lbl92:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1395150294: {
                    v13 = jv$ChestTimer.kdwy("kdyj", kdxg(int ), (int)20);
                    continue block55;
                }
                case 830386719: {
                    v13 = jv$ChestTimer.kdwy("kdyk", kdxg(int ), (int)21);
                    continue block55;
                }
                case 862817121: {
                    break block55;
                }
            }
            break;
        }
        this.anarchy = var3_2;
        if (var4_5 || var4_5) ** GOTO lbl40
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_3 = jv$ChestTimer.sd - jv$ChestTimer.kdwy("kdyl", kdxg(int ), (int)22)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == jv$ChestTimer.kdwy("kdym", kdwv(int ), (int)13)) break;
            v14 /* !! */  = (long)jv$ChestTimer.kdwy("kdyn", kdwv(int ), (int)14);
        }
        v15 = System.currentTimeMillis();
        v16 /* !! */  = jv$ChestTimer.sd;
        if (true) ** GOTO lbl113
        block57: while (true) {
            v16 /* !! */  = (long)(jv$ChestTimer.kdwy("kdyp", kdxg(int ), (int)24) - jv$ChestTimer.kdwy("kdyo", kdxg(int ), (int)23));
lbl113:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case 862817121: {
                    break block57;
                }
                case 2035393627: {
                    continue block57;
                }
            }
            break;
        }
        this.startedAt = v15;
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_5) ** GOTO lbl40
lbl123:
                // 2 sources

                if (!var4_5 && !var4_5) ** break;
                ** continue;
                return;
            }
lbl126:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)jv$ChestTimer.kdwy("kdyq", kdwv(int ), (int)15);
                    if (var6_3) {
                        throw null;
                    }
                    ** GOTO lbl169
                    break;
                }
            }
lbl132:
            // 2 sources

            case 1: {
                var5_4 /* !! */  = (int)jv$ChestTimer.kdwy("kdyr", kdwv(int ), (int)16);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl137:
            // 2 sources

            case 2: {
                var5_4 /* !! */  = (int)jv$ChestTimer.kdwy("kdys", kdwv(int ), (int)17);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl142:
            // 2 sources

            case 3: {
                do {
                    var5_4 /* !! */  = (int)jv$ChestTimer.kdwy("kdyt", kdwv(int ), (int)18);
                } while (!var6_3);
                throw null;
            }
            case 4: {
                var5_4 /* !! */  = (int)jv$ChestTimer.kdwy("kdyu", kdwv(int ), (int)19);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 5: {
                var5_4 /* !! */  = (int)jv$ChestTimer.kdwy("kdyv", kdwv(int ), (int)20);
                if (var6_3) {
                    throw null;
                }
            }
lbl156:
            // 4 sources

            case 6: {
                do {
                    var5_4 /* !! */  = (int)jv$ChestTimer.kdwy("kdyw", kdwv(int ), (int)21);
                } while (!var6_3);
                throw null;
            }
lbl161:
            // 2 sources

            case 7: {
                var5_4 /* !! */  = (int)jv$ChestTimer.kdwy("kdyx", kdwv(int ), (int)22);
                if (!var6_3) ** GOTO lbl142
                throw null;
            }
            case 8: {
                var5_4 /* !! */  = (int)jv$ChestTimer.kdwy("kdyy", kdwv(int ), (int)23);
                if (!var6_3) ** GOTO lbl161
                throw null;
            }
lbl169:
            // 2 sources

            case 9: {
                var5_4 /* !! */  = (int)jv$ChestTimer.kdwy("kdyz", kdwv(int ), (int)24);
                if (!var6_3) ** GOTO lbl137
                throw null;
            }
            case 10: {
                var5_4 /* !! */  = (int)jv$ChestTimer.kdwy("kdza", kdwv(int ), (int)25);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl178:
            // 2 sources

            case 11: {
                do {
                    var5_4 /* !! */  = (int)jv$ChestTimer.kdwy("kdzb", kdwv(int ), (int)26);
                } while (!var6_3);
                throw null;
            }
lbl183:
            // 2 sources

            case 12: {
                var5_4 /* !! */  = (int)jv$ChestTimer.kdwy("kdzc", kdwv(int ), (int)27);
                if (!var6_3) ** GOTO lbl132
                throw null;
            }
lbl187:
            // 2 sources

            case 13: {
                var5_4 /* !! */  = (int)jv$ChestTimer.kdwy("kdzd", kdwv(int ), (int)28);
                if (!var6_3) ** GOTO lbl126
                throw null;
            }
            case 14: 
        }
        var5_4 /* !! */  = (int)jv$ChestTimer.kdwy("kdze", kdwv(int ), (int)29);
        ** while (!var6_3)
lbl194:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite kdwy(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void keag() {
        jv$ChestTimer.kdxh[0] = -1384902386688566292L;
        jv$ChestTimer.kdxh[1] = -3146038509093180270L;
        jv$ChestTimer.kdxh[2] = 4394783203060533180L;
        jv$ChestTimer.kdxh[3] = 7449120820701655599L;
        jv$ChestTimer.kdxh[4] = -5924491886131255878L;
        jv$ChestTimer.kdxh[5] = 1814031581550751855L;
        jv$ChestTimer.kdxh[6] = -4356854204164217748L;
        jv$ChestTimer.kdxh[7] = -4892813146399988066L;
        jv$ChestTimer.kdxh[8] = 3601140078463302213L;
        jv$ChestTimer.kdxh[9] = 5062091069949900716L;
        jv$ChestTimer.kdxh[10] = -39505468629257303L;
        jv$ChestTimer.kdxh[11] = -5963286484610836791L;
        jv$ChestTimer.kdxh[12] = 8347934928244811049L;
        jv$ChestTimer.kdxh[13] = -3000190685286870402L;
        jv$ChestTimer.kdxh[14] = -734458279154901807L;
        jv$ChestTimer.kdxh[15] = 432550370114010310L;
        jv$ChestTimer.kdxh[16] = -2247070340254014194L;
        jv$ChestTimer.kdxh[17] = -8399033743338746459L;
        jv$ChestTimer.kdxh[18] = -2555205900581072392L;
        jv$ChestTimer.kdxh[19] = 2226760179991239885L;
        jv$ChestTimer.kdxh[20] = -5486648275165421902L;
        jv$ChestTimer.kdxh[21] = 2164282729340271933L;
        jv$ChestTimer.kdxh[22] = 6691450512372885487L;
        jv$ChestTimer.kdxh[23] = -1892388514542946362L;
        jv$ChestTimer.kdxh[24] = 765053305392713384L;
        jv$ChestTimer.kdxh[25] = -6561050662576732012L;
        jv$ChestTimer.kdxh[26] = 2018044962559980535L;
        jv$ChestTimer.kdxh[27] = -8084341708014523281L;
        jv$ChestTimer.kdxh[28] = 8882779948711070449L;
        jv$ChestTimer.kdxh[29] = 9184040497776266084L;
        jv$ChestTimer.kdxh[30] = 3388300638238385789L;
        jv$ChestTimer.kdxh[31] = 4095625587688982981L;
        jv$ChestTimer.kdxh[32] = -5756642603636070057L;
        jv$ChestTimer.kdxh[33] = 2751807435848303778L;
        jv$ChestTimer.kdxh[34] = -2849069168995106453L;
        jv$ChestTimer.kdxh[35] = -2466976682109214285L;
        jv$ChestTimer.kdxh[36] = -4698316402039668252L;
        jv$ChestTimer.kdxh[37] = 9206883784585798528L;
        jv$ChestTimer.kdxh[38] = -2400613147130193024L;
        jv$ChestTimer.kdxh[39] = -5112754597409974924L;
    }

    static {
        kdww = new int[40];
        kdwx = new int[40];
        jv$ChestTimer.keae();
        jv$ChestTimer.keaf();
        kdxh = new long[40];
        kdxi = new long[40];
        jv$ChestTimer.keag();
        jv$ChestTimer.keah();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private long remaining() {
        v0 /* !! */  = jv$ChestTimer.sd;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(jv$ChestTimer.kdwy("kdzg", kdxg(int ), (int)26) - jv$ChestTimer.kdwy("kdzf", kdxg(int ), (int)25));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -463198680: {
                    continue block18;
                }
                case 862817121: {
                    break block18;
                }
            }
            break;
        }
        var3_1 = jv$ChestTimer.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = jv$ChestTimer.sd - jv$ChestTimer.kdwy("kdzh", kdxg(int ), (int)27)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jv$ChestTimer.kdwy("kdzi", kdwv(int ), (int)30)) break;
            v1 /* !! */  = (long)jv$ChestTimer.kdwy("kdzj", kdwv(int ), (int)31);
        }
        var2_2 = jv$ChestTimer.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = jv$ChestTimer.sd - jv$ChestTimer.kdwy("kdzk", kdxg(int ), (int)28)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jv$ChestTimer.kdwy("kdzl", kdwv(int ), (int)32)) break;
            v2 /* !! */  = (long)jv$ChestTimer.kdwy("kdzm", kdwv(int ), (int)33);
        }
        var1_3 = jv$ChestTimer.a;
        if (var3_1) {
            throw null;
lbl27:
            // 1 sources

            return (long)jv$ChestTimer.kdwy("kdzn", kdxg(int ), (int)29);
        }
        ** while (var1_3 || var1_3)
lbl30:
        // 1 sources

        v3 = jv$ChestTimer.kdwy("kdzo", kdxg(int ), (int)30);
        v4 /* !! */  = jv$ChestTimer.sd;
        if (true) ** GOTO lbl35
        block22: while (true) {
            v4 /* !! */  = (long)(jv$ChestTimer.kdwy("kdzq", kdxg(int ), (int)32) - jv$ChestTimer.kdwy("kdzp", kdxg(int ), (int)31));
lbl35:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 825837113: {
                    continue block22;
                }
                case 862817121: {
                    break block22;
                }
            }
            break;
        }
        v5 /* !! */  = jv$ChestTimer.sd;
        if (true) ** GOTO lbl44
        block23: while (true) {
            v5 /* !! */  = (long)(jv$ChestTimer.kdwy("kdzs", kdxg(int ), (int)34) - jv$ChestTimer.kdwy("kdzr", kdxg(int ), (int)33));
lbl44:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1096444777: {
                    continue block23;
                }
                case 862817121: {
                    break block23;
                }
            }
            break;
        }
        v6 = System.currentTimeMillis();
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = jv$ChestTimer.sd - jv$ChestTimer.kdwy("kdzt", kdxg(int ), (int)35)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 /* !! */  == jv$ChestTimer.kdwy("kdzu", kdwv(int ), (int)34)) break;
            v7 /* !! */  = (long)jv$ChestTimer.kdwy("kdzv", kdwv(int ), (int)35);
        }
        v8 = this.duration - (v6 - this.startedAt);
        v9 /* !! */  = jv$ChestTimer.sd;
        if (true) ** GOTO lbl61
        block25: while (true) {
            v9 /* !! */  = (long)(v10 - jv$ChestTimer.kdwy("kdzw", kdxg(int ), (int)36));
lbl61:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -962318336: {
                    v10 = jv$ChestTimer.kdwy("kdzx", kdxg(int ), (int)37);
                    continue block25;
                }
                case -650410257: {
                    v10 = jv$ChestTimer.kdwy("kdzy", kdxg(int ), (int)38);
                    continue block25;
                }
                case 862817121: {
                    break block25;
                }
                case 1253049783: {
                    v10 = jv$ChestTimer.kdwy("kdzz", kdxg(int ), (int)39);
                    continue block25;
                }
            }
            break;
        }
        return Math.max((long)v3, v8);
    }

    private static /* synthetic */ long kdxg(int n2) {
        return kdxh[n2] ^ kdxi[n2];
    }

    private static /* synthetic */ void keae() {
        jv$ChestTimer.kdww[0] = -2003183152;
        jv$ChestTimer.kdww[1] = -311397548;
        jv$ChestTimer.kdww[2] = -85317919;
        jv$ChestTimer.kdww[3] = -826146899;
        jv$ChestTimer.kdww[4] = 1087324465;
        jv$ChestTimer.kdww[5] = 134590911;
        jv$ChestTimer.kdww[6] = 1566804581;
        jv$ChestTimer.kdww[7] = -1572875323;
        jv$ChestTimer.kdww[8] = -970184962;
        jv$ChestTimer.kdww[9] = 2030110620;
        jv$ChestTimer.kdww[10] = -1956591373;
        jv$ChestTimer.kdww[11] = -761488400;
        jv$ChestTimer.kdww[12] = -1565093931;
        jv$ChestTimer.kdww[13] = -63992455;
        jv$ChestTimer.kdww[14] = 886521254;
        jv$ChestTimer.kdww[15] = 1088771284;
        jv$ChestTimer.kdww[16] = -1108604342;
        jv$ChestTimer.kdww[17] = 247458126;
        jv$ChestTimer.kdww[18] = -250430725;
        jv$ChestTimer.kdww[19] = 1330419139;
        jv$ChestTimer.kdww[20] = -1488554683;
        jv$ChestTimer.kdww[21] = 7595558;
        jv$ChestTimer.kdww[22] = -481915118;
        jv$ChestTimer.kdww[23] = -1994274886;
        jv$ChestTimer.kdww[24] = -2139977250;
        jv$ChestTimer.kdww[25] = -1504215189;
        jv$ChestTimer.kdww[26] = 2073163673;
        jv$ChestTimer.kdww[27] = -306322844;
        jv$ChestTimer.kdww[28] = 808597442;
        jv$ChestTimer.kdww[29] = 1272356048;
        jv$ChestTimer.kdww[30] = -1525329349;
        jv$ChestTimer.kdww[31] = 1701219610;
        jv$ChestTimer.kdww[32] = -1824901622;
        jv$ChestTimer.kdww[33] = -149393715;
        jv$ChestTimer.kdww[34] = -1965824334;
        jv$ChestTimer.kdww[35] = 916146686;
        jv$ChestTimer.kdww[36] = -680694446;
        jv$ChestTimer.kdww[37] = 838873320;
        jv$ChestTimer.kdww[38] = -643105402;
        jv$ChestTimer.kdww[39] = -1793950535;
    }

    private static /* synthetic */ void keaf() {
        jv$ChestTimer.kdwx[0] = -2003183150;
        jv$ChestTimer.kdwx[1] = -311397546;
        jv$ChestTimer.kdwx[2] = -85317916;
        jv$ChestTimer.kdwx[3] = -826146898;
        jv$ChestTimer.kdwx[4] = 1087324465;
        jv$ChestTimer.kdwx[5] = 134590910;
        jv$ChestTimer.kdwx[6] = 1566804577;
        jv$ChestTimer.kdwx[7] = -1572875324;
        jv$ChestTimer.kdwx[8] = -1555626659;
        jv$ChestTimer.kdwx[9] = 2030110621;
        jv$ChestTimer.kdwx[10] = -1327935885;
        jv$ChestTimer.kdwx[11] = -761488399;
        jv$ChestTimer.kdwx[12] = 721041958;
        jv$ChestTimer.kdwx[13] = -63992456;
        jv$ChestTimer.kdwx[14] = 910796434;
        jv$ChestTimer.kdwx[15] = 1088771288;
        jv$ChestTimer.kdwx[16] = -1108604348;
        jv$ChestTimer.kdwx[17] = 247458120;
        jv$ChestTimer.kdwx[18] = -250430728;
        jv$ChestTimer.kdwx[19] = 1330419145;
        jv$ChestTimer.kdwx[20] = -1488554681;
        jv$ChestTimer.kdwx[21] = 7595552;
        jv$ChestTimer.kdwx[22] = -481915110;
        jv$ChestTimer.kdwx[23] = -1994274882;
        jv$ChestTimer.kdwx[24] = -2139977262;
        jv$ChestTimer.kdwx[25] = -1504215192;
        jv$ChestTimer.kdwx[26] = 2073163664;
        jv$ChestTimer.kdwx[27] = -306322842;
        jv$ChestTimer.kdwx[28] = 808597452;
        jv$ChestTimer.kdwx[29] = 1272356062;
        jv$ChestTimer.kdwx[30] = 1525329348;
        jv$ChestTimer.kdwx[31] = -222461829;
        jv$ChestTimer.kdwx[32] = -1824901621;
        jv$ChestTimer.kdwx[33] = 260131970;
        jv$ChestTimer.kdwx[34] = -1965824333;
        jv$ChestTimer.kdwx[35] = 809001590;
        jv$ChestTimer.kdwx[36] = -680694447;
        jv$ChestTimer.kdwx[37] = 838873323;
        jv$ChestTimer.kdwx[38] = -643105403;
        jv$ChestTimer.kdwx[39] = -1793950533;
    }

    private static /* synthetic */ int kdwv(int n2) {
        return kdww[n2] ^ kdwx[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private jv$ChestTimer(class_2338 var1_1, long var2_2, int var4_3) {
        var6_4 /* !! */  = jv$ChestTimer.b;
        super();
        this.pos = var1_1;
        if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.duration = var2_2;
                this.anarchy = var4_3;
                this.startedAt = System.currentTimeMillis();
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_4 /* !! */  = (int)jv$ChestTimer.kdwy("kdwz", kdwv(int ), (int)0);
                    ** GOTO lbl17
                    break;
                }
            }
            case 1: {
                var6_4 /* !! */  = (int)jv$ChestTimer.kdwy("kdxa", kdwv(int ), (int)1);
            }
lbl17:
            // 3 sources

            case 2: {
                var6_4 /* !! */  = (int)jv$ChestTimer.kdwy("kdxb", kdwv(int ), (int)2);
                ** GOTO lbl27
            }
lbl20:
            // 2 sources

            case 3: {
                while (true) {
                    var6_4 /* !! */  = (int)jv$ChestTimer.kdwy("kdxc", kdwv(int ), (int)3);
                }
            }
            case 4: {
                var6_4 /* !! */  = (int)jv$ChestTimer.kdwy("kdxd", kdwv(int ), (int)4);
                ** GOTO lbl20
            }
lbl27:
            // 2 sources

            case 5: {
                while (true) {
                    var6_4 /* !! */  = (int)jv$ChestTimer.kdwy("kdxe", kdwv(int ), (int)5);
                }
            }
            case 6: 
        }
        var6_4 /* !! */  = (int)jv$ChestTimer.kdwy("kdxf", kdwv(int ), (int)6);
        ** while (true)
    }
}

