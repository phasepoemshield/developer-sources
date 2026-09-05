/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1713
 *  net.minecraft.class_1735
 *  net.minecraft.class_1792
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1792;
import ruhack.phobia.aw;
import ruhack.phobia.br;
import ruhack.phobia.ce;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kg;
import ruhack.phobia.nv;
import ruhack.phobia.pn;
import ruhack.phobia.pr;

public class ez
extends ds {
    private static long[] bgcv;
    private final kg scrollerSetting;
    private static long[] bgcw;
    private static int[] bgch;
    private final pr stopWatch;
    public static final int b;
    static final long dg = -4531044249207607361L;
    public static final boolean c;
    public static final boolean a;
    private static int[] bgci;

    /*
     * Handled duff style switch with additional control
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void lambda$processSlotClick$1(br br2, class_1735 class_17352) {
        Object object = dg;
        boolean bl2 = true;
        block35: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - ez.bgcj("bgpm", bgcu(int ), (int)167);
            }
            switch ((int)object) {
                case 140996543: {
                    break block35;
                }
                case 885396083: {
                    callSite = ez.bgcj("bgpn", bgcu(int ), (int)168);
                    continue block35;
                }
                case 1239705682: {
                    callSite = ez.bgcj("bgpo", bgcu(int ), (int)169);
                    continue block35;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = dg;
        boolean bl4 = true;
        block36: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - ez.bgcj("bgpp", bgcu(int ), (int)170);
            }
            switch ((int)object2) {
                case 140996543: {
                    break block36;
                }
                case 551373154: {
                    callSite = ez.bgcj("bgpq", bgcu(int ), (int)171);
                    continue block36;
                }
                case 1020696122: {
                    callSite = ez.bgcj("bgpr", bgcu(int ), (int)172);
                    continue block36;
                }
                case 2101797225: {
                    callSite = ez.bgcj("bgps", bgcu(int ), (int)173);
                    continue block36;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = dg;
        boolean bl5 = true;
        block37: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object3 = callSite - ez.bgcj("bgpt", bgcu(int ), (int)174);
            }
            switch ((int)object3) {
                case -1871281199: {
                    callSite = ez.bgcj("bgpu", bgcu(int ), (int)175);
                    continue block37;
                }
                case -1574189093: {
                    callSite = ez.bgcj("bgpv", bgcu(int ), (int)176);
                    continue block37;
                }
                case -318835539: {
                    callSite = ez.bgcj("bgpw", bgcu(int ), (int)177);
                    continue block37;
                }
                case 140996543: {
                    break block37;
                }
            }
            break;
        }
        boolean bl6 = a;
        if (bl3) {
            throw null;
        }
        if (bl6 || bl6) return;
        Object object4 = dg;
        boolean bl7 = true;
        block38: while (true) {
            CallSite callSite;
            if (!bl7 || (bl7 = false) || !true) {
                object4 = callSite - ez.bgcj("bgpx", bgcu(int ), (int)178);
            }
            switch ((int)object4) {
                case -327877148: {
                    callSite = ez.bgcj("bgpy", bgcu(int ), (int)179);
                    continue block38;
                }
                case -21943817: {
                    callSite = ez.bgcj("bgpz", bgcu(int ), (int)180);
                    continue block38;
                }
                case 140996543: {
                    break block38;
                }
                case 1730567669: {
                    callSite = ez.bgcj("bgqa", bgcu(int ), (int)181);
                    continue block38;
                }
            }
            break;
        }
        int n3 = class_17352.field_7874;
        CallSite callSite = ez.bgcj("bgqb", bgcl(int ), (int)168);
        Object object5 = dg;
        boolean bl8 = true;
        block39: while (true) {
            CallSite callSite2;
            if (!bl8 || (bl8 = false) || !true) {
                object5 = callSite2 - ez.bgcj("bgqc", bgcu(int ), (int)182);
            }
            switch ((int)object5) {
                case -1733258612: {
                    callSite2 = ez.bgcj("bgqd", bgcu(int ), (int)183);
                    continue block39;
                }
                case -563005616: {
                    callSite2 = ez.bgcj("bgqe", bgcu(int ), (int)184);
                    continue block39;
                }
                case 140996543: {
                    break block39;
                }
            }
            break;
        }
        class_1713 class_17132 = br2.getActionType();
        while (true) {
            long l2;
            Object object6;
            if ((object6 = (l2 = dg - ez.bgcj("bgqf", bgcu(int ), (int)185)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object6 == ez.bgcj("bgqg", bgcl(int ), (int)169)) {
                nv.click(n3, (int)callSite, class_17132);
                if (bl6) return;
                break;
            }
            object6 = ez.bgcj("bgqh", bgcl(int ), (int)170);
        }
        boolean bl9 = true;
        block41: do {
            int n4;
            if (bl9 && !(bl9 = false)) {
                if (n2 == 0) return;
                n4 = Integer.MIN_VALUE;
            }
            switch (n4 == Integer.MIN_VALUE ? n2 : n4) {
                default: {
                    return;
                }
                case 0: {
                    CallSite callSite3 = ez.bgcj("bgqi", bgcl(int ), (int)171);
                    n4 = 2;
                    if (!bl3) continue block41;
                    throw null;
                }
                case 1: {
                    CallSite callSite4 = ez.bgcj("bgqj", bgcl(int ), (int)172);
                    if (!bl3) break;
                    throw null;
                }
                case 2: {
                    CallSite callSite5 = ez.bgcj("bgqk", bgcl(int ), (int)173);
                    if (!bl3) break;
                    throw null;
                }
                case 3: {
                    do {
                        CallSite callSite6 = ez.bgcj("bgql", bgcl(int ), (int)174);
                    } while (!bl3);
                    throw null;
                }
                case 4: 
            }
            break;
        } while (true);
        do {
            CallSite callSite7 = ez.bgcj("bgqm", bgcl(int ), (int)175);
        } while (!bl3);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onHandledScreen(ce var1_1) {
        v0 /* !! */  = ez.dg;
        if (true) ** GOTO lbl5
        block90: while (true) {
            v0 /* !! */  = (long)(ez.bgcj("bgcy", bgcu(int ), (int)1) - ez.bgcj("bgcx", bgcu(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 140996543: {
                    break block90;
                }
                case 1688351028: {
                    continue block90;
                }
            }
            break;
        }
        var6_2 = ez.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ez.dg - ez.bgcj("bgcz", bgcu(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ez.bgcj("bgda", bgcl(int ), (int)9)) break;
            v1 /* !! */  = (long)ez.bgcj("bgdb", bgcl(int ), (int)10);
        }
        var5_3 /* !! */  = ez.b;
        v2 /* !! */  = ez.dg;
        if (true) ** GOTO lbl21
        block92: while (true) {
            v2 /* !! */  = (long)(v3 - ez.bgcj("bgdc", bgcu(int ), (int)3));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -998564629: {
                    v3 = ez.bgcj("bgdd", bgcu(int ), (int)4);
                    continue block92;
                }
                case 140996543: {
                    break block92;
                }
                case 243265616: {
                    v3 = ez.bgcj("bgde", bgcu(int ), (int)5);
                    continue block92;
                }
                case 1889667678: {
                    v3 = ez.bgcj("bgdf", bgcu(int ), (int)6);
                    continue block92;
                }
            }
            break;
        }
        var4_4 = ez.a;
        if (var6_2) {
            throw null;
lbl36:
            // 13 sources

            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl36
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = ez.dg - ez.bgcj("bgdg", bgcu(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ez.bgcj("bgdh", bgcl(int ), (int)11)) break;
            v4 /* !! */  = (long)ez.bgcj("bgdi", bgcl(int ), (int)12);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = ez.dg - ez.bgcj("bgdj", bgcu(int ), (int)8)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ez.bgcj("bgdk", bgcl(int ), (int)13)) break;
            v5 /* !! */  = (long)ez.bgcj("bgdl", bgcl(int ), (int)14);
        }
        if (ez.mc.field_1724 != null) ** GOTO lbl55
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl36
                return;
            }
lbl55:
            // 1 sources

            if (var4_4 || var4_4) ** GOTO lbl36
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_3 = ez.dg - ez.bgcj("bgdm", bgcu(int ), (int)9)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == ez.bgcj("bgdn", bgcl(int ), (int)15)) break;
                v6 /* !! */  = (long)ez.bgcj("bgdo", bgcl(int ), (int)16);
            }
            var2_5 = var1_1.getSlotHover();
            if (var4_4 || var4_4) ** GOTO lbl36
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_4 = ez.dg - ez.bgcj("bgdp", bgcu(int ), (int)10)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == ez.bgcj("bgdq", bgcl(int ), (int)17)) break;
                v7 /* !! */  = (long)ez.bgcj("bgdr", bgcl(int ), (int)18);
            }
            var3_6 = this.getActionType();
            if (var4_4 || var4_4) ** GOTO lbl36
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_5 = ez.dg - ez.bgcj("bgds", bgcu(int ), (int)11)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == ez.bgcj("bgdt", bgcl(int ), (int)19)) break;
                v8 /* !! */  = (long)ez.bgcj("bgdu", bgcl(int ), (int)20);
            }
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_6 = ez.dg - ez.bgcj("bgdv", bgcu(int ), (int)12)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == ez.bgcj("bgdw", bgcl(int ), (int)21)) break;
                v9 /* !! */  = (long)ez.bgcj("bgdx", bgcl(int ), (int)22);
            }
            v10 = ez.mc.field_1690;
            v11 /* !! */  = ez.dg;
            if (true) ** GOTO lbl85
            block100: while (true) {
                v11 /* !! */  = (long)(v12 - ez.bgcj("bgdy", bgcu(int ), (int)13));
lbl85:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -1977926582: {
                        v12 = ez.bgcj("bgdz", bgcu(int ), (int)14);
                        continue block100;
                    }
                    case -1297896333: {
                        v12 = ez.bgcj("bgea", bgcu(int ), (int)15);
                        continue block100;
                    }
                    case 48789135: {
                        v12 = ez.bgcj("bgeb", bgcu(int ), (int)16);
                        continue block100;
                    }
                    case 140996543: {
                        break block100;
                    }
                }
                break;
            }
            v13 = v10.field_1832;
            v14 /* !! */  = ez.dg;
            if (true) ** GOTO lbl102
            block101: while (true) {
                v14 /* !! */  = (long)(ez.bgcj("bged", bgcu(int ), (int)18) - ez.bgcj("bgec", bgcu(int ), (int)17));
lbl102:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case 140996543: {
                        break block101;
                    }
                    case 2024305670: {
                        continue block101;
                    }
                }
                break;
            }
            if (!pn.isKey(v13)) ** GOTO lbl268
            if (var4_4) ** GOTO lbl36
            v15 /* !! */  = ez.dg;
            if (true) ** GOTO lbl113
            block102: while (true) {
                v15 /* !! */  = (long)(v16 - ez.bgcj("bgee", bgcu(int ), (int)19));
lbl113:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -1464295727: {
                        v16 = ez.bgcj("bgef", bgcu(int ), (int)20);
                        continue block102;
                    }
                    case 140996543: {
                        break block102;
                    }
                    case 1052541465: {
                        v16 = ez.bgcj("bgeg", bgcu(int ), (int)21);
                        continue block102;
                    }
                    case 1694905379: {
                        v16 = ez.bgcj("bgeh", bgcu(int ), (int)22);
                        continue block102;
                    }
                }
                break;
            }
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_7 = ez.dg - ez.bgcj("bgei", bgcu(int ), (int)23)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == ez.bgcj("bgej", bgcl(int ), (int)23)) break;
                v17 /* !! */  = (long)ez.bgcj("bgek", bgcl(int ), (int)24);
            }
            v18 = ez.mc.field_1690;
            while (true) {
                if ((v19 /* !! */  = (cfr_temp_8 = ez.dg - ez.bgcj("bgel", bgcu(int ), (int)24)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v19 /* !! */  == ez.bgcj("bgem", bgcl(int ), (int)25)) break;
                v19 /* !! */  = (long)ez.bgcj("bgen", bgcl(int ), (int)26);
            }
            v20 = v18.field_1867;
            v21 /* !! */  = ez.dg;
            if (true) ** GOTO lbl141
            block105: while (true) {
                v21 /* !! */  = (long)(ez.bgcj("bgep", bgcu(int ), (int)26) - ez.bgcj("bgeo", bgcu(int ), (int)25));
lbl141:
                // 2 sources

                switch ((int)v21 /* !! */ ) {
                    case 140996543: {
                        break block105;
                    }
                    case 1192721920: {
                        continue block105;
                    }
                }
                break;
            }
            if (pn.isKey(v20)) ** GOTO lbl268
            if (var4_4) ** GOTO lbl36
            if (var2_5 == null) ** GOTO lbl268
            if (var4_4) ** GOTO lbl36
            v22 /* !! */  = ez.dg;
            if (true) ** GOTO lbl154
            block106: while (true) {
                v22 /* !! */  = (long)(v23 - ez.bgcj("bgeq", bgcu(int ), (int)27));
lbl154:
                // 2 sources

                switch ((int)v22 /* !! */ ) {
                    case -1581899712: {
                        v23 = ez.bgcj("bger", bgcu(int ), (int)28);
                        continue block106;
                    }
                    case -1532415991: {
                        v23 = ez.bgcj("bges", bgcu(int ), (int)29);
                        continue block106;
                    }
                    case -1243582230: {
                        v23 = ez.bgcj("bget", bgcu(int ), (int)30);
                        continue block106;
                    }
                    case 140996543: {
                        break block106;
                    }
                }
                break;
            }
            if (!var2_5.method_7681()) ** GOTO lbl268
            if (var4_4) ** GOTO lbl36
            if (var3_6 == null) ** GOTO lbl268
            if (var4_4) ** GOTO lbl36
            v24 /* !! */  = ez.dg;
            if (true) ** GOTO lbl174
            block107: while (true) {
                v24 /* !! */  = (long)(v25 - ez.bgcj("bgeu", bgcu(int ), (int)31));
lbl174:
                // 2 sources

                switch ((int)v24 /* !! */ ) {
                    case -1182664444: {
                        v25 = ez.bgcj("bgev", bgcu(int ), (int)32);
                        continue block107;
                    }
                    case -804017915: {
                        v25 = ez.bgcj("bgew", bgcu(int ), (int)33);
                        continue block107;
                    }
                    case 140996543: {
                        break block107;
                    }
                    case 1553005635: {
                        v25 = ez.bgcj("bgex", bgcu(int ), (int)34);
                        continue block107;
                    }
                }
                break;
            }
            v26 /* !! */  = ez.dg;
            if (true) ** GOTO lbl190
            block108: while (true) {
                v26 /* !! */  = (long)(ez.bgcj("bgez", bgcu(int ), (int)36) - ez.bgcj("bgey", bgcu(int ), (int)35));
lbl190:
                // 2 sources

                switch ((int)v26 /* !! */ ) {
                    case 140996543: {
                        break block108;
                    }
                    case 350737335: {
                        continue block108;
                    }
                }
                break;
            }
            v27 /* !! */  = ez.dg;
            if (true) ** GOTO lbl199
            block109: while (true) {
                v27 /* !! */  = (long)(v28 - ez.bgcj("bgfa", bgcu(int ), (int)37));
lbl199:
                // 2 sources

                switch ((int)v27 /* !! */ ) {
                    case -872963747: {
                        v28 = ez.bgcj("bgfb", bgcu(int ), (int)38);
                        continue block109;
                    }
                    case -803054706: {
                        v28 = ez.bgcj("bgfc", bgcu(int ), (int)39);
                        continue block109;
                    }
                    case -182898185: {
                        v28 = ez.bgcj("bgfd", bgcu(int ), (int)40);
                        continue block109;
                    }
                    case 140996543: {
                        break block109;
                    }
                }
                break;
            }
            v29 = this.scrollerSetting.getValue();
            while (true) {
                if ((v30 /* !! */  = (cfr_temp_9 = ez.dg - ez.bgcj("bgfe", bgcu(int ), (int)41)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                if (v30 /* !! */  == ez.bgcj("bgff", bgcl(int ), (int)27)) break;
                v30 /* !! */  = (long)ez.bgcj("bgfg", bgcl(int ), (int)28);
            }
            if (!this.stopWatch.every(v29)) ** GOTO lbl268
            if (var4_4 || var4_4) ** GOTO lbl36
            v31 /* !! */  = ez.dg;
            if (true) ** GOTO lbl223
            block111: while (true) {
                v31 /* !! */  = (long)(ez.bgcj("bgfi", bgcu(int ), (int)43) - ez.bgcj("bgfh", bgcu(int ), (int)42));
lbl223:
                // 2 sources

                switch ((int)v31 /* !! */ ) {
                    case -725712190: {
                        continue block111;
                    }
                    case 140996543: {
                        break block111;
                    }
                }
                break;
            }
            v32 = var2_5.field_7874;
            v33 /* !! */  = ez.dg;
            if (true) ** GOTO lbl233
            block112: while (true) {
                v33 /* !! */  = (long)(v34 - ez.bgcj("bgfj", bgcu(int ), (int)44));
lbl233:
                // 2 sources

                switch ((int)v33 /* !! */ ) {
                    case -1426594214: {
                        v34 = ez.bgcj("bgfk", bgcu(int ), (int)45);
                        continue block112;
                    }
                    case 140996543: {
                        break block112;
                    }
                    case 2009335512: {
                        v34 = ez.bgcj("bgfl", bgcu(int ), (int)46);
                        continue block112;
                    }
                }
                break;
            }
            while (true) {
                if ((v35 /* !! */  = (cfr_temp_10 = ez.dg - ez.bgcj("bgfm", bgcu(int ), (int)47)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                if (v35 /* !! */  == ez.bgcj("bgfn", bgcl(int ), (int)29)) break;
                v35 /* !! */  = (long)ez.bgcj("bgfo", bgcl(int ), (int)30);
            }
            if (var3_6.equals((Object)class_1713.field_7795)) {
                v36 = ez.bgcj("bgfp", bgcl(int ), (int)31);
                if (var6_2) {
                    throw null;
                }
            } else {
                v36 = ez.bgcj("bgfq", bgcl(int ), (int)32);
            }
            v37 /* !! */  = ez.dg;
            if (true) ** GOTO lbl257
            block114: while (true) {
                v37 /* !! */  = (long)(v38 - ez.bgcj("bgfr", bgcu(int ), (int)48));
lbl257:
                // 2 sources

                switch ((int)v37 /* !! */ ) {
                    case -1817695209: {
                        v38 = ez.bgcj("bgfs", bgcu(int ), (int)49);
                        continue block114;
                    }
                    case -561649487: {
                        v38 = ez.bgcj("bgft", bgcu(int ), (int)50);
                        continue block114;
                    }
                    case 140996543: {
                        break block114;
                    }
                }
                break;
            }
            nv.click(v32, (int)v36, var3_6);
            if (var4_4) ** GOTO lbl36
lbl268:
            // 7 sources

            if (!var4_4 && !var4_4) ** break;
            ** continue;
            return;
lbl271:
            // 4 sources

            case 0: {
                var5_3 /* !! */  = (int)ez.bgcj("bgfu", bgcl(int ), (int)33);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl317
            }
lbl276:
            // 3 sources

            case 1: {
                var5_3 /* !! */  = (int)ez.bgcj("bgfv", bgcl(int ), (int)34);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl357
            }
            case 2: {
                var5_3 /* !! */  = (int)ez.bgcj("bgfw", bgcl(int ), (int)35);
                if (!var6_2) ** GOTO lbl276
                throw null;
            }
            case 3: {
                var5_3 /* !! */  = (int)ez.bgcj("bgfx", bgcl(int ), (int)36);
                if (!var6_2) ** GOTO lbl271
                throw null;
            }
            case 4: {
                var5_3 /* !! */  = (int)ez.bgcj("bgfy", bgcl(int ), (int)37);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl357
            }
            case 5: {
                var5_3 /* !! */  = (int)ez.bgcj("bgfz", bgcl(int ), (int)38);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl336
            }
lbl299:
            // 2 sources

            case 6: {
                var5_3 /* !! */  = (int)ez.bgcj("bgga", bgcl(int ), (int)39);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl345
            }
            case 7: {
                var5_3 /* !! */  = (int)ez.bgcj("bggb", bgcl(int ), (int)40);
                if (!var6_2) ** GOTO lbl271
                throw null;
            }
lbl308:
            // 2 sources

            case 8: {
                var5_3 /* !! */  = (int)ez.bgcj("bggc", bgcl(int ), (int)41);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl322
            }
lbl313:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)ez.bgcj("bggd", bgcl(int ), (int)42);
                if (!var6_2) ** GOTO lbl271
                throw null;
            }
lbl317:
            // 2 sources

            case 10: {
                do {
                    var5_3 /* !! */  = (int)ez.bgcj("bgge", bgcl(int ), (int)43);
                } while (!var6_2);
                throw null;
            }
lbl322:
            // 3 sources

            case 11: {
                var5_3 /* !! */  = (int)ez.bgcj("bggf", bgcl(int ), (int)44);
                if (!var6_2) ** GOTO lbl276
                throw null;
            }
            case 12: {
                do {
                    var5_3 /* !! */  = (int)ez.bgcj("bggg", bgcl(int ), (int)45);
                } while (!var6_2);
                throw null;
            }
            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)ez.bgcj("bggh", bgcl(int ), (int)46);
                    if (!var6_2) ** GOTO lbl322
                    throw null;
                }
            }
lbl336:
            // 4 sources

            case 14: {
                var5_3 /* !! */  = (int)ez.bgcj("bggi", bgcl(int ), (int)47);
                if (!var6_2) break;
                throw null;
            }
            case 15: {
                var5_3 /* !! */  = (int)ez.bgcj("bggj", bgcl(int ), (int)48);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl361
            }
lbl345:
            // 2 sources

            case 16: {
                var5_3 /* !! */  = (int)ez.bgcj("bggk", bgcl(int ), (int)49);
                if (!var6_2) ** GOTO lbl336
                throw null;
            }
            case 17: {
                var5_3 /* !! */  = (int)ez.bgcj("bggl", bgcl(int ), (int)50);
                if (!var6_2) ** GOTO lbl336
                throw null;
            }
            case 18: {
                var5_3 /* !! */  = (int)ez.bgcj("bggm", bgcl(int ), (int)51);
                if (!var6_2) ** GOTO lbl299
                throw null;
            }
lbl357:
            // 3 sources

            case 19: {
                var5_3 /* !! */  = (int)ez.bgcj("bggn", bgcl(int ), (int)52);
                if (!var6_2) ** GOTO lbl313
                throw null;
            }
lbl361:
            // 2 sources

            case 20: {
                var5_3 /* !! */  = (int)ez.bgcj("bggo", bgcl(int ), (int)53);
                if (!var6_2) ** GOTO lbl308
                throw null;
            }
            case 21: 
        }
        var5_3 /* !! */  = (int)ez.bgcj("bggp", bgcl(int ), (int)54);
        ** while (!var6_2)
lbl368:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float bgcg(int n2) {
        return Float.intBitsToFloat(bgch[n2] ^ bgci[n2]);
    }

    public static /* synthetic */ CallSite bgcj(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void bgwx() {
        ez.bgcv[100] = 4645594535010379929L;
        ez.bgcv[101] = -667941144828677898L;
        ez.bgcv[102] = -7875298442377050442L;
        ez.bgcv[103] = 2245819787033968170L;
        ez.bgcv[104] = -6339801760974679387L;
        ez.bgcv[105] = -3380929947407932588L;
        ez.bgcv[106] = 3294250347266826790L;
        ez.bgcv[107] = -7464368455372006423L;
        ez.bgcv[108] = -6855605580534285864L;
        ez.bgcv[109] = -7456590174124452694L;
        ez.bgcv[110] = 837657809559171675L;
        ez.bgcv[111] = -6691385204790451165L;
        ez.bgcv[112] = -7945078370356630497L;
        ez.bgcv[113] = -3347015186157026150L;
        ez.bgcv[114] = -5030667722489124102L;
        ez.bgcv[115] = -6217750860526363895L;
        ez.bgcv[116] = 8351257236571948152L;
        ez.bgcv[117] = -4801223639175894800L;
        ez.bgcv[118] = 3224940330032527052L;
        ez.bgcv[119] = -6503787847275872628L;
        ez.bgcv[120] = -5695937901812587037L;
        ez.bgcv[121] = 436861411655606355L;
        ez.bgcv[122] = 710828335524602525L;
        ez.bgcv[123] = -7601030038286509854L;
        ez.bgcv[124] = 5978676769913515659L;
        ez.bgcv[125] = 1841131666621928917L;
        ez.bgcv[126] = -2932752607001772492L;
        ez.bgcv[127] = -7507914707230339264L;
        ez.bgcv[128] = -5788272302373585825L;
        ez.bgcv[129] = 5314979194346917600L;
        ez.bgcv[130] = -2887892769337276981L;
        ez.bgcv[131] = 2158006030309526297L;
        ez.bgcv[132] = -765604855302951527L;
        ez.bgcv[133] = -3810049972757153384L;
        ez.bgcv[134] = -1933597501363129738L;
        ez.bgcv[135] = -4917222833955171109L;
        ez.bgcv[136] = -676040687802300339L;
        ez.bgcv[137] = 3730235904466077602L;
        ez.bgcv[138] = 7628592533532271585L;
        ez.bgcv[139] = 7468045684059441997L;
        ez.bgcv[140] = 3977232728308215523L;
        ez.bgcv[141] = -735197673235380510L;
        ez.bgcv[142] = -3626815481593196707L;
        ez.bgcv[143] = -5119635050329575165L;
        ez.bgcv[144] = 3096242152160534921L;
        ez.bgcv[145] = 190165725034747213L;
        ez.bgcv[146] = 2862606324218788780L;
        ez.bgcv[147] = -2029207302055114476L;
        ez.bgcv[148] = 2287333035299902014L;
        ez.bgcv[149] = 6237588581792248635L;
        ez.bgcv[150] = -1859503883940485514L;
        ez.bgcv[151] = 3205585930651711801L;
        ez.bgcv[152] = -3854352089499803735L;
        ez.bgcv[153] = 8776049211912314930L;
        ez.bgcv[154] = -6517042511610025321L;
        ez.bgcv[155] = -953344360100920202L;
        ez.bgcv[156] = 6683394673345457476L;
        ez.bgcv[157] = -3534034196701496980L;
        ez.bgcv[158] = 7806146560470677995L;
        ez.bgcv[159] = -8463208989359775859L;
        ez.bgcv[160] = 154536449632812338L;
        ez.bgcv[161] = 5844624183507386899L;
        ez.bgcv[162] = 197411162142555817L;
        ez.bgcv[163] = 7406761843594239618L;
        ez.bgcv[164] = -1333359511369959258L;
        ez.bgcv[165] = 8579528395575281697L;
        ez.bgcv[166] = 4270628557844325926L;
        ez.bgcv[167] = 1536365683512960603L;
        ez.bgcv[168] = 7483989288889513272L;
        ez.bgcv[169] = -7521104254616392735L;
        ez.bgcv[170] = 6746035301196292242L;
        ez.bgcv[171] = -254845134189829988L;
        ez.bgcv[172] = 5575999282372120905L;
        ez.bgcv[173] = 3490272925022828930L;
        ez.bgcv[174] = -5963872941182983041L;
        ez.bgcv[175] = -5008672496093438907L;
        ez.bgcv[176] = -2473108329411575578L;
        ez.bgcv[177] = -2505431208628914424L;
        ez.bgcv[178] = 5937022240797404559L;
        ez.bgcv[179] = 908508705130442775L;
        ez.bgcv[180] = -3611828747733567140L;
        ez.bgcv[181] = -4686041825898020386L;
        ez.bgcv[182] = -5539774805259688877L;
        ez.bgcv[183] = -6246780135196838339L;
        ez.bgcv[184] = 7790596814780679305L;
        ez.bgcv[185] = 4939426652728476613L;
        ez.bgcv[186] = 5164197651768891126L;
        ez.bgcv[187] = 4153253459364201249L;
        ez.bgcv[188] = -2195433189701210527L;
        ez.bgcv[189] = 5394138059509723496L;
        ez.bgcv[190] = -6852908779969146155L;
        ez.bgcv[191] = 2266134150873810990L;
        ez.bgcv[192] = 2764792576562124938L;
        ez.bgcv[193] = -7646096652507699020L;
        ez.bgcv[194] = -7571817113625953493L;
        ez.bgcv[195] = 9219869071881248960L;
        ez.bgcv[196] = -9117449170593310205L;
        ez.bgcv[197] = -5122706494404793575L;
        ez.bgcv[198] = -6106270990123675356L;
        ez.bgcv[199] = 8149068829058144397L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ez() {
        var2_1 /* !! */  = ez.b;
        super("ItemScroller", "\u041f\u043e\u043c\u043e\u0433\u0430\u0435\u0442 \u0438\u0433\u0440\u043e\u043a\u0443 \u0441\u043a\u043b\u0430\u0434\u044b\u0432\u0430\u0442\u044c/\u0437\u0430\u0431\u0438\u0440\u0430\u0442\u044c \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b", du.MISC);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.stopWatch = new pr();
                this.scrollerSetting = new kg("\u0417\u0430\u0434\u0435\u0440\u0436\u043a\u0430 \u043f\u0440\u043e\u043a\u0440\u0443\u0442\u043a\u0438 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0437\u0430\u0434\u0435\u0440\u0436\u043a\u0443 \u043f\u0440\u043e\u043a\u0440\u0443\u0442\u043a\u0438 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432", (float)ez.bgcj("bgck", bgcg(int ), (int)0)).range((int)ez.bgcj("bgcm", bgcl(int ), (int)1), (int)ez.bgcj("bgcn", bgcl(int ), (int)2));
                this.settings(new jx[]{this.scrollerSetting});
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ez.bgcj("bgco", bgcl(int ), (int)3);
                    ** GOTO lbl21
                    break;
                }
            }
lbl14:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)ez.bgcj("bgcp", bgcl(int ), (int)4);
                ** GOTO lbl24
            }
lbl17:
            // 2 sources

            case 2: {
                while (true) {
                    var2_1 /* !! */  = (int)ez.bgcj("bgcq", bgcl(int ), (int)5);
                }
            }
lbl21:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)ez.bgcj("bgcr", bgcl(int ), (int)6);
                ** GOTO lbl17
            }
