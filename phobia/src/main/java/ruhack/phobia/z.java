/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import ruhack.phobia.ao;
import ruhack.phobia.y;

public final class z {
    private static final List<y> staffList;
    public static final int b;
    public static final long as = -6378320729629521274L;
    public static final boolean a;
    public static final boolean c;
    private static int[] kpe;
    private static long[] kpa;
    private static int[] kpf;
    private static long[] koz;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void removeStaff(String var0) {
        v0 /* !! */  = z.as;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - z.kpb("krm", koy(int ), (int)32));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1359926106: {
                    v1 = z.kpb("krn", koy(int ), (int)33);
                    continue block18;
                }
                case -1017574208: {
                    v1 = z.kpb("kro", koy(int ), (int)34);
                    continue block18;
                }
                case 384567942: {
                    break block18;
                }
            }
            break;
        }
        var3_1 = z.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = z.as - z.kpb("krp", koy(int ), (int)35)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == z.kpb("krq", kpd(int ), (int)27)) break;
            v2 /* !! */  = (long)z.kpb("krr", kpd(int ), (int)28);
        }
        var2_2 /* !! */  = z.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = z.as - z.kpb("krs", koy(int ), (int)36)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == z.kpb("krt", kpd(int ), (int)29)) break;
            v3 /* !! */  = (long)z.kpb("kru", kpd(int ), (int)30);
        }
        var1_3 = z.a;
        if (var3_1) {
            throw null;
lbl29:
            // 3 sources

            return;
        }
        if (var1_3) ** GOTO lbl29
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl29
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = z.as - z.kpb("krv", koy(int ), (int)37)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == z.kpb("krw", kpd(int ), (int)31)) break;
                    v4 /* !! */  = (long)z.kpb("krx", kpd(int ), (int)32);
                }
                v5 /* !! */  = z.as;
                if (true) ** GOTO lbl45
                block23: while (true) {
                    v5 /* !! */  = (long)(v6 - z.kpb("kry", koy(int ), (int)38));
lbl45:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -205542007: {
                            v6 = z.kpb("krz", koy(int ), (int)39);
                            continue block23;
                        }
                        case 384567942: {
                            break block23;
                        }
                        case 1143956518: {
                            v6 = z.kpb("ksa", koy(int ), (int)40);
                            continue block23;
                        }
                    }
                    break;
                }
                v7 = (Predicate<y>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$removeStaff$0(java.lang.String ruhack.phobia.y ), (Lruhack/phobia/y;)Z)((String)var0);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = z.as - z.kpb("ksb", koy(int ), (int)41)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == z.kpb("ksc", kpd(int ), (int)33)) break;
                    v8 /* !! */  = (long)z.kpb("ksd", kpd(int ), (int)34);
                }
                z.staffList.removeIf(v7);
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)z.kpb("kse", kpd(int ), (int)35);
                    if (!var3_1) break block5;
                    throw null;
                }
            }
lbl69:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)z.kpb("ksf", kpd(int ), (int)36);
                } while (!var3_1);
                throw null;
            }
lbl74:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)z.kpb("ksg", kpd(int ), (int)37);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl83
            }
            case 3: {
                var2_2 /* !! */  = (int)z.kpb("ksh", kpd(int ), (int)38);
                if (!var3_1) ** GOTO lbl74
                throw null;
            }
lbl83:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)z.kpb("ksi", kpd(int ), (int)39);
                if (!var3_1) ** GOTO lbl69
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)z.kpb("ksj", kpd(int ), (int)40);
        ** while (!var3_1)
lbl90:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ldw() {
        z.kpf[100] = -2072430261;
        z.kpf[101] = -863568938;
        z.kpf[102] = 580853758;
        z.kpf[103] = 592759818;
        z.kpf[104] = 696051659;
        z.kpf[105] = 1432698991;
        z.kpf[106] = -1036238862;
        z.kpf[107] = -1647160085;
        z.kpf[108] = -1110722038;
        z.kpf[109] = 738774342;
        z.kpf[110] = -95765636;
        z.kpf[111] = 641773525;
        z.kpf[112] = 1183859960;
        z.kpf[113] = -625697427;
        z.kpf[114] = 1480620012;
        z.kpf[115] = -457965303;
        z.kpf[116] = -1212742323;
        z.kpf[117] = -1548744162;
        z.kpf[118] = 489252999;
        z.kpf[119] = 2107834803;
        z.kpf[120] = 771056594;
        z.kpf[121] = 823143725;
        z.kpf[122] = -1849293969;
        z.kpf[123] = -105795651;
        z.kpf[124] = 87338914;
        z.kpf[125] = -1849970024;
        z.kpf[126] = 2057210987;
        z.kpf[127] = -1314596442;
        z.kpf[128] = 1105369378;
        z.kpf[129] = -504309976;
        z.kpf[130] = 1755012522;
        z.kpf[131] = -1070196991;
        z.kpf[132] = -392566073;
        z.kpf[133] = 1483088242;
        z.kpf[134] = -1078631715;
        z.kpf[135] = 540867422;
        z.kpf[136] = 35144039;
        z.kpf[137] = -953901442;
        z.kpf[138] = 1648427821;
        z.kpf[139] = -203510659;
        z.kpf[140] = -1966175526;
        z.kpf[141] = 2032802736;
        z.kpf[142] = -1553372960;
        z.kpf[143] = 849098510;
        z.kpf[144] = -1076267452;
        z.kpf[145] = 580047914;
        z.kpf[146] = -1981662395;
        z.kpf[147] = 61065488;
        z.kpf[148] = -1491788203;
        z.kpf[149] = -1025059155;
        z.kpf[150] = -1207094735;
        z.kpf[151] = 1981985966;
        z.kpf[152] = 1047633879;
        z.kpf[153] = 317329007;
        z.kpf[154] = -1763829669;
        z.kpf[155] = -21379266;
        z.kpf[156] = 676001344;
        z.kpf[157] = 1669893179;
        z.kpf[158] = 2065901698;
        z.kpf[159] = 1164005132;
        z.kpf[160] = -1926938631;
        z.kpf[161] = -884000253;
        z.kpf[162] = 242671572;
        z.kpf[163] = -709693000;
        z.kpf[164] = 965498048;
        z.kpf[165] = -1135423722;
        z.kpf[166] = -175269672;
        z.kpf[167] = -442002784;
        z.kpf[168] = -887946013;
        z.kpf[169] = -1635527168;
        z.kpf[170] = -1307753033;
        z.kpf[171] = -579126798;
        z.kpf[172] = 1861721396;
        z.kpf[173] = -2120770878;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static List<String> getStaffNames() {
        v0 /* !! */  = z.as;
        if (true) ** GOTO lbl5
        block31: while (true) {
            v0 /* !! */  = (long)(z.kpb("kxk", koy(int ), (int)103) - z.kpb("kxj", koy(int ), (int)102));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 384567942: {
                    break block31;
                }
                case 1925500192: {
                    continue block31;
                }
            }
            break;
        }
        var2 = z.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = z.as - z.kpb("kxl", koy(int ), (int)104)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == z.kpb("kxm", kpd(int ), (int)110)) break;
            v1 /* !! */  = (long)z.kpb("kxn", kpd(int ), (int)111);
        }
        var1_1 /* !! */  = z.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = z.as - z.kpb("kxo", koy(int ), (int)105)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == z.kpb("kxp", kpd(int ), (int)112)) break;
            v2 /* !! */  = (long)z.kpb("kxq", kpd(int ), (int)113);
        }
        var0_2 = z.a;
        if (!var2) ** GOTO lbl31
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl31:
                // 1 sources

                if (var0_2 || var0_2) continue block34;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = z.as - z.kpb("kxr", koy(int ), (int)106)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == z.kpb("kxs", kpd(int ), (int)114)) break;
                    v3 /* !! */  = (long)z.kpb("kxt", kpd(int ), (int)115);
                }
                v4 /* !! */  = z.as;
                if (true) ** GOTO lbl42
                block36: while (true) {
                    v4 /* !! */  = (long)(v5 - z.kpb("kxu", koy(int ), (int)107));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1434377658: {
                            v5 = z.kpb("kxv", koy(int ), (int)108);
                            continue block36;
                        }
                        case 384567942: {
                            break block36;
                        }
                        case 1678519292: {
                            v5 = z.kpb("kxw", koy(int ), (int)109);
                            continue block36;
                        }
                        case 1824253695: {
                            v5 = z.kpb("kxx", koy(int ), (int)110);
                            continue block36;
                        }
                    }
                    break;
                }
                v6 = z.staffList.stream();
                v7 /* !! */  = z.as;
                if (true) ** GOTO lbl59
                block37: while (true) {
                    v7 /* !! */  = (long)(v8 - z.kpb("kxy", koy(int ), (int)111));
lbl59:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1865943424: {
                            v8 = z.kpb("kxz", koy(int ), (int)112);
                            continue block37;
                        }
                        case 51088875: {
                            v8 = z.kpb("kya", koy(int ), (int)113);
                            continue block37;
                        }
                        case 384567942: {
                            break block37;
                        }
                        case 519306607: {
                            v8 = z.kpb("kyb", koy(int ), (int)114);
                            continue block37;
                        }
                    }
                    break;
                }
                v9 = (Function<y, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, getName(), (Lruhack/phobia/y;)Ljava/lang/String;)();
                v10 /* !! */  = z.as;
                if (true) ** GOTO lbl76
                block38: while (true) {
                    v10 /* !! */  = (long)(v11 - z.kpb("kyc", koy(int ), (int)115));
lbl76:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -476918488: {
                            v11 = z.kpb("kyd", koy(int ), (int)116);
                            continue block38;
                        }
                        case 384567942: {
                            break block38;
                        }
                        case 1749547930: {
                            v11 = z.kpb("kye", koy(int ), (int)117);
                            continue block38;
                        }
                    }
                    break;
                }
                v12 = v6.map(v9);
                v13 /* !! */  = z.as;
                if (true) ** GOTO lbl90
                block39: while (true) {
                    v13 /* !! */  = (long)(z.kpb("kyg", koy(int ), (int)119) - z.kpb("kyf", koy(int ), (int)118));
lbl90:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1541376281: {
                            continue block39;
                        }
                        case 384567942: {
                            break block39;
                        }
                    }
                    break;
                }
                v14 = Collectors.toList();
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_3 = z.as - z.kpb("kyh", koy(int ), (int)120)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v15 /* !! */  == z.kpb("kyi", kpd(int ), (int)116)) break;
                    v15 /* !! */  = (long)z.kpb("kyj", kpd(int ), (int)117);
                }
                return v12.collect(v14);
                case 0: {
                    var1_1 /* !! */  = (int)z.kpb("kyk", kpd(int ), (int)118);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl112
                }
                case 1: {
                    var1_1 /* !! */  = (int)z.kpb("kyl", kpd(int ), (int)119);
                    if (!var2) break block34;
                    throw null;
                }
