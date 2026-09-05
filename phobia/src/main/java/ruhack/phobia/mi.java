/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11909
 *  net.minecraft.class_2561
 *  net.minecraft.class_332
 *  net.minecraft.class_437
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;
import ruhack.phobia.dl;
import ruhack.phobia.ee;
import ruhack.phobia.ki;
import ruhack.phobia.kq;
import ruhack.phobia.ks;
import ruhack.phobia.kv;
import ruhack.phobia.my;
import ruhack.phobia.nd;

public final class mi
extends class_437 {
    private static long[] jfpl;
    public static final int b;
    public static final boolean a;
    private final boolean hasItems;
    private float hover;
    private final float tagHeight;
    private final float tagX;
    private static final float ITEM_GAP = 12.0f;
    private final String playerName;
    private float drawX;
    private float menuWidth;
    private float drawHeight;
    private final class_437 parent;
    private float drawWidth;
    private float menuX;
    protected static final long ri = -7419761900825741949L;
    private static final float ROUNDING = 1.25f;
    public static final boolean c;
    private static int[] jfps;
    private float menuHeight;
    private float menuY;
    private final float tagY;
    private static int[] jfpr;
    private final my transition;
    private final float tagWidth;
    private long lastFrame;
    private static long[] jfpm;
    private static final float NORMAL_GAP = 2.0f;
    private float drawY;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void method_25426() {
        v0 /* !! */  = mi.ri;
        if (true) ** GOTO lbl5
        block36: while (true) {
            v0 /* !! */  = (long)(v1 - mi.jfpn("jfqe", jfpk(int ), (int)2));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1097179642: {
                    v1 = mi.jfpn("jfqf", jfpk(int ), (int)3);
                    continue block36;
                }
                case -548539005: {
                    break block36;
                }
                case 1133820174: {
                    v1 = mi.jfpn("jfqg", jfpk(int ), (int)4);
                    continue block36;
                }
                case 1779010054: {
                    v1 = mi.jfpn("jfqh", jfpk(int ), (int)5);
                    continue block36;
                }
            }
            break;
        }
        var3_1 = mi.c;
        v2 /* !! */  = mi.ri;
        if (true) ** GOTO lbl22
        block37: while (true) {
            v2 /* !! */  = (long)(mi.jfpn("jfqj", jfpk(int ), (int)7) - mi.jfpn("jfqi", jfpk(int ), (int)6));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -548539005: {
                    break block37;
                }
                case 168799526: {
                    continue block37;
                }
            }
            break;
        }
        var2_2 /* !! */  = mi.b;
        v3 /* !! */  = mi.ri;
        if (true) ** GOTO lbl32
        block38: while (true) {
            v3 /* !! */  = (long)(v4 - mi.jfpn("jfqk", jfpk(int ), (int)8));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1785146230: {
                    v4 = mi.jfpn("jfql", jfpk(int ), (int)9);
                    continue block38;
                }
                case -548539005: {
                    break block38;
                }
                case -337552257: {
                    v4 = mi.jfpn("jfqm", jfpk(int ), (int)10);
                    continue block38;
                }
                case 2143160683: {
                    v4 = mi.jfpn("jfqn", jfpk(int ), (int)11);
                    continue block38;
                }
            }
            break;
        }
        var1_3 = mi.a;
        if (var3_1) {
            throw null;
lbl47:
            // 4 sources

            return;
        }
        if (var1_3) ** GOTO lbl47
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl47
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = mi.ri - mi.jfpn("jfqo", jfpk(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == mi.jfpn("jfqp", jfpq(int ), (int)11)) break;
                    v5 /* !! */  = (long)mi.jfpn("jfqq", jfpq(int ), (int)12);
                }
                this.updatePosition();
                if (var1_3 || var1_3) ** GOTO lbl47
                v6 /* !! */  = mi.ri;
                if (true) ** GOTO lbl65
                block41: while (true) {
                    v6 /* !! */  = (long)(v7 - mi.jfpn("jfqr", jfpk(int ), (int)13));
lbl65:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -983050317: {
                            v7 = mi.jfpn("jfqs", jfpk(int ), (int)14);
                            continue block41;
                        }
                        case -548539005: {
                            break block41;
                        }
                        case -391429493: {
                            v7 = mi.jfpn("jfqt", jfpk(int ), (int)15);
                            continue block41;
                        }
                        case -390176497: {
                            v7 = mi.jfpn("jfqu", jfpk(int ), (int)16);
                            continue block41;
                        }
                    }
                    break;
                }
                v8 = System.nanoTime();
                v9 /* !! */  = mi.ri;
                if (true) ** GOTO lbl82
                block42: while (true) {
                    v9 /* !! */  = (long)(mi.jfpn("jfqw", jfpk(int ), (int)18) - mi.jfpn("jfqv", jfpk(int ), (int)17));
lbl82:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -2043911724: {
                            continue block42;
                        }
                        case -548539005: {
                            break block42;
                        }
                    }
                    break;
                }
                this.lastFrame = v8;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl91:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)mi.jfpn("jfqx", jfpq(int ), (int)13);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl116
            }
            case 1: {
                var2_2 /* !! */  = (int)mi.jfpn("jfqy", jfpq(int ), (int)14);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)mi.jfpn("jfqz", jfpq(int ), (int)15);
                } while (!var3_1);
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)mi.jfpn("jfra", jfpq(int ), (int)16);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl111:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)mi.jfpn("jfrb", jfpq(int ), (int)17);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl116:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)mi.jfpn("jfrc", jfpq(int ), (int)18);
                if (!var3_1) ** GOTO lbl91
                throw null;
            }
lbl120:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)mi.jfpn("jfrd", jfpq(int ), (int)19);
                if (!var3_1) break;
                throw null;
            }
            case 7: 
        }
        do {
            var2_2 /* !! */  = (int)mi.jfpn("jfre", jfpq(int ), (int)20);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean containsMenu(float var1_1, float var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mi.ri - mi.jfpn("jgde", jfpk(int ), (int)96)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mi.jfpn("jgdf", jfpq(int ), (int)254)) break;
            v0 /* !! */  = (long)mi.jfpn("jgdg", jfpq(int ), (int)255);
        }
        var5_3 = mi.c;
        v1 /* !! */  = mi.ri;
        if (true) ** GOTO lbl12
        block34: while (true) {
            v1 /* !! */  = (long)(v2 - mi.jfpn("jgdh", jfpk(int ), (int)97));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2097340930: {
                    v2 = mi.jfpn("jgdi", jfpk(int ), (int)98);
                    continue block34;
                }
                case -548539005: {
                    break block34;
                }
                case 1022134858: {
                    v2 = mi.jfpn("jgdj", jfpk(int ), (int)99);
                    continue block34;
                }
                case 1927637150: {
                    v2 = mi.jfpn("jgdk", jfpk(int ), (int)100);
                    continue block34;
                }
            }
            break;
        }
        var4_4 /* !! */  = mi.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mi.ri - mi.jfpn("jgdl", jfpk(int ), (int)101)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mi.jfpn("jgdm", jfpq(int ), (int)256)) break;
            v3 /* !! */  = (long)mi.jfpn("jgdn", jfpq(int ), (int)257);
        }
        var3_5 = mi.a;
        if (var5_3) {
            throw null;
lbl34:
            // 6 sources

            return (boolean)mi.jfpn("jgdo", jfpq(int ), (int)258);
        }
        if (var3_5 || var3_5) ** GOTO lbl34
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = mi.ri - mi.jfpn("jgdp", jfpk(int ), (int)102)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == mi.jfpn("jgdq", jfpq(int ), (int)259)) break;
            v4 /* !! */  = (long)mi.jfpn("jgdr", jfpq(int ), (int)260);
        }
        if (!(var1_1 >= this.menuX)) ** GOTO lbl105
        if (var3_5) ** GOTO lbl34
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = mi.ri - mi.jfpn("jgds", jfpk(int ), (int)103)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == mi.jfpn("jgdt", jfpq(int ), (int)261)) break;
            v5 /* !! */  = (long)mi.jfpn("jgdu", jfpq(int ), (int)262);
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_4 = mi.ri - mi.jfpn("jgdv", jfpk(int ), (int)104)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 /* !! */  == mi.jfpn("jgdw", jfpq(int ), (int)263)) break;
            v6 /* !! */  = (long)mi.jfpn("jgdx", jfpq(int ), (int)264);
        }
        if (!(var1_1 <= this.menuX + this.menuWidth)) ** GOTO lbl105
        if (var3_5) ** GOTO lbl34
        v7 /* !! */  = mi.ri;
        if (true) ** GOTO lbl63
        block40: while (true) {
            v7 /* !! */  = (long)(mi.jfpn("jgdz", jfpk(int ), (int)106) - mi.jfpn("jgdy", jfpk(int ), (int)105));
lbl63:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -548539005: {
                    break block40;
                }
                case -116846575: {
                    continue block40;
                }
            }
            break;
        }
        if (!(var2_2 >= this.menuY)) ** GOTO lbl105
        if (var3_5) ** GOTO lbl34
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v8 /* !! */  = mi.ri;
                if (true) ** GOTO lbl77
                block41: while (true) {
                    v8 /* !! */  = (long)(v9 - mi.jfpn("jgea", jfpk(int ), (int)107));
lbl77:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1994140085: {
                            v9 = mi.jfpn("jgeb", jfpk(int ), (int)108);
                            continue block41;
                        }
                        case -735127639: {
                            v9 = mi.jfpn("jgec", jfpk(int ), (int)109);
                            continue block41;
                        }
                        case -548539005: {
                            break block41;
                        }
                    }
                    break;
                }
                v10 /* !! */  = mi.ri;
                if (true) ** GOTO lbl90
                block42: while (true) {
                    v10 /* !! */  = (long)(v11 - mi.jfpn("jged", jfpk(int ), (int)110));
lbl90:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1816868228: {
                            v11 = mi.jfpn("jgee", jfpk(int ), (int)111);
                            continue block42;
                        }
                        case -548539005: {
                            break block42;
                        }
                        case -188382182: {
                            v11 = mi.jfpn("jgef", jfpk(int ), (int)112);
                            continue block42;
                        }
                    }
                    break;
                }
                if (!(var2_2 <= this.menuY + this.menuHeight)) ** GOTO lbl105
                if (var3_5) ** GOTO lbl34
                v12 = mi.jfpn("jgeg", jfpq(int ), (int)265);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl108
lbl105:
                // 4 sources

                if (!var3_5 && !var3_5) ** break;
                ** continue;
                v12 = mi.jfpn("jgeh", jfpq(int ), (int)266);