lbl24:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)ez.bgcj("bgcs", bgcl(int ), (int)7);
                ** GOTO lbl14
            }
            case 5: 
        }
        var2_1 /* !! */  = (int)ez.bgcj("bgct", bgcl(int ), (int)8);
        ** while (true)
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private class_1713 getActionType() {
        block74: {
            block73: {
                block77: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_1 = ez.dg - ez.bgcj("bggq", bgcu(int ), (int)51)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v0 /* !! */  == ez.bgcj("bggr", bgcl(int ), (int)55)) break;
                        v0 /* !! */  = (long)ez.bgcj("bggs", bgcl(int ), (int)56);
                    }
                    var3_1 = ez.c;
                    while (true) {
                        block75: {
                            if ((v1 /* !! */  = (cfr_temp_2 = ez.dg - ez.bgcj("bggt", bgcu(int ), (int)52)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v1 /* !! */  != ez.bgcj("bggu", bgcl(int ), (int)57)) break block75;
                            var2_2 /* !! */  = ez.b;
                            v2 /* !! */  = ez.dg;
                            if (true) ** GOTO lbl18
                        }
                        v1 /* !! */  = (long)ez.bgcj("bggv", bgcl(int ), (int)58);
                    }
                    block44: while (true) {
                        v2 /* !! */  = (long)(v3 - ez.bgcj("bggw", bgcu(int ), (int)53));
lbl18:
                        // 2 sources

                        switch ((int)v2 /* !! */ ) {
                            case -1524805351: {
                                v3 = ez.bgcj("bggx", bgcu(int ), (int)54);
                                continue block44;
                            }
                            case 140996543: {
                                break block44;
                            }
                            case 362061151: {
                                v3 = ez.bgcj("bggy", bgcu(int ), (int)55);
                                continue block44;
                            }
                            case 1379855295: {
                                v3 = ez.bgcj("bggz", bgcu(int ), (int)56);
                                continue block44;
                            }
                        }
                        break;
                    }
                    var1_3 = ez.a;
                    if (var3_1) {
                        throw null;
                    }
                    if (var1_3 != false) return null;
                    if (var1_3 != false) return null;
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_3 = ez.dg - ez.bgcj("bgha", bgcu(int ), (int)57)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v4 /* !! */  == ez.bgcj("bghb", bgcl(int ), (int)59)) break;
                        v4 /* !! */  = (long)ez.bgcj("bghc", bgcl(int ), (int)60);
                    }
                    while (true) {
                        block76: {
                            if ((v5 /* !! */  = (cfr_temp_4 = ez.dg - ez.bgcj("bghd", bgcu(int ), (int)58)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v5 /* !! */  != ez.bgcj("bghe", bgcl(int ), (int)61)) break block76;
                            v6 = ez.mc.field_1690;
                            v7 /* !! */  = ez.dg;
                            if (true) ** GOTO lbl51
                        }
                        v5 /* !! */  = (long)ez.bgcj("bghf", bgcl(int ), (int)62);
                    }
                    block47: while (true) {
                        v7 /* !! */  = (long)(v8 - ez.bgcj("bghg", bgcu(int ), (int)59));
lbl51:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -1933224117: {
                                v8 = ez.bgcj("bghh", bgcu(int ), (int)60);
                                continue block47;
                            }
                            case -1032783948: {
                                v8 = ez.bgcj("bghi", bgcu(int ), (int)61);
                                continue block47;
                            }
                            case 140996543: {
                                break block47;
                            }
                        }
                        break;
                    }
                    v9 = v6.field_1869;
                    v10 /* !! */  = ez.dg;
                    if (true) ** GOTO lbl65
                    block48: while (true) {
                        v10 /* !! */  = (long)(v11 - ez.bgcj("bghj", bgcu(int ), (int)62));
lbl65:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case -1984897336: {
                                v11 = ez.bgcj("bghk", bgcu(int ), (int)63);
                                continue block48;
                            }
                            case -115092307: {
                                v11 = ez.bgcj("bghl", bgcu(int ), (int)64);
                                continue block48;
                            }
                            case 11092222: {
                                v11 = ez.bgcj("bghm", bgcu(int ), (int)65);
                                continue block48;
                            }
                            case 140996543: {
                                break block48;
                            }
                        }
                        break;
                    }
                    if (!pn.isKey(v9)) break block77;
                    if (var1_3 != false) return null;
                    if (var1_3 != false) return null;
                    v12 /* !! */  = ez.dg;
                    if (true) ** GOTO lbl84
                    block49: while (true) {
                        v12 /* !! */  = (long)(v13 - ez.bgcj("bghn", bgcu(int ), (int)66));
lbl84:
                        // 2 sources

                        switch ((int)v12 /* !! */ ) {
                            case -1771316100: {
                                v13 = ez.bgcj("bgho", bgcu(int ), (int)67);
                                continue block49;
                            }
                            case -971361744: {
                                v13 = ez.bgcj("bghp", bgcu(int ), (int)68);
                                continue block49;
                            }
                            case 140996543: {
                                break block49;
                            }
                            case 1269232472: {
                                v13 = ez.bgcj("bghq", bgcu(int ), (int)69);
                                continue block49;
                            }
                        }
                        break;
                    }
                    v14 = class_1713.field_7795;
                    if (var3_1 == false) return v14;
                    throw null;
                }
                if (var1_3 != false) return null;
                if (var1_3 != false) return null;
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = ez.dg - ez.bgcj("bghr", bgcu(int ), (int)70)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == ez.bgcj("bghs", bgcl(int ), (int)63)) break;
                    v15 /* !! */  = (long)ez.bgcj("bght", bgcl(int ), (int)64);
                }
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_6 = ez.dg - ez.bgcj("bghu", bgcu(int ), (int)71)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == ez.bgcj("bghv", bgcl(int ), (int)65)) break;
                    v16 /* !! */  = (long)ez.bgcj("bghw", bgcl(int ), (int)66);
                }
                v17 = ez.mc.field_1690;
                v18 /* !! */  = ez.dg;
                block52: while (true) {
                    switch ((int)v18 /* !! */ ) {
                        case -151032652: {
                            v18 /* !! */  = (long)(ez.bgcj("bghy", bgcu(int ), (int)73) - ez.bgcj("bghx", bgcu(int ), (int)72));
                            continue block52;
                        }
                        case 140996543: {
                            break block52;
                        }
                    }
                    break;
                }
                v19 = v17.field_1886;
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_7 = ez.dg - ez.bgcj("bghz", bgcu(int ), (int)74)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == ez.bgcj("bgia", bgcl(int ), (int)67)) {
                        if (pn.isKey(v19)) {
                            break;
                        }
                        break block73;
                    }
                    v20 /* !! */  = (long)ez.bgcj("bgib", bgcl(int ), (int)68);
                }
                if (var1_3 != false) return null;
                if (var1_3 != false) return null;
                ** GOTO lbl191
            }
            if (var1_3 != false) return null;
            if (var1_3) {
                return null;
            }
            if (var2_2 /* !! */  == 0) return null;
            cfr_temp_0 = -2147483648;
            while (true) {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: {
                        return null;
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)ez.bgcj("bgif", bgcl(int ), (int)71);
                        cfr_temp_0 = 4;
                        if (var3_1) {
                            throw null;
                        }
                        break block74;
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)ez.bgcj("bgih", bgcl(int ), (int)73);
                        cfr_temp_0 = 9;
                        if (var3_1) {
                            throw null;
                        }
                        break block74;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)ez.bgcj("bgii", bgcl(int ), (int)74);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 1: {
                        var2_2 /* !! */  = (int)ez.bgcj("bgig", bgcl(int ), (int)72);
                        cfr_temp_0 = 6;
                        if (var3_1) {
                            throw null;
                        }
                        break block74;
                    }
                    case 5: {
                        ** GOTO lbl182
                    }
                    case 10: {
                        var2_2 /* !! */  = (int)ez.bgcj("bgip", bgcl(int ), (int)81);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 11: {
                        var2_2 /* !! */  = (int)ez.bgcj("bgiq", bgcl(int ), (int)82);
                        cfr_temp_0 = 6;
                        if (var3_1) {
                            throw null;
                        }
                        break block74;
                    }
                    case 12: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)ez.bgcj("bgir", bgcl(int ), (int)83);
                        if (var3_1) {
                            throw null;
                        }
