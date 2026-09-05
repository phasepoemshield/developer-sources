/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  org.joml.Matrix4f
 *  org.lwjgl.system.MemoryUtil
 */
package ruhack.phobia;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.joml.Matrix4f;
import org.lwjgl.system.MemoryUtil;

public final class ll {
    public static final boolean a;
    protected static final long qr = -3748860577412586240L;
    private static int[] iwxz;
    private static final int UNIFORM_SIZE = 128;
    private static RenderPipeline pipeline;
    public static final boolean c;
    private static GpuBuffer uniformBuffer;
    public static final int b;
    private static long[] iwxu;
    private static int[] iwya;
    private static long[] iwxv;
    private static ByteBuffer uniformData;

    private static /* synthetic */ void ixjc() {
        ll.iwya[100] = -2139069367;
        ll.iwya[101] = 2117564045;
        ll.iwya[102] = 883117063;
        ll.iwya[103] = -1108495121;
        ll.iwya[104] = 1001409819;
        ll.iwya[105] = -1988296232;
        ll.iwya[106] = -504806513;
        ll.iwya[107] = 1901391270;
        ll.iwya[108] = -1199629500;
        ll.iwya[109] = -2105489015;
        ll.iwya[110] = 1439299058;
        ll.iwya[111] = 1829486416;
        ll.iwya[112] = -1560736939;
        ll.iwya[113] = 666396909;
        ll.iwya[114] = -1358736243;
        ll.iwya[115] = -631941077;
        ll.iwya[116] = -2047127839;
        ll.iwya[117] = -1020151503;
        ll.iwya[118] = -1009651820;
        ll.iwya[119] = 1613307584;
        ll.iwya[120] = -1568763535;
        ll.iwya[121] = -240081588;
        ll.iwya[122] = -1003289050;
        ll.iwya[123] = -1103789464;
        ll.iwya[124] = 684742842;
        ll.iwya[125] = 1417402395;
        ll.iwya[126] = -1817246821;
        ll.iwya[127] = 1444990993;
        ll.iwya[128] = 84259857;
        ll.iwya[129] = -20731699;
        ll.iwya[130] = 2059271712;
        ll.iwya[131] = 92016450;
        ll.iwya[132] = 363130654;
        ll.iwya[133] = 140568961;
        ll.iwya[134] = -958592378;
        ll.iwya[135] = -1751635108;
        ll.iwya[136] = 690699216;
        ll.iwya[137] = -614499284;
        ll.iwya[138] = 1250195798;
        ll.iwya[139] = 581823777;
        ll.iwya[140] = 267290512;
        ll.iwya[141] = 1520619968;
        ll.iwya[142] = 144462120;
        ll.iwya[143] = 1271761018;
        ll.iwya[144] = 1797975992;
        ll.iwya[145] = 338737034;
        ll.iwya[146] = 1474755805;
        ll.iwya[147] = 1302653666;
        ll.iwya[148] = 264341667;
        ll.iwya[149] = -179321349;
        ll.iwya[150] = 1656496916;
        ll.iwya[151] = 2147137196;
        ll.iwya[152] = -1316302743;
        ll.iwya[153] = 1882416181;
        ll.iwya[154] = -1759437556;
        ll.iwya[155] = -135111289;
        ll.iwya[156] = -1909599183;
        ll.iwya[157] = 1553484042;
        ll.iwya[158] = -490721175;
        ll.iwya[159] = 977403014;
        ll.iwya[160] = -1770582709;
        ll.iwya[161] = 1554997278;
        ll.iwya[162] = -33026047;
        ll.iwya[163] = -1541931736;
        ll.iwya[164] = 347130987;
        ll.iwya[165] = -1494616459;
        ll.iwya[166] = 207508829;
        ll.iwya[167] = -164845072;
        ll.iwya[168] = 1941298627;
        ll.iwya[169] = -1862188605;
        ll.iwya[170] = -101303884;
        ll.iwya[171] = 1529187163;
        ll.iwya[172] = -299608121;
        ll.iwya[173] = -590125279;
        ll.iwya[174] = -412903413;
        ll.iwya[175] = -373506079;
        ll.iwya[176] = -31564025;
        ll.iwya[177] = 992743841;
        ll.iwya[178] = 486997221;
        ll.iwya[179] = 875490118;
        ll.iwya[180] = 1284692056;
        ll.iwya[181] = -214051859;
        ll.iwya[182] = -174199663;
        ll.iwya[183] = -165697558;
    }

    private ll() {
    }

