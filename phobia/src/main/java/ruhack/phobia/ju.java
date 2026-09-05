/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1764
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1268;
import net.minecraft.class_1764;
import ruhack.phobia.aw;
import ruhack.phobia.cd;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jq;
import ruhack.phobia.jx;
import ruhack.phobia.kg;

public class ju
extends ds {
    public static final int b;
    private final kg mainHandXSetting;
    public static final boolean c;
    private final kg mainHandZSetting;
    public static final boolean a;
    static final long rd = -584777395178691815L;
    private final kg offHandZSetting;
    private final kg offHandYSetting;
    private final kg mainHandYSetting;
    private static int[] jepe;
    private static int[] jepf;
    private final kg offHandXSetting;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ju() {
        var2_1 /* !! */  = ju.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("ViewModel", "\u0418\u0437\u043c\u0435\u043d\u0435\u043d\u0438\u044f \u043f\u043e\u0437\u0438\u0446\u0438\u0438 \u0440\u0443\u043a\u0438", du.RENDER);
                this.mainHandXSetting = new kg("\u041e\u0441\u043d\u043e\u0432\u043d\u0430\u044f \u0440\u0443\u043a\u0430 X", "\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f X \u0434\u043b\u044f \u043e\u0441\u043d\u043e\u0432\u043d\u043e\u0439 \u0440\u0443\u043a\u0438", 0.0f).range((float)ju.jepg("jeph", jepd(int ), (int)0), 1.0f);
                this.mainHandYSetting = new kg("\u041e\u0441\u043d\u043e\u0432\u043d\u0430\u044f \u0440\u0443\u043a\u0430 Y", "\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f Y \u0434\u043b\u044f \u043e\u0441\u043d\u043e\u0432\u043d\u043e\u0439 \u0440\u0443\u043a\u0438", 0.0f).range((float)ju.jepg("jepi", jepd(int ), (int)1), 1.0f);
                this.mainHandZSetting = new kg("\u041e\u0441\u043d\u043e\u0432\u043d\u0430\u044f \u0440\u0443\u043a\u0430 Z", "\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f Z \u0434\u043b\u044f \u043e\u0441\u043d\u043e\u0432\u043d\u043e\u0439 \u0440\u0443\u043a\u0438", 0.0f).range((float)ju.jepg("jepj", jepd(int ), (int)2), (float)ju.jepg("jepk", jepd(int ), (int)3));
                this.offHandXSetting = new kg("\u0412\u0442\u043e\u0440\u043e\u0441\u0442\u0435\u043f\u0435\u043d\u043d\u0430\u044f \u0440\u0443\u043a\u0430 X", "\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f X \u0434\u043b\u044f \u0432\u0442\u043e\u0440\u043e\u0441\u0442\u0435\u043f\u0435\u043d\u043d\u043e\u0439 \u0440\u0443\u043a\u0438", 0.0f).range((float)ju.jepg("jepl", jepd(int ), (int)4), 1.0f);
                this.offHandYSetting = new kg("\u0412\u0442\u043e\u0440\u043e\u0441\u0442\u0435\u043f\u0435\u043d\u043d\u0430\u044f \u0440\u0443\u043a\u0430 Y", "\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f Y \u0434\u043b\u044f \u0432\u0442\u043e\u0440\u043e\u0441\u0442\u0435\u043f\u0435\u043d\u043d\u043e\u0439 \u0440\u0443\u043a\u0438", 0.0f).range((float)ju.jepg("jepm", jepd(int ), (int)5), 1.0f);
                this.offHandZSetting = new kg("\u0412\u0442\u043e\u0440\u043e\u0441\u0442\u0435\u043f\u0435\u043d\u043d\u0430\u044f \u0440\u0443\u043a\u0430 Z", "\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f Z \u0434\u043b\u044f \u0432\u0442\u043e\u0440\u043e\u0441\u0442\u0435\u043f\u0435\u043d\u043d\u043e\u0439 \u0440\u0443\u043a\u0438", 0.0f).range((float)ju.jepg("jepn", jepd(int ), (int)6), (float)ju.jepg("jepo", jepd(int ), (int)7));
                this.settings(new jx[]{this.mainHandXSetting, this.mainHandYSetting, this.mainHandZSetting, this.offHandXSetting, this.offHandYSetting, this.offHandZSetting});
                return;
            }
lbl14:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)ju.jepg("jepq", jepp(int ), (int)8);
                ** GOTO lbl38
            }
            case 1: {
                var2_1 /* !! */  = (int)ju.jepg("jepr", jepp(int ), (int)9);
                break;
            }