lbl112:
                // 2 sources

                case 2: {
                    do {
                        var1_1 /* !! */  = (int)z.kpb("kym", kpd(int ), (int)120);
                    } while (!var2);
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var1_1 /* !! */  = (int)z.kpb("kyn", kpd(int ), (int)121);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void leg() {
        z.koz[0] = -8795645315805379109L;
        z.koz[1] = 7845967363884875498L;
        z.koz[2] = -168270259632056435L;
        z.koz[3] = 9161140620763224684L;
        z.koz[4] = 756458456509871119L;
        z.koz[5] = -4143852406095655864L;
        z.koz[6] = -5762347167470249050L;
        z.koz[7] = 155820661167829042L;
        z.koz[8] = 143347834331294969L;
        z.koz[9] = 3384202758790248738L;
        z.koz[10] = -2968343745693447185L;
        z.koz[11] = -6813846668521782604L;
        z.koz[12] = -4152456088720209017L;
        z.koz[13] = 4491467460397135035L;
        z.koz[14] = -433076854807923153L;
        z.koz[15] = -5896009628098001746L;
        z.koz[16] = 4096814691176304835L;
        z.koz[17] = -1841461638164117725L;
        z.koz[18] = 690675040804290445L;
        z.koz[19] = 4225209715871867770L;
        z.koz[20] = -7726508299560020502L;
        z.koz[21] = -1288205335657548607L;
        z.koz[22] = -421504442675877460L;
        z.koz[23] = 980837389920903306L;
        z.koz[24] = 2529274534135905323L;
        z.koz[25] = -7665215430268539131L;
        z.koz[26] = -6479887459347987079L;
        z.koz[27] = 6700955533641006831L;
        z.koz[28] = 3557298129804135641L;
        z.koz[29] = 1379108397757485132L;
        z.koz[30] = 3256813999640336295L;
        z.koz[31] = 1121176099520265822L;
        z.koz[32] = 8690327302174021378L;
        z.koz[33] = -6833937019654212185L;
        z.koz[34] = -459210651287012861L;
        z.koz[35] = 831936961710629370L;
        z.koz[36] = -1772421757204732733L;
        z.koz[37] = -5785738485936714190L;
        z.koz[38] = -8641739481559658652L;
        z.koz[39] = -3867489478983290150L;
        z.koz[40] = 330947138722197440L;
        z.koz[41] = -1369027680224172750L;
        z.koz[42] = 4434370705561377913L;
        z.koz[43] = -7352440181039708425L;
        z.koz[44] = 3252097886946927707L;
        z.koz[45] = 59718318124584159L;
        z.koz[46] = 3886571761462770789L;
        z.koz[47] = 995672416327312677L;
        z.koz[48] = -2851538635875741721L;
        z.koz[49] = -8643951431201406428L;
        z.koz[50] = -6366453502966430585L;
        z.koz[51] = -5216831079616805165L;
        z.koz[52] = 1305819592968340345L;
        z.koz[53] = 4483194813971199475L;
        z.koz[54] = 6554490782962870240L;
        z.koz[55] = -7832320807518855142L;
        z.koz[56] = 8314120229836587427L;
        z.koz[57] = -8131220068175990981L;
        z.koz[58] = -3200233881080068737L;
        z.koz[59] = 3752547188460079765L;
        z.koz[60] = -6802587621031979769L;
        z.koz[61] = -8398653257428286593L;
        z.koz[62] = 2019034199530644528L;
        z.koz[63] = 7291726593249360993L;
        z.koz[64] = 6982915989273789900L;
        z.koz[65] = 5626653300855587268L;
        z.koz[66] = -9136734000074940329L;
        z.koz[67] = 8311968162343866147L;
        z.koz[68] = 4878273455158580913L;
        z.koz[69] = -4750952484211245951L;
        z.koz[70] = 441332612334702683L;
        z.koz[71] = -6718339218361780676L;
        z.koz[72] = 4394473626993413862L;
        z.koz[73] = -1505313042783723352L;
        z.koz[74] = -7058792697846592990L;
        z.koz[75] = -338448399087657229L;
        z.koz[76] = -6426584630563364180L;
        z.koz[77] = 5341548046592655355L;
        z.koz[78] = -7081245020316823215L;
        z.koz[79] = 7502242327641306358L;
        z.koz[80] = 5531011311435853659L;
        z.koz[81] = -2584418252214728795L;
        z.koz[82] = -8320681123370625618L;
        z.koz[83] = 4741557046931454493L;
        z.koz[84] = 4949652513125946610L;
        z.koz[85] = -3087824950327731419L;
        z.koz[86] = 7730252512081604383L;
        z.koz[87] = 6615671794863232804L;
        z.koz[88] = 2089948482485708149L;
        z.koz[89] = -4330047675807782606L;
        z.koz[90] = -2223373645189052347L;
        z.koz[91] = -1014776840165927303L;
        z.koz[92] = -2821606131946134576L;
        z.koz[93] = 5259050515449649799L;
        z.koz[94] = -6477679549590774880L;
        z.koz[95] = 5460276580338575211L;
        z.koz[96] = 4755449146867482684L;
        z.koz[97] = -3555405220425082919L;
        z.koz[98] = 8389803576580641765L;
        z.koz[99] = -4688424539256419020L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void setStaff(List<y> var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = z.as - z.kpb("kzi", koy(int ), (int)132)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == z.kpb("kzj", kpd(int ), (int)131)) break;
            v0 /* !! */  = (long)z.kpb("kzk", kpd(int ), (int)132);
        }
        var3_1 = z.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = z.as - z.kpb("kzl", koy(int ), (int)133)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == z.kpb("kzm", kpd(int ), (int)133)) break;
            v1 /* !! */  = (long)z.kpb("kzn", kpd(int ), (int)134);
        }
        var2_2 /* !! */  = z.b;
        v2 /* !! */  = z.as;
        if (true) ** GOTO lbl19
        block38: while (true) {
            v2 /* !! */  = (long)(v3 - z.kpb("kzo", koy(int ), (int)134));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1131690320: {
                    v3 = z.kpb("kzp", koy(int ), (int)135);
                    continue block38;
                }
                case -132544300: {
                    v3 = z.kpb("kzq", koy(int ), (int)136);
                    continue block38;
                }
                case 384567942: {
                    break block38;
                }
            }
            break;
        }
        var1_3 = z.a;
        if (var3_1) {
            throw null;
lbl31:
            // 4 sources

            return;
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl31
                v4 /* !! */  = z.as;
                if (true) ** GOTO lbl42
                block40: while (true) {
                    v4 /* !! */  = (long)(v5 - z.kpb("kzr", koy(int ), (int)137));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1507535072: {
                            v5 = z.kpb("kzs", koy(int ), (int)138);
                            continue block40;
                        }
                        case -281763106: {
                            v5 = z.kpb("kzt", koy(int ), (int)139);
                            continue block40;
                        }
                        case 42916218: {
                            v5 = z.kpb("kzu", koy(int ), (int)140);
                            continue block40;
                        }
                        case 384567942: {
                            break block40;
                        }
                    }
                    break;
                }
                v6 /* !! */  = z.as;
                if (true) ** GOTO lbl58
                block41: while (true) {
                    v6 /* !! */  = (long)(v7 - z.kpb("kzv", koy(int ), (int)141));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 341140829: {
                            v7 = z.kpb("kzw", koy(int ), (int)142);
                            continue block41;
                        }
                        case 384567942: {
                            break block41;
                        }
                        case 1738541209: {
                            v7 = z.kpb("kzx", koy(int ), (int)143);
                            continue block41;
                        }
                    }
                    break;
                }
                z.staffList.clear();
                if (var1_3 || var1_3) ** GOTO lbl31
                v8 /* !! */  = z.as;
                if (true) ** GOTO lbl73
                block42: while (true) {
                    v8 /* !! */  = (long)(v9 - z.kpb("kzy", koy(int ), (int)144));
lbl73:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 384567942: {
                            break block42;
                        }
                        case 389954720: {
                            v9 = z.kpb("kzz", koy(int ), (int)145);
                            continue block42;
                        }
                        case 1771632815: {
                            v9 = z.kpb("laa", koy(int ), (int)146);
                            continue block42;
                        }
                    }
                    break;
                }
                v10 /* !! */  = z.as;
                if (true) ** GOTO lbl86
                block43: while (true) {
                    v10 /* !! */  = (long)(v11 - z.kpb("lab", koy(int ), (int)147));
lbl86:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 384567942: {
                            break block43;
                        }
                        case 1352269964: {
                            v11 = z.kpb("lac", koy(int ), (int)148);
                            continue block43;
                        }
                        case 2003852106: {
                            v11 = z.kpb("lad", koy(int ), (int)149);
                            continue block43;
                        }
                    }
                    break;
                }
                z.staffList.addAll(var0);
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl100:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)z.kpb("lae", kpd(int ), (int)135);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl110
            }
            case 1: {
                var2_2 /* !! */  = (int)z.kpb("laf", kpd(int ), (int)136);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl110:
            // 3 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)z.kpb("lag", kpd(int ), (int)137);
                } while (!var3_1);
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)z.kpb("lah", kpd(int ), (int)138);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl128
            }
            case 4: {
                var2_2 /* !! */  = (int)z.kpb("lai", kpd(int ), (int)139);
                if (!var3_1) ** GOTO lbl100
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)z.kpb("laj", kpd(int ), (int)140);
                if (!var3_1) ** GOTO lbl110
                throw null;
            }
lbl128:
            // 3 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)z.kpb("lak", kpd(int ), (int)141);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)z.kpb("lal", kpd(int ), (int)142);
        ** while (!var3_1)
