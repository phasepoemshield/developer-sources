/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1309
 *  net.minecraft.class_1531
 *  net.minecraft.class_1690
 *  net.minecraft.class_1802
 *  net.minecraft.class_2596
 *  net.minecraft.class_2848
 *  net.minecraft.class_2848$class_2849
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Supplier;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1531;
import net.minecraft.class_1690;
import net.minecraft.class_1802;
import net.minecraft.class_2596;
import net.minecraft.class_2848;
import ruhack.phobia.aw;
import ruhack.phobia.cw;
import ruhack.phobia.df;
import ruhack.phobia.dg;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.nn;
import ruhack.phobia.nq;
import ruhack.phobia.nv;
import ruhack.phobia.os;
import ruhack.phobia.ot;
import ruhack.phobia.ov;

public class gd
extends ds {
    public static final boolean c;
    public static final int b;
    public static final long qn = 4366647080808433611L;
    public static final boolean a;
    private final kg speed;
    private static long[] ivcs;
    private final kb diving;
    private static long[] ivct;
    private static int[] ivcc;
    private static int[] ivcb;
    private final kf mode;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleFuntimeElytraMode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gd.qn - gd.ivce("iwlc", ivcr(int ), (int)93)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gd.ivce("iwld", ivci(int ), (int)130)) break;
            v0 /* !! */  = (long)gd.ivce("iwle", ivci(int ), (int)131);
        }
        var5_1 = gd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gd.qn - gd.ivce("iwlf", ivcr(int ), (int)94)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gd.ivce("iwlg", ivci(int ), (int)132)) break;
            v1 /* !! */  = (long)gd.ivce("iwlh", ivci(int ), (int)133);
        }
        var4_2 /* !! */  = gd.b;
        v2 /* !! */  = gd.qn;
        if (true) ** GOTO lbl17
        block126: while (true) {
            v2 /* !! */  = (long)(v3 - gd.ivce("iwli", ivcr(int ), (int)95));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2141652064: {
                    v3 = gd.ivce("iwlj", ivcr(int ), (int)96);
                    continue block126;
                }
                case 461829250: {
                    v3 = gd.ivce("iwlk", ivcr(int ), (int)97);
                    continue block126;
                }
                case 1304226330: {
                    v3 = gd.ivce("iwll", ivcr(int ), (int)98);
                    continue block126;
                }
                case 1863665611: {
                    break block126;
                }
            }
            break;
        }
        var3_3 = gd.a;
        if (var5_1) {
            throw null;
lbl32:
            // 14 sources

            return;
        }
        if (var3_3) ** GOTO lbl32
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3) ** GOTO lbl32
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = gd.qn - gd.ivce("iwlm", ivcr(int ), (int)99)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == gd.ivce("iwln", ivci(int ), (int)134)) break;
                    v4 /* !! */  = (long)gd.ivce("iwlo", ivci(int ), (int)135);
                }
                v5 /* !! */  = gd.qn;
                if (true) ** GOTO lbl48
                block129: while (true) {
                    v5 /* !! */  = (long)(v6 - gd.ivce("iwlp", ivcr(int ), (int)100));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 1045116398: {
                            v6 = gd.ivce("iwlq", ivcr(int ), (int)101);
                            continue block129;
                        }
                        case 1058820337: {
                            v6 = gd.ivce("iwlr", ivcr(int ), (int)102);
                            continue block129;
                        }
                        case 1863665611: {
                            break block129;
                        }
                    }
                    break;
                }
                var1_4 = nv.findHotbarItem(class_1802.field_8833);
                if (var3_3 || var3_3) ** GOTO lbl32
                if (var1_4 != gd.ivce("iwls", ivci(int ), (int)136)) ** GOTO lbl62
                if (var3_3) ** GOTO lbl32
                return;
lbl62:
                // 1 sources

                if (var3_3 || var3_3) ** GOTO lbl32
                v7 /* !! */  = gd.qn;
                if (true) ** GOTO lbl67
                block130: while (true) {
                    v7 /* !! */  = (long)(v8 - gd.ivce("iwlt", ivcr(int ), (int)103));
lbl67:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 74506157: {
                            v8 = gd.ivce("iwlu", ivcr(int ), (int)104);
                            continue block130;
                        }
                        case 1409745737: {
                            v8 = gd.ivce("iwlv", ivcr(int ), (int)105);
                            continue block130;
                        }
                        case 1863665611: {
                            break block130;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = gd.qn - gd.ivce("iwlw", ivcr(int ), (int)106)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == gd.ivce("iwlx", ivci(int ), (int)137)) break;
                    v9 /* !! */  = (long)gd.ivce("iwly", ivci(int ), (int)138);
                }
                if (!this.diving.isValue()) ** GOTO lbl208
                if (var3_3 || var3_3) ** GOTO lbl32
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = gd.qn - gd.ivce("iwlz", ivcr(int ), (int)107)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == gd.ivce("iwma", ivci(int ), (int)139)) break;
                    v10 /* !! */  = (long)gd.ivce("iwmb", ivci(int ), (int)140);
                }
                v11 /* !! */  = gd.qn;
                if (true) ** GOTO lbl92
                block133: while (true) {
                    v11 /* !! */  = (long)(gd.ivce("iwmd", ivcr(int ), (int)109) - gd.ivce("iwmc", ivcr(int ), (int)108));
lbl92:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 1863665611: {
                            break block133;
                        }
                        case 1949098064: {
                            continue block133;
                        }
                    }
                    break;
                }
                v12 = gd.mc.field_1773;
                v13 /* !! */  = gd.qn;
                if (true) ** GOTO lbl102
                block134: while (true) {
                    v13 /* !! */  = (long)(gd.ivce("iwmf", ivcr(int ), (int)111) - gd.ivce("iwme", ivcr(int ), (int)110));
lbl102:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case 936126105: {
                            continue block134;
                        }
                        case 1863665611: {
                            break block134;
                        }
                    }
                    break;
                }
                v14 = v12.method_19418();
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = gd.qn - gd.ivce("iwmg", ivcr(int ), (int)112)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == gd.ivce("iwmh", ivci(int ), (int)141)) break;
                    v15 /* !! */  = (long)gd.ivce("iwmi", ivci(int ), (int)142);
                }
                var2_5 = v14.method_19330();
                if (var3_3 || var3_3) ** GOTO lbl32
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_6 = gd.qn - gd.ivce("iwmj", ivcr(int ), (int)113)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == gd.ivce("iwmk", ivci(int ), (int)143)) break;
                    v16 /* !! */  = (long)gd.ivce("iwml", ivci(int ), (int)144);
                }
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_7 = gd.qn - gd.ivce("iwmm", ivcr(int ), (int)114)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == gd.ivce("iwmn", ivci(int ), (int)145)) break;
                    v17 /* !! */  = (long)gd.ivce("iwmo", ivci(int ), (int)146);
                }
                v18 = gd.mc.field_1690;
                v19 /* !! */  = gd.qn;
                if (true) ** GOTO lbl130
                block138: while (true) {
                    v19 /* !! */  = (long)(gd.ivce("iwmq", ivcr(int ), (int)116) - gd.ivce("iwmp", ivcr(int ), (int)115));
lbl130:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1168424235: {
                            continue block138;
                        }
                        case 1863665611: {
                            break block138;
                        }
                    }
                    break;
                }
                v20 = v18.method_31044();
                v21 /* !! */  = gd.qn;
                if (true) ** GOTO lbl140
                block139: while (true) {
                    v21 /* !! */  = (long)(gd.ivce("iwms", ivcr(int ), (int)118) - gd.ivce("iwmr", ivcr(int ), (int)117));
lbl140:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1349882762: {
                            continue block139;
                        }
                        case 1863665611: {
                            break block139;
                        }
                    }
                    break;
                }
                if (!v20.method_31035()) ** GOTO lbl149
                if (var3_3 || var3_3) ** GOTO lbl32
                var2_5 -= gd.ivce("iwmt", ivca(int ), (int)147);
                if (var3_3) ** GOTO lbl32
lbl149:
                // 2 sources

                if (var3_3 || var3_3) ** GOTO lbl32
                v22 /* !! */  = gd.qn;
                if (true) ** GOTO lbl154
                block140: while (true) {
                    v22 /* !! */  = (long)(gd.ivce("iwmv", ivcr(int ), (int)120) - gd.ivce("iwmu", ivcr(int ), (int)119));
lbl154:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case 1680561281: {
                            continue block140;
                        }
                        case 1863665611: {
                            break block140;
                        }
                    }
                    break;
                }
                v23 /* !! */  = gd.qn;
                if (true) ** GOTO lbl163
                block141: while (true) {
                    v23 /* !! */  = (long)(v24 - gd.ivce("iwmw", ivcr(int ), (int)121));
lbl163:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case 364162293: {
                            v24 = gd.ivce("iwmx", ivcr(int ), (int)122);
                            continue block141;
                        }
                        case 568630232: {
                            v24 = gd.ivce("iwmy", ivcr(int ), (int)123);
                            continue block141;
                        }
                        case 1863665611: {
                            break block141;
                        }
                    }
                    break;
                }
                v25 = gd.ivce("iwmz", ivca(int ), (int)148);
                v26 /* !! */  = gd.qn;
                if (true) ** GOTO lbl177
                block142: while (true) {
                    v26 /* !! */  = (long)(v27 - gd.ivce("iwna", ivcr(int ), (int)124));
lbl177:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case 549873395: {
                            v27 = gd.ivce("iwnb", ivcr(int ), (int)125);
                            continue block142;
                        }
                        case 1390506790: {
                            v27 = gd.ivce("iwnc", ivcr(int ), (int)126);
                            continue block142;
                        }
                        case 1863665611: {
                            break block142;
                        }
                    }
                    break;
                }
                v28 = new ov(var2_5, (float)v25);
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_8 = gd.qn - gd.ivce("iwnd", ivcr(int ), (int)127)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == gd.ivce("iwne", ivci(int ), (int)149)) break;
                    v29 /* !! */  = (long)gd.ivce("iwnf", ivci(int ), (int)150);
                }
                v30 /* !! */  = gd.qn;
                if (true) ** GOTO lbl196
                block144: while (true) {
                    v30 /* !! */  = (long)(gd.ivce("iwnh", ivcr(int ), (int)129) - gd.ivce("iwng", ivcr(int ), (int)128));
lbl196:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case 803165705: {
                            continue block144;
                        }
                        case 1863665611: {
                            break block144;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_9 = gd.qn - gd.ivce("iwni", ivcr(int ), (int)130)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == gd.ivce("iwnj", ivci(int ), (int)151)) break;
                    v31 /* !! */  = (long)gd.ivce("iwnk", ivci(int ), (int)152);
                }
                ot.INSTANCE.rotateTo(v28, os.DEFAULT, nn.HIGH_IMPORTANCE_1, this);
                if (var3_3) ** GOTO lbl32