lbl20:
            // 3 sources

            case 2: {
                var2_1 /* !! */  = (int)ju.jepg("jeps", jepp(int ), (int)10);
                ** GOTO lbl35
            }
            case 3: {
                while (true) {
                    var2_1 /* !! */  = (int)ju.jepg("jept", jepp(int ), (int)11);
                }
            }
            case 4: {
                var2_1 /* !! */  = (int)ju.jepg("jepu", jepp(int ), (int)12);
                ** GOTO lbl14
            }
            case 5: {
                var2_1 /* !! */  = (int)ju.jepg("jepv", jepp(int ), (int)13);
            }
            case 6: {
                var2_1 /* !! */  = (int)ju.jepg("jepw", jepp(int ), (int)14);
                ** GOTO lbl20
            }
lbl35:
            // 2 sources

            case 7: {
                var2_1 /* !! */  = (int)ju.jepg("jepx", jepp(int ), (int)15);
                ** GOTO lbl20
            }
lbl38:
            // 2 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ju.jepg("jepy", jepp(int ), (int)16);
                    break;
                }
            }
            case 9: 
        }
        var2_1 /* !! */  = (int)ju.jepg("jepz", jepp(int ), (int)17);
        ** while (true)
    }

    private static /* synthetic */ float jepd(int n2) {
        return Float.intBitsToFloat(jepe[n2] ^ jepf[n2]);
    }

    static {
        jepe = new int[50];
        jepf = new int[50];
        ju.jerg();
        ju.jerh();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onHandOffset(cd var1_1) {
        block64: {
            block62: {
                block63: {
                    var6_2 = ju.c;
                    var5_3 /* !! */  = ju.b;
                    var4_4 = ju.a;
                    if (var6_2) {
                        throw null;
lbl6:
                        // 17 sources

                        return;
                    }
                    if (var4_4 || var4_4) ** GOTO lbl6
                    if (!var1_1.getStack().method_7960()) break block62;
                    if (var4_4 || var4_4) ** GOTO lbl6
                    var2_5 = jq.getInstance();
                    if (var4_4 || var4_4) ** GOTO lbl6
                    if (var2_5 == null) break block63;
                    if (var4_4) ** GOTO lbl6
                    if (var2_5.isHoldMyItemsActive()) break block62;
                    if (var4_4) ** GOTO lbl6
                }
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
            }
            if (var4_4 || var4_4) ** GOTO lbl6
            var2_5 = var1_1.getHand();
            if (var4_4 || var4_4) ** GOTO lbl6
            if (!var2_5.equals(class_1268.field_5808)) break block64;
            if (var4_4) ** GOTO lbl6
            if (!(var1_1.getStack().method_7909() instanceof class_1764)) break block64;
            if (var4_4) ** GOTO lbl6
            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl6
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var3_6 = var1_1.getMatrices();
                if (var4_4 || var4_4) ** GOTO lbl6
                if (!var2_5.equals(class_1268.field_5808)) ** GOTO lbl43
                if (var4_4 || var4_4) ** GOTO lbl6
                var3_6.method_46416(this.mainHandXSetting.getValue(), this.mainHandYSetting.getValue(), this.mainHandZSetting.getValue());
                if (var4_4) ** GOTO lbl6
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl46
lbl43:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                var3_6.method_46416(this.offHandXSetting.getValue(), this.offHandYSetting.getValue(), this.offHandZSetting.getValue());
                if (var4_4) ** GOTO lbl6
lbl46:
                // 2 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl49:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)ju.jepg("jeqa", jepp(int ), (int)18);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl54:
            // 4 sources

            case 1: {
                var5_3 /* !! */  = (int)ju.jepg("jeqb", jepp(int ), (int)19);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)ju.jepg("jeqc", jepp(int ), (int)20);
                    if (!var6_2) ** GOTO lbl54
                    throw null;
                }
            }
lbl64:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)ju.jepg("jeqd", jepp(int ), (int)21);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl103
            }
            case 4: {
                var5_3 /* !! */  = (int)ju.jepg("jeqe", jepp(int ), (int)22);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 5: {
                var5_3 /* !! */  = (int)ju.jepg("jeqf", jepp(int ), (int)23);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl89
            }
lbl79:
            // 4 sources

            case 6: {
                var5_3 /* !! */  = (int)ju.jepg("jeqg", jepp(int ), (int)24);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl84:
            // 2 sources

            case 7: {
                var5_3 /* !! */  = (int)ju.jepg("jeqh", jepp(int ), (int)25);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl94
            }
lbl89:
            // 2 sources

            case 8: {
                do {
                    var5_3 /* !! */  = (int)ju.jepg("jeqi", jepp(int ), (int)26);
                } while (!var6_2);
                throw null;
            }
lbl94:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)ju.jepg("jeqj", jepp(int ), (int)27);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl99:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)ju.jepg("jeqk", jepp(int ), (int)28);
                if (!var6_2) ** GOTO lbl84
                throw null;
            }
