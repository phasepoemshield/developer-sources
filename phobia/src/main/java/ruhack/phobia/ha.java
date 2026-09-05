/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1542
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_3532
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_3532;
import ruhack.phobia.aw;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.ke;
import ruhack.phobia.kg;
import ruhack.phobia.ow;

public class ha
extends ds {
    private static int[] ffmk;
    private static int[] ffmi;
    private static long[] ffoz;
    private final kg distance;
    private final ke targets;
    public static final long lv = 7276799961190724445L;
    private final kb clientLook;
    private static long[] ffoy;
    private final kg speed;
    public static final boolean a;
    public static final boolean c;
    public static final int b;

    private static /* synthetic */ void fgcr() {
        ha.ffoy[0] = 6459286484821857141L;
        ha.ffoy[1] = 5396388856894548536L;
        ha.ffoy[2] = -2778162898139338330L;
        ha.ffoy[3] = 459274584648819025L;
        ha.ffoy[4] = -5091542053097339534L;
        ha.ffoy[5] = -5675235970808599579L;
        ha.ffoy[6] = -7252654933530758753L;
        ha.ffoy[7] = 1584013733583074689L;
        ha.ffoy[8] = 6248967518825707657L;
        ha.ffoy[9] = 6141797611514176544L;
        ha.ffoy[10] = -2820545429911654072L;
        ha.ffoy[11] = 2543736082542888768L;
        ha.ffoy[12] = -6063067017115818480L;
        ha.ffoy[13] = -8779743500684234688L;
        ha.ffoy[14] = 8200751647268405841L;
        ha.ffoy[15] = 192772976016673636L;
        ha.ffoy[16] = -7119024812804427396L;
        ha.ffoy[17] = -8474367175787913017L;
        ha.ffoy[18] = 1109901858885464810L;
        ha.ffoy[19] = 8266143702998196013L;
        ha.ffoy[20] = -1587441403502656271L;
        ha.ffoy[21] = 506002797154604011L;
        ha.ffoy[22] = -3414955984475765475L;
        ha.ffoy[23] = 3309024829811435008L;
        ha.ffoy[24] = -3979053320189899776L;
        ha.ffoy[25] = 6511495477713145548L;
        ha.ffoy[26] = 2034273032666392081L;
        ha.ffoy[27] = 1786450692652784093L;
        ha.ffoy[28] = 1717323882568711922L;
        ha.ffoy[29] = -6689993745764695561L;
        ha.ffoy[30] = -139906987242715520L;
        ha.ffoy[31] = 4087492210185882983L;
        ha.ffoy[32] = -7968456392207780021L;
        ha.ffoy[33] = 8959930142887768144L;
        ha.ffoy[34] = 6434722268118998867L;
        ha.ffoy[35] = 2200338723183482013L;
        ha.ffoy[36] = -8823776620226030766L;
        ha.ffoy[37] = -706424660113294246L;
        ha.ffoy[38] = -2639787709562056286L;
        ha.ffoy[39] = 4267642418026926116L;
        ha.ffoy[40] = -1414442956045831015L;
        ha.ffoy[41] = -6530571369534127433L;
        ha.ffoy[42] = -661697332753254264L;
        ha.ffoy[43] = 6403584586505673802L;
        ha.ffoy[44] = -2853512293735520269L;
        ha.ffoy[45] = 7795173688365646205L;
        ha.ffoy[46] = 5223325130624953489L;
        ha.ffoy[47] = -3527938868588804934L;
        ha.ffoy[48] = -5737890364996414368L;
        ha.ffoy[49] = -4334816155402287998L;
    }

    private static /* synthetic */ int ffmb(int n2) {
        return ffmi[n2] ^ ffmk[n2];
    }

    static {
        ffmi = new int[123];
        ffmk = new int[123];
        ha.fgbl();
        ha.fgbq();
        ha.fgbu();
        ha.fgcm();
        ffoy = new long[50];
        ffoz = new long[50];
        ha.fgcr();
        ha.fgdb();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isTarget(class_1799 var1_1) {
        v0 /* !! */  = ha.lv;
        if (true) ** GOTO lbl5
        block96: while (true) {
            v0 /* !! */  = (long)(ha.ffml("ffvf", ffvd(int ), (int)2) - ha.ffml("ffve", ffvd(int ), (int)1));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1269206179: {
                    break block96;
                }
                case -122678223: {
                    continue block96;
                }
            }
            break;
        }
        var4_2 = ha.c;
        v1 /* !! */  = ha.lv;
        if (true) ** GOTO lbl15
        block97: while (true) {
            v1 /* !! */  = (long)(ha.ffml("ffvk", ffvd(int ), (int)4) - ha.ffml("ffvj", ffvd(int ), (int)3));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1269206179: {
                    break block97;
                }
                case 836891771: {
                    continue block97;
                }
            }
            break;
        }
        var3_3 /* !! */  = ha.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ha.lv - ha.ffml("ffvm", ffvd(int ), (int)5)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ha.ffml("ffvn", ffmb(int ), (int)73)) break;
            v2 /* !! */  = (long)ha.ffml("ffvo", ffmb(int ), (int)74);
        }
        var2_4 = ha.a;
        if (var4_2) {
            throw null;
lbl29:
            // 18 sources

            return (boolean)ha.ffml("ffvp", ffmb(int ), (int)75);
        }
        if (var2_4) ** GOTO lbl29
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl29
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = ha.lv - ha.ffml("ffvq", ffvd(int ), (int)6)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ha.ffml("ffvt", ffmb(int ), (int)76)) break;
                    v3 /* !! */  = (long)ha.ffml("ffvu", ffmb(int ), (int)77);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ha.lv - ha.ffml("ffvv", ffvd(int ), (int)7)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ha.ffml("ffvx", ffmb(int ), (int)78)) break;
                    v4 /* !! */  = (long)ha.ffml("ffvy", ffmb(int ), (int)79);
                }
                if (!this.targets.isSelected("\u042d\u043b\u0438\u0442\u0440\u044b")) ** GOTO lbl71
                if (var2_4) ** GOTO lbl29
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = ha.lv - ha.ffml("ffwa", ffvd(int ), (int)8)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ha.ffml("ffwb", ffmb(int ), (int)80)) break;
                    v5 /* !! */  = (long)ha.ffml("ffwe", ffmb(int ), (int)81);
                }
                v6 /* !! */  = ha.lv;
                if (true) ** GOTO lbl57
                block103: while (true) {
                    v6 /* !! */  = (long)(v7 - ha.ffml("ffwf", ffvd(int ), (int)9));
lbl57:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1540012343: {
                            v7 = ha.ffml("ffwg", ffvd(int ), (int)10);
                            continue block103;
                        }
                        case -1269206179: {
                            break block103;
                        }
                        case -884273581: {
                            v7 = ha.ffml("ffwh", ffvd(int ), (int)11);
                            continue block103;
                        }
                        case 471167445: {
                            v7 = ha.ffml("ffwi", ffvd(int ), (int)12);
                            continue block103;
                        }
                    }
                    break;
                }
                if (var1_1.method_31574(class_1802.field_8833)) ** GOTO lbl255
                if (var2_4) ** GOTO lbl29