lbl136:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void les() {
        z.koz[100] = 1802004407618603837L;
        z.koz[101] = 4490530390645711931L;
        z.koz[102] = 8877063412375398505L;
        z.koz[103] = -7490331900004993745L;
        z.koz[104] = -2664113816541532456L;
        z.koz[105] = 4856774231292271609L;
        z.koz[106] = -3676180237078627554L;
        z.koz[107] = -9103436643504119135L;
        z.koz[108] = 6244486445865119581L;
        z.koz[109] = -7662639091927257310L;
        z.koz[110] = 283621113506558326L;
        z.koz[111] = -1331386103660145856L;
        z.koz[112] = 6409680714897123282L;
        z.koz[113] = 1694390690974542376L;
        z.koz[114] = -2090311350681515787L;
        z.koz[115] = -9095910236793710598L;
        z.koz[116] = 2833618720948128398L;
        z.koz[117] = -3063361417397332512L;
        z.koz[118] = 7929438733775951485L;
        z.koz[119] = -6962281608230776096L;
        z.koz[120] = 3184291344501722561L;
        z.koz[121] = -4912993199215411939L;
        z.koz[122] = -1258911871277893292L;
        z.koz[123] = -4061626253312544223L;
        z.koz[124] = 8705752780591004927L;
        z.koz[125] = 4349619217957027099L;
        z.koz[126] = -5687888520688246036L;
        z.koz[127] = 1207636508758503873L;
        z.koz[128] = -7331964634829620631L;
        z.koz[129] = 92446564142895581L;
        z.koz[130] = 7985650128676029019L;
        z.koz[131] = -8253500099291420202L;
        z.koz[132] = 6682149582110541157L;
        z.koz[133] = -4614838762900354626L;
        z.koz[134] = -537494742595159537L;
        z.koz[135] = 7869256670775182467L;
        z.koz[136] = -8273887744238951332L;
        z.koz[137] = -7288805839679927536L;
        z.koz[138] = -1905675338018793030L;
        z.koz[139] = 163018097657790562L;
        z.koz[140] = 2869301161551149904L;
        z.koz[141] = 1097940608455354544L;
        z.koz[142] = 270367558219729306L;
        z.koz[143] = 7624278965349441085L;
        z.koz[144] = 528045571367287749L;
        z.koz[145] = -8396582064313370095L;
        z.koz[146] = 9051309224944430351L;
        z.koz[147] = 5783153322877477073L;
        z.koz[148] = 8779462684770849012L;
        z.koz[149] = 6411630683110598261L;
        z.koz[150] = -7435402904788462097L;
        z.koz[151] = 9162544374931055485L;
        z.koz[152] = 9159991417477351925L;
        z.koz[153] = -226642859982975628L;
        z.koz[154] = 4305038929916316638L;
        z.koz[155] = 3259732151659316600L;
        z.koz[156] = -7675435336623899021L;
        z.koz[157] = 1690846638074864826L;
        z.koz[158] = 869213465995274297L;
        z.koz[159] = 6066541213909638286L;
        z.koz[160] = -2598059144868479677L;
        z.koz[161] = -5094919260282398276L;
        z.koz[162] = 1467740014981275636L;
        z.koz[163] = -7121217316510238461L;
        z.koz[164] = -8552642516232013289L;
        z.koz[165] = 8011872407077598947L;
        z.koz[166] = -1686609433539674915L;
        z.koz[167] = -6527709249037294911L;
        z.koz[168] = 5138535220903552542L;
        z.koz[169] = 5660570109881958830L;
        z.koz[170] = -6903724606280704794L;
        z.koz[171] = 3420651086567757161L;
        z.koz[172] = -8978389976843528835L;
        z.koz[173] = -8721540479732929279L;
        z.koz[174] = -7126935773829769873L;
        z.koz[175] = 1450269188824476179L;
        z.koz[176] = 7465244130819297189L;
        z.koz[177] = -7065286398547701478L;
        z.koz[178] = 6822401668337575233L;
        z.koz[179] = -1517351272022723330L;
        z.koz[180] = -9152774699987739360L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void clear() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = z.as - z.kpb("kvn", koy(int ), (int)84)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == z.kpb("kvo", kpd(int ), (int)80)) break;
            v0 /* !! */  = (long)z.kpb("kvp", kpd(int ), (int)81);
        }
        var2 = z.c;
        v1 /* !! */  = z.as;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - z.kpb("kvq", koy(int ), (int)85));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1316770550: {
                    v2 = z.kpb("kvr", koy(int ), (int)86);
                    continue block17;
                }
                case 384567942: {
                    break block17;
                }
                case 1194443595: {
                    v2 = z.kpb("kvs", koy(int ), (int)87);
                    continue block17;
                }
            }
            break;
        }
        var1_1 = z.b;
        v3 /* !! */  = z.as;
        if (true) ** GOTO lbl26
        block18: while (true) {
            v3 /* !! */  = (long)(v4 - z.kpb("kvt", koy(int ), (int)88));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1862980314: {
                    v4 = z.kpb("kvu", koy(int ), (int)89);
                    continue block18;
                }
                case -1607336718: {
                    v4 = z.kpb("kvv", koy(int ), (int)90);
                    continue block18;
                }
                case 384567942: {
                    break block18;
                }
                case 1251096424: {
                    v4 = z.kpb("kvw", koy(int ), (int)91);
                    continue block18;
                }
            }
            break;
        }
        var0_2 = z.a;
        if (var2) {
            throw null;
lbl41:
            // 2 sources

            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl41
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = z.as - z.kpb("kvx", koy(int ), (int)92)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == z.kpb("kvy", kpd(int ), (int)82)) break;
            v5 /* !! */  = (long)z.kpb("kvz", kpd(int ), (int)83);
        }
        v6 /* !! */  = z.as;
        if (true) ** GOTO lbl54
        block21: while (true) {
            v6 /* !! */  = (long)(v7 - z.kpb("kwa", koy(int ), (int)93));
lbl54:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1836955530: {
                    v7 = z.kpb("kwb", koy(int ), (int)94);
                    continue block21;
                }
                case -1800482335: {
                    v7 = z.kpb("kwc", koy(int ), (int)95);
                    continue block21;
                }
                case 384567942: {
                    break block21;
                }
            }
            break;
        }
        z.staffList.clear();
        ** while (var0_2 || var0_2)
lbl65:
        // 1 sources

    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean isStaff(String string) {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = as - z.kpb("kuo", koy(int ), (int)76)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == z.kpb("kup", kpd(int ), (int)63)) break;
            object = z.kpb("kuq", kpd(int ), (int)64);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = as - z.kpb("kur", koy(int ), (int)77)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == z.kpb("kus", kpd(int ), (int)65)) break;
            object = z.kpb("kut", kpd(int ), (int)66);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = as - z.kpb("kuu", koy(int ), (int)78)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == z.kpb("kuv", kpd(int ), (int)67)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = z.kpb("kuw", kpd(int ), (int)68);
        }
        if (bl2) return (boolean)z.kpb("kux", kpd(int ), (int)69);
        if (bl2) return (boolean)z.kpb("kux", kpd(int ), (int)69);
        Object object = as;
        block7: while (true) {
            switch ((int)object) {
                case -1210886133: {
                    object = z.kpb("kuz", koy(int ), (int)80) - z.kpb("kuy", koy(int ), (int)79);
                    continue block7;
                }
                case 384567942: {
                    break block7;
                }
            }
            break;
        }
        while (true) {
            long l5;
            Object object2;
            if ((object2 = (l5 = as - z.kpb("kva", koy(int ), (int)81)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object2 == z.kpb("kvb", kpd(int ), (int)70)) break;
            object2 = z.kpb("kvc", kpd(int ), (int)71);
        }
        Stream stream = staffList.stream();
        while (true) {
            long l6;
            Object object3;
            if ((object3 = (l6 = as - z.kpb("kvd", koy(int ), (int)82)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
            if (object3 == z.kpb("kve", kpd(int ), (int)72)) break;
            object3 = z.kpb("kvf", kpd(int ), (int)73);
        }
        Predicate<y> predicate = arg_0 -> z.lambda$isStaff$1(string, arg_0);
        while (true) {
            long l7;
            Object object4;
            if ((object4 = (l7 = as - z.kpb("kvg", koy(int ), (int)83)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) continue;
            if (object4 == z.kpb("kvh", kpd(int ), (int)74)) {
                return stream.anyMatch(predicate);
            }
            object4 = z.kpb("kvi", kpd(int ), (int)75);
        }
    }

    public static /* synthetic */ CallSite kpb(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void clearAndSave() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = z.as - z.kpb("kwj", koy(int ), (int)96)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == z.kpb("kwk", kpd(int ), (int)90)) break;
            v0 /* !! */  = (long)z.kpb("kwl", kpd(int ), (int)91);
        }
        var2 = z.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = z.as - z.kpb("kwm", koy(int ), (int)97)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == z.kpb("kwn", kpd(int ), (int)92)) break;
            v1 /* !! */  = (long)z.kpb("kwo", kpd(int ), (int)93);
        }
        var1_1 /* !! */  = z.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = z.as - z.kpb("kwp", koy(int ), (int)98)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == z.kpb("kwq", kpd(int ), (int)94)) break;
            v2 /* !! */  = (long)z.kpb("kwr", kpd(int ), (int)95);
        }
        var0_2 = z.a;
        if (!var2) ** GOTO lbl25
        throw null;
lbl-1000:
        // 3 sources

        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl25:
                // 1 sources

                if (var0_2 || var0_2) ** GOTO lbl-1000
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = z.as - z.kpb("kws", koy(int ), (int)99)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == z.kpb("kwt", kpd(int ), (int)96)) break;
                    v3 /* !! */  = (long)z.kpb("kwu", kpd(int ), (int)97);
                }
                z.clear();
                if (var0_2 || var0_2) ** GOTO lbl-1000
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_4 = z.as - z.kpb("kwv", koy(int ), (int)100)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == z.kpb("kww", kpd(int ), (int)98)) break;
                    v4 /* !! */  = (long)z.kpb("kwx", kpd(int ), (int)99);
                }
                v5 = ao.getInstance();
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_5 = z.as - z.kpb("kwy", koy(int ), (int)101)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == z.kpb("kwz", kpd(int ), (int)100)) break;
                    v6 /* !! */  = (long)z.kpb("kxa", kpd(int ), (int)101);
                }
                v5.save();
                if (var0_2 || var0_2) continue block13;
                return;
lbl47:
                // 2 sources

                case 0: {
                    var1_1 /* !! */  = (int)z.kpb("kxb", kpd(int ), (int)102);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl71
                }
lbl52:
                // 3 sources

                case 1: {
                    var1_1 /* !! */  = (int)z.kpb("kxc", kpd(int ), (int)103);
                    if (!var2) ** GOTO lbl47
                    throw null;
                }
                case 2: {
                    var1_1 /* !! */  = (int)z.kpb("kxd", kpd(int ), (int)104);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl75
                }
                case 3: {
                    do {
                        var1_1 /* !! */  = (int)z.kpb("kxe", kpd(int ), (int)105);
                    } while (!var2);
                    throw null;
                }
