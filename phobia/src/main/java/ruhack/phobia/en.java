/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.class_1657
 *  net.minecraft.class_1703
 *  net.minecraft.class_1713
 *  net.minecraft.class_640
 *  net.minecraft.class_7439
 */
package ruhack.phobia;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import net.minecraft.class_1657;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_640;
import net.minecraft.class_7439;
import ruhack.phobia.aw;
import ruhack.phobia.cr;
import ruhack.phobia.cr$Type;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.kh;
import ruhack.phobia.ps;

public class en
extends ds {
    private final ps counterTo;
    private final Pattern pattern;
    public static final boolean a;
    private static long[] fje;
    private final kf mode;
    private final kg slowTime;
    private final List<String> sent;
    private static int[] fih;
    private final kb babki;
    public static final boolean c;
    public static final int b;
    private final ps counter2;
    private double lastPosY;
    private final kh money;
    private static long[] fjd;
    protected static final long x = 7962166887901933670L;
    private double lastPosX;
    private double lastPosZ;
    private static int[] fig;
    private final ps counterChoice;
    private final ps counter;

    private static /* synthetic */ float fif(int n2) {
        return Float.intBitsToFloat(fig[n2] ^ fih[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleScreenInteraction() {
        var6_1 = en.c;
        var5_2 /* !! */  = en.b;
        var4_3 = en.a;
        if (var6_1) {
            throw null;
lbl6:
            // 20 sources

            return;
        }
        if (var4_3) ** GOTO lbl6
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_3) ** GOTO lbl6
                if (en.mc.field_1755 == null) ** GOTO lbl48
                if (var4_3) ** GOTO lbl6
                var2_4 = en.mc.field_1724.field_7512;
                if (var4_3) ** GOTO lbl6
                if (!(var2_4 instanceof class_1703)) ** GOTO lbl48
                if (var4_3) ** GOTO lbl6
                var1_5 = var2_4;
                if (var4_3 || var4_3) ** GOTO lbl6
                var2_4 = en.mc.field_1755.method_25440().getString();
                if (var4_3 || var4_3) ** GOTO lbl6
                if (!var2_4.contains("\u0412\u044b\u0431\u043e\u0440 \u043d\u0430\u0431\u043e\u0440\u0430 (1/1)")) ** GOTO lbl39
                if (var4_3 || var4_3) ** GOTO lbl6
                if (!this.counterChoice.hasTimeElapsed((long)en.fii("fug", fjc(int ), (int)116))) ** GOTO lbl48
                if (var4_3 || var4_3) ** GOTO lbl6
                var3_6 = this.getKitSlot();
                if (var4_3 || var4_3) ** GOTO lbl6
                if (var3_6 < 0) ** GOTO lbl33
                if (var4_3 || var4_3) ** GOTO lbl6
                en.mc.field_1761.method_2906(en.mc.field_1724.field_7512.field_7763, var3_6, (int)en.fii("fuh", fim(int ), (int)188), class_1713.field_7794, (class_1657)en.mc.field_1724);
                if (var4_3) ** GOTO lbl6
lbl33:
                // 2 sources

                if (var4_3 || var4_3) ** GOTO lbl6
                this.counterChoice.resetCounter();
                if (var4_3 || var4_3) ** GOTO lbl6
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl48
lbl39:
                // 1 sources

                if (var4_3 || var4_3) ** GOTO lbl6
                if (!var2_4.contains("\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 \u043f\u043e\u0435\u0434\u0438\u043d\u043a\u0430")) ** GOTO lbl48
                if (var4_3 || var4_3) ** GOTO lbl6
                if (!this.counterTo.hasTimeElapsed((long)en.fii("fui", fjc(int ), (int)117))) ** GOTO lbl48
                if (var4_3 || var4_3) ** GOTO lbl6
                en.mc.field_1761.method_2906(var1_5.field_7763, (int)en.fii("fuj", fim(int ), (int)189), (int)en.fii("fuk", fim(int ), (int)190), class_1713.field_7794, (class_1657)en.mc.field_1724);
                if (var4_3 || var4_3) ** GOTO lbl6
                this.counterTo.resetCounter();
                if (var4_3) ** GOTO lbl6
lbl48:
                // 7 sources

                if (!var4_3 && !var4_3) ** break;
                ** continue;
                return;
            }
lbl51:
            // 2 sources

            case 0: {
                var5_2 /* !! */  = (int)en.fii("ful", fim(int ), (int)191);
                if (var6_1) {
                    throw null;
                }
            }
lbl55:
            // 4 sources

            case 1: {
                do {
                    var5_2 /* !! */  = (int)en.fii("fum", fim(int ), (int)192);
                } while (!var6_1);
                throw null;
            }
lbl60:
            // 3 sources

            case 2: {
                var5_2 /* !! */  = (int)en.fii("fun", fim(int ), (int)193);
                if (!var6_1) ** GOTO lbl55
                throw null;
            }
lbl64:
            // 2 sources

            case 3: {
                do {
                    var5_2 /* !! */  = (int)en.fii("fuo", fim(int ), (int)194);
                } while (!var6_1);
                throw null;
            }
lbl69:
            // 3 sources

            case 4: {
                var5_2 /* !! */  = (int)en.fii("fup", fim(int ), (int)195);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 5: {
                var5_2 /* !! */  = (int)en.fii("fuq", fim(int ), (int)196);
                if (!var6_1) ** GOTO lbl51
                throw null;
            }
lbl78:
            // 2 sources

            case 6: {
                var5_2 /* !! */  = (int)en.fii("fur", fim(int ), (int)197);
                if (!var6_1) ** GOTO lbl64
                throw null;
            }
lbl82:
            // 3 sources

            case 7: {
                var5_2 /* !! */  = (int)en.fii("fus", fim(int ), (int)198);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl87:
            // 4 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)en.fii("fut", fim(int ), (int)199);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl116
                    break;
                }
            }
            case 9: {
                var5_2 /* !! */  = (int)en.fii("fuu", fim(int ), (int)200);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl98:
            // 2 sources

            case 10: {
                var5_2 /* !! */  = (int)en.fii("fuv", fim(int ), (int)201);
                if (!var6_1) ** GOTO lbl87
                throw null;
            }
            case 11: {
                var5_2 /* !! */  = (int)en.fii("fuw", fim(int ), (int)202);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl187
            }
            case 12: {
                var5_2 /* !! */  = (int)en.fii("fux", fim(int ), (int)203);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl121
            }
            case 13: {
                var5_2 /* !! */  = (int)en.fii("fuy", fim(int ), (int)204);
                if (!var6_1) ** GOTO lbl82
                throw null;
            }
lbl116:
            // 2 sources

            case 14: {
                do {
                    var5_2 /* !! */  = (int)en.fii("fuz", fim(int ), (int)205);
                } while (!var6_1);
                throw null;
            }
lbl121:
            // 2 sources

            case 15: {
                var5_2 /* !! */  = (int)en.fii("fva", fim(int ), (int)206);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl203
            }
lbl126:
            // 2 sources

            case 16: {
                var5_2 /* !! */  = (int)en.fii("fvb", fim(int ), (int)207);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
            case 17: {
                var5_2 /* !! */  = (int)en.fii("fvc", fim(int ), (int)208);
                if (!var6_1) ** GOTO lbl126
                throw null;
            }
            case 18: {
                var5_2 /* !! */  = (int)en.fii("fvd", fim(int ), (int)209);
                if (!var6_1) ** GOTO lbl60
                throw null;
            }
lbl139:
            // 2 sources

            case 19: {
                var5_2 /* !! */  = (int)en.fii("fve", fim(int ), (int)210);
                if (!var6_1) ** GOTO lbl82
                throw null;
            }
            case 20: {
                var5_2 /* !! */  = (int)en.fii("fvf", fim(int ), (int)211);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl148:
            // 2 sources

            case 21: {
                var5_2 /* !! */  = (int)en.fii("fvg", fim(int ), (int)212);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl153:
            // 2 sources

            case 22: {
                var5_2 /* !! */  = (int)en.fii("fvh", fim(int ), (int)213);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl158:
            // 2 sources

            case 23: {
                var5_2 /* !! */  = (int)en.fii("fvi", fim(int ), (int)214);
                if (!var6_1) ** GOTO lbl78
                throw null;
            }
lbl162:
            // 3 sources

            case 24: {
                var5_2 /* !! */  = (int)en.fii("fvj", fim(int ), (int)215);
                if (!var6_1) ** GOTO lbl148
                throw null;
            }
lbl166:
            // 2 sources

            case 25: {
                var5_2 /* !! */  = (int)en.fii("fvk", fim(int ), (int)216);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 26: {
                var5_2 /* !! */  = (int)en.fii("fvl", fim(int ), (int)217);
                if (!var6_1) ** GOTO lbl158
                throw null;
            }
lbl175:
            // 3 sources

            case 27: {
                var5_2 /* !! */  = (int)en.fii("fvm", fim(int ), (int)218);
                if (!var6_1) ** GOTO lbl69
                throw null;
            }
lbl179:
            // 3 sources

            case 28: {
                var5_2 /* !! */  = (int)en.fii("fvn", fim(int ), (int)219);
                if (!var6_1) ** GOTO lbl69
                throw null;
            }
            case 29: {
                var5_2 /* !! */  = (int)en.fii("fvo", fim(int ), (int)220);
                if (!var6_1) ** GOTO lbl98
                throw null;
            }
lbl187:
            // 2 sources

            case 30: {
                var5_2 /* !! */  = (int)en.fii("fvp", fim(int ), (int)221);
                if (!var6_1) ** GOTO lbl166
                throw null;
            }
lbl191:
            // 2 sources

            case 31: {
                var5_2 /* !! */  = (int)en.fii("fvq", fim(int ), (int)222);
                if (!var6_1) ** GOTO lbl60
                throw null;
            }
            case 32: {
                var5_2 /* !! */  = (int)en.fii("fvr", fim(int ), (int)223);
                if (!var6_1) ** GOTO lbl87
                throw null;
            }
            case 33: {
                var5_2 /* !! */  = (int)en.fii("fvs", fim(int ), (int)224);
                if (!var6_1) ** GOTO lbl175
                throw null;
            }
lbl203:
            // 2 sources

            case 34: {
                var5_2 /* !! */  = (int)en.fii("fvt", fim(int ), (int)225);
                if (!var6_1) ** GOTO lbl87
                throw null;
            }
            case 35: 
        }
        var5_2 /* !! */  = (int)en.fii("fvu", fim(int ), (int)226);
        ** while (!var6_1)
lbl210:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ghg() {
        en.fig[300] = 585449782;
        en.fig[301] = -1161235583;
        en.fig[302] = 1307504954;
        en.fig[303] = -546933421;
        en.fig[304] = -736429184;
        en.fig[305] = -833548540;
        en.fig[306] = 1866935495;
        en.fig[307] = 1278104781;
        en.fig[308] = -1171162972;
        en.fig[309] = 325117631;
        en.fig[310] = 1940113546;
        en.fig[311] = -906911965;
        en.fig[312] = 1161365436;
        en.fig[313] = -115378350;
        en.fig[314] = 1556483421;
        en.fig[315] = 1243205924;
        en.fig[316] = -184139501;
        en.fig[317] = 424165976;
        en.fig[318] = -391695200;
        en.fig[319] = -1826749379;
        en.fig[320] = 894768110;
        en.fig[321] = 502675070;
        en.fig[322] = 79046904;
        en.fig[323] = 1744245669;
        en.fig[324] = -1684035829;
        en.fig[325] = 300412181;
        en.fig[326] = 974807974;
        en.fig[327] = -470632789;
        en.fig[328] = 309847803;
        en.fig[329] = -24029246;
        en.fig[330] = -1879627771;
        en.fig[331] = 42533347;
        en.fig[332] = -1441759170;
        en.fig[333] = 1458384722;
        en.fig[334] = 362029382;
        en.fig[335] = -751515468;
        en.fig[336] = -1482008468;
        en.fig[337] = -698738577;
        en.fig[338] = 819713935;
        en.fig[339] = -1204100735;
        en.fig[340] = -1735108622;
        en.fig[341] = 95122916;
        en.fig[342] = 1802594936;
        en.fig[343] = 1423804932;
        en.fig[344] = -605674124;
        en.fig[345] = 522299300;
        en.fig[346] = 480409655;
        en.fig[347] = -444851481;
        en.fig[348] = -1619403482;
        en.fig[349] = 941211268;
        en.fig[350] = -1292132047;
        en.fig[351] = 1549644395;
        en.fig[352] = 1947479591;
        en.fig[353] = 445117271;
        en.fig[354] = 1822892654;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private List<String> getOnlinePlayers() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = en.x - en.fii("gdk", fjc(int ), (int)118)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == en.fii("gdl", fim(int ), (int)322)) break;
            v0 /* !! */  = (long)en.fii("gdm", fim(int ), (int)323);
        }
        var3_1 = en.c;
        v1 /* !! */  = en.x;
        if (true) ** GOTO lbl11
        block55: while (true) {
            v1 /* !! */  = (long)(en.fii("gdo", fjc(int ), (int)120) - en.fii("gdn", fjc(int ), (int)119));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1469943945: {
                    continue block55;
                }
                case 1673900134: {
                    break block55;
                }
            }
            break;
        }
        var2_2 /* !! */  = en.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = en.x - en.fii("gdp", fjc(int ), (int)121)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == en.fii("gdq", fim(int ), (int)324)) break;
            v2 /* !! */  = (long)en.fii("gdr", fim(int ), (int)325);
        }
        var1_3 = en.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = en.x;
                if (true) ** GOTO lbl35
                block58: while (true) {
                    v3 /* !! */  = (long)(en.fii("gdt", fjc(int ), (int)123) - en.fii("gds", fjc(int ), (int)122));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1240952395: {
                            continue block58;
                        }
                        case 1673900134: {
                            break block58;
                        }
                    }
                    break;
                }
                v4 /* !! */  = en.x;
                if (true) ** GOTO lbl44
                block59: while (true) {
                    v4 /* !! */  = (long)(v5 - en.fii("gdu", fjc(int ), (int)124));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -483347222: {
                            v5 = en.fii("gdv", fjc(int ), (int)125);
                            continue block59;
                        }
                        case -157630719: {
                            v5 = en.fii("gdw", fjc(int ), (int)126);
                            continue block59;
                        }
                        case 1673900134: {
                            break block59;
                        }
                    }
                    break;
                }
                v6 = en.mc.field_1724;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = en.x - en.fii("gdx", fjc(int ), (int)127)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == en.fii("gdy", fim(int ), (int)326)) break;
                    v7 /* !! */  = (long)en.fii("gdz", fim(int ), (int)327);
                }
                v8 = v6.field_3944;
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = en.x - en.fii("gea", fjc(int ), (int)128)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == en.fii("geb", fim(int ), (int)328)) break;
                    v9 /* !! */  = (long)en.fii("gec", fim(int ), (int)329);
                }
                v10 = v8.method_2880();
                v11 /* !! */  = en.x;
                if (true) ** GOTO lbl70
                block62: while (true) {
                    v11 /* !! */  = (long)(en.fii("gee", fjc(int ), (int)130) - en.fii("ged", fjc(int ), (int)129));
lbl70:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 1673900134: {
                            break block62;
                        }
                        case 1893038387: {
                            continue block62;
                        }
                    }
                    break;
                }
                v12 = v10.stream();
                v13 /* !! */  = en.x;
                if (true) ** GOTO lbl80
                block63: while (true) {
                    v13 /* !! */  = (long)(v14 - en.fii("gef", fjc(int ), (int)131));
lbl80:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -2092973592: {
                            v14 = en.fii("geg", fjc(int ), (int)132);
                            continue block63;
                        }
                        case 351554685: {
                            v14 = en.fii("geh", fjc(int ), (int)133);
                            continue block63;
                        }
                        case 1591661734: {
                            v14 = en.fii("gei", fjc(int ), (int)134);
                            continue block63;
                        }
                        case 1673900134: {
                            break block63;
                        }
                    }
                    break;
                }
                v15 = (Function<class_640, GameProfile>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, method_2966(), (Lnet/minecraft/class_640;)Lcom/mojang/authlib/GameProfile;)();
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_4 = en.x - en.fii("gej", fjc(int ), (int)135)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == en.fii("gek", fim(int ), (int)330)) break;
                    v16 /* !! */  = (long)en.fii("gel", fim(int ), (int)331);
                }
                v17 = v12.map(v15);
                v18 /* !! */  = en.x;
                if (true) ** GOTO lbl103
                block65: while (true) {
                    v18 /* !! */  = (long)(v19 - en.fii("gem", fjc(int ), (int)136));
lbl103:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -191727715: {
                            v19 = en.fii("gen", fjc(int ), (int)137);
                            continue block65;
                        }
                        case 850118432: {
                            v19 = en.fii("geo", fjc(int ), (int)138);
                            continue block65;
                        }
                        case 1673900134: {
                            break block65;
                        }
                    }
                    break;
                }
                v20 = (Function<GameProfile, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, name(), (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;)();
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_5 = en.x - en.fii("gep", fjc(int ), (int)139)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == en.fii("geq", fim(int ), (int)332)) break;
                    v21 /* !! */  = (long)en.fii("ger", fim(int ), (int)333);
                }
                v22 = v17.map(v20);
                v23 /* !! */  = en.x;
                if (true) ** GOTO lbl123
                block67: while (true) {
                    v23 /* !! */  = (long)(en.fii("get", fjc(int ), (int)141) - en.fii("ges", fjc(int ), (int)140));
lbl123:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -767689289: {
                            continue block67;
                        }
                        case 1673900134: {
                            break block67;
                        }
                    }
                    break;
                }
                v24 = (Predicate<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$getOnlinePlayers$1(java.lang.String ), (Ljava/lang/String;)Z)((en)this);
                v25 /* !! */  = en.x;
                if (true) ** GOTO lbl133
                block68: while (true) {
                    v25 /* !! */  = (long)(v26 - en.fii("geu", fjc(int ), (int)142));
lbl133:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -840856073: {
                            v26 = en.fii("gev", fjc(int ), (int)143);
                            continue block68;
                        }
                        case -126188928: {
                            v26 = en.fii("gew", fjc(int ), (int)144);
                            continue block68;
                        }
                        case 1122692933: {
                            v26 = en.fii("gex", fjc(int ), (int)145);
                            continue block68;
                        }
                        case 1673900134: {
                            break block68;
                        }
                    }
                    break;
                }
                v27 = v22.filter(v24);
                v28 /* !! */  = en.x;
                if (true) ** GOTO lbl150
                block69: while (true) {
                    v28 /* !! */  = (long)(en.fii("gez", fjc(int ), (int)147) - en.fii("gey", fjc(int ), (int)146));
lbl150:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case 701817502: {
                            continue block69;
                        }
                        case 1673900134: {
                            break block69;
                        }
                    }
                    break;
                }
                v29 = Collectors.toList();
                v30 /* !! */  = en.x;
                if (true) ** GOTO lbl160
                block70: while (true) {
                    v30 /* !! */  = (long)(v31 - en.fii("gfa", fjc(int ), (int)148));
lbl160:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case 268999459: {
                            v31 = en.fii("gfb", fjc(int ), (int)149);
                            continue block70;
                        }
                        case 1035636268: {
                            v31 = en.fii("gfc", fjc(int ), (int)150);
                            continue block70;
                        }
                        case 1673900134: {
                            break block70;
                        }
                        case 1809379376: {
                            v31 = en.fii("gfd", fjc(int ), (int)151);
                            continue block70;
                        }
                    }
                    break;
                }
                return v27.collect(v29);
            }
            case 0: {
                var2_2 /* !! */  = (int)en.fii("gfe", fim(int ), (int)334);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
            case 1: {
                var2_2 /* !! */  = (int)en.fii("gff", fim(int ), (int)335);
                if (!var3_1) break;
                throw null;
            }
lbl182:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)en.fii("gfg", fim(int ), (int)336);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)en.fii("gfh", fim(int ), (int)337);
        ** while (!var3_1)