lbl71:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl29
                v8 /* !! */  = ha.lv;
                if (true) ** GOTO lbl76
                block104: while (true) {
                    v8 /* !! */  = (long)(v9 - ha.ffml("ffwj", ffvd(int ), (int)13));
lbl76:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1949808996: {
                            v9 = ha.ffml("ffwl", ffvd(int ), (int)14);
                            continue block104;
                        }
                        case -1269206179: {
                            break block104;
                        }
                        case -917791263: {
                            v9 = ha.ffml("ffwo", ffvd(int ), (int)15);
                            continue block104;
                        }
                        case 49926270: {
                            v9 = ha.ffml("ffwp", ffvd(int ), (int)16);
                            continue block104;
                        }
                    }
                    break;
                }
                v10 /* !! */  = ha.lv;
                if (true) ** GOTO lbl92
                block105: while (true) {
                    v10 /* !! */  = (long)(v11 - ha.ffml("ffwr", ffvd(int ), (int)17));
lbl92:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1269206179: {
                            break block105;
                        }
                        case 1423394760: {
                            v11 = ha.ffml("ffws", ffvd(int ), (int)18);
                            continue block105;
                        }
                        case 1676752261: {
                            v11 = ha.ffml("ffwu", ffvd(int ), (int)19);
                            continue block105;
                        }
                    }
                    break;
                }
                if (!this.targets.isSelected("\u0428\u0430\u0440\u044b")) ** GOTO lbl127
                if (var2_4) ** GOTO lbl29
                v12 /* !! */  = ha.lv;
                if (true) ** GOTO lbl107
                block106: while (true) {
                    v12 /* !! */  = (long)(ha.ffml("ffwx", ffvd(int ), (int)21) - ha.ffml("ffwv", ffvd(int ), (int)20));
lbl107:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1269206179: {
                            break block106;
                        }
                        case -1002589337: {
                            continue block106;
                        }
                    }
                    break;
                }
                v13 /* !! */  = ha.lv;
                if (true) ** GOTO lbl116
                block107: while (true) {
                    v13 /* !! */  = (long)(v14 - ha.ffml("ffwz", ffvd(int ), (int)22));
lbl116:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1269206179: {
                            break block107;
                        }
                        case -641618342: {
                            v14 = ha.ffml("ffxa", ffvd(int ), (int)23);
                            continue block107;
                        }
                        case 1202848579: {
                            v14 = ha.ffml("ffxc", ffvd(int ), (int)24);
                            continue block107;
                        }
                    }
                    break;
                }
                if (var1_1.method_31574(class_1802.field_8575)) ** GOTO lbl255
                if (var2_4) ** GOTO lbl29
lbl127:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl29
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_4 = ha.lv - ha.ffml("ffxe", ffvd(int ), (int)25)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == ha.ffml("ffxf", ffmb(int ), (int)82)) break;
                    v15 /* !! */  = (long)ha.ffml("ffxj", ffmb(int ), (int)83);
                }
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_5 = ha.lv - ha.ffml("ffxk", ffvd(int ), (int)26)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == ha.ffml("ffxm", ffmb(int ), (int)84)) break;
                    v16 /* !! */  = (long)ha.ffml("ffxn", ffmb(int ), (int)85);
                }
                if (!this.targets.isSelected("\u041e\u0441\u043a\u043e\u043b\u043a\u0438")) ** GOTO lbl160
                if (var2_4) ** GOTO lbl29
                v17 /* !! */  = ha.lv;
                if (true) ** GOTO lbl144
                block110: while (true) {
                    v17 /* !! */  = (long)(ha.ffml("ffxp", ffvd(int ), (int)28) - ha.ffml("ffxo", ffvd(int ), (int)27));
lbl144:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1269206179: {
                            break block110;
                        }
                        case 710029547: {
                            continue block110;
                        }
                    }
                    break;
                }
                v18 /* !! */  = ha.lv;
                if (true) ** GOTO lbl153
                block111: while (true) {
                    v18 /* !! */  = (long)(ha.ffml("ffxv", ffvd(int ), (int)30) - ha.ffml("ffxq", ffvd(int ), (int)29));
lbl153:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1269206179: {
                            break block111;
                        }
                        case 554030145: {
                            continue block111;
                        }
                    }
                    break;
                }
                if (var1_1.method_31574(class_1802.field_8070)) ** GOTO lbl255
                if (var2_4) ** GOTO lbl29
lbl160:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl29
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_6 = ha.lv - ha.ffml("ffxx", ffvd(int ), (int)31)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == ha.ffml("ffxy", ffmb(int ), (int)86)) break;
                    v19 /* !! */  = (long)ha.ffml("ffya", ffmb(int ), (int)87);
                }
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_7 = ha.lv - ha.ffml("ffyb", ffvd(int ), (int)32)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == ha.ffml("ffyc", ffmb(int ), (int)88)) break;
                    v20 /* !! */  = (long)ha.ffml("ffyd", ffmb(int ), (int)89);
                }
                if (!this.targets.isSelected("\u0414\u0436\u0435\u043a")) ** GOTO lbl193
                if (var2_4) ** GOTO lbl29
                v21 /* !! */  = ha.lv;
                if (true) ** GOTO lbl177
                block114: while (true) {
                    v21 /* !! */  = (long)(ha.ffml("ffyg", ffvd(int ), (int)34) - ha.ffml("ffyf", ffvd(int ), (int)33));
lbl177:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1269206179: {
                            break block114;
                        }
                        case 588531555: {
                            continue block114;
                        }
                    }
                    break;
                }
                v22 /* !! */  = ha.lv;
                if (true) ** GOTO lbl186
                block115: while (true) {
                    v22 /* !! */  = (long)(ha.ffml("ffyj", ffvd(int ), (int)36) - ha.ffml("ffyh", ffvd(int ), (int)35));
lbl186:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1269206179: {
                            break block115;
                        }
                        case -1251388244: {
                            continue block115;
                        }
                    }
                    break;
                }
                if (var1_1.method_31574(class_1802.field_17519)) ** GOTO lbl255
                if (var2_4) ** GOTO lbl29
