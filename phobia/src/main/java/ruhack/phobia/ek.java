/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_1802
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Objects;
import java.util.function.Predicate;
import net.minecraft.class_1309;
import net.minecraft.class_1802;
import net.minecraft.class_238;
import net.minecraft.class_243;
import ruhack.phobia.aw;
import ruhack.phobia.cj;
import ruhack.phobia.d;
import ruhack.phobia.da;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.hv$AttackPerpetratorConfigurable;
import ruhack.phobia.ik;
import ruhack.phobia.ik$EntityFilter;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.ke;
import ruhack.phobia.kg;
import ruhack.phobia.nj;
import ruhack.phobia.ot;
import ruhack.phobia.ow;
import ruhack.phobia.ox;

public class ek
extends ds {
    class_1309 target;
    public static final int b;
    public final kg attackRange;
    private static int[] tmy;
    public static final boolean a;
    ox pointFinder;
    public final ke options;
    private static long[] tms;
    class_1309 lastTarget;
    public static final boolean c;
    public final ke targetType;
    ik targetSelector;
    static final long be = 8724937129173099868L;
    private static long[] tmt;
    private static int[] tmx;
    public final kb onlyCriticals;

    private static /* synthetic */ void ukb() {
        ek.tms[100] = 3737125208833912996L;
        ek.tms[101] = 5894221608221208049L;
        ek.tms[102] = -821741459006163741L;
        ek.tms[103] = 3396953837149413567L;
        ek.tms[104] = -5736832352802577155L;
        ek.tms[105] = 5915854257930619454L;
        ek.tms[106] = -4799876131715683686L;
        ek.tms[107] = -6538593306822043153L;
        ek.tms[108] = 4946620261561193107L;
        ek.tms[109] = 2676512814919165271L;
        ek.tms[110] = 8602435669504896833L;
        ek.tms[111] = -2470872770756433474L;
        ek.tms[112] = 4093945456143880867L;
        ek.tms[113] = -197157447144921234L;
        ek.tms[114] = -8064633856418920789L;
        ek.tms[115] = -4054752788152119458L;
        ek.tms[116] = -7076190488382653893L;
        ek.tms[117] = 1037991757014201974L;
        ek.tms[118] = 8451340251065702795L;
        ek.tms[119] = 4309217162257547160L;
        ek.tms[120] = 7806349817803440578L;
        ek.tms[121] = -2775033159746873743L;
        ek.tms[122] = 653250416146618814L;
        ek.tms[123] = 7070946317112533584L;
        ek.tms[124] = 1973883029306392512L;
        ek.tms[125] = -7213703930939969154L;
        ek.tms[126] = 1049287733836757679L;
        ek.tms[127] = -6918389144644091245L;
        ek.tms[128] = 2539212916080639900L;
        ek.tms[129] = 2425325468744551758L;
        ek.tms[130] = 4554267470427354220L;
        ek.tms[131] = -6555762987424511602L;
        ek.tms[132] = -2773248180102912248L;
        ek.tms[133] = -1933193664776666476L;
        ek.tms[134] = 6932870938714336788L;
        ek.tms[135] = 5210491643334862714L;
        ek.tms[136] = 702292558689818955L;
        ek.tms[137] = 7285467055609396438L;
        ek.tms[138] = -7491648727029459652L;
        ek.tms[139] = 1041810114782159647L;
        ek.tms[140] = -1413234917744844643L;
        ek.tms[141] = -8393089112511585001L;
        ek.tms[142] = -6987038957719214291L;
        ek.tms[143] = 8086813685736190038L;
        ek.tms[144] = 4335104965201555158L;
        ek.tms[145] = 6844503477727501107L;
        ek.tms[146] = 2524143810858804997L;
        ek.tms[147] = 3693174704297688383L;
        ek.tms[148] = -8366442972487643147L;
        ek.tms[149] = 8777434884997761282L;
        ek.tms[150] = 554798966748351057L;
        ek.tms[151] = 4451547089566752289L;
        ek.tms[152] = -496651786306783970L;
        ek.tms[153] = 4322694057134306485L;
        ek.tms[154] = 17994553126820002L;
        ek.tms[155] = 8345807099178160593L;
        ek.tms[156] = -1690749728460002111L;
        ek.tms[157] = -5210713582902870582L;
        ek.tms[158] = 8189226481876947956L;
        ek.tms[159] = 2130622049555129125L;
        ek.tms[160] = 4415575544925816928L;
        ek.tms[161] = 762933306534107155L;
        ek.tms[162] = 3153650736195376887L;
        ek.tms[163] = -1529248104175468932L;
        ek.tms[164] = -7108491819440524662L;
        ek.tms[165] = 6447936024085261927L;
        ek.tms[166] = -3524873065416731746L;
        ek.tms[167] = 5907461881720461238L;
        ek.tms[168] = -4593780468173216715L;
        ek.tms[169] = 2068478647895894584L;
        ek.tms[170] = -6853537372252857910L;
        ek.tms[171] = 5946204036811347634L;
        ek.tms[172] = -445865418354764862L;
        ek.tms[173] = 255003357297161718L;
        ek.tms[174] = 4171756189996216622L;
        ek.tms[175] = -4555395263898426052L;
        ek.tms[176] = -7119289311240217746L;
        ek.tms[177] = 7173538086969380031L;
        ek.tms[178] = -9169903347205176178L;
        ek.tms[179] = -5195855906439955018L;
        ek.tms[180] = 4350825738310961341L;
        ek.tms[181] = -8708141486195749083L;
        ek.tms[182] = -7541372403892447201L;
        ek.tms[183] = -3393646617290631610L;
        ek.tms[184] = -7411798698719901946L;
        ek.tms[185] = 1536272167462709804L;
        ek.tms[186] = 854818287276509711L;
        ek.tms[187] = 1218393930876084623L;
        ek.tms[188] = 8400489670821832653L;
        ek.tms[189] = 2391206780425735388L;
        ek.tms[190] = 4097722545606027900L;
        ek.tms[191] = -269997118874468860L;
        ek.tms[192] = 3100961763837687898L;
        ek.tms[193] = -566718620623421292L;
        ek.tms[194] = -3113163079082286048L;
        ek.tms[195] = -4226894648586579141L;
        ek.tms[196] = -7720330154985109209L;
        ek.tms[197] = -5568081969620159880L;
        ek.tms[198] = -5216283791552035552L;
        ek.tms[199] = -6811928174741695960L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public hv$AttackPerpetratorConfigurable getConfig() {
        v0 /* !! */  = ek.be;
        if (true) ** GOTO lbl5
        block82: while (true) {
            v0 /* !! */  = (long)(v1 - ek.tmu("ubd", tmr(int ), (int)169));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1849486950: {
                    v1 = ek.tmu("ube", tmr(int ), (int)170);
                    continue block82;
                }
                case -1610963620: {
                    break block82;
                }
                case 1230290308: {
                    v1 = ek.tmu("ubf", tmr(int ), (int)171);
                    continue block82;
                }
            }
            break;
        }
        var6_1 = ek.c;
        v2 /* !! */  = ek.be;
        if (true) ** GOTO lbl19
        block83: while (true) {
            v2 /* !! */  = (long)(v3 - ek.tmu("ubg", tmr(int ), (int)172));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1610963620: {
                    break block83;
                }
                case -1120296483: {
                    v3 = ek.tmu("ubh", tmr(int ), (int)173);
                    continue block83;
                }
                case 991350293: {
                    v3 = ek.tmu("ubi", tmr(int ), (int)174);
                    continue block83;
                }
            }
            break;
        }
        var5_2 /* !! */  = ek.b;
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = ek.be - ek.tmu("ubj", tmr(int ), (int)175)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ek.tmu("ubk", tmw(int ), (int)199)) break;
                    v4 /* !! */  = (long)ek.tmu("ubl", tmw(int ), (int)200);
                }
                var4_3 = ek.a;
                if (var6_1) {
                    throw null;
lbl40:
                    // 4 sources

                    return null;
                }
                if (var4_3 || var4_3) ** GOTO lbl40
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ek.be - ek.tmu("ubm", tmr(int ), (int)176)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ek.tmu("ubn", tmw(int ), (int)201)) break;
                    v5 /* !! */  = (long)ek.tmu("ubo", tmw(int ), (int)202);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = ek.be - ek.tmu("ubp", tmr(int ), (int)177)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ek.tmu("ubq", tmw(int ), (int)203)) break;
                    v6 /* !! */  = (long)ek.tmu("ubr", tmw(int ), (int)204);
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = ek.be - ek.tmu("ubs", tmr(int ), (int)178)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ek.tmu("ubt", tmw(int ), (int)205)) break;
                    v7 /* !! */  = (long)ek.tmu("ubu", tmw(int ), (int)206);
                }
                v8 = this.attackDistance();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_4 = ek.be - ek.tmu("ubv", tmr(int ), (int)179)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ek.tmu("ubw", tmw(int ), (int)207)) break;
                    v9 /* !! */  = (long)ek.tmu("ubx", tmw(int ), (int)208);
                }
                v10 /* !! */  = ek.be;
                if (true) ** GOTO lbl68
                block90: while (true) {
                    v10 /* !! */  = (long)(v11 - ek.tmu("uby", tmr(int ), (int)180));
lbl68:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1995599586: {
                            v11 = ek.tmu("ubz", tmr(int ), (int)181);
                            continue block90;
                        }
                        case -1610963620: {
                            break block90;
                        }
                        case -1554558178: {
                            v11 = ek.tmu("uca", tmr(int ), (int)182);
                            continue block90;
                        }
                        case 30544316: {
                            v11 = ek.tmu("ucb", tmr(int ), (int)183);
                            continue block90;
                        }
                    }
                    break;
                }
                v12 = ot.INSTANCE.getRotation();
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_5 = ek.be - ek.tmu("ucc", tmr(int ), (int)184)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == ek.tmu("ucd", tmw(int ), (int)209)) break;
                    v13 /* !! */  = (long)ek.tmu("uce", tmw(int ), (int)210);
                }
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_6 = ek.be - ek.tmu("ucf", tmr(int ), (int)185)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == ek.tmu("ucg", tmw(int ), (int)211)) break;
                    v14 /* !! */  = (long)ek.tmu("uch", tmw(int ), (int)212);
                }
                v15 = new class_243(0.0, 0.0, 0.0);
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_7 = ek.be - ek.tmu("uci", tmr(int ), (int)186)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == ek.tmu("ucj", tmw(int ), (int)213)) break;
                    v16 /* !! */  = (long)ek.tmu("uck", tmw(int ), (int)214);
                }
                v17 /* !! */  = ek.be;
                if (true) ** GOTO lbl101
                block94: while (true) {
                    v17 /* !! */  = (long)(v18 - ek.tmu("ucl", tmr(int ), (int)187));
lbl101:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1855437155: {
                            v18 = ek.tmu("ucm", tmr(int ), (int)188);
                            continue block94;
                        }
                        case -1610963620: {
                            break block94;
                        }
                        case -1508388454: {
                            v18 = ek.tmu("ucn", tmr(int ), (int)189);
                            continue block94;
                        }
                    }
                    break;
                }
                v19 = this.options.isSelected("\u0411\u0438\u0442\u044c \u0447\u0435\u0440\u0435\u0437 \u0441\u0442\u0435\u043d\u044b");
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_8 = ek.be - ek.tmu("uco", tmr(int ), (int)190)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == ek.tmu("ucp", tmw(int ), (int)215)) break;
                    v20 /* !! */  = (long)ek.tmu("ucq", tmw(int ), (int)216);
                }
                var1_4 = this.pointFinder.computeVector(this.target, v8, v12, v15, v19);
                if (var4_3 || var4_3) ** GOTO lbl40
                v21 /* !! */  = ek.be;
                if (true) ** GOTO lbl122
                block96: while (true) {
                    v21 /* !! */  = (long)(v22 - ek.tmu("ucr", tmr(int ), (int)191));
lbl122:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -2056250639: {
                            v22 = ek.tmu("ucs", tmr(int ), (int)192);
                            continue block96;
                        }
                        case -1610963620: {
                            break block96;
                        }
                        case -1434306908: {
                            v22 = ek.tmu("uct", tmr(int ), (int)193);
                            continue block96;
                        }
                        case 1302768602: {
                            v22 = ek.tmu("ucu", tmr(int ), (int)194);
                            continue block96;
                        }
                    }
                    break;
                }
                v23 = (class_243)var1_4.method_15442();
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_9 = ek.be - ek.tmu("ucv", tmr(int ), (int)195)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == ek.tmu("ucw", tmw(int ), (int)217)) break;
                    v24 /* !! */  = (long)ek.tmu("ucx", tmw(int ), (int)218);
                }
                v25 /* !! */  = ek.be;
                if (true) ** GOTO lbl144
                block98: while (true) {
                    v25 /* !! */  = (long)(v26 - ek.tmu("ucy", tmr(int ), (int)196));
lbl144:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -1844585160: {
                            v26 = ek.tmu("ucz", tmr(int ), (int)197);
                            continue block98;
                        }
                        case -1808832033: {
                            v26 = ek.tmu("uda", tmr(int ), (int)198);
                            continue block98;
                        }
                        case -1610963620: {
                            break block98;
                        }
                        case 198199517: {
                            v26 = ek.tmu("udb", tmr(int ), (int)199);
                            continue block98;
                        }
                    }
                    break;
                }
                v27 = ek.mc.field_1724;
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_10 = ek.be - ek.tmu("udc", tmr(int ), (int)200)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == ek.tmu("udd", tmw(int ), (int)219)) break;
                    v28 /* !! */  = (long)ek.tmu("ude", tmw(int ), (int)220);
                }
                v29 /* !! */  = ek.be;
                if (true) ** GOTO lbl166
                block100: while (true) {
                    v29 /* !! */  = (long)(ek.tmu("udg", tmr(int ), (int)202) - ek.tmu("udf", tmr(int ), (int)201));
lbl166:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -1610963620: {
                            break block100;
                        }
                        case 782889155: {
                            continue block100;
                        }
                    }
                    break;
                }
                v30 = Objects.requireNonNull(v27).method_33571();
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_11 = ek.be - ek.tmu("udh", tmr(int ), (int)203)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == ek.tmu("udi", tmw(int ), (int)221)) break;
                    v31 /* !! */  = (long)ek.tmu("udj", tmw(int ), (int)222);
                }
                v32 = v23.method_1020(v30);
                v33 /* !! */  = ek.be;
                if (true) ** GOTO lbl182
                block102: while (true) {
                    v33 /* !! */  = (long)(v34 - ek.tmu("udk", tmr(int ), (int)204));
lbl182:
                    // 2 sources

                    switch ((int)v33 /* !! */ ) {
                        case -1610963620: {
                            break block102;
                        }
                        case 116363738: {
                            v34 = ek.tmu("udl", tmr(int ), (int)205);
                            continue block102;
                        }
                        case 1176063807: {
                            v34 = ek.tmu("udm", tmr(int ), (int)206);
                            continue block102;
                        }
                    }
                    break;
                }
                var2_5 = ow.fromVec3d(v32);
                if (var4_3 || var4_3) ** GOTO lbl40
                v35 /* !! */  = ek.be;
                if (true) ** GOTO lbl197
                block103: while (true) {
                    v35 /* !! */  = (long)(v36 - ek.tmu("udn", tmr(int ), (int)207));
lbl197:
                    // 2 sources

                    switch ((int)v35 /* !! */ ) {
                        case -1610963620: {
                            break block103;
                        }
                        case 1339927619: {
                            v36 = ek.tmu("udo", tmr(int ), (int)208);
                            continue block103;
                        }
                        case 2141688021: {
                            v36 = ek.tmu("udp", tmr(int ), (int)209);
                            continue block103;
                        }
                    }
                    break;
                }
                var3_6 = (class_238)var1_4.method_15441();
                if (var4_3 || var4_3) ** continue;
                while (true) {
                    if ((v37 /* !! */  = (cfr_temp_12 = ek.be - ek.tmu("udq", tmr(int ), (int)210)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v37 /* !! */  == ek.tmu("udr", tmw(int ), (int)223)) break;
                    v37 /* !! */  = (long)ek.tmu("uds", tmw(int ), (int)224);
                }
                v38 /* !! */  = ek.be;
                if (true) ** GOTO lbl217
                block105: while (true) {
                    v38 /* !! */  = (long)(v39 - ek.tmu("udt", tmr(int ), (int)211));
lbl217:
                    // 2 sources

                    switch ((int)v38 /* !! */ ) {
                        case -1610963620: {
                            break block105;
                        }
                        case -1326118914: {
                            v39 = ek.tmu("udu", tmr(int ), (int)212);
                            continue block105;
                        }
                        case 476206117: {
                            v39 = ek.tmu("udv", tmr(int ), (int)213);
                            continue block105;
                        }
                        case 2098156195: {
                            v39 = ek.tmu("udw", tmr(int ), (int)214);
                            continue block105;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v40 /* !! */  = (cfr_temp_13 = ek.be - ek.tmu("udx", tmr(int ), (int)215)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v40 /* !! */  == ek.tmu("udy", tmw(int ), (int)225)) break;
                    v40 /* !! */  = (long)ek.tmu("udz", tmw(int ), (int)226);
                }
                v41 = this.attackDistance();
                v42 /* !! */  = ek.be;
                if (true) ** GOTO lbl239
                block107: while (true) {
                    v42 /* !! */  = (long)(ek.tmu("ueb", tmr(int ), (int)217) - ek.tmu("uea", tmr(int ), (int)216));
lbl239:
                    // 2 sources

                    switch ((int)v42 /* !! */ ) {
                        case -1610963620: {
                            break block107;
                        }
                        case -739220022: {
                            continue block107;
                        }
                    }
                    break;
                }
                v43 /* !! */  = ek.be;
                if (true) ** GOTO lbl248
                block108: while (true) {
                    v43 /* !! */  = (long)(ek.tmu("ued", tmr(int ), (int)219) - ek.tmu("uec", tmr(int ), (int)218));
lbl248:
                    // 2 sources

                    switch ((int)v43 /* !! */ ) {
                        case -1681926224: {
                            continue block108;
                        }
                        case -1610963620: {
                            break block108;
                        }
                    }
                    break;
                }
                v44 = this.options.getSelected();
                v45 /* !! */  = ek.be;
                if (true) ** GOTO lbl258
                block109: while (true) {
                    v45 /* !! */  = (long)(v46 - ek.tmu("uee", tmr(int ), (int)220));
lbl258:
                    // 2 sources

                    switch ((int)v45 /* !! */ ) {
                        case -1610963620: {
                            break block109;
                        }
                        case -562522833: {
                            v46 = ek.tmu("uef", tmr(int ), (int)221);
                            continue block109;
                        }
                        case 1857291908: {
                            v46 = ek.tmu("ueg", tmr(int ), (int)222);
                            continue block109;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v47 /* !! */  = (cfr_temp_14 = ek.be - ek.tmu("ueh", tmr(int ), (int)223)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v47 /* !! */  == ek.tmu("uei", tmw(int ), (int)227)) break;
                    v47 /* !! */  = (long)ek.tmu("uej", tmw(int ), (int)228);
                }
                v48 = this.onlyCriticals.isValue();
                v49 /* !! */  = ek.be;
                if (true) ** GOTO lbl277
                block111: while (true) {
                    v49 /* !! */  = (long)(ek.tmu("uel", tmr(int ), (int)225) - ek.tmu("uek", tmr(int ), (int)224));
lbl277:
                    // 2 sources

                    switch ((int)v49 /* !! */ ) {
                        case -1610963620: {
                            break block111;
                        }
                        case 2108009949: {
                            continue block111;
                        }
                    }
                    break;
                }
                return new hv$AttackPerpetratorConfigurable(this.target, var2_5, v41, v44, var3_6, v48);
            }
            case 0: {
                var5_2 /* !! */  = (int)ek.tmu("uem", tmw(int ), (int)229);
                if (!var6_1) break;
                throw null;
            }
            case 1: {
                do {
                    var5_2 /* !! */  = (int)ek.tmu("uen", tmw(int ), (int)230);
                } while (!var6_1);
                throw null;
            }
            case 2: {
                var5_2 /* !! */  = (int)ek.tmu("ueo", tmw(int ), (int)231);
                if (!var6_1) break;
                throw null;
            }
lbl296:
            // 2 sources

            case 3: {
                var5_2 /* !! */  = (int)ek.tmu("uep", tmw(int ), (int)232);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl320
            }
            case 4: {
                do {
                    var5_2 /* !! */  = (int)ek.tmu("ueq", tmw(int ), (int)233);
                } while (!var6_1);
                throw null;
            }
            case 5: {
                do {
                    var5_2 /* !! */  = (int)ek.tmu("uer", tmw(int ), (int)234);
                } while (!var6_1);
                throw null;
            }
            case 6: {
                var5_2 /* !! */  = (int)ek.tmu("ues", tmw(int ), (int)235);
                if (var6_1) {
                    throw null;
                }
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)ek.tmu("uet", tmw(int ), (int)236);
                    if (!var6_1) ** GOTO lbl296
                    throw null;
                }
            }
lbl320:
            // 2 sources

            case 8: {
                do {
                    var5_2 /* !! */  = (int)ek.tmu("ueu", tmw(int ), (int)237);
                } while (!var6_1);
                throw null;
            }
            case 9: 
        }
        var5_2 /* !! */  = (int)ek.tmu("uev", tmw(int ), (int)238);
        ** while (!var6_1)
lbl328:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void uke() {
        ek.tmt[100] = 4831823987409951861L;
        ek.tmt[101] = 3546792594735458271L;
        ek.tmt[102] = -4793703453563514732L;
        ek.tmt[103] = -684196666100609778L;
        ek.tmt[104] = 6550447088157342320L;
        ek.tmt[105] = -2228304971213196190L;
        ek.tmt[106] = 2867103340455241269L;
        ek.tmt[107] = 4716354773762897668L;
        ek.tmt[108] = 605561239759942998L;
        ek.tmt[109] = -6592677784736465097L;
        ek.tmt[110] = -9179132451326606211L;
        ek.tmt[111] = 6457599194154506481L;
        ek.tmt[112] = 5917049592606984106L;
        ek.tmt[113] = -6487737151226925742L;
        ek.tmt[114] = 3594391671590540651L;
        ek.tmt[115] = -6734315493424904887L;
        ek.tmt[116] = 5550453222616597393L;
        ek.tmt[117] = 7862291621835528935L;
        ek.tmt[118] = -5006963644088445006L;
        ek.tmt[119] = 4856495120609593941L;
        ek.tmt[120] = -218533535540855369L;
        ek.tmt[121] = -3296068486075399464L;
        ek.tmt[122] = -3931953623607086076L;
        ek.tmt[123] = -6152529918850004484L;
        ek.tmt[124] = 9062487196257733391L;
        ek.tmt[125] = 2422488035211511815L;
        ek.tmt[126] = -4282793568553680611L;
        ek.tmt[127] = -3415682623369134762L;
        ek.tmt[128] = 2684828020277545224L;
        ek.tmt[129] = 6531813492297925006L;
        ek.tmt[130] = 5358735304308674637L;
        ek.tmt[131] = -7412884336172447103L;
        ek.tmt[132] = -6290749243960485250L;
        ek.tmt[133] = -7738281283593821844L;
        ek.tmt[134] = -7827670309004901139L;
        ek.tmt[135] = -1447201903240206784L;
        ek.tmt[136] = 590632893017821945L;
        ek.tmt[137] = 6790288308331467401L;
        ek.tmt[138] = 3859552758730823977L;
        ek.tmt[139] = -6105263472763850782L;
        ek.tmt[140] = -7634211999286224183L;
        ek.tmt[141] = 7726555401685664171L;
        ek.tmt[142] = 716323103900527800L;
        ek.tmt[143] = -7996077743159037568L;
        ek.tmt[144] = -6411301084450028889L;
        ek.tmt[145] = -1558572815464768700L;
        ek.tmt[146] = -8608303200134754661L;
        ek.tmt[147] = 2611989467110217684L;
        ek.tmt[148] = 1322279993157830533L;
        ek.tmt[149] = 7419460034514603770L;
        ek.tmt[150] = -2338687287073077919L;
        ek.tmt[151] = 4735082171162547819L;
        ek.tmt[152] = 7475787738947184513L;
        ek.tmt[153] = -7668190631479604339L;
        ek.tmt[154] = -5626488621562222213L;
        ek.tmt[155] = -7999834081275098754L;
        ek.tmt[156] = 2805813940907216122L;
        ek.tmt[157] = -7731402137934502232L;
        ek.tmt[158] = 4354687432178632419L;
        ek.tmt[159] = 2716823154623773104L;
        ek.tmt[160] = -2638601533127483794L;
        ek.tmt[161] = 1456851133687255535L;
        ek.tmt[162] = 7868860062569548783L;
        ek.tmt[163] = -9139624610409155632L;
        ek.tmt[164] = -2647644803168717582L;
        ek.tmt[165] = -2452615723451477371L;
        ek.tmt[166] = -3933779369331534536L;
        ek.tmt[167] = -2177512579473615041L;
        ek.tmt[168] = 1191277017464888119L;
        ek.tmt[169] = -7800378147096856176L;
        ek.tmt[170] = -3383760298422808830L;
        ek.tmt[171] = -6796679395963546664L;
        ek.tmt[172] = -7929186440983174329L;
        ek.tmt[173] = 7099002253609385439L;
        ek.tmt[174] = 493363838779955806L;
        ek.tmt[175] = -491263421385793831L;
        ek.tmt[176] = 5682556900949461189L;
        ek.tmt[177] = 5717408576247681505L;
        ek.tmt[178] = -7065314676881010336L;
        ek.tmt[179] = 5319078946226844506L;
        ek.tmt[180] = 4303961768648022020L;
        ek.tmt[181] = -3508648913817217770L;
        ek.tmt[182] = 4085459059408171552L;
        ek.tmt[183] = 346651037459554897L;
        ek.tmt[184] = -304654929637975882L;
        ek.tmt[185] = -941608847988637692L;
        ek.tmt[186] = -660235474088342094L;
        ek.tmt[187] = 572736913113627722L;
        ek.tmt[188] = 9182697334735062747L;
        ek.tmt[189] = -2504757216121519642L;
        ek.tmt[190] = -7005753211168800097L;
        ek.tmt[191] = 2262093911371554723L;
        ek.tmt[192] = 5067234828663108468L;
        ek.tmt[193] = -6430919308424645486L;
        ek.tmt[194] = -4137295212048838830L;
        ek.tmt[195] = -1043797589274769672L;
        ek.tmt[196] = 4382596299614556185L;
        ek.tmt[197] = 1652552173474145890L;
        ek.tmt[198] = -9028459086799979779L;
        ek.tmt[199] = 1045806482316297775L;
    }

    static {
        tmx = new int[301];
        tmy = new int[301];
        ek.ujs();
        ek.ujt();
        ek.uju();
        ek.tmx[300] = 884171262;
        ek.ujw();
        ek.ujx();
        ek.ujy();
        ek.tmy[300] = 884171262;
        tms = new long[290];
        tmt = new long[290];
        ek.uka();
        ek.ukb();
        ek.ukc();
        ek.ukd();
        ek.uke();
        ek.ukf();
    }

    private static /* synthetic */ long tmr(int n2) {
        return tms[n2] ^ tmt[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ke getTargetType() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ek.be - ek.tmu("uia", tmr(int ), (int)270)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ek.tmu("uib", tmw(int ), (int)277)) break;
            v0 /* !! */  = (long)ek.tmu("uic", tmw(int ), (int)278);
        }
        var3_1 = ek.c;
        v1 /* !! */  = ek.be;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(ek.tmu("uie", tmr(int ), (int)272) - ek.tmu("uid", tmr(int ), (int)271));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1610963620: {
                    break block19;
                }
                case -39052120: {
                    continue block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = ek.b;
        v2 /* !! */  = ek.be;
        if (true) ** GOTO lbl22
        block20: while (true) {
            v2 /* !! */  = (long)(ek.tmu("uig", tmr(int ), (int)274) - ek.tmu("uif", tmr(int ), (int)273));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1610963620: {
                    break block20;
                }
                case -884635901: {
                    continue block20;
                }
            }
            break;
        }
        var1_3 = ek.a;
        if (var3_1) {
            throw null;
lbl30:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl30
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = ek.be;
                if (true) ** GOTO lbl41
                block22: while (true) {
                    v3 /* !! */  = (long)(ek.tmu("uii", tmr(int ), (int)276) - ek.tmu("uih", tmr(int ), (int)275));
lbl41:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1610963620: {
                            break block22;
                        }
                        case -1199984039: {
                            continue block22;
                        }
                    }
                    break;
                }
                return this.targetType;
            }
lbl47:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)ek.tmu("uij", tmw(int ), (int)279);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)ek.tmu("uik", tmw(int ), (int)280);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ek.tmu("uil", tmw(int ), (int)281);
                    if (!var3_1) ** GOTO lbl47
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ek.tmu("uim", tmw(int ), (int)282);
        ** while (!var3_1)
