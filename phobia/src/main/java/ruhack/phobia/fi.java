/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10185
 *  net.minecraft.class_1268
 *  net.minecraft.class_1713
 *  net.minecraft.class_1802
 *  net.minecraft.class_2797
 *  net.minecraft.class_465
 *  net.minecraft.class_7439
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import net.minecraft.class_10185;
import net.minecraft.class_1268;
import net.minecraft.class_1713;
import net.minecraft.class_1802;
import net.minecraft.class_2797;
import net.minecraft.class_465;
import net.minecraft.class_7439;
import ruhack.phobia.aw;
import ruhack.phobia.cj;
import ruhack.phobia.cn;
import ruhack.phobia.cr;
import ruhack.phobia.cr$Type;
import ruhack.phobia.df;
import ruhack.phobia.dj;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.ex;
import ruhack.phobia.fi$ActionPhase;
import ruhack.phobia.jx;
import ruhack.phobia.ka;
import ruhack.phobia.kb;
import ruhack.phobia.kf;
import ruhack.phobia.nv;
import ruhack.phobia.nx;
import ruhack.phobia.pp;

public final class fi
extends ds {
    private final kb closeMenu;
    private final nx movement;
    private int temporaryHotbarSlot;
    private final ka throwBall;
    private fi$ActionPhase phase;
    public static final long pm = -3516558555516588424L;
    private final kf swapMode;
    private long actionAt;
    private static final List<Pattern> BANNED_WORDS;
    public static final boolean c;
    private int stopTicks;
    private static long[] idug;
    private boolean antiFlightSwapApplied;
    private long fixAt;
    public static final int b;
    private int targetSlot;
    private static long[] iduh;
    private int antiFlightScreenSlot;
    private int previousSlot;
    private final ka trap;
    private boolean fromHotbar;
    private final kb chatFilter;
    private final kb fixAfterPvp;
    private static int[] iduo;
    public static final boolean a;
    private static int[] idup;
    private boolean antiFlightSwapped;
    private long restoreAt;
    private final ka antiFlight;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static Pattern pattern(String var0) {
        v0 /* !! */  = fi.pm;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(v1 - fi.idui("ihkd", iduf(int ), (int)359));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -956077503: {
                    v1 = fi.idui("ihke", iduf(int ), (int)360);
                    continue block14;
                }
                case -156347643: {
                    v1 = fi.idui("ihkf", iduf(int ), (int)361);
                    continue block14;
                }
                case 311602808: {
                    break block14;
                }
            }
            break;
        }
        var3_1 = fi.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fi.pm - fi.idui("ihkg", iduf(int ), (int)362)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fi.idui("ihkh", idun(int ), (int)731)) break;
            v2 /* !! */  = (long)fi.idui("ihki", idun(int ), (int)732);
        }
        var2_2 = fi.b;
        v3 /* !! */  = fi.pm;
        if (true) ** GOTO lbl25
        block16: while (true) {
            v3 /* !! */  = (long)(fi.idui("ihkk", iduf(int ), (int)364) - fi.idui("ihkj", iduf(int ), (int)363));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 285820888: {
                    continue block16;
                }
                case 311602808: {
                    break block16;
                }
            }
            break;
        }
        var1_3 = fi.a;
        if (var3_1) {
            throw null;
lbl33:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl36:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = fi.pm - fi.idui("ihkl", iduf(int ), (int)365)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == fi.idui("ihkm", idun(int ), (int)733)) break;
            v4 /* !! */  = (long)fi.idui("ihkn", idun(int ), (int)734);
        }
        v5 = "(?:^|[^a-z\u0430-\u044f\u0451])(?:" + var0 + ")(?:$|[^a-z\u0430-\u044f\u0451])";
        v6 = fi.idui("ihko", idun(int ), (int)735);
        v7 /* !! */  = fi.pm;
        if (true) ** GOTO lbl47
        block19: while (true) {
            v7 /* !! */  = (long)(v8 - fi.idui("ihkp", iduf(int ), (int)366));
lbl47:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -2031589872: {
                    v8 = fi.idui("ihkq", iduf(int ), (int)367);
                    continue block19;
                }
                case 311602808: {
                    break block19;
                }
                case 850658676: {
                    v8 = fi.idui("ihkr", iduf(int ), (int)368);
                    continue block19;
                }
            }
            break;
        }
        return Pattern.compile(v5, (int)v6);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void usePreparedTrap() {
        block98: {
            v0 /* !! */  = fi.pm;
            if (true) ** GOTO lbl5
            block60: while (true) {
                v0 /* !! */  = (long)(fi.idui("igqw", iduf(int ), (int)168) - fi.idui("igqv", iduf(int ), (int)167));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1491390036: {
                        continue block60;
                    }
                    case 311602808: {
                        break block60;
                    }
                }
                break;
            }
            var3_1 = fi.c;
            v1 /* !! */  = fi.pm;
            if (true) ** GOTO lbl15
            block61: while (true) {
                v1 /* !! */  = (long)(fi.idui("igqy", iduf(int ), (int)170) - fi.idui("igqx", iduf(int ), (int)169));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -187035172: {
                        continue block61;
                    }
                    case 311602808: {
                        break block61;
                    }
                }
                break;
            }
            var2_2 /* !! */  = fi.b;
            v2 /* !! */  = fi.pm;
            if (true) ** GOTO lbl25
            block62: while (true) {
                v2 /* !! */  = (long)(v3 - fi.idui("igqz", iduf(int ), (int)171));
lbl25:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case 311602808: {
                        break block62;
                    }
                    case 630708213: {
                        v3 = fi.idui("igra", iduf(int ), (int)172);
                        continue block62;
                    }
                    case 1192331876: {
                        v3 = fi.idui("igrb", iduf(int ), (int)173);
                        continue block62;
                    }
                    case 1197853056: {
                        v3 = fi.idui("igrc", iduf(int ), (int)174);
                        continue block62;
                    }
                }
                break;
            }
            var1_3 = fi.a;
            if (var3_1) {
                throw null;
lbl40:
                // 9 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl40
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_0 = fi.pm - fi.idui("igrd", iduf(int ), (int)175)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == fi.idui("igre", idun(int ), (int)421)) break;
                v4 /* !! */  = (long)fi.idui("igrf", idun(int ), (int)422);
            }
            if (this.fromHotbar) break block98;
            if (var1_3 || var1_3) ** GOTO lbl40
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = fi.pm - fi.idui("igrg", iduf(int ), (int)176)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == fi.idui("igrh", idun(int ), (int)423)) break;
                v5 /* !! */  = (long)fi.idui("igri", idun(int ), (int)424);
            }
            v6 /* !! */  = fi.pm;
            if (true) ** GOTO lbl59
            block66: while (true) {
                v6 /* !! */  = (long)(v7 - fi.idui("igrj", iduf(int ), (int)177));
lbl59:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -705259125: {
                        v7 = fi.idui("igrk", iduf(int ), (int)178);
                        continue block66;
                    }
                    case 311602808: {
                        break block66;
                    }
                    case 1777454908: {
                        v7 = fi.idui("igrl", iduf(int ), (int)179);
                        continue block66;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_2 = fi.pm - fi.idui("igrm", iduf(int ), (int)180)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == fi.idui("igrn", idun(int ), (int)425)) break;
                v8 /* !! */  = (long)fi.idui("igro", idun(int ), (int)426);
            }
            nv.swapHotbar(this.targetSlot, this.temporaryHotbarSlot);
            if (var1_3) ** GOTO lbl40
        }
        if (var1_3 || var1_3) ** GOTO lbl40
        v9 /* !! */  = fi.pm;
        if (true) ** GOTO lbl81
        block68: while (true) {
            v9 /* !! */  = (long)(fi.idui("igrq", iduf(int ), (int)182) - fi.idui("igrp", iduf(int ), (int)181));
lbl81:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case 311602808: {
                    break block68;
                }
                case 1679257936: {
                    continue block68;
                }
            }
            break;
        }
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_3 = fi.pm - fi.idui("igrr", iduf(int ), (int)183)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == fi.idui("igrs", idun(int ), (int)427)) break;
            v10 /* !! */  = (long)fi.idui("igrt", idun(int ), (int)428);
        }
        nv.selectSlotSilent(this.temporaryHotbarSlot);
        if (var1_3 || var1_3) ** GOTO lbl40
        v11 /* !! */  = fi.pm;
        if (true) ** GOTO lbl97
        block70: while (true) {
            v11 /* !! */  = (long)(fi.idui("igrv", iduf(int ), (int)185) - fi.idui("igru", iduf(int ), (int)184));
lbl97:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case 152651102: {
                    continue block70;
                }
                case 311602808: {
                    break block70;
                }
            }
            break;
        }
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_4 = fi.pm - fi.idui("igrw", iduf(int ), (int)186)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == fi.idui("igrx", idun(int ), (int)429)) break;
            v12 /* !! */  = (long)fi.idui("igry", idun(int ), (int)430);
        }
        nv.sendUsePacket(class_1268.field_5808);
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl40
                v13 /* !! */  = fi.pm;
                if (true) ** GOTO lbl116
                block72: while (true) {
                    v13 /* !! */  = (long)(v14 - fi.idui("igrz", iduf(int ), (int)187));
lbl116:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1515238216: {
                            v14 = fi.idui("igsa", iduf(int ), (int)188);
                            continue block72;
                        }
                        case -786183660: {
                            v14 = fi.idui("igsb", iduf(int ), (int)189);
                            continue block72;
                        }
                        case -368250353: {
                            v14 = fi.idui("igsc", iduf(int ), (int)190);
                            continue block72;
                        }
                        case 311602808: {
                            break block72;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = fi.pm - fi.idui("igsd", iduf(int ), (int)191)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == fi.idui("igse", idun(int ), (int)431)) break;
                    v15 /* !! */  = (long)fi.idui("igsf", idun(int ), (int)432);
                }
                v16 = fi.mc.field_1724;
                v17 /* !! */  = fi.pm;
                if (true) ** GOTO lbl138
                block74: while (true) {
                    v17 /* !! */  = (long)(v18 - fi.idui("igsg", iduf(int ), (int)192));
lbl138:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -513100365: {
                            v18 = fi.idui("igsh", iduf(int ), (int)193);
                            continue block74;
                        }
                        case 311602808: {
                            break block74;
                        }
                        case 1027106719: {
                            v18 = fi.idui("igsi", iduf(int ), (int)194);
                            continue block74;
                        }
                        case 1563896176: {
                            v18 = fi.idui("igsj", iduf(int ), (int)195);
                            continue block74;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_6 = fi.pm - fi.idui("igsk", iduf(int ), (int)196)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == fi.idui("igsl", idun(int ), (int)433)) break;
                    v19 /* !! */  = (long)fi.idui("igsm", idun(int ), (int)434);
                }
                v16.method_6104(class_1268.field_5808);
                if (var1_3 || var1_3) ** GOTO lbl40
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_7 = fi.pm - fi.idui("igsn", iduf(int ), (int)197)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == fi.idui("igso", idun(int ), (int)435)) break;
                    v20 /* !! */  = (long)fi.idui("igsp", idun(int ), (int)436);
                }
                v21 = System.currentTimeMillis() + fi.idui("igsq", iduf(int ), (int)198);
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_8 = fi.pm - fi.idui("igsr", iduf(int ), (int)199)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == fi.idui("igss", idun(int ), (int)437)) break;
                    v22 /* !! */  = (long)fi.idui("igst", idun(int ), (int)438);
                }
                this.restoreAt = v21;
                if (var1_3 || var1_3) ** GOTO lbl40
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_9 = fi.pm - fi.idui("igsu", iduf(int ), (int)200)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == fi.idui("igsv", idun(int ), (int)439)) break;
                    v23 /* !! */  = (long)fi.idui("igsw", idun(int ), (int)440);
                }
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_10 = fi.pm - fi.idui("igsx", iduf(int ), (int)201)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == fi.idui("igsy", idun(int ), (int)441)) break;
                    v24 /* !! */  = (long)fi.idui("igsz", idun(int ), (int)442);
                }
                this.phase = fi$ActionPhase.WAIT_RESTORE;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl184:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)fi.idui("igta", idun(int ), (int)443);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl225
            }
lbl189:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)fi.idui("igtb", idun(int ), (int)444);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)fi.idui("igtc", idun(int ), (int)445);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl225
            }
lbl199:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)fi.idui("igtd", idun(int ), (int)446);
                if (var3_1) {
                    throw null;
                }
            }
lbl203:
            // 4 sources

            case 4: {
                var2_2 /* !! */  = (int)fi.idui("igte", idun(int ), (int)447);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl208:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)fi.idui("igtf", idun(int ), (int)448);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl217
            }
            case 6: {
                var2_2 /* !! */  = (int)fi.idui("igtg", idun(int ), (int)449);
                if (!var3_1) ** GOTO lbl184
                throw null;
            }
lbl217:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)fi.idui("igth", idun(int ), (int)450);
                if (!var3_1) ** GOTO lbl184
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)fi.idui("igti", idun(int ), (int)451);
                if (!var3_1) ** GOTO lbl208
                throw null;
            }
lbl225:
            // 4 sources

            case 9: {
                var2_2 /* !! */  = (int)fi.idui("igtj", idun(int ), (int)452);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl256
            }
            case 10: {
                var2_2 /* !! */  = (int)fi.idui("igtk", idun(int ), (int)453);
                if (!var3_1) ** GOTO lbl199
                throw null;
            }
lbl234:
            // 3 sources

            case 11: {
                var2_2 /* !! */  = (int)fi.idui("igtl", idun(int ), (int)454);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl244
            }
            case 12: {
                var2_2 /* !! */  = (int)fi.idui("igtm", idun(int ), (int)455);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl244:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)fi.idui("igtn", idun(int ), (int)456);
                if (!var3_1) ** GOTO lbl208
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)fi.idui("igto", idun(int ), (int)457);
                if (!var3_1) ** GOTO lbl234
                throw null;
            }
lbl252:
            // 2 sources

            case 15: {
                var2_2 /* !! */  = (int)fi.idui("igtp", idun(int ), (int)458);
                if (!var3_1) ** GOTO lbl189
                throw null;
            }
lbl256:
            // 2 sources

            case 16: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fi.idui("igtq", idun(int ), (int)459);
                    if (!var3_1) ** GOTO lbl203
                    throw null;
                }
            }
            case 17: {
                var2_2 /* !! */  = (int)fi.idui("igtr", idun(int ), (int)460);
                if (!var3_1) ** GOTO lbl225
                throw null;
            }
            case 18: 
        }
        var2_2 /* !! */  = (int)fi.idui("igts", idun(int ), (int)461);
        ** while (!var3_1)
lbl268:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onKey(cn var1_1) {
        block114: {
            block113: {
                var4_2 = fi.c;
                var3_3 /* !! */  = fi.b;
                var2_4 = fi.a;
                if (var4_2) {
                    throw null;
lbl6:
                    // 29 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl6
                if (fi.mc.field_1724 == null) break block113;
                if (var2_4) ** GOTO lbl6
                if (fi.mc.field_1755 == null) break block114;
                if (var2_4) ** GOTO lbl6
            }
            if (var2_4 || var2_4) ** GOTO lbl6
            return;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl6
                if (!var1_1.isBindDown(this.throwBall)) ** GOTO lbl26
                if (var2_4 || var2_4) ** GOTO lbl6
                fi.mc.field_1724.field_3944.method_45729("\u041a\u0438\u0434\u0430\u0439 \u0448\u0430\u0440 \u043e\u0442\u043f\u0443\u0449\u0443 \u044f \u0442\u0435\u0431\u0435 \u043e\u0431\u0435\u0449\u0430\u044e");
                if (var2_4 || var2_4) ** GOTO lbl6
                return;
lbl26:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                if (!var1_1.isBindReleased(this.antiFlight)) ** GOTO lbl35
                if (var2_4 || var2_4) ** GOTO lbl6
                if (this.phase != fi$ActionPhase.IDLE) ** GOTO lbl33
                if (var2_4 || var2_4) ** GOTO lbl6
                this.beginAntiFlight();
                if (var2_4) ** GOTO lbl6
lbl33:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                return;
lbl35:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                if (!var1_1.isBindReleased(this.trap)) ** GOTO lbl40
                if (var2_4) ** GOTO lbl6
                if (this.phase == fi$ActionPhase.IDLE) ** GOTO lbl42
                if (var2_4) ** GOTO lbl6
lbl40:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                return;
lbl42:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                if (this.prepareTrap()) ** GOTO lbl48
                if (var2_4 || var2_4) ** GOTO lbl6
                pp.brandmessage("\u041b\u043e\u0432\u0443\u0448\u043a\u0438 \u043d\u0435\u0442 \u0432 \u0438\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u0435");
                if (var2_4 || var2_4) ** GOTO lbl6
                return;
lbl48:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                if (!this.swapMode.isSelected("ReallyWorld")) ** GOTO lbl58
                if (var2_4 || var2_4) ** GOTO lbl6
                this.actionAt = System.currentTimeMillis() + fi.idui("idwu", iduf(int ), (int)23);
                if (var2_4 || var2_4) ** GOTO lbl6
                this.phase = fi$ActionPhase.WAIT_USE_HALF;
                if (var2_4) ** GOTO lbl6
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl69
lbl58:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                if (!this.swapMode.isSelected("New")) ** GOTO lbl66
                if (var2_4 || var2_4) ** GOTO lbl6
                this.beginStop(fi$ActionPhase.WAIT_USE_STOP);
                if (var2_4) ** GOTO lbl6
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl69
lbl66:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                this.usePreparedTrap();
                if (var2_4) ** GOTO lbl6
lbl69:
                // 3 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl72:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)fi.idui("idwv", idun(int ), (int)37);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl312
            }
lbl77:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)fi.idui("idww", idun(int ), (int)38);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 2: {
                var3_3 /* !! */  = (int)fi.idui("idwx", idun(int ), (int)39);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl87:
            // 3 sources

            case 3: {
                var3_3 /* !! */  = (int)fi.idui("idwy", idun(int ), (int)40);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl284
            }
lbl92:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)fi.idui("idwz", idun(int ), (int)41);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl217
            }
            case 5: {
                var3_3 /* !! */  = (int)fi.idui("idxa", idun(int ), (int)42);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl102:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)fi.idui("iefl", idun(int ), (int)43);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl288
            }
lbl107:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)fi.idui("iefm", idun(int ), (int)44);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl112:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)fi.idui("iefn", idun(int ), (int)45);
                if (!var4_2) ** GOTO lbl87
                throw null;
            }
lbl116:
            // 3 sources

            case 9: {
                var3_3 /* !! */  = (int)fi.idui("iefo", idun(int ), (int)46);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl121:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)fi.idui("iefp", idun(int ), (int)47);
                if (!var4_2) ** GOTO lbl116
                throw null;
            }
            case 11: {
                var3_3 /* !! */  = (int)fi.idui("iefq", idun(int ), (int)48);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl288
            }
            case 12: {
                var3_3 /* !! */  = (int)fi.idui("iefr", idun(int ), (int)49);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 13: {
                var3_3 /* !! */  = (int)fi.idui("iefs", idun(int ), (int)50);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 14: {
                var3_3 /* !! */  = (int)fi.idui("ieft", idun(int ), (int)51);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl279
            }
            case 15: {
                var3_3 /* !! */  = (int)fi.idui("iefu", idun(int ), (int)52);
                if (!var4_2) ** GOTO lbl102
                throw null;
            }
            case 16: {
                var3_3 /* !! */  = (int)fi.idui("iefv", idun(int ), (int)53);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl308
            }
lbl154:
            // 3 sources

            case 17: {
                var3_3 /* !! */  = (int)fi.idui("iefw", idun(int ), (int)54);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl296
            }
            case 18: {
                do {
                    var3_3 /* !! */  = (int)fi.idui("iefx", idun(int ), (int)55);
                } while (!var4_2);
                throw null;
            }
            case 19: {
                var3_3 /* !! */  = (int)fi.idui("iefy", idun(int ), (int)56);
                if (!var4_2) ** GOTO lbl116
                throw null;
            }
            case 20: {
                var3_3 /* !! */  = (int)fi.idui("iefz", idun(int ), (int)57);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl173:
            // 3 sources

            case 21: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)fi.idui("iega", idun(int ), (int)58);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl202
                    break;
                }
            }
lbl179:
            // 2 sources

            case 22: {
                var3_3 /* !! */  = (int)fi.idui("iegb", idun(int ), (int)59);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl239
            }
            case 23: {
                var3_3 /* !! */  = (int)fi.idui("iegc", idun(int ), (int)60);
                if (!var4_2) ** GOTO lbl154
                throw null;
            }
            case 24: {
                var3_3 /* !! */  = (int)fi.idui("iegd", idun(int ), (int)61);
                if (!var4_2) ** GOTO lbl72
                throw null;
            }
            case 25: {
                var3_3 /* !! */  = (int)fi.idui("iege", idun(int ), (int)62);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl279
            }
lbl197:
            // 5 sources

            case 26: {
                var3_3 /* !! */  = (int)fi.idui("iegf", idun(int ), (int)63);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl320
            }
lbl202:
            // 3 sources

            case 27: {
                var3_3 /* !! */  = (int)fi.idui("iegg", idun(int ), (int)64);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl207:
            // 2 sources

            case 28: {
                var3_3 /* !! */  = (int)fi.idui("iegh", idun(int ), (int)65);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl231
            }
            case 29: {
                var3_3 /* !! */  = (int)fi.idui("iegi", idun(int ), (int)66);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl270
            }
lbl217:
            // 2 sources

            case 30: {
                var3_3 /* !! */  = (int)fi.idui("iegj", idun(int ), (int)67);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl284
            }
lbl222:
            // 3 sources

            case 31: {
                var3_3 /* !! */  = (int)fi.idui("iegk", idun(int ), (int)68);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl231
            }
            case 32: {
                var3_3 /* !! */  = (int)fi.idui("iegl", idun(int ), (int)69);
                if (!var4_2) ** GOTO lbl207
                throw null;
            }
lbl231:
            // 3 sources

            case 33: {
                var3_3 /* !! */  = (int)fi.idui("iegm", idun(int ), (int)70);
                if (!var4_2) ** GOTO lbl173
                throw null;
            }
            case 34: {
                var3_3 /* !! */  = (int)fi.idui("iegn", idun(int ), (int)71);
                if (!var4_2) ** GOTO lbl92
                throw null;
            }
lbl239:
            // 3 sources

            case 35: {
                var3_3 /* !! */  = (int)fi.idui("iego", idun(int ), (int)72);
                if (!var4_2) ** GOTO lbl222
                throw null;
            }
            case 36: {
                var3_3 /* !! */  = (int)fi.idui("iegp", idun(int ), (int)73);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl284
            }
            case 37: {
                var3_3 /* !! */  = (int)fi.idui("iegq", idun(int ), (int)74);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl292
            }
lbl253:
            // 3 sources

            case 38: {
                var3_3 /* !! */  = (int)fi.idui("iegr", idun(int ), (int)75);
                if (!var4_2) ** GOTO lbl197
                throw null;
            }
lbl257:
            // 3 sources

            case 39: {
                var3_3 /* !! */  = (int)fi.idui("iegs", idun(int ), (int)76);
                if (!var4_2) ** GOTO lbl253
                throw null;
            }
lbl261:
            // 2 sources

            case 40: {
                var3_3 /* !! */  = (int)fi.idui("iegt", idun(int ), (int)77);
                if (!var4_2) ** GOTO lbl197
                throw null;
            }
            case 41: {
                var3_3 /* !! */  = (int)fi.idui("iegu", idun(int ), (int)78);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl316
            }
lbl270:
            // 2 sources

            case 42: {
                var3_3 /* !! */  = (int)fi.idui("iegv", idun(int ), (int)79);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl308
            }
            case 43: {
                var3_3 /* !! */  = (int)fi.idui("iegw", idun(int ), (int)80);
                if (!var4_2) ** GOTO lbl72
                throw null;
            }
lbl279:
            // 3 sources

            case 44: {
                var3_3 /* !! */  = (int)fi.idui("iegx", idun(int ), (int)81);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl304
            }
lbl284:
            // 4 sources

            case 45: {
                var3_3 /* !! */  = (int)fi.idui("iegy", idun(int ), (int)82);
                if (!var4_2) ** GOTO lbl121
                throw null;
            }
lbl288:
            // 3 sources

            case 46: {
                var3_3 /* !! */  = (int)fi.idui("iegz", idun(int ), (int)83);
                if (!var4_2) ** GOTO lbl87
                throw null;
            }
lbl292:
            // 2 sources

            case 47: {
                var3_3 /* !! */  = (int)fi.idui("ieha", idun(int ), (int)84);
                if (!var4_2) ** GOTO lbl257
                throw null;
            }
lbl296:
            // 4 sources

            case 48: {
                var3_3 /* !! */  = (int)fi.idui("iehb", idun(int ), (int)85);
                if (!var4_2) ** GOTO lbl77
                throw null;
            }
            case 49: {
                var3_3 /* !! */  = (int)fi.idui("iehc", idun(int ), (int)86);
                if (!var4_2) ** GOTO lbl202
                throw null;
            }
lbl304:
            // 2 sources

            case 50: {
                var3_3 /* !! */  = (int)fi.idui("iehd", idun(int ), (int)87);
                if (!var4_2) ** GOTO lbl112
                throw null;
            }
lbl308:
            // 3 sources

            case 51: {
                var3_3 /* !! */  = (int)fi.idui("iehe", idun(int ), (int)88);
                if (!var4_2) ** GOTO lbl239
                throw null;
            }
lbl312:
            // 2 sources

            case 52: {
                var3_3 /* !! */  = (int)fi.idui("iehf", idun(int ), (int)89);
                if (!var4_2) ** GOTO lbl179
                throw null;
            }
lbl316:
            // 2 sources

            case 53: {
                var3_3 /* !! */  = (int)fi.idui("iehg", idun(int ), (int)90);
                if (!var4_2) ** GOTO lbl197
                throw null;
            }
lbl320:
            // 2 sources

            case 54: {
                var3_3 /* !! */  = (int)fi.idui("iehh", idun(int ), (int)91);
                if (!var4_2) ** GOTO lbl261
                throw null;
            }
            case 55: 
        }
        var3_3 /* !! */  = (int)fi.idui("iehi", idun(int ), (int)92);
        ** while (!var4_2)
lbl327:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ihoz() {
        fi.iduo[200] = 135598625;
        fi.iduo[201] = -1060863;
        fi.iduo[202] = -1840592560;
        fi.iduo[203] = 265721070;
        fi.iduo[204] = -1384984091;
        fi.iduo[205] = 1980011543;
        fi.iduo[206] = -95275634;
        fi.iduo[207] = 1385372490;
        fi.iduo[208] = -1939572776;
        fi.iduo[209] = -46016730;
        fi.iduo[210] = 1163579489;
        fi.iduo[211] = -1634207640;
        fi.iduo[212] = -448149563;
        fi.iduo[213] = 71211161;
        fi.iduo[214] = -581769410;
        fi.iduo[215] = -260890996;
        fi.iduo[216] = -694820310;
        fi.iduo[217] = -1664268938;
        fi.iduo[218] = -497804329;
        fi.iduo[219] = -519763603;
        fi.iduo[220] = 604285185;
        fi.iduo[221] = -247275027;
        fi.iduo[222] = 1190235177;
        fi.iduo[223] = 989559723;
        fi.iduo[224] = 1307828138;
        fi.iduo[225] = -15277164;
        fi.iduo[226] = -930563179;
        fi.iduo[227] = 808544212;
        fi.iduo[228] = 1492618014;
        fi.iduo[229] = 1366744793;
        fi.iduo[230] = -1738388490;
        fi.iduo[231] = 1218721460;
        fi.iduo[232] = 288708143;
        fi.iduo[233] = -1469545080;
        fi.iduo[234] = 664665593;
        fi.iduo[235] = -1629480005;
        fi.iduo[236] = -611647290;
        fi.iduo[237] = -2084066182;
        fi.iduo[238] = 565677526;
        fi.iduo[239] = 1640641345;
        fi.iduo[240] = 1950357089;
        fi.iduo[241] = -1005239712;
        fi.iduo[242] = -567781253;
        fi.iduo[243] = 717788206;
        fi.iduo[244] = 4421921;
        fi.iduo[245] = -1998096715;
        fi.iduo[246] = 998501105;
        fi.iduo[247] = 515217414;
        fi.iduo[248] = 117014593;
        fi.iduo[249] = 622493543;
        fi.iduo[250] = 464248627;
        fi.iduo[251] = 957151059;
        fi.iduo[252] = -1079530728;
        fi.iduo[253] = 518302786;
        fi.iduo[254] = 1805233442;
        fi.iduo[255] = -1869182907;
        fi.iduo[256] = 1389836191;
        fi.iduo[257] = 1692912293;
        fi.iduo[258] = 2013482645;
        fi.iduo[259] = -189023016;
        fi.iduo[260] = -2049437088;
        fi.iduo[261] = 75824523;
        fi.iduo[262] = 621404639;
        fi.iduo[263] = 1609705189;
        fi.iduo[264] = -1054741517;
        fi.iduo[265] = 274171754;
        fi.iduo[266] = -1334860670;
        fi.iduo[267] = 1735827665;
        fi.iduo[268] = 511636096;
        fi.iduo[269] = -1429232373;
        fi.iduo[270] = 1647068523;
        fi.iduo[271] = 13059487;
        fi.iduo[272] = -1136207590;
        fi.iduo[273] = 2102583031;
        fi.iduo[274] = -385870590;
        fi.iduo[275] = -1583066042;
        fi.iduo[276] = -352783624;
        fi.iduo[277] = -1970237685;
        fi.iduo[278] = 571457399;
        fi.iduo[279] = 167667496;
        fi.iduo[280] = -1513190833;
        fi.iduo[281] = 1303044459;
        fi.iduo[282] = 254596239;
        fi.iduo[283] = 280957454;
        fi.iduo[284] = -740741703;
        fi.iduo[285] = -272491624;
        fi.iduo[286] = 566456829;
        fi.iduo[287] = 287185261;
        fi.iduo[288] = -1355509098;
        fi.iduo[289] = 1803124974;
        fi.iduo[290] = 855961841;
        fi.iduo[291] = 1489711966;
        fi.iduo[292] = -1524420747;
        fi.iduo[293] = 32325269;
        fi.iduo[294] = -524749219;
        fi.iduo[295] = -891730809;
        fi.iduo[296] = -532063378;
        fi.iduo[297] = 689082535;
        fi.iduo[298] = 799584195;
        fi.iduo[299] = -1045430303;
    }

    static {
        iduo = new int[801];
        idup = new int[801];
        fi.ihox();
        fi.ihoy();
        fi.ihoz();
        fi.ihpa();
        fi.ihpi();
        fi.ihpm();
        fi.ihpt();
        fi.ihqa();
        fi.iduo[800] = -537024860;
        fi.ihqj();
        fi.ihqq();
        fi.ihqw();
        fi.ihrb();
        fi.ihrh();
        fi.ihrm();
        fi.ihru();
        fi.ihsb();
        fi.idup[800] = -537024860;
        idug = new long[413];
        iduh = new long[413];
        fi.ihsi();
        fi.ihsl();
        fi.ihsm();
        fi.ihsn();
        fi.ihso();
        fi.ihsp();
        fi.ihsq();
        fi.ihsr();
        fi.ihss();
        fi.ihst();
        BANNED_WORDS = List.of(fi.pattern("expensive|celestial|newcode|arbuz|akrien|nursultan|relake|wild|wurst"), fi.pattern("catlavan|excellent|rockstar|impact|matix|inertia|wexside|wex|rich"), fi.pattern("funpay|fluger|riker|funtime|holyworld|hvh|rogalik|thunderhack|liquidbounce"), fi.pattern("\u0430\u043a\u0440\u0438\u0435\u043d|\u0440\u0438\u0447|\u043d\u044e\u043a\u043e\u0434|\u044d\u043a\u0441\u043f\u0435\u043d\u0441\u0438\u0432|\u0438\u043c\u043f\u0430\u043a\u0442|\u044d\u043a\u0441\u0435\u043b\u043b\u0435\u043d\u0442|\u043a\u0430\u0442\u043b\u0430\u0432\u0430\u043d|\u0446\u0435\u043b\u0435\u0441\u0442\u0438\u0430\u043b"), fi.pattern("\u043c\u0430\u0442\u0438\u043a\u0441|\u0438\u043d\u0435\u0440\u0442\u0438|\u044d\u043a\u0441\u043f|\u0444\u043b\u044e\u0433\u0435\u0440|\u0440\u0438\u043a\u0435\u0440|\u0444\u0430\u043d\u043f\u0435\u0439|\u0432\u0435\u043a\u0441\u0430\u0439\u0434|\u043d\u0443\u0440\u0441\u0443\u043b\u0442\u0430\u043d|\u043d\u0443\u0440\u0438\u043a|\u043d\u0443\u0440\u043b\u0430\u043d"));
    }

    private static /* synthetic */ long iduf(int n2) {
        return idug[n2] ^ iduh[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cleanup() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fi.pm - fi.idui("ihfp", iduf(int ), (int)316)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fi.idui("ihfq", idun(int ), (int)656)) break;
            v0 /* !! */  = (long)fi.idui("ihfr", idun(int ), (int)657);
        }
        var3_1 = fi.c;
        v1 /* !! */  = fi.pm;
        if (true) ** GOTO lbl11
        block59: while (true) {
            v1 /* !! */  = (long)(fi.idui("ihft", iduf(int ), (int)318) - fi.idui("ihfs", iduf(int ), (int)317));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -574612461: {
                    continue block59;
                }
                case 311602808: {
                    break block59;
                }
            }
            break;
        }
        var2_2 /* !! */  = fi.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = fi.pm - fi.idui("ihfu", iduf(int ), (int)319)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fi.idui("ihfv", idun(int ), (int)658)) break;
            v2 /* !! */  = (long)fi.idui("ihfw", idun(int ), (int)659);
        }
        var1_3 = fi.a;
        if (var3_1) {
            throw null;
lbl25:
            // 13 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl25
        v3 /* !! */  = fi.pm;
        if (true) ** GOTO lbl32
        block62: while (true) {
            v3 /* !! */  = (long)(fi.idui("ihfy", iduf(int ), (int)321) - fi.idui("ihfx", iduf(int ), (int)320));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 33840662: {
                    continue block62;
                }
                case 311602808: {
                    break block62;
                }
            }
            break;
        }
        this.restoreMovement();
        if (var1_3 || var1_3) ** GOTO lbl25
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = fi.pm - fi.idui("ihfz", iduf(int ), (int)322)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == fi.idui("ihga", idun(int ), (int)660)) break;
            v4 /* !! */  = (long)fi.idui("ihgb", idun(int ), (int)661);
        }
        v5 /* !! */  = fi.pm;
        if (true) ** GOTO lbl48
        block64: while (true) {
            v5 /* !! */  = (long)(fi.idui("ihgd", iduf(int ), (int)324) - fi.idui("ihgc", iduf(int ), (int)323));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 311602808: {
                    break block64;
                }
                case 393036523: {
                    continue block64;
                }
            }
            break;
        }
        this.phase = fi$ActionPhase.IDLE;
        if (var1_3 || var1_3) ** GOTO lbl25
        v6 = fi.idui("ihge", idun(int ), (int)662);
        v7 /* !! */  = fi.pm;
        if (true) ** GOTO lbl60
        block65: while (true) {
            v7 /* !! */  = (long)(v8 - fi.idui("ihgf", iduf(int ), (int)325));
lbl60:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -650306487: {
                    v8 = fi.idui("ihgg", iduf(int ), (int)326);
                    continue block65;
                }
                case 311602808: {
                    break block65;
                }
                case 886268069: {
                    v8 = fi.idui("ihgh", iduf(int ), (int)327);
                    continue block65;
                }
                case 1478490613: {
                    v8 = fi.idui("ihgi", iduf(int ), (int)328);
                    continue block65;
                }
            }
            break;
        }
        this.previousSlot = (int)v6;
        if (var1_3 || var1_3) ** GOTO lbl25
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v9 = fi.idui("ihgj", idun(int ), (int)663);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = fi.pm - fi.idui("ihgk", iduf(int ), (int)329)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == fi.idui("ihgl", idun(int ), (int)664)) break;
                    v10 /* !! */  = (long)fi.idui("ihgm", idun(int ), (int)665);
                }
                this.targetSlot = (int)v9;
                if (var1_3 || var1_3) ** GOTO lbl25
                v11 = fi.idui("ihgn", idun(int ), (int)666);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = fi.pm - fi.idui("ihgo", iduf(int ), (int)330)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == fi.idui("ihgp", idun(int ), (int)667)) break;
                    v12 /* !! */  = (long)fi.idui("ihgq", idun(int ), (int)668);
                }
                this.temporaryHotbarSlot = (int)v11;
                if (var1_3 || var1_3) ** GOTO lbl25
                v13 = fi.idui("ihgr", idun(int ), (int)669);
                v14 /* !! */  = fi.pm;
                if (true) ** GOTO lbl98
                block68: while (true) {
                    v14 /* !! */  = (long)(fi.idui("ihgt", iduf(int ), (int)332) - fi.idui("ihgs", iduf(int ), (int)331));
lbl98:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case 311602808: {
                            break block68;
                        }
                        case 1071479405: {
                            continue block68;
                        }
                    }
                    break;
                }
                this.stopTicks = (int)v13;
                if (var1_3 || var1_3) ** GOTO lbl25
                v15 = fi.idui("ihgu", idun(int ), (int)670);
                v16 /* !! */  = fi.pm;
                if (true) ** GOTO lbl110
                block69: while (true) {
                    v16 /* !! */  = (long)(v17 - fi.idui("ihgv", iduf(int ), (int)333));
lbl110:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -2085874331: {
                            v17 = fi.idui("ihgw", iduf(int ), (int)334);
                            continue block69;
                        }
                        case -2080644217: {
                            v17 = fi.idui("ihgx", iduf(int ), (int)335);
                            continue block69;
                        }
                        case 311602808: {
                            break block69;
                        }
                        case 763917718: {
                            v17 = fi.idui("ihgy", iduf(int ), (int)336);
                            continue block69;
                        }
                    }
                    break;
                }
                this.fromHotbar = v15;
                if (var1_3 || var1_3) ** GOTO lbl25
                v18 = fi.idui("ihgz", iduf(int ), (int)337);
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_5 = fi.pm - fi.idui("ihha", iduf(int ), (int)338)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == fi.idui("ihhb", idun(int ), (int)671)) break;
                    v19 /* !! */  = (long)fi.idui("ihhc", idun(int ), (int)672);
                }
                this.restoreAt = (long)v18;
                if (var1_3 || var1_3) ** GOTO lbl25
                v20 = fi.idui("ihhd", iduf(int ), (int)339);
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_6 = fi.pm - fi.idui("ihhe", iduf(int ), (int)340)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == fi.idui("ihhf", idun(int ), (int)673)) break;
                    v21 /* !! */  = (long)fi.idui("ihhg", idun(int ), (int)674);
                }
                this.actionAt = (long)v20;
                if (var1_3 || var1_3) ** GOTO lbl25
                v22 = fi.idui("ihhh", idun(int ), (int)675);
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_7 = fi.pm - fi.idui("ihhi", iduf(int ), (int)341)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == fi.idui("ihhj", idun(int ), (int)676)) break;
                    v23 /* !! */  = (long)fi.idui("ihhk", idun(int ), (int)677);
                }
                this.antiFlightScreenSlot = (int)v22;
                if (var1_3 || var1_3) ** GOTO lbl25
                v24 = fi.idui("ihhl", idun(int ), (int)678);
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_8 = fi.pm - fi.idui("ihhm", iduf(int ), (int)342)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == fi.idui("ihhn", idun(int ), (int)679)) break;
                    v25 /* !! */  = (long)fi.idui("ihho", idun(int ), (int)680);
                }
                this.antiFlightSwapped = v24;
                if (var1_3 || var1_3) ** GOTO lbl25
                v26 = fi.idui("ihhp", idun(int ), (int)681);
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_9 = fi.pm - fi.idui("ihhq", iduf(int ), (int)343)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == fi.idui("ihhr", idun(int ), (int)682)) break;
                    v27 /* !! */  = (long)fi.idui("ihhs", idun(int ), (int)683);
                }
                this.antiFlightSwapApplied = v26;
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)fi.idui("ihht", idun(int ), (int)684);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl269
            }