lbl193:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl29
                v23 /* !! */  = ha.lv;
                if (true) ** GOTO lbl198
                block116: while (true) {
                    v23 /* !! */  = (long)(v24 - ha.ffml("ffyl", ffvd(int ), (int)37));
lbl198:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1269206179: {
                            break block116;
                        }
                        case -1165842646: {
                            v24 = ha.ffml("ffym", ffvd(int ), (int)38);
                            continue block116;
                        }
                        case -661178377: {
                            v24 = ha.ffml("ffyp", ffvd(int ), (int)39);
                            continue block116;
                        }
                    }
                    break;
                }
                v25 /* !! */  = ha.lv;
                if (true) ** GOTO lbl211
                block117: while (true) {
                    v25 /* !! */  = (long)(v26 - ha.ffml("ffyr", ffvd(int ), (int)40));
lbl211:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -1594370509: {
                            v26 = ha.ffml("ffyt", ffvd(int ), (int)41);
                            continue block117;
                        }
                        case -1269206179: {
                            break block117;
                        }
                        case 121577463: {
                            v26 = ha.ffml("ffyu", ffvd(int ), (int)42);
                            continue block117;
                        }
                        case 1573122411: {
                            v26 = ha.ffml("ffyv", ffvd(int ), (int)43);
                            continue block117;
                        }
                    }
                    break;
                }
                if (!this.targets.isSelected("\u041e6/\u041e7")) ** GOTO lbl260
                if (var2_4) ** GOTO lbl29
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_8 = ha.lv - ha.ffml("ffyx", ffvd(int ), (int)44)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == ha.ffml("ffyy", ffmb(int ), (int)90)) break;
                    v27 /* !! */  = (long)ha.ffml("ffza", ffmb(int ), (int)91);
                }
                v28 = var1_1.method_7964();
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_9 = ha.lv - ha.ffml("ffzb", ffvd(int ), (int)45)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == ha.ffml("ffzd", ffmb(int ), (int)92)) break;
                    v29 /* !! */  = (long)ha.ffml("ffze", ffmb(int ), (int)93);
                }
                v30 = v28.getString();
                v31 /* !! */  = ha.lv;
                if (true) ** GOTO lbl241
                block120: while (true) {
                    v31 /* !! */  = (long)(v32 - ha.ffml("ffzg", ffvd(int ), (int)46));
lbl241:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -1269206179: {
                            break block120;
                        }
                        case -1261852790: {
                            v32 = ha.ffml("ffzh", ffvd(int ), (int)47);
                            continue block120;
                        }
                        case -378121832: {
                            v32 = ha.ffml("ffzl", ffvd(int ), (int)48);
                            continue block120;
                        }
                        case 520509335: {
                            v32 = ha.ffml("ffzm", ffvd(int ), (int)49);
                            continue block120;
                        }
                    }
                    break;
                }
                if (!v30.matches(".*[67].*")) ** GOTO lbl260
                if (var2_4) ** GOTO lbl29
lbl255:
                // 5 sources

                if (var2_4 || var2_4) ** GOTO lbl29
                v33 = ha.ffml("ffzo", ffmb(int ), (int)94);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl263
lbl260:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v33 = ha.ffml("ffzp", ffmb(int ), (int)95);
lbl263:
                // 2 sources

                return (boolean)v33;
            }
lbl264:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)ha.ffml("ffzq", ffmb(int ), (int)96);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl375
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ha.ffml("ffzt", ffmb(int ), (int)97);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl313
                    break;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)ha.ffml("ffzu", ffmb(int ), (int)98);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl322
            }
lbl280:
            // 4 sources

            case 3: {
                var3_3 /* !! */  = (int)ha.ffml("ffzw", ffmb(int ), (int)99);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl355
            }
lbl285:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)ha.ffml("ffzx", ffmb(int ), (int)100);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl309
            }
            case 5: {
                var3_3 /* !! */  = (int)ha.ffml("ffzz", ffmb(int ), (int)101);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl375
            }
            case 6: {
                var3_3 /* !! */  = (int)ha.ffml("fgaa", ffmb(int ), (int)102);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl309
            }
            case 7: {
                var3_3 /* !! */  = (int)ha.ffml("fgac", ffmb(int ), (int)103);
                if (!var4_2) ** GOTO lbl280
                throw null;
            }
lbl304:
            // 3 sources

            case 8: {
                var3_3 /* !! */  = (int)ha.ffml("fgae", ffmb(int ), (int)104);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl322
            }
lbl309:
            // 4 sources

            case 9: {
                var3_3 /* !! */  = (int)ha.ffml("fgaf", ffmb(int ), (int)105);
                if (!var4_2) ** GOTO lbl264
                throw null;
            }
lbl313:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)ha.ffml("fgah", ffmb(int ), (int)106);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl371
            }
            case 11: {
                var3_3 /* !! */  = (int)ha.ffml("fgai", ffmb(int ), (int)107);
                if (!var4_2) ** GOTO lbl304
                throw null;
            }
lbl322:
            // 3 sources

            case 12: {
                var3_3 /* !! */  = (int)ha.ffml("fgak", ffmb(int ), (int)108);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl379
            }
            case 13: {
                var3_3 /* !! */  = (int)ha.ffml("fgan", ffmb(int ), (int)109);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl346
            }
            case 14: {
                var3_3 /* !! */  = (int)ha.ffml("fgap", ffmb(int ), (int)110);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl367
            }
            case 15: {
                var3_3 /* !! */  = (int)ha.ffml("fgar", ffmb(int ), (int)111);
                if (!var4_2) ** GOTO lbl309
                throw null;
            }
lbl341:
            // 2 sources

            case 16: {
                var3_3 /* !! */  = (int)ha.ffml("fgas", ffmb(int ), (int)112);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl375
            }
lbl346:
            // 3 sources

            case 17: {
                var3_3 /* !! */  = (int)ha.ffml("fgau", ffmb(int ), (int)113);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl375
            }
            case 18: {
                var3_3 /* !! */  = (int)ha.ffml("fgav", ffmb(int ), (int)114);
                if (!var4_2) ** GOTO lbl285
                throw null;
            }
lbl355:
            // 2 sources

            case 19: {
                var3_3 /* !! */  = (int)ha.ffml("fgaw", ffmb(int ), (int)115);
                if (!var4_2) ** GOTO lbl341
                throw null;
            }
lbl359:
            // 2 sources

            case 20: {
                var3_3 /* !! */  = (int)ha.ffml("fgax", ffmb(int ), (int)116);
                if (!var4_2) ** GOTO lbl280
                throw null;
            }
            case 21: {
                var3_3 /* !! */  = (int)ha.ffml("fgba", ffmb(int ), (int)117);
                if (!var4_2) ** GOTO lbl285
                throw null;
            }
lbl367:
            // 2 sources

            case 22: {
                var3_3 /* !! */  = (int)ha.ffml("fgbc", ffmb(int ), (int)118);
                if (!var4_2) ** GOTO lbl304
                throw null;
            }
lbl371:
            // 2 sources

            case 23: {
                var3_3 /* !! */  = (int)ha.ffml("fgbe", ffmb(int ), (int)119);
                if (!var4_2) ** GOTO lbl346
                throw null;
            }