lbl108:
                // 2 sources

                return (boolean)v12;
            }
            case 0: {
                var4_4 /* !! */  = (int)mi.jfpn("jgei", jfpq(int ), (int)267);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl114:
            // 3 sources

            case 1: {
                do {
                    var4_4 /* !! */  = (int)mi.jfpn("jgej", jfpq(int ), (int)268);
                } while (!var5_3);
                throw null;
            }
lbl119:
            // 2 sources

            case 2: {
                var4_4 /* !! */  = (int)mi.jfpn("jgek", jfpq(int ), (int)269);
                if (!var5_3) ** GOTO lbl114
                throw null;
            }
lbl123:
            // 2 sources

            case 3: {
                var4_4 /* !! */  = (int)mi.jfpn("jgel", jfpq(int ), (int)270);
                if (!var5_3) ** GOTO lbl114
                throw null;
            }
            case 4: {
                do {
                    var4_4 /* !! */  = (int)mi.jfpn("jgem", jfpq(int ), (int)271);
                } while (!var5_3);
                throw null;
            }
lbl132:
            // 2 sources

            case 5: {
                var4_4 /* !! */  = (int)mi.jfpn("jgen", jfpq(int ), (int)272);
                if (!var5_3) ** GOTO lbl119
                throw null;
            }
            case 6: {
                do {
                    var4_4 /* !! */  = (int)mi.jfpn("jgeo", jfpq(int ), (int)273);
                } while (!var5_3);
                throw null;
            }
            case 7: {
                var4_4 /* !! */  = (int)mi.jfpn("jgep", jfpq(int ), (int)274);
                if (var5_3) {
                    throw null;
                }
            }
            case 8: {
                var4_4 /* !! */  = (int)mi.jfpn("jgeq", jfpq(int ), (int)275);
                if (!var5_3) break;
                throw null;
            }
            case 9: {
                var4_4 /* !! */  = (int)mi.jfpn("jger", jfpq(int ), (int)276);
                if (!var5_3) ** GOTO lbl132
                throw null;
            }
            case 10: 
        }
        do {
            var4_4 /* !! */  = (int)mi.jfpn("jges", jfpq(int ), (int)277);
        } while (!var5_3);
        throw null;
    }

    private static /* synthetic */ long jfpk(int n2) {
        return jfpl[n2] ^ jfpm[n2];
    }

    private static /* synthetic */ void jghe() {
        mi.jfpl[0] = -8342165210361216351L;
        mi.jfpl[1] = -8133000062081018760L;
        mi.jfpl[2] = 6539344349493589345L;
        mi.jfpl[3] = 3441244098104514153L;
        mi.jfpl[4] = 4069201283754470446L;
        mi.jfpl[5] = 3028784414772662599L;
        mi.jfpl[6] = 5466977512344562196L;
        mi.jfpl[7] = -4709715937609808933L;
        mi.jfpl[8] = -3102498217740191294L;
        mi.jfpl[9] = 8642627683128031571L;
        mi.jfpl[10] = -7079005008760414714L;
        mi.jfpl[11] = 6304462469476980546L;
        mi.jfpl[12] = -8000024729849295885L;
        mi.jfpl[13] = 4167641309630398334L;
        mi.jfpl[14] = -5130736191485790799L;
        mi.jfpl[15] = -1849505939707249225L;
        mi.jfpl[16] = 4799527766337826577L;
        mi.jfpl[17] = -8094463437461956100L;
        mi.jfpl[18] = -5912667059001819220L;
        mi.jfpl[19] = -1929655831725427806L;
        mi.jfpl[20] = -3830743428232159127L;
        mi.jfpl[21] = -7331963321188605738L;
        mi.jfpl[22] = -2693656637878892561L;
        mi.jfpl[23] = -7626248742753413970L;
        mi.jfpl[24] = -813267510564317260L;
        mi.jfpl[25] = 2119476252228774654L;
        mi.jfpl[26] = -7442111300708176398L;
        mi.jfpl[27] = -2640004677536836933L;
        mi.jfpl[28] = 5287511998797970145L;
        mi.jfpl[29] = 5821178263178776454L;
        mi.jfpl[30] = 2033038104074694474L;
        mi.jfpl[31] = -2697446168861434941L;
        mi.jfpl[32] = 2100744751250224870L;
        mi.jfpl[33] = -7158146090766805988L;
        mi.jfpl[34] = 1549648627986117683L;
        mi.jfpl[35] = -871943514788623736L;
        mi.jfpl[36] = 5592791649540567068L;
        mi.jfpl[37] = -4284368224758840508L;
        mi.jfpl[38] = -6243064880065857364L;
        mi.jfpl[39] = -6167726125241790828L;
        mi.jfpl[40] = -3847796804830014338L;
        mi.jfpl[41] = 5995812976007492227L;
        mi.jfpl[42] = -7415617007030176677L;
        mi.jfpl[43] = 6291711380869269963L;
        mi.jfpl[44] = -2753328274726804860L;
        mi.jfpl[45] = 145828675176656241L;
        mi.jfpl[46] = 2545996339314709714L;
        mi.jfpl[47] = -5022250520607850811L;
        mi.jfpl[48] = -994028460541042911L;
        mi.jfpl[49] = 3202924753005806984L;
        mi.jfpl[50] = 3730453681548057557L;
        mi.jfpl[51] = -9094505531939298862L;
        mi.jfpl[52] = 8942973108870026994L;
        mi.jfpl[53] = -3716952176857436929L;
        mi.jfpl[54] = -5269152667932616212L;
        mi.jfpl[55] = 6472027190594350865L;
        mi.jfpl[56] = -2388863949069222841L;
        mi.jfpl[57] = -698408169720688387L;
        mi.jfpl[58] = 4947359759931948174L;
        mi.jfpl[59] = -6545945605643115650L;
        mi.jfpl[60] = 2177224977725198209L;
        mi.jfpl[61] = -2557816386778525489L;
        mi.jfpl[62] = -7806150630017915645L;
        mi.jfpl[63] = 5962245822326863461L;
        mi.jfpl[64] = -923168520680035751L;
        mi.jfpl[65] = 4294834732470127881L;
        mi.jfpl[66] = -3396958067317691897L;
        mi.jfpl[67] = 4554783690204993020L;
        mi.jfpl[68] = -6036852425923800909L;
        mi.jfpl[69] = -9029816572417787711L;
        mi.jfpl[70] = 5075148614950254797L;
        mi.jfpl[71] = -8607747507324644654L;
        mi.jfpl[72] = 4700374332608538367L;
        mi.jfpl[73] = -4750462287542662071L;
        mi.jfpl[74] = -344377973613625321L;
        mi.jfpl[75] = -856257407983774360L;
        mi.jfpl[76] = -9116647772769911194L;
        mi.jfpl[77] = -7202287636396317008L;
        mi.jfpl[78] = -8929620601165560122L;
        mi.jfpl[79] = 1450366940219724618L;
        mi.jfpl[80] = -6615931492301721992L;
        mi.jfpl[81] = 4160796001546470089L;
        mi.jfpl[82] = -6417147878174588467L;
        mi.jfpl[83] = -8470408148911022256L;
        mi.jfpl[84] = -1979924454928006886L;
        mi.jfpl[85] = 4213197236464685078L;
        mi.jfpl[86] = 6108895447943117018L;
        mi.jfpl[87] = 6485167831367018918L;
        mi.jfpl[88] = 3852727767866015586L;
        mi.jfpl[89] = 6081085541143053374L;
        mi.jfpl[90] = -2218201679319456682L;
        mi.jfpl[91] = 664988350202864250L;
        mi.jfpl[92] = 2374746142230906848L;
        mi.jfpl[93] = -2855057641284809971L;
        mi.jfpl[94] = 6858389669223295931L;
        mi.jfpl[95] = 8038061925405276415L;
        mi.jfpl[96] = -1194205403480681596L;
        mi.jfpl[97] = -4747653565601760656L;
        mi.jfpl[98] = 1518464776354184672L;
        mi.jfpl[99] = -6383239869189641236L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void centered(class_332 var1_1, String var2_2, float var3_3, float var4_4, float var5_5, int var6_6) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mi.ri - mi.jfpn("jgfw", jfpk(int ), (int)126)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == mi.jfpn("jgfx", jfpq(int ), (int)294)) break;
            v0 /* !! */  = (long)mi.jfpn("jgfy", jfpq(int ), (int)295);
        }
        var9_7 = mi.c;
        v1 /* !! */  = mi.ri;
        if (true) ** GOTO lbl11
        block27: while (true) {
            v1 /* !! */  = (long)(mi.jfpn("jgga", jfpk(int ), (int)128) - mi.jfpn("jgfz", jfpk(int ), (int)127));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -548539005: {
                    break block27;
                }
                case 1911889491: {
                    continue block27;
                }
            }
            break;
        }
        var8_8 /* !! */  = mi.b;
        v2 /* !! */  = mi.ri;
        if (true) ** GOTO lbl21
        block28: while (true) {
            v2 /* !! */  = (long)(v3 - mi.jfpn("jggb", jfpk(int ), (int)129));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1397188950: {
                    v3 = mi.jfpn("jggc", jfpk(int ), (int)130);
                    continue block28;
                }
                case -548539005: {
                    break block28;
                }
                case 301218727: {
                    v3 = mi.jfpn("jggd", jfpk(int ), (int)131);
                    continue block28;
                }
            }
            break;
        }
        var7_9 = mi.a;
        if (var8_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var9_7) {
                    throw null;
lbl36:
                    // 2 sources

                    return;
                }
                if (var7_9 || var7_9) ** GOTO lbl36
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = mi.ri - mi.jfpn("jgge", jfpk(int ), (int)132)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == mi.jfpn("jggf", jfpq(int ), (int)296)) break;
                    v4 /* !! */  = (long)mi.jfpn("jggg", jfpq(int ), (int)297);
                }
                v5 /* !! */  = mi.ri;
                if (true) ** GOTO lbl48
                block31: while (true) {
                    v5 /* !! */  = (long)(v6 - mi.jfpn("jggh", jfpk(int ), (int)133));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -987672709: {
                            v6 = mi.jfpn("jggi", jfpk(int ), (int)134);
                            continue block31;
                        }
                        case -548539005: {
                            break block31;
                        }
                        case 1431135299: {
                            v6 = mi.jfpn("jggj", jfpk(int ), (int)135);
                            continue block31;
                        }
                    }
                    break;
                }
                v7 /* !! */  = mi.ri;
                if (true) ** GOTO lbl61
                block32: while (true) {
                    v7 /* !! */  = (long)(mi.jfpn("jggl", jfpk(int ), (int)137) - mi.jfpn("jggk", jfpk(int ), (int)136));
lbl61:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -548539005: {
                            break block32;
                        }
                        case 1316012945: {
                            continue block32;
                        }
                    }
                    break;
                }
                v8 = var3_3 - kq.width(kv.BOLD, var2_2, var5_5) / 2.0f;
                v9 = mi.jfpn("jggm", jfpq(int ), (int)298);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = mi.ri - mi.jfpn("jggn", jfpk(int ), (int)138)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == mi.jfpn("jggo", jfpq(int ), (int)299)) break;
                    v10 /* !! */  = (long)mi.jfpn("jggp", jfpq(int ), (int)300);
                }
                kq.text(var1_1, kv.BOLD, var2_2, v8, var4_4, var5_5, var6_6, (boolean)v9);
                if (var7_9 || var7_9) ** continue;
                return;
            }
            case 0: {
                var8_8 /* !! */  = (int)mi.jfpn("jggq", jfpq(int ), (int)301);
                if (var9_7) {
                    throw null;
                }
                ** GOTO lbl90
            }
lbl81:
            // 2 sources

            case 1: {
                do {
                    var8_8 /* !! */  = (int)mi.jfpn("jggr", jfpq(int ), (int)302);
                } while (!var9_7);
                throw null;
            }
            case 2: {
                var8_8 /* !! */  = (int)mi.jfpn("jggs", jfpq(int ), (int)303);
                if (!var9_7) ** GOTO lbl81
                throw null;
            }