lbl170:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)fi.idui("ihhu", idun(int ), (int)685);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl175:
            // 5 sources

            case 2: {
                var2_2 /* !! */  = (int)fi.idui("ihhv", idun(int ), (int)686);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl180:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)fi.idui("ihhw", idun(int ), (int)687);
                if (!var3_1) ** GOTO lbl175
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)fi.idui("ihhx", idun(int ), (int)688);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl189:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)fi.idui("ihhy", idun(int ), (int)689);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl251
            }
            case 6: {
                var2_2 /* !! */  = (int)fi.idui("ihhz", idun(int ), (int)690);
                if (!var3_1) ** GOTO lbl180
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)fi.idui("ihia", idun(int ), (int)691);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 8: {
                var2_2 /* !! */  = (int)fi.idui("ihib", idun(int ), (int)692);
                if (!var3_1) ** GOTO lbl175
                throw null;
            }
lbl207:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)fi.idui("ihic", idun(int ), (int)693);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl227
            }
            case 10: {
                var2_2 /* !! */  = (int)fi.idui("ihid", idun(int ), (int)694);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl217:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)fi.idui("ihie", idun(int ), (int)695);
                if (!var3_1) ** GOTO lbl170
                throw null;
            }
lbl221:
            // 2 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fi.idui("ihif", idun(int ), (int)696);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl235
                    break;
                }
            }
lbl227:
            // 3 sources

            case 13: {
                var2_2 /* !! */  = (int)fi.idui("ihig", idun(int ), (int)697);
                if (!var3_1) ** GOTO lbl175
                throw null;
            }
lbl231:
            // 3 sources

            case 14: {
                var2_2 /* !! */  = (int)fi.idui("ihih", idun(int ), (int)698);
                if (!var3_1) ** GOTO lbl207
                throw null;
            }
lbl235:
            // 2 sources

            case 15: {
                var2_2 /* !! */  = (int)fi.idui("ihii", idun(int ), (int)699);
                if (!var3_1) ** GOTO lbl231
                throw null;
            }
lbl239:
            // 3 sources

            case 16: {
                var2_2 /* !! */  = (int)fi.idui("ihij", idun(int ), (int)700);
                if (!var3_1) break;
                throw null;
            }
            case 17: {
                var2_2 /* !! */  = (int)fi.idui("ihik", idun(int ), (int)701);
                if (!var3_1) ** GOTO lbl189
                throw null;
            }
lbl247:
            // 2 sources

            case 18: {
                var2_2 /* !! */  = (int)fi.idui("ihil", idun(int ), (int)702);
                if (!var3_1) ** GOTO lbl170
                throw null;
            }
lbl251:
            // 3 sources

            case 19: {
                var2_2 /* !! */  = (int)fi.idui("ihim", idun(int ), (int)703);
                if (!var3_1) ** GOTO lbl231
                throw null;
            }
            case 20: {
                var2_2 /* !! */  = (int)fi.idui("ihin", idun(int ), (int)704);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl260:
            // 2 sources

            case 21: {
                var2_2 /* !! */  = (int)fi.idui("ihio", idun(int ), (int)705);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl265:
            // 2 sources

            case 22: {
                var2_2 /* !! */  = (int)fi.idui("ihip", idun(int ), (int)706);
                if (!var3_1) break;
                throw null;
            }
lbl269:
            // 2 sources

            case 23: {
                var2_2 /* !! */  = (int)fi.idui("ihiq", idun(int ), (int)707);
                if (!var3_1) ** GOTO lbl175
                throw null;
            }
            case 24: {
                var2_2 /* !! */  = (int)fi.idui("ihir", idun(int ), (int)708);
                if (!var3_1) ** GOTO lbl217
                throw null;
            }
            case 25: {
                var2_2 /* !! */  = (int)fi.idui("ihis", idun(int ), (int)709);
                if (!var3_1) ** GOTO lbl247
                throw null;
            }
lbl281:
            // 2 sources

            case 26: {
                var2_2 /* !! */  = (int)fi.idui("ihit", idun(int ), (int)710);
                if (!var3_1) ** GOTO lbl221
                throw null;
            }
            case 27: 
        }
        var2_2 /* !! */  = (int)fi.idui("ihiu", idun(int ), (int)711);
        ** while (!var3_1)
lbl288:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void restoreTrap() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fi.pm - fi.idui("igtt", iduf(int ), (int)202)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fi.idui("igtu", idun(int ), (int)462)) break;
            v0 /* !! */  = (long)fi.idui("igtv", idun(int ), (int)463);
        }
        var3_1 = fi.c;
        v1 /* !! */  = fi.pm;
        if (true) ** GOTO lbl11
        block20: while (true) {
            v1 /* !! */  = (long)(v2 - fi.idui("igtw", iduf(int ), (int)203));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1919781841: {
                    v2 = fi.idui("igtx", iduf(int ), (int)204);
                    continue block20;
                }
                case -571598144: {
                    v2 = fi.idui("igty", iduf(int ), (int)205);
                    continue block20;
                }
                case 311602808: {
                    break block20;
                }
                case 1426313122: {
                    v2 = fi.idui("igtz", iduf(int ), (int)206);
                    continue block20;
                }
            }
            break;
        }
        var2_2 /* !! */  = fi.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = fi.pm - fi.idui("igua", iduf(int ), (int)207)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == fi.idui("igub", idun(int ), (int)464)) break;
            v3 /* !! */  = (long)fi.idui("iguc", idun(int ), (int)465);
        }
        var1_3 = fi.a;
        if (var3_1) {
            throw null;
lbl32:
            // 5 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = fi.pm - fi.idui("igud", iduf(int ), (int)208)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == fi.idui("igue", idun(int ), (int)466)) break;
                    v4 /* !! */  = (long)fi.idui("iguf", idun(int ), (int)467);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = fi.pm - fi.idui("igug", iduf(int ), (int)209)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == fi.idui("iguh", idun(int ), (int)468)) break;
                    v5 /* !! */  = (long)fi.idui("igui", idun(int ), (int)469);
                }
                nv.selectSlotSilent(this.previousSlot);
                if (var1_3 || var1_3) ** GOTO lbl32
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = fi.pm - fi.idui("iguj", iduf(int ), (int)210)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == fi.idui("iguk", idun(int ), (int)470)) break;
                    v6 /* !! */  = (long)fi.idui("igul", idun(int ), (int)471);
                }
                if (this.fromHotbar) ** GOTO lbl74
                if (var1_3 || var1_3) ** GOTO lbl32
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_5 = fi.pm - fi.idui("igum", iduf(int ), (int)211)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == fi.idui("igun", idun(int ), (int)472)) break;
                    v7 /* !! */  = (long)fi.idui("iguo", idun(int ), (int)473);
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_6 = fi.pm - fi.idui("igup", iduf(int ), (int)212)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == fi.idui("iguq", idun(int ), (int)474)) break;
                    v8 /* !! */  = (long)fi.idui("igur", idun(int ), (int)475);
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_7 = fi.pm - fi.idui("igus", iduf(int ), (int)213)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == fi.idui("igut", idun(int ), (int)476)) break;
                    v9 /* !! */  = (long)fi.idui("iguu", idun(int ), (int)477);
                }
                nv.swapHotbar(this.targetSlot, this.temporaryHotbarSlot);
                if (var1_3) ** GOTO lbl32
lbl74:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)fi.idui("iguv", idun(int ), (int)478);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl90
            }
lbl82:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)fi.idui("iguw", idun(int ), (int)479);
                if (!var3_1) break;
                throw null;
            }
lbl86:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)fi.idui("igux", idun(int ), (int)480);
                if (!var3_1) ** GOTO lbl82
                throw null;
            }
lbl90:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)fi.idui("iguy", idun(int ), (int)481);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl112
            }
            case 4: {
                var2_2 /* !! */  = (int)fi.idui("iguz", idun(int ), (int)482);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl104
            }
lbl100:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)fi.idui("igva", idun(int ), (int)483);
                if (!var3_1) ** GOTO lbl86
                throw null;
            }
lbl104:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)fi.idui("igvb", idun(int ), (int)484);
                if (!var3_1) ** GOTO lbl82
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)fi.idui("igvc", idun(int ), (int)485);
                if (!var3_1) ** GOTO lbl100
                throw null;
            }
lbl112:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)fi.idui("igvd", idun(int ), (int)486);
                if (!var3_1) ** GOTO lbl82
                throw null;
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fi.idui("igve", idun(int ), (int)487);
                    if (!var3_1) ** GOTO lbl112
                    throw null;
                }
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)fi.idui("igvf", idun(int ), (int)488);
        ** while (!var3_1)
lbl124:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ihqa() {
        fi.iduo[700] = 2078657055;
        fi.iduo[701] = 2010625074;
        fi.iduo[702] = 512478747;
        fi.iduo[703] = 2000017532;
        fi.iduo[704] = 1423507934;
        fi.iduo[705] = -611394267;
        fi.iduo[706] = 1998886476;
        fi.iduo[707] = -2069521972;
        fi.iduo[708] = 1358739026;
        fi.iduo[709] = 245266314;
        fi.iduo[710] = 476677323;
        fi.iduo[711] = 2131096768;
        fi.iduo[712] = -1998201448;
        fi.iduo[713] = -1325921140;
        fi.iduo[714] = 1200664207;
        fi.iduo[715] = 2022773678;
        fi.iduo[716] = 1712488535;
        fi.iduo[717] = -1431319162;
        fi.iduo[718] = -2105500115;
        fi.iduo[719] = -2019631200;
        fi.iduo[720] = -1422729524;
        fi.iduo[721] = 1365746873;
        fi.iduo[722] = 323513186;
        fi.iduo[723] = 1942609689;
        fi.iduo[724] = -1852731491;
        fi.iduo[725] = -695387101;
        fi.iduo[726] = 2115239469;
        fi.iduo[727] = -1168872641;
        fi.iduo[728] = 1700364343;
        fi.iduo[729] = 1765239238;
        fi.iduo[730] = 435038183;
        fi.iduo[731] = 1026396104;
        fi.iduo[732] = -879842262;
        fi.iduo[733] = 1815357077;
        fi.iduo[734] = 1639852325;
        fi.iduo[735] = -649846751;
        fi.iduo[736] = -895332884;
        fi.iduo[737] = -489573540;
        fi.iduo[738] = 981678579;
        fi.iduo[739] = -266562687;
        fi.iduo[740] = 1234272734;
        fi.iduo[741] = 1741435467;
        fi.iduo[742] = -1971231514;
        fi.iduo[743] = -1601525007;
        fi.iduo[744] = -1461596429;
        fi.iduo[745] = -2078900771;
        fi.iduo[746] = 687239819;
        fi.iduo[747] = 1359427787;
        fi.iduo[748] = 1120974264;
        fi.iduo[749] = -1516520202;
        fi.iduo[750] = -199889910;
        fi.iduo[751] = -1185299473;
        fi.iduo[752] = 1271427131;
        fi.iduo[753] = -1491414864;
        fi.iduo[754] = -1907143317;
        fi.iduo[755] = 407064088;
        fi.iduo[756] = -463659655;
        fi.iduo[757] = 1522814369;
        fi.iduo[758] = 1682366678;
        fi.iduo[759] = 1199698664;
        fi.iduo[760] = 1765189107;
        fi.iduo[761] = -1013861397;
        fi.iduo[762] = 1556118583;
        fi.iduo[763] = 857142951;
        fi.iduo[764] = 0x76711611;
        fi.iduo[765] = 2124576259;
        fi.iduo[766] = -2052830672;
        fi.iduo[767] = -449937821;
        fi.iduo[768] = -139272543;
        fi.iduo[769] = -163707403;
        fi.iduo[770] = -1863641433;
        fi.iduo[771] = -1567444018;
        fi.iduo[772] = 698503360;
        fi.iduo[773] = -1865800917;
        fi.iduo[774] = -2038243554;
        fi.iduo[775] = 1638485774;
        fi.iduo[776] = 1151429313;
        fi.iduo[777] = 1380785077;
        fi.iduo[778] = -96114442;
        fi.iduo[779] = 425512446;
        fi.iduo[780] = 120192422;
        fi.iduo[781] = -1959612888;
        fi.iduo[782] = -1008880920;
        fi.iduo[783] = -1450220795;
        fi.iduo[784] = -765681206;
        fi.iduo[785] = -666528893;
        fi.iduo[786] = -796542956;
        fi.iduo[787] = 1868128153;
        fi.iduo[788] = 594148163;
        fi.iduo[789] = 541341805;
        fi.iduo[790] = -10721569;
        fi.iduo[791] = -456162952;
        fi.iduo[792] = 95080121;
        fi.iduo[793] = 467602493;
        fi.iduo[794] = -951040265;
        fi.iduo[795] = -999181402;
        fi.iduo[796] = -1148122162;
        fi.iduo[797] = -1083912053;
        fi.iduo[798] = -377534266;
        fi.iduo[799] = -251701661;
    }

    private static /* synthetic */ void ihsi() {
        fi.idug[0] = 1830148497430261924L;
        fi.idug[1] = -4488317933636064273L;
        fi.idug[2] = 4054000518362464477L;
        fi.idug[3] = -4705450764395222381L;
        fi.idug[4] = 2066167989621027525L;
        fi.idug[5] = 8575152996107532555L;
        fi.idug[6] = 3778623165291538725L;
        fi.idug[7] = 615845222641636653L;
        fi.idug[8] = 6620346810752864692L;
        fi.idug[9] = -8469807329910739732L;
        fi.idug[10] = 1933979180224297653L;
        fi.idug[11] = 3231925485595701269L;
        fi.idug[12] = 7179336730753040265L;
        fi.idug[13] = -3728690144874954896L;
        fi.idug[14] = -5233677824047886802L;
        fi.idug[15] = -9129932866109360464L;
        fi.idug[16] = -7140102041095027844L;
        fi.idug[17] = 6285084555078291349L;
        fi.idug[18] = -6564123310766947219L;
        fi.idug[19] = 238717518097695792L;
        fi.idug[20] = -1670781707313461704L;
        fi.idug[21] = 7265768884350552033L;
        fi.idug[22] = 4996699572752696437L;
        fi.idug[23] = 4958525176530312869L;
        fi.idug[24] = 3517674753312900018L;
        fi.idug[25] = -7145790430372841362L;
        fi.idug[26] = 1466590813040918282L;
        fi.idug[27] = 9069753271967079747L;
        fi.idug[28] = -1256231687202712743L;
        fi.idug[29] = 7593824892817641373L;
        fi.idug[30] = -8384051238620382062L;
        fi.idug[31] = 7344767458397696348L;
        fi.idug[32] = -6866758472673410946L;
        fi.idug[33] = 3225290433325792198L;
        fi.idug[34] = 9147020789958963574L;
        fi.idug[35] = -1173676077651027565L;
        fi.idug[36] = -7691933602214808003L;
        fi.idug[37] = 4409813615573217115L;
        fi.idug[38] = -5482380498250731815L;
        fi.idug[39] = -3330649383341020566L;
        fi.idug[40] = 5650523291933776898L;
        fi.idug[41] = 613070634499997959L;
        fi.idug[42] = -7617375576174359301L;
        fi.idug[43] = 1584334741119551259L;
        fi.idug[44] = 408223303607829335L;
        fi.idug[45] = -7352100270449733478L;
        fi.idug[46] = 3374539625055672994L;
        fi.idug[47] = -6587026039597840748L;
        fi.idug[48] = -666992516373220680L;
        fi.idug[49] = 3774070853237608373L;
        fi.idug[50] = 6052779098744472652L;
        fi.idug[51] = -1148816026451315064L;
        fi.idug[52] = -255409239792923572L;
        fi.idug[53] = 1246730677610028771L;
        fi.idug[54] = 6551813019709571160L;
        fi.idug[55] = -8159467021314583571L;
        fi.idug[56] = -4090354421728163172L;
        fi.idug[57] = -5418730112193357628L;
        fi.idug[58] = -6828157262462075221L;
        fi.idug[59] = -7619397518965527236L;
        fi.idug[60] = 8019901029412255899L;
        fi.idug[61] = -8794335342226550386L;
        fi.idug[62] = -6420661370853194423L;
        fi.idug[63] = -2050175567045708126L;
        fi.idug[64] = -7891015321967569522L;
        fi.idug[65] = -6641507573061692556L;
        fi.idug[66] = 3453995528184305574L;
        fi.idug[67] = -4687297463822602809L;
        fi.idug[68] = -3776150269243090282L;
        fi.idug[69] = 4574755429414767826L;
        fi.idug[70] = 1376177368923159678L;
        fi.idug[71] = 1149918599199580847L;
        fi.idug[72] = 2867260423559383267L;
        fi.idug[73] = 4547489875466372793L;
        fi.idug[74] = 4348915179195461369L;
        fi.idug[75] = -8690529529047445084L;
        fi.idug[76] = -6477410329727498368L;
        fi.idug[77] = -4903712526183541523L;
        fi.idug[78] = -4495428867137811590L;
        fi.idug[79] = 5278940381453361102L;
        fi.idug[80] = -2340527720078933574L;
        fi.idug[81] = 9229079747329560L;
        fi.idug[82] = 2591217811258527701L;
        fi.idug[83] = -8334662603508830694L;
        fi.idug[84] = 8705934385076948837L;
        fi.idug[85] = -1213543157233770103L;
        fi.idug[86] = 3272645253048218822L;
        fi.idug[87] = 8916126048017750560L;
        fi.idug[88] = -5546079594071448456L;
        fi.idug[89] = -4176823562326154424L;
        fi.idug[90] = 762044255430436085L;
        fi.idug[91] = 3700873607252059024L;
        fi.idug[92] = 2217283865588313223L;
        fi.idug[93] = 2031118722117929260L;
        fi.idug[94] = 5431456797932977691L;
        fi.idug[95] = 5045797406337810901L;
        fi.idug[96] = 2166374422536673237L;
        fi.idug[97] = 6781495650415823952L;
        fi.idug[98] = -6585751913770637L;
        fi.idug[99] = 4574894629118639407L;
    }

    private static /* synthetic */ void ihpt() {
        fi.iduo[600] = -114502496;
        fi.iduo[601] = 822363627;
        fi.iduo[602] = 2120631188;
        fi.iduo[603] = 790370465;
        fi.iduo[604] = 378496946;
        fi.iduo[605] = 601956368;
        fi.iduo[606] = 333395271;
        fi.iduo[607] = -869471526;
        fi.iduo[608] = -1681431730;
        fi.iduo[609] = 1263673431;
        fi.iduo[610] = 2086902737;
        fi.iduo[611] = -307311053;
        fi.iduo[612] = -63249067;
        fi.iduo[613] = 368175185;
        fi.iduo[614] = -669539488;
        fi.iduo[615] = -1694186686;
        fi.iduo[616] = 933387619;
        fi.iduo[617] = -1394254702;
        fi.iduo[618] = 1457361915;
        fi.iduo[619] = 990501578;
        fi.iduo[620] = 413239024;
        fi.iduo[621] = 764904026;
        fi.iduo[622] = 1412722488;
        fi.iduo[623] = -192813953;
        fi.iduo[624] = -1954147734;
        fi.iduo[625] = -1535461907;
        fi.iduo[626] = -2022279376;
        fi.iduo[627] = -229860741;
        fi.iduo[628] = 2002713916;
        fi.iduo[629] = -1085710285;
        fi.iduo[630] = -1560057001;
        fi.iduo[631] = -720593436;
        fi.iduo[632] = 1575319769;
        fi.iduo[633] = -169607723;
        fi.iduo[634] = -450715370;
        fi.iduo[635] = -732715927;
        fi.iduo[636] = 187644632;
        fi.iduo[637] = -1197950515;
        fi.iduo[638] = 1033924120;
        fi.iduo[639] = 1813781421;
        fi.iduo[640] = 1288391757;
        fi.iduo[641] = 147005206;
        fi.iduo[642] = 1241284154;
        fi.iduo[643] = 175240635;
        fi.iduo[644] = 407505558;
        fi.iduo[645] = -1369330972;
        fi.iduo[646] = 1012230725;
        fi.iduo[647] = 311411412;
        fi.iduo[648] = 1913721624;
        fi.iduo[649] = -1303548954;
        fi.iduo[650] = -1273743859;
        fi.iduo[651] = 965295331;
        fi.iduo[652] = 1089626499;
        fi.iduo[653] = 1302507912;
        fi.iduo[654] = 125639226;
        fi.iduo[655] = 1958941089;
        fi.iduo[656] = -1896728344;
        fi.iduo[657] = -226516873;
        fi.iduo[658] = 880426376;
        fi.iduo[659] = -597996620;
        fi.iduo[660] = 1590117541;
        fi.iduo[661] = -2024368110;
        fi.iduo[662] = 40499591;
        fi.iduo[663] = -961333801;
        fi.iduo[664] = -1354433394;
        fi.iduo[665] = 1909960135;
        fi.iduo[666] = 1189153654;
        fi.iduo[667] = 1191226224;
        fi.iduo[668] = 1439651996;
        fi.iduo[669] = -1777849103;
        fi.iduo[670] = 1883979864;
        fi.iduo[671] = 1610136706;
        fi.iduo[672] = -1516835578;
        fi.iduo[673] = -1048900629;
        fi.iduo[674] = -1865939318;
        fi.iduo[675] = 1187689723;
        fi.iduo[676] = -1281444461;
        fi.iduo[677] = -811174564;
        fi.iduo[678] = 1354943096;
        fi.iduo[679] = 1907696048;
        fi.iduo[680] = 32064243;
        fi.iduo[681] = -456366342;
        fi.iduo[682] = -794033809;
        fi.iduo[683] = 505297927;
        fi.iduo[684] = -1203595795;
        fi.iduo[685] = -385594314;
        fi.iduo[686] = -2070141559;
        fi.iduo[687] = -1783552294;
        fi.iduo[688] = -1585876026;
        fi.iduo[689] = 468948927;
        fi.iduo[690] = -540556054;
        fi.iduo[691] = 354640935;
        fi.iduo[692] = -267996434;
        fi.iduo[693] = -727766287;
        fi.iduo[694] = -287170008;
        fi.iduo[695] = 182035118;
        fi.iduo[696] = -1397148784;
        fi.iduo[697] = -403759032;
        fi.iduo[698] = -1817213615;
        fi.iduo[699] = -1514404344;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldRender(dj var1_1) {
        v0 /* !! */  = fi.pm;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(v1 - fi.idui("igfp", iduf(int ), (int)28));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -559487195: {
                    v1 = fi.idui("igfq", iduf(int ), (int)29);
                    continue block14;
                }
                case 311602808: {
                    break block14;
                }
                case 1279708587: {
                    v1 = fi.idui("igfr", iduf(int ), (int)30);
                    continue block14;
                }
                case 1713157524: {
                    v1 = fi.idui("igfs", iduf(int ), (int)31);
                    continue block14;
                }
            }
            break;
        }
        var4_2 = fi.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fi.pm - fi.idui("igft", iduf(int ), (int)32)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fi.idui("igfu", idun(int ), (int)268)) break;
            v2 /* !! */  = (long)fi.idui("igfv", idun(int ), (int)269);
        }
        var3_3 /* !! */  = fi.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = fi.pm - fi.idui("igfw", iduf(int ), (int)33)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == fi.idui("igfx", idun(int ), (int)270)) break;
            v3 /* !! */  = (long)fi.idui("igfy", idun(int ), (int)271);
        }
        var2_4 = fi.a;
        if (var4_2) {
            throw null;
lbl32:
            // 3 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = fi.pm - fi.idui("igfz", iduf(int ), (int)34)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == fi.idui("igga", idun(int ), (int)272)) break;
            v4 /* !! */  = (long)fi.idui("iggb", idun(int ), (int)273);
        }
        this.tryHalfTickUse();
        if (var2_4) ** GOTO lbl32
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)fi.idui("iggc", idun(int ), (int)274);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl63
            }
            case 1: {
                var3_3 /* !! */  = (int)fi.idui("iggd", idun(int ), (int)275);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl63
            }
lbl58:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)fi.idui("igge", idun(int ), (int)276);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl67
            }
lbl63:
            // 4 sources

            case 3: {
                var3_3 /* !! */  = (int)fi.idui("iggf", idun(int ), (int)277);
                if (!var4_2) ** GOTO lbl58
                throw null;
            }
lbl67:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)fi.idui("iggg", idun(int ), (int)278);
                if (!var4_2) ** GOTO lbl63
                throw null;
            }
            case 5: 
        }
        do {
            var3_3 /* !! */  = (int)fi.idui("iggh", idun(int ), (int)279);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onInput(cj var1_1) {
        block109: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = fi.pm - fi.idui("iggi", iduf(int ), (int)35)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == fi.idui("iggj", idun(int ), (int)280)) break;
                v0 /* !! */  = (long)fi.idui("iggk", idun(int ), (int)281);
            }
            var6_2 = fi.c;
            v1 /* !! */  = fi.pm;
            if (true) ** GOTO lbl11
            block71: while (true) {
                v1 /* !! */  = (long)(fi.idui("iggm", iduf(int ), (int)37) - fi.idui("iggl", iduf(int ), (int)36));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1610372861: {
                        continue block71;
                    }
                    case 311602808: {
                        break block71;
                    }
                }
                break;
            }
            var5_3 /* !! */  = fi.b;
            v2 /* !! */  = fi.pm;
            if (true) ** GOTO lbl21
            block72: while (true) {
                v2 /* !! */  = (long)(fi.idui("iggo", iduf(int ), (int)39) - fi.idui("iggn", iduf(int ), (int)38));
lbl21:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -24580951: {
                        continue block72;
                    }
                    case 311602808: {
                        break block72;
                    }
                }
                break;
            }
            var4_4 = fi.a;
            if (var6_2) {
                throw null;
lbl29:
                // 10 sources

                return;
            }
            if (var4_4 || var4_4) ** GOTO lbl29
            v3 /* !! */  = fi.pm;
            if (true) ** GOTO lbl36
            block74: while (true) {
                v3 /* !! */  = (long)(fi.idui("iggq", iduf(int ), (int)41) - fi.idui("iggp", iduf(int ), (int)40));
lbl36:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 311602808: {
                        break block74;
                    }
                    case 430046898: {
                        continue block74;
                    }
                }
                break;
            }
            v4 /* !! */  = fi.pm;
            if (true) ** GOTO lbl45
            block75: while (true) {
                v4 /* !! */  = (long)(fi.idui("iggs", iduf(int ), (int)43) - fi.idui("iggr", iduf(int ), (int)42));
lbl45:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case 168219523: {
                        continue block75;
                    }
                    case 311602808: {
                        break block75;
                    }
                }
                break;
            }
            if (this.phase == fi$ActionPhase.ANTI_WAIT_PRESS) break block109;
            if (var4_4) ** GOTO lbl29
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = fi.pm - fi.idui("iggt", iduf(int ), (int)44)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == fi.idui("iggu", idun(int ), (int)282)) break;
                v5 /* !! */  = (long)fi.idui("iggv", idun(int ), (int)283);
            }
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_2 = fi.pm - fi.idui("iggw", iduf(int ), (int)45)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == fi.idui("iggx", idun(int ), (int)284)) break;
                v6 /* !! */  = (long)fi.idui("iggy", idun(int ), (int)285);
            }
            if (this.phase == fi$ActionPhase.ANTI_WAIT_RELEASE) break block109;
            if (var4_4 || var4_4) ** GOTO lbl29
            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl29
        v7 /* !! */  = fi.pm;
        if (true) ** GOTO lbl71
        block78: while (true) {
            v7 /* !! */  = (long)(fi.idui("igha", iduf(int ), (int)47) - fi.idui("iggz", iduf(int ), (int)46));
lbl71:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1309689335: {
                    continue block78;
                }
                case 311602808: {
                    break block78;
                }
            }
            break;
        }
        var2_5 = var1_1.getInput();
        if (var4_4) ** GOTO lbl29
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl29
                v8 /* !! */  = fi.pm;
                if (true) ** GOTO lbl86
                block79: while (true) {
                    v8 /* !! */  = (long)(v9 - fi.idui("ighb", iduf(int ), (int)48));
lbl86:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 311602808: {
                            break block79;
                        }
                        case 923608372: {
                            v9 = fi.idui("ighc", iduf(int ), (int)49);
                            continue block79;
                        }
                        case 1600708966: {
                            v9 = fi.idui("ighd", iduf(int ), (int)50);
                            continue block79;
                        }
                        case 2040915025: {
                            v9 = fi.idui("ighe", iduf(int ), (int)51);
                            continue block79;
                        }
                    }
                    break;
                }
                v10 /* !! */  = fi.pm;
                if (true) ** GOTO lbl102
                block80: while (true) {
                    v10 /* !! */  = (long)(fi.idui("ighg", iduf(int ), (int)53) - fi.idui("ighf", iduf(int ), (int)52));
lbl102:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -260709061: {
                            continue block80;
                        }
                        case 311602808: {
                            break block80;
                        }
                    }
                    break;
                }
                if (this.phase != fi$ActionPhase.ANTI_WAIT_PRESS) ** GOTO lbl113
                if (var4_4) ** GOTO lbl29
                v11 = fi.idui("ighh", idun(int ), (int)286);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl115
lbl113:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl29
                v11 = var3_6 = fi.idui("ighi", idun(int ), (int)287);
lbl115:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl29
                v12 /* !! */  = fi.pm;
                if (true) ** GOTO lbl120
                block81: while (true) {
                    v12 /* !! */  = (long)(v13 - fi.idui("ighj", iduf(int ), (int)54));
lbl120:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -2001984980: {
                            v13 = fi.idui("ighk", iduf(int ), (int)55);
                            continue block81;
                        }
                        case 311602808: {
                            break block81;
                        }
                        case 627189642: {
                            v13 = fi.idui("ighl", iduf(int ), (int)56);
                            continue block81;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_3 = fi.pm - fi.idui("ighm", iduf(int ), (int)57)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == fi.idui("ighn", idun(int ), (int)288)) break;
                    v14 /* !! */  = (long)fi.idui("igho", idun(int ), (int)289);
                }
                v15 = var2_5.comp_3159();
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_4 = fi.pm - fi.idui("ighp", iduf(int ), (int)58)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == fi.idui("ighq", idun(int ), (int)290)) break;
                    v16 /* !! */  = (long)fi.idui("ighr", idun(int ), (int)291);
                }
                v17 = var2_5.comp_3160();
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_5 = fi.pm - fi.idui("ighs", iduf(int ), (int)59)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == fi.idui("ight", idun(int ), (int)292)) break;
                    v18 /* !! */  = (long)fi.idui("ighu", idun(int ), (int)293);
                }
                v19 = var2_5.comp_3161();
                v20 /* !! */  = fi.pm;
                if (true) ** GOTO lbl151
                block85: while (true) {
                    v20 /* !! */  = (long)(v21 - fi.idui("ighv", iduf(int ), (int)60));
lbl151:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1467713636: {
                            v21 = fi.idui("ighw", iduf(int ), (int)61);
                            continue block85;
                        }
                        case -7676768: {
                            v21 = fi.idui("ighx", iduf(int ), (int)62);
                            continue block85;
                        }
                        case 311602808: {
                            break block85;
                        }
                        case 1894765583: {
                            v21 = fi.idui("ighy", iduf(int ), (int)63);
                            continue block85;
                        }
                    }
                    break;
                }
                v22 = var2_5.comp_3162();
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_6 = fi.pm - fi.idui("ighz", iduf(int ), (int)64)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == fi.idui("igia", idun(int ), (int)294)) break;
                    v23 /* !! */  = (long)fi.idui("igib", idun(int ), (int)295);
                }
                v24 = var2_5.comp_3163();
                v25 /* !! */  = fi.pm;
                if (true) ** GOTO lbl174
                block87: while (true) {
                    v25 /* !! */  = (long)(fi.idui("igid", iduf(int ), (int)66) - fi.idui("igic", iduf(int ), (int)65));
lbl174:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case 311602808: {
                            break block87;
                        }
                        case 703934281: {
                            continue block87;
                        }
                    }
                    break;
                }
                v26 = var2_5.comp_3165();
                v27 /* !! */  = fi.pm;
                if (true) ** GOTO lbl184
                block88: while (true) {
                    v27 /* !! */  = (long)(fi.idui("igif", iduf(int ), (int)68) - fi.idui("igie", iduf(int ), (int)67));
lbl184:
                    // 2 sources

                    switch ((int)v27 /* !! */ ) {
                        case 311602808: {
                            break block88;
                        }
                        case 420500452: {
                            continue block88;
                        }
                    }
                    break;
                }
                v28 = new class_10185(v15, v17, v19, v22, v24, (boolean)var3_6, v26);
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_7 = fi.pm - fi.idui("igig", iduf(int ), (int)69)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == fi.idui("igih", idun(int ), (int)296)) break;
                    v29 /* !! */  = (long)fi.idui("igii", idun(int ), (int)297);
                }
                var1_1.setInput(v28);
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var5_3 /* !! */  = (int)fi.idui("igij", idun(int ), (int)298);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl278
            }
lbl204:
            // 3 sources

            case 1: {
                var5_3 /* !! */  = (int)fi.idui("igik", idun(int ), (int)299);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl209:
            // 2 sources

            case 2: {
                var5_3 /* !! */  = (int)fi.idui("igil", idun(int ), (int)300);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl214:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)fi.idui("igim", idun(int ), (int)301);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl219:
            // 2 sources

            case 4: {
                var5_3 /* !! */  = (int)fi.idui("igin", idun(int ), (int)302);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl224:
            // 4 sources

            case 5: {
                var5_3 /* !! */  = (int)fi.idui("igio", idun(int ), (int)303);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl247
            }
            case 6: {
                var5_3 /* !! */  = (int)fi.idui("igip", idun(int ), (int)304);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl234:
            // 2 sources

            case 7: {
                var5_3 /* !! */  = (int)fi.idui("igiq", idun(int ), (int)305);
                if (!var6_2) ** GOTO lbl224
                throw null;
            }
lbl238:
            // 2 sources

            case 8: {
                do {
                    var5_3 /* !! */  = (int)fi.idui("igir", idun(int ), (int)306);
                } while (!var6_2);
                throw null;
            }
lbl243:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)fi.idui("igis", idun(int ), (int)307);
                if (!var6_2) ** GOTO lbl204
                throw null;
            }
lbl247:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)fi.idui("igit", idun(int ), (int)308);
                if (!var6_2) ** GOTO lbl214
                throw null;
            }
            case 11: {
                var5_3 /* !! */  = (int)fi.idui("igiu", idun(int ), (int)309);
                if (!var6_2) ** GOTO lbl209
                throw null;
            }
lbl255:
            // 2 sources

            case 12: {
                var5_3 /* !! */  = (int)fi.idui("igiv", idun(int ), (int)310);
                if (!var6_2) ** GOTO lbl204
                throw null;
            }
            case 13: {
                do {
                    var5_3 /* !! */  = (int)fi.idui("igiw", idun(int ), (int)311);
                } while (!var6_2);
                throw null;
            }
lbl264:
            // 2 sources

            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)fi.idui("igix", idun(int ), (int)312);
                    if (!var6_2) ** GOTO lbl224
                    throw null;
                }
            }
            case 15: {
                do {
                    var5_3 /* !! */  = (int)fi.idui("igiy", idun(int ), (int)313);
                } while (!var6_2);
                throw null;
            }
            case 16: {
                var5_3 /* !! */  = (int)fi.idui("igiz", idun(int ), (int)314);
                if (!var6_2) ** GOTO lbl243
                throw null;
            }
lbl278:
            // 2 sources

            case 17: {
                var5_3 /* !! */  = (int)fi.idui("igja", idun(int ), (int)315);
                if (!var6_2) ** GOTO lbl264
                throw null;
            }
            case 18: 
        }
        var5_3 /* !! */  = (int)fi.idui("igjb", idun(int ), (int)316);
        ** while (!var6_2)
