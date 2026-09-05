/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10192
 *  net.minecraft.class_1268
 *  net.minecraft.class_1304
 *  net.minecraft.class_1657
 *  net.minecraft.class_1713
 *  net.minecraft.class_1735
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2596
 *  net.minecraft.class_2815
 *  net.minecraft.class_2868
 *  net.minecraft.class_310
 *  net.minecraft.class_9334
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.class_10192;
import net.minecraft.class_1268;
import net.minecraft.class_1304;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2596;
import net.minecraft.class_2815;
import net.minecraft.class_2868;
import net.minecraft.class_310;
import net.minecraft.class_9334;
import ruhack.phobia.a.ak;
import ruhack.phobia.nu;
import ruhack.phobia.nw;

public final class nv {
    public static final boolean c;
    private static int[] lkwp;
    private static final class_1304[] ARMOR_SLOTS;
    private static final long ud = -3282385903442088368L;
    private static long[] lkww;
    private static int[] lkwq;
    private static int savedSlot;
    public static final int b;
    public static final boolean a;
    private static int cursorDumpSlot;
    private static final class_310 mc;
    private static int silentSlot;
    private static long[] lkwx;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void selectSlot(int var0) {
        block73: {
            block72: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lmqn", lkwv(int ), (int)483)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == nv.lkwr("lmqo", lkwo(int ), (int)705)) break;
                    v0 /* !! */  = (long)nv.lkwr("lmqp", lkwo(int ), (int)706);
                }
                var3_1 = nv.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lmqq", lkwv(int ), (int)484)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == nv.lkwr("lmqr", lkwo(int ), (int)707)) break;
                    v1 /* !! */  = (long)nv.lkwr("lmqs", lkwo(int ), (int)708);
                }
                var2_2 /* !! */  = nv.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lmqt", lkwv(int ), (int)485)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == nv.lkwr("lmqu", lkwo(int ), (int)709)) break;
                    v2 /* !! */  = (long)nv.lkwr("lmqv", lkwo(int ), (int)710);
                }
                var1_3 = nv.a;
                if (var3_1) {
                    throw null;
lbl21:
                    // 9 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl21
                v3 /* !! */  = nv.ud;
                if (true) ** GOTO lbl28
                block45: while (true) {
                    v3 /* !! */  = (long)(nv.lkwr("lmqx", lkwv(int ), (int)487) - nv.lkwr("lmqw", lkwv(int ), (int)486));
lbl28:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -329488496: {
                            continue block45;
                        }
                        case 1637199440: {
                            break block45;
                        }
                    }
                    break;
                }
                v4 /* !! */  = nv.ud;
                if (true) ** GOTO lbl37
                block46: while (true) {
                    v4 /* !! */  = (long)(v5 - nv.lkwr("lmqy", lkwv(int ), (int)488));
lbl37:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1030506738: {
                            v5 = nv.lkwr("lmqz", lkwv(int ), (int)489);
                            continue block46;
                        }
                        case 613734343: {
                            v5 = nv.lkwr("lmra", lkwv(int ), (int)490);
                            continue block46;
                        }
                        case 1297111615: {
                            v5 = nv.lkwr("lmrb", lkwv(int ), (int)491);
                            continue block46;
                        }
                        case 1637199440: {
                            break block46;
                        }
                    }
                    break;
                }
                if (nv.mc.field_1724 == null) break block72;
                if (var1_3) ** GOTO lbl21
                if (var0 < 0) break block72;
                if (var1_3) ** GOTO lbl21
                if (var0 <= nv.lkwr("lmrc", lkwo(int ), (int)711)) break block73;
                if (var1_3) ** GOTO lbl21
            }
            if (var1_3 || var1_3) ** GOTO lbl21
            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl21
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("lmrd", lkwv(int ), (int)492)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == nv.lkwr("lmre", lkwo(int ), (int)712)) break;
            v6 /* !! */  = (long)nv.lkwr("lmrf", lkwo(int ), (int)713);
        }
        v7 /* !! */  = nv.ud;
        if (true) ** GOTO lbl69
        block48: while (true) {
            v7 /* !! */  = (long)(nv.lkwr("lmrh", lkwv(int ), (int)494) - nv.lkwr("lmrg", lkwv(int ), (int)493));
lbl69:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -831840616: {
                    continue block48;
                }
                case 1637199440: {
                    break block48;
                }
            }
            break;
        }
        v8 = nv.mc.field_1724;
        v9 /* !! */  = nv.ud;
        if (true) ** GOTO lbl79
        block49: while (true) {
            v9 /* !! */  = (long)(nv.lkwr("lmrj", lkwv(int ), (int)496) - nv.lkwr("lmri", lkwv(int ), (int)495));
lbl79:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -2014672544: {
                    continue block49;
                }
                case 1637199440: {
                    break block49;
                }
            }
            break;
        }
        v10 = v8.method_31548();
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("lmrk", lkwv(int ), (int)497)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == nv.lkwr("lmrl", lkwo(int ), (int)714)) break;
            v11 /* !! */  = (long)nv.lkwr("lmrm", lkwo(int ), (int)715);
        }
        if (v10.method_67532() == var0) ** GOTO lbl123
        if (var1_3 || var1_3) ** GOTO lbl21
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = nv.ud - nv.lkwr("lmrn", lkwv(int ), (int)498)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == nv.lkwr("lmro", lkwo(int ), (int)716)) break;
                    v12 /* !! */  = (long)nv.lkwr("lmrp", lkwo(int ), (int)717);
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_6 = nv.ud - nv.lkwr("lmrq", lkwv(int ), (int)499)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == nv.lkwr("lmrr", lkwo(int ), (int)718)) break;
                    v13 /* !! */  = (long)nv.lkwr("lmrs", lkwo(int ), (int)719);
                }
                v14 = nv.mc.field_1724;
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_7 = nv.ud - nv.lkwr("lmrt", lkwv(int ), (int)500)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == nv.lkwr("lmru", lkwo(int ), (int)720)) break;
                    v15 /* !! */  = (long)nv.lkwr("lmrv", lkwo(int ), (int)721);
                }
                v16 = v14.method_31548();
                v17 /* !! */  = nv.ud;
                if (true) ** GOTO lbl116
                block54: while (true) {
                    v17 /* !! */  = (long)(nv.lkwr("lmrx", lkwv(int ), (int)502) - nv.lkwr("lmrw", lkwv(int ), (int)501));
lbl116:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case 12818274: {
                            continue block54;
                        }
                        case 1637199440: {
                            break block54;
                        }
                    }
                    break;
                }
                v16.method_61496(var0);
                if (var1_3) ** GOTO lbl21
lbl123:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)nv.lkwr("lmry", lkwo(int ), (int)722);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl131:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)nv.lkwr("lmrz", lkwo(int ), (int)723);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl156
            }
            case 2: {
                var2_2 /* !! */  = (int)nv.lkwr("lmsa", lkwo(int ), (int)724);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl141:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)nv.lkwr("lmsb", lkwo(int ), (int)725);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 4: {
                var2_2 /* !! */  = (int)nv.lkwr("lmsc", lkwo(int ), (int)726);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl151:
            // 3 sources

            case 5: {
                do {
                    var2_2 /* !! */  = (int)nv.lkwr("lmsd", lkwo(int ), (int)727);
                } while (!var3_1);
                throw null;
            }
lbl156:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)nv.lkwr("lmse", lkwo(int ), (int)728);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl161:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)nv.lkwr("lmsf", lkwo(int ), (int)729);
                if (!var3_1) break;
                throw null;
            }
lbl165:
            // 2 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nv.lkwr("lmsg", lkwo(int ), (int)730);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl180
                    break;
                }
            }
            case 9: {
                var2_2 /* !! */  = (int)nv.lkwr("lmsh", lkwo(int ), (int)731);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl176:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)nv.lkwr("lmsi", lkwo(int ), (int)732);
                if (!var3_1) ** GOTO lbl151
                throw null;
            }
lbl180:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)nv.lkwr("lmsj", lkwo(int ), (int)733);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 12: {
                var2_2 /* !! */  = (int)nv.lkwr("lmsk", lkwo(int ), (int)734);
                if (!var3_1) ** GOTO lbl161
                throw null;
            }
lbl189:
            // 3 sources

            case 13: {
                var2_2 /* !! */  = (int)nv.lkwr("lmsl", lkwo(int ), (int)735);
                if (!var3_1) ** GOTO lbl131
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)nv.lkwr("lmsm", lkwo(int ), (int)736);
                if (!var3_1) ** GOTO lbl176
                throw null;
            }
lbl197:
            // 3 sources

            case 15: {
                var2_2 /* !! */  = (int)nv.lkwr("lmsn", lkwo(int ), (int)737);
                if (!var3_1) ** GOTO lbl141
                throw null;
            }
            case 16: 
        }
        var2_2 /* !! */  = (int)nv.lkwr("lmso", lkwo(int ), (int)738);
        ** while (!var3_1)
lbl204:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lojj() {
        nv.lkww[200] = -6194673393140811969L;
        nv.lkww[201] = 1205497606534396421L;
        nv.lkww[202] = 6989312392204473248L;
        nv.lkww[203] = -3982672508624599480L;
        nv.lkww[204] = -6445755606628569021L;
        nv.lkww[205] = 4039148621209433459L;
        nv.lkww[206] = -3778447002627114841L;
        nv.lkww[207] = 7361206845438732407L;
        nv.lkww[208] = -5516694618471912008L;
        nv.lkww[209] = -4430025307450238297L;
        nv.lkww[210] = -1726229061418263819L;
        nv.lkww[211] = 7483641897210697988L;
        nv.lkww[212] = -8304820306465843726L;
        nv.lkww[213] = 3513157874634286674L;
        nv.lkww[214] = 47530465505900780L;
        nv.lkww[215] = -3696383826177347829L;
        nv.lkww[216] = 5427603227611535051L;
        nv.lkww[217] = -859480079844270707L;
        nv.lkww[218] = 5139028345785754966L;
        nv.lkww[219] = 8566961636130881993L;
        nv.lkww[220] = 1258420326051312761L;
        nv.lkww[221] = 4674589122049385482L;
        nv.lkww[222] = 496538788462984366L;
        nv.lkww[223] = 176515604790540725L;
        nv.lkww[224] = 1639464232216642690L;
        nv.lkww[225] = 3962617802620374549L;
        nv.lkww[226] = 2599375316071389295L;
        nv.lkww[227] = -5613457050904942075L;
        nv.lkww[228] = -7776804183736033385L;
        nv.lkww[229] = 8890978130507076162L;
        nv.lkww[230] = -3560951512584633478L;
        nv.lkww[231] = 4442404528990058738L;
        nv.lkww[232] = -7096583186628703599L;
        nv.lkww[233] = 6489216236609810892L;
        nv.lkww[234] = -493750759763543579L;
        nv.lkww[235] = 4022175900330812274L;
        nv.lkww[236] = 1473508036109136324L;
        nv.lkww[237] = 3305582710920387816L;
        nv.lkww[238] = -7525074243023462665L;
        nv.lkww[239] = -6214074189857982629L;
        nv.lkww[240] = 4325237358370149338L;
        nv.lkww[241] = -1070908060218107526L;
        nv.lkww[242] = 6079480650090527256L;
        nv.lkww[243] = -2901161664233470513L;
        nv.lkww[244] = -3771285894215458527L;
        nv.lkww[245] = 8351713539761210961L;
        nv.lkww[246] = -4879149283653629477L;
        nv.lkww[247] = 1604681730444368505L;
        nv.lkww[248] = -8613743578479300588L;
        nv.lkww[249] = -4408302592574919531L;
        nv.lkww[250] = -7089028364336687460L;
        nv.lkww[251] = 7970815111340861209L;
        nv.lkww[252] = -3334668002489956792L;
        nv.lkww[253] = 3104684609833713516L;
        nv.lkww[254] = 577144837610145869L;
        nv.lkww[255] = -5532271105995711341L;
        nv.lkww[256] = -7585158276928199770L;
        nv.lkww[257] = 1931037686316560618L;
        nv.lkww[258] = -6266754525988266814L;
        nv.lkww[259] = -8225127441259978223L;
        nv.lkww[260] = -1237312376968011826L;
        nv.lkww[261] = 5182087987177669289L;
        nv.lkww[262] = -6414628443452836762L;
        nv.lkww[263] = -3763713428367932068L;
        nv.lkww[264] = -6545492066360289787L;
        nv.lkww[265] = -6674354524926419106L;
        nv.lkww[266] = 1387469108262310828L;
        nv.lkww[267] = -1693920075419255048L;
        nv.lkww[268] = 6741369106802481908L;
        nv.lkww[269] = 496378166330474794L;
        nv.lkww[270] = 3663332814113509620L;
        nv.lkww[271] = -5043394870797247831L;
        nv.lkww[272] = 3848021049852744288L;
        nv.lkww[273] = -3584140065579073579L;
        nv.lkww[274] = 8360967305355462936L;
        nv.lkww[275] = 2443836272518491906L;
        nv.lkww[276] = 6331397787662764983L;
        nv.lkww[277] = 523921952366459613L;
        nv.lkww[278] = -2319300540996409921L;
        nv.lkww[279] = -5668864345277689933L;
        nv.lkww[280] = -3991117048543600219L;
        nv.lkww[281] = -6584069604734528409L;
        nv.lkww[282] = 4422076301319561297L;
        nv.lkww[283] = -1501051602945745290L;
        nv.lkww[284] = 2580519907373377750L;
        nv.lkww[285] = -15667884098775437L;
        nv.lkww[286] = -6561777403432160422L;
        nv.lkww[287] = 8645088521219628650L;
        nv.lkww[288] = 1740862434326715898L;
        nv.lkww[289] = 828421570744656309L;
        nv.lkww[290] = -95476409382759050L;
        nv.lkww[291] = -9048366956817618331L;
        nv.lkww[292] = -6168964282112062892L;
        nv.lkww[293] = -953880085399594481L;
        nv.lkww[294] = -2253380311522360983L;
        nv.lkww[295] = 2364551033601244521L;
        nv.lkww[296] = -4399772748924700722L;
        nv.lkww[297] = 7968152557480700756L;
        nv.lkww[298] = -4137156883194065064L;
        nv.lkww[299] = -95455022346536651L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void silentUseHotbarItem(int var0, float var1_1, float var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lnap", lkwv(int ), (int)603)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nv.lkwr("lnaq", lkwo(int ), (int)847)) break;
            v0 /* !! */  = (long)nv.lkwr("lnar", lkwo(int ), (int)848);
        }
        var6_3 = nv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lnas", lkwv(int ), (int)604)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nv.lkwr("lnat", lkwo(int ), (int)849)) break;
            v1 /* !! */  = (long)nv.lkwr("lnau", lkwo(int ), (int)850);
        }
        var5_4 /* !! */  = nv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lnav", lkwv(int ), (int)605)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nv.lkwr("lnaw", lkwo(int ), (int)851)) break;
            v2 /* !! */  = (long)nv.lkwr("lnax", lkwo(int ), (int)852);
        }
        var4_5 = nv.a;
        if (var6_3) {
            throw null;
lbl21:
            // 13 sources

            return;
        }
        if (var4_5 || var4_5) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("lnay", lkwv(int ), (int)606)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == nv.lkwr("lnaz", lkwo(int ), (int)853)) break;
            v3 /* !! */  = (long)nv.lkwr("lnba", lkwo(int ), (int)854);
        }
        v4 /* !! */  = nv.ud;
        if (true) ** GOTO lbl33
        block89: while (true) {
            v4 /* !! */  = (long)(v5 - nv.lkwr("lnbb", lkwv(int ), (int)607));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 1063230789: {
                    v5 = nv.lkwr("lnbc", lkwv(int ), (int)608);
                    continue block89;
                }
                case 1637199440: {
                    break block89;
                }
                case 2067177280: {
                    v5 = nv.lkwr("lnbd", lkwv(int ), (int)609);
                    continue block89;
                }
            }
            break;
        }
        if (nv.mc.field_1724 == null) ** GOTO lbl70
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_5) ** GOTO lbl21
                v6 /* !! */  = nv.ud;
                if (true) ** GOTO lbl51
                block90: while (true) {
                    v6 /* !! */  = (long)(v7 - nv.lkwr("lnbe", lkwv(int ), (int)610));
lbl51:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1382166278: {
                            v7 = nv.lkwr("lnbf", lkwv(int ), (int)611);
                            continue block90;
                        }
                        case 495820753: {
                            v7 = nv.lkwr("lnbg", lkwv(int ), (int)612);
                            continue block90;
                        }
                        case 1164527569: {
                            v7 = nv.lkwr("lnbh", lkwv(int ), (int)613);
                            continue block90;
                        }
                        case 1637199440: {
                            break block90;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("lnbi", lkwv(int ), (int)614)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == nv.lkwr("lnbj", lkwo(int ), (int)855)) break;
                    v8 /* !! */  = (long)nv.lkwr("lnbk", lkwo(int ), (int)856);
                }
                if (nv.mc.method_1562() != null) ** GOTO lbl72
                if (var4_5) ** GOTO lbl21
lbl70:
                // 2 sources

                if (var4_5 || var4_5) ** GOTO lbl21
                return;
lbl72:
                // 1 sources

                if (var4_5 || var4_5) ** GOTO lbl21
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_5 = nv.ud - nv.lkwr("lnbl", lkwv(int ), (int)615)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == nv.lkwr("lnbm", lkwo(int ), (int)857)) break;
                    v9 /* !! */  = (long)nv.lkwr("lnbn", lkwo(int ), (int)858);
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_6 = nv.ud - nv.lkwr("lnbo", lkwv(int ), (int)616)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == nv.lkwr("lnbp", lkwo(int ), (int)859)) break;
                    v10 /* !! */  = (long)nv.lkwr("lnbq", lkwo(int ), (int)860);
                }
                v11 = nv.mc.field_1724;
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_7 = nv.ud - nv.lkwr("lnbr", lkwv(int ), (int)617)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == nv.lkwr("lnbs", lkwo(int ), (int)861)) break;
                    v12 /* !! */  = (long)nv.lkwr("lnbt", lkwo(int ), (int)862);
                }
                v13 = v11.method_31548();
                v14 /* !! */  = nv.ud;
                if (true) ** GOTO lbl94
                block95: while (true) {
                    v14 /* !! */  = (long)(v15 - nv.lkwr("lnbu", lkwv(int ), (int)618));
lbl94:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -2108829016: {
                            v15 = nv.lkwr("lnbv", lkwv(int ), (int)619);
                            continue block95;
                        }
                        case -1717456136: {
                            v15 = nv.lkwr("lnbw", lkwv(int ), (int)620);
                            continue block95;
                        }
                        case 1157038879: {
                            v15 = nv.lkwr("lnbx", lkwv(int ), (int)621);
                            continue block95;
                        }
                        case 1637199440: {
                            break block95;
                        }
                    }
                    break;
                }
                var3_6 = v13.method_67532();
                if (var4_5 || var4_5) ** GOTO lbl21
                if (var0 == var3_6) ** GOTO lbl165
                if (var4_5 || var4_5) ** GOTO lbl21
                v16 /* !! */  = nv.ud;
                if (true) ** GOTO lbl114
                block96: while (true) {
                    v16 /* !! */  = (long)(v17 - nv.lkwr("lnby", lkwv(int ), (int)622));
lbl114:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1201468031: {
                            v17 = nv.lkwr("lnbz", lkwv(int ), (int)623);
                            continue block96;
                        }
                        case 1163306175: {
                            v17 = nv.lkwr("lnca", lkwv(int ), (int)624);
                            continue block96;
                        }
                        case 1637199440: {
                            break block96;
                        }
                        case 1717366551: {
                            v17 = nv.lkwr("lncb", lkwv(int ), (int)625);
                            continue block96;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_8 = nv.ud - nv.lkwr("lncc", lkwv(int ), (int)626)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == nv.lkwr("lncd", lkwo(int ), (int)863)) break;
                    v18 /* !! */  = (long)nv.lkwr("lnce", lkwo(int ), (int)864);
                }
                v19 = nv.mc.method_1562();
                v20 /* !! */  = nv.ud;
                if (true) ** GOTO lbl136
                block98: while (true) {
                    v20 /* !! */  = (long)(nv.lkwr("lncg", lkwv(int ), (int)628) - nv.lkwr("lncf", lkwv(int ), (int)627));
lbl136:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -378623889: {
                            continue block98;
                        }
                        case 1637199440: {
                            break block98;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_9 = nv.ud - nv.lkwr("lnch", lkwv(int ), (int)629)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == nv.lkwr("lnci", lkwo(int ), (int)865)) break;
                    v21 /* !! */  = (long)nv.lkwr("lncj", lkwo(int ), (int)866);
                }
                v22 = new class_2868(var0);
                v23 /* !! */  = nv.ud;
                if (true) ** GOTO lbl151
                block100: while (true) {
                    v23 /* !! */  = (long)(v24 - nv.lkwr("lnck", lkwv(int ), (int)630));
lbl151:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -2015921089: {
                            v24 = nv.lkwr("lncl", lkwv(int ), (int)631);
                            continue block100;
                        }
                        case 1366722766: {
                            v24 = nv.lkwr("lncm", lkwv(int ), (int)632);
                            continue block100;
                        }
                        case 1615790180: {
                            v24 = nv.lkwr("lncn", lkwv(int ), (int)633);
                            continue block100;
                        }
                        case 1637199440: {
                            break block100;
                        }
                    }
                    break;
                }
                v19.method_52787((class_2596)v22);
                if (var4_5) ** GOTO lbl21
lbl165:
                // 2 sources

                if (var4_5 || var4_5) ** GOTO lbl21
                v25 /* !! */  = nv.ud;
                if (true) ** GOTO lbl170
                block101: while (true) {
                    v25 /* !! */  = (long)(nv.lkwr("lncp", lkwv(int ), (int)635) - nv.lkwr("lnco", lkwv(int ), (int)634));
lbl170:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -387276512: {
                            continue block101;
                        }
                        case 1637199440: {
                            break block101;
                        }
                    }
                    break;
                }
                v26 /* !! */  = nv.ud;
                if (true) ** GOTO lbl179
                block102: while (true) {
                    v26 /* !! */  = (long)(v27 - nv.lkwr("lncq", lkwv(int ), (int)636));
lbl179:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -1291054615: {
                            v27 = nv.lkwr("lncr", lkwv(int ), (int)637);
                            continue block102;
                        }
                        case -582861443: {
                            v27 = nv.lkwr("lncs", lkwv(int ), (int)638);
                            continue block102;
                        }
                        case 1185555986: {
                            v27 = nv.lkwr("lnct", lkwv(int ), (int)639);
                            continue block102;
                        }
                        case 1637199440: {
                            break block102;
                        }
                    }
                    break;
                }
                nv.sendUsePacket(class_1268.field_5808, var1_1, var2_2);
                if (var4_5 || var4_5) ** GOTO lbl21
                if (var0 == var3_6) ** GOTO lbl244
                if (var4_5 || var4_5) ** GOTO lbl21
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_10 = nv.ud - nv.lkwr("lncu", lkwv(int ), (int)640)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == nv.lkwr("lncv", lkwo(int ), (int)867)) break;
                    v28 /* !! */  = (long)nv.lkwr("lncw", lkwo(int ), (int)868);
                }
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_11 = nv.ud - nv.lkwr("lncx", lkwv(int ), (int)641)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == nv.lkwr("lncy", lkwo(int ), (int)869)) break;
                    v29 /* !! */  = (long)nv.lkwr("lncz", lkwo(int ), (int)870);
                }
                v30 = nv.mc.method_1562();
                v31 /* !! */  = nv.ud;
                if (true) ** GOTO lbl210
                block105: while (true) {
                    v31 /* !! */  = (long)(nv.lkwr("lndb", lkwv(int ), (int)643) - nv.lkwr("lnda", lkwv(int ), (int)642));
lbl210:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -1337658201: {
                            continue block105;
                        }
                        case 1637199440: {
                            break block105;
                        }
                    }
                    break;
                }
                v32 /* !! */  = nv.ud;
                if (true) ** GOTO lbl219
                block106: while (true) {
                    v32 /* !! */  = (long)(v33 - nv.lkwr("lndc", lkwv(int ), (int)644));
lbl219:
                    // 2 sources

                    switch ((int)v32 /* !! */ ) {
                        case -776569646: {
                            v33 = nv.lkwr("lndd", lkwv(int ), (int)645);
                            continue block106;
                        }
                        case 342890736: {
                            v33 = nv.lkwr("lnde", lkwv(int ), (int)646);
                            continue block106;
                        }
                        case 1637199440: {
                            break block106;
                        }
                    }
                    break;
                }
                v34 = new class_2868(var3_6);
                v35 /* !! */  = nv.ud;
                if (true) ** GOTO lbl233
                block107: while (true) {
                    v35 /* !! */  = (long)(v36 - nv.lkwr("lndf", lkwv(int ), (int)647));
lbl233:
                    // 2 sources

                    switch ((int)v35 /* !! */ ) {
                        case -1163462396: {
                            v36 = nv.lkwr("lndg", lkwv(int ), (int)648);
                            continue block107;
                        }
                        case 1637199440: {
                            break block107;
                        }
                        case 2036982414: {
                            v36 = nv.lkwr("lndh", lkwv(int ), (int)649);
                            continue block107;
                        }
                    }
                    break;
                }
                v30.method_52787((class_2596)v34);
                if (var4_5) ** GOTO lbl21
lbl244:
                // 2 sources

                if (!var4_5 && !var4_5) ** break;
                ** continue;
                return;
            }
lbl247:
            // 2 sources

            case 0: {
                var5_4 /* !! */  = (int)nv.lkwr("lndi", lkwo(int ), (int)871);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl325
            }
            case 1: {
                var5_4 /* !! */  = (int)nv.lkwr("lndj", lkwo(int ), (int)872);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl325
            }
lbl257:
            // 2 sources

            case 2: {
                var5_4 /* !! */  = (int)nv.lkwr("lndk", lkwo(int ), (int)873);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl272
            }
            case 3: {
                do {
                    var5_4 /* !! */  = (int)nv.lkwr("lndl", lkwo(int ), (int)874);
                } while (!var6_3);
                throw null;
            }
lbl267:
            // 2 sources

            case 4: {
                var5_4 /* !! */  = (int)nv.lkwr("lndm", lkwo(int ), (int)875);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl276
            }
lbl272:
            // 2 sources

            case 5: {
                var5_4 /* !! */  = (int)nv.lkwr("lndn", lkwo(int ), (int)876);
                if (var6_3) {
                    throw null;
                }
            }
lbl276:
            // 4 sources

            case 6: {
                var5_4 /* !! */  = (int)nv.lkwr("lndo", lkwo(int ), (int)877);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl333
            }
            case 7: {
                var5_4 /* !! */  = (int)nv.lkwr("lndp", lkwo(int ), (int)878);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl333
            }
            case 8: {
                var5_4 /* !! */  = (int)nv.lkwr("lndq", lkwo(int ), (int)879);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl309
            }
            case 9: {
                var5_4 /* !! */  = (int)nv.lkwr("lndr", lkwo(int ), (int)880);
                if (var6_3) {
                    throw null;
                }
            }
lbl295:
            // 4 sources

            case 10: {
                var5_4 /* !! */  = (int)nv.lkwr("lnds", lkwo(int ), (int)881);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl329
            }
lbl300:
            // 2 sources

            case 11: {
                do {
                    var5_4 /* !! */  = (int)nv.lkwr("lndt", lkwo(int ), (int)882);
                } while (!var6_3);
                throw null;
            }
lbl305:
            // 2 sources

            case 12: {
                var5_4 /* !! */  = (int)nv.lkwr("lndu", lkwo(int ), (int)883);
                if (!var6_3) ** GOTO lbl257
                throw null;
            }
lbl309:
            // 2 sources

            case 13: {
                var5_4 /* !! */  = (int)nv.lkwr("lndv", lkwo(int ), (int)884);
                if (!var6_3) break;
                throw null;
            }
            case 14: {
                var5_4 /* !! */  = (int)nv.lkwr("lndw", lkwo(int ), (int)885);
                if (!var6_3) break;
                throw null;
            }
            case 15: {
                var5_4 /* !! */  = (int)nv.lkwr("lndx", lkwo(int ), (int)886);
                if (!var6_3) ** GOTO lbl267
                throw null;
            }
lbl321:
            // 2 sources

            case 16: {
                var5_4 /* !! */  = (int)nv.lkwr("lndy", lkwo(int ), (int)887);
                if (!var6_3) ** GOTO lbl247
                throw null;
            }
lbl325:
            // 3 sources

            case 17: {
                var5_4 /* !! */  = (int)nv.lkwr("lndz", lkwo(int ), (int)888);
                if (!var6_3) ** GOTO lbl305
                throw null;
            }
lbl329:
            // 3 sources

            case 18: {
                var5_4 /* !! */  = (int)nv.lkwr("lnea", lkwo(int ), (int)889);
                if (!var6_3) ** GOTO lbl321
                throw null;
            }
lbl333:
            // 3 sources

            case 19: {
                var5_4 /* !! */  = (int)nv.lkwr("lneb", lkwo(int ), (int)890);
                if (!var6_3) ** GOTO lbl329
                throw null;
            }
lbl337:
            // 2 sources

            case 20: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)nv.lkwr("lnec", lkwo(int ), (int)891);
                    if (!var6_3) ** GOTO lbl295
                    throw null;
                }
            }
            case 21: {
                do {
                    var5_4 /* !! */  = (int)nv.lkwr("lned", lkwo(int ), (int)892);
                } while (!var6_3);
                throw null;
            }
            case 22: {
                var5_4 /* !! */  = (int)nv.lkwr("lnee", lkwo(int ), (int)893);
                if (!var6_3) ** GOTO lbl300
                throw null;
            }
            case 23: {
                var5_4 /* !! */  = (int)nv.lkwr("lnef", lkwo(int ), (int)894);
                if (!var6_3) ** GOTO lbl337
                throw null;
            }
            case 24: 
        }
        var5_4 /* !! */  = (int)nv.lkwr("lneg", lkwo(int ), (int)895);
        ** while (!var6_3)
lbl358:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lokb() {
        nv.lkwx[900] = 8424374430642570891L;
        nv.lkwx[901] = -7624440569647431124L;
        nv.lkwx[902] = 7015417449302979199L;
        nv.lkwx[903] = -8330457075230284436L;
        nv.lkwx[904] = 3068005759299046126L;
        nv.lkwx[905] = 1630546551942322415L;
        nv.lkwx[906] = -3186836330218718401L;
        nv.lkwx[907] = -6408048413615707346L;
        nv.lkwx[908] = 7612855968676737731L;
        nv.lkwx[909] = -3185008761241198801L;
        nv.lkwx[910] = -1619267931894053347L;
        nv.lkwx[911] = 3057938147112851026L;
        nv.lkwx[912] = 7131561980534272897L;
        nv.lkwx[913] = -3897261333233445317L;
        nv.lkwx[914] = -7988712402160283284L;
        nv.lkwx[915] = -1810844556447155531L;
        nv.lkwx[916] = -8709926687623536956L;
        nv.lkwx[917] = -2256590510355194846L;
        nv.lkwx[918] = 5890429507748330651L;
        nv.lkwx[919] = -7102595716005939348L;
        nv.lkwx[920] = 6305907791379812078L;
        nv.lkwx[921] = -6398218579610534013L;
        nv.lkwx[922] = 9068456023532481281L;
        nv.lkwx[923] = 4665160820165256547L;
        nv.lkwx[924] = -5056606407744589502L;
        nv.lkwx[925] = -536764081602981713L;
        nv.lkwx[926] = -461401348752941083L;
        nv.lkwx[927] = -2468190340113865110L;
        nv.lkwx[928] = 1746956603421568894L;
        nv.lkwx[929] = -8341671823970889757L;
        nv.lkwx[930] = -1776552769341390500L;
        nv.lkwx[931] = 3040796236406999736L;
        nv.lkwx[932] = 3292817345813208288L;
        nv.lkwx[933] = -911686934006204636L;
        nv.lkwx[934] = -1354757546307524394L;
        nv.lkwx[935] = 9119818712780655309L;
        nv.lkwx[936] = -2792390736204084930L;
        nv.lkwx[937] = 53045505899915199L;
        nv.lkwx[938] = 9201748993549670700L;
        nv.lkwx[939] = -4252637468928375413L;
        nv.lkwx[940] = 7384606507244682408L;
        nv.lkwx[941] = 4452947225244922772L;
        nv.lkwx[942] = 4101549661880698748L;
        nv.lkwx[943] = -9087875912218111885L;
        nv.lkwx[944] = 3722793786214861949L;
        nv.lkwx[945] = 5663477559713979492L;
        nv.lkwx[946] = -1591050917477647039L;
        nv.lkwx[947] = 2754909147137600452L;
        nv.lkwx[948] = 2139340006029173496L;
        nv.lkwx[949] = -1040648263017353441L;
        nv.lkwx[950] = 4969859392763781753L;
        nv.lkwx[951] = 8892758008331641587L;
        nv.lkwx[952] = -742729774141983986L;
        nv.lkwx[953] = 8705034223253263747L;
        nv.lkwx[954] = -2186727867997926808L;
        nv.lkwx[955] = 5328987737364624874L;
        nv.lkwx[956] = 2318966622759474131L;
        nv.lkwx[957] = -956063530257055630L;
        nv.lkwx[958] = 8990904162343347882L;
        nv.lkwx[959] = -1110363159362211828L;
        nv.lkwx[960] = 4367350974185209253L;
        nv.lkwx[961] = 3866926375124829135L;
        nv.lkwx[962] = 8692677132065825593L;
        nv.lkwx[963] = 7354132080828139700L;
        nv.lkwx[964] = 1924804133374094552L;
        nv.lkwx[965] = -8885652051416364854L;
        nv.lkwx[966] = -3939865158851403891L;
        nv.lkwx[967] = 3224733255296980203L;
        nv.lkwx[968] = 7608990820411763121L;
        nv.lkwx[969] = 7308876447589467863L;
        nv.lkwx[970] = -8790964970140641612L;
        nv.lkwx[971] = 433550646302018042L;
        nv.lkwx[972] = -8522023944464893511L;
        nv.lkwx[973] = -2298300132970940332L;
        nv.lkwx[974] = -6225335244986786178L;
        nv.lkwx[975] = -5810708589939900246L;
        nv.lkwx[976] = 3456661605654689102L;
        nv.lkwx[977] = 5202815774135175966L;
        nv.lkwx[978] = -9042124053919991738L;
        nv.lkwx[979] = -2347946287435753338L;
        nv.lkwx[980] = -8207766744380482285L;
        nv.lkwx[981] = 3846055556031959712L;
        nv.lkwx[982] = -5956149607523525204L;
        nv.lkwx[983] = 7697235896753313737L;
        nv.lkwx[984] = 116504357887762700L;
        nv.lkwx[985] = 8664303605298247916L;
        nv.lkwx[986] = 8927132035988561949L;
        nv.lkwx[987] = -5056823677611183405L;
        nv.lkwx[988] = 2892199235929616341L;
        nv.lkwx[989] = 4710524695442854113L;
        nv.lkwx[990] = -8071002320474788970L;
        nv.lkwx[991] = 8787166943482045176L;
        nv.lkwx[992] = -4649265621732217187L;
        nv.lkwx[993] = 7938942320624435313L;
        nv.lkwx[994] = 4460011394489025668L;
        nv.lkwx[995] = 4029757101466860250L;
        nv.lkwx[996] = -8487236362228537577L;
        nv.lkwx[997] = 6328353737811975776L;
        nv.lkwx[998] = -1341403182120795674L;
        nv.lkwx[999] = 924898063342607L;
    }

    private static /* synthetic */ int lkwo(int n2) {
        return lkwp[n2] ^ lkwq[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static nu findHotbar(nw var0) {
        block116: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("llyb", lkwv(int ), (int)250)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == nv.lkwr("llyc", lkwo(int ), (int)458)) break;
                v0 /* !! */  = (long)nv.lkwr("llyd", lkwo(int ), (int)459);
            }
            var5_1 = nv.c;
            v1 /* !! */  = nv.ud;
            if (true) ** GOTO lbl12
            block72: while (true) {
                v1 /* !! */  = (long)(v2 - nv.lkwr("llye", lkwv(int ), (int)251));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -81810811: {
                        v2 = nv.lkwr("llyf", lkwv(int ), (int)252);
                        continue block72;
                    }
                    case 1637199440: {
                        break block72;
                    }
                    case 1857216528: {
                        v2 = nv.lkwr("llyg", lkwv(int ), (int)253);
                        continue block72;
                    }
                }
                break;
            }
            var4_2 /* !! */  = nv.b;
            v3 /* !! */  = nv.ud;
            if (true) ** GOTO lbl26
            block73: while (true) {
                v3 /* !! */  = (long)(v4 - nv.lkwr("llyh", lkwv(int ), (int)254));
lbl26:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -635846542: {
                        v4 = nv.lkwr("llyi", lkwv(int ), (int)255);
                        continue block73;
                    }
                    case 1427546591: {
                        v4 = nv.lkwr("llyj", lkwv(int ), (int)256);
                        continue block73;
                    }
                    case 1566648674: {
                        v4 = nv.lkwr("llyk", lkwv(int ), (int)257);
                        continue block73;
                    }
                    case 1637199440: {
                        break block73;
                    }
                }
                break;
            }
            var3_3 = nv.a;
            if (var5_1) {
                throw null;
lbl41:
                // 13 sources

                return null;
            }
            if (var3_3 || var3_3) ** GOTO lbl41
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("llyl", lkwv(int ), (int)258)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == nv.lkwr("llym", lkwo(int ), (int)460)) break;
                v5 /* !! */  = (long)nv.lkwr("llyn", lkwo(int ), (int)461);
            }
            v6 /* !! */  = nv.ud;
            if (true) ** GOTO lbl54
            block76: while (true) {
                v6 /* !! */  = (long)(v7 - nv.lkwr("llyo", lkwv(int ), (int)259));
lbl54:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case 566801978: {
                        v7 = nv.lkwr("llyp", lkwv(int ), (int)260);
                        continue block76;
                    }
                    case 1442356851: {
                        v7 = nv.lkwr("llyq", lkwv(int ), (int)261);
                        continue block76;
                    }
                    case 1637199440: {
                        break block76;
                    }
                }
                break;
            }
            if (nv.mc.field_1724 != null) break block116;
            if (var3_3 || var3_3) ** GOTO lbl41
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("llyr", lkwv(int ), (int)262)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v8 /* !! */  == nv.lkwr("llys", lkwo(int ), (int)462)) break;
                v8 /* !! */  = (long)nv.lkwr("llyt", lkwo(int ), (int)463);
            }
            return nu.notFound();
        }
        if (var3_3) ** GOTO lbl41
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3) ** GOTO lbl41
                var1_4 = nv.lkwr("llyu", lkwo(int ), (int)464);
                if (var3_3) ** GOTO lbl41
                do {
                    if (var3_3 || var3_3) ** GOTO lbl41
                    if (var1_4 >= nv.lkwr("llyv", lkwo(int ), (int)465)) ** GOTO lbl184
                    if (var3_3 || var3_3) ** GOTO lbl41
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("llyw", lkwv(int ), (int)263)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v9 /* !! */  == nv.lkwr("llyx", lkwo(int ), (int)466)) break;
                        v9 /* !! */  = (long)nv.lkwr("llyy", lkwo(int ), (int)467);
                    }
                    v10 /* !! */  = nv.ud;
                    if (true) ** GOTO lbl94
                    block80: while (true) {
                        v10 /* !! */  = (long)(v11 - nv.lkwr("llyz", lkwv(int ), (int)264));
lbl94:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case -1577774692: {
                                v11 = nv.lkwr("llza", lkwv(int ), (int)265);
                                continue block80;
                            }
                            case 453070376: {
                                v11 = nv.lkwr("llzb", lkwv(int ), (int)266);
                                continue block80;
                            }
                            case 1637199440: {
                                break block80;
                            }
                            case 1970062588: {
                                v11 = nv.lkwr("llzc", lkwv(int ), (int)267);
                                continue block80;
                            }
                        }
                        break;
                    }
                    v12 = nv.mc.field_1724;
                    v13 /* !! */  = nv.ud;
                    if (true) ** GOTO lbl111
                    block81: while (true) {
                        v13 /* !! */  = (long)(v14 - nv.lkwr("llzd", lkwv(int ), (int)268));
lbl111:
                        // 2 sources

                        switch ((int)v13 /* !! */ ) {
                            case -1070289869: {
                                v14 = nv.lkwr("llze", lkwv(int ), (int)269);
                                continue block81;
                            }
                            case 1637199440: {
                                break block81;
                            }
                            case 2124076190: {
                                v14 = nv.lkwr("llzf", lkwv(int ), (int)270);
                                continue block81;
                            }
                        }
                        break;
                    }
                    v15 = v12.method_31548();
                    v16 /* !! */  = nv.ud;
                    if (true) ** GOTO lbl125
                    block82: while (true) {
                        v16 /* !! */  = (long)(v17 - nv.lkwr("llzg", lkwv(int ), (int)271));
lbl125:
                        // 2 sources

                        switch ((int)v16 /* !! */ ) {
                            case 496072622: {
                                v17 = nv.lkwr("llzh", lkwv(int ), (int)272);
                                continue block82;
                            }
                            case 728516547: {
                                v17 = nv.lkwr("llzi", lkwv(int ), (int)273);
                                continue block82;
                            }
                            case 1637199440: {
                                break block82;
                            }
                            case 1676142537: {
                                v17 = nv.lkwr("llzj", lkwv(int ), (int)274);
                                continue block82;
                            }
                        }
                        break;
                    }
                    var2_5 = v15.method_5438((int)var1_4);
                    if (var3_3 || var3_3) ** GOTO lbl41
                    v18 /* !! */  = nv.ud;
                    if (true) ** GOTO lbl143
                    block83: while (true) {
                        v18 /* !! */  = (long)(v19 - nv.lkwr("llzk", lkwv(int ), (int)275));
lbl143:
                        // 2 sources

                        switch ((int)v18 /* !! */ ) {
                            case -1153707744: {
                                v19 = nv.lkwr("llzl", lkwv(int ), (int)276);
                                continue block83;
                            }
                            case -419146717: {
                                v19 = nv.lkwr("llzm", lkwv(int ), (int)277);
                                continue block83;
                            }
                            case 863918149: {
                                v19 = nv.lkwr("llzn", lkwv(int ), (int)278);
                                continue block83;
                            }
                            case 1637199440: {
                                break block83;
                            }
                        }
                        break;
                    }
                    if (!nv.isValid(var2_5)) ** GOTO lbl179
                    if (var3_3) ** GOTO lbl41
                    v20 /* !! */  = nv.ud;
                    if (true) ** GOTO lbl161
                    block84: while (true) {
                        v20 /* !! */  = (long)(v21 - nv.lkwr("llzo", lkwv(int ), (int)279));
lbl161:
                        // 2 sources

                        switch ((int)v20 /* !! */ ) {
                            case -1806773080: {
                                v21 = nv.lkwr("llzp", lkwv(int ), (int)280);
                                continue block84;
                            }
                            case -478498091: {
                                v21 = nv.lkwr("llzq", lkwv(int ), (int)281);
                                continue block84;
                            }
                            case 1637199440: {
                                break block84;
                            }
                        }
                        break;
                    }
                    if (!var0.matches(var2_5)) ** GOTO lbl179
                    if (var3_3 || var3_3) ** GOTO lbl41
                    while (true) {
                        if ((v22 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("llzr", lkwv(int ), (int)282)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v22 /* !! */  == nv.lkwr("llzs", lkwo(int ), (int)468)) break;
                        v22 /* !! */  = (long)nv.lkwr("llzt", lkwo(int ), (int)469);
                    }
                    return nu.of((int)var1_4, var2_5);
lbl179:
                    // 2 sources

                    if (var3_3 || var3_3) ** GOTO lbl41
                    ++var1_4;
                    if (var3_3) ** GOTO lbl41
                } while (!var5_1);
                throw null;
lbl184:
                // 1 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_5 = nv.ud - nv.lkwr("llzu", lkwv(int ), (int)283)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v23 /* !! */  == nv.lkwr("llzv", lkwo(int ), (int)470)) break;
                    v23 /* !! */  = (long)nv.lkwr("llzw", lkwo(int ), (int)471);
                }
                return nu.notFound();
            }
lbl193:
            // 2 sources

            case 0: {
                var4_2 /* !! */  = (int)nv.lkwr("llzx", lkwo(int ), (int)472);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl288
            }
            case 1: {
                var4_2 /* !! */  = (int)nv.lkwr("llzy", lkwo(int ), (int)473);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl266
            }
lbl203:
            // 3 sources

            case 2: {
                var4_2 /* !! */  = (int)nv.lkwr("llzz", lkwo(int ), (int)474);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl208:
            // 2 sources

            case 3: {
                var4_2 /* !! */  = (int)nv.lkwr("lmaa", lkwo(int ), (int)475);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl250
            }
lbl213:
            // 2 sources

            case 4: {
                var4_2 /* !! */  = (int)nv.lkwr("lmab", lkwo(int ), (int)476);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl218:
            // 2 sources

            case 5: {
                var4_2 /* !! */  = (int)nv.lkwr("lmac", lkwo(int ), (int)477);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl223:
            // 2 sources

            case 6: {
                var4_2 /* !! */  = (int)nv.lkwr("lmad", lkwo(int ), (int)478);
                if (!var5_1) break;
                throw null;
            }
lbl227:
            // 2 sources

            case 7: {
                var4_2 /* !! */  = (int)nv.lkwr("lmae", lkwo(int ), (int)479);
                if (!var5_1) ** GOTO lbl213
                throw null;
            }
            case 8: {
                var4_2 /* !! */  = (int)nv.lkwr("lmaf", lkwo(int ), (int)480);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl236:
            // 2 sources

            case 9: {
                var4_2 /* !! */  = (int)nv.lkwr("lmag", lkwo(int ), (int)481);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl279
            }
lbl241:
            // 2 sources

            case 10: {
                var4_2 /* !! */  = (int)nv.lkwr("lmah", lkwo(int ), (int)482);
                if (!var5_1) ** GOTO lbl227
                throw null;
            }
            case 11: {
                var4_2 /* !! */  = (int)nv.lkwr("lmai", lkwo(int ), (int)483);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl262
            }
lbl250:
            // 3 sources

            case 12: {
                var4_2 /* !! */  = (int)nv.lkwr("lmaj", lkwo(int ), (int)484);
                if (!var5_1) ** GOTO lbl241
                throw null;
            }
            case 13: {
                var4_2 /* !! */  = (int)nv.lkwr("lmak", lkwo(int ), (int)485);
                if (!var5_1) ** GOTO lbl208
                throw null;
            }
lbl258:
            // 4 sources

            case 14: {
                var4_2 /* !! */  = (int)nv.lkwr("lmal", lkwo(int ), (int)486);
                if (!var5_1) ** GOTO lbl218
                throw null;
            }
lbl262:
            // 3 sources

            case 15: {
                var4_2 /* !! */  = (int)nv.lkwr("lmam", lkwo(int ), (int)487);
                if (!var5_1) ** GOTO lbl203
                throw null;
            }
lbl266:
            // 2 sources

            case 16: {
                var4_2 /* !! */  = (int)nv.lkwr("lman", lkwo(int ), (int)488);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl275
            }
            case 17: {
                var4_2 /* !! */  = (int)nv.lkwr("lmao", lkwo(int ), (int)489);
                if (!var5_1) ** GOTO lbl193
                throw null;
            }
lbl275:
            // 3 sources

            case 18: {
                var4_2 /* !! */  = (int)nv.lkwr("lmap", lkwo(int ), (int)490);
                if (!var5_1) ** GOTO lbl258
                throw null;
            }
lbl279:
            // 2 sources

            case 19: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)nv.lkwr("lmaq", lkwo(int ), (int)491);
                    if (!var5_1) ** GOTO lbl262
                    throw null;
                }
            }
            case 20: {
                var4_2 /* !! */  = (int)nv.lkwr("lmar", lkwo(int ), (int)492);
                if (!var5_1) ** GOTO lbl258
                throw null;
            }
lbl288:
            // 2 sources

            case 21: {
                var4_2 /* !! */  = (int)nv.lkwr("lmas", lkwo(int ), (int)493);
                if (!var5_1) ** GOTO lbl203
                throw null;
            }
            case 22: {
                var4_2 /* !! */  = (int)nv.lkwr("lmat", lkwo(int ), (int)494);
                if (!var5_1) ** GOTO lbl223
                throw null;
            }
lbl296:
            // 2 sources

            case 23: {
                var4_2 /* !! */  = (int)nv.lkwr("lmau", lkwo(int ), (int)495);
                if (!var5_1) ** GOTO lbl250
                throw null;
            }
            case 24: 
        }
        var4_2 /* !! */  = (int)nv.lkwr("lmav", lkwo(int ), (int)496);
        ** while (!var5_1)
lbl303:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int findItemInHotbar(class_1792 var0) {
        block91: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("llnl", lkwv(int ), (int)158)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == nv.lkwr("llnm", lkwo(int ), (int)274)) break;
                v0 /* !! */  = (long)nv.lkwr("llnn", lkwo(int ), (int)275);
            }
            var5_1 = nv.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("llno", lkwv(int ), (int)159)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == nv.lkwr("llnp", lkwo(int ), (int)276)) break;
                v1 /* !! */  = (long)nv.lkwr("llnq", lkwo(int ), (int)277);
            }
            var4_2 /* !! */  = nv.b;
            v2 /* !! */  = nv.ud;
            if (true) ** GOTO lbl19
            block54: while (true) {
                v2 /* !! */  = (long)(nv.lkwr("llns", lkwv(int ), (int)161) - nv.lkwr("llnr", lkwv(int ), (int)160));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -46967862: {
                        continue block54;
                    }
                    case 1637199440: {
                        break block54;
                    }
                }
                break;
            }
            var3_3 = nv.a;
            if (var5_1) {
                throw null;
lbl27:
                // 12 sources

                return (int)nv.lkwr("llnt", lkwo(int ), (int)278);
            }
            if (var3_3 || var3_3) ** GOTO lbl27
            v3 /* !! */  = nv.ud;
            if (true) ** GOTO lbl34
            block56: while (true) {
                v3 /* !! */  = (long)(v4 - nv.lkwr("llnu", lkwv(int ), (int)162));
lbl34:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -392532971: {
                        v4 = nv.lkwr("llnv", lkwv(int ), (int)163);
                        continue block56;
                    }
                    case 1637199440: {
                        break block56;
                    }
                    case 1789956523: {
                        v4 = nv.lkwr("llnw", lkwv(int ), (int)164);
                        continue block56;
                    }
                }
                break;
            }
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("llnx", lkwv(int ), (int)165)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == nv.lkwr("llny", lkwo(int ), (int)279)) break;
                v5 /* !! */  = (long)nv.lkwr("llnz", lkwo(int ), (int)280);
            }
            if (nv.mc.field_1724 != null) break block91;
            if (var3_3 || var3_3) ** GOTO lbl27
            return (int)nv.lkwr("lloa", lkwo(int ), (int)281);
        }
        if (var3_3 || var3_3) ** GOTO lbl27
        var1_4 = nv.lkwr("llob", lkwo(int ), (int)282);
        if (var3_3) ** GOTO lbl27
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                do {
                    if (var3_3 || var3_3) ** GOTO lbl27
                    if (var1_4 >= nv.lkwr("lloc", lkwo(int ), (int)283)) ** GOTO lbl136
                    if (var3_3 || var3_3) ** GOTO lbl27
                    v6 /* !! */  = nv.ud;
                    if (true) ** GOTO lbl67
                    block59: while (true) {
                        v6 /* !! */  = (long)(nv.lkwr("lloe", lkwv(int ), (int)167) - nv.lkwr("llod", lkwv(int ), (int)166));
lbl67:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case 1400213429: {
                                continue block59;
                            }
                            case 1637199440: {
                                break block59;
                            }
                        }
                        break;
                    }
                    v7 /* !! */  = nv.ud;
                    if (true) ** GOTO lbl76
                    block60: while (true) {
                        v7 /* !! */  = (long)(v8 - nv.lkwr("llof", lkwv(int ), (int)168));
lbl76:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -1324047713: {
                                v8 = nv.lkwr("llog", lkwv(int ), (int)169);
                                continue block60;
                            }
                            case 315883614: {
                                v8 = nv.lkwr("lloh", lkwv(int ), (int)170);
                                continue block60;
                            }
                            case 345487306: {
                                v8 = nv.lkwr("lloi", lkwv(int ), (int)171);
                                continue block60;
                            }
                            case 1637199440: {
                                break block60;
                            }
                        }
                        break;
                    }
                    v9 = nv.mc.field_1724;
                    v10 /* !! */  = nv.ud;
                    if (true) ** GOTO lbl93
                    block61: while (true) {
                        v10 /* !! */  = (long)(v11 - nv.lkwr("lloj", lkwv(int ), (int)172));
lbl93:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case 44890938: {
                                v11 = nv.lkwr("llok", lkwv(int ), (int)173);
                                continue block61;
                            }
                            case 179217744: {
                                v11 = nv.lkwr("llol", lkwv(int ), (int)174);
                                continue block61;
                            }
                            case 775902632: {
                                v11 = nv.lkwr("llom", lkwv(int ), (int)175);
                                continue block61;
                            }
                            case 1637199440: {
                                break block61;
                            }
                        }
                        break;
                    }
                    v12 = v9.method_31548();
                    while (true) {
                        if ((v13 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("llon", lkwv(int ), (int)176)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v13 /* !! */  == nv.lkwr("lloo", lkwo(int ), (int)284)) break;
                        v13 /* !! */  = (long)nv.lkwr("llop", lkwo(int ), (int)285);
                    }
                    var2_5 = v12.method_5438((int)var1_4);
                    if (var3_3 || var3_3) ** GOTO lbl27
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("lloq", lkwv(int ), (int)177)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v14 /* !! */  == nv.lkwr("llor", lkwo(int ), (int)286)) break;
                        v14 /* !! */  = (long)nv.lkwr("llos", lkwo(int ), (int)287);
                    }
                    if (var2_5.method_7960()) ** GOTO lbl131
                    if (var3_3) ** GOTO lbl27
                    while (true) {
                        if ((v15 /* !! */  = (cfr_temp_5 = nv.ud - nv.lkwr("llot", lkwv(int ), (int)178)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v15 /* !! */  == nv.lkwr("llou", lkwo(int ), (int)288)) break;
                        v15 /* !! */  = (long)nv.lkwr("llov", lkwo(int ), (int)289);
                    }
                    if (var2_5.method_7909() != var0) ** GOTO lbl131
                    if (var3_3 || var3_3) ** GOTO lbl27
                    return (int)var1_4;
lbl131:
                    // 2 sources

                    if (var3_3 || var3_3) ** GOTO lbl27
                    ++var1_4;
                    if (var3_3) ** GOTO lbl27
                } while (!var5_1);
                throw null;
lbl136:
                // 1 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return (int)nv.lkwr("llow", lkwo(int ), (int)290);
            }
            case 0: {
                var4_2 /* !! */  = (int)nv.lkwr("llox", lkwo(int ), (int)291);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl144:
            // 5 sources

            case 1: {
                var4_2 /* !! */  = (int)nv.lkwr("lloy", lkwo(int ), (int)292);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 2: {
                var4_2 /* !! */  = (int)nv.lkwr("lloz", lkwo(int ), (int)293);
                if (!var5_1) ** GOTO lbl144
                throw null;
            }
lbl153:
            // 2 sources

            case 3: {
                var4_2 /* !! */  = (int)nv.lkwr("llpa", lkwo(int ), (int)294);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl158:
            // 2 sources

            case 4: {
                var4_2 /* !! */  = (int)nv.lkwr("llpb", lkwo(int ), (int)295);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 5: {
                var4_2 /* !! */  = (int)nv.lkwr("llpc", lkwo(int ), (int)296);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl208
            }
            case 6: {
                var4_2 /* !! */  = (int)nv.lkwr("llpd", lkwo(int ), (int)297);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl195
            }
lbl173:
            // 3 sources

            case 7: {
                var4_2 /* !! */  = (int)nv.lkwr("llpe", lkwo(int ), (int)298);
                if (!var5_1) break;
                throw null;
            }
lbl177:
            // 2 sources

            case 8: {
                var4_2 /* !! */  = (int)nv.lkwr("llpf", lkwo(int ), (int)299);
                if (!var5_1) ** GOTO lbl173
                throw null;
            }
lbl181:
            // 2 sources

            case 9: {
                var4_2 /* !! */  = (int)nv.lkwr("llpg", lkwo(int ), (int)300);
                if (!var5_1) ** GOTO lbl144
                throw null;
            }
            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)nv.lkwr("llph", lkwo(int ), (int)301);
                    if (!var5_1) ** GOTO lbl177
                    throw null;
                }
            }
lbl190:
            // 2 sources

            case 11: {
                var4_2 /* !! */  = (int)nv.lkwr("llpi", lkwo(int ), (int)302);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl195:
            // 4 sources

            case 12: {
                var4_2 /* !! */  = (int)nv.lkwr("llpj", lkwo(int ), (int)303);
                if (!var5_1) ** GOTO lbl181
                throw null;
            }
lbl199:
            // 2 sources

            case 13: {
                var4_2 /* !! */  = (int)nv.lkwr("llpk", lkwo(int ), (int)304);
                if (!var5_1) ** GOTO lbl195
                throw null;
            }
lbl203:
            // 2 sources

            case 14: {
                do {
                    var4_2 /* !! */  = (int)nv.lkwr("llpl", lkwo(int ), (int)305);
                } while (!var5_1);
                throw null;
            }
lbl208:
            // 2 sources

            case 15: {
                var4_2 /* !! */  = (int)nv.lkwr("llpm", lkwo(int ), (int)306);
                if (!var5_1) ** GOTO lbl153
                throw null;
            }
lbl212:
            // 2 sources

            case 16: {
                var4_2 /* !! */  = (int)nv.lkwr("llpn", lkwo(int ), (int)307);
                if (!var5_1) ** GOTO lbl195
                throw null;
            }
lbl216:
            // 2 sources

            case 17: {
                var4_2 /* !! */  = (int)nv.lkwr("llpo", lkwo(int ), (int)308);
                if (!var5_1) ** GOTO lbl203
                throw null;
            }
            case 18: {
                var4_2 /* !! */  = (int)nv.lkwr("llpp", lkwo(int ), (int)309);
                if (!var5_1) ** GOTO lbl190
                throw null;
            }
            case 19: {
                var4_2 /* !! */  = (int)nv.lkwr("llpq", lkwo(int ), (int)310);
                if (!var5_1) ** GOTO lbl173
                throw null;
            }
            case 20: {
                var4_2 /* !! */  = (int)nv.lkwr("llpr", lkwo(int ), (int)311);
                if (!var5_1) ** GOTO lbl144
                throw null;
            }
lbl232:
            // 2 sources

            case 21: {
                var4_2 /* !! */  = (int)nv.lkwr("llps", lkwo(int ), (int)312);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl237:
            // 2 sources

            case 22: {
                var4_2 /* !! */  = (int)nv.lkwr("llpt", lkwo(int ), (int)313);
                if (!var5_1) ** GOTO lbl199
                throw null;
            }
lbl241:
            // 2 sources

            case 23: {
                var4_2 /* !! */  = (int)nv.lkwr("llpu", lkwo(int ), (int)314);
                if (!var5_1) ** GOTO lbl144
                throw null;
            }
            case 24: 
        }
        var4_2 /* !! */  = (int)nv.lkwr("llpv", lkwo(int ), (int)315);
        ** while (!var5_1)
lbl248:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static int wrapSlot(int n2) {
        int n3;
        Object object = ud;
        boolean bl2 = true;
        block15: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - nv.lkwr("lnxo", lkwv(int ), (int)895);
            }
            switch ((int)object) {
                case -1486035506: {
                    callSite = nv.lkwr("lnxp", lkwv(int ), (int)896);
                    continue block15;
                }
                case 13266010: {
                    callSite = nv.lkwr("lnxq", lkwv(int ), (int)897);
                    continue block15;
                }
                case 188596635: {
                    callSite = nv.lkwr("lnxr", lkwv(int ), (int)898);
                    continue block15;
                }
                case 1637199440: {
                    break block15;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = ud;
        boolean bl4 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - nv.lkwr("lnxs", lkwv(int ), (int)899);
            }
            switch ((int)object2) {
                case -1570418192: {
                    callSite = nv.lkwr("lnxt", lkwv(int ), (int)900);
                    continue block16;
                }
                case 1637199440: {
                    break block16;
                }
                case 1706988738: {
                    callSite = nv.lkwr("lnxu", lkwv(int ), (int)901);
                    continue block16;
                }
            }
            break;
        }
        int n4 = b;
        Object object3 = ud;
        block17: while (true) {
            switch ((int)object3) {
                case 1637199440: {
                    break block17;
                }
                case 1963293722: {
                    object3 = nv.lkwr("lnxw", lkwv(int ), (int)903) - nv.lkwr("lnxv", lkwv(int ), (int)902);
                    continue block17;
                }
            }
            break;
        }
        boolean bl5 = a;
        if (bl3) {
            throw null;
        }
        if (bl5 || bl5) return (int)nv.lkwr("lnxx", lkwo(int ), (int)1152);
        if (n2 < nv.lkwr("lnxy", lkwo(int ), (int)1153)) {
            if (bl5) return (int)nv.lkwr("lnxx", lkwo(int ), (int)1152);
            n3 = n2 + nv.lkwr("lnxz", lkwo(int ), (int)1154);
            if (!bl3) return n3;
            throw null;
        }
        if (bl5 || bl5) {
            return (int)nv.lkwr("lnxx", lkwo(int ), (int)1152);
        }
        n3 = n2;
        return n3;
    }

    private static /* synthetic */ void loit() {
        nv.lkwp[1200] = 903287964;
        nv.lkwp[1201] = -129267500;
        nv.lkwp[1202] = 2108489250;
        nv.lkwp[1203] = 2071342686;
        nv.lkwp[1204] = 664302552;
        nv.lkwp[1205] = -927400783;
        nv.lkwp[1206] = -782672561;
        nv.lkwp[1207] = -320622499;
        nv.lkwp[1208] = -1710979205;
        nv.lkwp[1209] = -1224487533;
        nv.lkwp[1210] = 854069445;
        nv.lkwp[1211] = -680585313;
        nv.lkwp[1212] = -772167125;
        nv.lkwp[1213] = 484372535;
        nv.lkwp[1214] = 1674573663;
        nv.lkwp[1215] = 774999201;
        nv.lkwp[1216] = 661763754;
        nv.lkwp[1217] = 1721605474;
        nv.lkwp[1218] = 831169622;
        nv.lkwp[1219] = -2140410046;
        nv.lkwp[1220] = 1202125453;
        nv.lkwp[1221] = -341523432;
        nv.lkwp[1222] = 923131394;
        nv.lkwp[1223] = -1143216728;
        nv.lkwp[1224] = -1410882842;
        nv.lkwp[1225] = 1053152761;
        nv.lkwp[1226] = 1746583324;
        nv.lkwp[1227] = 506355979;
        nv.lkwp[1228] = -1244792067;
        nv.lkwp[1229] = -1852808594;
        nv.lkwp[1230] = 305518576;
        nv.lkwp[1231] = 1632990979;
        nv.lkwp[1232] = -1680695772;
        nv.lkwp[1233] = -1943703466;
        nv.lkwp[1234] = 1051969593;
        nv.lkwp[1235] = 513193227;
        nv.lkwp[1236] = 1481878734;
        nv.lkwp[1237] = -228973516;
        nv.lkwp[1238] = -581932674;
        nv.lkwp[1239] = 1447494653;
        nv.lkwp[1240] = 1126140947;
        nv.lkwp[1241] = -1127752540;
        nv.lkwp[1242] = 107537294;
        nv.lkwp[1243] = -1727842867;
        nv.lkwp[1244] = -12243283;
        nv.lkwp[1245] = -1344913164;
        nv.lkwp[1246] = 1337669115;
        nv.lkwp[1247] = -718575076;
        nv.lkwp[1248] = -1154869969;
        nv.lkwp[1249] = 1889986896;
        nv.lkwp[1250] = 512876495;
        nv.lkwp[1251] = 377482026;
        nv.lkwp[1252] = -124102057;
        nv.lkwp[1253] = -32281844;
        nv.lkwp[1254] = -115477118;
        nv.lkwp[1255] = 239890831;
        nv.lkwp[1256] = 630038676;
        nv.lkwp[1257] = -348568932;
        nv.lkwp[1258] = 48245046;
        nv.lkwp[1259] = 1857684566;
        nv.lkwp[1260] = -1931779414;
        nv.lkwp[1261] = 254910265;
        nv.lkwp[1262] = 1510178124;
        nv.lkwp[1263] = -1580902198;
        nv.lkwp[1264] = -927309123;
        nv.lkwp[1265] = 1388648794;
        nv.lkwp[1266] = -299744882;
        nv.lkwp[1267] = -817246781;
        nv.lkwp[1268] = -1082721354;
        nv.lkwp[1269] = -724817198;
        nv.lkwp[1270] = -851096370;
        nv.lkwp[1271] = -1089372118;
        nv.lkwp[1272] = -495769168;
        nv.lkwp[1273] = -638505495;
        nv.lkwp[1274] = 316695748;
        nv.lkwp[1275] = 283929792;
        nv.lkwp[1276] = -286226873;
        nv.lkwp[1277] = 488128754;
        nv.lkwp[1278] = 214953271;
        nv.lkwp[1279] = -1377909863;
        nv.lkwp[1280] = 1163610836;
        nv.lkwp[1281] = -976718812;
        nv.lkwp[1282] = -229113536;
        nv.lkwp[1283] = -906864792;
        nv.lkwp[1284] = 1732765636;
        nv.lkwp[1285] = 527441319;
        nv.lkwp[1286] = -1435759896;
        nv.lkwp[1287] = 958877858;
        nv.lkwp[1288] = 539808891;
        nv.lkwp[1289] = 136705127;
        nv.lkwp[1290] = 443219536;
        nv.lkwp[1291] = 329050182;
        nv.lkwp[1292] = -582940819;
        nv.lkwp[1293] = -626509595;
        nv.lkwp[1294] = 1539916415;
        nv.lkwp[1295] = -464890888;
        nv.lkwp[1296] = -548708276;
        nv.lkwp[1297] = 299175508;
        nv.lkwp[1298] = 210753579;
    }

    private static /* synthetic */ void lojm() {
        nv.lkww[500] = 7991468768499751846L;
        nv.lkww[501] = -3236885742895929607L;
        nv.lkww[502] = -6579363176903004651L;
        nv.lkww[503] = 7592702174964521738L;
        nv.lkww[504] = 8531398540280131195L;
        nv.lkww[505] = -6356678154037623121L;
        nv.lkww[506] = -5702630643349627306L;
        nv.lkww[507] = -5257614437882150960L;
        nv.lkww[508] = -8012903284939127892L;
        nv.lkww[509] = -7124083989213143102L;
        nv.lkww[510] = -5470511714945628444L;
        nv.lkww[511] = -9188588423841797581L;
        nv.lkww[512] = 5496192683225973979L;
        nv.lkww[513] = 2351518353729791264L;
        nv.lkww[514] = -1510038254878564205L;
        nv.lkww[515] = 4014585368759867794L;
        nv.lkww[516] = -3559744330647022014L;
        nv.lkww[517] = -6519255080598475928L;
        nv.lkww[518] = -3335811778124480927L;
        nv.lkww[519] = -371893519174032853L;
        nv.lkww[520] = 8176594215306975357L;
        nv.lkww[521] = 7633243330949839602L;
        nv.lkww[522] = 1725790672692074968L;
        nv.lkww[523] = -451791372206360704L;
        nv.lkww[524] = -1170883173831982054L;
        nv.lkww[525] = -9024699421812161807L;
        nv.lkww[526] = -2408506853434303841L;
        nv.lkww[527] = -4709212196805141909L;
        nv.lkww[528] = 3697986225170343688L;
        nv.lkww[529] = 3542533921857237616L;
        nv.lkww[530] = -6031025394594388629L;
        nv.lkww[531] = 1368129912597975749L;
        nv.lkww[532] = -6699413429422053826L;
        nv.lkww[533] = 9176589180847781810L;
        nv.lkww[534] = -8253526543903960140L;
        nv.lkww[535] = -8387062735086406246L;
        nv.lkww[536] = 2215594684637870505L;
        nv.lkww[537] = -5385445902389605938L;
        nv.lkww[538] = 7024324630564907284L;
        nv.lkww[539] = -351833815013735150L;
        nv.lkww[540] = -5280045836400841649L;
        nv.lkww[541] = -2124989611977563870L;
        nv.lkww[542] = -6123051777359118178L;
        nv.lkww[543] = 7695598288307275044L;
        nv.lkww[544] = -3392658217521354916L;
        nv.lkww[545] = -4960793631908520408L;
        nv.lkww[546] = 8134414523010369243L;
        nv.lkww[547] = -7119629064845971076L;
        nv.lkww[548] = -5499718401203866359L;
        nv.lkww[549] = 7957650292253321297L;
        nv.lkww[550] = 7855694309673617555L;
        nv.lkww[551] = 1192174873060840039L;
        nv.lkww[552] = -5478579309166326290L;
        nv.lkww[553] = 3690149649603462738L;
        nv.lkww[554] = -2624030851913190673L;
        nv.lkww[555] = -2978995521824963402L;
        nv.lkww[556] = -5102740894005667588L;
        nv.lkww[557] = -4088701986078382582L;
        nv.lkww[558] = 3891221278122232381L;
        nv.lkww[559] = 556104870291613406L;
        nv.lkww[560] = 2893835905724035700L;
        nv.lkww[561] = 2135857370020960979L;
        nv.lkww[562] = -5779138684676254618L;
        nv.lkww[563] = -5835327911657564007L;
        nv.lkww[564] = 5327567850415422682L;
        nv.lkww[565] = 200845411171390842L;
        nv.lkww[566] = 5551620921809771263L;
        nv.lkww[567] = 808506384686535489L;
        nv.lkww[568] = -8702664004588277305L;
        nv.lkww[569] = -8798598931695415756L;
        nv.lkww[570] = 1644341532675528339L;
        nv.lkww[571] = 3443321941912308322L;
        nv.lkww[572] = -7434727518671408944L;
        nv.lkww[573] = -2880882778181485463L;
        nv.lkww[574] = -2534174755193597597L;
        nv.lkww[575] = 235785717591001558L;
        nv.lkww[576] = 7650361768005572322L;
        nv.lkww[577] = 5997939879598442666L;
        nv.lkww[578] = 7371901235184936517L;
        nv.lkww[579] = 7503183983629907443L;
        nv.lkww[580] = -7547819225065743973L;
        nv.lkww[581] = 4243735512718795945L;
        nv.lkww[582] = 1042043979541597604L;
        nv.lkww[583] = 696438772784870170L;
        nv.lkww[584] = -3606267614177721177L;
        nv.lkww[585] = 3056191724787431103L;
        nv.lkww[586] = 5622854580423040219L;
        nv.lkww[587] = -3733906343787603871L;
        nv.lkww[588] = -7237810605622300462L;
        nv.lkww[589] = 5773568214961423083L;
        nv.lkww[590] = 7862689455217324267L;
        nv.lkww[591] = 4545131303130588761L;
        nv.lkww[592] = -8710420800168999587L;
        nv.lkww[593] = 253060518523810934L;
        nv.lkww[594] = -4523568303127789223L;
        nv.lkww[595] = 1528356458939445751L;
        nv.lkww[596] = 6669597316128062436L;
        nv.lkww[597] = 7516157140034888150L;
        nv.lkww[598] = -274172743232824038L;
        nv.lkww[599] = -7867834188234332034L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private nv() {
        var2_1 /* !! */  = nv.b;
        super();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl7:
            // 2 sources

            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)nv.lkwr("lkws", lkwo(int ), (int)0);
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)nv.lkwr("lkwt", lkwo(int ), (int)1);
                    ** GOTO lbl7
                    break;
                }
            }
            case 2: 
        }
        var2_1 /* !! */  = (int)nv.lkwr("lkwu", lkwo(int ), (int)2);
        ** while (true)
    }

    private static /* synthetic */ void loir() {
        nv.lkwp[1000] = 1260450689;
        nv.lkwp[1001] = -1622906992;
        nv.lkwp[1002] = -409478027;
        nv.lkwp[1003] = 448277486;
        nv.lkwp[1004] = 1939844240;
        nv.lkwp[1005] = 1446853483;
        nv.lkwp[1006] = 999129354;
        nv.lkwp[1007] = -181239952;
        nv.lkwp[1008] = 283815859;
        nv.lkwp[1009] = 1398382718;
        nv.lkwp[1010] = -1076131335;
        nv.lkwp[1011] = 1041585651;
        nv.lkwp[1012] = 1740983600;
        nv.lkwp[1013] = -207957033;
        nv.lkwp[1014] = 1620306131;
        nv.lkwp[1015] = -464191825;
        nv.lkwp[1016] = -1631925216;
        nv.lkwp[1017] = -707096556;
        nv.lkwp[1018] = 1579759053;
        nv.lkwp[1019] = 552377550;
        nv.lkwp[1020] = 1257683140;
        nv.lkwp[1021] = 1494683898;
        nv.lkwp[1022] = 1756679043;
        nv.lkwp[1023] = 431309011;
        nv.lkwp[1024] = -1399365206;
        nv.lkwp[1025] = -1489455685;
        nv.lkwp[1026] = 842187535;
        nv.lkwp[1027] = -1073430000;
        nv.lkwp[1028] = -525790098;
        nv.lkwp[1029] = -272197723;
        nv.lkwp[1030] = 1373573703;
        nv.lkwp[1031] = 1444035521;
        nv.lkwp[1032] = -672436085;
        nv.lkwp[1033] = -2104947187;
        nv.lkwp[1034] = 1964969721;
        nv.lkwp[1035] = -73612316;
        nv.lkwp[1036] = -2091596986;
        nv.lkwp[1037] = -432155363;
        nv.lkwp[1038] = -1076301565;
        nv.lkwp[1039] = -1934581302;
        nv.lkwp[1040] = -1643001533;
        nv.lkwp[1041] = -2118414334;
        nv.lkwp[1042] = 1967434376;
        nv.lkwp[1043] = -447354822;
        nv.lkwp[1044] = 1253557650;
        nv.lkwp[1045] = 1526081005;
        nv.lkwp[1046] = 1002061673;
        nv.lkwp[1047] = -411673931;
        nv.lkwp[1048] = 1528458301;
        nv.lkwp[1049] = -923484832;
        nv.lkwp[1050] = 313056105;
        nv.lkwp[1051] = -1716637918;
        nv.lkwp[1052] = -779865250;
        nv.lkwp[1053] = -149097808;
        nv.lkwp[1054] = 1805245365;
        nv.lkwp[1055] = -93687078;
        nv.lkwp[1056] = 1470992160;
        nv.lkwp[1057] = -1782734660;
        nv.lkwp[1058] = 1563848894;
        nv.lkwp[1059] = -1283890556;
        nv.lkwp[1060] = 1821971148;
        nv.lkwp[1061] = -1005441210;
        nv.lkwp[1062] = 1906893871;
        nv.lkwp[1063] = 489496550;
        nv.lkwp[1064] = -1357894686;
        nv.lkwp[1065] = 1206685906;
        nv.lkwp[1066] = 1454951021;
        nv.lkwp[1067] = 648325526;
        nv.lkwp[1068] = 858433625;
        nv.lkwp[1069] = -1036430471;
        nv.lkwp[1070] = 122181439;
        nv.lkwp[1071] = 558750249;
        nv.lkwp[1072] = -584475814;
        nv.lkwp[1073] = 521383145;
        nv.lkwp[1074] = -1132181963;
        nv.lkwp[1075] = 959875041;
        nv.lkwp[1076] = -860758001;
        nv.lkwp[1077] = -1693627090;
        nv.lkwp[1078] = -1588670639;
        nv.lkwp[1079] = 1051319046;
        nv.lkwp[1080] = -282057454;
        nv.lkwp[1081] = 768035041;
        nv.lkwp[1082] = -447401216;
        nv.lkwp[1083] = -52481572;
        nv.lkwp[1084] = -1032584264;
        nv.lkwp[1085] = -182143413;
        nv.lkwp[1086] = -596345630;
        nv.lkwp[1087] = -649016496;
        nv.lkwp[1088] = -1621665698;
        nv.lkwp[1089] = 731141184;
        nv.lkwp[1090] = -359799226;
        nv.lkwp[1091] = -1049519756;
        nv.lkwp[1092] = 980054434;
        nv.lkwp[1093] = 257841077;
        nv.lkwp[1094] = 415388687;
        nv.lkwp[1095] = -585426248;
        nv.lkwp[1096] = -138002137;
        nv.lkwp[1097] = 28002644;
        nv.lkwp[1098] = 605241174;
        nv.lkwp[1099] = 1854233698;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void silentSwapUseAndReturn(int var0, float var1_1, float var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lngf", lkwv(int ), (int)677)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nv.lkwr("lngg", lkwo(int ), (int)919)) break;
            v0 /* !! */  = (long)nv.lkwr("lngh", lkwo(int ), (int)920);
        }
        var6_3 = nv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lngi", lkwv(int ), (int)678)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nv.lkwr("lngj", lkwo(int ), (int)921)) break;
            v1 /* !! */  = (long)nv.lkwr("lngk", lkwo(int ), (int)922);
        }
        var5_4 /* !! */  = nv.b;
        v2 /* !! */  = nv.ud;
        if (true) ** GOTO lbl17
        block65: while (true) {
            v2 /* !! */  = (long)(v3 - nv.lkwr("lngl", lkwv(int ), (int)679));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1125634239: {
                    v3 = nv.lkwr("lngm", lkwv(int ), (int)680);
                    continue block65;
                }
                case -863900470: {
                    v3 = nv.lkwr("lngn", lkwv(int ), (int)681);
                    continue block65;
                }
                case 1432153208: {
                    v3 = nv.lkwr("lngo", lkwv(int ), (int)682);
                    continue block65;
                }
                case 1637199440: {
                    break block65;
                }
            }
            break;
        }
        var4_5 = nv.a;
        if (var6_3) {
            throw null;
lbl32:
            // 9 sources

            return;
        }
        if (var4_5 || var4_5) ** GOTO lbl32
        v4 /* !! */  = nv.ud;
        if (true) ** GOTO lbl39
        block67: while (true) {
            v4 /* !! */  = (long)(v5 - nv.lkwr("lngp", lkwv(int ), (int)683));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -874838363: {
                    v5 = nv.lkwr("lngq", lkwv(int ), (int)684);
                    continue block67;
                }
                case -698366546: {
                    v5 = nv.lkwr("lngr", lkwv(int ), (int)685);
                    continue block67;
                }
                case -139059230: {
                    v5 = nv.lkwr("lngs", lkwv(int ), (int)686);
                    continue block67;
                }
                case 1637199440: {
                    break block67;
                }
            }
            break;
        }
        v6 /* !! */  = nv.ud;
        if (true) ** GOTO lbl55
        block68: while (true) {
            v6 /* !! */  = (long)(v7 - nv.lkwr("lngt", lkwv(int ), (int)687));
lbl55:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1592789185: {
                    v7 = nv.lkwr("lngu", lkwv(int ), (int)688);
                    continue block68;
                }
                case 1036419427: {
                    v7 = nv.lkwr("lngv", lkwv(int ), (int)689);
                    continue block68;
                }
                case 1637199440: {
                    break block68;
                }
            }
            break;
        }
        if (nv.mc.field_1724 == null) ** GOTO lbl96
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_5) ** GOTO lbl32
                v8 /* !! */  = nv.ud;
                if (true) ** GOTO lbl73
                block69: while (true) {
                    v8 /* !! */  = (long)(v9 - nv.lkwr("lngw", lkwv(int ), (int)690));
lbl73:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -324245518: {
                            v9 = nv.lkwr("lngx", lkwv(int ), (int)691);
                            continue block69;
                        }
                        case -61114757: {
                            v9 = nv.lkwr("lngy", lkwv(int ), (int)692);
                            continue block69;
                        }
                        case 1637199440: {
                            break block69;
                        }
                        case 2144010642: {
                            v9 = nv.lkwr("lngz", lkwv(int ), (int)693);
                            continue block69;
                        }
                    }
                    break;
                }
                v10 /* !! */  = nv.ud;
                if (true) ** GOTO lbl89
                block70: while (true) {
                    v10 /* !! */  = (long)(nv.lkwr("lnhb", lkwv(int ), (int)695) - nv.lkwr("lnha", lkwv(int ), (int)694));
lbl89:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -829922743: {
                            continue block70;
                        }
                        case 1637199440: {
                            break block70;
                        }
                    }
                    break;
                }
                if (nv.mc.method_1562() != null) ** GOTO lbl98
                if (var4_5) ** GOTO lbl32
lbl96:
                // 2 sources

                if (var4_5 || var4_5) ** GOTO lbl32
                return;
lbl98:
                // 1 sources

                if (var4_5 || var4_5) ** GOTO lbl32
                v11 /* !! */  = nv.ud;
                if (true) ** GOTO lbl103
                block71: while (true) {
                    v11 /* !! */  = (long)(v12 - nv.lkwr("lnhc", lkwv(int ), (int)696));
lbl103:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1452851414: {
                            v12 = nv.lkwr("lnhd", lkwv(int ), (int)697);
                            continue block71;
                        }
                        case 1637199440: {
                            break block71;
                        }
                        case 1694824388: {
                            v12 = nv.lkwr("lnhe", lkwv(int ), (int)698);
                            continue block71;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lnhf", lkwv(int ), (int)699)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == nv.lkwr("lnhg", lkwo(int ), (int)923)) break;
                    v13 /* !! */  = (long)nv.lkwr("lnhh", lkwo(int ), (int)924);
                }
                v14 = nv.mc.field_1724;
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("lnhi", lkwv(int ), (int)700)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == nv.lkwr("lnhj", lkwo(int ), (int)925)) break;
                    v15 /* !! */  = (long)nv.lkwr("lnhk", lkwo(int ), (int)926);
                }
                v16 = v14.method_31548();
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("lnhl", lkwv(int ), (int)701)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == nv.lkwr("lnhm", lkwo(int ), (int)927)) break;
                    v17 /* !! */  = (long)nv.lkwr("lnhn", lkwo(int ), (int)928);
                }
                var3_6 = v16.method_67532();
                if (var4_5 || var4_5) ** GOTO lbl32
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_5 = nv.ud - nv.lkwr("lnho", lkwv(int ), (int)702)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == nv.lkwr("lnhp", lkwo(int ), (int)929)) break;
                    v18 /* !! */  = (long)nv.lkwr("lnhq", lkwo(int ), (int)930);
                }
                v19 /* !! */  = nv.ud;
                if (true) ** GOTO lbl140
                block76: while (true) {
                    v19 /* !! */  = (long)(v20 - nv.lkwr("lnhr", lkwv(int ), (int)703));
lbl140:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1901029449: {
                            v20 = nv.lkwr("lnhs", lkwv(int ), (int)704);
                            continue block76;
                        }
                        case 1394758241: {
                            v20 = nv.lkwr("lnht", lkwv(int ), (int)705);
                            continue block76;
                        }
                        case 1608467049: {
                            v20 = nv.lkwr("lnhu", lkwv(int ), (int)706);
                            continue block76;
                        }
                        case 1637199440: {
                            break block76;
                        }
                    }
                    break;
                }
                nv.click(var0, var3_6, class_1713.field_7791);
                if (var4_5 || var4_5) ** GOTO lbl32
                v21 /* !! */  = nv.ud;
                if (true) ** GOTO lbl158
                block77: while (true) {
                    v21 /* !! */  = (long)(nv.lkwr("lnhw", lkwv(int ), (int)708) - nv.lkwr("lnhv", lkwv(int ), (int)707));
lbl158:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -166484076: {
                            continue block77;
                        }
                        case 1637199440: {
                            break block77;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_6 = nv.ud - nv.lkwr("lnhx", lkwv(int ), (int)709)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == nv.lkwr("lnhy", lkwo(int ), (int)931)) break;
                    v22 /* !! */  = (long)nv.lkwr("lnhz", lkwo(int ), (int)932);
                }
                nv.sendUsePacket(class_1268.field_5808, var1_1, var2_2);
                if (var4_5 || var4_5) ** GOTO lbl32
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_7 = nv.ud - nv.lkwr("lnia", lkwv(int ), (int)710)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == nv.lkwr("lnib", lkwo(int ), (int)933)) break;
                    v23 /* !! */  = (long)nv.lkwr("lnic", lkwo(int ), (int)934);
                }
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_8 = nv.ud - nv.lkwr("lnid", lkwv(int ), (int)711)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == nv.lkwr("lnie", lkwo(int ), (int)935)) break;
                    v24 /* !! */  = (long)nv.lkwr("lnif", lkwo(int ), (int)936);
                }
                nv.click(var0, var3_6, class_1713.field_7791);
                if (!var4_5 && !var4_5) ** break;
                ** continue;
                return;
            }
lbl184:
            // 2 sources

            case 0: {
                var5_4 /* !! */  = (int)nv.lkwr("lnig", lkwo(int ), (int)937);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl189:
            // 2 sources

            case 1: {
                var5_4 /* !! */  = (int)nv.lkwr("lnih", lkwo(int ), (int)938);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl245
            }
            case 2: {
                var5_4 /* !! */  = (int)nv.lkwr("lnii", lkwo(int ), (int)939);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl249
            }
            case 3: {
                var5_4 /* !! */  = (int)nv.lkwr("lnij", lkwo(int ), (int)940);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl204:
            // 2 sources

            case 4: {
                var5_4 /* !! */  = (int)nv.lkwr("lnik", lkwo(int ), (int)941);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl209:
            // 2 sources

            case 5: {
                var5_4 /* !! */  = (int)nv.lkwr("lnil", lkwo(int ), (int)942);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl214:
            // 2 sources

            case 6: {
                var5_4 /* !! */  = (int)nv.lkwr("lnim", lkwo(int ), (int)943);
                if (!var6_3) break;
                throw null;
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)nv.lkwr("lnin", lkwo(int ), (int)944);
                    if (var6_3) {
                        throw null;
                    }
                    ** GOTO lbl261
                    break;
                }
            }
lbl224:
            // 2 sources

            case 8: {
                var5_4 /* !! */  = (int)nv.lkwr("lnio", lkwo(int ), (int)945);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl229:
            // 3 sources

            case 9: {
                var5_4 /* !! */  = (int)nv.lkwr("lnip", lkwo(int ), (int)946);
                if (!var6_3) ** GOTO lbl204
                throw null;
            }
lbl233:
            // 3 sources

            case 10: {
                var5_4 /* !! */  = (int)nv.lkwr("lniq", lkwo(int ), (int)947);
                if (!var6_3) ** GOTO lbl214
                throw null;
            }
lbl237:
            // 2 sources

            case 11: {
                var5_4 /* !! */  = (int)nv.lkwr("lnir", lkwo(int ), (int)948);
                if (!var6_3) ** GOTO lbl189
                throw null;
            }
            case 12: {
                var5_4 /* !! */  = (int)nv.lkwr("lnis", lkwo(int ), (int)949);
                if (!var6_3) ** GOTO lbl184
                throw null;
            }
lbl245:
            // 3 sources

            case 13: {
                var5_4 /* !! */  = (int)nv.lkwr("lnit", lkwo(int ), (int)950);
                if (!var6_3) ** GOTO lbl237
                throw null;
            }
lbl249:
            // 2 sources

            case 14: {
                var5_4 /* !! */  = (int)nv.lkwr("lniu", lkwo(int ), (int)951);
                if (!var6_3) ** GOTO lbl224
                throw null;
            }
            case 15: {
                var5_4 /* !! */  = (int)nv.lkwr("lniv", lkwo(int ), (int)952);
                if (var6_3) {
                    throw null;
                }
            }
lbl257:
            // 4 sources

            case 16: {
                var5_4 /* !! */  = (int)nv.lkwr("lniw", lkwo(int ), (int)953);
                if (!var6_3) ** GOTO lbl209
                throw null;
            }
lbl261:
            // 2 sources

            case 17: {
                var5_4 /* !! */  = (int)nv.lkwr("lnix", lkwo(int ), (int)954);
                if (!var6_3) ** GOTO lbl245
                throw null;
            }
            case 18: 
        }
        var5_4 /* !! */  = (int)nv.lkwr("lniy", lkwo(int ), (int)955);
        ** while (!var6_3)
lbl268:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void sendUsePacket(class_1268 var0) {
        block62: {
            v0 /* !! */  = nv.ud;
            if (true) ** GOTO lbl5
            block41: while (true) {
                v0 /* !! */  = (long)(v1 - nv.lkwr("lnne", lkwv(int ), (int)750));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -723241291: {
                        v1 = nv.lkwr("lnnf", lkwv(int ), (int)751);
                        continue block41;
                    }
                    case 247253005: {
                        v1 = nv.lkwr("lnng", lkwv(int ), (int)752);
                        continue block41;
                    }
                    case 1637199440: {
                        break block41;
                    }
                    case 1738338739: {
                        v1 = nv.lkwr("lnnh", lkwv(int ), (int)753);
                        continue block41;
                    }
                }
                break;
            }
            var3_1 = nv.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lnni", lkwv(int ), (int)754)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == nv.lkwr("lnnj", lkwo(int ), (int)1027)) break;
                v2 /* !! */  = (long)nv.lkwr("lnnk", lkwo(int ), (int)1028);
            }
            var2_2 /* !! */  = nv.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lnnl", lkwv(int ), (int)755)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == nv.lkwr("lnnm", lkwo(int ), (int)1029)) break;
                v3 /* !! */  = (long)nv.lkwr("lnnn", lkwo(int ), (int)1030);
            }
            var1_3 = nv.a;
            if (var3_1) {
                throw null;
lbl32:
                // 5 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl32
            v4 /* !! */  = nv.ud;
            if (true) ** GOTO lbl39
            block45: while (true) {
                v4 /* !! */  = (long)(v5 - nv.lkwr("lnno", lkwv(int ), (int)756));
lbl39:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case 56941379: {
                        v5 = nv.lkwr("lnnp", lkwv(int ), (int)757);
                        continue block45;
                    }
                    case 1637199440: {
                        break block45;
                    }
                    case 1705219561: {
                        v5 = nv.lkwr("lnnq", lkwv(int ), (int)758);
                        continue block45;
                    }
                }
                break;
            }
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lnnr", lkwv(int ), (int)759)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == nv.lkwr("lnns", lkwo(int ), (int)1031)) break;
                v6 /* !! */  = (long)nv.lkwr("lnnt", lkwo(int ), (int)1032);
            }
            if (nv.mc.field_1724 != null) break block62;
            if (var1_3 || var1_3) ** GOTO lbl32
            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("lnnu", lkwv(int ), (int)760)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == nv.lkwr("lnnv", lkwo(int ), (int)1033)) break;
            v7 /* !! */  = (long)nv.lkwr("lnnw", lkwo(int ), (int)1034);
        }
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("lnnx", lkwv(int ), (int)761)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == nv.lkwr("lnny", lkwo(int ), (int)1035)) break;
            v8 /* !! */  = (long)nv.lkwr("lnnz", lkwo(int ), (int)1036);
        }
        v9 = nv.mc.field_1724;
        v10 /* !! */  = nv.ud;
        if (true) ** GOTO lbl73
        block49: while (true) {
            v10 /* !! */  = (long)(v11 - nv.lkwr("lnoa", lkwv(int ), (int)762));
lbl73:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1599288030: {
                    v11 = nv.lkwr("lnob", lkwv(int ), (int)763);
                    continue block49;
                }
                case -1390170508: {
                    v11 = nv.lkwr("lnoc", lkwv(int ), (int)764);
                    continue block49;
                }
                case -837614367: {
                    v11 = nv.lkwr("lnod", lkwv(int ), (int)765);
                    continue block49;
                }
                case 1637199440: {
                    break block49;
                }
            }
            break;
        }
        v12 = v9.method_36454();
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_5 = nv.ud - nv.lkwr("lnoe", lkwv(int ), (int)766)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == nv.lkwr("lnof", lkwo(int ), (int)1037)) break;
            v13 /* !! */  = (long)nv.lkwr("lnog", lkwo(int ), (int)1038);
        }
        v14 /* !! */  = nv.ud;
        if (true) ** GOTO lbl95
        block51: while (true) {
            v14 /* !! */  = (long)(v15 - nv.lkwr("lnoh", lkwv(int ), (int)767));
lbl95:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case 197327736: {
                    v15 = nv.lkwr("lnoi", lkwv(int ), (int)768);
                    continue block51;
                }
                case 834307149: {
                    v15 = nv.lkwr("lnoj", lkwv(int ), (int)769);
                    continue block51;
                }
                case 1637199440: {
                    break block51;
                }
            }
            break;
        }
        v16 = nv.mc.field_1724;
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_6 = nv.ud - nv.lkwr("lnok", lkwv(int ), (int)770)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == nv.lkwr("lnol", lkwo(int ), (int)1039)) break;
            v17 /* !! */  = (long)nv.lkwr("lnom", lkwo(int ), (int)1040);
        }
        v18 = v16.method_36455();
        v19 /* !! */  = nv.ud;
        if (true) ** GOTO lbl115
        block53: while (true) {
            v19 /* !! */  = (long)(v20 - nv.lkwr("lnon", lkwv(int ), (int)771));
lbl115:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -313289025: {
                    v20 = nv.lkwr("lnoo", lkwv(int ), (int)772);
                    continue block53;
                }
                case -303660574: {
                    v20 = nv.lkwr("lnop", lkwv(int ), (int)773);
                    continue block53;
                }
                case 267702119: {
                    v20 = nv.lkwr("lnoq", lkwv(int ), (int)774);
                    continue block53;
                }
                case 1637199440: {
                    break block53;
                }
            }
            break;
        }
        nv.sendUsePacket(var0, v12, v18);
        if (var1_3) ** GOTO lbl32
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block28 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                return;
            }
lbl135:
            // 4 sources

            case 0: {
                var2_2 /* !! */  = (int)nv.lkwr("lnor", lkwo(int ), (int)1041);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 1: {
                var2_2 /* !! */  = (int)nv.lkwr("lnos", lkwo(int ), (int)1042);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 2: {
                var2_2 /* !! */  = (int)nv.lkwr("lnot", lkwo(int ), (int)1043);
                if (!var3_1) ** GOTO lbl135
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)nv.lkwr("lnou", lkwo(int ), (int)1044);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 4: {
                var2_2 /* !! */  = (int)nv.lkwr("lnov", lkwo(int ), (int)1045);
                if (!var3_1) ** GOTO lbl135
                throw null;
            }
lbl158:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)nv.lkwr("lnow", lkwo(int ), (int)1046);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 6: {
                var2_2 /* !! */  = (int)nv.lkwr("lnox", lkwo(int ), (int)1047);
                if (!var3_1) ** GOTO lbl158
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)nv.lkwr("lnoy", lkwo(int ), (int)1048);
                if (!var3_1) break;
                throw null;
            }
lbl171:
            // 3 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nv.lkwr("lnoz", lkwo(int ), (int)1049);
                    if (!var3_1) break block28;
                    throw null;
                }
            }
lbl176:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)nv.lkwr("lnpa", lkwo(int ), (int)1050);
                if (!var3_1) ** GOTO lbl135
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)nv.lkwr("lnpb", lkwo(int ), (int)1051);
        ** while (!var3_1)
lbl183:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lojx() {
        nv.lkwx[500] = -6940883344754449695L;
        nv.lkwx[501] = -5498368313785102012L;
        nv.lkwx[502] = -7141879079808539616L;
        nv.lkwx[503] = -5960241343620614641L;
        nv.lkwx[504] = -7203182809610053772L;
        nv.lkwx[505] = 6678186414923697995L;
        nv.lkwx[506] = 253846059014036899L;
        nv.lkwx[507] = -3732793487919557375L;
        nv.lkwx[508] = -7754127524666313748L;
        nv.lkwx[509] = -4524578742321771273L;
        nv.lkwx[510] = -1651702121634090421L;
        nv.lkwx[511] = 2084859339052896782L;
        nv.lkwx[512] = 5900493486506752757L;
        nv.lkwx[513] = -1104035177333455441L;
        nv.lkwx[514] = -7519111580467963245L;
        nv.lkwx[515] = -1514683509554728767L;
        nv.lkwx[516] = -6805471447075119116L;
        nv.lkwx[517] = -2327589880770895929L;
        nv.lkwx[518] = 367448748451691396L;
        nv.lkwx[519] = 450829585896778997L;
        nv.lkwx[520] = 8697243367474847547L;
        nv.lkwx[521] = 5954265853548247602L;
        nv.lkwx[522] = -4765101537351078L;
        nv.lkwx[523] = -3746752356265861735L;
        nv.lkwx[524] = -6771409335800542293L;
        nv.lkwx[525] = 3176912484826999753L;
        nv.lkwx[526] = 6035560200038792955L;
        nv.lkwx[527] = -5752490723216135976L;
        nv.lkwx[528] = -428982777682425071L;
        nv.lkwx[529] = 1285917631258486905L;
        nv.lkwx[530] = -5106719102777684835L;
        nv.lkwx[531] = -2125753222296528143L;
        nv.lkwx[532] = 176550967666408599L;
        nv.lkwx[533] = -939038621019971111L;
        nv.lkwx[534] = -6782668780070283415L;
        nv.lkwx[535] = -632288457420388875L;
        nv.lkwx[536] = 6780813779320334676L;
        nv.lkwx[537] = -8671381885362121100L;
        nv.lkwx[538] = 8857407731721404510L;
        nv.lkwx[539] = 3063958168045459741L;
        nv.lkwx[540] = 1973676715743034040L;
        nv.lkwx[541] = -7226185102595574671L;
        nv.lkwx[542] = -2981668170110548721L;
        nv.lkwx[543] = -1692025274976525074L;
        nv.lkwx[544] = -2949351726158642200L;
        nv.lkwx[545] = 3910776367727748771L;
        nv.lkwx[546] = 806389332421179060L;
        nv.lkwx[547] = 7643921392672290660L;
        nv.lkwx[548] = 7823655097708185454L;
        nv.lkwx[549] = -732226956255263429L;
        nv.lkwx[550] = -8687957170359993756L;
        nv.lkwx[551] = 840921886839846011L;
        nv.lkwx[552] = -1528740574563634062L;
        nv.lkwx[553] = -2008615465883718807L;
        nv.lkwx[554] = -2206003883436425248L;
        nv.lkwx[555] = -4591279667230371854L;
        nv.lkwx[556] = 5847823105868412250L;
        nv.lkwx[557] = 6415273903289007743L;
        nv.lkwx[558] = -5658454892609500033L;
        nv.lkwx[559] = -57523255438727922L;
        nv.lkwx[560] = 76079111069749634L;
        nv.lkwx[561] = -6143538509656410019L;
        nv.lkwx[562] = -1074691906964686160L;
        nv.lkwx[563] = -4119687865300172842L;
        nv.lkwx[564] = -2347033606232645324L;
        nv.lkwx[565] = 1681308663476460066L;
        nv.lkwx[566] = -8259398112530544702L;
        nv.lkwx[567] = 2761905655546053941L;
        nv.lkwx[568] = 8053165613750474658L;
        nv.lkwx[569] = 5759166041340758301L;
        nv.lkwx[570] = -6248538551334621329L;
        nv.lkwx[571] = 1333182443689223240L;
        nv.lkwx[572] = -1499025853894956968L;
        nv.lkwx[573] = 8788508817781630311L;
        nv.lkwx[574] = -3343542924998480677L;
        nv.lkwx[575] = 2255466593088623341L;
        nv.lkwx[576] = -3574395202698889010L;
        nv.lkwx[577] = -5871034670531430654L;
        nv.lkwx[578] = -7792608299640248946L;
        nv.lkwx[579] = 2864976380270503244L;
        nv.lkwx[580] = 4570081374598219285L;
        nv.lkwx[581] = 3743484157843694124L;
        nv.lkwx[582] = 1854009053966990861L;
        nv.lkwx[583] = 1846806005170838912L;
        nv.lkwx[584] = -2785866026951324103L;
        nv.lkwx[585] = 5530179373353426504L;
        nv.lkwx[586] = 809201488767385841L;
        nv.lkwx[587] = 9060168279785556180L;
        nv.lkwx[588] = -4057535453598902400L;
        nv.lkwx[589] = -6481496110402017596L;
        nv.lkwx[590] = 9217699374302412667L;
        nv.lkwx[591] = -8530244935942881876L;
        nv.lkwx[592] = -429528965363202009L;
        nv.lkwx[593] = 2831923084507850519L;
        nv.lkwx[594] = -5484600006011808051L;
        nv.lkwx[595] = -7538118482718727399L;
        nv.lkwx[596] = 3729168714668043352L;
        nv.lkwx[597] = -3982656427127761724L;
        nv.lkwx[598] = -5287826865941344088L;
        nv.lkwx[599] = 2574038208599850919L;
    }

    private static /* synthetic */ void lojb() {
        nv.lkwq[700] = 1238273110;
        nv.lkwq[701] = -1206210531;
        nv.lkwq[702] = 143693618;
        nv.lkwq[703] = 75005161;
        nv.lkwq[704] = 1643498857;
        nv.lkwq[705] = 1798974006;
        nv.lkwq[706] = 1873520695;
        nv.lkwq[707] = 891009490;
        nv.lkwq[708] = 577796215;
        nv.lkwq[709] = 2022776461;
        nv.lkwq[710] = 811156567;
        nv.lkwq[711] = -1513077533;
        nv.lkwq[712] = 1032886550;
        nv.lkwq[713] = -979383131;
        nv.lkwq[714] = 556341712;
        nv.lkwq[715] = 2141717918;
        nv.lkwq[716] = 464537442;
        nv.lkwq[717] = 351634782;
        nv.lkwq[718] = -479434191;
        nv.lkwq[719] = 1891598084;
        nv.lkwq[720] = -1094316661;
        nv.lkwq[721] = 2009010785;
        nv.lkwq[722] = 1356162320;
        nv.lkwq[723] = -995574868;
        nv.lkwq[724] = -398403258;
        nv.lkwq[725] = 1540860678;
        nv.lkwq[726] = -1392296800;
        nv.lkwq[727] = -79046635;
        nv.lkwq[728] = -678138072;
        nv.lkwq[729] = 732614010;
        nv.lkwq[730] = -998454763;
        nv.lkwq[731] = -1630656590;
        nv.lkwq[732] = 1132314628;
        nv.lkwq[733] = -2072063160;
        nv.lkwq[734] = 2091498202;
        nv.lkwq[735] = -1851144107;
        nv.lkwq[736] = -823872442;
        nv.lkwq[737] = 1850978209;
        nv.lkwq[738] = -1232854718;
        nv.lkwq[739] = -295067549;
        nv.lkwq[740] = -53565566;
        nv.lkwq[741] = 1122353949;
        nv.lkwq[742] = 1477016112;
        nv.lkwq[743] = -2136645829;
        nv.lkwq[744] = 2004497348;
        nv.lkwq[745] = 1833455035;
        nv.lkwq[746] = -2067877764;
        nv.lkwq[747] = 1699697691;
        nv.lkwq[748] = 588882690;
        nv.lkwq[749] = 1390009374;
        nv.lkwq[750] = -800301681;
        nv.lkwq[751] = -1454217617;
        nv.lkwq[752] = -1513663716;
        nv.lkwq[753] = -517770846;
        nv.lkwq[754] = 37251056;
        nv.lkwq[755] = -97639287;
        nv.lkwq[756] = -1193553002;
        nv.lkwq[757] = -1369687201;
        nv.lkwq[758] = -208549500;
        nv.lkwq[759] = -496856818;
        nv.lkwq[760] = -330614789;
        nv.lkwq[761] = -2110425475;
        nv.lkwq[762] = 1279068258;
        nv.lkwq[763] = -1960701487;
        nv.lkwq[764] = 1049968017;
        nv.lkwq[765] = 1454044721;
        nv.lkwq[766] = 1878984440;
        nv.lkwq[767] = 1669408507;
        nv.lkwq[768] = -625061904;
        nv.lkwq[769] = -460015203;
        nv.lkwq[770] = 1252833762;
        nv.lkwq[771] = 1946386893;
        nv.lkwq[772] = -1336195949;
        nv.lkwq[773] = -287662248;
        nv.lkwq[774] = 242081685;
        nv.lkwq[775] = -443935826;
        nv.lkwq[776] = -230198507;
        nv.lkwq[777] = -2135486377;
        nv.lkwq[778] = -689786766;
        nv.lkwq[779] = 520286139;
        nv.lkwq[780] = -2064159447;
        nv.lkwq[781] = 936299424;
        nv.lkwq[782] = 189437938;
        nv.lkwq[783] = -1160293579;
        nv.lkwq[784] = 244999429;
        nv.lkwq[785] = 438895966;
        nv.lkwq[786] = 1068860716;
        nv.lkwq[787] = -597074904;
        nv.lkwq[788] = -1538606993;
        nv.lkwq[789] = 591225871;
        nv.lkwq[790] = -1790445112;
        nv.lkwq[791] = 1646684185;
        nv.lkwq[792] = 762788852;
        nv.lkwq[793] = -1226240346;
        nv.lkwq[794] = -2062476762;
        nv.lkwq[795] = 1427821997;
        nv.lkwq[796] = 1598041395;
        nv.lkwq[797] = -983574036;
        nv.lkwq[798] = 664315767;
        nv.lkwq[799] = 2034419152;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void closeScreen() {
        v0 /* !! */  = nv.ud;
        if (true) ** GOTO lbl5
        block73: while (true) {
            v0 /* !! */  = (long)(v1 - nv.lkwr("lnvc", lkwv(int ), (int)854));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -260200010: {
                    v1 = nv.lkwr("lnvd", lkwv(int ), (int)855);
                    continue block73;
                }
                case 1637199440: {
                    break block73;
                }
                case 2007395819: {
                    v1 = nv.lkwr("lnve", lkwv(int ), (int)856);
                    continue block73;
                }
            }
            break;
        }
        var2 = nv.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lnvf", lkwv(int ), (int)857)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nv.lkwr("lnvg", lkwo(int ), (int)1129)) break;
            v2 /* !! */  = (long)nv.lkwr("lnvh", lkwo(int ), (int)1130);
        }
        var1_1 /* !! */  = nv.b;
        v3 /* !! */  = nv.ud;
        if (true) ** GOTO lbl25
        block75: while (true) {
            v3 /* !! */  = (long)(v4 - nv.lkwr("lnvi", lkwv(int ), (int)858));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1393732999: {
                    v4 = nv.lkwr("lnvj", lkwv(int ), (int)859);
                    continue block75;
                }
                case 1637199440: {
                    break block75;
                }
                case 1856289596: {
                    v4 = nv.lkwr("lnvk", lkwv(int ), (int)860);
                    continue block75;
                }
            }
            break;
        }
        var0_2 = nv.a;
        if (var2) {
            throw null;
lbl37:
            // 6 sources

            return;
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** GOTO lbl37
                v5 /* !! */  = nv.ud;
                if (true) ** GOTO lbl47
                block77: while (true) {
                    v5 /* !! */  = (long)(nv.lkwr("lnvm", lkwv(int ), (int)862) - nv.lkwr("lnvl", lkwv(int ), (int)861));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1727278207: {
                            continue block77;
                        }
                        case 1637199440: {
                            break block77;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lnvn", lkwv(int ), (int)863)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == nv.lkwr("lnvo", lkwo(int ), (int)1131)) break;
                    v6 /* !! */  = (long)nv.lkwr("lnvp", lkwo(int ), (int)1132);
                }
                if (nv.mc.field_1724 == null) ** GOTO lbl86
                if (var0_2) ** GOTO lbl37
                v7 /* !! */  = nv.ud;
                if (true) ** GOTO lbl63
                block79: while (true) {
                    v7 /* !! */  = (long)(v8 - nv.lkwr("lnvq", lkwv(int ), (int)864));
lbl63:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 26554177: {
                            v8 = nv.lkwr("lnvr", lkwv(int ), (int)865);
                            continue block79;
                        }
                        case 451024219: {
                            v8 = nv.lkwr("lnvs", lkwv(int ), (int)866);
                            continue block79;
                        }
                        case 1637199440: {
                            break block79;
                        }
                        case 1679445156: {
                            v8 = nv.lkwr("lnvt", lkwv(int ), (int)867);
                            continue block79;
                        }
                    }
                    break;
                }
                v9 /* !! */  = nv.ud;
                if (true) ** GOTO lbl79
                block80: while (true) {
                    v9 /* !! */  = (long)(nv.lkwr("lnvv", lkwv(int ), (int)869) - nv.lkwr("lnvu", lkwv(int ), (int)868));
lbl79:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 1637199440: {
                            break block80;
                        }
                        case 1701590390: {
                            continue block80;
                        }
                    }
                    break;
                }
                if (nv.mc.method_1562() != null) ** GOTO lbl88
                if (var0_2) ** GOTO lbl37
lbl86:
                // 2 sources

                if (var0_2 || var0_2) ** GOTO lbl37
                return;
lbl88:
                // 1 sources

                if (var0_2 || var0_2) ** GOTO lbl37
                v10 /* !! */  = nv.ud;
                if (true) ** GOTO lbl93
                block81: while (true) {
                    v10 /* !! */  = (long)(v11 - nv.lkwr("lnvw", lkwv(int ), (int)870));
lbl93:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 307282303: {
                            v11 = nv.lkwr("lnvx", lkwv(int ), (int)871);
                            continue block81;
                        }
                        case 470395545: {
                            v11 = nv.lkwr("lnvy", lkwv(int ), (int)872);
                            continue block81;
                        }
                        case 492197312: {
                            v11 = nv.lkwr("lnvz", lkwv(int ), (int)873);
                            continue block81;
                        }
                        case 1637199440: {
                            break block81;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lnwa", lkwv(int ), (int)874)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == nv.lkwr("lnwb", lkwo(int ), (int)1133)) break;
                    v12 /* !! */  = (long)nv.lkwr("lnwc", lkwo(int ), (int)1134);
                }
                v13 = nv.mc.method_1562();
                v14 /* !! */  = nv.ud;
                if (true) ** GOTO lbl115
                block83: while (true) {
                    v14 /* !! */  = (long)(v15 - nv.lkwr("lnwd", lkwv(int ), (int)875));
lbl115:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1638367575: {
                            v15 = nv.lkwr("lnwe", lkwv(int ), (int)876);
                            continue block83;
                        }
                        case 668466575: {
                            v15 = nv.lkwr("lnwf", lkwv(int ), (int)877);
                            continue block83;
                        }
                        case 959668298: {
                            v15 = nv.lkwr("lnwg", lkwv(int ), (int)878);
                            continue block83;
                        }
                        case 1637199440: {
                            break block83;
                        }
                    }
                    break;
                }
                v16 /* !! */  = nv.ud;
                if (true) ** GOTO lbl131
                block84: while (true) {
                    v16 /* !! */  = (long)(v17 - nv.lkwr("lnwh", lkwv(int ), (int)879));
lbl131:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -152516761: {
                            v17 = nv.lkwr("lnwi", lkwv(int ), (int)880);
                            continue block84;
                        }
                        case 114720903: {
                            v17 = nv.lkwr("lnwj", lkwv(int ), (int)881);
                            continue block84;
                        }
                        case 707586569: {
                            v17 = nv.lkwr("lnwk", lkwv(int ), (int)882);
                            continue block84;
                        }
                        case 1637199440: {
                            break block84;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("lnwl", lkwv(int ), (int)883)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == nv.lkwr("lnwm", lkwo(int ), (int)1135)) break;
                    v18 /* !! */  = (long)nv.lkwr("lnwn", lkwo(int ), (int)1136);
                }
                v19 = nv.mc.field_1724;
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("lnwo", lkwv(int ), (int)884)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == nv.lkwr("lnwp", lkwo(int ), (int)1137)) break;
                    v20 /* !! */  = (long)nv.lkwr("lnwq", lkwo(int ), (int)1138);
                }
                v21 = v19.field_7512;
                v22 /* !! */  = nv.ud;
                if (true) ** GOTO lbl159
                block87: while (true) {
                    v22 /* !! */  = (long)(v23 - nv.lkwr("lnwr", lkwv(int ), (int)885));
lbl159:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -837410137: {
                            v23 = nv.lkwr("lnws", lkwv(int ), (int)886);
                            continue block87;
                        }
                        case 218530811: {
                            v23 = nv.lkwr("lnwt", lkwv(int ), (int)887);
                            continue block87;
                        }
                        case 882902004: {
                            v23 = nv.lkwr("lnwu", lkwv(int ), (int)888);
                            continue block87;
                        }
                        case 1637199440: {
                            break block87;
                        }
                    }
                    break;
                }
                v24 = v21.field_7763;
                v25 /* !! */  = nv.ud;
                if (true) ** GOTO lbl176
                block88: while (true) {
                    v25 /* !! */  = (long)(v26 - nv.lkwr("lnwv", lkwv(int ), (int)889));
lbl176:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -2002230640: {
                            v26 = nv.lkwr("lnww", lkwv(int ), (int)890);
                            continue block88;
                        }
                        case 1210500335: {
                            v26 = nv.lkwr("lnwx", lkwv(int ), (int)891);
                            continue block88;
                        }
                        case 1637199440: {
                            break block88;
                        }
                    }
                    break;
                }
                v27 = new class_2815(v24);
                v28 /* !! */  = nv.ud;
                if (true) ** GOTO lbl190
                block89: while (true) {
                    v28 /* !! */  = (long)(v29 - nv.lkwr("lnwy", lkwv(int ), (int)892));
lbl190:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -561911774: {
                            v29 = nv.lkwr("lnwz", lkwv(int ), (int)893);
                            continue block89;
                        }
                        case 1637199440: {
                            break block89;
                        }
                        case 2076553498: {
                            v29 = nv.lkwr("lnxa", lkwv(int ), (int)894);
                            continue block89;
                        }
                    }
                    break;
                }
                v13.method_52787((class_2596)v27);
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
lbl203:
            // 2 sources

            case 0: {
                do {
                    var1_1 /* !! */  = (int)nv.lkwr("lnxb", lkwo(int ), (int)1139);
                } while (!var2);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)nv.lkwr("lnxc", lkwo(int ), (int)1140);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl241
                    break;
                }
            }
lbl214:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)nv.lkwr("lnxd", lkwo(int ), (int)1141);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl249
            }
            case 3: {
                var1_1 /* !! */  = (int)nv.lkwr("lnxe", lkwo(int ), (int)1142);
                if (var2) {
                    throw null;
                }
            }
            case 4: {
                do {
                    var1_1 /* !! */  = (int)nv.lkwr("lnxf", lkwo(int ), (int)1143);
                } while (!var2);
                throw null;
            }
lbl228:
            // 2 sources

            case 5: {
                var1_1 /* !! */  = (int)nv.lkwr("lnxg", lkwo(int ), (int)1144);
                if (!var2) ** GOTO lbl214
                throw null;
            }
            case 6: {
                var1_1 /* !! */  = (int)nv.lkwr("lnxh", lkwo(int ), (int)1145);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl237:
            // 2 sources

            case 7: {
                var1_1 /* !! */  = (int)nv.lkwr("lnxi", lkwo(int ), (int)1146);
                if (var2) {
                    throw null;
                }
            }
lbl241:
            // 5 sources

            case 8: {
                var1_1 /* !! */  = (int)nv.lkwr("lnxj", lkwo(int ), (int)1147);
                if (!var2) ** GOTO lbl203
                throw null;
            }
            case 9: {
                var1_1 /* !! */  = (int)nv.lkwr("lnxk", lkwo(int ), (int)1148);
                if (!var2) ** GOTO lbl228
                throw null;
            }
lbl249:
            // 2 sources

            case 10: {
                var1_1 /* !! */  = (int)nv.lkwr("lnxl", lkwo(int ), (int)1149);
                if (var2) {
                    throw null;
                }
            }
            case 11: {
                var1_1 /* !! */  = (int)nv.lkwr("lnxm", lkwo(int ), (int)1150);
                if (!var2) ** GOTO lbl237
                throw null;
            }
            case 12: 
        }
        var1_1 /* !! */  = (int)nv.lkwr("lnxn", lkwo(int ), (int)1151);
        ** while (!var2)
lbl260:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$find$0(class_1792 var0, class_1799 var1_1) {
        v0 /* !! */  = nv.ud;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(nv.lkwr("lohk", lkwv(int ), (int)1020) - nv.lkwr("lohj", lkwv(int ), (int)1019));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 164317650: {
                    continue block23;
                }
                case 1637199440: {
                    break block23;
                }
            }
            break;
        }
        var4_2 = nv.c;
        v1 /* !! */  = nv.ud;
        if (true) ** GOTO lbl15
        block24: while (true) {
            v1 /* !! */  = (long)(nv.lkwr("lohm", lkwv(int ), (int)1022) - nv.lkwr("lohl", lkwv(int ), (int)1021));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1179352654: {
                    continue block24;
                }
                case 1637199440: {
                    break block24;
                }
            }
            break;
        }
        var3_3 /* !! */  = nv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lohn", lkwv(int ), (int)1023)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nv.lkwr("loho", lkwo(int ), (int)1283)) break;
            v2 /* !! */  = (long)nv.lkwr("lohp", lkwo(int ), (int)1284);
        }
        var2_4 = nv.a;
        if (var4_2) {
            throw null;
lbl30:
            // 3 sources

            return (boolean)nv.lkwr("lohq", lkwo(int ), (int)1285);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl30
                v3 /* !! */  = nv.ud;
                if (true) ** GOTO lbl40
                block27: while (true) {
                    v3 /* !! */  = (long)(v4 - nv.lkwr("lohr", lkwv(int ), (int)1024));
lbl40:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -805758194: {
                            v4 = nv.lkwr("lohs", lkwv(int ), (int)1025);
                            continue block27;
                        }
                        case 1532214167: {
                            v4 = nv.lkwr("loht", lkwv(int ), (int)1026);
                            continue block27;
                        }
                        case 1637199440: {
                            break block27;
                        }
                    }
                    break;
                }
                if (var1_1.method_7909() != var0) ** GOTO lbl55
                if (var2_4) ** GOTO lbl30
                v5 = nv.lkwr("lohu", lkwo(int ), (int)1286);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl58
lbl55:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v5 = nv.lkwr("lohv", lkwo(int ), (int)1287);
lbl58:
                // 2 sources

                return (boolean)v5;
            }
lbl59:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)nv.lkwr("lohw", lkwo(int ), (int)1288);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl68
            }
            case 1: {
                var3_3 /* !! */  = (int)nv.lkwr("lohx", lkwo(int ), (int)1289);
                if (!var4_2) ** GOTO lbl59
                throw null;
            }
lbl68:
            // 3 sources

            case 2: {
                do {
                    var3_3 /* !! */  = (int)nv.lkwr("lohy", lkwo(int ), (int)1290);
                } while (!var4_2);
                throw null;
            }
lbl73:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)nv.lkwr("lohz", lkwo(int ), (int)1291);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)nv.lkwr("loia", lkwo(int ), (int)1292);
                if (!var4_2) ** GOTO lbl68
                throw null;
            }
lbl82:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)nv.lkwr("loib", lkwo(int ), (int)1293);
                if (!var4_2) ** GOTO lbl73
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)nv.lkwr("loic", lkwo(int ), (int)1294);
                if (!var4_2) ** GOTO lbl82
                throw null;
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)nv.lkwr("loid", lkwo(int ), (int)1295);
        ** while (!var4_2)
lbl93:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void loka() {
        nv.lkwx[800] = -6596248082923360700L;
        nv.lkwx[801] = 4696633361401650316L;
        nv.lkwx[802] = -4086534994116267153L;
        nv.lkwx[803] = -3386408698785312788L;
        nv.lkwx[804] = -2162330808237279032L;
        nv.lkwx[805] = -8279048073897369648L;
        nv.lkwx[806] = -7973146443649029201L;
        nv.lkwx[807] = -762086806856784684L;
        nv.lkwx[808] = 3587542725792992568L;
        nv.lkwx[809] = -6716909824872713347L;
        nv.lkwx[810] = -3817387117564144758L;
        nv.lkwx[811] = -9159220848630102326L;
        nv.lkwx[812] = 2823606185823195119L;
        nv.lkwx[813] = 3045487302043952960L;
        nv.lkwx[814] = 3611528405908527385L;
        nv.lkwx[815] = 7845272731151973908L;
        nv.lkwx[816] = -9165604380088214682L;
        nv.lkwx[817] = -5220832272413080077L;
        nv.lkwx[818] = -341130973679273951L;
        nv.lkwx[819] = 1293652896540493228L;
        nv.lkwx[820] = -9174675717331724064L;
        nv.lkwx[821] = -8801915657051410368L;
        nv.lkwx[822] = 8610951503785260164L;
        nv.lkwx[823] = -4107149001769269986L;
        nv.lkwx[824] = -701138065124169308L;
        nv.lkwx[825] = 2435181824078758089L;
        nv.lkwx[826] = -663052563738748459L;
        nv.lkwx[827] = -1618564986527427495L;
        nv.lkwx[828] = 8406027159279113192L;
        nv.lkwx[829] = -7114100282335244382L;
        nv.lkwx[830] = 8618123863994299094L;
        nv.lkwx[831] = 4010465941734078274L;
        nv.lkwx[832] = 7893823987948031164L;
        nv.lkwx[833] = 3812612110691122901L;
        nv.lkwx[834] = -3576523527130333729L;
        nv.lkwx[835] = -830200016492186824L;
        nv.lkwx[836] = -8826820110189674404L;
        nv.lkwx[837] = -1209876640125721670L;
        nv.lkwx[838] = 6627185135722116857L;
        nv.lkwx[839] = 5155503839092230440L;
        nv.lkwx[840] = -8827169621213014096L;
        nv.lkwx[841] = -7617393710487545972L;
        nv.lkwx[842] = -5886810701519336029L;
        nv.lkwx[843] = 2018798378260084499L;
        nv.lkwx[844] = 9030332686207957655L;
        nv.lkwx[845] = 4506022313677091160L;
        nv.lkwx[846] = 8431879492111283155L;
        nv.lkwx[847] = -815310093433587136L;
        nv.lkwx[848] = 4781702104741233863L;
        nv.lkwx[849] = -2410261779584760424L;
        nv.lkwx[850] = -5762347168078541732L;
        nv.lkwx[851] = -2509939994870649339L;
        nv.lkwx[852] = -3755783283071411864L;
        nv.lkwx[853] = -3873318615460405080L;
        nv.lkwx[854] = -367270738500299863L;
        nv.lkwx[855] = -7751455377713147887L;
        nv.lkwx[856] = 611157214090871710L;
        nv.lkwx[857] = 5536779437473652912L;
        nv.lkwx[858] = -2777073105809876851L;
        nv.lkwx[859] = -2298770201963164737L;
        nv.lkwx[860] = -3122389551704488693L;
        nv.lkwx[861] = -602619668908196694L;
        nv.lkwx[862] = -7612665020569324508L;
        nv.lkwx[863] = -6646519997501632840L;
        nv.lkwx[864] = 1221938722333865509L;
        nv.lkwx[865] = 7560864787056291611L;
        nv.lkwx[866] = 7740073539560363968L;
        nv.lkwx[867] = -8489258851485112242L;
        nv.lkwx[868] = 5627935785149265155L;
        nv.lkwx[869] = 4859100192358210542L;
        nv.lkwx[870] = 8156936386362574179L;
        nv.lkwx[871] = -860498905657153332L;
        nv.lkwx[872] = 5950113591146926313L;
        nv.lkwx[873] = 7168805935877645771L;
        nv.lkwx[874] = 8979425078270713858L;
        nv.lkwx[875] = -2871143804952046446L;
        nv.lkwx[876] = 7188405428469412628L;
        nv.lkwx[877] = -6351998585474269106L;
        nv.lkwx[878] = -7006945896895763622L;
        nv.lkwx[879] = 6076827803822705738L;
        nv.lkwx[880] = 9004628150092765153L;
        nv.lkwx[881] = -6689065864907176495L;
        nv.lkwx[882] = 1926523415991012920L;
        nv.lkwx[883] = -4246986279661345676L;
        nv.lkwx[884] = 8394833215584853349L;
        nv.lkwx[885] = 2530135766853097477L;
        nv.lkwx[886] = 8299689553562876899L;
        nv.lkwx[887] = -7814312695425034310L;
        nv.lkwx[888] = 5864210792574727497L;
        nv.lkwx[889] = -4716883837189542138L;
        nv.lkwx[890] = 6431297499511565897L;
        nv.lkwx[891] = 3255357449770618837L;
        nv.lkwx[892] = 33827862720915073L;
        nv.lkwx[893] = 1729182971690290453L;
        nv.lkwx[894] = -6330632822075509867L;
        nv.lkwx[895] = 2238779091668985214L;
        nv.lkwx[896] = 2077245730318485535L;
        nv.lkwx[897] = -8951682364650074496L;
        nv.lkwx[898] = 8208084144652037835L;
        nv.lkwx[899] = 1245742193913643602L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int findHotbarItem(class_1792 var0) {
        block65: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("llbc", lkwv(int ), (int)51)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == nv.lkwr("llbd", lkwo(int ), (int)60)) break;
                v0 /* !! */  = (long)nv.lkwr("llbe", lkwo(int ), (int)61);
            }
            var4_1 = nv.c;
            v1 /* !! */  = nv.ud;
            if (true) ** GOTO lbl11
            block33: while (true) {
                v1 /* !! */  = (long)(v2 - nv.lkwr("llbf", lkwv(int ), (int)52));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1721020230: {
                        v2 = nv.lkwr("llbg", lkwv(int ), (int)53);
                        continue block33;
                    }
                    case 1324708142: {
                        v2 = nv.lkwr("llbh", lkwv(int ), (int)54);
                        continue block33;
                    }
                    case 1637199440: {
                        break block33;
                    }
                }
                break;
            }
            var3_2 /* !! */  = nv.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("llbi", lkwv(int ), (int)55)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == nv.lkwr("llbj", lkwo(int ), (int)62)) break;
                v3 /* !! */  = (long)nv.lkwr("llbk", lkwo(int ), (int)63);
            }
            var2_3 = nv.a;
            if (var4_1) {
                throw null;
lbl29:
                // 10 sources

                return (int)nv.lkwr("llbl", lkwo(int ), (int)64);
            }
            if (var2_3 || var2_3) ** GOTO lbl29
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("llbm", lkwv(int ), (int)56)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == nv.lkwr("llbn", lkwo(int ), (int)65)) break;
                v4 /* !! */  = (long)nv.lkwr("llbo", lkwo(int ), (int)66);
            }
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("llbp", lkwv(int ), (int)57)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == nv.lkwr("llbq", lkwo(int ), (int)67)) break;
                v5 /* !! */  = (long)nv.lkwr("llbr", lkwo(int ), (int)68);
            }
            if (nv.mc.field_1724 != null) break block65;
            if (var2_3) ** GOTO lbl29
            return (int)nv.lkwr("llbs", lkwo(int ), (int)69);
        }
        if (var2_3 || var2_3) ** GOTO lbl29
        var1_4 = nv.lkwr("llbt", lkwo(int ), (int)70);
        if (var2_3) ** GOTO lbl29
        block38: while (true) {
            if (var2_3 || var2_3) ** GOTO lbl29
            if (var1_4 >= nv.lkwr("llbu", lkwo(int ), (int)71)) ** GOTO lbl96
            if (var2_3 || var2_3) ** GOTO lbl29
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("llbv", lkwv(int ), (int)58)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == nv.lkwr("llbw", lkwo(int ), (int)72)) break;
                v6 /* !! */  = (long)nv.lkwr("llbx", lkwo(int ), (int)73);
            }
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_5 = nv.ud - nv.lkwr("llby", lkwv(int ), (int)59)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == nv.lkwr("llbz", lkwo(int ), (int)74)) break;
                v7 /* !! */  = (long)nv.lkwr("llca", lkwo(int ), (int)75);
            }
            v8 = nv.mc.field_1724;
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_6 = nv.ud - nv.lkwr("llcb", lkwv(int ), (int)60)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == nv.lkwr("llcc", lkwo(int ), (int)76)) break;
                v9 /* !! */  = (long)nv.lkwr("llcd", lkwo(int ), (int)77);
            }
            v10 = v8.method_31548();
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_7 = nv.ud - nv.lkwr("llce", lkwv(int ), (int)61)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == nv.lkwr("llcf", lkwo(int ), (int)78)) break;
                v11 /* !! */  = (long)nv.lkwr("llcg", lkwo(int ), (int)79);
            }
            v12 = v10.method_5438((int)var1_4);
            v13 /* !! */  = nv.ud;
            if (true) ** GOTO lbl80
            block43: while (true) {
                v13 /* !! */  = (long)(nv.lkwr("llci", lkwv(int ), (int)63) - nv.lkwr("llch", lkwv(int ), (int)62));
lbl80:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case 1503392455: {
                        continue block43;
                    }
                    case 1637199440: {
                        break block43;
                    }
                }
                break;
            }
            if (v12.method_7909() != var0) ** GOTO lbl91
            if (var2_3 || var2_3) ** GOTO lbl29
            if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)var1_4;
                }
lbl91:
                // 1 sources

                if (var2_3 || var2_3) ** GOTO lbl29
                ++var1_4;
                if (var2_3) ** GOTO lbl29
                if (!var4_1) continue block38;
                throw null;
lbl96:
                // 1 sources

                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return (int)nv.lkwr("llcj", lkwo(int ), (int)80);
lbl99:
                // 2 sources

                case 0: {
                    var3_2 /* !! */  = (int)nv.lkwr("llck", lkwo(int ), (int)81);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl159
                }
lbl104:
                // 2 sources

                case 1: {
                    var3_2 /* !! */  = (int)nv.lkwr("llcl", lkwo(int ), (int)82);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl172
                }
lbl109:
                // 3 sources

                case 2: {
                    do {
                        var3_2 /* !! */  = (int)nv.lkwr("llcm", lkwo(int ), (int)83);
                    } while (!var4_1);
                    throw null;
                }
lbl114:
                // 2 sources

                case 3: {
                    var3_2 /* !! */  = (int)nv.lkwr("llcn", lkwo(int ), (int)84);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl176
                }
lbl119:
                // 2 sources

                case 4: {
                    var3_2 /* !! */  = (int)nv.lkwr("llco", lkwo(int ), (int)85);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl159
                }
                case 5: {
                    var3_2 /* !! */  = (int)nv.lkwr("llcp", lkwo(int ), (int)86);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl142
                }
lbl129:
                // 2 sources

                case 6: {
                    var3_2 /* !! */  = (int)nv.lkwr("llcq", lkwo(int ), (int)87);
                    if (!var4_1) ** GOTO lbl99
                    throw null;
                }
                case 7: {
                    var3_2 /* !! */  = (int)nv.lkwr("llcr", lkwo(int ), (int)88);
                    if (!var4_1) ** GOTO lbl104
                    throw null;
                }
                case 8: {
                    do {
                        var3_2 /* !! */  = (int)nv.lkwr("llcs", lkwo(int ), (int)89);
                    } while (!var4_1);
                    throw null;
                }
lbl142:
                // 3 sources

                case 9: {
                    var3_2 /* !! */  = (int)nv.lkwr("llct", lkwo(int ), (int)90);
                    if (var4_1) {
                        throw null;
                    }
                }
lbl146:
                // 4 sources

                case 10: {
                    var3_2 /* !! */  = (int)nv.lkwr("llcu", lkwo(int ), (int)91);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl167
                }
lbl151:
                // 2 sources

                case 11: {
                    var3_2 /* !! */  = (int)nv.lkwr("llcv", lkwo(int ), (int)92);
                    if (!var4_1) ** GOTO lbl119
                    throw null;
                }
                case 12: {
                    var3_2 /* !! */  = (int)nv.lkwr("llcw", lkwo(int ), (int)93);
                    if (!var4_1) ** GOTO lbl109
                    throw null;
                }
lbl159:
                // 3 sources

                case 13: {
                    var3_2 /* !! */  = (int)nv.lkwr("llcx", lkwo(int ), (int)94);
                    if (!var4_1) ** GOTO lbl129
                    throw null;
                }
                case 14: {
                    var3_2 /* !! */  = (int)nv.lkwr("llcy", lkwo(int ), (int)95);
                    if (!var4_1) ** GOTO lbl142
                    throw null;
                }
lbl167:
                // 2 sources

                case 15: {
                    var3_2 /* !! */  = (int)nv.lkwr("llcz", lkwo(int ), (int)96);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl176
                }
lbl172:
                // 2 sources

                case 16: {
                    var3_2 /* !! */  = (int)nv.lkwr("llda", lkwo(int ), (int)97);
                    if (!var4_1) ** GOTO lbl146
                    throw null;
                }
lbl176:
                // 3 sources

                case 17: {
                    var3_2 /* !! */  = (int)nv.lkwr("lldb", lkwo(int ), (int)98);
                    if (!var4_1) ** GOTO lbl114
                    throw null;
                }
                case 18: {
                    var3_2 /* !! */  = (int)nv.lkwr("lldc", lkwo(int ), (int)99);
                    if (!var4_1) ** GOTO lbl151
                    throw null;
                }
                case 19: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_2 /* !! */  = (int)nv.lkwr("lldd", lkwo(int ), (int)100);
                        if (!var4_1) ** GOTO lbl109
                        throw null;
                    }
                }
                case 20: 
            }
            break;
        }
        var3_2 /* !! */  = (int)nv.lkwr("llde", lkwo(int ), (int)101);
        ** while (!var4_1)
lbl192:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_1735 findSlot(Predicate<class_1735> var0, Comparator<class_1735> var1_1) {
        v0 /* !! */  = nv.ud;
        if (true) ** GOTO lbl5
        block65: while (true) {
            v0 /* !! */  = (long)(nv.lkwr("lmcf", lkwv(int ), (int)299) - nv.lkwr("lmce", lkwv(int ), (int)298));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1321118679: {
                    continue block65;
                }
                case 1637199440: {
                    break block65;
                }
            }
            break;
        }
        var5_2 = nv.c;
        v1 /* !! */  = nv.ud;
        if (true) ** GOTO lbl15
        block66: while (true) {
            v1 /* !! */  = (long)(nv.lkwr("lmch", lkwv(int ), (int)301) - nv.lkwr("lmcg", lkwv(int ), (int)300));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 475536124: {
                    continue block66;
                }
                case 1637199440: {
                    break block66;
                }
            }
            break;
        }
        var4_3 /* !! */  = nv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lmci", lkwv(int ), (int)302)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nv.lkwr("lmcj", lkwo(int ), (int)517)) break;
            v2 /* !! */  = (long)nv.lkwr("lmck", lkwo(int ), (int)518);
        }
        var3_4 = nv.a;
        if (var5_2) {
            throw null;
lbl29:
            // 6 sources

            return null;
        }
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4 || var3_4) ** GOTO lbl29
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lmcl", lkwv(int ), (int)303)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == nv.lkwr("lmcm", lkwo(int ), (int)519)) break;
                    v3 /* !! */  = (long)nv.lkwr("lmcn", lkwo(int ), (int)520);
                }
                v4 /* !! */  = nv.ud;
                if (true) ** GOTO lbl44
                block70: while (true) {
                    v4 /* !! */  = (long)(v5 - nv.lkwr("lmco", lkwv(int ), (int)304));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -673551209: {
                            v5 = nv.lkwr("lmcp", lkwv(int ), (int)305);
                            continue block70;
                        }
                        case -570828922: {
                            v5 = nv.lkwr("lmcq", lkwv(int ), (int)306);
                            continue block70;
                        }
                        case -488899838: {
                            v5 = nv.lkwr("lmcr", lkwv(int ), (int)307);
                            continue block70;
                        }
                        case 1637199440: {
                            break block70;
                        }
                    }
                    break;
                }
                if (nv.mc.field_1724 != null) ** GOTO lbl59
                if (var3_4 || var3_4) ** GOTO lbl29
                return null;
lbl59:
                // 1 sources

                if (var3_4 || var3_4) ** GOTO lbl29
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lmcs", lkwv(int ), (int)308)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == nv.lkwr("lmct", lkwo(int ), (int)521)) break;
                    v6 /* !! */  = (long)nv.lkwr("lmcu", lkwo(int ), (int)522);
                }
                v7 /* !! */  = nv.ud;
                if (true) ** GOTO lbl69
                block72: while (true) {
                    v7 /* !! */  = (long)(v8 - nv.lkwr("lmcv", lkwv(int ), (int)309));
lbl69:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -129527468: {
                            v8 = nv.lkwr("lmcw", lkwv(int ), (int)310);
                            continue block72;
                        }
                        case 1388178046: {
                            v8 = nv.lkwr("lmcx", lkwv(int ), (int)311);
                            continue block72;
                        }
                        case 1637199440: {
                            break block72;
                        }
                    }
                    break;
                }
                v9 = nv.mc.field_1724;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("lmcy", lkwv(int ), (int)312)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == nv.lkwr("lmcz", lkwo(int ), (int)523)) break;
                    v10 /* !! */  = (long)nv.lkwr("lmda", lkwo(int ), (int)524);
                }
                v11 = v9.field_7512;
                v12 /* !! */  = nv.ud;
                if (true) ** GOTO lbl89
                block74: while (true) {
                    v12 /* !! */  = (long)(v13 - nv.lkwr("lmdb", lkwv(int ), (int)313));
lbl89:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1089107227: {
                            v13 = nv.lkwr("lmdc", lkwv(int ), (int)314);
                            continue block74;
                        }
                        case 347008866: {
                            v13 = nv.lkwr("lmdd", lkwv(int ), (int)315);
                            continue block74;
                        }
                        case 630061933: {
                            v13 = nv.lkwr("lmde", lkwv(int ), (int)316);
                            continue block74;
                        }
                        case 1637199440: {
                            break block74;
                        }
                    }
                    break;
                }
                v14 = v11.field_7761;
                v15 /* !! */  = nv.ud;
                if (true) ** GOTO lbl106
                block75: while (true) {
                    v15 /* !! */  = (long)(v16 - nv.lkwr("lmdf", lkwv(int ), (int)317));
lbl106:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -509522440: {
                            v16 = nv.lkwr("lmdg", lkwv(int ), (int)318);
                            continue block75;
                        }
                        case -191830469: {
                            v16 = nv.lkwr("lmdh", lkwv(int ), (int)319);
                            continue block75;
                        }
                        case 1637199440: {
                            break block75;
                        }
                        case 2122969675: {
                            v16 = nv.lkwr("lmdi", lkwv(int ), (int)320);
                            continue block75;
                        }
                    }
                    break;
                }
                v17 = v14.stream();
                v18 /* !! */  = nv.ud;
                if (true) ** GOTO lbl123
                block76: while (true) {
                    v18 /* !! */  = (long)(v19 - nv.lkwr("lmdj", lkwv(int ), (int)321));
lbl123:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1916995865: {
                            v19 = nv.lkwr("lmdk", lkwv(int ), (int)322);
                            continue block76;
                        }
                        case -1317742940: {
                            v19 = nv.lkwr("lmdl", lkwv(int ), (int)323);
                            continue block76;
                        }
                        case -941290298: {
                            v19 = nv.lkwr("lmdm", lkwv(int ), (int)324);
                            continue block76;
                        }
                        case 1637199440: {
                            break block76;
                        }
                    }
                    break;
                }
                var2_5 = v17.filter(var0);
                if (var3_4 || var3_4) ** GOTO lbl29
                if (var1_1 == null) ** GOTO lbl165
                if (var3_4) ** GOTO lbl29
                v20 /* !! */  = nv.ud;
                if (true) ** GOTO lbl143
                block77: while (true) {
                    v20 /* !! */  = (long)(v21 - nv.lkwr("lmdn", lkwv(int ), (int)325));
lbl143:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -2146722121: {
                            v21 = nv.lkwr("lmdo", lkwv(int ), (int)326);
                            continue block77;
                        }
                        case -1161324387: {
                            v21 = nv.lkwr("lmdp", lkwv(int ), (int)327);
                            continue block77;
                        }
                        case 1637199440: {
                            break block77;
                        }
                        case 2015150305: {
                            v21 = nv.lkwr("lmdq", lkwv(int ), (int)328);
                            continue block77;
                        }
                    }
                    break;
                }
                v22 = var2_5.max(var1_1);
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("lmdr", lkwv(int ), (int)329)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == nv.lkwr("lmds", lkwo(int ), (int)525)) break;
                    v23 /* !! */  = (long)nv.lkwr("lmdt", lkwo(int ), (int)526);
                }
                v24 = v22.orElse(null);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl190
lbl165:
                // 1 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                v25 /* !! */  = nv.ud;
                if (true) ** GOTO lbl171
                block79: while (true) {
                    v25 /* !! */  = (long)(v26 - nv.lkwr("lmdu", lkwv(int ), (int)330));
lbl171:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -1284224905: {
                            v26 = nv.lkwr("lmdv", lkwv(int ), (int)331);
                            continue block79;
                        }
                        case -1283455807: {
                            v26 = nv.lkwr("lmdw", lkwv(int ), (int)332);
                            continue block79;
                        }
                        case 342249594: {
                            v26 = nv.lkwr("lmdx", lkwv(int ), (int)333);
                            continue block79;
                        }
                        case 1637199440: {
                            break block79;
                        }
                    }
                    break;
                }
                v27 = var2_5.findFirst();
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_5 = nv.ud - nv.lkwr("lmdy", lkwv(int ), (int)334)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == nv.lkwr("lmdz", lkwo(int ), (int)527)) break;
                    v28 /* !! */  = (long)nv.lkwr("lmea", lkwo(int ), (int)528);
                }
                v24 = v27.orElse(null);
lbl190:
                // 2 sources

                return v24;
            }
lbl191:
            // 4 sources

            case 0: {
                var4_3 /* !! */  = (int)nv.lkwr("lmeb", lkwo(int ), (int)529);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl234
            }
            case 1: {
                var4_3 /* !! */  = (int)nv.lkwr("lmec", lkwo(int ), (int)530);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl201:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)nv.lkwr("lmed", lkwo(int ), (int)531);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl206:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)nv.lkwr("lmee", lkwo(int ), (int)532);
                if (!var5_2) ** GOTO lbl191
                throw null;
            }
lbl210:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)nv.lkwr("lmef", lkwo(int ), (int)533);
                if (!var5_2) ** GOTO lbl201
                throw null;
            }
lbl214:
            // 2 sources

            case 5: {
                var4_3 /* !! */  = (int)nv.lkwr("lmeg", lkwo(int ), (int)534);
                if (!var5_2) ** GOTO lbl191
                throw null;
            }
lbl218:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)nv.lkwr("lmeh", lkwo(int ), (int)535);
                if (var5_2) {
                    throw null;
                }
            }
lbl222:
            // 4 sources

            case 7: {
                var4_3 /* !! */  = (int)nv.lkwr("lmei", lkwo(int ), (int)536);
                if (!var5_2) ** GOTO lbl206
                throw null;
            }
            case 8: {
                var4_3 /* !! */  = (int)nv.lkwr("lmej", lkwo(int ), (int)537);
                if (!var5_2) ** GOTO lbl191
                throw null;
            }
            case 9: {
                var4_3 /* !! */  = (int)nv.lkwr("lmek", lkwo(int ), (int)538);
                if (!var5_2) ** GOTO lbl210
                throw null;
            }
lbl234:
            // 3 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)nv.lkwr("lmel", lkwo(int ), (int)539);
                    if (!var5_2) ** GOTO lbl218
                    throw null;
                }
            }
lbl239:
            // 2 sources

            case 11: {
                var4_3 /* !! */  = (int)nv.lkwr("lmem", lkwo(int ), (int)540);
                if (!var5_2) ** GOTO lbl214
                throw null;
            }
            case 12: {
                var4_3 /* !! */  = (int)nv.lkwr("lmen", lkwo(int ), (int)541);
                if (!var5_2) ** GOTO lbl222
                throw null;
            }
            case 13: 
        }
        var4_3 /* !! */  = (int)nv.lkwr("lmeo", lkwo(int ), (int)542);
        ** while (!var5_2)
lbl250:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static nu find(nw var0) {
        block101: {
            block102: {
                var8_1 = nv.c;
                var7_2 /* !! */  = nv.b;
                var6_3 = nv.a;
                if (var8_1) {
                    throw null;
lbl6:
                    // 28 sources

                    return null;
                }
                if (var6_3 || var6_3) ** GOTO lbl6
                if (nv.mc.field_1724 != null) break block102;
                if (var6_3 || var6_3) ** GOTO lbl6
                return nu.notFound();
            }
            if (var6_3 || var6_3) ** GOTO lbl6
            var1_4 = nv.ARMOR_SLOTS;
            if (var6_3) ** GOTO lbl6
            var2_6 = var1_4.length;
            if (var6_3) ** GOTO lbl6
            var3_8 = nv.lkwr("llvg", lkwo(int ), (int)395);
            if (var6_3) ** GOTO lbl6
            do {
                block103: {
                    if (var6_3 || var6_3) ** GOTO lbl6
                    if (var3_8 >= var2_6) break block101;
                    if (var6_3) ** GOTO lbl6
                    var4_9 = var1_4[var3_8];
                    if (var6_3 || var6_3) ** GOTO lbl6
                    var5_10 = nv.mc.field_1724.method_6118(var4_9);
                    if (var6_3 || var6_3) ** GOTO lbl6
                    if (!nv.isValid(var5_10)) break block103;
                    if (var6_3) ** GOTO lbl6
                    if (!var0.matches(var5_10)) break block103;
                    if (var6_3 || var6_3) ** GOTO lbl6
                    return new nu((int)nv.lkwr("llvh", lkwo(int ), (int)396), (boolean)nv.lkwr("llvi", lkwo(int ), (int)397), var5_10);
                }
                if (var6_3 || var6_3) ** GOTO lbl6
                ++var3_8;
                if (var6_3) ** GOTO lbl6
            } while (!var8_1);
            throw null;
        }
        if (var6_3 || var6_3) ** GOTO lbl6
        var1_5 = nv.lkwr("llvj", lkwo(int ), (int)398);
        if (var6_3) ** GOTO lbl6
        block53: while (true) {
            if (var6_3 || var6_3) ** GOTO lbl6
            if (var1_5 < 0) ** GOTO lbl72
            if (var6_3 || var6_3) ** GOTO lbl6
            var2_7 = nv.mc.field_1724.method_31548().method_5438((int)var1_5);
            if (var6_3 || var6_3) ** GOTO lbl6
            if (!nv.isValid(var2_7)) ** GOTO lbl67
            if (var6_3) ** GOTO lbl6
            if (!var0.matches(var2_7)) ** GOTO lbl67
            if (var6_3) ** GOTO lbl6
            if (var7_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var7_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var6_3) ** GOTO lbl6
                    if (var1_5 >= nv.lkwr("llvk", lkwo(int ), (int)399)) ** GOTO lbl63
                    if (var6_3) ** GOTO lbl6
                    v0 = var1_5 + nv.lkwr("llvl", lkwo(int ), (int)400);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl65
lbl63:
                    // 1 sources

                    if (var6_3 || var6_3) ** GOTO lbl6
                    v0 = var3_8 = var1_5;
lbl65:
                    // 2 sources

                    if (var6_3 || var6_3) ** GOTO lbl6
                    return nu.of((int)var3_8, var2_7);
                }
lbl67:
                // 2 sources

                if (var6_3 || var6_3) ** GOTO lbl6
                --var1_5;
                if (var6_3) ** GOTO lbl6
                if (!var8_1) continue block53;
                throw null;
lbl72:
                // 1 sources

                if (!var6_3 && !var6_3) ** break;
                ** continue;
                return nu.notFound();
lbl75:
                // 2 sources

                case 0: {
                    var7_2 /* !! */  = (int)nv.lkwr("llvm", lkwo(int ), (int)401);
                    if (var8_1) {
                        throw null;
                    }
                }
lbl79:
                // 4 sources

                case 1: {
                    var7_2 /* !! */  = (int)nv.lkwr("llvn", lkwo(int ), (int)402);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl211
                }
lbl84:
                // 4 sources

                case 2: {
                    var7_2 /* !! */  = (int)nv.lkwr("llvo", lkwo(int ), (int)403);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl225
                }
lbl89:
                // 2 sources

                case 3: {
                    var7_2 /* !! */  = (int)nv.lkwr("llvp", lkwo(int ), (int)404);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl162
                }
lbl94:
                // 2 sources

                case 4: {
                    var7_2 /* !! */  = (int)nv.lkwr("llvq", lkwo(int ), (int)405);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl129
                }
                case 5: {
                    var7_2 /* !! */  = (int)nv.lkwr("llvr", lkwo(int ), (int)406);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl207
                }
lbl104:
                // 2 sources

                case 6: {
                    var7_2 /* !! */  = (int)nv.lkwr("llvs", lkwo(int ), (int)407);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl203
                }
lbl109:
                // 3 sources

                case 7: {
                    do {
                        var7_2 /* !! */  = (int)nv.lkwr("llvt", lkwo(int ), (int)408);
                    } while (!var8_1);
                    throw null;
                }
lbl114:
                // 2 sources

                case 8: {
                    var7_2 /* !! */  = (int)nv.lkwr("llvu", lkwo(int ), (int)409);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl277
                }
lbl119:
                // 2 sources

                case 9: {
                    var7_2 /* !! */  = (int)nv.lkwr("llvv", lkwo(int ), (int)410);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl189
                }
                case 10: {
                    var7_2 /* !! */  = (int)nv.lkwr("llvw", lkwo(int ), (int)411);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl260
                }
lbl129:
                // 2 sources

                case 11: {
                    var7_2 /* !! */  = (int)nv.lkwr("llvx", lkwo(int ), (int)412);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl207
                }
                case 12: {
                    var7_2 /* !! */  = (int)nv.lkwr("llvy", lkwo(int ), (int)413);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl162
                }
lbl139:
                // 2 sources

                case 13: {
                    var7_2 /* !! */  = (int)nv.lkwr("llvz", lkwo(int ), (int)414);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl250
                }
                case 14: {
                    var7_2 /* !! */  = (int)nv.lkwr("llwa", lkwo(int ), (int)415);
                    if (!var8_1) ** GOTO lbl109
                    throw null;
                }
lbl148:
                // 2 sources

                case 15: {
                    var7_2 /* !! */  = (int)nv.lkwr("llwb", lkwo(int ), (int)416);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl207
                }
lbl153:
                // 2 sources

                case 16: {
                    var7_2 /* !! */  = (int)nv.lkwr("llwc", lkwo(int ), (int)417);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl167
                }
                case 17: {
                    var7_2 /* !! */  = (int)nv.lkwr("llwd", lkwo(int ), (int)418);
                    if (!var8_1) ** GOTO lbl104
                    throw null;
                }
lbl162:
                // 5 sources

                case 18: {
                    var7_2 /* !! */  = (int)nv.lkwr("llwe", lkwo(int ), (int)419);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl273
                }
lbl167:
                // 2 sources

                case 19: {
                    var7_2 /* !! */  = (int)nv.lkwr("llwf", lkwo(int ), (int)420);
                    if (!var8_1) ** GOTO lbl94
                    throw null;
                }
                case 20: {
                    var7_2 /* !! */  = (int)nv.lkwr("llwg", lkwo(int ), (int)421);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl256
                }
                case 21: {
                    var7_2 /* !! */  = (int)nv.lkwr("llwh", lkwo(int ), (int)422);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl242
                }
                case 22: {
                    var7_2 /* !! */  = (int)nv.lkwr("llwi", lkwo(int ), (int)423);
                    if (!var8_1) ** GOTO lbl119
                    throw null;
                }
lbl185:
                // 2 sources

                case 23: {
                    var7_2 /* !! */  = (int)nv.lkwr("llwj", lkwo(int ), (int)424);
                    if (!var8_1) ** GOTO lbl84
                    throw null;
                }
lbl189:
                // 2 sources

                case 24: {
                    var7_2 /* !! */  = (int)nv.lkwr("llwk", lkwo(int ), (int)425);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl260
                }
                case 25: {
                    var7_2 /* !! */  = (int)nv.lkwr("llwl", lkwo(int ), (int)426);
                    if (!var8_1) ** GOTO lbl162
                    throw null;
                }
lbl198:
                // 2 sources

                case 26: {
                    var7_2 /* !! */  = (int)nv.lkwr("llwm", lkwo(int ), (int)427);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl229
                }
lbl203:
                // 2 sources

                case 27: {
                    var7_2 /* !! */  = (int)nv.lkwr("llwn", lkwo(int ), (int)428);
                    if (!var8_1) ** GOTO lbl89
                    throw null;
                }
lbl207:
                // 5 sources

                case 28: {
                    var7_2 /* !! */  = (int)nv.lkwr("llwo", lkwo(int ), (int)429);
                    if (!var8_1) ** GOTO lbl114
                    throw null;
                }
lbl211:
                // 2 sources

                case 29: {
                    var7_2 /* !! */  = (int)nv.lkwr("llwp", lkwo(int ), (int)430);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl289
                }
                case 30: {
                    var7_2 /* !! */  = (int)nv.lkwr("llwq", lkwo(int ), (int)431);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl238
                }
lbl221:
                // 2 sources

                case 31: {
                    var7_2 /* !! */  = (int)nv.lkwr("llwr", lkwo(int ), (int)432);
                    if (!var8_1) ** GOTO lbl148
                    throw null;
                }
lbl225:
                // 2 sources

                case 32: {
                    var7_2 /* !! */  = (int)nv.lkwr("llws", lkwo(int ), (int)433);
                    if (!var8_1) ** GOTO lbl198
                    throw null;
                }
lbl229:
                // 2 sources

                case 33: {
                    var7_2 /* !! */  = (int)nv.lkwr("llwt", lkwo(int ), (int)434);
                    if (!var8_1) ** GOTO lbl75
                    throw null;
                }
                case 34: {
                    do {
                        var7_2 /* !! */  = (int)nv.lkwr("llwu", lkwo(int ), (int)435);
                    } while (!var8_1);
                    throw null;
                }
lbl238:
                // 2 sources

                case 35: {
                    var7_2 /* !! */  = (int)nv.lkwr("llwv", lkwo(int ), (int)436);
                    if (!var8_1) ** GOTO lbl162
                    throw null;
                }
lbl242:
                // 2 sources

                case 36: {
                    var7_2 /* !! */  = (int)nv.lkwr("llww", lkwo(int ), (int)437);
                    if (!var8_1) ** GOTO lbl84
                    throw null;
                }
lbl246:
                // 2 sources

                case 37: {
                    var7_2 /* !! */  = (int)nv.lkwr("llwx", lkwo(int ), (int)438);
                    if (!var8_1) ** GOTO lbl153
                    throw null;
                }
lbl250:
                // 2 sources

                case 38: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var7_2 /* !! */  = (int)nv.lkwr("llwy", lkwo(int ), (int)439);
                        if (var8_1) {
                            throw null;
                        }
                        ** GOTO lbl268
                        break;
                    }
                }
lbl256:
                // 2 sources

                case 39: {
                    var7_2 /* !! */  = (int)nv.lkwr("llwz", lkwo(int ), (int)440);
                    if (!var8_1) ** GOTO lbl79
                    throw null;
                }
lbl260:
                // 3 sources

                case 40: {
                    var7_2 /* !! */  = (int)nv.lkwr("llxa", lkwo(int ), (int)441);
                    if (!var8_1) ** GOTO lbl84
                    throw null;
                }
                case 41: {
                    var7_2 /* !! */  = (int)nv.lkwr("llxb", lkwo(int ), (int)442);
                    if (!var8_1) ** GOTO lbl207
                    throw null;
                }
lbl268:
                // 2 sources

                case 42: {
                    var7_2 /* !! */  = (int)nv.lkwr("llxc", lkwo(int ), (int)443);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl289
                }
lbl273:
                // 2 sources

                case 43: {
                    var7_2 /* !! */  = (int)nv.lkwr("llxd", lkwo(int ), (int)444);
                    if (!var8_1) ** GOTO lbl139
                    throw null;
                }
lbl277:
                // 2 sources

                case 44: {
                    var7_2 /* !! */  = (int)nv.lkwr("llxe", lkwo(int ), (int)445);
                    if (!var8_1) ** GOTO lbl221
                    throw null;
                }
                case 45: {
                    var7_2 /* !! */  = (int)nv.lkwr("llxf", lkwo(int ), (int)446);
                    if (!var8_1) ** GOTO lbl246
                    throw null;
                }
                case 46: {
                    var7_2 /* !! */  = (int)nv.lkwr("llxg", lkwo(int ), (int)447);
                    if (!var8_1) ** GOTO lbl109
                    throw null;
                }
lbl289:
                // 3 sources

                case 47: {
                    var7_2 /* !! */  = (int)nv.lkwr("llxh", lkwo(int ), (int)448);
                    if (!var8_1) ** GOTO lbl185
                    throw null;
                }
                case 48: 
            }
            break;
        }
        var7_2 /* !! */  = (int)nv.lkwr("llxi", lkwo(int ), (int)449);
        ** while (!var8_1)
lbl296:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static nu find(class_1792 ... var0) {
        v0 /* !! */  = nv.ud;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - nv.lkwr("llty", lkwv(int ), (int)220));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1514409151: {
                    v1 = nv.lkwr("lltz", lkwv(int ), (int)221);
                    continue block23;
                }
                case -1419912063: {
                    v1 = nv.lkwr("llua", lkwv(int ), (int)222);
                    continue block23;
                }
                case 1637199440: {
                    break block23;
                }
            }
            break;
        }
        var3_1 = nv.c;
        v2 /* !! */  = nv.ud;
        if (true) ** GOTO lbl19
        block24: while (true) {
            v2 /* !! */  = (long)(nv.lkwr("lluc", lkwv(int ), (int)224) - nv.lkwr("llub", lkwv(int ), (int)223));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1247075428: {
                    continue block24;
                }
                case 1637199440: {
                    break block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = nv.b;
        v3 /* !! */  = nv.ud;
        if (true) ** GOTO lbl29
        block25: while (true) {
            v3 /* !! */  = (long)(nv.lkwr("llue", lkwv(int ), (int)226) - nv.lkwr("llud", lkwv(int ), (int)225));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 1538919777: {
                    continue block25;
                }
                case 1637199440: {
                    break block25;
                }
            }
            break;
        }
        var1_3 = nv.a;
        if (!var3_1) ** GOTO lbl41
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl41:
                // 1 sources

                if (var1_3 || var1_3) continue block26;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lluf", lkwv(int ), (int)227)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == nv.lkwr("llug", lkwo(int ), (int)381)) break;
                    v4 /* !! */  = (long)nv.lkwr("lluh", lkwo(int ), (int)382);
                }
                v5 = Arrays.asList(var0);
                v6 /* !! */  = nv.ud;
                if (true) ** GOTO lbl52
                block28: while (true) {
                    v6 /* !! */  = (long)(nv.lkwr("lluj", lkwv(int ), (int)229) - nv.lkwr("llui", lkwv(int ), (int)228));
lbl52:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 1637199440: {
                            break block28;
                        }
                        case 1907344563: {
                            continue block28;
                        }
                    }
                    break;
                }
                return nv.find(v5);
lbl58:
                // 2 sources

                case 0: {
                    do {
                        var2_2 /* !! */  = (int)nv.lkwr("lluk", lkwo(int ), (int)383);
                    } while (!var3_1);
                    throw null;
                }
                case 1: {
                    do {
                        var2_2 /* !! */  = (int)nv.lkwr("llul", lkwo(int ), (int)384);
                    } while (!var3_1);
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)nv.lkwr("llum", lkwo(int ), (int)385);
                        if (!var3_1) ** GOTO lbl58
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)nv.lkwr("llun", lkwo(int ), (int)386);
        ** while (!var3_1)
lbl76:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lojq() {
        nv.lkww[900] = 4639276498998470232L;
        nv.lkww[901] = -9067732715017390718L;
        nv.lkww[902] = 8626064434868628130L;
        nv.lkww[903] = -8253785600310172870L;
        nv.lkww[904] = -7272638107759321776L;
        nv.lkww[905] = -3360518605766532379L;
        nv.lkww[906] = -1453234709652892146L;
        nv.lkww[907] = -6431222454522870680L;
        nv.lkww[908] = -8916430407538821569L;
        nv.lkww[909] = 4108429214918718047L;
        nv.lkww[910] = -2590169613583372780L;
        nv.lkww[911] = -7064568633455730226L;
        nv.lkww[912] = 3019715515161725193L;
        nv.lkww[913] = -5168363856625580040L;
        nv.lkww[914] = 1651102178218591913L;
        nv.lkww[915] = 609323764362767101L;
        nv.lkww[916] = -6202999737515175919L;
        nv.lkww[917] = -4363943387076269571L;
        nv.lkww[918] = -3584919684141437812L;
        nv.lkww[919] = -6380088929889134700L;
        nv.lkww[920] = -7917319476677969292L;
        nv.lkww[921] = 7099977862636402311L;
        nv.lkww[922] = -7093669015039152766L;
        nv.lkww[923] = 8092981598911635936L;
        nv.lkww[924] = 8936743750286424722L;
        nv.lkww[925] = 6286714284798834554L;
        nv.lkww[926] = 2949658369403501907L;
        nv.lkww[927] = -4949821998661081190L;
        nv.lkww[928] = -7994244001769559734L;
        nv.lkww[929] = 3555388597907157228L;
        nv.lkww[930] = -1400354836573923363L;
        nv.lkww[931] = 1790451949193216797L;
        nv.lkww[932] = -592599582787723516L;
        nv.lkww[933] = -6481372842413888394L;
        nv.lkww[934] = 8347603963077611063L;
        nv.lkww[935] = -723356897464272121L;
        nv.lkww[936] = 5962922944469716370L;
        nv.lkww[937] = 4161219598743369860L;
        nv.lkww[938] = -2843394795469526891L;
        nv.lkww[939] = 5955050977945614984L;
        nv.lkww[940] = -4672924465511128269L;
        nv.lkww[941] = -727173024184407703L;
        nv.lkww[942] = 9146728408486370197L;
        nv.lkww[943] = 1431343845381602266L;
        nv.lkww[944] = 205670914464075440L;
        nv.lkww[945] = 2880825801900869004L;
        nv.lkww[946] = -8727473294557391731L;
        nv.lkww[947] = 3328725400364714178L;
        nv.lkww[948] = 3984095464131979472L;
        nv.lkww[949] = 5684993553749070640L;
        nv.lkww[950] = -1801683697163900745L;
        nv.lkww[951] = -6887012013070822820L;
        nv.lkww[952] = -6156167067721492064L;
        nv.lkww[953] = 5903865187640517178L;
        nv.lkww[954] = -5817657952514828660L;
        nv.lkww[955] = -2583773496842609750L;
        nv.lkww[956] = 6836275538794064379L;
        nv.lkww[957] = 6776663427093413570L;
        nv.lkww[958] = -5904691708005180623L;
        nv.lkww[959] = 5756394679898040039L;
        nv.lkww[960] = -8875213936146920326L;
        nv.lkww[961] = 374475082193999356L;
        nv.lkww[962] = -6916861834065853692L;
        nv.lkww[963] = 2678791989178789290L;
        nv.lkww[964] = 3095904993919717936L;
        nv.lkww[965] = -5007464558099460219L;
        nv.lkww[966] = -7022265862355278834L;
        nv.lkww[967] = 152773200107795782L;
        nv.lkww[968] = -5645117856295374901L;
        nv.lkww[969] = -579309521671596586L;
        nv.lkww[970] = -6047595614071108905L;
        nv.lkww[971] = 881789033492373642L;
        nv.lkww[972] = 3272466756357056452L;
        nv.lkww[973] = -8832337473519892016L;
        nv.lkww[974] = -3333836884986485431L;
        nv.lkww[975] = -6188228595231038140L;
        nv.lkww[976] = 140706332011786756L;
        nv.lkww[977] = -1617019856366283328L;
        nv.lkww[978] = -4855774211260560958L;
        nv.lkww[979] = -2443877689603376732L;
        nv.lkww[980] = -6346102766175084785L;
        nv.lkww[981] = 1187143460272702940L;
        nv.lkww[982] = -4373975916047942124L;
        nv.lkww[983] = 1676233892093407517L;
        nv.lkww[984] = -846464458277026L;
        nv.lkww[985] = -4845351751353639802L;
        nv.lkww[986] = 2123416752386844870L;
        nv.lkww[987] = 7253903810936349967L;
        nv.lkww[988] = 1104364241005269956L;
        nv.lkww[989] = 8047543605846801756L;
        nv.lkww[990] = -4164565437721870430L;
        nv.lkww[991] = 4203213485077881636L;
        nv.lkww[992] = -8870473679565288310L;
        nv.lkww[993] = -4337202970841199216L;
        nv.lkww[994] = -8404330928730896635L;
        nv.lkww[995] = 1310407290709934591L;
        nv.lkww[996] = -313410283692949774L;
        nv.lkww[997] = 2117530938539101238L;
        nv.lkww[998] = -2712480568136144746L;
        nv.lkww[999] = -276553774365442022L;
    }

    private static /* synthetic */ void lojv() {
        nv.lkwx[300] = 6717881578089846647L;
        nv.lkwx[301] = 7561985919975709120L;
        nv.lkwx[302] = 7488816812180823502L;
        nv.lkwx[303] = -7317795623723711872L;
        nv.lkwx[304] = 4525762981611978442L;
        nv.lkwx[305] = -4075701488270401933L;
        nv.lkwx[306] = -3346203896153697813L;
        nv.lkwx[307] = -2054995812330444889L;
        nv.lkwx[308] = -8941378411882178570L;
        nv.lkwx[309] = -2313542839252010518L;
        nv.lkwx[310] = -8415206523627144516L;
        nv.lkwx[311] = -7013209016233014529L;
        nv.lkwx[312] = 4228873716731879782L;
        nv.lkwx[313] = 2096898992712293908L;
        nv.lkwx[314] = 6562350751448278883L;
        nv.lkwx[315] = 391844907917867412L;
        nv.lkwx[316] = -8784581969816928819L;
        nv.lkwx[317] = 3477617185608730161L;
        nv.lkwx[318] = 7648319556760195319L;
        nv.lkwx[319] = 5809587904944616485L;
        nv.lkwx[320] = -7251168646645602567L;
        nv.lkwx[321] = 3784839349587294539L;
        nv.lkwx[322] = 3373113866826085986L;
        nv.lkwx[323] = -3237662607300526056L;
        nv.lkwx[324] = -4157573772963090360L;
        nv.lkwx[325] = -5094680316850302516L;
        nv.lkwx[326] = 5710480349447804831L;
        nv.lkwx[327] = 7080377186510237668L;
        nv.lkwx[328] = 2599563338651777486L;
        nv.lkwx[329] = 1978458036236062930L;
        nv.lkwx[330] = -816301457808165905L;
        nv.lkwx[331] = -621340565128170314L;
        nv.lkwx[332] = -5650670216946351952L;
        nv.lkwx[333] = 5851377500510092069L;
        nv.lkwx[334] = 6388681261235643672L;
        nv.lkwx[335] = 8317720927187376644L;
        nv.lkwx[336] = 2082572993614188169L;
        nv.lkwx[337] = -1975737986345010391L;
        nv.lkwx[338] = 6804974873544042274L;
        nv.lkwx[339] = 6983650493838279978L;
        nv.lkwx[340] = -1308510482739473477L;
        nv.lkwx[341] = 1294006862690628083L;
        nv.lkwx[342] = 7445350657767917343L;
        nv.lkwx[343] = 4781165424029472052L;
        nv.lkwx[344] = 1062523534787754960L;
        nv.lkwx[345] = 2868474501861478085L;
        nv.lkwx[346] = -7205486790646932949L;
        nv.lkwx[347] = -1737534016707037463L;
        nv.lkwx[348] = 7458316613565418952L;
        nv.lkwx[349] = -7232840830298517665L;
        nv.lkwx[350] = 9087777218087227397L;
        nv.lkwx[351] = 5922291045129296329L;
        nv.lkwx[352] = -5524350556308902493L;
        nv.lkwx[353] = 2534568312357275768L;
        nv.lkwx[354] = -4229150795603288298L;
        nv.lkwx[355] = 31343968718242520L;
        nv.lkwx[356] = -3039594349364649435L;
        nv.lkwx[357] = 8715668267095836850L;
        nv.lkwx[358] = 9036212814376406464L;
        nv.lkwx[359] = -3036862090981621875L;
        nv.lkwx[360] = 164381751875016674L;
        nv.lkwx[361] = 3126457240194943850L;
        nv.lkwx[362] = -3849771795369252548L;
        nv.lkwx[363] = -1674593949472349981L;
        nv.lkwx[364] = 668765900949933802L;
        nv.lkwx[365] = 2801498788657929604L;
        nv.lkwx[366] = 1685523415459856387L;
        nv.lkwx[367] = -7569268347094506775L;
        nv.lkwx[368] = -6937929307358112990L;
        nv.lkwx[369] = -3311225287460703039L;
        nv.lkwx[370] = 6177525055620662453L;
        nv.lkwx[371] = 1255445956043040100L;
        nv.lkwx[372] = -4999490717033468615L;
        nv.lkwx[373] = 7190623078036955675L;
        nv.lkwx[374] = 9071343876670695674L;
        nv.lkwx[375] = 1974283220534032980L;
        nv.lkwx[376] = -786724884011197735L;
        nv.lkwx[377] = 408369651046618996L;
        nv.lkwx[378] = 7172758960733106026L;
        nv.lkwx[379] = 524077377930059395L;
        nv.lkwx[380] = -6054426182020232490L;
        nv.lkwx[381] = 454147115202710733L;
        nv.lkwx[382] = 172612002063513138L;
        nv.lkwx[383] = -8341547337325352881L;
        nv.lkwx[384] = -4281687300451003223L;
        nv.lkwx[385] = -632960245053325113L;
        nv.lkwx[386] = -513324382457475331L;
        nv.lkwx[387] = -3204771047617125415L;
        nv.lkwx[388] = 5836729792296254928L;
        nv.lkwx[389] = 6640416078621134152L;
        nv.lkwx[390] = -5524517068157550765L;
        nv.lkwx[391] = 1733567600296136792L;
        nv.lkwx[392] = -5336756200877411095L;
        nv.lkwx[393] = 7727343462546137269L;
        nv.lkwx[394] = -7916158837183536877L;
        nv.lkwx[395] = 1385360670764663778L;
        nv.lkwx[396] = 6068024957748000763L;
        nv.lkwx[397] = 5986830942371773953L;
        nv.lkwx[398] = -6890602536345948130L;
        nv.lkwx[399] = 5709314088944210395L;
    }

    private static /* synthetic */ void loje() {
        nv.lkwq[1000] = 1260450714;
        nv.lkwq[1001] = -1622906978;
        nv.lkwq[1002] = -409478041;
        nv.lkwq[1003] = 448277503;
        nv.lkwq[1004] = 1939844250;
        nv.lkwq[1005] = 1446853488;
        nv.lkwq[1006] = 999129352;
        nv.lkwq[1007] = -181239939;
        nv.lkwq[1008] = 283815867;
        nv.lkwq[1009] = 1398382700;
        nv.lkwq[1010] = -1076131338;
        nv.lkwq[1011] = 1041585634;
        nv.lkwq[1012] = 1740983612;
        nv.lkwq[1013] = -207957034;
        nv.lkwq[1014] = 1620306115;
        nv.lkwq[1015] = -464191811;
        nv.lkwq[1016] = -1631925193;
        nv.lkwq[1017] = -707096551;
        nv.lkwq[1018] = 1579759049;
        nv.lkwq[1019] = 552377550;
        nv.lkwq[1020] = 1257683150;
        nv.lkwq[1021] = 1494683883;
        nv.lkwq[1022] = 1756679041;
        nv.lkwq[1023] = 431309001;
        nv.lkwq[1024] = -1399365211;
        nv.lkwq[1025] = -1489455698;
        nv.lkwq[1026] = 842187541;
        nv.lkwq[1027] = 1073429999;
        nv.lkwq[1028] = -724400101;
        nv.lkwq[1029] = -272197724;
        nv.lkwq[1030] = -1589819694;
        nv.lkwq[1031] = -1444035522;
        nv.lkwq[1032] = 1050161766;
        nv.lkwq[1033] = 2104947186;
        nv.lkwq[1034] = 964455737;
        nv.lkwq[1035] = -73612315;
        nv.lkwq[1036] = -1651671837;
        nv.lkwq[1037] = 432155362;
        nv.lkwq[1038] = -886173811;
        nv.lkwq[1039] = -1934581301;
        nv.lkwq[1040] = 797017954;
        nv.lkwq[1041] = -2118414335;
        nv.lkwq[1042] = 1967434368;
        nv.lkwq[1043] = -447354818;
        nv.lkwq[1044] = 1253557648;
        nv.lkwq[1045] = 1526081003;
        nv.lkwq[1046] = 1002061665;
        nv.lkwq[1047] = -411673923;
        nv.lkwq[1048] = 1528458301;
        nv.lkwq[1049] = -923484825;
        nv.lkwq[1050] = 313056105;
        nv.lkwq[1051] = -1716637910;
        nv.lkwq[1052] = 779865249;
        nv.lkwq[1053] = 1021873885;
        nv.lkwq[1054] = 1805245364;
        nv.lkwq[1055] = 1066581703;
        nv.lkwq[1056] = -1470992161;
        nv.lkwq[1057] = -1802431117;
        nv.lkwq[1058] = 1563848895;
        nv.lkwq[1059] = -1553645538;
        nv.lkwq[1060] = -1821971149;
        nv.lkwq[1061] = -978931965;
        nv.lkwq[1062] = -1906893872;
        nv.lkwq[1063] = 2116984068;
        nv.lkwq[1064] = -1357894685;
        nv.lkwq[1065] = -1833598726;
        nv.lkwq[1066] = -1454951022;
        nv.lkwq[1067] = -2024156859;
        nv.lkwq[1068] = -858433626;
        nv.lkwq[1069] = 1726792836;
        nv.lkwq[1070] = 122181439;
        nv.lkwq[1071] = 558750248;
        nv.lkwq[1072] = 1694220772;
        nv.lkwq[1073] = 521383152;
        nv.lkwq[1074] = -1132181969;
        nv.lkwq[1075] = 959875052;
        nv.lkwq[1076] = -860758011;
        nv.lkwq[1077] = -1693627090;
        nv.lkwq[1078] = -1588670639;
        nv.lkwq[1079] = 1051319043;
        nv.lkwq[1080] = -282057448;
        nv.lkwq[1081] = 768035062;
        nv.lkwq[1082] = -447401209;
        nv.lkwq[1083] = -52481585;
        nv.lkwq[1084] = -1032584279;
        nv.lkwq[1085] = -182143398;
        nv.lkwq[1086] = -596345609;
        nv.lkwq[1087] = -649016511;
        nv.lkwq[1088] = -1621665702;
        nv.lkwq[1089] = 731141187;
        nv.lkwq[1090] = -359799201;
        nv.lkwq[1091] = -1049519746;
        nv.lkwq[1092] = 980054446;
        nv.lkwq[1093] = 257841079;
        nv.lkwq[1094] = 415388672;
        nv.lkwq[1095] = -585426241;
        nv.lkwq[1096] = -138002140;
        nv.lkwq[1097] = 28002654;
        nv.lkwq[1098] = 605241177;
        nv.lkwq[1099] = 1854233720;
    }

    private static /* synthetic */ void loin() {
        nv.lkwp[600] = -127851538;
        nv.lkwp[601] = -1540716927;
        nv.lkwp[602] = -1931975572;
        nv.lkwp[603] = 2073782309;
        nv.lkwp[604] = 1197934770;
        nv.lkwp[605] = -9584998;
        nv.lkwp[606] = -705034716;
        nv.lkwp[607] = -168400024;
        nv.lkwp[608] = -878667136;
        nv.lkwp[609] = 1126553163;
        nv.lkwp[610] = -186173619;
        nv.lkwp[611] = 1404073797;
        nv.lkwp[612] = -939412541;
        nv.lkwp[613] = -2029849038;
        nv.lkwp[614] = 1947444465;
        nv.lkwp[615] = -1227436251;
        nv.lkwp[616] = -1038320822;
        nv.lkwp[617] = 689635783;
        nv.lkwp[618] = -1633529231;
        nv.lkwp[619] = 1094515724;
        nv.lkwp[620] = -1472423207;
        nv.lkwp[621] = 1168966531;
        nv.lkwp[622] = -134079266;
        nv.lkwp[623] = 829825642;
        nv.lkwp[624] = -1517118065;
        nv.lkwp[625] = -913571757;
        nv.lkwp[626] = -334169586;
        nv.lkwp[627] = -828240460;
        nv.lkwp[628] = 1525420299;
        nv.lkwp[629] = -1148809017;
        nv.lkwp[630] = 869132602;
        nv.lkwp[631] = 379155369;
        nv.lkwp[632] = -5546479;
        nv.lkwp[633] = 1293408429;
        nv.lkwp[634] = 1732627221;
        nv.lkwp[635] = -1075032686;
        nv.lkwp[636] = -108510842;
        nv.lkwp[637] = -1472482051;
        nv.lkwp[638] = 1646771682;
        nv.lkwp[639] = -749016195;
        nv.lkwp[640] = 517453036;
        nv.lkwp[641] = 245908412;
        nv.lkwp[642] = -162510312;
        nv.lkwp[643] = 2003221682;
        nv.lkwp[644] = -2129265425;
        nv.lkwp[645] = 1367392324;
        nv.lkwp[646] = -244986200;
        nv.lkwp[647] = -2112140411;
        nv.lkwp[648] = 1493228503;
        nv.lkwp[649] = 1535063617;
        nv.lkwp[650] = -1004014414;
        nv.lkwp[651] = -1042736587;
        nv.lkwp[652] = 1180933658;
        nv.lkwp[653] = -936071581;
        nv.lkwp[654] = 896110760;
        nv.lkwp[655] = 1705683490;
        nv.lkwp[656] = 1302093051;
        nv.lkwp[657] = -211654021;
        nv.lkwp[658] = -1468863247;
        nv.lkwp[659] = -91098286;
        nv.lkwp[660] = -1909483432;
        nv.lkwp[661] = -1731847443;
        nv.lkwp[662] = -1925504363;
        nv.lkwp[663] = -449461172;
        nv.lkwp[664] = -578740398;
        nv.lkwp[665] = 1554158199;
        nv.lkwp[666] = -1665057298;
        nv.lkwp[667] = -686431176;
        nv.lkwp[668] = 1130608671;
        nv.lkwp[669] = -1909361086;
        nv.lkwp[670] = 212090366;
        nv.lkwp[671] = -1459336558;
        nv.lkwp[672] = 1326298216;
        nv.lkwp[673] = -2033578661;
        nv.lkwp[674] = -2104639851;
        nv.lkwp[675] = -109468032;
        nv.lkwp[676] = -865661815;
        nv.lkwp[677] = 1636207972;
        nv.lkwp[678] = -1534240041;
        nv.lkwp[679] = -1515176848;
        nv.lkwp[680] = 1411541694;
        nv.lkwp[681] = 1206516814;
        nv.lkwp[682] = 223278465;
        nv.lkwp[683] = -791055019;
        nv.lkwp[684] = 362070002;
        nv.lkwp[685] = -521708230;
        nv.lkwp[686] = -611059508;
        nv.lkwp[687] = 1400417182;
        nv.lkwp[688] = 202455676;
        nv.lkwp[689] = 938867459;
        nv.lkwp[690] = -598465583;
        nv.lkwp[691] = 2052343612;
        nv.lkwp[692] = -762725107;
        nv.lkwp[693] = -413750680;
        nv.lkwp[694] = 597633654;
        nv.lkwp[695] = -1683865009;
        nv.lkwp[696] = -16989463;
        nv.lkwp[697] = 1584513302;
        nv.lkwp[698] = -2012721727;
        nv.lkwp[699] = 1684697886;
    }

    private static /* synthetic */ long lkwv(int n2) {
        return lkww[n2] ^ lkwx[n2];
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static void moveToSlot(int n2, int n3) {
        boolean bl2;
        Object object = ud;
        boolean bl3 = true;
        block11: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - nv.lkwr("lmkp", lkwv(int ), (int)397);
            }
            switch ((int)object) {
                case -2084025854: {
                    callSite = nv.lkwr("lmkq", lkwv(int ), (int)398);
                    continue block11;
                }
                case -1957921692: {
                    callSite = nv.lkwr("lmkr", lkwv(int ), (int)399);
                    continue block11;
                }
                case 905451324: {
                    callSite = nv.lkwr("lmks", lkwv(int ), (int)400);
                    continue block11;
                }
                case 1637199440: {
                    break block11;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = ud;
        boolean bl5 = true;
        block12: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite - nv.lkwr("lmkt", lkwv(int ), (int)401);
            }
            switch ((int)object2) {
                case 918857879: {
                    callSite = nv.lkwr("lmku", lkwv(int ), (int)402);
                    continue block12;
                }
                case 1159731525: {
                    callSite = nv.lkwr("lmkv", lkwv(int ), (int)403);
                    continue block12;
                }
                case 1637199440: {
                    break block12;
                }
            }
            break;
        }
        int n4 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = ud - nv.lkwr("lmkw", lkwv(int ), (int)404)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == nv.lkwr("lmkx", lkwo(int ), (int)637)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = nv.lkwr("lmky", lkwo(int ), (int)638);
        }
        if (bl2 || bl2) return;
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = ud - nv.lkwr("lmkz", lkwv(int ), (int)405)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == nv.lkwr("lmla", lkwo(int ), (int)639)) {
                nv.swap(n2, n3);
                if (bl2) return;
                break;
            }
            object4 = nv.lkwr("lmlb", lkwo(int ), (int)640);
        }
        if (!bl2) return;
    }

    private static /* synthetic */ void lojl() {
        nv.lkww[400] = -4469982254714899282L;
        nv.lkww[401] = 7207780564188172881L;
        nv.lkww[402] = 2338455179593569834L;
        nv.lkww[403] = -4392207838646367222L;
        nv.lkww[404] = -3237395609046783902L;
        nv.lkww[405] = 2072354222119662021L;
        nv.lkww[406] = 4098283311509635326L;
        nv.lkww[407] = 1255220208095416425L;
        nv.lkww[408] = 6783783757268658742L;
        nv.lkww[409] = 2083009437361114911L;
        nv.lkww[410] = -5600879864394120092L;
        nv.lkww[411] = 7001052629908202640L;
        nv.lkww[412] = -8421531352487361968L;
        nv.lkww[413] = 2619501374591381988L;
        nv.lkww[414] = 6460985134083539675L;
        nv.lkww[415] = 4897013328652541023L;
        nv.lkww[416] = 7764338723340233337L;
        nv.lkww[417] = 2278525381420940555L;
        nv.lkww[418] = -4806803455597349915L;
        nv.lkww[419] = -6469224414618067605L;
        nv.lkww[420] = -1805315151743035192L;
        nv.lkww[421] = 4720582645586614805L;
        nv.lkww[422] = -6728429844667774166L;
        nv.lkww[423] = 4659256558309249643L;
        nv.lkww[424] = -8484889070785100728L;
        nv.lkww[425] = 5610638313386382194L;
        nv.lkww[426] = -3848196565089797261L;
        nv.lkww[427] = 5454581863782576269L;
        nv.lkww[428] = -2233314131525108939L;
        nv.lkww[429] = -8492161737301694291L;
        nv.lkww[430] = -1683930426767215160L;
        nv.lkww[431] = -5699845294404424401L;
        nv.lkww[432] = -4512664320468564763L;
        nv.lkww[433] = -1808543711283534213L;
        nv.lkww[434] = -1785398863056303620L;
        nv.lkww[435] = -5158478150919561060L;
        nv.lkww[436] = -6893723603611789489L;
        nv.lkww[437] = -7589684570764780741L;
        nv.lkww[438] = -1318828719302658119L;
        nv.lkww[439] = -4503041090055908281L;
        nv.lkww[440] = -8326767541339969669L;
        nv.lkww[441] = -6055158939341123948L;
        nv.lkww[442] = -558816205411885379L;
        nv.lkww[443] = -6601208748435587582L;
        nv.lkww[444] = -5654388895563114118L;
        nv.lkww[445] = 5909347914705244965L;
        nv.lkww[446] = 5738626588578378456L;
        nv.lkww[447] = -4355838387145402739L;
        nv.lkww[448] = -6098879335170036453L;
        nv.lkww[449] = 747058921554899706L;
        nv.lkww[450] = 8158882997487172821L;
        nv.lkww[451] = -110117826259842169L;
        nv.lkww[452] = 9092497479313537661L;
        nv.lkww[453] = 5319855649683252431L;
        nv.lkww[454] = -6940894880713699427L;
        nv.lkww[455] = -8782374838539483857L;
        nv.lkww[456] = -1075790607181065367L;
        nv.lkww[457] = -6915419921644148902L;
        nv.lkww[458] = -3875159199732728777L;
        nv.lkww[459] = 140079713852222589L;
        nv.lkww[460] = -2520792396024099372L;
        nv.lkww[461] = -1064964550299751457L;
        nv.lkww[462] = 7794992518713005151L;
        nv.lkww[463] = -2497800277422402436L;
        nv.lkww[464] = -5985812282035293869L;
        nv.lkww[465] = -4615460344068346386L;
        nv.lkww[466] = 8987637967623544865L;
        nv.lkww[467] = 3672085972754195261L;
        nv.lkww[468] = -4376654109448722572L;
        nv.lkww[469] = 2524463944628441113L;
        nv.lkww[470] = 796250697453055927L;
        nv.lkww[471] = -1980091323511059696L;
        nv.lkww[472] = 2288720108507589355L;
        nv.lkww[473] = 6464472069450730633L;
        nv.lkww[474] = -6597920805860013209L;
        nv.lkww[475] = -5734616960261373987L;
        nv.lkww[476] = 2313939128646826038L;
        nv.lkww[477] = 4587098614429866023L;
        nv.lkww[478] = -9141245950970979719L;
        nv.lkww[479] = -6781964719137041743L;
        nv.lkww[480] = 1753334285067069997L;
        nv.lkww[481] = 7886783112396863160L;
        nv.lkww[482] = -3466374166638508272L;
        nv.lkww[483] = -1429664599928993615L;
        nv.lkww[484] = 3370153815951177099L;
        nv.lkww[485] = -7627298897473855178L;
        nv.lkww[486] = -4669894250074014610L;
        nv.lkww[487] = -3328068015733180202L;
        nv.lkww[488] = 2116096076690578880L;
        nv.lkww[489] = -1362775938258227943L;
        nv.lkww[490] = 8014420709777063166L;
        nv.lkww[491] = 311491197620766163L;
        nv.lkww[492] = 3691960180392586890L;
        nv.lkww[493] = -3771777587287713181L;
        nv.lkww[494] = -2113444317781100630L;
        nv.lkww[495] = 6971483746521956361L;
        nv.lkww[496] = 7241330604098758141L;
        nv.lkww[497] = 5056115880360206003L;
        nv.lkww[498] = 7435738443538412059L;
        nv.lkww[499] = -4056565469322044659L;
    }

    private static /* synthetic */ void loik() {
        nv.lkwp[300] = 1351836333;
        nv.lkwp[301] = 1152397008;
        nv.lkwp[302] = -1299594676;
        nv.lkwp[303] = 1279037126;
        nv.lkwp[304] = -1789195945;
        nv.lkwp[305] = 1702325104;
        nv.lkwp[306] = -1964607697;
        nv.lkwp[307] = -1126414694;
        nv.lkwp[308] = 820714957;
        nv.lkwp[309] = 389232470;
        nv.lkwp[310] = -1703548016;
        nv.lkwp[311] = 33055635;
        nv.lkwp[312] = -2106331100;
        nv.lkwp[313] = 228424822;
        nv.lkwp[314] = 625872661;
        nv.lkwp[315] = 1103649230;
        nv.lkwp[316] = -2035968205;
        nv.lkwp[317] = -1246389385;
        nv.lkwp[318] = 989102421;
        nv.lkwp[319] = 500897401;
        nv.lkwp[320] = -1001258173;
        nv.lkwp[321] = 335515587;
        nv.lkwp[322] = -377631989;
        nv.lkwp[323] = -102378434;
        nv.lkwp[324] = -243548290;
        nv.lkwp[325] = -1254795213;
        nv.lkwp[326] = -1061479441;
        nv.lkwp[327] = 1627513306;
        nv.lkwp[328] = -2110309923;
        nv.lkwp[329] = -102034872;
        nv.lkwp[330] = 1642538280;
        nv.lkwp[331] = 1489674220;
        nv.lkwp[332] = 127380742;
        nv.lkwp[333] = 1837498183;
        nv.lkwp[334] = 1491536175;
        nv.lkwp[335] = -2077527560;
        nv.lkwp[336] = 1137791443;
        nv.lkwp[337] = -1794632811;
        nv.lkwp[338] = 1093913241;
        nv.lkwp[339] = 307128785;
        nv.lkwp[340] = 589883973;
        nv.lkwp[341] = 171580632;
        nv.lkwp[342] = 522579263;
        nv.lkwp[343] = 744112881;
        nv.lkwp[344] = 1175108838;
        nv.lkwp[345] = -1571246741;
        nv.lkwp[346] = 2129067249;
        nv.lkwp[347] = -1233725535;
        nv.lkwp[348] = -1017881457;
        nv.lkwp[349] = 1312536544;
        nv.lkwp[350] = -1415706269;
        nv.lkwp[351] = -110891758;
        nv.lkwp[352] = -1992725044;
        nv.lkwp[353] = 705308696;
        nv.lkwp[354] = 275026538;
        nv.lkwp[355] = 9784935;
        nv.lkwp[356] = 511336017;
        nv.lkwp[357] = -178767154;
        nv.lkwp[358] = -1347850541;
        nv.lkwp[359] = -1390795462;
        nv.lkwp[360] = -882289662;
        nv.lkwp[361] = 285930686;
        nv.lkwp[362] = -328672294;
        nv.lkwp[363] = -1560245468;
        nv.lkwp[364] = 1507511130;
        nv.lkwp[365] = 1480478643;
        nv.lkwp[366] = -1307066066;
        nv.lkwp[367] = -981047814;
        nv.lkwp[368] = -2032640068;
        nv.lkwp[369] = -781733940;
        nv.lkwp[370] = 1901657255;
        nv.lkwp[371] = -1389368836;
        nv.lkwp[372] = 648724259;
        nv.lkwp[373] = -107659866;
        nv.lkwp[374] = -297896658;
        nv.lkwp[375] = 281425660;
        nv.lkwp[376] = 1167985205;
        nv.lkwp[377] = -1402375076;
        nv.lkwp[378] = -809157272;
        nv.lkwp[379] = 1183640733;
        nv.lkwp[380] = 1341814171;
        nv.lkwp[381] = -1030841417;
        nv.lkwp[382] = 702271357;
        nv.lkwp[383] = -1859374573;
        nv.lkwp[384] = 1274479948;
        nv.lkwp[385] = -1838892138;
        nv.lkwp[386] = -960219204;
        nv.lkwp[387] = -749595870;
        nv.lkwp[388] = -1392648845;
        nv.lkwp[389] = 1091429946;
        nv.lkwp[390] = -2075876951;
        nv.lkwp[391] = 589853989;
        nv.lkwp[392] = 1093290296;
        nv.lkwp[393] = 728575641;
        nv.lkwp[394] = 15783080;
        nv.lkwp[395] = -14829828;
        nv.lkwp[396] = -347209537;
        nv.lkwp[397] = -844066690;
        nv.lkwp[398] = -1417547242;
        nv.lkwp[399] = -2003753975;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_1799 getCursorStack() {
        v0 /* !! */  = nv.ud;
        if (true) ** GOTO lbl5
        block33: while (true) {
            v0 /* !! */  = (long)(nv.lkwr("llib", lkwv(int ), (int)120) - nv.lkwr("llia", lkwv(int ), (int)119));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -624855306: {
                    continue block33;
                }
                case 1637199440: {
                    break block33;
                }
            }
            break;
        }
        var2 = nv.c;
        v1 /* !! */  = nv.ud;
        if (true) ** GOTO lbl15
        block34: while (true) {
            v1 /* !! */  = (long)(v2 - nv.lkwr("llic", lkwv(int ), (int)121));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 108486559: {
                    v2 = nv.lkwr("llid", lkwv(int ), (int)122);
                    continue block34;
                }
                case 1149222752: {
                    v2 = nv.lkwr("llie", lkwv(int ), (int)123);
                    continue block34;
                }
                case 1637199440: {
                    break block34;
                }
            }
            break;
        }
        var1_1 /* !! */  = nv.b;
        v3 /* !! */  = nv.ud;
        if (true) ** GOTO lbl29
        block35: while (true) {
            v3 /* !! */  = (long)(nv.lkwr("llig", lkwv(int ), (int)125) - nv.lkwr("llif", lkwv(int ), (int)124));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 1187375335: {
                    continue block35;
                }
                case 1637199440: {
                    break block35;
                }
            }
            break;
        }
        var0_2 = nv.a;
        if (var2) {
            throw null;
lbl37:
            // 3 sources

            return null;
        }
        if (var0_2 || var0_2) ** GOTO lbl37
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("llih", lkwv(int ), (int)126)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == nv.lkwr("llii", lkwo(int ), (int)172)) break;
                    v4 /* !! */  = (long)nv.lkwr("llij", lkwo(int ), (int)173);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("llik", lkwv(int ), (int)127)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == nv.lkwr("llil", lkwo(int ), (int)174)) break;
                    v5 /* !! */  = (long)nv.lkwr("llim", lkwo(int ), (int)175);
                }
                if (nv.mc.field_1724 != null) ** GOTO lbl64
                if (var0_2 || var0_2) ** GOTO lbl37
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("llin", lkwv(int ), (int)128)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == nv.lkwr("llio", lkwo(int ), (int)176)) break;
                    v6 /* !! */  = (long)nv.lkwr("llip", lkwo(int ), (int)177);
                }
                return class_1799.field_8037;
lbl64:
                // 1 sources

                if (var0_2 || var0_2) ** continue;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("lliq", lkwv(int ), (int)129)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == nv.lkwr("llir", lkwo(int ), (int)178)) break;
                    v7 /* !! */  = (long)nv.lkwr("llis", lkwo(int ), (int)179);
                }
                v8 /* !! */  = nv.ud;
                if (true) ** GOTO lbl75
                block41: while (true) {
                    v8 /* !! */  = (long)(nv.lkwr("lliu", lkwv(int ), (int)131) - nv.lkwr("llit", lkwv(int ), (int)130));
lbl75:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -857964032: {
                            continue block41;
                        }
                        case 1637199440: {
                            break block41;
                        }
                    }
                    break;
                }
                v9 = nv.mc.field_1724;
                v10 /* !! */  = nv.ud;
                if (true) ** GOTO lbl85
                block42: while (true) {
                    v10 /* !! */  = (long)(v11 - nv.lkwr("lliv", lkwv(int ), (int)132));
lbl85:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -143541311: {
                            v11 = nv.lkwr("lliw", lkwv(int ), (int)133);
                            continue block42;
                        }
                        case 1637199440: {
                            break block42;
                        }
                        case 1967755164: {
                            v11 = nv.lkwr("llix", lkwv(int ), (int)134);
                            continue block42;
                        }
                    }
                    break;
                }
                v12 = v9.field_7512;
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("lliy", lkwv(int ), (int)135)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v13 /* !! */  == nv.lkwr("lliz", lkwo(int ), (int)180)) break;
                    v13 /* !! */  = (long)nv.lkwr("llja", lkwo(int ), (int)181);
                }
                return v12.method_34255();
            }
lbl102:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)nv.lkwr("lljb", lkwo(int ), (int)182);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl107:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)nv.lkwr("lljc", lkwo(int ), (int)183);
                if (var2) {
                    throw null;
                }
            }
lbl111:
            // 4 sources

            case 2: {
                var1_1 /* !! */  = (int)nv.lkwr("lljd", lkwo(int ), (int)184);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)nv.lkwr("llje", lkwo(int ), (int)185);
                    if (!var2) ** GOTO lbl107
                    throw null;
                }
            }
lbl121:
            // 3 sources

            case 4: {
                var1_1 /* !! */  = (int)nv.lkwr("lljf", lkwo(int ), (int)186);
                if (!var2) ** GOTO lbl111
                throw null;
            }
            case 5: {
                var1_1 /* !! */  = (int)nv.lkwr("lljg", lkwo(int ), (int)187);
                if (!var2) ** GOTO lbl121
                throw null;
            }
lbl129:
            // 3 sources

            case 6: {
                var1_1 /* !! */  = (int)nv.lkwr("lljh", lkwo(int ), (int)188);
                if (!var2) ** GOTO lbl102
                throw null;
            }
            case 7: {
                var1_1 /* !! */  = (int)nv.lkwr("llji", lkwo(int ), (int)189);
                if (!var2) ** GOTO lbl121
                throw null;
            }
            case 8: 
        }
        var1_1 /* !! */  = (int)nv.lkwr("lljj", lkwo(int ), (int)190);
        ** while (!var2)
lbl140:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lojk() {
        nv.lkww[300] = -514336979981955645L;
        nv.lkww[301] = -3663523088122826804L;
        nv.lkww[302] = 3731359071550168186L;
        nv.lkww[303] = 7257383065760039534L;
        nv.lkww[304] = 1988935792896552297L;
        nv.lkww[305] = -118303271775969779L;
        nv.lkww[306] = -1081562464187363764L;
        nv.lkww[307] = 2443118429472393327L;
        nv.lkww[308] = -4297230021430068498L;
        nv.lkww[309] = -6780499329200500455L;
        nv.lkww[310] = -6660769210415207964L;
        nv.lkww[311] = 7966665015837076963L;
        nv.lkww[312] = 1656144832092220768L;
        nv.lkww[313] = -6923810400490834335L;
        nv.lkww[314] = 6030666678241033744L;
        nv.lkww[315] = -8872655147925904628L;
        nv.lkww[316] = -7117555619550276696L;
        nv.lkww[317] = -6866094976420449725L;
        nv.lkww[318] = 7263944848499465271L;
        nv.lkww[319] = -2209230073688303870L;
        nv.lkww[320] = 2828083701038555160L;
        nv.lkww[321] = -9086532974740937595L;
        nv.lkww[322] = 7920905114229102601L;
        nv.lkww[323] = 2446302963201379073L;
        nv.lkww[324] = 8484042850757645140L;
        nv.lkww[325] = 3189983976174284991L;
        nv.lkww[326] = 2016920297675595404L;
        nv.lkww[327] = 456577070210537469L;
        nv.lkww[328] = 66561488414037502L;
        nv.lkww[329] = 8073250492721016856L;
        nv.lkww[330] = 8501757659100458688L;
        nv.lkww[331] = 1502755238609397303L;
        nv.lkww[332] = -2812655129790255398L;
        nv.lkww[333] = 9085658635248216339L;
        nv.lkww[334] = -491615135838361683L;
        nv.lkww[335] = -1228014234756521193L;
        nv.lkww[336] = 4314125159462832856L;
        nv.lkww[337] = 7848364933336951293L;
        nv.lkww[338] = -1211279823339935891L;
        nv.lkww[339] = -7812990490559558327L;
        nv.lkww[340] = 225898246631503609L;
        nv.lkww[341] = -818802700164780849L;
        nv.lkww[342] = -7861351533548963548L;
        nv.lkww[343] = -3947532658912301131L;
        nv.lkww[344] = 1593335326367977764L;
        nv.lkww[345] = -7409968139027612385L;
        nv.lkww[346] = 8824515609070366833L;
        nv.lkww[347] = -1924208244964853863L;
        nv.lkww[348] = 2400156284525205893L;
        nv.lkww[349] = -9115566179657813479L;
        nv.lkww[350] = 1864795731190341764L;
        nv.lkww[351] = 20722677733991662L;
        nv.lkww[352] = -5010680782208549001L;
        nv.lkww[353] = 7930124989668578944L;
        nv.lkww[354] = -5580237701169175986L;
        nv.lkww[355] = 4218251738950257287L;
        nv.lkww[356] = 3845344697886873026L;
        nv.lkww[357] = -1279847028374427702L;
        nv.lkww[358] = 5914659909013646557L;
        nv.lkww[359] = -3576716759160266348L;
        nv.lkww[360] = 4502012466078417966L;
        nv.lkww[361] = -8165826332109519772L;
        nv.lkww[362] = -672378803670827323L;
        nv.lkww[363] = -1539015734542591959L;
        nv.lkww[364] = 791325106093333589L;
        nv.lkww[365] = -4149139814865235043L;
        nv.lkww[366] = 1278373015944381590L;
        nv.lkww[367] = 2361725410480470199L;
        nv.lkww[368] = 950938043720733536L;
        nv.lkww[369] = -7519284675853338686L;
        nv.lkww[370] = 6751966678530506325L;
        nv.lkww[371] = -7332007186377761124L;
        nv.lkww[372] = 5849941898806760598L;
        nv.lkww[373] = 5883783851363339400L;
        nv.lkww[374] = -601147834351189905L;
        nv.lkww[375] = -2953765096177271652L;
        nv.lkww[376] = 411285276198393006L;
        nv.lkww[377] = 7617053912355141680L;
        nv.lkww[378] = -1941505544662577694L;
        nv.lkww[379] = -9214593380010265615L;
        nv.lkww[380] = 1722414772656337510L;
        nv.lkww[381] = -6868405098858511968L;
        nv.lkww[382] = -3099107065123554535L;
        nv.lkww[383] = 99308259554616221L;
        nv.lkww[384] = -3146120909272118453L;
        nv.lkww[385] = -2704142737868252769L;
        nv.lkww[386] = 3623686053470947872L;
        nv.lkww[387] = 1632621937783420776L;
        nv.lkww[388] = 3813298105450329407L;
        nv.lkww[389] = -7301019683779834417L;
        nv.lkww[390] = -8436922836647737009L;
        nv.lkww[391] = 7314861683953273941L;
        nv.lkww[392] = 4907230410662459932L;
        nv.lkww[393] = -1651839584497859721L;
        nv.lkww[394] = 6923994111801599482L;
        nv.lkww[395] = 1952110783339931539L;
        nv.lkww[396] = -5091928238116282382L;
        nv.lkww[397] = 6861468179968383664L;
        nv.lkww[398] = 9049439582965827276L;
        nv.lkww[399] = -6733556085343718793L;
    }

    private static /* synthetic */ void loil() {
        nv.lkwp[400] = 1930226014;
        nv.lkwp[401] = -1903589339;
        nv.lkwp[402] = 1485156909;
        nv.lkwp[403] = 1237796265;
        nv.lkwp[404] = 705848833;
        nv.lkwp[405] = -1766103206;
        nv.lkwp[406] = -397791159;
        nv.lkwp[407] = 1715014339;
        nv.lkwp[408] = 165496368;
        nv.lkwp[409] = -1936103908;
        nv.lkwp[410] = 1686075071;
        nv.lkwp[411] = -1389531794;
        nv.lkwp[412] = -1225847383;
        nv.lkwp[413] = -822420434;
        nv.lkwp[414] = -324597310;
        nv.lkwp[415] = 1203904208;
        nv.lkwp[416] = -2029832720;
        nv.lkwp[417] = -552836498;
        nv.lkwp[418] = 483741524;
        nv.lkwp[419] = 409174369;
        nv.lkwp[420] = -1278777485;
        nv.lkwp[421] = -2118011409;
        nv.lkwp[422] = 1493489716;
        nv.lkwp[423] = 183791928;
        nv.lkwp[424] = 2022235852;
        nv.lkwp[425] = -1887008820;
        nv.lkwp[426] = 1118367095;
        nv.lkwp[427] = 703243124;
        nv.lkwp[428] = -197758327;
        nv.lkwp[429] = -1307927782;
        nv.lkwp[430] = -1154618859;
        nv.lkwp[431] = -978543937;
        nv.lkwp[432] = -1692800810;
        nv.lkwp[433] = 1189597963;
        nv.lkwp[434] = 971717993;
        nv.lkwp[435] = 348813902;
        nv.lkwp[436] = 1252169682;
        nv.lkwp[437] = -123266492;
        nv.lkwp[438] = -777492;
        nv.lkwp[439] = -1384433498;
        nv.lkwp[440] = -2000257106;
        nv.lkwp[441] = 949174925;
        nv.lkwp[442] = 1165061157;
        nv.lkwp[443] = 391902627;
        nv.lkwp[444] = 1864258346;
        nv.lkwp[445] = -652787033;
        nv.lkwp[446] = -603985955;
        nv.lkwp[447] = -2146993713;
        nv.lkwp[448] = 993273247;
        nv.lkwp[449] = 2086107109;
        nv.lkwp[450] = -1722351795;
        nv.lkwp[451] = 1673332163;
        nv.lkwp[452] = 2068244742;
        nv.lkwp[453] = 471606241;
        nv.lkwp[454] = 1425082182;
        nv.lkwp[455] = -1961217968;
        nv.lkwp[456] = -1682243478;
        nv.lkwp[457] = 362926527;
        nv.lkwp[458] = 109792295;
        nv.lkwp[459] = -630920957;
        nv.lkwp[460] = -496245392;
        nv.lkwp[461] = 1263733754;
        nv.lkwp[462] = 340119499;
        nv.lkwp[463] = 383205341;
        nv.lkwp[464] = -97004104;
        nv.lkwp[465] = -1593634104;
        nv.lkwp[466] = -1120662890;
        nv.lkwp[467] = 527501235;
        nv.lkwp[468] = -867279925;
        nv.lkwp[469] = 1139518270;
        nv.lkwp[470] = 1632079888;
        nv.lkwp[471] = 239857161;
        nv.lkwp[472] = -1679799798;
        nv.lkwp[473] = 2128464273;
        nv.lkwp[474] = 1874866446;
        nv.lkwp[475] = 776519170;
        nv.lkwp[476] = 1569936546;
        nv.lkwp[477] = -1006866261;
        nv.lkwp[478] = -345344498;
        nv.lkwp[479] = 156813786;
        nv.lkwp[480] = -1335278980;
        nv.lkwp[481] = 1338010501;
        nv.lkwp[482] = -657972919;
        nv.lkwp[483] = 413908332;
        nv.lkwp[484] = -757938740;
        nv.lkwp[485] = -1666562816;
        nv.lkwp[486] = 1694840973;
        nv.lkwp[487] = 1971218636;
        nv.lkwp[488] = 255966113;
        nv.lkwp[489] = -1583601960;
        nv.lkwp[490] = -1448563836;
        nv.lkwp[491] = 1495358528;
        nv.lkwp[492] = -1987340486;
        nv.lkwp[493] = -827389956;
        nv.lkwp[494] = -844487913;
        nv.lkwp[495] = 163449963;
        nv.lkwp[496] = 1651644686;
        nv.lkwp[497] = -843852116;
        nv.lkwp[498] = -1554980483;
        nv.lkwp[499] = 149016828;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void selectSlotSilent(int var0) {
        v0 /* !! */  = nv.ud;
        if (true) ** GOTO lbl5
        block48: while (true) {
            v0 /* !! */  = (long)(v1 - nv.lkwr("lmsp", lkwv(int ), (int)503));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1395524150: {
                    v1 = nv.lkwr("lmsq", lkwv(int ), (int)504);
                    continue block48;
                }
                case 1205435448: {
                    v1 = nv.lkwr("lmsr", lkwv(int ), (int)505);
                    continue block48;
                }
                case 1637199440: {
                    break block48;
                }
                case 2031510175: {
                    v1 = nv.lkwr("lmss", lkwv(int ), (int)506);
                    continue block48;
                }
            }
            break;
        }
        var3_1 = nv.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lmst", lkwv(int ), (int)507)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nv.lkwr("lmsu", lkwo(int ), (int)739)) break;
            v2 /* !! */  = (long)nv.lkwr("lmsv", lkwo(int ), (int)740);
        }
        var2_2 /* !! */  = nv.b;
        v3 /* !! */  = nv.ud;
        if (true) ** GOTO lbl28
        block50: while (true) {
            v3 /* !! */  = (long)(v4 - nv.lkwr("lmsw", lkwv(int ), (int)508));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1807818847: {
                    v4 = nv.lkwr("lmsx", lkwv(int ), (int)509);
                    continue block50;
                }
                case -790129506: {
                    v4 = nv.lkwr("lmsy", lkwv(int ), (int)510);
                    continue block50;
                }
                case 822988587: {
                    v4 = nv.lkwr("lmsz", lkwv(int ), (int)511);
                    continue block50;
                }
                case 1637199440: {
                    break block50;
                }
            }
            break;
        }
        var1_3 = nv.a;
        if (var3_1) {
            throw null;
lbl43:
            // 8 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl43
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lmta", lkwv(int ), (int)512)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == nv.lkwr("lmtb", lkwo(int ), (int)741)) break;
            v5 /* !! */  = (long)nv.lkwr("lmtc", lkwo(int ), (int)742);
        }
        v6 /* !! */  = nv.ud;
        if (true) ** GOTO lbl55
        block53: while (true) {
            v6 /* !! */  = (long)(nv.lkwr("lmte", lkwv(int ), (int)514) - nv.lkwr("lmtd", lkwv(int ), (int)513));
lbl55:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 1426869491: {
                    continue block53;
                }
                case 1637199440: {
                    break block53;
                }
            }
            break;
        }
        if (nv.mc.field_1724 == null) ** GOTO lbl89
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl43
                v7 /* !! */  = nv.ud;
                if (true) ** GOTO lbl69
                block54: while (true) {
                    v7 /* !! */  = (long)(v8 - nv.lkwr("lmtf", lkwv(int ), (int)515));
lbl69:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -229794551: {
                            v8 = nv.lkwr("lmtg", lkwv(int ), (int)516);
                            continue block54;
                        }
                        case 1360081240: {
                            v8 = nv.lkwr("lmth", lkwv(int ), (int)517);
                            continue block54;
                        }
                        case 1637199440: {
                            break block54;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lmti", lkwv(int ), (int)518)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == nv.lkwr("lmtj", lkwo(int ), (int)743)) break;
                    v9 /* !! */  = (long)nv.lkwr("lmtk", lkwo(int ), (int)744);
                }
                if (nv.mc.method_1562() == null) ** GOTO lbl89
                if (var1_3) ** GOTO lbl43
                if (var0 < 0) ** GOTO lbl89
                if (var1_3) ** GOTO lbl43
                if (var0 <= nv.lkwr("lmtl", lkwo(int ), (int)745)) ** GOTO lbl91
                if (var1_3) ** GOTO lbl43
lbl89:
                // 4 sources

                if (var1_3 || var1_3) ** GOTO lbl43
                return;
lbl91:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl43
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("lmtm", lkwv(int ), (int)519)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == nv.lkwr("lmtn", lkwo(int ), (int)746)) break;
                    v10 /* !! */  = (long)nv.lkwr("lmto", lkwo(int ), (int)747);
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("lmtp", lkwv(int ), (int)520)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == nv.lkwr("lmtq", lkwo(int ), (int)748)) break;
                    v11 /* !! */  = (long)nv.lkwr("lmtr", lkwo(int ), (int)749);
                }
                v12 = nv.mc.method_1562();
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_5 = nv.ud - nv.lkwr("lmts", lkwv(int ), (int)521)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == nv.lkwr("lmtt", lkwo(int ), (int)750)) break;
                    v13 /* !! */  = (long)nv.lkwr("lmtu", lkwo(int ), (int)751);
                }
                v14 /* !! */  = nv.ud;
                if (true) ** GOTO lbl112
                block59: while (true) {
                    v14 /* !! */  = (long)(v15 - nv.lkwr("lmtv", lkwv(int ), (int)522));
lbl112:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1181593655: {
                            v15 = nv.lkwr("lmtw", lkwv(int ), (int)523);
                            continue block59;
                        }
                        case 163974474: {
                            v15 = nv.lkwr("lmtx", lkwv(int ), (int)524);
                            continue block59;
                        }
                        case 943833867: {
                            v15 = nv.lkwr("lmty", lkwv(int ), (int)525);
                            continue block59;
                        }
                        case 1637199440: {
                            break block59;
                        }
                    }
                    break;
                }
                v16 = new class_2868(var0);
                v17 /* !! */  = nv.ud;
                if (true) ** GOTO lbl129
                block60: while (true) {
                    v17 /* !! */  = (long)(nv.lkwr("lmua", lkwv(int ), (int)527) - nv.lkwr("lmtz", lkwv(int ), (int)526));
lbl129:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case 1637199440: {
                            break block60;
                        }
                        case 2086234925: {
                            continue block60;
                        }
                    }
                    break;
                }
                v12.method_52787((class_2596)v16);
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl138:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)nv.lkwr("lmub", lkwo(int ), (int)752);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl143:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)nv.lkwr("lmuc", lkwo(int ), (int)753);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl148:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)nv.lkwr("lmud", lkwo(int ), (int)754);
                if (!var3_1) ** GOTO lbl143
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)nv.lkwr("lmue", lkwo(int ), (int)755);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl157:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)nv.lkwr("lmuf", lkwo(int ), (int)756);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 5: {
                var2_2 /* !! */  = (int)nv.lkwr("lmug", lkwo(int ), (int)757);
                if (!var3_1) ** GOTO lbl138
                throw null;
            }
lbl166:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)nv.lkwr("lmuh", lkwo(int ), (int)758);
                if (!var3_1) ** GOTO lbl148
                throw null;
            }
lbl170:
            // 4 sources

            case 7: {
                var2_2 /* !! */  = (int)nv.lkwr("lmui", lkwo(int ), (int)759);
                if (var3_1) {
                    throw null;
                }
            }
lbl174:
            // 4 sources

            case 8: {
                do {
                    var2_2 /* !! */  = (int)nv.lkwr("lmuj", lkwo(int ), (int)760);
                } while (!var3_1);
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)nv.lkwr("lmuk", lkwo(int ), (int)761);
                if (!var3_1) ** GOTO lbl174
                throw null;
            }
lbl183:
            // 3 sources

            case 10: {
                do {
                    var2_2 /* !! */  = (int)nv.lkwr("lmul", lkwo(int ), (int)762);
                } while (!var3_1);
                throw null;
            }
            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nv.lkwr("lmum", lkwo(int ), (int)763);
                    if (!var3_1) ** GOTO lbl170
                    throw null;
                }
            }
            case 12: {
                var2_2 /* !! */  = (int)nv.lkwr("lmun", lkwo(int ), (int)764);
                if (!var3_1) ** GOTO lbl170
                throw null;
            }
            case 13: {
                var2_2 /* !! */  = (int)nv.lkwr("lmuo", lkwo(int ), (int)765);
                if (!var3_1) ** GOTO lbl183
                throw null;
            }
            case 14: 
        }
        var2_2 /* !! */  = (int)nv.lkwr("lmup", lkwo(int ), (int)766);
        ** while (!var3_1)
lbl204:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void saveSlot() {
        block75: {
            v0 /* !! */  = nv.ud;
            block44: while (true) {
                switch ((int)v0 /* !! */ ) {
                    case -1150557390: {
                        v0 /* !! */  = (long)(nv.lkwr("lmur", lkwv(int ), (int)529) - nv.lkwr("lmuq", lkwv(int ), (int)528));
                        continue block44;
                    }
                    case 1637199440: {
                        break block44;
                    }
                }
                break;
            }
            var2 = nv.c;
            while (true) {
                block73: {
                    if ((v1 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lmus", lkwv(int ), (int)530)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v1 /* !! */  != nv.lkwr("lmut", lkwo(int ), (int)767)) break block73;
                    var1_1 /* !! */  = nv.b;
                    v2 /* !! */  = nv.ud;
                    if (true) ** GOTO lbl22
                }
                v1 /* !! */  = (long)nv.lkwr("lmuu", lkwo(int ), (int)768);
            }
            block46: while (true) {
                v2 /* !! */  = (long)(v3 - nv.lkwr("lmuv", lkwv(int ), (int)531));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -2122821551: {
                        v3 = nv.lkwr("lmuw", lkwv(int ), (int)532);
                        continue block46;
                    }
                    case 1529834596: {
                        v3 = nv.lkwr("lmux", lkwv(int ), (int)533);
                        continue block46;
                    }
                    case 1637199440: {
                        break block46;
                    }
                }
                break;
            }
            var0_2 = nv.a;
            if (var2) {
                throw null;
            }
            if (var0_2 || var0_2) ** GOTO lbl134
            while (true) {
                block74: {
                    if ((v4 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lmuy", lkwv(int ), (int)534)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  != nv.lkwr("lmuz", lkwo(int ), (int)769)) break block74;
                    v5 /* !! */  = nv.ud;
                    if (true) ** GOTO lbl46
                }
                v4 /* !! */  = (long)nv.lkwr("lmva", lkwo(int ), (int)770);
            }
            block48: while (true) {
                v5 /* !! */  = (long)(v6 - nv.lkwr("lmvb", lkwv(int ), (int)535));
lbl46:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1967864882: {
                        v6 = nv.lkwr("lmvc", lkwv(int ), (int)536);
                        continue block48;
                    }
                    case -1246282791: {
                        v6 = nv.lkwr("lmvd", lkwv(int ), (int)537);
                        continue block48;
                    }
                    case 1637199440: {
                        break block48;
                    }
                    case 2137434675: {
                        v6 = nv.lkwr("lmve", lkwv(int ), (int)538);
                        continue block48;
                    }
                }
                break;
            }
            if (nv.mc.field_1724 == null) break block75;
            if (var0_2 || var0_2) ** GOTO lbl134
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("lmvf", lkwv(int ), (int)539)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v7 /* !! */  == nv.lkwr("lmvg", lkwo(int ), (int)771)) break;
                v7 /* !! */  = (long)nv.lkwr("lmvh", lkwo(int ), (int)772);
            }
            while (true) {
                block76: {
                    if ((v8 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("lmvi", lkwv(int ), (int)540)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  != nv.lkwr("lmvj", lkwo(int ), (int)773)) break block76;
                    v9 = nv.mc.field_1724;
                    v10 /* !! */  = nv.ud;
                    if (true) ** GOTO lbl78
                }
                v8 /* !! */  = (long)nv.lkwr("lmvk", lkwo(int ), (int)774);
            }
            block51: while (true) {
                v10 /* !! */  = (long)(v11 - nv.lkwr("lmvl", lkwv(int ), (int)541));
lbl78:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1730407088: {
                        v11 = nv.lkwr("lmvm", lkwv(int ), (int)542);
                        continue block51;
                    }
                    case 1081938682: {
                        v11 = nv.lkwr("lmvn", lkwv(int ), (int)543);
                        continue block51;
                    }
                    case 1296626826: {
                        v11 = nv.lkwr("lmvo", lkwv(int ), (int)544);
                        continue block51;
                    }
                    case 1637199440: {
                        break block51;
                    }
                }
                break;
            }
            v12 = v9.method_31548();
            v13 /* !! */  = nv.ud;
            if (true) ** GOTO lbl95
            block52: while (true) {
                v13 /* !! */  = (long)(v14 - nv.lkwr("lmvp", lkwv(int ), (int)545));
lbl95:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1198194384: {
                        v14 = nv.lkwr("lmvq", lkwv(int ), (int)546);
                        continue block52;
                    }
                    case -672983655: {
                        v14 = nv.lkwr("lmvr", lkwv(int ), (int)547);
                        continue block52;
                    }
                    case -663189151: {
                        v14 = nv.lkwr("lmvs", lkwv(int ), (int)548);
                        continue block52;
                    }
                    case 1637199440: {
                        break block52;
                    }
                }
                break;
            }
            v15 = v12.method_67532();
            v16 /* !! */  = nv.ud;
            if (true) ** GOTO lbl112
            block53: while (true) {
                v16 /* !! */  = (long)(v17 - nv.lkwr("lmvt", lkwv(int ), (int)549));
lbl112:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case -1616500208: {
                        v17 = nv.lkwr("lmvu", lkwv(int ), (int)550);
                        continue block53;
                    }
                    case 1278333339: {
                        v17 = nv.lkwr("lmvv", lkwv(int ), (int)551);
                        continue block53;
                    }
                    case 1637199440: {
                        break block53;
                    }
                    case 1649234991: {
                        v17 = nv.lkwr("lmvw", lkwv(int ), (int)552);
                        continue block53;
                    }
                }
                break;
            }
            nv.savedSlot = v15;
            if (var0_2) ** GOTO lbl134
        }
        if (var0_2) ** GOTO lbl134
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block54: while (true) {
            block77: {
                switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (!var0_2) ** GOTO lbl135
lbl134:
                        // 5 sources

                        return;
lbl135:
                        // 1 sources

                        return;
                    }
                    case 0: {
                        ** GOTO lbl158
                    }
                    case 4: {
                        var1_1 /* !! */  = (int)nv.lkwr("lmwb", lkwo(int ), (int)779);
                        cfr_temp_0 = 1;
                        if (var2) {
                            throw null;
                        }
                        break block77;
                    }
                    case 7: {
                        var1_1 /* !! */  = (int)nv.lkwr("lmwe", lkwo(int ), (int)782);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 3: {
                        var1_1 /* !! */  = (int)nv.lkwr("lmwa", lkwo(int ), (int)778);
                        cfr_temp_0 = 2;
                        if (var2) {
                            throw null;
                        }
                        break block77;
                    }
                    case 8: {
                        var1_1 /* !! */  = (int)nv.lkwr("lmwf", lkwo(int ), (int)783);
                        if (var2) {
                            throw null;
                        }
lbl158:
                        // 3 sources

                        var1_1 /* !! */  = (int)nv.lkwr("lmvx", lkwo(int ), (int)775);
                        cfr_temp_0 = 6;
                        if (var2) {
                            throw null;
                        }
                        break block77;
                    }
                    case 1: {
                        var1_1 /* !! */  = (int)nv.lkwr("lmvy", lkwo(int ), (int)776);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var1_1 /* !! */  = (int)nv.lkwr("lmwd", lkwo(int ), (int)781);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var1_1 /* !! */  = (int)nv.lkwr("lmvz", lkwo(int ), (int)777);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 5: 
                }
                ** GOTO lbl180
            }
            do {
                if (true) continue block54;
lbl180:
                // 2 sources

                var1_1 /* !! */  = (int)nv.lkwr("lmwc", lkwo(int ), (int)780);
                cfr_temp_0 = 1;
            } while (!var2);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_1799 mainhandStack() {
        block65: {
            v0 /* !! */  = nv.ud;
            if (true) ** GOTO lbl5
            block46: while (true) {
                v0 /* !! */  = (long)(v1 - nv.lkwr("lobf", lkwv(int ), (int)943));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case 1095018715: {
                        v1 = nv.lkwr("lobg", lkwv(int ), (int)944);
                        continue block46;
                    }
                    case 1637199440: {
                        break block46;
                    }
                    case 1834156331: {
                        v1 = nv.lkwr("lobh", lkwv(int ), (int)945);
                        continue block46;
                    }
                }
                break;
            }
            var2 = nv.c;
            v2 /* !! */  = nv.ud;
            if (true) ** GOTO lbl19
            block47: while (true) {
                v2 /* !! */  = (long)(v3 - nv.lkwr("lobi", lkwv(int ), (int)946));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -891563858: {
                        v3 = nv.lkwr("lobj", lkwv(int ), (int)947);
                        continue block47;
                    }
                    case -438984173: {
                        v3 = nv.lkwr("lobk", lkwv(int ), (int)948);
                        continue block47;
                    }
                    case 520093860: {
                        v3 = nv.lkwr("lobl", lkwv(int ), (int)949);
                        continue block47;
                    }
                    case 1637199440: {
                        break block47;
                    }
                }
                break;
            }
            var1_1 /* !! */  = nv.b;
            v4 /* !! */  = nv.ud;
            if (true) ** GOTO lbl36
            block48: while (true) {
                v4 /* !! */  = (long)(nv.lkwr("lobn", lkwv(int ), (int)951) - nv.lkwr("lobm", lkwv(int ), (int)950));
lbl36:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -109165898: {
                        continue block48;
                    }
                    case 1637199440: {
                        break block48;
                    }
                }
                break;
            }
            var0_2 = nv.a;
            if (var2) {
                throw null;
lbl44:
                // 3 sources

                return null;
            }
            if (var0_2 || var0_2) ** GOTO lbl44
            v5 /* !! */  = nv.ud;
            if (true) ** GOTO lbl51
            block50: while (true) {
                v5 /* !! */  = (long)(nv.lkwr("lobp", lkwv(int ), (int)953) - nv.lkwr("lobo", lkwv(int ), (int)952));
lbl51:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1181741792: {
                        continue block50;
                    }
                    case 1637199440: {
                        break block50;
                    }
                }
                break;
            }
            v6 /* !! */  = nv.ud;
            if (true) ** GOTO lbl60
            block51: while (true) {
                v6 /* !! */  = (long)(nv.lkwr("lobr", lkwv(int ), (int)955) - nv.lkwr("lobq", lkwv(int ), (int)954));
lbl60:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case 1637199440: {
                        break block51;
                    }
                    case 1668850737: {
                        continue block51;
                    }
                }
                break;
            }
            if (nv.mc.field_1724 == null) break block65;
            if (var0_2) ** GOTO lbl44
            v7 /* !! */  = nv.ud;
            if (true) ** GOTO lbl71
            block52: while (true) {
                v7 /* !! */  = (long)(nv.lkwr("lobt", lkwv(int ), (int)957) - nv.lkwr("lobs", lkwv(int ), (int)956));
lbl71:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -765364105: {
                        continue block52;
                    }
                    case 1637199440: {
                        break block52;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lobu", lkwv(int ), (int)958)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == nv.lkwr("lobv", lkwo(int ), (int)1199)) break;
                v8 /* !! */  = (long)nv.lkwr("lobw", lkwo(int ), (int)1200);
            }
            v9 = nv.mc.field_1724;
            v10 /* !! */  = nv.ud;
            if (true) ** GOTO lbl86
            block54: while (true) {
                v10 /* !! */  = (long)(v11 - nv.lkwr("lobx", lkwv(int ), (int)959));
lbl86:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case 407957831: {
                        v11 = nv.lkwr("loby", lkwv(int ), (int)960);
                        continue block54;
                    }
                    case 1637199440: {
                        break block54;
                    }
                    case 1782030825: {
                        v11 = nv.lkwr("lobz", lkwv(int ), (int)961);
                        continue block54;
                    }
                }
                break;
            }
            v12 = v9.method_6047();
            if (var2) {
                throw null;
            }
            ** GOTO lbl115
        }
        if (!var0_2 && !var0_2) ** break;
        ** while (true)
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v13 /* !! */  = nv.ud;
                if (true) ** GOTO lbl109
                block55: while (true) {
                    v13 /* !! */  = (long)(nv.lkwr("locb", lkwv(int ), (int)963) - nv.lkwr("loca", lkwv(int ), (int)962));
lbl109:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case 1503731798: {
                            continue block55;
                        }
                        case 1637199440: {
                            break block55;
                        }
                    }
                    break;
                }
                v12 = class_1799.field_8037;
lbl115:
                // 2 sources

                return v12;
            }
lbl116:
            // 3 sources

            case 0: {
                var1_1 /* !! */  = (int)nv.lkwr("locc", lkwo(int ), (int)1201);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl121:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)nv.lkwr("locd", lkwo(int ), (int)1202);
                if (!var2) ** GOTO lbl116
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)nv.lkwr("loce", lkwo(int ), (int)1203);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl130:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)nv.lkwr("locf", lkwo(int ), (int)1204);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl141
                    break;
                }
            }
lbl136:
            // 2 sources

            case 4: {
                do {
                    var1_1 /* !! */  = (int)nv.lkwr("locg", lkwo(int ), (int)1205);
                } while (!var2);
                throw null;
            }
lbl141:
            // 2 sources

            case 5: {
                var1_1 /* !! */  = (int)nv.lkwr("loch", lkwo(int ), (int)1206);
                if (!var2) ** GOTO lbl121
                throw null;
            }
            case 6: {
                var1_1 /* !! */  = (int)nv.lkwr("loci", lkwo(int ), (int)1207);
                if (!var2) ** GOTO lbl116
                throw null;
            }
            case 7: 
        }
        var1_1 /* !! */  = (int)nv.lkwr("locj", lkwo(int ), (int)1208);
        ** while (!var2)
lbl152:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    public static void sendUsePacket(class_1268 var0, float var1_1, float var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 71[SWITCH]
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int findChestArmorSlot() {
        block106: {
            v0 /* !! */  = nv.ud;
            if (true) ** GOTO lbl5
            block66: while (true) {
                v0 /* !! */  = (long)(nv.lkwr("lldg", lkwv(int ), (int)65) - nv.lkwr("lldf", lkwv(int ), (int)64));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1061632872: {
                        continue block66;
                    }
                    case 1637199440: {
                        break block66;
                    }
                }
                break;
            }
            var5 = nv.c;
            v1 /* !! */  = nv.ud;
            if (true) ** GOTO lbl15
            block67: while (true) {
                v1 /* !! */  = (long)(v2 - nv.lkwr("lldh", lkwv(int ), (int)66));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1167994588: {
                        v2 = nv.lkwr("lldi", lkwv(int ), (int)67);
                        continue block67;
                    }
                    case -211121474: {
                        v2 = nv.lkwr("lldj", lkwv(int ), (int)68);
                        continue block67;
                    }
                    case -139662497: {
                        v2 = nv.lkwr("lldk", lkwv(int ), (int)69);
                        continue block67;
                    }
                    case 1637199440: {
                        break block67;
                    }
                }
                break;
            }
            var4_1 /* !! */  = nv.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lldl", lkwv(int ), (int)70)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == nv.lkwr("lldm", lkwo(int ), (int)102)) break;
                v3 /* !! */  = (long)nv.lkwr("lldn", lkwo(int ), (int)103);
            }
            var3_2 = nv.a;
            if (var5) {
                throw null;
lbl36:
                // 14 sources

                return (int)nv.lkwr("lldo", lkwo(int ), (int)104);
            }
            if (var3_2 || var3_2) ** GOTO lbl36
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lldp", lkwv(int ), (int)71)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == nv.lkwr("lldq", lkwo(int ), (int)105)) break;
                v4 /* !! */  = (long)nv.lkwr("lldr", lkwo(int ), (int)106);
            }
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("llds", lkwv(int ), (int)72)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == nv.lkwr("lldt", lkwo(int ), (int)107)) break;
                v5 /* !! */  = (long)nv.lkwr("lldu", lkwo(int ), (int)108);
            }
            if (nv.mc.field_1724 != null) break block106;
            if (var3_2) ** GOTO lbl36
            return (int)nv.lkwr("lldv", lkwo(int ), (int)109);
        }
        if (var3_2 || var3_2) ** GOTO lbl36
        var0_3 = nv.lkwr("lldw", lkwo(int ), (int)110);
        if (var3_2) ** GOTO lbl36
        block72: while (true) {
            if (var3_2 || var3_2) ** GOTO lbl36
            if (var0_3 >= nv.lkwr("lldx", lkwo(int ), (int)111)) ** GOTO lbl178
            if (var3_2 || var3_2) ** GOTO lbl36
            v6 /* !! */  = nv.ud;
            if (true) ** GOTO lbl64
            block73: while (true) {
                v6 /* !! */  = (long)(v7 - nv.lkwr("lldy", lkwv(int ), (int)73));
lbl64:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case 1157547846: {
                        v7 = nv.lkwr("lldz", lkwv(int ), (int)74);
                        continue block73;
                    }
                    case 1259561045: {
                        v7 = nv.lkwr("llea", lkwv(int ), (int)75);
                        continue block73;
                    }
                    case 1637199440: {
                        break block73;
                    }
                    case 1910816254: {
                        v7 = nv.lkwr("lleb", lkwv(int ), (int)76);
                        continue block73;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("llec", lkwv(int ), (int)77)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == nv.lkwr("lled", lkwo(int ), (int)112)) break;
                v8 /* !! */  = (long)nv.lkwr("llee", lkwo(int ), (int)113);
            }
            v9 = nv.mc.field_1724;
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("llef", lkwv(int ), (int)78)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == nv.lkwr("lleg", lkwo(int ), (int)114)) break;
                v10 /* !! */  = (long)nv.lkwr("lleh", lkwo(int ), (int)115);
            }
            v11 = v9.method_31548();
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_5 = nv.ud - nv.lkwr("llei", lkwv(int ), (int)79)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == nv.lkwr("llej", lkwo(int ), (int)116)) break;
                v12 /* !! */  = (long)nv.lkwr("llek", lkwo(int ), (int)117);
            }
            var1_4 = v11.method_5438((int)var0_3);
            if (var3_2 || var3_2) ** GOTO lbl36
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_6 = nv.ud - nv.lkwr("llel", lkwv(int ), (int)80)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == nv.lkwr("llem", lkwo(int ), (int)118)) break;
                v13 /* !! */  = (long)nv.lkwr("llen", lkwo(int ), (int)119);
            }
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_7 = nv.ud - nv.lkwr("lleo", lkwv(int ), (int)81)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == nv.lkwr("llep", lkwo(int ), (int)120)) break;
                v14 /* !! */  = (long)nv.lkwr("lleq", lkwo(int ), (int)121);
            }
            var2_5 = (class_10192)var1_4.method_58694(class_9334.field_54196);
            if (var3_2 || var3_2) ** GOTO lbl36
            if (var2_5 == null) ** GOTO lbl173
            if (var3_2) ** GOTO lbl36
            v15 /* !! */  = nv.ud;
            if (true) ** GOTO lbl113
            block79: while (true) {
                v15 /* !! */  = (long)(nv.lkwr("lles", lkwv(int ), (int)83) - nv.lkwr("ller", lkwv(int ), (int)82));
lbl113:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case 992466197: {
                        continue block79;
                    }
                    case 1637199440: {
                        break block79;
                    }
                }
                break;
            }
            v16 = var2_5.comp_3174();
            v17 /* !! */  = nv.ud;
            if (true) ** GOTO lbl123
            block80: while (true) {
                v17 /* !! */  = (long)(v18 - nv.lkwr("llet", lkwv(int ), (int)84));
lbl123:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -1322285046: {
                        v18 = nv.lkwr("lleu", lkwv(int ), (int)85);
                        continue block80;
                    }
                    case 1098741189: {
                        v18 = nv.lkwr("llev", lkwv(int ), (int)86);
                        continue block80;
                    }
                    case 1637199440: {
                        break block80;
                    }
                    case 1802553625: {
                        v18 = nv.lkwr("llew", lkwv(int ), (int)87);
                        continue block80;
                    }
                }
                break;
            }
            if (v16 != class_1304.field_6174) ** GOTO lbl173
            if (var3_2) ** GOTO lbl36
            v19 /* !! */  = nv.ud;
            if (true) ** GOTO lbl141
            block81: while (true) {
                v19 /* !! */  = (long)(v20 - nv.lkwr("llex", lkwv(int ), (int)88));
lbl141:
                // 2 sources

                switch ((int)v19 /* !! */ ) {
                    case -638952828: {
                        v20 = nv.lkwr("lley", lkwv(int ), (int)89);
                        continue block81;
                    }
                    case 581924092: {
                        v20 = nv.lkwr("llez", lkwv(int ), (int)90);
                        continue block81;
                    }
                    case 1326067498: {
                        v20 = nv.lkwr("llfa", lkwv(int ), (int)91);
                        continue block81;
                    }
                    case 1637199440: {
                        break block81;
                    }
                }
                break;
            }
            v21 = var1_4.method_7909();
            v22 /* !! */  = nv.ud;
            if (true) ** GOTO lbl158
            block82: while (true) {
                v22 /* !! */  = (long)(v23 - nv.lkwr("llfb", lkwv(int ), (int)92));
lbl158:
                // 2 sources

                switch ((int)v22 /* !! */ ) {
                    case -643050392: {
                        v23 = nv.lkwr("llfc", lkwv(int ), (int)93);
                        continue block82;
                    }
                    case 1637199440: {
                        break block82;
                    }
                    case 2123383594: {
                        v23 = nv.lkwr("llfd", lkwv(int ), (int)94);
                        continue block82;
                    }
                }
                break;
            }
            if (v21 == class_1802.field_8833) ** GOTO lbl173
            if (var4_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var4_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var3_2 || var3_2) ** GOTO lbl36
                    return (int)var0_3;
                }
lbl173:
                // 3 sources

                if (var3_2 || var3_2) ** GOTO lbl36
                ++var0_3;
                if (var3_2) ** GOTO lbl36
                if (!var5) continue block72;
                throw null;
lbl178:
                // 1 sources

                if (!var3_2 && !var3_2) ** break;
                ** continue;
                return (int)nv.lkwr("llfe", lkwo(int ), (int)122);
                case 0: {
                    var4_1 /* !! */  = (int)nv.lkwr("llff", lkwo(int ), (int)123);
                    if (var5) {
                        throw null;
                    }
                    ** GOTO lbl255
                }
lbl186:
                // 2 sources

                case 1: {
                    var4_1 /* !! */  = (int)nv.lkwr("llfg", lkwo(int ), (int)124);
                    if (var5) {
                        throw null;
                    }
                    ** GOTO lbl260
                }
lbl191:
                // 2 sources

                case 2: {
                    var4_1 /* !! */  = (int)nv.lkwr("llfh", lkwo(int ), (int)125);
                    if (var5) {
                        throw null;
                    }
                    ** GOTO lbl201
                }
lbl196:
                // 3 sources

                case 3: {
                    var4_1 /* !! */  = (int)nv.lkwr("llfi", lkwo(int ), (int)126);
                    if (var5) {
                        throw null;
                    }
                    ** GOTO lbl272
                }
lbl201:
                // 4 sources

                case 4: {
                    var4_1 /* !! */  = (int)nv.lkwr("llfj", lkwo(int ), (int)127);
                    if (var5) {
                        throw null;
                    }
                    ** GOTO lbl264
                }
lbl206:
                // 3 sources

                case 5: {
                    var4_1 /* !! */  = (int)nv.lkwr("llfk", lkwo(int ), (int)128);
                    if (var5) {
                        throw null;
                    }
                    ** GOTO lbl288
                }
                case 6: {
                    var4_1 /* !! */  = (int)nv.lkwr("llfl", lkwo(int ), (int)129);
                    if (!var5) ** GOTO lbl201
                    throw null;
                }
lbl215:
                // 2 sources

                case 7: {
                    var4_1 /* !! */  = (int)nv.lkwr("llfm", lkwo(int ), (int)130);
                    if (var5) {
                        throw null;
                    }
                    ** GOTO lbl234
                }
lbl220:
                // 2 sources

                case 8: {
                    do {
                        var4_1 /* !! */  = (int)nv.lkwr("llfn", lkwo(int ), (int)131);
                    } while (!var5);
                    throw null;
                }
                case 9: {
                    var4_1 /* !! */  = (int)nv.lkwr("llfo", lkwo(int ), (int)132);
                    if (!var5) ** GOTO lbl206
                    throw null;
                }
lbl229:
                // 2 sources

                case 10: {
                    var4_1 /* !! */  = (int)nv.lkwr("llfp", lkwo(int ), (int)133);
                    if (var5) {
                        throw null;
                    }
                    ** GOTO lbl268
                }
lbl234:
                // 5 sources

                case 11: {
                    var4_1 /* !! */  = (int)nv.lkwr("llfq", lkwo(int ), (int)134);
                    if (!var5) ** GOTO lbl196
                    throw null;
                }
                case 12: {
                    var4_1 /* !! */  = (int)nv.lkwr("llfr", lkwo(int ), (int)135);
                    if (var5) {
                        throw null;
                    }
                    ** GOTO lbl292
                }
lbl243:
                // 2 sources

                case 13: {
                    var4_1 /* !! */  = (int)nv.lkwr("llfs", lkwo(int ), (int)136);
                    if (!var5) ** GOTO lbl215
                    throw null;
                }
lbl247:
                // 2 sources

                case 14: {
                    var4_1 /* !! */  = (int)nv.lkwr("llft", lkwo(int ), (int)137);
                    if (!var5) ** GOTO lbl206
                    throw null;
                }
                case 15: {
                    var4_1 /* !! */  = (int)nv.lkwr("llfu", lkwo(int ), (int)138);
                    if (!var5) ** GOTO lbl234
                    throw null;
                }
lbl255:
                // 2 sources

                case 16: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var4_1 /* !! */  = (int)nv.lkwr("llfv", lkwo(int ), (int)139);
                        if (!var5) ** GOTO lbl229
                        throw null;
                    }
                }
lbl260:
                // 2 sources

                case 17: {
                    var4_1 /* !! */  = (int)nv.lkwr("llfw", lkwo(int ), (int)140);
                    if (!var5) ** GOTO lbl191
                    throw null;
                }
lbl264:
                // 2 sources

                case 18: {
                    var4_1 /* !! */  = (int)nv.lkwr("llfx", lkwo(int ), (int)141);
                    if (!var5) ** GOTO lbl243
                    throw null;
                }
lbl268:
                // 2 sources

                case 19: {
                    var4_1 /* !! */  = (int)nv.lkwr("llfy", lkwo(int ), (int)142);
                    if (!var5) ** GOTO lbl186
                    throw null;
                }
lbl272:
                // 2 sources

                case 20: {
                    var4_1 /* !! */  = (int)nv.lkwr("llfz", lkwo(int ), (int)143);
                    if (!var5) ** GOTO lbl196
                    throw null;
                }
                case 21: {
                    var4_1 /* !! */  = (int)nv.lkwr("llga", lkwo(int ), (int)144);
                    if (!var5) ** GOTO lbl201
                    throw null;
                }
                case 22: {
                    var4_1 /* !! */  = (int)nv.lkwr("llgb", lkwo(int ), (int)145);
                    if (!var5) ** GOTO lbl234
                    throw null;
                }
                case 23: {
                    var4_1 /* !! */  = (int)nv.lkwr("llgc", lkwo(int ), (int)146);
                    if (!var5) ** GOTO lbl247
                    throw null;
                }
lbl288:
                // 2 sources

                case 24: {
                    var4_1 /* !! */  = (int)nv.lkwr("llgd", lkwo(int ), (int)147);
                    if (!var5) ** GOTO lbl234
                    throw null;
                }
lbl292:
                // 2 sources

                case 25: {
                    var4_1 /* !! */  = (int)nv.lkwr("llge", lkwo(int ), (int)148);
                    if (!var5) ** GOTO lbl220
                    throw null;
                }
                case 26: 
            }
            break;
        }
        var4_1 /* !! */  = (int)nv.lkwr("llgf", lkwo(int ), (int)149);
        ** while (!var5)
lbl299:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void loiq() {
        nv.lkwp[900] = 71208663;
        nv.lkwp[901] = -1553676585;
        nv.lkwp[902] = -1724654356;
        nv.lkwp[903] = -1799756700;
        nv.lkwp[904] = 1761510829;
        nv.lkwp[905] = 2033296538;
        nv.lkwp[906] = 988640957;
        nv.lkwp[907] = 656415518;
        nv.lkwp[908] = 1805011913;
        nv.lkwp[909] = -674421971;
        nv.lkwp[910] = -123997749;
        nv.lkwp[911] = -655735871;
        nv.lkwp[912] = 444805868;
        nv.lkwp[913] = 1353652347;
        nv.lkwp[914] = -991484649;
        nv.lkwp[915] = -171596463;
        nv.lkwp[916] = 1446918747;
        nv.lkwp[917] = 1360002641;
        nv.lkwp[918] = -1756225125;
        nv.lkwp[919] = 1436537063;
        nv.lkwp[920] = 770483559;
        nv.lkwp[921] = 245097511;
        nv.lkwp[922] = -502693238;
        nv.lkwp[923] = 1882849773;
        nv.lkwp[924] = 1094414142;
        nv.lkwp[925] = 798927922;
        nv.lkwp[926] = 2132614769;
        nv.lkwp[927] = -863080023;
        nv.lkwp[928] = -2117733475;
        nv.lkwp[929] = -824911091;
        nv.lkwp[930] = 670589621;
        nv.lkwp[931] = -1058744963;
        nv.lkwp[932] = -583465115;
        nv.lkwp[933] = 1381375206;
        nv.lkwp[934] = -440523552;
        nv.lkwp[935] = -1302872861;
        nv.lkwp[936] = 1353567753;
        nv.lkwp[937] = -675401148;
        nv.lkwp[938] = 2128163089;
        nv.lkwp[939] = -914019256;
        nv.lkwp[940] = 1805527115;
        nv.lkwp[941] = 462309460;
        nv.lkwp[942] = 392359215;
        nv.lkwp[943] = -1435812960;
        nv.lkwp[944] = 227325402;
        nv.lkwp[945] = -1746840976;
        nv.lkwp[946] = -884093153;
        nv.lkwp[947] = -412270868;
        nv.lkwp[948] = 1414738715;
        nv.lkwp[949] = -2002781266;
        nv.lkwp[950] = -1050585326;
        nv.lkwp[951] = -1431422485;
        nv.lkwp[952] = -752911981;
        nv.lkwp[953] = -1232182042;
        nv.lkwp[954] = -1865516221;
        nv.lkwp[955] = -1849311140;
        nv.lkwp[956] = 763023568;
        nv.lkwp[957] = -1677182834;
        nv.lkwp[958] = 1633529761;
        nv.lkwp[959] = -2069106823;
        nv.lkwp[960] = 334557999;
        nv.lkwp[961] = -2068534444;
        nv.lkwp[962] = -395831788;
        nv.lkwp[963] = -1187683715;
        nv.lkwp[964] = -2027173360;
        nv.lkwp[965] = -1905499507;
        nv.lkwp[966] = -1093199836;
        nv.lkwp[967] = 1113520351;
        nv.lkwp[968] = 1604738454;
        nv.lkwp[969] = 1443005180;
        nv.lkwp[970] = -1716800659;
        nv.lkwp[971] = -602675550;
        nv.lkwp[972] = -2055516774;
        nv.lkwp[973] = 1806235240;
        nv.lkwp[974] = -788689201;
        nv.lkwp[975] = 2082388265;
        nv.lkwp[976] = -2139769930;
        nv.lkwp[977] = 1237826136;
        nv.lkwp[978] = 1528600479;
        nv.lkwp[979] = -249535720;
        nv.lkwp[980] = 934306405;
        nv.lkwp[981] = 1460461243;
        nv.lkwp[982] = -1442988032;
        nv.lkwp[983] = 536538235;
        nv.lkwp[984] = 869999861;
        nv.lkwp[985] = 113495950;
        nv.lkwp[986] = -785169489;
        nv.lkwp[987] = -1093765071;
        nv.lkwp[988] = 446711007;
        nv.lkwp[989] = 33288682;
        nv.lkwp[990] = -1490547758;
        nv.lkwp[991] = 2042099659;
        nv.lkwp[992] = 839613879;
        nv.lkwp[993] = 673828270;
        nv.lkwp[994] = 503762014;
        nv.lkwp[995] = 850249983;
        nv.lkwp[996] = -2116150527;
        nv.lkwp[997] = -1395823684;
        nv.lkwp[998] = 687130056;
        nv.lkwp[999] = -346543993;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void restoreSlotSilent() {
        v0 /* !! */  = nv.ud;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - nv.lkwr("lmxn", lkwv(int ), (int)569));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1903499809: {
                    v1 = nv.lkwr("lmxo", lkwv(int ), (int)570);
                    continue block24;
                }
                case -1489156216: {
                    v1 = nv.lkwr("lmxp", lkwv(int ), (int)571);
                    continue block24;
                }
                case 572913747: {
                    v1 = nv.lkwr("lmxq", lkwv(int ), (int)572);
                    continue block24;
                }
                case 1637199440: {
                    break block24;
                }
            }
            break;
        }
        var2 = nv.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lmxr", lkwv(int ), (int)573)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nv.lkwr("lmxs", lkwo(int ), (int)801)) break;
            v2 /* !! */  = (long)nv.lkwr("lmxt", lkwo(int ), (int)802);
        }
        var1_1 /* !! */  = nv.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lmxu", lkwv(int ), (int)574)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == nv.lkwr("lmxv", lkwo(int ), (int)803)) break;
            v3 /* !! */  = (long)nv.lkwr("lmxw", lkwo(int ), (int)804);
        }
        var0_2 = nv.a;
        if (var2) {
            throw null;
lbl32:
            // 5 sources

            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl32
        v4 /* !! */  = nv.ud;
        if (true) ** GOTO lbl39
        block28: while (true) {
            v4 /* !! */  = (long)(v5 - nv.lkwr("lmxx", lkwv(int ), (int)575));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1420887166: {
                    v5 = nv.lkwr("lmxy", lkwv(int ), (int)576);
                    continue block28;
                }
                case 688127729: {
                    v5 = nv.lkwr("lmxz", lkwv(int ), (int)577);
                    continue block28;
                }
                case 1637199440: {
                    break block28;
                }
            }
            break;
        }
        if (nv.savedSlot == nv.lkwr("lmya", lkwo(int ), (int)805)) ** GOTO lbl73
        if (var0_2 || var0_2) ** GOTO lbl32
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lmyb", lkwv(int ), (int)578)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == nv.lkwr("lmyc", lkwo(int ), (int)806)) break;
            v6 /* !! */  = (long)nv.lkwr("lmyd", lkwo(int ), (int)807);
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("lmye", lkwv(int ), (int)579)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == nv.lkwr("lmyf", lkwo(int ), (int)808)) break;
            v7 /* !! */  = (long)nv.lkwr("lmyg", lkwo(int ), (int)809);
        }
        nv.selectSlotSilent(nv.savedSlot);
        if (var0_2 || var0_2) ** GOTO lbl32
        v8 = nv.lkwr("lmyh", lkwo(int ), (int)810);
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("lmyi", lkwv(int ), (int)580)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == nv.lkwr("lmyj", lkwo(int ), (int)811)) break;
            v9 /* !! */  = (long)nv.lkwr("lmyk", lkwo(int ), (int)812);
        }
        nv.savedSlot = (int)v8;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl32
lbl73:
                // 2 sources

                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
lbl76:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)nv.lkwr("lmyl", lkwo(int ), (int)813);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl119
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)nv.lkwr("lmym", lkwo(int ), (int)814);
                } while (!var2);
                throw null;
            }
lbl86:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)nv.lkwr("lmyn", lkwo(int ), (int)815);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl107
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)nv.lkwr("lmyo", lkwo(int ), (int)816);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl102
                    break;
                }
            }
            case 4: {
                var1_1 /* !! */  = (int)nv.lkwr("lmyp", lkwo(int ), (int)817);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl119
            }
lbl102:
            // 3 sources

            case 5: {
                var1_1 /* !! */  = (int)nv.lkwr("lmyq", lkwo(int ), (int)818);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl119
            }
lbl107:
            // 2 sources

            case 6: {
                var1_1 /* !! */  = (int)nv.lkwr("lmyr", lkwo(int ), (int)819);
                if (!var2) ** GOTO lbl86
                throw null;
            }
lbl111:
            // 2 sources

            case 7: {
                var1_1 /* !! */  = (int)nv.lkwr("lmys", lkwo(int ), (int)820);
                if (!var2) ** GOTO lbl76
                throw null;
            }
            case 8: {
                var1_1 /* !! */  = (int)nv.lkwr("lmyt", lkwo(int ), (int)821);
                if (!var2) ** GOTO lbl111
                throw null;
            }
lbl119:
            // 4 sources

            case 9: {
                var1_1 /* !! */  = (int)nv.lkwr("lmyu", lkwo(int ), (int)822);
                if (!var2) ** GOTO lbl102
                throw null;
            }
            case 10: 
        }
        var1_1 /* !! */  = (int)nv.lkwr("lmyv", lkwo(int ), (int)823);
        ** while (!var2)
lbl126:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void loiv() {
        nv.lkwq[100] = -2145825520;
        nv.lkwq[101] = 1034646222;
        nv.lkwq[102] = 331620914;
        nv.lkwq[103] = 164471276;
        nv.lkwq[104] = -268067196;
        nv.lkwq[105] = 856952819;
        nv.lkwq[106] = -82208247;
        nv.lkwq[107] = -2108049984;
        nv.lkwq[108] = -110389490;
        nv.lkwq[109] = -1113861573;
        nv.lkwq[110] = -981327821;
        nv.lkwq[111] = -1423306470;
        nv.lkwq[112] = 1845860467;
        nv.lkwq[113] = 1034619491;
        nv.lkwq[114] = 1559049269;
        nv.lkwq[115] = 558536980;
        nv.lkwq[116] = 388130301;
        nv.lkwq[117] = 1249939925;
        nv.lkwq[118] = -1344860558;
        nv.lkwq[119] = -761543536;
        nv.lkwq[120] = 27399418;
        nv.lkwq[121] = -825379812;
        nv.lkwq[122] = 1891761567;
        nv.lkwq[123] = 576669024;
        nv.lkwq[124] = -1972487411;
        nv.lkwq[125] = -255732029;
        nv.lkwq[126] = 1519109717;
        nv.lkwq[127] = 1087251540;
        nv.lkwq[128] = 1612073798;
        nv.lkwq[129] = 712049872;
        nv.lkwq[130] = -87787557;
        nv.lkwq[131] = 421623232;
        nv.lkwq[132] = -1511904656;
        nv.lkwq[133] = 1831450106;
        nv.lkwq[134] = -414751748;
        nv.lkwq[135] = -1343728569;
        nv.lkwq[136] = 1134809681;
        nv.lkwq[137] = 2142087570;
        nv.lkwq[138] = -649250372;
        nv.lkwq[139] = -1907046331;
        nv.lkwq[140] = -413873541;
        nv.lkwq[141] = 129197769;
        nv.lkwq[142] = -641083949;
        nv.lkwq[143] = -1301954251;
        nv.lkwq[144] = -1657458717;
        nv.lkwq[145] = -2074382662;
        nv.lkwq[146] = -1007540647;
        nv.lkwq[147] = 1852621138;
        nv.lkwq[148] = -2028265037;
        nv.lkwq[149] = -499643731;
        nv.lkwq[150] = -986487819;
        nv.lkwq[151] = 29525994;
        nv.lkwq[152] = -1430927120;
        nv.lkwq[153] = 39902038;
        nv.lkwq[154] = -1330483845;
        nv.lkwq[155] = 174798815;
        nv.lkwq[156] = 421053390;
        nv.lkwq[157] = 1725093406;
        nv.lkwq[158] = -1249320969;
        nv.lkwq[159] = 2120225449;
        nv.lkwq[160] = 995571892;
        nv.lkwq[161] = -561678428;
        nv.lkwq[162] = 1625957940;
        nv.lkwq[163] = -523410410;
        nv.lkwq[164] = -791505207;
        nv.lkwq[165] = -378531797;
        nv.lkwq[166] = -680022168;
        nv.lkwq[167] = -997154348;
        nv.lkwq[168] = -1985817708;
        nv.lkwq[169] = 1867847557;
        nv.lkwq[170] = -1079367453;
        nv.lkwq[171] = -287527083;
        nv.lkwq[172] = -1862694668;
        nv.lkwq[173] = 1450315930;
        nv.lkwq[174] = -1159850856;
        nv.lkwq[175] = -1934017359;
        nv.lkwq[176] = 974078359;
        nv.lkwq[177] = -93217420;
        nv.lkwq[178] = -1054341198;
        nv.lkwq[179] = 528783375;
        nv.lkwq[180] = -1317687877;
        nv.lkwq[181] = -1708635734;
        nv.lkwq[182] = 332299344;
        nv.lkwq[183] = 400644760;
        nv.lkwq[184] = 979327217;
        nv.lkwq[185] = -1567076540;
        nv.lkwq[186] = -1826123805;
        nv.lkwq[187] = -184491031;
        nv.lkwq[188] = -296203233;
        nv.lkwq[189] = 249694975;
        nv.lkwq[190] = -1287809702;
        nv.lkwq[191] = 1371607457;
        nv.lkwq[192] = -1256800312;
        nv.lkwq[193] = -1422843763;
        nv.lkwq[194] = -1899813615;
        nv.lkwq[195] = 804190387;
        nv.lkwq[196] = -800641698;
        nv.lkwq[197] = -367753376;
        nv.lkwq[198] = 326983160;
        nv.lkwq[199] = -45446017;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_1735 findSlot(Predicate<class_1735> var0) {
        v0 /* !! */  = nv.ud;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(nv.lkwr("lmbq", lkwv(int ), (int)294) - nv.lkwr("lmbp", lkwv(int ), (int)293));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1508836201: {
                    continue block10;
                }
                case 1637199440: {
                    break block10;
                }
            }
            break;
        }
        var3_1 = nv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lmbr", lkwv(int ), (int)295)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nv.lkwr("lmbs", lkwo(int ), (int)507)) break;
            v1 /* !! */  = (long)nv.lkwr("lmbt", lkwo(int ), (int)508);
        }
        var2_2 /* !! */  = nv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lmbu", lkwv(int ), (int)296)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nv.lkwr("lmbv", lkwo(int ), (int)509)) break;
            v2 /* !! */  = (long)nv.lkwr("lmbw", lkwo(int ), (int)510);
        }
        var1_3 = nv.a;
        if (var3_1) {
            throw null;
lbl27:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl30:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lmbx", lkwv(int ), (int)297)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == nv.lkwr("lmby", lkwo(int ), (int)511)) break;
                    v3 /* !! */  = (long)nv.lkwr("lmbz", lkwo(int ), (int)512);
                }
                return nv.findSlot(var0, null);
            }
            case 0: {
                var2_2 /* !! */  = (int)nv.lkwr("lmca", lkwo(int ), (int)513);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)nv.lkwr("lmcb", lkwo(int ), (int)514);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)nv.lkwr("lmcc", lkwo(int ), (int)515);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)nv.lkwr("lmcd", lkwo(int ), (int)516);
        ** while (!var3_1)
lbl56:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lojy() {
        nv.lkwx[600] = -8110002482488503712L;
        nv.lkwx[601] = 6406104066892812451L;
        nv.lkwx[602] = 5786938158819003028L;
        nv.lkwx[603] = -1635317422275266549L;
        nv.lkwx[604] = -7518265345542030629L;
        nv.lkwx[605] = -3215886901656382063L;
        nv.lkwx[606] = -7342383514299477485L;
        nv.lkwx[607] = 6370402002287235664L;
        nv.lkwx[608] = 6682240132336870162L;
        nv.lkwx[609] = 504894194074419091L;
        nv.lkwx[610] = 197895575621986954L;
        nv.lkwx[611] = -5926561703917413604L;
        nv.lkwx[612] = 4707435735525069762L;
        nv.lkwx[613] = -1394524298458545172L;
        nv.lkwx[614] = 8775216938272027434L;
        nv.lkwx[615] = 321730305075625680L;
        nv.lkwx[616] = 151660462105855182L;
        nv.lkwx[617] = -9165042200384973566L;
        nv.lkwx[618] = 1542635861913686532L;
        nv.lkwx[619] = 1218350776198204762L;
        nv.lkwx[620] = 7573518139561565524L;
        nv.lkwx[621] = -7289840643621079663L;
        nv.lkwx[622] = 4155025057411715795L;
        nv.lkwx[623] = 540805648202921414L;
        nv.lkwx[624] = -8100399456146716812L;
        nv.lkwx[625] = 3264587457952656119L;
        nv.lkwx[626] = 7361887587301949235L;
        nv.lkwx[627] = 2118051853062311493L;
        nv.lkwx[628] = -1993157637207921936L;
        nv.lkwx[629] = 96441797932505488L;
        nv.lkwx[630] = 3930619812130646621L;
        nv.lkwx[631] = 7375254089015545219L;
        nv.lkwx[632] = -1517487757039122101L;
        nv.lkwx[633] = 4344827576760072379L;
        nv.lkwx[634] = -4086728258524162938L;
        nv.lkwx[635] = -5663213301021243381L;
        nv.lkwx[636] = 770461199601812793L;
        nv.lkwx[637] = -1559378676682353054L;
        nv.lkwx[638] = 4601655165223213120L;
        nv.lkwx[639] = -3862690649395625032L;
        nv.lkwx[640] = 2843175107038039586L;
        nv.lkwx[641] = -3162148917892991426L;
        nv.lkwx[642] = 6878285990758398275L;
        nv.lkwx[643] = 7705995246636904971L;
        nv.lkwx[644] = 7810012100514010853L;
        nv.lkwx[645] = 5835607702390611302L;
        nv.lkwx[646] = 8516981279430200013L;
        nv.lkwx[647] = 494368643630555740L;
        nv.lkwx[648] = -3057974039199314736L;
        nv.lkwx[649] = -3099032381235790999L;
        nv.lkwx[650] = -3619737203892006883L;
        nv.lkwx[651] = 916601428288013808L;
        nv.lkwx[652] = 6561039155535628410L;
        nv.lkwx[653] = -5218713110438564831L;
        nv.lkwx[654] = -1732840242075438623L;
        nv.lkwx[655] = -8580965025793083727L;
        nv.lkwx[656] = -1102582200805158076L;
        nv.lkwx[657] = -8613208665148647670L;
        nv.lkwx[658] = 3436704452548848090L;
        nv.lkwx[659] = 8328545615895909365L;
        nv.lkwx[660] = -7423586736804369473L;
        nv.lkwx[661] = -9048903599998427112L;
        nv.lkwx[662] = 469362320558041918L;
        nv.lkwx[663] = -6614108762334737014L;
        nv.lkwx[664] = 3245349291570613621L;
        nv.lkwx[665] = -2407783906603058032L;
        nv.lkwx[666] = -194364577402950315L;
        nv.lkwx[667] = 2442164474762488826L;
        nv.lkwx[668] = 2174192777496898509L;
        nv.lkwx[669] = 2138511529066452514L;
        nv.lkwx[670] = -8560601279790398748L;
        nv.lkwx[671] = -6207382164862750131L;
        nv.lkwx[672] = -7123713167812035523L;
        nv.lkwx[673] = -7036922173687175616L;
        nv.lkwx[674] = 286584117831951795L;
        nv.lkwx[675] = 4448002961363114545L;
        nv.lkwx[676] = 385825905516153671L;
        nv.lkwx[677] = 7464511759839756284L;
        nv.lkwx[678] = -1592824810781073344L;
        nv.lkwx[679] = 6029790689055407758L;
        nv.lkwx[680] = -1246916346088530280L;
        nv.lkwx[681] = -2439594114696593714L;
        nv.lkwx[682] = -8907576588182676497L;
        nv.lkwx[683] = -8603014600827059142L;
        nv.lkwx[684] = 5921713523908408383L;
        nv.lkwx[685] = -7116035449063061127L;
        nv.lkwx[686] = 2266844216467744773L;
        nv.lkwx[687] = 4502160463107712493L;
        nv.lkwx[688] = -7241491535109954083L;
        nv.lkwx[689] = -7228581403309632440L;
        nv.lkwx[690] = -4581430169588153032L;
        nv.lkwx[691] = 3964120970961587813L;
        nv.lkwx[692] = -4593634501836654516L;
        nv.lkwx[693] = -6014000704318434731L;
        nv.lkwx[694] = 1057244356396837195L;
        nv.lkwx[695] = -713482748230540105L;
        nv.lkwx[696] = -4027018510335232297L;
        nv.lkwx[697] = -1866505684266638261L;
        nv.lkwx[698] = 7040221658785465268L;
        nv.lkwx[699] = -2894164257756953911L;
    }

    private static /* synthetic */ void loio() {
        nv.lkwp[700] = 1238273107;
        nv.lkwp[701] = -1206210531;
        nv.lkwp[702] = 143693626;
        nv.lkwp[703] = 75005162;
        nv.lkwp[704] = 1643498863;
        nv.lkwp[705] = -1798974007;
        nv.lkwp[706] = -1353622857;
        nv.lkwp[707] = 891009491;
        nv.lkwp[708] = -1113078328;
        nv.lkwp[709] = -2022776462;
        nv.lkwp[710] = 720221730;
        nv.lkwp[711] = -1513077525;
        nv.lkwp[712] = -1032886551;
        nv.lkwp[713] = -500883196;
        nv.lkwp[714] = -556341713;
        nv.lkwp[715] = 2036244997;
        nv.lkwp[716] = 464537443;
        nv.lkwp[717] = 1198649245;
        nv.lkwp[718] = -479434192;
        nv.lkwp[719] = -1353495031;
        nv.lkwp[720] = 1094316660;
        nv.lkwp[721] = 1052397515;
        nv.lkwp[722] = 1356162304;
        nv.lkwp[723] = -995574874;
        nv.lkwp[724] = -398403257;
        nv.lkwp[725] = 1540860686;
        nv.lkwp[726] = -1392296787;
        nv.lkwp[727] = -79046625;
        nv.lkwp[728] = -678138073;
        nv.lkwp[729] = 732614003;
        nv.lkwp[730] = -998454756;
        nv.lkwp[731] = -1630656585;
        nv.lkwp[732] = 1132314632;
        nv.lkwp[733] = -2072063154;
        nv.lkwp[734] = 2091498199;
        nv.lkwp[735] = -1851144102;
        nv.lkwp[736] = -823872437;
        nv.lkwp[737] = 1850978221;
        nv.lkwp[738] = -1232854702;
        nv.lkwp[739] = 295067548;
        nv.lkwp[740] = 2111532575;
        nv.lkwp[741] = -1122353950;
        nv.lkwp[742] = 837261057;
        nv.lkwp[743] = 2136645828;
        nv.lkwp[744] = -1540832106;
        nv.lkwp[745] = 1833455027;
        nv.lkwp[746] = 2067877763;
        nv.lkwp[747] = -2043047132;
        nv.lkwp[748] = -588882691;
        nv.lkwp[749] = 1392817391;
        nv.lkwp[750] = 800301680;
        nv.lkwp[751] = 2083679802;
        nv.lkwp[752] = -1513663718;
        nv.lkwp[753] = -517770847;
        nv.lkwp[754] = 37251056;
        nv.lkwp[755] = -97639296;
        nv.lkwp[756] = -1193553002;
        nv.lkwp[757] = -1369687209;
        nv.lkwp[758] = -208549494;
        nv.lkwp[759] = -496856828;
        nv.lkwp[760] = -330614785;
        nv.lkwp[761] = -2110425485;
        nv.lkwp[762] = 1279068267;
        nv.lkwp[763] = -1960701473;
        nv.lkwp[764] = 1049968025;
        nv.lkwp[765] = 1454044720;
        nv.lkwp[766] = 0x6FFF06F6;
        nv.lkwp[767] = -1669408508;
        nv.lkwp[768] = -805687986;
        nv.lkwp[769] = 460015202;
        nv.lkwp[770] = 252605585;
        nv.lkwp[771] = 1946386892;
        nv.lkwp[772] = 1677586602;
        nv.lkwp[773] = -287662247;
        nv.lkwp[774] = -360106737;
        nv.lkwp[775] = -443935831;
        nv.lkwp[776] = -230198510;
        nv.lkwp[777] = -2135486384;
        nv.lkwp[778] = -689786761;
        nv.lkwp[779] = 520286131;
        nv.lkwp[780] = -2064159442;
        nv.lkwp[781] = 936299424;
        nv.lkwp[782] = 189437939;
        nv.lkwp[783] = -1160293584;
        nv.lkwp[784] = 244999428;
        nv.lkwp[785] = -1321559704;
        nv.lkwp[786] = -1068860717;
        nv.lkwp[787] = -822435303;
        nv.lkwp[788] = 1538606992;
        nv.lkwp[789] = -591225872;
        nv.lkwp[790] = -1790445111;
        nv.lkwp[791] = 1646684190;
        nv.lkwp[792] = 762788862;
        nv.lkwp[793] = -1226240351;
        nv.lkwp[794] = -2062476768;
        nv.lkwp[795] = 1427821994;
        nv.lkwp[796] = 1598041402;
        nv.lkwp[797] = -983574033;
        nv.lkwp[798] = 664315767;
        nv.lkwp[799] = 2034419154;
    }

    private static /* synthetic */ void lojz() {
        nv.lkwx[700] = -7765708776807647505L;
        nv.lkwx[701] = -9209083236918412328L;
        nv.lkwx[702] = 1499540359805677972L;
        nv.lkwx[703] = -4416688514266107148L;
        nv.lkwx[704] = 3571898329397913964L;
        nv.lkwx[705] = 48744113877726373L;
        nv.lkwx[706] = 445332521618880931L;
        nv.lkwx[707] = -3838356673355366017L;
        nv.lkwx[708] = 332010664068086263L;
        nv.lkwx[709] = 1288478595127060511L;
        nv.lkwx[710] = -47945687859810894L;
        nv.lkwx[711] = -3584179574970934765L;
        nv.lkwx[712] = -3102214199100137966L;
        nv.lkwx[713] = 3999716256804950519L;
        nv.lkwx[714] = 579810854612240374L;
        nv.lkwx[715] = 5564120989783859258L;
        nv.lkwx[716] = 7811857714999717407L;
        nv.lkwx[717] = 3103658556328678611L;
        nv.lkwx[718] = 2632860649224243770L;
        nv.lkwx[719] = -7624959975157144558L;
        nv.lkwx[720] = -194086374501919913L;
        nv.lkwx[721] = 4586036978429555177L;
        nv.lkwx[722] = 3717099392844900750L;
        nv.lkwx[723] = -25027229799397781L;
        nv.lkwx[724] = 319822689832266910L;
        nv.lkwx[725] = -8334912527536053651L;
        nv.lkwx[726] = 7191843111090330353L;
        nv.lkwx[727] = 4631842426593230540L;
        nv.lkwx[728] = -587817190555439317L;
        nv.lkwx[729] = -1403726548698356862L;
        nv.lkwx[730] = 4342676770793459356L;
        nv.lkwx[731] = 2224058478687621625L;
        nv.lkwx[732] = 2856658281918819502L;
        nv.lkwx[733] = 2456848587228082783L;
        nv.lkwx[734] = -8704627329030353470L;
        nv.lkwx[735] = 4001584529402236591L;
        nv.lkwx[736] = -9194631018229396699L;
        nv.lkwx[737] = -4316817841943156017L;
        nv.lkwx[738] = 684227747916518256L;
        nv.lkwx[739] = 3549649784566811222L;
        nv.lkwx[740] = 960747789810024618L;
        nv.lkwx[741] = 5543355961788115190L;
        nv.lkwx[742] = -5868135975950566192L;
        nv.lkwx[743] = 2106986110155207903L;
        nv.lkwx[744] = 6863059174701396384L;
        nv.lkwx[745] = -8216151680398882257L;
        nv.lkwx[746] = -2834052698641004875L;
        nv.lkwx[747] = 9007563242548650105L;
        nv.lkwx[748] = 8628413735599118429L;
        nv.lkwx[749] = 4274649366337782582L;
        nv.lkwx[750] = 4201133155985799311L;
        nv.lkwx[751] = 2928718651079566899L;
        nv.lkwx[752] = 7333902427112409739L;
        nv.lkwx[753] = 4325739427837307427L;
        nv.lkwx[754] = -6740796159503482127L;
        nv.lkwx[755] = -4501697324979474968L;
        nv.lkwx[756] = -7010987852646683110L;
        nv.lkwx[757] = -304210000860378798L;
        nv.lkwx[758] = 331224352426695083L;
        nv.lkwx[759] = -5250769967302592750L;
        nv.lkwx[760] = -1606089085571264189L;
        nv.lkwx[761] = -1370174700916766358L;
        nv.lkwx[762] = 8554645236407037230L;
        nv.lkwx[763] = 4384088696634299371L;
        nv.lkwx[764] = -308326566389286030L;
        nv.lkwx[765] = -12324629934042669L;
        nv.lkwx[766] = -5683348299751868762L;
        nv.lkwx[767] = -7888841805984331686L;
        nv.lkwx[768] = 7690614539155455790L;
        nv.lkwx[769] = -3998843324660577772L;
        nv.lkwx[770] = -1150977414845607199L;
        nv.lkwx[771] = -7902159648830431459L;
        nv.lkwx[772] = -8113633332686615247L;
        nv.lkwx[773] = 6846812674795039770L;
        nv.lkwx[774] = -5816830330754000288L;
        nv.lkwx[775] = 1975319996535054339L;
        nv.lkwx[776] = -5687042115506816626L;
        nv.lkwx[777] = 1044623424899127578L;
        nv.lkwx[778] = 4127020876464839570L;
        nv.lkwx[779] = 4679383427904496145L;
        nv.lkwx[780] = -1338658145154886553L;
        nv.lkwx[781] = 2212915707294132970L;
        nv.lkwx[782] = -323954678515509758L;
        nv.lkwx[783] = 968197567815419724L;
        nv.lkwx[784] = -1099669309411968006L;
        nv.lkwx[785] = 2178524418433977126L;
        nv.lkwx[786] = 6755001258068047864L;
        nv.lkwx[787] = -8762975985101517873L;
        nv.lkwx[788] = -4356841336787120305L;
        nv.lkwx[789] = -2028888041977503165L;
        nv.lkwx[790] = -2125942469724429874L;
        nv.lkwx[791] = 269052474838833114L;
        nv.lkwx[792] = 8517471507875687654L;
        nv.lkwx[793] = -8026328537933357668L;
        nv.lkwx[794] = -6119698602499156011L;
        nv.lkwx[795] = -1983393212612878841L;
        nv.lkwx[796] = -59010542341178440L;
        nv.lkwx[797] = -1097466373381241520L;
        nv.lkwx[798] = 8716293985673740509L;
        nv.lkwx[799] = -928515698205050410L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void swap(int var0, int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lmgh", lkwv(int ), (int)353)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nv.lkwr("lmgi", lkwo(int ), (int)569)) break;
            v0 /* !! */  = (long)nv.lkwr("lmgj", lkwo(int ), (int)570);
        }
        var4_2 = nv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lmgk", lkwv(int ), (int)354)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nv.lkwr("lmgl", lkwo(int ), (int)571)) break;
            v1 /* !! */  = (long)nv.lkwr("lmgm", lkwo(int ), (int)572);
        }
        var3_3 /* !! */  = nv.b;
        v2 /* !! */  = nv.ud;
        if (true) ** GOTO lbl17
        block26: while (true) {
            v2 /* !! */  = (long)(v3 - nv.lkwr("lmgn", lkwv(int ), (int)355));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -749914333: {
                    v3 = nv.lkwr("lmgo", lkwv(int ), (int)356);
                    continue block26;
                }
                case 1039827238: {
                    v3 = nv.lkwr("lmgp", lkwv(int ), (int)357);
                    continue block26;
                }
                case 1637199440: {
                    break block26;
                }
                case 1657788025: {
                    v3 = nv.lkwr("lmgq", lkwv(int ), (int)358);
                    continue block26;
                }
            }
            break;
        }
        var2_4 = nv.a;
        if (var4_2) {
            throw null;
lbl32:
            // 4 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl32
        v4 = nv.lkwr("lmgr", lkwo(int ), (int)573);
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lmgs", lkwv(int ), (int)359)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == nv.lkwr("lmgt", lkwo(int ), (int)574)) break;
            v5 /* !! */  = (long)nv.lkwr("lmgu", lkwo(int ), (int)575);
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("lmgv", lkwv(int ), (int)360)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == nv.lkwr("lmgw", lkwo(int ), (int)576)) break;
            v6 /* !! */  = (long)nv.lkwr("lmgx", lkwo(int ), (int)577);
        }
        nv.click(var0, (int)v4, class_1713.field_7790);
        if (var2_4 || var2_4) ** GOTO lbl32
        v7 = nv.lkwr("lmgy", lkwo(int ), (int)578);
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("lmgz", lkwv(int ), (int)361)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == nv.lkwr("lmha", lkwo(int ), (int)579)) break;
            v8 /* !! */  = (long)nv.lkwr("lmhb", lkwo(int ), (int)580);
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_5 = nv.ud - nv.lkwr("lmhc", lkwv(int ), (int)362)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == nv.lkwr("lmhd", lkwo(int ), (int)581)) break;
            v9 /* !! */  = (long)nv.lkwr("lmhe", lkwo(int ), (int)582);
        }
        nv.click(var1_1, (int)v7, class_1713.field_7790);
        if (var2_4 || var2_4) ** GOTO lbl32
        v10 = nv.lkwr("lmhf", lkwo(int ), (int)583);
        v11 /* !! */  = nv.ud;
        if (true) ** GOTO lbl66
        block32: while (true) {
            v11 /* !! */  = (long)(v12 - nv.lkwr("lmhg", lkwv(int ), (int)363));
lbl66:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1267249506: {
                    v12 = nv.lkwr("lmhh", lkwv(int ), (int)364);
                    continue block32;
                }
                case 151314605: {
                    v12 = nv.lkwr("lmhi", lkwv(int ), (int)365);
                    continue block32;
                }
                case 1637199440: {
                    break block32;
                }
                case 1924717003: {
                    v12 = nv.lkwr("lmhj", lkwv(int ), (int)366);
                    continue block32;
                }
            }
            break;
        }
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_6 = nv.ud - nv.lkwr("lmhk", lkwv(int ), (int)367)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == nv.lkwr("lmhl", lkwo(int ), (int)584)) break;
            v13 /* !! */  = (long)nv.lkwr("lmhm", lkwo(int ), (int)585);
        }
        nv.click(var0, (int)v10, class_1713.field_7790);
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block12 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)nv.lkwr("lmhn", lkwo(int ), (int)586);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl126
            }
lbl94:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)nv.lkwr("lmho", lkwo(int ), (int)587);
                    if (!var4_2) break block12;
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)nv.lkwr("lmhp", lkwo(int ), (int)588);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl126
            }
            case 3: {
                var3_3 /* !! */  = (int)nv.lkwr("lmhq", lkwo(int ), (int)589);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl113
            }
            case 4: {
                var3_3 /* !! */  = (int)nv.lkwr("lmhr", lkwo(int ), (int)590);
                if (var4_2) {
                    throw null;
                }
            }
lbl113:
            // 5 sources

            case 5: {
                do {
                    var3_3 /* !! */  = (int)nv.lkwr("lmhs", lkwo(int ), (int)591);
                } while (!var4_2);
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)nv.lkwr("lmht", lkwo(int ), (int)592);
                if (!var4_2) ** GOTO lbl113
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)nv.lkwr("lmhu", lkwo(int ), (int)593);
                if (!var4_2) ** GOTO lbl94
                throw null;
            }
lbl126:
            // 3 sources

            case 8: {
                do {
                    var3_3 /* !! */  = (int)nv.lkwr("lmhv", lkwo(int ), (int)594);
                } while (!var4_2);
                throw null;
            }
            case 9: 
        }
        var3_3 /* !! */  = (int)nv.lkwr("lmhw", lkwo(int ), (int)595);
        ** while (!var4_2)
lbl134:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void swapHotbar(int var0, int var1_1) {
        v0 /* !! */  = nv.ud;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - nv.lkwr("lmhx", lkwv(int ), (int)368));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -458440634: {
                    v1 = nv.lkwr("lmhy", lkwv(int ), (int)369);
                    continue block24;
                }
                case 1591463553: {
                    v1 = nv.lkwr("lmhz", lkwv(int ), (int)370);
                    continue block24;
                }
                case 1637199440: {
                    break block24;
                }
                case 1741244323: {
                    v1 = nv.lkwr("lmia", lkwv(int ), (int)371);
                    continue block24;
                }
            }
            break;
        }
        var4_2 = nv.c;
        v2 /* !! */  = nv.ud;
        if (true) ** GOTO lbl22
        block25: while (true) {
            v2 /* !! */  = (long)(v3 - nv.lkwr("lmib", lkwv(int ), (int)372));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -369085205: {
                    v3 = nv.lkwr("lmic", lkwv(int ), (int)373);
                    continue block25;
                }
                case 1169959050: {
                    v3 = nv.lkwr("lmid", lkwv(int ), (int)374);
                    continue block25;
                }
                case 1515733871: {
                    v3 = nv.lkwr("lmie", lkwv(int ), (int)375);
                    continue block25;
                }
                case 1637199440: {
                    break block25;
                }
            }
            break;
        }
        var3_3 /* !! */  = nv.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lmif", lkwv(int ), (int)376)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == nv.lkwr("lmig", lkwo(int ), (int)596)) break;
            v4 /* !! */  = (long)nv.lkwr("lmih", lkwo(int ), (int)597);
        }
        var2_4 = nv.a;
        if (var4_2) {
            throw null;
lbl43:
            // 3 sources

            return;
        }
        if (var2_4) ** GOTO lbl43
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block12 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl43
                v5 /* !! */  = nv.ud;
                if (true) ** GOTO lbl54
                block28: while (true) {
                    v5 /* !! */  = (long)(nv.lkwr("lmij", lkwv(int ), (int)378) - nv.lkwr("lmii", lkwv(int ), (int)377));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 897640528: {
                            continue block28;
                        }
                        case 1637199440: {
                            break block28;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lmik", lkwv(int ), (int)379)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == nv.lkwr("lmil", lkwo(int ), (int)598)) break;
                    v6 /* !! */  = (long)nv.lkwr("lmim", lkwo(int ), (int)599);
                }
                nv.click(var0, var1_1, class_1713.field_7791);
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)nv.lkwr("lmin", lkwo(int ), (int)600);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)nv.lkwr("lmio", lkwo(int ), (int)601);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl86
            }
            case 2: {
                var3_3 /* !! */  = (int)nv.lkwr("lmip", lkwo(int ), (int)602);
                if (var4_2) {
                    throw null;
                }
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)nv.lkwr("lmiq", lkwo(int ), (int)603);
                    if (!var4_2) break block12;
                    throw null;
                }
            }
lbl86:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)nv.lkwr("lmir", lkwo(int ), (int)604);
                if (!var4_2) break;
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)nv.lkwr("lmis", lkwo(int ), (int)605);
        ** while (!var4_2)
lbl93:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void loip() {
        nv.lkwp[800] = 1932097829;
        nv.lkwp[801] = -460384519;
        nv.lkwp[802] = -292080817;
        nv.lkwp[803] = -128275900;
        nv.lkwp[804] = -944022669;
        nv.lkwp[805] = -1138737576;
        nv.lkwp[806] = 1597534706;
        nv.lkwp[807] = 1094972791;
        nv.lkwp[808] = 562240443;
        nv.lkwp[809] = 1467746520;
        nv.lkwp[810] = 1637095250;
        nv.lkwp[811] = 1021394885;
        nv.lkwp[812] = -1704149612;
        nv.lkwp[813] = -473298797;
        nv.lkwp[814] = -583482275;
        nv.lkwp[815] = -1870523314;
        nv.lkwp[816] = 423118966;
        nv.lkwp[817] = -705353187;
        nv.lkwp[818] = 642516942;
        nv.lkwp[819] = -1025925621;
        nv.lkwp[820] = 1787952560;
        nv.lkwp[821] = 1355128964;
        nv.lkwp[822] = -1076975692;
        nv.lkwp[823] = -410633203;
        nv.lkwp[824] = 1090209813;
        nv.lkwp[825] = 2116794288;
        nv.lkwp[826] = -1149026809;
        nv.lkwp[827] = -1723844568;
        nv.lkwp[828] = 1889857540;
        nv.lkwp[829] = -2061821498;
        nv.lkwp[830] = 1702021934;
        nv.lkwp[831] = 380579390;
        nv.lkwp[832] = 1354090294;
        nv.lkwp[833] = -1320444672;
        nv.lkwp[834] = 562974840;
        nv.lkwp[835] = -124843930;
        nv.lkwp[836] = 111293871;
        nv.lkwp[837] = -1525151436;
        nv.lkwp[838] = -477421134;
        nv.lkwp[839] = 157582023;
        nv.lkwp[840] = 1891252089;
        nv.lkwp[841] = 926354171;
        nv.lkwp[842] = 116150274;
        nv.lkwp[843] = 298259680;
        nv.lkwp[844] = 632518962;
        nv.lkwp[845] = 1773708822;
        nv.lkwp[846] = 1394381416;
        nv.lkwp[847] = -1844837822;
        nv.lkwp[848] = 763399182;
        nv.lkwp[849] = -650898852;
        nv.lkwp[850] = 809218610;
        nv.lkwp[851] = 128546767;
        nv.lkwp[852] = -1439577441;
        nv.lkwp[853] = 1411911495;
        nv.lkwp[854] = 1392340983;
        nv.lkwp[855] = 926517778;
        nv.lkwp[856] = 644489868;
        nv.lkwp[857] = -1869116573;
        nv.lkwp[858] = 401745696;
        nv.lkwp[859] = 1150304384;
        nv.lkwp[860] = 838536831;
        nv.lkwp[861] = -2060099106;
        nv.lkwp[862] = -152624892;
        nv.lkwp[863] = -728847618;
        nv.lkwp[864] = 478134825;
        nv.lkwp[865] = -69965561;
        nv.lkwp[866] = 378472036;
        nv.lkwp[867] = -1727188796;
        nv.lkwp[868] = 1972753970;
        nv.lkwp[869] = -715762629;
        nv.lkwp[870] = -1557912299;
        nv.lkwp[871] = 1360214174;
        nv.lkwp[872] = -1610211227;
        nv.lkwp[873] = 1654214018;
        nv.lkwp[874] = -1706139695;
        nv.lkwp[875] = -429554990;
        nv.lkwp[876] = 467986247;
        nv.lkwp[877] = 1584671891;
        nv.lkwp[878] = 12613529;
        nv.lkwp[879] = 1741869948;
        nv.lkwp[880] = -1902613592;
        nv.lkwp[881] = 453692204;
        nv.lkwp[882] = -995362728;
        nv.lkwp[883] = 1079558651;
        nv.lkwp[884] = -312060691;
        nv.lkwp[885] = -334784038;
        nv.lkwp[886] = -1198424105;
        nv.lkwp[887] = -1572431161;
        nv.lkwp[888] = 554171544;
        nv.lkwp[889] = -2125217887;
        nv.lkwp[890] = 17891152;
        nv.lkwp[891] = 176956854;
        nv.lkwp[892] = -1211345466;
        nv.lkwp[893] = -411403912;
        nv.lkwp[894] = -346108778;
        nv.lkwp[895] = 421545890;
        nv.lkwp[896] = 873580812;
        nv.lkwp[897] = 1216412907;
        nv.lkwp[898] = -1038943231;
        nv.lkwp[899] = 695446313;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean hasCursorStack() {
        v0 /* !! */  = nv.ud;
        if (true) ** GOTO lbl5
        block49: while (true) {
            v0 /* !! */  = (long)(nv.lkwr("llgh", lkwv(int ), (int)96) - nv.lkwr("llgg", lkwv(int ), (int)95));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -941967940: {
                    continue block49;
                }
                case 1637199440: {
                    break block49;
                }
            }
            break;
        }
        var2 = nv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("llgi", lkwv(int ), (int)97)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nv.lkwr("llgj", lkwo(int ), (int)150)) break;
            v1 /* !! */  = (long)nv.lkwr("llgk", lkwo(int ), (int)151);
        }
        var1_1 /* !! */  = nv.b;
        v2 /* !! */  = nv.ud;
        if (true) ** GOTO lbl21
        block51: while (true) {
            v2 /* !! */  = (long)(v3 - nv.lkwr("llgl", lkwv(int ), (int)98));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -553884533: {
                    v3 = nv.lkwr("llgm", lkwv(int ), (int)99);
                    continue block51;
                }
                case 1511293102: {
                    v3 = nv.lkwr("llgn", lkwv(int ), (int)100);
                    continue block51;
                }
                case 1637199440: {
                    break block51;
                }
            }
            break;
        }
        var0_2 = nv.a;
        if (var2) {
            throw null;
lbl33:
            // 6 sources

            return (boolean)nv.lkwr("llgo", lkwo(int ), (int)152);
        }
        if (var0_2) ** GOTO lbl33
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl33
                v4 /* !! */  = nv.ud;
                if (true) ** GOTO lbl44
                block53: while (true) {
                    v4 /* !! */  = (long)(nv.lkwr("llgq", lkwv(int ), (int)102) - nv.lkwr("llgp", lkwv(int ), (int)101));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2074213394: {
                            continue block53;
                        }
                        case 1637199440: {
                            break block53;
                        }
                    }
                    break;
                }
                v5 /* !! */  = nv.ud;
                if (true) ** GOTO lbl53
                block54: while (true) {
                    v5 /* !! */  = (long)(v6 - nv.lkwr("llgr", lkwv(int ), (int)103));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1884277446: {
                            v6 = nv.lkwr("llgs", lkwv(int ), (int)104);
                            continue block54;
                        }
                        case -1368520424: {
                            v6 = nv.lkwr("llgt", lkwv(int ), (int)105);
                            continue block54;
                        }
                        case 1637199440: {
                            break block54;
                        }
                    }
                    break;
                }
                if (nv.mc.field_1724 != null) ** GOTO lbl65
                if (var0_2 || var0_2) ** GOTO lbl33
                return (boolean)nv.lkwr("llgu", lkwo(int ), (int)153);
lbl65:
                // 1 sources

                if (var0_2 || var0_2) ** GOTO lbl33
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("llgv", lkwv(int ), (int)106)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == nv.lkwr("llgw", lkwo(int ), (int)154)) break;
                    v7 /* !! */  = (long)nv.lkwr("llgx", lkwo(int ), (int)155);
                }
                v8 /* !! */  = nv.ud;
                if (true) ** GOTO lbl75
                block56: while (true) {
                    v8 /* !! */  = (long)(v9 - nv.lkwr("llgy", lkwv(int ), (int)107));
lbl75:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1609127025: {
                            v9 = nv.lkwr("llgz", lkwv(int ), (int)108);
                            continue block56;
                        }
                        case -323962850: {
                            v9 = nv.lkwr("llha", lkwv(int ), (int)109);
                            continue block56;
                        }
                        case 1452395485: {
                            v9 = nv.lkwr("llhb", lkwv(int ), (int)110);
                            continue block56;
                        }
                        case 1637199440: {
                            break block56;
                        }
                    }
                    break;
                }
                v10 = nv.mc.field_1724;
                v11 /* !! */  = nv.ud;
                if (true) ** GOTO lbl92
                block57: while (true) {
                    v11 /* !! */  = (long)(v12 - nv.lkwr("llhc", lkwv(int ), (int)111));
lbl92:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 835259796: {
                            v12 = nv.lkwr("llhd", lkwv(int ), (int)112);
                            continue block57;
                        }
                        case 1637199440: {
                            break block57;
                        }
                        case 1870798562: {
                            v12 = nv.lkwr("llhe", lkwv(int ), (int)113);
                            continue block57;
                        }
                    }
                    break;
                }
                v13 = v10.field_7512;
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("llhf", lkwv(int ), (int)114)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == nv.lkwr("llhg", lkwo(int ), (int)156)) break;
                    v14 /* !! */  = (long)nv.lkwr("llhh", lkwo(int ), (int)157);
                }
                v15 = v13.method_34255();
                v16 /* !! */  = nv.ud;
                if (true) ** GOTO lbl112
                block59: while (true) {
                    v16 /* !! */  = (long)(v17 - nv.lkwr("llhi", lkwv(int ), (int)115));
lbl112:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1670659567: {
                            v17 = nv.lkwr("llhj", lkwv(int ), (int)116);
                            continue block59;
                        }
                        case -1048019085: {
                            v17 = nv.lkwr("llhk", lkwv(int ), (int)117);
                            continue block59;
                        }
                        case 1620308313: {
                            v17 = nv.lkwr("llhl", lkwv(int ), (int)118);
                            continue block59;
                        }
                        case 1637199440: {
                            break block59;
                        }
                    }
                    break;
                }
                if (v15.method_7960()) ** GOTO lbl130
                if (var0_2) ** GOTO lbl33
                v18 = nv.lkwr("llhm", lkwo(int ), (int)158);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl133
lbl130:
                // 1 sources

                if (!var0_2 && !var0_2) ** break;
                ** continue;
                v18 = nv.lkwr("llhn", lkwo(int ), (int)159);
lbl133:
                // 2 sources

                return (boolean)v18;
            }
lbl134:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)nv.lkwr("llho", lkwo(int ), (int)160);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl153
            }
            case 1: {
                var1_1 /* !! */  = (int)nv.lkwr("llhp", lkwo(int ), (int)161);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl144:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)nv.lkwr("llhq", lkwo(int ), (int)162);
                if (var2) {
                    throw null;
                }
            }
            case 3: {
                var1_1 /* !! */  = (int)nv.lkwr("llhr", lkwo(int ), (int)163);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl153:
            // 2 sources

            case 4: {
                var1_1 /* !! */  = (int)nv.lkwr("llhs", lkwo(int ), (int)164);
                if (var2) {
                    throw null;
                }
            }
            case 5: {
                var1_1 /* !! */  = (int)nv.lkwr("llht", lkwo(int ), (int)165);
                if (!var2) ** GOTO lbl144
                throw null;
            }
lbl161:
            // 2 sources

            case 6: {
                var1_1 /* !! */  = (int)nv.lkwr("llhu", lkwo(int ), (int)166);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl166:
            // 2 sources

            case 7: {
                var1_1 /* !! */  = (int)nv.lkwr("llhv", lkwo(int ), (int)167);
                if (!var2) ** GOTO lbl134
                throw null;
            }
lbl170:
            // 3 sources

            case 8: {
                var1_1 /* !! */  = (int)nv.lkwr("llhw", lkwo(int ), (int)168);
                if (!var2) ** GOTO lbl166
                throw null;
            }
lbl174:
            // 2 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)nv.lkwr("llhx", lkwo(int ), (int)169);
                    if (!var2) ** GOTO lbl161
                    throw null;
                }
            }
            case 10: {
                do {
                    var1_1 /* !! */  = (int)nv.lkwr("llhy", lkwo(int ), (int)170);
                } while (!var2);
                throw null;
            }
            case 11: 
        }
        var1_1 /* !! */  = (int)nv.lkwr("llhz", lkwo(int ), (int)171);
        ** while (!var2)
lbl187:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite lkwr(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void swapToOffhand(class_1735 var0) {
        v0 /* !! */  = nv.ud;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(nv.lkwr("lmjp", lkwv(int ), (int)389) - nv.lkwr("lmjo", lkwv(int ), (int)388));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1449020278: {
                    continue block20;
                }
                case 1637199440: {
                    break block20;
                }
            }
            break;
        }
        var3_1 = nv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lmjq", lkwv(int ), (int)390)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nv.lkwr("lmjr", lkwo(int ), (int)619)) break;
            v1 /* !! */  = (long)nv.lkwr("lmjs", lkwo(int ), (int)620);
        }
        var2_2 /* !! */  = nv.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = nv.ud;
                if (true) ** GOTO lbl24
                block22: while (true) {
                    v2 /* !! */  = (long)(v3 - nv.lkwr("lmjt", lkwv(int ), (int)391));
lbl24:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case 583989134: {
                            v3 = nv.lkwr("lmju", lkwv(int ), (int)392);
                            continue block22;
                        }
                        case 1163779472: {
                            v3 = nv.lkwr("lmjv", lkwv(int ), (int)393);
                            continue block22;
                        }
                        case 1637199440: {
                            break block22;
                        }
                    }
                    break;
                }
                var1_3 = nv.a;
                if (var3_1) {
                    throw null;
lbl36:
                    // 4 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl36
                if (var0 == null) ** GOTO lbl60
                if (var1_3 || var1_3) ** GOTO lbl36
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lmjw", lkwv(int ), (int)394)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == nv.lkwr("lmjx", lkwo(int ), (int)621)) break;
                    v4 /* !! */  = (long)nv.lkwr("lmjy", lkwo(int ), (int)622);
                }
                v5 = var0.field_7874;
                v6 = nv.lkwr("lmjz", lkwo(int ), (int)623);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lmka", lkwv(int ), (int)395)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == nv.lkwr("lmkb", lkwo(int ), (int)624)) break;
                    v7 /* !! */  = (long)nv.lkwr("lmkc", lkwo(int ), (int)625);
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("lmkd", lkwv(int ), (int)396)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == nv.lkwr("lmke", lkwo(int ), (int)626)) break;
                    v8 /* !! */  = (long)nv.lkwr("lmkf", lkwo(int ), (int)627);
                }
                nv.click(v5, (int)v6, class_1713.field_7791);
                if (var1_3) ** GOTO lbl36
lbl60:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)nv.lkwr("lmkg", lkwo(int ), (int)628);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)nv.lkwr("lmkh", lkwo(int ), (int)629);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl77
            }
lbl72:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)nv.lkwr("lmki", lkwo(int ), (int)630);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl91
            }
lbl77:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)nv.lkwr("lmkj", lkwo(int ), (int)631);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl87
            }
lbl82:
            // 3 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nv.lkwr("lmkk", lkwo(int ), (int)632);
                    if (!var3_1) ** GOTO lbl77
                    throw null;
                }
            }
lbl87:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)nv.lkwr("lmkl", lkwo(int ), (int)633);
                if (!var3_1) ** GOTO lbl72
                throw null;
            }
lbl91:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)nv.lkwr("lmkm", lkwo(int ), (int)634);
                if (!var3_1) ** GOTO lbl82
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)nv.lkwr("lmkn", lkwo(int ), (int)635);
                if (!var3_1) ** GOTO lbl82
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)nv.lkwr("lmko", lkwo(int ), (int)636);
        ** while (!var3_1)
lbl102:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lojo() {
        nv.lkww[700] = 6605610683836998736L;
        nv.lkww[701] = 3437252603254598775L;
        nv.lkww[702] = -6946625221631442714L;
        nv.lkww[703] = -1384239362624449669L;
        nv.lkww[704] = 674818698079672628L;
        nv.lkww[705] = -2613552166794454897L;
        nv.lkww[706] = 228327240236776440L;
        nv.lkww[707] = 6337740184454426449L;
        nv.lkww[708] = -5819983035934877533L;
        nv.lkww[709] = -775450252489799826L;
        nv.lkww[710] = -8133700990897632900L;
        nv.lkww[711] = 3447422780915051670L;
        nv.lkww[712] = -2912013710825774538L;
        nv.lkww[713] = 4007041414198546059L;
        nv.lkww[714] = 2040176335337649316L;
        nv.lkww[715] = -2466479611570607456L;
        nv.lkww[716] = 3219080402908692963L;
        nv.lkww[717] = -1518556243820284166L;
        nv.lkww[718] = -2002533825369930819L;
        nv.lkww[719] = -6404738237947359757L;
        nv.lkww[720] = -3051481130761932577L;
        nv.lkww[721] = 4331505275411979922L;
        nv.lkww[722] = -144445944446718909L;
        nv.lkww[723] = -7875085897172785094L;
        nv.lkww[724] = -1528279884628914481L;
        nv.lkww[725] = 9180353893670509576L;
        nv.lkww[726] = 4041905748149644886L;
        nv.lkww[727] = -2381873997594520682L;
        nv.lkww[728] = -4328532763042300304L;
        nv.lkww[729] = 1279761510720970599L;
        nv.lkww[730] = 3260780618870399515L;
        nv.lkww[731] = 9038245629488543557L;
        nv.lkww[732] = -1439768080154014809L;
        nv.lkww[733] = -5111459981080490193L;
        nv.lkww[734] = -511890446788166934L;
        nv.lkww[735] = 3845753258018493740L;
        nv.lkww[736] = 7324686706612133199L;
        nv.lkww[737] = -341334861255039766L;
        nv.lkww[738] = -4402064535842129922L;
        nv.lkww[739] = 7314343864871230976L;
        nv.lkww[740] = -5271022007802146240L;
        nv.lkww[741] = -1297720137990468598L;
        nv.lkww[742] = 8834875158695192694L;
        nv.lkww[743] = -1999168959456137058L;
        nv.lkww[744] = -5616961604089974063L;
        nv.lkww[745] = 5277520581861919554L;
        nv.lkww[746] = 2832875243657423715L;
        nv.lkww[747] = -946759343453235487L;
        nv.lkww[748] = 1017606649586137340L;
        nv.lkww[749] = 7821224505538321302L;
        nv.lkww[750] = -8032260322130775819L;
        nv.lkww[751] = 3048668383754002230L;
        nv.lkww[752] = -526153354378205156L;
        nv.lkww[753] = -3032658795072740609L;
        nv.lkww[754] = -2264150398097346929L;
        nv.lkww[755] = 7026389625218605923L;
        nv.lkww[756] = -6862314103234931829L;
        nv.lkww[757] = -1274709168572599499L;
        nv.lkww[758] = 1194377509067585499L;
        nv.lkww[759] = -5005005924491972275L;
        nv.lkww[760] = -5265572273319647938L;
        nv.lkww[761] = 9167113229907879219L;
        nv.lkww[762] = 3068198081842730072L;
        nv.lkww[763] = -6409758265490593962L;
        nv.lkww[764] = -2962816598821447614L;
        nv.lkww[765] = 7722103723111486541L;
        nv.lkww[766] = -1863785773853419723L;
        nv.lkww[767] = -1228305417928290809L;
        nv.lkww[768] = 3215130000322720608L;
        nv.lkww[769] = -9096514952559108454L;
        nv.lkww[770] = 6558357952375009684L;
        nv.lkww[771] = 3510070979849046434L;
        nv.lkww[772] = 6348254980907407135L;
        nv.lkww[773] = -8652017831703450017L;
        nv.lkww[774] = 7925952622289826327L;
        nv.lkww[775] = -1053660314972241136L;
        nv.lkww[776] = -3620967035249451905L;
        nv.lkww[777] = -3101888709271843169L;
        nv.lkww[778] = -2430977548794679870L;
        nv.lkww[779] = 494577615966710845L;
        nv.lkww[780] = -1553638755864058449L;
        nv.lkww[781] = -2761661256896965866L;
        nv.lkww[782] = -4738549834099740528L;
        nv.lkww[783] = -4208541666160685166L;
        nv.lkww[784] = 1118038722720209551L;
        nv.lkww[785] = -2779759659651702326L;
        nv.lkww[786] = -6774935027899858879L;
        nv.lkww[787] = -3077000260113258445L;
        nv.lkww[788] = 721701688458272314L;
        nv.lkww[789] = -6039308463751786110L;
        nv.lkww[790] = -4367396234271619309L;
        nv.lkww[791] = -8953607349573824893L;
        nv.lkww[792] = -1876296397609946507L;
        nv.lkww[793] = 3096864473197155840L;
        nv.lkww[794] = -8729627283270619090L;
        nv.lkww[795] = -8161738544689780021L;
        nv.lkww[796] = 6359061610058284633L;
        nv.lkww[797] = -5854978481167530240L;
        nv.lkww[798] = -1854355716399581708L;
        nv.lkww[799] = -7600593899910630488L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean hasElytra() {
        block58: {
            block57: {
                block56: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lkwy", lkwv(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v0 /* !! */  == nv.lkwr("lkwz", lkwo(int ), (int)3)) break;
                        v0 /* !! */  = (long)nv.lkwr("lkxa", lkwo(int ), (int)4);
                    }
                    var2 = nv.c;
                    v1 /* !! */  = nv.ud;
                    if (true) ** GOTO lbl11
                    block43: while (true) {
                        v1 /* !! */  = (long)(v2 - nv.lkwr("lkxb", lkwv(int ), (int)1));
lbl11:
                        // 2 sources

                        switch ((int)v1 /* !! */ ) {
                            case 317398858: {
                                v2 = nv.lkwr("lkxc", lkwv(int ), (int)2);
                                continue block43;
                            }
                            case 1155535071: {
                                v2 = nv.lkwr("lkxd", lkwv(int ), (int)3);
                                continue block43;
                            }
                            case 1637199440: {
                                break block43;
                            }
                            case 2085384335: {
                                v2 = nv.lkwr("lkxe", lkwv(int ), (int)4);
                                continue block43;
                            }
                        }
                        break;
                    }
                    var1_1 = nv.b;
                    v3 /* !! */  = nv.ud;
                    if (true) ** GOTO lbl28
                    block44: while (true) {
                        v3 /* !! */  = (long)(v4 - nv.lkwr("lkxf", lkwv(int ), (int)5));
lbl28:
                        // 2 sources

                        switch ((int)v3 /* !! */ ) {
                            case -1334139419: {
                                v4 = nv.lkwr("lkxg", lkwv(int ), (int)6);
                                continue block44;
                            }
                            case 892564558: {
                                v4 = nv.lkwr("lkxh", lkwv(int ), (int)7);
                                continue block44;
                            }
                            case 1565827939: {
                                v4 = nv.lkwr("lkxi", lkwv(int ), (int)8);
                                continue block44;
                            }
                            case 1637199440: {
                                break block44;
                            }
                        }
                        break;
                    }
                    var0_2 = nv.a;
                    if (var2) {
                        throw null;
lbl43:
                        // 5 sources

                        return (boolean)nv.lkwr("lkxj", lkwo(int ), (int)5);
                    }
                    if (var0_2 || var0_2) ** GOTO lbl43
                    v5 /* !! */  = nv.ud;
                    if (true) ** GOTO lbl50
                    block46: while (true) {
                        v5 /* !! */  = (long)(nv.lkwr("lkxl", lkwv(int ), (int)10) - nv.lkwr("lkxk", lkwv(int ), (int)9));
lbl50:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case -159895980: {
                                continue block46;
                            }
                            case 1637199440: {
                                break block46;
                            }
                        }
                        break;
                    }
                    v6 /* !! */  = nv.ud;
                    if (true) ** GOTO lbl59
                    block47: while (true) {
                        v6 /* !! */  = (long)(v7 - nv.lkwr("lkxm", lkwv(int ), (int)11));
lbl59:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case -786317759: {
                                v7 = nv.lkwr("lkxn", lkwv(int ), (int)12);
                                continue block47;
                            }
                            case -281205821: {
                                v7 = nv.lkwr("lkxo", lkwv(int ), (int)13);
                                continue block47;
                            }
                            case 1293792919: {
                                v7 = nv.lkwr("lkxp", lkwv(int ), (int)14);
                                continue block47;
                            }
                            case 1637199440: {
                                break block47;
                            }
                        }
                        break;
                    }
                    if (nv.mc.field_1724 != null) break block56;
                    if (var0_2) ** GOTO lbl43
                    return (boolean)nv.lkwr("lkxq", lkwo(int ), (int)6);
                }
                if (var0_2 || var0_2) ** GOTO lbl43
                v8 /* !! */  = nv.ud;
                if (true) ** GOTO lbl80
                block48: while (true) {
                    v8 /* !! */  = (long)(v9 - nv.lkwr("lkxr", lkwv(int ), (int)15));
lbl80:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1441462632: {
                            v9 = nv.lkwr("lkxs", lkwv(int ), (int)16);
                            continue block48;
                        }
                        case -1226325708: {
                            v9 = nv.lkwr("lkxt", lkwv(int ), (int)17);
                            continue block48;
                        }
                        case -203256162: {
                            v9 = nv.lkwr("lkxu", lkwv(int ), (int)18);
                            continue block48;
                        }
                        case 1637199440: {
                            break block48;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lkxv", lkwv(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == nv.lkwr("lkxw", lkwo(int ), (int)7)) break;
                    v10 /* !! */  = (long)nv.lkwr("lkxx", lkwo(int ), (int)8);
                }
                v11 = nv.mc.field_1724;
                v12 /* !! */  = nv.ud;
                if (true) ** GOTO lbl102
                block50: while (true) {
                    v12 /* !! */  = (long)(v13 - nv.lkwr("lkxy", lkwv(int ), (int)20));
lbl102:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1781194312: {
                            v13 = nv.lkwr("lkxz", lkwv(int ), (int)21);
                            continue block50;
                        }
                        case 929748287: {
                            v13 = nv.lkwr("lkya", lkwv(int ), (int)22);
                            continue block50;
                        }
                        case 1637199440: {
                            break block50;
                        }
                        case 2136160392: {
                            v13 = nv.lkwr("lkyb", lkwv(int ), (int)23);
                            continue block50;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lkyc", lkwv(int ), (int)24)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == nv.lkwr("lkyd", lkwo(int ), (int)9)) break;
                    v14 /* !! */  = (long)nv.lkwr("lkye", lkwo(int ), (int)10);
                }
                v15 = v11.method_6118(class_1304.field_6174);
                v16 /* !! */  = nv.ud;
                if (true) ** GOTO lbl124
                block52: while (true) {
                    v16 /* !! */  = (long)(nv.lkwr("lkyg", lkwv(int ), (int)26) - nv.lkwr("lkyf", lkwv(int ), (int)25));
lbl124:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 111084645: {
                            continue block52;
                        }
                        case 1637199440: {
                            break block52;
                        }
                    }
                    break;
                }
                v17 /* !! */  = nv.ud;
                if (true) ** GOTO lbl133
                block53: while (true) {
                    v17 /* !! */  = (long)(nv.lkwr("lkyi", lkwv(int ), (int)28) - nv.lkwr("lkyh", lkwv(int ), (int)27));
lbl133:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case 1637199440: {
                            break block53;
                        }
                        case 2147232718: {
                            continue block53;
                        }
                    }
                    break;
                }
                if (v15.method_58694(class_9334.field_54197) == null) break block57;
                if (var0_2) ** GOTO lbl43
                v18 = nv.lkwr("lkyj", lkwo(int ), (int)11);
                if (var2) {
                    throw null;
                }
                break block58;
            }
            if (!var0_2 && !var0_2) ** break;
            ** while (true)
            v18 = nv.lkwr("lkyk", lkwo(int ), (int)12);
        }
        return (boolean)v18;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static class_1735 findSlot(class_1792 var0, Predicate<class_1735> var1_1, Comparator<class_1735> var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lmep", lkwv(int ), (int)335)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nv.lkwr("lmeq", lkwo(int ), (int)543)) break;
            v0 /* !! */  = (long)nv.lkwr("lmer", lkwo(int ), (int)544);
        }
        var6_3 = nv.c;
        v1 /* !! */  = nv.ud;
        block23: while (true) {
            switch ((int)v1 /* !! */ ) {
                case -419022884: {
                    v1 /* !! */  = (long)(nv.lkwr("lmet", lkwv(int ), (int)337) - nv.lkwr("lmes", lkwv(int ), (int)336));
                    continue block23;
                }
                case 1637199440: {
                    break block23;
                }
            }
            break;
        }
        var5_4 /* !! */  = nv.b;
        v2 /* !! */  = nv.ud;
        if (true) ** GOTO lbl20
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - nv.lkwr("lmeu", lkwv(int ), (int)338));
lbl20:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1400072355: {
                    v3 = nv.lkwr("lmev", lkwv(int ), (int)339);
                    continue block24;
                }
                case -1226850414: {
                    v3 = nv.lkwr("lmew", lkwv(int ), (int)340);
                    continue block24;
                }
                case 1637199440: {
                    break block24;
                }
            }
            break;
        }
        var4_5 = nv.a;
        if (var6_3) {
            throw null;
        }
        if (var4_5 != false) return null;
        if (var4_5 != false) return null;
        v4 /* !! */  = nv.ud;
        if (true) ** GOTO lbl38
        block25: while (true) {
            v4 /* !! */  = (long)(v5 - nv.lkwr("lmex", lkwv(int ), (int)341));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 1349974748: {
                    v5 = nv.lkwr("lmey", lkwv(int ), (int)342);
                    continue block25;
                }
                case 1602313534: {
                    v5 = nv.lkwr("lmez", lkwv(int ), (int)343);
                    continue block25;
                }
                case 1637199440: {
                    break block25;
                }
            }
            break;
        }
        var3_6 = (Predicate<class_1735>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$findSlot$4(net.minecraft.class_1792 java.util.function.Predicate net.minecraft.class_1735 ), (Lnet/minecraft/class_1735;)Z)((class_1792)var0, var1_1);
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block26: while (true) {
            block36: {
                switch (cfr_temp_0 == -2147483648 ? var5_4 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var4_5 != false) return null;
                        if (var4_5 != false) return null;
                        while (true) {
                            if ((v6 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lmfa", lkwv(int ), (int)344)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v6 /* !! */  == nv.lkwr("lmfb", lkwo(int ), (int)545)) {
                                return nv.findSlot(var3_6, var2_2);
                            }
                            v6 /* !! */  = (long)nv.lkwr("lmfc", lkwo(int ), (int)546);
                        }
                    }
                    case 1: {
                        ** GOTO lbl83
                    }
                    case 3: {
                        var5_4 /* !! */  = (int)nv.lkwr("lmfg", lkwo(int ), (int)550);
                        if (var6_3) {
                            throw null;
                        }
                        ** GOTO lbl80
                    }
                    case 4: {
                        var5_4 /* !! */  = (int)nv.lkwr("lmfh", lkwo(int ), (int)551);
                        cfr_temp_0 = 2;
                        if (var6_3) {
                            throw null;
                        }
                        break block36;
                    }
                    case 5: {
                        ** GOTO lbl80
                    }
                    case 0: {
                        var5_4 /* !! */  = (int)nv.lkwr("lmfd", lkwo(int ), (int)547);
                        if (var6_3) {
                            throw null;
                        }
lbl80:
                        // 4 sources

                        var5_4 /* !! */  = (int)nv.lkwr("lmfi", lkwo(int ), (int)552);
                        if (var6_3) {
                            throw null;
                        }
lbl83:
                        // 3 sources

                        var5_4 /* !! */  = (int)nv.lkwr("lmfe", lkwo(int ), (int)548);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl91
            }
            do {
                if (true) continue block26;
lbl91:
                // 2 sources

                var5_4 /* !! */  = (int)nv.lkwr("lmff", lkwo(int ), (int)549);
                cfr_temp_0 = 0;
            } while (!var6_3);
            break;
        }
        throw null;
    }

    static {
        lkwp = new int[1299];
        lkwq = new int[1299];
        nv.loih();
        nv.loii();
        nv.loij();
        nv.loik();
        nv.loil();
        nv.loim();
        nv.loin();
        nv.loio();
        nv.loip();
        nv.loiq();
        nv.loir();
        nv.lois();
        nv.loit();
        nv.loiu();
        nv.loiv();
        nv.loiw();
        nv.loix();
        nv.loiy();
        nv.loiz();
        nv.loja();
        nv.lojb();
        nv.lojc();
        nv.lojd();
        nv.loje();
        nv.lojf();
        nv.lojg();
        lkww = new long[1027];
        lkwx = new long[1027];
        nv.lojh();
        nv.loji();
        nv.lojj();
        nv.lojk();
        nv.lojl();
        nv.lojm();
        nv.lojn();
        nv.lojo();
        nv.lojp();
        nv.lojq();
        nv.lojr();
        nv.lojs();
        nv.lojt();
        nv.loju();
        nv.lojv();
        nv.lojw();
        nv.lojx();
        nv.lojy();
        nv.lojz();
        nv.loka();
        nv.lokb();
        nv.lokc();
        mc = class_310.method_1551();
        ARMOR_SLOTS = new class_1304[]{class_1304.field_6166, class_1304.field_6172, class_1304.field_6174, class_1304.field_6169};
        savedSlot = (int)nv.lkwr("loie", lkwo(int ), (int)1296);
        silentSlot = (int)nv.lkwr("loif", lkwo(int ), (int)1297);
        cursorDumpSlot = (int)nv.lkwr("loig", lkwo(int ), (int)1298);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean dropCursorStack() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lljk", lkwv(int ), (int)136)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nv.lkwr("lljl", lkwo(int ), (int)191)) break;
            v0 /* !! */  = (long)nv.lkwr("lljm", lkwo(int ), (int)192);
        }
        var3 = nv.c;
        v1 /* !! */  = nv.ud;
        if (true) ** GOTO lbl11
        block58: while (true) {
            v1 /* !! */  = (long)(nv.lkwr("lljo", lkwv(int ), (int)138) - nv.lkwr("lljn", lkwv(int ), (int)137));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1187291558: {
                    continue block58;
                }
                case 1637199440: {
                    break block58;
                }
            }
            break;
        }
        var2_1 /* !! */  = nv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lljp", lkwv(int ), (int)139)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nv.lkwr("lljq", lkwo(int ), (int)193)) break;
            v2 /* !! */  = (long)nv.lkwr("lljr", lkwo(int ), (int)194);
        }
        var1_2 = nv.a;
        if (var3) {
            throw null;
lbl25:
            // 10 sources

            return (boolean)nv.lkwr("lljs", lkwo(int ), (int)195);
        }
        if (var1_2 || var1_2) ** GOTO lbl25
        v3 /* !! */  = nv.ud;
        if (true) ** GOTO lbl32
        block61: while (true) {
            v3 /* !! */  = (long)(nv.lkwr("llju", lkwv(int ), (int)141) - nv.lkwr("lljt", lkwv(int ), (int)140));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 1301741511: {
                    continue block61;
                }
                case 1637199440: {
                    break block61;
                }
            }
            break;
        }
        if (nv.hasCursorStack()) ** GOTO lbl43
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_2 || var1_2) ** GOTO lbl25
                return (boolean)nv.lkwr("lljv", lkwo(int ), (int)196);
            }
lbl43:
            // 1 sources

            if (var1_2 || var1_2) ** GOTO lbl25
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lljw", lkwv(int ), (int)142)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == nv.lkwr("lljx", lkwo(int ), (int)197)) break;
                v4 /* !! */  = (long)nv.lkwr("lljy", lkwo(int ), (int)198);
            }
            var0_3 = nv.findEmptySlot();
            if (var1_2 || var1_2) ** GOTO lbl25
            if (var0_3 == nv.lkwr("lljz", lkwo(int ), (int)199)) ** GOTO lbl90
            if (var1_2 || var1_2) ** GOTO lbl25
            v5 = nv.lkwr("llka", lkwo(int ), (int)200);
            v6 /* !! */  = nv.ud;
            if (true) ** GOTO lbl58
            block63: while (true) {
                v6 /* !! */  = (long)(v7 - nv.lkwr("llkb", lkwv(int ), (int)143));
lbl58:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -939319439: {
                        v7 = nv.lkwr("llkc", lkwv(int ), (int)144);
                        continue block63;
                    }
                    case 815576371: {
                        v7 = nv.lkwr("llkd", lkwv(int ), (int)145);
                        continue block63;
                    }
                    case 1637199440: {
                        break block63;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("llke", lkwv(int ), (int)146)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == nv.lkwr("llkf", lkwo(int ), (int)201)) break;
                v8 /* !! */  = (long)nv.lkwr("llkg", lkwo(int ), (int)202);
            }
            nv.click(var0_3, (int)v5, class_1713.field_7790);
            if (var1_2 || var1_2) ** GOTO lbl25
            v9 /* !! */  = nv.ud;
            if (true) ** GOTO lbl78
            block65: while (true) {
                v9 /* !! */  = (long)(v10 - nv.lkwr("llkh", lkwv(int ), (int)147));
lbl78:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1138242424: {
                        v10 = nv.lkwr("llki", lkwv(int ), (int)148);
                        continue block65;
                    }
                    case 1282163308: {
                        v10 = nv.lkwr("llkj", lkwv(int ), (int)149);
                        continue block65;
                    }
                    case 1637199440: {
                        break block65;
                    }
                }
                break;
            }
            nv.cursorDumpSlot = var0_3;
            if (var1_2 || var1_2) ** GOTO lbl25
            return (boolean)nv.lkwr("llkk", lkwo(int ), (int)203);
lbl90:
            // 1 sources

            if (var1_2 || var1_2) ** GOTO lbl25
            v11 = nv.lkwr("llkl", lkwo(int ), (int)204);
            v12 = nv.lkwr("llkm", lkwo(int ), (int)205);
            v13 /* !! */  = nv.ud;
            if (true) ** GOTO lbl97
            block66: while (true) {
                v13 /* !! */  = (long)(v14 - nv.lkwr("llkn", lkwv(int ), (int)150));
lbl97:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1617172012: {
                        v14 = nv.lkwr("llko", lkwv(int ), (int)151);
                        continue block66;
                    }
                    case -156143611: {
                        v14 = nv.lkwr("llkp", lkwv(int ), (int)152);
                        continue block66;
                    }
                    case 970481683: {
                        v14 = nv.lkwr("llkq", lkwv(int ), (int)153);
                        continue block66;
                    }
                    case 1637199440: {
                        break block66;
                    }
                }
                break;
            }
            v15 /* !! */  = nv.ud;
            if (true) ** GOTO lbl113
            block67: while (true) {
                v15 /* !! */  = (long)(nv.lkwr("llks", lkwv(int ), (int)155) - nv.lkwr("llkr", lkwv(int ), (int)154));
lbl113:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case 1467693541: {
                        continue block67;
                    }
                    case 1637199440: {
                        break block67;
                    }
                }
                break;
            }
            nv.click((int)v11, (int)v12, class_1713.field_7790);
            if (var1_2 || var1_2) ** GOTO lbl25
            v16 = nv.lkwr("llkt", lkwo(int ), (int)206);
            v17 /* !! */  = nv.ud;
            if (true) ** GOTO lbl125
            block68: while (true) {
                v17 /* !! */  = (long)(nv.lkwr("llkv", lkwv(int ), (int)157) - nv.lkwr("llku", lkwv(int ), (int)156));
lbl125:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case 688485099: {
                        continue block68;
                    }
                    case 1637199440: {
                        break block68;
                    }
                }
                break;
            }
            nv.cursorDumpSlot = (int)v16;
            if (var1_2 || var1_2) ** continue;
            return (boolean)nv.lkwr("llkw", lkwo(int ), (int)207);
            case 0: {
                do {
                    var2_1 /* !! */  = (int)nv.lkwr("llkx", lkwo(int ), (int)208);
                } while (!var3);
                throw null;
            }
lbl138:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)nv.lkwr("llky", lkwo(int ), (int)209);
                if (!var3) break;
                throw null;
            }
lbl142:
            // 3 sources

            case 2: {
                var2_1 /* !! */  = (int)nv.lkwr("llkz", lkwo(int ), (int)210);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl147:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)nv.lkwr("llla", lkwo(int ), (int)211);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl200
            }
            case 4: {
                var2_1 /* !! */  = (int)nv.lkwr("lllb", lkwo(int ), (int)212);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 5: {
                var2_1 /* !! */  = (int)nv.lkwr("lllc", lkwo(int ), (int)213);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl162:
            // 3 sources

            case 6: {
                var2_1 /* !! */  = (int)nv.lkwr("llld", lkwo(int ), (int)214);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl205
            }
            case 7: {
                var2_1 /* !! */  = (int)nv.lkwr("llle", lkwo(int ), (int)215);
                if (!var3) ** GOTO lbl147
                throw null;
            }
lbl171:
            // 3 sources

            case 8: {
                var2_1 /* !! */  = (int)nv.lkwr("lllf", lkwo(int ), (int)216);
                if (!var3) ** GOTO lbl142
                throw null;
            }
lbl175:
            // 3 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)nv.lkwr("lllg", lkwo(int ), (int)217);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl186
                    break;
                }
            }
lbl181:
            // 2 sources

            case 10: {
                var2_1 /* !! */  = (int)nv.lkwr("lllh", lkwo(int ), (int)218);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl186:
            // 2 sources

            case 11: {
                var2_1 /* !! */  = (int)nv.lkwr("llli", lkwo(int ), (int)219);
                if (!var3) ** GOTO lbl162
                throw null;
            }
            case 12: {
                var2_1 /* !! */  = (int)nv.lkwr("lllj", lkwo(int ), (int)220);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl218
            }
            case 13: {
                var2_1 /* !! */  = (int)nv.lkwr("lllk", lkwo(int ), (int)221);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl200:
            // 2 sources

            case 14: {
                var2_1 /* !! */  = (int)nv.lkwr("llll", lkwo(int ), (int)222);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl205:
            // 2 sources

            case 15: {
                do {
                    var2_1 /* !! */  = (int)nv.lkwr("lllm", lkwo(int ), (int)223);
                } while (!var3);
                throw null;
            }
lbl210:
            // 2 sources

            case 16: {
                var2_1 /* !! */  = (int)nv.lkwr("llln", lkwo(int ), (int)224);
                if (!var3) ** GOTO lbl175
                throw null;
            }
            case 17: {
                var2_1 /* !! */  = (int)nv.lkwr("lllo", lkwo(int ), (int)225);
                if (!var3) ** GOTO lbl171
                throw null;
            }
lbl218:
            // 2 sources

            case 18: {
                var2_1 /* !! */  = (int)nv.lkwr("lllp", lkwo(int ), (int)226);
                if (!var3) ** GOTO lbl138
                throw null;
            }
lbl222:
            // 2 sources

            case 19: {
                var2_1 /* !! */  = (int)nv.lkwr("lllq", lkwo(int ), (int)227);
                if (!var3) ** GOTO lbl181
                throw null;
            }
lbl226:
            // 2 sources

            case 20: {
                var2_1 /* !! */  = (int)nv.lkwr("lllr", lkwo(int ), (int)228);
                if (!var3) ** GOTO lbl142
                throw null;
            }
            case 21: {
                var2_1 /* !! */  = (int)nv.lkwr("llls", lkwo(int ), (int)229);
                if (!var3) break;
                throw null;
            }
            case 22: 
        }
        var2_1 /* !! */  = (int)nv.lkwr("lllt", lkwo(int ), (int)230);
        ** while (!var3)
lbl237:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$findSlot$3(class_1792 var0, class_1735 var1_1) {
        v0 /* !! */  = nv.ud;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(nv.lkwr("loet", lkwv(int ), (int)990) - nv.lkwr("loes", lkwv(int ), (int)989));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1507318699: {
                    continue block25;
                }
                case 1637199440: {
                    break block25;
                }
            }
            break;
        }
        var4_2 = nv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("loeu", lkwv(int ), (int)991)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nv.lkwr("loev", lkwo(int ), (int)1244)) break;
            v1 /* !! */  = (long)nv.lkwr("loew", lkwo(int ), (int)1245);
        }
        var3_3 /* !! */  = nv.b;
        v2 /* !! */  = nv.ud;
        if (true) ** GOTO lbl21
        block27: while (true) {
            v2 /* !! */  = (long)(v3 - nv.lkwr("loex", lkwv(int ), (int)992));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1766139388: {
                    v3 = nv.lkwr("loey", lkwv(int ), (int)993);
                    continue block27;
                }
                case 1314420383: {
                    v3 = nv.lkwr("loez", lkwv(int ), (int)994);
                    continue block27;
                }
                case 1637199440: {
                    break block27;
                }
            }
            break;
        }
        var2_4 = nv.a;
        if (var4_2) {
            throw null;
lbl33:
            // 4 sources

            return (boolean)nv.lkwr("lofa", lkwo(int ), (int)1246);
        }
        if (var2_4) ** GOTO lbl33
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl33
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lofb", lkwv(int ), (int)995)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == nv.lkwr("lofc", lkwo(int ), (int)1247)) break;
                    v4 /* !! */  = (long)nv.lkwr("lofd", lkwo(int ), (int)1248);
                }
                v5 = var1_1.method_7677();
                v6 /* !! */  = nv.ud;
                if (true) ** GOTO lbl50
                block30: while (true) {
                    v6 /* !! */  = (long)(v7 - nv.lkwr("lofe", lkwv(int ), (int)996));
lbl50:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 274651521: {
                            v7 = nv.lkwr("loff", lkwv(int ), (int)997);
                            continue block30;
                        }
                        case 1138456599: {
                            v7 = nv.lkwr("lofg", lkwv(int ), (int)998);
                            continue block30;
                        }
                        case 1637199440: {
                            break block30;
                        }
                        case 2000674577: {
                            v7 = nv.lkwr("lofh", lkwv(int ), (int)999);
                            continue block30;
                        }
                    }
                    break;
                }
                if (v5.method_7909() != var0) ** GOTO lbl68
                if (var2_4) ** GOTO lbl33
                v8 = nv.lkwr("lofi", lkwo(int ), (int)1249);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl71
lbl68:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v8 = nv.lkwr("lofj", lkwo(int ), (int)1250);
lbl71:
                // 2 sources

                return (boolean)v8;
            }
lbl72:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)nv.lkwr("lofk", lkwo(int ), (int)1251);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl99
            }
lbl77:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)nv.lkwr("lofl", lkwo(int ), (int)1252);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl90
            }
lbl82:
            // 3 sources

            case 2: {
                var3_3 /* !! */  = (int)nv.lkwr("lofm", lkwo(int ), (int)1253);
                if (!var4_2) ** GOTO lbl72
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)nv.lkwr("lofn", lkwo(int ), (int)1254);
                if (!var4_2) ** GOTO lbl82
                throw null;
            }
lbl90:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)nv.lkwr("lofo", lkwo(int ), (int)1255);
                if (!var4_2) ** GOTO lbl77
                throw null;
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)nv.lkwr("lofp", lkwo(int ), (int)1256);
                    if (!var4_2) ** GOTO lbl72
                    throw null;
                }
            }
lbl99:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)nv.lkwr("lofq", lkwo(int ), (int)1257);
                if (!var4_2) ** GOTO lbl82
                throw null;
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)nv.lkwr("lofr", lkwo(int ), (int)1258);
        ** while (!var4_2)
lbl106:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void loim() {
        nv.lkwp[500] = 1699648546;
        nv.lkwp[501] = -1945040523;
        nv.lkwp[502] = 566111340;
        nv.lkwp[503] = -592611050;
        nv.lkwp[504] = 1663091284;
        nv.lkwp[505] = -1206679241;
        nv.lkwp[506] = -1016114981;
        nv.lkwp[507] = 1941054077;
        nv.lkwp[508] = -884652619;
        nv.lkwp[509] = -444653146;
        nv.lkwp[510] = -1505626313;
        nv.lkwp[511] = 1392106684;
        nv.lkwp[512] = -463186028;
        nv.lkwp[513] = -1103745315;
        nv.lkwp[514] = 97429171;
        nv.lkwp[515] = 1811437282;
        nv.lkwp[516] = -1614260244;
        nv.lkwp[517] = -181879720;
        nv.lkwp[518] = 1094576339;
        nv.lkwp[519] = 2138565005;
        nv.lkwp[520] = -271285592;
        nv.lkwp[521] = -269157038;
        nv.lkwp[522] = -641196034;
        nv.lkwp[523] = 1018172469;
        nv.lkwp[524] = -1915216947;
        nv.lkwp[525] = 1525136590;
        nv.lkwp[526] = 1346363553;
        nv.lkwp[527] = 1644382528;
        nv.lkwp[528] = 1356994642;
        nv.lkwp[529] = 1712519817;
        nv.lkwp[530] = -861313171;
        nv.lkwp[531] = -372687586;
        nv.lkwp[532] = 803319433;
        nv.lkwp[533] = -1230546034;
        nv.lkwp[534] = -625844438;
        nv.lkwp[535] = 1337539144;
        nv.lkwp[536] = 1461288886;
        nv.lkwp[537] = 1325653410;
        nv.lkwp[538] = -352827070;
        nv.lkwp[539] = -200104760;
        nv.lkwp[540] = 1714896127;
        nv.lkwp[541] = 1502487933;
        nv.lkwp[542] = 747809654;
        nv.lkwp[543] = 1003342503;
        nv.lkwp[544] = 1822146103;
        nv.lkwp[545] = -1378846613;
        nv.lkwp[546] = -1013304693;
        nv.lkwp[547] = 1284650603;
        nv.lkwp[548] = 940421663;
        nv.lkwp[549] = -1114570448;
        nv.lkwp[550] = 515932495;
        nv.lkwp[551] = 2111784960;
        nv.lkwp[552] = 861764452;
        nv.lkwp[553] = 1025721192;
        nv.lkwp[554] = 1603524829;
        nv.lkwp[555] = 1963969788;
        nv.lkwp[556] = 176200881;
        nv.lkwp[557] = -931704683;
        nv.lkwp[558] = -271496456;
        nv.lkwp[559] = 876485481;
        nv.lkwp[560] = -1253850356;
        nv.lkwp[561] = 466896476;
        nv.lkwp[562] = -519764583;
        nv.lkwp[563] = 900009360;
        nv.lkwp[564] = -1895013031;
        nv.lkwp[565] = -476224070;
        nv.lkwp[566] = 2111720968;
        nv.lkwp[567] = -292740508;
        nv.lkwp[568] = 563799903;
        nv.lkwp[569] = -558868355;
        nv.lkwp[570] = -1033918422;
        nv.lkwp[571] = -735354608;
        nv.lkwp[572] = -1106822483;
        nv.lkwp[573] = -970370654;
        nv.lkwp[574] = -59033946;
        nv.lkwp[575] = -1559618733;
        nv.lkwp[576] = -1264314217;
        nv.lkwp[577] = 1595662696;
        nv.lkwp[578] = -2057829314;
        nv.lkwp[579] = 1398569723;
        nv.lkwp[580] = 135607271;
        nv.lkwp[581] = -1173157898;
        nv.lkwp[582] = 1404583590;
        nv.lkwp[583] = -1175529233;
        nv.lkwp[584] = -1569220591;
        nv.lkwp[585] = 1918205413;
        nv.lkwp[586] = -726908938;
        nv.lkwp[587] = 422124245;
        nv.lkwp[588] = 12407439;
        nv.lkwp[589] = 1867859323;
        nv.lkwp[590] = 1269711873;
        nv.lkwp[591] = -322059319;
        nv.lkwp[592] = 1242564602;
        nv.lkwp[593] = 1349894628;
        nv.lkwp[594] = 1600200837;
        nv.lkwp[595] = 1118621030;
        nv.lkwp[596] = 1933803;
        nv.lkwp[597] = 694119516;
        nv.lkwp[598] = -838015768;
        nv.lkwp[599] = -1218768802;
    }

    private static /* synthetic */ void loiw() {
        nv.lkwq[200] = -244424136;
        nv.lkwq[201] = -1390601754;
        nv.lkwq[202] = 791025008;
        nv.lkwq[203] = -1569004495;
        nv.lkwq[204] = 1689550350;
        nv.lkwq[205] = 54303802;
        nv.lkwq[206] = -1561013837;
        nv.lkwq[207] = 748978758;
        nv.lkwq[208] = -1056641143;
        nv.lkwq[209] = 1706686072;
        nv.lkwq[210] = -314557162;
        nv.lkwq[211] = -1385026660;
        nv.lkwq[212] = 669332495;
        nv.lkwq[213] = 1229363761;
        nv.lkwq[214] = -2055223311;
        nv.lkwq[215] = -1816165673;
        nv.lkwq[216] = 1543492992;
        nv.lkwq[217] = -267905667;
        nv.lkwq[218] = -489664776;
        nv.lkwq[219] = 1087785818;
        nv.lkwq[220] = 259923410;
        nv.lkwq[221] = -519901357;
        nv.lkwq[222] = -1035448166;
        nv.lkwq[223] = -1919607620;
        nv.lkwq[224] = -986078532;
        nv.lkwq[225] = -802635109;
        nv.lkwq[226] = 1023071537;
        nv.lkwq[227] = 20384206;
        nv.lkwq[228] = -209978776;
        nv.lkwq[229] = 1413605070;
        nv.lkwq[230] = -651717405;
        nv.lkwq[231] = 473969629;
        nv.lkwq[232] = 834176870;
        nv.lkwq[233] = -382304547;
        nv.lkwq[234] = -1729681750;
        nv.lkwq[235] = 143248947;
        nv.lkwq[236] = -1367175196;
        nv.lkwq[237] = -1096871342;
        nv.lkwq[238] = 1015188656;
        nv.lkwq[239] = -1240705564;
        nv.lkwq[240] = -2140072932;
        nv.lkwq[241] = 644027573;
        nv.lkwq[242] = 1371976159;
        nv.lkwq[243] = -2136014394;
        nv.lkwq[244] = 1506088972;
        nv.lkwq[245] = -2102526160;
        nv.lkwq[246] = -1785090888;
        nv.lkwq[247] = 1246736064;
        nv.lkwq[248] = -2101455764;
        nv.lkwq[249] = -1410736011;
        nv.lkwq[250] = -618603676;
        nv.lkwq[251] = 1571212359;
        nv.lkwq[252] = -1126858019;
        nv.lkwq[253] = 1761117919;
        nv.lkwq[254] = -1457246968;
        nv.lkwq[255] = 383716646;
        nv.lkwq[256] = 1087551838;
        nv.lkwq[257] = -1680693033;
        nv.lkwq[258] = 743189597;
        nv.lkwq[259] = -571416451;
        nv.lkwq[260] = -1909880573;
        nv.lkwq[261] = -1253658759;
        nv.lkwq[262] = -258105473;
        nv.lkwq[263] = 1632499467;
        nv.lkwq[264] = 1382798311;
        nv.lkwq[265] = 1107756918;
        nv.lkwq[266] = 393138436;
        nv.lkwq[267] = -1519822673;
        nv.lkwq[268] = -1757442462;
        nv.lkwq[269] = 2077367355;
        nv.lkwq[270] = -834677169;
        nv.lkwq[271] = -1687368149;
        nv.lkwq[272] = 1666375543;
        nv.lkwq[273] = -1451466414;
        nv.lkwq[274] = -2104666992;
        nv.lkwq[275] = 1380388360;
        nv.lkwq[276] = -1569448852;
        nv.lkwq[277] = 1383362384;
        nv.lkwq[278] = -1707167117;
        nv.lkwq[279] = -1643621575;
        nv.lkwq[280] = 1661014992;
        nv.lkwq[281] = 1508004277;
        nv.lkwq[282] = 1576228009;
        nv.lkwq[283] = -990326245;
        nv.lkwq[284] = -1684419345;
        nv.lkwq[285] = -1087321346;
        nv.lkwq[286] = -106608447;
        nv.lkwq[287] = 912169391;
        nv.lkwq[288] = -1548465790;
        nv.lkwq[289] = 1235638337;
        nv.lkwq[290] = -1412555631;
        nv.lkwq[291] = -1493599852;
        nv.lkwq[292] = -522192376;
        nv.lkwq[293] = -1198118440;
        nv.lkwq[294] = -314740440;
        nv.lkwq[295] = -171698225;
        nv.lkwq[296] = 1372097228;
        nv.lkwq[297] = -160467258;
        nv.lkwq[298] = -1359829049;
        nv.lkwq[299] = -1898594970;
    }

    private static /* synthetic */ void loju() {
        nv.lkwx[200] = -3118841588634463640L;
        nv.lkwx[201] = -5590989401181502620L;
        nv.lkwx[202] = -5420633514163545378L;
        nv.lkwx[203] = -7282376681727998887L;
        nv.lkwx[204] = 1441121526943221367L;
        nv.lkwx[205] = -7197602413072674499L;
        nv.lkwx[206] = 3499453367741522693L;
        nv.lkwx[207] = -7634358173353712098L;
        nv.lkwx[208] = -7528309129509938804L;
        nv.lkwx[209] = -5014178933559666512L;
        nv.lkwx[210] = 4132746419070279270L;
        nv.lkwx[211] = 9100266668273790385L;
        nv.lkwx[212] = -2296105471866532431L;
        nv.lkwx[213] = 1463782470241125589L;
        nv.lkwx[214] = 1420380036620516978L;
        nv.lkwx[215] = -9122207003912908944L;
        nv.lkwx[216] = 8531145471930331254L;
        nv.lkwx[217] = -4707703980983373570L;
        nv.lkwx[218] = 4890492818727865270L;
        nv.lkwx[219] = -8310393855471751700L;
        nv.lkwx[220] = -7381337439910488795L;
        nv.lkwx[221] = -4890943092925750257L;
        nv.lkwx[222] = -6915726644037378536L;
        nv.lkwx[223] = 5802420878899450778L;
        nv.lkwx[224] = -9170359643288180281L;
        nv.lkwx[225] = -3347859055422193506L;
        nv.lkwx[226] = 5915478752276701729L;
        nv.lkwx[227] = 7670114082448301447L;
        nv.lkwx[228] = -2500056274600041477L;
        nv.lkwx[229] = -2343683711268991432L;
        nv.lkwx[230] = 8635819822063332922L;
        nv.lkwx[231] = 6982135653607608783L;
        nv.lkwx[232] = -6972601162796503128L;
        nv.lkwx[233] = -1867088084926752251L;
        nv.lkwx[234] = -5273047398156301985L;
        nv.lkwx[235] = 8639795950783506318L;
        nv.lkwx[236] = -2201196082077467838L;
        nv.lkwx[237] = -7557250550056235195L;
        nv.lkwx[238] = -6326824727505474490L;
        nv.lkwx[239] = 2911285632026385706L;
        nv.lkwx[240] = -4236691454728592916L;
        nv.lkwx[241] = 8125529846283226072L;
        nv.lkwx[242] = -3666387854369048063L;
        nv.lkwx[243] = 1379886160106153731L;
        nv.lkwx[244] = -7803688115796898426L;
        nv.lkwx[245] = 6346851540217941742L;
        nv.lkwx[246] = -6158396091958192037L;
        nv.lkwx[247] = 2894056383781474067L;
        nv.lkwx[248] = -7719047483440257576L;
        nv.lkwx[249] = 8171403443553073161L;
        nv.lkwx[250] = 7229592540126006671L;
        nv.lkwx[251] = 1087708960264320427L;
        nv.lkwx[252] = -3293937844940224689L;
        nv.lkwx[253] = -6650528719471340198L;
        nv.lkwx[254] = -2369148339927532809L;
        nv.lkwx[255] = 627323833236311990L;
        nv.lkwx[256] = -6847745439599852670L;
        nv.lkwx[257] = 7466592736322656324L;
        nv.lkwx[258] = 8232057143090880470L;
        nv.lkwx[259] = 7050366540941493757L;
        nv.lkwx[260] = 1246722217594100191L;
        nv.lkwx[261] = -7214766549492545716L;
        nv.lkwx[262] = -4716350501207271007L;
        nv.lkwx[263] = 130601586136840644L;
        nv.lkwx[264] = -3186328739711018291L;
        nv.lkwx[265] = 5765706189983829251L;
        nv.lkwx[266] = 1424751573732333258L;
        nv.lkwx[267] = 8904357501139454009L;
        nv.lkwx[268] = 4139273234519258207L;
        nv.lkwx[269] = -189449544098803519L;
        nv.lkwx[270] = -9122574439336553069L;
        nv.lkwx[271] = 5474960352231628220L;
        nv.lkwx[272] = 2629297002704380849L;
        nv.lkwx[273] = -5360461229108764516L;
        nv.lkwx[274] = -7818253985340254862L;
        nv.lkwx[275] = 6526001078708302311L;
        nv.lkwx[276] = -1424420471943072933L;
        nv.lkwx[277] = 6497981287038862907L;
        nv.lkwx[278] = 445526161169694308L;
        nv.lkwx[279] = 8012119392992456593L;
        nv.lkwx[280] = 3905275896623668442L;
        nv.lkwx[281] = -407325994371076411L;
        nv.lkwx[282] = 5534098131799716229L;
        nv.lkwx[283] = -2755562705802641139L;
        nv.lkwx[284] = -76167361485525808L;
        nv.lkwx[285] = -2668966539883816627L;
        nv.lkwx[286] = -7666621966098096466L;
        nv.lkwx[287] = 1826334427283221370L;
        nv.lkwx[288] = -8658212502381882181L;
        nv.lkwx[289] = 3969405567935295797L;
        nv.lkwx[290] = 5779319496306238730L;
        nv.lkwx[291] = 162759925401146245L;
        nv.lkwx[292] = -2814187770125554002L;
        nv.lkwx[293] = 1058480873628915430L;
        nv.lkwx[294] = 446766430686677640L;
        nv.lkwx[295] = -8406756153839451595L;
        nv.lkwx[296] = -2613811842484112983L;
        nv.lkwx[297] = -7725396698512561187L;
        nv.lkwx[298] = 7667527397535574699L;
        nv.lkwx[299] = -3002753820794685098L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void silentUseItem(class_1792 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lniz", lkwv(int ), (int)712)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nv.lkwr("lnja", lkwo(int ), (int)956)) break;
            v0 /* !! */  = (long)nv.lkwr("lnjb", lkwo(int ), (int)957);
        }
        var3_1 = nv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lnjc", lkwv(int ), (int)713)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nv.lkwr("lnjd", lkwo(int ), (int)958)) break;
            v1 /* !! */  = (long)nv.lkwr("lnje", lkwo(int ), (int)959);
        }
        var2_2 /* !! */  = nv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lnjf", lkwv(int ), (int)714)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nv.lkwr("lnjg", lkwo(int ), (int)960)) break;
            v2 /* !! */  = (long)nv.lkwr("lnjh", lkwo(int ), (int)961);
        }
        var1_3 = nv.a;
        if (var3_1) {
            throw null;
lbl21:
            // 5 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("lnji", lkwv(int ), (int)715)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == nv.lkwr("lnjj", lkwo(int ), (int)962)) break;
            v3 /* !! */  = (long)nv.lkwr("lnjk", lkwo(int ), (int)963);
        }
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("lnjl", lkwv(int ), (int)716)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == nv.lkwr("lnjm", lkwo(int ), (int)964)) break;
            v4 /* !! */  = (long)nv.lkwr("lnjn", lkwo(int ), (int)965);
        }
        if (nv.mc.field_1724 != null) ** GOTO lbl41
        if (var1_3) ** GOTO lbl21
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl21
                return;
            }
lbl41:
            // 1 sources

            if (var1_3 || var1_3) ** GOTO lbl21
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_5 = nv.ud - nv.lkwr("lnjo", lkwv(int ), (int)717)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == nv.lkwr("lnjp", lkwo(int ), (int)966)) break;
                v5 /* !! */  = (long)nv.lkwr("lnjq", lkwo(int ), (int)967);
            }
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_6 = nv.ud - nv.lkwr("lnjr", lkwv(int ), (int)718)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == nv.lkwr("lnjs", lkwo(int ), (int)968)) break;
                v6 /* !! */  = (long)nv.lkwr("lnjt", lkwo(int ), (int)969);
            }
            v7 = nv.mc.field_1724;
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_7 = nv.ud - nv.lkwr("lnju", lkwv(int ), (int)719)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == nv.lkwr("lnjv", lkwo(int ), (int)970)) break;
                v8 /* !! */  = (long)nv.lkwr("lnjw", lkwo(int ), (int)971);
            }
            v9 = v7.method_36454();
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_8 = nv.ud - nv.lkwr("lnjx", lkwv(int ), (int)720)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == nv.lkwr("lnjy", lkwo(int ), (int)972)) break;
                v10 /* !! */  = (long)nv.lkwr("lnjz", lkwo(int ), (int)973);
            }
            v11 /* !! */  = nv.ud;
            if (true) ** GOTO lbl68
            block33: while (true) {
                v11 /* !! */  = (long)(nv.lkwr("lnkb", lkwv(int ), (int)722) - nv.lkwr("lnka", lkwv(int ), (int)721));
lbl68:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case 1487541131: {
                        continue block33;
                    }
                    case 1637199440: {
                        break block33;
                    }
                }
                break;
            }
            v12 = nv.mc.field_1724;
            v13 /* !! */  = nv.ud;
            if (true) ** GOTO lbl78
            block34: while (true) {
                v13 /* !! */  = (long)(v14 - nv.lkwr("lnkc", lkwv(int ), (int)723));
lbl78:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1625496158: {
                        v14 = nv.lkwr("lnkd", lkwv(int ), (int)724);
                        continue block34;
                    }
                    case -48720943: {
                        v14 = nv.lkwr("lnke", lkwv(int ), (int)725);
                        continue block34;
                    }
                    case 1637199440: {
                        break block34;
                    }
                    case 2012255959: {
                        v14 = nv.lkwr("lnkf", lkwv(int ), (int)726);
                        continue block34;
                    }
                }
                break;
            }
            v15 = v12.method_36455();
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_9 = nv.ud - nv.lkwr("lnkg", lkwv(int ), (int)727)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                if (v16 /* !! */  == nv.lkwr("lnkh", lkwo(int ), (int)974)) break;
                v16 /* !! */  = (long)nv.lkwr("lnki", lkwo(int ), (int)975);
            }
            nv.silentUseItem(var0, v9, v15);
            if (!var1_3 && !var1_3) ** break;
            ** continue;
            return;
lbl100:
            // 4 sources

            case 0: {
                var2_2 /* !! */  = (int)nv.lkwr("lnkj", lkwo(int ), (int)976);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl105:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)nv.lkwr("lnkk", lkwo(int ), (int)977);
                if (!var3_1) ** GOTO lbl100
                throw null;
            }
lbl109:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)nv.lkwr("lnkl", lkwo(int ), (int)978);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 3: {
                var2_2 /* !! */  = (int)nv.lkwr("lnkm", lkwo(int ), (int)979);
                if (!var3_1) ** GOTO lbl109
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)nv.lkwr("lnkn", lkwo(int ), (int)980);
                if (!var3_1) ** GOTO lbl105
                throw null;
            }
            case 5: {
                do {
                    var2_2 /* !! */  = (int)nv.lkwr("lnko", lkwo(int ), (int)981);
                } while (!var3_1);
                throw null;
            }
lbl127:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)nv.lkwr("lnkp", lkwo(int ), (int)982);
                if (!var3_1) ** GOTO lbl100
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)nv.lkwr("lnkq", lkwo(int ), (int)983);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 8: {
                var2_2 /* !! */  = (int)nv.lkwr("lnkr", lkwo(int ), (int)984);
                if (!var3_1) break;
                throw null;
            }
lbl140:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)nv.lkwr("lnks", lkwo(int ), (int)985);
                if (!var3_1) ** GOTO lbl100
                throw null;
            }
            case 10: 
        }
        do {
            var2_2 /* !! */  = (int)nv.lkwr("lnkt", lkwo(int ), (int)986);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void lojf() {
        nv.lkwq[1100] = 986715433;
        nv.lkwq[1101] = -1732000098;
        nv.lkwq[1102] = 1154644512;
        nv.lkwq[1103] = -1015215072;
        nv.lkwq[1104] = -933819395;
        nv.lkwq[1105] = 1248550330;
        nv.lkwq[1106] = -218252758;
        nv.lkwq[1107] = 1186474973;
        nv.lkwq[1108] = 979049214;
        nv.lkwq[1109] = -1285101178;
        nv.lkwq[1110] = -354212225;
        nv.lkwq[1111] = 188830962;
        nv.lkwq[1112] = -858659445;
        nv.lkwq[1113] = -1280504540;
        nv.lkwq[1114] = 1403356004;
        nv.lkwq[1115] = 1609953216;
        nv.lkwq[1116] = -880335025;
        nv.lkwq[1117] = -1711650219;
        nv.lkwq[1118] = -1135886166;
        nv.lkwq[1119] = 824936007;
        nv.lkwq[1120] = 144748664;
        nv.lkwq[1121] = 158271365;
        nv.lkwq[1122] = 751866301;
        nv.lkwq[1123] = 89395921;
        nv.lkwq[1124] = -1606004196;
        nv.lkwq[1125] = -997664303;
        nv.lkwq[1126] = 1561622514;
        nv.lkwq[1127] = -1473170593;
        nv.lkwq[1128] = 467268279;
        nv.lkwq[1129] = -1227569564;
        nv.lkwq[1130] = 584099199;
        nv.lkwq[1131] = -2099732327;
        nv.lkwq[1132] = -2139612443;
        nv.lkwq[1133] = 1733378386;
        nv.lkwq[1134] = -1547778089;
        nv.lkwq[1135] = 1258004777;
        nv.lkwq[1136] = 692738172;
        nv.lkwq[1137] = -1645536870;
        nv.lkwq[1138] = 96398021;
        nv.lkwq[1139] = 1254582355;
        nv.lkwq[1140] = 1176084875;
        nv.lkwq[1141] = -1189207291;
        nv.lkwq[1142] = 1842451998;
        nv.lkwq[1143] = -1611794983;
        nv.lkwq[1144] = -1264250908;
        nv.lkwq[1145] = -722996731;
        nv.lkwq[1146] = 117778913;
        nv.lkwq[1147] = -1795579135;
        nv.lkwq[1148] = -1782534134;
        nv.lkwq[1149] = 1100670524;
        nv.lkwq[1150] = -2121980605;
        nv.lkwq[1151] = 585386185;
        nv.lkwq[1152] = -1766040226;
        nv.lkwq[1153] = -788627769;
        nv.lkwq[1154] = -877027751;
        nv.lkwq[1155] = -8475681;
        nv.lkwq[1156] = -632674907;
        nv.lkwq[1157] = -1846983062;
        nv.lkwq[1158] = -1245284036;
        nv.lkwq[1159] = 1010446399;
        nv.lkwq[1160] = -1844287418;
        nv.lkwq[1161] = -240331911;
        nv.lkwq[1162] = 1160394172;
        nv.lkwq[1163] = 1660946351;
        nv.lkwq[1164] = 1457406880;
        nv.lkwq[1165] = -1059416915;
        nv.lkwq[1166] = -1888340381;
        nv.lkwq[1167] = -1204019299;
        nv.lkwq[1168] = 2029819022;
        nv.lkwq[1169] = -1492979786;
        nv.lkwq[1170] = -1451497958;
        nv.lkwq[1171] = -1469467766;
        nv.lkwq[1172] = -403008854;
        nv.lkwq[1173] = -603374801;
        nv.lkwq[1174] = 15250534;
        nv.lkwq[1175] = -1110953844;
        nv.lkwq[1176] = -507130926;
        nv.lkwq[1177] = 619702348;
        nv.lkwq[1178] = 1667329226;
        nv.lkwq[1179] = -403457865;
        nv.lkwq[1180] = 1232860734;
        nv.lkwq[1181] = -1824070235;
        nv.lkwq[1182] = -474629018;
        nv.lkwq[1183] = -1461085669;
        nv.lkwq[1184] = -1857370766;
        nv.lkwq[1185] = -1220331707;
        nv.lkwq[1186] = 1747928734;
        nv.lkwq[1187] = 842249449;
        nv.lkwq[1188] = 598028036;
        nv.lkwq[1189] = 1026530524;
        nv.lkwq[1190] = -584504251;
        nv.lkwq[1191] = 521313366;
        nv.lkwq[1192] = 1423702570;
        nv.lkwq[1193] = -1780952844;
        nv.lkwq[1194] = -1067550272;
        nv.lkwq[1195] = -1541402694;
        nv.lkwq[1196] = 19714754;
        nv.lkwq[1197] = -1341535695;
        nv.lkwq[1198] = 762374550;
        nv.lkwq[1199] = 1727861804;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static nu find(List<class_1792> var0) {
        block29: {
            block32: {
                block31: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lluo", lkwv(int ), (int)230)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v0 /* !! */  == nv.lkwr("llup", lkwo(int ), (int)387)) break;
                        v0 /* !! */  = (long)nv.lkwr("lluq", lkwo(int ), (int)388);
                    }
                    var3_1 = nv.c;
                    while (true) {
                        block30: {
                            if ((v1 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("llur", lkwv(int ), (int)231)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v1 /* !! */  != nv.lkwr("llus", lkwo(int ), (int)389)) break block30;
                            var2_2 /* !! */  = nv.b;
                            v2 /* !! */  = nv.ud;
                            if (true) ** GOTO lbl18
                        }
                        v1 /* !! */  = (long)nv.lkwr("llut", lkwo(int ), (int)390);
                    }
                    block22: while (true) {
                        v2 /* !! */  = (long)(v3 - nv.lkwr("lluu", lkwv(int ), (int)232));
lbl18:
                        // 2 sources

                        switch ((int)v2 /* !! */ ) {
                            case -1236872716: {
                                v3 = nv.lkwr("lluv", lkwv(int ), (int)233);
                                continue block22;
                            }
                            case -314736923: {
                                v3 = nv.lkwr("lluw", lkwv(int ), (int)234);
                                continue block22;
                            }
                            case 1637199440: {
                                break block22;
                            }
                        }
                        break;
                    }
                    var1_3 = nv.a;
                    if (var3_1) {
                        throw null;
                    }
                    if (var1_3 || var1_3) break block31;
                    v4 /* !! */  = nv.ud;
                    ** GOTO lbl40
                }
                if (var2_2 /* !! */  == 0) return null;
                cfr_temp_0 = -2147483648;
lbl36:
                // 2 sources

                block23: while (true) {
                    switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                        default: {
                            return null;
                        }
lbl40:
                        // 1 sources

                        block24: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case 103430062: {
                                    v4 /* !! */  = (long)(nv.lkwr("lluy", lkwv(int ), (int)236) - nv.lkwr("llux", lkwv(int ), (int)235));
                                    continue block24;
                                }
                                case 1637199440: {
                                    break block24;
                                }
                            }
                            break;
                        }
                        v5 = (nw)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_1799;)Z, lambda$find$1(java.util.List net.minecraft.class_1799 ), (Lnet/minecraft/class_1799;)Z)(var0);
                        v6 /* !! */  = nv.ud;
                        if (true) ** GOTO lbl61
                        case 0: {
                            ** break;
                        }
                        case 2: {
                            var2_2 /* !! */  = (int)nv.lkwr("llve", lkwo(int ), (int)393);
                            cfr_temp_0 = 1;
                            if (!var3_1) continue block23;
                            throw null;
                        }
                        case 3: {
                            break block29;
                        }
                        block25: while (true) {
                            v6 /* !! */  = (long)(v7 - nv.lkwr("lluz", lkwv(int ), (int)237));
lbl61:
                            // 2 sources

                            switch ((int)v6 /* !! */ ) {
                                case -1031054256: {
                                    v7 = nv.lkwr("llva", lkwv(int ), (int)238);
                                    continue block25;
                                }
                                case 1080064361: {
                                    v7 = nv.lkwr("llvb", lkwv(int ), (int)239);
                                    continue block25;
                                }
                                case 1637199440: {
                                    return nv.find(v5);
                                }
                            }
                            break;
                        }
                        return nv.find(v5);
lbl71:
                        // 2 sources

                        while (true) {
                            var2_2 /* !! */  = (int)nv.lkwr("llvc", lkwo(int ), (int)391);
                            cfr_temp_0 = 1;
                            if (!var3_1) continue block23;
                            throw null;
                        }
                        case 1: 
                    }
                    break;
                }
                break block32;
                ** while (true)
            }
            var2_2 /* !! */  = (int)nv.lkwr("llvd", lkwo(int ), (int)392);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)nv.lkwr("llvf", lkwo(int ), (int)394);
        ** while (!var3_1)
lbl86:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lojn() {
        nv.lkww[600] = 7228931298958297069L;
        nv.lkww[601] = -8128419755162263870L;
        nv.lkww[602] = 8359183132130848264L;
        nv.lkww[603] = -203295125805625072L;
        nv.lkww[604] = -8429286520752836658L;
        nv.lkww[605] = -8161149416878222872L;
        nv.lkww[606] = -8959322598961150372L;
        nv.lkww[607] = 9175410675704219969L;
        nv.lkww[608] = 3512237315769997854L;
        nv.lkww[609] = -8113121952448695467L;
        nv.lkww[610] = -1846733687682836634L;
        nv.lkww[611] = 2291850206483916843L;
        nv.lkww[612] = 4154085894874310488L;
        nv.lkww[613] = 7027950293397889810L;
        nv.lkww[614] = 2255204858618271503L;
        nv.lkww[615] = 6599316399305403691L;
        nv.lkww[616] = 7510317429278506486L;
        nv.lkww[617] = 8312701174807842655L;
        nv.lkww[618] = -3416063805823919188L;
        nv.lkww[619] = -2403087203303780084L;
        nv.lkww[620] = -5979503052546154447L;
        nv.lkww[621] = 8462292242444947710L;
        nv.lkww[622] = -3465530476894890842L;
        nv.lkww[623] = -3942763596055299314L;
        nv.lkww[624] = 4024784158913076555L;
        nv.lkww[625] = -6628856713500560658L;
        nv.lkww[626] = 4217562997416411430L;
        nv.lkww[627] = -2421877165857117008L;
        nv.lkww[628] = 5435343636442864050L;
        nv.lkww[629] = 6394638422821301073L;
        nv.lkww[630] = -879830773942231220L;
        nv.lkww[631] = 4152047212259133507L;
        nv.lkww[632] = -3509481438686198284L;
        nv.lkww[633] = -4780505165596566739L;
        nv.lkww[634] = 5841381162325810396L;
        nv.lkww[635] = 5723257233451057470L;
        nv.lkww[636] = 8246089535366438263L;
        nv.lkww[637] = 1474085702113120314L;
        nv.lkww[638] = 2053956287880420157L;
        nv.lkww[639] = 5763635227133945995L;
        nv.lkww[640] = 1177503261468895364L;
        nv.lkww[641] = -3271402240448088610L;
        nv.lkww[642] = -3027879780565323945L;
        nv.lkww[643] = -3318153152593261953L;
        nv.lkww[644] = -8922531547848149144L;
        nv.lkww[645] = -8781265720236834230L;
        nv.lkww[646] = -674594058333924295L;
        nv.lkww[647] = -8104293737072353444L;
        nv.lkww[648] = -5205111279194164516L;
        nv.lkww[649] = -5850750362143478758L;
        nv.lkww[650] = -5321843696564246315L;
        nv.lkww[651] = -879366795512194524L;
        nv.lkww[652] = 9174241570670505019L;
        nv.lkww[653] = -8128571943268126635L;
        nv.lkww[654] = 5606607922372811092L;
        nv.lkww[655] = 7764846863138694584L;
        nv.lkww[656] = 1026209050423891642L;
        nv.lkww[657] = 557297304037588091L;
        nv.lkww[658] = -32989087791038503L;
        nv.lkww[659] = -3305355160369626832L;
        nv.lkww[660] = -1398940069134033682L;
        nv.lkww[661] = 422357347721060172L;
        nv.lkww[662] = -1424611466438640775L;
        nv.lkww[663] = 2410874961154059064L;
        nv.lkww[664] = -3969278452283882653L;
        nv.lkww[665] = 2004607964790176458L;
        nv.lkww[666] = 3936018435645212516L;
        nv.lkww[667] = -6190557579123514016L;
        nv.lkww[668] = 8470028128073608637L;
        nv.lkww[669] = -6000970499684668022L;
        nv.lkww[670] = 3930463930092329608L;
        nv.lkww[671] = 2107335199508353329L;
        nv.lkww[672] = -8990829169398304702L;
        nv.lkww[673] = -4150387681083592896L;
        nv.lkww[674] = -5601720174155508915L;
        nv.lkww[675] = -8977753088459855428L;
        nv.lkww[676] = 4064913964948454045L;
        nv.lkww[677] = 4839140269706613126L;
        nv.lkww[678] = -7115855795792208233L;
        nv.lkww[679] = -7553390868880216309L;
        nv.lkww[680] = -3572021682617803104L;
        nv.lkww[681] = 8779666462220587498L;
        nv.lkww[682] = 6801964350663647441L;
        nv.lkww[683] = 3279177538589418474L;
        nv.lkww[684] = -7901099231421352874L;
        nv.lkww[685] = 5160525209759668709L;
        nv.lkww[686] = 2441942280620092431L;
        nv.lkww[687] = -5589753308089479667L;
        nv.lkww[688] = 7622954306936945312L;
        nv.lkww[689] = -2310938575573968195L;
        nv.lkww[690] = -972838050838928546L;
        nv.lkww[691] = -8111848689563047550L;
        nv.lkww[692] = 197913814196548539L;
        nv.lkww[693] = -7542263023827538473L;
        nv.lkww[694] = -9166830817316926437L;
        nv.lkww[695] = -1526425586705448897L;
        nv.lkww[696] = -7909428616024186411L;
        nv.lkww[697] = -7031209687806438937L;
        nv.lkww[698] = -6770034003411694981L;
        nv.lkww[699] = 8333834149398739011L;
    }

    private static /* synthetic */ void loji() {
        nv.lkww[100] = 4698325424591982244L;
        nv.lkww[101] = -6215460004996819549L;
        nv.lkww[102] = -4606979430611898678L;
        nv.lkww[103] = 6162690085744127271L;
        nv.lkww[104] = -7574608435499061261L;
        nv.lkww[105] = -6237379372019589272L;
        nv.lkww[106] = 6217062820993994794L;
        nv.lkww[107] = 7482397887009243830L;
        nv.lkww[108] = 1956125952681887196L;
        nv.lkww[109] = -8877502691234001597L;
        nv.lkww[110] = 8894727815568716426L;
        nv.lkww[111] = 1083849684247347561L;
        nv.lkww[112] = -4558081752951420656L;
        nv.lkww[113] = -8900142944407615462L;
        nv.lkww[114] = -2917338543137969528L;
        nv.lkww[115] = -8290873925851297300L;
        nv.lkww[116] = 2294996775694190609L;
        nv.lkww[117] = 6487328823769542873L;
        nv.lkww[118] = -7385045834218306670L;
        nv.lkww[119] = -1891712203534576948L;
        nv.lkww[120] = 758845543727662473L;
        nv.lkww[121] = 7466446593723926191L;
        nv.lkww[122] = 1188159473607633128L;
        nv.lkww[123] = -3691819299002651390L;
        nv.lkww[124] = 2867570568831849377L;
        nv.lkww[125] = -3013339926071642156L;
        nv.lkww[126] = -4492104016922260176L;
        nv.lkww[127] = -4040323739783264925L;
        nv.lkww[128] = -5186872004434186971L;
        nv.lkww[129] = -3006219609073156139L;
        nv.lkww[130] = -3408282798983751153L;
        nv.lkww[131] = 5839768827342814736L;
        nv.lkww[132] = 5592019129375735895L;
        nv.lkww[133] = -7520757512232907457L;
        nv.lkww[134] = 4751278336467106319L;
        nv.lkww[135] = 6116678628941438445L;
        nv.lkww[136] = -5737213844989684957L;
        nv.lkww[137] = 4735015710170557437L;
        nv.lkww[138] = -4351818506223911317L;
        nv.lkww[139] = -6178703840661219525L;
        nv.lkww[140] = 3467391476406036216L;
        nv.lkww[141] = 759317283256317792L;
        nv.lkww[142] = -3554576924733564410L;
        nv.lkww[143] = -4256872043395462111L;
        nv.lkww[144] = 8870615402133541914L;
        nv.lkww[145] = 8572449642345330654L;
        nv.lkww[146] = 4751210151231965940L;
        nv.lkww[147] = -8214967742517263756L;
        nv.lkww[148] = -2072516443349357676L;
        nv.lkww[149] = 1937358431002161605L;
        nv.lkww[150] = 3990262335192452117L;
        nv.lkww[151] = 5941169499639913475L;
        nv.lkww[152] = 2082207006326489483L;
        nv.lkww[153] = 5504020966048616415L;
        nv.lkww[154] = 8492800935362443934L;
        nv.lkww[155] = -7695554579907597796L;
        nv.lkww[156] = -2477794243165384623L;
        nv.lkww[157] = -8811489144106160723L;
        nv.lkww[158] = -9201156941081409263L;
        nv.lkww[159] = -3866509002379777169L;
        nv.lkww[160] = 1936930322745036995L;
        nv.lkww[161] = 7024192100859834271L;
        nv.lkww[162] = 2316554846815377904L;
        nv.lkww[163] = 584573517406723128L;
        nv.lkww[164] = -2371691762423008777L;
        nv.lkww[165] = 1648915293656614471L;
        nv.lkww[166] = 6926199088750654085L;
        nv.lkww[167] = -5980699258009642224L;
        nv.lkww[168] = -2325107189402477041L;
        nv.lkww[169] = 8857553402447625680L;
        nv.lkww[170] = 3914087941607749067L;
        nv.lkww[171] = 3280510160036868946L;
        nv.lkww[172] = -4332563170789371892L;
        nv.lkww[173] = -7909801811900946743L;
        nv.lkww[174] = 8681843534830822719L;
        nv.lkww[175] = -549694032373905630L;
        nv.lkww[176] = -1358746182744242650L;
        nv.lkww[177] = 2109569372923875676L;
        nv.lkww[178] = 998155701910114053L;
        nv.lkww[179] = -780687293377172367L;
        nv.lkww[180] = 7720264451303087266L;
        nv.lkww[181] = 2007287151167141326L;
        nv.lkww[182] = -3184283353339008837L;
        nv.lkww[183] = -3481371865704619725L;
        nv.lkww[184] = 4557662276297581661L;
        nv.lkww[185] = -5149327701006087563L;
        nv.lkww[186] = 3129768018505123191L;
        nv.lkww[187] = -3123301400273441195L;
        nv.lkww[188] = 2716354702336713016L;
        nv.lkww[189] = -3408510984134644641L;
        nv.lkww[190] = -5242390562604118365L;
        nv.lkww[191] = -3658421618041079047L;
        nv.lkww[192] = 5278853471648855427L;
        nv.lkww[193] = -4198968500597835646L;
        nv.lkww[194] = 2815503054262884279L;
        nv.lkww[195] = -6279804542134417471L;
        nv.lkww[196] = -7371142043433471695L;
        nv.lkww[197] = 4328130562597122213L;
        nv.lkww[198] = 8871664913747139711L;
        nv.lkww[199] = 4101896621001024615L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$find$1(List var0, class_1799 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("logo", lkwv(int ), (int)1011)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nv.lkwr("logp", lkwo(int ), (int)1270)) break;
            v0 /* !! */  = (long)nv.lkwr("logq", lkwo(int ), (int)1271);
        }
        var4_2 = nv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("logr", lkwv(int ), (int)1012)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nv.lkwr("logs", lkwo(int ), (int)1272)) break;
            v1 /* !! */  = (long)nv.lkwr("logt", lkwo(int ), (int)1273);
        }
        var3_3 = nv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("logu", lkwv(int ), (int)1013)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nv.lkwr("logv", lkwo(int ), (int)1274)) break;
            v2 /* !! */  = (long)nv.lkwr("logw", lkwo(int ), (int)1275);
        }
        var2_4 = nv.a;
        if (var4_2) {
            throw null;
lbl21:
            // 1 sources

            return (boolean)nv.lkwr("logx", lkwo(int ), (int)1276);
        }
        ** while (var2_4 || var2_4)
lbl24:
        // 1 sources

        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("logy", lkwv(int ), (int)1014)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == nv.lkwr("logz", lkwo(int ), (int)1277)) break;
            v3 /* !! */  = (long)nv.lkwr("loha", lkwo(int ), (int)1278);
        }
        v4 = var1_1.method_7909();
        v5 /* !! */  = nv.ud;
        if (true) ** GOTO lbl34
        block11: while (true) {
            v5 /* !! */  = (long)(v6 - nv.lkwr("lohb", lkwv(int ), (int)1015));
lbl34:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -134311088: {
                    v6 = nv.lkwr("lohc", lkwv(int ), (int)1016);
                    continue block11;
                }
                case 91137915: {
                    v6 = nv.lkwr("lohd", lkwv(int ), (int)1017);
                    continue block11;
                }
                case 496341177: {
                    v6 = nv.lkwr("lohe", lkwv(int ), (int)1018);
                    continue block11;
                }
                case 1637199440: {
                    break block11;
                }
            }
            break;
        }
        return var0.contains(v4);
    }

    private static /* synthetic */ void lois() {
        nv.lkwp[1100] = 986715432;
        nv.lkwp[1101] = 2112980169;
        nv.lkwp[1102] = -1154644513;
        nv.lkwp[1103] = 312170628;
        nv.lkwp[1104] = 933819394;
        nv.lkwp[1105] = 2136979063;
        nv.lkwp[1106] = 218252757;
        nv.lkwp[1107] = -1919937428;
        nv.lkwp[1108] = -979049215;
        nv.lkwp[1109] = 1869064952;
        nv.lkwp[1110] = 354212224;
        nv.lkwp[1111] = -36257414;
        nv.lkwp[1112] = 858659444;
        nv.lkwp[1113] = -1544366651;
        nv.lkwp[1114] = -1403356005;
        nv.lkwp[1115] = 1166573523;
        nv.lkwp[1116] = -880335033;
        nv.lkwp[1117] = -1711650210;
        nv.lkwp[1118] = -1135886167;
        nv.lkwp[1119] = 824936002;
        nv.lkwp[1120] = 144748669;
        nv.lkwp[1121] = 158271362;
        nv.lkwp[1122] = 751866302;
        nv.lkwp[1123] = 89395926;
        nv.lkwp[1124] = -1606004203;
        nv.lkwp[1125] = -997664296;
        nv.lkwp[1126] = 1561622512;
        nv.lkwp[1127] = -1473170601;
        nv.lkwp[1128] = 467268278;
        nv.lkwp[1129] = 1227569563;
        nv.lkwp[1130] = 1440739659;
        nv.lkwp[1131] = 2099732326;
        nv.lkwp[1132] = -2097431016;
        nv.lkwp[1133] = -1733378387;
        nv.lkwp[1134] = -32211874;
        nv.lkwp[1135] = -1258004778;
        nv.lkwp[1136] = -1119606302;
        nv.lkwp[1137] = 1645536869;
        nv.lkwp[1138] = -1013156660;
        nv.lkwp[1139] = 1254582359;
        nv.lkwp[1140] = 1176084879;
        nv.lkwp[1141] = -1189207293;
        nv.lkwp[1142] = 1842451988;
        nv.lkwp[1143] = -1611794990;
        nv.lkwp[1144] = -1264250900;
        nv.lkwp[1145] = -722996729;
        nv.lkwp[1146] = 117778923;
        nv.lkwp[1147] = -1795579127;
        nv.lkwp[1148] = -1782534133;
        nv.lkwp[1149] = 1100670526;
        nv.lkwp[1150] = -2121980602;
        nv.lkwp[1151] = 585386186;
        nv.lkwp[1152] = -1964814596;
        nv.lkwp[1153] = -788627762;
        nv.lkwp[1154] = -877027715;
        nv.lkwp[1155] = -8475681;
        nv.lkwp[1156] = -632674911;
        nv.lkwp[1157] = -1846983057;
        nv.lkwp[1158] = -1245284037;
        nv.lkwp[1159] = 1010446398;
        nv.lkwp[1160] = -1844287420;
        nv.lkwp[1161] = -240331911;
        nv.lkwp[1162] = 1160394168;
        nv.lkwp[1163] = -723354536;
        nv.lkwp[1164] = 1457406881;
        nv.lkwp[1165] = -595622996;
        nv.lkwp[1166] = 1888340380;
        nv.lkwp[1167] = -1911753177;
        nv.lkwp[1168] = 2029819023;
        nv.lkwp[1169] = 1967582408;
        nv.lkwp[1170] = 1451497957;
        nv.lkwp[1171] = 752899282;
        nv.lkwp[1172] = -403008854;
        nv.lkwp[1173] = -603374808;
        nv.lkwp[1174] = 15250530;
        nv.lkwp[1175] = -1110953846;
        nv.lkwp[1176] = -507130924;
        nv.lkwp[1177] = 619702346;
        nv.lkwp[1178] = 1667329231;
        nv.lkwp[1179] = -403457868;
        nv.lkwp[1180] = 1232860735;
        nv.lkwp[1181] = 1824070234;
        nv.lkwp[1182] = -119228831;
        nv.lkwp[1183] = 1461085668;
        nv.lkwp[1184] = 537923741;
        nv.lkwp[1185] = -1220331708;
        nv.lkwp[1186] = -702207321;
        nv.lkwp[1187] = -842249450;
        nv.lkwp[1188] = 886594781;
        nv.lkwp[1189] = -1026530525;
        nv.lkwp[1190] = 115277546;
        nv.lkwp[1191] = 521313362;
        nv.lkwp[1192] = 1423702571;
        nv.lkwp[1193] = -1780952846;
        nv.lkwp[1194] = -1067550270;
        nv.lkwp[1195] = -1541402690;
        nv.lkwp[1196] = 19714756;
        nv.lkwp[1197] = -1341535695;
        nv.lkwp[1198] = 762374544;
        nv.lkwp[1199] = -1727861805;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void restoreSlot() {
        block56: {
            v0 /* !! */  = nv.ud;
            if (true) ** GOTO lbl5
            block37: while (true) {
                v0 /* !! */  = (long)(v1 - nv.lkwr("lmwg", lkwv(int ), (int)553));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1703996109: {
                        v1 = nv.lkwr("lmwh", lkwv(int ), (int)554);
                        continue block37;
                    }
                    case 1184551660: {
                        v1 = nv.lkwr("lmwi", lkwv(int ), (int)555);
                        continue block37;
                    }
                    case 1637199440: {
                        break block37;
                    }
                }
                break;
            }
            var2 = nv.c;
            v2 /* !! */  = nv.ud;
            if (true) ** GOTO lbl19
            block38: while (true) {
                v2 /* !! */  = (long)(nv.lkwr("lmwk", lkwv(int ), (int)557) - nv.lkwr("lmwj", lkwv(int ), (int)556));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case 926234013: {
                        continue block38;
                    }
                    case 1637199440: {
                        break block38;
                    }
                }
                break;
            }
            var1_1 /* !! */  = nv.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lmwl", lkwv(int ), (int)558)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == nv.lkwr("lmwm", lkwo(int ), (int)784)) break;
                v3 /* !! */  = (long)nv.lkwr("lmwn", lkwo(int ), (int)785);
            }
            var0_2 = nv.a;
            if (var2) {
                throw null;
lbl34:
                // 5 sources

                return;
            }
            if (var0_2 || var0_2) ** GOTO lbl34
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lmwo", lkwv(int ), (int)559)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == nv.lkwr("lmwp", lkwo(int ), (int)786)) break;
                v4 /* !! */  = (long)nv.lkwr("lmwq", lkwo(int ), (int)787);
            }
            if (nv.savedSlot == nv.lkwr("lmwr", lkwo(int ), (int)788)) break block56;
            if (var0_2 || var0_2) ** GOTO lbl34
            v5 /* !! */  = nv.ud;
            if (true) ** GOTO lbl49
            block42: while (true) {
                v5 /* !! */  = (long)(v6 - nv.lkwr("lmws", lkwv(int ), (int)560));
lbl49:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case 1065153970: {
                        v6 = nv.lkwr("lmwt", lkwv(int ), (int)561);
                        continue block42;
                    }
                    case 1637199440: {
                        break block42;
                    }
                    case 1944748008: {
                        v6 = nv.lkwr("lmwu", lkwv(int ), (int)562);
                        continue block42;
                    }
                }
                break;
            }
            v7 /* !! */  = nv.ud;
            if (true) ** GOTO lbl62
            block43: while (true) {
                v7 /* !! */  = (long)(nv.lkwr("lmww", lkwv(int ), (int)564) - nv.lkwr("lmwv", lkwv(int ), (int)563));
lbl62:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case 1465383417: {
                        continue block43;
                    }
                    case 1637199440: {
                        break block43;
                    }
                }
                break;
            }
            nv.selectSlot(nv.savedSlot);
            if (var0_2 || var0_2) ** GOTO lbl34
            v8 = nv.lkwr("lmwx", lkwo(int ), (int)789);
            v9 /* !! */  = nv.ud;
            if (true) ** GOTO lbl74
            block44: while (true) {
                v9 /* !! */  = (long)(v10 - nv.lkwr("lmwy", lkwv(int ), (int)565));
lbl74:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1604212098: {
                        v10 = nv.lkwr("lmwz", lkwv(int ), (int)566);
                        continue block44;
                    }
                    case -236999391: {
                        v10 = nv.lkwr("lmxa", lkwv(int ), (int)567);
                        continue block44;
                    }
                    case 392513485: {
                        v10 = nv.lkwr("lmxb", lkwv(int ), (int)568);
                        continue block44;
                    }
                    case 1637199440: {
                        break block44;
                    }
                }
                break;
            }
            nv.savedSlot = (int)v8;
            if (var0_2) ** GOTO lbl34
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
lbl95:
            // 4 sources

            case 0: {
                var1_1 /* !! */  = (int)nv.lkwr("lmxc", lkwo(int ), (int)790);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 1: {
                var1_1 /* !! */  = (int)nv.lkwr("lmxd", lkwo(int ), (int)791);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 2: {
                var1_1 /* !! */  = (int)nv.lkwr("lmxe", lkwo(int ), (int)792);
                if (!var2) ** GOTO lbl95
                throw null;
            }
            case 3: {
                var1_1 /* !! */  = (int)nv.lkwr("lmxf", lkwo(int ), (int)793);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl131
            }
            case 4: {
                var1_1 /* !! */  = (int)nv.lkwr("lmxg", lkwo(int ), (int)794);
                if (!var2) ** GOTO lbl95
                throw null;
            }
            case 5: {
                var1_1 /* !! */  = (int)nv.lkwr("lmxh", lkwo(int ), (int)795);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl123:
            // 2 sources

            case 6: {
                var1_1 /* !! */  = (int)nv.lkwr("lmxi", lkwo(int ), (int)796);
                if (!var2) break;
                throw null;
            }
lbl127:
            // 5 sources

            case 7: {
                var1_1 /* !! */  = (int)nv.lkwr("lmxj", lkwo(int ), (int)797);
                if (!var2) ** GOTO lbl123
                throw null;
            }
lbl131:
            // 2 sources

            case 8: {
                var1_1 /* !! */  = (int)nv.lkwr("lmxk", lkwo(int ), (int)798);
                if (!var2) ** GOTO lbl127
                throw null;
            }
            case 9: {
                var1_1 /* !! */  = (int)nv.lkwr("lmxl", lkwo(int ), (int)799);
                if (!var2) ** GOTO lbl95
                throw null;
            }
            case 10: 
        }
        do {
            var1_1 /* !! */  = (int)nv.lkwr("lmxm", lkwo(int ), (int)800);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void loij() {
        nv.lkwp[200] = -244424136;
        nv.lkwp[201] = -1390601753;
        nv.lkwp[202] = -1803260106;
        nv.lkwp[203] = -1569004496;
        nv.lkwp[204] = 1689550378;
        nv.lkwp[205] = 54303802;
        nv.lkwp[206] = -1561013865;
        nv.lkwp[207] = 748978759;
        nv.lkwp[208] = -1056641127;
        nv.lkwp[209] = 1706686070;
        nv.lkwp[210] = -314557178;
        nv.lkwp[211] = -1385026657;
        nv.lkwp[212] = 669332485;
        nv.lkwp[213] = 1229363768;
        nv.lkwp[214] = -2055223299;
        nv.lkwp[215] = -1816165675;
        nv.lkwp[216] = 1543493003;
        nv.lkwp[217] = -267905678;
        nv.lkwp[218] = -489664770;
        nv.lkwp[219] = 1087785811;
        nv.lkwp[220] = 259923398;
        nv.lkwp[221] = -519901356;
        nv.lkwp[222] = -1035448177;
        nv.lkwp[223] = -1919607619;
        nv.lkwp[224] = -986078532;
        nv.lkwp[225] = -802635127;
        nv.lkwp[226] = 1023071540;
        nv.lkwp[227] = 20384223;
        nv.lkwp[228] = -209978770;
        nv.lkwp[229] = 1413605064;
        nv.lkwp[230] = -651717385;
        nv.lkwp[231] = 24815116;
        nv.lkwp[232] = -834176871;
        nv.lkwp[233] = -382304556;
        nv.lkwp[234] = -1729681778;
        nv.lkwp[235] = 143248947;
        nv.lkwp[236] = -1367175187;
        nv.lkwp[237] = -1096871306;
        nv.lkwp[238] = -1015188657;
        nv.lkwp[239] = -1240705555;
        nv.lkwp[240] = -2140072958;
        nv.lkwp[241] = 644027564;
        nv.lkwp[242] = 1371976137;
        nv.lkwp[243] = -2136014380;
        nv.lkwp[244] = 1506088979;
        nv.lkwp[245] = -2102526192;
        nv.lkwp[246] = -1785090894;
        nv.lkwp[247] = 1246736096;
        nv.lkwp[248] = -2101455773;
        nv.lkwp[249] = -1410736043;
        nv.lkwp[250] = -618603654;
        nv.lkwp[251] = 1571212381;
        nv.lkwp[252] = -1126858035;
        nv.lkwp[253] = 0x68F886FF;
        nv.lkwp[254] = -1457246970;
        nv.lkwp[255] = 383716664;
        nv.lkwp[256] = 1087551809;
        nv.lkwp[257] = -1680693031;
        nv.lkwp[258] = 743189584;
        nv.lkwp[259] = -571416457;
        nv.lkwp[260] = -1909880568;
        nv.lkwp[261] = -1253658784;
        nv.lkwp[262] = -258105498;
        nv.lkwp[263] = 1632499464;
        nv.lkwp[264] = 1382798317;
        nv.lkwp[265] = 1107756902;
        nv.lkwp[266] = 393138461;
        nv.lkwp[267] = -1519822672;
        nv.lkwp[268] = -1757442446;
        nv.lkwp[269] = 2077367358;
        nv.lkwp[270] = -834677159;
        nv.lkwp[271] = -1687368143;
        nv.lkwp[272] = 1666375542;
        nv.lkwp[273] = -1451466419;
        nv.lkwp[274] = 2104666991;
        nv.lkwp[275] = 702060481;
        nv.lkwp[276] = -1569448851;
        nv.lkwp[277] = 1265314637;
        nv.lkwp[278] = -936637392;
        nv.lkwp[279] = 1643621574;
        nv.lkwp[280] = -114251252;
        nv.lkwp[281] = -1508004278;
        nv.lkwp[282] = 1576228009;
        nv.lkwp[283] = -990326254;
        nv.lkwp[284] = 1684419344;
        nv.lkwp[285] = 115044236;
        nv.lkwp[286] = 106608446;
        nv.lkwp[287] = 456268788;
        nv.lkwp[288] = 1548465789;
        nv.lkwp[289] = 1519418336;
        nv.lkwp[290] = 1412555630;
        nv.lkwp[291] = -1493599870;
        nv.lkwp[292] = -522192380;
        nv.lkwp[293] = -1198118445;
        nv.lkwp[294] = -314740448;
        nv.lkwp[295] = -171698226;
        nv.lkwp[296] = 1372097243;
        nv.lkwp[297] = -160467253;
        nv.lkwp[298] = -1359829033;
        nv.lkwp[299] = -1898594958;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_1799 offhandStack() {
        block53: {
            v0 /* !! */  = nv.ud;
            if (true) ** GOTO lbl5
            block32: while (true) {
                v0 /* !! */  = (long)(v1 - nv.lkwr("lnzu", lkwv(int ), (int)924));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -657773328: {
                        v1 = nv.lkwr("lnzv", lkwv(int ), (int)925);
                        continue block32;
                    }
                    case 1126347385: {
                        v1 = nv.lkwr("lnzw", lkwv(int ), (int)926);
                        continue block32;
                    }
                    case 1637199440: {
                        break block32;
                    }
                }
                break;
            }
            var2 = nv.c;
            v2 /* !! */  = nv.ud;
            if (true) ** GOTO lbl19
            block33: while (true) {
                v2 /* !! */  = (long)(v3 - nv.lkwr("lnzx", lkwv(int ), (int)927));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1413421756: {
                        v3 = nv.lkwr("lnzy", lkwv(int ), (int)928);
                        continue block33;
                    }
                    case -567330784: {
                        v3 = nv.lkwr("lnzz", lkwv(int ), (int)929);
                        continue block33;
                    }
                    case 748844997: {
                        v3 = nv.lkwr("loaa", lkwv(int ), (int)930);
                        continue block33;
                    }
                    case 1637199440: {
                        break block33;
                    }
                }
                break;
            }
            var1_1 /* !! */  = nv.b;
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("loab", lkwv(int ), (int)931)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == nv.lkwr("loac", lkwo(int ), (int)1181)) break;
                v4 /* !! */  = (long)nv.lkwr("load", lkwo(int ), (int)1182);
            }
            var0_2 = nv.a;
            if (var2) {
                throw null;
lbl40:
                // 3 sources

                return null;
            }
            if (var0_2 || var0_2) ** GOTO lbl40
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("loae", lkwv(int ), (int)932)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == nv.lkwr("loaf", lkwo(int ), (int)1183)) break;
                v5 /* !! */  = (long)nv.lkwr("loag", lkwo(int ), (int)1184);
            }
            v6 /* !! */  = nv.ud;
            if (true) ** GOTO lbl52
            block37: while (true) {
                v6 /* !! */  = (long)(v7 - nv.lkwr("loah", lkwv(int ), (int)933));
lbl52:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1714059202: {
                        v7 = nv.lkwr("loai", lkwv(int ), (int)934);
                        continue block37;
                    }
                    case -1286888937: {
                        v7 = nv.lkwr("loaj", lkwv(int ), (int)935);
                        continue block37;
                    }
                    case 1637199440: {
                        break block37;
                    }
                }
                break;
            }
            if (nv.mc.field_1724 == null) break block53;
            if (var0_2) ** GOTO lbl40
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("loak", lkwv(int ), (int)936)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == nv.lkwr("loal", lkwo(int ), (int)1185)) break;
                v8 /* !! */  = (long)nv.lkwr("loam", lkwo(int ), (int)1186);
            }
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("loan", lkwv(int ), (int)937)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == nv.lkwr("loao", lkwo(int ), (int)1187)) break;
                v9 /* !! */  = (long)nv.lkwr("loap", lkwo(int ), (int)1188);
            }
            v10 = nv.mc.field_1724;
            v11 /* !! */  = nv.ud;
            if (true) ** GOTO lbl78
            block40: while (true) {
                v11 /* !! */  = (long)(v12 - nv.lkwr("loaq", lkwv(int ), (int)938));
lbl78:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -1513407912: {
                        v12 = nv.lkwr("loar", lkwv(int ), (int)939);
                        continue block40;
                    }
                    case -1013535351: {
                        v12 = nv.lkwr("loas", lkwv(int ), (int)940);
                        continue block40;
                    }
                    case -824940759: {
                        v12 = nv.lkwr("loat", lkwv(int ), (int)941);
                        continue block40;
                    }
                    case 1637199440: {
                        break block40;
                    }
                }
                break;
            }
            v13 = v10.method_6079();
            if (var2) {
                throw null;
            }
            ** GOTO lbl107
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("loau", lkwv(int ), (int)942)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == nv.lkwr("loav", lkwo(int ), (int)1189)) {
                        v13 = class_1799.field_8037;
                        break;
                    }
                    v14 /* !! */  = (long)nv.lkwr("loaw", lkwo(int ), (int)1190);
                }
lbl107:
                // 2 sources

                return v13;
            }
            case 0: {
                var1_1 /* !! */  = (int)nv.lkwr("loax", lkwo(int ), (int)1191);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 1: {
                var1_1 /* !! */  = (int)nv.lkwr("loay", lkwo(int ), (int)1192);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 2: {
                var1_1 /* !! */  = (int)nv.lkwr("loaz", lkwo(int ), (int)1193);
                if (var2) {
                    throw null;
                }
            }
            case 3: {
                var1_1 /* !! */  = (int)nv.lkwr("loba", lkwo(int ), (int)1194);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)nv.lkwr("lobb", lkwo(int ), (int)1195);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl138
                    break;
                }
            }
lbl133:
            // 4 sources

            case 5: {
                do {
                    var1_1 /* !! */  = (int)nv.lkwr("lobc", lkwo(int ), (int)1196);
                } while (!var2);
                throw null;
            }
lbl138:
            // 2 sources

            case 6: {
                do {
                    var1_1 /* !! */  = (int)nv.lkwr("lobd", lkwo(int ), (int)1197);
                } while (!var2);
                throw null;
            }
            case 7: 
        }
        var1_1 /* !! */  = (int)nv.lkwr("lobe", lkwo(int ), (int)1198);
        ** while (!var2)
lbl146:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int findElytraSlot() {
        block86: {
            block87: {
                v0 /* !! */  = nv.ud;
                if (true) ** GOTO lbl5
                block52: while (true) {
                    v0 /* !! */  = (long)(v1 - nv.lkwr("lkyw", lkwv(int ), (int)29));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1162366810: {
                            v1 = nv.lkwr("lkyx", lkwv(int ), (int)30);
                            continue block52;
                        }
                        case 504754243: {
                            v1 = nv.lkwr("lkyy", lkwv(int ), (int)31);
                            continue block52;
                        }
                        case 1637199440: {
                            break block52;
                        }
                    }
                    break;
                }
                var3 = nv.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lkyz", lkwv(int ), (int)32)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == nv.lkwr("lkza", lkwo(int ), (int)24)) break;
                    v2 /* !! */  = (long)nv.lkwr("lkzb", lkwo(int ), (int)25);
                }
                var2_1 /* !! */  = nv.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lkzc", lkwv(int ), (int)33)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == nv.lkwr("lkzd", lkwo(int ), (int)26)) break;
                    v3 /* !! */  = (long)nv.lkwr("lkze", lkwo(int ), (int)27);
                }
                var1_2 = nv.a;
                if (var3) {
                    throw null;
lbl29:
                    // 10 sources

                    return (int)nv.lkwr("lkzf", lkwo(int ), (int)28);
                }
                if (var1_2 || var1_2) ** GOTO lbl29
                v4 /* !! */  = nv.ud;
                if (true) ** GOTO lbl36
                block56: while (true) {
                    v4 /* !! */  = (long)(v5 - nv.lkwr("lkzg", lkwv(int ), (int)34));
lbl36:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 758899597: {
                            v5 = nv.lkwr("lkzh", lkwv(int ), (int)35);
                            continue block56;
                        }
                        case 1126082892: {
                            v5 = nv.lkwr("lkzi", lkwv(int ), (int)36);
                            continue block56;
                        }
                        case 1637199440: {
                            break block56;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lkzj", lkwv(int ), (int)37)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == nv.lkwr("lkzk", lkwo(int ), (int)29)) break;
                    v6 /* !! */  = (long)nv.lkwr("lkzl", lkwo(int ), (int)30);
                }
                if (nv.mc.field_1724 != null) break block87;
                if (var1_2) ** GOTO lbl29
                return (int)nv.lkwr("lkzm", lkwo(int ), (int)31);
            }
            if (var1_2 || var1_2) ** GOTO lbl29
            var0_3 = nv.lkwr("lkzn", lkwo(int ), (int)32);
            if (var1_2) ** GOTO lbl29
            do {
                block88: {
                    if (var1_2 || var1_2) ** GOTO lbl29
                    if (var0_3 >= nv.lkwr("lkzo", lkwo(int ), (int)33)) break block86;
                    if (var1_2 || var1_2) ** GOTO lbl29
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("lkzp", lkwv(int ), (int)38)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v7 /* !! */  == nv.lkwr("lkzq", lkwo(int ), (int)34)) break;
                        v7 /* !! */  = (long)nv.lkwr("lkzr", lkwo(int ), (int)35);
                    }
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("lkzs", lkwv(int ), (int)39)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v8 /* !! */  == nv.lkwr("lkzt", lkwo(int ), (int)36)) break;
                        v8 /* !! */  = (long)nv.lkwr("lkzu", lkwo(int ), (int)37);
                    }
                    v9 = nv.mc.field_1724;
                    v10 /* !! */  = nv.ud;
                    if (true) ** GOTO lbl76
                    block61: while (true) {
                        v10 /* !! */  = (long)(v11 - nv.lkwr("lkzv", lkwv(int ), (int)40));
lbl76:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case 406119930: {
                                v11 = nv.lkwr("lkzw", lkwv(int ), (int)41);
                                continue block61;
                            }
                            case 1404006369: {
                                v11 = nv.lkwr("lkzx", lkwv(int ), (int)42);
                                continue block61;
                            }
                            case 1637199440: {
                                break block61;
                            }
                            case 1694668744: {
                                v11 = nv.lkwr("lkzy", lkwv(int ), (int)43);
                                continue block61;
                            }
                        }
                        break;
                    }
                    v12 = v9.method_31548();
                    v13 /* !! */  = nv.ud;
                    if (true) ** GOTO lbl93
                    block62: while (true) {
                        v13 /* !! */  = (long)(nv.lkwr("llaa", lkwv(int ), (int)45) - nv.lkwr("lkzz", lkwv(int ), (int)44));
lbl93:
                        // 2 sources

                        switch ((int)v13 /* !! */ ) {
                            case 1495774304: {
                                continue block62;
                            }
                            case 1637199440: {
                                break block62;
                            }
                        }
                        break;
                    }
                    v14 = v12.method_5438((int)var0_3);
                    v15 /* !! */  = nv.ud;
                    if (true) ** GOTO lbl103
                    block63: while (true) {
                        v15 /* !! */  = (long)(v16 - nv.lkwr("llab", lkwv(int ), (int)46));
lbl103:
                        // 2 sources

                        switch ((int)v15 /* !! */ ) {
                            case -1157241189: {
                                v16 = nv.lkwr("llac", lkwv(int ), (int)47);
                                continue block63;
                            }
                            case 1281849516: {
                                v16 = nv.lkwr("llad", lkwv(int ), (int)48);
                                continue block63;
                            }
                            case 1637199440: {
                                break block63;
                            }
                        }
                        break;
                    }
                    v17 = v14.method_7909();
                    v18 /* !! */  = nv.ud;
                    if (true) ** GOTO lbl117
                    block64: while (true) {
                        v18 /* !! */  = (long)(nv.lkwr("llaf", lkwv(int ), (int)50) - nv.lkwr("llae", lkwv(int ), (int)49));
lbl117:
                        // 2 sources

                        switch ((int)v18 /* !! */ ) {
                            case 59928098: {
                                continue block64;
                            }
                            case 1637199440: {
                                break block64;
                            }
                        }
                        break;
                    }
                    if (v17 != class_1802.field_8833) break block88;
                    if (var1_2 || var1_2) ** GOTO lbl29
                    return (int)var0_3;
                }
                if (var1_2 || var1_2) ** GOTO lbl29
                ++var0_3;
                if (var1_2) ** GOTO lbl29
            } while (!var3);
            throw null;
        }
        if (!var1_2 && !var1_2) ** break;
        ** while (true)
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        block29 : switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return (int)nv.lkwr("llag", lkwo(int ), (int)38);
            }
            case 0: {
                var2_1 /* !! */  = (int)nv.lkwr("llah", lkwo(int ), (int)39);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 1: {
                var2_1 /* !! */  = (int)nv.lkwr("llai", lkwo(int ), (int)40);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 2: {
                var2_1 /* !! */  = (int)nv.lkwr("llaj", lkwo(int ), (int)41);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 3: {
                var2_1 /* !! */  = (int)nv.lkwr("llak", lkwo(int ), (int)42);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl158:
            // 2 sources

            case 4: {
                do {
                    var2_1 /* !! */  = (int)nv.lkwr("llal", lkwo(int ), (int)43);
                } while (!var3);
                throw null;
            }
            case 5: {
                var2_1 /* !! */  = (int)nv.lkwr("llam", lkwo(int ), (int)44);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl168:
            // 2 sources

            case 6: {
                do {
                    var2_1 /* !! */  = (int)nv.lkwr("llan", lkwo(int ), (int)45);
                } while (!var3);
                throw null;
            }
lbl173:
            // 4 sources

            case 7: {
                var2_1 /* !! */  = (int)nv.lkwr("llao", lkwo(int ), (int)46);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 8: {
                var2_1 /* !! */  = (int)nv.lkwr("llap", lkwo(int ), (int)47);
                if (var3) {
                    throw null;
                }
            }
lbl182:
            // 4 sources

            case 9: {
                var2_1 /* !! */  = (int)nv.lkwr("llaq", lkwo(int ), (int)48);
                if (!var3) ** GOTO lbl173
                throw null;
            }
lbl186:
            // 2 sources

            case 10: {
                var2_1 /* !! */  = (int)nv.lkwr("llar", lkwo(int ), (int)49);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl191:
            // 2 sources

            case 11: {
                var2_1 /* !! */  = (int)nv.lkwr("llas", lkwo(int ), (int)50);
                if (var3) {
                    throw null;
                }
            }
            case 12: {
                do {
                    var2_1 /* !! */  = (int)nv.lkwr("llat", lkwo(int ), (int)51);
                } while (!var3);
                throw null;
            }
            case 13: {
                var2_1 /* !! */  = (int)nv.lkwr("llau", lkwo(int ), (int)52);
                if (var3) {
                    throw null;
                }
            }
lbl204:
            // 5 sources

            case 14: {
                var2_1 /* !! */  = (int)nv.lkwr("llav", lkwo(int ), (int)53);
                if (var3) {
                    throw null;
                }
            }
            case 15: {
                do {
                    var2_1 /* !! */  = (int)nv.lkwr("llaw", lkwo(int ), (int)54);
                } while (!var3);
                throw null;
            }
            case 16: {
                do {
                    var2_1 /* !! */  = (int)nv.lkwr("llax", lkwo(int ), (int)55);
                } while (!var3);
                throw null;
            }
            case 17: {
                var2_1 /* !! */  = (int)nv.lkwr("llay", lkwo(int ), (int)56);
                if (!var3) ** GOTO lbl158
                throw null;
            }
            case 18: {
                var2_1 /* !! */  = (int)nv.lkwr("llaz", lkwo(int ), (int)57);
                if (!var3) ** GOTO lbl168
                throw null;
            }
            case 19: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)nv.lkwr("llba", lkwo(int ), (int)58);
                    if (!var3) break block29;
                    throw null;
                }
            }
            case 20: 
        }
        var2_1 /* !! */  = (int)nv.lkwr("llbb", lkwo(int ), (int)59);
        ** while (!var3)
lbl234:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void loiy() {
        nv.lkwq[400] = 1930226042;
        nv.lkwq[401] = -1903589366;
        nv.lkwq[402] = 1485156877;
        nv.lkwq[403] = 1237796236;
        nv.lkwq[404] = 705848832;
        nv.lkwq[405] = -1766103169;
        nv.lkwq[406] = -397791137;
        nv.lkwq[407] = 1715014344;
        nv.lkwq[408] = 165496345;
        nv.lkwq[409] = -1936103921;
        nv.lkwq[410] = 1686075031;
        nv.lkwq[411] = -1389531790;
        nv.lkwq[412] = -1225847383;
        nv.lkwq[413] = -822420426;
        nv.lkwq[414] = -324597265;
        nv.lkwq[415] = 1203904224;
        nv.lkwq[416] = -2029832729;
        nv.lkwq[417] = -552836508;
        nv.lkwq[418] = 483741512;
        nv.lkwq[419] = 409174341;
        nv.lkwq[420] = -1278777517;
        nv.lkwq[421] = -2118011425;
        nv.lkwq[422] = 1493489725;
        nv.lkwq[423] = 183791922;
        nv.lkwq[424] = 2022235879;
        nv.lkwq[425] = -1887008793;
        nv.lkwq[426] = 1118367093;
        nv.lkwq[427] = 703243104;
        nv.lkwq[428] = -197758324;
        nv.lkwq[429] = -1307927782;
        nv.lkwq[430] = -1154618823;
        nv.lkwq[431] = -978543956;
        nv.lkwq[432] = -1692800817;
        nv.lkwq[433] = 1189597977;
        nv.lkwq[434] = 971717958;
        nv.lkwq[435] = 348813922;
        nv.lkwq[436] = 1252169684;
        nv.lkwq[437] = -123266452;
        nv.lkwq[438] = -777501;
        nv.lkwq[439] = -1384433475;
        nv.lkwq[440] = -2000257142;
        nv.lkwq[441] = 949174946;
        nv.lkwq[442] = 1165061172;
        nv.lkwq[443] = 391902638;
        nv.lkwq[444] = 1864258336;
        nv.lkwq[445] = -652787012;
        nv.lkwq[446] = -603985968;
        nv.lkwq[447] = -2146993700;
        nv.lkwq[448] = 993273271;
        nv.lkwq[449] = 2086107083;
        nv.lkwq[450] = 1722351794;
        nv.lkwq[451] = -824496342;
        nv.lkwq[452] = -2068244743;
        nv.lkwq[453] = 1910160684;
        nv.lkwq[454] = 1425082183;
        nv.lkwq[455] = -1961217968;
        nv.lkwq[456] = -1682243477;
        nv.lkwq[457] = 362926527;
        nv.lkwq[458] = -109792296;
        nv.lkwq[459] = 1616000745;
        nv.lkwq[460] = 496245391;
        nv.lkwq[461] = 1277749554;
        nv.lkwq[462] = -340119500;
        nv.lkwq[463] = 2076824263;
        nv.lkwq[464] = -97004104;
        nv.lkwq[465] = -1593634111;
        nv.lkwq[466] = -1120662889;
        nv.lkwq[467] = -1561675318;
        nv.lkwq[468] = 867279924;
        nv.lkwq[469] = 79796565;
        nv.lkwq[470] = -1632079889;
        nv.lkwq[471] = -503392408;
        nv.lkwq[472] = -1679799777;
        nv.lkwq[473] = 2128464281;
        nv.lkwq[474] = 1874866433;
        nv.lkwq[475] = 776519186;
        nv.lkwq[476] = 1569936544;
        nv.lkwq[477] = -1006866248;
        nv.lkwq[478] = -345344485;
        nv.lkwq[479] = 156813782;
        nv.lkwq[480] = -1335278996;
        nv.lkwq[481] = 1338010500;
        nv.lkwq[482] = -657972921;
        nv.lkwq[483] = 413908331;
        nv.lkwq[484] = -757938725;
        nv.lkwq[485] = -1666562812;
        nv.lkwq[486] = 1694840965;
        nv.lkwq[487] = 1971218627;
        nv.lkwq[488] = 255966134;
        nv.lkwq[489] = -1583601966;
        nv.lkwq[490] = -1448563818;
        nv.lkwq[491] = 1495358536;
        nv.lkwq[492] = -1987340499;
        nv.lkwq[493] = -827389955;
        nv.lkwq[494] = -844487913;
        nv.lkwq[495] = 163449960;
        nv.lkwq[496] = 1651644685;
        nv.lkwq[497] = 843852115;
        nv.lkwq[498] = 2023999026;
        nv.lkwq[499] = -149016829;
    }

    private static /* synthetic */ void loiz() {
        nv.lkwq[500] = -1381445319;
        nv.lkwq[501] = 1945040522;
        nv.lkwq[502] = -802267589;
        nv.lkwq[503] = -592611051;
        nv.lkwq[504] = 1663091287;
        nv.lkwq[505] = -1206679241;
        nv.lkwq[506] = -1016114981;
        nv.lkwq[507] = 1941054076;
        nv.lkwq[508] = 1762891610;
        nv.lkwq[509] = 444653145;
        nv.lkwq[510] = -1153268903;
        nv.lkwq[511] = -1392106685;
        nv.lkwq[512] = 2038973926;
        nv.lkwq[513] = -1103745314;
        nv.lkwq[514] = 97429171;
        nv.lkwq[515] = 1811437281;
        nv.lkwq[516] = -1614260244;
        nv.lkwq[517] = 181879719;
        nv.lkwq[518] = -493086608;
        nv.lkwq[519] = -2138565006;
        nv.lkwq[520] = -818393209;
        nv.lkwq[521] = 269157037;
        nv.lkwq[522] = -66669170;
        nv.lkwq[523] = -1018172470;
        nv.lkwq[524] = 1321559874;
        nv.lkwq[525] = -1525136591;
        nv.lkwq[526] = -201286529;
        nv.lkwq[527] = 1644382529;
        nv.lkwq[528] = 1637495229;
        nv.lkwq[529] = 1712519821;
        nv.lkwq[530] = -861313171;
        nv.lkwq[531] = -372687585;
        nv.lkwq[532] = 803319432;
        nv.lkwq[533] = -1230546034;
        nv.lkwq[534] = -625844434;
        nv.lkwq[535] = 1337539145;
        nv.lkwq[536] = 1461288885;
        nv.lkwq[537] = 1325653411;
        nv.lkwq[538] = -352827069;
        nv.lkwq[539] = -200104765;
        nv.lkwq[540] = 1714896116;
        nv.lkwq[541] = 1502487933;
        nv.lkwq[542] = 747809654;
        nv.lkwq[543] = 1003342502;
        nv.lkwq[544] = 588692257;
        nv.lkwq[545] = 1378846612;
        nv.lkwq[546] = 1703477366;
        nv.lkwq[547] = 1284650600;
        nv.lkwq[548] = 940421658;
        nv.lkwq[549] = -1114570445;
        nv.lkwq[550] = 515932490;
        nv.lkwq[551] = 2111784962;
        nv.lkwq[552] = 861764453;
        nv.lkwq[553] = 1025721193;
        nv.lkwq[554] = 1138206411;
        nv.lkwq[555] = -1963969789;
        nv.lkwq[556] = -890428694;
        nv.lkwq[557] = 931704682;
        nv.lkwq[558] = -1652348678;
        nv.lkwq[559] = -876485482;
        nv.lkwq[560] = 838714657;
        nv.lkwq[561] = 466896479;
        nv.lkwq[562] = -519764584;
        nv.lkwq[563] = 900009361;
        nv.lkwq[564] = -1895013025;
        nv.lkwq[565] = -476224072;
        nv.lkwq[566] = 2111720969;
        nv.lkwq[567] = -292740507;
        nv.lkwq[568] = 563799899;
        nv.lkwq[569] = 558868354;
        nv.lkwq[570] = -499838197;
        nv.lkwq[571] = 735354607;
        nv.lkwq[572] = -239480056;
        nv.lkwq[573] = -970370654;
        nv.lkwq[574] = 59033945;
        nv.lkwq[575] = -86597516;
        nv.lkwq[576] = 1264314216;
        nv.lkwq[577] = 1366891318;
        nv.lkwq[578] = -2057829314;
        nv.lkwq[579] = 1398569722;
        nv.lkwq[580] = -83495000;
        nv.lkwq[581] = 1173157897;
        nv.lkwq[582] = 521599801;
        nv.lkwq[583] = -1175529233;
        nv.lkwq[584] = -1569220592;
        nv.lkwq[585] = 702137589;
        nv.lkwq[586] = -726908930;
        nv.lkwq[587] = 422124241;
        nv.lkwq[588] = 12407435;
        nv.lkwq[589] = 1867859320;
        nv.lkwq[590] = 1269711874;
        nv.lkwq[591] = -322059320;
        nv.lkwq[592] = 1242564605;
        nv.lkwq[593] = 1349894631;
        nv.lkwq[594] = 1600200839;
        nv.lkwq[595] = 1118621024;
        nv.lkwq[596] = -1933804;
        nv.lkwq[597] = -2026860643;
        nv.lkwq[598] = -838015767;
        nv.lkwq[599] = 1671890198;
    }

    private static /* synthetic */ void lojt() {
        nv.lkwx[100] = 1057553861719453628L;
        nv.lkwx[101] = -3868066480355459315L;
        nv.lkwx[102] = -535092514217289476L;
        nv.lkwx[103] = -857481259277943424L;
        nv.lkwx[104] = -5714550531497020760L;
        nv.lkwx[105] = 6620725013033726841L;
        nv.lkwx[106] = 5293643556526457833L;
        nv.lkwx[107] = 5298805970903366742L;
        nv.lkwx[108] = -1206558975510609327L;
        nv.lkwx[109] = -54048942843922015L;
        nv.lkwx[110] = -2176491310718348358L;
        nv.lkwx[111] = 269238522119658087L;
        nv.lkwx[112] = -7928244326720232327L;
        nv.lkwx[113] = 4394352445562561249L;
        nv.lkwx[114] = -726006524496491811L;
        nv.lkwx[115] = 5720042042089881612L;
        nv.lkwx[116] = 1856962550024970131L;
        nv.lkwx[117] = 1790162361473240869L;
        nv.lkwx[118] = 5334978498086949077L;
        nv.lkwx[119] = -7903926632976235901L;
        nv.lkwx[120] = 5088620301397775223L;
        nv.lkwx[121] = -6122077646946214740L;
        nv.lkwx[122] = -5528875685265090260L;
        nv.lkwx[123] = -5016807184262229116L;
        nv.lkwx[124] = -2577103227564648868L;
        nv.lkwx[125] = -7306571346072260079L;
        nv.lkwx[126] = -7285415782565315319L;
        nv.lkwx[127] = 2975691839028271796L;
        nv.lkwx[128] = 2522965401201650175L;
        nv.lkwx[129] = -1531880720410535277L;
        nv.lkwx[130] = -419026359605710013L;
        nv.lkwx[131] = 6908224031714736260L;
        nv.lkwx[132] = 1084514232451510897L;
        nv.lkwx[133] = -5304469300581064018L;
        nv.lkwx[134] = -2169696388057034576L;
        nv.lkwx[135] = 8954871593057210242L;
        nv.lkwx[136] = -3841630017446028026L;
        nv.lkwx[137] = -8594205676667654082L;
        nv.lkwx[138] = 3163617191147634952L;
        nv.lkwx[139] = -8290560642262628501L;
        nv.lkwx[140] = -4691978208620754193L;
        nv.lkwx[141] = 8381003803413720495L;
        nv.lkwx[142] = 4149094476827994286L;
        nv.lkwx[143] = 6947544528171979091L;
        nv.lkwx[144] = -2386106402789308959L;
        nv.lkwx[145] = 8412628493922746647L;
        nv.lkwx[146] = -8532246435437181983L;
        nv.lkwx[147] = 3531181665961017539L;
        nv.lkwx[148] = -3408990165182709251L;
        nv.lkwx[149] = -5333671674521830020L;
        nv.lkwx[150] = -1552285299471498407L;
        nv.lkwx[151] = 5424599007715789435L;
        nv.lkwx[152] = -6599311057573758345L;
        nv.lkwx[153] = 6353880052890634105L;
        nv.lkwx[154] = 7463875344809327718L;
        nv.lkwx[155] = 6604483376476288355L;
        nv.lkwx[156] = 2658417774234794049L;
        nv.lkwx[157] = 1176161746300275032L;
        nv.lkwx[158] = -7520897965889379541L;
        nv.lkwx[159] = 5107955548934308997L;
        nv.lkwx[160] = 4253399872692846274L;
        nv.lkwx[161] = -818954363929824281L;
        nv.lkwx[162] = 7972322268377709212L;
        nv.lkwx[163] = 6287796940185081L;
        nv.lkwx[164] = -1837460635350672072L;
        nv.lkwx[165] = 5246846951638677585L;
        nv.lkwx[166] = -2905774062147366492L;
        nv.lkwx[167] = 5155566726284728677L;
        nv.lkwx[168] = 1264937839792089049L;
        nv.lkwx[169] = 6816890534499916435L;
        nv.lkwx[170] = -6388865415955217726L;
        nv.lkwx[171] = 8221550603510903663L;
        nv.lkwx[172] = -1799822302281025898L;
        nv.lkwx[173] = -5768160422469894510L;
        nv.lkwx[174] = -7782201011055826062L;
        nv.lkwx[175] = 204391799726975019L;
        nv.lkwx[176] = -8954135585117058619L;
        nv.lkwx[177] = -4444392924042835730L;
        nv.lkwx[178] = 5891995594328474659L;
        nv.lkwx[179] = 3712811315189407670L;
        nv.lkwx[180] = -4352288737631426232L;
        nv.lkwx[181] = 7594013955977809127L;
        nv.lkwx[182] = 7222257103598911252L;
        nv.lkwx[183] = 8697159998562121166L;
        nv.lkwx[184] = -1766012701774330689L;
        nv.lkwx[185] = 5935435324182088332L;
        nv.lkwx[186] = -3093500370877243540L;
        nv.lkwx[187] = 7300533461588282506L;
        nv.lkwx[188] = -5885525967634097417L;
        nv.lkwx[189] = 1195708121934891181L;
        nv.lkwx[190] = -4430655107096628075L;
        nv.lkwx[191] = -4549029125320245612L;
        nv.lkwx[192] = -6936024544740469289L;
        nv.lkwx[193] = 5311071900588914574L;
        nv.lkwx[194] = 1696835923291614381L;
        nv.lkwx[195] = -859106749491169143L;
        nv.lkwx[196] = 3143666341707099091L;
        nv.lkwx[197] = -7279852986707294154L;
        nv.lkwx[198] = 2533121106283470800L;
        nv.lkwx[199] = 6520258713041780602L;
    }

    private static /* synthetic */ void loih() {
        nv.lkwp[0] = -1971552612;
        nv.lkwp[1] = 93298204;
        nv.lkwp[2] = 1909041239;
        nv.lkwp[3] = 1521064835;
        nv.lkwp[4] = 384477122;
        nv.lkwp[5] = 2023920109;
        nv.lkwp[6] = -616417681;
        nv.lkwp[7] = -253759386;
        nv.lkwp[8] = 1742538214;
        nv.lkwp[9] = 1743922148;
        nv.lkwp[10] = -953624587;
        nv.lkwp[11] = -657704260;
        nv.lkwp[12] = 1093506674;
        nv.lkwp[13] = 360933055;
        nv.lkwp[14] = 1715148300;
        nv.lkwp[15] = -1489533890;
        nv.lkwp[16] = 1674009274;
        nv.lkwp[17] = 394226665;
        nv.lkwp[18] = 1363056748;
        nv.lkwp[19] = -2067412161;
        nv.lkwp[20] = 408732155;
        nv.lkwp[21] = -1420596475;
        nv.lkwp[22] = -1981230187;
        nv.lkwp[23] = -288940805;
        nv.lkwp[24] = -523558540;
        nv.lkwp[25] = -10520345;
        nv.lkwp[26] = 1051393485;
        nv.lkwp[27] = 1643864507;
        nv.lkwp[28] = -907760263;
        nv.lkwp[29] = 353112731;
        nv.lkwp[30] = -852395640;
        nv.lkwp[31] = 525944380;
        nv.lkwp[32] = -784046365;
        nv.lkwp[33] = 1315592918;
        nv.lkwp[34] = -1625862229;
        nv.lkwp[35] = -595064299;
        nv.lkwp[36] = 1100600432;
        nv.lkwp[37] = 1933142625;
        nv.lkwp[38] = 1993642244;
        nv.lkwp[39] = -369919052;
        nv.lkwp[40] = -698080276;
        nv.lkwp[41] = 635768151;
        nv.lkwp[42] = -577891321;
        nv.lkwp[43] = -1052592341;
        nv.lkwp[44] = -1985607317;
        nv.lkwp[45] = -570978669;
        nv.lkwp[46] = -2094723251;
        nv.lkwp[47] = 1936081779;
        nv.lkwp[48] = -798248529;
        nv.lkwp[49] = -1318540085;
        nv.lkwp[50] = 1436894323;
        nv.lkwp[51] = -1818858236;
        nv.lkwp[52] = 1225922663;
        nv.lkwp[53] = -1492580545;
        nv.lkwp[54] = -1716093940;
        nv.lkwp[55] = 559317662;
        nv.lkwp[56] = 725110727;
        nv.lkwp[57] = -1931638084;
        nv.lkwp[58] = 276045584;
        nv.lkwp[59] = -1916869122;
        nv.lkwp[60] = -602966987;
        nv.lkwp[61] = -1213495349;
        nv.lkwp[62] = -2139666826;
        nv.lkwp[63] = 1716556141;
        nv.lkwp[64] = 886538556;
        nv.lkwp[65] = 1885338652;
        nv.lkwp[66] = -260772133;
        nv.lkwp[67] = 1240554991;
        nv.lkwp[68] = -512608057;
        nv.lkwp[69] = 1327760585;
        nv.lkwp[70] = -2006355786;
        nv.lkwp[71] = 1018795501;
        nv.lkwp[72] = -961453148;
        nv.lkwp[73] = 108890613;
        nv.lkwp[74] = 2041578494;
        nv.lkwp[75] = -2000841738;
        nv.lkwp[76] = -1170823432;
        nv.lkwp[77] = -586227043;
        nv.lkwp[78] = 1996778521;
        nv.lkwp[79] = -1331933302;
        nv.lkwp[80] = 1833638262;
        nv.lkwp[81] = -1166238964;
        nv.lkwp[82] = 27518538;
        nv.lkwp[83] = -221309919;
        nv.lkwp[84] = -1919753492;
        nv.lkwp[85] = 810214551;
        nv.lkwp[86] = -1708354137;
        nv.lkwp[87] = -852708499;
        nv.lkwp[88] = 695988228;
        nv.lkwp[89] = 1386535554;
        nv.lkwp[90] = -1429089000;
        nv.lkwp[91] = 419921030;
        nv.lkwp[92] = -1436120133;
        nv.lkwp[93] = 1227101106;
        nv.lkwp[94] = 1561524336;
        nv.lkwp[95] = -975696436;
        nv.lkwp[96] = -59106809;
        nv.lkwp[97] = -1346029993;
        nv.lkwp[98] = 464764695;
        nv.lkwp[99] = -232159940;
    }

    private static /* synthetic */ void loii() {
        nv.lkwp[100] = -2145825532;
        nv.lkwp[101] = 1034646213;
        nv.lkwp[102] = -331620915;
        nv.lkwp[103] = -731983354;
        nv.lkwp[104] = -1266285356;
        nv.lkwp[105] = 856952818;
        nv.lkwp[106] = 971830035;
        nv.lkwp[107] = 2108049983;
        nv.lkwp[108] = -1294728700;
        nv.lkwp[109] = 1113861572;
        nv.lkwp[110] = -981327821;
        nv.lkwp[111] = -1423306444;
        nv.lkwp[112] = -1845860468;
        nv.lkwp[113] = -1861686385;
        nv.lkwp[114] = 1559049268;
        nv.lkwp[115] = 769770386;
        nv.lkwp[116] = -388130302;
        nv.lkwp[117] = -1913336735;
        nv.lkwp[118] = 1344860557;
        nv.lkwp[119] = 1457630761;
        nv.lkwp[120] = 27399419;
        nv.lkwp[121] = -1664003281;
        nv.lkwp[122] = -1891761568;
        nv.lkwp[123] = 576669049;
        nv.lkwp[124] = -1972487409;
        nv.lkwp[125] = -255732007;
        nv.lkwp[126] = 1519109720;
        nv.lkwp[127] = 1087251541;
        nv.lkwp[128] = 1612073802;
        nv.lkwp[129] = 712049878;
        nv.lkwp[130] = -87787567;
        nv.lkwp[131] = 421623248;
        nv.lkwp[132] = -1511904649;
        nv.lkwp[133] = 1831450106;
        nv.lkwp[134] = -414751771;
        nv.lkwp[135] = -1343728574;
        nv.lkwp[136] = 1134809688;
        nv.lkwp[137] = 2142087558;
        nv.lkwp[138] = -649250370;
        nv.lkwp[139] = -1907046320;
        nv.lkwp[140] = -413873543;
        nv.lkwp[141] = 129197779;
        nv.lkwp[142] = -641083947;
        nv.lkwp[143] = -1301954259;
        nv.lkwp[144] = -1657458710;
        nv.lkwp[145] = -2074382658;
        nv.lkwp[146] = -1007540672;
        nv.lkwp[147] = 1852621123;
        nv.lkwp[148] = -2028265032;
        nv.lkwp[149] = -499643733;
        nv.lkwp[150] = -986487820;
        nv.lkwp[151] = -868559294;
        nv.lkwp[152] = -1430927120;
        nv.lkwp[153] = 39902038;
        nv.lkwp[154] = 1330483844;
        nv.lkwp[155] = 871369615;
        nv.lkwp[156] = -421053391;
        nv.lkwp[157] = 1730299514;
        nv.lkwp[158] = -1249320970;
        nv.lkwp[159] = 2120225449;
        nv.lkwp[160] = 995571894;
        nv.lkwp[161] = -561678426;
        nv.lkwp[162] = 1625957937;
        nv.lkwp[163] = -523410409;
        nv.lkwp[164] = -791505213;
        nv.lkwp[165] = -378531806;
        nv.lkwp[166] = -680022164;
        nv.lkwp[167] = -997154345;
        nv.lkwp[168] = -1985817697;
        nv.lkwp[169] = 1867847555;
        nv.lkwp[170] = -1079367447;
        nv.lkwp[171] = -287527084;
        nv.lkwp[172] = 1862694667;
        nv.lkwp[173] = 608383092;
        nv.lkwp[174] = 1159850855;
        nv.lkwp[175] = 847345262;
        nv.lkwp[176] = 974078358;
        nv.lkwp[177] = -471628011;
        nv.lkwp[178] = 1054341197;
        nv.lkwp[179] = 1492540304;
        nv.lkwp[180] = 1317687876;
        nv.lkwp[181] = -339644813;
        nv.lkwp[182] = 332299345;
        nv.lkwp[183] = 400644762;
        nv.lkwp[184] = 979327221;
        nv.lkwp[185] = -1567076537;
        nv.lkwp[186] = -1826123802;
        nv.lkwp[187] = -184491039;
        nv.lkwp[188] = -296203239;
        nv.lkwp[189] = 249694975;
        nv.lkwp[190] = -1287809699;
        nv.lkwp[191] = -1371607458;
        nv.lkwp[192] = 354661750;
        nv.lkwp[193] = 1422843762;
        nv.lkwp[194] = -1428757510;
        nv.lkwp[195] = 804190387;
        nv.lkwp[196] = -800641697;
        nv.lkwp[197] = 367753375;
        nv.lkwp[198] = -1909094023;
        nv.lkwp[199] = 45446016;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$findSlot$4(class_1792 var0, Predicate var1_1, class_1735 var2_2) {
        block54: {
            v0 /* !! */  = nv.ud;
            if (true) ** GOTO lbl5
            block36: while (true) {
                v0 /* !! */  = (long)(v1 - nv.lkwr("lodo", lkwv(int ), (int)973));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -555304007: {
                        v1 = nv.lkwr("lodp", lkwv(int ), (int)974);
                        continue block36;
                    }
                    case 1572107605: {
                        v1 = nv.lkwr("lodq", lkwv(int ), (int)975);
                        continue block36;
                    }
                    case 1637199440: {
                        break block36;
                    }
                }
                break;
            }
            var5_3 = nv.c;
            v2 /* !! */  = nv.ud;
            if (true) ** GOTO lbl19
            block37: while (true) {
                v2 /* !! */  = (long)(v3 - nv.lkwr("lodr", lkwv(int ), (int)976));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1298192633: {
                        v3 = nv.lkwr("lods", lkwv(int ), (int)977);
                        continue block37;
                    }
                    case -918845403: {
                        v3 = nv.lkwr("lodt", lkwv(int ), (int)978);
                        continue block37;
                    }
                    case 1637199440: {
                        break block37;
                    }
                }
                break;
            }
            var4_4 /* !! */  = nv.b;
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lodu", lkwv(int ), (int)979)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == nv.lkwr("lodv", lkwo(int ), (int)1230)) break;
                v4 /* !! */  = (long)nv.lkwr("lodw", lkwo(int ), (int)1231);
            }
            var3_5 = nv.a;
            if (var5_3) {
                throw null;
lbl38:
                // 5 sources

                return (boolean)nv.lkwr("lodx", lkwo(int ), (int)1232);
            }
            if (var3_5 || var3_5) ** GOTO lbl38
            v5 /* !! */  = nv.ud;
            if (true) ** GOTO lbl45
            block40: while (true) {
                v5 /* !! */  = (long)(v6 - nv.lkwr("lody", lkwv(int ), (int)980));
lbl45:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case 379756727: {
                        v6 = nv.lkwr("lodz", lkwv(int ), (int)981);
                        continue block40;
                    }
                    case 1252981877: {
                        v6 = nv.lkwr("loea", lkwv(int ), (int)982);
                        continue block40;
                    }
                    case 1637199440: {
                        break block40;
                    }
                    case 1826314048: {
                        v6 = nv.lkwr("loeb", lkwv(int ), (int)983);
                        continue block40;
                    }
                }
                break;
            }
            v7 = var2_2.method_7677();
            v8 /* !! */  = nv.ud;
            if (true) ** GOTO lbl62
            block41: while (true) {
                v8 /* !! */  = (long)(v9 - nv.lkwr("loec", lkwv(int ), (int)984));
lbl62:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case 1616143443: {
                        v9 = nv.lkwr("loed", lkwv(int ), (int)985);
                        continue block41;
                    }
                    case 1637199440: {
                        break block41;
                    }
                    case 1656531719: {
                        v9 = nv.lkwr("loee", lkwv(int ), (int)986);
                        continue block41;
                    }
                }
                break;
            }
            if (v7.method_7909() != var0) break block54;
            if (var3_5) ** GOTO lbl38
            v10 /* !! */  = nv.ud;
            if (true) ** GOTO lbl77
            block42: while (true) {
                v10 /* !! */  = (long)(nv.lkwr("loeg", lkwv(int ), (int)988) - nv.lkwr("loef", lkwv(int ), (int)987));
lbl77:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -579439094: {
                        continue block42;
                    }
                    case 1637199440: {
                        break block42;
                    }
                }
                break;
            }
            if (!var1_1.test(var2_2)) break block54;
            if (var3_5) ** GOTO lbl38
            v11 = nv.lkwr("loeh", lkwo(int ), (int)1233);
            if (var5_3) {
                throw null;
            }
            ** GOTO lbl96
        }
        if (var3_5) ** GOTO lbl38
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        block25 : switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var3_5) ** break;
                ** continue;
                v11 = nv.lkwr("loei", lkwo(int ), (int)1234);
lbl96:
                // 2 sources

                return (boolean)v11;
            }
            case 0: {
                var4_4 /* !! */  = (int)nv.lkwr("loej", lkwo(int ), (int)1235);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl125
            }
lbl102:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)nv.lkwr("loek", lkwo(int ), (int)1236);
                    if (!var5_3) break block25;
                    throw null;
                }
            }
            case 2: {
                var4_4 /* !! */  = (int)nv.lkwr("loel", lkwo(int ), (int)1237);
                if (var5_3) {
                    throw null;
                }
            }
lbl111:
            // 4 sources

            case 3: {
                do {
                    var4_4 /* !! */  = (int)nv.lkwr("loem", lkwo(int ), (int)1238);
                } while (!var5_3);
                throw null;
            }
lbl116:
            // 2 sources

            case 4: {
                do {
                    var4_4 /* !! */  = (int)nv.lkwr("loen", lkwo(int ), (int)1239);
                } while (!var5_3);
                throw null;
            }
            case 5: {
                var4_4 /* !! */  = (int)nv.lkwr("loeo", lkwo(int ), (int)1240);
                if (!var5_3) ** GOTO lbl116
                throw null;
            }
lbl125:
            // 2 sources

            case 6: {
                var4_4 /* !! */  = (int)nv.lkwr("loep", lkwo(int ), (int)1241);
                if (!var5_3) ** GOTO lbl102
                throw null;
            }
            case 7: {
                var4_4 /* !! */  = (int)nv.lkwr("loeq", lkwo(int ), (int)1242);
                if (!var5_3) ** GOTO lbl111
                throw null;
            }
            case 8: 
        }
        var4_4 /* !! */  = (int)nv.lkwr("loer", lkwo(int ), (int)1243);
        ** while (!var5_3)
lbl136:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void silentUseItem(class_1792 var0, float var1_1, float var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lnku", lkwv(int ), (int)728)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nv.lkwr("lnkv", lkwo(int ), (int)987)) break;
            v0 /* !! */  = (long)nv.lkwr("lnkw", lkwo(int ), (int)988);
        }
        var8_3 = nv.c;
        v1 /* !! */  = nv.ud;
        if (true) ** GOTO lbl11
        block60: while (true) {
            v1 /* !! */  = (long)(v2 - nv.lkwr("lnkx", lkwv(int ), (int)729));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1438303647: {
                    v2 = nv.lkwr("lnky", lkwv(int ), (int)730);
                    continue block60;
                }
                case -1131462701: {
                    v2 = nv.lkwr("lnkz", lkwv(int ), (int)731);
                    continue block60;
                }
                case 701303472: {
                    v2 = nv.lkwr("lnla", lkwv(int ), (int)732);
                    continue block60;
                }
                case 1637199440: {
                    break block60;
                }
            }
            break;
        }
        var7_4 /* !! */  = nv.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lnlb", lkwv(int ), (int)733)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == nv.lkwr("lnlc", lkwo(int ), (int)989)) break;
            v3 /* !! */  = (long)nv.lkwr("lnld", lkwo(int ), (int)990);
        }
        var6_5 = nv.a;
        if (var8_3) {
            throw null;
lbl32:
            // 14 sources

            return;
        }
        if (var6_5 || var6_5) ** GOTO lbl32
        v4 /* !! */  = nv.ud;
        if (true) ** GOTO lbl39
        block63: while (true) {
            v4 /* !! */  = (long)(nv.lkwr("lnlf", lkwv(int ), (int)735) - nv.lkwr("lnle", lkwv(int ), (int)734));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -218329271: {
                    continue block63;
                }
                case 1637199440: {
                    break block63;
                }
            }
            break;
        }
        v5 /* !! */  = nv.ud;
        if (true) ** GOTO lbl48
        block64: while (true) {
            v5 /* !! */  = (long)(v6 - nv.lkwr("lnlg", lkwv(int ), (int)736));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1007052810: {
                    v6 = nv.lkwr("lnlh", lkwv(int ), (int)737);
                    continue block64;
                }
                case -622639682: {
                    v6 = nv.lkwr("lnli", lkwv(int ), (int)738);
                    continue block64;
                }
                case 1637199440: {
                    break block64;
                }
            }
            break;
        }
        if (nv.mc.field_1724 != null) ** GOTO lbl64
        if (var6_5) ** GOTO lbl32
        if (var7_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_5) ** GOTO lbl32
                return;
            }
lbl64:
            // 1 sources

            if (var6_5 || var6_5) ** GOTO lbl32
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lnlj", lkwv(int ), (int)739)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == nv.lkwr("lnlk", lkwo(int ), (int)991)) break;
                v7 /* !! */  = (long)nv.lkwr("lnll", lkwo(int ), (int)992);
            }
            var3_6 = nv.findItemInHotbar(var0);
            if (var6_5 || var6_5) ** GOTO lbl32
            if (var3_6 == nv.lkwr("lnlm", lkwo(int ), (int)993)) ** GOTO lbl82
            if (var6_5 || var6_5) ** GOTO lbl32
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("lnln", lkwv(int ), (int)740)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == nv.lkwr("lnlo", lkwo(int ), (int)994)) break;
                v8 /* !! */  = (long)nv.lkwr("lnlp", lkwo(int ), (int)995);
            }
            nv.silentUseHotbarItem(var3_6, var1_1, var2_2);
            if (var6_5 || var6_5) ** GOTO lbl32
            return;
lbl82:
            // 1 sources

            if (var6_5 || var6_5) ** GOTO lbl32
            v9 /* !! */  = nv.ud;
            if (true) ** GOTO lbl87
            block67: while (true) {
                v9 /* !! */  = (long)(nv.lkwr("lnlr", lkwv(int ), (int)742) - nv.lkwr("lnlq", lkwv(int ), (int)741));
lbl87:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -522150961: {
                        continue block67;
                    }
                    case 1637199440: {
                        break block67;
                    }
                }
                break;
            }
            var4_7 = nv.findItemInInventory(var0);
            if (var6_5 || var6_5) ** GOTO lbl32
            if (var4_7 == nv.lkwr("lnls", lkwo(int ), (int)996)) ** GOTO lbl132
            if (var6_5 || var6_5) ** GOTO lbl32
            v10 /* !! */  = nv.ud;
            if (true) ** GOTO lbl100
            block68: while (true) {
                v10 /* !! */  = (long)(nv.lkwr("lnlu", lkwv(int ), (int)744) - nv.lkwr("lnlt", lkwv(int ), (int)743));
lbl100:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -464207740: {
                        continue block68;
                    }
                    case 1637199440: {
                        break block68;
                    }
                }
                break;
            }
            var5_8 = nv.wrapSlot(var4_7);
            if (var6_5 || var6_5) ** GOTO lbl32
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("lnlv", lkwv(int ), (int)745)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == nv.lkwr("lnlw", lkwo(int ), (int)997)) break;
                v11 /* !! */  = (long)nv.lkwr("lnlx", lkwo(int ), (int)998);
            }
            nv.silentSwapUseAndReturn(var5_8, var1_1, var2_2);
            if (var6_5 || var6_5) ** GOTO lbl32
            v12 /* !! */  = nv.ud;
            if (true) ** GOTO lbl118
            block70: while (true) {
                v12 /* !! */  = (long)(v13 - nv.lkwr("lnly", lkwv(int ), (int)746));
lbl118:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -1444408645: {
                        v13 = nv.lkwr("lnlz", lkwv(int ), (int)747);
                        continue block70;
                    }
                    case 96249768: {
                        v13 = nv.lkwr("lnma", lkwv(int ), (int)748);
                        continue block70;
                    }
                    case 1455567837: {
                        v13 = nv.lkwr("lnmb", lkwv(int ), (int)749);
                        continue block70;
                    }
                    case 1637199440: {
                        break block70;
                    }
                }
                break;
            }
            nv.closeScreen();
            if (var6_5) ** GOTO lbl32
lbl132:
            // 2 sources

            if (!var6_5 && !var6_5) ** break;
            ** continue;
            return;
            case 0: {
                var7_4 /* !! */  = (int)nv.lkwr("lnmc", lkwo(int ), (int)999);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl140:
            // 2 sources

            case 1: {
                var7_4 /* !! */  = (int)nv.lkwr("lnmd", lkwo(int ), (int)1000);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 2: {
                var7_4 /* !! */  = (int)nv.lkwr("lnme", lkwo(int ), (int)1001);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl150:
            // 2 sources

            case 3: {
                var7_4 /* !! */  = (int)nv.lkwr("lnmf", lkwo(int ), (int)1002);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl155:
            // 2 sources

            case 4: {
                var7_4 /* !! */  = (int)nv.lkwr("lnmg", lkwo(int ), (int)1003);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl240
            }
            case 5: {
                var7_4 /* !! */  = (int)nv.lkwr("lnmh", lkwo(int ), (int)1004);
                if (var8_3) {
                    throw null;
                }
            }
            case 6: {
                var7_4 /* !! */  = (int)nv.lkwr("lnmi", lkwo(int ), (int)1005);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 7: {
                var7_4 /* !! */  = (int)nv.lkwr("lnmj", lkwo(int ), (int)1006);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl174:
            // 2 sources

            case 8: {
                var7_4 /* !! */  = (int)nv.lkwr("lnmk", lkwo(int ), (int)1007);
                if (!var8_3) ** GOTO lbl155
                throw null;
            }
lbl178:
            // 2 sources

            case 9: {
                var7_4 /* !! */  = (int)nv.lkwr("lnml", lkwo(int ), (int)1008);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl183:
            // 5 sources

            case 10: {
                var7_4 /* !! */  = (int)nv.lkwr("lnmm", lkwo(int ), (int)1009);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl188:
            // 2 sources

            case 11: {
                var7_4 /* !! */  = (int)nv.lkwr("lnmn", lkwo(int ), (int)1010);
                if (!var8_3) ** GOTO lbl183
                throw null;
            }
            case 12: {
                var7_4 /* !! */  = (int)nv.lkwr("lnmo", lkwo(int ), (int)1011);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl197:
            // 5 sources

            case 13: {
                var7_4 /* !! */  = (int)nv.lkwr("lnmp", lkwo(int ), (int)1012);
                if (!var8_3) ** GOTO lbl178
                throw null;
            }
lbl201:
            // 4 sources

            case 14: {
                var7_4 /* !! */  = (int)nv.lkwr("lnmq", lkwo(int ), (int)1013);
                if (!var8_3) ** GOTO lbl150
                throw null;
            }
            case 15: {
                var7_4 /* !! */  = (int)nv.lkwr("lnmr", lkwo(int ), (int)1014);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl236
            }
            case 16: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_4 /* !! */  = (int)nv.lkwr("lnms", lkwo(int ), (int)1015);
                    if (var8_3) {
                        throw null;
                    }
                    ** GOTO lbl224
                    break;
                }
            }
lbl216:
            // 2 sources

            case 17: {
                var7_4 /* !! */  = (int)nv.lkwr("lnmt", lkwo(int ), (int)1016);
                if (!var8_3) ** GOTO lbl174
                throw null;
            }
            case 18: {
                var7_4 /* !! */  = (int)nv.lkwr("lnmu", lkwo(int ), (int)1017);
                if (!var8_3) ** GOTO lbl197
                throw null;
            }
lbl224:
            // 2 sources

            case 19: {
                var7_4 /* !! */  = (int)nv.lkwr("lnmv", lkwo(int ), (int)1018);
                if (!var8_3) ** GOTO lbl183
                throw null;
            }
lbl228:
            // 3 sources

            case 20: {
                var7_4 /* !! */  = (int)nv.lkwr("lnmw", lkwo(int ), (int)1019);
                if (!var8_3) ** GOTO lbl197
                throw null;
            }
lbl232:
            // 3 sources

            case 21: {
                var7_4 /* !! */  = (int)nv.lkwr("lnmx", lkwo(int ), (int)1020);
                if (!var8_3) ** GOTO lbl183
                throw null;
            }
lbl236:
            // 2 sources

            case 22: {
                var7_4 /* !! */  = (int)nv.lkwr("lnmy", lkwo(int ), (int)1021);
                if (!var8_3) ** GOTO lbl183
                throw null;
            }
lbl240:
            // 2 sources

            case 23: {
                var7_4 /* !! */  = (int)nv.lkwr("lnmz", lkwo(int ), (int)1022);
                if (!var8_3) ** GOTO lbl140
                throw null;
            }
            case 24: {
                var7_4 /* !! */  = (int)nv.lkwr("lnna", lkwo(int ), (int)1023);
                if (!var8_3) ** GOTO lbl201
                throw null;
            }
            case 25: {
                var7_4 /* !! */  = (int)nv.lkwr("lnnb", lkwo(int ), (int)1024);
                if (!var8_3) ** GOTO lbl216
                throw null;
            }
lbl252:
            // 2 sources

            case 26: {
                var7_4 /* !! */  = (int)nv.lkwr("lnnc", lkwo(int ), (int)1025);
                if (!var8_3) ** GOTO lbl201
                throw null;
            }
            case 27: 
        }
        var7_4 /* !! */  = (int)nv.lkwr("lnnd", lkwo(int ), (int)1026);
        ** while (!var8_3)
lbl259:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int findItemInInventory(class_1792 var0) {
        v0 /* !! */  = nv.ud;
        if (true) ** GOTO lbl5
        block53: while (true) {
            v0 /* !! */  = (long)(v1 - nv.lkwr("llpw", lkwv(int ), (int)179));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -835502822: {
                    v1 = nv.lkwr("llpx", lkwv(int ), (int)180);
                    continue block53;
                }
                case -540550814: {
                    v1 = nv.lkwr("llpy", lkwv(int ), (int)181);
                    continue block53;
                }
                case 1637199440: {
                    break block53;
                }
            }
            break;
        }
        var5_1 = nv.c;
        v2 /* !! */  = nv.ud;
        if (true) ** GOTO lbl19
        block54: while (true) {
            v2 /* !! */  = (long)(v3 - nv.lkwr("llpz", lkwv(int ), (int)182));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -67125322: {
                    v3 = nv.lkwr("llqa", lkwv(int ), (int)183);
                    continue block54;
                }
                case 1637199440: {
                    break block54;
                }
                case 1976608912: {
                    v3 = nv.lkwr("llqb", lkwv(int ), (int)184);
                    continue block54;
                }
            }
            break;
        }
        var4_2 /* !! */  = nv.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("llqc", lkwv(int ), (int)185)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == nv.lkwr("llqd", lkwo(int ), (int)316)) break;
            v4 /* !! */  = (long)nv.lkwr("llqe", lkwo(int ), (int)317);
        }
        var3_3 = nv.a;
        if (var5_1) {
            throw null;
lbl37:
            // 12 sources

            return (int)nv.lkwr("llqf", lkwo(int ), (int)318);
        }
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3 || var3_3) ** GOTO lbl37
                v5 /* !! */  = nv.ud;
                if (true) ** GOTO lbl47
                block57: while (true) {
                    v5 /* !! */  = (long)(v6 - nv.lkwr("llqg", lkwv(int ), (int)186));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -559446280: {
                            v6 = nv.lkwr("llqh", lkwv(int ), (int)187);
                            continue block57;
                        }
                        case 1115768514: {
                            v6 = nv.lkwr("llqi", lkwv(int ), (int)188);
                            continue block57;
                        }
                        case 1637199440: {
                            break block57;
                        }
                        case 1981235157: {
                            v6 = nv.lkwr("llqj", lkwv(int ), (int)189);
                            continue block57;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("llqk", lkwv(int ), (int)190)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == nv.lkwr("llql", lkwo(int ), (int)319)) break;
                    v7 /* !! */  = (long)nv.lkwr("llqm", lkwo(int ), (int)320);
                }
                if (nv.mc.field_1724 != null) ** GOTO lbl67
                if (var3_3 || var3_3) ** GOTO lbl37
                return (int)nv.lkwr("llqn", lkwo(int ), (int)321);
lbl67:
                // 1 sources

                if (var3_3 || var3_3) ** GOTO lbl37
                var1_4 = nv.lkwr("llqo", lkwo(int ), (int)322);
                if (var3_3) ** GOTO lbl37
                do {
                    if (var3_3 || var3_3) ** GOTO lbl37
                    if (var1_4 >= nv.lkwr("llqp", lkwo(int ), (int)323)) ** GOTO lbl134
                    if (var3_3 || var3_3) ** GOTO lbl37
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("llqq", lkwv(int ), (int)191)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v8 /* !! */  == nv.lkwr("llqr", lkwo(int ), (int)324)) break;
                        v8 /* !! */  = (long)nv.lkwr("llqs", lkwo(int ), (int)325);
                    }
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("llqt", lkwv(int ), (int)192)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v9 /* !! */  == nv.lkwr("llqu", lkwo(int ), (int)326)) break;
                        v9 /* !! */  = (long)nv.lkwr("llqv", lkwo(int ), (int)327);
                    }
                    v10 = nv.mc.field_1724;
                    while (true) {
                        if ((v11 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("llqw", lkwv(int ), (int)193)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v11 /* !! */  == nv.lkwr("llqx", lkwo(int ), (int)328)) break;
                        v11 /* !! */  = (long)nv.lkwr("llqy", lkwo(int ), (int)329);
                    }
                    v12 = v10.method_31548();
                    v13 /* !! */  = nv.ud;
                    if (true) ** GOTO lbl95
                    block63: while (true) {
                        v13 /* !! */  = (long)(v14 - nv.lkwr("llqz", lkwv(int ), (int)194));
lbl95:
                        // 2 sources

                        switch ((int)v13 /* !! */ ) {
                            case 1637199440: {
                                break block63;
                            }
                            case 2056053097: {
                                v14 = nv.lkwr("llra", lkwv(int ), (int)195);
                                continue block63;
                            }
                            case 2076781239: {
                                v14 = nv.lkwr("llrb", lkwv(int ), (int)196);
                                continue block63;
                            }
                        }
                        break;
                    }
                    var2_5 = v12.method_5438((int)var1_4);
                    if (var3_3 || var3_3) ** GOTO lbl37
                    v15 /* !! */  = nv.ud;
                    if (true) ** GOTO lbl110
                    block64: while (true) {
                        v15 /* !! */  = (long)(v16 - nv.lkwr("llrc", lkwv(int ), (int)197));
lbl110:
                        // 2 sources

                        switch ((int)v15 /* !! */ ) {
                            case -747090870: {
                                v16 = nv.lkwr("llrd", lkwv(int ), (int)198);
                                continue block64;
                            }
                            case 553239644: {
                                v16 = nv.lkwr("llre", lkwv(int ), (int)199);
                                continue block64;
                            }
                            case 1637199440: {
                                break block64;
                            }
                        }
                        break;
                    }
                    if (var2_5.method_7960()) ** GOTO lbl129
                    if (var3_3) ** GOTO lbl37
                    while (true) {
                        if ((v17 /* !! */  = (cfr_temp_5 = nv.ud - nv.lkwr("llrf", lkwv(int ), (int)200)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v17 /* !! */  == nv.lkwr("llrg", lkwo(int ), (int)330)) break;
                        v17 /* !! */  = (long)nv.lkwr("llrh", lkwo(int ), (int)331);
                    }
                    if (var2_5.method_7909() != var0) ** GOTO lbl129
                    if (var3_3 || var3_3) ** GOTO lbl37
                    return (int)var1_4;
lbl129:
                    // 2 sources

                    if (var3_3 || var3_3) ** GOTO lbl37
                    ++var1_4;
                    if (var3_3) ** GOTO lbl37
                } while (!var5_1);
                throw null;
lbl134:
                // 1 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return (int)nv.lkwr("llri", lkwo(int ), (int)332);
            }
lbl137:
            // 2 sources

            case 0: {
                var4_2 /* !! */  = (int)nv.lkwr("llrj", lkwo(int ), (int)333);
                if (!var5_1) break;
                throw null;
            }
lbl141:
            // 4 sources

            case 1: {
                var4_2 /* !! */  = (int)nv.lkwr("llrk", lkwo(int ), (int)334);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 2: {
                var4_2 /* !! */  = (int)nv.lkwr("llrl", lkwo(int ), (int)335);
                if (!var5_1) break;
                throw null;
            }
lbl150:
            // 3 sources

            case 3: {
                var4_2 /* !! */  = (int)nv.lkwr("llrm", lkwo(int ), (int)336);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl169
            }
            case 4: {
                var4_2 /* !! */  = (int)nv.lkwr("llrn", lkwo(int ), (int)337);
                if (!var5_1) ** GOTO lbl141
                throw null;
            }
lbl159:
            // 3 sources

            case 5: {
                var4_2 /* !! */  = (int)nv.lkwr("llro", lkwo(int ), (int)338);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl240
            }
            case 6: {
                var4_2 /* !! */  = (int)nv.lkwr("llrp", lkwo(int ), (int)339);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl169:
            // 2 sources

            case 7: {
                var4_2 /* !! */  = (int)nv.lkwr("llrq", lkwo(int ), (int)340);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl240
            }
lbl174:
            // 2 sources

            case 8: {
                var4_2 /* !! */  = (int)nv.lkwr("llrr", lkwo(int ), (int)341);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl240
            }
lbl179:
            // 2 sources

            case 9: {
                var4_2 /* !! */  = (int)nv.lkwr("llrs", lkwo(int ), (int)342);
                if (!var5_1) ** GOTO lbl174
                throw null;
            }
lbl183:
            // 3 sources

            case 10: {
                var4_2 /* !! */  = (int)nv.lkwr("llrt", lkwo(int ), (int)343);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 11: {
                var4_2 /* !! */  = (int)nv.lkwr("llru", lkwo(int ), (int)344);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 12: {
                var4_2 /* !! */  = (int)nv.lkwr("llrv", lkwo(int ), (int)345);
                if (!var5_1) ** GOTO lbl179
                throw null;
            }
lbl197:
            // 3 sources

            case 13: {
                var4_2 /* !! */  = (int)nv.lkwr("llrw", lkwo(int ), (int)346);
                if (!var5_1) ** GOTO lbl150
                throw null;
            }
            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)nv.lkwr("llrx", lkwo(int ), (int)347);
                    if (!var5_1) ** GOTO lbl183
                    throw null;
                }
            }
            case 15: {
                do {
                    var4_2 /* !! */  = (int)nv.lkwr("llry", lkwo(int ), (int)348);
                } while (!var5_1);
                throw null;
            }
lbl211:
            // 2 sources

            case 16: {
                var4_2 /* !! */  = (int)nv.lkwr("llrz", lkwo(int ), (int)349);
                if (!var5_1) ** GOTO lbl183
                throw null;
            }
            case 17: {
                var4_2 /* !! */  = (int)nv.lkwr("llsa", lkwo(int ), (int)350);
                if (!var5_1) ** GOTO lbl197
                throw null;
            }
            case 18: {
                var4_2 /* !! */  = (int)nv.lkwr("llsb", lkwo(int ), (int)351);
                if (!var5_1) ** GOTO lbl159
                throw null;
            }
            case 19: {
                do {
                    var4_2 /* !! */  = (int)nv.lkwr("llsc", lkwo(int ), (int)352);
                } while (!var5_1);
                throw null;
            }
lbl228:
            // 2 sources

            case 20: {
                var4_2 /* !! */  = (int)nv.lkwr("llsd", lkwo(int ), (int)353);
                if (!var5_1) ** GOTO lbl159
                throw null;
            }
            case 21: {
                var4_2 /* !! */  = (int)nv.lkwr("llse", lkwo(int ), (int)354);
                if (!var5_1) ** GOTO lbl141
                throw null;
            }
            case 22: {
                var4_2 /* !! */  = (int)nv.lkwr("llsf", lkwo(int ), (int)355);
                if (!var5_1) ** GOTO lbl141
                throw null;
            }
lbl240:
            // 4 sources

            case 23: {
                var4_2 /* !! */  = (int)nv.lkwr("llsg", lkwo(int ), (int)356);
                if (!var5_1) ** GOTO lbl137
                throw null;
            }
            case 24: 
        }
        var4_2 /* !! */  = (int)nv.lkwr("llsh", lkwo(int ), (int)357);
        ** while (!var5_1)
lbl247:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lojs() {
        nv.lkwx[0] = -7754642980394864550L;
        nv.lkwx[1] = -8411910408244849819L;
        nv.lkwx[2] = -4839012474687959347L;
        nv.lkwx[3] = -6501283305204303472L;
        nv.lkwx[4] = 717766077635665804L;
        nv.lkwx[5] = -5891004219822933041L;
        nv.lkwx[6] = -2747692364897846992L;
        nv.lkwx[7] = -1397844678319488721L;
        nv.lkwx[8] = -7371243803197696218L;
        nv.lkwx[9] = -2312245436225231183L;
        nv.lkwx[10] = -5405986156626410979L;
        nv.lkwx[11] = 5386714637932846273L;
        nv.lkwx[12] = -4249995973632458262L;
        nv.lkwx[13] = -7241881759499027366L;
        nv.lkwx[14] = 2501833699370189697L;
        nv.lkwx[15] = 3704795966031957389L;
        nv.lkwx[16] = 297159574376080010L;
        nv.lkwx[17] = -5128977633960839969L;
        nv.lkwx[18] = -8703720284067845419L;
        nv.lkwx[19] = 6398380207690254273L;
        nv.lkwx[20] = -7491693997819085549L;
        nv.lkwx[21] = -7289700432220368849L;
        nv.lkwx[22] = 2030219498659838300L;
        nv.lkwx[23] = -2081230059610061739L;
        nv.lkwx[24] = 8220356592277387301L;
        nv.lkwx[25] = -7838593269452278140L;
        nv.lkwx[26] = -6659450666754327256L;
        nv.lkwx[27] = -1526646141918006538L;
        nv.lkwx[28] = -2105884804152246844L;
        nv.lkwx[29] = -5388359625443243560L;
        nv.lkwx[30] = -3694168018505950637L;
        nv.lkwx[31] = -2149534332612314188L;
        nv.lkwx[32] = 3938180801359307731L;
        nv.lkwx[33] = 9043862137130460236L;
        nv.lkwx[34] = 320280431089234211L;
        nv.lkwx[35] = -5816211062895796737L;
        nv.lkwx[36] = -6023605924898891230L;
        nv.lkwx[37] = -1807272948183001072L;
        nv.lkwx[38] = -7653543165039947772L;
        nv.lkwx[39] = 251035853772247105L;
        nv.lkwx[40] = -3316849762718127117L;
        nv.lkwx[41] = 737297208887365350L;
        nv.lkwx[42] = -6247112993091210200L;
        nv.lkwx[43] = 1057173460544347217L;
        nv.lkwx[44] = -8400493218628987257L;
        nv.lkwx[45] = -2696534562905532369L;
        nv.lkwx[46] = -3206298573185374575L;
        nv.lkwx[47] = 1282227135398009240L;
        nv.lkwx[48] = -474020877043943639L;
        nv.lkwx[49] = 5543375617403730075L;
        nv.lkwx[50] = 4426232940154652757L;
        nv.lkwx[51] = -6743034055901139626L;
        nv.lkwx[52] = 4381445555353131390L;
        nv.lkwx[53] = 8216030564433613026L;
        nv.lkwx[54] = 4550877579915169258L;
        nv.lkwx[55] = -3987658939170701108L;
        nv.lkwx[56] = -7567946891854847035L;
        nv.lkwx[57] = 7080557224151027887L;
        nv.lkwx[58] = -9051115374917051265L;
        nv.lkwx[59] = -6010030943142323031L;
        nv.lkwx[60] = 1475646483942344014L;
        nv.lkwx[61] = 7270541276424979776L;
        nv.lkwx[62] = 7754585670645850611L;
        nv.lkwx[63] = -1806932180614881333L;
        nv.lkwx[64] = 3931782062642810700L;
        nv.lkwx[65] = -4821498772202305346L;
        nv.lkwx[66] = 3684345765788707642L;
        nv.lkwx[67] = -5125057450274456925L;
        nv.lkwx[68] = 6303234618466510494L;
        nv.lkwx[69] = -7614479880662723757L;
        nv.lkwx[70] = 3838017182812771819L;
        nv.lkwx[71] = -7395951958131035315L;
        nv.lkwx[72] = 8467360308118871635L;
        nv.lkwx[73] = -530104330293390121L;
        nv.lkwx[74] = 2310813511867023901L;
        nv.lkwx[75] = 4320675205362547285L;
        nv.lkwx[76] = 3354187044819677796L;
        nv.lkwx[77] = 5596628573416719237L;
        nv.lkwx[78] = -3807578365042743076L;
        nv.lkwx[79] = -2714134257285888833L;
        nv.lkwx[80] = 779295516138692097L;
        nv.lkwx[81] = 9086407941301900970L;
        nv.lkwx[82] = 1232366739258655482L;
        nv.lkwx[83] = 8210005420407729890L;
        nv.lkwx[84] = 4373310690785832109L;
        nv.lkwx[85] = -7221681358653665853L;
        nv.lkwx[86] = -2087711234676013441L;
        nv.lkwx[87] = -6208240959391466183L;
        nv.lkwx[88] = 150131428174615538L;
        nv.lkwx[89] = 8659663826021086396L;
        nv.lkwx[90] = -7360195546334869171L;
        nv.lkwx[91] = 3896728188678848614L;
        nv.lkwx[92] = 2573416424892934120L;
        nv.lkwx[93] = -593146991672835879L;
        nv.lkwx[94] = -477074290607957337L;
        nv.lkwx[95] = 7966891640563441536L;
        nv.lkwx[96] = -4428261785261491559L;
        nv.lkwx[97] = 6680440214484484971L;
        nv.lkwx[98] = -5638509974384902160L;
        nv.lkwx[99] = 3019288312991498373L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean isValid(class_1799 var0) {
        v0 /* !! */  = nv.ud;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(nv.lkwr("locl", lkwv(int ), (int)965) - nv.lkwr("lock", lkwv(int ), (int)964));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1034676517: {
                    continue block20;
                }
                case 1637199440: {
                    break block20;
                }
            }
            break;
        }
        var3_1 = nv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("locm", lkwv(int ), (int)966)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nv.lkwr("locn", lkwo(int ), (int)1209)) break;
            v1 /* !! */  = (long)nv.lkwr("loco", lkwo(int ), (int)1210);
        }
        var2_2 /* !! */  = nv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("locp", lkwv(int ), (int)967)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nv.lkwr("locq", lkwo(int ), (int)1211)) break;
            v2 /* !! */  = (long)nv.lkwr("locr", lkwo(int ), (int)1212);
        }
        var1_3 = nv.a;
        if (var3_1) {
            throw null;
lbl27:
            // 4 sources

            return (boolean)nv.lkwr("locs", lkwo(int ), (int)1213);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl27
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("loct", lkwv(int ), (int)968)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == nv.lkwr("locu", lkwo(int ), (int)1214)) break;
                    v3 /* !! */  = (long)nv.lkwr("locv", lkwo(int ), (int)1215);
                }
                if (var0.method_7960()) ** GOTO lbl67
                if (var1_3) ** GOTO lbl27
                v4 /* !! */  = nv.ud;
                if (true) ** GOTO lbl45
                block25: while (true) {
                    v4 /* !! */  = (long)(v5 - nv.lkwr("locw", lkwv(int ), (int)969));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1066471250: {
                            v5 = nv.lkwr("locx", lkwv(int ), (int)970);
                            continue block25;
                        }
                        case 466810106: {
                            v5 = nv.lkwr("locy", lkwv(int ), (int)971);
                            continue block25;
                        }
                        case 1637199440: {
                            break block25;
                        }
                    }
                    break;
                }
                v6 = var0.method_7919();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("locz", lkwv(int ), (int)972)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == nv.lkwr("loda", lkwo(int ), (int)1216)) break;
                    v7 /* !! */  = (long)nv.lkwr("lodb", lkwo(int ), (int)1217);
                }
                if (v6 >= var0.method_7936() - nv.lkwr("lodc", lkwo(int ), (int)1218)) ** GOTO lbl67
                if (var1_3) ** GOTO lbl27
                v8 = nv.lkwr("lodd", lkwo(int ), (int)1219);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl70
lbl67:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v8 = nv.lkwr("lode", lkwo(int ), (int)1220);
lbl70:
                // 2 sources

                return (boolean)v8;
            }
lbl71:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nv.lkwr("lodf", lkwo(int ), (int)1221);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)nv.lkwr("lodg", lkwo(int ), (int)1222);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)nv.lkwr("lodh", lkwo(int ), (int)1223);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl90
            }
            case 3: {
                do {
                    var2_2 /* !! */  = (int)nv.lkwr("lodi", lkwo(int ), (int)1224);
                } while (!var3_1);
                throw null;
            }
lbl90:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)nv.lkwr("lodj", lkwo(int ), (int)1225);
                if (!var3_1) ** GOTO lbl71
                throw null;
            }
lbl94:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)nv.lkwr("lodk", lkwo(int ), (int)1226);
                if (!var3_1) ** GOTO lbl71
                throw null;
            }
            case 6: {
                do {
                    var2_2 /* !! */  = (int)nv.lkwr("lodl", lkwo(int ), (int)1227);
                } while (!var3_1);
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)nv.lkwr("lodm", lkwo(int ), (int)1228);
                if (!var3_1) ** GOTO lbl94
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)nv.lkwr("lodn", lkwo(int ), (int)1229);
        ** while (!var3_1)
lbl110:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void swapToOffhand(int var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lmit", lkwv(int ), (int)380)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nv.lkwr("lmiu", lkwo(int ), (int)606)) break;
            v0 /* !! */  = (long)nv.lkwr("lmiv", lkwo(int ), (int)607);
        }
        var3_1 = nv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lmiw", lkwv(int ), (int)381)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nv.lkwr("lmix", lkwo(int ), (int)608)) break;
            v1 /* !! */  = (long)nv.lkwr("lmiy", lkwo(int ), (int)609);
        }
        var2_2 /* !! */  = nv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lmiz", lkwv(int ), (int)382)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nv.lkwr("lmja", lkwo(int ), (int)610)) break;
            v2 /* !! */  = (long)nv.lkwr("lmjb", lkwo(int ), (int)611);
        }
        var1_3 = nv.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl27:
                    // 2 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl27
                v3 = nv.lkwr("lmjc", lkwo(int ), (int)612);
                v4 /* !! */  = nv.ud;
                if (true) ** GOTO lbl35
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - nv.lkwr("lmjd", lkwv(int ), (int)383));
lbl35:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1836688641: {
                            v5 = nv.lkwr("lmje", lkwv(int ), (int)384);
                            continue block21;
                        }
                        case -158047388: {
                            v5 = nv.lkwr("lmjf", lkwv(int ), (int)385);
                            continue block21;
                        }
                        case 1637199440: {
                            break block21;
                        }
                    }
                    break;
                }
                v6 /* !! */  = nv.ud;
                if (true) ** GOTO lbl48
                block22: while (true) {
                    v6 /* !! */  = (long)(nv.lkwr("lmjh", lkwv(int ), (int)387) - nv.lkwr("lmjg", lkwv(int ), (int)386));
lbl48:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1518613810: {
                            continue block22;
                        }
                        case 1637199440: {
                            break block22;
                        }
                    }
                    break;
                }
                nv.click(var0, (int)v3, class_1713.field_7791);
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl56:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)nv.lkwr("lmji", lkwo(int ), (int)613);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl66
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nv.lkwr("lmjj", lkwo(int ), (int)614);
                    if (!var3_1) ** GOTO lbl56
                    throw null;
                }
            }
lbl66:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)nv.lkwr("lmjk", lkwo(int ), (int)615);
                if (!var3_1) ** GOTO lbl56
                throw null;
            }
lbl70:
            // 2 sources

            case 3: {
                do {
                    var2_2 /* !! */  = (int)nv.lkwr("lmjl", lkwo(int ), (int)616);
                } while (!var3_1);
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)nv.lkwr("lmjm", lkwo(int ), (int)617);
                if (!var3_1) ** GOTO lbl70
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)nv.lkwr("lmjn", lkwo(int ), (int)618);
        ** while (!var3_1)
lbl82:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lojp() {
        nv.lkww[800] = 8241292701099696433L;
        nv.lkww[801] = -8355054638966126140L;
        nv.lkww[802] = -4927628513342592375L;
        nv.lkww[803] = -9087183541758967953L;
        nv.lkww[804] = -6854338472327748248L;
        nv.lkww[805] = 6178189668092142214L;
        nv.lkww[806] = -9088741108866799740L;
        nv.lkww[807] = 8222507745346209551L;
        nv.lkww[808] = 962767126773768140L;
        nv.lkww[809] = -6049876548712515432L;
        nv.lkww[810] = -1720305038758322287L;
        nv.lkww[811] = 620997290345161334L;
        nv.lkww[812] = 3227829164965062832L;
        nv.lkww[813] = 3030472154547766206L;
        nv.lkww[814] = 6616686876423936321L;
        nv.lkww[815] = -6000616230474165732L;
        nv.lkww[816] = 2694465944265484889L;
        nv.lkww[817] = -7716969455278248365L;
        nv.lkww[818] = 1619533668827926830L;
        nv.lkww[819] = 689588738002633395L;
        nv.lkww[820] = 4473640481270395795L;
        nv.lkww[821] = -3023586784282891471L;
        nv.lkww[822] = -3250608855224693663L;
        nv.lkww[823] = 2660939670472427285L;
        nv.lkww[824] = -446461270788326392L;
        nv.lkww[825] = 5454623823681397694L;
        nv.lkww[826] = -6743986174759601370L;
        nv.lkww[827] = 184659936449686511L;
        nv.lkww[828] = 6886467478192020286L;
        nv.lkww[829] = -1762143233469521571L;
        nv.lkww[830] = -1981624264579118373L;
        nv.lkww[831] = -2162200305872637531L;
        nv.lkww[832] = 2354455324966249405L;
        nv.lkww[833] = 8669433760855563072L;
        nv.lkww[834] = -7569418494867621845L;
        nv.lkww[835] = 1796049539946710382L;
        nv.lkww[836] = 5650465396953695363L;
        nv.lkww[837] = -6846184321666373424L;
        nv.lkww[838] = -3441638010426730239L;
        nv.lkww[839] = 6589796205754266220L;
        nv.lkww[840] = 6556008672518421737L;
        nv.lkww[841] = -8581770612787454482L;
        nv.lkww[842] = 6483781321838852140L;
        nv.lkww[843] = 2529715963202875507L;
        nv.lkww[844] = 8883250609316509033L;
        nv.lkww[845] = 4301473251874582734L;
        nv.lkww[846] = -8495969413239953369L;
        nv.lkww[847] = -3741140891084544843L;
        nv.lkww[848] = 8619309315294902494L;
        nv.lkww[849] = 5828662893096329239L;
        nv.lkww[850] = 2581321565073714338L;
        nv.lkww[851] = 6074914904127334084L;
        nv.lkww[852] = -3740446212114684808L;
        nv.lkww[853] = -5492686187606951207L;
        nv.lkww[854] = 4428133063553702321L;
        nv.lkww[855] = 5433075615683933425L;
        nv.lkww[856] = 8901650148761451567L;
        nv.lkww[857] = -7676143750662438557L;
        nv.lkww[858] = 1754762280067243343L;
        nv.lkww[859] = -1200869708107636430L;
        nv.lkww[860] = -5469963290367453427L;
        nv.lkww[861] = 1722022382295968139L;
        nv.lkww[862] = -1968850751157751257L;
        nv.lkww[863] = -1500618079103626567L;
        nv.lkww[864] = -5923080333864013127L;
        nv.lkww[865] = 8618086637875893522L;
        nv.lkww[866] = 3611635527460834704L;
        nv.lkww[867] = -4017311228058184905L;
        nv.lkww[868] = -4525843011695505240L;
        nv.lkww[869] = -3324925630843904799L;
        nv.lkww[870] = 5235584258298951993L;
        nv.lkww[871] = -5979759236364611814L;
        nv.lkww[872] = 8147422889723754115L;
        nv.lkww[873] = -8097654981450245037L;
        nv.lkww[874] = 1941789769492253795L;
        nv.lkww[875] = -5221910328045705507L;
        nv.lkww[876] = -6183262064944065031L;
        nv.lkww[877] = 7974573352378297210L;
        nv.lkww[878] = -131907672511569013L;
        nv.lkww[879] = -1352718976094063117L;
        nv.lkww[880] = 307492235821616529L;
        nv.lkww[881] = 7998559864529317258L;
        nv.lkww[882] = 5479739485399546384L;
        nv.lkww[883] = -594209408605694271L;
        nv.lkww[884] = 660364539090300581L;
        nv.lkww[885] = -4051738636317014343L;
        nv.lkww[886] = 1021716762529699804L;
        nv.lkww[887] = -5576911443630041323L;
        nv.lkww[888] = 5490408116253620609L;
        nv.lkww[889] = 262701895954924744L;
        nv.lkww[890] = 5095062154147250951L;
        nv.lkww[891] = 1697549601252051061L;
        nv.lkww[892] = 6388313554629004502L;
        nv.lkww[893] = 1271479346922980414L;
        nv.lkww[894] = -5009147361198704419L;
        nv.lkww[895] = 7248371120932626968L;
        nv.lkww[896] = 8882736028230219912L;
        nv.lkww[897] = -7366474805112262153L;
        nv.lkww[898] = 7241482688290731890L;
        nv.lkww[899] = -3116795747041681786L;
    }

    private static /* synthetic */ void loix() {
        nv.lkwq[300] = 1351836349;
        nv.lkwq[301] = 1152396996;
        nv.lkwq[302] = -1299594684;
        nv.lkwq[303] = 1279037134;
        nv.lkwq[304] = -1789195950;
        nv.lkwq[305] = 1702325119;
        nv.lkwq[306] = -1964607683;
        nv.lkwq[307] = -1126414710;
        nv.lkwq[308] = 820714973;
        nv.lkwq[309] = 389232470;
        nv.lkwq[310] = -1703548016;
        nv.lkwq[311] = 33055623;
        nv.lkwq[312] = -2106331097;
        nv.lkwq[313] = 228424802;
        nv.lkwq[314] = 625872656;
        nv.lkwq[315] = 1103649226;
        nv.lkwq[316] = 2035968204;
        nv.lkwq[317] = 383369723;
        nv.lkwq[318] = 985741310;
        nv.lkwq[319] = -500897402;
        nv.lkwq[320] = -2088840569;
        nv.lkwq[321] = -335515588;
        nv.lkwq[322] = -377631998;
        nv.lkwq[323] = -102378470;
        nv.lkwq[324] = 243548289;
        nv.lkwq[325] = -1254117461;
        nv.lkwq[326] = 1061479440;
        nv.lkwq[327] = 1292726571;
        nv.lkwq[328] = -2110309924;
        nv.lkwq[329] = 1802642991;
        nv.lkwq[330] = -1642538281;
        nv.lkwq[331] = 2114684233;
        nv.lkwq[332] = -127380743;
        nv.lkwq[333] = 1837498198;
        nv.lkwq[334] = 1491536174;
        nv.lkwq[335] = -2077527575;
        nv.lkwq[336] = 1137791449;
        nv.lkwq[337] = -1794632813;
        nv.lkwq[338] = 1093913236;
        nv.lkwq[339] = 307128788;
        nv.lkwq[340] = 589883983;
        nv.lkwq[341] = 171580631;
        nv.lkwq[342] = 522579249;
        nv.lkwq[343] = 744112866;
        nv.lkwq[344] = 1175108835;
        nv.lkwq[345] = -1571246752;
        nv.lkwq[346] = 2129067259;
        nv.lkwq[347] = -1233725529;
        nv.lkwq[348] = -1017881447;
        nv.lkwq[349] = 1312536561;
        nv.lkwq[350] = -1415706257;
        nv.lkwq[351] = -110891751;
        nv.lkwq[352] = -1992725041;
        nv.lkwq[353] = 705308701;
        nv.lkwq[354] = 275026557;
        nv.lkwq[355] = 9784950;
        nv.lkwq[356] = 511336009;
        nv.lkwq[357] = -178767164;
        nv.lkwq[358] = -1347850542;
        nv.lkwq[359] = -1692237830;
        nv.lkwq[360] = -1215542697;
        nv.lkwq[361] = -285930687;
        nv.lkwq[362] = -328672296;
        nv.lkwq[363] = -1560245472;
        nv.lkwq[364] = 1507511133;
        nv.lkwq[365] = 1480478643;
        nv.lkwq[366] = -1307066065;
        nv.lkwq[367] = -981047822;
        nv.lkwq[368] = -2032640074;
        nv.lkwq[369] = -781733944;
        nv.lkwq[370] = 1901657248;
        nv.lkwq[371] = -1389368842;
        nv.lkwq[372] = 648724261;
        nv.lkwq[373] = 107659865;
        nv.lkwq[374] = -1245262835;
        nv.lkwq[375] = -281425661;
        nv.lkwq[376] = -243754007;
        nv.lkwq[377] = -1402375074;
        nv.lkwq[378] = -809157271;
        nv.lkwq[379] = 1183640732;
        nv.lkwq[380] = 1341814169;
        nv.lkwq[381] = 1030841416;
        nv.lkwq[382] = 1443521163;
        nv.lkwq[383] = -1859374574;
        nv.lkwq[384] = 1274479950;
        nv.lkwq[385] = -1838892140;
        nv.lkwq[386] = -960219202;
        nv.lkwq[387] = -749595869;
        nv.lkwq[388] = 1849912806;
        nv.lkwq[389] = -1091429947;
        nv.lkwq[390] = 2074968515;
        nv.lkwq[391] = 589853988;
        nv.lkwq[392] = 1093290299;
        nv.lkwq[393] = 728575642;
        nv.lkwq[394] = 15783083;
        nv.lkwq[395] = -14829828;
        nv.lkwq[396] = 347209537;
        nv.lkwq[397] = -844066689;
        nv.lkwq[398] = -1417547211;
        nv.lkwq[399] = -2003753984;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void use(class_1268 var0) {
        v0 /* !! */  = nv.ud;
        if (true) ** GOTO lbl5
        block38: while (true) {
            v0 /* !! */  = (long)(v1 - nv.lkwr("lntc", lkwv(int ), (int)831));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1808750273: {
                    v1 = nv.lkwr("lntd", lkwv(int ), (int)832);
                    continue block38;
                }
                case -182623138: {
                    v1 = nv.lkwr("lnte", lkwv(int ), (int)833);
                    continue block38;
                }
                case 275564191: {
                    v1 = nv.lkwr("lntf", lkwv(int ), (int)834);
                    continue block38;
                }
                case 1637199440: {
                    break block38;
                }
            }
            break;
        }
        var3_1 = nv.c;
        v2 /* !! */  = nv.ud;
        if (true) ** GOTO lbl22
        block39: while (true) {
            v2 /* !! */  = (long)(v3 - nv.lkwr("lntg", lkwv(int ), (int)835));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 1098886341: {
                    v3 = nv.lkwr("lnth", lkwv(int ), (int)836);
                    continue block39;
                }
                case 1637199440: {
                    break block39;
                }
                case 1851698777: {
                    v3 = nv.lkwr("lnti", lkwv(int ), (int)837);
                    continue block39;
                }
            }
            break;
        }
        var2_2 /* !! */  = nv.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lntj", lkwv(int ), (int)838)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == nv.lkwr("lntk", lkwo(int ), (int)1100)) break;
            v4 /* !! */  = (long)nv.lkwr("lntl", lkwo(int ), (int)1101);
        }
        var1_3 = nv.a;
        if (var3_1) {
            throw null;
lbl40:
            // 7 sources

            return;
        }
        if (var1_3) ** GOTO lbl40
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl40
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lntm", lkwv(int ), (int)839)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == nv.lkwr("lntn", lkwo(int ), (int)1102)) break;
                    v5 /* !! */  = (long)nv.lkwr("lnto", lkwo(int ), (int)1103);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lntp", lkwv(int ), (int)840)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == nv.lkwr("lntq", lkwo(int ), (int)1104)) break;
                    v6 /* !! */  = (long)nv.lkwr("lntr", lkwo(int ), (int)1105);
                }
                if (nv.mc.field_1724 == null) ** GOTO lbl82
                if (var1_3) ** GOTO lbl40
                v7 /* !! */  = nv.ud;
                if (true) ** GOTO lbl63
                block44: while (true) {
                    v7 /* !! */  = (long)(v8 - nv.lkwr("lnts", lkwv(int ), (int)841));
lbl63:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -375634517: {
                            v8 = nv.lkwr("lntt", lkwv(int ), (int)842);
                            continue block44;
                        }
                        case 405958441: {
                            v8 = nv.lkwr("lntu", lkwv(int ), (int)843);
                            continue block44;
                        }
                        case 1637199440: {
                            break block44;
                        }
                        case 1684959428: {
                            v8 = nv.lkwr("lntv", lkwv(int ), (int)844);
                            continue block44;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("lntw", lkwv(int ), (int)845)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == nv.lkwr("lntx", lkwo(int ), (int)1106)) break;
                    v9 /* !! */  = (long)nv.lkwr("lnty", lkwo(int ), (int)1107);
                }
                if (nv.mc.field_1761 != null) ** GOTO lbl84
                if (var1_3) ** GOTO lbl40
lbl82:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl40
                return;
lbl84:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl40
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("lntz", lkwv(int ), (int)846)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == nv.lkwr("lnua", lkwo(int ), (int)1108)) break;
                    v10 /* !! */  = (long)nv.lkwr("lnub", lkwo(int ), (int)1109);
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_5 = nv.ud - nv.lkwr("lnuc", lkwv(int ), (int)847)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == nv.lkwr("lnud", lkwo(int ), (int)1110)) break;
                    v11 /* !! */  = (long)nv.lkwr("lnue", lkwo(int ), (int)1111);
                }
                v12 = nv.mc.field_1761;
                v13 /* !! */  = nv.ud;
                if (true) ** GOTO lbl100
                block48: while (true) {
                    v13 /* !! */  = (long)(v14 - nv.lkwr("lnuf", lkwv(int ), (int)848));
lbl100:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1787191719: {
                            v14 = nv.lkwr("lnug", lkwv(int ), (int)849);
                            continue block48;
                        }
                        case -1031644614: {
                            v14 = nv.lkwr("lnuh", lkwv(int ), (int)850);
                            continue block48;
                        }
                        case -1030801964: {
                            v14 = nv.lkwr("lnui", lkwv(int ), (int)851);
                            continue block48;
                        }
                        case 1637199440: {
                            break block48;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_6 = nv.ud - nv.lkwr("lnuj", lkwv(int ), (int)852)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == nv.lkwr("lnuk", lkwo(int ), (int)1112)) break;
                    v15 /* !! */  = (long)nv.lkwr("lnul", lkwo(int ), (int)1113);
                }
                v16 = nv.mc.field_1724;
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_7 = nv.ud - nv.lkwr("lnum", lkwv(int ), (int)853)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == nv.lkwr("lnun", lkwo(int ), (int)1114)) break;
                    v17 /* !! */  = (long)nv.lkwr("lnuo", lkwo(int ), (int)1115);
                }
                v12.method_2919((class_1657)v16, var0);
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl127:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)nv.lkwr("lnup", lkwo(int ), (int)1116);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 1: {
                var2_2 /* !! */  = (int)nv.lkwr("lnuq", lkwo(int ), (int)1117);
                if (!var3_1) break;
                throw null;
            }
lbl136:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)nv.lkwr("lnur", lkwo(int ), (int)1118);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl145
            }
            case 3: {
                var2_2 /* !! */  = (int)nv.lkwr("lnus", lkwo(int ), (int)1119);
                if (!var3_1) ** GOTO lbl136
                throw null;
            }
lbl145:
            // 3 sources

            case 4: {
                do {
                    var2_2 /* !! */  = (int)nv.lkwr("lnut", lkwo(int ), (int)1120);
                } while (!var3_1);
                throw null;
            }
lbl150:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)nv.lkwr("lnuu", lkwo(int ), (int)1121);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 6: {
                var2_2 /* !! */  = (int)nv.lkwr("lnuv", lkwo(int ), (int)1122);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 7: {
                var2_2 /* !! */  = (int)nv.lkwr("lnuw", lkwo(int ), (int)1123);
                if (!var3_1) ** GOTO lbl136
                throw null;
            }
lbl164:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)nv.lkwr("lnux", lkwo(int ), (int)1124);
                if (!var3_1) ** GOTO lbl127
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)nv.lkwr("lnuy", lkwo(int ), (int)1125);
                if (!var3_1) ** GOTO lbl150
                throw null;
            }
lbl172:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)nv.lkwr("lnuz", lkwo(int ), (int)1126);
                if (!var3_1) ** GOTO lbl145
                throw null;
            }
lbl176:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)nv.lkwr("lnva", lkwo(int ), (int)1127);
                if (!var3_1) ** GOTO lbl136
                throw null;
            }
            case 12: 
        }
        do {
            var2_2 /* !! */  = (int)nv.lkwr("lnvb", lkwo(int ), (int)1128);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void updateSlots() {
        v0 /* !! */  = nv.ud;
        if (true) ** GOTO lbl5
        block82: while (true) {
            v0 /* !! */  = (long)(nv.lkwr("lmnx", lkwv(int ), (int)442) - nv.lkwr("lmnw", lkwv(int ), (int)441));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 722678656: {
                    continue block82;
                }
                case 1637199440: {
                    break block82;
                }
            }
            break;
        }
        var2 = nv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lmny", lkwv(int ), (int)443)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nv.lkwr("lmnz", lkwo(int ), (int)678)) break;
            v1 /* !! */  = (long)nv.lkwr("lmoa", lkwo(int ), (int)679);
        }
        var1_1 /* !! */  = nv.b;
        v2 /* !! */  = nv.ud;
        if (true) ** GOTO lbl21
        block84: while (true) {
            v2 /* !! */  = (long)(v3 - nv.lkwr("lmob", lkwv(int ), (int)444));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 354491971: {
                    v3 = nv.lkwr("lmoc", lkwv(int ), (int)445);
                    continue block84;
                }
                case 1279194560: {
                    v3 = nv.lkwr("lmod", lkwv(int ), (int)446);
                    continue block84;
                }
                case 1289872834: {
                    v3 = nv.lkwr("lmoe", lkwv(int ), (int)447);
                    continue block84;
                }
                case 1637199440: {
                    break block84;
                }
            }
            break;
        }
        var0_2 = nv.a;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2) {
                    throw null;
lbl39:
                    // 8 sources

                    return;
                }
                if (var0_2 || var0_2) ** GOTO lbl39
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lmof", lkwv(int ), (int)448)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == nv.lkwr("lmog", lkwo(int ), (int)680)) break;
                    v4 /* !! */  = (long)nv.lkwr("lmoh", lkwo(int ), (int)681);
                }
                v5 /* !! */  = nv.ud;
                if (true) ** GOTO lbl51
                block87: while (true) {
                    v5 /* !! */  = (long)(v6 - nv.lkwr("lmoi", lkwv(int ), (int)449));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -730822145: {
                            v6 = nv.lkwr("lmoj", lkwv(int ), (int)450);
                            continue block87;
                        }
                        case -647666022: {
                            v6 = nv.lkwr("lmok", lkwv(int ), (int)451);
                            continue block87;
                        }
                        case 834801153: {
                            v6 = nv.lkwr("lmol", lkwv(int ), (int)452);
                            continue block87;
                        }
                        case 1637199440: {
                            break block87;
                        }
                    }
                    break;
                }
                if (nv.mc.field_1724 == null) ** GOTO lbl89
                if (var0_2) ** GOTO lbl39
                v7 /* !! */  = nv.ud;
                if (true) ** GOTO lbl69
                block88: while (true) {
                    v7 /* !! */  = (long)(nv.lkwr("lmon", lkwv(int ), (int)454) - nv.lkwr("lmom", lkwv(int ), (int)453));
lbl69:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 1292828774: {
                            continue block88;
                        }
                        case 1637199440: {
                            break block88;
                        }
                    }
                    break;
                }
                v8 /* !! */  = nv.ud;
                if (true) ** GOTO lbl78
                block89: while (true) {
                    v8 /* !! */  = (long)(v9 - nv.lkwr("lmoo", lkwv(int ), (int)455));
lbl78:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 1219801614: {
                            v9 = nv.lkwr("lmop", lkwv(int ), (int)456);
                            continue block89;
                        }
                        case 1637199440: {
                            break block89;
                        }
                        case 1655349226: {
                            v9 = nv.lkwr("lmoq", lkwv(int ), (int)457);
                            continue block89;
                        }
                    }
                    break;
                }
                if (nv.mc.field_1761 != null) ** GOTO lbl91
                if (var0_2) ** GOTO lbl39
lbl89:
                // 2 sources

                if (var0_2 || var0_2) ** GOTO lbl39
                return;
lbl91:
                // 1 sources

                if (var0_2 || var0_2) ** GOTO lbl39
                v10 /* !! */  = nv.ud;
                if (true) ** GOTO lbl96
                block90: while (true) {
                    v10 /* !! */  = (long)(nv.lkwr("lmos", lkwv(int ), (int)459) - nv.lkwr("lmor", lkwv(int ), (int)458));
lbl96:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 1230373535: {
                            continue block90;
                        }
                        case 1637199440: {
                            break block90;
                        }
                    }
                    break;
                }
                v11 /* !! */  = nv.ud;
                if (true) ** GOTO lbl105
                block91: while (true) {
                    v11 /* !! */  = (long)(nv.lkwr("lmou", lkwv(int ), (int)461) - nv.lkwr("lmot", lkwv(int ), (int)460));
lbl105:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1937714815: {
                            continue block91;
                        }
                        case 1637199440: {
                            break block91;
                        }
                    }
                    break;
                }
                v12 = (ak)nv.mc.field_1761;
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lmov", lkwv(int ), (int)462)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == nv.lkwr("lmow", lkwo(int ), (int)682)) break;
                    v13 /* !! */  = (long)nv.lkwr("lmox", lkwo(int ), (int)683);
                }
                v12.phobia$syncSelectedSlot();
                if (var0_2 || var0_2) ** GOTO lbl39
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("lmoy", lkwv(int ), (int)463)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == nv.lkwr("lmoz", lkwo(int ), (int)684)) break;
                    v14 /* !! */  = (long)nv.lkwr("lmpa", lkwo(int ), (int)685);
                }
                v15 /* !! */  = nv.ud;
                if (true) ** GOTO lbl127
                block94: while (true) {
                    v15 /* !! */  = (long)(v16 - nv.lkwr("lmpb", lkwv(int ), (int)464));
lbl127:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -891387083: {
                            v16 = nv.lkwr("lmpc", lkwv(int ), (int)465);
                            continue block94;
                        }
                        case 964501222: {
                            v16 = nv.lkwr("lmpd", lkwv(int ), (int)466);
                            continue block94;
                        }
                        case 1637199440: {
                            break block94;
                        }
                    }
                    break;
                }
                v17 = nv.mc.field_1724;
                v18 /* !! */  = nv.ud;
                if (true) ** GOTO lbl141
                block95: while (true) {
                    v18 /* !! */  = (long)(nv.lkwr("lmpf", lkwv(int ), (int)468) - nv.lkwr("lmpe", lkwv(int ), (int)467));
lbl141:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case 407955479: {
                            continue block95;
                        }
                        case 1637199440: {
                            break block95;
                        }
                    }
                    break;
                }
                v19 = v17.method_31548();
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("lmpg", lkwv(int ), (int)469)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == nv.lkwr("lmph", lkwo(int ), (int)686)) break;
                    v20 /* !! */  = (long)nv.lkwr("lmpi", lkwo(int ), (int)687);
                }
                v19.method_5431();
                if (var0_2 || var0_2) ** GOTO lbl39
                v21 /* !! */  = nv.ud;
                if (true) ** GOTO lbl158
                block97: while (true) {
                    v21 /* !! */  = (long)(v22 - nv.lkwr("lmpj", lkwv(int ), (int)470));
lbl158:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -855311482: {
                            v22 = nv.lkwr("lmpk", lkwv(int ), (int)471);
                            continue block97;
                        }
                        case -499339926: {
                            v22 = nv.lkwr("lmpl", lkwv(int ), (int)472);
                            continue block97;
                        }
                        case 1637199440: {
                            break block97;
                        }
                        case 1976902316: {
                            v22 = nv.lkwr("lmpm", lkwv(int ), (int)473);
                            continue block97;
                        }
                    }
                    break;
                }
                v23 /* !! */  = nv.ud;
                if (true) ** GOTO lbl174
                block98: while (true) {
                    v23 /* !! */  = (long)(nv.lkwr("lmpo", lkwv(int ), (int)475) - nv.lkwr("lmpn", lkwv(int ), (int)474));
lbl174:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1437066890: {
                            continue block98;
                        }
                        case 1637199440: {
                            break block98;
                        }
                    }
                    break;
                }
                v24 = nv.mc.field_1724;
                v25 /* !! */  = nv.ud;
                if (true) ** GOTO lbl184
                block99: while (true) {
                    v25 /* !! */  = (long)(v26 - nv.lkwr("lmpp", lkwv(int ), (int)476));
lbl184:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case 298074534: {
                            v26 = nv.lkwr("lmpq", lkwv(int ), (int)477);
                            continue block99;
                        }
                        case 735685227: {
                            v26 = nv.lkwr("lmpr", lkwv(int ), (int)478);
                            continue block99;
                        }
                        case 1637199440: {
                            break block99;
                        }
                    }
                    break;
                }
                v27 = v24.field_7512;
                v28 /* !! */  = nv.ud;
                if (true) ** GOTO lbl198
                block100: while (true) {
                    v28 /* !! */  = (long)(v29 - nv.lkwr("lmps", lkwv(int ), (int)479));
lbl198:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -1914451136: {
                            v29 = nv.lkwr("lmpt", lkwv(int ), (int)480);
                            continue block100;
                        }
                        case 249992663: {
                            v29 = nv.lkwr("lmpu", lkwv(int ), (int)481);
                            continue block100;
                        }
                        case 1234414175: {
                            v29 = nv.lkwr("lmpv", lkwv(int ), (int)482);
                            continue block100;
                        }
                        case 1637199440: {
                            break block100;
                        }
                    }
                    break;
                }
                v27.method_7623();
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
            case 0: {
                var1_1 /* !! */  = (int)nv.lkwr("lmpw", lkwo(int ), (int)688);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl281
            }
            case 1: {
                var1_1 /* !! */  = (int)nv.lkwr("lmpx", lkwo(int ), (int)689);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl276
            }
lbl224:
            // 3 sources

            case 2: {
                var1_1 /* !! */  = (int)nv.lkwr("lmpy", lkwo(int ), (int)690);
                if (var2) {
                    throw null;
                }
            }
lbl228:
            // 6 sources

            case 3: {
                var1_1 /* !! */  = (int)nv.lkwr("lmpz", lkwo(int ), (int)691);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl267
            }
            case 4: {
                var1_1 /* !! */  = (int)nv.lkwr("lmqa", lkwo(int ), (int)692);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl255
            }
            case 5: {
                var1_1 /* !! */  = (int)nv.lkwr("lmqb", lkwo(int ), (int)693);
                if (!var2) ** GOTO lbl228
                throw null;
            }
            case 6: {
                var1_1 /* !! */  = (int)nv.lkwr("lmqc", lkwo(int ), (int)694);
                if (!var2) ** GOTO lbl224
                throw null;
            }
            case 7: {
                var1_1 /* !! */  = (int)nv.lkwr("lmqd", lkwo(int ), (int)695);
                if (!var2) ** GOTO lbl228
                throw null;
            }
lbl250:
            // 2 sources

            case 8: {
                var1_1 /* !! */  = (int)nv.lkwr("lmqe", lkwo(int ), (int)696);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl276
            }
lbl255:
            // 3 sources

            case 9: {
                var1_1 /* !! */  = (int)nv.lkwr("lmqf", lkwo(int ), (int)697);
                if (var2) {
                    throw null;
                }
            }
lbl259:
            // 4 sources

            case 10: {
                var1_1 /* !! */  = (int)nv.lkwr("lmqg", lkwo(int ), (int)698);
                if (!var2) ** GOTO lbl250
                throw null;
            }
            case 11: {
                var1_1 /* !! */  = (int)nv.lkwr("lmqh", lkwo(int ), (int)699);
                if (!var2) ** GOTO lbl255
                throw null;
            }
lbl267:
            // 2 sources

            case 12: {
                var1_1 /* !! */  = (int)nv.lkwr("lmqi", lkwo(int ), (int)700);
                if (!var2) ** GOTO lbl228
                throw null;
            }
            case 13: {
                var1_1 /* !! */  = (int)nv.lkwr("lmqj", lkwo(int ), (int)701);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl276:
            // 3 sources

            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)nv.lkwr("lmqk", lkwo(int ), (int)702);
                    if (!var2) ** GOTO lbl224
                    throw null;
                }
            }
lbl281:
            // 3 sources

            case 15: {
                var1_1 /* !! */  = (int)nv.lkwr("lmql", lkwo(int ), (int)703);
                if (!var2) ** GOTO lbl259
                throw null;
            }
            case 16: 
        }
        var1_1 /* !! */  = (int)nv.lkwr("lmqm", lkwo(int ), (int)704);
        ** while (!var2)
lbl288:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static nu findHotbar(class_1792 var0) {
        v0 /* !! */  = nv.ud;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - nv.lkwr("llxj", lkwv(int ), (int)240));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -45329990: {
                    v1 = nv.lkwr("llxk", lkwv(int ), (int)241);
                    continue block20;
                }
                case 1637199440: {
                    break block20;
                }
                case 2060894861: {
                    v1 = nv.lkwr("llxl", lkwv(int ), (int)242);
                    continue block20;
                }
            }
            break;
        }
        var3_1 = nv.c;
        v2 /* !! */  = nv.ud;
        if (true) ** GOTO lbl19
        block21: while (true) {
            v2 /* !! */  = (long)(nv.lkwr("llxn", lkwv(int ), (int)244) - nv.lkwr("llxm", lkwv(int ), (int)243));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1468144769: {
                    continue block21;
                }
                case 1637199440: {
                    break block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = nv.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("llxo", lkwv(int ), (int)245)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == nv.lkwr("llxp", lkwo(int ), (int)450)) break;
            v3 /* !! */  = (long)nv.lkwr("llxq", lkwo(int ), (int)451);
        }
        var1_3 = nv.a;
        if (var3_1) {
            throw null;
lbl33:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl33
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("llxr", lkwv(int ), (int)246)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == nv.lkwr("llxs", lkwo(int ), (int)452)) break;
                    v4 /* !! */  = (long)nv.lkwr("llxt", lkwo(int ), (int)453);
                }
                v5 = (nw)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_1799;)Z, lambda$findHotbar$2(net.minecraft.class_1792 net.minecraft.class_1799 ), (Lnet/minecraft/class_1799;)Z)((class_1792)var0);
                v6 /* !! */  = nv.ud;
                if (true) ** GOTO lbl50
                block25: while (true) {
                    v6 /* !! */  = (long)(v7 - nv.lkwr("llxu", lkwv(int ), (int)247));
lbl50:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -765448375: {
                            v7 = nv.lkwr("llxv", lkwv(int ), (int)248);
                            continue block25;
                        }
                        case 892686055: {
                            v7 = nv.lkwr("llxw", lkwv(int ), (int)249);
                            continue block25;
                        }
                        case 1637199440: {
                            break block25;
                        }
                    }
                    break;
                }
                return nv.findHotbar(v5);
            }
            case 0: {
                var2_2 /* !! */  = (int)nv.lkwr("llxx", lkwo(int ), (int)454);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)nv.lkwr("llxy", lkwo(int ), (int)455);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)nv.lkwr("llxz", lkwo(int ), (int)456);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)nv.lkwr("llya", lkwo(int ), (int)457);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int findEmptySlot() {
        block67: {
            block68: {
                var3 = nv.c;
                var2_1 /* !! */  = nv.b;
                var1_2 = nv.a;
                if (var3) {
                    throw null;
lbl6:
                    // 18 sources

                    return (int)nv.lkwr("lllu", lkwo(int ), (int)231);
                }
                if (var1_2 || var1_2) ** GOTO lbl6
                if (nv.mc.field_1724 != null) break block68;
                if (var1_2 || var1_2) ** GOTO lbl6
                return (int)nv.lkwr("lllv", lkwo(int ), (int)232);
            }
            if (var1_2 || var1_2) ** GOTO lbl6
            var0_3 = nv.lkwr("lllw", lkwo(int ), (int)233);
            if (var1_2) ** GOTO lbl6
            do {
                block69: {
                    if (var1_2 || var1_2) ** GOTO lbl6
                    if (var0_3 >= nv.lkwr("lllx", lkwo(int ), (int)234)) break block67;
                    if (var1_2 || var1_2) ** GOTO lbl6
                    if (!nv.mc.field_1724.method_31548().method_5438((int)var0_3).method_7960()) break block69;
                    if (var1_2 || var1_2) ** GOTO lbl6
                    return (int)var0_3;
                }
                if (var1_2 || var1_2) ** GOTO lbl6
                ++var0_3;
                if (var1_2) ** GOTO lbl6
            } while (!var3);
            throw null;
        }
        if (var1_2 || var1_2) ** GOTO lbl6
        var0_3 = nv.lkwr("llly", lkwo(int ), (int)235);
        if (var1_2) ** GOTO lbl6
        block39: while (true) {
            if (var1_2 || var1_2) ** GOTO lbl6
            if (var0_3 >= nv.lkwr("lllz", lkwo(int ), (int)236)) ** GOTO lbl49
            if (var1_2) ** GOTO lbl6
            if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var1_2) ** GOTO lbl6
                    if (!nv.mc.field_1724.method_31548().method_5438((int)var0_3).method_7960()) ** GOTO lbl44
                    if (var1_2 || var1_2) ** GOTO lbl6
                    return (int)(var0_3 + nv.lkwr("llma", lkwo(int ), (int)237));
lbl44:
                    // 1 sources

                    if (var1_2 || var1_2) ** GOTO lbl6
                    ++var0_3;
                    if (var1_2) ** GOTO lbl6
                    if (!var3) continue block39;
                    throw null;
                }
lbl49:
                // 1 sources

                if (!var1_2 && !var1_2) ** break;
                ** continue;
                return (int)nv.lkwr("llmb", lkwo(int ), (int)238);
lbl52:
                // 3 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_1 /* !! */  = (int)nv.lkwr("llmc", lkwo(int ), (int)239);
                        if (!var3) break block39;
                        throw null;
                    }
                }
lbl57:
                // 2 sources

                case 1: {
                    var2_1 /* !! */  = (int)nv.lkwr("llmd", lkwo(int ), (int)240);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl95
                }
lbl62:
                // 4 sources

                case 2: {
                    var2_1 /* !! */  = (int)nv.lkwr("llme", lkwo(int ), (int)241);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl72
                }
                case 3: {
                    var2_1 /* !! */  = (int)nv.lkwr("llmf", lkwo(int ), (int)242);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl179
                }
lbl72:
                // 5 sources

                case 4: {
                    var2_1 /* !! */  = (int)nv.lkwr("llmg", lkwo(int ), (int)243);
                    if (!var3) ** GOTO lbl62
                    throw null;
                }
lbl76:
                // 3 sources

                case 5: {
                    var2_1 /* !! */  = (int)nv.lkwr("llmh", lkwo(int ), (int)244);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl179
                }
                case 6: {
                    var2_1 /* !! */  = (int)nv.lkwr("llmi", lkwo(int ), (int)245);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl153
                }
                case 7: {
                    var2_1 /* !! */  = (int)nv.lkwr("llmj", lkwo(int ), (int)246);
                    if (!var3) ** GOTO lbl52
                    throw null;
                }
                case 8: {
                    var2_1 /* !! */  = (int)nv.lkwr("llmk", lkwo(int ), (int)247);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl187
                }
lbl95:
                // 2 sources

                case 9: {
                    var2_1 /* !! */  = (int)nv.lkwr("llml", lkwo(int ), (int)248);
                    if (!var3) ** GOTO lbl72
                    throw null;
                }
lbl99:
                // 2 sources

                case 10: {
                    var2_1 /* !! */  = (int)nv.lkwr("llmm", lkwo(int ), (int)249);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl113
                }
                case 11: {
                    var2_1 /* !! */  = (int)nv.lkwr("llmn", lkwo(int ), (int)250);
                    if (!var3) ** GOTO lbl72
                    throw null;
                }
lbl108:
                // 2 sources

                case 12: {
                    var2_1 /* !! */  = (int)nv.lkwr("llmo", lkwo(int ), (int)251);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl199
                }
lbl113:
                // 4 sources

                case 13: {
                    var2_1 /* !! */  = (int)nv.lkwr("llmp", lkwo(int ), (int)252);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl187
                }
lbl118:
                // 3 sources

                case 14: {
                    var2_1 /* !! */  = (int)nv.lkwr("llmq", lkwo(int ), (int)253);
                    if (!var3) ** GOTO lbl52
                    throw null;
                }
                case 15: {
                    var2_1 /* !! */  = (int)nv.lkwr("llmr", lkwo(int ), (int)254);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl135
                }
                case 16: {
                    var2_1 /* !! */  = (int)nv.lkwr("llms", lkwo(int ), (int)255);
                    if (!var3) ** GOTO lbl76
                    throw null;
                }
                case 17: {
                    var2_1 /* !! */  = (int)nv.lkwr("llmt", lkwo(int ), (int)256);
                    if (var3) {
                        throw null;
                    }
                }
lbl135:
                // 4 sources

                case 18: {
                    var2_1 /* !! */  = (int)nv.lkwr("llmu", lkwo(int ), (int)257);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl195
                }
                case 19: {
                    var2_1 /* !! */  = (int)nv.lkwr("llmv", lkwo(int ), (int)258);
                    if (!var3) ** GOTO lbl113
                    throw null;
                }
                case 20: {
                    var2_1 /* !! */  = (int)nv.lkwr("llmw", lkwo(int ), (int)259);
                    if (!var3) ** GOTO lbl62
                    throw null;
                }
                case 21: {
                    var2_1 /* !! */  = (int)nv.lkwr("llmx", lkwo(int ), (int)260);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl199
                }
lbl153:
                // 2 sources

                case 22: {
                    var2_1 /* !! */  = (int)nv.lkwr("llmy", lkwo(int ), (int)261);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl166
                }
                case 23: {
                    var2_1 /* !! */  = (int)nv.lkwr("llmz", lkwo(int ), (int)262);
                    if (!var3) ** GOTO lbl118
                    throw null;
                }
                case 24: {
                    var2_1 /* !! */  = (int)nv.lkwr("llna", lkwo(int ), (int)263);
                    if (!var3) ** GOTO lbl76
                    throw null;
                }
lbl166:
                // 2 sources

                case 25: {
                    var2_1 /* !! */  = (int)nv.lkwr("llnb", lkwo(int ), (int)264);
                    if (!var3) ** GOTO lbl99
                    throw null;
                }
                case 26: {
                    var2_1 /* !! */  = (int)nv.lkwr("llnc", lkwo(int ), (int)265);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl187
                }
                case 27: {
                    var2_1 /* !! */  = (int)nv.lkwr("llnd", lkwo(int ), (int)266);
                    if (!var3) ** GOTO lbl72
                    throw null;
                }
lbl179:
                // 3 sources

                case 28: {
                    var2_1 /* !! */  = (int)nv.lkwr("llne", lkwo(int ), (int)267);
                    if (!var3) ** GOTO lbl62
                    throw null;
                }
lbl183:
                // 2 sources

                case 29: {
                    var2_1 /* !! */  = (int)nv.lkwr("llnf", lkwo(int ), (int)268);
                    if (!var3) ** GOTO lbl113
                    throw null;
                }
lbl187:
                // 4 sources

                case 30: {
                    var2_1 /* !! */  = (int)nv.lkwr("llng", lkwo(int ), (int)269);
                    if (!var3) ** GOTO lbl57
                    throw null;
                }
                case 31: {
                    var2_1 /* !! */  = (int)nv.lkwr("llnh", lkwo(int ), (int)270);
                    if (!var3) ** GOTO lbl118
                    throw null;
                }
lbl195:
                // 2 sources

                case 32: {
                    var2_1 /* !! */  = (int)nv.lkwr("llni", lkwo(int ), (int)271);
                    if (!var3) ** GOTO lbl183
                    throw null;
                }
lbl199:
                // 3 sources

                case 33: {
                    var2_1 /* !! */  = (int)nv.lkwr("llnj", lkwo(int ), (int)272);
                    if (!var3) ** GOTO lbl108
                    throw null;
                }
                case 34: 
            }
            break;
        }
        var2_1 /* !! */  = (int)nv.lkwr("llnk", lkwo(int ), (int)273);
        ** while (!var3)
lbl206:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static nu find(class_1792 var0) {
        block34: {
            v0 /* !! */  = nv.ud;
            if (true) ** GOTO lbl5
            block20: while (true) {
                v0 /* !! */  = (long)(v1 - nv.lkwr("lltg", lkwv(int ), (int)210));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1299925688: {
                        v1 = nv.lkwr("llth", lkwv(int ), (int)211);
                        continue block20;
                    }
                    case 991968262: {
                        v1 = nv.lkwr("llti", lkwv(int ), (int)212);
                        continue block20;
                    }
                    case 1637199440: {
                        break block20;
                    }
                }
                break;
            }
            var3_1 = nv.c;
            v2 /* !! */  = nv.ud;
            block21: while (true) {
                switch ((int)v2 /* !! */ ) {
                    case -2087119273: {
                        v2 /* !! */  = (long)(nv.lkwr("lltk", lkwv(int ), (int)214) - nv.lkwr("lltj", lkwv(int ), (int)213));
                        continue block21;
                    }
                    case 1637199440: {
                        break block21;
                    }
                }
                break;
            }
            var2_2 /* !! */  = nv.b;
            v3 /* !! */  = nv.ud;
            if (true) ** GOTO lbl28
            block22: while (true) {
                v3 /* !! */  = (long)(v4 - nv.lkwr("lltl", lkwv(int ), (int)215));
lbl28:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1672797539: {
                        v4 = nv.lkwr("lltm", lkwv(int ), (int)216);
                        continue block22;
                    }
                    case 1637199440: {
                        break block22;
                    }
                    case 1872029082: {
                        v4 = nv.lkwr("lltn", lkwv(int ), (int)217);
                        continue block22;
                    }
                }
                break;
            }
            var1_3 = nv.a;
            if (var3_1) {
                throw null;
            }
            if (var1_3 != false) return null;
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block23: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 != false) return null;
                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("llto", lkwv(int ), (int)218)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v5 /* !! */  == nv.lkwr("lltp", lkwo(int ), (int)373)) {
                                v6 = (nw)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_1799;)Z, lambda$find$0(net.minecraft.class_1792 net.minecraft.class_1799 ), (Lnet/minecraft/class_1799;)Z)((class_1792)var0);
                                ** break;
                            }
                            v5 /* !! */  = (long)nv.lkwr("lltq", lkwo(int ), (int)374);
                        }
                    }
                    case 0: {
                        ** GOTO lbl66
                    }
                    case 3: {
                        break block34;
                    }
lbl59:
                    // 1 sources

                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lltr", lkwv(int ), (int)219)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v7 /* !! */  == nv.lkwr("llts", lkwo(int ), (int)375)) {
                            return nv.find(v6);
                        }
                        v7 /* !! */  = (long)nv.lkwr("lltt", lkwo(int ), (int)376);
                    }
lbl66:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)nv.lkwr("lltu", lkwo(int ), (int)377);
                        cfr_temp_0 = 2;
                        if (!var3_1) continue block23;
                        throw null;
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)nv.lkwr("lltw", lkwo(int ), (int)379);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 1: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)nv.lkwr("lltv", lkwo(int ), (int)378);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)nv.lkwr("lltx", lkwo(int ), (int)380);
        ** while (!var3_1)
lbl84:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lojh() {
        nv.lkww[0] = -9056423756445327190L;
        nv.lkww[1] = 6459929136264516766L;
        nv.lkww[2] = 2644796842338925702L;
        nv.lkww[3] = -8835481635032104326L;
        nv.lkww[4] = 3550251805906989590L;
        nv.lkww[5] = -7865145608249505809L;
        nv.lkww[6] = 5956317550917256200L;
        nv.lkww[7] = -467464451123530644L;
        nv.lkww[8] = -1370888513112514722L;
        nv.lkww[9] = 2581908612310602294L;
        nv.lkww[10] = -4325660751729068214L;
        nv.lkww[11] = -2541416587288516830L;
        nv.lkww[12] = -1114656734737996129L;
        nv.lkww[13] = -5682533581367761966L;
        nv.lkww[14] = -2234068893773382037L;
        nv.lkww[15] = -3415383257463080111L;
        nv.lkww[16] = 7212692882739258839L;
        nv.lkww[17] = -6297698659938687669L;
        nv.lkww[18] = 7728148659992985451L;
        nv.lkww[19] = 3939753585416228073L;
        nv.lkww[20] = -6709255119750848930L;
        nv.lkww[21] = 331007062097227256L;
        nv.lkww[22] = 6082383308320320558L;
        nv.lkww[23] = -2529553940021753548L;
        nv.lkww[24] = -1842671278054053457L;
        nv.lkww[25] = -6117278751957115408L;
        nv.lkww[26] = 4993159460416656463L;
        nv.lkww[27] = -2908608967428101603L;
        nv.lkww[28] = -615242738465983336L;
        nv.lkww[29] = 233324636963123577L;
        nv.lkww[30] = 5027578796536072744L;
        nv.lkww[31] = 6868059013606078769L;
        nv.lkww[32] = 1400624652314322727L;
        nv.lkww[33] = -3497437297520942845L;
        nv.lkww[34] = 4632467281667223742L;
        nv.lkww[35] = -696901774575016167L;
        nv.lkww[36] = 2522505228924696800L;
        nv.lkww[37] = -5751017765615550725L;
        nv.lkww[38] = 2769564083660329686L;
        nv.lkww[39] = 5288302398786363525L;
        nv.lkww[40] = 2535899231860986619L;
        nv.lkww[41] = -6633513192285599156L;
        nv.lkww[42] = -4497834303923156651L;
        nv.lkww[43] = -2294592330089984115L;
        nv.lkww[44] = 4476886984928590776L;
        nv.lkww[45] = -5418436873378226202L;
        nv.lkww[46] = -4173865983837422507L;
        nv.lkww[47] = 1479878027148629265L;
        nv.lkww[48] = -3983074290194209319L;
        nv.lkww[49] = -1496359182365789588L;
        nv.lkww[50] = -1258860843717392788L;
        nv.lkww[51] = -1776996110156053876L;
        nv.lkww[52] = -6959263991987370901L;
        nv.lkww[53] = -8182599205053384436L;
        nv.lkww[54] = -2475326369010809477L;
        nv.lkww[55] = -4052695286512565284L;
        nv.lkww[56] = 6729555129319326918L;
        nv.lkww[57] = 184349740712368788L;
        nv.lkww[58] = -4077330898166457707L;
        nv.lkww[59] = 6579000547938516063L;
        nv.lkww[60] = 3542264675135898441L;
        nv.lkww[61] = -752970242894073904L;
        nv.lkww[62] = 416108181487437139L;
        nv.lkww[63] = 3782533024111345638L;
        nv.lkww[64] = -2318307875875458944L;
        nv.lkww[65] = -5786266847089270611L;
        nv.lkww[66] = 9128013117930147656L;
        nv.lkww[67] = 5785195113396236961L;
        nv.lkww[68] = 8383173849627680105L;
        nv.lkww[69] = 6212592496857781113L;
        nv.lkww[70] = 740056044112849273L;
        nv.lkww[71] = 1431383881126016189L;
        nv.lkww[72] = 7043400378506970271L;
        nv.lkww[73] = -1005140013819329337L;
        nv.lkww[74] = -7827900302016839426L;
        nv.lkww[75] = 6168850109552766006L;
        nv.lkww[76] = -8450281836863487480L;
        nv.lkww[77] = 1964585535097792350L;
        nv.lkww[78] = 6426130265641002415L;
        nv.lkww[79] = -3405064116831526269L;
        nv.lkww[80] = 2034253037122418512L;
        nv.lkww[81] = -1909204903934004521L;
        nv.lkww[82] = 8473700488390046614L;
        nv.lkww[83] = -1309563507089530696L;
        nv.lkww[84] = 3640643317536865946L;
        nv.lkww[85] = 2699352712349276463L;
        nv.lkww[86] = -6311209776676373391L;
        nv.lkww[87] = 1136735695491457528L;
        nv.lkww[88] = -9118387794521817637L;
        nv.lkww[89] = -4147159398230850391L;
        nv.lkww[90] = -7242367885328069666L;
        nv.lkww[91] = 4161910676749891416L;
        nv.lkww[92] = -7339541888961129710L;
        nv.lkww[93] = 2339809092322972110L;
        nv.lkww[94] = 9149074603016190809L;
        nv.lkww[95] = 8729389607160098211L;
        nv.lkww[96] = -2009707692989514630L;
        nv.lkww[97] = -3402541628251118593L;
        nv.lkww[98] = 6409156238140795406L;
        nv.lkww[99] = -3696042502294797174L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void click(int var0, int var1_1, class_1713 var2_2) {
        v0 /* !! */  = nv.ud;
        if (true) ** GOTO lbl5
        block59: while (true) {
            v0 /* !! */  = (long)(v1 - nv.lkwr("lmli", lkwv(int ), (int)406));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -716569175: {
                    v1 = nv.lkwr("lmlj", lkwv(int ), (int)407);
                    continue block59;
                }
                case -419368290: {
                    v1 = nv.lkwr("lmlk", lkwv(int ), (int)408);
                    continue block59;
                }
                case 532360512: {
                    v1 = nv.lkwr("lmll", lkwv(int ), (int)409);
                    continue block59;
                }
                case 1637199440: {
                    break block59;
                }
            }
            break;
        }
        var5_3 = nv.c;
        v2 /* !! */  = nv.ud;
        if (true) ** GOTO lbl22
        block60: while (true) {
            v2 /* !! */  = (long)(v3 - nv.lkwr("lmlm", lkwv(int ), (int)410));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -870873119: {
                    v3 = nv.lkwr("lmln", lkwv(int ), (int)411);
                    continue block60;
                }
                case 219496513: {
                    v3 = nv.lkwr("lmlo", lkwv(int ), (int)412);
                    continue block60;
                }
                case 1277618952: {
                    v3 = nv.lkwr("lmlp", lkwv(int ), (int)413);
                    continue block60;
                }
                case 1637199440: {
                    break block60;
                }
            }
            break;
        }
        var4_4 /* !! */  = nv.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lmlq", lkwv(int ), (int)414)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == nv.lkwr("lmlr", lkwo(int ), (int)647)) break;
            v4 /* !! */  = (long)nv.lkwr("lmls", lkwo(int ), (int)648);
        }
        var3_5 = nv.a;
        if (var5_3) {
            throw null;
lbl43:
            // 7 sources

            return;
        }
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5 || var3_5) ** GOTO lbl43
                v5 /* !! */  = nv.ud;
                if (true) ** GOTO lbl53
                block63: while (true) {
                    v5 /* !! */  = (long)(v6 - nv.lkwr("lmlt", lkwv(int ), (int)415));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 495578645: {
                            v6 = nv.lkwr("lmlu", lkwv(int ), (int)416);
                            continue block63;
                        }
                        case 1148740935: {
                            v6 = nv.lkwr("lmlv", lkwv(int ), (int)417);
                            continue block63;
                        }
                        case 1637199440: {
                            break block63;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lmlw", lkwv(int ), (int)418)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == nv.lkwr("lmlx", lkwo(int ), (int)649)) break;
                    v7 /* !! */  = (long)nv.lkwr("lmly", lkwo(int ), (int)650);
                }
                if (nv.mc.field_1724 == null) ** GOTO lbl87
                if (var3_5) ** GOTO lbl43
                v8 /* !! */  = nv.ud;
                if (true) ** GOTO lbl73
                block65: while (true) {
                    v8 /* !! */  = (long)(nv.lkwr("lmma", lkwv(int ), (int)420) - nv.lkwr("lmlz", lkwv(int ), (int)419));
lbl73:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1545063307: {
                            continue block65;
                        }
                        case 1637199440: {
                            break block65;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lmmb", lkwv(int ), (int)421)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == nv.lkwr("lmmc", lkwo(int ), (int)651)) break;
                    v9 /* !! */  = (long)nv.lkwr("lmmd", lkwo(int ), (int)652);
                }
                if (nv.mc.field_1761 == null) ** GOTO lbl87
                if (var3_5) ** GOTO lbl43
                if (var0 != nv.lkwr("lmme", lkwo(int ), (int)653)) ** GOTO lbl89
                if (var3_5) ** GOTO lbl43
lbl87:
                // 3 sources

                if (var3_5 || var3_5) ** GOTO lbl43
                return;
lbl89:
                // 1 sources

                if (var3_5 || var3_5) ** GOTO lbl43
                v10 /* !! */  = nv.ud;
                if (true) ** GOTO lbl94
                block67: while (true) {
                    v10 /* !! */  = (long)(nv.lkwr("lmmg", lkwv(int ), (int)423) - nv.lkwr("lmmf", lkwv(int ), (int)422));
lbl94:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -407445796: {
                            continue block67;
                        }
                        case 1637199440: {
                            break block67;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("lmmh", lkwv(int ), (int)424)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == nv.lkwr("lmmi", lkwo(int ), (int)654)) break;
                    v11 /* !! */  = (long)nv.lkwr("lmmj", lkwo(int ), (int)655);
                }
                v12 = nv.mc.field_1761;
                v13 /* !! */  = nv.ud;
                if (true) ** GOTO lbl109
                block69: while (true) {
                    v13 /* !! */  = (long)(v14 - nv.lkwr("lmmk", lkwv(int ), (int)425));
lbl109:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -58630413: {
                            v14 = nv.lkwr("lmml", lkwv(int ), (int)426);
                            continue block69;
                        }
                        case 1637199440: {
                            break block69;
                        }
                        case 1706296255: {
                            v14 = nv.lkwr("lmmm", lkwv(int ), (int)427);
                            continue block69;
                        }
                        case 1741034712: {
                            v14 = nv.lkwr("lmmn", lkwv(int ), (int)428);
                            continue block69;
                        }
                    }
                    break;
                }
                v15 /* !! */  = nv.ud;
                if (true) ** GOTO lbl125
                block70: while (true) {
                    v15 /* !! */  = (long)(v16 - nv.lkwr("lmmo", lkwv(int ), (int)429));
lbl125:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case 196633451: {
                            v16 = nv.lkwr("lmmp", lkwv(int ), (int)430);
                            continue block70;
                        }
                        case 1295128254: {
                            v16 = nv.lkwr("lmmq", lkwv(int ), (int)431);
                            continue block70;
                        }
                        case 1637199440: {
                            break block70;
                        }
                        case 1770078365: {
                            v16 = nv.lkwr("lmmr", lkwv(int ), (int)432);
                            continue block70;
                        }
                    }
                    break;
                }
                v17 = nv.mc.field_1724;
                v18 /* !! */  = nv.ud;
                if (true) ** GOTO lbl142
                block71: while (true) {
                    v18 /* !! */  = (long)(v19 - nv.lkwr("lmms", lkwv(int ), (int)433));
lbl142:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1254479749: {
                            v19 = nv.lkwr("lmmt", lkwv(int ), (int)434);
                            continue block71;
                        }
                        case -1046992254: {
                            v19 = nv.lkwr("lmmu", lkwv(int ), (int)435);
                            continue block71;
                        }
                        case 945093493: {
                            v19 = nv.lkwr("lmmv", lkwv(int ), (int)436);
                            continue block71;
                        }
                        case 1637199440: {
                            break block71;
                        }
                    }
                    break;
                }
                v20 = v17.field_7512;
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("lmmw", lkwv(int ), (int)437)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == nv.lkwr("lmmx", lkwo(int ), (int)656)) break;
                    v21 /* !! */  = (long)nv.lkwr("lmmy", lkwo(int ), (int)657);
                }
                v22 = v20.field_7763;
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_5 = nv.ud - nv.lkwr("lmmz", lkwv(int ), (int)438)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == nv.lkwr("lmna", lkwo(int ), (int)658)) break;
                    v23 /* !! */  = (long)nv.lkwr("lmnb", lkwo(int ), (int)659);
                }
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_6 = nv.ud - nv.lkwr("lmnc", lkwv(int ), (int)439)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == nv.lkwr("lmnd", lkwo(int ), (int)660)) break;
                    v24 /* !! */  = (long)nv.lkwr("lmne", lkwo(int ), (int)661);
                }
                v25 = nv.mc.field_1724;
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_7 = nv.ud - nv.lkwr("lmnf", lkwv(int ), (int)440)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == nv.lkwr("lmng", lkwo(int ), (int)662)) break;
                    v26 /* !! */  = (long)nv.lkwr("lmnh", lkwo(int ), (int)663);
                }
                v12.method_2906(v22, var0, var1_1, var2_2, (class_1657)v25);
                if (!var3_5 && !var3_5) ** break;
                ** continue;
                return;
            }
            case 0: {
                var4_4 /* !! */  = (int)nv.lkwr("lmni", lkwo(int ), (int)664);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl186:
            // 2 sources

            case 1: {
                var4_4 /* !! */  = (int)nv.lkwr("lmnj", lkwo(int ), (int)665);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl191:
            // 5 sources

            case 2: {
                var4_4 /* !! */  = (int)nv.lkwr("lmnk", lkwo(int ), (int)666);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl230
            }
            case 3: {
                var4_4 /* !! */  = (int)nv.lkwr("lmnl", lkwo(int ), (int)667);
                if (!var5_3) ** GOTO lbl191
                throw null;
            }
            case 4: {
                var4_4 /* !! */  = (int)nv.lkwr("lmnm", lkwo(int ), (int)668);
                if (!var5_3) ** GOTO lbl186
                throw null;
            }
lbl204:
            // 2 sources

            case 5: {
                var4_4 /* !! */  = (int)nv.lkwr("lmnn", lkwo(int ), (int)669);
                if (!var5_3) break;
                throw null;
            }
lbl208:
            // 3 sources

            case 6: {
                var4_4 /* !! */  = (int)nv.lkwr("lmno", lkwo(int ), (int)670);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl230
            }
            case 7: {
                var4_4 /* !! */  = (int)nv.lkwr("lmnp", lkwo(int ), (int)671);
                if (!var5_3) ** GOTO lbl191
                throw null;
            }
lbl217:
            // 2 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)nv.lkwr("lmnq", lkwo(int ), (int)672);
                    if (!var5_3) ** GOTO lbl191
                    throw null;
                }
            }
            case 9: {
                var4_4 /* !! */  = (int)nv.lkwr("lmnr", lkwo(int ), (int)673);
                if (!var5_3) ** GOTO lbl208
                throw null;
            }
lbl226:
            // 2 sources

            case 10: {
                var4_4 /* !! */  = (int)nv.lkwr("lmns", lkwo(int ), (int)674);
                if (!var5_3) ** GOTO lbl217
                throw null;
            }
lbl230:
            // 3 sources

            case 11: {
                var4_4 /* !! */  = (int)nv.lkwr("lmnt", lkwo(int ), (int)675);
                if (!var5_3) ** GOTO lbl226
                throw null;
            }
            case 12: {
                var4_4 /* !! */  = (int)nv.lkwr("lmnu", lkwo(int ), (int)676);
                if (!var5_3) ** GOTO lbl191
                throw null;
            }
            case 13: 
        }
        var4_4 /* !! */  = (int)nv.lkwr("lmnv", lkwo(int ), (int)677);
        ** while (!var5_3)
lbl241:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int currentSlot() {
        block53: {
            v0 /* !! */  = nv.ud;
            if (true) ** GOTO lbl5
            block36: while (true) {
                v0 /* !! */  = (long)(nv.lkwr("lnyj", lkwv(int ), (int)905) - nv.lkwr("lnyi", lkwv(int ), (int)904));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1185470572: {
                        continue block36;
                    }
                    case 1637199440: {
                        break block36;
                    }
                }
                break;
            }
            var2 = nv.c;
            v1 /* !! */  = nv.ud;
            if (true) ** GOTO lbl15
            block37: while (true) {
                v1 /* !! */  = (long)(v2 - nv.lkwr("lnyk", lkwv(int ), (int)906));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1088127104: {
                        v2 = nv.lkwr("lnyl", lkwv(int ), (int)907);
                        continue block37;
                    }
                    case -970195516: {
                        v2 = nv.lkwr("lnym", lkwv(int ), (int)908);
                        continue block37;
                    }
                    case 520253969: {
                        v2 = nv.lkwr("lnyn", lkwv(int ), (int)909);
                        continue block37;
                    }
                    case 1637199440: {
                        break block37;
                    }
                }
                break;
            }
            var1_1 /* !! */  = nv.b;
            v3 /* !! */  = nv.ud;
            if (true) ** GOTO lbl32
            block38: while (true) {
                v3 /* !! */  = (long)(v4 - nv.lkwr("lnyo", lkwv(int ), (int)910));
lbl32:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -2046577569: {
                        v4 = nv.lkwr("lnyp", lkwv(int ), (int)911);
                        continue block38;
                    }
                    case -256262549: {
                        v4 = nv.lkwr("lnyq", lkwv(int ), (int)912);
                        continue block38;
                    }
                    case 1637199440: {
                        break block38;
                    }
                    case 2008777955: {
                        v4 = nv.lkwr("lnyr", lkwv(int ), (int)913);
                        continue block38;
                    }
                }
                break;
            }
            var0_2 = nv.a;
            if (var2) {
                throw null;
lbl47:
                // 3 sources

                return (int)nv.lkwr("lnys", lkwo(int ), (int)1163);
            }
            if (var0_2 || var0_2) ** GOTO lbl47
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lnyt", lkwv(int ), (int)914)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == nv.lkwr("lnyu", lkwo(int ), (int)1164)) break;
                v5 /* !! */  = (long)nv.lkwr("lnyv", lkwo(int ), (int)1165);
            }
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lnyw", lkwv(int ), (int)915)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == nv.lkwr("lnyx", lkwo(int ), (int)1166)) break;
                v6 /* !! */  = (long)nv.lkwr("lnyy", lkwo(int ), (int)1167);
            }
            if (nv.mc.field_1724 == null) break block53;
            if (var0_2) ** GOTO lbl47
            v7 /* !! */  = nv.ud;
            if (true) ** GOTO lbl66
            block42: while (true) {
                v7 /* !! */  = (long)(nv.lkwr("lnza", lkwv(int ), (int)917) - nv.lkwr("lnyz", lkwv(int ), (int)916));
lbl66:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -143685845: {
                        continue block42;
                    }
                    case 1637199440: {
                        break block42;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lnzb", lkwv(int ), (int)918)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == nv.lkwr("lnzc", lkwo(int ), (int)1168)) break;
                v8 /* !! */  = (long)nv.lkwr("lnzd", lkwo(int ), (int)1169);
            }
            v9 = nv.mc.field_1724;
            v10 /* !! */  = nv.ud;
            if (true) ** GOTO lbl81
            block44: while (true) {
                v10 /* !! */  = (long)(v11 - nv.lkwr("lnze", lkwv(int ), (int)919));
lbl81:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -2071213495: {
                        v11 = nv.lkwr("lnzf", lkwv(int ), (int)920);
                        continue block44;
                    }
                    case 1271699508: {
                        v11 = nv.lkwr("lnzg", lkwv(int ), (int)921);
                        continue block44;
                    }
                    case 1596525042: {
                        v11 = nv.lkwr("lnzh", lkwv(int ), (int)922);
                        continue block44;
                    }
                    case 1637199440: {
                        break block44;
                    }
                }
                break;
            }
            v12 = v9.method_31548();
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("lnzi", lkwv(int ), (int)923)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == nv.lkwr("lnzj", lkwo(int ), (int)1170)) break;
                v13 /* !! */  = (long)nv.lkwr("lnzk", lkwo(int ), (int)1171);
            }
            v14 /* !! */  = (CallSite)v12.method_67532();
            if (var2) {
                throw null;
            }
            ** GOTO lbl110
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                v14 /* !! */  = nv.lkwr("lnzl", lkwo(int ), (int)1172);
lbl110:
                // 2 sources

                return (int)v14 /* !! */ ;
            }
lbl111:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)nv.lkwr("lnzm", lkwo(int ), (int)1173);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl122
                    break;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)nv.lkwr("lnzn", lkwo(int ), (int)1174);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl122:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)nv.lkwr("lnzo", lkwo(int ), (int)1175);
                if (!var2) break;
                throw null;
            }
            case 3: {
                var1_1 /* !! */  = (int)nv.lkwr("lnzp", lkwo(int ), (int)1176);
                if (!var2) break;
                throw null;
            }
            case 4: {
                var1_1 /* !! */  = (int)nv.lkwr("lnzq", lkwo(int ), (int)1177);
                if (!var2) ** GOTO lbl111
                throw null;
            }
            case 5: {
                do {
                    var1_1 /* !! */  = (int)nv.lkwr("lnzr", lkwo(int ), (int)1178);
                } while (!var2);
                throw null;
            }
lbl139:
            // 2 sources

            case 6: {
                var1_1 /* !! */  = (int)nv.lkwr("lnzs", lkwo(int ), (int)1179);
                if (!var2) break;
                throw null;
            }
            case 7: 
        }
        var1_1 /* !! */  = (int)nv.lkwr("lnzt", lkwo(int ), (int)1180);
        ** while (!var2)
lbl146:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$findHotbar$2(class_1792 var0, class_1799 var1_1) {
        block43: {
            v0 /* !! */  = nv.ud;
            if (true) ** GOTO lbl5
            block29: while (true) {
                v0 /* !! */  = (long)(nv.lkwr("loft", lkwv(int ), (int)1001) - nv.lkwr("lofs", lkwv(int ), (int)1000));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -976477160: {
                        continue block29;
                    }
                    case 1637199440: {
                        break block29;
                    }
                }
                break;
            }
            var4_2 = nv.c;
            v1 /* !! */  = nv.ud;
            if (true) ** GOTO lbl15
            block30: while (true) {
                v1 /* !! */  = (long)(v2 - nv.lkwr("lofu", lkwv(int ), (int)1002));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -445437710: {
                        v2 = nv.lkwr("lofv", lkwv(int ), (int)1003);
                        continue block30;
                    }
                    case 918173089: {
                        v2 = nv.lkwr("lofw", lkwv(int ), (int)1004);
                        continue block30;
                    }
                    case 1637199440: {
                        break block30;
                    }
                }
                break;
            }
            var3_3 /* !! */  = nv.b;
            v3 /* !! */  = nv.ud;
            if (true) ** GOTO lbl29
            block31: while (true) {
                v3 /* !! */  = (long)(v4 - nv.lkwr("lofx", lkwv(int ), (int)1005));
lbl29:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -458708995: {
                        v4 = nv.lkwr("lofy", lkwv(int ), (int)1006);
                        continue block31;
                    }
                    case 1637199440: {
                        break block31;
                    }
                    case 1751052262: {
                        v4 = nv.lkwr("lofz", lkwv(int ), (int)1007);
                        continue block31;
                    }
                }
                break;
            }
            var2_4 = nv.a;
            if (var4_2) {
                throw null;
lbl41:
                // 3 sources

                return (boolean)nv.lkwr("loga", lkwo(int ), (int)1259);
            }
            if (var2_4 || var2_4) ** GOTO lbl41
            v5 /* !! */  = nv.ud;
            if (true) ** GOTO lbl48
            block33: while (true) {
                v5 /* !! */  = (long)(v6 - nv.lkwr("logb", lkwv(int ), (int)1008));
lbl48:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1849058748: {
                        v6 = nv.lkwr("logc", lkwv(int ), (int)1009);
                        continue block33;
                    }
                    case 305052192: {
                        v6 = nv.lkwr("logd", lkwv(int ), (int)1010);
                        continue block33;
                    }
                    case 1637199440: {
                        break block33;
                    }
                }
                break;
            }
            if (var1_1.method_7909() != var0) break block43;
            if (var2_4) ** GOTO lbl41
            v7 = nv.lkwr("loge", lkwo(int ), (int)1260);
            if (var4_2) {
                throw null;
            }
            ** GOTO lbl70
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v7 = nv.lkwr("logf", lkwo(int ), (int)1261);
lbl70:
                // 2 sources

                return (boolean)v7;
            }
            case 0: {
                var3_3 /* !! */  = (int)nv.lkwr("logg", lkwo(int ), (int)1262);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl90
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)nv.lkwr("logh", lkwo(int ), (int)1263);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)nv.lkwr("logi", lkwo(int ), (int)1264);
                if (!var4_2) break;
                throw null;
            }
lbl85:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)nv.lkwr("logj", lkwo(int ), (int)1265);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl94
            }
lbl90:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)nv.lkwr("logk", lkwo(int ), (int)1266);
                if (var4_2) {
                    throw null;
                }
            }
lbl94:
            // 4 sources

            case 5: {
                var3_3 /* !! */  = (int)nv.lkwr("logl", lkwo(int ), (int)1267);
                if (!var4_2) ** GOTO lbl90
                throw null;
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)nv.lkwr("logm", lkwo(int ), (int)1268);
                    if (!var4_2) ** GOTO lbl85
                    throw null;
                }
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)nv.lkwr("logn", lkwo(int ), (int)1269);
        ** while (!var4_2)
lbl106:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_1735 findSlot(class_1792 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lmaw", lkwv(int ), (int)284)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nv.lkwr("lmax", lkwo(int ), (int)497)) break;
            v0 /* !! */  = (long)nv.lkwr("lmay", lkwo(int ), (int)498);
        }
        var3_1 = nv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lmaz", lkwv(int ), (int)285)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nv.lkwr("lmba", lkwo(int ), (int)499)) break;
            v1 /* !! */  = (long)nv.lkwr("lmbb", lkwo(int ), (int)500);
        }
        var2_2 = nv.b;
        v2 /* !! */  = nv.ud;
        if (true) ** GOTO lbl17
        block12: while (true) {
            v2 /* !! */  = (long)(v3 - nv.lkwr("lmbc", lkwv(int ), (int)286));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1900875268: {
                    v3 = nv.lkwr("lmbd", lkwv(int ), (int)287);
                    continue block12;
                }
                case 1637199440: {
                    break block12;
                }
                case 1769860977: {
                    v3 = nv.lkwr("lmbe", lkwv(int ), (int)288);
                    continue block12;
                }
            }
            break;
        }
        var1_3 = nv.a;
        if (var3_1) {
            throw null;
lbl29:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl32:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lmbf", lkwv(int ), (int)289)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == nv.lkwr("lmbg", lkwo(int ), (int)501)) break;
            v4 /* !! */  = (long)nv.lkwr("lmbh", lkwo(int ), (int)502);
        }
        v5 = (Predicate<class_1735>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$findSlot$3(net.minecraft.class_1792 net.minecraft.class_1735 ), (Lnet/minecraft/class_1735;)Z)((class_1792)var0);
        v6 /* !! */  = nv.ud;
        if (true) ** GOTO lbl42
        block15: while (true) {
            v6 /* !! */  = (long)(v7 - nv.lkwr("lmbi", lkwv(int ), (int)290));
lbl42:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1945329486: {
                    v7 = nv.lkwr("lmbj", lkwv(int ), (int)291);
                    continue block15;
                }
                case 573130175: {
                    v7 = nv.lkwr("lmbk", lkwv(int ), (int)292);
                    continue block15;
                }
                case 1637199440: {
                    break block15;
                }
            }
            break;
        }
        return nv.findSlot(v5, null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void silentUseHotbarItem(int var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lmyw", lkwv(int ), (int)581)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nv.lkwr("lmyx", lkwo(int ), (int)824)) break;
            v0 /* !! */  = (long)nv.lkwr("lmyy", lkwo(int ), (int)825);
        }
        var3_1 = nv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lmyz", lkwv(int ), (int)582)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nv.lkwr("lmza", lkwo(int ), (int)826)) break;
            v1 /* !! */  = (long)nv.lkwr("lmzb", lkwo(int ), (int)827);
        }
        var2_2 /* !! */  = nv.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = nv.ud;
                if (true) ** GOTO lbl20
                block43: while (true) {
                    v2 /* !! */  = (long)(v3 - nv.lkwr("lmzc", lkwv(int ), (int)583));
lbl20:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1497608300: {
                            v3 = nv.lkwr("lmzd", lkwv(int ), (int)584);
                            continue block43;
                        }
                        case 1637199440: {
                            break block43;
                        }
                        case 1897309046: {
                            v3 = nv.lkwr("lmze", lkwv(int ), (int)585);
                            continue block43;
                        }
                    }
                    break;
                }
                var1_3 = nv.a;
                if (var3_1) {
                    throw null;
lbl32:
                    // 4 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl32
                v4 /* !! */  = nv.ud;
                if (true) ** GOTO lbl39
                block45: while (true) {
                    v4 /* !! */  = (long)(v5 - nv.lkwr("lmzf", lkwv(int ), (int)586));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 373961860: {
                            v5 = nv.lkwr("lmzg", lkwv(int ), (int)587);
                            continue block45;
                        }
                        case 430771794: {
                            v5 = nv.lkwr("lmzh", lkwv(int ), (int)588);
                            continue block45;
                        }
                        case 1022965641: {
                            v5 = nv.lkwr("lmzi", lkwv(int ), (int)589);
                            continue block45;
                        }
                        case 1637199440: {
                            break block45;
                        }
                    }
                    break;
                }
                v6 /* !! */  = nv.ud;
                if (true) ** GOTO lbl55
                block46: while (true) {
                    v6 /* !! */  = (long)(nv.lkwr("lmzk", lkwv(int ), (int)591) - nv.lkwr("lmzj", lkwv(int ), (int)590));
lbl55:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 1637199440: {
                            break block46;
                        }
                        case 2107190442: {
                            continue block46;
                        }
                    }
                    break;
                }
                if (nv.mc.field_1724 != null) ** GOTO lbl63
                if (var1_3 || var1_3) ** GOTO lbl32
                return;
lbl63:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl32
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lmzl", lkwv(int ), (int)592)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == nv.lkwr("lmzm", lkwo(int ), (int)828)) break;
                    v7 /* !! */  = (long)nv.lkwr("lmzn", lkwo(int ), (int)829);
                }
                v8 /* !! */  = nv.ud;
                if (true) ** GOTO lbl73
                block48: while (true) {
                    v8 /* !! */  = (long)(v9 - nv.lkwr("lmzo", lkwv(int ), (int)593));
lbl73:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1896008069: {
                            v9 = nv.lkwr("lmzp", lkwv(int ), (int)594);
                            continue block48;
                        }
                        case 575112708: {
                            v9 = nv.lkwr("lmzq", lkwv(int ), (int)595);
                            continue block48;
                        }
                        case 1637199440: {
                            break block48;
                        }
                    }
                    break;
                }
                v10 = nv.mc.field_1724;
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("lmzr", lkwv(int ), (int)596)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == nv.lkwr("lmzs", lkwo(int ), (int)830)) break;
                    v11 /* !! */  = (long)nv.lkwr("lmzt", lkwo(int ), (int)831);
                }
                v12 = v10.method_36454();
                v13 /* !! */  = nv.ud;
                if (true) ** GOTO lbl93
                block50: while (true) {
                    v13 /* !! */  = (long)(nv.lkwr("lmzv", lkwv(int ), (int)598) - nv.lkwr("lmzu", lkwv(int ), (int)597));
lbl93:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -2111637336: {
                            continue block50;
                        }
                        case 1637199440: {
                            break block50;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("lmzw", lkwv(int ), (int)599)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == nv.lkwr("lmzx", lkwo(int ), (int)832)) break;
                    v14 /* !! */  = (long)nv.lkwr("lmzy", lkwo(int ), (int)833);
                }
                v15 = nv.mc.field_1724;
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_5 = nv.ud - nv.lkwr("lmzz", lkwv(int ), (int)600)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == nv.lkwr("lnaa", lkwo(int ), (int)834)) break;
                    v16 /* !! */  = (long)nv.lkwr("lnab", lkwo(int ), (int)835);
                }
                v17 = v15.method_36455();
                v18 /* !! */  = nv.ud;
                if (true) ** GOTO lbl114
                block53: while (true) {
                    v18 /* !! */  = (long)(nv.lkwr("lnad", lkwv(int ), (int)602) - nv.lkwr("lnac", lkwv(int ), (int)601));
lbl114:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case 1526310660: {
                            continue block53;
                        }
                        case 1637199440: {
                            break block53;
                        }
                    }
                    break;
                }
                nv.silentUseHotbarItem(var0, v12, v17);
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl122:
            // 4 sources

            case 0: {
                var2_2 /* !! */  = (int)nv.lkwr("lnae", lkwo(int ), (int)836);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl159
            }
            case 1: {
                var2_2 /* !! */  = (int)nv.lkwr("lnaf", lkwo(int ), (int)837);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl159
            }
            case 2: {
                var2_2 /* !! */  = (int)nv.lkwr("lnag", lkwo(int ), (int)838);
                if (!var3_1) ** GOTO lbl122
                throw null;
            }
lbl136:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)nv.lkwr("lnah", lkwo(int ), (int)839);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 4: {
                var2_2 /* !! */  = (int)nv.lkwr("lnai", lkwo(int ), (int)840);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 5: {
                var2_2 /* !! */  = (int)nv.lkwr("lnaj", lkwo(int ), (int)841);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 6: {
                var2_2 /* !! */  = (int)nv.lkwr("lnak", lkwo(int ), (int)842);
                if (!var3_1) ** GOTO lbl136
                throw null;
            }
lbl155:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)nv.lkwr("lnal", lkwo(int ), (int)843);
                if (var3_1) {
                    throw null;
                }
            }
lbl159:
            // 5 sources

            case 8: {
                var2_2 /* !! */  = (int)nv.lkwr("lnam", lkwo(int ), (int)844);
                if (!var3_1) ** GOTO lbl122
                throw null;
            }
lbl163:
            // 2 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nv.lkwr("lnan", lkwo(int ), (int)845);
                    if (!var3_1) ** GOTO lbl122
                    throw null;
                }
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)nv.lkwr("lnao", lkwo(int ), (int)846);
        ** while (!var3_1)
lbl171:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lojd() {
        nv.lkwq[900] = -71208664;
        nv.lkwq[901] = -1061741182;
        nv.lkwq[902] = -1724654355;
        nv.lkwq[903] = -1242874711;
        nv.lkwq[904] = -1761510830;
        nv.lkwq[905] = 136229207;
        nv.lkwq[906] = -988640958;
        nv.lkwq[907] = -201739653;
        nv.lkwq[908] = 1805011915;
        nv.lkwq[909] = -674421977;
        nv.lkwq[910] = -123997748;
        nv.lkwq[911] = -655735871;
        nv.lkwq[912] = 444805869;
        nv.lkwq[913] = 1353652344;
        nv.lkwq[914] = -991484656;
        nv.lkwq[915] = -171596455;
        nv.lkwq[916] = 1446918750;
        nv.lkwq[917] = 1360002646;
        nv.lkwq[918] = -1756225133;
        nv.lkwq[919] = -1436537064;
        nv.lkwq[920] = -1238017021;
        nv.lkwq[921] = -245097512;
        nv.lkwq[922] = 266515047;
        nv.lkwq[923] = 1882849772;
        nv.lkwq[924] = -1147253313;
        nv.lkwq[925] = 798927923;
        nv.lkwq[926] = -304283618;
        nv.lkwq[927] = -863080024;
        nv.lkwq[928] = -514935624;
        nv.lkwq[929] = -824911092;
        nv.lkwq[930] = -319498009;
        nv.lkwq[931] = 1058744962;
        nv.lkwq[932] = -1306447465;
        nv.lkwq[933] = -1381375207;
        nv.lkwq[934] = 1873911657;
        nv.lkwq[935] = 1302872860;
        nv.lkwq[936] = 1193063998;
        nv.lkwq[937] = -675401142;
        nv.lkwq[938] = 2128163096;
        nv.lkwq[939] = -914019259;
        nv.lkwq[940] = 1805527111;
        nv.lkwq[941] = 462309471;
        nv.lkwq[942] = 392359209;
        nv.lkwq[943] = -1435812954;
        nv.lkwq[944] = 227325384;
        nv.lkwq[945] = -1746840972;
        nv.lkwq[946] = -884093167;
        nv.lkwq[947] = -412270867;
        nv.lkwq[948] = 1414738699;
        nv.lkwq[949] = -2002781269;
        nv.lkwq[950] = -1050585320;
        nv.lkwq[951] = -1431422487;
        nv.lkwq[952] = -752911978;
        nv.lkwq[953] = -1232182046;
        nv.lkwq[954] = -1865516207;
        nv.lkwq[955] = -1849311156;
        nv.lkwq[956] = -763023569;
        nv.lkwq[957] = -1150703694;
        nv.lkwq[958] = -1633529762;
        nv.lkwq[959] = 494032354;
        nv.lkwq[960] = -334558000;
        nv.lkwq[961] = -471912622;
        nv.lkwq[962] = -395831787;
        nv.lkwq[963] = -1076565520;
        nv.lkwq[964] = 2027173359;
        nv.lkwq[965] = -588789729;
        nv.lkwq[966] = -1093199835;
        nv.lkwq[967] = -1214251009;
        nv.lkwq[968] = 1604738455;
        nv.lkwq[969] = -632892687;
        nv.lkwq[970] = 1716800658;
        nv.lkwq[971] = -386983591;
        nv.lkwq[972] = 2055516773;
        nv.lkwq[973] = -1147910490;
        nv.lkwq[974] = -788689202;
        nv.lkwq[975] = -722490049;
        nv.lkwq[976] = -2139769921;
        nv.lkwq[977] = 1237826136;
        nv.lkwq[978] = 1528600471;
        nv.lkwq[979] = -249535719;
        nv.lkwq[980] = 934306405;
        nv.lkwq[981] = 1460461240;
        nv.lkwq[982] = -1442988023;
        nv.lkwq[983] = 536538226;
        nv.lkwq[984] = 869999857;
        nv.lkwq[985] = 113495946;
        nv.lkwq[986] = -785169492;
        nv.lkwq[987] = 1093765070;
        nv.lkwq[988] = -1596408152;
        nv.lkwq[989] = 33288683;
        nv.lkwq[990] = 1629983970;
        nv.lkwq[991] = -2042099660;
        nv.lkwq[992] = -91307865;
        nv.lkwq[993] = -673828271;
        nv.lkwq[994] = 503762015;
        nv.lkwq[995] = -1768263939;
        nv.lkwq[996] = 2116150526;
        nv.lkwq[997] = -1395823683;
        nv.lkwq[998] = -2118487164;
        nv.lkwq[999] = -346543995;
    }

    private static /* synthetic */ void lojc() {
        nv.lkwq[800] = 1932097839;
        nv.lkwq[801] = -460384520;
        nv.lkwq[802] = 1040739776;
        nv.lkwq[803] = 128275899;
        nv.lkwq[804] = 1673648320;
        nv.lkwq[805] = 1138737575;
        nv.lkwq[806] = -1597534707;
        nv.lkwq[807] = -1503528686;
        nv.lkwq[808] = -562240444;
        nv.lkwq[809] = 89366980;
        nv.lkwq[810] = -1637095251;
        nv.lkwq[811] = 1021394884;
        nv.lkwq[812] = -1755978708;
        nv.lkwq[813] = -473298789;
        nv.lkwq[814] = -583482277;
        nv.lkwq[815] = -1870523321;
        nv.lkwq[816] = 423118965;
        nv.lkwq[817] = -705353191;
        nv.lkwq[818] = 642516941;
        nv.lkwq[819] = -1025925619;
        nv.lkwq[820] = 1787952565;
        nv.lkwq[821] = 1355128962;
        nv.lkwq[822] = -1076975690;
        nv.lkwq[823] = -410633205;
        nv.lkwq[824] = -1090209814;
        nv.lkwq[825] = 811914825;
        nv.lkwq[826] = 1149026808;
        nv.lkwq[827] = -1377062643;
        nv.lkwq[828] = -1889857541;
        nv.lkwq[829] = -932761066;
        nv.lkwq[830] = -1702021935;
        nv.lkwq[831] = 1836730707;
        nv.lkwq[832] = 1354090295;
        nv.lkwq[833] = -578039969;
        nv.lkwq[834] = -562974841;
        nv.lkwq[835] = 1142712070;
        nv.lkwq[836] = 111293866;
        nv.lkwq[837] = -1525151436;
        nv.lkwq[838] = -477421130;
        nv.lkwq[839] = 157582029;
        nv.lkwq[840] = 1891252091;
        nv.lkwq[841] = 926354162;
        nv.lkwq[842] = 116150274;
        nv.lkwq[843] = 298259690;
        nv.lkwq[844] = 632518960;
        nv.lkwq[845] = 1773708822;
        nv.lkwq[846] = 1394381409;
        nv.lkwq[847] = 1844837821;
        nv.lkwq[848] = -813474377;
        nv.lkwq[849] = 650898851;
        nv.lkwq[850] = 1466717780;
        nv.lkwq[851] = -128546768;
        nv.lkwq[852] = 600018862;
        nv.lkwq[853] = -1411911496;
        nv.lkwq[854] = 1797886800;
        nv.lkwq[855] = -926517779;
        nv.lkwq[856] = -416987680;
        nv.lkwq[857] = 1869116572;
        nv.lkwq[858] = -1885714943;
        nv.lkwq[859] = -1150304385;
        nv.lkwq[860] = 1379934234;
        nv.lkwq[861] = 2060099105;
        nv.lkwq[862] = 1406732681;
        nv.lkwq[863] = 728847617;
        nv.lkwq[864] = 616187033;
        nv.lkwq[865] = 69965560;
        nv.lkwq[866] = -1292650848;
        nv.lkwq[867] = 1727188795;
        nv.lkwq[868] = -847202275;
        nv.lkwq[869] = 715762628;
        nv.lkwq[870] = -941456369;
        nv.lkwq[871] = 1360214162;
        nv.lkwq[872] = -1610211229;
        nv.lkwq[873] = 1654214020;
        nv.lkwq[874] = -1706139689;
        nv.lkwq[875] = -429555003;
        nv.lkwq[876] = 467986254;
        nv.lkwq[877] = 1584671883;
        nv.lkwq[878] = 12613528;
        nv.lkwq[879] = 1741869932;
        nv.lkwq[880] = -1902613600;
        nv.lkwq[881] = 453692196;
        nv.lkwq[882] = -995362731;
        nv.lkwq[883] = 1079558632;
        nv.lkwq[884] = -312060702;
        nv.lkwq[885] = -334784033;
        nv.lkwq[886] = -1198424122;
        nv.lkwq[887] = -1572431167;
        nv.lkwq[888] = 554171535;
        nv.lkwq[889] = -2125217877;
        nv.lkwq[890] = 17891140;
        nv.lkwq[891] = 176956838;
        nv.lkwq[892] = -1211345470;
        nv.lkwq[893] = -411403912;
        nv.lkwq[894] = -346108773;
        nv.lkwq[895] = 421545906;
        nv.lkwq[896] = 873580813;
        nv.lkwq[897] = -1608770628;
        nv.lkwq[898] = 1038943230;
        nv.lkwq[899] = 679118645;
    }

    private static /* synthetic */ void loiu() {
        nv.lkwq[0] = -1971552611;
        nv.lkwq[1] = 93298206;
        nv.lkwq[2] = 1909041239;
        nv.lkwq[3] = -1521064836;
        nv.lkwq[4] = -1776338037;
        nv.lkwq[5] = 2023920109;
        nv.lkwq[6] = -616417681;
        nv.lkwq[7] = 253759385;
        nv.lkwq[8] = -517282640;
        nv.lkwq[9] = 1743922149;
        nv.lkwq[10] = -937530751;
        nv.lkwq[11] = -657704259;
        nv.lkwq[12] = 1093506674;
        nv.lkwq[13] = 360933049;
        nv.lkwq[14] = 1715148299;
        nv.lkwq[15] = -1489533900;
        nv.lkwq[16] = 1674009274;
        nv.lkwq[17] = 394226666;
        nv.lkwq[18] = 1363056740;
        nv.lkwq[19] = -2067412165;
        nv.lkwq[20] = 408732147;
        nv.lkwq[21] = -1420596467;
        nv.lkwq[22] = -1981230186;
        nv.lkwq[23] = -288940801;
        nv.lkwq[24] = 523558539;
        nv.lkwq[25] = -798276484;
        nv.lkwq[26] = 1051393484;
        nv.lkwq[27] = -1082104957;
        nv.lkwq[28] = 1166090880;
        nv.lkwq[29] = -353112732;
        nv.lkwq[30] = 2139642565;
        nv.lkwq[31] = -525944381;
        nv.lkwq[32] = -784046365;
        nv.lkwq[33] = 1315592952;
        nv.lkwq[34] = -1625862230;
        nv.lkwq[35] = -2132469920;
        nv.lkwq[36] = -1100600433;
        nv.lkwq[37] = -2021213521;
        nv.lkwq[38] = -1993642245;
        nv.lkwq[39] = -369919066;
        nv.lkwq[40] = -698080273;
        nv.lkwq[41] = 635768134;
        nv.lkwq[42] = -577891308;
        nv.lkwq[43] = -1052592342;
        nv.lkwq[44] = -1985607319;
        nv.lkwq[45] = -570978667;
        nv.lkwq[46] = -2094723264;
        nv.lkwq[47] = 1936081791;
        nv.lkwq[48] = -798248533;
        nv.lkwq[49] = -1318540081;
        nv.lkwq[50] = 1436894334;
        nv.lkwq[51] = -1818858236;
        nv.lkwq[52] = 1225922668;
        nv.lkwq[53] = -1492580557;
        nv.lkwq[54] = -1716093939;
        nv.lkwq[55] = 559317642;
        nv.lkwq[56] = 725110735;
        nv.lkwq[57] = -1931638087;
        nv.lkwq[58] = 276045597;
        nv.lkwq[59] = -1916869134;
        nv.lkwq[60] = 602966986;
        nv.lkwq[61] = -1446706412;
        nv.lkwq[62] = 2139666825;
        nv.lkwq[63] = 1500247451;
        nv.lkwq[64] = 480874491;
        nv.lkwq[65] = 1885338653;
        nv.lkwq[66] = 1748734587;
        nv.lkwq[67] = -1240554992;
        nv.lkwq[68] = 765525115;
        nv.lkwq[69] = -1327760586;
        nv.lkwq[70] = -2006355786;
        nv.lkwq[71] = 1018795492;
        nv.lkwq[72] = 961453147;
        nv.lkwq[73] = 1680037091;
        nv.lkwq[74] = -2041578495;
        nv.lkwq[75] = 1363761268;
        nv.lkwq[76] = 1170823431;
        nv.lkwq[77] = 1547522973;
        nv.lkwq[78] = 1996778520;
        nv.lkwq[79] = -401193783;
        nv.lkwq[80] = -1833638263;
        nv.lkwq[81] = -1166238948;
        nv.lkwq[82] = 27518531;
        nv.lkwq[83] = -221309918;
        nv.lkwq[84] = -1919753495;
        nv.lkwq[85] = 810214549;
        nv.lkwq[86] = -1708354134;
        nv.lkwq[87] = -852708482;
        nv.lkwq[88] = 695988232;
        nv.lkwq[89] = 1386535555;
        nv.lkwq[90] = -1429088995;
        nv.lkwq[91] = 419921026;
        nv.lkwq[92] = -1436120134;
        nv.lkwq[93] = 1227101114;
        nv.lkwq[94] = 1561524344;
        nv.lkwq[95] = -975696436;
        nv.lkwq[96] = -59106814;
        nv.lkwq[97] = -1346029985;
        nv.lkwq[98] = 464764695;
        nv.lkwq[99] = -232159951;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int findItemAnywhere(class_1792 var0) {
        v0 /* !! */  = nv.ud;
        if (true) ** GOTO lbl5
        block29: while (true) {
            v0 /* !! */  = (long)(nv.lkwr("llsj", lkwv(int ), (int)202) - nv.lkwr("llsi", lkwv(int ), (int)201));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2089639789: {
                    continue block29;
                }
                case 1637199440: {
                    break block29;
                }
            }
            break;
        }
        var4_1 = nv.c;
        v1 /* !! */  = nv.ud;
        if (true) ** GOTO lbl15
        block30: while (true) {
            v1 /* !! */  = (long)(nv.lkwr("llsl", lkwv(int ), (int)204) - nv.lkwr("llsk", lkwv(int ), (int)203));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1167758763: {
                    continue block30;
                }
                case 1637199440: {
                    break block30;
                }
            }
            break;
        }
        var3_2 /* !! */  = nv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("llsm", lkwv(int ), (int)205)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nv.lkwr("llsn", lkwo(int ), (int)358)) break;
            v2 /* !! */  = (long)nv.lkwr("llso", lkwo(int ), (int)359);
        }
        var2_3 = nv.a;
        if (var4_1) {
            throw null;
lbl30:
            // 5 sources

            return (int)nv.lkwr("llsp", lkwo(int ), (int)360);
        }
        if (var2_3 || var2_3) ** GOTO lbl30
        v3 /* !! */  = nv.ud;
        if (true) ** GOTO lbl37
        block33: while (true) {
            v3 /* !! */  = (long)(nv.lkwr("llsr", lkwv(int ), (int)207) - nv.lkwr("llsq", lkwv(int ), (int)206));
lbl37:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 230652014: {
                    continue block33;
                }
                case 1637199440: {
                    break block33;
                }
            }
            break;
        }
        var1_4 = nv.findItemInHotbar(var0);
        if (var2_3 || var2_3) ** GOTO lbl30
        if (var1_4 == nv.lkwr("llss", lkwo(int ), (int)361)) ** GOTO lbl51
        if (var2_3) ** GOTO lbl30
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl30
                return var1_4;
            }
lbl51:
            // 1 sources

            if (!var2_3 && !var2_3) ** break;
            ** continue;
            v4 /* !! */  = nv.ud;
            if (true) ** GOTO lbl57
            block34: while (true) {
                v4 /* !! */  = (long)(nv.lkwr("llsu", lkwv(int ), (int)209) - nv.lkwr("llst", lkwv(int ), (int)208));
lbl57:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case 1328128089: {
                        continue block34;
                    }
                    case 1637199440: {
                        break block34;
                    }
                }
                break;
            }
            return nv.findItemInInventory(var0);
lbl63:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)nv.lkwr("llsv", lkwo(int ), (int)362);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl100
            }
            case 1: {
                var3_2 /* !! */  = (int)nv.lkwr("llsw", lkwo(int ), (int)363);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl95
            }
lbl73:
            // 3 sources

            case 2: {
                var3_2 /* !! */  = (int)nv.lkwr("llsx", lkwo(int ), (int)364);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl95
            }
            case 3: {
                var3_2 /* !! */  = (int)nv.lkwr("llsy", lkwo(int ), (int)365);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl104
            }
lbl83:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)nv.lkwr("llsz", lkwo(int ), (int)366);
                if (!var4_1) ** GOTO lbl73
                throw null;
            }
lbl87:
            // 2 sources

            case 5: {
                var3_2 /* !! */  = (int)nv.lkwr("llta", lkwo(int ), (int)367);
                if (!var4_1) ** GOTO lbl83
                throw null;
            }
            case 6: {
                var3_2 /* !! */  = (int)nv.lkwr("lltb", lkwo(int ), (int)368);
                if (!var4_1) ** GOTO lbl73
                throw null;
            }
lbl95:
            // 3 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_2 /* !! */  = (int)nv.lkwr("lltc", lkwo(int ), (int)369);
                    if (!var4_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl100:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)nv.lkwr("lltd", lkwo(int ), (int)370);
                if (!var4_1) ** GOTO lbl87
                throw null;
            }
lbl104:
            // 2 sources

            case 9: {
                var3_2 /* !! */  = (int)nv.lkwr("llte", lkwo(int ), (int)371);
                if (!var4_1) ** GOTO lbl63
                throw null;
            }
            case 10: 
        }
        var3_2 /* !! */  = (int)nv.lkwr("lltf", lkwo(int ), (int)372);
        ** while (!var4_1)
lbl111:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lojw() {
        nv.lkwx[400] = 161054891780159008L;
        nv.lkwx[401] = -3606452990980775839L;
        nv.lkwx[402] = -1784890023103793919L;
        nv.lkwx[403] = -2928386068133990085L;
        nv.lkwx[404] = -3951064369261434219L;
        nv.lkwx[405] = 4934863877265560925L;
        nv.lkwx[406] = -175050001081447908L;
        nv.lkwx[407] = -9132097024730755575L;
        nv.lkwx[408] = 1661441992868908631L;
        nv.lkwx[409] = 31129784926992822L;
        nv.lkwx[410] = 1926298385934747060L;
        nv.lkwx[411] = -4638156082559783872L;
        nv.lkwx[412] = -8616380589740511009L;
        nv.lkwx[413] = -8927371747730480867L;
        nv.lkwx[414] = -3941498622741986549L;
        nv.lkwx[415] = 3832881225061808933L;
        nv.lkwx[416] = -8304630868799887403L;
        nv.lkwx[417] = -3415402441417171891L;
        nv.lkwx[418] = -5739199365564267256L;
        nv.lkwx[419] = -5668220371514179674L;
        nv.lkwx[420] = -6736233876510521189L;
        nv.lkwx[421] = -7572686818121311032L;
        nv.lkwx[422] = -4645340246095875938L;
        nv.lkwx[423] = -4232320932297382097L;
        nv.lkwx[424] = 6386550886950059748L;
        nv.lkwx[425] = 4189309521519678532L;
        nv.lkwx[426] = -146834689680656469L;
        nv.lkwx[427] = -3284672736538390490L;
        nv.lkwx[428] = 3613912761036586054L;
        nv.lkwx[429] = 467519345134600567L;
        nv.lkwx[430] = 5697059985975695932L;
        nv.lkwx[431] = 5662021681662210732L;
        nv.lkwx[432] = 562903934967786929L;
        nv.lkwx[433] = -1787611932109688314L;
        nv.lkwx[434] = -8612140107274347500L;
        nv.lkwx[435] = -1575156342135694825L;
        nv.lkwx[436] = -2690873727791498693L;
        nv.lkwx[437] = -7716770211881656699L;
        nv.lkwx[438] = 8113383006119289102L;
        nv.lkwx[439] = 3464230745329816268L;
        nv.lkwx[440] = -5428544048644119111L;
        nv.lkwx[441] = -1725671583366784186L;
        nv.lkwx[442] = 2801245861840086059L;
        nv.lkwx[443] = 8977747508685923326L;
        nv.lkwx[444] = 7927301626371325030L;
        nv.lkwx[445] = -5120011577698304828L;
        nv.lkwx[446] = 1339229092357877677L;
        nv.lkwx[447] = 2921150414222586797L;
        nv.lkwx[448] = 6276889808482185630L;
        nv.lkwx[449] = 6703820353327375873L;
        nv.lkwx[450] = 6149100195163019088L;
        nv.lkwx[451] = -8239176955708130751L;
        nv.lkwx[452] = 6856469797795041353L;
        nv.lkwx[453] = 6311536867030283598L;
        nv.lkwx[454] = 7464898224420590450L;
        nv.lkwx[455] = 6768575285087986116L;
        nv.lkwx[456] = -3854786897111529002L;
        nv.lkwx[457] = -8905677466899646900L;
        nv.lkwx[458] = -5634447344267903784L;
        nv.lkwx[459] = 2023644730797400130L;
        nv.lkwx[460] = -4701305564288017548L;
        nv.lkwx[461] = -7439466516123151208L;
        nv.lkwx[462] = 2618465051435962314L;
        nv.lkwx[463] = 1046064823476152541L;
        nv.lkwx[464] = 3656185663604432023L;
        nv.lkwx[465] = 4619250604625106123L;
        nv.lkwx[466] = 3004648105064261136L;
        nv.lkwx[467] = -237940702866712325L;
        nv.lkwx[468] = -7926212133081906161L;
        nv.lkwx[469] = -4324781304805318978L;
        nv.lkwx[470] = -2663390037346238145L;
        nv.lkwx[471] = -7644321309509188601L;
        nv.lkwx[472] = -2183656379610720132L;
        nv.lkwx[473] = -645948123710358492L;
        nv.lkwx[474] = -1832494592224703447L;
        nv.lkwx[475] = -2532743007785610279L;
        nv.lkwx[476] = 7459840021696344276L;
        nv.lkwx[477] = 158423426055849689L;
        nv.lkwx[478] = 6564805093536617289L;
        nv.lkwx[479] = -3847908809202364191L;
        nv.lkwx[480] = -7076856653443688905L;
        nv.lkwx[481] = -8698788964448764421L;
        nv.lkwx[482] = 1685347660526585363L;
        nv.lkwx[483] = 3728872327631848354L;
        nv.lkwx[484] = -7877232193037060110L;
        nv.lkwx[485] = 7167059850608724127L;
        nv.lkwx[486] = -6579746603595282243L;
        nv.lkwx[487] = -107781699776878962L;
        nv.lkwx[488] = -7114816529296255957L;
        nv.lkwx[489] = 9057077798635914673L;
        nv.lkwx[490] = -3324912386832725753L;
        nv.lkwx[491] = 2963468828229643462L;
        nv.lkwx[492] = 1969942637099033129L;
        nv.lkwx[493] = 4836925623258329440L;
        nv.lkwx[494] = -8052839350594646295L;
        nv.lkwx[495] = 392200870702653992L;
        nv.lkwx[496] = 6697091965198623686L;
        nv.lkwx[497] = 4992616433695772243L;
        nv.lkwx[498] = -835123213671845421L;
        nv.lkwx[499] = 5536421199256830626L;
    }

    private static /* synthetic */ void lojr() {
        nv.lkww[1000] = -239403417810239813L;
        nv.lkww[1001] = 8944817435486412975L;
        nv.lkww[1002] = -1566705388917742111L;
        nv.lkww[1003] = -3219078247678307165L;
        nv.lkww[1004] = 4191375249651499292L;
        nv.lkww[1005] = -8244127880927627132L;
        nv.lkww[1006] = 1504294561406093009L;
        nv.lkww[1007] = -3082871507485190178L;
        nv.lkww[1008] = 160302226354673797L;
        nv.lkww[1009] = 2316120939260772658L;
        nv.lkww[1010] = -3142250326349615209L;
        nv.lkww[1011] = 19542200288218100L;
        nv.lkww[1012] = 4036712292081684530L;
        nv.lkww[1013] = 7257153199558901156L;
        nv.lkww[1014] = 2640430516221511387L;
        nv.lkww[1015] = 8490998865264039321L;
        nv.lkww[1016] = -1755776844860506247L;
        nv.lkww[1017] = -473489687239728978L;
        nv.lkww[1018] = 8664816656733342825L;
        nv.lkww[1019] = 6084176182961294413L;
        nv.lkww[1020] = -1148625690194027334L;
        nv.lkww[1021] = 3215507208125739016L;
        nv.lkww[1022] = -473064844826997060L;
        nv.lkww[1023] = -5570583951093433210L;
        nv.lkww[1024] = -7112080303088062425L;
        nv.lkww[1025] = 6073597671511508467L;
        nv.lkww[1026] = 7358918648717421968L;
    }

    private static /* synthetic */ void loja() {
        nv.lkwq[600] = -127851540;
        nv.lkwq[601] = -1540716923;
        nv.lkwq[602] = -1931975576;
        nv.lkwq[603] = 2073782311;
        nv.lkwq[604] = 1197934770;
        nv.lkwq[605] = -9584997;
        nv.lkwq[606] = -705034715;
        nv.lkwq[607] = -90682702;
        nv.lkwq[608] = -878667135;
        nv.lkwq[609] = -1848549912;
        nv.lkwq[610] = 186173618;
        nv.lkwq[611] = 1608234792;
        nv.lkwq[612] = -939412501;
        nv.lkwq[613] = -2029849033;
        nv.lkwq[614] = 1947444469;
        nv.lkwq[615] = -1227436249;
        nv.lkwq[616] = -1038320823;
        nv.lkwq[617] = 689635780;
        nv.lkwq[618] = -1633529228;
        nv.lkwq[619] = -1094515725;
        nv.lkwq[620] = 559182459;
        nv.lkwq[621] = -1168966532;
        nv.lkwq[622] = 1312430473;
        nv.lkwq[623] = 829825602;
        nv.lkwq[624] = 1517118064;
        nv.lkwq[625] = -1414737864;
        nv.lkwq[626] = 334169585;
        nv.lkwq[627] = 539712539;
        nv.lkwq[628] = 1525420302;
        nv.lkwq[629] = -1148809020;
        nv.lkwq[630] = 869132603;
        nv.lkwq[631] = 379155373;
        nv.lkwq[632] = -5546478;
        nv.lkwq[633] = 1293408425;
        nv.lkwq[634] = 1732627217;
        nv.lkwq[635] = -1075032685;
        nv.lkwq[636] = -108510847;
        nv.lkwq[637] = 1472482050;
        nv.lkwq[638] = 646015277;
        nv.lkwq[639] = 749016194;
        nv.lkwq[640] = 1476720779;
        nv.lkwq[641] = 245908408;
        nv.lkwq[642] = -162510308;
        nv.lkwq[643] = 2003221683;
        nv.lkwq[644] = -2129265429;
        nv.lkwq[645] = 1367392327;
        nv.lkwq[646] = -244986197;
        nv.lkwq[647] = -2112140412;
        nv.lkwq[648] = 40097211;
        nv.lkwq[649] = -1535063618;
        nv.lkwq[650] = 1360263553;
        nv.lkwq[651] = 1042736586;
        nv.lkwq[652] = 668627069;
        nv.lkwq[653] = 936071580;
        nv.lkwq[654] = -896110761;
        nv.lkwq[655] = -799134299;
        nv.lkwq[656] = -1302093052;
        nv.lkwq[657] = 1299968204;
        nv.lkwq[658] = -1468863248;
        nv.lkwq[659] = -1059601697;
        nv.lkwq[660] = 1909483431;
        nv.lkwq[661] = 453696225;
        nv.lkwq[662] = 1925504362;
        nv.lkwq[663] = 1458225595;
        nv.lkwq[664] = -578740385;
        nv.lkwq[665] = 1554158196;
        nv.lkwq[666] = -1665057301;
        nv.lkwq[667] = -686431182;
        nv.lkwq[668] = 1130608664;
        nv.lkwq[669] = -1909361084;
        nv.lkwq[670] = 212090366;
        nv.lkwq[671] = -1459336560;
        nv.lkwq[672] = 1326298210;
        nv.lkwq[673] = -2033578659;
        nv.lkwq[674] = -2104639856;
        nv.lkwq[675] = -109468028;
        nv.lkwq[676] = -865661811;
        nv.lkwq[677] = 1636207970;
        nv.lkwq[678] = 1534240040;
        nv.lkwq[679] = -1173446969;
        nv.lkwq[680] = -1411541695;
        nv.lkwq[681] = 1186604755;
        nv.lkwq[682] = -223278466;
        nv.lkwq[683] = -284079367;
        nv.lkwq[684] = -362070003;
        nv.lkwq[685] = -1453930703;
        nv.lkwq[686] = 611059507;
        nv.lkwq[687] = 1487002576;
        nv.lkwq[688] = 202455675;
        nv.lkwq[689] = 938867457;
        nv.lkwq[690] = -598465570;
        nv.lkwq[691] = 2052343612;
        nv.lkwq[692] = -762725108;
        nv.lkwq[693] = -413750688;
        nv.lkwq[694] = 597633661;
        nv.lkwq[695] = -1683864993;
        nv.lkwq[696] = -16989467;
        nv.lkwq[697] = 1584513310;
        nv.lkwq[698] = -2012721719;
        nv.lkwq[699] = 1684697884;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void silentSwapUseAndReturn(int var0) {
        block70: {
            v0 /* !! */  = nv.ud;
            if (true) ** GOTO lbl5
            block46: while (true) {
                v0 /* !! */  = (long)(v1 - nv.lkwr("lneh", lkwv(int ), (int)650));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1201255634: {
                        v1 = nv.lkwr("lnei", lkwv(int ), (int)651);
                        continue block46;
                    }
                    case -1172019980: {
                        v1 = nv.lkwr("lnej", lkwv(int ), (int)652);
                        continue block46;
                    }
                    case -1167178318: {
                        v1 = nv.lkwr("lnek", lkwv(int ), (int)653);
                        continue block46;
                    }
                    case 1637199440: {
                        break block46;
                    }
                }
                break;
            }
            var3_1 = nv.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lnel", lkwv(int ), (int)654)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == nv.lkwr("lnem", lkwo(int ), (int)896)) break;
                v2 /* !! */  = (long)nv.lkwr("lnen", lkwo(int ), (int)897);
            }
            var2_2 /* !! */  = nv.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lneo", lkwv(int ), (int)655)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == nv.lkwr("lnep", lkwo(int ), (int)898)) break;
                v3 /* !! */  = (long)nv.lkwr("lneq", lkwo(int ), (int)899);
            }
            var1_3 = nv.a;
            if (var3_1) {
                throw null;
lbl32:
                // 5 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl32
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lner", lkwv(int ), (int)656)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == nv.lkwr("lnes", lkwo(int ), (int)900)) break;
                v4 /* !! */  = (long)nv.lkwr("lnet", lkwo(int ), (int)901);
            }
            v5 /* !! */  = nv.ud;
            if (true) ** GOTO lbl44
            block51: while (true) {
                v5 /* !! */  = (long)(nv.lkwr("lnev", lkwv(int ), (int)658) - nv.lkwr("lneu", lkwv(int ), (int)657));
lbl44:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case 751770529: {
                        continue block51;
                    }
                    case 1637199440: {
                        break block51;
                    }
                }
                break;
            }
            if (nv.mc.field_1724 != null) break block70;
            if (var1_3 || var1_3) ** GOTO lbl32
            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        v6 /* !! */  = nv.ud;
        if (true) ** GOTO lbl58
        block52: while (true) {
            v6 /* !! */  = (long)(v7 - nv.lkwr("lnew", lkwv(int ), (int)659));
lbl58:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -478157591: {
                    v7 = nv.lkwr("lnex", lkwv(int ), (int)660);
                    continue block52;
                }
                case 770412694: {
                    v7 = nv.lkwr("lney", lkwv(int ), (int)661);
                    continue block52;
                }
                case 1637199440: {
                    break block52;
                }
                case 2095981365: {
                    v7 = nv.lkwr("lnez", lkwv(int ), (int)662);
                    continue block52;
                }
            }
            break;
        }
        v8 /* !! */  = nv.ud;
        if (true) ** GOTO lbl74
        block53: while (true) {
            v8 /* !! */  = (long)(v9 - nv.lkwr("lnfa", lkwv(int ), (int)663));
lbl74:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1433747201: {
                    v9 = nv.lkwr("lnfb", lkwv(int ), (int)664);
                    continue block53;
                }
                case -538707213: {
                    v9 = nv.lkwr("lnfc", lkwv(int ), (int)665);
                    continue block53;
                }
                case 134221715: {
                    v9 = nv.lkwr("lnfd", lkwv(int ), (int)666);
                    continue block53;
                }
                case 1637199440: {
                    break block53;
                }
            }
            break;
        }
        v10 = nv.mc.field_1724;
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("lnfe", lkwv(int ), (int)667)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == nv.lkwr("lnff", lkwo(int ), (int)902)) break;
            v11 /* !! */  = (long)nv.lkwr("lnfg", lkwo(int ), (int)903);
        }
        v12 = v10.method_36454();
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_4 = nv.ud - nv.lkwr("lnfh", lkwv(int ), (int)668)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == nv.lkwr("lnfi", lkwo(int ), (int)904)) break;
            v13 /* !! */  = (long)nv.lkwr("lnfj", lkwo(int ), (int)905);
        }
        v14 /* !! */  = nv.ud;
        if (true) ** GOTO lbl102
        block56: while (true) {
            v14 /* !! */  = (long)(v15 - nv.lkwr("lnfk", lkwv(int ), (int)669));
lbl102:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case 216580936: {
                    v15 = nv.lkwr("lnfl", lkwv(int ), (int)670);
                    continue block56;
                }
                case 425218566: {
                    v15 = nv.lkwr("lnfm", lkwv(int ), (int)671);
                    continue block56;
                }
                case 1637199440: {
                    break block56;
                }
            }
            break;
        }
        v16 = nv.mc.field_1724;
        v17 /* !! */  = nv.ud;
        if (true) ** GOTO lbl116
        block57: while (true) {
            v17 /* !! */  = (long)(v18 - nv.lkwr("lnfn", lkwv(int ), (int)672));
lbl116:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -1504960699: {
                    v18 = nv.lkwr("lnfo", lkwv(int ), (int)673);
                    continue block57;
                }
                case -367307358: {
                    v18 = nv.lkwr("lnfp", lkwv(int ), (int)674);
                    continue block57;
                }
                case 107289816: {
                    v18 = nv.lkwr("lnfq", lkwv(int ), (int)675);
                    continue block57;
                }
                case 1637199440: {
                    break block57;
                }
            }
            break;
        }
        v19 = v16.method_36455();
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_5 = nv.ud - nv.lkwr("lnfr", lkwv(int ), (int)676)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == nv.lkwr("lnfs", lkwo(int ), (int)906)) break;
            v20 /* !! */  = (long)nv.lkwr("lnft", lkwo(int ), (int)907);
        }
        nv.silentSwapUseAndReturn(var0, v12, v19);
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
lbl142:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nv.lkwr("lnfu", lkwo(int ), (int)908);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl175
                    break;
                }
            }
lbl148:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)nv.lkwr("lnfv", lkwo(int ), (int)909);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)nv.lkwr("lnfw", lkwo(int ), (int)910);
                } while (!var3_1);
                throw null;
            }
            case 3: {
                do {
                    var2_2 /* !! */  = (int)nv.lkwr("lnfx", lkwo(int ), (int)911);
                } while (!var3_1);
                throw null;
            }
lbl163:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)nv.lkwr("lnfy", lkwo(int ), (int)912);
                if (!var3_1) ** GOTO lbl142
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)nv.lkwr("lnfz", lkwo(int ), (int)913);
                if (!var3_1) break;
                throw null;
            }
lbl171:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)nv.lkwr("lnga", lkwo(int ), (int)914);
                if (!var3_1) ** GOTO lbl148
                throw null;
            }
lbl175:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)nv.lkwr("lngb", lkwo(int ), (int)915);
                if (!var3_1) ** GOTO lbl163
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)nv.lkwr("lngc", lkwo(int ), (int)916);
                if (var3_1) {
                    throw null;
                }
            }
            case 9: {
                var2_2 /* !! */  = (int)nv.lkwr("lngd", lkwo(int ), (int)917);
                if (!var3_1) ** GOTO lbl171
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)nv.lkwr("lnge", lkwo(int ), (int)918);
        ** while (!var3_1)
lbl190:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void safeSwap(int var0, int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nv.ud - nv.lkwr("lmfj", lkwv(int ), (int)345)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nv.lkwr("lmfk", lkwo(int ), (int)553)) break;
            v0 /* !! */  = (long)nv.lkwr("lmfl", lkwo(int ), (int)554);
        }
        var4_2 = nv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nv.ud - nv.lkwr("lmfm", lkwv(int ), (int)346)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nv.lkwr("lmfn", lkwo(int ), (int)555)) break;
            v1 /* !! */  = (long)nv.lkwr("lmfo", lkwo(int ), (int)556);
        }
        var3_3 /* !! */  = nv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = nv.ud - nv.lkwr("lmfp", lkwv(int ), (int)347)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nv.lkwr("lmfq", lkwo(int ), (int)557)) break;
            v2 /* !! */  = (long)nv.lkwr("lmfr", lkwo(int ), (int)558);
        }
        var2_4 = nv.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
lbl24:
                    // 3 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl24
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = nv.ud - nv.lkwr("lmfs", lkwv(int ), (int)348)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == nv.lkwr("lmft", lkwo(int ), (int)559)) break;
                    v3 /* !! */  = (long)nv.lkwr("lmfu", lkwo(int ), (int)560);
                }
                nv.dropCursorStack();
                if (var2_4 || var2_4) ** GOTO lbl24
                v4 /* !! */  = nv.ud;
                if (true) ** GOTO lbl38
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - nv.lkwr("lmfv", lkwv(int ), (int)349));
lbl38:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1764919932: {
                            v5 = nv.lkwr("lmfw", lkwv(int ), (int)350);
                            continue block21;
                        }
                        case -145103766: {
                            v5 = nv.lkwr("lmfx", lkwv(int ), (int)351);
                            continue block21;
                        }
                        case -35630201: {
                            v5 = nv.lkwr("lmfy", lkwv(int ), (int)352);
                            continue block21;
                        }
                        case 1637199440: {
                            break block21;
                        }
                    }
                    break;
                }
                nv.swap(var0, var1_1);
                if (var2_4 || var2_4) ** continue;
                return;
            }
lbl53:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)nv.lkwr("lmfz", lkwo(int ), (int)561);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl75
            }
            case 1: {
                var3_3 /* !! */  = (int)nv.lkwr("lmga", lkwo(int ), (int)562);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)nv.lkwr("lmgb", lkwo(int ), (int)563);
                if (var4_2) {
                    throw null;
                }
            }
            case 3: {
                do {
                    var3_3 /* !! */  = (int)nv.lkwr("lmgc", lkwo(int ), (int)564);
                } while (!var4_2);
                throw null;
            }
lbl71:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)nv.lkwr("lmgd", lkwo(int ), (int)565);
                if (!var4_2) ** GOTO lbl53
                throw null;
            }
lbl75:
            // 2 sources

            case 5: {
                do {
                    var3_3 /* !! */  = (int)nv.lkwr("lmge", lkwo(int ), (int)566);
                } while (!var4_2);
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)nv.lkwr("lmgf", lkwo(int ), (int)567);
                if (!var4_2) ** GOTO lbl71
                throw null;
            }
            case 7: 
        }
        do {
            var3_3 /* !! */  = (int)nv.lkwr("lmgg", lkwo(int ), (int)568);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void lojg() {
        nv.lkwq[1200] = -1795040218;
        nv.lkwq[1201] = -129267500;
        nv.lkwq[1202] = 2108489255;
        nv.lkwq[1203] = 2071342680;
        nv.lkwq[1204] = 664302556;
        nv.lkwq[1205] = -927400779;
        nv.lkwq[1206] = -782672568;
        nv.lkwq[1207] = -320622504;
        nv.lkwq[1208] = -1710979205;
        nv.lkwq[1209] = 1224487532;
        nv.lkwq[1210] = 1699094850;
        nv.lkwq[1211] = 680585312;
        nv.lkwq[1212] = 1864687366;
        nv.lkwq[1213] = 484372535;
        nv.lkwq[1214] = -1674573664;
        nv.lkwq[1215] = 712768167;
        nv.lkwq[1216] = 661763755;
        nv.lkwq[1217] = 648460724;
        nv.lkwq[1218] = 831169628;
        nv.lkwq[1219] = -2140410045;
        nv.lkwq[1220] = 1202125453;
        nv.lkwq[1221] = -341523429;
        nv.lkwq[1222] = 923131393;
        nv.lkwq[1223] = -1143216722;
        nv.lkwq[1224] = -1410882845;
        nv.lkwq[1225] = 1053152766;
        nv.lkwq[1226] = 1746583316;
        nv.lkwq[1227] = 506355983;
        nv.lkwq[1228] = -1244792069;
        nv.lkwq[1229] = -1852808595;
        nv.lkwq[1230] = -305518577;
        nv.lkwq[1231] = 667357087;
        nv.lkwq[1232] = -1680695772;
        nv.lkwq[1233] = -1943703465;
        nv.lkwq[1234] = 1051969593;
        nv.lkwq[1235] = 513193230;
        nv.lkwq[1236] = 1481878734;
        nv.lkwq[1237] = -228973514;
        nv.lkwq[1238] = -581932678;
        nv.lkwq[1239] = 1447494655;
        nv.lkwq[1240] = 1126140949;
        nv.lkwq[1241] = -1127752544;
        nv.lkwq[1242] = 107537290;
        nv.lkwq[1243] = -1727842868;
        nv.lkwq[1244] = 12243282;
        nv.lkwq[1245] = -1264167700;
        nv.lkwq[1246] = 1337669114;
        nv.lkwq[1247] = 718575075;
        nv.lkwq[1248] = 191293254;
        nv.lkwq[1249] = 1889986897;
        nv.lkwq[1250] = 512876495;
        nv.lkwq[1251] = 377482031;
        nv.lkwq[1252] = -124102061;
        nv.lkwq[1253] = -32281845;
        nv.lkwq[1254] = -115477117;
        nv.lkwq[1255] = 239890824;
        nv.lkwq[1256] = 630038675;
        nv.lkwq[1257] = -348568931;
        nv.lkwq[1258] = 48245040;
        nv.lkwq[1259] = 1857684566;
        nv.lkwq[1260] = -1931779413;
        nv.lkwq[1261] = 254910265;
        nv.lkwq[1262] = 1510178127;
        nv.lkwq[1263] = -1580902194;
        nv.lkwq[1264] = -927309124;
        nv.lkwq[1265] = 1388648796;
        nv.lkwq[1266] = -299744882;
        nv.lkwq[1267] = -817246783;
        nv.lkwq[1268] = -1082721355;
        nv.lkwq[1269] = -724817197;
        nv.lkwq[1270] = 851096369;
        nv.lkwq[1271] = -1805049605;
        nv.lkwq[1272] = 495769167;
        nv.lkwq[1273] = -79367061;
        nv.lkwq[1274] = 316695749;
        nv.lkwq[1275] = -1348446083;
        nv.lkwq[1276] = -286226874;
        nv.lkwq[1277] = -488128755;
        nv.lkwq[1278] = 455545104;
        nv.lkwq[1279] = -1377909861;
        nv.lkwq[1280] = 1163610836;
        nv.lkwq[1281] = -976718811;
        nv.lkwq[1282] = -229113535;
        nv.lkwq[1283] = 906864791;
        nv.lkwq[1284] = 1461881087;
        nv.lkwq[1285] = 527441319;
        nv.lkwq[1286] = -1435759895;
        nv.lkwq[1287] = 958877858;
        nv.lkwq[1288] = 539808894;
        nv.lkwq[1289] = 136705125;
        nv.lkwq[1290] = 443219539;
        nv.lkwq[1291] = 329050176;
        nv.lkwq[1292] = -582940821;
        nv.lkwq[1293] = -626509598;
        nv.lkwq[1294] = 1539916415;
        nv.lkwq[1295] = -464890886;
        nv.lkwq[1296] = 548708275;
        nv.lkwq[1297] = -299175509;
        nv.lkwq[1298] = -210753580;
    }

    private static /* synthetic */ void lokc() {
        nv.lkwx[1000] = 1450842348051031832L;
        nv.lkwx[1001] = -4586231122863856362L;
        nv.lkwx[1002] = -9100744558068290L;
        nv.lkwx[1003] = -4613510386225627302L;
        nv.lkwx[1004] = -2626972798775711256L;
        nv.lkwx[1005] = 4801864061797911322L;
        nv.lkwx[1006] = 1325431478773362612L;
        nv.lkwx[1007] = -8798162081928845631L;
        nv.lkwx[1008] = -6110757497987679289L;
        nv.lkwx[1009] = -6133872341127709945L;
        nv.lkwx[1010] = 4431568743819207452L;
        nv.lkwx[1011] = 6145107379853670792L;
        nv.lkwx[1012] = 3664646121000431370L;
        nv.lkwx[1013] = -2414355614956988574L;
        nv.lkwx[1014] = 7651324425893910843L;
        nv.lkwx[1015] = -3475757275621088554L;
        nv.lkwx[1016] = 4079509744321656148L;
        nv.lkwx[1017] = -6011041711111379950L;
        nv.lkwx[1018] = 2096487231456341541L;
        nv.lkwx[1019] = -6890135764889987649L;
        nv.lkwx[1020] = -9105298307772336509L;
        nv.lkwx[1021] = 4844608506075323078L;
        nv.lkwx[1022] = -2281867533371551078L;
        nv.lkwx[1023] = -668118948453948671L;
        nv.lkwx[1024] = -1667405241822975380L;
        nv.lkwx[1025] = 7703786648299639042L;
        nv.lkwx[1026] = 4302130531649029790L;
    }
}

