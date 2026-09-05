/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1291
 *  net.minecraft.class_1293
 *  net.minecraft.class_2960
 *  net.minecraft.class_332
 *  net.minecraft.class_408
 *  net.minecraft.class_4081
 *  net.minecraft.class_7923
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_408;
import net.minecraft.class_4081;
import net.minecraft.class_7923;
import ruhack.phobia.ar;
import ruhack.phobia.at;
import ruhack.phobia.dx$AnimatedEffectRow;
import ruhack.phobia.dx$EffectRow;
import ruhack.phobia.dx$RollingText;
import ruhack.phobia.dx$TickClock;
import ruhack.phobia.dz;
import ruhack.phobia.ki;
import ruhack.phobia.kq;
import ruhack.phobia.kr;
import ruhack.phobia.ks;
import ruhack.phobia.kv;
import ruhack.phobia.nd;
import ruhack.phobia.oq;

public final class dx
extends ar {
    private static final int BLACK_FILL;
    private static final float TIMER_LEFT_PADDING = 6.6705875f;
    private static final int BORDER_COLOR;
    private static final float TIMER_CIRCLE_GAP = 4.669411f;
    private static final float LEFT_MIN_WIDTH = 100.058815f;
    private static final int NUMBER_ANIMATION_MS = 420;
    private static final float CONTENT_BORDER = 0.66705877f;
    private static final float LEVEL_SIZE = 6.6705875f;
    private static final float CIRCLE_SIZE = 7.8712935f;
    private static final float EFFECT_TEXT_INSET = 20.011763f;
    private static final int BAD_COLOR;
    private static final float CONTENT_Y_OFFSET = 2.7149293f;
    private static long[] cgqe;
    private final Map<String, Integer> observedDurations;
    private static final float INITIAL_WIDTH = 146.09253f;
    private final Map<String, dx$TickClock> clocks;
    private static final int CONTENT_BORDER_COLOR;
    private static int[] cgpy;
    private static final float ROW_HEIGHT = 13.341175f;
    private static final int LEVEL_COLOR;
    private static final float HEADER_ICON_SIZE = 6.870705f;
    private static final float ROW_VERTICAL_PADDING = 3.1285055f;
    private final Map<String, dx$AnimatedEffectRow> animatedRows;
    private static final float TEXT_SIZE = 8.004705f;
    private static long[] cgqd;
    private static final float SECTION_GAP = 2.3747292f;
    private static final float EFFECT_RIGHT_PADDING = 6.0035286f;
    private int collectedPlayerAge;
    private final Map<String, Float> circleProgress;
    private static final float PANEL_RADIUS = 7.3376465f;
    private static final float CIRCLE_BORDER = 0.9005293f;
    private static final float HEADER_TEXT_INSET = 6.0835757f;
    private static final float LEVEL_GAP = 6.0035286f;
    private final Map<String, dx$RollingText> timers;
    public static final int b;
    private static final float CONTENT_RADIUS = 5.33647f;
    private static final float TIMER_SIZE = 7.3376465f;
    private float animatedLeftWidth;
    private final List<dx$EffectRow> collectedRows;
    private long lastAnimationFrame;
    private final Set<String> targetIdBuffer;
    private static final float PANEL_BORDER = 0.66705877f;
    protected static final long fu = -3725145303593641549L;
    private boolean collectedChatDemo;
    public static final boolean c;
    public static final boolean a;
    private static final float CONTENT_X_OFFSET = 2.9684112f;
    private static final float EFFECT_ICON_INSET = 6.770646f;
    private final Set<String> activeIdBuffer;
    private float animatedListHeight;
    private static final float COLUMN_GAP = 2.3747292f;
    private static final float RESIZE_SPEED = 12.0f;
    private static final float EFFECT_ICON_SIZE = 6.770646f;
    private static final float INNER_SHADOW_BLUR = 10.806353f;
    private static final float DESIGN_SCALE = 1.4991183f;
    private static final float INNER_SHADOW_THICKNESS = 0.76711756f;
    private static final int TEXT_COLOR;
    private static int[] cgpx;
    private static final float HEADER_HEIGHT = 19.057869f;
    private static final float NUMBER_SHIFT = 8.271528f;
    private static final float INITIAL_HEIGHT = 73.24972f;
    private float animatedTimerWidth;
    private static final float TIMER_RIGHT_PADDING = 5.33647f;
    private final List<dx$AnimatedEffectRow> animatedRowBuffer;
    private static final String HEADER_ICON = "B";
    private static final float TIMER_MIN_WIDTH = 38.24915f;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$drawDraggable$2(Set var0, String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dx.fu - dx.cgpz("ciyw", cgre(int ), (int)254)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dx.cgpz("ciyx", cgpw(int ), (int)880)) break;
            v0 /* !! */  = (long)dx.cgpz("ciyy", cgpw(int ), (int)881);
        }
        var4_2 = dx.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = dx.fu - dx.cgpz("ciyz", cgre(int ), (int)255)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == dx.cgpz("ciza", cgpw(int ), (int)882)) break;
            v1 /* !! */  = (long)dx.cgpz("cizb", cgpw(int ), (int)883);
        }
        var3_3 /* !! */  = dx.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = dx.fu - dx.cgpz("cizc", cgre(int ), (int)256)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == dx.cgpz("cizd", cgpw(int ), (int)884)) break;
            v2 /* !! */  = (long)dx.cgpz("cize", cgpw(int ), (int)885);
        }
        var2_4 = dx.a;
        if (var4_2) {
            throw null;
lbl24:
            // 3 sources

            return (boolean)dx.cgpz("cizf", cgpw(int ), (int)886);
        }
        if (var2_4 || var2_4) ** GOTO lbl24
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = dx.fu - dx.cgpz("cizg", cgre(int ), (int)257)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == dx.cgpz("cizh", cgpw(int ), (int)887)) break;
            v3 /* !! */  = (long)dx.cgpz("cizi", cgpw(int ), (int)888);
        }
        if (var0.contains(var1_1)) ** GOTO lbl42
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl24
                v4 = dx.cgpz("cizj", cgpw(int ), (int)889);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl45
            }
lbl42:
            // 1 sources

            if (!var2_4 && !var2_4) ** break;
            ** continue;
            v4 = dx.cgpz("cizk", cgpw(int ), (int)890);
lbl45:
            // 2 sources

            return (boolean)v4;
            case 0: {
                do {
                    var3_3 /* !! */  = (int)dx.cgpz("cizl", cgpw(int ), (int)891);
                } while (!var4_2);
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)dx.cgpz("cizm", cgpw(int ), (int)892);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl66
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)dx.cgpz("cizn", cgpw(int ), (int)893);
                } while (!var4_2);
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)dx.cgpz("cizo", cgpw(int ), (int)894);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl74
            }
lbl66:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)dx.cgpz("cizp", cgpw(int ), (int)895);
                if (!var4_2) break;
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)dx.cgpz("cizq", cgpw(int ), (int)896);
                if (!var4_2) ** GOTO lbl66
                throw null;
            }
lbl74:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)dx.cgpz("cizr", cgpw(int ), (int)897);
                if (!var4_2) break;
                throw null;
            }
            case 7: 
        }
        do {
            var3_3 /* !! */  = (int)dx.cgpz("cizs", cgpw(int ), (int)898);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float targetCircleProgress(dx$EffectRow var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dx.fu - dx.cgpz("chyg", cgre(int ), (int)81)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == dx.cgpz("chyi", cgpw(int ), (int)523)) break;
            v0 /* !! */  = (long)dx.cgpz("chyj", cgpw(int ), (int)524);
        }
        var5_2 = dx.c;
        v1 /* !! */  = dx.fu;
        if (true) ** GOTO lbl11
        block54: while (true) {
            v1 /* !! */  = (long)(v2 - dx.cgpz("chym", cgre(int ), (int)82));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1917851481: {
                    v2 = dx.cgpz("chyn", cgre(int ), (int)83);
                    continue block54;
                }
                case 187409503: {
                    v2 = dx.cgpz("chyo", cgre(int ), (int)84);
                    continue block54;
                }
                case 1117133235: {
                    break block54;
                }
                case 1945961973: {
                    v2 = dx.cgpz("chyq", cgre(int ), (int)85);
                    continue block54;
                }
            }
            break;
        }
        var4_3 /* !! */  = dx.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = dx.fu - dx.cgpz("chyt", cgre(int ), (int)86)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == dx.cgpz("chyu", cgpw(int ), (int)525)) break;
            v3 /* !! */  = (long)dx.cgpz("chyw", cgpw(int ), (int)526);
        }
        var3_4 = dx.a;
        if (var5_2) {
            throw null;
lbl32:
            // 6 sources

            return (float)dx.cgpz("chyy", cgqj(int ), (int)527);
        }
        if (var3_4 || var3_4) ** GOTO lbl32
        v4 /* !! */  = dx.fu;
        if (true) ** GOTO lbl39
        block57: while (true) {
            v4 /* !! */  = (long)(v5 - dx.cgpz("chza", cgre(int ), (int)87));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -543627843: {
                    v5 = dx.cgpz("chzc", cgre(int ), (int)88);
                    continue block57;
                }
                case -446195744: {
                    v5 = dx.cgpz("chzd", cgre(int ), (int)89);
                    continue block57;
                }
                case 1117133235: {
                    break block57;
                }
                case 1943370249: {
                    v5 = dx.cgpz("chzh", cgre(int ), (int)90);
                    continue block57;
                }
            }
            break;
        }
        if (var1_1.duration() >= 0) ** GOTO lbl57
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl32
                return 1.0f;
            }
lbl57:
            // 1 sources

            if (var3_4 || var3_4) ** GOTO lbl32
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_2 = dx.fu - dx.cgpz("chzk", cgre(int ), (int)91)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == dx.cgpz("chzm", cgpw(int ), (int)528)) break;
                v6 /* !! */  = (long)dx.cgpz("chzn", cgpw(int ), (int)529);
            }
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_3 = dx.fu - dx.cgpz("chzp", cgre(int ), (int)92)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == dx.cgpz("chzq", cgpw(int ), (int)530)) break;
                v7 /* !! */  = (long)dx.cgpz("chzs", cgpw(int ), (int)531);
            }
            v8 = var1_1.id();
            v9 /* !! */  = dx.fu;
            if (true) ** GOTO lbl73
            block60: while (true) {
                v9 /* !! */  = (long)(v10 - dx.cgpz("chzv", cgre(int ), (int)93));
lbl73:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1891738662: {
                        v10 = dx.cgpz("chzw", cgre(int ), (int)94);
                        continue block60;
                    }
                    case 90143629: {
                        v10 = dx.cgpz("chzx", cgre(int ), (int)95);
                        continue block60;
                    }
                    case 1117133235: {
                        break block60;
                    }
                    case 1874321943: {
                        v10 = dx.cgpz("chzy", cgre(int ), (int)96);
                        continue block60;
                    }
                }
                break;
            }
            v11 = var1_1.duration();
            v12 /* !! */  = dx.fu;
            if (true) ** GOTO lbl90
            block61: while (true) {
                v12 /* !! */  = (long)(dx.cgpz("ciab", cgre(int ), (int)98) - dx.cgpz("chzz", cgre(int ), (int)97));
lbl90:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case 1117133235: {
                        break block61;
                    }
                    case 1370538225: {
                        continue block61;
                    }
                }
                break;
            }
            v13 = v11;
            v14 /* !! */  = dx.fu;
            if (true) ** GOTO lbl100
            block62: while (true) {
                v14 /* !! */  = (long)(dx.cgpz("ciad", cgre(int ), (int)100) - dx.cgpz("ciac", cgre(int ), (int)99));
lbl100:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -1450792421: {
                        continue block62;
                    }
                    case 1117133235: {
                        break block62;
                    }
                }
                break;
            }
            v15 = (BiFunction<Integer, Integer, Integer>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, max(int int ), (Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;)();
            v16 /* !! */  = dx.fu;
            if (true) ** GOTO lbl110
            block63: while (true) {
                v16 /* !! */  = (long)(v17 - dx.cgpz("ciaf", cgre(int ), (int)101));
lbl110:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case -950693842: {
                        v17 = dx.cgpz("ciag", cgre(int ), (int)102);
                        continue block63;
                    }
                    case -83182669: {
                        v17 = dx.cgpz("ciah", cgre(int ), (int)103);
                        continue block63;
                    }
                    case 1117133235: {
                        break block63;
                    }
                    case 1659417096: {
                        v17 = dx.cgpz("ciai", cgre(int ), (int)104);
                        continue block63;
                    }
                }
                break;
            }
            while (true) {
                if ((v18 /* !! */  = (cfr_temp_4 = dx.fu - dx.cgpz("ciam", cgre(int ), (int)105)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v18 /* !! */  == dx.cgpz("ciao", cgpw(int ), (int)532)) break;
                v18 /* !! */  = (long)dx.cgpz("ciap", cgpw(int ), (int)533);
            }
            var2_5 = this.observedDurations.merge(v8, v13, v15);
            if (var3_4 || var3_4) ** GOTO lbl32
            if (var2_5 > 0) ** GOTO lbl135
            if (var3_4) ** GOTO lbl32
            v19 = 0.0f;
            if (var5_2) {
                throw null;
            }
            ** GOTO lbl160
lbl135:
            // 1 sources

            if (!var3_4 && !var3_4) ** break;
            ** continue;
            while (true) {
                if ((v20 /* !! */  = (cfr_temp_5 = dx.fu - dx.cgpz("ciaq", cgre(int ), (int)106)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v20 /* !! */  == dx.cgpz("ciar", cgpw(int ), (int)534)) break;
                v20 /* !! */  = (long)dx.cgpz("cias", cgpw(int ), (int)535);
            }
            v21 = (float)var1_1.duration() / (float)var2_5;
            v22 /* !! */  = dx.fu;
            if (true) ** GOTO lbl147
            block66: while (true) {
                v22 /* !! */  = (long)(v23 - dx.cgpz("ciau", cgre(int ), (int)107));
lbl147:
                // 2 sources

                switch ((int)v22 /* !! */ ) {
                    case -626710099: {
                        v23 = dx.cgpz("ciay", cgre(int ), (int)108);
                        continue block66;
                    }
                    case -405090841: {
                        v23 = dx.cgpz("ciaz", cgre(int ), (int)109);
                        continue block66;
                    }
                    case -107243454: {
                        v23 = dx.cgpz("cibb", cgre(int ), (int)110);
                        continue block66;
                    }
                    case 1117133235: {
                        break block66;
                    }
                }
                break;
            }
            v19 = Math.min(1.0f, v21);
lbl160:
            // 2 sources

            return v19;
lbl161:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)dx.cgpz("cibc", cgpw(int ), (int)536);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl166:
            // 2 sources

            case 1: {
                var4_3 /* !! */  = (int)dx.cgpz("cibd", cgpw(int ), (int)537);
                if (!var5_2) ** GOTO lbl161
                throw null;
            }
lbl170:
            // 3 sources

            case 2: {
                var4_3 /* !! */  = (int)dx.cgpz("cibe", cgpw(int ), (int)538);
                if (var5_2) {
                    throw null;
                }
            }
lbl174:
            // 4 sources

            case 3: {
                var4_3 /* !! */  = (int)dx.cgpz("cibg", cgpw(int ), (int)539);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 4: {
                var4_3 /* !! */  = (int)dx.cgpz("cibj", cgpw(int ), (int)540);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 5: {
                var4_3 /* !! */  = (int)dx.cgpz("cibl", cgpw(int ), (int)541);
                if (!var5_2) ** GOTO lbl166
                throw null;
            }
lbl188:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)dx.cgpz("cibn", cgpw(int ), (int)542);
                if (!var5_2) ** GOTO lbl174
                throw null;
            }
            case 7: {
                var4_3 /* !! */  = (int)dx.cgpz("cibo", cgpw(int ), (int)543);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl197:
            // 3 sources

            case 8: {
                var4_3 /* !! */  = (int)dx.cgpz("cibq", cgpw(int ), (int)544);
                if (!var5_2) ** GOTO lbl170
                throw null;
            }
lbl201:
            // 2 sources

            case 9: {
                var4_3 /* !! */  = (int)dx.cgpz("cibr", cgpw(int ), (int)545);
                if (!var5_2) ** GOTO lbl188
                throw null;
            }
            case 10: {
                do {
                    var4_3 /* !! */  = (int)dx.cgpz("cibz", cgpw(int ), (int)546);
                } while (!var5_2);
                throw null;
            }
lbl210:
            // 2 sources

            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)dx.cgpz("cica", cgpw(int ), (int)547);
                    if (!var5_2) ** GOTO lbl170
                    throw null;
                }
            }
            case 12: 
        }
        var4_3 /* !! */  = (int)dx.cgpz("cicb", cgpw(int ), (int)548);
        ** while (!var5_2)
lbl218:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cjcn() {
        dx.cgpx[500] = -615180700;
        dx.cgpx[501] = -1266131775;
        dx.cgpx[502] = -146599631;
        dx.cgpx[503] = 460192976;
        dx.cgpx[504] = -1041452437;
        dx.cgpx[505] = -1915333078;
        dx.cgpx[506] = 1332472348;
        dx.cgpx[507] = 540212812;
        dx.cgpx[508] = 1537504022;
        dx.cgpx[509] = -681714069;
        dx.cgpx[510] = -62217563;
        dx.cgpx[511] = 290316740;
        dx.cgpx[512] = -1318337196;
        dx.cgpx[513] = -1659806757;
        dx.cgpx[514] = 986357454;
        dx.cgpx[515] = 1534901635;
        dx.cgpx[516] = 1696205808;
        dx.cgpx[517] = 188945790;
        dx.cgpx[518] = -1920075153;
        dx.cgpx[519] = -1430307633;
        dx.cgpx[520] = -134156740;
        dx.cgpx[521] = -1168768062;
        dx.cgpx[522] = -1098736164;
        dx.cgpx[523] = 494688800;
        dx.cgpx[524] = -900552324;
        dx.cgpx[525] = 1242414651;
        dx.cgpx[526] = 1646412499;
        dx.cgpx[527] = 1505120835;
        dx.cgpx[528] = 87960413;
        dx.cgpx[529] = -1609992599;
        dx.cgpx[530] = 1815336384;
        dx.cgpx[531] = 1306325352;
        dx.cgpx[532] = 1349586011;
        dx.cgpx[533] = 743425240;
        dx.cgpx[534] = 290344116;
        dx.cgpx[535] = -127387477;
        dx.cgpx[536] = 432284818;
        dx.cgpx[537] = -853339676;
        dx.cgpx[538] = -517885802;
        dx.cgpx[539] = -481692641;
        dx.cgpx[540] = -764071804;
        dx.cgpx[541] = -1285632623;
        dx.cgpx[542] = 299335021;
        dx.cgpx[543] = -640904168;
        dx.cgpx[544] = -952010653;
        dx.cgpx[545] = 212622632;
        dx.cgpx[546] = 213567478;
        dx.cgpx[547] = -494859594;
        dx.cgpx[548] = -982550987;
        dx.cgpx[549] = 1949943792;
        dx.cgpx[550] = 779812102;
        dx.cgpx[551] = -750999383;
        dx.cgpx[552] = -589972432;
        dx.cgpx[553] = -1059736920;
        dx.cgpx[554] = 1048367596;
        dx.cgpx[555] = -155746671;
        dx.cgpx[556] = -1357757680;
        dx.cgpx[557] = 1758877219;
        dx.cgpx[558] = 364338216;
        dx.cgpx[559] = -1188948400;
        dx.cgpx[560] = 434033401;
        dx.cgpx[561] = 839116133;
        dx.cgpx[562] = 2004750077;
        dx.cgpx[563] = 1671517828;
        dx.cgpx[564] = 1844281419;
        dx.cgpx[565] = 1584602006;
        dx.cgpx[566] = -1303984881;
        dx.cgpx[567] = 1994515978;
        dx.cgpx[568] = -49372340;
        dx.cgpx[569] = -1923439836;
        dx.cgpx[570] = -265696537;
        dx.cgpx[571] = -1964132149;
        dx.cgpx[572] = -523328948;
        dx.cgpx[573] = -1956414041;
        dx.cgpx[574] = -2082295675;
        dx.cgpx[575] = 1458431715;
        dx.cgpx[576] = 1478405291;
        dx.cgpx[577] = -536566761;
        dx.cgpx[578] = -1838217641;
        dx.cgpx[579] = 284253687;
        dx.cgpx[580] = -1724814783;
        dx.cgpx[581] = 1080250863;
        dx.cgpx[582] = 1520176293;
        dx.cgpx[583] = 800403482;
        dx.cgpx[584] = 1107164262;
        dx.cgpx[585] = -332230222;
        dx.cgpx[586] = -713868326;
        dx.cgpx[587] = -1872948498;
        dx.cgpx[588] = -1677907891;
        dx.cgpx[589] = -481190535;
        dx.cgpx[590] = 916137285;
        dx.cgpx[591] = 1259194482;
        dx.cgpx[592] = -604610529;
        dx.cgpx[593] = -575152316;
        dx.cgpx[594] = 806484762;
        dx.cgpx[595] = -1518634466;
        dx.cgpx[596] = -494585032;
        dx.cgpx[597] = 871032635;
        dx.cgpx[598] = -418544426;
        dx.cgpx[599] = 1180918293;
    }

    public static /* synthetic */ CallSite cgpz(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void drawPanel(class_332 var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
        v0 /* !! */  = dx.fu;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - dx.cgpz("cijt", cgre(int ), (int)156));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2047355600: {
                    v1 = dx.cgpz("cijv", cgre(int ), (int)157);
                    continue block18;
                }
                case -619403422: {
                    v1 = dx.cgpz("cijw", cgre(int ), (int)158);
                    continue block18;
                }
                case 697611806: {
                    v1 = dx.cgpz("cijx", cgre(int ), (int)159);
                    continue block18;
                }
                case 1117133235: {
                    break block18;
                }
            }
            break;
        }
        var8_6 = dx.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = dx.fu - dx.cgpz("cikb", cgre(int ), (int)160)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == dx.cgpz("cikc", cgpw(int ), (int)609)) break;
            v2 /* !! */  = (long)dx.cgpz("cikd", cgpw(int ), (int)610);
        }
        var7_7 /* !! */  = dx.b;
        v3 /* !! */  = dx.fu;
        block20: while (true) {
            switch ((int)v3 /* !! */ ) {
                case -256788353: {
                    v3 /* !! */  = (long)(dx.cgpz("cikf", cgre(int ), (int)162) - dx.cgpz("cike", cgre(int ), (int)161));
                    continue block20;
                }
                case 1117133235: {
                    break block20;
                }
            }
            break;
        }
        var6_8 = dx.a;
        if (var8_6) {
            throw null;
        }
        if (var6_8 || var6_8) return;
        if (var7_7 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block21: while (true) {
            block34: {
                switch (cfr_temp_0 == -2147483648 ? var7_7 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v4 = dx.cgpz("cikg", cgqj(int ), (int)611);
                        v5 = dx.cgpz("cikn", cgqj(int ), (int)612);
                        v6 = dx.cgpz("ciko", cgqj(int ), (int)613);
                        while (true) {
                            if ((v7 /* !! */  = (cfr_temp_2 = dx.fu - dx.cgpz("cikp", cgre(int ), (int)163)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v7 /* !! */  == dx.cgpz("cikq", cgpw(int ), (int)614)) {
                                at.panelWithInnerShadow(var0, var1_1, var2_2, var3_3, var4_4, (float)v4, var5_5, (float)v5, (float)v6);
                                if (var6_8) return;
                                break;
                            }
                            v7 /* !! */  = (long)dx.cgpz("cikr", cgpw(int ), (int)615);
                        }
                        if (!var6_8) return;
                        return;
                    }
                    case 1: {
                        var7_7 /* !! */  = (int)dx.cgpz("cikv", cgpw(int ), (int)617);
                        cfr_temp_0 = 4;
                        if (var8_6) {
                            throw null;
                        }
                        break block34;
                    }
                    case 2: {
                        var7_7 /* !! */  = (int)dx.cgpz("cikz", cgpw(int ), (int)618);
                        cfr_temp_0 = 4;
                        if (var8_6) {
                            throw null;
                        }
                        break block34;
                    }
                    case 3: {
                        ** GOTO lbl77
                    }
                    case 5: {
                        ** GOTO lbl74
                    }
                    case 0: {
                        var7_7 /* !! */  = (int)dx.cgpz("cikt", cgpw(int ), (int)616);
                        if (!var8_6) ** break;
                        throw null;
lbl74:
                        // 2 sources

                        var7_7 /* !! */  = (int)dx.cgpz("cilc", cgpw(int ), (int)621);
                        if (var8_6) {
                            throw null;
                        }
lbl77:
                        // 3 sources

                        var7_7 /* !! */  = (int)dx.cgpz("cila", cgpw(int ), (int)619);
                        if (var8_6) {
                            throw null;
                        }
                    }
                    case 4: 
                }
                ** GOTO lbl85
            }
            do {
                if (true) continue block21;
lbl85:
                // 2 sources

                var7_7 /* !! */  = (int)dx.cgpz("cilb", cgpw(int ), (int)620);
                cfr_temp_0 = 0;
            } while (!var8_6);
            break;
        }
        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String formatSeconds(int n2) {
        String string;
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = fu - dx.cgpz("cihw", cgre(int ), (int)149)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == dx.cgpz("cihx", cgpw(int ), (int)590)) break;
            object = dx.cgpz("cihz", cgpw(int ), (int)591);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = fu - dx.cgpz("ciid", cgre(int ), (int)150)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == dx.cgpz("ciie", cgpw(int ), (int)592)) break;
            object = dx.cgpz("ciif", cgpw(int ), (int)593);
        }
        int n3 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = fu - dx.cgpz("ciig", cgre(int ), (int)151)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == dx.cgpz("ciih", cgpw(int ), (int)594)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = dx.cgpz("ciij", cgpw(int ), (int)595);
        }
        if (bl2) return null;
        if (bl2) return null;
        if (n2 < 0) {
            if (bl2) return null;
            return "\u221e";
        }
        if (bl2) return null;
        if (bl2) return null;
        int n4 = n2 % dx.cgpz("ciim", cgpw(int ), (int)596);
        if (bl2) return null;
        if (bl2) return null;
        int n5 = n2 / dx.cgpz("ciir", cgpw(int ), (int)597);
        if (n4 < dx.cgpz("ciis", cgpw(int ), (int)598)) {
            string = "0";
            if (bl3) {
                throw null;
            }
        } else {
            string = "";
        }
        Object object = fu;
        boolean bl4 = true;
        block9: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object = callSite - dx.cgpz("ciit", cgre(int ), (int)152);
            }
            switch ((int)object) {
                case -686662398: {
                    callSite = dx.cgpz("ciiu", cgre(int ), (int)153);
                    continue block9;
                }
                case 1117133235: {
                    return n5 + ":" + string + n4;
                }
                case 1740357986: {
                    callSite = dx.cgpz("ciiv", cgre(int ), (int)154);
                    continue block9;
                }
                case 1935038232: {
                    callSite = dx.cgpz("ciix", cgre(int ), (int)155);
                    continue block9;
                }
            }
            break;
        }
        return n5 + ":" + string + n4;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$drawDraggable$1(Set var0, String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dx.fu - dx.cgpz("cizt", cgre(int ), (int)258)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dx.cgpz("cizu", cgpw(int ), (int)899)) break;
            v0 /* !! */  = (long)dx.cgpz("cizv", cgpw(int ), (int)900);
        }
        var4_2 = dx.c;
        v1 /* !! */  = dx.fu;
        if (true) ** GOTO lbl12
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - dx.cgpz("cizw", cgre(int ), (int)259));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1159080651: {
                    v2 = dx.cgpz("cizx", cgre(int ), (int)260);
                    continue block22;
                }
                case 173346036: {
                    v2 = dx.cgpz("cizy", cgre(int ), (int)261);
                    continue block22;
                }
                case 1117133235: {
                    break block22;
                }
                case 1720958387: {
                    v2 = dx.cgpz("cizz", cgre(int ), (int)262);
                    continue block22;
                }
            }
            break;
        }
        var3_3 /* !! */  = dx.b;
        v3 /* !! */  = dx.fu;
        if (true) ** GOTO lbl29
        block23: while (true) {
            v3 /* !! */  = (long)(v4 - dx.cgpz("cjaa", cgre(int ), (int)263));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 401104526: {
                    v4 = dx.cgpz("cjab", cgre(int ), (int)264);
                    continue block23;
                }
                case 1117133235: {
                    break block23;
                }
                case 1623723465: {
                    v4 = dx.cgpz("cjac", cgre(int ), (int)265);
                    continue block23;
                }
            }
            break;
        }
        var2_4 = dx.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
lbl44:
                    // 3 sources

                    return (boolean)dx.cgpz("cjad", cgpw(int ), (int)901);
                }
                if (var2_4 || var2_4) ** GOTO lbl44
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = dx.fu - dx.cgpz("cjae", cgre(int ), (int)266)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == dx.cgpz("cjaf", cgpw(int ), (int)902)) break;
                    v5 /* !! */  = (long)dx.cgpz("cjag", cgpw(int ), (int)903);
                }
                if (var0.contains(var1_1)) ** GOTO lbl59
                if (var2_4) ** GOTO lbl44
                v6 = dx.cgpz("cjah", cgpw(int ), (int)904);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl62
lbl59:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v6 = dx.cgpz("cjai", cgpw(int ), (int)905);
lbl62:
                // 2 sources

                return (boolean)v6;
            }
lbl63:
            // 2 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)dx.cgpz("cjaj", cgpw(int ), (int)906);
                } while (!var4_2);
                throw null;
            }
lbl68:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)dx.cgpz("cjak", cgpw(int ), (int)907);
                if (!var4_2) break;
                throw null;
            }
lbl72:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)dx.cgpz("cjal", cgpw(int ), (int)908);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl86
            }
            case 3: {
                var3_3 /* !! */  = (int)dx.cgpz("cjam", cgpw(int ), (int)909);
                if (!var4_2) break;
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)dx.cgpz("cjan", cgpw(int ), (int)910);
                    if (!var4_2) ** GOTO lbl63
                    throw null;
                }
            }
lbl86:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)dx.cgpz("cjao", cgpw(int ), (int)911);
                if (!var4_2) ** GOTO lbl72
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)dx.cgpz("cjap", cgpw(int ), (int)912);
                if (!var4_2) ** GOTO lbl68
                throw null;
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)dx.cgpz("cjaq", cgpw(int ), (int)913);
        ** while (!var4_2)
lbl97:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cjcv() {
        dx.cgpy[300] = -918795317;
        dx.cgpy[301] = 818578844;
        dx.cgpy[302] = 284099939;
        dx.cgpy[303] = 1925400636;
        dx.cgpy[304] = -635113549;
        dx.cgpy[305] = -1617353302;
        dx.cgpy[306] = 79203169;
        dx.cgpy[307] = -149519294;
        dx.cgpy[308] = -907225842;
        dx.cgpy[309] = -1383928977;
        dx.cgpy[310] = 614918738;
        dx.cgpy[311] = -1262716184;
        dx.cgpy[312] = -1915717235;
        dx.cgpy[313] = -1431416821;
        dx.cgpy[314] = 1279395946;
        dx.cgpy[315] = -1718514316;
        dx.cgpy[316] = 396801536;
        dx.cgpy[317] = 989952324;
        dx.cgpy[318] = -2023196421;
        dx.cgpy[319] = 1978040495;
        dx.cgpy[320] = 1171179309;
        dx.cgpy[321] = 1440379853;
        dx.cgpy[322] = 650732404;
        dx.cgpy[323] = -1160312121;
        dx.cgpy[324] = 934645731;
        dx.cgpy[325] = 1050299851;
        dx.cgpy[326] = 1990288777;
        dx.cgpy[327] = -1679762570;
        dx.cgpy[328] = 94660686;
        dx.cgpy[329] = -1888954988;
        dx.cgpy[330] = 103212211;
        dx.cgpy[331] = 2015396450;
        dx.cgpy[332] = 1658654347;
        dx.cgpy[333] = 2041512121;
        dx.cgpy[334] = -2082110757;
        dx.cgpy[335] = -2046044217;
        dx.cgpy[336] = -450130818;
        dx.cgpy[337] = 186793798;
        dx.cgpy[338] = 185576017;
        dx.cgpy[339] = -1613247662;
        dx.cgpy[340] = -162519325;
        dx.cgpy[341] = -484753592;
        dx.cgpy[342] = 46687490;
        dx.cgpy[343] = 691125584;
        dx.cgpy[344] = -1892636253;
        dx.cgpy[345] = 1721164942;
        dx.cgpy[346] = -2116619542;
        dx.cgpy[347] = 651347463;
        dx.cgpy[348] = 467772776;
        dx.cgpy[349] = 1105754292;
        dx.cgpy[350] = 1515770823;
        dx.cgpy[351] = 938839908;
        dx.cgpy[352] = 1871540851;
        dx.cgpy[353] = 1108367197;
        dx.cgpy[354] = 1226717198;
        dx.cgpy[355] = -2028100394;
        dx.cgpy[356] = -1186460500;
        dx.cgpy[357] = 622500543;
        dx.cgpy[358] = 1051200802;
        dx.cgpy[359] = 1965645176;
        dx.cgpy[360] = -2076435206;
        dx.cgpy[361] = -1793225629;
        dx.cgpy[362] = -1015146301;
        dx.cgpy[363] = -1785346955;
        dx.cgpy[364] = 395232213;
        dx.cgpy[365] = -1129849299;
        dx.cgpy[366] = 973526980;
        dx.cgpy[367] = 258876327;
        dx.cgpy[368] = -98764520;
        dx.cgpy[369] = -1310003302;
        dx.cgpy[370] = 1282544640;
        dx.cgpy[371] = 30872705;
        dx.cgpy[372] = -49375973;
        dx.cgpy[373] = -940727479;
        dx.cgpy[374] = 2028103054;
        dx.cgpy[375] = -1346421969;
        dx.cgpy[376] = 1533564673;
        dx.cgpy[377] = -556234564;
        dx.cgpy[378] = 672207667;
        dx.cgpy[379] = -499249157;
        dx.cgpy[380] = 629636173;
        dx.cgpy[381] = 1177837151;
        dx.cgpy[382] = 2120943128;
        dx.cgpy[383] = -1228186894;
        dx.cgpy[384] = 453426619;
        dx.cgpy[385] = 704655304;
        dx.cgpy[386] = -1940077380;
        dx.cgpy[387] = 1677739463;
        dx.cgpy[388] = 490063181;
        dx.cgpy[389] = -703294401;
        dx.cgpy[390] = 1131325739;
        dx.cgpy[391] = -12769290;
        dx.cgpy[392] = -1253477981;
        dx.cgpy[393] = 513659265;
        dx.cgpy[394] = -1305360784;
        dx.cgpy[395] = -174231252;
        dx.cgpy[396] = -2063828337;
        dx.cgpy[397] = -1194400063;
        dx.cgpy[398] = 1141977415;
        dx.cgpy[399] = 0x5D5555E5;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static float animateDimension(float var0, float var1_1, float var2_2) {
        block63: {
            v0 /* !! */  = dx.fu;
            if (true) ** GOTO lbl5
            block32: while (true) {
                v0 /* !! */  = (long)(v1 - dx.cgpz("cich", cgre(int ), (int)111));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1635398611: {
                        v1 = dx.cgpz("cici", cgre(int ), (int)112);
                        continue block32;
                    }
                    case 80288433: {
                        v1 = dx.cgpz("cick", cgre(int ), (int)113);
                        continue block32;
                    }
                    case 1117133235: {
                        break block32;
                    }
                }
                break;
            }
            var6_3 = dx.c;
            while (true) {
                block64: {
                    if ((v2 /* !! */  = (cfr_temp_1 = dx.fu - dx.cgpz("cicm", cgre(int ), (int)114)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  != dx.cgpz("cicn", cgpw(int ), (int)549)) break block64;
                    var5_4 /* !! */  = dx.b;
                    v3 /* !! */  = dx.fu;
                    if (true) ** GOTO lbl27
                }
                v2 /* !! */  = (long)dx.cgpz("cicq", cgpw(int ), (int)550);
            }
            block34: while (true) {
                v3 /* !! */  = (long)(v4 - dx.cgpz("cicr", cgre(int ), (int)115));
lbl27:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -2096717581: {
                        v4 = dx.cgpz("cics", cgre(int ), (int)116);
                        continue block34;
                    }
                    case 520499034: {
                        v4 = dx.cgpz("cict", cgre(int ), (int)117);
                        continue block34;
                    }
                    case 1117133235: {
                        break block34;
                    }
                    case 2012039081: {
                        v4 = dx.cgpz("cicu", cgre(int ), (int)118);
                        continue block34;
                    }
                }
                break;
            }
            var4_5 = dx.a;
            if (var6_3) {
                throw null;
            }
            if (var4_5 || var4_5) return (float)dx.cgpz("cicw", cgqj(int ), (int)551);
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_2 = dx.fu - dx.cgpz("cicx", cgre(int ), (int)119)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == dx.cgpz("cicy", cgpw(int ), (int)552)) {
                    if (Float.isNaN(var0)) {
                        break;
                    }
                    break block63;
                }
                v5 /* !! */  = (long)dx.cgpz("cicz", cgpw(int ), (int)553);
            }
            if (var4_5) return (float)dx.cgpz("cicw", cgqj(int ), (int)551);
            return var1_1;
        }
        if (var4_5 || var4_5) return (float)dx.cgpz("cicw", cgqj(int ), (int)551);
        var3_6 = var0 + (var1_1 - var0) * var2_2;
        if (var4_5 || var4_5) return (float)dx.cgpz("cicw", cgqj(int ), (int)551);
        v6 /* !! */  = dx.fu;
        if (true) ** GOTO lbl62
        block36: while (true) {
            v6 /* !! */  = (long)(v7 - dx.cgpz("cida", cgre(int ), (int)120));
lbl62:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -317227030: {
                    v7 = dx.cgpz("cidb", cgre(int ), (int)121);
                    continue block36;
                }
                case 1117133235: {
                    break block36;
                }
                case 1591069155: {
                    v7 = dx.cgpz("cidc", cgre(int ), (int)122);
                    continue block36;
                }
                case 1981904677: {
                    v7 = dx.cgpz("cidi", cgre(int ), (int)123);
                    continue block36;
                }
            }
            break;
        }
        if (Math.abs(var1_1 - var3_6) < dx.cgpz("cidj", cgqj(int ), (int)554)) {
            if (var4_5) return (float)dx.cgpz("cicw", cgqj(int ), (int)551);
            v8 = var1_1;
            if (!var6_3) return v8;
            throw null;
        }
        if (var4_5 || var4_5) {
            return (float)dx.cgpz("cicw", cgqj(int ), (int)551);
        }
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block37: while (true) {
            block65: {
                switch (cfr_temp_0 == -2147483648 ? var5_4 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v8 = var3_6;
                        return v8;
                    }
                    case 0: {
                        ** GOTO lbl126
                    }
                    case 3: {
                        var5_4 /* !! */  = (int)dx.cgpz("cidq", cgpw(int ), (int)558);
                        cfr_temp_0 = 7;
                        if (var6_3) {
                            throw null;
                        }
                        break block65;
                    }
                    case 4: {
                        var5_4 /* !! */  = (int)dx.cgpz("cids", cgpw(int ), (int)559);
                        cfr_temp_0 = 7;
                        if (var6_3) {
                            throw null;
                        }
                        break block65;
                    }
                    case 5: {
                        var5_4 /* !! */  = (int)dx.cgpz("cidz", cgpw(int ), (int)560);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 7: {
                        var5_4 /* !! */  = (int)dx.cgpz("cied", cgpw(int ), (int)562);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 2: {
                        var5_4 /* !! */  = (int)dx.cgpz("cidp", cgpw(int ), (int)557);
                        cfr_temp_0 = 10;
                        if (var6_3) {
                            throw null;
                        }
                        break block65;
                    }
                    case 11: {
                        var5_4 /* !! */  = (int)dx.cgpz("ciej", cgpw(int ), (int)566);
                        cfr_temp_0 = 9;
                        if (var6_3) {
                            throw null;
                        }
                        break block65;
                    }
                    case 12: {
                        var5_4 /* !! */  = (int)dx.cgpz("ciep", cgpw(int ), (int)567);
                        if (var6_3) {
                            throw null;
                        }
lbl126:
                        // 3 sources

                        var5_4 /* !! */  = (int)dx.cgpz("cidl", cgpw(int ), (int)555);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 6: {
                        var5_4 /* !! */  = (int)dx.cgpz("cieb", cgpw(int ), (int)561);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 8: {
                        var5_4 /* !! */  = (int)dx.cgpz("cief", cgpw(int ), (int)563);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 1: {
                        var5_4 /* !! */  = (int)dx.cgpz("cidn", cgpw(int ), (int)556);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 9: {
                        var5_4 /* !! */  = (int)dx.cgpz("cieh", cgpw(int ), (int)564);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 10: 
                }
                ** GOTO lbl150
            }
            do {
                if (true) continue block37;
lbl150:
                // 2 sources

                var5_4 /* !! */  = (int)dx.cgpz("ciei", cgpw(int ), (int)565);
                cfr_temp_0 = 1;
            } while (!var6_3);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void cjco() {
        dx.cgpx[600] = -47016720;
        dx.cgpx[601] = -25836077;
        dx.cgpx[602] = 677423409;
        dx.cgpx[603] = 253279705;
        dx.cgpx[604] = 1455331082;
        dx.cgpx[605] = 1989359755;
        dx.cgpx[606] = 1060064678;
        dx.cgpx[607] = 429366875;
        dx.cgpx[608] = -1180304415;
        dx.cgpx[609] = -1717301203;
        dx.cgpx[610] = -1437849038;
        dx.cgpx[611] = 826761287;
        dx.cgpx[612] = 662397455;
        dx.cgpx[613] = 776839394;
        dx.cgpx[614] = -1076130769;
        dx.cgpx[615] = -1518722839;
        dx.cgpx[616] = 506223568;
        dx.cgpx[617] = 2098866473;
        dx.cgpx[618] = 1656230108;
        dx.cgpx[619] = -905414993;
        dx.cgpx[620] = -1070237036;
        dx.cgpx[621] = -1227314654;
        dx.cgpx[622] = -536021443;
        dx.cgpx[623] = -2126684840;
        dx.cgpx[624] = 2036775268;
        dx.cgpx[625] = -1318177620;
        dx.cgpx[626] = 694827079;
        dx.cgpx[627] = 1739133805;
        dx.cgpx[628] = -401383529;
        dx.cgpx[629] = 1983862261;
        dx.cgpx[630] = 2070181325;
        dx.cgpx[631] = 1231062965;
        dx.cgpx[632] = 631508165;
        dx.cgpx[633] = -1284833755;
        dx.cgpx[634] = 1174082482;
        dx.cgpx[635] = 313040838;
        dx.cgpx[636] = -1454188657;
        dx.cgpx[637] = -1265771146;
        dx.cgpx[638] = -1330386479;
        dx.cgpx[639] = -32575712;
        dx.cgpx[640] = 277705558;
        dx.cgpx[641] = 400574010;
        dx.cgpx[642] = 2073100762;
        dx.cgpx[643] = -879420648;
        dx.cgpx[644] = -1139364887;
        dx.cgpx[645] = -462815787;
        dx.cgpx[646] = 345912449;
        dx.cgpx[647] = -2005239445;
        dx.cgpx[648] = 1889122140;
        dx.cgpx[649] = 1025384778;
        dx.cgpx[650] = -963341794;
        dx.cgpx[651] = -604629202;
        dx.cgpx[652] = -1972378234;
        dx.cgpx[653] = 493669421;
        dx.cgpx[654] = -766433732;
        dx.cgpx[655] = -1664416671;
        dx.cgpx[656] = -2147415999;
        dx.cgpx[657] = -781518864;
        dx.cgpx[658] = 535595361;
        dx.cgpx[659] = -1075874066;
        dx.cgpx[660] = -812244575;
        dx.cgpx[661] = -1884933722;
        dx.cgpx[662] = 813312644;
        dx.cgpx[663] = -978498498;
        dx.cgpx[664] = 1999867540;
        dx.cgpx[665] = 2044939002;
        dx.cgpx[666] = 799647290;
        dx.cgpx[667] = -1982222258;
        dx.cgpx[668] = 1286545526;
        dx.cgpx[669] = 139814791;
        dx.cgpx[670] = 223723402;
        dx.cgpx[671] = 416935292;
        dx.cgpx[672] = 1451874625;
        dx.cgpx[673] = -1949495695;
        dx.cgpx[674] = -1011757575;
        dx.cgpx[675] = 2036835997;
        dx.cgpx[676] = -1705230215;
        dx.cgpx[677] = 1647648800;
        dx.cgpx[678] = -551583514;
        dx.cgpx[679] = 375997259;
        dx.cgpx[680] = -1066190975;
        dx.cgpx[681] = 1253400770;
        dx.cgpx[682] = 1982583616;
        dx.cgpx[683] = -1586502878;
        dx.cgpx[684] = -2090925480;
        dx.cgpx[685] = -1628604045;
        dx.cgpx[686] = -1444527429;
        dx.cgpx[687] = 710309240;
        dx.cgpx[688] = -1714547618;
        dx.cgpx[689] = -1723700065;
        dx.cgpx[690] = -1000838118;
        dx.cgpx[691] = 1925286178;
        dx.cgpx[692] = -1396884938;
        dx.cgpx[693] = -1829298353;
        dx.cgpx[694] = -405468822;
        dx.cgpx[695] = -334270221;
        dx.cgpx[696] = -1173872351;
        dx.cgpx[697] = -2023359335;
        dx.cgpx[698] = 2145773500;
        dx.cgpx[699] = 1752637656;
    }

    private static /* synthetic */ void cjdg() {
        dx.cgqe[100] = -3050887208586162599L;
        dx.cgqe[101] = 1202647687366850468L;
        dx.cgqe[102] = -1906997992319735877L;
        dx.cgqe[103] = 5490528219705687675L;
        dx.cgqe[104] = -6828491766736905660L;
        dx.cgqe[105] = -589292098345277012L;
        dx.cgqe[106] = -4275622956787962547L;
        dx.cgqe[107] = 2282249475671988816L;
        dx.cgqe[108] = 2766446262716689862L;
        dx.cgqe[109] = -3145759938105546743L;
        dx.cgqe[110] = -7832336308417354889L;
        dx.cgqe[111] = -7525935583463513110L;
        dx.cgqe[112] = -886133472610396975L;
        dx.cgqe[113] = -4474307204435061697L;
        dx.cgqe[114] = -7815057569148233582L;
        dx.cgqe[115] = 3815100066455502101L;
        dx.cgqe[116] = 6116206178129562987L;
        dx.cgqe[117] = -7958734287096325043L;
        dx.cgqe[118] = 5577025746870878958L;
        dx.cgqe[119] = -4700716928707182343L;
        dx.cgqe[120] = 6295915330581286752L;
        dx.cgqe[121] = 4341464291025741590L;
        dx.cgqe[122] = -4195054005645812848L;
        dx.cgqe[123] = 6979588473292321403L;
        dx.cgqe[124] = -8996919662102821534L;
        dx.cgqe[125] = 320362354757078076L;
        dx.cgqe[126] = -5683408623245798541L;
        dx.cgqe[127] = 6796403194743766067L;
        dx.cgqe[128] = -8885024219096608952L;
        dx.cgqe[129] = 1333384002040761916L;
        dx.cgqe[130] = 3693410724855095163L;
        dx.cgqe[131] = -5683014633129708275L;
        dx.cgqe[132] = -4535649088901445309L;
        dx.cgqe[133] = 3648709225653551488L;
        dx.cgqe[134] = -3356374511905466192L;
        dx.cgqe[135] = 8410414130122597959L;
        dx.cgqe[136] = -25373877690098581L;
        dx.cgqe[137] = -2853396616471856580L;
        dx.cgqe[138] = -1408711549367089544L;
        dx.cgqe[139] = 7790242082788684134L;
        dx.cgqe[140] = 4614104745696746626L;
        dx.cgqe[141] = 3820720304878483642L;
        dx.cgqe[142] = 4053951107395589228L;
        dx.cgqe[143] = -4999631281586325946L;
        dx.cgqe[144] = 2272523915188660607L;
        dx.cgqe[145] = 4985013695699840941L;
        dx.cgqe[146] = -1917702581097597505L;
        dx.cgqe[147] = -2946953171399710073L;
        dx.cgqe[148] = -4406164614651190476L;
        dx.cgqe[149] = 8322306944208823658L;
        dx.cgqe[150] = 542265851506668406L;
        dx.cgqe[151] = 2742205589121122147L;
        dx.cgqe[152] = 5512411043611469491L;
        dx.cgqe[153] = -5734161858121851969L;
        dx.cgqe[154] = -8262570342427053815L;
        dx.cgqe[155] = 878539661473975058L;
        dx.cgqe[156] = -4790743936460017994L;
        dx.cgqe[157] = 2964655331211964883L;
        dx.cgqe[158] = -5464287451359706039L;
        dx.cgqe[159] = -2671641212038635012L;
        dx.cgqe[160] = -3463224847540124701L;
        dx.cgqe[161] = -4123172438976296435L;
        dx.cgqe[162] = -7297517959325559984L;
        dx.cgqe[163] = 1254844371894876324L;
        dx.cgqe[164] = -9205930731280174227L;
        dx.cgqe[165] = -6934679253155578878L;
        dx.cgqe[166] = 2137055536395007469L;
        dx.cgqe[167] = -7557991295887912731L;
        dx.cgqe[168] = 5543985113857441460L;
        dx.cgqe[169] = 5213220719882382074L;
        dx.cgqe[170] = -6772897367500492206L;
        dx.cgqe[171] = -6736958395307240057L;
        dx.cgqe[172] = -9100369751028603401L;
        dx.cgqe[173] = 8377393148845352187L;
        dx.cgqe[174] = 7683309916690085717L;
        dx.cgqe[175] = -2312292804058754910L;
        dx.cgqe[176] = -7596716333282574823L;
        dx.cgqe[177] = -131366431050404611L;
        dx.cgqe[178] = 6234977549096342238L;
        dx.cgqe[179] = -2387560959086934932L;
        dx.cgqe[180] = -7631848775104659762L;
        dx.cgqe[181] = -3742025104626043020L;
        dx.cgqe[182] = 5224092314018185964L;
        dx.cgqe[183] = 6612890571470376549L;
        dx.cgqe[184] = 5052114769826337011L;
        dx.cgqe[185] = 7957747563619591563L;
        dx.cgqe[186] = -1595080889804048810L;
        dx.cgqe[187] = -8260865529965906783L;
        dx.cgqe[188] = 8581365632841920446L;
        dx.cgqe[189] = -1286786282410072717L;
        dx.cgqe[190] = -834984710270618161L;
        dx.cgqe[191] = -6588706901879778430L;
        dx.cgqe[192] = -5154248847659152819L;
        dx.cgqe[193] = -3707851341182226597L;
        dx.cgqe[194] = 2391260295140317235L;
        dx.cgqe[195] = 4203463115371725010L;
        dx.cgqe[196] = 3192443316523164251L;
        dx.cgqe[197] = -4649691059523464373L;
        dx.cgqe[198] = -8978725391000569688L;
        dx.cgqe[199] = -7341981331264148017L;
    }

    private static /* synthetic */ void cjcs() {
        dx.cgpy[0] = -1643746548;
        dx.cgpy[1] = -832049727;
        dx.cgpy[2] = 360009528;
        dx.cgpy[3] = -520843965;
        dx.cgpy[4] = -557420836;
        dx.cgpy[5] = 236297802;
        dx.cgpy[6] = -1891794495;
        dx.cgpy[7] = -508433828;
        dx.cgpy[8] = -1813279255;
        dx.cgpy[9] = 1653013090;
        dx.cgpy[10] = 723701748;
        dx.cgpy[11] = -114821896;
        dx.cgpy[12] = -925982067;
        dx.cgpy[13] = 1662005889;
        dx.cgpy[14] = -1424524970;
        dx.cgpy[15] = -609824182;
        dx.cgpy[16] = -1344380228;
        dx.cgpy[17] = -2038032808;
        dx.cgpy[18] = -2117916393;
        dx.cgpy[19] = 984754125;
        dx.cgpy[20] = 1042248442;
        dx.cgpy[21] = 930593815;
        dx.cgpy[22] = -78251094;
        dx.cgpy[23] = 978154304;
        dx.cgpy[24] = -1746053684;
        dx.cgpy[25] = -33943472;
        dx.cgpy[26] = 142158770;
        dx.cgpy[27] = -701574831;
        dx.cgpy[28] = 692272310;
        dx.cgpy[29] = 1030101676;
        dx.cgpy[30] = -410882591;
        dx.cgpy[31] = 1347627011;
        dx.cgpy[32] = -170101784;
        dx.cgpy[33] = 612389642;
        dx.cgpy[34] = -1468757146;
        dx.cgpy[35] = -75232358;
        dx.cgpy[36] = -270361894;
        dx.cgpy[37] = -1716764132;
        dx.cgpy[38] = 1590810375;
        dx.cgpy[39] = -2070645519;
        dx.cgpy[40] = -819002737;
        dx.cgpy[41] = 846326169;
        dx.cgpy[42] = 1736604269;
        dx.cgpy[43] = -1855167998;
        dx.cgpy[44] = 45227098;
        dx.cgpy[45] = 52136752;
        dx.cgpy[46] = 667304681;
        dx.cgpy[47] = 242678828;
        dx.cgpy[48] = -501710438;
        dx.cgpy[49] = 1505514;
        dx.cgpy[50] = 964921330;
        dx.cgpy[51] = 43864141;
        dx.cgpy[52] = 2087860128;
        dx.cgpy[53] = 1895867571;
        dx.cgpy[54] = -1621545734;
        dx.cgpy[55] = 104775868;
        dx.cgpy[56] = 825261646;
        dx.cgpy[57] = -382937575;
        dx.cgpy[58] = 1711840739;
        dx.cgpy[59] = -1995326800;
        dx.cgpy[60] = 1140515746;
        dx.cgpy[61] = 224917588;
        dx.cgpy[62] = 18783921;
        dx.cgpy[63] = -2104500767;
        dx.cgpy[64] = -376865645;
        dx.cgpy[65] = 1465861254;
        dx.cgpy[66] = 1982653057;
        dx.cgpy[67] = 1477081711;
        dx.cgpy[68] = 1839814432;
        dx.cgpy[69] = -965522365;
        dx.cgpy[70] = -124674630;
        dx.cgpy[71] = 1575913731;
        dx.cgpy[72] = 1196259749;
        dx.cgpy[73] = -372627374;
        dx.cgpy[74] = -1645639807;
        dx.cgpy[75] = 143491379;
        dx.cgpy[76] = -1428159633;
        dx.cgpy[77] = 1888440245;
        dx.cgpy[78] = -736362894;
        dx.cgpy[79] = 103985707;
        dx.cgpy[80] = -1037286765;
        dx.cgpy[81] = 1068194534;
        dx.cgpy[82] = -1262992244;
        dx.cgpy[83] = 1587741064;
        dx.cgpy[84] = -1921789189;
        dx.cgpy[85] = 1075722083;
        dx.cgpy[86] = -514455956;
        dx.cgpy[87] = -1113639801;
        dx.cgpy[88] = 1338907329;
        dx.cgpy[89] = -1026912404;
        dx.cgpy[90] = 1629135293;
        dx.cgpy[91] = 215951198;
        dx.cgpy[92] = -1693272129;
        dx.cgpy[93] = -1909888501;
        dx.cgpy[94] = -743973138;
        dx.cgpy[95] = -394357015;
        dx.cgpy[96] = -1165708698;
        dx.cgpy[97] = -867612844;
        dx.cgpy[98] = 13636134;
        dx.cgpy[99] = -1657118583;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawContentBackground(class_332 var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
        v0 /* !! */  = dx.fu;
        if (true) ** GOTO lbl5
        block34: while (true) {
            v0 /* !! */  = (long)(dx.cgpz("cilf", cgre(int ), (int)165) - dx.cgpz("cile", cgre(int ), (int)164));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 143987297: {
                    continue block34;
                }
                case 1117133235: {
                    break block34;
                }
            }
            break;
        }
        var8_6 = dx.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = dx.fu - dx.cgpz("cilg", cgre(int ), (int)166)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == dx.cgpz("cilh", cgpw(int ), (int)622)) break;
            v1 /* !! */  = (long)dx.cgpz("cili", cgpw(int ), (int)623);
        }
        var7_7 /* !! */  = dx.b;
        v2 /* !! */  = dx.fu;
        if (true) ** GOTO lbl21
        block36: while (true) {
            v2 /* !! */  = (long)(dx.cgpz("cilk", cgre(int ), (int)168) - dx.cgpz("cilj", cgre(int ), (int)167));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 854596185: {
                    continue block36;
                }
                case 1117133235: {
                    break block36;
                }
            }
            break;
        }
        var6_8 = dx.a;
        if (var8_6) {
            throw null;
lbl29:
            // 4 sources

            return;
        }
        if (var6_8 || var6_8) ** GOTO lbl29
        v3 = dx.cgpz("cill", cgqj(int ), (int)624);
        v4 = dx.cgpz("cilm", cgpw(int ), (int)625);
        v5 /* !! */  = dx.fu;
        if (true) ** GOTO lbl38
        block38: while (true) {
            v5 /* !! */  = (long)(v6 - dx.cgpz("cilo", cgre(int ), (int)169));
lbl38:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -87351211: {
                    v6 = dx.cgpz("cilp", cgre(int ), (int)170);
                    continue block38;
                }
                case 90056786: {
                    v6 = dx.cgpz("cilq", cgre(int ), (int)171);
                    continue block38;
                }
                case 321691405: {
                    v6 = dx.cgpz("cilr", cgre(int ), (int)172);
                    continue block38;
                }
                case 1117133235: {
                    break block38;
                }
            }
            break;
        }
        v7 = dz.color((int)v4);
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_1 = dx.fu - dx.cgpz("cils", cgre(int ), (int)173)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == dx.cgpz("cilt", cgpw(int ), (int)626)) break;
            v8 /* !! */  = (long)dx.cgpz("cilu", cgpw(int ), (int)627);
        }
        v9 = nd.multAlpha(v7, var5_5);
        v10 = dx.cgpz("cilv", cgpw(int ), (int)628);
        v11 /* !! */  = dx.fu;
        if (true) ** GOTO lbl62
        block40: while (true) {
            v11 /* !! */  = (long)(v12 - dx.cgpz("cilw", cgre(int ), (int)174));
lbl62:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case 16310644: {
                    v12 = dx.cgpz("cilx", cgre(int ), (int)175);
                    continue block40;
                }
                case 433117233: {
                    v12 = dx.cgpz("cily", cgre(int ), (int)176);
                    continue block40;
                }
                case 1117133235: {
                    break block40;
                }
                case 1661207528: {
                    v12 = dx.cgpz("cilz", cgre(int ), (int)177);
                    continue block40;
                }
            }
            break;
        }
        ki.rect(var0, var1_1, var2_2, var3_3, var4_4, (float)v3, v9, (boolean)v10);
        if (var6_8) ** GOTO lbl29
        if (var7_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_8) ** GOTO lbl29
                v13 = dx.cgpz("cima", cgqj(int ), (int)629);
                v14 = dx.cgpz("cimb", cgqj(int ), (int)630);
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_2 = dx.fu - dx.cgpz("cimd", cgre(int ), (int)178)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == dx.cgpz("cime", cgpw(int ), (int)631)) break;
                    v15 /* !! */  = (long)dx.cgpz("cimf", cgpw(int ), (int)632);
                }
                v16 /* !! */  = dx.fu;
                if (true) ** GOTO lbl91
                block42: while (true) {
                    v16 /* !! */  = (long)(dx.cgpz("cimh", cgre(int ), (int)180) - dx.cgpz("cimg", cgre(int ), (int)179));
lbl91:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 711310884: {
                            continue block42;
                        }
                        case 1117133235: {
                            break block42;
                        }
                    }
                    break;
                }
                v17 = nd.multAlpha(dx.CONTENT_BORDER_COLOR, var5_5);
                v18 = dx.cgpz("cimi", cgpw(int ), (int)633);
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_3 = dx.fu - dx.cgpz("cimk", cgre(int ), (int)181)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == dx.cgpz("ciml", cgpw(int ), (int)634)) break;
                    v19 /* !! */  = (long)dx.cgpz("cimm", cgpw(int ), (int)635);
                }
                ki.outline(var0, var1_1, var2_2, var3_3, var4_4, (float)v13, (float)v14, v17, (boolean)v18);
                if (!var6_8 && !var6_8) ** break;
                ** continue;
                return;
            }
lbl107:
            // 2 sources

            case 0: {
                var7_7 /* !! */  = (int)dx.cgpz("cimn", cgpw(int ), (int)636);
                if (var8_6) {
                    throw null;
                }
            }
lbl111:
            // 4 sources

            case 1: {
                var7_7 /* !! */  = (int)dx.cgpz("cimo", cgpw(int ), (int)637);
                if (!var8_6) ** GOTO lbl107
                throw null;
            }
lbl115:
            // 2 sources

            case 2: {
                var7_7 /* !! */  = (int)dx.cgpz("cimp", cgpw(int ), (int)638);
                if (var8_6) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl120:
            // 2 sources

            case 3: {
                var7_7 /* !! */  = (int)dx.cgpz("cimq", cgpw(int ), (int)639);
                if (var8_6) {
                    throw null;
                }
            }
lbl124:
            // 4 sources

            case 4: {
                var7_7 /* !! */  = (int)dx.cgpz("cimr", cgpw(int ), (int)640);
                if (!var8_6) ** GOTO lbl120
                throw null;
            }
            case 5: {
                var7_7 /* !! */  = (int)dx.cgpz("cims", cgpw(int ), (int)641);
                if (!var8_6) ** GOTO lbl111
                throw null;
            }
            case 6: {
                var7_7 /* !! */  = (int)dx.cgpz("cimt", cgpw(int ), (int)642);
                if (!var8_6) ** GOTO lbl115
                throw null;
            }
            case 7: 
        }
        do {
            var7_7 /* !! */  = (int)dx.cgpz("cimv", cgpw(int ), (int)643);
        } while (!var8_6);
        throw null;
    }

    static {
        cgpx = new int[944];
        cgpy = new int[944];
        dx.cjci();
        dx.cjcj();
        dx.cjck();
        dx.cjcl();
        dx.cjcm();
        dx.cjcn();
        dx.cjco();
        dx.cjcp();
        dx.cjcq();
        dx.cjcr();
        dx.cjcs();
        dx.cjct();
        dx.cjcu();
        dx.cjcv();
        dx.cjcw();
        dx.cjcx();
        dx.cjcy();
        dx.cjcz();
        dx.cjda();
        dx.cjdb();
        cgqd = new long[280];
        cgqe = new long[280];
        dx.cjdc();
        dx.cjdd();
        dx.cjde();
        dx.cjdf();
        dx.cjdg();
        dx.cjdh();
        BLACK_FILL = nd.rgba((int)dx.cgpz("cjbk", cgpw(int ), (int)920), (int)dx.cgpz("cjbl", cgpw(int ), (int)921), (int)dx.cgpz("cjbm", cgpw(int ), (int)922), (int)dx.cgpz("cjbn", cgpw(int ), (int)923));
        BORDER_COLOR = nd.rgba((int)dx.cgpz("cjbo", cgpw(int ), (int)924), (int)dx.cgpz("cjbp", cgpw(int ), (int)925), (int)dx.cgpz("cjbq", cgpw(int ), (int)926), (int)dx.cgpz("cjbr", cgpw(int ), (int)927));
        CONTENT_BORDER_COLOR = nd.rgba((int)dx.cgpz("cjbs", cgpw(int ), (int)928), (int)dx.cgpz("cjbt", cgpw(int ), (int)929), (int)dx.cgpz("cjbu", cgpw(int ), (int)930), (int)dx.cgpz("cjbv", cgpw(int ), (int)931));
        TEXT_COLOR = nd.rgba((int)dx.cgpz("cjbw", cgpw(int ), (int)932), (int)dx.cgpz("cjbx", cgpw(int ), (int)933), (int)dx.cgpz("cjby", cgpw(int ), (int)934), (int)dx.cgpz("cjbz", cgpw(int ), (int)935));
        LEVEL_COLOR = nd.rgba((int)dx.cgpz("cjca", cgpw(int ), (int)936), (int)dx.cgpz("cjcb", cgpw(int ), (int)937), (int)dx.cgpz("cjcc", cgpw(int ), (int)938), (int)dx.cgpz("cjcd", cgpw(int ), (int)939));
        BAD_COLOR = nd.rgba((int)dx.cgpz("cjce", cgpw(int ), (int)940), (int)dx.cgpz("cjcf", cgpw(int ), (int)941), (int)dx.cgpz("cjcg", cgpw(int ), (int)942), (int)dx.cgpz("cjch", cgpw(int ), (int)943));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean visible() {
        block84: {
            v0 /* !! */  = dx.fu;
            if (true) ** GOTO lbl5
            block54: while (true) {
                v0 /* !! */  = (long)(v1 - dx.cgpz("cgrf", cgre(int ), (int)2));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1191452183: {
                        v1 = dx.cgpz("cgrg", cgre(int ), (int)3);
                        continue block54;
                    }
                    case -314224354: {
                        v1 = dx.cgpz("cgrh", cgre(int ), (int)4);
                        continue block54;
                    }
                    case 681747842: {
                        v1 = dx.cgpz("cgri", cgre(int ), (int)5);
                        continue block54;
                    }
                    case 1117133235: {
                        break block54;
                    }
                }
                break;
            }
            var3_1 = dx.c;
            v2 /* !! */  = dx.fu;
            if (true) ** GOTO lbl22
            block55: while (true) {
                v2 /* !! */  = (long)(v3 - dx.cgpz("cgrj", cgre(int ), (int)6));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case 510451552: {
                        v3 = dx.cgpz("cgrk", cgre(int ), (int)7);
                        continue block55;
                    }
                    case 566467903: {
                        v3 = dx.cgpz("cgrl", cgre(int ), (int)8);
                        continue block55;
                    }
                    case 1117133235: {
                        break block55;
                    }
                }
                break;
            }
            var2_2 /* !! */  = dx.b;
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_0 = dx.fu - dx.cgpz("cgrm", cgre(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == dx.cgpz("cgrn", cgpw(int ), (int)24)) break;
                v4 /* !! */  = (long)dx.cgpz("cgro", cgpw(int ), (int)25);
            }
            var1_3 = dx.a;
            if (var3_1) {
                throw null;
lbl40:
                // 9 sources

                return (boolean)dx.cgpz("cgrp", cgpw(int ), (int)26);
            }
            if (var1_3 || var1_3) ** GOTO lbl40
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = dx.fu - dx.cgpz("cgrq", cgre(int ), (int)10)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == dx.cgpz("cgrr", cgpw(int ), (int)27)) break;
                v5 /* !! */  = (long)dx.cgpz("cgrs", cgpw(int ), (int)28);
            }
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_2 = dx.fu - dx.cgpz("cgrt", cgre(int ), (int)11)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == dx.cgpz("cgru", cgpw(int ), (int)29)) break;
                v6 /* !! */  = (long)dx.cgpz("cgrv", cgpw(int ), (int)30);
            }
            if (this.mc.field_1755 instanceof class_408) ** GOTO lbl150
            if (var1_3) ** GOTO lbl40
            v7 /* !! */  = dx.fu;
            if (true) ** GOTO lbl59
            block60: while (true) {
                v7 /* !! */  = (long)(dx.cgpz("cgrx", cgre(int ), (int)13) - dx.cgpz("cgrw", cgre(int ), (int)12));
lbl59:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case 809089992: {
                        continue block60;
                    }
                    case 1117133235: {
                        break block60;
                    }
                }
                break;
            }
            v8 /* !! */  = dx.fu;
            if (true) ** GOTO lbl68
            block61: while (true) {
                v8 /* !! */  = (long)(dx.cgpz("cgrz", cgre(int ), (int)15) - dx.cgpz("cgry", cgre(int ), (int)14));
lbl68:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -1160664818: {
                        continue block61;
                    }
                    case 1117133235: {
                        break block61;
                    }
                }
                break;
            }
            if (this.mc.field_1724 == null) break block84;
            if (var1_3) ** GOTO lbl40
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_3 = dx.fu - dx.cgpz("cgsa", cgre(int ), (int)16)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == dx.cgpz("cgsb", cgpw(int ), (int)31)) break;
                v9 /* !! */  = (long)dx.cgpz("cgsc", cgpw(int ), (int)32);
            }
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_4 = dx.fu - dx.cgpz("cgsd", cgre(int ), (int)17)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == dx.cgpz("cgse", cgpw(int ), (int)33)) break;
                v10 /* !! */  = (long)dx.cgpz("cgsf", cgpw(int ), (int)34);
            }
            v11 = this.mc.field_1724;
            v12 /* !! */  = dx.fu;
            if (true) ** GOTO lbl90
            block64: while (true) {
                v12 /* !! */  = (long)(v13 - dx.cgpz("cgsg", cgre(int ), (int)18));
lbl90:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -1681445932: {
                        v13 = dx.cgpz("cgsh", cgre(int ), (int)19);
                        continue block64;
                    }
                    case -1427545733: {
                        v13 = dx.cgpz("cgsi", cgre(int ), (int)20);
                        continue block64;
                    }
                    case 469895906: {
                        v13 = dx.cgpz("cgsj", cgre(int ), (int)21);
                        continue block64;
                    }
                    case 1117133235: {
                        break block64;
                    }
                }
                break;
            }
            v14 = v11.method_6026();
            v15 /* !! */  = dx.fu;
            if (true) ** GOTO lbl107
            block65: while (true) {
                v15 /* !! */  = (long)(v16 - dx.cgpz("cgsk", cgre(int ), (int)22));
lbl107:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -954594402: {
                        v16 = dx.cgpz("cgsl", cgre(int ), (int)23);
                        continue block65;
                    }
                    case -689442392: {
                        v16 = dx.cgpz("cgsm", cgre(int ), (int)24);
                        continue block65;
                    }
                    case 602767219: {
                        v16 = dx.cgpz("cgsn", cgre(int ), (int)25);
                        continue block65;
                    }
                    case 1117133235: {
                        break block65;
                    }
                }
                break;
            }
            if (!v14.isEmpty()) ** GOTO lbl150
            if (var1_3) ** GOTO lbl40
        }
        if (var1_3) ** GOTO lbl40
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl40
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_5 = dx.fu - dx.cgpz("cgso", cgre(int ), (int)26)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == dx.cgpz("cgsp", cgpw(int ), (int)35)) break;
                    v17 /* !! */  = (long)dx.cgpz("cgsq", cgpw(int ), (int)36);
                }
                v18 /* !! */  = dx.fu;
                if (true) ** GOTO lbl136
                block67: while (true) {
                    v18 /* !! */  = (long)(v19 - dx.cgpz("cgsr", cgre(int ), (int)27));
lbl136:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -58257748: {
                            v19 = dx.cgpz("cgss", cgre(int ), (int)28);
                            continue block67;
                        }
                        case 924229693: {
                            v19 = dx.cgpz("cgst", cgre(int ), (int)29);
                            continue block67;
                        }
                        case 1117133235: {
                            break block67;
                        }
                        case 1715636536: {
                            v19 = dx.cgpz("cgsu", cgre(int ), (int)30);
                            continue block67;
                        }
                    }
                    break;
                }
                if (this.animatedRows.isEmpty()) ** GOTO lbl155
                if (var1_3) ** GOTO lbl40
lbl150:
                // 3 sources

                if (var1_3 || var1_3) ** GOTO lbl40
                v20 = dx.cgpz("cgsv", cgpw(int ), (int)37);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl158
lbl155:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v20 = dx.cgpz("cgsw", cgpw(int ), (int)38);
lbl158:
                // 2 sources

                return (boolean)v20;
            }
lbl159:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dx.cgpz("cgsx", cgpw(int ), (int)39);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl206
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)dx.cgpz("cgsy", cgpw(int ), (int)40);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 2: {
                var2_2 /* !! */  = (int)dx.cgpz("cgsz", cgpw(int ), (int)41);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl175:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)dx.cgpz("cgta", cgpw(int ), (int)42);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 4: {
                var2_2 /* !! */  = (int)dx.cgpz("cgtb", cgpw(int ), (int)43);
                if (!var3_1) ** GOTO lbl175
                throw null;
            }
lbl184:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)dx.cgpz("cgtc", cgpw(int ), (int)44);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 6: {
                var2_2 /* !! */  = (int)dx.cgpz("cgtd", cgpw(int ), (int)45);
                if (var3_1) {
                    throw null;
                }
            }
            case 7: {
                var2_2 /* !! */  = (int)dx.cgpz("cgte", cgpw(int ), (int)46);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl198:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)dx.cgpz("cgtf", cgpw(int ), (int)47);
                if (!var3_1) ** GOTO lbl159
                throw null;
            }
lbl202:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)dx.cgpz("cgtg", cgpw(int ), (int)48);
                if (var3_1) {
                    throw null;
                }
            }
lbl206:
            // 5 sources

            case 10: {
                var2_2 /* !! */  = (int)dx.cgpz("cgth", cgpw(int ), (int)49);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 11: {
                var2_2 /* !! */  = (int)dx.cgpz("cgti", cgpw(int ), (int)50);
                if (!var3_1) ** GOTO lbl184
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)dx.cgpz("cgtj", cgpw(int ), (int)51);
                if (!var3_1) ** GOTO lbl184
                throw null;
            }
lbl219:
            // 5 sources

            case 13: {
                var2_2 /* !! */  = (int)dx.cgpz("cgtk", cgpw(int ), (int)52);
                if (!var3_1) ** GOTO lbl206
                throw null;
            }
            case 14: 
        }
        var2_2 /* !! */  = (int)dx.cgpz("cgtl", cgpw(int ), (int)53);
        ** while (!var3_1)
lbl226:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$drawDraggable$3(Set var0, String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dx.fu - dx.cgpz("cixy", cgre(int ), (int)247)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dx.cgpz("cixz", cgpw(int ), (int)863)) break;
            v0 /* !! */  = (long)dx.cgpz("ciya", cgpw(int ), (int)864);
        }
        var4_2 = dx.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = dx.fu - dx.cgpz("ciyb", cgre(int ), (int)248)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == dx.cgpz("ciyc", cgpw(int ), (int)865)) break;
            v1 /* !! */  = (long)dx.cgpz("ciyd", cgpw(int ), (int)866);
        }
        var3_3 /* !! */  = dx.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = dx.fu - dx.cgpz("ciye", cgre(int ), (int)249)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == dx.cgpz("ciyf", cgpw(int ), (int)867)) break;
                    v2 /* !! */  = (long)dx.cgpz("ciyg", cgpw(int ), (int)868);
                }
                var2_4 = dx.a;
                if (var4_2) {
                    throw null;
lbl27:
                    // 3 sources

                    return (boolean)dx.cgpz("ciyh", cgpw(int ), (int)869);
                }
                if (var2_4 || var2_4) ** GOTO lbl27
                v3 /* !! */  = dx.fu;
                if (true) ** GOTO lbl34
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - dx.cgpz("ciyi", cgre(int ), (int)250));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1633115241: {
                            v4 = dx.cgpz("ciyj", cgre(int ), (int)251);
                            continue block20;
                        }
                        case 261703555: {
                            v4 = dx.cgpz("ciyk", cgre(int ), (int)252);
                            continue block20;
                        }
                        case 291659249: {
                            v4 = dx.cgpz("ciyl", cgre(int ), (int)253);
                            continue block20;
                        }
                        case 1117133235: {
                            break block20;
                        }
                    }
                    break;
                }
                if (var0.contains(var1_1)) ** GOTO lbl52
                if (var2_4) ** GOTO lbl27
                v5 = dx.cgpz("ciym", cgpw(int ), (int)870);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl55
lbl52:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v5 = dx.cgpz("ciyn", cgpw(int ), (int)871);
lbl55:
                // 2 sources

                return (boolean)v5;
            }
lbl56:
            // 2 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)dx.cgpz("ciyo", cgpw(int ), (int)872);
                } while (!var4_2);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)dx.cgpz("ciyp", cgpw(int ), (int)873);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl85
                    break;
                }
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)dx.cgpz("ciyq", cgpw(int ), (int)874);
                } while (!var4_2);
                throw null;
            }
lbl72:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)dx.cgpz("ciyr", cgpw(int ), (int)875);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl81
            }
            case 4: {
                var3_3 /* !! */  = (int)dx.cgpz("ciys", cgpw(int ), (int)876);
                if (!var4_2) ** GOTO lbl56
                throw null;
            }
lbl81:
            // 3 sources

            case 5: {
                var3_3 /* !! */  = (int)dx.cgpz("ciyt", cgpw(int ), (int)877);
                if (!var4_2) ** GOTO lbl72
                throw null;
            }
lbl85:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)dx.cgpz("ciyu", cgpw(int ), (int)878);
                if (!var4_2) ** GOTO lbl81
                throw null;
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)dx.cgpz("ciyv", cgpw(int ), (int)879);
        ** while (!var4_2)
lbl92:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cjcr() {
        dx.cgpx[900] = -1219394504;
        dx.cgpx[901] = 346804756;
        dx.cgpx[902] = 939977295;
        dx.cgpx[903] = -1031792596;
        dx.cgpx[904] = -278194065;
        dx.cgpx[905] = 754376101;
        dx.cgpx[906] = -279011649;
        dx.cgpx[907] = -1570829205;
        dx.cgpx[908] = 1572622952;
        dx.cgpx[909] = -785673558;
        dx.cgpx[910] = -81421469;
        dx.cgpx[911] = 622573343;
        dx.cgpx[912] = 1950970738;
        dx.cgpx[913] = -1999747627;
        dx.cgpx[914] = 1469805959;
        dx.cgpx[915] = 1449826843;
        dx.cgpx[916] = 338663397;
        dx.cgpx[917] = -1794821745;
        dx.cgpx[918] = -1937891806;
        dx.cgpx[919] = -762107595;
        dx.cgpx[920] = 756352627;
        dx.cgpx[921] = -2045712781;
        dx.cgpx[922] = 2011781786;
        dx.cgpx[923] = 1046498497;
        dx.cgpx[924] = -1933769448;
        dx.cgpx[925] = 1613519198;
        dx.cgpx[926] = -273333492;
        dx.cgpx[927] = -853859945;
        dx.cgpx[928] = -1727156969;
        dx.cgpx[929] = -617169036;
        dx.cgpx[930] = 362380963;
        dx.cgpx[931] = 1226978236;
        dx.cgpx[932] = 853194250;
        dx.cgpx[933] = 811648385;
        dx.cgpx[934] = 977614988;
        dx.cgpx[935] = 2093950448;
        dx.cgpx[936] = -471866334;
        dx.cgpx[937] = 1684020727;
        dx.cgpx[938] = -54698969;
        dx.cgpx[939] = 982303874;
        dx.cgpx[940] = 299050123;
        dx.cgpx[941] = -960112146;
        dx.cgpx[942] = -1519138684;
        dx.cgpx[943] = 1684790107;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$updateRows$5(Set var0, Map.Entry var1_1) {
        v0 /* !! */  = dx.fu;
        if (true) ** GOTO lbl5
        block27: while (true) {
            v0 /* !! */  = (long)(v1 - dx.cgpz("civs", cgre(int ), (int)224));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1244233484: {
                    v1 = dx.cgpz("civt", cgre(int ), (int)225);
                    continue block27;
                }
                case -102067436: {
                    v1 = dx.cgpz("civu", cgre(int ), (int)226);
                    continue block27;
                }
                case 1117133235: {
                    break block27;
                }
            }
            break;
        }
        var4_2 = dx.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = dx.fu - dx.cgpz("civv", cgre(int ), (int)227)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == dx.cgpz("civw", cgpw(int ), (int)828)) break;
            v2 /* !! */  = (long)dx.cgpz("civx", cgpw(int ), (int)829);
        }
        var3_3 /* !! */  = dx.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = dx.fu - dx.cgpz("civy", cgre(int ), (int)228)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == dx.cgpz("civz", cgpw(int ), (int)830)) break;
            v3 /* !! */  = (long)dx.cgpz("ciwa", cgpw(int ), (int)831);
        }
        var2_4 = dx.a;
        if (var4_2) {
            throw null;
lbl31:
            // 4 sources

            return (boolean)dx.cgpz("ciwb", cgpw(int ), (int)832);
        }
        if (var2_4 || var2_4) ** GOTO lbl31
        v4 /* !! */  = dx.fu;
        if (true) ** GOTO lbl38
        block31: while (true) {
            v4 /* !! */  = (long)(v5 - dx.cgpz("ciwc", cgre(int ), (int)229));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1992210688: {
                    v5 = dx.cgpz("ciwd", cgre(int ), (int)230);
                    continue block31;
                }
                case -1946024247: {
                    v5 = dx.cgpz("ciwe", cgre(int ), (int)231);
                    continue block31;
                }
                case 694317431: {
                    v5 = dx.cgpz("ciwf", cgre(int ), (int)232);
                    continue block31;
                }
                case 1117133235: {
                    break block31;
                }
            }
            break;
        }
        v6 = var1_1.getKey();
        v7 /* !! */  = dx.fu;
        if (true) ** GOTO lbl55
        block32: while (true) {
            v7 /* !! */  = (long)(v8 - dx.cgpz("ciwg", cgre(int ), (int)233));
lbl55:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -2059294301: {
                    v8 = dx.cgpz("ciwh", cgre(int ), (int)234);
                    continue block32;
                }
                case -600011877: {
                    v8 = dx.cgpz("ciwi", cgre(int ), (int)235);
                    continue block32;
                }
                case 1117133235: {
                    break block32;
                }
            }
            break;
        }
        if (var0.contains(v6)) ** GOTO lbl88
        if (var2_4) ** GOTO lbl31
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_2 = dx.fu - dx.cgpz("ciwj", cgre(int ), (int)236)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v9 /* !! */  == dx.cgpz("ciwk", cgpw(int ), (int)833)) break;
            v9 /* !! */  = (long)dx.cgpz("ciwl", cgpw(int ), (int)834);
        }
        v10 = (dx$AnimatedEffectRow)var1_1.getValue();
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_3 = dx.fu - dx.cgpz("ciwm", cgre(int ), (int)237)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v11 /* !! */  == dx.cgpz("ciwn", cgpw(int ), (int)835)) break;
            v11 /* !! */  = (long)dx.cgpz("ciwo", cgpw(int ), (int)836);
        }
        if (!(v10.progress <= 0.0f)) ** GOTO lbl88
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl31
                v12 = dx.cgpz("ciwp", cgpw(int ), (int)837);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl91
            }
lbl88:
            // 2 sources

            if (!var2_4 && !var2_4) ** break;
            ** continue;
            v12 = dx.cgpz("ciwq", cgpw(int ), (int)838);
lbl91:
            // 2 sources

            return (boolean)v12;
lbl92:
            // 3 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)dx.cgpz("ciwr", cgpw(int ), (int)839);
                } while (!var4_2);
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)dx.cgpz("ciws", cgpw(int ), (int)840);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl107
            }
            case 2: {
                var3_3 /* !! */  = (int)dx.cgpz("ciwt", cgpw(int ), (int)841);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl107:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)dx.cgpz("ciwu", cgpw(int ), (int)842);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl125
            }
            case 4: {
                var3_3 /* !! */  = (int)dx.cgpz("ciwv", cgpw(int ), (int)843);
                if (var4_2) {
                    throw null;
                }
            }
            case 5: {
                var3_3 /* !! */  = (int)dx.cgpz("ciww", cgpw(int ), (int)844);
                if (!var4_2) ** GOTO lbl92
                throw null;
            }
lbl120:
            // 3 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)dx.cgpz("ciwx", cgpw(int ), (int)845);
                    if (!var4_2) ** GOTO lbl92
                    throw null;
                }
            }
lbl125:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)dx.cgpz("ciwy", cgpw(int ), (int)846);
                if (!var4_2) ** GOTO lbl120
                throw null;
            }
            case 8: 
        }
        var3_3 /* !! */  = (int)dx.cgpz("ciwz", cgpw(int ), (int)847);
        ** while (!var4_2)
lbl132:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ dx$TickClock lambda$displayedTime$6(String var0) {
        v0 /* !! */  = dx.fu;
        block24: while (true) {
            switch ((int)v0 /* !! */ ) {
                case 1117133235: {
                    break block24;
                }
                case 1867033712: {
                    v0 /* !! */  = (long)(dx.cgpz("civc", cgre(int ), (int)214) - dx.cgpz("civb", cgre(int ), (int)213));
                    continue block24;
                }
            }
            break;
        }
        var3_1 = dx.c;
        v1 /* !! */  = dx.fu;
        block25: while (true) {
            switch ((int)v1 /* !! */ ) {
                case 1117133235: {
                    break block25;
                }
                case 1811876558: {
                    v1 /* !! */  = (long)(dx.cgpz("cive", cgre(int ), (int)216) - dx.cgpz("civd", cgre(int ), (int)215));
                    continue block25;
                }
            }
            break;
        }
        var2_2 /* !! */  = dx.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block26: while (true) {
            block36: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v2 /* !! */  = dx.fu;
                        block27: while (true) {
                            switch ((int)v2 /* !! */ ) {
                                case -1390335922: {
                                    v2 /* !! */  = (long)(dx.cgpz("civg", cgre(int ), (int)218) - dx.cgpz("civf", cgre(int ), (int)217));
                                    continue block27;
                                }
                                case 1117133235: {
                                    break block27;
                                }
                            }
                            break;
                        }
                        var1_3 = dx.a;
                        if (var3_1) {
                            throw null;
                        }
                        if (var1_3 != false) return null;
                        if (var1_3 != false) return null;
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_1 = dx.fu - dx.cgpz("civh", cgre(int ), (int)219)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v3 /* !! */  != dx.cgpz("civi", cgpw(int ), (int)822)) ** GOTO lbl43
                            v4 /* !! */  = dx.fu;
                            if (true) ** GOTO lbl58
lbl43:
                            // 1 sources

                            v3 /* !! */  = (long)dx.cgpz("civj", cgpw(int ), (int)823);
                        }
                    }
                    case 1: {
                        ** GOTO lbl51
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)dx.cgpz("civr", cgpw(int ), (int)827);
                        if (var3_1) {
                            throw null;
                        }
lbl51:
                        // 3 sources

                        var2_2 /* !! */  = (int)dx.cgpz("civp", cgpw(int ), (int)825);
                        cfr_temp_0 = 2;
                        if (var3_1) {
                            throw null;
                        }
                        break block36;
                    }
                    block29: while (true) {
                        v4 /* !! */  = (long)(v5 - dx.cgpz("civk", cgre(int ), (int)220));
lbl58:
                        // 2 sources

                        switch ((int)v4 /* !! */ ) {
                            case -1331928249: {
                                v5 = dx.cgpz("civl", cgre(int ), (int)221);
                                continue block29;
                            }
                            case -1021181399: {
                                v5 = dx.cgpz("civm", cgre(int ), (int)222);
                                continue block29;
                            }
                            case -148807511: {
                                v5 = dx.cgpz("civn", cgre(int ), (int)223);
                                continue block29;
                            }
                            case 1117133235: {
                                return new dx$TickClock();
                            }
                        }
                        break;
                    }
                    return new dx$TickClock();
                    case 0: {
                        var2_2 /* !! */  = (int)dx.cgpz("civo", cgpw(int ), (int)824);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl80
            }
            do {
                if (true) continue block26;
lbl80:
                // 2 sources

                var2_2 /* !! */  = (int)dx.cgpz("civq", cgpw(int ), (int)826);
                cfr_temp_0 = 0;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ double cgqc(int n2) {
        return Double.longBitsToDouble(cgqd[n2] ^ cgqe[n2]);
    }

    private static /* synthetic */ void cjcl() {
        dx.cgpx[300] = -918795441;
        dx.cgpx[301] = 818578768;
        dx.cgpx[302] = 284099965;
        dx.cgpx[303] = 1925400586;
        dx.cgpx[304] = -635113573;
        dx.cgpx[305] = -1617353468;
        dx.cgpx[306] = 79203154;
        dx.cgpx[307] = -149519142;
        dx.cgpx[308] = -907225707;
        dx.cgpx[309] = -1383928966;
        dx.cgpx[310] = 614918739;
        dx.cgpx[311] = -1262716338;
        dx.cgpx[312] = -1915717364;
        dx.cgpx[313] = -1431416634;
        dx.cgpx[314] = 1279395926;
        dx.cgpx[315] = -1718514344;
        dx.cgpx[316] = 396801641;
        dx.cgpx[317] = 989952278;
        dx.cgpx[318] = -2023196505;
        dx.cgpx[319] = 1978040350;
        dx.cgpx[320] = 1171179274;
        dx.cgpx[321] = 1440379827;
        dx.cgpx[322] = 650732394;
        dx.cgpx[323] = -1160312142;
        dx.cgpx[324] = 934645719;
        dx.cgpx[325] = 1050299780;
        dx.cgpx[326] = 1990288835;
        dx.cgpx[327] = -1679762649;
        dx.cgpx[328] = 94660720;
        dx.cgpx[329] = -1888955056;
        dx.cgpx[330] = 103212239;
        dx.cgpx[331] = 2015396591;
        dx.cgpx[332] = 1658654391;
        dx.cgpx[333] = 2041512118;
        dx.cgpx[334] = -2082110854;
        dx.cgpx[335] = -2046044329;
        dx.cgpx[336] = -450130714;
        dx.cgpx[337] = -1960689850;
        dx.cgpx[338] = 185576016;
        dx.cgpx[339] = -1613247661;
        dx.cgpx[340] = -162519325;
        dx.cgpx[341] = -484753589;
        dx.cgpx[342] = 46678126;
        dx.cgpx[343] = 691125584;
        dx.cgpx[344] = -1892636254;
        dx.cgpx[345] = 1721164758;
        dx.cgpx[346] = -2116619542;
        dx.cgpx[347] = 651347461;
        dx.cgpx[348] = 467773272;
        dx.cgpx[349] = 1105754293;
        dx.cgpx[350] = 1515770830;
        dx.cgpx[351] = 938839919;
        dx.cgpx[352] = 1871540850;
        dx.cgpx[353] = 1108367219;
        dx.cgpx[354] = 1226717200;
        dx.cgpx[355] = -2028100392;
        dx.cgpx[356] = -1186460485;
        dx.cgpx[357] = 622500524;
        dx.cgpx[358] = 1051200784;
        dx.cgpx[359] = 1965645153;
        dx.cgpx[360] = -2076435214;
        dx.cgpx[361] = -1793225655;
        dx.cgpx[362] = -1015146288;
        dx.cgpx[363] = -1785346989;
        dx.cgpx[364] = 395232244;
        dx.cgpx[365] = -1129849287;
        dx.cgpx[366] = 973527017;
        dx.cgpx[367] = 258876350;
        dx.cgpx[368] = -98764525;
        dx.cgpx[369] = -1310003302;
        dx.cgpx[370] = 1282544652;
        dx.cgpx[371] = 30872719;
        dx.cgpx[372] = -49375982;
        dx.cgpx[373] = -940727449;
        dx.cgpx[374] = 2028103051;
        dx.cgpx[375] = -1346422016;
        dx.cgpx[376] = 1533564700;
        dx.cgpx[377] = -556234584;
        dx.cgpx[378] = 672207672;
        dx.cgpx[379] = -499249167;
        dx.cgpx[380] = 629636186;
        dx.cgpx[381] = 1177837126;
        dx.cgpx[382] = 2120943127;
        dx.cgpx[383] = -1228186889;
        dx.cgpx[384] = 453426604;
        dx.cgpx[385] = 704655325;
        dx.cgpx[386] = -1940077420;
        dx.cgpx[387] = 1677739465;
        dx.cgpx[388] = 490063189;
        dx.cgpx[389] = -703294444;
        dx.cgpx[390] = 1131325745;
        dx.cgpx[391] = -12769321;
        dx.cgpx[392] = -1253477961;
        dx.cgpx[393] = 513659295;
        dx.cgpx[394] = -1305360803;
        dx.cgpx[395] = -174231267;
        dx.cgpx[396] = -2063828322;
        dx.cgpx[397] = -1194400029;
        dx.cgpx[398] = 1141977461;
        dx.cgpx[399] = 1565873640;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ dx$RollingText lambda$drawDraggable$0(String var0) {
        v0 /* !! */  = dx.fu;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - dx.cgpz("cjar", cgre(int ), (int)267));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -953325448: {
                    v1 = dx.cgpz("cjas", cgre(int ), (int)268);
                    continue block20;
                }
                case 1117133235: {
                    break block20;
                }
                case 1855430525: {
                    v1 = dx.cgpz("cjat", cgre(int ), (int)269);
                    continue block20;
                }
            }
            break;
        }
        var3_1 = dx.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = dx.fu - dx.cgpz("cjau", cgre(int ), (int)270)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == dx.cgpz("cjav", cgpw(int ), (int)914)) break;
            v2 /* !! */  = (long)dx.cgpz("cjaw", cgpw(int ), (int)915);
        }
        var2_2 = dx.b;
        v3 /* !! */  = dx.fu;
        if (true) ** GOTO lbl26
        block22: while (true) {
            v3 /* !! */  = (long)(v4 - dx.cgpz("cjax", cgre(int ), (int)271));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1512394807: {
                    v4 = dx.cgpz("cjay", cgre(int ), (int)272);
                    continue block22;
                }
                case -1352822405: {
                    v4 = dx.cgpz("cjaz", cgre(int ), (int)273);
                    continue block22;
                }
                case 347431558: {
                    v4 = dx.cgpz("cjba", cgre(int ), (int)274);
                    continue block22;
                }
                case 1117133235: {
                    break block22;
                }
            }
            break;
        }
        var1_3 = dx.a;
        if (var3_1) {
            throw null;
lbl41:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl44:
        // 1 sources

        v5 /* !! */  = dx.fu;
        if (true) ** GOTO lbl48
        block24: while (true) {
            v5 /* !! */  = (long)(v6 - dx.cgpz("cjbb", cgre(int ), (int)275));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -679286129: {
                    v6 = dx.cgpz("cjbc", cgre(int ), (int)276);
                    continue block24;
                }
                case -200604065: {
                    v6 = dx.cgpz("cjbd", cgre(int ), (int)277);
                    continue block24;
                }
                case 1117133235: {
                    break block24;
                }
            }
            break;
        }
        v7 /* !! */  = dx.fu;
        if (true) ** GOTO lbl61
        block25: while (true) {
            v7 /* !! */  = (long)(dx.cgpz("cjbf", cgre(int ), (int)279) - dx.cgpz("cjbe", cgre(int ), (int)278));
lbl61:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1518242287: {
                    continue block25;
                }
                case 1117133235: {
                    break block25;
                }
            }
            break;
        }
        return new dx$RollingText();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public float getRoundingRadius() {
        v0 /* !! */  = dx.fu;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - dx.cgpz("cium", cgre(int ), (int)206));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1650704847: {
                    v1 = dx.cgpz("ciun", cgre(int ), (int)207);
                    continue block16;
                }
                case -523491636: {
                    v1 = dx.cgpz("ciuo", cgre(int ), (int)208);
                    continue block16;
                }
                case 1117133235: {
                    break block16;
                }
                case 1250957652: {
                    v1 = dx.cgpz("ciup", cgre(int ), (int)209);
                    continue block16;
                }
            }
            break;
        }
        var3_1 = dx.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = dx.fu - dx.cgpz("ciuq", cgre(int ), (int)210)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == dx.cgpz("ciur", cgpw(int ), (int)814)) break;
            v2 /* !! */  = (long)dx.cgpz("cius", cgpw(int ), (int)815);
        }
        var2_2 /* !! */  = dx.b;
        v3 /* !! */  = dx.fu;
        if (true) ** GOTO lbl29
        block18: while (true) {
            v3 /* !! */  = (long)(dx.cgpz("ciuu", cgre(int ), (int)212) - dx.cgpz("ciut", cgre(int ), (int)211));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 1021224254: {
                    continue block18;
                }
                case 1117133235: {
                    break block18;
                }
            }
            break;
        }
        var1_3 = dx.a;
        if (!var3_1) ** GOTO lbl41
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (float)dx.cgpz("ciuv", cgqj(int ), (int)816);
                }
lbl41:
                // 1 sources

                if (var1_3 || var1_3) continue block19;
                return (float)dx.cgpz("ciuw", cgqj(int ), (int)817);
lbl43:
                // 2 sources

                case 0: {
                    do {
                        var2_2 /* !! */  = (int)dx.cgpz("ciux", cgpw(int ), (int)818);
                    } while (!var3_1);
                    throw null;
                }
lbl48:
                // 2 sources

                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)dx.cgpz("ciuy", cgpw(int ), (int)819);
                        if (!var3_1) ** GOTO lbl43
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)dx.cgpz("ciuz", cgpw(int ), (int)820);
                    if (!var3_1) ** GOTO lbl48
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)dx.cgpz("civa", cgpw(int ), (int)821);
        ** while (!var3_1)
lbl60:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private String displayedTime(String var1_1, int var2_2, long var3_3) {
        v0 /* !! */  = dx.fu;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - dx.cgpz("cifs", cgre(int ), (int)131));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2057890423: {
                    v1 = dx.cgpz("cifu", cgre(int ), (int)132);
                    continue block22;
                }
                case -1083063896: {
                    v1 = dx.cgpz("cify", cgre(int ), (int)133);
                    continue block22;
                }
                case 1021619365: {
                    v1 = dx.cgpz("cifz", cgre(int ), (int)134);
                    continue block22;
                }
                case 1117133235: {
                    break block22;
                }
            }
            break;
        }
        var8_4 = dx.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = dx.fu - dx.cgpz("cigb", cgre(int ), (int)135)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == dx.cgpz("cigc", cgpw(int ), (int)576)) break;
            v2 /* !! */  = (long)dx.cgpz("cigd", cgpw(int ), (int)577);
        }
        var7_5 = dx.b;
        v3 /* !! */  = dx.fu;
        if (true) ** GOTO lbl28
        block24: while (true) {
            v3 /* !! */  = (long)(v4 - dx.cgpz("cigf", cgre(int ), (int)136));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 685056283: {
                    v4 = dx.cgpz("cigi", cgre(int ), (int)137);
                    continue block24;
                }
                case 1117133235: {
                    break block24;
                }
                case 1423920803: {
                    v4 = dx.cgpz("cigk", cgre(int ), (int)138);
                    continue block24;
                }
                case 1835079592: {
                    v4 = dx.cgpz("cigm", cgre(int ), (int)139);
                    continue block24;
                }
            }
            break;
        }
        var6_6 = dx.a;
        if (var8_4) {
            throw null;
lbl43:
            // 2 sources

            return null;
        }
        if (var6_6 || var6_6) ** GOTO lbl43
        v5 /* !! */  = dx.fu;
        if (true) ** GOTO lbl50
        block26: while (true) {
            v5 /* !! */  = (long)(v6 - dx.cgpz("cigo", cgre(int ), (int)140));
lbl50:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 1117133235: {
                    break block26;
                }
                case 1359745060: {
                    v6 = dx.cgpz("cigp", cgre(int ), (int)141);
                    continue block26;
                }
                case 1402377516: {
                    v6 = dx.cgpz("cigq", cgre(int ), (int)142);
                    continue block26;
                }
            }
            break;
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_1 = dx.fu - dx.cgpz("cigr", cgre(int ), (int)143)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == dx.cgpz("cigu", cgpw(int ), (int)578)) break;
            v7 /* !! */  = (long)dx.cgpz("cigv", cgpw(int ), (int)579);
        }
        v8 = (Function<String, dx$TickClock>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$displayedTime$6(java.lang.String ), (Ljava/lang/String;)Lruhack/phobia/dx$TickClock;)();
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_2 = dx.fu - dx.cgpz("cigx", cgre(int ), (int)144)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == dx.cgpz("cigy", cgpw(int ), (int)580)) break;
            v9 /* !! */  = (long)dx.cgpz("cigz", cgpw(int ), (int)581);
        }
        var5_7 = this.clocks.computeIfAbsent(var1_1, v8);
        ** while (var6_6 || var6_6)
lbl72:
        // 1 sources

        v10 /* !! */  = dx.fu;
        if (true) ** GOTO lbl76
        block29: while (true) {
            v10 /* !! */  = (long)(v11 - dx.cgpz("ciha", cgre(int ), (int)145));
lbl76:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -230550552: {
                    v11 = dx.cgpz("cihb", cgre(int ), (int)146);
                    continue block29;
                }
                case 900475851: {
                    v11 = dx.cgpz("cihe", cgre(int ), (int)147);
                    continue block29;
                }
                case 1117133235: {
                    break block29;
                }
            }
            break;
        }
        v12 = var5_7.advance(var2_2, var3_3);
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_3 = dx.fu - dx.cgpz("cihf", cgre(int ), (int)148)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == dx.cgpz("cihg", cgpw(int ), (int)582)) break;
            v13 /* !! */  = (long)dx.cgpz("cihh", cgpw(int ), (int)583);
        }
        return dx.formatSeconds(v12);
    }

    private static /* synthetic */ float cgqj(int n2) {
        return Float.intBitsToFloat(cgpx[n2] ^ cgpy[n2]);
    }

    private static /* synthetic */ int cgpw(int n2) {
        return cgpx[n2] ^ cgpy[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float centeredTextY(ks var0, float var1_1, float var2_2) {
        block77: {
            block76: {
                block75: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_0 = dx.fu - dx.cgpz("ciog", cgre(int ), (int)182)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v0 /* !! */  == dx.cgpz("cioh", cgpw(int ), (int)678)) break;
                        v0 /* !! */  = (long)dx.cgpz("cioi", cgpw(int ), (int)679);
                    }
                    var7_3 = dx.c;
                    while (true) {
                        if ((v1 /* !! */  = (cfr_temp_1 = dx.fu - dx.cgpz("cioj", cgre(int ), (int)183)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v1 /* !! */  == dx.cgpz("ciok", cgpw(int ), (int)680)) break;
                        v1 /* !! */  = (long)dx.cgpz("ciol", cgpw(int ), (int)681);
                    }
                    var6_4 /* !! */  = dx.b;
                    v2 /* !! */  = dx.fu;
                    if (true) ** GOTO lbl19
                    block49: while (true) {
                        v2 /* !! */  = (long)(dx.cgpz("cion", cgre(int ), (int)185) - dx.cgpz("ciom", cgre(int ), (int)184));
lbl19:
                        // 2 sources

                        switch ((int)v2 /* !! */ ) {
                            case -278981599: {
                                continue block49;
                            }
                            case 1117133235: {
                                break block49;
                            }
                        }
                        break;
                    }
                    var5_5 = dx.a;
                    if (var7_3) {
                        throw null;
lbl27:
                        // 10 sources

                        return (float)dx.cgpz("ciop", cgqj(int ), (int)682);
                    }
                    if (var5_5 || var5_5) ** GOTO lbl27
                    if (var0 != null) break block75;
                    if (var5_5) ** GOTO lbl27
                    return var2_2 - var1_1 * dx.cgpz("cioq", cgqj(int ), (int)683);
                }
                if (var5_5 || var5_5) ** GOTO lbl27
                v3 = dx.cgpz("cior", cgpw(int ), (int)684);
                v4 /* !! */  = dx.fu;
                if (true) ** GOTO lbl40
                block51: while (true) {
                    v4 /* !! */  = (long)(dx.cgpz("ciot", cgre(int ), (int)187) - dx.cgpz("cios", cgre(int ), (int)186));
lbl40:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 415788686: {
                            continue block51;
                        }
                        case 1117133235: {
                            break block51;
                        }
                    }
                    break;
                }
                var3_6 = var0.getGlyph((int)v3);
                if (var5_5 || var5_5) ** GOTO lbl27
                if (var3_6 == null) break block76;
                if (var5_5) ** GOTO lbl27
                v5 /* !! */  = dx.fu;
                if (true) ** GOTO lbl53
                block52: while (true) {
                    v5 /* !! */  = (long)(dx.cgpz("ciov", cgre(int ), (int)189) - dx.cgpz("ciou", cgre(int ), (int)188));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 1117133235: {
                            break block52;
                        }
                        case 2059875931: {
                            continue block52;
                        }
                    }
                    break;
                }
                if (!(var3_6.height <= 0.0f)) break block77;
                if (var5_5) ** GOTO lbl27
            }
            if (var5_5 || var5_5) ** GOTO lbl27
            return var2_2 - var1_1 * dx.cgpz("ciow", cgqj(int ), (int)685);
        }
        if (var5_5 || var5_5) ** GOTO lbl27
        v6 /* !! */  = dx.fu;
        if (true) ** GOTO lbl69
        block53: while (true) {
            v6 /* !! */  = (long)(v7 - dx.cgpz("ciox", cgre(int ), (int)190));
lbl69:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 276512576: {
                    v7 = dx.cgpz("cioy", cgre(int ), (int)191);
                    continue block53;
                }
                case 1117133235: {
                    break block53;
                }
                case 1341600306: {
                    v7 = dx.cgpz("cipa", cgre(int ), (int)192);
                    continue block53;
                }
            }
            break;
        }
        var4_7 = var1_1 / var0.getEmSize();
        if (var5_5) ** GOTO lbl27
        if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var5_5) ** break;
                ** continue;
                v8 /* !! */  = dx.fu;
                if (true) ** GOTO lbl89
                block54: while (true) {
                    v8 /* !! */  = (long)(dx.cgpz("cipc", cgre(int ), (int)194) - dx.cgpz("cipb", cgre(int ), (int)193));
lbl89:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 1117133235: {
                            break block54;
                        }
                        case 1839450105: {
                            continue block54;
                        }
                    }
                    break;
                }
                v9 = var0.getAscender();
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = dx.fu - dx.cgpz("cipd", cgre(int ), (int)195)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == dx.cgpz("cipe", cgpw(int ), (int)686)) break;
                    v10 /* !! */  = (long)dx.cgpz("cipf", cgpw(int ), (int)687);
                }
                v11 = v9 - var3_6.bearingY;
                v12 /* !! */  = dx.fu;
                if (true) ** GOTO lbl106
                block56: while (true) {
                    v12 /* !! */  = (long)(v13 - dx.cgpz("cipg", cgre(int ), (int)196));
lbl106:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -2090092124: {
                            v13 = dx.cgpz("ciph", cgre(int ), (int)197);
                            continue block56;
                        }
                        case -771094245: {
                            v13 = dx.cgpz("cipi", cgre(int ), (int)198);
                            continue block56;
                        }
                        case 1117133235: {
                            break block56;
                        }
                        case 1253220365: {
                            v13 = dx.cgpz("cipj", cgre(int ), (int)199);
                            continue block56;
                        }
                    }
                    break;
                }
                return var2_2 - (v11 + var3_6.height * dx.cgpz("cipk", cgqj(int ), (int)688)) * var4_7;
            }
lbl119:
            // 4 sources

            case 0: {
                var6_4 /* !! */  = (int)dx.cgpz("cipl", cgpw(int ), (int)689);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 1: {
                var6_4 /* !! */  = (int)dx.cgpz("cipm", cgpw(int ), (int)690);
                if (!var7_3) ** GOTO lbl119
                throw null;
            }
lbl128:
            // 3 sources

            case 2: {
                var6_4 /* !! */  = (int)dx.cgpz("cipn", cgpw(int ), (int)691);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl133:
            // 3 sources

            case 3: {
                var6_4 /* !! */  = (int)dx.cgpz("cipo", cgpw(int ), (int)692);
                if (!var7_3) ** GOTO lbl128
                throw null;
            }
            case 4: {
                var6_4 /* !! */  = (int)dx.cgpz("cipp", cgpw(int ), (int)693);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl142:
            // 2 sources

            case 5: {
                var6_4 /* !! */  = (int)dx.cgpz("cipq", cgpw(int ), (int)694);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl147:
            // 2 sources

            case 6: {
                var6_4 /* !! */  = (int)dx.cgpz("cipr", cgpw(int ), (int)695);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl160
            }
            case 7: {
                var6_4 /* !! */  = (int)dx.cgpz("cips", cgpw(int ), (int)696);
                if (!var7_3) ** GOTO lbl119
                throw null;
            }
lbl156:
            // 2 sources

            case 8: {
                var6_4 /* !! */  = (int)dx.cgpz("cipt", cgpw(int ), (int)697);
                if (!var7_3) ** GOTO lbl133
                throw null;
            }
lbl160:
            // 4 sources

            case 9: {
                var6_4 /* !! */  = (int)dx.cgpz("cipu", cgpw(int ), (int)698);
                if (!var7_3) ** GOTO lbl156
                throw null;
            }
            case 10: {
                var6_4 /* !! */  = (int)dx.cgpz("cipv", cgpw(int ), (int)699);
                if (!var7_3) ** GOTO lbl142
                throw null;
            }
            case 11: {
                var6_4 /* !! */  = (int)dx.cgpz("cipw", cgpw(int ), (int)700);
                if (!var7_3) ** GOTO lbl128
                throw null;
            }
            case 12: {
                var6_4 /* !! */  = (int)dx.cgpz("cipx", cgpw(int ), (int)701);
                if (!var7_3) ** GOTO lbl119
                throw null;
            }
            case 13: {
                var6_4 /* !! */  = (int)dx.cgpz("cipy", cgpw(int ), (int)702);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_4 /* !! */  = (int)dx.cgpz("cipz", cgpw(int ), (int)703);
                    if (!var7_3) ** GOTO lbl147
                    throw null;
                }
            }
lbl186:
            // 3 sources

            case 15: {
                var6_4 /* !! */  = (int)dx.cgpz("ciqa", cgpw(int ), (int)704);
                if (!var7_3) ** GOTO lbl160
                throw null;
            }
lbl190:
            // 3 sources

            case 16: {
                var6_4 /* !! */  = (int)dx.cgpz("ciqb", cgpw(int ), (int)705);
                if (!var7_3) ** GOTO lbl133
                throw null;
            }
            case 17: 
        }
        var6_4 /* !! */  = (int)dx.cgpz("ciqc", cgpw(int ), (int)706);
        ** while (!var7_3)
lbl197:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float smootherstep(float var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dx.fu - dx.cgpz("cito", cgre(int ), (int)200)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dx.cgpz("citp", cgpw(int ), (int)796)) break;
            v0 /* !! */  = (long)dx.cgpz("citq", cgpw(int ), (int)797);
        }
        var4_1 = dx.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = dx.fu - dx.cgpz("citr", cgre(int ), (int)201)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == dx.cgpz("cits", cgpw(int ), (int)798)) break;
            v1 /* !! */  = (long)dx.cgpz("citt", cgpw(int ), (int)799);
        }
        var3_2 /* !! */  = dx.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = dx.fu - dx.cgpz("citu", cgre(int ), (int)202)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == dx.cgpz("citv", cgpw(int ), (int)800)) break;
            v2 /* !! */  = (long)dx.cgpz("citw", cgpw(int ), (int)801);
        }
        var2_3 = dx.a;
        if (var4_1) {
            throw null;
lbl24:
            // 2 sources

            return (float)dx.cgpz("citx", cgqj(int ), (int)802);
        }
        if (var2_3 || var2_3) ** GOTO lbl24
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = dx.fu;
                if (true) ** GOTO lbl34
                block16: while (true) {
                    v3 /* !! */  = (long)(dx.cgpz("citz", cgre(int ), (int)204) - dx.cgpz("city", cgre(int ), (int)203));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -493894667: {
                            continue block16;
                        }
                        case 1117133235: {
                            break block16;
                        }
                    }
                    break;
                }
                v4 = Math.min(1.0f, var0);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = dx.fu - dx.cgpz("ciua", cgre(int ), (int)205)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == dx.cgpz("ciub", cgpw(int ), (int)803)) break;
                    v5 /* !! */  = (long)dx.cgpz("ciuc", cgpw(int ), (int)804);
                }
                var1_4 = Math.max(0.0f, v4);
                if (var2_3 || var2_3) ** continue;
                return var1_4 * var1_4 * var1_4 * (var1_4 * (var1_4 * dx.cgpz("ciud", cgqj(int ), (int)805) - dx.cgpz("ciue", cgqj(int ), (int)806)) + dx.cgpz("ciuf", cgqj(int ), (int)807));
            }
lbl49:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)dx.cgpz("ciug", cgpw(int ), (int)808);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl63
            }
lbl54:
            // 3 sources

            case 1: {
                var3_2 /* !! */  = (int)dx.cgpz("ciuh", cgpw(int ), (int)809);
                if (!var4_1) ** GOTO lbl49
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)dx.cgpz("ciui", cgpw(int ), (int)810);
                    if (!var4_1) break block0;
                    throw null;
                }
            }
lbl63:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)dx.cgpz("ciuj", cgpw(int ), (int)811);
                if (!var4_1) ** GOTO lbl54
                throw null;
            }
            case 4: {
                var3_2 /* !! */  = (int)dx.cgpz("ciuk", cgpw(int ), (int)812);
                if (!var4_1) ** GOTO lbl54
                throw null;
            }
            case 5: 
        }
        var3_2 /* !! */  = (int)dx.cgpz("ciul", cgpw(int ), (int)813);
        ** while (!var4_1)
lbl74:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cjda() {
        dx.cgpy[800] = -331542329;
        dx.cgpy[801] = -507483253;
        dx.cgpy[802] = -946625626;
        dx.cgpy[803] = 1127397114;
        dx.cgpy[804] = 1934112082;
        dx.cgpy[805] = -932590815;
        dx.cgpy[806] = 809658605;
        dx.cgpy[807] = -41489181;
        dx.cgpy[808] = -1390367927;
        dx.cgpy[809] = 878970321;
        dx.cgpy[810] = 1429280101;
        dx.cgpy[811] = 1331725057;
        dx.cgpy[812] = -16636764;
        dx.cgpy[813] = -1632411541;
        dx.cgpy[814] = 1567778385;
        dx.cgpy[815] = -1012760788;
        dx.cgpy[816] = 807044490;
        dx.cgpy[817] = 1603075121;
        dx.cgpy[818] = -2009667345;
        dx.cgpy[819] = -1440326797;
        dx.cgpy[820] = 1749567995;
        dx.cgpy[821] = 1080909642;
        dx.cgpy[822] = 111982456;
        dx.cgpy[823] = -429711385;
        dx.cgpy[824] = 1025567450;
        dx.cgpy[825] = 631308928;
        dx.cgpy[826] = 727091521;
        dx.cgpy[827] = 1451507732;
        dx.cgpy[828] = -307506367;
        dx.cgpy[829] = 96667787;
        dx.cgpy[830] = -386387493;
        dx.cgpy[831] = 445949890;
        dx.cgpy[832] = 527028418;
        dx.cgpy[833] = -1788311223;
        dx.cgpy[834] = -1496637139;
        dx.cgpy[835] = 1196018104;
        dx.cgpy[836] = 1717442246;
        dx.cgpy[837] = -803474708;
        dx.cgpy[838] = -1608244327;
        dx.cgpy[839] = -86978096;
        dx.cgpy[840] = 915655205;
        dx.cgpy[841] = -677349919;
        dx.cgpy[842] = -1591850384;
        dx.cgpy[843] = -1649739117;
        dx.cgpy[844] = 1909155617;
        dx.cgpy[845] = -1645830492;
        dx.cgpy[846] = 361507072;
        dx.cgpy[847] = 1456243929;
        dx.cgpy[848] = -1260783727;
        dx.cgpy[849] = -2048556435;
        dx.cgpy[850] = 1605113510;
        dx.cgpy[851] = -193168299;
        dx.cgpy[852] = 2054057399;
        dx.cgpy[853] = 1231802863;
        dx.cgpy[854] = -1429671464;
        dx.cgpy[855] = -1188421485;
        dx.cgpy[856] = 1191154593;
        dx.cgpy[857] = 397294186;
        dx.cgpy[858] = 1833154661;
        dx.cgpy[859] = 1645896459;
        dx.cgpy[860] = -980624368;
        dx.cgpy[861] = -1763827197;
        dx.cgpy[862] = 1504920046;
        dx.cgpy[863] = 505977633;
        dx.cgpy[864] = -1008156176;
        dx.cgpy[865] = 1055408110;
        dx.cgpy[866] = -909512123;
        dx.cgpy[867] = -1079441899;
        dx.cgpy[868] = -723233390;
        dx.cgpy[869] = -549522270;
        dx.cgpy[870] = -1166541068;
        dx.cgpy[871] = 211549251;
        dx.cgpy[872] = 53968516;
        dx.cgpy[873] = 1655582120;
        dx.cgpy[874] = -510987113;
        dx.cgpy[875] = 1171372215;
        dx.cgpy[876] = 1498117197;
        dx.cgpy[877] = -1182899586;
        dx.cgpy[878] = -1701266216;
        dx.cgpy[879] = 301757683;
        dx.cgpy[880] = 1554859999;
        dx.cgpy[881] = -864972593;
        dx.cgpy[882] = 1531125518;
        dx.cgpy[883] = -1886512889;
        dx.cgpy[884] = 178272084;
        dx.cgpy[885] = -1297888007;
        dx.cgpy[886] = 688661644;
        dx.cgpy[887] = 898251948;
        dx.cgpy[888] = 980184235;
        dx.cgpy[889] = -1879164978;
        dx.cgpy[890] = 46273375;
        dx.cgpy[891] = -1005239532;
        dx.cgpy[892] = -5696956;
        dx.cgpy[893] = -171684210;
        dx.cgpy[894] = -1634735816;
        dx.cgpy[895] = -2013110125;
        dx.cgpy[896] = -1140795313;
        dx.cgpy[897] = 1725556265;
        dx.cgpy[898] = -679103046;
        dx.cgpy[899] = -183603578;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private List<dx$AnimatedEffectRow> updateRows(List<dx$EffectRow> var1_1, float var2_2) {
        var10_3 = dx.c;
        var9_4 /* !! */  = dx.b;
        var8_5 = dx.a;
        if (!var10_3) ** GOTO lbl10
        throw null;
        {
            if (var9_4 /* !! */  == 0) ** GOTO lbl-1000
            switch (var9_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl10:
                // 1 sources

                if (var8_5 || var8_5) continue block61;
                var3_6 = this.targetIdBuffer;
                if (var8_5 || var8_5) continue block61;
                var3_6.clear();
                if (var8_5 || var8_5) continue block61;
                var4_7 = var1_1.iterator();
                if (var8_5) continue block61;
                do {
                    if (var8_5 || var8_5) continue block61;
                    if (!var4_7.hasNext()) ** GOTO lbl44
                    if (var8_5) continue block61;
                    var5_8 = var4_7.next();
                    if (var8_5 || var8_5) continue block61;
                    var3_6.add(var5_8.id());
                    if (var8_5 || var8_5) continue block61;
                    var6_9 = this.animatedRows.get(var5_8.id());
                    if (var8_5 || var8_5) continue block61;
                    if (var6_9 == null) {
                        if (var8_5 || var8_5) continue block61;
                        var6_9 = new dx$AnimatedEffectRow((dx$EffectRow)var5_8);
                        if (var8_5 || var8_5) continue block61;
                        this.animatedRows.put(var5_8.id(), var6_9);
                        if (var8_5) continue block61;
                        if (var10_3) {
                            throw null;
                        }
                    } else {
                        if (var8_5 || var8_5) continue block61;
                        var6_9.row = var5_8;
                        if (var8_5) continue block61;
                    }
                    if (var8_5 || var8_5) continue block61;
                } while (!var10_3);
                throw null;
lbl44:
                // 1 sources

                if (var8_5 || var8_5) continue block61;
                var4_7 = this.animatedRows.entrySet().iterator();
                if (var8_5) continue block61;
                do {
                    if (var8_5 || var8_5) continue block61;
                    if (!var4_7.hasNext()) ** GOTO lbl73
                    if (var8_5) continue block61;
                    var5_8 = (Map.Entry)var4_7.next();
                    if (var8_5 || var8_5) continue block61;
                    var6_9 = (dx$AnimatedEffectRow)var5_8.getValue();
                    if (var8_5 || var8_5) continue block61;
                    if (var3_6.contains(var5_8.getKey())) {
                        if (var8_5) continue block61;
                        v0 = 1.0f;
                        if (var10_3) {
                            throw null;
                        }
                    } else {
                        if (var8_5 || var8_5) continue block61;
                        v0 = var7_10 = 0.0f;
                    }
                    if (var8_5 || var8_5) continue block61;
                    var6_9.progress += (var7_10 - var6_9.progress) * var2_2;
                    if (var8_5 || var8_5) continue block61;
                    if (Math.abs(var7_10 - var6_9.progress) < dx.cgpz("chna", cgqj(int ), (int)429)) {
                        if (var8_5) continue block61;
                        var6_9.progress = var7_10;
                        if (var8_5) continue block61;
                    }
                    if (var8_5 || var8_5) continue block61;
                } while (!var10_3);
                throw null;
lbl73:
                // 1 sources

                if (var8_5 || var8_5) continue block61;
                this.animatedRows.entrySet().removeIf((Predicate<Map.Entry>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$updateRows$5(java.util.Set java.util.Map$Entry ), (Ljava/util/Map$Entry;)Z)(var3_6));
                if (var8_5 || var8_5) continue block61;
                this.animatedRowBuffer.clear();
                if (var8_5 || var8_5) continue block61;
                this.animatedRowBuffer.addAll(this.animatedRows.values());
                if (!var8_5 && !var8_5) ** break;
                continue block61;
                return this.animatedRowBuffer;
lbl84:
                // 2 sources

                case 0: {
                    var9_4 /* !! */  = (int)dx.cgpz("chng", cgpw(int ), (int)430);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl180
                }
                case 1: {
                    var9_4 /* !! */  = (int)dx.cgpz("chnk", cgpw(int ), (int)431);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl281
                }
lbl94:
                // 2 sources

                case 2: {
                    var9_4 /* !! */  = (int)dx.cgpz("chnl", cgpw(int ), (int)432);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl311
                }
lbl99:
                // 2 sources

                case 3: {
                    var9_4 /* !! */  = (int)dx.cgpz("chnm", cgpw(int ), (int)433);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl149
                }
                case 4: {
                    var9_4 /* !! */  = (int)dx.cgpz("chnt", cgpw(int ), (int)434);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl124
                }
                case 5: {
                    var9_4 /* !! */  = (int)dx.cgpz("chnu", cgpw(int ), (int)435);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl149
                }
lbl114:
                // 3 sources

                case 6: {
                    var9_4 /* !! */  = (int)dx.cgpz("chnv", cgpw(int ), (int)436);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl251
                }
lbl119:
                // 2 sources

                case 7: {
                    var9_4 /* !! */  = (int)dx.cgpz("chnw", cgpw(int ), (int)437);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl290
                }
lbl124:
                // 3 sources

                case 8: {
                    var9_4 /* !! */  = (int)dx.cgpz("chny", cgpw(int ), (int)438);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl281
                }
lbl129:
                // 2 sources

                case 9: {
                    var9_4 /* !! */  = (int)dx.cgpz("choa", cgpw(int ), (int)439);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl319
                }
                case 10: {
                    var9_4 /* !! */  = (int)dx.cgpz("choc", cgpw(int ), (int)440);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl175
                }
                case 11: {
                    var9_4 /* !! */  = (int)dx.cgpz("chog", cgpw(int ), (int)441);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl218
                }
lbl144:
                // 4 sources

                case 12: {
                    var9_4 /* !! */  = (int)dx.cgpz("choi", cgpw(int ), (int)442);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl203
                }
lbl149:
                // 4 sources

                case 13: {
                    var9_4 /* !! */  = (int)dx.cgpz("choj", cgpw(int ), (int)443);
                    if (var10_3) {
                        throw null;
                    }
                }
                case 14: {
                    var9_4 /* !! */  = (int)dx.cgpz("chok", cgpw(int ), (int)444);
                    if (!var10_3) ** GOTO lbl144
                    throw null;
                }
                case 15: {
                    var9_4 /* !! */  = (int)dx.cgpz("chon", cgpw(int ), (int)445);
                    if (!var10_3) break block61;
                    throw null;
                }
lbl161:
                // 3 sources

                case 16: {
                    var9_4 /* !! */  = (int)dx.cgpz("chop", cgpw(int ), (int)446);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl208
                }
lbl166:
                // 2 sources

                case 17: {
                    var9_4 /* !! */  = (int)dx.cgpz("chor", cgpw(int ), (int)447);
                    if (!var10_3) ** GOTO lbl114
                    throw null;
                }
lbl170:
                // 2 sources

                case 18: {
                    var9_4 /* !! */  = (int)dx.cgpz("choz", cgpw(int ), (int)448);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl233
                }
lbl175:
                // 2 sources

                case 19: {
                    var9_4 /* !! */  = (int)dx.cgpz("chpa", cgpw(int ), (int)449);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl208
                }
lbl180:
                // 4 sources

                case 20: {
                    var9_4 /* !! */  = (int)dx.cgpz("chpb", cgpw(int ), (int)450);
                    if (!var10_3) ** GOTO lbl114
                    throw null;
                }
                case 21: {
                    var9_4 /* !! */  = (int)dx.cgpz("chpd", cgpw(int ), (int)451);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl218
                }
                case 22: {
                    var9_4 /* !! */  = (int)dx.cgpz("chpf", cgpw(int ), (int)452);
                    if (!var10_3) ** GOTO lbl161
                    throw null;
                }
                case 23: {
                    var9_4 /* !! */  = (int)dx.cgpz("chpi", cgpw(int ), (int)453);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl339
                }
                case 24: {
                    var9_4 /* !! */  = (int)dx.cgpz("chpj", cgpw(int ), (int)454);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl331
                }
lbl203:
                // 2 sources

                case 25: {
                    var9_4 /* !! */  = (int)dx.cgpz("chpn", cgpw(int ), (int)455);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl327
                }
lbl208:
                // 3 sources

                case 26: {
                    var9_4 /* !! */  = (int)dx.cgpz("chpq", cgpw(int ), (int)456);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl298
                }
                case 27: {
                    var9_4 /* !! */  = (int)dx.cgpz("chps", cgpw(int ), (int)457);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl277
                }
lbl218:
                // 3 sources

                case 28: {
                    var9_4 /* !! */  = (int)dx.cgpz("chpv", cgpw(int ), (int)458);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl273
                }
lbl223:
                // 2 sources

                case 29: {
                    var9_4 /* !! */  = (int)dx.cgpz("chpw", cgpw(int ), (int)459);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl247
                }
                case 30: {
                    var9_4 /* !! */  = (int)dx.cgpz("chpx", cgpw(int ), (int)460);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl281
                }
lbl233:
                // 3 sources

                case 31: {
                    var9_4 /* !! */  = (int)dx.cgpz("chpz", cgpw(int ), (int)461);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl339
                }
lbl238:
                // 2 sources

                case 32: {
                    var9_4 /* !! */  = (int)dx.cgpz("chqb", cgpw(int ), (int)462);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl303
                }
                case 33: {
                    var9_4 /* !! */  = (int)dx.cgpz("chqe", cgpw(int ), (int)463);
                    if (!var10_3) ** GOTO lbl223
                    throw null;
                }
lbl247:
                // 2 sources

                case 34: {
                    var9_4 /* !! */  = (int)dx.cgpz("chqg", cgpw(int ), (int)464);
                    if (!var10_3) ** GOTO lbl129
                    throw null;
                }
lbl251:
                // 3 sources

                case 35: {
                    var9_4 /* !! */  = (int)dx.cgpz("chqh", cgpw(int ), (int)465);
                    if (!var10_3) ** GOTO lbl161
                    throw null;
                }
                case 36: {
                    var9_4 /* !! */  = (int)dx.cgpz("chqi", cgpw(int ), (int)466);
                    if (!var10_3) ** GOTO lbl94
                    throw null;
                }
                case 37: {
                    var9_4 /* !! */  = (int)dx.cgpz("chqj", cgpw(int ), (int)467);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl339
                }
                case 38: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var9_4 /* !! */  = (int)dx.cgpz("chqm", cgpw(int ), (int)468);
                        if (!var10_3) ** GOTO lbl238
                        throw null;
                    }
                }
                case 39: {
                    var9_4 /* !! */  = (int)dx.cgpz("chqs", cgpw(int ), (int)469);
                    if (!var10_3) ** GOTO lbl166
                    throw null;
                }
lbl273:
                // 2 sources

                case 40: {
                    var9_4 /* !! */  = (int)dx.cgpz("chqu", cgpw(int ), (int)470);
                    if (!var10_3) ** GOTO lbl251
                    throw null;
                }
lbl277:
                // 2 sources

                case 41: {
                    var9_4 /* !! */  = (int)dx.cgpz("chqx", cgpw(int ), (int)471);
                    if (!var10_3) ** GOTO lbl99
                    throw null;
                }
lbl281:
                // 5 sources

                case 42: {
                    var9_4 /* !! */  = (int)dx.cgpz("chra", cgpw(int ), (int)472);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl331
                }
lbl286:
                // 2 sources

                case 43: {
                    var9_4 /* !! */  = (int)dx.cgpz("chrd", cgpw(int ), (int)473);
                    if (!var10_3) ** GOTO lbl149
                    throw null;
                }
lbl290:
                // 2 sources

                case 44: {
                    var9_4 /* !! */  = (int)dx.cgpz("chre", cgpw(int ), (int)474);
                    if (!var10_3) ** GOTO lbl233
                    throw null;
                }
                case 45: {
                    var9_4 /* !! */  = (int)dx.cgpz("chrf", cgpw(int ), (int)475);
                    if (!var10_3) break block61;
                    throw null;
                }
lbl298:
                // 2 sources

                case 46: {
                    var9_4 /* !! */  = (int)dx.cgpz("chrk", cgpw(int ), (int)476);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl319
                }
lbl303:
                // 2 sources

                case 47: {
                    var9_4 /* !! */  = (int)dx.cgpz("chrl", cgpw(int ), (int)477);
                    if (!var10_3) ** GOTO lbl144
                    throw null;
                }
                case 48: {
                    var9_4 /* !! */  = (int)dx.cgpz("chrn", cgpw(int ), (int)478);
                    if (!var10_3) ** GOTO lbl281
                    throw null;
                }
lbl311:
                // 2 sources

                case 49: {
                    var9_4 /* !! */  = (int)dx.cgpz("chrq", cgpw(int ), (int)479);
                    if (!var10_3) ** GOTO lbl119
                    throw null;
                }
                case 50: {
                    var9_4 /* !! */  = (int)dx.cgpz("chru", cgpw(int ), (int)480);
                    if (!var10_3) ** GOTO lbl84
                    throw null;
                }
lbl319:
                // 3 sources

                case 51: {
                    var9_4 /* !! */  = (int)dx.cgpz("chrw", cgpw(int ), (int)481);
                    if (!var10_3) ** GOTO lbl180
                    throw null;
                }
                case 52: {
                    var9_4 /* !! */  = (int)dx.cgpz("chrx", cgpw(int ), (int)482);
                    if (!var10_3) ** GOTO lbl286
                    throw null;
                }
lbl327:
                // 2 sources

                case 53: {
                    var9_4 /* !! */  = (int)dx.cgpz("chse", cgpw(int ), (int)483);
                    if (!var10_3) ** GOTO lbl170
                    throw null;
                }
lbl331:
                // 3 sources

                case 54: {
                    var9_4 /* !! */  = (int)dx.cgpz("chsg", cgpw(int ), (int)484);
                    if (!var10_3) ** GOTO lbl124
                    throw null;
                }
                case 55: {
                    var9_4 /* !! */  = (int)dx.cgpz("chsh", cgpw(int ), (int)485);
                    if (!var10_3) break block61;
                    throw null;
                }
lbl339:
                // 4 sources

                case 56: {
                    var9_4 /* !! */  = (int)dx.cgpz("chsj", cgpw(int ), (int)486);
                    if (!var10_3) ** GOTO lbl180
                    throw null;
                }
                case 57: {
                    var9_4 /* !! */  = (int)dx.cgpz("chsm", cgpw(int ), (int)487);
                    if (!var10_3) ** GOTO lbl144
                    throw null;
                }
                case 58: 
            }
        }
        var9_4 /* !! */  = (int)dx.cgpz("chsn", cgpw(int ), (int)488);
        ** while (!var10_3)
lbl350:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean lambda$drawDraggable$4(Set set, String string) {
        CallSite callSite;
        boolean bl2;
        block28: {
            Object object = fu;
            boolean bl3 = true;
            block11: while (true) {
                CallSite callSite2;
                if (!bl3 || (bl3 = false) || !true) {
                    object = callSite2 - dx.cgpz("cixa", cgre(int ), (int)238);
                }
                switch ((int)object) {
                    case -66295922: {
                        callSite2 = dx.cgpz("cixb", cgre(int ), (int)239);
                        continue block11;
                    }
                    case 1117133235: {
                        break block11;
                    }
                    case 1294986448: {
                        callSite2 = dx.cgpz("cixc", cgre(int ), (int)240);
                        continue block11;
                    }
                    case 1453716262: {
                        callSite2 = dx.cgpz("cixd", cgre(int ), (int)241);
                        continue block11;
                    }
                }
                break;
            }
            boolean bl4 = c;
            Object object2 = fu;
            boolean bl5 = true;
            block12: while (true) {
                CallSite callSite3;
                if (!bl5 || (bl5 = false) || !true) {
                    object2 = callSite3 - dx.cgpz("cixe", cgre(int ), (int)242);
                }
                switch ((int)object2) {
                    case -1131580627: {
                        callSite3 = dx.cgpz("cixf", cgre(int ), (int)243);
                        continue block12;
                    }
                    case -1117740734: {
                        callSite3 = dx.cgpz("cixg", cgre(int ), (int)244);
                        continue block12;
                    }
                    case 1117133235: {
                        break block12;
                    }
                }
                break;
            }
            int n2 = b;
            while (true) {
                long l2;
                Object object3;
                if ((object3 = (l2 = fu - dx.cgpz("cixh", cgre(int ), (int)245)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (object3 == dx.cgpz("cixi", cgpw(int ), (int)848)) {
                    bl2 = a;
                    if (bl4) {
                        throw null;
                    }
                    break;
                }
                object3 = dx.cgpz("cixj", cgpw(int ), (int)849);
            }
            if (bl2 || bl2) return (boolean)dx.cgpz("cixk", cgpw(int ), (int)850);
            while (true) {
                long l3;
                Object object4;
                if ((object4 = (l3 = fu - dx.cgpz("cixl", cgre(int ), (int)246)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (object4 == dx.cgpz("cixm", cgpw(int ), (int)851)) {
                    if (!set.contains(string)) {
                        break;
                    }
                    break block28;
                }
                object4 = dx.cgpz("cixn", cgpw(int ), (int)852);
            }
            if (bl2) return (boolean)dx.cgpz("cixk", cgpw(int ), (int)850);
            callSite = dx.cgpz("cixo", cgpw(int ), (int)853);
            if (!bl4) return (boolean)callSite;
            throw null;
        }
        if (bl2 || bl2) {
            return (boolean)dx.cgpz("cixk", cgpw(int ), (int)850);
        }
        callSite = dx.cgpz("cixp", cgpw(int ), (int)854);
        return (boolean)callSite;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void drawDraggable(class_332 var1_1, int var2_2) {
        block391: {
            block398: {
                block397: {
                    block396: {
                        block395: {
                            block394: {
                                block393: {
                                    block392: {
                                        var53_3 = dx.c;
                                        var52_4 /* !! */  = dx.b;
                                        var51_5 = dx.a;
                                        if (var53_3) {
                                            throw null;
lbl6:
                                            // 105 sources

                                            return;
                                        }
                                        if (var51_5 || var51_5) ** GOTO lbl6
                                        kq.hasFonts();
                                        if (var51_5 || var51_5) ** GOTO lbl6
                                        if (kv.INTER_SEMIBOLD == null) break block392;
                                        if (var51_5 || var51_5) ** GOTO lbl6
                                        v0 = kv.INTER_SEMIBOLD;
                                        if (var53_3) {
                                            throw null;
                                        }
                                        break block393;
                                    }
                                    if (var51_5 || var51_5) ** GOTO lbl6
                                    v0 = var3_6 = kv.getDefault();
                                }
                                if (var51_5 || var51_5) ** GOTO lbl6
                                if (kv.INTER_SEMIBOLD == null) break block394;
                                if (var51_5 || var51_5) ** GOTO lbl6
                                v1 = kv.INTER_SEMIBOLD;
                                if (var53_3) {
                                    throw null;
                                }
                                break block395;
                            }
                            if (var51_5 || var51_5) ** GOTO lbl6
                            v1 = var4_7 = var3_6;
                        }
                        if (var51_5 || var51_5) ** GOTO lbl6
                        if (kv.PHOBIA_NEW == null) break block396;
                        if (var51_5 || var51_5) ** GOTO lbl6
                        v2 = kv.PHOBIA_NEW;
                        if (var53_3) {
                            throw null;
                        }
                        break block397;
                    }
                    if (var51_5 || var51_5) ** GOTO lbl6
                    v2 = var5_8 = kv.getDefault();
                }
                if (var51_5 || var51_5) ** GOTO lbl6
                var6_9 = this.collectRows(this.mc.field_1755 instanceof class_408);
                if (var51_5 || var51_5) ** GOTO lbl6
                var7_10 = System.nanoTime();
                if (var51_5 || var51_5) ** GOTO lbl6
                var9_11 = Math.min((float)dx.cgpz("cgtm", cgqj(int ), (int)54), (float)(var7_10 - this.lastAnimationFrame) / dx.cgpz("cgtn", cgqj(int ), (int)55));
                if (var51_5 || var51_5) ** GOTO lbl6
                this.lastAnimationFrame = var7_10;
                if (var51_5 || var51_5) ** GOTO lbl6
                var10_12 = 1.0f - (float)Math.exp((double)(dx.cgpz("cgto", cgqj(int ), (int)56) * var9_11));
                if (var51_5 || var51_5) ** GOTO lbl6
                var11_13 = this.updateRows(var6_9, var10_12);
                if (var51_5 || var51_5) ** GOTO lbl6
                if (!var11_13.isEmpty()) break block398;
                if (var51_5) ** GOTO lbl6
                return;
            }
            if (var51_5 || var51_5) ** GOTO lbl6
            var12_14 = System.currentTimeMillis();
            if (var51_5 || var51_5) ** GOTO lbl6
            var14_15 = this.activeIdBuffer;
            if (var51_5 || var51_5) ** GOTO lbl6
            var14_15.clear();
            if (var51_5 || var51_5) ** GOTO lbl6
            var15_16 /* !! */  = dx.cgpz("cgtp", cgqj(int ), (int)57);
            if (var51_5 || var51_5) ** GOTO lbl6
            var16_17 /* !! */  = dx.cgpz("cgtq", cgqj(int ), (int)58);
            if (var51_5 || var51_5) ** GOTO lbl6
            var17_18 = 0.0f;
            if (var51_5 || var51_5) ** GOTO lbl6
            var18_19 = var11_13.iterator();
            if (var51_5) ** GOTO lbl6
            do {
                if (var51_5 || var51_5) ** GOTO lbl6
                if (!var18_19.hasNext()) break block391;
                if (var51_5) ** GOTO lbl6
                var19_21 = var18_19.next();
                if (var51_5 || var51_5) ** GOTO lbl6
                var20_23 = var19_21.row;
                if (var51_5 || var51_5) ** GOTO lbl6
                var14_15.add(var20_23.id());
                if (var51_5 || var51_5) ** GOTO lbl6
                var21_25 = this.timers.computeIfAbsent(var20_23.id(), (Function<String, dx$RollingText>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$drawDraggable$0(java.lang.String ), (Ljava/lang/String;)Lruhack/phobia/dx$RollingText;)());
                if (var51_5 || var51_5) ** GOTO lbl6
                var21_25.update(this.displayedTime(var20_23.id(), var20_23.duration(), var12_14), var12_14);
                if (var51_5 || var51_5) ** GOTO lbl6
                var22_27 /* !! */  = kq.width(var3_6, var20_23.name(), (float)dx.cgpz("cgtr", cgqj(int ), (int)59));
                if (var51_5 || var51_5) ** GOTO lbl6
                var23_28 /* !! */  = kq.width(var4_7, dx.levelText(var20_23.level()), (float)dx.cgpz("cgts", cgqj(int ), (int)60));
                if (var51_5 || var51_5) ** GOTO lbl6
                var15_16 /* !! */  = (CallSite)Math.max((float)var15_16 /* !! */ , (float)(dx.cgpz("cgtt", cgqj(int ), (int)61) + var22_27 /* !! */  + dx.cgpz("cgtu", cgqj(int ), (int)62) + var23_28 /* !! */  + dx.cgpz("cgtv", cgqj(int ), (int)63)));
                if (var51_5 || var51_5) ** GOTO lbl6
                var16_17 /* !! */  = (CallSite)Math.max((float)var16_17 /* !! */ , (float)(dx.cgpz("cgtw", cgqj(int ), (int)64) + kq.width(var4_7, var21_25.value(), (float)dx.cgpz("cgtx", cgqj(int ), (int)65)) + dx.cgpz("cgty", cgqj(int ), (int)66) + dx.cgpz("cgtz", cgqj(int ), (int)67) + dx.cgpz("cgua", cgqj(int ), (int)68)));
                if (var51_5 || var51_5) ** GOTO lbl6
                var17_18 += dx.cgpz("cgub", cgqj(int ), (int)69) * var19_21.progress;
                if (var51_5 || var51_5) ** GOTO lbl6
            } while (!var53_3);
            throw null;
        }
        if (var51_5 || var51_5) ** GOTO lbl6
        this.timers.keySet().removeIf((Predicate<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$drawDraggable$1(java.util.Set java.lang.String ), (Ljava/lang/String;)Z)(var14_15));
        if (var51_5 || var51_5) ** GOTO lbl6
        this.clocks.keySet().removeIf((Predicate<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$drawDraggable$2(java.util.Set java.lang.String ), (Ljava/lang/String;)Z)(var14_15));
        if (var51_5 || var51_5) ** GOTO lbl6
        this.observedDurations.keySet().removeIf((Predicate<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$drawDraggable$3(java.util.Set java.lang.String ), (Ljava/lang/String;)Z)(var14_15));
        if (var51_5 || var51_5) ** GOTO lbl6
        this.circleProgress.keySet().removeIf((Predicate<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$drawDraggable$4(java.util.Set java.lang.String ), (Ljava/lang/String;)Z)(var14_15));
        if (var51_5 || var51_5) ** GOTO lbl6
        var18_20 = dx.cgpz("cguc", cgqj(int ), (int)70) + var17_18;
        if (var51_5 || var51_5) ** GOTO lbl6
        this.animatedLeftWidth = dx.animateDimension(this.animatedLeftWidth, (float)var15_16 /* !! */ , var10_12);
        if (var51_5 || var51_5) ** GOTO lbl6
        this.animatedTimerWidth = dx.animateDimension(this.animatedTimerWidth, (float)var16_17 /* !! */ , var10_12);
        if (var51_5 || var51_5) ** GOTO lbl6
        this.animatedListHeight = dx.animateDimension(this.animatedListHeight, (float)var18_20, var10_12);
        if (var51_5 || var51_5) ** GOTO lbl6
        var19_22 = this.animatedLeftWidth;
        if (var51_5 || var51_5) ** GOTO lbl6
        var20_24 = this.animatedTimerWidth;
        if (var51_5 || var51_5) ** GOTO lbl6
        var21_26 = this.animatedListHeight;
        if (var51_5 || var51_5) ** GOTO lbl6
        var22_27 /* !! */  = (float)(dx.cgpz("cgud", cgqj(int ), (int)71) + var21_26);
        if (var51_5 || var51_5) ** GOTO lbl6
        var23_28 /* !! */  = (float)(dx.cgpz("cgue", cgqj(int ), (int)72) + var19_22 + dx.cgpz("cguf", cgqj(int ), (int)73) + var20_24);
        if (var51_5 || var51_5) ** GOTO lbl6
        var24_29 = dx.cgpz("cgug", cgqj(int ), (int)74) + var22_27 /* !! */ ;
        if (var51_5 || var51_5) ** GOTO lbl6
        this.setWidth((int)Math.ceil(var23_28 /* !! */ ));
        if (var51_5 || var51_5) ** GOTO lbl6
        this.setHeight((int)Math.ceil((double)var24_29));
        if (var51_5 || var51_5) ** GOTO lbl6
        var25_30 = (float)var2_2 / dx.cgpz("cguh", cgqj(int ), (int)75);
        if (var51_5 || var51_5) ** GOTO lbl6
        var26_31 = this.getX();
        if (var51_5 || var51_5) ** GOTO lbl6
        var27_32 = this.getY();
        if (var51_5 || var51_5) ** GOTO lbl6
        dx.drawPanel(var1_1, var26_31, var27_32, var23_28 /* !! */ , (float)var24_29, var25_30);
        if (var51_5 || var51_5) ** GOTO lbl6
        var28_33 = var26_31 + dx.cgpz("cgui", cgqj(int ), (int)76);
        if (var51_5 || var51_5) ** GOTO lbl6
        var29_34 = var27_32 + dx.cgpz("cguj", cgqj(int ), (int)77);
        if (var51_5 || var51_5) ** GOTO lbl6
        var30_35 = var29_34 + dx.cgpz("cguk", cgqj(int ), (int)78) + dx.cgpz("cgul", cgqj(int ), (int)79);
        if (var51_5 || var51_5) ** GOTO lbl6
        var31_36 = var28_33 + var19_22 + dx.cgpz("cgum", cgqj(int ), (int)80);
        if (var51_5 || var51_5) ** GOTO lbl6
        dx.drawContentBackground(var1_1, var28_33, var29_34, var19_22, (float)dx.cgpz("cgun", cgqj(int ), (int)81), var25_30);
        if (var51_5 || var51_5) ** GOTO lbl6
        dx.drawContentBackground(var1_1, var28_33, var30_35, var19_22, var21_26, var25_30);
        if (var51_5 || var51_5) ** GOTO lbl6
        dx.drawContentBackground(var1_1, var31_36, var29_34, var20_24, var22_27 /* !! */ , var25_30);
        if (var51_5 || var51_5) ** GOTO lbl6
        var32_37 = var29_34 + dx.cgpz("cguo", cgqj(int ), (int)82);
        if (var51_5 || var51_5) ** GOTO lbl6
        kq.text(var1_1, var3_6, "Effects", var28_33 + dx.cgpz("cgup", cgqj(int ), (int)83), dx.centeredTextY(var3_6, (float)dx.cgpz("cguq", cgqj(int ), (int)84), var32_37), (float)dx.cgpz("cgur", cgqj(int ), (int)85), nd.multAlpha(dx.TEXT_COLOR, var25_30), (boolean)dx.cgpz("cgus", cgpw(int ), (int)86));
        if (var51_5 || var51_5) ** GOTO lbl6
        ki.glow(var1_1, var31_36 + var20_24 * dx.cgpz("cgut", cgqj(int ), (int)87), var32_37, (float)dx.cgpz("cguu", cgqj(int ), (int)88), nd.multAlpha(dz.color((int)dx.cgpz("cguv", cgpw(int ), (int)89)), var25_30), (boolean)dx.cgpz("cguw", cgpw(int ), (int)90));
        if (var51_5 || var51_5) ** GOTO lbl6
        dx.drawIcon(var1_1, var5_8, "B", var31_36 + (var20_24 - dx.cgpz("cgux", cgqj(int ), (int)91)) * dx.cgpz("cguy", cgqj(int ), (int)92), var32_37, (float)dx.cgpz("cguz", cgqj(int ), (int)93), nd.multAlpha(dz.color((int)dx.cgpz("cgva", cgpw(int ), (int)94)), var25_30));
        if (var51_5 || var51_5) ** GOTO lbl6
        var33_38 = var30_35 + dx.cgpz("cgvb", cgqj(int ), (int)95);
        if (var51_5) ** GOTO lbl6
        if (var52_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var52_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var51_5) ** GOTO lbl6
                var34_39 = var11_13.iterator();
                if (var51_5) ** GOTO lbl6
                do {
                    if (var51_5 || var51_5) ** GOTO lbl6
                    if (!var34_39.hasNext()) ** GOTO lbl246
                    if (var51_5) ** GOTO lbl6
                    var35_40 = var34_39.next();
                    if (var51_5 || var51_5) ** GOTO lbl6
                    var36_41 = var35_40.row;
                    if (var51_5 || var51_5) ** GOTO lbl6
                    var37_42 = dx.cgpz("cgvc", cgqj(int ), (int)96) * var35_40.progress;
                    if (var51_5 || var51_5) ** GOTO lbl6
                    var38_43 = var33_38 + var37_42 * dx.cgpz("cgvd", cgqj(int ), (int)97);
                    if (var51_5 || var51_5) ** GOTO lbl6
                    var33_38 += var37_42;
                    if (var51_5 || var51_5) ** GOTO lbl6
                    var39_44 = var25_30 * var35_40.progress;
                    if (var51_5 || var51_5) ** GOTO lbl6
                    ki.image(var1_1, var28_33 + dx.cgpz("cgve", cgqj(int ), (int)98), var38_43 - dx.cgpz("cgvf", cgqj(int ), (int)99), (float)dx.cgpz("cgvg", cgqj(int ), (int)100), var36_41.icon(), nd.multAlpha((int)dx.cgpz("cgvh", cgpw(int ), (int)101), var39_44), 0.0f, (boolean)dx.cgpz("cgvi", cgpw(int ), (int)102));
                    if (var51_5 || var51_5) ** GOTO lbl6
                    if (!var36_41.harmful()) ** GOTO lbl203
                    if (var51_5) ** GOTO lbl6
                    v3 = dx.BAD_COLOR;
                    if (var53_3) {
                        throw null;
                    }
                    ** GOTO lbl205
lbl203:
                    // 1 sources

                    if (var51_5 || var51_5) ** GOTO lbl6
                    v3 = var40_45 = dx.TEXT_COLOR;
lbl205:
                    // 2 sources

                    if (var51_5 || var51_5) ** GOTO lbl6
                    if (!var36_41.harmful()) ** GOTO lbl212
                    if (var51_5) ** GOTO lbl6
                    v4 = nd.multAlpha(dx.BAD_COLOR, (float)dx.cgpz("cgvj", cgqj(int ), (int)103));
                    if (var53_3) {
                        throw null;
                    }
                    ** GOTO lbl214
lbl212:
                    // 1 sources

                    if (var51_5 || var51_5) ** GOTO lbl6
                    v4 = var41_46 = dx.LEVEL_COLOR;
lbl214:
                    // 2 sources

                    if (var51_5 || var51_5) ** GOTO lbl6
                    var42_47 = var28_33 + dx.cgpz("cgvk", cgqj(int ), (int)104);
                    if (var51_5 || var51_5) ** GOTO lbl6
                    kq.text(var1_1, var3_6, var36_41.name(), var42_47, dx.centeredTextY(var3_6, (float)dx.cgpz("cgvl", cgqj(int ), (int)105), var38_43), (float)dx.cgpz("cgvm", cgqj(int ), (int)106), nd.multAlpha(var40_45, var39_44), (boolean)dx.cgpz("cgvn", cgpw(int ), (int)107));
                    if (var51_5 || var51_5) ** GOTO lbl6
                    var43_48 = var42_47 + kq.width(var3_6, var36_41.name(), (float)dx.cgpz("cgvo", cgqj(int ), (int)108)) + dx.cgpz("cgvp", cgqj(int ), (int)109);
                    if (var51_5 || var51_5) ** GOTO lbl6
                    kq.text(var1_1, var4_7, dx.levelText(var36_41.level()), var43_48, dx.centeredTextY(var4_7, (float)dx.cgpz("cgvq", cgqj(int ), (int)110), var38_43), (float)dx.cgpz("cgvr", cgqj(int ), (int)111), nd.multAlpha(var41_46, var39_44), (boolean)dx.cgpz("cgvs", cgpw(int ), (int)112));
                    if (var51_5 || var51_5) ** GOTO lbl6
                    var44_49 = this.timers.get(var36_41.id());
                    if (var51_5 || var51_5) ** GOTO lbl6
                    var45_50 = var31_36 + dx.cgpz("cgvt", cgqj(int ), (int)113);
                    if (var51_5 || var51_5) ** GOTO lbl6
                    var46_51 = dx.centeredTextY(var4_7, (float)dx.cgpz("cgvu", cgqj(int ), (int)114), var38_43);
                    if (var51_5 || var51_5) ** GOTO lbl6
                    dx.drawRollingText(var1_1, var4_7, var44_49, var45_50, var46_51, (float)dx.cgpz("cgvv", cgqj(int ), (int)115), nd.multAlpha(dz.color((int)dx.cgpz("cgvw", cgpw(int ), (int)116)), var39_44), var38_43 - dx.cgpz("cgvx", cgqj(int ), (int)117), (float)dx.cgpz("cgvy", cgqj(int ), (int)118), var12_14);
                    if (var51_5 || var51_5) ** GOTO lbl6
                    var47_52 = var31_36 + var20_24 - dx.cgpz("cgvz", cgqj(int ), (int)119) - dx.cgpz("cgwa", cgqj(int ), (int)120);
                    if (var51_5 || var51_5) ** GOTO lbl6
                    var48_53 = this.animatedCircleProgress(var36_41, var10_12);
                    if (var51_5 || var51_5) ** GOTO lbl6
                    var49_54 = nd.interpolateColor(dz.color((int)dx.cgpz("cgwb", cgpw(int ), (int)121)), dx.BAD_COLOR, 1.0f - var48_53);
                    if (var51_5 || var51_5) ** GOTO lbl6
                    var50_55 = var38_43 - dx.cgpz("cgwc", cgqj(int ), (int)122);
                    if (var51_5 || var51_5) ** GOTO lbl6
                    if (!(var48_53 > dx.cgpz("cgwd", cgqj(int ), (int)123))) ** GOTO lbl243
                    if (var51_5 || var51_5) ** GOTO lbl6
                    ki.arc(var1_1, var47_52, var50_55, (float)dx.cgpz("cgwe", cgqj(int ), (int)124), (float)dx.cgpz("cgwf", cgqj(int ), (int)125), (float)(dx.cgpz("cgwg", cgqj(int ), (int)126) * var48_53), (float)dx.cgpz("cgwh", cgqj(int ), (int)127), nd.multAlpha(var49_54, var39_44), (boolean)dx.cgpz("cgwi", cgpw(int ), (int)128));
                    if (var51_5) ** GOTO lbl6
lbl243:
                    // 2 sources

                    if (var51_5 || var51_5) ** GOTO lbl6
                } while (!var53_3);
                throw null;
lbl246:
                // 1 sources

                if (var51_5 || var51_5) ** GOTO lbl6
                this.drawPanelOutline(var1_1, var26_31, var27_32, var23_28 /* !! */ , (float)var24_29, (float)dx.cgpz("cgwj", cgqj(int ), (int)129), (float)dx.cgpz("cgwk", cgqj(int ), (int)130), dx.BORDER_COLOR, var25_30);
                if (!var51_5 && !var51_5) ** break;
                ** continue;
                return;
            }
lbl251:
            // 3 sources

            case 0: {
                var52_4 /* !! */  = (int)dx.cgpz("cgwl", cgpw(int ), (int)131);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl455
            }
lbl256:
            // 2 sources

            case 1: {
                var52_4 /* !! */  = (int)dx.cgpz("cgwm", cgpw(int ), (int)132);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl730
            }
            case 2: {
                var52_4 /* !! */  = (int)dx.cgpz("cgwn", cgpw(int ), (int)133);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl695
            }
lbl266:
            // 2 sources

            case 3: {
                var52_4 /* !! */  = (int)dx.cgpz("cgwo", cgpw(int ), (int)134);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl644
            }
            case 4: {
                var52_4 /* !! */  = (int)dx.cgpz("cgwp", cgpw(int ), (int)135);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl311
            }
            case 5: {
                var52_4 /* !! */  = (int)dx.cgpz("cgwq", cgpw(int ), (int)136);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl935
            }
lbl281:
            // 2 sources

            case 6: {
                var52_4 /* !! */  = (int)dx.cgpz("cgwr", cgpw(int ), (int)137);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl690
            }
lbl286:
            // 2 sources

            case 7: {
                var52_4 /* !! */  = (int)dx.cgpz("cgws", cgpw(int ), (int)138);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl399
            }
lbl291:
            // 3 sources

            case 8: {
                var52_4 /* !! */  = (int)dx.cgpz("cgwt", cgpw(int ), (int)139);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl648
            }
lbl296:
            // 4 sources

            case 9: {
                var52_4 /* !! */  = (int)dx.cgpz("cgwu", cgpw(int ), (int)140);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl902
            }
lbl301:
            // 3 sources

            case 10: {
                do {
                    var52_4 /* !! */  = (int)dx.cgpz("cgwv", cgpw(int ), (int)141);
                } while (!var53_3);
                throw null;
            }
lbl306:
            // 2 sources

            case 11: {
                var52_4 /* !! */  = (int)dx.cgpz("cgww", cgpw(int ), (int)142);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl370
            }
lbl311:
            // 3 sources

            case 12: {
                var52_4 /* !! */  = (int)dx.cgpz("cgwx", cgpw(int ), (int)143);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl658
            }
            case 13: {
                var52_4 /* !! */  = (int)dx.cgpz("cgwy", cgpw(int ), (int)144);
                if (!var53_3) ** GOTO lbl301
                throw null;
            }
            case 14: {
                var52_4 /* !! */  = (int)dx.cgpz("cgwz", cgpw(int ), (int)145);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1122
            }
            case 15: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxa", cgpw(int ), (int)146);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl569
            }
            case 16: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxb", cgpw(int ), (int)147);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1126
            }
lbl335:
            // 2 sources

            case 17: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxc", cgpw(int ), (int)148);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1109
            }
lbl340:
            // 2 sources

            case 18: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxd", cgpw(int ), (int)149);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl958
            }
            case 19: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxe", cgpw(int ), (int)150);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1126
            }
lbl350:
            // 2 sources

            case 20: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxf", cgpw(int ), (int)151);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1068
            }
lbl355:
            // 2 sources

            case 21: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxg", cgpw(int ), (int)152);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1154
            }
lbl360:
            // 2 sources

            case 22: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxh", cgpw(int ), (int)153);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl596
            }
            case 23: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxi", cgpw(int ), (int)154);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl565
            }
lbl370:
            // 3 sources

            case 24: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxj", cgpw(int ), (int)155);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl695
            }
lbl375:
            // 3 sources

            case 25: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxk", cgpw(int ), (int)156);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl686
            }
lbl380:
            // 2 sources

            case 26: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxl", cgpw(int ), (int)157);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1036
            }
            case 27: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxm", cgpw(int ), (int)158);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl677
            }
lbl390:
            // 3 sources

            case 28: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxn", cgpw(int ), (int)159);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl592
            }
            case 29: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxo", cgpw(int ), (int)160);
                if (!var53_3) ** GOTO lbl350
                throw null;
            }
lbl399:
            // 3 sources

            case 30: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxp", cgpw(int ), (int)161);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl881
            }
            case 31: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxq", cgpw(int ), (int)162);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl709
            }
            case 32: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxr", cgpw(int ), (int)163);
                if (!var53_3) ** GOTO lbl355
                throw null;
            }
lbl413:
            // 3 sources

            case 33: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxs", cgpw(int ), (int)164);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl923
            }
lbl418:
            // 2 sources

            case 34: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxt", cgpw(int ), (int)165);
                if (!var53_3) break;
                throw null;
            }
            case 35: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxu", cgpw(int ), (int)166);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl973
            }
lbl427:
            // 2 sources

            case 36: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxv", cgpw(int ), (int)167);
                if (!var53_3) ** GOTO lbl281
                throw null;
            }
            case 37: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxw", cgpw(int ), (int)168);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1036
            }
lbl436:
            // 3 sources

            case 38: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxx", cgpw(int ), (int)169);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl639
            }
lbl441:
            // 3 sources

            case 39: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxy", cgpw(int ), (int)170);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl752
            }
lbl446:
            // 2 sources

            case 40: {
                var52_4 /* !! */  = (int)dx.cgpz("cgxz", cgpw(int ), (int)171);
                if (!var53_3) ** GOTO lbl390
                throw null;
            }
lbl450:
            // 3 sources

            case 41: {
                var52_4 /* !! */  = (int)dx.cgpz("cgya", cgpw(int ), (int)172);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl910
            }
lbl455:
            // 4 sources

            case 42: {
                var52_4 /* !! */  = (int)dx.cgpz("cgyb", cgpw(int ), (int)173);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl686
            }
            case 43: {
                var52_4 /* !! */  = (int)dx.cgpz("cgyc", cgpw(int ), (int)174);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl991
            }
lbl465:
            // 3 sources

            case 44: {
                var52_4 /* !! */  = (int)dx.cgpz("cgyd", cgpw(int ), (int)175);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl894
            }
lbl470:
            // 3 sources

            case 45: {
                var52_4 /* !! */  = (int)dx.cgpz("cgye", cgpw(int ), (int)176);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1089
            }
            case 46: {
                var52_4 /* !! */  = (int)dx.cgpz("cgyf", cgpw(int ), (int)177);
                if (!var53_3) ** GOTO lbl399
                throw null;
            }
            case 47: {
                var52_4 /* !! */  = (int)dx.cgpz("cgyg", cgpw(int ), (int)178);
                if (!var53_3) ** GOTO lbl455
                throw null;
            }
            case 48: {
                var52_4 /* !! */  = (int)dx.cgpz("cgyh", cgpw(int ), (int)179);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl915
            }
lbl488:
            // 2 sources

            case 49: {
                var52_4 /* !! */  = (int)dx.cgpz("cgyi", cgpw(int ), (int)180);
                if (!var53_3) ** GOTO lbl291
                throw null;
            }
lbl492:
            // 3 sources

            case 50: {
                var52_4 /* !! */  = (int)dx.cgpz("cgyj", cgpw(int ), (int)181);
                if (!var53_3) ** GOTO lbl335
                throw null;
            }
lbl496:
            // 3 sources

            case 51: {
                var52_4 /* !! */  = (int)dx.cgpz("cgyk", cgpw(int ), (int)182);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1097
            }
            case 52: {
                var52_4 /* !! */  = (int)dx.cgpz("cgyl", cgpw(int ), (int)183);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1072
            }
            case 53: {
                var52_4 /* !! */  = (int)dx.cgpz("cgym", cgpw(int ), (int)184);
                if (!var53_3) ** GOTO lbl291
                throw null;
            }
            case 54: {
                var52_4 /* !! */  = (int)dx.cgpz("cgyn", cgpw(int ), (int)185);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl876
            }
lbl515:
            // 2 sources

            case 55: {
                var52_4 /* !! */  = (int)dx.cgpz("cgyo", cgpw(int ), (int)186);
                if (!var53_3) ** GOTO lbl488
                throw null;
            }
lbl519:
            // 5 sources

            case 56: {
                var52_4 /* !! */  = (int)dx.cgpz("cgyp", cgpw(int ), (int)187);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1068
            }
            case 57: {
                var52_4 /* !! */  = (int)dx.cgpz("cgyq", cgpw(int ), (int)188);
                if (!var53_3) ** GOTO lbl441
                throw null;
            }
lbl528:
            // 3 sources

            case 58: {
                var52_4 /* !! */  = (int)dx.cgpz("cgyr", cgpw(int ), (int)189);
                if (!var53_3) ** GOTO lbl496
                throw null;
            }
            case 59: {
                var52_4 /* !! */  = (int)dx.cgpz("cgys", cgpw(int ), (int)190);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1162
            }
lbl537:
            // 2 sources

            case 60: {
                var52_4 /* !! */  = (int)dx.cgpz("cgyt", cgpw(int ), (int)191);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1134
            }
lbl542:
            // 2 sources

            case 61: {
                var52_4 /* !! */  = (int)dx.cgpz("cgyu", cgpw(int ), (int)192);
                if (!var53_3) ** GOTO lbl427
                throw null;
            }
            case 62: {
                var52_4 /* !! */  = (int)dx.cgpz("cgyv", cgpw(int ), (int)193);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl775
            }
lbl551:
            // 3 sources

            case 63: {
                var52_4 /* !! */  = (int)dx.cgpz("cgyw", cgpw(int ), (int)194);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl898
            }
            case 64: {
                var52_4 /* !! */  = (int)dx.cgpz("cgyx", cgpw(int ), (int)195);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl855
            }
lbl561:
            // 2 sources

            case 65: {
                var52_4 /* !! */  = (int)dx.cgpz("cgyy", cgpw(int ), (int)196);
                if (!var53_3) ** GOTO lbl296
                throw null;
            }
lbl565:
            // 2 sources

            case 66: {
                var52_4 /* !! */  = (int)dx.cgpz("cgyz", cgpw(int ), (int)197);
                if (!var53_3) ** GOTO lbl296
                throw null;
            }
lbl569:
            // 2 sources

            case 67: {
                var52_4 /* !! */  = (int)dx.cgpz("cgza", cgpw(int ), (int)198);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1105
            }
lbl574:
            // 3 sources

            case 68: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzb", cgpw(int ), (int)199);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl761
            }
            case 69: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzc", cgpw(int ), (int)200);
                if (!var53_3) ** GOTO lbl286
                throw null;
            }
lbl583:
            // 3 sources

            case 70: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzd", cgpw(int ), (int)201);
                if (!var53_3) ** GOTO lbl551
                throw null;
            }
            case 71: {
                var52_4 /* !! */  = (int)dx.cgpz("cgze", cgpw(int ), (int)202);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1154
            }
lbl592:
            // 4 sources

            case 72: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzf", cgpw(int ), (int)203);
                if (!var53_3) ** GOTO lbl311
                throw null;
            }
lbl596:
            // 2 sources

            case 73: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzg", cgpw(int ), (int)204);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1158
            }
            case 74: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzh", cgpw(int ), (int)205);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1007
            }
            case 75: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzi", cgpw(int ), (int)206);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl915
            }
            case 76: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzj", cgpw(int ), (int)207);
                if (!var53_3) ** GOTO lbl455
                throw null;
            }
            case 77: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzk", cgpw(int ), (int)208);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl635
            }
lbl620:
            // 2 sources

            case 78: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzl", cgpw(int ), (int)209);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl833
            }
lbl625:
            // 2 sources

            case 79: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzm", cgpw(int ), (int)210);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl780
            }
            case 80: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzn", cgpw(int ), (int)211);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1109
            }
lbl635:
            // 2 sources

            case 81: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzo", cgpw(int ), (int)212);
                if (!var53_3) ** GOTO lbl441
                throw null;
            }
lbl639:
            // 3 sources

            case 82: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzp", cgpw(int ), (int)213);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl833
            }
lbl644:
            // 2 sources

            case 83: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzq", cgpw(int ), (int)214);
                if (!var53_3) ** GOTO lbl519
                throw null;
            }
lbl648:
            // 2 sources

            case 84: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzr", cgpw(int ), (int)215);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl927
            }
lbl653:
            // 2 sources

            case 85: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzs", cgpw(int ), (int)216);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1162
            }
lbl658:
            // 2 sources

            case 86: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzt", cgpw(int ), (int)217);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl718
            }
            case 87: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzu", cgpw(int ), (int)218);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl885
            }
lbl668:
            // 2 sources

            case 88: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzv", cgpw(int ), (int)219);
                if (!var53_3) ** GOTO lbl340
                throw null;
            }
lbl672:
            // 2 sources

            case 89: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzw", cgpw(int ), (int)220);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1154
            }
lbl677:
            // 2 sources

            case 90: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzx", cgpw(int ), (int)221);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl713
            }
            case 91: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzy", cgpw(int ), (int)222);
                if (!var53_3) ** GOTO lbl436
                throw null;
            }
lbl686:
            // 7 sources

            case 92: {
                var52_4 /* !! */  = (int)dx.cgpz("cgzz", cgpw(int ), (int)223);
                if (!var53_3) ** GOTO lbl390
                throw null;
            }
lbl690:
            // 2 sources

            case 93: {
                var52_4 /* !! */  = (int)dx.cgpz("chaa", cgpw(int ), (int)224);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1146
            }
lbl695:
            // 3 sources

            case 94: {
                var52_4 /* !! */  = (int)dx.cgpz("chab", cgpw(int ), (int)225);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl885
            }
lbl700:
            // 2 sources

            case 95: {
                var52_4 /* !! */  = (int)dx.cgpz("chac", cgpw(int ), (int)226);
                if (!var53_3) ** GOTO lbl251
                throw null;
            }
            case 96: {
                var52_4 /* !! */  = (int)dx.cgpz("chad", cgpw(int ), (int)227);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl867
            }
lbl709:
            // 3 sources

            case 97: {
                var52_4 /* !! */  = (int)dx.cgpz("chae", cgpw(int ), (int)228);
                if (!var53_3) ** GOTO lbl380
                throw null;
            }
lbl713:
            // 3 sources

            case 98: {
                var52_4 /* !! */  = (int)dx.cgpz("chaf", cgpw(int ), (int)229);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl806
            }
lbl718:
            // 3 sources

            case 99: {
                var52_4 /* !! */  = (int)dx.cgpz("chag", cgpw(int ), (int)230);
                if (!var53_3) ** GOTO lbl686
                throw null;
            }
            case 100: {
                var52_4 /* !! */  = (int)dx.cgpz("chah", cgpw(int ), (int)231);
                if (!var53_3) ** GOTO lbl672
                throw null;
            }
lbl726:
            // 2 sources

            case 101: {
                var52_4 /* !! */  = (int)dx.cgpz("chai", cgpw(int ), (int)232);
                if (!var53_3) break;
                throw null;
            }
lbl730:
            // 2 sources

            case 102: {
                var52_4 /* !! */  = (int)dx.cgpz("chaj", cgpw(int ), (int)233);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl915
            }
            case 103: {
                var52_4 /* !! */  = (int)dx.cgpz("chak", cgpw(int ), (int)234);
                if (!var53_3) ** GOTO lbl686
                throw null;
            }
            case 104: {
                var52_4 /* !! */  = (int)dx.cgpz("chal", cgpw(int ), (int)235);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl923
            }
lbl744:
            // 2 sources

            case 105: {
                var52_4 /* !! */  = (int)dx.cgpz("cham", cgpw(int ), (int)236);
                if (!var53_3) ** GOTO lbl686
                throw null;
            }
            case 106: {
                var52_4 /* !! */  = (int)dx.cgpz("chan", cgpw(int ), (int)237);
                if (!var53_3) ** GOTO lbl592
                throw null;
            }
lbl752:
            // 2 sources

            case 107: {
                var52_4 /* !! */  = (int)dx.cgpz("chao", cgpw(int ), (int)238);
                if (!var53_3) ** GOTO lbl470
                throw null;
            }
            case 108: {
                var52_4 /* !! */  = (int)dx.cgpz("chap", cgpw(int ), (int)239);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1052
            }
lbl761:
            // 2 sources

            case 109: {
                var52_4 /* !! */  = (int)dx.cgpz("chaq", cgpw(int ), (int)240);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl837
            }
            case 110: {
                var52_4 /* !! */  = (int)dx.cgpz("char", cgpw(int ), (int)241);
                if (!var53_3) ** GOTO lbl492
                throw null;
            }
lbl770:
            // 2 sources

            case 111: {
                var52_4 /* !! */  = (int)dx.cgpz("chas", cgpw(int ), (int)242);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1101
            }
lbl775:
            // 3 sources

            case 112: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var52_4 /* !! */  = (int)dx.cgpz("chat", cgpw(int ), (int)243);
                    if (!var53_3) ** GOTO lbl574
                    throw null;
                }
            }
lbl780:
            // 3 sources

            case 113: {
                var52_4 /* !! */  = (int)dx.cgpz("chau", cgpw(int ), (int)244);
                if (!var53_3) ** GOTO lbl370
                throw null;
            }
lbl784:
            // 2 sources

            case 114: {
                var52_4 /* !! */  = (int)dx.cgpz("chav", cgpw(int ), (int)245);
                if (!var53_3) ** GOTO lbl465
                throw null;
            }
            case 115: {
                var52_4 /* !! */  = (int)dx.cgpz("chaw", cgpw(int ), (int)246);
                if (!var53_3) ** GOTO lbl360
                throw null;
            }
            case 116: {
                var52_4 /* !! */  = (int)dx.cgpz("chax", cgpw(int ), (int)247);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1118
            }
            case 117: {
                var52_4 /* !! */  = (int)dx.cgpz("chay", cgpw(int ), (int)248);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1122
            }
            case 118: {
                var52_4 /* !! */  = (int)dx.cgpz("chaz", cgpw(int ), (int)249);
                if (!var53_3) ** GOTO lbl583
                throw null;
            }
lbl806:
            // 4 sources

            case 119: {
                var52_4 /* !! */  = (int)dx.cgpz("chba", cgpw(int ), (int)250);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1040
            }
            case 120: {
                var52_4 /* !! */  = (int)dx.cgpz("chbb", cgpw(int ), (int)251);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1146
            }
lbl816:
            // 2 sources

            case 121: {
                var52_4 /* !! */  = (int)dx.cgpz("chbc", cgpw(int ), (int)252);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1015
            }
            case 122: {
                var52_4 /* !! */  = (int)dx.cgpz("chbd", cgpw(int ), (int)253);
                if (!var53_3) ** GOTO lbl744
                throw null;
            }
lbl825:
            // 2 sources

            case 123: {
                var52_4 /* !! */  = (int)dx.cgpz("chbe", cgpw(int ), (int)254);
                if (!var53_3) ** GOTO lbl583
                throw null;
            }
            case 124: {
                var52_4 /* !! */  = (int)dx.cgpz("chbf", cgpw(int ), (int)255);
                if (!var53_3) ** GOTO lbl519
                throw null;
            }
lbl833:
            // 3 sources

            case 125: {
                var52_4 /* !! */  = (int)dx.cgpz("chbg", cgpw(int ), (int)256);
                if (!var53_3) ** GOTO lbl780
                throw null;
            }
lbl837:
            // 2 sources

            case 126: {
                var52_4 /* !! */  = (int)dx.cgpz("chbh", cgpw(int ), (int)257);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl876
            }
lbl842:
            // 2 sources

            case 127: {
                var52_4 /* !! */  = (int)dx.cgpz("chbi", cgpw(int ), (int)258);
                if (!var53_3) ** GOTO lbl639
                throw null;
            }
            case 128: {
                var52_4 /* !! */  = (int)dx.cgpz("chbj", cgpw(int ), (int)259);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1101
            }
            case 129: {
                var52_4 /* !! */  = (int)dx.cgpz("chbk", cgpw(int ), (int)260);
                if (!var53_3) ** GOTO lbl375
                throw null;
            }
lbl855:
            // 2 sources

            case 130: {
                var52_4 /* !! */  = (int)dx.cgpz("chbl", cgpw(int ), (int)261);
                if (!var53_3) ** GOTO lbl806
                throw null;
            }
            case 131: {
                var52_4 /* !! */  = (int)dx.cgpz("chbm", cgpw(int ), (int)262);
                if (!var53_3) ** GOTO lbl266
                throw null;
            }
lbl863:
            // 2 sources

            case 132: {
                var52_4 /* !! */  = (int)dx.cgpz("chbn", cgpw(int ), (int)263);
                if (!var53_3) ** GOTO lbl668
                throw null;
            }
lbl867:
            // 2 sources

            case 133: {
                var52_4 /* !! */  = (int)dx.cgpz("chbo", cgpw(int ), (int)264);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl948
            }
lbl872:
            // 4 sources

            case 134: {
                var52_4 /* !! */  = (int)dx.cgpz("chbp", cgpw(int ), (int)265);
                if (!var53_3) ** GOTO lbl561
                throw null;
            }
lbl876:
            // 4 sources

            case 135: {
                do {
                    var52_4 /* !! */  = (int)dx.cgpz("chbq", cgpw(int ), (int)266);
                } while (!var53_3);
                throw null;
            }
lbl881:
            // 2 sources

            case 136: {
                var52_4 /* !! */  = (int)dx.cgpz("chbr", cgpw(int ), (int)267);
                if (!var53_3) ** GOTO lbl528
                throw null;
            }
lbl885:
            // 3 sources

            case 137: {
                var52_4 /* !! */  = (int)dx.cgpz("chbs", cgpw(int ), (int)268);
                if (!var53_3) ** GOTO lbl450
                throw null;
            }
            case 138: {
                var52_4 /* !! */  = (int)dx.cgpz("chbt", cgpw(int ), (int)269);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1023
            }
lbl894:
            // 2 sources

            case 139: {
                var52_4 /* !! */  = (int)dx.cgpz("chbu", cgpw(int ), (int)270);
                if (!var53_3) ** GOTO lbl775
                throw null;
            }
lbl898:
            // 2 sources

            case 140: {
                var52_4 /* !! */  = (int)dx.cgpz("chbv", cgpw(int ), (int)271);
                if (!var53_3) ** GOTO lbl515
                throw null;
            }
lbl902:
            // 3 sources

            case 141: {
                var52_4 /* !! */  = (int)dx.cgpz("chbw", cgpw(int ), (int)272);
                if (!var53_3) ** GOTO lbl542
                throw null;
            }
            case 142: {
                var52_4 /* !! */  = (int)dx.cgpz("chbx", cgpw(int ), (int)273);
                if (!var53_3) ** GOTO lbl574
                throw null;
            }
lbl910:
            // 2 sources

            case 143: {
                var52_4 /* !! */  = (int)dx.cgpz("chby", cgpw(int ), (int)274);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl995
            }
lbl915:
            // 4 sources

            case 144: {
                var52_4 /* !! */  = (int)dx.cgpz("chbz", cgpw(int ), (int)275);
                if (!var53_3) ** GOTO lbl620
                throw null;
            }
            case 145: {
                var52_4 /* !! */  = (int)dx.cgpz("chca", cgpw(int ), (int)276);
                if (!var53_3) ** GOTO lbl375
                throw null;
            }
lbl923:
            // 4 sources

            case 146: {
                var52_4 /* !! */  = (int)dx.cgpz("chcb", cgpw(int ), (int)277);
                if (!var53_3) ** GOTO lbl709
                throw null;
            }
lbl927:
            // 2 sources

            case 147: {
                var52_4 /* !! */  = (int)dx.cgpz("chcc", cgpw(int ), (int)278);
                if (!var53_3) ** GOTO lbl436
                throw null;
            }
            case 148: {
                var52_4 /* !! */  = (int)dx.cgpz("chcd", cgpw(int ), (int)279);
                if (!var53_3) ** GOTO lbl770
                throw null;
            }
lbl935:
            // 2 sources

            case 149: {
                var52_4 /* !! */  = (int)dx.cgpz("chce", cgpw(int ), (int)280);
                if (!var53_3) ** GOTO lbl251
                throw null;
            }
lbl939:
            // 2 sources

            case 150: {
                var52_4 /* !! */  = (int)dx.cgpz("chcf", cgpw(int ), (int)281);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1109
            }
            case 151: {
                var52_4 /* !! */  = (int)dx.cgpz("chcg", cgpw(int ), (int)282);
                if (!var53_3) ** GOTO lbl939
                throw null;
            }
lbl948:
            // 2 sources

            case 152: {
                var52_4 /* !! */  = (int)dx.cgpz("chch", cgpw(int ), (int)283);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1011
            }
            case 153: {
                var52_4 /* !! */  = (int)dx.cgpz("chci", cgpw(int ), (int)284);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1113
            }
lbl958:
            // 2 sources

            case 154: {
                var52_4 /* !! */  = (int)dx.cgpz("chcj", cgpw(int ), (int)285);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1072
            }
            case 155: {
                var52_4 /* !! */  = (int)dx.cgpz("chck", cgpw(int ), (int)286);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1097
            }
            case 156: {
                var52_4 /* !! */  = (int)dx.cgpz("chcl", cgpw(int ), (int)287);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl978
            }
lbl973:
            // 2 sources

            case 157: {
                var52_4 /* !! */  = (int)dx.cgpz("chcm", cgpw(int ), (int)288);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1085
            }
lbl978:
            // 2 sources

            case 158: {
                var52_4 /* !! */  = (int)dx.cgpz("chcn", cgpw(int ), (int)289);
                if (!var53_3) ** GOTO lbl872
                throw null;
            }
            case 159: {
                var52_4 /* !! */  = (int)dx.cgpz("chco", cgpw(int ), (int)290);
                if (!var53_3) ** GOTO lbl784
                throw null;
            }
lbl986:
            // 2 sources

            case 160: {
                var52_4 /* !! */  = (int)dx.cgpz("chcp", cgpw(int ), (int)291);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1162
            }
lbl991:
            // 2 sources

            case 161: {
                var52_4 /* !! */  = (int)dx.cgpz("chcq", cgpw(int ), (int)292);
                if (!var53_3) ** GOTO lbl986
                throw null;
            }
lbl995:
            // 2 sources

            case 162: {
                var52_4 /* !! */  = (int)dx.cgpz("chcr", cgpw(int ), (int)293);
                if (!var53_3) ** GOTO lbl625
                throw null;
            }
            case 163: {
                var52_4 /* !! */  = (int)dx.cgpz("chcs", cgpw(int ), (int)294);
                if (!var53_3) ** GOTO lbl306
                throw null;
            }
            case 164: {
                var52_4 /* !! */  = (int)dx.cgpz("chct", cgpw(int ), (int)295);
                if (!var53_3) ** GOTO lbl496
                throw null;
            }
lbl1007:
            // 2 sources

            case 165: {
                var52_4 /* !! */  = (int)dx.cgpz("chcu", cgpw(int ), (int)296);
                if (!var53_3) ** GOTO lbl450
                throw null;
            }
lbl1011:
            // 2 sources

            case 166: {
                var52_4 /* !! */  = (int)dx.cgpz("chcv", cgpw(int ), (int)297);
                if (!var53_3) ** GOTO lbl876
                throw null;
            }
lbl1015:
            // 3 sources

            case 167: {
                var52_4 /* !! */  = (int)dx.cgpz("chcw", cgpw(int ), (int)298);
                if (!var53_3) ** GOTO lbl492
                throw null;
            }
            case 168: {
                var52_4 /* !! */  = (int)dx.cgpz("chcx", cgpw(int ), (int)299);
                if (!var53_3) ** GOTO lbl713
                throw null;
            }
lbl1023:
            // 2 sources

            case 169: {
                var52_4 /* !! */  = (int)dx.cgpz("chcy", cgpw(int ), (int)300);
                if (!var53_3) ** GOTO lbl923
                throw null;
            }
            case 170: {
                var52_4 /* !! */  = (int)dx.cgpz("chcz", cgpw(int ), (int)301);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1150
            }
            case 171: {
                var52_4 /* !! */  = (int)dx.cgpz("chda", cgpw(int ), (int)302);
                if (!var53_3) ** GOTO lbl1015
                throw null;
            }
lbl1036:
            // 3 sources

            case 172: {
                var52_4 /* !! */  = (int)dx.cgpz("chdb", cgpw(int ), (int)303);
                if (!var53_3) ** GOTO lbl718
                throw null;
            }
lbl1040:
            // 2 sources

            case 173: {
                var52_4 /* !! */  = (int)dx.cgpz("chdc", cgpw(int ), (int)304);
                if (!var53_3) ** GOTO lbl537
                throw null;
            }
            case 174: {
                var52_4 /* !! */  = (int)dx.cgpz("chdd", cgpw(int ), (int)305);
                if (!var53_3) ** GOTO lbl418
                throw null;
            }
            case 175: {
                var52_4 /* !! */  = (int)dx.cgpz("chde", cgpw(int ), (int)306);
                if (!var53_3) ** GOTO lbl592
                throw null;
            }
lbl1052:
            // 3 sources

            case 176: {
                var52_4 /* !! */  = (int)dx.cgpz("chdf", cgpw(int ), (int)307);
                if (!var53_3) ** GOTO lbl700
                throw null;
            }
            case 177: {
                var52_4 /* !! */  = (int)dx.cgpz("chdg", cgpw(int ), (int)308);
                if (!var53_3) ** GOTO lbl446
                throw null;
            }
            case 178: {
                var52_4 /* !! */  = (int)dx.cgpz("chdh", cgpw(int ), (int)309);
                if (!var53_3) ** GOTO lbl301
                throw null;
            }
lbl1064:
            // 2 sources

            case 179: {
                var52_4 /* !! */  = (int)dx.cgpz("chdi", cgpw(int ), (int)310);
                if (!var53_3) ** GOTO lbl465
                throw null;
            }
lbl1068:
            // 3 sources

            case 180: {
                var52_4 /* !! */  = (int)dx.cgpz("chdj", cgpw(int ), (int)311);
                if (!var53_3) ** GOTO lbl470
                throw null;
            }
lbl1072:
            // 3 sources

            case 181: {
                var52_4 /* !! */  = (int)dx.cgpz("chdk", cgpw(int ), (int)312);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1109
            }
            case 182: {
                var52_4 /* !! */  = (int)dx.cgpz("chdl", cgpw(int ), (int)313);
                if (!var53_3) ** GOTO lbl872
                throw null;
            }
            case 183: {
                var52_4 /* !! */  = (int)dx.cgpz("chdm", cgpw(int ), (int)314);
                if (!var53_3) ** GOTO lbl825
                throw null;
            }
lbl1085:
            // 2 sources

            case 184: {
                var52_4 /* !! */  = (int)dx.cgpz("chdn", cgpw(int ), (int)315);
                if (!var53_3) ** GOTO lbl863
                throw null;
            }
lbl1089:
            // 2 sources

            case 185: {
                var52_4 /* !! */  = (int)dx.cgpz("chdo", cgpw(int ), (int)316);
                if (!var53_3) ** GOTO lbl816
                throw null;
            }
            case 186: {
                var52_4 /* !! */  = (int)dx.cgpz("chdp", cgpw(int ), (int)317);
                if (!var53_3) ** GOTO lbl519
                throw null;
            }
lbl1097:
            // 3 sources

            case 187: {
                var52_4 /* !! */  = (int)dx.cgpz("chdq", cgpw(int ), (int)318);
                if (!var53_3) ** GOTO lbl842
                throw null;
            }
lbl1101:
            // 3 sources

            case 188: {
                var52_4 /* !! */  = (int)dx.cgpz("chdr", cgpw(int ), (int)319);
                if (!var53_3) ** GOTO lbl413
                throw null;
            }
lbl1105:
            // 2 sources

            case 189: {
                var52_4 /* !! */  = (int)dx.cgpz("chds", cgpw(int ), (int)320);
                if (!var53_3) ** GOTO lbl726
                throw null;
            }
lbl1109:
            // 5 sources

            case 190: {
                var52_4 /* !! */  = (int)dx.cgpz("chdt", cgpw(int ), (int)321);
                if (!var53_3) ** GOTO lbl1052
                throw null;
            }
lbl1113:
            // 2 sources

            case 191: {
                var52_4 /* !! */  = (int)dx.cgpz("chdu", cgpw(int ), (int)322);
                if (var53_3) {
                    throw null;
                }
                ** GOTO lbl1166
            }
lbl1118:
            // 2 sources

            case 192: {
                var52_4 /* !! */  = (int)dx.cgpz("chdv", cgpw(int ), (int)323);
                if (!var53_3) ** GOTO lbl902
                throw null;
            }
lbl1122:
            // 3 sources

            case 193: {
                var52_4 /* !! */  = (int)dx.cgpz("chdw", cgpw(int ), (int)324);
                if (!var53_3) ** GOTO lbl413
                throw null;
            }
lbl1126:
            // 3 sources

            case 194: {
                var52_4 /* !! */  = (int)dx.cgpz("chdx", cgpw(int ), (int)325);
                if (!var53_3) ** GOTO lbl653
                throw null;
            }
            case 195: {
                var52_4 /* !! */  = (int)dx.cgpz("chdy", cgpw(int ), (int)326);
                if (var53_3) {
                    throw null;
                }
            }
lbl1134:
            // 4 sources

            case 196: {
                var52_4 /* !! */  = (int)dx.cgpz("chdz", cgpw(int ), (int)327);
                if (!var53_3) ** GOTO lbl1064
                throw null;
            }
            case 197: {
                var52_4 /* !! */  = (int)dx.cgpz("chea", cgpw(int ), (int)328);
                if (!var53_3) ** GOTO lbl519
                throw null;
            }
            case 198: {
                var52_4 /* !! */  = (int)dx.cgpz("cheb", cgpw(int ), (int)329);
                if (!var53_3) ** GOTO lbl806
                throw null;
            }
lbl1146:
            // 3 sources

            case 199: {
                var52_4 /* !! */  = (int)dx.cgpz("chec", cgpw(int ), (int)330);
                if (!var53_3) ** GOTO lbl528
                throw null;
            }
lbl1150:
            // 2 sources

            case 200: {
                var52_4 /* !! */  = (int)dx.cgpz("ched", cgpw(int ), (int)331);
                if (!var53_3) ** GOTO lbl686
                throw null;
            }
lbl1154:
            // 4 sources

            case 201: {
                var52_4 /* !! */  = (int)dx.cgpz("chee", cgpw(int ), (int)332);
                if (!var53_3) ** GOTO lbl296
                throw null;
            }
lbl1158:
            // 2 sources

            case 202: {
                var52_4 /* !! */  = (int)dx.cgpz("chef", cgpw(int ), (int)333);
                if (!var53_3) ** GOTO lbl872
                throw null;
            }
lbl1162:
            // 4 sources

            case 203: {
                var52_4 /* !! */  = (int)dx.cgpz("cheg", cgpw(int ), (int)334);
                if (!var53_3) ** GOTO lbl551
                throw null;
            }
lbl1166:
            // 2 sources

            case 204: {
                var52_4 /* !! */  = (int)dx.cgpz("cheh", cgpw(int ), (int)335);
                if (!var53_3) ** GOTO lbl256
                throw null;
            }
            case 205: 
        }
        var52_4 /* !! */  = (int)dx.cgpz("chei", cgpw(int ), (int)336);
        ** while (!var53_3)
lbl1173:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long cgre(int n2) {
        return cgqd[n2] ^ cgqe[n2];
    }

    private static /* synthetic */ void cjdc() {
        dx.cgqd[0] = -4720736852778510088L;
        dx.cgqd[1] = -1391031238233791073L;
        dx.cgqd[2] = -341614371472929657L;
        dx.cgqd[3] = 2122018677849537435L;
        dx.cgqd[4] = 447683177257254143L;
        dx.cgqd[5] = 5581187708629194058L;
        dx.cgqd[6] = -570450921848576834L;
        dx.cgqd[7] = -4517299575064579005L;
        dx.cgqd[8] = -4329014415550942792L;
        dx.cgqd[9] = -2462323736230435477L;
        dx.cgqd[10] = 108011049943008551L;
        dx.cgqd[11] = -3864555915362162047L;
        dx.cgqd[12] = -3575038818133570385L;
        dx.cgqd[13] = -6758689760416492975L;
        dx.cgqd[14] = -4469503865002926558L;
        dx.cgqd[15] = -1365367943915135246L;
        dx.cgqd[16] = 3279557926911343580L;
        dx.cgqd[17] = -6995411224206646804L;
        dx.cgqd[18] = -7477655530515672175L;
        dx.cgqd[19] = -6815733692387773780L;
        dx.cgqd[20] = -6680548761785541745L;
        dx.cgqd[21] = -7797849065788190011L;
        dx.cgqd[22] = -7762572170716129561L;
        dx.cgqd[23] = 5071104241692251528L;
        dx.cgqd[24] = 6553940606667436923L;
        dx.cgqd[25] = -2367582090749306494L;
        dx.cgqd[26] = -8075671470176085294L;
        dx.cgqd[27] = 4692394063832728765L;
        dx.cgqd[28] = 860200996691494374L;
        dx.cgqd[29] = 5307351998099919682L;
        dx.cgqd[30] = -4503083023269575984L;
        dx.cgqd[31] = 3326372522980540893L;
        dx.cgqd[32] = 2576095767061009461L;
        dx.cgqd[33] = -4750554070103783588L;
        dx.cgqd[34] = -5391575449602349543L;
        dx.cgqd[35] = -5780756214928661913L;
        dx.cgqd[36] = -6767117444114174413L;
        dx.cgqd[37] = 1883525335127520554L;
        dx.cgqd[38] = -3687447156297283542L;
        dx.cgqd[39] = 6074595524913508392L;
        dx.cgqd[40] = -6557325839114491689L;
        dx.cgqd[41] = 2203190946891901960L;
        dx.cgqd[42] = 2452989306142952873L;
        dx.cgqd[43] = 1621387126356568804L;
        dx.cgqd[44] = -1389151545715314812L;
        dx.cgqd[45] = 2729788041518573315L;
        dx.cgqd[46] = 3790331996032931949L;
        dx.cgqd[47] = -3106232211107498181L;
        dx.cgqd[48] = 1030928440808658024L;
        dx.cgqd[49] = 1112620466794548001L;
        dx.cgqd[50] = 2383647764028509620L;
        dx.cgqd[51] = -2146969183044929377L;
        dx.cgqd[52] = 2353153345790637805L;
        dx.cgqd[53] = -3872724521797926557L;
        dx.cgqd[54] = 4770272722484044386L;
        dx.cgqd[55] = -1766080181462260907L;
        dx.cgqd[56] = -1550675843455472392L;
        dx.cgqd[57] = 862332957708117379L;
        dx.cgqd[58] = -8997844045409050629L;
        dx.cgqd[59] = 2344790940130724893L;
        dx.cgqd[60] = 6803107449208527604L;
        dx.cgqd[61] = 4817758019742490094L;
        dx.cgqd[62] = -6428865553517653505L;
        dx.cgqd[63] = 1602755528099704779L;
        dx.cgqd[64] = -7116119544960615088L;
        dx.cgqd[65] = -2536459871741779144L;
        dx.cgqd[66] = -7938660987664960596L;
        dx.cgqd[67] = -7917320336337072461L;
        dx.cgqd[68] = 46875349182602945L;
        dx.cgqd[69] = 1406680414948429750L;
        dx.cgqd[70] = -2672341680607112214L;
        dx.cgqd[71] = -6192432878727595263L;
        dx.cgqd[72] = -8478358608817983848L;
        dx.cgqd[73] = -1553363146531107313L;
        dx.cgqd[74] = -8550386710907135365L;
        dx.cgqd[75] = -2596695256241481812L;
        dx.cgqd[76] = 3099388960437257881L;
        dx.cgqd[77] = -721567139119111069L;
        dx.cgqd[78] = -4741841546767508472L;
        dx.cgqd[79] = 8341090488719427177L;
        dx.cgqd[80] = 7543267008371820297L;
        dx.cgqd[81] = -2506660056310768259L;
        dx.cgqd[82] = -2169132668527970863L;
        dx.cgqd[83] = 8156028073535335367L;
        dx.cgqd[84] = -216932576548734257L;
        dx.cgqd[85] = -6430167236418694164L;
        dx.cgqd[86] = -8970766371755086784L;
        dx.cgqd[87] = -3343796108037411844L;
        dx.cgqd[88] = 1540723399588193149L;
        dx.cgqd[89] = 1538179329035365911L;
        dx.cgqd[90] = 5846307033629176452L;
        dx.cgqd[91] = -3650786703852646455L;
        dx.cgqd[92] = 1779842379710259941L;
        dx.cgqd[93] = -5538576747057582504L;
        dx.cgqd[94] = 818422409361071233L;
        dx.cgqd[95] = 9046058997917406329L;
        dx.cgqd[96] = 9208150973128915508L;
        dx.cgqd[97] = 421709997242215427L;
        dx.cgqd[98] = -5489298212792059632L;
        dx.cgqd[99] = -978735517351852795L;
    }

    private static /* synthetic */ void cjck() {
        dx.cgpx[200] = -896796351;
        dx.cgpx[201] = -43380858;
        dx.cgpx[202] = 1027230473;
        dx.cgpx[203] = 794460586;
        dx.cgpx[204] = -489764607;
        dx.cgpx[205] = 14665329;
        dx.cgpx[206] = 639787597;
        dx.cgpx[207] = -1088488503;
        dx.cgpx[208] = -1806332194;
        dx.cgpx[209] = -659040038;
        dx.cgpx[210] = 2030751258;
        dx.cgpx[211] = 331054608;
        dx.cgpx[212] = -389640543;
        dx.cgpx[213] = 9767832;
        dx.cgpx[214] = 1737622420;
        dx.cgpx[215] = 355358325;
        dx.cgpx[216] = 415448214;
        dx.cgpx[217] = -1731388026;
        dx.cgpx[218] = 1240000958;
        dx.cgpx[219] = -1389185852;
        dx.cgpx[220] = -163969277;
        dx.cgpx[221] = 1838395528;
        dx.cgpx[222] = -1808057685;
        dx.cgpx[223] = 912917873;
        dx.cgpx[224] = -611879152;
        dx.cgpx[225] = 429730158;
        dx.cgpx[226] = 1439683046;
        dx.cgpx[227] = 2006332549;
        dx.cgpx[228] = -32661223;
        dx.cgpx[229] = -1655367647;
        dx.cgpx[230] = -1691350128;
        dx.cgpx[231] = 1247154895;
        dx.cgpx[232] = 1573276241;
        dx.cgpx[233] = 997711993;
        dx.cgpx[234] = -169559134;
        dx.cgpx[235] = 809709750;
        dx.cgpx[236] = -1362803086;
        dx.cgpx[237] = 1117235025;
        dx.cgpx[238] = 1649041410;
        dx.cgpx[239] = 1566763553;
        dx.cgpx[240] = -85593199;
        dx.cgpx[241] = 219206942;
        dx.cgpx[242] = 1575326487;
        dx.cgpx[243] = 164783813;
        dx.cgpx[244] = -499656062;
        dx.cgpx[245] = -562912901;
        dx.cgpx[246] = 163307816;
        dx.cgpx[247] = 951046354;
        dx.cgpx[248] = 762039211;
        dx.cgpx[249] = 312766625;
        dx.cgpx[250] = -339442124;
        dx.cgpx[251] = -37677413;
        dx.cgpx[252] = 1204031074;
        dx.cgpx[253] = 140055968;
        dx.cgpx[254] = 1002942960;
        dx.cgpx[255] = -1199907348;
        dx.cgpx[256] = 1931442013;
        dx.cgpx[257] = 1240277735;
        dx.cgpx[258] = -1975885936;
        dx.cgpx[259] = -1341092431;
        dx.cgpx[260] = 2044753432;
        dx.cgpx[261] = 903732958;
        dx.cgpx[262] = 370140989;
        dx.cgpx[263] = 325095502;
        dx.cgpx[264] = -185699978;
        dx.cgpx[265] = 249210346;
        dx.cgpx[266] = -530992402;
        dx.cgpx[267] = 387857494;
        dx.cgpx[268] = 824246437;
        dx.cgpx[269] = 860530886;
        dx.cgpx[270] = -1121917305;
        dx.cgpx[271] = -422777127;
        dx.cgpx[272] = 1816781126;
        dx.cgpx[273] = -784508551;
        dx.cgpx[274] = 2137838505;
        dx.cgpx[275] = 1614176347;
        dx.cgpx[276] = -1341411365;
        dx.cgpx[277] = -832826962;
        dx.cgpx[278] = 1445232508;
        dx.cgpx[279] = 1195390112;
        dx.cgpx[280] = 2096676931;
        dx.cgpx[281] = -1613258501;
        dx.cgpx[282] = 1604887350;
        dx.cgpx[283] = 1470316183;
        dx.cgpx[284] = -732518082;
        dx.cgpx[285] = 1286920541;
        dx.cgpx[286] = -169418019;
        dx.cgpx[287] = -2058807657;
        dx.cgpx[288] = -543666012;
        dx.cgpx[289] = -377005755;
        dx.cgpx[290] = -1015141892;
        dx.cgpx[291] = -247797978;
        dx.cgpx[292] = 1936299372;
        dx.cgpx[293] = 668603819;
        dx.cgpx[294] = 261579394;
        dx.cgpx[295] = -766078789;
        dx.cgpx[296] = 1178919724;
        dx.cgpx[297] = 2037997687;
        dx.cgpx[298] = 143982367;
        dx.cgpx[299] = 1823314281;
    }

    private static /* synthetic */ void cjdd() {
        dx.cgqd[100] = 3819022196554450117L;
        dx.cgqd[101] = 5470103660632868079L;
        dx.cgqd[102] = 8760314329430499207L;
        dx.cgqd[103] = 8936411572048869658L;
        dx.cgqd[104] = -1992303021172894178L;
        dx.cgqd[105] = 8853679839984638783L;
        dx.cgqd[106] = 5880801705241975686L;
        dx.cgqd[107] = 6149673241633115104L;
        dx.cgqd[108] = 819247988042706669L;
        dx.cgqd[109] = 6773953676481812082L;
        dx.cgqd[110] = -739017807053671562L;
        dx.cgqd[111] = 3776094945981575672L;
        dx.cgqd[112] = -4560219510927923528L;
        dx.cgqd[113] = -4196098579600453595L;
        dx.cgqd[114] = 8759371182277569339L;
        dx.cgqd[115] = -2028094004759927038L;
        dx.cgqd[116] = -3385580101638931522L;
        dx.cgqd[117] = -4978671691334397187L;
        dx.cgqd[118] = -876635936396947355L;
        dx.cgqd[119] = -7458092030665196409L;
        dx.cgqd[120] = -1445025259666342594L;
        dx.cgqd[121] = -7580863924950299827L;
        dx.cgqd[122] = 1315221490984126158L;
        dx.cgqd[123] = -5020591955466238024L;
        dx.cgqd[124] = 5407677670952228276L;
        dx.cgqd[125] = 1351318193214900275L;
        dx.cgqd[126] = 3200916619613449918L;
        dx.cgqd[127] = -5664773322700420343L;
        dx.cgqd[128] = 8547881032915382521L;
        dx.cgqd[129] = 7462322817218417396L;
        dx.cgqd[130] = 3767182866502231520L;
        dx.cgqd[131] = 7385712430175490817L;
        dx.cgqd[132] = -2502741009742617650L;
        dx.cgqd[133] = 6502282830568655852L;
        dx.cgqd[134] = 1396421847094626342L;
        dx.cgqd[135] = 7735468026232932009L;
        dx.cgqd[136] = 7331045349289319677L;
        dx.cgqd[137] = 5685475701453695676L;
        dx.cgqd[138] = 637649912622992208L;
        dx.cgqd[139] = -2245335506619570005L;
        dx.cgqd[140] = 7247427973856757729L;
        dx.cgqd[141] = 8542563692161092031L;
        dx.cgqd[142] = 7949613448474502895L;
        dx.cgqd[143] = 2460640145666874088L;
        dx.cgqd[144] = 5316215694673090503L;
        dx.cgqd[145] = 996395576532837921L;
        dx.cgqd[146] = 4103892005501901465L;
        dx.cgqd[147] = 244114521062456182L;
        dx.cgqd[148] = -5713358197302346309L;
        dx.cgqd[149] = 4851528958933424928L;
        dx.cgqd[150] = -5695504754126961309L;
        dx.cgqd[151] = -3063868808197242419L;
        dx.cgqd[152] = 750760795496437950L;
        dx.cgqd[153] = -7808362187677880830L;
        dx.cgqd[154] = 5731552695914800069L;
        dx.cgqd[155] = -2413872254379208129L;
        dx.cgqd[156] = 2618214629975365153L;
        dx.cgqd[157] = -1903897602352514025L;
        dx.cgqd[158] = 538308256697719299L;
        dx.cgqd[159] = -8686190627323453280L;
        dx.cgqd[160] = 5711265665287590744L;
        dx.cgqd[161] = 5802637616560671856L;
        dx.cgqd[162] = -154090001312672612L;
        dx.cgqd[163] = 3772645410018239390L;
        dx.cgqd[164] = -4985137094224402748L;
        dx.cgqd[165] = 6493795549159294421L;
        dx.cgqd[166] = 49968681202057881L;
        dx.cgqd[167] = 8264246948526231743L;
        dx.cgqd[168] = -2168412014626766875L;
        dx.cgqd[169] = 8365286700844532729L;
        dx.cgqd[170] = 2938315653413870287L;
        dx.cgqd[171] = -6706310842351914040L;
        dx.cgqd[172] = 3814370952599591586L;
        dx.cgqd[173] = -5657623009723099737L;
        dx.cgqd[174] = -6459354404590058802L;
        dx.cgqd[175] = -731996278275364136L;
        dx.cgqd[176] = 337822777226082502L;
        dx.cgqd[177] = 452928811622014262L;
        dx.cgqd[178] = -7756475350820028375L;
        dx.cgqd[179] = 1093630985783180968L;
        dx.cgqd[180] = 8680579871224834514L;
        dx.cgqd[181] = -8899384910662375869L;
        dx.cgqd[182] = -2244508539809941182L;
        dx.cgqd[183] = 3544376495834781551L;
        dx.cgqd[184] = 4619329298047567431L;
        dx.cgqd[185] = 1457640976264100029L;
        dx.cgqd[186] = 2335028455680431378L;
        dx.cgqd[187] = -952733894426559004L;
        dx.cgqd[188] = 3338222140352084601L;
        dx.cgqd[189] = -7169451431686223718L;
        dx.cgqd[190] = 4839519580349870745L;
        dx.cgqd[191] = 4716205727052123686L;
        dx.cgqd[192] = -7019971366108160890L;
        dx.cgqd[193] = 95267755075160913L;
        dx.cgqd[194] = 6706126855412093435L;
        dx.cgqd[195] = 6971807049290734466L;
        dx.cgqd[196] = -3571853779186126586L;
        dx.cgqd[197] = 3287860950873111994L;
        dx.cgqd[198] = -8473644620505644721L;
        dx.cgqd[199] = -4244516367596204193L;
    }

    private static /* synthetic */ void cjcj() {
        dx.cgpx[100] = -660266772;
        dx.cgpx[101] = 68403985;
        dx.cgpx[102] = 1370937204;
        dx.cgpx[103] = -2094673131;
        dx.cgpx[104] = -1777044200;
        dx.cgpx[105] = 600622487;
        dx.cgpx[106] = -943403763;
        dx.cgpx[107] = -998623935;
        dx.cgpx[108] = -1800460664;
        dx.cgpx[109] = -1316365128;
        dx.cgpx[110] = 1771900248;
        dx.cgpx[111] = 677155147;
        dx.cgpx[112] = -1632634854;
        dx.cgpx[113] = -1109324754;
        dx.cgpx[114] = -1612115803;
        dx.cgpx[115] = 1262911139;
        dx.cgpx[116] = -1924449401;
        dx.cgpx[117] = 1655369352;
        dx.cgpx[118] = 1976570125;
        dx.cgpx[119] = -670883881;
        dx.cgpx[120] = -17051489;
        dx.cgpx[121] = 692942550;
        dx.cgpx[122] = 676259715;
        dx.cgpx[123] = -738505918;
        dx.cgpx[124] = -636052039;
        dx.cgpx[125] = 2126607018;
        dx.cgpx[126] = -311292559;
        dx.cgpx[127] = -1005503349;
        dx.cgpx[128] = 1381129468;
        dx.cgpx[129] = -220357953;
        dx.cgpx[130] = -2041022272;
        dx.cgpx[131] = 457357678;
        dx.cgpx[132] = -449488607;
        dx.cgpx[133] = 1088195538;
        dx.cgpx[134] = -1840040854;
        dx.cgpx[135] = -1465196626;
        dx.cgpx[136] = -813257470;
        dx.cgpx[137] = -429252326;
        dx.cgpx[138] = 981469691;
        dx.cgpx[139] = 1282373546;
        dx.cgpx[140] = -643423516;
        dx.cgpx[141] = -1844673032;
        dx.cgpx[142] = -1681637918;
        dx.cgpx[143] = -326984482;
        dx.cgpx[144] = 26810314;
        dx.cgpx[145] = -376389345;
        dx.cgpx[146] = 195661303;
        dx.cgpx[147] = -533069812;
        dx.cgpx[148] = 1102501185;
        dx.cgpx[149] = -1579692993;
        dx.cgpx[150] = -1159376407;
        dx.cgpx[151] = 1518925906;
        dx.cgpx[152] = 1214151711;
        dx.cgpx[153] = -1834395559;
        dx.cgpx[154] = 1507544973;
        dx.cgpx[155] = 0xEBBBB1;
        dx.cgpx[156] = -1985271297;
        dx.cgpx[157] = 1661016086;
        dx.cgpx[158] = 206524867;
        dx.cgpx[159] = -314545548;
        dx.cgpx[160] = -699393117;
        dx.cgpx[161] = 857586889;
        dx.cgpx[162] = -2102045945;
        dx.cgpx[163] = -311371346;
        dx.cgpx[164] = 1259336354;
        dx.cgpx[165] = 541668522;
        dx.cgpx[166] = -233072445;
        dx.cgpx[167] = 1687824582;
        dx.cgpx[168] = -941662537;
        dx.cgpx[169] = -943327106;
        dx.cgpx[170] = 1537804175;
        dx.cgpx[171] = -594696554;
        dx.cgpx[172] = -1913336695;
        dx.cgpx[173] = -221950830;
        dx.cgpx[174] = -2057466286;
        dx.cgpx[175] = -564623136;
        dx.cgpx[176] = 1577839280;
        dx.cgpx[177] = -2130254660;
        dx.cgpx[178] = -2039906960;
        dx.cgpx[179] = -1288276326;
        dx.cgpx[180] = -1120069635;
        dx.cgpx[181] = 721569348;
        dx.cgpx[182] = 1699482493;
        dx.cgpx[183] = 120386320;
        dx.cgpx[184] = -2076833339;
        dx.cgpx[185] = 1132382584;
        dx.cgpx[186] = -63408333;
        dx.cgpx[187] = 969678346;
        dx.cgpx[188] = -1146991205;
        dx.cgpx[189] = -1282986397;
        dx.cgpx[190] = -599489118;
        dx.cgpx[191] = 1249075482;
        dx.cgpx[192] = 241656506;
        dx.cgpx[193] = -1091432433;
        dx.cgpx[194] = -522568569;
        dx.cgpx[195] = 1916729470;
        dx.cgpx[196] = -532571813;
        dx.cgpx[197] = -209143959;
        dx.cgpx[198] = 1846680589;
        dx.cgpx[199] = -2136117308;
    }

    private static /* synthetic */ void cjcq() {
        dx.cgpx[800] = -331542330;
        dx.cgpx[801] = -1412662245;
        dx.cgpx[802] = -120582640;
        dx.cgpx[803] = -1127397115;
        dx.cgpx[804] = -264502033;
        dx.cgpx[805] = -2002138335;
        dx.cgpx[806] = 1899129069;
        dx.cgpx[807] = -1129911069;
        dx.cgpx[808] = -1390367925;
        dx.cgpx[809] = 878970322;
        dx.cgpx[810] = 1429280102;
        dx.cgpx[811] = 1331725058;
        dx.cgpx[812] = -16636767;
        dx.cgpx[813] = -1632411538;
        dx.cgpx[814] = -1567778386;
        dx.cgpx[815] = -1114582447;
        dx.cgpx[816] = 243082678;
        dx.cgpx[817] = 526791217;
        dx.cgpx[818] = -2009667347;
        dx.cgpx[819] = -1440326799;
        dx.cgpx[820] = 1749567994;
        dx.cgpx[821] = 1080909640;
        dx.cgpx[822] = -111982457;
        dx.cgpx[823] = 278555888;
        dx.cgpx[824] = 1025567450;
        dx.cgpx[825] = 631308928;
        dx.cgpx[826] = 727091521;
        dx.cgpx[827] = 1451507734;
        dx.cgpx[828] = 307506366;
        dx.cgpx[829] = -1180738140;
        dx.cgpx[830] = 386387492;
        dx.cgpx[831] = 978161441;
        dx.cgpx[832] = 527028418;
        dx.cgpx[833] = 1788311222;
        dx.cgpx[834] = 893406187;
        dx.cgpx[835] = -1196018105;
        dx.cgpx[836] = -948089158;
        dx.cgpx[837] = -803474707;
        dx.cgpx[838] = -1608244327;
        dx.cgpx[839] = -86978093;
        dx.cgpx[840] = 915655200;
        dx.cgpx[841] = -677349918;
        dx.cgpx[842] = -1591850384;
        dx.cgpx[843] = -1649739117;
        dx.cgpx[844] = 1909155625;
        dx.cgpx[845] = -1645830489;
        dx.cgpx[846] = 361507073;
        dx.cgpx[847] = 1456243931;
        dx.cgpx[848] = -1260783728;
        dx.cgpx[849] = -194451214;
        dx.cgpx[850] = 1605113510;
        dx.cgpx[851] = 193168298;
        dx.cgpx[852] = -245675056;
        dx.cgpx[853] = 1231802862;
        dx.cgpx[854] = -1429671464;
        dx.cgpx[855] = -1188421484;
        dx.cgpx[856] = 1191154599;
        dx.cgpx[857] = 397294190;
        dx.cgpx[858] = 1833154661;
        dx.cgpx[859] = 1645896456;
        dx.cgpx[860] = -980624361;
        dx.cgpx[861] = -1763827198;
        dx.cgpx[862] = 1504920044;
        dx.cgpx[863] = -505977634;
        dx.cgpx[864] = 90883435;
        dx.cgpx[865] = 1055408111;
        dx.cgpx[866] = -145312250;
        dx.cgpx[867] = 1079441898;
        dx.cgpx[868] = 232187571;
        dx.cgpx[869] = -549522270;
        dx.cgpx[870] = -1166541067;
        dx.cgpx[871] = 211549251;
        dx.cgpx[872] = 53968512;
        dx.cgpx[873] = 1655582121;
        dx.cgpx[874] = -510987116;
        dx.cgpx[875] = 1171372208;
        dx.cgpx[876] = 1498117196;
        dx.cgpx[877] = -1182899585;
        dx.cgpx[878] = -1701266210;
        dx.cgpx[879] = 301757686;
        dx.cgpx[880] = 1554859998;
        dx.cgpx[881] = 311205773;
        dx.cgpx[882] = -1531125519;
        dx.cgpx[883] = -987796876;
        dx.cgpx[884] = -178272085;
        dx.cgpx[885] = 1444195590;
        dx.cgpx[886] = 688661645;
        dx.cgpx[887] = -898251949;
        dx.cgpx[888] = -1366308191;
        dx.cgpx[889] = -1879164977;
        dx.cgpx[890] = 46273375;
        dx.cgpx[891] = -1005239530;
        dx.cgpx[892] = -5696955;
        dx.cgpx[893] = -171684214;
        dx.cgpx[894] = -1634735809;
        dx.cgpx[895] = -2013110121;
        dx.cgpx[896] = -1140795314;
        dx.cgpx[897] = 1725556266;
        dx.cgpx[898] = -679103044;
        dx.cgpx[899] = -183603577;
    }

    private static /* synthetic */ void cjcy() {
        dx.cgpy[600] = -47016712;
        dx.cgpy[601] = -25836078;
        dx.cgpy[602] = 677423408;
        dx.cgpy[603] = 253279708;
        dx.cgpy[604] = 1455331084;
        dx.cgpy[605] = 1989359758;
        dx.cgpy[606] = 1060064675;
        dx.cgpy[607] = 429366878;
        dx.cgpy[608] = -1180304416;
        dx.cgpy[609] = -1717301204;
        dx.cgpy[610] = 76733530;
        dx.cgpy[611] = 1907207751;
        dx.cgpy[612] = 1717011677;
        dx.cgpy[613] = 285851955;
        dx.cgpy[614] = 1076130768;
        dx.cgpy[615] = 1098722343;
        dx.cgpy[616] = 506223572;
        dx.cgpy[617] = 2098866474;
        dx.cgpy[618] = 1656230109;
        dx.cgpy[619] = -905414993;
        dx.cgpy[620] = -1070237035;
        dx.cgpy[621] = -1227314650;
        dx.cgpy[622] = 536021442;
        dx.cgpy[623] = -2066476821;
        dx.cgpy[624] = 969702713;
        dx.cgpy[625] = -1318177602;
        dx.cgpy[626] = 694827078;
        dx.cgpy[627] = -726921540;
        dx.cgpy[628] = -401383529;
        dx.cgpy[629] = 915771816;
        dx.cgpy[630] = 1146007952;
        dx.cgpy[631] = 1231062964;
        dx.cgpy[632] = -2112868467;
        dx.cgpy[633] = -1284833755;
        dx.cgpy[634] = -1174082483;
        dx.cgpy[635] = -658135641;
        dx.cgpy[636] = -1454188664;
        dx.cgpy[637] = -1265771148;
        dx.cgpy[638] = -1330386474;
        dx.cgpy[639] = -32575709;
        dx.cgpy[640] = 277705553;
        dx.cgpy[641] = 400574008;
        dx.cgpy[642] = 2073100761;
        dx.cgpy[643] = -879420646;
        dx.cgpy[644] = -1139364887;
        dx.cgpy[645] = -613810731;
        dx.cgpy[646] = 345912449;
        dx.cgpy[647] = -2005239441;
        dx.cgpy[648] = 1889122138;
        dx.cgpy[649] = 1025384797;
        dx.cgpy[650] = -963341820;
        dx.cgpy[651] = -604629208;
        dx.cgpy[652] = -1972378211;
        dx.cgpy[653] = 493669437;
        dx.cgpy[654] = -766433732;
        dx.cgpy[655] = -1664416651;
        dx.cgpy[656] = -2147415985;
        dx.cgpy[657] = -781518873;
        dx.cgpy[658] = 535595383;
        dx.cgpy[659] = -1075874062;
        dx.cgpy[660] = -812244572;
        dx.cgpy[661] = -1884933712;
        dx.cgpy[662] = 813312650;
        dx.cgpy[663] = -978498519;
        dx.cgpy[664] = 1999867547;
        dx.cgpy[665] = 2044939002;
        dx.cgpy[666] = 799647276;
        dx.cgpy[667] = -1982222246;
        dx.cgpy[668] = 1286545523;
        dx.cgpy[669] = 139814805;
        dx.cgpy[670] = 223723392;
        dx.cgpy[671] = 416935293;
        dx.cgpy[672] = 1451874653;
        dx.cgpy[673] = -1949495710;
        dx.cgpy[674] = -1011757581;
        dx.cgpy[675] = 2036835975;
        dx.cgpy[676] = -1705230222;
        dx.cgpy[677] = 1647648825;
        dx.cgpy[678] = -551583513;
        dx.cgpy[679] = 1034803468;
        dx.cgpy[680] = 1066190974;
        dx.cgpy[681] = -789299380;
        dx.cgpy[682] = 1227150363;
        dx.cgpy[683] = -1636834526;
        dx.cgpy[684] = -2090925464;
        dx.cgpy[685] = -1578272397;
        dx.cgpy[686] = 1444527428;
        dx.cgpy[687] = 1704340204;
        dx.cgpy[688] = -1496443810;
        dx.cgpy[689] = -1723700074;
        dx.cgpy[690] = -1000838119;
        dx.cgpy[691] = 1925286184;
        dx.cgpy[692] = -1396884938;
        dx.cgpy[693] = -1829298359;
        dx.cgpy[694] = -405468819;
        dx.cgpy[695] = -334270215;
        dx.cgpy[696] = -1173872336;
        dx.cgpy[697] = -2023359339;
        dx.cgpy[698] = 2145773497;
        dx.cgpy[699] = 1752637663;
    }

    private static /* synthetic */ void cjde() {
        dx.cgqd[200] = 7587230252441478663L;
        dx.cgqd[201] = -8447835091417118537L;
        dx.cgqd[202] = -8401164042166331175L;
        dx.cgqd[203] = 9148313548142424123L;
        dx.cgqd[204] = -1140900304559531878L;
        dx.cgqd[205] = -8962353999409689518L;
        dx.cgqd[206] = 7413842063570605462L;
        dx.cgqd[207] = -5736036816169915073L;
        dx.cgqd[208] = -1397879154441978512L;
        dx.cgqd[209] = 6256725523768159952L;
        dx.cgqd[210] = 7747273607364697771L;
        dx.cgqd[211] = -3155823066272923553L;
        dx.cgqd[212] = 3959772268416732498L;
        dx.cgqd[213] = 1179569722494252225L;
        dx.cgqd[214] = -3420790954237876316L;
        dx.cgqd[215] = -4117095067994301799L;
        dx.cgqd[216] = -6192470909182977486L;
        dx.cgqd[217] = 4924700037161200350L;
        dx.cgqd[218] = -4505277852093837324L;
        dx.cgqd[219] = 6713745396345414981L;
        dx.cgqd[220] = -7732106551581654335L;
        dx.cgqd[221] = -1471967608687256049L;
        dx.cgqd[222] = 729647890937963043L;
        dx.cgqd[223] = 9158778840816823875L;
        dx.cgqd[224] = 8134180247570133167L;
        dx.cgqd[225] = 373043709492047648L;
        dx.cgqd[226] = -8946248887671416084L;
        dx.cgqd[227] = -5848649804656875637L;
        dx.cgqd[228] = 7593773940586180677L;
        dx.cgqd[229] = -3840582578013716399L;
        dx.cgqd[230] = -2943667799123872161L;
        dx.cgqd[231] = 246222416205014674L;
        dx.cgqd[232] = 9014586639111134176L;
        dx.cgqd[233] = -5193838102381919303L;
        dx.cgqd[234] = -4479662393808922725L;
        dx.cgqd[235] = -9126447093249142721L;
        dx.cgqd[236] = -5218676543253427565L;
        dx.cgqd[237] = -345705695769957516L;
        dx.cgqd[238] = -2299856252262624562L;
        dx.cgqd[239] = 6018184506586210826L;
        dx.cgqd[240] = 6519647991163567424L;
        dx.cgqd[241] = -1688480497967204223L;
        dx.cgqd[242] = 9116008286925686484L;
        dx.cgqd[243] = 8518800802859390768L;
        dx.cgqd[244] = -4973203804798126236L;
        dx.cgqd[245] = 219059005752062647L;
        dx.cgqd[246] = 6364315090308024027L;
        dx.cgqd[247] = 5402765130335294523L;
        dx.cgqd[248] = -5697479777207078261L;
        dx.cgqd[249] = 8233087748979309464L;
        dx.cgqd[250] = 4466982615166707811L;
        dx.cgqd[251] = 7646883000368500995L;
        dx.cgqd[252] = -8672211598481354079L;
        dx.cgqd[253] = -8343185185134424157L;
        dx.cgqd[254] = 3716045349120339642L;
        dx.cgqd[255] = -54218024387515695L;
        dx.cgqd[256] = -3394355277857229236L;
        dx.cgqd[257] = 9204958802493842164L;
        dx.cgqd[258] = -5505104187423318437L;
        dx.cgqd[259] = -7683782226355984588L;
        dx.cgqd[260] = -4236959239232353533L;
        dx.cgqd[261] = -344179316405008120L;
        dx.cgqd[262] = 6296911938597060437L;
        dx.cgqd[263] = -8778444911466149467L;
        dx.cgqd[264] = -7165688517667601927L;
        dx.cgqd[265] = -104523410909207827L;
        dx.cgqd[266] = -6043946859851470339L;
        dx.cgqd[267] = -3614487907191357517L;
        dx.cgqd[268] = 1833183996653077752L;
        dx.cgqd[269] = 8450284255424312756L;
        dx.cgqd[270] = -70278586675048837L;
        dx.cgqd[271] = -5704912890783282274L;
        dx.cgqd[272] = -7853002878448043898L;
        dx.cgqd[273] = -8907022661889718489L;
        dx.cgqd[274] = 8856483575945293884L;
        dx.cgqd[275] = -8644946286523866474L;
        dx.cgqd[276] = 2670282447774015088L;
        dx.cgqd[277] = 307003326721199301L;
        dx.cgqd[278] = 3095324261844281116L;
        dx.cgqd[279] = -1932917652391419907L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float animatedCircleProgress(dx$EffectRow var1_1, float var2_2) {
        v0 /* !! */  = dx.fu;
        if (true) ** GOTO lbl5
        block59: while (true) {
            v0 /* !! */  = (long)(dx.cgpz("chsz", cgre(int ), (int)55) - dx.cgpz("chsx", cgre(int ), (int)54));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -55832418: {
                    continue block59;
                }
                case 1117133235: {
                    break block59;
                }
            }
            break;
        }
        var8_3 = dx.c;
        v1 /* !! */  = dx.fu;
        if (true) ** GOTO lbl15
        block60: while (true) {
            v1 /* !! */  = (long)(v2 - dx.cgpz("chta", cgre(int ), (int)56));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1976769995: {
                    v2 = dx.cgpz("chtg", cgre(int ), (int)57);
                    continue block60;
                }
                case 271042021: {
                    v2 = dx.cgpz("chth", cgre(int ), (int)58);
                    continue block60;
                }
                case 1117133235: {
                    break block60;
                }
            }
            break;
        }
        var7_4 /* !! */  = dx.b;
        v3 /* !! */  = dx.fu;
        if (true) ** GOTO lbl29
        block61: while (true) {
            v3 /* !! */  = (long)(dx.cgpz("chtk", cgre(int ), (int)60) - dx.cgpz("chti", cgre(int ), (int)59));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -837518601: {
                    continue block61;
                }
                case 1117133235: {
                    break block61;
                }
            }
            break;
        }
        var6_5 = dx.a;
        if (var7_4 /* !! */  == 0) ** GOTO lbl-1000
        block13 : switch (var7_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_3) {
                    throw null;
lbl40:
                    // 10 sources

                    return (float)dx.cgpz("chtm", cgqj(int ), (int)489);
                }
                if (var6_5 || var6_5) ** GOTO lbl40
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = dx.fu - dx.cgpz("chto", cgre(int ), (int)61)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == dx.cgpz("chtq", cgpw(int ), (int)490)) break;
                    v4 /* !! */  = (long)dx.cgpz("chtu", cgpw(int ), (int)491);
                }
                var3_6 = this.targetCircleProgress(var1_1);
                if (var6_5 || var6_5) ** GOTO lbl40
                v5 /* !! */  = dx.fu;
                if (true) ** GOTO lbl54
                block64: while (true) {
                    v5 /* !! */  = (long)(dx.cgpz("chty", cgre(int ), (int)63) - dx.cgpz("chtw", cgre(int ), (int)62));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 299423871: {
                            continue block64;
                        }
                        case 1117133235: {
                            break block64;
                        }
                    }
                    break;
                }
                v6 /* !! */  = dx.fu;
                if (true) ** GOTO lbl63
                block65: while (true) {
                    v6 /* !! */  = (long)(v7 - dx.cgpz("chtz", cgre(int ), (int)64));
lbl63:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1351142249: {
                            v7 = dx.cgpz("chua", cgre(int ), (int)65);
                            continue block65;
                        }
                        case 1117133235: {
                            break block65;
                        }
                        case 1168108884: {
                            v7 = dx.cgpz("chub", cgre(int ), (int)66);
                            continue block65;
                        }
                    }
                    break;
                }
                v8 = var1_1.id();
                v9 /* !! */  = dx.fu;
                if (true) ** GOTO lbl77
                block66: while (true) {
                    v9 /* !! */  = (long)(v10 - dx.cgpz("chud", cgre(int ), (int)67));
lbl77:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -2013967786: {
                            v10 = dx.cgpz("chui", cgre(int ), (int)68);
                            continue block66;
                        }
                        case -889299135: {
                            v10 = dx.cgpz("chul", cgre(int ), (int)69);
                            continue block66;
                        }
                        case 1117133235: {
                            break block66;
                        }
                    }
                    break;
                }
                var4_7 = this.circleProgress.get(v8);
                if (var6_5 || var6_5) ** GOTO lbl40
                if (var4_7 != null) ** GOTO lbl94
                if (var6_5) ** GOTO lbl40
                v11 = var3_6;
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl107
lbl94:
                // 1 sources

                if (var6_5 || var6_5) ** GOTO lbl40
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_1 = dx.fu - dx.cgpz("chup", cgre(int ), (int)70)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == dx.cgpz("chuq", cgpw(int ), (int)492)) break;
                    v12 /* !! */  = (long)dx.cgpz("chur", cgpw(int ), (int)493);
                }
                v13 = var4_7.floatValue();
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_2 = dx.fu - dx.cgpz("chus", cgre(int ), (int)71)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == dx.cgpz("chuu", cgpw(int ), (int)494)) break;
                    v14 /* !! */  = (long)dx.cgpz("chvb", cgpw(int ), (int)495);
                }
                v11 = var5_8 = v13 + (var3_6 - var4_7.floatValue()) * var2_2;
lbl107:
                // 2 sources

                if (var6_5 || var6_5) ** GOTO lbl40
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_3 = dx.fu - dx.cgpz("chvd", cgre(int ), (int)72)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == dx.cgpz("chve", cgpw(int ), (int)496)) break;
                    v15 /* !! */  = (long)dx.cgpz("chvf", cgpw(int ), (int)497);
                }
                if (!(Math.abs(var3_6 - var5_8) < dx.cgpz("chvg", cgqj(int ), (int)498))) ** GOTO lbl117
                if (var6_5) ** GOTO lbl40
                var5_8 = var3_6;
                if (var6_5) ** GOTO lbl40
lbl117:
                // 2 sources

                if (var6_5 || var6_5) ** GOTO lbl40
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_4 = dx.fu - dx.cgpz("chvj", cgre(int ), (int)73)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == dx.cgpz("chvm", cgpw(int ), (int)499)) break;
                    v16 /* !! */  = (long)dx.cgpz("chvr", cgpw(int ), (int)500);
                }
                v17 /* !! */  = dx.fu;
                if (true) ** GOTO lbl127
                block71: while (true) {
                    v17 /* !! */  = (long)(v18 - dx.cgpz("chvt", cgre(int ), (int)74));
lbl127:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -670652863: {
                            v18 = dx.cgpz("chvu", cgre(int ), (int)75);
                            continue block71;
                        }
                        case 1117133235: {
                            break block71;
                        }
                        case 2109262538: {
                            v18 = dx.cgpz("chvv", cgre(int ), (int)76);
                            continue block71;
                        }
                    }
                    break;
                }
                v19 = var1_1.id();
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_5 = dx.fu - dx.cgpz("chvw", cgre(int ), (int)77)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == dx.cgpz("chvy", cgpw(int ), (int)501)) break;
                    v20 /* !! */  = (long)dx.cgpz("chvz", cgpw(int ), (int)502);
                }
                v21 = Float.valueOf(var5_8);
                v22 /* !! */  = dx.fu;
                if (true) ** GOTO lbl147
                block73: while (true) {
                    v22 /* !! */  = (long)(v23 - dx.cgpz("chwd", cgre(int ), (int)78));
lbl147:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -2039934806: {
                            v23 = dx.cgpz("chwf", cgre(int ), (int)79);
                            continue block73;
                        }
                        case 1117133235: {
                            break block73;
                        }
                        case 2141551468: {
                            v23 = dx.cgpz("chwh", cgre(int ), (int)80);
                            continue block73;
                        }
                    }
                    break;
                }
                this.circleProgress.put(v19, v21);
                if (!var6_5 && !var6_5) ** break;
                ** continue;
                return var5_8;
            }
lbl161:
            // 2 sources

            case 0: {
                var7_4 /* !! */  = (int)dx.cgpz("chwk", cgpw(int ), (int)503);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl203
            }
lbl166:
            // 4 sources

            case 1: {
                var7_4 /* !! */  = (int)dx.cgpz("chwl", cgpw(int ), (int)504);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl171:
            // 2 sources

            case 2: {
                var7_4 /* !! */  = (int)dx.cgpz("chwm", cgpw(int ), (int)505);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl176:
            // 2 sources

            case 3: {
                var7_4 /* !! */  = (int)dx.cgpz("chwn", cgpw(int ), (int)506);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl181:
            // 3 sources

            case 4: {
                var7_4 /* !! */  = (int)dx.cgpz("chwq", cgpw(int ), (int)507);
                if (!var8_3) ** GOTO lbl166
                throw null;
            }
lbl185:
            // 2 sources

            case 5: {
                var7_4 /* !! */  = (int)dx.cgpz("chwr", cgpw(int ), (int)508);
                if (!var8_3) ** GOTO lbl161
                throw null;
            }
lbl189:
            // 2 sources

            case 6: {
                var7_4 /* !! */  = (int)dx.cgpz("chws", cgpw(int ), (int)509);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl227
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_4 /* !! */  = (int)dx.cgpz("chwt", cgpw(int ), (int)510);
                    if (!var8_3) break block13;
                    throw null;
                }
            }
            case 8: {
                var7_4 /* !! */  = (int)dx.cgpz("chwu", cgpw(int ), (int)511);
                if (!var8_3) ** GOTO lbl171
                throw null;
            }
lbl203:
            // 3 sources

            case 9: {
                var7_4 /* !! */  = (int)dx.cgpz("chwv", cgpw(int ), (int)512);
                if (!var8_3) ** GOTO lbl185
                throw null;
            }
lbl207:
            // 2 sources

            case 10: {
                var7_4 /* !! */  = (int)dx.cgpz("chww", cgpw(int ), (int)513);
                if (!var8_3) ** GOTO lbl166
                throw null;
            }
            case 11: {
                var7_4 /* !! */  = (int)dx.cgpz("chxe", cgpw(int ), (int)514);
                if (!var8_3) ** GOTO lbl181
                throw null;
            }
            case 12: {
                var7_4 /* !! */  = (int)dx.cgpz("chxf", cgpw(int ), (int)515);
                if (!var8_3) ** GOTO lbl203
                throw null;
            }
lbl219:
            // 2 sources

            case 13: {
                var7_4 /* !! */  = (int)dx.cgpz("chxg", cgpw(int ), (int)516);
                if (!var8_3) ** GOTO lbl181
                throw null;
            }
lbl223:
            // 3 sources

            case 14: {
                var7_4 /* !! */  = (int)dx.cgpz("chxi", cgpw(int ), (int)517);
                if (!var8_3) ** GOTO lbl166
                throw null;
            }
lbl227:
            // 2 sources

            case 15: {
                var7_4 /* !! */  = (int)dx.cgpz("chxk", cgpw(int ), (int)518);
                if (var8_3) {
                    throw null;
                }
            }
            case 16: {
                var7_4 /* !! */  = (int)dx.cgpz("chxn", cgpw(int ), (int)519);
                if (!var8_3) ** GOTO lbl223
                throw null;
            }
            case 17: {
                var7_4 /* !! */  = (int)dx.cgpz("chxp", cgpw(int ), (int)520);
                if (!var8_3) ** GOTO lbl223
                throw null;
            }
            case 18: {
                var7_4 /* !! */  = (int)dx.cgpz("chxx", cgpw(int ), (int)521);
                if (!var8_3) ** GOTO lbl176
                throw null;
            }
            case 19: 
        }
        var7_4 /* !! */  = (int)dx.cgpz("chxz", cgpw(int ), (int)522);
        ** while (!var8_3)
lbl246:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cjdf() {
        dx.cgqe[0] = -135442042585442056L;
        dx.cgqe[1] = -5989682440550324833L;
        dx.cgqe[2] = 5724488601772671506L;
        dx.cgqe[3] = 292111199286812402L;
        dx.cgqe[4] = 7468956052340311713L;
        dx.cgqe[5] = 3910474192292648511L;
        dx.cgqe[6] = -6886032308914455993L;
        dx.cgqe[7] = -5206746384172655014L;
        dx.cgqe[8] = -553002940110082027L;
        dx.cgqe[9] = 4923657507730192204L;
        dx.cgqe[10] = -4129790707822588774L;
        dx.cgqe[11] = 9017228925238764362L;
        dx.cgqe[12] = -7276261661081016023L;
        dx.cgqe[13] = 2678083304850787455L;
        dx.cgqe[14] = 6684430047510253673L;
        dx.cgqe[15] = -424194348474493549L;
        dx.cgqe[16] = 5341398470858174737L;
        dx.cgqe[17] = -7350109117159110860L;
        dx.cgqe[18] = 7337967282988818533L;
        dx.cgqe[19] = 3187213888578823590L;
        dx.cgqe[20] = -8789111149926126486L;
        dx.cgqe[21] = -5123869068126579769L;
        dx.cgqe[22] = -6012540663909489362L;
        dx.cgqe[23] = -953111209258378878L;
        dx.cgqe[24] = 5551370593804157436L;
        dx.cgqe[25] = -2935677218198981253L;
        dx.cgqe[26] = -1406460189194262038L;
        dx.cgqe[27] = 7541629212001884562L;
        dx.cgqe[28] = -3503491087042547686L;
        dx.cgqe[29] = -4425841019212222456L;
        dx.cgqe[30] = 1175604910479419168L;
        dx.cgqe[31] = 5803947975308910615L;
        dx.cgqe[32] = 4533208630141163038L;
        dx.cgqe[33] = 5063500478697410029L;
        dx.cgqe[34] = -314489960174266601L;
        dx.cgqe[35] = -4786869687553169299L;
        dx.cgqe[36] = 2747314892696263461L;
        dx.cgqe[37] = 6155121213317220269L;
        dx.cgqe[38] = 9012078978775367116L;
        dx.cgqe[39] = -5786081857333654431L;
        dx.cgqe[40] = 7996676855227248780L;
        dx.cgqe[41] = -8326526200842327209L;
        dx.cgqe[42] = 8544891497121651260L;
        dx.cgqe[43] = 6369949532780816981L;
        dx.cgqe[44] = -1311275214838114257L;
        dx.cgqe[45] = 5938203619862382066L;
        dx.cgqe[46] = 38371237804062132L;
        dx.cgqe[47] = -6289683127604453238L;
        dx.cgqe[48] = -4474497038252110855L;
        dx.cgqe[49] = 7209331053415115451L;
        dx.cgqe[50] = -1198721001831065652L;
        dx.cgqe[51] = 6630250514942804503L;
        dx.cgqe[52] = 5934066544415151399L;
        dx.cgqe[53] = 884049213009376233L;
        dx.cgqe[54] = -7969785139008509622L;
        dx.cgqe[55] = 6842384480715586142L;
        dx.cgqe[56] = 5886000193180623574L;
        dx.cgqe[57] = 1489809132050348285L;
        dx.cgqe[58] = -3687174239264621186L;
        dx.cgqe[59] = 7240738842146771763L;
        dx.cgqe[60] = 5378120775897171142L;
        dx.cgqe[61] = 5905122210207139777L;
        dx.cgqe[62] = -2070010998470154757L;
        dx.cgqe[63] = 2627467271339385803L;
        dx.cgqe[64] = 534690659593119663L;
        dx.cgqe[65] = 813805041869123181L;
        dx.cgqe[66] = -1907392627457401380L;
        dx.cgqe[67] = -6103273252504663441L;
        dx.cgqe[68] = -1712259984155700999L;
        dx.cgqe[69] = -5526922930725166464L;
        dx.cgqe[70] = 4892311225327621725L;
        dx.cgqe[71] = -851274091391510559L;
        dx.cgqe[72] = -7125610390759902781L;
        dx.cgqe[73] = 252283820858244107L;
        dx.cgqe[74] = -2514404192697123845L;
        dx.cgqe[75] = 3678463983049843640L;
        dx.cgqe[76] = -5540743901742822914L;
        dx.cgqe[77] = 6248763903142657995L;
        dx.cgqe[78] = 5127789562302593677L;
        dx.cgqe[79] = 1964242324276955801L;
        dx.cgqe[80] = -6428778294517631413L;
        dx.cgqe[81] = 3671342391928391594L;
        dx.cgqe[82] = 8056343813917262226L;
        dx.cgqe[83] = 8778473185802692504L;
        dx.cgqe[84] = -375071208896157479L;
        dx.cgqe[85] = -3538606848895878021L;
        dx.cgqe[86] = 7110692250172249557L;
        dx.cgqe[87] = 5762699932042220500L;
        dx.cgqe[88] = 4127966387820293355L;
        dx.cgqe[89] = -1251189972678217251L;
        dx.cgqe[90] = 2340890957715476742L;
        dx.cgqe[91] = -1949056824128149720L;
        dx.cgqe[92] = -8201572704127254150L;
        dx.cgqe[93] = 7560248331641641043L;
        dx.cgqe[94] = -6613687799437438930L;
        dx.cgqe[95] = 1607713669347132533L;
        dx.cgqe[96] = 6745167275409561652L;
        dx.cgqe[97] = 7297241014030191523L;
        dx.cgqe[98] = -1704381171525972435L;
        dx.cgqe[99] = 5209557467573879978L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static dx$EffectRow demo(String var0, String var1_1, int var2_2, int var3_3, boolean var4_4) {
        block39: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = dx.fu - dx.cgpz("chij", cgre(int ), (int)31)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == dx.cgpz("chip", cgpw(int ), (int)401)) break;
                v0 /* !! */  = (long)dx.cgpz("chir", cgpw(int ), (int)402);
            }
            var8_5 = dx.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_2 = dx.fu - dx.cgpz("chis", cgre(int ), (int)32)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == dx.cgpz("chit", cgpw(int ), (int)403)) break;
                v1 /* !! */  = (long)dx.cgpz("chiu", cgpw(int ), (int)404);
            }
            var7_6 /* !! */  = dx.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_3 = dx.fu - dx.cgpz("chiv", cgre(int ), (int)33)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == dx.cgpz("chiw", cgpw(int ), (int)405)) {
                    var6_7 = dx.a;
                    if (var8_5) {
                        throw null;
                    }
                    break;
                }
                v2 /* !! */  = (long)dx.cgpz("chja", cgpw(int ), (int)406);
            }
            if (var6_7 != false) return null;
            if (var6_7 != false) return null;
            v3 /* !! */  = dx.fu;
            if (true) ** GOTO lbl28
            block25: while (true) {
                v3 /* !! */  = (long)(v4 - dx.cgpz("chjb", cgre(int ), (int)34));
lbl28:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1494380263: {
                        v4 = dx.cgpz("chjd", cgre(int ), (int)35);
                        continue block25;
                    }
                    case 1117133235: {
                        break block25;
                    }
                    case 1288169993: {
                        v4 = dx.cgpz("chjf", cgre(int ), (int)36);
                        continue block25;
                    }
                    case 1644703087: {
                        v4 = dx.cgpz("chjh", cgre(int ), (int)37);
                        continue block25;
                    }
                }
                break;
            }
            var5_8 = class_2960.method_60655((String)"minecraft", (String)var0);
            if (var7_6 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block26: do {
                switch (cfr_temp_0 == -2147483648 ? var7_6 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var6_7 != false) return null;
                        if (var6_7 != false) return null;
                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_4 = dx.fu - dx.cgpz("chji", cgre(int ), (int)38)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v5 /* !! */  != dx.cgpz("chjj", cgpw(int ), (int)407)) {
                                v5 /* !! */  = (long)dx.cgpz("chjq", cgpw(int ), (int)408);
                                continue;
                            }
                            ** GOTO lbl67
                            break;
                        }
                    }
                    case 1: {
                        ** GOTO lbl91
                    }
                    case 4: {
                        var7_6 /* !! */  = (int)dx.cgpz("chkm", cgpw(int ), (int)415);
                        if (var8_5) {
                            throw null;
                        }
                    }
                    case 0: {
                        var7_6 /* !! */  = (int)dx.cgpz("chkg", cgpw(int ), (int)411);
                        if (var8_5) {
                            throw null;
                        }
                        break block39;
                    }
                    case 5: {
                        break block39;
                    }
lbl67:
                    // 1 sources

                    while (true) {
                        if ((v6 /* !! */  = (cfr_temp_5 = dx.fu - dx.cgpz("chjs", cgre(int ), (int)39)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v6 /* !! */  == dx.cgpz("chjt", cgpw(int ), (int)409)) break;
                        v6 /* !! */  = (long)dx.cgpz("chju", cgpw(int ), (int)410);
                    }
                    v7 = "demo:" + var0;
                    v8 /* !! */  = dx.fu;
                    block29: while (true) {
                        switch ((int)v8 /* !! */ ) {
                            case -847706577: {
                                v8 /* !! */  = (long)(dx.cgpz("chjw", cgre(int ), (int)41) - dx.cgpz("chjv", cgre(int ), (int)40));
                                continue block29;
                            }
                            case 1117133235: {
                                break block29;
                            }
                        }
                        break;
                    }
                    v9 = dx.effectTexture(var5_8);
                    v10 /* !! */  = dx.fu;
                    block30: while (true) {
                        switch ((int)v10 /* !! */ ) {
                            case 8560773: {
                                v10 /* !! */  = (long)(dx.cgpz("chke", cgre(int ), (int)43) - dx.cgpz("chkd", cgre(int ), (int)42));
                                continue block30;
                            }
                            case 1117133235: {
                                return new dx$EffectRow(v7, var1_1, var2_2, var3_3, var4_4, v9);
                            }
                        }
                        break;
                    }
                    return new dx$EffectRow(v7, var1_1, var2_2, var3_3, var4_4, v9);
lbl91:
                    // 2 sources

                    while (true) {
                        var7_6 /* !! */  = (int)dx.cgpz("chkh", cgpw(int ), (int)412);
                        cfr_temp_0 = 2;
                        if (!var8_5) continue block26;
                        throw null;
                    }
                    case 2: {
                        var7_6 /* !! */  = (int)dx.cgpz("chki", cgpw(int ), (int)413);
                        if (var8_5) {
                            throw null;
                        }
                    }
                    case 3: 
                }
                break;
            } while (true);
            var7_6 /* !! */  = (int)dx.cgpz("chkk", cgpw(int ), (int)414);
            if (var8_5) {
                throw null;
            }
        }
        var7_6 /* !! */  = (int)dx.cgpz("chkq", cgpw(int ), (int)416);
        ** while (!var8_5)
lbl109:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public dx() {
        var2_1 /* !! */  = dx.b;
        super("Effects", (int)dx.cgpz("cgqa", cgpw(int ), (int)0), (int)dx.cgpz("cgqb", cgpw(int ), (int)1), (int)Math.ceil((double)dx.cgpz("cgqf", cgqc(int ), (int)0)), (int)Math.ceil((double)dx.cgpz("cgqg", cgqc(int ), (int)1)), (boolean)dx.cgpz("cgqh", cgpw(int ), (int)2));
        this.timers = new HashMap<String, dx$RollingText>();
        this.clocks = new HashMap<String, dx$TickClock>();
        this.observedDurations = new HashMap<String, Integer>();
        this.circleProgress = new HashMap<String, Float>();
        this.animatedRows = new LinkedHashMap<String, dx$AnimatedEffectRow>();
        this.collectedRows = new ArrayList<dx$EffectRow>();
        this.animatedRowBuffer = new ArrayList<dx$AnimatedEffectRow>();
        this.activeIdBuffer = new HashSet<String>();
        this.targetIdBuffer = new HashSet<String>();
        this.collectedPlayerAge = (int)dx.cgpz("cgqi", cgpw(int ), (int)3);
        this.animatedLeftWidth = (float)dx.cgpz("cgqk", cgqj(int ), (int)4);
        this.animatedTimerWidth = (float)dx.cgpz("cgql", cgqj(int ), (int)5);
        this.animatedListHeight = (float)dx.cgpz("cgqm", cgqj(int ), (int)6);
        this.lastAnimationFrame = System.nanoTime();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)dx.cgpz("cgqn", cgpw(int ), (int)7);
                ** GOTO lbl48
            }
lbl24:
            // 4 sources

            case 1: {
                var2_1 /* !! */  = (int)dx.cgpz("cgqo", cgpw(int ), (int)8);
                ** GOTO lbl62
            }
            case 2: {
                var2_1 /* !! */  = (int)dx.cgpz("cgqp", cgpw(int ), (int)9);
                ** GOTO lbl39
            }
lbl30:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)dx.cgpz("cgqq", cgpw(int ), (int)10);
                ** GOTO lbl24
            }
            case 4: {
                var2_1 /* !! */  = (int)dx.cgpz("cgqr", cgpw(int ), (int)11);
                break;
            }
            case 5: {
                var2_1 /* !! */  = (int)dx.cgpz("cgqs", cgpw(int ), (int)12);
                break;
            }
lbl39:
            // 2 sources

            case 6: {
                var2_1 /* !! */  = (int)dx.cgpz("cgqt", cgpw(int ), (int)13);
                ** GOTO lbl53
            }
            case 7: {
                var2_1 /* !! */  = (int)dx.cgpz("cgqu", cgpw(int ), (int)14);
                ** GOTO lbl65
            }
            case 8: {
                var2_1 /* !! */  = (int)dx.cgpz("cgqv", cgpw(int ), (int)15);
                ** GOTO lbl59
            }
lbl48:
            // 2 sources

            case 9: {
                var2_1 /* !! */  = (int)dx.cgpz("cgqw", cgpw(int ), (int)16);
            }
            case 10: {
                var2_1 /* !! */  = (int)dx.cgpz("cgqx", cgpw(int ), (int)17);
                ** GOTO lbl59
            }
lbl53:
            // 4 sources

            case 11: {
                var2_1 /* !! */  = (int)dx.cgpz("cgqy", cgpw(int ), (int)18);
                ** GOTO lbl30
            }
            case 12: {
                var2_1 /* !! */  = (int)dx.cgpz("cgqz", cgpw(int ), (int)19);
                ** GOTO lbl53
            }
lbl59:
            // 3 sources

            case 13: {
                var2_1 /* !! */  = (int)dx.cgpz("cgra", cgpw(int ), (int)20);
                ** GOTO lbl24
            }
lbl62:
            // 2 sources

            case 14: {
                var2_1 /* !! */  = (int)dx.cgpz("cgrb", cgpw(int ), (int)21);
                ** GOTO lbl24
            }
lbl65:
            // 2 sources

            case 15: {
                var2_1 /* !! */  = (int)dx.cgpz("cgrc", cgpw(int ), (int)22);
                ** GOTO lbl53
            }
            case 16: 
        }
        while (true) {
            var2_1 /* !! */  = (int)dx.cgpz("cgrd", cgpw(int ), (int)23);
        }
    }

    private static /* synthetic */ void cjci() {
        dx.cgpx[0] = -1643746447;
        dx.cgpx[1] = -832049911;
        dx.cgpx[2] = 360009529;
        dx.cgpx[3] = 1626639683;
        dx.cgpx[4] = -1593413924;
        dx.cgpx[5] = 1909825098;
        dx.cgpx[6] = -251821631;
        dx.cgpx[7] = -508433830;
        dx.cgpx[8] = -1813279263;
        dx.cgpx[9] = 1653013106;
        dx.cgpx[10] = 723701758;
        dx.cgpx[11] = -114821893;
        dx.cgpx[12] = -925982069;
        dx.cgpx[13] = 1662005889;
        dx.cgpx[14] = -1424524972;
        dx.cgpx[15] = -609824190;
        dx.cgpx[16] = -1344380235;
        dx.cgpx[17] = -2038032802;
        dx.cgpx[18] = -2117916394;
        dx.cgpx[19] = 984754115;
        dx.cgpx[20] = 1042248434;
        dx.cgpx[21] = 930593809;
        dx.cgpx[22] = -78251103;
        dx.cgpx[23] = 978154305;
        dx.cgpx[24] = -1746053683;
        dx.cgpx[25] = 782743568;
        dx.cgpx[26] = 142158771;
        dx.cgpx[27] = -701574832;
        dx.cgpx[28] = 244605556;
        dx.cgpx[29] = 1030101677;
        dx.cgpx[30] = 1563910994;
        dx.cgpx[31] = -1347627012;
        dx.cgpx[32] = -516048497;
        dx.cgpx[33] = -612389643;
        dx.cgpx[34] = -377342646;
        dx.cgpx[35] = 75232357;
        dx.cgpx[36] = 539984500;
        dx.cgpx[37] = -1716764131;
        dx.cgpx[38] = 1590810375;
        dx.cgpx[39] = -2070645509;
        dx.cgpx[40] = -819002750;
        dx.cgpx[41] = 846326171;
        dx.cgpx[42] = 1736604261;
        dx.cgpx[43] = -1855167988;
        dx.cgpx[44] = 45227088;
        dx.cgpx[45] = 52136754;
        dx.cgpx[46] = 667304680;
        dx.cgpx[47] = 242678828;
        dx.cgpx[48] = -501710436;
        dx.cgpx[49] = 1505512;
        dx.cgpx[50] = 964921340;
        dx.cgpx[51] = 43864142;
        dx.cgpx[52] = 2087860138;
        dx.cgpx[53] = 1895867568;
        dx.cgpx[54] = -1567236041;
        dx.cgpx[55] = 1213246356;
        dx.cgpx[56] = -261063090;
        dx.cgpx[57] = -1411069948;
        dx.cgpx[58] = 605053634;
        dx.cgpx[59] = -938366474;
        dx.cgpx[60] = 53450454;
        dx.cgpx[61] = 1288167491;
        dx.cgpx[62] = 1105101401;
        dx.cgpx[63] = -1034960631;
        dx.cgpx[64] = -1453585945;
        dx.cgpx[65] = 397773446;
        dx.cgpx[66] = 918128976;
        dx.cgpx[67] = 418487244;
        dx.cgpx[68] = 755209085;
        dx.cgpx[69] = -2027538121;
        dx.cgpx[70] = -1202084651;
        dx.cgpx[71] = 474348789;
        dx.cgpx[72] = 133202902;
        dx.cgpx[73] = -1445080126;
        dx.cgpx[74] = -582727962;
        dx.cgpx[75] = 1274183987;
        dx.cgpx[76] = -354551524;
        dx.cgpx[77] = 815959762;
        dx.cgpx[78] = -1786541834;
        dx.cgpx[79] = 1176848827;
        dx.cgpx[80] = -2110015229;
        dx.cgpx[81] = 2117282914;
        dx.cgpx[82] = -174050808;
        dx.cgpx[83] = 509717807;
        dx.cgpx[84] = -864828995;
        dx.cgpx[85] = 18752549;
        dx.cgpx[86] = -514455956;
        dx.cgpx[87] = -2103495545;
        dx.cgpx[88] = 244188713;
        dx.cgpx[89] = -1026912420;
        dx.cgpx[90] = 1629135293;
        dx.cgpx[91] = 1275394959;
        dx.cgpx[92] = -1542277185;
        dx.cgpx[93] = -822954278;
        dx.cgpx[94] = -743973359;
        dx.cgpx[95] = -1472811130;
        dx.cgpx[96] = -70138094;
        dx.cgpx[97] = -213301420;
        dx.cgpx[98] = 1074313988;
        dx.cgpx[99] = -580728405;
    }

    private static /* synthetic */ void cjcp() {
        dx.cgpx[700] = -100874667;
        dx.cgpx[701] = -1351561324;
        dx.cgpx[702] = -1071806639;
        dx.cgpx[703] = 870704053;
        dx.cgpx[704] = -1655372601;
        dx.cgpx[705] = -1842528812;
        dx.cgpx[706] = 867307350;
        dx.cgpx[707] = -1384406262;
        dx.cgpx[708] = 641075483;
        dx.cgpx[709] = -567553130;
        dx.cgpx[710] = -794440378;
        dx.cgpx[711] = -1185600764;
        dx.cgpx[712] = 1137394594;
        dx.cgpx[713] = -891678478;
        dx.cgpx[714] = -1000204254;
        dx.cgpx[715] = -1926732218;
        dx.cgpx[716] = 65506872;
        dx.cgpx[717] = -1129972387;
        dx.cgpx[718] = 1805581586;
        dx.cgpx[719] = -246032772;
        dx.cgpx[720] = -1929479900;
        dx.cgpx[721] = 394286307;
        dx.cgpx[722] = 609167856;
        dx.cgpx[723] = 1449315249;
        dx.cgpx[724] = 1698624417;
        dx.cgpx[725] = 278939173;
        dx.cgpx[726] = -192149536;
        dx.cgpx[727] = -1346362530;
        dx.cgpx[728] = 1663550060;
        dx.cgpx[729] = -2014691666;
        dx.cgpx[730] = 910363664;
        dx.cgpx[731] = 1220119367;
        dx.cgpx[732] = 1729723319;
        dx.cgpx[733] = 1749377226;
        dx.cgpx[734] = -77556910;
        dx.cgpx[735] = 1806013514;
        dx.cgpx[736] = -1660880914;
        dx.cgpx[737] = 1686061550;
        dx.cgpx[738] = -257153468;
        dx.cgpx[739] = -433122951;
        dx.cgpx[740] = 451047424;
        dx.cgpx[741] = 2025066749;
        dx.cgpx[742] = 1467710418;
        dx.cgpx[743] = 739545310;
        dx.cgpx[744] = 953989380;
        dx.cgpx[745] = -1628468552;
        dx.cgpx[746] = 2061683975;
        dx.cgpx[747] = 205711495;
        dx.cgpx[748] = -323005304;
        dx.cgpx[749] = 840786798;
        dx.cgpx[750] = -1872867776;
        dx.cgpx[751] = -688119812;
        dx.cgpx[752] = -305838460;
        dx.cgpx[753] = -1029307464;
        dx.cgpx[754] = -681975534;
        dx.cgpx[755] = 923548121;
        dx.cgpx[756] = -944641795;
        dx.cgpx[757] = -25247711;
        dx.cgpx[758] = -205958526;
        dx.cgpx[759] = 1612818031;
        dx.cgpx[760] = 514599809;
        dx.cgpx[761] = -2126319406;
        dx.cgpx[762] = 1859435931;
        dx.cgpx[763] = 427251224;
        dx.cgpx[764] = -1173882141;
        dx.cgpx[765] = 1247643848;
        dx.cgpx[766] = 1434574783;
        dx.cgpx[767] = 1650114649;
        dx.cgpx[768] = -218842665;
        dx.cgpx[769] = 2107709077;
        dx.cgpx[770] = 2046588812;
        dx.cgpx[771] = 1173902534;
        dx.cgpx[772] = -2013066674;
        dx.cgpx[773] = 1613122331;
        dx.cgpx[774] = -1290993017;
        dx.cgpx[775] = 24978241;
        dx.cgpx[776] = -1226615838;
        dx.cgpx[777] = 103248531;
        dx.cgpx[778] = -672241072;
        dx.cgpx[779] = -79381136;
        dx.cgpx[780] = -1377715384;
        dx.cgpx[781] = 1360101122;
        dx.cgpx[782] = 1466463831;
        dx.cgpx[783] = -1883860591;
        dx.cgpx[784] = -1380219358;
        dx.cgpx[785] = 90801571;
        dx.cgpx[786] = 1503533099;
        dx.cgpx[787] = 1223051136;
        dx.cgpx[788] = -1917512213;
        dx.cgpx[789] = 1622137440;
        dx.cgpx[790] = -328472800;
        dx.cgpx[791] = 1430184493;
        dx.cgpx[792] = 781644617;
        dx.cgpx[793] = -1906825055;
        dx.cgpx[794] = -349939713;
        dx.cgpx[795] = -1481071033;
        dx.cgpx[796] = 423398795;
        dx.cgpx[797] = 694426003;
        dx.cgpx[798] = 1297470205;
        dx.cgpx[799] = 1247335946;
    }

    private static /* synthetic */ void cjcz() {
        dx.cgpy[700] = -100874670;
        dx.cgpy[701] = -1351561313;
        dx.cgpy[702] = -1071806631;
        dx.cgpy[703] = 870704050;
        dx.cgpy[704] = -1655372600;
        dx.cgpy[705] = -1842528828;
        dx.cgpy[706] = 867307335;
        dx.cgpy[707] = -1384406262;
        dx.cgpy[708] = 1709443355;
        dx.cgpy[709] = -1624273992;
        dx.cgpy[710] = -1851681432;
        dx.cgpy[711] = -1185600764;
        dx.cgpy[712] = 1137394594;
        dx.cgpy[713] = -891678478;
        dx.cgpy[714] = -1000204254;
        dx.cgpy[715] = -1926732218;
        dx.cgpy[716] = 65506872;
        dx.cgpy[717] = -1129972409;
        dx.cgpy[718] = 1805581617;
        dx.cgpy[719] = -246032833;
        dx.cgpy[720] = -1929479890;
        dx.cgpy[721] = 394286293;
        dx.cgpy[722] = 609167803;
        dx.cgpy[723] = 1449315251;
        dx.cgpy[724] = 1698624387;
        dx.cgpy[725] = 278939170;
        dx.cgpy[726] = -192149599;
        dx.cgpy[727] = -1346362506;
        dx.cgpy[728] = 1663550034;
        dx.cgpy[729] = -2014691708;
        dx.cgpy[730] = 910363671;
        dx.cgpy[731] = 1220119415;
        dx.cgpy[732] = 1729723275;
        dx.cgpy[733] = 1749377218;
        dx.cgpy[734] = -77556874;
        dx.cgpy[735] = 1806013440;
        dx.cgpy[736] = -1660880923;
        dx.cgpy[737] = 1686061563;
        dx.cgpy[738] = -257153456;
        dx.cgpy[739] = -433123013;
        dx.cgpy[740] = 451047443;
        dx.cgpy[741] = 2025066694;
        dx.cgpy[742] = 1467710405;
        dx.cgpy[743] = 739545335;
        dx.cgpy[744] = 953989429;
        dx.cgpy[745] = -1628468582;
        dx.cgpy[746] = 2061683988;
        dx.cgpy[747] = 205711532;
        dx.cgpy[748] = -323005295;
        dx.cgpy[749] = 840786800;
        dx.cgpy[750] = -1872867724;
        dx.cgpy[751] = -688119876;
        dx.cgpy[752] = -305838462;
        dx.cgpy[753] = -1029307482;
        dx.cgpy[754] = -681975516;
        dx.cgpy[755] = 923548155;
        dx.cgpy[756] = -944641872;
        dx.cgpy[757] = -25247706;
        dx.cgpy[758] = -205958463;
        dx.cgpy[759] = 1612818033;
        dx.cgpy[760] = 514599808;
        dx.cgpy[761] = -2126319417;
        dx.cgpy[762] = 1859435991;
        dx.cgpy[763] = 427251294;
        dx.cgpy[764] = -1173882162;
        dx.cgpy[765] = 1247643890;
        dx.cgpy[766] = 1434574777;
        dx.cgpy[767] = 1650114685;
        dx.cgpy[768] = -218842663;
        dx.cgpy[769] = 2107709064;
        dx.cgpy[770] = 2046588820;
        dx.cgpy[771] = 1173902477;
        dx.cgpy[772] = -2013066626;
        dx.cgpy[773] = 1613122307;
        dx.cgpy[774] = -1290992958;
        dx.cgpy[775] = 24978188;
        dx.cgpy[776] = -1226615895;
        dx.cgpy[777] = 103248603;
        dx.cgpy[778] = -672241061;
        dx.cgpy[779] = -79381179;
        dx.cgpy[780] = -1377715448;
        dx.cgpy[781] = 1360101162;
        dx.cgpy[782] = 1466463762;
        dx.cgpy[783] = -1883860595;
        dx.cgpy[784] = -1380219392;
        dx.cgpy[785] = 90801554;
        dx.cgpy[786] = 1503533117;
        dx.cgpy[787] = 1223051209;
        dx.cgpy[788] = -1917512220;
        dx.cgpy[789] = 1622137438;
        dx.cgpy[790] = -328472779;
        dx.cgpy[791] = 1430184498;
        dx.cgpy[792] = 781644644;
        dx.cgpy[793] = -1906824985;
        dx.cgpy[794] = -349939745;
        dx.cgpy[795] = -1481071012;
        dx.cgpy[796] = 423398794;
        dx.cgpy[797] = 93721203;
        dx.cgpy[798] = 1297470204;
        dx.cgpy[799] = -760978744;
    }

    private static /* synthetic */ void cjcx() {
        dx.cgpy[500] = -456114407;
        dx.cgpy[501] = -1266131776;
        dx.cgpy[502] = -479341665;
        dx.cgpy[503] = 460192981;
        dx.cgpy[504] = -1041452443;
        dx.cgpy[505] = -1915333088;
        dx.cgpy[506] = 1332472339;
        dx.cgpy[507] = 540212802;
        dx.cgpy[508] = 1537504020;
        dx.cgpy[509] = -681714071;
        dx.cgpy[510] = -62217557;
        dx.cgpy[511] = 290316742;
        dx.cgpy[512] = -1318337186;
        dx.cgpy[513] = -1659806765;
        dx.cgpy[514] = 986357444;
        dx.cgpy[515] = 1534901643;
        dx.cgpy[516] = 1696205818;
        dx.cgpy[517] = 188945786;
        dx.cgpy[518] = -1920075153;
        dx.cgpy[519] = -1430307636;
        dx.cgpy[520] = -134156753;
        dx.cgpy[521] = -1168768050;
        dx.cgpy[522] = -1098736176;
        dx.cgpy[523] = -494688801;
        dx.cgpy[524] = 979968784;
        dx.cgpy[525] = -1242414652;
        dx.cgpy[526] = 411298355;
        dx.cgpy[527] = 1724314045;
        dx.cgpy[528] = -87960414;
        dx.cgpy[529] = 1046001096;
        dx.cgpy[530] = 1815336385;
        dx.cgpy[531] = 2073847998;
        dx.cgpy[532] = 1349586010;
        dx.cgpy[533] = 390992688;
        dx.cgpy[534] = 290344117;
        dx.cgpy[535] = 1656540078;
        dx.cgpy[536] = 432284819;
        dx.cgpy[537] = -853339667;
        dx.cgpy[538] = -517885803;
        dx.cgpy[539] = -481692641;
        dx.cgpy[540] = -764071796;
        dx.cgpy[541] = -1285632613;
        dx.cgpy[542] = 299335012;
        dx.cgpy[543] = -640904161;
        dx.cgpy[544] = -952010646;
        dx.cgpy[545] = 212622624;
        dx.cgpy[546] = 213567472;
        dx.cgpy[547] = -494859586;
        dx.cgpy[548] = -982550987;
        dx.cgpy[549] = -1949943793;
        dx.cgpy[550] = 1043019730;
        dx.cgpy[551] = -301979767;
        dx.cgpy[552] = 589972431;
        dx.cgpy[553] = 119400009;
        dx.cgpy[554] = 39782118;
        dx.cgpy[555] = -155746665;
        dx.cgpy[556] = -1357757679;
        dx.cgpy[557] = 1758877227;
        dx.cgpy[558] = 364338209;
        dx.cgpy[559] = -1188948394;
        dx.cgpy[560] = 434033401;
        dx.cgpy[561] = 839116133;
        dx.cgpy[562] = 2004750075;
        dx.cgpy[563] = 1671517832;
        dx.cgpy[564] = 1844281409;
        dx.cgpy[565] = 1584602015;
        dx.cgpy[566] = -1303984885;
        dx.cgpy[567] = 1994515970;
        dx.cgpy[568] = -49372339;
        dx.cgpy[569] = -366202097;
        dx.cgpy[570] = 265696536;
        dx.cgpy[571] = 597901504;
        dx.cgpy[572] = -523328945;
        dx.cgpy[573] = -1956414043;
        dx.cgpy[574] = -2082295673;
        dx.cgpy[575] = 1458431715;
        dx.cgpy[576] = -1478405292;
        dx.cgpy[577] = -1634140041;
        dx.cgpy[578] = -1838217642;
        dx.cgpy[579] = -1974351257;
        dx.cgpy[580] = 1724814782;
        dx.cgpy[581] = 1267985849;
        dx.cgpy[582] = -1520176294;
        dx.cgpy[583] = -923898599;
        dx.cgpy[584] = 1107164262;
        dx.cgpy[585] = -332230221;
        dx.cgpy[586] = -713868321;
        dx.cgpy[587] = -1872948499;
        dx.cgpy[588] = -1677907895;
        dx.cgpy[589] = -481190534;
        dx.cgpy[590] = -916137286;
        dx.cgpy[591] = -1624940176;
        dx.cgpy[592] = -604610530;
        dx.cgpy[593] = 961958249;
        dx.cgpy[594] = -806484763;
        dx.cgpy[595] = 1912288423;
        dx.cgpy[596] = -494585084;
        dx.cgpy[597] = 871032583;
        dx.cgpy[598] = -418544420;
        dx.cgpy[599] = 1180918290;
    }

    private static /* synthetic */ void cjcw() {
        dx.cgpy[400] = 1941785320;
        dx.cgpy[401] = 137044567;
        dx.cgpy[402] = -1359010914;
        dx.cgpy[403] = -25667698;
        dx.cgpy[404] = 521264143;
        dx.cgpy[405] = -767756585;
        dx.cgpy[406] = 1413796760;
        dx.cgpy[407] = 2070835192;
        dx.cgpy[408] = 399649456;
        dx.cgpy[409] = 1169884687;
        dx.cgpy[410] = 1481299363;
        dx.cgpy[411] = -21657881;
        dx.cgpy[412] = 1585894618;
        dx.cgpy[413] = 1464244596;
        dx.cgpy[414] = 625796917;
        dx.cgpy[415] = 132873525;
        dx.cgpy[416] = 1741224896;
        dx.cgpy[417] = 246811525;
        dx.cgpy[418] = 578732524;
        dx.cgpy[419] = -1602699181;
        dx.cgpy[420] = -961986320;
        dx.cgpy[421] = 1216053256;
        dx.cgpy[422] = -1665989843;
        dx.cgpy[423] = 1562315718;
        dx.cgpy[424] = -1030652608;
        dx.cgpy[425] = -2117358614;
        dx.cgpy[426] = 1224243931;
        dx.cgpy[427] = 415823377;
        dx.cgpy[428] = 396716372;
        dx.cgpy[429] = -1836860054;
        dx.cgpy[430] = 1605585660;
        dx.cgpy[431] = -1618479983;
        dx.cgpy[432] = -673057346;
        dx.cgpy[433] = 1250539270;
        dx.cgpy[434] = -119407183;
        dx.cgpy[435] = 1788093186;
        dx.cgpy[436] = -47763514;
        dx.cgpy[437] = 536826681;
        dx.cgpy[438] = -543963830;
        dx.cgpy[439] = -1397672480;
        dx.cgpy[440] = -920689291;
        dx.cgpy[441] = -99090267;
        dx.cgpy[442] = -441286761;
        dx.cgpy[443] = -288920194;
        dx.cgpy[444] = 936386483;
        dx.cgpy[445] = 789762684;
        dx.cgpy[446] = -375920521;
        dx.cgpy[447] = 1951078149;
        dx.cgpy[448] = 625322235;
        dx.cgpy[449] = -281504991;
        dx.cgpy[450] = 271245743;
        dx.cgpy[451] = 1470929340;
        dx.cgpy[452] = 1206111058;
        dx.cgpy[453] = 416668942;
        dx.cgpy[454] = 1659429884;
        dx.cgpy[455] = -429550455;
        dx.cgpy[456] = -667944588;
        dx.cgpy[457] = 1581473271;
        dx.cgpy[458] = -1964184214;
        dx.cgpy[459] = 175886263;
        dx.cgpy[460] = -75999407;
        dx.cgpy[461] = 596420655;
        dx.cgpy[462] = -783908634;
        dx.cgpy[463] = -1919219975;
        dx.cgpy[464] = 889083319;
        dx.cgpy[465] = -1754778037;
        dx.cgpy[466] = 654871314;
        dx.cgpy[467] = -1267544146;
        dx.cgpy[468] = 679662927;
        dx.cgpy[469] = 1094288644;
        dx.cgpy[470] = 362889304;
        dx.cgpy[471] = -1743380635;
        dx.cgpy[472] = -193133363;
        dx.cgpy[473] = -1509922975;
        dx.cgpy[474] = -947304383;
        dx.cgpy[475] = 49165988;
        dx.cgpy[476] = -383488413;
        dx.cgpy[477] = 1051130133;
        dx.cgpy[478] = 459917831;
        dx.cgpy[479] = -1213533211;
        dx.cgpy[480] = -1492522890;
        dx.cgpy[481] = -447622363;
        dx.cgpy[482] = -37867928;
        dx.cgpy[483] = 1991693024;
        dx.cgpy[484] = -209560173;
        dx.cgpy[485] = 594306766;
        dx.cgpy[486] = 1072671421;
        dx.cgpy[487] = -497738737;
        dx.cgpy[488] = 1038196644;
        dx.cgpy[489] = 405104736;
        dx.cgpy[490] = -565326096;
        dx.cgpy[491] = -1302296704;
        dx.cgpy[492] = -764580429;
        dx.cgpy[493] = 981997304;
        dx.cgpy[494] = 1818720348;
        dx.cgpy[495] = 1349601305;
        dx.cgpy[496] = -775125894;
        dx.cgpy[497] = -276578153;
        dx.cgpy[498] = 871268173;
        dx.cgpy[499] = 900285530;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static class_2960 effectTexture(class_2960 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dx.fu - dx.cgpz("chkw", cgre(int ), (int)44)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == dx.cgpz("chky", cgpw(int ), (int)417)) break;
            v0 /* !! */  = (long)dx.cgpz("chkz", cgpw(int ), (int)418);
        }
        var3_1 = dx.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = dx.fu - dx.cgpz("chla", cgre(int ), (int)45)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == dx.cgpz("chlb", cgpw(int ), (int)419)) break;
            v1 /* !! */  = (long)dx.cgpz("chlh", cgpw(int ), (int)420);
        }
        var2_2 /* !! */  = dx.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = dx.fu - dx.cgpz("chlj", cgre(int ), (int)46)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == dx.cgpz("chlk", cgpw(int ), (int)421)) break;
            v2 /* !! */  = (long)dx.cgpz("chll", cgpw(int ), (int)422);
        }
        var1_3 = dx.a;
        if (var3_1) {
            throw null;
lbl21:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl21
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = dx.fu - dx.cgpz("chlm", cgre(int ), (int)47)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == dx.cgpz("chln", cgpw(int ), (int)423)) break;
                    v3 /* !! */  = (long)dx.cgpz("chlo", cgpw(int ), (int)424);
                }
                v4 = var0.method_12836();
                v5 /* !! */  = dx.fu;
                if (true) ** GOTO lbl38
                block23: while (true) {
                    v5 /* !! */  = (long)(dx.cgpz("chlv", cgre(int ), (int)49) - dx.cgpz("chlu", cgre(int ), (int)48));
lbl38:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 590617944: {
                            continue block23;
                        }
                        case 1117133235: {
                            break block23;
                        }
                    }
                    break;
                }
                v6 = var0.method_12832();
                v7 /* !! */  = dx.fu;
                if (true) ** GOTO lbl48
                block24: while (true) {
                    v7 /* !! */  = (long)(dx.cgpz("chly", cgre(int ), (int)51) - dx.cgpz("chlw", cgre(int ), (int)50));
lbl48:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -100464373: {
                            continue block24;
                        }
                        case 1117133235: {
                            break block24;
                        }
                    }
                    break;
                }
                v8 = "textures/mob_effect/" + v6 + ".png";
                v9 /* !! */  = dx.fu;
                if (true) ** GOTO lbl58
                block25: while (true) {
                    v9 /* !! */  = (long)(dx.cgpz("chmd", cgre(int ), (int)53) - dx.cgpz("chma", cgre(int ), (int)52));
lbl58:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 1044947348: {
                            continue block25;
                        }
                        case 1117133235: {
                            break block25;
                        }
                    }
                    break;
                }
                return class_2960.method_60655((String)v4, (String)v8);
            }
            case 0: {
                var2_2 /* !! */  = (int)dx.cgpz("chmi", cgpw(int ), (int)425);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl73
            }
            case 1: {
                var2_2 /* !! */  = (int)dx.cgpz("chmk", cgpw(int ), (int)426);
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
                    var2_2 /* !! */  = (int)dx.cgpz("chmm", cgpw(int ), (int)427);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)dx.cgpz("chmn", cgpw(int ), (int)428);
        ** while (!var3_1)
lbl81:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawRollingText(class_332 var0, ks var1_1, dx$RollingText var2_2, float var3_3, float var4_4, float var5_5, int var6_6, float var7_7, float var8_8, long var9_9) {
        block156: {
            block155: {
                var27_10 = dx.c;
                var26_11 /* !! */  = dx.b;
                var25_12 = dx.a;
                if (var27_10) {
                    throw null;
lbl6:
                    // 41 sources

                    return;
                }
                if (var25_12 || var25_12) ** GOTO lbl6
                if (var2_2 != null) break block155;
                if (var25_12) ** GOTO lbl6
                return;
            }
            if (var25_12 || var25_12) ** GOTO lbl6
            if (var2_2.animating(var9_9)) break block156;
            if (var25_12 || var25_12) ** GOTO lbl6
            var2_2.finishIfNeeded(var9_9);
            if (var25_12 || var25_12) ** GOTO lbl6
            kq.text(var0, var1_1, var2_2.value(), var3_3, var4_4, var5_5, var6_6, (boolean)dx.cgpz("ciqd", cgpw(int ), (int)707));
            if (var25_12 || var25_12) ** GOTO lbl6
            return;
        }
        if (var25_12 || var25_12) ** GOTO lbl6
        var11_13 = Math.min(1.0f, (float)(var9_9 - var2_2.switchAt()) / dx.cgpz("ciqe", cgqj(int ), (int)708));
        if (var25_12 || var25_12) ** GOTO lbl6
        var12_14 = dx.smootherstep(var11_13);
        if (var25_12 || var25_12) ** GOTO lbl6
        var13_15 = 1.0f - dx.smootherstep(var11_13);
        if (var25_12 || var25_12) ** GOTO lbl6
        var14_16 = var4_4 + var12_14 * dx.cgpz("ciqf", cgqj(int ), (int)709);
        if (var25_12 || var25_12) ** GOTO lbl6
        var15_17 = var4_4 + (var12_14 - 1.0f) * dx.cgpz("ciqg", cgqj(int ), (int)710);
        if (var25_12 || var25_12) ** GOTO lbl6
        var16_18 = nd.multAlpha(var6_6, var13_15);
        if (var25_12 || var25_12) ** GOTO lbl6
        var17_19 = nd.multAlpha(var6_6, 1.0f - var13_15);
        if (var25_12 || var25_12) ** GOTO lbl6
        var18_20 = var2_2.previous();
        if (var25_12 || var25_12) ** GOTO lbl6
        var19_21 = var2_2.value();
        if (var25_12) ** GOTO lbl6
        if (var26_11 /* !! */  == 0) ** GOTO lbl-1000
        switch (var26_11 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var25_12) ** GOTO lbl6
                var20_22 = Math.max(kq.width(var1_1, var18_20, var5_5), kq.width(var1_1, var19_21, var5_5)) + 2.0f;
                if (var25_12 || var25_12) ** GOTO lbl6
                kr.flush();
                if (var25_12 || var25_12) ** GOTO lbl6
                oq.push(var3_3 - 1.0f, var7_7, var20_22, var8_8);
                if (var25_12 || var25_12) ** GOTO lbl6
                if (var18_20.length() == var19_21.length()) ** GOTO lbl60
                if (var25_12 || var25_12) ** GOTO lbl6
                kq.text(var0, var1_1, var18_20, var3_3, var14_16, var5_5, var16_18, (boolean)dx.cgpz("ciqh", cgpw(int ), (int)711));
                if (var25_12 || var25_12) ** GOTO lbl6
                kq.text(var0, var1_1, var19_21, var3_3, var15_17, var5_5, var17_19, (boolean)dx.cgpz("ciqi", cgpw(int ), (int)712));
                if (var25_12) ** GOTO lbl6
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl92
lbl60:
                // 1 sources

                if (var25_12 || var25_12) ** GOTO lbl6
                var21_23 = var3_3;
                if (var25_12 || var25_12) ** GOTO lbl6
                var22_24 = dx.cgpz("ciqj", cgpw(int ), (int)713);
                if (var25_12) ** GOTO lbl6
                do {
                    if (var25_12 || var25_12) ** GOTO lbl6
                    if (var22_24 >= var19_21.length()) ** GOTO lbl92
                    if (var25_12 || var25_12) ** GOTO lbl6
                    var23_25 = String.valueOf(var18_20.charAt((int)var22_24));
                    if (var25_12 || var25_12) ** GOTO lbl6
                    var24_26 = String.valueOf(var19_21.charAt((int)var22_24));
                    if (var25_12 || var25_12) ** GOTO lbl6
                    if (!var23_25.equals(var24_26)) ** GOTO lbl80
                    if (var25_12 || var25_12) ** GOTO lbl6
                    kq.text(var0, var1_1, var24_26, var21_23, var4_4, var5_5, var6_6, (boolean)dx.cgpz("ciqk", cgpw(int ), (int)714));
                    if (var25_12) ** GOTO lbl6
                    if (var27_10) {
                        throw null;
                    }
                    ** GOTO lbl85
lbl80:
                    // 1 sources

                    if (var25_12 || var25_12) ** GOTO lbl6
                    kq.text(var0, var1_1, var23_25, var21_23, var14_16, var5_5, var16_18, (boolean)dx.cgpz("ciql", cgpw(int ), (int)715));
                    if (var25_12 || var25_12) ** GOTO lbl6
                    kq.text(var0, var1_1, var24_26, var21_23, var15_17, var5_5, var17_19, (boolean)dx.cgpz("ciqm", cgpw(int ), (int)716));
                    if (var25_12) ** GOTO lbl6
lbl85:
                    // 2 sources

                    if (var25_12 || var25_12) ** GOTO lbl6
                    var21_23 += kq.width(var1_1, var24_26, var5_5);
                    if (var25_12 || var25_12) ** GOTO lbl6
                    ++var22_24;
                    if (var25_12) ** GOTO lbl6
                } while (!var27_10);
                throw null;
lbl92:
                // 2 sources

                if (var25_12 || var25_12) ** GOTO lbl6
                kr.flush();
                if (var25_12 || var25_12) ** GOTO lbl6
                oq.pop();
                if (!var25_12 && !var25_12) ** break;
                ** continue;
                return;
            }
lbl99:
            // 3 sources

            case 0: {
                var26_11 /* !! */  = (int)dx.cgpz("ciqn", cgpw(int ), (int)717);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl329
            }
            case 1: {
                var26_11 /* !! */  = (int)dx.cgpz("ciqo", cgpw(int ), (int)718);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl208
            }
            case 2: {
                do {
                    var26_11 /* !! */  = (int)dx.cgpz("ciqp", cgpw(int ), (int)719);
                } while (!var27_10);
                throw null;
            }
lbl114:
            // 4 sources

            case 3: {
                var26_11 /* !! */  = (int)dx.cgpz("ciqq", cgpw(int ), (int)720);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl421
            }
lbl119:
            // 2 sources

            case 4: {
                var26_11 /* !! */  = (int)dx.cgpz("ciqr", cgpw(int ), (int)721);
                if (!var27_10) ** GOTO lbl114
                throw null;
            }
            case 5: {
                var26_11 /* !! */  = (int)dx.cgpz("ciqs", cgpw(int ), (int)722);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 6: {
                var26_11 /* !! */  = (int)dx.cgpz("ciqt", cgpw(int ), (int)723);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl356
            }
lbl133:
            // 2 sources

            case 7: {
                var26_11 /* !! */  = (int)dx.cgpz("ciqu", cgpw(int ), (int)724);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl397
            }
            case 8: {
                var26_11 /* !! */  = (int)dx.cgpz("ciqv", cgpw(int ), (int)725);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl387
            }
            case 9: {
                var26_11 /* !! */  = (int)dx.cgpz("ciqw", cgpw(int ), (int)726);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl218
            }
            case 10: {
                var26_11 /* !! */  = (int)dx.cgpz("ciqx", cgpw(int ), (int)727);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl405
            }
            case 11: {
                var26_11 /* !! */  = (int)dx.cgpz("ciqy", cgpw(int ), (int)728);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl343
            }
lbl158:
            // 2 sources

            case 12: {
                var26_11 /* !! */  = (int)dx.cgpz("ciqz", cgpw(int ), (int)729);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl238
            }
            case 13: {
                var26_11 /* !! */  = (int)dx.cgpz("cira", cgpw(int ), (int)730);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl263
            }
            case 14: {
                var26_11 /* !! */  = (int)dx.cgpz("cirb", cgpw(int ), (int)731);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl320
            }
lbl173:
            // 2 sources

            case 15: {
                var26_11 /* !! */  = (int)dx.cgpz("circ", cgpw(int ), (int)732);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl417
            }
lbl178:
            // 2 sources

            case 16: {
                var26_11 /* !! */  = (int)dx.cgpz("cird", cgpw(int ), (int)733);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl370
            }
            case 17: {
                var26_11 /* !! */  = (int)dx.cgpz("cire", cgpw(int ), (int)734);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl356
            }
            case 18: {
                var26_11 /* !! */  = (int)dx.cgpz("cirf", cgpw(int ), (int)735);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl271
            }
lbl193:
            // 3 sources

            case 19: {
                var26_11 /* !! */  = (int)dx.cgpz("cirg", cgpw(int ), (int)736);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl441
            }
            case 20: {
                var26_11 /* !! */  = (int)dx.cgpz("cirh", cgpw(int ), (int)737);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl312
            }
            case 21: {
                var26_11 /* !! */  = (int)dx.cgpz("ciri", cgpw(int ), (int)738);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl208:
            // 3 sources

            case 22: {
                var26_11 /* !! */  = (int)dx.cgpz("cirj", cgpw(int ), (int)739);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl433
            }
lbl213:
            // 2 sources

            case 23: {
                var26_11 /* !! */  = (int)dx.cgpz("cirk", cgpw(int ), (int)740);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl409
            }
lbl218:
            // 3 sources

            case 24: {
                var26_11 /* !! */  = (int)dx.cgpz("cirl", cgpw(int ), (int)741);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl329
            }
lbl223:
            // 2 sources

            case 25: {
                var26_11 /* !! */  = (int)dx.cgpz("cirm", cgpw(int ), (int)742);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl365
            }
            case 26: {
                var26_11 /* !! */  = (int)dx.cgpz("cirn", cgpw(int ), (int)743);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl233:
            // 2 sources

            case 27: {
                var26_11 /* !! */  = (int)dx.cgpz("ciro", cgpw(int ), (int)744);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl425
            }
lbl238:
            // 2 sources

            case 28: {
                var26_11 /* !! */  = (int)dx.cgpz("cirp", cgpw(int ), (int)745);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl248
            }
lbl243:
            // 2 sources

            case 29: {
                var26_11 /* !! */  = (int)dx.cgpz("cirq", cgpw(int ), (int)746);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl348
            }
lbl248:
            // 2 sources

            case 30: {
                var26_11 /* !! */  = (int)dx.cgpz("cirr", cgpw(int ), (int)747);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl429
            }
lbl253:
            // 2 sources

            case 31: {
                var26_11 /* !! */  = (int)dx.cgpz("cirs", cgpw(int ), (int)748);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl441
            }
lbl258:
            // 3 sources

            case 32: {
                var26_11 /* !! */  = (int)dx.cgpz("cirt", cgpw(int ), (int)749);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl370
            }
lbl263:
            // 3 sources

            case 33: {
                var26_11 /* !! */  = (int)dx.cgpz("ciru", cgpw(int ), (int)750);
                if (!var27_10) ** GOTO lbl193
                throw null;
            }
            case 34: {
                var26_11 /* !! */  = (int)dx.cgpz("cirv", cgpw(int ), (int)751);
                if (!var27_10) ** GOTO lbl99
                throw null;
            }
lbl271:
            // 2 sources

            case 35: {
                var26_11 /* !! */  = (int)dx.cgpz("cirw", cgpw(int ), (int)752);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl429
            }
lbl276:
            // 4 sources

            case 36: {
                var26_11 /* !! */  = (int)dx.cgpz("cirx", cgpw(int ), (int)753);
                if (!var27_10) ** GOTO lbl208
                throw null;
            }
            case 37: {
                var26_11 /* !! */  = (int)dx.cgpz("ciry", cgpw(int ), (int)754);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl429
            }
            case 38: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var26_11 /* !! */  = (int)dx.cgpz("cirz", cgpw(int ), (int)755);
                    if (!var27_10) ** GOTO lbl178
                    throw null;
                }
            }
            case 39: {
                var26_11 /* !! */  = (int)dx.cgpz("cisa", cgpw(int ), (int)756);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl356
            }
            case 40: {
                var26_11 /* !! */  = (int)dx.cgpz("cisb", cgpw(int ), (int)757);
                if (!var27_10) ** GOTO lbl114
                throw null;
            }
lbl299:
            // 2 sources

            case 41: {
                var26_11 /* !! */  = (int)dx.cgpz("cisc", cgpw(int ), (int)758);
                if (!var27_10) ** GOTO lbl263
                throw null;
            }
lbl303:
            // 2 sources

            case 42: {
                var26_11 /* !! */  = (int)dx.cgpz("cisd", cgpw(int ), (int)759);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl429
            }
            case 43: {
                var26_11 /* !! */  = (int)dx.cgpz("cise", cgpw(int ), (int)760);
                if (!var27_10) ** GOTO lbl158
                throw null;
            }
lbl312:
            // 2 sources

            case 44: {
                var26_11 /* !! */  = (int)dx.cgpz("cisf", cgpw(int ), (int)761);
                if (!var27_10) ** GOTO lbl299
                throw null;
            }
            case 45: {
                var26_11 /* !! */  = (int)dx.cgpz("cisg", cgpw(int ), (int)762);
                if (!var27_10) ** GOTO lbl133
                throw null;
            }
lbl320:
            // 2 sources

            case 46: {
                var26_11 /* !! */  = (int)dx.cgpz("cish", cgpw(int ), (int)763);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl417
            }
            case 47: {
                var26_11 /* !! */  = (int)dx.cgpz("cisi", cgpw(int ), (int)764);
                if (!var27_10) ** GOTO lbl276
                throw null;
            }
lbl329:
            // 3 sources

            case 48: {
                var26_11 /* !! */  = (int)dx.cgpz("cisj", cgpw(int ), (int)765);
                if (!var27_10) ** GOTO lbl258
                throw null;
            }
            case 49: {
                var26_11 /* !! */  = (int)dx.cgpz("cisk", cgpw(int ), (int)766);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl370
            }
lbl338:
            // 2 sources

            case 50: {
                var26_11 /* !! */  = (int)dx.cgpz("cisl", cgpw(int ), (int)767);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl437
            }
lbl343:
            // 2 sources

            case 51: {
                var26_11 /* !! */  = (int)dx.cgpz("cism", cgpw(int ), (int)768);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl405
            }
lbl348:
            // 2 sources

            case 52: {
                var26_11 /* !! */  = (int)dx.cgpz("cisn", cgpw(int ), (int)769);
                if (!var27_10) ** GOTO lbl173
                throw null;
            }
lbl352:
            // 3 sources

            case 53: {
                var26_11 /* !! */  = (int)dx.cgpz("ciso", cgpw(int ), (int)770);
                if (!var27_10) ** GOTO lbl276
                throw null;
            }
lbl356:
            // 4 sources

            case 54: {
                var26_11 /* !! */  = (int)dx.cgpz("cisp", cgpw(int ), (int)771);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl425
            }
            case 55: {
                var26_11 /* !! */  = (int)dx.cgpz("cisq", cgpw(int ), (int)772);
                if (!var27_10) break;
                throw null;
            }
lbl365:
            // 2 sources

            case 56: {
                var26_11 /* !! */  = (int)dx.cgpz("cisr", cgpw(int ), (int)773);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl449
            }
lbl370:
            // 4 sources

            case 57: {
                var26_11 /* !! */  = (int)dx.cgpz("ciss", cgpw(int ), (int)774);
                if (!var27_10) ** GOTO lbl258
                throw null;
            }
            case 58: {
                var26_11 /* !! */  = (int)dx.cgpz("cist", cgpw(int ), (int)775);
                if (!var27_10) ** GOTO lbl114
                throw null;
            }
lbl378:
            // 2 sources

            case 59: {
                var26_11 /* !! */  = (int)dx.cgpz("cisu", cgpw(int ), (int)776);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl449
            }
lbl383:
            // 3 sources

            case 60: {
                var26_11 /* !! */  = (int)dx.cgpz("cisv", cgpw(int ), (int)777);
                if (!var27_10) ** GOTO lbl352
                throw null;
            }
lbl387:
            // 2 sources

            case 61: {
                do {
                    var26_11 /* !! */  = (int)dx.cgpz("cisw", cgpw(int ), (int)778);
                } while (!var27_10);
                throw null;
            }
lbl392:
            // 2 sources

            case 62: {
                var26_11 /* !! */  = (int)dx.cgpz("cisx", cgpw(int ), (int)779);
                if (var27_10) {
                    throw null;
                }
                ** GOTO lbl409
            }
lbl397:
            // 2 sources

            case 63: {
                var26_11 /* !! */  = (int)dx.cgpz("cisy", cgpw(int ), (int)780);
                if (!var27_10) break;
                throw null;
            }
            case 64: {
                var26_11 /* !! */  = (int)dx.cgpz("cisz", cgpw(int ), (int)781);
                if (!var27_10) ** GOTO lbl233
                throw null;
            }
lbl405:
            // 3 sources

            case 65: {
                var26_11 /* !! */  = (int)dx.cgpz("cita", cgpw(int ), (int)782);
                if (!var27_10) ** GOTO lbl243
                throw null;
            }
lbl409:
            // 3 sources

            case 66: {
                var26_11 /* !! */  = (int)dx.cgpz("citb", cgpw(int ), (int)783);
                if (!var27_10) ** GOTO lbl99
                throw null;
            }
            case 67: {
                var26_11 /* !! */  = (int)dx.cgpz("citc", cgpw(int ), (int)784);
                if (!var27_10) ** GOTO lbl352
                throw null;
            }
lbl417:
            // 3 sources

            case 68: {
                var26_11 /* !! */  = (int)dx.cgpz("citd", cgpw(int ), (int)785);
                if (!var27_10) ** GOTO lbl218
                throw null;
            }
lbl421:
            // 2 sources

            case 69: {
                var26_11 /* !! */  = (int)dx.cgpz("cite", cgpw(int ), (int)786);
                if (!var27_10) ** GOTO lbl392
                throw null;
            }
lbl425:
            // 3 sources

            case 70: {
                var26_11 /* !! */  = (int)dx.cgpz("citf", cgpw(int ), (int)787);
                if (!var27_10) ** GOTO lbl383
                throw null;
            }
lbl429:
            // 5 sources

            case 71: {
                var26_11 /* !! */  = (int)dx.cgpz("citg", cgpw(int ), (int)788);
                if (!var27_10) ** GOTO lbl119
                throw null;
            }
lbl433:
            // 2 sources

            case 72: {
                var26_11 /* !! */  = (int)dx.cgpz("cith", cgpw(int ), (int)789);
                if (!var27_10) ** GOTO lbl383
                throw null;
            }
lbl437:
            // 2 sources

            case 73: {
                var26_11 /* !! */  = (int)dx.cgpz("citi", cgpw(int ), (int)790);
                if (!var27_10) ** GOTO lbl303
                throw null;
            }
lbl441:
            // 3 sources

            case 74: {
                var26_11 /* !! */  = (int)dx.cgpz("citj", cgpw(int ), (int)791);
                if (!var27_10) ** GOTO lbl338
                throw null;
            }
            case 75: {
                var26_11 /* !! */  = (int)dx.cgpz("citk", cgpw(int ), (int)792);
                if (!var27_10) ** GOTO lbl378
                throw null;
            }
lbl449:
            // 3 sources

            case 76: {
                var26_11 /* !! */  = (int)dx.cgpz("citl", cgpw(int ), (int)793);
                if (!var27_10) ** GOTO lbl213
                throw null;
            }
            case 77: {
                var26_11 /* !! */  = (int)dx.cgpz("citm", cgpw(int ), (int)794);
                if (!var27_10) ** GOTO lbl276
                throw null;
            }
            case 78: 
        }
        var26_11 /* !! */  = (int)dx.cgpz("citn", cgpw(int ), (int)795);
        ** while (!var27_10)
lbl460:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private List<dx$EffectRow> collectRows(boolean var1_1) {
        block111: {
            block106: {
                block109: {
                    block108: {
                        block107: {
                            var9_2 = dx.c;
                            var8_3 /* !! */  = dx.b;
                            var7_4 = dx.a;
                            if (var9_2) {
                                throw null;
lbl6:
                                // 27 sources

                                return null;
                            }
                            if (var7_4 || var7_4) ** GOTO lbl6
                            if (this.mc.field_1724 != null) break block107;
                            if (var7_4) ** GOTO lbl6
                            v0 /* !! */  = dx.cgpz("chej", cgpw(int ), (int)337);
                            if (var9_2) {
                                throw null;
                            }
                            break block108;
                        }
                        if (var7_4 || var7_4) ** GOTO lbl6
                        v0 /* !! */  = var2_5 = (CallSite)this.mc.field_1724.field_6012;
                    }
                    if (var7_4 || var7_4) ** GOTO lbl6
                    if (var2_5 != this.collectedPlayerAge) break block109;
                    if (var7_4) ** GOTO lbl6
                    if (var1_1 != this.collectedChatDemo) break block109;
                    if (var7_4 || var7_4) ** GOTO lbl6
                    return this.collectedRows;
                }
                if (var7_4 || var7_4) ** GOTO lbl6
                this.collectedPlayerAge = (int)var2_5;
                if (var7_4 || var7_4) ** GOTO lbl6
                this.collectedChatDemo = var1_1;
                if (var7_4 || var7_4) ** GOTO lbl6
                var3_6 = this.collectedRows;
                if (var7_4 || var7_4) ** GOTO lbl6
                var3_6.clear();
                if (var7_4 || var7_4) ** GOTO lbl6
                if (this.mc.field_1724 == null) break block106;
                if (var7_4 || var7_4) ** GOTO lbl6
                var4_7 = this.mc.field_1724.method_6026().iterator();
                if (var7_4) ** GOTO lbl6
                do lbl-1000:
                // 3 sources

                {
                    block110: {
                        if (var7_4 || var7_4) ** GOTO lbl6
                        if (!var4_7.hasNext()) break block106;
                        if (var7_4) ** GOTO lbl6
                        var5_8 = (class_1293)var4_7.next();
                        if (var7_4 || var7_4) ** GOTO lbl6
                        var6_9 = class_7923.field_41174.method_10221((Object)((class_1291)var5_8.method_5579().comp_349()));
                        if (var7_4 || var7_4) ** GOTO lbl6
                        if (var6_9 != null) break block110;
                        if (var7_4) ** GOTO lbl6
                        if (!var9_2) ** GOTO lbl-1000
                        throw null;
                    }
                    if (var7_4 || var7_4) ** GOTO lbl6
                    v1 = var6_9.toString();
                    v2 = ((class_1291)var5_8.method_5579().comp_349()).method_5560().getString();
                    v3 = var5_8.method_5578() + dx.cgpz("chek", cgpw(int ), (int)338);
                    v4 = var5_8.method_5584();
                    if (((class_1291)var5_8.method_5579().comp_349()).method_18792() == class_4081.field_18272) {
                        v5 = dx.cgpz("chel", cgpw(int ), (int)339);
                        if (var9_2) {
                            throw null;
                        }
                    } else {
                        v5 = dx.cgpz("chem", cgpw(int ), (int)340);
                    }
                    var3_6.add(new dx$EffectRow(v1, v2, v3, v4, (boolean)v5, dx.effectTexture(var6_9)));
                    if (var7_4 || var7_4) ** GOTO lbl6
                } while (!var9_2);
                throw null;
            }
            if (var7_4 || var7_4) ** GOTO lbl6
            if (!var3_6.isEmpty()) break block111;
            if (var7_4) ** GOTO lbl6
            if (!var1_1) break block111;
            if (var7_4 || var7_4) ** GOTO lbl6
            var3_6.add(dx.demo("fire_resistance", "Fire Protection", (int)dx.cgpz("chen", cgpw(int ), (int)341), (int)dx.cgpz("cheo", cgpw(int ), (int)342), (boolean)dx.cgpz("chep", cgpw(int ), (int)343)));
            if (var7_4 || var7_4) ** GOTO lbl6
            var3_6.add(dx.demo("strength", "Strength", (int)dx.cgpz("cheq", cgpw(int ), (int)344), (int)dx.cgpz("cher", cgpw(int ), (int)345), (boolean)dx.cgpz("ches", cgpw(int ), (int)346)));
            if (var7_4 || var7_4) ** GOTO lbl6
            var3_6.add(dx.demo("poison", "Poison", (int)dx.cgpz("chet", cgpw(int ), (int)347), (int)dx.cgpz("cheu", cgpw(int ), (int)348), (boolean)dx.cgpz("chev", cgpw(int ), (int)349)));
            if (var7_4) ** GOTO lbl6
        }
        if (!var7_4 && !var7_4) ** break;
        ** while (true)
        if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return var3_6;
            }
            case 0: {
                var8_3 /* !! */  = (int)dx.cgpz("chew", cgpw(int ), (int)350);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl95:
            // 2 sources

            case 1: {
                var8_3 /* !! */  = (int)dx.cgpz("chex", cgpw(int ), (int)351);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl246
            }
lbl100:
            // 2 sources

            case 2: {
                var8_3 /* !! */  = (int)dx.cgpz("chey", cgpw(int ), (int)352);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 3: {
                var8_3 /* !! */  = (int)dx.cgpz("chez", cgpw(int ), (int)353);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl314
            }
            case 4: {
                var8_3 /* !! */  = (int)dx.cgpz("chfa", cgpw(int ), (int)354);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl310
            }
            case 5: {
                var8_3 /* !! */  = (int)dx.cgpz("chfb", cgpw(int ), (int)355);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl120:
            // 3 sources

            case 6: {
                var8_3 /* !! */  = (int)dx.cgpz("chfc", cgpw(int ), (int)356);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl294
            }
            case 7: {
                var8_3 /* !! */  = (int)dx.cgpz("chfd", cgpw(int ), (int)357);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 8: {
                var8_3 /* !! */  = (int)dx.cgpz("chfe", cgpw(int ), (int)358);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 9: {
                var8_3 /* !! */  = (int)dx.cgpz("chff", cgpw(int ), (int)359);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl286
            }
            case 10: {
                var8_3 /* !! */  = (int)dx.cgpz("chfg", cgpw(int ), (int)360);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl294
            }
lbl145:
            // 3 sources

            case 11: {
                var8_3 /* !! */  = (int)dx.cgpz("chfh", cgpw(int ), (int)361);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl150:
            // 4 sources

            case 12: {
                var8_3 /* !! */  = (int)dx.cgpz("chfi", cgpw(int ), (int)362);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl269
            }
lbl155:
            // 3 sources

            case 13: {
                var8_3 /* !! */  = (int)dx.cgpz("chfj", cgpw(int ), (int)363);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 14: {
                var8_3 /* !! */  = (int)dx.cgpz("chfk", cgpw(int ), (int)364);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl165:
            // 3 sources

            case 15: {
                var8_3 /* !! */  = (int)dx.cgpz("chfl", cgpw(int ), (int)365);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl170:
            // 3 sources

            case 16: {
                var8_3 /* !! */  = (int)dx.cgpz("chfm", cgpw(int ), (int)366);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl290
            }
            case 17: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_3 /* !! */  = (int)dx.cgpz("chfn", cgpw(int ), (int)367);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl227
                    break;
                }
            }
lbl181:
            // 3 sources

            case 18: {
                var8_3 /* !! */  = (int)dx.cgpz("chfo", cgpw(int ), (int)368);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl222
            }
            case 19: {
                var8_3 /* !! */  = (int)dx.cgpz("chfp", cgpw(int ), (int)369);
                if (!var9_2) ** GOTO lbl170
                throw null;
            }
            case 20: {
                var8_3 /* !! */  = (int)dx.cgpz("chfq", cgpw(int ), (int)370);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl195:
            // 3 sources

            case 21: {
                var8_3 /* !! */  = (int)dx.cgpz("chfr", cgpw(int ), (int)371);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl241
            }
            case 22: {
                var8_3 /* !! */  = (int)dx.cgpz("chfs", cgpw(int ), (int)372);
                if (!var9_2) ** GOTO lbl145
                throw null;
            }
lbl204:
            // 4 sources

            case 23: {
                var8_3 /* !! */  = (int)dx.cgpz("chft", cgpw(int ), (int)373);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl298
            }
lbl209:
            // 2 sources

            case 24: {
                var8_3 /* !! */  = (int)dx.cgpz("chfu", cgpw(int ), (int)374);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl286
            }
            case 25: {
                var8_3 /* !! */  = (int)dx.cgpz("chfv", cgpw(int ), (int)375);
                if (!var9_2) ** GOTO lbl150
                throw null;
            }
lbl218:
            // 2 sources

            case 26: {
                var8_3 /* !! */  = (int)dx.cgpz("chfw", cgpw(int ), (int)376);
                if (!var9_2) ** GOTO lbl204
                throw null;
            }
lbl222:
            // 2 sources

            case 27: {
                var8_3 /* !! */  = (int)dx.cgpz("chfx", cgpw(int ), (int)377);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl302
            }
lbl227:
            // 3 sources

            case 28: {
                var8_3 /* !! */  = (int)dx.cgpz("chfy", cgpw(int ), (int)378);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl290
            }
            case 29: {
                var8_3 /* !! */  = (int)dx.cgpz("chfz", cgpw(int ), (int)379);
                if (!var9_2) ** GOTO lbl181
                throw null;
            }
            case 30: {
                var8_3 /* !! */  = (int)dx.cgpz("chgb", cgpw(int ), (int)380);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl298
            }
lbl241:
            // 3 sources

            case 31: {
                var8_3 /* !! */  = (int)dx.cgpz("chgc", cgpw(int ), (int)381);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl314
            }
lbl246:
            // 2 sources

            case 32: {
                var8_3 /* !! */  = (int)dx.cgpz("chgd", cgpw(int ), (int)382);
                if (!var9_2) ** GOTO lbl150
                throw null;
            }
            case 33: {
                var8_3 /* !! */  = (int)dx.cgpz("chgh", cgpw(int ), (int)383);
                if (!var9_2) ** GOTO lbl145
                throw null;
            }
            case 34: {
                var8_3 /* !! */  = (int)dx.cgpz("chgr", cgpw(int ), (int)384);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl310
            }
            case 35: {
                var8_3 /* !! */  = (int)dx.cgpz("chgs", cgpw(int ), (int)385);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl282
            }
            case 36: {
                var8_3 /* !! */  = (int)dx.cgpz("chgt", cgpw(int ), (int)386);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl294
            }
lbl269:
            // 2 sources

            case 37: {
                var8_3 /* !! */  = (int)dx.cgpz("chgv", cgpw(int ), (int)387);
                if (!var9_2) ** GOTO lbl181
                throw null;
            }
            case 38: {
                var8_3 /* !! */  = (int)dx.cgpz("chgx", cgpw(int ), (int)388);
                if (!var9_2) ** GOTO lbl195
                throw null;
            }
            case 39: {
                var8_3 /* !! */  = (int)dx.cgpz("chha", cgpw(int ), (int)389);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl310
            }
lbl282:
            // 2 sources

            case 40: {
                var8_3 /* !! */  = (int)dx.cgpz("chhf", cgpw(int ), (int)390);
                if (!var9_2) ** GOTO lbl100
                throw null;
            }
lbl286:
            // 5 sources

            case 41: {
                var8_3 /* !! */  = (int)dx.cgpz("chhi", cgpw(int ), (int)391);
                if (!var9_2) ** GOTO lbl155
                throw null;
            }
lbl290:
            // 3 sources

            case 42: {
                var8_3 /* !! */  = (int)dx.cgpz("chhl", cgpw(int ), (int)392);
                if (!var9_2) ** GOTO lbl95
                throw null;
            }
lbl294:
            // 4 sources

            case 43: {
                var8_3 /* !! */  = (int)dx.cgpz("chhn", cgpw(int ), (int)393);
                if (!var9_2) ** GOTO lbl286
                throw null;
            }
lbl298:
            // 3 sources

            case 44: {
                var8_3 /* !! */  = (int)dx.cgpz("chhp", cgpw(int ), (int)394);
                if (!var9_2) ** GOTO lbl286
                throw null;
            }
lbl302:
            // 2 sources

            case 45: {
                var8_3 /* !! */  = (int)dx.cgpz("chhq", cgpw(int ), (int)395);
                if (!var9_2) ** GOTO lbl165
                throw null;
            }
            case 46: {
                var8_3 /* !! */  = (int)dx.cgpz("chhs", cgpw(int ), (int)396);
                if (!var9_2) ** GOTO lbl218
                throw null;
            }
lbl310:
            // 5 sources

            case 47: {
                var8_3 /* !! */  = (int)dx.cgpz("chhz", cgpw(int ), (int)397);
                if (!var9_2) ** GOTO lbl195
                throw null;
            }
lbl314:
            // 3 sources

            case 48: {
                var8_3 /* !! */  = (int)dx.cgpz("chib", cgpw(int ), (int)398);
                if (!var9_2) ** GOTO lbl310
                throw null;
            }
            case 49: {
                var8_3 /* !! */  = (int)dx.cgpz("chid", cgpw(int ), (int)399);
                if (!var9_2) ** GOTO lbl120
                throw null;
            }
            case 50: 
        }
        var8_3 /* !! */  = (int)dx.cgpz("chif", cgpw(int ), (int)400);
        ** while (!var9_2)
lbl325:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cjcm() {
        dx.cgpx[400] = 1941785336;
        dx.cgpx[401] = -137044568;
        dx.cgpx[402] = 1039591047;
        dx.cgpx[403] = 25667697;
        dx.cgpx[404] = -848533758;
        dx.cgpx[405] = 767756584;
        dx.cgpx[406] = 1176407705;
        dx.cgpx[407] = 2070835193;
        dx.cgpx[408] = -760302347;
        dx.cgpx[409] = -1169884688;
        dx.cgpx[410] = 2021281403;
        dx.cgpx[411] = -21657882;
        dx.cgpx[412] = 1585894616;
        dx.cgpx[413] = 1464244597;
        dx.cgpx[414] = 625796918;
        dx.cgpx[415] = 132873526;
        dx.cgpx[416] = 1741224900;
        dx.cgpx[417] = -246811526;
        dx.cgpx[418] = 516141482;
        dx.cgpx[419] = 1602699180;
        dx.cgpx[420] = 491371325;
        dx.cgpx[421] = -1216053257;
        dx.cgpx[422] = 24519591;
        dx.cgpx[423] = -1562315719;
        dx.cgpx[424] = -1605483968;
        dx.cgpx[425] = -2117358615;
        dx.cgpx[426] = 1224243928;
        dx.cgpx[427] = 415823378;
        dx.cgpx[428] = 396716375;
        dx.cgpx[429] = -1365218720;
        dx.cgpx[430] = 1605585641;
        dx.cgpx[431] = -1618479994;
        dx.cgpx[432] = -673057383;
        dx.cgpx[433] = 1250539292;
        dx.cgpx[434] = -119407195;
        dx.cgpx[435] = 1788093185;
        dx.cgpx[436] = -47763486;
        dx.cgpx[437] = 536826655;
        dx.cgpx[438] = -543963811;
        dx.cgpx[439] = -1397672452;
        dx.cgpx[440] = -920689318;
        dx.cgpx[441] = -99090284;
        dx.cgpx[442] = -441286757;
        dx.cgpx[443] = -288920227;
        dx.cgpx[444] = 936386467;
        dx.cgpx[445] = 789762658;
        dx.cgpx[446] = -375920516;
        dx.cgpx[447] = 1951078199;
        dx.cgpx[448] = 625322186;
        dx.cgpx[449] = -281505010;
        dx.cgpx[450] = 271245742;
        dx.cgpx[451] = 1470929303;
        dx.cgpx[452] = 1206111043;
        dx.cgpx[453] = 416668987;
        dx.cgpx[454] = 1659429857;
        dx.cgpx[455] = -429550427;
        dx.cgpx[456] = -667944585;
        dx.cgpx[457] = 1581473246;
        dx.cgpx[458] = -1964184254;
        dx.cgpx[459] = 175886221;
        dx.cgpx[460] = -75999396;
        dx.cgpx[461] = 596420659;
        dx.cgpx[462] = -783908659;
        dx.cgpx[463] = -1919219995;
        dx.cgpx[464] = 889083323;
        dx.cgpx[465] = -1754778017;
        dx.cgpx[466] = 654871335;
        dx.cgpx[467] = -1267544177;
        dx.cgpx[468] = 679662928;
        dx.cgpx[469] = 1094288670;
        dx.cgpx[470] = 362889340;
        dx.cgpx[471] = -1743380622;
        dx.cgpx[472] = -193133335;
        dx.cgpx[473] = -1509922962;
        dx.cgpx[474] = -947304371;
        dx.cgpx[475] = 49166008;
        dx.cgpx[476] = -383488439;
        dx.cgpx[477] = 1051130134;
        dx.cgpx[478] = 459917850;
        dx.cgpx[479] = -1213533229;
        dx.cgpx[480] = -1492522932;
        dx.cgpx[481] = -447622379;
        dx.cgpx[482] = -37867966;
        dx.cgpx[483] = 1991693025;
        dx.cgpx[484] = -209560171;
        dx.cgpx[485] = 594306767;
        dx.cgpx[486] = 1072671368;
        dx.cgpx[487] = -497738705;
        dx.cgpx[488] = 1038196669;
        dx.cgpx[489] = 654240082;
        dx.cgpx[490] = 565326095;
        dx.cgpx[491] = 1063723804;
        dx.cgpx[492] = -764580430;
        dx.cgpx[493] = -668922823;
        dx.cgpx[494] = -1818720349;
        dx.cgpx[495] = -1722509232;
        dx.cgpx[496] = 775125893;
        dx.cgpx[497] = 262248025;
        dx.cgpx[498] = 158166306;
        dx.cgpx[499] = -900285531;
    }

    private static /* synthetic */ void cjct() {
        dx.cgpy[100] = -1736603186;
        dx.cgpy[101] = -68403986;
        dx.cgpy[102] = 1370937204;
        dx.cgpy[103] = -1134076855;
        dx.cgpy[104] = -676041457;
        dx.cgpy[105] = 1657591505;
        dx.cgpy[106] = -2033918389;
        dx.cgpy[107] = -998623935;
        dx.cgpy[108] = -709937714;
        dx.cgpy[109] = -246824880;
        dx.cgpy[110] = 692615212;
        dx.cgpy[111] = 1753867327;
        dx.cgpy[112] = -1632634854;
        dx.cgpy[113] = -46892710;
        dx.cgpy[114] = -553394523;
        dx.cgpy[115] = 195866787;
        dx.cgpy[116] = -1924449416;
        dx.cgpy[117] = 578788348;
        dx.cgpy[118] = 881157241;
        dx.cgpy[119] = -1733698678;
        dx.cgpy[120] = -1107283652;
        dx.cgpy[121] = 692942377;
        dx.cgpy[122] = 1748305440;
        dx.cgpy[123] = -377988819;
        dx.cgpy[124] = -1695712230;
        dx.cgpy[125] = 1101527997;
        dx.cgpy[126] = -1362752143;
        dx.cgpy[127] = 111492235;
        dx.cgpy[128] = 1381129468;
        dx.cgpy[129] = -1304996673;
        dx.cgpy[130] = -1183662947;
        dx.cgpy[131] = 457357638;
        dx.cgpy[132] = -449488619;
        dx.cgpy[133] = 1088195558;
        dx.cgpy[134] = -1840040865;
        dx.cgpy[135] = -1465196598;
        dx.cgpy[136] = -813257419;
        dx.cgpy[137] = -429252258;
        dx.cgpy[138] = 981469553;
        dx.cgpy[139] = 1282373556;
        dx.cgpy[140] = -643423650;
        dx.cgpy[141] = -1844673077;
        dx.cgpy[142] = -1681638079;
        dx.cgpy[143] = -326984592;
        dx.cgpy[144] = 26810264;
        dx.cgpy[145] = -376389234;
        dx.cgpy[146] = 195661284;
        dx.cgpy[147] = -533069788;
        dx.cgpy[148] = 1102501121;
        dx.cgpy[149] = -1579692986;
        dx.cgpy[150] = -1159376566;
        dx.cgpy[151] = 1518926028;
        dx.cgpy[152] = 1214151719;
        dx.cgpy[153] = -1834395495;
        dx.cgpy[154] = 1507545011;
        dx.cgpy[155] = 15448997;
        dx.cgpy[156] = -1985271398;
        dx.cgpy[157] = 1661016115;
        dx.cgpy[158] = 206524770;
        dx.cgpy[159] = -314545457;
        dx.cgpy[160] = -699393093;
        dx.cgpy[161] = 857586702;
        dx.cgpy[162] = -2102045809;
        dx.cgpy[163] = -311371475;
        dx.cgpy[164] = 1259336410;
        dx.cgpy[165] = 541668596;
        dx.cgpy[166] = -233072479;
        dx.cgpy[167] = 1687824527;
        dx.cgpy[168] = -941662592;
        dx.cgpy[169] = -943327167;
        dx.cgpy[170] = 1537804188;
        dx.cgpy[171] = -594696685;
        dx.cgpy[172] = -1913336824;
        dx.cgpy[173] = -221950739;
        dx.cgpy[174] = -2057466152;
        dx.cgpy[175] = -564623161;
        dx.cgpy[176] = 1577839220;
        dx.cgpy[177] = -2130254646;
        dx.cgpy[178] = -2039906829;
        dx.cgpy[179] = -1288276333;
        dx.cgpy[180] = -1120069763;
        dx.cgpy[181] = 721569289;
        dx.cgpy[182] = 1699482376;
        dx.cgpy[183] = 120386390;
        dx.cgpy[184] = -2076833301;
        dx.cgpy[185] = 1132382466;
        dx.cgpy[186] = -63408352;
        dx.cgpy[187] = 969678414;
        dx.cgpy[188] = -1146991321;
        dx.cgpy[189] = -1282986445;
        dx.cgpy[190] = -599489048;
        dx.cgpy[191] = 1249075644;
        dx.cgpy[192] = 241656334;
        dx.cgpy[193] = -1091432311;
        dx.cgpy[194] = -522568540;
        dx.cgpy[195] = 1916729543;
        dx.cgpy[196] = -532571897;
        dx.cgpy[197] = -209143842;
        dx.cgpy[198] = 1846680675;
        dx.cgpy[199] = -2136117344;
    }

    private static /* synthetic */ void cjdh() {
        dx.cgqe[200] = -1681077124091335112L;
        dx.cgqe[201] = 4341204285649123829L;
        dx.cgqe[202] = 5673460781546527096L;
        dx.cgqe[203] = 7438347053823612128L;
        dx.cgqe[204] = 2605555421596529860L;
        dx.cgqe[205] = -1626141970539495567L;
        dx.cgqe[206] = 2687181240190084152L;
        dx.cgqe[207] = -5218704324602373476L;
        dx.cgqe[208] = -8448592020596951255L;
        dx.cgqe[209] = 8584332470299070152L;
        dx.cgqe[210] = 4888970132846982579L;
        dx.cgqe[211] = -6436241743044495172L;
        dx.cgqe[212] = -1891602197919887034L;
        dx.cgqe[213] = -8598983445249480486L;
        dx.cgqe[214] = 254595342597858578L;
        dx.cgqe[215] = 1202475414765754248L;
        dx.cgqe[216] = 8488864984296782118L;
        dx.cgqe[217] = 9181218861133952220L;
        dx.cgqe[218] = -3221599387310719812L;
        dx.cgqe[219] = 2153904117247163429L;
        dx.cgqe[220] = 8906784492219227017L;
        dx.cgqe[221] = 7399216089896012568L;
        dx.cgqe[222] = 2783910699067253544L;
        dx.cgqe[223] = 2735654789855911144L;
        dx.cgqe[224] = 3309497765143246866L;
        dx.cgqe[225] = -7324531850470974009L;
        dx.cgqe[226] = -8430001775729911994L;
        dx.cgqe[227] = -3609878423851012065L;
        dx.cgqe[228] = 3313563672622168297L;
        dx.cgqe[229] = -3722963212648161444L;
        dx.cgqe[230] = -6188327572522624412L;
        dx.cgqe[231] = 7200554266370599725L;
        dx.cgqe[232] = 8319215867374300438L;
        dx.cgqe[233] = 3744924224851754451L;
        dx.cgqe[234] = 1654739106365657368L;
        dx.cgqe[235] = -9063654415467919519L;
        dx.cgqe[236] = 6645580713024848109L;
        dx.cgqe[237] = 2831640890590807085L;
        dx.cgqe[238] = 917637182174726856L;
        dx.cgqe[239] = 7439573293940823707L;
        dx.cgqe[240] = 3475299159554796279L;
        dx.cgqe[241] = 1494245213542140014L;
        dx.cgqe[242] = 2078400071570667030L;
        dx.cgqe[243] = 4438028393821914956L;
        dx.cgqe[244] = 8406571309944515238L;
        dx.cgqe[245] = -8830255435019923814L;
        dx.cgqe[246] = 5544914538995875315L;
        dx.cgqe[247] = 1894616803600380720L;
        dx.cgqe[248] = 2079025531866061003L;
        dx.cgqe[249] = 6771205027692394645L;
        dx.cgqe[250] = 6909563917185256141L;
        dx.cgqe[251] = 3660772299788002361L;
        dx.cgqe[252] = -3947000551571481833L;
        dx.cgqe[253] = -1861792894753449976L;
        dx.cgqe[254] = -5059961486272275871L;
        dx.cgqe[255] = -5453311438269485952L;
        dx.cgqe[256] = 3054215956781308547L;
        dx.cgqe[257] = 1272431746557482179L;
        dx.cgqe[258] = 1802207049558351234L;
        dx.cgqe[259] = 621424669676785927L;
        dx.cgqe[260] = 6985193100980443125L;
        dx.cgqe[261] = -7560210146455208337L;
        dx.cgqe[262] = -3437549563960553779L;
        dx.cgqe[263] = 6852197701221491941L;
        dx.cgqe[264] = 4556986809936689652L;
        dx.cgqe[265] = 5562370217397865894L;
        dx.cgqe[266] = -1431945308653721858L;
        dx.cgqe[267] = -7340116787570819926L;
        dx.cgqe[268] = -6324963495966653624L;
        dx.cgqe[269] = 6157958537973082929L;
        dx.cgqe[270] = -7628916517223208764L;
        dx.cgqe[271] = 3245221691411839780L;
        dx.cgqe[272] = 6650712101635365037L;
        dx.cgqe[273] = -5013976590068887506L;
        dx.cgqe[274] = -7054042704207130470L;
        dx.cgqe[275] = 6431450755665006731L;
        dx.cgqe[276] = 6529440158663780469L;
        dx.cgqe[277] = -6484784889063008750L;
        dx.cgqe[278] = 8613372060927664690L;
        dx.cgqe[279] = 6112638641713031756L;
    }

    private static /* synthetic */ void cjcu() {
        dx.cgpy[200] = -896796329;
        dx.cgpy[201] = -43380797;
        dx.cgpy[202] = 1027230580;
        dx.cgpy[203] = 794460646;
        dx.cgpy[204] = -489764429;
        dx.cgpy[205] = 14665342;
        dx.cgpy[206] = 639787544;
        dx.cgpy[207] = -1088488628;
        dx.cgpy[208] = -1806332394;
        dx.cgpy[209] = -659040170;
        dx.cgpy[210] = 2030751352;
        dx.cgpy[211] = 331054713;
        dx.cgpy[212] = -389640492;
        dx.cgpy[213] = 9767693;
        dx.cgpy[214] = 1737622489;
        dx.cgpy[215] = 355358255;
        dx.cgpy[216] = 415448303;
        dx.cgpy[217] = -1731387987;
        dx.cgpy[218] = 1240000781;
        dx.cgpy[219] = -1389185874;
        dx.cgpy[220] = -163969111;
        dx.cgpy[221] = 1838395527;
        dx.cgpy[222] = -1808057812;
        dx.cgpy[223] = 912917850;
        dx.cgpy[224] = -611879078;
        dx.cgpy[225] = 429730168;
        dx.cgpy[226] = 1439682948;
        dx.cgpy[227] = 2006332571;
        dx.cgpy[228] = -32661117;
        dx.cgpy[229] = -1655367570;
        dx.cgpy[230] = -1691350067;
        dx.cgpy[231] = 1247154692;
        dx.cgpy[232] = 1573276194;
        dx.cgpy[233] = 997711914;
        dx.cgpy[234] = -169559136;
        dx.cgpy[235] = 809709751;
        dx.cgpy[236] = -1362803129;
        dx.cgpy[237] = 1117235014;
        dx.cgpy[238] = 1649041450;
        dx.cgpy[239] = 1566763526;
        dx.cgpy[240] = -85593113;
        dx.cgpy[241] = 219207034;
        dx.cgpy[242] = 1575326492;
        dx.cgpy[243] = 164783709;
        dx.cgpy[244] = -499655953;
        dx.cgpy[245] = -562912998;
        dx.cgpy[246] = 163308005;
        dx.cgpy[247] = 951046240;
        dx.cgpy[248] = 762039196;
        dx.cgpy[249] = 312766690;
        dx.cgpy[250] = -339442141;
        dx.cgpy[251] = -37677488;
        dx.cgpy[252] = 1204030985;
        dx.cgpy[253] = 140056054;
        dx.cgpy[254] = 1002942806;
        dx.cgpy[255] = -1199907406;
        dx.cgpy[256] = 1931441929;
        dx.cgpy[257] = 1240277539;
        dx.cgpy[258] = -1975885866;
        dx.cgpy[259] = -1341092558;
        dx.cgpy[260] = 2044753462;
        dx.cgpy[261] = 903732842;
        dx.cgpy[262] = 370140935;
        dx.cgpy[263] = 325095620;
        dx.cgpy[264] = -185700023;
        dx.cgpy[265] = 249210303;
        dx.cgpy[266] = -530992438;
        dx.cgpy[267] = 387857419;
        dx.cgpy[268] = 824246444;
        dx.cgpy[269] = 860530701;
        dx.cgpy[270] = -1121917386;
        dx.cgpy[271] = -422777090;
        dx.cgpy[272] = 1816781133;
        dx.cgpy[273] = -784508546;
        dx.cgpy[274] = 2137838471;
        dx.cgpy[275] = 1614176457;
        dx.cgpy[276] = -1341411403;
        dx.cgpy[277] = -832826888;
        dx.cgpy[278] = 1445232470;
        dx.cgpy[279] = 1195390192;
        dx.cgpy[280] = 2096676952;
        dx.cgpy[281] = -1613258518;
        dx.cgpy[282] = 1604887306;
        dx.cgpy[283] = 1470316218;
        dx.cgpy[284] = -732518098;
        dx.cgpy[285] = 1286920519;
        dx.cgpy[286] = -169418098;
        dx.cgpy[287] = -2058807604;
        dx.cgpy[288] = -543666046;
        dx.cgpy[289] = -377005614;
        dx.cgpy[290] = -1015142077;
        dx.cgpy[291] = -247797997;
        dx.cgpy[292] = 1936299273;
        dx.cgpy[293] = 668603804;
        dx.cgpy[294] = 261579320;
        dx.cgpy[295] = -766078745;
        dx.cgpy[296] = 1178919733;
        dx.cgpy[297] = 2037997770;
        dx.cgpy[298] = 143982488;
        dx.cgpy[299] = 1823314284;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static String levelText(int var0) {
        v0 /* !! */  = dx.fu;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(dx.cgpz("cier", cgre(int ), (int)125) - dx.cgpz("cieq", cgre(int ), (int)124));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1782088442: {
                    continue block15;
                }
                case 1117133235: {
                    break block15;
                }
            }
            break;
        }
        var3_1 = dx.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = dx.fu - dx.cgpz("cies", cgre(int ), (int)126)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == dx.cgpz("ciet", cgpw(int ), (int)568)) break;
            v1 /* !! */  = (long)dx.cgpz("cieu", cgpw(int ), (int)569);
        }
        var2_2 /* !! */  = dx.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = dx.fu - dx.cgpz("cifa", cgre(int ), (int)127)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == dx.cgpz("cifb", cgpw(int ), (int)570)) break;
            v2 /* !! */  = (long)dx.cgpz("cifc", cgpw(int ), (int)571);
        }
        var1_3 = dx.a;
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
                v3 /* !! */  = dx.fu;
                if (true) ** GOTO lbl38
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - dx.cgpz("cifd", cgre(int ), (int)128));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -18180895: {
                            v4 = dx.cgpz("cife", cgre(int ), (int)129);
                            continue block19;
                        }
                        case 118071522: {
                            v4 = dx.cgpz("cifg", cgre(int ), (int)130);
                            continue block19;
                        }
                        case 1117133235: {
                            break block19;
                        }
                    }
                    break;
                }
                return "lvl " + var0;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)dx.cgpz("cifm", cgpw(int ), (int)572);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)dx.cgpz("cifn", cgpw(int ), (int)573);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)dx.cgpz("cifo", cgpw(int ), (int)574);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)dx.cgpz("cifp", cgpw(int ), (int)575);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void cjdb() {
        dx.cgpy[900] = 1736979010;
        dx.cgpy[901] = 346804756;
        dx.cgpy[902] = -939977296;
        dx.cgpy[903] = -1638223564;
        dx.cgpy[904] = -278194066;
        dx.cgpy[905] = 754376101;
        dx.cgpy[906] = -279011655;
        dx.cgpy[907] = -1570829201;
        dx.cgpy[908] = 1572622955;
        dx.cgpy[909] = -785673559;
        dx.cgpy[910] = -81421470;
        dx.cgpy[911] = 622573341;
        dx.cgpy[912] = 1950970736;
        dx.cgpy[913] = -1999747628;
        dx.cgpy[914] = -1469805960;
        dx.cgpy[915] = -887659421;
        dx.cgpy[916] = 338663397;
        dx.cgpy[917] = -1794821747;
        dx.cgpy[918] = -1937891805;
        dx.cgpy[919] = -762107596;
        dx.cgpy[920] = 756352627;
        dx.cgpy[921] = -2045712781;
        dx.cgpy[922] = 2011781786;
        dx.cgpy[923] = 1046498366;
        dx.cgpy[924] = -1933769241;
        dx.cgpy[925] = 1613519265;
        dx.cgpy[926] = -273333261;
        dx.cgpy[927] = -853859942;
        dx.cgpy[928] = -1727156760;
        dx.cgpy[929] = -617169013;
        dx.cgpy[930] = 362380892;
        dx.cgpy[931] = 1226978233;
        dx.cgpy[932] = 853194485;
        dx.cgpy[933] = 811648382;
        dx.cgpy[934] = 977614963;
        dx.cgpy[935] = 2093950223;
        dx.cgpy[936] = -471866147;
        dx.cgpy[937] = 1684020488;
        dx.cgpy[938] = -54698792;
        dx.cgpy[939] = 982303771;
        dx.cgpy[940] = 299050100;
        dx.cgpy[941] = -960112233;
        dx.cgpy[942] = -1519138563;
        dx.cgpy[943] = 1684790180;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawIcon(class_332 var0, ks var1_1, String var2_2, float var3_3, float var4_4, float var5_5, int var6_6) {
        block60: {
            var15_7 = dx.c;
            var14_8 /* !! */  = dx.b;
            var13_9 = dx.a;
            if (var15_7) {
                throw null;
lbl6:
                // 17 sources

                return;
            }
            if (var13_9 || var13_9) ** GOTO lbl6
            if (var1_1 == null) break block60;
            if (var13_9) ** GOTO lbl6
            if (!var2_2.isEmpty()) ** GOTO lbl20
            if (var13_9) ** GOTO lbl6
        }
        if (var13_9) ** GOTO lbl6
        if (var14_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var14_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var13_9) ** GOTO lbl6
                return;
            }
lbl20:
            // 1 sources

            if (var13_9 || var13_9) ** GOTO lbl6
            var7_10 = var1_1.getGlyph(var2_2.charAt((int)dx.cgpz("cimw", cgpw(int ), (int)644)));
            if (var13_9 || var13_9) ** GOTO lbl6
            if (var7_10 == null) ** GOTO lbl27
            if (var13_9) ** GOTO lbl6
            if (!(var7_10.width <= 0.0f)) ** GOTO lbl29
            if (var13_9) ** GOTO lbl6
lbl27:
            // 2 sources

            if (var13_9 || var13_9) ** GOTO lbl6
            return;
lbl29:
            // 1 sources

            if (var13_9 || var13_9) ** GOTO lbl6
            var8_11 = var5_5 * var1_1.getEmSize() / var7_10.width;
            if (var13_9 || var13_9) ** GOTO lbl6
            var9_12 = var8_11 / var1_1.getEmSize();
            if (var13_9 || var13_9) ** GOTO lbl6
            var10_13 = var4_4 - var7_10.height * var9_12 * dx.cgpz("cimx", cgqj(int ), (int)645);
            if (var13_9 || var13_9) ** GOTO lbl6
            var11_14 = var3_3 - var7_10.bearingX * var9_12;
            if (var13_9 || var13_9) ** GOTO lbl6
            var12_15 = var10_13 - var1_1.getAscender() * var9_12 + var7_10.bearingY * var9_12;
            if (var13_9 || var13_9) ** GOTO lbl6
            kq.text(var0, var1_1, var2_2, var11_14, var12_15, var8_11, var6_6, (boolean)dx.cgpz("cimy", cgpw(int ), (int)646));
            if (!var13_9 && !var13_9) ** break;
            ** continue;
            return;
lbl44:
            // 2 sources

            case 0: {
                var14_8 /* !! */  = (int)dx.cgpz("cimz", cgpw(int ), (int)647);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl87
            }
lbl49:
            // 3 sources

            case 1: {
                var14_8 /* !! */  = (int)dx.cgpz("cina", cgpw(int ), (int)648);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl54:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var14_8 /* !! */  = (int)dx.cgpz("cinb", cgpw(int ), (int)649);
                    if (var15_7) {
                        throw null;
                    }
                    ** GOTO lbl64
                    break;
                }
            }
lbl60:
            // 4 sources

            case 3: {
                var14_8 /* !! */  = (int)dx.cgpz("cinc", cgpw(int ), (int)650);
                if (!var15_7) ** GOTO lbl54
                throw null;
            }
lbl64:
            // 2 sources

            case 4: {
                var14_8 /* !! */  = (int)dx.cgpz("cind", cgpw(int ), (int)651);
                if (!var15_7) break;
                throw null;
            }
            case 5: {
                var14_8 /* !! */  = (int)dx.cgpz("cine", cgpw(int ), (int)652);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 6: {
                var14_8 /* !! */  = (int)dx.cgpz("cinf", cgpw(int ), (int)653);
                if (!var15_7) ** GOTO lbl49
                throw null;
            }
            case 7: {
                var14_8 /* !! */  = (int)dx.cgpz("cinh", cgpw(int ), (int)654);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl102
            }
lbl82:
            // 3 sources

            case 8: {
                var14_8 /* !! */  = (int)dx.cgpz("cini", cgpw(int ), (int)655);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl87:
            // 2 sources

            case 9: {
                var14_8 /* !! */  = (int)dx.cgpz("cinj", cgpw(int ), (int)656);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 10: {
                do {
                    var14_8 /* !! */  = (int)dx.cgpz("cink", cgpw(int ), (int)657);
                } while (!var15_7);
                throw null;
            }
            case 11: {
                var14_8 /* !! */  = (int)dx.cgpz("cinl", cgpw(int ), (int)658);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl102:
            // 2 sources

            case 12: {
                var14_8 /* !! */  = (int)dx.cgpz("cinm", cgpw(int ), (int)659);
                if (!var15_7) ** GOTO lbl49
                throw null;
            }
            case 13: {
                var14_8 /* !! */  = (int)dx.cgpz("cinn", cgpw(int ), (int)660);
                if (!var15_7) ** GOTO lbl60
                throw null;
            }
lbl110:
            // 2 sources

            case 14: {
                var14_8 /* !! */  = (int)dx.cgpz("cinp", cgpw(int ), (int)661);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl159
            }
            case 15: {
                var14_8 /* !! */  = (int)dx.cgpz("cinq", cgpw(int ), (int)662);
                if (!var15_7) ** GOTO lbl60
                throw null;
            }
            case 16: {
                var14_8 /* !! */  = (int)dx.cgpz("cinr", cgpw(int ), (int)663);
                if (!var15_7) ** GOTO lbl44
                throw null;
            }
            case 17: {
                var14_8 /* !! */  = (int)dx.cgpz("cins", cgpw(int ), (int)664);
                if (!var15_7) ** GOTO lbl110
                throw null;
            }
lbl127:
            // 6 sources

            case 18: {
                var14_8 /* !! */  = (int)dx.cgpz("cint", cgpw(int ), (int)665);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl132:
            // 2 sources

            case 19: {
                var14_8 /* !! */  = (int)dx.cgpz("cinu", cgpw(int ), (int)666);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 20: {
                var14_8 /* !! */  = (int)dx.cgpz("cinv", cgpw(int ), (int)667);
                if (var15_7) {
                    throw null;
                }
            }
            case 21: {
                var14_8 /* !! */  = (int)dx.cgpz("cinw", cgpw(int ), (int)668);
                if (!var15_7) ** GOTO lbl82
                throw null;
            }
lbl145:
            // 2 sources

            case 22: {
                var14_8 /* !! */  = (int)dx.cgpz("cinx", cgpw(int ), (int)669);
                if (!var15_7) ** GOTO lbl60
                throw null;
            }
            case 23: {
                var14_8 /* !! */  = (int)dx.cgpz("ciny", cgpw(int ), (int)670);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl154:
            // 3 sources

            case 24: {
                var14_8 /* !! */  = (int)dx.cgpz("cinz", cgpw(int ), (int)671);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl159:
            // 3 sources

            case 25: {
                var14_8 /* !! */  = (int)dx.cgpz("cioa", cgpw(int ), (int)672);
                if (!var15_7) ** GOTO lbl127
                throw null;
            }
lbl163:
            // 3 sources

            case 26: {
                var14_8 /* !! */  = (int)dx.cgpz("ciob", cgpw(int ), (int)673);
                if (!var15_7) ** GOTO lbl82
                throw null;
            }
            case 27: {
                var14_8 /* !! */  = (int)dx.cgpz("cioc", cgpw(int ), (int)674);
                if (!var15_7) ** GOTO lbl132
                throw null;
            }
lbl171:
            // 2 sources

            case 28: {
                var14_8 /* !! */  = (int)dx.cgpz("ciod", cgpw(int ), (int)675);
                if (!var15_7) ** GOTO lbl145
                throw null;
            }
            case 29: {
                var14_8 /* !! */  = (int)dx.cgpz("cioe", cgpw(int ), (int)676);
                if (!var15_7) ** GOTO lbl127
                throw null;
            }
            case 30: 
        }
        var14_8 /* !! */  = (int)dx.cgpz("ciof", cgpw(int ), (int)677);
        ** while (!var15_7)
lbl182:
        // 1 sources

        throw null;
    }
}