lbl375:
            // 5 sources

            case 24: {
                var3_3 /* !! */  = (int)ha.ffml("fgbf", ffmb(int ), (int)120);
                if (!var4_2) ** GOTO lbl280
                throw null;
            }
lbl379:
            // 2 sources

            case 25: {
                var3_3 /* !! */  = (int)ha.ffml("fgbh", ffmb(int ), (int)121);
                if (!var4_2) ** GOTO lbl359
                throw null;
            }
            case 26: 
        }
        var3_3 /* !! */  = (int)ha.ffml("fgbi", ffmb(int ), (int)122);
        ** while (!var4_2)
lbl386:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ha() {
        var2_1 /* !! */  = ha.b;
        super("AimingBalls", "\u041d\u0430\u0432\u043e\u0434\u0438\u0442\u0441\u044f \u043d\u0430 \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u044b\u0439 \u0446\u0435\u043d\u043d\u044b\u0439 \u0434\u0440\u043e\u043f", du.RAGE);
        this.targets = new ke("\u041d\u0430\u0432\u043e\u0434\u0438\u0442\u044c\u0441\u044f \u043d\u0430", "\u0422\u0438\u043f\u044b \u0446\u0435\u043d\u043d\u043e\u0433\u043e \u0434\u0440\u043e\u043f\u0430").value(new String[]{"\u042d\u043b\u0438\u0442\u0440\u044b", "\u0428\u0430\u0440\u044b", "\u041e\u0441\u043a\u043e\u043b\u043a\u0438", "\u0414\u0436\u0435\u043a", "\u041e6/\u041e7"}).selected(new String[]{"\u042d\u043b\u0438\u0442\u0440\u044b", "\u0428\u0430\u0440\u044b", "\u041e\u0441\u043a\u043e\u043b\u043a\u0438", "\u0414\u0436\u0435\u043a", "\u041e6/\u041e7"});
        this.clientLook = new kb("Client Look", "\u041f\u043e\u0432\u043e\u0440\u0430\u0447\u0438\u0432\u0430\u0442\u044c \u043a\u0430\u043c\u0435\u0440\u0443 \u0438\u0433\u0440\u043e\u043a\u0430").setValue((boolean)ha.ffml("ffmo", ffmb(int ), (int)0));
        this.distance = new kg("\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f", "\u0420\u0430\u0434\u0438\u0443\u0441 \u043f\u043e\u0438\u0441\u043a\u0430 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432", (float)ha.ffml("ffmu", ffmr(int ), (int)1)).range(1.0f, (float)ha.ffml("ffmv", ffmr(int ), (int)2)).step(1.0f);
        this.speed = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043f\u043e\u0432\u043e\u0440\u043e\u0442\u0430", (float)ha.ffml("ffng", ffmr(int ), (int)3)).range(1.0f, (float)ha.ffml("ffnj", ffmr(int ), (int)4)).step(1.0f);
        this.settings(new jx[]{this.targets, this.clientLook, this.distance, this.speed});
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl12:
            // 2 sources

            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)ha.ffml("ffnl", ffmb(int ), (int)5);
                }
            }
lbl16:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)ha.ffml("ffnm", ffmb(int ), (int)6);
                ** GOTO lbl30
            }
lbl19:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ha.ffml("ffno", ffmb(int ), (int)7);
                    ** GOTO lbl12
                    break;
                }
            }
            case 3: {
                var2_1 /* !! */  = (int)ha.ffml("ffnr", ffmb(int ), (int)8);
                ** GOTO lbl19
            }
            case 4: {
                var2_1 /* !! */  = (int)ha.ffml("ffns", ffmb(int ), (int)9);
            }
            case 5: {
                var2_1 /* !! */  = (int)ha.ffml("ffoa", ffmb(int ), (int)10);
            }
