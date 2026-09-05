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
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.textures.TextureFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  net.minecraft.class_10789
 *  net.minecraft.class_290
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  org.lwjgl.system.MemoryUtil
 */
package ruhack.phobia;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.function.Supplier;
import net.minecraft.class_10789;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import org.lwjgl.system.MemoryUtil;

public class li {
    private static GpuTextureView tempTextureView;
    private static int lastWidth;
    private static final class_2960 FRAGMENT_SHADER;
    private static final class_2960 VERTEX_SHADER;
    private static GpuBuffer dummyVertexBuffer;
    private static final class_2960 PIPELINE_ID;
    public static final boolean a;
    private static long[] icxl;
    private static int lastHeight;
    private static int[] icxr;
    private static final long pl = -4693250305100624619L;
    private static ByteBuffer dataBuffer;
    private static GpuTexture tempTexture;
    private static int[] icxs;
    private static GpuBuffer uniformBuffer;
    public static final boolean c;
    private static long[] icxk;
    public static final int b;
    private static RenderPipeline pipeline;

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static /* synthetic */ String lambda$apply$3() {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = pl - li.icxm("ievr", icxi(int ), (int)193)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == li.icxm("ievs", icxp(int ), (int)293)) break;
            object = li.icxm("ievt", icxp(int ), (int)294);
        }
        boolean bl2 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = pl - li.icxm("ievu", icxi(int ), (int)194)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == li.icxm("ievv", icxp(int ), (int)295)) break;
            object = li.icxm("ievw", icxp(int ), (int)296);
        }
        int n2 = b;
        Object object = pl;
        block12: while (true) {
            switch ((int)object) {
                case -1979092719: {
                    object = li.icxm("ievy", icxi(int ), (int)196) - li.icxm("ievx", icxi(int ), (int)195);
                    continue block12;
                }
                case -1568944875: {
                    break block12;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return null;
        if (bl3) return null;
        if (n2 == 0) return "phobia:saturation_pass";
        switch (n2) {
            default: {
                return "phobia:saturation_pass";
            }
            case 1: {
                CallSite callSite = li.icxm("iewa", icxp(int ), (int)298);
                if (bl2) {
                    throw null;
                }
            }
            case 2: {
                CallSite callSite = li.icxm("iewb", icxp(int ), (int)299);
                if (bl2) {
                    throw null;
                }
            }
            case 0: {
                CallSite callSite = li.icxm("ievz", icxp(int ), (int)297);
                if (!bl2) break;
                throw null;
            }
            case 3: 
        }
        do {
            CallSite callSite = li.icxm("iewc", icxp(int ), (int)300);
        } while (!bl2);
        throw null;
    }

    private static /* synthetic */ void iexw() {
        li.icxs[200] = 1102823373;
        li.icxs[201] = 1673517675;
        li.icxs[202] = 1954414449;
        li.icxs[203] = -1039343011;
        li.icxs[204] = 718749758;
        li.icxs[205] = 685731835;
        li.icxs[206] = -1442692678;
        li.icxs[207] = -975522890;
        li.icxs[208] = -466974061;
        li.icxs[209] = 1271829291;
        li.icxs[210] = 2135357373;
        li.icxs[211] = -563095713;
        li.icxs[212] = 299510622;
        li.icxs[213] = 1630604978;
        li.icxs[214] = 1572930427;
        li.icxs[215] = -1713664447;
        li.icxs[216] = -1499217535;
        li.icxs[217] = -1463261440;
        li.icxs[218] = -1271043591;
        li.icxs[219] = 637492699;
        li.icxs[220] = 255717939;
        li.icxs[221] = -139669884;
        li.icxs[222] = 1018300673;
        li.icxs[223] = -234551184;
        li.icxs[224] = -1986456352;
        li.icxs[225] = -361304601;
        li.icxs[226] = -602737636;
        li.icxs[227] = -1728885880;
        li.icxs[228] = 1455964589;
        li.icxs[229] = -395904113;
        li.icxs[230] = -1338300534;
        li.icxs[231] = 702544794;
        li.icxs[232] = -1956580961;
        li.icxs[233] = 1663642878;
        li.icxs[234] = -1627853620;
        li.icxs[235] = -1667527948;
        li.icxs[236] = -455094380;
        li.icxs[237] = -430504160;
        li.icxs[238] = 62424679;
        li.icxs[239] = 1784562744;
        li.icxs[240] = -388050007;
        li.icxs[241] = -162734109;
        li.icxs[242] = 1023881435;
        li.icxs[243] = 685597965;
        li.icxs[244] = 1501690096;
        li.icxs[245] = 548813897;
        li.icxs[246] = 1450482327;
        li.icxs[247] = 1709576322;
        li.icxs[248] = 776248782;
        li.icxs[249] = -601513869;
        li.icxs[250] = 1903054717;
        li.icxs[251] = -2106541993;
        li.icxs[252] = 488919712;
        li.icxs[253] = -1533801708;
        li.icxs[254] = 824868039;
        li.icxs[255] = -1916759668;
        li.icxs[256] = -1815984208;
        li.icxs[257] = -147008383;
        li.icxs[258] = 1119876359;
        li.icxs[259] = 2098700212;
        li.icxs[260] = 1408660245;
        li.icxs[261] = 380282792;
        li.icxs[262] = -1756807744;
        li.icxs[263] = -80395332;
        li.icxs[264] = -365107361;
        li.icxs[265] = -489163764;
        li.icxs[266] = 1973230843;
        li.icxs[267] = 784870739;
        li.icxs[268] = 969356352;
        li.icxs[269] = 1666730594;
        li.icxs[270] = -2102502142;
        li.icxs[271] = -241867986;
        li.icxs[272] = -786465639;
        li.icxs[273] = -220789649;
        li.icxs[274] = 1461946025;
        li.icxs[275] = -1893083548;
        li.icxs[276] = 2066330430;
        li.icxs[277] = 331184245;
        li.icxs[278] = -2026833805;
        li.icxs[279] = 882114753;
        li.icxs[280] = 1621573114;
        li.icxs[281] = -1184564759;
        li.icxs[282] = 2004151095;
        li.icxs[283] = -1116916079;
        li.icxs[284] = -64797482;
        li.icxs[285] = 2107355497;
        li.icxs[286] = 763141376;
        li.icxs[287] = 1665515966;
        li.icxs[288] = 968765850;
        li.icxs[289] = 76185580;
        li.icxs[290] = -290011595;
        li.icxs[291] = 1968118301;
        li.icxs[292] = 1588798356;
        li.icxs[293] = 1879101188;
        li.icxs[294] = -254125161;
        li.icxs[295] = -1289095649;
        li.icxs[296] = -384310202;
        li.icxs[297] = 901344348;
        li.icxs[298] = 1759794283;
        li.icxs[299] = -970281213;
    }

    private static /* synthetic */ void iexr() {
        li.icxr[100] = -1411239683;
        li.icxr[101] = 99249900;
        li.icxr[102] = -295603531;
        li.icxr[103] = -1804229154;
        li.icxr[104] = -585217924;
        li.icxr[105] = 512134897;
        li.icxr[106] = 592530785;
        li.icxr[107] = -1469665566;
        li.icxr[108] = 1686426617;
        li.icxr[109] = 913806617;
        li.icxr[110] = -396075792;
        li.icxr[111] = 988917587;
        li.icxr[112] = 667764030;
        li.icxr[113] = 2048519967;
        li.icxr[114] = 126029409;
        li.icxr[115] = -958086457;
        li.icxr[116] = 91338579;
        li.icxr[117] = -565344786;
        li.icxr[118] = 1758725065;
        li.icxr[119] = 194518953;
        li.icxr[120] = -724257280;
        li.icxr[121] = 258090757;
        li.icxr[122] = 1349012521;
        li.icxr[123] = 2027810150;
        li.icxr[124] = -103090282;
        li.icxr[125] = -1743208822;
        li.icxr[126] = 1257628876;
        li.icxr[127] = -1277277594;
        li.icxr[128] = -1129115402;
        li.icxr[129] = -1886794632;
        li.icxr[130] = 2102258461;
        li.icxr[131] = 245824524;
        li.icxr[132] = -1664782479;
        li.icxr[133] = -813537497;
        li.icxr[134] = 570510583;
        li.icxr[135] = 1374970381;
        li.icxr[136] = -1113286439;
        li.icxr[137] = -1729527028;
        li.icxr[138] = -873096300;
        li.icxr[139] = 855539170;
        li.icxr[140] = 1406269761;
        li.icxr[141] = -425300019;
        li.icxr[142] = 2090984483;
        li.icxr[143] = 544089081;
        li.icxr[144] = -911490997;
        li.icxr[145] = -1986215382;
        li.icxr[146] = -171592900;
        li.icxr[147] = -1756648898;
        li.icxr[148] = -417557714;
        li.icxr[149] = -1058989226;
        li.icxr[150] = 1458218406;
        li.icxr[151] = 1543087891;
        li.icxr[152] = 1357780427;
        li.icxr[153] = 1267566161;
        li.icxr[154] = 555953384;
        li.icxr[155] = 157521757;
        li.icxr[156] = 858493705;
        li.icxr[157] = -724346555;
        li.icxr[158] = 494889037;
        li.icxr[159] = -1028556077;
        li.icxr[160] = 1561477289;
        li.icxr[161] = 844354763;
        li.icxr[162] = 1994078716;
        li.icxr[163] = 525254851;
        li.icxr[164] = -1059001335;
        li.icxr[165] = -945295183;
        li.icxr[166] = 473364498;
        li.icxr[167] = -417065797;
        li.icxr[168] = 1991314597;
        li.icxr[169] = -1013772969;
        li.icxr[170] = 1476289111;
        li.icxr[171] = -87499159;
        li.icxr[172] = -1684045141;
        li.icxr[173] = 182680240;
        li.icxr[174] = 2025307403;
        li.icxr[175] = -93679786;
        li.icxr[176] = -1104443502;
        li.icxr[177] = -306246485;
        li.icxr[178] = -1697696437;
        li.icxr[179] = 1668614534;
        li.icxr[180] = -770273025;
        li.icxr[181] = 357117153;
        li.icxr[182] = -1479477906;
        li.icxr[183] = 32029066;
        li.icxr[184] = -1183306500;
        li.icxr[185] = 74653671;
        li.icxr[186] = -2086934291;
        li.icxr[187] = 2091911710;
        li.icxr[188] = 1906679418;
        li.icxr[189] = -1753289892;
        li.icxr[190] = 621620686;
        li.icxr[191] = -304923448;
        li.icxr[192] = 1824429560;
        li.icxr[193] = 1402288336;
        li.icxr[194] = 1405130952;
        li.icxr[195] = 446755994;
        li.icxr[196] = 1526434612;
        li.icxr[197] = 724838495;
        li.icxr[198] = -1181627740;
        li.icxr[199] = -241561213;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$init$0() {
        v0 /* !! */  = li.pl;
        if (true) ** GOTO lbl5
        block9: while (true) {
            v0 /* !! */  = (long)(li.icxm("iexd", icxi(int ), (int)207) - li.icxm("iexc", icxi(int ), (int)206));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1645997410: {
                    continue block9;
                }
                case -1568944875: {
                    break block9;
                }
            }
            break;
        }
        var2 = li.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = li.pl - li.icxm("iexf", icxi(int ), (int)208)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == li.icxm("iexg", icxp(int ), (int)315)) break;
            v1 /* !! */  = (long)li.icxm("iexh", icxp(int ), (int)316);
        }
        var1_1 = li.b;
        v2 /* !! */  = li.pl;
        if (true) ** GOTO lbl22
        block11: while (true) {
            v2 /* !! */  = (long)(v3 - li.icxm("iexi", icxi(int ), (int)209));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1958564774: {
                    v3 = li.icxm("iexj", icxi(int ), (int)210);
                    continue block11;
                }
                case -1568944875: {
                    break block11;
                }
                case 734334852: {
                    v3 = li.icxm("iexk", icxi(int ), (int)211);
                    continue block11;
                }
            }
            break;
        }
        var0_2 = li.a;
        if (var2) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl37:
        // 1 sources

        return "phobia:saturation_dummy_vertex";
    }

    private static /* synthetic */ void ieyd() {
        li.icxl[100] = 5077655476044063015L;
        li.icxl[101] = -8340702580734648904L;
        li.icxl[102] = 2218682290033371931L;
        li.icxl[103] = 4912789256269781236L;
        li.icxl[104] = -174599021543774083L;
        li.icxl[105] = 241094400093082659L;
        li.icxl[106] = -5588249607531072152L;
        li.icxl[107] = 2000938017006769378L;
        li.icxl[108] = 5437636546172644420L;
        li.icxl[109] = -3320673042223475637L;
        li.icxl[110] = -5237359223581999265L;
        li.icxl[111] = -2103752726295055243L;
        li.icxl[112] = -4303829053783608696L;
        li.icxl[113] = -8575158255390286989L;
        li.icxl[114] = 953681516368382202L;
        li.icxl[115] = 4675653037816048955L;
        li.icxl[116] = -2802570996585142303L;
        li.icxl[117] = -5041823591735551026L;
        li.icxl[118] = -6519506004123951844L;
        li.icxl[119] = -792685378075781733L;
        li.icxl[120] = 4262889553766436419L;
        li.icxl[121] = -6366249863545342689L;
        li.icxl[122] = 7666563380900950855L;
        li.icxl[123] = -6732181643923000445L;
        li.icxl[124] = 4087336455788348755L;
        li.icxl[125] = -3967867547899137339L;
        li.icxl[126] = 3929236294249962539L;
        li.icxl[127] = -115646079281504711L;
        li.icxl[128] = 6606084161176092895L;
        li.icxl[129] = -2143482926825352890L;
        li.icxl[130] = 3625336837399969075L;
        li.icxl[131] = 6320569422385602541L;
        li.icxl[132] = -4038898719991160090L;
        li.icxl[133] = 4360595794698589187L;
        li.icxl[134] = -6110511873706705211L;
        li.icxl[135] = -7631962988175465908L;
        li.icxl[136] = 7217451221318362757L;
        li.icxl[137] = -9047195883304606144L;
        li.icxl[138] = -5092006927457093106L;
        li.icxl[139] = -6023630744569166414L;
        li.icxl[140] = -3861079215987421468L;
        li.icxl[141] = -4435726062022230286L;
        li.icxl[142] = 1411125391231844179L;
        li.icxl[143] = 1828181364334921539L;
        li.icxl[144] = 4785385733136821905L;
        li.icxl[145] = -8104829587514746441L;
        li.icxl[146] = -7081798316208155782L;
        li.icxl[147] = -6960615755660861315L;
        li.icxl[148] = -2049474834517616449L;
        li.icxl[149] = 7528773994643179567L;
        li.icxl[150] = -1924853264136566669L;
        li.icxl[151] = -6929733636621211550L;
        li.icxl[152] = 8416656236768461963L;
        li.icxl[153] = 7906840704627579865L;
        li.icxl[154] = -1264441696410652544L;
        li.icxl[155] = -8154371868721044134L;
        li.icxl[156] = 3406783894495311878L;
        li.icxl[157] = 6545614985713799674L;
        li.icxl[158] = 294453397705083097L;
        li.icxl[159] = -5787039641939976698L;
        li.icxl[160] = -5625147781536997318L;
        li.icxl[161] = 2607657314782192254L;
        li.icxl[162] = 506840626471347571L;
        li.icxl[163] = -5224204714683100739L;
        li.icxl[164] = 2724448069201686573L;
        li.icxl[165] = -8893376955188087857L;
        li.icxl[166] = -5115776578904724376L;
        li.icxl[167] = 7495777617696434738L;
        li.icxl[168] = 7854867603416972698L;
        li.icxl[169] = 4276396238733450104L;
        li.icxl[170] = 1490857498206555350L;
        li.icxl[171] = 7472944386181106377L;
        li.icxl[172] = 2610690977656545301L;
        li.icxl[173] = -2421579803175915196L;
        li.icxl[174] = 7635235598263421143L;
        li.icxl[175] = 7320473793345220089L;
        li.icxl[176] = 1583951182434255950L;
        li.icxl[177] = 3247208481537154919L;
        li.icxl[178] = -5776050344756815175L;
        li.icxl[179] = -4655155722138342905L;
        li.icxl[180] = 3900745525869650897L;
        li.icxl[181] = 8141657921209169541L;
        li.icxl[182] = 9000169234189785719L;
        li.icxl[183] = -6596472363597597190L;
        li.icxl[184] = -3416906338913034742L;
        li.icxl[185] = 3002784886011770208L;
        li.icxl[186] = 7619800362462115064L;
        li.icxl[187] = -5415820394867346366L;
        li.icxl[188] = 3566867672206320791L;
        li.icxl[189] = -8431129674765487437L;
        li.icxl[190] = 5711613976259228213L;
        li.icxl[191] = 4382646429839059584L;
        li.icxl[192] = -2099440739776945811L;
        li.icxl[193] = 2826397141381266681L;
        li.icxl[194] = -4696408202883503404L;
        li.icxl[195] = -6944697020925642606L;
        li.icxl[196] = -6221103299054667118L;
        li.icxl[197] = 8502763857894831715L;
        li.icxl[198] = 6267535351951165171L;
        li.icxl[199] = -6852315853284684519L;
    }

    public static /* synthetic */ CallSite icxm(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void iexs() {
        li.icxr[200] = -1102823374;
        li.icxr[201] = -1602994165;
        li.icxr[202] = -1954414450;
        li.icxr[203] = -1967982682;
        li.icxr[204] = -718749759;
        li.icxr[205] = -1646965284;
        li.icxr[206] = 1442692677;
        li.icxr[207] = 1748479669;
        li.icxr[208] = -466974061;
        li.icxr[209] = 1271829291;
        li.icxr[210] = 2135357373;
        li.icxr[211] = -563095713;
        li.icxr[212] = 299510622;
        li.icxr[213] = -1630604979;
        li.icxr[214] = 1821348168;
        li.icxr[215] = 1713664446;
        li.icxr[216] = -411108353;
        li.icxr[217] = 1463261439;
        li.icxr[218] = -1782539637;
        li.icxr[219] = 637492699;
        li.icxr[220] = 255717937;
        li.icxr[221] = -139669883;
        li.icxr[222] = 1018300689;
        li.icxr[223] = -234551199;
        li.icxr[224] = -1986456350;
        li.icxr[225] = -361304606;
        li.icxr[226] = -602737649;
        li.icxr[227] = -1728885881;
        li.icxr[228] = 1455964589;
        li.icxr[229] = -395904125;
        li.icxr[230] = -1338300543;
        li.icxr[231] = 702544783;
        li.icxr[232] = -1956580981;
        li.icxr[233] = 1663642876;
        li.icxr[234] = -1627853623;
        li.icxr[235] = -1667527940;
        li.icxr[236] = -455094383;
        li.icxr[237] = -430504142;
        li.icxr[238] = 62424673;
        li.icxr[239] = 1784562744;
        li.icxr[240] = -388049985;
        li.icxr[241] = -162734104;
        li.icxr[242] = -1023881436;
        li.icxr[243] = -1333923216;
        li.icxr[244] = -1501690097;
        li.icxr[245] = 412447047;
        li.icxr[246] = -1450482328;
        li.icxr[247] = 1818222355;
        li.icxr[248] = 776248783;
        li.icxr[249] = -1170311745;
        li.icxr[250] = -1903054718;
        li.icxr[251] = 1455638715;
        li.icxr[252] = 488919713;
        li.icxr[253] = 515124613;
        li.icxr[254] = -824868040;
        li.icxr[255] = -644970403;
        li.icxr[256] = 1815984207;
        li.icxr[257] = -986651394;
        li.icxr[258] = -1119876360;
        li.icxr[259] = -116244356;
        li.icxr[260] = -1408660246;
        li.icxr[261] = -2055803062;
        li.icxr[262] = -1756807742;
        li.icxr[263] = -80395332;
        li.icxr[264] = -365107366;
        li.icxr[265] = -489163776;
        li.icxr[266] = 1973230824;
        li.icxr[267] = 784870721;
        li.icxr[268] = 969356374;
        li.icxr[269] = 1666730596;
        li.icxr[270] = -2102502135;
        li.icxr[271] = -241867994;
        li.icxr[272] = -786465651;
        li.icxr[273] = -220789649;
        li.icxr[274] = 1461946046;
        li.icxr[275] = -1893083524;
        li.icxr[276] = 2066330407;
        li.icxr[277] = 331184239;
        li.icxr[278] = -2026833805;
        li.icxr[279] = 882114764;
        li.icxr[280] = 1621573112;
        li.icxr[281] = -1184564762;
        li.icxr[282] = 2004151098;
        li.icxr[283] = -1116916077;
        li.icxr[284] = -64797482;
        li.icxr[285] = 2107355490;
        li.icxr[286] = 763141384;
        li.icxr[287] = 1665515940;
        li.icxr[288] = 968765840;
        li.icxr[289] = 76185572;
        li.icxr[290] = -290011603;
        li.icxr[291] = 1968118300;
        li.icxr[292] = 1588798354;
        li.icxr[293] = -1879101189;
        li.icxr[294] = 2033913771;
        li.icxr[295] = 1289095648;
        li.icxr[296] = -1578164397;
        li.icxr[297] = 901344350;
        li.icxr[298] = 1759794280;
        li.icxr[299] = -970281215;
    }

    private static /* synthetic */ void iext() {
        li.icxr[300] = -1365312893;
        li.icxr[301] = -618695363;
        li.icxr[302] = 1777017512;
        li.icxr[303] = -1917289374;
        li.icxr[304] = -1017610354;
        li.icxr[305] = -732672826;
        li.icxr[306] = 1040702124;
        li.icxr[307] = -422287738;
        li.icxr[308] = 1835603433;
        li.icxr[309] = -1716158878;
        li.icxr[310] = 76065869;
        li.icxr[311] = 1697797608;
        li.icxr[312] = -1797019623;
        li.icxr[313] = -500895665;
        li.icxr[314] = -259366141;
        li.icxr[315] = -1759298711;
        li.icxr[316] = -884833809;
        li.icxr[317] = -174937138;
        li.icxr[318] = 733789863;
        li.icxr[319] = -1090273550;
        li.icxr[320] = 311258215;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void shutdown() {
        block131: {
            block130: {
                block129: {
                    block128: {
                        while (true) {
                            if ((v0 /* !! */  = (cfr_temp_0 = li.pl - li.icxm("ieot", icxi(int ), (int)156)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                            if (v0 /* !! */  == li.icxm("ieou", icxp(int ), (int)242)) break;
                            v0 /* !! */  = (long)li.icxm("ieov", icxp(int ), (int)243);
                        }
                        var2 = li.c;
                        while (true) {
                            if ((v1 /* !! */  = (cfr_temp_1 = li.pl - li.icxm("ieow", icxi(int ), (int)157)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                            if (v1 /* !! */  == li.icxm("ieox", icxp(int ), (int)244)) break;
                            v1 /* !! */  = (long)li.icxm("ieoy", icxp(int ), (int)245);
                        }
                        var1_1 /* !! */  = li.b;
                        while (true) {
                            if ((v2 /* !! */  = (cfr_temp_2 = li.pl - li.icxm("ieoz", icxi(int ), (int)158)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v2 /* !! */  == li.icxm("iepa", icxp(int ), (int)246)) break;
                            v2 /* !! */  = (long)li.icxm("iepb", icxp(int ), (int)247);
                        }
                        var0_2 = li.a;
                        if (var2) {
                            throw null;
lbl21:
                            // 17 sources

                            return;
                        }
                        if (var0_2 || var0_2) ** GOTO lbl21
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_3 = li.pl - li.icxm("iepc", icxi(int ), (int)159)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v3 /* !! */  == li.icxm("iepd", icxp(int ), (int)248)) break;
                            v3 /* !! */  = (long)li.icxm("iepe", icxp(int ), (int)249);
                        }
                        if (li.uniformBuffer == null) break block128;
                        if (var0_2 || var0_2) ** GOTO lbl21
                        v4 /* !! */  = li.pl;
                        if (true) ** GOTO lbl35
                        block83: while (true) {
                            v4 /* !! */  = (long)(v5 - li.icxm("iepg", icxi(int ), (int)160));
lbl35:
                            // 2 sources

                            switch ((int)v4 /* !! */ ) {
                                case -1862752603: {
                                    v5 = li.icxm("ieph", icxi(int ), (int)161);
                                    continue block83;
                                }
                                case -1804855414: {
                                    v5 = li.icxm("iepi", icxi(int ), (int)162);
                                    continue block83;
                                }
                                case -1568944875: {
                                    break block83;
                                }
                                case -1542370972: {
                                    v5 = li.icxm("iepj", icxi(int ), (int)163);
                                    continue block83;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v6 /* !! */  = (cfr_temp_4 = li.pl - li.icxm("iepk", icxi(int ), (int)164)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v6 /* !! */  == li.icxm("iepl", icxp(int ), (int)250)) break;
                            v6 /* !! */  = (long)li.icxm("iepm", icxp(int ), (int)251);
                        }
                        li.uniformBuffer.close();
                        if (var0_2) ** GOTO lbl21
                    }
                    if (var0_2 || var0_2) ** GOTO lbl21
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_5 = li.pl - li.icxm("iepn", icxi(int ), (int)165)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v7 /* !! */  == li.icxm("iepo", icxp(int ), (int)252)) break;
                        v7 /* !! */  = (long)li.icxm("iepp", icxp(int ), (int)253);
                    }
                    if (li.dummyVertexBuffer == null) break block129;
                    if (var0_2 || var0_2) ** GOTO lbl21
                    v8 /* !! */  = li.pl;
                    if (true) ** GOTO lbl67
                    block86: while (true) {
                        v8 /* !! */  = (long)(v9 - li.icxm("iepq", icxi(int ), (int)166));
lbl67:
                        // 2 sources

                        switch ((int)v8 /* !! */ ) {
                            case -1568944875: {
                                break block86;
                            }
                            case -1289831933: {
                                v9 = li.icxm("iepr", icxi(int ), (int)167);
                                continue block86;
                            }
                            case 913406194: {
                                v9 = li.icxm("ieps", icxi(int ), (int)168);
                                continue block86;
                            }
                            case 1734832511: {
                                v9 = li.icxm("iept", icxi(int ), (int)169);
                                continue block86;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_6 = li.pl - li.icxm("iepu", icxi(int ), (int)170)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == li.icxm("iepv", icxp(int ), (int)254)) break;
                        v10 /* !! */  = (long)li.icxm("iepw", icxp(int ), (int)255);
                    }
                    li.dummyVertexBuffer.close();
                    if (var0_2) ** GOTO lbl21
                }
                if (var0_2 || var0_2) ** GOTO lbl21
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_7 = li.pl - li.icxm("ieql", icxi(int ), (int)171)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == li.icxm("ieqm", icxp(int ), (int)256)) break;
                    v11 /* !! */  = (long)li.icxm("ieqo", icxp(int ), (int)257);
                }
                if (li.tempTextureView == null) break block130;
                if (var0_2 || var0_2) ** GOTO lbl21
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_8 = li.pl - li.icxm("ieqp", icxi(int ), (int)172)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == li.icxm("ieqq", icxp(int ), (int)258)) break;
                    v12 /* !! */  = (long)li.icxm("ieqr", icxp(int ), (int)259);
                }
                v13 /* !! */  = li.pl;
                if (true) ** GOTO lbl104
                block90: while (true) {
                    v13 /* !! */  = (long)(li.icxm("ieqt", icxi(int ), (int)174) - li.icxm("ieqs", icxi(int ), (int)173));
lbl104:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1815310822: {
                            continue block90;
                        }
                        case -1568944875: {
                            break block90;
                        }
                    }
                    break;
                }
                li.tempTextureView.close();
                if (var0_2) ** GOTO lbl21
            }
            if (var0_2 || var0_2) ** GOTO lbl21
            v14 /* !! */  = li.pl;
            if (true) ** GOTO lbl117
            block91: while (true) {
                v14 /* !! */  = (long)(v15 - li.icxm("ieqv", icxi(int ), (int)175));
lbl117:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -1568944875: {
                        break block91;
                    }
                    case -1338813814: {
                        v15 = li.icxm("ieqw", icxi(int ), (int)176);
                        continue block91;
                    }
                    case 1501789121: {
                        v15 = li.icxm("ieqx", icxi(int ), (int)177);
                        continue block91;
                    }
                }
                break;
            }
            if (li.tempTexture == null) break block131;
            if (var0_2 || var0_2) ** GOTO lbl21
            v16 /* !! */  = li.pl;
            if (true) ** GOTO lbl132
            block92: while (true) {
                v16 /* !! */  = (long)(v17 - li.icxm("ieqy", icxi(int ), (int)178));
lbl132:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case -1568944875: {
                        break block92;
                    }
                    case -221441577: {
                        v17 = li.icxm("ieqz", icxi(int ), (int)179);
                        continue block92;
                    }
                    case 192924880: {
                        v17 = li.icxm("iera", icxi(int ), (int)180);
                        continue block92;
                    }
                }
                break;
            }
            v18 /* !! */  = li.pl;
            if (true) ** GOTO lbl145
            block93: while (true) {
                v18 /* !! */  = (long)(v19 - li.icxm("ierc", icxi(int ), (int)181));
lbl145:
                // 2 sources

                switch ((int)v18 /* !! */ ) {
                    case -2036698613: {
                        v19 = li.icxm("ierd", icxi(int ), (int)182);
                        continue block93;
                    }
                    case -1568944875: {
                        break block93;
                    }
                    case 337551476: {
                        v19 = li.icxm("iere", icxi(int ), (int)183);
                        continue block93;
                    }
                }
                break;
            }
            li.tempTexture.close();
            if (var0_2) ** GOTO lbl21
        }
        if (var0_2 || var0_2) ** GOTO lbl21
        v20 /* !! */  = li.pl;
        if (true) ** GOTO lbl162
        block94: while (true) {
            v20 /* !! */  = (long)(li.icxm("ierg", icxi(int ), (int)185) - li.icxm("ierf", icxi(int ), (int)184));
lbl162:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case -1568944875: {
                    break block94;
                }
                case -676837521: {
                    continue block94;
                }
            }
            break;
        }
        if (li.dataBuffer == null) ** GOTO lbl199
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** GOTO lbl21
                v21 /* !! */  = li.pl;
                if (true) ** GOTO lbl176
                block95: while (true) {
                    v21 /* !! */  = (long)(v22 - li.icxm("ierh", icxi(int ), (int)186));
lbl176:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1978965819: {
                            v22 = li.icxm("ieri", icxi(int ), (int)187);
                            continue block95;
                        }
                        case -1568944875: {
                            break block95;
                        }
                        case -1230250129: {
                            v22 = li.icxm("ierj", icxi(int ), (int)188);
                            continue block95;
                        }
                        case -649961147: {
                            v22 = li.icxm("ierk", icxi(int ), (int)189);
                            continue block95;
                        }
                    }
                    break;
                }
                v23 /* !! */  = li.pl;
                if (true) ** GOTO lbl192
                block96: while (true) {
                    v23 /* !! */  = (long)(li.icxm("ierp", icxi(int ), (int)191) - li.icxm("iero", icxi(int ), (int)190));
lbl192:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1568944875: {
                            break block96;
                        }
                        case 1940959082: {
                            continue block96;
                        }
                    }
                    break;
                }
                MemoryUtil.memFree((Buffer)li.dataBuffer);
                if (var0_2) ** GOTO lbl21