lbl90:
            // 2 sources

            case 3: {
                do {
                    var8_8 /* !! */  = (int)mi.jfpn("jggt", jfpq(int ), (int)304);
                } while (!var9_7);
                throw null;
            }
            case 4: {
                var8_8 /* !! */  = (int)mi.jfpn("jggu", jfpq(int ), (int)305);
                if (!var9_7) break;
                throw null;
            }
            case 5: 
        }
        do {
            var8_8 /* !! */  = (int)mi.jfpn("jggv", jfpq(int ), (int)306);
        } while (!var9_7);
        throw null;
    }

    private static /* synthetic */ void jggy() {
        mi.jfpr[200] = 699024864;
        mi.jfpr[201] = 114494335;
        mi.jfpr[202] = 1099509142;
        mi.jfpr[203] = 1086464803;
        mi.jfpr[204] = -902733540;
        mi.jfpr[205] = 767617131;
        mi.jfpr[206] = 323709213;
        mi.jfpr[207] = 621098517;
        mi.jfpr[208] = -1585704475;
        mi.jfpr[209] = 900317930;
        mi.jfpr[210] = 1961848755;
        mi.jfpr[211] = -328213083;
        mi.jfpr[212] = 853488429;
        mi.jfpr[213] = 1868534186;
        mi.jfpr[214] = -1213355436;
        mi.jfpr[215] = -2127769258;
        mi.jfpr[216] = -589031767;
        mi.jfpr[217] = 161644130;
        mi.jfpr[218] = -1125105568;
        mi.jfpr[219] = -2076251370;
        mi.jfpr[220] = 1525473690;
        mi.jfpr[221] = -781627836;
        mi.jfpr[222] = -640952330;
        mi.jfpr[223] = 1779168420;
        mi.jfpr[224] = -744361962;
        mi.jfpr[225] = -792939236;
        mi.jfpr[226] = -950897422;
        mi.jfpr[227] = 1987061562;
        mi.jfpr[228] = 2015619674;
        mi.jfpr[229] = -1497658306;
        mi.jfpr[230] = -1187315102;
        mi.jfpr[231] = -1740501746;
        mi.jfpr[232] = 1809111500;
        mi.jfpr[233] = -1632944568;
        mi.jfpr[234] = 980222366;
        mi.jfpr[235] = -50182091;
        mi.jfpr[236] = -270173375;
        mi.jfpr[237] = 388563524;
        mi.jfpr[238] = 406784129;
        mi.jfpr[239] = -184564210;
        mi.jfpr[240] = 1657638040;
        mi.jfpr[241] = -1005950725;
        mi.jfpr[242] = -1294945594;
        mi.jfpr[243] = 1363659688;
        mi.jfpr[244] = -829524282;
        mi.jfpr[245] = -1310250012;
        mi.jfpr[246] = -783166785;
        mi.jfpr[247] = 129535257;
        mi.jfpr[248] = -1319403861;
        mi.jfpr[249] = 1167383852;
        mi.jfpr[250] = 1319492877;
        mi.jfpr[251] = -1104808241;
        mi.jfpr[252] = -387390565;
        mi.jfpr[253] = 2046652662;
        mi.jfpr[254] = 1621212198;
        mi.jfpr[255] = 1612795477;
        mi.jfpr[256] = 510705635;
        mi.jfpr[257] = -1490755197;
        mi.jfpr[258] = 331111176;
        mi.jfpr[259] = -2108377089;
        mi.jfpr[260] = -81124267;
        mi.jfpr[261] = 561421633;
        mi.jfpr[262] = 1727723657;
        mi.jfpr[263] = -430201992;
        mi.jfpr[264] = -65141892;
        mi.jfpr[265] = 1486303024;
        mi.jfpr[266] = 673777056;
        mi.jfpr[267] = -1095072548;
        mi.jfpr[268] = -2099347332;
        mi.jfpr[269] = -20388418;
        mi.jfpr[270] = 565581586;
        mi.jfpr[271] = 1223916295;
        mi.jfpr[272] = -1704613214;
        mi.jfpr[273] = -402221566;
        mi.jfpr[274] = 108696002;
        mi.jfpr[275] = 1439409864;
        mi.jfpr[276] = -314433804;
        mi.jfpr[277] = 599222797;
        mi.jfpr[278] = -794279077;
        mi.jfpr[279] = 1254025421;
        mi.jfpr[280] = 1734525970;
        mi.jfpr[281] = 863494278;
        mi.jfpr[282] = 1546630842;
        mi.jfpr[283] = 693087051;
        mi.jfpr[284] = 756065576;
        mi.jfpr[285] = 1500025016;
        mi.jfpr[286] = 2144105200;
        mi.jfpr[287] = -864374026;
        mi.jfpr[288] = 251693496;
        mi.jfpr[289] = -1163920575;
        mi.jfpr[290] = -1619524591;
        mi.jfpr[291] = -1818185246;
        mi.jfpr[292] = 1357131893;
        mi.jfpr[293] = 690141493;
        mi.jfpr[294] = 2044522857;
        mi.jfpr[295] = 1249534150;
        mi.jfpr[296] = 772087365;
        mi.jfpr[297] = -1041414671;
        mi.jfpr[298] = -1180284301;
        mi.jfpr[299] = -822411620;
    }

    static {
        jfpr = new int[307];
        jfps = new int[307];
        mi.jggw();
        mi.jggx();
        mi.jggy();
        mi.jggz();
        mi.jgha();
        mi.jghb();
        mi.jghc();
        mi.jghd();
        jfpl = new long[139];
        jfpm = new long[139];
        mi.jghe();
        mi.jghf();
        mi.jghg();
        mi.jghh();
    }

    private static /* synthetic */ void jggx() {
        mi.jfpr[100] = -317953270;
        mi.jfpr[101] = 1562290571;
        mi.jfpr[102] = 1062477692;
        mi.jfpr[103] = 357935782;
        mi.jfpr[104] = -526696456;
        mi.jfpr[105] = 1642221323;
        mi.jfpr[106] = -276048588;
        mi.jfpr[107] = -756577096;
        mi.jfpr[108] = -1596795508;
        mi.jfpr[109] = 745431737;
        mi.jfpr[110] = 728073574;
        mi.jfpr[111] = -271719032;
        mi.jfpr[112] = -143834473;
        mi.jfpr[113] = -1232033896;
        mi.jfpr[114] = 1857325943;
        mi.jfpr[115] = 16112178;
        mi.jfpr[116] = 219450852;
        mi.jfpr[117] = 1958595503;
        mi.jfpr[118] = 1334753486;
        mi.jfpr[119] = 1946232143;
        mi.jfpr[120] = 596774470;
        mi.jfpr[121] = -768024225;
        mi.jfpr[122] = -453107597;
        mi.jfpr[123] = 1070433441;
        mi.jfpr[124] = 572718142;
        mi.jfpr[125] = 2018530895;
        mi.jfpr[126] = 1256232096;
        mi.jfpr[127] = -813894319;
        mi.jfpr[128] = 445385204;
        mi.jfpr[129] = 1957143210;
        mi.jfpr[130] = -1705718696;
        mi.jfpr[131] = -2129549160;
        mi.jfpr[132] = -590409121;
        mi.jfpr[133] = 70596696;
        mi.jfpr[134] = -1348443790;
        mi.jfpr[135] = -730148498;
        mi.jfpr[136] = -1039976934;
        mi.jfpr[137] = -49251958;
        mi.jfpr[138] = -579264202;
        mi.jfpr[139] = 1981657235;
        mi.jfpr[140] = 1845558070;
        mi.jfpr[141] = 1889776910;
        mi.jfpr[142] = -1655742302;
        mi.jfpr[143] = 1790477535;
        mi.jfpr[144] = -1734787068;
        mi.jfpr[145] = 1452437339;
        mi.jfpr[146] = -1143061421;
        mi.jfpr[147] = 1882406499;
        mi.jfpr[148] = 1126635730;
        mi.jfpr[149] = -1897628667;
        mi.jfpr[150] = -64866874;
        mi.jfpr[151] = -238281156;
        mi.jfpr[152] = -1279661636;
        mi.jfpr[153] = -1005933429;
        mi.jfpr[154] = -1339754083;
        mi.jfpr[155] = -464739506;
        mi.jfpr[156] = 1427526263;
        mi.jfpr[157] = 593106126;
        mi.jfpr[158] = 168957194;
        mi.jfpr[159] = 1389718455;
        mi.jfpr[160] = 933347167;
        mi.jfpr[161] = 1088892595;
        mi.jfpr[162] = -1879212475;
        mi.jfpr[163] = 211150944;
        mi.jfpr[164] = 2083894194;
        mi.jfpr[165] = 175790973;
        mi.jfpr[166] = 82953824;
        mi.jfpr[167] = -1716580671;
        mi.jfpr[168] = -602595427;
        mi.jfpr[169] = 1894484863;
        mi.jfpr[170] = -1854262587;
        mi.jfpr[171] = -1613863218;
        mi.jfpr[172] = -904963425;
        mi.jfpr[173] = 1875578014;
        mi.jfpr[174] = 3176818;
        mi.jfpr[175] = 268507982;
        mi.jfpr[176] = 629247955;
        mi.jfpr[177] = -1525037617;
        mi.jfpr[178] = 1998394699;
        mi.jfpr[179] = -1345401594;
        mi.jfpr[180] = -581506359;
        mi.jfpr[181] = 1635085823;
        mi.jfpr[182] = -905444433;
        mi.jfpr[183] = 237482297;
        mi.jfpr[184] = -397572850;
        mi.jfpr[185] = -1898154254;
        mi.jfpr[186] = 80640799;
        mi.jfpr[187] = -1622105304;
        mi.jfpr[188] = -1391580981;
        mi.jfpr[189] = 629113352;
        mi.jfpr[190] = -630083492;
        mi.jfpr[191] = -2133433460;
        mi.jfpr[192] = -994258832;
        mi.jfpr[193] = -143691096;
        mi.jfpr[194] = 609083216;
        mi.jfpr[195] = -2038241433;
        mi.jfpr[196] = -1412181473;
        mi.jfpr[197] = -1178721995;
        mi.jfpr[198] = 7466212;
        mi.jfpr[199] = -1860006174;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void method_25394(class_332 var1_1, int var2_2, int var3_3, float var4_4) {
        block166: {
            var24_5 = mi.c;
            var23_6 /* !! */  = mi.b;
            var22_7 = mi.a;
            if (var24_5) {
                throw null;
lbl6:
                // 43 sources

                return;
            }
            if (var22_7 || var22_7) ** GOTO lbl6
            if (this.transition.isAlive()) break block166;
            if (var22_7 || var22_7) ** GOTO lbl6
            this.finishClosing();
            if (var22_7 || var22_7) ** GOTO lbl6
            return;
        }
        if (var22_7 || var22_7) ** GOTO lbl6
        this.updatePosition();
        if (var22_7 || var22_7) ** GOTO lbl6
        var5_8 = ki.convertX(var2_2);
        if (var22_7 || var22_7) ** GOTO lbl6
        var6_9 = ki.convertY(var3_3);
        if (var22_7 || var22_7) ** GOTO lbl6
        var7_10 = dl.isFriend(this.playerName);
        if (var22_7 || var22_7) ** GOTO lbl6
        var8_11 = System.nanoTime();
        if (var22_7 || var22_7) ** GOTO lbl6
        var10_12 = this.transition.alpha();
        if (var22_7 || var22_7) ** GOTO lbl6
        var11_13 = Math.min((float)mi.jfpn("jfrg", jfrf(int ), (int)21), (float)(var8_11 - this.lastFrame) * mi.jfpn("jfrh", jfrf(int ), (int)22));
        if (var22_7 || var22_7) ** GOTO lbl6
        this.lastFrame = var8_11;
        if (var22_7) ** GOTO lbl6
        if (var23_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var23_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var22_7) ** GOTO lbl6
                if (this.transition.isClosing()) ** GOTO lbl44
                if (var22_7) ** GOTO lbl6
                if (!this.containsMenu(var5_8, var6_9)) ** GOTO lbl44
                if (var22_7) ** GOTO lbl6
                v0 = 1.0f;
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl46
lbl44:
                // 2 sources

                if (var22_7 || var22_7) ** GOTO lbl6
                v0 = var12_14 = 0.0f;
lbl46:
                // 2 sources

                if (var22_7 || var22_7) ** GOTO lbl6
                this.hover += (var12_14 - this.hover) * Math.min(1.0f, var11_13 * mi.jfpn("jfri", jfrf(int ), (int)23));
                if (var22_7 || var22_7) ** GOTO lbl6
                var13_15 = mi.jfpn("jfrj", jfrf(int ), (int)24) + var10_12 * mi.jfpn("jfrk", jfrf(int ), (int)25);
                if (var22_7 || var22_7) ** GOTO lbl6
                var14_16 = mi.jfpn("jfrl", jfrf(int ), (int)26) + var10_12 * mi.jfpn("jfrm", jfrf(int ), (int)27);
                if (var22_7 || var22_7) ** GOTO lbl6
                this.drawWidth = this.menuWidth * var13_15;
                if (var22_7 || var22_7) ** GOTO lbl6
                this.drawHeight = this.menuHeight * var14_16;
                if (var22_7 || var22_7) ** GOTO lbl6
                this.drawX = this.menuX + (this.menuWidth - this.drawWidth) / 2.0f;
                if (var22_7 || var22_7) ** GOTO lbl6
                this.drawY = this.menuY + (this.menuHeight - this.drawHeight) / 2.0f + (1.0f - var10_12) * mi.jfpn("jfrn", jfrf(int ), (int)28);
                if (var22_7 || var22_7) ** GOTO lbl6
                var15_17 = kv.BOLD;
                if (var22_7 || var22_7) ** GOTO lbl6
                if (var15_17 != null) ** GOTO lbl66
                if (var22_7) ** GOTO lbl6
                return;
lbl66:
                // 1 sources

                if (var22_7 || var22_7) ** GOTO lbl6
                if (!var7_10) ** GOTO lbl73
                if (var22_7) ** GOTO lbl6
                v1 = nd.rgba((int)mi.jfpn("jfro", jfpq(int ), (int)29), (int)mi.jfpn("jfrp", jfpq(int ), (int)30), (int)mi.jfpn("jfrq", jfpq(int ), (int)31), (int)mi.jfpn("jfrr", jfpq(int ), (int)32));
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl75
lbl73:
                // 1 sources

                if (var22_7 || var22_7) ** GOTO lbl6
                v1 = var16_18 = nd.getClientColor();
lbl75:
                // 2 sources

                if (var22_7 || var22_7) ** GOTO lbl6
                var17_19 = nd.multAlpha(nd.rgba((int)mi.jfpn("jfrs", jfpq(int ), (int)33), (int)mi.jfpn("jfrt", jfpq(int ), (int)34), (int)mi.jfpn("jfru", jfpq(int ), (int)35), (int)mi.jfpn("jfrv", jfpq(int ), (int)36)), var10_12);
                if (var22_7 || var22_7) ** GOTO lbl6
                ki.blur(var1_1, this.drawX, this.drawY, this.drawWidth, this.drawHeight, (float)(mi.jfpn("jfrw", jfrf(int ), (int)37) * var14_16), (float)(mi.jfpn("jfrx", jfrf(int ), (int)38) * var10_12), (boolean)mi.jfpn("jfry", jfpq(int ), (int)39));
                if (var22_7 || var22_7) ** GOTO lbl6
                ki.rect(var1_1, this.drawX, this.drawY, this.drawWidth, this.drawHeight, (float)(mi.jfpn("jfrz", jfrf(int ), (int)40) * var14_16), var17_19, (boolean)mi.jfpn("jfsa", jfpq(int ), (int)41));
                if (var22_7 || var22_7) ** GOTO lbl6
                if (!(this.hover > mi.jfpn("jfsb", jfrf(int ), (int)42))) ** GOTO lbl93
                if (var22_7 || var22_7) ** GOTO lbl6
                v2 = mi.jfpn("jfsc", jfrf(int ), (int)43) * var14_16;
                if (var7_10) {
                    v3 = mi.jfpn("jfsd", jfrf(int ), (int)44);
                    if (var24_5) {
                        throw null;
                    }
                } else {
                    v3 = mi.jfpn("jfse", jfrf(int ), (int)45);
                }
                ki.rect(var1_1, this.drawX, this.drawY, this.drawWidth, this.drawHeight, (float)v2, nd.multAlpha(var16_18, this.hover * var10_12 * v3), (boolean)mi.jfpn("jfsf", jfpq(int ), (int)46));
                if (var22_7) ** GOTO lbl6
lbl93:
                // 2 sources

                if (var22_7 || var22_7) ** GOTO lbl6
                if (!var7_10) ** GOTO lbl100
                if (var22_7) ** GOTO lbl6
                v4 = "\u0423\u0434\u0430\u043b\u0438\u0442\u044c \u0438\u0437 \u0434\u0440\u0443\u0437\u0435\u0439";
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl102
lbl100:
                // 1 sources

                if (var22_7 || var22_7) ** GOTO lbl6
                v4 = var18_20 = "\u0414\u043e\u0431\u0430\u0432\u0438\u0442\u044c \u0432 \u0434\u0440\u0443\u0437\u044c\u044f";
lbl102:
                // 2 sources

                if (var22_7 || var22_7) ** GOTO lbl6
                var19_21 = this.fittedTextSize(var15_17, var18_20, (float)(mi.jfpn("jfsg", jfrf(int ), (int)47) * var14_16), Math.max(1.0f, this.drawWidth - mi.jfpn("jfsh", jfrf(int ), (int)48)));
                if (var22_7 || var22_7) ** GOTO lbl6
                var20_22 = this.drawY + (this.drawHeight - kq.height(var15_17, var19_21)) / 2.0f;
                if (var22_7 || var22_7) ** GOTO lbl6
                var21_23 = nd.interpolateColor(nd.rgba((int)mi.jfpn("jfsi", jfpq(int ), (int)49), (int)mi.jfpn("jfsj", jfpq(int ), (int)50), (int)mi.jfpn("jfsk", jfpq(int ), (int)51), (int)mi.jfpn("jfsl", jfpq(int ), (int)52)), var16_18, this.hover);
                if (var22_7 || var22_7) ** GOTO lbl6
                this.centered(var1_1, var18_20, this.drawX + this.drawWidth / 2.0f, var20_22, var19_21, nd.multAlpha(var21_23, var10_12));
                if (!var22_7 && !var22_7) ** break;
                ** continue;
                return;
            }
lbl113:
            // 2 sources

            case 0: {
                var23_6 /* !! */  = (int)mi.jfpn("jfsm", jfpq(int ), (int)53);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl416
            }
lbl118:
            // 2 sources

            case 1: {
                var23_6 /* !! */  = (int)mi.jfpn("jfsn", jfpq(int ), (int)54);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl153
            }
lbl123:
            // 3 sources

            case 2: {
                var23_6 /* !! */  = (int)mi.jfpn("jfso", jfpq(int ), (int)55);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl389
            }
lbl128:
            // 2 sources

            case 3: {
                var23_6 /* !! */  = (int)mi.jfpn("jfsp", jfpq(int ), (int)56);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl243
            }
            case 4: {
                var23_6 /* !! */  = (int)mi.jfpn("jfsq", jfpq(int ), (int)57);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl358
            }
lbl138:
            // 4 sources

            case 5: {
                var23_6 /* !! */  = (int)mi.jfpn("jfsr", jfpq(int ), (int)58);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl319
            }
lbl143:
            // 2 sources

            case 6: {
                var23_6 /* !! */  = (int)mi.jfpn("jfss", jfpq(int ), (int)59);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 7: {
                var23_6 /* !! */  = (int)mi.jfpn("jfst", jfpq(int ), (int)60);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl153:
            // 2 sources

            case 8: {
                var23_6 /* !! */  = (int)mi.jfpn("jfsu", jfpq(int ), (int)61);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl416
            }
            case 9: {
                var23_6 /* !! */  = (int)mi.jfpn("jfsv", jfpq(int ), (int)62);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl437
            }
            case 10: {
                var23_6 /* !! */  = (int)mi.jfpn("jfsw", jfpq(int ), (int)63);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl319
            }
lbl168:
            // 6 sources

            case 11: {
                var23_6 /* !! */  = (int)mi.jfpn("jfsx", jfpq(int ), (int)64);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl393
            }
            case 12: {
                var23_6 /* !! */  = (int)mi.jfpn("jfsy", jfpq(int ), (int)65);
                if (!var24_5) ** GOTO lbl123
                throw null;
            }
lbl177:
            // 2 sources

            case 13: {
                var23_6 /* !! */  = (int)mi.jfpn("jfsz", jfpq(int ), (int)66);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl353
            }
lbl182:
            // 2 sources

            case 14: {
                var23_6 /* !! */  = (int)mi.jfpn("jfta", jfpq(int ), (int)67);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl393
            }
lbl187:
            // 2 sources

            case 15: {
                var23_6 /* !! */  = (int)mi.jfpn("jftb", jfpq(int ), (int)68);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl481
            }
lbl192:
            // 2 sources

            case 16: {
                var23_6 /* !! */  = (int)mi.jfpn("jftc", jfpq(int ), (int)69);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl221
            }
            case 17: {
                var23_6 /* !! */  = (int)mi.jfpn("jftd", jfpq(int ), (int)70);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl416
            }
            case 18: {
                var23_6 /* !! */  = (int)mi.jfpn("jfte", jfpq(int ), (int)71);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl314
            }
lbl207:
            // 2 sources

            case 19: {
                var23_6 /* !! */  = (int)mi.jfpn("jftf", jfpq(int ), (int)72);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl212:
            // 3 sources

            case 20: {
                var23_6 /* !! */  = (int)mi.jfpn("jftg", jfpq(int ), (int)73);
                if (!var24_5) ** GOTO lbl182
                throw null;
            }
lbl216:
            // 2 sources

            case 21: {
                var23_6 /* !! */  = (int)mi.jfpn("jfth", jfpq(int ), (int)74);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl380
            }
lbl221:
            // 2 sources

            case 22: {
                var23_6 /* !! */  = (int)mi.jfpn("jfti", jfpq(int ), (int)75);
                if (!var24_5) ** GOTO lbl168
                throw null;
            }
lbl225:
            // 3 sources

            case 23: {
                var23_6 /* !! */  = (int)mi.jfpn("jftj", jfpq(int ), (int)76);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl271
            }
            case 24: {
                var23_6 /* !! */  = (int)mi.jfpn("jftk", jfpq(int ), (int)77);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl235:
            // 3 sources

            case 25: {
                var23_6 /* !! */  = (int)mi.jfpn("jftl", jfpq(int ), (int)78);
                if (!var24_5) ** GOTO lbl128
                throw null;
            }
lbl239:
            // 3 sources

            case 26: {
                var23_6 /* !! */  = (int)mi.jfpn("jftm", jfpq(int ), (int)79);
                if (!var24_5) ** GOTO lbl168
                throw null;
            }
lbl243:
            // 4 sources

            case 27: {
                var23_6 /* !! */  = (int)mi.jfpn("jftn", jfpq(int ), (int)80);
                if (!var24_5) ** GOTO lbl113
                throw null;
            }
lbl247:
            // 2 sources

            case 28: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var23_6 /* !! */  = (int)mi.jfpn("jfto", jfpq(int ), (int)81);
                    if (var24_5) {
                        throw null;
                    }
                    ** GOTO lbl453
                    break;
                }
            }
            case 29: {
                var23_6 /* !! */  = (int)mi.jfpn("jftp", jfpq(int ), (int)82);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl336
            }
            case 30: {
                var23_6 /* !! */  = (int)mi.jfpn("jftq", jfpq(int ), (int)83);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl300
            }
            case 31: {
                var23_6 /* !! */  = (int)mi.jfpn("jftr", jfpq(int ), (int)84);
                if (!var24_5) ** GOTO lbl212
                throw null;
            }
            case 32: {
                var23_6 /* !! */  = (int)mi.jfpn("jfts", jfpq(int ), (int)85);
                if (!var24_5) ** GOTO lbl138
                throw null;
            }
lbl271:
            // 3 sources

            case 33: {
                var23_6 /* !! */  = (int)mi.jfpn("jftt", jfpq(int ), (int)86);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl445
            }
lbl276:
            // 2 sources

            case 34: {
                var23_6 /* !! */  = (int)mi.jfpn("jftu", jfpq(int ), (int)87);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl389
            }
lbl281:
            // 2 sources

            case 35: {
                var23_6 /* !! */  = (int)mi.jfpn("jftv", jfpq(int ), (int)88);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl416
            }
lbl286:
            // 2 sources

            case 36: {
                var23_6 /* !! */  = (int)mi.jfpn("jftw", jfpq(int ), (int)89);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl453
            }
            case 37: {
                var23_6 /* !! */  = (int)mi.jfpn("jftx", jfpq(int ), (int)90);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl380
            }
            case 38: {
                var23_6 /* !! */  = (int)mi.jfpn("jfty", jfpq(int ), (int)91);
                if (!var24_5) ** GOTO lbl276
                throw null;
            }
lbl300:
            // 3 sources

            case 39: {
                var23_6 /* !! */  = (int)mi.jfpn("jftz", jfpq(int ), (int)92);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl376
            }
lbl305:
            // 2 sources

            case 40: {
                var23_6 /* !! */  = (int)mi.jfpn("jfua", jfpq(int ), (int)93);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl433
            }
            case 41: {
                var23_6 /* !! */  = (int)mi.jfpn("jfub", jfpq(int ), (int)94);
                if (!var24_5) ** GOTO lbl243
                throw null;
            }
lbl314:
            // 2 sources

            case 42: {
                var23_6 /* !! */  = (int)mi.jfpn("jfuc", jfpq(int ), (int)95);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl425
            }
lbl319:
            // 3 sources

            case 43: {
                var23_6 /* !! */  = (int)mi.jfpn("jfud", jfpq(int ), (int)96);
                if (!var24_5) ** GOTO lbl271
                throw null;
            }
            case 44: {
                var23_6 /* !! */  = (int)mi.jfpn("jfue", jfpq(int ), (int)97);
                if (!var24_5) ** GOTO lbl212
                throw null;
            }
            case 45: {
                var23_6 /* !! */  = (int)mi.jfpn("jfuf", jfpq(int ), (int)98);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl473
            }
            case 46: {
                var23_6 /* !! */  = (int)mi.jfpn("jfug", jfpq(int ), (int)99);
                if (!var24_5) ** GOTO lbl305
                throw null;
            }
lbl336:
            // 2 sources

            case 47: {
                var23_6 /* !! */  = (int)mi.jfpn("jfuh", jfpq(int ), (int)100);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl363
            }
lbl341:
            // 2 sources

            case 48: {
                var23_6 /* !! */  = (int)mi.jfpn("jfui", jfpq(int ), (int)101);
                if (!var24_5) ** GOTO lbl123
                throw null;
            }
            case 49: {
                var23_6 /* !! */  = (int)mi.jfpn("jfuj", jfpq(int ), (int)102);
                if (!var24_5) ** GOTO lbl138
                throw null;
            }
            case 50: {
                var23_6 /* !! */  = (int)mi.jfpn("jfuk", jfpq(int ), (int)103);
                if (!var24_5) ** GOTO lbl225
                throw null;
            }
lbl353:
            // 3 sources

            case 51: {
                var23_6 /* !! */  = (int)mi.jfpn("jful", jfpq(int ), (int)104);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl406
            }
lbl358:
            // 2 sources

            case 52: {
                var23_6 /* !! */  = (int)mi.jfpn("jfum", jfpq(int ), (int)105);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl437
            }
lbl363:
            // 2 sources

            case 53: {
                var23_6 /* !! */  = (int)mi.jfpn("jfun", jfpq(int ), (int)106);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl411
            }
            case 54: {
                var23_6 /* !! */  = (int)mi.jfpn("jfuo", jfpq(int ), (int)107);
                if (!var24_5) ** GOTO lbl239
                throw null;
            }
            case 55: {
                var23_6 /* !! */  = (int)mi.jfpn("jfup", jfpq(int ), (int)108);
                if (!var24_5) ** GOTO lbl143
                throw null;
            }
lbl376:
            // 2 sources

            case 56: {
                var23_6 /* !! */  = (int)mi.jfpn("jfuq", jfpq(int ), (int)109);
                if (!var24_5) ** GOTO lbl187
                throw null;
            }
lbl380:
            // 3 sources

            case 57: {
                var23_6 /* !! */  = (int)mi.jfpn("jfur", jfpq(int ), (int)110);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl441
            }
            case 58: {
                var23_6 /* !! */  = (int)mi.jfpn("jfus", jfpq(int ), (int)111);
                if (!var24_5) ** GOTO lbl207
                throw null;
            }
lbl389:
            // 3 sources

            case 59: {
                var23_6 /* !! */  = (int)mi.jfpn("jfut", jfpq(int ), (int)112);
                if (!var24_5) ** GOTO lbl243
                throw null;
            }
lbl393:
            // 3 sources

            case 60: {
                var23_6 /* !! */  = (int)mi.jfpn("jfuu", jfpq(int ), (int)113);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl469
            }
            case 61: {
                var23_6 /* !! */  = (int)mi.jfpn("jfuv", jfpq(int ), (int)114);
                if (!var24_5) ** GOTO lbl216
                throw null;
            }
            case 62: {
                var23_6 /* !! */  = (int)mi.jfpn("jfuw", jfpq(int ), (int)115);
                if (!var24_5) ** GOTO lbl353
                throw null;
            }
lbl406:
            // 2 sources

            case 63: {
                var23_6 /* !! */  = (int)mi.jfpn("jfux", jfpq(int ), (int)116);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl429
            }
lbl411:
            // 2 sources

            case 64: {
                var23_6 /* !! */  = (int)mi.jfpn("jfuy", jfpq(int ), (int)117);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl461
            }
lbl416:
            // 6 sources

            case 65: {
                var23_6 /* !! */  = (int)mi.jfpn("jfuz", jfpq(int ), (int)118);
                if (!var24_5) ** GOTO lbl225
                throw null;
            }
            case 66: {
                var23_6 /* !! */  = (int)mi.jfpn("jfva", jfpq(int ), (int)119);
                if (var24_5) {
                    throw null;
                }
                ** GOTO lbl457
            }
lbl425:
            // 2 sources

            case 67: {
                var23_6 /* !! */  = (int)mi.jfpn("jfvb", jfpq(int ), (int)120);
                if (!var24_5) ** GOTO lbl300
                throw null;
            }
lbl429:
            // 2 sources

            case 68: {
                var23_6 /* !! */  = (int)mi.jfpn("jfvc", jfpq(int ), (int)121);
                if (!var24_5) ** GOTO lbl247
                throw null;
            }
lbl433:
            // 2 sources

            case 69: {
                var23_6 /* !! */  = (int)mi.jfpn("jfvd", jfpq(int ), (int)122);
                if (!var24_5) break;
                throw null;
            }
lbl437:
            // 3 sources

            case 70: {
                var23_6 /* !! */  = (int)mi.jfpn("jfve", jfpq(int ), (int)123);
                if (!var24_5) ** GOTO lbl235
                throw null;
            }
lbl441:
            // 2 sources

            case 71: {
                var23_6 /* !! */  = (int)mi.jfpn("jfvf", jfpq(int ), (int)124);
                if (!var24_5) ** GOTO lbl168
                throw null;
            }
lbl445:
            // 2 sources

            case 72: {
                var23_6 /* !! */  = (int)mi.jfpn("jfvg", jfpq(int ), (int)125);
                if (!var24_5) ** GOTO lbl341
                throw null;
            }
lbl449:
            // 2 sources

            case 73: {
                var23_6 /* !! */  = (int)mi.jfpn("jfvh", jfpq(int ), (int)126);
                if (!var24_5) ** GOTO lbl416
                throw null;
            }
lbl453:
            // 3 sources

            case 74: {
                var23_6 /* !! */  = (int)mi.jfpn("jfvi", jfpq(int ), (int)127);
                if (!var24_5) ** GOTO lbl235
                throw null;
            }
lbl457:
            // 2 sources

            case 75: {
                var23_6 /* !! */  = (int)mi.jfpn("jfvj", jfpq(int ), (int)128);
                if (!var24_5) ** GOTO lbl192
                throw null;
            }
lbl461:
            // 2 sources

            case 76: {
                var23_6 /* !! */  = (int)mi.jfpn("jfvk", jfpq(int ), (int)129);
                if (!var24_5) ** GOTO lbl286
                throw null;
            }
            case 77: {
                var23_6 /* !! */  = (int)mi.jfpn("jfvl", jfpq(int ), (int)130);
                if (!var24_5) ** GOTO lbl118
                throw null;
            }
lbl469:
            // 2 sources

            case 78: {
                var23_6 /* !! */  = (int)mi.jfpn("jfvm", jfpq(int ), (int)131);
                if (!var24_5) ** GOTO lbl449
                throw null;
            }
lbl473:
            // 2 sources

            case 79: {
                var23_6 /* !! */  = (int)mi.jfpn("jfvn", jfpq(int ), (int)132);
                if (var24_5) {
                    throw null;
                }
            }
            case 80: {
                var23_6 /* !! */  = (int)mi.jfpn("jfvo", jfpq(int ), (int)133);
                if (!var24_5) ** GOTO lbl138
                throw null;
            }
lbl481:
            // 2 sources

            case 81: {
                var23_6 /* !! */  = (int)mi.jfpn("jfvp", jfpq(int ), (int)134);
                if (!var24_5) ** GOTO lbl177
                throw null;
            }
            case 82: 
        }
        var23_6 /* !! */  = (int)mi.jfpn("jfvq", jfpq(int ), (int)135);
        ** while (!var24_5)
lbl488:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean method_25421() {
        v0 /* !! */  = mi.ri;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(mi.jfpn("jfxj", jfpk(int ), (int)20) - mi.jfpn("jfxi", jfpk(int ), (int)19));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -548539005: {
                    break block15;
                }
                case 196814198: {
                    continue block15;
                }
            }
            break;
        }
        var3_1 = mi.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = mi.ri - mi.jfpn("jfxk", jfpk(int ), (int)21)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mi.jfpn("jfxl", jfpq(int ), (int)179)) break;
            v1 /* !! */  = (long)mi.jfpn("jfxm", jfpq(int ), (int)180);
        }
        var2_2 /* !! */  = mi.b;
        v2 /* !! */  = mi.ri;
        if (true) ** GOTO lbl22
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - mi.jfpn("jfxn", jfpk(int ), (int)22));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1989358075: {
                    v3 = mi.jfpn("jfxo", jfpk(int ), (int)23);
                    continue block17;
                }
                case -548539005: {
                    break block17;
                }
                case 569550635: {
                    v3 = mi.jfpn("jfxp", jfpk(int ), (int)24);
                    continue block17;
                }
            }
            break;
        }
        var1_3 = mi.a;
        if (!var3_1) ** GOTO lbl38
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)mi.jfpn("jfxq", jfpq(int ), (int)181);
                }