lbl190:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite fii(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int fim(int n2) {
        return fig[n2] ^ fih[n2];
    }

    static {
        fig = new int[355];
        fih = new int[355];
        en.ghd();
        en.ghe();
        en.ghf();
        en.ghg();
        en.ghh();
        en.ghl();
        en.ght();
        en.gia();
        fjd = new long[182];
        fje = new long[182];
        en.gii();
        en.giq();
        en.git();
        en.gjb();
    }

    private static /* synthetic */ void gii() {
        en.fjd[0] = 855230079324394757L;
        en.fjd[1] = 8127908788848601508L;
        en.fjd[2] = -2020337986468370018L;
        en.fjd[3] = 8064273145606277278L;
        en.fjd[4] = 2729234397185865495L;
        en.fjd[5] = -5376606328211208306L;
        en.fjd[6] = 2347814409983519268L;
        en.fjd[7] = 8421386704773919462L;
        en.fjd[8] = 1753758401343774302L;
        en.fjd[9] = -527778157504018737L;
        en.fjd[10] = 3404080738359806120L;
        en.fjd[11] = 6645921930906242134L;
        en.fjd[12] = -7712025666306006446L;
        en.fjd[13] = -3643328671586443199L;
        en.fjd[14] = -4623977935643051125L;
        en.fjd[15] = 5601081489482070022L;
        en.fjd[16] = -2571239843994069305L;
        en.fjd[17] = 6838308326037615407L;
        en.fjd[18] = -596967114595382441L;
        en.fjd[19] = 6981578743400178859L;
        en.fjd[20] = 7547630567887123573L;
        en.fjd[21] = -6504732939098759807L;
        en.fjd[22] = 4836532997160325550L;
        en.fjd[23] = -3339921463189394756L;
        en.fjd[24] = -3959860953252712556L;
        en.fjd[25] = 3022094066421641804L;
        en.fjd[26] = 5177137797133058670L;
        en.fjd[27] = 7767429418289960357L;
        en.fjd[28] = -8945989547443595758L;
        en.fjd[29] = -7832960788366463845L;
        en.fjd[30] = -807081401849831738L;
        en.fjd[31] = 7992263275019628076L;
        en.fjd[32] = -3337697630936859896L;
        en.fjd[33] = -607885510126976178L;
        en.fjd[34] = -1820785161588497423L;
        en.fjd[35] = 5026860809095716746L;
        en.fjd[36] = 3575637384668553937L;
        en.fjd[37] = -3223771240301620566L;
        en.fjd[38] = 4727015182400667387L;
        en.fjd[39] = -3867191326948880768L;
        en.fjd[40] = -7367429788817703518L;
        en.fjd[41] = 4351259030797162980L;
        en.fjd[42] = 5487465816430388506L;
        en.fjd[43] = 1185370310977208722L;
        en.fjd[44] = -1844664408880293217L;
        en.fjd[45] = 3604094637159650077L;
        en.fjd[46] = -973095635471869150L;
        en.fjd[47] = 4288053944957996209L;
        en.fjd[48] = -953290072819940935L;
        en.fjd[49] = -7820650713315908159L;
        en.fjd[50] = -8045211578969167505L;
        en.fjd[51] = 6936572832146743890L;
        en.fjd[52] = -3878971321511268972L;
        en.fjd[53] = 8810798381808626239L;
        en.fjd[54] = 3798151528948390355L;
        en.fjd[55] = 6647563909753804082L;
        en.fjd[56] = -6356967352438972665L;
        en.fjd[57] = -8712023161563101299L;
        en.fjd[58] = 4803643312765297074L;
        en.fjd[59] = -3782895751531960376L;
        en.fjd[60] = -588957713760259706L;
        en.fjd[61] = 8872822609396943351L;
        en.fjd[62] = 6584205100772811016L;
        en.fjd[63] = 6026868476914403186L;
        en.fjd[64] = 86775675344424941L;
        en.fjd[65] = -6349434354326403316L;
        en.fjd[66] = -4631554404391566172L;
        en.fjd[67] = -2934292216876064739L;
        en.fjd[68] = -8662364415689929128L;
        en.fjd[69] = 3193380570514056040L;
        en.fjd[70] = 3910167690466382430L;
        en.fjd[71] = -1131460694705339005L;
        en.fjd[72] = 2441648017387513365L;
        en.fjd[73] = 1192579597480674686L;
        en.fjd[74] = -353173141369259275L;
        en.fjd[75] = 5303846637800207347L;
        en.fjd[76] = 5032633675736951809L;
        en.fjd[77] = 4452378143596282191L;
        en.fjd[78] = 8604132480160113931L;
        en.fjd[79] = -1541358600885249704L;
        en.fjd[80] = -2382405024412494229L;
        en.fjd[81] = -8841170842032819875L;
        en.fjd[82] = 8688515147708160987L;
        en.fjd[83] = 2494722867484903807L;
        en.fjd[84] = 4055910399938826018L;
        en.fjd[85] = -3747430301454965787L;
        en.fjd[86] = 8223246793616973490L;
        en.fjd[87] = 2797629257387044148L;
        en.fjd[88] = 5097908399001070764L;
        en.fjd[89] = -773789197580774969L;
        en.fjd[90] = 5840247474380716424L;
        en.fjd[91] = 4668166203449284637L;
        en.fjd[92] = 8957378915711778414L;
        en.fjd[93] = -1353486218261472879L;
        en.fjd[94] = -3671613253269109028L;
        en.fjd[95] = 5238162957581060520L;
        en.fjd[96] = 6241959712139002818L;
        en.fjd[97] = 1827572902938817192L;
        en.fjd[98] = -7125313778372276860L;
        en.fjd[99] = 8778359225877561418L;
    }

    private static /* synthetic */ void ghf() {
        en.fig[200] = -266615062;
        en.fig[201] = -364486868;
        en.fig[202] = 1132677643;
        en.fig[203] = -750926432;
        en.fig[204] = 103668545;
        en.fig[205] = 1249810526;
        en.fig[206] = 872447766;
        en.fig[207] = -333382631;
        en.fig[208] = 1685818464;
        en.fig[209] = -407041910;
        en.fig[210] = 1561128698;
        en.fig[211] = 768339984;
        en.fig[212] = 1096496820;
        en.fig[213] = -60491301;
        en.fig[214] = 218833952;
        en.fig[215] = -710162464;
        en.fig[216] = 385553754;
        en.fig[217] = 2127920878;
        en.fig[218] = -587598435;
        en.fig[219] = -1363066753;
        en.fig[220] = -256494873;
        en.fig[221] = -2129603602;
        en.fig[222] = -416860105;
        en.fig[223] = 915385431;
        en.fig[224] = 2127965896;
        en.fig[225] = -667387782;
        en.fig[226] = -119221741;
        en.fig[227] = -2091141820;
        en.fig[228] = -1309736381;
        en.fig[229] = 283662044;
        en.fig[230] = -1675759255;
        en.fig[231] = 1232560209;
        en.fig[232] = -480245956;
        en.fig[233] = 1263308132;
        en.fig[234] = -1623037345;
        en.fig[235] = 1741153686;
        en.fig[236] = 515917666;
        en.fig[237] = 863152918;
        en.fig[238] = -1529183348;
        en.fig[239] = 113346780;
        en.fig[240] = -297708268;
        en.fig[241] = -787449937;
        en.fig[242] = 276148485;
        en.fig[243] = -547983686;
        en.fig[244] = -255626414;
        en.fig[245] = -1694001331;
        en.fig[246] = -255130612;
        en.fig[247] = 1945304246;
        en.fig[248] = 2065895553;
        en.fig[249] = -410083204;
        en.fig[250] = -418753783;
        en.fig[251] = 1278319593;
        en.fig[252] = 1972525232;
        en.fig[253] = 526218985;
        en.fig[254] = 1573477989;
        en.fig[255] = -602669063;
        en.fig[256] = -1882735667;
        en.fig[257] = -1044119772;
        en.fig[258] = 115897454;
        en.fig[259] = -1663038075;
        en.fig[260] = 1404211779;
        en.fig[261] = 1450148005;
        en.fig[262] = -1283565244;
        en.fig[263] = 65006658;
        en.fig[264] = 97860499;
        en.fig[265] = -2129377424;
        en.fig[266] = 1402174150;
        en.fig[267] = 1391035660;
        en.fig[268] = 175530136;
        en.fig[269] = 7757089;
        en.fig[270] = -1318016335;
        en.fig[271] = -1985990917;
        en.fig[272] = -1781449025;
        en.fig[273] = -22714186;
        en.fig[274] = 1036381457;
        en.fig[275] = 474924939;
        en.fig[276] = -846784392;
        en.fig[277] = -1729295004;
        en.fig[278] = -1288561796;
        en.fig[279] = -2001883397;
        en.fig[280] = -1592641509;
        en.fig[281] = 1547459234;
        en.fig[282] = 821845204;
        en.fig[283] = 1311461141;
        en.fig[284] = -1877138387;
        en.fig[285] = -472112835;
        en.fig[286] = -1436762695;
        en.fig[287] = 92615125;
        en.fig[288] = 1319560895;
        en.fig[289] = 762658560;
        en.fig[290] = -1446943552;
        en.fig[291] = 1844104709;
        en.fig[292] = -771255102;
        en.fig[293] = 1004879294;
        en.fig[294] = -1303236676;
        en.fig[295] = -742226796;
        en.fig[296] = 1299606895;
        en.fig[297] = -1955541923;
        en.fig[298] = 1171043448;
        en.fig[299] = 2042397163;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ boolean lambda$getOnlinePlayers$1(String var1_1) {
        v0 /* !! */  = en.x;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(en.fii("gfj", fjc(int ), (int)153) - en.fii("gfi", fjc(int ), (int)152));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1673900134: {
                    break block26;
                }
                case 1767943173: {
                    continue block26;
                }
            }
            break;
        }
        var4_2 = en.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = en.x - en.fii("gfk", fjc(int ), (int)154)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == en.fii("gfl", fim(int ), (int)338)) break;
            v1 /* !! */  = (long)en.fii("gfm", fim(int ), (int)339);
        }
        var3_3 /* !! */  = en.b;
        v2 /* !! */  = en.x;
        if (true) ** GOTO lbl22
        block28: while (true) {
            v2 /* !! */  = (long)(v3 - en.fii("gfn", fjc(int ), (int)155));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1062842746: {
                    v3 = en.fii("gfo", fjc(int ), (int)156);
                    continue block28;
                }
                case -333048475: {
                    v3 = en.fii("gfp", fjc(int ), (int)157);
                    continue block28;
                }
                case 94024329: {
                    v3 = en.fii("gfq", fjc(int ), (int)158);
                    continue block28;
                }
                case 1673900134: {
                    break block28;
                }
            }
            break;
        }
        var2_4 = en.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
                    return (boolean)en.fii("gfr", fim(int ), (int)340);
                }
                if (var2_4 || var2_4) ** continue;
                v4 /* !! */  = en.x;
                if (true) ** GOTO lbl47
                block30: while (true) {
                    v4 /* !! */  = (long)(v5 - en.fii("gfs", fjc(int ), (int)159));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1437792563: {
                            v5 = en.fii("gft", fjc(int ), (int)160);
                            continue block30;
                        }
                        case -936954166: {
                            v5 = en.fii("gfu", fjc(int ), (int)161);
                            continue block30;
                        }
                        case 1673900134: {
                            break block30;
                        }
                    }
                    break;
                }
                v6 /* !! */  = en.x;
                if (true) ** GOTO lbl60
                block31: while (true) {
                    v6 /* !! */  = (long)(v7 - en.fii("gfv", fjc(int ), (int)162));
lbl60:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1269461181: {
                            v7 = en.fii("gfw", fjc(int ), (int)163);
                            continue block31;
                        }
                        case 1106385052: {
                            v7 = en.fii("gfx", fjc(int ), (int)164);
                            continue block31;
                        }
                        case 1673900134: {
                            break block31;
                        }
                    }
                    break;
                }
                v8 = this.pattern.matcher(var1_1);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_1 = en.x - en.fii("gfy", fjc(int ), (int)165)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == en.fii("gfz", fim(int ), (int)341)) break;
                    v9 /* !! */  = (long)en.fii("gga", fim(int ), (int)342);
                }
                return v8.matches();
            }