lbl199:
                // 2 sources

                if (var0_2 || var0_2) ** GOTO lbl21
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_9 = li.pl - li.icxm("ierq", icxi(int ), (int)192)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == li.icxm("ierr", icxp(int ), (int)260)) break;
                    v24 /* !! */  = (long)li.icxm("iert", icxp(int ), (int)261);
                }
                li.pipeline = null;
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
lbl209:
            // 3 sources

            case 0: {
                var1_1 /* !! */  = (int)li.icxm("ieru", icxp(int ), (int)262);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl214:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)li.icxm("ierw", icxp(int ), (int)263);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl243
            }
            case 2: {
                var1_1 /* !! */  = (int)li.icxm("iery", icxp(int ), (int)264);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl314
            }
            case 3: {
                var1_1 /* !! */  = (int)li.icxm("ierz", icxp(int ), (int)265);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl285
            }
            case 4: {
                var1_1 /* !! */  = (int)li.icxm("iesa", icxp(int ), (int)266);
                if (var2) {
                    throw null;
                }
            }
lbl233:
            // 5 sources

            case 5: {
                var1_1 /* !! */  = (int)li.icxm("iesb", icxp(int ), (int)267);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl280
            }
            case 6: {
                var1_1 /* !! */  = (int)li.icxm("iesc", icxp(int ), (int)268);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl243:
            // 3 sources

            case 7: {
                var1_1 /* !! */  = (int)li.icxm("iesd", icxp(int ), (int)269);
                if (!var2) ** GOTO lbl214
                throw null;
            }
            case 8: {
                do {
                    var1_1 /* !! */  = (int)li.icxm("iesl", icxp(int ), (int)270);
                } while (!var2);
                throw null;
            }
            case 9: {
                var1_1 /* !! */  = (int)li.icxm("iesn", icxp(int ), (int)271);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl289
            }
lbl257:
            // 3 sources

            case 10: {
                var1_1 /* !! */  = (int)li.icxm("iesp", icxp(int ), (int)272);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl276
            }
lbl262:
            // 2 sources

            case 11: {
                var1_1 /* !! */  = (int)li.icxm("iesq", icxp(int ), (int)273);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl302
            }
            case 12: {
                var1_1 /* !! */  = (int)li.icxm("iess", icxp(int ), (int)274);
                if (var2) {
                    throw null;
                }
            }
lbl271:
            // 5 sources

            case 13: {
                var1_1 /* !! */  = (int)li.icxm("iesu", icxp(int ), (int)275);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl326
            }
lbl276:
            // 3 sources

            case 14: {
                var1_1 /* !! */  = (int)li.icxm("iesw", icxp(int ), (int)276);
                if (var2) {
                    throw null;
                }
            }
lbl280:
            // 5 sources

            case 15: {
                var1_1 /* !! */  = (int)li.icxm("iesy", icxp(int ), (int)277);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl318
            }
lbl285:
            // 2 sources

            case 16: {
                var1_1 /* !! */  = (int)li.icxm("iesz", icxp(int ), (int)278);
                if (!var2) ** GOTO lbl209
                throw null;
            }
lbl289:
            // 2 sources

            case 17: {
                var1_1 /* !! */  = (int)li.icxm("ietb", icxp(int ), (int)279);
                if (!var2) ** GOTO lbl209
                throw null;
            }
            case 18: {
                var1_1 /* !! */  = (int)li.icxm("ieuc", icxp(int ), (int)280);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl322
            }
lbl298:
            // 2 sources

            case 19: {
                var1_1 /* !! */  = (int)li.icxm("ieue", icxp(int ), (int)281);
                if (!var2) ** GOTO lbl233
                throw null;
            }
lbl302:
            // 2 sources

            case 20: {
                var1_1 /* !! */  = (int)li.icxm("ieug", icxp(int ), (int)282);
                if (!var2) ** GOTO lbl257
                throw null;
            }
            case 21: {
                var1_1 /* !! */  = (int)li.icxm("ieui", icxp(int ), (int)283);
                if (!var2) ** GOTO lbl243
                throw null;
            }
lbl310:
            // 2 sources

            case 22: {
                var1_1 /* !! */  = (int)li.icxm("ieuj", icxp(int ), (int)284);
                if (!var2) ** GOTO lbl298
                throw null;
            }
lbl314:
            // 2 sources

            case 23: {
                var1_1 /* !! */  = (int)li.icxm("ieum", icxp(int ), (int)285);
                if (!var2) ** GOTO lbl276
                throw null;
            }
lbl318:
            // 2 sources

            case 24: {
                var1_1 /* !! */  = (int)li.icxm("ieun", icxp(int ), (int)286);
                if (!var2) ** GOTO lbl280
                throw null;
            }
lbl322:
            // 3 sources

            case 25: {
                var1_1 /* !! */  = (int)li.icxm("ieup", icxp(int ), (int)287);
                if (!var2) ** GOTO lbl271
                throw null;
            }
lbl326:
            // 2 sources

            case 26: {
                var1_1 /* !! */  = (int)li.icxm("ieuq", icxp(int ), (int)288);
                if (!var2) ** GOTO lbl271
                throw null;
            }
            case 27: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)li.icxm("ieus", icxp(int ), (int)289);
                    if (!var2) ** GOTO lbl322
                    throw null;
                }
            }
            case 28: {
                var1_1 /* !! */  = (int)li.icxm("ievl", icxp(int ), (int)290);
                if (!var2) ** GOTO lbl310
                throw null;
            }
            case 29: {
                var1_1 /* !! */  = (int)li.icxm("ievn", icxp(int ), (int)291);
                if (!var2) ** GOTO lbl262
                throw null;
            }
            case 30: 
        }
        var1_1 /* !! */  = (int)li.icxm("ievp", icxp(int ), (int)292);
        ** while (!var2)