lbl38:
                // 1 sources

                if (var1_3 || var1_3) continue block18;
                return (boolean)mi.jfpn("jfxr", jfpq(int ), (int)182);
                case 0: {
                    var2_2 /* !! */  = (int)mi.jfpn("jfxs", jfpq(int ), (int)183);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl49
                }
                case 1: {
                    var2_2 /* !! */  = (int)mi.jfpn("jfxt", jfpq(int ), (int)184);
                    if (var3_1) {
                        throw null;
                    }
                }
lbl49:
                // 4 sources

                case 2: {
                    do {
                        var2_2 /* !! */  = (int)mi.jfpn("jfxu", jfpq(int ), (int)185);
                    } while (!var3_1);
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)mi.jfpn("jfxv", jfpq(int ), (int)186);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void method_25419() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mi.ri - mi.jfpn("jfxw", jfpk(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mi.jfpn("jfxx", jfpq(int ), (int)187)) break;
            v0 /* !! */  = (long)mi.jfpn("jfxy", jfpq(int ), (int)188);
        }
        var3_1 = mi.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mi.ri - mi.jfpn("jfxz", jfpk(int ), (int)26)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mi.jfpn("jfya", jfpq(int ), (int)189)) break;
            v1 /* !! */  = (long)mi.jfpn("jfyb", jfpq(int ), (int)190);
        }
        var2_2 /* !! */  = mi.b;
        v2 /* !! */  = mi.ri;
        if (true) ** GOTO lbl19
        block26: while (true) {
            v2 /* !! */  = (long)(v3 - mi.jfpn("jfyc", jfpk(int ), (int)27));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1228274176: {
                    v3 = mi.jfpn("jfyd", jfpk(int ), (int)28);
                    continue block26;
                }
                case -961355220: {
                    v3 = mi.jfpn("jfye", jfpk(int ), (int)29);
                    continue block26;
                }
                case -548539005: {
                    break block26;
                }
            }
            break;
        }
        var1_3 = mi.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl31
        v4 /* !! */  = mi.ri;
        if (true) ** GOTO lbl38
        block28: while (true) {
            v4 /* !! */  = (long)(v5 - mi.jfpn("jfyf", jfpk(int ), (int)30));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -548539005: {
                    break block28;
                }
                case 428354412: {
                    v5 = mi.jfpn("jfyg", jfpk(int ), (int)31);
                    continue block28;
                }
                case 1877467942: {
                    v5 = mi.jfpn("jfyh", jfpk(int ), (int)32);
                    continue block28;
                }
            }
            break;
        }
        v6 /* !! */  = mi.ri;
        if (true) ** GOTO lbl51
        block29: while (true) {
            v6 /* !! */  = (long)(v7 - mi.jfpn("jfyi", jfpk(int ), (int)33));
lbl51:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1578790048: {
                    v7 = mi.jfpn("jfyj", jfpk(int ), (int)34);
                    continue block29;
                }
                case -847808362: {
                    v7 = mi.jfpn("jfyk", jfpk(int ), (int)35);
                    continue block29;
                }
                case -548539005: {
                    break block29;
                }
                case 1795167406: {
                    v7 = mi.jfpn("jfyl", jfpk(int ), (int)36);
                    continue block29;
                }
            }
            break;
        }
        this.transition.close();
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)mi.jfpn("jfym", jfpq(int ), (int)191);
                if (!var3_1) break;
                throw null;
            }
lbl73:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)mi.jfpn("jfyn", jfpq(int ), (int)192);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)mi.jfpn("jfyo", jfpq(int ), (int)193);
                if (var3_1) {
                    throw null;
                }
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mi.jfpn("jfyp", jfpq(int ), (int)194);
                    if (!var3_1) ** GOTO lbl73
                    throw null;
                }
            }
            case 4: {
                do {
                    var2_2 /* !! */  = (int)mi.jfpn("jfyq", jfpq(int ), (int)195);
                } while (!var3_1);
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)mi.jfpn("jfyr", jfpq(int ), (int)196);
        ** while (!var3_1)