lbl182:
                        // 3 sources

                        var2_2 /* !! */  = (int)ez.bgcj("bgik", bgcl(int ), (int)76);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 6: {
                        var2_2 /* !! */  = (int)ez.bgcj("bgil", bgcl(int ), (int)77);
                        cfr_temp_0 = 7;
                        if (var3_1) {
                            throw null;
                        }
                        break block74;
                    }
lbl191:
                    // 1 sources

                    while (true) {
                        if ((v21 /* !! */  = (cfr_temp_8 = ez.dg - ez.bgcj("bgic", bgcu(int ), (int)75)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v21 /* !! */  == ez.bgcj("bgid", bgcl(int ), (int)69)) break;
                        v21 /* !! */  = (long)ez.bgcj("bgie", bgcl(int ), (int)70);
                    }
                    v14 = class_1713.field_7794;
                    if (var3_1 == false) return v14;
                    throw null;
                    case 4: {
                        var2_2 /* !! */  = (int)ez.bgcj("bgij", bgcl(int ), (int)75);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 8: {
                        var2_2 /* !! */  = (int)ez.bgcj("bgin", bgcl(int ), (int)79);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 9: {
                        var2_2 /* !! */  = (int)ez.bgcj("bgio", bgcl(int ), (int)80);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 7: 
                }
                break;
            }
            ** GOTO lbl216
        }
        do {
            if (true) ** continue;
lbl216:
            // 2 sources

            var2_2 /* !! */  = (int)ez.bgcj("bgim", bgcl(int ), (int)78);
            cfr_temp_0 = 4;
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void bgvw() {
        ez.bgci[100] = -126091402;
        ez.bgci[101] = -526943416;
        ez.bgci[102] = -228831187;
        ez.bgci[103] = -476181526;
        ez.bgci[104] = 383515212;
        ez.bgci[105] = -1995157749;
        ez.bgci[106] = -1471241655;
        ez.bgci[107] = 1294372684;
        ez.bgci[108] = 685277164;
        ez.bgci[109] = 1566081966;
        ez.bgci[110] = 1472136183;
        ez.bgci[111] = 784387772;
        ez.bgci[112] = 559188912;
        ez.bgci[113] = -73785386;
        ez.bgci[114] = -1474243765;
        ez.bgci[115] = 147168405;
        ez.bgci[116] = 1527130314;
        ez.bgci[117] = 2026025006;
        ez.bgci[118] = -28376942;
        ez.bgci[119] = 213473042;
        ez.bgci[120] = -75322421;
        ez.bgci[121] = 1538420309;
        ez.bgci[122] = 2029481875;
        ez.bgci[123] = 1579484973;
        ez.bgci[124] = 822787683;
        ez.bgci[125] = -1647015063;
        ez.bgci[126] = -1721055892;
        ez.bgci[127] = 1856382336;
        ez.bgci[128] = 2099433921;
        ez.bgci[129] = 1013253632;
        ez.bgci[130] = -899631220;
        ez.bgci[131] = -855283338;
        ez.bgci[132] = 1167070634;
        ez.bgci[133] = -1958163200;
        ez.bgci[134] = 581507666;
        ez.bgci[135] = -722379487;
        ez.bgci[136] = 1728700864;
        ez.bgci[137] = 299542937;
        ez.bgci[138] = -947079692;
        ez.bgci[139] = -1951540662;
        ez.bgci[140] = 2093084422;
        ez.bgci[141] = -515353484;
        ez.bgci[142] = 1819813283;
        ez.bgci[143] = -1399903700;
        ez.bgci[144] = 1664126709;
        ez.bgci[145] = 650842537;
        ez.bgci[146] = 241887379;
        ez.bgci[147] = -2022145079;
        ez.bgci[148] = -887792613;
        ez.bgci[149] = 1078865002;
        ez.bgci[150] = 1068966650;
        ez.bgci[151] = -1824189654;
        ez.bgci[152] = -1298170162;
        ez.bgci[153] = -1068535265;
        ez.bgci[154] = -641092994;
        ez.bgci[155] = -1947162373;
        ez.bgci[156] = 993837725;
        ez.bgci[157] = -652705762;
        ez.bgci[158] = 838135964;
        ez.bgci[159] = 1984103868;
        ez.bgci[160] = -1048887960;
        ez.bgci[161] = 381993037;
        ez.bgci[162] = 659330138;
        ez.bgci[163] = 403265816;
        ez.bgci[164] = -1443308103;
        ez.bgci[165] = -58018984;
        ez.bgci[166] = 91654596;
        ez.bgci[167] = 1966978896;
        ez.bgci[168] = -744303808;
        ez.bgci[169] = 1331885470;
        ez.bgci[170] = 267311862;
        ez.bgci[171] = 1924525304;
        ez.bgci[172] = -2115070869;
        ez.bgci[173] = 586834243;
        ez.bgci[174] = -739191072;
        ez.bgci[175] = 1610001842;
        ez.bgci[176] = -1800852393;
        ez.bgci[177] = 1757329484;
        ez.bgci[178] = 1160647920;
        ez.bgci[179] = 2099272954;
        ez.bgci[180] = -512755636;
        ez.bgci[181] = 277800590;
        ez.bgci[182] = 901436490;
        ez.bgci[183] = 1851636138;
        ez.bgci[184] = 1163615412;
        ez.bgci[185] = 1946962911;
        ez.bgci[186] = 1400370858;
        ez.bgci[187] = 424197621;
        ez.bgci[188] = 277924713;
        ez.bgci[189] = 198749829;
        ez.bgci[190] = 1537115410;
        ez.bgci[191] = -437020630;
        ez.bgci[192] = -1307478475;
        ez.bgci[193] = 132082046;
        ez.bgci[194] = -813749751;
        ez.bgci[195] = 94880799;
        ez.bgci[196] = -1918913815;
        ez.bgci[197] = -797647696;
        ez.bgci[198] = -272686433;
        ez.bgci[199] = 173850121;
    }

    private static /* synthetic */ long bgcu(int n2) {
        return bgcv[n2] ^ bgcw[n2];
    }

    static {
        bgch = new int[200];
        bgci = new int[200];
        ez.bgtj();
        ez.bgtv();
        ez.bgvh();
        ez.bgvw();
        bgcv = new long[200];
        bgcw = new long[200];
        ez.bgwm();
        ez.bgwx();
        ez.bgxi();
        ez.bgxv();
    }

    private static /* synthetic */ void bgwm() {
        ez.bgcv[0] = -530777516433935169L;
        ez.bgcv[1] = 2679502765811628014L;
        ez.bgcv[2] = 95858426370640950L;
        ez.bgcv[3] = -7415879477392180622L;
        ez.bgcv[4] = 5117410824576162605L;
        ez.bgcv[5] = -4699712170778586193L;
        ez.bgcv[6] = -7580714678025208822L;
        ez.bgcv[7] = 9186190439001589890L;
        ez.bgcv[8] = -3508343843138408738L;
        ez.bgcv[9] = -3044906152437174309L;
        ez.bgcv[10] = -1105945445812116764L;
        ez.bgcv[11] = -6216683068544231295L;
        ez.bgcv[12] = 9181075183463688405L;
        ez.bgcv[13] = 7493482041024920198L;
        ez.bgcv[14] = -1749110505893363386L;
        ez.bgcv[15] = 1638488487014333327L;
        ez.bgcv[16] = -5801421444903492530L;
        ez.bgcv[17] = 7657016236897865444L;
        ez.bgcv[18] = -1666931230215858020L;
        ez.bgcv[19] = -5498408378515678168L;
        ez.bgcv[20] = 6944487199790194613L;
        ez.bgcv[21] = 5260463926366992451L;
        ez.bgcv[22] = -7546828772155548324L;
        ez.bgcv[23] = -5914045522897465533L;
        ez.bgcv[24] = -6850581533155146727L;
        ez.bgcv[25] = -6701493769635787030L;
        ez.bgcv[26] = -801304626081595293L;
        ez.bgcv[27] = 2232361196315004044L;
        ez.bgcv[28] = 2194515527571947777L;
        ez.bgcv[29] = -8965996414236400686L;
        ez.bgcv[30] = -3147417437902459468L;
        ez.bgcv[31] = -3131377264354464295L;
        ez.bgcv[32] = -7259963078019470179L;
        ez.bgcv[33] = 6552619972371154857L;
        ez.bgcv[34] = 9044681966643263034L;
        ez.bgcv[35] = 8207423818974093175L;
        ez.bgcv[36] = -538060091549600508L;
        ez.bgcv[37] = -7684555125431480009L;
        ez.bgcv[38] = 2103928631442461751L;
        ez.bgcv[39] = 3621015395033867887L;
        ez.bgcv[40] = 7837521182741133887L;
        ez.bgcv[41] = -7358624648293494924L;
        ez.bgcv[42] = 2931836585541172664L;
        ez.bgcv[43] = -7533817947892535960L;
        ez.bgcv[44] = -4613834081340934918L;
        ez.bgcv[45] = 2383586177154507063L;
        ez.bgcv[46] = -3171767750287472517L;
        ez.bgcv[47] = 7091424839124502751L;
        ez.bgcv[48] = -5124187372227170653L;
        ez.bgcv[49] = 4184703475006850803L;
        ez.bgcv[50] = -1320898818448821553L;
        ez.bgcv[51] = -2430589683411171782L;
        ez.bgcv[52] = 6086305285329532704L;
        ez.bgcv[53] = 7638783875186904995L;
        ez.bgcv[54] = 5035192949269324570L;
        ez.bgcv[55] = 8555021903780244678L;
        ez.bgcv[56] = -8047374128422992507L;
        ez.bgcv[57] = -7532293201320737987L;
        ez.bgcv[58] = -128705377783078524L;
        ez.bgcv[59] = -241030099363571013L;
        ez.bgcv[60] = 4467282213824698545L;
        ez.bgcv[61] = 8687198281761007812L;
        ez.bgcv[62] = 6645272120114286706L;
        ez.bgcv[63] = 8648732875814811092L;
        ez.bgcv[64] = -3307331047190834998L;
        ez.bgcv[65] = -426734689717626303L;
        ez.bgcv[66] = 369024235849375513L;
        ez.bgcv[67] = 2995657676903332888L;
        ez.bgcv[68] = -1340474904798369505L;
        ez.bgcv[69] = 8435552774051487654L;
        ez.bgcv[70] = 3206700707331270897L;
        ez.bgcv[71] = -3721757689797491050L;
        ez.bgcv[72] = 5991758150765263535L;
        ez.bgcv[73] = -6927617074956508953L;
        ez.bgcv[74] = -7702872920256759556L;
        ez.bgcv[75] = -5055390390008636916L;
        ez.bgcv[76] = -3626435829123950944L;
        ez.bgcv[77] = 4365557018499966608L;
        ez.bgcv[78] = 6469480719762922195L;
        ez.bgcv[79] = 4811030476257359186L;
        ez.bgcv[80] = -760259186762333508L;
        ez.bgcv[81] = -902602104077923140L;
        ez.bgcv[82] = 5383402223308142920L;
        ez.bgcv[83] = 3944887613724238317L;
        ez.bgcv[84] = 7556588983636844731L;
        ez.bgcv[85] = -3845885038488165478L;
        ez.bgcv[86] = 5308390931017667614L;
        ez.bgcv[87] = -6536643148728028811L;
        ez.bgcv[88] = -7809096577232205412L;
        ez.bgcv[89] = -3576491041751451913L;
        ez.bgcv[90] = 4697280020447617078L;
        ez.bgcv[91] = 9200951502724945540L;
        ez.bgcv[92] = 7560198277367453837L;
        ez.bgcv[93] = -5347146912052109890L;
        ez.bgcv[94] = 4431785385418513372L;
        ez.bgcv[95] = 7455123089402051007L;
        ez.bgcv[96] = 8812389247901118555L;
        ez.bgcv[97] = -2740493592834808101L;
        ez.bgcv[98] = 3364901619328405579L;
        ez.bgcv[99] = 2042733043933624610L;
    }

    private static /* synthetic */ void bgtj() {
        ez.bgch[0] = -552326602;
        ez.bgch[1] = -1682735392;
        ez.bgch[2] = -388930243;
        ez.bgch[3] = 1197349108;
        ez.bgch[4] = 918796099;
        ez.bgch[5] = 741941827;
        ez.bgch[6] = -988090010;
        ez.bgch[7] = -1749383678;
        ez.bgch[8] = -1690828021;
        ez.bgch[9] = 1977415724;
        ez.bgch[10] = -810625191;
        ez.bgch[11] = -1103623645;
        ez.bgch[12] = -1472285075;
        ez.bgch[13] = -602038808;
        ez.bgch[14] = 119168332;
        ez.bgch[15] = 83019253;
        ez.bgch[16] = 1860840673;
        ez.bgch[17] = -880515604;
        ez.bgch[18] = -518869144;
        ez.bgch[19] = 1571654694;
        ez.bgch[20] = 1577061518;
        ez.bgch[21] = 325333053;
        ez.bgch[22] = -1763484912;
        ez.bgch[23] = 1160347565;
        ez.bgch[24] = 615584610;
        ez.bgch[25] = 672795697;
        ez.bgch[26] = 545239483;
        ez.bgch[27] = 1047681433;
        ez.bgch[28] = -2087554464;
        ez.bgch[29] = 2033385181;
        ez.bgch[30] = -139425969;
        ez.bgch[31] = -1109581068;
        ez.bgch[32] = -1135867511;
        ez.bgch[33] = 1821224446;
        ez.bgch[34] = -441706979;
        ez.bgch[35] = -1704180449;
        ez.bgch[36] = 1912042046;
        ez.bgch[37] = 1355985004;
        ez.bgch[38] = -602721177;
        ez.bgch[39] = -1812617473;
        ez.bgch[40] = 1383876781;
        ez.bgch[41] = 1023229540;
        ez.bgch[42] = 91161867;
        ez.bgch[43] = -1859463029;
        ez.bgch[44] = 1151073881;
        ez.bgch[45] = 177818493;
        ez.bgch[46] = 1629649667;
        ez.bgch[47] = -949342237;
        ez.bgch[48] = -1566901529;
        ez.bgch[49] = -1172946805;
        ez.bgch[50] = -623463;
        ez.bgch[51] = 1437197856;
        ez.bgch[52] = -1704812777;
        ez.bgch[53] = 1350746323;
        ez.bgch[54] = 69833206;
        ez.bgch[55] = -1344474812;
        ez.bgch[56] = -687593867;
        ez.bgch[57] = 1180384470;
        ez.bgch[58] = -1867157469;
        ez.bgch[59] = 1829170915;
        ez.bgch[60] = -1623955520;
        ez.bgch[61] = 722697929;
        ez.bgch[62] = 1882996787;
        ez.bgch[63] = -667152694;
        ez.bgch[64] = 1348104835;
        ez.bgch[65] = -2011268767;
        ez.bgch[66] = -1380255587;
        ez.bgch[67] = -556139497;
        ez.bgch[68] = 388980973;
        ez.bgch[69] = 1517416053;
        ez.bgch[70] = 1139687208;
        ez.bgch[71] = 1667286394;
        ez.bgch[72] = -1881277908;
        ez.bgch[73] = -1556438672;
        ez.bgch[74] = 1403686529;
        ez.bgch[75] = -467673716;
        ez.bgch[76] = 1380488868;
        ez.bgch[77] = 702753018;
        ez.bgch[78] = 1823546825;
        ez.bgch[79] = 874338816;
        ez.bgch[80] = -296949558;
        ez.bgch[81] = -1122607136;
        ez.bgch[82] = -982200249;
        ez.bgch[83] = 1613827465;
        ez.bgch[84] = 1201049411;
        ez.bgch[85] = 1809900094;
        ez.bgch[86] = -1045544147;
        ez.bgch[87] = 323150493;
        ez.bgch[88] = 67747890;
        ez.bgch[89] = 680603697;
        ez.bgch[90] = 909767531;
        ez.bgch[91] = 302839495;
        ez.bgch[92] = 2130097032;
        ez.bgch[93] = -946683370;
        ez.bgch[94] = -801665563;
        ez.bgch[95] = -1561271986;
        ez.bgch[96] = -1362450614;
        ez.bgch[97] = -376833839;
        ez.bgch[98] = -673495488;
        ez.bgch[99] = 977875507;
    }

    private static /* synthetic */ int bgcl(int n2) {
        return bgch[n2] ^ bgci[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$processSlotClick$0(class_1792 var0, class_1735 var1_1, class_1735 var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ez.dg - ez.bgcj("bgqn", bgcu(int ), (int)186)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ez.bgcj("bgqo", bgcl(int ), (int)176)) break;
            v0 /* !! */  = (long)ez.bgcj("bgqp", bgcl(int ), (int)177);
        }
        var5_3 = ez.c;
        v1 /* !! */  = ez.dg;
        if (true) ** GOTO lbl11
        block26: while (true) {
            v1 /* !! */  = (long)(ez.bgcj("bgqr", bgcu(int ), (int)188) - ez.bgcj("bgqq", bgcu(int ), (int)187));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1811265543: {
                    continue block26;
                }
                case 140996543: {
                    break block26;
                }
            }
            break;
        }
        var4_4 /* !! */  = ez.b;
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = ez.dg - ez.bgcj("bgqs", bgcu(int ), (int)189)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == ez.bgcj("bgqt", bgcl(int ), (int)178)) break;
                    v2 /* !! */  = (long)ez.bgcj("bgqu", bgcl(int ), (int)179);
                }
                var3_5 = ez.a;
                if (var5_3) {
                    throw null;
lbl28:
                    // 4 sources

                    return (boolean)ez.bgcj("bgqv", bgcl(int ), (int)180);
                }
                if (var3_5 || var3_5) ** GOTO lbl28
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ez.dg - ez.bgcj("bgqw", bgcu(int ), (int)190)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ez.bgcj("bgqx", bgcl(int ), (int)181)) break;
                    v3 /* !! */  = (long)ez.bgcj("bgqz", bgcl(int ), (int)182);
                }
                v4 = var2_2.method_7677();
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = ez.dg - ez.bgcj("bgra", bgcu(int ), (int)191)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ez.bgcj("bgrf", bgcl(int ), (int)183)) break;
                    v5 /* !! */  = (long)ez.bgcj("bgrg", bgcl(int ), (int)184);
                }
                v6 = v4.method_7909();
                v7 /* !! */  = ez.dg;
                if (true) ** GOTO lbl47
                block31: while (true) {
                    v7 /* !! */  = (long)(v8 - ez.bgcj("bgrj", bgcu(int ), (int)192));
lbl47:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1878333750: {
                            v8 = ez.bgcj("bgrk", bgcu(int ), (int)193);
                            continue block31;
                        }
                        case 140996543: {
                            break block31;
                        }
                        case 511272714: {
                            v8 = ez.bgcj("bgrm", bgcu(int ), (int)194);
                            continue block31;
                        }
                    }
                    break;
                }
                if (!v6.equals(var0)) ** GOTO lbl89
                if (var3_5) ** GOTO lbl28
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_4 = ez.dg - ez.bgcj("bgrp", bgcu(int ), (int)195)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ez.bgcj("bgrr", bgcl(int ), (int)185)) break;
                    v9 /* !! */  = (long)ez.bgcj("bgrt", bgcl(int ), (int)186);
                }
                v10 = var2_2.field_7871;
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_5 = ez.dg - ez.bgcj("bgrv", bgcu(int ), (int)196)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ez.bgcj("bgrx", bgcl(int ), (int)187)) break;
                    v11 /* !! */  = (long)ez.bgcj("bgry", bgcl(int ), (int)188);
                }
                v12 = var1_1.field_7871;
                v13 /* !! */  = ez.dg;
                if (true) ** GOTO lbl74
                block34: while (true) {
                    v13 /* !! */  = (long)(v14 - ez.bgcj("bgsa", bgcu(int ), (int)197));
lbl74:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -938685780: {
                            v14 = ez.bgcj("bgsb", bgcu(int ), (int)198);
                            continue block34;
                        }
                        case -231908693: {
                            v14 = ez.bgcj("bgsd", bgcu(int ), (int)199);
                            continue block34;
                        }
                        case 140996543: {
                            break block34;
                        }
                    }
                    break;
                }
                if (!v10.equals((Object)v12)) ** GOTO lbl89
                if (var3_5) ** GOTO lbl28
                v15 = ez.bgcj("bgsf", bgcl(int ), (int)189);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl92
