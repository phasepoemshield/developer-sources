/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.pipeline.BlendFunction
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  com.mojang.blaze3d.platform.DepthTestFunction
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  net.minecraft.class_10789
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  org.joml.Matrix4f
 *  org.lwjgl.system.MemoryUtil
 */
package ruhack.phobia;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.OptionalInt;
import java.util.function.Supplier;
import net.minecraft.class_10789;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import org.joml.Matrix4f;
import org.lwjgl.system.MemoryUtil;

public class lm {
    public static final int b;
    private static long[] ivpy;
    private static int[] ivqe;
    public static final boolean c;
    private static final int UNIFORM_SIZE = 256;
    public static final boolean a;
    private static RenderPipeline pipeline;
    private static ByteBuffer uniformData;
    private static GpuBuffer uniformBuffer;
    private static long[] ivpz;
    static final long qp = 1357880385358641233L;
    private static int[] ivqd;

    public lm() {
    }

    private static /* synthetic */ void iwuq() {
        lm.ivpy[100] = -3881570135965085228L;
        lm.ivpy[101] = -4436980610229755150L;
        lm.ivpy[102] = 8342795825037789471L;
        lm.ivpy[103] = 3856441484741581322L;
        lm.ivpy[104] = -6843590756276019305L;
        lm.ivpy[105] = 6208264986786620863L;
        lm.ivpy[106] = -5161333796472079833L;
        lm.ivpy[107] = -5643708266087355182L;
        lm.ivpy[108] = 8796575992716026057L;
        lm.ivpy[109] = -8910142828351834853L;
        lm.ivpy[110] = -2551443540627538291L;
        lm.ivpy[111] = 3148648027016767931L;
        lm.ivpy[112] = 3160982199601133149L;
        lm.ivpy[113] = -306236184055008697L;
        lm.ivpy[114] = 3748876830627099497L;
    }

    private static /* synthetic */ void iwue() {
        lm.ivqe[200] = 306459334;
        lm.ivqe[201] = 436927407;
        lm.ivqe[202] = 941147872;
        lm.ivqe[203] = 508977294;
        lm.ivqe[204] = 931439420;
        lm.ivqe[205] = -961035890;
        lm.ivqe[206] = -1304394255;
        lm.ivqe[207] = -119592683;
        lm.ivqe[208] = -1039422855;
        lm.ivqe[209] = 1023052233;
        lm.ivqe[210] = -1513292602;
        lm.ivqe[211] = -35531851;
        lm.ivqe[212] = -1364093909;
        lm.ivqe[213] = 2146811601;
        lm.ivqe[214] = -1769795369;
        lm.ivqe[215] = -652078702;
        lm.ivqe[216] = 929265030;
        lm.ivqe[217] = -1353321342;
        lm.ivqe[218] = -419760178;
        lm.ivqe[219] = 1111303228;
        lm.ivqe[220] = 1097676961;
        lm.ivqe[221] = -198635481;
        lm.ivqe[222] = 349714239;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void drawMask(Matrix4f var0, float var1_1, float var2_2, float var3_3, GpuTextureView var4_4, int var5_5, float var6_6, float var7_7) {
        v0 /* !! */  = lm.qp;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - lm.ivqa("ivzg", ivpx(int ), (int)56));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 549828689: {
                    break block22;
                }
                case 1477509863: {
                    v1 = lm.ivqa("ivzh", ivpx(int ), (int)57);
                    continue block22;
                }
                case 1986012585: {
                    v1 = lm.ivqa("ivzi", ivpx(int ), (int)58);
                    continue block22;
                }
            }
            break;
        }
        var10_8 = lm.c;
        v2 /* !! */  = lm.qp;
        if (true) ** GOTO lbl19
        block23: while (true) {
            v2 /* !! */  = (long)(lm.ivqa("ivzk", ivpx(int ), (int)60) - lm.ivqa("ivzj", ivpx(int ), (int)59));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 549828689: {
                    break block23;
                }
                case 1427780585: {
                    continue block23;
                }
            }
            break;
        }
        var9_9 /* !! */  = lm.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = lm.qp - lm.ivqa("ivzl", ivpx(int ), (int)61)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == lm.ivqa("ivzm", ivqc(int ), (int)70)) break;
            v3 /* !! */  = (long)lm.ivqa("ivzn", ivqc(int ), (int)71);
        }
        var8_10 = lm.a;
        if (!var10_8) ** GOTO lbl38
        throw null;
lbl-1000:
        // 2 sources

        {
            if (var9_9 /* !! */  == 0) ** GOTO lbl-1000
            switch (var9_9 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl38:
                // 1 sources

                if (var8_10 || var8_10) ** GOTO lbl-1000
                v4 = lm.ivqa("ivzo", ivqc(int ), (int)72);
                v5 = lm.ivqa("ivzp", ivqc(int ), (int)73);
                v6 /* !! */  = lm.qp;
                if (true) ** GOTO lbl45
                block26: while (true) {
                    v6 /* !! */  = (long)(v7 - lm.ivqa("ivzq", ivpx(int ), (int)62));
lbl45:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -18196425: {
                            v7 = lm.ivqa("ivzr", ivpx(int ), (int)63);
                            continue block26;
                        }
                        case 308142185: {
                            v7 = lm.ivqa("ivzs", ivpx(int ), (int)64);
                            continue block26;
                        }
                        case 549828689: {
                            break block26;
                        }
                    }
                    break;
                }
                lm.drawRegionInternal(var0, var1_1, var2_2, var3_3, var3_3, var4_4, var5_5, var6_6, var7_7, 0.0f, 0.0f, 1.0f, 1.0f, (boolean)v4, (boolean)v5);
                if (var8_10 || var8_10) continue block25;
                return;
lbl57:
                // 2 sources

                case 0: {
                    var9_9 /* !! */  = (int)lm.ivqa("ivzt", ivqc(int ), (int)74);
                    if (var10_8) {
                        throw null;
                    }
                    ** GOTO lbl67
                }
lbl62:
                // 2 sources

                case 1: {
                    var9_9 /* !! */  = (int)lm.ivqa("ivzu", ivqc(int ), (int)75);
                    if (var10_8) {
                        throw null;
                    }
                    ** GOTO lbl76
                }
lbl67:
                // 2 sources

                case 2: {
                    var9_9 /* !! */  = (int)lm.ivqa("ivzv", ivqc(int ), (int)76);
                    if (var10_8) {
                        throw null;
                    }
                    ** GOTO lbl76
                }
                case 3: {
                    var9_9 /* !! */  = (int)lm.ivqa("ivzw", ivqc(int ), (int)77);
                    if (!var10_8) ** GOTO lbl57
                    throw null;
                }
lbl76:
                // 3 sources

                case 4: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var9_9 /* !! */  = (int)lm.ivqa("ivzx", ivqc(int ), (int)78);
                        if (!var10_8) ** GOTO lbl62
                        throw null;
                    }
                }
                case 5: 
            }
        }
        var9_9 /* !! */  = (int)lm.ivqa("ivzy", ivqc(int ), (int)79);
        ** while (!var10_8)
