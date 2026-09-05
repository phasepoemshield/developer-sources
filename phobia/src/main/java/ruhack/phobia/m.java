/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_2558
 *  net.minecraft.class_2558$class_10609
 *  net.minecraft.class_2561
 *  net.minecraft.class_2568
 *  net.minecraft.class_2568$class_10613
 *  net.minecraft.class_310
 *  net.minecraft.class_5250
 *  net.minecraft.class_640
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import net.minecraft.class_124;
import net.minecraft.class_2558;
import net.minecraft.class_2561;
import net.minecraft.class_2568;
import net.minecraft.class_310;
import net.minecraft.class_5250;
import net.minecraft.class_640;
import ruhack.phobia.dk;
import ruhack.phobia.dl;
import ruhack.phobia.f;
import ruhack.phobia.g;
import ruhack.phobia.i;
import ruhack.phobia.o;

public class m
extends f {
    private static int[] agsc = new int[326];
    public static final boolean c;
    public static final int b;
    private static final DateTimeFormatter DATE_FORMAT;
    private static long[] agzg;
    private static int[] agsd;
    private static long[] agzh;
    protected static final long by = 7477084383466359060L;
    public static final boolean a;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public List<String> getLongDesc() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = m.by - m.agse("agzx", agzf(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == m.agse("agzy", agsb(int ), (int)188)) break;
            v0 /* !! */  = (long)m.agse("agzz", agsb(int ), (int)189);
        }
        var3_1 = m.c;
        v1 /* !! */  = m.by;
        if (true) ** GOTO lbl12
        block10: while (true) {
            v1 /* !! */  = (long)(v2 - m.agse("ahaa", agzf(int ), (int)10));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1474164460: {
                    break block10;
                }
                case -1267253556: {
                    v2 = m.agse("ahab", agzf(int ), (int)11);
                    continue block10;
                }
                case 1503892283: {
                    v2 = m.agse("ahac", agzf(int ), (int)12);
                    continue block10;
                }
            }
            break;
        }
        var2_2 = m.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = m.by - m.agse("ahad", agzf(int ), (int)13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == m.agse("ahae", agsb(int ), (int)190)) break;
            v3 /* !! */  = (long)m.agse("ahaf", agsb(int ), (int)191);
        }
        var1_3 = m.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

        v4 = new String[]{"\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \u0434\u043b\u044f \u0443\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u044f \u0441\u043f\u0438\u0441\u043a\u043e\u043c \u0434\u0440\u0443\u0437\u0435\u0439", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435:", "> friend add <name> - \u0414\u043e\u0431\u0430\u0432\u0438\u0442\u044c \u0438\u0433\u0440\u043e\u043a\u0430 \u0432 \u0434\u0440\u0443\u0437\u044c\u044f", "> friend remove <name> - \u0423\u0434\u0430\u043b\u0438\u0442\u044c \u0438\u0433\u0440\u043e\u043a\u0430 \u0438\u0437 \u0434\u0440\u0443\u0437\u0435\u0439", "> friend list - \u041f\u043e\u043a\u0430\u0437\u0430\u0442\u044c \u0441\u043f\u0438\u0441\u043e\u043a \u0434\u0440\u0443\u0437\u0435\u0439", "> friend clear - \u041e\u0447\u0438\u0441\u0442\u0438\u0442\u044c \u0441\u043f\u0438\u0441\u043e\u043a \u0434\u0440\u0443\u0437\u0435\u0439"};
        v5 /* !! */  = m.by;
        if (true) ** GOTO lbl39
        block13: while (true) {
            v5 /* !! */  = (long)(m.agse("ahah", agzf(int ), (int)15) - m.agse("ahag", agzf(int ), (int)14));
lbl39:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1474164460: {
                    break block13;
                }
                case 458234803: {
                    continue block13;
                }
            }
            break;
        }
        return Arrays.asList(v4);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_5250 lambda$execute$1(g var0, dk var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = m.by - m.agse("ahdi", agzf(int ), (int)46)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == m.agse("ahdj", agsb(int ), (int)240)) break;
            v0 /* !! */  = (long)m.agse("ahdk", agsb(int ), (int)241);
        }
        var8_2 = m.c;
        v1 /* !! */  = m.by;
        if (true) ** GOTO lbl11
        block139: while (true) {
            v1 /* !! */  = (long)(v2 - m.agse("ahdl", agzf(int ), (int)47));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1474164460: {
                    break block139;
                }
                case -379489197: {
                    v2 = m.agse("ahdm", agzf(int ), (int)48);
                    continue block139;
                }
                case 1168721006: {
                    v2 = m.agse("ahdn", agzf(int ), (int)49);
                    continue block139;
                }
                case 1390581132: {
                    v2 = m.agse("ahdo", agzf(int ), (int)50);
                    continue block139;
                }
            }
            break;
        }
        var7_3 /* !! */  = m.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = m.by - m.agse("ahdp", agzf(int ), (int)51)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == m.agse("ahdq", agsb(int ), (int)242)) break;
            v3 /* !! */  = (long)m.agse("ahdr", agsb(int ), (int)243);
        }
        var6_4 = m.a;
        if (var8_2) {
            throw null;
lbl32:
            // 6 sources

            return null;
        }
        if (var6_4 || var6_4) ** GOTO lbl32
        v4 /* !! */  = m.by;
        if (true) ** GOTO lbl39
        block142: while (true) {
            v4 /* !! */  = (long)(v5 - m.agse("ahds", agzf(int ), (int)52));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1474164460: {
                    break block142;
                }
                case -870715896: {
                    v5 = m.agse("ahdt", agzf(int ), (int)53);
                    continue block142;
                }
                case 901314986: {
                    v5 = m.agse("ahdu", agzf(int ), (int)54);
                    continue block142;
                }
            }
            break;
        }
        var2_5 = var1_1.getName();
        if (var6_4 || var6_4) ** GOTO lbl32
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = m.by - m.agse("ahdv", agzf(int ), (int)55)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == m.agse("ahdw", agsb(int ), (int)244)) break;
            v6 /* !! */  = (long)m.agse("ahdx", agsb(int ), (int)245);
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = m.by - m.agse("ahdy", agzf(int ), (int)56)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == m.agse("ahdz", agsb(int ), (int)246)) break;
            v7 /* !! */  = (long)m.agse("ahea", agsb(int ), (int)247);
        }
        v8 = var1_1.getAddedAt();
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_4 = m.by - m.agse("aheb", agzf(int ), (int)57)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == m.agse("ahec", agsb(int ), (int)248)) break;
            v9 /* !! */  = (long)m.agse("ahed", agsb(int ), (int)249);
        }
        v10 = Instant.ofEpochMilli(v8);
        v11 /* !! */  = m.by;
        if (true) ** GOTO lbl71
        block146: while (true) {
            v11 /* !! */  = (long)(v12 - m.agse("ahee", agzf(int ), (int)58));
lbl71:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1625443632: {
                    v12 = m.agse("ahef", agzf(int ), (int)59);
                    continue block146;
                }
                case -1474164460: {
                    break block146;
                }
                case 382589978: {
                    v12 = m.agse("aheg", agzf(int ), (int)60);
                    continue block146;
                }
            }
            break;
        }
        var3_6 = m.DATE_FORMAT.format(v10);
        if (var6_4 || var6_4) ** GOTO lbl32
        v13 /* !! */  = m.by;
        if (true) ** GOTO lbl86
        block147: while (true) {
            v13 /* !! */  = (long)(m.agse("ahei", agzf(int ), (int)62) - m.agse("aheh", agzf(int ), (int)61));
lbl86:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1474164460: {
                    break block147;
                }
                case -136106992: {
                    continue block147;
                }
            }
            break;
        }
        v14 = var0.getPrefix();
        v15 /* !! */  = m.by;
        if (true) ** GOTO lbl96
        block148: while (true) {
            v15 /* !! */  = (long)(v16 - m.agse("ahej", agzf(int ), (int)63));
lbl96:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -1474164460: {
                    break block148;
                }
                case -1010852715: {
                    v16 = m.agse("ahek", agzf(int ), (int)64);
                    continue block148;
                }
                case -237971001: {
                    v16 = m.agse("ahel", agzf(int ), (int)65);
                    continue block148;
                }
                case 1959726312: {
                    v16 = m.agse("ahem", agzf(int ), (int)66);
                    continue block148;
                }
            }
            break;
        }
        var4_7 = v14 + "friend remove " + var2_5;
        if (var6_4 || var6_4) ** GOTO lbl32
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_5 = m.by - m.agse("ahen", agzf(int ), (int)67)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == m.agse("aheo", agsb(int ), (int)250)) break;
            v17 /* !! */  = (long)m.agse("ahep", agsb(int ), (int)251);
        }
        v18 = class_2561.method_43470((String)"[");
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_6 = m.by - m.agse("aheq", agzf(int ), (int)68)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == m.agse("aher", agsb(int ), (int)252)) break;
            v19 /* !! */  = (long)m.agse("ahes", agsb(int ), (int)253);
        }
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_7 = m.by - m.agse("ahet", agzf(int ), (int)69)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == m.agse("aheu", agsb(int ), (int)254)) break;
            v20 /* !! */  = (long)m.agse("ahev", agsb(int ), (int)255);
        }
        v21 = v18.method_27692(class_124.field_1080);
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_8 = m.by - m.agse("ahew", agzf(int ), (int)70)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == m.agse("ahex", agsb(int ), (int)256)) break;
            v22 /* !! */  = (long)m.agse("ahey", agsb(int ), (int)257);
        }
        v23 = class_2561.method_43470((String)"\u0423\u0434\u0430\u043b\u0438\u0442\u044c \u0438\u0437 \u0434\u0440\u0443\u0437\u0435\u0439");
        v24 /* !! */  = m.by;
        if (true) ** GOTO lbl137
        block153: while (true) {
            v24 /* !! */  = (long)(v25 - m.agse("ahez", agzf(int ), (int)71));
lbl137:
            // 2 sources

            switch ((int)v24 /* !! */ ) {
                case -1834156041: {
                    v25 = m.agse("ahfa", agzf(int ), (int)72);
                    continue block153;
                }
                case -1474164460: {
                    break block153;
                }
                case 1801124229: {
                    v25 = m.agse("ahfb", agzf(int ), (int)73);
                    continue block153;
                }
            }
            break;
        }
        v26 /* !! */  = m.by;
        if (true) ** GOTO lbl150
        block154: while (true) {
            v26 /* !! */  = (long)(v27 - m.agse("ahfc", agzf(int ), (int)74));
lbl150:
            // 2 sources

            switch ((int)v26 /* !! */ ) {
                case -1970118538: {
                    v27 = m.agse("ahfd", agzf(int ), (int)75);
                    continue block154;
                }
                case -1474164460: {
                    break block154;
                }
                case 1825244568: {
                    v27 = m.agse("ahfe", agzf(int ), (int)76);
                    continue block154;
                }
            }
            break;
        }
        v28 = v23.method_27692(class_124.field_1061);
        while (true) {
            if ((v29 /* !! */  = (cfr_temp_9 = m.by - m.agse("ahff", agzf(int ), (int)77)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v29 /* !! */  == m.agse("ahfg", agsb(int ), (int)258)) break;
            v29 /* !! */  = (long)m.agse("ahfh", agsb(int ), (int)259);
        }
        v30 = v21.method_10852((class_2561)v28);
        v31 /* !! */  = m.by;
        if (true) ** GOTO lbl170
        block156: while (true) {
            v31 /* !! */  = (long)(v32 - m.agse("ahfi", agzf(int ), (int)78));
lbl170:
            // 2 sources

            switch ((int)v31 /* !! */ ) {
                case -2039470414: {
                    v32 = m.agse("ahfj", agzf(int ), (int)79);
                    continue block156;
                }
                case -1474164460: {
                    break block156;
                }
                case -670106417: {
                    v32 = m.agse("ahfk", agzf(int ), (int)80);
                    continue block156;
                }
                case -548359870: {
                    v32 = m.agse("ahfl", agzf(int ), (int)81);
                    continue block156;
                }
            }
            break;
        }
        v33 = class_2561.method_43470((String)"]");
        v34 /* !! */  = m.by;
        if (true) ** GOTO lbl187
        block157: while (true) {
            v34 /* !! */  = (long)(m.agse("ahfn", agzf(int ), (int)83) - m.agse("ahfm", agzf(int ), (int)82));
lbl187:
            // 2 sources

            switch ((int)v34 /* !! */ ) {
                case -1886863545: {
                    continue block157;
                }
                case -1474164460: {
                    break block157;
                }
            }
            break;
        }
        v35 /* !! */  = m.by;
        if (true) ** GOTO lbl196
        block158: while (true) {
            v35 /* !! */  = (long)(v36 - m.agse("ahfo", agzf(int ), (int)84));
lbl196:
            // 2 sources

            switch ((int)v35 /* !! */ ) {
                case -1474164460: {
                    break block158;
                }
                case -1378815168: {
                    v36 = m.agse("ahfp", agzf(int ), (int)85);
                    continue block158;
                }
                case -153986879: {
                    v36 = m.agse("ahfq", agzf(int ), (int)86);
                    continue block158;
                }
                case 325096516: {
                    v36 = m.agse("ahfr", agzf(int ), (int)87);
                    continue block158;
                }
            }
            break;
        }
        v37 = v33.method_27692(class_124.field_1080);
        while (true) {
            if ((v38 /* !! */  = (cfr_temp_10 = m.by - m.agse("ahfs", agzf(int ), (int)88)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v38 /* !! */  == m.agse("ahft", agsb(int ), (int)260)) break;
            v38 /* !! */  = (long)m.agse("ahfu", agsb(int ), (int)261);
        }
        var5_8 = v30.method_10852((class_2561)v37);
        if (var6_4 || var6_4) ** GOTO lbl32
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v39 /* !! */  = m.by;
                if (true) ** GOTO lbl223
                block160: while (true) {
                    v39 /* !! */  = (long)(v40 - m.agse("ahfv", agzf(int ), (int)89));
lbl223:
                    // 2 sources

                    switch ((int)v39 /* !! */ ) {
                        case -1584569882: {
                            v40 = m.agse("ahfw", agzf(int ), (int)90);
                            continue block160;
                        }
                        case -1474164460: {
                            break block160;
                        }
                        case 348922499: {
                            v40 = m.agse("ahfx", agzf(int ), (int)91);
                            continue block160;
                        }
                        case 675932417: {
                            v40 = m.agse("ahfy", agzf(int ), (int)92);
                            continue block160;
                        }
                    }
                    break;
                }
                v41 = var5_8.method_10866();
                while (true) {
                    if ((v42 /* !! */  = (cfr_temp_11 = m.by - m.agse("ahfz", agzf(int ), (int)93)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v42 /* !! */  == m.agse("ahga", agsb(int ), (int)262)) break;
                    v42 /* !! */  = (long)m.agse("ahgb", agsb(int ), (int)263);
                }
                v43 /* !! */  = m.by;
                if (true) ** GOTO lbl245
                block162: while (true) {
                    v43 /* !! */  = (long)(m.agse("ahgd", agzf(int ), (int)95) - m.agse("ahgc", agzf(int ), (int)94));
lbl245:
                    // 2 sources

                    switch ((int)v43 /* !! */ ) {
                        case -1637869080: {
                            continue block162;
                        }
                        case -1474164460: {
                            break block162;
                        }
                    }
                    break;
                }
                v44 = "\u0423\u0434\u0430\u043b\u0438\u0442\u044c " + var2_5 + " \u0438\u0437 \u0434\u0440\u0443\u0437\u0435\u0439";
                v45 /* !! */  = m.by;
                if (true) ** GOTO lbl255
                block163: while (true) {
                    v45 /* !! */  = (long)(v46 - m.agse("ahge", agzf(int ), (int)96));
lbl255:
                    // 2 sources

                    switch ((int)v45 /* !! */ ) {
                        case -1794847980: {
                            v46 = m.agse("ahgf", agzf(int ), (int)97);
                            continue block163;
                        }
                        case -1474164460: {
                            break block163;
                        }
                        case 76294289: {
                            v46 = m.agse("ahgg", agzf(int ), (int)98);
                            continue block163;
                        }
                    }
                    break;
                }
                v47 = class_2561.method_43470((String)v44);
                v48 /* !! */  = m.by;
                if (true) ** GOTO lbl269
                block164: while (true) {
                    v48 /* !! */  = (long)(v49 - m.agse("ahgh", agzf(int ), (int)99));
lbl269:
                    // 2 sources

                    switch ((int)v48 /* !! */ ) {
                        case -2011714778: {
                            v49 = m.agse("ahgi", agzf(int ), (int)100);
                            continue block164;
                        }
                        case -1474164460: {
                            break block164;
                        }
                        case 426384386: {
                            v49 = m.agse("ahgj", agzf(int ), (int)101);
                            continue block164;
                        }
                        case 1134709135: {
                            v49 = m.agse("ahgk", agzf(int ), (int)102);
                            continue block164;
                        }
                    }
                    break;
                }
                v50 /* !! */  = m.by;
                if (true) ** GOTO lbl285
                block165: while (true) {
                    v50 /* !! */  = (long)(m.agse("ahgm", agzf(int ), (int)104) - m.agse("ahgl", agzf(int ), (int)103));
lbl285:
                    // 2 sources

                    switch ((int)v50 /* !! */ ) {
                        case -1474164460: {
                            break block165;
                        }
                        case 77603457: {
                            continue block165;
                        }
                    }
                    break;
                }
                v51 = v47.method_27692(class_124.field_1061);
                while (true) {
                    if ((v52 /* !! */  = (cfr_temp_12 = m.by - m.agse("ahgn", agzf(int ), (int)105)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v52 /* !! */  == m.agse("ahgo", agsb(int ), (int)264)) break;
                    v52 /* !! */  = (long)m.agse("ahgp", agsb(int ), (int)265);
                }
                v53 = new class_2568.class_10613((class_2561)v51);
                while (true) {
                    if ((v54 /* !! */  = (cfr_temp_13 = m.by - m.agse("ahgq", agzf(int ), (int)106)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v54 /* !! */  == m.agse("ahgr", agsb(int ), (int)266)) break;
                    v54 /* !! */  = (long)m.agse("ahgs", agsb(int ), (int)267);
                }
                v55 = v41.method_10949((class_2568)v53);
                while (true) {
                    if ((v56 /* !! */  = (cfr_temp_14 = m.by - m.agse("ahgt", agzf(int ), (int)107)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v56 /* !! */  == m.agse("ahgu", agsb(int ), (int)268)) break;
                    v56 /* !! */  = (long)m.agse("ahgv", agsb(int ), (int)269);
                }
                while (true) {
                    if ((v57 /* !! */  = (cfr_temp_15 = m.by - m.agse("ahgw", agzf(int ), (int)108)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                    if (v57 /* !! */  == m.agse("ahgx", agsb(int ), (int)270)) break;
                    v57 /* !! */  = (long)m.agse("ahgy", agsb(int ), (int)271);
                }
                v58 = new class_2558.class_10609(var4_7);
                while (true) {
                    if ((v59 /* !! */  = (cfr_temp_16 = m.by - m.agse("ahgz", agzf(int ), (int)109)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                    if (v59 /* !! */  == m.agse("ahha", agsb(int ), (int)272)) break;
                    v59 /* !! */  = (long)m.agse("ahhb", agsb(int ), (int)273);
                }
                v60 = v55.method_10958((class_2558)v58);
                v61 /* !! */  = m.by;
                if (true) ** GOTO lbl324
                block171: while (true) {
                    v61 /* !! */  = (long)(v62 - m.agse("ahhc", agzf(int ), (int)110));
lbl324:
                    // 2 sources

                    switch ((int)v61 /* !! */ ) {
                        case -1474164460: {
                            break block171;
                        }
                        case -308674896: {
                            v62 = m.agse("ahhd", agzf(int ), (int)111);
                            continue block171;
                        }
                        case 906253762: {
                            v62 = m.agse("ahhe", agzf(int ), (int)112);
                            continue block171;
                        }
                    }
                    break;
                }
                var5_8.method_10862(v60);
                if (var6_4 || var6_4) ** continue;
                v63 /* !! */  = m.by;
                if (true) ** GOTO lbl340
                block172: while (true) {
                    v63 /* !! */  = (long)(v64 - m.agse("ahhf", agzf(int ), (int)113));
lbl340:
                    // 2 sources

                    switch ((int)v63 /* !! */ ) {
                        case -1893124926: {
                            v64 = m.agse("ahhg", agzf(int ), (int)114);
                            continue block172;
                        }
                        case -1628864299: {
                            v64 = m.agse("ahhh", agzf(int ), (int)115);
                            continue block172;
                        }
                        case -1474164460: {
                            break block172;
                        }
                        case 233672093: {
                            v64 = m.agse("ahhi", agzf(int ), (int)116);
                            continue block172;
                        }
                    }
                    break;
                }
                v65 = class_2561.method_43470((String)var2_5);
                while (true) {
                    if ((v66 /* !! */  = (cfr_temp_17 = m.by - m.agse("ahhj", agzf(int ), (int)117)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
                    if (v66 /* !! */  == m.agse("ahhk", agsb(int ), (int)274)) break;
                    v66 /* !! */  = (long)m.agse("ahhl", agsb(int ), (int)275);
                }
                v67 /* !! */  = m.by;
                if (true) ** GOTO lbl362
                block174: while (true) {
                    v67 /* !! */  = (long)(m.agse("ahhn", agzf(int ), (int)119) - m.agse("ahhm", agzf(int ), (int)118));
lbl362:
                    // 2 sources

                    switch ((int)v67 /* !! */ ) {
                        case -1474164460: {
                            break block174;
                        }
                        case 1158780017: {
                            continue block174;
                        }
                    }
                    break;
                }
                v68 = v65.method_27692(class_124.field_1068);
                while (true) {
                    if ((v69 /* !! */  = (cfr_temp_18 = m.by - m.agse("ahho", agzf(int ), (int)120)) == 0L ? 0 : (cfr_temp_18 < 0L ? -1 : 1)) == false) continue;
                    if (v69 /* !! */  == m.agse("ahhp", agsb(int ), (int)276)) break;
                    v69 /* !! */  = (long)m.agse("ahhq", agsb(int ), (int)277);
                }
                v70 = class_2561.method_43470((String)" (");
                v71 /* !! */  = m.by;
                if (true) ** GOTO lbl378
                block176: while (true) {
                    v71 /* !! */  = (long)(v72 - m.agse("ahhr", agzf(int ), (int)121));
lbl378:
                    // 2 sources

                    switch ((int)v71 /* !! */ ) {
                        case -2055452329: {
                            v72 = m.agse("ahhs", agzf(int ), (int)122);
                            continue block176;
                        }
                        case -1474164460: {
                            break block176;
                        }
                        case -569173666: {
                            v72 = m.agse("ahht", agzf(int ), (int)123);
                            continue block176;
                        }
                    }
                    break;
                }
                v73 /* !! */  = m.by;
                if (true) ** GOTO lbl391
                block177: while (true) {
                    v73 /* !! */  = (long)(v74 - m.agse("ahhu", agzf(int ), (int)124));
lbl391:
                    // 2 sources

                    switch ((int)v73 /* !! */ ) {
                        case -1474164460: {
                            break block177;
                        }
                        case -1469951510: {
                            v74 = m.agse("ahhv", agzf(int ), (int)125);
                            continue block177;
                        }
                        case 1232062821: {
                            v74 = m.agse("ahhw", agzf(int ), (int)126);
                            continue block177;
                        }
                    }
                    break;
                }
                v75 = v70.method_27692(class_124.field_1080);
                v76 /* !! */  = m.by;
                if (true) ** GOTO lbl405
                block178: while (true) {
                    v76 /* !! */  = (long)(v77 - m.agse("ahhx", agzf(int ), (int)127));
lbl405:
                    // 2 sources

                    switch ((int)v76 /* !! */ ) {
                        case -1474164460: {
                            break block178;
                        }
                        case -10961463: {
                            v77 = m.agse("ahhy", agzf(int ), (int)128);
                            continue block178;
                        }
                        case 1350828145: {
                            v77 = m.agse("ahhz", agzf(int ), (int)129);
                            continue block178;
                        }
                        case 2059773073: {
                            v77 = m.agse("ahia", agzf(int ), (int)130);
                            continue block178;
                        }
                    }
                    break;
                }
                v78 = v68.method_10852((class_2561)v75);
                while (true) {
                    if ((v79 /* !! */  = (cfr_temp_19 = m.by - m.agse("ahib", agzf(int ), (int)131)) == 0L ? 0 : (cfr_temp_19 < 0L ? -1 : 1)) == false) continue;
                    if (v79 /* !! */  == m.agse("ahic", agsb(int ), (int)278)) break;
                    v79 /* !! */  = (long)m.agse("ahid", agsb(int ), (int)279);
                }
                v80 = class_2561.method_43470((String)var3_6);
                while (true) {
                    if ((v81 /* !! */  = (cfr_temp_20 = m.by - m.agse("ahie", agzf(int ), (int)132)) == 0L ? 0 : (cfr_temp_20 < 0L ? -1 : 1)) == false) continue;
                    if (v81 /* !! */  == m.agse("ahif", agsb(int ), (int)280)) break;
                    v81 /* !! */  = (long)m.agse("ahig", agsb(int ), (int)281);
                }
                v82 /* !! */  = m.by;
                if (true) ** GOTO lbl433
                block181: while (true) {
                    v82 /* !! */  = (long)(v83 - m.agse("ahih", agzf(int ), (int)133));
lbl433:
                    // 2 sources

                    switch ((int)v82 /* !! */ ) {
                        case -1474164460: {
                            break block181;
                        }
                        case -624856145: {
                            v83 = m.agse("ahii", agzf(int ), (int)134);
                            continue block181;
                        }
                        case 2056060805: {
                            v83 = m.agse("ahij", agzf(int ), (int)135);
                            continue block181;
                        }
                    }
                    break;
                }
                v84 = v80.method_27692(class_124.field_1068);
                while (true) {
                    if ((v85 /* !! */  = (cfr_temp_21 = m.by - m.agse("ahik", agzf(int ), (int)136)) == 0L ? 0 : (cfr_temp_21 < 0L ? -1 : 1)) == false) continue;
                    if (v85 /* !! */  == m.agse("ahil", agsb(int ), (int)282)) break;
                    v85 /* !! */  = (long)m.agse("ahim", agsb(int ), (int)283);
                }
                v86 = v78.method_10852((class_2561)v84);
                while (true) {
                    if ((v87 /* !! */  = (cfr_temp_22 = m.by - m.agse("ahin", agzf(int ), (int)137)) == 0L ? 0 : (cfr_temp_22 < 0L ? -1 : 1)) == false) continue;
                    if (v87 /* !! */  == m.agse("ahio", agsb(int ), (int)284)) break;
                    v87 /* !! */  = (long)m.agse("ahip", agsb(int ), (int)285);
                }
                v88 = class_2561.method_43470((String)") ");
                while (true) {
                    if ((v89 /* !! */  = (cfr_temp_23 = m.by - m.agse("ahiq", agzf(int ), (int)138)) == 0L ? 0 : (cfr_temp_23 < 0L ? -1 : 1)) == false) continue;
                    if (v89 /* !! */  == m.agse("ahir", agsb(int ), (int)286)) break;
                    v89 /* !! */  = (long)m.agse("ahis", agsb(int ), (int)287);
                }
                v90 /* !! */  = m.by;
                if (true) ** GOTO lbl464
                block185: while (true) {
                    v90 /* !! */  = (long)(v91 - m.agse("ahit", agzf(int ), (int)139));
lbl464:
                    // 2 sources

                    switch ((int)v90 /* !! */ ) {
                        case -1474164460: {
                            break block185;
                        }
                        case -514539519: {
                            v91 = m.agse("ahiu", agzf(int ), (int)140);
                            continue block185;
                        }
                        case 208949877: {
                            v91 = m.agse("ahiv", agzf(int ), (int)141);
                            continue block185;
                        }
                    }
                    break;
                }
                v92 = v88.method_27692(class_124.field_1080);
                v93 /* !! */  = m.by;
                if (true) ** GOTO lbl478
                block186: while (true) {
                    v93 /* !! */  = (long)(m.agse("ahix", agzf(int ), (int)143) - m.agse("ahiw", agzf(int ), (int)142));
lbl478:
                    // 2 sources

                    switch ((int)v93 /* !! */ ) {
                        case -1474164460: {
                            break block186;
                        }
                        case 953215057: {
                            continue block186;
                        }
                    }
                    break;
                }
                v94 = v86.method_10852((class_2561)v92);
                while (true) {
                    if ((v95 /* !! */  = (cfr_temp_24 = m.by - m.agse("ahiy", agzf(int ), (int)144)) == 0L ? 0 : (cfr_temp_24 < 0L ? -1 : 1)) == false) continue;
                    if (v95 /* !! */  == m.agse("ahiz", agsb(int ), (int)288)) break;
                    v95 /* !! */  = (long)m.agse("ahja", agsb(int ), (int)289);
                }
                return v94.method_10852((class_2561)var5_8);
            }
            case 0: {
                var7_3 /* !! */  = (int)m.agse("ahjb", agsb(int ), (int)290);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl532
            }
lbl495:
            // 2 sources

            case 1: {
                var7_3 /* !! */  = (int)m.agse("ahjc", agsb(int ), (int)291);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl536
            }
            case 2: {
                var7_3 /* !! */  = (int)m.agse("ahjd", agsb(int ), (int)292);
                if (!var8_2) break;
                throw null;
            }
lbl504:
            // 2 sources

            case 3: {
                var7_3 /* !! */  = (int)m.agse("ahje", agsb(int ), (int)293);
                if (!var8_2) ** GOTO lbl495
                throw null;
            }
lbl508:
            // 2 sources

            case 4: {
                do {
                    var7_3 /* !! */  = (int)m.agse("ahjf", agsb(int ), (int)294);
                } while (!var8_2);
                throw null;
            }
lbl513:
            // 2 sources

            case 5: {
                var7_3 /* !! */  = (int)m.agse("ahjg", agsb(int ), (int)295);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl523
            }
            case 6: {
                do {
                    var7_3 /* !! */  = (int)m.agse("ahjh", agsb(int ), (int)296);
                } while (!var8_2);
                throw null;
            }
lbl523:
            // 3 sources

            case 7: {
                var7_3 /* !! */  = (int)m.agse("ahji", agsb(int ), (int)297);
                if (!var8_2) ** GOTO lbl513
                throw null;
            }
lbl527:
            // 2 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var7_3 /* !! */  = (int)m.agse("ahjj", agsb(int ), (int)298);
                    if (!var8_2) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl532:
            // 2 sources

            case 9: {
                var7_3 /* !! */  = (int)m.agse("ahjk", agsb(int ), (int)299);
                if (!var8_2) ** GOTO lbl527
                throw null;
            }
lbl536:
            // 2 sources

            case 10: {
                var7_3 /* !! */  = (int)m.agse("ahjl", agsb(int ), (int)300);
                if (!var8_2) ** GOTO lbl508
                throw null;
            }
            case 11: {
                var7_3 /* !! */  = (int)m.agse("ahjm", agsb(int ), (int)301);
                if (!var8_2) ** GOTO lbl504
                throw null;
            }
            case 12: {
                var7_3 /* !! */  = (int)m.agse("ahjn", agsb(int ), (int)302);
                if (!var8_2) ** GOTO lbl523
                throw null;
            }
            case 13: 
        }
        var7_3 /* !! */  = (int)m.agse("ahjo", agsb(int ), (int)303);
        ** while (!var8_2)
lbl551:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ahtg() {
        m.agzh[0] = -1835540567808590563L;
        m.agzh[1] = 6471585910051123143L;
        m.agzh[2] = -5018268743939596708L;
        m.agzh[3] = -7337533379653536065L;
        m.agzh[4] = 4916929505710671618L;
        m.agzh[5] = 6359154522384551473L;
        m.agzh[6] = -1154916903326960325L;
        m.agzh[7] = 8843877284865957769L;
        m.agzh[8] = -8742462709979640597L;
        m.agzh[9] = 3615041527815873658L;
        m.agzh[10] = 2664083934980247183L;
        m.agzh[11] = 896425351625300617L;
        m.agzh[12] = 7368794855848441575L;
        m.agzh[13] = 7056741397539210830L;
        m.agzh[14] = -7040855931094305103L;
        m.agzh[15] = -2618622923268832520L;
        m.agzh[16] = -6868952438055655508L;
        m.agzh[17] = -5394216020951419354L;
        m.agzh[18] = -8446679532722021534L;
        m.agzh[19] = 7923330199125237474L;
        m.agzh[20] = -8251411977066418151L;
        m.agzh[21] = -6807138588300700220L;
        m.agzh[22] = -5049092419938703618L;
        m.agzh[23] = -801328483297335949L;
        m.agzh[24] = -2513261996832907196L;
        m.agzh[25] = -2611047007096513109L;
        m.agzh[26] = -9173336603435551755L;
        m.agzh[27] = 5434247078492122888L;
        m.agzh[28] = -5381521996486768315L;
        m.agzh[29] = 5592456274408804781L;
        m.agzh[30] = 8724186307837613882L;
        m.agzh[31] = -4077073076832917317L;
        m.agzh[32] = 2719191165941140605L;
        m.agzh[33] = -546283929508385872L;
        m.agzh[34] = -6169943649437483226L;
        m.agzh[35] = -3157266211185624293L;
        m.agzh[36] = 6667543032284881473L;
        m.agzh[37] = 5978700011450436358L;
        m.agzh[38] = -5401435709855936494L;
        m.agzh[39] = -8564598233103394258L;
        m.agzh[40] = -621228717577653209L;
        m.agzh[41] = 5283174997551319670L;
        m.agzh[42] = 5336357505010659018L;
        m.agzh[43] = -272349670453839403L;
        m.agzh[44] = -6709805451045641527L;
        m.agzh[45] = -4569830822733446297L;
        m.agzh[46] = -2501965211931105007L;
        m.agzh[47] = -5406617692294193857L;
        m.agzh[48] = -1909256637388956291L;
        m.agzh[49] = -5894948376772808560L;
        m.agzh[50] = -2243648588592402010L;
        m.agzh[51] = -222155367650869740L;
        m.agzh[52] = 4278573104999939073L;
        m.agzh[53] = 1205366918537067187L;
        m.agzh[54] = -2532911008715586910L;
        m.agzh[55] = -2988679786449295123L;
        m.agzh[56] = -1023687113414971591L;
        m.agzh[57] = 7786628225435186071L;
        m.agzh[58] = 5905752432342664648L;
        m.agzh[59] = 6374475363617900975L;
        m.agzh[60] = 2427182185630314089L;
        m.agzh[61] = 6848016056019612079L;
        m.agzh[62] = -6314417034335757502L;
        m.agzh[63] = 1925530584454252276L;
        m.agzh[64] = 7657398841746013407L;
        m.agzh[65] = -7904028258630312933L;
        m.agzh[66] = 2244585002865879392L;
        m.agzh[67] = 1599106922553999996L;
        m.agzh[68] = 4838121361403770455L;
        m.agzh[69] = -3190046618747119028L;
        m.agzh[70] = 2995367419565012496L;
        m.agzh[71] = -8352407640754246563L;
        m.agzh[72] = 4833555478736859960L;
        m.agzh[73] = -7893272350592902102L;
        m.agzh[74] = 5227695978901197223L;
        m.agzh[75] = 4480204245372838172L;
        m.agzh[76] = -8120601921211234757L;
        m.agzh[77] = 3131071029760468795L;
        m.agzh[78] = 7548466237628777960L;
        m.agzh[79] = -6640773462432089211L;
        m.agzh[80] = -52037365354375666L;
        m.agzh[81] = -479835649839695203L;
        m.agzh[82] = -4646086058142500968L;
        m.agzh[83] = 4574183662137439369L;
        m.agzh[84] = 5153348098747152930L;
        m.agzh[85] = -5340647999068194304L;
        m.agzh[86] = 9205904033052646642L;
        m.agzh[87] = -4812114891218915374L;
        m.agzh[88] = -8564704802748687831L;
        m.agzh[89] = -7132717056854576843L;
        m.agzh[90] = -1749738740967942275L;
        m.agzh[91] = 676238528972825737L;
        m.agzh[92] = -3425181103522913112L;
        m.agzh[93] = -2701149913909223792L;
        m.agzh[94] = 633024762464186846L;
        m.agzh[95] = -4542274909921100815L;
        m.agzh[96] = 736194807917963432L;
        m.agzh[97] = 6395972269458109780L;
        m.agzh[98] = 6517298203195955062L;
        m.agzh[99] = 2321080002875262101L;
    }

    public static /* synthetic */ CallSite agse(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void ahra() {
        m.agsd[300] = 1880567209;
        m.agsd[301] = -1379683270;
        m.agsd[302] = -418436746;
        m.agsd[303] = -2031709094;
        m.agsd[304] = 1496387584;
        m.agsd[305] = -355419584;
        m.agsd[306] = 321040996;
        m.agsd[307] = -1175663670;
        m.agsd[308] = -1879532659;
        m.agsd[309] = -910924435;
        m.agsd[310] = 969627854;
        m.agsd[311] = 90073376;
        m.agsd[312] = -610416429;
        m.agsd[313] = -937183054;
        m.agsd[314] = 2099550241;
        m.agsd[315] = 1136816953;
        m.agsd[316] = -715327035;
        m.agsd[317] = -628804972;
        m.agsd[318] = 616038836;
        m.agsd[319] = 325677907;
        m.agsd[320] = 1889149598;
        m.agsd[321] = 723034469;
        m.agsd[322] = -1663515341;
        m.agsd[323] = 75735654;
        m.agsd[324] = -569986425;
        m.agsd[325] = 2112744363;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public m() {
        var2_1 /* !! */  = m.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("friend", "\u0423\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u0441\u043f\u0438\u0441\u043a\u043e\u043c \u0434\u0440\u0443\u0437\u0435\u0439", new String[]{"f", "friends"});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)m.agse("agsf", agsb(int ), (int)0);
                break;
            }
            case 1: {
                while (true) {
                    var2_1 /* !! */  = (int)m.agse("agsg", agsb(int ), (int)1);
                }
            }
            case 2: 
        }
        while (true) {
            var2_1 /* !! */  = (int)m.agse("agsh", agsb(int ), (int)2);
        }
    }

    private static /* synthetic */ void ahli() {
        m.agsc[0] = 1692224409;
        m.agsc[1] = 1291864686;
        m.agsc[2] = -2017570725;
        m.agsc[3] = 1132739491;
        m.agsc[4] = -820127301;
        m.agsc[5] = 36385816;
        m.agsc[6] = 640500140;
        m.agsc[7] = 1057368988;
        m.agsc[8] = 116716470;
        m.agsc[9] = -1356890670;
        m.agsc[10] = 1385457314;
        m.agsc[11] = 1834250907;
        m.agsc[12] = -1772239898;
        m.agsc[13] = -652401051;
        m.agsc[14] = 1731315925;
        m.agsc[15] = 1871505759;
        m.agsc[16] = 433595042;
        m.agsc[17] = 1574613067;
        m.agsc[18] = -1391200691;
        m.agsc[19] = -1018357011;
        m.agsc[20] = 1944777893;
        m.agsc[21] = 800819633;
        m.agsc[22] = 1975091977;
        m.agsc[23] = -1852376232;
        m.agsc[24] = 137386897;
        m.agsc[25] = 1197954993;
        m.agsc[26] = 1182997978;
        m.agsc[27] = 1781671875;
        m.agsc[28] = -682836256;
        m.agsc[29] = 849923791;
        m.agsc[30] = -1997877353;
        m.agsc[31] = -2060907621;
        m.agsc[32] = -1682049340;
        m.agsc[33] = -1280174025;
        m.agsc[34] = -1669768812;
        m.agsc[35] = 1832058232;
        m.agsc[36] = -1031795412;
        m.agsc[37] = 592440933;
        m.agsc[38] = -2086878304;
        m.agsc[39] = 693742140;
        m.agsc[40] = -1906742234;
        m.agsc[41] = 1265888565;
        m.agsc[42] = 823236465;
        m.agsc[43] = -499555292;
        m.agsc[44] = 695758879;
        m.agsc[45] = 2031205774;
        m.agsc[46] = -624800832;
        m.agsc[47] = -1390337430;
        m.agsc[48] = 1797825716;
        m.agsc[49] = -875420856;
        m.agsc[50] = -1357454000;
        m.agsc[51] = -967816257;
        m.agsc[52] = -1224328975;
        m.agsc[53] = -1160115278;
        m.agsc[54] = 82368935;
        m.agsc[55] = -1864523311;
        m.agsc[56] = 1819958688;
        m.agsc[57] = 1058218897;
        m.agsc[58] = 720217116;
        m.agsc[59] = 1068750499;
        m.agsc[60] = -1196185740;
        m.agsc[61] = -1471767957;
        m.agsc[62] = -1951618764;
        m.agsc[63] = -54153594;
        m.agsc[64] = 1593417634;
        m.agsc[65] = 1513230198;
        m.agsc[66] = 87774215;
        m.agsc[67] = -1285244811;
        m.agsc[68] = -747952787;
        m.agsc[69] = 1154079680;
        m.agsc[70] = 1380224222;
        m.agsc[71] = -1648169177;
        m.agsc[72] = 925581724;
        m.agsc[73] = 240855160;
        m.agsc[74] = -762385568;
        m.agsc[75] = 1029236347;
        m.agsc[76] = -889678781;
        m.agsc[77] = 2054391834;
        m.agsc[78] = 646401933;
        m.agsc[79] = 795820133;
        m.agsc[80] = -228098505;
        m.agsc[81] = 1956318168;
        m.agsc[82] = 294371030;
        m.agsc[83] = 597923091;
        m.agsc[84] = 381135049;
        m.agsc[85] = 1430846941;
        m.agsc[86] = 1007462256;
        m.agsc[87] = 925767700;
        m.agsc[88] = -1866361035;
        m.agsc[89] = -112542027;
        m.agsc[90] = 1733884439;
        m.agsc[91] = -835811614;
        m.agsc[92] = 906057525;
        m.agsc[93] = 1264022801;
        m.agsc[94] = -1018449783;
        m.agsc[95] = 966542070;
        m.agsc[96] = 1905232588;
        m.agsc[97] = 335709675;
        m.agsc[98] = -1873302895;
        m.agsc[99] = -1512134867;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private List<String> getOnlinePlayers() {
        v0 /* !! */  = m.by;
        if (true) ** GOTO lbl5
        block63: while (true) {
            v0 /* !! */  = (long)(m.agse("ahan", agzf(int ), (int)17) - m.agse("aham", agzf(int ), (int)16));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1474164460: {
                    break block63;
                }
                case 1200310268: {
                    continue block63;
                }
            }
            break;
        }
        var8_1 = m.c;
        v1 /* !! */  = m.by;
        if (true) ** GOTO lbl15
        block64: while (true) {
            v1 /* !! */  = (long)(v2 - m.agse("ahao", agzf(int ), (int)18));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1474164460: {
                    break block64;
                }
                case 1247849528: {
                    v2 = m.agse("ahap", agzf(int ), (int)19);
                    continue block64;
                }
                case 1457997164: {
                    v2 = m.agse("ahaq", agzf(int ), (int)20);
                    continue block64;
                }
            }
            break;
        }
        var7_2 /* !! */  = m.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = m.by - m.agse("ahar", agzf(int ), (int)21)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == m.agse("ahas", agsb(int ), (int)196)) break;
            v3 /* !! */  = (long)m.agse("ahat", agsb(int ), (int)197);
        }
        var6_3 = m.a;
        if (var8_1) {
            throw null;
lbl33:
            // 13 sources

            return null;
        }
        if (var6_3 || var6_3) ** GOTO lbl33
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = m.by - m.agse("ahau", agzf(int ), (int)22)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == m.agse("ahav", agsb(int ), (int)198)) break;
            v4 /* !! */  = (long)m.agse("ahaw", agsb(int ), (int)199);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = m.by - m.agse("ahax", agzf(int ), (int)23)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == m.agse("ahay", agsb(int ), (int)200)) break;
            v5 /* !! */  = (long)m.agse("ahaz", agsb(int ), (int)201);
        }
        var1_4 = new ArrayList<String>();
        if (var6_3 || var6_3) ** GOTO lbl33
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = m.by - m.agse("ahba", agzf(int ), (int)24)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == m.agse("ahbb", agsb(int ), (int)202)) break;
            v6 /* !! */  = (long)m.agse("ahbc", agsb(int ), (int)203);
        }
        var2_5 = class_310.method_1551();
        if (var6_3 || var6_3) ** GOTO lbl33
        v7 /* !! */  = m.by;
        if (true) ** GOTO lbl59
        block70: while (true) {
            v7 /* !! */  = (long)(v8 - m.agse("ahbd", agzf(int ), (int)25));
lbl59:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1474164460: {
                    break block70;
                }
                case -112877066: {
                    v8 = m.agse("ahbe", agzf(int ), (int)26);
                    continue block70;
                }
                case 1753030300: {
                    v8 = m.agse("ahbf", agzf(int ), (int)27);
                    continue block70;
                }
            }
            break;
        }
        if (var2_5.method_1562() == null) ** GOTO lbl174
        if (var6_3 || var6_3) ** GOTO lbl33
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_4 = m.by - m.agse("ahbg", agzf(int ), (int)28)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == m.agse("ahbh", agsb(int ), (int)204)) break;
            v9 /* !! */  = (long)m.agse("ahbi", agsb(int ), (int)205);
        }
        v10 = var2_5.method_1562();
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_5 = m.by - m.agse("ahbj", agzf(int ), (int)29)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == m.agse("ahbk", agsb(int ), (int)206)) break;
            v11 /* !! */  = (long)m.agse("ahbl", agsb(int ), (int)207);
        }
        v12 = v10.method_2880();
        v13 /* !! */  = m.by;
        if (true) ** GOTO lbl86
        block73: while (true) {
            v13 /* !! */  = (long)(v14 - m.agse("ahbm", agzf(int ), (int)30));
lbl86:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1474164460: {
                    break block73;
                }
                case -993171529: {
                    v14 = m.agse("ahbn", agzf(int ), (int)31);
                    continue block73;
                }
                case 1065247257: {
                    v14 = m.agse("ahbo", agzf(int ), (int)32);
                    continue block73;
                }
            }
            break;
        }
        var3_6 = v12.iterator();
        if (var7_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_3) ** GOTO lbl33
                do {
                    if (var6_3 || var6_3) ** GOTO lbl33
                    while (true) {
                        if ((v15 /* !! */  = (cfr_temp_6 = m.by - m.agse("ahbp", agzf(int ), (int)33)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v15 /* !! */  == m.agse("ahbq", agsb(int ), (int)208)) break;
                        v15 /* !! */  = (long)m.agse("ahbr", agsb(int ), (int)209);
                    }
                    if (!var3_6.hasNext()) ** GOTO lbl174
                    if (var6_3) ** GOTO lbl33
                    while (true) {
                        if ((v16 /* !! */  = (cfr_temp_7 = m.by - m.agse("ahbs", agzf(int ), (int)34)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v16 /* !! */  == m.agse("ahbt", agsb(int ), (int)210)) break;
                        v16 /* !! */  = (long)m.agse("ahbu", agsb(int ), (int)211);
                    }
                    var4_7 = (class_640)var3_6.next();
                    if (var6_3 || var6_3) ** GOTO lbl33
                    while (true) {
                        if ((v17 /* !! */  = (cfr_temp_8 = m.by - m.agse("ahbv", agzf(int ), (int)35)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v17 /* !! */  == m.agse("ahbw", agsb(int ), (int)212)) break;
                        v17 /* !! */  = (long)m.agse("ahbx", agsb(int ), (int)213);
                    }
                    v18 = var4_7.method_2966();
                    v19 /* !! */  = m.by;
                    if (true) ** GOTO lbl126
                    block78: while (true) {
                        v19 /* !! */  = (long)(v20 - m.agse("ahby", agzf(int ), (int)36));
lbl126:
                        // 2 sources

                        switch ((int)v19 /* !! */ ) {
                            case -1817356896: {
                                v20 = m.agse("ahbz", agzf(int ), (int)37);
                                continue block78;
                            }
                            case -1474164460: {
                                break block78;
                            }
                            case -1089523672: {
                                v20 = m.agse("ahca", agzf(int ), (int)38);
                                continue block78;
                            }
                            case 1938477292: {
                                v20 = m.agse("ahcb", agzf(int ), (int)39);
                                continue block78;
                            }
                        }
                        break;
                    }
                    var5_8 = v18.name();
                    if (var6_3 || var6_3) ** GOTO lbl33
                    v21 /* !! */  = m.by;
                    if (true) ** GOTO lbl144
                    block79: while (true) {
                        v21 /* !! */  = (long)(v22 - m.agse("ahcc", agzf(int ), (int)40));
lbl144:
                        // 2 sources

                        switch ((int)v21 /* !! */ ) {
                            case -1474164460: {
                                break block79;
                            }
                            case 977213403: {
                                v22 = m.agse("ahcd", agzf(int ), (int)41);
                                continue block79;
                            }
                            case 1044414722: {
                                v22 = m.agse("ahce", agzf(int ), (int)42);
                                continue block79;
                            }
                        }
                        break;
                    }
                    if (dl.isFriend(var5_8)) ** GOTO lbl171
                    if (var6_3 || var6_3) ** GOTO lbl33
                    v23 /* !! */  = m.by;
                    if (true) ** GOTO lbl159
                    block80: while (true) {
                        v23 /* !! */  = (long)(v24 - m.agse("ahcf", agzf(int ), (int)43));
lbl159:
                        // 2 sources

                        switch ((int)v23 /* !! */ ) {
                            case -1474164460: {
                                break block80;
                            }
                            case -30161881: {
                                v24 = m.agse("ahcg", agzf(int ), (int)44);
                                continue block80;
                            }
                            case 1166391456: {
                                v24 = m.agse("ahch", agzf(int ), (int)45);
                                continue block80;
                            }
                        }
                        break;
                    }
                    var1_4.add(var5_8);
                    if (var6_3) ** GOTO lbl33
lbl171:
                    // 2 sources

                    if (var6_3 || var6_3) ** GOTO lbl33
                } while (!var8_1);
                throw null;
lbl174:
                // 2 sources

                if (!var6_3 && !var6_3) ** break;
                ** continue;
                return var1_4;
            }
lbl177:
            // 3 sources

            case 0: {
                var7_2 /* !! */  = (int)m.agse("ahci", agsb(int ), (int)214);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl182:
            // 2 sources

            case 1: {
                var7_2 /* !! */  = (int)m.agse("ahcj", agsb(int ), (int)215);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl187:
            // 3 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_2 /* !! */  = (int)m.agse("ahck", agsb(int ), (int)216);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl279
                    break;
                }
            }
            case 3: {
                var7_2 /* !! */  = (int)m.agse("ahcl", agsb(int ), (int)217);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl198:
            // 4 sources

            case 4: {
                var7_2 /* !! */  = (int)m.agse("ahcm", agsb(int ), (int)218);
                if (var8_1) {
                    throw null;
                }
            }
lbl202:
            // 4 sources

            case 5: {
                var7_2 /* !! */  = (int)m.agse("ahcn", agsb(int ), (int)219);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl207:
            // 2 sources

            case 6: {
                var7_2 /* !! */  = (int)m.agse("ahco", agsb(int ), (int)220);
                if (!var8_1) ** GOTO lbl182
                throw null;
            }
lbl211:
            // 2 sources

            case 7: {
                var7_2 /* !! */  = (int)m.agse("ahcp", agsb(int ), (int)221);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl251
            }
            case 8: {
                var7_2 /* !! */  = (int)m.agse("ahcq", agsb(int ), (int)222);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl251
            }
            case 9: {
                var7_2 /* !! */  = (int)m.agse("ahcr", agsb(int ), (int)223);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl267
            }
lbl226:
            // 2 sources

            case 10: {
                var7_2 /* !! */  = (int)m.agse("ahcs", agsb(int ), (int)224);
                if (!var8_1) ** GOTO lbl177
                throw null;
            }
lbl230:
            // 3 sources

            case 11: {
                var7_2 /* !! */  = (int)m.agse("ahct", agsb(int ), (int)225);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl255
            }
            case 12: {
                var7_2 /* !! */  = (int)m.agse("ahcu", agsb(int ), (int)226);
                if (!var8_1) ** GOTO lbl211
                throw null;
            }
lbl239:
            // 2 sources

            case 13: {
                var7_2 /* !! */  = (int)m.agse("ahcv", agsb(int ), (int)227);
                if (!var8_1) ** GOTO lbl202
                throw null;
            }
            case 14: {
                var7_2 /* !! */  = (int)m.agse("ahcw", agsb(int ), (int)228);
                if (!var8_1) ** GOTO lbl230
                throw null;
            }
            case 15: {
                var7_2 /* !! */  = (int)m.agse("ahcx", agsb(int ), (int)229);
                if (!var8_1) ** GOTO lbl177
                throw null;
            }
lbl251:
            // 3 sources

            case 16: {
                var7_2 /* !! */  = (int)m.agse("ahcy", agsb(int ), (int)230);
                if (!var8_1) ** GOTO lbl187
                throw null;
            }
lbl255:
            // 3 sources

            case 17: {
                var7_2 /* !! */  = (int)m.agse("ahcz", agsb(int ), (int)231);
                if (!var8_1) ** GOTO lbl239
                throw null;
            }
            case 18: {
                var7_2 /* !! */  = (int)m.agse("ahda", agsb(int ), (int)232);
                if (!var8_1) ** GOTO lbl198
                throw null;
            }
            case 19: {
                var7_2 /* !! */  = (int)m.agse("ahdb", agsb(int ), (int)233);
                if (!var8_1) ** GOTO lbl187
                throw null;
            }
lbl267:
            // 2 sources

            case 20: {
                var7_2 /* !! */  = (int)m.agse("ahdc", agsb(int ), (int)234);
                if (!var8_1) ** GOTO lbl198
                throw null;
            }
            case 21: {
                var7_2 /* !! */  = (int)m.agse("ahdd", agsb(int ), (int)235);
                if (!var8_1) break;
                throw null;
            }
            case 22: {
                var7_2 /* !! */  = (int)m.agse("ahde", agsb(int ), (int)236);
                if (!var8_1) ** GOTO lbl230
                throw null;
            }
lbl279:
            // 3 sources

            case 23: {
                var7_2 /* !! */  = (int)m.agse("ahdf", agsb(int ), (int)237);
                if (!var8_1) ** GOTO lbl198
                throw null;
            }
lbl283:
            // 2 sources

            case 24: {
                var7_2 /* !! */  = (int)m.agse("ahdg", agsb(int ), (int)238);
                if (!var8_1) ** GOTO lbl279
                throw null;
            }
            case 25: 
        }
        var7_2 /* !! */  = (int)m.agse("ahdh", agsb(int ), (int)239);
        ** while (!var8_1)
lbl290:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ahph() {
        m.agsd[100] = -1221963424;
        m.agsd[101] = -1595276473;
        m.agsd[102] = 1759053171;
        m.agsd[103] = -523246504;
        m.agsd[104] = 545511516;
        m.agsd[105] = -400715277;
        m.agsd[106] = 828462167;
        m.agsd[107] = -12713789;
        m.agsd[108] = -1406889711;
        m.agsd[109] = -1148359881;
        m.agsd[110] = 723933144;
        m.agsd[111] = 522375332;
        m.agsd[112] = -1383377830;
        m.agsd[113] = -518489614;
        m.agsd[114] = 1007754485;
        m.agsd[115] = -570100792;
        m.agsd[116] = -669649386;
        m.agsd[117] = 567001504;
        m.agsd[118] = -1620728247;
        m.agsd[119] = 1468084776;
        m.agsd[120] = -35582749;
        m.agsd[121] = -1118534449;
        m.agsd[122] = -1495694484;
        m.agsd[123] = -266548866;
        m.agsd[124] = 964031021;
        m.agsd[125] = -120987957;
        m.agsd[126] = 1886517912;
        m.agsd[127] = -109674469;
        m.agsd[128] = 554319462;
        m.agsd[129] = -2130066277;
        m.agsd[130] = -806836081;
        m.agsd[131] = -1745514249;
        m.agsd[132] = -1266399850;
        m.agsd[133] = 204513585;
        m.agsd[134] = -1663059268;
        m.agsd[135] = -864893686;
        m.agsd[136] = -1733535722;
        m.agsd[137] = 2054291676;
        m.agsd[138] = 1910680;
        m.agsd[139] = 1061768665;
        m.agsd[140] = -1976906857;
        m.agsd[141] = -804519936;
        m.agsd[142] = -1147762353;
        m.agsd[143] = 1526871379;
        m.agsd[144] = -1368453015;
        m.agsd[145] = -680103671;
        m.agsd[146] = 697138850;
        m.agsd[147] = 1957066461;
        m.agsd[148] = -140749062;
        m.agsd[149] = 1468657053;
        m.agsd[150] = 1486272015;
        m.agsd[151] = -1947134550;
        m.agsd[152] = 1734117788;
        m.agsd[153] = 1282033424;
        m.agsd[154] = 727975726;
        m.agsd[155] = -2024029104;
        m.agsd[156] = -750608758;
        m.agsd[157] = -289207780;
        m.agsd[158] = 1305230941;
        m.agsd[159] = 2090201496;
        m.agsd[160] = 1618052652;
        m.agsd[161] = -224654895;
        m.agsd[162] = -1693352289;
        m.agsd[163] = 1855934101;
        m.agsd[164] = 1003305369;
        m.agsd[165] = -520673846;
        m.agsd[166] = -703504959;
        m.agsd[167] = 482091511;
        m.agsd[168] = -464540322;
        m.agsd[169] = -725106783;
        m.agsd[170] = 1360535230;
        m.agsd[171] = -905249632;
        m.agsd[172] = 1987292285;
        m.agsd[173] = -135818332;
        m.agsd[174] = -87904668;
        m.agsd[175] = -504847497;
        m.agsd[176] = -700194888;
        m.agsd[177] = -1766594360;
        m.agsd[178] = -1108261322;
        m.agsd[179] = -1295498628;
        m.agsd[180] = -373521138;
        m.agsd[181] = 1815694301;
        m.agsd[182] = -1559061626;
        m.agsd[183] = 1149454851;
        m.agsd[184] = 652957520;
        m.agsd[185] = 1956433921;
        m.agsd[186] = 804495498;
        m.agsd[187] = -749852855;
        m.agsd[188] = 839070607;
        m.agsd[189] = -1624453931;
        m.agsd[190] = 1859653812;
        m.agsd[191] = -1404479285;
        m.agsd[192] = 1598247724;
        m.agsd[193] = -1726717482;
        m.agsd[194] = -1871713978;
        m.agsd[195] = -951840331;
        m.agsd[196] = 2011218230;
        m.agsd[197] = -2010907430;
        m.agsd[198] = 1238221803;
        m.agsd[199] = 1241893833;
    }

    private static /* synthetic */ void ahtu() {
        m.agzh[100] = 1638526485094999830L;
        m.agzh[101] = -8827739614009951201L;
        m.agzh[102] = -2460320741890897453L;
        m.agzh[103] = -1197075592199937431L;
        m.agzh[104] = 3573086186365734887L;
        m.agzh[105] = 1993065085951286667L;
        m.agzh[106] = -2220324733096590316L;
        m.agzh[107] = 5007945093542995738L;
        m.agzh[108] = 4552151967859943825L;
        m.agzh[109] = 8424045977683982560L;
        m.agzh[110] = -5908121366664709455L;
        m.agzh[111] = 7860454186198993521L;
        m.agzh[112] = 4820662932984464392L;
        m.agzh[113] = -5761305369813074606L;
        m.agzh[114] = -7696473848902701673L;
        m.agzh[115] = -4860212704834074150L;
        m.agzh[116] = -4810341538563237553L;
        m.agzh[117] = 6952009397062653519L;
        m.agzh[118] = 3110238397589264944L;
        m.agzh[119] = 7296436278047000455L;
        m.agzh[120] = 3973052338022511205L;
        m.agzh[121] = -5422120066622782280L;
        m.agzh[122] = -4534200998951990762L;
        m.agzh[123] = -5320740930584074621L;
        m.agzh[124] = -4364817256453739077L;
        m.agzh[125] = -137859999895782741L;
        m.agzh[126] = -8731434101279488140L;
        m.agzh[127] = 9179206895259384524L;
        m.agzh[128] = 4519255162085746477L;
        m.agzh[129] = -8678102311559209035L;
        m.agzh[130] = 1697147409917222833L;
        m.agzh[131] = -950964545395712746L;
        m.agzh[132] = 4647330389256365176L;
        m.agzh[133] = 7816769685347328876L;
        m.agzh[134] = -1376944265090199721L;
        m.agzh[135] = 6257409077565174023L;
        m.agzh[136] = -6753528608699725859L;
        m.agzh[137] = 6208595530025075484L;
        m.agzh[138] = -8158135744505341364L;
        m.agzh[139] = 931343043221436819L;
        m.agzh[140] = 7565565923399976481L;
        m.agzh[141] = -6438351051843659369L;
        m.agzh[142] = 4963515985212390059L;
        m.agzh[143] = 7454755538709397077L;
        m.agzh[144] = -8013436278922472806L;
        m.agzh[145] = 1093162383169774711L;
        m.agzh[146] = -1020506190550273964L;
        m.agzh[147] = -4070410017275436238L;
        m.agzh[148] = -8605007606214810169L;
        m.agzh[149] = -5146152954632240149L;
        m.agzh[150] = 5132199897575602743L;
        m.agzh[151] = 6799530659120970010L;
        m.agzh[152] = 6424018892496258620L;
        m.agzh[153] = -9166589490844074194L;
        m.agzh[154] = 6692063253662248827L;
        m.agzh[155] = 2529585967394400447L;
        m.agzh[156] = -6132140572141597056L;
        m.agzh[157] = -8716095453904526883L;
        m.agzh[158] = 7695866639502014064L;
        m.agzh[159] = 7290260563024649037L;
        m.agzh[160] = -5231902856724500588L;
        m.agzh[161] = -3056891972826506529L;
        m.agzh[162] = -8610619522730334960L;
        m.agzh[163] = 6861677118553241079L;
        m.agzh[164] = 1870516852708902769L;
        m.agzh[165] = 4130337623817221220L;
        m.agzh[166] = 2174172566624418544L;
        m.agzh[167] = -7957422578571956822L;
    }

    private static /* synthetic */ int agsb(int n2) {
        return agsc[n2] ^ agsd[n2];
    }

    private static /* synthetic */ void ahqd() {
        m.agsd[200] = 697994256;
        m.agsd[201] = 1124821147;
        m.agsd[202] = -906113964;
        m.agsd[203] = 3252804;
        m.agsd[204] = 300408707;
        m.agsd[205] = 1496166969;
        m.agsd[206] = -556009767;
        m.agsd[207] = 258200622;
        m.agsd[208] = 1804917828;
        m.agsd[209] = -925923899;
        m.agsd[210] = 254892864;
        m.agsd[211] = -1003073136;
        m.agsd[212] = -1751084434;
        m.agsd[213] = -1669471171;
        m.agsd[214] = -165921241;
        m.agsd[215] = -890122099;
        m.agsd[216] = -1614425875;
        m.agsd[217] = -248012124;
        m.agsd[218] = -1383377468;
        m.agsd[219] = 655134314;
        m.agsd[220] = -1292853053;
        m.agsd[221] = 611325397;
        m.agsd[222] = 1887234297;
        m.agsd[223] = 1087238711;
        m.agsd[224] = 895903723;
        m.agsd[225] = -1094880316;
        m.agsd[226] = 112015821;
        m.agsd[227] = 453460001;
        m.agsd[228] = 1539308934;
        m.agsd[229] = -165812045;
        m.agsd[230] = -1954721397;
        m.agsd[231] = 1090433724;
        m.agsd[232] = 944550662;
        m.agsd[233] = -224342386;
        m.agsd[234] = 1980073708;
        m.agsd[235] = -1140395942;
        m.agsd[236] = 1634255089;
        m.agsd[237] = -2086988701;
        m.agsd[238] = -867712395;
        m.agsd[239] = -846724704;
        m.agsd[240] = 1847010590;
        m.agsd[241] = -897016491;
        m.agsd[242] = 342461095;
        m.agsd[243] = -302931327;
        m.agsd[244] = 1575557440;
        m.agsd[245] = 2062306958;
        m.agsd[246] = 804346229;
        m.agsd[247] = -891342307;
        m.agsd[248] = 1304263533;
        m.agsd[249] = 1838770712;
        m.agsd[250] = 1740501364;
        m.agsd[251] = 1158453389;
        m.agsd[252] = 612921860;
        m.agsd[253] = -2031121107;
        m.agsd[254] = -1606568348;
        m.agsd[255] = -1811136617;
        m.agsd[256] = -1832310321;
        m.agsd[257] = 86646153;
        m.agsd[258] = -579128356;
        m.agsd[259] = 2112714639;
        m.agsd[260] = 1580634222;
        m.agsd[261] = -103698628;
        m.agsd[262] = 350168806;
        m.agsd[263] = -33071172;
        m.agsd[264] = 433363840;
        m.agsd[265] = 824643373;
        m.agsd[266] = 2070004685;
        m.agsd[267] = -538799590;
        m.agsd[268] = -1218227543;
        m.agsd[269] = -970489362;
        m.agsd[270] = -1073062508;
        m.agsd[271] = -1913815002;
        m.agsd[272] = -475698236;
        m.agsd[273] = 1799103284;
        m.agsd[274] = 556957529;
        m.agsd[275] = -1297416902;
        m.agsd[276] = 287847485;
        m.agsd[277] = 935653350;
        m.agsd[278] = 1202175681;
        m.agsd[279] = 1894042498;
        m.agsd[280] = 902829890;
        m.agsd[281] = 1952598764;
        m.agsd[282] = -1961281381;
        m.agsd[283] = 1373413005;
        m.agsd[284] = -340366513;
        m.agsd[285] = -341450901;
        m.agsd[286] = 945631068;
        m.agsd[287] = -1589265302;
        m.agsd[288] = -1053400213;
        m.agsd[289] = -1073230031;
        m.agsd[290] = 1230250018;
        m.agsd[291] = -1109464789;
        m.agsd[292] = 965196767;
        m.agsd[293] = 2091506765;
        m.agsd[294] = 62148478;
        m.agsd[295] = 2121806778;
        m.agsd[296] = 836771484;
        m.agsd[297] = 313599261;
        m.agsd[298] = 653715308;
        m.agsd[299] = 1356430456;
    }

    private static /* synthetic */ void ahmf() {
        m.agsc[100] = -1221963478;
        m.agsc[101] = -1595276524;
        m.agsc[102] = 1759053305;
        m.agsc[103] = -523246524;
        m.agsc[104] = 545511534;
        m.agsc[105] = -400715400;
        m.agsc[106] = 828462084;
        m.agsc[107] = -12713778;
        m.agsc[108] = -1406889623;
        m.agsc[109] = -1148359747;
        m.agsc[110] = 723933097;
        m.agsc[111] = 522375385;
        m.agsc[112] = -1383377801;
        m.agsc[113] = -518489715;
        m.agsc[114] = 1007754367;
        m.agsc[115] = -570100797;
        m.agsc[116] = -669649377;
        m.agsc[117] = 567001576;
        m.agsc[118] = -1620728240;
        m.agsc[119] = 1468084859;
        m.agsc[120] = -35582761;
        m.agsc[121] = -1118534501;
        m.agsc[122] = -1495694357;
        m.agsc[123] = -266548931;
        m.agsc[124] = 964030982;
        m.agsc[125] = -120987912;
        m.agsc[126] = 1886517892;
        m.agsc[127] = -109674382;
        m.agsc[128] = 554319420;
        m.agsc[129] = -2130066224;
        m.agsc[130] = -806835983;
        m.agsc[131] = -1745514331;
        m.agsc[132] = -1266399751;
        m.agsc[133] = 204513572;
        m.agsc[134] = -1663059248;
        m.agsc[135] = -864893630;
        m.agsc[136] = -1733535623;
        m.agsc[137] = 2054291615;
        m.agsc[138] = 1910712;
        m.agsc[139] = 1061768684;
        m.agsc[140] = -1976906786;
        m.agsc[141] = -804519845;
        m.agsc[142] = -1147762330;
        m.agsc[143] = 1526871339;
        m.agsc[144] = -1368453095;
        m.agsc[145] = -680103579;
        m.agsc[146] = 697138936;
        m.agsc[147] = 1957066446;
        m.agsc[148] = -140749080;
        m.agsc[149] = 1468656922;
        m.agsc[150] = 1486272089;
        m.agsc[151] = -1947134473;
        m.agsc[152] = 1734117768;
        m.agsc[153] = 1282033470;
        m.agsc[154] = 727975752;
        m.agsc[155] = -2024029103;
        m.agsc[156] = -750608760;
        m.agsc[157] = -289207799;
        m.agsc[158] = 1305230927;
        m.agsc[159] = 2090201486;
        m.agsc[160] = 1618052650;
        m.agsc[161] = -224654885;
        m.agsc[162] = -1693352290;
        m.agsc[163] = 1855934100;
        m.agsc[164] = 1003305357;
        m.agsc[165] = -520673829;
        m.agsc[166] = -703504954;
        m.agsc[167] = 482091517;
        m.agsc[168] = -464540331;
        m.agsc[169] = -725106759;
        m.agsc[170] = 1360535210;
        m.agsc[171] = -905249613;
        m.agsc[172] = 1987292276;
        m.agsc[173] = -135818327;
        m.agsc[174] = -87904652;
        m.agsc[175] = -504847493;
        m.agsc[176] = -700194903;
        m.agsc[177] = -1766594362;
        m.agsc[178] = -1108261322;
        m.agsc[179] = -1295498625;
        m.agsc[180] = -373521121;
        m.agsc[181] = 1815694284;
        m.agsc[182] = -1559061625;
        m.agsc[183] = -1585091688;
        m.agsc[184] = 652957523;
        m.agsc[185] = 1956433923;
        m.agsc[186] = 804495499;
        m.agsc[187] = -749852855;
        m.agsc[188] = 839070606;
        m.agsc[189] = 1090304632;
        m.agsc[190] = 1859653813;
        m.agsc[191] = -1303077493;
        m.agsc[192] = 1598247725;
        m.agsc[193] = -1726717483;
        m.agsc[194] = -1871713979;
        m.agsc[195] = -951840332;
        m.agsc[196] = 2011218231;
        m.agsc[197] = 906223333;
        m.agsc[198] = 1238221802;
        m.agsc[199] = 1144665688;
    }

    private static /* synthetic */ void ahog() {
        m.agsc[300] = 1880567215;
        m.agsc[301] = -1379683277;
        m.agsc[302] = -418436750;
        m.agsc[303] = -2031709090;
        m.agsc[304] = 1496387585;
        m.agsc[305] = 1110517566;
        m.agsc[306] = 321040997;
        m.agsc[307] = -2033256068;
        m.agsc[308] = -1879532660;
        m.agsc[309] = -901346463;
        m.agsc[310] = 969627855;
        m.agsc[311] = -764847342;
        m.agsc[312] = -610416430;
        m.agsc[313] = 935207211;
        m.agsc[314] = 2099550240;
        m.agsc[315] = 1189690291;
        m.agsc[316] = -715327040;
        m.agsc[317] = -628804974;
        m.agsc[318] = 616038836;
        m.agsc[319] = 325677906;
        m.agsc[320] = 1889149597;
        m.agsc[321] = 723034476;
        m.agsc[322] = -1663515338;
        m.agsc[323] = 75735651;
        m.agsc[324] = -569986432;
        m.agsc[325] = 2112744365;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void execute(String var1_1, String[] var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [14[CASE], 9[SWITCH]], but top level block is 16[CASE]
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
    private /* synthetic */ void lambda$execute$0(List var1_1) {
        v0 /* !! */  = m.by;
        if (true) ** GOTO lbl5
        block41: while (true) {
            v0 /* !! */  = (long)(v1 - m.agse("ahjp", agzf(int ), (int)145));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1474164460: {
                    break block41;
                }
                case -1225922373: {
                    v1 = m.agse("ahjq", agzf(int ), (int)146);
                    continue block41;
                }
                case -143876548: {
                    v1 = m.agse("ahjr", agzf(int ), (int)147);
                    continue block41;
                }
                case 1378450666: {
                    v1 = m.agse("ahjs", agzf(int ), (int)148);
                    continue block41;
                }
            }
            break;
        }
        var4_2 = m.c;
        v2 /* !! */  = m.by;
        if (true) ** GOTO lbl22
        block42: while (true) {
            v2 /* !! */  = (long)(m.agse("ahju", agzf(int ), (int)150) - m.agse("ahjt", agzf(int ), (int)149));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1474164460: {
                    break block42;
                }
                case 2108611353: {
                    continue block42;
                }
            }
            break;
        }
        var3_3 /* !! */  = m.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = m.by - m.agse("ahjv", agzf(int ), (int)151)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == m.agse("ahjw", agsb(int ), (int)304)) break;
            v3 /* !! */  = (long)m.agse("ahjx", agsb(int ), (int)305);
        }
        var2_4 = m.a;
        if (var4_2) {
            throw null;
lbl36:
            // 4 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl36
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = m.by - m.agse("ahjy", agzf(int ), (int)152)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == m.agse("ahjz", agsb(int ), (int)306)) break;
            v4 /* !! */  = (long)m.agse("ahka", agsb(int ), (int)307);
        }
        v5 = o.getLine();
        v6 /* !! */  = m.by;
        if (true) ** GOTO lbl49
        block46: while (true) {
            v6 /* !! */  = (long)(m.agse("ahkc", agzf(int ), (int)154) - m.agse("ahkb", agzf(int ), (int)153));
lbl49:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1474164460: {
                    break block46;
                }
                case -1413736942: {
                    continue block46;
                }
            }
            break;
        }
        v7 = class_2561.method_43470((String)v5);
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_2 = m.by - m.agse("ahkd", agzf(int ), (int)155)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == m.agse("ahke", agsb(int ), (int)308)) break;
            v8 /* !! */  = (long)m.agse("ahkf", agsb(int ), (int)309);
        }
        this.logDirectRaw(v7);
        if (var2_4 || var2_4) ** GOTO lbl36
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_3 = m.by - m.agse("ahkg", agzf(int ), (int)156)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == m.agse("ahkh", agsb(int ), (int)310)) break;
            v9 /* !! */  = (long)m.agse("ahki", agsb(int ), (int)311);
        }
        v10 = var1_1.size();
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_4 = m.by - m.agse("ahkj", agzf(int ), (int)157)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == m.agse("ahkk", agsb(int ), (int)312)) break;
            v11 /* !! */  = (long)m.agse("ahkl", agsb(int ), (int)313);
        }
        v12 = "\u00a77\u0421\u043f\u0438\u0441\u043e\u043a \u0434\u0440\u0443\u0437\u0435\u0439: \u00a7f" + v10;
        v13 /* !! */  = m.by;
        if (true) ** GOTO lbl78
        block50: while (true) {
            v13 /* !! */  = (long)(v14 - m.agse("ahkm", agzf(int ), (int)158));
lbl78:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1474164460: {
                    break block50;
                }
                case -466063341: {
                    v14 = m.agse("ahkn", agzf(int ), (int)159);
                    continue block50;
                }
                case 1435889410: {
                    v14 = m.agse("ahko", agzf(int ), (int)160);
                    continue block50;
                }
            }
            break;
        }
        this.logDirect(v12);
        if (var2_4 || var2_4) ** GOTO lbl36
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_5 = m.by - m.agse("ahkp", agzf(int ), (int)161)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == m.agse("ahkq", agsb(int ), (int)314)) break;
            v15 /* !! */  = (long)m.agse("ahkr", agsb(int ), (int)315);
        }
        v16 = o.getLine();
        v17 /* !! */  = m.by;
        if (true) ** GOTO lbl99
        block52: while (true) {
            v17 /* !! */  = (long)(v18 - m.agse("ahks", agzf(int ), (int)162));
lbl99:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -1474164460: {
                    break block52;
                }
                case -700705638: {
                    v18 = m.agse("ahkt", agzf(int ), (int)163);
                    continue block52;
                }
                case 342771196: {
                    v18 = m.agse("ahku", agzf(int ), (int)164);
                    continue block52;
                }
                case 1186441535: {
                    v18 = m.agse("ahkv", agzf(int ), (int)165);
                    continue block52;
                }
            }
            break;
        }
        v19 = class_2561.method_43470((String)v16);
        v20 /* !! */  = m.by;
        if (true) ** GOTO lbl116
        block53: while (true) {
            v20 /* !! */  = (long)(m.agse("ahkx", agzf(int ), (int)167) - m.agse("ahkw", agzf(int ), (int)166));
lbl116:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case -1474164460: {
                    break block53;
                }
                case 1940200302: {
                    continue block53;
                }
            }
            break;
        }
        this.logDirectRaw(v19);
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                return;
            }