lbl77:
            // 2 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)en.fii("ggb", fim(int ), (int)343);
                } while (!var4_2);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)en.fii("ggc", fim(int ), (int)344);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)en.fii("ggd", fim(int ), (int)345);
                if (!var4_2) ** GOTO lbl77
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)en.fii("gge", fim(int ), (int)346);
        ** while (!var4_2)
lbl94:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = en.x - en.fii("flo", fjc(int ), (int)33)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == en.fii("flp", fim(int ), (int)46)) break;
            v0 /* !! */  = (long)en.fii("flq", fim(int ), (int)47);
        }
        var4_2 = en.c;
        v1 /* !! */  = en.x;
        if (true) ** GOTO lbl11
        block38: while (true) {
            v1 /* !! */  = (long)(en.fii("fls", fjc(int ), (int)35) - en.fii("flr", fjc(int ), (int)34));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1162414986: {
                    continue block38;
                }
                case 1673900134: {
                    break block38;
                }
            }
            break;
        }
        var3_3 /* !! */  = en.b;
        v2 /* !! */  = en.x;
        if (true) ** GOTO lbl21
        block39: while (true) {
            v2 /* !! */  = (long)(v3 - en.fii("flt", fjc(int ), (int)36));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1108249287: {
                    v3 = en.fii("flu", fjc(int ), (int)37);
                    continue block39;
                }
                case 531802824: {
                    v3 = en.fii("flv", fjc(int ), (int)38);
                    continue block39;
                }
                case 1673900134: {
                    break block39;
                }
                case 1923081222: {
                    v3 = en.fii("flw", fjc(int ), (int)39);
                    continue block39;
                }
            }
            break;
        }
        var2_4 = en.a;
        if (var4_2) {
            throw null;
lbl36:
            // 7 sources

            return;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl36
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = en.x - en.fii("flx", fjc(int ), (int)40)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == en.fii("fly", fim(int ), (int)48)) break;
                    v4 /* !! */  = (long)en.fii("flz", fim(int ), (int)49);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = en.x - en.fii("fma", fjc(int ), (int)41)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == en.fii("fmb", fim(int ), (int)50)) break;
                    v5 /* !! */  = (long)en.fii("fmc", fim(int ), (int)51);
                }
                if (en.mc.field_1724 == null) ** GOTO lbl70
                if (var2_4) ** GOTO lbl36
                v6 /* !! */  = en.x;
                if (true) ** GOTO lbl58
                block43: while (true) {
                    v6 /* !! */  = (long)(en.fii("fme", fjc(int ), (int)43) - en.fii("fmd", fjc(int ), (int)42));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1706082796: {
                            continue block43;
                        }
                        case 1673900134: {
                            break block43;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = en.x - en.fii("fmf", fjc(int ), (int)44)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == en.fii("fmg", fim(int ), (int)52)) break;
                    v7 /* !! */  = (long)en.fii("fmh", fim(int ), (int)53);
                }
                if (en.mc.field_1687 != null) ** GOTO lbl72
                if (var2_4) ** GOTO lbl36
lbl70:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl36
                return;
lbl72:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl36
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = en.x - en.fii("fmi", fjc(int ), (int)45)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == en.fii("fmj", fim(int ), (int)54)) break;
                    v8 /* !! */  = (long)en.fii("fmk", fim(int ), (int)55);
                }
                this.handleDuelLogic();
                if (var2_4 || var2_4) ** GOTO lbl36
                v9 /* !! */  = en.x;
                if (true) ** GOTO lbl84
                block46: while (true) {
                    v9 /* !! */  = (long)(v10 - en.fii("fml", fjc(int ), (int)46));
lbl84:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1733423289: {
                            v10 = en.fii("fmm", fjc(int ), (int)47);
                            continue block46;
                        }
                        case -1153340356: {
                            v10 = en.fii("fmn", fjc(int ), (int)48);
                            continue block46;
                        }
                        case 1534455426: {
                            v10 = en.fii("fmo", fjc(int ), (int)49);
                            continue block46;
                        }
                        case 1673900134: {
                            break block46;
                        }
                    }
                    break;
                }
                this.handleScreenInteraction();
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl100:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)en.fii("fmp", fim(int ), (int)56);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl161
            }
            case 1: {
                var3_3 /* !! */  = (int)en.fii("fmq", fim(int ), (int)57);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl110:
            // 3 sources

            case 2: {
                var3_3 /* !! */  = (int)en.fii("fmr", fim(int ), (int)58);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 3: {
                var3_3 /* !! */  = (int)en.fii("fms", fim(int ), (int)59);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl120:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)en.fii("fmt", fim(int ), (int)60);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl144
            }
            case 5: {
                var3_3 /* !! */  = (int)en.fii("fmu", fim(int ), (int)61);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl130:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)en.fii("fmv", fim(int ), (int)62);
                    if (!var4_2) ** GOTO lbl110
                    throw null;
                }
            }
            case 7: {
                do {
                    var3_3 /* !! */  = (int)en.fii("fmw", fim(int ), (int)63);
                } while (!var4_2);
                throw null;
            }
lbl140:
            // 3 sources

            case 8: {
                var3_3 /* !! */  = (int)en.fii("fmx", fim(int ), (int)64);
                if (!var4_2) ** GOTO lbl110
                throw null;
            }
lbl144:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)en.fii("fmy", fim(int ), (int)65);
                if (!var4_2) ** GOTO lbl100
                throw null;
            }
            case 10: {
                var3_3 /* !! */  = (int)en.fii("fmz", fim(int ), (int)66);
                if (!var4_2) ** GOTO lbl130
                throw null;
            }
            case 11: {
                var3_3 /* !! */  = (int)en.fii("fna", fim(int ), (int)67);
                if (!var4_2) ** GOTO lbl100
                throw null;
            }
            case 12: {
                do {
                    var3_3 /* !! */  = (int)en.fii("fnb", fim(int ), (int)68);
                } while (!var4_2);
                throw null;
            }
lbl161:
            // 3 sources

            case 13: {
                var3_3 /* !! */  = (int)en.fii("fnc", fim(int ), (int)69);
                if (!var4_2) ** GOTO lbl120
                throw null;
            }
            case 14: 
        }
        var3_3 /* !! */  = (int)en.fii("fnd", fim(int ), (int)70);
        ** while (!var4_2)
lbl168:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ double fpn(int n2) {
        return Double.longBitsToDouble(fjd[n2] ^ fje[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleDuelLogic() {
        block98: {
            block97: {
                var8_1 = en.c;
                var7_2 /* !! */  = en.b;
                var6_3 = en.a;
                if (var8_1) {
                    throw null;
lbl6:
                    // 26 sources

                    return;
                }
                if (var6_3 || var6_3) ** GOTO lbl6
                var1_4 = this.getOnlinePlayers();
                if (var6_3 || var6_3) ** GOTO lbl6
                var2_5 = Math.sqrt(Math.pow(this.lastPosX - en.mc.field_1724.method_23317(), (double)en.fii("fpo", fpn(int ), (int)78)) + Math.pow(this.lastPosY - en.mc.field_1724.method_23318(), (double)en.fii("fpp", fpn(int ), (int)79)) + Math.pow(this.lastPosZ - en.mc.field_1724.method_23321(), (double)en.fii("fpq", fpn(int ), (int)80)));
                if (var6_3 || var6_3) ** GOTO lbl6
                if (!(var2_5 > en.fii("fpr", fpn(int ), (int)81))) break block97;
                if (var6_3 || var6_3) ** GOTO lbl6
                this.setState((boolean)en.fii("fps", fim(int ), (int)104));
                if (var6_3 || var6_3) ** GOTO lbl6
                return;
            }
            if (var6_3 || var6_3) ** GOTO lbl6
            this.lastPosX = en.mc.field_1724.method_23317();
            if (var6_3 || var6_3) ** GOTO lbl6
            this.lastPosY = en.mc.field_1724.method_23318();
            if (var6_3 || var6_3) ** GOTO lbl6
            this.lastPosZ = en.mc.field_1724.method_23321();
            if (var6_3 || var6_3) ** GOTO lbl6
            if (!this.counter2.hasTimeElapsed((long)(en.fii("fpt", fjc(int ), (int)82) * (long)var1_4.size()))) break block98;
            if (var6_3 || var6_3) ** GOTO lbl6
            this.sent.clear();
            if (var6_3 || var6_3) ** GOTO lbl6
            this.counter2.resetCounter();
            if (var6_3) ** GOTO lbl6
        }
        if (var6_3 || var6_3) ** GOTO lbl6
        var4_6 = var1_4.iterator();
        if (var6_3) ** GOTO lbl6
        block51: while (true) {
            if (var6_3 || var6_3) ** GOTO lbl6
            if (!var4_6.hasNext()) ** GOTO lbl62
            if (var6_3) ** GOTO lbl6
            var5_7 = var4_6.next();
            if (var6_3 || var6_3) ** GOTO lbl6
            if (this.sent.contains(var5_7)) ** GOTO lbl59
            if (var6_3) ** GOTO lbl6
            if (var5_7.equals(en.mc.field_1724.method_7334().name())) ** GOTO lbl59
            if (var6_3 || var6_3) ** GOTO lbl6
            if (!this.counter.hasTimeElapsed((long)this.slowTime.getValue())) ** GOTO lbl59
            if (var6_3 || var6_3) ** GOTO lbl6
            this.sendDuelRequest(var5_7);
            if (var6_3 || var6_3) ** GOTO lbl6
            this.sent.add(var5_7);
            if (var6_3) ** GOTO lbl6
            if (var7_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var7_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var6_3) ** GOTO lbl6
                    this.counter.resetCounter();
                    if (var6_3) ** GOTO lbl6
lbl59:
                    // 4 sources

                    if (var6_3 || var6_3) ** GOTO lbl6
                    if (!var8_1) continue block51;
                    throw null;
                }
lbl62:
                // 1 sources

                if (!var6_3 && !var6_3) ** break;
                ** continue;
                return;
lbl65:
                // 2 sources

                case 0: {
                    var7_2 /* !! */  = (int)en.fii("fpu", fim(int ), (int)105);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl225
                }
lbl70:
                // 2 sources

                case 1: {
                    var7_2 /* !! */  = (int)en.fii("fpv", fim(int ), (int)106);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl259
                }
                case 2: {
                    var7_2 /* !! */  = (int)en.fii("fpw", fim(int ), (int)107);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl271
                }
lbl80:
                // 2 sources

                case 3: {
                    var7_2 /* !! */  = (int)en.fii("fpx", fim(int ), (int)108);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl221
                }
                case 4: {
                    var7_2 /* !! */  = (int)en.fii("fpy", fim(int ), (int)109);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl180
                }
lbl90:
                // 2 sources

                case 5: {
                    var7_2 /* !! */  = (int)en.fii("fpz", fim(int ), (int)110);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl229
                }
                case 6: {
                    var7_2 /* !! */  = (int)en.fii("fqa", fim(int ), (int)111);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl149
                }
lbl100:
                // 2 sources

                case 7: {
                    var7_2 /* !! */  = (int)en.fii("fqb", fim(int ), (int)112);
                    if (!var8_1) ** GOTO lbl70
                    throw null;
                }
lbl104:
                // 2 sources

                case 8: {
                    var7_2 /* !! */  = (int)en.fii("fqc", fim(int ), (int)113);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl163
                }
                case 9: {
                    var7_2 /* !! */  = (int)en.fii("fqd", fim(int ), (int)114);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl237
                }
                case 10: {
                    var7_2 /* !! */  = (int)en.fii("fqe", fim(int ), (int)115);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl213
                }
lbl119:
                // 3 sources

                case 11: {
                    var7_2 /* !! */  = (int)en.fii("fqf", fim(int ), (int)116);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl189
                }
                case 12: {
                    var7_2 /* !! */  = (int)en.fii("fqg", fim(int ), (int)117);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl225
                }
lbl129:
                // 2 sources

                case 13: {
                    var7_2 /* !! */  = (int)en.fii("fqh", fim(int ), (int)118);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl171
                }
lbl134:
                // 2 sources

                case 14: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var7_2 /* !! */  = (int)en.fii("fqi", fim(int ), (int)119);
                        if (var8_1) {
                            throw null;
                        }
                        ** GOTO lbl251
                        break;
                    }
                }
lbl140:
                // 3 sources

                case 15: {
                    var7_2 /* !! */  = (int)en.fii("fqj", fim(int ), (int)120);
                    if (!var8_1) ** GOTO lbl129
                    throw null;
                }
lbl144:
                // 2 sources

                case 16: {
                    var7_2 /* !! */  = (int)en.fii("fqk", fim(int ), (int)121);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl221
                }
lbl149:
                // 3 sources

                case 17: {
                    var7_2 /* !! */  = (int)en.fii("fql", fim(int ), (int)122);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl217
                }
                case 18: {
                    var7_2 /* !! */  = (int)en.fii("fqm", fim(int ), (int)123);
                    if (!var8_1) ** GOTO lbl134
                    throw null;
                }
lbl158:
                // 2 sources

                case 19: {
                    do {
                        var7_2 /* !! */  = (int)en.fii("fqn", fim(int ), (int)124);
                    } while (!var8_1);
                    throw null;
                }
lbl163:
                // 3 sources

                case 20: {
                    var7_2 /* !! */  = (int)en.fii("fqo", fim(int ), (int)125);
                    if (!var8_1) ** GOTO lbl104
                    throw null;
                }
                case 21: {
                    var7_2 /* !! */  = (int)en.fii("fqp", fim(int ), (int)126);
                    if (!var8_1) ** GOTO lbl80
                    throw null;
                }
lbl171:
                // 2 sources

                case 22: {
                    var7_2 /* !! */  = (int)en.fii("fqq", fim(int ), (int)127);
                    if (!var8_1) ** GOTO lbl100
                    throw null;
                }
                case 23: {
                    var7_2 /* !! */  = (int)en.fii("fqr", fim(int ), (int)128);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl221
                }
lbl180:
                // 2 sources

                case 24: {
                    var7_2 /* !! */  = (int)en.fii("fqs", fim(int ), (int)129);
                    if (!var8_1) ** GOTO lbl65
                    throw null;
                }
                case 25: {
                    var7_2 /* !! */  = (int)en.fii("fqt", fim(int ), (int)130);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl193
                }
lbl189:
                // 2 sources

                case 26: {
                    var7_2 /* !! */  = (int)en.fii("fqu", fim(int ), (int)131);
                    if (!var8_1) ** GOTO lbl140
                    throw null;
                }
lbl193:
                // 2 sources

                case 27: {
                    var7_2 /* !! */  = (int)en.fii("fqv", fim(int ), (int)132);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl267
                }
lbl198:
                // 3 sources

                case 28: {
                    var7_2 /* !! */  = (int)en.fii("fqw", fim(int ), (int)133);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl233
                }
                case 29: {
                    do {
                        var7_2 /* !! */  = (int)en.fii("fqx", fim(int ), (int)134);
                    } while (!var8_1);
                    throw null;
                }
                case 30: {
                    var7_2 /* !! */  = (int)en.fii("fqy", fim(int ), (int)135);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl263
                }
lbl213:
                // 2 sources

                case 31: {
                    var7_2 /* !! */  = (int)en.fii("fqz", fim(int ), (int)136);
                    if (!var8_1) ** GOTO lbl149
                    throw null;
                }
lbl217:
                // 3 sources

                case 32: {
                    var7_2 /* !! */  = (int)en.fii("fra", fim(int ), (int)137);
                    if (!var8_1) ** GOTO lbl119
                    throw null;
                }
lbl221:
                // 4 sources

                case 33: {
                    var7_2 /* !! */  = (int)en.fii("frb", fim(int ), (int)138);
                    if (!var8_1) ** GOTO lbl163
                    throw null;
                }
lbl225:
                // 5 sources

                case 34: {
                    var7_2 /* !! */  = (int)en.fii("frc", fim(int ), (int)139);
                    if (!var8_1) ** GOTO lbl158
                    throw null;
                }
lbl229:
                // 2 sources

                case 35: {
                    var7_2 /* !! */  = (int)en.fii("frd", fim(int ), (int)140);
                    if (!var8_1) ** GOTO lbl90
                    throw null;
                }
lbl233:
                // 2 sources

                case 36: {
                    var7_2 /* !! */  = (int)en.fii("fre", fim(int ), (int)141);
                    if (!var8_1) ** GOTO lbl217
                    throw null;
                }
lbl237:
                // 2 sources

                case 37: {
                    var7_2 /* !! */  = (int)en.fii("frf", fim(int ), (int)142);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl267
                }
                case 38: {
                    var7_2 /* !! */  = (int)en.fii("frg", fim(int ), (int)143);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl271
                }
                case 39: {
                    var7_2 /* !! */  = (int)en.fii("frh", fim(int ), (int)144);
                    if (!var8_1) ** GOTO lbl198
                    throw null;
                }
lbl251:
                // 2 sources

                case 40: {
                    var7_2 /* !! */  = (int)en.fii("fri", fim(int ), (int)145);
                    if (!var8_1) ** GOTO lbl144
                    throw null;
                }
lbl255:
                // 2 sources

                case 41: {
                    var7_2 /* !! */  = (int)en.fii("frj", fim(int ), (int)146);
                    if (!var8_1) ** GOTO lbl119
                    throw null;
                }
lbl259:
                // 2 sources

                case 42: {
                    var7_2 /* !! */  = (int)en.fii("frk", fim(int ), (int)147);
                    if (!var8_1) ** GOTO lbl225
                    throw null;
                }
lbl263:
                // 2 sources

                case 43: {
                    var7_2 /* !! */  = (int)en.fii("frl", fim(int ), (int)148);
                    if (!var8_1) ** GOTO lbl225
                    throw null;
                }
lbl267:
                // 3 sources

                case 44: {
                    var7_2 /* !! */  = (int)en.fii("frm", fim(int ), (int)149);
                    if (!var8_1) ** GOTO lbl255
                    throw null;
                }
lbl271:
                // 3 sources

                case 45: {
                    var7_2 /* !! */  = (int)en.fii("frn", fim(int ), (int)150);
                    if (!var8_1) ** GOTO lbl198
                    throw null;
                }
                case 46: {
                    var7_2 /* !! */  = (int)en.fii("fro", fim(int ), (int)151);
                    if (!var8_1) ** GOTO lbl140
                    throw null;
                }
                case 47: 
            }
            break;
        }
        var7_2 /* !! */  = (int)en.fii("frp", fim(int ), (int)152);
        ** while (!var8_1)