lbl66:
                // 2 sources

                case 4: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 /* !! */  = (int)z.kpb("kxf", kpd(int ), (int)106);
                        if (!var2) ** GOTO lbl52
                        throw null;
                    }
                }
lbl71:
                // 2 sources

                case 5: {
                    var1_1 /* !! */  = (int)z.kpb("kxg", kpd(int ), (int)107);
                    if (!var2) ** GOTO lbl52
                    throw null;
                }
lbl75:
                // 2 sources

                case 6: {
                    var1_1 /* !! */  = (int)z.kpb("kxh", kpd(int ), (int)108);
                    if (!var2) ** GOTO lbl66
                    throw null;
                }
                case 7: 
            }
        }
        var1_1 /* !! */  = (int)z.kpb("kxi", kpd(int ), (int)109);
        ** while (!var2)
lbl82:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isStaff(class_1297 var0) {
        v0 /* !! */  = z.as;
        if (true) ** GOTO lbl5
        block36: while (true) {
            v0 /* !! */  = (long)(v1 - z.kpb("ktl", koy(int ), (int)61));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 384567942: {
                    break block36;
                }
                case 1368716904: {
                    v1 = z.kpb("ktm", koy(int ), (int)62);
                    continue block36;
                }
                case 1727672400: {
                    v1 = z.kpb("ktn", koy(int ), (int)63);
                    continue block36;
                }
                case 2034854732: {
                    v1 = z.kpb("kto", koy(int ), (int)64);
                    continue block36;
                }
            }
            break;
        }
        var4_1 = z.c;
        v2 /* !! */  = z.as;
        if (true) ** GOTO lbl22
        block37: while (true) {
            v2 /* !! */  = (long)(v3 - z.kpb("ktp", koy(int ), (int)65));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1278365674: {
                    v3 = z.kpb("ktq", koy(int ), (int)66);
                    continue block37;
                }
                case -296106013: {
                    v3 = z.kpb("ktr", koy(int ), (int)67);
                    continue block37;
                }
                case 384567942: {
                    break block37;
                }
            }
            break;
        }
        var3_2 /* !! */  = z.b;
        v4 /* !! */  = z.as;
        if (true) ** GOTO lbl36
        block38: while (true) {
            v4 /* !! */  = (long)(v5 - z.kpb("kts", koy(int ), (int)68));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 35567971: {
                    v5 = z.kpb("ktt", koy(int ), (int)69);
                    continue block38;
                }
                case 184964932: {
                    v5 = z.kpb("ktu", koy(int ), (int)70);
                    continue block38;
                }
                case 384567942: {
                    break block38;
                }
            }
            break;
        }
        var2_3 = z.a;
        if (!var4_1) ** GOTO lbl52
        throw null;
        {
            if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)z.kpb("ktv", kpd(int ), (int)49);
                }
lbl52:
                // 1 sources

                if (var2_3 || var2_3) continue block39;
                if (!(var0 instanceof class_1657)) ** GOTO lbl83
                if (var2_3) continue block39;
                var1_4 = (class_1657)var0;
                if (var2_3 || var2_3) continue block39;
                v6 /* !! */  = z.as;
                if (true) ** GOTO lbl61
                block40: while (true) {
                    v6 /* !! */  = (long)(z.kpb("ktx", koy(int ), (int)72) - z.kpb("ktw", koy(int ), (int)71));
lbl61:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1750850885: {
                            continue block40;
                        }
                        case 384567942: {
                            break block40;
                        }
                    }
                    break;
                }
                v7 = var1_4.method_5477();
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_0 = z.as - z.kpb("kty", koy(int ), (int)73)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == z.kpb("ktz", kpd(int ), (int)50)) break;
                    v8 /* !! */  = (long)z.kpb("kua", kpd(int ), (int)51);
                }
                v9 = v7.getString();
                v10 /* !! */  = z.as;
                if (true) ** GOTO lbl77
                block42: while (true) {
                    v10 /* !! */  = (long)(z.kpb("kuc", koy(int ), (int)75) - z.kpb("kub", koy(int ), (int)74));
lbl77:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 384567942: {
                            break block42;
                        }
                        case 1035865606: {
                            continue block42;
                        }
                    }
                    break;
                }
                return z.isStaff(v9);
lbl83:
                // 1 sources

                if (!var2_3 && !var2_3) ** break;
                continue block39;
                return (boolean)z.kpb("kud", kpd(int ), (int)52);
lbl86:
                // 2 sources

                case 0: {
                    do {
                        var3_2 /* !! */  = (int)z.kpb("kue", kpd(int ), (int)53);
                    } while (!var4_1);
                    throw null;
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_2 /* !! */  = (int)z.kpb("kuf", kpd(int ), (int)54);
                        if (var4_1) {
                            throw null;
                        }
                        ** GOTO lbl118
                        break;
                    }
                }
lbl97:
                // 2 sources

                case 2: {
                    var3_2 /* !! */  = (int)z.kpb("kug", kpd(int ), (int)55);
                    if (!var4_1) break block39;
                    throw null;
                }
lbl101:
                // 2 sources

                case 3: {
                    var3_2 /* !! */  = (int)z.kpb("kuh", kpd(int ), (int)56);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl114
                }
lbl106:
                // 2 sources

                case 4: {
                    var3_2 /* !! */  = (int)z.kpb("kui", kpd(int ), (int)57);
                    if (!var4_1) ** GOTO lbl86
                    throw null;
                }
                case 5: {
                    var3_2 /* !! */  = (int)z.kpb("kuj", kpd(int ), (int)58);
                    if (!var4_1) ** GOTO lbl97
                    throw null;
                }
lbl114:
                // 2 sources

                case 6: {
                    var3_2 /* !! */  = (int)z.kpb("kuk", kpd(int ), (int)59);
                    if (!var4_1) ** GOTO lbl101
                    throw null;
                }
lbl118:
                // 2 sources

                case 7: {
                    var3_2 /* !! */  = (int)z.kpb("kul", kpd(int ), (int)60);
                    if (!var4_1) ** GOTO lbl106
                    throw null;
                }
                case 8: {
                    do {
                        var3_2 /* !! */  = (int)z.kpb("kum", kpd(int ), (int)61);
                    } while (!var4_1);
                    throw null;
                }
                case 9: 
            }
        }
        var3_2 /* !! */  = (int)z.kpb("kun", kpd(int ), (int)62);
        ** while (!var4_1)
lbl130:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lfc() {
        z.kpa[0] = 7299445685146725775L;
        z.kpa[1] = -490716144640700783L;
        z.kpa[2] = -125929875512472767L;
        z.kpa[3] = -8531619418727473455L;
        z.kpa[4] = -7460391266703151929L;
        z.kpa[5] = -3528517142804505379L;
        z.kpa[6] = 2409458029076837554L;
        z.kpa[7] = 5645903313685017453L;
        z.kpa[8] = 4248941707762832913L;
        z.kpa[9] = 1729821417386628785L;
        z.kpa[10] = 473997058098983618L;
        z.kpa[11] = 4056464992368204588L;
        z.kpa[12] = 1028017068315436592L;
        z.kpa[13] = -9023836062303262206L;
        z.kpa[14] = 6992340600090150219L;
        z.kpa[15] = -7220918035542572310L;
        z.kpa[16] = -6561281037158623860L;
        z.kpa[17] = 7032466911887854043L;
        z.kpa[18] = 1609365669739985307L;
        z.kpa[19] = -6023761339943347423L;
        z.kpa[20] = 8838246493497231556L;
        z.kpa[21] = -7833803557408990091L;
        z.kpa[22] = -2323604649924502516L;
        z.kpa[23] = -7627336721871765587L;
        z.kpa[24] = 5275124987692304197L;
        z.kpa[25] = 3995828562507082026L;
        z.kpa[26] = -2186518548158527412L;
        z.kpa[27] = -5853355047399392604L;
        z.kpa[28] = -3261204995830447072L;
        z.kpa[29] = -1225421203921590420L;
        z.kpa[30] = 3246794113243821823L;
        z.kpa[31] = -8240959689845191207L;
        z.kpa[32] = 573707120426940299L;
        z.kpa[33] = 6074084765327577362L;
        z.kpa[34] = -2404073801538397796L;
        z.kpa[35] = -3475516646451812389L;
        z.kpa[36] = -6482634862098152250L;
        z.kpa[37] = -457603515094195027L;
        z.kpa[38] = -2458449758189910212L;
        z.kpa[39] = 9012506119059324768L;
        z.kpa[40] = 4931558564668441283L;
        z.kpa[41] = 7370669582173827023L;
        z.kpa[42] = 552434651291386214L;
        z.kpa[43] = 2959534701798935693L;
        z.kpa[44] = -4170063551135895332L;
        z.kpa[45] = -3447905339791343311L;
        z.kpa[46] = -3986339975875519990L;
        z.kpa[47] = 4742109917095723909L;
        z.kpa[48] = 7661414616341477763L;
        z.kpa[49] = -302385269943502936L;
        z.kpa[50] = 1937827378141352013L;
        z.kpa[51] = -1584838503258226518L;
        z.kpa[52] = -7214865147056574028L;
        z.kpa[53] = 5207335339775784070L;
        z.kpa[54] = 3937225954230213210L;
        z.kpa[55] = 953378187014855504L;
        z.kpa[56] = -1746795931826346861L;
        z.kpa[57] = 8847591278900719018L;
        z.kpa[58] = -4364635840049926673L;
        z.kpa[59] = -3608290149146556804L;
        z.kpa[60] = -6980665726654791145L;
        z.kpa[61] = 4850314362473252215L;
        z.kpa[62] = -3768994205118935672L;
        z.kpa[63] = 5391306226174247943L;
        z.kpa[64] = -3567690024055772141L;
        z.kpa[65] = 8275699355877472413L;
        z.kpa[66] = -5884339074451970708L;
        z.kpa[67] = -8280940585039041161L;
        z.kpa[68] = 8383761678231083806L;
        z.kpa[69] = 4219847931861865987L;
        z.kpa[70] = -1135928802702611563L;
        z.kpa[71] = 369201231234554035L;
        z.kpa[72] = -8362666687458116273L;
        z.kpa[73] = 3269273891535818454L;
        z.kpa[74] = -7966201036900797004L;
        z.kpa[75] = -1713715095655819863L;
        z.kpa[76] = -5508540624911540670L;
        z.kpa[77] = 5301953202650698092L;
        z.kpa[78] = -1408487303362424845L;
        z.kpa[79] = -4412383010291190056L;
        z.kpa[80] = -6178319875915604525L;
        z.kpa[81] = 5621539658650023296L;
        z.kpa[82] = 2339811813916031379L;
        z.kpa[83] = 1943999869122426169L;
        z.kpa[84] = 1628855939090533550L;
        z.kpa[85] = -3411819156748541620L;
        z.kpa[86] = -6193063179890776892L;
        z.kpa[87] = 8126536394367384609L;
        z.kpa[88] = 7018892134934587219L;
        z.kpa[89] = 7063300951275619052L;
        z.kpa[90] = -9111325479999165802L;
        z.kpa[91] = -2784585676172837384L;
        z.kpa[92] = 8980279861271343094L;
        z.kpa[93] = -4641496800752402156L;
        z.kpa[94] = -7541556751778748611L;
        z.kpa[95] = 4002004441753588490L;
        z.kpa[96] = 1604152556612702391L;
        z.kpa[97] = -8747529484022466311L;
        z.kpa[98] = -284173821217810578L;
        z.kpa[99] = 9059201618310738015L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int size() {
        v0 /* !! */  = z.as;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - z.kpb("kyo", koy(int ), (int)121));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -713205087: {
                    v1 = z.kpb("kyp", koy(int ), (int)122);
                    continue block21;
                }
                case -276294310: {
                    v1 = z.kpb("kyq", koy(int ), (int)123);
                    continue block21;
                }
                case 15569422: {
                    v1 = z.kpb("kyr", koy(int ), (int)124);
                    continue block21;
                }
                case 384567942: {
                    break block21;
                }
            }
            break;
        }
        var2 = z.c;
        v2 /* !! */  = z.as;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - z.kpb("kys", koy(int ), (int)125));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 384567942: {
                    break block22;
                }
                case 863015466: {
                    v3 = z.kpb("kyt", koy(int ), (int)126);
                    continue block22;
                }
                case 1532337602: {
                    v3 = z.kpb("kyu", koy(int ), (int)127);
                    continue block22;
                }
            }
            break;
        }
        var1_1 /* !! */  = z.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = z.as - z.kpb("kyv", koy(int ), (int)128)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == z.kpb("kyw", kpd(int ), (int)122)) break;
            v4 /* !! */  = (long)z.kpb("kyx", kpd(int ), (int)123);
        }
        var0_2 = z.a;
        if (var2) {
            throw null;
lbl41:
            // 2 sources

            return (int)z.kpb("kyy", kpd(int ), (int)124);
        }
        if (var0_2) ** GOTO lbl41
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                v5 /* !! */  = z.as;
                if (true) ** GOTO lbl52
                block25: while (true) {
                    v5 /* !! */  = (long)(z.kpb("kza", koy(int ), (int)130) - z.kpb("kyz", koy(int ), (int)129));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 384567942: {
                            break block25;
                        }
                        case 812508328: {
                            continue block25;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = z.as - z.kpb("kzb", koy(int ), (int)131)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == z.kpb("kzc", kpd(int ), (int)125)) break;
                    v6 /* !! */  = (long)z.kpb("kzd", kpd(int ), (int)126);
                }
                return z.staffList.size();
            }
            case 0: {
                var1_1 /* !! */  = (int)z.kpb("kze", kpd(int ), (int)127);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl73
            }
            case 1: {
                var1_1 /* !! */  = (int)z.kpb("kzf", kpd(int ), (int)128);
                if (!var2) break;
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
                    var1_1 /* !! */  = (int)z.kpb("kzg", kpd(int ), (int)129);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)z.kpb("kzh", kpd(int ), (int)130);
        ** while (!var2)