lbl208:
                // 2 sources

                if (var3_3 || var3_3) ** GOTO lbl32
                v32 /* !! */  = gd.qn;
                if (true) ** GOTO lbl213
                block146: while (true) {
                    v32 /* !! */  = (long)(v33 - gd.ivce("iwnl", ivcr(int ), (int)131));
lbl213:
                    // 2 sources

                    switch ((int)v32 /* !! */ ) {
                        case -706374676: {
                            v33 = gd.ivce("iwnm", ivcr(int ), (int)132);
                            continue block146;
                        }
                        case 60415727: {
                            v33 = gd.ivce("iwnn", ivcr(int ), (int)133);
                            continue block146;
                        }
                        case 1742202728: {
                            v33 = gd.ivce("iwno", ivcr(int ), (int)134);
                            continue block146;
                        }
                        case 1863665611: {
                            break block146;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v34 /* !! */  = (cfr_temp_10 = gd.qn - gd.ivce("iwnp", ivcr(int ), (int)135)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v34 /* !! */  == gd.ivce("iwnq", ivci(int ), (int)153)) break;
                    v34 /* !! */  = (long)gd.ivce("iwnr", ivci(int ), (int)154);
                }
                v35 = gd.mc.field_1724;
                v36 /* !! */  = gd.qn;
                if (true) ** GOTO lbl235
                block148: while (true) {
                    v36 /* !! */  = (long)(v37 - gd.ivce("iwns", ivcr(int ), (int)136));
lbl235:
                    // 2 sources

                    switch ((int)v36 /* !! */ ) {
                        case -1524720785: {
                            v37 = gd.ivce("iwnt", ivcr(int ), (int)137);
                            continue block148;
                        }
                        case -1477318293: {
                            v37 = gd.ivce("iwnu", ivcr(int ), (int)138);
                            continue block148;
                        }
                        case 1863665611: {
                            break block148;
                        }
                    }
                    break;
                }
                v38 = v35.field_3944;
                v39 /* !! */  = gd.qn;
                if (true) ** GOTO lbl249
                block149: while (true) {
                    v39 /* !! */  = (long)(v40 - gd.ivce("iwnv", ivcr(int ), (int)139));
lbl249:
                    // 2 sources

                    switch ((int)v39 /* !! */ ) {
                        case -500703375: {
                            v40 = gd.ivce("iwnw", ivcr(int ), (int)140);
                            continue block149;
                        }
                        case 1076360290: {
                            v40 = gd.ivce("iwnx", ivcr(int ), (int)141);
                            continue block149;
                        }
                        case 1557080194: {
                            v40 = gd.ivce("iwny", ivcr(int ), (int)142);
                            continue block149;
                        }
                        case 1863665611: {
                            break block149;
                        }
                    }
                    break;
                }
                v41 /* !! */  = gd.qn;
                if (true) ** GOTO lbl265
                block150: while (true) {
                    v41 /* !! */  = (long)(v42 - gd.ivce("iwnz", ivcr(int ), (int)143));
lbl265:
                    // 2 sources

                    switch ((int)v41 /* !! */ ) {
                        case -1418568030: {
                            v42 = gd.ivce("iwoa", ivcr(int ), (int)144);
                            continue block150;
                        }
                        case 1484154258: {
                            v42 = gd.ivce("iwob", ivcr(int ), (int)145);
                            continue block150;
                        }
                        case 1797452493: {
                            v42 = gd.ivce("iwoc", ivcr(int ), (int)146);
                            continue block150;
                        }
                        case 1863665611: {
                            break block150;
                        }
                    }
                    break;
                }
                v43 /* !! */  = gd.qn;
                if (true) ** GOTO lbl281
                block151: while (true) {
                    v43 /* !! */  = (long)(v44 - gd.ivce("iwod", ivcr(int ), (int)147));
lbl281:
                    // 2 sources

                    switch ((int)v43 /* !! */ ) {
                        case -394057125: {
                            v44 = gd.ivce("iwoe", ivcr(int ), (int)148);
                            continue block151;
                        }
                        case 1361081593: {
                            v44 = gd.ivce("iwof", ivcr(int ), (int)149);
                            continue block151;
                        }
                        case 1863665611: {
                            break block151;
                        }
                        case 2129132140: {
                            v44 = gd.ivce("iwog", ivcr(int ), (int)150);
                            continue block151;
                        }
                    }
                    break;
                }
                v45 = gd.mc.field_1724;
                while (true) {
                    if ((v46 /* !! */  = (cfr_temp_11 = gd.qn - gd.ivce("iwoh", ivcr(int ), (int)151)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v46 /* !! */  == gd.ivce("iwoi", ivci(int ), (int)155)) break;
                    v46 /* !! */  = (long)gd.ivce("iwoj", ivci(int ), (int)156);
                }
                v47 /* !! */  = gd.qn;
                if (true) ** GOTO lbl303
                block153: while (true) {
                    v47 /* !! */  = (long)(v48 - gd.ivce("iwok", ivcr(int ), (int)152));
lbl303:
                    // 2 sources

                    switch ((int)v47 /* !! */ ) {
                        case -1785738828: {
                            v48 = gd.ivce("iwol", ivcr(int ), (int)153);
                            continue block153;
                        }
                        case 655892036: {
                            v48 = gd.ivce("iwom", ivcr(int ), (int)154);
                            continue block153;
                        }
                        case 1863665611: {
                            break block153;
                        }
                    }
                    break;
                }
                v49 = new class_2848((class_1297)v45, class_2848.class_2849.field_12982);
                v50 /* !! */  = gd.qn;
                if (true) ** GOTO lbl317
                block154: while (true) {
                    v50 /* !! */  = (long)(v51 - gd.ivce("iwon", ivcr(int ), (int)155));
lbl317:
                    // 2 sources

                    switch ((int)v50 /* !! */ ) {
                        case 52454521: {
                            v51 = gd.ivce("iwoo", ivcr(int ), (int)156);
                            continue block154;
                        }
                        case 1582136757: {
                            v51 = gd.ivce("iwop", ivcr(int ), (int)157);
                            continue block154;
                        }
                        case 1633284272: {
                            v51 = gd.ivce("iwoq", ivcr(int ), (int)158);
                            continue block154;
                        }
                        case 1863665611: {
                            break block154;
                        }
                    }
                    break;
                }
                v38.method_52787((class_2596)v49);
                if (var3_3 || var3_3) ** GOTO lbl32
                v52 /* !! */  = gd.qn;
                if (true) ** GOTO lbl335
                block155: while (true) {
                    v52 /* !! */  = (long)(v53 - gd.ivce("iwor", ivcr(int ), (int)159));
lbl335:
                    // 2 sources

                    switch ((int)v52 /* !! */ ) {
                        case -1613375770: {
                            v53 = gd.ivce("iwos", ivcr(int ), (int)160);
                            continue block155;
                        }
                        case 1659726959: {
                            v53 = gd.ivce("iwot", ivcr(int ), (int)161);
                            continue block155;
                        }
                        case 1765838536: {
                            v53 = gd.ivce("iwou", ivcr(int ), (int)162);
                            continue block155;
                        }
                        case 1863665611: {
                            break block155;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v54 /* !! */  = (cfr_temp_12 = gd.qn - gd.ivce("iwov", ivcr(int ), (int)163)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v54 /* !! */  == gd.ivce("iwow", ivci(int ), (int)157)) break;
                    v54 /* !! */  = (long)gd.ivce("iwox", ivci(int ), (int)158);
                }
                v55 = gd.mc.field_1724;
                while (true) {
                    if ((v56 /* !! */  = (cfr_temp_13 = gd.qn - gd.ivce("iwoy", ivcr(int ), (int)164)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v56 /* !! */  == gd.ivce("iwoz", ivci(int ), (int)159)) break;
                    v56 /* !! */  = (long)gd.ivce("iwpa", ivci(int ), (int)160);
                }
                v55.method_23669();
                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var4_2 /* !! */  = (int)gd.ivce("iwpb", ivci(int ), (int)161);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl451
            }
            case 1: {
                var4_2 /* !! */  = (int)gd.ivce("iwpc", ivci(int ), (int)162);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl451
            }
lbl372:
            // 3 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var4_2 /* !! */  = (int)gd.ivce("iwpd", ivci(int ), (int)163);
                    if (!var5_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl377:
            // 2 sources

            case 3: {
                var4_2 /* !! */  = (int)gd.ivce("iwpe", ivci(int ), (int)164);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl463
            }
            case 4: {
                var4_2 /* !! */  = (int)gd.ivce("iwpf", ivci(int ), (int)165);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl467
            }
            case 5: {
                var4_2 /* !! */  = (int)gd.ivce("iwpg", ivci(int ), (int)166);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl442
            }
lbl392:
            // 2 sources

            case 6: {
                var4_2 /* !! */  = (int)gd.ivce("iwph", ivci(int ), (int)167);
                if (var5_1) {
                    throw null;
                }
            }
lbl396:
            // 4 sources

            case 7: {
                var4_2 /* !! */  = (int)gd.ivce("iwpi", ivci(int ), (int)168);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl433
            }
lbl401:
            // 2 sources

            case 8: {
                var4_2 /* !! */  = (int)gd.ivce("iwpj", ivci(int ), (int)169);
                if (!var5_1) ** GOTO lbl372
                throw null;
            }
lbl405:
            // 2 sources

            case 9: {
                var4_2 /* !! */  = (int)gd.ivce("iwpk", ivci(int ), (int)170);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl437
            }
            case 10: {
                var4_2 /* !! */  = (int)gd.ivce("iwpl", ivci(int ), (int)171);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl437
            }
lbl415:
            // 2 sources

            case 11: {
                var4_2 /* !! */  = (int)gd.ivce("iwpm", ivci(int ), (int)172);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl463
            }
            case 12: {
                do {
                    var4_2 /* !! */  = (int)gd.ivce("iwpn", ivci(int ), (int)173);
                } while (!var5_1);
                throw null;
            }
            case 13: {
                var4_2 /* !! */  = (int)gd.ivce("iwpo", ivci(int ), (int)174);
                if (!var5_1) ** GOTO lbl401
                throw null;
            }
            case 14: {
                var4_2 /* !! */  = (int)gd.ivce("iwpp", ivci(int ), (int)175);
                if (!var5_1) ** GOTO lbl405
                throw null;
            }
lbl433:
            // 2 sources

            case 15: {
                var4_2 /* !! */  = (int)gd.ivce("iwpq", ivci(int ), (int)176);
                if (!var5_1) ** GOTO lbl415
                throw null;
            }
lbl437:
            // 3 sources

            case 16: {
                var4_2 /* !! */  = (int)gd.ivce("iwpr", ivci(int ), (int)177);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl451
            }
lbl442:
            // 2 sources

            case 17: {
                var4_2 /* !! */  = (int)gd.ivce("iwps", ivci(int ), (int)178);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl467
            }
            case 18: {
                var4_2 /* !! */  = (int)gd.ivce("iwpt", ivci(int ), (int)179);
                if (!var5_1) ** GOTO lbl377
                throw null;
            }
lbl451:
            // 5 sources

            case 19: {
                var4_2 /* !! */  = (int)gd.ivce("iwpu", ivci(int ), (int)180);
                if (!var5_1) ** GOTO lbl372
                throw null;
            }
            case 20: {
                var4_2 /* !! */  = (int)gd.ivce("iwpv", ivci(int ), (int)181);
                if (!var5_1) ** GOTO lbl451
                throw null;
            }
            case 21: {
                var4_2 /* !! */  = (int)gd.ivce("iwpw", ivci(int ), (int)182);
                if (var5_1) {
                    throw null;
                }
            }
lbl463:
            // 5 sources

            case 22: {
                var4_2 /* !! */  = (int)gd.ivce("iwpx", ivci(int ), (int)183);
                if (!var5_1) ** GOTO lbl392
                throw null;
            }
lbl467:
            // 4 sources

            case 23: {
                var4_2 /* !! */  = (int)gd.ivce("iwpy", ivci(int ), (int)184);
                if (!var5_1) ** GOTO lbl396
                throw null;
            }
            case 24: {
                var4_2 /* !! */  = (int)gd.ivce("iwqa", ivci(int ), (int)185);
                if (!var5_1) ** GOTO lbl467
                throw null;
            }
            case 25: 
        }
        var4_2 /* !! */  = (int)gd.ivce("iwqb", ivci(int ), (int)186);
        ** while (!var5_1)
lbl478:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean hasSprintingTarget() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gd.qn - gd.ivce("iwuo", ivcr(int ), (int)169)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gd.ivce("iwup", ivci(int ), (int)249)) break;
            v0 /* !! */  = (long)gd.ivce("iwur", ivci(int ), (int)250);
        }
        var3_1 = gd.c;
        v1 /* !! */  = gd.qn;
        if (true) ** GOTO lbl12
        block15: while (true) {
            v1 /* !! */  = (long)(gd.ivce("iwuu", ivcr(int ), (int)171) - gd.ivce("iwus", ivcr(int ), (int)170));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1353277582: {
                    continue block15;
                }
                case 1863665611: {
                    break block15;
                }
            }
            break;
        }
        var2_2 /* !! */  = gd.b;
        v2 /* !! */  = gd.qn;
        if (true) ** GOTO lbl22
        block16: while (true) {
            v2 /* !! */  = (long)(gd.ivce("iwuw", ivcr(int ), (int)173) - gd.ivce("iwuv", ivcr(int ), (int)172));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1133346973: {
                    continue block16;
                }
                case 1863665611: {
                    break block16;
                }
            }
            break;
        }
        var1_3 = gd.a;
        if (var3_1) {
            throw null;
lbl30:
            // 2 sources

            return (boolean)gd.ivce("iwux", ivci(int ), (int)251);
        }
        if (var1_3) ** GOTO lbl30
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                return (boolean)gd.ivce("iwuy", ivci(int ), (int)252);
            }
lbl38:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)gd.ivce("iwuz", ivci(int ), (int)253);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gd.ivce("iwva", ivci(int ), (int)254);
                    if (!var3_1) ** GOTO lbl38
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)gd.ivce("iwvb", ivci(int ), (int)255);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)gd.ivce("iwvd", ivci(int ), (int)256);
        ** while (!var3_1)
lbl54:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iwxo() {
        gd.ivcc[200] = 1675243313;
        gd.ivcc[201] = -361528965;
        gd.ivcc[202] = -1353521224;
        gd.ivcc[203] = 341663078;
        gd.ivcc[204] = 922882265;
        gd.ivcc[205] = -372524640;
        gd.ivcc[206] = -1288209500;
        gd.ivcc[207] = 1295984803;
        gd.ivcc[208] = -828408085;
        gd.ivcc[209] = 631684329;
        gd.ivcc[210] = -227255032;
        gd.ivcc[211] = 63400908;
        gd.ivcc[212] = 324450857;
        gd.ivcc[213] = 871141569;
        gd.ivcc[214] = -793692973;
        gd.ivcc[215] = -122026635;
        gd.ivcc[216] = 618851961;
        gd.ivcc[217] = 729082498;
        gd.ivcc[218] = -641497003;
        gd.ivcc[219] = 2137534375;
        gd.ivcc[220] = -1167046149;
        gd.ivcc[221] = -1921422778;
        gd.ivcc[222] = 670849446;
        gd.ivcc[223] = 1619100179;
        gd.ivcc[224] = 231114770;
        gd.ivcc[225] = -671872964;
        gd.ivcc[226] = -1525071892;
        gd.ivcc[227] = -1080553422;
        gd.ivcc[228] = -978069934;
        gd.ivcc[229] = -724361303;
        gd.ivcc[230] = -236719776;
        gd.ivcc[231] = -942552693;
        gd.ivcc[232] = -535977069;
        gd.ivcc[233] = -265771490;
        gd.ivcc[234] = 1963775173;
        gd.ivcc[235] = -1990748184;
        gd.ivcc[236] = -1893784153;
        gd.ivcc[237] = 754838549;
        gd.ivcc[238] = -1359951662;
        gd.ivcc[239] = 1493939821;
        gd.ivcc[240] = 1794663653;
        gd.ivcc[241] = 1040456737;
        gd.ivcc[242] = -1426586279;
        gd.ivcc[243] = 426108396;
        gd.ivcc[244] = 1671691237;
        gd.ivcc[245] = -1317996186;
        gd.ivcc[246] = 715090603;
        gd.ivcc[247] = -756149641;
        gd.ivcc[248] = -627929208;
        gd.ivcc[249] = -1723646411;
        gd.ivcc[250] = -1325972678;
        gd.ivcc[251] = -6531220;
        gd.ivcc[252] = 855036485;
        gd.ivcc[253] = 1084490714;
        gd.ivcc[254] = 1253628867;
        gd.ivcc[255] = -271925585;
        gd.ivcc[256] = -1581665700;
        gd.ivcc[257] = 940008608;
        gd.ivcc[258] = 403267803;
        gd.ivcc[259] = 1328051708;
        gd.ivcc[260] = -809910922;
        gd.ivcc[261] = 1792962738;
        gd.ivcc[262] = 2073209985;
        gd.ivcc[263] = -1472153039;
        gd.ivcc[264] = -1926629505;
        gd.ivcc[265] = 475578258;
        gd.ivcc[266] = 2134514318;
        gd.ivcc[267] = 1005313349;
        gd.ivcc[268] = 1497896538;
        gd.ivcc[269] = -1543359875;
        gd.ivcc[270] = -1821891351;
        gd.ivcc[271] = 1518347116;
        gd.ivcc[272] = 1157182446;
        gd.ivcc[273] = -1386807175;
        gd.ivcc[274] = 1070583408;
        gd.ivcc[275] = 324023793;
        gd.ivcc[276] = 1206528921;
        gd.ivcc[277] = -731506391;
        gd.ivcc[278] = 215116516;
        gd.ivcc[279] = 280585849;
        gd.ivcc[280] = 73625279;
        gd.ivcc[281] = -881323171;
        gd.ivcc[282] = -1609025704;
        gd.ivcc[283] = 516551249;
        gd.ivcc[284] = 89400292;
        gd.ivcc[285] = 390120561;
        gd.ivcc[286] = -974371895;
        gd.ivcc[287] = 220332702;
        gd.ivcc[288] = 1447152286;
        gd.ivcc[289] = -426907339;
        gd.ivcc[290] = 756597828;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gd.qn - gd.ivce("iwwn", ivcr(int ), (int)187)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gd.ivce("iwwo", ivci(int ), (int)279)) break;
            v0 /* !! */  = (long)gd.ivce("iwwp", ivci(int ), (int)280);
        }
        var3_1 = gd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gd.qn - gd.ivce("iwwq", ivcr(int ), (int)188)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gd.ivce("iwwr", ivci(int ), (int)281)) break;
            v1 /* !! */  = (long)gd.ivce("iwws", ivci(int ), (int)282);
        }
        var2_2 /* !! */  = gd.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = gd.qn - gd.ivce("iwwt", ivcr(int ), (int)189)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == gd.ivce("iwwu", ivci(int ), (int)283)) break;
            v2 /* !! */  = (long)gd.ivce("iwwv", ivci(int ), (int)284);
        }
        var1_3 = gd.a;
        if (!var3_1) ** GOTO lbl25
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl25:
                // 1 sources

                if (var1_3 || var1_3) continue block19;
                v3 /* !! */  = gd.qn;
                if (true) ** GOTO lbl30
                block20: while (true) {
                    v3 /* !! */  = (long)(gd.ivce("iwwx", ivcr(int ), (int)191) - gd.ivce("iwww", ivcr(int ), (int)190));
lbl30:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 1109472267: {
                            continue block20;
                        }
                        case 1863665611: {
                            break block20;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = gd.qn - gd.ivce("iwwy", ivcr(int ), (int)192)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == gd.ivce("iwwz", ivci(int ), (int)285)) break;
                    v4 /* !! */  = (long)gd.ivce("iwxa", ivci(int ), (int)286);
                }
                v5 = this.mode.isSelected("Vanilla");
                v6 /* !! */  = gd.qn;
                if (true) ** GOTO lbl45
                block22: while (true) {
                    v6 /* !! */  = (long)(v7 - gd.ivce("iwxb", ivcr(int ), (int)193));
lbl45:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 2606204: {
                            v7 = gd.ivce("iwxc", ivcr(int ), (int)194);
                            continue block22;
                        }
                        case 459437710: {
                            v7 = gd.ivce("iwxd", ivcr(int ), (int)195);
                            continue block22;
                        }
                        case 1863665611: {
                            break block22;
                        }
                        case 2015175670: {
                            v7 = gd.ivce("iwxe", ivcr(int ), (int)196);
                            continue block22;
                        }
                    }
                    break;
                }
                return v5;
                case 0: {
                    var2_2 /* !! */  = (int)gd.ivce("iwxf", ivci(int ), (int)287);
                    if (!var3_1) break block19;
                    throw null;
                }