lbl84:
        // 1 sources

        throw null;
    }

    static {
        ivqd = new int[223];
        ivqe = new int[223];
        lm.iwtc();
        lm.iwth();
        lm.iwtp();
        lm.iwts();
        lm.iwty();
        lm.iwue();
        ivpy = new long[115];
        ivpz = new long[115];
        lm.iwuj();
        lm.iwuq();
        lm.iwut();
        lm.iwvc();
    }

    private static /* synthetic */ void iwut() {
        lm.ivpz[0] = -8343817693704194495L;
        lm.ivpz[1] = -3755846486397315312L;
        lm.ivpz[2] = -8783055034597509524L;
        lm.ivpz[3] = 1557887279594819630L;
        lm.ivpz[4] = 4095845189752534237L;
        lm.ivpz[5] = -6824655035963913290L;
        lm.ivpz[6] = 7942040414318963474L;
        lm.ivpz[7] = 6923353214258725908L;
        lm.ivpz[8] = 8550599313712598842L;
        lm.ivpz[9] = 5827882709544432991L;
        lm.ivpz[10] = 4899200092202304980L;
        lm.ivpz[11] = 2189638676091215512L;
        lm.ivpz[12] = 6437474572583904198L;
        lm.ivpz[13] = -6115845958481966076L;
        lm.ivpz[14] = -2767578312855766450L;
        lm.ivpz[15] = -5625818837890418201L;
        lm.ivpz[16] = -5624896506569208708L;
        lm.ivpz[17] = 4429457745590143556L;
        lm.ivpz[18] = 5634334433874157445L;
        lm.ivpz[19] = 1038311646089447920L;
        lm.ivpz[20] = -3526763138906010400L;
        lm.ivpz[21] = -810683921094301428L;
        lm.ivpz[22] = 1129706577608569085L;
        lm.ivpz[23] = -5088319328622756945L;
        lm.ivpz[24] = 2108191048709735852L;
        lm.ivpz[25] = 4182748038759286217L;
        lm.ivpz[26] = 77802999832358406L;
        lm.ivpz[27] = 2806731755296347027L;
        lm.ivpz[28] = 3052604251752504L;
        lm.ivpz[29] = 7988471781885771751L;
        lm.ivpz[30] = 1896807437667288108L;
        lm.ivpz[31] = 1298969624945840305L;
        lm.ivpz[32] = 4094196460875421602L;
        lm.ivpz[33] = -6251916989364228594L;
        lm.ivpz[34] = -643680109205506299L;
        lm.ivpz[35] = -8421517901963915127L;
        lm.ivpz[36] = 1258360947559755531L;
        lm.ivpz[37] = -6264657263383408744L;
        lm.ivpz[38] = 7507784560228338068L;
        lm.ivpz[39] = -4960028386222858615L;
        lm.ivpz[40] = 7447593478644679991L;
        lm.ivpz[41] = -7972431553543343848L;
        lm.ivpz[42] = -9111369087741321194L;
        lm.ivpz[43] = 670070551260235817L;
        lm.ivpz[44] = -2278134127744519322L;
        lm.ivpz[45] = 1101120852001753593L;
        lm.ivpz[46] = -5660038134670722413L;
        lm.ivpz[47] = 4590906598148732593L;
        lm.ivpz[48] = -8593886196060626144L;
        lm.ivpz[49] = -2580121203345900091L;
        lm.ivpz[50] = 5961747782966170596L;
        lm.ivpz[51] = 5995034647021555568L;
        lm.ivpz[52] = -8837475625650294538L;
        lm.ivpz[53] = -1544809498609147484L;
        lm.ivpz[54] = -481807624951032582L;
        lm.ivpz[55] = 6368228660888177211L;
        lm.ivpz[56] = 8163599607100153625L;
        lm.ivpz[57] = 8790785672604907228L;
        lm.ivpz[58] = 2477326833898689546L;
        lm.ivpz[59] = 3246775961256938826L;
        lm.ivpz[60] = 5067520141950482670L;
        lm.ivpz[61] = 1281323017338474055L;
        lm.ivpz[62] = -4230374658631194514L;
        lm.ivpz[63] = -2286724368973048471L;
        lm.ivpz[64] = 5304529453081151207L;
        lm.ivpz[65] = -5775853873779983417L;
        lm.ivpz[66] = 7667621722693367836L;
        lm.ivpz[67] = -471214259836186013L;
        lm.ivpz[68] = 1900901290983159625L;
        lm.ivpz[69] = -2948907968445237649L;
        lm.ivpz[70] = -7918212128233086556L;
        lm.ivpz[71] = -8430931299572082090L;
        lm.ivpz[72] = 8661985108236599740L;
        lm.ivpz[73] = 2027637813453266291L;
        lm.ivpz[74] = 9200124556659185275L;
        lm.ivpz[75] = 5652705172396934147L;
        lm.ivpz[76] = 1436417386137504985L;
        lm.ivpz[77] = -8018479711294674312L;
        lm.ivpz[78] = -4126453886874282134L;
        lm.ivpz[79] = -2648192316649610768L;
        lm.ivpz[80] = 1966226328437031637L;
        lm.ivpz[81] = -1652881853573467621L;
        lm.ivpz[82] = -6623714203213996327L;
        lm.ivpz[83] = -2068336993468842019L;
        lm.ivpz[84] = 8027095202974908966L;
        lm.ivpz[85] = 5133125602218427052L;
        lm.ivpz[86] = 7588062513650139928L;
        lm.ivpz[87] = -1469347658286615214L;
        lm.ivpz[88] = 566555597548544023L;
        lm.ivpz[89] = -1064356035376378127L;
        lm.ivpz[90] = -8995945079960876479L;
        lm.ivpz[91] = -476068894151522233L;
        lm.ivpz[92] = -4666412242059120333L;
        lm.ivpz[93] = -4967811462885140588L;
        lm.ivpz[94] = -4575272402923529608L;
        lm.ivpz[95] = -2094078129503737421L;
        lm.ivpz[96] = -1237879405014984769L;
        lm.ivpz[97] = -7921934229578388495L;
        lm.ivpz[98] = 2932129021801231169L;
        lm.ivpz[99] = -5621656660325138073L;
    }

    public static /* synthetic */ CallSite ivqa(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void iwts() {
        lm.ivqe[0] = -1165424001;
        lm.ivqe[1] = 2136859467;
        lm.ivqe[2] = -363306206;
        lm.ivqe[3] = -410418157;
        lm.ivqe[4] = 1726099951;
        lm.ivqe[5] = 646661612;
        lm.ivqe[6] = -1493747489;
        lm.ivqe[7] = -2047039749;
        lm.ivqe[8] = -792424617;
        lm.ivqe[9] = 46694115;
        lm.ivqe[10] = -1718140349;
        lm.ivqe[11] = -1816704812;
        lm.ivqe[12] = -205020036;
        lm.ivqe[13] = 1994936714;
        lm.ivqe[14] = 1292963100;
        lm.ivqe[15] = -2051156694;
        lm.ivqe[16] = 657141164;
        lm.ivqe[17] = -1833237353;
        lm.ivqe[18] = 1623522658;
        lm.ivqe[19] = -1380290869;
        lm.ivqe[20] = 1684385596;
        lm.ivqe[21] = -921803977;
        lm.ivqe[22] = 1814637635;
        lm.ivqe[23] = 1396892478;
        lm.ivqe[24] = -1269618564;
        lm.ivqe[25] = 2032691141;
        lm.ivqe[26] = 584191772;
        lm.ivqe[27] = -1808961220;
        lm.ivqe[28] = 978620636;
        lm.ivqe[29] = -1226368997;
        lm.ivqe[30] = 1395719408;
        lm.ivqe[31] = 1780701885;
        lm.ivqe[32] = -1306324668;
        lm.ivqe[33] = -542196953;
        lm.ivqe[34] = -207070402;
        lm.ivqe[35] = -1228117437;
        lm.ivqe[36] = -1091387817;
        lm.ivqe[37] = 291845999;
        lm.ivqe[38] = 149201209;
        lm.ivqe[39] = 159647612;
        lm.ivqe[40] = 511157956;
        lm.ivqe[41] = -2060264817;
        lm.ivqe[42] = 1619314053;
        lm.ivqe[43] = 1010674192;
        lm.ivqe[44] = -382810301;
        lm.ivqe[45] = -1598974462;
        lm.ivqe[46] = -95932390;
        lm.ivqe[47] = 688260650;
        lm.ivqe[48] = 1060615722;
        lm.ivqe[49] = 1687349655;
        lm.ivqe[50] = 515257566;
        lm.ivqe[51] = -742912949;
        lm.ivqe[52] = -118207497;
        lm.ivqe[53] = 1080292379;
        lm.ivqe[54] = -1743306232;
        lm.ivqe[55] = 692050483;
        lm.ivqe[56] = 1925789313;
        lm.ivqe[57] = -2008988052;
        lm.ivqe[58] = -188773773;
        lm.ivqe[59] = 2114147984;
        lm.ivqe[60] = 2143912212;
        lm.ivqe[61] = -2070943171;
        lm.ivqe[62] = -1111164971;
        lm.ivqe[63] = 1666518021;
        lm.ivqe[64] = -1243467739;
        lm.ivqe[65] = 1480296109;
        lm.ivqe[66] = -1680755237;
        lm.ivqe[67] = 363874864;
        lm.ivqe[68] = -2063048356;
        lm.ivqe[69] = -1658666016;
        lm.ivqe[70] = 1833981959;
        lm.ivqe[71] = 1959551818;
        lm.ivqe[72] = -1693665211;
        lm.ivqe[73] = 391607419;
        lm.ivqe[74] = -346482825;
        lm.ivqe[75] = -1978504697;
        lm.ivqe[76] = 1660306912;
        lm.ivqe[77] = -2010123465;
        lm.ivqe[78] = -384660300;
        lm.ivqe[79] = 991612049;
        lm.ivqe[80] = -1943557652;
        lm.ivqe[81] = 1462402969;
        lm.ivqe[82] = 790082371;
        lm.ivqe[83] = -76926154;
        lm.ivqe[84] = 523149232;
        lm.ivqe[85] = 1127194853;
        lm.ivqe[86] = -1405452111;
        lm.ivqe[87] = 1344504254;
        lm.ivqe[88] = -2001027038;
        lm.ivqe[89] = 2014373435;
        lm.ivqe[90] = -465554824;
        lm.ivqe[91] = -1797710429;
        lm.ivqe[92] = -856457281;
        lm.ivqe[93] = -110587266;
        lm.ivqe[94] = -2073530501;
        lm.ivqe[95] = -1639061226;
        lm.ivqe[96] = 1977287196;
        lm.ivqe[97] = 1599256411;
        lm.ivqe[98] = -365350500;
        lm.ivqe[99] = -2036764015;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void draw(Matrix4f var0, float var1_1, float var2_2, float var3_3, GpuTextureView var4_4, int var5_5, float var6_6, float var7_7) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lm.qp - lm.ivqa("ivyj", ivpx(int ), (int)52)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == lm.ivqa("ivyk", ivqc(int ), (int)54)) break;
            v0 /* !! */  = (long)lm.ivqa("ivym", ivqc(int ), (int)55);
        }
        var10_8 = lm.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lm.qp - lm.ivqa("ivyn", ivpx(int ), (int)53)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == lm.ivqa("ivyo", ivqc(int ), (int)56)) break;
            v1 /* !! */  = (long)lm.ivqa("ivyp", ivqc(int ), (int)57);
        }
        var9_9 /* !! */  = lm.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = lm.qp - lm.ivqa("ivyq", ivpx(int ), (int)54)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == lm.ivqa("ivys", ivqc(int ), (int)58)) break;
            v2 /* !! */  = (long)lm.ivqa("ivyt", ivqc(int ), (int)59);
        }
        var8_10 = lm.a;
        if (var10_8) {
            throw null;
lbl21:
            // 2 sources

            return;
        }
        if (var8_10 || var8_10) ** GOTO lbl21
        if (var9_9 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_9 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 = lm.ivqa("ivyu", ivqc(int ), (int)60);
                v4 = lm.ivqa("ivyv", ivqc(int ), (int)61);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = lm.qp - lm.ivqa("ivyw", ivpx(int ), (int)55)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == lm.ivqa("ivyx", ivqc(int ), (int)62)) break;
                    v5 /* !! */  = (long)lm.ivqa("ivyz", ivqc(int ), (int)63);
                }
                lm.drawRegionInternal(var0, var1_1, var2_2, var3_3, var3_3, var4_4, var5_5, var6_6, var7_7, 0.0f, 0.0f, 1.0f, 1.0f, (boolean)v3, (boolean)v4);
                if (var8_10 || var8_10) ** continue;
                return;
            }
lbl37:
            // 2 sources

            case 0: {
                do {
                    var9_9 /* !! */  = (int)lm.ivqa("ivza", ivqc(int ), (int)64);
                } while (!var10_8);
                throw null;
            }
lbl42:
            // 2 sources

            case 1: {
                var9_9 /* !! */  = (int)lm.ivqa("ivzb", ivqc(int ), (int)65);
                if (!var10_8) break;
                throw null;
            }
            case 2: {
                var9_9 /* !! */  = (int)lm.ivqa("ivzc", ivqc(int ), (int)66);
                if (var10_8) {
                    throw null;
                }
                ** GOTO lbl56
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_9 /* !! */  = (int)lm.ivqa("ivzd", ivqc(int ), (int)67);
                    if (!var10_8) ** GOTO lbl42
                    throw null;
                }
            }
lbl56:
            // 2 sources

            case 4: {
                var9_9 /* !! */  = (int)lm.ivqa("ivze", ivqc(int ), (int)68);
                if (!var10_8) ** GOTO lbl37
                throw null;
            }
            case 5: 
        }
        var9_9 /* !! */  = (int)lm.ivqa("ivzf", ivqc(int ), (int)69);
        ** while (!var10_8)
lbl63:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iwtp() {
        lm.ivqd[200] = 306459338;
        lm.ivqd[201] = 436927403;
        lm.ivqd[202] = 941147884;
        lm.ivqd[203] = 508977294;
        lm.ivqd[204] = 931439421;
        lm.ivqd[205] = -961035903;
        lm.ivqd[206] = -1304394256;
        lm.ivqd[207] = -119592688;
        lm.ivqd[208] = -1039422850;
        lm.ivqd[209] = -1023052234;
        lm.ivqd[210] = 645693880;
        lm.ivqd[211] = -35531852;
        lm.ivqd[212] = -329102056;
        lm.ivqd[213] = 2146811601;
        lm.ivqd[214] = -1769795372;
        lm.ivqd[215] = -652078702;
        lm.ivqd[216] = 929265029;
        lm.ivqd[217] = -1353321341;
        lm.ivqd[218] = 649141035;
        lm.ivqd[219] = 1111303231;
        lm.ivqd[220] = 1097676960;
        lm.ivqd[221] = -198635484;
        lm.ivqd[222] = 349714236;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$drawRegionInternal$1() {
        v0 /* !! */  = lm.qp;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(lm.ivqa("iwrk", ivpx(int ), (int)103) - lm.ivqa("iwrh", ivpx(int ), (int)102));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 549828689: {
                    break block10;
                }
                case 601722614: {
                    continue block10;
                }
            }
            break;
        }
        var2 = lm.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = lm.qp - lm.ivqa("iwrm", ivpx(int ), (int)104)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == lm.ivqa("iwrn", ivqc(int ), (int)209)) break;
            v1 /* !! */  = (long)lm.ivqa("iwrp", ivqc(int ), (int)210);
        }
        var1_1 /* !! */  = lm.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = lm.qp - lm.ivqa("iwrr", ivpx(int ), (int)105)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == lm.ivqa("iwrs", ivqc(int ), (int)211)) break;
            v2 /* !! */  = (long)lm.ivqa("iwru", ivqc(int ), (int)212);
        }
        var0_2 = lm.a;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                return "Texture2D";
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)lm.ivqa("iwrx", ivqc(int ), (int)213);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)lm.ivqa("iwrz", ivqc(int ), (int)214);
                } while (!var2);
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)lm.ivqa("iwsb", ivqc(int ), (int)215);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)lm.ivqa("iwsd", ivqc(int ), (int)216);
        ** while (!var2)