    private static /* synthetic */ void ixjo() {
        ll.iwxv[0] = -8348775143354246879L;
        ll.iwxv[1] = -9088942892145315533L;
        ll.iwxv[2] = 4837682574139565730L;
        ll.iwxv[3] = -6742257245565937317L;
        ll.iwxv[4] = 7758429768960613698L;
        ll.iwxv[5] = 1606854946922828673L;
        ll.iwxv[6] = 7711435596911476463L;
        ll.iwxv[7] = 575139966078138325L;
        ll.iwxv[8] = 4756777272191113748L;
        ll.iwxv[9] = -1599971020681149322L;
        ll.iwxv[10] = 5675072213138038299L;
        ll.iwxv[11] = -4905409118888192873L;
        ll.iwxv[12] = -7037965550631409077L;
        ll.iwxv[13] = -2575392191964008126L;
        ll.iwxv[14] = 3856323995591451846L;
        ll.iwxv[15] = 5588644021385993985L;
        ll.iwxv[16] = 4056781863385766368L;
        ll.iwxv[17] = -7297147866169277914L;
        ll.iwxv[18] = -8113608627352502380L;
        ll.iwxv[19] = 3242583364342196333L;
        ll.iwxv[20] = -5134506700782148322L;
        ll.iwxv[21] = -6069138476619055510L;
        ll.iwxv[22] = 6583120606125414223L;
        ll.iwxv[23] = 8178123025307952245L;
        ll.iwxv[24] = -7538186594021377333L;
        ll.iwxv[25] = -2540437907925333177L;
        ll.iwxv[26] = 1869463042582370261L;
        ll.iwxv[27] = -6106316297994654204L;
        ll.iwxv[28] = 7953659650898251250L;
        ll.iwxv[29] = -3591502093065115524L;
        ll.iwxv[30] = 5594371590677700043L;
        ll.iwxv[31] = 7113015757527788887L;
        ll.iwxv[32] = -3096315273826473415L;
        ll.iwxv[33] = 4192071666385874534L;
        ll.iwxv[34] = 8715655145109530430L;
        ll.iwxv[35] = -8147013603014653174L;
        ll.iwxv[36] = -1202850069895209556L;
        ll.iwxv[37] = 6431256800093596190L;
        ll.iwxv[38] = 229212506448852451L;
        ll.iwxv[39] = 2030205504061991960L;
        ll.iwxv[40] = 5212986227089022825L;
        ll.iwxv[41] = -5426669347596661424L;
        ll.iwxv[42] = -7970567946079729946L;
        ll.iwxv[43] = 8259073719317871585L;
        ll.iwxv[44] = -6610193096026649336L;
        ll.iwxv[45] = -2453328296220643320L;
        ll.iwxv[46] = -3827041112716180043L;
        ll.iwxv[47] = -7709542494932973918L;
        ll.iwxv[48] = -6775383914522735947L;
        ll.iwxv[49] = 6173537699376355280L;
        ll.iwxv[50] = -8244377018244134412L;
        ll.iwxv[51] = -6164773401613275120L;
        ll.iwxv[52] = 2078732034231161075L;
        ll.iwxv[53] = 3850177208476229648L;
        ll.iwxv[54] = 29608390719904711L;
        ll.iwxv[55] = -7199913675747322615L;
        ll.iwxv[56] = 7758435525438639283L;
        ll.iwxv[57] = -5522355218415028264L;
        ll.iwxv[58] = -2085841503584599436L;
        ll.iwxv[59] = 6561332641462818523L;
        ll.iwxv[60] = -1809234112684821621L;
        ll.iwxv[61] = 7749973455444347626L;
        ll.iwxv[62] = -2062922146108511701L;
        ll.iwxv[63] = -147686765407899400L;
        ll.iwxv[64] = -3925259236506668685L;
        ll.iwxv[65] = 4235318239191979701L;
        ll.iwxv[66] = -2253530967108648901L;
        ll.iwxv[67] = -54996426290277288L;
        ll.iwxv[68] = -6264401274924116937L;
        ll.iwxv[69] = -7667700280998035938L;
        ll.iwxv[70] = -5731362487829458298L;
        ll.iwxv[71] = -5361398057900826586L;
        ll.iwxv[72] = -2808456316028269025L;
        ll.iwxv[73] = 2556942948758775632L;
        ll.iwxv[74] = -29250685884122762L;
        ll.iwxv[75] = -7631964229992939765L;
        ll.iwxv[76] = -4983902376746456829L;
        ll.iwxv[77] = 5441951315480413651L;
        ll.iwxv[78] = -1836506013459233431L;
        ll.iwxv[79] = 4972330793019898842L;
        ll.iwxv[80] = -5415623990025023304L;
        ll.iwxv[81] = 735376458072492332L;
        ll.iwxv[82] = 1660541858502244480L;
        ll.iwxv[83] = -8029450718393481629L;
        ll.iwxv[84] = 6991872828566887139L;
        ll.iwxv[85] = -2604541295074230117L;
        ll.iwxv[86] = 462878692650030349L;
        ll.iwxv[87] = -1066494568466498673L;
        ll.iwxv[88] = -3149081645039325254L;
        ll.iwxv[89] = -3297467214307418656L;
        ll.iwxv[90] = -3624567101249853405L;
        ll.iwxv[91] = -2662399210198297260L;
        ll.iwxv[92] = 2855734883993351364L;
        ll.iwxv[93] = 9032601816966593522L;
        ll.iwxv[94] = -1565345518199748315L;
        ll.iwxv[95] = 8938563457289731484L;
        ll.iwxv[96] = -3999167987277744647L;
        ll.iwxv[97] = 34639351456717586L;
        ll.iwxv[98] = 3668066603467625959L;
        ll.iwxv[99] = 5067146406814797694L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void shutdown() {
        block96: {
            v0 /* !! */  = ll.qr;
            if (true) ** GOTO lbl5
            block65: while (true) {
                v0 /* !! */  = (long)(v1 - ll.iwxw("ixfx", iwxt(int ), (int)58));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1646716184: {
                        v1 = ll.iwxw("ixfy", iwxt(int ), (int)59);
                        continue block65;
                    }
                    case -1081462867: {
                        v1 = ll.iwxw("ixfz", iwxt(int ), (int)60);
                        continue block65;
                    }
                    case -891591424: {
                        break block65;
                    }
                    case 251370078: {
                        v1 = ll.iwxw("ixga", iwxt(int ), (int)61);
                        continue block65;
                    }
                }
                break;
            }
            var2 = ll.c;
            v2 /* !! */  = ll.qr;
            if (true) ** GOTO lbl22
            block66: while (true) {
                v2 /* !! */  = (long)(ll.iwxw("ixgc", iwxt(int ), (int)63) - ll.iwxw("ixgb", iwxt(int ), (int)62));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1085209962: {
                        continue block66;
                    }
                    case -891591424: {
                        break block66;
                    }
                }
                break;
            }
            var1_1 /* !! */  = ll.b;
            v3 /* !! */  = ll.qr;
            if (true) ** GOTO lbl32
            block67: while (true) {
                v3 /* !! */  = (long)(ll.iwxw("ixge", iwxt(int ), (int)65) - ll.iwxw("ixgd", iwxt(int ), (int)64));
lbl32:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -891591424: {
                        break block67;
                    }
                    case -519433760: {
                        continue block67;
                    }
                }
                break;
            }
            var0_2 = ll.a;
            if (var2) {
                throw null;
lbl40:
                // 10 sources

                return;
            }
            if (var0_2 || var0_2) ** GOTO lbl40
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_0 = ll.qr - ll.iwxw("ixgf", iwxt(int ), (int)66)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == ll.iwxw("ixgg", iwxy(int ), (int)146)) break;
                v4 /* !! */  = (long)ll.iwxw("ixgh", iwxy(int ), (int)147);
            }
            if (ll.uniformBuffer == null) break block96;
            if (var0_2 || var0_2) ** GOTO lbl40
            v5 /* !! */  = ll.qr;
            if (true) ** GOTO lbl54
            block70: while (true) {
                v5 /* !! */  = (long)(v6 - ll.iwxw("ixgi", iwxt(int ), (int)67));
lbl54:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -2076119973: {
                        v6 = ll.iwxw("ixgj", iwxt(int ), (int)68);
                        continue block70;
                    }
                    case -891591424: {
                        break block70;
                    }
                    case 894876047: {
                        v6 = ll.iwxw("ixgk", iwxt(int ), (int)69);
                        continue block70;
                    }
                }
                break;
            }
            v7 /* !! */  = ll.qr;
            if (true) ** GOTO lbl67
            block71: while (true) {
                v7 /* !! */  = (long)(v8 - ll.iwxw("ixgl", iwxt(int ), (int)70));
lbl67:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1172220054: {
                        v8 = ll.iwxw("ixgm", iwxt(int ), (int)71);
                        continue block71;
                    }
                    case -891591424: {
                        break block71;
                    }
                    case -432336011: {
                        v8 = ll.iwxw("ixgn", iwxt(int ), (int)72);
                        continue block71;
                    }
                }
                break;
            }
            ll.uniformBuffer.close();
            if (var0_2 || var0_2) ** GOTO lbl40
            v9 /* !! */  = ll.qr;
            if (true) ** GOTO lbl82
            block72: while (true) {
                v9 /* !! */  = (long)(ll.iwxw("ixgp", iwxt(int ), (int)74) - ll.iwxw("ixgo", iwxt(int ), (int)73));
lbl82:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -891591424: {
                        break block72;
                    }
                    case -83432267: {
                        continue block72;
                    }
                }
                break;
            }
            ll.uniformBuffer = null;
            if (var0_2) ** GOTO lbl40
        }
        if (var0_2 || var0_2) ** GOTO lbl40
        v10 /* !! */  = ll.qr;
        if (true) ** GOTO lbl95
        block73: while (true) {
            v10 /* !! */  = (long)(v11 - ll.iwxw("ixgq", iwxt(int ), (int)75));
lbl95:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -2093663162: {
                    v11 = ll.iwxw("ixgr", iwxt(int ), (int)76);
                    continue block73;
                }
                case -891591424: {
                    break block73;
                }
                case 1717389738: {
                    v11 = ll.iwxw("ixgs", iwxt(int ), (int)77);
                    continue block73;
                }
            }
            break;
        }
        if (ll.uniformData == null) ** GOTO lbl132
        if (var0_2 || var0_2) ** GOTO lbl40
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_1 = ll.qr - ll.iwxw("ixgt", iwxt(int ), (int)78)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == ll.iwxw("ixgu", iwxy(int ), (int)148)) break;
            v12 /* !! */  = (long)ll.iwxw("ixgv", iwxy(int ), (int)149);
        }
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_2 = ll.qr - ll.iwxw("ixgw", iwxt(int ), (int)79)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == ll.iwxw("ixgx", iwxy(int ), (int)150)) break;
            v13 /* !! */  = (long)ll.iwxw("ixgy", iwxy(int ), (int)151);
        }
        MemoryUtil.memFree((Buffer)ll.uniformData);
        if (var0_2 || var0_2) ** GOTO lbl40
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v14 /* !! */  = ll.qr;
                if (true) ** GOTO lbl125
                block76: while (true) {
                    v14 /* !! */  = (long)(ll.iwxw("ixha", iwxt(int ), (int)81) - ll.iwxw("ixgz", iwxt(int ), (int)80));
lbl125:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1077033764: {
                            continue block76;
                        }
                        case -891591424: {
                            break block76;
                        }
                    }
                    break;
                }
                ll.uniformData = null;
                if (var0_2) ** GOTO lbl40
