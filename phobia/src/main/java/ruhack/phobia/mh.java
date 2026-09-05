/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  \u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a
 * 
 *  net.minecraft.class_11909
 *  net.minecraft.class_156
 *  net.minecraft.class_2561
 *  net.minecraft.class_332
 *  net.minecraft.class_429
 *  net.minecraft.class_437
 *  net.minecraft.class_500
 *  net.minecraft.class_526
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.net.URI;
import net.minecraft.class_11909;
import net.minecraft.class_156;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_429;
import net.minecraft.class_437;
import net.minecraft.class_500;
import net.minecraft.class_526;
import ruhack.phobia.ki;
import ruhack.phobia.kq;
import ruhack.phobia.ks;
import ruhack.phobia.kv;
import ruhack.phobia.ld;
import ruhack.phobia.mh$Action;
import ruhack.phobia.mh$MenuButton;
import ruhack.phobia.nd;

public final class mh
extends class_437 {
    private final mh$MenuButton singleplayer;
    private static int[] jhdv;
    private static final float SOCIAL_X = 6.0f;
    private static final int ACCENT;
    private float exitSliderHover;
    private float intro;
    private float exitSliderY;
    private static final String DISCORD_URL = "https://discord.gg/8yDgeKtvec";
    public static final boolean a;
    private float exitSliderX;
    private long lastFrame;
    private static final float SOCIAL_WIDTH = 43.9f;
    public static final int b;
    private static final float SOCIAL_SLOT_SIZE = 18.2f;
    @\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a

    private static final String TELEGRAM_URL = "https://t.me/drugsoluti0ns";
    private boolean exitSliderDragging;
    public static final boolean c;
    private float exitSliderWidth;
    private static final String TELEGRAM_ICON = "A";
    private static int[] jhdu;
    private static final float SOCIAL_PADDING = 2.6f;
    private float telegramHover;
    private float exitSliderHeight;
    private static final float SOCIAL_SLOT_RADIUS = 5.1f;
    private static Object fancyMenuBlacklistRule;
    private final mh$MenuButton multiplayer;
    private static final int TEXT;
    private static final float SOCIAL_HEIGHT = 23.400002f;
    private float exitSliderVisualProgress;
    private final mh$MenuButton accounts;
    private static final float SOCIAL_RADIUS = 7.0f;
    private float discordHover;
    private float exitSliderProgress;
    private static final int MUTED;
    private static final float SOCIAL_GAP = 2.3f;
    private static long[] jhfu;
    private final mh$MenuButton settings;
    protected static final long rl = 4453377851998085494L;
    private static final String DISCORD_ICON = "B";
    private final mh$MenuButton[] buttons;
    private static long[] jhft;
    private static final float SOCIAL_Y = 6.0f;

    /*
     * Exception decompiling
     */
    private void openAccountSwitcher() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 19[SWITCH]
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
    private void renderBrand(class_332 var1_1, float var2_2, float var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mh.rl - mh.jhdw("jhzq", jhfs(int ), (int)73)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == mh.jhdw("jhzr", jhdt(int ), (int)469)) break;
            v0 /* !! */  = (long)mh.jhdw("jhzs", jhdt(int ), (int)470);
        }
        var10_4 = mh.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mh.rl - mh.jhdw("jhzt", jhfs(int ), (int)74)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == mh.jhdw("jhzu", jhdt(int ), (int)471)) break;
            v1 /* !! */  = (long)mh.jhdw("jhzv", jhdt(int ), (int)472);
        }
        var9_5 /* !! */  = mh.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = mh.rl - mh.jhdw("jhzw", jhfs(int ), (int)75)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == mh.jhdw("jhzx", jhdt(int ), (int)473)) break;
            v2 /* !! */  = (long)mh.jhdw("jhzy", jhdt(int ), (int)474);
        }
        var8_6 = mh.a;
        if (var10_4) {
            throw null;
lbl21:
            // 6 sources

            return;
        }
        if (var8_6 || var8_6) ** GOTO lbl21
        v3 = mh.jhdw("jhzz", jhib(int ), (int)475);
        v4 = var3_3 * mh.jhdw("jiaa", jhib(int ), (int)476);
        v5 /* !! */  = mh.rl;
        if (true) ** GOTO lbl30
        block43: while (true) {
            v5 /* !! */  = (long)(v6 - mh.jhdw("jiab", jhfs(int ), (int)76));
lbl30:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1642777795: {
                    v6 = mh.jhdw("jiac", jhfs(int ), (int)77);
                    continue block43;
                }
                case -1225776778: {
                    break block43;
                }
                case -772745465: {
                    v6 = mh.jhdw("jiad", jhfs(int ), (int)78);
                    continue block43;
                }
            }
            break;
        }
        var4_7 = Math.max((float)v3, v4);
        if (var8_6 || var8_6) ** GOTO lbl21
        if (var9_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var5_8 = mh.jhdw("jiae", jhib(int ), (int)477);
                if (var8_6 || var8_6) ** GOTO lbl21
                var6_9 = "PHOBIA";
                if (var8_6 || var8_6) ** GOTO lbl21
                v7 = var2_2 * mh.jhdw("jiaf", jhib(int ), (int)478);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = mh.rl - mh.jhdw("jiag", jhfs(int ), (int)79)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == mh.jhdw("jiai", jhdt(int ), (int)479)) break;
                    v8 /* !! */  = (long)mh.jhdw("jial", jhdt(int ), (int)480);
                }
                v9 /* !! */  = mh.rl;
                if (true) ** GOTO lbl58
                block45: while (true) {
                    v9 /* !! */  = (long)(v10 - mh.jhdw("jian", jhfs(int ), (int)80));
lbl58:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1225776778: {
                            break block45;
                        }
                        case -291573471: {
                            v10 = mh.jhdw("jiaq", jhfs(int ), (int)81);
                            continue block45;
                        }
                        case 1945825509: {
                            v10 = mh.jhdw("jias", jhfs(int ), (int)82);
                            continue block45;
                        }
                    }
                    break;
                }
                var7_10 = v7 - kq.width(kv.HAMBURG_REGULAR, var6_9, (float)var5_8) * mh.jhdw("jiau", jhib(int ), (int)481);
                if (var8_6 || var8_6) ** GOTO lbl21
                v11 /* !! */  = mh.rl;
                if (true) ** GOTO lbl73
                block46: while (true) {
                    v11 /* !! */  = (long)(v12 - mh.jhdw("jiaw", jhfs(int ), (int)83));
lbl73:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1225776778: {
                            break block46;
                        }
                        case 1440127967: {
                            v12 = mh.jhdw("jiax", jhfs(int ), (int)84);
                            continue block46;
                        }
                        case 1483155697: {
                            v12 = mh.jhdw("jiaz", jhfs(int ), (int)85);
                            continue block46;
                        }
                    }
                    break;
                }
                v13 /* !! */  = mh.rl;
                if (true) ** GOTO lbl86
                block47: while (true) {
                    v13 /* !! */  = (long)(mh.jhdw("jibd", jhfs(int ), (int)87) - mh.jhdw("jibc", jhfs(int ), (int)86));
lbl86:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1908089627: {
                            continue block47;
                        }
                        case -1225776778: {
                            break block47;
                        }
                    }
                    break;
                }
                v14 /* !! */  = mh.rl;
                if (true) ** GOTO lbl95
                block48: while (true) {
                    v14 /* !! */  = (long)(mh.jhdw("jibi", jhfs(int ), (int)89) - mh.jhdw("jibg", jhfs(int ), (int)88));
lbl95:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1225776778: {
                            break block48;
                        }
                        case -1143652890: {
                            continue block48;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_4 = mh.rl - mh.jhdw("jibk", jhfs(int ), (int)90)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == mh.jhdw("jibm", jhdt(int ), (int)482)) break;
                    v15 /* !! */  = (long)mh.jhdw("jibn", jhdt(int ), (int)483);
                }
                v16 = nd.multAlpha(mh.ACCENT, this.intro);
                v17 = mh.jhdw("jibp", jhdt(int ), (int)484);
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_5 = mh.rl - mh.jhdw("jibr", jhfs(int ), (int)91)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == mh.jhdw("jibt", jhdt(int ), (int)485)) break;
                    v18 /* !! */  = (long)mh.jhdw("jibu", jhdt(int ), (int)486);
                }
                kq.text(var1_1, kv.HAMBURG_REGULAR, var6_9, var7_10, var4_7, (float)var5_8, v16, (boolean)v17);
                if (var8_6 || var8_6) ** continue;
                return;
            }
            case 0: {
                do {
                    var9_5 /* !! */  = (int)mh.jhdw("jibw", jhdt(int ), (int)487);
                } while (!var10_4);
                throw null;
            }
lbl120:
            // 4 sources

            case 1: {
                var9_5 /* !! */  = (int)mh.jhdw("jibx", jhdt(int ), (int)488);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 2: {
                do {
                    var9_5 /* !! */  = (int)mh.jhdw("jiby", jhdt(int ), (int)489);
                } while (!var10_4);
                throw null;
            }
lbl130:
            // 2 sources

            case 3: {
                var9_5 /* !! */  = (int)mh.jhdw("jibz", jhdt(int ), (int)490);
                if (var10_4) {
                    throw null;
                }
            }
            case 4: {
                var9_5 /* !! */  = (int)mh.jhdw("jica", jhdt(int ), (int)491);
                if (!var10_4) ** GOTO lbl120
                throw null;
            }
lbl138:
            // 2 sources

            case 5: {
                var9_5 /* !! */  = (int)mh.jhdw("jicb", jhdt(int ), (int)492);
                if (!var10_4) ** GOTO lbl120
                throw null;
            }
            case 6: {
                var9_5 /* !! */  = (int)mh.jhdw("jicc", jhdt(int ), (int)493);
                if (!var10_4) ** GOTO lbl138
                throw null;
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var9_5 /* !! */  = (int)mh.jhdw("jicd", jhdt(int ), (int)494);
                    if (!var10_4) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 8: {
                var9_5 /* !! */  = (int)mh.jhdw("jicg", jhdt(int ), (int)495);
                if (var10_4) {
                    throw null;
                }
            }
lbl155:
            // 4 sources

            case 9: {
                var9_5 /* !! */  = (int)mh.jhdw("jici", jhdt(int ), (int)496);
                if (!var10_4) ** GOTO lbl130
                throw null;
            }
            case 10: {
                var9_5 /* !! */  = (int)mh.jhdw("jick", jhdt(int ), (int)497);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 11: {
                var9_5 /* !! */  = (int)mh.jhdw("jico", jhdt(int ), (int)498);
                if (!var10_4) ** GOTO lbl120
                throw null;
            }
lbl168:
            // 2 sources

            case 12: {
                do {
                    var9_5 /* !! */  = (int)mh.jhdw("jicq", jhdt(int ), (int)499);
                } while (!var10_4);
                throw null;
            }
            case 13: 
        }
        var9_5 /* !! */  = (int)mh.jhdw("jict", jhdt(int ), (int)500);
        ** while (!var10_4)
lbl176:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float clamp(float var0, float var1_1, float var2_2) {
        v0 /* !! */  = mh.rl;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(v1 - mh.jhdw("jjay", jhfs(int ), (int)232));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1225776778: {
                    break block15;
                }
                case 96257677: {
                    v1 = mh.jhdw("jjaz", jhfs(int ), (int)233);
                    continue block15;
                }
                case 1122555689: {
                    v1 = mh.jhdw("jjba", jhfs(int ), (int)234);
                    continue block15;
                }
            }
            break;
        }
        var5_3 = mh.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mh.rl - mh.jhdw("jjbb", jhfs(int ), (int)235)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mh.jhdw("jjbc", jhdt(int ), (int)765)) break;
            v2 /* !! */  = (long)mh.jhdw("jjbd", jhdt(int ), (int)766);
        }
        var4_4 /* !! */  = mh.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mh.rl - mh.jhdw("jjbe", jhfs(int ), (int)236)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mh.jhdw("jjbf", jhdt(int ), (int)767)) break;
            v3 /* !! */  = (long)mh.jhdw("jjbg", jhdt(int ), (int)768);
        }
        var3_5 = mh.a;
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_3) {
                    throw null;
                    return (float)mh.jhdw("jjbh", jhib(int ), (int)769);
                }
                if (var3_5 || var3_5) ** continue;
                v4 /* !! */  = mh.rl;
                if (true) ** GOTO lbl41
                block19: while (true) {
                    v4 /* !! */  = (long)(mh.jhdw("jjbj", jhfs(int ), (int)238) - mh.jhdw("jjbi", jhfs(int ), (int)237));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1225776778: {
                            break block19;
                        }
                        case 597400741: {
                            continue block19;
                        }
                    }
                    break;
                }
                v5 = Math.min(var2_2, var0);
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = mh.rl - mh.jhdw("jjbk", jhfs(int ), (int)239)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == mh.jhdw("jjbl", jhdt(int ), (int)770)) break;
                    v6 /* !! */  = (long)mh.jhdw("jjbm", jhdt(int ), (int)771);
                }
                return Math.max(var1_1, v5);
            }
            case 0: {
                var4_4 /* !! */  = (int)mh.jhdw("jjbn", jhdt(int ), (int)772);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl64
            }
lbl59:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var4_4 /* !! */  = (int)mh.jhdw("jjbo", jhdt(int ), (int)773);
                    if (!var5_3) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl64:
            // 2 sources

            case 2: {
                var4_4 /* !! */  = (int)mh.jhdw("jjbp", jhdt(int ), (int)774);
                if (!var5_3) ** GOTO lbl59
                throw null;
            }
            case 3: 
        }
        var4_4 /* !! */  = (int)mh.jhdw("jjbq", jhdt(int ), (int)775);
        ** while (!var5_3)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jjfd() {
        mh.jhdv[800] = -794565818;
        mh.jhdv[801] = -406747653;
        mh.jhdv[802] = -1448195197;
        mh.jhdv[803] = -2030867279;
        mh.jhdv[804] = -845524865;
        mh.jhdv[805] = -1774289893;
        mh.jhdv[806] = -1650067975;
        mh.jhdv[807] = -1689294348;
        mh.jhdv[808] = -2063001970;
        mh.jhdv[809] = -32101945;
        mh.jhdv[810] = -932510789;
        mh.jhdv[811] = 510971901;
        mh.jhdv[812] = -1216552073;
        mh.jhdv[813] = -1681585187;
        mh.jhdv[814] = -2106691027;
        mh.jhdv[815] = 1327963648;
        mh.jhdv[816] = 1581323239;
        mh.jhdv[817] = 204587030;
        mh.jhdv[818] = 2059509210;
        mh.jhdv[819] = -2035174411;
        mh.jhdv[820] = -780695105;
        mh.jhdv[821] = -381816010;
        mh.jhdv[822] = -2034342248;
        mh.jhdv[823] = 1026002423;
        mh.jhdv[824] = 1660479187;
        mh.jhdv[825] = 1421573759;
        mh.jhdv[826] = -1010109974;
        mh.jhdv[827] = 915595470;
        mh.jhdv[828] = 313995246;
        mh.jhdv[829] = 613509222;
        mh.jhdv[830] = 1605152676;
        mh.jhdv[831] = -475436086;
        mh.jhdv[832] = 75045913;
        mh.jhdv[833] = 1466154121;
        mh.jhdv[834] = -1124825899;
        mh.jhdv[835] = 1418957778;
        mh.jhdv[836] = 258249756;
        mh.jhdv[837] = -1496551713;
        mh.jhdv[838] = 1565016288;
        mh.jhdv[839] = 782343100;
        mh.jhdv[840] = -231528891;
        mh.jhdv[841] = -1839022544;
        mh.jhdv[842] = -1863597844;
        mh.jhdv[843] = -139751970;
        mh.jhdv[844] = 1129542247;
        mh.jhdv[845] = -1330525752;
        mh.jhdv[846] = -1808898690;
        mh.jhdv[847] = -1601328412;
        mh.jhdv[848] = 921096741;
    }

    private static /* synthetic */ void jjev() {
        mh.jhdv[0] = -1941926946;
        mh.jhdv[1] = 1315299073;
        mh.jhdv[2] = 1673168020;
        mh.jhdv[3] = -449523292;
        mh.jhdv[4] = -1478326407;
        mh.jhdv[5] = -1491991133;
        mh.jhdv[6] = 1506894023;
        mh.jhdv[7] = -769998242;
        mh.jhdv[8] = -930082100;
        mh.jhdv[9] = 811283575;
        mh.jhdv[10] = 240910689;
        mh.jhdv[11] = 1505998430;
        mh.jhdv[12] = -311720181;
        mh.jhdv[13] = -192615475;
        mh.jhdv[14] = 1339980405;
        mh.jhdv[15] = -1313475131;
        mh.jhdv[16] = 2121756438;
        mh.jhdv[17] = 2083754957;
        mh.jhdv[18] = 1884944961;
        mh.jhdv[19] = -134395777;
        mh.jhdv[20] = 1751354875;
        mh.jhdv[21] = 1380113066;
        mh.jhdv[22] = -265970361;
        mh.jhdv[23] = -1991925357;
        mh.jhdv[24] = -2059056705;
        mh.jhdv[25] = -1360575977;
        mh.jhdv[26] = 2134761660;
        mh.jhdv[27] = 480553916;
        mh.jhdv[28] = 1982168670;
        mh.jhdv[29] = -2074701830;
        mh.jhdv[30] = -1272031450;
        mh.jhdv[31] = 1553402681;
        mh.jhdv[32] = -680919793;
        mh.jhdv[33] = -491121057;
        mh.jhdv[34] = 869237568;
        mh.jhdv[35] = -407934751;
        mh.jhdv[36] = 1572944843;
        mh.jhdv[37] = 1307117230;
        mh.jhdv[38] = 1682767136;
        mh.jhdv[39] = -2067621255;
        mh.jhdv[40] = -1097139952;
        mh.jhdv[41] = 211305504;
        mh.jhdv[42] = -1232714341;
        mh.jhdv[43] = -146965431;
        mh.jhdv[44] = 648075234;
        mh.jhdv[45] = 1099983215;
        mh.jhdv[46] = 1159654376;
        mh.jhdv[47] = 1263662541;
        mh.jhdv[48] = 381217154;
        mh.jhdv[49] = 678346886;
        mh.jhdv[50] = 357761945;
        mh.jhdv[51] = -33942969;
        mh.jhdv[52] = -559444496;
        mh.jhdv[53] = -270385970;
        mh.jhdv[54] = -1694181131;
        mh.jhdv[55] = -1255241859;
        mh.jhdv[56] = 2031427782;
        mh.jhdv[57] = -2067673608;
        mh.jhdv[58] = -1490471987;
        mh.jhdv[59] = -291558347;
        mh.jhdv[60] = 390403445;
        mh.jhdv[61] = -309626625;
        mh.jhdv[62] = 441926713;
        mh.jhdv[63] = -639964424;
        mh.jhdv[64] = -1250237769;
        mh.jhdv[65] = 1820453592;
        mh.jhdv[66] = -86949845;
        mh.jhdv[67] = 1277025128;
        mh.jhdv[68] = 1619762424;
        mh.jhdv[69] = 1210759855;
        mh.jhdv[70] = -1233765327;
        mh.jhdv[71] = 536493872;
        mh.jhdv[72] = 485343546;
        mh.jhdv[73] = 817825066;
        mh.jhdv[74] = 2009534714;
        mh.jhdv[75] = -598551753;
        mh.jhdv[76] = -667779016;
        mh.jhdv[77] = -2021473603;
        mh.jhdv[78] = 1796576536;
        mh.jhdv[79] = -804487151;
        mh.jhdv[80] = 455481294;
        mh.jhdv[81] = 1728753468;
        mh.jhdv[82] = -423153914;
        mh.jhdv[83] = 424025529;
        mh.jhdv[84] = -1202594153;
        mh.jhdv[85] = -1170172239;
        mh.jhdv[86] = -1063255187;
        mh.jhdv[87] = 547110525;
        mh.jhdv[88] = -517937705;
        mh.jhdv[89] = 480189295;
        mh.jhdv[90] = 1838957474;
        mh.jhdv[91] = 1055536441;
        mh.jhdv[92] = -191736421;
        mh.jhdv[93] = 1142638951;
        mh.jhdv[94] = -1640931213;
        mh.jhdv[95] = -1655125305;
        mh.jhdv[96] = -76355809;
        mh.jhdv[97] = 365136569;
        mh.jhdv[98] = -1507252957;
        mh.jhdv[99] = -1482795339;
    }

    private static /* synthetic */ void jjff() {
        mh.jhft[100] = 622169776636409272L;
        mh.jhft[101] = 8942054658730023609L;
        mh.jhft[102] = -8965358810069694817L;
        mh.jhft[103] = -4008239435480527441L;
        mh.jhft[104] = -5648747231218879307L;
        mh.jhft[105] = -7135431322762009952L;
        mh.jhft[106] = 2955895693948397144L;
        mh.jhft[107] = 602766521332207108L;
        mh.jhft[108] = 6210461582029414886L;
        mh.jhft[109] = 6281899796696161828L;
        mh.jhft[110] = 4768981547120400377L;
        mh.jhft[111] = 4211678663670669023L;
        mh.jhft[112] = 6736961225945528914L;
        mh.jhft[113] = 7299161655838158014L;
        mh.jhft[114] = 7610169323075496545L;
        mh.jhft[115] = -5341023749636093703L;
        mh.jhft[116] = -3956948764605153257L;
        mh.jhft[117] = -5552464298118784649L;
        mh.jhft[118] = -8792720197120863521L;
        mh.jhft[119] = 1989417539651213329L;
        mh.jhft[120] = -5932556988381290677L;
        mh.jhft[121] = 5760586377806541680L;
        mh.jhft[122] = 1005604949868958963L;
        mh.jhft[123] = -1214068204967618099L;
        mh.jhft[124] = -4171281265559335348L;
        mh.jhft[125] = 8560668697293126274L;
        mh.jhft[126] = 1236620538881243408L;
        mh.jhft[127] = 3681175713424967434L;
        mh.jhft[128] = 6867312355428775192L;
        mh.jhft[129] = -8751348615657983828L;
        mh.jhft[130] = -3625791210490806731L;
        mh.jhft[131] = 7108261628141961776L;
        mh.jhft[132] = -8107840268327811998L;
        mh.jhft[133] = -8575754232781996311L;
        mh.jhft[134] = -1720486738437374498L;
        mh.jhft[135] = 4667171171896374404L;
        mh.jhft[136] = -9122914266101728229L;
        mh.jhft[137] = 8777660852502598888L;
        mh.jhft[138] = -4257254663570482072L;
        mh.jhft[139] = -4168249803626523336L;
        mh.jhft[140] = 4950470156655347248L;
        mh.jhft[141] = -7227292969158948895L;
        mh.jhft[142] = 874268030964201069L;
        mh.jhft[143] = -6641672896826608264L;
        mh.jhft[144] = -1254981678069791245L;
        mh.jhft[145] = 2227898537065368727L;
        mh.jhft[146] = -3854802769344632147L;
        mh.jhft[147] = -1866480095930060908L;
        mh.jhft[148] = 7235577395054524862L;
        mh.jhft[149] = 5350573673260549934L;
        mh.jhft[150] = -5359577341244887990L;
        mh.jhft[151] = -4317775546116760638L;
        mh.jhft[152] = -4392969853480503162L;
        mh.jhft[153] = 8433257034532189751L;
        mh.jhft[154] = 490214056336817721L;
        mh.jhft[155] = -3214410832538542216L;
        mh.jhft[156] = 4128709088236901503L;
        mh.jhft[157] = -6572159891893115885L;
        mh.jhft[158] = -4424269310496996267L;
        mh.jhft[159] = -6349375834924942386L;
        mh.jhft[160] = 6305998838541043614L;
        mh.jhft[161] = 6267565364632257070L;
        mh.jhft[162] = 584206826400555946L;
        mh.jhft[163] = -9036685868525587598L;
        mh.jhft[164] = 7883973143515826095L;
        mh.jhft[165] = -3212102065540073182L;
        mh.jhft[166] = 4442240506363253640L;
        mh.jhft[167] = 5738634679615491046L;
        mh.jhft[168] = 6213713440276724438L;
        mh.jhft[169] = -7503689354923055141L;
        mh.jhft[170] = -319936010902188651L;
        mh.jhft[171] = -3771071402092307713L;
        mh.jhft[172] = -5639154883341012898L;
        mh.jhft[173] = -4864022263838261265L;
        mh.jhft[174] = -3397931444444121005L;
        mh.jhft[175] = -204678287509946825L;
        mh.jhft[176] = -1629494731800569271L;
        mh.jhft[177] = 6827441670436044116L;
        mh.jhft[178] = -7702451469626439713L;
        mh.jhft[179] = 7873068003022082974L;
        mh.jhft[180] = -8604294138326618649L;
        mh.jhft[181] = 737322329826851154L;
        mh.jhft[182] = -8890541313054461625L;
        mh.jhft[183] = 7792197439294496210L;
        mh.jhft[184] = -7153248113718298526L;
        mh.jhft[185] = -2416722655364210574L;
        mh.jhft[186] = 1615766005502213180L;
        mh.jhft[187] = -34554348109638093L;
        mh.jhft[188] = 6540211981986212465L;
        mh.jhft[189] = -3681025814884401387L;
        mh.jhft[190] = -2655239708645327509L;
        mh.jhft[191] = 5156962831837305317L;
        mh.jhft[192] = -2314178457354682053L;
        mh.jhft[193] = -73512193053888452L;
        mh.jhft[194] = 4701276468387514738L;
        mh.jhft[195] = 3507431827219150658L;
        mh.jhft[196] = -2582726547241069094L;
        mh.jhft[197] = -9051618643251860812L;
        mh.jhft[198] = 6322377385779981667L;
        mh.jhft[199] = 8265864055624125356L;
    }

    private static /* synthetic */ void jjex() {
        mh.jhdv[200] = 1383988018;
        mh.jhdv[201] = -1400521086;
        mh.jhdv[202] = -1645148974;
        mh.jhdv[203] = -69512638;
        mh.jhdv[204] = 1823485445;
        mh.jhdv[205] = -813020966;
        mh.jhdv[206] = -635241449;
        mh.jhdv[207] = 1284632149;
        mh.jhdv[208] = 1982075546;
        mh.jhdv[209] = 967449924;
        mh.jhdv[210] = -573728215;
        mh.jhdv[211] = -1352017025;
        mh.jhdv[212] = 1252996232;
        mh.jhdv[213] = 73997252;
        mh.jhdv[214] = -399219638;
        mh.jhdv[215] = -55209141;
        mh.jhdv[216] = 1540185689;
        mh.jhdv[217] = -234750578;
        mh.jhdv[218] = 1113089553;
        mh.jhdv[219] = -528833081;
        mh.jhdv[220] = -1261590314;
        mh.jhdv[221] = -1157829377;
        mh.jhdv[222] = 1099701321;
        mh.jhdv[223] = 447059100;
        mh.jhdv[224] = 908769927;
        mh.jhdv[225] = -1585239856;
        mh.jhdv[226] = -1298093544;
        mh.jhdv[227] = -197670049;
        mh.jhdv[228] = -1935082631;
        mh.jhdv[229] = 2087528072;
        mh.jhdv[230] = -1664172957;
        mh.jhdv[231] = -789821147;
        mh.jhdv[232] = -784481983;
        mh.jhdv[233] = -1981028302;
        mh.jhdv[234] = 817872753;
        mh.jhdv[235] = -410726564;
        mh.jhdv[236] = 1567536961;
        mh.jhdv[237] = -1434093232;
        mh.jhdv[238] = -2025698610;
        mh.jhdv[239] = -1145394728;
        mh.jhdv[240] = -720828631;
        mh.jhdv[241] = -467155185;
        mh.jhdv[242] = -964761743;
        mh.jhdv[243] = 1089168428;
        mh.jhdv[244] = 369362368;
        mh.jhdv[245] = 1771325371;
        mh.jhdv[246] = -97479648;
        mh.jhdv[247] = 1967849531;
        mh.jhdv[248] = 307980260;
        mh.jhdv[249] = -1080416908;
        mh.jhdv[250] = -1514755053;
        mh.jhdv[251] = 2146075150;
        mh.jhdv[252] = 971588559;
        mh.jhdv[253] = -826548190;
        mh.jhdv[254] = -66317353;
        mh.jhdv[255] = -1317346074;
        mh.jhdv[256] = 1007182491;
        mh.jhdv[257] = -935814490;
        mh.jhdv[258] = 67752053;
        mh.jhdv[259] = 1436667285;
        mh.jhdv[260] = 2118886919;
        mh.jhdv[261] = 1077970769;
        mh.jhdv[262] = 1830382803;
        mh.jhdv[263] = -1170829815;
        mh.jhdv[264] = -1491106181;
        mh.jhdv[265] = -274782311;
        mh.jhdv[266] = -874655399;
        mh.jhdv[267] = -1206694359;
        mh.jhdv[268] = 1157033289;
        mh.jhdv[269] = 1553814281;
        mh.jhdv[270] = -1784712745;
        mh.jhdv[271] = -141595165;
        mh.jhdv[272] = -1393234123;
        mh.jhdv[273] = -1870120583;
        mh.jhdv[274] = -692914779;
        mh.jhdv[275] = 242578565;
        mh.jhdv[276] = 723069751;
        mh.jhdv[277] = -865479553;
        mh.jhdv[278] = 165658123;
        mh.jhdv[279] = -275242676;
        mh.jhdv[280] = 302829950;
        mh.jhdv[281] = 1733458981;
        mh.jhdv[282] = 121499363;
        mh.jhdv[283] = 1246720314;
        mh.jhdv[284] = -27665027;
        mh.jhdv[285] = -748704212;
        mh.jhdv[286] = 1139083714;
        mh.jhdv[287] = -1101407445;
        mh.jhdv[288] = 75689619;
        mh.jhdv[289] = -379738609;
        mh.jhdv[290] = -1490421915;
        mh.jhdv[291] = -61194323;
        mh.jhdv[292] = 1125932474;
        mh.jhdv[293] = 1361322078;
        mh.jhdv[294] = -2050023802;
        mh.jhdv[295] = -1645227861;
        mh.jhdv[296] = -960336589;
        mh.jhdv[297] = 0x6B66B8B8;
        mh.jhdv[298] = 1980493379;
        mh.jhdv[299] = 423476015;
    }

    private static /* synthetic */ void jjet() {
        mh.jhdu[700] = -60305981;
        mh.jhdu[701] = -495145501;
        mh.jhdu[702] = -1430452442;
        mh.jhdu[703] = 1126842362;
        mh.jhdu[704] = 2118766839;
        mh.jhdu[705] = 724257976;
        mh.jhdu[706] = -2035097187;
        mh.jhdu[707] = -448876409;
        mh.jhdu[708] = 1608749723;
        mh.jhdu[709] = -399024497;
        mh.jhdu[710] = 732072048;
        mh.jhdu[711] = -1391410756;
        mh.jhdu[712] = 221361644;
        mh.jhdu[713] = -178657150;
        mh.jhdu[714] = 1554062061;
        mh.jhdu[715] = -2031681951;
        mh.jhdu[716] = -362198225;
        mh.jhdu[717] = 1582991953;
        mh.jhdu[718] = 2098787686;
        mh.jhdu[719] = -2126780988;
        mh.jhdu[720] = 168529733;
        mh.jhdu[721] = 459541808;
        mh.jhdu[722] = -1087461003;
        mh.jhdu[723] = -509123890;
        mh.jhdu[724] = 349827940;
        mh.jhdu[725] = -1149261207;
        mh.jhdu[726] = 1455601267;
        mh.jhdu[727] = -1753238858;
        mh.jhdu[728] = -1591325064;
        mh.jhdu[729] = -107187677;
        mh.jhdu[730] = -1790841402;
        mh.jhdu[731] = 1536134184;
        mh.jhdu[732] = 1677390639;
        mh.jhdu[733] = 2069352528;
        mh.jhdu[734] = 494578010;
        mh.jhdu[735] = -1647167678;
        mh.jhdu[736] = 476770640;
        mh.jhdu[737] = -581468265;
        mh.jhdu[738] = -1742064955;
        mh.jhdu[739] = -1327650637;
        mh.jhdu[740] = 285364564;
        mh.jhdu[741] = 246275164;
        mh.jhdu[742] = 1781950422;
        mh.jhdu[743] = -118454575;
        mh.jhdu[744] = -292045401;
        mh.jhdu[745] = 1253675376;
        mh.jhdu[746] = 1122651937;
        mh.jhdu[747] = 334285897;
        mh.jhdu[748] = 1890510510;
        mh.jhdu[749] = 1161137232;
        mh.jhdu[750] = -1436200387;
        mh.jhdu[751] = -1737854609;
        mh.jhdu[752] = -1195228295;
        mh.jhdu[753] = 1249045771;
        mh.jhdu[754] = -947626901;
        mh.jhdu[755] = 1664803072;
        mh.jhdu[756] = -1145884039;
        mh.jhdu[757] = -1742052;
        mh.jhdu[758] = 1385116356;
        mh.jhdu[759] = 384520869;
        mh.jhdu[760] = -939771434;
        mh.jhdu[761] = -923720649;
        mh.jhdu[762] = 2102440108;
        mh.jhdu[763] = 1656010278;
        mh.jhdu[764] = -2121656589;
        mh.jhdu[765] = 1767643372;
        mh.jhdu[766] = -2113182948;
        mh.jhdu[767] = -551521502;
        mh.jhdu[768] = 1436148102;
        mh.jhdu[769] = 982228935;
        mh.jhdu[770] = 516154422;
        mh.jhdu[771] = 102265409;
        mh.jhdu[772] = 1868788528;
        mh.jhdu[773] = -939872706;
        mh.jhdu[774] = 1428016370;
        mh.jhdu[775] = 562380735;
        mh.jhdu[776] = 604002517;
        mh.jhdu[777] = -2126622034;
        mh.jhdu[778] = -1986708269;
        mh.jhdu[779] = 1142087777;
        mh.jhdu[780] = -1327878678;
        mh.jhdu[781] = 1919786369;
        mh.jhdu[782] = 1171687199;
        mh.jhdu[783] = -24658842;
        mh.jhdu[784] = -1255192532;
        mh.jhdu[785] = -1244865952;
        mh.jhdu[786] = 1994989084;
        mh.jhdu[787] = -223925834;
        mh.jhdu[788] = 120139484;
        mh.jhdu[789] = 1011649906;
        mh.jhdu[790] = 1882707305;
        mh.jhdu[791] = 440652458;
        mh.jhdu[792] = -900162748;
        mh.jhdu[793] = 1852556991;
        mh.jhdu[794] = 1238933918;
        mh.jhdu[795] = 1993767036;
        mh.jhdu[796] = 371628369;
        mh.jhdu[797] = 472365183;
        mh.jhdu[798] = 1357216793;
        mh.jhdu[799] = -366621799;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public mh() {
        var2_1 /* !! */  = mh.b;
        super((class_2561)class_2561.method_43470((String)"Phobia"));
        this.singleplayer = new mh$MenuButton(mh$Action.SINGLEPLAYER, "Singleplayer", "");
        this.multiplayer = new mh$MenuButton(mh$Action.MULTIPLAYER, "Multiplayer", "");
        this.settings = new mh$MenuButton(mh$Action.OPTIONS, "Settings", "");
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block12: while (true) {
            block14: {
                switch (cfr_temp_0 == -2147483648 ? var2_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        this.accounts = new mh$MenuButton(mh$Action.ACCOUNTS, "Accounts", "");
                        this.buttons = new mh$MenuButton[]{this.singleplayer, this.multiplayer, this.settings, this.accounts};
                        this.lastFrame = System.nanoTime();
                        mh.protectFromFancyMenu(this);
                        return;
                    }
                    case 0: {
                        var2_1 /* !! */  = (int)mh.jhdw("jhdx", jhdt(int ), (int)0);
                        cfr_temp_0 = 6;
                        break block14;
                    }
                    case 2: {
                        ** GOTO lbl37
                    }
                    case 4: {
                        var2_1 /* !! */  = (int)mh.jhdw("jheb", jhdt(int ), (int)4);
                    }
                    case 7: {
                        var2_1 /* !! */  = (int)mh.jhdw("jhee", jhdt(int ), (int)7);
                        cfr_temp_0 = 3;
                        break block14;
                    }
                    case 8: {
                        var2_1 /* !! */  = (int)mh.jhdw("jhef", jhdt(int ), (int)8);
                        ** GOTO lbl36
                    }
                    case 9: {
                        ** GOTO lbl36
                    }
                    case 1: {
                        var2_1 /* !! */  = (int)mh.jhdw("jhdy", jhdt(int ), (int)1);
lbl36:
                        // 3 sources

                        var2_1 /* !! */  = (int)mh.jhdw("jheg", jhdt(int ), (int)9);
lbl37:
                        // 2 sources

                        var2_1 /* !! */  = (int)mh.jhdw("jhdz", jhdt(int ), (int)2);
                    }
                    case 3: {
                        var2_1 /* !! */  = (int)mh.jhdw("jhea", jhdt(int ), (int)3);
                        cfr_temp_0 = 1;
                        break block14;
                    }
                    case 5: {
                        var2_1 /* !! */  = (int)mh.jhdw("jhec", jhdt(int ), (int)5);
                    }
                    case 6: 
                }
                ** GOTO lbl49
            }
            while (true) {
                if (true) continue block12;
lbl49:
                // 2 sources

                var2_1 /* !! */  = (int)mh.jhdw("jhed", jhdt(int ), (int)6);
                cfr_temp_0 = 5;
            }
            break;
        }
    }

    private static /* synthetic */ void jjfc() {
        mh.jhdv[700] = -60305973;
        mh.jhdv[701] = -495145500;
        mh.jhdv[702] = -1430452436;
        mh.jhdv[703] = 1126842357;
        mh.jhdv[704] = 2118766833;
        mh.jhdv[705] = 724257972;
        mh.jhdv[706] = -2035097189;
        mh.jhdv[707] = -448876410;
        mh.jhdv[708] = 1608749714;
        mh.jhdv[709] = -399024504;
        mh.jhdv[710] = 732072048;
        mh.jhdv[711] = -1391410755;
        mh.jhdv[712] = -1191868899;
        mh.jhdv[713] = -178657149;
        mh.jhdv[714] = 1554062061;
        mh.jhdv[715] = -2031681950;
        mh.jhdv[716] = -362198226;
        mh.jhdv[717] = 1582991954;
        mh.jhdv[718] = 2098787686;
        mh.jhdv[719] = -2126780987;
        mh.jhdv[720] = 1093058602;
        mh.jhdv[721] = 459541809;
        mh.jhdv[722] = 1100229885;
        mh.jhdv[723] = -559455538;
        mh.jhdv[724] = 349827941;
        mh.jhdv[725] = -1149261208;
        mh.jhdv[726] = 1528348698;
        mh.jhdv[727] = -1753238857;
        mh.jhdv[728] = -1591325060;
        mh.jhdv[729] = -107187678;
        mh.jhdv[730] = -1790841405;
        mh.jhdv[731] = 1536134188;
        mh.jhdv[732] = 1677390634;
        mh.jhdv[733] = 2069352529;
        mh.jhdv[734] = -1269601710;
        mh.jhdv[735] = -1647167677;
        mh.jhdv[736] = 1511487555;
        mh.jhdv[737] = 581468264;
        mh.jhdv[738] = 735946221;
        mh.jhdv[739] = -1327650638;
        mh.jhdv[740] = 674973806;
        mh.jhdv[741] = 246275165;
        mh.jhdv[742] = 1781950423;
        mh.jhdv[743] = -118454576;
        mh.jhdv[744] = -292045404;
        mh.jhdv[745] = 1253675377;
        mh.jhdv[746] = 1122651941;
        mh.jhdv[747] = 334285896;
        mh.jhdv[748] = -2113444917;
        mh.jhdv[749] = -1161137233;
        mh.jhdv[750] = -1874570103;
        mh.jhdv[751] = -1737854609;
        mh.jhdv[752] = -1195228296;
        mh.jhdv[753] = 1249045771;
        mh.jhdv[754] = -947626902;
        mh.jhdv[755] = 1664803081;
        mh.jhdv[756] = -1145884048;
        mh.jhdv[757] = -1742056;
        mh.jhdv[758] = 1385116353;
        mh.jhdv[759] = 384520877;
        mh.jhdv[760] = -939771440;
        mh.jhdv[761] = -923720643;
        mh.jhdv[762] = 2102440106;
        mh.jhdv[763] = 1656010277;
        mh.jhdv[764] = -2121656586;
        mh.jhdv[765] = 1767643373;
        mh.jhdv[766] = -1059489850;
        mh.jhdv[767] = -551521501;
        mh.jhdv[768] = -1099104969;
        mh.jhdv[769] = 81930079;
        mh.jhdv[770] = 516154423;
        mh.jhdv[771] = 1711953851;
        mh.jhdv[772] = 1868788531;
        mh.jhdv[773] = -939872708;
        mh.jhdv[774] = 1428016369;
        mh.jhdv[775] = 562380732;
        mh.jhdv[776] = -604002518;
        mh.jhdv[777] = -2126622034;
        mh.jhdv[778] = -1986708270;
        mh.jhdv[779] = 1142087779;
        mh.jhdv[780] = -1327878679;
        mh.jhdv[781] = 1919786368;
        mh.jhdv[782] = 1171687198;
        mh.jhdv[783] = -24658842;
        mh.jhdv[784] = -1255192531;
        mh.jhdv[785] = -1244865951;
        mh.jhdv[786] = 1994989084;
        mh.jhdv[787] = -223925849;
        mh.jhdv[788] = 120139460;
        mh.jhdv[789] = 1011649898;
        mh.jhdv[790] = 1882707265;
        mh.jhdv[791] = 440652421;
        mh.jhdv[792] = -900162738;
        mh.jhdv[793] = 1852556946;
        mh.jhdv[794] = 1238933902;
        mh.jhdv[795] = 1993767022;
        mh.jhdv[796] = 371628360;
        mh.jhdv[797] = 472365159;
        mh.jhdv[798] = 1357216822;
        mh.jhdv[799] = -366621768;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void method_25426() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mh.rl - mh.jhdw("jhfv", jhfs(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == mh.jhdw("jhfw", jhdt(int ), (int)47)) break;
            v0 /* !! */  = (long)mh.jhdw("jhfx", jhdt(int ), (int)48);
        }
        var3_1 = mh.c;
        v1 /* !! */  = mh.rl;
        if (true) ** GOTO lbl11
        block64: while (true) {
            v1 /* !! */  = (long)(v2 - mh.jhdw("jhfy", jhfs(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1225776778: {
                    break block64;
                }
                case 365543859: {
                    v2 = mh.jhdw("jhfz", jhfs(int ), (int)2);
                    continue block64;
                }
                case 1093058804: {
                    v2 = mh.jhdw("jhga", jhfs(int ), (int)3);
                    continue block64;
                }
            }
            break;
        }
        var2_2 /* !! */  = mh.b;
        v3 /* !! */  = mh.rl;
        if (true) ** GOTO lbl25
        block65: while (true) {
            v3 /* !! */  = (long)(v4 - mh.jhdw("jhgb", jhfs(int ), (int)4));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1950968980: {
                    v4 = mh.jhdw("jhgc", jhfs(int ), (int)5);
                    continue block65;
                }
                case -1225776778: {
                    break block65;
                }
                case 1410515236: {
                    v4 = mh.jhdw("jhgd", jhfs(int ), (int)6);
                    continue block65;
                }
                case 1901991177: {
                    v4 = mh.jhdw("jhge", jhfs(int ), (int)7);
                    continue block65;
                }
            }
            break;
        }
        var1_3 = mh.a;
        if (var3_1) {
            throw null;
lbl40:
            // 10 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl40
        v5 /* !! */  = mh.rl;
        if (true) ** GOTO lbl47
        block67: while (true) {
            v5 /* !! */  = (long)(mh.jhdw("jhgg", jhfs(int ), (int)9) - mh.jhdw("jhgf", jhfs(int ), (int)8));
lbl47:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1225776778: {
                    break block67;
                }
                case -466224417: {
                    continue block67;
                }
            }
            break;
        }
        mh.protectFromFancyMenu(this);
        if (var1_3 || var1_3) ** GOTO lbl40
        v6 /* !! */  = mh.rl;
        if (true) ** GOTO lbl58
        block68: while (true) {
            v6 /* !! */  = (long)(v7 - mh.jhdw("jhgh", jhfs(int ), (int)10));
lbl58:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1225776778: {
                    break block68;
                }
                case 303241678: {
                    v7 = mh.jhdw("jhgi", jhfs(int ), (int)11);
                    continue block68;
                }
                case 938422775: {
                    v7 = mh.jhdw("jhgj", jhfs(int ), (int)12);
                    continue block68;
                }
                case 1891981953: {
                    v7 = mh.jhdw("jhgk", jhfs(int ), (int)13);
                    continue block68;
                }
            }
            break;
        }
        this.updateLayout();
        if (var1_3 || var1_3) ** GOTO lbl40
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_1 = mh.rl - mh.jhdw("jhgl", jhfs(int ), (int)14)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == mh.jhdw("jhgm", jhdt(int ), (int)49)) break;
            v8 /* !! */  = (long)mh.jhdw("jhgn", jhdt(int ), (int)50);
        }
        this.intro = 0.0f;
        if (var1_3 || var1_3) ** GOTO lbl40
        v9 /* !! */  = mh.rl;
        if (true) ** GOTO lbl83
        block70: while (true) {
            v9 /* !! */  = (long)(mh.jhdw("jhgp", jhfs(int ), (int)16) - mh.jhdw("jhgo", jhfs(int ), (int)15));
lbl83:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1225776778: {
                    break block70;
                }
                case 465144722: {
                    continue block70;
                }
            }
            break;
        }
        this.exitSliderProgress = 0.0f;
        if (var1_3 || var1_3) ** GOTO lbl40
        v10 /* !! */  = mh.rl;
        if (true) ** GOTO lbl94
        block71: while (true) {
            v10 /* !! */  = (long)(v11 - mh.jhdw("jhgq", jhfs(int ), (int)17));
lbl94:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1225776778: {
                    break block71;
                }
                case -676013425: {
                    v11 = mh.jhdw("jhgr", jhfs(int ), (int)18);
                    continue block71;
                }
                case -241039619: {
                    v11 = mh.jhdw("jhgs", jhfs(int ), (int)19);
                    continue block71;
                }
                case 107438102: {
                    v11 = mh.jhdw("jhgt", jhfs(int ), (int)20);
                    continue block71;
                }
            }
            break;
        }
        this.exitSliderVisualProgress = 0.0f;
        if (var1_3) ** GOTO lbl40
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl40
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_2 = mh.rl - mh.jhdw("jhgu", jhfs(int ), (int)21)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == mh.jhdw("jhgv", jhdt(int ), (int)51)) break;
                    v12 /* !! */  = (long)mh.jhdw("jhgw", jhdt(int ), (int)52);
                }
                this.exitSliderHover = 0.0f;
                if (var1_3 || var1_3) ** GOTO lbl40
                v13 = mh.jhdw("jhgx", jhdt(int ), (int)53);
                v14 /* !! */  = mh.rl;
                if (true) ** GOTO lbl124
                block73: while (true) {
                    v14 /* !! */  = (long)(v15 - mh.jhdw("jhgy", jhfs(int ), (int)22));
lbl124:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1225776778: {
                            break block73;
                        }
                        case 431632153: {
                            v15 = mh.jhdw("jhgz", jhfs(int ), (int)23);
                            continue block73;
                        }
                        case 746346569: {
                            v15 = mh.jhdw("jhha", jhfs(int ), (int)24);
                            continue block73;
                        }
                    }
                    break;
                }
                this.exitSliderDragging = v13;
                if (var1_3 || var1_3) ** GOTO lbl40
                v16 /* !! */  = mh.rl;
                if (true) ** GOTO lbl139
                block74: while (true) {
                    v16 /* !! */  = (long)(v17 - mh.jhdw("jhhb", jhfs(int ), (int)25));
lbl139:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1838771858: {
                            v17 = mh.jhdw("jhhc", jhfs(int ), (int)26);
                            continue block74;
                        }
                        case -1225776778: {
                            break block74;
                        }
                        case -557724182: {
                            v17 = mh.jhdw("jhhd", jhfs(int ), (int)27);
                            continue block74;
                        }
                    }
                    break;
                }
                v18 = System.nanoTime();
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_3 = mh.rl - mh.jhdw("jhhe", jhfs(int ), (int)28)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == mh.jhdw("jhhf", jhdt(int ), (int)54)) break;
                    v19 /* !! */  = (long)mh.jhdw("jhhg", jhdt(int ), (int)55);
                }
                this.lastFrame = v18;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl158:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)mh.jhdw("jhhh", jhdt(int ), (int)56);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 1: {
                var2_2 /* !! */  = (int)mh.jhdw("jhhi", jhdt(int ), (int)57);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl168:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)mh.jhdw("jhhj", jhdt(int ), (int)58);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl237
            }
            case 3: {
                var2_2 /* !! */  = (int)mh.jhdw("jhhk", jhdt(int ), (int)59);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 4: {
                var2_2 /* !! */  = (int)mh.jhdw("jhhl", jhdt(int ), (int)60);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl223
            }
            case 5: {
                var2_2 /* !! */  = (int)mh.jhdw("jhhm", jhdt(int ), (int)61);
                if (!var3_1) ** GOTO lbl168
                throw null;
            }
lbl187:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)mh.jhdw("jhhn", jhdt(int ), (int)62);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl192:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)mh.jhdw("jhho", jhdt(int ), (int)63);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl197:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)mh.jhdw("jhhp", jhdt(int ), (int)64);
                if (!var3_1) ** GOTO lbl192
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)mh.jhdw("jhhq", jhdt(int ), (int)65);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl215
            }