lbl127:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)m.agse("ahky", agsb(int ), (int)316);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl132:
            // 3 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)m.agse("ahkz", agsb(int ), (int)317);
                    if (!var4_2) ** GOTO lbl127
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)m.agse("ahla", agsb(int ), (int)318);
                if (var4_2) {
                    throw null;
                }
            }
lbl141:
            // 5 sources

            case 3: {
                var3_3 /* !! */  = (int)m.agse("ahlb", agsb(int ), (int)319);
                if (!var4_2) ** GOTO lbl132
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)m.agse("ahlc", agsb(int ), (int)320);
                if (var4_2) {
                    throw null;
                }
            }
            case 5: {
                var3_3 /* !! */  = (int)m.agse("ahld", agsb(int ), (int)321);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 6: {
                do {
                    var3_3 /* !! */  = (int)m.agse("ahle", agsb(int ), (int)322);
                } while (!var4_2);
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)m.agse("ahlf", agsb(int ), (int)323);
                if (!var4_2) ** GOTO lbl141
                throw null;
            }
lbl163:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)m.agse("ahlg", agsb(int ), (int)324);
                if (!var4_2) ** GOTO lbl132
                throw null;
            }
            case 9: 
        }
        var3_3 /* !! */  = (int)m.agse("ahlh", agsb(int ), (int)325);
        ** while (!var4_2)