lbl132:
                // 2 sources

                if (var0_2 || var0_2) ** GOTO lbl40
                v15 /* !! */  = ll.qr;
                if (true) ** GOTO lbl137
                block77: while (true) {
                    v15 /* !! */  = (long)(v16 - ll.iwxw("ixhb", iwxt(int ), (int)82));
lbl137:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1981125188: {
                            v16 = ll.iwxw("ixhc", iwxt(int ), (int)83);
                            continue block77;
                        }
                        case -891591424: {
                            break block77;
                        }
                        case -539267586: {
                            v16 = ll.iwxw("ixhd", iwxt(int ), (int)84);
                            continue block77;
                        }
                        case 517376506: {
                            v16 = ll.iwxw("ixhe", iwxt(int ), (int)85);
                            continue block77;
                        }
                    }
                    break;
                }
                ll.pipeline = null;
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
lbl153:
            // 3 sources

            case 0: {
                var1_1 /* !! */  = (int)ll.iwxw("ixhf", iwxy(int ), (int)152);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl216
            }
            case 1: {
                var1_1 /* !! */  = (int)ll.iwxw("ixhg", iwxy(int ), (int)153);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl163:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)ll.iwxw("ixhh", iwxy(int ), (int)154);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl177
            }
            case 3: {
                var1_1 /* !! */  = (int)ll.iwxw("ixhi", iwxy(int ), (int)155);
                if (var2) {
                    throw null;
                }
            }