lbl30:
            // 3 sources

            case 6: {
                var2_1 /* !! */  = (int)ha.ffml("ffoc", ffmb(int ), (int)11);
                ** GOTO lbl16
            }
            case 7: 
        }
        var2_1 /* !! */  = (int)ha.ffml("ffod", ffmb(int ), (int)12);
        ** while (true)
    }

    private static /* synthetic */ void fgcm() {
        ha.ffmk[100] = -1523599348;
        ha.ffmk[101] = -462142006;
        ha.ffmk[102] = -1376250745;
        ha.ffmk[103] = 1092239487;
        ha.ffmk[104] = -387322264;
        ha.ffmk[105] = 36186813;
        ha.ffmk[106] = 485005464;
        ha.ffmk[107] = -1166271800;
        ha.ffmk[108] = 1013162624;
        ha.ffmk[109] = -1205039878;
        ha.ffmk[110] = 1388438961;
        ha.ffmk[111] = 999699534;
        ha.ffmk[112] = -1014057395;
        ha.ffmk[113] = 1362623771;
        ha.ffmk[114] = 1677909659;
        ha.ffmk[115] = -185113024;
        ha.ffmk[116] = -1115453334;
        ha.ffmk[117] = 342942288;
        ha.ffmk[118] = -626402516;
        ha.ffmk[119] = 1751605636;
        ha.ffmk[120] = 382465016;
        ha.ffmk[121] = -1888270732;
        ha.ffmk[122] = -361331510;
    }

    private static /* synthetic */ void fgbu() {
        ha.ffmk[0] = -1681067192;
        ha.ffmk[1] = -419195555;
        ha.ffmk[2] = 1883189017;
        ha.ffmk[3] = -1059950296;
        ha.ffmk[4] = -25131796;
        ha.ffmk[5] = -1626443082;
        ha.ffmk[6] = -150388337;
        ha.ffmk[7] = 1886404610;
        ha.ffmk[8] = -942119091;
        ha.ffmk[9] = 807034159;
        ha.ffmk[10] = -727075650;
        ha.ffmk[11] = 763403477;
        ha.ffmk[12] = -1314996160;
        ha.ffmk[13] = 1652648195;
        ha.ffmk[14] = 1638982771;
        ha.ffmk[15] = -2103571927;
        ha.ffmk[16] = 1134405258;
        ha.ffmk[17] = 153501498;
        ha.ffmk[18] = -1965538606;
        ha.ffmk[19] = -751219801;
        ha.ffmk[20] = -1232181030;
        ha.ffmk[21] = -36212434;
        ha.ffmk[22] = -1950604756;
        ha.ffmk[23] = -1683767132;
        ha.ffmk[24] = -615925875;
        ha.ffmk[25] = -231297912;
        ha.ffmk[26] = -2038491882;
        ha.ffmk[27] = 658622300;
        ha.ffmk[28] = 870122142;
        ha.ffmk[29] = -2028700899;
        ha.ffmk[30] = 1197819919;
        ha.ffmk[31] = -1451115445;
        ha.ffmk[32] = -956759654;
        ha.ffmk[33] = 1430327906;
        ha.ffmk[34] = 1997475300;
        ha.ffmk[35] = 1595644091;
        ha.ffmk[36] = -118411097;
        ha.ffmk[37] = -1806293473;
        ha.ffmk[38] = 1202015830;
        ha.ffmk[39] = 1821599390;
        ha.ffmk[40] = 482843079;
        ha.ffmk[41] = -163663261;
        ha.ffmk[42] = -1307854087;
        ha.ffmk[43] = -2108777059;
        ha.ffmk[44] = -1454018978;
        ha.ffmk[45] = -1055067977;
        ha.ffmk[46] = 990309982;
        ha.ffmk[47] = -84296336;
        ha.ffmk[48] = -1868221199;
        ha.ffmk[49] = 780004502;
        ha.ffmk[50] = 1182980468;
        ha.ffmk[51] = 654096752;
        ha.ffmk[52] = 2107346736;
        ha.ffmk[53] = 1372416796;
        ha.ffmk[54] = 185082667;
        ha.ffmk[55] = -862844566;
        ha.ffmk[56] = 1918360629;
        ha.ffmk[57] = -403432964;
        ha.ffmk[58] = -147497383;
        ha.ffmk[59] = -1459784779;
        ha.ffmk[60] = -1467598066;
        ha.ffmk[61] = 1379219895;
        ha.ffmk[62] = -1459930655;
        ha.ffmk[63] = 1637672070;
        ha.ffmk[64] = -1334791816;
        ha.ffmk[65] = -301975798;
        ha.ffmk[66] = -1331097839;
        ha.ffmk[67] = -731978110;
        ha.ffmk[68] = -1539998995;
        ha.ffmk[69] = -37886041;
        ha.ffmk[70] = 583627340;
        ha.ffmk[71] = -338718572;
        ha.ffmk[72] = 644137953;
        ha.ffmk[73] = 191365614;
        ha.ffmk[74] = 354777753;
        ha.ffmk[75] = 157625991;
        ha.ffmk[76] = -1702368750;
        ha.ffmk[77] = -1836754693;
        ha.ffmk[78] = 1314718179;
        ha.ffmk[79] = 884286904;
        ha.ffmk[80] = -376105219;
        ha.ffmk[81] = 1702012358;
        ha.ffmk[82] = 2065791015;
        ha.ffmk[83] = 1781847444;
        ha.ffmk[84] = 858099812;
        ha.ffmk[85] = -1373553930;
        ha.ffmk[86] = 1690435524;
        ha.ffmk[87] = 558060152;
        ha.ffmk[88] = 1230172807;
        ha.ffmk[89] = -1963198918;
        ha.ffmk[90] = 27173889;
        ha.ffmk[91] = -1293176648;
        ha.ffmk[92] = 1923755492;
        ha.ffmk[93] = -632310313;
        ha.ffmk[94] = 322009152;
        ha.ffmk[95] = 489438471;
        ha.ffmk[96] = -2125787021;
        ha.ffmk[97] = 502280520;
        ha.ffmk[98] = 2089422718;
        ha.ffmk[99] = -1313225976;
    }

    public static /* synthetic */ CallSite ffml(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ double ffox(int n2) {
        return Double.longBitsToDouble(ffoy[n2] ^ ffoz[n2]);
    }

    private static /* synthetic */ long ffvd(int n2) {
        return ffoy[n2] ^ ffoz[n2];
    }

    private static /* synthetic */ void fgbq() {
        ha.ffmi[100] = -1523599360;
        ha.ffmi[101] = -462142006;
        ha.ffmi[102] = -1376250742;
        ha.ffmi[103] = 1092239479;
        ha.ffmi[104] = -387322256;
        ha.ffmi[105] = 36186805;
        ha.ffmi[106] = 485005470;
        ha.ffmi[107] = -1166271802;
        ha.ffmi[108] = 1013162640;
        ha.ffmi[109] = -1205039892;
        ha.ffmi[110] = 1388438949;
        ha.ffmi[111] = 999699528;
        ha.ffmi[112] = -1014057384;
        ha.ffmi[113] = 1362623756;
        ha.ffmi[114] = 1677909656;
        ha.ffmi[115] = -185113000;
        ha.ffmi[116] = -1115453336;
        ha.ffmi[117] = 342942280;
        ha.ffmi[118] = -626402515;
        ha.ffmi[119] = 1751605649;
        ha.ffmi[120] = 382465009;
        ha.ffmi[121] = -1888270751;
        ha.ffmi[122] = -361331493;
    }

    private static /* synthetic */ void fgdb() {
        ha.ffoz[0] = 7369013609550697333L;
        ha.ffoz[1] = 7127049937172605416L;
        ha.ffoz[2] = -1394430334792608441L;
        ha.ffoz[3] = -6109263461999890599L;
        ha.ffoz[4] = -2393208312025058215L;
        ha.ffoz[5] = 620390860715499150L;
        ha.ffoz[6] = 4294665596863832298L;
        ha.ffoz[7] = 5815931174431194652L;
        ha.ffoz[8] = 8283955656163441268L;
        ha.ffoz[9] = 4087032033729996529L;
        ha.ffoz[10] = -3795068651891126847L;
        ha.ffoz[11] = 1239661119092665464L;
        ha.ffoz[12] = -6987391644250958901L;
        ha.ffoz[13] = -3343012784980910874L;
        ha.ffoz[14] = -615746326857926460L;
        ha.ffoz[15] = 2357834974600773992L;
        ha.ffoz[16] = 6437718696759816376L;
        ha.ffoz[17] = 3769382773626354185L;
        ha.ffoz[18] = 6357395873908579993L;
        ha.ffoz[19] = -6088365850112146804L;
        ha.ffoz[20] = -1956430951473703123L;
        ha.ffoz[21] = -2189771592624164741L;
        ha.ffoz[22] = 4429359387340087113L;
        ha.ffoz[23] = -663703941644337537L;
        ha.ffoz[24] = 6507365491901438271L;
        ha.ffoz[25] = 9133005552765876466L;
        ha.ffoz[26] = 7683260953867673522L;
        ha.ffoz[27] = 7026462637640061240L;
        ha.ffoz[28] = 430694358748117356L;
        ha.ffoz[29] = 8940408995394065128L;
        ha.ffoz[30] = 3449673001097247951L;
        ha.ffoz[31] = -3848336547000284502L;
        ha.ffoz[32] = 7119591703138401720L;
        ha.ffoz[33] = 226510537975851193L;
        ha.ffoz[34] = -4060454813798286702L;
        ha.ffoz[35] = -2497857403151923953L;
        ha.ffoz[36] = -8524689466051739619L;
        ha.ffoz[37] = 8132391673323458412L;
        ha.ffoz[38] = 4616014430718144585L;
        ha.ffoz[39] = -3947726063742934101L;
        ha.ffoz[40] = -7596673872759935153L;
        ha.ffoz[41] = 1878974446170538461L;
        ha.ffoz[42] = 223596520294840672L;
        ha.ffoz[43] = -2390700057956790111L;
        ha.ffoz[44] = -1629753929174343906L;
        ha.ffoz[45] = -2786792392354294451L;
        ha.ffoz[46] = 3455579984738880458L;
        ha.ffoz[47] = 4067193015939766463L;
        ha.ffoz[48] = -2414124493985169477L;
        ha.ffoz[49] = -5167594439196805493L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block113: {
            block112: {
                var12_2 = ha.c;
                var11_3 /* !! */  = ha.b;
                var10_4 = ha.a;
                if (var12_2) {
                    throw null;
lbl6:
                    // 32 sources

                    return;
                }
                if (var10_4 || var10_4) ** GOTO lbl6
                if (ha.mc.field_1724 == null) break block112;
                if (var10_4) ** GOTO lbl6
                if (ha.mc.field_1687 != null) break block113;
                if (var10_4) ** GOTO lbl6
            }
            if (var10_4 || var10_4) ** GOTO lbl6
            return;
        }
        if (var10_4 || var10_4) ** GOTO lbl6
        var2_5 = null;
        if (var10_4 || var10_4) ** GOTO lbl6
        var3_6 = this.distance.getValue() * this.distance.getValue();
        if (var10_4 || var10_4) ** GOTO lbl6
        var5_7 = ha.mc.field_1687.method_18112().iterator();
        if (var10_4) ** GOTO lbl6
        block61: while (true) {
            if (var10_4 || var10_4) ** GOTO lbl6
            if (!var5_7.hasNext()) ** GOTO lbl56
            if (var10_4) ** GOTO lbl6
            var6_8 = (class_1297)var5_7.next();
            if (var10_4 || var10_4) ** GOTO lbl6
            if (!(var6_8 instanceof class_1542)) continue;
            if (var11_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var11_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var10_4) ** GOTO lbl6
                    var7_10 = (class_1542)var6_8;
                    if (var10_4 || var10_4) ** GOTO lbl6
                    if (!var7_10.method_5805()) continue block61;
                    if (var10_4) ** GOTO lbl6
                    if (this.isTarget(var7_10.method_6983())) ** GOTO lbl43
                    if (var10_4) ** GOTO lbl6
                    if (!var12_2) continue block61;
                    throw null;
lbl43:
                    // 1 sources

                    if (var10_4 || var10_4) ** GOTO lbl6
                    var8_12 = ha.mc.field_1724.method_5858((class_1297)var7_10);
                    if (var10_4 || var10_4) ** GOTO lbl6
                    if (!(var8_12 < var3_6)) ** GOTO lbl52
                    if (var10_4 || var10_4) ** GOTO lbl6
                    var3_6 = var8_12;
                    if (var10_4 || var10_4) ** GOTO lbl6
                    var2_5 = var7_10;
                    if (var10_4) ** GOTO lbl6
lbl52:
                    // 2 sources

                    if (var10_4 || var10_4) ** GOTO lbl6
                    if (var12_2) ** break;
                    continue block61;
                    throw null;
                }
lbl56:
                // 1 sources

                if (var10_4 || var10_4) ** GOTO lbl6
                if (var2_5 != null) ** GOTO lbl60
                if (var10_4) ** GOTO lbl6
                return;
lbl60:
                // 1 sources

                if (var10_4 || var10_4) ** GOTO lbl6
                var5_7 = ow.calculateAngle(var2_5.method_73189().method_1031(0.0, (double)var2_5.method_17682() * ha.ffml("ffpc", ffox(int ), (int)0), 0.0));
                if (var10_4 || var10_4) ** GOTO lbl6
                var6_9 = this.speed.getValue();
                if (var10_4 || var10_4) ** GOTO lbl6
                var7_11 = ha.mc.field_1724.method_36454() + class_3532.method_15363((float)class_3532.method_15393((float)(var5_7.getYaw() - ha.mc.field_1724.method_36454())), (float)(-var6_9), (float)var6_9);
                if (var10_4 || var10_4) ** GOTO lbl6
                var8_13 = class_3532.method_15363((float)(ha.mc.field_1724.method_36455() + class_3532.method_15363((float)(var5_7.getPitch() - ha.mc.field_1724.method_36455()), (float)(-var6_9), (float)var6_9)), (float)ha.ffml("ffpe", ffmr(int ), (int)13), (float)ha.ffml("ffpf", ffmr(int ), (int)14));
                if (var10_4 || var10_4) ** GOTO lbl6
                if (!this.clientLook.isValue()) ** GOTO lbl75
                if (var10_4 || var10_4) ** GOTO lbl6
                ha.mc.field_1724.method_36456(var7_11);
                if (var10_4 || var10_4) ** GOTO lbl6
                ha.mc.field_1724.method_36457(var8_13);
                if (var10_4) ** GOTO lbl6
lbl75:
                // 2 sources

                if (!var10_4 && !var10_4) ** break;
                ** continue;
                return;
                case 0: {
                    var11_3 /* !! */  = (int)ha.ffml("ffpp", ffmb(int ), (int)15);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl133
                }
lbl83:
                // 3 sources

                case 1: {
                    var11_3 /* !! */  = (int)ha.ffml("ffpr", ffmb(int ), (int)16);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl210
                }
lbl88:
                // 4 sources

                case 2: {
                    var11_3 /* !! */  = (int)ha.ffml("ffps", ffmb(int ), (int)17);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl295
                }
lbl93:
                // 3 sources

                case 3: {
                    var11_3 /* !! */  = (int)ha.ffml("ffpv", ffmb(int ), (int)18);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl236
                }
lbl98:
                // 2 sources

                case 4: {
                    var11_3 /* !! */  = (int)ha.ffml("ffpy", ffmb(int ), (int)19);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl277
                }
lbl103:
                // 2 sources

                case 5: {
                    var11_3 /* !! */  = (int)ha.ffml("ffqb", ffmb(int ), (int)20);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl220
                }
                case 6: {
                    var11_3 /* !! */  = (int)ha.ffml("ffqc", ffmb(int ), (int)21);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl282
                }
                case 7: {
                    var11_3 /* !! */  = (int)ha.ffml("ffqh", ffmb(int ), (int)22);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl161
                }
lbl118:
                // 2 sources

                case 8: {
                    var11_3 /* !! */  = (int)ha.ffml("ffqk", ffmb(int ), (int)23);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl228
                }
lbl123:
                // 2 sources

                case 9: {
                    var11_3 /* !! */  = (int)ha.ffml("ffqn", ffmb(int ), (int)24);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl327
                }
                case 10: {
                    var11_3 /* !! */  = (int)ha.ffml("ffqq", ffmb(int ), (int)25);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl327
                }
lbl133:
                // 2 sources

                case 11: {
                    var11_3 /* !! */  = (int)ha.ffml("ffqs", ffmb(int ), (int)26);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl269
                }
lbl138:
                // 3 sources

                case 12: {
                    var11_3 /* !! */  = (int)ha.ffml("ffqu", ffmb(int ), (int)27);
                    if (!var12_2) ** GOTO lbl93
                    throw null;
                }
lbl142:
                // 2 sources

                case 13: {
                    var11_3 /* !! */  = (int)ha.ffml("ffqv", ffmb(int ), (int)28);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl287
                }
lbl147:
                // 2 sources

                case 14: {
                    var11_3 /* !! */  = (int)ha.ffml("ffqz", ffmb(int ), (int)29);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl303
                }
                case 15: {
                    var11_3 /* !! */  = (int)ha.ffml("ffrc", ffmb(int ), (int)30);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl327
                }
                case 16: {
                    var11_3 /* !! */  = (int)ha.ffml("ffrg", ffmb(int ), (int)31);
                    if (!var12_2) ** GOTO lbl88
                    throw null;
                }
lbl161:
                // 2 sources

                case 17: {
                    var11_3 /* !! */  = (int)ha.ffml("ffri", ffmb(int ), (int)32);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl228
                }
                case 18: {
                    var11_3 /* !! */  = (int)ha.ffml("ffrk", ffmb(int ), (int)33);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl299
                }
lbl171:
                // 2 sources

                case 19: {
                    var11_3 /* !! */  = (int)ha.ffml("ffrm", ffmb(int ), (int)34);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl210
                }
                case 20: {
                    var11_3 /* !! */  = (int)ha.ffml("ffru", ffmb(int ), (int)35);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl215
                }
lbl181:
                // 2 sources

                case 21: {
                    var11_3 /* !! */  = (int)ha.ffml("ffrv", ffmb(int ), (int)36);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl200
                }
                case 22: {
                    var11_3 /* !! */  = (int)ha.ffml("ffrw", ffmb(int ), (int)37);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl210
                }
                case 23: {
                    var11_3 /* !! */  = (int)ha.ffml("ffsa", ffmb(int ), (int)38);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl299
                }
                case 24: {
                    var11_3 /* !! */  = (int)ha.ffml("ffsd", ffmb(int ), (int)39);
                    if (!var12_2) ** GOTO lbl181
                    throw null;
                }
lbl200:
                // 2 sources

                case 25: {
                    var11_3 /* !! */  = (int)ha.ffml("ffsf", ffmb(int ), (int)40);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl241
                }
lbl205:
                // 4 sources

                case 26: {
                    var11_3 /* !! */  = (int)ha.ffml("ffsi", ffmb(int ), (int)41);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl273
                }
lbl210:
                // 5 sources

                case 27: {
                    var11_3 /* !! */  = (int)ha.ffml("ffsm", ffmb(int ), (int)42);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl265
                }
lbl215:
                // 2 sources

                case 28: {
                    var11_3 /* !! */  = (int)ha.ffml("ffsp", ffmb(int ), (int)43);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl265
                }
lbl220:
                // 2 sources

                case 29: {
                    var11_3 /* !! */  = (int)ha.ffml("ffsq", ffmb(int ), (int)44);
                    if (!var12_2) break block61;
                    throw null;
                }
                case 30: {
                    var11_3 /* !! */  = (int)ha.ffml("ffsr", ffmb(int ), (int)45);
                    if (!var12_2) ** GOTO lbl205
                    throw null;
                }
lbl228:
                // 3 sources

                case 31: {
                    var11_3 /* !! */  = (int)ha.ffml("ffst", ffmb(int ), (int)46);
                    if (!var12_2) ** GOTO lbl88
                    throw null;
                }
                case 32: {
                    var11_3 /* !! */  = (int)ha.ffml("ffsv", ffmb(int ), (int)47);
                    if (!var12_2) ** GOTO lbl142
                    throw null;
                }
lbl236:
                // 2 sources

                case 33: {
                    var11_3 /* !! */  = (int)ha.ffml("fftd", ffmb(int ), (int)48);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl249
                }
lbl241:
                // 2 sources

                case 34: {
                    var11_3 /* !! */  = (int)ha.ffml("fftf", ffmb(int ), (int)49);
                    if (!var12_2) ** GOTO lbl205
                    throw null;
                }
                case 35: {
                    var11_3 /* !! */  = (int)ha.ffml("ffth", ffmb(int ), (int)50);
                    if (!var12_2) ** GOTO lbl103
                    throw null;
                }
lbl249:
                // 3 sources

                case 36: {
                    var11_3 /* !! */  = (int)ha.ffml("ffti", ffmb(int ), (int)51);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl269
                }
                case 37: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var11_3 /* !! */  = (int)ha.ffml("fftj", ffmb(int ), (int)52);
                        if (var12_2) {
                            throw null;
                        }
                        ** GOTO lbl273
                        break;
                    }
                }
                case 38: {
                    var11_3 /* !! */  = (int)ha.ffml("fftl", ffmb(int ), (int)53);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl295
                }