lbl62:
                // 2 sources

                case 1: {
                    var2_2 /* !! */  = (int)gd.ivce("iwxg", ivci(int ), (int)288);
                    if (!var3_1) break block19;
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)gd.ivce("iwxh", ivci(int ), (int)289);
                    if (!var3_1) ** GOTO lbl62
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)gd.ivce("iwxi", ivci(int ), (int)290);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void iwxj() {
        gd.ivcb[0] = -1548659406;
        gd.ivcb[1] = 506941406;
        gd.ivcb[2] = -1326195647;
        gd.ivcb[3] = 1385396736;
        gd.ivcb[4] = 110899256;
        gd.ivcb[5] = 1117290180;
        gd.ivcb[6] = 262611087;
        gd.ivcb[7] = 1147250713;
        gd.ivcb[8] = 1781330621;
        gd.ivcb[9] = -1503659157;
        gd.ivcb[10] = -1881190888;
        gd.ivcb[11] = -1896185871;
        gd.ivcb[12] = 162763038;
        gd.ivcb[13] = 380428316;
        gd.ivcb[14] = -1114270447;
        gd.ivcb[15] = 1589348756;
        gd.ivcb[16] = -1967382931;
        gd.ivcb[17] = -996192898;
        gd.ivcb[18] = 332064771;
        gd.ivcb[19] = 75831942;
        gd.ivcb[20] = -1823215312;
        gd.ivcb[21] = -1475146190;
        gd.ivcb[22] = -379878268;
        gd.ivcb[23] = -314186981;
        gd.ivcb[24] = -1234808853;
        gd.ivcb[25] = 321689481;
        gd.ivcb[26] = 1639768124;
        gd.ivcb[27] = 181329311;
        gd.ivcb[28] = 816805914;
        gd.ivcb[29] = 1593656830;
        gd.ivcb[30] = -1428664636;
        gd.ivcb[31] = -609581277;
        gd.ivcb[32] = -1563712341;
        gd.ivcb[33] = 510504453;
        gd.ivcb[34] = -556255152;
        gd.ivcb[35] = -1797855708;
        gd.ivcb[36] = 145159480;
        gd.ivcb[37] = 1962307213;
        gd.ivcb[38] = -1442534079;
        gd.ivcb[39] = 974413078;
        gd.ivcb[40] = -1765747138;
        gd.ivcb[41] = 1683537814;
        gd.ivcb[42] = -5923357;
        gd.ivcb[43] = 513691301;
        gd.ivcb[44] = 111400153;
        gd.ivcb[45] = 1715635826;
        gd.ivcb[46] = -1493816146;
        gd.ivcb[47] = 1975611170;
        gd.ivcb[48] = 90683499;
        gd.ivcb[49] = 681769342;
        gd.ivcb[50] = -1124565289;
        gd.ivcb[51] = -1149937972;
        gd.ivcb[52] = 792060676;
        gd.ivcb[53] = 2078377619;
        gd.ivcb[54] = 990621312;
        gd.ivcb[55] = -1587271268;
        gd.ivcb[56] = 1808023212;
        gd.ivcb[57] = -686821127;
        gd.ivcb[58] = 2082194442;
        gd.ivcb[59] = 136603851;
        gd.ivcb[60] = 339426135;
        gd.ivcb[61] = 1246485184;
        gd.ivcb[62] = -1520576211;
        gd.ivcb[63] = 1008091345;
        gd.ivcb[64] = -1086349313;
        gd.ivcb[65] = -1978454632;
        gd.ivcb[66] = -946436055;
        gd.ivcb[67] = 1995740328;
        gd.ivcb[68] = 325739354;
        gd.ivcb[69] = -1676627711;
        gd.ivcb[70] = -493305705;
        gd.ivcb[71] = -214192925;
        gd.ivcb[72] = -443935703;
        gd.ivcb[73] = -241296507;
        gd.ivcb[74] = -1020325123;
        gd.ivcb[75] = -1984186321;
        gd.ivcb[76] = -1525659322;
        gd.ivcb[77] = -1881947007;
        gd.ivcb[78] = 2045325158;
        gd.ivcb[79] = -1917848555;
        gd.ivcb[80] = 861201634;
        gd.ivcb[81] = -1629237496;
        gd.ivcb[82] = 1559372883;
        gd.ivcb[83] = -2128193157;
        gd.ivcb[84] = -1717339532;
        gd.ivcb[85] = -1143903172;
        gd.ivcb[86] = -583911517;
        gd.ivcb[87] = 2001665080;
        gd.ivcb[88] = -1209116823;
        gd.ivcb[89] = -1362751437;
        gd.ivcb[90] = 828916259;
        gd.ivcb[91] = -1250278722;
        gd.ivcb[92] = -2025812300;
        gd.ivcb[93] = -321093696;
        gd.ivcb[94] = 1543784286;
        gd.ivcb[95] = -355125422;
        gd.ivcb[96] = -1401296318;
        gd.ivcb[97] = -399373948;
        gd.ivcb[98] = -226248227;
        gd.ivcb[99] = -1220589251;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$1() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gd.qn - gd.ivce("iwvr", ivcr(int ), (int)177)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gd.ivce("iwvs", ivci(int ), (int)267)) break;
            v0 /* !! */  = (long)gd.ivce("iwvt", ivci(int ), (int)268);
        }
        var3_1 = gd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gd.qn - gd.ivce("iwvu", ivcr(int ), (int)178)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gd.ivce("iwvv", ivci(int ), (int)269)) break;
            v1 /* !! */  = (long)gd.ivce("iwvw", ivci(int ), (int)270);
        }
        var2_2 = gd.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = gd.qn - gd.ivce("iwvx", ivcr(int ), (int)179)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gd.ivce("iwvy", ivci(int ), (int)271)) break;
            v2 /* !! */  = (long)gd.ivce("iwvz", ivci(int ), (int)272);
        }
        var1_3 = gd.a;
        if (var3_1) {
            throw null;
lbl24:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl27:
        // 1 sources

        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = gd.qn - gd.ivce("iwwa", ivcr(int ), (int)180)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == gd.ivce("iwwb", ivci(int ), (int)273)) break;
            v3 /* !! */  = (long)gd.ivce("iwwc", ivci(int ), (int)274);
        }
        v4 /* !! */  = gd.qn;
        if (true) ** GOTO lbl37
        block15: while (true) {
            v4 /* !! */  = (long)(v5 - gd.ivce("iwwd", ivcr(int ), (int)181));
lbl37:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -831640601: {
                    v5 = gd.ivce("iwwe", ivcr(int ), (int)182);
                    continue block15;
                }
                case -257407838: {
                    v5 = gd.ivce("iwwf", ivcr(int ), (int)183);
                    continue block15;
                }
                case 1863665611: {
                    break block15;
                }
            }
            break;
        }
        v6 = this.mode.isSelected("Funtime Elytra");
        v7 /* !! */  = gd.qn;
        if (true) ** GOTO lbl51
        block16: while (true) {
            v7 /* !! */  = (long)(v8 - gd.ivce("iwwg", ivcr(int ), (int)184));
lbl51:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 1488931887: {
                    v8 = gd.ivce("iwwh", ivcr(int ), (int)185);
                    continue block16;
                }
                case 1863665611: {
                    break block16;
                }
                case 1910155909: {
                    v8 = gd.ivce("iwwi", ivcr(int ), (int)186);
                    continue block16;
                }
            }
            break;
        }
        return v6;
    }

    static {
        ivcb = new int[291];
        ivcc = new int[291];
        gd.iwxj();
        gd.iwxk();
        gd.iwxl();
        gd.iwxm();
        gd.iwxn();
        gd.iwxo();
        ivcs = new long[197];
        ivct = new long[197];
        gd.iwxp();
        gd.iwxq();
        gd.iwxr();
        gd.iwxs();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onMotion(cw var1_1) {
        var4_2 = gd.c;
        var3_3 /* !! */  = gd.b;
        var2_4 = gd.a;
        if (var4_2) {
            throw null;
lbl6:
            // 20 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl6
        if (!this.mode.isSelected("FunTime")) ** GOTO lbl17
        if (var2_4) ** GOTO lbl6
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl6
                this.handleFunTimeMode();
                if (var2_4) ** GOTO lbl6
lbl17:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                if (!this.mode.isSelected("Grim")) ** GOTO lbl26
                if (var2_4) ** GOTO lbl6
                if (!var1_1.isPre()) ** GOTO lbl26
                if (var2_4) ** GOTO lbl6
                if (!nq.hasPlayerMovement()) ** GOTO lbl26
                if (var2_4 || var2_4) ** GOTO lbl6
                this.handleGrimMode();
                if (var2_4) ** GOTO lbl6
lbl26:
                // 4 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                if (!this.mode.isSelected("HolyWorld")) ** GOTO lbl35
                if (var2_4) ** GOTO lbl6
                if (!var1_1.isPre()) ** GOTO lbl35
                if (var2_4) ** GOTO lbl6
                if (!nq.hasPlayerMovement()) ** GOTO lbl35
                if (var2_4 || var2_4) ** GOTO lbl6
                this.handleHolyWorldMode();
                if (var2_4) ** GOTO lbl6
lbl35:
                // 4 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                if (!this.mode.isSelected("Funtime Elytra")) ** GOTO lbl44
                if (var2_4) ** GOTO lbl6
                if (var1_1.isPre()) ** GOTO lbl44
                if (var2_4) ** GOTO lbl6
                if (gd.mc.field_1724.method_6118(class_1304.field_6174).method_7909() == class_1802.field_8833) ** GOTO lbl44
                if (var2_4 || var2_4) ** GOTO lbl6
                gd.mc.field_1724.method_66281();
                if (var2_4) ** GOTO lbl6
lbl44:
                // 4 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl47:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)gd.ivce("iveo", ivci(int ), (int)36);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl52:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)gd.ivce("ivep", ivci(int ), (int)37);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl57:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)gd.ivce("iveq", ivci(int ), (int)38);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl62:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)gd.ivce("iver", ivci(int ), (int)39);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl67:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)gd.ivce("ives", ivci(int ), (int)40);
                if (!var4_2) ** GOTO lbl52
                throw null;
            }
lbl71:
            // 4 sources

            case 5: {
                var3_3 /* !! */  = (int)gd.ivce("ivet", ivci(int ), (int)41);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl76:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)gd.ivce("iveu", ivci(int ), (int)42);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl102
            }
            case 7: {
                var3_3 /* !! */  = (int)gd.ivce("ivev", ivci(int ), (int)43);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl86:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)gd.ivce("ivew", ivci(int ), (int)44);
                if (!var4_2) ** GOTO lbl62
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)gd.ivce("ivex", ivci(int ), (int)45);
                if (!var4_2) ** GOTO lbl67
                throw null;
            }
            case 10: {
                var3_3 /* !! */  = (int)gd.ivce("ivey", ivci(int ), (int)46);
                if (!var4_2) ** GOTO lbl47
                throw null;
            }
            case 11: {
                var3_3 /* !! */  = (int)gd.ivce("ivez", ivci(int ), (int)47);
                if (!var4_2) ** GOTO lbl76
                throw null;
            }