lbl172:
            // 4 sources

            case 4: {
                var1_1 /* !! */  = (int)ll.iwxw("ixhj", iwxy(int ), (int)156);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl177:
            // 3 sources

            case 5: {
                do {
                    var1_1 /* !! */  = (int)ll.iwxw("ixhk", iwxy(int ), (int)157);
                } while (!var2);
                throw null;
            }
            case 6: {
                var1_1 /* !! */  = (int)ll.iwxw("ixhl", iwxy(int ), (int)158);
                if (!var2) ** GOTO lbl153
                throw null;
            }
            case 7: {
                var1_1 /* !! */  = (int)ll.iwxw("ixhm", iwxy(int ), (int)159);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl191:
            // 3 sources

            case 8: {
                var1_1 /* !! */  = (int)ll.iwxw("ixhn", iwxy(int ), (int)160);
                if (!var2) ** GOTO lbl177
                throw null;
            }
lbl195:
            // 3 sources

            case 9: {
                var1_1 /* !! */  = (int)ll.iwxw("ixho", iwxy(int ), (int)161);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl224
            }
            case 10: {
                var1_1 /* !! */  = (int)ll.iwxw("ixhp", iwxy(int ), (int)162);
                if (!var2) ** GOTO lbl195
                throw null;
            }
lbl204:
            // 2 sources

            case 11: {
                var1_1 /* !! */  = (int)ll.iwxw("ixhq", iwxy(int ), (int)163);
                if (!var2) break;
                throw null;
            }
            case 12: {
                var1_1 /* !! */  = (int)ll.iwxw("ixhr", iwxy(int ), (int)164);
                if (var2) {
                    throw null;
                }
            }
            case 13: {
                var1_1 /* !! */  = (int)ll.iwxw("ixhs", iwxy(int ), (int)165);
                if (!var2) ** GOTO lbl204
                throw null;
            }
lbl216:
            // 2 sources

            case 14: {
                var1_1 /* !! */  = (int)ll.iwxw("ixht", iwxy(int ), (int)166);
                if (!var2) ** GOTO lbl191
                throw null;
            }
lbl220:
            // 2 sources

            case 15: {
                var1_1 /* !! */  = (int)ll.iwxw("ixhu", iwxy(int ), (int)167);
                if (!var2) ** GOTO lbl163
                throw null;
            }
lbl224:
            // 2 sources

            case 16: {
                var1_1 /* !! */  = (int)ll.iwxw("ixhv", iwxy(int ), (int)168);
                if (!var2) ** GOTO lbl172
                throw null;
            }
            case 17: {
                var1_1 /* !! */  = (int)ll.iwxw("ixhw", iwxy(int ), (int)169);
                if (!var2) ** GOTO lbl195
                throw null;
            }
lbl232:
            // 2 sources

            case 18: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)ll.iwxw("ixhx", iwxy(int ), (int)170);
                    if (!var2) ** GOTO lbl153
                    throw null;
                }
            }
            case 19: 
        }
        var1_1 /* !! */  = (int)ll.iwxw("ixhy", iwxy(int ), (int)171);
        ** while (!var2)