lbl282:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gjb() {
        en.fje[100] = 6487333697387538711L;
        en.fje[101] = -2921053026952382097L;
        en.fje[102] = 3108536235342622788L;
        en.fje[103] = 2900622547098261153L;
        en.fje[104] = 7507732971177576489L;
        en.fje[105] = -4748408149058107926L;
        en.fje[106] = 7124726300864568889L;
        en.fje[107] = 3868806862053795354L;
        en.fje[108] = -2402227373191681719L;
        en.fje[109] = -4288897108873091180L;
        en.fje[110] = 5309806393302736023L;
        en.fje[111] = 3627752650012020742L;
        en.fje[112] = 3629904406410092086L;
        en.fje[113] = -833231884600263614L;
        en.fje[114] = -792193837722091840L;
        en.fje[115] = -2597040572938660568L;
        en.fje[116] = 2158401465114476887L;
        en.fje[117] = -5397711679718577428L;
        en.fje[118] = -13740096359701600L;
        en.fje[119] = 1166700955643770725L;
        en.fje[120] = 7884125209308360470L;
        en.fje[121] = 2591913659476765865L;
        en.fje[122] = 4607632695330265204L;
        en.fje[123] = -1458564892337851580L;
        en.fje[124] = 8138987945675629767L;
        en.fje[125] = -1163041946926841562L;
        en.fje[126] = -2362087668674978541L;
        en.fje[127] = -3254873018465824272L;
        en.fje[128] = -167758921835930200L;
        en.fje[129] = -6041425297817078179L;
        en.fje[130] = 453425564177380939L;
        en.fje[131] = -8231567631279024261L;
        en.fje[132] = 8727953822419486586L;
        en.fje[133] = 7170825182379447904L;
        en.fje[134] = -8996334305953412421L;
        en.fje[135] = 2726916546663548974L;
        en.fje[136] = -1954510875921764125L;
        en.fje[137] = 2812343227748940113L;
        en.fje[138] = -5471755087046078554L;
        en.fje[139] = -7030627624677677810L;
        en.fje[140] = 2106385385390777300L;
        en.fje[141] = 8664174635968088728L;
        en.fje[142] = -5649418371470634151L;
        en.fje[143] = 8804109507249218929L;
        en.fje[144] = 4060301397052875326L;
        en.fje[145] = 7491264286572484882L;
        en.fje[146] = 847835832618183556L;
        en.fje[147] = -1240971465723527885L;
        en.fje[148] = -8160580993703881410L;
        en.fje[149] = 937362911104677106L;
        en.fje[150] = -7218594854376528248L;
        en.fje[151] = -7942522801815193628L;
        en.fje[152] = -8944855032069937199L;
        en.fje[153] = -7609372916564124847L;
        en.fje[154] = 489784350018725439L;
        en.fje[155] = 8269416749941856192L;
        en.fje[156] = 9109922321925897563L;
        en.fje[157] = 2241630014649087905L;
        en.fje[158] = -5604761632284608603L;
        en.fje[159] = -3607860303025895888L;
        en.fje[160] = 413471862095753256L;
        en.fje[161] = -2694004306554257302L;
        en.fje[162] = 5655012521663029617L;
        en.fje[163] = -4149560353077833185L;
        en.fje[164] = 8538697565314556476L;
        en.fje[165] = 7559499924756870303L;
        en.fje[166] = -3455988969794321393L;
        en.fje[167] = -8371335311436487260L;
        en.fje[168] = 2016148106437253111L;
        en.fje[169] = -5599458008242912430L;
        en.fje[170] = 8705308118273960264L;
        en.fje[171] = -6042478207535421819L;
        en.fje[172] = -3614322223382784411L;
        en.fje[173] = -7072806208149604449L;
        en.fje[174] = 6039474669454938837L;
        en.fje[175] = 3781763310851888105L;
        en.fje[176] = -5013152114514032809L;
        en.fje[177] = 7387265092119588218L;
        en.fje[178] = 1001527901120767155L;
        en.fje[179] = 4474236374573754608L;
        en.fje[180] = 6564279335389231739L;
        en.fje[181] = 9208472646413192968L;
    }

    private static /* synthetic */ void ghh() {
        en.fih[0] = -1662599244;
        en.fih[1] = -47880353;
        en.fih[2] = 1289920798;
        en.fih[3] = 1291372922;
        en.fih[4] = -1632635968;
        en.fih[5] = -1217867642;
        en.fih[6] = 1784744186;
        en.fih[7] = 1846417167;
        en.fih[8] = 45251296;
        en.fih[9] = -1777848775;
        en.fih[10] = -2011879581;
        en.fih[11] = -87349380;
        en.fih[12] = -321784864;
        en.fih[13] = 710579636;
        en.fih[14] = -151745929;
        en.fih[15] = -151814461;
        en.fih[16] = 502555860;
        en.fih[17] = -461583281;
        en.fih[18] = 1118462694;
        en.fih[19] = 2130598798;
        en.fih[20] = -2032330467;
        en.fih[21] = 1100858180;
        en.fih[22] = -2061136246;
        en.fih[23] = 1183287432;
        en.fih[24] = -1727445525;
        en.fih[25] = -1381880918;
        en.fih[26] = 1999302934;
        en.fih[27] = 2020577642;
        en.fih[28] = -904420424;
        en.fih[29] = 51488925;
        en.fih[30] = 964657903;
        en.fih[31] = -1068571307;
        en.fih[32] = 850519949;
        en.fih[33] = -919591608;
        en.fih[34] = 1622127474;
        en.fih[35] = -257771580;
        en.fih[36] = 609535916;
        en.fih[37] = -537218569;
        en.fih[38] = 1846436157;
        en.fih[39] = 776943730;
        en.fih[40] = 130393279;
        en.fih[41] = 971647131;
        en.fih[42] = -1966932001;
        en.fih[43] = 339671273;
        en.fih[44] = -10744289;
        en.fih[45] = 5969206;
        en.fih[46] = 1613231219;
        en.fih[47] = -1513609689;
        en.fih[48] = 1055898364;
        en.fih[49] = -232076738;
        en.fih[50] = -401281113;
        en.fih[51] = 1556997829;
        en.fih[52] = 2016928528;
        en.fih[53] = 1436526172;
        en.fih[54] = 1048754961;
        en.fih[55] = 1187700161;
        en.fih[56] = 1075385917;
        en.fih[57] = 124266283;
        en.fih[58] = 1912209013;
        en.fih[59] = -91993907;
        en.fih[60] = 1218413535;
        en.fih[61] = 1276951947;
        en.fih[62] = -179420964;
        en.fih[63] = -1502960603;
        en.fih[64] = -180501484;
        en.fih[65] = 435871325;
        en.fih[66] = 2068055334;
        en.fih[67] = -1041056575;
        en.fih[68] = -718062547;
        en.fih[69] = 784106359;
        en.fih[70] = 127822588;
        en.fih[71] = 1395387734;
        en.fih[72] = -2007995529;
        en.fih[73] = -1713800851;
        en.fih[74] = 1025553880;
        en.fih[75] = -109761250;
        en.fih[76] = 2024035368;
        en.fih[77] = -2033016915;
        en.fih[78] = 915068190;
        en.fih[79] = 1179158468;
        en.fih[80] = -1861574554;
        en.fih[81] = -676388132;
        en.fih[82] = 2126012932;
        en.fih[83] = -88985347;
        en.fih[84] = -1863236571;
        en.fih[85] = -314374432;
        en.fih[86] = 1798559377;
        en.fih[87] = 359543755;
        en.fih[88] = -1711314097;
        en.fih[89] = -648357550;
        en.fih[90] = -737752871;
        en.fih[91] = 852277774;
        en.fih[92] = -1049784726;
        en.fih[93] = -690266219;
        en.fih[94] = -490910909;
        en.fih[95] = -717739415;
        en.fih[96] = -661604336;
        en.fih[97] = 471240712;
        en.fih[98] = 1940404693;
        en.fih[99] = -2126135749;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPacket(cr var1_1) {
        v0 /* !! */  = en.x;
        if (true) ** GOTO lbl5
        block63: while (true) {
            v0 /* !! */  = (long)(v1 - en.fii("fne", fjc(int ), (int)50));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 389514930: {
                    v1 = en.fii("fnf", fjc(int ), (int)51);
                    continue block63;
                }
                case 784918362: {
                    v1 = en.fii("fng", fjc(int ), (int)52);
                    continue block63;
                }
                case 1630874950: {
                    v1 = en.fii("fnh", fjc(int ), (int)53);
                    continue block63;
                }
                case 1673900134: {
                    break block63;
                }
            }
            break;
        }
        var6_2 = en.c;
        v2 /* !! */  = en.x;
        if (true) ** GOTO lbl22
        block64: while (true) {
            v2 /* !! */  = (long)(v3 - en.fii("fni", fjc(int ), (int)54));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -192244882: {
                    v3 = en.fii("fnj", fjc(int ), (int)55);
                    continue block64;
                }
                case 1673900134: {
                    break block64;
                }
                case 1798709423: {
                    v3 = en.fii("fnk", fjc(int ), (int)56);
                    continue block64;
                }
            }
            break;
        }
        var5_3 /* !! */  = en.b;
        v4 /* !! */  = en.x;
        if (true) ** GOTO lbl36
        block65: while (true) {
            v4 /* !! */  = (long)(v5 - en.fii("fnl", fjc(int ), (int)57));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1791306699: {
                    v5 = en.fii("fnm", fjc(int ), (int)58);
                    continue block65;
                }
                case -1393524768: {
                    v5 = en.fii("fnn", fjc(int ), (int)59);
                    continue block65;
                }
                case 1673900134: {
                    break block65;
                }
            }
            break;
        }
        var4_4 = en.a;
        if (var6_2) {
            throw null;
lbl48:
            // 14 sources

            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl48
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_0 = en.x - en.fii("fno", fjc(int ), (int)60)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == en.fii("fnp", fim(int ), (int)71)) break;
            v6 /* !! */  = (long)en.fii("fnq", fim(int ), (int)72);
        }
        v7 = var1_1.getType();
        v8 /* !! */  = en.x;
        if (true) ** GOTO lbl61
        block68: while (true) {
            v8 /* !! */  = (long)(en.fii("fns", fjc(int ), (int)62) - en.fii("fnr", fjc(int ), (int)61));
lbl61:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case 1673900134: {
                    break block68;
                }
                case 1745633477: {
                    continue block68;
                }
            }
            break;
        }
        if (v7 != cr$Type.RECEIVE) ** GOTO lbl160
        if (var4_4) ** GOTO lbl48
        v9 /* !! */  = en.x;
        if (true) ** GOTO lbl72
        block69: while (true) {
            v9 /* !! */  = (long)(en.fii("fnu", fjc(int ), (int)64) - en.fii("fnt", fjc(int ), (int)63));
lbl72:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1435708982: {
                    continue block69;
                }
                case 1673900134: {
                    break block69;
                }
            }
            break;
        }
        var3_5 = var1_1.getPacket();
        if (var4_4) ** GOTO lbl48
        if (!(var3_5 instanceof class_7439)) ** GOTO lbl160
        if (var4_4) ** GOTO lbl48
        var2_6 = (class_7439)var3_5;
        if (var4_4 || var4_4) ** GOTO lbl48
        v10 /* !! */  = en.x;
        if (true) ** GOTO lbl87
        block70: while (true) {
            v10 /* !! */  = (long)(en.fii("fnw", fjc(int ), (int)66) - en.fii("fnv", fjc(int ), (int)65));
lbl87:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case 1673900134: {
                    break block70;
                }
                case 2126513593: {
                    continue block70;
                }
            }
            break;
        }
        v11 = var2_6.comp_763();
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_1 = en.x - en.fii("fnx", fjc(int ), (int)67)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == en.fii("fny", fim(int ), (int)73)) break;
            v12 /* !! */  = (long)en.fii("fnz", fim(int ), (int)74);
        }
        var3_5 = v11.getString();
        if (var4_4 || var4_4) ** GOTO lbl48
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_2 = en.x - en.fii("foa", fjc(int ), (int)68)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == en.fii("fob", fim(int ), (int)75)) break;
            v13 /* !! */  = (long)en.fii("foc", fim(int ), (int)76);
        }
        if (!var3_5.contains("\u043d\u0430\u0447\u0430\u043b\u043e")) ** GOTO lbl135
        if (var4_4) ** GOTO lbl48
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_3 = en.x - en.fii("fod", fjc(int ), (int)69)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == en.fii("foe", fim(int ), (int)77)) break;
                    v14 /* !! */  = (long)en.fii("fof", fim(int ), (int)78);
                }
                if (!var3_5.contains("\u0447\u0435\u0440\u0435\u0437")) ** GOTO lbl135
                if (var4_4) ** GOTO lbl48
                v15 /* !! */  = en.x;
                if (true) ** GOTO lbl121
                block74: while (true) {
                    v15 /* !! */  = (long)(v16 - en.fii("fog", fjc(int ), (int)70));
lbl121:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1034813787: {
                            v16 = en.fii("foh", fjc(int ), (int)71);
                            continue block74;
                        }
                        case -771760276: {
                            v16 = en.fii("foi", fjc(int ), (int)72);
                            continue block74;
                        }
                        case 1673900134: {
                            break block74;
                        }
                        case 2038726274: {
                            v16 = en.fii("foj", fjc(int ), (int)73);
                            continue block74;
                        }
                    }
                    break;
                }
                if (var3_5.contains("\u0441\u0435\u043a\u0443\u043d\u0434!")) ** GOTO lbl151
                if (var4_4) ** GOTO lbl48