lbl102:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)gd.ivce("ivfa", ivci(int ), (int)48);
                if (!var4_2) ** GOTO lbl71
                throw null;
            }
            case 13: {
                var3_3 /* !! */  = (int)gd.ivce("ivfb", ivci(int ), (int)49);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl111:
            // 2 sources

            case 14: {
                var3_3 /* !! */  = (int)gd.ivce("ivfc", ivci(int ), (int)50);
                if (!var4_2) ** GOTO lbl57
                throw null;
            }
lbl115:
            // 3 sources

            case 15: {
                var3_3 /* !! */  = (int)gd.ivce("ivfd", ivci(int ), (int)51);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl120:
            // 2 sources

            case 16: {
                var3_3 /* !! */  = (int)gd.ivce("ivfe", ivci(int ), (int)52);
                if (!var4_2) break;
                throw null;
            }
            case 17: {
                var3_3 /* !! */  = (int)gd.ivce("ivff", ivci(int ), (int)53);
                if (var4_2) {
                    throw null;
                }
            }
lbl128:
            // 4 sources

            case 18: {
                var3_3 /* !! */  = (int)gd.ivce("ivfg", ivci(int ), (int)54);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl159
            }
            case 19: {
                var3_3 /* !! */  = (int)gd.ivce("ivfh", ivci(int ), (int)55);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl138:
            // 2 sources

            case 20: {
                var3_3 /* !! */  = (int)gd.ivce("ivfi", ivci(int ), (int)56);
                if (!var4_2) ** GOTO lbl115
                throw null;
            }
            case 21: {
                var3_3 /* !! */  = (int)gd.ivce("ivfj", ivci(int ), (int)57);
                if (!var4_2) ** GOTO lbl128
                throw null;
            }
lbl146:
            // 3 sources

            case 22: {
                var3_3 /* !! */  = (int)gd.ivce("ivfk", ivci(int ), (int)58);
                if (!var4_2) ** GOTO lbl71
                throw null;
            }
            case 23: {
                var3_3 /* !! */  = (int)gd.ivce("ivfl", ivci(int ), (int)59);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl155:
            // 3 sources

            case 24: {
                var3_3 /* !! */  = (int)gd.ivce("ivfm", ivci(int ), (int)60);
                if (!var4_2) ** GOTO lbl111
                throw null;
            }
lbl159:
            // 2 sources

            case 25: {
                var3_3 /* !! */  = (int)gd.ivce("ivfn", ivci(int ), (int)61);
                if (!var4_2) ** GOTO lbl146
                throw null;
            }
lbl163:
            // 2 sources

            case 26: {
                var3_3 /* !! */  = (int)gd.ivce("ivfo", ivci(int ), (int)62);
                if (!var4_2) ** GOTO lbl86
                throw null;
            }
lbl167:
            // 5 sources

            case 27: {
                var3_3 /* !! */  = (int)gd.ivce("ivfp", ivci(int ), (int)63);
                if (!var4_2) ** GOTO lbl138
                throw null;
            }
            case 28: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gd.ivce("ivfq", ivci(int ), (int)64);
                    if (!var4_2) ** GOTO lbl71
                    throw null;
                }
            }
            case 29: 
        }
        var3_3 /* !! */  = (int)gd.ivce("ivfr", ivci(int ), (int)65);
        ** while (!var4_2)
lbl179:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleFunTimeMode() {
        block118: {
            block120: {
                block119: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_0 = gd.qn - gd.ivce("iwhl", ivcr(int ), (int)48)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v0 /* !! */  == gd.ivce("iwhm", ivci(int ), (int)81)) break;
                        v0 /* !! */  = (long)gd.ivce("iwhn", ivci(int ), (int)82);
                    }
                    var4_1 = gd.c;
                    v1 /* !! */  = gd.qn;
                    if (true) ** GOTO lbl11
                    block74: while (true) {
                        v1 /* !! */  = (long)(v2 - gd.ivce("iwho", ivcr(int ), (int)49));
lbl11:
                        // 2 sources

                        switch ((int)v1 /* !! */ ) {
                            case -1039160669: {
                                v2 = gd.ivce("iwhp", ivcr(int ), (int)50);
                                continue block74;
                            }
                            case 363062407: {
                                v2 = gd.ivce("iwhq", ivcr(int ), (int)51);
                                continue block74;
                            }
                            case 1863665611: {
                                break block74;
                            }
                        }
                        break;
                    }
                    var3_2 /* !! */  = gd.b;
                    v3 /* !! */  = gd.qn;
                    if (true) ** GOTO lbl25
                    block75: while (true) {
                        v3 /* !! */  = (long)(gd.ivce("iwhs", ivcr(int ), (int)53) - gd.ivce("iwhr", ivcr(int ), (int)52));
lbl25:
                        // 2 sources

                        switch ((int)v3 /* !! */ ) {
                            case -1325535535: {
                                continue block75;
                            }
                            case 1863665611: {
                                break block75;
                            }
                        }
                        break;
                    }
                    var2_3 = gd.a;
                    if (var4_1) {
                        throw null;
lbl33:
                        // 11 sources

                        return;
                    }
                    if (var2_3 || var2_3) ** GOTO lbl33
                    v4 /* !! */  = gd.qn;
                    if (true) ** GOTO lbl40
                    block77: while (true) {
                        v4 /* !! */  = (long)(v5 - gd.ivce("iwht", ivcr(int ), (int)54));
lbl40:
                        // 2 sources

                        switch ((int)v4 /* !! */ ) {
                            case -2126107596: {
                                v5 = gd.ivce("iwhu", ivcr(int ), (int)55);
                                continue block77;
                            }
                            case 302230209: {
                                v5 = gd.ivce("iwhv", ivcr(int ), (int)56);
                                continue block77;
                            }
                            case 1863665611: {
                                break block77;
                            }
                            case 2039269636: {
                                v5 = gd.ivce("iwhw", ivcr(int ), (int)57);
                                continue block77;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v6 /* !! */  = (cfr_temp_1 = gd.qn - gd.ivce("iwhx", ivcr(int ), (int)58)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v6 /* !! */  == gd.ivce("iwhy", ivci(int ), (int)83)) break;
                        v6 /* !! */  = (long)gd.ivce("iwhz", ivci(int ), (int)84);
                    }
                    v7 = gd.mc.field_1724;
                    v8 /* !! */  = gd.qn;
                    if (true) ** GOTO lbl62
                    block79: while (true) {
                        v8 /* !! */  = (long)(gd.ivce("iwib", ivcr(int ), (int)60) - gd.ivce("iwia", ivcr(int ), (int)59));
lbl62:
                        // 2 sources

                        switch ((int)v8 /* !! */ ) {
                            case -2121176239: {
                                continue block79;
                            }
                            case 1863665611: {
                                break block79;
                            }
                        }
                        break;
                    }
                    if (v7.method_5681()) break block118;
                    if (var2_3) ** GOTO lbl33
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_2 = gd.qn - gd.ivce("iwic", ivcr(int ), (int)61)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v9 /* !! */  == gd.ivce("iwid", ivci(int ), (int)85)) break;
                        v9 /* !! */  = (long)gd.ivce("iwie", ivci(int ), (int)86);
                    }
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_3 = gd.qn - gd.ivce("iwif", ivcr(int ), (int)62)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == gd.ivce("iwig", ivci(int ), (int)87)) break;
                        v10 /* !! */  = (long)gd.ivce("iwih", ivci(int ), (int)88);
                    }
                    v11 = gd.mc.field_1724;
                    v12 /* !! */  = gd.qn;
                    if (true) ** GOTO lbl84
                    block82: while (true) {
                        v12 /* !! */  = (long)(v13 - gd.ivce("iwii", ivcr(int ), (int)63));
lbl84:
                        // 2 sources

                        switch ((int)v12 /* !! */ ) {
                            case -1873902604: {
                                v13 = gd.ivce("iwij", ivcr(int ), (int)64);
                                continue block82;
                            }
                            case -525905092: {
                                v13 = gd.ivce("iwik", ivcr(int ), (int)65);
                                continue block82;
                            }
                            case 1863665611: {
                                break block82;
                            }
                        }
                        break;
                    }
                    if (v11.method_6128()) break block118;
                    if (var2_3) ** GOTO lbl33
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_4 = gd.qn - gd.ivce("iwil", ivcr(int ), (int)66)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  == gd.ivce("iwim", ivci(int ), (int)89)) break;
                        v14 /* !! */  = (long)gd.ivce("iwin", ivci(int ), (int)90);
                    }
                    while (true) {
                        if ((v15 /* !! */  = (cfr_temp_5 = gd.qn - gd.ivce("iwio", ivcr(int ), (int)67)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v15 /* !! */  == gd.ivce("iwip", ivci(int ), (int)91)) break;
                        v15 /* !! */  = (long)gd.ivce("iwiq", ivci(int ), (int)92);
                    }
                    v16 = gd.mc.field_1724;
                    while (true) {
                        if ((v17 /* !! */  = (cfr_temp_6 = gd.qn - gd.ivce("iwir", ivcr(int ), (int)68)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v17 /* !! */  == gd.ivce("iwis", ivci(int ), (int)93)) break;
                        v17 /* !! */  = (long)gd.ivce("iwit", ivci(int ), (int)94);
                    }
                    if (v16.method_5715()) break block118;
                    if (var2_3 || var2_3) ** GOTO lbl33
                    v18 /* !! */  = gd.qn;
                    if (true) ** GOTO lbl117
                    block86: while (true) {
                        v18 /* !! */  = (long)(v19 - gd.ivce("iwiu", ivcr(int ), (int)69));
lbl117:
                        // 2 sources

                        switch ((int)v18 /* !! */ ) {
                            case -1912079148: {
                                v19 = gd.ivce("iwiv", ivcr(int ), (int)70);
                                continue block86;
                            }
                            case 369346989: {
                                v19 = gd.ivce("iwiw", ivcr(int ), (int)71);
                                continue block86;
                            }
                            case 1863665611: {
                                break block86;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v20 /* !! */  = (cfr_temp_7 = gd.qn - gd.ivce("iwix", ivcr(int ), (int)72)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v20 /* !! */  == gd.ivce("iwiy", ivci(int ), (int)95)) break;
                        v20 /* !! */  = (long)gd.ivce("iwiz", ivci(int ), (int)96);
                    }
                    v21 = gd.mc.field_1724;
                    v22 /* !! */  = gd.qn;
                    if (true) ** GOTO lbl136
                    block88: while (true) {
                        v22 /* !! */  = (long)(v23 - gd.ivce("iwja", ivcr(int ), (int)73));
lbl136:
                        // 2 sources

                        switch ((int)v22 /* !! */ ) {
                            case 217546793: {
                                v23 = gd.ivce("iwjb", ivcr(int ), (int)74);
                                continue block88;
                            }
                            case 503062718: {
                                v23 = gd.ivce("iwjc", ivcr(int ), (int)75);
                                continue block88;
                            }
                            case 1863665611: {
                                break block88;
                            }
                        }
                        break;
                    }
                    v24 = v21.method_5829();
                    while (true) {
                        if ((v25 /* !! */  = (cfr_temp_8 = gd.qn - gd.ivce("iwjd", ivcr(int ), (int)76)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v25 /* !! */  == gd.ivce("iwje", ivci(int ), (int)97)) break;
                        v25 /* !! */  = (long)gd.ivce("iwjf", ivci(int ), (int)98);
                    }
                    v26 = v24.field_1325;
                    while (true) {
                        if ((v27 /* !! */  = (cfr_temp_9 = gd.qn - gd.ivce("iwjg", ivcr(int ), (int)77)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                        if (v27 /* !! */  == gd.ivce("iwjh", ivci(int ), (int)99)) break;
                        v27 /* !! */  = (long)gd.ivce("iwji", ivci(int ), (int)100);
                    }
                    while (true) {
                        if ((v28 /* !! */  = (cfr_temp_10 = gd.qn - gd.ivce("iwjj", ivcr(int ), (int)78)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                        if (v28 /* !! */  == gd.ivce("iwjk", ivci(int ), (int)101)) break;
                        v28 /* !! */  = (long)gd.ivce("iwjl", ivci(int ), (int)102);
                    }
                    v29 = gd.mc.field_1724;
                    v30 /* !! */  = gd.qn;
                    if (true) ** GOTO lbl167
                    block92: while (true) {
                        v30 /* !! */  = (long)(v31 - gd.ivce("iwjm", ivcr(int ), (int)79));
lbl167:
                        // 2 sources

                        switch ((int)v30 /* !! */ ) {
                            case -295289092: {
                                v31 = gd.ivce("iwjn", ivcr(int ), (int)80);
                                continue block92;
                            }
                            case 1576805362: {
                                v31 = gd.ivce("iwjo", ivcr(int ), (int)81);
                                continue block92;
                            }
                            case 1863665611: {
                                break block92;
                            }
                        }
                        break;
                    }
                    v32 = v29.method_5829();
                    while (true) {
                        if ((v33 /* !! */  = (cfr_temp_11 = gd.qn - gd.ivce("iwjp", ivcr(int ), (int)82)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                        if (v33 /* !! */  == gd.ivce("iwjq", ivci(int ), (int)103)) break;
                        v33 /* !! */  = (long)gd.ivce("iwjr", ivci(int ), (int)104);
                    }
                    if (!(v26 - v32.field_1322 < gd.ivce("iwjt", iwjs(int ), (int)83))) break block118;
                    if (var2_3 || var2_3) ** GOTO lbl33
                    v34 /* !! */  = gd.qn;
                    if (true) ** GOTO lbl188
                    block94: while (true) {
                        v34 /* !! */  = (long)(gd.ivce("iwjv", ivcr(int ), (int)85) - gd.ivce("iwju", ivcr(int ), (int)84));
lbl188:
                        // 2 sources

                        switch ((int)v34 /* !! */ ) {
                            case 697581154: {
                                continue block94;
                            }
                            case 1863665611: {
                                break block94;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v35 /* !! */  = (cfr_temp_12 = gd.qn - gd.ivce("iwjw", ivcr(int ), (int)86)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                        if (v35 /* !! */  == gd.ivce("iwjx", ivci(int ), (int)105)) break;
                        v35 /* !! */  = (long)gd.ivce("iwjy", ivci(int ), (int)106);
                    }
                    v36 = gd.mc.field_1724;
                    v37 /* !! */  = gd.qn;
                    if (true) ** GOTO lbl203
                    block96: while (true) {
                        v37 /* !! */  = (long)(v38 - gd.ivce("iwjz", ivcr(int ), (int)87));
lbl203:
                        // 2 sources

                        switch ((int)v37 /* !! */ ) {
                            case -2051099224: {
                                v38 = gd.ivce("iwka", ivcr(int ), (int)88);
                                continue block96;
                            }
                            case 743429537: {
                                v38 = gd.ivce("iwkb", ivcr(int ), (int)89);
                                continue block96;
                            }
                            case 1863665611: {
                                break block96;
                            }
                        }
                        break;
                    }
                    v39 /* !! */  = gd.qn;
                    if (true) ** GOTO lbl216
                    block97: while (true) {
                        v39 /* !! */  = (long)(gd.ivce("iwkd", ivcr(int ), (int)91) - gd.ivce("iwkc", ivcr(int ), (int)90));
lbl216:
                        // 2 sources

                        switch ((int)v39 /* !! */ ) {
                            case -946286782: {
                                continue block97;
                            }
                            case 1863665611: {
                                break block97;
                            }
                        }
                        break;
                    }
                    if (!v36.method_6059(class_1294.field_5904)) break block119;
                    if (var2_3) ** GOTO lbl33
                    v40 = gd.ivce("iwke", ivca(int ), (int)107);
                    if (var4_1) {
                        throw null;
                    }
                    break block120;
                }
                if (var2_3 || var2_3) ** GOTO lbl33
                v40 = var1_4 = gd.ivce("iwkf", ivca(int ), (int)108);
            }
            if (var2_3 || var2_3) ** GOTO lbl33
            v41 = (double)var1_4;
            while (true) {
                if ((v42 /* !! */  = (cfr_temp_13 = gd.qn - gd.ivce("iwkg", ivcr(int ), (int)92)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                if (v42 /* !! */  == gd.ivce("iwkh", ivci(int ), (int)109)) break;
                v42 /* !! */  = (long)gd.ivce("iwki", ivci(int ), (int)110);
            }
            nq.setVelocity(v41);
            if (var2_3) ** GOTO lbl33
        }
        if (var2_3) ** GOTO lbl33
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                do {
                    var3_2 /* !! */  = (int)gd.ivce("iwkj", ivci(int ), (int)111);
                } while (!var4_1);
                throw null;
            }
lbl253:
            // 3 sources

            case 1: {
                do {
                    var3_2 /* !! */  = (int)gd.ivce("iwkk", ivci(int ), (int)112);
                } while (!var4_1);
                throw null;
            }
            case 2: {
                var3_2 /* !! */  = (int)gd.ivce("iwkl", ivci(int ), (int)113);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl283
            }
            case 3: {
                var3_2 /* !! */  = (int)gd.ivce("iwkm", ivci(int ), (int)114);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl296
            }
            case 4: {
                var3_2 /* !! */  = (int)gd.ivce("iwkn", ivci(int ), (int)115);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl273:
            // 2 sources

            case 5: {
                var3_2 /* !! */  = (int)gd.ivce("iwko", ivci(int ), (int)116);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl292
            }
            case 6: {
                var3_2 /* !! */  = (int)gd.ivce("iwkp", ivci(int ), (int)117);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl323
            }
lbl283:
            // 2 sources

            case 7: {
                var3_2 /* !! */  = (int)gd.ivce("iwkq", ivci(int ), (int)118);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl314
            }
            case 8: {
                var3_2 /* !! */  = (int)gd.ivce("iwkr", ivci(int ), (int)119);
                if (!var4_1) ** GOTO lbl273
                throw null;
            }
lbl292:
            // 2 sources

            case 9: {
                var3_2 /* !! */  = (int)gd.ivce("iwks", ivci(int ), (int)120);
                if (var4_1) {
                    throw null;
                }
            }
lbl296:
            // 5 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)gd.ivce("iwkt", ivci(int ), (int)121);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl306
                    break;
                }
            }
            case 11: {
                var3_2 /* !! */  = (int)gd.ivce("iwku", ivci(int ), (int)122);
                if (var4_1) {
                    throw null;
                }
            }
lbl306:
            // 5 sources

            case 12: {
                var3_2 /* !! */  = (int)gd.ivce("iwkv", ivci(int ), (int)123);
                if (!var4_1) ** GOTO lbl253
                throw null;
            }
lbl310:
            // 2 sources

            case 13: {
                var3_2 /* !! */  = (int)gd.ivce("iwkw", ivci(int ), (int)124);
                if (!var4_1) ** GOTO lbl306
                throw null;
            }
lbl314:
            // 2 sources

            case 14: {
                var3_2 /* !! */  = (int)gd.ivce("iwkx", ivci(int ), (int)125);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl327
            }
            case 15: {
                var3_2 /* !! */  = (int)gd.ivce("iwky", ivci(int ), (int)126);
                if (!var4_1) ** GOTO lbl310
                throw null;
            }
lbl323:
            // 2 sources

            case 16: {
                var3_2 /* !! */  = (int)gd.ivce("iwkz", ivci(int ), (int)127);
                if (!var4_1) break;
                throw null;
            }
lbl327:
            // 2 sources

            case 17: {
                var3_2 /* !! */  = (int)gd.ivce("iwla", ivci(int ), (int)128);
                if (!var4_1) ** GOTO lbl253
                throw null;
            }
            case 18: 
        }
        var3_2 /* !! */  = (int)gd.ivce("iwlb", ivci(int ), (int)129);
        ** while (!var4_1)
lbl334:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iwxr() {
        gd.ivct[0] = 3138940538583190771L;
        gd.ivct[1] = -389909859286256717L;
        gd.ivct[2] = 1776249498669770977L;
        gd.ivct[3] = 7188859581411203585L;
        gd.ivct[4] = 5988621103470537314L;
        gd.ivct[5] = -67519653605583922L;
        gd.ivct[6] = -3073550458619014172L;
        gd.ivct[7] = 383489329087012610L;
        gd.ivct[8] = -4058099872874209659L;
        gd.ivct[9] = 5762262748488177772L;
        gd.ivct[10] = -805391121759461347L;
        gd.ivct[11] = 211525221099871098L;
        gd.ivct[12] = 5870527832357784982L;
        gd.ivct[13] = 5674514040882359756L;
        gd.ivct[14] = 8292655523397155186L;
        gd.ivct[15] = 5226466905308733324L;
        gd.ivct[16] = -8584645913740955168L;
        gd.ivct[17] = -6740417481216318892L;
        gd.ivct[18] = 642330889494832204L;
        gd.ivct[19] = 3605353485527607498L;
        gd.ivct[20] = -7196412193945807547L;
        gd.ivct[21] = -4783640014064850968L;
        gd.ivct[22] = -1820708357373656057L;
        gd.ivct[23] = 8959041023495983847L;
        gd.ivct[24] = -5573660985919508508L;
        gd.ivct[25] = -5224404741510178898L;
        gd.ivct[26] = 6496280881700618351L;
        gd.ivct[27] = -7343246745121543720L;
        gd.ivct[28] = -8345289645610754195L;
        gd.ivct[29] = -4386973854237154172L;
        gd.ivct[30] = -3401974536008884020L;
        gd.ivct[31] = 8451812038628423016L;
        gd.ivct[32] = 8431304849163843028L;
        gd.ivct[33] = 66407955892135212L;
        gd.ivct[34] = -382949053869187173L;
        gd.ivct[35] = -4942421338147352331L;
        gd.ivct[36] = 4464321660814742718L;
        gd.ivct[37] = -5613529411448755905L;
        gd.ivct[38] = -7065165524409119155L;
        gd.ivct[39] = 6505387906229537263L;
        gd.ivct[40] = -9008201979136785528L;
        gd.ivct[41] = 7709528865752747221L;
        gd.ivct[42] = -7175078882243694869L;
        gd.ivct[43] = -1858774587615694322L;
        gd.ivct[44] = 2854402814229650055L;
        gd.ivct[45] = -62965568815465589L;
        gd.ivct[46] = -6564696986349066950L;
        gd.ivct[47] = -7075932143512156894L;
        gd.ivct[48] = -164550995084473971L;
        gd.ivct[49] = 3408327223145675806L;
        gd.ivct[50] = -8738432250232596179L;
        gd.ivct[51] = -7344936402660302813L;
        gd.ivct[52] = -1858036022843065194L;
        gd.ivct[53] = 2769978679411101718L;
        gd.ivct[54] = 499731097310950278L;
        gd.ivct[55] = -7421010239285568651L;
        gd.ivct[56] = 3795315001412105526L;
        gd.ivct[57] = -6938010657261375871L;
        gd.ivct[58] = 8197239679938703327L;
        gd.ivct[59] = -3133803054615424419L;
        gd.ivct[60] = -5239321154190546739L;
        gd.ivct[61] = 3386916972267162638L;
        gd.ivct[62] = -4038874457362307328L;
        gd.ivct[63] = 5908131467989114954L;
        gd.ivct[64] = -1405339202642001329L;
        gd.ivct[65] = 1895771489356522170L;
        gd.ivct[66] = -4257254841708091110L;
        gd.ivct[67] = -8971989803475840098L;
        gd.ivct[68] = 7996254782500196814L;
        gd.ivct[69] = -3496289040303326844L;
        gd.ivct[70] = -8273222962082279410L;
        gd.ivct[71] = 7063538191971267783L;
        gd.ivct[72] = -3580101314130154021L;
        gd.ivct[73] = 9191792198678295697L;
        gd.ivct[74] = -5638176064126931382L;
        gd.ivct[75] = 3545932399318040013L;
        gd.ivct[76] = -2109991603354009255L;
        gd.ivct[77] = -3857188409510841378L;
        gd.ivct[78] = 6875659791390842744L;
        gd.ivct[79] = 8367810257414879437L;
        gd.ivct[80] = 3071836083723631174L;
        gd.ivct[81] = -1842228483464883319L;
        gd.ivct[82] = 8821766398384201314L;
        gd.ivct[83] = 1465058651001560786L;
        gd.ivct[84] = -8631723829161576210L;
        gd.ivct[85] = -8015559748097208474L;
        gd.ivct[86] = -500903583460815426L;
        gd.ivct[87] = 7827050864114682379L;
        gd.ivct[88] = -3206029213086677149L;
        gd.ivct[89] = 1887343869555990954L;
        gd.ivct[90] = -7803746256871460928L;
        gd.ivct[91] = 4217685321988783307L;
        gd.ivct[92] = 4535232217198147014L;
        gd.ivct[93] = 8968925216563943347L;
        gd.ivct[94] = 8278799969741214107L;
        gd.ivct[95] = -6997292970985086592L;
        gd.ivct[96] = -5794339414350442849L;
        gd.ivct[97] = -8622201479485005660L;
        gd.ivct[98] = 6162260185286050616L;
        gd.ivct[99] = 4442116093267829087L;
    }

    private static /* synthetic */ void iwxn() {
        gd.ivcc[100] = -1361247167;
        gd.ivcc[101] = 1292944994;
        gd.ivcc[102] = 818187675;
        gd.ivcc[103] = -2141519840;
        gd.ivcc[104] = 1383522982;
        gd.ivcc[105] = -1148964298;
        gd.ivcc[106] = 864309052;
        gd.ivcc[107] = 1031210095;
        gd.ivcc[108] = -1781285323;
        gd.ivcc[109] = 852491105;
        gd.ivcc[110] = -1906187265;
        gd.ivcc[111] = -938599343;
        gd.ivcc[112] = -342216934;
        gd.ivcc[113] = -753915740;
        gd.ivcc[114] = 756268383;
        gd.ivcc[115] = 790918466;
        gd.ivcc[116] = 100140465;
        gd.ivcc[117] = -446485638;
        gd.ivcc[118] = -187689092;
        gd.ivcc[119] = -631511323;
        gd.ivcc[120] = 179135336;
        gd.ivcc[121] = -974995725;
        gd.ivcc[122] = -541642617;
        gd.ivcc[123] = -405519745;
        gd.ivcc[124] = 857683407;
        gd.ivcc[125] = 309846877;
        gd.ivcc[126] = 355440160;
        gd.ivcc[127] = -48416571;
        gd.ivcc[128] = 1476087084;
        gd.ivcc[129] = -1071600901;
        gd.ivcc[130] = 1330898886;
        gd.ivcc[131] = 1182375414;
        gd.ivcc[132] = -254661281;
        gd.ivcc[133] = 434432400;
        gd.ivcc[134] = -1171622608;
        gd.ivcc[135] = -1115817047;
        gd.ivcc[136] = -47014202;
        gd.ivcc[137] = -2105601558;
        gd.ivcc[138] = -580279893;
        gd.ivcc[139] = -1363993619;
        gd.ivcc[140] = -807542945;
        gd.ivcc[141] = -648172212;
        gd.ivcc[142] = -1562397177;
        gd.ivcc[143] = 1321087542;
        gd.ivcc[144] = -1983193653;
        gd.ivcc[145] = 1096998227;
        gd.ivcc[146] = 1406959204;
        gd.ivcc[147] = 1654385180;
        gd.ivcc[148] = 1887099551;
        gd.ivcc[149] = -1487223090;
        gd.ivcc[150] = -977672057;
        gd.ivcc[151] = -1497222721;
        gd.ivcc[152] = -28762934;
        gd.ivcc[153] = -1121084309;
        gd.ivcc[154] = -377429910;
        gd.ivcc[155] = -1641921006;
        gd.ivcc[156] = 602057559;
        gd.ivcc[157] = 1294521249;
        gd.ivcc[158] = 211380448;
        gd.ivcc[159] = -1752506792;
        gd.ivcc[160] = -1807341403;
        gd.ivcc[161] = -1608603980;
        gd.ivcc[162] = -1765142795;
        gd.ivcc[163] = -1730825776;
        gd.ivcc[164] = -1339284400;
        gd.ivcc[165] = 1141092210;
        gd.ivcc[166] = -1927224612;
        gd.ivcc[167] = -1368186357;
        gd.ivcc[168] = -1123822294;
        gd.ivcc[169] = 188032411;
        gd.ivcc[170] = 104066365;
        gd.ivcc[171] = -1930766420;
        gd.ivcc[172] = -1699380499;
        gd.ivcc[173] = -987957703;
        gd.ivcc[174] = 1464823749;
        gd.ivcc[175] = 661451906;
        gd.ivcc[176] = -491893041;
        gd.ivcc[177] = -1670205429;
        gd.ivcc[178] = 936612080;
        gd.ivcc[179] = -1735791259;
        gd.ivcc[180] = -749966657;
        gd.ivcc[181] = 2024153972;
        gd.ivcc[182] = 339717876;
        gd.ivcc[183] = -861033147;
        gd.ivcc[184] = 910229741;
        gd.ivcc[185] = -247493194;
        gd.ivcc[186] = 15039709;
        gd.ivcc[187] = -641641089;
        gd.ivcc[188] = 244497635;
        gd.ivcc[189] = 1724255747;
        gd.ivcc[190] = 1629434741;
        gd.ivcc[191] = 486646610;
        gd.ivcc[192] = -1129912465;
        gd.ivcc[193] = -1188777686;
        gd.ivcc[194] = 1928253511;
        gd.ivcc[195] = -551335877;
        gd.ivcc[196] = 582153871;
        gd.ivcc[197] = 2113948300;
        gd.ivcc[198] = -951449777;
        gd.ivcc[199] = 1616601481;
    }

    private static /* synthetic */ double iwjs(int n2) {
        return Double.longBitsToDouble(ivcs[n2] ^ ivct[n2]);
    }

    private static /* synthetic */ int ivci(int n2) {
        return ivcb[n2] ^ ivcc[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @aw
    public void onTick(df var1_1) {
        block72: {
            block71: {
                v0 /* !! */  = gd.qn;
                if (true) ** GOTO lbl5
                block39: while (true) {
                    v0 /* !! */  = (long)(v1 - gd.ivce("ivcu", ivcr(int ), (int)0));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case 159433708: {
                            v1 = gd.ivce("ivcv", ivcr(int ), (int)1);
                            continue block39;
                        }
                        case 1552052003: {
                            v1 = gd.ivce("ivcw", ivcr(int ), (int)2);
                            continue block39;
                        }
                        case 1863665611: {
                            break block39;
                        }
                    }
                    break;
                }
                var4_2 = gd.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = gd.qn - gd.ivce("ivcx", ivcr(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == gd.ivce("ivcy", ivci(int ), (int)9)) break;
                    v2 /* !! */  = (long)gd.ivce("ivcz", ivci(int ), (int)10);
                }
                var3_3 /* !! */  = gd.b;
                v3 /* !! */  = gd.qn;
                block41: while (true) {
                    switch ((int)v3 /* !! */ ) {
                        case 1863665611: {
                            break block41;
                        }
                        case 1897571873: {
                            v3 /* !! */  = (long)(gd.ivce("ivdb", ivcr(int ), (int)5) - gd.ivce("ivda", ivcr(int ), (int)4));
                            continue block41;
                        }
                    }
                    break;
                }
                var2_4 = gd.a;
                if (var4_2) {
                    throw null;
                }
                if (var2_4 || var2_4) return;
                v4 /* !! */  = gd.qn;
                if (true) ** GOTO lbl37
                block42: while (true) {
                    v4 /* !! */  = (long)(v5 - gd.ivce("ivdc", ivcr(int ), (int)6));
lbl37:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 1247555112: {
                            v5 = gd.ivce("ivdd", ivcr(int ), (int)7);
                            continue block42;
                        }
                        case 1492811971: {
                            v5 = gd.ivce("ivde", ivcr(int ), (int)8);
                            continue block42;
                        }
                        case 1509353090: {
                            v5 = gd.ivce("ivdf", ivcr(int ), (int)9);
                            continue block42;
                        }
                        case 1863665611: {
                            break block42;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = gd.qn - gd.ivce("ivdg", ivcr(int ), (int)10)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == gd.ivce("ivdh", ivci(int ), (int)11)) {
                        if (this.mode.isSelected("Vanilla")) {
                            break;
                        }
                        break block71;
                    }
                    v6 /* !! */  = (long)gd.ivce("ivdi", ivci(int ), (int)12);
                }
                if (var2_4 || var2_4) return;
                v7 /* !! */  = gd.qn;
                block44: while (true) {
                    switch ((int)v7 /* !! */ ) {
                        case -302357920: {
                            v7 /* !! */  = (long)(gd.ivce("ivdk", ivcr(int ), (int)12) - gd.ivce("ivdj", ivcr(int ), (int)11));
                            continue block44;
                        }
                        case 1863665611: {
                            break block44;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = gd.qn - gd.ivce("ivdl", ivcr(int ), (int)13)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == gd.ivce("ivdm", ivci(int ), (int)13)) break;
                    v8 /* !! */  = (long)gd.ivce("ivdn", ivci(int ), (int)14);
                }
                v9 = this.speed.getValue() / gd.ivce("ivdo", ivca(int ), (int)15);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = gd.qn - gd.ivce("ivdp", ivcr(int ), (int)14)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == gd.ivce("ivdq", ivci(int ), (int)16)) {
                        nq.setVelocity(v9);
                        if (var2_4) return;
                        break;
                    }
                    v10 /* !! */  = (long)gd.ivce("ivdr", ivci(int ), (int)17);
                }
            }
            if (var2_4 || var2_4) return;
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_5 = gd.qn - gd.ivce("ivds", ivcr(int ), (int)15)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == gd.ivce("ivdt", ivci(int ), (int)18)) break;
                v11 /* !! */  = (long)gd.ivce("ivdu", ivci(int ), (int)19);
            }
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_6 = gd.qn - gd.ivce("ivdv", ivcr(int ), (int)16)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == gd.ivce("ivdw", ivci(int ), (int)20)) {
                    if (this.mode.isSelected("Funtime Elytra")) {
                        break;
                    }
                    break block72;
                }
                v12 /* !! */  = (long)gd.ivce("ivdx", ivci(int ), (int)21);
            }
            if (var2_4 || var2_4) return;
            v13 /* !! */  = gd.qn;
            block49: while (true) {
                switch ((int)v13 /* !! */ ) {
                    case 500246852: {
                        v13 /* !! */  = (long)(gd.ivce("ivdz", ivcr(int ), (int)18) - gd.ivce("ivdy", ivcr(int ), (int)17));
                        continue block49;
                    }
                    case 1863665611: {
                        break block49;
                    }
                }
                break;
            }
            this.handleFuntimeElytraMode();
            if (var2_4) return;
        }
        if (var2_4 || var2_4) {
            return;
        }
        if (var3_3 /* !! */  == 0) return;
        cfr_temp_0 = -2147483648;
        block50: do {
            switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                default: {
                    return;
                }
                case 0: {
                    var3_3 /* !! */  = (int)gd.ivce("ivea", ivci(int ), (int)22);
                    cfr_temp_0 = 10;
                    if (!var4_2) continue block50;
                    throw null;
                }
                case 1: {
                    ** GOTO lbl159
                }
                case 5: {
                    var3_3 /* !! */  = (int)gd.ivce("ivef", ivci(int ), (int)27);
                    cfr_temp_0 = 3;
                    if (!var4_2) continue block50;
                    throw null;
                }
                case 6: {
                    var3_3 /* !! */  = (int)gd.ivce("iveg", ivci(int ), (int)28);
                    cfr_temp_0 = 12;
                    if (!var4_2) continue block50;
                    throw null;
                }
                case 7: {
                    var3_3 /* !! */  = (int)gd.ivce("iveh", ivci(int ), (int)29);
                    cfr_temp_0 = 8;
                    if (!var4_2) continue block50;
                    throw null;
                }
                case 9: {
                    do {
                        var3_3 /* !! */  = (int)gd.ivce("ivej", ivci(int ), (int)31);
                    } while (!var4_2);
                    throw null;
                }
                case 12: {
                    var3_3 /* !! */  = (int)gd.ivce("ivem", ivci(int ), (int)34);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 4: {
                    var3_3 /* !! */  = (int)gd.ivce("ivee", ivci(int ), (int)26);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 3: {
                    var3_3 /* !! */  = (int)gd.ivce("ived", ivci(int ), (int)25);
                    cfr_temp_0 = 10;
                    if (!var4_2) continue block50;
                    throw null;
                }
                case 13: {
                    var3_3 /* !! */  = (int)gd.ivce("iven", ivci(int ), (int)35);
                    if (var4_2) {
                        throw null;
                    }
lbl159:
                    // 3 sources

                    var3_3 /* !! */  = (int)gd.ivce("iveb", ivci(int ), (int)23);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 10: {
                    var3_3 /* !! */  = (int)gd.ivce("ivek", ivci(int ), (int)32);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 2: {
                    var3_3 /* !! */  = (int)gd.ivce("ivec", ivci(int ), (int)24);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 11: {
                    var3_3 /* !! */  = (int)gd.ivce("ivel", ivci(int ), (int)33);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 8: 
            }
            break;
        } while (true);
        do {
            var3_3 /* !! */  = (int)gd.ivce("ivei", ivci(int ), (int)30);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void iwxl() {
        gd.ivcb[200] = 1675243297;
        gd.ivcb[201] = -361528961;
        gd.ivcb[202] = -1353521230;
        gd.ivcb[203] = 341663100;
        gd.ivcb[204] = 922882249;
        gd.ivcb[205] = -372524614;
        gd.ivcb[206] = -1288209490;
        gd.ivcb[207] = 1295984811;
        gd.ivcb[208] = -828408090;
        gd.ivcb[209] = 631684329;
        gd.ivcb[210] = -227255028;
        gd.ivcb[211] = 63400909;
        gd.ivcb[212] = 324450868;
        gd.ivcb[213] = 871141584;
        gd.ivcb[214] = -793692961;
        gd.ivcb[215] = -122026650;
        gd.ivcb[216] = 618851963;
        gd.ivcb[217] = 729082508;
        gd.ivcb[218] = -641497003;
        gd.ivcb[219] = 2137534396;
        gd.ivcb[220] = -1167046169;
        gd.ivcb[221] = -1921422768;
        gd.ivcb[222] = 670849471;
        gd.ivcb[223] = 1619100161;
        gd.ivcb[224] = 231114757;
        gd.ivcb[225] = -671872981;
        gd.ivcb[226] = -1525071879;
        gd.ivcb[227] = -1080553414;
        gd.ivcb[228] = -978069932;
        gd.ivcb[229] = -724361309;
        gd.ivcb[230] = -236719751;
        gd.ivcb[231] = -942552687;
        gd.ivcb[232] = -535977081;
        gd.ivcb[233] = -265771500;
        gd.ivcb[234] = 1963775190;
        gd.ivcb[235] = -1990748184;
        gd.ivcb[236] = -1893784137;
        gd.ivcb[237] = 754838555;
        gd.ivcb[238] = -1359951669;
        gd.ivcb[239] = 1493939832;
        gd.ivcb[240] = 1794663673;
        gd.ivcb[241] = 1040456742;
        gd.ivcb[242] = -1426586291;
        gd.ivcb[243] = 426108391;
        gd.ivcb[244] = 1671691255;
        gd.ivcb[245] = -1317996170;
        gd.ivcb[246] = 715090605;
        gd.ivcb[247] = -756149657;
        gd.ivcb[248] = -627929192;
        gd.ivcb[249] = -1723646412;
        gd.ivcb[250] = -851423194;
        gd.ivcb[251] = -6531220;
        gd.ivcb[252] = 855036485;
        gd.ivcb[253] = 1084490715;
        gd.ivcb[254] = 1253628865;
        gd.ivcb[255] = -271925588;
        gd.ivcb[256] = -1581665699;
        gd.ivcb[257] = 940008609;
        gd.ivcb[258] = 1263755156;
        gd.ivcb[259] = -1328051709;
        gd.ivcb[260] = -73345830;
        gd.ivcb[261] = 1792962739;
        gd.ivcb[262] = -98716710;
        gd.ivcb[263] = -1472153037;
        gd.ivcb[264] = -1926629505;
        gd.ivcb[265] = 475578257;
        gd.ivcb[266] = 2134514319;
        gd.ivcb[267] = 1005313348;
        gd.ivcb[268] = -324523804;
        gd.ivcb[269] = -1543359876;
        gd.ivcb[270] = 1123981270;
        gd.ivcb[271] = 1518347117;
        gd.ivcb[272] = 1357073643;
        gd.ivcb[273] = -1386807176;
        gd.ivcb[274] = 65685131;
        gd.ivcb[275] = 324023793;
        gd.ivcb[276] = 1206528921;
        gd.ivcb[277] = -731506389;
        gd.ivcb[278] = 215116518;
        gd.ivcb[279] = 280585848;
        gd.ivcb[280] = 627584926;
        gd.ivcb[281] = -881323172;
        gd.ivcb[282] = -1597404621;
        gd.ivcb[283] = 516551248;
        gd.ivcb[284] = -222886652;
        gd.ivcb[285] = 390120560;
        gd.ivcb[286] = -1389410039;
        gd.ivcb[287] = 220332702;
        gd.ivcb[288] = 1447152287;
        gd.ivcb[289] = -426907337;
        gd.ivcb[290] = 756597831;
    }

    private static /* synthetic */ void iwxk() {
        gd.ivcb[100] = -1287859838;
        gd.ivcb[101] = -1292944995;
        gd.ivcb[102] = -208670886;
        gd.ivcb[103] = -2141519839;
        gd.ivcb[104] = 1290339485;
        gd.ivcb[105] = -1148964297;
        gd.ivcb[106] = -1328267208;
        gd.ivcb[107] = 64279397;
        gd.ivcb[108] = -1419976164;
        gd.ivcb[109] = 852491104;
        gd.ivcb[110] = -1014481333;
        gd.ivcb[111] = -938599334;
        gd.ivcb[112] = -342216944;
        gd.ivcb[113] = -753915733;
        gd.ivcb[114] = 756268368;
        gd.ivcb[115] = 790918476;
        gd.ivcb[116] = 100140477;
        gd.ivcb[117] = -446485642;
        gd.ivcb[118] = -187689099;
        gd.ivcb[119] = -631511317;
        gd.ivcb[120] = 179135340;
        gd.ivcb[121] = -974995724;
        gd.ivcb[122] = -541642602;
        gd.ivcb[123] = -405519751;
        gd.ivcb[124] = 857683405;
        gd.ivcb[125] = 309846867;
        gd.ivcb[126] = 355440169;
        gd.ivcb[127] = -48416574;
        gd.ivcb[128] = 1476087082;
        gd.ivcb[129] = -1071600906;
        gd.ivcb[130] = -1330898887;
        gd.ivcb[131] = 1853871385;
        gd.ivcb[132] = -254661282;
        gd.ivcb[133] = -1071850150;
        gd.ivcb[134] = -1171622607;
        gd.ivcb[135] = 1060638128;
        gd.ivcb[136] = 47014201;
        gd.ivcb[137] = -2105601557;
        gd.ivcb[138] = 472181653;
        gd.ivcb[139] = -1363993620;
        gd.ivcb[140] = -46022946;
        gd.ivcb[141] = 648172211;
        gd.ivcb[142] = 571441348;
        gd.ivcb[143] = 1321087543;
        gd.ivcb[144] = -1330675373;
        gd.ivcb[145] = 1096998226;
        gd.ivcb[146] = -581238233;
        gd.ivcb[147] = 565176860;
        gd.ivcb[148] = 841407135;
        gd.ivcb[149] = -1487223089;
        gd.ivcb[150] = 827885173;
        gd.ivcb[151] = -1497222722;
        gd.ivcb[152] = 1180818547;
        gd.ivcb[153] = -1121084310;
        gd.ivcb[154] = -1562360505;
        gd.ivcb[155] = -1641921005;
        gd.ivcb[156] = 1100729340;
        gd.ivcb[157] = -1294521250;
        gd.ivcb[158] = -1161308951;
        gd.ivcb[159] = 1752506791;
        gd.ivcb[160] = 1618740057;
        gd.ivcb[161] = -1608603996;
        gd.ivcb[162] = -1765142803;
        gd.ivcb[163] = -1730825768;
        gd.ivcb[164] = -1339284395;
        gd.ivcb[165] = 1141092197;
        gd.ivcb[166] = -1927224623;
        gd.ivcb[167] = -1368186361;
        gd.ivcb[168] = -1123822299;
        gd.ivcb[169] = 188032386;
        gd.ivcb[170] = 104066340;
        gd.ivcb[171] = -1930766429;
        gd.ivcb[172] = -1699380507;
        gd.ivcb[173] = -987957706;
        gd.ivcb[174] = 1464823759;
        gd.ivcb[175] = 661451926;
        gd.ivcb[176] = -491893026;
        gd.ivcb[177] = -1670205411;
        gd.ivcb[178] = 936612092;
        gd.ivcb[179] = -1735791264;
        gd.ivcb[180] = -749966678;
        gd.ivcb[181] = 2024153954;
        gd.ivcb[182] = 339717860;
        gd.ivcb[183] = -861033133;
        gd.ivcb[184] = 910229756;
        gd.ivcb[185] = -247493191;
        gd.ivcb[186] = 15039705;
        gd.ivcb[187] = -641641089;
        gd.ivcb[188] = 244497648;
        gd.ivcb[189] = 1724255761;
        gd.ivcb[190] = 1629434725;
        gd.ivcb[191] = 486646600;
        gd.ivcb[192] = -1129912455;
        gd.ivcb[193] = -1188777695;
        gd.ivcb[194] = 1928253508;
        gd.ivcb[195] = -551335894;
        gd.ivcb[196] = 582153877;
        gd.ivcb[197] = 2113948300;
        gd.ivcb[198] = -951449788;
        gd.ivcb[199] = 1616601487;
    }

    public static /* synthetic */ CallSite ivce(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void iwxq() {
        gd.ivcs[100] = 5579034661676487061L;
        gd.ivcs[101] = 3030586650037094139L;
        gd.ivcs[102] = -8815075378253968040L;
        gd.ivcs[103] = 5490851795219250970L;
        gd.ivcs[104] = -564568815440332779L;
        gd.ivcs[105] = 3033264406808073231L;
        gd.ivcs[106] = -8571797178369479635L;
        gd.ivcs[107] = 2105456146475570890L;
        gd.ivcs[108] = 1124499691086124789L;
        gd.ivcs[109] = -7728986255787408668L;
        gd.ivcs[110] = 4202077396762873488L;
        gd.ivcs[111] = -971901032532505067L;
        gd.ivcs[112] = 6571074224908896223L;
        gd.ivcs[113] = -3916760444013947985L;
        gd.ivcs[114] = 8096681489433149431L;
        gd.ivcs[115] = 7478929158848087783L;
        gd.ivcs[116] = -7446951883942195722L;
        gd.ivcs[117] = -8588114925429366052L;
        gd.ivcs[118] = -4866301675299650086L;
        gd.ivcs[119] = 1472764693496300964L;
        gd.ivcs[120] = -1874941690668925298L;
        gd.ivcs[121] = 5880130390852950700L;
        gd.ivcs[122] = -7053807298150510381L;
        gd.ivcs[123] = -7546313438994392766L;
        gd.ivcs[124] = 4677101744942251715L;
        gd.ivcs[125] = 5313937410671547644L;
        gd.ivcs[126] = -5345378041315363022L;
        gd.ivcs[127] = -4020657421598394224L;
        gd.ivcs[128] = 5077962174126691421L;
        gd.ivcs[129] = 9039087566979768837L;
        gd.ivcs[130] = -1987568224843747396L;
        gd.ivcs[131] = -7827569198980616096L;
        gd.ivcs[132] = 4417033367944388201L;
        gd.ivcs[133] = 4863874539277999939L;
        gd.ivcs[134] = -5361341939219242991L;
        gd.ivcs[135] = 7374187499302324982L;
        gd.ivcs[136] = 1494124410171359618L;
        gd.ivcs[137] = 2319589074505954135L;
        gd.ivcs[138] = 9003781104965857353L;
        gd.ivcs[139] = 1363024854707368396L;
        gd.ivcs[140] = -8242139056107094253L;
        gd.ivcs[141] = 6959007394061125397L;
        gd.ivcs[142] = -7931206567434970167L;
        gd.ivcs[143] = -8841810416125838725L;
        gd.ivcs[144] = 2641274550335977993L;
        gd.ivcs[145] = 7726111496029099411L;
        gd.ivcs[146] = 2844546665728437478L;
        gd.ivcs[147] = -5750921080132851683L;
        gd.ivcs[148] = -4773842869379890529L;
        gd.ivcs[149] = -8859002098805913971L;
        gd.ivcs[150] = -5631776997292350315L;
        gd.ivcs[151] = 8416460761972827371L;
        gd.ivcs[152] = -3191895088285739480L;
        gd.ivcs[153] = 3863658576325673484L;
        gd.ivcs[154] = -7366980729727183154L;
        gd.ivcs[155] = -7642260413693270957L;
        gd.ivcs[156] = -764204081854048675L;
        gd.ivcs[157] = 4228762493916566435L;
        gd.ivcs[158] = -4849288521889014339L;
        gd.ivcs[159] = -326655716531824051L;
        gd.ivcs[160] = 1018667207363698018L;
        gd.ivcs[161] = 2010849071342099497L;
        gd.ivcs[162] = 4503484284997629854L;
        gd.ivcs[163] = -1200994431126667604L;
        gd.ivcs[164] = -2174832764030046353L;
        gd.ivcs[165] = 1678311658717102943L;
        gd.ivcs[166] = 3638810036504919710L;
        gd.ivcs[167] = 6996117429508266220L;
        gd.ivcs[168] = -1820005289214879467L;
        gd.ivcs[169] = -3183682467175566492L;
        gd.ivcs[170] = 4677096082294033948L;
        gd.ivcs[171] = 7132421462863508635L;
        gd.ivcs[172] = -5598442592779380347L;
        gd.ivcs[173] = 6042811919700370500L;
        gd.ivcs[174] = 4984041671303967905L;
        gd.ivcs[175] = 7528954627504716046L;
        gd.ivcs[176] = -5620537519473708166L;
        gd.ivcs[177] = 1790354573138293314L;
        gd.ivcs[178] = 477824896082464252L;
        gd.ivcs[179] = 3349853487234882569L;
        gd.ivcs[180] = 1865207200708133916L;
        gd.ivcs[181] = 8459661174394217152L;
        gd.ivcs[182] = 6681176729875354139L;
        gd.ivcs[183] = 8904369433469056022L;
        gd.ivcs[184] = 730831046454883736L;
        gd.ivcs[185] = -126169574652013077L;
        gd.ivcs[186] = -6920114368914145653L;
        gd.ivcs[187] = 13066755107396027L;
        gd.ivcs[188] = -1383521015747763046L;
        gd.ivcs[189] = 3616395201707695701L;
        gd.ivcs[190] = 214224931719078314L;
        gd.ivcs[191] = -1621566778845160595L;
        gd.ivcs[192] = -962851540469389527L;
        gd.ivcs[193] = -6697616238742902129L;
        gd.ivcs[194] = -7754262102116389278L;
        gd.ivcs[195] = -3563812161412946839L;
        gd.ivcs[196] = 2992595476705566247L;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void deactivate() {
        boolean bl2;
        block15: {
            boolean bl3;
            while (true) {
                long l2;
                Object object;
                if ((object = (l2 = qn - gd.ivce("iwve", ivcr(int ), (int)174)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                if (object == gd.ivce("iwvf", ivci(int ), (int)257)) break;
                object = gd.ivce("iwvg", ivci(int ), (int)258);
            }
            bl2 = c;
            while (true) {
                long l3;
                Object object;
                if ((object = (l3 = qn - gd.ivce("iwvh", ivcr(int ), (int)175)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                if (object == gd.ivce("iwvi", ivci(int ), (int)259)) break;
                object = gd.ivce("iwvj", ivci(int ), (int)260);
            }
            int n2 = b;
            while (true) {
                long l4;
                Object object;
                if ((object = (l4 = qn - gd.ivce("iwvk", ivcr(int ), (int)176)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
                if (object == gd.ivce("iwvl", ivci(int ), (int)261)) {
                    bl3 = a;
                    if (bl2) {
                        throw null;
                    }
                    break;
                }
                object = gd.ivce("iwvm", ivci(int ), (int)262);
            }
            if (!bl3 && !bl3) {
                return;
            }
            if (n2 == 0) return;
            switch (n2) {
                default: {
                    return;
                }
                case 0: {
                    CallSite callSite = gd.ivce("iwvn", ivci(int ), (int)263);
                    if (bl2) {
                        throw null;
                    }
                }
                case 1: {
                    CallSite callSite = gd.ivce("iwvo", ivci(int ), (int)264);
                    if (!bl2) break;
                    throw null;
                }
                case 2: {
                    break block15;
                }
                case 3: 
            }
            CallSite callSite = gd.ivce("iwvq", ivci(int ), (int)266);
            if (bl2) {
                throw null;
            }
        }
        do {
            CallSite callSite = gd.ivce("iwvp", ivci(int ), (int)265);
        } while (!bl2);
        throw null;
    }

    private static /* synthetic */ void iwxm() {
        gd.ivcc[0] = -1670294222;
        gd.ivcc[1] = 1586974686;
        gd.ivcc[2] = -1326195641;
        gd.ivcc[3] = 1385396738;
        gd.ivcc[4] = 110899261;
        gd.ivcc[5] = 1117290181;
        gd.ivcc[6] = 262611086;
        gd.ivcc[7] = 1147250719;
        gd.ivcc[8] = 1781330616;
        gd.ivcc[9] = -1503659158;
        gd.ivcc[10] = 1635529360;
        gd.ivcc[11] = -1896185872;
        gd.ivcc[12] = -462041167;
        gd.ivcc[13] = 380428317;
        gd.ivcc[14] = 895769099;
        gd.ivcc[15] = 519801236;
        gd.ivcc[16] = -1967382932;
        gd.ivcc[17] = 255991649;
        gd.ivcc[18] = 332064770;
        gd.ivcc[19] = 98213789;
        gd.ivcc[20] = 1823215311;
        gd.ivcc[21] = -885392314;
        gd.ivcc[22] = -379878259;
        gd.ivcc[23] = -314186991;
        gd.ivcc[24] = -1234808856;
        gd.ivcc[25] = 321689482;
        gd.ivcc[26] = 1639768126;
        gd.ivcc[27] = 181329309;
        gd.ivcc[28] = 816805917;
        gd.ivcc[29] = 1593656819;
        gd.ivcc[30] = -1428664633;
        gd.ivcc[31] = -609581272;
        gd.ivcc[32] = -1563712351;
        gd.ivcc[33] = 510504460;
        gd.ivcc[34] = -556255144;
        gd.ivcc[35] = -1797855707;
        gd.ivcc[36] = 145159479;
        gd.ivcc[37] = 1962307225;
        gd.ivcc[38] = -1442534075;
        gd.ivcc[39] = 974413084;
        gd.ivcc[40] = -1765747158;
        gd.ivcc[41] = 1683537819;
        gd.ivcc[42] = -5923354;
        gd.ivcc[43] = 513691326;
        gd.ivcc[44] = 111400153;
        gd.ivcc[45] = 1715635833;
        gd.ivcc[46] = -1493816130;
        gd.ivcc[47] = 1975611193;
        gd.ivcc[48] = 90683510;
        gd.ivcc[49] = 681769340;
        gd.ivcc[50] = -1124565282;
        gd.ivcc[51] = -1149937971;
        gd.ivcc[52] = 792060682;
        gd.ivcc[53] = 2078377600;
        gd.ivcc[54] = 990621323;
        gd.ivcc[55] = -1587271265;
        gd.ivcc[56] = 1808023227;
        gd.ivcc[57] = -686821144;
        gd.ivcc[58] = 2082194462;
        gd.ivcc[59] = 136603853;
        gd.ivcc[60] = 339426129;
        gd.ivcc[61] = 1246485202;
        gd.ivcc[62] = -1520576213;
        gd.ivcc[63] = 1008091330;
        gd.ivcc[64] = -1086349322;
        gd.ivcc[65] = -1978454645;
        gd.ivcc[66] = 946436054;
        gd.ivcc[67] = -1995740329;
        gd.ivcc[68] = 325739355;
        gd.ivcc[69] = -1991167282;
        gd.ivcc[70] = -493305698;
        gd.ivcc[71] = -214192923;
        gd.ivcc[72] = -443935711;
        gd.ivcc[73] = -241296499;
        gd.ivcc[74] = -1020325126;
        gd.ivcc[75] = -1984186323;
        gd.ivcc[76] = -1525659324;
        gd.ivcc[77] = -1881947001;
        gd.ivcc[78] = 2045325166;
        gd.ivcc[79] = -1917848553;
        gd.ivcc[80] = 861201636;
        gd.ivcc[81] = -1629237495;
        gd.ivcc[82] = -1453157974;
        gd.ivcc[83] = -2128193158;
        gd.ivcc[84] = 916353601;
        gd.ivcc[85] = -1143903171;
        gd.ivcc[86] = 818842056;
        gd.ivcc[87] = -2001665081;
        gd.ivcc[88] = -625581267;
        gd.ivcc[89] = -1362751438;
        gd.ivcc[90] = -1724872784;
        gd.ivcc[91] = 1250278721;
        gd.ivcc[92] = 1532658249;
        gd.ivcc[93] = -321093695;
        gd.ivcc[94] = 1171118271;
        gd.ivcc[95] = -355125421;
        gd.ivcc[96] = -1743392688;
        gd.ivcc[97] = -399373947;
        gd.ivcc[98] = 803133179;
        gd.ivcc[99] = 1220589250;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public gd() {
        var2_1 /* !! */  = gd.b;
        super("Speed", "\u0423\u0441\u043a\u043e\u0440\u044f\u0435\u0442 \u0438\u0433\u0440\u043e\u043a\u0430", du.MOVEMENT);
        this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0440\u0435\u0436\u0438\u043c \u0441\u043a\u043e\u0440\u043e\u0441\u0442\u0438", "Vanilla", new String[]{"Vanilla", "Grim", "FunTime", "Funtime Elytra", "HolyWorld"});
        this.speed = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", "\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 \u0441\u043a\u043e\u0440\u043e\u0441\u0442\u0438 \u043f\u0435\u0440\u0435\u0434\u0432\u0438\u0436\u0435\u043d\u0438\u044f", (float)gd.ivce("ivcg", ivca(int ), (int)0)).range(1.0f, (float)gd.ivce("ivch", ivca(int ), (int)1)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$0(), ()Ljava/lang/Boolean;)((gd)this));
        this.diving = new kb("\u041f\u0438\u043a\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435", "\u041d\u0430\u043a\u043b\u043e\u043d\u044f\u0435\u0442 \u0441\u0435\u0440\u0432\u0435\u0440\u043d\u0443\u044e \u0440\u043e\u0442\u0430\u0446\u0438\u044e \u0432\u043d\u0438\u0437 \u0432\u043e \u0432\u0440\u0435\u043c\u044f \u0440\u0430\u0431\u043e\u0442\u044b \u0440\u0435\u0436\u0438\u043c\u0430").visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$1(), ()Ljava/lang/Boolean;)((gd)this));
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.settings(new jx[]{this.mode, this.speed, this.diving});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)gd.ivce("ivck", ivci(int ), (int)2);
                ** GOTO lbl17
            }
lbl14:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)gd.ivce("ivcl", ivci(int ), (int)3);
                ** GOTO lbl26
            }
lbl17:
            // 4 sources

            case 2: {
                var2_1 /* !! */  = (int)gd.ivce("ivcm", ivci(int ), (int)4);
                ** GOTO lbl23
            }
            case 3: {
                var2_1 /* !! */  = (int)gd.ivce("ivcn", ivci(int ), (int)5);
                ** GOTO lbl17
            }
lbl23:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)gd.ivce("ivco", ivci(int ), (int)6);
                ** GOTO lbl14
            }
lbl26:
            // 2 sources

            case 5: {
                var2_1 /* !! */  = (int)gd.ivce("ivcp", ivci(int ), (int)7);
                ** GOTO lbl17
            }
            case 6: 
        }
        while (true) {
            var2_1 /* !! */  = (int)gd.ivce("ivcq", ivci(int ), (int)8);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleGrimMode() {
        var6_1 = gd.c;
        var5_2 /* !! */  = gd.b;
        var4_3 = gd.a;
        if (var6_1) {
            throw null;
lbl6:
            // 18 sources

            return;
        }
        if (var4_3 || var4_3) ** GOTO lbl6
        var1_4 = gd.ivce("iwqe", ivci(int ), (int)187);
        if (var4_3 || var4_3) ** GOTO lbl6
        var2_5 = gd.mc.field_1687.method_18112().iterator();
        if (var4_3) ** GOTO lbl6
        block33: while (true) {
            block56: {
                block57: {
                    if (var4_3 || var4_3) ** GOTO lbl6
                    if (!var2_5.hasNext()) ** GOTO lbl41
                    if (var4_3) ** GOTO lbl6
                    var3_6 = (class_1297)var2_5.next();
                    if (var4_3 || var4_3) ** GOTO lbl6
                    if (var3_6 == gd.mc.field_1724) break block56;
                    if (var4_3) ** GOTO lbl6
                    if (var3_6 instanceof class_1531) break block56;
                    if (var4_3) ** GOTO lbl6
                    if (var3_6 instanceof class_1309) break block57;
                    if (var4_3) ** GOTO lbl6
                    if (!(var3_6 instanceof class_1690)) break block56;
                    if (var4_3) ** GOTO lbl6
                }
                if (var4_3 || var4_3) ** GOTO lbl6
                if (!gd.mc.field_1724.method_5829().method_1014((double)gd.ivce("iwqh", iwjs(int ), (int)165)).method_994(var3_6.method_5829())) break block56;
                if (var4_3 || var4_3) ** GOTO lbl6
                ++var1_4;
                if (var4_3) ** GOTO lbl6
            }
            if (var4_3) ** GOTO lbl6
            if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var5_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var4_3) ** GOTO lbl6
                    if (!var6_1) continue block33;
                    throw null;
                }
lbl41:
                // 1 sources

                if (var4_3 || var4_3) ** GOTO lbl6
                var2_5 = nq.forward((double)(gd.ivce("iwqj", iwjs(int ), (int)166) * (double)var1_4));
                if (var4_3 || var4_3) ** GOTO lbl6
                gd.mc.field_1724.method_5762((double)var2_5[0], 0.0, (double)var2_5[1]);
                if (!var4_3 && !var4_3) ** break;
                ** continue;
                return;
lbl48:
                // 3 sources

                case 0: {
                    var5_2 /* !! */  = (int)gd.ivce("iwql", ivci(int ), (int)188);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl148
                }
lbl53:
                // 4 sources

                case 1: {
                    var5_2 /* !! */  = (int)gd.ivce("iwqm", ivci(int ), (int)189);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl156
                }
                case 2: {
                    do {
                        var5_2 /* !! */  = (int)gd.ivce("iwqn", ivci(int ), (int)190);
                    } while (!var6_1);
                    throw null;
                }
                case 3: {
                    var5_2 /* !! */  = (int)gd.ivce("iwqp", ivci(int ), (int)191);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl139
                }
                case 4: {
                    var5_2 /* !! */  = (int)gd.ivce("iwqv", ivci(int ), (int)192);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl152
                }
                case 5: {
                    var5_2 /* !! */  = (int)gd.ivce("iwqx", ivci(int ), (int)193);
                    if (!var6_1) ** GOTO lbl53
                    throw null;
                }
lbl77:
                // 3 sources

                case 6: {
                    var5_2 /* !! */  = (int)gd.ivce("iwqz", ivci(int ), (int)194);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl87
                }
lbl82:
                // 2 sources

                case 7: {
                    var5_2 /* !! */  = (int)gd.ivce("iwrb", ivci(int ), (int)195);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl160
                }
lbl87:
                // 3 sources

                case 8: {
                    var5_2 /* !! */  = (int)gd.ivce("iwrc", ivci(int ), (int)196);
                    if (!var6_1) ** GOTO lbl53
                    throw null;
                }
                case 9: {
                    var5_2 /* !! */  = (int)gd.ivce("iwre", ivci(int ), (int)197);
                    if (!var6_1) ** GOTO lbl82
                    throw null;
                }
                case 10: {
                    do {
                        var5_2 /* !! */  = (int)gd.ivce("iwrf", ivci(int ), (int)198);
                    } while (!var6_1);
                    throw null;
                }
lbl100:
                // 2 sources

                case 11: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var5_2 /* !! */  = (int)gd.ivce("iwrg", ivci(int ), (int)199);
                        if (!var6_1) break block33;
                        throw null;
                    }
                }
                case 12: {
                    var5_2 /* !! */  = (int)gd.ivce("iwri", ivci(int ), (int)200);
                    if (!var6_1) ** GOTO lbl100
                    throw null;
                }
                case 13: {
                    var5_2 /* !! */  = (int)gd.ivce("iwrj", ivci(int ), (int)201);
                    if (!var6_1) break block33;
                    throw null;
                }
lbl113:
                // 2 sources

                case 14: {
                    var5_2 /* !! */  = (int)gd.ivce("iwrl", ivci(int ), (int)202);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl152
                }
                case 15: {
                    var5_2 /* !! */  = (int)gd.ivce("iwro", ivci(int ), (int)203);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl172
                }
                case 16: {
                    var5_2 /* !! */  = (int)gd.ivce("iwrq", ivci(int ), (int)204);
                    if (!var6_1) ** GOTO lbl48
                    throw null;
                }
lbl127:
                // 3 sources

                case 17: {
                    var5_2 /* !! */  = (int)gd.ivce("iwrt", ivci(int ), (int)205);
                    if (!var6_1) ** GOTO lbl113
                    throw null;
                }
                case 18: {
                    var5_2 /* !! */  = (int)gd.ivce("iwrv", ivci(int ), (int)206);
                    if (!var6_1) break block33;
                    throw null;
                }
                case 19: {
                    var5_2 /* !! */  = (int)gd.ivce("iwrw", ivci(int ), (int)207);
                    if (!var6_1) ** GOTO lbl127
                    throw null;
                }
lbl139:
                // 2 sources

                case 20: {
                    var5_2 /* !! */  = (int)gd.ivce("iwry", ivci(int ), (int)208);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl148
                }
                case 21: {
                    var5_2 /* !! */  = (int)gd.ivce("iwsa", ivci(int ), (int)209);
                    if (!var6_1) ** GOTO lbl53
                    throw null;
                }
lbl148:
                // 3 sources

                case 22: {
                    var5_2 /* !! */  = (int)gd.ivce("iwsc", ivci(int ), (int)210);
                    if (!var6_1) ** GOTO lbl87
                    throw null;
                }
lbl152:
                // 3 sources

                case 23: {
                    var5_2 /* !! */  = (int)gd.ivce("iwse", ivci(int ), (int)211);
                    if (var6_1) {
                        throw null;
                    }
                }
lbl156:
                // 4 sources

                case 24: {
                    var5_2 /* !! */  = (int)gd.ivce("iwsf", ivci(int ), (int)212);
                    if (!var6_1) break block33;
                    throw null;
                }
lbl160:
                // 2 sources

                case 25: {
                    var5_2 /* !! */  = (int)gd.ivce("iwsh", ivci(int ), (int)213);
                    if (!var6_1) ** GOTO lbl77
                    throw null;
                }
                case 26: {
                    var5_2 /* !! */  = (int)gd.ivce("iwsk", ivci(int ), (int)214);
                    if (!var6_1) ** GOTO lbl127
                    throw null;
                }
                case 27: {
                    var5_2 /* !! */  = (int)gd.ivce("iwsm", ivci(int ), (int)215);
                    if (!var6_1) ** GOTO lbl48
                    throw null;
                }
lbl172:
                // 2 sources

                case 28: {
                    var5_2 /* !! */  = (int)gd.ivce("iwsp", ivci(int ), (int)216);
                    if (!var6_1) ** GOTO lbl77
                    throw null;
                }
                case 29: 
            }
            break;
        }
        var5_2 /* !! */  = (int)gd.ivce("iwss", ivci(int ), (int)217);
        ** while (!var6_1)
lbl179:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iwxs() {
        gd.ivct[100] = -5617268156348341455L;
        gd.ivct[101] = -5740414385726402899L;
        gd.ivct[102] = -6446070556448623589L;
        gd.ivct[103] = -768522506295740416L;
        gd.ivct[104] = 6302456906471423876L;
        gd.ivct[105] = -5757285473999173438L;
        gd.ivct[106] = -9129948378414252166L;
        gd.ivct[107] = 413457629620664060L;
        gd.ivct[108] = -7029304297870684474L;
        gd.ivct[109] = 245363736370102817L;
        gd.ivct[110] = -7880427623777682948L;
        gd.ivct[111] = 3182647124151689589L;
        gd.ivct[112] = 2027710399100505195L;
        gd.ivct[113] = 1224367448306348308L;
        gd.ivct[114] = -5641000349928880917L;
        gd.ivct[115] = 1272499300107508188L;
        gd.ivct[116] = -4716029977932338743L;
        gd.ivct[117] = -2624850322331392498L;
        gd.ivct[118] = 6001866349674228006L;
        gd.ivct[119] = 6888435306875352493L;
        gd.ivct[120] = 5156707323623049L;
        gd.ivct[121] = 3122159329242645307L;
        gd.ivct[122] = -227069377824354871L;
        gd.ivct[123] = -8414946368210325447L;
        gd.ivct[124] = -713292611271333206L;
        gd.ivct[125] = -6018354975999147784L;
        gd.ivct[126] = 2089026288912459734L;
        gd.ivct[127] = 3216165762066845694L;
        gd.ivct[128] = 6858788110256215766L;
        gd.ivct[129] = 5458798491506039034L;
        gd.ivct[130] = -2911694571864316137L;
        gd.ivct[131] = -4969404644968750673L;
        gd.ivct[132] = -3140021293927317391L;
        gd.ivct[133] = -6076476326126883321L;
        gd.ivct[134] = -193948843923030257L;
        gd.ivct[135] = -8598354744247763099L;
        gd.ivct[136] = 1241063817723202706L;
        gd.ivct[137] = 6771484892560945973L;
        gd.ivct[138] = 2600458837996297660L;
        gd.ivct[139] = -2450348517668296811L;
        gd.ivct[140] = -497936547142380387L;
        gd.ivct[141] = -8502755732893889056L;
        gd.ivct[142] = 2080453969833038555L;
        gd.ivct[143] = 2034189824115408295L;
        gd.ivct[144] = -5963428921598418254L;
        gd.ivct[145] = 2702988101182679286L;
        gd.ivct[146] = -3741181708215958064L;
        gd.ivct[147] = 7986915042034147290L;
        gd.ivct[148] = 2584797881162583679L;
        gd.ivct[149] = -4801732808781543389L;
        gd.ivct[150] = -3873819449462298871L;
        gd.ivct[151] = 4742912333778914666L;
        gd.ivct[152] = 2630181036760517973L;
        gd.ivct[153] = 3983538823855683803L;
        gd.ivct[154] = 5239988311802151961L;
        gd.ivct[155] = -7571992149112547153L;
        gd.ivct[156] = 2038540955507883328L;
        gd.ivct[157] = 8463788985269659646L;
        gd.ivct[158] = 3554562723994569899L;
        gd.ivct[159] = 7590241267939058338L;
        gd.ivct[160] = 8108775956464194522L;
        gd.ivct[161] = 5728965814690657294L;
        gd.ivct[162] = -1087251035092609173L;
        gd.ivct[163] = -6784953393309863314L;
        gd.ivct[164] = -9106710191098337268L;
        gd.ivct[165] = 2930312355126100831L;
        gd.ivct[166] = 994818295003098994L;
        gd.ivct[167] = 6827832906216528108L;
        gd.ivct[168] = -2798152472768120610L;
        gd.ivct[169] = 7873577795945554745L;
        gd.ivct[170] = 273545764476926846L;
        gd.ivct[171] = 4189972152402881914L;
        gd.ivct[172] = 9007000055120925724L;
        gd.ivct[173] = -6063727393249554278L;
        gd.ivct[174] = -4362355698440947652L;
        gd.ivct[175] = 6276835988184016619L;
        gd.ivct[176] = 1950425099856245275L;
        gd.ivct[177] = -5612458861561639306L;
        gd.ivct[178] = -2981070316707967344L;
        gd.ivct[179] = -7544125820016641456L;
        gd.ivct[180] = -2939325283836259789L;
        gd.ivct[181] = 2605662394938020849L;
        gd.ivct[182] = -6158164303945631829L;
        gd.ivct[183] = -6053115376586675710L;
        gd.ivct[184] = -6295442410580062157L;
        gd.ivct[185] = -8630051398498922653L;
        gd.ivct[186] = 3009043435646118239L;
        gd.ivct[187] = 2902468399436540661L;
        gd.ivct[188] = 8761652554789476122L;
        gd.ivct[189] = -2101816494531447876L;
        gd.ivct[190] = -7149197693626506326L;
        gd.ivct[191] = 1279053791495096074L;
        gd.ivct[192] = 4676970532975172109L;
        gd.ivct[193] = 6466256502336920561L;
        gd.ivct[194] = -9184614500849167208L;
        gd.ivct[195] = -661274459180542459L;
        gd.ivct[196] = 3837312235102281934L;
    }

    private static /* synthetic */ float ivca(int n2) {
        return Float.intBitsToFloat(ivcb[n2] ^ ivcc[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onUsingItem(dg var1_1) {
        v0 /* !! */  = gd.qn;
        if (true) ** GOTO lbl5
        block57: while (true) {
            v0 /* !! */  = (long)(v1 - gd.ivce("iwft", ivcr(int ), (int)19));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1951865460: {
                    v1 = gd.ivce("iwfu", ivcr(int ), (int)20);
                    continue block57;
                }
                case -827370411: {
                    v1 = gd.ivce("iwfv", ivcr(int ), (int)21);
                    continue block57;
                }
                case 101155857: {
                    v1 = gd.ivce("iwfw", ivcr(int ), (int)22);
                    continue block57;
                }
                case 1863665611: {
                    break block57;
                }
            }
            break;
        }
        var4_2 = gd.c;
        v2 /* !! */  = gd.qn;
        if (true) ** GOTO lbl22
        block58: while (true) {
            v2 /* !! */  = (long)(v3 - gd.ivce("iwfx", ivcr(int ), (int)23));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 1710638326: {
                    v3 = gd.ivce("iwfy", ivcr(int ), (int)24);
                    continue block58;
                }
                case 1863665611: {
                    break block58;
                }
                case 2132616111: {
                    v3 = gd.ivce("iwfz", ivcr(int ), (int)25);
                    continue block58;
                }
            }
            break;
        }
        var3_3 /* !! */  = gd.b;
        v4 /* !! */  = gd.qn;
        if (true) ** GOTO lbl36
        block59: while (true) {
            v4 /* !! */  = (long)(v5 - gd.ivce("iwga", ivcr(int ), (int)26));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 824232645: {
                    v5 = gd.ivce("iwgb", ivcr(int ), (int)27);
                    continue block59;
                }
                case 1610626389: {
                    v5 = gd.ivce("iwgc", ivcr(int ), (int)28);
                    continue block59;
                }
                case 1696066478: {
                    v5 = gd.ivce("iwgd", ivcr(int ), (int)29);
                    continue block59;
                }
                case 1863665611: {
                    break block59;
                }
            }
            break;
        }
        var2_4 = gd.a;
        if (var4_2) {
            throw null;
lbl51:
            // 6 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl51
        v6 /* !! */  = gd.qn;
        if (true) ** GOTO lbl58
        block61: while (true) {
            v6 /* !! */  = (long)(v7 - gd.ivce("iwge", ivcr(int ), (int)30));
lbl58:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 101350841: {
                    v7 = gd.ivce("iwgf", ivcr(int ), (int)31);
                    continue block61;
                }
                case 650967748: {
                    v7 = gd.ivce("iwgg", ivcr(int ), (int)32);
                    continue block61;
                }
                case 1104139897: {
                    v7 = gd.ivce("iwgh", ivcr(int ), (int)33);
                    continue block61;
                }
                case 1863665611: {
                    break block61;
                }
            }
            break;
        }
        v8 /* !! */  = gd.qn;
        if (true) ** GOTO lbl74
        block62: while (true) {
            v8 /* !! */  = (long)(gd.ivce("iwgj", ivcr(int ), (int)35) - gd.ivce("iwgi", ivcr(int ), (int)34));
lbl74:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1244326046: {
                    continue block62;
                }
                case 1863665611: {
                    break block62;
                }
            }
            break;
        }
        if (!this.mode.isSelected("Funtime Elytra")) ** GOTO lbl140
        if (var2_4) ** GOTO lbl51
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v9 /* !! */  = gd.qn;
                if (true) ** GOTO lbl88
                block63: while (true) {
                    v9 /* !! */  = (long)(v10 - gd.ivce("iwgk", ivcr(int ), (int)36));
lbl88:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 212571796: {
                            v10 = gd.ivce("iwgl", ivcr(int ), (int)37);
                            continue block63;
                        }
                        case 664468456: {
                            v10 = gd.ivce("iwgm", ivcr(int ), (int)38);
                            continue block63;
                        }
                        case 1863665611: {
                            break block63;
                        }
                        case 1904832654: {
                            v10 = gd.ivce("iwgn", ivcr(int ), (int)39);
                            continue block63;
                        }
                    }
                    break;
                }
                if (var1_1.getType() != gd.ivce("iwgo", ivci(int ), (int)66)) ** GOTO lbl140
                if (var2_4) ** GOTO lbl51
                v11 /* !! */  = gd.qn;
                if (true) ** GOTO lbl106
                block64: while (true) {
                    v11 /* !! */  = (long)(v12 - gd.ivce("iwgp", ivcr(int ), (int)40));
lbl106:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -956535301: {
                            v12 = gd.ivce("iwgq", ivcr(int ), (int)41);
                            continue block64;
                        }
                        case 1806090155: {
                            v12 = gd.ivce("iwgr", ivcr(int ), (int)42);
                            continue block64;
                        }
                        case 1863665611: {
                            break block64;
                        }
                    }
                    break;
                }
                v13 /* !! */  = gd.qn;
                if (true) ** GOTO lbl119
                block65: while (true) {
                    v13 /* !! */  = (long)(v14 - gd.ivce("iwgs", ivcr(int ), (int)43));
lbl119:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1840284156: {
                            v14 = gd.ivce("iwgt", ivcr(int ), (int)44);
                            continue block65;
                        }
                        case 240074467: {
                            v14 = gd.ivce("iwgu", ivcr(int ), (int)45);
                            continue block65;
                        }
                        case 1449478150: {
                            v14 = gd.ivce("iwgv", ivcr(int ), (int)46);
                            continue block65;
                        }
                        case 1863665611: {
                            break block65;
                        }
                    }
                    break;
                }
                if (nv.findHotbarItem(class_1802.field_8833) == gd.ivce("iwgw", ivci(int ), (int)67)) ** GOTO lbl140
                if (var2_4 || var2_4) ** GOTO lbl51
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_0 = gd.qn - gd.ivce("iwgx", ivcr(int ), (int)47)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == gd.ivce("iwgy", ivci(int ), (int)68)) break;
                    v15 /* !! */  = (long)gd.ivce("iwgz", ivci(int ), (int)69);
                }
                var1_1.cancel();
                if (var2_4) ** GOTO lbl51
lbl140:
                // 4 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)gd.ivce("iwha", ivci(int ), (int)70);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 1: {
                var3_3 /* !! */  = (int)gd.ivce("iwhb", ivci(int ), (int)71);
                if (var4_2) {
                    throw null;
                }
            }
lbl152:
            // 4 sources

            case 2: {
                var3_3 /* !! */  = (int)gd.ivce("iwhc", ivci(int ), (int)72);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl157:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)gd.ivce("iwhd", ivci(int ), (int)73);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl162:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)gd.ivce("iwhe", ivci(int ), (int)74);
                if (!var4_2) ** GOTO lbl152
                throw null;
            }
lbl166:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)gd.ivce("iwhf", ivci(int ), (int)75);
                if (!var4_2) ** GOTO lbl162
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)gd.ivce("iwhg", ivci(int ), (int)76);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gd.ivce("iwhh", ivci(int ), (int)77);
                    if (!var4_2) ** GOTO lbl166
                    throw null;
                }
            }
lbl180:
            // 4 sources

            case 8: {
                var3_3 /* !! */  = (int)gd.ivce("iwhi", ivci(int ), (int)78);
                if (!var4_2) ** GOTO lbl157
                throw null;
            }
lbl184:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)gd.ivce("iwhj", ivci(int ), (int)79);
                if (!var4_2) ** GOTO lbl180
                throw null;
            }
            case 10: 
        }
        var3_3 /* !! */  = (int)gd.ivce("iwhk", ivci(int ), (int)80);
        ** while (!var4_2)
lbl191:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iwxp() {
        gd.ivcs[0] = -1305358966220199763L;
        gd.ivcs[1] = -523519752945586145L;
        gd.ivcs[2] = 8738173725670777736L;
        gd.ivcs[3] = 5232405026125439525L;
        gd.ivcs[4] = -7577865724522088968L;
        gd.ivcs[5] = 6280143268935351561L;
        gd.ivcs[6] = -5179617371143587086L;
        gd.ivcs[7] = -3667086576273123870L;
        gd.ivcs[8] = 6208919300956023526L;
        gd.ivcs[9] = -4305182259791226986L;
        gd.ivcs[10] = -2051500483629503912L;
        gd.ivcs[11] = -7578972212065081062L;
        gd.ivcs[12] = -4910008057663145432L;
        gd.ivcs[13] = 5205041119397015659L;
        gd.ivcs[14] = -2529583249920577849L;
        gd.ivcs[15] = 5555141207564675733L;
        gd.ivcs[16] = -4425710121285199235L;
        gd.ivcs[17] = -2635887900595044355L;
        gd.ivcs[18] = 2252501220428444659L;
        gd.ivcs[19] = -422335913096916532L;
        gd.ivcs[20] = -1051781927055832096L;
        gd.ivcs[21] = -8818473516278705466L;
        gd.ivcs[22] = -8370373084147588007L;
        gd.ivcs[23] = -8530031057555313637L;
        gd.ivcs[24] = -3823236296261170099L;
        gd.ivcs[25] = -7787421019763744544L;
        gd.ivcs[26] = -8207823045564087290L;
        gd.ivcs[27] = -5761925615108230622L;
        gd.ivcs[28] = 153158419124171144L;
        gd.ivcs[29] = -9130920675418980631L;
        gd.ivcs[30] = -4892661519337576850L;
        gd.ivcs[31] = -6500105978649756532L;
        gd.ivcs[32] = 7759042413525365900L;
        gd.ivcs[33] = -6189699324708218900L;
        gd.ivcs[34] = 9079391139382405847L;
        gd.ivcs[35] = -4489051809842567020L;
        gd.ivcs[36] = -1050261823056152991L;
        gd.ivcs[37] = 6309223794224368905L;
        gd.ivcs[38] = 5945375175235251575L;
        gd.ivcs[39] = -1987617340908146058L;
        gd.ivcs[40] = -855985011805391924L;
        gd.ivcs[41] = 7236028211048328996L;
        gd.ivcs[42] = 2262968574978876198L;
        gd.ivcs[43] = 8990482865958057797L;
        gd.ivcs[44] = 1177245208898836177L;
        gd.ivcs[45] = -5577107959737484899L;
        gd.ivcs[46] = 6570346193172774029L;
        gd.ivcs[47] = 5804626604004650021L;
        gd.ivcs[48] = -3192728888559249055L;
        gd.ivcs[49] = 9111588307810888836L;
        gd.ivcs[50] = -4202592096802016500L;
        gd.ivcs[51] = 3531779977489867391L;
        gd.ivcs[52] = 3577349080862587900L;
        gd.ivcs[53] = -2119659249398328636L;
        gd.ivcs[54] = -8221533444972616311L;
        gd.ivcs[55] = 8453707876681446252L;
        gd.ivcs[56] = -8571341399811501031L;
        gd.ivcs[57] = 1247564751453518706L;
        gd.ivcs[58] = -5975743926666707647L;
        gd.ivcs[59] = 4616097713860483385L;
        gd.ivcs[60] = 5461381485375957235L;
        gd.ivcs[61] = -6325913182076900141L;
        gd.ivcs[62] = -9039976224620030661L;
        gd.ivcs[63] = -6564602486564967603L;
        gd.ivcs[64] = 685788303500697471L;
        gd.ivcs[65] = -665202072354496279L;
        gd.ivcs[66] = 5553198361535279026L;
        gd.ivcs[67] = -2451007345329270700L;
        gd.ivcs[68] = -2683593426571259686L;
        gd.ivcs[69] = 7435717317033132764L;
        gd.ivcs[70] = 1831571286099906828L;
        gd.ivcs[71] = 8410955098265703878L;
        gd.ivcs[72] = 6954642571271368443L;
        gd.ivcs[73] = 2045345590592796148L;
        gd.ivcs[74] = 299869249699269672L;
        gd.ivcs[75] = -3757173688512033439L;
        gd.ivcs[76] = -72987925643552755L;
        gd.ivcs[77] = -5481080087105341132L;
        gd.ivcs[78] = 375181833098948582L;
        gd.ivcs[79] = -7500749597706565584L;
        gd.ivcs[80] = -9081742302199328611L;
        gd.ivcs[81] = 3523869521745243713L;
        gd.ivcs[82] = -3222470805454183421L;
        gd.ivcs[83] = 3147153111824441042L;
        gd.ivcs[84] = 1535259991474266794L;
        gd.ivcs[85] = -1751655560299722266L;
        gd.ivcs[86] = -2946111287793283045L;
        gd.ivcs[87] = -7950096153137583335L;
        gd.ivcs[88] = -3407415066061382474L;
        gd.ivcs[89] = 2260314216056805917L;
        gd.ivcs[90] = 259641221399189153L;
        gd.ivcs[91] = -3577524851557580528L;
        gd.ivcs[92] = 2249842276054902415L;
        gd.ivcs[93] = 1194230135139854271L;
        gd.ivcs[94] = 4788310582367711831L;
        gd.ivcs[95] = 4403602844180694140L;
        gd.ivcs[96] = -6649930531986359671L;
        gd.ivcs[97] = 2115677882799530271L;
        gd.ivcs[98] = 2526956719652265713L;
        gd.ivcs[99] = -7522665081768849502L;
    }

    private static /* synthetic */ long ivcr(int n2) {
        return ivcs[n2] ^ ivct[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleHolyWorldMode() {
        var6_1 = gd.c;
        var5_2 /* !! */  = gd.b;
        var4_3 = gd.a;
        if (var6_1) {
            throw null;
lbl6:
            // 17 sources

            return;
        }
        if (var4_3 || var4_3) ** GOTO lbl6
        var1_4 = gd.ivce("iwsy", ivci(int ), (int)218);
        if (var4_3 || var4_3) ** GOTO lbl6
        var2_5 = gd.mc.field_1687.method_18112().iterator();
        if (var4_3) ** GOTO lbl6
        block33: while (true) {
            block60: {
                if (var4_3 || var4_3) ** GOTO lbl6
                if (!var2_5.hasNext()) ** GOTO lbl39
                if (var4_3) ** GOTO lbl6
                var3_6 = (class_1297)var2_5.next();
                if (var4_3 || var4_3) ** GOTO lbl6
                if (var3_6 == gd.mc.field_1724) ** GOTO lbl36
                if (var4_3) ** GOTO lbl6
                if (var3_6 instanceof class_1531) ** GOTO lbl36
                if (var4_3) ** GOTO lbl6
                if (var3_6 instanceof class_1309) break block60;
                if (var4_3) ** GOTO lbl6
                if (!(var3_6 instanceof class_1690)) ** GOTO lbl36
                if (var4_3) ** GOTO lbl6
            }
            if (var4_3 || var4_3) ** GOTO lbl6
            if (!gd.mc.field_1724.method_5829().method_1014((double)gd.ivce("iwtb", iwjs(int ), (int)167)).method_994(var3_6.method_5829())) ** GOTO lbl36
            if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var5_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var4_3 || var4_3) ** GOTO lbl6
                    ++var1_4;
                    if (var4_3) ** GOTO lbl6
lbl36:
                    // 5 sources

                    if (var4_3 || var4_3) ** GOTO lbl6
                    if (!var6_1) continue block33;
                    throw null;
                }
lbl39:
                // 1 sources

                if (var4_3 || var4_3) ** GOTO lbl6
                var2_5 = nq.forward((double)(gd.ivce("iwtd", iwjs(int ), (int)168) * (double)var1_4));
                if (var4_3 || var4_3) ** GOTO lbl6
                gd.mc.field_1724.method_5762((double)var2_5[0], 0.0, (double)var2_5[1]);
                if (!var4_3 && !var4_3) ** break;
                ** continue;
                return;
lbl46:
                // 2 sources

                case 0: {
                    var5_2 /* !! */  = (int)gd.ivce("iwte", ivci(int ), (int)219);
                    if (!var6_1) break block33;
                    throw null;
                }
                case 1: {
                    var5_2 /* !! */  = (int)gd.ivce("iwtf", ivci(int ), (int)220);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl132
                }
                case 2: {
                    var5_2 /* !! */  = (int)gd.ivce("iwtg", ivci(int ), (int)221);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl98
                }
lbl60:
                // 2 sources

                case 3: {
                    var5_2 /* !! */  = (int)gd.ivce("iwti", ivci(int ), (int)222);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl111
                }
lbl65:
                // 2 sources

                case 4: {
                    var5_2 /* !! */  = (int)gd.ivce("iwtj", ivci(int ), (int)223);
                    if (!var6_1) ** GOTO lbl60
                    throw null;
                }
                case 5: {
                    var5_2 /* !! */  = (int)gd.ivce("iwtk", ivci(int ), (int)224);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl132
                }
lbl74:
                // 4 sources

                case 6: {
                    var5_2 /* !! */  = (int)gd.ivce("iwtl", ivci(int ), (int)225);
                    if (!var6_1) ** GOTO lbl46
                    throw null;
                }
                case 7: {
                    var5_2 /* !! */  = (int)gd.ivce("iwtm", ivci(int ), (int)226);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl144
                }
lbl83:
                // 2 sources

                case 8: {
                    var5_2 /* !! */  = (int)gd.ivce("iwtn", ivci(int ), (int)227);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl132
                }
lbl88:
                // 2 sources

                case 9: {
                    var5_2 /* !! */  = (int)gd.ivce("iwto", ivci(int ), (int)228);
                    if (!var6_1) ** GOTO lbl74
                    throw null;
                }
lbl92:
                // 2 sources

                case 10: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var5_2 /* !! */  = (int)gd.ivce("iwtq", ivci(int ), (int)229);
                        if (var6_1) {
                            throw null;
                        }
                        ** GOTO lbl132
                        break;
                    }
                }
lbl98:
                // 3 sources

                case 11: {
                    var5_2 /* !! */  = (int)gd.ivce("iwtr", ivci(int ), (int)230);
                    if (!var6_1) ** GOTO lbl83
                    throw null;
                }
lbl102:
                // 3 sources

                case 12: {
                    var5_2 /* !! */  = (int)gd.ivce("iwtt", ivci(int ), (int)231);
                    if (!var6_1) ** GOTO lbl98
                    throw null;
                }
                case 13: {
                    var5_2 /* !! */  = (int)gd.ivce("iwtu", ivci(int ), (int)232);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl161
                }
lbl111:
                // 3 sources

                case 14: {
                    var5_2 /* !! */  = (int)gd.ivce("iwtv", ivci(int ), (int)233);
                    if (!var6_1) break block33;
                    throw null;
                }
lbl115:
                // 2 sources

                case 15: {
                    var5_2 /* !! */  = (int)gd.ivce("iwtw", ivci(int ), (int)234);
                    if (!var6_1) ** GOTO lbl92
                    throw null;
                }
                case 16: {
                    var5_2 /* !! */  = (int)gd.ivce("iwtx", ivci(int ), (int)235);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl144
                }
                case 17: {
                    var5_2 /* !! */  = (int)gd.ivce("iwtz", ivci(int ), (int)236);
                    if (!var6_1) ** GOTO lbl115
                    throw null;
                }
lbl128:
                // 2 sources

                case 18: {
                    var5_2 /* !! */  = (int)gd.ivce("iwua", ivci(int ), (int)237);
                    if (!var6_1) ** GOTO lbl65
                    throw null;
                }
lbl132:
                // 6 sources

                case 19: {
                    var5_2 /* !! */  = (int)gd.ivce("iwub", ivci(int ), (int)238);
                    if (!var6_1) ** GOTO lbl74
                    throw null;
                }
                case 20: {
                    var5_2 /* !! */  = (int)gd.ivce("iwuc", ivci(int ), (int)239);
                    if (!var6_1) ** GOTO lbl132
                    throw null;
                }
                case 21: {
                    var5_2 /* !! */  = (int)gd.ivce("iwud", ivci(int ), (int)240);
                    if (!var6_1) ** GOTO lbl102
                    throw null;
                }
lbl144:
                // 3 sources

                case 22: {
                    var5_2 /* !! */  = (int)gd.ivce("iwuf", ivci(int ), (int)241);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl169
                }
                case 23: {
                    var5_2 /* !! */  = (int)gd.ivce("iwug", ivci(int ), (int)242);
                    if (var6_1) {
                        throw null;
                    }
                }
                case 24: {
                    var5_2 /* !! */  = (int)gd.ivce("iwuh", ivci(int ), (int)243);
                    if (!var6_1) ** GOTO lbl128
                    throw null;
                }
                case 25: {
                    var5_2 /* !! */  = (int)gd.ivce("iwui", ivci(int ), (int)244);
                    if (!var6_1) ** GOTO lbl74
                    throw null;
                }
lbl161:
                // 2 sources

                case 26: {
                    var5_2 /* !! */  = (int)gd.ivce("iwuk", ivci(int ), (int)245);
                    if (!var6_1) ** GOTO lbl111
                    throw null;
                }
                case 27: {
                    var5_2 /* !! */  = (int)gd.ivce("iwul", ivci(int ), (int)246);
                    if (!var6_1) ** GOTO lbl102
                    throw null;
                }
lbl169:
                // 2 sources

                case 28: {
                    var5_2 /* !! */  = (int)gd.ivce("iwum", ivci(int ), (int)247);
                    if (!var6_1) ** GOTO lbl88
                    throw null;
                }
                case 29: 
            }
            break;
        }
        var5_2 /* !! */  = (int)gd.ivce("iwun", ivci(int ), (int)248);
        ** while (!var6_1)
lbl176:
        // 1 sources

        throw null;
    }
}