lbl346:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ieyc() {
        li.icxl[0] = -8707364160288492616L;
        li.icxl[1] = 4829871886448989124L;
        li.icxl[2] = -549588398328820315L;
        li.icxl[3] = 6601916720088904199L;
        li.icxl[4] = -7512218224196496932L;
        li.icxl[5] = -8472776578255654476L;
        li.icxl[6] = 4716524916219878993L;
        li.icxl[7] = -4103710492273471704L;
        li.icxl[8] = -3136353623197960582L;
        li.icxl[9] = 2595644815698148879L;
        li.icxl[10] = 2404075351630057053L;
        li.icxl[11] = 1434935228649399216L;
        li.icxl[12] = 1522718876887529395L;
        li.icxl[13] = 5679047996723632968L;
        li.icxl[14] = -7362278248312248267L;
        li.icxl[15] = 4597548506349988847L;
        li.icxl[16] = -3663011431020848595L;
        li.icxl[17] = -2075842422170172407L;
        li.icxl[18] = 2078796216777592445L;
        li.icxl[19] = 5094777599041173572L;
        li.icxl[20] = -4182183836275225266L;
        li.icxl[21] = -4983222309045971020L;
        li.icxl[22] = 5117071022411856591L;
        li.icxl[23] = -705307590438458246L;
        li.icxl[24] = 4390609889285437134L;
        li.icxl[25] = 7402538193230902517L;
        li.icxl[26] = 752143475085822062L;
        li.icxl[27] = 5633485679242695018L;
        li.icxl[28] = -325893016203256465L;
        li.icxl[29] = 225918548755602226L;
        li.icxl[30] = -8102342233495675711L;
        li.icxl[31] = 8564321087175203284L;
        li.icxl[32] = 8696393535120806001L;
        li.icxl[33] = 954154535121113200L;
        li.icxl[34] = 476601169106224837L;
        li.icxl[35] = -8919222013474919457L;
        li.icxl[36] = -5539372223973282418L;
        li.icxl[37] = -4471622220473196625L;
        li.icxl[38] = -6684059525617667221L;
        li.icxl[39] = 996144323286882356L;
        li.icxl[40] = -2769593047963965737L;
        li.icxl[41] = 5613252337111105835L;
        li.icxl[42] = 7163733204280879144L;
        li.icxl[43] = -1905127874004072633L;
        li.icxl[44] = 6550780960451305042L;
        li.icxl[45] = -1873516466436849855L;
        li.icxl[46] = -6350690759334331597L;
        li.icxl[47] = -4590162491421568199L;
        li.icxl[48] = -5495852260057216051L;
        li.icxl[49] = 2369541243112647670L;
        li.icxl[50] = -5692693940612742196L;
        li.icxl[51] = 1764987589231629912L;
        li.icxl[52] = -3287923436442921431L;
        li.icxl[53] = -6603072548535266672L;
        li.icxl[54] = -8799151659814974757L;
        li.icxl[55] = -32608391270392536L;
        li.icxl[56] = 8270782738592627493L;
        li.icxl[57] = -1923716644064568660L;
        li.icxl[58] = 2314410109640388850L;
        li.icxl[59] = -4705119727763658938L;
        li.icxl[60] = -6306497512916852864L;
        li.icxl[61] = 6735531843035238579L;
        li.icxl[62] = -5752498602922506922L;
        li.icxl[63] = -6339676903763291750L;
        li.icxl[64] = -6764993762468352852L;
        li.icxl[65] = -8134167230130753975L;
        li.icxl[66] = 6409764881272661682L;
        li.icxl[67] = -94009642537212427L;
        li.icxl[68] = 4487092694681001925L;
        li.icxl[69] = 5096044541863710757L;
        li.icxl[70] = 6987971662840362221L;
        li.icxl[71] = 7973969999532963866L;
        li.icxl[72] = -7329047338199946794L;
        li.icxl[73] = 5233607544549125665L;
        li.icxl[74] = -8282316620699335040L;
        li.icxl[75] = -1788264946159388562L;
        li.icxl[76] = -4996010461555444188L;
        li.icxl[77] = -2578911157367260478L;
        li.icxl[78] = -4814345627631244067L;
        li.icxl[79] = -3485435916281980035L;
        li.icxl[80] = -7118524380424479729L;
        li.icxl[81] = -3229383862191900725L;
        li.icxl[82] = 3454410146865601273L;
        li.icxl[83] = 6118724210939500105L;
        li.icxl[84] = 4955593317117014582L;
        li.icxl[85] = -6296303014594486726L;
        li.icxl[86] = -3348421904303348604L;
        li.icxl[87] = -531267884672950485L;
        li.icxl[88] = 6742904536586130322L;
        li.icxl[89] = 6887071088128427853L;
        li.icxl[90] = 3398177111492672242L;
        li.icxl[91] = 1875702735564141854L;
        li.icxl[92] = -4451443589196544709L;
        li.icxl[93] = 9164126456394466499L;
        li.icxl[94] = -863321585109209315L;
        li.icxl[95] = 7068417080863292221L;
        li.icxl[96] = 1056293941987837877L;
        li.icxl[97] = -6865895026658000861L;
        li.icxl[98] = -4766881941894810471L;
        li.icxl[99] = -8803116330396431319L;
    }

    private static /* synthetic */ void iexz() {
        li.icxk[0] = -1181334515943844103L;
        li.icxk[1] = -1831047616374144037L;
        li.icxk[2] = -1265448277842841666L;
        li.icxk[3] = -1921085890500772167L;
        li.icxk[4] = 8459392273064128004L;
        li.icxk[5] = -7726162389561548512L;
        li.icxk[6] = -1241595420777153388L;
        li.icxk[7] = 2756884319429805116L;
        li.icxk[8] = -1185231142025829330L;
        li.icxk[9] = -4416117979513867697L;
        li.icxk[10] = -767522167119595811L;
        li.icxk[11] = 7172700879518354954L;
        li.icxk[12] = 5574607503431990470L;
        li.icxk[13] = 831077222541036962L;
        li.icxk[14] = -4646930906579517807L;
        li.icxk[15] = -2118816124775202654L;
        li.icxk[16] = -3518890996603481399L;
        li.icxk[17] = 3550746080212799808L;
        li.icxk[18] = 1148426890251976464L;
        li.icxk[19] = 4306485871385277531L;
        li.icxk[20] = 127830678261553169L;
        li.icxk[21] = -5458711960187579052L;
        li.icxk[22] = -5880261970613085498L;
        li.icxk[23] = 630383279413490764L;
        li.icxk[24] = -5536517204357312734L;
        li.icxk[25] = 2663246918028260743L;
        li.icxk[26] = 7959965618043003230L;
        li.icxk[27] = -4576278476718941495L;
        li.icxk[28] = 5851861335346942958L;
        li.icxk[29] = 4653549331559873283L;
        li.icxk[30] = 4357921724059682817L;
        li.icxk[31] = -5352214442951658240L;
        li.icxk[32] = 1285519822805221899L;
        li.icxk[33] = -1397513457949207522L;
        li.icxk[34] = 8008227104892813804L;
        li.icxk[35] = 912298914888787000L;
        li.icxk[36] = 1756854955370614186L;
        li.icxk[37] = -7305975797705530729L;
        li.icxk[38] = -6062492653204137030L;
        li.icxk[39] = -4419998781730035510L;
        li.icxk[40] = -2789866626576895712L;
        li.icxk[41] = -8090305127973680063L;
        li.icxk[42] = -6308437216193269576L;
        li.icxk[43] = 5609571516303120335L;
        li.icxk[44] = 5058109276082368284L;
        li.icxk[45] = -2776206435132187012L;
        li.icxk[46] = 3823471998696911612L;
        li.icxk[47] = 4208787046237679659L;
        li.icxk[48] = -5763482891837258454L;
        li.icxk[49] = -4137197651213675627L;
        li.icxk[50] = 1880344362681080893L;
        li.icxk[51] = -3624526206664869449L;
        li.icxk[52] = 4931069012157668838L;
        li.icxk[53] = 8316356632311967476L;
        li.icxk[54] = -4731115889633966329L;
        li.icxk[55] = 6654456188728891197L;
        li.icxk[56] = 5274562541666230327L;
        li.icxk[57] = 8084349238165298196L;
        li.icxk[58] = -4696287031486395540L;
        li.icxk[59] = 4844264697418340578L;
        li.icxk[60] = -3157581951080963540L;
        li.icxk[61] = -2115223937397962904L;
        li.icxk[62] = 5447134064030231171L;
        li.icxk[63] = -6098416110744525960L;
        li.icxk[64] = -6764993762468352836L;
        li.icxk[65] = 2970548445377179175L;
        li.icxk[66] = -7818451819410520784L;
        li.icxk[67] = -2236039932618650393L;
        li.icxk[68] = -733883219603241122L;
        li.icxk[69] = -7333188349362013955L;
        li.icxk[70] = 3053520845640770493L;
        li.icxk[71] = -4853176382774239523L;
        li.icxk[72] = 2141098877170250554L;
        li.icxk[73] = -1854008142512338554L;
        li.icxk[74] = 1744835810891157259L;
        li.icxk[75] = -2844826161283885085L;
        li.icxk[76] = -4458449291208849640L;
        li.icxk[77] = 5665139346601397609L;
        li.icxk[78] = 2659227613755368698L;
        li.icxk[79] = -5329579514175902466L;
        li.icxk[80] = 6506426429166522412L;
        li.icxk[81] = 6461266155740147519L;
        li.icxk[82] = 6522787523082319257L;
        li.icxk[83] = 6262452962329427544L;
        li.icxk[84] = 8112625473101078325L;
        li.icxk[85] = -5360787023455061257L;
        li.icxk[86] = 4788705067675358640L;
        li.icxk[87] = -3000415804720759465L;
        li.icxk[88] = -8598086031117115947L;
        li.icxk[89] = -3978037617238758186L;
        li.icxk[90] = -5335472688513143448L;
        li.icxk[91] = -4800980791953717058L;
        li.icxk[92] = -4458377068908399199L;
        li.icxk[93] = -6932327069079099880L;
        li.icxk[94] = 6785652882779107410L;
        li.icxk[95] = 2399500663679858064L;
        li.icxk[96] = -3350823781363396117L;
        li.icxk[97] = -790445136246764047L;
        li.icxk[98] = -4137949326627487987L;
        li.icxk[99] = -7543408845286380875L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void init() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = li.pl - li.icxm("icxo", icxi(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == li.icxm("icxt", icxp(int ), (int)0)) break;
            v0 /* !! */  = (long)li.icxm("icxu", icxp(int ), (int)1);
        }
        var3 = li.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = li.pl - li.icxm("icxw", icxi(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == li.icxm("icxx", icxp(int ), (int)2)) break;
            v1 /* !! */  = (long)li.icxm("icxy", icxp(int ), (int)3);
        }
        var2_1 /* !! */  = li.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = li.pl - li.icxm("icxz", icxi(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == li.icxm("icyb", icxp(int ), (int)4)) break;
            v2 /* !! */  = (long)li.icxm("icyc", icxp(int ), (int)5);
        }
        var1_2 = li.a;
        if (var3) {
            throw null;
lbl21:
            // 11 sources

            return;
        }
        if (var1_2 || var1_2) ** GOTO lbl21
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = li.pl - li.icxm("icye", icxi(int ), (int)3)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == li.icxm("icyf", icxp(int ), (int)6)) break;
                    v3 /* !! */  = (long)li.icxm("icyg", icxp(int ), (int)7);
                }
                if (li.pipeline == null) ** GOTO lbl35
                if (var1_2 || var1_2) ** GOTO lbl21
                return;