lbl206:
            // 2 sources

            case 10: {
                do {
                    var2_2 /* !! */  = (int)mh.jhdw("jhhr", jhdt(int ), (int)66);
                } while (!var3_1);
                throw null;
            }
lbl211:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)mh.jhdw("jhhs", jhdt(int ), (int)67);
                if (!var3_1) ** GOTO lbl187
                throw null;
            }
lbl215:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)mh.jhdw("jhht", jhdt(int ), (int)68);
                if (!var3_1) ** GOTO lbl192
                throw null;
            }
lbl219:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)mh.jhdw("jhhu", jhdt(int ), (int)69);
                if (!var3_1) ** GOTO lbl187
                throw null;
            }
lbl223:
            // 3 sources

            case 14: {
                var2_2 /* !! */  = (int)mh.jhdw("jhhv", jhdt(int ), (int)70);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl237
            }
            case 15: {
                var2_2 /* !! */  = (int)mh.jhdw("jhhw", jhdt(int ), (int)71);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl242
            }
            case 16: {
                var2_2 /* !! */  = (int)mh.jhdw("jhhx", jhdt(int ), (int)72);
                if (!var3_1) ** GOTO lbl206
                throw null;
            }
lbl237:
            // 3 sources

            case 17: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mh.jhdw("jhhy", jhdt(int ), (int)73);
                    if (!var3_1) ** GOTO lbl158
                    throw null;
                }
            }
lbl242:
            // 2 sources

            case 18: {
                var2_2 /* !! */  = (int)mh.jhdw("jhhz", jhdt(int ), (int)74);
                if (!var3_1) ** GOTO lbl168
                throw null;
            }
            case 19: 
        }
        var2_2 /* !! */  = (int)mh.jhdw("jhia", jhdt(int ), (int)75);
        ** while (!var3_1)
lbl249:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean method_25403(class_11909 var1_1, double var2_2, double var4_3) {
        block60: {
            v0 /* !! */  = mh.rl;
            if (true) ** GOTO lbl5
            block45: while (true) {
                v0 /* !! */  = (long)(mh.jhdw("jiko", jhfs(int ), (int)93) - mh.jhdw("jikm", jhfs(int ), (int)92));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1225776778: {
                        break block45;
                    }
                    case -876252056: {
                        continue block45;
                    }
                }
                break;
            }
            var10_4 = mh.c;
            v1 /* !! */  = mh.rl;
            if (true) ** GOTO lbl15
            block46: while (true) {
                v1 /* !! */  = (long)(v2 - mh.jhdw("jikq", jhfs(int ), (int)94));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1225776778: {
                        break block46;
                    }
                    case -513672956: {
                        v2 = mh.jhdw("jiks", jhfs(int ), (int)95);
                        continue block46;
                    }
                    case 321165601: {
                        v2 = mh.jhdw("jiku", jhfs(int ), (int)96);
                        continue block46;
                    }
                }
                break;
            }
            var9_5 = mh.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_0 = mh.rl - mh.jhdw("jikv", jhfs(int ), (int)97)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == mh.jhdw("jikx", jhdt(int ), (int)581)) break;
                v3 /* !! */  = (long)mh.jhdw("jila", jhdt(int ), (int)582);
            }
            var8_6 = mh.a;
            if (var10_4) {
                throw null;
lbl33:
                // 7 sources

                return (boolean)mh.jhdw("jilc", jhdt(int ), (int)583);
            }
            if (var8_6 || var8_6) ** GOTO lbl33
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = mh.rl - mh.jhdw("jilf", jhfs(int ), (int)98)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == mh.jhdw("jilh", jhdt(int ), (int)584)) break;
                v4 /* !! */  = (long)mh.jhdw("jili", jhdt(int ), (int)585);
            }
            if (!this.exitSliderDragging) break block60;
            if (var8_6) ** GOTO lbl33
            v5 /* !! */  = mh.rl;
            if (true) ** GOTO lbl47
            block50: while (true) {
                v5 /* !! */  = (long)(mh.jhdw("jiln", jhfs(int ), (int)100) - mh.jhdw("jill", jhfs(int ), (int)99));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1500652179: {
                        continue block50;
                    }
                    case -1225776778: {
                        break block50;
                    }
                }
                break;
            }
            if (var1_1.method_74245() != 0) break block60;
            if (var8_6 || var8_6) ** GOTO lbl33
            v6 /* !! */  = mh.rl;
            if (true) ** GOTO lbl58
            block51: while (true) {
                v6 /* !! */  = (long)(v7 - mh.jhdw("jilo", jhfs(int ), (int)101));
lbl58:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -2032003061: {
                        v7 = mh.jhdw("jilq", jhfs(int ), (int)102);
                        continue block51;
                    }
                    case -1225776778: {
                        break block51;
                    }
                    case 1857572757: {
                        v7 = mh.jhdw("jilt", jhfs(int ), (int)103);
                        continue block51;
                    }
                }
                break;
            }
            v8 = (float)var1_1.comp_4798();
            v9 /* !! */  = mh.rl;
            if (true) ** GOTO lbl72
            block52: while (true) {
                v9 /* !! */  = (long)(v10 - mh.jhdw("jilv", jhfs(int ), (int)104));
lbl72:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1225776778: {
                        break block52;
                    }
                    case -751496101: {
                        v10 = mh.jhdw("jilx", jhfs(int ), (int)105);
                        continue block52;
                    }
                    case -366820215: {
                        v10 = mh.jhdw("jilz", jhfs(int ), (int)106);
                        continue block52;
                    }
                    case 1255496162: {
                        v10 = mh.jhdw("jimb", jhfs(int ), (int)107);
                        continue block52;
                    }
                }
                break;
            }
            var6_7 = ki.convertX(v8);
            if (var8_6 || var8_6) ** GOTO lbl33
            v11 /* !! */  = mh.rl;
            if (true) ** GOTO lbl90
            block53: while (true) {
                v11 /* !! */  = (long)(v12 - mh.jhdw("jimd", jhfs(int ), (int)108));
lbl90:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -1352115691: {
                        v12 = mh.jhdw("jime", jhfs(int ), (int)109);
                        continue block53;
                    }
                    case -1225776778: {
                        break block53;
                    }
                    case -1186970067: {
                        v12 = mh.jhdw("jimf", jhfs(int ), (int)110);
                        continue block53;
                    }
                }
                break;
            }
            var7_8 = this.exitSliderHeight;
            if (var8_6 || var8_6) ** GOTO lbl33
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_2 = mh.rl - mh.jhdw("jimh", jhfs(int ), (int)111)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == mh.jhdw("jimk", jhdt(int ), (int)586)) break;
                v13 /* !! */  = (long)mh.jhdw("jimm", jhdt(int ), (int)587);
            }
            v14 = var6_7 - this.exitSliderX - var7_8 * mh.jhdw("jimo", jhib(int ), (int)588);
            v15 /* !! */  = mh.rl;
            if (true) ** GOTO lbl111
            block55: while (true) {
                v15 /* !! */  = (long)(v16 - mh.jhdw("jimq", jhfs(int ), (int)112));
lbl111:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -1772368313: {
                        v16 = mh.jhdw("jimt", jhfs(int ), (int)113);
                        continue block55;
                    }
                    case -1225776778: {
                        break block55;
                    }
                    case 804625611: {
                        v16 = mh.jhdw("jimv", jhfs(int ), (int)114);
                        continue block55;
                    }
                }
                break;
            }
            v17 = v14 / (this.exitSliderWidth - var7_8);
            while (true) {
                if ((v18 /* !! */  = (cfr_temp_3 = mh.rl - mh.jhdw("jimx", jhfs(int ), (int)115)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v18 /* !! */  == mh.jhdw("jimz", jhdt(int ), (int)589)) break;
                v18 /* !! */  = (long)mh.jhdw("jinb", jhdt(int ), (int)590);
            }
            v19 = mh.clamp(v17, 0.0f, 1.0f);
            v20 /* !! */  = mh.rl;
            if (true) ** GOTO lbl131
            block57: while (true) {
                v20 /* !! */  = (long)(v21 - mh.jhdw("jind", jhfs(int ), (int)116));
lbl131:
                // 2 sources

                switch ((int)v20 /* !! */ ) {
                    case -1225776778: {
                        break block57;
                    }
                    case -655819986: {
                        v21 = mh.jhdw("jing", jhfs(int ), (int)117);
                        continue block57;
                    }
                    case 785877813: {
                        v21 = mh.jhdw("jini", jhfs(int ), (int)118);
                        continue block57;
                    }
                    case 1547915995: {
                        v21 = mh.jhdw("jink", jhfs(int ), (int)119);
                        continue block57;
                    }
                }
                break;
            }
            this.exitSliderProgress = v19;
            if (var8_6 || var8_6) ** GOTO lbl33
            return (boolean)mh.jhdw("jinl", jhdt(int ), (int)591);
        }
        if (!var8_6 && !var8_6) ** break;
        ** while (true)
        v22 /* !! */  = mh.rl;
        if (true) ** GOTO lbl153
        block58: while (true) {
            v22 /* !! */  = (long)(v23 - mh.jhdw("jino", jhfs(int ), (int)120));
lbl153:
            // 2 sources

            switch ((int)v22 /* !! */ ) {
                case -1225776778: {
                    break block58;
                }
                case -937249589: {
                    v23 = mh.jhdw("jinr", jhfs(int ), (int)121);
                    continue block58;
                }
                case 150071347: {
                    v23 = mh.jhdw("jint", jhfs(int ), (int)122);
                    continue block58;
                }
            }
            break;
        }
        return super.method_25403(var1_1, var2_2, var4_3);
    }

    private static /* synthetic */ void jjer() {
        mh.jhdu[500] = 2062323842;
        mh.jhdu[501] = 1596392593;
        mh.jhdu[502] = -325067360;
        mh.jhdu[503] = 1912433280;
        mh.jhdu[504] = -1269497035;
        mh.jhdu[505] = -622271020;
        mh.jhdu[506] = 144402920;
        mh.jhdu[507] = -352297995;
        mh.jhdu[508] = -1996491931;
        mh.jhdu[509] = 2142213236;
        mh.jhdu[510] = 1036824592;
        mh.jhdu[511] = -690816266;
        mh.jhdu[512] = 621652926;
        mh.jhdu[513] = 318857578;
        mh.jhdu[514] = -1992319394;
        mh.jhdu[515] = 1555572943;
        mh.jhdu[516] = 903979633;
        mh.jhdu[517] = -1015620493;
        mh.jhdu[518] = -553827354;
        mh.jhdu[519] = -356432462;
        mh.jhdu[520] = -629678831;
        mh.jhdu[521] = -574818438;
        mh.jhdu[522] = -682256015;
        mh.jhdu[523] = -1060313537;
        mh.jhdu[524] = -1604472428;
        mh.jhdu[525] = -1975329535;
        mh.jhdu[526] = -773990251;
        mh.jhdu[527] = 1443079083;
        mh.jhdu[528] = 1164280880;
        mh.jhdu[529] = 2021543793;
        mh.jhdu[530] = -333221170;
        mh.jhdu[531] = 207575156;
        mh.jhdu[532] = 749870220;
        mh.jhdu[533] = 1907809972;
        mh.jhdu[534] = 296648729;
        mh.jhdu[535] = 1429340110;
        mh.jhdu[536] = 898816549;
        mh.jhdu[537] = -123705118;
        mh.jhdu[538] = 1607009510;
        mh.jhdu[539] = 1543066009;
        mh.jhdu[540] = -159759348;
        mh.jhdu[541] = 1974080543;
        mh.jhdu[542] = -1210436819;
        mh.jhdu[543] = -1408669949;
        mh.jhdu[544] = -1301495262;
        mh.jhdu[545] = -1543096605;
        mh.jhdu[546] = 376637603;
        mh.jhdu[547] = 1399457333;
        mh.jhdu[548] = 1088256407;
        mh.jhdu[549] = -893196589;
        mh.jhdu[550] = -1088688462;
        mh.jhdu[551] = -1763222155;
        mh.jhdu[552] = -1697932490;
        mh.jhdu[553] = 2123504234;
        mh.jhdu[554] = 1271480673;
        mh.jhdu[555] = 1242581985;
        mh.jhdu[556] = -1538089958;
        mh.jhdu[557] = 1599838687;
        mh.jhdu[558] = 483844481;
        mh.jhdu[559] = -2031516351;
        mh.jhdu[560] = -1409014023;
        mh.jhdu[561] = 530721953;
        mh.jhdu[562] = -775343240;
        mh.jhdu[563] = -1514264570;
        mh.jhdu[564] = -1853176801;
        mh.jhdu[565] = 1986575249;
        mh.jhdu[566] = 1309945751;
        mh.jhdu[567] = -1695836475;
        mh.jhdu[568] = 1870691636;
        mh.jhdu[569] = -1378133519;
        mh.jhdu[570] = 772762695;
        mh.jhdu[571] = 1027558;
        mh.jhdu[572] = 1632960930;
        mh.jhdu[573] = -859084561;
        mh.jhdu[574] = 1900560142;
        mh.jhdu[575] = 350069799;
        mh.jhdu[576] = -1311567787;
        mh.jhdu[577] = -833795100;
        mh.jhdu[578] = -556704547;
        mh.jhdu[579] = -1823527566;
        mh.jhdu[580] = -1853020378;
        mh.jhdu[581] = 1241184295;
        mh.jhdu[582] = 699115082;
        mh.jhdu[583] = -680604018;
        mh.jhdu[584] = 764238521;
        mh.jhdu[585] = 399492549;
        mh.jhdu[586] = 922228318;
        mh.jhdu[587] = 1143153157;
        mh.jhdu[588] = 968377420;
        mh.jhdu[589] = -732351780;
        mh.jhdu[590] = -956171814;
        mh.jhdu[591] = -914031347;
        mh.jhdu[592] = -1417780539;
        mh.jhdu[593] = -1045172127;
        mh.jhdu[594] = -1230520767;
        mh.jhdu[595] = -1490911357;
        mh.jhdu[596] = -1114336229;
        mh.jhdu[597] = 822302682;
        mh.jhdu[598] = 629937780;
        mh.jhdu[599] = -80640481;
    }

    private static /* synthetic */ float jhib(int n2) {
        return Float.intBitsToFloat(jhdu[n2] ^ jhdv[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void method_25420(class_332 var1_1, int var2_2, int var3_3, float var4_4) {
        v0 /* !! */  = mh.rl;
        if (true) ** GOTO lbl5
        block11: while (true) {
            v0 /* !! */  = (long)(v1 - mh.jhdw("jhkc", jhfs(int ), (int)29));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1809647168: {
                    v1 = mh.jhdw("jhkd", jhfs(int ), (int)30);
                    continue block11;
                }
                case -1225776778: {
                    break block11;
                }
                case 301702241: {
                    v1 = mh.jhdw("jhke", jhfs(int ), (int)31);
                    continue block11;
                }
            }
            break;
        }
        var7_5 = mh.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mh.rl - mh.jhdw("jhkf", jhfs(int ), (int)32)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mh.jhdw("jhkg", jhdt(int ), (int)128)) break;
            v2 /* !! */  = (long)mh.jhdw("jhkh", jhdt(int ), (int)129);
        }
        var6_6 /* !! */  = mh.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mh.rl - mh.jhdw("jhki", jhfs(int ), (int)33)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mh.jhdw("jhkj", jhdt(int ), (int)130)) break;
            v3 /* !! */  = (long)mh.jhdw("jhkk", jhdt(int ), (int)131);
        }
        var5_7 = mh.a;
        if (var6_6 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var6_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_5) {
                    throw null;
                    return;
                }
                if (var5_7 || var5_7) ** continue;
                return;
            }
            case 0: {
                do {
                    var6_6 /* !! */  = (int)mh.jhdw("jhkl", jhdt(int ), (int)132);
                } while (!var7_5);
                throw null;
            }