lbl265:
                // 3 sources

                case 39: {
                    var11_3 /* !! */  = (int)ha.ffml("fftn", ffmb(int ), (int)54);
                    if (!var12_2) ** GOTO lbl210
                    throw null;
                }
lbl269:
                // 3 sources

                case 40: {
                    var11_3 /* !! */  = (int)ha.ffml("fftr", ffmb(int ), (int)55);
                    if (!var12_2) ** GOTO lbl147
                    throw null;
                }
lbl273:
                // 3 sources

                case 41: {
                    var11_3 /* !! */  = (int)ha.ffml("fftt", ffmb(int ), (int)56);
                    if (!var12_2) break block61;
                    throw null;
                }
lbl277:
                // 2 sources

                case 42: {
                    var11_3 /* !! */  = (int)ha.ffml("fftw", ffmb(int ), (int)57);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl335
                }
lbl282:
                // 2 sources

                case 43: {
                    var11_3 /* !! */  = (int)ha.ffml("fftx", ffmb(int ), (int)58);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl291
                }
lbl287:
                // 2 sources

                case 44: {
                    var11_3 /* !! */  = (int)ha.ffml("ffty", ffmb(int ), (int)59);
                    if (!var12_2) ** GOTO lbl138
                    throw null;
                }
lbl291:
                // 2 sources

                case 45: {
                    var11_3 /* !! */  = (int)ha.ffml("ffua", ffmb(int ), (int)60);
                    if (!var12_2) ** GOTO lbl83
                    throw null;
                }