lbl170:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ahrm() {
        m.agzg[0] = -8853338895313934653L;
        m.agzg[1] = -6027697273136660164L;
        m.agzg[2] = -9155376154116457258L;
        m.agzg[3] = -4522029548039730877L;
        m.agzg[4] = 4092833761616288647L;
        m.agzg[5] = 2723594761581071177L;
        m.agzg[6] = -5025759961946577432L;
        m.agzg[7] = -7741238760365230223L;
        m.agzg[8] = -2788953360724620210L;
        m.agzg[9] = 7756633862747875721L;
        m.agzg[10] = -5315632934459337692L;
        m.agzg[11] = -7194744867258815306L;
        m.agzg[12] = 3717841186436531570L;
        m.agzg[13] = 4867658486906448956L;
        m.agzg[14] = -2110209951347454756L;
        m.agzg[15] = -4217731985066567309L;
        m.agzg[16] = 669190698413502738L;
        m.agzg[17] = 4142406264592309558L;
        m.agzg[18] = 6285083913469620295L;
        m.agzg[19] = -8152910573691647778L;
        m.agzg[20] = -5634916142648433116L;
        m.agzg[21] = -4254350680017408390L;
        m.agzg[22] = -5776481435506761344L;
        m.agzg[23] = 1876415221519857839L;
        m.agzg[24] = -1134518478982955078L;
        m.agzg[25] = 4758489895307217634L;
        m.agzg[26] = 4490996057543424434L;
        m.agzg[27] = -8923228570038136378L;
        m.agzg[28] = -3901174266157395511L;
        m.agzg[29] = 2973296103831614801L;
        m.agzg[30] = 6010479354011902281L;
        m.agzg[31] = -3860784151034490374L;
        m.agzg[32] = 8367084985255549665L;
        m.agzg[33] = 3867181129126335691L;
        m.agzg[34] = 4577876591819829978L;
        m.agzg[35] = 848197780136957515L;
        m.agzg[36] = -8595930869229342038L;
        m.agzg[37] = -541498232157167367L;
        m.agzg[38] = 9017216775295551899L;
        m.agzg[39] = -5101997056692405944L;
        m.agzg[40] = 3311852179654934966L;
        m.agzg[41] = 5754652726963654223L;
        m.agzg[42] = -3007217437629650722L;
        m.agzg[43] = -1216998555253301880L;
        m.agzg[44] = 1004374065069959006L;
        m.agzg[45] = -8280498332281102677L;
        m.agzg[46] = -5007553451873544702L;
        m.agzg[47] = -5917921053619622369L;
        m.agzg[48] = 1034984357831876337L;
        m.agzg[49] = -8492413943667262055L;
        m.agzg[50] = 6496247950909080725L;
        m.agzg[51] = -3699091280938635179L;
        m.agzg[52] = -1262412705990100876L;
        m.agzg[53] = 7639551400411931523L;
        m.agzg[54] = -3305480232926160650L;
        m.agzg[55] = -2328530882278920262L;
        m.agzg[56] = -8365243385368298042L;
        m.agzg[57] = -5592745015313987748L;
        m.agzg[58] = 837329528216506493L;
        m.agzg[59] = 6799207490461740108L;
        m.agzg[60] = 8864188876123899189L;
        m.agzg[61] = 485504336970794195L;
        m.agzg[62] = -2623308425196685789L;
        m.agzg[63] = -4452786415919268719L;
        m.agzg[64] = -8196285596457577409L;
        m.agzg[65] = -7966078968932169399L;
        m.agzg[66] = -5809570318059616294L;
        m.agzg[67] = -7172481464093303484L;
        m.agzg[68] = 3604317250596436465L;
        m.agzg[69] = 3398967687711887050L;
        m.agzg[70] = 8805339875424337089L;
        m.agzg[71] = -1185363258561911811L;
        m.agzg[72] = -6999403225621211220L;
        m.agzg[73] = -1816886222883844399L;
        m.agzg[74] = 3587444800150183486L;
        m.agzg[75] = -2693013469769495208L;
        m.agzg[76] = 6520104615654103663L;
        m.agzg[77] = 2879811188786826797L;
        m.agzg[78] = 7746591667057602732L;
        m.agzg[79] = 4807052909825686302L;
        m.agzg[80] = 7831574840477433904L;
        m.agzg[81] = -7009110016472159562L;
        m.agzg[82] = 1138260119481386617L;
        m.agzg[83] = 5304530620888919515L;
        m.agzg[84] = 8425298132704947630L;
        m.agzg[85] = -21210096976123805L;
        m.agzg[86] = 5824142599177414044L;
        m.agzg[87] = -6375087912615379231L;
        m.agzg[88] = -5717005994494621778L;
        m.agzg[89] = -8857544480664539531L;
        m.agzg[90] = 8969720960326984331L;
        m.agzg[91] = 5428637795006026918L;
        m.agzg[92] = -3749603458884512393L;
        m.agzg[93] = 734416787424003541L;
        m.agzg[94] = -1145215885371343546L;
        m.agzg[95] = -5077341457862525403L;
        m.agzg[96] = 7369341712547287781L;
        m.agzg[97] = 8955487062534518987L;
        m.agzg[98] = -1944068175164203656L;
        m.agzg[99] = -4150621621096368660L;
    }

    private static /* synthetic */ long agzf(int n2) {
        return agzg[n2] ^ agzh[n2];
    }

    private static /* synthetic */ void ahol() {
        m.agsd[0] = 1692224408;
        m.agsd[1] = 1291864686;
        m.agsd[2] = -2017570725;
        m.agsd[3] = -1132739492;
        m.agsd[4] = -820127301;
        m.agsd[5] = 36385817;
        m.agsd[6] = 640500142;
        m.agsd[7] = 1057368991;
        m.agsd[8] = 116716466;
        m.agsd[9] = -1356890665;
        m.agsd[10] = 1385457312;
        m.agsd[11] = 1834250905;
        m.agsd[12] = -1772239898;
        m.agsd[13] = -652401052;
        m.agsd[14] = 1731315924;
        m.agsd[15] = 1871505743;
        m.agsd[16] = 433595102;
        m.agsd[17] = 1574612995;
        m.agsd[18] = -1391200763;
        m.agsd[19] = -1018357057;
        m.agsd[20] = 1944777921;
        m.agsd[21] = 800819634;
        m.agsd[22] = 1975092005;
        m.agsd[23] = -1852376269;
        m.agsd[24] = 137386776;
        m.agsd[25] = 1197954974;
        m.agsd[26] = 1182997961;
        m.agsd[27] = 1781671898;
        m.agsd[28] = -682836265;
        m.agsd[29] = 849923801;
        m.agsd[30] = -1997877309;
        m.agsd[31] = -2060907628;
        m.agsd[32] = -1682049379;
        m.agsd[33] = -1280174007;
        m.agsd[34] = -1669768944;
        m.agsd[35] = 1832058124;
        m.agsd[36] = -1031795398;
        m.agsd[37] = 592441059;
        m.agsd[38] = -2086878220;
        m.agsd[39] = 693742091;
        m.agsd[40] = -1906742158;
        m.agsd[41] = 1265888537;
        m.agsd[42] = 823236451;
        m.agsd[43] = -499555317;
        m.agsd[44] = 695758848;
        m.agsd[45] = 2031205776;
        m.agsd[46] = -624800861;
        m.agsd[47] = -1390337525;
        m.agsd[48] = 1797825757;
        m.agsd[49] = -875420906;
        m.agsd[50] = -1357454034;
        m.agsd[51] = -967816287;
        m.agsd[52] = -1224329023;
        m.agsd[53] = -1160115245;
        m.agsd[54] = 82368988;
        m.agsd[55] = -1864523435;
        m.agsd[56] = 1819958762;
        m.agsd[57] = 1058218941;
        m.agsd[58] = 720217153;
        m.agsd[59] = 1068750379;
        m.agsd[60] = -1196185829;
        m.agsd[61] = -1471767983;
        m.agsd[62] = -1951618733;
        m.agsd[63] = -54153599;
        m.agsd[64] = 1593417703;
        m.agsd[65] = 1513230207;
        m.agsd[66] = 87774288;
        m.agsd[67] = -1285244901;
        m.agsd[68] = -747952850;
        m.agsd[69] = 1154079717;
        m.agsd[70] = 1380224222;
        m.agsd[71] = -1648169092;
        m.agsd[72] = 925581800;
        m.agsd[73] = 240855104;
        m.agsd[74] = -762385549;
        m.agsd[75] = 1029236343;
        m.agsd[76] = -889678815;
        m.agsd[77] = 2054391839;
        m.agsd[78] = 646402039;
        m.agsd[79] = 795820036;
        m.agsd[80] = -228098492;
        m.agsd[81] = 1956318169;
        m.agsd[82] = 294370982;
        m.agsd[83] = 597923159;
        m.agsd[84] = 381135003;
        m.agsd[85] = 1430846912;
        m.agsd[86] = 1007462203;
        m.agsd[87] = 925767726;
        m.agsd[88] = -1866361066;
        m.agsd[89] = -112542058;
        m.agsd[90] = 1733884490;
        m.agsd[91] = -835811734;
        m.agsd[92] = 906057546;
        m.agsd[93] = 1264022847;
        m.agsd[94] = -1018449683;
        m.agsd[95] = 966542049;
        m.agsd[96] = 1905232572;
        m.agsd[97] = 335709624;
        m.agsd[98] = -1873302878;
        m.agsd[99] = -1512134798;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public String getShortDesc() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = m.by - m.agse("agzi", agzf(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == m.agse("agzj", agsb(int ), (int)182)) break;
            v0 /* !! */  = (long)m.agse("agzk", agsb(int ), (int)183);
        }
        var3_1 = m.c;
        v1 /* !! */  = m.by;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - m.agse("agzl", agzf(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2069289110: {
                    v2 = m.agse("agzm", agzf(int ), (int)2);
                    continue block19;
                }
                case -1474164460: {
                    break block19;
                }
                case 390676974: {
                    v2 = m.agse("agzn", agzf(int ), (int)3);
                    continue block19;
                }
                case 1781658513: {
                    v2 = m.agse("agzo", agzf(int ), (int)4);
                    continue block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = m.b;
        v3 /* !! */  = m.by;
        if (true) ** GOTO lbl29
        block20: while (true) {
            v3 /* !! */  = (long)(v4 - m.agse("agzp", agzf(int ), (int)5));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1546966759: {
                    v4 = m.agse("agzq", agzf(int ), (int)6);
                    continue block20;
                }
                case -1474164460: {
                    break block20;
                }
                case 1232625615: {
                    v4 = m.agse("agzr", agzf(int ), (int)7);
                    continue block20;
                }
                case 1775753507: {
                    v4 = m.agse("agzs", agzf(int ), (int)8);
                    continue block20;
                }
            }
            break;
        }
        var1_3 = m.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                return "\u0423\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u0441\u043f\u0438\u0441\u043a\u043e\u043c \u0434\u0440\u0443\u0437\u0435\u0439";
            }
lbl51:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)m.agse("agzt", agsb(int ), (int)184);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)m.agse("agzu", agsb(int ), (int)185);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)m.agse("agzv", agsb(int ), (int)186);
                    if (!var3_1) ** GOTO lbl51
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)m.agse("agzw", agsb(int ), (int)187);
        ** while (!var3_1)