lbl35:
                // 1 sources

                if (var1_2 || var1_2) ** GOTO lbl21
                v4 = new RenderPipeline.Snippet[]{};
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_4 = li.pl - li.icxm("icyi", icxi(int ), (int)4)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == li.icxm("icyj", icxp(int ), (int)8)) break;
                    v5 /* !! */  = (long)li.icxm("icyl", icxp(int ), (int)9);
                }
                v6 = RenderPipeline.builder((RenderPipeline.Snippet[])v4);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_5 = li.pl - li.icxm("icym", icxi(int ), (int)5)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == li.icxm("icyn", icxp(int ), (int)10)) break;
                    v7 /* !! */  = (long)li.icxm("icyo", icxp(int ), (int)11);
                }
                v8 /* !! */  = li.pl;
                if (true) ** GOTO lbl52
                block97: while (true) {
                    v8 /* !! */  = (long)(li.icxm("icyr", icxi(int ), (int)7) - li.icxm("icyp", icxi(int ), (int)6));
lbl52:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1568944875: {
                            break block97;
                        }
                        case -1246808028: {
                            continue block97;
                        }
                    }
                    break;
                }
                v9 = v6.withLocation(li.PIPELINE_ID);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_6 = li.pl - li.icxm("icys", icxi(int ), (int)8)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == li.icxm("icyt", icxp(int ), (int)12)) break;
                    v10 /* !! */  = (long)li.icxm("icyv", icxp(int ), (int)13);
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_7 = li.pl - li.icxm("icyw", icxi(int ), (int)9)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == li.icxm("icyx", icxp(int ), (int)14)) break;
                    v11 /* !! */  = (long)li.icxm("icyz", icxp(int ), (int)15);
                }
                v12 = v9.withVertexShader(li.VERTEX_SHADER);
                v13 /* !! */  = li.pl;
                if (true) ** GOTO lbl73
                block100: while (true) {
                    v13 /* !! */  = (long)(v14 - li.icxm("icza", icxi(int ), (int)10));
lbl73:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1568944875: {
                            break block100;
                        }
                        case -109081593: {
                            v14 = li.icxm("iczb", icxi(int ), (int)11);
                            continue block100;
                        }
                        case 51970263: {
                            v14 = li.icxm("iczd", icxi(int ), (int)12);
                            continue block100;
                        }
                        case 2013814071: {
                            v14 = li.icxm("icze", icxi(int ), (int)13);
                            continue block100;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_8 = li.pl - li.icxm("iczg", icxi(int ), (int)14)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == li.icxm("iczh", icxp(int ), (int)16)) break;
                    v15 /* !! */  = (long)li.icxm("iczi", icxp(int ), (int)17);
                }
                v16 = v12.withFragmentShader(li.FRAGMENT_SHADER);
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_9 = li.pl - li.icxm("iczk", icxi(int ), (int)15)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == li.icxm("iczl", icxp(int ), (int)18)) break;
                    v17 /* !! */  = (long)li.icxm("iczm", icxp(int ), (int)19);
                }
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_10 = li.pl - li.icxm("iczo", icxi(int ), (int)16)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == li.icxm("iczp", icxp(int ), (int)20)) break;
                    v18 /* !! */  = (long)li.icxm("iczq", icxp(int ), (int)21);
                }
                v19 /* !! */  = li.pl;
                if (true) ** GOTO lbl105
                block104: while (true) {
                    v19 /* !! */  = (long)(v20 - li.icxm("iczs", icxi(int ), (int)17));
lbl105:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1568944875: {
                            break block104;
                        }
                        case -728598118: {
                            v20 = li.icxm("iczt", icxi(int ), (int)18);
                            continue block104;
                        }
                        case -476168608: {
                            v20 = li.icxm("iczu", icxi(int ), (int)19);
                            continue block104;
                        }
                    }
                    break;
                }
                v21 = v16.withVertexFormat(class_290.field_60033, VertexFormat.class_5596.field_27379);
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_11 = li.pl - li.icxm("iczw", icxi(int ), (int)20)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == li.icxm("iczx", icxp(int ), (int)22)) break;
                    v22 /* !! */  = (long)li.icxm("iczz", icxp(int ), (int)23);
                }
                v23 /* !! */  = li.pl;
                if (true) ** GOTO lbl124
                block106: while (true) {
                    v23 /* !! */  = (long)(v24 - li.icxm("idaa", icxi(int ), (int)21));
lbl124:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1568944875: {
                            break block106;
                        }
                        case 522194244: {
                            v24 = li.icxm("idab", icxi(int ), (int)22);
                            continue block106;
                        }
                        case 1097556499: {
                            v24 = li.icxm("idad", icxi(int ), (int)23);
                            continue block106;
                        }
                    }
                    break;
                }
                v25 = v21.withUniform("SaturationData", class_10789.field_60031);
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_12 = li.pl - li.icxm("idae", icxi(int ), (int)24)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == li.icxm("idaf", icxp(int ), (int)24)) break;
                    v26 /* !! */  = (long)li.icxm("idag", icxp(int ), (int)25);
                }
                v27 = v25.withSampler("Sampler0");
                v28 /* !! */  = li.pl;
                if (true) ** GOTO lbl144
                block108: while (true) {
                    v28 /* !! */  = (long)(v29 - li.icxm("idai", icxi(int ), (int)25));
lbl144:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -1678522824: {
                            v29 = li.icxm("idak", icxi(int ), (int)26);
                            continue block108;
                        }
                        case -1568944875: {
                            break block108;
                        }
                        case 1588388235: {
                            v29 = li.icxm("idam", icxi(int ), (int)27);
                            continue block108;
                        }
                        case 1995482696: {
                            v29 = li.icxm("idao", icxi(int ), (int)28);
                            continue block108;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_13 = li.pl - li.icxm("idar", icxi(int ), (int)29)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == li.icxm("idas", icxp(int ), (int)26)) break;
                    v30 /* !! */  = (long)li.icxm("idau", icxp(int ), (int)27);
                }
                v31 = v27.withBlend(BlendFunction.TRANSLUCENT);
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_14 = li.pl - li.icxm("idav", icxi(int ), (int)30)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v32 /* !! */  == li.icxm("idax", icxp(int ), (int)28)) break;
                    v32 /* !! */  = (long)li.icxm("idaz", icxp(int ), (int)29);
                }
                v33 /* !! */  = li.pl;
                if (true) ** GOTO lbl171
                block111: while (true) {
                    v33 /* !! */  = (long)(li.icxm("idbd", icxi(int ), (int)32) - li.icxm("idba", icxi(int ), (int)31));
lbl171:
                    // 2 sources

                    switch ((int)v33 /* !! */ ) {
                        case -1568944875: {
                            break block111;
                        }
                        case 1151122265: {
                            continue block111;
                        }
                    }
                    break;
                }
                v34 = v31.withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST);
                v35 = li.icxm("idbf", icxp(int ), (int)30);
                while (true) {
                    if ((v36 /* !! */  = (cfr_temp_15 = li.pl - li.icxm("idbh", icxi(int ), (int)33)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                    if (v36 /* !! */  == li.icxm("idbj", icxp(int ), (int)31)) break;
                    v36 /* !! */  = (long)li.icxm("idbl", icxp(int ), (int)32);
                }
                v37 = v34.withDepthWrite((boolean)v35);
                v38 = li.icxm("idbn", icxp(int ), (int)33);
                v39 /* !! */  = li.pl;
                if (true) ** GOTO lbl189
                block113: while (true) {
                    v39 /* !! */  = (long)(v40 - li.icxm("idbp", icxi(int ), (int)34));
lbl189:
                    // 2 sources

                    switch ((int)v39 /* !! */ ) {
                        case -2124625143: {
                            v40 = li.icxm("idbr", icxi(int ), (int)35);
                            continue block113;
                        }
                        case -1568944875: {
                            break block113;
                        }
                        case 1700647858: {
                            v40 = li.icxm("idbt", icxi(int ), (int)36);
                            continue block113;
                        }
                        case 2127232761: {
                            v40 = li.icxm("idbv", icxi(int ), (int)37);
                            continue block113;
                        }
                    }
                    break;
                }
                v41 = v37.withCull((boolean)v38);
                v42 /* !! */  = li.pl;
                if (true) ** GOTO lbl206
                block114: while (true) {
                    v42 /* !! */  = (long)(v43 - li.icxm("idbx", icxi(int ), (int)38));
lbl206:
                    // 2 sources

                    switch ((int)v42 /* !! */ ) {
                        case -1568944875: {
                            break block114;
                        }
                        case -342747362: {
                            v43 = li.icxm("idby", icxi(int ), (int)39);
                            continue block114;
                        }
                        case 1655784559: {
                            v43 = li.icxm("idbz", icxi(int ), (int)40);
                            continue block114;
                        }
                        case 1905883884: {
                            v43 = li.icxm("idca", icxi(int ), (int)41);
                            continue block114;
                        }
                    }
                    break;
                }
                v44 = v41.build();
                while (true) {
                    if ((v45 /* !! */  = (cfr_temp_16 = li.pl - li.icxm("idcb", icxi(int ), (int)42)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                    if (v45 /* !! */  == li.icxm("idcd", icxp(int ), (int)34)) break;
                    v45 /* !! */  = (long)li.icxm("idcf", icxp(int ), (int)35);
                }
                li.pipeline = v44;
                if (var1_2 || var1_2) ** GOTO lbl21
                v46 = li.icxm("idcj", icxp(int ), (int)36);
                v47 /* !! */  = li.pl;
                if (true) ** GOTO lbl231
                block116: while (true) {
                    v47 /* !! */  = (long)(v48 - li.icxm("idcl", icxi(int ), (int)43));
lbl231:
                    // 2 sources

                    switch ((int)v47 /* !! */ ) {
                        case -1568944875: {
                            break block116;
                        }
                        case 961080886: {
                            v48 = li.icxm("idcn", icxi(int ), (int)44);
                            continue block116;
                        }
                        case 1124552503: {
                            v48 = li.icxm("idcp", icxi(int ), (int)45);
                            continue block116;
                        }
                    }
                    break;
                }
                v49 = MemoryUtil.memAlloc((int)v46);
                while (true) {
                    if ((v50 /* !! */  = (cfr_temp_17 = li.pl - li.icxm("idct", icxi(int ), (int)46)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
                    if (v50 /* !! */  == li.icxm("idcv", icxp(int ), (int)37)) break;
                    v50 /* !! */  = (long)li.icxm("idcx", icxp(int ), (int)38);
                }
                li.dataBuffer = v49;
                if (var1_2 || var1_2) ** GOTO lbl21
                v51 = li.icxm("iddb", icxp(int ), (int)39);
                v52 /* !! */  = li.pl;
                if (true) ** GOTO lbl253
                block118: while (true) {
                    v52 /* !! */  = (long)(v53 - li.icxm("iddd", icxi(int ), (int)47));
lbl253:
                    // 2 sources

                    switch ((int)v52 /* !! */ ) {
                        case -1568944875: {
                            break block118;
                        }
                        case -591963306: {
                            v53 = li.icxm("iddh", icxi(int ), (int)48);
                            continue block118;
                        }
                        case -9827553: {
                            v53 = li.icxm("iddj", icxi(int ), (int)49);
                            continue block118;
                        }
                        case 1149640367: {
                            v53 = li.icxm("iddk", icxi(int ), (int)50);
                            continue block118;
                        }
                    }
                    break;
                }
                var0_3 = MemoryUtil.memAlloc((int)v51);
                if (var1_2 || var1_2) ** GOTO lbl21
                v54 = li.icxm("iddm", icxp(int ), (int)40);
                while (true) {
                    if ((v55 /* !! */  = (cfr_temp_18 = li.pl - li.icxm("iddn", icxi(int ), (int)51)) == 0L ? 0 : (cfr_temp_18 < 0L ? -1 : 1)) == false) continue;
                    if (v55 /* !! */  == li.icxm("iddp", icxp(int ), (int)41)) break;
                    v55 /* !! */  = (long)li.icxm("iddq", icxp(int ), (int)42);
                }
                var0_3.putInt((int)v54);
                if (var1_2 || var1_2) ** GOTO lbl21
                v56 /* !! */  = li.pl;
                if (true) ** GOTO lbl279
                block120: while (true) {
                    v56 /* !! */  = (long)(v57 - li.icxm("idds", icxi(int ), (int)52));
lbl279:
                    // 2 sources

                    switch ((int)v56 /* !! */ ) {
                        case -2007739124: {
                            v57 = li.icxm("iddt", icxi(int ), (int)53);
                            continue block120;
                        }
                        case -1568944875: {
                            break block120;
                        }
                        case 1354500752: {
                            v57 = li.icxm("iddu", icxi(int ), (int)54);
                            continue block120;
                        }
                    }
                    break;
                }
                var0_3.flip();
                if (var1_2 || var1_2) ** GOTO lbl21
                v58 /* !! */  = li.pl;
                if (true) ** GOTO lbl295
                block121: while (true) {
                    v58 /* !! */  = (long)(v59 - li.icxm("iddx", icxi(int ), (int)55));
lbl295:
                    // 2 sources

                    switch ((int)v58 /* !! */ ) {
                        case -1568944875: {
                            break block121;
                        }
                        case -319076752: {
                            v59 = li.icxm("iddz", icxi(int ), (int)56);
                            continue block121;
                        }
                        case -23630390: {
                            v59 = li.icxm("ideb", icxi(int ), (int)57);
                            continue block121;
                        }
                    }
                    break;
                }
                v60 = RenderSystem.getDevice();
                while (true) {
                    if ((v61 /* !! */  = (cfr_temp_19 = li.pl - li.icxm("idee", icxi(int ), (int)58)) == 0L ? 0 : (cfr_temp_19 < 0L ? -1 : 1)) == false) continue;
                    if (v61 /* !! */  == li.icxm("ideg", icxp(int ), (int)43)) break;
                    v61 /* !! */  = (long)li.icxm("idei", icxp(int ), (int)44);
                }
                v62 = (Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$init$0(), ()Ljava/lang/String;)();
                v63 = li.icxm("idek", icxp(int ), (int)45);
                while (true) {
                    if ((v64 /* !! */  = (cfr_temp_20 = li.pl - li.icxm("iden", icxi(int ), (int)59)) == 0L ? 0 : (cfr_temp_20 < 0L ? -1 : 1)) == false) continue;
                    if (v64 /* !! */  == li.icxm("ideo", icxp(int ), (int)46)) break;
                    v64 /* !! */  = (long)li.icxm("ideq", icxp(int ), (int)47);
                }
                v65 = v60.createBuffer(v62, (int)v63, var0_3);
                while (true) {
                    if ((v66 /* !! */  = (cfr_temp_21 = li.pl - li.icxm("ider", icxi(int ), (int)60)) == 0L ? 0 : (cfr_temp_21 < 0L ? -1 : 1)) == false) continue;
                    if (v66 /* !! */  == li.icxm("ides", icxp(int ), (int)48)) break;
                    v66 /* !! */  = (long)li.icxm("idet", icxp(int ), (int)49);
                }
                li.dummyVertexBuffer = v65;
                if (var1_2 || var1_2) ** GOTO lbl21
                while (true) {
                    if ((v67 /* !! */  = (cfr_temp_22 = li.pl - li.icxm("idev", icxi(int ), (int)61)) == 0L ? 0 : (cfr_temp_22 < 0L ? -1 : 1)) == false) continue;
                    if (v67 /* !! */  == li.icxm("idex", icxp(int ), (int)50)) break;
                    v67 /* !! */  = (long)li.icxm("idez", icxp(int ), (int)51);
                }
                MemoryUtil.memFree((Buffer)var0_3);
                if (var1_2 || var1_2) ** GOTO lbl21
                while (true) {
                    if ((v68 /* !! */  = (cfr_temp_23 = li.pl - li.icxm("idfa", icxi(int ), (int)62)) == 0L ? 0 : (cfr_temp_23 < 0L ? -1 : 1)) == false) continue;
                    if (v68 /* !! */  == li.icxm("idfc", icxp(int ), (int)52)) break;
                    v68 /* !! */  = (long)li.icxm("idfd", icxp(int ), (int)53);
                }
                v69 = RenderSystem.getDevice();
                while (true) {
                    if ((v70 /* !! */  = (cfr_temp_24 = li.pl - li.icxm("idff", icxi(int ), (int)63)) == 0L ? 0 : (cfr_temp_24 < 0L ? -1 : 1)) == false) continue;
                    if (v70 /* !! */  == li.icxm("idfh", icxp(int ), (int)54)) break;
                    v70 /* !! */  = (long)li.icxm("idfi", icxp(int ), (int)55);
                }
                v71 = (Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$init$1(), ()Ljava/lang/String;)();
                v72 = li.icxm("idfj", icxp(int ), (int)56);
                v73 = li.icxm("idfk", icxi(int ), (int)64);
                while (true) {
                    if ((v74 /* !! */  = (cfr_temp_25 = li.pl - li.icxm("idfm", icxi(int ), (int)65)) == 0L ? 0 : (cfr_temp_25 < 0L ? -1 : 1)) == false) continue;
                    if (v74 /* !! */  == li.icxm("idfn", icxp(int ), (int)57)) break;
                    v74 /* !! */  = (long)li.icxm("idfp", icxp(int ), (int)58);
                }
                v75 = v69.createBuffer(v71, (int)v72, (long)v73);
                while (true) {
                    if ((v76 /* !! */  = (cfr_temp_26 = li.pl - li.icxm("idfq", icxi(int ), (int)66)) == 0L ? 0 : (cfr_temp_26 < 0L ? -1 : 1)) == false) continue;
                    if (v76 /* !! */  == li.icxm("idfs", icxp(int ), (int)59)) break;
                    v76 /* !! */  = (long)li.icxm("idft", icxp(int ), (int)60);
                }
                li.uniformBuffer = v75;
                if (var1_2 || var1_2) ** continue;
                return;
            }
lbl360:
            // 2 sources

            case 0: {
                do {
                    var2_1 /* !! */  = (int)li.icxm("idfw", icxp(int ), (int)61);
                } while (!var3);
                throw null;
            }
            case 1: {
                var2_1 /* !! */  = (int)li.icxm("idfz", icxp(int ), (int)62);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl393
            }
lbl370:
            // 3 sources

            case 2: {
                var2_1 /* !! */  = (int)li.icxm("idgb", icxp(int ), (int)63);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl436
            }
lbl375:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)li.icxm("idge", icxp(int ), (int)64);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl458
            }
            case 4: {
                var2_1 /* !! */  = (int)li.icxm("idgg", icxp(int ), (int)65);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl407
            }
lbl385:
            // 2 sources

            case 5: {
                var2_1 /* !! */  = (int)li.icxm("idgi", icxp(int ), (int)66);
                if (!var3) break;
                throw null;
            }
            case 6: {
                var2_1 /* !! */  = (int)li.icxm("idgl", icxp(int ), (int)67);
                if (!var3) ** GOTO lbl360
                throw null;
            }
lbl393:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)li.icxm("idgn", icxp(int ), (int)68);
                    if (!var3) ** GOTO lbl370
                    throw null;
                }
            }
            case 8: {
                var2_1 /* !! */  = (int)li.icxm("idgq", icxp(int ), (int)69);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl436
            }
lbl403:
            // 3 sources

            case 9: {
                var2_1 /* !! */  = (int)li.icxm("idgs", icxp(int ), (int)70);
                if (var3) {
                    throw null;
                }
            }
lbl407:
            // 5 sources

            case 10: {
                var2_1 /* !! */  = (int)li.icxm("idgv", icxp(int ), (int)71);
                if (!var3) ** GOTO lbl370
                throw null;
            }
            case 11: {
                var2_1 /* !! */  = (int)li.icxm("idgx", icxp(int ), (int)72);
                if (!var3) ** GOTO lbl403
                throw null;
            }
            case 12: {
                var2_1 /* !! */  = (int)li.icxm("idgz", icxp(int ), (int)73);
                if (!var3) ** GOTO lbl375
                throw null;
            }
            case 13: {
                var2_1 /* !! */  = (int)li.icxm("idxb", icxp(int ), (int)74);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl449
            }
            case 14: {
                var2_1 /* !! */  = (int)li.icxm("idxc", icxp(int ), (int)75);
                if (!var3) ** GOTO lbl403
                throw null;
            }
            case 15: {
                var2_1 /* !! */  = (int)li.icxm("idxd", icxp(int ), (int)76);
                if (var3) {
                    throw null;
                }
            }
            case 16: {
                var2_1 /* !! */  = (int)li.icxm("idxe", icxp(int ), (int)77);
                if (!var3) ** GOTO lbl385
                throw null;
            }
lbl436:
            // 3 sources

            case 17: {
                var2_1 /* !! */  = (int)li.icxm("idxf", icxp(int ), (int)78);
                if (!var3) break;
                throw null;
            }
            case 18: {
                var2_1 /* !! */  = (int)li.icxm("idxg", icxp(int ), (int)79);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl449
            }
            case 19: {
                var2_1 /* !! */  = (int)li.icxm("idxh", icxp(int ), (int)80);
                if (!var3) ** GOTO lbl407
                throw null;
            }
lbl449:
            // 3 sources

            case 20: {
                do {
                    var2_1 /* !! */  = (int)li.icxm("idxi", icxp(int ), (int)81);
                } while (!var3);
                throw null;
            }
            case 21: {
                var2_1 /* !! */  = (int)li.icxm("idxj", icxp(int ), (int)82);
                if (var3) {
                    throw null;
                }
            }
lbl458:
            // 4 sources

            case 22: {
                var2_1 /* !! */  = (int)li.icxm("idxk", icxp(int ), (int)83);
                if (!var3) break;
                throw null;
            }
            case 23: {
                do {
                    var2_1 /* !! */  = (int)li.icxm("idxl", icxp(int ), (int)84);
                } while (!var3);
                throw null;
            }
            case 24: 
        }
        var2_1 /* !! */  = (int)li.icxm("idxm", icxp(int ), (int)85);
        ** while (!var3)
lbl470:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void ensureTextures(int var0, int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = li.pl - li.icxm("idxn", icxi(int ), (int)67)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == li.icxm("idxo", icxp(int ), (int)86)) break;
            v0 /* !! */  = (long)li.icxm("idxp", icxp(int ), (int)87);
        }
        var4_2 = li.c;
        v1 /* !! */  = li.pl;
        if (true) ** GOTO lbl11
        block105: while (true) {
            v1 /* !! */  = (long)(v2 - li.icxm("idxq", icxi(int ), (int)68));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1568944875: {
                    break block105;
                }
                case -1517803339: {
                    v2 = li.icxm("idxr", icxi(int ), (int)69);
                    continue block105;
                }
                case -1079622425: {
                    v2 = li.icxm("idxs", icxi(int ), (int)70);
                    continue block105;
                }
                case 1013925472: {
                    v2 = li.icxm("idxt", icxi(int ), (int)71);
                    continue block105;
                }
            }
            break;
        }
        var3_3 /* !! */  = li.b;
        v3 /* !! */  = li.pl;
        if (true) ** GOTO lbl28
        block106: while (true) {
            v3 /* !! */  = (long)(v4 - li.icxm("idxu", icxi(int ), (int)72));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1568944875: {
                    break block106;
                }
                case 592652988: {
                    v4 = li.icxm("idxv", icxi(int ), (int)73);
                    continue block106;
                }
                case 1108043122: {
                    v4 = li.icxm("idxw", icxi(int ), (int)74);
                    continue block106;
                }
            }
            break;
        }
        var2_4 = li.a;
        if (var4_2) {
            throw null;
lbl40:
            // 15 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl40
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = li.pl - li.icxm("idxx", icxi(int ), (int)75)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == li.icxm("idxy", icxp(int ), (int)88)) break;
            v5 /* !! */  = (long)li.icxm("idxz", icxp(int ), (int)89);
        }
        if (li.tempTexture == null) ** GOTO lbl68
        if (var2_4) ** GOTO lbl40
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = li.pl - li.icxm("idya", icxi(int ), (int)76)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == li.icxm("idyb", icxp(int ), (int)90)) break;
            v6 /* !! */  = (long)li.icxm("idyc", icxp(int ), (int)91);
        }
        if (var0 != li.lastWidth) ** GOTO lbl68
        if (var2_4) ** GOTO lbl40
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = li.pl - li.icxm("idyd", icxi(int ), (int)77)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == li.icxm("idye", icxp(int ), (int)92)) break;
            v7 /* !! */  = (long)li.icxm("idyf", icxp(int ), (int)93);
        }
        if (var1_1 != li.lastHeight) ** GOTO lbl68
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl40
                return;
            }