lbl43:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_6 /* !! */  = (int)mh.jhdw("jhkm", jhdt(int ), (int)133);
                    if (!var7_5) break block5;
                    throw null;
                }
            }
            case 2: {
                var6_6 /* !! */  = (int)mh.jhdw("jhkn", jhdt(int ), (int)134);
                if (!var7_5) ** GOTO lbl43
                throw null;
            }
            case 3: 
        }
        var6_6 /* !! */  = (int)mh.jhdw("jhko", jhdt(int ), (int)135);
        ** while (!var7_5)
lbl55:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void activate(mh$Action var1_1) {
        block69: {
            v0 /* !! */  = mh.rl;
            if (true) ** GOTO lbl5
            block47: while (true) {
                v0 /* !! */  = (long)(v1 - mh.jhdw("jita", jhfs(int ), (int)148));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1225776778: {
                        break block47;
                    }
                    case 617217828: {
                        v1 = mh.jhdw("jitb", jhfs(int ), (int)149);
                        continue block47;
                    }
                    case 1995768925: {
                        v1 = mh.jhdw("jitc", jhfs(int ), (int)150);
                        continue block47;
                    }
                }
                break;
            }
            var4_2 = mh.c;
            v2 /* !! */  = mh.rl;
            if (true) ** GOTO lbl19
            block48: while (true) {
                v2 /* !! */  = (long)(v3 - mh.jhdw("jitd", jhfs(int ), (int)151));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1225776778: {
                        break block48;
                    }
                    case 450806829: {
                        v3 = mh.jhdw("jite", jhfs(int ), (int)152);
                        continue block48;
                    }
                    case 852227989: {
                        v3 = mh.jhdw("jitf", jhfs(int ), (int)153);
                        continue block48;
                    }
                }
                break;
            }
            var3_3 = mh.b;
            v4 /* !! */  = mh.rl;
            if (true) ** GOTO lbl33
            block49: while (true) {
                v4 /* !! */  = (long)(mh.jhdw("jith", jhfs(int ), (int)155) - mh.jhdw("jitg", jhfs(int ), (int)154));
lbl33:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1225776778: {
                        break block49;
                    }
                    case -825300505: {
                        continue block49;
                    }
                }
                break;
            }
            var2_4 = mh.a;
            if (var4_2) {
                throw null;
lbl41:
                // 12 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl41
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_0 = mh.rl - mh.jhdw("jiti", jhfs(int ), (int)156)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == mh.jhdw("jitj", jhdt(int ), (int)643)) break;
                v5 /* !! */  = (long)mh.jhdw("jitk", jhdt(int ), (int)644);
            }
            if (this.field_22787 != null) break block69;
            if (var2_4) ** GOTO lbl41
            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl41
        v6 /* !! */  = mh.rl;
        if (true) ** GOTO lbl58
        block52: while (true) {
            v6 /* !! */  = (long)(v7 - mh.jhdw("jitl", jhfs(int ), (int)157));
lbl58:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1225776778: {
                    break block52;
                }
                case 1340635204: {
                    v7 = mh.jhdw("jitm", jhfs(int ), (int)158);
                    continue block52;
                }
                case 1387154977: {
                    v7 = mh.jhdw("jitn", jhfs(int ), (int)159);
                    continue block52;
                }
                case 1950287591: {
                    v7 = mh.jhdw("jito", jhfs(int ), (int)160);
                    continue block52;
                }
            }
            break;
        }
        switch (var1_1.ordinal()) {
            case 0: {
                if (var2_4 || var2_4) ** GOTO lbl41
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = mh.rl - mh.jhdw("jitp", jhfs(int ), (int)161)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == mh.jhdw("jitq", jhdt(int ), (int)645)) break;
                    v8 /* !! */  = (long)mh.jhdw("jitr", jhdt(int ), (int)646);
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = mh.rl - mh.jhdw("jits", jhfs(int ), (int)162)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == mh.jhdw("jitt", jhdt(int ), (int)647)) break;
                    v9 /* !! */  = (long)mh.jhdw("jitu", jhdt(int ), (int)648);
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = mh.rl - mh.jhdw("jitv", jhfs(int ), (int)163)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == mh.jhdw("jitw", jhdt(int ), (int)649)) break;
                    v10 /* !! */  = (long)mh.jhdw("jitx", jhdt(int ), (int)650);
                }
                v11 = new class_500((class_437)this);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = mh.rl - mh.jhdw("jity", jhfs(int ), (int)164)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == mh.jhdw("jitz", jhdt(int ), (int)651)) break;
                    v12 /* !! */  = (long)mh.jhdw("jiua", jhdt(int ), (int)652);
                }
                this.field_22787.method_1507((class_437)v11);
                if (var2_4) ** GOTO lbl41
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                if (var2_4 || var2_4) ** GOTO lbl41
                v13 /* !! */  = mh.rl;
                if (true) ** GOTO lbl104
                block57: while (true) {
                    v13 /* !! */  = (long)(mh.jhdw("jiuc", jhfs(int ), (int)166) - mh.jhdw("jiub", jhfs(int ), (int)165));
lbl104:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1225776778: {
                            break block57;
                        }
                        case 391432562: {
                            continue block57;
                        }
                    }
                    break;
                }
                v14 /* !! */  = mh.rl;
                if (true) ** GOTO lbl113
                block58: while (true) {
                    v14 /* !! */  = (long)(mh.jhdw("jiue", jhfs(int ), (int)168) - mh.jhdw("jiud", jhfs(int ), (int)167));
lbl113:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1225776778: {
                            break block58;
                        }
                        case 919523109: {
                            continue block58;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = mh.rl - mh.jhdw("jiuf", jhfs(int ), (int)169)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == mh.jhdw("jiug", jhdt(int ), (int)653)) break;
                    v15 /* !! */  = (long)mh.jhdw("jiuh", jhdt(int ), (int)654);
                }
                v16 = new class_526((class_437)this);
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_6 = mh.rl - mh.jhdw("jiui", jhfs(int ), (int)170)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == mh.jhdw("jiuj", jhdt(int ), (int)655)) break;
                    v17 /* !! */  = (long)mh.jhdw("jiuk", jhdt(int ), (int)656);
                }
                this.field_22787.method_1507((class_437)v16);
                if (var2_4) ** GOTO lbl41
                if (!var4_2) break;
                throw null;
            }
            case 2: {
                if (var2_4 || var2_4) ** GOTO lbl41
                v18 /* !! */  = mh.rl;
                if (true) ** GOTO lbl139
                block61: while (true) {
                    v18 /* !! */  = (long)(v19 - mh.jhdw("jiul", jhfs(int ), (int)171));
lbl139:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1568140817: {
                            v19 = mh.jhdw("jium", jhfs(int ), (int)172);
                            continue block61;
                        }
                        case -1225776778: {
                            break block61;
                        }
                        case 454928041: {
                            v19 = mh.jhdw("jiun", jhfs(int ), (int)173);
                            continue block61;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_7 = mh.rl - mh.jhdw("jiuo", jhfs(int ), (int)174)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == mh.jhdw("jiup", jhdt(int ), (int)657)) break;
                    v20 /* !! */  = (long)mh.jhdw("jiuq", jhdt(int ), (int)658);
                }
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_8 = mh.rl - mh.jhdw("jiur", jhfs(int ), (int)175)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == mh.jhdw("jius", jhdt(int ), (int)659)) break;
                    v21 /* !! */  = (long)mh.jhdw("jiut", jhdt(int ), (int)660);
                }
                v22 /* !! */  = mh.rl;
                if (true) ** GOTO lbl162
                block64: while (true) {
                    v22 /* !! */  = (long)(mh.jhdw("jiuv", jhfs(int ), (int)177) - mh.jhdw("jiuu", jhfs(int ), (int)176));
lbl162:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1225776778: {
                            break block64;
                        }
                        case 1343401094: {
                            continue block64;
                        }
                    }
                    break;
                }
                v23 = this.field_22787.field_1690;
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_9 = mh.rl - mh.jhdw("jiuw", jhfs(int ), (int)178)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == mh.jhdw("jiux", jhdt(int ), (int)661)) break;
                    v24 /* !! */  = (long)mh.jhdw("jiuy", jhdt(int ), (int)662);
                }
                v25 = new class_429((class_437)this, v23);
                v26 /* !! */  = mh.rl;
                if (true) ** GOTO lbl178
                block66: while (true) {
                    v26 /* !! */  = (long)(mh.jhdw("jiva", jhfs(int ), (int)180) - mh.jhdw("jiuz", jhfs(int ), (int)179));
lbl178:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -1225776778: {
                            break block66;
                        }
                        case -145032234: {
                            continue block66;
                        }
                    }
                    break;
                }
                this.field_22787.method_1507((class_437)v25);
                if (var2_4) ** GOTO lbl41
                if (!var4_2) break;
                throw null;
            }
            case 3: {
                if (var2_4 || var2_4) ** GOTO lbl41
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_10 = mh.rl - mh.jhdw("jivb", jhfs(int ), (int)181)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == mh.jhdw("jivc", jhdt(int ), (int)663)) break;
                    v27 /* !! */  = (long)mh.jhdw("jivd", jhdt(int ), (int)664);
                }
                this.openAccountSwitcher();
                if (var2_4) ** break;
            }
        }
        if (!var2_4 && !var2_4) ** break;
        ** while (true)
    }

    private static /* synthetic */ void jjen() {
        mh.jhdu[100] = -1043783316;
        mh.jhdu[101] = -696200808;
        mh.jhdu[102] = 837090989;
        mh.jhdu[103] = 1448816446;
        mh.jhdu[104] = 1505115222;
        mh.jhdu[105] = -757069001;
        mh.jhdu[106] = 586675040;
        mh.jhdu[107] = 381199475;
        mh.jhdu[108] = 1002949966;
        mh.jhdu[109] = 1486303267;
        mh.jhdu[110] = 1072303722;
        mh.jhdu[111] = -2078279034;
        mh.jhdu[112] = 970236761;
        mh.jhdu[113] = -2082830768;
        mh.jhdu[114] = 115360803;
        mh.jhdu[115] = -1673390031;
        mh.jhdu[116] = -968788879;
        mh.jhdu[117] = -1765021947;
        mh.jhdu[118] = 84939338;
        mh.jhdu[119] = -1811948929;
        mh.jhdu[120] = 1076904076;
        mh.jhdu[121] = -879288322;
        mh.jhdu[122] = -1248436207;
        mh.jhdu[123] = 944653837;
        mh.jhdu[124] = -1075342967;
        mh.jhdu[125] = -1620328621;
        mh.jhdu[126] = -37919856;
        mh.jhdu[127] = -2144270848;
        mh.jhdu[128] = 1021070549;
        mh.jhdu[129] = 164521700;
        mh.jhdu[130] = 1443312049;
        mh.jhdu[131] = 257445185;
        mh.jhdu[132] = 1068961867;
        mh.jhdu[133] = -922092701;
        mh.jhdu[134] = -1362235942;
        mh.jhdu[135] = 1031073770;
        mh.jhdu[136] = 512390518;
        mh.jhdu[137] = -1454656606;
        mh.jhdu[138] = -1440423602;
        mh.jhdu[139] = -1498469746;
        mh.jhdu[140] = 78451740;
        mh.jhdu[141] = 873165129;
        mh.jhdu[142] = -1530867740;
        mh.jhdu[143] = -187802301;
        mh.jhdu[144] = 1949911249;
        mh.jhdu[145] = -925387025;
        mh.jhdu[146] = -526761430;
        mh.jhdu[147] = 1291752327;
        mh.jhdu[148] = -188464709;
        mh.jhdu[149] = -1530114155;
        mh.jhdu[150] = 148902025;
        mh.jhdu[151] = 38063637;
        mh.jhdu[152] = -380277695;
        mh.jhdu[153] = 1546508652;
        mh.jhdu[154] = 1558834289;
        mh.jhdu[155] = 132662340;
        mh.jhdu[156] = 391432614;
        mh.jhdu[157] = -2038924549;
        mh.jhdu[158] = 970104167;
        mh.jhdu[159] = -2143354000;
        mh.jhdu[160] = -506016263;
        mh.jhdu[161] = -1089093323;
        mh.jhdu[162] = -502575584;
        mh.jhdu[163] = 1128100688;
        mh.jhdu[164] = 1527460074;
        mh.jhdu[165] = 551890748;
        mh.jhdu[166] = -1318294968;
        mh.jhdu[167] = -628536103;
        mh.jhdu[168] = 1566733730;
        mh.jhdu[169] = -1894072512;
        mh.jhdu[170] = -1234529940;
        mh.jhdu[171] = 1229837182;
        mh.jhdu[172] = 1630891592;
        mh.jhdu[173] = 353848288;
        mh.jhdu[174] = 1215724805;
        mh.jhdu[175] = -1147639455;
        mh.jhdu[176] = 782909919;
        mh.jhdu[177] = 145363940;
        mh.jhdu[178] = 1922630865;
        mh.jhdu[179] = 1172427285;
        mh.jhdu[180] = -851004569;
        mh.jhdu[181] = -2056663566;
        mh.jhdu[182] = 113941792;
        mh.jhdu[183] = -757484663;
        mh.jhdu[184] = 1398256701;
        mh.jhdu[185] = -272171180;
        mh.jhdu[186] = -325584186;
        mh.jhdu[187] = -1328599262;
        mh.jhdu[188] = -481132387;
        mh.jhdu[189] = 174098916;
        mh.jhdu[190] = -1566851990;
        mh.jhdu[191] = 0x6A6AA166;
        mh.jhdu[192] = 752078249;
        mh.jhdu[193] = -1824611068;
        mh.jhdu[194] = 7289775;
        mh.jhdu[195] = -737117253;
        mh.jhdu[196] = -1624485089;
        mh.jhdu[197] = -642371805;
        mh.jhdu[198] = 1008845815;
        mh.jhdu[199] = 847352431;
    }

    private static /* synthetic */ void jjez() {
        mh.jhdv[400] = -873867018;
        mh.jhdv[401] = 929908012;
        mh.jhdv[402] = 630210438;
        mh.jhdv[403] = -356708890;
        mh.jhdv[404] = 1880199412;
        mh.jhdv[405] = 189889112;
        mh.jhdv[406] = 393651302;
        mh.jhdv[407] = 1931904804;
        mh.jhdv[408] = -1414289585;
        mh.jhdv[409] = -826220203;
        mh.jhdv[410] = 504345957;
        mh.jhdv[411] = 1866011754;
        mh.jhdv[412] = -1878153890;
        mh.jhdv[413] = 342489952;
        mh.jhdv[414] = -1631344268;
        mh.jhdv[415] = -518812280;
        mh.jhdv[416] = -2058551107;
        mh.jhdv[417] = -38993635;
        mh.jhdv[418] = 99966677;
        mh.jhdv[419] = 190521596;
        mh.jhdv[420] = -972099213;
        mh.jhdv[421] = 1268672495;
        mh.jhdv[422] = 172922846;
        mh.jhdv[423] = -1812378782;
        mh.jhdv[424] = -1920661929;
        mh.jhdv[425] = 1713105032;
        mh.jhdv[426] = -49496068;
        mh.jhdv[427] = -981642709;
        mh.jhdv[428] = -1205593169;
        mh.jhdv[429] = -1894589757;
        mh.jhdv[430] = 1424391418;
        mh.jhdv[431] = -703711859;
        mh.jhdv[432] = -50751463;
        mh.jhdv[433] = -1162872144;
        mh.jhdv[434] = -1411215229;
        mh.jhdv[435] = 1748323770;
        mh.jhdv[436] = -786623570;
        mh.jhdv[437] = -803345680;
        mh.jhdv[438] = 1996279269;
        mh.jhdv[439] = 2040072020;
        mh.jhdv[440] = 628280675;
        mh.jhdv[441] = 452528195;
        mh.jhdv[442] = -922867689;
        mh.jhdv[443] = -649956577;
        mh.jhdv[444] = -749366605;
        mh.jhdv[445] = -118201761;
        mh.jhdv[446] = -1262937092;
        mh.jhdv[447] = 830446839;
        mh.jhdv[448] = -318440070;
        mh.jhdv[449] = -359338493;
        mh.jhdv[450] = 506198761;
        mh.jhdv[451] = 203415045;
        mh.jhdv[452] = -1658901468;
        mh.jhdv[453] = 245711946;
        mh.jhdv[454] = -2111907484;
        mh.jhdv[455] = -907633107;
        mh.jhdv[456] = -1959045114;
        mh.jhdv[457] = 928351044;
        mh.jhdv[458] = -118806993;
        mh.jhdv[459] = -756795190;
        mh.jhdv[460] = 1026354699;
        mh.jhdv[461] = -1960827966;
        mh.jhdv[462] = 1198992772;
        mh.jhdv[463] = -1003751267;
        mh.jhdv[464] = -355660397;
        mh.jhdv[465] = 1808128113;
        mh.jhdv[466] = -2125460319;
        mh.jhdv[467] = -1151770879;
        mh.jhdv[468] = 530747799;
        mh.jhdv[469] = 952511076;
        mh.jhdv[470] = 547293200;
        mh.jhdv[471] = 964022258;
        mh.jhdv[472] = -827769959;
        mh.jhdv[473] = -388866926;
        mh.jhdv[474] = -15453358;
        mh.jhdv[475] = 961202327;
        mh.jhdv[476] = -1818620798;
        mh.jhdv[477] = 1203844169;
        mh.jhdv[478] = -1944541320;
        mh.jhdv[479] = -1466966961;
        mh.jhdv[480] = -1313015418;
        mh.jhdv[481] = 1956445802;
        mh.jhdv[482] = 53007629;
        mh.jhdv[483] = -1245158263;
        mh.jhdv[484] = -315459454;
        mh.jhdv[485] = -1015015739;
        mh.jhdv[486] = 1489577485;
        mh.jhdv[487] = -1154418221;
        mh.jhdv[488] = 523357767;
        mh.jhdv[489] = 183248865;
        mh.jhdv[490] = 127793578;
        mh.jhdv[491] = -1184866237;
        mh.jhdv[492] = 261284191;
        mh.jhdv[493] = -2121760116;
        mh.jhdv[494] = -2744552;
        mh.jhdv[495] = 1565966876;
        mh.jhdv[496] = -1779465138;
        mh.jhdv[497] = 1797001158;
        mh.jhdv[498] = 1754217811;
        mh.jhdv[499] = -1239471443;
    }

    private static /* synthetic */ int jhdt(int n2) {
        return jhdu[n2] ^ jhdv[n2];
    }

    private static /* synthetic */ void jjfh() {
        mh.jhfu[0] = 2739965296290707474L;
        mh.jhfu[1] = 3104304401011363522L;
        mh.jhfu[2] = 3502345950483863635L;
        mh.jhfu[3] = -5690144758022814937L;
        mh.jhfu[4] = -594555105658935538L;
        mh.jhfu[5] = -6937407913832524912L;
        mh.jhfu[6] = -8142812475693223972L;
        mh.jhfu[7] = 3908318453415757479L;
        mh.jhfu[8] = 4330686489327195450L;
        mh.jhfu[9] = 1836991393459776759L;
        mh.jhfu[10] = 7844202396762409248L;
        mh.jhfu[11] = -5807734436755425618L;
        mh.jhfu[12] = -5184857567435857306L;
        mh.jhfu[13] = 659242029381231011L;
        mh.jhfu[14] = 1852478658915083363L;
        mh.jhfu[15] = 2184250008660237527L;
        mh.jhfu[16] = 3238028313688339653L;
        mh.jhfu[17] = 2363834420921728010L;
        mh.jhfu[18] = -2446323399309664627L;
        mh.jhfu[19] = -4045595836307780812L;
        mh.jhfu[20] = -7914863417772674414L;
        mh.jhfu[21] = 1249462973366723871L;
        mh.jhfu[22] = -2243332425707029316L;
        mh.jhfu[23] = 301192262917910864L;
        mh.jhfu[24] = 160792377268018753L;
        mh.jhfu[25] = 5884465206847230789L;
        mh.jhfu[26] = 8614888324249066960L;
        mh.jhfu[27] = 6505879670730565949L;
        mh.jhfu[28] = 7479555320456380154L;
        mh.jhfu[29] = 7200400327591715892L;
        mh.jhfu[30] = -3803977895998066939L;
        mh.jhfu[31] = 2387013953277190219L;
        mh.jhfu[32] = 5657021113106659472L;
        mh.jhfu[33] = 8725567870594147063L;
        mh.jhfu[34] = -1294056225455303973L;
        mh.jhfu[35] = 7294731402157653167L;
        mh.jhfu[36] = 4362704324936488379L;
        mh.jhfu[37] = 3826658472727286273L;
        mh.jhfu[38] = -6732866425678062627L;
        mh.jhfu[39] = -2265044753143076621L;
        mh.jhfu[40] = 788648434205765990L;
        mh.jhfu[41] = -2259505260229838137L;
        mh.jhfu[42] = 5556021959462286517L;
        mh.jhfu[43] = -2572915649417369388L;
        mh.jhfu[44] = -1131644028663816107L;
        mh.jhfu[45] = -519691663767468780L;
        mh.jhfu[46] = -8926463188219512182L;
        mh.jhfu[47] = -6818796102626147731L;
        mh.jhfu[48] = 8404589884336840079L;
        mh.jhfu[49] = 2769177382588346150L;
        mh.jhfu[50] = 2792938169710297309L;
        mh.jhfu[51] = -1350344436551000320L;
        mh.jhfu[52] = 6840928250530778755L;
        mh.jhfu[53] = -9013165775662171725L;
        mh.jhfu[54] = -4144574731512144387L;
        mh.jhfu[55] = 582778614271373909L;
        mh.jhfu[56] = 2369595797183889658L;
        mh.jhfu[57] = 7468414728440663835L;
        mh.jhfu[58] = -1179271523676358406L;
        mh.jhfu[59] = 1865823216950028849L;
        mh.jhfu[60] = 3447817869537711019L;
        mh.jhfu[61] = -5271564972004282793L;
        mh.jhfu[62] = -6953027626654920732L;
        mh.jhfu[63] = 3948338701166627908L;
        mh.jhfu[64] = 7806746898633879942L;
        mh.jhfu[65] = -704560929623846507L;
        mh.jhfu[66] = 2968990824797122169L;
        mh.jhfu[67] = -369044849692354604L;
        mh.jhfu[68] = 8657314281536313830L;
        mh.jhfu[69] = 2369764766788442184L;
        mh.jhfu[70] = -9212710417767713500L;
        mh.jhfu[71] = 7465267223967487006L;
        mh.jhfu[72] = 2373306746500738763L;
        mh.jhfu[73] = -1711427057471137402L;
        mh.jhfu[74] = -7158254424984517892L;
        mh.jhfu[75] = -5038633287977259815L;
        mh.jhfu[76] = -7232234452008841976L;
        mh.jhfu[77] = -8944509523452163663L;
        mh.jhfu[78] = 1755081880567174546L;
        mh.jhfu[79] = -6308662801705680003L;
        mh.jhfu[80] = 2423794406453770219L;
        mh.jhfu[81] = -6957869749711099481L;
        mh.jhfu[82] = 5820506578543421879L;
        mh.jhfu[83] = -4136748050830229252L;
        mh.jhfu[84] = -6035985835773067769L;
        mh.jhfu[85] = -2117486928195084790L;
        mh.jhfu[86] = 6048360796361828564L;
        mh.jhfu[87] = -8344775031583553025L;
        mh.jhfu[88] = -1529936563566007613L;
        mh.jhfu[89] = -9081355367339750826L;
        mh.jhfu[90] = -8844993633400188057L;
        mh.jhfu[91] = 8441692383593786529L;
        mh.jhfu[92] = -7153582147003900739L;
        mh.jhfu[93] = -4599105183808110115L;
        mh.jhfu[94] = 3114560728926371998L;
        mh.jhfu[95] = 3837261921269556861L;
        mh.jhfu[96] = -2439580281638524666L;
        mh.jhfu[97] = 6572895775958173569L;
        mh.jhfu[98] = -1752887838379188665L;
        mh.jhfu[99] = 3321157257477388048L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void centered(class_332 var0, ks var1_1, String var2_2, float var3_3, float var4_4, float var5_5, int var6_6) {
        v0 /* !! */  = mh.rl;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - mh.jhdw("jiye", jhfs(int ), (int)206));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1225776778: {
                    break block20;
                }
                case -680112106: {
                    v1 = mh.jhdw("jiyf", jhfs(int ), (int)207);
                    continue block20;
                }
                case 1633770041: {
                    v1 = mh.jhdw("jiyg", jhfs(int ), (int)208);
                    continue block20;
                }
                case 2021278903: {
                    v1 = mh.jhdw("jiyh", jhfs(int ), (int)209);
                    continue block20;
                }
            }
            break;
        }
        var9_7 = mh.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mh.rl - mh.jhdw("jiyi", jhfs(int ), (int)210)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == mh.jhdw("jiyj", jhdt(int ), (int)719)) break;
            v2 /* !! */  = (long)mh.jhdw("jiyk", jhdt(int ), (int)720);
        }
        var8_8 /* !! */  = mh.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mh.rl - mh.jhdw("jiyl", jhfs(int ), (int)211)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == mh.jhdw("jiym", jhdt(int ), (int)721)) break;
            v3 /* !! */  = (long)mh.jhdw("jiyn", jhdt(int ), (int)722);
        }
        var7_9 = mh.a;
        if (!var9_7) ** GOTO lbl36
        throw null;
lbl-1000:
        // 2 sources

        {
            if (var8_8 /* !! */  == 0) ** GOTO lbl-1000
            switch (var8_8 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl36:
                // 1 sources

                if (var7_9 || var7_9) ** GOTO lbl-1000
                v4 /* !! */  = mh.rl;
                if (true) ** GOTO lbl41
                block24: while (true) {
                    v4 /* !! */  = (long)(v5 - mh.jhdw("jiyo", jhfs(int ), (int)212));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1307868168: {
                            v5 = mh.jhdw("jiyp", jhfs(int ), (int)213);
                            continue block24;
                        }
                        case -1225776778: {
                            break block24;
                        }
                        case 1068921306: {
                            v5 = mh.jhdw("jiyq", jhfs(int ), (int)214);
                            continue block24;
                        }
                        case 1953645707: {
                            v5 = mh.jhdw("jiyr", jhfs(int ), (int)215);
                            continue block24;
                        }
                    }
                    break;
                }
                v6 = var3_3 - kq.width(var1_1, var2_2, var5_5) * mh.jhdw("jiys", jhib(int ), (int)723);
                v7 = mh.jhdw("jiyt", jhdt(int ), (int)724);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = mh.rl - mh.jhdw("jiyu", jhfs(int ), (int)216)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == mh.jhdw("jiyv", jhdt(int ), (int)725)) break;
                    v8 /* !! */  = (long)mh.jhdw("jiyw", jhdt(int ), (int)726);
                }
                kq.text(var0, var1_1, var2_2, v6, var4_4, var5_5, var6_6, (boolean)v7);
                if (var7_9 || var7_9) continue block23;
                return;
lbl63:
                // 2 sources

                case 0: {
                    var8_8 /* !! */  = (int)mh.jhdw("jiyx", jhdt(int ), (int)727);
                    if (var9_7) {
                        throw null;
                    }
                }
lbl67:
                // 5 sources

                case 1: {
                    var8_8 /* !! */  = (int)mh.jhdw("jiyy", jhdt(int ), (int)728);
                    if (var9_7) {
                        throw null;
                    }
                    ** GOTO lbl76
                }
                case 2: {
                    var8_8 /* !! */  = (int)mh.jhdw("jiyz", jhdt(int ), (int)729);
                    if (!var9_7) ** GOTO lbl67
                    throw null;
                }
lbl76:
                // 2 sources

                case 3: {
                    var8_8 /* !! */  = (int)mh.jhdw("jiza", jhdt(int ), (int)730);
                    if (!var9_7) ** GOTO lbl63
                    throw null;
                }
                case 4: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var8_8 /* !! */  = (int)mh.jhdw("jizb", jhdt(int ), (int)731);
                        if (!var9_7) ** GOTO lbl67
                        throw null;
                    }
                }
                case 5: 
            }
        }
        var8_8 /* !! */  = (int)mh.jhdw("jizc", jhdt(int ), (int)732);
        ** while (!var9_7)