lbl240:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ixjb() {
        ll.iwya[0] = 1019138910;
        ll.iwya[1] = -426017338;
        ll.iwya[2] = -773093632;
        ll.iwya[3] = -1340610880;
        ll.iwya[4] = -712655775;
        ll.iwya[5] = -324247661;
        ll.iwya[6] = 81049908;
        ll.iwya[7] = 1402165620;
        ll.iwya[8] = 872990485;
        ll.iwya[9] = 1501367012;
        ll.iwya[10] = 1141079190;
        ll.iwya[11] = -605084342;
        ll.iwya[12] = 1910447216;
        ll.iwya[13] = -1663647771;
        ll.iwya[14] = 678896987;
        ll.iwya[15] = -1051253688;
        ll.iwya[16] = 1294863711;
        ll.iwya[17] = -2023772755;
        ll.iwya[18] = 1092566501;
        ll.iwya[19] = 473342604;
        ll.iwya[20] = 47556569;
        ll.iwya[21] = -1430134524;
        ll.iwya[22] = 479191910;
        ll.iwya[23] = -1440696541;
        ll.iwya[24] = -715549134;
        ll.iwya[25] = 559506685;
        ll.iwya[26] = 564434754;
        ll.iwya[27] = 322411114;
        ll.iwya[28] = -221162974;
        ll.iwya[29] = -2108891750;
        ll.iwya[30] = 1707946517;
        ll.iwya[31] = -1863562865;
        ll.iwya[32] = 883275812;
        ll.iwya[33] = 93576705;
        ll.iwya[34] = -2118073044;
        ll.iwya[35] = -2140790448;
        ll.iwya[36] = -1329514819;
        ll.iwya[37] = -1888872498;
        ll.iwya[38] = 1402677629;
        ll.iwya[39] = -257503577;
        ll.iwya[40] = -182122955;
        ll.iwya[41] = -1517526988;
        ll.iwya[42] = -1430929228;
        ll.iwya[43] = -1055317998;
        ll.iwya[44] = -1318934776;
        ll.iwya[45] = -443098452;
        ll.iwya[46] = 1138096998;
        ll.iwya[47] = 236028771;
        ll.iwya[48] = -360506574;
        ll.iwya[49] = -1299302019;
        ll.iwya[50] = -1784873923;
        ll.iwya[51] = -454464462;
        ll.iwya[52] = 67093617;
        ll.iwya[53] = 1960337555;
        ll.iwya[54] = 1756941690;
        ll.iwya[55] = 94371877;
        ll.iwya[56] = 1386272059;
        ll.iwya[57] = -1252149921;
        ll.iwya[58] = -1324729083;
        ll.iwya[59] = -1776106639;
        ll.iwya[60] = 1058888945;
        ll.iwya[61] = -23787268;
        ll.iwya[62] = 625206725;
        ll.iwya[63] = 81136032;
        ll.iwya[64] = 1010000723;
        ll.iwya[65] = 878805138;
        ll.iwya[66] = -77596110;
        ll.iwya[67] = 858599060;
        ll.iwya[68] = -1268660426;
        ll.iwya[69] = 809246719;
        ll.iwya[70] = -1072716761;
        ll.iwya[71] = 1872681931;
        ll.iwya[72] = -1076571019;
        ll.iwya[73] = -1701258573;
        ll.iwya[74] = -31453700;
        ll.iwya[75] = 943840739;
        ll.iwya[76] = 917620004;
        ll.iwya[77] = -1089384741;
        ll.iwya[78] = -1241618220;
        ll.iwya[79] = 1763921505;
        ll.iwya[80] = 1308402187;
        ll.iwya[81] = 1692241601;
        ll.iwya[82] = 1850049586;
        ll.iwya[83] = -1825630803;
        ll.iwya[84] = -787007918;
        ll.iwya[85] = 449158258;
        ll.iwya[86] = -1311454510;
        ll.iwya[87] = 1049626976;
        ll.iwya[88] = -1634792840;
        ll.iwya[89] = 1530690464;
        ll.iwya[90] = -140920650;
        ll.iwya[91] = -839046462;
        ll.iwya[92] = -270820727;
        ll.iwya[93] = 218103242;
        ll.iwya[94] = 1630674558;
        ll.iwya[95] = 1539164558;
        ll.iwya[96] = 806173584;
        ll.iwya[97] = 749120665;
        ll.iwya[98] = 958318076;
        ll.iwya[99] = 92704503;
    }

    static {
        iwxz = new int[184];
        iwya = new int[184];
        ll.ixiz();
        ll.ixja();
        ll.ixjb();
        ll.ixjc();
        iwxu = new long[100];
        iwxv = new long[100];
        ll.ixjd();
        ll.ixjo();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$draw$1() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ll.qr - ll.iwxw("ixhz", iwxt(int ), (int)86)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ll.iwxw("ixia", iwxy(int ), (int)172)) break;
            v0 /* !! */  = (long)ll.iwxw("ixib", iwxy(int ), (int)173);
        }
        var2 = ll.c;
        v1 /* !! */  = ll.qr;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - ll.iwxw("ixic", iwxt(int ), (int)87));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -891591424: {
                    break block13;
                }
                case 34112160: {
                    v2 = ll.iwxw("ixid", iwxt(int ), (int)88);
                    continue block13;
                }
                case 714704847: {
                    v2 = ll.iwxw("ixie", iwxt(int ), (int)89);
                    continue block13;
                }
                case 1559926369: {
                    v2 = ll.iwxw("ixif", iwxt(int ), (int)90);
                    continue block13;
                }
            }
            break;
        }
        var1_1 /* !! */  = ll.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ll.qr - ll.iwxw("ixig", iwxt(int ), (int)91)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ll.iwxw("ixih", iwxy(int ), (int)174)) break;
            v3 /* !! */  = (long)ll.iwxw("ixii", iwxy(int ), (int)175);
        }
        var0_2 = ll.a;
        if (var2) {
            throw null;
            return null;
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** continue;
                return "Sheen2D";
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)ll.iwxw("ixij", iwxy(int ), (int)176);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)ll.iwxw("ixik", iwxy(int ), (int)177);
                } while (!var2);
                throw null;
            }
            case 2: {
                do {
                    var1_1 /* !! */  = (int)ll.iwxw("ixil", iwxy(int ), (int)178);
                } while (!var2);
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)ll.iwxw("ixim", iwxy(int ), (int)179);
        ** while (!var2)