lbl295:
                // 4 sources

                case 46: {
                    var11_3 /* !! */  = (int)ha.ffml("ffub", ffmb(int ), (int)61);
                    if (!var12_2) ** GOTO lbl123
                    throw null;
                }
lbl299:
                // 3 sources

                case 47: {
                    var11_3 /* !! */  = (int)ha.ffml("ffuf", ffmb(int ), (int)62);
                    if (!var12_2) ** GOTO lbl249
                    throw null;
                }
lbl303:
                // 2 sources

                case 48: {
                    var11_3 /* !! */  = (int)ha.ffml("ffuh", ffmb(int ), (int)63);
                    if (!var12_2) ** GOTO lbl88
                    throw null;
                }
                case 49: {
                    var11_3 /* !! */  = (int)ha.ffml("ffui", ffmb(int ), (int)64);
                    if (!var12_2) ** GOTO lbl98
                    throw null;
                }
                case 50: {
                    var11_3 /* !! */  = (int)ha.ffml("fful", ffmb(int ), (int)65);
                    if (!var12_2) ** GOTO lbl295
                    throw null;
                }
                case 51: {
                    var11_3 /* !! */  = (int)ha.ffml("ffum", ffmb(int ), (int)66);
                    if (!var12_2) ** GOTO lbl205
                    throw null;
                }
                case 52: {
                    var11_3 /* !! */  = (int)ha.ffml("ffun", ffmb(int ), (int)67);
                    if (!var12_2) ** GOTO lbl171
                    throw null;
                }
                case 53: {
                    var11_3 /* !! */  = (int)ha.ffml("ffup", ffmb(int ), (int)68);
                    if (!var12_2) ** GOTO lbl93
                    throw null;
                }