lbl135:
                // 3 sources

                if (var4_4 || var4_4) ** GOTO lbl48
                v17 /* !! */  = en.x;
                if (true) ** GOTO lbl140
                block75: while (true) {
                    v17 /* !! */  = (long)(v18 - en.fii("fok", fjc(int ), (int)74));
lbl140:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -422534854: {
                            v18 = en.fii("fol", fjc(int ), (int)75);
                            continue block75;
                        }
                        case 1295085393: {
                            v18 = en.fii("fom", fjc(int ), (int)76);
                            continue block75;
                        }
                        case 1673900134: {
                            break block75;
                        }
                    }
                    break;
                }
                if (!var3_5.contains("\u0434\u0443\u044d\u043b\u0438 \u00bb \u0432\u043e \u0432\u0440\u0435\u043c\u044f \u043f\u043e\u0435\u0434\u0438\u043d\u043a\u0430 \u0437\u0430\u043f\u0440\u0435\u0449\u0435\u043d\u043e \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u043a\u043e\u043c\u0430\u043d\u0434\u044b")) ** GOTO lbl160
                if (var4_4) ** GOTO lbl48
lbl151:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl48
                v19 = en.fii("fon", fim(int ), (int)79);
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_4 = en.x - en.fii("foo", fjc(int ), (int)77)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == en.fii("fop", fim(int ), (int)80)) break;
                    v20 /* !! */  = (long)en.fii("foq", fim(int ), (int)81);
                }
                this.setState((boolean)v19);
                if (var4_4) ** GOTO lbl48
lbl160:
                // 4 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var5_3 /* !! */  = (int)en.fii("for", fim(int ), (int)82);
                if (var6_2) {
                    throw null;
                }
            }
lbl167:
            // 4 sources

            case 1: {
                var5_3 /* !! */  = (int)en.fii("fos", fim(int ), (int)83);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl216
            }
            case 2: {
                var5_3 /* !! */  = (int)en.fii("fot", fim(int ), (int)84);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl177:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)en.fii("fou", fim(int ), (int)85);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl182:
            // 3 sources

            case 4: {
                var5_3 /* !! */  = (int)en.fii("fov", fim(int ), (int)86);
                if (!var6_2) ** GOTO lbl167
                throw null;
            }
lbl186:
            // 2 sources

            case 5: {
                var5_3 /* !! */  = (int)en.fii("fow", fim(int ), (int)87);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl216
            }
            case 6: {
                var5_3 /* !! */  = (int)en.fii("fox", fim(int ), (int)88);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 7: {
                var5_3 /* !! */  = (int)en.fii("foy", fim(int ), (int)89);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl201:
            // 2 sources

            case 8: {
                do {
                    var5_3 /* !! */  = (int)en.fii("foz", fim(int ), (int)90);
                } while (!var6_2);
                throw null;
            }
            case 9: {
                var5_3 /* !! */  = (int)en.fii("fpa", fim(int ), (int)91);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl245
            }
lbl211:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)en.fii("fpb", fim(int ), (int)92);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl216:
            // 6 sources

            case 11: {
                do {
                    var5_3 /* !! */  = (int)en.fii("fpc", fim(int ), (int)93);
                } while (!var6_2);
                throw null;
            }
lbl221:
            // 3 sources

            case 12: {
                var5_3 /* !! */  = (int)en.fii("fpd", fim(int ), (int)94);
                if (!var6_2) ** GOTO lbl216
                throw null;
            }
lbl225:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)en.fii("fpe", fim(int ), (int)95);
                if (!var6_2) ** GOTO lbl216
                throw null;
            }
            case 14: {
                var5_3 /* !! */  = (int)en.fii("fpf", fim(int ), (int)96);
                if (!var6_2) ** GOTO lbl221
                throw null;
            }
lbl233:
            // 2 sources

            case 15: {
                var5_3 /* !! */  = (int)en.fii("fpg", fim(int ), (int)97);
                if (!var6_2) ** GOTO lbl177
                throw null;
            }
            case 16: {
                var5_3 /* !! */  = (int)en.fii("fph", fim(int ), (int)98);
                if (!var6_2) ** GOTO lbl182
                throw null;
            }
            case 17: {
                var5_3 /* !! */  = (int)en.fii("fpi", fim(int ), (int)99);
                if (!var6_2) ** GOTO lbl233
                throw null;
            }
lbl245:
            // 2 sources

            case 18: {
                var5_3 /* !! */  = (int)en.fii("fpj", fim(int ), (int)100);
                if (!var6_2) ** GOTO lbl182
                throw null;
            }
            case 19: {
                var5_3 /* !! */  = (int)en.fii("fpk", fim(int ), (int)101);
                if (!var6_2) break;
                throw null;
            }
            case 20: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)en.fii("fpl", fim(int ), (int)102);
                    if (!var6_2) ** GOTO lbl225
                    throw null;
                }
            }
            case 21: 
        }
        var5_3 /* !! */  = (int)en.fii("fpm", fim(int ), (int)103);
        ** while (!var6_2)