lbl65:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_1309 getLastTarget() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ek.be - ek.tmu("ugt", tmr(int ), (int)253)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ek.tmu("ugu", tmw(int ), (int)261)) break;
            v0 /* !! */  = (long)ek.tmu("ugv", tmw(int ), (int)262);
        }
        var3_1 = ek.c;
        v1 /* !! */  = ek.be;
        if (true) ** GOTO lbl12
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - ek.tmu("ugw", tmr(int ), (int)254));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1667476343: {
                    v2 = ek.tmu("ugx", tmr(int ), (int)255);
                    continue block18;
                }
                case -1610963620: {
                    break block18;
                }
                case -1165436693: {
                    v2 = ek.tmu("ugy", tmr(int ), (int)256);
                    continue block18;
                }
                case -658282140: {
                    v2 = ek.tmu("ugz", tmr(int ), (int)257);
                    continue block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = ek.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = ek.be - ek.tmu("uha", tmr(int ), (int)258)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ek.tmu("uhb", tmw(int ), (int)263)) break;
                    v3 /* !! */  = (long)ek.tmu("uhc", tmw(int ), (int)264);
                }
                var1_3 = ek.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = ek.be;
                if (true) ** GOTO lbl44
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - ek.tmu("uhd", tmr(int ), (int)259));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1952702590: {
                            v5 = ek.tmu("uhe", tmr(int ), (int)260);
                            continue block21;
                        }
                        case -1610963620: {
                            break block21;
                        }
                        case 735387421: {
                            v5 = ek.tmu("uhf", tmr(int ), (int)261);
                            continue block21;
                        }
                    }
                    break;
                }
                return this.lastTarget;
            }
            case 0: {
                var2_2 /* !! */  = (int)ek.tmu("uhg", tmw(int ), (int)265);
                if (var3_1) {
                    throw null;
                }
            }
lbl58:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)ek.tmu("uhh", tmw(int ), (int)266);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ek.tmu("uhi", tmw(int ), (int)267);
                    if (!var3_1) ** GOTO lbl58
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ek.tmu("uhj", tmw(int ), (int)268);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ek.be - ek.tmu("tpt", tmr(int ), (int)24)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ek.tmu("tpu", tmw(int ), (int)48)) break;
            v0 /* !! */  = (long)ek.tmu("tpv", tmw(int ), (int)49);
        }
        var3_1 = ek.c;
        v1 /* !! */  = ek.be;
        if (true) ** GOTO lbl11
        block27: while (true) {
            v1 /* !! */  = (long)(v2 - ek.tmu("tpw", tmr(int ), (int)25));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1788415684: {
                    v2 = ek.tmu("tpx", tmr(int ), (int)26);
                    continue block27;
                }
                case -1610963620: {
                    break block27;
                }
                case -735965927: {
                    v2 = ek.tmu("tpy", tmr(int ), (int)27);
                    continue block27;
                }
                case 1067327734: {
                    v2 = ek.tmu("tpz", tmr(int ), (int)28);
                    continue block27;
                }
            }
            break;
        }
        var2_2 /* !! */  = ek.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ek.be - ek.tmu("tqa", tmr(int ), (int)29)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ek.tmu("tqb", tmw(int ), (int)50)) break;
            v3 /* !! */  = (long)ek.tmu("tqc", tmw(int ), (int)51);
        }
        var1_3 = ek.a;
        if (var3_1) {
            throw null;
lbl32:
            // 5 sources

            return;
        }
        if (var1_3) ** GOTO lbl32
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl32
                v4 /* !! */  = ek.be;
                if (true) ** GOTO lbl43
                block30: while (true) {
                    v4 /* !! */  = (long)(ek.tmu("tqe", tmr(int ), (int)31) - ek.tmu("tqd", tmr(int ), (int)30));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1630187553: {
                            continue block30;
                        }
                        case -1610963620: {
                            break block30;
                        }
                    }
                    break;
                }
                v5 /* !! */  = ek.be;
                if (true) ** GOTO lbl52
                block31: while (true) {
                    v5 /* !! */  = (long)(ek.tmu("tqg", tmr(int ), (int)33) - ek.tmu("tqf", tmr(int ), (int)32));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1610963620: {
                            break block31;
                        }
                        case -1256517793: {
                            continue block31;
                        }
                    }
                    break;
                }
                this.targetSelector.releaseTarget();
                if (var1_3 || var1_3) ** GOTO lbl32
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = ek.be - ek.tmu("tqh", tmr(int ), (int)34)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ek.tmu("tqi", tmw(int ), (int)52)) break;
                    v6 /* !! */  = (long)ek.tmu("tqj", tmw(int ), (int)53);
                }
                this.target = null;
                if (var1_3 || var1_3) ** GOTO lbl32
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = ek.be - ek.tmu("tqk", tmr(int ), (int)35)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ek.tmu("tql", tmw(int ), (int)54)) break;
                    v7 /* !! */  = (long)ek.tmu("tqm", tmw(int ), (int)55);
                }
                super.deactivate();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl75:
            // 4 sources

            case 0: {
                var2_2 /* !! */  = (int)ek.tmu("tqn", tmw(int ), (int)56);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl103
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)ek.tmu("tqo", tmw(int ), (int)57);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ek.tmu("tqp", tmw(int ), (int)58);
                if (!var3_1) break;
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ek.tmu("tqq", tmw(int ), (int)59);
                    if (!var3_1) ** GOTO lbl75
                    throw null;
                }
            }