lbl81:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lcw() {
        z.kpe[0] = -1326733352;
        z.kpe[1] = -1585617707;
        z.kpe[2] = 1227533128;
        z.kpe[3] = -1975323853;
        z.kpe[4] = 1106598897;
        z.kpe[5] = 1334909751;
        z.kpe[6] = 1051152265;
        z.kpe[7] = -918498326;
        z.kpe[8] = 754940070;
        z.kpe[9] = -785790804;
        z.kpe[10] = 643261183;
        z.kpe[11] = 1191357676;
        z.kpe[12] = 1052706070;
        z.kpe[13] = -351898367;
        z.kpe[14] = -666371599;
        z.kpe[15] = 266268525;
        z.kpe[16] = -809479582;
        z.kpe[17] = 1231938588;
        z.kpe[18] = 1255815377;
        z.kpe[19] = 1664087686;
        z.kpe[20] = -775178547;
        z.kpe[21] = -733032179;
        z.kpe[22] = -398878120;
        z.kpe[23] = -99088771;
        z.kpe[24] = 1907334734;
        z.kpe[25] = -1310510304;
        z.kpe[26] = 818874316;
        z.kpe[27] = 1207675754;
        z.kpe[28] = 1982853242;
        z.kpe[29] = 1301555878;
        z.kpe[30] = -1121825281;
        z.kpe[31] = 982825386;
        z.kpe[32] = -1407142817;
        z.kpe[33] = 770684351;
        z.kpe[34] = -226914793;
        z.kpe[35] = -617464397;
        z.kpe[36] = 533114278;
        z.kpe[37] = -1024299139;
        z.kpe[38] = -1891517712;
        z.kpe[39] = -1098155976;
        z.kpe[40] = 1997415358;
        z.kpe[41] = 659142874;
        z.kpe[42] = 1166621667;
        z.kpe[43] = 711271001;
        z.kpe[44] = 1300291295;
        z.kpe[45] = 126067769;
        z.kpe[46] = 778277737;
        z.kpe[47] = 249025932;
        z.kpe[48] = 948037006;
        z.kpe[49] = -1171796820;
        z.kpe[50] = 147727065;
        z.kpe[51] = 2080898401;
        z.kpe[52] = 373857667;
        z.kpe[53] = -68263286;
        z.kpe[54] = 796220881;
        z.kpe[55] = 128741213;
        z.kpe[56] = -1313569124;
        z.kpe[57] = 411123653;
        z.kpe[58] = 387159887;
        z.kpe[59] = 865176748;
        z.kpe[60] = -1458035783;
        z.kpe[61] = 1396009009;
        z.kpe[62] = 1226339946;
        z.kpe[63] = -1119505390;
        z.kpe[64] = 118586507;
        z.kpe[65] = 1646738494;
        z.kpe[66] = -541362658;
        z.kpe[67] = 614779162;
        z.kpe[68] = -1449045281;
        z.kpe[69] = -586751733;
        z.kpe[70] = 1530943708;
        z.kpe[71] = 395921795;
        z.kpe[72] = 745638886;
        z.kpe[73] = -1767852790;
        z.kpe[74] = 817206083;
        z.kpe[75] = 667516340;
        z.kpe[76] = 457118085;
        z.kpe[77] = 1014063852;
        z.kpe[78] = -705809095;
        z.kpe[79] = 49832809;
        z.kpe[80] = -913484941;
        z.kpe[81] = 1865294140;
        z.kpe[82] = -425420048;
        z.kpe[83] = -846958739;
        z.kpe[84] = -423374421;
        z.kpe[85] = -1107186814;
        z.kpe[86] = -1622893120;
        z.kpe[87] = 632773110;
        z.kpe[88] = -1446786975;
        z.kpe[89] = -518006754;
        z.kpe[90] = -1913149458;
        z.kpe[91] = -340162364;
        z.kpe[92] = -1668841281;
        z.kpe[93] = 1002637987;
        z.kpe[94] = -350942663;
        z.kpe[95] = 311332313;
        z.kpe[96] = -774598442;
        z.kpe[97] = 218268594;
        z.kpe[98] = -1365096868;
        z.kpe[99] = -1533151561;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$isStaff$1(String var0, y var1_1) {
        v0 /* !! */  = z.as;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - z.kpb("lbg", koy(int ), (int)157));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 43261080: {
                    v1 = z.kpb("lbh", koy(int ), (int)158);
                    continue block28;
                }
                case 384567942: {
                    break block28;
                }
                case 1948479419: {
                    v1 = z.kpb("lbi", koy(int ), (int)159);
                    continue block28;
                }
            }
            break;
        }
        var4_2 = z.c;
        v2 /* !! */  = z.as;
        if (true) ** GOTO lbl19
        block29: while (true) {
            v2 /* !! */  = (long)(v3 - z.kpb("lbj", koy(int ), (int)160));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -927486622: {
                    v3 = z.kpb("lbk", koy(int ), (int)161);
                    continue block29;
                }
                case -741647100: {
                    v3 = z.kpb("lbl", koy(int ), (int)162);
                    continue block29;
                }
                case -533003037: {
                    v3 = z.kpb("lbm", koy(int ), (int)163);
                    continue block29;
                }
                case 384567942: {
                    break block29;
                }
            }
            break;
        }
        var3_3 /* !! */  = z.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = z.as - z.kpb("lbn", koy(int ), (int)164)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == z.kpb("lbo", kpd(int ), (int)156)) break;
            v4 /* !! */  = (long)z.kpb("lbp", kpd(int ), (int)157);
        }
        var2_4 = z.a;
        if (var4_2) {
            throw null;
lbl41:
            // 1 sources

            return (boolean)z.kpb("lbq", kpd(int ), (int)158);
        }
        ** while (var2_4 || var2_4)
lbl44:
        // 1 sources

        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = z.as;
                if (true) ** GOTO lbl51
                block32: while (true) {
                    v5 /* !! */  = (long)(v6 - z.kpb("lbr", koy(int ), (int)165));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1336441817: {
                            v6 = z.kpb("lbs", koy(int ), (int)166);
                            continue block32;
                        }
                        case -463009477: {
                            v6 = z.kpb("lbt", koy(int ), (int)167);
                            continue block32;
                        }
                        case 384567942: {
                            break block32;
                        }
                    }
                    break;
                }
                v7 = var1_1.getName();
                v8 /* !! */  = z.as;
                if (true) ** GOTO lbl65
                block33: while (true) {
                    v8 /* !! */  = (long)(v9 - z.kpb("lbu", koy(int ), (int)168));
lbl65:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -477521313: {
                            v9 = z.kpb("lbv", koy(int ), (int)169);
                            continue block33;
                        }
                        case -213464802: {
                            v9 = z.kpb("lbw", koy(int ), (int)170);
                            continue block33;
                        }
                        case 384567942: {
                            break block33;
                        }
                        case 1109983624: {
                            v9 = z.kpb("lbx", koy(int ), (int)171);
                            continue block33;
                        }
                    }
                    break;
                }
                return v7.equalsIgnoreCase(var0);
            }