lbl89:
                // 2 sources

                if (!var3_5 && !var3_5) ** break;
                ** continue;
                v15 = ez.bgcj("bgsh", bgcl(int ), (int)190);
lbl92:
                // 2 sources

                return (boolean)v15;
            }
lbl93:
            // 2 sources

            case 0: {
                var4_4 /* !! */  = (int)ez.bgcj("bgsj", bgcl(int ), (int)191);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl103
            }
            case 1: {
                var4_4 /* !! */  = (int)ez.bgcj("bgsq", bgcl(int ), (int)192);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl125
            }
lbl103:
            // 2 sources

            case 2: {
                var4_4 /* !! */  = (int)ez.bgcj("bgsr", bgcl(int ), (int)193);
                if (var5_3) {
                    throw null;
                }
            }
            case 3: {
                var4_4 /* !! */  = (int)ez.bgcj("bgst", bgcl(int ), (int)194);
                if (var5_3) {
                    throw null;
                }
            }
lbl111:
            // 4 sources

            case 4: {
                var4_4 /* !! */  = (int)ez.bgcj("bgsu", bgcl(int ), (int)195);
                if (!var5_3) ** GOTO lbl93
                throw null;
            }
            case 5: {
                var4_4 /* !! */  = (int)ez.bgcj("bgsx", bgcl(int ), (int)196);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl125
            }
            case 6: {
                do {
                    var4_4 /* !! */  = (int)ez.bgcj("bgta", bgcl(int ), (int)197);
                } while (!var5_3);
                throw null;
            }