lbl94:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ek.tmu("tqr", tmw(int ), (int)60);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 5: {
                var2_2 /* !! */  = (int)ek.tmu("tqs", tmw(int ), (int)61);
                if (!var3_1) ** GOTO lbl94
                throw null;
            }
lbl103:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)ek.tmu("tqt", tmw(int ), (int)62);
                if (!var3_1) ** GOTO lbl75
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)ek.tmu("tqu", tmw(int ), (int)63);
                if (!var3_1) ** GOTO lbl75
                throw null;
            }
lbl111:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)ek.tmu("tqv", tmw(int ), (int)64);
                if (!var3_1) break;
                throw null;
            }
            case 9: 
        }
        var2_2 /* !! */  = (int)ek.tmu("tqw", tmw(int ), (int)65);
        ** while (!var3_1)
lbl118:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ujt() {
        ek.tmx[100] = 320237856;
        ek.tmx[101] = 1654495440;
        ek.tmx[102] = 1341478289;
        ek.tmx[103] = 1458385676;
        ek.tmx[104] = 866590072;
        ek.tmx[105] = -1368414028;
        ek.tmx[106] = -682412334;
        ek.tmx[107] = -1705118444;
        ek.tmx[108] = 123812724;
        ek.tmx[109] = -1476492649;
        ek.tmx[110] = -1477909797;
        ek.tmx[111] = 763940515;
        ek.tmx[112] = 1726474700;
        ek.tmx[113] = -239609409;
        ek.tmx[114] = -1332231626;
        ek.tmx[115] = -229979626;
        ek.tmx[116] = 626410266;
        ek.tmx[117] = -1487892440;
        ek.tmx[118] = 511810286;
        ek.tmx[119] = -840789865;
        ek.tmx[120] = 468913262;
        ek.tmx[121] = -2093966358;
        ek.tmx[122] = 1902011676;
        ek.tmx[123] = 391736236;
        ek.tmx[124] = -1515339294;
        ek.tmx[125] = -391381229;
        ek.tmx[126] = -1632054031;
        ek.tmx[127] = -1709557192;
        ek.tmx[128] = -1607143794;
        ek.tmx[129] = -1687818527;
        ek.tmx[130] = -1803955878;
        ek.tmx[131] = 115309628;
        ek.tmx[132] = 706421810;
        ek.tmx[133] = -1647247133;
        ek.tmx[134] = -451168858;
        ek.tmx[135] = -515925485;
        ek.tmx[136] = -901567502;
        ek.tmx[137] = -1255624007;
        ek.tmx[138] = 1848114468;
        ek.tmx[139] = -229467309;
        ek.tmx[140] = -1117156190;
        ek.tmx[141] = 1146943982;
        ek.tmx[142] = -67217648;
        ek.tmx[143] = -1131794653;
        ek.tmx[144] = 33036676;
        ek.tmx[145] = 376493135;
        ek.tmx[146] = -1607970252;
        ek.tmx[147] = 1769285871;
        ek.tmx[148] = -1474614192;
        ek.tmx[149] = 670548906;
        ek.tmx[150] = 148995625;
        ek.tmx[151] = 206689907;
        ek.tmx[152] = -1001998976;
        ek.tmx[153] = -367222908;
        ek.tmx[154] = -1693420932;
        ek.tmx[155] = 1348286061;
        ek.tmx[156] = 1104699567;
        ek.tmx[157] = -685201853;
        ek.tmx[158] = 604671660;
        ek.tmx[159] = -1833553168;
        ek.tmx[160] = 1655580966;
        ek.tmx[161] = -1163428914;
        ek.tmx[162] = 1173739976;
        ek.tmx[163] = 695962676;
        ek.tmx[164] = 1325004897;
        ek.tmx[165] = -500726424;
        ek.tmx[166] = 875759628;
        ek.tmx[167] = 682072309;
        ek.tmx[168] = -2099232677;
        ek.tmx[169] = 2109775569;
        ek.tmx[170] = 1191821994;
        ek.tmx[171] = -1933095824;
        ek.tmx[172] = 1237254748;
        ek.tmx[173] = 1706732317;
        ek.tmx[174] = 294932182;
        ek.tmx[175] = 1153752872;
        ek.tmx[176] = -1519942676;
        ek.tmx[177] = -451778848;
        ek.tmx[178] = -909549441;
        ek.tmx[179] = -1439412530;
        ek.tmx[180] = -1428900262;
        ek.tmx[181] = 1549791413;
        ek.tmx[182] = 1146447193;
        ek.tmx[183] = -1191300144;
        ek.tmx[184] = -88699224;
        ek.tmx[185] = 1239167190;
        ek.tmx[186] = 56921513;
        ek.tmx[187] = 1663053840;
        ek.tmx[188] = 1511978885;
        ek.tmx[189] = -277943292;
        ek.tmx[190] = -1605678203;
        ek.tmx[191] = -1338668835;
        ek.tmx[192] = 1849928558;
        ek.tmx[193] = -1385401416;
        ek.tmx[194] = 1207768615;
        ek.tmx[195] = 1803603874;
        ek.tmx[196] = 1524910189;
        ek.tmx[197] = 1329244253;
        ek.tmx[198] = 661547073;
        ek.tmx[199] = -1041907497;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float attackDistance() {
        v0 /* !! */  = ek.be;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(ek.tmu("tpb", tmr(int ), (int)17) - ek.tmu("tpa", tmr(int ), (int)16));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1771283039: {
                    continue block15;
                }
                case -1610963620: {
                    break block15;
                }
            }
            break;
        }
        var3_1 = ek.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ek.be - ek.tmu("tpc", tmr(int ), (int)18)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ek.tmu("tpd", tmw(int ), (int)37)) break;
            v1 /* !! */  = (long)ek.tmu("tpe", tmw(int ), (int)38);
        }
        var2_2 /* !! */  = ek.b;
        v2 /* !! */  = ek.be;
        if (true) ** GOTO lbl22
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - ek.tmu("tpf", tmr(int ), (int)19));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1610963620: {
                    break block17;
                }
                case -1268900585: {
                    v3 = ek.tmu("tpg", tmr(int ), (int)20);
                    continue block17;
                }
                case -416668791: {
                    v3 = ek.tmu("tph", tmr(int ), (int)21);
                    continue block17;
                }
            }
            break;
        }
        var1_3 = ek.a;
        if (!var3_1) ** GOTO lbl38
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (float)ek.tmu("tpi", tnp(int ), (int)39);
                }
lbl38:
                // 1 sources

                if (var1_3 || var1_3) continue block18;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = ek.be - ek.tmu("tpj", tmr(int ), (int)22)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ek.tmu("tpk", tmw(int ), (int)40)) break;
                    v4 /* !! */  = (long)ek.tmu("tpl", tmw(int ), (int)41);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = ek.be - ek.tmu("tpm", tmr(int ), (int)23)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ek.tmu("tpn", tmw(int ), (int)42)) break;
                    v5 /* !! */  = (long)ek.tmu("tpo", tmw(int ), (int)43);
                }
                return this.attackRange.getValue();
                case 0: {
                    var2_2 /* !! */  = (int)ek.tmu("tpp", tmw(int ), (int)44);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl62
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)ek.tmu("tpq", tmw(int ), (int)45);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
lbl62:
                // 2 sources

                case 2: {
                    do {
                        var2_2 /* !! */  = (int)ek.tmu("tpr", tmw(int ), (int)46);
                    } while (!var3_1);
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)ek.tmu("tps", tmw(int ), (int)47);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ek getInstance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ek.be - ek.tmu("tmv", tmr(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ek.tmu("tmz", tmw(int ), (int)0)) break;
            v0 /* !! */  = (long)ek.tmu("tna", tmw(int ), (int)1);
        }
        var2 = ek.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ek.be - ek.tmu("tnb", tmr(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ek.tmu("tnc", tmw(int ), (int)2)) break;
            v1 /* !! */  = (long)ek.tmu("tnd", tmw(int ), (int)3);
        }
        var1_1 /* !! */  = ek.b;
        v2 /* !! */  = ek.be;
        if (true) ** GOTO lbl19
        block14: while (true) {
            v2 /* !! */  = (long)(v3 - ek.tmu("tne", tmr(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1610963620: {
                    break block14;
                }
                case -513867008: {
                    v3 = ek.tmu("tnf", tmr(int ), (int)3);
                    continue block14;
                }
                case 142450724: {
                    v3 = ek.tmu("tng", tmr(int ), (int)4);
                    continue block14;
                }
                case 1681253002: {
                    v3 = ek.tmu("tnh", tmr(int ), (int)5);
                    continue block14;
                }
            }
            break;
        }
        var0_2 = ek.a;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ek.be - ek.tmu("tni", tmr(int ), (int)6)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ek.tmu("tnj", tmw(int ), (int)4)) break;
                    v4 /* !! */  = (long)ek.tmu("tnk", tmw(int ), (int)5);
                }
                return nj.get(ek.class);
            }
            case 0: {
                var1_1 /* !! */  = (int)ek.tmu("tnl", tmw(int ), (int)6);
                if (var2) {
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)ek.tmu("tnm", tmw(int ), (int)7);
                if (!var2) break;
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)ek.tmu("tnn", tmw(int ), (int)8);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)ek.tmu("tno", tmw(int ), (int)9);
        } while (!var2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ek() {
        var2_1 /* !! */  = ek.b;
        var1_2 = ek.a;
        super("TriggerBot", "\u0410\u0442\u0430\u043a\u0443\u0435\u0442 \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u044c \u043d\u0430 \u043a\u043e\u0442\u043e\u0440\u0443\u044e \u0441\u043c\u043e\u0442\u0440\u0438\u0442 \u0438\u0433\u0440\u043e\u043a", du.LEGIT);
        this.targetSelector = new ik();
        this.pointFinder = new ox();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.attackRange = new kg("\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u0443\u0434\u0430\u0440\u043e\u0432", "\u041c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u0430\u044f \u0434\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u0434\u043b\u044f \u0430\u0442\u0430\u043a\u0438", (float)ek.tmu("tnq", tnp(int ), (int)10)).range((float)ek.tmu("tnr", tnp(int ), (int)11), (float)ek.tmu("tns", tnp(int ), (int)12)).step((float)ek.tmu("tnt", tnp(int ), (int)13));
                this.targetType = new ke("\u0412\u044b\u0431\u043e\u0440 \u0442\u0430\u0440\u0433\u0435\u0442\u043e\u0432", "\u0412\u044b\u0431\u043e\u0440 \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u0438 \u0434\u043b\u044f \u0442\u0430\u0440\u0433\u0435\u0442\u0430").value(new String[]{"\u0418\u0433\u0440\u043e\u043a\u0438", "\u041c\u043e\u0431\u044b"}).selected(new String[]{"\u0418\u0433\u0440\u043e\u043a\u0438"});
                this.options = new ke("\u041e\u0441\u043d\u043e\u0432\u043d\u044b\u0435 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438", "\u041e\u0441\u043d\u043e\u0432\u043d\u044b\u0435 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 \u043c\u043e\u0434\u0443\u043b\u044f").value(new String[]{"\u041d\u0435 \u0431\u0438\u0442\u044c \u043f\u0440\u0438 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0438", "\u0411\u0438\u0442\u044c \u0447\u0435\u0440\u0435\u0437 \u0441\u0442\u0435\u043d\u044b", "\u041e\u0442\u0436\u0438\u043c\u0430\u0442\u044c \u0449\u0438\u0442"}).selected(new String[]{"\u041d\u0435 \u0431\u0438\u0442\u044c \u043f\u0440\u0438 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0438"});
                this.onlyCriticals = new kb("\u0423\u043c\u043d\u044b\u0435 \u043a\u0440\u0438\u0442\u044b", "\u041f\u0440\u0435\u0434\u0441\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u0431\u043b\u0438\u0436\u0430\u0439\u0448\u0438\u0439 \u043f\u043e\u0434\u0445\u043e\u0434\u044f\u0449\u0438\u0439 \u0442\u0438\u043a \u0434\u043b\u044f \u043a\u0440\u0438\u0442\u0438\u0447\u0435\u0441\u043a\u043e\u0433\u043e \u0443\u0434\u0430\u0440\u0430").setValue((boolean)ek.tmu("tnu", tmw(int ), (int)14));
                this.settings(new jx[]{this.attackRange, this.targetType, this.options, this.onlyCriticals});
                return;
            }
lbl15:
            // 5 sources

            case 0: {
                var2_1 /* !! */  = (int)ek.tmu("tnv", tmw(int ), (int)15);
                ** GOTO lbl39
            }
            case 1: {
                var2_1 /* !! */  = (int)ek.tmu("tnw", tmw(int ), (int)16);
                ** GOTO lbl26
            }
lbl21:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)ek.tmu("tnx", tmw(int ), (int)17);
                ** GOTO lbl15
            }
            case 3: {
                var2_1 /* !! */  = (int)ek.tmu("tny", tmw(int ), (int)18);
            }
lbl26:
            // 4 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ek.tmu("tnz", tmw(int ), (int)19);
                    ** GOTO lbl15
                    break;
                }
            }
            case 5: {
                var2_1 /* !! */  = (int)ek.tmu("toa", tmw(int ), (int)20);
                ** GOTO lbl26
            }
            case 6: {
                var2_1 /* !! */  = (int)ek.tmu("tob", tmw(int ), (int)21);
                ** GOTO lbl21
            }
            case 7: {
                var2_1 /* !! */  = (int)ek.tmu("toc", tmw(int ), (int)22);
                ** GOTO lbl15
            }
lbl39:
            // 2 sources

            case 8: {
                var2_1 /* !! */  = (int)ek.tmu("tod", tmw(int ), (int)23);
                ** GOTO lbl15
            }
            case 9: 
        }
        var2_1 /* !! */  = (int)ek.tmu("toe", tmw(int ), (int)24);
        ** while (true)
    }

    public static /* synthetic */ CallSite tmu(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ox getPointFinder() {
        v0 /* !! */  = ek.be;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(ek.tmu("ufp", tmr(int ), (int)239) - ek.tmu("ufo", tmr(int ), (int)238));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1610963620: {
                    break block15;
                }
                case -205815199: {
                    continue block15;
                }
            }
            break;
        }
        var3_1 = ek.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ek.be - ek.tmu("ufq", tmr(int ), (int)240)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ek.tmu("ufr", tmw(int ), (int)245)) break;
            v1 /* !! */  = (long)ek.tmu("ufs", tmw(int ), (int)246);
        }
        var2_2 /* !! */  = ek.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ek.be - ek.tmu("uft", tmr(int ), (int)241)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ek.tmu("ufu", tmw(int ), (int)247)) break;
            v2 /* !! */  = (long)ek.tmu("ufv", tmw(int ), (int)248);
        }
        var1_3 = ek.a;
        if (!var3_1) ** GOTO lbl31
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl31:
                // 1 sources

                if (var1_3 || var1_3) continue block18;
                v3 /* !! */  = ek.be;
                if (true) ** GOTO lbl36
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - ek.tmu("ufw", tmr(int ), (int)242));
lbl36:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1610963620: {
                            break block19;
                        }
                        case -1101140910: {
                            v4 = ek.tmu("ufx", tmr(int ), (int)243);
                            continue block19;
                        }
                        case 1618936565: {
                            v4 = ek.tmu("ufy", tmr(int ), (int)244);
                            continue block19;
                        }
                    }
                    break;
                }
                return this.pointFinder;
                case 0: {
                    do {
                        var2_2 /* !! */  = (int)ek.tmu("ufz", tmw(int ), (int)249);
                    } while (!var3_1);
                    throw null;
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)ek.tmu("uga", tmw(int ), (int)250);
                        if (!var3_1) break block18;
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)ek.tmu("ugb", tmw(int ), (int)251);
                    if (!var3_1) break block18;
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)ek.tmu("ugc", tmw(int ), (int)252);
        ** while (!var3_1)