lbl59:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float ixcj(int n2) {
        return Float.intBitsToFloat(iwxz[n2] ^ iwya[n2]);
    }

    private static /* synthetic */ void ixja() {
        ll.iwxz[100] = -2139069358;
        ll.iwxz[101] = 2117564102;
        ll.iwxz[102] = 883117067;
        ll.iwxz[103] = -1108495153;
        ll.iwxz[104] = 1001409880;
        ll.iwxz[105] = -1988296248;
        ll.iwxz[106] = -504806481;
        ll.iwxz[107] = 1901391333;
        ll.iwxz[108] = -1199629474;
        ll.iwxz[109] = -2105488991;
        ll.iwxz[110] = 1439299055;
        ll.iwxz[111] = 1829486457;
        ll.iwxz[112] = -1560736905;
        ll.iwxz[113] = 666396892;
        ll.iwxz[114] = -1358736188;
        ll.iwxz[115] = -631941011;
        ll.iwxz[116] = -2047127846;
        ll.iwxz[117] = -1020151511;
        ll.iwxz[118] = -1009651779;
        ll.iwxz[119] = 1613307605;
        ll.iwxz[120] = -1568763533;
        ll.iwxz[121] = -240081600;
        ll.iwxz[122] = -1003289054;
        ll.iwxz[123] = -1103789442;
        ll.iwxz[124] = 684742813;
        ll.iwxz[125] = 1417402405;
        ll.iwxz[126] = -1817246847;
        ll.iwxz[127] = 1444990997;
        ll.iwxz[128] = 84259922;
        ll.iwxz[129] = -20731697;
        ll.iwxz[130] = 2059271731;
        ll.iwxz[131] = 92016460;
        ll.iwxz[132] = 363130707;
        ll.iwxz[133] = 140568999;
        ll.iwxz[134] = -958592317;
        ll.iwxz[135] = -1751635109;
        ll.iwxz[136] = 690699162;
        ll.iwxz[137] = -614499284;
        ll.iwxz[138] = 1250195730;
        ll.iwxz[139] = 581823771;
        ll.iwxz[140] = 267290537;
        ll.iwxz[141] = 1520620001;
        ll.iwxz[142] = 144462188;
        ll.iwxz[143] = 1271761017;
        ll.iwxz[144] = 1797975957;
        ll.iwxz[145] = 338737057;
        ll.iwxz[146] = -1474755806;
        ll.iwxz[147] = -1461588653;
        ll.iwxz[148] = 264341666;
        ll.iwxz[149] = -477279811;
        ll.iwxz[150] = -1656496917;
        ll.iwxz[151] = -284408277;
        ll.iwxz[152] = -1316302739;
        ll.iwxz[153] = 1882416182;
        ll.iwxz[154] = -1759437557;
        ll.iwxz[155] = -135111296;
        ll.iwxz[156] = -1909599179;
        ll.iwxz[157] = 1553484059;
        ll.iwxz[158] = -490721174;
        ll.iwxz[159] = 977403020;
        ll.iwxz[160] = -1770582695;
        ll.iwxz[161] = 1554997264;
        ll.iwxz[162] = -33026029;
        ll.iwxz[163] = -1541931734;
        ll.iwxz[164] = 347131003;
        ll.iwxz[165] = -1494616450;
        ll.iwxz[166] = 207508820;
        ll.iwxz[167] = -164845060;
        ll.iwxz[168] = 1941298638;
        ll.iwxz[169] = -1862188603;
        ll.iwxz[170] = -101303897;
        ll.iwxz[171] = 1529187160;
        ll.iwxz[172] = 299608120;
        ll.iwxz[173] = -649282609;
        ll.iwxz[174] = -412903414;
        ll.iwxz[175] = 304672022;
        ll.iwxz[176] = -31564027;
        ll.iwxz[177] = 992743842;
        ll.iwxz[178] = 486997221;
        ll.iwxz[179] = 875490117;
        ll.iwxz[180] = 1284692057;
        ll.iwxz[181] = -214051858;
        ll.iwxz[182] = -174199661;
        ll.iwxz[183] = -165697559;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$init$0() {
        v0 /* !! */  = ll.qr;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - ll.iwxw("ixin", iwxt(int ), (int)92));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2093010297: {
                    v1 = ll.iwxw("ixio", iwxt(int ), (int)93);
                    continue block20;
                }
                case -891591424: {
                    break block20;
                }
                case 699400962: {
                    v1 = ll.iwxw("ixip", iwxt(int ), (int)94);
                    continue block20;
                }
            }
            break;
        }
        var2 = ll.c;
        v2 /* !! */  = ll.qr;
        if (true) ** GOTO lbl19
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - ll.iwxw("ixiq", iwxt(int ), (int)95));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1257936563: {
                    v3 = ll.iwxw("ixir", iwxt(int ), (int)96);
                    continue block21;
                }
                case -1025466845: {
                    v3 = ll.iwxw("ixis", iwxt(int ), (int)97);
                    continue block21;
                }
                case -891591424: {
                    break block21;
                }
            }
            break;
        }
        var1_1 /* !! */  = ll.b;
        v4 /* !! */  = ll.qr;
        if (true) ** GOTO lbl33
        block22: while (true) {
            v4 /* !! */  = (long)(ll.iwxw("ixiu", iwxt(int ), (int)99) - ll.iwxw("ixit", iwxt(int ), (int)98));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -891591424: {
                    break block22;
                }
                case 763101681: {
                    continue block22;
                }
            }
            break;
        }
        var0_2 = ll.a;
        if (var2) {
            throw null;
lbl41:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl41
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                return "Sheen2D Uniforms";
            }
lbl49:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)ll.iwxw("ixiv", iwxy(int ), (int)180);
                if (var2) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)ll.iwxw("ixiw", iwxy(int ), (int)181);
                    if (!var2) ** GOTO lbl49
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)ll.iwxw("ixix", iwxy(int ), (int)182);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)ll.iwxw("ixiy", iwxy(int ), (int)183);
        ** while (!var2)