lbl78:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)z.kpb("lby", kpd(int ), (int)159);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl88
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)z.kpb("lbz", kpd(int ), (int)160);
                } while (!var4_2);
                throw null;
            }
lbl88:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)z.kpb("lca", kpd(int ), (int)161);
                    if (!var4_2) ** GOTO lbl78
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)z.kpb("lcb", kpd(int ), (int)162);
        ** while (!var4_2)
lbl96:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean lambda$removeStaff$0(String var0, y var1_1) {
        block27: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = z.as - z.kpb("lcc", koy(int ), (int)172)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == z.kpb("lcd", kpd(int ), (int)163)) break;
                v0 /* !! */  = (long)z.kpb("lce", kpd(int ), (int)164);
            }
            var4_2 = z.c;
            while (true) {
                block28: {
                    if ((v1 /* !! */  = (cfr_temp_2 = z.as - z.kpb("lcf", koy(int ), (int)173)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  != z.kpb("lcg", kpd(int ), (int)165)) break block28;
                    var3_3 /* !! */  = z.b;
                    v2 /* !! */  = z.as;
                    if (true) ** GOTO lbl18
                }
                v1 /* !! */  = (long)z.kpb("lch", kpd(int ), (int)166);
            }
            block18: while (true) {
                v2 /* !! */  = (long)(v3 - z.kpb("lci", koy(int ), (int)174));
lbl18:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -612500737: {
                        v3 = z.kpb("lcj", koy(int ), (int)175);
                        continue block18;
                    }
                    case -191180967: {
                        v3 = z.kpb("lck", koy(int ), (int)176);
                        continue block18;
                    }
                    case 384567942: {
                        break block18;
                    }
                    case 1830603732: {
                        v3 = z.kpb("lcl", koy(int ), (int)177);
                        continue block18;
                    }
                }
                break;
            }
            var2_4 = z.a;
            if (var4_2) {
                throw null;
            }
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block19: do {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var2_4 != false) return (boolean)z.kpb("lcm", kpd(int ), (int)167);
                        if (var2_4 != false) return (boolean)z.kpb("lcm", kpd(int ), (int)167);
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_3 = z.as - z.kpb("lcn", koy(int ), (int)178)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v4 /* !! */  == z.kpb("lco", kpd(int ), (int)168)) {
                                v5 = var1_1.getName();
                                v6 /* !! */  = z.as;
                                ** break;
                            }
                            v4 /* !! */  = (long)z.kpb("lcp", kpd(int ), (int)169);
                        }
                    }
                    case 0: {
                        ** GOTO lbl60
                    }
                    case 3: {
                        break block27;
                    }
lbl52:
                    // 1 sources

                    block21: while (true) {
                        switch ((int)v6 /* !! */ ) {
                            case 384567942: {
                                return v5.equalsIgnoreCase(var0);
                            }
                            case 1026738715: {
                                v6 /* !! */  = (long)(z.kpb("lcr", koy(int ), (int)180) - z.kpb("lcq", koy(int ), (int)179));
                                continue block21;
                            }
                        }
                        break;
                    }
                    return v5.equalsIgnoreCase(var0);
lbl60:
                    // 2 sources

                    while (true) {
                        var3_3 /* !! */  = (int)z.kpb("lcs", kpd(int ), (int)170);
                        cfr_temp_0 = 2;
                        if (!var4_2) continue block19;
                        throw null;
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)z.kpb("lcu", kpd(int ), (int)172);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 1: 
                }
                break;
            } while (true);
            var3_3 /* !! */  = (int)z.kpb("lct", kpd(int ), (int)171);
            if (var4_2) {
                throw null;
            }
        }
        var3_3 /* !! */  = (int)z.kpb("lcv", kpd(int ), (int)173);
        ** while (!var4_2)
lbl78:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private z() {
        var2_1 /* !! */  = z.b;
        var1_2 = z.a;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
            }
            case 0: {
                var2_1 /* !! */  = (int)z.kpb("lam", kpd(int ), (int)143);
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)z.kpb("lan", kpd(int ), (int)144);
                    continue;
                    break;
                }
            }
            case 2: 
        }
        var2_1 /* !! */  = (int)z.kpb("lao", kpd(int ), (int)145);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void removeStaffAndSave(String var0) {
        v0 /* !! */  = z.as;
        if (true) ** GOTO lbl5
        block41: while (true) {
            v0 /* !! */  = (long)(v1 - z.kpb("ksk", koy(int ), (int)42));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1786537602: {
                    v1 = z.kpb("ksl", koy(int ), (int)43);
                    continue block41;
                }
                case -1664559875: {
                    v1 = z.kpb("ksm", koy(int ), (int)44);
                    continue block41;
                }
                case -349944247: {
                    v1 = z.kpb("ksn", koy(int ), (int)45);
                    continue block41;
                }
                case 384567942: {
                    break block41;
                }
            }
            break;
        }
        var3_1 = z.c;
        v2 /* !! */  = z.as;
        if (true) ** GOTO lbl22
        block42: while (true) {
            v2 /* !! */  = (long)(v3 - z.kpb("kso", koy(int ), (int)46));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 384567942: {
                    break block42;
                }
                case 469947805: {
                    v3 = z.kpb("ksp", koy(int ), (int)47);
                    continue block42;
                }
                case 1938494601: {
                    v3 = z.kpb("ksq", koy(int ), (int)48);
                    continue block42;
                }
            }
            break;
        }
        var2_2 /* !! */  = z.b;
        v4 /* !! */  = z.as;
        if (true) ** GOTO lbl36
        block43: while (true) {
            v4 /* !! */  = (long)(z.kpb("kss", koy(int ), (int)50) - z.kpb("ksr", koy(int ), (int)49));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1703235115: {
                    continue block43;
                }
                case 384567942: {
                    break block43;
                }
            }
            break;
        }
        var1_3 = z.a;
        if (var3_1) {
            throw null;
lbl44:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl44
        v5 /* !! */  = z.as;
        if (true) ** GOTO lbl51
        block45: while (true) {
            v5 /* !! */  = (long)(v6 - z.kpb("kst", koy(int ), (int)51));
lbl51:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 384567942: {
                    break block45;
                }
                case 1065796870: {
                    v6 = z.kpb("ksu", koy(int ), (int)52);
                    continue block45;
                }
                case 1829344285: {
                    v6 = z.kpb("ksv", koy(int ), (int)53);
                    continue block45;
                }
                case 1920598885: {
                    v6 = z.kpb("ksw", koy(int ), (int)54);
                    continue block45;
                }
            }
            break;
        }
        z.removeStaff(var0);
        if (var1_3 || var1_3) ** GOTO lbl44
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v7 /* !! */  = z.as;
                if (true) ** GOTO lbl72
                block46: while (true) {
                    v7 /* !! */  = (long)(z.kpb("ksy", koy(int ), (int)56) - z.kpb("ksx", koy(int ), (int)55));
lbl72:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 384567942: {
                            break block46;
                        }
                        case 1093218460: {
                            continue block46;
                        }
                    }
                    break;
                }
                v8 = ao.getInstance();
                v9 /* !! */  = z.as;
                if (true) ** GOTO lbl82
                block47: while (true) {
                    v9 /* !! */  = (long)(v10 - z.kpb("ksz", koy(int ), (int)57));
lbl82:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1618927753: {
                            v10 = z.kpb("kta", koy(int ), (int)58);
                            continue block47;
                        }
                        case -794402406: {
                            v10 = z.kpb("ktb", koy(int ), (int)59);
                            continue block47;
                        }
                        case 384567942: {
                            break block47;
                        }
                        case 1322029040: {
                            v10 = z.kpb("ktc", koy(int ), (int)60);
                            continue block47;
                        }
                    }
                    break;
                }
                v8.save();
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl97:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)z.kpb("ktd", kpd(int ), (int)41);
                if (var3_1) {
                    throw null;
                }
            }
lbl101:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)z.kpb("kte", kpd(int ), (int)42);
                if (!var3_1) ** GOTO lbl97
                throw null;
            }
lbl105:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)z.kpb("ktf", kpd(int ), (int)43);
                if (!var3_1) break;
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)z.kpb("ktg", kpd(int ), (int)44);
                if (!var3_1) ** GOTO lbl105
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)z.kpb("kth", kpd(int ), (int)45);
                    if (!var3_1) ** GOTO lbl101
                    throw null;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)z.kpb("kti", kpd(int ), (int)46);
                if (var3_1) {
                    throw null;
                }
            }
            case 6: {
                var2_2 /* !! */  = (int)z.kpb("ktj", kpd(int ), (int)47);
                if (!var3_1) break;
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)z.kpb("ktk", kpd(int ), (int)48);
        ** while (!var3_1)