lbl68:
            // 3 sources

            if (var2_4 || var2_4) ** GOTO lbl40
            v8 /* !! */  = li.pl;
            if (true) ** GOTO lbl73
            block111: while (true) {
                v8 /* !! */  = (long)(v9 - li.icxm("idyg", icxi(int ), (int)78));
lbl73:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -1568944875: {
                        break block111;
                    }
                    case 412976886: {
                        v9 = li.icxm("idyh", icxi(int ), (int)79);
                        continue block111;
                    }
                    case 544181127: {
                        v9 = li.icxm("idyi", icxi(int ), (int)80);
                        continue block111;
                    }
                }
                break;
            }
            if (li.tempTextureView == null) ** GOTO lbl96
            if (var2_4 || var2_4) ** GOTO lbl40
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_4 = li.pl - li.icxm("idyj", icxi(int ), (int)81)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == li.icxm("idyk", icxp(int ), (int)94)) break;
                v10 /* !! */  = (long)li.icxm("idyl", icxp(int ), (int)95);
            }
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_5 = li.pl - li.icxm("idym", icxi(int ), (int)82)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == li.icxm("idyn", icxp(int ), (int)96)) break;
                v11 /* !! */  = (long)li.icxm("idyo", icxp(int ), (int)97);
            }
            li.tempTextureView.close();
            if (var2_4) ** GOTO lbl40
lbl96:
            // 2 sources

            if (var2_4 || var2_4) ** GOTO lbl40
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_6 = li.pl - li.icxm("idyp", icxi(int ), (int)83)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == li.icxm("idyq", icxp(int ), (int)98)) break;
                v12 /* !! */  = (long)li.icxm("idyr", icxp(int ), (int)99);
            }
            if (li.tempTexture == null) ** GOTO lbl135
            if (var2_4 || var2_4) ** GOTO lbl40
            v13 /* !! */  = li.pl;
            if (true) ** GOTO lbl108
            block115: while (true) {
                v13 /* !! */  = (long)(v14 - li.icxm("idys", icxi(int ), (int)84));
lbl108:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1568944875: {
                        break block115;
                    }
                    case -1075872258: {
                        v14 = li.icxm("idyt", icxi(int ), (int)85);
                        continue block115;
                    }
                    case -534122988: {
                        v14 = li.icxm("idyu", icxi(int ), (int)86);
                        continue block115;
                    }
                }
                break;
            }
            v15 /* !! */  = li.pl;
            if (true) ** GOTO lbl121
            block116: while (true) {
                v15 /* !! */  = (long)(v16 - li.icxm("idyv", icxi(int ), (int)87));
lbl121:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -1568944875: {
                        break block116;
                    }
                    case 800706934: {
                        v16 = li.icxm("idyw", icxi(int ), (int)88);
                        continue block116;
                    }
                    case 1138012864: {
                        v16 = li.icxm("idyx", icxi(int ), (int)89);
                        continue block116;
                    }
                    case 2079915589: {
                        v16 = li.icxm("idyy", icxi(int ), (int)90);
                        continue block116;
                    }
                }
                break;
            }
            li.tempTexture.close();
            if (var2_4) ** GOTO lbl40