lbl125:
            // 3 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)ez.bgcj("bgtc", bgcl(int ), (int)198);
                    if (!var5_3) ** GOTO lbl111
                    throw null;
                }
            }
            case 8: 
        }
        var4_4 /* !! */  = (int)ez.bgcj("bgte", bgcl(int ), (int)199);
        ** while (!var5_3)
lbl133:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ double bglu(int n2) {
        return Double.longBitsToDouble(bgcv[n2] ^ bgcw[n2]);
    }

    private static /* synthetic */ void bgtv() {
        ez.bgch[100] = 126091401;
        ez.bgch[101] = 657493496;
        ez.bgch[102] = -228831188;
        ez.bgch[103] = -1248481477;
        ez.bgch[104] = -383515213;
        ez.bgch[105] = -1569263630;
        ez.bgch[106] = -1471241656;
        ez.bgch[107] = -1969244974;
        ez.bgch[108] = -685277165;
        ez.bgch[109] = -1376989351;
        ez.bgch[110] = 1472136182;
        ez.bgch[111] = 76764292;
        ez.bgch[112] = 559188913;
        ez.bgch[113] = 1479478852;
        ez.bgch[114] = -1474243765;
        ez.bgch[115] = 147168387;
        ez.bgch[116] = 1527130322;
        ez.bgch[117] = 2026025013;
        ez.bgch[118] = -28376950;
        ez.bgch[119] = 213473034;
        ez.bgch[120] = -75322428;
        ez.bgch[121] = 1538420314;
        ez.bgch[122] = 2029481882;
        ez.bgch[123] = 1579484965;
        ez.bgch[124] = 822787698;
        ez.bgch[125] = -1647015057;
        ez.bgch[126] = -1721055894;
        ez.bgch[127] = 1856382348;
        ez.bgch[128] = 2099433936;
        ez.bgch[129] = 1013253643;
        ez.bgch[130] = -899631210;
        ez.bgch[131] = -855283333;
        ez.bgch[132] = 1167070626;
        ez.bgch[133] = -1958163174;
        ez.bgch[134] = 581507669;
        ez.bgch[135] = -722379471;
        ez.bgch[136] = 1728700889;
        ez.bgch[137] = 299542936;
        ez.bgch[138] = -947079706;
        ez.bgch[139] = -1951540647;
        ez.bgch[140] = 2093084431;
        ez.bgch[141] = -515353473;
        ez.bgch[142] = -1819813284;
        ez.bgch[143] = -216211791;
        ez.bgch[144] = 1664126708;
        ez.bgch[145] = -143644866;
        ez.bgch[146] = 241887378;
        ez.bgch[147] = 1760306250;
        ez.bgch[148] = -887792609;
        ez.bgch[149] = 1078865003;
        ez.bgch[150] = 1068966655;
        ez.bgch[151] = -1824189653;
        ez.bgch[152] = -1298170162;
        ez.bgch[153] = -1068535268;
        ez.bgch[154] = -641092993;
        ez.bgch[155] = 554219995;
        ez.bgch[156] = -993837726;
        ez.bgch[157] = -1686919050;
        ez.bgch[158] = 838135965;
        ez.bgch[159] = 695093681;
        ez.bgch[160] = -1048887959;
        ez.bgch[161] = 1356993827;
        ez.bgch[162] = -659330139;
        ez.bgch[163] = -1206977263;
        ez.bgch[164] = -1443308101;
        ez.bgch[165] = -58018981;
        ez.bgch[166] = 91654599;
        ez.bgch[167] = 1966978898;
        ez.bgch[168] = -744303807;
        ez.bgch[169] = 1331885471;
        ez.bgch[170] = -76799998;
        ez.bgch[171] = 1924525306;
        ez.bgch[172] = -2115070865;
        ez.bgch[173] = 586834247;
        ez.bgch[174] = -739191072;
        ez.bgch[175] = 1610001842;
        ez.bgch[176] = 1800852392;
        ez.bgch[177] = -1518326868;
        ez.bgch[178] = -1160647921;
        ez.bgch[179] = -1882635219;
        ez.bgch[180] = -512755636;
        ez.bgch[181] = -277800591;
        ez.bgch[182] = -270833067;
        ez.bgch[183] = 1851636139;
        ez.bgch[184] = 1070514030;
        ez.bgch[185] = 1946962910;
        ez.bgch[186] = 1058548575;
        ez.bgch[187] = 424197620;
        ez.bgch[188] = 2036280267;
        ez.bgch[189] = 198749828;
        ez.bgch[190] = 1537115410;
        ez.bgch[191] = -437020630;
        ez.bgch[192] = -1307478479;
        ez.bgch[193] = 132082046;
        ez.bgch[194] = -813749750;
        ez.bgch[195] = 94880792;
        ez.bgch[196] = -1918913815;
        ez.bgch[197] = -797647688;
        ez.bgch[198] = -272686435;
        ez.bgch[199] = 173850121;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void processSlotClick(class_1735 var1_1, class_1792 var2_2, br var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ez.dg - ez.bgcj("bgng", bgcu(int ), (int)135)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ez.bgcj("bgnh", bgcl(int ), (int)142)) break;
            v0 /* !! */  = (long)ez.bgcj("bgni", bgcl(int ), (int)143);
        }
        var6_4 = ez.c;
        v1 /* !! */  = ez.dg;
        if (true) ** GOTO lbl11
        block33: while (true) {
            v1 /* !! */  = (long)(ez.bgcj("bgnk", bgcu(int ), (int)137) - ez.bgcj("bgnj", bgcu(int ), (int)136));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 140996543: {
                    break block33;
                }
                case 552477708: {
                    continue block33;
                }
            }
            break;
        }
        var5_5 /* !! */  = ez.b;
        v2 /* !! */  = ez.dg;
        if (true) ** GOTO lbl21
        block34: while (true) {
            v2 /* !! */  = (long)(v3 - ez.bgcj("bgnl", bgcu(int ), (int)138));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1839540730: {
                    v3 = ez.bgcj("bgnm", bgcu(int ), (int)139);
                    continue block34;
                }
                case -273632154: {
                    v3 = ez.bgcj("bgnn", bgcu(int ), (int)140);
                    continue block34;
                }
                case -163371676: {
                    v3 = ez.bgcj("bgno", bgcu(int ), (int)141);
                    continue block34;
                }
                case 140996543: {
                    break block34;
                }
            }
            break;
        }
        var4_6 = ez.a;
        if (var6_4) {
            throw null;
lbl36:
            // 3 sources

            return;
        }
        if (var4_6 || var4_6) ** GOTO lbl36
        v4 /* !! */  = ez.dg;
        if (true) ** GOTO lbl43
        block36: while (true) {
            v4 /* !! */  = (long)(ez.bgcj("bgnq", bgcu(int ), (int)143) - ez.bgcj("bgnp", bgcu(int ), (int)142));
lbl43:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 140996543: {
                    break block36;
                }
                case 1777130228: {
                    continue block36;
                }
            }
            break;
        }
        v5 = this.getSlots();
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = ez.dg - ez.bgcj("bgnr", bgcu(int ), (int)144)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == ez.bgcj("bgns", bgcl(int ), (int)144)) break;
            v6 /* !! */  = (long)ez.bgcj("bgnt", bgcl(int ), (int)145);
        }
        v7 = (Predicate<class_1735>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$processSlotClick$0(net.minecraft.class_1792 net.minecraft.class_1735 net.minecraft.class_1735 ), (Lnet/minecraft/class_1735;)Z)((class_1792)var2_2, (class_1735)var1_1);
        v8 /* !! */  = ez.dg;
        if (true) ** GOTO lbl59
        block38: while (true) {
            v8 /* !! */  = (long)(v9 - ez.bgcj("bgnu", bgcu(int ), (int)145));
lbl59:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -2018582778: {
                    v9 = ez.bgcj("bgnv", bgcu(int ), (int)146);
                    continue block38;
                }
                case -1253745319: {
                    v9 = ez.bgcj("bgnw", bgcu(int ), (int)147);
                    continue block38;
                }
                case -937374023: {
                    v9 = ez.bgcj("bgnx", bgcu(int ), (int)148);
                    continue block38;
                }
                case 140996543: {
                    break block38;
                }
            }
            break;
        }
        v10 = v5.filter(v7);
        v11 /* !! */  = ez.dg;
        if (true) ** GOTO lbl76
        block39: while (true) {
            v11 /* !! */  = (long)(ez.bgcj("bgnz", bgcu(int ), (int)150) - ez.bgcj("bgny", bgcu(int ), (int)149));
lbl76:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -223607563: {
                    continue block39;
                }
                case 140996543: {
                    break block39;
                }
            }
            break;
        }
        v12 = (Consumer<class_1735>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$processSlotClick$1(ruhack.phobia.br net.minecraft.class_1735 ), (Lnet/minecraft/class_1735;)V)((br)var3_3);
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_2 = ez.dg - ez.bgcj("bgoa", bgcu(int ), (int)151)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == ez.bgcj("bgob", bgcl(int ), (int)146)) break;
            v13 /* !! */  = (long)ez.bgcj("bgoc", bgcl(int ), (int)147);
        }
        v10.forEach(v12);
        if (var4_6) ** GOTO lbl36
        if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var4_6) ** break;
                ** continue;
                return;
            }