lbl94:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jghh() {
        mi.jfpm[100] = -5416177012768043268L;
        mi.jfpm[101] = 7914399928211564639L;
        mi.jfpm[102] = 6718470066182474026L;
        mi.jfpm[103] = 3402338369498240095L;
        mi.jfpm[104] = 6410938119299884325L;
        mi.jfpm[105] = 5975763849716733951L;
        mi.jfpm[106] = 2025511924809792853L;
        mi.jfpm[107] = -4623565240036077312L;
        mi.jfpm[108] = 2769156046943464383L;
        mi.jfpm[109] = 3522311754982415745L;
        mi.jfpm[110] = -5879733723751497005L;
        mi.jfpm[111] = 3386757038750661901L;
        mi.jfpm[112] = 5289903005354155859L;
        mi.jfpm[113] = -6407139292126094114L;
        mi.jfpm[114] = 5335646966183262240L;
        mi.jfpm[115] = 419361620489552896L;
        mi.jfpm[116] = -1942830104557298923L;
        mi.jfpm[117] = -6286235732972766638L;
        mi.jfpm[118] = -8566235148505439361L;
        mi.jfpm[119] = -4426456882029247134L;
        mi.jfpm[120] = 3878119184347427915L;
        mi.jfpm[121] = -1276871173204096012L;
        mi.jfpm[122] = 766871620694841679L;
        mi.jfpm[123] = 2967815725298962676L;
        mi.jfpm[124] = 8542778228154042193L;
        mi.jfpm[125] = 2785630510652789268L;
        mi.jfpm[126] = 5123180851187693478L;
        mi.jfpm[127] = 7874040161198331187L;
        mi.jfpm[128] = 1592502683042826270L;
        mi.jfpm[129] = -5699246036966550557L;
        mi.jfpm[130] = 6330872773322760418L;
        mi.jfpm[131] = -937846151141850596L;
        mi.jfpm[132] = 4188564790564710172L;
        mi.jfpm[133] = 8931012690994946724L;
        mi.jfpm[134] = 4708603107395013243L;
        mi.jfpm[135] = 4742855533412781734L;
        mi.jfpm[136] = -5827650396526307017L;
        mi.jfpm[137] = -7096635872052113203L;
        mi.jfpm[138] = -1595057202320564213L;
    }

    public static /* synthetic */ CallSite jfpn(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int jfpq(int n2) {
        return jfpr[n2] ^ jfps[n2];
    }

    private static /* synthetic */ void jghc() {
        mi.jfps[200] = -1184570395;
        mi.jfps[201] = -114494336;
        mi.jfps[202] = 1489094963;
        mi.jfps[203] = 1086464801;
        mi.jfps[204] = -902733543;
        mi.jfps[205] = 767617131;
        mi.jfps[206] = 323709214;
        mi.jfps[207] = 621098512;
        mi.jfps[208] = -1585704478;
        mi.jfps[209] = 900317932;
        mi.jfps[210] = 1961848756;
        mi.jfps[211] = -328213084;
        mi.jfps[212] = 542485444;
        mi.jfps[213] = -1868534187;
        mi.jfps[214] = 1143394318;
        mi.jfps[215] = 2127769257;
        mi.jfps[216] = -1049907539;
        mi.jfps[217] = -161644131;
        mi.jfps[218] = -1748294089;
        mi.jfps[219] = 2076251369;
        mi.jfps[220] = -1766810250;
        mi.jfps[221] = 781627835;
        mi.jfps[222] = -2138271360;
        mi.jfps[223] = -1779168421;
        mi.jfps[224] = 1241848069;
        mi.jfps[225] = 792939235;
        mi.jfps[226] = 914615012;
        mi.jfps[227] = -1987061563;
        mi.jfps[228] = -861734221;
        mi.jfps[229] = -402944962;
        mi.jfps[230] = 1187315101;
        mi.jfps[231] = 461639758;
        mi.jfps[232] = -1809111501;
        mi.jfps[233] = 1541006676;
        mi.jfps[234] = 980222358;
        mi.jfps[235] = -50182093;
        mi.jfps[236] = -270173376;
        mi.jfps[237] = 388563523;
        mi.jfps[238] = 406784135;
        mi.jfps[239] = -184564213;
        mi.jfps[240] = 1657638040;
        mi.jfps[241] = -1005950725;
        mi.jfps[242] = -1294945586;
        mi.jfps[243] = 1363659685;
        mi.jfps[244] = -829524283;
        mi.jfps[245] = -1310250009;
        mi.jfps[246] = -783166803;
        mi.jfps[247] = 129535251;
        mi.jfps[248] = -1319403867;
        mi.jfps[249] = 1167383855;
        mi.jfps[250] = 1319492894;
        mi.jfps[251] = -1104808247;
        mi.jfps[252] = -387390572;
        mi.jfps[253] = 2046652658;
        mi.jfps[254] = -1621212199;
        mi.jfps[255] = -1132184914;
        mi.jfps[256] = -510705636;
        mi.jfps[257] = -318481051;
        mi.jfps[258] = 331111176;
        mi.jfps[259] = 2108377088;
        mi.jfps[260] = -1729693501;
        mi.jfps[261] = -561421634;
        mi.jfps[262] = -567822022;
        mi.jfps[263] = 430201991;
        mi.jfps[264] = 210541567;
        mi.jfps[265] = 1486303025;
        mi.jfps[266] = 673777056;
        mi.jfps[267] = -1095072549;
        mi.jfps[268] = -2099347331;
        mi.jfps[269] = -20388425;
        mi.jfps[270] = 565581585;
        mi.jfps[271] = 1223916290;
        mi.jfps[272] = -1704613215;
        mi.jfps[273] = -402221566;
        mi.jfps[274] = 108696011;
        mi.jfps[275] = 1439409866;
        mi.jfps[276] = -314433804;
        mi.jfps[277] = 599222791;
        mi.jfps[278] = 794279076;
        mi.jfps[279] = 473382494;
        mi.jfps[280] = 1480245008;
        mi.jfps[281] = 1933257803;
        mi.jfps[282] = -1546630843;
        mi.jfps[283] = 1632770477;
        mi.jfps[284] = 756065576;
        mi.jfps[285] = 1500025019;
        mi.jfps[286] = 2144105204;
        mi.jfps[287] = -864374018;
        mi.jfps[288] = 251693488;
        mi.jfps[289] = -1163920573;
        mi.jfps[290] = -1619524589;
        mi.jfps[291] = -1818185238;
        mi.jfps[292] = 1357131889;
        mi.jfps[293] = 690141489;
        mi.jfps[294] = -2044522858;
        mi.jfps[295] = -357041301;
        mi.jfps[296] = -772087366;
        mi.jfps[297] = 1762625627;
        mi.jfps[298] = -1180284302;
        mi.jfps[299] = -822411619;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean method_25402(class_11909 var1_1, boolean var2_2) {
        block75: {
            block74: {
                var8_3 = mi.c;
                var7_4 /* !! */  = mi.b;
                var6_5 = mi.a;
                if (var8_3) {
                    throw null;
lbl6:
                    // 19 sources

                    return (boolean)mi.jfpn("jfvr", jfpq(int ), (int)136);
                }
                if (var6_5 || var6_5) ** GOTO lbl6
                if (!this.transition.blocksInput()) break block74;
                if (var6_5) ** GOTO lbl6
                return (boolean)mi.jfpn("jfvs", jfpq(int ), (int)137);
            }
            if (var6_5 || var6_5) ** GOTO lbl6
            if (var1_1.method_74245() == 0) break block75;
            if (var6_5) ** GOTO lbl6
            return (boolean)mi.jfpn("jfvt", jfpq(int ), (int)138);
        }
        if (var6_5 || var6_5) ** GOTO lbl6
        var3_6 = ki.convertX((float)var1_1.comp_4798());
        if (var6_5 || var6_5) ** GOTO lbl6
        var4_7 = ki.convertY((float)var1_1.comp_4799());
        if (var6_5 || var6_5) ** GOTO lbl6
        if (!this.containsMenu(var3_6, var4_7)) ** GOTO lbl48
        if (var6_5 || var6_5) ** GOTO lbl6
        var5_8 = dl.isFriend(this.playerName);
        if (var6_5 || var6_5) ** GOTO lbl6
        if (!var5_8) ** GOTO lbl39
        if (var6_5 || var6_5) ** GOTO lbl6
        dl.removeFriendAndSave(this.playerName);
        if (var7_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_5 || var6_5) ** GOTO lbl6
                ee.info("\u0418\u0433\u0440\u043e\u043a " + this.playerName + " \u0443\u0434\u0430\u043b\u0451\u043d \u0438\u0437 \u0434\u0440\u0443\u0437\u0435\u0439");
                if (var6_5) ** GOTO lbl6
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl44
            }
lbl39:
            // 1 sources

            if (var6_5 || var6_5) ** GOTO lbl6
            dl.addFriendAndSave(this.playerName);
            if (var6_5 || var6_5) ** GOTO lbl6
            ee.info("\u0418\u0433\u0440\u043e\u043a " + this.playerName + " \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d \u0432 \u0434\u0440\u0443\u0437\u044c\u044f");
            if (var6_5) ** GOTO lbl6
lbl44:
            // 2 sources

            if (var6_5 || var6_5) ** GOTO lbl6
            this.method_25419();
            if (var6_5 || var6_5) ** GOTO lbl6
            return (boolean)mi.jfpn("jfvu", jfpq(int ), (int)139);
lbl48:
            // 1 sources

            if (var6_5 || var6_5) ** GOTO lbl6
            this.method_25419();
            if (!var6_5 && !var6_5) ** break;
            ** continue;
            return (boolean)mi.jfpn("jfvv", jfpq(int ), (int)140);
            case 0: {
                var7_4 /* !! */  = (int)mi.jfpn("jfvw", jfpq(int ), (int)141);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl88
            }
            case 1: {
                var7_4 /* !! */  = (int)mi.jfpn("jfvx", jfpq(int ), (int)142);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 2: {
                var7_4 /* !! */  = (int)mi.jfpn("jfvy", jfpq(int ), (int)143);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 3: {
                var7_4 /* !! */  = (int)mi.jfpn("jfvz", jfpq(int ), (int)144);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl213
            }
            case 4: {
                var7_4 /* !! */  = (int)mi.jfpn("jfwa", jfpq(int ), (int)145);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 5: {
                var7_4 /* !! */  = (int)mi.jfpn("jfwb", jfpq(int ), (int)146);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl83:
            // 4 sources

            case 6: {
                var7_4 /* !! */  = (int)mi.jfpn("jfwc", jfpq(int ), (int)147);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl88:
            // 2 sources

            case 7: {
                var7_4 /* !! */  = (int)mi.jfpn("jfwd", jfpq(int ), (int)148);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl93:
            // 2 sources

            case 8: {
                var7_4 /* !! */  = (int)mi.jfpn("jfwe", jfpq(int ), (int)149);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl98:
            // 2 sources

            case 9: {
                var7_4 /* !! */  = (int)mi.jfpn("jfwf", jfpq(int ), (int)150);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl134
            }
            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_4 /* !! */  = (int)mi.jfpn("jfwg", jfpq(int ), (int)151);
                    if (var8_3) {
                        throw null;
                    }
                    ** GOTO lbl177
                    break;
                }
            }
            case 11: {
                var7_4 /* !! */  = (int)mi.jfpn("jfwh", jfpq(int ), (int)152);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl114:
            // 3 sources

            case 12: {
                var7_4 /* !! */  = (int)mi.jfpn("jfwi", jfpq(int ), (int)153);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl119:
            // 2 sources

            case 13: {
                var7_4 /* !! */  = (int)mi.jfpn("jfwj", jfpq(int ), (int)154);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl124:
            // 3 sources

            case 14: {
                var7_4 /* !! */  = (int)mi.jfpn("jfwk", jfpq(int ), (int)155);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl217
            }
lbl129:
            // 3 sources

            case 15: {
                var7_4 /* !! */  = (int)mi.jfpn("jfwl", jfpq(int ), (int)156);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl134:
            // 3 sources

            case 16: {
                var7_4 /* !! */  = (int)mi.jfpn("jfwm", jfpq(int ), (int)157);
                if (!var8_3) ** GOTO lbl93
                throw null;
            }
lbl138:
            // 2 sources

            case 17: {
                var7_4 /* !! */  = (int)mi.jfpn("jfwn", jfpq(int ), (int)158);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl143:
            // 2 sources

            case 18: {
                var7_4 /* !! */  = (int)mi.jfpn("jfwo", jfpq(int ), (int)159);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl169
            }
            case 19: {
                var7_4 /* !! */  = (int)mi.jfpn("jfwp", jfpq(int ), (int)160);
                if (!var8_3) ** GOTO lbl83
                throw null;
            }
lbl152:
            // 3 sources

            case 20: {
                var7_4 /* !! */  = (int)mi.jfpn("jfwq", jfpq(int ), (int)161);
                if (!var8_3) ** GOTO lbl114
                throw null;
            }
            case 21: {
                do {
                    var7_4 /* !! */  = (int)mi.jfpn("jfwr", jfpq(int ), (int)162);
                } while (!var8_3);
                throw null;
            }
lbl161:
            // 2 sources

            case 22: {
                var7_4 /* !! */  = (int)mi.jfpn("jfws", jfpq(int ), (int)163);
                if (!var8_3) ** GOTO lbl114
                throw null;
            }
lbl165:
            // 2 sources

            case 23: {
                var7_4 /* !! */  = (int)mi.jfpn("jfwt", jfpq(int ), (int)164);
                if (!var8_3) ** GOTO lbl129
                throw null;
            }
lbl169:
            // 3 sources

            case 24: {
                var7_4 /* !! */  = (int)mi.jfpn("jfwu", jfpq(int ), (int)165);
                if (!var8_3) ** GOTO lbl83
                throw null;
            }
            case 25: {
                var7_4 /* !! */  = (int)mi.jfpn("jfwv", jfpq(int ), (int)166);
                if (var8_3) {
                    throw null;
                }
            }
lbl177:
            // 4 sources

            case 26: {
                var7_4 /* !! */  = (int)mi.jfpn("jfww", jfpq(int ), (int)167);
                if (!var8_3) ** GOTO lbl129
                throw null;
            }
            case 27: {
                var7_4 /* !! */  = (int)mi.jfpn("jfwx", jfpq(int ), (int)168);
                if (!var8_3) ** GOTO lbl169
                throw null;
            }
lbl185:
            // 3 sources

            case 28: {
                var7_4 /* !! */  = (int)mi.jfpn("jfwy", jfpq(int ), (int)169);
                if (!var8_3) ** GOTO lbl124
                throw null;
            }
lbl189:
            // 2 sources

            case 29: {
                var7_4 /* !! */  = (int)mi.jfpn("jfwz", jfpq(int ), (int)170);
                if (!var8_3) ** GOTO lbl124
                throw null;
            }
lbl193:
            // 3 sources

            case 30: {
                var7_4 /* !! */  = (int)mi.jfpn("jfxa", jfpq(int ), (int)171);
                if (!var8_3) ** GOTO lbl98
                throw null;
            }
            case 31: {
                var7_4 /* !! */  = (int)mi.jfpn("jfxb", jfpq(int ), (int)172);
                if (!var8_3) ** GOTO lbl119
                throw null;
            }
            case 32: {
                var7_4 /* !! */  = (int)mi.jfpn("jfxc", jfpq(int ), (int)173);
                if (var8_3) {
                    throw null;
                }
            }
            case 33: {
                var7_4 /* !! */  = (int)mi.jfpn("jfxd", jfpq(int ), (int)174);
                if (!var8_3) ** GOTO lbl185
                throw null;
            }
lbl209:
            // 2 sources

            case 34: {
                var7_4 /* !! */  = (int)mi.jfpn("jfxe", jfpq(int ), (int)175);
                if (!var8_3) ** GOTO lbl83
                throw null;
            }
lbl213:
            // 2 sources

            case 35: {
                var7_4 /* !! */  = (int)mi.jfpn("jfxf", jfpq(int ), (int)176);
                if (!var8_3) break;
                throw null;
            }
lbl217:
            // 2 sources

            case 36: {
                var7_4 /* !! */  = (int)mi.jfpn("jfxg", jfpq(int ), (int)177);
                if (!var8_3) break;
                throw null;
            }
            case 37: 
        }
        var7_4 /* !! */  = (int)mi.jfpn("jfxh", jfpq(int ), (int)178);
        ** while (!var8_3)
lbl224:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jggw() {
        mi.jfpr[0] = 971082365;
        mi.jfpr[1] = 1631243856;
        mi.jfpr[2] = 571793906;
        mi.jfpr[3] = 1557275450;
        mi.jfpr[4] = 659960421;
        mi.jfpr[5] = 507221366;
        mi.jfpr[6] = -1163978328;
        mi.jfpr[7] = 1076330031;
        mi.jfpr[8] = -2121981790;
        mi.jfpr[9] = -2140201476;
        mi.jfpr[10] = 1146809331;
        mi.jfpr[11] = 372019731;
        mi.jfpr[12] = 1360323011;
        mi.jfpr[13] = 133560103;
        mi.jfpr[14] = -1116498785;
        mi.jfpr[15] = -1977937715;
        mi.jfpr[16] = -1739884462;
        mi.jfpr[17] = 1363454690;
        mi.jfpr[18] = -218973904;
        mi.jfpr[19] = 1617366333;
        mi.jfpr[20] = 788498993;
        mi.jfpr[21] = -1962314962;
        mi.jfpr[22] = -141471819;
        mi.jfpr[23] = 809559864;
        mi.jfpr[24] = -1487902320;
        mi.jfpr[25] = -1261843897;
        mi.jfpr[26] = 1469802110;
        mi.jfpr[27] = -466726863;
        mi.jfpr[28] = -1975623573;
        mi.jfpr[29] = 973573556;
        mi.jfpr[30] = 1034896989;
        mi.jfpr[31] = -1552617829;
        mi.jfpr[32] = -2038692004;
        mi.jfpr[33] = 622288037;
        mi.jfpr[34] = -765251685;
        mi.jfpr[35] = 685618585;
        mi.jfpr[36] = 933205999;
        mi.jfpr[37] = 1387482983;
        mi.jfpr[38] = 1435261023;
        mi.jfpr[39] = 1458659939;
        mi.jfpr[40] = -503963703;
        mi.jfpr[41] = -1580063959;
        mi.jfpr[42] = -1313823507;
        mi.jfpr[43] = 1833162986;
        mi.jfpr[44] = -158256433;
        mi.jfpr[45] = 400245339;
        mi.jfpr[46] = -1190402419;
        mi.jfpr[47] = 954165133;
        mi.jfpr[48] = -765518233;
        mi.jfpr[49] = -741690321;
        mi.jfpr[50] = -1168156800;
        mi.jfpr[51] = -1330989343;
        mi.jfpr[52] = 1158485094;
        mi.jfpr[53] = -1215690496;
        mi.jfpr[54] = 505463293;
        mi.jfpr[55] = -1525399866;
        mi.jfpr[56] = 1163230794;
        mi.jfpr[57] = 1402693183;
        mi.jfpr[58] = 355425759;
        mi.jfpr[59] = -210127148;
        mi.jfpr[60] = 1599612468;
        mi.jfpr[61] = -136355994;
        mi.jfpr[62] = 771985076;
        mi.jfpr[63] = -1058798410;
        mi.jfpr[64] = -1335847066;
        mi.jfpr[65] = 760941210;
        mi.jfpr[66] = -1257246574;
        mi.jfpr[67] = 823571954;
        mi.jfpr[68] = -446718896;
        mi.jfpr[69] = -111423427;
        mi.jfpr[70] = 1986922576;
        mi.jfpr[71] = -675544612;
        mi.jfpr[72] = -1929911105;
        mi.jfpr[73] = 510457730;
        mi.jfpr[74] = 1932327840;
        mi.jfpr[75] = 239393051;
        mi.jfpr[76] = 1671131860;
        mi.jfpr[77] = -1961949974;
        mi.jfpr[78] = 1191973439;
        mi.jfpr[79] = -1206482174;
        mi.jfpr[80] = 1769773709;
        mi.jfpr[81] = -425911750;
        mi.jfpr[82] = -1848513835;
        mi.jfpr[83] = -870975101;
        mi.jfpr[84] = 1257155021;
        mi.jfpr[85] = 281866046;
        mi.jfpr[86] = 84712411;
        mi.jfpr[87] = -2126875973;
        mi.jfpr[88] = -1996517598;
        mi.jfpr[89] = -1543890244;
        mi.jfpr[90] = 2065052916;
        mi.jfpr[91] = 701537018;
        mi.jfpr[92] = -757788247;
        mi.jfpr[93] = 1446360082;
        mi.jfpr[94] = 704401782;
        mi.jfpr[95] = 817367118;
        mi.jfpr[96] = -437424720;
        mi.jfpr[97] = -316698017;
        mi.jfpr[98] = 60863590;
        mi.jfpr[99] = -1016302227;
    }

    private static /* synthetic */ float jfrf(int n2) {
        return Float.intBitsToFloat(jfpr[n2] ^ jfps[n2]);
    }

    private static /* synthetic */ void jghf() {
        mi.jfpl[100] = 4646696361938311156L;
        mi.jfpl[101] = 8094126890491769047L;
        mi.jfpl[102] = -6248009393989870255L;
        mi.jfpl[103] = 2112667841505286108L;
        mi.jfpl[104] = 5072739818459039154L;
        mi.jfpl[105] = 5322724965451182833L;
        mi.jfpl[106] = -2276123558418486665L;
        mi.jfpl[107] = 5793161799769958413L;
        mi.jfpl[108] = 7396727208057049605L;
        mi.jfpl[109] = -6286702843347934069L;
        mi.jfpl[110] = -4157405163093362112L;
        mi.jfpl[111] = 175160940178513485L;
        mi.jfpl[112] = 5885717399344809454L;
        mi.jfpl[113] = -8961339009250922289L;
        mi.jfpl[114] = -1929944727686783420L;
        mi.jfpl[115] = -1620360152634922902L;
        mi.jfpl[116] = 3359427342949908759L;
        mi.jfpl[117] = -647855714801143584L;
        mi.jfpl[118] = 1750330755999817206L;
        mi.jfpl[119] = -5139121748494687263L;
        mi.jfpl[120] = -8488506096082428487L;
        mi.jfpl[121] = -6279769596852664961L;
        mi.jfpl[122] = -1732801057480914882L;
        mi.jfpl[123] = 2146472802458121298L;
        mi.jfpl[124] = -4231485103025419174L;
        mi.jfpl[125] = 3883206503073165825L;
        mi.jfpl[126] = 3313316437380113694L;
        mi.jfpl[127] = 1319263246899487666L;
        mi.jfpl[128] = 4065275622309420835L;
        mi.jfpl[129] = -7156906333939666768L;
        mi.jfpl[130] = -1441274296253619525L;
        mi.jfpl[131] = 2222598356111510937L;
        mi.jfpl[132] = -7014162686795481910L;
        mi.jfpl[133] = 7206163650061593517L;
        mi.jfpl[134] = -263914390746865726L;
        mi.jfpl[135] = 6622592808572842308L;
        mi.jfpl[136] = 1370135643291794532L;
        mi.jfpl[137] = -796163519446353636L;
        mi.jfpl[138] = 6964186606609785061L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void updatePosition() {
        while (true) {
            block127: {
                if ((v0 /* !! */  = (cfr_temp_1 = mi.ri - mi.jfpn("jfzy", jfpk(int ), (int)55)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  != mi.jfpn("jfzz", jfpq(int ), (int)211)) break block127;
                var5_1 = mi.c;
                v1 /* !! */  = mi.ri;
                if (true) ** GOTO lbl12
            }
            v0 /* !! */  = (long)mi.jfpn("jgaa", jfpq(int ), (int)212);
        }
        block73: while (true) {
            v1 /* !! */  = (long)(v2 - mi.jfpn("jgab", jfpk(int ), (int)56));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -548539005: {
                    break block73;
                }
                case 234772667: {
                    v2 = mi.jfpn("jgac", jfpk(int ), (int)57);
                    continue block73;
                }
                case 592620611: {
                    v2 = mi.jfpn("jgad", jfpk(int ), (int)58);
                    continue block73;
                }
                case 1055079920: {
                    v2 = mi.jfpn("jgae", jfpk(int ), (int)59);
                    continue block73;
                }
            }
            break;
        }
        var4_2 /* !! */  = mi.b;
        v3 /* !! */  = mi.ri;
        if (true) ** GOTO lbl29
        block74: while (true) {
            v3 /* !! */  = (long)(v4 - mi.jfpn("jgaf", jfpk(int ), (int)60));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -566659360: {
                    v4 = mi.jfpn("jgag", jfpk(int ), (int)61);
                    continue block74;
                }
                case -548539005: {
                    break block74;
                }
                case 284601910: {
                    v4 = mi.jfpn("jgah", jfpk(int ), (int)62);
                    continue block74;
                }
            }
            break;
        }
        var3_3 = mi.a;
        if (var5_1) {
            throw null;
        }
        if (var3_3 || var3_3) return;
        while (true) {
            block128: {
                if ((v5 /* !! */  = (cfr_temp_2 = mi.ri - mi.jfpn("jgai", jfpk(int ), (int)63)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  != mi.jfpn("jgaj", jfpq(int ), (int)213)) break block128;
                v6 /* !! */  = mi.ri;
                if (true) ** GOTO lbl52
            }
            v5 /* !! */  = (long)mi.jfpn("jgak", jfpq(int ), (int)214);
        }
        block76: while (true) {
            v6 /* !! */  = (long)(v7 - mi.jfpn("jgal", jfpk(int ), (int)64));
lbl52:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1833855161: {
                    v7 = mi.jfpn("jgam", jfpk(int ), (int)65);
                    continue block76;
                }
                case -1107411664: {
                    v7 = mi.jfpn("jgan", jfpk(int ), (int)66);
                    continue block76;
                }
                case -548539005: {
                    break block76;
                }
                case 479883687: {
                    v7 = mi.jfpn("jgao", jfpk(int ), (int)67);
                    continue block76;
                }
            }
            break;
        }
        v8 = Math.max(1.0f, this.tagWidth);
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_3 = mi.ri - mi.jfpn("jgap", jfpk(int ), (int)68)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == mi.jfpn("jgaq", jfpq(int ), (int)215)) {
                this.menuWidth = v8;
                if (var3_3) return;
                break;
            }
            v9 /* !! */  = (long)mi.jfpn("jgar", jfpq(int ), (int)216);
        }
        if (var3_3) return;
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_4 = mi.ri - mi.jfpn("jgas", jfpk(int ), (int)69)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == mi.jfpn("jgat", jfpq(int ), (int)217)) break;
            v10 /* !! */  = (long)mi.jfpn("jgau", jfpq(int ), (int)218);
        }
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_5 = mi.ri - mi.jfpn("jgav", jfpk(int ), (int)70)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == mi.jfpn("jgaw", jfpq(int ), (int)219)) break;
            v11 /* !! */  = (long)mi.jfpn("jgax", jfpq(int ), (int)220);
        }
        v12 = Math.max(1.0f, this.tagHeight);
        v13 /* !! */  = mi.ri;
        block80: while (true) {
            switch ((int)v13 /* !! */ ) {
                case -548539005: {
                    break block80;
                }
                case 626533934: {
                    v13 /* !! */  = (long)(mi.jfpn("jgaz", jfpk(int ), (int)72) - mi.jfpn("jgay", jfpk(int ), (int)71));
                    continue block80;
                }
            }
            break;
        }
        this.menuHeight = v12;
        if (var3_3 || var3_3) return;
        v14 /* !! */  = mi.ri;
        block81: while (true) {
            switch ((int)v14 /* !! */ ) {
                case -1640372720: {
                    v14 /* !! */  = (long)(mi.jfpn("jgbb", jfpk(int ), (int)74) - mi.jfpn("jgba", jfpk(int ), (int)73));
                    continue block81;
                }
                case -548539005: {
                    break block81;
                }
            }
            break;
        }
        v15 = ki.getFixedScaledWidth();
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_6 = mi.ri - mi.jfpn("jgbc", jfpk(int ), (int)75)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == mi.jfpn("jgbd", jfpq(int ), (int)221)) break;
            v16 /* !! */  = (long)mi.jfpn("jgbe", jfpq(int ), (int)222);
        }
        v17 = v15 - this.menuWidth - 1.0f;
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_7 = mi.ri - mi.jfpn("jgbf", jfpk(int ), (int)76)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == mi.jfpn("jgbg", jfpq(int ), (int)223)) {
                var1_4 = Math.max(1.0f, v17);
                if (var3_3) return;
                break;
            }
            v18 /* !! */  = (long)mi.jfpn("jgbh", jfpq(int ), (int)224);
        }
        if (var3_3) return;
        v19 /* !! */  = mi.ri;
        if (true) ** GOTO lbl123
        block84: while (true) {
            v19 /* !! */  = (long)(v20 - mi.jfpn("jgbi", jfpk(int ), (int)77));
lbl123:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -2102749148: {
                    v20 = mi.jfpn("jgbj", jfpk(int ), (int)78);
                    continue block84;
                }
                case -886338067: {
                    v20 = mi.jfpn("jgbk", jfpk(int ), (int)79);
                    continue block84;
                }
                case -548539005: {
                    break block84;
                }
                case 962130765: {
                    v20 = mi.jfpn("jgbl", jfpk(int ), (int)80);
                    continue block84;
                }
            }
            break;
        }
        v21 /* !! */  = mi.ri;
        if (true) ** GOTO lbl139
        block85: while (true) {
            v21 /* !! */  = (long)(v22 - mi.jfpn("jgbm", jfpk(int ), (int)81));
lbl139:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -548539005: {
                    break block85;
                }
                case -252517154: {
                    v22 = mi.jfpn("jgbn", jfpk(int ), (int)82);
                    continue block85;
                }
                case 2066361004: {
                    v22 = mi.jfpn("jgbo", jfpk(int ), (int)83);
                    continue block85;
                }
            }
            break;
        }
        v23 = Math.min(this.tagX, var1_4);
        while (true) {
            if ((v24 /* !! */  = (cfr_temp_8 = mi.ri - mi.jfpn("jgbp", jfpk(int ), (int)84)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v24 /* !! */  == mi.jfpn("jgbq", jfpq(int ), (int)225)) break;
            v24 /* !! */  = (long)mi.jfpn("jgbr", jfpq(int ), (int)226);
        }
        v25 = Math.max(1.0f, v23);
        while (true) {
            if ((v26 /* !! */  = (cfr_temp_9 = mi.ri - mi.jfpn("jgbs", jfpk(int ), (int)85)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v26 /* !! */  == mi.jfpn("jgbt", jfpq(int ), (int)227)) {
                this.menuX = v25;
                if (var3_3) return;
                break;
            }
            v26 /* !! */  = (long)mi.jfpn("jgbu", jfpq(int ), (int)228);
        }
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block88: while (true) {
            block129: {
                switch (cfr_temp_0 == -2147483648 ? var4_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var3_3) return;
                        v27 /* !! */  = mi.ri;
                        block89: while (true) {
                            switch ((int)v27 /* !! */ ) {
                                case -548539005: {
                                    break block89;
                                }
                                case 582433096: {
                                    v27 /* !! */  = (long)(mi.jfpn("jgbw", jfpk(int ), (int)87) - mi.jfpn("jgbv", jfpk(int ), (int)86));
                                    continue block89;
                                }
                            }
                            break;
                        }
                        if (this.hasItems) {
                            if (var3_3) return;
                            v28 /* !! */  = mi.jfpn("jgbx", jfrf(int ), (int)229);
                            if (var5_1) {
                                throw null;
                            }
                        } else {
                            if (var3_3 || var3_3) return;
                            v28 /* !! */  = var2_5 /* !! */  = (CallSite)2.0f;
                        }
                        if (var3_3 || var3_3) return;
                        while (true) {
                            if ((v29 /* !! */  = (cfr_temp_10 = mi.ri - mi.jfpn("jgby", jfpk(int ), (int)88)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                            if (v29 /* !! */  != mi.jfpn("jgbz", jfpq(int ), (int)230)) ** GOTO lbl191
                            v30 /* !! */  = mi.ri;
                            ** GOTO lbl275
lbl191:
                            // 1 sources

                            v29 /* !! */  = (long)mi.jfpn("jgca", jfpq(int ), (int)231);
                        }
                    }
                    case 0: {
                        var4_2 /* !! */  = (int)mi.jfpn("jgck", jfpq(int ), (int)234);
                        cfr_temp_0 = 6;
                        if (var5_1) {
                            throw null;
                        }
                        break block129;
                    }
                    case 5: {
                        var4_2 /* !! */  = (int)mi.jfpn("jgcp", jfpq(int ), (int)239);
                        cfr_temp_0 = 13;
                        if (var5_1) {
                            throw null;
                        }
                        break block129;
                    }
                    case 6: {
                        var4_2 /* !! */  = (int)mi.jfpn("jgcq", jfpq(int ), (int)240);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 4: {
                        var4_2 /* !! */  = (int)mi.jfpn("jgco", jfpq(int ), (int)238);
                        cfr_temp_0 = 15;
                        if (var5_1) {
                            throw null;
                        }
                        break block129;
                    }
                    case 9: {
                        var4_2 /* !! */  = (int)mi.jfpn("jgct", jfpq(int ), (int)243);
                        cfr_temp_0 = 1;
                        if (var5_1) {
                            throw null;
                        }
                        break block129;
                    }
                    case 10: {
                        var4_2 /* !! */  = (int)mi.jfpn("jgcu", jfpq(int ), (int)244);
                        cfr_temp_0 = 16;
                        if (var5_1) {
                            throw null;
                        }
                        break block129;
                    }
                    case 11: {
                        var4_2 /* !! */  = (int)mi.jfpn("jgcv", jfpq(int ), (int)245);
                        cfr_temp_0 = 17;
                        if (var5_1) {
                            throw null;
                        }
                        break block129;
                    }
                    case 12: {
                        var4_2 /* !! */  = (int)mi.jfpn("jgcw", jfpq(int ), (int)246);
                        cfr_temp_0 = 15;
                        if (var5_1) {
                            throw null;
                        }
                        break block129;
                    }
                    case 14: {
                        var4_2 /* !! */  = (int)mi.jfpn("jgcy", jfpq(int ), (int)248);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 1: {
                        var4_2 /* !! */  = (int)mi.jfpn("jgcl", jfpq(int ), (int)235);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 15: {
                        var4_2 /* !! */  = (int)mi.jfpn("jgcz", jfpq(int ), (int)249);
                        if (var5_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 16: {
                        var4_2 /* !! */  = (int)mi.jfpn("jgda", jfpq(int ), (int)250);
                        cfr_temp_0 = 18;
                        if (var5_1) {
                            throw null;
                        }
                        break block129;
                    }
                    case 17: {
                        var4_2 /* !! */  = (int)mi.jfpn("jgdb", jfpq(int ), (int)251);
                        cfr_temp_0 = 2;
                        if (var5_1) {
                            throw null;
                        }
                        break block129;
                    }
                    case 18: {
                        var4_2 /* !! */  = (int)mi.jfpn("jgdc", jfpq(int ), (int)252);
                        cfr_temp_0 = 8;
                        if (var5_1) {
                            throw null;
                        }
                        break block129;
                    }
                    case 19: lbl-1000:
                    // 2 sources

                    {
                        var4_2 /* !! */  = (int)mi.jfpn("jgdd", jfpq(int ), (int)253);
                        if (var5_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
lbl275:
                    // 1 sources

                    block91: while (true) {
                        switch ((int)v30 /* !! */ ) {
                            case -899411309: {
                                v30 /* !! */  = (long)(mi.jfpn("jgcc", jfpk(int ), (int)90) - mi.jfpn("jgcb", jfpk(int ), (int)89));
                                continue block91;
                            }
                            case -548539005: {
                                break block91;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v31 /* !! */  = (cfr_temp_11 = mi.ri - mi.jfpn("jgcd", jfpk(int ), (int)91)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                        if (v31 /* !! */  != mi.jfpn("jgce", jfpq(int ), (int)232)) ** GOTO lbl288
                        v32 = Math.max(1.0f, this.tagY - this.menuHeight - var2_5 /* !! */ );
                        v33 /* !! */  = mi.ri;
                        if (true) ** GOTO lbl292
lbl288:
                        // 1 sources

                        v31 /* !! */  = (long)mi.jfpn("jgcf", jfpq(int ), (int)233);
                    }
                    block93: while (true) {
                        v33 /* !! */  = (long)(v34 - mi.jfpn("jgcg", jfpk(int ), (int)92));
lbl292:
                        // 2 sources

                        switch ((int)v33 /* !! */ ) {
                            case -912513032: {
                                v34 = mi.jfpn("jgch", jfpk(int ), (int)93);
                                continue block93;
                            }
                            case -548539005: {
                                break block93;
                            }
                            case 322708548: {
                                v34 = mi.jfpn("jgci", jfpk(int ), (int)94);
                                continue block93;
                            }
                            case 1666541695: {
                                v34 = mi.jfpn("jgcj", jfpk(int ), (int)95);
                                continue block93;
                            }
                        }
                        break;
                    }
                    this.menuY = v32;
                    if (!var3_3 && !var3_3) return;
                    return;
                    case 2: lbl-1000:
                    // 2 sources

                    {
                        var4_2 /* !! */  = (int)mi.jfpn("jgcm", jfpq(int ), (int)236);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 7: {
                        var4_2 /* !! */  = (int)mi.jfpn("jgcr", jfpq(int ), (int)241);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 3: {
                        var4_2 /* !! */  = (int)mi.jfpn("jgcn", jfpq(int ), (int)237);
                        cfr_temp_0 = 2;
                        if (var5_1) {
                            throw null;
                        }
                        break block129;
                    }
                    case 8: {
                        var4_2 /* !! */  = (int)mi.jfpn("jgcs", jfpq(int ), (int)242);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 13: 
                }
                ** GOTO lbl330
            }
            do {
                if (true) continue block88;
lbl330:
                // 2 sources

                var4_2 /* !! */  = (int)mi.jfpn("jgcx", jfpq(int ), (int)247);
                cfr_temp_0 = 8;
            } while (!var5_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void jghd() {
        mi.jfps[300] = 281228404;
        mi.jfps[301] = -624559452;
        mi.jfps[302] = -370911010;
        mi.jfps[303] = 1963119904;
        mi.jfps[304] = 1180955876;
        mi.jfps[305] = -1258880944;
        mi.jfps[306] = 1389741675;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public mi(class_437 var1_1, String var2_2, float var3_3, float var4_4, float var5_5, float var6_6, boolean var7_7) {
        var9_8 /* !! */  = mi.b;
        super((class_2561)class_2561.method_43470((String)("Player: " + var2_2)));
        this.transition = new my((long)mi.jfpn("jfpo", jfpk(int ), (int)0), (long)mi.jfpn("jfpp", jfpk(int ), (int)1));
        this.parent = var1_1;
        this.playerName = var2_2;
        this.tagX = var3_3;
        this.tagY = var4_4;
        if (var9_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.tagWidth = var5_5;
                this.tagHeight = var6_6;
                this.hasItems = var7_7;
                return;
            }
lbl15:
            // 3 sources

            case 0: {
                var9_8 /* !! */  = (int)mi.jfpn("jfpt", jfpq(int ), (int)0);
                break;
            }
            case 1: {
                var9_8 /* !! */  = (int)mi.jfpn("jfpu", jfpq(int ), (int)1);
                ** GOTO lbl15
            }
lbl21:
            // 2 sources

            case 2: {
                var9_8 /* !! */  = (int)mi.jfpn("jfpv", jfpq(int ), (int)2);
                ** GOTO lbl33
            }
lbl24:
            // 2 sources

            case 3: {
                var9_8 /* !! */  = (int)mi.jfpn("jfpw", jfpq(int ), (int)3);
                ** GOTO lbl21
            }
            case 4: {
                var9_8 /* !! */  = (int)mi.jfpn("jfpx", jfpq(int ), (int)4);
                ** GOTO lbl43
            }
lbl30:
            // 2 sources

            case 5: {
                var9_8 /* !! */  = (int)mi.jfpn("jfpy", jfpq(int ), (int)5);
                ** GOTO lbl24
            }
lbl33:
            // 3 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_8 /* !! */  = (int)mi.jfpn("jfpz", jfpq(int ), (int)6);
                    ** GOTO lbl15
                    break;
                }
            }
            case 7: {
                var9_8 /* !! */  = (int)mi.jfpn("jfqa", jfpq(int ), (int)7);
                ** GOTO lbl43
            }
            case 8: {
                var9_8 /* !! */  = (int)mi.jfpn("jfqb", jfpq(int ), (int)8);
                ** GOTO lbl33
            }
lbl43:
            // 3 sources

            case 9: {
                var9_8 /* !! */  = (int)mi.jfpn("jfqc", jfpq(int ), (int)9);
                ** GOTO lbl30
            }
            case 10: 
        }
        var9_8 /* !! */  = (int)mi.jfpn("jfqd", jfpq(int ), (int)10);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void finishClosing() {
        v0 /* !! */  = mi.ri;
        if (true) ** GOTO lbl5
        block33: while (true) {
            v0 /* !! */  = (long)(v1 - mi.jfpn("jfys", jfpk(int ), (int)37));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1941201127: {
                    v1 = mi.jfpn("jfyt", jfpk(int ), (int)38);
                    continue block33;
                }
                case -618587709: {
                    v1 = mi.jfpn("jfyu", jfpk(int ), (int)39);
                    continue block33;
                }
                case -548539005: {
                    break block33;
                }
                case 1221294618: {
                    v1 = mi.jfpn("jfyv", jfpk(int ), (int)40);
                    continue block33;
                }
            }
            break;
        }
        var3_1 = mi.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mi.ri - mi.jfpn("jfyw", jfpk(int ), (int)41)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mi.jfpn("jfyx", jfpq(int ), (int)197)) break;
            v2 /* !! */  = (long)mi.jfpn("jfyy", jfpq(int ), (int)198);
        }
        var2_2 /* !! */  = mi.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mi.ri - mi.jfpn("jfyz", jfpk(int ), (int)42)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mi.jfpn("jfza", jfpq(int ), (int)199)) break;
            v3 /* !! */  = (long)mi.jfpn("jfzb", jfpq(int ), (int)200);
        }
        var1_3 = mi.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl37:
                    // 4 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl37
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = mi.ri - mi.jfpn("jfzc", jfpk(int ), (int)43)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mi.jfpn("jfzd", jfpq(int ), (int)201)) break;
                    v4 /* !! */  = (long)mi.jfpn("jfze", jfpq(int ), (int)202);
                }
                if (this.field_22787 == null) ** GOTO lbl95
                if (var1_3) ** GOTO lbl37
                v5 /* !! */  = mi.ri;
                if (true) ** GOTO lbl52
                block38: while (true) {
                    v5 /* !! */  = (long)(v6 - mi.jfpn("jfzf", jfpk(int ), (int)44));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1082575396: {
                            v6 = mi.jfpn("jfzg", jfpk(int ), (int)45);
                            continue block38;
                        }
                        case -548539005: {
                            break block38;
                        }
                        case 644621206: {
                            v6 = mi.jfpn("jfzh", jfpk(int ), (int)46);
                            continue block38;
                        }
                        case 1911267865: {
                            v6 = mi.jfpn("jfzi", jfpk(int ), (int)47);
                            continue block38;
                        }
                    }
                    break;
                }
                v7 /* !! */  = mi.ri;
                if (true) ** GOTO lbl68
                block39: while (true) {
                    v7 /* !! */  = (long)(v8 - mi.jfpn("jfzj", jfpk(int ), (int)48));
lbl68:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1977390934: {
                            v8 = mi.jfpn("jfzk", jfpk(int ), (int)49);
                            continue block39;
                        }
                        case -548539005: {
                            break block39;
                        }
                        case 192941396: {
                            v8 = mi.jfpn("jfzl", jfpk(int ), (int)50);
                            continue block39;
                        }
                    }
                    break;
                }
                v9 /* !! */  = mi.ri;
                if (true) ** GOTO lbl81
                block40: while (true) {
                    v9 /* !! */  = (long)(v10 - mi.jfpn("jfzm", jfpk(int ), (int)51));
lbl81:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -548539005: {
                            break block40;
                        }
                        case -483614055: {
                            v10 = mi.jfpn("jfzn", jfpk(int ), (int)52);
                            continue block40;
                        }
                        case -274738500: {
                            v10 = mi.jfpn("jfzo", jfpk(int ), (int)53);
                            continue block40;
                        }
                        case 896169100: {
                            v10 = mi.jfpn("jfzp", jfpk(int ), (int)54);
                            continue block40;
                        }
                    }
                    break;
                }
                this.field_22787.method_1507(this.parent);
                if (var1_3) ** GOTO lbl37
lbl95:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)mi.jfpn("jfzq", jfpq(int ), (int)203);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl103:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)mi.jfpn("jfzr", jfpq(int ), (int)204);
                if (var3_1) {
                    throw null;
                }
            }
lbl107:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)mi.jfpn("jfzs", jfpq(int ), (int)205);
                if (!var3_1) ** GOTO lbl103
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)mi.jfpn("jfzt", jfpq(int ), (int)206);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)mi.jfpn("jfzu", jfpq(int ), (int)207);
                if (var3_1) {
                    throw null;
                }
            }
lbl120:
            // 4 sources

            case 5: {
                var2_2 /* !! */  = (int)mi.jfpn("jfzv", jfpq(int ), (int)208);
                if (var3_1) {
                    throw null;
                }
            }
            case 6: {
                var2_2 /* !! */  = (int)mi.jfpn("jfzw", jfpq(int ), (int)209);
                if (!var3_1) ** GOTO lbl120
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)mi.jfpn("jfzx", jfpq(int ), (int)210);
        ** while (!var3_1)
lbl131:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jgha() {
        mi.jfps[0] = 971082367;
        mi.jfps[1] = 1631243866;
        mi.jfps[2] = 571793909;
        mi.jfps[3] = 1557275448;
        mi.jfps[4] = 659960420;
        mi.jfps[5] = 507221361;
        mi.jfps[6] = -1163978328;
        mi.jfps[7] = 1076330021;
        mi.jfps[8] = -2121981789;
        mi.jfps[9] = -2140201475;
        mi.jfps[10] = 1146809339;
        mi.jfps[11] = -372019732;
        mi.jfps[12] = -1051192589;
        mi.jfps[13] = 133560103;
        mi.jfps[14] = -1116498792;
        mi.jfps[15] = -1977937719;
        mi.jfps[16] = -1739884458;
        mi.jfps[17] = 1363454689;
        mi.jfps[18] = -218973902;
        mi.jfps[19] = 1617366335;
        mi.jfps[20] = 788498992;
        mi.jfps[21] = -1236942877;
        mi.jfps[22] = -954712086;
        mi.jfps[23] = 1897981752;
        mi.jfps[24] = -1744027290;
        mi.jfps[25] = -1966696850;
        mi.jfps[26] = 1755527058;
        mi.jfps[27] = -626979816;
        mi.jfps[28] = -897687445;
        mi.jfps[29] = 973573480;
        mi.jfps[30] = 1034896926;
        mi.jfps[31] = -1552617783;
        mi.jfps[32] = -2038691933;
        mi.jfps[33] = 622288037;
        mi.jfps[34] = -765251685;
        mi.jfps[35] = 685618585;
        mi.jfps[36] = 933205886;
        mi.jfps[37] = 1829982055;
        mi.jfps[38] = 344741983;
        mi.jfps[39] = 1458659938;
        mi.jfps[40] = -564781111;
        mi.jfps[41] = -1580063960;
        mi.jfps[42] = -1959545214;
        mi.jfps[43] = 1390663914;
        mi.jfps[44] = -924520384;
        mi.jfps[45] = 697798294;
        mi.jfps[46] = -1190402420;
        mi.jfps[47] = 2020566925;
        mi.jfps[48] = -1830871449;
        mi.jfps[49] = -741690146;
        mi.jfps[50] = -1168156817;
        mi.jfps[51] = -1330989543;
        mi.jfps[52] = 1158485145;
        mi.jfps[53] = -1215690451;
        mi.jfps[54] = 505463223;
        mi.jfps[55] = -1525399816;
        mi.jfps[56] = 1163230817;
        mi.jfps[57] = 1402693235;
        mi.jfps[58] = 355425791;
        mi.jfps[59] = -210127212;
        mi.jfps[60] = 1599612424;
        mi.jfps[61] = -136355991;
        mi.jfps[62] = 771985063;
        mi.jfps[63] = -1058798346;
        mi.jfps[64] = -1335847058;
        mi.jfps[65] = 760941269;
        mi.jfps[66] = -1257246525;
        mi.jfps[67] = 823571888;
        mi.jfps[68] = -446718947;
        mi.jfps[69] = -111423476;
        mi.jfps[70] = 1986922582;
        mi.jfps[71] = -675544579;
        mi.jfps[72] = -1929911142;
        mi.jfps[73] = 510457784;
        mi.jfps[74] = 1932327871;
        mi.jfps[75] = 239393062;
        mi.jfps[76] = 1671131902;
        mi.jfps[77] = -1961949989;
        mi.jfps[78] = 1191973490;
        mi.jfps[79] = -1206482138;
        mi.jfps[80] = 1769773766;
        mi.jfps[81] = -425911789;
        mi.jfps[82] = -1848513813;
        mi.jfps[83] = -870975088;
        mi.jfps[84] = 1257155046;
        mi.jfps[85] = 281866015;
        mi.jfps[86] = 84712416;
        mi.jfps[87] = -2126875984;
        mi.jfps[88] = -1996517597;
        mi.jfps[89] = -1543890271;
        mi.jfps[90] = 2065052854;
        mi.jfps[91] = 701537009;
        mi.jfps[92] = -757788254;
        mi.jfps[93] = 1446360101;
        mi.jfps[94] = 704401717;
        mi.jfps[95] = 817367166;
        mi.jfps[96] = -437424709;
        mi.jfps[97] = -316698015;
        mi.jfps[98] = 60863614;
        mi.jfps[99] = -1016302294;
    }

    private static /* synthetic */ void jggz() {
        mi.jfpr[300] = 69337333;
        mi.jfpr[301] = -624559450;
        mi.jfpr[302] = -370911014;
        mi.jfpr[303] = 1963119909;
        mi.jfpr[304] = 1180955873;
        mi.jfpr[305] = -1258880942;
        mi.jfpr[306] = 1389741679;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float fittedTextSize(ks var1_1, String var2_2, float var3_3, float var4_4) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mi.ri - mi.jfpn("jget", jfpk(int ), (int)113)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mi.jfpn("jgeu", jfpq(int ), (int)278)) break;
            v0 /* !! */  = (long)mi.jfpn("jgev", jfpq(int ), (int)279);
        }
        var8_5 = mi.c;
        v1 /* !! */  = mi.ri;
        if (true) ** GOTO lbl12
        block30: while (true) {
            v1 /* !! */  = (long)(v2 - mi.jfpn("jgew", jfpk(int ), (int)114));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -548539005: {
                    break block30;
                }
                case 277016122: {
                    v2 = mi.jfpn("jgex", jfpk(int ), (int)115);
                    continue block30;
                }
                case 1210090974: {
                    v2 = mi.jfpn("jgey", jfpk(int ), (int)116);
                    continue block30;
                }
            }
            break;
        }
        var7_6 /* !! */  = mi.b;
        v3 /* !! */  = mi.ri;
        if (true) ** GOTO lbl26
        block31: while (true) {
            v3 /* !! */  = (long)(v4 - mi.jfpn("jgez", jfpk(int ), (int)117));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -954902965: {
                    v4 = mi.jfpn("jgfa", jfpk(int ), (int)118);
                    continue block31;
                }
                case -548539005: {
                    break block31;
                }
                case -321443959: {
                    v4 = mi.jfpn("jgfb", jfpk(int ), (int)119);
                    continue block31;
                }
                case 440745680: {
                    v4 = mi.jfpn("jgfc", jfpk(int ), (int)120);
                    continue block31;
                }
            }
            break;
        }
        var6_7 = mi.a;
        if (var8_5) {
            throw null;
lbl41:
            // 4 sources

            return (float)mi.jfpn("jgfd", jfrf(int ), (int)280);
        }
        if (var6_7 || var6_7) ** GOTO lbl41
        v5 /* !! */  = mi.ri;
        if (true) ** GOTO lbl48
        block33: while (true) {
            v5 /* !! */  = (long)(v6 - mi.jfpn("jgfe", jfpk(int ), (int)121));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -2095972267: {
                    v6 = mi.jfpn("jgff", jfpk(int ), (int)122);
                    continue block33;
                }
                case -2009013493: {
                    v6 = mi.jfpn("jgfg", jfpk(int ), (int)123);
                    continue block33;
                }
                case -548539005: {
                    break block33;
                }
                case -287743103: {
                    v6 = mi.jfpn("jgfh", jfpk(int ), (int)124);
                    continue block33;
                }
            }
            break;
        }
        var5_8 = kq.width(var1_1, var2_2, var3_3);
        if (var6_7 || var6_7) ** GOTO lbl41
        if (var7_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!(var5_8 <= var4_4)) ** GOTO lbl71
                if (var6_7) ** GOTO lbl41
                v7 = var3_3;
                if (var8_5) {
                    throw null;
                }
                ** GOTO lbl83
lbl71:
                // 1 sources

                if (!var6_7 && !var6_7) ** break;
                ** continue;
                v8 = mi.jfpn("jgfi", jfrf(int ), (int)281);
                v9 = var3_3 * var4_4 / var5_8;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_1 = mi.ri - mi.jfpn("jgfj", jfpk(int ), (int)125)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == mi.jfpn("jgfk", jfpq(int ), (int)282)) {
                        v7 = Math.max((float)v8, v9);
                        break;
                    }
                    v10 /* !! */  = (long)mi.jfpn("jgfl", jfpq(int ), (int)283);
                }