lbl135:
            // 2 sources

            if (var2_4 || var2_4) ** GOTO lbl40
            v17 /* !! */  = li.pl;
            if (true) ** GOTO lbl140
            block117: while (true) {
                v17 /* !! */  = (long)(v18 - li.icxm("idyz", icxi(int ), (int)91));
lbl140:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -1593693020: {
                        v18 = li.icxm("idza", icxi(int ), (int)92);
                        continue block117;
                    }
                    case -1568944875: {
                        break block117;
                    }
                    case 339831507: {
                        v18 = li.icxm("idzb", icxi(int ), (int)93);
                        continue block117;
                    }
                    case 1254610213: {
                        v18 = li.icxm("idzc", icxi(int ), (int)94);
                        continue block117;
                    }
                }
                break;
            }
            v19 = RenderSystem.getDevice();
            v20 /* !! */  = li.pl;
            if (true) ** GOTO lbl157
            block118: while (true) {
                v20 /* !! */  = (long)(li.icxm("idze", icxi(int ), (int)96) - li.icxm("idzd", icxi(int ), (int)95));
lbl157:
                // 2 sources

                switch ((int)v20 /* !! */ ) {
                    case -1753914942: {
                        continue block118;
                    }
                    case -1568944875: {
                        break block118;
                    }
                }
                break;
            }
            v21 = (Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$ensureTextures$2(), ()Ljava/lang/String;)();
            v22 = li.icxm("idzf", icxp(int ), (int)100);
            v23 /* !! */  = li.pl;
            if (true) ** GOTO lbl168
            block119: while (true) {
                v23 /* !! */  = (long)(li.icxm("idzh", icxi(int ), (int)98) - li.icxm("idzg", icxi(int ), (int)97));
lbl168:
                // 2 sources

                switch ((int)v23 /* !! */ ) {
                    case -1568944875: {
                        break block119;
                    }
                    case -1524338853: {
                        continue block119;
                    }
                }
                break;
            }
            v24 = li.icxm("idzi", icxp(int ), (int)101);
            v25 = li.icxm("idzj", icxp(int ), (int)102);
            v26 /* !! */  = li.pl;
            if (true) ** GOTO lbl179
            block120: while (true) {
                v26 /* !! */  = (long)(v27 - li.icxm("idzk", icxi(int ), (int)99));
lbl179:
                // 2 sources

                switch ((int)v26 /* !! */ ) {
                    case -1568944875: {
                        break block120;
                    }
                    case -759957623: {
                        v27 = li.icxm("idzl", icxi(int ), (int)100);
                        continue block120;
                    }
                    case 242110231: {
                        v27 = li.icxm("idzm", icxi(int ), (int)101);
                        continue block120;
                    }
                }
                break;
            }
            v28 = v19.createTexture(v21, (int)v22, TextureFormat.RGBA8, var0, var1_1, (int)v24, (int)v25);
            v29 /* !! */  = li.pl;
            if (true) ** GOTO lbl193
            block121: while (true) {
                v29 /* !! */  = (long)(v30 - li.icxm("idzn", icxi(int ), (int)102));
lbl193:
                // 2 sources

                switch ((int)v29 /* !! */ ) {
                    case -2093605791: {
                        v30 = li.icxm("idzo", icxi(int ), (int)103);
                        continue block121;
                    }
                    case -1568944875: {
                        break block121;
                    }
                    case -1251444367: {
                        v30 = li.icxm("idzp", icxi(int ), (int)104);
                        continue block121;
                    }
                }
                break;
            }
            li.tempTexture = v28;
            if (var2_4 || var2_4) ** GOTO lbl40
            while (true) {
                if ((v31 /* !! */  = (cfr_temp_7 = li.pl - li.icxm("idzq", icxi(int ), (int)105)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v31 /* !! */  == li.icxm("idzr", icxp(int ), (int)103)) break;
                v31 /* !! */  = (long)li.icxm("idzs", icxp(int ), (int)104);
            }
            v32 = RenderSystem.getDevice();
            v33 /* !! */  = li.pl;
            if (true) ** GOTO lbl214
            block123: while (true) {
                v33 /* !! */  = (long)(v34 - li.icxm("idzt", icxi(int ), (int)106));
lbl214:
                // 2 sources

                switch ((int)v33 /* !! */ ) {
                    case -1568944875: {
                        break block123;
                    }
                    case -609070778: {
                        v34 = li.icxm("idzu", icxi(int ), (int)107);
                        continue block123;
                    }
                    case 267538589: {
                        v34 = li.icxm("idzv", icxi(int ), (int)108);
                        continue block123;
                    }
                    case 854249335: {
                        v34 = li.icxm("idzw", icxi(int ), (int)109);
                        continue block123;
                    }
                }
                break;
            }
            v35 /* !! */  = li.pl;
            if (true) ** GOTO lbl230
            block124: while (true) {
                v35 /* !! */  = (long)(v36 - li.icxm("idzx", icxi(int ), (int)110));
lbl230:
                // 2 sources

                switch ((int)v35 /* !! */ ) {
                    case -1568944875: {
                        break block124;
                    }
                    case 1128343490: {
                        v36 = li.icxm("idzy", icxi(int ), (int)111);
                        continue block124;
                    }
                    case 1886438243: {
                        v36 = li.icxm("idzz", icxi(int ), (int)112);
                        continue block124;
                    }
                    case 1991154272: {
                        v36 = li.icxm("ieaa", icxi(int ), (int)113);
                        continue block124;
                    }
                }
                break;
            }
            v37 = v32.createTextureView(li.tempTexture);
            v38 /* !! */  = li.pl;
            if (true) ** GOTO lbl247
            block125: while (true) {
                v38 /* !! */  = (long)(v39 - li.icxm("ieab", icxi(int ), (int)114));
lbl247:
                // 2 sources

                switch ((int)v38 /* !! */ ) {
                    case -1568944875: {
                        break block125;
                    }
                    case -561884928: {
                        v39 = li.icxm("ieac", icxi(int ), (int)115);
                        continue block125;
                    }
                    case -344892803: {
                        v39 = li.icxm("iead", icxi(int ), (int)116);
                        continue block125;
                    }
                }
                break;
            }
            li.tempTextureView = v37;
            if (var2_4 || var2_4) ** GOTO lbl40
            v40 /* !! */  = li.pl;
            if (true) ** GOTO lbl262
            block126: while (true) {
                v40 /* !! */  = (long)(v41 - li.icxm("ieae", icxi(int ), (int)117));
lbl262:
                // 2 sources

                switch ((int)v40 /* !! */ ) {
                    case -1568944875: {
                        break block126;
                    }
                    case 797312333: {
                        v41 = li.icxm("ieaf", icxi(int ), (int)118);
                        continue block126;
                    }
                    case 1450370203: {
                        v41 = li.icxm("ieag", icxi(int ), (int)119);
                        continue block126;
                    }
                }
                break;
            }
            li.lastWidth = var0;
            if (var2_4 || var2_4) ** GOTO lbl40
            while (true) {
                if ((v42 /* !! */  = (cfr_temp_8 = li.pl - li.icxm("ieah", icxi(int ), (int)120)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v42 /* !! */  == li.icxm("ieai", icxp(int ), (int)105)) break;
                v42 /* !! */  = (long)li.icxm("ieaj", icxp(int ), (int)106);
            }
            li.lastHeight = var1_1;
            if (!var2_4 && !var2_4) ** break;
            ** continue;
            return;
lbl282:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)li.icxm("ieak", icxp(int ), (int)107);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl407
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)li.icxm("ieal", icxp(int ), (int)108);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl342
                    break;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)li.icxm("ieam", icxp(int ), (int)109);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl347
            }
lbl298:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)li.icxm("iean", icxp(int ), (int)110);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl337
            }
lbl303:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)li.icxm("ieao", icxp(int ), (int)111);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl337
            }
lbl308:
            // 3 sources

            case 5: {
                var3_3 /* !! */  = (int)li.icxm("ieap", icxp(int ), (int)112);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl347
            }
lbl313:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)li.icxm("ieaq", icxp(int ), (int)113);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl337
            }
            case 7: {
                var3_3 /* !! */  = (int)li.icxm("iear", icxp(int ), (int)114);
                if (!var4_2) ** GOTO lbl282
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)li.icxm("ieas", icxp(int ), (int)115);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl356
            }
lbl327:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)li.icxm("ieat", icxp(int ), (int)116);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl378
            }
            case 10: {
                do {
                    var3_3 /* !! */  = (int)li.icxm("ieau", icxp(int ), (int)117);
                } while (!var4_2);
                throw null;
            }
lbl337:
            // 4 sources

            case 11: {
                var3_3 /* !! */  = (int)li.icxm("ieav", icxp(int ), (int)118);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl402
            }
lbl342:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)li.icxm("ieaw", icxp(int ), (int)119);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl365
            }
lbl347:
            // 4 sources

            case 13: {
                var3_3 /* !! */  = (int)li.icxm("ieax", icxp(int ), (int)120);
                if (!var4_2) ** GOTO lbl298
                throw null;
            }
lbl351:
            // 5 sources

            case 14: {
                var3_3 /* !! */  = (int)li.icxm("ieay", icxp(int ), (int)121);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl407
            }
lbl356:
            // 2 sources

            case 15: {
                var3_3 /* !! */  = (int)li.icxm("ieaz", icxp(int ), (int)122);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl390
            }
            case 16: {
                var3_3 /* !! */  = (int)li.icxm("ieba", icxp(int ), (int)123);
                if (!var4_2) ** GOTO lbl303
                throw null;
            }
lbl365:
            // 2 sources

            case 17: {
                var3_3 /* !! */  = (int)li.icxm("iebb", icxp(int ), (int)124);
                if (!var4_2) ** GOTO lbl351
                throw null;
            }
            case 18: {
                var3_3 /* !! */  = (int)li.icxm("iebc", icxp(int ), (int)125);
                if (!var4_2) ** GOTO lbl313
                throw null;
            }
            case 19: {
                var3_3 /* !! */  = (int)li.icxm("iebd", icxp(int ), (int)126);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl390
            }
lbl378:
            // 2 sources

            case 20: {
                var3_3 /* !! */  = (int)li.icxm("iebe", icxp(int ), (int)127);
                if (!var4_2) ** GOTO lbl351
                throw null;
            }
            case 21: {
                var3_3 /* !! */  = (int)li.icxm("iebf", icxp(int ), (int)128);
                if (!var4_2) ** GOTO lbl308
                throw null;
            }
            case 22: {
                var3_3 /* !! */  = (int)li.icxm("iebg", icxp(int ), (int)129);
                if (!var4_2) ** GOTO lbl308
                throw null;
            }
lbl390:
            // 3 sources

            case 23: {
                var3_3 /* !! */  = (int)li.icxm("iebh", icxp(int ), (int)130);
                if (!var4_2) ** GOTO lbl347
                throw null;
            }
            case 24: {
                var3_3 /* !! */  = (int)li.icxm("iebi", icxp(int ), (int)131);
                if (!var4_2) ** GOTO lbl351
                throw null;
            }
            case 25: {
                var3_3 /* !! */  = (int)li.icxm("iebj", icxp(int ), (int)132);
                if (!var4_2) ** GOTO lbl351
                throw null;
            }
lbl402:
            // 2 sources

            case 26: {
                do {
                    var3_3 /* !! */  = (int)li.icxm("iebk", icxp(int ), (int)133);
                } while (!var4_2);
                throw null;
            }
lbl407:
            // 3 sources

            case 27: {
                var3_3 /* !! */  = (int)li.icxm("iebl", icxp(int ), (int)134);
                if (!var4_2) ** GOTO lbl327
                throw null;
            }
            case 28: 
        }
        var3_3 /* !! */  = (int)li.icxm("iebm", icxp(int ), (int)135);
        ** while (!var4_2)
lbl414:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$init$1() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = li.pl - li.icxm("iewp", icxi(int ), (int)202)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == li.icxm("iewq", icxp(int ), (int)307)) break;
            v0 /* !! */  = (long)li.icxm("iewr", icxp(int ), (int)308);
        }
        var2 = li.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = li.pl - li.icxm("iews", icxi(int ), (int)203)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == li.icxm("iewu", icxp(int ), (int)309)) break;
            v1 /* !! */  = (long)li.icxm("iewv", icxp(int ), (int)310);
        }
        var1_1 /* !! */  = li.b;
        v2 /* !! */  = li.pl;
        if (true) ** GOTO lbl19
        block12: while (true) {
            v2 /* !! */  = (long)(li.icxm("iewx", icxi(int ), (int)205) - li.icxm("ieww", icxi(int ), (int)204));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1568944875: {
                    break block12;
                }
                case 2119131072: {
                    continue block12;
                }
            }
            break;
        }
        var0_2 = li.a;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                return "phobia:saturation_uniform";
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)li.icxm("iewy", icxp(int ), (int)311);
                    if (!var2) break block4;
                    throw null;
                }
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)li.icxm("iewz", icxp(int ), (int)312);
                } while (!var2);
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)li.icxm("iexa", icxp(int ), (int)313);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)li.icxm("iexb", icxp(int ), (int)314);
        ** while (!var2)
lbl51:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iexv() {
        li.icxs[100] = -1411239696;
        li.icxs[101] = 99249901;
        li.icxs[102] = -295603532;
        li.icxs[103] = 1804229153;
        li.icxs[104] = -495159250;
        li.icxs[105] = -512134898;
        li.icxs[106] = -116083163;
        li.icxs[107] = -1469665542;
        li.icxs[108] = 1686426602;
        li.icxs[109] = 913806592;
        li.icxs[110] = -396075805;
        li.icxs[111] = 988917569;
        li.icxs[112] = 667764007;
        li.icxs[113] = 2048519940;
        li.icxs[114] = 126029414;
        li.icxs[115] = -958086435;
        li.icxs[116] = 91338577;
        li.icxs[117] = -565344772;
        li.icxs[118] = 1758725057;
        li.icxs[119] = 194518946;
        li.icxs[120] = -724257270;
        li.icxs[121] = 258090768;
        li.icxs[122] = 1349012516;
        li.icxs[123] = 2027810166;
        li.icxs[124] = -103090304;
        li.icxs[125] = -1743208802;
        li.icxs[126] = 1257628874;
        li.icxs[127] = -1277277588;
        li.icxs[128] = -1129115409;
        li.icxs[129] = -1886794642;
        li.icxs[130] = 2102258453;
        li.icxs[131] = 245824528;
        li.icxs[132] = -1664782487;
        li.icxs[133] = -813537494;
        li.icxs[134] = 570510582;
        li.icxs[135] = 1374970372;
        li.icxs[136] = -1113286439;
        li.icxs[137] = -1729527028;
        li.icxs[138] = -873096302;
        li.icxs[139] = 855539147;
        li.icxs[140] = 1406269765;
        li.icxs[141] = -425300007;
        li.icxs[142] = 2090984482;
        li.icxs[143] = 544089060;
        li.icxs[144] = -911490990;
        li.icxs[145] = -1986215411;
        li.icxs[146] = -171592934;
        li.icxs[147] = -1756648934;
        li.icxs[148] = -417557747;
        li.icxs[149] = -1058989225;
        li.icxs[150] = 1458218381;
        li.icxs[151] = 1543087898;
        li.icxs[152] = 1357780456;
        li.icxs[153] = 1267566151;
        li.icxs[154] = 555953359;
        li.icxs[155] = 157521734;
        li.icxs[156] = 858493697;
        li.icxs[157] = -724346555;
        li.icxs[158] = 494889051;
        li.icxs[159] = -1028556088;
        li.icxs[160] = 1561477290;
        li.icxs[161] = 844354757;
        li.icxs[162] = 1994078711;
        li.icxs[163] = 525254888;
        li.icxs[164] = -1059001307;
        li.icxs[165] = -945295176;
        li.icxs[166] = 473364501;
        li.icxs[167] = -417065822;
        li.icxs[168] = 1991314607;
        li.icxs[169] = -1013772987;
        li.icxs[170] = 1476289148;
        li.icxs[171] = -87499149;
        li.icxs[172] = -1684045121;
        li.icxs[173] = 182680248;
        li.icxs[174] = 2025307431;
        li.icxs[175] = -93679757;
        li.icxs[176] = -1104443505;
        li.icxs[177] = -306246470;
        li.icxs[178] = -1697696403;
        li.icxs[179] = 1668614568;
        li.icxs[180] = -770273061;
        li.icxs[181] = 357117122;
        li.icxs[182] = -1479477919;
        li.icxs[183] = 32029080;
        li.icxs[184] = -1183306520;
        li.icxs[185] = 74653643;
        li.icxs[186] = -2086934292;
        li.icxs[187] = -1963226536;
        li.icxs[188] = 1906679419;
        li.icxs[189] = 757455317;
        li.icxs[190] = -621620687;
        li.icxs[191] = -135615893;
        li.icxs[192] = -1824429561;
        li.icxs[193] = -266597334;
        li.icxs[194] = -1405130953;
        li.icxs[195] = 2057503491;
        li.icxs[196] = 1526434613;
        li.icxs[197] = 1893958443;
        li.icxs[198] = 1181627739;
        li.icxs[199] = -938674784;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$ensureTextures$2() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = li.pl - li.icxm("iewd", icxi(int ), (int)197)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == li.icxm("iewe", icxp(int ), (int)301)) break;
            v0 /* !! */  = (long)li.icxm("iewf", icxp(int ), (int)302);
        }
        var2 = li.c;
        v1 /* !! */  = li.pl;
        if (true) ** GOTO lbl12
        block15: while (true) {
            v1 /* !! */  = (long)(li.icxm("iewh", icxi(int ), (int)199) - li.icxm("iewg", icxi(int ), (int)198));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1568944875: {
                    break block15;
                }
                case -574819432: {
                    continue block15;
                }
            }
            break;
        }
        var1_1 /* !! */  = li.b;
        v2 /* !! */  = li.pl;
        if (true) ** GOTO lbl22
        block16: while (true) {
            v2 /* !! */  = (long)(li.icxm("iewk", icxi(int ), (int)201) - li.icxm("iewi", icxi(int ), (int)200));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1568944875: {
                    break block16;
                }
                case 664620270: {
                    continue block16;
                }
            }
            break;
        }
        var0_2 = li.a;
        if (var2) {
            throw null;
lbl30:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl33:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return "phobia:saturation_temp";
            }
lbl37:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)li.icxm("iewl", icxp(int ), (int)303);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl47
                    break;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)li.icxm("iewm", icxp(int ), (int)304);
                if (!var2) ** GOTO lbl37
                throw null;
            }
lbl47:
            // 2 sources

            case 2: {
                do {
                    var1_1 /* !! */  = (int)li.icxm("iewn", icxp(int ), (int)305);
                } while (!var2);
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)li.icxm("iewo", icxp(int ), (int)306);
        ** while (!var2)