lbl51:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void drawRegion(Matrix4f var0, float var1_1, float var2_2, float var3_3, float var4_4, GpuTextureView var5_5, int var6_6, float var7_7, float var8_8, float var9_9, float var10_10, float var11_11, float var12_12, boolean var13_13) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lm.qp - lm.ivqa("ivzz", ivpx(int ), (int)65)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == lm.ivqa("iwaa", ivqc(int ), (int)80)) break;
            v0 /* !! */  = (long)lm.ivqa("iwab", ivqc(int ), (int)81);
        }
        var16_14 = lm.c;
        v1 /* !! */  = lm.qp;
        if (true) ** GOTO lbl12
        block24: while (true) {
            v1 /* !! */  = (long)(v2 - lm.ivqa("iwac", ivpx(int ), (int)66));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1891491264: {
                    v2 = lm.ivqa("iwad", ivpx(int ), (int)67);
                    continue block24;
                }
                case 549828689: {
                    break block24;
                }
                case 1927783494: {
                    v2 = lm.ivqa("iwae", ivpx(int ), (int)68);
                    continue block24;
                }
            }
            break;
        }
        var15_15 /* !! */  = lm.b;
        v3 /* !! */  = lm.qp;
        if (true) ** GOTO lbl26
        block25: while (true) {
            v3 /* !! */  = (long)(v4 - lm.ivqa("iwaf", ivpx(int ), (int)69));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -798133493: {
                    v4 = lm.ivqa("iwag", ivpx(int ), (int)70);
                    continue block25;
                }
                case 67999068: {
                    v4 = lm.ivqa("iwah", ivpx(int ), (int)71);
                    continue block25;
                }
                case 236068807: {
                    v4 = lm.ivqa("iwai", ivpx(int ), (int)72);
                    continue block25;
                }
                case 549828689: {
                    break block25;
                }
            }
            break;
        }
        var14_16 = lm.a;
        if (var16_14) {
            throw null;
lbl41:
            // 3 sources

            return;
        }
        if (var14_16) ** GOTO lbl41
        if (var15_15 /* !! */  == 0) ** GOTO lbl-1000
        switch (var15_15 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var14_16) ** GOTO lbl41
                v5 = lm.ivqa("iwaj", ivqc(int ), (int)82);
                v6 /* !! */  = lm.qp;
                if (true) ** GOTO lbl53
                block27: while (true) {
                    v6 /* !! */  = (long)(lm.ivqa("iwal", ivpx(int ), (int)74) - lm.ivqa("iwak", ivpx(int ), (int)73));
lbl53:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -993417294: {
                            continue block27;
                        }
                        case 549828689: {
                            break block27;
                        }
                    }
                    break;
                }
                lm.drawRegionInternal(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8, var9_9, var10_10, var11_11, var12_12, var13_13, (boolean)v5);
                if (!var14_16 && !var14_16) ** break;
                ** continue;
                return;
            }
lbl62:
            // 2 sources

            case 0: {
                var15_15 /* !! */  = (int)lm.ivqa("iwam", ivqc(int ), (int)83);
                if (var16_14) {
                    throw null;
                }
                ** GOTO lbl75
            }
            case 1: {
                var15_15 /* !! */  = (int)lm.ivqa("iwan", ivqc(int ), (int)84);
                if (!var16_14) ** GOTO lbl62
                throw null;
            }
            case 2: {
                var15_15 /* !! */  = (int)lm.ivqa("iwao", ivqc(int ), (int)85);
                if (!var16_14) break;
                throw null;
            }
lbl75:
            // 2 sources

            case 3: {
                do {
                    var15_15 /* !! */  = (int)lm.ivqa("iwap", ivqc(int ), (int)86);
                } while (!var16_14);
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var15_15 /* !! */  = (int)lm.ivqa("iwaq", ivqc(int ), (int)87);
                    if (!var16_14) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 5: 
        }
        var15_15 /* !! */  = (int)lm.ivqa("iwar", ivqc(int ), (int)88);
        ** while (!var16_14)