lbl83:
                // 2 sources

                return v7;
            }
lbl84:
            // 3 sources

            case 0: {
                var7_6 /* !! */  = (int)mi.jfpn("jgfm", jfpq(int ), (int)284);
                if (var8_5) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl89:
            // 2 sources

            case 1: {
                var7_6 /* !! */  = (int)mi.jfpn("jgfn", jfpq(int ), (int)285);
                if (!var8_5) ** GOTO lbl84
                throw null;
            }
lbl93:
            // 3 sources

            case 2: {
                var7_6 /* !! */  = (int)mi.jfpn("jgfo", jfpq(int ), (int)286);
                if (var8_5) {
                    throw null;
                }
            }
lbl97:
            // 4 sources

            case 3: {
                var7_6 /* !! */  = (int)mi.jfpn("jgfp", jfpq(int ), (int)287);
                if (!var8_5) ** GOTO lbl93
                throw null;
            }
            case 4: {
                var7_6 /* !! */  = (int)mi.jfpn("jgfq", jfpq(int ), (int)288);
                if (!var8_5) ** GOTO lbl84
                throw null;
            }
lbl105:
            // 2 sources

            case 5: {
                var7_6 /* !! */  = (int)mi.jfpn("jgfr", jfpq(int ), (int)289);
                if (!var8_5) ** GOTO lbl93
                throw null;
            }
            case 6: {
                var7_6 /* !! */  = (int)mi.jfpn("jgfs", jfpq(int ), (int)290);
                if (!var8_5) ** GOTO lbl97
                throw null;
            }
lbl113:
            // 2 sources

            case 7: {
                var7_6 /* !! */  = (int)mi.jfpn("jgft", jfpq(int ), (int)291);
                if (!var8_5) ** GOTO lbl89
                throw null;
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_6 /* !! */  = (int)mi.jfpn("jgfu", jfpq(int ), (int)292);
                    if (!var8_5) ** GOTO lbl105
                    throw null;
                }
            }
            case 9: 
        }
        var7_6 /* !! */  = (int)mi.jfpn("jgfv", jfpq(int ), (int)293);
        ** while (!var8_5)