lbl285:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ihrb() {
        fi.idup[300] = -770330974;
        fi.idup[301] = -2061956316;
        fi.idup[302] = -30720788;
        fi.idup[303] = 231471471;
        fi.idup[304] = 16977356;
        fi.idup[305] = 1147528643;
        fi.idup[306] = 1713399283;
        fi.idup[307] = 456721036;
        fi.idup[308] = -1514648221;
        fi.idup[309] = -1475323791;
        fi.idup[310] = -1963229781;
        fi.idup[311] = -889672186;
        fi.idup[312] = -1999394024;
        fi.idup[313] = -593462602;
        fi.idup[314] = 1222521197;
        fi.idup[315] = -671382432;
        fi.idup[316] = -841465577;
        fi.idup[317] = -1113284166;
        fi.idup[318] = 1400267111;
        fi.idup[319] = 2085367315;
        fi.idup[320] = -1175791542;
        fi.idup[321] = -1700779547;
        fi.idup[322] = 1667647849;
        fi.idup[323] = 127326390;
        fi.idup[324] = -1340369812;
        fi.idup[325] = 750518173;
        fi.idup[326] = 733299541;
        fi.idup[327] = -2111571430;
        fi.idup[328] = -1706346377;
        fi.idup[329] = 395673706;
        fi.idup[330] = 702024465;
        fi.idup[331] = -1897938388;
        fi.idup[332] = -2040314341;
        fi.idup[333] = 316022722;
        fi.idup[334] = -1102674190;
        fi.idup[335] = -29970760;
        fi.idup[336] = 2109470543;
        fi.idup[337] = 988299318;
        fi.idup[338] = -78831379;
        fi.idup[339] = -1512312653;
        fi.idup[340] = -1999324654;
        fi.idup[341] = -444846129;
        fi.idup[342] = -1643140714;
        fi.idup[343] = -1496198821;
        fi.idup[344] = -1214514622;
        fi.idup[345] = -1754891253;
        fi.idup[346] = -363111981;
        fi.idup[347] = 1589748405;
        fi.idup[348] = -1016959447;
        fi.idup[349] = 1862163391;
        fi.idup[350] = -1564099695;
        fi.idup[351] = -1839009562;
        fi.idup[352] = 244698927;
        fi.idup[353] = -1902075712;
        fi.idup[354] = 486938251;
        fi.idup[355] = 79325748;
        fi.idup[356] = -1537594263;
        fi.idup[357] = 582118632;
        fi.idup[358] = 1614924825;
        fi.idup[359] = -51626555;
        fi.idup[360] = -1182383788;
        fi.idup[361] = -2131492433;
        fi.idup[362] = 672773539;
        fi.idup[363] = -486098377;
        fi.idup[364] = -2144963538;
        fi.idup[365] = 1202379384;
        fi.idup[366] = -1069131080;
        fi.idup[367] = 1641110087;
        fi.idup[368] = 1241897834;
        fi.idup[369] = -313365559;
        fi.idup[370] = -1938955862;
        fi.idup[371] = 154648179;
        fi.idup[372] = -1935745967;
        fi.idup[373] = 297534911;
        fi.idup[374] = 172636668;
        fi.idup[375] = -1742186719;
        fi.idup[376] = -46311350;
        fi.idup[377] = -537447938;
        fi.idup[378] = -520833383;
        fi.idup[379] = -875723171;
        fi.idup[380] = -1803343825;
        fi.idup[381] = 1038454992;
        fi.idup[382] = 1694002810;
        fi.idup[383] = -939652273;
        fi.idup[384] = 762918048;
        fi.idup[385] = 1709931276;
        fi.idup[386] = -400288083;
        fi.idup[387] = 1245509110;
        fi.idup[388] = 1627357739;
        fi.idup[389] = 1944067159;
        fi.idup[390] = 1272610221;
        fi.idup[391] = -627062432;
        fi.idup[392] = -888054933;
        fi.idup[393] = -991729615;
        fi.idup[394] = -1290335247;
        fi.idup[395] = -782190552;
        fi.idup[396] = 750846515;
        fi.idup[397] = 1343175167;
        fi.idup[398] = -388451899;
        fi.idup[399] = -1195934565;
    }

    private static /* synthetic */ void ihsl() {
        fi.idug[100] = -4112000576130938675L;
        fi.idug[101] = 7354379371102346407L;
        fi.idug[102] = 823440492958048938L;
        fi.idug[103] = 1674834365421661148L;
        fi.idug[104] = 5543465432541875657L;
        fi.idug[105] = 7476956487826526435L;
        fi.idug[106] = -1536745948910850382L;
        fi.idug[107] = 2076362388899056838L;
        fi.idug[108] = 7501418457536964712L;
        fi.idug[109] = -8104371337550583461L;
        fi.idug[110] = -9155299870221712541L;
        fi.idug[111] = 7659497848405041L;
        fi.idug[112] = -3400271918468876168L;
        fi.idug[113] = -8946245115455662628L;
        fi.idug[114] = 6919041584177718698L;
        fi.idug[115] = 8640624780238751908L;
        fi.idug[116] = -4512102333719381984L;
        fi.idug[117] = -6038104072931759924L;
        fi.idug[118] = 6809540385696335679L;
        fi.idug[119] = -8756378297503156262L;
        fi.idug[120] = 7521344971643141451L;
        fi.idug[121] = 128608718469415745L;
        fi.idug[122] = -9223318771147018115L;
        fi.idug[123] = 7992181182539954180L;
        fi.idug[124] = -6529535918869836323L;
        fi.idug[125] = 2836201629452568750L;
        fi.idug[126] = 78128555639603657L;
        fi.idug[127] = -4242483511733430153L;
        fi.idug[128] = -467984224293084669L;
        fi.idug[129] = 2020705541612374987L;
        fi.idug[130] = -8847090007888051094L;
        fi.idug[131] = 7514591523810122226L;
        fi.idug[132] = 1109889338704328936L;
        fi.idug[133] = -4550434782058350610L;
        fi.idug[134] = -5065001640079055357L;
        fi.idug[135] = 962090612898018134L;
        fi.idug[136] = -3692543504651439758L;
        fi.idug[137] = 3668940282022091972L;
        fi.idug[138] = -3330639156017493904L;
        fi.idug[139] = 2767600870811877351L;
        fi.idug[140] = -3196748136563802102L;
        fi.idug[141] = -765862175940797397L;
        fi.idug[142] = 1744510439721084221L;
        fi.idug[143] = 22605655054293548L;
        fi.idug[144] = 8380910010470106682L;
        fi.idug[145] = 4905769990310045259L;
        fi.idug[146] = -6807968368675059689L;
        fi.idug[147] = -506119365225776970L;
        fi.idug[148] = -5830627196121535082L;
        fi.idug[149] = -1927916863274693009L;
        fi.idug[150] = 802281908607308079L;
        fi.idug[151] = -3345751147304048044L;
        fi.idug[152] = 5994638364737818401L;
        fi.idug[153] = -7152349065858710347L;
        fi.idug[154] = 2025533259543282516L;
        fi.idug[155] = 5038278203901972617L;
        fi.idug[156] = 3305162240194449328L;
        fi.idug[157] = -2244156535957468734L;
        fi.idug[158] = 4085067892491126724L;
        fi.idug[159] = 2490956740267282485L;
        fi.idug[160] = -1787413493768310750L;
        fi.idug[161] = 9035318861706136988L;
        fi.idug[162] = 619465116285984303L;
        fi.idug[163] = 6228577404419221603L;
        fi.idug[164] = 2074711140694470083L;
        fi.idug[165] = 5160824912336822735L;
        fi.idug[166] = -3118817825587038695L;
        fi.idug[167] = -2144603973267070242L;
        fi.idug[168] = -917763955576900106L;
        fi.idug[169] = -4327444832975970265L;
        fi.idug[170] = -6006687297374989117L;
        fi.idug[171] = -8070297597991183640L;
        fi.idug[172] = 4751665088312973321L;
        fi.idug[173] = -5489794789665426355L;
        fi.idug[174] = -5795826059564083645L;
        fi.idug[175] = 2418227760426930823L;
        fi.idug[176] = -8682995494891209573L;
        fi.idug[177] = -3750809916482339526L;
        fi.idug[178] = -7863585521621937691L;
        fi.idug[179] = 4978562239998784813L;
        fi.idug[180] = 2251885695507744673L;
        fi.idug[181] = -5291062057771422858L;
        fi.idug[182] = 7453948079255485295L;
        fi.idug[183] = -2955801117964430403L;
        fi.idug[184] = 5474114978418011553L;
        fi.idug[185] = -2600685713682731170L;
        fi.idug[186] = 909904689753187443L;
        fi.idug[187] = -6023641032896120968L;
        fi.idug[188] = 5622861513716915447L;
        fi.idug[189] = -1709612017644120132L;
        fi.idug[190] = 6287345491597294425L;
        fi.idug[191] = 4844003702871033357L;
        fi.idug[192] = 7383226346585151380L;
        fi.idug[193] = -1690907947786067961L;
        fi.idug[194] = 510930786931830380L;
        fi.idug[195] = -8108730133913084570L;
        fi.idug[196] = 5065876597245988974L;
        fi.idug[197] = 4483344168796901881L;
        fi.idug[198] = 3266763641316805381L;
        fi.idug[199] = 7305590866544714348L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$containsBannedWord$0(String var0, Pattern var1_1) {
        v0 /* !! */  = fi.pm;
        if (true) ** GOTO lbl5
        block12: while (true) {
            v0 /* !! */  = (long)(v1 - fi.idui("ihoc", iduf(int ), (int)405));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1399233628: {
                    v1 = fi.idui("ihod", iduf(int ), (int)406);
                    continue block12;
                }
                case -1078440933: {
                    v1 = fi.idui("ihoe", iduf(int ), (int)407);
                    continue block12;
                }
                case 311602808: {
                    break block12;
                }
                case 2137566485: {
                    v1 = fi.idui("ihof", iduf(int ), (int)408);
                    continue block12;
                }
            }
            break;
        }
        var4_2 = fi.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fi.pm - fi.idui("ihog", iduf(int ), (int)409)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fi.idui("ihoh", idun(int ), (int)788)) break;
            v2 /* !! */  = (long)fi.idui("ihoi", idun(int ), (int)789);
        }
        var3_3 /* !! */  = fi.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = fi.pm - fi.idui("ihoj", iduf(int ), (int)410)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == fi.idui("ihok", idun(int ), (int)790)) break;
            v3 /* !! */  = (long)fi.idui("ihol", idun(int ), (int)791);
        }
        var2_4 = fi.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
                    return (boolean)fi.idui("ihom", idun(int ), (int)792);
                }
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = fi.pm - fi.idui("ihon", iduf(int ), (int)411)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == fi.idui("ihoo", idun(int ), (int)793)) break;
                    v4 /* !! */  = (long)fi.idui("ihop", idun(int ), (int)794);
                }
                v5 = var1_1.matcher(var0);
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = fi.pm - fi.idui("ihoq", iduf(int ), (int)412)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == fi.idui("ihor", idun(int ), (int)795)) break;
                    v6 /* !! */  = (long)fi.idui("ihos", idun(int ), (int)796);
                }
                return v5.find();
            }
lbl50:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)fi.idui("ihot", idun(int ), (int)797);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)fi.idui("ihou", idun(int ), (int)798);
                if (!var4_2) ** GOTO lbl50
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)fi.idui("ihov", idun(int ), (int)799);
                    if (!var4_2) break block6;
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)fi.idui("ihow", idun(int ), (int)800);
        ** while (!var4_2)
lbl66:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ihst() {
        fi.iduh[400] = 6698593111802652128L;
        fi.iduh[401] = 3400024449617351826L;
        fi.iduh[402] = 8186057651399572804L;
        fi.iduh[403] = 7417008757703682677L;
        fi.iduh[404] = -6473708025372374156L;
        fi.iduh[405] = -2598955346849491216L;
        fi.iduh[406] = 5079873255255805160L;
        fi.iduh[407] = -3655683747232592473L;
        fi.iduh[408] = -8976136637404599906L;
        fi.iduh[409] = 898341975628825952L;
        fi.iduh[410] = 423152296893856543L;
        fi.iduh[411] = 1352821054893625000L;
        fi.iduh[412] = 6670232050918250843L;
    }

    private static /* synthetic */ void ihso() {
        fi.idug[400] = 736396870393201939L;
        fi.idug[401] = 3400024449617351826L;
        fi.idug[402] = -348525260651566015L;
        fi.idug[403] = 7008919918069807888L;
        fi.idug[404] = 1528178616584899444L;
        fi.idug[405] = 740672007221997931L;
        fi.idug[406] = -6433866252617007555L;
        fi.idug[407] = 3889037440624096446L;
        fi.idug[408] = -3325717972343392104L;
        fi.idug[409] = 5469208327613736346L;
        fi.idug[410] = -4320552735490868602L;
        fi.idug[411] = -7296746978415972072L;
        fi.idug[412] = 3567517604531989772L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void beginAntiFlight() {
        block81: {
            block80: {
                block79: {
                    var5_1 = fi.c;
                    var4_2 /* !! */  = fi.b;
                    var3_3 = fi.a;
                    if (var5_1) {
                        throw null;
lbl6:
                        // 19 sources

                        return;
                    }
                    if (var3_3 || var3_3) ** GOTO lbl6
                    var1_4 = fi.mc.field_1724.method_6079().method_31574(class_1802.field_8450);
                    if (var3_3 || var3_3) ** GOTO lbl6
                    if (!var1_4) break block79;
                    if (var3_3) ** GOTO lbl6
                    v0 /* !! */  = fi.idui("igvg", idun(int ), (int)489);
                    if (var5_1) {
                        throw null;
                    }
                    break block80;
                }
                if (var3_3 || var3_3) ** GOTO lbl6
                v0 /* !! */  = var2_5 /* !! */  = (CallSite)nv.findItemAnywhere(class_1802.field_8450);
            }
            if (var3_3 || var3_3) ** GOTO lbl6
            if (var1_4) break block81;
            if (var3_3) ** GOTO lbl6
            if (var2_5 /* !! */  != fi.idui("igvh", idun(int ), (int)490)) break block81;
            if (var3_3 || var3_3) ** GOTO lbl6
            pp.brandmessage("\u0410\u043d\u0442\u0438-\u041f\u043e\u043b\u0451\u0442 \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d");
            if (var3_3 || var3_3) ** GOTO lbl6
            return;
        }
        if (var3_3 || var3_3) ** GOTO lbl6
        if (var2_5 /* !! */  >= 0 && var2_5 /* !! */  < fi.idui("igvi", idun(int ), (int)491)) {
            v1 = var2_5 /* !! */  + fi.idui("igvj", idun(int ), (int)492);
            if (var5_1) {
                throw null;
            }
        } else {
            v1 = var2_5 /* !! */ ;
        }
        this.antiFlightScreenSlot = (int)v1;
        if (var3_3 || var3_3) ** GOTO lbl6
        if (!var1_4) {
            v2 /* !! */  = fi.idui("igvk", idun(int ), (int)493);
            if (var5_1) {
                throw null;
            }
        } else {
            this.antiFlightSwapped = fi.idui("igvl", idun(int ), (int)494);
            v2 /* !! */  = (CallSite)this.antiFlightSwapped;
        }
        if (var3_3 || var3_3) ** GOTO lbl6
        this.antiFlightSwapApplied = fi.idui("igvm", idun(int ), (int)495);
        if (var3_3 || var3_3) ** GOTO lbl6
        if (!this.swapMode.isSelected("New")) ** GOTO lbl59
        if (var3_3 || var3_3) ** GOTO lbl6
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.beginStop(fi$ActionPhase.ANTI_WAIT_STOP);
                if (var3_3) ** GOTO lbl6
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl66
            }
lbl59:
            // 1 sources

            if (var3_3 || var3_3) ** GOTO lbl6
            this.swapAntiFlightToOffhand();
            if (var3_3 || var3_3) ** GOTO lbl6
            this.phase = fi$ActionPhase.ANTI_WAIT_PRESS;
            if (var3_3 || var3_3) ** GOTO lbl6
            this.stopTicks = (int)fi.idui("igvn", idun(int ), (int)496);
            if (var3_3) ** GOTO lbl6
lbl66:
            // 2 sources

            if (!var3_3 && !var3_3) ** break;
            ** continue;
            return;
lbl69:
            // 5 sources

            case 0: {
                var4_2 /* !! */  = (int)fi.idui("igvo", idun(int ), (int)497);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 1: {
                var4_2 /* !! */  = (int)fi.idui("igvp", idun(int ), (int)498);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl79:
            // 4 sources

            case 2: {
                var4_2 /* !! */  = (int)fi.idui("igvq", idun(int ), (int)499);
                if (!var5_1) ** GOTO lbl69
                throw null;
            }
lbl83:
            // 3 sources

            case 3: {
                var4_2 /* !! */  = (int)fi.idui("igvr", idun(int ), (int)500);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl224
            }
            case 4: {
                var4_2 /* !! */  = (int)fi.idui("igvs", idun(int ), (int)501);
                if (!var5_1) ** GOTO lbl79
                throw null;
            }
            case 5: {
                var4_2 /* !! */  = (int)fi.idui("igvt", idun(int ), (int)502);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 6: {
                var4_2 /* !! */  = (int)fi.idui("igvu", idun(int ), (int)503);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl126
            }
lbl102:
            // 2 sources

            case 7: {
                var4_2 /* !! */  = (int)fi.idui("igvv", idun(int ), (int)504);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl107:
            // 2 sources

            case 8: {
                var4_2 /* !! */  = (int)fi.idui("igvw", idun(int ), (int)505);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
            case 9: {
                var4_2 /* !! */  = (int)fi.idui("igvx", idun(int ), (int)506);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl135
            }
            case 10: {
                do {
                    var4_2 /* !! */  = (int)fi.idui("igvy", idun(int ), (int)507);
                } while (!var5_1);
                throw null;
            }
            case 11: {
                var4_2 /* !! */  = (int)fi.idui("igvz", idun(int ), (int)508);
                if (!var5_1) ** GOTO lbl69
                throw null;
            }
lbl126:
            // 2 sources

            case 12: {
                var4_2 /* !! */  = (int)fi.idui("igwa", idun(int ), (int)509);
                if (var5_1) {
                    throw null;
                }
            }
            case 13: {
                var4_2 /* !! */  = (int)fi.idui("igwb", idun(int ), (int)510);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl135:
            // 3 sources

            case 14: {
                var4_2 /* !! */  = (int)fi.idui("igwc", idun(int ), (int)511);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 15: {
                var4_2 /* !! */  = (int)fi.idui("igwd", idun(int ), (int)512);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
            case 16: {
                var4_2 /* !! */  = (int)fi.idui("igwe", idun(int ), (int)513);
                if (!var5_1) ** GOTO lbl83
                throw null;
            }
            case 17: {
                var4_2 /* !! */  = (int)fi.idui("igwf", idun(int ), (int)514);
                if (!var5_1) ** GOTO lbl107
                throw null;
            }
lbl153:
            // 3 sources

            case 18: {
                var4_2 /* !! */  = (int)fi.idui("igwg", idun(int ), (int)515);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl158:
            // 3 sources

            case 19: {
                var4_2 /* !! */  = (int)fi.idui("igwh", idun(int ), (int)516);
                if (!var5_1) ** GOTO lbl83
                throw null;
            }
lbl162:
            // 2 sources

            case 20: {
                var4_2 /* !! */  = (int)fi.idui("igwi", idun(int ), (int)517);
                if (!var5_1) ** GOTO lbl79
                throw null;
            }
            case 21: {
                var4_2 /* !! */  = (int)fi.idui("igwj", idun(int ), (int)518);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl171:
            // 2 sources

            case 22: {
                var4_2 /* !! */  = (int)fi.idui("igwk", idun(int ), (int)519);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl176:
            // 2 sources

            case 23: {
                var4_2 /* !! */  = (int)fi.idui("igwl", idun(int ), (int)520);
                if (!var5_1) ** GOTO lbl79
                throw null;
            }
lbl180:
            // 2 sources

            case 24: {
                var4_2 /* !! */  = (int)fi.idui("igwm", idun(int ), (int)521);
                if (!var5_1) ** GOTO lbl102
                throw null;
            }
lbl184:
            // 2 sources

            case 25: {
                var4_2 /* !! */  = (int)fi.idui("igwn", idun(int ), (int)522);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 26: {
                var4_2 /* !! */  = (int)fi.idui("igwo", idun(int ), (int)523);
                if (!var5_1) break;
                throw null;
            }
            case 27: {
                var4_2 /* !! */  = (int)fi.idui("igwp", idun(int ), (int)524);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl198:
            // 3 sources

            case 28: {
                var4_2 /* !! */  = (int)fi.idui("igwq", idun(int ), (int)525);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl228
            }
            case 29: {
                var4_2 /* !! */  = (int)fi.idui("igwr", idun(int ), (int)526);
                if (!var5_1) ** GOTO lbl158
                throw null;
            }
            case 30: {
                var4_2 /* !! */  = (int)fi.idui("igws", idun(int ), (int)527);
                if (!var5_1) ** GOTO lbl180
                throw null;
            }
lbl211:
            // 3 sources

            case 31: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)fi.idui("igwt", idun(int ), (int)528);
                    if (!var5_1) ** GOTO lbl135
                    throw null;
                }
            }
lbl216:
            // 3 sources

            case 32: {
                var4_2 /* !! */  = (int)fi.idui("igwu", idun(int ), (int)529);
                if (!var5_1) ** GOTO lbl69
                throw null;
            }
            case 33: {
                var4_2 /* !! */  = (int)fi.idui("igwv", idun(int ), (int)530);
                if (!var5_1) ** GOTO lbl69
                throw null;
            }
lbl224:
            // 2 sources

            case 34: {
                var4_2 /* !! */  = (int)fi.idui("igww", idun(int ), (int)531);
                if (!var5_1) break;
                throw null;
            }
lbl228:
            // 2 sources

            case 35: {
                var4_2 /* !! */  = (int)fi.idui("igwx", idun(int ), (int)532);
                if (!var5_1) ** GOTO lbl216
                throw null;
            }
lbl232:
            // 3 sources

            case 36: {
                var4_2 /* !! */  = (int)fi.idui("igwy", idun(int ), (int)533);
                if (!var5_1) ** GOTO lbl158
                throw null;
            }
            case 37: 
        }
        var4_2 /* !! */  = (int)fi.idui("igwz", idun(int ), (int)534);
        ** while (!var5_1)
lbl239:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ihsr() {
        fi.iduh[200] = 4125274524706959387L;
        fi.iduh[201] = 8458754585702740367L;
        fi.iduh[202] = 4874356711998820704L;
        fi.iduh[203] = -5173290160597580443L;
        fi.iduh[204] = 7339804546337076496L;
        fi.iduh[205] = 3809081721106139896L;
        fi.iduh[206] = 8549938028909719821L;
        fi.iduh[207] = 8688339122592387219L;
        fi.iduh[208] = 4667604748158705811L;
        fi.iduh[209] = 7289852882807879177L;
        fi.iduh[210] = 5891881137616194256L;
        fi.iduh[211] = 91212523861619426L;
        fi.iduh[212] = 384267605417007335L;
        fi.iduh[213] = 1778462276179357710L;
        fi.iduh[214] = 1354154166979479293L;
        fi.iduh[215] = -7932582547835007007L;
        fi.iduh[216] = 6136559952078865779L;
        fi.iduh[217] = 3149441183193764530L;
        fi.iduh[218] = -7547236791534758966L;
        fi.iduh[219] = 2326327187326417215L;
        fi.iduh[220] = -4187169150658877547L;
        fi.iduh[221] = 1727543841561465315L;
        fi.iduh[222] = 9220969197559782352L;
        fi.iduh[223] = -8336851884161683047L;
        fi.iduh[224] = 1868942906753367458L;
        fi.iduh[225] = -3904474636928214667L;
        fi.iduh[226] = 1700626640882613519L;
        fi.iduh[227] = 1199105164570621343L;
        fi.iduh[228] = 2411490551409667132L;
        fi.iduh[229] = 1379032152543074476L;
        fi.iduh[230] = 4951776427308386174L;
        fi.iduh[231] = 8565600200673575250L;
        fi.iduh[232] = -9099243929963094755L;
        fi.iduh[233] = 4412904501018978980L;
        fi.iduh[234] = 2543261797831285282L;
        fi.iduh[235] = -6717117390423763208L;
        fi.iduh[236] = 2662657281725718352L;
        fi.iduh[237] = -8233019492685961232L;
        fi.iduh[238] = 7848677461612689690L;
        fi.iduh[239] = 7251040867029909766L;
        fi.iduh[240] = 3384644853552931275L;
        fi.iduh[241] = -3644079610213999901L;
        fi.iduh[242] = -3336639235937684767L;
        fi.iduh[243] = -7539137690134007259L;
        fi.iduh[244] = -2369621438793609104L;
        fi.iduh[245] = 5477346575094243889L;
        fi.iduh[246] = -7750304738871052171L;
        fi.iduh[247] = -5246853736128997583L;
        fi.iduh[248] = -475655446386961296L;
        fi.iduh[249] = 8213095157853066221L;
        fi.iduh[250] = -1584999863737232485L;
        fi.iduh[251] = -8722521953507686866L;
        fi.iduh[252] = -2769212341497863654L;
        fi.iduh[253] = -7900912609959643522L;
        fi.iduh[254] = -817745719704616866L;
        fi.iduh[255] = -8230529854667096078L;
        fi.iduh[256] = -2378017865031661127L;
        fi.iduh[257] = -53478403639298561L;
        fi.iduh[258] = -6971353403557064031L;
        fi.iduh[259] = 7131868871658870199L;
        fi.iduh[260] = -690574401667678161L;
        fi.iduh[261] = 4677386073241166513L;
        fi.iduh[262] = 6867523927404219307L;
        fi.iduh[263] = -5762144554279017107L;
        fi.iduh[264] = 5485271364090417771L;
        fi.iduh[265] = 4347145534642713509L;
        fi.iduh[266] = 8273758018660483221L;
        fi.iduh[267] = 6030247523464505934L;
        fi.iduh[268] = -6143672463557378124L;
        fi.iduh[269] = -4564880630378791175L;
        fi.iduh[270] = 3238132261244289916L;
        fi.iduh[271] = -3181348789387124150L;
        fi.iduh[272] = 5106989326167179217L;
        fi.iduh[273] = 6887956571516958511L;
        fi.iduh[274] = -2000663670372350403L;
        fi.iduh[275] = -3223374713510476L;
        fi.iduh[276] = 7792158992065688581L;
        fi.iduh[277] = -458242934126895493L;
        fi.iduh[278] = 6455605745758835882L;
        fi.iduh[279] = 5002786878512348431L;
        fi.iduh[280] = -6824948810260379434L;
        fi.iduh[281] = 3128470728856862533L;
        fi.iduh[282] = -1641296173534065978L;
        fi.iduh[283] = 2448584786892888770L;
        fi.iduh[284] = 6966492912491237449L;
        fi.iduh[285] = 1545383728613088299L;
        fi.iduh[286] = 9172175405880078522L;
        fi.iduh[287] = -2136488655377135123L;
        fi.iduh[288] = -6796868406598412616L;
        fi.iduh[289] = 8883279873127957905L;
        fi.iduh[290] = -947636433552057079L;
        fi.iduh[291] = 3988308169006923247L;
        fi.iduh[292] = 7104559153280257962L;
        fi.iduh[293] = -6851587041927580440L;
        fi.iduh[294] = -3491270663380653598L;
        fi.iduh[295] = 1497521901796049591L;
        fi.iduh[296] = -8986812556300814410L;
        fi.iduh[297] = -2123756015989369206L;
        fi.iduh[298] = -8214657724314442585L;
        fi.iduh[299] = -8092040682791522646L;
    }

    public static /* synthetic */ CallSite idui(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void ihrh() {
        fi.idup[400] = -574410270;
        fi.idup[401] = -842715747;
        fi.idup[402] = 652931402;
        fi.idup[403] = -287381350;
        fi.idup[404] = -1759295874;
        fi.idup[405] = 2033583711;
        fi.idup[406] = -1734233794;
        fi.idup[407] = -381212184;
        fi.idup[408] = -1924890605;
        fi.idup[409] = 589409937;
        fi.idup[410] = 1323313873;
        fi.idup[411] = 665705040;
        fi.idup[412] = 113156418;
        fi.idup[413] = 2012850169;
        fi.idup[414] = 2089092432;
        fi.idup[415] = 1141534937;
        fi.idup[416] = 95345256;
        fi.idup[417] = -943226325;
        fi.idup[418] = -1890963473;
        fi.idup[419] = 1614025272;
        fi.idup[420] = -1282817281;
        fi.idup[421] = 654598638;
        fi.idup[422] = 1014535502;
        fi.idup[423] = 1558968738;
        fi.idup[424] = 1702614125;
        fi.idup[425] = -1448508099;
        fi.idup[426] = 532042296;
        fi.idup[427] = 1732712910;
        fi.idup[428] = 84759359;
        fi.idup[429] = -706238499;
        fi.idup[430] = 149758415;
        fi.idup[431] = 649249502;
        fi.idup[432] = 98329723;
        fi.idup[433] = -209411875;
        fi.idup[434] = 12493411;
        fi.idup[435] = -512612885;
        fi.idup[436] = 1157401801;
        fi.idup[437] = 652545961;
        fi.idup[438] = 1221989694;
        fi.idup[439] = -1946882727;
        fi.idup[440] = 361165078;
        fi.idup[441] = -642617138;
        fi.idup[442] = 896153835;
        fi.idup[443] = 1447757669;
        fi.idup[444] = 812906881;
        fi.idup[445] = -891746021;
        fi.idup[446] = 413180478;
        fi.idup[447] = -1710671471;
        fi.idup[448] = 1768242560;
        fi.idup[449] = -229163370;
        fi.idup[450] = 20844465;
        fi.idup[451] = 1826287000;
        fi.idup[452] = 388517034;
        fi.idup[453] = -1892729906;
        fi.idup[454] = -841017107;
        fi.idup[455] = 18391867;
        fi.idup[456] = -980847571;
        fi.idup[457] = -417173060;
        fi.idup[458] = 1110748357;
        fi.idup[459] = -1752765256;
        fi.idup[460] = 636250122;
        fi.idup[461] = 1660341047;
        fi.idup[462] = -1373211620;
        fi.idup[463] = -518577235;
        fi.idup[464] = 1955447312;
        fi.idup[465] = 2070378883;
        fi.idup[466] = 496554984;
        fi.idup[467] = 1615277106;
        fi.idup[468] = 2095991791;
        fi.idup[469] = 851506611;
        fi.idup[470] = 1876152420;
        fi.idup[471] = -1478533209;
        fi.idup[472] = -975065734;
        fi.idup[473] = -274592205;
        fi.idup[474] = -511846307;
        fi.idup[475] = -842817365;
        fi.idup[476] = 1725275767;
        fi.idup[477] = -131044980;
        fi.idup[478] = 768861626;
        fi.idup[479] = 2130833184;
        fi.idup[480] = 1043105006;
        fi.idup[481] = 1964782000;
        fi.idup[482] = 397179713;
        fi.idup[483] = 1560406226;
        fi.idup[484] = -960816015;
        fi.idup[485] = -1496024388;
        fi.idup[486] = 1420539165;
        fi.idup[487] = 1230017882;
        fi.idup[488] = 1774243124;
        fi.idup[489] = 1934619868;
        fi.idup[490] = 1687610167;
        fi.idup[491] = -812555964;
        fi.idup[492] = -434643144;
        fi.idup[493] = 139664306;
        fi.idup[494] = 2047810233;
        fi.idup[495] = 511366533;
        fi.idup[496] = 1271612111;
        fi.idup[497] = -569561461;
        fi.idup[498] = -2041209796;
        fi.idup[499] = -546673456;
    }

    private static /* synthetic */ void ihqw() {
        fi.idup[200] = 135598679;
        fi.idup[201] = -1060848;
        fi.idup[202] = -1840592585;
        fi.idup[203] = 265720971;
        fi.idup[204] = -1384984075;
        fi.idup[205] = 1980011550;
        fi.idup[206] = -95275536;
        fi.idup[207] = 1385372491;
        fi.idup[208] = -1939572791;
        fi.idup[209] = -46016711;
        fi.idup[210] = 1163579475;
        fi.idup[211] = -1634207739;
        fi.idup[212] = -448149611;
        fi.idup[213] = 71211249;
        fi.idup[214] = -581769348;
        fi.idup[215] = -260890906;
        fi.idup[216] = -694820322;
        fi.idup[217] = -1664269019;
        fi.idup[218] = -497804343;
        fi.idup[219] = -519763683;
        fi.idup[220] = 604285233;
        fi.idup[221] = -247275079;
        fi.idup[222] = 1190235255;
        fi.idup[223] = 989559726;
        fi.idup[224] = 1307828198;
        fi.idup[225] = -15277178;
        fi.idup[226] = -930563187;
        fi.idup[227] = 808544133;
        fi.idup[228] = 1492618024;
        fi.idup[229] = 1366744722;
        fi.idup[230] = -1738388488;
        fi.idup[231] = 1218721485;
        fi.idup[232] = 288708212;
        fi.idup[233] = -1469545088;
        fi.idup[234] = 664665591;
        fi.idup[235] = -1629480062;
        fi.idup[236] = -611647264;
        fi.idup[237] = -2084066230;
        fi.idup[238] = 565677497;
        fi.idup[239] = 1640641348;
        fi.idup[240] = 1950357086;
        fi.idup[241] = -1005239764;
        fi.idup[242] = -567781309;
        fi.idup[243] = 717788270;
        fi.idup[244] = 4421953;
        fi.idup[245] = -1998096669;
        fi.idup[246] = 998501015;
        fi.idup[247] = 515217511;
        fi.idup[248] = 117014528;
        fi.idup[249] = 622493463;
        fi.idup[250] = 464248594;
        fi.idup[251] = 957151031;
        fi.idup[252] = -1079530694;
        fi.idup[253] = 518302740;
        fi.idup[254] = 1805233429;
        fi.idup[255] = -1869182883;
        fi.idup[256] = 1389836282;
        fi.idup[257] = 1692912320;
        fi.idup[258] = 2013482727;
        fi.idup[259] = -189023009;
        fi.idup[260] = -2049437125;
        fi.idup[261] = 75824585;
        fi.idup[262] = 621404634;
        fi.idup[263] = 1609705121;
        fi.idup[264] = -1054741586;
        fi.idup[265] = 274171677;
        fi.idup[266] = -1334860629;
        fi.idup[267] = 1735827706;
        fi.idup[268] = 511636097;
        fi.idup[269] = -1786291800;
        fi.idup[270] = -1647068524;
        fi.idup[271] = -1200175417;
        fi.idup[272] = 1136207589;
        fi.idup[273] = -1900685690;
        fi.idup[274] = -385870590;
        fi.idup[275] = -1583066043;
        fi.idup[276] = -352783619;
        fi.idup[277] = -1970237688;
        fi.idup[278] = 571457396;
        fi.idup[279] = 167667496;
        fi.idup[280] = -1513190834;
        fi.idup[281] = -227345521;
        fi.idup[282] = 254596238;
        fi.idup[283] = 1480322733;
        fi.idup[284] = 740741702;
        fi.idup[285] = -1154609732;
        fi.idup[286] = 566456828;
        fi.idup[287] = 287185261;
        fi.idup[288] = 1355509097;
        fi.idup[289] = -1678433991;
        fi.idup[290] = -855961842;
        fi.idup[291] = -70879025;
        fi.idup[292] = -1524420748;
        fi.idup[293] = 1137528061;
        fi.idup[294] = 524749218;
        fi.idup[295] = 344595502;
        fi.idup[296] = -532063377;
        fi.idup[297] = -639826052;
        fi.idup[298] = 799584205;
        fi.idup[299] = -1045430288;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void swapAntiFlightToOffhand() {
        v0 /* !! */  = fi.pm;
        if (true) ** GOTO lbl5
        block39: while (true) {
            v0 /* !! */  = (long)(fi.idui("igxb", iduf(int ), (int)215) - fi.idui("igxa", iduf(int ), (int)214));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 311602808: {
                    break block39;
                }
                case 382915073: {
                    continue block39;
                }
            }
            break;
        }
        var3_1 = fi.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = fi.pm - fi.idui("igxc", iduf(int ), (int)216)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == fi.idui("igxd", idun(int ), (int)535)) break;
            v1 /* !! */  = (long)fi.idui("igxe", idun(int ), (int)536);
        }
        var2_2 /* !! */  = fi.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = fi.pm - fi.idui("igxf", iduf(int ), (int)217)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == fi.idui("igxg", idun(int ), (int)537)) break;
            v2 /* !! */  = (long)fi.idui("igxh", idun(int ), (int)538);
        }
        var1_3 = fi.a;
        if (var3_1) {
            throw null;
lbl27:
            // 6 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl27
        v3 /* !! */  = fi.pm;
        if (true) ** GOTO lbl34
        block43: while (true) {
            v3 /* !! */  = (long)(v4 - fi.idui("igxi", iduf(int ), (int)218));
lbl34:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -587506795: {
                    v4 = fi.idui("igxj", iduf(int ), (int)219);
                    continue block43;
                }
                case 15830171: {
                    v4 = fi.idui("igxk", iduf(int ), (int)220);
                    continue block43;
                }
                case 311602808: {
                    break block43;
                }
            }
            break;
        }
        if (!this.antiFlightSwapped) ** GOTO lbl109
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = fi.pm - fi.idui("igxl", iduf(int ), (int)221)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == fi.idui("igxm", idun(int ), (int)539)) break;
                    v5 /* !! */  = (long)fi.idui("igxn", idun(int ), (int)540);
                }
                if (this.antiFlightScreenSlot < 0) ** GOTO lbl109
                if (var1_3 || var1_3) ** GOTO lbl27
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = fi.pm - fi.idui("igxo", iduf(int ), (int)222)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == fi.idui("igxp", idun(int ), (int)541)) break;
                    v6 /* !! */  = (long)fi.idui("igxq", idun(int ), (int)542);
                }
                v7 = fi.idui("igxr", idun(int ), (int)543);
                v8 /* !! */  = fi.pm;
                if (true) ** GOTO lbl67
                block46: while (true) {
                    v8 /* !! */  = (long)(v9 - fi.idui("igxs", iduf(int ), (int)223));
lbl67:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -311049148: {
                            v9 = fi.idui("igxt", iduf(int ), (int)224);
                            continue block46;
                        }
                        case 311602808: {
                            break block46;
                        }
                        case 666477025: {
                            v9 = fi.idui("igxu", iduf(int ), (int)225);
                            continue block46;
                        }
                        case 2113357571: {
                            v9 = fi.idui("igxv", iduf(int ), (int)226);
                            continue block46;
                        }
                    }
                    break;
                }
                v10 /* !! */  = fi.pm;
                if (true) ** GOTO lbl83
                block47: while (true) {
                    v10 /* !! */  = (long)(v11 - fi.idui("igxw", iduf(int ), (int)227));
lbl83:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -2020166756: {
                            v11 = fi.idui("igxx", iduf(int ), (int)228);
                            continue block47;
                        }
                        case 311602808: {
                            break block47;
                        }
                        case 753497620: {
                            v11 = fi.idui("igxy", iduf(int ), (int)229);
                            continue block47;
                        }
                        case 930649058: {
                            v11 = fi.idui("igxz", iduf(int ), (int)230);
                            continue block47;
                        }
                    }
                    break;
                }
                nv.click(this.antiFlightScreenSlot, (int)v7, class_1713.field_7791);
                if (var1_3 || var1_3) ** GOTO lbl27
                v12 = fi.idui("igya", idun(int ), (int)544);
                v13 /* !! */  = fi.pm;
                if (true) ** GOTO lbl102
                block48: while (true) {
                    v13 /* !! */  = (long)(fi.idui("igyc", iduf(int ), (int)232) - fi.idui("igyb", iduf(int ), (int)231));
lbl102:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case 311602808: {
                            break block48;
                        }
                        case 320438753: {
                            continue block48;
                        }
                    }
                    break;
                }
                this.antiFlightSwapApplied = v12;
                if (var1_3) ** GOTO lbl27
lbl109:
                // 3 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl112:
            // 4 sources

            case 0: {
                var2_2 /* !! */  = (int)fi.idui("igyd", idun(int ), (int)545);
                if (!var3_1) break;
                throw null;
            }
lbl116:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)fi.idui("igye", idun(int ), (int)546);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl121:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fi.idui("igyf", idun(int ), (int)547);
                    if (!var3_1) ** GOTO lbl112
                    throw null;
                }
            }
lbl126:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)fi.idui("igyg", idun(int ), (int)548);
                if (!var3_1) ** GOTO lbl121
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)fi.idui("igyh", idun(int ), (int)549);
                if (var3_1) {
                    throw null;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)fi.idui("igyi", idun(int ), (int)550);
                if (!var3_1) ** GOTO lbl112
                throw null;
            }
            case 6: {
                do {
                    var2_2 /* !! */  = (int)fi.idui("igyj", idun(int ), (int)551);
                } while (!var3_1);
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)fi.idui("igyk", idun(int ), (int)552);
                if (!var3_1) ** GOTO lbl126
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)fi.idui("igyl", idun(int ), (int)553);
                if (!var3_1) ** GOTO lbl116
                throw null;
            }