lbl67:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public Stream<String> tabComplete(String var1_1, String[] var2_2) {
        var6_3 = m.c;
        var5_4 /* !! */  = m.b;
        var4_5 = m.a;
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_3) {
                    throw null;
lbl9:
                    // 12 sources

                    return null;
                }
                if (var4_5 || var4_5) ** GOTO lbl9
                if (var2_2.length != m.agse("agye", agsb(int ), (int)155)) ** GOTO lbl15
                if (var4_5 || var4_5) ** GOTO lbl9
                return new i().append(new String[]{"add", "remove", "list", "clear"}).sortAlphabetically().filterPrefix(var2_2[0]).stream();
lbl15:
                // 1 sources

                if (var4_5 || var4_5) ** GOTO lbl9
                if (var2_2.length != m.agse("agyf", agsb(int ), (int)156)) ** GOTO lbl32
                if (var4_5 || var4_5) ** GOTO lbl9
                var3_6 = var2_2[0].toLowerCase();
                if (var4_5 || var4_5) ** GOTO lbl9
                if (!var3_6.equals("add")) ** GOTO lbl23
                if (var4_5 || var4_5) ** GOTO lbl9
                return new i().append(this.getOnlinePlayers().toArray(new String[0])).filterPrefix(var2_2[1]).stream();