lbl261:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void activate() {
        v0 /* !! */  = en.x;
        if (true) ** GOTO lbl5
        block61: while (true) {
            v0 /* !! */  = (long)(v1 - en.fii("fjf", fjc(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1947734864: {
                    v1 = en.fii("fjg", fjc(int ), (int)1);
                    continue block61;
                }
                case -1260395020: {
                    v1 = en.fii("fjh", fjc(int ), (int)2);
                    continue block61;
                }
                case 1673900134: {
                    break block61;
                }
                case 1997348351: {
                    v1 = en.fii("fji", fjc(int ), (int)3);
                    continue block61;
                }
            }
            break;
        }
        var3_1 = en.c;
        v2 /* !! */  = en.x;
        if (true) ** GOTO lbl22
        block62: while (true) {
            v2 /* !! */  = (long)(v3 - en.fii("fjj", fjc(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1343475555: {
                    v3 = en.fii("fjk", fjc(int ), (int)5);
                    continue block62;
                }
                case 1172386472: {
                    v3 = en.fii("fjl", fjc(int ), (int)6);
                    continue block62;
                }
                case 1673900134: {
                    break block62;
                }
            }
            break;
        }
        var2_2 /* !! */  = en.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = en.x - en.fii("fjm", fjc(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == en.fii("fjn", fim(int ), (int)18)) {
                var1_3 = en.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v4 /* !! */  = (long)en.fii("fjo", fim(int ), (int)19);
        }
        if (var1_3) return;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block64: while (true) {
            block108: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3) return;
                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_2 = en.x - en.fii("fjp", fjc(int ), (int)8)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v5 /* !! */  == en.fii("fjq", fim(int ), (int)20)) {
                                v6 /* !! */  = en.x;
                                ** break;
                            }
                            v5 /* !! */  = (long)en.fii("fjr", fim(int ), (int)21);
                        }
                    }
                    case 0: {
                        do {
                            var2_2 /* !! */  = (int)en.fii("fky", fim(int ), (int)30);
                        } while (!var3_1);
                        throw null;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)en.fii("flb", fim(int ), (int)33);
                        cfr_temp_0 = 12;
                        if (var3_1) {
                            throw null;
                        }
                        break block108;
                    }
                    case 6: {
                        var2_2 /* !! */  = (int)en.fii("fle", fim(int ), (int)36);
                        cfr_temp_0 = 4;
                        if (var3_1) {
                            throw null;
                        }
                        break block108;
                    }
                    case 7: {
                        do {
                            var2_2 /* !! */  = (int)en.fii("flf", fim(int ), (int)37);
                        } while (!var3_1);
                        throw null;
                    }
                    case 9: {
                        var2_2 /* !! */  = (int)en.fii("flh", fim(int ), (int)39);
                        cfr_temp_0 = 12;
                        if (var3_1) {
                            throw null;
                        }
                        break block108;
                    }
                    case 11: {
                        ** GOTO lbl236
                    }
                    case 13: {
                        var2_2 /* !! */  = (int)en.fii("fll", fim(int ), (int)43);
                        cfr_temp_0 = 12;
                        if (var3_1) {
                            throw null;
                        }
                        break block108;
                    }
                    case 15: {
                        ** GOTO lbl233
                    }
lbl95:
                    // 1 sources

                    block68: while (true) {
                        switch ((int)v6 /* !! */ ) {
                            case 1464779593: {
                                v6 /* !! */  = (long)(en.fii("fjt", fjc(int ), (int)10) - en.fii("fjs", fjc(int ), (int)9));
                                continue block68;
                            }
                            case 1673900134: {
                                break block68;
                            }
                        }
                        break;
                    }
                    this.counter.resetCounter();
                    if (var1_3 || var1_3) return;
                    v7 /* !! */  = en.x;
                    if (true) ** GOTO lbl108
                    block69: while (true) {
                        v7 /* !! */  = (long)(v8 - en.fii("fju", fjc(int ), (int)11));
lbl108:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -2054361308: {
                                v8 = en.fii("fjv", fjc(int ), (int)12);
                                continue block69;
                            }
                            case -986946453: {
                                v8 = en.fii("fjw", fjc(int ), (int)13);
                                continue block69;
                            }
                            case 147004822: {
                                v8 = en.fii("fjx", fjc(int ), (int)14);
                                continue block69;
                            }
                            case 1673900134: {
                                break block69;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_3 = en.x - en.fii("fjy", fjc(int ), (int)15)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v9 /* !! */  == en.fii("fjz", fim(int ), (int)22)) {
                            this.counter2.resetCounter();
                            if (var1_3) return;
                            break;
                        }
                        v9 /* !! */  = (long)en.fii("fka", fim(int ), (int)23);
                    }
                    if (var1_3) return;
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_4 = en.x - en.fii("fkb", fjc(int ), (int)16)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v10 /* !! */  == en.fii("fkc", fim(int ), (int)24)) break;
                        v10 /* !! */  = (long)en.fii("fkd", fim(int ), (int)25);
                    }
                    while (true) {
                        if ((v11 /* !! */  = (cfr_temp_5 = en.x - en.fii("fke", fjc(int ), (int)17)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v11 /* !! */  == en.fii("fkf", fim(int ), (int)26)) {
                            this.counterChoice.resetCounter();
                            if (var1_3) return;
                            break;
                        }
                        v11 /* !! */  = (long)en.fii("fkg", fim(int ), (int)27);
                    }
                    if (var1_3) return;
                    v12 /* !! */  = en.x;
                    if (true) ** GOTO lbl150
                    block73: while (true) {
                        v12 /* !! */  = (long)(v13 - en.fii("fkh", fjc(int ), (int)18));
lbl150:
                        // 2 sources

                        switch ((int)v12 /* !! */ ) {
                            case -1079282752: {
                                v13 = en.fii("fki", fjc(int ), (int)19);
                                continue block73;
                            }
                            case 863272867: {
                                v13 = en.fii("fkj", fjc(int ), (int)20);
                                continue block73;
                            }
                            case 1673900134: {
                                break block73;
                            }
                        }
                        break;
                    }
                    v14 /* !! */  = en.x;
                    if (true) ** GOTO lbl163
                    block74: while (true) {
                        v14 /* !! */  = (long)(v15 - en.fii("fkk", fjc(int ), (int)21));
lbl163:
                        // 2 sources

                        switch ((int)v14 /* !! */ ) {
                            case -2055274472: {
                                v15 = en.fii("fkl", fjc(int ), (int)22);
                                continue block74;
                            }
                            case 486655651: {
                                v15 = en.fii("fkm", fjc(int ), (int)23);
                                continue block74;
                            }
                            case 1292598147: {
                                v15 = en.fii("fkn", fjc(int ), (int)24);
                                continue block74;
                            }
                            case 1673900134: {
                                break block74;
                            }
                        }
                        break;
                    }
                    this.counterTo.resetCounter();
                    if (var1_3 || var1_3) return;
                    while (true) {
                        if ((v16 /* !! */  = (cfr_temp_6 = en.x - en.fii("fko", fjc(int ), (int)25)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v16 /* !! */  != en.fii("fkp", fim(int ), (int)28)) ** GOTO lbl183
                        v17 /* !! */  = en.x;
                        if (true) ** GOTO lbl187
lbl183:
                        // 1 sources

                        v16 /* !! */  = (long)en.fii("fkq", fim(int ), (int)29);
                    }
                    block76: while (true) {
                        v17 /* !! */  = (long)(v18 - en.fii("fkr", fjc(int ), (int)26));
lbl187:
                        // 2 sources

                        switch ((int)v17 /* !! */ ) {
                            case -2088322580: {
                                v18 = en.fii("fks", fjc(int ), (int)27);
                                continue block76;
                            }
                            case 1139953237: {
                                v18 = en.fii("fkt", fjc(int ), (int)28);
                                continue block76;
                            }
                            case 1345669476: {
                                v18 = en.fii("fku", fjc(int ), (int)29);
                                continue block76;
                            }
                            case 1673900134: {
                                break block76;
                            }
                        }
                        break;
                    }
                    this.sent.clear();
                    if (var1_3 || var1_3) return;
                    v19 /* !! */  = en.x;
                    if (true) ** GOTO lbl205
                    block77: while (true) {
                        v19 /* !! */  = (long)(v20 - en.fii("fkv", fjc(int ), (int)30));
lbl205:
                        // 2 sources

                        switch ((int)v19 /* !! */ ) {
                            case 380373763: {
                                v20 = en.fii("fkw", fjc(int ), (int)31);
                                continue block77;
                            }
                            case 1048044892: {
                                v20 = en.fii("fkx", fjc(int ), (int)32);
                                continue block77;
                            }
                            case 1673900134: {
                                break block77;
                            }
                        }
                        break;
                    }
                    super.activate();
                    if (!var1_3 && !var1_3) return;
                    return;
                    case 1: {
                        var2_2 /* !! */  = (int)en.fii("fkz", fim(int ), (int)31);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)en.fii("fla", fim(int ), (int)32);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 14: {
                        var2_2 /* !! */  = (int)en.fii("flm", fim(int ), (int)44);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 4: {
                        var2_2 /* !! */  = (int)en.fii("flc", fim(int ), (int)34);
                        if (!var3_1) ** break;
                        throw null;
lbl233:
                        // 2 sources

                        var2_2 /* !! */  = (int)en.fii("fln", fim(int ), (int)45);
                        if (var3_1) {
                            throw null;
                        }
lbl236:
                        // 3 sources

                        var2_2 /* !! */  = (int)en.fii("flj", fim(int ), (int)41);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 12: {
                        var2_2 /* !! */  = (int)en.fii("flk", fim(int ), (int)42);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)en.fii("fld", fim(int ), (int)35);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 8: {
                        var2_2 /* !! */  = (int)en.fii("flg", fim(int ), (int)38);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 10: 
                }
                ** GOTO lbl256
            }
            do {
                if (true) continue block64;
lbl256:
                // 2 sources

                var2_2 /* !! */  = (int)en.fii("fli", fim(int ), (int)40);
                cfr_temp_0 = 1;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void ghe() {
        en.fig[100] = -59971563;
        en.fig[101] = 509747285;
        en.fig[102] = 776424441;
        en.fig[103] = -947574262;
        en.fig[104] = 1324157947;
        en.fig[105] = 1545113466;
        en.fig[106] = 1862473748;
        en.fig[107] = 1594315902;
        en.fig[108] = 1174270750;
        en.fig[109] = -264309128;
        en.fig[110] = -2009867297;
        en.fig[111] = 144673050;
        en.fig[112] = 896012382;
        en.fig[113] = -1131045046;
        en.fig[114] = -22729246;
        en.fig[115] = 1202718915;
        en.fig[116] = 1045915398;
        en.fig[117] = 438493488;
        en.fig[118] = -1989836836;
        en.fig[119] = -1415194989;
        en.fig[120] = -1528066812;
        en.fig[121] = 701637845;
        en.fig[122] = 725787250;
        en.fig[123] = 1590142077;
        en.fig[124] = 1867758163;
        en.fig[125] = 2057623105;
        en.fig[126] = 174405834;
        en.fig[127] = -1253979018;
        en.fig[128] = 2090010050;
        en.fig[129] = -723809403;
        en.fig[130] = -1029341330;
        en.fig[131] = -805318503;
        en.fig[132] = 108911808;
        en.fig[133] = 597643545;
        en.fig[134] = -2035006029;
        en.fig[135] = 2073981468;
        en.fig[136] = -1696580626;
        en.fig[137] = 1925075390;
        en.fig[138] = -797096342;
        en.fig[139] = 1155446428;
        en.fig[140] = -391091175;
        en.fig[141] = -544321937;
        en.fig[142] = 534133543;
        en.fig[143] = 2041802611;
        en.fig[144] = -1037416626;
        en.fig[145] = 372939135;
        en.fig[146] = -1713352117;
        en.fig[147] = 763892950;
        en.fig[148] = 401295766;
        en.fig[149] = 1458210602;
        en.fig[150] = 1773661555;
        en.fig[151] = 569969555;
        en.fig[152] = -1545079913;
        en.fig[153] = -937253225;
        en.fig[154] = -1481425884;
        en.fig[155] = 455965507;
        en.fig[156] = -2017540883;
        en.fig[157] = 1804326275;
        en.fig[158] = -207624648;
        en.fig[159] = 1273123573;
        en.fig[160] = 1400032616;
        en.fig[161] = -712234694;
        en.fig[162] = 877672203;
        en.fig[163] = 1827044418;
        en.fig[164] = 1935353429;
        en.fig[165] = 781561303;
        en.fig[166] = -403209228;
        en.fig[167] = 1689095900;
        en.fig[168] = 1717482509;
        en.fig[169] = -1096917339;
        en.fig[170] = -2106660871;
        en.fig[171] = -54064518;
        en.fig[172] = -258480405;
        en.fig[173] = -1104801290;
        en.fig[174] = -1246685168;
        en.fig[175] = 948239495;
        en.fig[176] = -1769626007;
        en.fig[177] = -340282556;
        en.fig[178] = -340466677;
        en.fig[179] = -596642593;
        en.fig[180] = -696117670;
        en.fig[181] = 1823210317;
        en.fig[182] = 895525178;
        en.fig[183] = 869016955;
        en.fig[184] = -1771097274;
        en.fig[185] = -2040725851;
        en.fig[186] = 1234297255;
        en.fig[187] = -513041409;
        en.fig[188] = -1732227764;
        en.fig[189] = 242523365;
        en.fig[190] = -1211650223;
        en.fig[191] = -558012062;
        en.fig[192] = -383533295;
        en.fig[193] = -1481916224;
        en.fig[194] = 303986374;
        en.fig[195] = -1194660186;
        en.fig[196] = 1383716216;
        en.fig[197] = -1827856364;
        en.fig[198] = 1809136477;
        en.fig[199] = 267453837;
    }

    private static /* synthetic */ void giq() {
        en.fjd[100] = -6551206197515461840L;
        en.fjd[101] = -8897023430277491349L;
        en.fjd[102] = 3407371487201515723L;
        en.fjd[103] = -5502484603102140205L;
        en.fjd[104] = 1965312825547620767L;
        en.fjd[105] = 7998140122040856758L;
        en.fjd[106] = -8288741452925663287L;
        en.fjd[107] = 1707667241268461604L;
        en.fjd[108] = -4560850628961136621L;
        en.fjd[109] = 8540037935393614497L;
        en.fjd[110] = -6768055541781826229L;
        en.fjd[111] = 1725917481969910250L;
        en.fjd[112] = 8993978210522597322L;
        en.fjd[113] = 7311067659052363767L;
        en.fjd[114] = 5673338432926057526L;
        en.fjd[115] = -7456353917381900589L;
        en.fjd[116] = 2158401465114476993L;
        en.fjd[117] = -5397711679718577542L;
        en.fjd[118] = -6840191050804458731L;
        en.fjd[119] = 5694294724344527016L;
        en.fjd[120] = -4386054991779737026L;
        en.fjd[121] = 555246732237872067L;
        en.fjd[122] = 263906879267797539L;
        en.fjd[123] = -2141377031030977713L;
        en.fjd[124] = 4929668434217383619L;
        en.fjd[125] = 8109413277078567531L;
        en.fjd[126] = 3978169816790388152L;
        en.fjd[127] = -7131268738740293425L;
        en.fjd[128] = -439314725433949487L;
        en.fjd[129] = 6670458785750061777L;
        en.fjd[130] = 6401747877046125856L;
        en.fjd[131] = -1104114304442920305L;
        en.fjd[132] = 3917898808646009365L;
        en.fjd[133] = -6436887301460015526L;
        en.fjd[134] = 7060003922473675626L;
        en.fjd[135] = -428935059227965881L;
        en.fjd[136] = -5833159837676633441L;
        en.fjd[137] = -5718625224697722782L;
        en.fjd[138] = -6927405757492668305L;
        en.fjd[139] = -1561381129313211513L;
        en.fjd[140] = 1755921222732679744L;
        en.fjd[141] = -4323835215684980138L;
        en.fjd[142] = -6093393940835413076L;
        en.fjd[143] = 2019629065191190745L;
        en.fjd[144] = -652515092414927300L;
        en.fjd[145] = -2807228907203507962L;
        en.fjd[146] = 3096557284131542828L;
        en.fjd[147] = -611438198151166213L;
        en.fjd[148] = 1658198148487988066L;
        en.fjd[149] = -3346687936352637843L;
        en.fjd[150] = -8366209672594432657L;
        en.fjd[151] = 2781898436036545310L;
        en.fjd[152] = 3361901977812687446L;
        en.fjd[153] = 3777555926012660743L;
        en.fjd[154] = 2932486132903683212L;
        en.fjd[155] = 1014017770821492346L;
        en.fjd[156] = -8662884391845019933L;
        en.fjd[157] = 886353642441405821L;
        en.fjd[158] = 5771192460851315766L;
        en.fjd[159] = 6586240078197308563L;
        en.fjd[160] = 8464270020504822617L;
        en.fjd[161] = 5120401031972280786L;
        en.fjd[162] = 7396720119838634012L;
        en.fjd[163] = 8965993445449523663L;
        en.fjd[164] = 9058976325817299600L;
        en.fjd[165] = 3013830750732853829L;
        en.fjd[166] = 7870296059588403290L;
        en.fjd[167] = -5855576975351682276L;
        en.fjd[168] = -7370442341038440742L;
        en.fjd[169] = 3449964523639775245L;
        en.fjd[170] = 6364699219407854533L;
        en.fjd[171] = 6733169029990509759L;
        en.fjd[172] = -5989751366272457375L;
        en.fjd[173] = -5045523850430096041L;
        en.fjd[174] = 4897062257836334888L;
        en.fjd[175] = -3643305400173500015L;
        en.fjd[176] = 811570654926888038L;
        en.fjd[177] = 1301395418279146160L;
        en.fjd[178] = 144106140458505841L;
        en.fjd[179] = 1774289085595391778L;
        en.fjd[180] = -42420661847865644L;
        en.fjd[181] = -128166588573084812L;
    }

    private static /* synthetic */ long fjc(int n2) {
        return fjd[n2] ^ fje[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public en() {
        var2_1 /* !! */  = en.b;
        super("AutoDuel", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043a\u0438\u0434\u0430\u0435\u0442 \u0437\u0430\u043f\u0440\u043e\u0441\u044b \u043d\u0430 \u0434\u0443\u044d\u043b\u044c", du.MISC);
        this.pattern = Pattern.compile("^\\w{3,16}$");
        this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0420\u0435\u0436\u0438\u043c \u0434\u0443\u044d\u043b\u0438", "\u0428\u0430\u0440\u044b", new String[]{"\u0428\u0430\u0440\u044b", "\u0429\u0438\u0442", "\u0428\u0438\u043f\u044b 3", "\u041d\u0435\u0437\u0435\u0440\u0438\u0442\u043a\u0430", "\u0427\u0438\u0442\u0435\u0440\u0441\u043a\u0438\u0439 \u0440\u0430\u0439", "\u041b\u0443\u043a", "\u041a\u043b\u0430\u0441\u0441\u0438\u043a", "\u0422\u043e\u0442\u0435\u043c\u044b", "\u041d\u043e\u0434\u0435\u0431\u0430\u0444\u0444"});
        this.slowTime = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043e\u0442\u043f\u0440\u0430\u0432\u043a\u0438", "\u0417\u0430\u0434\u0435\u0440\u0436\u043a\u0430 \u043c\u0435\u0436\u0434\u0443 \u0437\u0430\u043f\u0440\u043e\u0441\u0430\u043c\u0438", (float)en.fii("fij", fif(int ), (int)0)).range((float)en.fii("fik", fif(int ), (int)1), (float)en.fii("fil", fif(int ), (int)2));
        this.babki = new kb("\u0418\u0433\u0440\u0430\u0442\u044c \u043d\u0430 \u0434\u0435\u043d\u044c\u0433\u0438", "\u0421\u0442\u0430\u0432\u043a\u0430 \u043c\u043e\u043d\u0435\u0442").setValue((boolean)en.fii("fin", fim(int ), (int)3));
        this.money = new kh("\u041c\u043e\u043d\u0435\u0442", "\u041a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e \u043c\u043e\u043d\u0435\u0442 \u0434\u043b\u044f \u0441\u0442\u0430\u0432\u043a\u0438", "0").visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$0(), ()Ljava/lang/Boolean;)((en)this));
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.sent = Lists.newArrayList();
                this.counter = ps.create();
                this.counter2 = ps.create();
                this.counterChoice = ps.create();
                this.counterTo = ps.create();
                this.settings(new jx[]{this.mode, this.slowTime, this.babki, this.money});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)en.fii("fio", fim(int ), (int)4);
                ** GOTO lbl28
            }
lbl21:
            // 3 sources

            case 1: {
                var2_1 /* !! */  = (int)en.fii("fip", fim(int ), (int)5);
                ** GOTO lbl49
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)en.fii("fiq", fim(int ), (int)6);
                    ** GOTO lbl21
                    break;
                }
            }
lbl28:
            // 3 sources

            case 3: {
                while (true) {
                    var2_1 /* !! */  = (int)en.fii("fir", fim(int ), (int)7);
                }
            }
lbl32:
            // 3 sources

            case 4: {
                var2_1 /* !! */  = (int)en.fii("fis", fim(int ), (int)8);
                ** GOTO lbl21
            }
            case 5: {
                var2_1 /* !! */  = (int)en.fii("fit", fim(int ), (int)9);
                ** GOTO lbl55
            }
            case 6: {
                var2_1 /* !! */  = (int)en.fii("fiu", fim(int ), (int)10);
                ** GOTO lbl55
            }
lbl41:
            // 2 sources

            case 7: {
                var2_1 /* !! */  = (int)en.fii("fiv", fim(int ), (int)11);
                ** GOTO lbl32
            }
            case 8: {
                var2_1 /* !! */  = (int)en.fii("fiw", fim(int ), (int)12);
                ** GOTO lbl41
            }
            case 9: {
                var2_1 /* !! */  = (int)en.fii("fix", fim(int ), (int)13);
            }
lbl49:
            // 3 sources

            case 10: {
                var2_1 /* !! */  = (int)en.fii("fiy", fim(int ), (int)14);
                ** GOTO lbl32
            }
lbl52:
            // 2 sources

            case 11: {
                var2_1 /* !! */  = (int)en.fii("fiz", fim(int ), (int)15);
                ** GOTO lbl28
            }
lbl55:
            // 3 sources

            case 12: {
                var2_1 /* !! */  = (int)en.fii("fja", fim(int ), (int)16);
                ** GOTO lbl52
            }
            case 13: 
        }
        var2_1 /* !! */  = (int)en.fii("fjb", fim(int ), (int)17);
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private int getKitSlot() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [17[CASE]], but top level block is 22[SWITCH]
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

    private static /* synthetic */ void git() {
        en.fje[0] = 8561910562193736039L;
        en.fje[1] = -5980712685286841324L;
        en.fje[2] = 4045514405768607006L;
        en.fje[3] = 8632727553389759888L;
        en.fje[4] = -6256952760252802877L;
        en.fje[5] = 3734811797386982126L;
        en.fje[6] = -8997625336491767919L;
        en.fje[7] = -7017287868940013503L;
        en.fje[8] = 545901283193142560L;
        en.fje[9] = 8800138893636754295L;
        en.fje[10] = -2791660077136281930L;
        en.fje[11] = 5052014078674558876L;
        en.fje[12] = -4754262328345692270L;
        en.fje[13] = -4619445479196957280L;
        en.fje[14] = 270571496852777122L;
        en.fje[15] = 8006768237699237863L;
        en.fje[16] = -4217056798945711365L;
        en.fje[17] = 290778555596288668L;
        en.fje[18] = 8646363648978826267L;
        en.fje[19] = -3067346857626414950L;
        en.fje[20] = 6740859179713165799L;
        en.fje[21] = -1518343734861621457L;
        en.fje[22] = -3250818489158570904L;
        en.fje[23] = 1727921343756644660L;
        en.fje[24] = -8317472829890939893L;
        en.fje[25] = 7820837452202183424L;
        en.fje[26] = -5944662852871183702L;
        en.fje[27] = 1948731702551896541L;
        en.fje[28] = -3055963686195749699L;
        en.fje[29] = 4463926166389931339L;
        en.fje[30] = 3148622140363239464L;
        en.fje[31] = 504262038904302918L;
        en.fje[32] = 4008280218207083896L;
        en.fje[33] = -7407805028886187601L;
        en.fje[34] = 4162956234520521947L;
        en.fje[35] = -1310263003307005213L;
        en.fje[36] = 4936655531514234346L;
        en.fje[37] = -2367763524806784540L;
        en.fje[38] = -685905733102284077L;
        en.fje[39] = -6360535330938904095L;
        en.fje[40] = 1786649114131434072L;
        en.fje[41] = 1496014274815703966L;
        en.fje[42] = -3419769218895484161L;
        en.fje[43] = -2885132205613235562L;
        en.fje[44] = -4101098548476729313L;
        en.fje[45] = -5774909489588408003L;
        en.fje[46] = 3808813022553831371L;
        en.fje[47] = -2615039003354619869L;
        en.fje[48] = 5347415170864847423L;
        en.fje[49] = -359258197085663097L;
        en.fje[50] = -9032583901049125571L;
        en.fje[51] = 3126993012526550231L;
        en.fje[52] = -8046663035007288763L;
        en.fje[53] = 6008553622353147078L;
        en.fje[54] = -5050742866088917871L;
        en.fje[55] = 4539599374170364269L;
        en.fje[56] = 4014147236513450593L;
        en.fje[57] = -2745749144679340208L;
        en.fje[58] = -9037862739756571702L;
        en.fje[59] = -2706309099737998767L;
        en.fje[60] = -4477861819327743522L;
        en.fje[61] = -2901009042790124534L;
        en.fje[62] = 5012098371639105264L;
        en.fje[63] = -3000823338550749249L;
        en.fje[64] = 4195056049486757465L;
        en.fje[65] = -3452544698050494891L;
        en.fje[66] = -1186961079692858565L;
        en.fje[67] = 6748822260474365227L;
        en.fje[68] = 3185548976203340818L;
        en.fje[69] = 8060872211006477803L;
        en.fje[70] = 3146757343891234702L;
        en.fje[71] = 1129998735559887919L;
        en.fje[72] = 653983821418938605L;
        en.fje[73] = -7828421489680977644L;
        en.fje[74] = -7542740586465227655L;
        en.fje[75] = -3716094027807770675L;
        en.fje[76] = -8035287177144475453L;
        en.fje[77] = 1083930351705805959L;
        en.fje[78] = 3992446461732726027L;
        en.fje[79] = -6153044619312637608L;
        en.fje[80] = -6994091042839882133L;
        en.fje[81] = -4237155016720797347L;
        en.fje[82] = 8688515147708160251L;
        en.fje[83] = 1407529497383192263L;
        en.fje[84] = 9133716470526306279L;
        en.fje[85] = 1321400587380527305L;
        en.fje[86] = 6923116464394842275L;
        en.fje[87] = 5572159184638014923L;
        en.fje[88] = 8792573803071896206L;
        en.fje[89] = 966936550604797911L;
        en.fje[90] = -4555568630526952764L;
        en.fje[91] = -4425545839069610501L;
        en.fje[92] = -4387683671702939500L;
        en.fje[93] = -347643548232164515L;
        en.fje[94] = 8063390200106966863L;
        en.fje[95] = 59417515161276516L;
        en.fje[96] = 3193256038469115707L;
        en.fje[97] = -7605396623227013752L;
        en.fje[98] = 5550266979695220128L;
        en.fje[99] = 6186857554649188323L;
    }

    private static /* synthetic */ void gia() {
        en.fih[300] = 585449787;
        en.fih[301] = -1161235542;
        en.fih[302] = 1307505016;
        en.fih[303] = -546933408;
        en.fih[304] = -736429111;
        en.fih[305] = -833548511;
        en.fih[306] = 1866935536;
        en.fih[307] = 1278104816;
        en.fih[308] = -1171162951;
        en.fih[309] = 325117575;
        en.fih[310] = 1940113540;
        en.fih[311] = -906911942;
        en.fih[312] = 1161365391;
        en.fih[313] = -115378412;
        en.fih[314] = 1556483432;
        en.fih[315] = 1243205991;
        en.fih[316] = -184139471;
        en.fih[317] = 424165971;
        en.fih[318] = -391695203;
        en.fih[319] = -1826749414;
        en.fih[320] = 894768077;
        en.fih[321] = 502675001;
        en.fih[322] = 79046905;
        en.fih[323] = 2142012025;
        en.fih[324] = -1684035830;
        en.fih[325] = 1308657721;
        en.fih[326] = 974807975;
        en.fih[327] = -797225490;
        en.fih[328] = 309847802;
        en.fih[329] = -232575996;
        en.fih[330] = -1879627772;
        en.fih[331] = 156419998;
        en.fih[332] = 1441759169;
        en.fih[333] = 767286370;
        en.fih[334] = 362029383;
        en.fih[335] = -751515465;
        en.fih[336] = -1482008466;
        en.fih[337] = -698738579;
        en.fih[338] = 819713934;
        en.fih[339] = 869610634;
        en.fih[340] = -1735108621;
        en.fih[341] = 95122917;
        en.fih[342] = -68648706;
        en.fih[343] = 1423804933;
        en.fih[344] = -605674123;
        en.fih[345] = 522299302;
        en.fih[346] = 480409653;
        en.fih[347] = -444851482;
        en.fih[348] = 428588714;
        en.fih[349] = 941211269;
        en.fih[350] = -559518993;
        en.fih[351] = 1549644392;
        en.fih[352] = 1947479588;
        en.fih[353] = 445117270;
        en.fih[354] = 1822892652;
    }

    private static /* synthetic */ void ghd() {
        en.fig[0] = -551764044;
        en.fig[1] = -1095538849;
        en.fig[2] = 144220446;
        en.fig[3] = 1291372922;
        en.fig[4] = -1632635968;
        en.fig[5] = -1217867641;
        en.fig[6] = 1784744189;
        en.fig[7] = 1846417163;
        en.fig[8] = 45251304;
        en.fig[9] = -1777848783;
        en.fig[10] = -2011879575;
        en.fig[11] = -87349381;
        en.fig[12] = -321784859;
        en.fig[13] = 710579644;
        en.fig[14] = -151745932;
        en.fig[15] = -151814449;
        en.fig[16] = 502555858;
        en.fig[17] = -461583284;
        en.fig[18] = 1118462695;
        en.fig[19] = 862271411;
        en.fig[20] = -2032330468;
        en.fig[21] = -834105065;
        en.fig[22] = -2061136245;
        en.fig[23] = -1658263529;
        en.fig[24] = -1727445526;
        en.fig[25] = 1165875919;
        en.fig[26] = 1999302935;
        en.fig[27] = -400640087;
        en.fig[28] = -904420423;
        en.fig[29] = -71009663;
        en.fig[30] = 964657898;
        en.fig[31] = -1068571312;
        en.fig[32] = 850519949;
        en.fig[33] = -919591604;
        en.fig[34] = 1622127472;
        en.fig[35] = -257771574;
        en.fig[36] = 609535915;
        en.fig[37] = -537218573;
        en.fig[38] = 1846436151;
        en.fig[39] = 776943741;
        en.fig[40] = 130393278;
        en.fig[41] = 971647122;
        en.fig[42] = -1966932010;
        en.fig[43] = 339671276;
        en.fig[44] = -10744299;
        en.fig[45] = 5969213;
        en.fig[46] = -1613231220;
        en.fig[47] = 1873265335;
        en.fig[48] = 1055898365;
        en.fig[49] = 1447219438;
        en.fig[50] = -401281114;
        en.fig[51] = 327037986;
        en.fig[52] = 2016928529;
        en.fig[53] = -1418080192;
        en.fig[54] = 1048754960;
        en.fig[55] = 469110861;
        en.fig[56] = 1075385914;
        en.fig[57] = 124266283;
        en.fig[58] = 1912209022;
        en.fig[59] = -91993915;
        en.fig[60] = 1218413534;
        en.fig[61] = 1276951944;
        en.fig[62] = -179420961;
        en.fig[63] = -1502960601;
        en.fig[64] = -180501484;
        en.fig[65] = 435871327;
        en.fig[66] = 2068055333;
        en.fig[67] = -1041056571;
        en.fig[68] = -718062554;
        en.fig[69] = 784106364;
        en.fig[70] = 127822583;
        en.fig[71] = 1395387735;
        en.fig[72] = 1715533285;
        en.fig[73] = -1713800852;
        en.fig[74] = 445982083;
        en.fig[75] = -109761249;
        en.fig[76] = 1879132885;
        en.fig[77] = -2033016916;
        en.fig[78] = 1958049212;
        en.fig[79] = 1179158468;
        en.fig[80] = -1861574553;
        en.fig[81] = -101081787;
        en.fig[82] = 2126012942;
        en.fig[83] = -88985356;
        en.fig[84] = -1863236566;
        en.fig[85] = -314374419;
        en.fig[86] = 1798559361;
        en.fig[87] = 359543769;
        en.fig[88] = -1711314108;
        en.fig[89] = -648357565;
        en.fig[90] = -737752887;
        en.fig[91] = 852277774;
        en.fig[92] = -1049784729;
        en.fig[93] = -690266213;
        en.fig[94] = -490910894;
        en.fig[95] = -717739421;
        en.fig[96] = -661604349;
        en.fig[97] = 471240709;
        en.fig[98] = 1940404691;
        en.fig[99] = -2126135760;
    }

    private static /* synthetic */ void ght() {
        en.fih[200] = -266615047;
        en.fih[201] = -364486869;
        en.fih[202] = 1132677639;
        en.fih[203] = -750926410;
        en.fih[204] = 103668558;
        en.fih[205] = 1249810514;
        en.fih[206] = 872447774;
        en.fih[207] = -333382626;
        en.fih[208] = 1685818494;
        en.fih[209] = -407041910;
        en.fih[210] = 1561128699;
        en.fih[211] = 768339988;
        en.fih[212] = 1096496809;
        en.fih[213] = -60491300;
        en.fih[214] = 218833974;
        en.fih[215] = -710162462;
        en.fih[216] = 385553741;
        en.fih[217] = 2127920879;
        en.fih[218] = -587598450;
        en.fih[219] = -1363066765;
        en.fih[220] = -256494869;
        en.fih[221] = -2129603615;
        en.fih[222] = -416860114;
        en.fih[223] = 915385420;
        en.fih[224] = 2127965930;
        en.fih[225] = -667387815;
        en.fih[226] = -119221710;
        en.fih[227] = -7836227;
        en.fih[228] = 1309736380;
        en.fih[229] = 283662044;
        en.fih[230] = -1675759256;
        en.fih[231] = 1232560211;
        en.fih[232] = -480245953;
        en.fih[233] = 1263308128;
        en.fih[234] = -1623037350;
        en.fih[235] = 1741153680;
        en.fih[236] = 515917669;
        en.fih[237] = 863152926;
        en.fih[238] = -1529183348;
        en.fih[239] = 113346781;
        en.fih[240] = -297708266;
        en.fih[241] = -787449940;
        en.fih[242] = 276148481;
        en.fih[243] = -547983681;
        en.fih[244] = -255626412;
        en.fih[245] = -1694001334;
        en.fih[246] = -255130620;
        en.fih[247] = -1945304247;
        en.fih[248] = 2065895584;
        en.fih[249] = -410083205;
        en.fih[250] = -418753756;
        en.fih[251] = 1278319569;
        en.fih[252] = 1972525212;
        en.fih[253] = 526218967;
        en.fih[254] = 1573478015;
        en.fih[255] = -602669082;
        en.fih[256] = -1882735631;
        en.fih[257] = -1044119777;
        en.fih[258] = 115897411;
        en.fih[259] = -1663038080;
        en.fih[260] = 1404211826;
        en.fih[261] = 1450147986;
        en.fih[262] = -1283565199;
        en.fih[263] = 65006713;
        en.fih[264] = 97860481;
        en.fih[265] = -2129377410;
        en.fih[266] = 1402174180;
        en.fih[267] = 1391035708;
        en.fih[268] = 175530161;
        en.fih[269] = 7757081;
        en.fih[270] = -1318016366;
        en.fih[271] = -1985990981;
        en.fih[272] = -1781449044;
        en.fih[273] = -22714223;
        en.fih[274] = 1036381456;
        en.fih[275] = 474924966;
        en.fih[276] = -846784425;
        en.fih[277] = -1729295008;
        en.fih[278] = -1288561829;
        en.fih[279] = -2001883431;
        en.fih[280] = -1592641485;
        en.fih[281] = 1547459301;
        en.fih[282] = 821845204;
        en.fih[283] = 1311461141;
        en.fih[284] = -1877138426;
        en.fih[285] = -472112848;
        en.fih[286] = -1436762740;
        en.fih[287] = 92615154;
        en.fih[288] = 1319560889;
        en.fih[289] = 762658589;
        en.fih[290] = -1446943550;
        en.fih[291] = 1844104724;
        en.fih[292] = -771255164;
        en.fih[293] = 1004879267;
        en.fih[294] = -1303236695;
        en.fih[295] = -742226787;
        en.fih[296] = 1299606855;
        en.fih[297] = -1955541907;
        en.fih[298] = 1171043437;
        en.fih[299] = 2042397154;
    }

    private static /* synthetic */ void ghl() {
        en.fih[100] = -59971565;
        en.fih[101] = 509747286;
        en.fih[102] = 776424442;
        en.fih[103] = -947574257;
        en.fih[104] = 1324157947;
        en.fih[105] = 1545113458;
        en.fih[106] = 1862473786;
        en.fih[107] = 1594315887;
        en.fih[108] = 1174270776;
        en.fih[109] = -264309144;
        en.fih[110] = -2009867310;
        en.fih[111] = 144673046;
        en.fih[112] = 896012362;
        en.fih[113] = -1131045050;
        en.fih[114] = -22729240;
        en.fih[115] = 1202718931;
        en.fih[116] = 1045915401;
        en.fih[117] = 438493496;
        en.fih[118] = -1989836840;
        en.fih[119] = -1415194979;
        en.fih[120] = -1528066803;
        en.fih[121] = 701637831;
        en.fih[122] = 725787225;
        en.fih[123] = 1590142042;
        en.fih[124] = 1867758195;
        en.fih[125] = 2057623114;
        en.fih[126] = 174405855;
        en.fih[127] = -1253979024;
        en.fih[128] = 2090010081;
        en.fih[129] = -723809381;
        en.fih[130] = -1029341376;
        en.fih[131] = -805318501;
        en.fih[132] = 108911814;
        en.fih[133] = 597643534;
        en.fih[134] = -2035006054;
        en.fih[135] = 2073981441;
        en.fih[136] = -1696580634;
        en.fih[137] = 1925075359;
        en.fih[138] = -797096333;
        en.fih[139] = 1155446403;
        en.fih[140] = -391091179;
        en.fih[141] = -544321942;
        en.fih[142] = 534133536;
        en.fih[143] = 2041802581;
        en.fih[144] = -1037416638;
        en.fih[145] = 372939103;
        en.fih[146] = -1713352085;
        en.fih[147] = 763892944;
        en.fih[148] = 401295799;
        en.fih[149] = 1458210613;
        en.fih[150] = 1773661551;
        en.fih[151] = 569969542;
        en.fih[152] = -1545079906;
        en.fih[153] = -937253226;
        en.fih[154] = 1905737414;
        en.fih[155] = 455965506;
        en.fih[156] = 1664691367;
        en.fih[157] = 1804326274;
        en.fih[158] = -715496080;
        en.fih[159] = 1273123572;
        en.fih[160] = 1881509513;
        en.fih[161] = -712234693;
        en.fih[162] = 1994284244;
        en.fih[163] = 1827044419;
        en.fih[164] = 2053310651;
        en.fih[165] = 781561302;
        en.fih[166] = 723175313;
        en.fih[167] = 1689095901;
        en.fih[168] = 754584294;
        en.fih[169] = -1096917340;
        en.fih[170] = 710294762;
        en.fih[171] = -54064517;
        en.fih[172] = 1579248800;
        en.fih[173] = -1104801289;
        en.fih[174] = 375514403;
        en.fih[175] = 948239493;
        en.fih[176] = -1769626011;
        en.fih[177] = -340282548;
        en.fih[178] = -340466688;
        en.fih[179] = -596642602;
        en.fih[180] = -696117668;
        en.fih[181] = 1823210308;
        en.fih[182] = 895525174;
        en.fih[183] = 869016957;
        en.fih[184] = -1771097267;
        en.fih[185] = -2040725842;
        en.fih[186] = 1234297259;
        en.fih[187] = -513041413;
        en.fih[188] = -1732227764;
        en.fih[189] = 242523365;
        en.fih[190] = -1211650223;
        en.fih[191] = -558012035;
        en.fih[192] = -383533281;
        en.fih[193] = -1481916190;
        en.fih[194] = 303986373;
        en.fih[195] = -1194660191;
        en.fih[196] = 1383716185;
        en.fih[197] = -1827856357;
        en.fih[198] = 1809136453;
        en.fih[199] = 267453825;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = en.x - en.fii("ggf", fjc(int ), (int)166)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == en.fii("ggg", fim(int ), (int)347)) break;
            v0 /* !! */  = (long)en.fii("ggh", fim(int ), (int)348);
        }
        var3_1 = en.c;
        v1 /* !! */  = en.x;
        if (true) ** GOTO lbl12
        block29: while (true) {
            v1 /* !! */  = (long)(en.fii("ggj", fjc(int ), (int)168) - en.fii("ggi", fjc(int ), (int)167));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 496525751: {
                    continue block29;
                }
                case 1673900134: {
                    break block29;
                }
            }
            break;
        }
        var2_2 /* !! */  = en.b;
        v2 /* !! */  = en.x;
        if (true) ** GOTO lbl22
        block30: while (true) {
            v2 /* !! */  = (long)(v3 - en.fii("ggk", fjc(int ), (int)169));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2143554848: {
                    v3 = en.fii("ggl", fjc(int ), (int)170);
                    continue block30;
                }
                case -1751451457: {
                    v3 = en.fii("ggm", fjc(int ), (int)171);
                    continue block30;
                }
                case 1673900134: {
                    break block30;
                }
                case 1865021384: {
                    v3 = en.fii("ggn", fjc(int ), (int)172);
                    continue block30;
                }
            }
            break;
        }
        var1_3 = en.a;
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

                if (var1_3 || var1_3) continue block31;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = en.x - en.fii("ggo", fjc(int ), (int)173)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == en.fii("ggp", fim(int ), (int)349)) break;
                    v4 /* !! */  = (long)en.fii("ggq", fim(int ), (int)350);
                }
                v5 /* !! */  = en.x;
                if (true) ** GOTO lbl52
                block33: while (true) {
                    v5 /* !! */  = (long)(v6 - en.fii("ggr", fjc(int ), (int)174));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1367420339: {
                            v6 = en.fii("ggs", fjc(int ), (int)175);
                            continue block33;
                        }
                        case 1211935721: {
                            v6 = en.fii("ggt", fjc(int ), (int)176);
                            continue block33;
                        }
                        case 1575661624: {
                            v6 = en.fii("ggu", fjc(int ), (int)177);
                            continue block33;
                        }
                        case 1673900134: {
                            break block33;
                        }
                    }
                    break;
                }
                v7 = this.babki.isValue();
                v8 /* !! */  = en.x;
                if (true) ** GOTO lbl69
                block34: while (true) {
                    v8 /* !! */  = (long)(v9 - en.fii("ggv", fjc(int ), (int)178));
lbl69:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1146426914: {
                            v9 = en.fii("ggw", fjc(int ), (int)179);
                            continue block34;
                        }
                        case 611985392: {
                            v9 = en.fii("ggx", fjc(int ), (int)180);
                            continue block34;
                        }
                        case 1673900134: {
                            break block34;
                        }
                        case 1938353125: {
                            v9 = en.fii("ggy", fjc(int ), (int)181);
                            continue block34;
                        }
                    }
                    break;
                }
                return v7;
                case 0: {
                    do {
                        var2_2 /* !! */  = (int)en.fii("ggz", fim(int ), (int)351);
                    } while (!var3_1);
                    throw null;
                }
                case 1: {
                    var2_2 /* !! */  = (int)en.fii("gha", fim(int ), (int)352);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: {
                    do {
                        var2_2 /* !! */  = (int)en.fii("ghb", fim(int ), (int)353);
                    } while (!var3_1);
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)en.fii("ghc", fim(int ), (int)354);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void sendDuelRequest(String var1_1) {
        block80: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = en.x - en.fii("frq", fjc(int ), (int)83)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == en.fii("frr", fim(int ), (int)153)) break;
                v0 /* !! */  = (long)en.fii("frs", fim(int ), (int)154);
            }
            var4_2 = en.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = en.x - en.fii("frt", fjc(int ), (int)84)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == en.fii("fru", fim(int ), (int)155)) break;
                v1 /* !! */  = (long)en.fii("frv", fim(int ), (int)156);
            }
            var3_3 /* !! */  = en.b;
            v2 /* !! */  = en.x;
            if (true) ** GOTO lbl17
            block51: while (true) {
                v2 /* !! */  = (long)(v3 - en.fii("frw", fjc(int ), (int)85));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -916093278: {
                        v3 = en.fii("frx", fjc(int ), (int)86);
                        continue block51;
                    }
                    case 638960618: {
                        v3 = en.fii("fry", fjc(int ), (int)87);
                        continue block51;
                    }
                    case 1327622256: {
                        v3 = en.fii("frz", fjc(int ), (int)88);
                        continue block51;
                    }
                    case 1673900134: {
                        break block51;
                    }
                }
                break;
            }
            var2_4 = en.a;
            if (var4_2) {
                throw null;
lbl32:
                // 7 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl32
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = en.x - en.fii("fsa", fjc(int ), (int)89)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == en.fii("fsb", fim(int ), (int)157)) break;
                v4 /* !! */  = (long)en.fii("fsc", fim(int ), (int)158);
            }
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_3 = en.x - en.fii("fsd", fjc(int ), (int)90)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == en.fii("fse", fim(int ), (int)159)) break;
                v5 /* !! */  = (long)en.fii("fsf", fim(int ), (int)160);
            }
            if (!this.babki.isValue()) break block80;
            if (var2_4 || var2_4) ** GOTO lbl32
            v6 /* !! */  = en.x;
            if (true) ** GOTO lbl51
            block55: while (true) {
                v6 /* !! */  = (long)(v7 - en.fii("fsg", fjc(int ), (int)91));
lbl51:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -934102813: {
                        v7 = en.fii("fsh", fjc(int ), (int)92);
                        continue block55;
                    }
                    case -113580293: {
                        v7 = en.fii("fsi", fjc(int ), (int)93);
                        continue block55;
                    }
                    case 1582896767: {
                        v7 = en.fii("fsj", fjc(int ), (int)94);
                        continue block55;
                    }
                    case 1673900134: {
                        break block55;
                    }
                }
                break;
            }
            v8 /* !! */  = en.x;
            if (true) ** GOTO lbl67
            block56: while (true) {
                v8 /* !! */  = (long)(v9 - en.fii("fsk", fjc(int ), (int)95));
lbl67:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -1093873362: {
                        v9 = en.fii("fsl", fjc(int ), (int)96);
                        continue block56;
                    }
                    case -659277125: {
                        v9 = en.fii("fsm", fjc(int ), (int)97);
                        continue block56;
                    }
                    case 1576744095: {
                        v9 = en.fii("fsn", fjc(int ), (int)98);
                        continue block56;
                    }
                    case 1673900134: {
                        break block56;
                    }
                }
                break;
            }
            v10 = en.mc.field_1724;
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_4 = en.x - en.fii("fso", fjc(int ), (int)99)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == en.fii("fsp", fim(int ), (int)161)) break;
                v11 /* !! */  = (long)en.fii("fsq", fim(int ), (int)162);
            }
            v12 = v10.field_3944;
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_5 = en.x - en.fii("fsr", fjc(int ), (int)100)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == en.fii("fss", fim(int ), (int)163)) break;
                v13 /* !! */  = (long)en.fii("fst", fim(int ), (int)164);
            }
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_6 = en.x - en.fii("fsu", fjc(int ), (int)101)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == en.fii("fsv", fim(int ), (int)165)) break;
                v14 /* !! */  = (long)en.fii("fsw", fim(int ), (int)166);
            }
            v15 = this.money.getValue();
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_7 = en.x - en.fii("fsx", fjc(int ), (int)102)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v16 /* !! */  == en.fii("fsy", fim(int ), (int)167)) break;
                v16 /* !! */  = (long)en.fii("fsz", fim(int ), (int)168);
            }
            v17 = "duel " + var1_1 + " " + v15;
            while (true) {
                if ((v18 /* !! */  = (cfr_temp_8 = en.x - en.fii("fta", fjc(int ), (int)103)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v18 /* !! */  == en.fii("ftb", fim(int ), (int)169)) break;
                v18 /* !! */  = (long)en.fii("ftc", fim(int ), (int)170);
            }
            v12.method_45730(v17);
            if (var2_4) ** GOTO lbl32
            if (var4_2) {
                throw null;
            }
            ** GOTO lbl175
        }
        if (var2_4) ** GOTO lbl32
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl32
                v19 /* !! */  = en.x;
                if (true) ** GOTO lbl123
                block62: while (true) {
                    v19 /* !! */  = (long)(v20 - en.fii("ftd", fjc(int ), (int)104));
lbl123:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1984585837: {
                            v20 = en.fii("fte", fjc(int ), (int)105);
                            continue block62;
                        }
                        case -1061014229: {
                            v20 = en.fii("ftf", fjc(int ), (int)106);
                            continue block62;
                        }
                        case 31674339: {
                            v20 = en.fii("ftg", fjc(int ), (int)107);
                            continue block62;
                        }
                        case 1673900134: {
                            break block62;
                        }
                    }
                    break;
                }
                v21 /* !! */  = en.x;
                if (true) ** GOTO lbl139
                block63: while (true) {
                    v21 /* !! */  = (long)(en.fii("fti", fjc(int ), (int)109) - en.fii("fth", fjc(int ), (int)108));
lbl139:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case 715673624: {
                            continue block63;
                        }
                        case 1673900134: {
                            break block63;
                        }
                    }
                    break;
                }
                v22 = en.mc.field_1724;
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_9 = en.x - en.fii("ftj", fjc(int ), (int)110)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == en.fii("ftk", fim(int ), (int)171)) break;
                    v23 /* !! */  = (long)en.fii("ftl", fim(int ), (int)172);
                }
                v24 = v22.field_3944;
                v25 /* !! */  = en.x;
                if (true) ** GOTO lbl155
                block65: while (true) {
                    v25 /* !! */  = (long)(v26 - en.fii("ftm", fjc(int ), (int)111));
lbl155:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -1221097116: {
                            v26 = en.fii("ftn", fjc(int ), (int)112);
                            continue block65;
                        }
                        case 548904942: {
                            v26 = en.fii("fto", fjc(int ), (int)113);
                            continue block65;
                        }
                        case 615485332: {
                            v26 = en.fii("ftp", fjc(int ), (int)114);
                            continue block65;
                        }
                        case 1673900134: {
                            break block65;
                        }
                    }
                    break;
                }
                v27 = "duel " + var1_1;
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_10 = en.x - en.fii("ftq", fjc(int ), (int)115)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == en.fii("ftr", fim(int ), (int)173)) break;
                    v28 /* !! */  = (long)en.fii("fts", fim(int ), (int)174);
                }
                v24.method_45730(v27);
                if (var2_4) ** GOTO lbl32