lbl88:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jjep() {
        mh.jhdu[300] = 206435710;
        mh.jhdu[301] = -179359746;
        mh.jhdu[302] = -423416593;
        mh.jhdu[303] = 14610722;
        mh.jhdu[304] = 1443190529;
        mh.jhdu[305] = 1884315633;
        mh.jhdu[306] = 1711815231;
        mh.jhdu[307] = 132644722;
        mh.jhdu[308] = -1732368627;
        mh.jhdu[309] = -1487602422;
        mh.jhdu[310] = -1290713814;
        mh.jhdu[311] = -1428415025;
        mh.jhdu[312] = 825742667;
        mh.jhdu[313] = -2121235262;
        mh.jhdu[314] = -152645090;
        mh.jhdu[315] = -1820710362;
        mh.jhdu[316] = 878839077;
        mh.jhdu[317] = 478968733;
        mh.jhdu[318] = -431277089;
        mh.jhdu[319] = 691491769;
        mh.jhdu[320] = 904424840;
        mh.jhdu[321] = 443276642;
        mh.jhdu[322] = 981308532;
        mh.jhdu[323] = -2034747942;
        mh.jhdu[324] = -668890854;
        mh.jhdu[325] = -1562182221;
        mh.jhdu[326] = 1721450920;
        mh.jhdu[327] = -1519211140;
        mh.jhdu[328] = -1107491152;
        mh.jhdu[329] = -14260850;
        mh.jhdu[330] = 418117235;
        mh.jhdu[331] = 1481189060;
        mh.jhdu[332] = -166156461;
        mh.jhdu[333] = -526355698;
        mh.jhdu[334] = 1840367450;
        mh.jhdu[335] = 357953218;
        mh.jhdu[336] = -2144995431;
        mh.jhdu[337] = -1989904582;
        mh.jhdu[338] = -977151015;
        mh.jhdu[339] = -1668960776;
        mh.jhdu[340] = -2026195724;
        mh.jhdu[341] = 1173221231;
        mh.jhdu[342] = 1385931429;
        mh.jhdu[343] = -157650738;
        mh.jhdu[344] = 397307610;
        mh.jhdu[345] = 1536599767;
        mh.jhdu[346] = 1526890864;
        mh.jhdu[347] = 1516243124;
        mh.jhdu[348] = 550392131;
        mh.jhdu[349] = 54153408;
        mh.jhdu[350] = 732153407;
        mh.jhdu[351] = -705475447;
        mh.jhdu[352] = -1294637966;
        mh.jhdu[353] = 454814912;
        mh.jhdu[354] = 1837906972;
        mh.jhdu[355] = -1554977694;
        mh.jhdu[356] = 701734541;
        mh.jhdu[357] = 270849940;
        mh.jhdu[358] = -1985739773;
        mh.jhdu[359] = 286315852;
        mh.jhdu[360] = -313428882;
        mh.jhdu[361] = 678633037;
        mh.jhdu[362] = 676902392;
        mh.jhdu[363] = -1648371798;
        mh.jhdu[364] = 1475447896;
        mh.jhdu[365] = -1699617327;
        mh.jhdu[366] = -75887313;
        mh.jhdu[367] = 1794147913;
        mh.jhdu[368] = -1465599636;
        mh.jhdu[369] = -501092479;
        mh.jhdu[370] = -1645369373;
        mh.jhdu[371] = 303329073;
        mh.jhdu[372] = -1107521950;
        mh.jhdu[373] = 551102773;
        mh.jhdu[374] = -187214770;
        mh.jhdu[375] = -621376209;
        mh.jhdu[376] = -1187517482;
        mh.jhdu[377] = -1549926443;
        mh.jhdu[378] = 1175520464;
        mh.jhdu[379] = 1910338606;
        mh.jhdu[380] = -246636777;
        mh.jhdu[381] = -16350753;
        mh.jhdu[382] = -1797747209;
        mh.jhdu[383] = 86779035;
        mh.jhdu[384] = 910687327;
        mh.jhdu[385] = 1367243775;
        mh.jhdu[386] = 2049623082;
        mh.jhdu[387] = -1135755893;
        mh.jhdu[388] = 1434636208;
        mh.jhdu[389] = -360438145;
        mh.jhdu[390] = -1730257707;
        mh.jhdu[391] = -1581597020;
        mh.jhdu[392] = 1731742460;
        mh.jhdu[393] = 1297139171;
        mh.jhdu[394] = 1661440663;
        mh.jhdu[395] = 1042165479;
        mh.jhdu[396] = -1484757407;
        mh.jhdu[397] = 344317930;
        mh.jhdu[398] = -1102627168;
        mh.jhdu[399] = 2089025364;
    }

    private static /* synthetic */ void jjey() {
        mh.jhdv[300] = 1306291428;
        mh.jhdv[301] = -1242817331;
        mh.jhdv[302] = -641520401;
        mh.jhdv[303] = 14610909;
        mh.jhdv[304] = 1443190782;
        mh.jhdv[305] = 1884315406;
        mh.jhdv[306] = 656947775;
        mh.jhdv[307] = 1177026418;
        mh.jhdv[308] = -1732368628;
        mh.jhdv[309] = 2055954918;
        mh.jhdv[310] = -1290713813;
        mh.jhdv[311] = -1034256567;
        mh.jhdv[312] = 825742666;
        mh.jhdv[313] = 468485657;
        mh.jhdv[314] = -152645089;
        mh.jhdv[315] = -764654528;
        mh.jhdv[316] = 181483030;
        mh.jhdv[317] = 1562239495;
        mh.jhdv[318] = -431277090;
        mh.jhdv[319] = -1585535448;
        mh.jhdv[320] = -904424841;
        mh.jhdv[321] = 276846721;
        mh.jhdv[322] = 92116084;
        mh.jhdv[323] = -945181632;
        mh.jhdv[324] = -668890651;
        mh.jhdv[325] = -1562182324;
        mh.jhdv[326] = 1721450839;
        mh.jhdv[327] = -432034436;
        mh.jhdv[328] = -4913488;
        mh.jhdv[329] = 14260849;
        mh.jhdv[330] = 750949122;
        mh.jhdv[331] = 1481189061;
        mh.jhdv[332] = -1768739555;
        mh.jhdv[333] = -526355700;
        mh.jhdv[334] = 1840367453;
        mh.jhdv[335] = 357953222;
        mh.jhdv[336] = -2144995437;
        mh.jhdv[337] = -1989904588;
        mh.jhdv[338] = -977151024;
        mh.jhdv[339] = -1668960774;
        mh.jhdv[340] = -2026195728;
        mh.jhdv[341] = 1173221224;
        mh.jhdv[342] = 1385931438;
        mh.jhdv[343] = -157650743;
        mh.jhdv[344] = 397307601;
        mh.jhdv[345] = 1536599770;
        mh.jhdv[346] = 1526890873;
        mh.jhdv[347] = 1516243129;
        mh.jhdv[348] = 550392137;
        mh.jhdv[349] = 54153425;
        mh.jhdv[350] = 732153407;
        mh.jhdv[351] = -353153911;
        mh.jhdv[352] = -209361806;
        mh.jhdv[353] = 1524362432;
        mh.jhdv[354] = 752630812;
        mh.jhdv[355] = -503255966;
        mh.jhdv[356] = 1773379213;
        mh.jhdv[357] = 1362417556;
        mh.jhdv[358] = -1985739774;
        mh.jhdv[359] = 1403049292;
        mh.jhdv[360] = -1394510738;
        mh.jhdv[361] = 1746083405;
        mh.jhdv[362] = 676902332;
        mh.jhdv[363] = -1648371742;
        mh.jhdv[364] = 1475447830;
        mh.jhdv[365] = -1699617328;
        mh.jhdv[366] = -1155920593;
        mh.jhdv[367] = 1441826377;
        mh.jhdv[368] = -1788316255;
        mh.jhdv[369] = -594543622;
        mh.jhdv[370] = -1645369374;
        mh.jhdv[371] = 681016670;
        mh.jhdv[372] = -2097377694;
        mh.jhdv[373] = 1626727928;
        mh.jhdv[374] = -920480063;
        mh.jhdv[375] = -621376210;
        mh.jhdv[376] = -107056564;
        mh.jhdv[377] = -1667366955;
        mh.jhdv[378] = 112576541;
        mh.jhdv[379] = 1910338730;
        mh.jhdv[380] = -246636653;
        mh.jhdv[381] = -16350892;
        mh.jhdv[382] = -704344585;
        mh.jhdv[383] = 1207837851;
        mh.jhdv[384] = 134951058;
        mh.jhdv[385] = 287210495;
        mh.jhdv[386] = 2049623166;
        mh.jhdv[387] = -1135755821;
        mh.jhdv[388] = 1434636271;
        mh.jhdv[389] = -1468258689;
        mh.jhdv[390] = -650224427;
        mh.jhdv[391] = -1581597019;
        mh.jhdv[392] = 660097788;
        mh.jhdv[393] = 1918634286;
        mh.jhdv[394] = 1567772696;
        mh.jhdv[395] = 18092950;
        mh.jhdv[396] = -1484757408;
        mh.jhdv[397] = 1435361258;
        mh.jhdv[398] = -2126037344;
        mh.jhdv[399] = 1132724052;
    }

    public static /* synthetic */ CallSite jhdw(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void method_25394(class_332 var1_1, int var2_2, int var3_3, float var4_4) {
        var18_5 = mh.c;
        var17_6 /* !! */  = mh.b;
        var16_7 = mh.a;
        if (var18_5) {
            throw null;
lbl6:
            // 29 sources

            return;
        }
        if (var16_7) ** GOTO lbl6
        try {
            if (var16_7) ** GOTO lbl6
            ld.render();
            if (var16_7 || var16_7) ** GOTO lbl6
            ** if (!var18_5) goto lbl-1000
        }
        catch (Throwable var5_8) {
            if (var16_7 || var16_7) ** GOTO lbl6
            ld.shutdown();
            if (var16_7 || var16_7) ** GOTO lbl6
            var1_1.method_25296((int)mh.jhdw("jhkp", jhdt(int ), (int)136), (int)mh.jhdw("jhkq", jhdt(int ), (int)137), var1_1.method_51421(), var1_1.method_51443(), (int)mh.jhdw("jhkr", jhdt(int ), (int)138), (int)mh.jhdw("jhks", jhdt(int ), (int)139));
            if (var16_7) ** GOTO lbl6
        }
lbl-1000:
        // 1 sources

        {
            throw null;
        }
lbl-1000:
        // 1 sources

        {
        }
        if (var16_7 || var16_7) ** GOTO lbl6
        var5_9 = System.nanoTime();
        if (var16_7 || var16_7) ** GOTO lbl6
        var7_10 = Math.min((float)mh.jhdw("jhkt", jhib(int ), (int)140), (float)(var5_9 - this.lastFrame) * mh.jhdw("jhku", jhib(int ), (int)141));
        if (var16_7 || var16_7) ** GOTO lbl6
        this.lastFrame = var5_9;
        if (var16_7 || var16_7) ** GOTO lbl6
        this.intro += (1.0f - this.intro) * Math.min(1.0f, var7_10 * mh.jhdw("jhkv", jhib(int ), (int)142));
        if (var16_7 || var16_7) ** GOTO lbl6
        var8_11 = ki.convertX(var2_2);
        if (var16_7 || var16_7) ** GOTO lbl6
        var9_12 = ki.convertY(var3_3);
        if (var16_7 || var16_7) ** GOTO lbl6
        var10_13 = ki.getFixedScaledWidth();
        if (var16_7 || var16_7) ** GOTO lbl6
        var11_14 = ki.getFixedScaledHeight();
        if (var16_7 || var16_7) ** GOTO lbl6
        this.updateLayout();
        if (var16_7 || var16_7) ** GOTO lbl6
        this.renderBrand(var1_1, var10_13, var11_14);
        if (var16_7 || var16_7) ** GOTO lbl6
        this.renderSocialPanel(var1_1, var8_11, var9_12, var7_10);
        if (var16_7 || var16_7) ** GOTO lbl6
        var12_15 = this.buttons;
        if (var16_7) ** GOTO lbl6
        var13_16 = var12_15.length;
        if (var16_7) ** GOTO lbl6
        var14_17 = mh.jhdw("jhkw", jhdt(int ), (int)143);
        if (var16_7) ** GOTO lbl6
        block56: while (true) {
            if (var16_7 || var16_7) ** GOTO lbl6
            if (var14_17 >= var13_16) ** GOTO lbl67
            if (var16_7) ** GOTO lbl6
            var15_18 = var12_15[var14_17];
            if (var16_7 || var16_7) ** GOTO lbl6
            var15_18.render(var1_1, var8_11, var9_12, var7_10, this.intro);
            if (var16_7) ** GOTO lbl6
            if (var17_6 /* !! */  == 0) ** GOTO lbl-1000
            switch (var17_6 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var16_7) ** GOTO lbl6
                    ++var14_17;
                    if (var16_7) ** GOTO lbl6
                    if (!var18_5) continue block56;
                    throw null;
                }
lbl67:
                // 1 sources

                if (var16_7 || var16_7) ** GOTO lbl6
                this.renderExitSlider(var1_1, var8_11, var9_12, var7_10);
                if (!var16_7 && !var16_7) ** break;
                ** continue;
                return;
                case 0: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhkx", jhdt(int ), (int)144);
                    if (var18_5) {
                        throw null;
                    }
                    ** GOTO lbl112
                }
lbl77:
                // 2 sources

                case 1: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhky", jhdt(int ), (int)145);
                    if (var18_5) {
                        throw null;
                    }
                    ** GOTO lbl241
                }
lbl82:
                // 2 sources

                case 2: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhkz", jhdt(int ), (int)146);
                    if (var18_5) {
                        throw null;
                    }
                    ** GOTO lbl241
                }
                case 3: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhla", jhdt(int ), (int)147);
                    if (var18_5) {
                        throw null;
                    }
                    ** GOTO lbl251
                }
                case 4: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhlb", jhdt(int ), (int)148);
                    if (var18_5) {
                        throw null;
                    }
                    ** GOTO lbl180
                }
lbl97:
                // 5 sources

                case 5: {
                    do {
                        var17_6 /* !! */  = (int)mh.jhdw("jhlc", jhdt(int ), (int)149);
                    } while (!var18_5);
                    throw null;
                }
lbl102:
                // 2 sources

                case 6: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhld", jhdt(int ), (int)150);
                    if (var18_5) {
                        throw null;
                    }
                    ** GOTO lbl288
                }
lbl107:
                // 2 sources

                case 7: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhle", jhdt(int ), (int)151);
                    if (var18_5) {
                        throw null;
                    }
                    ** GOTO lbl135
                }
lbl112:
                // 3 sources

                case 8: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhlf", jhdt(int ), (int)152);
                    if (!var18_5) ** GOTO lbl97
                    throw null;
                }
lbl116:
                // 2 sources

                case 9: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhlg", jhdt(int ), (int)153);
                    if (var18_5) {
                        throw null;
                    }
                    ** GOTO lbl144
                }
lbl121:
                // 2 sources

                case 10: {
                    do {
                        var17_6 /* !! */  = (int)mh.jhdw("jhlh", jhdt(int ), (int)154);
                    } while (!var18_5);
                    throw null;
                }
                case 11: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhli", jhdt(int ), (int)155);
                    if (var18_5) {
                        throw null;
                    }
                    ** GOTO lbl293
                }
                case 12: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhlj", jhdt(int ), (int)156);
                    if (!var18_5) break block56;
                    throw null;
                }
lbl135:
                // 4 sources

                case 13: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhlk", jhdt(int ), (int)157);
                    if (var18_5) {
                        throw null;
                    }
                    ** GOTO lbl148
                }
lbl140:
                // 2 sources

                case 14: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhll", jhdt(int ), (int)158);
                    if (!var18_5) ** GOTO lbl121
                    throw null;
                }
lbl144:
                // 2 sources

                case 15: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhlm", jhdt(int ), (int)159);
                    if (!var18_5) ** GOTO lbl102
                    throw null;
                }
lbl148:
                // 3 sources

                case 16: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhln", jhdt(int ), (int)160);
                    if (!var18_5) ** GOTO lbl97
                    throw null;
                }
                case 17: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhlo", jhdt(int ), (int)161);
                    if (var18_5) {
                        throw null;
                    }
                    ** GOTO lbl263
                }
lbl157:
                // 3 sources

                case 18: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhlp", jhdt(int ), (int)162);
                    if (!var18_5) ** GOTO lbl97
                    throw null;
                }
lbl161:
                // 2 sources

                case 19: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhlq", jhdt(int ), (int)163);
                    if (var18_5) {
                        throw null;
                    }
                    ** GOTO lbl214
                }
                case 20: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhlr", jhdt(int ), (int)164);
                    if (var18_5) {
                        throw null;
                    }
                    ** GOTO lbl267
                }
                case 21: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhls", jhdt(int ), (int)165);
                    if (!var18_5) ** GOTO lbl135
                    throw null;
                }
lbl175:
                // 2 sources

                case 22: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhlt", jhdt(int ), (int)166);
                    if (var18_5) {
                        throw null;
                    }
                    ** GOTO lbl200
                }
lbl180:
                // 3 sources

                case 23: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhlu", jhdt(int ), (int)167);
                    if (!var18_5) ** GOTO lbl148
                    throw null;
                }
                case 24: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhlv", jhdt(int ), (int)168);
                    if (!var18_5) ** GOTO lbl112
                    throw null;
                }
                case 25: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhlw", jhdt(int ), (int)169);
                    if (!var18_5) ** GOTO lbl157
                    throw null;
                }
                case 26: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhlx", jhdt(int ), (int)170);
                    if (!var18_5) ** GOTO lbl180
                    throw null;
                }
                case 27: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhly", jhdt(int ), (int)171);
                    if (!var18_5) ** GOTO lbl97
                    throw null;
                }
lbl200:
                // 2 sources

                case 28: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhlz", jhdt(int ), (int)172);
                    if (!var18_5) ** GOTO lbl107
                    throw null;
                }
lbl204:
                // 2 sources

                case 29: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhma", jhdt(int ), (int)173);
                    if (var18_5) {
                        throw null;
                    }
                    ** GOTO lbl284
                }
                case 30: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhmb", jhdt(int ), (int)174);
                    if (var18_5) {
                        throw null;
                    }
                    ** GOTO lbl288
                }
lbl214:
                // 2 sources

                case 31: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhmc", jhdt(int ), (int)175);
                    if (var18_5) {
                        throw null;
                    }
                    ** GOTO lbl284
                }
                case 32: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhmd", jhdt(int ), (int)176);
                    if (var18_5) {
                        throw null;
                    }
                    ** GOTO lbl255
                }
                case 33: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhme", jhdt(int ), (int)177);
                    if (!var18_5) ** GOTO lbl175
                    throw null;
                }
                case 34: {
                    do {
                        var17_6 /* !! */  = (int)mh.jhdw("jhmf", jhdt(int ), (int)178);
                    } while (!var18_5);
                    throw null;
                }
                case 35: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhmg", jhdt(int ), (int)179);
                    if (!var18_5) ** GOTO lbl116
                    throw null;
                }
                case 36: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhmh", jhdt(int ), (int)180);
                    if (var18_5) {
                        throw null;
                    }
                }
lbl241:
                // 6 sources

                case 37: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhmi", jhdt(int ), (int)181);
                    if (var18_5) {
                        throw null;
                    }
                    ** GOTO lbl293
                }
                case 38: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhmj", jhdt(int ), (int)182);
                    if (var18_5) {
                        throw null;
                    }
                    ** GOTO lbl288
                }
lbl251:
                // 2 sources

                case 39: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhmk", jhdt(int ), (int)183);
                    if (!var18_5) ** GOTO lbl157
                    throw null;
                }
lbl255:
                // 2 sources

                case 40: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhml", jhdt(int ), (int)184);
                    if (!var18_5) ** GOTO lbl204
                    throw null;
                }
                case 41: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhmm", jhdt(int ), (int)185);
                    if (!var18_5) ** GOTO lbl241
                    throw null;
                }
lbl263:
                // 2 sources

                case 42: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhmn", jhdt(int ), (int)186);
                    if (!var18_5) break block56;
                    throw null;
                }
lbl267:
                // 2 sources

                case 43: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhmo", jhdt(int ), (int)187);
                    if (var18_5) {
                        throw null;
                    }
                    ** GOTO lbl284
                }
                case 44: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhmp", jhdt(int ), (int)188);
                    if (!var18_5) ** GOTO lbl77
                    throw null;
                }
                case 45: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhmq", jhdt(int ), (int)189);
                    if (!var18_5) ** GOTO lbl161
                    throw null;
                }
                case 46: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhmr", jhdt(int ), (int)190);
                    if (!var18_5) ** GOTO lbl82
                    throw null;
                }
lbl284:
                // 4 sources

                case 47: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhms", jhdt(int ), (int)191);
                    if (!var18_5) break block56;
                    throw null;
                }
lbl288:
                // 4 sources

                case 48: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var17_6 /* !! */  = (int)mh.jhdw("jhmt", jhdt(int ), (int)192);
                        if (!var18_5) ** GOTO lbl135
                        throw null;
                    }
                }
lbl293:
                // 3 sources

                case 49: {
                    var17_6 /* !! */  = (int)mh.jhdw("jhmu", jhdt(int ), (int)193);
                    if (!var18_5) ** GOTO lbl140
                    throw null;
                }
                case 50: 
            }
            break;
        }
        var17_6 /* !! */  = (int)mh.jhdw("jhmv", jhdt(int ), (int)194);
        ** while (!var18_5)
lbl300:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jjfe() {
        mh.jhft[0] = -4767648265882838212L;
        mh.jhft[1] = -271221484567207442L;
        mh.jhft[2] = -4198366204556067004L;
        mh.jhft[3] = 3114173553677481438L;
        mh.jhft[4] = 481248588484298991L;
        mh.jhft[5] = 8551770384158008933L;
        mh.jhft[6] = -4280562457182114440L;
        mh.jhft[7] = 8160043812373291846L;
        mh.jhft[8] = -330402910982306550L;
        mh.jhft[9] = 5535902412391130148L;
        mh.jhft[10] = 1867714252914961030L;
        mh.jhft[11] = 5699552231452643091L;
        mh.jhft[12] = -8832106291179626954L;
        mh.jhft[13] = -937250179962540461L;
        mh.jhft[14] = 3096190087152856516L;
        mh.jhft[15] = -3294103041951378558L;
        mh.jhft[16] = -5853863338753088856L;
        mh.jhft[17] = 6286198181048115678L;
        mh.jhft[18] = 783345988535236232L;
        mh.jhft[19] = 1578325835414677720L;
        mh.jhft[20] = 8813079752829204189L;
        mh.jhft[21] = 7366794393820588795L;
        mh.jhft[22] = -3293302928660086526L;
        mh.jhft[23] = -8411529647432541342L;
        mh.jhft[24] = 5995752238047117458L;
        mh.jhft[25] = -421468877170802362L;
        mh.jhft[26] = 8921661359653305379L;
        mh.jhft[27] = 2600046032251636191L;
        mh.jhft[28] = 2167970294497614830L;
        mh.jhft[29] = 438686065192045279L;
        mh.jhft[30] = 7170433228872896622L;
        mh.jhft[31] = 3758675558723756609L;
        mh.jhft[32] = -4031200777943012741L;
        mh.jhft[33] = 181594785596626000L;
        mh.jhft[34] = 4787720296191845973L;
        mh.jhft[35] = -8920254047604556183L;
        mh.jhft[36] = 6903746204855391224L;
        mh.jhft[37] = 503508520810513644L;
        mh.jhft[38] = -9084767878404625027L;
        mh.jhft[39] = -4399517587896005279L;
        mh.jhft[40] = 3626130577452272309L;
        mh.jhft[41] = 7291156578095245051L;
        mh.jhft[42] = 6309660393014418155L;
        mh.jhft[43] = 4836141404583727839L;
        mh.jhft[44] = 2443535364925371674L;
        mh.jhft[45] = -1495166483510526010L;
        mh.jhft[46] = 3959510778698927839L;
        mh.jhft[47] = 5242942064905789458L;
        mh.jhft[48] = -6710221930178980779L;
        mh.jhft[49] = 4067140349911347786L;
        mh.jhft[50] = -2050384920337404869L;
        mh.jhft[51] = 6040409781633646147L;
        mh.jhft[52] = -1641407212571090417L;
        mh.jhft[53] = 5079590038368075302L;
        mh.jhft[54] = 5674713831370982539L;
        mh.jhft[55] = 2971008022409663251L;
        mh.jhft[56] = 8322153567720910624L;
        mh.jhft[57] = 1942864841335510826L;
        mh.jhft[58] = -905330416560603684L;
        mh.jhft[59] = 6728296469619935097L;
        mh.jhft[60] = 3515237951622306213L;
        mh.jhft[61] = -1373606087888236714L;
        mh.jhft[62] = 9210401191132169553L;
        mh.jhft[63] = 3109751594880668562L;
        mh.jhft[64] = 1029289188781132975L;
        mh.jhft[65] = -942211653191876653L;
        mh.jhft[66] = 4847647788012418610L;
        mh.jhft[67] = -1843548334375224227L;
        mh.jhft[68] = -1287433927495903728L;
        mh.jhft[69] = -7243547850950730047L;
        mh.jhft[70] = -554168964416246210L;
        mh.jhft[71] = -6206843491138087232L;
        mh.jhft[72] = 2301306521110609372L;
        mh.jhft[73] = -5581109468118366784L;
        mh.jhft[74] = 2880009832348892640L;
        mh.jhft[75] = -3160970024133289388L;
        mh.jhft[76] = 1010442048330719128L;
        mh.jhft[77] = -319776950298630030L;
        mh.jhft[78] = -3967678680251220551L;
        mh.jhft[79] = -8587182800830035477L;
        mh.jhft[80] = -5535103350745099459L;
        mh.jhft[81] = 4364236942521603474L;
        mh.jhft[82] = -3724258940913054877L;
        mh.jhft[83] = -2111477928944432685L;
        mh.jhft[84] = 1429630181537972224L;
        mh.jhft[85] = -6841906674471407675L;
        mh.jhft[86] = -8542088671939320526L;
        mh.jhft[87] = -8289904730349623200L;
        mh.jhft[88] = -5846126417964440797L;
        mh.jhft[89] = 720615523093203271L;
        mh.jhft[90] = -4744013825887824703L;
        mh.jhft[91] = -8796240899410270184L;
        mh.jhft[92] = -6617798938805060853L;
        mh.jhft[93] = 2041750418430268216L;
        mh.jhft[94] = -1135937915074209025L;
        mh.jhft[95] = -5729230041235989675L;
        mh.jhft[96] = 6252065500737837093L;
        mh.jhft[97] = 3159219838597103511L;
        mh.jhft[98] = -4339058562503989978L;
        mh.jhft[99] = 3819351067945113260L;
    }

    /*
     * Exception decompiling
     */
    public static synchronized void protectFromFancyMenu(class_437 var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[CASE]
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

    private static /* synthetic */ void jjfb() {
        mh.jhdv[600] = 1597208688;
        mh.jhdv[601] = -1573597911;
        mh.jhdv[602] = 1699487668;
        mh.jhdv[603] = 375271834;
        mh.jhdv[604] = -1276899390;
        mh.jhdv[605] = -629138954;
        mh.jhdv[606] = -721573919;
        mh.jhdv[607] = -1172224892;
        mh.jhdv[608] = -626789737;
        mh.jhdv[609] = -974980643;
        mh.jhdv[610] = -1703365299;
        mh.jhdv[611] = 1642351497;
        mh.jhdv[612] = 297368565;
        mh.jhdv[613] = -907661782;
        mh.jhdv[614] = -674613194;
        mh.jhdv[615] = 660963111;
        mh.jhdv[616] = -1696886684;
        mh.jhdv[617] = 828779371;
        mh.jhdv[618] = 1948314862;
        mh.jhdv[619] = 1372132814;
        mh.jhdv[620] = -146002126;
        mh.jhdv[621] = -396112430;
        mh.jhdv[622] = -449335741;
        mh.jhdv[623] = 2000715269;
        mh.jhdv[624] = 589326239;
        mh.jhdv[625] = -1198380233;
        mh.jhdv[626] = -158289430;
        mh.jhdv[627] = 2142903264;
        mh.jhdv[628] = 1782998791;
        mh.jhdv[629] = 238944123;
        mh.jhdv[630] = -1580585358;
        mh.jhdv[631] = -1187485357;
        mh.jhdv[632] = 1514180888;
        mh.jhdv[633] = 1693632964;
        mh.jhdv[634] = -617780787;
        mh.jhdv[635] = 1817542160;
        mh.jhdv[636] = 966630853;
        mh.jhdv[637] = -1192713712;
        mh.jhdv[638] = -1116423478;
        mh.jhdv[639] = -509168589;
        mh.jhdv[640] = 1154266369;
        mh.jhdv[641] = -1896471632;
        mh.jhdv[642] = -10447755;
        mh.jhdv[643] = -1636119850;
        mh.jhdv[644] = -1899528589;
        mh.jhdv[645] = -2004270663;
        mh.jhdv[646] = 1695650496;
        mh.jhdv[647] = -1123634335;
        mh.jhdv[648] = 222559733;
        mh.jhdv[649] = 1187504366;
        mh.jhdv[650] = 434880611;
        mh.jhdv[651] = 391707007;
        mh.jhdv[652] = -638917875;
        mh.jhdv[653] = -1683468880;
        mh.jhdv[654] = -1071805689;
        mh.jhdv[655] = -76032889;
        mh.jhdv[656] = -1052646302;
        mh.jhdv[657] = -1882426037;
        mh.jhdv[658] = 606479151;
        mh.jhdv[659] = -2072281893;
        mh.jhdv[660] = -1803017571;
        mh.jhdv[661] = 16756922;
        mh.jhdv[662] = -62220203;
        mh.jhdv[663] = 1868075424;
        mh.jhdv[664] = 1572428124;
        mh.jhdv[665] = 774838504;
        mh.jhdv[666] = -1748116595;
        mh.jhdv[667] = 2124929505;
        mh.jhdv[668] = 68398278;
        mh.jhdv[669] = -573540683;
        mh.jhdv[670] = -1923126329;
        mh.jhdv[671] = 281661084;
        mh.jhdv[672] = -1556370368;
        mh.jhdv[673] = -1764045992;
        mh.jhdv[674] = 546260544;
        mh.jhdv[675] = -319187150;
        mh.jhdv[676] = 2093641960;
        mh.jhdv[677] = 1843040313;
        mh.jhdv[678] = 464351604;
        mh.jhdv[679] = 471764687;
        mh.jhdv[680] = 37285904;
        mh.jhdv[681] = 226187468;
        mh.jhdv[682] = 697116198;
        mh.jhdv[683] = 505294779;
        mh.jhdv[684] = -341924358;
        mh.jhdv[685] = 399679490;
        mh.jhdv[686] = 1977909708;
        mh.jhdv[687] = 1494278128;
        mh.jhdv[688] = -244733725;
        mh.jhdv[689] = -132770526;
        mh.jhdv[690] = -408245256;
        mh.jhdv[691] = 1992831152;
        mh.jhdv[692] = 1109977764;
        mh.jhdv[693] = 1112520937;
        mh.jhdv[694] = 1760617309;
        mh.jhdv[695] = 701534591;
        mh.jhdv[696] = -1486343800;
        mh.jhdv[697] = 1773331136;
        mh.jhdv[698] = -1136224993;
        mh.jhdv[699] = -1196369218;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean method_25422() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mh.rl - mh.jhdw("jixn", jhfs(int ), (int)197)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mh.jhdw("jixo", jhdt(int ), (int)711)) break;
            v0 /* !! */  = (long)mh.jhdw("jixp", jhdt(int ), (int)712);
        }
        var3_1 = mh.c;
        v1 /* !! */  = mh.rl;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - mh.jhdw("jixq", jhfs(int ), (int)198));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1225776778: {
                    break block19;
                }
                case -578334945: {
                    v2 = mh.jhdw("jixr", jhfs(int ), (int)199);
                    continue block19;
                }
                case 418093260: {
                    v2 = mh.jhdw("jixs", jhfs(int ), (int)200);
                    continue block19;
                }
                case 1455021526: {
                    v2 = mh.jhdw("jixt", jhfs(int ), (int)201);
                    continue block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = mh.b;
        v3 /* !! */  = mh.rl;
        if (true) ** GOTO lbl29
        block20: while (true) {
            v3 /* !! */  = (long)(v4 - mh.jhdw("jixu", jhfs(int ), (int)202));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1225776778: {
                    break block20;
                }
                case -781250275: {
                    v4 = mh.jhdw("jixv", jhfs(int ), (int)203);
                    continue block20;
                }
                case 557129302: {
                    v4 = mh.jhdw("jixw", jhfs(int ), (int)204);
                    continue block20;
                }
                case 708325006: {
                    v4 = mh.jhdw("jixx", jhfs(int ), (int)205);
                    continue block20;
                }
            }
            break;
        }
        var1_3 = mh.a;
        if (var3_1) {
            throw null;
lbl44:
            // 2 sources

            return (boolean)mh.jhdw("jixy", jhdt(int ), (int)713);
        }
        if (var1_3) ** GOTO lbl44
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block12 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                return (boolean)mh.jhdw("jixz", jhdt(int ), (int)714);
            }
            case 0: {
                var2_2 /* !! */  = (int)mh.jhdw("jiya", jhdt(int ), (int)715);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl62
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mh.jhdw("jiyb", jhdt(int ), (int)716);
                    if (!var3_1) break block12;
                    throw null;
                }
            }
lbl62:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)mh.jhdw("jiyc", jhdt(int ), (int)717);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mh.jhdw("jiyd", jhdt(int ), (int)718);
        ** while (!var3_1)