lbl23:
                // 1 sources

                if (var4_5 || var4_5) ** GOTO lbl9
                if (var3_6.equals("remove")) ** GOTO lbl30
                if (var4_5) ** GOTO lbl9
                if (var3_6.equals("del")) ** GOTO lbl30
                if (var4_5) ** GOTO lbl9
                if (!var3_6.equals("delete")) ** GOTO lbl32
                if (var4_5) ** GOTO lbl9
lbl30:
                // 3 sources

                if (var4_5 || var4_5) ** GOTO lbl9
                return new i().append(dl.getFriendNames().toArray(new String[0])).filterPrefix(var2_2[1]).stream();
lbl32:
                // 2 sources

                if (!var4_5 && !var4_5) ** break;
                ** continue;
                return Stream.empty();
            }
lbl35:
            // 2 sources

            case 0: {
                var5_4 /* !! */  = (int)m.agse("agyg", agsb(int ), (int)157);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl40:
            // 4 sources

            case 1: {
                var5_4 /* !! */  = (int)m.agse("agyh", agsb(int ), (int)158);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl86
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)m.agse("agyi", agsb(int ), (int)159);
                    if (!var6_3) ** GOTO lbl40
                    throw null;
                }
            }
lbl50:
            // 2 sources

            case 3: {
                var5_4 /* !! */  = (int)m.agse("agyj", agsb(int ), (int)160);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl64
            }