lbl63:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_1309 getTarget() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ek.be - ek.tmu("ugd", tmr(int ), (int)245)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ek.tmu("uge", tmw(int ), (int)253)) break;
            v0 /* !! */  = (long)ek.tmu("ugf", tmw(int ), (int)254);
        }
        var3_1 = ek.c;
        v1 /* !! */  = ek.be;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - ek.tmu("ugg", tmr(int ), (int)246));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1777103653: {
                    v2 = ek.tmu("ugh", tmr(int ), (int)247);
                    continue block17;
                }
                case -1610963620: {
                    break block17;
                }
                case 325689329: {
                    v2 = ek.tmu("ugi", tmr(int ), (int)248);
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = ek.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ek.be - ek.tmu("ugj", tmr(int ), (int)249)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ek.tmu("ugk", tmw(int ), (int)255)) break;
            v3 /* !! */  = (long)ek.tmu("ugl", tmw(int ), (int)256);
        }
        var1_3 = ek.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = ek.be;
                if (true) ** GOTO lbl42
                block20: while (true) {
                    v4 /* !! */  = (long)(v5 - ek.tmu("ugm", tmr(int ), (int)250));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1610963620: {
                            break block20;
                        }
                        case -220903173: {
                            v5 = ek.tmu("ugn", tmr(int ), (int)251);
                            continue block20;
                        }
                        case 1026645332: {
                            v5 = ek.tmu("ugo", tmr(int ), (int)252);
                            continue block20;
                        }
                    }
                    break;
                }
                return this.target;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ek.tmu("ugp", tmw(int ), (int)257);
                    if (!var3_1) break block5;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ek.tmu("ugq", tmw(int ), (int)258);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)ek.tmu("ugr", tmw(int ), (int)259);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ek.tmu("ugs", tmw(int ), (int)260);
        ** while (!var3_1)
lbl69:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void uka() {
        ek.tms[0] = 5098786302721776132L;
        ek.tms[1] = -7262898756071022108L;
        ek.tms[2] = 360401877790736183L;
        ek.tms[3] = 6886534316827302118L;
        ek.tms[4] = -6569526271008568635L;
        ek.tms[5] = -4176163497447566107L;
        ek.tms[6] = 3166196187664558434L;
        ek.tms[7] = -4260474230656141116L;
        ek.tms[8] = -2211927325912643746L;
        ek.tms[9] = -4979160943568342687L;
        ek.tms[10] = -5992995059958974461L;
        ek.tms[11] = -1593067052137718803L;
        ek.tms[12] = -6331558427543169011L;
        ek.tms[13] = 5353111546183435946L;
        ek.tms[14] = 1542976236938374771L;
        ek.tms[15] = -4886155336976023892L;
        ek.tms[16] = -1810138537214308103L;
        ek.tms[17] = -4360960711901825499L;
        ek.tms[18] = -1134987959665070930L;
        ek.tms[19] = 2108118635180379534L;
        ek.tms[20] = -2143703355051311739L;
        ek.tms[21] = -6724843751554268044L;
        ek.tms[22] = -7273234683774565222L;
        ek.tms[23] = -1357319512276703367L;
        ek.tms[24] = -2668732369485834908L;
        ek.tms[25] = 7575568003754209538L;
        ek.tms[26] = 2994907007617931753L;
        ek.tms[27] = -3795247724980194459L;
        ek.tms[28] = 4954244941743678354L;
        ek.tms[29] = -9196409282862050669L;
        ek.tms[30] = -8777970694983656993L;
        ek.tms[31] = 3755411829407033352L;
        ek.tms[32] = 3903144853111084549L;
        ek.tms[33] = 5572394072919728916L;
        ek.tms[34] = 4161800950170125223L;
        ek.tms[35] = 4738408251658354669L;
        ek.tms[36] = 8419950174689443170L;
        ek.tms[37] = -5781184440782880930L;
        ek.tms[38] = 4189205572142229699L;
        ek.tms[39] = 2794955969920557383L;
        ek.tms[40] = 1947136679491765825L;
        ek.tms[41] = -2645160018142326550L;
        ek.tms[42] = 2160840469018987442L;
        ek.tms[43] = 461442472604226072L;
        ek.tms[44] = 470075800196965222L;
        ek.tms[45] = 244715001150372049L;
        ek.tms[46] = -2412201071537261058L;
        ek.tms[47] = -5045429648613715876L;
        ek.tms[48] = 5287949488713319870L;
        ek.tms[49] = 5553678738013845311L;
        ek.tms[50] = 574796301127889705L;
        ek.tms[51] = 4940737806666369389L;
        ek.tms[52] = 1794203006867879925L;
        ek.tms[53] = -3785250088405473550L;
        ek.tms[54] = -247163458048644705L;
        ek.tms[55] = -4081979466026994875L;
        ek.tms[56] = 7736144197230971914L;
        ek.tms[57] = -6343041917083920545L;
        ek.tms[58] = -1936219326764925610L;
        ek.tms[59] = 2745823415708681812L;
        ek.tms[60] = -1798213724952443996L;
        ek.tms[61] = 8624606505497973349L;
        ek.tms[62] = -1880094046319426146L;
        ek.tms[63] = 3709045804181320754L;
        ek.tms[64] = 1133851237218624125L;
        ek.tms[65] = -2931020504571816341L;
        ek.tms[66] = 8162371225806746586L;
        ek.tms[67] = -419163489832549936L;
        ek.tms[68] = -378212394528810298L;
        ek.tms[69] = -7228612522216878596L;
        ek.tms[70] = 4573807808014676016L;
        ek.tms[71] = 5157019425075950799L;
        ek.tms[72] = -6783861206079958259L;
        ek.tms[73] = -1583797682024029327L;
        ek.tms[74] = -6959111766736110927L;
        ek.tms[75] = 8573543868800831516L;
        ek.tms[76] = -234734631348536429L;
        ek.tms[77] = 3918009340067397956L;
        ek.tms[78] = 8665883312321666293L;
        ek.tms[79] = 9056749682176879436L;
        ek.tms[80] = -4356580345483680907L;
        ek.tms[81] = 6632414117761824807L;
        ek.tms[82] = 8805081766936408687L;
        ek.tms[83] = -7867679846461286533L;
        ek.tms[84] = -6147908749233875806L;
        ek.tms[85] = -335613533152022329L;
        ek.tms[86] = 4378575142232631957L;
        ek.tms[87] = 8199798798710090658L;
        ek.tms[88] = 6102806597346087262L;
        ek.tms[89] = -6929788658545189266L;
        ek.tms[90] = 108243019240743045L;
        ek.tms[91] = -6193797223367807890L;
        ek.tms[92] = 4668644757932081117L;
        ek.tms[93] = 4065086836964094901L;
        ek.tms[94] = 1517642112375061780L;
        ek.tms[95] = -1795103948710509092L;
        ek.tms[96] = 2784838965199717131L;
        ek.tms[97] = -26065978174270893L;
        ek.tms[98] = 5108759087723714306L;
        ek.tms[99] = 6571187621860055414L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float finalDistance() {
        v0 /* !! */  = ek.be;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - ek.tmu("tof", tmr(int ), (int)7));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1796212907: {
                    v1 = ek.tmu("tog", tmr(int ), (int)8);
                    continue block16;
                }
                case -1610963620: {
                    break block16;
                }
                case -1186117224: {
                    v1 = ek.tmu("toh", tmr(int ), (int)9);
                    continue block16;
                }
                case -235483055: {
                    v1 = ek.tmu("toi", tmr(int ), (int)10);
                    continue block16;
                }
            }
            break;
        }
        var3_1 = ek.c;
        v2 /* !! */  = ek.be;
        if (true) ** GOTO lbl22
        block17: while (true) {
            v2 /* !! */  = (long)(ek.tmu("tok", tmr(int ), (int)12) - ek.tmu("toj", tmr(int ), (int)11));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1610963620: {
                    break block17;
                }
                case 127475429: {
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = ek.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ek.be - ek.tmu("tol", tmr(int ), (int)13)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ek.tmu("tom", tmw(int ), (int)25)) break;
            v3 /* !! */  = (long)ek.tmu("ton", tmw(int ), (int)26);
        }
        var1_3 = ek.a;
        if (var3_1) {
            throw null;
lbl37:
            // 1 sources

            return (float)ek.tmu("too", tnp(int ), (int)27);
        }
        ** while (var1_3 || var1_3)
lbl40:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = ek.be - ek.tmu("top", tmr(int ), (int)14)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ek.tmu("toq", tmw(int ), (int)28)) break;
                    v4 /* !! */  = (long)ek.tmu("tor", tmw(int ), (int)29);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = ek.be - ek.tmu("tos", tmr(int ), (int)15)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ek.tmu("tot", tmw(int ), (int)30)) break;
                    v5 /* !! */  = (long)ek.tmu("tou", tmw(int ), (int)31);
                }
                return this.attackRange.getValue() + ek.tmu("tov", tnp(int ), (int)32);
            }
lbl56:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ek.tmu("tow", tmw(int ), (int)33);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl66
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ek.tmu("tox", tmw(int ), (int)34);
                if (var3_1) {
                    throw null;
                }
            }
lbl66:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)ek.tmu("toy", tmw(int ), (int)35);
                if (!var3_1) ** GOTO lbl56
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ek.tmu("toz", tmw(int ), (int)36);
        ** while (!var3_1)
lbl73:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ukc() {
        ek.tms[200] = -7126478754708998177L;
        ek.tms[201] = -9216898030820503239L;
        ek.tms[202] = 3618282558747680235L;
        ek.tms[203] = -3758255499414163302L;
        ek.tms[204] = 7631435099393209422L;
        ek.tms[205] = 6985197495702214990L;
        ek.tms[206] = -7266508452150583654L;
        ek.tms[207] = -9031645839511792244L;
        ek.tms[208] = 1628731869291552638L;
        ek.tms[209] = 298205049836513397L;
        ek.tms[210] = -1659540033547782325L;
        ek.tms[211] = 8294261835808776856L;
        ek.tms[212] = -666601616860666508L;
        ek.tms[213] = 5624680843964054931L;
        ek.tms[214] = 4648274421645685246L;
        ek.tms[215] = -177238827027527478L;
        ek.tms[216] = -4554163892313895552L;
        ek.tms[217] = 379651750128727113L;
        ek.tms[218] = 6629332053084562164L;
        ek.tms[219] = 3737545800987915993L;
        ek.tms[220] = 1068915113055707151L;
        ek.tms[221] = 4935208160814815701L;
        ek.tms[222] = 5567551837031196993L;
        ek.tms[223] = 7167898694095644248L;
        ek.tms[224] = -6882112285296202937L;
        ek.tms[225] = 2044680996463041524L;
        ek.tms[226] = -5247945109747403018L;
        ek.tms[227] = 6472262712608255933L;
        ek.tms[228] = -823000290252928943L;
        ek.tms[229] = 6483356131206240794L;
        ek.tms[230] = 427469301714824136L;
        ek.tms[231] = -785419789441965647L;
        ek.tms[232] = 6000294530193392386L;
        ek.tms[233] = -4547427002190402475L;
        ek.tms[234] = 5817553874658932381L;
        ek.tms[235] = -75217085948912578L;
        ek.tms[236] = -4402717413665065347L;
        ek.tms[237] = 891478141302011973L;
        ek.tms[238] = 837247411618939834L;
        ek.tms[239] = -1935438581318094755L;
        ek.tms[240] = 5298675955782948717L;
        ek.tms[241] = 7528373154699609534L;
        ek.tms[242] = -4528936029014580140L;
        ek.tms[243] = -6219892027013303256L;
        ek.tms[244] = -4689614449360113164L;
        ek.tms[245] = -6849185750138804134L;
        ek.tms[246] = -2556045173952251894L;
        ek.tms[247] = -5874276619193822206L;
        ek.tms[248] = -9118303542140632286L;
        ek.tms[249] = -2677658760345260802L;
        ek.tms[250] = -3054577952823094028L;
        ek.tms[251] = -3543878684204880899L;
        ek.tms[252] = -4671288638648357243L;
        ek.tms[253] = -282572539373435009L;
        ek.tms[254] = -5430431151531435648L;
        ek.tms[255] = 113807895673881879L;
        ek.tms[256] = 974930180150149989L;
        ek.tms[257] = 8280914704823656251L;
        ek.tms[258] = -4249481997649120279L;
        ek.tms[259] = 3791840671940504721L;
        ek.tms[260] = -622468720286151253L;
        ek.tms[261] = -5171452179347380903L;
        ek.tms[262] = -2204186105719710902L;
        ek.tms[263] = 5226018960703896522L;
        ek.tms[264] = 1506733897378160730L;
        ek.tms[265] = -7412345310773101172L;
        ek.tms[266] = -794667642834611837L;
        ek.tms[267] = -3301145410586726744L;
        ek.tms[268] = -7467088399514385293L;
        ek.tms[269] = 5567642633774665463L;
        ek.tms[270] = 82542884705233426L;
        ek.tms[271] = -5536607948236124753L;
        ek.tms[272] = -7372487576061598809L;
        ek.tms[273] = -4866326232495911013L;
        ek.tms[274] = 972513558112928784L;
        ek.tms[275] = -5663015864944201554L;
        ek.tms[276] = 7311740938288263127L;
        ek.tms[277] = -4559100302599345672L;
        ek.tms[278] = -4858803013137169570L;
        ek.tms[279] = 6029268167159329811L;
        ek.tms[280] = -8302952502807720485L;
        ek.tms[281] = 6703514121283816444L;
        ek.tms[282] = 894231590476318409L;
        ek.tms[283] = -6816327809020079801L;
        ek.tms[284] = -5089685024636867161L;
        ek.tms[285] = -1721216169154623747L;
        ek.tms[286] = 1283369811615174841L;
        ek.tms[287] = -2492140179168421880L;
        ek.tms[288] = -4177144151612245318L;
        ek.tms[289] = -8251676437382540035L;
    }

    private static /* synthetic */ void uju() {
        ek.tmx[200] = 1580460069;
        ek.tmx[201] = 1647684720;
        ek.tmx[202] = 327528731;
        ek.tmx[203] = -790638740;
        ek.tmx[204] = 1735022320;
        ek.tmx[205] = 840556970;
        ek.tmx[206] = 430613111;
        ek.tmx[207] = -424278782;
        ek.tmx[208] = 1410983067;
        ek.tmx[209] = 1544166713;
        ek.tmx[210] = -986927525;
        ek.tmx[211] = 569380305;
        ek.tmx[212] = -95200360;
        ek.tmx[213] = -2045682478;
        ek.tmx[214] = -1351268453;
        ek.tmx[215] = 1303560429;
        ek.tmx[216] = 2075983650;
        ek.tmx[217] = -39965484;
        ek.tmx[218] = 1944192459;
        ek.tmx[219] = 1174350206;
        ek.tmx[220] = -2111755714;
        ek.tmx[221] = 1386312027;
        ek.tmx[222] = -1684301246;
        ek.tmx[223] = 1543331050;
        ek.tmx[224] = -1198114320;
        ek.tmx[225] = -1925367985;
        ek.tmx[226] = -656785798;
        ek.tmx[227] = 884402804;
        ek.tmx[228] = -1139263426;
        ek.tmx[229] = -329880740;
        ek.tmx[230] = 920049273;
        ek.tmx[231] = -674194243;
        ek.tmx[232] = -1293502605;
        ek.tmx[233] = -1522989307;
        ek.tmx[234] = 388459142;
        ek.tmx[235] = 586507710;
        ek.tmx[236] = -545904171;
        ek.tmx[237] = -1400831815;
        ek.tmx[238] = -465356170;
        ek.tmx[239] = -333726849;
        ek.tmx[240] = -587023642;
        ek.tmx[241] = -945255213;
        ek.tmx[242] = -1862342696;
        ek.tmx[243] = 1622100774;
        ek.tmx[244] = 871512967;
        ek.tmx[245] = -2009563610;
        ek.tmx[246] = -1061228123;
        ek.tmx[247] = -751438662;
        ek.tmx[248] = 2060685293;
        ek.tmx[249] = 2108113683;
        ek.tmx[250] = -1021534901;
        ek.tmx[251] = 172806333;
        ek.tmx[252] = -743202572;
        ek.tmx[253] = 1801385294;
        ek.tmx[254] = 1783507349;
        ek.tmx[255] = -1256233836;
        ek.tmx[256] = 2029472395;
        ek.tmx[257] = 67914039;
        ek.tmx[258] = 1230083922;
        ek.tmx[259] = 1509492197;
        ek.tmx[260] = -25518107;
        ek.tmx[261] = 1993820261;
        ek.tmx[262] = -259950262;
        ek.tmx[263] = 2096374741;
        ek.tmx[264] = -1886644432;
        ek.tmx[265] = 1799437493;
        ek.tmx[266] = -95895281;
        ek.tmx[267] = 553601098;
        ek.tmx[268] = 1127494871;
        ek.tmx[269] = 800743428;
        ek.tmx[270] = -2011935294;
        ek.tmx[271] = 1196477850;
        ek.tmx[272] = 1655498889;
        ek.tmx[273] = -2093819492;
        ek.tmx[274] = 552025738;
        ek.tmx[275] = 450062810;
        ek.tmx[276] = -1198337183;
        ek.tmx[277] = 870528612;
        ek.tmx[278] = -504198143;
        ek.tmx[279] = -1382649204;
        ek.tmx[280] = -1004142619;
        ek.tmx[281] = 594757713;
        ek.tmx[282] = 655967868;
        ek.tmx[283] = 148459675;
        ek.tmx[284] = -1319427433;
        ek.tmx[285] = -1636793375;
        ek.tmx[286] = -190415556;
        ek.tmx[287] = 963343739;
        ek.tmx[288] = -950529814;
        ek.tmx[289] = -248934326;
        ek.tmx[290] = 1962491502;
        ek.tmx[291] = 1601014709;
        ek.tmx[292] = 611454237;
        ek.tmx[293] = 222813285;
        ek.tmx[294] = -1521877418;
        ek.tmx[295] = 102650952;
        ek.tmx[296] = 1693268107;
        ek.tmx[297] = 1365242673;
        ek.tmx[298] = 586261472;
        ek.tmx[299] = 814539698;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kb getOnlyCriticals() {
        v0 /* !! */  = ek.be;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(ek.tmu("uje", tmr(int ), (int)284) - ek.tmu("ujd", tmr(int ), (int)283));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1610963620: {
                    break block15;
                }
                case 1829364980: {
                    continue block15;
                }
            }
            break;
        }
        var3_1 = ek.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ek.be - ek.tmu("ujf", tmr(int ), (int)285)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ek.tmu("ujg", tmw(int ), (int)293)) break;
            v1 /* !! */  = (long)ek.tmu("ujh", tmw(int ), (int)294);
        }
        var2_2 /* !! */  = ek.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ek.be - ek.tmu("uji", tmr(int ), (int)286)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ek.tmu("ujj", tmw(int ), (int)295)) break;
            v2 /* !! */  = (long)ek.tmu("ujk", tmw(int ), (int)296);
        }
        var1_3 = ek.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = ek.be;
                if (true) ** GOTO lbl38
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - ek.tmu("ujl", tmr(int ), (int)287));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1973716610: {
                            v4 = ek.tmu("ujm", tmr(int ), (int)288);
                            continue block19;
                        }
                        case -1610963620: {
                            break block19;
                        }
                        case 839083630: {
                            v4 = ek.tmu("ujn", tmr(int ), (int)289);
                            continue block19;
                        }
                    }
                    break;
                }
                return this.onlyCriticals;
            }
            case 0: {
                var2_2 /* !! */  = (int)ek.tmu("ujo", tmw(int ), (int)297);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)ek.tmu("ujp", tmw(int ), (int)298);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ek.tmu("ujq", tmw(int ), (int)299);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ek.tmu("ujr", tmw(int ), (int)300);
        ** while (!var3_1)