lbl327:
                // 4 sources

                case 54: {
                    var11_3 /* !! */  = (int)ha.ffml("ffuu", ffmb(int ), (int)69);
                    if (!var12_2) ** GOTO lbl118
                    throw null;
                }
                case 55: {
                    var11_3 /* !! */  = (int)ha.ffml("ffuw", ffmb(int ), (int)70);
                    if (!var12_2) ** GOTO lbl138
                    throw null;
                }
lbl335:
                // 2 sources

                case 56: {
                    var11_3 /* !! */  = (int)ha.ffml("ffux", ffmb(int ), (int)71);
                    if (!var12_2) ** GOTO lbl83
                    throw null;
                }
                case 57: 
            }
            break;
        }
        var11_3 /* !! */  = (int)ha.ffml("ffuz", ffmb(int ), (int)72);
        ** while (!var12_2)
lbl342:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fgbl() {
        ha.ffmi[0] = -1681067191;
        ha.ffmi[1] = -1501325987;
        ha.ffmi[2] = 851390233;
        ha.ffmi[3] = -2098826968;
        ha.ffmi[4] = -1112242964;
        ha.ffmi[5] = -1626443086;
        ha.ffmi[6] = -150388341;
        ha.ffmi[7] = 0x70704007;
        ha.ffmi[8] = -942119091;
        ha.ffmi[9] = 807034154;
        ha.ffmi[10] = -727075655;
        ha.ffmi[11] = 763403472;
        ha.ffmi[12] = -1314996159;
        ha.ffmi[13] = -1607112445;
        ha.ffmi[14] = 587523187;
        ha.ffmi[15] = -2103571928;
        ha.ffmi[16] = 1134405251;
        ha.ffmi[17] = 153501467;
        ha.ffmi[18] = -1965538597;
        ha.ffmi[19] = -751219798;
        ha.ffmi[20] = -1232181052;
        ha.ffmi[21] = -36212438;
        ha.ffmi[22] = -1950604787;
        ha.ffmi[23] = -1683767150;
        ha.ffmi[24] = -615925843;
        ha.ffmi[25] = -231297879;
        ha.ffmi[26] = -2038491886;
        ha.ffmi[27] = 658622294;
        ha.ffmi[28] = 870122124;
        ha.ffmi[29] = -2028700919;
        ha.ffmi[30] = 1197819938;
        ha.ffmi[31] = -1451115399;
        ha.ffmi[32] = -956759636;
        ha.ffmi[33] = 1430327879;
        ha.ffmi[34] = 1997475269;
        ha.ffmi[35] = 1595644090;
        ha.ffmi[36] = -118411075;
        ha.ffmi[37] = -1806293465;
        ha.ffmi[38] = 1202015834;
        ha.ffmi[39] = 1821599387;
        ha.ffmi[40] = 482843081;
        ha.ffmi[41] = -163663250;
        ha.ffmi[42] = -1307854120;
        ha.ffmi[43] = -2108777039;
        ha.ffmi[44] = -1454018983;
        ha.ffmi[45] = -1055068029;
        ha.ffmi[46] = 990309965;
        ha.ffmi[47] = -84296357;
        ha.ffmi[48] = -1868221197;
        ha.ffmi[49] = 780004518;
        ha.ffmi[50] = 1182980440;
        ha.ffmi[51] = 654096732;
        ha.ffmi[52] = 2107346735;
        ha.ffmi[53] = 1372416827;
        ha.ffmi[54] = 185082677;
        ha.ffmi[55] = -862844577;
        ha.ffmi[56] = 1918360579;
        ha.ffmi[57] = -403432983;
        ha.ffmi[58] = -147497406;
        ha.ffmi[59] = -1459784828;
        ha.ffmi[60] = -1467598080;
        ha.ffmi[61] = 1379219879;
        ha.ffmi[62] = -1459930651;
        ha.ffmi[63] = 1637672111;
        ha.ffmi[64] = -1334791816;
        ha.ffmi[65] = -301975764;
        ha.ffmi[66] = -1331097829;
        ha.ffmi[67] = -731978082;
        ha.ffmi[68] = -1539999034;
        ha.ffmi[69] = -37886034;
        ha.ffmi[70] = 583627364;
        ha.ffmi[71] = -338718539;
        ha.ffmi[72] = 644137960;
        ha.ffmi[73] = 191365615;
        ha.ffmi[74] = -262238860;
        ha.ffmi[75] = 157625990;
        ha.ffmi[76] = -1702368749;
        ha.ffmi[77] = 1622861827;
        ha.ffmi[78] = 1314718178;
        ha.ffmi[79] = -1556971152;
        ha.ffmi[80] = -376105220;
        ha.ffmi[81] = 1703043727;
        ha.ffmi[82] = 2065791014;
        ha.ffmi[83] = 1358582431;
        ha.ffmi[84] = -858099813;
        ha.ffmi[85] = -147998926;
        ha.ffmi[86] = 1690435525;
        ha.ffmi[87] = 391678926;
        ha.ffmi[88] = 1230172806;
        ha.ffmi[89] = 597395308;
        ha.ffmi[90] = 27173888;
        ha.ffmi[91] = 1771057169;
        ha.ffmi[92] = 1923755493;
        ha.ffmi[93] = 1902929562;
        ha.ffmi[94] = 322009153;
        ha.ffmi[95] = 489438471;
        ha.ffmi[96] = -2125787036;
        ha.ffmi[97] = 502280540;
        ha.ffmi[98] = 2089422698;
        ha.ffmi[99] = -1313225966;
    }

    private static /* synthetic */ float ffmr(int n2) {
        return Float.intBitsToFloat(ffmi[n2] ^ ffmk[n2]);
    }
}