lbl88:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void init() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = lm.qp - lm.ivqa("ivqb", ivpx(int ), (int)0)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == lm.ivqa("ivqf", ivqc(int ), (int)0)) break;
            v0 /* !! */  = (long)lm.ivqa("ivqg", ivqc(int ), (int)1);
        }
        var2 = lm.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_2 = lm.qp - lm.ivqa("ivqh", ivpx(int ), (int)1)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == lm.ivqa("ivqi", ivqc(int ), (int)2)) break;
            v1 /* !! */  = (long)lm.ivqa("ivqj", ivqc(int ), (int)3);
        }
        var1_1 /* !! */  = lm.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_3 = lm.qp - lm.ivqa("ivqk", ivpx(int ), (int)2)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == lm.ivqa("ivql", ivqc(int ), (int)4)) {
                var0_2 = lm.a;
                if (var2) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)lm.ivqa("ivqm", ivqc(int ), (int)5);
        }
        if (var0_2 || var0_2) return;
        v3 /* !! */  = lm.qp;
        if (true) ** GOTO lbl27
        block79: while (true) {
            v3 /* !! */  = (long)(v4 - lm.ivqa("ivqn", ivpx(int ), (int)3));
lbl27:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1728075764: {
                    v4 = lm.ivqa("ivqo", ivpx(int ), (int)4);
                    continue block79;
                }
                case -912395246: {
                    v4 = lm.ivqa("ivqp", ivpx(int ), (int)5);
                    continue block79;
                }
                case 549828689: {
                    break block79;
                }
            }
            break;
        }
        if (lm.pipeline != null) {
            if (var0_2 || var0_2) return;
            return;
        }
        if (var0_2 || var0_2) return;
        v5 = new RenderPipeline.Snippet[]{};
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_4 = lm.qp - lm.ivqa("ivqq", ivpx(int ), (int)6)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == lm.ivqa("ivqr", ivqc(int ), (int)6)) break;
            v6 /* !! */  = (long)lm.ivqa("ivqs", ivqc(int ), (int)7);
        }
        v7 = RenderPipeline.builder((RenderPipeline.Snippet[])v5);
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_5 = lm.qp - lm.ivqa("ivqt", ivpx(int ), (int)7)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == lm.ivqa("ivqv", ivqc(int ), (int)8)) break;
            v8 /* !! */  = (long)lm.ivqa("ivqy", ivqc(int ), (int)9);
        }
        v9 = class_2960.method_60655((String)"phobia", (String)"texture");
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_6 = lm.qp - lm.ivqa("ivrb", ivpx(int ), (int)8)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == lm.ivqa("ivrc", ivqc(int ), (int)10)) break;
            v10 /* !! */  = (long)lm.ivqa("ivrf", ivqc(int ), (int)11);
        }
        v11 = v7.withLocation(v9);
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_7 = lm.qp - lm.ivqa("ivri", ivpx(int ), (int)9)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == lm.ivqa("ivrk", ivqc(int ), (int)12)) break;
            v12 /* !! */  = (long)lm.ivqa("ivrn", ivqc(int ), (int)13);
        }
        v13 = class_2960.method_60655((String)"phobia", (String)"texture_vertex");
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_8 = lm.qp - lm.ivqa("ivrp", ivpx(int ), (int)10)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == lm.ivqa("ivrr", ivqc(int ), (int)14)) break;
            v14 /* !! */  = (long)lm.ivqa("ivrt", ivqc(int ), (int)15);
        }
        v15 = v11.withVertexShader(v13);
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_9 = lm.qp - lm.ivqa("ivru", ivpx(int ), (int)11)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == lm.ivqa("ivrw", ivqc(int ), (int)16)) break;
            v16 /* !! */  = (long)lm.ivqa("ivry", ivqc(int ), (int)17);
        }
        v17 = class_2960.method_60655((String)"phobia", (String)"texture_fragment");
        v18 /* !! */  = lm.qp;
        block86: while (true) {
            switch ((int)v18 /* !! */ ) {
                case 341727169: {
                    v18 /* !! */  = (long)(lm.ivqa("ivsb", ivpx(int ), (int)13) - lm.ivqa("ivsa", ivpx(int ), (int)12));
                    continue block86;
                }
                case 549828689: {
                    break block86;
                }
            }
            break;
        }
        v19 = v15.withFragmentShader(v17);
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_10 = lm.qp - lm.ivqa("ivse", ivpx(int ), (int)14)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == lm.ivqa("ivsf", ivqc(int ), (int)18)) break;
            v20 /* !! */  = (long)lm.ivqa("ivsh", ivqc(int ), (int)19);
        }
        v21 = VertexFormat.builder();
        v22 /* !! */  = lm.qp;
        block88: while (true) {
            switch ((int)v22 /* !! */ ) {
                case -897946736: {
                    v22 /* !! */  = (long)(lm.ivqa("ivsl", ivpx(int ), (int)16) - lm.ivqa("ivsj", ivpx(int ), (int)15));
                    continue block88;
                }
                case 549828689: {
                    break block88;
                }
            }
            break;
        }
        v23 = v21.build();
        while (true) {
            if ((v24 /* !! */  = (cfr_temp_11 = lm.qp - lm.ivqa("ivso", ivpx(int ), (int)17)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v24 /* !! */  == lm.ivqa("ivsq", ivqc(int ), (int)20)) break;
            v24 /* !! */  = (long)lm.ivqa("ivsr", ivqc(int ), (int)21);
        }
        while (true) {
            if ((v25 /* !! */  = (cfr_temp_12 = lm.qp - lm.ivqa("ivst", ivpx(int ), (int)18)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
            if (v25 /* !! */  == lm.ivqa("ivsv", ivqc(int ), (int)22)) break;
            v25 /* !! */  = (long)lm.ivqa("ivsx", ivqc(int ), (int)23);
        }
        v26 = v19.withVertexFormat(v23, VertexFormat.class_5596.field_27379);
        while (true) {
            if ((v27 /* !! */  = (cfr_temp_13 = lm.qp - lm.ivqa("ivsz", ivpx(int ), (int)19)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
            if (v27 /* !! */  == lm.ivqa("ivtb", ivqc(int ), (int)24)) break;
            v27 /* !! */  = (long)lm.ivqa("ivtd", ivqc(int ), (int)25);
        }
        v28 /* !! */  = lm.qp;
        block92: while (true) {
            switch ((int)v28 /* !! */ ) {
                case 549828689: {
                    break block92;
                }
                case 1679871860: {
                    v28 /* !! */  = (long)(lm.ivqa("ivth", ivpx(int ), (int)21) - lm.ivqa("ivtf", ivpx(int ), (int)20));
                    continue block92;
                }
            }
            break;
        }
        v29 = v26.withUniform("Uniforms", class_10789.field_60031);
        v30 /* !! */  = lm.qp;
        block93: while (true) {
            switch ((int)v30 /* !! */ ) {
                case 549828689: {
                    break block93;
                }
                case 1828057049: {
                    v30 /* !! */  = (long)(lm.ivqa("ivtl", ivpx(int ), (int)23) - lm.ivqa("ivtj", ivpx(int ), (int)22));
                    continue block93;
                }
            }
            break;
        }
        v31 = v29.withSampler("Sampler0");
        while (true) {
            block135: {
                if ((v32 /* !! */  = (cfr_temp_14 = lm.qp - lm.ivqa("ivto", ivpx(int ), (int)24)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                if (v32 /* !! */  != lm.ivqa("ivtp", ivqc(int ), (int)26)) break block135;
                v33 /* !! */  = lm.qp;
                if (true) ** GOTO lbl145
            }
            v32 /* !! */  = (long)lm.ivqa("ivtq", ivqc(int ), (int)27);
        }
        block95: while (true) {
            v33 /* !! */  = (long)(v34 - lm.ivqa("ivts", ivpx(int ), (int)25));
lbl145:
            // 2 sources

            switch ((int)v33 /* !! */ ) {
                case 208509528: {
                    v34 = lm.ivqa("ivtu", ivpx(int ), (int)26);
                    continue block95;
                }
                case 549828689: {
                    break block95;
                }
                case 941971496: {
                    v34 = lm.ivqa("ivtx", ivpx(int ), (int)27);
                    continue block95;
                }
            }
            break;
        }
        v35 = v31.withBlend(BlendFunction.TRANSLUCENT);
        v36 /* !! */  = lm.qp;
        block96: while (true) {
            switch ((int)v36 /* !! */ ) {
                case 270245362: {
                    v36 /* !! */  = (long)(lm.ivqa("ivuc", ivpx(int ), (int)29) - lm.ivqa("ivtz", ivpx(int ), (int)28));
                    continue block96;
                }
                case 549828689: {
                    break block96;
                }
            }
            break;
        }
        v37 /* !! */  = lm.qp;
        block97: while (true) {
            switch ((int)v37 /* !! */ ) {
                case -1713865210: {
                    v37 /* !! */  = (long)(lm.ivqa("ivuf", ivpx(int ), (int)31) - lm.ivqa("ivue", ivpx(int ), (int)30));
                    continue block97;
                }
                case 549828689: {
                    break block97;
                }
            }
            break;
        }
        v38 = v35.withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST);
        v39 = lm.ivqa("ivui", ivqc(int ), (int)28);
        v40 /* !! */  = lm.qp;
        block98: while (true) {
            switch ((int)v40 /* !! */ ) {
                case 255551320: {
                    v40 /* !! */  = (long)(lm.ivqa("ivun", ivpx(int ), (int)33) - lm.ivqa("ivul", ivpx(int ), (int)32));
                    continue block98;
                }
                case 549828689: {
                    break block98;
                }
            }
            break;
        }
        v41 = v38.withCull((boolean)v39);
        v42 /* !! */  = lm.qp;
        if (true) ** GOTO lbl186
        block99: while (true) {
            v42 /* !! */  = (long)(v43 - lm.ivqa("ivup", ivpx(int ), (int)34));
lbl186:
            // 2 sources

            switch ((int)v42 /* !! */ ) {
                case -395117525: {
                    v43 = lm.ivqa("ivur", ivpx(int ), (int)35);
                    continue block99;
                }
                case 549828689: {
                    break block99;
                }
                case 2140258490: {
                    v43 = lm.ivqa("ivus", ivpx(int ), (int)36);
                    continue block99;
                }
            }
            break;
        }
        v44 = v41.build();
        while (true) {
            if ((v45 /* !! */  = (cfr_temp_15 = lm.qp - lm.ivqa("ivuv", ivpx(int ), (int)37)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
            if (v45 /* !! */  == lm.ivqa("ivux", ivqc(int ), (int)29)) {
                lm.pipeline = v44;
                if (var0_2) return;
                break;
            }
            v45 /* !! */  = (long)lm.ivqa("ivva", ivqc(int ), (int)30);
        }
        if (var0_2) return;
        while (true) {
            block136: {
                if ((v46 /* !! */  = (cfr_temp_16 = lm.qp - lm.ivqa("ivve", ivpx(int ), (int)38)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                if (v46 /* !! */  != lm.ivqa("ivvg", ivqc(int ), (int)31)) break block136;
                v47 = RenderSystem.getDevice();
                v48 /* !! */  = lm.qp;
                if (true) ** GOTO lbl216
            }
            v46 /* !! */  = (long)lm.ivqa("ivvh", ivqc(int ), (int)32);
        }
        block102: while (true) {
            v48 /* !! */  = (long)(v49 - lm.ivqa("ivvi", ivpx(int ), (int)39));
lbl216:
            // 2 sources

            switch ((int)v48 /* !! */ ) {
                case -531054850: {
                    v49 = lm.ivqa("ivvj", ivpx(int ), (int)40);
                    continue block102;
                }
                case 199864506: {
                    v49 = lm.ivqa("ivvk", ivpx(int ), (int)41);
                    continue block102;
                }
                case 309682510: {
                    v49 = lm.ivqa("ivvl", ivpx(int ), (int)42);
                    continue block102;
                }
                case 549828689: {
                    break block102;
                }
            }
            break;
        }
        v50 = (Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$init$0(), ()Ljava/lang/String;)();
        v51 = lm.ivqa("ivvm", ivqc(int ), (int)33);
        v52 = lm.ivqa("ivvn", ivpx(int ), (int)43);
        v53 /* !! */  = lm.qp;
        if (true) ** GOTO lbl235
        block103: while (true) {
            v53 /* !! */  = (long)(v54 - lm.ivqa("ivvo", ivpx(int ), (int)44));
lbl235:
            // 2 sources

            switch ((int)v53 /* !! */ ) {
                case -18871977: {
                    v54 = lm.ivqa("ivvp", ivpx(int ), (int)45);
                    continue block103;
                }
                case 119015368: {
                    v54 = lm.ivqa("ivvq", ivpx(int ), (int)46);
                    continue block103;
                }
                case 549828689: {
                    break block103;
                }
            }
            break;
        }
        v55 = v47.createBuffer(v50, (int)v51, (long)v52);
        v56 /* !! */  = lm.qp;
        if (true) ** GOTO lbl249
        block104: while (true) {
            v56 /* !! */  = (long)(v57 - lm.ivqa("ivvr", ivpx(int ), (int)47));
lbl249:
            // 2 sources

            switch ((int)v56 /* !! */ ) {
                case -1358636075: {
                    v57 = lm.ivqa("ivvs", ivpx(int ), (int)48);
                    continue block104;
                }
                case -133736406: {
                    v57 = lm.ivqa("ivvt", ivpx(int ), (int)49);
                    continue block104;
                }
                case 549828689: {
                    break block104;
                }
            }
            break;
        }
        lm.uniformBuffer = v55;
        if (var0_2 || var0_2) return;
        v58 = lm.ivqa("ivvu", ivqc(int ), (int)34);
        while (true) {
            if ((v59 /* !! */  = (cfr_temp_17 = lm.qp - lm.ivqa("ivvv", ivpx(int ), (int)50)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
            if (v59 /* !! */  == lm.ivqa("ivvw", ivqc(int ), (int)35)) break;
            v59 /* !! */  = (long)lm.ivqa("ivvy", ivqc(int ), (int)36);
        }
        v60 = MemoryUtil.memAlloc((int)v58);
        while (true) {
            if ((v61 /* !! */  = (cfr_temp_18 = lm.qp - lm.ivqa("ivwb", ivpx(int ), (int)51)) == 0L ? 0 : (cfr_temp_18 < 0L ? -1 : 1)) == false) continue;
            if (v61 /* !! */  == lm.ivqa("ivwe", ivqc(int ), (int)37)) {
                lm.uniformData = v60;
                if (var0_2) return;
                break;
            }
            v61 /* !! */  = (long)lm.ivqa("ivwh", ivqc(int ), (int)38);
        }
        if (var0_2) {
            return;
        }
        if (var1_1 /* !! */  == 0) return;
        cfr_temp_0 = -2147483648;
        block107: while (true) {
            block137: {
                switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                    default: {
                        return;
                    }
                    case 1: {
                        var1_1 /* !! */  = (int)lm.ivqa("ivwo", ivqc(int ), (int)40);
                        cfr_temp_0 = 3;
                        if (var2) {
                            throw null;
                        }
                        break block137;
                    }
                    case 5: {
                        var1_1 /* !! */  = (int)lm.ivqa("ivxe", ivqc(int ), (int)44);
                        cfr_temp_0 = 8;
                        if (var2) {
                            throw null;
                        }
                        break block137;
                    }
                    case 6: {
                        var1_1 /* !! */  = (int)lm.ivqa("ivxh", ivqc(int ), (int)45);
                        cfr_temp_0 = 4;
                        if (var2) {
                            throw null;
                        }
                        break block137;
                    }
                    case 7: {
                        var1_1 /* !! */  = (int)lm.ivqa("ivxj", ivqc(int ), (int)46);
                        cfr_temp_0 = 13;
                        if (var2) {
                            throw null;
                        }
                        break block137;
                    }
                    case 8: {
                        var1_1 /* !! */  = (int)lm.ivqa("ivxm", ivqc(int ), (int)47);
                        cfr_temp_0 = 12;
                        if (var2) {
                            throw null;
                        }
                        break block137;
                    }
                    case 9: {
                        var1_1 /* !! */  = (int)lm.ivqa("ivxr", ivqc(int ), (int)48);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var1_1 /* !! */  = (int)lm.ivqa("ivwr", ivqc(int ), (int)41);
                        cfr_temp_0 = 4;
                        if (var2) {
                            throw null;
                        }
                        break block137;
                    }
                    case 10: {
                        var1_1 /* !! */  = (int)lm.ivqa("ivxw", ivqc(int ), (int)49);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 3: {
                        ** GOTO lbl344
                    }
                    case 11: {
                        var1_1 /* !! */  = (int)lm.ivqa("ivxy", ivqc(int ), (int)50);
                        cfr_temp_0 = 13;
                        if (var2) {
                            throw null;
                        }
                        break block137;
                    }
                    case 12: {
                        var1_1 /* !! */  = (int)lm.ivqa("ivyb", ivqc(int ), (int)51);
                        if (var2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 14: lbl-1000:
                    // 2 sources

                    {
                        var1_1 /* !! */  = (int)lm.ivqa("ivyi", ivqc(int ), (int)53);
                        if (var2) {
                            throw null;
                        }
lbl344:
                        // 3 sources

                        var1_1 /* !! */  = (int)lm.ivqa("ivww", ivqc(int ), (int)42);
                        cfr_temp_0 = 13;
                        if (var2) {
                            throw null;
                        }
                        break block137;
                    }
                    case 0: {
                        var1_1 /* !! */  = (int)lm.ivqa("ivwk", ivqc(int ), (int)39);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 13: {
                        var1_1 /* !! */  = (int)lm.ivqa("ivyf", ivqc(int ), (int)52);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 4: 
                }
                ** GOTO lbl362
            }
            do {
                if (true) continue block107;
lbl362:
                // 2 sources

                var1_1 /* !! */  = (int)lm.ivqa("ivwz", ivqc(int ), (int)43);
                cfr_temp_0 = 0;
            } while (!var2);
            break;
        }
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String lambda$init$0() {
        v0 /* !! */  = lm.qp;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - lm.ivqa("iwsg", ivpx(int ), (int)106));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -774688357: {
                    v1 = lm.ivqa("iwsi", ivpx(int ), (int)107);
                    continue block18;
                }
                case 549828689: {
                    break block18;
                }
                case 810447642: {
                    v1 = lm.ivqa("iwsj", ivpx(int ), (int)108);
                    continue block18;
                }
                case 2110707498: {
                    v1 = lm.ivqa("iwsl", ivpx(int ), (int)109);
                    continue block18;
                }
            }
            break;
        }
        var2 = lm.c;
        v2 /* !! */  = lm.qp;
        if (true) ** GOTO lbl22
        block19: while (true) {
            v2 /* !! */  = (long)(v3 - lm.ivqa("iwsn", ivpx(int ), (int)110));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 254544766: {
                    v3 = lm.ivqa("iwso", ivpx(int ), (int)111);
                    continue block19;
                }
                case 549828689: {
                    break block19;
                }
                case 825388752: {
                    v3 = lm.ivqa("iwsq", ivpx(int ), (int)112);
                    continue block19;
                }
                case 1825352512: {
                    v3 = lm.ivqa("iwsr", ivpx(int ), (int)113);
                    continue block19;
                }
            }
            break;
        }
        var1_1 /* !! */  = lm.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = lm.qp - lm.ivqa("iwst", ivpx(int ), (int)114)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == lm.ivqa("iwsu", ivqc(int ), (int)217)) {
                var0_2 = lm.a;
                if (var2) {
                    throw null;
                }
                break;
            }
            v4 /* !! */  = (long)lm.ivqa("iwsv", ivqc(int ), (int)218);
        }
        if (var0_2 || var0_2) {
            return null;
        }
        if (var1_1 /* !! */  == 0) return "Texture2D Uniforms";
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                default: {
                    return "Texture2D Uniforms";
                }
                case 2: {
                    do {
                        var1_1 /* !! */  = (int)lm.ivqa("iwsz", ivqc(int ), (int)221);
                    } while (!var2);
                    throw null;
                }
                case 3: {
                    var1_1 /* !! */  = (int)lm.ivqa("iwta", ivqc(int ), (int)222);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 0: lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)lm.ivqa("iwsw", ivqc(int ), (int)219);
                    if (var2) {
                        throw null;
                    }
                }
                case 1: 
            }
            if (true) ** GOTO lbl71
            break;
        }
        do {
            if (true) ** continue;
lbl71:
            // 2 sources

            var1_1 /* !! */  = (int)lm.ivqa("iwsx", ivqc(int ), (int)220);
            cfr_temp_0 = 0;
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void iwtc() {
        lm.ivqd[0] = -1165424002;
        lm.ivqd[1] = -199051510;
        lm.ivqd[2] = -363306205;
        lm.ivqd[3] = -822453312;
        lm.ivqd[4] = -1726099952;
        lm.ivqd[5] = -339331185;
        lm.ivqd[6] = 1493747488;
        lm.ivqd[7] = 562699831;
        lm.ivqd[8] = 792424616;
        lm.ivqd[9] = 1022804195;
        lm.ivqd[10] = -1718140350;
        lm.ivqd[11] = -715147823;
        lm.ivqd[12] = 205020035;
        lm.ivqd[13] = -500924098;
        lm.ivqd[14] = 1292963101;
        lm.ivqd[15] = 364409538;
        lm.ivqd[16] = 657141165;
        lm.ivqd[17] = -1624471639;
        lm.ivqd[18] = 1623522659;
        lm.ivqd[19] = 1862045207;
        lm.ivqd[20] = 1684385597;
        lm.ivqd[21] = -786418342;
        lm.ivqd[22] = 1814637634;
        lm.ivqd[23] = 1606237350;
        lm.ivqd[24] = -1269618563;
        lm.ivqd[25] = -489702138;
        lm.ivqd[26] = -584191773;
        lm.ivqd[27] = 84006104;
        lm.ivqd[28] = 978620636;
        lm.ivqd[29] = -1226368998;
        lm.ivqd[30] = 816574385;
        lm.ivqd[31] = -1780701886;
        lm.ivqd[32] = 556241194;
        lm.ivqd[33] = -542196817;
        lm.ivqd[34] = -207070658;
        lm.ivqd[35] = -1228117438;
        lm.ivqd[36] = 1416436110;
        lm.ivqd[37] = -291846000;
        lm.ivqd[38] = 489954199;
        lm.ivqd[39] = 159647601;
        lm.ivqd[40] = 511157962;
        lm.ivqd[41] = -2060264819;
        lm.ivqd[42] = 1619314050;
        lm.ivqd[43] = 1010674205;
        lm.ivqd[44] = -382810295;
        lm.ivqd[45] = -1598974464;
        lm.ivqd[46] = -95932391;
        lm.ivqd[47] = 688260653;
        lm.ivqd[48] = 1060615724;
        lm.ivqd[49] = 1687349659;
        lm.ivqd[50] = 515257566;
        lm.ivqd[51] = -742912951;
        lm.ivqd[52] = -118207491;
        lm.ivqd[53] = 1080292370;
        lm.ivqd[54] = 1743306231;
        lm.ivqd[55] = 68841439;
        lm.ivqd[56] = 1925789312;
        lm.ivqd[57] = 1764608846;
        lm.ivqd[58] = -188773774;
        lm.ivqd[59] = -957085711;
        lm.ivqd[60] = 2143912212;
        lm.ivqd[61] = -2070943171;
        lm.ivqd[62] = -1111164972;
        lm.ivqd[63] = -135528623;
        lm.ivqd[64] = -1243467743;
        lm.ivqd[65] = 1480296104;
        lm.ivqd[66] = -1680755237;
        lm.ivqd[67] = 363874866;
        lm.ivqd[68] = -2063048359;
        lm.ivqd[69] = -1658666013;
        lm.ivqd[70] = 1833981958;
        lm.ivqd[71] = 2117878237;
        lm.ivqd[72] = -1693665211;
        lm.ivqd[73] = 391607418;
        lm.ivqd[74] = -346482830;
        lm.ivqd[75] = -1978504697;
        lm.ivqd[76] = 1660306914;
        lm.ivqd[77] = -2010123468;
        lm.ivqd[78] = -384660297;
        lm.ivqd[79] = 991612050;
        lm.ivqd[80] = 1943557651;
        lm.ivqd[81] = -1332298042;
        lm.ivqd[82] = 790082371;
        lm.ivqd[83] = -76926158;
        lm.ivqd[84] = 523149234;
        lm.ivqd[85] = 1127194855;
        lm.ivqd[86] = -1405452108;
        lm.ivqd[87] = 1344504250;
        lm.ivqd[88] = -2001027040;
        lm.ivqd[89] = 2014373419;
        lm.ivqd[90] = -465554809;
        lm.ivqd[91] = -676979293;
        lm.ivqd[92] = -856457289;
        lm.ivqd[93] = -110587263;
        lm.ivqd[94] = -954765445;
        lm.ivqd[95] = -1639061015;
        lm.ivqd[96] = 916718108;
        lm.ivqd[97] = 1599256387;
        lm.ivqd[98] = -365350557;
        lm.ivqd[99] = -974753135;
    }

    private static /* synthetic */ void iwth() {
        lm.ivqd[100] = -1174065290;
        lm.ivqd[101] = -296151375;
        lm.ivqd[102] = 256240230;
        lm.ivqd[103] = -1268095920;
        lm.ivqd[104] = 2022714693;
        lm.ivqd[105] = 294563332;
        lm.ivqd[106] = 677230271;
        lm.ivqd[107] = -146286206;
        lm.ivqd[108] = -23332964;
        lm.ivqd[109] = 1579928224;
        lm.ivqd[110] = 2029430806;
        lm.ivqd[111] = -959271812;
        lm.ivqd[112] = -189885288;
        lm.ivqd[113] = 1776538965;
        lm.ivqd[114] = -588690925;
        lm.ivqd[115] = 1770328143;
        lm.ivqd[116] = 222736394;
        lm.ivqd[117] = 2064470753;
        lm.ivqd[118] = -165821643;
        lm.ivqd[119] = 1619005504;
        lm.ivqd[120] = -1179213982;
        lm.ivqd[121] = -1907899870;
        lm.ivqd[122] = -637650096;
        lm.ivqd[123] = 115064675;
        lm.ivqd[124] = -746713130;
        lm.ivqd[125] = -1882040880;
        lm.ivqd[126] = -1852283694;
        lm.ivqd[127] = 82326559;
        lm.ivqd[128] = -554113400;
        lm.ivqd[129] = 1652668111;
        lm.ivqd[130] = -376286910;
        lm.ivqd[131] = -2011520547;
        lm.ivqd[132] = 614339722;
        lm.ivqd[133] = 1114785446;
        lm.ivqd[134] = 2058680501;
        lm.ivqd[135] = 809705506;
        lm.ivqd[136] = 812736930;
        lm.ivqd[137] = -780691976;
        lm.ivqd[138] = -1290728934;
        lm.ivqd[139] = 928840764;
        lm.ivqd[140] = 1878488632;
        lm.ivqd[141] = 773914539;
        lm.ivqd[142] = 283704106;
        lm.ivqd[143] = 2081725988;
        lm.ivqd[144] = 1177264673;
        lm.ivqd[145] = -1758026908;
        lm.ivqd[146] = -304780329;
        lm.ivqd[147] = 356213073;
        lm.ivqd[148] = 1726688067;
        lm.ivqd[149] = 2081500075;
        lm.ivqd[150] = -934851292;
        lm.ivqd[151] = -820844361;
        lm.ivqd[152] = 138551398;
        lm.ivqd[153] = 1499600980;
        lm.ivqd[154] = 769484261;
        lm.ivqd[155] = 534694593;
        lm.ivqd[156] = 608304418;
        lm.ivqd[157] = 959021556;
        lm.ivqd[158] = 1748574140;
        lm.ivqd[159] = -2000377641;
        lm.ivqd[160] = -775251718;
        lm.ivqd[161] = 653362457;
        lm.ivqd[162] = 576241555;
        lm.ivqd[163] = 401604271;
        lm.ivqd[164] = -1707987396;
        lm.ivqd[165] = -432615294;
        lm.ivqd[166] = 339438159;
        lm.ivqd[167] = -1972353367;
        lm.ivqd[168] = -1656653950;
        lm.ivqd[169] = -345439288;
        lm.ivqd[170] = -1342858288;
        lm.ivqd[171] = -459455379;
        lm.ivqd[172] = -2000344181;
        lm.ivqd[173] = 660919891;
        lm.ivqd[174] = 77788359;
        lm.ivqd[175] = -667515705;
        lm.ivqd[176] = -1522117325;
        lm.ivqd[177] = -51037626;
        lm.ivqd[178] = -351500975;
        lm.ivqd[179] = -449810819;
        lm.ivqd[180] = 42947745;
        lm.ivqd[181] = -2029523633;
        lm.ivqd[182] = -743903350;
        lm.ivqd[183] = -1340789309;
        lm.ivqd[184] = 870803874;
        lm.ivqd[185] = -150895128;
        lm.ivqd[186] = 441140719;
        lm.ivqd[187] = -132564395;
        lm.ivqd[188] = 1922762658;
        lm.ivqd[189] = 844331392;
        lm.ivqd[190] = -148026746;
        lm.ivqd[191] = -370967585;
        lm.ivqd[192] = 38451263;
        lm.ivqd[193] = -1603857223;
        lm.ivqd[194] = -1006958082;
        lm.ivqd[195] = -329437409;
        lm.ivqd[196] = -602950520;
        lm.ivqd[197] = 182178794;
        lm.ivqd[198] = -675644231;
        lm.ivqd[199] = -1159161637;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void shutdown() {
        block84: {
            block83: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = lm.qp - lm.ivqa("iwej", ivpx(int ), (int)75)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == lm.ivqa("iwek", ivqc(int ), (int)183)) break;
                    v0 /* !! */  = (long)lm.ivqa("iwel", ivqc(int ), (int)184);
                }
                var2 = lm.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = lm.qp - lm.ivqa("iwem", ivpx(int ), (int)76)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == lm.ivqa("iwen", ivqc(int ), (int)185)) break;
                    v1 /* !! */  = (long)lm.ivqa("iweo", ivqc(int ), (int)186);
                }
                var1_1 /* !! */  = lm.b;
                v2 /* !! */  = lm.qp;
                if (true) ** GOTO lbl17
                block59: while (true) {
                    v2 /* !! */  = (long)(lm.ivqa("iweq", ivpx(int ), (int)78) - lm.ivqa("iwep", ivpx(int ), (int)77));
lbl17:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -243255347: {
                            continue block59;
                        }
                        case 549828689: {
                            break block59;
                        }
                    }
                    break;
                }
                var0_2 = lm.a;
                if (var2) {
                    throw null;
lbl25:
                    // 10 sources

                    return;
                }
                if (var0_2 || var0_2) ** GOTO lbl25
                v3 /* !! */  = lm.qp;
                if (true) ** GOTO lbl32
                block61: while (true) {
                    v3 /* !! */  = (long)(v4 - lm.ivqa("iwer", ivpx(int ), (int)79));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1453391002: {
                            v4 = lm.ivqa("iwes", ivpx(int ), (int)80);
                            continue block61;
                        }
                        case 549828689: {
                            break block61;
                        }
                        case 611116429: {
                            v4 = lm.ivqa("iwet", ivpx(int ), (int)81);
                            continue block61;
                        }
                        case 1367199175: {
                            v4 = lm.ivqa("iweu", ivpx(int ), (int)82);
                            continue block61;
                        }
                    }
                    break;
                }
                if (lm.uniformBuffer == null) break block83;
                if (var0_2 || var0_2) ** GOTO lbl25
                v5 /* !! */  = lm.qp;
                if (true) ** GOTO lbl50
                block62: while (true) {
                    v5 /* !! */  = (long)(v6 - lm.ivqa("iwev", ivpx(int ), (int)83));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1638739424: {
                            v6 = lm.ivqa("iwew", ivpx(int ), (int)84);
                            continue block62;
                        }
                        case -1354972660: {
                            v6 = lm.ivqa("iwex", ivpx(int ), (int)85);
                            continue block62;
                        }
                        case 549828689: {
                            break block62;
                        }
                        case 1082020143: {
                            v6 = lm.ivqa("iwey", ivpx(int ), (int)86);
                            continue block62;
                        }
                    }
                    break;
                }
                v7 /* !! */  = lm.qp;
                if (true) ** GOTO lbl66
                block63: while (true) {
                    v7 /* !! */  = (long)(v8 - lm.ivqa("iwez", ivpx(int ), (int)87));
lbl66:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -2123897832: {
                            v8 = lm.ivqa("iwfa", ivpx(int ), (int)88);
                            continue block63;
                        }
                        case -629061789: {
                            v8 = lm.ivqa("iwfb", ivpx(int ), (int)89);
                            continue block63;
                        }
                        case 549828689: {
                            break block63;
                        }
                        case 552472916: {
                            v8 = lm.ivqa("iwfc", ivpx(int ), (int)90);
                            continue block63;
                        }
                    }
                    break;
                }
                lm.uniformBuffer.close();
                if (var0_2 || var0_2) ** GOTO lbl25
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = lm.qp - lm.ivqa("iwfd", ivpx(int ), (int)91)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == lm.ivqa("iwfe", ivqc(int ), (int)187)) break;
                    v9 /* !! */  = (long)lm.ivqa("iwff", ivqc(int ), (int)188);
                }
                lm.uniformBuffer = null;
                if (var0_2) ** GOTO lbl25
            }
            if (var0_2 || var0_2) ** GOTO lbl25
            v10 /* !! */  = lm.qp;
            if (true) ** GOTO lbl93
            block65: while (true) {
                v10 /* !! */  = (long)(v11 - lm.ivqa("iwfg", ivpx(int ), (int)92));
lbl93:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case 115482558: {
                        v11 = lm.ivqa("iwfh", ivpx(int ), (int)93);
                        continue block65;
                    }
                    case 549828689: {
                        break block65;
                    }
                    case 649752440: {
                        v11 = lm.ivqa("iwfi", ivpx(int ), (int)94);
                        continue block65;
                    }
                }
                break;
            }
            if (lm.uniformData == null) break block84;
            if (var0_2 || var0_2) ** GOTO lbl25
            v12 /* !! */  = lm.qp;
            if (true) ** GOTO lbl108
            block66: while (true) {
                v12 /* !! */  = (long)(lm.ivqa("iwfk", ivpx(int ), (int)96) - lm.ivqa("iwfj", ivpx(int ), (int)95));
lbl108:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case 549828689: {
                        break block66;
                    }
                    case 1547287371: {
                        continue block66;
                    }
                }
                break;
            }
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_3 = lm.qp - lm.ivqa("iwfl", ivpx(int ), (int)97)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == lm.ivqa("iwfm", ivqc(int ), (int)189)) break;
                v13 /* !! */  = (long)lm.ivqa("iwfn", ivqc(int ), (int)190);
            }
            MemoryUtil.memFree((Buffer)lm.uniformData);
            if (var0_2 || var0_2) ** GOTO lbl25
            v14 /* !! */  = lm.qp;
            if (true) ** GOTO lbl124
            block68: while (true) {
                v14 /* !! */  = (long)(v15 - lm.ivqa("iwfo", ivpx(int ), (int)98));
lbl124:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -1795776678: {
                        v15 = lm.ivqa("iwfp", ivpx(int ), (int)99);
                        continue block68;
                    }
                    case -1356229676: {
                        v15 = lm.ivqa("iwfq", ivpx(int ), (int)100);
                        continue block68;
                    }
                    case 549828689: {
                        break block68;
                    }
                    case 877072345: {
                        v15 = lm.ivqa("iwfr", ivpx(int ), (int)101);
                        continue block68;
                    }
                }
                break;
            }
            lm.uniformData = null;
            if (var0_2) ** GOTO lbl25
        }
        if (var0_2) ** GOTO lbl25
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var0_2) ** break;
                ** continue;
                return;
            }