lbl95:
            // 3 sources

            case 0: {
                var5_5 /* !! */  = (int)ez.bgcj("bgod", bgcl(int ), (int)148);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl114
            }
            case 1: {
                do {
                    var5_5 /* !! */  = (int)ez.bgcj("bgoe", bgcl(int ), (int)149);
                } while (!var6_4);
                throw null;
            }
            case 2: {
                var5_5 /* !! */  = (int)ez.bgcj("bgof", bgcl(int ), (int)150);
                if (!var6_4) ** GOTO lbl95
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_5 /* !! */  = (int)ez.bgcj("bgog", bgcl(int ), (int)151);
                    if (!var6_4) ** GOTO lbl95
                    throw null;
                }
            }
lbl114:
            // 2 sources

            case 4: {
                var5_5 /* !! */  = (int)ez.bgcj("bgoh", bgcl(int ), (int)152);
                if (!var6_4) break;
                throw null;
            }
            case 5: 
        }
        var5_5 /* !! */  = (int)ez.bgcj("bgoi", bgcl(int ), (int)153);
        ** while (!var6_4)
lbl121:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onClickSlot(br var1_1) {
        block156: {
            block155: {
                block154: {
                    block153: {
                        while (true) {
                            if ((v0 /* !! */  = (cfr_temp_0 = ez.dg - ez.bgcj("bgis", bgcu(int ), (int)76)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                            if (v0 /* !! */  == ez.bgcj("bgit", bgcl(int ), (int)84)) break;
                            v0 /* !! */  = (long)ez.bgcj("bgiu", bgcl(int ), (int)85);
                        }
                        var7_2 = ez.c;
                        while (true) {
                            if ((v1 /* !! */  = (cfr_temp_1 = ez.dg - ez.bgcj("bgiv", bgcu(int ), (int)77)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                            if (v1 /* !! */  == ez.bgcj("bgiw", bgcl(int ), (int)86)) break;
                            v1 /* !! */  = (long)ez.bgcj("bgix", bgcl(int ), (int)87);
                        }
                        var6_3 /* !! */  = ez.b;
                        v2 /* !! */  = ez.dg;
                        if (true) ** GOTO lbl17
                        block101: while (true) {
                            v2 /* !! */  = (long)(v3 - ez.bgcj("bgiy", bgcu(int ), (int)78));
lbl17:
                            // 2 sources

                            switch ((int)v2 /* !! */ ) {
                                case -100168445: {
                                    v3 = ez.bgcj("bgiz", bgcu(int ), (int)79);
                                    continue block101;
                                }
                                case 140996543: {
                                    break block101;
                                }
                                case 1074941753: {
                                    v3 = ez.bgcj("bgja", bgcu(int ), (int)80);
                                    continue block101;
                                }
                                case 1758001929: {
                                    v3 = ez.bgcj("bgjb", bgcu(int ), (int)81);
                                    continue block101;
                                }
                            }
                            break;
                        }
                        var5_4 = ez.a;
                        if (var7_2) {
                            throw null;
lbl32:
                            // 17 sources

                            return;
                        }
                        if (var5_4 || var5_4) ** GOTO lbl32
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_2 = ez.dg - ez.bgcj("bgjc", bgcu(int ), (int)82)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v4 /* !! */  == ez.bgcj("bgjd", bgcl(int ), (int)88)) break;
                            v4 /* !! */  = (long)ez.bgcj("bgje", bgcl(int ), (int)89);
                        }
                        v5 /* !! */  = ez.dg;
                        if (true) ** GOTO lbl44
                        block104: while (true) {
                            v5 /* !! */  = (long)(v6 - ez.bgcj("bgjf", bgcu(int ), (int)83));
lbl44:
                            // 2 sources

                            switch ((int)v5 /* !! */ ) {
                                case 140996543: {
                                    break block104;
                                }
                                case 195190442: {
                                    v6 = ez.bgcj("bgjg", bgcu(int ), (int)84);
                                    continue block104;
                                }
                                case 542176446: {
                                    v6 = ez.bgcj("bgjh", bgcu(int ), (int)85);
                                    continue block104;
                                }
                                case 1466171026: {
                                    v6 = ez.bgcj("bgji", bgcu(int ), (int)86);
                                    continue block104;
                                }
                            }
                            break;
                        }
                        if (ez.mc.field_1724 != null) break block153;
                        if (var5_4) ** GOTO lbl32
                        return;
                    }
                    if (var5_4 || var5_4) ** GOTO lbl32
                    v7 /* !! */  = ez.dg;
                    if (true) ** GOTO lbl65
                    block105: while (true) {
                        v7 /* !! */  = (long)(v8 - ez.bgcj("bgjj", bgcu(int ), (int)87));
lbl65:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case 140996543: {
                                break block105;
                            }
                            case 481788947: {
                                v8 = ez.bgcj("bgjk", bgcu(int ), (int)88);
                                continue block105;
                            }
                            case 935923988: {
                                v8 = ez.bgcj("bgjl", bgcu(int ), (int)89);
                                continue block105;
                            }
                        }
                        break;
                    }
                    var2_5 = var1_1.getSlotId();
                    if (var5_4 || var5_4) ** GOTO lbl32
                    if (var2_5 < 0) break block154;
                    if (var5_4) ** GOTO lbl32
                    v9 /* !! */  = ez.dg;
                    if (true) ** GOTO lbl82
                    block106: while (true) {
                        v9 /* !! */  = (long)(v10 - ez.bgcj("bgjm", bgcu(int ), (int)90));
lbl82:
                        // 2 sources

                        switch ((int)v9 /* !! */ ) {
                            case -1082658530: {
                                v10 = ez.bgcj("bgjn", bgcu(int ), (int)91);
                                continue block106;
                            }
                            case -224025612: {
                                v10 = ez.bgcj("bgjo", bgcu(int ), (int)92);
                                continue block106;
                            }
                            case 140996543: {
                                break block106;
                            }
                            case 1450184909: {
                                v10 = ez.bgcj("bgjp", bgcu(int ), (int)93);
                                continue block106;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v11 /* !! */  = (cfr_temp_3 = ez.dg - ez.bgcj("bgjq", bgcu(int ), (int)94)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v11 /* !! */  == ez.bgcj("bgjr", bgcl(int ), (int)90)) break;
                        v11 /* !! */  = (long)ez.bgcj("bgjs", bgcl(int ), (int)91);
                    }
                    v12 = ez.mc.field_1724;
                    v13 /* !! */  = ez.dg;
                    if (true) ** GOTO lbl104
                    block108: while (true) {
                        v13 /* !! */  = (long)(v14 - ez.bgcj("bgjt", bgcu(int ), (int)95));
lbl104:
                        // 2 sources

                        switch ((int)v13 /* !! */ ) {
                            case -2086045230: {
                                v14 = ez.bgcj("bgju", bgcu(int ), (int)96);
                                continue block108;
                            }
                            case 140996543: {
                                break block108;
                            }
                            case 1425536821: {
                                v14 = ez.bgcj("bgjv", bgcu(int ), (int)97);
                                continue block108;
                            }
                            case 1985163160: {
                                v14 = ez.bgcj("bgjw", bgcu(int ), (int)98);
                                continue block108;
                            }
                        }
                        break;
                    }
                    v15 = v12.field_7512;
                    while (true) {
                        if ((v16 /* !! */  = (cfr_temp_4 = ez.dg - ez.bgcj("bgjx", bgcu(int ), (int)99)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v16 /* !! */  == ez.bgcj("bgjy", bgcl(int ), (int)92)) break;
                        v16 /* !! */  = (long)ez.bgcj("bgjz", bgcl(int ), (int)93);
                    }
                    v17 = v15.field_7761;
                    v18 /* !! */  = ez.dg;
                    if (true) ** GOTO lbl127
                    block110: while (true) {
                        v18 /* !! */  = (long)(v19 - ez.bgcj("bgka", bgcu(int ), (int)100));
lbl127:
                        // 2 sources

                        switch ((int)v18 /* !! */ ) {
                            case -2093890725: {
                                v19 = ez.bgcj("bgkb", bgcu(int ), (int)101);
                                continue block110;
                            }
                            case -140934914: {
                                v19 = ez.bgcj("bgkc", bgcu(int ), (int)102);
                                continue block110;
                            }
                            case 140996543: {
                                break block110;
                            }
                        }
                        break;
                    }
                    if (var2_5 < v17.size()) break block155;
                    if (var5_4) ** GOTO lbl32
                }
                if (var5_4 || var5_4) ** GOTO lbl32
                return;
            }
            if (var5_4 || var5_4) ** GOTO lbl32
            while (true) {
                if ((v20 /* !! */  = (cfr_temp_5 = ez.dg - ez.bgcj("bgkd", bgcu(int ), (int)103)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v20 /* !! */  == ez.bgcj("bgke", bgcl(int ), (int)94)) break;
                v20 /* !! */  = (long)ez.bgcj("bgkf", bgcl(int ), (int)95);
            }
            v21 /* !! */  = ez.dg;
            if (true) ** GOTO lbl152
            block112: while (true) {
                v21 /* !! */  = (long)(ez.bgcj("bgkh", bgcu(int ), (int)105) - ez.bgcj("bgkg", bgcu(int ), (int)104));
lbl152:
                // 2 sources

                switch ((int)v21 /* !! */ ) {
                    case 140996543: {
                        break block112;
                    }
                    case 1882972001: {
                        continue block112;
                    }
                }
                break;
            }
            v22 = ez.mc.field_1724;
            while (true) {
                if ((v23 /* !! */  = (cfr_temp_6 = ez.dg - ez.bgcj("bgki", bgcu(int ), (int)106)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v23 /* !! */  == ez.bgcj("bgkj", bgcl(int ), (int)96)) break;
                v23 /* !! */  = (long)ez.bgcj("bgkk", bgcl(int ), (int)97);
            }
            v24 = v22.field_7512;
            while (true) {
                if ((v25 /* !! */  = (cfr_temp_7 = ez.dg - ez.bgcj("bgkl", bgcu(int ), (int)107)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v25 /* !! */  == ez.bgcj("bgkm", bgcl(int ), (int)98)) break;
                v25 /* !! */  = (long)ez.bgcj("bgkn", bgcl(int ), (int)99);
            }
            var3_6 = v24.method_7611(var2_5);
            if (var5_4 || var5_4) ** GOTO lbl32
            while (true) {
                if ((v26 /* !! */  = (cfr_temp_8 = ez.dg - ez.bgcj("bgko", bgcu(int ), (int)108)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v26 /* !! */  == ez.bgcj("bgkp", bgcl(int ), (int)100)) break;
                v26 /* !! */  = (long)ez.bgcj("bgkq", bgcl(int ), (int)101);
            }
            v27 = var3_6.method_7677();
            while (true) {
                if ((v28 /* !! */  = (cfr_temp_9 = ez.dg - ez.bgcj("bgkr", bgcu(int ), (int)109)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                if (v28 /* !! */  == ez.bgcj("bgks", bgcl(int ), (int)102)) break;
                v28 /* !! */  = (long)ez.bgcj("bgkt", bgcl(int ), (int)103);
            }
            var4_7 = v27.method_7909();
            if (var5_4 || var5_4) ** GOTO lbl32
            if (var4_7 == null) break block156;
            if (var5_4) ** GOTO lbl32
            while (true) {
                if ((v29 /* !! */  = (cfr_temp_10 = ez.dg - ez.bgcj("bgku", bgcu(int ), (int)110)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                if (v29 /* !! */  == ez.bgcj("bgkv", bgcl(int ), (int)104)) break;
                v29 /* !! */  = (long)ez.bgcj("bgkw", bgcl(int ), (int)105);
            }
            while (true) {
                if ((v30 /* !! */  = (cfr_temp_11 = ez.dg - ez.bgcj("bgkx", bgcu(int ), (int)111)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                if (v30 /* !! */  == ez.bgcj("bgky", bgcl(int ), (int)106)) break;
                v30 /* !! */  = (long)ez.bgcj("bgkz", bgcl(int ), (int)107);
            }
            v31 = ez.mc.field_1690;
            while (true) {
                if ((v32 /* !! */  = (cfr_temp_12 = ez.dg - ez.bgcj("bgla", bgcu(int ), (int)112)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                if (v32 /* !! */  == ez.bgcj("bglb", bgcl(int ), (int)108)) break;
                v32 /* !! */  = (long)ez.bgcj("bglc", bgcl(int ), (int)109);
            }
            v33 = v31.field_1832;
            v34 /* !! */  = ez.dg;
            if (true) ** GOTO lbl207
            block120: while (true) {
                v34 /* !! */  = (long)(v35 - ez.bgcj("bgld", bgcu(int ), (int)113));
lbl207:
                // 2 sources

                switch ((int)v34 /* !! */ ) {
                    case -306888000: {
                        v35 = ez.bgcj("bgle", bgcu(int ), (int)114);
                        continue block120;
                    }
                    case 140996543: {
                        break block120;
                    }
                    case 162636950: {
                        v35 = ez.bgcj("bglf", bgcu(int ), (int)115);
                        continue block120;
                    }
                }
                break;
            }
            if (!pn.isKey(v33)) break block156;
            if (var5_4) ** GOTO lbl32
            while (true) {
                if ((v36 /* !! */  = (cfr_temp_13 = ez.dg - ez.bgcj("bglg", bgcu(int ), (int)116)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                if (v36 /* !! */  == ez.bgcj("bglh", bgcl(int ), (int)110)) break;
                v36 /* !! */  = (long)ez.bgcj("bgli", bgcl(int ), (int)111);
            }
            v37 /* !! */  = ez.dg;
            if (true) ** GOTO lbl227
            block122: while (true) {
                v37 /* !! */  = (long)(v38 - ez.bgcj("bglj", bgcu(int ), (int)117));
lbl227:
                // 2 sources

                switch ((int)v37 /* !! */ ) {
                    case -1513718871: {
                        v38 = ez.bgcj("bglk", bgcu(int ), (int)118);
                        continue block122;
                    }
                    case 140996543: {
                        break block122;
                    }
                    case 985934167: {
                        v38 = ez.bgcj("bgll", bgcu(int ), (int)119);
                        continue block122;
                    }
                    case 1982045295: {
                        v38 = ez.bgcj("bglm", bgcu(int ), (int)120);
                        continue block122;
                    }
                }
                break;
            }
            v39 = ez.mc.field_1690;
            while (true) {
                if ((v40 /* !! */  = (cfr_temp_14 = ez.dg - ez.bgcj("bgln", bgcu(int ), (int)121)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                if (v40 /* !! */  == ez.bgcj("bglo", bgcl(int ), (int)112)) break;
                v40 /* !! */  = (long)ez.bgcj("bglp", bgcl(int ), (int)113);
            }
            v41 = v39.field_1867;
            v42 /* !! */  = ez.dg;
            if (true) ** GOTO lbl250
            block124: while (true) {
                v42 /* !! */  = (long)(ez.bgcj("bglr", bgcu(int ), (int)123) - ez.bgcj("bglq", bgcu(int ), (int)122));
lbl250:
                // 2 sources

                switch ((int)v42 /* !! */ ) {
                    case 140996543: {
                        break block124;
                    }
                    case 1747346572: {
                        continue block124;
                    }
                }
                break;
            }
            if (!pn.isKey(v41)) break block156;
            if (var5_4) ** GOTO lbl32
            v43 /* !! */  = ez.dg;
            if (true) ** GOTO lbl261
            block125: while (true) {
                v43 /* !! */  = (long)(ez.bgcj("bglt", bgcu(int ), (int)125) - ez.bgcj("bgls", bgcu(int ), (int)124));
lbl261:
                // 2 sources

                switch ((int)v43 /* !! */ ) {
                    case -911990519: {
                        continue block125;
                    }
                    case 140996543: {
                        break block125;
                    }
                }
                break;
            }
            v44 = ez.bgcj("bglv", bglu(int ), (int)126);
            v45 /* !! */  = ez.dg;
            if (true) ** GOTO lbl271
            block126: while (true) {
                v45 /* !! */  = (long)(v46 - ez.bgcj("bglw", bgcu(int ), (int)127));
lbl271:
                // 2 sources

                switch ((int)v45 /* !! */ ) {
                    case -1436749624: {
                        v46 = ez.bgcj("bglx", bgcu(int ), (int)128);
                        continue block126;
                    }
                    case -672050667: {
                        v46 = ez.bgcj("bgly", bgcu(int ), (int)129);
                        continue block126;
                    }
                    case 140996543: {
                        break block126;
                    }
                    case 1011879857: {
                        v46 = ez.bgcj("bglz", bgcu(int ), (int)130);
                        continue block126;
                    }
                }
                break;
            }
            if (!this.stopWatch.every((double)v44)) break block156;
            if (var5_4 || var5_4) ** GOTO lbl32
            v47 /* !! */  = ez.dg;
            if (true) ** GOTO lbl289
            block127: while (true) {
                v47 /* !! */  = (long)(v48 - ez.bgcj("bgma", bgcu(int ), (int)131));
lbl289:
                // 2 sources

                switch ((int)v47 /* !! */ ) {
                    case -2147460946: {
                        v48 = ez.bgcj("bgmb", bgcu(int ), (int)132);
                        continue block127;
                    }
                    case -957514484: {
                        v48 = ez.bgcj("bgmc", bgcu(int ), (int)133);
                        continue block127;
                    }
                    case 140996543: {
                        break block127;
                    }
                    case 152650223: {
                        v48 = ez.bgcj("bgmd", bgcu(int ), (int)134);
                        continue block127;
                    }
                }
                break;
            }
            this.processSlotClick(var3_6, var4_7, var1_1);
            if (var5_4) ** GOTO lbl32
        }
        if (var5_4) ** GOTO lbl32
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var5_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var6_3 /* !! */  = (int)ez.bgcj("bgme", bgcl(int ), (int)114);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl422
            }
lbl316:
            // 2 sources

            case 1: {
                var6_3 /* !! */  = (int)ez.bgcj("bgmf", bgcl(int ), (int)115);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl405
            }
lbl321:
            // 4 sources

            case 2: {
                var6_3 /* !! */  = (int)ez.bgcj("bgmg", bgcl(int ), (int)116);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl373
            }
lbl326:
            // 2 sources

            case 3: {
                var6_3 /* !! */  = (int)ez.bgcj("bgmh", bgcl(int ), (int)117);
                if (!var7_2) ** GOTO lbl321
                throw null;
            }
lbl330:
            // 2 sources

            case 4: {
                var6_3 /* !! */  = (int)ez.bgcj("bgmi", bgcl(int ), (int)118);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl378
            }
            case 5: {
                var6_3 /* !! */  = (int)ez.bgcj("bgmj", bgcl(int ), (int)119);
                if (!var7_2) ** GOTO lbl316
                throw null;
            }
            case 6: {
                var6_3 /* !! */  = (int)ez.bgcj("bgmk", bgcl(int ), (int)120);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl368
            }
            case 7: {
                var6_3 /* !! */  = (int)ez.bgcj("bgml", bgcl(int ), (int)121);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl392
            }
lbl349:
            // 2 sources

            case 8: {
                var6_3 /* !! */  = (int)ez.bgcj("bgmm", bgcl(int ), (int)122);
                if (!var7_2) ** GOTO lbl330
                throw null;
            }
            case 9: {
                var6_3 /* !! */  = (int)ez.bgcj("bgmn", bgcl(int ), (int)123);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl422
            }
lbl358:
            // 3 sources

            case 10: {
                do {
                    var6_3 /* !! */  = (int)ez.bgcj("bgmo", bgcl(int ), (int)124);
                } while (!var7_2);
                throw null;
            }
            case 11: {
                var6_3 /* !! */  = (int)ez.bgcj("bgmp", bgcl(int ), (int)125);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl378
            }
lbl368:
            // 2 sources

            case 12: {
                var6_3 /* !! */  = (int)ez.bgcj("bgmq", bgcl(int ), (int)126);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl410
            }
lbl373:
            // 3 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)ez.bgcj("bgmr", bgcl(int ), (int)127);
                    if (!var7_2) ** GOTO lbl321
                    throw null;
                }
            }
lbl378:
            // 4 sources

            case 14: {
                var6_3 /* !! */  = (int)ez.bgcj("bgms", bgcl(int ), (int)128);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl418
            }
            case 15: {
                var6_3 /* !! */  = (int)ez.bgcj("bgmt", bgcl(int ), (int)129);
                if (!var7_2) ** GOTO lbl358
                throw null;
            }
            case 16: {
                var6_3 /* !! */  = (int)ez.bgcj("bgmu", bgcl(int ), (int)130);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl426
            }
lbl392:
            // 3 sources

            case 17: {
                do {
                    var6_3 /* !! */  = (int)ez.bgcj("bgmv", bgcl(int ), (int)131);
                } while (!var7_2);
                throw null;
            }
            case 18: {
                var6_3 /* !! */  = (int)ez.bgcj("bgmw", bgcl(int ), (int)132);
                if (!var7_2) ** GOTO lbl321
                throw null;
            }
            case 19: {
                var6_3 /* !! */  = (int)ez.bgcj("bgmx", bgcl(int ), (int)133);
                if (!var7_2) ** GOTO lbl358
                throw null;
            }
lbl405:
            // 2 sources

            case 20: {
                var6_3 /* !! */  = (int)ez.bgcj("bgmy", bgcl(int ), (int)134);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl430
            }
lbl410:
            // 2 sources

            case 21: {
                var6_3 /* !! */  = (int)ez.bgcj("bgmz", bgcl(int ), (int)135);
                if (!var7_2) ** GOTO lbl326
                throw null;
            }
            case 22: {
                var6_3 /* !! */  = (int)ez.bgcj("bgna", bgcl(int ), (int)136);
                if (!var7_2) ** GOTO lbl373
                throw null;
            }
lbl418:
            // 2 sources

            case 23: {
                var6_3 /* !! */  = (int)ez.bgcj("bgnb", bgcl(int ), (int)137);
                if (!var7_2) ** GOTO lbl349
                throw null;
            }
lbl422:
            // 3 sources

            case 24: {
                var6_3 /* !! */  = (int)ez.bgcj("bgnc", bgcl(int ), (int)138);
                if (!var7_2) break;
                throw null;
            }
lbl426:
            // 2 sources

            case 25: {
                var6_3 /* !! */  = (int)ez.bgcj("bgnd", bgcl(int ), (int)139);
                if (!var7_2) ** GOTO lbl378
                throw null;
            }
lbl430:
            // 2 sources

            case 26: {
                var6_3 /* !! */  = (int)ez.bgcj("bgne", bgcl(int ), (int)140);
                if (!var7_2) ** GOTO lbl392
                throw null;
            }
            case 27: 
        }
        var6_3 /* !! */  = (int)ez.bgcj("bgnf", bgcl(int ), (int)141);
        ** while (!var7_2)
lbl437:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bgxv() {
        ez.bgcw[100] = -5105580064034579498L;
        ez.bgcw[101] = -654963125829663515L;
        ez.bgcw[102] = 2405355904467630457L;
        ez.bgcw[103] = -2281972801691160897L;
        ez.bgcw[104] = -6040886857684646368L;
        ez.bgcw[105] = -4128828056909783583L;
        ez.bgcw[106] = 6914509468257655850L;
        ez.bgcw[107] = 2202557869183922394L;
        ez.bgcw[108] = 6266711500306235225L;
        ez.bgcw[109] = 4174090109770316690L;
        ez.bgcw[110] = -949924511858141948L;
        ez.bgcw[111] = 668318497473090264L;
        ez.bgcw[112] = -4401887617297900234L;
        ez.bgcw[113] = 3764018964625704915L;
        ez.bgcw[114] = -405650144427348412L;
        ez.bgcw[115] = 8107465094222197198L;
        ez.bgcw[116] = -2082775968953077206L;
        ez.bgcw[117] = 21094836132107445L;
        ez.bgcw[118] = 7679039757443263745L;
        ez.bgcw[119] = 2199092685831609835L;
        ez.bgcw[120] = -4911739317167813279L;
        ez.bgcw[121] = -8327640069532464075L;
        ez.bgcw[122] = -4083044703324303534L;
        ez.bgcw[123] = -7024826359780918877L;
        ez.bgcw[124] = -2941273131930337649L;
        ez.bgcw[125] = 5183204159908288680L;
        ez.bgcw[126] = -7564423348775616972L;
        ez.bgcw[127] = -8504699525918783496L;
        ez.bgcw[128] = 5141877178371754049L;
        ez.bgcw[129] = 8377542738712983976L;
        ez.bgcw[130] = -5957821535738704806L;
        ez.bgcw[131] = -958370762877310487L;
        ez.bgcw[132] = 4383444962626525950L;
        ez.bgcw[133] = 6903497651352887129L;
        ez.bgcw[134] = -5708763570352336897L;
        ez.bgcw[135] = -618112854665083703L;
        ez.bgcw[136] = 4424862406649157143L;
        ez.bgcw[137] = -8730506169674943747L;
        ez.bgcw[138] = 7261332422788812321L;
        ez.bgcw[139] = 6638828706666279354L;
        ez.bgcw[140] = 3204898769610710366L;
        ez.bgcw[141] = -8786947045374972412L;
        ez.bgcw[142] = 6002227013641722915L;
        ez.bgcw[143] = 2105426595098340792L;
        ez.bgcw[144] = -7410588566182714571L;
        ez.bgcw[145] = -6533956333387081312L;
        ez.bgcw[146] = -6479265696250574450L;
        ez.bgcw[147] = 2947786003169037254L;
        ez.bgcw[148] = 6333187612366623550L;
        ez.bgcw[149] = -278882011908202566L;
        ez.bgcw[150] = 6268998584784599322L;
        ez.bgcw[151] = -6260804469656470834L;
        ez.bgcw[152] = 6239846078716121734L;
        ez.bgcw[153] = 4230383141682445317L;
        ez.bgcw[154] = -2877414542612897949L;
        ez.bgcw[155] = -7447135404134842227L;
        ez.bgcw[156] = 8458559949178036195L;
        ez.bgcw[157] = 910825310110416453L;
        ez.bgcw[158] = 6497140015169871235L;
        ez.bgcw[159] = -757159401527654765L;
        ez.bgcw[160] = -1106603304111342224L;
        ez.bgcw[161] = -4140863486007320670L;
        ez.bgcw[162] = -5758152494245712555L;
        ez.bgcw[163] = 5187382793343078231L;
        ez.bgcw[164] = -8591345351675196305L;
        ez.bgcw[165] = 6747733877742922639L;
        ez.bgcw[166] = 1892710345503137560L;
        ez.bgcw[167] = 896624085221905470L;
        ez.bgcw[168] = -4783577495091821136L;
        ez.bgcw[169] = -9209009848907354772L;
        ez.bgcw[170] = -878504944179551300L;
        ez.bgcw[171] = -6323212886181712937L;
        ez.bgcw[172] = -8732899989863502468L;
        ez.bgcw[173] = 3468675271653838844L;
        ez.bgcw[174] = 4701462830199038027L;
        ez.bgcw[175] = 4129284194605718219L;
        ez.bgcw[176] = 1327429473997427438L;
        ez.bgcw[177] = 5054936769368446434L;
        ez.bgcw[178] = 4336572808443779815L;
        ez.bgcw[179] = -7576213372011484418L;
        ez.bgcw[180] = 3539926887036302091L;
        ez.bgcw[181] = 4751694264982093486L;
        ez.bgcw[182] = -5294483485933749846L;
        ez.bgcw[183] = 650068969498581693L;
        ez.bgcw[184] = 7004374977455313430L;
        ez.bgcw[185] = -3098141051035157521L;
        ez.bgcw[186] = -5061805965615765325L;
        ez.bgcw[187] = 1173462635930136268L;
        ez.bgcw[188] = -9183947607333859060L;
        ez.bgcw[189] = -5664491789252018996L;
        ez.bgcw[190] = -7000983196827688806L;
        ez.bgcw[191] = -8974040210950270679L;
        ez.bgcw[192] = -3157226857425432711L;
        ez.bgcw[193] = 7574222008363741477L;
        ez.bgcw[194] = 1394372747626796844L;
        ez.bgcw[195] = -189329884235477451L;
        ez.bgcw[196] = 4221031761782552350L;
        ez.bgcw[197] = -1187364295550659166L;
        ez.bgcw[198] = -5966098688343458195L;
        ez.bgcw[199] = 8575353685936452652L;
    }

    private static /* synthetic */ void bgxi() {
        ez.bgcw[0] = 36198843680244178L;
        ez.bgcw[1] = -360415597914098675L;
        ez.bgcw[2] = 4327583096673905678L;
        ez.bgcw[3] = 2493196713446594055L;
        ez.bgcw[4] = -2209534976561803107L;
        ez.bgcw[5] = -825239638295853049L;
        ez.bgcw[6] = 3298847241348113422L;
        ez.bgcw[7] = 8627117455303724602L;
        ez.bgcw[8] = 2047231734237982319L;
        ez.bgcw[9] = -333863881281702372L;
        ez.bgcw[10] = -803843836039175004L;
        ez.bgcw[11] = -7208619429005904421L;
        ez.bgcw[12] = 4796902900818170057L;
        ez.bgcw[13] = -1650098999078183251L;
        ez.bgcw[14] = -9031914453635019634L;
        ez.bgcw[15] = 6984201139061198405L;
        ez.bgcw[16] = -4479651392633517988L;
        ez.bgcw[17] = 8782495846270796L;
        ez.bgcw[18] = -1537219475337210225L;
        ez.bgcw[19] = -7496661424757829052L;
        ez.bgcw[20] = -2471760093142631522L;
        ez.bgcw[21] = 5019414176488863861L;
        ez.bgcw[22] = 5299429721535176870L;
        ez.bgcw[23] = 6038602140745719860L;
        ez.bgcw[24] = -863016936658785944L;
        ez.bgcw[25] = -6290953659512418742L;
        ez.bgcw[26] = 7841143416217512330L;
        ez.bgcw[27] = -1764000941736145813L;
        ez.bgcw[28] = -1437845805806361196L;
        ez.bgcw[29] = -4284519188270786053L;
        ez.bgcw[30] = -4396850252134638712L;
        ez.bgcw[31] = 6559250729157946183L;
        ez.bgcw[32] = -6580223260704419645L;
        ez.bgcw[33] = -8371715704587793277L;
        ez.bgcw[34] = 8492322178621194688L;
        ez.bgcw[35] = 8681077359910622153L;
        ez.bgcw[36] = 5193899132569357754L;
        ez.bgcw[37] = -6543960303302217887L;
        ez.bgcw[38] = 3882725626134919316L;
        ez.bgcw[39] = -5041911606336154558L;
        ez.bgcw[40] = -7979749677704091907L;
        ez.bgcw[41] = -6616902851484675879L;
        ez.bgcw[42] = 1883789385152432136L;
        ez.bgcw[43] = 2864250239010497976L;
        ez.bgcw[44] = -2826991697333151631L;
        ez.bgcw[45] = 2318251371308875803L;
        ez.bgcw[46] = -449689276983512077L;
        ez.bgcw[47] = -6203862026786700744L;
        ez.bgcw[48] = 8454064946712244961L;
        ez.bgcw[49] = 352721853402965103L;
        ez.bgcw[50] = -1340504717369122446L;
        ez.bgcw[51] = 1130404811305877855L;
        ez.bgcw[52] = 1093829069504464003L;
        ez.bgcw[53] = -6150639544041518673L;
        ez.bgcw[54] = -8022656283199118279L;
        ez.bgcw[55] = 7771782910101537534L;
        ez.bgcw[56] = 8903591631002517815L;
        ez.bgcw[57] = -4109857228601497023L;
        ez.bgcw[58] = -6265085842508718081L;
        ez.bgcw[59] = 5670871520900085436L;
        ez.bgcw[60] = -1680017350450054252L;
        ez.bgcw[61] = 1853438109006655102L;
        ez.bgcw[62] = 2229054617039473407L;
        ez.bgcw[63] = -8182596878887099252L;
        ez.bgcw[64] = 8991289333448146998L;
        ez.bgcw[65] = 960555531394087801L;
        ez.bgcw[66] = 8849410982422229726L;
        ez.bgcw[67] = -1484536673169965216L;
        ez.bgcw[68] = 4247857725259284383L;
        ez.bgcw[69] = -916111958176462224L;
        ez.bgcw[70] = -3771286341485565363L;
        ez.bgcw[71] = -8336016525027983800L;
        ez.bgcw[72] = -8036771659645595356L;
        ez.bgcw[73] = 7654244102582715682L;
        ez.bgcw[74] = -8233131123980678261L;
        ez.bgcw[75] = 4397743198425947234L;
        ez.bgcw[76] = 8978542401016007463L;
        ez.bgcw[77] = 8252171689189758573L;
        ez.bgcw[78] = 4652678071079699941L;
        ez.bgcw[79] = -5516096556880378526L;
        ez.bgcw[80] = -6920731871542316712L;
        ez.bgcw[81] = -2129194179346150578L;
        ez.bgcw[82] = -9132568712615519109L;
        ez.bgcw[83] = 5331360247021371524L;
        ez.bgcw[84] = -7618691452742562371L;
        ez.bgcw[85] = 4470803619696859903L;
        ez.bgcw[86] = 2315558558279292939L;
        ez.bgcw[87] = -6103217266233174559L;
        ez.bgcw[88] = 1904213822353321197L;
        ez.bgcw[89] = -1535945638199649059L;
        ez.bgcw[90] = 2812162954002968527L;
        ez.bgcw[91] = 3023764325699990518L;
        ez.bgcw[92] = -8615617524429821457L;
        ez.bgcw[93] = 8478211278877401941L;
        ez.bgcw[94] = 3005891989807238230L;
        ez.bgcw[95] = -2146383009467343611L;
        ez.bgcw[96] = 6078021449541123066L;
        ez.bgcw[97] = 6337048940788106093L;
        ez.bgcw[98] = 4368725772299865664L;
        ez.bgcw[99] = -6979954780771538908L;
    }

    private static /* synthetic */ void bgvh() {
        ez.bgci[0] = -1654904266;
        ez.bgci[1] = -1682735392;
        ez.bgci[2] = -388930059;
        ez.bgci[3] = 1197349105;
        ez.bgci[4] = 918796099;
        ez.bgci[5] = 741941831;
        ez.bgci[6] = -988090009;
        ez.bgci[7] = -1749383680;
        ez.bgci[8] = -1690828024;
        ez.bgci[9] = -1977415725;
        ez.bgci[10] = -1044697177;
        ez.bgci[11] = 1103623644;
        ez.bgci[12] = -782036846;
        ez.bgci[13] = 602038807;
        ez.bgci[14] = -2097869922;
        ez.bgci[15] = -83019254;
        ez.bgci[16] = -1368047316;
        ez.bgci[17] = 880515603;
        ez.bgci[18] = 1686000026;
        ez.bgci[19] = -1571654695;
        ez.bgci[20] = 421743058;
        ez.bgci[21] = -325333054;
        ez.bgci[22] = 926988714;
        ez.bgci[23] = -1160347566;
        ez.bgci[24] = -957525178;
        ez.bgci[25] = -672795698;
        ez.bgci[26] = 1864376266;
        ez.bgci[27] = -1047681434;
        ez.bgci[28] = -1240500017;
        ez.bgci[29] = -2033385182;
        ez.bgci[30] = 2125196148;
        ez.bgci[31] = -1109581067;
        ez.bgci[32] = -1135867511;
        ez.bgci[33] = 1821224431;
        ez.bgci[34] = -441706995;
        ez.bgci[35] = -1704180470;
        ez.bgci[36] = 1912042034;
        ez.bgci[37] = 1355985006;
        ez.bgci[38] = -602721164;
        ez.bgci[39] = -1812617473;
        ez.bgci[40] = 1383876798;
        ez.bgci[41] = 1023229547;
        ez.bgci[42] = 91161856;
        ez.bgci[43] = -1859463029;
        ez.bgci[44] = 1151073868;
        ez.bgci[45] = 177818491;
        ez.bgci[46] = 1629649665;
        ez.bgci[47] = -949342226;
        ez.bgci[48] = -1566901522;
        ez.bgci[49] = -1172946816;
        ez.bgci[50] = -623460;
        ez.bgci[51] = 1437197858;
        ez.bgci[52] = -1704812776;
        ez.bgci[53] = 1350746322;
        ez.bgci[54] = 69833203;
        ez.bgci[55] = 1344474811;
        ez.bgci[56] = 1252582020;
        ez.bgci[57] = -1180384471;
        ez.bgci[58] = -686742322;
        ez.bgci[59] = -1829170916;
        ez.bgci[60] = 1659539365;
        ez.bgci[61] = -722697930;
        ez.bgci[62] = 0x747A7777;
        ez.bgci[63] = 667152693;
        ez.bgci[64] = 1226468778;
        ez.bgci[65] = 2011268766;
        ez.bgci[66] = 1232265705;
        ez.bgci[67] = 556139496;
        ez.bgci[68] = -2021791763;
        ez.bgci[69] = 1517416052;
        ez.bgci[70] = -642601148;
        ez.bgci[71] = 1667286387;
        ez.bgci[72] = -1881277910;
        ez.bgci[73] = -1556438667;
        ez.bgci[74] = 1403686537;
        ez.bgci[75] = -467673717;
        ez.bgci[76] = 1380488872;
        ez.bgci[77] = 702753020;
        ez.bgci[78] = 1823546829;
        ez.bgci[79] = 874338820;
        ez.bgci[80] = -296949560;
        ez.bgci[81] = -1122607132;
        ez.bgci[82] = -982200242;
        ez.bgci[83] = 1613827458;
        ez.bgci[84] = 1201049410;
        ez.bgci[85] = 655586598;
        ez.bgci[86] = 1045544146;
        ez.bgci[87] = -1421043385;
        ez.bgci[88] = -67747891;
        ez.bgci[89] = -1177893453;
        ez.bgci[90] = -909767532;
        ez.bgci[91] = 583060572;
        ez.bgci[92] = 2130097033;
        ez.bgci[93] = 731068212;
        ez.bgci[94] = 801665562;
        ez.bgci[95] = 1669060;
        ez.bgci[96] = 1362450613;
        ez.bgci[97] = 436031328;
        ez.bgci[98] = -673495487;
        ez.bgci[99] = -306945169;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private Stream<class_1735> getSlots() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ez.dg - ez.bgcj("bgoj", bgcu(int ), (int)152)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ez.bgcj("bgok", bgcl(int ), (int)154)) break;
            v0 /* !! */  = (long)ez.bgcj("bgol", bgcl(int ), (int)155);
        }
        var3_1 = ez.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ez.dg - ez.bgcj("bgom", bgcu(int ), (int)153)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ez.bgcj("bgon", bgcl(int ), (int)156)) break;
            v1 /* !! */  = (long)ez.bgcj("bgoo", bgcl(int ), (int)157);
        }
        var2_2 /* !! */  = ez.b;
        v2 /* !! */  = ez.dg;
        if (true) ** GOTO lbl17
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - ez.bgcj("bgop", bgcu(int ), (int)154));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 140996543: {
                    break block24;
                }
                case 798760366: {
                    v3 = ez.bgcj("bgoq", bgcu(int ), (int)155);
                    continue block24;
                }
                case 1151859243: {
                    v3 = ez.bgcj("bgor", bgcu(int ), (int)156);
                    continue block24;
                }
            }
            break;
        }
        var1_3 = ez.a;
        if (var3_1) {
            throw null;
lbl29:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl29
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = ez.dg;
                if (true) ** GOTO lbl40
                block26: while (true) {
                    v4 /* !! */  = (long)(v5 - ez.bgcj("bgos", bgcu(int ), (int)157));
lbl40:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1135113523: {
                            v5 = ez.bgcj("bgot", bgcu(int ), (int)158);
                            continue block26;
                        }
                        case -74804847: {
                            v5 = ez.bgcj("bgou", bgcu(int ), (int)159);
                            continue block26;
                        }
                        case 140996543: {
                            break block26;
                        }
                        case 921909479: {
                            v5 = ez.bgcj("bgov", bgcu(int ), (int)160);
                            continue block26;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = ez.dg - ez.bgcj("bgow", bgcu(int ), (int)161)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ez.bgcj("bgox", bgcl(int ), (int)158)) break;
                    v6 /* !! */  = (long)ez.bgcj("bgoy", bgcl(int ), (int)159);
                }
                v7 = ez.mc.field_1724;
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = ez.dg - ez.bgcj("bgoz", bgcu(int ), (int)162)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ez.bgcj("bgpa", bgcl(int ), (int)160)) break;
                    v8 /* !! */  = (long)ez.bgcj("bgpb", bgcl(int ), (int)161);
                }
                v9 = v7.field_7512;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = ez.dg - ez.bgcj("bgpc", bgcu(int ), (int)163)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ez.bgcj("bgpd", bgcl(int ), (int)162)) break;
                    v10 /* !! */  = (long)ez.bgcj("bgpe", bgcl(int ), (int)163);
                }
                v11 = v9.field_7761;
                v12 /* !! */  = ez.dg;
                if (true) ** GOTO lbl74
                block30: while (true) {
                    v12 /* !! */  = (long)(v13 - ez.bgcj("bgpf", bgcu(int ), (int)164));
lbl74:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -833828057: {
                            v13 = ez.bgcj("bgpg", bgcu(int ), (int)165);
                            continue block30;
                        }
                        case 140996543: {
                            break block30;
                        }
                        case 1517545347: {
                            v13 = ez.bgcj("bgph", bgcu(int ), (int)166);
                            continue block30;
                        }
                    }
                    break;
                }
                return v11.stream();
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)ez.bgcj("bgpi", bgcl(int ), (int)164);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)ez.bgcj("bgpj", bgcl(int ), (int)165);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ez.bgcj("bgpk", bgcl(int ), (int)166);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)ez.bgcj("bgpl", bgcl(int ), (int)167);
        } while (!var3_1);
        throw null;
    }
}