lbl151:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)fi.idui("igym", idun(int ), (int)554);
                if (var3_1) {
                    throw null;
                }
            }
            case 10: {
                var2_2 /* !! */  = (int)fi.idui("igyn", idun(int ), (int)555);
                if (!var3_1) ** GOTO lbl112
                throw null;
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)fi.idui("igyo", idun(int ), (int)556);
        ** while (!var3_1)
lbl162:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void closeServerMenu() {
        block104: {
            v0 /* !! */  = fi.pm;
            if (true) ** GOTO lbl5
            block72: while (true) {
                v0 /* !! */  = (long)(v1 - fi.idui("igks", iduf(int ), (int)84));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1444536769: {
                        v1 = fi.idui("igkt", iduf(int ), (int)85);
                        continue block72;
                    }
                    case -974277198: {
                        v1 = fi.idui("igku", iduf(int ), (int)86);
                        continue block72;
                    }
                    case -391610221: {
                        v1 = fi.idui("igkv", iduf(int ), (int)87);
                        continue block72;
                    }
                    case 311602808: {
                        break block72;
                    }
                }
                break;
            }
            var5_1 = fi.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = fi.pm - fi.idui("igkw", iduf(int ), (int)88)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == fi.idui("igkx", idun(int ), (int)345)) break;
                v2 /* !! */  = (long)fi.idui("igky", idun(int ), (int)346);
            }
            var4_2 /* !! */  = fi.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = fi.pm - fi.idui("igkz", iduf(int ), (int)89)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == fi.idui("igla", idun(int ), (int)347)) break;
                v3 /* !! */  = (long)fi.idui("iglb", idun(int ), (int)348);
            }
            var3_3 = fi.a;
            if (var5_1) {
                throw null;
lbl32:
                // 12 sources

                return;
            }
            if (var3_3 || var3_3) ** GOTO lbl32
            v4 /* !! */  = fi.pm;
            if (true) ** GOTO lbl39
            block76: while (true) {
                v4 /* !! */  = (long)(v5 - fi.idui("iglc", iduf(int ), (int)90));
lbl39:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -2073142213: {
                        v5 = fi.idui("igld", iduf(int ), (int)91);
                        continue block76;
                    }
                    case -923207186: {
                        v5 = fi.idui("igle", iduf(int ), (int)92);
                        continue block76;
                    }
                    case -501191236: {
                        v5 = fi.idui("iglf", iduf(int ), (int)93);
                        continue block76;
                    }
                    case 311602808: {
                        break block76;
                    }
                }
                break;
            }
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_2 = fi.pm - fi.idui("iglg", iduf(int ), (int)94)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == fi.idui("iglh", idun(int ), (int)349)) break;
                v6 /* !! */  = (long)fi.idui("igli", idun(int ), (int)350);
            }
            if (!this.closeMenu.isValue()) break block104;
            if (var3_3) ** GOTO lbl32
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_3 = fi.pm - fi.idui("iglj", iduf(int ), (int)95)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == fi.idui("iglk", idun(int ), (int)351)) break;
                v7 /* !! */  = (long)fi.idui("igll", idun(int ), (int)352);
            }
            v8 /* !! */  = fi.pm;
            if (true) ** GOTO lbl67
            block79: while (true) {
                v8 /* !! */  = (long)(v9 - fi.idui("iglm", iduf(int ), (int)96));
lbl67:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -587782894: {
                        v9 = fi.idui("igln", iduf(int ), (int)97);
                        continue block79;
                    }
                    case 311602808: {
                        break block79;
                    }
                    case 1059199648: {
                        v9 = fi.idui("iglo", iduf(int ), (int)98);
                        continue block79;
                    }
                }
                break;
            }
            var2_4 = fi.mc.field_1755;
            if (var3_3) ** GOTO lbl32
            if (!(var2_4 instanceof class_465)) break block104;
            if (var3_3) ** GOTO lbl32
            var1_5 = (class_465)var2_4;
            if (var3_3 || var3_3) ** GOTO lbl32
            v10 /* !! */  = fi.pm;
            if (true) ** GOTO lbl86
            block80: while (true) {
                v10 /* !! */  = (long)(v11 - fi.idui("iglp", iduf(int ), (int)99));
lbl86:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1916025412: {
                        v11 = fi.idui("iglq", iduf(int ), (int)100);
                        continue block80;
                    }
                    case 311602808: {
                        break block80;
                    }
                    case 677411364: {
                        v11 = fi.idui("iglr", iduf(int ), (int)101);
                        continue block80;
                    }
                }
                break;
            }
            v12 /* !! */  = fi.pm;
            if (true) ** GOTO lbl99
            block81: while (true) {
                v12 /* !! */  = (long)(fi.idui("iglt", iduf(int ), (int)103) - fi.idui("igls", iduf(int ), (int)102));
lbl99:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case 311602808: {
                        break block81;
                    }
                    case 1285638730: {
                        continue block81;
                    }
                }
                break;
            }
            v13 = fi.mc.field_1724;
            v14 /* !! */  = fi.pm;
            if (true) ** GOTO lbl109
            block82: while (true) {
                v14 /* !! */  = (long)(fi.idui("iglv", iduf(int ), (int)105) - fi.idui("iglu", iduf(int ), (int)104));
lbl109:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case 311602808: {
                        break block82;
                    }
                    case 628641042: {
                        continue block82;
                    }
                }
                break;
            }
            if (v13.field_6012 < fi.idui("iglw", idun(int ), (int)353)) ** GOTO lbl123
            if (var3_3) ** GOTO lbl32
        }
        if (var3_3) ** GOTO lbl32
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3) ** GOTO lbl32
                return;
            }
lbl123:
            // 1 sources

            if (var3_3 || var3_3) ** GOTO lbl32
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_4 = fi.pm - fi.idui("iglx", iduf(int ), (int)106)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  == fi.idui("igly", idun(int ), (int)354)) break;
                v15 /* !! */  = (long)fi.idui("iglz", idun(int ), (int)355);
            }
            v16 = var1_5.method_25440();
            v17 /* !! */  = fi.pm;
            if (true) ** GOTO lbl134
            block84: while (true) {
                v17 /* !! */  = (long)(v18 - fi.idui("igma", iduf(int ), (int)107));
lbl134:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -1840329661: {
                        v18 = fi.idui("igmb", iduf(int ), (int)108);
                        continue block84;
                    }
                    case -490236955: {
                        v18 = fi.idui("igmc", iduf(int ), (int)109);
                        continue block84;
                    }
                    case 311602808: {
                        break block84;
                    }
                    case 910479063: {
                        v18 = fi.idui("igmd", iduf(int ), (int)110);
                        continue block84;
                    }
                }
                break;
            }
            v19 = v16.getString();
            v20 /* !! */  = fi.pm;
            if (true) ** GOTO lbl151
            block85: while (true) {
                v20 /* !! */  = (long)(fi.idui("igmf", iduf(int ), (int)112) - fi.idui("igme", iduf(int ), (int)111));
lbl151:
                // 2 sources

                switch ((int)v20 /* !! */ ) {
                    case 311602808: {
                        break block85;
                    }
                    case 839297607: {
                        continue block85;
                    }
                }
                break;
            }
            if (!v19.contains("\u0415\u0441\u043b\u0438 \u043d\u0435\u0442\u0443 1")) ** GOTO lbl191
            if (var3_3 || var3_3) ** GOTO lbl32
            v21 /* !! */  = fi.pm;
            if (true) ** GOTO lbl162
            block86: while (true) {
                v21 /* !! */  = (long)(v22 - fi.idui("igmg", iduf(int ), (int)113));
lbl162:
                // 2 sources

                switch ((int)v21 /* !! */ ) {
                    case -934525725: {
                        v22 = fi.idui("igmh", iduf(int ), (int)114);
                        continue block86;
                    }
                    case 288893040: {
                        v22 = fi.idui("igmi", iduf(int ), (int)115);
                        continue block86;
                    }
                    case 311602808: {
                        break block86;
                    }
                    case 658253578: {
                        v22 = fi.idui("igmj", iduf(int ), (int)116);
                        continue block86;
                    }
                }
                break;
            }
            v23 /* !! */  = fi.pm;
            if (true) ** GOTO lbl178
            block87: while (true) {
                v23 /* !! */  = (long)(fi.idui("igml", iduf(int ), (int)118) - fi.idui("igmk", iduf(int ), (int)117));
lbl178:
                // 2 sources

                switch ((int)v23 /* !! */ ) {
                    case -1611237956: {
                        continue block87;
                    }
                    case 311602808: {
                        break block87;
                    }
                }
                break;
            }
            v24 = fi.mc.field_1724;
            while (true) {
                if ((v25 /* !! */  = (cfr_temp_5 = fi.pm - fi.idui("igmm", iduf(int ), (int)119)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v25 /* !! */  == fi.idui("igmn", idun(int ), (int)356)) break;
                v25 /* !! */  = (long)fi.idui("igmo", idun(int ), (int)357);
            }
            v24.method_7346();
            if (var3_3) ** GOTO lbl32
lbl191:
            // 2 sources

            if (!var3_3 && !var3_3) ** break;
            ** continue;
            return;
lbl194:
            // 3 sources

            case 0: {
                var4_2 /* !! */  = (int)fi.idui("igmp", idun(int ), (int)358);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl199:
            // 2 sources

            case 1: {
                var4_2 /* !! */  = (int)fi.idui("igmq", idun(int ), (int)359);
                if (!var5_1) ** GOTO lbl194
                throw null;
            }
            case 2: {
                var4_2 /* !! */  = (int)fi.idui("igmr", idun(int ), (int)360);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl243
            }
            case 3: {
                var4_2 /* !! */  = (int)fi.idui("igms", idun(int ), (int)361);
                if (!var5_1) ** GOTO lbl199
                throw null;
            }
lbl212:
            // 2 sources

            case 4: {
                var4_2 /* !! */  = (int)fi.idui("igmt", idun(int ), (int)362);
                if (!var5_1) break;
                throw null;
            }
lbl216:
            // 2 sources

            case 5: {
                var4_2 /* !! */  = (int)fi.idui("igmu", idun(int ), (int)363);
                if (!var5_1) break;
                throw null;
            }
lbl220:
            // 2 sources

            case 6: {
                var4_2 /* !! */  = (int)fi.idui("igmv", idun(int ), (int)364);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl225:
            // 4 sources

            case 7: {
                var4_2 /* !! */  = (int)fi.idui("igmw", idun(int ), (int)365);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl235
            }
            case 8: {
                var4_2 /* !! */  = (int)fi.idui("igmx", idun(int ), (int)366);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl235:
            // 2 sources

            case 9: {
                var4_2 /* !! */  = (int)fi.idui("igmy", idun(int ), (int)367);
                if (!var5_1) ** GOTO lbl194
                throw null;
            }
            case 10: {
                var4_2 /* !! */  = (int)fi.idui("igmz", idun(int ), (int)368);
                if (!var5_1) ** GOTO lbl220
                throw null;
            }
lbl243:
            // 2 sources

            case 11: {
                var4_2 /* !! */  = (int)fi.idui("igna", idun(int ), (int)369);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 12: {
                var4_2 /* !! */  = (int)fi.idui("ignb", idun(int ), (int)370);
                if (!var5_1) ** GOTO lbl212
                throw null;
            }
lbl252:
            // 2 sources

            case 13: {
                var4_2 /* !! */  = (int)fi.idui("ignc", idun(int ), (int)371);
                if (!var5_1) break;
                throw null;
            }
            case 14: {
                var4_2 /* !! */  = (int)fi.idui("ignd", idun(int ), (int)372);
                if (!var5_1) ** GOTO lbl225
                throw null;
            }
lbl260:
            // 3 sources

            case 15: {
                do {
                    var4_2 /* !! */  = (int)fi.idui("igne", idun(int ), (int)373);
                } while (!var5_1);
                throw null;
            }
lbl265:
            // 2 sources

            case 16: {
                var4_2 /* !! */  = (int)fi.idui("ignf", idun(int ), (int)374);
                if (!var5_1) ** GOTO lbl252
                throw null;
            }
            case 17: {
                var4_2 /* !! */  = (int)fi.idui("igng", idun(int ), (int)375);
                if (!var5_1) ** GOTO lbl225
                throw null;
            }
            case 18: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)fi.idui("ignh", idun(int ), (int)376);
                    if (!var5_1) ** GOTO lbl225
                    throw null;
                }
            }
            case 19: 
        }
        var4_2 /* !! */  = (int)fi.idui("igni", idun(int ), (int)377);
        ** while (!var5_1)
lbl281:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int idun(int n2) {
        return iduo[n2] ^ idup[n2];
    }

    private static /* synthetic */ void ihsm() {
        fi.idug[200] = -3328432561282319512L;
        fi.idug[201] = 2365086529248335511L;
        fi.idug[202] = -6463672724564231397L;
        fi.idug[203] = 8848928779632946775L;
        fi.idug[204] = -7994858453761518219L;
        fi.idug[205] = -8501790176765512065L;
        fi.idug[206] = -7824877331564356829L;
        fi.idug[207] = -8020235195564378926L;
        fi.idug[208] = -1367655759356034552L;
        fi.idug[209] = 1516356024522082343L;
        fi.idug[210] = -7401796961408686207L;
        fi.idug[211] = 3053781965743442331L;
        fi.idug[212] = 5518778019669580238L;
        fi.idug[213] = 5246918110061711795L;
        fi.idug[214] = 4312069519545284214L;
        fi.idug[215] = 7207294976535734048L;
        fi.idug[216] = -3586328951217179452L;
        fi.idug[217] = -5831701851291738376L;
        fi.idug[218] = 2678623248698576353L;
        fi.idug[219] = 5567125369166727853L;
        fi.idug[220] = -3041669077182750817L;
        fi.idug[221] = 7392111265227926270L;
        fi.idug[222] = -3484941549205778094L;
        fi.idug[223] = 564869885548599846L;
        fi.idug[224] = 5995665576279080033L;
        fi.idug[225] = 879528349074829359L;
        fi.idug[226] = -3512930017668310201L;
        fi.idug[227] = -6717879033120403506L;
        fi.idug[228] = -3329208512856341358L;
        fi.idug[229] = -9067503777474308584L;
        fi.idug[230] = -7715545534061854145L;
        fi.idug[231] = -425364801212680502L;
        fi.idug[232] = -7109965158500857631L;
        fi.idug[233] = -3826459690457195922L;
        fi.idug[234] = 102525265520531989L;
        fi.idug[235] = -2711390535709361280L;
        fi.idug[236] = 5830997988075699899L;
        fi.idug[237] = 7329417279033020092L;
        fi.idug[238] = -8055858955302292738L;
        fi.idug[239] = 3791545212285209171L;
        fi.idug[240] = -3633546187592504647L;
        fi.idug[241] = -4642245883135344310L;
        fi.idug[242] = -7842938492150203224L;
        fi.idug[243] = 8774184974139639627L;
        fi.idug[244] = 8226482939458458079L;
        fi.idug[245] = -3818580832503142011L;
        fi.idug[246] = 3354070459326155116L;
        fi.idug[247] = 2134215521652222332L;
        fi.idug[248] = 7569764882580174606L;
        fi.idug[249] = 7099449896708662891L;
        fi.idug[250] = 4501472277870408389L;
        fi.idug[251] = 6974926007793110585L;
        fi.idug[252] = 6166067740029947116L;
        fi.idug[253] = -1618980403663095996L;
        fi.idug[254] = 8970876289517339066L;
        fi.idug[255] = -7978397688627433624L;
        fi.idug[256] = 4439801539464776947L;
        fi.idug[257] = 7054481895315464380L;
        fi.idug[258] = 4264250147662750755L;
        fi.idug[259] = -8933978033545291943L;
        fi.idug[260] = 3697747049934840019L;
        fi.idug[261] = -6321397422850793949L;
        fi.idug[262] = 7317069696130804239L;
        fi.idug[263] = 9188103890308903656L;
        fi.idug[264] = -1651960194097888763L;
        fi.idug[265] = -1526082628100088532L;
        fi.idug[266] = -8841559026772701757L;
        fi.idug[267] = -1214456430087234623L;
        fi.idug[268] = -5605965797641580490L;
        fi.idug[269] = -2724872659876939712L;
        fi.idug[270] = -1252672371854848282L;
        fi.idug[271] = -5220619506286632093L;
        fi.idug[272] = -3690692022964291720L;
        fi.idug[273] = -7242768836941962219L;
        fi.idug[274] = 5503848771202121732L;
        fi.idug[275] = -3141243767951819422L;
        fi.idug[276] = 8716131331674707851L;
        fi.idug[277] = 4431239671899449609L;
        fi.idug[278] = -6537182290614653836L;
        fi.idug[279] = 1248405843820321487L;
        fi.idug[280] = 5908164983462108070L;
        fi.idug[281] = -2583271070861465100L;
        fi.idug[282] = -8503285325622228451L;
        fi.idug[283] = 5846974301047570220L;
        fi.idug[284] = 3364814027093200673L;
        fi.idug[285] = 4402728324037014166L;
        fi.idug[286] = 2471198508588893218L;
        fi.idug[287] = 5140453103284799944L;
        fi.idug[288] = 8762479271524150631L;
        fi.idug[289] = -4631049891332344514L;
        fi.idug[290] = 7047472409931730680L;
        fi.idug[291] = 7093208689900385386L;
        fi.idug[292] = -6279159825514621421L;
        fi.idug[293] = -125022852076220797L;
        fi.idug[294] = 6081020474893198144L;
        fi.idug[295] = -7283296751354026792L;
        fi.idug[296] = -1307716673896766300L;
        fi.idug[297] = -7875824515336223179L;
        fi.idug[298] = -463548975675054385L;
        fi.idug[299] = -8275160500168716323L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public fi() {
        var2_1 /* !! */  = fi.b;
        var1_2 = fi.a;
        super("ReallyWorldHelper", "\u041f\u043e\u043c\u043e\u0449\u043d\u0438\u043a \u0434\u043b\u044f \u0441\u043f\u0435\u0446\u0438\u0430\u043b\u044c\u043d\u044b\u0445 \u0444\u0443\u043d\u043a\u0446\u0438\u0439 \u0441\u0435\u0440\u0432\u0435\u0440\u0430 ReallyWorld", du.MISC);
        this.closeMenu = new kb("\u0417\u0430\u043a\u0440\u044b\u0432\u0430\u0442\u044c \u043c\u0435\u043d\u044e", "\u0417\u0430\u043a\u0440\u044b\u0432\u0430\u0435\u0442 \u0441\u0442\u0430\u0440\u0442\u043e\u0432\u043e\u0435 \u0441\u0435\u0440\u0432\u0435\u0440\u043d\u043e\u0435 \u043c\u0435\u043d\u044e ReallyWorld");
        this.chatFilter = new kb("\u0424\u0438\u043b\u044c\u0442\u0440 \u0447\u0430\u0442\u0430", "\u041e\u0442\u043c\u0435\u043d\u044f\u0435\u0442 \u043e\u0442\u043f\u0440\u0430\u0432\u043a\u0443 \u0441\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u0439 \u0441 \u043d\u0430\u0437\u0432\u0430\u043d\u0438\u044f\u043c\u0438 \u0434\u0440\u0443\u0433\u0438\u0445 \u043a\u043b\u0438\u0435\u043d\u0442\u043e\u0432");
        this.fixAfterPvp = new kb("/fix all \u043f\u043e\u0441\u043b\u0435 PvP", "\u041e\u0442\u043f\u0440\u0430\u0432\u043b\u044f\u0435\u0442 /fix all \u043f\u043e\u0441\u043b\u0435 \u0437\u0430\u0432\u0435\u0440\u0448\u0435\u043d\u0438\u044f PvP-\u0440\u0435\u0436\u0438\u043c\u0430");
        this.trap = new ka("\u041a\u043d\u043e\u043f\u043a\u0430 \u043b\u043e\u0432\u0443\u0448\u043a\u0438", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u0441\u0435\u0440\u0434\u0446\u0435 \u043c\u043e\u0440\u044f");
        this.throwBall = new ka("\u041a\u043d\u043e\u043f\u043a\u0430 \u043a\u0438\u0434\u0430\u0439 \u0448\u0430\u0440", "\u041e\u0442\u043f\u0440\u0430\u0432\u0438\u0442\u044c \u0444\u0440\u0430\u0437\u0443 \u0434\u043b\u044f \u0448\u0430\u0440\u0430");
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.antiFlight = new ka("\u041a\u043d\u043e\u043f\u043a\u0430 \u0410\u043d\u0442\u0438-\u041f\u043e\u043b\u0451\u0442\u0430", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u0437\u0432\u0435\u0437\u0434\u0443 \u0444\u0435\u0439\u0435\u0440\u0432\u0435\u0440\u043a\u0430");
                this.swapMode = new kf("\u0420\u0435\u0436\u0438\u043c \u0441\u0432\u0430\u043f\u0430", "\u0411\u044b\u0441\u0442\u0440\u044b\u0439 - \u043c\u043e\u043c\u0435\u043d\u0442\u0430\u043b\u044c\u043d\u043e, ReallyWorld - \u0437\u0430\u0434\u0435\u0440\u0436\u043a\u0430 \u043f\u043e\u043b \u0442\u0438\u043a\u0430, New - \u043e\u0441\u0442\u0430\u043d\u043e\u0432\u043a\u0430 \u043d\u0430 \u0442\u0438\u043a", "\u0411\u044b\u0441\u0442\u0440\u044b\u0439", new String[]{"\u0411\u044b\u0441\u0442\u0440\u044b\u0439", "ReallyWorld", "New"});
                this.movement = new nx();
                this.phase = fi$ActionPhase.IDLE;
                this.previousSlot = (int)fi.idui("idvz", idun(int ), (int)16);
                this.targetSlot = (int)fi.idui("idwa", idun(int ), (int)17);
                this.temporaryHotbarSlot = (int)fi.idui("idwb", idun(int ), (int)18);
                this.antiFlightScreenSlot = (int)fi.idui("idwc", idun(int ), (int)19);
                this.settings(new jx[]{this.closeMenu, this.chatFilter, this.fixAfterPvp, this.trap, this.throwBall, this.antiFlight, this.swapMode});
                return;
            }
lbl22:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)fi.idui("idwd", idun(int ), (int)20);
                ** GOTO lbl40
            }
lbl25:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)fi.idui("idwe", idun(int ), (int)21);
                ** GOTO lbl64
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)fi.idui("idwf", idun(int ), (int)22);
                    ** GOTO lbl22
                    break;
                }
            }
lbl32:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)fi.idui("idwg", idun(int ), (int)23);
                ** GOTO lbl40
            }
            case 4: {
                var2_1 /* !! */  = (int)fi.idui("idwh", idun(int ), (int)24);
            }
lbl37:
            // 4 sources

            case 5: {
                var2_1 /* !! */  = (int)fi.idui("idwi", idun(int ), (int)25);
                ** GOTO lbl61
            }
lbl40:
            // 3 sources

            case 6: {
                var2_1 /* !! */  = (int)fi.idui("idwj", idun(int ), (int)26);
                ** GOTO lbl32
            }
            case 7: {
                var2_1 /* !! */  = (int)fi.idui("idwk", idun(int ), (int)27);
                ** GOTO lbl37
            }
            case 8: {
                var2_1 /* !! */  = (int)fi.idui("idwl", idun(int ), (int)28);
                ** GOTO lbl52
            }
            case 9: {
                var2_1 /* !! */  = (int)fi.idui("idwm", idun(int ), (int)29);
                ** GOTO lbl55
            }
lbl52:
            // 2 sources

            case 10: {
                var2_1 /* !! */  = (int)fi.idui("idwn", idun(int ), (int)30);
                break;
            }
lbl55:
            // 2 sources

            case 11: {
                var2_1 /* !! */  = (int)fi.idui("idwo", idun(int ), (int)31);
                ** GOTO lbl67
            }
lbl58:
            // 2 sources

            case 12: {
                var2_1 /* !! */  = (int)fi.idui("idwp", idun(int ), (int)32);
                ** GOTO lbl67
            }
lbl61:
            // 2 sources

            case 13: {
                var2_1 /* !! */  = (int)fi.idui("idwq", idun(int ), (int)33);
                ** GOTO lbl25
            }
lbl64:
            // 2 sources

            case 14: {
                var2_1 /* !! */  = (int)fi.idui("idwr", idun(int ), (int)34);
                ** GOTO lbl58
            }
lbl67:
            // 3 sources

            case 15: {
                var2_1 /* !! */  = (int)fi.idui("idws", idun(int ), (int)35);
                ** GOTO lbl37
            }
            case 16: 
        }
        var2_1 /* !! */  = (int)fi.idui("idwt", idun(int ), (int)36);
        ** while (true)
    }

    private static /* synthetic */ void ihpi() {
        fi.iduo[400] = -574410269;
        fi.iduo[401] = -842715761;
        fi.iduo[402] = 652931400;
        fi.iduo[403] = -287381351;
        fi.iduo[404] = -1759295889;
        fi.iduo[405] = 2033583688;
        fi.iduo[406] = -1734233806;
        fi.iduo[407] = -381212167;
        fi.iduo[408] = -1924890595;
        fi.iduo[409] = 589409922;
        fi.iduo[410] = 1323313873;
        fi.iduo[411] = 665705024;
        fi.iduo[412] = 113156429;
        fi.iduo[413] = 2012850161;
        fi.iduo[414] = 2089092416;
        fi.iduo[415] = 1141534928;
        fi.iduo[416] = 95345248;
        fi.iduo[417] = -943226322;
        fi.iduo[418] = -1890963464;
        fi.iduo[419] = 1614025264;
        fi.iduo[420] = -1282817294;
        fi.iduo[421] = -654598639;
        fi.iduo[422] = -2083554975;
        fi.iduo[423] = -1558968739;
        fi.iduo[424] = 1415609098;
        fi.iduo[425] = 1448508098;
        fi.iduo[426] = 944112989;
        fi.iduo[427] = -1732712911;
        fi.iduo[428] = 469067992;
        fi.iduo[429] = -706238500;
        fi.iduo[430] = 239825764;
        fi.iduo[431] = 649249503;
        fi.iduo[432] = -1388229603;
        fi.iduo[433] = -209411876;
        fi.iduo[434] = 1569056694;
        fi.iduo[435] = -512612886;
        fi.iduo[436] = -555237496;
        fi.iduo[437] = -652545962;
        fi.iduo[438] = 356203357;
        fi.iduo[439] = 1946882726;
        fi.iduo[440] = -885474813;
        fi.iduo[441] = 642617137;
        fi.iduo[442] = 551682183;
        fi.iduo[443] = 1447757671;
        fi.iduo[444] = 812906880;
        fi.iduo[445] = -891746037;
        fi.iduo[446] = 413180473;
        fi.iduo[447] = -1710671462;
        fi.iduo[448] = 1768242565;
        fi.iduo[449] = -229163361;
        fi.iduo[450] = 20844449;
        fi.iduo[451] = 1826286998;
        fi.iduo[452] = 388517037;
        fi.iduo[453] = -1892729911;
        fi.iduo[454] = -841017110;
        fi.iduo[455] = 18391862;
        fi.iduo[456] = -980847555;
        fi.iduo[457] = -417173076;
        fi.iduo[458] = 1110748355;
        fi.iduo[459] = -1752765260;
        fi.iduo[460] = 636250114;
        fi.iduo[461] = 1660341054;
        fi.iduo[462] = 1373211619;
        fi.iduo[463] = 1907266269;
        fi.iduo[464] = -1955447313;
        fi.iduo[465] = -821025198;
        fi.iduo[466] = 496554985;
        fi.iduo[467] = 1828737164;
        fi.iduo[468] = -2095991792;
        fi.iduo[469] = -889113700;
        fi.iduo[470] = 1876152421;
        fi.iduo[471] = -1694693642;
        fi.iduo[472] = 975065733;
        fi.iduo[473] = -210482762;
        fi.iduo[474] = 511846306;
        fi.iduo[475] = 666999700;
        fi.iduo[476] = -1725275768;
        fi.iduo[477] = 79489531;
        fi.iduo[478] = 768861618;
        fi.iduo[479] = 2130833190;
        fi.iduo[480] = 1043105007;
        fi.iduo[481] = 1964782002;
        fi.iduo[482] = 397179714;
        fi.iduo[483] = 1560406231;
        fi.iduo[484] = -960816011;
        fi.iduo[485] = -1496024392;
        fi.iduo[486] = 1420539166;
        fi.iduo[487] = 1230017883;
        fi.iduo[488] = 1774243127;
        fi.iduo[489] = -1934619869;
        fi.iduo[490] = -1687610168;
        fi.iduo[491] = -812555955;
        fi.iduo[492] = -434643172;
        fi.iduo[493] = 139664307;
        fi.iduo[494] = 2047810233;
        fi.iduo[495] = 511366533;
        fi.iduo[496] = 1271612110;
        fi.iduo[497] = -569561432;
        fi.iduo[498] = -2041209819;
        fi.iduo[499] = -546673458;
    }

    private static /* synthetic */ void ihss() {
        fi.iduh[300] = -6039674705823389647L;
        fi.iduh[301] = -1142958666901657024L;
        fi.iduh[302] = -1739894639165143099L;
        fi.iduh[303] = 6726606150481397138L;
        fi.iduh[304] = 4320774885347093673L;
        fi.iduh[305] = -1276479263967329188L;
        fi.iduh[306] = 5237113157550849768L;
        fi.iduh[307] = -8429882801121787658L;
        fi.iduh[308] = 1985832194940839235L;
        fi.iduh[309] = -1569754940124138546L;
        fi.iduh[310] = 2901771615043276600L;
        fi.iduh[311] = 4404808176923783518L;
        fi.iduh[312] = 2644261651674878318L;
        fi.iduh[313] = -8569786698108499178L;
        fi.iduh[314] = -7311630117619387687L;
        fi.iduh[315] = -4263230394734201714L;
        fi.iduh[316] = 153281285518322394L;
        fi.iduh[317] = -6078128716778484584L;
        fi.iduh[318] = 7013432810732180123L;
        fi.iduh[319] = -1341253133817443355L;
        fi.iduh[320] = -2883563462354973721L;
        fi.iduh[321] = 6373415064498752909L;
        fi.iduh[322] = -1346314322346691915L;
        fi.iduh[323] = -5992329137204373098L;
        fi.iduh[324] = 4330225406382100903L;
        fi.iduh[325] = 2446031213468311776L;
        fi.iduh[326] = -6735918812616740401L;
        fi.iduh[327] = 6919513044178892598L;
        fi.iduh[328] = -8900858988739246949L;
        fi.iduh[329] = 1530578841364770406L;
        fi.iduh[330] = 8860600983611083526L;
        fi.iduh[331] = 982565619594066812L;
        fi.iduh[332] = -1152005008038681850L;
        fi.iduh[333] = -5435747129544675962L;
        fi.iduh[334] = 122111944560531356L;
        fi.iduh[335] = 2139503698131426533L;
        fi.iduh[336] = 8343509316867331061L;
        fi.iduh[337] = -9191127605479182681L;
        fi.iduh[338] = -8247698777940318709L;
        fi.iduh[339] = -2420097170827357566L;
        fi.iduh[340] = 5795452587967093394L;
        fi.iduh[341] = 9031642380734586225L;
        fi.iduh[342] = 1560930113682064377L;
        fi.iduh[343] = 7163608945517762087L;
        fi.iduh[344] = -5319092386515584903L;
        fi.iduh[345] = -1244199013802005239L;
        fi.iduh[346] = -4335142083990791096L;
        fi.iduh[347] = 7246124737478908422L;
        fi.iduh[348] = -630172780143115247L;
        fi.iduh[349] = 8361766102591317216L;
        fi.iduh[350] = 412176273349853953L;
        fi.iduh[351] = 9073179743344545695L;
        fi.iduh[352] = 3809031665346205711L;
        fi.iduh[353] = -1035266822567189051L;
        fi.iduh[354] = 4475869871024962418L;
        fi.iduh[355] = -2881598540057889652L;
        fi.iduh[356] = -7302502194802175173L;
        fi.iduh[357] = 9198373441561053557L;
        fi.iduh[358] = -620820030988361746L;
        fi.iduh[359] = -318480610413962924L;
        fi.iduh[360] = -6965254071990811133L;
        fi.iduh[361] = 690279491675188008L;
        fi.iduh[362] = 3395201074941892091L;
        fi.iduh[363] = 4011734919065397239L;
        fi.iduh[364] = 19384161632757003L;
        fi.iduh[365] = 3852125528722127113L;
        fi.iduh[366] = 4024368360090693417L;
        fi.iduh[367] = 5645916097017501592L;
        fi.iduh[368] = 271395417735508448L;
        fi.iduh[369] = -4309447983750370442L;
        fi.iduh[370] = -5145833473443041153L;
        fi.iduh[371] = -7929252268417968063L;
        fi.iduh[372] = -4586358517856125866L;
        fi.iduh[373] = 8161654596650744646L;
        fi.iduh[374] = 4614967862859347238L;
        fi.iduh[375] = -6542685024267905105L;
        fi.iduh[376] = 9101539222712734126L;
        fi.iduh[377] = -384062762129978044L;
        fi.iduh[378] = -526183988714080719L;
        fi.iduh[379] = 706041477374668111L;
        fi.iduh[380] = -2755207292585498950L;
        fi.iduh[381] = -182517382377030537L;
        fi.iduh[382] = 3520332825056947504L;
        fi.iduh[383] = -1609696622078294107L;
        fi.iduh[384] = 5797093287844739518L;
        fi.iduh[385] = 2079503487156082566L;
        fi.iduh[386] = 6859466810201038939L;
        fi.iduh[387] = -5534293652189850327L;
        fi.iduh[388] = -5073387114365704837L;
        fi.iduh[389] = 1398210542871723482L;
        fi.iduh[390] = -1709699770245849393L;
        fi.iduh[391] = -8456223194529066483L;
        fi.iduh[392] = 6127942003148026414L;
        fi.iduh[393] = -3979735400788346619L;
        fi.iduh[394] = -6470615065020339096L;
        fi.iduh[395] = -2532622300761942813L;
        fi.iduh[396] = 8527511719286181757L;
        fi.iduh[397] = 8697542023151967360L;
        fi.iduh[398] = -9023800269181086365L;
        fi.iduh[399] = -6299229371346488601L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void restoreAntiFlightItem() {
        v0 /* !! */  = fi.pm;
        if (true) ** GOTO lbl5
        block43: while (true) {
            v0 /* !! */  = (long)(fi.idui("igyq", iduf(int ), (int)234) - fi.idui("igyp", iduf(int ), (int)233));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 311602808: {
                    break block43;
                }
                case 1530912417: {
                    continue block43;
                }
            }
            break;
        }
        var3_1 = fi.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = fi.pm - fi.idui("igyr", iduf(int ), (int)235)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fi.idui("igys", idun(int ), (int)557)) break;
            v1 /* !! */  = (long)fi.idui("igyt", idun(int ), (int)558);
        }
        var2_2 /* !! */  = fi.b;
        v2 /* !! */  = fi.pm;
        if (true) ** GOTO lbl21
        block45: while (true) {
            v2 /* !! */  = (long)(fi.idui("igyv", iduf(int ), (int)237) - fi.idui("igyu", iduf(int ), (int)236));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 311602808: {
                    break block45;
                }
                case 499683003: {
                    continue block45;
                }
            }
            break;
        }
        var1_3 = fi.a;
        if (var3_1) {
            throw null;
lbl29:
            // 9 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        v3 /* !! */  = fi.pm;
        if (true) ** GOTO lbl36
        block47: while (true) {
            v3 /* !! */  = (long)(v4 - fi.idui("igyw", iduf(int ), (int)238));
lbl36:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1098289902: {
                    v4 = fi.idui("igyx", iduf(int ), (int)239);
                    continue block47;
                }
                case -843608285: {
                    v4 = fi.idui("igyy", iduf(int ), (int)240);
                    continue block47;
                }
                case 311602808: {
                    break block47;
                }
                case 799162766: {
                    v4 = fi.idui("igyz", iduf(int ), (int)241);
                    continue block47;
                }
            }
            break;
        }
        if (!this.antiFlightSwapApplied) ** GOTO lbl105
        if (var1_3) ** GOTO lbl29
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = fi.pm - fi.idui("igza", iduf(int ), (int)242)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == fi.idui("igzb", idun(int ), (int)559)) break;
            v5 /* !! */  = (long)fi.idui("igzc", idun(int ), (int)560);
        }
        if (this.antiFlightScreenSlot < 0) ** GOTO lbl105
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl29
                v6 /* !! */  = fi.pm;
                if (true) ** GOTO lbl64
                block49: while (true) {
                    v6 /* !! */  = (long)(v7 - fi.idui("igzd", iduf(int ), (int)243));
lbl64:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1080605695: {
                            v7 = fi.idui("igze", iduf(int ), (int)244);
                            continue block49;
                        }
                        case 311602808: {
                            break block49;
                        }
                        case 402410907: {
                            v7 = fi.idui("igzf", iduf(int ), (int)245);
                            continue block49;
                        }
                        case 440478665: {
                            v7 = fi.idui("igzg", iduf(int ), (int)246);
                            continue block49;
                        }
                    }
                    break;
                }
                v8 /* !! */  = fi.pm;
                if (true) ** GOTO lbl80
                block50: while (true) {
                    v8 /* !! */  = (long)(fi.idui("igzi", iduf(int ), (int)248) - fi.idui("igzh", iduf(int ), (int)247));
lbl80:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 311602808: {
                            break block50;
                        }
                        case 1425043427: {
                            continue block50;
                        }
                    }
                    break;
                }
                if (fi.mc.field_1724 == null) ** GOTO lbl105
                if (var1_3 || var1_3) ** GOTO lbl29
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = fi.pm - fi.idui("igzj", iduf(int ), (int)249)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == fi.idui("igzk", idun(int ), (int)561)) break;
                    v9 /* !! */  = (long)fi.idui("igzl", idun(int ), (int)562);
                }
                v10 = fi.idui("igzm", idun(int ), (int)563);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = fi.pm - fi.idui("igzn", iduf(int ), (int)250)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == fi.idui("igzo", idun(int ), (int)564)) break;
                    v11 /* !! */  = (long)fi.idui("igzp", idun(int ), (int)565);
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = fi.pm - fi.idui("igzq", iduf(int ), (int)251)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == fi.idui("igzr", idun(int ), (int)566)) break;
                    v12 /* !! */  = (long)fi.idui("igzs", idun(int ), (int)567);
                }
                nv.click(this.antiFlightScreenSlot, (int)v10, class_1713.field_7791);
                if (var1_3) ** GOTO lbl29