lbl146:
            // 5 sources

            case 0: {
                var1_1 /* !! */  = (int)lm.ivqa("iwfs", ivqc(int ), (int)191);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl199
            }
lbl151:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)lm.ivqa("iwpz", ivqc(int ), (int)192);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl216
            }
            case 2: {
                var1_1 /* !! */  = (int)lm.ivqa("iwqc", ivqc(int ), (int)193);
                if (!var2) ** GOTO lbl146
                throw null;
            }
lbl160:
            // 2 sources

            case 3: {
                var1_1 /* !! */  = (int)lm.ivqa("iwqd", ivqc(int ), (int)194);
                if (!var2) break;
                throw null;
            }
lbl164:
            // 2 sources

            case 4: {
                var1_1 /* !! */  = (int)lm.ivqa("iwqf", ivqc(int ), (int)195);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl182
            }
            case 5: {
                var1_1 /* !! */  = (int)lm.ivqa("iwqg", ivqc(int ), (int)196);
                if (!var2) ** GOTO lbl146
                throw null;
            }
            case 6: {
                var1_1 /* !! */  = (int)lm.ivqa("iwqi", ivqc(int ), (int)197);
                if (!var2) ** GOTO lbl146
                throw null;
            }
lbl177:
            // 3 sources

            case 7: {
                var1_1 /* !! */  = (int)lm.ivqa("iwqk", ivqc(int ), (int)198);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl182:
            // 2 sources

            case 8: {
                var1_1 /* !! */  = (int)lm.ivqa("iwqo", ivqc(int ), (int)199);
                if (!var2) ** GOTO lbl177
                throw null;
            }
            case 9: {
                var1_1 /* !! */  = (int)lm.ivqa("iwqq", ivqc(int ), (int)200);
                if (!var2) ** GOTO lbl160
                throw null;
            }
lbl190:
            // 2 sources

            case 10: {
                var1_1 /* !! */  = (int)lm.ivqa("iwqr", ivqc(int ), (int)201);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 11: {
                var1_1 /* !! */  = (int)lm.ivqa("iwqs", ivqc(int ), (int)202);
                if (!var2) ** GOTO lbl190
                throw null;
            }
lbl199:
            // 3 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)lm.ivqa("iwqt", ivqc(int ), (int)203);
                    if (!var2) ** GOTO lbl164
                    throw null;
                }
            }