lbl175:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl178:
            // 2 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)en.fii("ftt", fim(int ), (int)175);
                } while (!var4_2);
                throw null;
            }
lbl183:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)en.fii("ftu", fim(int ), (int)176);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl225
            }
            case 2: {
                var3_3 /* !! */  = (int)en.fii("ftv", fim(int ), (int)177);
                if (!var4_2) break;
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)en.fii("ftw", fim(int ), (int)178);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl212
            }
            case 4: {
                var3_3 /* !! */  = (int)en.fii("ftx", fim(int ), (int)179);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl216
            }
            case 5: {
                var3_3 /* !! */  = (int)en.fii("fty", fim(int ), (int)180);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl216
            }
            case 6: {
                var3_3 /* !! */  = (int)en.fii("ftz", fim(int ), (int)181);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl212:
            // 3 sources

            case 7: {
                var3_3 /* !! */  = (int)en.fii("fua", fim(int ), (int)182);
                if (!var4_2) break;
                throw null;
            }
lbl216:
            // 5 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)en.fii("fub", fim(int ), (int)183);
                    if (!var4_2) ** GOTO lbl212
                    throw null;
                }
            }
            case 9: {
                var3_3 /* !! */  = (int)en.fii("fuc", fim(int ), (int)184);
                if (!var4_2) ** GOTO lbl216
                throw null;
            }
lbl225:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)en.fii("fud", fim(int ), (int)185);
                if (!var4_2) ** GOTO lbl183
                throw null;
            }
            case 11: {
                var3_3 /* !! */  = (int)en.fii("fue", fim(int ), (int)186);
                if (!var4_2) ** GOTO lbl178
                throw null;
            }
            case 12: 
        }
        var3_3 /* !! */  = (int)en.fii("fuf", fim(int ), (int)187);
        ** while (!var4_2)
lbl236:
        // 1 sources

        throw null;
    }
}