lbl105:
                // 4 sources

                if (var1_3 || var1_3) ** GOTO lbl29
                v13 = fi.idui("igzt", idun(int ), (int)568);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_5 = fi.pm - fi.idui("igzu", iduf(int ), (int)252)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == fi.idui("igzv", idun(int ), (int)569)) break;
                    v14 /* !! */  = (long)fi.idui("igzw", idun(int ), (int)570);
                }
                this.antiFlightScreenSlot = (int)v13;
                if (var1_3 || var1_3) ** GOTO lbl29
                v15 = fi.idui("igzx", idun(int ), (int)571);
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_6 = fi.pm - fi.idui("igzy", iduf(int ), (int)253)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == fi.idui("igzz", idun(int ), (int)572)) break;
                    v16 /* !! */  = (long)fi.idui("ihaa", idun(int ), (int)573);
                }
                this.antiFlightSwapped = v15;
                if (var1_3 || var1_3) ** GOTO lbl29
                v17 = fi.idui("ihab", idun(int ), (int)574);
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_7 = fi.pm - fi.idui("ihac", iduf(int ), (int)254)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == fi.idui("ihad", idun(int ), (int)575)) break;
                    v18 /* !! */  = (long)fi.idui("ihae", idun(int ), (int)576);
                }
                this.antiFlightSwapApplied = v17;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl132:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)fi.idui("ihaf", idun(int ), (int)577);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 1: {
                var2_2 /* !! */  = (int)fi.idui("ihag", idun(int ), (int)578);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl142:
            // 3 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)fi.idui("ihah", idun(int ), (int)579);
                } while (!var3_1);
                throw null;
            }
lbl147:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)fi.idui("ihai", idun(int ), (int)580);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl192
            }
            case 4: {
                do {
                    var2_2 /* !! */  = (int)fi.idui("ihaj", idun(int ), (int)581);
                } while (!var3_1);
                throw null;
            }
lbl157:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)fi.idui("ihak", idun(int ), (int)582);
                if (!var3_1) ** GOTO lbl142
                throw null;
            }
lbl161:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)fi.idui("ihal", idun(int ), (int)583);
                if (!var3_1) ** GOTO lbl142
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)fi.idui("iham", idun(int ), (int)584);
                if (!var3_1) ** GOTO lbl147
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)fi.idui("ihan", idun(int ), (int)585);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fi.idui("ihao", idun(int ), (int)586);
                    if (!var3_1) ** GOTO lbl161
                    throw null;
                }
            }
lbl179:
            // 5 sources

            case 10: {
                var2_2 /* !! */  = (int)fi.idui("ihap", idun(int ), (int)587);
                if (!var3_1) ** GOTO lbl132
                throw null;
            }
lbl183:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)fi.idui("ihaq", idun(int ), (int)588);
                if (!var3_1) ** GOTO lbl179
                throw null;
            }
            case 12: {
                do {
                    var2_2 /* !! */  = (int)fi.idui("ihar", idun(int ), (int)589);
                } while (!var3_1);
                throw null;
            }
lbl192:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)fi.idui("ihas", idun(int ), (int)590);
                if (!var3_1) ** GOTO lbl179
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)fi.idui("ihat", idun(int ), (int)591);
                if (!var3_1) ** GOTO lbl183
                throw null;
            }
            case 15: {
                var2_2 /* !! */  = (int)fi.idui("ihau", idun(int ), (int)592);
                if (!var3_1) ** GOTO lbl132
                throw null;
            }
            case 16: 
        }
        var2_2 /* !! */  = (int)fi.idui("ihav", idun(int ), (int)593);
        ** while (!var3_1)
lbl207:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ihoy() {
        fi.iduo[100] = 828199260;
        fi.iduo[101] = 352497597;
        fi.iduo[102] = -1181426847;
        fi.iduo[103] = -900274057;
        fi.iduo[104] = 200619733;
        fi.iduo[105] = -580687857;
        fi.iduo[106] = 436231350;
        fi.iduo[107] = -84123603;
        fi.iduo[108] = -410666441;
        fi.iduo[109] = 2048270323;
        fi.iduo[110] = 1167160812;
        fi.iduo[111] = -1484602832;
        fi.iduo[112] = 1913437030;
        fi.iduo[113] = 160658864;
        fi.iduo[114] = -1568623908;
        fi.iduo[115] = -1057202935;
        fi.iduo[116] = -1773986233;
        fi.iduo[117] = 199238895;
        fi.iduo[118] = 1840611391;
        fi.iduo[119] = -753997921;
        fi.iduo[120] = 553084640;
        fi.iduo[121] = -1924748289;
        fi.iduo[122] = 1016163151;
        fi.iduo[123] = -1039466733;
        fi.iduo[124] = 1333444772;
        fi.iduo[125] = -1940017933;
        fi.iduo[126] = -1485866480;
        fi.iduo[127] = -756956469;
        fi.iduo[128] = -1330326553;
        fi.iduo[129] = 291611230;
        fi.iduo[130] = -1231251403;
        fi.iduo[131] = 661865610;
        fi.iduo[132] = -942814979;
        fi.iduo[133] = 1282459725;
        fi.iduo[134] = -1884050696;
        fi.iduo[135] = 695820795;
        fi.iduo[136] = -623939496;
        fi.iduo[137] = 1005515543;
        fi.iduo[138] = 1595741045;
        fi.iduo[139] = 1663220355;
        fi.iduo[140] = 1336645069;
        fi.iduo[141] = 1288410004;
        fi.iduo[142] = -2035738064;
        fi.iduo[143] = 1064711130;
        fi.iduo[144] = 3931032;
        fi.iduo[145] = 614308744;
        fi.iduo[146] = 1017916478;
        fi.iduo[147] = -692538894;
        fi.iduo[148] = -1247396821;
        fi.iduo[149] = 455852370;
        fi.iduo[150] = -1592531049;
        fi.iduo[151] = 397200822;
        fi.iduo[152] = 330125253;
        fi.iduo[153] = -858954347;
        fi.iduo[154] = 715486200;
        fi.iduo[155] = -1781407282;
        fi.iduo[156] = -332575667;
        fi.iduo[157] = 1347350360;
        fi.iduo[158] = -1950389545;
        fi.iduo[159] = -1022501515;
        fi.iduo[160] = -1824217843;
        fi.iduo[161] = -1621784305;
        fi.iduo[162] = 1025390733;
        fi.iduo[163] = -1851723887;
        fi.iduo[164] = -1155636157;
        fi.iduo[165] = 529105355;
        fi.iduo[166] = 195827591;
        fi.iduo[167] = -2120260965;
        fi.iduo[168] = -612029574;
        fi.iduo[169] = 2072884276;
        fi.iduo[170] = 1800668351;
        fi.iduo[171] = 606024960;
        fi.iduo[172] = -576783103;
        fi.iduo[173] = 1077786366;
        fi.iduo[174] = 1851874999;
        fi.iduo[175] = 453790065;
        fi.iduo[176] = -1683090281;
        fi.iduo[177] = 336839580;
        fi.iduo[178] = 2104230893;
        fi.iduo[179] = -1737539821;
        fi.iduo[180] = 800278423;
        fi.iduo[181] = 657622625;
        fi.iduo[182] = -781509119;
        fi.iduo[183] = -1205843227;
        fi.iduo[184] = 1049805544;
        fi.iduo[185] = 1771982778;
        fi.iduo[186] = 780598533;
        fi.iduo[187] = -1264542761;
        fi.iduo[188] = -1608246997;
        fi.iduo[189] = -1644931540;
        fi.iduo[190] = 82092299;
        fi.iduo[191] = -1335219882;
        fi.iduo[192] = 1940059431;
        fi.iduo[193] = -391773026;
        fi.iduo[194] = 1663818822;
        fi.iduo[195] = 1907292490;
        fi.iduo[196] = -611981746;
        fi.iduo[197] = -1582727870;
        fi.iduo[198] = -1489817435;
        fi.iduo[199] = 746468105;
    }

    private static /* synthetic */ void ihqj() {
        fi.idup[0] = 501886628;
        fi.idup[1] = 1985186707;
        fi.idup[2] = 1204941724;
        fi.idup[3] = -1882425495;
        fi.idup[4] = -953764160;
        fi.idup[5] = -1086539096;
        fi.idup[6] = 222343694;
        fi.idup[7] = 1755338337;
        fi.idup[8] = -1701612327;
        fi.idup[9] = -1252351377;
        fi.idup[10] = -1931870583;
        fi.idup[11] = -2058519422;
        fi.idup[12] = 1088054234;
        fi.idup[13] = 1377132701;
        fi.idup[14] = 1543815181;
        fi.idup[15] = -1030112437;
        fi.idup[16] = 1443102545;
        fi.idup[17] = 1619729050;
        fi.idup[18] = 1453082982;
        fi.idup[19] = 1008235101;
        fi.idup[20] = 1582295046;
        fi.idup[21] = -1537621856;
        fi.idup[22] = -780252593;
        fi.idup[23] = -39727672;
        fi.idup[24] = -21326404;
        fi.idup[25] = -1219266182;
        fi.idup[26] = -455937635;
        fi.idup[27] = -49601789;
        fi.idup[28] = 16582698;
        fi.idup[29] = 1547341132;
        fi.idup[30] = 951963812;
        fi.idup[31] = -1637027420;
        fi.idup[32] = 735881250;
        fi.idup[33] = 574265832;
        fi.idup[34] = -1704158467;
        fi.idup[35] = 744792526;
        fi.idup[36] = -1288333579;
        fi.idup[37] = -502319641;
        fi.idup[38] = -1655697388;
        fi.idup[39] = -1039341605;
        fi.idup[40] = 2088449972;
        fi.idup[41] = -745479282;
        fi.idup[42] = 821543162;
        fi.idup[43] = -240234068;
        fi.idup[44] = 1427228157;
        fi.idup[45] = 1724434380;
        fi.idup[46] = 97925961;
        fi.idup[47] = 794639008;
        fi.idup[48] = -1654004554;
        fi.idup[49] = 739191433;
        fi.idup[50] = 83879219;
        fi.idup[51] = 182039959;
        fi.idup[52] = 1203039240;
        fi.idup[53] = 1641022784;
        fi.idup[54] = -1934291941;
        fi.idup[55] = 1595894613;
        fi.idup[56] = 335937082;
        fi.idup[57] = -591740682;
        fi.idup[58] = -431030917;
        fi.idup[59] = 921045913;
        fi.idup[60] = -687200975;
        fi.idup[61] = 1012621159;
        fi.idup[62] = 1516980744;
        fi.idup[63] = 1586445167;
        fi.idup[64] = -303676358;
        fi.idup[65] = -2139061374;
        fi.idup[66] = -605710573;
        fi.idup[67] = 1658098882;
        fi.idup[68] = -161750521;
        fi.idup[69] = 840240408;
        fi.idup[70] = -1873632719;
        fi.idup[71] = -979530955;
        fi.idup[72] = 1155665655;
        fi.idup[73] = 1229667279;
        fi.idup[74] = 1656052510;
        fi.idup[75] = -1064416718;
        fi.idup[76] = 695200666;
        fi.idup[77] = -429748900;
        fi.idup[78] = 1699821534;
        fi.idup[79] = -1403133886;
        fi.idup[80] = 596284276;
        fi.idup[81] = 1630587633;
        fi.idup[82] = -1878317276;
        fi.idup[83] = 1444105119;
        fi.idup[84] = -150966273;
        fi.idup[85] = 1764358643;
        fi.idup[86] = -2080586505;
        fi.idup[87] = 1160657927;
        fi.idup[88] = -1328007178;
        fi.idup[89] = 589964271;
        fi.idup[90] = 1895019923;
        fi.idup[91] = 1622777298;
        fi.idup[92] = 664411856;
        fi.idup[93] = -822138418;
        fi.idup[94] = 796784778;
        fi.idup[95] = 1675630152;
        fi.idup[96] = -1252207047;
        fi.idup[97] = 555039018;
        fi.idup[98] = 1920030121;
        fi.idup[99] = 1407361942;
    }

    private static /* synthetic */ void ihsn() {
        fi.idug[300] = 3586259293546445926L;
        fi.idug[301] = 8687271812962959646L;
        fi.idug[302] = -4954951937248577313L;
        fi.idug[303] = -5362866559969218704L;
        fi.idug[304] = 1792964699685241812L;
        fi.idug[305] = -5104734795351040543L;
        fi.idug[306] = -2446110197453242357L;
        fi.idug[307] = 5147795517522697105L;
        fi.idug[308] = 2032578822667950521L;
        fi.idug[309] = 5439685739974785174L;
        fi.idug[310] = 6635507396421048597L;
        fi.idug[311] = -5760616004404419288L;
        fi.idug[312] = 8043375223804759073L;
        fi.idug[313] = 7124204581696254268L;
        fi.idug[314] = -2058424293169141665L;
        fi.idug[315] = 376822945643468414L;
        fi.idug[316] = -2309399017729193432L;
        fi.idug[317] = -6838311229863296085L;
        fi.idug[318] = 5695416294343313213L;
        fi.idug[319] = 3138359314507288764L;
        fi.idug[320] = 2220251152931761474L;
        fi.idug[321] = 1477383672681716204L;
        fi.idug[322] = -3209156628900728619L;
        fi.idug[323] = -6359571386533636482L;
        fi.idug[324] = -2983763813848898086L;
        fi.idug[325] = -3919442004847302226L;
        fi.idug[326] = 1829651021717397815L;
        fi.idug[327] = -1270860083000149367L;
        fi.idug[328] = 5898271579616363796L;
        fi.idug[329] = 31103260196311989L;
        fi.idug[330] = -4963760830647815215L;
        fi.idug[331] = -1859021458069418879L;
        fi.idug[332] = -5594960333404041376L;
        fi.idug[333] = 7186826124795910216L;
        fi.idug[334] = 6700426348910061494L;
        fi.idug[335] = -3039257914352911437L;
        fi.idug[336] = -7404341037363080411L;
        fi.idug[337] = -9191127605479182681L;
        fi.idug[338] = 3440494207943280131L;
        fi.idug[339] = -2420097170827357566L;
        fi.idug[340] = 4281227629217613180L;
        fi.idug[341] = 629862997139386194L;
        fi.idug[342] = 7453466379001954693L;
        fi.idug[343] = -3695337267743414150L;
        fi.idug[344] = -915280050268013219L;
        fi.idug[345] = -4257755471545733835L;
        fi.idug[346] = 6999712874687635194L;
        fi.idug[347] = 3821191543297950380L;
        fi.idug[348] = -3435085272972249734L;
        fi.idug[349] = 4870490591903958139L;
        fi.idug[350] = -645250899212398053L;
        fi.idug[351] = -5671202415161226208L;
        fi.idug[352] = -7049420309344911857L;
        fi.idug[353] = 2957399589074143648L;
        fi.idug[354] = 2230183073679699885L;
        fi.idug[355] = 8519637473994320589L;
        fi.idug[356] = 772245869038106553L;
        fi.idug[357] = -3183931796962817113L;
        fi.idug[358] = -5592155406591904492L;
        fi.idug[359] = -6184386374196032654L;
        fi.idug[360] = 1963639009655264840L;
        fi.idug[361] = -3502649051293843733L;
        fi.idug[362] = 2432285944159356627L;
        fi.idug[363] = -3110202965173895249L;
        fi.idug[364] = -6893423793242176375L;
        fi.idug[365] = -4989990294616000334L;
        fi.idug[366] = 147233404819282967L;
        fi.idug[367] = -8390426419249864541L;
        fi.idug[368] = -4470584663100234608L;
        fi.idug[369] = 6293295193361812711L;
        fi.idug[370] = 21868235245834334L;
        fi.idug[371] = -5226868078937655619L;
        fi.idug[372] = -5762437178327891049L;
        fi.idug[373] = 7977382165824808431L;
        fi.idug[374] = 2932423821991122189L;
        fi.idug[375] = -2141210277459395690L;
        fi.idug[376] = -3635137497388023737L;
        fi.idug[377] = -2418075109629770164L;
        fi.idug[378] = -7023847397667038985L;
        fi.idug[379] = 647455855199583714L;
        fi.idug[380] = 8039330410827411051L;
        fi.idug[381] = -815159731637546966L;
        fi.idug[382] = -4929021642264813374L;
        fi.idug[383] = -1664605333773941600L;
        fi.idug[384] = 9196280437563902495L;
        fi.idug[385] = -565520956297204836L;
        fi.idug[386] = -7147701668492897254L;
        fi.idug[387] = 2687226344561462487L;
        fi.idug[388] = 9740798375683427L;
        fi.idug[389] = 6554110634654263753L;
        fi.idug[390] = 5596504914380357679L;
        fi.idug[391] = 4045347500591629620L;
        fi.idug[392] = -7447017753919573307L;
        fi.idug[393] = 1959683962910571767L;
        fi.idug[394] = 7965805500841225229L;
        fi.idug[395] = 7879208573227056029L;
        fi.idug[396] = 3676890336506509630L;
        fi.idug[397] = 5526040405300788677L;
        fi.idug[398] = -615888556096436908L;
        fi.idug[399] = -6212414239390996502L;
    }

    private static /* synthetic */ void ihsq() {
        fi.iduh[100] = 107487829462870803L;
        fi.iduh[101] = 8949057827108760423L;
        fi.iduh[102] = 3468101964246603581L;
        fi.iduh[103] = -7957951142932024836L;
        fi.iduh[104] = 5831037675038134769L;
        fi.iduh[105] = 706309400141290196L;
        fi.iduh[106] = -7597124396126275287L;
        fi.iduh[107] = 3466549712502099188L;
        fi.iduh[108] = -5065936409134167494L;
        fi.iduh[109] = -7046733439077871684L;
        fi.iduh[110] = -8179900897236905711L;
        fi.iduh[111] = 3519704346623220648L;
        fi.iduh[112] = 1660096426885853162L;
        fi.iduh[113] = -546967436798472415L;
        fi.iduh[114] = -4532556446728155938L;
        fi.iduh[115] = -4710796210584861715L;
        fi.iduh[116] = 5478363952525992482L;
        fi.iduh[117] = 454145321614828412L;
        fi.iduh[118] = -2932181110312444808L;
        fi.iduh[119] = 8615683327264107650L;
        fi.iduh[120] = 8859237184785249711L;
        fi.iduh[121] = -9097295044166189854L;
        fi.iduh[122] = 1153918089485867720L;
        fi.iduh[123] = -3318879218077196806L;
        fi.iduh[124] = 962511096621323769L;
        fi.iduh[125] = 7329784149821174709L;
        fi.iduh[126] = 15043576962697859L;
        fi.iduh[127] = -6896086961378527524L;
        fi.iduh[128] = -3634679481722622651L;
        fi.iduh[129] = -7623379285018310839L;
        fi.iduh[130] = 1644228645645336612L;
        fi.iduh[131] = 3117527717230064760L;
        fi.iduh[132] = -4418398164192741724L;
        fi.iduh[133] = -5585077026863212067L;
        fi.iduh[134] = 6054288478479693510L;
        fi.iduh[135] = 6972505850385825253L;
        fi.iduh[136] = 4084782369677036625L;
        fi.iduh[137] = 3903800116210855628L;
        fi.iduh[138] = -2178838827971372570L;
        fi.iduh[139] = 7960187959501341836L;
        fi.iduh[140] = 4730364553242354122L;
        fi.iduh[141] = 4892587008971294745L;
        fi.iduh[142] = -7960803530401028072L;
        fi.iduh[143] = -5290909968208247386L;
        fi.iduh[144] = -6411247721471331904L;
        fi.iduh[145] = -4287079993548659L;
        fi.iduh[146] = -8327913082840615303L;
        fi.iduh[147] = -820551682647959458L;
        fi.iduh[148] = 3067711743347949046L;
        fi.iduh[149] = -6419003831499093191L;
        fi.iduh[150] = 4190531153096599174L;
        fi.iduh[151] = 5445500691615105462L;
        fi.iduh[152] = -8377027421588802577L;
        fi.iduh[153] = 6980704137768657888L;
        fi.iduh[154] = 3445241820490587602L;
        fi.iduh[155] = -6435825295696949498L;
        fi.iduh[156] = -5478589510152374744L;
        fi.iduh[157] = -787252270025884171L;
        fi.iduh[158] = -2445550495829617597L;
        fi.iduh[159] = 801853096636427134L;
        fi.iduh[160] = 4435602641104863485L;
        fi.iduh[161] = 6287575492773637147L;
        fi.iduh[162] = -2028285393850161192L;
        fi.iduh[163] = -1935951342628708538L;
        fi.iduh[164] = -7920106477326670564L;
        fi.iduh[165] = -8549710534203295464L;
        fi.iduh[166] = -8969657959846534625L;
        fi.iduh[167] = 3806634717565031368L;
        fi.iduh[168] = -5318904521147480764L;
        fi.iduh[169] = -2162309518629314013L;
        fi.iduh[170] = -2032589965131145190L;
        fi.iduh[171] = -5162189332034551048L;
        fi.iduh[172] = -7342863864385903826L;
        fi.iduh[173] = 1422408253476693937L;
        fi.iduh[174] = -5423429538519152294L;
        fi.iduh[175] = -2868691732644182477L;
        fi.iduh[176] = -5395198755127951329L;
        fi.iduh[177] = 6200309777883871828L;
        fi.iduh[178] = -8126608243768153100L;
        fi.iduh[179] = -961363931413583688L;
        fi.iduh[180] = 8914308238248383585L;
        fi.iduh[181] = 568803650495375122L;
        fi.iduh[182] = -5219078829664972532L;
        fi.iduh[183] = -7725369124297383381L;
        fi.iduh[184] = 8150842612153648829L;
        fi.iduh[185] = 6462592975171510126L;
        fi.iduh[186] = -7849366718406642396L;
        fi.iduh[187] = -604177831425004625L;
        fi.iduh[188] = 8180960723372361077L;
        fi.iduh[189] = 713761998399425414L;
        fi.iduh[190] = -3338236313682010671L;
        fi.iduh[191] = -3083040727225579576L;
        fi.iduh[192] = 9092579476082729715L;
        fi.iduh[193] = -8656455679237550286L;
        fi.iduh[194] = 5196789894875389577L;
        fi.iduh[195] = 9053317756921971233L;
        fi.iduh[196] = -1725674309187239697L;
        fi.iduh[197] = -829734766650370665L;
        fi.iduh[198] = 3266763641316805473L;
        fi.iduh[199] = 4800837926578353370L;
    }

    private static /* synthetic */ void ihrm() {
        fi.idup[500] = 421649759;
        fi.idup[501] = -124782637;
        fi.idup[502] = 762181669;
        fi.idup[503] = 433056296;
        fi.idup[504] = -1484038555;
        fi.idup[505] = -407365685;
        fi.idup[506] = 1695782220;
        fi.idup[507] = -807467850;
        fi.idup[508] = -1021910851;
        fi.idup[509] = 2084750968;
        fi.idup[510] = -2144436771;
        fi.idup[511] = 1771011292;
        fi.idup[512] = 316398624;
        fi.idup[513] = -1557577506;
        fi.idup[514] = 2093848195;
        fi.idup[515] = -1025446263;
        fi.idup[516] = -666752275;
        fi.idup[517] = -718711442;
        fi.idup[518] = 1114284994;
        fi.idup[519] = 2077816014;
        fi.idup[520] = 1990076459;
        fi.idup[521] = 988136380;
        fi.idup[522] = 1805566372;
        fi.idup[523] = -2130218319;
        fi.idup[524] = 1751263693;
        fi.idup[525] = 897606516;
        fi.idup[526] = 1874080151;
        fi.idup[527] = 1137055041;
        fi.idup[528] = -2089362632;
        fi.idup[529] = -1019525490;
        fi.idup[530] = -538140011;
        fi.idup[531] = -1356504342;
        fi.idup[532] = 929053699;
        fi.idup[533] = 114117312;
        fi.idup[534] = -1339992187;
        fi.idup[535] = 1866627963;
        fi.idup[536] = 1478743704;
        fi.idup[537] = -247111488;
        fi.idup[538] = 1971198772;
        fi.idup[539] = -410762823;
        fi.idup[540] = 948278007;
        fi.idup[541] = -1332350996;
        fi.idup[542] = 1036594534;
        fi.idup[543] = -1982315559;
        fi.idup[544] = 26724446;
        fi.idup[545] = 476236639;
        fi.idup[546] = -820374983;
        fi.idup[547] = -580737860;
        fi.idup[548] = -1524093957;
        fi.idup[549] = 942848451;
        fi.idup[550] = -1121466884;
        fi.idup[551] = -897256735;
        fi.idup[552] = -1129158165;
        fi.idup[553] = -1476419729;
        fi.idup[554] = -1364045535;
        fi.idup[555] = 1625028244;
        fi.idup[556] = -991957591;
        fi.idup[557] = 1411158404;
        fi.idup[558] = -1743320301;
        fi.idup[559] = 1833537837;
        fi.idup[560] = 1753058293;
        fi.idup[561] = 1292414139;
        fi.idup[562] = 4785089;
        fi.idup[563] = 2087416674;
        fi.idup[564] = -106853986;
        fi.idup[565] = 1271180714;
        fi.idup[566] = -682341321;
        fi.idup[567] = -1449678792;
        fi.idup[568] = 1493231487;
        fi.idup[569] = -881517691;
        fi.idup[570] = -1207642028;
        fi.idup[571] = 1402026100;
        fi.idup[572] = 281905851;
        fi.idup[573] = 99049785;
        fi.idup[574] = -129046551;
        fi.idup[575] = 1268826361;
        fi.idup[576] = 456328908;
        fi.idup[577] = -1260078802;
        fi.idup[578] = 121285533;
        fi.idup[579] = 1410843797;
        fi.idup[580] = -335424142;
        fi.idup[581] = -2080366593;
        fi.idup[582] = 65035920;
        fi.idup[583] = 1826366428;
        fi.idup[584] = 1669132252;
        fi.idup[585] = -1337126120;
        fi.idup[586] = 1908975180;
        fi.idup[587] = 1617352073;
        fi.idup[588] = -18317822;
        fi.idup[589] = 267877854;
        fi.idup[590] = 616371814;
        fi.idup[591] = -511390097;
        fi.idup[592] = -1070115594;
        fi.idup[593] = 2126746977;
        fi.idup[594] = -9075127;
        fi.idup[595] = -1385120268;
        fi.idup[596] = -267506469;
        fi.idup[597] = 470686227;
        fi.idup[598] = -1062449296;
        fi.idup[599] = 2036571264;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void restoreMovement() {
        v0 /* !! */  = fi.pm;
        if (true) ** GOTO lbl5
        block30: while (true) {
            v0 /* !! */  = (long)(fi.idui("ihen", iduf(int ), (int)303) - fi.idui("ihem", iduf(int ), (int)302));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 311602808: {
                    break block30;
                }
                case 1983144734: {
                    continue block30;
                }
            }
            break;
        }
        var3_1 = fi.c;
        v1 /* !! */  = fi.pm;
        if (true) ** GOTO lbl15
        block31: while (true) {
            v1 /* !! */  = (long)(fi.idui("ihep", iduf(int ), (int)305) - fi.idui("iheo", iduf(int ), (int)304));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 311602808: {
                    break block31;
                }
                case 841167738: {
                    continue block31;
                }
            }
            break;
        }
        var2_2 /* !! */  = fi.b;
        v2 /* !! */  = fi.pm;
        if (true) ** GOTO lbl25
        block32: while (true) {
            v2 /* !! */  = (long)(v3 - fi.idui("iheq", iduf(int ), (int)306));
lbl25:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -575472427: {
                    v3 = fi.idui("iher", iduf(int ), (int)307);
                    continue block32;
                }
                case 311602808: {
                    break block32;
                }
                case 1017194423: {
                    v3 = fi.idui("ihes", iduf(int ), (int)308);
                    continue block32;
                }
            }
            break;
        }
        var1_3 = fi.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl40:
                    // 4 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl40
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = fi.pm - fi.idui("ihet", iduf(int ), (int)309)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == fi.idui("iheu", idun(int ), (int)641)) break;
                    v4 /* !! */  = (long)fi.idui("ihev", idun(int ), (int)642);
                }
                v5 /* !! */  = fi.pm;
                if (true) ** GOTO lbl52
                block35: while (true) {
                    v5 /* !! */  = (long)(v6 - fi.idui("ihew", iduf(int ), (int)310));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1049576674: {
                            v6 = fi.idui("ihex", iduf(int ), (int)311);
                            continue block35;
                        }
                        case -212194616: {
                            v6 = fi.idui("ihey", iduf(int ), (int)312);
                            continue block35;
                        }
                        case 311602808: {
                            break block35;
                        }
                        case 2029188072: {
                            v6 = fi.idui("ihez", iduf(int ), (int)313);
                            continue block35;
                        }
                    }
                    break;
                }
                if (!this.movement.isBlocked()) ** GOTO lbl78
                if (var1_3 || var1_3) ** GOTO lbl40
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = fi.pm - fi.idui("ihfa", iduf(int ), (int)314)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == fi.idui("ihfb", idun(int ), (int)643)) break;
                    v7 /* !! */  = (long)fi.idui("ihfc", idun(int ), (int)644);
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = fi.pm - fi.idui("ihfd", iduf(int ), (int)315)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == fi.idui("ihfe", idun(int ), (int)645)) break;
                    v8 /* !! */  = (long)fi.idui("ihff", idun(int ), (int)646);
                }
                this.movement.restoreFromCurrent();
                if (var1_3) ** GOTO lbl40
lbl78:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl81:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)fi.idui("ihfg", idun(int ), (int)647);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl108
            }
lbl86:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)fi.idui("ihfh", idun(int ), (int)648);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl95
            }
            case 2: {
                var2_2 /* !! */  = (int)fi.idui("ihfi", idun(int ), (int)649);
                if (!var3_1) ** GOTO lbl81
                throw null;
            }
lbl95:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)fi.idui("ihfj", idun(int ), (int)650);
                if (!var3_1) ** GOTO lbl81
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)fi.idui("ihfk", idun(int ), (int)651);
                if (!var3_1) ** GOTO lbl86
                throw null;
            }
lbl103:
            // 2 sources

            case 5: {
                do {
                    var2_2 /* !! */  = (int)fi.idui("ihfl", idun(int ), (int)652);
                } while (!var3_1);
                throw null;
            }
lbl108:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)fi.idui("ihfm", idun(int ), (int)653);
                if (!var3_1) break;
                throw null;
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fi.idui("ihfn", idun(int ), (int)654);
                    if (!var3_1) ** GOTO lbl103
                    throw null;
                }
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)fi.idui("ihfo", idun(int ), (int)655);
        ** while (!var3_1)
lbl120:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        block108: {
            block107: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = fi.pm - fi.idui("ihkw", iduf(int ), (int)369)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == fi.idui("ihkx", idun(int ), (int)740)) break;
                    v0 /* !! */  = (long)fi.idui("ihky", idun(int ), (int)741);
                }
                var3_1 = fi.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = fi.pm - fi.idui("ihkz", iduf(int ), (int)370)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == fi.idui("ihla", idun(int ), (int)742)) break;
                    v1 /* !! */  = (long)fi.idui("ihlb", idun(int ), (int)743);
                }
                var2_2 /* !! */  = fi.b;
                v2 /* !! */  = fi.pm;
                if (true) ** GOTO lbl17
                block69: while (true) {
                    v2 /* !! */  = (long)(v3 - fi.idui("ihlc", iduf(int ), (int)371));
lbl17:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1354602355: {
                            v3 = fi.idui("ihld", iduf(int ), (int)372);
                            continue block69;
                        }
                        case -546062630: {
                            v3 = fi.idui("ihle", iduf(int ), (int)373);
                            continue block69;
                        }
                        case 311602808: {
                            break block69;
                        }
                        case 1878804172: {
                            v3 = fi.idui("ihlf", iduf(int ), (int)374);
                            continue block69;
                        }
                    }
                    break;
                }
                var1_3 = fi.a;
                if (var3_1) {
                    throw null;
lbl32:
                    // 14 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl32
                v4 /* !! */  = fi.pm;
                if (true) ** GOTO lbl39
                block71: while (true) {
                    v4 /* !! */  = (long)(v5 - fi.idui("ihlg", iduf(int ), (int)375));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1697315165: {
                            v5 = fi.idui("ihlh", iduf(int ), (int)376);
                            continue block71;
                        }
                        case 311602808: {
                            break block71;
                        }
                        case 355540168: {
                            v5 = fi.idui("ihli", iduf(int ), (int)377);
                            continue block71;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = fi.pm - fi.idui("ihlj", iduf(int ), (int)378)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == fi.idui("ihlk", idun(int ), (int)744)) break;
                    v6 /* !! */  = (long)fi.idui("ihll", idun(int ), (int)745);
                }
                if (this.phase == fi$ActionPhase.WAIT_RESTORE) break block107;
                if (var1_3) ** GOTO lbl32
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = fi.pm - fi.idui("ihlm", iduf(int ), (int)379)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == fi.idui("ihln", idun(int ), (int)746)) break;
                    v7 /* !! */  = (long)fi.idui("ihlo", idun(int ), (int)747);
                }
                v8 /* !! */  = fi.pm;
                if (true) ** GOTO lbl64
                block74: while (true) {
                    v8 /* !! */  = (long)(fi.idui("ihlq", iduf(int ), (int)381) - fi.idui("ihlp", iduf(int ), (int)380));
lbl64:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1608158120: {
                            continue block74;
                        }
                        case 311602808: {
                            break block74;
                        }
                    }
                    break;
                }
                if (this.phase != fi$ActionPhase.WAIT_RESTORE_STOP) break block108;
                if (var1_3) ** GOTO lbl32
            }
            if (var1_3 || var1_3) ** GOTO lbl32
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_4 = fi.pm - fi.idui("ihlr", iduf(int ), (int)382)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == fi.idui("ihls", idun(int ), (int)748)) break;
                v9 /* !! */  = (long)fi.idui("ihlt", idun(int ), (int)749);
            }
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_5 = fi.pm - fi.idui("ihlu", iduf(int ), (int)383)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == fi.idui("ihlv", idun(int ), (int)750)) break;
                v10 /* !! */  = (long)fi.idui("ihlw", idun(int ), (int)751);
            }
            if (fi.mc.field_1724 == null) break block108;
            if (var1_3 || var1_3) ** GOTO lbl32
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_6 = fi.pm - fi.idui("ihlx", iduf(int ), (int)384)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == fi.idui("ihly", idun(int ), (int)752)) break;
                v11 /* !! */  = (long)fi.idui("ihlz", idun(int ), (int)753);
            }
            this.restoreTrap();
            if (var1_3) ** GOTO lbl32
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_7 = fi.pm - fi.idui("ihma", iduf(int ), (int)385)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == fi.idui("ihmb", idun(int ), (int)754)) break;
            v12 /* !! */  = (long)fi.idui("ihmc", idun(int ), (int)755);
        }
        if (!this.isAntiFlightPhase()) ** GOTO lbl165
        if (var1_3) ** GOTO lbl32
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_8 = fi.pm - fi.idui("ihmd", iduf(int ), (int)386)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == fi.idui("ihme", idun(int ), (int)756)) break;
            v13 /* !! */  = (long)fi.idui("ihmf", idun(int ), (int)757);
        }
        v14 /* !! */  = fi.pm;
        if (true) ** GOTO lbl110
        block80: while (true) {
            v14 /* !! */  = (long)(v15 - fi.idui("ihmg", iduf(int ), (int)387));
lbl110:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -746140458: {
                    v15 = fi.idui("ihmh", iduf(int ), (int)388);
                    continue block80;
                }
                case 311602808: {
                    break block80;
                }
                case 388793442: {
                    v15 = fi.idui("ihmi", iduf(int ), (int)389);
                    continue block80;
                }
                case 544441592: {
                    v15 = fi.idui("ihmj", iduf(int ), (int)390);
                    continue block80;
                }
            }
            break;
        }
        if (fi.mc.field_1724 == null) ** GOTO lbl165
        if (var1_3 || var1_3) ** GOTO lbl32
        v16 /* !! */  = fi.pm;
        if (true) ** GOTO lbl128
        block81: while (true) {
            v16 /* !! */  = (long)(v17 - fi.idui("ihmk", iduf(int ), (int)391));
lbl128:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1811041769: {
                    v17 = fi.idui("ihml", iduf(int ), (int)392);
                    continue block81;
                }
                case -856511443: {
                    v17 = fi.idui("ihmm", iduf(int ), (int)393);
                    continue block81;
                }
                case 311602808: {
                    break block81;
                }
            }
            break;
        }
        v18 /* !! */  = fi.pm;
        if (true) ** GOTO lbl141
        block82: while (true) {
            v18 /* !! */  = (long)(fi.idui("ihmo", iduf(int ), (int)395) - fi.idui("ihmn", iduf(int ), (int)394));
lbl141:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -1310021396: {
                    continue block82;
                }
                case 311602808: {
                    break block82;
                }
            }
            break;
        }
        v19 = fi.mc.field_1724;
        v20 = fi.idui("ihmp", idun(int ), (int)758);
        while (true) {
            if ((v21 /* !! */  = (cfr_temp_9 = fi.pm - fi.idui("ihmq", iduf(int ), (int)396)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v21 /* !! */  == fi.idui("ihmr", idun(int ), (int)759)) break;
            v21 /* !! */  = (long)fi.idui("ihms", idun(int ), (int)760);
        }
        v19.method_5660((boolean)v20);
        if (var1_3 || var1_3) ** GOTO lbl32
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_10 = fi.pm - fi.idui("ihmt", iduf(int ), (int)397)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == fi.idui("ihmu", idun(int ), (int)761)) break;
            v22 /* !! */  = (long)fi.idui("ihmv", idun(int ), (int)762);
        }
        this.restoreAntiFlightItem();
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl32
lbl165:
                // 3 sources

                if (var1_3 || var1_3) ** GOTO lbl32
                v23 /* !! */  = fi.pm;
                if (true) ** GOTO lbl170
                block85: while (true) {
                    v23 /* !! */  = (long)(v24 - fi.idui("ihmw", iduf(int ), (int)398));
lbl170:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1637042421: {
                            v24 = fi.idui("ihmx", iduf(int ), (int)399);
                            continue block85;
                        }
                        case -546936783: {
                            v24 = fi.idui("ihmy", iduf(int ), (int)400);
                            continue block85;
                        }
                        case 311602808: {
                            break block85;
                        }
                    }
                    break;
                }
                this.cleanup();
                if (var1_3 || var1_3) ** GOTO lbl32
                v25 = fi.idui("ihmz", iduf(int ), (int)401);
                v26 /* !! */  = fi.pm;
                if (true) ** GOTO lbl186
                block86: while (true) {
                    v26 /* !! */  = (long)(v27 - fi.idui("ihna", iduf(int ), (int)402));
lbl186:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case 311602808: {
                            break block86;
                        }
                        case 1144517363: {
                            v27 = fi.idui("ihnb", iduf(int ), (int)403);
                            continue block86;
                        }
                        case 1253357396: {
                            v27 = fi.idui("ihnc", iduf(int ), (int)404);
                            continue block86;
                        }
                    }
                    break;
                }
                this.fixAt = (long)v25;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl199:
            // 4 sources

            case 0: {
                var2_2 /* !! */  = (int)fi.idui("ihnd", idun(int ), (int)763);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl301
            }
            case 1: {
                var2_2 /* !! */  = (int)fi.idui("ihne", idun(int ), (int)764);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl250
            }
lbl209:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)fi.idui("ihnf", idun(int ), (int)765);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl301
            }