lbl55:
            // 2 sources

            case 4: {
                var5_4 /* !! */  = (int)m.agse("agyk", agsb(int ), (int)161);
                if (var6_3) {
                    throw null;
                }
            }
lbl59:
            // 4 sources

            case 5: {
                var5_4 /* !! */  = (int)m.agse("agyl", agsb(int ), (int)162);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl72
            }
lbl64:
            // 4 sources

            case 6: {
                var5_4 /* !! */  = (int)m.agse("agym", agsb(int ), (int)163);
                if (!var6_3) ** GOTO lbl55
                throw null;
            }
            case 7: {
                var5_4 /* !! */  = (int)m.agse("agyn", agsb(int ), (int)164);
                if (!var6_3) ** GOTO lbl40
                throw null;
            }
lbl72:
            // 3 sources

            case 8: {
                var5_4 /* !! */  = (int)m.agse("agyo", agsb(int ), (int)165);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl107
            }
            case 9: {
                do {
                    var5_4 /* !! */  = (int)m.agse("agyp", agsb(int ), (int)166);
                } while (!var6_3);
                throw null;
            }
lbl82:
            // 2 sources

            case 10: {
                var5_4 /* !! */  = (int)m.agse("agyq", agsb(int ), (int)167);
                if (!var6_3) ** GOTO lbl64
                throw null;
            }