lbl55:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iexu() {
        li.icxs[0] = 122066237;
        li.icxs[1] = -1123845846;
        li.icxs[2] = 73098872;
        li.icxs[3] = 488685502;
        li.icxs[4] = 1888161573;
        li.icxs[5] = 608892185;
        li.icxs[6] = 1405676555;
        li.icxs[7] = -2094640853;
        li.icxs[8] = -2088253277;
        li.icxs[9] = 151422574;
        li.icxs[10] = 2026844632;
        li.icxs[11] = 940513118;
        li.icxs[12] = -1517341852;
        li.icxs[13] = -466415199;
        li.icxs[14] = 935010621;
        li.icxs[15] = -2036074887;
        li.icxs[16] = -1519337168;
        li.icxs[17] = -860164037;
        li.icxs[18] = 1649878758;
        li.icxs[19] = -1234397521;
        li.icxs[20] = 809507665;
        li.icxs[21] = -1523858585;
        li.icxs[22] = -1081724437;
        li.icxs[23] = -1250217895;
        li.icxs[24] = 1957129606;
        li.icxs[25] = -1327814388;
        li.icxs[26] = 2094286952;
        li.icxs[27] = -123536355;
        li.icxs[28] = 951054508;
        li.icxs[29] = -58407301;
        li.icxs[30] = 678296343;
        li.icxs[31] = 391220995;
        li.icxs[32] = 1263841147;
        li.icxs[33] = 1332575105;
        li.icxs[34] = -1229729023;
        li.icxs[35] = -384724124;
        li.icxs[36] = 1340185962;
        li.icxs[37] = -1381318002;
        li.icxs[38] = 32818258;
        li.icxs[39] = 202835676;
        li.icxs[40] = -1477164345;
        li.icxs[41] = -1108743627;
        li.icxs[42] = 493806079;
        li.icxs[43] = -947826181;
        li.icxs[44] = 671388616;
        li.icxs[45] = 1245793404;
        li.icxs[46] = 1777620134;
        li.icxs[47] = -1361418626;
        li.icxs[48] = -1895778052;
        li.icxs[49] = -763307156;
        li.icxs[50] = 407336012;
        li.icxs[51] = 1178791015;
        li.icxs[52] = -80602521;
        li.icxs[53] = -327125442;
        li.icxs[54] = -1443042254;
        li.icxs[55] = 1928870107;
        li.icxs[56] = -566212669;
        li.icxs[57] = 536596283;
        li.icxs[58] = 1111835183;
        li.icxs[59] = -616651997;
        li.icxs[60] = 1059923957;
        li.icxs[61] = 1929886455;
        li.icxs[62] = 846267687;
        li.icxs[63] = -149488855;
        li.icxs[64] = -2105936931;
        li.icxs[65] = 49006908;
        li.icxs[66] = -590711378;
        li.icxs[67] = 1549894624;
        li.icxs[68] = -825527185;
        li.icxs[69] = 136849175;
        li.icxs[70] = -333270065;
        li.icxs[71] = 527747533;
        li.icxs[72] = 1282616093;
        li.icxs[73] = -2030489163;
        li.icxs[74] = 805296250;
        li.icxs[75] = -1329448066;
        li.icxs[76] = 676341451;
        li.icxs[77] = -1678878579;
        li.icxs[78] = -728407513;
        li.icxs[79] = 2126297313;
        li.icxs[80] = -1590721903;
        li.icxs[81] = -1265357099;
        li.icxs[82] = -36971714;
        li.icxs[83] = -204979246;
        li.icxs[84] = -1611690817;
        li.icxs[85] = 1529454646;
        li.icxs[86] = 1845484065;
        li.icxs[87] = -1222165310;
        li.icxs[88] = 853572942;
        li.icxs[89] = 2048995989;
        li.icxs[90] = 1545606479;
        li.icxs[91] = -357335365;
        li.icxs[92] = 1516993239;
        li.icxs[93] = 152186665;
        li.icxs[94] = -2034921926;
        li.icxs[95] = 455836207;
        li.icxs[96] = -404302406;
        li.icxs[97] = -659921982;
        li.icxs[98] = 1673718134;
        li.icxs[99] = -1766194256;
    }

    private static /* synthetic */ int icxp(int n2) {
        return icxr[n2] ^ icxs[n2];
    }

    private static /* synthetic */ void iexx() {
        li.icxs[300] = -1365312896;
        li.icxs[301] = 618695362;
        li.icxs[302] = -52243409;
        li.icxs[303] = -1917289373;
        li.icxs[304] = -1017610356;
        li.icxs[305] = -732672827;
        li.icxs[306] = 1040702124;
        li.icxs[307] = 422287737;
        li.icxs[308] = -269603845;
        li.icxs[309] = 1716158877;
        li.icxs[310] = -1873842664;
        li.icxs[311] = 1697797608;
        li.icxs[312] = -1797019623;
        li.icxs[313] = -500895665;
        li.icxs[314] = -259366143;
        li.icxs[315] = -1759298712;
        li.icxs[316] = -771392948;
        li.icxs[317] = -174937139;
        li.icxs[318] = 733789863;
        li.icxs[319] = -1090273552;
        li.icxs[320] = 311258213;
    }

    private static /* synthetic */ void ieyb() {
        li.icxk[200] = -4970845689524205935L;
        li.icxk[201] = 5422700268297202603L;
        li.icxk[202] = 6778189890479877440L;
        li.icxk[203] = 8028188798716016832L;
        li.icxk[204] = 4715489817363469214L;
        li.icxk[205] = 5971003373115507593L;
        li.icxk[206] = 3783302768294274167L;
        li.icxk[207] = -3005190103117553829L;
        li.icxk[208] = -4495885198201828188L;
        li.icxk[209] = 6480502083912402788L;
        li.icxk[210] = 1985762783936334579L;
        li.icxk[211] = 6738473212284584975L;
    }

    public li() {
    }

    private static /* synthetic */ void ieya() {
        li.icxk[100] = -8037174758739071573L;
        li.icxk[101] = 9046341052023672436L;
        li.icxk[102] = -5852511660529323118L;
        li.icxk[103] = 6409325837957429164L;
        li.icxk[104] = -1973060604612189316L;
        li.icxk[105] = 3063020333209465049L;
        li.icxk[106] = 5800039421776349752L;
        li.icxk[107] = 8483543230504097511L;
        li.icxk[108] = 1067193017444946760L;
        li.icxk[109] = 4088415272774845889L;
        li.icxk[110] = -5209366652540687156L;
        li.icxk[111] = 4432768413631611049L;
        li.icxk[112] = -4673318666602236156L;
        li.icxk[113] = -570899313286250796L;
        li.icxk[114] = 2980476517625501759L;
        li.icxk[115] = 8167156326010157199L;
        li.icxk[116] = 3539949901936090579L;
        li.icxk[117] = -8665463171804583549L;
        li.icxk[118] = -262581835403120498L;
        li.icxk[119] = 2747761109075388358L;
        li.icxk[120] = -1336931279122191277L;
        li.icxk[121] = -6793148032148207008L;
        li.icxk[122] = 6069951628600274389L;
        li.icxk[123] = 7231942298549064190L;
        li.icxk[124] = 6559030120894546048L;
        li.icxk[125] = 1568840228081072340L;
        li.icxk[126] = 7712430646665627621L;
        li.icxk[127] = 7633204953377265151L;
        li.icxk[128] = -3309008324412551520L;
        li.icxk[129] = 6784733289472993414L;
        li.icxk[130] = 7477936281995162764L;
        li.icxk[131] = 291986404855721458L;
        li.icxk[132] = -2331700157779765265L;
        li.icxk[133] = 8812993998873521110L;
        li.icxk[134] = -7815457462763295189L;
        li.icxk[135] = -664099647777988541L;
        li.icxk[136] = -7593751967798165338L;
        li.icxk[137] = -8974631200600323018L;
        li.icxk[138] = -2243044252320839106L;
        li.icxk[139] = 8758375286526629852L;
        li.icxk[140] = 5032514034947112381L;
        li.icxk[141] = -2025936633150098174L;
        li.icxk[142] = 2537199354568329807L;
        li.icxk[143] = 7965427680443600080L;
        li.icxk[144] = 5678515356824932645L;
        li.icxk[145] = -7724276032678985445L;
        li.icxk[146] = -6354566620775121228L;
        li.icxk[147] = -1685866382591790091L;
        li.icxk[148] = 5330301755794293785L;
        li.icxk[149] = 4528144611303330259L;
        li.icxk[150] = -1802349144074314948L;
        li.icxk[151] = 5794391092269237506L;
        li.icxk[152] = 7697897854349734817L;
        li.icxk[153] = -6233530818139007085L;
        li.icxk[154] = -6968334738265816687L;
        li.icxk[155] = -6084377693553958172L;
        li.icxk[156] = 5785593825539163866L;
        li.icxk[157] = -4977421456881613600L;
        li.icxk[158] = -4536476666145294174L;
        li.icxk[159] = 1425528187919546494L;
        li.icxk[160] = -2576028284436739040L;
        li.icxk[161] = -6468234221565442464L;
        li.icxk[162] = 8530995290998252315L;
        li.icxk[163] = -8302096992127620738L;
        li.icxk[164] = -397887835974152397L;
        li.icxk[165] = 1894727863939616985L;
        li.icxk[166] = 1322979926471852764L;
        li.icxk[167] = 3427153535344906314L;
        li.icxk[168] = -8315203132737378255L;
        li.icxk[169] = 377905739582270681L;
        li.icxk[170] = 3030053490364918499L;
        li.icxk[171] = 4455404021869753593L;
        li.icxk[172] = -3146261446315048976L;
        li.icxk[173] = 5302037052695158598L;
        li.icxk[174] = -3791232491448620681L;
        li.icxk[175] = -8678219051438717905L;
        li.icxk[176] = -8229623673871355114L;
        li.icxk[177] = -4827563914389689250L;
        li.icxk[178] = 8679328472026138947L;
        li.icxk[179] = 7157677665655471463L;
        li.icxk[180] = -7818718009888219014L;
        li.icxk[181] = -4147304327297971259L;
        li.icxk[182] = 6568423826659772051L;
        li.icxk[183] = 295175076572134358L;
        li.icxk[184] = 5219808429522564802L;
        li.icxk[185] = -6107841837515510607L;
        li.icxk[186] = -1146596261314404090L;
        li.icxk[187] = 8031856338628283171L;
        li.icxk[188] = 5342986200271009518L;
        li.icxk[189] = 372451371955381646L;
        li.icxk[190] = 3047840381573532572L;
        li.icxk[191] = 5341771858296137617L;
        li.icxk[192] = -6515260997708632402L;
        li.icxk[193] = 2238086390512775921L;
        li.icxk[194] = 8505778387070563867L;
        li.icxk[195] = 3391690161421737927L;
        li.icxk[196] = 195716998573771660L;
        li.icxk[197] = 4252329743768698704L;
        li.icxk[198] = 3831313309333621274L;
        li.icxk[199] = 1333421553166889510L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void applyWithCopy(float var0) {
        v0 /* !! */  = li.pl;
        if (true) ** GOTO lbl5
        block58: while (true) {
            v0 /* !! */  = (long)(v1 - li.icxm("iedl", icxi(int ), (int)121));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1568944875: {
                    break block58;
                }
                case -1542349646: {
                    v1 = li.icxm("iedm", icxi(int ), (int)122);
                    continue block58;
                }
                case -1079500644: {
                    v1 = li.icxm("iedn", icxi(int ), (int)123);
                    continue block58;
                }
                case 472360474: {
                    v1 = li.icxm("iedo", icxi(int ), (int)124);
                    continue block58;
                }
            }
            break;
        }
        var7_1 = li.c;
        v2 /* !! */  = li.pl;
        if (true) ** GOTO lbl22
        block59: while (true) {
            v2 /* !! */  = (long)(v3 - li.icxm("iedp", icxi(int ), (int)125));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1568944875: {
                    break block59;
                }
                case -457774460: {
                    v3 = li.icxm("iedq", icxi(int ), (int)126);
                    continue block59;
                }
                case 1684988212: {
                    v3 = li.icxm("iedr", icxi(int ), (int)127);
                    continue block59;
                }
            }
            break;
        }
        var6_2 /* !! */  = li.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = li.pl - li.icxm("ieds", icxi(int ), (int)128)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == li.icxm("iedt", icxp(int ), (int)186)) {
                var5_3 = li.a;
                if (var7_1) {
                    throw null;
                }
                break;
            }
            v4 /* !! */  = (long)li.icxm("iedu", icxp(int ), (int)187);
        }
        if (var5_3 || var5_3) return;
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = li.pl - li.icxm("iedv", icxi(int ), (int)129)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == li.icxm("iedw", icxp(int ), (int)188)) {
                var1_4 = class_310.method_1551();
                if (var5_3) return;
                break;
            }
            v5 /* !! */  = (long)li.icxm("iedx", icxp(int ), (int)189);
        }
        if (var5_3) return;
        v6 /* !! */  = li.pl;
        if (true) ** GOTO lbl55
        block62: while (true) {
            v6 /* !! */  = (long)(v7 - li.icxm("iedy", icxi(int ), (int)130));
lbl55:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1573045450: {
                    v7 = li.icxm("iedz", icxi(int ), (int)131);
                    continue block62;
                }
                case -1568944875: {
                    break block62;
                }
                case -251641355: {
                    v7 = li.icxm("ieea", icxi(int ), (int)132);
                    continue block62;
                }
                case 333711940: {
                    v7 = li.icxm("ieeb", icxi(int ), (int)133);
                    continue block62;
                }
            }
            break;
        }
        if (var1_4.method_1522() == null) {
            if (var5_3 || var5_3) return;
            return;
        }
        if (var5_3 || var5_3) return;
        while (true) {
            block119: {
                if ((v8 /* !! */  = (cfr_temp_3 = li.pl - li.icxm("ieec", icxi(int ), (int)134)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  != li.icxm("ieed", icxp(int ), (int)190)) break block119;
                v9 = var1_4.method_1522();
                v10 /* !! */  = li.pl;
                if (true) ** GOTO lbl82
            }
            v8 /* !! */  = (long)li.icxm("ieee", icxp(int ), (int)191);
        }
        block64: while (true) {
            v10 /* !! */  = (long)(v11 - li.icxm("ieef", icxi(int ), (int)135));
lbl82:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1568944875: {
                    break block64;
                }
                case -1474776482: {
                    v11 = li.icxm("ieeg", icxi(int ), (int)136);
                    continue block64;
                }
                case -141681415: {
                    v11 = li.icxm("ieeh", icxi(int ), (int)137);
                    continue block64;
                }
            }
            break;
        }
        var2_5 = v9.field_1482;
        if (var5_3) return;
        if (var6_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block65: while (true) {
            block120: {
                switch (cfr_temp_0 == -2147483648 ? var6_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var5_3) return;
                        while (true) {
                            if ((v12 /* !! */  = (cfr_temp_4 = li.pl - li.icxm("ieei", icxi(int ), (int)138)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v12 /* !! */  != li.icxm("ieej", icxp(int ), (int)192)) ** GOTO lbl104
                            v13 = var1_4.method_1522();
                            ** GOTO lbl185
lbl104:
                            // 1 sources

                            v12 /* !! */  = (long)li.icxm("ieek", icxp(int ), (int)193);
                        }
                    }
                    case 0: {
                        var6_2 /* !! */  = (int)li.icxm("iels", icxp(int ), (int)219);
                        if (var7_1) {
                            throw null;
                        }
                    }
                    case 3: {
                        var6_2 /* !! */  = (int)li.icxm("ielw", icxp(int ), (int)222);
                        if (var7_1) {
                            throw null;
                        }
                    }
                    case 2: {
                        var6_2 /* !! */  = (int)li.icxm("ielv", icxp(int ), (int)221);
                        cfr_temp_0 = 17;
                        if (var7_1) {
                            throw null;
                        }
                        break block120;
                    }
                    case 5: {
                        var6_2 /* !! */  = (int)li.icxm("iely", icxp(int ), (int)224);
                        cfr_temp_0 = 1;
                        if (var7_1) {
                            throw null;
                        }
                        break block120;
                    }
                    case 9: {
                        var6_2 /* !! */  = (int)li.icxm("iemi", icxp(int ), (int)228);
                        if (var7_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 10: {
                        var6_2 /* !! */  = (int)li.icxm("ieml", icxp(int ), (int)229);
                        cfr_temp_0 = 19;
                        if (var7_1) {
                            throw null;
                        }
                        break block120;
                    }
                    case 11: {
                        var6_2 /* !! */  = (int)li.icxm("ieny", icxp(int ), (int)230);
                        cfr_temp_0 = 7;
                        if (var7_1) {
                            throw null;
                        }
                        break block120;
                    }
                    case 14: {
                        var6_2 /* !! */  = (int)li.icxm("ieog", icxp(int ), (int)233);
                        cfr_temp_0 = 21;
                        if (var7_1) {
                            throw null;
                        }
                        break block120;
                    }
                    case 15: {
                        ** GOTO lbl176
                    }
                    case 18: {
                        do {
                            var6_2 /* !! */  = (int)li.icxm("ieok", icxp(int ), (int)237);
                        } while (!var7_1);
                        throw null;
                    }
                    case 19: {
                        var6_2 /* !! */  = (int)li.icxm("ieol", icxp(int ), (int)238);
                        if (var7_1) {
                            throw null;
                        }
                    }
                    case 12: {
                        var6_2 /* !! */  = (int)li.icxm("ieoa", icxp(int ), (int)231);
                        cfr_temp_0 = 17;
                        if (var7_1) {
                            throw null;
                        }
                        break block120;
                    }
                    case 20: {
                        var6_2 /* !! */  = (int)li.icxm("ieom", icxp(int ), (int)239);
                        cfr_temp_0 = 8;
                        if (var7_1) {
                            throw null;
                        }
                        break block120;
                    }
                    case 22: lbl-1000:
                    // 2 sources

                    {
                        var6_2 /* !! */  = (int)li.icxm("ieor", icxp(int ), (int)241);
                        if (var7_1) {
                            throw null;
                        }
lbl176:
                        // 3 sources

                        var6_2 /* !! */  = (int)li.icxm("ieoh", icxp(int ), (int)234);
                        if (var7_1) {
                            throw null;
                        }
                    }
                    case 21: {
                        var6_2 /* !! */  = (int)li.icxm("ieop", icxp(int ), (int)240);
                        cfr_temp_0 = 16;
                        if (var7_1) {
                            throw null;
                        }
                        break block120;
                    }
lbl185:
                    // 1 sources

                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_5 = li.pl - li.icxm("ieel", icxi(int ), (int)139)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  == li.icxm("ieem", icxp(int ), (int)194)) {
                            var3_6 = v13.field_1481;
                            if (var5_3) return;
                            break;
                        }
                        v14 /* !! */  = (long)li.icxm("ieen", icxp(int ), (int)195);
                    }
                    if (var5_3) return;
                    while (true) {
                        if ((v15 /* !! */  = (cfr_temp_6 = li.pl - li.icxm("ieeo", icxi(int ), (int)140)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v15 /* !! */  == li.icxm("ieep", icxp(int ), (int)196)) {
                            li.ensureTextures(var2_5, var3_6);
                            if (var5_3) return;
                            break;
                        }
                        v15 /* !! */  = (long)li.icxm("ieeq", icxp(int ), (int)197);
                    }
                    if (var5_3) return;
                    while (true) {
                        if ((v16 /* !! */  = (cfr_temp_7 = li.pl - li.icxm("ieer", icxi(int ), (int)141)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v16 /* !! */  == li.icxm("iees", icxp(int ), (int)198)) break;
                        v16 /* !! */  = (long)li.icxm("ieet", icxp(int ), (int)199);
                    }
                    v17 = RenderSystem.getDevice();
                    while (true) {
                        if ((v18 /* !! */  = (cfr_temp_8 = li.pl - li.icxm("ieeu", icxi(int ), (int)142)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v18 /* !! */  == li.icxm("ieev", icxp(int ), (int)200)) {
                            var4_7 = v17.createCommandEncoder();
                            if (var5_3) return;
                            break;
                        }
                        v18 /* !! */  = (long)li.icxm("ieew", icxp(int ), (int)201);
                    }
                    if (var5_3) return;
                    while (true) {
                        if ((v19 /* !! */  = (cfr_temp_9 = li.pl - li.icxm("ieex", icxi(int ), (int)143)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                        if (v19 /* !! */  == li.icxm("ieey", icxp(int ), (int)202)) break;
                        v19 /* !! */  = (long)li.icxm("ieez", icxp(int ), (int)203);
                    }
                    v20 = var1_4.method_1522();
                    while (true) {
                        if ((v21 /* !! */  = (cfr_temp_10 = li.pl - li.icxm("iefa", icxi(int ), (int)144)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                        if (v21 /* !! */  == li.icxm("iefb", icxp(int ), (int)204)) break;
                        v21 /* !! */  = (long)li.icxm("iefc", icxp(int ), (int)205);
                    }
                    v22 = v20.method_30277();
                    while (true) {
                        if ((v23 /* !! */  = (cfr_temp_11 = li.pl - li.icxm("iefd", icxi(int ), (int)145)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                        if (v23 /* !! */  != li.icxm("iefe", icxp(int ), (int)206)) ** GOTO lbl240
                        v24 = li.icxm("iefg", icxp(int ), (int)208);
                        v25 = li.icxm("iefh", icxp(int ), (int)209);
                        v26 = li.icxm("iefi", icxp(int ), (int)210);
                        v27 = li.icxm("iefj", icxp(int ), (int)211);
                        v28 = li.icxm("iefk", icxp(int ), (int)212);
                        v29 /* !! */  = li.pl;
                        if (true) ** GOTO lbl244
lbl240:
                        // 1 sources

                        v23 /* !! */  = (long)li.icxm("ieff", icxp(int ), (int)207);
                    }
                    block75: while (true) {
                        v29 /* !! */  = (long)(v30 - li.icxm("iekq", icxi(int ), (int)146));
lbl244:
                        // 2 sources

                        switch ((int)v29 /* !! */ ) {
                            case -1568944875: {
                                break block75;
                            }
                            case -871404405: {
                                v30 = li.icxm("iekr", icxi(int ), (int)147);
                                continue block75;
                            }
                            case 1225417270: {
                                v30 = li.icxm("ieks", icxi(int ), (int)148);
                                continue block75;
                            }
                        }
                        break;
                    }
                    var4_7.copyTextureToTexture(v22, li.tempTexture, (int)v24, (int)v25, (int)v26, (int)v27, (int)v28, var2_5, var3_6);
                    if (var5_3 || var5_3) return;
                    while (true) {
                        if ((v31 /* !! */  = (cfr_temp_12 = li.pl - li.icxm("iekw", icxi(int ), (int)149)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                        if (v31 /* !! */  == li.icxm("iekx", icxp(int ), (int)213)) break;
                        v31 /* !! */  = (long)li.icxm("iela", icxp(int ), (int)214);
                    }
                    v32 = var1_4.method_1522();
                    while (true) {
                        if ((v33 /* !! */  = (cfr_temp_13 = li.pl - li.icxm("ielb", icxi(int ), (int)150)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                        if (v33 /* !! */  != li.icxm("ielc", icxp(int ), (int)215)) ** GOTO lbl267
                        v34 = v32.method_71639();
                        v35 /* !! */  = li.pl;
                        if (true) ** GOTO lbl271
lbl267:
                        // 1 sources

                        v33 /* !! */  = (long)li.icxm("ield", icxp(int ), (int)216);
                    }
                    block78: while (true) {
                        v35 /* !! */  = (long)(v36 - li.icxm("iele", icxi(int ), (int)151));
lbl271:
                        // 2 sources

                        switch ((int)v35 /* !! */ ) {
                            case -1568944875: {
                                break block78;
                            }
                            case 288117341: {
                                v36 = li.icxm("ielf", icxi(int ), (int)152);
                                continue block78;
                            }
                            case 695521401: {
                                v36 = li.icxm("ielg", icxi(int ), (int)153);
                                continue block78;
                            }
                            case 758360734: {
                                v36 = li.icxm("ieli", icxi(int ), (int)154);
                                continue block78;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v37 /* !! */  = (cfr_temp_14 = li.pl - li.icxm("ielm", icxi(int ), (int)155)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                        if (v37 /* !! */  == li.icxm("ielo", icxp(int ), (int)217)) {
                            li.apply(v34, li.tempTextureView, var0);
                            if (var5_3) return;
                            break;
                        }
                        v37 /* !! */  = (long)li.icxm("ielq", icxp(int ), (int)218);
                    }
                    if (!var5_3) return;
                    return;
                    case 1: {
                        var6_2 /* !! */  = (int)li.icxm("ielt", icxp(int ), (int)220);
                        if (var7_1) {
                            throw null;
                        }
                    }
                    case 6: {
                        var6_2 /* !! */  = (int)li.icxm("ielz", icxp(int ), (int)225);
                        if (var7_1) {
                            throw null;
                        }
                    }
                    case 13: {
                        var6_2 /* !! */  = (int)li.icxm("ieob", icxp(int ), (int)232);
                        if (var7_1) {
                            throw null;
                        }
                    }
                    case 17: {
                        var6_2 /* !! */  = (int)li.icxm("ieoj", icxp(int ), (int)236);
                        cfr_temp_0 = 1;
                        if (var7_1) {
                            throw null;
                        }
                        break block120;
                    }
                    case 4: {
                        var6_2 /* !! */  = (int)li.icxm("ielx", icxp(int ), (int)223);
                        if (var7_1) {
                            throw null;
                        }
                    }
                    case 7: {
                        var6_2 /* !! */  = (int)li.icxm("iemb", icxp(int ), (int)226);
                        cfr_temp_0 = 4;
                        if (var7_1) {
                            throw null;
                        }
                        break block120;
                    }
                    case 8: {
                        var6_2 /* !! */  = (int)li.icxm("iemf", icxp(int ), (int)227);
                        if (var7_1) {
                            throw null;
                        }
                    }
                    case 16: 
                }
                ** GOTO lbl330
            }
            do {
                if (true) continue block65;
lbl330:
                // 2 sources

                var6_2 /* !! */  = (int)li.icxm("ieoi", icxp(int ), (int)235);
                cfr_temp_0 = 8;
            } while (!var7_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void iexp() {
        li.icxr[0] = -122066238;
        li.icxr[1] = -108799090;
        li.icxr[2] = 73098873;
        li.icxr[3] = -1358460964;
        li.icxr[4] = -1888161574;
        li.icxr[5] = -412958197;
        li.icxr[6] = 1405676554;
        li.icxr[7] = -1895835163;
        li.icxr[8] = 2088253276;
        li.icxr[9] = -2061269162;
        li.icxr[10] = -2026844633;
        li.icxr[11] = -113771566;
        li.icxr[12] = 1517341851;
        li.icxr[13] = 303985379;
        li.icxr[14] = -935010622;
        li.icxr[15] = -1915783730;
        li.icxr[16] = 1519337167;
        li.icxr[17] = -1116847222;
        li.icxr[18] = -1649878759;
        li.icxr[19] = -836153039;
        li.icxr[20] = -809507666;
        li.icxr[21] = 1933908397;
        li.icxr[22] = 1081724436;
        li.icxr[23] = -846516062;
        li.icxr[24] = 1957129607;
        li.icxr[25] = -2040074434;
        li.icxr[26] = -2094286953;
        li.icxr[27] = 109725501;
        li.icxr[28] = 951054509;
        li.icxr[29] = -1777073242;
        li.icxr[30] = 678296343;
        li.icxr[31] = -391220996;
        li.icxr[32] = 1826591684;
        li.icxr[33] = 1332575105;
        li.icxr[34] = 1229729022;
        li.icxr[35] = 720263137;
        li.icxr[36] = 1340185978;
        li.icxr[37] = -1381318001;
        li.icxr[38] = 2036014399;
        li.icxr[39] = 202835672;
        li.icxr[40] = -1477164345;
        li.icxr[41] = 1108743626;
        li.icxr[42] = 1868867043;
        li.icxr[43] = -947826182;
        li.icxr[44] = 841331118;
        li.icxr[45] = 1245793364;
        li.icxr[46] = -1777620135;
        li.icxr[47] = 334247880;
        li.icxr[48] = 1895778051;
        li.icxr[49] = 506865969;
        li.icxr[50] = -407336013;
        li.icxr[51] = 1321526371;
        li.icxr[52] = 80602520;
        li.icxr[53] = -74621550;
        li.icxr[54] = 1443042253;
        li.icxr[55] = 1724314453;
        li.icxr[56] = -566212789;
        li.icxr[57] = 536596282;
        li.icxr[58] = -709239810;
        li.icxr[59] = 616651996;
        li.icxr[60] = -1175829026;
        li.icxr[61] = 1929886461;
        li.icxr[62] = 846267699;
        li.icxr[63] = -149488849;
        li.icxr[64] = -2105936941;
        li.icxr[65] = 49006906;
        li.icxr[66] = -590711361;
        li.icxr[67] = 1549894629;
        li.icxr[68] = -825527192;
        li.icxr[69] = 136849182;
        li.icxr[70] = -333270055;
        li.icxr[71] = 527747525;
        li.icxr[72] = 1282616088;
        li.icxr[73] = -2030489153;
        li.icxr[74] = 805296241;
        li.icxr[75] = -1329448083;
        li.icxr[76] = 676341442;
        li.icxr[77] = -1678878568;
        li.icxr[78] = -728407509;
        li.icxr[79] = 2126297315;
        li.icxr[80] = -1590721890;
        li.icxr[81] = -1265357120;
        li.icxr[82] = -36971735;
        li.icxr[83] = -204979237;
        li.icxr[84] = -1611690838;
        li.icxr[85] = 1529454629;
        li.icxr[86] = -1845484066;
        li.icxr[87] = 206954367;
        li.icxr[88] = -853572943;
        li.icxr[89] = -1079601515;
        li.icxr[90] = -1545606480;
        li.icxr[91] = -2086250411;
        li.icxr[92] = 1516993238;
        li.icxr[93] = 1448021354;
        li.icxr[94] = -2034921925;
        li.icxr[95] = 1755232321;
        li.icxr[96] = 404302405;
        li.icxr[97] = 140345956;
        li.icxr[98] = -1673718135;
        li.icxr[99] = 1655036577;
    }

    private static /* synthetic */ void ieye() {
        li.icxl[200] = -7021488895069565975L;
        li.icxl[201] = -8836626129404391015L;
        li.icxl[202] = 5933515343871145475L;
        li.icxl[203] = 6599108155714188534L;
        li.icxl[204] = -2387614145893637771L;
        li.icxl[205] = 1188912229227325704L;
        li.icxl[206] = -1620461663536217240L;
        li.icxl[207] = 6801202778961569652L;
        li.icxl[208] = 7836987122967151741L;
        li.icxl[209] = 7068339453510582760L;
        li.icxl[210] = 8606597631642778488L;
        li.icxl[211] = -6878436931573428014L;
    }

    static {
        icxr = new int[321];
        icxs = new int[321];
        li.iexp();
        li.iexr();
        li.iexs();
        li.iext();
        li.iexu();
        li.iexv();
        li.iexw();
        li.iexx();
        icxk = new long[212];
        icxl = new long[212];
        li.iexz();
        li.ieya();
        li.ieyb();
        li.ieyc();
        li.ieyd();
        li.ieye();
        PIPELINE_ID = class_2960.method_60655((String)"phobia", (String)"pipeline/saturation");
        VERTEX_SHADER = class_2960.method_60655((String)"phobia", (String)"saturation_vertex");
        FRAGMENT_SHADER = class_2960.method_60655((String)"phobia", (String)"saturation_fragment");
    }

    private static /* synthetic */ long icxi(int n2) {
        return icxk[n2] ^ icxl[n2];
    }

    /*
     * Exception decompiling
     */
    public static void apply(GpuTextureView var0, GpuTextureView var1_1, float var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [52[CATCHBLOCK]], but top level block is 2[SWITCH]
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