lbl214:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)fi.idui("ihng", idun(int ), (int)766);
                if (var3_1) {
                    throw null;
                }
            }
lbl218:
            // 4 sources

            case 4: {
                var2_2 /* !! */  = (int)fi.idui("ihnh", idun(int ), (int)767);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl259
            }
lbl223:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)fi.idui("ihni", idun(int ), (int)768);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl267
            }
            case 6: {
                var2_2 /* !! */  = (int)fi.idui("ihnj", idun(int ), (int)769);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl293
            }
lbl233:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)fi.idui("ihnk", idun(int ), (int)770);
                if (!var3_1) ** GOTO lbl209
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)fi.idui("ihnl", idun(int ), (int)771);
                if (!var3_1) ** GOTO lbl214
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)fi.idui("ihnm", idun(int ), (int)772);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl280
            }
            case 10: {
                var2_2 /* !! */  = (int)fi.idui("ihnn", idun(int ), (int)773);
                if (!var3_1) ** GOTO lbl218
                throw null;
            }
lbl250:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)fi.idui("ihno", idun(int ), (int)774);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl267
            }
lbl255:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)fi.idui("ihnp", idun(int ), (int)775);
                if (!var3_1) ** GOTO lbl209
                throw null;
            }
lbl259:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)fi.idui("ihnq", idun(int ), (int)776);
                if (!var3_1) ** GOTO lbl199
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)fi.idui("ihnr", idun(int ), (int)777);
                if (!var3_1) ** GOTO lbl233
                throw null;
            }
lbl267:
            // 3 sources

            case 15: {
                var2_2 /* !! */  = (int)fi.idui("ihns", idun(int ), (int)778);
                if (!var3_1) ** GOTO lbl223
                throw null;
            }
            case 16: {
                var2_2 /* !! */  = (int)fi.idui("ihnt", idun(int ), (int)779);
                if (!var3_1) ** GOTO lbl209
                throw null;
            }
            case 17: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fi.idui("ihnu", idun(int ), (int)780);
                    if (!var3_1) ** GOTO lbl255
                    throw null;
                }
            }
lbl280:
            // 2 sources

            case 18: {
                var2_2 /* !! */  = (int)fi.idui("ihnv", idun(int ), (int)781);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl301
            }
lbl285:
            // 2 sources

            case 19: {
                var2_2 /* !! */  = (int)fi.idui("ihnw", idun(int ), (int)782);
                if (!var3_1) ** GOTO lbl233
                throw null;
            }
            case 20: {
                var2_2 /* !! */  = (int)fi.idui("ihnx", idun(int ), (int)783);
                if (!var3_1) ** GOTO lbl223
                throw null;
            }
lbl293:
            // 2 sources

            case 21: {
                var2_2 /* !! */  = (int)fi.idui("ihny", idun(int ), (int)784);
                if (!var3_1) ** GOTO lbl285
                throw null;
            }
            case 22: {
                var2_2 /* !! */  = (int)fi.idui("ihnz", idun(int ), (int)785);
                if (!var3_1) ** GOTO lbl199
                throw null;
            }
lbl301:
            // 4 sources

            case 23: {
                var2_2 /* !! */  = (int)fi.idui("ihoa", idun(int ), (int)786);
                if (!var3_1) ** GOTO lbl199
                throw null;
            }
            case 24: 
        }
        var2_2 /* !! */  = (int)fi.idui("ihob", idun(int ), (int)787);
        ** while (!var3_1)
lbl308:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ihsp() {
        fi.iduh[0] = -7190383897357564898L;
        fi.iduh[1] = 7132709892785230407L;
        fi.iduh[2] = -5002849947877354012L;
        fi.iduh[3] = -2140849922037288793L;
        fi.iduh[4] = -5192087712555036460L;
        fi.iduh[5] = -7094902148505521877L;
        fi.iduh[6] = 2903190730913714935L;
        fi.iduh[7] = 6255862392413833227L;
        fi.iduh[8] = 6316088277421071568L;
        fi.iduh[9] = -1998841939520610947L;
        fi.iduh[10] = 2917808312297221406L;
        fi.iduh[11] = 5151891481243109299L;
        fi.iduh[12] = -5650079178560716855L;
        fi.iduh[13] = 5195576430441899975L;
        fi.iduh[14] = 3844814134946827731L;
        fi.iduh[15] = 7938060344328519949L;
        fi.iduh[16] = 7166778523248873218L;
        fi.iduh[17] = 689604204608710237L;
        fi.iduh[18] = 8149107204351046473L;
        fi.iduh[19] = 2004025240529091355L;
        fi.iduh[20] = 1566391082101016285L;
        fi.iduh[21] = -2274512489576974812L;
        fi.iduh[22] = 1221274210208185856L;
        fi.iduh[23] = 4958525176530312840L;
        fi.iduh[24] = 3517674753312899654L;
        fi.iduh[25] = -7145790430372841362L;
        fi.iduh[26] = 1466590813040918282L;
        fi.iduh[27] = 9069753271967079747L;
        fi.iduh[28] = -8509135081471855457L;
        fi.iduh[29] = -3043034572276502908L;
        fi.iduh[30] = -6333145456370883561L;
        fi.iduh[31] = 4670872911041060915L;
        fi.iduh[32] = 2041431001408131689L;
        fi.iduh[33] = 5872468124059019785L;
        fi.iduh[34] = 3750603587239576750L;
        fi.iduh[35] = 2383406473281867497L;
        fi.iduh[36] = -6491619060750315557L;
        fi.iduh[37] = -4935887695824480698L;
        fi.iduh[38] = 3046592073192799857L;
        fi.iduh[39] = 3332698083743928480L;
        fi.iduh[40] = -1844742398064936134L;
        fi.iduh[41] = 8835496926729376171L;
        fi.iduh[42] = 5723774147332495634L;
        fi.iduh[43] = 2961490945468655268L;
        fi.iduh[44] = -9171152012521542477L;
        fi.iduh[45] = -1407724606399987310L;
        fi.iduh[46] = -8171807549591681048L;
        fi.iduh[47] = -7558066461821969706L;
        fi.iduh[48] = 5036174606973554702L;
        fi.iduh[49] = -4892969010216206979L;
        fi.iduh[50] = -6864257612108273907L;
        fi.iduh[51] = 4648601411991170663L;
        fi.iduh[52] = 8595262010087499893L;
        fi.iduh[53] = -2462976290765271184L;
        fi.iduh[54] = 7367572246605778640L;
        fi.iduh[55] = 2453037811389948171L;
        fi.iduh[56] = -3630742070899258992L;
        fi.iduh[57] = 4680784145200738790L;
        fi.iduh[58] = -7105015311094220568L;
        fi.iduh[59] = 1306417138909275496L;
        fi.iduh[60] = -2108429456712950153L;
        fi.iduh[61] = -7207561634423497839L;
        fi.iduh[62] = 7902181084036348281L;
        fi.iduh[63] = 3727377067605233193L;
        fi.iduh[64] = -887780937290021385L;
        fi.iduh[65] = -9052946679422582092L;
        fi.iduh[66] = 5325246302485731330L;
        fi.iduh[67] = 105888941264900093L;
        fi.iduh[68] = -1696693855615231116L;
        fi.iduh[69] = -518971975403965627L;
        fi.iduh[70] = -6759086637193529336L;
        fi.iduh[71] = -3320398719451862643L;
        fi.iduh[72] = -3844896062067438874L;
        fi.iduh[73] = -3231235630234118550L;
        fi.iduh[74] = 7250822863197883761L;
        fi.iduh[75] = -8878494152194406734L;
        fi.iduh[76] = 3478237294595576123L;
        fi.iduh[77] = 4630827765324539207L;
        fi.iduh[78] = -7216408424910937825L;
        fi.iduh[79] = -2835418770771010L;
        fi.iduh[80] = -7181863619977416763L;
        fi.iduh[81] = -3197113630029738569L;
        fi.iduh[82] = -8908530011044185002L;
        fi.iduh[83] = 6518101502622864134L;
        fi.iduh[84] = -1833531060742753353L;
        fi.iduh[85] = -6518822866227617998L;
        fi.iduh[86] = 1766487250939521261L;
        fi.iduh[87] = 8737684234227344114L;
        fi.iduh[88] = -529675902243718002L;
        fi.iduh[89] = 1497400064280733894L;
        fi.iduh[90] = -5709916133811594749L;
        fi.iduh[91] = 5989556068013036626L;
        fi.iduh[92] = -3832374066180723566L;
        fi.iduh[93] = 2508224921747438327L;
        fi.iduh[94] = 4694881955895550090L;
        fi.iduh[95] = -8307393752611444760L;
        fi.iduh[96] = -289727439025720581L;
        fi.iduh[97] = 7559865389558877045L;
        fi.iduh[98] = -538377354449166590L;
        fi.iduh[99] = -7196058349146592281L;
    }

    private static /* synthetic */ void ihru() {
        fi.idup[600] = 715587771;
        fi.idup[601] = 822363626;
        fi.idup[602] = 1042657582;
        fi.idup[603] = 790370464;
        fi.idup[604] = 378496946;
        fi.idup[605] = 601956370;
        fi.idup[606] = 333395264;
        fi.idup[607] = -869471525;
        fi.idup[608] = -1681431732;
        fi.idup[609] = 1263673424;
        fi.idup[610] = 2086902739;
        fi.idup[611] = -307311054;
        fi.idup[612] = -63249071;
        fi.idup[613] = 368175186;
        fi.idup[614] = -669539485;
        fi.idup[615] = -1694186688;
        fi.idup[616] = 933387623;
        fi.idup[617] = -1394254694;
        fi.idup[618] = -1457361916;
        fi.idup[619] = 1943959293;
        fi.idup[620] = -413239025;
        fi.idup[621] = 999146099;
        fi.idup[622] = -1412722489;
        fi.idup[623] = -1936768979;
        fi.idup[624] = 1954147733;
        fi.idup[625] = 1781193377;
        fi.idup[626] = -2022279375;
        fi.idup[627] = 229860740;
        fi.idup[628] = 532351318;
        fi.idup[629] = -1085710287;
        fi.idup[630] = -1560056996;
        fi.idup[631] = -720593435;
        fi.idup[632] = 1575319761;
        fi.idup[633] = -169607723;
        fi.idup[634] = -450715375;
        fi.idup[635] = -732715926;
        fi.idup[636] = 187644627;
        fi.idup[637] = -1197950514;
        fi.idup[638] = 1033924112;
        fi.idup[639] = 1813781422;
        fi.idup[640] = 0x4CCB4C4B;
        fi.idup[641] = 147005207;
        fi.idup[642] = -2007837129;
        fi.idup[643] = -175240636;
        fi.idup[644] = 2098237024;
        fi.idup[645] = -1369330971;
        fi.idup[646] = 795859209;
        fi.idup[647] = 311411413;
        fi.idup[648] = 1913721626;
        fi.idup[649] = -1303548956;
        fi.idup[650] = -1273743858;
        fi.idup[651] = 965295335;
        fi.idup[652] = 1089626498;
        fi.idup[653] = 1302507919;
        fi.idup[654] = 125639228;
        fi.idup[655] = 1958941094;
        fi.idup[656] = 1896728343;
        fi.idup[657] = -1884629741;
        fi.idup[658] = 880426377;
        fi.idup[659] = -1048179027;
        fi.idup[660] = -1590117542;
        fi.idup[661] = 1097544551;
        fi.idup[662] = -40499592;
        fi.idup[663] = 961333800;
        fi.idup[664] = 1354433393;
        fi.idup[665] = 437734020;
        fi.idup[666] = -1189153655;
        fi.idup[667] = 1191226225;
        fi.idup[668] = -1159192732;
        fi.idup[669] = -1777849103;
        fi.idup[670] = 1883979864;
        fi.idup[671] = 1610136707;
        fi.idup[672] = -1626511394;
        fi.idup[673] = 1048900628;
        fi.idup[674] = 1558171008;
        fi.idup[675] = -1187689724;
        fi.idup[676] = 1281444460;
        fi.idup[677] = -721972995;
        fi.idup[678] = 1354943096;
        fi.idup[679] = -1907696049;
        fi.idup[680] = -48123379;
        fi.idup[681] = -456366342;
        fi.idup[682] = -794033810;
        fi.idup[683] = -1670451522;
        fi.idup[684] = -1203595786;
        fi.idup[685] = -385594336;
        fi.idup[686] = -2070141556;
        fi.idup[687] = -1783552297;
        fi.idup[688] = -1585876009;
        fi.idup[689] = 468948912;
        fi.idup[690] = -540556054;
        fi.idup[691] = 354640948;
        fi.idup[692] = -267996418;
        fi.idup[693] = -727766300;
        fi.idup[694] = -287169989;
        fi.idup[695] = 182035114;
        fi.idup[696] = -1397148799;
        fi.idup[697] = -403759025;
        fi.idup[698] = -1817213622;
        fi.idup[699] = -1514404346;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void beginStop(fi$ActionPhase var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fi.pm - fi.idui("ihcw", iduf(int ), (int)283)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fi.idui("ihcx", idun(int ), (int)618)) break;
            v0 /* !! */  = (long)fi.idui("ihcy", idun(int ), (int)619);
        }
        var4_2 = fi.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fi.pm - fi.idui("ihcz", iduf(int ), (int)284)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fi.idui("ihda", idun(int ), (int)620)) break;
            v1 /* !! */  = (long)fi.idui("ihdb", idun(int ), (int)621);
        }
        var3_3 /* !! */  = fi.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = fi.pm - fi.idui("ihdc", iduf(int ), (int)285)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fi.idui("ihdd", idun(int ), (int)622)) break;
            v2 /* !! */  = (long)fi.idui("ihde", idun(int ), (int)623);
        }
        var2_4 = fi.a;
        if (!var4_2) ** GOTO lbl25
        throw null;
lbl-1000:
        // 5 sources

        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl25:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl-1000
                v3 /* !! */  = fi.pm;
                if (true) ** GOTO lbl30
                block40: while (true) {
                    v3 /* !! */  = (long)(v4 - fi.idui("ihdf", iduf(int ), (int)286));
lbl30:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1310570419: {
                            v4 = fi.idui("ihdg", iduf(int ), (int)287);
                            continue block40;
                        }
                        case -560769120: {
                            v4 = fi.idui("ihdh", iduf(int ), (int)288);
                            continue block40;
                        }
                        case -160951926: {
                            v4 = fi.idui("ihdi", iduf(int ), (int)289);
                            continue block40;
                        }
                        case 311602808: {
                            break block40;
                        }
                    }
                    break;
                }
                v5 /* !! */  = fi.pm;
                if (true) ** GOTO lbl46
                block41: while (true) {
                    v5 /* !! */  = (long)(v6 - fi.idui("ihdj", iduf(int ), (int)290));
lbl46:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -981117559: {
                            v6 = fi.idui("ihdk", iduf(int ), (int)291);
                            continue block41;
                        }
                        case -305286741: {
                            v6 = fi.idui("ihdl", iduf(int ), (int)292);
                            continue block41;
                        }
                        case 311602808: {
                            break block41;
                        }
                    }
                    break;
                }
                this.movement.saveState();
                if (var2_4 || var2_4) ** GOTO lbl-1000
                v7 /* !! */  = fi.pm;
                if (true) ** GOTO lbl61
                block42: while (true) {
                    v7 /* !! */  = (long)(v8 - fi.idui("ihdm", iduf(int ), (int)293));
lbl61:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1316440320: {
                            v8 = fi.idui("ihdn", iduf(int ), (int)294);
                            continue block42;
                        }
                        case 147098981: {
                            v8 = fi.idui("ihdo", iduf(int ), (int)295);
                            continue block42;
                        }
                        case 311602808: {
                            break block42;
                        }
                        case 1938529851: {
                            v8 = fi.idui("ihdp", iduf(int ), (int)296);
                            continue block42;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = fi.pm - fi.idui("ihdq", iduf(int ), (int)297)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == fi.idui("ihdr", idun(int ), (int)624)) break;
                    v9 /* !! */  = (long)fi.idui("ihds", idun(int ), (int)625);
                }
                this.movement.block();
                if (var2_4 || var2_4) ** GOTO lbl-1000
                v10 = fi.idui("ihdt", idun(int ), (int)626);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = fi.pm - fi.idui("ihdu", iduf(int ), (int)298)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == fi.idui("ihdv", idun(int ), (int)627)) break;
                    v11 /* !! */  = (long)fi.idui("ihdw", idun(int ), (int)628);
                }
                this.stopTicks = (int)v10;
                if (var2_4 || var2_4) ** GOTO lbl-1000
                v12 /* !! */  = fi.pm;
                if (true) ** GOTO lbl92
                block45: while (true) {
                    v12 /* !! */  = (long)(v13 - fi.idui("ihdx", iduf(int ), (int)299));
lbl92:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1111955720: {
                            v13 = fi.idui("ihdy", iduf(int ), (int)300);
                            continue block45;
                        }
                        case 34281539: {
                            v13 = fi.idui("ihdz", iduf(int ), (int)301);
                            continue block45;
                        }
                        case 311602808: {
                            break block45;
                        }
                    }
                    break;
                }
                this.phase = var1_1;
                if (var2_4 || var2_4) continue block39;
                return;
lbl104:
                // 2 sources

                case 0: {
                    var3_3 /* !! */  = (int)fi.idui("ihea", idun(int ), (int)629);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl124
                }
lbl109:
                // 2 sources

                case 1: {
                    var3_3 /* !! */  = (int)fi.idui("iheb", idun(int ), (int)630);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl141
                }
lbl114:
                // 2 sources

                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var3_3 /* !! */  = (int)fi.idui("ihec", idun(int ), (int)631);
                        if (!var4_2) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 3: {
                    do {
                        var3_3 /* !! */  = (int)fi.idui("ihed", idun(int ), (int)632);
                    } while (!var4_2);
                    throw null;
                }
lbl124:
                // 3 sources

                case 4: {
                    var3_3 /* !! */  = (int)fi.idui("ihee", idun(int ), (int)633);
                    if (!var4_2) ** GOTO lbl109
                    throw null;
                }
lbl128:
                // 3 sources

                case 5: {
                    var3_3 /* !! */  = (int)fi.idui("ihef", idun(int ), (int)634);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl149
                }
                case 6: {
                    var3_3 /* !! */  = (int)fi.idui("iheg", idun(int ), (int)635);
                    if (!var4_2) ** GOTO lbl114
                    throw null;
                }
                case 7: {
                    var3_3 /* !! */  = (int)fi.idui("iheh", idun(int ), (int)636);
                    if (!var4_2) ** GOTO lbl128
                    throw null;
                }
lbl141:
                // 2 sources

                case 8: {
                    var3_3 /* !! */  = (int)fi.idui("ihei", idun(int ), (int)637);
                    if (!var4_2) ** GOTO lbl124
                    throw null;
                }
                case 9: {
                    var3_3 /* !! */  = (int)fi.idui("ihej", idun(int ), (int)638);
                    if (!var4_2) ** GOTO lbl104
                    throw null;
                }
lbl149:
                // 2 sources

                case 10: {
                    var3_3 /* !! */  = (int)fi.idui("ihek", idun(int ), (int)639);
                    if (!var4_2) ** GOTO lbl128
                    throw null;
                }
                case 11: 
            }
        }
        var3_3 /* !! */  = (int)fi.idui("ihel", idun(int ), (int)640);
        ** while (!var4_2)
lbl156:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ihsb() {
        fi.idup[700] = 2078657048;
        fi.idup[701] = 2010625087;
        fi.idup[702] = 512478745;
        fi.idup[703] = 2000017509;
        fi.idup[704] = 1423507933;
        fi.idup[705] = -611394254;
        fi.idup[706] = 1998886477;
        fi.idup[707] = -2069521982;
        fi.idup[708] = 1358739026;
        fi.idup[709] = 245266312;
        fi.idup[710] = 476677320;
        fi.idup[711] = 2131096783;
        fi.idup[712] = 1998201447;
        fi.idup[713] = 192562104;
        fi.idup[714] = -1200664208;
        fi.idup[715] = -686459713;
        fi.idup[716] = 1712488534;
        fi.idup[717] = 1431319161;
        fi.idup[718] = -430479352;
        fi.idup[719] = 2019631199;
        fi.idup[720] = -1541837523;
        fi.idup[721] = 1365746872;
        fi.idup[722] = -1542308246;
        fi.idup[723] = -1942609690;
        fi.idup[724] = -153660154;
        fi.idup[725] = -695387098;
        fi.idup[726] = 2115239465;
        fi.idup[727] = -1168872644;
        fi.idup[728] = 1700364342;
        fi.idup[729] = 1765239236;
        fi.idup[730] = 435038183;
        fi.idup[731] = -1026396105;
        fi.idup[732] = -1686314409;
        fi.idup[733] = 1815357076;
        fi.idup[734] = -1887600429;
        fi.idup[735] = -649846685;
        fi.idup[736] = -895332881;
        fi.idup[737] = -489573539;
        fi.idup[738] = 981678577;
        fi.idup[739] = -266562686;
        fi.idup[740] = 1234272735;
        fi.idup[741] = 1422839617;
        fi.idup[742] = -1971231513;
        fi.idup[743] = 2126409194;
        fi.idup[744] = 1461596428;
        fi.idup[745] = -1792440628;
        fi.idup[746] = -687239820;
        fi.idup[747] = 507880606;
        fi.idup[748] = 1120974265;
        fi.idup[749] = 1524007566;
        fi.idup[750] = 199889909;
        fi.idup[751] = 883060709;
        fi.idup[752] = -1271427132;
        fi.idup[753] = -1775748638;
        fi.idup[754] = 1907143316;
        fi.idup[755] = 1609576222;
        fi.idup[756] = -463659656;
        fi.idup[757] = -1339093637;
        fi.idup[758] = 1682366678;
        fi.idup[759] = -1199698665;
        fi.idup[760] = 1108986963;
        fi.idup[761] = 1013861396;
        fi.idup[762] = 1092424935;
        fi.idup[763] = 857142945;
        fi.idup[764] = 1987122704;
        fi.idup[765] = 2124576260;
        fi.idup[766] = -2052830667;
        fi.idup[767] = -449937815;
        fi.idup[768] = -139272519;
        fi.idup[769] = -163707402;
        fi.idup[770] = -1863641433;
        fi.idup[771] = -1567444018;
        fi.idup[772] = 698503360;
        fi.idup[773] = -1865800920;
        fi.idup[774] = -2038243566;
        fi.idup[775] = 1638485769;
        fi.idup[776] = 1151429331;
        fi.idup[777] = 1380785074;
        fi.idup[778] = -96114460;
        fi.idup[779] = 425512440;
        fi.idup[780] = 120192420;
        fi.idup[781] = -1959612893;
        fi.idup[782] = -1008880902;
        fi.idup[783] = -1450220787;
        fi.idup[784] = -765681208;
        fi.idup[785] = -666528880;
        fi.idup[786] = -796542946;
        fi.idup[787] = 1868128136;
        fi.idup[788] = -594148164;
        fi.idup[789] = -1039893244;
        fi.idup[790] = -10721570;
        fi.idup[791] = 690239116;
        fi.idup[792] = 95080121;
        fi.idup[793] = 467602492;
        fi.idup[794] = -679772469;
        fi.idup[795] = 999181401;
        fi.idup[796] = 1743859922;
        fi.idup[797] = -1083912056;
        fi.idup[798] = -377534268;
        fi.idup[799] = -251701662;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isAntiFlightPhase() {
        block79: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = fi.pm - fi.idui("ihaw", iduf(int ), (int)255)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == fi.idui("ihax", idun(int ), (int)594)) break;
                v0 /* !! */  = (long)fi.idui("ihay", idun(int ), (int)595);
            }
            var3_1 = fi.c;
            v1 /* !! */  = fi.pm;
            if (true) ** GOTO lbl12
            block54: while (true) {
                v1 /* !! */  = (long)(fi.idui("ihba", iduf(int ), (int)257) - fi.idui("ihaz", iduf(int ), (int)256));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case 0x55C5454: {
                        continue block54;
                    }
                    case 311602808: {
                        break block54;
                    }
                }
                break;
            }
            var2_2 /* !! */  = fi.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_1 = fi.pm - fi.idui("ihbb", iduf(int ), (int)258)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == fi.idui("ihbc", idun(int ), (int)596)) break;
                v2 /* !! */  = (long)fi.idui("ihbd", idun(int ), (int)597);
            }
            var1_3 = fi.a;
            if (var3_1) {
                throw null;
lbl27:
                // 7 sources

                return (boolean)fi.idui("ihbe", idun(int ), (int)598);
            }
            if (var1_3 || var1_3) ** GOTO lbl27
            v3 /* !! */  = fi.pm;
            if (true) ** GOTO lbl34
            block57: while (true) {
                v3 /* !! */  = (long)(v4 - fi.idui("ihbf", iduf(int ), (int)259));
lbl34:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1625516337: {
                        v4 = fi.idui("ihbg", iduf(int ), (int)260);
                        continue block57;
                    }
                    case 311602808: {
                        break block57;
                    }
                    case 650630904: {
                        v4 = fi.idui("ihbh", iduf(int ), (int)261);
                        continue block57;
                    }
                    case 805281442: {
                        v4 = fi.idui("ihbi", iduf(int ), (int)262);
                        continue block57;
                    }
                }
                break;
            }
            v5 /* !! */  = fi.pm;
            if (true) ** GOTO lbl50
            block58: while (true) {
                v5 /* !! */  = (long)(v6 - fi.idui("ihbj", iduf(int ), (int)263));
lbl50:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1508555609: {
                        v6 = fi.idui("ihbk", iduf(int ), (int)264);
                        continue block58;
                    }
                    case -668685558: {
                        v6 = fi.idui("ihbl", iduf(int ), (int)265);
                        continue block58;
                    }
                    case 311602808: {
                        break block58;
                    }
                    case 1254502454: {
                        v6 = fi.idui("ihbm", iduf(int ), (int)266);
                        continue block58;
                    }
                }
                break;
            }
            if (this.phase == fi$ActionPhase.ANTI_WAIT_STOP) break block79;
            if (var1_3) ** GOTO lbl27
            v7 /* !! */  = fi.pm;
            if (true) ** GOTO lbl68
            block59: while (true) {
                v7 /* !! */  = (long)(fi.idui("ihbo", iduf(int ), (int)268) - fi.idui("ihbn", iduf(int ), (int)267));
lbl68:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -709827661: {
                        continue block59;
                    }
                    case 311602808: {
                        break block59;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_2 = fi.pm - fi.idui("ihbp", iduf(int ), (int)269)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v8 /* !! */  == fi.idui("ihbq", idun(int ), (int)599)) break;
                v8 /* !! */  = (long)fi.idui("ihbr", idun(int ), (int)600);
            }
            if (this.phase == fi$ActionPhase.ANTI_WAIT_PRESS) break block79;
            if (var1_3) ** GOTO lbl27
            v9 /* !! */  = fi.pm;
            if (true) ** GOTO lbl85
            block61: while (true) {
                v9 /* !! */  = (long)(v10 - fi.idui("ihbs", iduf(int ), (int)270));
lbl85:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -724479978: {
                        v10 = fi.idui("ihbt", iduf(int ), (int)271);
                        continue block61;
                    }
                    case 311602808: {
                        break block61;
                    }
                    case 1081653299: {
                        v10 = fi.idui("ihbu", iduf(int ), (int)272);
                        continue block61;
                    }
                    case 1321019912: {
                        v10 = fi.idui("ihbv", iduf(int ), (int)273);
                        continue block61;
                    }
                }
                break;
            }
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_3 = fi.pm - fi.idui("ihbw", iduf(int ), (int)274)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v11 /* !! */  == fi.idui("ihbx", idun(int ), (int)601)) break;
                v11 /* !! */  = (long)fi.idui("ihby", idun(int ), (int)602);
            }
            if (this.phase == fi$ActionPhase.ANTI_WAIT_RELEASE) break block79;
            if (var1_3) ** GOTO lbl27
            v12 /* !! */  = fi.pm;
            if (true) ** GOTO lbl109
            block63: while (true) {
                v12 /* !! */  = (long)(v13 - fi.idui("ihbz", iduf(int ), (int)275));
lbl109:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case 114700556: {
                        v13 = fi.idui("ihca", iduf(int ), (int)276);
                        continue block63;
                    }
                    case 311602808: {
                        break block63;
                    }
                    case 676420137: {
                        v13 = fi.idui("ihcb", iduf(int ), (int)277);
                        continue block63;
                    }
                    case 1563154829: {
                        v13 = fi.idui("ihcc", iduf(int ), (int)278);
                        continue block63;
                    }
                }
                break;
            }
            v14 /* !! */  = fi.pm;
            if (true) ** GOTO lbl125
            block64: while (true) {
                v14 /* !! */  = (long)(v15 - fi.idui("ihcd", iduf(int ), (int)279));
lbl125:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -1231191168: {
                        v15 = fi.idui("ihce", iduf(int ), (int)280);
                        continue block64;
                    }
                    case 311602808: {
                        break block64;
                    }
                    case 503178847: {
                        v15 = fi.idui("ihcf", iduf(int ), (int)281);
                        continue block64;
                    }
                    case 1944738761: {
                        v15 = fi.idui("ihcg", iduf(int ), (int)282);
                        continue block64;
                    }
                }
                break;
            }
            if (this.phase != fi$ActionPhase.ANTI_WAIT_RESTORE) ** GOTO lbl148
            if (var1_3) ** GOTO lbl27
        }
        if (var1_3 || var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block38 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v16 = fi.idui("ihch", idun(int ), (int)603);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl148:
            // 1 sources

            if (!var1_3 && !var1_3) ** break;
            ** continue;
            v16 = fi.idui("ihci", idun(int ), (int)604);
lbl151:
            // 2 sources

            return (boolean)v16;
lbl152:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)fi.idui("ihcj", idun(int ), (int)605);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl157:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)fi.idui("ihck", idun(int ), (int)606);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl162:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)fi.idui("ihcl", idun(int ), (int)607);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 3: {
                var2_2 /* !! */  = (int)fi.idui("ihcm", idun(int ), (int)608);
                if (!var3_1) ** GOTO lbl152
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fi.idui("ihcn", idun(int ), (int)609);
                    if (!var3_1) break block38;
                    throw null;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)fi.idui("ihco", idun(int ), (int)610);
                if (!var3_1) ** GOTO lbl162
                throw null;
            }
            case 6: {
                do {
                    var2_2 /* !! */  = (int)fi.idui("ihcp", idun(int ), (int)611);
                } while (!var3_1);
                throw null;
            }
lbl185:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)fi.idui("ihcq", idun(int ), (int)612);
                if (!var3_1) ** GOTO lbl157
                throw null;
            }
lbl189:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)fi.idui("ihcr", idun(int ), (int)613);
                if (!var3_1) ** GOTO lbl162
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)fi.idui("ihcs", idun(int ), (int)614);
                if (!var3_1) ** GOTO lbl152
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)fi.idui("ihct", idun(int ), (int)615);
                if (!var3_1) break;
                throw null;
            }
lbl201:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)fi.idui("ihcu", idun(int ), (int)616);
                if (!var3_1) ** GOTO lbl162
                throw null;
            }
            case 12: 
        }
        var2_2 /* !! */  = (int)fi.idui("ihcv", idun(int ), (int)617);
        ** while (!var3_1)
lbl208:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean prepareTrap() {
        v0 /* !! */  = fi.pm;
        if (true) ** GOTO lbl5
        block98: while (true) {
            v0 /* !! */  = (long)(v1 - fi.idui("ignj", iduf(int ), (int)120));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1331131392: {
                    v1 = fi.idui("ignk", iduf(int ), (int)121);
                    continue block98;
                }
                case -806864165: {
                    v1 = fi.idui("ignl", iduf(int ), (int)122);
                    continue block98;
                }
                case 311602808: {
                    break block98;
                }
                case 1135317598: {
                    v1 = fi.idui("ignm", iduf(int ), (int)123);
                    continue block98;
                }
            }
            break;
        }
        var5_1 = fi.c;
        v2 /* !! */  = fi.pm;
        if (true) ** GOTO lbl22
        block99: while (true) {
            v2 /* !! */  = (long)(fi.idui("igno", iduf(int ), (int)125) - fi.idui("ignn", iduf(int ), (int)124));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1007119771: {
                    continue block99;
                }
                case 311602808: {
                    break block99;
                }
            }
            break;
        }
        var4_2 /* !! */  = fi.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = fi.pm - fi.idui("ignp", iduf(int ), (int)126)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == fi.idui("ignq", idun(int ), (int)378)) break;
            v3 /* !! */  = (long)fi.idui("ignr", idun(int ), (int)379);
        }
        var3_3 = fi.a;
        if (var5_1) {
            throw null;
lbl36:
            // 12 sources

            return (boolean)fi.idui("igns", idun(int ), (int)380);
        }
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3 || var3_3) ** GOTO lbl36
                v4 /* !! */  = fi.pm;
                if (true) ** GOTO lbl46
                block102: while (true) {
                    v4 /* !! */  = (long)(v5 - fi.idui("ignt", iduf(int ), (int)127));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -327555748: {
                            v5 = fi.idui("ignu", iduf(int ), (int)128);
                            continue block102;
                        }
                        case 311602808: {
                            break block102;
                        }
                        case 1082125389: {
                            v5 = fi.idui("ignv", iduf(int ), (int)129);
                            continue block102;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = fi.pm - fi.idui("ignw", iduf(int ), (int)130)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == fi.idui("ignx", idun(int ), (int)381)) break;
                    v6 /* !! */  = (long)fi.idui("igny", idun(int ), (int)382);
                }
                var1_4 = nv.findItemInHotbar(class_1802.field_8207);
                if (var3_3 || var3_3) ** GOTO lbl36
                if (var1_4 != fi.idui("ignz", idun(int ), (int)383)) ** GOTO lbl90
                if (var3_3) ** GOTO lbl36
                v7 /* !! */  = fi.pm;
                if (true) ** GOTO lbl68
                block104: while (true) {
                    v7 /* !! */  = (long)(v8 - fi.idui("igoa", iduf(int ), (int)131));
lbl68:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1458566973: {
                            v8 = fi.idui("igob", iduf(int ), (int)132);
                            continue block104;
                        }
                        case -1039206050: {
                            v8 = fi.idui("igoc", iduf(int ), (int)133);
                            continue block104;
                        }
                        case 311602808: {
                            break block104;
                        }
                    }
                    break;
                }
                v9 /* !! */  = fi.pm;
                if (true) ** GOTO lbl81
                block105: while (true) {
                    v9 /* !! */  = (long)(fi.idui("igoe", iduf(int ), (int)135) - fi.idui("igod", iduf(int ), (int)134));
lbl81:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -2052031839: {
                            continue block105;
                        }
                        case 311602808: {
                            break block105;
                        }
                    }
                    break;
                }
                v10 /* !! */  = (CallSite)nv.findItemInInventory(class_1802.field_8207);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl92
lbl90:
                // 1 sources

                if (var3_3 || var3_3) ** GOTO lbl36
                v10 /* !! */  = var2_5 = fi.idui("igof", idun(int ), (int)384);
lbl92:
                // 2 sources

                if (var3_3 || var3_3) ** GOTO lbl36
                if (var1_4 != fi.idui("igog", idun(int ), (int)385)) ** GOTO lbl98
                if (var3_3) ** GOTO lbl36
                if (var2_5 != fi.idui("igoh", idun(int ), (int)386)) ** GOTO lbl98
                if (var3_3 || var3_3) ** GOTO lbl36
                return (boolean)fi.idui("igoi", idun(int ), (int)387);
lbl98:
                // 2 sources

                if (var3_3 || var3_3) ** GOTO lbl36
                v11 /* !! */  = fi.pm;
                if (true) ** GOTO lbl103
                block106: while (true) {
                    v11 /* !! */  = (long)(v12 - fi.idui("igoj", iduf(int ), (int)136));
lbl103:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1385009450: {
                            v12 = fi.idui("igok", iduf(int ), (int)137);
                            continue block106;
                        }
                        case -553200391: {
                            v12 = fi.idui("igol", iduf(int ), (int)138);
                            continue block106;
                        }
                        case 311602808: {
                            break block106;
                        }
                        case 794480174: {
                            v12 = fi.idui("igom", iduf(int ), (int)139);
                            continue block106;
                        }
                    }
                    break;
                }
                v13 /* !! */  = fi.pm;
                if (true) ** GOTO lbl119
                block107: while (true) {
                    v13 /* !! */  = (long)(v14 - fi.idui("igon", iduf(int ), (int)140));
lbl119:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case 311602808: {
                            break block107;
                        }
                        case 617075693: {
                            v14 = fi.idui("igoo", iduf(int ), (int)141);
                            continue block107;
                        }
                        case 867098496: {
                            v14 = fi.idui("igop", iduf(int ), (int)142);
                            continue block107;
                        }
                    }
                    break;
                }
                v15 = fi.mc.field_1724;
                v16 /* !! */  = fi.pm;
                if (true) ** GOTO lbl133
                block108: while (true) {
                    v16 /* !! */  = (long)(v17 - fi.idui("igoq", iduf(int ), (int)143));
lbl133:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1357846692: {
                            v17 = fi.idui("igor", iduf(int ), (int)144);
                            continue block108;
                        }
                        case 141954024: {
                            v17 = fi.idui("igos", iduf(int ), (int)145);
                            continue block108;
                        }
                        case 311602808: {
                            break block108;
                        }
                        case 1152619892: {
                            v17 = fi.idui("igot", iduf(int ), (int)146);
                            continue block108;
                        }
                    }
                    break;
                }
                v18 = v15.method_31548();
                v19 /* !! */  = fi.pm;
                if (true) ** GOTO lbl150
                block109: while (true) {
                    v19 /* !! */  = (long)(fi.idui("igov", iduf(int ), (int)148) - fi.idui("igou", iduf(int ), (int)147));
lbl150:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case 311602808: {
                            break block109;
                        }
                        case 1805364175: {
                            continue block109;
                        }
                    }
                    break;
                }
                v20 = v18.method_67532();
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_2 = fi.pm - fi.idui("igow", iduf(int ), (int)149)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == fi.idui("igox", idun(int ), (int)388)) break;
                    v21 /* !! */  = (long)fi.idui("igoy", idun(int ), (int)389);
                }
                this.previousSlot = v20;
                if (var3_3 || var3_3) ** GOTO lbl36
                if (var1_4 != fi.idui("igoz", idun(int ), (int)390)) {
                    v22 = fi.idui("igpa", idun(int ), (int)391);
                    if (var5_1) {
                        throw null;
                    }
                } else {
                    v22 = fi.idui("igpb", idun(int ), (int)392);
                }
                v23 /* !! */  = fi.pm;
                if (true) ** GOTO lbl173
                block111: while (true) {
                    v23 /* !! */  = (long)(v24 - fi.idui("igpc", iduf(int ), (int)150));
lbl173:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -985075354: {
                            v24 = fi.idui("igpd", iduf(int ), (int)151);
                            continue block111;
                        }
                        case -109118660: {
                            v24 = fi.idui("igpe", iduf(int ), (int)152);
                            continue block111;
                        }
                        case 311602808: {
                            break block111;
                        }
                        case 1274325993: {
                            v24 = fi.idui("igpf", iduf(int ), (int)153);
                            continue block111;
                        }
                    }
                    break;
                }
                this.fromHotbar = v22;
                if (var3_3 || var3_3) ** GOTO lbl36
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_3 = fi.pm - fi.idui("igpg", iduf(int ), (int)154)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == fi.idui("igph", idun(int ), (int)393)) break;
                    v25 /* !! */  = (long)fi.idui("igpi", idun(int ), (int)394);
                }
                if (this.fromHotbar) {
                    v26 /* !! */  = var1_4;
                    if (var5_1) {
                        throw null;
                    }
                } else {
                    v26 /* !! */  = (int)var2_5;
                }
                v27 /* !! */  = fi.pm;
                if (true) ** GOTO lbl202
                block113: while (true) {
                    v27 /* !! */  = (long)(fi.idui("igpk", iduf(int ), (int)156) - fi.idui("igpj", iduf(int ), (int)155));
lbl202:
                    // 2 sources

                    switch ((int)v27 /* !! */ ) {
                        case -211822686: {
                            continue block113;
                        }
                        case 311602808: {
                            break block113;
                        }
                    }
                    break;
                }
                this.targetSlot = v26 /* !! */ ;
                if (var3_3 || var3_3) ** GOTO lbl36
                v28 /* !! */  = fi.pm;
                if (true) ** GOTO lbl213
                block114: while (true) {
                    v28 /* !! */  = (long)(v29 - fi.idui("igpl", iduf(int ), (int)157));
lbl213:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -1499957463: {
                            v29 = fi.idui("igpm", iduf(int ), (int)158);
                            continue block114;
                        }
                        case 311602808: {
                            break block114;
                        }
                        case 630389595: {
                            v29 = fi.idui("igpn", iduf(int ), (int)159);
                            continue block114;
                        }
                        case 1858310762: {
                            v29 = fi.idui("igpo", iduf(int ), (int)160);
                            continue block114;
                        }
                    }
                    break;
                }
                if (!this.fromHotbar) ** GOTO lbl230
                v30 = var1_4;
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl240
lbl230:
                // 1 sources

                v31 /* !! */  = fi.pm;
                if (true) ** GOTO lbl234
                block115: while (true) {
                    v31 /* !! */  = (long)(fi.idui("igpq", iduf(int ), (int)162) - fi.idui("igpp", iduf(int ), (int)161));
lbl234:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -2095414128: {
                            continue block115;
                        }
                        case 311602808: {
                            break block115;
                        }
                    }
                    break;
                }
                v30 = this.previousSlot;
