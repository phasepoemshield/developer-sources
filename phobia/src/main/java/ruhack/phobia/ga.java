/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1764
 *  net.minecraft.class_1839
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2596
 *  net.minecraft.class_2846
 *  net.minecraft.class_2846$class_2847
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1268;
import net.minecraft.class_1764;
import net.minecraft.class_1839;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2596;
import net.minecraft.class_2846;
import ruhack.phobia.aw;
import ruhack.phobia.df;
import ruhack.phobia.dg;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kf;
import ruhack.phobia.nj;
import ruhack.phobia.od;
import ruhack.phobia.pn;
import ruhack.phobia.pr;

public class ga
extends ds {
    public final kf itemMode;
    private static int[] jefl = new int[282];
    private int ticks;
    public static final boolean a;
    private int cycleCounter;
    private static int[] jefm;
    private final od script;
    public static final boolean c;
    private static long[] jefc;
    public static final int b;
    private static long[] jefd;
    private final pr notifWatch;
    public static final long rb = 6915371848478998615L;
    private boolean finish;

    public static /* synthetic */ CallSite jefe(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long jefb(int n2) {
        return jefc[n2] ^ jefd[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onUsingItem(dg var1_1) {
        v0 /* !! */  = ga.rb;
        if (true) ** GOTO lbl5
        block79: while (true) {
            v0 /* !! */  = (long)(ga.jefe("jejn", jefb(int ), (int)10) - ga.jefe("jejm", jefb(int ), (int)9));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1772896169: {
                    break block79;
                }
                case 428496242: {
                    continue block79;
                }
            }
            break;
        }
        var6_2 = ga.c;
        v1 /* !! */  = ga.rb;
        if (true) ** GOTO lbl15
        block80: while (true) {
            v1 /* !! */  = (long)(ga.jefe("jejp", jefb(int ), (int)12) - ga.jefe("jejo", jefb(int ), (int)11));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1772896169: {
                    break block80;
                }
                case 888145026: {
                    continue block80;
                }
            }
            break;
        }
        var5_3 /* !! */  = ga.b;
        v2 /* !! */  = ga.rb;
        if (true) ** GOTO lbl25
        block81: while (true) {
            v2 /* !! */  = (long)(ga.jefe("jejr", jefb(int ), (int)14) - ga.jefe("jejq", jefb(int ), (int)13));
lbl25:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1772896169: {
                    break block81;
                }
                case 356733192: {
                    continue block81;
                }
            }
            break;
        }
        var4_4 = ga.a;
        if (var6_2) {
            throw null;
lbl33:
            // 13 sources

            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl33
        v3 /* !! */  = ga.rb;
        if (true) ** GOTO lbl40
        block83: while (true) {
            v3 /* !! */  = (long)(ga.jefe("jejt", jefb(int ), (int)16) - ga.jefe("jejs", jefb(int ), (int)15));
lbl40:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1772896169: {
                    break block83;
                }
                case -1435243176: {
                    continue block83;
                }
            }
            break;
        }
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ga.rb - ga.jefe("jeju", jefb(int ), (int)17)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ga.jefe("jejv", jefk(int ), (int)99)) break;
            v4 /* !! */  = (long)ga.jefe("jejw", jefk(int ), (int)100);
        }
        if (ga.mc.field_1724 != null) ** GOTO lbl56
        if (var4_4) ** GOTO lbl33
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl56:
            // 1 sources

            if (var4_4 || var4_4) ** GOTO lbl33
            v5 /* !! */  = ga.rb;
            if (true) ** GOTO lbl61
            block85: while (true) {
                v5 /* !! */  = (long)(ga.jefe("jejy", jefb(int ), (int)19) - ga.jefe("jejx", jefb(int ), (int)18));
lbl61:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1772896169: {
                        break block85;
                    }
                    case -1499540148: {
                        continue block85;
                    }
                }
                break;
            }
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_1 = ga.rb - ga.jefe("jejz", jefb(int ), (int)20)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == ga.jefe("jeka", jefk(int ), (int)101)) break;
                v6 /* !! */  = (long)ga.jefe("jekb", jefk(int ), (int)102);
            }
            v7 = ga.mc.field_1724;
            v8 /* !! */  = ga.rb;
            if (true) ** GOTO lbl76
            block87: while (true) {
                v8 /* !! */  = (long)(v9 - ga.jefe("jekc", jefb(int ), (int)21));
lbl76:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -2021184862: {
                        v9 = ga.jefe("jekd", jefb(int ), (int)22);
                        continue block87;
                    }
                    case -1772896169: {
                        break block87;
                    }
                    case 1329047975: {
                        v9 = ga.jefe("jeke", jefb(int ), (int)23);
                        continue block87;
                    }
                }
                break;
            }
            var2_5 = v7.method_6058();
            if (var4_4 || var4_4) ** GOTO lbl33
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_2 = ga.rb - ga.jefe("jekf", jefb(int ), (int)24)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == ga.jefe("jekg", jefk(int ), (int)103)) break;
                v10 /* !! */  = (long)ga.jefe("jekh", jefk(int ), (int)104);
            }
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_3 = ga.rb - ga.jefe("jeki", jefb(int ), (int)25)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == ga.jefe("jekj", jefk(int ), (int)105)) break;
                v11 /* !! */  = (long)ga.jefe("jekk", jefk(int ), (int)106);
            }
            if (!var2_5.equals((Object)class_1268.field_5808)) ** GOTO lbl108
            if (var4_4) ** GOTO lbl33
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_4 = ga.rb - ga.jefe("jekl", jefb(int ), (int)26)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == ga.jefe("jekm", jefk(int ), (int)107)) break;
                v12 /* !! */  = (long)ga.jefe("jekn", jefk(int ), (int)108);
            }
            v13 = class_1268.field_5810;
            if (var6_2) {
                throw null;
            }
            ** GOTO lbl126
lbl108:
            // 1 sources

            if (var4_4 || var4_4) ** GOTO lbl33
            v14 /* !! */  = ga.rb;
            if (true) ** GOTO lbl113
            block91: while (true) {
                v14 /* !! */  = (long)(v15 - ga.jefe("jeko", jefb(int ), (int)27));
lbl113:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -1772896169: {
                        break block91;
                    }
                    case -1549414288: {
                        v15 = ga.jefe("jekp", jefb(int ), (int)28);
                        continue block91;
                    }
                    case -850475026: {
                        v15 = ga.jefe("jekq", jefb(int ), (int)29);
                        continue block91;
                    }
                    case 77993760: {
                        v15 = ga.jefe("jekr", jefb(int ), (int)30);
                        continue block91;
                    }
                }
                break;
            }
            v13 = var3_6 = class_1268.field_5808;