lbl86:
            // 3 sources

            case 11: {
                var5_4 /* !! */  = (int)m.agse("agyr", agsb(int ), (int)168);
                if (!var6_3) ** GOTO lbl82
                throw null;
            }
lbl90:
            // 2 sources

            case 12: {
                var5_4 /* !! */  = (int)m.agse("agys", agsb(int ), (int)169);
                if (!var6_3) ** GOTO lbl50
                throw null;
            }
            case 13: {
                var5_4 /* !! */  = (int)m.agse("agyt", agsb(int ), (int)170);
                if (!var6_3) ** GOTO lbl35
                throw null;
            }
lbl98:
            // 2 sources

            case 14: {
                var5_4 /* !! */  = (int)m.agse("agyu", agsb(int ), (int)171);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl115
            }
            case 15: {
                var5_4 /* !! */  = (int)m.agse("agyv", agsb(int ), (int)172);
                if (!var6_3) ** GOTO lbl64
                throw null;
            }
lbl107:
            // 2 sources

            case 16: {
                var5_4 /* !! */  = (int)m.agse("agyw", agsb(int ), (int)173);
                if (!var6_3) ** GOTO lbl98
                throw null;
            }
            case 17: {
                var5_4 /* !! */  = (int)m.agse("agyx", agsb(int ), (int)174);
                if (!var6_3) ** GOTO lbl86
                throw null;
            }