lbl240:
                // 2 sources

                v32 /* !! */  = fi.pm;
                if (true) ** GOTO lbl244
                block116: while (true) {
                    v32 /* !! */  = (long)(v33 - fi.idui("igpr", iduf(int ), (int)163));
lbl244:
                    // 2 sources

                    switch ((int)v32 /* !! */ ) {
                        case 43743331: {
                            v33 = fi.idui("igps", iduf(int ), (int)164);
                            continue block116;
                        }
                        case 311602808: {
                            break block116;
                        }
                        case 1418562054: {
                            v33 = fi.idui("igpt", iduf(int ), (int)165);
                            continue block116;
                        }
                        case 2145253438: {
                            v33 = fi.idui("igpu", iduf(int ), (int)166);
                            continue block116;
                        }
                    }
                    break;
                }
                this.temporaryHotbarSlot = v30;
                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return (boolean)fi.idui("igpv", idun(int ), (int)395);
            }
lbl260:
            // 3 sources

            case 0: {
                var4_2 /* !! */  = (int)fi.idui("igpw", idun(int ), (int)396);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl304
            }
            case 1: {
                var4_2 /* !! */  = (int)fi.idui("igpx", idun(int ), (int)397);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl314
            }
lbl270:
            // 3 sources

            case 2: {
                var4_2 /* !! */  = (int)fi.idui("igpy", idun(int ), (int)398);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl339
            }
lbl275:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)fi.idui("igpz", idun(int ), (int)399);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl318
                    break;
                }
            }
            case 4: {
                var4_2 /* !! */  = (int)fi.idui("igqa", idun(int ), (int)400);
                if (!var5_1) break;
                throw null;
            }
            case 5: {
                do {
                    var4_2 /* !! */  = (int)fi.idui("igqb", idun(int ), (int)401);
                } while (!var5_1);
                throw null;
            }
            case 6: {
                var4_2 /* !! */  = (int)fi.idui("igqc", idun(int ), (int)402);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl339
            }
lbl295:
            // 2 sources

            case 7: {
                var4_2 /* !! */  = (int)fi.idui("igqd", idun(int ), (int)403);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl314
            }
            case 8: {
                var4_2 /* !! */  = (int)fi.idui("igqe", idun(int ), (int)404);
                if (!var5_1) ** GOTO lbl295
                throw null;
            }
lbl304:
            // 3 sources

            case 9: {
                var4_2 /* !! */  = (int)fi.idui("igqf", idun(int ), (int)405);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl326
            }
            case 10: {
                var4_2 /* !! */  = (int)fi.idui("igqg", idun(int ), (int)406);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl322
            }
lbl314:
            // 3 sources

            case 11: {
                var4_2 /* !! */  = (int)fi.idui("igqh", idun(int ), (int)407);
                if (!var5_1) ** GOTO lbl304
                throw null;
            }
lbl318:
            // 3 sources

            case 12: {
                var4_2 /* !! */  = (int)fi.idui("igqi", idun(int ), (int)408);
                if (!var5_1) ** GOTO lbl270
                throw null;
            }
lbl322:
            // 2 sources

            case 13: {
                var4_2 /* !! */  = (int)fi.idui("igqj", idun(int ), (int)409);
                if (!var5_1) ** GOTO lbl260
                throw null;
            }
lbl326:
            // 3 sources

            case 14: {
                var4_2 /* !! */  = (int)fi.idui("igqk", idun(int ), (int)410);
                if (!var5_1) ** GOTO lbl318
                throw null;
            }
            case 15: {
                var4_2 /* !! */  = (int)fi.idui("igql", idun(int ), (int)411);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl365
            }
            case 16: {
                var4_2 /* !! */  = (int)fi.idui("igqm", idun(int ), (int)412);
                if (!var5_1) ** GOTO lbl326
                throw null;
            }
lbl339:
            // 4 sources

            case 17: {
                var4_2 /* !! */  = (int)fi.idui("igqn", idun(int ), (int)413);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl357
            }
            case 18: {
                var4_2 /* !! */  = (int)fi.idui("igqo", idun(int ), (int)414);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl361
            }
            case 19: {
                var4_2 /* !! */  = (int)fi.idui("igqp", idun(int ), (int)415);
                if (!var5_1) ** GOTO lbl270
                throw null;
            }
lbl353:
            // 2 sources

            case 20: {
                var4_2 /* !! */  = (int)fi.idui("igqq", idun(int ), (int)416);
                if (!var5_1) ** GOTO lbl275
                throw null;
            }
lbl357:
            // 2 sources

            case 21: {
                var4_2 /* !! */  = (int)fi.idui("igqr", idun(int ), (int)417);
                if (!var5_1) ** GOTO lbl260
                throw null;
            }
lbl361:
            // 2 sources

            case 22: {
                var4_2 /* !! */  = (int)fi.idui("igqs", idun(int ), (int)418);
                if (!var5_1) ** GOTO lbl339
                throw null;
            }
lbl365:
            // 2 sources

            case 23: {
                var4_2 /* !! */  = (int)fi.idui("igqt", idun(int ), (int)419);
                if (!var5_1) ** GOTO lbl353
                throw null;
            }
            case 24: 
        }
        var4_2 /* !! */  = (int)fi.idui("igqu", idun(int ), (int)420);
        ** while (!var5_1)
lbl372:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List<ex> getItemBinds() {
        v0 /* !! */  = fi.pm;
        if (true) ** GOTO lbl5
        block35: while (true) {
            v0 /* !! */  = (long)(v1 - fi.idui("iduj", iduf(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 311602808: {
                    break block35;
                }
                case 467941713: {
                    v1 = fi.idui("iduk", iduf(int ), (int)1);
                    continue block35;
                }
                case 1659233197: {
                    v1 = fi.idui("idul", iduf(int ), (int)2);
                    continue block35;
                }
            }
            break;
        }
        var3_1 = fi.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fi.pm - fi.idui("idum", iduf(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fi.idui("iduq", idun(int ), (int)0)) break;
            v2 /* !! */  = (long)fi.idui("idur", idun(int ), (int)1);
        }
        var2_2 /* !! */  = fi.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = fi.pm - fi.idui("idus", iduf(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == fi.idui("idut", idun(int ), (int)2)) break;
                    v3 /* !! */  = (long)fi.idui("iduu", idun(int ), (int)3);
                }
                var1_3 = fi.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = fi.pm;
                if (true) ** GOTO lbl39
                block39: while (true) {
                    v4 /* !! */  = (long)(v5 - fi.idui("iduv", iduf(int ), (int)5));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1413111753: {
                            v5 = fi.idui("iduw", iduf(int ), (int)6);
                            continue block39;
                        }
                        case -1252548710: {
                            v5 = fi.idui("idux", iduf(int ), (int)7);
                            continue block39;
                        }
                        case 311602808: {
                            break block39;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = fi.pm - fi.idui("iduy", iduf(int ), (int)8)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == fi.idui("iduz", idun(int ), (int)4)) break;
                    v6 /* !! */  = (long)fi.idui("idva", idun(int ), (int)5);
                }
                v7 /* !! */  = fi.pm;
                if (true) ** GOTO lbl57
                block41: while (true) {
                    v7 /* !! */  = (long)(fi.idui("idvc", iduf(int ), (int)10) - fi.idui("idvb", iduf(int ), (int)9));
lbl57:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -515436064: {
                            continue block41;
                        }
                        case 311602808: {
                            break block41;
                        }
                    }
                    break;
                }
                v8 /* !! */  = fi.pm;
                if (true) ** GOTO lbl66
                block42: while (true) {
                    v8 /* !! */  = (long)(v9 - fi.idui("idvd", iduf(int ), (int)11));
lbl66:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -2144002080: {
                            v9 = fi.idui("idve", iduf(int ), (int)12);
                            continue block42;
                        }
                        case 160818222: {
                            v9 = fi.idui("idvf", iduf(int ), (int)13);
                            continue block42;
                        }
                        case 311602808: {
                            break block42;
                        }
                    }
                    break;
                }
                v10 = new ex("RW", class_1802.field_8207, this.trap);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = fi.pm - fi.idui("idvg", iduf(int ), (int)14)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == fi.idui("idvh", idun(int ), (int)6)) break;
                    v11 /* !! */  = (long)fi.idui("idvi", idun(int ), (int)7);
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = fi.pm - fi.idui("idvj", iduf(int ), (int)15)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == fi.idui("idvk", idun(int ), (int)8)) break;
                    v12 /* !! */  = (long)fi.idui("idvl", idun(int ), (int)9);
                }
                v13 /* !! */  = fi.pm;
                if (true) ** GOTO lbl90
                block45: while (true) {
                    v13 /* !! */  = (long)(fi.idui("idvn", iduf(int ), (int)17) - fi.idui("idvm", iduf(int ), (int)16));
lbl90:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -466156912: {
                            continue block45;
                        }
                        case 311602808: {
                            break block45;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_5 = fi.pm - fi.idui("idvo", iduf(int ), (int)18)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == fi.idui("idvp", idun(int ), (int)10)) break;
                    v14 /* !! */  = (long)fi.idui("idvq", idun(int ), (int)11);
                }
                v15 = new ex("RW", class_1802.field_8450, this.antiFlight);
                v16 /* !! */  = fi.pm;
                if (true) ** GOTO lbl105
                block47: while (true) {
                    v16 /* !! */  = (long)(v17 - fi.idui("idvr", iduf(int ), (int)19));
lbl105:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -550276953: {
                            v17 = fi.idui("idvs", iduf(int ), (int)20);
                            continue block47;
                        }
                        case 311602808: {
                            break block47;
                        }
                        case 504154767: {
                            v17 = fi.idui("idvt", iduf(int ), (int)21);
                            continue block47;
                        }
                        case 653537921: {
                            v17 = fi.idui("idvu", iduf(int ), (int)22);
                            continue block47;
                        }
                    }
                    break;
                }
                return List.of(v10, v15);
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)fi.idui("idvv", idun(int ), (int)12);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)fi.idui("idvw", idun(int ), (int)13);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)fi.idui("idvx", idun(int ), (int)14);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)fi.idui("idvy", idun(int ), (int)15);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void ihpm() {
        fi.iduo[500] = 421649756;
        fi.iduo[501] = -124782642;
        fi.iduo[502] = 762181639;
        fi.iduo[503] = 433056288;
        fi.iduo[504] = -1484038550;
        fi.iduo[505] = -407365695;
        fi.iduo[506] = 1695782212;
        fi.iduo[507] = -807467862;
        fi.iduo[508] = -1021910863;
        fi.iduo[509] = 2084750937;
        fi.iduo[510] = -2144436738;
        fi.iduo[511] = 1771011294;
        fi.iduo[512] = 316398632;
        fi.iduo[513] = -1557577508;
        fi.iduo[514] = 2093848195;
        fi.iduo[515] = -1025446231;
        fi.iduo[516] = -666752278;
        fi.iduo[517] = -718711445;
        fi.iduo[518] = 1114285006;
        fi.iduo[519] = 2077816013;
        fi.iduo[520] = 1990076453;
        fi.iduo[521] = 988136354;
        fi.iduo[522] = 1805566383;
        fi.iduo[523] = -2130218335;
        fi.iduo[524] = 1751263698;
        fi.iduo[525] = 897606485;
        fi.iduo[526] = 1874080137;
        fi.iduo[527] = 1137055048;
        fi.iduo[528] = -2089362639;
        fi.iduo[529] = -1019525474;
        fi.iduo[530] = -538140023;
        fi.iduo[531] = -1356504348;
        fi.iduo[532] = 929053728;
        fi.iduo[533] = 114117340;
        fi.iduo[534] = -1339992156;
        fi.iduo[535] = 1866627962;
        fi.iduo[536] = 1997762629;
        fi.iduo[537] = -247111487;
        fi.iduo[538] = -1180952724;
        fi.iduo[539] = 410762822;
        fi.iduo[540] = -550390088;
        fi.iduo[541] = -1332350995;
        fi.iduo[542] = 1069206720;
        fi.iduo[543] = -1982315535;
        fi.iduo[544] = 26724447;
        fi.iduo[545] = 476236638;
        fi.iduo[546] = -820374989;
        fi.iduo[547] = -580737868;
        fi.iduo[548] = -1524093958;
        fi.iduo[549] = 942848457;
        fi.iduo[550] = -1121466890;
        fi.iduo[551] = -897256733;
        fi.iduo[552] = -1129158166;
        fi.iduo[553] = -1476419732;
        fi.iduo[554] = -1364045528;
        fi.iduo[555] = 1625028240;
        fi.iduo[556] = -991957598;
        fi.iduo[557] = -1411158405;
        fi.iduo[558] = -1862193885;
        fi.iduo[559] = -1833537838;
        fi.iduo[560] = -742521081;
        fi.iduo[561] = -1292414140;
        fi.iduo[562] = -1287922883;
        fi.iduo[563] = 2087416650;
        fi.iduo[564] = 106853985;
        fi.iduo[565] = 1824388114;
        fi.iduo[566] = 682341320;
        fi.iduo[567] = -636447329;
        fi.iduo[568] = -1493231488;
        fi.iduo[569] = -881517692;
        fi.iduo[570] = 1111479928;
        fi.iduo[571] = 1402026100;
        fi.iduo[572] = -281905852;
        fi.iduo[573] = 44921104;
        fi.iduo[574] = -129046551;
        fi.iduo[575] = 1268826360;
        fi.iduo[576] = 1717909579;
        fi.iduo[577] = -1260078815;
        fi.iduo[578] = 121285522;
        fi.iduo[579] = 1410843804;
        fi.iduo[580] = -335424131;
        fi.iduo[581] = -2080366599;
        fi.iduo[582] = 65035927;
        fi.iduo[583] = 1826366429;
        fi.iduo[584] = 1669132249;
        fi.iduo[585] = -1337126119;
        fi.iduo[586] = 1908975183;
        fi.iduo[587] = 1617352075;
        fi.iduo[588] = -18317824;
        fi.iduo[589] = 0xFF77DD7;
        fi.iduo[590] = 616371813;
        fi.iduo[591] = -511390099;
        fi.iduo[592] = -1070115591;
        fi.iduo[593] = 2126746991;
        fi.iduo[594] = 9075126;
        fi.iduo[595] = 1747597820;
        fi.iduo[596] = -267506470;
        fi.iduo[597] = 1006541320;
        fi.iduo[598] = -1062449295;
        fi.iduo[599] = -2036571265;
    }

    private static /* synthetic */ void ihpa() {
        fi.iduo[300] = -770330961;
        fi.iduo[301] = -2061956317;
        fi.iduo[302] = -30720786;
        fi.iduo[303] = 231471485;
        fi.iduo[304] = 16977347;
        fi.iduo[305] = 1147528650;
        fi.iduo[306] = 1713399292;
        fi.iduo[307] = 456721053;
        fi.iduo[308] = -1514648219;
        fi.iduo[309] = -1475323808;
        fi.iduo[310] = -1963229786;
        fi.iduo[311] = -889672186;
        fi.iduo[312] = -1999394029;
        fi.iduo[313] = -593462595;
        fi.iduo[314] = 1222521189;
        fi.iduo[315] = -671382416;
        fi.iduo[316] = -841465594;
        fi.iduo[317] = 1113284165;
        fi.iduo[318] = 615162096;
        fi.iduo[319] = -2085367316;
        fi.iduo[320] = 1201548071;
        fi.iduo[321] = -1700779548;
        fi.iduo[322] = 514652623;
        fi.iduo[323] = -127326391;
        fi.iduo[324] = -1175373392;
        fi.iduo[325] = -750518174;
        fi.iduo[326] = -448413560;
        fi.iduo[327] = 2111571429;
        fi.iduo[328] = -2092937534;
        fi.iduo[329] = 395673707;
        fi.iduo[330] = 1685649742;
        fi.iduo[331] = 1897938387;
        fi.iduo[332] = -251759121;
        fi.iduo[333] = 316022731;
        fi.iduo[334] = -1102674190;
        fi.iduo[335] = -29970768;
        fi.iduo[336] = 2109470542;
        fi.iduo[337] = 988299313;
        fi.iduo[338] = -78831384;
        fi.iduo[339] = -1512312647;
        fi.iduo[340] = -1999324648;
        fi.iduo[341] = -444846135;
        fi.iduo[342] = -1643140713;
        fi.iduo[343] = -1496198821;
        fi.iduo[344] = -1214514613;
        fi.iduo[345] = 1754891252;
        fi.iduo[346] = 1011466121;
        fi.iduo[347] = -1589748406;
        fi.iduo[348] = -707908931;
        fi.iduo[349] = -1862163392;
        fi.iduo[350] = -1200528800;
        fi.iduo[351] = -1839009561;
        fi.iduo[352] = 1600327596;
        fi.iduo[353] = -1902075740;
        fi.iduo[354] = -486938252;
        fi.iduo[355] = 1521887820;
        fi.iduo[356] = 1537594262;
        fi.iduo[357] = 1877680495;
        fi.iduo[358] = 1614924820;
        fi.iduo[359] = -51626552;
        fi.iduo[360] = -1182383785;
        fi.iduo[361] = -2131492448;
        fi.iduo[362] = 672773553;
        fi.iduo[363] = -486098393;
        fi.iduo[364] = -2144963544;
        fi.iduo[365] = 1202379383;
        fi.iduo[366] = -1069131083;
        fi.iduo[367] = 1641110082;
        fi.iduo[368] = 1241897848;
        fi.iduo[369] = -313365543;
        fi.iduo[370] = -1938955845;
        fi.iduo[371] = 154648162;
        fi.iduo[372] = -1935745968;
        fi.iduo[373] = 297534900;
        fi.iduo[374] = 172636667;
        fi.iduo[375] = -1742186704;
        fi.iduo[376] = -46311360;
        fi.iduo[377] = -537447941;
        fi.iduo[378] = 520833382;
        fi.iduo[379] = 968331288;
        fi.iduo[380] = -1803343825;
        fi.iduo[381] = 1038454993;
        fi.iduo[382] = -1561349222;
        fi.iduo[383] = 939652272;
        fi.iduo[384] = -762918049;
        fi.iduo[385] = -1709931277;
        fi.iduo[386] = 400288082;
        fi.iduo[387] = 1245509110;
        fi.iduo[388] = -1627357740;
        fi.iduo[389] = -408545108;
        fi.iduo[390] = -1272610222;
        fi.iduo[391] = -627062431;
        fi.iduo[392] = -888054933;
        fi.iduo[393] = 991729614;
        fi.iduo[394] = 1799760835;
        fi.iduo[395] = -782190551;
        fi.iduo[396] = 750846496;
        fi.iduo[397] = 1343175163;
        fi.iduo[398] = -388451891;
        fi.iduo[399] = -1195934584;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block252: {
            block253: {
                block250: {
                    block251: {
                        block248: {
                            block249: {
                                block246: {
                                    block247: {
                                        block245: {
                                            block244: {
                                                block243: {
                                                    var4_2 = fi.c;
                                                    var3_3 /* !! */  = fi.b;
                                                    var2_4 = fi.a;
                                                    if (var4_2) {
                                                        throw null;
lbl6:
                                                        // 65 sources

                                                        return;
                                                    }
                                                    if (var2_4 || var2_4) ** GOTO lbl6
                                                    if (fi.mc.field_1724 != null) break block243;
                                                    if (var2_4 || var2_4) ** GOTO lbl6
                                                    this.cleanup();
                                                    if (var2_4 || var2_4) ** GOTO lbl6
                                                    this.fixAt = (long)fi.idui("ienm", iduf(int ), (int)25);
                                                    if (var2_4 || var2_4) ** GOTO lbl6
                                                    return;
                                                }
                                                if (var2_4 || var2_4) ** GOTO lbl6
                                                this.closeServerMenu();
                                                if (var2_4 || var2_4) ** GOTO lbl6
                                                this.tryHalfTickUse();
                                                if (var2_4 || var2_4) ** GOTO lbl6
                                                if (this.fixAt == fi.idui("ieno", iduf(int ), (int)26)) break block244;
                                                if (var2_4) ** GOTO lbl6
                                                if (System.currentTimeMillis() < this.fixAt) break block244;
                                                if (var2_4 || var2_4) ** GOTO lbl6
                                                fi.mc.field_1724.field_3944.method_45730("fix all");
                                                if (var2_4 || var2_4) ** GOTO lbl6
                                                this.fixAt = (long)fi.idui("ienp", iduf(int ), (int)27);
                                                if (var2_4) ** GOTO lbl6
                                            }
                                            if (var2_4 || var2_4) ** GOTO lbl6
                                            if (!this.isAntiFlightPhase()) break block245;
                                            if (var2_4) ** GOTO lbl6
                                            if (!this.swapMode.isSelected("New")) break block245;
                                            if (var2_4 || var2_4) ** GOTO lbl6
                                            this.movement.block();
                                            if (var2_4) ** GOTO lbl6
                                        }
                                        if (var2_4 || var2_4) ** GOTO lbl6
                                        if (this.phase != fi$ActionPhase.ANTI_WAIT_STOP) break block246;
                                        if (var2_4 || var2_4) ** GOTO lbl6
                                        v0 = this.stopTicks;
                                        this.stopTicks = v0 - fi.idui("ienu", idun(int ), (int)132);
                                        if (v0 <= 0) break block247;
                                        if (var2_4 || var2_4) ** GOTO lbl6
                                        return;
                                    }
                                    if (var2_4 || var2_4) ** GOTO lbl6
                                    this.swapAntiFlightToOffhand();
                                    if (var2_4 || var2_4) ** GOTO lbl6
                                    this.phase = fi$ActionPhase.ANTI_WAIT_PRESS;
                                    if (var2_4 || var2_4) ** GOTO lbl6
                                    this.stopTicks = (int)fi.idui("iepx", idun(int ), (int)133);
                                    if (var2_4 || var2_4) ** GOTO lbl6
                                    return;
                                }
                                if (var2_4 || var2_4) ** GOTO lbl6
                                if (this.phase != fi$ActionPhase.ANTI_WAIT_PRESS) break block248;
                                if (var2_4 || var2_4) ** GOTO lbl6
                                v1 = this.stopTicks;
                                this.stopTicks = v1 - fi.idui("iepy", idun(int ), (int)134);
                                if (v1 <= 0) break block249;
                                if (var2_4 || var2_4) ** GOTO lbl6
                                return;
                            }
                            if (var2_4 || var2_4) ** GOTO lbl6
                            this.phase = fi$ActionPhase.ANTI_WAIT_RELEASE;
                            if (var2_4 || var2_4) ** GOTO lbl6
                            this.stopTicks = (int)fi.idui("iepz", idun(int ), (int)135);
                            if (var2_4 || var2_4) ** GOTO lbl6
                            return;
                        }
                        if (var2_4 || var2_4) ** GOTO lbl6
                        if (this.phase != fi$ActionPhase.ANTI_WAIT_RELEASE) break block250;
                        if (var2_4 || var2_4) ** GOTO lbl6
                        v2 = this.stopTicks;
                        this.stopTicks = v2 - fi.idui("ieqa", idun(int ), (int)136);
                        if (v2 <= 0) break block251;
                        if (var2_4 || var2_4) ** GOTO lbl6
                        return;
                    }
                    if (var2_4 || var2_4) ** GOTO lbl6
                    this.phase = fi$ActionPhase.ANTI_WAIT_RESTORE;
                    if (var2_4 || var2_4) ** GOTO lbl6
                    this.stopTicks = (int)fi.idui("ieqb", idun(int ), (int)137);
                    if (var2_4 || var2_4) ** GOTO lbl6
                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl6
                if (this.phase != fi$ActionPhase.ANTI_WAIT_RESTORE) break block252;
                if (var2_4 || var2_4) ** GOTO lbl6
                v3 = this.stopTicks;
                this.stopTicks = v3 - fi.idui("ieqf", idun(int ), (int)138);
                if (v3 <= 0) break block253;
                if (var2_4 || var2_4) ** GOTO lbl6
                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl6
            this.restoreAntiFlightItem();
            if (var2_4 || var2_4) ** GOTO lbl6
            this.cleanup();
            if (var2_4 || var2_4) ** GOTO lbl6
            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl6
        if (this.phase != fi$ActionPhase.WAIT_USE_STOP) ** GOTO lbl127
        if (var2_4 || var2_4) ** GOTO lbl6
        this.movement.block();
        if (var2_4) ** GOTO lbl6
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl6
                v4 = this.stopTicks;
                this.stopTicks = v4 - fi.idui("ierl", idun(int ), (int)139);
                if (v4 <= 0) ** GOTO lbl119
                if (var2_4 || var2_4) ** GOTO lbl6
                return;
lbl119:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                this.usePreparedTrap();
                if (var2_4 || var2_4) ** GOTO lbl6
                this.restoreMovement();
                if (var2_4) ** GOTO lbl6
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl127:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl6
            if (this.phase != fi$ActionPhase.WAIT_RESTORE) ** GOTO lbl149
            if (var2_4) ** GOTO lbl6
            if (System.currentTimeMillis() < this.restoreAt) ** GOTO lbl149
            if (var2_4 || var2_4) ** GOTO lbl6
            if (!this.swapMode.isSelected("New")) ** GOTO lbl141
            if (var2_4) ** GOTO lbl6
            if (this.fromHotbar) ** GOTO lbl141
            if (var2_4 || var2_4) ** GOTO lbl6
            this.beginStop(fi$ActionPhase.WAIT_RESTORE_STOP);
            if (var2_4) ** GOTO lbl6
            if (var4_2) {
                throw null;
            }
            ** GOTO lbl164
lbl141:
            // 2 sources

            if (var2_4 || var2_4) ** GOTO lbl6
            this.restoreTrap();
            if (var2_4 || var2_4) ** GOTO lbl6
            this.cleanup();
            if (var2_4) ** GOTO lbl6
            if (var4_2) {
                throw null;
            }
            ** GOTO lbl164
lbl149:
            // 2 sources

            if (var2_4 || var2_4) ** GOTO lbl6
            if (this.phase != fi$ActionPhase.WAIT_RESTORE_STOP) ** GOTO lbl164
            if (var2_4 || var2_4) ** GOTO lbl6
            this.movement.block();
            if (var2_4 || var2_4) ** GOTO lbl6
            v5 = this.stopTicks;
            this.stopTicks = v5 - fi.idui("iese", idun(int ), (int)140);
            if (v5 <= 0) ** GOTO lbl159
            if (var2_4 || var2_4) ** GOTO lbl6
            return;
lbl159:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl6
            this.restoreTrap();
            if (var2_4 || var2_4) ** GOTO lbl6
            this.cleanup();
            if (var2_4) ** GOTO lbl6
lbl164:
            // 5 sources

            if (!var2_4 && !var2_4) ** break;
            ** continue;
            return;
lbl167:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)fi.idui("iesg", idun(int ), (int)141);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl467
            }
lbl172:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)fi.idui("iesi", idun(int ), (int)142);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl615
            }
lbl177:
            // 3 sources

            case 2: {
                var3_3 /* !! */  = (int)fi.idui("iete", idun(int ), (int)143);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl476
            }
lbl182:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)fi.idui("ietg", idun(int ), (int)144);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl330
            }
            case 4: {
                var3_3 /* !! */  = (int)fi.idui("ieti", idun(int ), (int)145);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl699
            }
lbl192:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)fi.idui("ietk", idun(int ), (int)146);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl481
            }
            case 6: {
                var3_3 /* !! */  = (int)fi.idui("ietl", idun(int ), (int)147);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl533
            }
lbl202:
            // 3 sources

            case 7: {
                var3_3 /* !! */  = (int)fi.idui("ietn", idun(int ), (int)148);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl600
            }
lbl207:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)fi.idui("ietr", idun(int ), (int)149);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl321
            }
            case 9: {
                var3_3 /* !! */  = (int)fi.idui("ietu", idun(int ), (int)150);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl679
            }
            case 10: {
                var3_3 /* !! */  = (int)fi.idui("ietx", idun(int ), (int)151);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl502
            }
            case 11: {
                var3_3 /* !! */  = (int)fi.idui("iety", idun(int ), (int)152);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl675
            }
lbl227:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)fi.idui("ieua", idun(int ), (int)153);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl489
            }
lbl232:
            // 3 sources

            case 13: {
                var3_3 /* !! */  = (int)fi.idui("ieuu", idun(int ), (int)154);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl658
            }
lbl237:
            // 2 sources

            case 14: {
                var3_3 /* !! */  = (int)fi.idui("ieuw", idun(int ), (int)155);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl584
            }
lbl242:
            // 2 sources

            case 15: {
                var3_3 /* !! */  = (int)fi.idui("ieux", idun(int ), (int)156);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl600
            }
lbl247:
            // 2 sources

            case 16: {
                var3_3 /* !! */  = (int)fi.idui("ieuz", idun(int ), (int)157);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl650
            }
            case 17: {
                var3_3 /* !! */  = (int)fi.idui("ievc", idun(int ), (int)158);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl348
            }
            case 18: {
                var3_3 /* !! */  = (int)fi.idui("ieve", idun(int ), (int)159);
                if (!var4_2) ** GOTO lbl207
                throw null;
            }
lbl261:
            // 2 sources

            case 19: {
                var3_3 /* !! */  = (int)fi.idui("ievg", idun(int ), (int)160);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl289
            }
lbl266:
            // 7 sources

            case 20: {
                var3_3 /* !! */  = (int)fi.idui("ieyr", idun(int ), (int)161);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl654
            }
lbl271:
            // 5 sources

            case 21: {
                var3_3 /* !! */  = (int)fi.idui("ieys", idun(int ), (int)162);
                if (!var4_2) ** GOTO lbl177
                throw null;
            }
lbl275:
            // 3 sources

            case 22: {
                var3_3 /* !! */  = (int)fi.idui("ieyu", idun(int ), (int)163);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl476
            }
            case 23: {
                var3_3 /* !! */  = (int)fi.idui("ieyv", idun(int ), (int)164);
                if (!var4_2) ** GOTO lbl202
                throw null;
            }
            case 24: {
                var3_3 /* !! */  = (int)fi.idui("ieyx", idun(int ), (int)165);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl428
            }
lbl289:
            // 2 sources

            case 25: {
                var3_3 /* !! */  = (int)fi.idui("ieyz", idun(int ), (int)166);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl312
            }
lbl294:
            // 2 sources

            case 26: {
                var3_3 /* !! */  = (int)fi.idui("ieza", idun(int ), (int)167);
                if (!var4_2) ** GOTO lbl271
                throw null;
            }
            case 27: {
                var3_3 /* !! */  = (int)fi.idui("iezc", idun(int ), (int)168);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl727
            }
lbl303:
            // 2 sources

            case 28: {
                var3_3 /* !! */  = (int)fi.idui("iezd", idun(int ), (int)169);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl654
            }
            case 29: {
                var3_3 /* !! */  = (int)fi.idui("ieze", idun(int ), (int)170);
                if (!var4_2) ** GOTO lbl202
                throw null;
            }
lbl312:
            // 3 sources

            case 30: {
                var3_3 /* !! */  = (int)fi.idui("ifbv", idun(int ), (int)171);
                if (!var4_2) ** GOTO lbl232
                throw null;
            }
lbl316:
            // 2 sources

            case 31: {
                var3_3 /* !! */  = (int)fi.idui("ifbx", idun(int ), (int)172);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl605
            }
lbl321:
            // 2 sources

            case 32: {
                var3_3 /* !! */  = (int)fi.idui("ifby", idun(int ), (int)173);
                if (!var4_2) break;
                throw null;
            }
lbl325:
            // 2 sources

            case 33: {
                var3_3 /* !! */  = (int)fi.idui("ifca", idun(int ), (int)174);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl414
            }
lbl330:
            // 2 sources

            case 34: {
                var3_3 /* !! */  = (int)fi.idui("ifcb", idun(int ), (int)175);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl516
            }
            case 35: {
                var3_3 /* !! */  = (int)fi.idui("ifcd", idun(int ), (int)176);
                if (!var4_2) ** GOTO lbl316
                throw null;
            }
            case 36: {
                var3_3 /* !! */  = (int)fi.idui("ifce", idun(int ), (int)177);
                if (!var4_2) ** GOTO lbl167
                throw null;
            }
            case 37: {
                var3_3 /* !! */  = (int)fi.idui("ifcg", idun(int ), (int)178);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl382
            }
lbl348:
            // 2 sources

            case 38: {
                var3_3 /* !! */  = (int)fi.idui("ifdp", idun(int ), (int)179);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl507
            }
lbl353:
            // 2 sources

            case 39: {
                var3_3 /* !! */  = (int)fi.idui("ifdr", idun(int ), (int)180);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl579
            }
            case 40: {
                var3_3 /* !! */  = (int)fi.idui("ifdt", idun(int ), (int)181);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl575
            }
            case 41: {
                var3_3 /* !! */  = (int)fi.idui("ifdu", idun(int ), (int)182);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl418
            }
            case 42: {
                var3_3 /* !! */  = (int)fi.idui("ifdw", idun(int ), (int)183);
                if (!var4_2) ** GOTO lbl247
                throw null;
            }
lbl372:
            // 3 sources

            case 43: {
                var3_3 /* !! */  = (int)fi.idui("ifdx", idun(int ), (int)184);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl463
            }
            case 44: {
                var3_3 /* !! */  = (int)fi.idui("ifdz", idun(int ), (int)185);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl588
            }
lbl382:
            // 3 sources

            case 45: {
                var3_3 /* !! */  = (int)fi.idui("ifew", idun(int ), (int)186);
                if (!var4_2) ** GOTO lbl177
                throw null;
            }
            case 46: {
                var3_3 /* !! */  = (int)fi.idui("ifex", idun(int ), (int)187);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl723
            }
            case 47: {
                var3_3 /* !! */  = (int)fi.idui("ifez", idun(int ), (int)188);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl596
            }
            case 48: {
                var3_3 /* !! */  = (int)fi.idui("iffb", idun(int ), (int)189);
                if (!var4_2) ** GOTO lbl372
                throw null;
            }
lbl400:
            // 2 sources

            case 49: {
                var3_3 /* !! */  = (int)fi.idui("iffc", idun(int ), (int)190);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl567
            }
            case 50: {
                var3_3 /* !! */  = (int)fi.idui("iffd", idun(int ), (int)191);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl414
            }
lbl410:
            // 2 sources

            case 51: {
                var3_3 /* !! */  = (int)fi.idui("iffo", idun(int ), (int)192);
                if (!var4_2) ** GOTO lbl266
                throw null;
            }
lbl414:
            // 4 sources

            case 52: {
                var3_3 /* !! */  = (int)fi.idui("iffp", idun(int ), (int)193);
                if (!var4_2) ** GOTO lbl237
                throw null;
            }
lbl418:
            // 3 sources

            case 53: {
                var3_3 /* !! */  = (int)fi.idui("iffr", idun(int ), (int)194);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl579
            }
lbl423:
            // 3 sources

            case 54: {
                var3_3 /* !! */  = (int)fi.idui("iffs", idun(int ), (int)195);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl615
            }
lbl428:
            // 2 sources

            case 55: {
                var3_3 /* !! */  = (int)fi.idui("iffu", idun(int ), (int)196);
                if (!var4_2) ** GOTO lbl414
                throw null;
            }
lbl432:
            // 3 sources

            case 56: {
                var3_3 /* !! */  = (int)fi.idui("iffv", idun(int ), (int)197);
                if (!var4_2) ** GOTO lbl232
                throw null;
            }
            case 57: {
                var3_3 /* !! */  = (int)fi.idui("iffw", idun(int ), (int)198);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl670
            }
lbl441:
            // 3 sources

            case 58: {
                var3_3 /* !! */  = (int)fi.idui("iffy", idun(int ), (int)199);
                if (!var4_2) ** GOTO lbl382
                throw null;
            }
lbl445:
            // 2 sources

            case 59: {
                var3_3 /* !! */  = (int)fi.idui("ifin", idun(int ), (int)200);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl634
            }
lbl450:
            // 2 sources

            case 60: {
                var3_3 /* !! */  = (int)fi.idui("ifir", idun(int ), (int)201);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl695
            }
            case 61: {
                var3_3 /* !! */  = (int)fi.idui("ifiu", idun(int ), (int)202);
                if (!var4_2) ** GOTO lbl271
                throw null;
            }
lbl459:
            // 2 sources

            case 62: {
                var3_3 /* !! */  = (int)fi.idui("ifix", idun(int ), (int)203);
                if (!var4_2) ** GOTO lbl400
                throw null;
            }
lbl463:
            // 2 sources

            case 63: {
                var3_3 /* !! */  = (int)fi.idui("ifja", idun(int ), (int)204);
                if (!var4_2) ** GOTO lbl459
                throw null;
            }