lbl69:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ Object lambda$protectFromFancyMenu$0(String var0, Object var1_1, Method var2_2, Object[] var3_3) throws Throwable {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[CASE]], but top level block is 6[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
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
    private void renderSocialPanel(class_332 var1_1, float var2_2, float var3_3, float var4_4) {
        var11_5 = mh.c;
        var10_6 /* !! */  = mh.b;
        var9_7 = mh.a;
        if (var11_5) {
            throw null;
lbl6:
            // 14 sources

            return;
        }
        if (var9_7 || var9_7) ** GOTO lbl6
        var5_8 = mh.jhdw("jhmw", jhib(int ), (int)195);
        if (var9_7 || var9_7) ** GOTO lbl6
        var6_9 = mh.jhdw("jhmx", jhib(int ), (int)196);
        if (var9_7 || var9_7) ** GOTO lbl6
        var7_10 = var5_8 + mh.jhdw("jhmy", jhib(int ), (int)197) + mh.jhdw("jhmz", jhib(int ), (int)198);
        if (var9_7 || var9_7) ** GOTO lbl6
        var8_11 = Math.min(1.0f, var4_4 * mh.jhdw("jhna", jhib(int ), (int)199));
        if (var10_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var9_7 || var9_7) ** GOTO lbl6
                if (mh.contains(var2_2, var3_3, (float)var5_8, (float)var6_9, (float)mh.jhdw("jhnb", jhib(int ), (int)200), (float)mh.jhdw("jhnc", jhib(int ), (int)201))) {
                    v0 = 1.0f;
                    if (var11_5) {
                        throw null;
                    }
                } else {
                    v0 = 0.0f;
                }
                this.telegramHover += (v0 - this.telegramHover) * var8_11;
                if (var9_7 || var9_7) ** GOTO lbl6
                if (mh.contains(var2_2, var3_3, (float)var7_10, (float)var6_9, (float)mh.jhdw("jhnd", jhib(int ), (int)202), (float)mh.jhdw("jhne", jhib(int ), (int)203))) {
                    v1 = 1.0f;
                    if (var11_5) {
                        throw null;
                    }
                } else {
                    v1 = 0.0f;
                }
                this.discordHover += (v1 - this.discordHover) * var8_11;
                if (var9_7 || var9_7) ** GOTO lbl6
                ki.blur(var1_1, (float)mh.jhdw("jhnf", jhib(int ), (int)204), (float)mh.jhdw("jhng", jhib(int ), (int)205), (float)mh.jhdw("jhnh", jhib(int ), (int)206), (float)mh.jhdw("jhni", jhib(int ), (int)207), (float)mh.jhdw("jhnj", jhib(int ), (int)208), (float)mh.jhdw("jhnk", jhib(int ), (int)209), (boolean)mh.jhdw("jhnl", jhdt(int ), (int)210));
                if (var9_7 || var9_7) ** GOTO lbl6
                ki.rect(var1_1, (float)mh.jhdw("jhnm", jhib(int ), (int)211), (float)mh.jhdw("jhnn", jhib(int ), (int)212), (float)mh.jhdw("jhno", jhib(int ), (int)213), (float)mh.jhdw("jhnp", jhib(int ), (int)214), (float)mh.jhdw("jhnq", jhib(int ), (int)215), nd.rgba((int)mh.jhdw("jhnr", jhdt(int ), (int)216), (int)mh.jhdw("jhns", jhdt(int ), (int)217), (int)mh.jhdw("jhnt", jhdt(int ), (int)218), Math.round((float)(mh.jhdw("jhnu", jhib(int ), (int)219) * this.intro))), (boolean)mh.jhdw("jhnv", jhdt(int ), (int)220));
                if (var9_7 || var9_7) ** GOTO lbl6
                ki.rect(var1_1, (float)mh.jhdw("jhnw", jhib(int ), (int)221), (float)mh.jhdw("jhnx", jhib(int ), (int)222), (float)mh.jhdw("jhny", jhib(int ), (int)223), (float)mh.jhdw("jhnz", jhib(int ), (int)224), (float)mh.jhdw("jhoa", jhib(int ), (int)225), nd.rgba((int)mh.jhdw("jhob", jhdt(int ), (int)226), (int)mh.jhdw("jhoc", jhdt(int ), (int)227), (int)mh.jhdw("jhod", jhdt(int ), (int)228), Math.round((float)(mh.jhdw("jhoe", jhib(int ), (int)229) * this.intro))), (boolean)mh.jhdw("jhof", jhdt(int ), (int)230));
                if (var9_7 || var9_7) ** GOTO lbl6
                ki.innerShadow(var1_1, (float)mh.jhdw("jhog", jhib(int ), (int)231), (float)mh.jhdw("jhoh", jhib(int ), (int)232), (float)mh.jhdw("jhoi", jhib(int ), (int)233), (float)mh.jhdw("jhoj", jhib(int ), (int)234), (float)mh.jhdw("jhok", jhib(int ), (int)235), (float)mh.jhdw("jhol", jhib(int ), (int)236), (float)mh.jhdw("jhom", jhib(int ), (int)237), nd.rgba((int)mh.jhdw("jhon", jhdt(int ), (int)238), (int)mh.jhdw("jhoo", jhdt(int ), (int)239), (int)mh.jhdw("jhop", jhdt(int ), (int)240), Math.round((float)(mh.jhdw("jhoq", jhib(int ), (int)241) * this.intro))), (boolean)mh.jhdw("jhor", jhdt(int ), (int)242));
                if (var9_7 || var9_7) ** GOTO lbl6
                ki.outline(var1_1, (float)mh.jhdw("jhos", jhib(int ), (int)243), (float)mh.jhdw("jhot", jhib(int ), (int)244), (float)mh.jhdw("jhou", jhib(int ), (int)245), (float)mh.jhdw("jhov", jhib(int ), (int)246), (float)mh.jhdw("jhow", jhib(int ), (int)247), (float)mh.jhdw("jhox", jhib(int ), (int)248), nd.rgba((int)mh.jhdw("jhoy", jhdt(int ), (int)249), (int)mh.jhdw("jhoz", jhdt(int ), (int)250), (int)mh.jhdw("jhpa", jhdt(int ), (int)251), Math.round((float)(mh.jhdw("jhpb", jhib(int ), (int)252) * this.intro))), (boolean)mh.jhdw("jhpc", jhdt(int ), (int)253));
                if (var9_7 || var9_7) ** GOTO lbl6
                this.renderSocialButton(var1_1, (float)var5_8, (float)var6_9, "A", this.telegramHover);
                if (var9_7 || var9_7) ** GOTO lbl6
                this.renderSocialButton(var1_1, (float)var7_10, (float)var6_9, "B", this.discordHover);
                if (var9_7 || var9_7) ** continue;
                return;
            }
lbl51:
            // 3 sources

            case 0: {
                var10_6 /* !! */  = (int)mh.jhdw("jhpd", jhdt(int ), (int)254);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl56:
            // 2 sources

            case 1: {
                var10_6 /* !! */  = (int)mh.jhdw("jhpe", jhdt(int ), (int)255);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl61:
            // 3 sources

            case 2: {
                var10_6 /* !! */  = (int)mh.jhdw("jhpf", jhdt(int ), (int)256);
                if (var11_5) {
                    throw null;
                }
            }
            case 3: {
                var10_6 /* !! */  = (int)mh.jhdw("jhpg", jhdt(int ), (int)257);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_6 /* !! */  = (int)mh.jhdw("jhph", jhdt(int ), (int)258);
                    if (var11_5) {
                        throw null;
                    }
                    ** GOTO lbl133
                    break;
                }
            }
            case 5: {
                var10_6 /* !! */  = (int)mh.jhdw("jhpi", jhdt(int ), (int)259);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl81:
            // 2 sources

            case 6: {
                var10_6 /* !! */  = (int)mh.jhdw("jhpj", jhdt(int ), (int)260);
                if (!var11_5) ** GOTO lbl51
                throw null;
            }
lbl85:
            // 3 sources

            case 7: {
                var10_6 /* !! */  = (int)mh.jhdw("jhpk", jhdt(int ), (int)261);
                if (!var11_5) break;
                throw null;
            }
            case 8: {
                var10_6 /* !! */  = (int)mh.jhdw("jhpl", jhdt(int ), (int)262);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl98
            }
lbl94:
            // 2 sources

            case 9: {
                var10_6 /* !! */  = (int)mh.jhdw("jhpm", jhdt(int ), (int)263);
                if (!var11_5) ** GOTO lbl85
                throw null;
            }
lbl98:
            // 3 sources

            case 10: {
                var10_6 /* !! */  = (int)mh.jhdw("jhpn", jhdt(int ), (int)264);
                if (!var11_5) ** GOTO lbl94
                throw null;
            }
            case 11: {
                var10_6 /* !! */  = (int)mh.jhdw("jhpo", jhdt(int ), (int)265);
                if (!var11_5) ** GOTO lbl81
                throw null;
            }
lbl106:
            // 2 sources

            case 12: {
                var10_6 /* !! */  = (int)mh.jhdw("jhpp", jhdt(int ), (int)266);
                if (!var11_5) ** GOTO lbl85
                throw null;
            }
            case 13: {
                var10_6 /* !! */  = (int)mh.jhdw("jhpq", jhdt(int ), (int)267);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl124
            }
            case 14: {
                var10_6 /* !! */  = (int)mh.jhdw("jhpr", jhdt(int ), (int)268);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl120:
            // 2 sources

            case 15: {
                var10_6 /* !! */  = (int)mh.jhdw("jhps", jhdt(int ), (int)269);
                if (!var11_5) ** GOTO lbl61
                throw null;
            }
lbl124:
            // 3 sources

            case 16: {
                var10_6 /* !! */  = (int)mh.jhdw("jhpt", jhdt(int ), (int)270);
                if (!var11_5) ** GOTO lbl51
                throw null;
            }
lbl128:
            // 2 sources

            case 17: {
                var10_6 /* !! */  = (int)mh.jhdw("jhpu", jhdt(int ), (int)271);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl133:
            // 2 sources

            case 18: {
                var10_6 /* !! */  = (int)mh.jhdw("jhpv", jhdt(int ), (int)272);
                if (!var11_5) ** GOTO lbl120
                throw null;
            }
lbl137:
            // 2 sources

            case 19: {
                var10_6 /* !! */  = (int)mh.jhdw("jhpw", jhdt(int ), (int)273);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl142:
            // 3 sources

            case 20: {
                do {
                    var10_6 /* !! */  = (int)mh.jhdw("jhpx", jhdt(int ), (int)274);
                } while (!var11_5);
                throw null;
            }
            case 21: {
                var10_6 /* !! */  = (int)mh.jhdw("jhpy", jhdt(int ), (int)275);
                if (!var11_5) ** GOTO lbl56
                throw null;
            }
            case 22: {
                var10_6 /* !! */  = (int)mh.jhdw("jhpz", jhdt(int ), (int)276);
                if (!var11_5) ** GOTO lbl124
                throw null;
            }
lbl155:
            // 2 sources

            case 23: {
                var10_6 /* !! */  = (int)mh.jhdw("jhqa", jhdt(int ), (int)277);
                if (!var11_5) ** GOTO lbl61
                throw null;
            }
            case 24: {
                var10_6 /* !! */  = (int)mh.jhdw("jhqb", jhdt(int ), (int)278);
                if (!var11_5) ** GOTO lbl98
                throw null;
            }
lbl163:
            // 3 sources

            case 25: {
                var10_6 /* !! */  = (int)mh.jhdw("jhqc", jhdt(int ), (int)279);
                if (!var11_5) ** GOTO lbl106
                throw null;
            }
            case 26: {
                var10_6 /* !! */  = (int)mh.jhdw("jhqd", jhdt(int ), (int)280);
                if (!var11_5) ** GOTO lbl155
                throw null;
            }
lbl171:
            // 3 sources

            case 27: {
                do {
                    var10_6 /* !! */  = (int)mh.jhdw("jhqe", jhdt(int ), (int)281);
                } while (!var11_5);
                throw null;
            }
            case 28: {
                var10_6 /* !! */  = (int)mh.jhdw("jhqf", jhdt(int ), (int)282);
                if (!var11_5) ** GOTO lbl128
                throw null;
            }
            case 29: 
        }
        var10_6 /* !! */  = (int)mh.jhdw("jhqg", jhdt(int ), (int)283);
        ** while (!var11_5)
lbl183:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void renderSocialButton(class_332 var1_1, float var2_2, float var3_3, String var4_4, float var5_5) {
        block105: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = mh.rl - mh.jhdw("jhqh", jhfs(int ), (int)34)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == mh.jhdw("jhqi", jhdt(int ), (int)284)) break;
                v0 /* !! */  = (long)mh.jhdw("jhqj", jhdt(int ), (int)285);
            }
            var10_6 = mh.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = mh.rl - mh.jhdw("jhqk", jhfs(int ), (int)35)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == mh.jhdw("jhql", jhdt(int ), (int)286)) break;
                v1 /* !! */  = (long)mh.jhdw("jhqm", jhdt(int ), (int)287);
            }
            var9_7 /* !! */  = mh.b;
            v2 /* !! */  = mh.rl;
            if (true) ** GOTO lbl17
            block69: while (true) {
                v2 /* !! */  = (long)(v3 - mh.jhdw("jhqn", jhfs(int ), (int)36));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1225776778: {
                        break block69;
                    }
                    case -723703686: {
                        v3 = mh.jhdw("jhqo", jhfs(int ), (int)37);
                        continue block69;
                    }
                    case 1047395069: {
                        v3 = mh.jhdw("jhqp", jhfs(int ), (int)38);
                        continue block69;
                    }
                }
                break;
            }
            var8_8 = mh.a;
            if (var10_6) {
                throw null;
lbl29:
                // 8 sources

                return;
            }
            if (var8_8 || var8_8) ** GOTO lbl29
            v4 = mh.jhdw("jhqq", jhib(int ), (int)288);
            v5 = mh.jhdw("jhqr", jhib(int ), (int)289);
            v6 = mh.jhdw("jhqs", jhib(int ), (int)290);
            v7 = mh.jhdw("jhqt", jhdt(int ), (int)291);
            v8 = mh.jhdw("jhqu", jhdt(int ), (int)292);
            v9 = mh.jhdw("jhqv", jhdt(int ), (int)293);
            v10 = mh.jhdw("jhqw", jhib(int ), (int)294) + var5_5 * mh.jhdw("jhqx", jhib(int ), (int)295);
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_2 = mh.rl - mh.jhdw("jhqy", jhfs(int ), (int)39)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == mh.jhdw("jhqz", jhdt(int ), (int)296)) break;
                v11 /* !! */  = (long)mh.jhdw("jhra", jhdt(int ), (int)297);
            }
            v12 = v10 * this.intro;
            v13 /* !! */  = mh.rl;
            if (true) ** GOTO lbl49
            block72: while (true) {
                v13 /* !! */  = (long)(v14 - mh.jhdw("jhrb", jhfs(int ), (int)40));
lbl49:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1847159194: {
                        v14 = mh.jhdw("jhrc", jhfs(int ), (int)41);
                        continue block72;
                    }
                    case -1225776778: {
                        break block72;
                    }
                    case 771299856: {
                        v14 = mh.jhdw("jhrd", jhfs(int ), (int)42);
                        continue block72;
                    }
                    case 1856082364: {
                        v14 = mh.jhdw("jhre", jhfs(int ), (int)43);
                        continue block72;
                    }
                }
                break;
            }
            v15 = Math.round((float)v12);
            v16 /* !! */  = mh.rl;
            if (true) ** GOTO lbl66
            block73: while (true) {
                v16 /* !! */  = (long)(v17 - mh.jhdw("jhrf", jhfs(int ), (int)44));
lbl66:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case -1899084167: {
                        v17 = mh.jhdw("jhrg", jhfs(int ), (int)45);
                        continue block73;
                    }
                    case -1225776778: {
                        break block73;
                    }
                    case 960838998: {
                        v17 = mh.jhdw("jhrh", jhfs(int ), (int)46);
                        continue block73;
                    }
                    case 1638121216: {
                        v17 = mh.jhdw("jhri", jhfs(int ), (int)47);
                        continue block73;
                    }
                }
                break;
            }
            v18 = nd.rgba((int)v7, (int)v8, (int)v9, v15);
            v19 = mh.jhdw("jhrj", jhdt(int ), (int)298);
            v20 /* !! */  = mh.rl;
            if (true) ** GOTO lbl84
            block74: while (true) {
                v20 /* !! */  = (long)(v21 - mh.jhdw("jhrk", jhfs(int ), (int)48));
lbl84:
                // 2 sources

                switch ((int)v20 /* !! */ ) {
                    case -1650283284: {
                        v21 = mh.jhdw("jhrl", jhfs(int ), (int)49);
                        continue block74;
                    }
                    case -1225776778: {
                        break block74;
                    }
                    case -918657639: {
                        v21 = mh.jhdw("jhrm", jhfs(int ), (int)50);
                        continue block74;
                    }
                    case -578415043: {
                        v21 = mh.jhdw("jhrn", jhfs(int ), (int)51);
                        continue block74;
                    }
                }
                break;
            }
            ki.rect(var1_1, var2_2, var3_3, (float)v4, (float)v5, (float)v6, v18, (boolean)v19);
            if (var8_8 || var8_8) ** GOTO lbl29
            v22 = mh.jhdw("jhro", jhib(int ), (int)299);
            v23 = mh.jhdw("jhrp", jhib(int ), (int)300);
            v24 = mh.jhdw("jhrq", jhib(int ), (int)301);
            v25 = mh.jhdw("jhrr", jhib(int ), (int)302);
            v26 = mh.jhdw("jhrs", jhdt(int ), (int)303);
            v27 = mh.jhdw("jhrt", jhdt(int ), (int)304);
            v28 = mh.jhdw("jhru", jhdt(int ), (int)305);
            v29 = mh.jhdw("jhrv", jhib(int ), (int)306) + var5_5 * mh.jhdw("jhrw", jhib(int ), (int)307);
            while (true) {
                if ((v30 /* !! */  = (cfr_temp_3 = mh.rl - mh.jhdw("jhrx", jhfs(int ), (int)52)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v30 /* !! */  == mh.jhdw("jhry", jhdt(int ), (int)308)) break;
                v30 /* !! */  = (long)mh.jhdw("jhrz", jhdt(int ), (int)309);
            }
            v31 = v29 * this.intro;
            while (true) {
                if ((v32 /* !! */  = (cfr_temp_4 = mh.rl - mh.jhdw("jhsa", jhfs(int ), (int)53)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v32 /* !! */  == mh.jhdw("jhsb", jhdt(int ), (int)310)) break;
                v32 /* !! */  = (long)mh.jhdw("jhsc", jhdt(int ), (int)311);
            }
            v33 = Math.round((float)v31);
            while (true) {
                if ((v34 /* !! */  = (cfr_temp_5 = mh.rl - mh.jhdw("jhsd", jhfs(int ), (int)54)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v34 /* !! */  == mh.jhdw("jhse", jhdt(int ), (int)312)) break;
                v34 /* !! */  = (long)mh.jhdw("jhsf", jhdt(int ), (int)313);
            }
            v35 = nd.rgba((int)v26, (int)v27, (int)v28, v33);
            v36 = mh.jhdw("jhsg", jhdt(int ), (int)314);
            v37 /* !! */  = mh.rl;
            if (true) ** GOTO lbl129
            block78: while (true) {
                v37 /* !! */  = (long)(v38 - mh.jhdw("jhsh", jhfs(int ), (int)55));
lbl129:
                // 2 sources

                switch ((int)v37 /* !! */ ) {
                    case -1225776778: {
                        break block78;
                    }
                    case -944776812: {
                        v38 = mh.jhdw("jhsi", jhfs(int ), (int)56);
                        continue block78;
                    }
                    case 595784331: {
                        v38 = mh.jhdw("jhsj", jhfs(int ), (int)57);
                        continue block78;
                    }
                }
                break;
            }
            ki.outline(var1_1, var2_2, var3_3, (float)v22, (float)v23, (float)v24, (float)v25, v35, (boolean)v36);
            if (var8_8 || var8_8) ** GOTO lbl29
            v39 /* !! */  = mh.rl;
            if (true) ** GOTO lbl144
            block79: while (true) {
                v39 /* !! */  = (long)(mh.jhdw("jhsl", jhfs(int ), (int)59) - mh.jhdw("jhsk", jhfs(int ), (int)58));
lbl144:
                // 2 sources

                switch ((int)v39 /* !! */ ) {
                    case -1678197786: {
                        continue block79;
                    }
                    case -1225776778: {
                        break block79;
                    }
                }
                break;
            }
            if (kv.WEB != null) break block105;
            if (var8_8) ** GOTO lbl29
            return;
        }
        if (var8_8 || var8_8) ** GOTO lbl29
        var6_9 = mh.jhdw("jhsm", jhib(int ), (int)315) + var5_5 * mh.jhdw("jhsn", jhib(int ), (int)316);
        if (var8_8 || var8_8) ** GOTO lbl29
        v40 = mh.jhdw("jhso", jhib(int ), (int)317);
        while (true) {
            if ((v41 /* !! */  = (cfr_temp_6 = mh.rl - mh.jhdw("jhsp", jhfs(int ), (int)60)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v41 /* !! */  == mh.jhdw("jhsq", jhdt(int ), (int)318)) break;
            v41 /* !! */  = (long)mh.jhdw("jhsr", jhdt(int ), (int)319);
        }
        while (true) {
            if ((v42 /* !! */  = (cfr_temp_7 = mh.rl - mh.jhdw("jhss", jhfs(int ), (int)61)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v42 /* !! */  == mh.jhdw("jhst", jhdt(int ), (int)320)) break;
            v42 /* !! */  = (long)mh.jhdw("jhsu", jhdt(int ), (int)321);
        }
        var7_10 = var3_3 + (v40 - kq.height(kv.WEB, (float)var6_9)) * mh.jhdw("jhsv", jhib(int ), (int)322);
        if (var8_8 || var8_8) ** GOTO lbl29
        v43 /* !! */  = mh.rl;
        if (true) ** GOTO lbl173
        block82: while (true) {
            v43 /* !! */  = (long)(v44 - mh.jhdw("jhsw", jhfs(int ), (int)62));
lbl173:
            // 2 sources

            switch ((int)v43 /* !! */ ) {
                case -1225776778: {
                    break block82;
                }
                case -961843367: {
                    v44 = mh.jhdw("jhsx", jhfs(int ), (int)63);
                    continue block82;
                }
                case -697531690: {
                    v44 = mh.jhdw("jhsy", jhfs(int ), (int)64);
                    continue block82;
                }
                case 1576265641: {
                    v44 = mh.jhdw("jhsz", jhfs(int ), (int)65);
                    continue block82;
                }
            }
            break;
        }
        v45 = var2_2 + mh.jhdw("jhta", jhib(int ), (int)323);
        v46 = mh.jhdw("jhtb", jhdt(int ), (int)324);
        v47 = mh.jhdw("jhtc", jhdt(int ), (int)325);
        v48 = mh.jhdw("jhtd", jhdt(int ), (int)326);
        v49 = mh.jhdw("jhte", jhib(int ), (int)327) + var5_5 * mh.jhdw("jhtf", jhib(int ), (int)328);
        while (true) {
            if ((v50 /* !! */  = (cfr_temp_8 = mh.rl - mh.jhdw("jhtg", jhfs(int ), (int)66)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v50 /* !! */  == mh.jhdw("jhth", jhdt(int ), (int)329)) break;
            v50 /* !! */  = (long)mh.jhdw("jhti", jhdt(int ), (int)330);
        }
        v51 = v49 * this.intro;
        v52 /* !! */  = mh.rl;
        if (true) ** GOTO lbl200
        block84: while (true) {
            v52 /* !! */  = (long)(mh.jhdw("jhtk", jhfs(int ), (int)68) - mh.jhdw("jhtj", jhfs(int ), (int)67));
lbl200:
            // 2 sources

            switch ((int)v52 /* !! */ ) {
                case -2115884359: {
                    continue block84;
                }
                case -1225776778: {
                    break block84;
                }
            }
            break;
        }
        v53 = Math.round((float)v51);
        while (true) {
            if ((v54 /* !! */  = (cfr_temp_9 = mh.rl - mh.jhdw("jhtl", jhfs(int ), (int)69)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v54 /* !! */  == mh.jhdw("jhtm", jhdt(int ), (int)331)) break;
            v54 /* !! */  = (long)mh.jhdw("jhtn", jhdt(int ), (int)332);
        }
        v55 = nd.rgba((int)v46, (int)v47, (int)v48, v53);
        v56 /* !! */  = mh.rl;
        if (true) ** GOTO lbl216
        block86: while (true) {
            v56 /* !! */  = (long)(v57 - mh.jhdw("jhto", jhfs(int ), (int)70));
lbl216:
            // 2 sources

            switch ((int)v56 /* !! */ ) {
                case -1225776778: {
                    break block86;
                }
                case -1067618985: {
                    v57 = mh.jhdw("jhtp", jhfs(int ), (int)71);
                    continue block86;
                }
                case 1735069359: {
                    v57 = mh.jhdw("jhtq", jhfs(int ), (int)72);
                    continue block86;
                }
            }
            break;
        }
        mh.centered(var1_1, kv.WEB, var4_4, v45, var7_10, (float)var6_9, v55);
        if (!var8_8 && !var8_8) ** break;
        ** while (true)
        if (var9_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: {
                var9_7 /* !! */  = (int)mh.jhdw("jhtr", jhdt(int ), (int)333);
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl247
            }
lbl237:
            // 2 sources

            case 1: {
                var9_7 /* !! */  = (int)mh.jhdw("jhts", jhdt(int ), (int)334);
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl294
            }
            case 2: {
                var9_7 /* !! */  = (int)mh.jhdw("jhtt", jhdt(int ), (int)335);
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl247:
            // 3 sources

            case 3: {
                var9_7 /* !! */  = (int)mh.jhdw("jhtu", jhdt(int ), (int)336);
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl276
            }
lbl252:
            // 2 sources

            case 4: {
                var9_7 /* !! */  = (int)mh.jhdw("jhtv", jhdt(int ), (int)337);
                if (!var10_6) ** GOTO lbl247
                throw null;
            }
            case 5: {
                do {
                    var9_7 /* !! */  = (int)mh.jhdw("jhtw", jhdt(int ), (int)338);
                } while (!var10_6);
                throw null;
            }
lbl261:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_7 /* !! */  = (int)mh.jhdw("jhtx", jhdt(int ), (int)339);
                    if (var10_6) {
                        throw null;
                    }
                    ** GOTO lbl290
                    break;
                }
            }
            case 7: {
                var9_7 /* !! */  = (int)mh.jhdw("jhty", jhdt(int ), (int)340);
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl307
            }
lbl272:
            // 2 sources

            case 8: {
                var9_7 /* !! */  = (int)mh.jhdw("jhtz", jhdt(int ), (int)341);
                if (!var10_6) break;
                throw null;
            }
lbl276:
            // 3 sources

            case 9: {
                var9_7 /* !! */  = (int)mh.jhdw("jhua", jhdt(int ), (int)342);
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl294
            }
lbl281:
            // 2 sources

            case 10: {
                do {
                    var9_7 /* !! */  = (int)mh.jhdw("jhub", jhdt(int ), (int)343);
                } while (!var10_6);
                throw null;
            }
            case 11: {
                var9_7 /* !! */  = (int)mh.jhdw("jhuc", jhdt(int ), (int)344);
                if (!var10_6) ** GOTO lbl272
                throw null;
            }
lbl290:
            // 2 sources

            case 12: {
                var9_7 /* !! */  = (int)mh.jhdw("jhud", jhdt(int ), (int)345);
                if (!var10_6) ** GOTO lbl281
                throw null;
            }
lbl294:
            // 3 sources

            case 13: {
                var9_7 /* !! */  = (int)mh.jhdw("jhue", jhdt(int ), (int)346);
                if (!var10_6) ** GOTO lbl237
                throw null;
            }
            case 14: {
                var9_7 /* !! */  = (int)mh.jhdw("jhuf", jhdt(int ), (int)347);
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl307
            }
            case 15: {
                var9_7 /* !! */  = (int)mh.jhdw("jhug", jhdt(int ), (int)348);
                if (!var10_6) ** GOTO lbl252
                throw null;
            }
lbl307:
            // 3 sources

            case 16: {
                var9_7 /* !! */  = (int)mh.jhdw("jhuh", jhdt(int ), (int)349);
                if (!var10_6) ** GOTO lbl276
                throw null;
            }
            case 17: 
        }
        var9_7 /* !! */  = (int)mh.jhdw("jhui", jhdt(int ), (int)350);
        ** while (!var10_6)
lbl314:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void renderExitSlider(class_332 var1_1, float var2_2, float var3_3, float var4_4) {
        block138: {
            block137: {
                var18_5 = mh.c;
                var17_6 /* !! */  = mh.b;
                var16_7 = mh.a;
                if (var18_5) {
                    throw null;
lbl6:
                    // 35 sources

                    return;
                }
                if (var16_7 || var16_7) ** GOTO lbl6
                var5_8 = this.exitSliderHeight;
                if (var16_7 || var16_7) ** GOTO lbl6
                var6_9 = this.exitSliderWidth - var5_8;
                if (var16_7 || var16_7) ** GOTO lbl6
                if (!this.exitSliderDragging) break block137;
                if (var16_7 || var16_7) ** GOTO lbl6
                this.exitSliderProgress = mh.clamp((var2_2 - this.exitSliderX - var5_8 * mh.jhdw("jhuj", jhib(int ), (int)351)) / var6_9, 0.0f, 1.0f);
                if (var16_7) ** GOTO lbl6
                if (var18_5) {
                    throw null;
                }
                break block138;
            }
            if (var16_7 || var16_7) ** GOTO lbl6
            this.exitSliderProgress += (0.0f - this.exitSliderProgress) * Math.min(1.0f, var4_4 * mh.jhdw("jhuk", jhib(int ), (int)352));
            if (var16_7) ** GOTO lbl6
        }
        if (var16_7 || var16_7) ** GOTO lbl6
        if (this.exitSliderDragging) {
            v0 = mh.jhdw("jhul", jhib(int ), (int)353);
            if (var18_5) {
                throw null;
            }
        } else {
            v0 = mh.jhdw("jhum", jhib(int ), (int)354);
        }
        this.exitSliderVisualProgress += (this.exitSliderProgress - this.exitSliderVisualProgress) * Math.min(1.0f, var4_4 * v0);
        if (var16_7 || var16_7) ** GOTO lbl6
        var7_10 = this.exitSliderX + var6_9 * this.exitSliderVisualProgress;
        if (var16_7 || var16_7) ** GOTO lbl6
        var8_11 = mh.contains(var2_2, var3_3, var7_10, this.exitSliderY, var5_8, var5_8);
        if (var17_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var17_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var16_7 || var16_7) ** GOTO lbl6
                if (var8_11) ** GOTO lbl45
                if (var16_7) ** GOTO lbl6
                if (!this.exitSliderDragging) ** GOTO lbl50
                if (var16_7) ** GOTO lbl6
lbl45:
                // 2 sources

                if (var16_7 || var16_7) ** GOTO lbl6
                v1 = 1.0f;
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl52
lbl50:
                // 1 sources

                if (var16_7 || var16_7) ** GOTO lbl6
                v1 = var9_12 = 0.0f;
lbl52:
                // 2 sources

                if (var16_7 || var16_7) ** GOTO lbl6
                this.exitSliderHover += (var9_12 - this.exitSliderHover) * Math.min(1.0f, var4_4 * mh.jhdw("jhun", jhib(int ), (int)355));
                if (var16_7 || var16_7) ** GOTO lbl6
                ki.blur(var1_1, this.exitSliderX, this.exitSliderY, this.exitSliderWidth, this.exitSliderHeight, (float)mh.jhdw("jhuo", jhib(int ), (int)356), (float)mh.jhdw("jhup", jhib(int ), (int)357), (boolean)mh.jhdw("jhuq", jhdt(int ), (int)358));
                if (var16_7 || var16_7) ** GOTO lbl6
                var10_13 = Math.round((float)((mh.jhdw("jhur", jhib(int ), (int)359) + this.exitSliderHover * mh.jhdw("jhus", jhib(int ), (int)360)) * this.intro));
                if (var16_7 || var16_7) ** GOTO lbl6
                ki.rect(var1_1, this.exitSliderX, this.exitSliderY, this.exitSliderWidth, this.exitSliderHeight, (float)mh.jhdw("jhut", jhib(int ), (int)361), nd.rgba((int)mh.jhdw("jhuu", jhdt(int ), (int)362), (int)mh.jhdw("jhuv", jhdt(int ), (int)363), (int)mh.jhdw("jhuw", jhdt(int ), (int)364), var10_13), (boolean)mh.jhdw("jhux", jhdt(int ), (int)365));
                if (var16_7 || var16_7) ** GOTO lbl6
                ki.outline(var1_1, this.exitSliderX, this.exitSliderY, this.exitSliderWidth, this.exitSliderHeight, (float)mh.jhdw("jhuy", jhib(int ), (int)366), (float)mh.jhdw("jhuz", jhib(int ), (int)367), nd.multAlpha(mh.ACCENT, this.intro * (mh.jhdw("jhva", jhib(int ), (int)368) + this.exitSliderHover * mh.jhdw("jhvb", jhib(int ), (int)369))), (boolean)mh.jhdw("jhvc", jhdt(int ), (int)370));
                if (var16_7 || var16_7) ** GOTO lbl6
                if (!(this.exitSliderVisualProgress > mh.jhdw("jhvd", jhib(int ), (int)371))) ** GOTO lbl67
                if (var16_7 || var16_7) ** GOTO lbl6
                ki.rect(var1_1, this.exitSliderX + 1.0f, this.exitSliderY + 1.0f, var5_8 * mh.jhdw("jhve", jhib(int ), (int)372) + var6_9 * this.exitSliderVisualProgress, this.exitSliderHeight - 2.0f, (float)mh.jhdw("jhvf", jhib(int ), (int)373), nd.multAlpha(mh.ACCENT, this.exitSliderVisualProgress * this.intro * mh.jhdw("jhvg", jhib(int ), (int)374)), (boolean)mh.jhdw("jhvh", jhdt(int ), (int)375));
                if (var16_7) ** GOTO lbl6
lbl67:
                // 2 sources

                if (var16_7 || var16_7) ** GOTO lbl6
                var11_14 = mh.jhdw("jhvi", jhib(int ), (int)376);
                if (var16_7 || var16_7) ** GOTO lbl6
                var12_15 = this.exitSliderX + var5_8 + (this.exitSliderWidth - var5_8) * mh.jhdw("jhvj", jhib(int ), (int)377);
                if (var16_7 || var16_7) ** GOTO lbl6
                mh.centered(var1_1, kv.BOLD, "Slide to exit", var12_15, this.exitSliderY + mh.jhdw("jhvk", jhib(int ), (int)378), (float)var11_14, nd.rgba((int)mh.jhdw("jhvl", jhdt(int ), (int)379), (int)mh.jhdw("jhvm", jhdt(int ), (int)380), (int)mh.jhdw("jhvn", jhdt(int ), (int)381), Math.round((float)((mh.jhdw("jhvo", jhib(int ), (int)382) + this.exitSliderVisualProgress * mh.jhdw("jhvp", jhib(int ), (int)383)) * this.intro))));
                if (var16_7 || var16_7) ** GOTO lbl6
                var13_16 = this.exitSliderY - this.exitSliderHover * mh.jhdw("jhvq", jhib(int ), (int)384);
                if (var16_7 || var16_7) ** GOTO lbl6
                ki.rect(var1_1, var7_10, var13_16, var5_8, var5_8, (float)mh.jhdw("jhvr", jhib(int ), (int)385), nd.rgba((int)mh.jhdw("jhvs", jhdt(int ), (int)386), (int)mh.jhdw("jhvt", jhdt(int ), (int)387), (int)mh.jhdw("jhvu", jhdt(int ), (int)388), Math.round((float)((mh.jhdw("jhvv", jhib(int ), (int)389) + this.exitSliderHover * mh.jhdw("jhvw", jhib(int ), (int)390)) * this.intro))), (boolean)mh.jhdw("jhvx", jhdt(int ), (int)391));
                if (var16_7 || var16_7) ** GOTO lbl6
                ki.outline(var1_1, var7_10, var13_16, var5_8, var5_8, (float)mh.jhdw("jhvy", jhib(int ), (int)392), (float)mh.jhdw("jhvz", jhib(int ), (int)393), nd.multAlpha(mh.ACCENT, this.intro * (mh.jhdw("jhwa", jhib(int ), (int)394) + this.exitSliderHover * mh.jhdw("jhwb", jhib(int ), (int)395))), (boolean)mh.jhdw("jhwc", jhdt(int ), (int)396));
                if (var16_7 || var16_7) ** GOTO lbl6
                if (kv.ICONS == null) ** GOTO lbl88
                if (var16_7 || var16_7) ** GOTO lbl6
                var14_17 = mh.jhdw("jhwd", jhib(int ), (int)397);
                if (var16_7 || var16_7) ** GOTO lbl6
                var15_18 = var13_16 + (var5_8 - kq.height(kv.ICONS, (float)var14_17)) * mh.jhdw("jhwe", jhib(int ), (int)398);
                if (var16_7 || var16_7) ** GOTO lbl6
                mh.centered(var1_1, kv.ICONS, "F", var7_10 + var5_8 * mh.jhdw("jhwf", jhib(int ), (int)399), var15_18, (float)var14_17, nd.multAlpha(mh.ACCENT, this.intro * (mh.jhdw("jhwg", jhib(int ), (int)400) + this.exitSliderHover * mh.jhdw("jhwh", jhib(int ), (int)401))));
                if (var16_7) ** GOTO lbl6
lbl88:
                // 2 sources

                if (!var16_7 && !var16_7) ** break;
                ** continue;
                return;
            }
lbl91:
            // 2 sources

            case 0: {
                var17_6 /* !! */  = (int)mh.jhdw("jhwi", jhdt(int ), (int)402);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl331
            }
            case 1: {
                var17_6 /* !! */  = (int)mh.jhdw("jhwj", jhdt(int ), (int)403);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl101:
            // 2 sources

            case 2: {
                var17_6 /* !! */  = (int)mh.jhdw("jhwk", jhdt(int ), (int)404);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl372
            }
lbl106:
            // 4 sources

            case 3: {
                var17_6 /* !! */  = (int)mh.jhdw("jhwl", jhdt(int ), (int)405);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl121
            }
            case 4: {
                var17_6 /* !! */  = (int)mh.jhdw("jhwm", jhdt(int ), (int)406);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 5: {
                var17_6 /* !! */  = (int)mh.jhdw("jhwn", jhdt(int ), (int)407);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl343
            }
lbl121:
            // 2 sources

            case 6: {
                var17_6 /* !! */  = (int)mh.jhdw("jhwo", jhdt(int ), (int)408);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl327
            }
lbl126:
            // 2 sources

            case 7: {
                var17_6 /* !! */  = (int)mh.jhdw("jhwp", jhdt(int ), (int)409);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl131:
            // 3 sources

            case 8: {
                var17_6 /* !! */  = (int)mh.jhdw("jhwq", jhdt(int ), (int)410);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 9: {
                var17_6 /* !! */  = (int)mh.jhdw("jhwr", jhdt(int ), (int)411);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl376
            }
lbl141:
            // 2 sources

            case 10: {
                var17_6 /* !! */  = (int)mh.jhdw("jhws", jhdt(int ), (int)412);
                if (!var18_5) ** GOTO lbl101
                throw null;
            }
lbl145:
            // 2 sources

            case 11: {
                var17_6 /* !! */  = (int)mh.jhdw("jhwt", jhdt(int ), (int)413);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 12: {
                var17_6 /* !! */  = (int)mh.jhdw("jhwu", jhdt(int ), (int)414);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl313
            }
lbl155:
            // 3 sources

            case 13: {
                var17_6 /* !! */  = (int)mh.jhdw("jhwv", jhdt(int ), (int)415);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 14: {
                var17_6 /* !! */  = (int)mh.jhdw("jhww", jhdt(int ), (int)416);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl165:
            // 2 sources

            case 15: {
                var17_6 /* !! */  = (int)mh.jhdw("jhwx", jhdt(int ), (int)417);
                if (!var18_5) ** GOTO lbl106
                throw null;
            }
            case 16: {
                var17_6 /* !! */  = (int)mh.jhdw("jhwy", jhdt(int ), (int)418);
                if (!var18_5) ** GOTO lbl126
                throw null;
            }
lbl173:
            // 3 sources

            case 17: {
                var17_6 /* !! */  = (int)mh.jhdw("jhwz", jhdt(int ), (int)419);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl364
            }
lbl178:
            // 3 sources

            case 18: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxa", jhdt(int ), (int)420);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl368
            }
            case 19: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxb", jhdt(int ), (int)421);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl215
            }
            case 20: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxc", jhdt(int ), (int)422);
                if (!var18_5) ** GOTO lbl131
                throw null;
            }
            case 21: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxd", jhdt(int ), (int)423);
                if (!var18_5) ** GOTO lbl91
                throw null;
            }
            case 22: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxe", jhdt(int ), (int)424);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl201:
            // 2 sources

            case 23: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxf", jhdt(int ), (int)425);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl274
            }
lbl206:
            // 3 sources

            case 24: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxg", jhdt(int ), (int)426);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl322
            }
            case 25: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxh", jhdt(int ), (int)427);
                if (!var18_5) ** GOTO lbl201
                throw null;
            }
lbl215:
            // 3 sources

            case 26: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxi", jhdt(int ), (int)428);
                if (!var18_5) ** GOTO lbl165
                throw null;
            }
lbl219:
            // 4 sources

            case 27: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxj", jhdt(int ), (int)429);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl224:
            // 2 sources

            case 28: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxk", jhdt(int ), (int)430);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl313
            }
            case 29: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxl", jhdt(int ), (int)431);
                if (!var18_5) ** GOTO lbl106
                throw null;
            }
lbl233:
            // 2 sources

            case 30: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxm", jhdt(int ), (int)432);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl247
            }
lbl238:
            // 2 sources

            case 31: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxn", jhdt(int ), (int)433);
                if (!var18_5) ** GOTO lbl233
                throw null;
            }
lbl242:
            // 2 sources

            case 32: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxo", jhdt(int ), (int)434);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl247:
            // 3 sources

            case 33: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxp", jhdt(int ), (int)435);
                if (!var18_5) ** GOTO lbl106
                throw null;
            }
lbl251:
            // 2 sources

            case 34: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxq", jhdt(int ), (int)436);
                if (!var18_5) ** GOTO lbl206
                throw null;
            }
lbl255:
            // 2 sources

            case 35: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxr", jhdt(int ), (int)437);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl364
            }
            case 36: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var17_6 /* !! */  = (int)mh.jhdw("jhxs", jhdt(int ), (int)438);
                    if (var18_5) {
                        throw null;
                    }
                    ** GOTO lbl287
                    break;
                }
            }
            case 37: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxt", jhdt(int ), (int)439);
                if (!var18_5) ** GOTO lbl131
                throw null;
            }
lbl270:
            // 3 sources

            case 38: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxu", jhdt(int ), (int)440);
                if (!var18_5) ** GOTO lbl145
                throw null;
            }