lbl129:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ldc() {
        z.kpe[100] = -2072430262;
        z.kpe[101] = -1098421115;
        z.kpe[102] = 580853754;
        z.kpe[103] = 592759816;
        z.kpe[104] = 696051661;
        z.kpe[105] = 1432698988;
        z.kpe[106] = -1036238864;
        z.kpe[107] = -1647160086;
        z.kpe[108] = -1110722040;
        z.kpe[109] = 738774336;
        z.kpe[110] = -95765635;
        z.kpe[111] = 1020353101;
        z.kpe[112] = 1183859961;
        z.kpe[113] = 1633231909;
        z.kpe[114] = -1480620013;
        z.kpe[115] = -712910830;
        z.kpe[116] = 1212742322;
        z.kpe[117] = 1224936795;
        z.kpe[118] = 489252997;
        z.kpe[119] = 2107834800;
        z.kpe[120] = 771056593;
        z.kpe[121] = 823143726;
        z.kpe[122] = 1849293968;
        z.kpe[123] = 1063581690;
        z.kpe[124] = 739091576;
        z.kpe[125] = 1849970023;
        z.kpe[126] = 958755583;
        z.kpe[127] = -1314596443;
        z.kpe[128] = 1105369379;
        z.kpe[129] = -504309976;
        z.kpe[130] = 1755012520;
        z.kpe[131] = 1070196990;
        z.kpe[132] = -1140836064;
        z.kpe[133] = -1483088243;
        z.kpe[134] = 458349511;
        z.kpe[135] = 540867418;
        z.kpe[136] = 35144037;
        z.kpe[137] = -953901448;
        z.kpe[138] = 1648427822;
        z.kpe[139] = -203510664;
        z.kpe[140] = -1966175524;
        z.kpe[141] = 2032802743;
        z.kpe[142] = -1553372958;
        z.kpe[143] = 849098511;
        z.kpe[144] = -1076267450;
        z.kpe[145] = 580047915;
        z.kpe[146] = 1981662394;
        z.kpe[147] = 1548019465;
        z.kpe[148] = 1491788202;
        z.kpe[149] = -1611918412;
        z.kpe[150] = 1207094734;
        z.kpe[151] = 123210506;
        z.kpe[152] = 1047633879;
        z.kpe[153] = 317329007;
        z.kpe[154] = -1763829670;
        z.kpe[155] = -21379268;
        z.kpe[156] = -676001345;
        z.kpe[157] = -854236126;
        z.kpe[158] = 2065901698;
        z.kpe[159] = 1164005133;
        z.kpe[160] = -1926938631;
        z.kpe[161] = -884000253;
        z.kpe[162] = 242671573;
        z.kpe[163] = -709692999;
        z.kpe[164] = 1073157236;
        z.kpe[165] = 1135423721;
        z.kpe[166] = -1099121471;
        z.kpe[167] = -442002783;
        z.kpe[168] = 887946012;
        z.kpe[169] = 1341632074;
        z.kpe[170] = -1307753034;
        z.kpe[171] = -579126797;
        z.kpe[172] = 1861721399;
        z.kpe[173] = -2120770877;
    }

    private static /* synthetic */ int kpd(int n2) {
        return kpe[n2] ^ kpf[n2];
    }

    private static /* synthetic */ long koy(int n2) {
        return koz[n2] ^ kpa[n2];
    }

    private static /* synthetic */ void lfl() {
        z.kpa[100] = -3890984876282214302L;
        z.kpa[101] = -6662123264112087700L;
        z.kpa[102] = 30877016229000865L;
        z.kpa[103] = 2564325674010228787L;
        z.kpa[104] = 6270888039922626472L;
        z.kpa[105] = -3269913629812573018L;
        z.kpa[106] = 8810895843997411060L;
        z.kpa[107] = 4640862683472787293L;
        z.kpa[108] = -5319361172894454812L;
        z.kpa[109] = 1575419641209475364L;
        z.kpa[110] = -6945698131532268276L;
        z.kpa[111] = -8598615660485674677L;
        z.kpa[112] = 2401486863360918597L;
        z.kpa[113] = -4520558861307376110L;
        z.kpa[114] = -4937358114685374675L;
        z.kpa[115] = -5692983511064169795L;
        z.kpa[116] = -8862390443866233696L;
        z.kpa[117] = 7776155540515648410L;
        z.kpa[118] = -5987995686713347491L;
        z.kpa[119] = 6643808912263931458L;
        z.kpa[120] = 4021227054931308777L;
        z.kpa[121] = 2369223560185138040L;
        z.kpa[122] = -8736069536225371901L;
        z.kpa[123] = 6444541564328450280L;
        z.kpa[124] = 1594240293881613332L;
        z.kpa[125] = -7723980488299922038L;
        z.kpa[126] = -3985170167832394958L;
        z.kpa[127] = 5517482707754329308L;
        z.kpa[128] = -4911544632554449068L;
        z.kpa[129] = -3488051552227262235L;
        z.kpa[130] = 6141225502290081588L;
        z.kpa[131] = -4767157469469757679L;
        z.kpa[132] = -5032598744620568185L;
        z.kpa[133] = -5770037111587307871L;
        z.kpa[134] = -4581926991974129990L;
        z.kpa[135] = 6654656435971902305L;
        z.kpa[136] = -9208112931270322380L;
        z.kpa[137] = 8200766135992779891L;
        z.kpa[138] = -5616698278995582203L;
        z.kpa[139] = -3328567962825867658L;
        z.kpa[140] = -2950664350232546206L;
        z.kpa[141] = -6143955582192339742L;
        z.kpa[142] = -3101687365790261830L;
        z.kpa[143] = 3822780933304533592L;
        z.kpa[144] = -1575669079958645275L;
        z.kpa[145] = 3007312127927493110L;
        z.kpa[146] = -1676180810661966947L;
        z.kpa[147] = -4109336724038323732L;
        z.kpa[148] = 8301643012827806764L;
        z.kpa[149] = -3628620708530599089L;
        z.kpa[150] = -7528728132786571564L;
        z.kpa[151] = -6703008322083286466L;
        z.kpa[152] = 372198961048621292L;
        z.kpa[153] = -6281080056657831786L;
        z.kpa[154] = -3499700296347036047L;
        z.kpa[155] = -7548080052604113904L;
        z.kpa[156] = -5163988974761949862L;
        z.kpa[157] = -5908177197371002824L;
        z.kpa[158] = 5100324809373130469L;
        z.kpa[159] = 4259041708506606274L;
        z.kpa[160] = -4099663435491721079L;
        z.kpa[161] = -8087692950302233693L;
        z.kpa[162] = 1388107821779316846L;
        z.kpa[163] = -3444008741006100934L;
        z.kpa[164] = 3926631503910313507L;
        z.kpa[165] = 7534287562947747724L;
        z.kpa[166] = 6944368560295222503L;
        z.kpa[167] = -539045855944072686L;
        z.kpa[168] = -4721762911377559080L;
        z.kpa[169] = -7233881127897712163L;
        z.kpa[170] = 883818402539069245L;
        z.kpa[171] = -2471940128451519954L;
        z.kpa[172] = 212645621292301917L;
        z.kpa[173] = -4514859055694425124L;
        z.kpa[174] = -2599589627643768827L;
        z.kpa[175] = 3071347109321999371L;
        z.kpa[176] = 8201014263733476013L;
        z.kpa[177] = -2430855755864631899L;
        z.kpa[178] = 9094638376834975569L;
        z.kpa[179] = 1760274444989486849L;
        z.kpa[180] = -9045542756111355439L;
    }

    static {
        kpe = new int[174];
        kpf = new int[174];
        z.lcw();
        z.ldc();
        z.ldm();
        z.ldw();
        koz = new long[181];
        kpa = new long[181];
        z.leg();
        z.les();
        z.lfc();
        z.lfl();
        staffList = new ArrayList<y>();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static List<y> getStaffList() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = z.as - z.kpb("lap", koy(int ), (int)150)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == z.kpb("laq", kpd(int ), (int)146)) break;
            v0 /* !! */  = (long)z.kpb("lar", kpd(int ), (int)147);
        }
        var2 = z.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = z.as - z.kpb("las", koy(int ), (int)151)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == z.kpb("lat", kpd(int ), (int)148)) break;
            v1 /* !! */  = (long)z.kpb("lau", kpd(int ), (int)149);
        }
        var1_1 /* !! */  = z.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = z.as;
                if (true) ** GOTO lbl22
                block14: while (true) {
                    v2 /* !! */  = (long)(v3 - z.kpb("lav", koy(int ), (int)152));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1454482819: {
                            v3 = z.kpb("law", koy(int ), (int)153);
                            continue block14;
                        }
                        case -466713333: {
                            v3 = z.kpb("lax", koy(int ), (int)154);
                            continue block14;
                        }
                        case 384567942: {
                            break block14;
                        }
                        case 842821508: {
                            v3 = z.kpb("lay", koy(int ), (int)155);
                            continue block14;
                        }
                    }
                    break;
                }
                var0_2 = z.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = z.as - z.kpb("laz", koy(int ), (int)156)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == z.kpb("lba", kpd(int ), (int)150)) break;
                    v4 /* !! */  = (long)z.kpb("lbb", kpd(int ), (int)151);
                }
                return z.staffList;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)z.kpb("lbc", kpd(int ), (int)152);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)z.kpb("lbd", kpd(int ), (int)153);
                } while (!var2);
                throw null;
            }
            case 2: {
                do {
                    var1_1 /* !! */  = (int)z.kpb("lbe", kpd(int ), (int)154);
                } while (!var2);
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)z.kpb("lbf", kpd(int ), (int)155);
        ** while (!var2)
lbl65:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void addStaff(String var0) {
        block52: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = z.as - z.kpb("kpc", koy(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == z.kpb("kpg", kpd(int ), (int)0)) break;
                v0 /* !! */  = (long)z.kpb("kph", kpd(int ), (int)1);
            }
            var3_1 = z.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = z.as - z.kpb("kpi", koy(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == z.kpb("kpj", kpd(int ), (int)2)) break;
                v1 /* !! */  = (long)z.kpb("kpk", kpd(int ), (int)3);
            }
            var2_2 /* !! */  = z.b;
            v2 /* !! */  = z.as;
            if (true) ** GOTO lbl19
            block33: while (true) {
                v2 /* !! */  = (long)(z.kpb("kpm", koy(int ), (int)3) - z.kpb("kpl", koy(int ), (int)2));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case 384567942: {
                        break block33;
                    }
                    case 740161279: {
                        continue block33;
                    }
                }
                break;
            }
            var1_3 = z.a;
            if (var3_1) {
                throw null;
lbl27:
                // 5 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl27
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = z.as - z.kpb("kpn", koy(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == z.kpb("kpo", kpd(int ), (int)4)) break;
                v3 /* !! */  = (long)z.kpb("kpp", kpd(int ), (int)5);
            }
            if (z.isStaff(var0)) break block52;
            if (var1_3 || var1_3) ** GOTO lbl27
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_3 = z.as - z.kpb("kpq", koy(int ), (int)5)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == z.kpb("kpr", kpd(int ), (int)6)) break;
                v4 /* !! */  = (long)z.kpb("kps", kpd(int ), (int)7);
            }
            v5 /* !! */  = z.as;
            if (true) ** GOTO lbl48
            block37: while (true) {
                v5 /* !! */  = (long)(v6 - z.kpb("kpt", koy(int ), (int)6));
lbl48:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1686532711: {
                        v6 = z.kpb("kpu", koy(int ), (int)7);
                        continue block37;
                    }
                    case 384567942: {
                        break block37;
                    }
                    case 483941130: {
                        v6 = z.kpb("kpv", koy(int ), (int)8);
                        continue block37;
                    }
                }
                break;
            }
            v7 /* !! */  = z.as;
            if (true) ** GOTO lbl61
            block38: while (true) {
                v7 /* !! */  = (long)(v8 - z.kpb("kpw", koy(int ), (int)9));
lbl61:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1900533066: {
                        v8 = z.kpb("kpx", koy(int ), (int)10);
                        continue block38;
                    }
                    case -1478607913: {
                        v8 = z.kpb("kpy", koy(int ), (int)11);
                        continue block38;
                    }
                    case -328450911: {
                        v8 = z.kpb("kpz", koy(int ), (int)12);
                        continue block38;
                    }
                    case 384567942: {
                        break block38;
                    }
                }
                break;
            }
            v9 = new y(var0);
            v10 /* !! */  = z.as;
            if (true) ** GOTO lbl78
            block39: while (true) {
                v10 /* !! */  = (long)(v11 - z.kpb("kqa", koy(int ), (int)13));
lbl78:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case 384567942: {
                        break block39;
                    }
                    case 930692438: {
                        v11 = z.kpb("kqb", koy(int ), (int)14);
                        continue block39;
                    }
                    case 1079321663: {
                        v11 = z.kpb("kqc", koy(int ), (int)15);
                        continue block39;
                    }
                }
                break;
            }
            z.staffList.add(v9);
            if (var1_3) ** GOTO lbl27
        }
        if (var1_3) ** GOTO lbl27
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
                var2_2 /* !! */  = (int)z.kpb("kqd", kpd(int ), (int)8);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl103:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)z.kpb("kqe", kpd(int ), (int)9);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl117
            }
            case 2: {
                var2_2 /* !! */  = (int)z.kpb("kqf", kpd(int ), (int)10);
                if (!var3_1) break;
                throw null;
            }
            case 3: {
                do {
                    var2_2 /* !! */  = (int)z.kpb("kqg", kpd(int ), (int)11);
                } while (!var3_1);
                throw null;
            }