lbl467:
            // 2 sources

            case 64: {
                var3_3 /* !! */  = (int)fi.idui("ifkc", idun(int ), (int)205);
                if (!var4_2) ** GOTO lbl423
                throw null;
            }
lbl471:
            // 3 sources

            case 65: {
                var3_3 /* !! */  = (int)fi.idui("ifkd", idun(int ), (int)206);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl596
            }
lbl476:
            // 3 sources

            case 66: {
                var3_3 /* !! */  = (int)fi.idui("ifke", idun(int ), (int)207);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl679
            }
lbl481:
            // 2 sources

            case 67: {
                var3_3 /* !! */  = (int)fi.idui("ifkg", idun(int ), (int)208);
                if (!var4_2) ** GOTO lbl227
                throw null;
            }
            case 68: {
                var3_3 /* !! */  = (int)fi.idui("ifki", idun(int ), (int)209);
                if (!var4_2) ** GOTO lbl266
                throw null;
            }
lbl489:
            // 2 sources

            case 69: {
                var3_3 /* !! */  = (int)fi.idui("ifkm", idun(int ), (int)210);
                if (!var4_2) ** GOTO lbl192
                throw null;
            }
            case 70: {
                var3_3 /* !! */  = (int)fi.idui("igdf", idun(int ), (int)211);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl683
            }
lbl498:
            // 2 sources

            case 71: {
                var3_3 /* !! */  = (int)fi.idui("igdg", idun(int ), (int)212);
                if (!var4_2) ** GOTO lbl441
                throw null;
            }
lbl502:
            // 2 sources

            case 72: {
                var3_3 /* !! */  = (int)fi.idui("igdh", idun(int ), (int)213);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl646
            }
lbl507:
            // 3 sources

            case 73: {
                var3_3 /* !! */  = (int)fi.idui("igdj", idun(int ), (int)214);
                if (!var4_2) ** GOTO lbl172
                throw null;
            }
            case 74: {
                var3_3 /* !! */  = (int)fi.idui("igdk", idun(int ), (int)215);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl727
            }
lbl516:
            // 3 sources

            case 75: {
                var3_3 /* !! */  = (int)fi.idui("igdl", idun(int ), (int)216);
                if (!var4_2) ** GOTO lbl271
                throw null;
            }
lbl520:
            // 2 sources

            case 76: {
                var3_3 /* !! */  = (int)fi.idui("igdn", idun(int ), (int)217);
                if (!var4_2) ** GOTO lbl441
                throw null;
            }
            case 77: {
                var3_3 /* !! */  = (int)fi.idui("igdo", idun(int ), (int)218);
                if (!var4_2) ** GOTO lbl271
                throw null;
            }
lbl528:
            // 2 sources

            case 78: {
                var3_3 /* !! */  = (int)fi.idui("igdq", idun(int ), (int)219);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl537
            }
lbl533:
            // 2 sources

            case 79: {
                var3_3 /* !! */  = (int)fi.idui("igdr", idun(int ), (int)220);
                if (!var4_2) ** GOTO lbl312
                throw null;
            }
lbl537:
            // 2 sources

            case 80: {
                var3_3 /* !! */  = (int)fi.idui("igdt", idun(int ), (int)221);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl675
            }
lbl542:
            // 2 sources

            case 81: {
                var3_3 /* !! */  = (int)fi.idui("igdu", idun(int ), (int)222);
                if (!var4_2) ** GOTO lbl275
                throw null;
            }
            case 82: {
                var3_3 /* !! */  = (int)fi.idui("igdv", idun(int ), (int)223);
                if (!var4_2) ** GOTO lbl507
                throw null;
            }
            case 83: {
                var3_3 /* !! */  = (int)fi.idui("igdx", idun(int ), (int)224);
                if (!var4_2) ** GOTO lbl418
                throw null;
            }
lbl554:
            // 2 sources

            case 84: {
                var3_3 /* !! */  = (int)fi.idui("igdy", idun(int ), (int)225);
                if (!var4_2) ** GOTO lbl275
                throw null;
            }
lbl558:
            // 2 sources

            case 85: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)fi.idui("igdz", idun(int ), (int)226);
                    if (!var4_2) ** GOTO lbl423
                    throw null;
                }
            }
            case 86: {
                var3_3 /* !! */  = (int)fi.idui("igea", idun(int ), (int)227);
                if (!var4_2) ** GOTO lbl471
                throw null;
            }
lbl567:
            // 2 sources

            case 87: {
                var3_3 /* !! */  = (int)fi.idui("igeb", idun(int ), (int)228);
                if (!var4_2) ** GOTO lbl266
                throw null;
            }
lbl571:
            // 2 sources

            case 88: {
                var3_3 /* !! */  = (int)fi.idui("igec", idun(int ), (int)229);
                if (!var4_2) ** GOTO lbl410
                throw null;
            }
lbl575:
            // 2 sources

            case 89: {
                var3_3 /* !! */  = (int)fi.idui("iged", idun(int ), (int)230);
                if (!var4_2) ** GOTO lbl266
                throw null;
            }
lbl579:
            // 3 sources

            case 90: {
                var3_3 /* !! */  = (int)fi.idui("igee", idun(int ), (int)231);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl703
            }
lbl584:
            // 3 sources

            case 91: {
                var3_3 /* !! */  = (int)fi.idui("igef", idun(int ), (int)232);
                if (!var4_2) ** GOTO lbl303
                throw null;
            }
lbl588:
            // 3 sources

            case 92: {
                var3_3 /* !! */  = (int)fi.idui("igeg", idun(int ), (int)233);
                if (!var4_2) ** GOTO lbl516
                throw null;
            }
            case 93: {
                var3_3 /* !! */  = (int)fi.idui("igeh", idun(int ), (int)234);
                if (!var4_2) ** GOTO lbl372
                throw null;
            }
lbl596:
            // 3 sources

            case 94: {
                var3_3 /* !! */  = (int)fi.idui("igei", idun(int ), (int)235);
                if (!var4_2) ** GOTO lbl353
                throw null;
            }
lbl600:
            // 3 sources

            case 95: {
                var3_3 /* !! */  = (int)fi.idui("igej", idun(int ), (int)236);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl699
            }
lbl605:
            // 3 sources

            case 96: {
                var3_3 /* !! */  = (int)fi.idui("igek", idun(int ), (int)237);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl625
            }
            case 97: {
                var3_3 /* !! */  = (int)fi.idui("igel", idun(int ), (int)238);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl703
            }
lbl615:
            // 4 sources

            case 98: {
                var3_3 /* !! */  = (int)fi.idui("igem", idun(int ), (int)239);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl654
            }
            case 99: {
                var3_3 /* !! */  = (int)fi.idui("igen", idun(int ), (int)240);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl711
            }
lbl625:
            // 3 sources

            case 100: {
                var3_3 /* !! */  = (int)fi.idui("igeo", idun(int ), (int)241);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl675
            }
            case 101: {
                var3_3 /* !! */  = (int)fi.idui("igep", idun(int ), (int)242);
                if (!var4_2) ** GOTO lbl520
                throw null;
            }
lbl634:
            // 2 sources

            case 102: {
                var3_3 /* !! */  = (int)fi.idui("igeq", idun(int ), (int)243);
                if (!var4_2) ** GOTO lbl182
                throw null;
            }
            case 103: {
                var3_3 /* !! */  = (int)fi.idui("iger", idun(int ), (int)244);
                if (!var4_2) ** GOTO lbl625
                throw null;
            }
            case 104: {
                var3_3 /* !! */  = (int)fi.idui("iges", idun(int ), (int)245);
                if (!var4_2) ** GOTO lbl584
                throw null;
            }
lbl646:
            // 2 sources

            case 105: {
                var3_3 /* !! */  = (int)fi.idui("iget", idun(int ), (int)246);
                if (!var4_2) ** GOTO lbl605
                throw null;
            }
lbl650:
            // 2 sources

            case 106: {
                var3_3 /* !! */  = (int)fi.idui("igeu", idun(int ), (int)247);
                if (!var4_2) ** GOTO lbl242
                throw null;
            }
lbl654:
            // 4 sources

            case 107: {
                var3_3 /* !! */  = (int)fi.idui("igev", idun(int ), (int)248);
                if (!var4_2) ** GOTO lbl266
                throw null;
            }
lbl658:
            // 2 sources

            case 108: {
                var3_3 /* !! */  = (int)fi.idui("igew", idun(int ), (int)249);
                if (!var4_2) ** GOTO lbl528
                throw null;
            }
            case 109: {
                var3_3 /* !! */  = (int)fi.idui("igex", idun(int ), (int)250);
                if (!var4_2) ** GOTO lbl554
                throw null;
            }
            case 110: {
                var3_3 /* !! */  = (int)fi.idui("igey", idun(int ), (int)251);
                if (!var4_2) ** GOTO lbl432
                throw null;
            }
lbl670:
            // 2 sources

            case 111: {
                var3_3 /* !! */  = (int)fi.idui("igez", idun(int ), (int)252);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl719
            }
lbl675:
            // 4 sources

            case 112: {
                var3_3 /* !! */  = (int)fi.idui("igfa", idun(int ), (int)253);
                if (!var4_2) ** GOTO lbl471
                throw null;
            }
lbl679:
            // 3 sources

            case 113: {
                var3_3 /* !! */  = (int)fi.idui("igfb", idun(int ), (int)254);
                if (!var4_2) ** GOTO lbl615
                throw null;
            }
lbl683:
            // 2 sources

            case 114: {
                var3_3 /* !! */  = (int)fi.idui("igfc", idun(int ), (int)255);
                if (!var4_2) ** GOTO lbl432
                throw null;
            }
            case 115: {
                var3_3 /* !! */  = (int)fi.idui("igfd", idun(int ), (int)256);
                if (!var4_2) ** GOTO lbl450
                throw null;
            }
            case 116: {
                var3_3 /* !! */  = (int)fi.idui("igfe", idun(int ), (int)257);
                if (!var4_2) ** GOTO lbl498
                throw null;
            }
lbl695:
            // 2 sources

            case 117: {
                var3_3 /* !! */  = (int)fi.idui("igff", idun(int ), (int)258);
                if (!var4_2) ** GOTO lbl445
                throw null;
            }
lbl699:
            // 3 sources

            case 118: {
                var3_3 /* !! */  = (int)fi.idui("igfg", idun(int ), (int)259);
                if (!var4_2) ** GOTO lbl325
                throw null;
            }
lbl703:
            // 3 sources

            case 119: {
                var3_3 /* !! */  = (int)fi.idui("igfh", idun(int ), (int)260);
                if (!var4_2) ** GOTO lbl261
                throw null;
            }
            case 120: {
                var3_3 /* !! */  = (int)fi.idui("igfi", idun(int ), (int)261);
                if (!var4_2) ** GOTO lbl588
                throw null;
            }
lbl711:
            // 2 sources

            case 121: {
                var3_3 /* !! */  = (int)fi.idui("igfj", idun(int ), (int)262);
                if (!var4_2) ** GOTO lbl294
                throw null;
            }
            case 122: {
                var3_3 /* !! */  = (int)fi.idui("igfk", idun(int ), (int)263);
                if (!var4_2) ** GOTO lbl558
                throw null;
            }
lbl719:
            // 2 sources

            case 123: {
                var3_3 /* !! */  = (int)fi.idui("igfl", idun(int ), (int)264);
                if (!var4_2) ** GOTO lbl266
                throw null;
            }
lbl723:
            // 2 sources

            case 124: {
                var3_3 /* !! */  = (int)fi.idui("igfm", idun(int ), (int)265);
                if (!var4_2) ** GOTO lbl542
                throw null;
            }
lbl727:
            // 3 sources

            case 125: {
                var3_3 /* !! */  = (int)fi.idui("igfn", idun(int ), (int)266);
                if (!var4_2) ** GOTO lbl571
                throw null;
            }
            case 126: 
        }
        var3_3 /* !! */  = (int)fi.idui("igfo", idun(int ), (int)267);
        ** while (!var4_2)
lbl734:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPacket(cr var1_1) {
        block74: {
            block73: {
                var6_2 = fi.c;
                var5_3 /* !! */  = fi.b;
                var4_4 = fi.a;
                if (var6_2) {
                    throw null;
lbl6:
                    // 23 sources

                    return;
                }
                if (var4_4 || var4_4) ** GOTO lbl6
                if (fi.mc.field_1724 != null) break block73;
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
            }
            if (var4_4 || var4_4) ** GOTO lbl6
            if (!this.chatFilter.isValue()) break block74;
            if (var4_4) ** GOTO lbl6
            if (!var1_1.isSend()) break block74;
            if (var4_4) ** GOTO lbl6
            var3_5 = var1_1.getPacket();
            if (var4_4) ** GOTO lbl6
            if (!(var3_5 instanceof class_2797)) break block74;
            if (var4_4) ** GOTO lbl6
            var2_6 = (class_2797)var3_5;
            if (var4_4 || var4_4) ** GOTO lbl6
            if (!fi.containsBannedWord(var2_6.comp_945())) break block74;
            if (var4_4 || var4_4) ** GOTO lbl6
            var1_1.setCancelled((boolean)fi.idui("iehj", idun(int ), (int)93));
            if (var4_4 || var4_4) ** GOTO lbl6
            pp.brandmessage("\u0412 \u0441\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u0438 \u043d\u0430\u0439\u0434\u0435\u043d\u043e \u0437\u0430\u043f\u0440\u0435\u0449\u0451\u043d\u043d\u043e\u0435 \u0441\u043b\u043e\u0432\u043e, \u043e\u0442\u043f\u0440\u0430\u0432\u043a\u0430 \u043e\u0442\u043c\u0435\u043d\u0435\u043d\u0430");
            if (var4_4) ** GOTO lbl6
        }
        if (var4_4 || var4_4) ** GOTO lbl6
        if (!this.fixAfterPvp.isValue()) ** GOTO lbl54
        if (var4_4) ** GOTO lbl6
        if (var1_1.getType() != cr$Type.RECEIVE) ** GOTO lbl54
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4 || var4_4) ** GOTO lbl6
                var3_5 = var1_1.getPacket();
                if (var4_4) ** GOTO lbl6
                if (!(var3_5 instanceof class_7439)) ** GOTO lbl54
                if (var4_4) ** GOTO lbl6
                var2_6 = (class_7439)var3_5;
                if (var4_4 || var4_4) ** GOTO lbl6
                var3_5 = var2_6.comp_763().getString().toLowerCase(Locale.ROOT);
                if (var4_4 || var4_4) ** GOTO lbl6
                if (var3_5.contains("pvp \u0440\u0435\u0436\u0438\u043c \u0437\u0430\u043a\u043e\u043d\u0447\u0438\u043b\u0441\u044f")) ** GOTO lbl51
                if (var4_4) ** GOTO lbl6
                if (!var3_5.contains("\u043c\u043e\u0436\u043d\u043e \u0441\u043f\u043e\u043a\u043e\u0439\u043d\u043e \u0432\u044b\u0445\u043e\u0434\u0438\u0442\u044c")) ** GOTO lbl54
                if (var4_4) ** GOTO lbl6
lbl51:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                this.fixAt = System.currentTimeMillis() + fi.idui("iehk", iduf(int ), (int)24);
                if (var4_4) ** GOTO lbl6
lbl54:
                // 5 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var5_3 /* !! */  = (int)fi.idui("iehl", idun(int ), (int)94);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 1: {
                var5_3 /* !! */  = (int)fi.idui("iehm", idun(int ), (int)95);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl67:
            // 4 sources

            case 2: {
                var5_3 /* !! */  = (int)fi.idui("iehn", idun(int ), (int)96);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl72:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)fi.idui("iehp", idun(int ), (int)97);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl77:
            // 2 sources

            case 4: {
                var5_3 /* !! */  = (int)fi.idui("iehu", idun(int ), (int)98);
                if (!var6_2) break;
                throw null;
            }
            case 5: {
                var5_3 /* !! */  = (int)fi.idui("iehx", idun(int ), (int)99);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl109
            }
            case 6: {
                var5_3 /* !! */  = (int)fi.idui("ieif", idun(int ), (int)100);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl131
            }
            case 7: {
                var5_3 /* !! */  = (int)fi.idui("ieim", idun(int ), (int)101);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl96:
            // 2 sources

            case 8: {
                var5_3 /* !! */  = (int)fi.idui("ieio", idun(int ), (int)102);
                if (!var6_2) ** GOTO lbl72
                throw null;
            }
lbl100:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)fi.idui("ieir", idun(int ), (int)103);
                if (!var6_2) ** GOTO lbl67
                throw null;
            }
            case 10: {
                var5_3 /* !! */  = (int)fi.idui("ieiv", idun(int ), (int)104);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl109:
            // 4 sources

            case 11: {
                var5_3 /* !! */  = (int)fi.idui("ieiw", idun(int ), (int)105);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl118
            }
            case 12: {
                var5_3 /* !! */  = (int)fi.idui("iejf", idun(int ), (int)106);
                if (!var6_2) break;
                throw null;
            }
lbl118:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)fi.idui("iejg", idun(int ), (int)107);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl215
            }
            case 14: {
                var5_3 /* !! */  = (int)fi.idui("iejh", idun(int ), (int)108);
                if (!var6_2) ** GOTO lbl67
                throw null;
            }
            case 15: {
                var5_3 /* !! */  = (int)fi.idui("ieji", idun(int ), (int)109);
                if (!var6_2) ** GOTO lbl96
                throw null;
            }
lbl131:
            // 2 sources

            case 16: {
                do {
                    var5_3 /* !! */  = (int)fi.idui("iejj", idun(int ), (int)110);
                } while (!var6_2);
                throw null;
            }
lbl136:
            // 3 sources

            case 17: {
                var5_3 /* !! */  = (int)fi.idui("iejl", idun(int ), (int)111);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl141:
            // 3 sources

            case 18: {
                var5_3 /* !! */  = (int)fi.idui("iejn", idun(int ), (int)112);
                if (!var6_2) ** GOTO lbl100
                throw null;
            }
lbl145:
            // 2 sources

            case 19: {
                var5_3 /* !! */  = (int)fi.idui("iejp", idun(int ), (int)113);
                if (!var6_2) ** GOTO lbl109
                throw null;
            }
            case 20: {
                var5_3 /* !! */  = (int)fi.idui("iejr", idun(int ), (int)114);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl206
            }
lbl154:
            // 3 sources

            case 21: {
                var5_3 /* !! */  = (int)fi.idui("iejt", idun(int ), (int)115);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl159:
            // 3 sources

            case 22: {
                var5_3 /* !! */  = (int)fi.idui("iejx", idun(int ), (int)116);
                if (!var6_2) ** GOTO lbl136
                throw null;
            }
lbl163:
            // 2 sources

            case 23: {
                var5_3 /* !! */  = (int)fi.idui("iekc", idun(int ), (int)117);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl215
            }
            case 24: {
                var5_3 /* !! */  = (int)fi.idui("ieke", idun(int ), (int)118);
                if (!var6_2) ** GOTO lbl159
                throw null;
            }
            case 25: {
                var5_3 /* !! */  = (int)fi.idui("iekh", idun(int ), (int)119);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl206
            }
lbl177:
            // 3 sources

            case 26: {
                var5_3 /* !! */  = (int)fi.idui("iekk", idun(int ), (int)120);
                if (!var6_2) ** GOTO lbl67
                throw null;
            }
lbl181:
            // 2 sources

            case 27: {
                var5_3 /* !! */  = (int)fi.idui("iekn", idun(int ), (int)121);
                if (!var6_2) ** GOTO lbl163
                throw null;
            }
            case 28: {
                var5_3 /* !! */  = (int)fi.idui("iemn", idun(int ), (int)122);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl190:
            // 3 sources

            case 29: {
                var5_3 /* !! */  = (int)fi.idui("iemp", idun(int ), (int)123);
                if (!var6_2) ** GOTO lbl136
                throw null;
            }
            case 30: {
                var5_3 /* !! */  = (int)fi.idui("iemr", idun(int ), (int)124);
                if (!var6_2) ** GOTO lbl77
                throw null;
            }
            case 31: {
                var5_3 /* !! */  = (int)fi.idui("iemt", idun(int ), (int)125);
                if (!var6_2) ** GOTO lbl141
                throw null;
            }
lbl202:
            // 2 sources

            case 32: {
                var5_3 /* !! */  = (int)fi.idui("iemw", idun(int ), (int)126);
                if (!var6_2) ** GOTO lbl190
                throw null;
            }
lbl206:
            // 3 sources

            case 33: {
                var5_3 /* !! */  = (int)fi.idui("iemy", idun(int ), (int)127);
                if (!var6_2) ** GOTO lbl177
                throw null;
            }
lbl210:
            // 2 sources

            case 34: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)fi.idui("ienb", idun(int ), (int)128);
                    if (!var6_2) break block0;
                    throw null;
                }
            }
lbl215:
            // 3 sources

            case 35: {
                var5_3 /* !! */  = (int)fi.idui("iend", idun(int ), (int)129);
                if (!var6_2) ** GOTO lbl145
                throw null;
            }
            case 36: {
                var5_3 /* !! */  = (int)fi.idui("ieng", idun(int ), (int)130);
                if (!var6_2) ** GOTO lbl109
                throw null;
            }
            case 37: 
        }
        var5_3 /* !! */  = (int)fi.idui("ienj", idun(int ), (int)131);
        ** while (!var6_2)
lbl226:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ihqq() {
        fi.idup[100] = 828199247;
        fi.idup[101] = 352497560;
        fi.idup[102] = -1181426817;
        fi.idup[103] = -900274069;
        fi.idup[104] = 200619724;
        fi.idup[105] = -580687849;
        fi.idup[106] = 436231340;
        fi.idup[107] = -84123612;
        fi.idup[108] = -410666475;
        fi.idup[109] = 2048270312;
        fi.idup[110] = 1167160807;
        fi.idup[111] = -1484602819;
        fi.idup[112] = 1913437026;
        fi.idup[113] = 160658848;
        fi.idup[114] = -1568623874;
        fi.idup[115] = -1057202937;
        fi.idup[116] = -1773986215;
        fi.idup[117] = 199238902;
        fi.idup[118] = 1840611355;
        fi.idup[119] = -753997929;
        fi.idup[120] = 553084665;
        fi.idup[121] = -1924748322;
        fi.idup[122] = 1016163144;
        fi.idup[123] = -1039466751;
        fi.idup[124] = 1333444793;
        fi.idup[125] = -1940017962;
        fi.idup[126] = -1485866444;
        fi.idup[127] = -756956474;
        fi.idup[128] = -1330326544;
        fi.idup[129] = 291611262;
        fi.idup[130] = -1231251401;
        fi.idup[131] = 661865610;
        fi.idup[132] = -942814980;
        fi.idup[133] = 1282459724;
        fi.idup[134] = -1884050695;
        fi.idup[135] = 695820795;
        fi.idup[136] = -623939495;
        fi.idup[137] = 1005515543;
        fi.idup[138] = 1595741044;
        fi.idup[139] = 1663220354;
        fi.idup[140] = 1336645068;
        fi.idup[141] = 1288410021;
        fi.idup[142] = -2035738039;
        fi.idup[143] = 1064711052;
        fi.idup[144] = 3931119;
        fi.idup[145] = 614308758;
        fi.idup[146] = 1017916470;
        fi.idup[147] = -692538971;
        fi.idup[148] = -1247396767;
        fi.idup[149] = 455852328;
        fi.idup[150] = -1592531051;
        fi.idup[151] = 397200774;
        fi.idup[152] = 330125184;
        fi.idup[153] = -858954331;
        fi.idup[154] = 715486144;
        fi.idup[155] = -1781407319;
        fi.idup[156] = -332575625;
        fi.idup[157] = 1347350300;
        fi.idup[158] = -1950389584;
        fi.idup[159] = -1022501602;
        fi.idup[160] = -1824217734;
        fi.idup[161] = -1621784237;
        fi.idup[162] = 1025390823;
        fi.idup[163] = -1851723873;
        fi.idup[164] = -1155636144;
        fi.idup[165] = 529105403;
        fi.idup[166] = 195827600;
        fi.idup[167] = -2120260894;
        fi.idup[168] = -612029679;
        fi.idup[169] = 2072884261;
        fi.idup[170] = 1800668387;
        fi.idup[171] = 606025006;
        fi.idup[172] = -576783055;
        fi.idup[173] = 1077786357;
        fi.idup[174] = 1851875022;
        fi.idup[175] = 453790001;
        fi.idup[176] = -1683090244;
        fi.idup[177] = 336839572;
        fi.idup[178] = 2104230865;
        fi.idup[179] = -1737539825;
        fi.idup[180] = 800278498;
        fi.idup[181] = 657622635;
        fi.idup[182] = -781509079;
        fi.idup[183] = -1205843266;
        fi.idup[184] = 1049805494;
        fi.idup[185] = 1771982733;
        fi.idup[186] = 780598576;
        fi.idup[187] = -1264542832;
        fi.idup[188] = -1608246990;
        fi.idup[189] = -1644931468;
        fi.idup[190] = 82092291;
        fi.idup[191] = -1335219951;
        fi.idup[192] = 1940059518;
        fi.idup[193] = -391772945;
        fi.idup[194] = 1663818853;
        fi.idup[195] = 1907292434;
        fi.idup[196] = -611981711;
        fi.idup[197] = -1582727845;
        fi.idup[198] = -1489817374;
        fi.idup[199] = 746468101;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void tryHalfTickUse() {
        v0 /* !! */  = fi.pm;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - fi.idui("igjc", iduf(int ), (int)70));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -274562903: {
                    v1 = fi.idui("igjd", iduf(int ), (int)71);
                    continue block24;
                }
                case 184280741: {
                    v1 = fi.idui("igje", iduf(int ), (int)72);
                    continue block24;
                }
                case 247984279: {
                    v1 = fi.idui("igjf", iduf(int ), (int)73);
                    continue block24;
                }
                case 311602808: {
                    break block24;
                }
            }
            break;
        }
        var3_1 = fi.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fi.pm - fi.idui("igjg", iduf(int ), (int)74)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fi.idui("igjh", idun(int ), (int)317)) break;
            v2 /* !! */  = (long)fi.idui("igji", idun(int ), (int)318);
        }
        var2_2 /* !! */  = fi.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = fi.pm - fi.idui("igjj", iduf(int ), (int)75)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == fi.idui("igjk", idun(int ), (int)319)) break;
            v3 /* !! */  = (long)fi.idui("igjl", idun(int ), (int)320);
        }
        var1_3 = fi.a;
        if (var3_1) {
            throw null;
lbl32:
            // 6 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = fi.pm - fi.idui("igjm", iduf(int ), (int)76)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == fi.idui("igjn", idun(int ), (int)321)) break;
            v4 /* !! */  = (long)fi.idui("igjo", idun(int ), (int)322);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = fi.pm - fi.idui("igjp", iduf(int ), (int)77)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == fi.idui("igjq", idun(int ), (int)323)) break;
            v5 /* !! */  = (long)fi.idui("igjr", idun(int ), (int)324);
        }
        if (this.phase != fi$ActionPhase.WAIT_USE_HALF) ** GOTO lbl86
        if (var1_3) ** GOTO lbl32
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_4 = fi.pm - fi.idui("igjs", iduf(int ), (int)78)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == fi.idui("igjt", idun(int ), (int)325)) break;
            v6 /* !! */  = (long)fi.idui("igju", idun(int ), (int)326);
        }
        v7 /* !! */  = fi.pm;
        if (true) ** GOTO lbl56
        block31: while (true) {
            v7 /* !! */  = (long)(fi.idui("igjw", iduf(int ), (int)80) - fi.idui("igjv", iduf(int ), (int)79));
lbl56:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -984187951: {
                    continue block31;
                }
                case 311602808: {
                    break block31;
                }
            }
            break;
        }
        if (fi.mc.field_1724 == null) ** GOTO lbl86
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl32
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_5 = fi.pm - fi.idui("igjx", iduf(int ), (int)81)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == fi.idui("igjy", idun(int ), (int)327)) break;
                    v8 /* !! */  = (long)fi.idui("igjz", idun(int ), (int)328);
                }
                v9 = System.currentTimeMillis();
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_6 = fi.pm - fi.idui("igka", iduf(int ), (int)82)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == fi.idui("igkb", idun(int ), (int)329)) break;
                    v10 /* !! */  = (long)fi.idui("igkc", idun(int ), (int)330);
                }
                if (v9 < this.actionAt) ** GOTO lbl86
                if (var1_3 || var1_3) ** GOTO lbl32
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_7 = fi.pm - fi.idui("igkd", iduf(int ), (int)83)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == fi.idui("igke", idun(int ), (int)331)) break;
                    v11 /* !! */  = (long)fi.idui("igkf", idun(int ), (int)332);
                }
                this.usePreparedTrap();
                if (var1_3) ** GOTO lbl32
lbl86:
                // 4 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)fi.idui("igkg", idun(int ), (int)333);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl122
            }
            case 1: {
                var2_2 /* !! */  = (int)fi.idui("igkh", idun(int ), (int)334);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl126
            }
lbl99:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)fi.idui("igki", idun(int ), (int)335);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl104:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)fi.idui("igkj", idun(int ), (int)336);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl117
            }
            case 4: {
                var2_2 /* !! */  = (int)fi.idui("igkk", idun(int ), (int)337);
                if (!var3_1) ** GOTO lbl99
                throw null;
            }
lbl113:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)fi.idui("igkl", idun(int ), (int)338);
                if (var3_1) {
                    throw null;
                }
            }
lbl117:
            // 4 sources

            case 6: {
                do {
                    var2_2 /* !! */  = (int)fi.idui("igkm", idun(int ), (int)339);
                } while (!var3_1);
                throw null;
            }
lbl122:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)fi.idui("igkn", idun(int ), (int)340);
                if (!var3_1) ** GOTO lbl104
                throw null;
            }
lbl126:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)fi.idui("igko", idun(int ), (int)341);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl136
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fi.idui("igkp", idun(int ), (int)342);
                    if (!var3_1) break block10;
                    throw null;
                }
            }
lbl136:
            // 2 sources

            case 10: {
                do {
                    var2_2 /* !! */  = (int)fi.idui("igkq", idun(int ), (int)343);
                } while (!var3_1);
                throw null;
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)fi.idui("igkr", idun(int ), (int)344);
        ** while (!var3_1)
lbl144:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean containsBannedWord(String var0) {
        v0 /* !! */  = fi.pm;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - fi.idui("ihiv", iduf(int ), (int)344));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 311602808: {
                    break block23;
                }
                case 625481276: {
                    v1 = fi.idui("ihiw", iduf(int ), (int)345);
                    continue block23;
                }
                case 1831975075: {
                    v1 = fi.idui("ihix", iduf(int ), (int)346);
                    continue block23;
                }
            }
            break;
        }
        var4_1 = fi.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fi.pm - fi.idui("ihiy", iduf(int ), (int)347)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == fi.idui("ihiz", idun(int ), (int)712)) break;
            v2 /* !! */  = (long)fi.idui("ihja", idun(int ), (int)713);
        }
        var3_2 /* !! */  = fi.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = fi.pm - fi.idui("ihjb", iduf(int ), (int)348)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == fi.idui("ihjc", idun(int ), (int)714)) break;
            v3 /* !! */  = (long)fi.idui("ihjd", idun(int ), (int)715);
        }
        var2_3 = fi.a;
        if (var4_1) {
            throw null;
lbl31:
            // 2 sources

            return (boolean)fi.idui("ihje", idun(int ), (int)716);
        }
        if (var2_3 || var2_3) ** GOTO lbl31
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = fi.pm - fi.idui("ihjf", iduf(int ), (int)349)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == fi.idui("ihjg", idun(int ), (int)717)) break;
            v4 /* !! */  = (long)fi.idui("ihjh", idun(int ), (int)718);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = fi.pm - fi.idui("ihji", iduf(int ), (int)350)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == fi.idui("ihjj", idun(int ), (int)719)) break;
            v5 /* !! */  = (long)fi.idui("ihjk", idun(int ), (int)720);
        }
        var1_4 = var0.toLowerCase(Locale.ROOT);
        ** while (var2_3 || var2_3)
lbl48:
        // 1 sources

        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = fi.pm - fi.idui("ihjl", iduf(int ), (int)351)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == fi.idui("ihjm", idun(int ), (int)721)) break;
                    v6 /* !! */  = (long)fi.idui("ihjn", idun(int ), (int)722);
                }
                v7 /* !! */  = fi.pm;
                if (true) ** GOTO lbl61
                block30: while (true) {
                    v7 /* !! */  = (long)(fi.idui("ihjp", iduf(int ), (int)353) - fi.idui("ihjo", iduf(int ), (int)352));
lbl61:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 311602808: {
                            break block30;
                        }
                        case 1503564647: {
                            continue block30;
                        }
                    }
                    break;
                }
                v8 = fi.BANNED_WORDS.stream();
                v9 /* !! */  = fi.pm;
                if (true) ** GOTO lbl71
                block31: while (true) {
                    v9 /* !! */  = (long)(v10 - fi.idui("ihjq", iduf(int ), (int)354));
lbl71:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -2077975762: {
                            v10 = fi.idui("ihjr", iduf(int ), (int)355);
                            continue block31;
                        }
                        case 124168201: {
                            v10 = fi.idui("ihjs", iduf(int ), (int)356);
                            continue block31;
                        }
                        case 311602808: {
                            break block31;
                        }
                        case 1857064508: {
                            v10 = fi.idui("ihjt", iduf(int ), (int)357);
                            continue block31;
                        }
                    }
                    break;
                }
                v11 = (Predicate<Pattern>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$containsBannedWord$0(java.lang.String java.util.regex.Pattern ), (Ljava/util/regex/Pattern;)Z)((String)var1_4);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = fi.pm - fi.idui("ihju", iduf(int ), (int)358)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v12 /* !! */  == fi.idui("ihjv", idun(int ), (int)723)) break;
                    v12 /* !! */  = (long)fi.idui("ihjw", idun(int ), (int)724);
                }
                return v8.anyMatch(v11);
            }
lbl91:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)fi.idui("ihjx", idun(int ), (int)725);
                if (var4_1) {
                    throw null;
                }
            }
            case 1: {
                var3_2 /* !! */  = (int)fi.idui("ihjy", idun(int ), (int)726);
                if (!var4_1) ** GOTO lbl91
                throw null;
            }
            case 2: {
                var3_2 /* !! */  = (int)fi.idui("ihjz", idun(int ), (int)727);
                if (var4_1) {
                    throw null;
                }
            }
            case 3: {
                var3_2 /* !! */  = (int)fi.idui("ihka", idun(int ), (int)728);
                if (!var4_1) break;
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)fi.idui("ihkb", idun(int ), (int)729);
                    if (!var4_1) break block5;
                    throw null;
                }
            }
            case 5: 
        }
        var3_2 /* !! */  = (int)fi.idui("ihkc", idun(int ), (int)730);
        ** while (!var4_1)
lbl115:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ihox() {
        fi.iduo[0] = -501886629;
        fi.iduo[1] = -50007112;
        fi.iduo[2] = 1204941725;
        fi.iduo[3] = 1379696629;
        fi.iduo[4] = 953764159;
        fi.iduo[5] = -889302367;
        fi.iduo[6] = 222343695;
        fi.iduo[7] = 783402094;
        fi.iduo[8] = 1701612326;
        fi.iduo[9] = 1011500716;
        fi.iduo[10] = 1931870582;
        fi.iduo[11] = -1276673861;
        fi.iduo[12] = 1088054234;
        fi.iduo[13] = 1377132700;
        fi.iduo[14] = 1543815181;
        fi.iduo[15] = -1030112438;
        fi.iduo[16] = -1443102546;
        fi.iduo[17] = -1619729051;
        fi.iduo[18] = -1453082983;
        fi.iduo[19] = -1008235102;
        fi.iduo[20] = 1582295049;
        fi.iduo[21] = -1537621850;
        fi.iduo[22] = -780252608;
        fi.iduo[23] = -39727677;
        fi.iduo[24] = -21326402;
        fi.iduo[25] = -1219266191;
        fi.iduo[26] = -455937637;
        fi.iduo[27] = -49601785;
        fi.iduo[28] = 16582688;
        fi.iduo[29] = 1547341133;
        fi.iduo[30] = 951963812;
        fi.iduo[31] = -1637027421;
        fi.iduo[32] = 735881249;
        fi.iduo[33] = 574265833;
        fi.iduo[34] = -1704158479;
        fi.iduo[35] = 744792526;
        fi.iduo[36] = -1288333569;
        fi.iduo[37] = -502319672;
        fi.iduo[38] = -1655697390;
        fi.iduo[39] = -1039341609;
        fi.iduo[40] = 2088449952;
        fi.iduo[41] = -745479275;
        fi.iduo[42] = 821543141;
        fi.iduo[43] = -240234102;
        fi.iduo[44] = 1427228114;
        fi.iduo[45] = 1724434405;
        fi.iduo[46] = 97925987;
        fi.iduo[47] = 794638983;
        fi.iduo[48] = -1654004579;
        fi.iduo[49] = 739191469;
        fi.iduo[50] = 83879226;
        fi.iduo[51] = 182039968;
        fi.iduo[52] = 1203039276;
        fi.iduo[53] = 1641022829;
        fi.iduo[54] = -1934291947;
        fi.iduo[55] = 1595894645;
        fi.iduo[56] = 335937047;
        fi.iduo[57] = -591740713;
        fi.iduo[58] = -431030952;
        fi.iduo[59] = 921045946;
        fi.iduo[60] = -687200985;
        fi.iduo[61] = 1012621142;
        fi.iduo[62] = 1516980798;
        fi.iduo[63] = 1586445175;
        fi.iduo[64] = -303676368;
        fi.iduo[65] = -2139061359;
        fi.iduo[66] = -605710589;
        fi.iduo[67] = 1658098881;
        fi.iduo[68] = -161750510;
        fi.iduo[69] = 840240386;
        fi.iduo[70] = -1873632767;
        fi.iduo[71] = -979531003;
        fi.iduo[72] = 1155665621;
        fi.iduo[73] = 1229667305;
        fi.iduo[74] = 1656052491;
        fi.iduo[75] = -1064416715;
        fi.iduo[76] = 695200656;
        fi.iduo[77] = -429748868;
        fi.iduo[78] = 1699821565;
        fi.iduo[79] = -1403133870;
        fi.iduo[80] = 596284287;
        fi.iduo[81] = 1630587608;
        fi.iduo[82] = -1878317256;
        fi.iduo[83] = 1444105150;
        fi.iduo[84] = -150966307;
        fi.iduo[85] = 1764358646;
        fi.iduo[86] = -2080586504;
        fi.iduo[87] = 1160657935;
        fi.iduo[88] = -1328007175;
        fi.iduo[89] = 589964258;
        fi.iduo[90] = 1895019961;
        fi.iduo[91] = 1622777329;
        fi.iduo[92] = 664411895;
        fi.iduo[93] = -822138417;
        fi.iduo[94] = 796784786;
        fi.iduo[95] = 1675630151;
        fi.iduo[96] = -1252207044;
        fi.iduo[97] = 555038986;
        fi.iduo[98] = 1920030135;
        fi.iduo[99] = 1407361928;
    }
}