lbl274:
            // 2 sources

            case 39: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxv", jhdt(int ), (int)441);
                if (!var18_5) ** GOTO lbl215
                throw null;
            }
            case 40: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxw", jhdt(int ), (int)442);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl318
            }
lbl283:
            // 2 sources

            case 41: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxx", jhdt(int ), (int)443);
                if (!var18_5) ** GOTO lbl270
                throw null;
            }
lbl287:
            // 4 sources

            case 42: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxy", jhdt(int ), (int)444);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl372
            }
lbl292:
            // 2 sources

            case 43: {
                var17_6 /* !! */  = (int)mh.jhdw("jhxz", jhdt(int ), (int)445);
                if (!var18_5) ** GOTO lbl242
                throw null;
            }
            case 44: {
                var17_6 /* !! */  = (int)mh.jhdw("jhya", jhdt(int ), (int)446);
                if (!var18_5) ** GOTO lbl141
                throw null;
            }
            case 45: {
                var17_6 /* !! */  = (int)mh.jhdw("jhyb", jhdt(int ), (int)447);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl322
            }
lbl305:
            // 2 sources

            case 46: {
                var17_6 /* !! */  = (int)mh.jhdw("jhyc", jhdt(int ), (int)448);
                if (!var18_5) ** GOTO lbl255
                throw null;
            }
lbl309:
            // 2 sources

            case 47: {
                var17_6 /* !! */  = (int)mh.jhdw("jhyd", jhdt(int ), (int)449);
                if (!var18_5) ** GOTO lbl305
                throw null;
            }
lbl313:
            // 4 sources

            case 48: {
                var17_6 /* !! */  = (int)mh.jhdw("jhyf", jhdt(int ), (int)450);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl339
            }
lbl318:
            // 2 sources

            case 49: {
                var17_6 /* !! */  = (int)mh.jhdw("jhyh", jhdt(int ), (int)451);
                if (var18_5) {
                    throw null;
                }
            }
lbl322:
            // 5 sources

            case 50: {
                var17_6 /* !! */  = (int)mh.jhdw("jhyk", jhdt(int ), (int)452);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl380
            }
lbl327:
            // 2 sources

            case 51: {
                var17_6 /* !! */  = (int)mh.jhdw("jhyn", jhdt(int ), (int)453);
                if (!var18_5) ** GOTO lbl238
                throw null;
            }
lbl331:
            // 3 sources

            case 52: {
                var17_6 /* !! */  = (int)mh.jhdw("jhyq", jhdt(int ), (int)454);
                if (!var18_5) ** GOTO lbl292
                throw null;
            }
            case 53: {
                var17_6 /* !! */  = (int)mh.jhdw("jhyt", jhdt(int ), (int)455);
                if (!var18_5) ** GOTO lbl206
                throw null;
            }
lbl339:
            // 3 sources

            case 54: {
                var17_6 /* !! */  = (int)mh.jhdw("jhyw", jhdt(int ), (int)456);
                if (!var18_5) ** GOTO lbl155
                throw null;
            }
lbl343:
            // 2 sources

            case 55: {
                var17_6 /* !! */  = (int)mh.jhdw("jhza", jhdt(int ), (int)457);
                if (var18_5) {
                    throw null;
                }
                ** GOTO lbl364
            }
            case 56: {
                var17_6 /* !! */  = (int)mh.jhdw("jhze", jhdt(int ), (int)458);
                if (!var18_5) ** GOTO lbl270
                throw null;
            }
            case 57: {
                var17_6 /* !! */  = (int)mh.jhdw("jhzg", jhdt(int ), (int)459);
                if (!var18_5) ** GOTO lbl339
                throw null;
            }
lbl356:
            // 2 sources

            case 58: {
                var17_6 /* !! */  = (int)mh.jhdw("jhzh", jhdt(int ), (int)460);
                if (!var18_5) ** GOTO lbl331
                throw null;
            }
            case 59: {
                var17_6 /* !! */  = (int)mh.jhdw("jhzi", jhdt(int ), (int)461);
                if (!var18_5) ** GOTO lbl173
                throw null;
            }
lbl364:
            // 4 sources

            case 60: {
                var17_6 /* !! */  = (int)mh.jhdw("jhzj", jhdt(int ), (int)462);
                if (!var18_5) ** GOTO lbl313
                throw null;
            }
lbl368:
            // 2 sources

            case 61: {
                var17_6 /* !! */  = (int)mh.jhdw("jhzk", jhdt(int ), (int)463);
                if (!var18_5) ** GOTO lbl247
                throw null;
            }
lbl372:
            // 3 sources

            case 62: {
                var17_6 /* !! */  = (int)mh.jhdw("jhzl", jhdt(int ), (int)464);
                if (!var18_5) ** GOTO lbl356
                throw null;
            }
lbl376:
            // 2 sources

            case 63: {
                var17_6 /* !! */  = (int)mh.jhdw("jhzm", jhdt(int ), (int)465);
                if (!var18_5) ** GOTO lbl224
                throw null;
            }
lbl380:
            // 2 sources

            case 64: {
                var17_6 /* !! */  = (int)mh.jhdw("jhzn", jhdt(int ), (int)466);
                if (!var18_5) ** GOTO lbl283
                throw null;
            }
            case 65: {
                var17_6 /* !! */  = (int)mh.jhdw("jhzo", jhdt(int ), (int)467);
                if (!var18_5) ** GOTO lbl155
                throw null;
            }
            case 66: 
        }
        var17_6 /* !! */  = (int)mh.jhdw("jhzp", jhdt(int ), (int)468);
        ** while (!var18_5)