lbl125:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jghb() {
        mi.jfps[100] = -317953262;
        mi.jfps[101] = 1562290622;
        mi.jfps[102] = 1062477627;
        mi.jfps[103] = 357935764;
        mi.jfps[104] = -526696472;
        mi.jfps[105] = 1642221335;
        mi.jfps[106] = -276048615;
        mi.jfps[107] = -756577146;
        mi.jfps[108] = -1596795474;
        mi.jfps[109] = 745431743;
        mi.jfps[110] = 728073587;
        mi.jfps[111] = -271719011;
        mi.jfps[112] = -143834405;
        mi.jfps[113] = -1232033848;
        mi.jfps[114] = 1857325903;
        mi.jfps[115] = 16112175;
        mi.jfps[116] = 219450878;
        mi.jfps[117] = 1958595458;
        mi.jfps[118] = 1334753421;
        mi.jfps[119] = 1946232168;
        mi.jfps[120] = 596774422;
        mi.jfps[121] = -768024254;
        mi.jfps[122] = -453107619;
        mi.jfps[123] = 1070433462;
        mi.jfps[124] = 572718113;
        mi.jfps[125] = 2018530916;
        mi.jfps[126] = 1256232177;
        mi.jfps[127] = -813894298;
        mi.jfps[128] = 445385202;
        mi.jfps[129] = 1957143186;
        mi.jfps[130] = -1705718669;
        mi.jfps[131] = -2129549169;
        mi.jfps[132] = -590409145;
        mi.jfps[133] = 70596677;
        mi.jfps[134] = -1348443847;
        mi.jfps[135] = -730148562;
        mi.jfps[136] = -1039976934;
        mi.jfps[137] = -49251957;
        mi.jfps[138] = -579264201;
        mi.jfps[139] = 1981657234;
        mi.jfps[140] = 1845558071;
        mi.jfps[141] = 1889776907;
        mi.jfps[142] = -1655742283;
        mi.jfps[143] = 1790477562;
        mi.jfps[144] = -1734787058;
        mi.jfps[145] = 1452437318;
        mi.jfps[146] = -1143061439;
        mi.jfps[147] = 1882406524;
        mi.jfps[148] = 1126635722;
        mi.jfps[149] = -1897628641;
        mi.jfps[150] = -64866843;
        mi.jfps[151] = -238281177;
        mi.jfps[152] = -1279661662;
        mi.jfps[153] = -1005933412;
        mi.jfps[154] = -1339754083;
        mi.jfps[155] = -464739476;
        mi.jfps[156] = 1427526254;
        mi.jfps[157] = 593106158;
        mi.jfps[158] = 168957187;
        mi.jfps[159] = 1389718457;
        mi.jfps[160] = 933347196;
        mi.jfps[161] = 1088892590;
        mi.jfps[162] = -1879212468;
        mi.jfps[163] = 211150950;
        mi.jfps[164] = 2083894180;
        mi.jfps[165] = 175790953;
        mi.jfps[166] = 82953847;
        mi.jfps[167] = -1716580652;
        mi.jfps[168] = -602595431;
        mi.jfps[169] = 1894484830;
        mi.jfps[170] = -1854262590;
        mi.jfps[171] = -1613863213;
        mi.jfps[172] = -904963455;
        mi.jfps[173] = 1875577989;
        mi.jfps[174] = 3176800;
        mi.jfps[175] = 268507972;
        mi.jfps[176] = 629247944;
        mi.jfps[177] = -1525037613;
        mi.jfps[178] = 1998394729;
        mi.jfps[179] = 1345401593;
        mi.jfps[180] = -785773283;
        mi.jfps[181] = 1635085823;
        mi.jfps[182] = -905444433;
        mi.jfps[183] = 237482296;
        mi.jfps[184] = -397572849;
        mi.jfps[185] = -1898154254;
        mi.jfps[186] = 80640796;
        mi.jfps[187] = 1622105303;
        mi.jfps[188] = 582668386;
        mi.jfps[189] = -629113353;
        mi.jfps[190] = 1502173342;
        mi.jfps[191] = -2133433460;
        mi.jfps[192] = -994258830;
        mi.jfps[193] = -143691096;
        mi.jfps[194] = 609083217;
        mi.jfps[195] = -2038241437;
        mi.jfps[196] = -1412181477;
        mi.jfps[197] = 1178721994;
        mi.jfps[198] = -2039923599;
        mi.jfps[199] = -1860006173;
    }

    private static /* synthetic */ void jghg() {
        mi.jfpm[0] = -8342165210487510367L;
        mi.jfpm[1] = -8133000062133773704L;
        mi.jfpm[2] = 4896421393125650879L;
        mi.jfpm[3] = 6881200894743470839L;
        mi.jfpm[4] = 5161751652057572205L;
        mi.jfpm[5] = -1432214147631864020L;
        mi.jfpm[6] = 6042831053457255563L;
        mi.jfpm[7] = 6401832222721301185L;
        mi.jfpm[8] = -461832838159900592L;
        mi.jfpm[9] = 866639903336141260L;
        mi.jfpm[10] = 7048204113701032133L;
        mi.jfpm[11] = -5993952507130905629L;
        mi.jfpm[12] = 7024339273678136436L;
        mi.jfpm[13] = 7769022208854397790L;
        mi.jfpm[14] = -3483072121617358001L;
        mi.jfpm[15] = 1899199664916299569L;
        mi.jfpm[16] = 2350450995074121996L;
        mi.jfpm[17] = -7343324674609538374L;
        mi.jfpm[18] = -250457425590419829L;
        mi.jfpm[19] = -7127807331917580751L;
        mi.jfpm[20] = -8200101935304120814L;
        mi.jfpm[21] = -83518944190438355L;
        mi.jfpm[22] = -5124943982572071568L;
        mi.jfpm[23] = 5275054965955969170L;
        mi.jfpm[24] = 7898380798091965888L;
        mi.jfpm[25] = 8043183254294145228L;
        mi.jfpm[26] = 6122701763695148661L;
        mi.jfpm[27] = -3207690464732249232L;
        mi.jfpm[28] = -3271226618579783055L;
        mi.jfpm[29] = 432803241855018523L;
        mi.jfpm[30] = 6960705898755837754L;
        mi.jfpm[31] = 5915673674145600545L;
        mi.jfpm[32] = 7002796839520443271L;
        mi.jfpm[33] = -9163644601081538033L;
        mi.jfpm[34] = 7226929412802165448L;
        mi.jfpm[35] = -5978342988608247770L;
        mi.jfpm[36] = 9187021956376398405L;
        mi.jfpm[37] = -4246460974148143937L;
        mi.jfpm[38] = -1498849772024330758L;
        mi.jfpm[39] = -1282925388588237931L;
        mi.jfpm[40] = 2254377897305522287L;
        mi.jfpm[41] = 645643390161044223L;
        mi.jfpm[42] = 2275422938771565446L;
        mi.jfpm[43] = 6411188361107560833L;
        mi.jfpm[44] = 2622020901365471947L;
        mi.jfpm[45] = -8157176186986420713L;
        mi.jfpm[46] = 5023544778659148726L;
        mi.jfpm[47] = -3975477894433672268L;
        mi.jfpm[48] = -6449512751562586306L;
        mi.jfpm[49] = 3206396202388090862L;
        mi.jfpm[50] = -6885032024010781055L;
        mi.jfpm[51] = -1931443761472986120L;
        mi.jfpm[52] = -400233368846789778L;
        mi.jfpm[53] = -5298986320446308309L;
        mi.jfpm[54] = -5481315416054799683L;
        mi.jfpm[55] = -2761671634582986811L;
        mi.jfpm[56] = 5780246711560049402L;
        mi.jfpm[57] = -6247754958135093847L;
        mi.jfpm[58] = 1348963176793006270L;
        mi.jfpm[59] = -6872706631945929973L;
        mi.jfpm[60] = -6987109970725786962L;
        mi.jfpm[61] = -5470679523017981872L;
        mi.jfpm[62] = 4054999454800256856L;
        mi.jfpm[63] = -628118118277085871L;
        mi.jfpm[64] = -1542293437087833775L;
        mi.jfpm[65] = -3182699343840342018L;
        mi.jfpm[66] = -8831338018426607062L;
        mi.jfpm[67] = 2896133885155291263L;
        mi.jfpm[68] = -634545609518253368L;
        mi.jfpm[69] = -6817654484829344549L;
        mi.jfpm[70] = -7794595257444779576L;
        mi.jfpm[71] = -6646907705850464544L;
        mi.jfpm[72] = 3838299263736872642L;
        mi.jfpm[73] = -5313454994067414829L;
        mi.jfpm[74] = 8853923782349050625L;
        mi.jfpm[75] = -6015275267233617306L;
        mi.jfpm[76] = 8776699143171097187L;
        mi.jfpm[77] = -5172238797863893807L;
        mi.jfpm[78] = -1344057299572546012L;
        mi.jfpm[79] = -4176442418135954587L;
        mi.jfpm[80] = -4836495285860902191L;
        mi.jfpm[81] = 5332000353194774840L;
        mi.jfpm[82] = 1094991606108236598L;
        mi.jfpm[83] = 7946128159009119673L;
        mi.jfpm[84] = -9001285430863182905L;
        mi.jfpm[85] = 7163703546051443858L;
        mi.jfpm[86] = 8939425812253715931L;
        mi.jfpm[87] = -1579872861834686507L;
        mi.jfpm[88] = -8579926944276371147L;
        mi.jfpm[89] = -1390380728226442172L;
        mi.jfpm[90] = -8035051495020598570L;
        mi.jfpm[91] = 5273764888012392465L;
        mi.jfpm[92] = 692038232038868105L;
        mi.jfpm[93] = -5322058483725583834L;
        mi.jfpm[94] = -5458431605072253721L;
        mi.jfpm[95] = 5966199841507121264L;
        mi.jfpm[96] = -3271913339631178916L;
        mi.jfpm[97] = -5426271913716475508L;
        mi.jfpm[98] = 3073236575928376549L;
        mi.jfpm[99] = 2638366234122169988L;
    }
}