lbl65:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ixjd() {
        ll.iwxu[0] = -695095262103666978L;
        ll.iwxu[1] = -4217043135335757995L;
        ll.iwxu[2] = -8276183595895696578L;
        ll.iwxu[3] = -6586965558074954421L;
        ll.iwxu[4] = 6124404139036061131L;
        ll.iwxu[5] = -7762696095394444608L;
        ll.iwxu[6] = 4754450483094657133L;
        ll.iwxu[7] = -6015356871731263628L;
        ll.iwxu[8] = 1010860584553996071L;
        ll.iwxu[9] = -7959149736068109198L;
        ll.iwxu[10] = -7689651292043370196L;
        ll.iwxu[11] = -5084476539921126965L;
        ll.iwxu[12] = 7480652529104444316L;
        ll.iwxu[13] = -6939371301829661390L;
        ll.iwxu[14] = 1793419707280976050L;
        ll.iwxu[15] = -601864373014519635L;
        ll.iwxu[16] = -5437298244097599478L;
        ll.iwxu[17] = -5026458981499626969L;
        ll.iwxu[18] = 5717996987155813141L;
        ll.iwxu[19] = 9694999024529978L;
        ll.iwxu[20] = -8119185439463004843L;
        ll.iwxu[21] = -4350069311180513551L;
        ll.iwxu[22] = -1373932399617813390L;
        ll.iwxu[23] = -8647238020810319188L;
        ll.iwxu[24] = 3432218491494851583L;
        ll.iwxu[25] = 6802426821329560664L;
        ll.iwxu[26] = 3602186542654186173L;
        ll.iwxu[27] = 4416739251624608595L;
        ll.iwxu[28] = 4997381570843858659L;
        ll.iwxu[29] = -5113482356551057030L;
        ll.iwxu[30] = -3824526074202057340L;
        ll.iwxu[31] = 7687518258817988522L;
        ll.iwxu[32] = 2359738088353994739L;
        ll.iwxu[33] = -1510334809766338157L;
        ll.iwxu[34] = -6579674366803619425L;
        ll.iwxu[35] = 1770464103096357808L;
        ll.iwxu[36] = -7223939049035929856L;
        ll.iwxu[37] = -1955892807571508683L;
        ll.iwxu[38] = -4204275822617928308L;
        ll.iwxu[39] = 6876299121729677047L;
        ll.iwxu[40] = -4774048947063600693L;
        ll.iwxu[41] = 891056736532386668L;
        ll.iwxu[42] = -706000165130663768L;
        ll.iwxu[43] = 5967555427591538883L;
        ll.iwxu[44] = -8152145676134507561L;
        ll.iwxu[45] = -7449844787463553521L;
        ll.iwxu[46] = 4941627759701407487L;
        ll.iwxu[47] = -8371624366278765277L;
        ll.iwxu[48] = 5374926693822747568L;
        ll.iwxu[49] = 3091629830680093628L;
        ll.iwxu[50] = -8244377018244134540L;
        ll.iwxu[51] = -7400643280887424421L;
        ll.iwxu[52] = -5333344637494862874L;
        ll.iwxu[53] = -1128035181679589859L;
        ll.iwxu[54] = 2892408061114003009L;
        ll.iwxu[55] = -5473797425764165652L;
        ll.iwxu[56] = -1381972661933575929L;
        ll.iwxu[57] = -4907559779697179634L;
        ll.iwxu[58] = 5616085924316257928L;
        ll.iwxu[59] = -2856345771034481657L;
        ll.iwxu[60] = 6065482959079067600L;
        ll.iwxu[61] = 9187426918625719472L;
        ll.iwxu[62] = 4681796921726565535L;
        ll.iwxu[63] = 2451156615202942635L;
        ll.iwxu[64] = -8811632619224975453L;
        ll.iwxu[65] = 8194361263336506025L;
        ll.iwxu[66] = 3685966368214039610L;
        ll.iwxu[67] = 2388085411299645451L;
        ll.iwxu[68] = -3660771643796809615L;
        ll.iwxu[69] = -4955133611837685094L;
        ll.iwxu[70] = -1425568996408026806L;
        ll.iwxu[71] = -3647713514736978221L;
        ll.iwxu[72] = -6252931028418969823L;
        ll.iwxu[73] = 6912218713973649348L;
        ll.iwxu[74] = -4437725190087119143L;
        ll.iwxu[75] = 5886946163886426418L;
        ll.iwxu[76] = 6240753144135236363L;
        ll.iwxu[77] = -6124409371218938642L;
        ll.iwxu[78] = 5970956645089701027L;
        ll.iwxu[79] = 4652677559623034857L;
        ll.iwxu[80] = -4957663885991945910L;
        ll.iwxu[81] = 428447821279162308L;
        ll.iwxu[82] = -3631554594117958327L;
        ll.iwxu[83] = -6973790809027053583L;
        ll.iwxu[84] = -729470658351428344L;
        ll.iwxu[85] = -4632610381236849666L;
        ll.iwxu[86] = 2925992864817497245L;
        ll.iwxu[87] = -3528851164456590382L;
        ll.iwxu[88] = 1300509963737385090L;
        ll.iwxu[89] = -3123798716986802396L;
        ll.iwxu[90] = 8086506643925991221L;
        ll.iwxu[91] = 5282794224893601347L;
        ll.iwxu[92] = -3910873122034324617L;
        ll.iwxu[93] = -4204953357973212389L;
        ll.iwxu[94] = -9076133740439872406L;
        ll.iwxu[95] = 7058533128345293822L;
        ll.iwxu[96] = -8342457194926009054L;
        ll.iwxu[97] = 1174994070466852869L;
        ll.iwxu[98] = -4672880509864697721L;
        ll.iwxu[99] = 3471076430697785466L;
    }

    /*
     * Exception decompiling
     */
    public static void draw(Matrix4f var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, float var9_9, int var10_10, float var11_11) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [85[CATCHBLOCK]], but top level block is 3[CASE]
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

    public static /* synthetic */ CallSite iwxw(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long iwxt(int n2) {
        return iwxu[n2] ^ iwxv[n2];
    }

    private static /* synthetic */ int iwxy(int n2) {
        return iwxz[n2] ^ iwya[n2];
    }

    private static /* synthetic */ void ixiz() {
        ll.iwxz[0] = -1019138911;
        ll.iwxz[1] = 514982771;
        ll.iwxz[2] = 773093631;
        ll.iwxz[3] = 1544400534;
        ll.iwxz[4] = -712655776;
        ll.iwxz[5] = 12381180;
        ll.iwxz[6] = -81049909;
        ll.iwxz[7] = -1963088585;
        ll.iwxz[8] = -872990486;
        ll.iwxz[9] = -640836286;
        ll.iwxz[10] = -1141079191;
        ll.iwxz[11] = 178448605;
        ll.iwxz[12] = 1910447217;
        ll.iwxz[13] = -1142284306;
        ll.iwxz[14] = 678896986;
        ll.iwxz[15] = 1845492826;
        ll.iwxz[16] = 1294863710;
        ll.iwxz[17] = -1356084639;
        ll.iwxz[18] = -1092566502;
        ll.iwxz[19] = 106978631;
        ll.iwxz[20] = -47556570;
        ll.iwxz[21] = 14112771;
        ll.iwxz[22] = 479191911;
        ll.iwxz[23] = -1948057999;
        ll.iwxz[24] = -715549134;
        ll.iwxz[25] = 559506684;
        ll.iwxz[26] = 296845998;
        ll.iwxz[27] = 322411234;
        ll.iwxz[28] = 221162973;
        ll.iwxz[29] = 111991080;
        ll.iwxz[30] = 1707946516;
        ll.iwxz[31] = -882176268;
        ll.iwxz[32] = 883275940;
        ll.iwxz[33] = 93576704;
        ll.iwxz[34] = 800921439;
        ll.iwxz[35] = -2140790441;
        ll.iwxz[36] = -1329514825;
        ll.iwxz[37] = -1888872511;
        ll.iwxz[38] = 1402677627;
        ll.iwxz[39] = -257503577;
        ll.iwxz[40] = -182122956;
        ll.iwxz[41] = -1517526987;
        ll.iwxz[42] = -1430929228;
        ll.iwxz[43] = -1055318014;
        ll.iwxz[44] = -1318934783;
        ll.iwxz[45] = -443098454;
        ll.iwxz[46] = 1138097006;
        ll.iwxz[47] = 236028780;
        ll.iwxz[48] = -360506568;
        ll.iwxz[49] = -1299302030;
        ll.iwxz[50] = -1784873935;
        ll.iwxz[51] = -454464461;
        ll.iwxz[52] = 67093553;
        ll.iwxz[53] = 1960337539;
        ll.iwxz[54] = 1756941701;
        ll.iwxz[55] = 1189019685;
        ll.iwxz[56] = 1386272051;
        ll.iwxz[57] = -1252149856;
        ll.iwxz[58] = -227197691;
        ll.iwxz[59] = -1776106610;
        ll.iwxz[60] = 2086821105;
        ll.iwxz[61] = -23787292;
        ll.iwxz[62] = 625206586;
        ll.iwxz[63] = 1202260384;
        ll.iwxz[64] = 1010000723;
        ll.iwxz[65] = 878805140;
        ll.iwxz[66] = -77596037;
        ll.iwxz[67] = 858599077;
        ll.iwxz[68] = -1268660458;
        ll.iwxz[69] = 809246649;
        ll.iwxz[70] = -1072716791;
        ll.iwxz[71] = 1872681956;
        ll.iwxz[72] = -1076571043;
        ll.iwxz[73] = -1701258618;
        ll.iwxz[74] = -31453771;
        ll.iwxz[75] = 943840711;
        ll.iwxz[76] = 917619998;
        ll.iwxz[77] = -1089384756;
        ll.iwxz[78] = -1241618274;
        ll.iwxz[79] = 1763921472;
        ll.iwxz[80] = 1308402214;
        ll.iwxz[81] = 1692241602;
        ll.iwxz[82] = 1850049572;
        ll.iwxz[83] = -1825630789;
        ll.iwxz[84] = -787007935;
        ll.iwxz[85] = 449158268;
        ll.iwxz[86] = -1311454470;
        ll.iwxz[87] = 1049626998;
        ll.iwxz[88] = -1634792855;
        ll.iwxz[89] = 1530690481;
        ll.iwxz[90] = -140920583;
        ll.iwxz[91] = -839046460;
        ll.iwxz[92] = -270820674;
        ll.iwxz[93] = 218103250;
        ll.iwxz[94] = 1630674480;
        ll.iwxz[95] = 1539164592;
        ll.iwxz[96] = 806173623;
        ll.iwxz[97] = 749120702;
        ll.iwxz[98] = 958318030;
        ll.iwxz[99] = 92704433;
    }

    /*
     * Exception decompiling
     */
    public static void init() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 63[SWITCH]
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
}