lbl391:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jjfj() {
        mh.jhfu[200] = -4976537905144250008L;
        mh.jhfu[201] = -2764772364656217893L;
        mh.jhfu[202] = 6711391969244023943L;
        mh.jhfu[203] = 5570604797423732008L;
        mh.jhfu[204] = 5514432599916668075L;
        mh.jhfu[205] = -3814874935885040243L;
        mh.jhfu[206] = 7678402676429060593L;
        mh.jhfu[207] = 1835564799213590737L;
        mh.jhfu[208] = -648625250009211699L;
        mh.jhfu[209] = 7936754827821443183L;
        mh.jhfu[210] = -8015181901378801080L;
        mh.jhfu[211] = 7355138250657946938L;
        mh.jhfu[212] = 2346004907636092374L;
        mh.jhfu[213] = 5766788534557476754L;
        mh.jhfu[214] = 5580791441626593002L;
        mh.jhfu[215] = -4281515909763721940L;
        mh.jhfu[216] = -271024792571276601L;
        mh.jhfu[217] = -3819363344404402361L;
        mh.jhfu[218] = 5694724108876703807L;
        mh.jhfu[219] = 7933092627219521462L;
        mh.jhfu[220] = -8449030964603914634L;
        mh.jhfu[221] = 8942850973111507760L;
        mh.jhfu[222] = 207826000885665851L;
        mh.jhfu[223] = -3823011440716896876L;
        mh.jhfu[224] = 4871008619013191776L;
        mh.jhfu[225] = 7128402567830631480L;
        mh.jhfu[226] = 7830068489169536955L;
        mh.jhfu[227] = 3061873966597100257L;
        mh.jhfu[228] = -4052864078480863969L;
        mh.jhfu[229] = -668851836859280888L;
        mh.jhfu[230] = 5173344628625357660L;
        mh.jhfu[231] = 4026902759440917937L;
        mh.jhfu[232] = 3500923676939368520L;
        mh.jhfu[233] = 6458116433628647343L;
        mh.jhfu[234] = -8241979166165329247L;
        mh.jhfu[235] = -3829584636999310155L;
        mh.jhfu[236] = 530913405390956664L;
        mh.jhfu[237] = -8137795478949018142L;
        mh.jhfu[238] = -2040651234490407748L;
        mh.jhfu[239] = -1166426999383402316L;
    }

    private static /* synthetic */ void jjeu() {
        mh.jhdu[800] = -794565802;
        mh.jhdu[801] = -406747672;
        mh.jhdu[802] = -1448195156;
        mh.jhdu[803] = -2030867265;
        mh.jhdu[804] = -845524882;
        mh.jhdu[805] = -1774289878;
        mh.jhdu[806] = -1650067989;
        mh.jhdu[807] = -1689294343;
        mh.jhdu[808] = -2063001981;
        mh.jhdu[809] = -32101928;
        mh.jhdu[810] = -932510796;
        mh.jhdu[811] = 510971864;
        mh.jhdu[812] = -1216552086;
        mh.jhdu[813] = -1681585197;
        mh.jhdu[814] = -2106691071;
        mh.jhdu[815] = 1327963684;
        mh.jhdu[816] = 1581323203;
        mh.jhdu[817] = 204587069;
        mh.jhdu[818] = 2059509211;
        mh.jhdu[819] = -2035174427;
        mh.jhdu[820] = -780695132;
        mh.jhdu[821] = -381816034;
        mh.jhdu[822] = -2034342222;
        mh.jhdu[823] = 1026002390;
        mh.jhdu[824] = 1660479222;
        mh.jhdu[825] = 1421573753;
        mh.jhdu[826] = -1010110016;
        mh.jhdu[827] = 915595498;
        mh.jhdu[828] = 313995206;
        mh.jhdu[829] = 613509234;
        mh.jhdu[830] = 1605152682;
        mh.jhdu[831] = -475436091;
        mh.jhdu[832] = 75045910;
        mh.jhdu[833] = 1466154120;
        mh.jhdu[834] = -1124825865;
        mh.jhdu[835] = 1418957779;
        mh.jhdu[836] = 258249752;
        mh.jhdu[837] = -1496551874;
        mh.jhdu[838] = 1565016065;
        mh.jhdu[839] = 782343000;
        mh.jhdu[840] = -231528774;
        mh.jhdu[841] = -1839022434;
        mh.jhdu[842] = -1863598014;
        mh.jhdu[843] = -139752086;
        mh.jhdu[844] = 1129542296;
        mh.jhdu[845] = -1330525897;
        mh.jhdu[846] = -1808898687;
        mh.jhdu[847] = -1601328613;
        mh.jhdu[848] = 921096922;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean method_25406(class_11909 var1_1) {
        block97: {
            block98: {
                v0 /* !! */  = mh.rl;
                if (true) ** GOTO lbl5
                block57: while (true) {
                    v0 /* !! */  = (long)(v1 - mh.jhdw("jipl", jhfs(int ), (int)123));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1340043033: {
                            v1 = mh.jhdw("jipn", jhfs(int ), (int)124);
                            continue block57;
                        }
                        case -1225776778: {
                            break block57;
                        }
                        case 1564927809: {
                            v1 = mh.jhdw("jipp", jhfs(int ), (int)125);
                            continue block57;
                        }
                    }
                    break;
                }
                var4_2 = mh.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = mh.rl - mh.jhdw("jipr", jhfs(int ), (int)126)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == mh.jhdw("jips", jhdt(int ), (int)608)) break;
                    v2 /* !! */  = (long)mh.jhdw("jipt", jhdt(int ), (int)609);
                }
                var3_3 /* !! */  = mh.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = mh.rl - mh.jhdw("jipu", jhfs(int ), (int)127)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == mh.jhdw("jipv", jhdt(int ), (int)610)) {
                        var2_4 = mh.a;
                        if (var4_2) {
                            throw null;
                        }
                        break;
                    }
                    v3 /* !! */  = (long)mh.jhdw("jipw", jhdt(int ), (int)611);
                }
                if (var2_4 != false) return (boolean)mh.jhdw("jipx", jhdt(int ), (int)612);
                if (var2_4 != false) return (boolean)mh.jhdw("jipx", jhdt(int ), (int)612);
                v4 /* !! */  = mh.rl;
                block60: while (true) {
                    switch ((int)v4 /* !! */ ) {
                        case -1225776778: {
                            break block60;
                        }
                        case -770417782: {
                            v4 /* !! */  = (long)(mh.jhdw("jiqc", jhfs(int ), (int)129) - mh.jhdw("jiqa", jhfs(int ), (int)128));
                            continue block60;
                        }
                    }
                    break;
                }
                if (!this.exitSliderDragging) break block98;
                if (var2_4 != false) return (boolean)mh.jhdw("jipx", jhdt(int ), (int)612);
                v5 /* !! */  = mh.rl;
                if (true) ** GOTO lbl46
                block61: while (true) {
                    v5 /* !! */  = (long)(v6 - mh.jhdw("jiqf", jhfs(int ), (int)130));
lbl46:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1225776778: {
                            break block61;
                        }
                        case -1072838356: {
                            v6 = mh.jhdw("jiqi", jhfs(int ), (int)131);
                            continue block61;
                        }
                        case 683382171: {
                            v6 = mh.jhdw("jiqj", jhfs(int ), (int)132);
                            continue block61;
                        }
                        case 1970264792: {
                            v6 = mh.jhdw("jiqk", jhfs(int ), (int)133);
                            continue block61;
                        }
                    }
                    break;
                }
                if (var1_1.method_74245() != 0) break block98;
                if (var2_4 != false) return (boolean)mh.jhdw("jipx", jhdt(int ), (int)612);
                if (var2_4 != false) return (boolean)mh.jhdw("jipx", jhdt(int ), (int)612);
                v7 = mh.jhdw("jiqn", jhdt(int ), (int)613);
                v8 /* !! */  = mh.rl;
                if (true) ** GOTO lbl70
            }
            if (var2_4 != false) return (boolean)mh.jhdw("jipx", jhdt(int ), (int)612);
            if (var2_4 != false) return (boolean)mh.jhdw("jipx", jhdt(int ), (int)612);
            ** GOTO lbl227
            block62: while (true) {
                v8 /* !! */  = (long)(v9 - mh.jhdw("jiqo", jhfs(int ), (int)134));
lbl70:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -1225776778: {
                        break block62;
                    }
                    case -767210922: {
                        v9 = mh.jhdw("jiqq", jhfs(int ), (int)135);
                        continue block62;
                    }
                    case 1010464814: {
                        v9 = mh.jhdw("jiqs", jhfs(int ), (int)136);
                        continue block62;
                    }
                }
                break;
            }
            this.exitSliderDragging = v7;
            if (var2_4 != false) return (boolean)mh.jhdw("jipx", jhdt(int ), (int)612);
            if (var2_4 != false) return (boolean)mh.jhdw("jipx", jhdt(int ), (int)612);
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            while (true) {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v10 /* !! */  = mh.rl;
                        block64: while (true) {
                            switch ((int)v10 /* !! */ ) {
                                case -1225776778: {
                                    break block64;
                                }
                                case 1070697814: {
                                    v11 = mh.jhdw("jiqx", jhfs(int ), (int)138);
                                    ** GOTO lbl100
                                }
                                case 1413381724: {
                                    v11 = mh.jhdw("jiqy", jhfs(int ), (int)139);
                                    ** GOTO lbl100
                                }
                                case 1497994654: {
                                    v11 = mh.jhdw("jira", jhfs(int ), (int)140);
lbl100:
                                    // 3 sources

                                    v10 /* !! */  = (long)(v11 - mh.jhdw("jiqv", jhfs(int ), (int)137));
                                    continue block64;
                                }
                            }
                            break;
                        }
                        if (!(this.exitSliderProgress >= mh.jhdw("jirc", jhib(int ), (int)614))) ** GOTO lbl116
                        if (var2_4 != false) return (boolean)mh.jhdw("jipx", jhdt(int ), (int)612);
                        while (true) {
                            if ((v12 /* !! */  = (cfr_temp_3 = mh.rl - mh.jhdw("jirf", jhfs(int ), (int)141)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v12 /* !! */  != mh.jhdw("jirh", jhdt(int ), (int)615)) ** GOTO lbl110
                            if (this.field_22787 != null) {
                                break;
                            }
                            ** GOTO lbl116
lbl110:
                            // 1 sources

                            v12 /* !! */  = (long)mh.jhdw("jirj", jhdt(int ), (int)616);
                        }
                        if (var2_4 != false) return (boolean)mh.jhdw("jipx", jhdt(int ), (int)612);
                        if (var2_4 != false) return (boolean)mh.jhdw("jipx", jhdt(int ), (int)612);
                        v13 /* !! */  = mh.rl;
                        ** GOTO lbl211
lbl116:
                        // 2 sources

                        if (var2_4 != false) return (boolean)mh.jhdw("jipx", jhdt(int ), (int)612);
                        if (var2_4 != false) return (boolean)mh.jhdw("jipx", jhdt(int ), (int)612);
                        v14 /* !! */  = mh.rl;
                        block66: while (true) {
                            switch ((int)v14 /* !! */ ) {
                                case -1225776778: {
                                    break block66;
                                }
                                case -789289865: {
                                    v14 /* !! */  = (long)(mh.jhdw("jirt", jhfs(int ), (int)146) - mh.jhdw("jirs", jhfs(int ), (int)145));
                                    continue block66;
                                }
                            }
                            break;
                        }
                        this.exitSliderProgress = 0.0f;
                        if (var2_4 != false) return (boolean)mh.jhdw("jipx", jhdt(int ), (int)612);
                        while (true) {
                            if (var2_4 != false) return (boolean)mh.jhdw("jipx", jhdt(int ), (int)612);
                            if (var2_4 != false) return (boolean)mh.jhdw("jipx", jhdt(int ), (int)612);
                            return (boolean)mh.jhdw("jiru", jhdt(int ), (int)619);
                        }
                    }
                    case 0: {
                        var3_3 /* !! */  = (int)mh.jhdw("jirz", jhdt(int ), (int)622);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 1: {
                        ** GOTO lbl190
                    }
                    case 4: {
                        var3_3 /* !! */  = (int)mh.jhdw("jise", jhdt(int ), (int)626);
                        cfr_temp_0 = 5;
                        if (var4_2) {
                            throw null;
                        }
                        break block97;
                    }
                    case 7: {
                        var3_3 /* !! */  = (int)mh.jhdw("jisi", jhdt(int ), (int)629);
                        cfr_temp_0 = 5;
                        if (var4_2) {
                            throw null;
                        }
                        break block97;
                    }
                    case 8: {
                        var3_3 /* !! */  = (int)mh.jhdw("jisj", jhdt(int ), (int)630);
                        cfr_temp_0 = 15;
                        if (var4_2) {
                            throw null;
                        }
                        break block97;
                    }
                    case 9: {
                        var3_3 /* !! */  = (int)mh.jhdw("jisl", jhdt(int ), (int)631);
                        cfr_temp_0 = 15;
                        if (var4_2) {
                            throw null;
                        }
                        break block97;
                    }
                    case 10: {
                        var3_3 /* !! */  = (int)mh.jhdw("jism", jhdt(int ), (int)632);
                        cfr_temp_0 = 2;
                        if (var4_2) {
                            throw null;
                        }
                        break block97;
                    }
                    case 12: {
                        var3_3 /* !! */  = (int)mh.jhdw("jiso", jhdt(int ), (int)634);
                        cfr_temp_0 = 6;
                        if (var4_2) {
                            throw null;
                        }
                        break block97;
                    }
                    case 14: {
                        var3_3 /* !! */  = (int)mh.jhdw("jisq", jhdt(int ), (int)636);
                        cfr_temp_0 = 15;
                        if (var4_2) {
                            throw null;
                        }
                        break block97;
                    }
                    case 17: {
                        var3_3 /* !! */  = (int)mh.jhdw("jisu", jhdt(int ), (int)639);
                        cfr_temp_0 = 13;
                        if (var4_2) {
                            throw null;
                        }
                        break block97;
                    }
                    case 20: {
                        var3_3 /* !! */  = (int)mh.jhdw("jisy", jhdt(int ), (int)642);
                        if (var4_2) {
                            throw null;
                        }
lbl190:
                        // 3 sources

                        var3_3 /* !! */  = (int)mh.jhdw("jisb", jhdt(int ), (int)623);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)mh.jhdw("jisc", jhdt(int ), (int)624);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 19: {
                        var3_3 /* !! */  = (int)mh.jhdw("jisx", jhdt(int ), (int)641);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 18: {
                        var3_3 /* !! */  = (int)mh.jhdw("jisw", jhdt(int ), (int)640);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 13: {
                        var3_3 /* !! */  = (int)mh.jhdw("jisp", jhdt(int ), (int)635);
                        cfr_temp_0 = 6;
                        if (var4_2) {
                            throw null;
                        }
                        break block97;
                    }
lbl211:
                    // 1 sources

                    block68: while (true) {
                        switch ((int)v13 /* !! */ ) {
                            case -1225776778: {
                                break block68;
                            }
                            case 1033138031: {
                                v13 /* !! */  = (long)(mh.jhdw("jirn", jhfs(int ), (int)143) - mh.jhdw("jirm", jhfs(int ), (int)142));
                                continue block68;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v15 /* !! */  = (cfr_temp_4 = mh.rl - mh.jhdw("jiro", jhfs(int ), (int)144)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v15 /* !! */  == mh.jhdw("jirq", jhdt(int ), (int)617)) {
                            this.field_22787.method_1592();
                            if (var2_4 != false) return (boolean)mh.jhdw("jipx", jhdt(int ), (int)612);
                            if (!var4_2) ** continue;
                            throw null;
                        }
                        v15 /* !! */  = (long)mh.jhdw("jirr", jhdt(int ), (int)618);
                    }
lbl227:
                    // 1 sources

                    while (true) {
                        if ((v16 /* !! */  = (cfr_temp_5 = mh.rl - mh.jhdw("jirv", jhfs(int ), (int)147)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v16 /* !! */  == mh.jhdw("jirx", jhdt(int ), (int)620)) {
                            return super.method_25406(var1_1);
                        }
                        v16 /* !! */  = (long)mh.jhdw("jiry", jhdt(int ), (int)621);
                    }
                    case 3: {
                        var3_3 /* !! */  = (int)mh.jhdw("jisd", jhdt(int ), (int)625);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 5: {
                        var3_3 /* !! */  = (int)mh.jhdw("jisf", jhdt(int ), (int)627);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 15: {
                        var3_3 /* !! */  = (int)mh.jhdw("jisr", jhdt(int ), (int)637);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 16: {
                        var3_3 /* !! */  = (int)mh.jhdw("jiss", jhdt(int ), (int)638);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 11: {
                        var3_3 /* !! */  = (int)mh.jhdw("jisn", jhdt(int ), (int)633);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 6: 
                }
                break;
            }
            ** GOTO lbl258
        }
        do {
            if (true) ** continue;
lbl258:
            // 2 sources

            var3_3 /* !! */  = (int)mh.jhdw("jish", jhdt(int ), (int)628);
            cfr_temp_0 = 3;
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void jjes() {
        mh.jhdu[600] = 1597208693;
        mh.jhdu[601] = -1573597918;
        mh.jhdu[602] = 1699487674;
        mh.jhdu[603] = 375271827;
        mh.jhdu[604] = -1276899391;
        mh.jhdu[605] = -629138957;
        mh.jhdu[606] = -721573912;
        mh.jhdu[607] = -1172224890;
        mh.jhdu[608] = 626789736;
        mh.jhdu[609] = -1554577515;
        mh.jhdu[610] = -1703365300;
        mh.jhdu[611] = -435283291;
        mh.jhdu[612] = 297368564;
        mh.jhdu[613] = -907661782;
        mh.jhdu[614] = -392053463;
        mh.jhdu[615] = 660963110;
        mh.jhdu[616] = -1212616174;
        mh.jhdu[617] = -828779372;
        mh.jhdu[618] = 1808525408;
        mh.jhdu[619] = 1372132815;
        mh.jhdu[620] = -146002125;
        mh.jhdu[621] = -638329258;
        mh.jhdu[622] = -449335721;
        mh.jhdu[623] = 2000715286;
        mh.jhdu[624] = 589326232;
        mh.jhdu[625] = -1198380249;
        mh.jhdu[626] = -158289427;
        mh.jhdu[627] = 2142903273;
        mh.jhdu[628] = 1782998806;
        mh.jhdu[629] = 238944111;
        mh.jhdu[630] = -1580585356;
        mh.jhdu[631] = -1187485351;
        mh.jhdu[632] = 1514180882;
        mh.jhdu[633] = 1693632981;
        mh.jhdu[634] = -617780798;
        mh.jhdu[635] = 1817542166;
        mh.jhdu[636] = 966630853;
        mh.jhdu[637] = -1192713725;
        mh.jhdu[638] = -1116423477;
        mh.jhdu[639] = -509168581;
        mh.jhdu[640] = 1154266369;
        mh.jhdu[641] = -1896471625;
        mh.jhdu[642] = -10447775;
        mh.jhdu[643] = -1636119849;
        mh.jhdu[644] = 136779477;
        mh.jhdu[645] = -2004270664;
        mh.jhdu[646] = 1363686908;
        mh.jhdu[647] = -1123634336;
        mh.jhdu[648] = 767362911;
        mh.jhdu[649] = 1187504367;
        mh.jhdu[650] = 1103240244;
        mh.jhdu[651] = 391707006;
        mh.jhdu[652] = 1539862650;
        mh.jhdu[653] = -1683468879;
        mh.jhdu[654] = -552806434;
        mh.jhdu[655] = -76032890;
        mh.jhdu[656] = -247223745;
        mh.jhdu[657] = -1882426038;
        mh.jhdu[658] = 2141662392;
        mh.jhdu[659] = -2072281894;
        mh.jhdu[660] = -645093487;
        mh.jhdu[661] = 0xFFB0BB;
        mh.jhdu[662] = -1617013551;
        mh.jhdu[663] = 1868075425;
        mh.jhdu[664] = -607625092;
        mh.jhdu[665] = 774838523;
        mh.jhdu[666] = -1748116598;
        mh.jhdu[667] = 2124929513;
        mh.jhdu[668] = 68398286;
        mh.jhdu[669] = -573540683;
        mh.jhdu[670] = -1923126315;
        mh.jhdu[671] = 281661070;
        mh.jhdu[672] = -1556370368;
        mh.jhdu[673] = -1764046000;
        mh.jhdu[674] = 546260554;
        mh.jhdu[675] = -319187139;
        mh.jhdu[676] = 2093641967;
        mh.jhdu[677] = 1843040319;
        mh.jhdu[678] = 464351603;
        mh.jhdu[679] = 471764681;
        mh.jhdu[680] = 37285912;
        mh.jhdu[681] = 226187485;
        mh.jhdu[682] = 697116211;
        mh.jhdu[683] = 505294781;
        mh.jhdu[684] = -341924373;
        mh.jhdu[685] = 399679492;
        mh.jhdu[686] = 1977909727;
        mh.jhdu[687] = 1494278134;
        mh.jhdu[688] = -244733719;
        mh.jhdu[689] = -132770525;
        mh.jhdu[690] = -1056416707;
        mh.jhdu[691] = 1992831153;
        mh.jhdu[692] = 735187707;
        mh.jhdu[693] = -1112520938;
        mh.jhdu[694] = -974380309;
        mh.jhdu[695] = 701534578;
        mh.jhdu[696] = -1486343802;
        mh.jhdu[697] = 1773331148;
        mh.jhdu[698] = -1136224994;
        mh.jhdu[699] = -1196369225;
    }

    private static /* synthetic */ void jjem() {
        mh.jhdu[0] = -1941926946;
        mh.jhdu[1] = 1315299078;
        mh.jhdu[2] = 1673168028;
        mh.jhdu[3] = -449523296;
        mh.jhdu[4] = -1478326415;
        mh.jhdu[5] = -1491991130;
        mh.jhdu[6] = 1506894017;
        mh.jhdu[7] = -769998243;
        mh.jhdu[8] = -930082108;
        mh.jhdu[9] = 811283574;
        mh.jhdu[10] = 240910688;
        mh.jhdu[11] = 1505998430;
        mh.jhdu[12] = -311720151;
        mh.jhdu[13] = -192615466;
        mh.jhdu[14] = 1339980394;
        mh.jhdu[15] = -1313475126;
        mh.jhdu[16] = 2121756438;
        mh.jhdu[17] = 2083754957;
        mh.jhdu[18] = 1884944974;
        mh.jhdu[19] = -134395806;
        mh.jhdu[20] = 1751354843;
        mh.jhdu[21] = 1380113082;
        mh.jhdu[22] = -265970362;
        mh.jhdu[23] = -1991925348;
        mh.jhdu[24] = -2059056717;
        mh.jhdu[25] = -1360575999;
        mh.jhdu[26] = 2134761658;
        mh.jhdu[27] = 480553917;
        mh.jhdu[28] = 1982168650;
        mh.jhdu[29] = -2074701832;
        mh.jhdu[30] = -1272031441;
        mh.jhdu[31] = 1553402676;
        mh.jhdu[32] = -680919783;
        mh.jhdu[33] = -491121026;
        mh.jhdu[34] = 869237583;
        mh.jhdu[35] = -407934731;
        mh.jhdu[36] = 1572944854;
        mh.jhdu[37] = 1307117227;
        mh.jhdu[38] = 1682767163;
        mh.jhdu[39] = -2067621266;
        mh.jhdu[40] = -1097139938;
        mh.jhdu[41] = 211305507;
        mh.jhdu[42] = -1232714347;
        mh.jhdu[43] = -146965435;
        mh.jhdu[44] = 648075252;
        mh.jhdu[45] = 1099983212;
        mh.jhdu[46] = 1159654371;
        mh.jhdu[47] = 1263662540;
        mh.jhdu[48] = 4689977;
        mh.jhdu[49] = 678346887;
        mh.jhdu[50] = -1900005397;
        mh.jhdu[51] = 33942968;
        mh.jhdu[52] = 40407851;
        mh.jhdu[53] = -270385970;
        mh.jhdu[54] = 1694181130;
        mh.jhdu[55] = 1531874697;
        mh.jhdu[56] = 2031427791;
        mh.jhdu[57] = -2067673616;
        mh.jhdu[58] = -1490471988;
        mh.jhdu[59] = -291558351;
        mh.jhdu[60] = 390403440;
        mh.jhdu[61] = -309626631;
        mh.jhdu[62] = 441926713;
        mh.jhdu[63] = -639964420;
        mh.jhdu[64] = -1250237788;
        mh.jhdu[65] = 1820453587;
        mh.jhdu[66] = -86949842;
        mh.jhdu[67] = 1277025131;
        mh.jhdu[68] = 1619762430;
        mh.jhdu[69] = 1210759855;
        mh.jhdu[70] = -1233765328;
        mh.jhdu[71] = 536493885;
        mh.jhdu[72] = 485343536;
        mh.jhdu[73] = 817825081;
        mh.jhdu[74] = 2009534712;
        mh.jhdu[75] = -598551756;
        mh.jhdu[76] = -1694334920;
        mh.jhdu[77] = -991771971;
        mh.jhdu[78] = 1439284718;
        mh.jhdu[79] = -1867743215;
        mh.jhdu[80] = 606476238;
        mh.jhdu[81] = 645050172;
        mh.jhdu[82] = -1503187194;
        mh.jhdu[83] = 642129337;
        mh.jhdu[84] = -78324073;
        mh.jhdu[85] = -2059265555;
        mh.jhdu[86] = -2112355475;
        mh.jhdu[87] = 1651785341;
        mh.jhdu[88] = -549346695;
        mh.jhdu[89] = 1561795439;
        mh.jhdu[90] = 1385972642;
        mh.jhdu[91] = 2138715449;
        mh.jhdu[92] = -191736417;
        mh.jhdu[93] = 1142638959;
        mh.jhdu[94] = -1640931202;
        mh.jhdu[95] = -1655125295;
        mh.jhdu[96] = -76355829;
        mh.jhdu[97] = 365136574;
        mh.jhdu[98] = -1507252939;
        mh.jhdu[99] = -1482795352;
    }

    static {
        jhdu = new int[849];
        jhdv = new int[849];
        mh.jjem();
        mh.jjen();
        mh.jjeo();
        mh.jjep();
        mh.jjeq();
        mh.jjer();
        mh.jjes();
        mh.jjet();
        mh.jjeu();
        mh.jjev();
        mh.jjew();
        mh.jjex();
        mh.jjey();
        mh.jjez();
        mh.jjfa();
        mh.jjfb();
        mh.jjfc();
        mh.jjfd();
        jhft = new long[240];
        jhfu = new long[240];
        mh.jjfe();
        mh.jjff();
        mh.jjfg();
        mh.jjfh();
        mh.jjfi();
        mh.jjfj();
        TEXT = nd.rgba((int)mh.jhdw("jjea", jhdt(int ), (int)837), (int)mh.jhdw("jjeb", jhdt(int ), (int)838), (int)mh.jhdw("jjec", jhdt(int ), (int)839), (int)mh.jhdw("jjed", jhdt(int ), (int)840));
        MUTED = nd.rgba((int)mh.jhdw("jjee", jhdt(int ), (int)841), (int)mh.jhdw("jjef", jhdt(int ), (int)842), (int)mh.jhdw("jjeg", jhdt(int ), (int)843), (int)mh.jhdw("jjeh", jhdt(int ), (int)844));
        ACCENT = nd.rgba((int)mh.jhdw("jjei", jhdt(int ), (int)845), (int)mh.jhdw("jjej", jhdt(int ), (int)846), (int)mh.jhdw("jjek", jhdt(int ), (int)847), (int)mh.jhdw("jjel", jhdt(int ), (int)848));
    }

    private static /* synthetic */ void jjfg() {
        mh.jhft[200] = 1913835219250907497L;
        mh.jhft[201] = 5150595610932018728L;
        mh.jhft[202] = -7390400071100435449L;
        mh.jhft[203] = -4323985087645148380L;
        mh.jhft[204] = 5281911031026435754L;
        mh.jhft[205] = -7487507962558105217L;
        mh.jhft[206] = -2190770643318168318L;
        mh.jhft[207] = 2900467533532620136L;
        mh.jhft[208] = -3635257646478866350L;
        mh.jhft[209] = -2421561809295893929L;
        mh.jhft[210] = 3296258168887274142L;
        mh.jhft[211] = -873968989221416108L;
        mh.jhft[212] = -8936184488209873191L;
        mh.jhft[213] = -4535880404373463350L;
        mh.jhft[214] = -6758375377767622798L;
        mh.jhft[215] = -2210406062582329401L;
        mh.jhft[216] = 8575826405239040801L;
        mh.jhft[217] = -161249149980337812L;
        mh.jhft[218] = -2346446804084691671L;
        mh.jhft[219] = 4224523788355448731L;
        mh.jhft[220] = -1182815373527815671L;
        mh.jhft[221] = -5148192100775059889L;
        mh.jhft[222] = 7512303956238422579L;
        mh.jhft[223] = 7872441826072591041L;
        mh.jhft[224] = -4438963476535205883L;
        mh.jhft[225] = -4778940881584533297L;
        mh.jhft[226] = 6975703540812317324L;
        mh.jhft[227] = -517869675328466081L;
        mh.jhft[228] = 2629210466920931218L;
        mh.jhft[229] = 1357544007532871498L;
        mh.jhft[230] = -7527123989493325716L;
        mh.jhft[231] = 6055343233641927023L;
        mh.jhft[232] = -6130489459876012305L;
        mh.jhft[233] = 6347092310895925036L;
        mh.jhft[234] = 2725808891220118487L;
        mh.jhft[235] = 177118506633816413L;
        mh.jhft[236] = -5481519415794176781L;
        mh.jhft[237] = 3269361977946789951L;
        mh.jhft[238] = 8806656669494589226L;
        mh.jhft[239] = 924913516989755020L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void updateLayout() {
        var11_1 = mh.c;
        var10_2 /* !! */  = mh.b;
        var9_3 = mh.a;
        if (var11_1) {
            throw null;
lbl6:
            // 18 sources

            return;
        }
        if (var9_3) ** GOTO lbl6
        if (var10_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var9_3) ** GOTO lbl6
                var1_4 = ki.getFixedScaledWidth();
                if (var9_3 || var9_3) ** GOTO lbl6
                var2_5 = ki.getFixedScaledHeight();
                if (var9_3 || var9_3) ** GOTO lbl6
                var3_6 = Math.max((float)mh.jhdw("jhic", jhib(int ), (int)76), Math.min((float)mh.jhdw("jhid", jhib(int ), (int)77), var1_4 * mh.jhdw("jhie", jhib(int ), (int)78)));
                if (var9_3 || var9_3) ** GOTO lbl6
                var4_7 = (var3_6 - mh.jhdw("jhif", jhib(int ), (int)79)) * mh.jhdw("jhig", jhib(int ), (int)80);
                if (var9_3 || var9_3) ** GOTO lbl6
                var5_8 = mh.jhdw("jhih", jhib(int ), (int)81);
                if (var9_3 || var9_3) ** GOTO lbl6
                var6_9 = mh.jhdw("jhii", jhib(int ), (int)82);
                if (var9_3 || var9_3) ** GOTO lbl6
                var7_10 = (var1_4 - var3_6) * mh.jhdw("jhij", jhib(int ), (int)83);
                if (var9_3 || var9_3) ** GOTO lbl6
                var8_11 = Math.max((float)mh.jhdw("jhik", jhib(int ), (int)84), var2_5 * mh.jhdw("jhil", jhib(int ), (int)85));
                if (var9_3 || var9_3) ** GOTO lbl6
                this.multiplayer.setBounds(var7_10, var8_11, var4_7, (float)var5_8);
                if (var9_3 || var9_3) ** GOTO lbl6
                this.singleplayer.setBounds(var7_10 + var4_7 + var6_9, var8_11, var4_7, (float)var5_8);
                if (var9_3 || var9_3) ** GOTO lbl6
                this.accounts.setBounds(var7_10, var8_11 + var5_8 + var6_9, var4_7, (float)var5_8);
                if (var9_3 || var9_3) ** GOTO lbl6
                this.settings.setBounds(var7_10 + var4_7 + var6_9, var8_11 + var5_8 + var6_9, var4_7, (float)var5_8);
                if (var9_3 || var9_3) ** GOTO lbl6
                this.exitSliderWidth = Math.max((float)mh.jhdw("jhim", jhib(int ), (int)86), Math.min((float)mh.jhdw("jhin", jhib(int ), (int)87), var1_4 * mh.jhdw("jhio", jhib(int ), (int)88)));
                if (var9_3 || var9_3) ** GOTO lbl6
                this.exitSliderHeight = (float)mh.jhdw("jhip", jhib(int ), (int)89);
                if (var9_3 || var9_3) ** GOTO lbl6
                this.exitSliderX = (var1_4 - this.exitSliderWidth) * mh.jhdw("jhiq", jhib(int ), (int)90);
                if (var9_3 || var9_3) ** GOTO lbl6
                this.exitSliderY = var8_11 + (var5_8 + var6_9) * 2.0f + mh.jhdw("jhir", jhib(int ), (int)91);
                if (!var9_3 && !var9_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var10_2 /* !! */  = (int)mh.jhdw("jhis", jhdt(int ), (int)92);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl57
            }
lbl52:
            // 3 sources

            case 1: {
                var10_2 /* !! */  = (int)mh.jhdw("jhit", jhdt(int ), (int)93);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl57:
            // 2 sources

            case 2: {
                var10_2 /* !! */  = (int)mh.jhdw("jhiu", jhdt(int ), (int)94);
                if (!var11_1) ** GOTO lbl52
                throw null;
            }
            case 3: {
                var10_2 /* !! */  = (int)mh.jhdw("jhiv", jhdt(int ), (int)95);
                if (var11_1) {
                    throw null;
                }
            }
lbl65:
            // 4 sources

            case 4: {
                var10_2 /* !! */  = (int)mh.jhdw("jhiw", jhdt(int ), (int)96);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl108
            }
lbl70:
            // 3 sources

            case 5: {
                var10_2 /* !! */  = (int)mh.jhdw("jhix", jhdt(int ), (int)97);
                if (!var11_1) ** GOTO lbl52
                throw null;
            }
            case 6: {
                var10_2 /* !! */  = (int)mh.jhdw("jhiy", jhdt(int ), (int)98);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl79:
            // 2 sources

            case 7: {
                var10_2 /* !! */  = (int)mh.jhdw("jhiz", jhdt(int ), (int)99);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl84:
            // 2 sources

            case 8: {
                var10_2 /* !! */  = (int)mh.jhdw("jhja", jhdt(int ), (int)100);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl89:
            // 2 sources

            case 9: {
                var10_2 /* !! */  = (int)mh.jhdw("jhjb", jhdt(int ), (int)101);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 10: {
                var10_2 /* !! */  = (int)mh.jhdw("jhjc", jhdt(int ), (int)102);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl132
            }
lbl99:
            // 2 sources

            case 11: {
                var10_2 /* !! */  = (int)mh.jhdw("jhjd", jhdt(int ), (int)103);
                if (!var11_1) ** GOTO lbl70
                throw null;
            }
lbl103:
            // 2 sources

            case 12: {
                var10_2 /* !! */  = (int)mh.jhdw("jhje", jhdt(int ), (int)104);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl108:
            // 2 sources

            case 13: {
                var10_2 /* !! */  = (int)mh.jhdw("jhjf", jhdt(int ), (int)105);
                if (!var11_1) break;
                throw null;
            }
lbl112:
            // 2 sources

            case 14: {
                var10_2 /* !! */  = (int)mh.jhdw("jhjg", jhdt(int ), (int)106);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl184
            }
            case 15: {
                var10_2 /* !! */  = (int)mh.jhdw("jhjh", jhdt(int ), (int)107);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 16: {
                var10_2 /* !! */  = (int)mh.jhdw("jhji", jhdt(int ), (int)108);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl137
            }
            case 17: {
                var10_2 /* !! */  = (int)mh.jhdw("jhjj", jhdt(int ), (int)109);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl132:
            // 3 sources

            case 18: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_2 /* !! */  = (int)mh.jhdw("jhjk", jhdt(int ), (int)110);
                    if (!var11_1) ** GOTO lbl65
                    throw null;
                }
            }
lbl137:
            // 4 sources

            case 19: {
                var10_2 /* !! */  = (int)mh.jhdw("jhjl", jhdt(int ), (int)111);
                if (!var11_1) ** GOTO lbl112
                throw null;
            }
lbl141:
            // 2 sources

            case 20: {
                var10_2 /* !! */  = (int)mh.jhdw("jhjm", jhdt(int ), (int)112);
                if (!var11_1) ** GOTO lbl103
                throw null;
            }
lbl145:
            // 4 sources

            case 21: {
                var10_2 /* !! */  = (int)mh.jhdw("jhjn", jhdt(int ), (int)113);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 22: {
                var10_2 /* !! */  = (int)mh.jhdw("jhjo", jhdt(int ), (int)114);
                if (!var11_1) ** GOTO lbl89
                throw null;
            }
            case 23: {
                var10_2 /* !! */  = (int)mh.jhdw("jhjp", jhdt(int ), (int)115);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 24: {
                var10_2 /* !! */  = (int)mh.jhdw("jhjq", jhdt(int ), (int)116);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl164:
            // 4 sources

            case 25: {
                var10_2 /* !! */  = (int)mh.jhdw("jhjr", jhdt(int ), (int)117);
                if (!var11_1) ** GOTO lbl99
                throw null;
            }
lbl168:
            // 3 sources

            case 26: {
                var10_2 /* !! */  = (int)mh.jhdw("jhjs", jhdt(int ), (int)118);
                if (!var11_1) ** GOTO lbl79
                throw null;
            }
            case 27: {
                var10_2 /* !! */  = (int)mh.jhdw("jhjt", jhdt(int ), (int)119);
                if (!var11_1) ** GOTO lbl145
                throw null;
            }
lbl176:
            // 3 sources

            case 28: {
                var10_2 /* !! */  = (int)mh.jhdw("jhju", jhdt(int ), (int)120);
                if (!var11_1) ** GOTO lbl132
                throw null;
            }
            case 29: {
                var10_2 /* !! */  = (int)mh.jhdw("jhjv", jhdt(int ), (int)121);
                if (var11_1) {
                    throw null;
                }
            }
lbl184:
            // 4 sources

            case 30: {
                var10_2 /* !! */  = (int)mh.jhdw("jhjw", jhdt(int ), (int)122);
                if (!var11_1) ** GOTO lbl84
                throw null;
            }
lbl188:
            // 2 sources

            case 31: {
                var10_2 /* !! */  = (int)mh.jhdw("jhjx", jhdt(int ), (int)123);
                if (!var11_1) ** GOTO lbl137
                throw null;
            }
            case 32: {
                var10_2 /* !! */  = (int)mh.jhdw("jhjy", jhdt(int ), (int)124);
                if (!var11_1) ** GOTO lbl188
                throw null;
            }
lbl196:
            // 2 sources

            case 33: {
                var10_2 /* !! */  = (int)mh.jhdw("jhjz", jhdt(int ), (int)125);
                if (!var11_1) ** GOTO lbl70
                throw null;
            }
            case 34: {
                var10_2 /* !! */  = (int)mh.jhdw("jhka", jhdt(int ), (int)126);
                if (!var11_1) ** GOTO lbl145
                throw null;
            }
            case 35: 
        }
        var10_2 /* !! */  = (int)mh.jhdw("jhkb", jhdt(int ), (int)127);
        ** while (!var11_1)
lbl207:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a\u000a

    public boolean method_25402(class_11909 v1, boolean i2) {
        block121: {
            block120: {
                i16 = mh.c;
                i15 /* !! */  = mh.b;
                i14 = mh.a;
                if (i16) {
                    throw null;
lbl6:
                    // 33 sources

                    return (boolean)mh.jhdw("jida", jhdt(int ), (int)501);
                }
                if (i14 || i14) ** GOTO lbl6
                if (v1.method_74245() == 0) break block120;
                if (i14) ** GOTO lbl6
                return super.method_25402(v1, i2);
            }
            if (i14 || i14) ** GOTO lbl6
            this.updateLayout();
            if (i14 || i14) ** GOTO lbl6
            f3 = ki.convertX((float)v1.comp_4798());
            if (i14 || i14) ** GOTO lbl6
            f4 = ki.convertY((float)v1.comp_4799());
            if (i14 || i14) ** GOTO lbl6
            f5 = this.exitSliderHeight;
            if (i14 || i14) ** GOTO lbl6
            f6 = this.exitSliderX + (this.exitSliderWidth - f5) * this.exitSliderVisualProgress;
            if (i14 || i14) ** GOTO lbl6
            f7 = mh.jhdw("jidi", jhib(int ), (int)502);
            if (i14 || i14) ** GOTO lbl6
            f8 = mh.jhdw("jidj", jhib(int ), (int)503);
            if (i14 || i14) ** GOTO lbl6
            f9 = f7 + mh.jhdw("jidk", jhib(int ), (int)504) + mh.jhdw("jidl", jhib(int ), (int)505);
            if (i14 || i14) ** GOTO lbl6
            if (!mh.contains(f3, f4, (float)f7, (float)f8, (float)mh.jhdw("jidm", jhib(int ), (int)506), (float)mh.jhdw("jidn", jhib(int ), (int)507))) break block121;
            if (i14 || i14) ** GOTO lbl6
            mh.openUrl("https://t.me/drugsoluti0ns");
            if (i14 || i14) ** GOTO lbl6
            return (boolean)mh.jhdw("jidp", jhdt(int ), (int)508);
        }
        if (i14) ** GOTO lbl6
        if (i15 /* !! */  == 0) ** GOTO lbl-1000
        switch (i15 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (i14) ** GOTO lbl6
                if (!mh.contains(f3, f4, (float)f9, (float)f8, (float)mh.jhdw("jidr", jhib(int ), (int)509), (float)mh.jhdw("jidt", jhib(int ), (int)510))) ** GOTO lbl46
                if (i14 || i14) ** GOTO lbl6
                mh.openUrl("https://discord.gg/8yDgeKtvec");
                if (i14 || i14) ** GOTO lbl6
                return (boolean)mh.jhdw("jidv", jhdt(int ), (int)511);
lbl46:
                // 1 sources

                if (i14 || i14) ** GOTO lbl6
                if (!mh.contains(f3, f4, f6 - 2.0f, this.exitSliderY - 2.0f, f5 + mh.jhdw("jidz", jhib(int ), (int)512), f5 + mh.jhdw("jieb", jhib(int ), (int)513))) ** GOTO lbl54
                if (i14 || i14) ** GOTO lbl6
                this.exitSliderDragging = mh.jhdw("jiec", jhdt(int ), (int)514);
                if (i14 || i14) ** GOTO lbl6
                this.exitSliderProgress = this.exitSliderVisualProgress;
                if (i14 || i14) ** GOTO lbl6
                return (boolean)mh.jhdw("jief", jhdt(int ), (int)515);
lbl54:
                // 1 sources

                if (i14 || i14) ** GOTO lbl6
                v10 = this.buttons;
                if (i14) ** GOTO lbl6
                i11 = v10.length;
                if (i14) ** GOTO lbl6
                i12 = mh.jhdw("jiei", jhdt(int ), (int)516);
                if (i14) ** GOTO lbl6
                do {
                    if (i14 || i14) ** GOTO lbl6
                    if (i12 >= i11) ** GOTO lbl77
                    if (i14) ** GOTO lbl6
                    v13 = v10[i12];
                    if (i14 || i14) ** GOTO lbl6
                    if (!v13.contains(f3, f4)) ** GOTO lbl72
                    if (i14 || i14) ** GOTO lbl6
                    this.activate(v13.action);
                    if (i14 || i14) ** GOTO lbl6
                    return (boolean)mh.jhdw("jiem", jhdt(int ), (int)517);
lbl72:
                    // 1 sources

                    if (i14 || i14) ** GOTO lbl6
                    ++i12;
                    if (i14) ** GOTO lbl6
                } while (!i16);
                throw null;
lbl77:
                // 1 sources

                if (!i14 && !i14) ** break;
                ** continue;
                return super.method_25402(v1, i2);
            }
lbl80:
            // 4 sources

            case 0: {
                i15 /* !! */  = (int)mh.jhdw("jiep", jhdt(int ), (int)518);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl333
            }
            case 1: {
                i15 /* !! */  = (int)mh.jhdw("jier", jhdt(int ), (int)519);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl333
            }
lbl90:
            // 2 sources

            case 2: {
                i15 /* !! */  = (int)mh.jhdw("jiet", jhdt(int ), (int)520);
                if (i16) {
                    throw null;
                }
            }
lbl94:
            // 4 sources

            case 3: {
                i15 /* !! */  = (int)mh.jhdw("jiev", jhdt(int ), (int)521);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl217
            }
            case 4: {
                i15 /* !! */  = (int)mh.jhdw("jiex", jhdt(int ), (int)522);
                if (!i16) ** GOTO lbl80
                throw null;
            }
lbl103:
            // 3 sources

            case 5: {
                i15 /* !! */  = (int)mh.jhdw("jiez", jhdt(int ), (int)523);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl108:
            // 3 sources

            case 6: {
                i15 /* !! */  = (int)mh.jhdw("jifb", jhdt(int ), (int)524);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl113:
            // 2 sources

            case 7: {
                i15 /* !! */  = (int)mh.jhdw("jifd", jhdt(int ), (int)525);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl148
            }
            case 8: {
                i15 /* !! */  = (int)mh.jhdw("jiff", jhdt(int ), (int)526);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl267
            }
lbl123:
            // 2 sources

            case 9: {
                i15 /* !! */  = (int)mh.jhdw("jifh", jhdt(int ), (int)527);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 10: {
                i15 /* !! */  = (int)mh.jhdw("jifj", jhdt(int ), (int)528);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl349
            }
lbl133:
            // 3 sources

            case 11: {
                i15 /* !! */  = (int)mh.jhdw("jifk", jhdt(int ), (int)529);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl244
            }
            case 12: {
                i15 /* !! */  = (int)mh.jhdw("jifl", jhdt(int ), (int)530);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl275
            }
            case 13: {
                i15 /* !! */  = (int)mh.jhdw("jifn", jhdt(int ), (int)531);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl199
            }
lbl148:
            // 3 sources

            case 14: {
                i15 /* !! */  = (int)mh.jhdw("jifp", jhdt(int ), (int)532);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl153:
            // 2 sources

            case 15: {
                i15 /* !! */  = (int)mh.jhdw("jigk", jhdt(int ), (int)533);
                if (!i16) ** GOTO lbl133
                throw null;
            }
lbl157:
            // 3 sources

            case 16: {
                i15 /* !! */  = (int)mh.jhdw("jigl", jhdt(int ), (int)534);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl162:
            // 3 sources

            case 17: {
                i15 /* !! */  = (int)mh.jhdw("jigm", jhdt(int ), (int)535);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl353
            }
            case 18: {
                i15 /* !! */  = (int)mh.jhdw("jign", jhdt(int ), (int)536);
                if (!i16) ** GOTO lbl108
                throw null;
            }
lbl171:
            // 2 sources

            case 19: {
                i15 /* !! */  = (int)mh.jhdw("jigp", jhdt(int ), (int)537);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl249
            }
lbl176:
            // 2 sources

            case 20: {
                i15 /* !! */  = (int)mh.jhdw("jigs", jhdt(int ), (int)538);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl325
            }
            case 21: {
                i15 /* !! */  = (int)mh.jhdw("jigw", jhdt(int ), (int)539);
                if (!i16) break;
                throw null;
            }
lbl185:
            // 4 sources

            case 22: {
                i15 /* !! */  = (int)mh.jhdw("jigy", jhdt(int ), (int)540);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl190:
            // 2 sources

            case 23: {
                i15 /* !! */  = (int)mh.jhdw("jigz", jhdt(int ), (int)541);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl240
            }
lbl195:
            // 3 sources

            case 24: {
                i15 /* !! */  = (int)mh.jhdw("jihc", jhdt(int ), (int)542);
                if (!i16) ** GOTO lbl113
                throw null;
            }
lbl199:
            // 2 sources

            case 25: {
                i15 /* !! */  = (int)mh.jhdw("jihe", jhdt(int ), (int)543);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl309
            }
            case 26: {
                i15 /* !! */  = (int)mh.jhdw("jihf", jhdt(int ), (int)544);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl317
            }
            case 27: {
                i15 /* !! */  = (int)mh.jhdw("jihi", jhdt(int ), (int)545);
                if (!i16) ** GOTO lbl103
                throw null;
            }
            case 28: {
                i15 /* !! */  = (int)mh.jhdw("jihj", jhdt(int ), (int)546);
                if (!i16) ** GOTO lbl195
                throw null;
            }
lbl217:
            // 2 sources

            case 29: {
                i15 /* !! */  = (int)mh.jhdw("jihl", jhdt(int ), (int)547);
                if (!i16) ** GOTO lbl195
                throw null;
            }
            case 30: lbl-1000:
            // 2 sources

            {
                while (true) {
                    i15 /* !! */  = (int)mh.jhdw("jiho", jhdt(int ), (int)548);
                    if (!i16) ** GOTO lbl80
                    throw null;
                }
            }
lbl226:
            // 3 sources

            case 31: {
                i15 /* !! */  = (int)mh.jhdw("jihr", jhdt(int ), (int)549);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl305
            }
            case 32: {
                i15 /* !! */  = (int)mh.jhdw("jihu", jhdt(int ), (int)550);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl244
            }
            case 33: {
                i15 /* !! */  = (int)mh.jhdw("jihv", jhdt(int ), (int)551);
                if (!i16) ** GOTO lbl157
                throw null;
            }
lbl240:
            // 2 sources

            case 34: {
                i15 /* !! */  = (int)mh.jhdw("jihx", jhdt(int ), (int)552);
                if (!i16) ** GOTO lbl90
                throw null;
            }
lbl244:
            // 5 sources

            case 35: {
                i15 /* !! */  = (int)mh.jhdw("jihz", jhdt(int ), (int)553);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl249:
            // 2 sources

            case 36: {
                i15 /* !! */  = (int)mh.jhdw("jiia", jhdt(int ), (int)554);
                if (!i16) ** GOTO lbl133
                throw null;
            }
            case 37: {
                i15 /* !! */  = (int)mh.jhdw("jiid", jhdt(int ), (int)555);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl305
            }
lbl258:
            // 2 sources

            case 38: {
                i15 /* !! */  = (int)mh.jhdw("jiie", jhdt(int ), (int)556);
                if (!i16) ** GOTO lbl103
                throw null;
            }
            case 39: {
                i15 /* !! */  = (int)mh.jhdw("jiif", jhdt(int ), (int)557);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl305
            }
lbl267:
            // 2 sources

            case 40: {
                i15 /* !! */  = (int)mh.jhdw("jiij", jhdt(int ), (int)558);
                if (!i16) ** GOTO lbl123
                throw null;
            }
            case 41: {
                i15 /* !! */  = (int)mh.jhdw("jiik", jhdt(int ), (int)559);
                if (!i16) ** GOTO lbl190
                throw null;
            }
lbl275:
            // 3 sources

            case 42: {
                i15 /* !! */  = (int)mh.jhdw("jiin", jhdt(int ), (int)560);
                if (!i16) ** GOTO lbl185
                throw null;
            }
            case 43: {
                i15 /* !! */  = (int)mh.jhdw("jiip", jhdt(int ), (int)561);
                if (!i16) ** GOTO lbl226
                throw null;
            }
lbl283:
            // 2 sources

            case 44: {
                i15 /* !! */  = (int)mh.jhdw("jiir", jhdt(int ), (int)562);
                if (!i16) ** GOTO lbl108
                throw null;
            }
lbl287:
            // 3 sources

            case 45: {
                i15 /* !! */  = (int)mh.jhdw("jiis", jhdt(int ), (int)563);
                if (!i16) ** GOTO lbl185
                throw null;
            }
            case 46: {
                i15 /* !! */  = (int)mh.jhdw("jiit", jhdt(int ), (int)564);
                if (!i16) ** GOTO lbl162
                throw null;
            }
            case 47: {
                do {
                    i15 /* !! */  = (int)mh.jhdw("jiiw", jhdt(int ), (int)565);
                } while (!i16);
                throw null;
            }
            case 48: {
                i15 /* !! */  = (int)mh.jhdw("jiix", jhdt(int ), (int)566);
                if (i16) {
                    throw null;
                }
                ** GOTO lbl337
            }
lbl305:
            // 5 sources

            case 49: {
                i15 /* !! */  = (int)mh.jhdw("jija", jhdt(int ), (int)567);
                if (!i16) ** GOTO lbl275
                throw null;
            }
lbl309:
            // 3 sources

            case 50: {
                i15 /* !! */  = (int)mh.jhdw("jijd", jhdt(int ), (int)568);
                if (!i16) ** GOTO lbl226
                throw null;
            }
            case 51: {
                i15 /* !! */  = (int)mh.jhdw("jijg", jhdt(int ), (int)569);
                if (!i16) ** GOTO lbl153
                throw null;
            }
lbl317:
            // 2 sources

            case 52: {
                i15 /* !! */  = (int)mh.jhdw("jijj", jhdt(int ), (int)570);
                if (!i16) ** GOTO lbl157
                throw null;
            }
            case 53: {
                i15 /* !! */  = (int)mh.jhdw("jijl", jhdt(int ), (int)571);
                if (!i16) ** GOTO lbl305
                throw null;
            }
lbl325:
            // 3 sources

            case 54: {
                i15 /* !! */  = (int)mh.jhdw("jijn", jhdt(int ), (int)572);
                if (!i16) ** GOTO lbl258
                throw null;
            }
            case 55: {
                i15 /* !! */  = (int)mh.jhdw("jijq", jhdt(int ), (int)573);
                if (!i16) ** GOTO lbl325
                throw null;
            }
lbl333:
            // 3 sources

            case 56: {
                i15 /* !! */  = (int)mh.jhdw("jijs", jhdt(int ), (int)574);
                if (!i16) ** GOTO lbl287
                throw null;
            }
lbl337:
            // 2 sources

            case 57: {
                i15 /* !! */  = (int)mh.jhdw("jijt", jhdt(int ), (int)575);
                if (!i16) ** GOTO lbl148
                throw null;
            }
            case 58: {
                i15 /* !! */  = (int)mh.jhdw("jijv", jhdt(int ), (int)576);
                if (!i16) ** GOTO lbl94
                throw null;
            }
            case 59: {
                i15 /* !! */  = (int)mh.jhdw("jijx", jhdt(int ), (int)577);
                if (!i16) ** GOTO lbl176
                throw null;
            }
lbl349:
            // 2 sources

            case 60: {
                i15 /* !! */  = (int)mh.jhdw("jijy", jhdt(int ), (int)578);
                if (!i16) ** GOTO lbl185
                throw null;
            }
lbl353:
            // 2 sources

            case 61: {
                i15 /* !! */  = (int)mh.jhdw("jijz", jhdt(int ), (int)579);
                if (!i16) ** GOTO lbl80
                throw null;
            }
            case 62: 
        }
        i15 /* !! */  = (int)mh.jhdw("jikd", jhdt(int ), (int)580);
        ** while (!i16)
lbl360:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jjeq() {
        mh.jhdu[400] = -190097494;
        mh.jhdu[401] = 152602531;
        mh.jhdu[402] = 630210447;
        mh.jhdu[403] = -356708884;
        mh.jhdu[404] = 1880199350;
        mh.jhdu[405] = 189889127;
        mh.jhdu[406] = 393651316;
        mh.jhdu[407] = 1931904783;
        mh.jhdu[408] = -1414289539;
        mh.jhdu[409] = -826220186;
        mh.jhdu[410] = 504345949;
        mh.jhdu[411] = 1866011730;
        mh.jhdu[412] = -1878153893;
        mh.jhdu[413] = 342489960;
        mh.jhdu[414] = -1631344305;
        mh.jhdu[415] = -518812259;
        mh.jhdu[416] = -2058551165;
        mh.jhdu[417] = -38993655;
        mh.jhdu[418] = 99966615;
        mh.jhdu[419] = 190521578;
        mh.jhdu[420] = -972099209;
        mh.jhdu[421] = 1268672496;
        mh.jhdu[422] = 172922877;
        mh.jhdu[423] = -1812378756;
        mh.jhdu[424] = -1920661926;
        mh.jhdu[425] = 1713105044;
        mh.jhdu[426] = -49496070;
        mh.jhdu[427] = -981642737;
        mh.jhdu[428] = -1205593199;
        mh.jhdu[429] = -1894589731;
        mh.jhdu[430] = 1424391408;
        mh.jhdu[431] = -703711846;
        mh.jhdu[432] = -50751435;
        mh.jhdu[433] = -1162872138;
        mh.jhdu[434] = -1411215227;
        mh.jhdu[435] = 1748323713;
        mh.jhdu[436] = -786623599;
        mh.jhdu[437] = -803345712;
        mh.jhdu[438] = 1996279267;
        mh.jhdu[439] = 2040072030;
        mh.jhdu[440] = 628280693;
        mh.jhdu[441] = 452528197;
        mh.jhdu[442] = -922867708;
        mh.jhdu[443] = -649956576;
        mh.jhdu[444] = -749366621;
        mh.jhdu[445] = -118201731;
        mh.jhdu[446] = -1262937098;
        mh.jhdu[447] = 830446823;
        mh.jhdu[448] = -318440115;
        mh.jhdu[449] = -359338475;
        mh.jhdu[450] = 506198720;
        mh.jhdu[451] = 203415041;
        mh.jhdu[452] = -1658901404;
        mh.jhdu[453] = 245711979;
        mh.jhdu[454] = -2111907466;
        mh.jhdu[455] = -907633151;
        mh.jhdu[456] = -1959045078;
        mh.jhdu[457] = 928351060;
        mh.jhdu[458] = -118807007;
        mh.jhdu[459] = -756795196;
        mh.jhdu[460] = 1026354715;
        mh.jhdu[461] = -1960827947;
        mh.jhdu[462] = 1198992805;
        mh.jhdu[463] = -1003751203;
        mh.jhdu[464] = -355660390;
        mh.jhdu[465] = 1808128103;
        mh.jhdu[466] = -2125460314;
        mh.jhdu[467] = -1151770842;
        mh.jhdu[468] = 530747806;
        mh.jhdu[469] = -952511077;
        mh.jhdu[470] = 402301682;
        mh.jhdu[471] = 964022259;
        mh.jhdu[472] = -1986814876;
        mh.jhdu[473] = 388866925;
        mh.jhdu[474] = -540105550;
        mh.jhdu[475] = 2072823959;
        mh.jhdu[476] = -1386372458;
        mh.jhdu[477] = 108606537;
        mh.jhdu[478] = -1290229896;
        mh.jhdu[479] = -1466966962;
        mh.jhdu[480] = 426323583;
        mh.jhdu[481] = 1268579946;
        mh.jhdu[482] = 53007628;
        mh.jhdu[483] = -1385072030;
        mh.jhdu[484] = -315459453;
        mh.jhdu[485] = -1015015740;
        mh.jhdu[486] = -1414095381;
        mh.jhdu[487] = -1154418224;
        mh.jhdu[488] = 523357767;
        mh.jhdu[489] = 183248865;
        mh.jhdu[490] = 127793574;
        mh.jhdu[491] = -1184866238;
        mh.jhdu[492] = 261284186;
        mh.jhdu[493] = -2121760113;
        mh.jhdu[494] = -2744559;
        mh.jhdu[495] = 1565966874;
        mh.jhdu[496] = -1779465145;
        mh.jhdu[497] = 1797001158;
        mh.jhdu[498] = 1754217808;
        mh.jhdu[499] = -1239471451;
    }

    private static /* synthetic */ void jjeo() {
        mh.jhdu[200] = 334258856;
        mh.jhdu[201] = -317446376;
        mh.jhdu[202] = -597648056;
        mh.jhdu[203] = -1169503272;
        mh.jhdu[204] = 745549317;
        mh.jhdu[205] = -1890957094;
        mh.jhdu[206] = -1743952499;
        mh.jhdu[207] = 220912993;
        mh.jhdu[208] = 918819482;
        mh.jhdu[209] = 2022317380;
        mh.jhdu[210] = -573728216;
        mh.jhdu[211] = -274080897;
        mh.jhdu[212] = 175060104;
        mh.jhdu[213] = 1179026014;
        mh.jhdu[214] = -1450223746;
        mh.jhdu[215] = -1135242421;
        mh.jhdu[216] = 1540185689;
        mh.jhdu[217] = -234750578;
        mh.jhdu[218] = 1113089553;
        mh.jhdu[219] = -1564301881;
        mh.jhdu[220] = -1261590313;
        mh.jhdu[221] = -96670465;
        mh.jhdu[222] = 21765193;
        mh.jhdu[223] = 1485442310;
        mh.jhdu[224] = 2006026675;
        mh.jhdu[225] = -513595184;
        mh.jhdu[226] = -1298093337;
        mh.jhdu[227] = -197669984;
        mh.jhdu[228] = -1935082618;
        mh.jhdu[229] = 1036854920;
        mh.jhdu[230] = -1664172958;
        mh.jhdu[231] = -1876145883;
        mh.jhdu[232] = -1845640895;
        mh.jhdu[233] = -876318296;
        mh.jhdu[234] = 1896123461;
        mh.jhdu[235] = -1486565540;
        mh.jhdu[236] = 474643340;
        mh.jhdu[237] = -1782220464;
        mh.jhdu[238] = -2025698767;
        mh.jhdu[239] = -1145394905;
        mh.jhdu[240] = -720828458;
        mh.jhdu[241] = -1514682609;
        mh.jhdu[242] = -964761744;
        mh.jhdu[243] = 2843692;
        mh.jhdu[244] = 1455687104;
        mh.jhdu[245] = 733732385;
        mh.jhdu[246] = -1148475628;
        mh.jhdu[247] = 900399163;
        mh.jhdu[248] = 760720169;
        mh.jhdu[249] = -1080416885;
        mh.jhdu[250] = -1514754836;
        mh.jhdu[251] = 2146075377;
        mh.jhdu[252] = 2020164559;
        mh.jhdu[253] = -826548189;
        mh.jhdu[254] = -66317371;
        mh.jhdu[255] = -1317346053;
        mh.jhdu[256] = 1007182489;
        mh.jhdu[257] = -935814492;
        mh.jhdu[258] = 67752055;
        mh.jhdu[259] = 1436667266;
        mh.jhdu[260] = 2118886930;
        mh.jhdu[261] = 1077970757;
        mh.jhdu[262] = 1830382815;
        mh.jhdu[263] = -1170829818;
        mh.jhdu[264] = -1491106207;
        mh.jhdu[265] = -274782305;
        mh.jhdu[266] = -874655404;
        mh.jhdu[267] = -1206694339;
        mh.jhdu[268] = 1157033298;
        mh.jhdu[269] = 1553814280;
        mh.jhdu[270] = -1784712762;
        mh.jhdu[271] = -141595149;
        mh.jhdu[272] = -1393234141;
        mh.jhdu[273] = -1870120596;
        mh.jhdu[274] = -692914765;
        mh.jhdu[275] = 242578590;
        mh.jhdu[276] = 723069755;
        mh.jhdu[277] = -865479578;
        mh.jhdu[278] = 165658141;
        mh.jhdu[279] = -275242677;
        mh.jhdu[280] = 302829946;
        mh.jhdu[281] = 1733458989;
        mh.jhdu[282] = 121499376;
        mh.jhdu[283] = 1246720304;
        mh.jhdu[284] = -27665028;
        mh.jhdu[285] = 1077103834;
        mh.jhdu[286] = 1139083715;
        mh.jhdu[287] = -131341768;
        mh.jhdu[288] = 1158903561;
        mh.jhdu[289] = -1463009387;
        mh.jhdu[290] = -410336170;
        mh.jhdu[291] = -61194414;
        mh.jhdu[292] = 1125932357;
        mh.jhdu[293] = 1361322145;
        mh.jhdu[294] = -1000399226;
        mh.jhdu[295] = -597700437;
        mh.jhdu[296] = -960336590;
        mh.jhdu[297] = -1177615989;
        mh.jhdu[298] = 1980493378;
        mh.jhdu[299] = 1487676085;
    }

    private static /* synthetic */ void jjfa() {
        mh.jhdv[500] = 2062323840;
        mh.jhdv[501] = 1596392593;
        mh.jhdv[502] = -1382661062;
        mh.jhdv[503] = 821359386;
        mh.jhdv[504] = -171664721;
        mh.jhdv[505] = -1694771481;
        mh.jhdv[506] = 1225453682;
        mh.jhdv[507] = -1433288081;
        mh.jhdv[508] = -1996491932;
        mh.jhdv[509] = 1044254190;
        mh.jhdv[510] = 2086480266;
        mh.jhdv[511] = -690816265;
        mh.jhdv[512] = 1703783358;
        mh.jhdv[513] = 1400988010;
        mh.jhdv[514] = -1992319393;
        mh.jhdv[515] = 1555572942;
        mh.jhdv[516] = 903979633;
        mh.jhdv[517] = -1015620494;
        mh.jhdv[518] = -553827390;
        mh.jhdv[519] = -356432459;
        mh.jhdv[520] = -629678831;
        mh.jhdv[521] = -574818458;
        mh.jhdv[522] = -682256041;
        mh.jhdv[523] = -1060313563;
        mh.jhdv[524] = -1604472432;
        mh.jhdv[525] = -1975329505;
        mh.jhdv[526] = -773990209;
        mh.jhdv[527] = 1443079078;
        mh.jhdv[528] = 1164280837;
        mh.jhdv[529] = 2021543784;
        mh.jhdv[530] = -333221127;
        mh.jhdv[531] = 207575136;
        mh.jhdv[532] = 749870254;
        mh.jhdv[533] = 1907809965;
        mh.jhdv[534] = 296648709;
        mh.jhdv[535] = 1429340146;
        mh.jhdv[536] = 898816568;
        mh.jhdv[537] = -123705102;
        mh.jhdv[538] = 1607009482;
        mh.jhdv[539] = 1543065986;
        mh.jhdv[540] = -159759299;
        mh.jhdv[541] = 1974080518;
        mh.jhdv[542] = -1210436807;
        mh.jhdv[543] = -1408669932;
        mh.jhdv[544] = -1301495283;
        mh.jhdv[545] = -1543096585;
        mh.jhdv[546] = 376637617;
        mh.jhdv[547] = 1399457311;
        mh.jhdv[548] = 1088256432;
        mh.jhdv[549] = -893196600;
        mh.jhdv[550] = -1088688475;
        mh.jhdv[551] = -1763222179;
        mh.jhdv[552] = -1697932501;
        mh.jhdv[553] = 2123504225;
        mh.jhdv[554] = 1271480699;
        mh.jhdv[555] = 1242581986;
        mh.jhdv[556] = -1538089982;
        mh.jhdv[557] = 1599838662;
        mh.jhdv[558] = 483844535;
        mh.jhdv[559] = -2031516304;
        mh.jhdv[560] = -1409014018;
        mh.jhdv[561] = 530721932;
        mh.jhdv[562] = -775343272;
        mh.jhdv[563] = -1514264567;
        mh.jhdv[564] = -1853176784;
        mh.jhdv[565] = 1986575239;
        mh.jhdv[566] = 1309945729;
        mh.jhdv[567] = -1695836476;
        mh.jhdv[568] = 1870691637;
        mh.jhdv[569] = -1378133560;
        mh.jhdv[570] = 772762716;
        mh.jhdv[571] = 1027556;
        mh.jhdv[572] = 1632960954;
        mh.jhdv[573] = -859084602;
        mh.jhdv[574] = 1900560187;
        mh.jhdv[575] = 350069798;
        mh.jhdv[576] = -1311567806;
        mh.jhdv[577] = -833795110;
        mh.jhdv[578] = -556704513;
        mh.jhdv[579] = -1823527591;
        mh.jhdv[580] = -1853020378;
        mh.jhdv[581] = -1241184296;
        mh.jhdv[582] = -275147273;
        mh.jhdv[583] = -680604018;
        mh.jhdv[584] = 764238520;
        mh.jhdv[585] = -1693822215;
        mh.jhdv[586] = 922228319;
        mh.jhdv[587] = -1691806503;
        mh.jhdv[588] = 112739404;
        mh.jhdv[589] = -732351779;
        mh.jhdv[590] = -148601254;
        mh.jhdv[591] = -914031348;
        mh.jhdv[592] = -1417780534;
        mh.jhdv[593] = -1045172128;
        mh.jhdv[594] = -1230520762;
        mh.jhdv[595] = -1490911350;
        mh.jhdv[596] = -1114336232;
        mh.jhdv[597] = 822302674;
        mh.jhdv[598] = 629937783;
        mh.jhdv[599] = -80640487;
    }

    private static /* synthetic */ void jjfi() {
        mh.jhfu[100] = -4512703922450546307L;
        mh.jhfu[101] = 3869493290280291413L;
        mh.jhfu[102] = -1417703041643490669L;
        mh.jhfu[103] = -2281263816307279175L;
        mh.jhfu[104] = 1911959264171253093L;
        mh.jhfu[105] = 3616922230489031186L;
        mh.jhfu[106] = 2767013453858572705L;
        mh.jhfu[107] = 2178984034881412444L;
        mh.jhfu[108] = 5159376153865767567L;
        mh.jhfu[109] = -922856625624644112L;
        mh.jhfu[110] = -3363694468027877531L;
        mh.jhfu[111] = -1104362848518556172L;
        mh.jhfu[112] = 2495625403799743919L;
        mh.jhfu[113] = 9092947931370593963L;
        mh.jhfu[114] = -6450418609437140144L;
        mh.jhfu[115] = 3261602518370575812L;
        mh.jhfu[116] = 2965170400617302399L;
        mh.jhfu[117] = -4537356567809208911L;
        mh.jhfu[118] = -3193640195089962024L;
        mh.jhfu[119] = -5690648504880329042L;
        mh.jhfu[120] = 6186118676446707884L;
        mh.jhfu[121] = 4264893447364239182L;
        mh.jhfu[122] = -8902272110418027070L;
        mh.jhfu[123] = 4883080153536211235L;
        mh.jhfu[124] = 3310560337049343247L;
        mh.jhfu[125] = 4005152683580897168L;
        mh.jhfu[126] = 7905366158517371363L;
        mh.jhfu[127] = -4799743928260510190L;
        mh.jhfu[128] = -3160849331310434480L;
        mh.jhfu[129] = -4694656007168418536L;
        mh.jhfu[130] = 1574889059622146729L;
        mh.jhfu[131] = -5310719914928703723L;
        mh.jhfu[132] = 8198263784929996547L;
        mh.jhfu[133] = -8891541675860948655L;
        mh.jhfu[134] = 8332136012777887397L;
        mh.jhfu[135] = -4837554554546823821L;
        mh.jhfu[136] = 1908320243119961622L;
        mh.jhfu[137] = -5789472205727204907L;
        mh.jhfu[138] = -4204272204175293569L;
        mh.jhfu[139] = 3054257229500144866L;
        mh.jhfu[140] = -745035856759602819L;
        mh.jhfu[141] = -5739493339609665095L;
        mh.jhfu[142] = -2155716059916202419L;
        mh.jhfu[143] = -3113994644753495405L;
        mh.jhfu[144] = -8474987523635873381L;
        mh.jhfu[145] = -1544594616371517073L;
        mh.jhfu[146] = 8218745802803381963L;
        mh.jhfu[147] = 7133720767354780204L;
        mh.jhfu[148] = -7881763499373690167L;
        mh.jhfu[149] = 8760076274770600893L;
        mh.jhfu[150] = 8853628245661976424L;
        mh.jhfu[151] = 5648774165542675287L;
        mh.jhfu[152] = 2954170531274172406L;
        mh.jhfu[153] = -2057272253364975134L;
        mh.jhfu[154] = -5590298266470104287L;
        mh.jhfu[155] = -5480168405767293364L;
        mh.jhfu[156] = -2945526117867893201L;
        mh.jhfu[157] = -6545460031939985853L;
        mh.jhfu[158] = 6918579468673074191L;
        mh.jhfu[159] = 1284898278847726046L;
        mh.jhfu[160] = 858386123145606094L;
        mh.jhfu[161] = -1955711092389605720L;
        mh.jhfu[162] = 3029163986794530672L;
        mh.jhfu[163] = 3202943368701492849L;
        mh.jhfu[164] = -2491826091477854249L;
        mh.jhfu[165] = -1906108448682700671L;
        mh.jhfu[166] = -7706043299533317278L;
        mh.jhfu[167] = 8718636365063056647L;
        mh.jhfu[168] = -4247505661647586334L;
        mh.jhfu[169] = 3950733582904382717L;
        mh.jhfu[170] = -4110008116585128327L;
        mh.jhfu[171] = -3435958943160119854L;
        mh.jhfu[172] = -3778042336539326461L;
        mh.jhfu[173] = 1323390389055180202L;
        mh.jhfu[174] = 3805303960312495134L;
        mh.jhfu[175] = -3693299440936180502L;
        mh.jhfu[176] = -5359889257481832756L;
        mh.jhfu[177] = 7264596243323578374L;
        mh.jhfu[178] = 8428629209772025525L;
        mh.jhfu[179] = 1838001300906720455L;
        mh.jhfu[180] = -7998845748348965232L;
        mh.jhfu[181] = -3198201832721044162L;
        mh.jhfu[182] = -7312305370535658710L;
        mh.jhfu[183] = 657088947428943938L;
        mh.jhfu[184] = -3689548604897428164L;
        mh.jhfu[185] = -2395786609912079279L;
        mh.jhfu[186] = -4102391214310732712L;
        mh.jhfu[187] = 5653586011829250508L;
        mh.jhfu[188] = 7285701563377457556L;
        mh.jhfu[189] = 7625354698141793784L;
        mh.jhfu[190] = -6876515918935955356L;
        mh.jhfu[191] = -3201046529343936794L;
        mh.jhfu[192] = -1045776215434417529L;
        mh.jhfu[193] = 6955331003809642020L;
        mh.jhfu[194] = 2457254886356515375L;
        mh.jhfu[195] = 8701748459920522103L;
        mh.jhfu[196] = -5920893254935341807L;
        mh.jhfu[197] = 7196858787294722222L;
        mh.jhfu[198] = 6077815471388757965L;
        mh.jhfu[199] = -8192624896648046004L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void openUrl(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mh.rl - mh.jhdw("jizd", jhfs(int ), (int)217)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == mh.jhdw("jize", jhdt(int ), (int)733)) break;
            v0 /* !! */  = (long)mh.jhdw("jizf", jhdt(int ), (int)734);
        }
        var3_1 = mh.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mh.rl - mh.jhdw("jizg", jhfs(int ), (int)218)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == mh.jhdw("jizh", jhdt(int ), (int)735)) break;
            v1 /* !! */  = (long)mh.jhdw("jizi", jhdt(int ), (int)736);
        }
        var2_2 /* !! */  = mh.b;
        v2 /* !! */  = mh.rl;
        if (true) ** GOTO lbl17
        block20: while (true) {
            v2 /* !! */  = (long)(v3 - mh.jhdw("jizj", jhfs(int ), (int)219));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1514521045: {
                    v3 = mh.jhdw("jizk", jhfs(int ), (int)220);
                    continue block20;
                }
                case -1225776778: {
                    break block20;
                }
                case 1689335463: {
                    v3 = mh.jhdw("jizl", jhfs(int ), (int)221);
                    continue block20;
                }
            }
            break;
        }
        var1_3 = mh.a;
        if (var3_1) {
            throw null;
lbl29:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = mh.rl - mh.jhdw("jizm", jhfs(int ), (int)222)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == mh.jhdw("jizn", jhdt(int ), (int)737)) break;
            v4 /* !! */  = (long)mh.jhdw("jizo", jhdt(int ), (int)738);
        }
        v5 = class_156.method_668();
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = mh.rl - mh.jhdw("jizp", jhfs(int ), (int)223)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == mh.jhdw("jizq", jhdt(int ), (int)739)) break;
            v6 /* !! */  = (long)mh.jhdw("jizr", jhdt(int ), (int)740);
        }
        v7 = URI.create(var0);
        v8 /* !! */  = mh.rl;
        if (true) ** GOTO lbl48
        block24: while (true) {
            v8 /* !! */  = (long)(v9 - mh.jhdw("jizs", jhfs(int ), (int)224));
lbl48:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1225776778: {
                    break block24;
                }
                case 1801202123: {
                    v9 = mh.jhdw("jizt", jhfs(int ), (int)225);
                    continue block24;
                }
                case 2073675697: {
                    v9 = mh.jhdw("jizu", jhfs(int ), (int)226);
                    continue block24;
                }
            }
            break;
        }
        v5.method_673(v7);
        if (var1_3) ** GOTO lbl29
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
                var2_2 /* !! */  = (int)mh.jhdw("jizv", jhdt(int ), (int)741);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)mh.jhdw("jizw", jhdt(int ), (int)742);
                if (!var3_1) break;
                throw null;
            }
lbl73:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)mh.jhdw("jizx", jhdt(int ), (int)743);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl82
            }
            case 3: {
                var2_2 /* !! */  = (int)mh.jhdw("jizy", jhdt(int ), (int)744);
                if (!var3_1) ** GOTO lbl73
                throw null;
            }
lbl82:
            // 2 sources

            case 4: {
                do {
                    var2_2 /* !! */  = (int)mh.jhdw("jizz", jhdt(int ), (int)745);
                } while (!var3_1);
                throw null;
            }
            case 5: 
        }
        do {
            var2_2 /* !! */  = (int)mh.jhdw("jjaa", jhdt(int ), (int)746);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ long jhfs(int n2) {
        return jhft[n2] ^ jhfu[n2];
    }

    private static /* synthetic */ void jjew() {
        mh.jhdv[100] = -1043783313;
        mh.jhdv[101] = -696200818;
        mh.jhdv[102] = 837090994;
        mh.jhdv[103] = 1448816440;
        mh.jhdv[104] = 1505115216;
        mh.jhdv[105] = -757069020;
        mh.jhdv[106] = 586675040;
        mh.jhdv[107] = 381199457;
        mh.jhdv[108] = 1002949983;
        mh.jhdv[109] = 1486303273;
        mh.jhdv[110] = 1072303732;
        mh.jhdv[111] = -2078279026;
        mh.jhdv[112] = 970236795;
        mh.jhdv[113] = -2082830771;
        mh.jhdv[114] = 115360825;
        mh.jhdv[115] = -1673390046;
        mh.jhdv[116] = -968788896;
        mh.jhdv[117] = -1765021934;
        mh.jhdv[118] = 84939337;
        mh.jhdv[119] = -1811948936;
        mh.jhdv[120] = 1076904084;
        mh.jhdv[121] = -879288346;
        mh.jhdv[122] = -1248436211;
        mh.jhdv[123] = 944653844;
        mh.jhdv[124] = -1075342971;
        mh.jhdv[125] = -1620328590;
        mh.jhdv[126] = -37919869;
        mh.jhdv[127] = -2144270821;
        mh.jhdv[128] = 1021070548;
        mh.jhdv[129] = -773339503;
        mh.jhdv[130] = -1443312050;
        mh.jhdv[131] = 743781614;
        mh.jhdv[132] = 1068961866;
        mh.jhdv[133] = -922092701;
        mh.jhdv[134] = -1362235944;
        mh.jhdv[135] = 1031073771;
        mh.jhdv[136] = 512390518;
        mh.jhdv[137] = -1454656606;
        mh.jhdv[138] = 1429469522;
        mh.jhdv[139] = 1504125829;
        mh.jhdv[140] = 971102417;
        mh.jhdv[141] = 75628822;
        mh.jhdv[142] = -465131134;
        mh.jhdv[143] = -187802301;
        mh.jhdv[144] = 1949911252;
        mh.jhdv[145] = -925387025;
        mh.jhdv[146] = -526761413;
        mh.jhdv[147] = 1291752330;
        mh.jhdv[148] = -188464719;
        mh.jhdv[149] = -1530114148;
        mh.jhdv[150] = 148902075;
        mh.jhdv[151] = 38063664;
        mh.jhdv[152] = -380277680;
        mh.jhdv[153] = 1546508670;
        mh.jhdv[154] = 1558834261;
        mh.jhdv[155] = 132662350;
        mh.jhdv[156] = 391432596;
        mh.jhdv[157] = -2038924578;
        mh.jhdv[158] = 970104143;
        mh.jhdv[159] = -2143354023;
        mh.jhdv[160] = -506016287;
        mh.jhdv[161] = -1089093343;
        mh.jhdv[162] = -502575603;
        mh.jhdv[163] = 1128100723;
        mh.jhdv[164] = 1527460066;
        mh.jhdv[165] = 551890745;
        mh.jhdv[166] = -1318294930;
        mh.jhdv[167] = -628536066;
        mh.jhdv[168] = 1566733703;
        mh.jhdv[169] = -1894072481;
        mh.jhdv[170] = -1234529931;
        mh.jhdv[171] = 1229837170;
        mh.jhdv[172] = 1630891597;
        mh.jhdv[173] = 353848318;
        mh.jhdv[174] = 1215724843;
        mh.jhdv[175] = -1147639440;
        mh.jhdv[176] = 782909889;
        mh.jhdv[177] = 145363954;
        mh.jhdv[178] = 1922630852;
        mh.jhdv[179] = 1172427287;
        mh.jhdv[180] = -851004602;
        mh.jhdv[181] = -2056663567;
        mh.jhdv[182] = 113941760;
        mh.jhdv[183] = -757484651;
        mh.jhdv[184] = 1398256661;
        mh.jhdv[185] = -272171191;
        mh.jhdv[186] = -325584172;
        mh.jhdv[187] = -1328599296;
        mh.jhdv[188] = -481132411;
        mh.jhdv[189] = 174098891;
        mh.jhdv[190] = -1566852023;
        mh.jhdv[191] = 1785373029;
        mh.jhdv[192] = 752078220;
        mh.jhdv[193] = -1824611065;
        mh.jhdv[194] = 7289763;
        mh.jhdv[195] = -1793465823;
        mh.jhdv[196] = -567948667;
        mh.jhdv[197] = -1742227783;
        mh.jhdv[198] = 2083713220;
        mh.jhdv[199] = 1943114351;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean contains(float var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mh.rl - mh.jhdw("jjab", jhfs(int ), (int)227)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mh.jhdw("jjac", jhdt(int ), (int)747)) break;
            v0 /* !! */  = (long)mh.jhdw("jjad", jhdt(int ), (int)748);
        }
        var8_6 = mh.c;
        v1 /* !! */  = mh.rl;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - mh.jhdw("jjae", jhfs(int ), (int)228));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1524740099: {
                    v2 = mh.jhdw("jjaf", jhfs(int ), (int)229);
                    continue block19;
                }
                case -1225776778: {
                    break block19;
                }
                case 1177805869: {
                    v2 = mh.jhdw("jjag", jhfs(int ), (int)230);
                    continue block19;
                }
            }
            break;
        }
        var7_7 /* !! */  = mh.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mh.rl - mh.jhdw("jjah", jhfs(int ), (int)231)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mh.jhdw("jjai", jhdt(int ), (int)749)) break;
            v3 /* !! */  = (long)mh.jhdw("jjaj", jhdt(int ), (int)750);
        }
        var6_8 = mh.a;
        if (var8_6) {
            throw null;
lbl31:
            // 6 sources

            return (boolean)mh.jhdw("jjak", jhdt(int ), (int)751);
        }
        if (var6_8 || var6_8) ** GOTO lbl31
        if (!(var0 >= var2_2)) ** GOTO lbl49
        if (var6_8) ** GOTO lbl31
        if (!(var0 <= var2_2 + var4_4)) ** GOTO lbl49
        if (var6_8) ** GOTO lbl31
        if (!(var1_1 >= var3_3)) ** GOTO lbl49
        if (var6_8) ** GOTO lbl31
        if (!(var1_1 <= var3_3 + var5_5)) ** GOTO lbl49
        if (var7_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_8) ** GOTO lbl31
                v4 = mh.jhdw("jjal", jhdt(int ), (int)752);
                if (var8_6) {
                    throw null;
                }
                ** GOTO lbl52
            }
lbl49:
            // 4 sources

            if (!var6_8 && !var6_8) ** break;
            ** continue;
            v4 = mh.jhdw("jjam", jhdt(int ), (int)753);
lbl52:
            // 2 sources

            return (boolean)v4;
            case 0: {
                var7_7 /* !! */  = (int)mh.jhdw("jjan", jhdt(int ), (int)754);
                if (var8_6) {
                    throw null;
                }
                ** GOTO lbl78
            }
            case 1: {
                var7_7 /* !! */  = (int)mh.jhdw("jjao", jhdt(int ), (int)755);
                if (!var8_6) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_7 /* !! */  = (int)mh.jhdw("jjap", jhdt(int ), (int)756);
                    if (var8_6) {
                        throw null;
                    }
                    ** GOTO lbl73
                    break;
                }
            }
            case 3: {
                var7_7 /* !! */  = (int)mh.jhdw("jjaq", jhdt(int ), (int)757);
                if (var8_6) {
                    throw null;
                }
                ** GOTO lbl95
            }
lbl73:
            // 3 sources

            case 4: {
                do {
                    var7_7 /* !! */  = (int)mh.jhdw("jjar", jhdt(int ), (int)758);
                } while (!var8_6);
                throw null;
            }
lbl78:
            // 2 sources

            case 5: {
                var7_7 /* !! */  = (int)mh.jhdw("jjas", jhdt(int ), (int)759);
                if (!var8_6) break;
                throw null;
            }
            case 6: {
                var7_7 /* !! */  = (int)mh.jhdw("jjat", jhdt(int ), (int)760);
                if (!var8_6) break;
                throw null;
            }
lbl86:
            // 2 sources

            case 7: {
                var7_7 /* !! */  = (int)mh.jhdw("jjau", jhdt(int ), (int)761);
                if (var8_6) {
                    throw null;
                }
                ** GOTO lbl95
            }
            case 8: {
                var7_7 /* !! */  = (int)mh.jhdw("jjav", jhdt(int ), (int)762);
                if (!var8_6) ** GOTO lbl73
                throw null;
            }
lbl95:
            // 3 sources

            case 9: {
                var7_7 /* !! */  = (int)mh.jhdw("jjaw", jhdt(int ), (int)763);
                if (!var8_6) ** GOTO lbl86
                throw null;
            }
            case 10: 
        }
        var7_7 /* !! */  = (int)mh.jhdw("jjax", jhdt(int ), (int)764);
        ** while (!var8_6)
lbl102:
        // 1 sources

        throw null;
    }
}