lbl65:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ujw() {
        ek.tmy[0] = -894642114;
        ek.tmy[1] = -440717569;
        ek.tmy[2] = 295077233;
        ek.tmy[3] = -840436608;
        ek.tmy[4] = 2047167015;
        ek.tmy[5] = 726281610;
        ek.tmy[6] = 1327676715;
        ek.tmy[7] = 741831066;
        ek.tmy[8] = -1874988996;
        ek.tmy[9] = -1580482211;
        ek.tmy[10] = 110015382;
        ek.tmy[11] = -1061932449;
        ek.tmy[12] = 906553487;
        ek.tmy[13] = -303848569;
        ek.tmy[14] = 2125074867;
        ek.tmy[15] = 522149287;
        ek.tmy[16] = 404116347;
        ek.tmy[17] = 2091837528;
        ek.tmy[18] = -200205638;
        ek.tmy[19] = 1726404480;
        ek.tmy[20] = -1436190469;
        ek.tmy[21] = 295317536;
        ek.tmy[22] = 547075162;
        ek.tmy[23] = 1332283238;
        ek.tmy[24] = 1874581412;
        ek.tmy[25] = 1383126223;
        ek.tmy[26] = -1784795520;
        ek.tmy[27] = 1708337759;
        ek.tmy[28] = 997481607;
        ek.tmy[29] = 1778191557;
        ek.tmy[30] = 336936054;
        ek.tmy[31] = 2060662502;
        ek.tmy[32] = -1796326609;
        ek.tmy[33] = -861560556;
        ek.tmy[34] = -943819082;
        ek.tmy[35] = 1923650099;
        ek.tmy[36] = 945458241;
        ek.tmy[37] = 2057735780;
        ek.tmy[38] = 1640055377;
        ek.tmy[39] = -1288711246;
        ek.tmy[40] = 1100882466;
        ek.tmy[41] = 345357216;
        ek.tmy[42] = -993735942;
        ek.tmy[43] = 539236762;
        ek.tmy[44] = -1302064584;
        ek.tmy[45] = 1533223992;
        ek.tmy[46] = 1446279643;
        ek.tmy[47] = 630284532;
        ek.tmy[48] = -1220299626;
        ek.tmy[49] = 258735424;
        ek.tmy[50] = -1881503711;
        ek.tmy[51] = 706915069;
        ek.tmy[52] = 516468241;
        ek.tmy[53] = -1830634225;
        ek.tmy[54] = 777977936;
        ek.tmy[55] = -693992950;
        ek.tmy[56] = -890533287;
        ek.tmy[57] = 479131413;
        ek.tmy[58] = 490326468;
        ek.tmy[59] = -2117681842;
        ek.tmy[60] = -31250338;
        ek.tmy[61] = -2011292727;
        ek.tmy[62] = -1092344033;
        ek.tmy[63] = 737638360;
        ek.tmy[64] = 115944402;
        ek.tmy[65] = -1010070604;
        ek.tmy[66] = -659794639;
        ek.tmy[67] = -216536056;
        ek.tmy[68] = 1139301375;
        ek.tmy[69] = -1572881646;
        ek.tmy[70] = 514793110;
        ek.tmy[71] = 26589924;
        ek.tmy[72] = -1843566552;
        ek.tmy[73] = 1863871683;
        ek.tmy[74] = 1067604650;
        ek.tmy[75] = -133664092;
        ek.tmy[76] = 1138885479;
        ek.tmy[77] = 1871973944;
        ek.tmy[78] = -1035227914;
        ek.tmy[79] = 1761990250;
        ek.tmy[80] = 39111507;
        ek.tmy[81] = 509411223;
        ek.tmy[82] = 1041102950;
        ek.tmy[83] = -940292043;
        ek.tmy[84] = -1949916453;
        ek.tmy[85] = 908197709;
        ek.tmy[86] = 1128274945;
        ek.tmy[87] = 765480040;
        ek.tmy[88] = -1535618379;
        ek.tmy[89] = 2028280219;
        ek.tmy[90] = -819737387;
        ek.tmy[91] = 1427368101;
        ek.tmy[92] = -706383885;
        ek.tmy[93] = 737744319;
        ek.tmy[94] = -1582043666;
        ek.tmy[95] = 1881571162;
        ek.tmy[96] = -1136854789;
        ek.tmy[97] = 462351450;
        ek.tmy[98] = -342557972;
        ek.tmy[99] = -1489104717;
    }

    private static /* synthetic */ void ukf() {
        ek.tmt[200] = -4999780295484903473L;
        ek.tmt[201] = -5071085079722377112L;
        ek.tmt[202] = -2919262547180455387L;
        ek.tmt[203] = 3106492497445980709L;
        ek.tmt[204] = 8122491647102361856L;
        ek.tmt[205] = -4738356788329609720L;
        ek.tmt[206] = 3583935820140451806L;
        ek.tmt[207] = 4045727859231318036L;
        ek.tmt[208] = -8322193074745296347L;
        ek.tmt[209] = 3913109483703016831L;
        ek.tmt[210] = 7704903064107420305L;
        ek.tmt[211] = -9002901456056984760L;
        ek.tmt[212] = -6059268357192300956L;
        ek.tmt[213] = 5280538669721539371L;
        ek.tmt[214] = 88064301906731000L;
        ek.tmt[215] = 2886325996448576622L;
        ek.tmt[216] = -814239612838152086L;
        ek.tmt[217] = 5402451134876214790L;
        ek.tmt[218] = -663878949239319375L;
        ek.tmt[219] = 2041620830984601064L;
        ek.tmt[220] = 4259519559943519586L;
        ek.tmt[221] = -8406450249858609905L;
        ek.tmt[222] = 141056818503465151L;
        ek.tmt[223] = -1422443384562603584L;
        ek.tmt[224] = 1756601147532262742L;
        ek.tmt[225] = 2828713478525512025L;
        ek.tmt[226] = 6535316089772530389L;
        ek.tmt[227] = 2983890067594104418L;
        ek.tmt[228] = -6479962489896126819L;
        ek.tmt[229] = 1595072706392833340L;
        ek.tmt[230] = -5407956572671790357L;
        ek.tmt[231] = -6933197107776384082L;
        ek.tmt[232] = 3235550904063912479L;
        ek.tmt[233] = -195134764693377087L;
        ek.tmt[234] = 3155710829515279677L;
        ek.tmt[235] = -9136807347827479782L;
        ek.tmt[236] = -8397609472748178794L;
        ek.tmt[237] = 1343655698825156878L;
        ek.tmt[238] = 4040348176292544718L;
        ek.tmt[239] = -3282567320442023218L;
        ek.tmt[240] = 7737955135665773884L;
        ek.tmt[241] = 2122761059099187755L;
        ek.tmt[242] = 5138388017001390672L;
        ek.tmt[243] = 2928962223309008859L;
        ek.tmt[244] = -1407200594868842044L;
        ek.tmt[245] = -6794243027228165518L;
        ek.tmt[246] = 3479514468804708455L;
        ek.tmt[247] = -2345782050740133246L;
        ek.tmt[248] = 952357334471022696L;
        ek.tmt[249] = 4599573414758976389L;
        ek.tmt[250] = -4282983784037250498L;
        ek.tmt[251] = -9094626640206473017L;
        ek.tmt[252] = 1221304959319121631L;
        ek.tmt[253] = -3460357765068061139L;
        ek.tmt[254] = 4526000869244698619L;
        ek.tmt[255] = 2901428759942031914L;
        ek.tmt[256] = 5964122668484904266L;
        ek.tmt[257] = -8238861596975643770L;
        ek.tmt[258] = -3624137145172596253L;
        ek.tmt[259] = -3842487836891528348L;
        ek.tmt[260] = 3033590732652714941L;
        ek.tmt[261] = -8764981354749711092L;
        ek.tmt[262] = -7086137689483900546L;
        ek.tmt[263] = 3633153761294312532L;
        ek.tmt[264] = 6843043109886894988L;
        ek.tmt[265] = -5667805633882036353L;
        ek.tmt[266] = -3680155343192011969L;
        ek.tmt[267] = 1929995490675821960L;
        ek.tmt[268] = -180461080163060566L;
        ek.tmt[269] = -6650514542632962580L;
        ek.tmt[270] = 1003719073663329951L;
        ek.tmt[271] = -8799314815546564266L;
        ek.tmt[272] = -756022224612133185L;
        ek.tmt[273] = -3341621998265840591L;
        ek.tmt[274] = -7390121055729788290L;
        ek.tmt[275] = 3296819157272239171L;
        ek.tmt[276] = 185932567825721568L;
        ek.tmt[277] = 2613981778548795298L;
        ek.tmt[278] = 3074563080467573366L;
        ek.tmt[279] = -7687074606149158678L;
        ek.tmt[280] = -2158854451664881352L;
        ek.tmt[281] = -5650014204639218873L;
        ek.tmt[282] = -3591930658068061597L;
        ek.tmt[283] = 4316599606767078364L;
        ek.tmt[284] = 7738007203543656539L;
        ek.tmt[285] = 4796898933160233746L;
        ek.tmt[286] = -3297175740472783586L;
        ek.tmt[287] = -3891362643370475044L;
        ek.tmt[288] = 3868654184978949394L;
        ek.tmt[289] = -7552626898368638141L;
    }

    private static /* synthetic */ void ujs() {
        ek.tmx[0] = -894642113;
        ek.tmx[1] = 420047009;
        ek.tmx[2] = 295077232;
        ek.tmx[3] = 1574838510;
        ek.tmx[4] = 2047167014;
        ek.tmx[5] = 1304884595;
        ek.tmx[6] = 1327676713;
        ek.tmx[7] = 741831067;
        ek.tmx[8] = -1874988996;
        ek.tmx[9] = -1580482210;
        ek.tmx[10] = 1187951510;
        ek.tmx[11] = -2137771425;
        ek.tmx[12] = 1992878223;
        ek.tmx[13] = -802197686;
        ek.tmx[14] = 2125074866;
        ek.tmx[15] = 522149282;
        ek.tmx[16] = 404116344;
        ek.tmx[17] = 2091837534;
        ek.tmx[18] = -200205640;
        ek.tmx[19] = 1726404488;
        ek.tmx[20] = -1436190477;
        ek.tmx[21] = 295317539;
        ek.tmx[22] = 547075163;
        ek.tmx[23] = 1332283246;
        ek.tmx[24] = 1874581411;
        ek.tmx[25] = 1383126222;
        ek.tmx[26] = 726395642;
        ek.tmx[27] = 1485483487;
        ek.tmx[28] = 997481606;
        ek.tmx[29] = -344698851;
        ek.tmx[30] = 336936055;
        ek.tmx[31] = -1318036966;
        ek.tmx[32] = -1440548894;
        ek.tmx[33] = -861560553;
        ek.tmx[34] = -943819081;
        ek.tmx[35] = 1923650096;
        ek.tmx[36] = 945458243;
        ek.tmx[37] = 2057735781;
        ek.tmx[38] = -1812702245;
        ek.tmx[39] = -1937814810;
        ek.tmx[40] = 1100882467;
        ek.tmx[41] = 2082977090;
        ek.tmx[42] = -993735941;
        ek.tmx[43] = -2109886922;
        ek.tmx[44] = -1302064584;
        ek.tmx[45] = 1533223992;
        ek.tmx[46] = 1446279640;
        ek.tmx[47] = 630284533;
        ek.tmx[48] = -1220299625;
        ek.tmx[49] = -13520558;
        ek.tmx[50] = -1881503712;
        ek.tmx[51] = -419085878;
        ek.tmx[52] = 516468240;
        ek.tmx[53] = 205185586;
        ek.tmx[54] = 777977937;
        ek.tmx[55] = 378437546;
        ek.tmx[56] = -890533281;
        ek.tmx[57] = 479131412;
        ek.tmx[58] = 490326477;
        ek.tmx[59] = -2117681846;
        ek.tmx[60] = -31250339;
        ek.tmx[61] = -2011292722;
        ek.tmx[62] = -1092344035;
        ek.tmx[63] = 737638360;
        ek.tmx[64] = 115944401;
        ek.tmx[65] = -1010070607;
        ek.tmx[66] = -659794640;
        ek.tmx[67] = -2030532508;
        ek.tmx[68] = 1139301374;
        ek.tmx[69] = -918916852;
        ek.tmx[70] = 514793111;
        ek.tmx[71] = -1922341275;
        ek.tmx[72] = -1843566551;
        ek.tmx[73] = 1863871682;
        ek.tmx[74] = -662148611;
        ek.tmx[75] = -133664091;
        ek.tmx[76] = 1382417671;
        ek.tmx[77] = 1871973945;
        ek.tmx[78] = 930544125;
        ek.tmx[79] = 1761990250;
        ek.tmx[80] = 39111507;
        ek.tmx[81] = 509411223;
        ek.tmx[82] = 1041102950;
        ek.tmx[83] = -940292044;
        ek.tmx[84] = -465136839;
        ek.tmx[85] = 908197708;
        ek.tmx[86] = -1662018127;
        ek.tmx[87] = 765480041;
        ek.tmx[88] = 1468530377;
        ek.tmx[89] = 2028280218;
        ek.tmx[90] = 1027871534;
        ek.tmx[91] = 1427368100;
        ek.tmx[92] = -1323817132;
        ek.tmx[93] = 737744317;
        ek.tmx[94] = -1582043665;
        ek.tmx[95] = 1281628102;
        ek.tmx[96] = -1136854790;
        ek.tmx[97] = 1945373337;
        ek.tmx[98] = -342557971;
        ek.tmx[99] = 1898217461;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ik getTargetSelector() {
        v0 /* !! */  = ek.be;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - ek.tmu("uew", tmr(int ), (int)226));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1610963620: {
                    break block23;
                }
                case 107254933: {
                    v1 = ek.tmu("uex", tmr(int ), (int)227);
                    continue block23;
                }
                case 1092680189: {
                    v1 = ek.tmu("uey", tmr(int ), (int)228);
                    continue block23;
                }
            }
            break;
        }
        var3_1 = ek.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ek.be - ek.tmu("uez", tmr(int ), (int)229)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ek.tmu("ufa", tmw(int ), (int)239)) break;
            v2 /* !! */  = (long)ek.tmu("ufb", tmw(int ), (int)240);
        }
        var2_2 /* !! */  = ek.b;
        v3 /* !! */  = ek.be;
        if (true) ** GOTO lbl26
        block25: while (true) {
            v3 /* !! */  = (long)(v4 - ek.tmu("ufc", tmr(int ), (int)230));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1610963620: {
                    break block25;
                }
                case -1415540279: {
                    v4 = ek.tmu("ufd", tmr(int ), (int)231);
                    continue block25;
                }
                case -933959271: {
                    v4 = ek.tmu("ufe", tmr(int ), (int)232);
                    continue block25;
                }
                case -121740945: {
                    v4 = ek.tmu("uff", tmr(int ), (int)233);
                    continue block25;
                }
            }
            break;
        }
        var1_3 = ek.a;
        if (var3_1) {
            throw null;
lbl41:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl44:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = ek.be;
                if (true) ** GOTO lbl51
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - ek.tmu("ufg", tmr(int ), (int)234));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1610963620: {
                            break block27;
                        }
                        case 94675895: {
                            v6 = ek.tmu("ufh", tmr(int ), (int)235);
                            continue block27;
                        }
                        case 835878613: {
                            v6 = ek.tmu("ufi", tmr(int ), (int)236);
                            continue block27;
                        }
                        case 1114959406: {
                            v6 = ek.tmu("ufj", tmr(int ), (int)237);
                            continue block27;
                        }
                    }
                    break;
                }
                return this.targetSelector;
            }
            case 0: {
                var2_2 /* !! */  = (int)ek.tmu("ufk", tmw(int ), (int)241);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl73
            }
            case 1: {
                var2_2 /* !! */  = (int)ek.tmu("ufl", tmw(int ), (int)242);
                if (!var3_1) break;
                throw null;
            }