lbl126:
            // 2 sources

            if (var4_4 || var4_4) ** GOTO lbl33
            v16 /* !! */  = ga.rb;
            if (true) ** GOTO lbl131
            block92: while (true) {
                v16 /* !! */  = (long)(ga.jefe("jekt", jefb(int ), (int)32) - ga.jefe("jeks", jefb(int ), (int)31));
lbl131:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case -1772896169: {
                        break block92;
                    }
                    case 1984798312: {
                        continue block92;
                    }
                }
                break;
            }
            block64 : switch (var1_1.getType()) {
                case 1: {
                    if (var4_4 || var4_4) ** GOTO lbl33
                    v17 /* !! */  = ga.rb;
                    if (true) ** GOTO lbl143
                    block93: while (true) {
                        v17 /* !! */  = (long)(v18 - ga.jefe("jeku", jefb(int ), (int)33));
lbl143:
                        // 2 sources

                        switch ((int)v17 /* !! */ ) {
                            case -1772896169: {
                                break block93;
                            }
                            case 32786300: {
                                v18 = ga.jefe("jekv", jefb(int ), (int)34);
                                continue block93;
                            }
                            case 1483380887: {
                                v18 = ga.jefe("jekw", jefb(int ), (int)35);
                                continue block93;
                            }
                        }
                        break;
                    }
                    this.handleItemUse(var1_1, var2_5, var3_6);
                    if (var4_4 || var4_4) ** GOTO lbl33
                    if (!var6_2) break;
                    throw null;
                }
                case 2: {
                    do {
                        if (var4_4 || var4_4) ** GOTO lbl33
                        while (true) {
                            if ((v19 /* !! */  = (cfr_temp_5 = ga.rb - ga.jefe("jekx", jefb(int ), (int)36)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                            if (v19 /* !! */  == ga.jefe("jeky", jefk(int ), (int)109)) break;
                            v19 /* !! */  = (long)ga.jefe("jekz", jefk(int ), (int)110);
                        }
                        v20 /* !! */  = ga.rb;
                        if (true) ** GOTO lbl168
                        block96: while (true) {
                            v20 /* !! */  = (long)(v21 - ga.jefe("jela", jefb(int ), (int)37));
lbl168:
                            // 2 sources

                            switch ((int)v20 /* !! */ ) {
                                case -1772896169: {
                                    break block96;
                                }
                                case -989379446: {
                                    v21 = ga.jefe("jelb", jefb(int ), (int)38);
                                    continue block96;
                                }
                                case 156470727: {
                                    v21 = ga.jefe("jelc", jefb(int ), (int)39);
                                    continue block96;
                                }
                                case 612175482: {
                                    v21 = ga.jefe("jeld", jefb(int ), (int)40);
                                    continue block96;
                                }
                            }
                            break;
                        }
                        if (this.script.isFinished()) break block64;
                        if (var4_4) ** GOTO lbl33
                        while (true) {
                            if ((v22 /* !! */  = (cfr_temp_6 = ga.rb - ga.jefe("jele", jefb(int ), (int)41)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                            if (v22 /* !! */  == ga.jefe("jelf", jefk(int ), (int)111)) break;
                            v22 /* !! */  = (long)ga.jefe("jelg", jefk(int ), (int)112);
                        }
                        while (true) {
                            if ((v23 /* !! */  = (cfr_temp_7 = ga.rb - ga.jefe("jelh", jefb(int ), (int)42)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                            if (v23 /* !! */  == ga.jefe("jeli", jefk(int ), (int)113)) break;
                            v23 /* !! */  = (long)ga.jefe("jelj", jefk(int ), (int)114);
                        }
                        this.script.update();
                        if (var4_4) ** GOTO lbl33
                    } while (!var6_2);
                    throw null;
                }
            }
            if (!var4_4 && !var4_4) ** break;
            ** continue;
            return;
lbl199:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)ga.jefe("jelk", jefk(int ), (int)115);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 1: {
                var5_3 /* !! */  = (int)ga.jefe("jell", jefk(int ), (int)116);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl312
            }
lbl209:
            // 2 sources

            case 2: {
                var5_3 /* !! */  = (int)ga.jefe("jelm", jefk(int ), (int)117);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl214:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)ga.jefe("jeln", jefk(int ), (int)118);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl219:
            // 4 sources

            case 4: {
                var5_3 /* !! */  = (int)ga.jefe("jelo", jefk(int ), (int)119);
                if (var6_2) {
                    throw null;
                }
            }
            case 5: {
                var5_3 /* !! */  = (int)ga.jefe("jelp", jefk(int ), (int)120);
                if (!var6_2) ** GOTO lbl219
                throw null;
            }
lbl227:
            // 3 sources

            case 6: {
                var5_3 /* !! */  = (int)ga.jefe("jelq", jefk(int ), (int)121);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl241
            }
            case 7: {
                var5_3 /* !! */  = (int)ga.jefe("jelr", jefk(int ), (int)122);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl283
            }
            case 8: {
                var5_3 /* !! */  = (int)ga.jefe("jels", jefk(int ), (int)123);
                if (!var6_2) ** GOTO lbl209
                throw null;
            }
lbl241:
            // 4 sources

            case 9: {
                var5_3 /* !! */  = (int)ga.jefe("jelt", jefk(int ), (int)124);
                if (var6_2) {
                    throw null;
                }
            }
lbl245:
            // 5 sources

            case 10: {
                var5_3 /* !! */  = (int)ga.jefe("jelu", jefk(int ), (int)125);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl304
            }
            case 11: {
                do {
                    var5_3 /* !! */  = (int)ga.jefe("jelv", jefk(int ), (int)126);
                } while (!var6_2);
                throw null;
            }
            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)ga.jefe("jelw", jefk(int ), (int)127);
                    if (!var6_2) ** GOTO lbl241
                    throw null;
                }
            }
lbl260:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)ga.jefe("jelx", jefk(int ), (int)128);
                if (!var6_2) ** GOTO lbl245
                throw null;
            }
            case 14: {
                var5_3 /* !! */  = (int)ga.jefe("jely", jefk(int ), (int)129);
                if (!var6_2) ** GOTO lbl199
                throw null;
            }
            case 15: {
                var5_3 /* !! */  = (int)ga.jefe("jelz", jefk(int ), (int)130);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl300
            }
            case 16: {
                var5_3 /* !! */  = (int)ga.jefe("jema", jefk(int ), (int)131);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl308
            }
            case 17: {
                var5_3 /* !! */  = (int)ga.jefe("jemb", jefk(int ), (int)132);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl283:
            // 2 sources

            case 18: {
                var5_3 /* !! */  = (int)ga.jefe("jemc", jefk(int ), (int)133);
                if (!var6_2) ** GOTO lbl214
                throw null;
            }
lbl287:
            // 2 sources

            case 19: {
                var5_3 /* !! */  = (int)ga.jefe("jetg", jefk(int ), (int)134);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl312
            }
            case 20: {
                var5_3 /* !! */  = (int)ga.jefe("jeth", jefk(int ), (int)135);
                if (!var6_2) ** GOTO lbl287
                throw null;
            }
lbl296:
            // 2 sources

            case 21: {
                var5_3 /* !! */  = (int)ga.jefe("jeti", jefk(int ), (int)136);
                if (!var6_2) ** GOTO lbl241
                throw null;
            }
lbl300:
            // 2 sources

            case 22: {
                var5_3 /* !! */  = (int)ga.jefe("jetj", jefk(int ), (int)137);
                if (!var6_2) ** GOTO lbl260
                throw null;
            }
lbl304:
            // 2 sources

            case 23: {
                var5_3 /* !! */  = (int)ga.jefe("jetk", jefk(int ), (int)138);
                if (!var6_2) ** GOTO lbl227
                throw null;
            }
lbl308:
            // 2 sources

            case 24: {
                var5_3 /* !! */  = (int)ga.jefe("jetl", jefk(int ), (int)139);
                if (var6_2) {
                    throw null;
                }
            }
lbl312:
            // 5 sources

            case 25: {
                var5_3 /* !! */  = (int)ga.jefe("jetm", jefk(int ), (int)140);
                if (!var6_2) ** GOTO lbl245
                throw null;
            }
            case 26: 
        }
        var5_3 /* !! */  = (int)ga.jefe("jetn", jefk(int ), (int)141);
        ** while (!var6_2)
lbl319:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jezf() {
        ga.jefd[0] = -7168901611245703938L;
        ga.jefd[1] = 3368150904075575175L;
        ga.jefd[2] = 5809405106010858658L;
        ga.jefd[3] = -5270164824964495984L;
        ga.jefd[4] = 5609958950782803675L;
        ga.jefd[5] = -4430091857138554128L;
        ga.jefd[6] = 5040040385452042124L;
        ga.jefd[7] = 7255149931649632077L;
        ga.jefd[8] = -4546548693910065981L;
        ga.jefd[9] = -647046257516159719L;
        ga.jefd[10] = 2285679285381863399L;
        ga.jefd[11] = -266981155179053637L;
        ga.jefd[12] = 7547771947299128167L;
        ga.jefd[13] = 3742173159289121710L;
        ga.jefd[14] = 204351890315211959L;
        ga.jefd[15] = -2211792818990738977L;
        ga.jefd[16] = 8001885966028254462L;
        ga.jefd[17] = 2307608098258203989L;
        ga.jefd[18] = -4086258373412947176L;
        ga.jefd[19] = -2182586417179136993L;
        ga.jefd[20] = 159036304516405616L;
        ga.jefd[21] = 6200647257240610898L;
        ga.jefd[22] = 6020919170302541335L;
        ga.jefd[23] = 6364341062642648343L;
        ga.jefd[24] = 4975603069064293977L;
        ga.jefd[25] = 769585440676634697L;
        ga.jefd[26] = -5639259060654391239L;
        ga.jefd[27] = -6710465280139559254L;
        ga.jefd[28] = 6846667415670754021L;
        ga.jefd[29] = -6986677675388970461L;
        ga.jefd[30] = -375749814433888620L;
        ga.jefd[31] = 624771389128176195L;
        ga.jefd[32] = -1789730728458327490L;
        ga.jefd[33] = 6548863511846041625L;
        ga.jefd[34] = 6295437921576769954L;
        ga.jefd[35] = -5783167717628997709L;
        ga.jefd[36] = -7490028400144338812L;
        ga.jefd[37] = -3888046700544493667L;
        ga.jefd[38] = -4779684436033059414L;
        ga.jefd[39] = 7482558737872827602L;
        ga.jefd[40] = 3442440974771804896L;
        ga.jefd[41] = -5408887000849003863L;
        ga.jefd[42] = 5922552142158420728L;
    }

    private static /* synthetic */ void jeze() {
        ga.jefc[0] = 2324665830225605591L;
        ga.jefc[1] = 1902053004598984762L;
        ga.jefc[2] = 7943617487227497777L;
        ga.jefc[3] = 6107790403481424031L;
        ga.jefc[4] = -6974468926580328964L;
        ga.jefc[5] = -7670643430430603945L;
        ga.jefc[6] = 29564770438558924L;
        ga.jefc[7] = 7460982650413566206L;
        ga.jefc[8] = -1453740433244970035L;
        ga.jefc[9] = -1809649554805380359L;
        ga.jefc[10] = 2172451136701881481L;
        ga.jefc[11] = -3560257211990409290L;
        ga.jefc[12] = -4907498518421628247L;
        ga.jefc[13] = 6235299053812356631L;
        ga.jefc[14] = 4112601996280951179L;
        ga.jefc[15] = 6726147104545138036L;
        ga.jefc[16] = 2899969011319671276L;
        ga.jefc[17] = 6514839401503375688L;
        ga.jefc[18] = -8239196902638066984L;
        ga.jefc[19] = 1547978507695175319L;
        ga.jefc[20] = 5836670803729324225L;
        ga.jefc[21] = 5201892873572827265L;
        ga.jefc[22] = 323265660384749949L;
        ga.jefc[23] = -8485302288757715775L;
        ga.jefc[24] = 7264764524040778038L;
        ga.jefc[25] = 9019660807397492372L;
        ga.jefc[26] = 3568437740563645078L;
        ga.jefc[27] = -2945955628431770827L;
        ga.jefc[28] = 5556860589841323423L;
        ga.jefc[29] = 4174699722672614866L;
        ga.jefc[30] = 1579322212946766503L;
        ga.jefc[31] = -5035184572987455622L;
        ga.jefc[32] = 5052976998566367042L;
        ga.jefc[33] = 5255195904756805808L;
        ga.jefc[34] = -2898676556040957496L;
        ga.jefc[35] = -2037976874175210919L;
        ga.jefc[36] = -2413597686105996409L;
        ga.jefc[37] = -216129098993339532L;
        ga.jefc[38] = -8728361848782667793L;
        ga.jefc[39] = 3663619699109111857L;
        ga.jefc[40] = 9126032800397992235L;
        ga.jefc[41] = 3203440709099378267L;
        ga.jefc[42] = -2798598108589026859L;
    }

    private static /* synthetic */ void jezb() {
        ga.jefm[0] = -125189090;
        ga.jefm[1] = 1198222262;
        ga.jefm[2] = 859313233;
        ga.jefm[3] = -1391782129;
        ga.jefm[4] = -275466721;
        ga.jefm[5] = 1972640355;
        ga.jefm[6] = -108565632;
        ga.jefm[7] = 125866578;
        ga.jefm[8] = -532647693;
        ga.jefm[9] = 819398254;
        ga.jefm[10] = -518276948;
        ga.jefm[11] = -1192847830;
        ga.jefm[12] = 923723897;
        ga.jefm[13] = -450425389;
        ga.jefm[14] = 263824633;
        ga.jefm[15] = 817178415;
        ga.jefm[16] = 1278272966;
        ga.jefm[17] = -1786031708;
        ga.jefm[18] = 2042225025;
        ga.jefm[19] = 2109282364;
        ga.jefm[20] = -1265005538;
        ga.jefm[21] = -1718327737;
        ga.jefm[22] = 1927945954;
        ga.jefm[23] = -847724694;
        ga.jefm[24] = 1093402862;
        ga.jefm[25] = -1247670695;
        ga.jefm[26] = -1403619244;
        ga.jefm[27] = 2140833170;
        ga.jefm[28] = 738664191;
        ga.jefm[29] = -1290846257;
        ga.jefm[30] = -2133459971;
        ga.jefm[31] = -2052691441;
        ga.jefm[32] = 721201385;
        ga.jefm[33] = 1865865054;
        ga.jefm[34] = -1419320189;
        ga.jefm[35] = 1349877448;
        ga.jefm[36] = 2099556037;
        ga.jefm[37] = -360341988;
        ga.jefm[38] = 1310480355;
        ga.jefm[39] = 542023789;
        ga.jefm[40] = -1420485851;
        ga.jefm[41] = 754222439;
        ga.jefm[42] = -97992831;
        ga.jefm[43] = 1189080831;
        ga.jefm[44] = 1397791560;
        ga.jefm[45] = 361774341;
        ga.jefm[46] = 2125270399;
        ga.jefm[47] = 792251030;
        ga.jefm[48] = 587159178;
        ga.jefm[49] = -43939956;
        ga.jefm[50] = -2052684975;
        ga.jefm[51] = 937449566;
        ga.jefm[52] = 121055513;
        ga.jefm[53] = -1118047996;
        ga.jefm[54] = 702139793;
        ga.jefm[55] = 1113641954;
        ga.jefm[56] = 1472222701;
        ga.jefm[57] = 1227803594;
        ga.jefm[58] = 2134083855;
        ga.jefm[59] = -2107625332;
        ga.jefm[60] = -2086738951;
        ga.jefm[61] = -131164233;
        ga.jefm[62] = -1643936468;
        ga.jefm[63] = -2132619412;
        ga.jefm[64] = -327673186;
        ga.jefm[65] = 1883977600;
        ga.jefm[66] = -772188313;
        ga.jefm[67] = 1859996984;
        ga.jefm[68] = 1903087968;
        ga.jefm[69] = 1198102623;
        ga.jefm[70] = -1658973128;
        ga.jefm[71] = 17214611;
        ga.jefm[72] = -934770981;
        ga.jefm[73] = 196980723;
        ga.jefm[74] = -428850916;
        ga.jefm[75] = -433299310;
        ga.jefm[76] = -1973914889;
        ga.jefm[77] = -701762460;
        ga.jefm[78] = -662416399;
        ga.jefm[79] = -44172421;
        ga.jefm[80] = -1731393446;
        ga.jefm[81] = -1870155062;
        ga.jefm[82] = 668816259;
        ga.jefm[83] = 1247708623;
        ga.jefm[84] = -1261463266;
        ga.jefm[85] = 385214415;
        ga.jefm[86] = 0x7D66D66;
        ga.jefm[87] = 287687050;
        ga.jefm[88] = 1387074243;
        ga.jefm[89] = -1777172846;
        ga.jefm[90] = 1764726021;
        ga.jefm[91] = -853811800;
        ga.jefm[92] = 2000291175;
        ga.jefm[93] = 1760565710;
        ga.jefm[94] = -203653125;
        ga.jefm[95] = -94478869;
        ga.jefm[96] = -216831436;
        ga.jefm[97] = 283691835;
        ga.jefm[98] = -673803359;
        ga.jefm[99] = 473411759;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public ga() {
        block14: {
            var2_1 /* !! */  = ga.b;
            var1_2 = ga.a;
            super("NoSlowDown", "\u0423\u0441\u043a\u043e\u0440\u044f\u0435\u0442 \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u0435 \u0432\u043e \u0432\u0440\u0435\u043c\u044f \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u044f \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432", du.MOVEMENT);
            this.notifWatch = new pr();
            this.script = new od();
            this.itemMode = new kf("\u0420\u0435\u0436\u0438\u043c \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0440\u0435\u0436\u0438\u043c \u043e\u0431\u0445\u043e\u0434\u0430", "Grim Old", new String[]{"Grim Old", "Grim New", "ReallyWorld", "SpookyTime", "FunTime"});
            this.ticks = (int)ga.jefe("jefz", jefk(int ), (int)8);
            this.cycleCounter = (int)ga.jefe("jega", jefk(int ), (int)9);
            this.settings(new jx[]{this.itemMode});
            if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block11: do {
                switch (cfr_temp_0 == -2147483648 ? var2_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        return;
                    }
                    case 0: {
                        ** break;
                    }
                    case 4: {
                        var2_1 /* !! */  = (int)ga.jefe("jegf", jefk(int ), (int)14);
                        cfr_temp_0 = 1;
                        continue block11;
                    }
                    case 5: {
                        while (true) {
                            var2_1 /* !! */  = (int)ga.jefe("jegg", jefk(int ), (int)15);
                        }
                    }
                    case 6: {
                        var2_1 /* !! */  = (int)ga.jefe("jegh", jefk(int ), (int)16);
                    }
                    case 2: {
                        var2_1 /* !! */  = (int)ga.jefe("jegd", jefk(int ), (int)12);
                    }
                    case 3: {
                        var2_1 /* !! */  = (int)ga.jefe("jege", jefk(int ), (int)13);
                        cfr_temp_0 = 1;
                        continue block11;
                    }
                    case 8: {
                        break block14;
                    }
lbl36:
                    // 2 sources

                    while (true) {
                        cfr_temp_0 = 7;
                        var2_1 /* !! */  = (int)ga.jefe("jegb", jefk(int ), (int)10);
                        break;
                    }
                    case 7: {
                        var2_1 /* !! */  = (int)ga.jefe("jegi", jefk(int ), (int)17);
                    }
                    case 1: 
                }
                break;
            } while (true);
            var2_1 /* !! */  = (int)ga.jefe("jegc", jefk(int ), (int)11);
        }
        var2_1 /* !! */  = (int)ga.jefe("jegj", jefk(int ), (int)18);
        ** while (true)
    }

    private static /* synthetic */ void jeza() {
        ga.jefl[200] = -1933580215;
        ga.jefl[201] = 708320661;
        ga.jefl[202] = 478109088;
        ga.jefl[203] = 2146968497;
        ga.jefl[204] = -102484434;
        ga.jefl[205] = 540926893;
        ga.jefl[206] = -843686612;
        ga.jefl[207] = 1997943222;
        ga.jefl[208] = 1655718389;
        ga.jefl[209] = 1045542783;
        ga.jefl[210] = 2090810131;
        ga.jefl[211] = -489110488;
        ga.jefl[212] = -1133541096;
        ga.jefl[213] = 1381553490;
        ga.jefl[214] = 981822293;
        ga.jefl[215] = 1198126211;
        ga.jefl[216] = -1028361165;
        ga.jefl[217] = -1164493388;
        ga.jefl[218] = 1009390025;
        ga.jefl[219] = 710274110;
        ga.jefl[220] = 523098068;
        ga.jefl[221] = 163347107;
        ga.jefl[222] = 49220540;
        ga.jefl[223] = 1894313958;
        ga.jefl[224] = -1574065189;
        ga.jefl[225] = -1183927910;
        ga.jefl[226] = -2102362246;
        ga.jefl[227] = 2006165125;
        ga.jefl[228] = -403118475;
        ga.jefl[229] = -1765871046;
        ga.jefl[230] = 2041053794;
        ga.jefl[231] = -569039470;
        ga.jefl[232] = 1543747148;
        ga.jefl[233] = 624679711;
        ga.jefl[234] = -1043222253;
        ga.jefl[235] = -2111931555;
        ga.jefl[236] = -1648588353;
        ga.jefl[237] = 1762000712;
        ga.jefl[238] = -235093083;
        ga.jefl[239] = 589021816;
        ga.jefl[240] = -1111779537;
        ga.jefl[241] = -1600410768;
        ga.jefl[242] = -449414407;
        ga.jefl[243] = 1510671965;
        ga.jefl[244] = 1968431959;
        ga.jefl[245] = -1706560472;
        ga.jefl[246] = 2060940146;
        ga.jefl[247] = 537490145;
        ga.jefl[248] = 1759373569;
        ga.jefl[249] = -914674567;
        ga.jefl[250] = 896056098;
        ga.jefl[251] = 29596330;
        ga.jefl[252] = 904096599;
        ga.jefl[253] = -1139725684;
        ga.jefl[254] = -65588560;
        ga.jefl[255] = 1300092331;
        ga.jefl[256] = -1260974137;
        ga.jefl[257] = 1626079664;
        ga.jefl[258] = -1363077711;
        ga.jefl[259] = 1094056312;
        ga.jefl[260] = -1720071691;
        ga.jefl[261] = -292549463;
        ga.jefl[262] = 286441089;
        ga.jefl[263] = 1051719007;
        ga.jefl[264] = -658818405;
        ga.jefl[265] = 2077784329;
        ga.jefl[266] = -1159400121;
        ga.jefl[267] = -665644538;
        ga.jefl[268] = -1107197182;
        ga.jefl[269] = 1151970419;
        ga.jefl[270] = -1134534859;
        ga.jefl[271] = -1412049407;
        ga.jefl[272] = -409454303;
        ga.jefl[273] = -2097599565;
        ga.jefl[274] = -795941303;
        ga.jefl[275] = 1125309222;
        ga.jefl[276] = -238194164;
        ga.jefl[277] = -2560775;
        ga.jefl[278] = -1170397715;
        ga.jefl[279] = -398389085;
        ga.jefl[280] = 356457411;
        ga.jefl[281] = 1924017292;
    }

    private static /* synthetic */ void jezc() {
        ga.jefm[100] = -238575671;
        ga.jefm[101] = 2002576668;
        ga.jefm[102] = -846966062;
        ga.jefm[103] = -1151524827;
        ga.jefm[104] = 650100079;
        ga.jefm[105] = -1711808243;
        ga.jefm[106] = -263080556;
        ga.jefm[107] = -860591393;
        ga.jefm[108] = 1149697474;
        ga.jefm[109] = 1632029361;
        ga.jefm[110] = 1823405812;
        ga.jefm[111] = 1079295949;
        ga.jefm[112] = -219067537;
        ga.jefm[113] = 873235663;
        ga.jefm[114] = -324508197;
        ga.jefm[115] = -1232956815;
        ga.jefm[116] = -832102178;
        ga.jefm[117] = 1836203072;
        ga.jefm[118] = 40312667;
        ga.jefm[119] = -434102382;
        ga.jefm[120] = -945490441;
        ga.jefm[121] = -382498944;
        ga.jefm[122] = -1594835399;
        ga.jefm[123] = -370394364;
        ga.jefm[124] = 2138339018;
        ga.jefm[125] = 1459419982;
        ga.jefm[126] = -794831524;
        ga.jefm[127] = -1288382777;
        ga.jefm[128] = 201357958;
        ga.jefm[129] = 1236029289;
        ga.jefm[130] = -188619485;
        ga.jefm[131] = 61167431;
        ga.jefm[132] = -883568146;
        ga.jefm[133] = 1988322426;
        ga.jefm[134] = -1312049805;
        ga.jefm[135] = -588323363;
        ga.jefm[136] = -1310654064;
        ga.jefm[137] = -706001871;
        ga.jefm[138] = 1806744851;
        ga.jefm[139] = -331028581;
        ga.jefm[140] = 1439755068;
        ga.jefm[141] = -274432083;
        ga.jefm[142] = -411489738;
        ga.jefm[143] = 1667472456;
        ga.jefm[144] = 1500912308;
        ga.jefm[145] = -1842048992;
        ga.jefm[146] = -120102823;
        ga.jefm[147] = 129182121;
        ga.jefm[148] = -1275221600;
        ga.jefm[149] = 1882594738;
        ga.jefm[150] = -1355350193;
        ga.jefm[151] = -1065773310;
        ga.jefm[152] = 2053238468;
        ga.jefm[153] = -2010361690;
        ga.jefm[154] = 1791805337;
        ga.jefm[155] = 724729052;
        ga.jefm[156] = -782603148;
        ga.jefm[157] = 584552635;
        ga.jefm[158] = 1926230011;
        ga.jefm[159] = 1363897607;
        ga.jefm[160] = -273173946;
        ga.jefm[161] = -1962125612;
        ga.jefm[162] = -1216692149;
        ga.jefm[163] = 1626363618;
        ga.jefm[164] = -701553143;
        ga.jefm[165] = 1056109786;
        ga.jefm[166] = 368674187;
        ga.jefm[167] = -1551668263;
        ga.jefm[168] = 426108918;
        ga.jefm[169] = 933328865;
        ga.jefm[170] = -951307462;
        ga.jefm[171] = -66041810;
        ga.jefm[172] = -1136048603;
        ga.jefm[173] = 1601112201;
        ga.jefm[174] = 1049642470;
        ga.jefm[175] = 650273788;
        ga.jefm[176] = 1186362178;
        ga.jefm[177] = 1802661286;
        ga.jefm[178] = 342735622;
        ga.jefm[179] = 744689785;
        ga.jefm[180] = -1772456832;
        ga.jefm[181] = -275540701;
        ga.jefm[182] = 1035678214;
        ga.jefm[183] = -228358789;
        ga.jefm[184] = 684620492;
        ga.jefm[185] = -1196275933;
        ga.jefm[186] = -1877308766;
        ga.jefm[187] = 893109053;
        ga.jefm[188] = 226761542;
        ga.jefm[189] = -1411225752;
        ga.jefm[190] = -242183050;
        ga.jefm[191] = 1211059298;
        ga.jefm[192] = 1062738668;
        ga.jefm[193] = -1361024776;
        ga.jefm[194] = -986733610;
        ga.jefm[195] = -1491796935;
        ga.jefm[196] = -1076248168;
        ga.jefm[197] = 1793513469;
        ga.jefm[198] = -1877598245;
        ga.jefm[199] = 1020230977;
    }

    private static /* synthetic */ void jeyz() {
        ga.jefl[100] = -1530699346;
        ga.jefl[101] = 2002576669;
        ga.jefl[102] = -150430958;
        ga.jefl[103] = -1151524828;
        ga.jefl[104] = 1466587030;
        ga.jefl[105] = 1711808242;
        ga.jefl[106] = -439289996;
        ga.jefl[107] = -860591394;
        ga.jefl[108] = -324218646;
        ga.jefl[109] = 1632029360;
        ga.jefl[110] = 1936005223;
        ga.jefl[111] = 1079295948;
        ga.jefl[112] = -908587351;
        ga.jefl[113] = 873235662;
        ga.jefl[114] = 1497658717;
        ga.jefl[115] = -1232956812;
        ga.jefl[116] = -832102197;
        ga.jefl[117] = 1836203094;
        ga.jefl[118] = 40312649;
        ga.jefl[119] = -434102379;
        ga.jefl[120] = -945490448;
        ga.jefl[121] = -382498944;
        ga.jefl[122] = -1594835413;
        ga.jefl[123] = -370394362;
        ga.jefl[124] = 2138339020;
        ga.jefl[125] = 1459419998;
        ga.jefl[126] = -794831540;
        ga.jefl[127] = -1288382782;
        ga.jefl[128] = 201357969;
        ga.jefl[129] = 1236029285;
        ga.jefl[130] = -188619481;
        ga.jefl[131] = 61167437;
        ga.jefl[132] = -883568145;
        ga.jefl[133] = 1988322429;
        ga.jefl[134] = -1312049794;
        ga.jefl[135] = -588323371;
        ga.jefl[136] = -1310654072;
        ga.jefl[137] = -706001880;
        ga.jefl[138] = 1806744835;
        ga.jefl[139] = -331028578;
        ga.jefl[140] = 1439755065;
        ga.jefl[141] = -274432096;
        ga.jefl[142] = 411489737;
        ga.jefl[143] = 1667472456;
        ga.jefl[144] = 1500912309;
        ga.jefl[145] = -1842048990;
        ga.jefl[146] = -120102822;
        ga.jefl[147] = 129182125;
        ga.jefl[148] = -1275221599;
        ga.jefl[149] = 1882594738;
        ga.jefl[150] = -1355350194;
        ga.jefl[151] = -1065773310;
        ga.jefl[152] = 2053238469;
        ga.jefl[153] = -2010361689;
        ga.jefl[154] = 1791805337;
        ga.jefl[155] = 724729052;
        ga.jefl[156] = -782603210;
        ga.jefl[157] = 584552703;
        ga.jefl[158] = 1926229898;
        ga.jefl[159] = 1363897676;
        ga.jefl[160] = -273173953;
        ga.jefl[161] = -1962125642;
        ga.jefl[162] = -1216692131;
        ga.jefl[163] = 1626363612;
        ga.jefl[164] = -701553119;
        ga.jefl[165] = 1056109804;
        ga.jefl[166] = 368674181;
        ga.jefl[167] = -1551668256;
        ga.jefl[168] = 426108807;
        ga.jefl[169] = 933328890;
        ga.jefl[170] = -951307442;
        ga.jefl[171] = -66041763;
        ga.jefl[172] = -1136048618;
        ga.jefl[173] = 1601112199;
        ga.jefl[174] = 1049642437;
        ga.jefl[175] = 650273671;
        ga.jefl[176] = 1186362146;
        ga.jefl[177] = 1802661316;
        ga.jefl[178] = 342735631;
        ga.jefl[179] = 744689718;
        ga.jefl[180] = -1772456769;
        ga.jefl[181] = -275540698;
        ga.jefl[182] = 1035678323;
        ga.jefl[183] = -228358850;
        ga.jefl[184] = 684620450;
        ga.jefl[185] = -1196275848;
        ga.jefl[186] = -1877308800;
        ga.jefl[187] = 893109071;
        ga.jefl[188] = 226761575;
        ga.jefl[189] = -1411225753;
        ga.jefl[190] = -242183129;
        ga.jefl[191] = 1211059327;
        ga.jefl[192] = 1062738595;
        ga.jefl[193] = -1361024841;
        ga.jefl[194] = -986733687;
        ga.jefl[195] = -1491796928;
        ga.jefl[196] = -1076248072;
        ga.jefl[197] = 1793513456;
        ga.jefl[198] = -1877598231;
        ga.jefl[199] = 1020230915;
    }

    static {
        jefm = new int[282];
        ga.jeyy();
        ga.jeyz();
        ga.jeza();
        ga.jezb();
        ga.jezc();
        ga.jezd();
        jefc = new long[43];
        jefd = new long[43];
        ga.jeze();
        ga.jezf();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onUpdate(df var1_1) {
        block73: {
            block72: {
                var4_2 = ga.c;
                var3_3 /* !! */  = ga.b;
                var2_4 = ga.a;
                if (var4_2) {
                    throw null;
lbl6:
                    // 21 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl6
                if (ga.mc.field_1724 != null) break block72;
                if (var2_4) ** GOTO lbl6
                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl6
            if (this.itemMode.isSelected("ReallyWorld")) break block73;
            if (var2_4) ** GOTO lbl6
            if (!this.itemMode.isSelected("SpookyTime")) ** GOTO lbl41
            if (var2_4) ** GOTO lbl6
        }
        if (var2_4 || var2_4) ** GOTO lbl6
        if (ga.mc.field_1724.method_6123()) ** GOTO lbl55
        if (var2_4) ** GOTO lbl6
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl6
                if (!ga.mc.field_1724.method_6115()) ** GOTO lbl33
                if (var2_4 || var2_4) ** GOTO lbl6
                this.ticks += ga.jefe("jehy", jefk(int ), (int)59);
                if (var2_4) ** GOTO lbl6
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl55
lbl33:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                this.ticks = (int)ga.jefe("jehz", jefk(int ), (int)60);
                if (var2_4 || var2_4) ** GOTO lbl6
                this.cycleCounter = (int)ga.jefe("jeia", jefk(int ), (int)61);
                if (var2_4) ** GOTO lbl6
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl55
            }
lbl41:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl6
            if (ga.mc.field_1724.method_6058() == class_1268.field_5808) ** GOTO lbl46
            if (var2_4) ** GOTO lbl6
            if (ga.mc.field_1724.method_6058() != class_1268.field_5810) ** GOTO lbl52
            if (var2_4) ** GOTO lbl6
lbl46:
            // 2 sources

            if (var2_4 || var2_4) ** GOTO lbl6
            this.ticks += ga.jefe("jeib", jefk(int ), (int)62);
            if (var2_4) ** GOTO lbl6
            if (var4_2) {
                throw null;
            }
            ** GOTO lbl55
lbl52:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl6
            this.ticks = (int)ga.jefe("jeic", jefk(int ), (int)63);
            if (var2_4) ** GOTO lbl6
lbl55:
            // 5 sources

            if (!var2_4 && !var2_4) ** break;
            ** continue;
            return;
lbl58:
            // 4 sources

            case 0: {
                var3_3 /* !! */  = (int)ga.jefe("jeid", jefk(int ), (int)64);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl63:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)ga.jefe("jeie", jefk(int ), (int)65);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl68:
            // 3 sources

            case 2: {
                var3_3 /* !! */  = (int)ga.jefe("jeif", jefk(int ), (int)66);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 3: {
                var3_3 /* !! */  = (int)ga.jefe("jeig", jefk(int ), (int)67);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl156
            }
            case 4: {
                var3_3 /* !! */  = (int)ga.jefe("jeih", jefk(int ), (int)68);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl83:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)ga.jefe("jeii", jefk(int ), (int)69);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl160
            }
            case 6: {
                var3_3 /* !! */  = (int)ga.jefe("jeij", jefk(int ), (int)70);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 7: {
                var3_3 /* !! */  = (int)ga.jefe("jeik", jefk(int ), (int)71);
                if (!var4_2) ** GOTO lbl58
                throw null;
            }
lbl97:
            // 3 sources

            case 8: {
                var3_3 /* !! */  = (int)ga.jefe("jeil", jefk(int ), (int)72);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl208
            }
            case 9: {
                var3_3 /* !! */  = (int)ga.jefe("jeim", jefk(int ), (int)73);
                if (!var4_2) ** GOTO lbl58
                throw null;
            }
            case 10: {
                var3_3 /* !! */  = (int)ga.jefe("jein", jefk(int ), (int)74);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl203
            }
lbl111:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)ga.jefe("jeio", jefk(int ), (int)75);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 12: {
                var3_3 /* !! */  = (int)ga.jefe("jeip", jefk(int ), (int)76);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 13: {
                var3_3 /* !! */  = (int)ga.jefe("jeiq", jefk(int ), (int)77);
                if (!var4_2) ** GOTO lbl58
                throw null;
            }
            case 14: {
                var3_3 /* !! */  = (int)ga.jefe("jeir", jefk(int ), (int)78);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl156
            }
            case 15: {
                var3_3 /* !! */  = (int)ga.jefe("jeis", jefk(int ), (int)79);
                if (var4_2) {
                    throw null;
                }
            }
lbl134:
            // 5 sources

            case 16: {
                var3_3 /* !! */  = (int)ga.jefe("jeit", jefk(int ), (int)80);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 17: {
                var3_3 /* !! */  = (int)ga.jefe("jeiu", jefk(int ), (int)81);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl144:
            // 2 sources

            case 18: {
                var3_3 /* !! */  = (int)ga.jefe("jeiv", jefk(int ), (int)82);
                if (!var4_2) ** GOTO lbl68
                throw null;
            }
            case 19: {
                var3_3 /* !! */  = (int)ga.jefe("jeiw", jefk(int ), (int)83);
                if (!var4_2) ** GOTO lbl68
                throw null;
            }
lbl152:
            // 4 sources

            case 20: {
                var3_3 /* !! */  = (int)ga.jefe("jeix", jefk(int ), (int)84);
                if (!var4_2) ** GOTO lbl97
                throw null;
            }
lbl156:
            // 5 sources

            case 21: {
                var3_3 /* !! */  = (int)ga.jefe("jeiy", jefk(int ), (int)85);
                if (!var4_2) ** GOTO lbl97
                throw null;
            }
lbl160:
            // 2 sources

            case 22: {
                var3_3 /* !! */  = (int)ga.jefe("jeiz", jefk(int ), (int)86);
                if (!var4_2) ** GOTO lbl156
                throw null;
            }
lbl164:
            // 2 sources

            case 23: {
                var3_3 /* !! */  = (int)ga.jefe("jeja", jefk(int ), (int)87);
                if (!var4_2) ** GOTO lbl83
                throw null;
            }
            case 24: {
                var3_3 /* !! */  = (int)ga.jefe("jejb", jefk(int ), (int)88);
                if (!var4_2) ** GOTO lbl152
                throw null;
            }
lbl172:
            // 4 sources

            case 25: {
                var3_3 /* !! */  = (int)ga.jefe("jejc", jefk(int ), (int)89);
                if (!var4_2) ** GOTO lbl164
                throw null;
            }
            case 26: {
                var3_3 /* !! */  = (int)ga.jefe("jejd", jefk(int ), (int)90);
                if (!var4_2) ** GOTO lbl152
                throw null;
            }
            case 27: {
                var3_3 /* !! */  = (int)ga.jefe("jeje", jefk(int ), (int)91);
                if (!var4_2) ** GOTO lbl144
                throw null;
            }
            case 28: {
                var3_3 /* !! */  = (int)ga.jefe("jejf", jefk(int ), (int)92);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl189:
            // 4 sources

            case 29: {
                var3_3 /* !! */  = (int)ga.jefe("jejg", jefk(int ), (int)93);
                if (!var4_2) ** GOTO lbl111
                throw null;
            }
lbl193:
            // 2 sources

            case 30: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ga.jefe("jejh", jefk(int ), (int)94);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl208
                    break;
                }
            }
            case 31: {
                var3_3 /* !! */  = (int)ga.jefe("jeji", jefk(int ), (int)95);
                if (!var4_2) ** GOTO lbl172
                throw null;
            }
lbl203:
            // 2 sources

            case 32: {
                do {
                    var3_3 /* !! */  = (int)ga.jefe("jejj", jefk(int ), (int)96);
                } while (!var4_2);
                throw null;
            }
lbl208:
            // 3 sources

            case 33: {
                var3_3 /* !! */  = (int)ga.jefe("jejk", jefk(int ), (int)97);
                if (!var4_2) ** GOTO lbl63
                throw null;
            }
            case 34: 
        }
        var3_3 /* !! */  = (int)ga.jefe("jejl", jefk(int ), (int)98);
        ** while (!var4_2)
lbl215:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jezd() {
        ga.jefm[200] = -1933580244;
        ga.jefm[201] = 708320748;
        ga.jefm[202] = 478109117;
        ga.jefm[203] = 2146968560;
        ga.jefm[204] = -102484469;
        ga.jefm[205] = 540926954;
        ga.jefm[206] = -843686552;
        ga.jefm[207] = 1997943216;
        ga.jefm[208] = 1655718346;
        ga.jefm[209] = 1045542762;
        ga.jefm[210] = 2090810184;
        ga.jefm[211] = -489110487;
        ga.jefm[212] = -1133541081;
        ga.jefm[213] = 1381553434;
        ga.jefm[214] = 981822312;
        ga.jefm[215] = 1198126277;
        ga.jefm[216] = -1028361159;
        ga.jefm[217] = -1164493313;
        ga.jefm[218] = 1009390010;
        ga.jefm[219] = 710274160;
        ga.jefm[220] = 523098089;
        ga.jefm[221] = 163347166;
        ga.jefm[222] = 49220536;
        ga.jefm[223] = 1894313887;
        ga.jefm[224] = -1574065248;
        ga.jefm[225] = -1183927842;
        ga.jefm[226] = -2102362325;
        ga.jefm[227] = 2006165140;
        ga.jefm[228] = -403118527;
        ga.jefm[229] = -1765870998;
        ga.jefm[230] = 2041053769;
        ga.jefm[231] = -569039393;
        ga.jefm[232] = 1543747161;
        ga.jefm[233] = 624679772;
        ga.jefm[234] = -1043222267;
        ga.jefm[235] = -2111931609;
        ga.jefm[236] = -1648588395;
        ga.jefm[237] = 1762000727;
        ga.jefm[238] = -235093085;
        ga.jefm[239] = 589021738;
        ga.jefm[240] = -1111779468;
        ga.jefm[241] = -1600410765;
        ga.jefm[242] = -449414518;
        ga.jefm[243] = 1510671873;
        ga.jefm[244] = 1968431932;
        ga.jefm[245] = -1706560480;
        ga.jefm[246] = 2060940125;
        ga.jefm[247] = 537490088;
        ga.jefm[248] = 1759373617;
        ga.jefm[249] = -914674621;
        ga.jefm[250] = 896056139;
        ga.jefm[251] = 29596350;
        ga.jefm[252] = 904096516;
        ga.jefm[253] = -1139725659;
        ga.jefm[254] = -65588570;
        ga.jefm[255] = 1300092296;
        ga.jefm[256] = -1260974198;
        ga.jefm[257] = 1626079629;
        ga.jefm[258] = -1363077710;
        ga.jefm[259] = 1094056251;
        ga.jefm[260] = -1720071763;
        ga.jefm[261] = -292549462;
        ga.jefm[262] = 286441151;
        ga.jefm[263] = 1051719034;
        ga.jefm[264] = -658818393;
        ga.jefm[265] = 2077784375;
        ga.jefm[266] = -1159400070;
        ga.jefm[267] = -665644515;
        ga.jefm[268] = -1107197076;
        ga.jefm[269] = 1151970393;
        ga.jefm[270] = -1134534785;
        ga.jefm[271] = -1412049357;
        ga.jefm[272] = -409454233;
        ga.jefm[273] = -2097599542;
        ga.jefm[274] = -795941327;
        ga.jefm[275] = 1125309258;
        ga.jefm[276] = -238194071;
        ga.jefm[277] = -2560836;
        ga.jefm[278] = -1170397746;
        ga.jefm[279] = -398389011;
        ga.jefm[280] = 356457438;
        ga.jefm[281] = 1924017399;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleItemUse(dg var1_1, class_1268 var2_2, class_1268 var3_3) {
        var10_4 = ga.c;
        var9_5 /* !! */  = ga.b;
        var8_6 = ga.a;
        if (var9_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var10_4) {
                    throw null;
lbl9:
                    // 73 sources

                    return;
                }
                if (var8_6 || var8_6) ** GOTO lbl9
                var4_7 = this.itemMode.getValue();
                if (var8_6) ** GOTO lbl9
                var5_8 = ga.jefe("jeto", jefk(int ), (int)142);
                if (var8_6) ** GOTO lbl9
                switch (var4_7.hashCode()) {
                    case 389444054: {
                        if (var8_6 || var8_6) ** GOTO lbl9
                        if (!var4_7.equals("Grim Old")) break;
                        if (var8_6) ** GOTO lbl9
                        var5_8 = ga.jefe("jetp", jefk(int ), (int)143);
                        if (var8_6) ** GOTO lbl9
                        if (!var10_4) break;
                        throw null;
                    }
                    case 389442895: {
                        if (var8_6 || var8_6) ** GOTO lbl9
                        if (!var4_7.equals("Grim New")) break;
                        if (var8_6) ** GOTO lbl9
                        var5_8 = ga.jefe("jetq", jefk(int ), (int)144);
                        if (var8_6) ** GOTO lbl9
                        if (!var10_4) break;
                        throw null;
                    }
                    case 935423623: {
                        if (var8_6 || var8_6) ** GOTO lbl9
                        if (!var4_7.equals("ReallyWorld")) break;
                        if (var8_6) ** GOTO lbl9
                        var5_8 = ga.jefe("jetr", jefk(int ), (int)145);
                        if (var8_6) ** GOTO lbl9
                        if (!var10_4) break;
                        throw null;
                    }
                    case -912404296: {
                        if (var8_6 || var8_6) ** GOTO lbl9
                        if (!var4_7.equals("SpookyTime")) break;
                        if (var8_6) ** GOTO lbl9
                        var5_8 = ga.jefe("jets", jefk(int ), (int)146);
                        if (var8_6) ** GOTO lbl9
                        if (!var10_4) break;
                        throw null;
                    }
                    case 1154553036: {
                        if (var8_6 || var8_6) ** GOTO lbl9
                        if (!var4_7.equals("FunTime")) break;
                        if (var8_6) ** GOTO lbl9
                        var5_8 = ga.jefe("jett", jefk(int ), (int)147);
                        if (var8_6) ** break;
                    }
                }
                if (var8_6 || var8_6) ** GOTO lbl9
                switch (var5_8) {
                    case 0: {
                        if (var8_6 || var8_6) ** GOTO lbl9
                        if (ga.mc.field_1724.method_6079().method_7976().equals((Object)class_1839.field_8952)) ** GOTO lbl63
                        if (var8_6) ** GOTO lbl9
                        if (!ga.mc.field_1724.method_6047().method_7976().equals((Object)class_1839.field_8952)) break;
                        if (var8_6) ** GOTO lbl9
lbl63:
                        // 2 sources

                        if (var8_6 || var8_6) ** GOTO lbl9
                        pn.interactItem(var2_2);
                        if (var8_6 || var8_6) ** GOTO lbl9
                        pn.interactItem(var3_3);
                        if (var8_6 || var8_6) ** GOTO lbl9
                        var1_1.cancel();
                        if (var8_6) ** GOTO lbl9
                        if (!var10_4) break;
                        throw null;
                    }
                    case 1: {
                        if (var8_6 || var8_6) ** GOTO lbl9
                        if (ga.mc.field_1724.method_6048() != ga.jefe("jetu", jefk(int ), (int)148)) ** GOTO lbl80
                        if (var8_6) ** GOTO lbl9
                        if (ga.mc.field_1724.method_6058() != class_1268.field_5808) ** GOTO lbl80
                        if (var8_6 || var8_6) ** GOTO lbl9
                        ga.mc.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12970, class_2338.field_10980, ga.mc.field_1724.method_5735()));
                        if (var8_6) ** GOTO lbl9
lbl80:
                        // 3 sources

                        if (var8_6 || var8_6) ** GOTO lbl9
                        if (ga.mc.field_1724.method_6048() <= 0) break;
                        if (var8_6 || var8_6) ** GOTO lbl9
                        var1_1.cancel();
                        if (var8_6) ** GOTO lbl9
                        if (!var10_4) break;
                        throw null;
                    }
                    case 2: {
                        if (var8_6 || var8_6) ** GOTO lbl9
                        if (!ga.mc.field_1724.method_70673()) ** GOTO lbl96
                        if (var8_6 || var8_6) ** GOTO lbl9
                        var6_9 = new int[]{2, 2, 2};
                        if (var8_6 || var8_6) ** GOTO lbl9
                        if (var10_4) {
                            throw null;
                        }
                        ** GOTO lbl99
lbl96:
                        // 1 sources

                        if (var8_6 || var8_6) ** GOTO lbl9
                        var6_9 = new int[]{2, 3, 3};
                        if (var8_6) ** GOTO lbl9
lbl99:
                        // 2 sources

                        if (var8_6 || var8_6) ** GOTO lbl9
                        var7_12 = var6_9[this.cycleCounter % var6_9.length];
                        if (var8_6 || var8_6) ** GOTO lbl9
                        if (this.ticks < var7_12) ** GOTO lbl110
                        if (var8_6 || var8_6) ** GOTO lbl9
                        var1_1.cancel();
                        if (var8_6 || var8_6) ** GOTO lbl9
                        this.ticks = (int)ga.jefe("jetv", jefk(int ), (int)149);
                        if (var8_6 || var8_6) ** GOTO lbl9
                        this.cycleCounter += ga.jefe("jetw", jefk(int ), (int)150);
                        if (var8_6) ** GOTO lbl9
lbl110:
                        // 2 sources

                        if (var8_6 || var8_6) ** GOTO lbl9
                        if (!var10_4) break;
                        throw null;
                    }
                    case 3: {
                        if (var8_6 || var8_6) ** GOTO lbl9
                        var6_10 = new int[]{2, 2, 2};
                        if (var8_6 || var8_6) ** GOTO lbl9
                        var7_13 = var6_10[this.cycleCounter % 2];
                        if (var8_6 || var8_6) ** GOTO lbl9
                        if (this.ticks < var7_13) ** GOTO lbl127
                        if (var8_6 || var8_6) ** GOTO lbl9
                        var1_1.cancel();
                        if (var8_6 || var8_6) ** GOTO lbl9
                        this.ticks = (int)ga.jefe("jetx", jefk(int ), (int)151);
                        if (var8_6 || var8_6) ** GOTO lbl9
                        this.cycleCounter += ga.jefe("jety", jefk(int ), (int)152);
                        if (var8_6) ** GOTO lbl9
lbl127:
                        // 2 sources

                        if (var8_6 || var8_6) ** GOTO lbl9
                        if (!var10_4) break;
                        throw null;
                    }
                    case 4: {
                        if (var8_6 || var8_6) ** GOTO lbl9
                        if (!((float)this.ticks > 0.0f)) break;
                        if (var8_6) ** GOTO lbl9
                        if (!((float)ga.mc.field_1724.method_6048() > 1.0f)) break;
                        if (var8_6 || var8_6) ** GOTO lbl9
                        var6_11 = ga.mc.field_1724.method_6047().method_7909() instanceof class_1764;
                        if (var8_6 || var8_6) ** GOTO lbl9
                        var7_14 = ga.mc.field_1724.method_6079().method_7909() instanceof class_1764;
                        if (var8_6 || var8_6) ** GOTO lbl9
                        if (var6_11) ** GOTO lbl144
                        if (var8_6) ** GOTO lbl9
                        if (!var7_14) ** GOTO lbl155
                        if (var8_6) ** GOTO lbl9
lbl144:
                        // 2 sources

                        if (var8_6 || var8_6) ** GOTO lbl9
                        if (!((float)this.ticks > 0.0f)) break;
                        if (var8_6) ** GOTO lbl9
                        if (ga.mc.field_1724.method_6048() <= ga.jefe("jetz", jefk(int ), (int)153)) break;
                        if (var8_6 || var8_6) ** GOTO lbl9
                        var1_1.cancel();
                        if (var8_6 || var8_6) ** GOTO lbl9
                        this.ticks = (int)ga.jefe("jeua", jefk(int ), (int)154);
                        if (var8_6) ** GOTO lbl9
                        if (!var10_4) break;
                        throw null;
lbl155:
                        // 1 sources

                        if (var8_6 || var8_6) ** GOTO lbl9
                        if (!ga.mc.field_1724.method_24828()) break;
                        if (var8_6) ** GOTO lbl9
                        if (!this.isOnSnowOrCarpet()) break;
                        if (var8_6 || var8_6) ** GOTO lbl9
                        ga.mc.field_1724.field_3944.method_52787((class_2596)new class_2846(class_2846.class_2847.field_12971, ga.mc.field_1724.method_24515().method_10084(), class_2350.field_11033));
                        if (var8_6 || var8_6) ** GOTO lbl9
                        ga.mc.field_1724.method_18800(ga.mc.field_1724.method_18798().field_1352, ga.mc.field_1724.method_18798().field_1351, ga.mc.field_1724.method_18798().field_1350);
                        if (var8_6 || var8_6) ** GOTO lbl9
                        var1_1.cancel();
                        if (var8_6 || var8_6) ** GOTO lbl9
                        this.ticks = (int)ga.jefe("jeub", jefk(int ), (int)155);
                        if (var8_6) ** break;
                    }
                }
                if (!var8_6 && !var8_6) ** break;
                ** continue;
                return;
            }
            case 0: {
                var9_5 /* !! */  = (int)ga.jefe("jeuc", jefk(int ), (int)156);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl468
            }
lbl176:
            // 3 sources

            case 1: {
                var9_5 /* !! */  = (int)ga.jefe("jeud", jefk(int ), (int)157);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl487
            }
            case 2: {
                var9_5 /* !! */  = (int)ga.jefe("jeue", jefk(int ), (int)158);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl302
            }
lbl186:
            // 4 sources

            case 3: {
                var9_5 /* !! */  = (int)ga.jefe("jeuf", jefk(int ), (int)159);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl599
            }
lbl191:
            // 2 sources

            case 4: {
                var9_5 /* !! */  = (int)ga.jefe("jeug", jefk(int ), (int)160);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl525
            }
lbl196:
            // 3 sources

            case 5: {
                var9_5 /* !! */  = (int)ga.jefe("jeuh", jefk(int ), (int)161);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl682
            }
            case 6: {
                var9_5 /* !! */  = (int)ga.jefe("jeui", jefk(int ), (int)162);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl682
            }
lbl206:
            // 2 sources

            case 7: {
                var9_5 /* !! */  = (int)ga.jefe("jeuj", jefk(int ), (int)163);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl658
            }
            case 8: {
                var9_5 /* !! */  = (int)ga.jefe("jeuk", jefk(int ), (int)164);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl463
            }
            case 9: {
                var9_5 /* !! */  = (int)ga.jefe("jeul", jefk(int ), (int)165);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl369
            }
lbl221:
            // 2 sources

            case 10: {
                var9_5 /* !! */  = (int)ga.jefe("jeum", jefk(int ), (int)166);
                if (!var10_4) break;
                throw null;
            }
lbl225:
            // 2 sources

            case 11: {
                var9_5 /* !! */  = (int)ga.jefe("jeun", jefk(int ), (int)167);
                if (!var10_4) ** GOTO lbl176
                throw null;
            }
            case 12: {
                var9_5 /* !! */  = (int)ga.jefe("jeuo", jefk(int ), (int)168);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl727
            }
lbl234:
            // 4 sources

            case 13: {
                var9_5 /* !! */  = (int)ga.jefe("jeup", jefk(int ), (int)169);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl595
            }
lbl239:
            // 2 sources

            case 14: {
                var9_5 /* !! */  = (int)ga.jefe("jeuq", jefk(int ), (int)170);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl633
            }
            case 15: {
                var9_5 /* !! */  = (int)ga.jefe("jeur", jefk(int ), (int)171);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl302
            }
lbl249:
            // 3 sources

            case 16: {
                var9_5 /* !! */  = (int)ga.jefe("jeus", jefk(int ), (int)172);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl312
            }
lbl254:
            // 3 sources

            case 17: {
                var9_5 /* !! */  = (int)ga.jefe("jeut", jefk(int ), (int)173);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl538
            }
lbl259:
            // 2 sources

            case 18: {
                var9_5 /* !! */  = (int)ga.jefe("jeuu", jefk(int ), (int)174);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl723
            }
            case 19: {
                var9_5 /* !! */  = (int)ga.jefe("jeuv", jefk(int ), (int)175);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl649
            }
lbl269:
            // 2 sources

            case 20: {
                var9_5 /* !! */  = (int)ga.jefe("jeuw", jefk(int ), (int)176);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl327
            }
lbl274:
            // 3 sources

            case 21: {
                var9_5 /* !! */  = (int)ga.jefe("jeux", jefk(int ), (int)177);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl662
            }
lbl279:
            // 2 sources

            case 22: {
                var9_5 /* !! */  = (int)ga.jefe("jeuy", jefk(int ), (int)178);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl459
            }
            case 23: {
                var9_5 /* !! */  = (int)ga.jefe("jeuz", jefk(int ), (int)179);
                if (!var10_4) ** GOTO lbl234
                throw null;
            }
            case 24: {
                var9_5 /* !! */  = (int)ga.jefe("jeva", jefk(int ), (int)180);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl455
            }
lbl293:
            // 3 sources

            case 25: {
                var9_5 /* !! */  = (int)ga.jefe("jevb", jefk(int ), (int)181);
                if (!var10_4) ** GOTO lbl239
                throw null;
            }
            case 26: {
                var9_5 /* !! */  = (int)ga.jefe("jevc", jefk(int ), (int)182);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl427
            }
lbl302:
            // 6 sources

            case 27: {
                var9_5 /* !! */  = (int)ga.jefe("jevd", jefk(int ), (int)183);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl678
            }
            case 28: {
                var9_5 /* !! */  = (int)ga.jefe("jeve", jefk(int ), (int)184);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl369
            }
lbl312:
            // 2 sources

            case 29: {
                var9_5 /* !! */  = (int)ga.jefe("jevf", jefk(int ), (int)185);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl388
            }
lbl317:
            // 2 sources

            case 30: {
                var9_5 /* !! */  = (int)ga.jefe("jevg", jefk(int ), (int)186);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl354
            }
            case 31: {
                var9_5 /* !! */  = (int)ga.jefe("jevh", jefk(int ), (int)187);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl658
            }
lbl327:
            // 2 sources

            case 32: {
                var9_5 /* !! */  = (int)ga.jefe("jevi", jefk(int ), (int)188);
                if (!var10_4) ** GOTO lbl274
                throw null;
            }
            case 33: {
                var9_5 /* !! */  = (int)ga.jefe("jevj", jefk(int ), (int)189);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl378
            }
            case 34: {
                var9_5 /* !! */  = (int)ga.jefe("jevk", jefk(int ), (int)190);
                if (!var10_4) ** GOTO lbl302
                throw null;
            }
lbl340:
            // 2 sources

            case 35: {
                var9_5 /* !! */  = (int)ga.jefe("jevl", jefk(int ), (int)191);
                if (!var10_4) ** GOTO lbl293
                throw null;
            }
            case 36: {
                var9_5 /* !! */  = (int)ga.jefe("jevm", jefk(int ), (int)192);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl649
            }
            case 37: {
                var9_5 /* !! */  = (int)ga.jefe("jevn", jefk(int ), (int)193);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl678
            }
lbl354:
            // 2 sources

            case 38: {
                var9_5 /* !! */  = (int)ga.jefe("jevo", jefk(int ), (int)194);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl504
            }
lbl359:
            // 2 sources

            case 39: {
                var9_5 /* !! */  = (int)ga.jefe("jevp", jefk(int ), (int)195);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl702
            }
            case 40: {
                var9_5 /* !! */  = (int)ga.jefe("jevq", jefk(int ), (int)196);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl520
            }
lbl369:
            // 4 sources

            case 41: {
                var9_5 /* !! */  = (int)ga.jefe("jevr", jefk(int ), (int)197);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl582
            }
            case 42: {
                var9_5 /* !! */  = (int)ga.jefe("jevs", jefk(int ), (int)198);
                if (!var10_4) ** GOTO lbl254
                throw null;
            }
lbl378:
            // 2 sources

            case 43: {
                var9_5 /* !! */  = (int)ga.jefe("jevt", jefk(int ), (int)199);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl604
            }
lbl383:
            // 2 sources

            case 44: {
                var9_5 /* !! */  = (int)ga.jefe("jevu", jefk(int ), (int)200);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl637
            }
lbl388:
            // 3 sources

            case 45: {
                var9_5 /* !! */  = (int)ga.jefe("jevv", jefk(int ), (int)201);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl547
            }
lbl393:
            // 2 sources

            case 46: {
                var9_5 /* !! */  = (int)ga.jefe("jevw", jefk(int ), (int)202);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl595
            }
            case 47: {
                var9_5 /* !! */  = (int)ga.jefe("jevx", jefk(int ), (int)203);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl408
            }
lbl403:
            // 2 sources

            case 48: {
                var9_5 /* !! */  = (int)ga.jefe("jevy", jefk(int ), (int)204);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl413
            }
lbl408:
            // 4 sources

            case 49: {
                var9_5 /* !! */  = (int)ga.jefe("jevz", jefk(int ), (int)205);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl678
            }
lbl413:
            // 3 sources

            case 50: {
                var9_5 /* !! */  = (int)ga.jefe("jewa", jefk(int ), (int)206);
                if (!var10_4) ** GOTO lbl393
                throw null;
            }
            case 51: {
                var9_5 /* !! */  = (int)ga.jefe("jewb", jefk(int ), (int)207);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl702
            }
lbl422:
            // 4 sources

            case 52: {
                var9_5 /* !! */  = (int)ga.jefe("jewc", jefk(int ), (int)208);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl621
            }
lbl427:
            // 2 sources

            case 53: {
                var9_5 /* !! */  = (int)ga.jefe("jewd", jefk(int ), (int)209);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl468
            }
            case 54: {
                var9_5 /* !! */  = (int)ga.jefe("jewe", jefk(int ), (int)210);
                if (!var10_4) ** GOTO lbl221
                throw null;
            }
            case 55: {
                var9_5 /* !! */  = (int)ga.jefe("jewf", jefk(int ), (int)211);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl637
            }
            case 56: {
                var9_5 /* !! */  = (int)ga.jefe("jewg", jefk(int ), (int)212);
                if (!var10_4) ** GOTO lbl413
                throw null;
            }
            case 57: {
                var9_5 /* !! */  = (int)ga.jefe("jewh", jefk(int ), (int)213);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl578
            }
            case 58: {
                var9_5 /* !! */  = (int)ga.jefe("jewi", jefk(int ), (int)214);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl574
            }
lbl455:
            // 2 sources

            case 59: {
                var9_5 /* !! */  = (int)ga.jefe("jewj", jefk(int ), (int)215);
                if (!var10_4) ** GOTO lbl359
                throw null;
            }
lbl459:
            // 2 sources

            case 60: {
                var9_5 /* !! */  = (int)ga.jefe("jewk", jefk(int ), (int)216);
                if (!var10_4) ** GOTO lbl186
                throw null;
            }
lbl463:
            // 3 sources

            case 61: {
                var9_5 /* !! */  = (int)ga.jefe("jewl", jefk(int ), (int)217);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl707
            }
lbl468:
            // 3 sources

            case 62: {
                var9_5 /* !! */  = (int)ga.jefe("jewm", jefk(int ), (int)218);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl569
            }
lbl473:
            // 2 sources

            case 63: {
                var9_5 /* !! */  = (int)ga.jefe("jewn", jefk(int ), (int)219);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl662
            }
            case 64: {
                var9_5 /* !! */  = (int)ga.jefe("jewo", jefk(int ), (int)220);
                if (!var10_4) ** GOTO lbl302
                throw null;
            }
            case 65: {
                var9_5 /* !! */  = (int)ga.jefe("jewp", jefk(int ), (int)221);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl612
            }
lbl487:
            // 3 sources

            case 66: {
                var9_5 /* !! */  = (int)ga.jefe("jewq", jefk(int ), (int)222);
                if (!var10_4) ** GOTO lbl225
                throw null;
            }
            case 67: {
                var9_5 /* !! */  = (int)ga.jefe("jewr", jefk(int ), (int)223);
                if (!var10_4) ** GOTO lbl422
                throw null;
            }
            case 68: {
                var9_5 /* !! */  = (int)ga.jefe("jews", jefk(int ), (int)224);
                if (!var10_4) ** GOTO lbl408
                throw null;
            }
            case 69: {
                var9_5 /* !! */  = (int)ga.jefe("jewt", jefk(int ), (int)225);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl604
            }
lbl504:
            // 3 sources

            case 70: {
                var9_5 /* !! */  = (int)ga.jefe("jewu", jefk(int ), (int)226);
                if (!var10_4) ** GOTO lbl249
                throw null;
            }
lbl508:
            // 2 sources

            case 71: {
                var9_5 /* !! */  = (int)ga.jefe("jewv", jefk(int ), (int)227);
                if (var10_4) {
                    throw null;
                }
            }
lbl512:
            // 4 sources

            case 72: {
                var9_5 /* !! */  = (int)ga.jefe("jeww", jefk(int ), (int)228);
                if (!var10_4) ** GOTO lbl388
                throw null;
            }
            case 73: {
                var9_5 /* !! */  = (int)ga.jefe("jewx", jefk(int ), (int)229);
                if (!var10_4) ** GOTO lbl259
                throw null;
            }
lbl520:
            // 2 sources

            case 74: {
                var9_5 /* !! */  = (int)ga.jefe("jewy", jefk(int ), (int)230);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl719
            }
lbl525:
            // 2 sources

            case 75: {
                var9_5 /* !! */  = (int)ga.jefe("jewz", jefk(int ), (int)231);
                if (!var10_4) ** GOTO lbl196
                throw null;
            }
            case 76: {
                var9_5 /* !! */  = (int)ga.jefe("jexa", jefk(int ), (int)232);
                if (!var10_4) ** GOTO lbl403
                throw null;
            }
            case 77: {
                var9_5 /* !! */  = (int)ga.jefe("jexb", jefk(int ), (int)233);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl649
            }
lbl538:
            // 2 sources

            case 78: {
                var9_5 /* !! */  = (int)ga.jefe("jexc", jefk(int ), (int)234);
                if (!var10_4) ** GOTO lbl206
                throw null;
            }
            case 79: {
                var9_5 /* !! */  = (int)ga.jefe("jexd", jefk(int ), (int)235);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl621
            }
lbl547:
            // 2 sources

            case 80: {
                var9_5 /* !! */  = (int)ga.jefe("jexe", jefk(int ), (int)236);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl678
            }
lbl552:
            // 2 sources

            case 81: {
                var9_5 /* !! */  = (int)ga.jefe("jexf", jefk(int ), (int)237);
                if (!var10_4) ** GOTO lbl408
                throw null;
            }
            case 82: {
                var9_5 /* !! */  = (int)ga.jefe("jexg", jefk(int ), (int)238);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl686
            }
lbl561:
            // 2 sources

            case 83: {
                var9_5 /* !! */  = (int)ga.jefe("jexh", jefk(int ), (int)239);
                if (!var10_4) ** GOTO lbl473
                throw null;
            }
            case 84: {
                var9_5 /* !! */  = (int)ga.jefe("jexi", jefk(int ), (int)240);
                if (!var10_4) ** GOTO lbl422
                throw null;
            }
lbl569:
            // 3 sources

            case 85: {
                var9_5 /* !! */  = (int)ga.jefe("jexj", jefk(int ), (int)241);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl670
            }
lbl574:
            // 2 sources

            case 86: {
                var9_5 /* !! */  = (int)ga.jefe("jexk", jefk(int ), (int)242);
                if (!var10_4) ** GOTO lbl196
                throw null;
            }
lbl578:
            // 2 sources

            case 87: {
                var9_5 /* !! */  = (int)ga.jefe("jexl", jefk(int ), (int)243);
                if (!var10_4) ** GOTO lbl269
                throw null;
            }
lbl582:
            // 3 sources

            case 88: {
                var9_5 /* !! */  = (int)ga.jefe("jexm", jefk(int ), (int)244);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl595
            }
            case 89: {
                var9_5 /* !! */  = (int)ga.jefe("jexn", jefk(int ), (int)245);
                if (!var10_4) ** GOTO lbl508
                throw null;
            }
            case 90: {
                var9_5 /* !! */  = (int)ga.jefe("jexo", jefk(int ), (int)246);
                if (!var10_4) ** GOTO lbl369
                throw null;
            }
lbl595:
            // 4 sources

            case 91: {
                var9_5 /* !! */  = (int)ga.jefe("jexp", jefk(int ), (int)247);
                if (!var10_4) ** GOTO lbl186
                throw null;
            }
lbl599:
            // 2 sources

            case 92: {
                var9_5 /* !! */  = (int)ga.jefe("jexq", jefk(int ), (int)248);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl637
            }
lbl604:
            // 5 sources

            case 93: {
                var9_5 /* !! */  = (int)ga.jefe("jexr", jefk(int ), (int)249);
                if (!var10_4) ** GOTO lbl176
                throw null;
            }
            case 94: {
                var9_5 /* !! */  = (int)ga.jefe("jexs", jefk(int ), (int)250);
                if (!var10_4) ** GOTO lbl186
                throw null;
            }
lbl612:
            // 3 sources

            case 95: {
                var9_5 /* !! */  = (int)ga.jefe("jext", jefk(int ), (int)251);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl629
            }
            case 96: {
                var9_5 /* !! */  = (int)ga.jefe("jexu", jefk(int ), (int)252);
                if (!var10_4) ** GOTO lbl191
                throw null;
            }
lbl621:
            // 3 sources

            case 97: {
                var9_5 /* !! */  = (int)ga.jefe("jexv", jefk(int ), (int)253);
                if (!var10_4) ** GOTO lbl234
                throw null;
            }
            case 98: {
                var9_5 /* !! */  = (int)ga.jefe("jexw", jefk(int ), (int)254);
                if (!var10_4) ** GOTO lbl504
                throw null;
            }
lbl629:
            // 3 sources

            case 99: {
                var9_5 /* !! */  = (int)ga.jefe("jexx", jefk(int ), (int)255);
                if (!var10_4) ** GOTO lbl274
                throw null;
            }
lbl633:
            // 2 sources

            case 100: {
                var9_5 /* !! */  = (int)ga.jefe("jexy", jefk(int ), (int)256);
                if (!var10_4) ** GOTO lbl604
                throw null;
            }
lbl637:
            // 5 sources

            case 101: {
                var9_5 /* !! */  = (int)ga.jefe("jexz", jefk(int ), (int)257);
                if (!var10_4) ** GOTO lbl422
                throw null;
            }
            case 102: {
                var9_5 /* !! */  = (int)ga.jefe("jeya", jefk(int ), (int)258);
                if (!var10_4) ** GOTO lbl234
                throw null;
            }
            case 103: {
                var9_5 /* !! */  = (int)ga.jefe("jeyb", jefk(int ), (int)259);
                if (!var10_4) ** GOTO lbl612
                throw null;
            }
lbl649:
            // 4 sources

            case 104: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_5 /* !! */  = (int)ga.jefe("jeyc", jefk(int ), (int)260);
                    if (!var10_4) ** GOTO lbl383
                    throw null;
                }
            }
            case 105: {
                var9_5 /* !! */  = (int)ga.jefe("jeyd", jefk(int ), (int)261);
                if (!var10_4) ** GOTO lbl561
                throw null;
            }
lbl658:
            // 3 sources

            case 106: {
                var9_5 /* !! */  = (int)ga.jefe("jeye", jefk(int ), (int)262);
                if (!var10_4) ** GOTO lbl487
                throw null;
            }
lbl662:
            // 3 sources

            case 107: {
                var9_5 /* !! */  = (int)ga.jefe("jeyf", jefk(int ), (int)263);
                if (!var10_4) ** GOTO lbl552
                throw null;
            }
lbl666:
            // 2 sources

            case 108: {
                var9_5 /* !! */  = (int)ga.jefe("jeyg", jefk(int ), (int)264);
                if (!var10_4) ** GOTO lbl637
                throw null;
            }
lbl670:
            // 3 sources

            case 109: {
                var9_5 /* !! */  = (int)ga.jefe("jeyh", jefk(int ), (int)265);
                if (!var10_4) ** GOTO lbl293
                throw null;
            }
            case 110: {
                var9_5 /* !! */  = (int)ga.jefe("jeyi", jefk(int ), (int)266);
                if (!var10_4) ** GOTO lbl463
                throw null;
            }
lbl678:
            // 5 sources

            case 111: {
                var9_5 /* !! */  = (int)ga.jefe("jeyj", jefk(int ), (int)267);
                if (!var10_4) ** GOTO lbl582
                throw null;
            }
lbl682:
            // 3 sources

            case 112: {
                var9_5 /* !! */  = (int)ga.jefe("jeyk", jefk(int ), (int)268);
                if (!var10_4) ** GOTO lbl317
                throw null;
            }
lbl686:
            // 2 sources

            case 113: {
                var9_5 /* !! */  = (int)ga.jefe("jeyl", jefk(int ), (int)269);
                if (!var10_4) ** GOTO lbl670
                throw null;
            }
            case 114: {
                var9_5 /* !! */  = (int)ga.jefe("jeym", jefk(int ), (int)270);
                if (!var10_4) ** GOTO lbl512
                throw null;
            }
            case 115: {
                var9_5 /* !! */  = (int)ga.jefe("jeyn", jefk(int ), (int)271);
                if (!var10_4) ** GOTO lbl302
                throw null;
            }
            case 116: {
                var9_5 /* !! */  = (int)ga.jefe("jeyo", jefk(int ), (int)272);
                if (!var10_4) ** GOTO lbl629
                throw null;
            }
lbl702:
            // 3 sources

            case 117: {
                var9_5 /* !! */  = (int)ga.jefe("jeyp", jefk(int ), (int)273);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl711
            }
lbl707:
            // 2 sources

            case 118: {
                var9_5 /* !! */  = (int)ga.jefe("jeyq", jefk(int ), (int)274);
                if (!var10_4) ** GOTO lbl249
                throw null;
            }
lbl711:
            // 2 sources

            case 119: {
                var9_5 /* !! */  = (int)ga.jefe("jeyr", jefk(int ), (int)275);
                if (!var10_4) ** GOTO lbl604
                throw null;
            }
            case 120: {
                var9_5 /* !! */  = (int)ga.jefe("jeys", jefk(int ), (int)276);
                if (!var10_4) ** GOTO lbl279
                throw null;
            }
lbl719:
            // 2 sources

            case 121: {
                var9_5 /* !! */  = (int)ga.jefe("jeyt", jefk(int ), (int)277);
                if (!var10_4) ** GOTO lbl569
                throw null;
            }
lbl723:
            // 2 sources

            case 122: {
                var9_5 /* !! */  = (int)ga.jefe("jeyu", jefk(int ), (int)278);
                if (!var10_4) ** GOTO lbl340
                throw null;
            }
lbl727:
            // 2 sources

            case 123: {
                var9_5 /* !! */  = (int)ga.jefe("jeyv", jefk(int ), (int)279);
                if (!var10_4) ** GOTO lbl254
                throw null;
            }
            case 124: {
                var9_5 /* !! */  = (int)ga.jefe("jeyw", jefk(int ), (int)280);
                if (!var10_4) ** GOTO lbl666
                throw null;
            }
            case 125: 
        }
        var9_5 /* !! */  = (int)ga.jefe("jeyx", jefk(int ), (int)281);
        ** while (!var10_4)
lbl738:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jeyy() {
        ga.jefl[0] = -125189089;
        ga.jefl[1] = 816462010;
        ga.jefl[2] = 859313232;
        ga.jefl[3] = 448651835;
        ga.jefl[4] = -275466721;
        ga.jefl[5] = 1972640352;
        ga.jefl[6] = -108565629;
        ga.jefl[7] = 125866577;
        ga.jefl[8] = -532647693;
        ga.jefl[9] = 819398254;
        ga.jefl[10] = -518276948;
        ga.jefl[11] = -1192847826;
        ga.jefl[12] = 923723898;
        ga.jefl[13] = -450425381;
        ga.jefl[14] = 263824637;
        ga.jefl[15] = 817178414;
        ga.jefl[16] = 1278272960;
        ga.jefl[17] = -1786031706;
        ga.jefl[18] = 2042225031;
        ga.jefl[19] = 2109282365;
        ga.jefl[20] = -1265005538;
        ga.jefl[21] = -1718327738;
        ga.jefl[22] = 1927945954;
        ga.jefl[23] = -847724684;
        ga.jefl[24] = 1093402873;
        ga.jefl[25] = -1247670689;
        ga.jefl[26] = -1403619211;
        ga.jefl[27] = 2140833157;
        ga.jefl[28] = 738664170;
        ga.jefl[29] = -1290846247;
        ga.jefl[30] = -2133460003;
        ga.jefl[31] = -2052691438;
        ga.jefl[32] = 721201389;
        ga.jefl[33] = 1865865048;
        ga.jefl[34] = -1419320188;
        ga.jefl[35] = 1349877482;
        ga.jefl[36] = 2099556032;
        ga.jefl[37] = -360341992;
        ga.jefl[38] = 1310480323;
        ga.jefl[39] = 542023790;
        ga.jefl[40] = -1420485834;
        ga.jefl[41] = 754222433;
        ga.jefl[42] = -97992818;
        ga.jefl[43] = 1189080825;
        ga.jefl[44] = 1397791559;
        ga.jefl[45] = 361774336;
        ga.jefl[46] = 2125270370;
        ga.jefl[47] = 792251012;
        ga.jefl[48] = 587159171;
        ga.jefl[49] = -43939968;
        ga.jefl[50] = -2052684971;
        ga.jefl[51] = 937449541;
        ga.jefl[52] = 121055507;
        ga.jefl[53] = -1118047996;
        ga.jefl[54] = 702139803;
        ga.jefl[55] = 1113641966;
        ga.jefl[56] = 1472222716;
        ga.jefl[57] = 1227803589;
        ga.jefl[58] = 2134083887;
        ga.jefl[59] = -2107625331;
        ga.jefl[60] = -2086738951;
        ga.jefl[61] = -131164233;
        ga.jefl[62] = -1643936467;
        ga.jefl[63] = -2132619412;
        ga.jefl[64] = -327673197;
        ga.jefl[65] = 1883977613;
        ga.jefl[66] = -772188294;
        ga.jefl[67] = 1859996973;
        ga.jefl[68] = 1903087977;
        ga.jefl[69] = 1198102622;
        ga.jefl[70] = -1658973151;
        ga.jefl[71] = 17214599;
        ga.jefl[72] = -934770950;
        ga.jefl[73] = 196980710;
        ga.jefl[74] = -428850882;
        ga.jefl[75] = -433299318;
        ga.jefl[76] = -1973914909;
        ga.jefl[77] = -701762444;
        ga.jefl[78] = -662416403;
        ga.jefl[79] = -44172455;
        ga.jefl[80] = -1731393469;
        ga.jefl[81] = -1870155032;
        ga.jefl[82] = 668816279;
        ga.jefl[83] = 1247708638;
        ga.jefl[84] = -1261463289;
        ga.jefl[85] = 385214408;
        ga.jefl[86] = 0x7D66D7D;
        ga.jefl[87] = 287687069;
        ga.jefl[88] = 1387074248;
        ga.jefl[89] = -1777172850;
        ga.jefl[90] = 1764726031;
        ga.jefl[91] = -853811783;
        ga.jefl[92] = 2000291199;
        ga.jefl[93] = 1760565718;
        ga.jefl[94] = -203653158;
        ga.jefl[95] = -94478860;
        ga.jefl[96] = -216831441;
        ga.jefl[97] = 283691825;
        ga.jefl[98] = -673803346;
        ga.jefl[99] = -473411760;
    }

    private static /* synthetic */ int jefk(int n2) {
        return jefl[n2] ^ jefm[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ga getInstance() {
        v0 /* !! */  = ga.rb;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - ga.jefe("jeff", jefb(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1772896169: {
                    break block17;
                }
                case -1594106456: {
                    v1 = ga.jefe("jefg", jefb(int ), (int)1);
                    continue block17;
                }
                case -656831531: {
                    v1 = ga.jefe("jefh", jefb(int ), (int)2);
                    continue block17;
                }
                case 598535319: {
                    v1 = ga.jefe("jefi", jefb(int ), (int)3);
                    continue block17;
                }
            }
            break;
        }
        var2 = ga.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ga.rb - ga.jefe("jefj", jefb(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ga.jefe("jefn", jefk(int ), (int)0)) break;
            v2 /* !! */  = (long)ga.jefe("jefo", jefk(int ), (int)1);
        }
        var1_1 /* !! */  = ga.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = ga.rb - ga.jefe("jefp", jefb(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ga.jefe("jefq", jefk(int ), (int)2)) break;
                    v3 /* !! */  = (long)ga.jefe("jefr", jefk(int ), (int)3);
                }
                var0_2 = ga.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                v4 /* !! */  = ga.rb;
                if (true) ** GOTO lbl44
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - ga.jefe("jefs", jefb(int ), (int)6));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1772896169: {
                            break block21;
                        }
                        case 44713720: {
                            v5 = ga.jefe("jeft", jefb(int ), (int)7);
                            continue block21;
                        }
                        case 1048868690: {
                            v5 = ga.jefe("jefu", jefb(int ), (int)8);
                            continue block21;
                        }
                    }
                    break;
                }
                return nj.get(ga.class);
            }
            case 0: {
                var1_1 /* !! */  = (int)ga.jefe("jefv", jefk(int ), (int)4);
                if (!var2) break;
                throw null;
            }
lbl58:
            // 2 sources

            case 1: {
                do {
                    var1_1 /* !! */  = (int)ga.jefe("jefw", jefk(int ), (int)5);
                } while (!var2);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)ga.jefe("jefx", jefk(int ), (int)6);
                    if (!var2) ** GOTO lbl58
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)ga.jefe("jefy", jefk(int ), (int)7);
        ** while (!var2)
lbl71:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isOnSnowOrCarpet() {
        var5_1 = ga.c;
        var4_2 /* !! */  = ga.b;
        var3_3 = ga.a;
        if (var5_1) {
            throw null;
lbl6:
            // 27 sources

            return (boolean)ga.jefe("jegk", jefk(int ), (int)19);
        }
        if (var3_3) ** GOTO lbl6
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3) ** GOTO lbl6
                if (ga.mc.field_1724 == null) ** GOTO lbl17
                if (var3_3) ** GOTO lbl6
                if (ga.mc.field_1687 != null) ** GOTO lbl19
                if (var3_3) ** GOTO lbl6
lbl17:
                // 2 sources

                if (var3_3 || var3_3) ** GOTO lbl6
                return (boolean)ga.jefe("jegl", jefk(int ), (int)20);
lbl19:
                // 1 sources

                if (var3_3 || var3_3) ** GOTO lbl6
                var1_4 = ga.mc.field_1724.method_24515();
                if (var3_3 || var3_3) ** GOTO lbl6
                var2_5 = ga.mc.field_1687.method_8320(var1_4).method_26204();
                if (var3_3 || var3_3) ** GOTO lbl6
                if (var2_5 == class_2246.field_10477) ** GOTO lbl58
                if (var3_3) ** GOTO lbl6
                if (var2_5 == class_2246.field_10466) ** GOTO lbl58
                if (var3_3) ** GOTO lbl6
                if (var2_5 == class_2246.field_9977) ** GOTO lbl58
                if (var3_3) ** GOTO lbl6
                if (var2_5 == class_2246.field_10482) ** GOTO lbl58
                if (var3_3) ** GOTO lbl6
                if (var2_5 == class_2246.field_10290) ** GOTO lbl58
                if (var3_3) ** GOTO lbl6
                if (var2_5 == class_2246.field_10512) ** GOTO lbl58
                if (var3_3) ** GOTO lbl6
                if (var2_5 == class_2246.field_10040) ** GOTO lbl58
                if (var3_3) ** GOTO lbl6
                if (var2_5 == class_2246.field_10393) ** GOTO lbl58
                if (var3_3) ** GOTO lbl6
                if (var2_5 == class_2246.field_10591) ** GOTO lbl58
                if (var3_3) ** GOTO lbl6
                if (var2_5 == class_2246.field_10209) ** GOTO lbl58
                if (var3_3) ** GOTO lbl6
                if (var2_5 == class_2246.field_10433) ** GOTO lbl58
                if (var3_3) ** GOTO lbl6
                if (var2_5 == class_2246.field_10510) ** GOTO lbl58
                if (var3_3) ** GOTO lbl6
                if (var2_5 == class_2246.field_10043) ** GOTO lbl58
                if (var3_3) ** GOTO lbl6
                if (var2_5 == class_2246.field_10473) ** GOTO lbl58
                if (var3_3) ** GOTO lbl6
                if (var2_5 == class_2246.field_10338) ** GOTO lbl58
                if (var3_3) ** GOTO lbl6
                if (var2_5 == class_2246.field_10536) ** GOTO lbl58
                if (var3_3) ** GOTO lbl6
                if (var2_5 != class_2246.field_10106) ** GOTO lbl63
                if (var3_3) ** GOTO lbl6
lbl58:
                // 17 sources

                if (var3_3 || var3_3) ** GOTO lbl6
                v0 = ga.jefe("jegm", jefk(int ), (int)21);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl66
lbl63:
                // 1 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                v0 = ga.jefe("jegn", jefk(int ), (int)22);
lbl66:
                // 2 sources

                return (boolean)v0;
            }