lbl115:
            // 3 sources

            case 18: {
                var5_4 /* !! */  = (int)m.agse("agyy", agsb(int ), (int)175);
                if (!var6_3) ** GOTO lbl72
                throw null;
            }
            case 19: {
                var5_4 /* !! */  = (int)m.agse("agyz", agsb(int ), (int)176);
                if (!var6_3) ** GOTO lbl59
                throw null;
            }
            case 20: {
                var5_4 /* !! */  = (int)m.agse("agza", agsb(int ), (int)177);
                if (!var6_3) break;
                throw null;
            }
            case 21: {
                var5_4 /* !! */  = (int)m.agse("agzb", agsb(int ), (int)178);
                if (!var6_3) ** GOTO lbl40
                throw null;
            }
            case 22: {
                do {
                    var5_4 /* !! */  = (int)m.agse("agzc", agsb(int ), (int)179);
                } while (!var6_3);
                throw null;
            }
            case 23: {
                var5_4 /* !! */  = (int)m.agse("agzd", agsb(int ), (int)180);
                if (!var6_3) ** GOTO lbl90
                throw null;
            }
            case 24: 
        }
        var5_4 /* !! */  = (int)m.agse("agze", agsb(int ), (int)181);
        ** while (!var6_3)
lbl143:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ahsq() {
        m.agzg[100] = 3170992123361952848L;
        m.agzg[101] = 9096403058670710354L;
        m.agzg[102] = 6806093692548174409L;
        m.agzg[103] = -8351505822734161427L;
        m.agzg[104] = 8806465629448203080L;
        m.agzg[105] = -8328637594989232990L;
        m.agzg[106] = -1153917430900484596L;
        m.agzg[107] = -8794488454540481L;
        m.agzg[108] = 929724769908651776L;
        m.agzg[109] = -1095131260652688158L;
        m.agzg[110] = 4397789315708979465L;
        m.agzg[111] = 3369630829983751782L;
        m.agzg[112] = 8771859204313135376L;
        m.agzg[113] = -8743527933055204257L;
        m.agzg[114] = 202175516937397944L;
        m.agzg[115] = -4878971682755374902L;
        m.agzg[116] = -693586059205073452L;
        m.agzg[117] = -8024009407141618580L;
        m.agzg[118] = -4172835447425053483L;
        m.agzg[119] = -2966549632532489742L;
        m.agzg[120] = -2090172378058963823L;
        m.agzg[121] = 445573818719524391L;
        m.agzg[122] = -3559457323823299944L;
        m.agzg[123] = 8398982417067928581L;
        m.agzg[124] = -1789945817044607600L;
        m.agzg[125] = -6364218014918611214L;
        m.agzg[126] = -4583038427807985364L;
        m.agzg[127] = 8479144402826939412L;
        m.agzg[128] = 3771873634683099415L;
        m.agzg[129] = 2701210561470099309L;
        m.agzg[130] = -5456709869467382402L;
        m.agzg[131] = 4492416545994193277L;
        m.agzg[132] = -3782046612937661625L;
        m.agzg[133] = 39714575628569701L;
        m.agzg[134] = 6612713661839638632L;
        m.agzg[135] = -8019405180303918604L;
        m.agzg[136] = 5559973805181677838L;
        m.agzg[137] = 6861492483028049955L;
        m.agzg[138] = -6840392840048323227L;
        m.agzg[139] = 5254053230838264434L;
        m.agzg[140] = 1156013831525622539L;
        m.agzg[141] = -7058278689227812272L;
        m.agzg[142] = 7703199915492028441L;
        m.agzg[143] = -5135083905093113866L;
        m.agzg[144] = -324173538887408844L;
        m.agzg[145] = -3574861359819787906L;
        m.agzg[146] = 3821082742202578824L;
        m.agzg[147] = -1836336580178419332L;
        m.agzg[148] = 1565805423573066400L;
        m.agzg[149] = 7016946727826419788L;
        m.agzg[150] = -9040697508721155526L;
        m.agzg[151] = -4475758039706180813L;
        m.agzg[152] = -3716341268229822996L;
        m.agzg[153] = -8656741605258392041L;
        m.agzg[154] = -4649677365362228511L;
        m.agzg[155] = 4279204474155803086L;
        m.agzg[156] = 1929046438804988263L;
        m.agzg[157] = 4966617743985587195L;
        m.agzg[158] = 6389778353793715519L;
        m.agzg[159] = 9134692036754299483L;
        m.agzg[160] = 7598035748289430520L;
        m.agzg[161] = -1113165032185814005L;
        m.agzg[162] = 5680792306840002039L;
        m.agzg[163] = -7567799266797668485L;
        m.agzg[164] = 465029116830482858L;
        m.agzg[165] = 5801588673547844214L;
        m.agzg[166] = -5512085423003786647L;
        m.agzg[167] = 4896667731415891116L;
    }

    private static /* synthetic */ void ahne() {
        m.agsc[200] = 697994257;
        m.agsc[201] = -268510927;
        m.agsc[202] = -906113963;
        m.agsc[203] = 868132993;
        m.agsc[204] = -300408708;
        m.agsc[205] = 1695790479;
        m.agsc[206] = -556009768;
        m.agsc[207] = 932082039;
        m.agsc[208] = 1804917829;
        m.agsc[209] = 1952772576;
        m.agsc[210] = 254892865;
        m.agsc[211] = 1929522633;
        m.agsc[212] = -1751084433;
        m.agsc[213] = -718370029;
        m.agsc[214] = -165921235;
        m.agsc[215] = -890122086;
        m.agsc[216] = -1614425860;
        m.agsc[217] = -248012127;
        m.agsc[218] = -1383377469;
        m.agsc[219] = 655134333;
        m.agsc[220] = -1292853046;
        m.agsc[221] = 611325406;
        m.agsc[222] = 1887234299;
        m.agsc[223] = 1087238715;
        m.agsc[224] = 895903738;
        m.agsc[225] = -1094880312;
        m.agsc[226] = 112015814;
        m.agsc[227] = 453460011;
        m.agsc[228] = 1539308939;
        m.agsc[229] = -165812037;
        m.agsc[230] = -1954721383;
        m.agsc[231] = 1090433719;
        m.agsc[232] = 944550676;
        m.agsc[233] = -224342373;
        m.agsc[234] = 1980073707;
        m.agsc[235] = -1140395937;
        m.agsc[236] = 1634255098;
        m.agsc[237] = -2086988677;
        m.agsc[238] = -867712389;
        m.agsc[239] = -846724684;
        m.agsc[240] = -1847010591;
        m.agsc[241] = -1732157730;
        m.agsc[242] = 342461094;
        m.agsc[243] = -1919668039;
        m.agsc[244] = 1575557441;
        m.agsc[245] = -1535239273;
        m.agsc[246] = -804346230;
        m.agsc[247] = -1072744245;
        m.agsc[248] = 1304263532;
        m.agsc[249] = -919132067;
        m.agsc[250] = 1740501365;
        m.agsc[251] = -385941164;
        m.agsc[252] = -612921861;
        m.agsc[253] = 1950130221;
        m.agsc[254] = -1606568347;
        m.agsc[255] = 92926087;
        m.agsc[256] = -1832310322;
        m.agsc[257] = -1465066701;
        m.agsc[258] = -579128355;
        m.agsc[259] = -1987098344;
        m.agsc[260] = 1580634223;
        m.agsc[261] = -802186593;
        m.agsc[262] = 350168807;
        m.agsc[263] = -904767498;
        m.agsc[264] = 433363841;
        m.agsc[265] = -427067124;
        m.agsc[266] = 2070004684;
        m.agsc[267] = 1410328997;
        m.agsc[268] = -1218227544;
        m.agsc[269] = 2127658749;
        m.agsc[270] = -1073062507;
        m.agsc[271] = 844867079;
        m.agsc[272] = -475698235;
        m.agsc[273] = 219499330;
        m.agsc[274] = 556957528;
        m.agsc[275] = -301826617;
        m.agsc[276] = 287847484;
        m.agsc[277] = 85744489;
        m.agsc[278] = 1202175680;
        m.agsc[279] = -2028671435;
        m.agsc[280] = 902829891;
        m.agsc[281] = -243095092;
        m.agsc[282] = -1961281382;
        m.agsc[283] = 1348191462;
        m.agsc[284] = -340366514;
        m.agsc[285] = -391648656;
        m.agsc[286] = 945631069;
        m.agsc[287] = -1941967298;
        m.agsc[288] = 1053400212;
        m.agsc[289] = 1621269756;
        m.agsc[290] = 1230250021;
        m.agsc[291] = -1109464791;
        m.agsc[292] = 965196754;
        m.agsc[293] = 2091506761;
        m.agsc[294] = 62148471;
        m.agsc[295] = 2121806768;
        m.agsc[296] = 836771480;
        m.agsc[297] = 313599254;
        m.agsc[298] = 653715301;
        m.agsc[299] = 1356430448;
    }

    static {
        agsd = new int[326];
        m.ahli();
        m.ahmf();
        m.ahne();
        m.ahog();
        m.ahol();
        m.ahph();
        m.ahqd();
        m.ahra();
        agzg = new long[168];
        agzh = new long[168];
        m.ahrm();
        m.ahsq();
        m.ahtg();
        m.ahtu();
        DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm").withZone(ZoneId.systemDefault());
    }
}