lbl73:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ek.tmu("ufm", tmw(int ), (int)243);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ek.tmu("ufn", tmw(int ), (int)244);
        ** while (!var3_1)
lbl81:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    @aw
    public void onRotationUpdate(da var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[CASE], 9[SWITCH]], but top level block is 17[SWITCH]
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
    public kg getAttackRange() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ek.be - ek.tmu("uhk", tmr(int ), (int)262)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ek.tmu("uhl", tmw(int ), (int)269)) break;
            v0 /* !! */  = (long)ek.tmu("uhm", tmw(int ), (int)270);
        }
        var3_1 = ek.c;
        v1 /* !! */  = ek.be;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - ek.tmu("uhn", tmr(int ), (int)263));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1610963620: {
                    break block17;
                }
                case -1578974189: {
                    v2 = ek.tmu("uho", tmr(int ), (int)264);
                    continue block17;
                }
                case -1107867513: {
                    v2 = ek.tmu("uhp", tmr(int ), (int)265);
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = ek.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ek.be - ek.tmu("uhq", tmr(int ), (int)266)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ek.tmu("uhr", tmw(int ), (int)271)) break;
            v3 /* !! */  = (long)ek.tmu("uhs", tmw(int ), (int)272);
        }
        var1_3 = ek.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = ek.be;
                if (true) ** GOTO lbl42
                block20: while (true) {
                    v4 /* !! */  = (long)(v5 - ek.tmu("uht", tmr(int ), (int)267));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1610963620: {
                            break block20;
                        }
                        case -1206481506: {
                            v5 = ek.tmu("uhu", tmr(int ), (int)268);
                            continue block20;
                        }
                        case -850830534: {
                            v5 = ek.tmu("uhv", tmr(int ), (int)269);
                            continue block20;
                        }
                    }
                    break;
                }
                return this.attackRange;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)ek.tmu("uhw", tmw(int ), (int)273);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)ek.tmu("uhx", tmw(int ), (int)274);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)ek.tmu("uhy", tmw(int ), (int)275);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)ek.tmu("uhz", tmw(int ), (int)276);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ke getOptions() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ek.be - ek.tmu("uin", tmr(int ), (int)277)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ek.tmu("uio", tmw(int ), (int)283)) break;
            v0 /* !! */  = (long)ek.tmu("uip", tmw(int ), (int)284);
        }
        var3_1 = ek.c;
        v1 /* !! */  = ek.be;
        if (true) ** GOTO lbl12
        block6: while (true) {
            v1 /* !! */  = (long)(v2 - ek.tmu("uiq", tmr(int ), (int)278));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1610963620: {
                    break block6;
                }
                case -976602009: {
                    v2 = ek.tmu("uir", tmr(int ), (int)279);
                    continue block6;
                }
                case -924877445: {
                    v2 = ek.tmu("uis", tmr(int ), (int)280);
                    continue block6;
                }
            }
            break;
        }
        var2_2 = ek.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ek.be - ek.tmu("uit", tmr(int ), (int)281)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ek.tmu("uiu", tmw(int ), (int)285)) break;
            v3 /* !! */  = (long)ek.tmu("uiv", tmw(int ), (int)286);
        }
        var1_3 = ek.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = ek.be - ek.tmu("uiw", tmr(int ), (int)282)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == ek.tmu("uix", tmw(int ), (int)287)) break;
            v4 /* !! */  = (long)ek.tmu("uiy", tmw(int ), (int)288);
        }
        return this.options;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void inputEvent(cj var1_1) {
        v0 /* !! */  = ek.be;
        if (true) ** GOTO lbl5
        block104: while (true) {
            v0 /* !! */  = (long)(ek.tmu("tqy", tmr(int ), (int)37) - ek.tmu("tqx", tmr(int ), (int)36));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1754832015: {
                    continue block104;
                }
                case -1610963620: {
                    break block104;
                }
            }
            break;
        }
        var4_2 = ek.c;
        v1 /* !! */  = ek.be;
        if (true) ** GOTO lbl15
        block105: while (true) {
            v1 /* !! */  = (long)(v2 - ek.tmu("tqz", tmr(int ), (int)38));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1765976264: {
                    v2 = ek.tmu("tra", tmr(int ), (int)39);
                    continue block105;
                }
                case -1610963620: {
                    break block105;
                }
                case 688715684: {
                    v2 = ek.tmu("trb", tmr(int ), (int)40);
                    continue block105;
                }
                case 1590329798: {
                    v2 = ek.tmu("trc", tmr(int ), (int)41);
                    continue block105;
                }
            }
            break;
        }
        var3_3 /* !! */  = ek.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ek.be - ek.tmu("trd", tmr(int ), (int)42)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ek.tmu("tre", tmw(int ), (int)66)) break;
            v3 /* !! */  = (long)ek.tmu("trf", tmw(int ), (int)67);
        }
        var2_4 = ek.a;
        if (var4_2) {
            throw null;
lbl36:
            // 13 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl36
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = ek.be - ek.tmu("trg", tmr(int ), (int)43)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ek.tmu("trh", tmw(int ), (int)68)) break;
            v4 /* !! */  = (long)ek.tmu("tri", tmw(int ), (int)69);
        }
        if (this.target == null) ** GOTO lbl151
        if (var2_4) ** GOTO lbl36
        v5 /* !! */  = ek.be;
        if (true) ** GOTO lbl50
        block109: while (true) {
            v5 /* !! */  = (long)(ek.tmu("trk", tmr(int ), (int)45) - ek.tmu("trj", tmr(int ), (int)44));
lbl50:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1610963620: {
                    break block109;
                }
                case 1367627875: {
                    continue block109;
                }
            }
            break;
        }
        v6 = d.getInstance();
        v7 /* !! */  = ek.be;
        if (true) ** GOTO lbl60
        block110: while (true) {
            v7 /* !! */  = (long)(v8 - ek.tmu("trl", tmr(int ), (int)46));
lbl60:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1610963620: {
                    break block110;
                }
                case -1287252408: {
                    v8 = ek.tmu("trm", tmr(int ), (int)47);
                    continue block110;
                }
                case 1162121502: {
                    v8 = ek.tmu("trn", tmr(int ), (int)48);
                    continue block110;
                }
            }
            break;
        }
        v9 = v6.getManager();
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_2 = ek.be - ek.tmu("tro", tmr(int ), (int)49)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == ek.tmu("trp", tmw(int ), (int)70)) break;
            v10 /* !! */  = (long)ek.tmu("trq", tmw(int ), (int)71);
        }
        v11 = v9.getAttackPerpetrator();
        v12 /* !! */  = ek.be;
        if (true) ** GOTO lbl80
        block112: while (true) {
            v12 /* !! */  = (long)(ek.tmu("trs", tmr(int ), (int)51) - ek.tmu("trr", tmr(int ), (int)50));
lbl80:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1610963620: {
                    break block112;
                }
                case -666137997: {
                    continue block112;
                }
            }
            break;
        }
        v13 = v11.getAttackHandler();
        v14 /* !! */  = ek.be;
        if (true) ** GOTO lbl90
        block113: while (true) {
            v14 /* !! */  = (long)(v15 - ek.tmu("trt", tmr(int ), (int)52));
lbl90:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1610963620: {
                    break block113;
                }
                case -218889722: {
                    v15 = ek.tmu("tru", tmr(int ), (int)53);
                    continue block113;
                }
                case 1232340594: {
                    v15 = ek.tmu("trv", tmr(int ), (int)54);
                    continue block113;
                }
                case 1277404419: {
                    v15 = ek.tmu("trw", tmr(int ), (int)55);
                    continue block113;
                }
            }
            break;
        }
        v16 = this.getConfig();
        v17 = ek.tmu("trx", tmw(int ), (int)72);
        v18 /* !! */  = ek.be;
        if (true) ** GOTO lbl108
        block114: while (true) {
            v18 /* !! */  = (long)(v19 - ek.tmu("try", tmr(int ), (int)56));
lbl108:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -1610963620: {
                    break block114;
                }
                case -1586352639: {
                    v19 = ek.tmu("trz", tmr(int ), (int)57);
                    continue block114;
                }
                case -702461359: {
                    v19 = ek.tmu("tsa", tmr(int ), (int)58);
                    continue block114;
                }
            }
            break;
        }
        if (!v13.canAttack(v16, (int)v17)) ** GOTO lbl151
        if (var2_4) ** GOTO lbl36
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_3 = ek.be - ek.tmu("tsb", tmr(int ), (int)59)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == ek.tmu("tsc", tmw(int ), (int)73)) break;
                    v20 /* !! */  = (long)ek.tmu("tsd", tmw(int ), (int)74);
                }
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_4 = ek.be - ek.tmu("tse", tmr(int ), (int)60)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == ek.tmu("tsf", tmw(int ), (int)75)) break;
                    v21 /* !! */  = (long)ek.tmu("tsg", tmw(int ), (int)76);
                }
                v22 = ek.mc.field_1724;
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_5 = ek.be - ek.tmu("tsh", tmr(int ), (int)61)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == ek.tmu("tsi", tmw(int ), (int)77)) break;
                    v23 /* !! */  = (long)ek.tmu("tsj", tmw(int ), (int)78);
                }
                if (v22.method_5869()) ** GOTO lbl151
                if (var2_4 || var2_4) ** GOTO lbl36
                v24 = ek.tmu("tsk", tmw(int ), (int)79);
                v25 = ek.tmu("tsl", tmw(int ), (int)80);
                v26 = ek.tmu("tsm", tmw(int ), (int)81);
                v27 = ek.tmu("tsn", tmw(int ), (int)82);
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_6 = ek.be - ek.tmu("tso", tmr(int ), (int)62)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == ek.tmu("tsp", tmw(int ), (int)83)) break;
                    v28 /* !! */  = (long)ek.tmu("tsq", tmw(int ), (int)84);
                }
                var1_1.setDirectionalLow((boolean)v24, (boolean)v25, (boolean)v26, (boolean)v27);
                if (var2_4) ** GOTO lbl36