lbl67:
            // 3 sources

            case 0: {
                var4_2 /* !! */  = (int)ga.jefe("jego", jefk(int ), (int)23);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl72:
            // 2 sources

            case 1: {
                var4_2 /* !! */  = (int)ga.jefe("jegp", jefk(int ), (int)24);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl77:
            // 2 sources

            case 2: {
                var4_2 /* !! */  = (int)ga.jefe("jegq", jefk(int ), (int)25);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl82:
            // 2 sources

            case 3: {
                var4_2 /* !! */  = (int)ga.jefe("jegr", jefk(int ), (int)26);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl87:
            // 3 sources

            case 4: {
                var4_2 /* !! */  = (int)ga.jefe("jegs", jefk(int ), (int)27);
                if (var5_1) {
                    throw null;
                }
            }
            case 5: {
                var4_2 /* !! */  = (int)ga.jefe("jegt", jefk(int ), (int)28);
                if (!var5_1) ** GOTO lbl67
                throw null;
            }
lbl95:
            // 2 sources

            case 6: {
                var4_2 /* !! */  = (int)ga.jefe("jegu", jefk(int ), (int)29);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 7: {
                var4_2 /* !! */  = (int)ga.jefe("jegv", jefk(int ), (int)30);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl134
            }
            case 8: {
                var4_2 /* !! */  = (int)ga.jefe("jegw", jefk(int ), (int)31);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)ga.jefe("jegx", jefk(int ), (int)32);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl148
                    break;
                }
            }
lbl116:
            // 2 sources

            case 10: {
                var4_2 /* !! */  = (int)ga.jefe("jegy", jefk(int ), (int)33);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 11: {
                var4_2 /* !! */  = (int)ga.jefe("jegz", jefk(int ), (int)34);
                if (!var5_1) ** GOTO lbl95
                throw null;
            }
lbl125:
            // 3 sources

            case 12: {
                var4_2 /* !! */  = (int)ga.jefe("jeha", jefk(int ), (int)35);
                if (!var5_1) ** GOTO lbl87
                throw null;
            }
lbl129:
            // 2 sources

            case 13: {
                var4_2 /* !! */  = (int)ga.jefe("jehb", jefk(int ), (int)36);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl134:
            // 2 sources

            case 14: {
                var4_2 /* !! */  = (int)ga.jefe("jehc", jefk(int ), (int)37);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl139:
            // 2 sources

            case 15: {
                var4_2 /* !! */  = (int)ga.jefe("jehd", jefk(int ), (int)38);
                if (var5_1) {
                    throw null;
                }
            }
            case 16: {
                var4_2 /* !! */  = (int)ga.jefe("jehe", jefk(int ), (int)39);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl148:
            // 3 sources

            case 17: {
                var4_2 /* !! */  = (int)ga.jefe("jehf", jefk(int ), (int)40);
                if (!var5_1) ** GOTO lbl72
                throw null;
            }
lbl152:
            // 2 sources

            case 18: {
                var4_2 /* !! */  = (int)ga.jefe("jehg", jefk(int ), (int)41);
                if (var5_1) {
                    throw null;
                }
            }
lbl156:
            // 4 sources

            case 19: {
                do {
                    var4_2 /* !! */  = (int)ga.jefe("jehh", jefk(int ), (int)42);
                } while (!var5_1);
                throw null;
            }
lbl161:
            // 3 sources

            case 20: {
                var4_2 /* !! */  = (int)ga.jefe("jehi", jefk(int ), (int)43);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl195
            }
            case 21: {
                var4_2 /* !! */  = (int)ga.jefe("jehj", jefk(int ), (int)44);
                if (!var5_1) ** GOTO lbl148
                throw null;
            }
            case 22: {
                var4_2 /* !! */  = (int)ga.jefe("jehk", jefk(int ), (int)45);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl199
            }
lbl175:
            // 2 sources

            case 23: {
                var4_2 /* !! */  = (int)ga.jefe("jehl", jefk(int ), (int)46);
                if (!var5_1) ** GOTO lbl139
                throw null;
            }
            case 24: {
                var4_2 /* !! */  = (int)ga.jefe("jehm", jefk(int ), (int)47);
                if (!var5_1) ** GOTO lbl125
                throw null;
            }
lbl183:
            // 3 sources

            case 25: {
                var4_2 /* !! */  = (int)ga.jefe("jehn", jefk(int ), (int)48);
                if (!var5_1) ** GOTO lbl82
                throw null;
            }
            case 26: {
                var4_2 /* !! */  = (int)ga.jefe("jeho", jefk(int ), (int)49);
                if (var5_1) {
                    throw null;
                }
            }
lbl191:
            // 4 sources

            case 27: {
                var4_2 /* !! */  = (int)ga.jefe("jehp", jefk(int ), (int)50);
                if (!var5_1) ** GOTO lbl116
                throw null;
            }
lbl195:
            // 2 sources

            case 28: {
                var4_2 /* !! */  = (int)ga.jefe("jehq", jefk(int ), (int)51);
                if (!var5_1) ** GOTO lbl77
                throw null;
            }
lbl199:
            // 2 sources

            case 29: {
                var4_2 /* !! */  = (int)ga.jefe("jehr", jefk(int ), (int)52);
                if (!var5_1) ** GOTO lbl67
                throw null;
            }
            case 30: {
                var4_2 /* !! */  = (int)ga.jefe("jehs", jefk(int ), (int)53);
                if (!var5_1) ** GOTO lbl152
                throw null;
            }
            case 31: {
                var4_2 /* !! */  = (int)ga.jefe("jeht", jefk(int ), (int)54);
                if (!var5_1) ** GOTO lbl125
                throw null;
            }
lbl211:
            // 5 sources

            case 32: {
                var4_2 /* !! */  = (int)ga.jefe("jehu", jefk(int ), (int)55);
                if (!var5_1) ** GOTO lbl156
                throw null;
            }
            case 33: {
                var4_2 /* !! */  = (int)ga.jefe("jehv", jefk(int ), (int)56);
                if (!var5_1) ** GOTO lbl183
                throw null;
            }
            case 34: {
                var4_2 /* !! */  = (int)ga.jefe("jehw", jefk(int ), (int)57);
                if (!var5_1) ** GOTO lbl87
                throw null;
            }
            case 35: 
        }
        var4_2 /* !! */  = (int)ga.jefe("jehx", jefk(int ), (int)58);
        ** while (!var5_1)
lbl226:
        // 1 sources

        throw null;
    }
}