lbl204:
            // 2 sources

            case 13: {
                var1_1 /* !! */  = (int)lm.ivqa("iwqu", ivqc(int ), (int)204);
                if (!var2) ** GOTO lbl177
                throw null;
            }
lbl208:
            // 2 sources

            case 14: {
                var1_1 /* !! */  = (int)lm.ivqa("iwqw", ivqc(int ), (int)205);
                if (!var2) ** GOTO lbl146
                throw null;
            }
            case 15: {
                var1_1 /* !! */  = (int)lm.ivqa("iwqy", ivqc(int ), (int)206);
                if (!var2) ** GOTO lbl151
                throw null;
            }
lbl216:
            // 2 sources

            case 16: {
                var1_1 /* !! */  = (int)lm.ivqa("iwra", ivqc(int ), (int)207);
                if (!var2) ** GOTO lbl199
                throw null;
            }
            case 17: 
        }
        var1_1 /* !! */  = (int)lm.ivqa("iwrd", ivqc(int ), (int)208);
        ** while (!var2)
lbl223:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iwuj() {
        lm.ivpy[0] = 344047857196517854L;
        lm.ivpy[1] = 986518663558312894L;
        lm.ivpy[2] = -1288986917830878525L;
        lm.ivpy[3] = -3791710829295997798L;
        lm.ivpy[4] = 8858278241717702168L;
        lm.ivpy[5] = 6858814430712115913L;
        lm.ivpy[6] = 3832351884449241423L;
        lm.ivpy[7] = 6637285703775312010L;
        lm.ivpy[8] = -6232389511502759898L;
        lm.ivpy[9] = 7026035080677932532L;
        lm.ivpy[10] = -2464337505415343266L;
        lm.ivpy[11] = -300064496040372631L;
        lm.ivpy[12] = 4351801703803837354L;
        lm.ivpy[13] = 3976591483299834927L;
        lm.ivpy[14] = 5733167214865137915L;
        lm.ivpy[15] = 213978894860989726L;
        lm.ivpy[16] = 4021757720511258786L;
        lm.ivpy[17] = -4419346865830155081L;
        lm.ivpy[18] = -1611991809596994954L;
        lm.ivpy[19] = -5763318434564395139L;
        lm.ivpy[20] = -7097740769255163723L;
        lm.ivpy[21] = -288640270664520375L;
        lm.ivpy[22] = -331704424739179488L;
        lm.ivpy[23] = -1553774898084418891L;
        lm.ivpy[24] = 6838743033867697731L;
        lm.ivpy[25] = 3408848610266169204L;
        lm.ivpy[26] = -3325533939024893743L;
        lm.ivpy[27] = 2842151537019940136L;
        lm.ivpy[28] = 3736135323619505090L;
        lm.ivpy[29] = -7645531120348362088L;
        lm.ivpy[30] = 137299329717496195L;
        lm.ivpy[31] = -8866060707414174266L;
        lm.ivpy[32] = -1753249885005920271L;
        lm.ivpy[33] = 4495315167113790427L;
        lm.ivpy[34] = 5411508931864951252L;
        lm.ivpy[35] = -553140571039036673L;
        lm.ivpy[36] = -6651240261572018676L;
        lm.ivpy[37] = 8601759156370682876L;
        lm.ivpy[38] = 4431226453390223328L;
        lm.ivpy[39] = 8992740695540282053L;
        lm.ivpy[40] = 4145110963151036878L;
        lm.ivpy[41] = -1485751060918483082L;
        lm.ivpy[42] = -4448333351241639015L;
        lm.ivpy[43] = 670070551260236073L;
        lm.ivpy[44] = -1909794823181486693L;
        lm.ivpy[45] = -2254110751314783058L;
        lm.ivpy[46] = -7388450795458888075L;
        lm.ivpy[47] = 4819449440688280757L;
        lm.ivpy[48] = -7046800758371378825L;
        lm.ivpy[49] = 2606039738281181939L;
        lm.ivpy[50] = -3457665656236679567L;
        lm.ivpy[51] = 3431052719401235338L;
        lm.ivpy[52] = -75202215703479092L;
        lm.ivpy[53] = 1680544777750114785L;
        lm.ivpy[54] = 8148327675514845844L;
        lm.ivpy[55] = -2801600426002938074L;
        lm.ivpy[56] = -8075095027585415842L;
        lm.ivpy[57] = 1827920920931277463L;
        lm.ivpy[58] = -91845369963542966L;
        lm.ivpy[59] = 4431838705333366L;
        lm.ivpy[60] = 7098297501174240386L;
        lm.ivpy[61] = 2261909746538995773L;
        lm.ivpy[62] = -2719094880959771253L;
        lm.ivpy[63] = 3259529782986971832L;
        lm.ivpy[64] = -3090376735741670992L;
        lm.ivpy[65] = -7697228915334351597L;
        lm.ivpy[66] = -4779510986675297883L;
        lm.ivpy[67] = -5632260872095474931L;
        lm.ivpy[68] = -8826116289101893401L;
        lm.ivpy[69] = -5504820328306213185L;
        lm.ivpy[70] = 8568835458040183666L;
        lm.ivpy[71] = 8305841043833056688L;
        lm.ivpy[72] = 5223901241458250459L;
        lm.ivpy[73] = 584008736200584685L;
        lm.ivpy[74] = -6894041287137376862L;
        lm.ivpy[75] = -3982174246050052000L;
        lm.ivpy[76] = -1012104012724803649L;
        lm.ivpy[77] = -7960952199453648228L;
        lm.ivpy[78] = -9144938643724970483L;
        lm.ivpy[79] = -3057283231756610715L;
        lm.ivpy[80] = -5966846290657548873L;
        lm.ivpy[81] = -8690661869085155382L;
        lm.ivpy[82] = 8829441205967206993L;
        lm.ivpy[83] = -935681516165524209L;
        lm.ivpy[84] = -1002656893645832L;
        lm.ivpy[85] = 7389207542358258936L;
        lm.ivpy[86] = 5484343789904767908L;
        lm.ivpy[87] = 416513848474399640L;
        lm.ivpy[88] = 4576746431242679425L;
        lm.ivpy[89] = -1541281818315466756L;
        lm.ivpy[90] = -1224779799629144368L;
        lm.ivpy[91] = -8952108801560216578L;
        lm.ivpy[92] = 230512593920068641L;
        lm.ivpy[93] = -7401445518668589062L;
        lm.ivpy[94] = 3354588825692643321L;
        lm.ivpy[95] = 8990367112179677593L;
        lm.ivpy[96] = -3854348012191667807L;
        lm.ivpy[97] = 6758321150303766163L;
        lm.ivpy[98] = -7291279504921264043L;
        lm.ivpy[99] = 6257611984157673355L;
    }

    private static /* synthetic */ float iwau(int n2) {
        return Float.intBitsToFloat(ivqd[n2] ^ ivqe[n2]);
    }

    private static /* synthetic */ void iwvc() {
        lm.ivpz[100] = -8720824433283926433L;
        lm.ivpz[101] = -8429750310440494774L;
        lm.ivpz[102] = 8922905371784393575L;
        lm.ivpz[103] = 4270729913560694507L;
        lm.ivpz[104] = -6935243305107852021L;
        lm.ivpz[105] = -4596813683920229001L;
        lm.ivpz[106] = -4130679480220007949L;
        lm.ivpz[107] = -406122999292256201L;
        lm.ivpz[108] = 7939869919349685100L;
        lm.ivpz[109] = -3448830389449410700L;
        lm.ivpz[110] = 482014663908428101L;
        lm.ivpz[111] = 5433318607178940781L;
        lm.ivpz[112] = -1609170220122630491L;
        lm.ivpz[113] = -360007345486809936L;
        lm.ivpz[114] = -2055179223262161958L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void drawRegionInternal(Matrix4f var0, float var1_1, float var2_2, float var3_3, float var4_4, GpuTextureView var5_5, int var6_6, float var7_7, float var8_8, float var9_9, float var10_10, float var11_11, float var12_12, boolean var13_13, boolean var14_14) {
        block188: {
            block187: {
                var28_15 = lm.c;
                var27_16 /* !! */  = lm.b;
                var26_17 = lm.a;
                if (var28_15) {
                    throw null;
                }
                if (var26_17 || var26_17) return;
                if (lm.pipeline == null) {
                    if (var26_17 || var26_17) return;
                    lm.init();
                    if (var26_17) return;
                }
                if (var26_17 || var26_17) return;
                if (lm.pipeline == null) break block187;
                if (var26_17) return;
                if (lm.uniformBuffer == null) break block187;
                if (var26_17) return;
                if (var5_5 != null) break block188;
                if (var26_17) return;
            }
            if (var26_17 || var26_17) return;
            return;
        }
        if (var26_17 || var26_17) return;
        var15_18 = (float)(var6_6 >> lm.ivqa("iwas", ivqc(int ), (int)89) & lm.ivqa("iwat", ivqc(int ), (int)90)) / lm.ivqa("iwav", iwau(int ), (int)91);
        if (var26_17 || var26_17) return;
        var16_19 = (float)(var6_6 >> lm.ivqa("iwaw", ivqc(int ), (int)92) & lm.ivqa("iwax", ivqc(int ), (int)93)) / lm.ivqa("iway", iwau(int ), (int)94);
        if (var26_17 || var26_17) return;
        var17_20 = (float)(var6_6 & lm.ivqa("iwaz", ivqc(int ), (int)95)) / lm.ivqa("iwba", iwau(int ), (int)96);
        if (var26_17 || var26_17) return;
        var18_21 = (float)(var6_6 >> lm.ivqa("iwbb", ivqc(int ), (int)97) & lm.ivqa("iwbc", ivqc(int ), (int)98)) / lm.ivqa("iwbd", iwau(int ), (int)99);
        if (var26_17 || var26_17) return;
        var19_22 = lm.uniformData;
        if (var26_17 || var26_17) return;
        var19_22.clear();
        if (var26_17 || var26_17) return;
        if (var27_16 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block86: while (true) {
            block189: {
                switch (cfr_temp_0 == -2147483648 ? var27_16 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        var19_22.putFloat(var0.m00()).putFloat(var0.m01()).putFloat(var0.m02()).putFloat(var0.m03());
                        if (var26_17 || var26_17) return;
                        var19_22.putFloat(var0.m10()).putFloat(var0.m11()).putFloat(var0.m12()).putFloat(var0.m13());
                        if (var26_17 || var26_17) return;
                        var19_22.putFloat(var0.m20()).putFloat(var0.m21()).putFloat(var0.m22()).putFloat(var0.m23());
                        if (var26_17 || var26_17) return;
                        var19_22.putFloat(var0.m30()).putFloat(var0.m31()).putFloat(var0.m32()).putFloat(var0.m33());
                        if (var26_17 || var26_17) return;
                        var19_22.position((int)lm.ivqa("iwbe", ivqc(int ), (int)100));
                        if (var26_17 || var26_17) return;
                        var19_22.putFloat(var1_1).putFloat(var2_2).putFloat(var3_3).putFloat(var4_4);
                        if (var26_17 || var26_17) return;
                        var19_22.putFloat(var15_18).putFloat(var16_19).putFloat(var17_20).putFloat(var18_21);
                        if (var26_17 || var26_17) return;
                        var19_22.putFloat(var7_7).putFloat(var9_9).putFloat(var10_10).putFloat(var11_11 - var9_9);
                        if (var26_17 || var26_17) return;
                        v0 = var19_22.putFloat(var8_8).putFloat(var12_12 - var10_10);
                        if (var14_14) {
                            v1 = 1.0f;
                            if (var28_15) {
                                throw null;
                            }
                        } else {
                            v1 = 0.0f;
                        }
                        v0.putFloat(v1).putFloat(0.0f);
                        if (var26_17 || var26_17) return;
                        var19_22.flip();
                        if (var26_17 || var26_17) return;
                        var20_23 = RenderSystem.getDevice().createCommandEncoder();
                        if (var26_17 || var26_17) return;
                        var20_23.writeToBuffer(lm.uniformBuffer.slice(), var19_22);
                        if (var26_17 || var26_17) return;
                        v2 = RenderSystem.getSamplerCache();
                        if (var13_13) {
                            v3 = FilterMode.NEAREST;
                            if (var28_15) {
                                throw null;
                            }
                        } else {
                            v3 = FilterMode.LINEAR;
                        }
                        var21_24 = v2.method_75294(v3);
                        if (var26_17 || var26_17) return;
                        var22_25 = class_310.method_1551().method_1522();
                        if (var26_17 || var26_17) return;
                        var23_26 = var20_23.createRenderPass((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$drawRegionInternal$1(), ()Ljava/lang/String;)(), var22_25.method_71639(), OptionalInt.empty());
                        if (var26_17) return;
                        try {
                            if (var26_17) return;
                            var23_26.setPipeline(lm.pipeline);
                            if (var26_17 || var26_17) return;
                            var23_26.setUniform("Uniforms", lm.uniformBuffer);
                            if (var26_17 || var26_17) return;
                            var23_26.bindTexture("Sampler0", var5_5, var21_24);
                            if (var26_17 || var26_17) return;
                            var23_26.draw((int)lm.ivqa("iwbf", ivqc(int ), (int)101), (int)lm.ivqa("iwbg", ivqc(int ), (int)102));
                            if (var26_17 || var26_17) return;
                            if (var23_26 == null) ** GOTO lbl129
                            if (var26_17) return;
                        }
                        catch (Throwable var24_27) {
                            if (var26_17) return;
                            if (var23_26 != null) {
                                if (var26_17) return;
                                try {
                                    if (var26_17) return;
                                    var23_26.close();
                                    if (var26_17 || var26_17) return;
                                    ** if (!var28_15) goto lbl-1000
                                }
                                catch (Throwable var25_28) {
                                    if (var26_17) return;
                                    var24_27.addSuppressed(var25_28);
                                    if (var26_17) return;
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
                            }
                            if (var26_17 || var26_17) return;
                            throw var24_27;
                        }
                        var23_26.close();
                        if (var26_17) return;
                        if (var28_15) {
                            throw null;
                        }
lbl129:
                        // 3 sources

                        if (!var26_17 && !var26_17) return;
                        return;
                    }
                    case 0: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwbh", ivqc(int ), (int)103);
                        cfr_temp_0 = 43;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 10: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwbr", ivqc(int ), (int)113);
                        cfr_temp_0 = 22;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 12: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwbt", ivqc(int ), (int)115);
                        cfr_temp_0 = 44;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 14: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwbv", ivqc(int ), (int)117);
                        cfr_temp_0 = 68;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 17: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwby", ivqc(int ), (int)120);
                        cfr_temp_0 = 37;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 18: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwbz", ivqc(int ), (int)121);
                        cfr_temp_0 = 20;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 23: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwce", ivqc(int ), (int)126);
                        cfr_temp_0 = 6;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 24: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwcf", ivqc(int ), (int)127);
                        cfr_temp_0 = 54;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 27: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwci", ivqc(int ), (int)130);
                        cfr_temp_0 = 64;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 28: {
                        ** GOTO lbl450
                    }
                    case 31: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwcm", ivqc(int ), (int)134);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 22: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwcd", ivqc(int ), (int)125);
                        if (!var28_15) ** break;
                        throw null;
                    }
                    case 36: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwcr", ivqc(int ), (int)139);
                        cfr_temp_0 = 73;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 38: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwct", ivqc(int ), (int)141);
                        cfr_temp_0 = 3;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 40: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwcv", ivqc(int ), (int)143);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 33: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwco", ivqc(int ), (int)136);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 3: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwbk", ivqc(int ), (int)106);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 41: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwcw", ivqc(int ), (int)144);
                        cfr_temp_0 = 53;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 42: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwcx", ivqc(int ), (int)145);
                        cfr_temp_0 = 69;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 44: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwcz", ivqc(int ), (int)147);
                        cfr_temp_0 = 16;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 45: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwda", ivqc(int ), (int)148);
                        cfr_temp_0 = 56;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 47: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwdc", ivqc(int ), (int)150);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 2: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwbj", ivqc(int ), (int)105);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 34: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwcp", ivqc(int ), (int)137);
                        cfr_temp_0 = 39;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 50: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwdf", ivqc(int ), (int)153);
                        cfr_temp_0 = 61;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 51: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwdg", ivqc(int ), (int)154);
                        cfr_temp_0 = 4;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 54: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwdj", ivqc(int ), (int)157);
                        cfr_temp_0 = 11;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 55: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwdk", ivqc(int ), (int)158);
                        cfr_temp_0 = 21;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 56: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwdl", ivqc(int ), (int)159);
                        cfr_temp_0 = 66;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 58: {
                        do {
                            var27_16 /* !! */  = (int)lm.ivqa("iwdn", ivqc(int ), (int)161);
                        } while (!var28_15);
                        throw null;
                    }
                    case 59: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwdo", ivqc(int ), (int)162);
                        cfr_temp_0 = 68;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 60: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwdp", ivqc(int ), (int)163);
                        cfr_temp_0 = 73;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 62: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwdr", ivqc(int ), (int)165);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 30: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwcl", ivqc(int ), (int)133);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 48: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwdd", ivqc(int ), (int)151);
                        cfr_temp_0 = 61;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 63: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwds", ivqc(int ), (int)166);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 53: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwdi", ivqc(int ), (int)156);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 5: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwbm", ivqc(int ), (int)108);
                        cfr_temp_0 = 77;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 66: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwdv", ivqc(int ), (int)169);
                        cfr_temp_0 = 29;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 67: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwdw", ivqc(int ), (int)170);
                        cfr_temp_0 = 43;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 68: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwdx", ivqc(int ), (int)171);
                        cfr_temp_0 = 21;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 70: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwdz", ivqc(int ), (int)173);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 25: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwcg", ivqc(int ), (int)128);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 7: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwbo", ivqc(int ), (int)110);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 52: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwdh", ivqc(int ), (int)155);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 6: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwbn", ivqc(int ), (int)109);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 21: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwcc", ivqc(int ), (int)124);
                        cfr_temp_0 = 37;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 71: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwea", ivqc(int ), (int)174);
                        cfr_temp_0 = 26;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 72: {
                        var27_16 /* !! */  = (int)lm.ivqa("iweb", ivqc(int ), (int)175);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 19: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwca", ivqc(int ), (int)122);
                        cfr_temp_0 = 69;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 75: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwee", ivqc(int ), (int)178);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 37: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwcs", ivqc(int ), (int)140);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 11: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwbs", ivqc(int ), (int)114);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 32: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwcn", ivqc(int ), (int)135);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 69: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwdy", ivqc(int ), (int)172);
                        cfr_temp_0 = 35;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 76: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwef", ivqc(int ), (int)179);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 16: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwbx", ivqc(int ), (int)119);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 8: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwbp", ivqc(int ), (int)111);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 26: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwch", ivqc(int ), (int)129);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 64: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwdt", ivqc(int ), (int)167);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 49: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwde", ivqc(int ), (int)152);
                        cfr_temp_0 = 65;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 77: {
                        var27_16 /* !! */  = (int)lm.ivqa("iweg", ivqc(int ), (int)180);
                        cfr_temp_0 = 78;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 79: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwei", ivqc(int ), (int)182);
                        if (var28_15) {
                            throw null;
                        }
lbl450:
                        // 3 sources

                        var27_16 /* !! */  = (int)lm.ivqa("iwcj", ivqc(int ), (int)131);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 29: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwck", ivqc(int ), (int)132);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 9: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwbq", ivqc(int ), (int)112);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 4: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwbl", ivqc(int ), (int)107);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 15: {
                        do {
                            var27_16 /* !! */  = (int)lm.ivqa("iwbw", ivqc(int ), (int)118);
                        } while (!var28_15);
                        throw null;
                    }
                    case 1: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwbi", ivqc(int ), (int)104);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 73: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwec", ivqc(int ), (int)176);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 65: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwdu", ivqc(int ), (int)168);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 78: {
                        var27_16 /* !! */  = (int)lm.ivqa("iweh", ivqc(int ), (int)181);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 46: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwdb", ivqc(int ), (int)149);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 57: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwdm", ivqc(int ), (int)160);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 20: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwcb", ivqc(int ), (int)123);
                        cfr_temp_0 = 1;
                        if (var28_15) {
                            throw null;
                        }
                        break block189;
                    }
                    case 13: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwbu", ivqc(int ), (int)116);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 43: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwcy", ivqc(int ), (int)146);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 39: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwcu", ivqc(int ), (int)142);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 61: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwdq", ivqc(int ), (int)164);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 74: {
                        var27_16 /* !! */  = (int)lm.ivqa("iwed", ivqc(int ), (int)177);
                        if (var28_15) {
                            throw null;
                        }
                    }
                    case 35: 
                }
                ** GOTO lbl525
            }
            do {
                if (true) continue block86;
lbl525:
                // 2 sources

                var27_16 /* !! */  = (int)lm.ivqa("iwcq", ivqc(int ), (int)138);
                cfr_temp_0 = 13;
            } while (!var28_15);
            break;
        }
        throw null;
    }

    private static /* synthetic */ int ivqc(int n2) {
        return ivqd[n2] ^ ivqe[n2];
    }

    private static /* synthetic */ long ivpx(int n2) {
        return ivpy[n2] ^ ivpz[n2];
    }

    private static /* synthetic */ void iwty() {
        lm.ivqe[100] = -1174065354;
        lm.ivqe[101] = -296151375;
        lm.ivqe[102] = 256240224;
        lm.ivqe[103] = -1268095887;
        lm.ivqe[104] = 2022714734;
        lm.ivqe[105] = 294563392;
        lm.ivqe[106] = 677230217;
        lm.ivqe[107] = -146286137;
        lm.ivqe[108] = -23332907;
        lm.ivqe[109] = 1579928225;
        lm.ivqe[110] = 2029430788;
        lm.ivqe[111] = -959271826;
        lm.ivqe[112] = -189885270;
        lm.ivqe[113] = 1776538997;
        lm.ivqe[114] = -588690939;
        lm.ivqe[115] = 1770328160;
        lm.ivqe[116] = 222736416;
        lm.ivqe[117] = 2064470753;
        lm.ivqe[118] = -165821584;
        lm.ivqe[119] = 1619005509;
        lm.ivqe[120] = -1179213981;
        lm.ivqe[121] = -1907899847;
        lm.ivqe[122] = -637650054;
        lm.ivqe[123] = 115064652;
        lm.ivqe[124] = -746713123;
        lm.ivqe[125] = -1882040838;
        lm.ivqe[126] = -1852283760;
        lm.ivqe[127] = 82326590;
        lm.ivqe[128] = -554113356;
        lm.ivqe[129] = 1652668158;
        lm.ivqe[130] = -376286857;
        lm.ivqe[131] = -2011520560;
        lm.ivqe[132] = 614339735;
        lm.ivqe[133] = 1114785514;
        lm.ivqe[134] = 2058680499;
        lm.ivqe[135] = 809705528;
        lm.ivqe[136] = 812736954;
        lm.ivqe[137] = -780691990;
        lm.ivqe[138] = -1290728915;
        lm.ivqe[139] = 928840706;
        lm.ivqe[140] = 1878488606;
        lm.ivqe[141] = 773914528;
        lm.ivqe[142] = 283704079;
        lm.ivqe[143] = 2081725987;
        lm.ivqe[144] = 1177264661;
        lm.ivqe[145] = -1758026919;
        lm.ivqe[146] = -304780302;
        lm.ivqe[147] = 356213070;
        lm.ivqe[148] = 1726688005;
        lm.ivqe[149] = 2081500033;
        lm.ivqe[150] = -934851269;
        lm.ivqe[151] = -820844410;
        lm.ivqe[152] = 138551403;
        lm.ivqe[153] = 1499600985;
        lm.ivqe[154] = 769484226;
        lm.ivqe[155] = 534694644;
        lm.ivqe[156] = 608304419;
        lm.ivqe[157] = 959021542;
        lm.ivqe[158] = 1748574131;
        lm.ivqe[159] = -2000377606;
        lm.ivqe[160] = -775251738;
        lm.ivqe[161] = 653362476;
        lm.ivqe[162] = 576241593;
        lm.ivqe[163] = 401604231;
        lm.ivqe[164] = -1707987437;
        lm.ivqe[165] = -432615268;
        lm.ivqe[166] = 339438168;
        lm.ivqe[167] = -1972353364;
        lm.ivqe[168] = -1656653903;
        lm.ivqe[169] = -345439286;
        lm.ivqe[170] = -1342858342;
        lm.ivqe[171] = -459455377;
        lm.ivqe[172] = -2000344141;
        lm.ivqe[173] = 660919906;
        lm.ivqe[174] = 77788397;
        lm.ivqe[175] = -667515681;
        lm.ivqe[176] = -1522117250;
        lm.ivqe[177] = -51037604;
        lm.ivqe[178] = -351500981;
        lm.ivqe[179] = -449810840;
        lm.ivqe[180] = 42947753;
        lm.ivqe[181] = -2029523602;
        lm.ivqe[182] = -743903333;
        lm.ivqe[183] = -1340789310;
        lm.ivqe[184] = -1743908009;
        lm.ivqe[185] = -150895127;
        lm.ivqe[186] = -918414482;
        lm.ivqe[187] = 132564394;
        lm.ivqe[188] = 115521094;
        lm.ivqe[189] = 844331393;
        lm.ivqe[190] = 814095842;
        lm.ivqe[191] = -370967601;
        lm.ivqe[192] = 38451256;
        lm.ivqe[193] = -1603857232;
        lm.ivqe[194] = -1006958082;
        lm.ivqe[195] = -329437422;
        lm.ivqe[196] = -602950519;
        lm.ivqe[197] = 182178799;
        lm.ivqe[198] = -675644234;
        lm.ivqe[199] = -1159161646;
    }
}