lbl151:
                // 4 sources

                if (var2_4 || var2_4) ** GOTO lbl36
                v29 /* !! */  = ek.be;
                if (true) ** GOTO lbl156
                block119: while (true) {
                    v29 /* !! */  = (long)(v30 - ek.tmu("tsr", tmr(int ), (int)63));
lbl156:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -1610963620: {
                            break block119;
                        }
                        case 1819735568: {
                            v30 = ek.tmu("tss", tmr(int ), (int)64);
                            continue block119;
                        }
                        case 1930919455: {
                            v30 = ek.tmu("tst", tmr(int ), (int)65);
                            continue block119;
                        }
                    }
                    break;
                }
                v31 /* !! */  = ek.be;
                if (true) ** GOTO lbl169
                block120: while (true) {
                    v31 /* !! */  = (long)(v32 - ek.tmu("tsu", tmr(int ), (int)66));
lbl169:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -1893378729: {
                            v32 = ek.tmu("tsv", tmr(int ), (int)67);
                            continue block120;
                        }
                        case -1610963620: {
                            break block120;
                        }
                        case 2011903683: {
                            v32 = ek.tmu("tsw", tmr(int ), (int)68);
                            continue block120;
                        }
                        case 2073469608: {
                            v32 = ek.tmu("tsx", tmr(int ), (int)69);
                            continue block120;
                        }
                    }
                    break;
                }
                if (!this.options.isSelected("\u041e\u0442\u0436\u0438\u043c\u0430\u0442\u044c \u0449\u0438\u0442")) ** GOTO lbl349
                if (var2_4) ** GOTO lbl36
                v33 /* !! */  = ek.be;
                if (true) ** GOTO lbl187
                block121: while (true) {
                    v33 /* !! */  = (long)(v34 - ek.tmu("tsy", tmr(int ), (int)70));
lbl187:
                    // 2 sources

                    switch ((int)v33 /* !! */ ) {
                        case -1610963620: {
                            break block121;
                        }
                        case 73149893: {
                            v34 = ek.tmu("tsz", tmr(int ), (int)71);
                            continue block121;
                        }
                        case 1936309159: {
                            v34 = ek.tmu("tta", tmr(int ), (int)72);
                            continue block121;
                        }
                    }
                    break;
                }
                if (this.target == null) ** GOTO lbl349
                if (var2_4) ** GOTO lbl36
                v35 /* !! */  = ek.be;
                if (true) ** GOTO lbl202
                block122: while (true) {
                    v35 /* !! */  = (long)(ek.tmu("ttc", tmr(int ), (int)74) - ek.tmu("ttb", tmr(int ), (int)73));
lbl202:
                    // 2 sources

                    switch ((int)v35 /* !! */ ) {
                        case -1742037845: {
                            continue block122;
                        }
                        case -1610963620: {
                            break block122;
                        }
                    }
                    break;
                }
                v36 = d.getInstance();
                while (true) {
                    if ((v37 /* !! */  = (cfr_temp_7 = ek.be - ek.tmu("ttd", tmr(int ), (int)75)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v37 /* !! */  == ek.tmu("tte", tmw(int ), (int)85)) break;
                    v37 /* !! */  = (long)ek.tmu("ttf", tmw(int ), (int)86);
                }
                v38 = v36.getManager();
                while (true) {
                    if ((v39 /* !! */  = (cfr_temp_8 = ek.be - ek.tmu("ttg", tmr(int ), (int)76)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v39 /* !! */  == ek.tmu("tth", tmw(int ), (int)87)) break;
                    v39 /* !! */  = (long)ek.tmu("tti", tmw(int ), (int)88);
                }
                v40 = v38.getAttackPerpetrator();
                while (true) {
                    if ((v41 /* !! */  = (cfr_temp_9 = ek.be - ek.tmu("ttj", tmr(int ), (int)77)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v41 /* !! */  == ek.tmu("ttk", tmw(int ), (int)89)) break;
                    v41 /* !! */  = (long)ek.tmu("ttl", tmw(int ), (int)90);
                }
                v42 = v40.getAttackHandler();
                while (true) {
                    if ((v43 /* !! */  = (cfr_temp_10 = ek.be - ek.tmu("ttm", tmr(int ), (int)78)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v43 /* !! */  == ek.tmu("ttn", tmw(int ), (int)91)) break;
                    v43 /* !! */  = (long)ek.tmu("tto", tmw(int ), (int)92);
                }
                v44 = this.getConfig();
                v45 = ek.tmu("ttp", tmw(int ), (int)93);
                while (true) {
                    if ((v46 /* !! */  = (cfr_temp_11 = ek.be - ek.tmu("ttq", tmr(int ), (int)79)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v46 /* !! */  == ek.tmu("ttr", tmw(int ), (int)94)) break;
                    v46 /* !! */  = (long)ek.tmu("tts", tmw(int ), (int)95);
                }
                if (!v42.canAttack(v44, (int)v45)) ** GOTO lbl349
                if (var2_4) ** GOTO lbl36
                v47 /* !! */  = ek.be;
                if (true) ** GOTO lbl244
                block128: while (true) {
                    v47 /* !! */  = (long)(ek.tmu("ttu", tmr(int ), (int)81) - ek.tmu("ttt", tmr(int ), (int)80));
lbl244:
                    // 2 sources

                    switch ((int)v47 /* !! */ ) {
                        case -1610963620: {
                            break block128;
                        }
                        case 1348720606: {
                            continue block128;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v48 /* !! */  = (cfr_temp_12 = ek.be - ek.tmu("ttv", tmr(int ), (int)82)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v48 /* !! */  == ek.tmu("ttw", tmw(int ), (int)96)) break;
                    v48 /* !! */  = (long)ek.tmu("ttx", tmw(int ), (int)97);
                }
                v49 = ek.mc.field_1724;
                while (true) {
                    if ((v50 /* !! */  = (cfr_temp_13 = ek.be - ek.tmu("tty", tmr(int ), (int)83)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v50 /* !! */  == ek.tmu("ttz", tmw(int ), (int)98)) break;
                    v50 /* !! */  = (long)ek.tmu("tua", tmw(int ), (int)99);
                }
                if (!v49.method_6115()) ** GOTO lbl349
                if (var2_4) ** GOTO lbl36
                while (true) {
                    if ((v51 /* !! */  = (cfr_temp_14 = ek.be - ek.tmu("tub", tmr(int ), (int)84)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v51 /* !! */  == ek.tmu("tuc", tmw(int ), (int)100)) break;
                    v51 /* !! */  = (long)ek.tmu("tud", tmw(int ), (int)101);
                }
                while (true) {
                    if ((v52 /* !! */  = (cfr_temp_15 = ek.be - ek.tmu("tue", tmr(int ), (int)85)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                    if (v52 /* !! */  == ek.tmu("tuf", tmw(int ), (int)102)) break;
                    v52 /* !! */  = (long)ek.tmu("tug", tmw(int ), (int)103);
                }
                v53 = ek.mc.field_1724;
                while (true) {
                    if ((v54 /* !! */  = (cfr_temp_16 = ek.be - ek.tmu("tuh", tmr(int ), (int)86)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                    if (v54 /* !! */  == ek.tmu("tui", tmw(int ), (int)104)) break;
                    v54 /* !! */  = (long)ek.tmu("tuj", tmw(int ), (int)105);
                }
                v55 = v53.method_6030();
                v56 /* !! */  = ek.be;
                if (true) ** GOTO lbl283
                block134: while (true) {
                    v56 /* !! */  = (long)(v57 - ek.tmu("tuk", tmr(int ), (int)87));
lbl283:
                    // 2 sources

                    switch ((int)v56 /* !! */ ) {
                        case -1610963620: {
                            break block134;
                        }
                        case -1439478927: {
                            v57 = ek.tmu("tul", tmr(int ), (int)88);
                            continue block134;
                        }
                        case -1241871778: {
                            v57 = ek.tmu("tum", tmr(int ), (int)89);
                            continue block134;
                        }
                        case -1226372108: {
                            v57 = ek.tmu("tun", tmr(int ), (int)90);
                            continue block134;
                        }
                    }
                    break;
                }
                v58 = v55.method_7909();
                v59 /* !! */  = ek.be;
                if (true) ** GOTO lbl300
                block135: while (true) {
                    v59 /* !! */  = (long)(v60 - ek.tmu("tuo", tmr(int ), (int)91));
lbl300:
                    // 2 sources

                    switch ((int)v59 /* !! */ ) {
                        case -1610963620: {
                            break block135;
                        }
                        case -580338885: {
                            v60 = ek.tmu("tup", tmr(int ), (int)92);
                            continue block135;
                        }
                        case -84722449: {
                            v60 = ek.tmu("tuq", tmr(int ), (int)93);
                            continue block135;
                        }
                        case 32666352: {
                            v60 = ek.tmu("tur", tmr(int ), (int)94);
                            continue block135;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v61 /* !! */  = (cfr_temp_17 = ek.be - ek.tmu("tus", tmr(int ), (int)95)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
                    if (v61 /* !! */  == ek.tmu("tut", tmw(int ), (int)106)) break;
                    v61 /* !! */  = (long)ek.tmu("tuu", tmw(int ), (int)107);
                }
                if (!v58.equals(class_1802.field_8255)) ** GOTO lbl349
                if (var2_4 || var2_4) ** GOTO lbl36
                v62 /* !! */  = ek.be;
                if (true) ** GOTO lbl323
                block137: while (true) {
                    v62 /* !! */  = (long)(ek.tmu("tuw", tmr(int ), (int)97) - ek.tmu("tuv", tmr(int ), (int)96));
lbl323:
                    // 2 sources

                    switch ((int)v62 /* !! */ ) {
                        case -1610963620: {
                            break block137;
                        }
                        case 1784747937: {
                            continue block137;
                        }
                    }
                    break;
                }
                v63 /* !! */  = ek.be;
                if (true) ** GOTO lbl332
                block138: while (true) {
                    v63 /* !! */  = (long)(ek.tmu("tuy", tmr(int ), (int)99) - ek.tmu("tux", tmr(int ), (int)98));
lbl332:
                    // 2 sources

                    switch ((int)v63 /* !! */ ) {
                        case -1629999892: {
                            continue block138;
                        }
                        case -1610963620: {
                            break block138;
                        }
                    }
                    break;
                }
                v64 = ek.mc.field_1724;
                v65 /* !! */  = ek.be;
                if (true) ** GOTO lbl342
                block139: while (true) {
                    v65 /* !! */  = (long)(ek.tmu("tva", tmr(int ), (int)101) - ek.tmu("tuz", tmr(int ), (int)100));
lbl342:
                    // 2 sources

                    switch ((int)v65 /* !! */ ) {
                        case -1610963620: {
                            break block139;
                        }
                        case 2089943426: {
                            continue block139;
                        }
                    }
                    break;
                }
                v64.method_6075();
                if (var2_4) ** GOTO lbl36
lbl349:
                // 6 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)ek.tmu("tvb", tmw(int ), (int)108);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl426
            }
            case 1: {
                var3_3 /* !! */  = (int)ek.tmu("tvc", tmw(int ), (int)109);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl400
            }
            case 2: {
                var3_3 /* !! */  = (int)ek.tmu("tvd", tmw(int ), (int)110);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl418
            }
lbl367:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)ek.tmu("tve", tmw(int ), (int)111);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl409
            }
            case 4: {
                var3_3 /* !! */  = (int)ek.tmu("tvf", tmw(int ), (int)112);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl418
            }
lbl377:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)ek.tmu("tvg", tmw(int ), (int)113);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl431
            }
lbl382:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)ek.tmu("tvh", tmw(int ), (int)114);
                if (!var4_2) ** GOTO lbl377
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)ek.tmu("tvi", tmw(int ), (int)115);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl405
            }
            case 8: {
                var3_3 /* !! */  = (int)ek.tmu("tvj", tmw(int ), (int)116);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl418
            }
lbl396:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)ek.tmu("tvk", tmw(int ), (int)117);
                if (!var4_2) ** GOTO lbl382
                throw null;
            }
lbl400:
            // 3 sources

            case 10: {
                do {
                    var3_3 /* !! */  = (int)ek.tmu("tvl", tmw(int ), (int)118);
                } while (!var4_2);
                throw null;
            }
lbl405:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)ek.tmu("tvm", tmw(int ), (int)119);
                if (!var4_2) ** GOTO lbl396
                throw null;
            }
lbl409:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)ek.tmu("tvn", tmw(int ), (int)120);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl418
            }
            case 13: {
                var3_3 /* !! */  = (int)ek.tmu("tvo", tmw(int ), (int)121);
                if (var4_2) {
                    throw null;
                }
            }
lbl418:
            // 8 sources

            case 14: {
                var3_3 /* !! */  = (int)ek.tmu("tvp", tmw(int ), (int)122);
                if (!var4_2) ** GOTO lbl367
                throw null;
            }
lbl422:
            // 2 sources

            case 15: {
                var3_3 /* !! */  = (int)ek.tmu("tvq", tmw(int ), (int)123);
                if (!var4_2) ** GOTO lbl400
                throw null;
            }
lbl426:
            // 2 sources

            case 16: {
                do {
                    var3_3 /* !! */  = (int)ek.tmu("tvr", tmw(int ), (int)124);
                } while (!var4_2);
                throw null;
            }
lbl431:
            // 2 sources

            case 17: {
                var3_3 /* !! */  = (int)ek.tmu("tvs", tmw(int ), (int)125);
                if (!var4_2) ** GOTO lbl422
                throw null;
            }
            case 18: {
                var3_3 /* !! */  = (int)ek.tmu("tvt", tmw(int ), (int)126);
                if (!var4_2) ** GOTO lbl418
                throw null;
            }
            case 19: 
        }
        do {
            var3_3 /* !! */  = (int)ek.tmu("tvu", tmw(int ), (int)127);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void ukd() {
        ek.tmt[0] = -7135851929732152193L;
        ek.tmt[1] = -1679021684303169949L;
        ek.tmt[2] = -1846444954387805366L;
        ek.tmt[3] = -8985843933114281945L;
        ek.tmt[4] = 3496243676309094178L;
        ek.tmt[5] = 1837246444616720415L;
        ek.tmt[6] = -1605360806057559950L;
        ek.tmt[7] = -8326525594791046967L;
        ek.tmt[8] = -8062223140592701738L;
        ek.tmt[9] = -626700202398620133L;
        ek.tmt[10] = 1333395052731332654L;
        ek.tmt[11] = -6792527754128374057L;
        ek.tmt[12] = -5939772768702495682L;
        ek.tmt[13] = 3286959648261238727L;
        ek.tmt[14] = 8151830953883068692L;
        ek.tmt[15] = 1501467242988584586L;
        ek.tmt[16] = -868689922065086749L;
        ek.tmt[17] = -8390106981739504889L;
        ek.tmt[18] = 8212413037199765510L;
        ek.tmt[19] = -5066822825111240695L;
        ek.tmt[20] = 8965227719385516798L;
        ek.tmt[21] = 7302069250398918247L;
        ek.tmt[22] = 5048099580630122459L;
        ek.tmt[23] = 2168661946261279505L;
        ek.tmt[24] = -7644839748572776445L;
        ek.tmt[25] = -2076390557606019887L;
        ek.tmt[26] = 1865828164230278203L;
        ek.tmt[27] = 4889788503549677874L;
        ek.tmt[28] = -4732858496542141976L;
        ek.tmt[29] = 3915171942395080361L;
        ek.tmt[30] = 1205214509629701299L;
        ek.tmt[31] = -6875591693188431490L;
        ek.tmt[32] = 6493397589335068680L;
        ek.tmt[33] = -636570178257696856L;
        ek.tmt[34] = -2444731165992658400L;
        ek.tmt[35] = -2897757126632731400L;
        ek.tmt[36] = 7080496157145060112L;
        ek.tmt[37] = -4796571122072157811L;
        ek.tmt[38] = -46233233998054101L;
        ek.tmt[39] = 2528755142223398690L;
        ek.tmt[40] = -41399305338288176L;
        ek.tmt[41] = -324301145628940643L;
        ek.tmt[42] = -3232251768333040386L;
        ek.tmt[43] = -4170698345970332116L;
        ek.tmt[44] = 5521193782120028593L;
        ek.tmt[45] = 3410384754775014674L;
        ek.tmt[46] = -7203506059030707610L;
        ek.tmt[47] = 9044318092711029580L;
        ek.tmt[48] = -2380346542335629943L;
        ek.tmt[49] = -4182997227072423565L;
        ek.tmt[50] = 8920978007510426735L;
        ek.tmt[51] = -2629882660741788883L;
        ek.tmt[52] = -4475296575965812384L;
        ek.tmt[53] = -3977587926891337552L;
        ek.tmt[54] = -2899330138640406303L;
        ek.tmt[55] = -5913914797983723989L;
        ek.tmt[56] = 711140548846534346L;
        ek.tmt[57] = 6487232920762985695L;
        ek.tmt[58] = 2006270954428759821L;
        ek.tmt[59] = -1535151941866888904L;
        ek.tmt[60] = -2060783245055980988L;
        ek.tmt[61] = -7447544400233116229L;
        ek.tmt[62] = 1719084831377831766L;
        ek.tmt[63] = -4954159542824859026L;
        ek.tmt[64] = 2592103187933457281L;
        ek.tmt[65] = 7461446115981875907L;
        ek.tmt[66] = -7063689848035941187L;
        ek.tmt[67] = -8655978422618541497L;
        ek.tmt[68] = 2860423976694555813L;
        ek.tmt[69] = 3474701732582749776L;
        ek.tmt[70] = -278188614201669454L;
        ek.tmt[71] = 4355420446262309990L;
        ek.tmt[72] = -4550609143306256204L;
        ek.tmt[73] = 3879003635980888158L;
        ek.tmt[74] = 9115569085359822085L;
        ek.tmt[75] = 6464590351956348839L;
        ek.tmt[76] = -5436525552810779165L;
        ek.tmt[77] = -5136929083436685639L;
        ek.tmt[78] = -8312692565035855639L;
        ek.tmt[79] = -4707556148287276980L;
        ek.tmt[80] = 1503101714784790621L;
        ek.tmt[81] = 2614043436464172086L;
        ek.tmt[82] = 4986537239757068784L;
        ek.tmt[83] = 2362912060720648176L;
        ek.tmt[84] = -2774956663539739687L;
        ek.tmt[85] = 5408264639421948611L;
        ek.tmt[86] = -2376386703116835168L;
        ek.tmt[87] = -8047789041365172287L;
        ek.tmt[88] = 7185737935684621258L;
        ek.tmt[89] = 6560082538260603550L;
        ek.tmt[90] = 4595381973611363475L;
        ek.tmt[91] = 3304956403356503510L;
        ek.tmt[92] = 3004661484357400004L;
        ek.tmt[93] = 4776023501358734452L;
        ek.tmt[94] = -6970848861013325916L;
        ek.tmt[95] = -5700758290459625357L;
        ek.tmt[96] = -7771537706661449340L;
        ek.tmt[97] = 6313108168296784932L;
        ek.tmt[98] = 1717912910020787213L;
        ek.tmt[99] = -202415052082902443L;
    }

    private static /* synthetic */ float tnp(int n2) {
        return Float.intBitsToFloat(tmx[n2] ^ tmy[n2]);
    }

    private static /* synthetic */ void ujx() {
        ek.tmy[100] = 320237857;
        ek.tmy[101] = 7726976;
        ek.tmy[102] = 1341478288;
        ek.tmy[103] = 190733039;
        ek.tmy[104] = 866590073;
        ek.tmy[105] = -1343105528;
        ek.tmy[106] = -682412333;
        ek.tmy[107] = -1561854588;
        ek.tmy[108] = 123812726;
        ek.tmy[109] = -1476492642;
        ek.tmy[110] = -1477909813;
        ek.tmy[111] = 763940516;
        ek.tmy[112] = 1726474690;
        ek.tmy[113] = -239609422;
        ek.tmy[114] = -1332231631;
        ek.tmy[115] = -229979643;
        ek.tmy[116] = 626410262;
        ek.tmy[117] = -1487892445;
        ek.tmy[118] = 511810300;
        ek.tmy[119] = -840789884;
        ek.tmy[120] = 468913260;
        ek.tmy[121] = -2093966356;
        ek.tmy[122] = 1902011673;
        ek.tmy[123] = 391736233;
        ek.tmy[124] = -1515339293;
        ek.tmy[125] = -391381220;
        ek.tmy[126] = -1632054046;
        ek.tmy[127] = -1709557206;
        ek.tmy[128] = -1607143793;
        ek.tmy[129] = 426274885;
        ek.tmy[130] = -1803955877;
        ek.tmy[131] = 759887825;
        ek.tmy[132] = 706421811;
        ek.tmy[133] = -18422262;
        ek.tmy[134] = -451168857;
        ek.tmy[135] = 1516860320;
        ek.tmy[136] = -901567501;
        ek.tmy[137] = -2047087695;
        ek.tmy[138] = 1848114469;
        ek.tmy[139] = -1291448689;
        ek.tmy[140] = -1117156189;
        ek.tmy[141] = -1296503889;
        ek.tmy[142] = -67217647;
        ek.tmy[143] = 1056335547;
        ek.tmy[144] = 33036677;
        ek.tmy[145] = -1179739327;
        ek.tmy[146] = -1607970256;
        ek.tmy[147] = 1769285864;
        ek.tmy[148] = -1474614187;
        ek.tmy[149] = 670548900;
        ek.tmy[150] = 148995643;
        ek.tmy[151] = 206689915;
        ek.tmy[152] = -1001998969;
        ek.tmy[153] = -367222900;
        ek.tmy[154] = -1693420940;
        ek.tmy[155] = 1348286049;
        ek.tmy[156] = 1104699559;
        ek.tmy[157] = -685201845;
        ek.tmy[158] = 604671661;
        ek.tmy[159] = -1833553154;
        ek.tmy[160] = 1655580964;
        ek.tmy[161] = -1163428917;
        ek.tmy[162] = 1173739994;
        ek.tmy[163] = 695962683;
        ek.tmy[164] = 1325004902;
        ek.tmy[165] = -500726423;
        ek.tmy[166] = 1186301914;
        ek.tmy[167] = 682072308;
        ek.tmy[168] = 949376504;
        ek.tmy[169] = 2109775568;
        ek.tmy[170] = -780652084;
        ek.tmy[171] = -1933095823;
        ek.tmy[172] = -168342394;
        ek.tmy[173] = 1706732316;
        ek.tmy[174] = -1462395058;
        ek.tmy[175] = 1153752873;
        ek.tmy[176] = -64747148;
        ek.tmy[177] = -451778847;
        ek.tmy[178] = 676605821;
        ek.tmy[179] = -1439412529;
        ek.tmy[180] = 1903927292;
        ek.tmy[181] = 1549791412;
        ek.tmy[182] = 2029664881;
        ek.tmy[183] = -1191300143;
        ek.tmy[184] = -545303475;
        ek.tmy[185] = 1239167191;
        ek.tmy[186] = 1242521019;
        ek.tmy[187] = 1663053845;
        ek.tmy[188] = 1511978894;
        ek.tmy[189] = -277943292;
        ek.tmy[190] = -1605678195;
        ek.tmy[191] = -1338668839;
        ek.tmy[192] = 1849928557;
        ek.tmy[193] = -1385401415;
        ek.tmy[194] = 1207768621;
        ek.tmy[195] = 1803603881;
        ek.tmy[196] = 1524910186;
        ek.tmy[197] = 1329244248;
        ek.tmy[198] = 661547074;
        ek.tmy[199] = -1041907498;
    }

    private static /* synthetic */ int tmw(int n2) {
        return tmx[n2] ^ tmy[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_1309 updateTarget() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ek.be - ek.tmu("tyg", tmr(int ), (int)128)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ek.tmu("tyh", tmw(int ), (int)165)) break;
            v0 /* !! */  = (long)ek.tmu("tyi", tmw(int ), (int)166);
        }
        var5_1 = ek.c;
        v1 /* !! */  = ek.be;
        if (true) ** GOTO lbl11
        block65: while (true) {
            v1 /* !! */  = (long)(v2 - ek.tmu("tyj", tmr(int ), (int)129));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1610963620: {
                    break block65;
                }
                case -985025111: {
                    v2 = ek.tmu("tyk", tmr(int ), (int)130);
                    continue block65;
                }
                case 190535085: {
                    v2 = ek.tmu("tyl", tmr(int ), (int)131);
                    continue block65;
                }
            }
            break;
        }
        var4_2 /* !! */  = ek.b;
        v3 /* !! */  = ek.be;
        if (true) ** GOTO lbl25
        block66: while (true) {
            v3 /* !! */  = (long)(v4 - ek.tmu("tym", tmr(int ), (int)132));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1610963620: {
                    break block66;
                }
                case -1392027428: {
                    v4 = ek.tmu("tyn", tmr(int ), (int)133);
                    continue block66;
                }
                case -1219815059: {
                    v4 = ek.tmu("tyo", tmr(int ), (int)134);
                    continue block66;
                }
                case 870348299: {
                    v4 = ek.tmu("typ", tmr(int ), (int)135);
                    continue block66;
                }
            }
            break;
        }
        var3_3 = ek.a;
        if (var5_1) {
            throw null;
lbl40:
            // 5 sources

            return null;
        }
        if (var3_3 || var3_3) ** GOTO lbl40
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = ek.be;
                if (true) ** GOTO lbl50
                block68: while (true) {
                    v5 /* !! */  = (long)(v6 - ek.tmu("tyq", tmr(int ), (int)136));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1610963620: {
                            break block68;
                        }
                        case -475527978: {
                            v6 = ek.tmu("tyr", tmr(int ), (int)137);
                            continue block68;
                        }
                        case -222361487: {
                            v6 = ek.tmu("tys", tmr(int ), (int)138);
                            continue block68;
                        }
                        case 527741091: {
                            v6 = ek.tmu("tyt", tmr(int ), (int)139);
                            continue block68;
                        }
                    }
                    break;
                }
                v7 /* !! */  = ek.be;
                if (true) ** GOTO lbl66
                block69: while (true) {
                    v7 /* !! */  = (long)(ek.tmu("tyv", tmr(int ), (int)141) - ek.tmu("tyu", tmr(int ), (int)140));
lbl66:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1709706360: {
                            continue block69;
                        }
                        case -1610963620: {
                            break block69;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = ek.be - ek.tmu("tyw", tmr(int ), (int)142)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ek.tmu("tyx", tmw(int ), (int)167)) break;
                    v8 /* !! */  = (long)ek.tmu("tyy", tmw(int ), (int)168);
                }
                v9 = this.targetType.getSelected();
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = ek.be - ek.tmu("tyz", tmr(int ), (int)143)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ek.tmu("tza", tmw(int ), (int)169)) break;
                    v10 /* !! */  = (long)ek.tmu("tzb", tmw(int ), (int)170);
                }
                var1_4 = new ik$EntityFilter(v9);
                if (var3_3 || var3_3) ** GOTO lbl40
                var2_5 = 1.0f;
                if (var3_3 || var3_3) ** GOTO lbl40
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = ek.be - ek.tmu("tzc", tmr(int ), (int)144)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ek.tmu("tzd", tmw(int ), (int)171)) break;
                    v11 /* !! */  = (long)ek.tmu("tze", tmw(int ), (int)172);
                }
                v12 /* !! */  = ek.be;
                if (true) ** GOTO lbl95
                block73: while (true) {
                    v12 /* !! */  = (long)(v13 - ek.tmu("tzf", tmr(int ), (int)145));
lbl95:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1610963620: {
                            break block73;
                        }
                        case -1202696400: {
                            v13 = ek.tmu("tzg", tmr(int ), (int)146);
                            continue block73;
                        }
                        case 1003363785: {
                            v13 = ek.tmu("tzh", tmr(int ), (int)147);
                            continue block73;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = ek.be - ek.tmu("tzi", tmr(int ), (int)148)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == ek.tmu("tzj", tmw(int ), (int)173)) break;
                    v14 /* !! */  = (long)ek.tmu("tzk", tmw(int ), (int)174);
                }
                v15 = ek.mc.field_1687;
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_5 = ek.be - ek.tmu("tzl", tmr(int ), (int)149)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == ek.tmu("tzm", tmw(int ), (int)175)) break;
                    v16 /* !! */  = (long)ek.tmu("tzn", tmw(int ), (int)176);
                }
                v17 = v15.method_18112();
                v18 /* !! */  = ek.be;
                if (true) ** GOTO lbl120
                block76: while (true) {
                    v18 /* !! */  = (long)(v19 - ek.tmu("tzo", tmr(int ), (int)150));
lbl120:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1610963620: {
                            break block76;
                        }
                        case -682187476: {
                            v19 = ek.tmu("tzp", tmr(int ), (int)151);
                            continue block76;
                        }
                        case 830211610: {
                            v19 = ek.tmu("tzq", tmr(int ), (int)152);
                            continue block76;
                        }
                    }
                    break;
                }
                v20 = this.finalDistance();
                v21 /* !! */  = ek.be;
                if (true) ** GOTO lbl134
                block77: while (true) {
                    v21 /* !! */  = (long)(v22 - ek.tmu("tzr", tmr(int ), (int)153));
lbl134:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1610963620: {
                            break block77;
                        }
                        case -533010707: {
                            v22 = ek.tmu("tzs", tmr(int ), (int)154);
                            continue block77;
                        }
                        case 524082341: {
                            v22 = ek.tmu("tzt", tmr(int ), (int)155);
                            continue block77;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_6 = ek.be - ek.tmu("tzu", tmr(int ), (int)156)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == ek.tmu("tzv", tmw(int ), (int)177)) break;
                    v23 /* !! */  = (long)ek.tmu("tzw", tmw(int ), (int)178);
                }
                v24 = this.options.isSelected("\u0411\u0438\u0442\u044c \u0447\u0435\u0440\u0435\u0437 \u0441\u0442\u0435\u043d\u044b");
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_7 = ek.be - ek.tmu("tzx", tmr(int ), (int)157)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == ek.tmu("tzy", tmw(int ), (int)179)) break;
                    v25 /* !! */  = (long)ek.tmu("tzz", tmw(int ), (int)180);
                }
                this.targetSelector.searchTargets(v17, v20, var2_5, v24);
                if (var3_3 || var3_3) ** GOTO lbl40
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_8 = ek.be - ek.tmu("uaa", tmr(int ), (int)158)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == ek.tmu("uab", tmw(int ), (int)181)) break;
                    v26 /* !! */  = (long)ek.tmu("uac", tmw(int ), (int)182);
                }
                v27 = var1_4;
                v28 /* !! */  = ek.be;
                if (true) ** GOTO lbl166
                block81: while (true) {
                    v28 /* !! */  = (long)(v29 - ek.tmu("uad", tmr(int ), (int)159));
lbl166:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -1610963620: {
                            break block81;
                        }
                        case 130659563: {
                            v29 = ek.tmu("uae", tmr(int ), (int)160);
                            continue block81;
                        }
                        case 938503547: {
                            v29 = ek.tmu("uaf", tmr(int ), (int)161);
                            continue block81;
                        }
                    }
                    break;
                }
                Objects.requireNonNull(v27);
                v30 /* !! */  = ek.be;
                if (true) ** GOTO lbl181
                block82: while (true) {
                    v30 /* !! */  = (long)(v31 - ek.tmu("uag", tmr(int ), (int)162));
lbl181:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case -1610963620: {
                            break block82;
                        }
                        case -100417354: {
                            v31 = ek.tmu("uah", tmr(int ), (int)163);
                            continue block82;
                        }
                        case 2067918751: {
                            v31 = ek.tmu("uai", tmr(int ), (int)164);
                            continue block82;
                        }
                    }
                    break;
                }
                v32 = (Predicate<class_1309>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, isValid(net.minecraft.class_1309 ), (Lnet/minecraft/class_1309;)Z)((ik$EntityFilter)v27);
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_9 = ek.be - ek.tmu("uaj", tmr(int ), (int)165)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == ek.tmu("uak", tmw(int ), (int)183)) break;
                    v33 /* !! */  = (long)ek.tmu("ual", tmw(int ), (int)184);
                }
                this.targetSelector.validateTarget(v32);
                if (var3_3 || var3_3) ** continue;
                while (true) {
                    if ((v34 /* !! */  = (cfr_temp_10 = ek.be - ek.tmu("uam", tmr(int ), (int)166)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v34 /* !! */  == ek.tmu("uan", tmw(int ), (int)185)) break;
                    v34 /* !! */  = (long)ek.tmu("uao", tmw(int ), (int)186);
                }
                v35 /* !! */  = ek.be;
                if (true) ** GOTO lbl207
                block85: while (true) {
                    v35 /* !! */  = (long)(ek.tmu("uaq", tmr(int ), (int)168) - ek.tmu("uap", tmr(int ), (int)167));
lbl207:
                    // 2 sources

                    switch ((int)v35 /* !! */ ) {
                        case -1610963620: {
                            break block85;
                        }
                        case 253838539: {
                            continue block85;
                        }
                    }
                    break;
                }
                return this.targetSelector.getCurrentTarget();
            }
            case 0: {
                var4_2 /* !! */  = (int)ek.tmu("uar", tmw(int ), (int)187);
                if (var5_1) {
                    throw null;
                }
            }
            case 1: {
                var4_2 /* !! */  = (int)ek.tmu("uas", tmw(int ), (int)188);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl228
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)ek.tmu("uat", tmw(int ), (int)189);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl242
                    break;
                }
            }