lbl117:
            // 3 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)z.kpb("kqh", kpd(int ), (int)12);
                    if (!var3_1) ** GOTO lbl103
                    throw null;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)z.kpb("kqi", kpd(int ), (int)13);
                if (!var3_1) break;
                throw null;
            }
lbl126:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)z.kpb("kqj", kpd(int ), (int)14);
                if (var3_1) {
                    throw null;
                }
            }
            case 7: {
                var2_2 /* !! */  = (int)z.kpb("kqk", kpd(int ), (int)15);
                if (!var3_1) ** GOTO lbl126
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)z.kpb("kql", kpd(int ), (int)16);
        ** while (!var3_1)
lbl137:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ldm() {
        z.kpf[0] = 1326733351;
        z.kpf[1] = -2081055577;
        z.kpf[2] = 1227533129;
        z.kpf[3] = -211158166;
        z.kpf[4] = 1106598896;
        z.kpf[5] = -1795550741;
        z.kpf[6] = -1051152266;
        z.kpf[7] = -636538298;
        z.kpf[8] = 754940071;
        z.kpf[9] = -785790801;
        z.kpf[10] = 643261183;
        z.kpf[11] = 1191357676;
        z.kpf[12] = 1052706071;
        z.kpf[13] = -351898363;
        z.kpf[14] = -666371595;
        z.kpf[15] = 266268524;
        z.kpf[16] = -809479584;
        z.kpf[17] = -1231938589;
        z.kpf[18] = -1058357631;
        z.kpf[19] = 1664087686;
        z.kpf[20] = -775178546;
        z.kpf[21] = -733032178;
        z.kpf[22] = -398878118;
        z.kpf[23] = -99088775;
        z.kpf[24] = 1907334733;
        z.kpf[25] = -1310510297;
        z.kpf[26] = 818874318;
        z.kpf[27] = -1207675755;
        z.kpf[28] = -1672368758;
        z.kpf[29] = -1301555879;
        z.kpf[30] = -1074819448;
        z.kpf[31] = -982825387;
        z.kpf[32] = -1787889299;
        z.kpf[33] = 770684350;
        z.kpf[34] = -2058960563;
        z.kpf[35] = -617464400;
        z.kpf[36] = 533114276;
        z.kpf[37] = -1024299143;
        z.kpf[38] = -1891517712;
        z.kpf[39] = -1098155972;
        z.kpf[40] = 1997415354;
        z.kpf[41] = 659142872;
        z.kpf[42] = 1166621667;
        z.kpf[43] = 711271007;
        z.kpf[44] = 1300291292;
        z.kpf[45] = 126067772;
        z.kpf[46] = 778277737;
        z.kpf[47] = 249025932;
        z.kpf[48] = 948037005;
        z.kpf[49] = -1171796819;
        z.kpf[50] = -147727066;
        z.kpf[51] = 448747085;
        z.kpf[52] = 373857667;
        z.kpf[53] = -68263294;
        z.kpf[54] = 796220884;
        z.kpf[55] = 128741215;
        z.kpf[56] = -1313569123;
        z.kpf[57] = 411123651;
        z.kpf[58] = 387159880;
        z.kpf[59] = 865176744;
        z.kpf[60] = -1458035782;
        z.kpf[61] = 1396009013;
        z.kpf[62] = 1226339944;
        z.kpf[63] = 1119505389;
        z.kpf[64] = -930363143;
        z.kpf[65] = -1646738495;
        z.kpf[66] = -498801855;
        z.kpf[67] = -614779163;
        z.kpf[68] = -1077674276;
        z.kpf[69] = -586751733;
        z.kpf[70] = 1530943709;
        z.kpf[71] = -1026555439;
        z.kpf[72] = -745638887;
        z.kpf[73] = 1329488722;
        z.kpf[74] = -817206084;
        z.kpf[75] = -1271521023;
        z.kpf[76] = 457118086;
        z.kpf[77] = 1014063855;
        z.kpf[78] = -705809096;
        z.kpf[79] = 49832808;
        z.kpf[80] = 913484940;
        z.kpf[81] = 370078391;
        z.kpf[82] = -425420047;
        z.kpf[83] = 993185402;
        z.kpf[84] = -423374423;
        z.kpf[85] = -1107186816;
        z.kpf[86] = -1622893117;
        z.kpf[87] = 632773109;
        z.kpf[88] = -1446786972;
        z.kpf[89] = -518006754;
        z.kpf[90] = 1913149457;
        z.kpf[91] = -854385937;
        z.kpf[92] = 1668841280;
        z.kpf[93] = 1133509742;
        z.kpf[94] = -350942664;
        z.kpf[95] = 596197275;
        z.kpf[96] = 774598441;
        z.kpf[97] = -1952555998;
        z.kpf[98] = 1365096867;
        z.kpf[99] = -587925827;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void addStaffAndSave(String var0) {
        v0 /* !! */  = z.as;
        if (true) ** GOTO lbl5
        block35: while (true) {
            v0 /* !! */  = (long)(z.kpb("kqn", koy(int ), (int)17) - z.kpb("kqm", koy(int ), (int)16));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -72387627: {
                    continue block35;
                }
                case 384567942: {
                    break block35;
                }
            }
            break;
        }
        var3_1 = z.c;
        v1 /* !! */  = z.as;
        if (true) ** GOTO lbl15
        block36: while (true) {
            v1 /* !! */  = (long)(v2 - z.kpb("kqo", koy(int ), (int)18));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1786412257: {
                    v2 = z.kpb("kqp", koy(int ), (int)19);
                    continue block36;
                }
                case -796620900: {
                    v2 = z.kpb("kqq", koy(int ), (int)20);
                    continue block36;
                }
                case -693102859: {
                    v2 = z.kpb("kqr", koy(int ), (int)21);
                    continue block36;
                }
                case 384567942: {
                    break block36;
                }
            }
            break;
        }
        var2_2 /* !! */  = z.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = z.as - z.kpb("kqs", koy(int ), (int)22)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == z.kpb("kqt", kpd(int ), (int)17)) break;
            v3 /* !! */  = (long)z.kpb("kqu", kpd(int ), (int)18);
        }
        var1_3 = z.a;
        if (var3_1) {
            throw null;
lbl37:
            // 4 sources

            return;
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl37
                v4 /* !! */  = z.as;
                if (true) ** GOTO lbl48
                block39: while (true) {
                    v4 /* !! */  = (long)(v5 - z.kpb("kqv", koy(int ), (int)23));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -718142409: {
                            v5 = z.kpb("kqw", koy(int ), (int)24);
                            continue block39;
                        }
                        case -554626325: {
                            v5 = z.kpb("kqx", koy(int ), (int)25);
                            continue block39;
                        }
                        case 172092307: {
                            v5 = z.kpb("kqy", koy(int ), (int)26);
                            continue block39;
                        }
                        case 384567942: {
                            break block39;
                        }
                    }
                    break;
                }
                z.addStaff(var0);
                if (var1_3 || var1_3) ** GOTO lbl37
                v6 /* !! */  = z.as;
                if (true) ** GOTO lbl66
                block40: while (true) {
                    v6 /* !! */  = (long)(v7 - z.kpb("kqz", koy(int ), (int)27));
lbl66:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 384567942: {
                            break block40;
                        }
                        case 941625710: {
                            v7 = z.kpb("kra", koy(int ), (int)28);
                            continue block40;
                        }
                        case 1618473688: {
                            v7 = z.kpb("krb", koy(int ), (int)29);
                            continue block40;
                        }
                    }
                    break;
                }
                v8 = ao.getInstance();
                v9 /* !! */  = z.as;
                if (true) ** GOTO lbl80
                block41: while (true) {
                    v9 /* !! */  = (long)(z.kpb("krd", koy(int ), (int)31) - z.kpb("krc", koy(int ), (int)30));
lbl80:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 384567942: {
                            break block41;
                        }
                        case 1656026883: {
                            continue block41;
                        }
                    }
                    break;
                }
                v8.save();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl89:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)z.kpb("kre", kpd(int ), (int)19);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl94:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)z.kpb("krf", kpd(int ), (int)20);
                } while (!var3_1);
                throw null;
            }
lbl99:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)z.kpb("krg", kpd(int ), (int)21);
                if (!var3_1) ** GOTO lbl94
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)z.kpb("krh", kpd(int ), (int)22);
                if (!var3_1) ** GOTO lbl99
                throw null;
            }
lbl107:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)z.kpb("kri", kpd(int ), (int)23);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)z.kpb("krj", kpd(int ), (int)24);
                if (!var3_1) ** GOTO lbl99
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)z.kpb("krk", kpd(int ), (int)25);
                if (!var3_1) ** GOTO lbl89
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)z.kpb("krl", kpd(int ), (int)26);
        ** while (!var3_1)
lbl123:
        // 1 sources

        throw null;
    }
}