lbl103:
            // 2 sources

            case 11: {
                var5_3 /* !! */  = (int)ju.jepg("jeql", jepp(int ), (int)29);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl108:
            // 2 sources

            case 12: {
                var5_3 /* !! */  = (int)ju.jepg("jeqm", jepp(int ), (int)30);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl156
            }
            case 13: {
                var5_3 /* !! */  = (int)ju.jepg("jeqn", jepp(int ), (int)31);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl160
            }
            case 14: {
                var5_3 /* !! */  = (int)ju.jepg("jeqo", jepp(int ), (int)32);
                if (!var6_2) ** GOTO lbl99
                throw null;
            }
lbl122:
            // 2 sources

            case 15: {
                var5_3 /* !! */  = (int)ju.jepg("jeqp", jepp(int ), (int)33);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl127:
            // 2 sources

            case 16: {
                var5_3 /* !! */  = (int)ju.jepg("jeqq", jepp(int ), (int)34);
                if (!var6_2) ** GOTO lbl54
                throw null;
            }
lbl131:
            // 3 sources

            case 17: {
                var5_3 /* !! */  = (int)ju.jepg("jeqr", jepp(int ), (int)35);
                if (!var6_2) ** GOTO lbl64
                throw null;
            }
            case 18: {
                var5_3 /* !! */  = (int)ju.jepg("jeqs", jepp(int ), (int)36);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 19: {
                var5_3 /* !! */  = (int)ju.jepg("jeqt", jepp(int ), (int)37);
                if (!var6_2) ** GOTO lbl79
                throw null;
            }
lbl144:
            // 2 sources

            case 20: {
                var5_3 /* !! */  = (int)ju.jepg("jequ", jepp(int ), (int)38);
                if (!var6_2) ** GOTO lbl79
                throw null;
            }
lbl148:
            // 4 sources

            case 21: {
                var5_3 /* !! */  = (int)ju.jepg("jeqv", jepp(int ), (int)39);
                if (!var6_2) ** GOTO lbl54
                throw null;
            }
            case 22: {
                var5_3 /* !! */  = (int)ju.jepg("jeqw", jepp(int ), (int)40);
                if (!var6_2) ** GOTO lbl148
                throw null;
            }
lbl156:
            // 2 sources

            case 23: {
                var5_3 /* !! */  = (int)ju.jepg("jeqx", jepp(int ), (int)41);
                if (!var6_2) ** GOTO lbl49
                throw null;
            }
lbl160:
            // 2 sources

            case 24: {
                var5_3 /* !! */  = (int)ju.jepg("jeqy", jepp(int ), (int)42);
                if (!var6_2) ** GOTO lbl79
                throw null;
            }
            case 25: {
                var5_3 /* !! */  = (int)ju.jepg("jeqz", jepp(int ), (int)43);
                if (!var6_2) ** GOTO lbl108
                throw null;
            }
lbl168:
            // 3 sources

            case 26: {
                var5_3 /* !! */  = (int)ju.jepg("jera", jepp(int ), (int)44);
                if (!var6_2) ** GOTO lbl131
                throw null;
            }
            case 27: {
                var5_3 /* !! */  = (int)ju.jepg("jerb", jepp(int ), (int)45);
                if (!var6_2) break;
                throw null;
            }
lbl176:
            // 3 sources

            case 28: {
                var5_3 /* !! */  = (int)ju.jepg("jerc", jepp(int ), (int)46);
                if (!var6_2) break;
                throw null;
            }
            case 29: {
                var5_3 /* !! */  = (int)ju.jepg("jerd", jepp(int ), (int)47);
                if (!var6_2) ** GOTO lbl144
                throw null;
            }
            case 30: {
                var5_3 /* !! */  = (int)ju.jepg("jere", jepp(int ), (int)48);
                if (!var6_2) ** GOTO lbl148
                throw null;
            }
            case 31: 
        }
        var5_3 /* !! */  = (int)ju.jepg("jerf", jepp(int ), (int)49);
        ** while (!var6_2)
lbl191:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite jepg(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void jerh() {
        ju.jepf[0] = -2021954717;
        ju.jepf[1] = 1137922297;
        ju.jepf[2] = -1482626092;
        ju.jepf[3] = -2048655977;
        ju.jepf[4] = 1192557708;
        ju.jepf[5] = -399173173;
        ju.jepf[6] = 279598583;
        ju.jepf[7] = -2028375091;
        ju.jepf[8] = -913719816;
        ju.jepf[9] = 1990852595;
        ju.jepf[10] = 81771327;
        ju.jepf[11] = -1965684683;
        ju.jepf[12] = 1110987265;
        ju.jepf[13] = -1563577507;
        ju.jepf[14] = -184895807;
        ju.jepf[15] = -2084071549;
        ju.jepf[16] = -1543661541;
        ju.jepf[17] = 695093884;
        ju.jepf[18] = -1837691226;
        ju.jepf[19] = -1375644570;
        ju.jepf[20] = -731841952;
        ju.jepf[21] = 1438505854;
        ju.jepf[22] = 1766172498;
        ju.jepf[23] = 600810970;
        ju.jepf[24] = 821661512;
        ju.jepf[25] = -1033374527;
        ju.jepf[26] = 51971272;
        ju.jepf[27] = -1581574470;
        ju.jepf[28] = -597879881;
        ju.jepf[29] = -1012815739;
        ju.jepf[30] = 1554906700;
        ju.jepf[31] = -1693308264;
        ju.jepf[32] = 1568014652;
        ju.jepf[33] = 360849377;
        ju.jepf[34] = -965113783;
        ju.jepf[35] = -579130416;
        ju.jepf[36] = -1775352681;
        ju.jepf[37] = -61019909;
        ju.jepf[38] = -45172619;
        ju.jepf[39] = 1082935002;
        ju.jepf[40] = 959469692;
        ju.jepf[41] = -1967754125;
        ju.jepf[42] = -618764238;
        ju.jepf[43] = 2138670816;
        ju.jepf[44] = -94844778;
        ju.jepf[45] = 2097051167;
        ju.jepf[46] = -1776019145;
        ju.jepf[47] = 1942849424;
        ju.jepf[48] = 1183736014;
        ju.jepf[49] = 1170414845;
    }

    private static /* synthetic */ void jerg() {
        ju.jepe[0] = 956001123;
        ju.jepe[1] = -61648647;
        ju.jepe[2] = 1736502228;
        ju.jepe[3] = -977011305;
        ju.jepe[4] = -124453748;
        ju.jepe[5] = 1471486411;
        ju.jepe[6] = -796240393;
        ju.jepe[7] = -952536115;
        ju.jepe[8] = -913719810;
        ju.jepe[9] = 1990852597;
        ju.jepe[10] = 81771327;
        ju.jepe[11] = -1965684688;
        ju.jepe[12] = 1110987266;
        ju.jepe[13] = -1563577511;
        ju.jepe[14] = -184895799;
        ju.jepe[15] = -2084071549;
        ju.jepe[16] = -1543661544;
        ju.jepe[17] = 695093882;
        ju.jepe[18] = -1837691222;
        ju.jepe[19] = -1375644555;
        ju.jepe[20] = -731841950;
        ju.jepe[21] = 1438505842;
        ju.jepe[22] = 1766172498;
        ju.jepe[23] = 600810955;
        ju.jepe[24] = 821661508;
        ju.jepe[25] = -1033374528;
        ju.jepe[26] = 51971287;
        ju.jepe[27] = -1581574494;
        ju.jepe[28] = -597879874;
        ju.jepe[29] = -1012815730;
        ju.jepe[30] = 1554906702;
        ju.jepe[31] = -1693308281;
        ju.jepe[32] = 1568014645;
        ju.jepe[33] = 360849407;
        ju.jepe[34] = -965113772;
        ju.jepe[35] = -579130419;
        ju.jepe[36] = -1775352690;
        ju.jepe[37] = -61019929;
        ju.jepe[38] = -45172629;
        ju.jepe[39] = 1082934996;
        ju.jepe[40] = 959469689;
        ju.jepe[41] = -1967754132;
        ju.jepe[42] = -618764244;
        ju.jepe[43] = 2138670817;
        ju.jepe[44] = -94844782;
        ju.jepe[45] = 2097051152;
        ju.jepe[46] = -1776019146;
        ju.jepe[47] = 1942849431;
        ju.jepe[48] = 1183736002;
        ju.jepe[49] = 1170414827;
    }

    private static /* synthetic */ int jepp(int n2) {
        return jepe[n2] ^ jepf[n2];
    }
}