lbl228:
            // 3 sources

            case 3: {
                var4_2 /* !! */  = (int)ek.tmu("uau", tmw(int ), (int)190);
                if (!var5_1) break;
                throw null;
            }
            case 4: {
                var4_2 /* !! */  = (int)ek.tmu("uav", tmw(int ), (int)191);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl247
            }
lbl237:
            // 2 sources

            case 5: {
                var4_2 /* !! */  = (int)ek.tmu("uaw", tmw(int ), (int)192);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl242:
            // 2 sources

            case 6: {
                do {
                    var4_2 /* !! */  = (int)ek.tmu("uax", tmw(int ), (int)193);
                } while (!var5_1);
                throw null;
            }
lbl247:
            // 2 sources

            case 7: {
                var4_2 /* !! */  = (int)ek.tmu("uay", tmw(int ), (int)194);
                if (!var5_1) break;
                throw null;
            }
lbl251:
            // 2 sources

            case 8: {
                var4_2 /* !! */  = (int)ek.tmu("uaz", tmw(int ), (int)195);
                if (!var5_1) ** GOTO lbl237
                throw null;
            }
lbl255:
            // 2 sources

            case 9: {
                var4_2 /* !! */  = (int)ek.tmu("uba", tmw(int ), (int)196);
                if (!var5_1) ** GOTO lbl251
                throw null;
            }
            case 10: {
                var4_2 /* !! */  = (int)ek.tmu("ubb", tmw(int ), (int)197);
                if (!var5_1) ** GOTO lbl228
                throw null;
            }
            case 11: 
        }
        var4_2 /* !! */  = (int)ek.tmu("ubc", tmw(int ), (int)198);
        ** while (!var5_1)
lbl266:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ujy() {
        ek.tmy[200] = -115535841;
        ek.tmy[201] = 1647684721;
        ek.tmy[202] = -2014257603;
        ek.tmy[203] = -790638739;
        ek.tmy[204] = 849269983;
        ek.tmy[205] = 840556971;
        ek.tmy[206] = 192292975;
        ek.tmy[207] = -424278781;
        ek.tmy[208] = -183146320;
        ek.tmy[209] = 1544166712;
        ek.tmy[210] = 416220458;
        ek.tmy[211] = 569380304;
        ek.tmy[212] = 1780553363;
        ek.tmy[213] = -2045682477;
        ek.tmy[214] = -1674844936;
        ek.tmy[215] = 1303560428;
        ek.tmy[216] = -747590102;
        ek.tmy[217] = -39965483;
        ek.tmy[218] = 540739124;
        ek.tmy[219] = 1174350207;
        ek.tmy[220] = -1993445010;
        ek.tmy[221] = 1386312026;
        ek.tmy[222] = -372400000;
        ek.tmy[223] = 1543331051;
        ek.tmy[224] = 911848347;
        ek.tmy[225] = -1925367986;
        ek.tmy[226] = 708389702;
        ek.tmy[227] = 884402805;
        ek.tmy[228] = -946464772;
        ek.tmy[229] = -329880744;
        ek.tmy[230] = 920049273;
        ek.tmy[231] = -674194243;
        ek.tmy[232] = -1293502606;
        ek.tmy[233] = -1522989305;
        ek.tmy[234] = 388459151;
        ek.tmy[235] = 586507711;
        ek.tmy[236] = -545904171;
        ek.tmy[237] = -1400831812;
        ek.tmy[238] = -465356175;
        ek.tmy[239] = -333726850;
        ek.tmy[240] = -2031143033;
        ek.tmy[241] = -945255216;
        ek.tmy[242] = -1862342694;
        ek.tmy[243] = 1622100775;
        ek.tmy[244] = 871512966;
        ek.tmy[245] = -2009563609;
        ek.tmy[246] = -1836001619;
        ek.tmy[247] = -751438661;
        ek.tmy[248] = 781888693;
        ek.tmy[249] = 2108113683;
        ek.tmy[250] = -1021534903;
        ek.tmy[251] = 172806333;
        ek.tmy[252] = -743202570;
        ek.tmy[253] = 1801385295;
        ek.tmy[254] = 1117948642;
        ek.tmy[255] = -1256233835;
        ek.tmy[256] = -571025986;
        ek.tmy[257] = 67914039;
        ek.tmy[258] = 1230083922;
        ek.tmy[259] = 1509492198;
        ek.tmy[260] = -25518106;
        ek.tmy[261] = 1993820260;
        ek.tmy[262] = 449546198;
        ek.tmy[263] = 2096374740;
        ek.tmy[264] = 1796348207;
        ek.tmy[265] = 1799437495;
        ek.tmy[266] = -95895281;
        ek.tmy[267] = 553601099;
        ek.tmy[268] = 1127494869;
        ek.tmy[269] = -800743429;
        ek.tmy[270] = 2048230856;
        ek.tmy[271] = 1196477851;
        ek.tmy[272] = -1322004863;
        ek.tmy[273] = -2093819489;
        ek.tmy[274] = 552025737;
        ek.tmy[275] = 450062810;
        ek.tmy[276] = -1198337183;
        ek.tmy[277] = 870528613;
        ek.tmy[278] = -1078561248;
        ek.tmy[279] = -1382649204;
        ek.tmy[280] = -1004142619;
        ek.tmy[281] = 594757712;
        ek.tmy[282] = 655967869;
        ek.tmy[283] = 148459674;
        ek.tmy[284] = -1991890666;
        ek.tmy[285] = -1636793376;
        ek.tmy[286] = 2140951891;
        ek.tmy[287] = 963343738;
        ek.tmy[288] = -994738500;
        ek.tmy[289] = -248934326;
        ek.tmy[290] = 1962491500;
        ek.tmy[291] = 1601014710;
        ek.tmy[292] = 611454239;
        ek.tmy[293] = 222813284;
        ek.tmy[294] = 1306498097;
        ek.tmy[295] = 102650953;
        ek.tmy[296] = -959462601;
        ek.tmy[297] = 1365242672;
        ek.tmy[298] = 586261475;
        ek.tmy[299] = 814539699;
    }
}

