/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector2f
 *  org.joml.Vector4f
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_243;
import net.minecraft.class_310;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector2f;
import org.joml.Vector4f;
import ruhack.phobia.ki;

public final class op {
    private static final Vector4f CLIP;
    private static float tickDelta;
    private static final class_310 MC;
    private static int[] kqoz;
    public static final int b;
    private static long[] kqpg;
    private static Matrix4f viewProjection;
    public static final boolean c;
    public static final boolean a;
    private static long[] kqph;
    private static int[] kqpa;
    private static class_243 cameraPos;
    private static final long sx = -7236103537810089302L;

    private static /* synthetic */ long kqpf(int n2) {
        return kqpg[n2] ^ kqph[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float getTickDelta() {
        v0 /* !! */  = op.sx;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(op.kqpb("kqrh", kqpf(int ), (int)34) - op.kqpb("kqrf", kqpf(int ), (int)33));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1347371094: {
                    continue block16;
                }
                case -1092494678: {
                    break block16;
                }
            }
            break;
        }
        var2 = op.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = op.sx - op.kqpb("kqrk", kqpf(int ), (int)35)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == op.kqpb("kqrm", kqoy(int ), (int)19)) break;
            v1 /* !! */  = (long)op.kqpb("kqrn", kqoy(int ), (int)20);
        }
        var1_1 /* !! */  = op.b;
        v2 /* !! */  = op.sx;
        if (true) ** GOTO lbl22
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - op.kqpb("kqrp", kqpf(int ), (int)36));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1092494678: {
                    break block18;
                }
                case -13688615: {
                    v3 = op.kqpb("kqrr", kqpf(int ), (int)37);
                    continue block18;
                }
                case 851453687: {
                    v3 = op.kqpb("kqrt", kqpf(int ), (int)38);
                    continue block18;
                }
                case 963794348: {
                    v3 = op.kqpb("kqru", kqpf(int ), (int)39);
                    continue block18;
                }
            }
            break;
        }
        var0_2 = op.a;
        if (var2) {
            throw null;
            return (float)op.kqpb("kqrz", kqrx(int ), (int)21);
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = op.sx - op.kqpb("kqsc", kqpf(int ), (int)40)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == op.kqpb("kqse", kqoy(int ), (int)22)) break;
                    v4 /* !! */  = (long)op.kqpb("kqsg", kqoy(int ), (int)23);
                }
                return op.tickDelta;
            }
lbl50:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)op.kqpb("kqsi", kqoy(int ), (int)24);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl59
            }
            case 1: {
                var1_1 /* !! */  = (int)op.kqpb("kqsj", kqoy(int ), (int)25);
                if (var2) {
                    throw null;
                }
            }
lbl59:
            // 4 sources

            case 2: {
                var1_1 /* !! */  = (int)op.kqpb("kqsk", kqoy(int ), (int)26);
                if (!var2) ** GOTO lbl50
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)op.kqpb("kqsm", kqoy(int ), (int)27);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void kqxv() {
        op.kqoz[0] = -1979632340;
        op.kqoz[1] = -1411329476;
        op.kqoz[2] = 21112439;
        op.kqoz[3] = 357639310;
        op.kqoz[4] = -1877069072;
        op.kqoz[5] = -1077957719;
        op.kqoz[6] = 1942282421;
        op.kqoz[7] = -1551719544;
        op.kqoz[8] = -1903568417;
        op.kqoz[9] = 1240784784;
        op.kqoz[10] = 2096535007;
        op.kqoz[11] = -1967979738;
        op.kqoz[12] = -1639292608;
        op.kqoz[13] = -1602583990;
        op.kqoz[14] = 894927012;
        op.kqoz[15] = 1055365180;
        op.kqoz[16] = 1818938136;
        op.kqoz[17] = -450284891;
        op.kqoz[18] = -1616542949;
        op.kqoz[19] = 513400231;
        op.kqoz[20] = -1048281652;
        op.kqoz[21] = 2004231056;
        op.kqoz[22] = -1589747599;
        op.kqoz[23] = -1596295003;
        op.kqoz[24] = -2118824937;
        op.kqoz[25] = -131868502;
        op.kqoz[26] = 541262080;
        op.kqoz[27] = 1357161140;
        op.kqoz[28] = -588361356;
        op.kqoz[29] = 724899106;
        op.kqoz[30] = 1778764967;
        op.kqoz[31] = -773871478;
        op.kqoz[32] = -2098791033;
        op.kqoz[33] = 383974412;
        op.kqoz[34] = -590951887;
        op.kqoz[35] = 1487181566;
        op.kqoz[36] = -1649209897;
        op.kqoz[37] = -1500338362;
        op.kqoz[38] = -1603576237;
        op.kqoz[39] = 569962190;
        op.kqoz[40] = 644718043;
        op.kqoz[41] = -1123288687;
        op.kqoz[42] = -513532285;
        op.kqoz[43] = 594268304;
        op.kqoz[44] = -904416465;
        op.kqoz[45] = -983025619;
        op.kqoz[46] = 1432920124;
        op.kqoz[47] = -1141220824;
        op.kqoz[48] = -1930665495;
        op.kqoz[49] = -1136980376;
        op.kqoz[50] = -967611370;
        op.kqoz[51] = 1628085025;
        op.kqoz[52] = -668054427;
        op.kqoz[53] = 1485573169;
        op.kqoz[54] = -2050114825;
        op.kqoz[55] = -1355744696;
        op.kqoz[56] = 1072094012;
        op.kqoz[57] = 1178933140;
        op.kqoz[58] = -1359265492;
        op.kqoz[59] = 1567482028;
        op.kqoz[60] = -2095943269;
        op.kqoz[61] = -5650932;
        op.kqoz[62] = -116788966;
        op.kqoz[63] = -937771732;
        op.kqoz[64] = -458939958;
        op.kqoz[65] = 204918857;
        op.kqoz[66] = -89314063;
        op.kqoz[67] = -1533364611;
        op.kqoz[68] = 1351067094;
        op.kqoz[69] = -1182263788;
        op.kqoz[70] = 1377269660;
        op.kqoz[71] = -1353409234;
        op.kqoz[72] = -144400231;
        op.kqoz[73] = 1104602270;
        op.kqoz[74] = -1036761269;
        op.kqoz[75] = 2009133993;
        op.kqoz[76] = -619025607;
        op.kqoz[77] = 160003200;
        op.kqoz[78] = 148495986;
    }

    public static /* synthetic */ CallSite kqpb(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void kqxw() {
        op.kqpa[0] = -1979632338;
        op.kqpa[1] = -1411329475;
        op.kqpa[2] = 21112437;
        op.kqpa[3] = -357639311;
        op.kqpa[4] = 61396044;
        op.kqpa[5] = 1077957718;
        op.kqpa[6] = 740517;
        op.kqpa[7] = 1551719543;
        op.kqpa[8] = 1163331807;
        op.kqpa[9] = 1240784789;
        op.kqpa[10] = 2096535006;
        op.kqpa[11] = -1967979738;
        op.kqpa[12] = -1639292599;
        op.kqpa[13] = -1602583991;
        op.kqpa[14] = 894927020;
        op.kqpa[15] = 1055365179;
        op.kqpa[16] = 1818938136;
        op.kqpa[17] = -450284892;
        op.kqpa[18] = -1616542946;
        op.kqpa[19] = -513400232;
        op.kqpa[20] = -842907972;
        op.kqpa[21] = 1215166199;
        op.kqpa[22] = 1589747598;
        op.kqpa[23] = -452198362;
        op.kqpa[24] = -2118824939;
        op.kqpa[25] = -131868504;
        op.kqpa[26] = 541262083;
        op.kqpa[27] = 1357161143;
        op.kqpa[28] = -588361355;
        op.kqpa[29] = 1837987173;
        op.kqpa[30] = 1778764960;
        op.kqpa[31] = -773871478;
        op.kqpa[32] = -2098791025;
        op.kqpa[33] = 383974410;
        op.kqpa[34] = -590951880;
        op.kqpa[35] = 1487181561;
        op.kqpa[36] = -1649209898;
        op.kqpa[37] = -1500338365;
        op.kqpa[38] = -1603576229;
        op.kqpa[39] = 569962188;
        op.kqpa[40] = 644718042;
        op.kqpa[41] = -1123288687;
        op.kqpa[42] = -582497911;
        op.kqpa[43] = 594268304;
        op.kqpa[44] = -904416465;
        op.kqpa[45] = -93833171;
        op.kqpa[46] = 1785241660;
        op.kqpa[47] = -2063967704;
        op.kqpa[48] = -1276354071;
        op.kqpa[49] = -1136980375;
        op.kqpa[50] = -967611387;
        op.kqpa[51] = 1628085030;
        op.kqpa[52] = -668054432;
        op.kqpa[53] = 1485573163;
        op.kqpa[54] = -2050114828;
        op.kqpa[55] = -1355744677;
        op.kqpa[56] = 1072094006;
        op.kqpa[57] = 1178933144;
        op.kqpa[58] = -1359265475;
        op.kqpa[59] = 1567482032;
        op.kqpa[60] = -2095943271;
        op.kqpa[61] = -5650929;
        op.kqpa[62] = -116788969;
        op.kqpa[63] = -937771721;
        op.kqpa[64] = -458939963;
        op.kqpa[65] = 204918872;
        op.kqpa[66] = -89314073;
        op.kqpa[67] = -1533364612;
        op.kqpa[68] = 1351067084;
        op.kqpa[69] = -1182263779;
        op.kqpa[70] = 1377269661;
        op.kqpa[71] = -1353409247;
        op.kqpa[72] = -144400231;
        op.kqpa[73] = 1104602264;
        op.kqpa[74] = -1036761250;
        op.kqpa[75] = 2009133993;
        op.kqpa[76] = -619025615;
        op.kqpa[77] = 160003213;
        op.kqpa[78] = 148495971;
    }

    static {
        kqoz = new int[79];
        kqpa = new int[79];
        op.kqxv();
        op.kqxw();
        kqpg = new long[67];
        kqph = new long[67];
        op.kqxx();
        op.kqxy();
        MC = class_310.method_1551();
        cameraPos = class_243.field_1353;
        CLIP = new Vector4f();
    }

    private static /* synthetic */ float kqrx(int n2) {
        return Float.intBitsToFloat(kqoz[n2] ^ kqpa[n2]);
    }

    private static /* synthetic */ void kqxy() {
        op.kqph[0] = 7426772955692117981L;
        op.kqph[1] = -1419243050442937643L;
        op.kqph[2] = -8361442204627479814L;
        op.kqph[3] = -8922718893412061316L;
        op.kqph[4] = -5959096440515791963L;
        op.kqph[5] = 9154911396453879851L;
        op.kqph[6] = 8440210487528342403L;
        op.kqph[7] = 4094605638681257711L;
        op.kqph[8] = 1657813069249747901L;
        op.kqph[9] = -4826762545120962908L;
        op.kqph[10] = -5656390555325956775L;
        op.kqph[11] = 8492084313592351443L;
        op.kqph[12] = 4581121378871849454L;
        op.kqph[13] = -8661280260110136257L;
        op.kqph[14] = -169856537650833447L;
        op.kqph[15] = -553832469033055503L;
        op.kqph[16] = -5098326682840750932L;
        op.kqph[17] = 7541430539194917982L;
        op.kqph[18] = -6560891407329426505L;
        op.kqph[19] = -7745016422068519810L;
        op.kqph[20] = 2400733520398186182L;
        op.kqph[21] = -5093498819619157311L;
        op.kqph[22] = 8336637401848125861L;
        op.kqph[23] = 579996141471527731L;
        op.kqph[24] = 562563015536171494L;
        op.kqph[25] = 4716953439148559834L;
        op.kqph[26] = 2306236013504063201L;
        op.kqph[27] = -7864592783736209310L;
        op.kqph[28] = -1447123768558051845L;
        op.kqph[29] = -8212144876587233797L;
        op.kqph[30] = 6004285937494587179L;
        op.kqph[31] = -4827979822633320062L;
        op.kqph[32] = -1697289680479472198L;
        op.kqph[33] = -6010888945318386812L;
        op.kqph[34] = -1102076251169872608L;
        op.kqph[35] = -1779050044973751343L;
        op.kqph[36] = -6932548724088532951L;
        op.kqph[37] = -4198398152901577794L;
        op.kqph[38] = 5755277721464247780L;
        op.kqph[39] = -4348855378651789925L;
        op.kqph[40] = -6014898107794837764L;
        op.kqph[41] = -6749821646448117870L;
        op.kqph[42] = 6512814430327786049L;
        op.kqph[43] = 4647884595206869216L;
        op.kqph[44] = -2593388243352189836L;
        op.kqph[45] = -8032699533768318318L;
        op.kqph[46] = -2933228138282974867L;
        op.kqph[47] = -1455468968193454600L;
        op.kqph[48] = -1906610862747040438L;
        op.kqph[49] = -309799513402810623L;
        op.kqph[50] = -4649253094353403615L;
        op.kqph[51] = -5752882725450074003L;
        op.kqph[52] = 1855883536834903971L;
        op.kqph[53] = -3434106741589519447L;
        op.kqph[54] = 8453810682799887615L;
        op.kqph[55] = -3694320223105971807L;
        op.kqph[56] = 2623662973707169181L;
        op.kqph[57] = -5267444466814280219L;
        op.kqph[58] = 4845510382392469547L;
        op.kqph[59] = 1488287201045494720L;
        op.kqph[60] = 892038035985230548L;
        op.kqph[61] = 8099662910142853257L;
        op.kqph[62] = -4948109335938967631L;
        op.kqph[63] = 9154573124253087544L;
        op.kqph[64] = 3509352546453345407L;
        op.kqph[65] = -4502506559466641093L;
        op.kqph[66] = 1393769986901465490L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private op() {
        var2_1 /* !! */  = op.b;
        super();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_1 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
                case 2: {
                    var2_1 /* !! */  = (int)op.kqpb("kqpe", kqoy(int ), (int)2);
                    ** GOTO lbl-1000
                }
                case 0: lbl-1000:
                // 2 sources

                {
                    var2_1 /* !! */  = (int)op.kqpb("kqpc", kqoy(int ), (int)0);
                }
                case 1: 
            }
            if (true) ** GOTO lbl18
            break;
        }
        while (true) {
            if (true) ** continue;
lbl18:
            // 2 sources

            var2_1 /* !! */  = (int)op.kqpb("kqpd", kqoy(int ), (int)1);
            cfr_temp_0 = 0;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void update(Matrix4f var0, Matrix4f var1_1, float var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = op.sx - op.kqpb("kqpi", kqpf(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == op.kqpb("kqpj", kqoy(int ), (int)3)) break;
            v0 /* !! */  = (long)op.kqpb("kqpk", kqoy(int ), (int)4);
        }
        var5_3 = op.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = op.sx - op.kqpb("kqpl", kqpf(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == op.kqpb("kqpm", kqoy(int ), (int)5)) break;
            v1 /* !! */  = (long)op.kqpb("kqpn", kqoy(int ), (int)6);
        }
        var4_4 = op.b;
        v2 /* !! */  = op.sx;
        if (true) ** GOTO lbl17
        block52: while (true) {
            v2 /* !! */  = (long)(v3 - op.kqpb("kqpo", kqpf(int ), (int)2));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1092494678: {
                    break block52;
                }
                case 547349371: {
                    v3 = op.kqpb("kqpp", kqpf(int ), (int)3);
                    continue block52;
                }
                case 1788542123: {
                    v3 = op.kqpb("kqpq", kqpf(int ), (int)4);
                    continue block52;
                }
            }
            break;
        }
        var3_5 = op.a;
        if (var5_3) {
            throw null;
lbl29:
            // 4 sources

            return;
        }
        if (var3_5 || var3_5) ** GOTO lbl29
        v4 /* !! */  = op.sx;
        if (true) ** GOTO lbl36
        block54: while (true) {
            v4 /* !! */  = (long)(v5 - op.kqpb("kqpr", kqpf(int ), (int)5));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1144915862: {
                    v5 = op.kqpb("kqps", kqpf(int ), (int)6);
                    continue block54;
                }
                case -1126253896: {
                    v5 = op.kqpb("kqpt", kqpf(int ), (int)7);
                    continue block54;
                }
                case -1092494678: {
                    break block54;
                }
            }
            break;
        }
        v6 /* !! */  = op.sx;
        if (true) ** GOTO lbl49
        block55: while (true) {
            v6 /* !! */  = (long)(v7 - op.kqpb("kqpu", kqpf(int ), (int)8));
lbl49:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1608507765: {
                    v7 = op.kqpb("kqpv", kqpf(int ), (int)9);
                    continue block55;
                }
                case -1092494678: {
                    break block55;
                }
                case -100673645: {
                    v7 = op.kqpb("kqpw", kqpf(int ), (int)10);
                    continue block55;
                }
            }
            break;
        }
        v8 = new Matrix4f((Matrix4fc)var0);
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_2 = op.sx - op.kqpb("kqpx", kqpf(int ), (int)11)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == op.kqpb("kqpy", kqoy(int ), (int)7)) break;
            v9 /* !! */  = (long)op.kqpb("kqpz", kqoy(int ), (int)8);
        }
        v10 = v8.mul((Matrix4fc)var1_1);
        v11 /* !! */  = op.sx;
        if (true) ** GOTO lbl69
        block57: while (true) {
            v11 /* !! */  = (long)(v12 - op.kqpb("kqqa", kqpf(int ), (int)12));
lbl69:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1092494678: {
                    break block57;
                }
                case -825889967: {
                    v12 = op.kqpb("kqqb", kqpf(int ), (int)13);
                    continue block57;
                }
                case 969456752: {
                    v12 = op.kqpb("kqqc", kqpf(int ), (int)14);
                    continue block57;
                }
            }
            break;
        }
        op.viewProjection = v10;
        if (var3_5 || var3_5) ** GOTO lbl29
        v13 /* !! */  = op.sx;
        if (true) ** GOTO lbl84
        block58: while (true) {
            v13 /* !! */  = (long)(op.kqpb("kqqe", kqpf(int ), (int)16) - op.kqpb("kqqd", kqpf(int ), (int)15));
lbl84:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1092494678: {
                    break block58;
                }
                case 474649142: {
                    continue block58;
                }
            }
            break;
        }
        v14 /* !! */  = op.sx;
        if (true) ** GOTO lbl93
        block59: while (true) {
            v14 /* !! */  = (long)(v15 - op.kqpb("kqqf", kqpf(int ), (int)17));
lbl93:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1092494678: {
                    break block59;
                }
                case 147077457: {
                    v15 = op.kqpb("kqqg", kqpf(int ), (int)18);
                    continue block59;
                }
                case 864256736: {
                    v15 = op.kqpb("kqqh", kqpf(int ), (int)19);
                    continue block59;
                }
            }
            break;
        }
        v16 = op.MC.field_1773;
        v17 /* !! */  = op.sx;
        if (true) ** GOTO lbl107
        block60: while (true) {
            v17 /* !! */  = (long)(op.kqpb("kqqj", kqpf(int ), (int)21) - op.kqpb("kqqi", kqpf(int ), (int)20));
lbl107:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -1092494678: {
                    break block60;
                }
                case -564858765: {
                    continue block60;
                }
            }
            break;
        }
        v18 = v16.method_19418();
        v19 /* !! */  = op.sx;
        if (true) ** GOTO lbl117
        block61: while (true) {
            v19 /* !! */  = (long)(v20 - op.kqpb("kqqk", kqpf(int ), (int)22));
lbl117:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -1092494678: {
                    break block61;
                }
                case -876778633: {
                    v20 = op.kqpb("kqql", kqpf(int ), (int)23);
                    continue block61;
                }
                case 2109248068: {
                    v20 = op.kqpb("kqqm", kqpf(int ), (int)24);
                    continue block61;
                }
            }
            break;
        }
        v21 = v18.method_71156();
        v22 /* !! */  = op.sx;
        if (true) ** GOTO lbl131
        block62: while (true) {
            v22 /* !! */  = (long)(v23 - op.kqpb("kqqn", kqpf(int ), (int)25));
lbl131:
            // 2 sources

            switch ((int)v22 /* !! */ ) {
                case -1454551549: {
                    v23 = op.kqpb("kqqo", kqpf(int ), (int)26);
                    continue block62;
                }
                case -1092494678: {
                    break block62;
                }
                case -188776588: {
                    v23 = op.kqpb("kqqp", kqpf(int ), (int)27);
                    continue block62;
                }
                case 1737552406: {
                    v23 = op.kqpb("kqqq", kqpf(int ), (int)28);
                    continue block62;
                }
            }
            break;
        }
        op.cameraPos = v21;
        if (var3_5 || var3_5) ** GOTO lbl29
        v24 /* !! */  = op.sx;
        if (true) ** GOTO lbl149
        block63: while (true) {
            v24 /* !! */  = (long)(v25 - op.kqpb("kqqr", kqpf(int ), (int)29));
lbl149:
            // 2 sources

            switch ((int)v24 /* !! */ ) {
                case -1350436721: {
                    v25 = op.kqpb("kqqs", kqpf(int ), (int)30);
                    continue block63;
                }
                case -1169117735: {
                    v25 = op.kqpb("kqqt", kqpf(int ), (int)31);
                    continue block63;
                }
                case -1092494678: {
                    break block63;
                }
                case 1253665729: {
                    v25 = op.kqpb("kqqu", kqpf(int ), (int)32);
                    continue block63;
                }
            }
            break;
        }
        op.tickDelta = var2_2;
        ** while (var3_5 || var3_5)
lbl163:
        // 1 sources

    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean project(double var0, double var2_1, double var4_2, Vector2f var6_3) {
        block60: {
            block59: {
                block58: {
                    var11_4 = op.c;
                    var10_5 /* !! */  = op.b;
                    var9_6 = op.a;
                    if (var11_4) {
                        throw null;
lbl6:
                        // 16 sources

                        return (boolean)op.kqpb("kqvs", kqoy(int ), (int)40);
                    }
                    if (var9_6 || var9_6) ** GOTO lbl6
                    if (op.viewProjection == null) break block58;
                    if (var9_6) ** GOTO lbl6
                    if (ki.hasUsableViewport()) break block59;
                    if (var9_6) ** GOTO lbl6
                }
                if (var9_6 || var9_6) ** GOTO lbl6
                return (boolean)op.kqpb("kqvu", kqoy(int ), (int)41);
            }
            if (var9_6 || var9_6) ** GOTO lbl6
            op.CLIP.set((float)(var0 - op.cameraPos.field_1352), (float)(var2_1 - op.cameraPos.field_1351), (float)(var4_2 - op.cameraPos.field_1350), 1.0f).mul((Matrix4fc)op.viewProjection);
            if (var9_6 || var9_6) ** GOTO lbl6
            if (!(op.CLIP.w <= op.kqpb("kqvy", kqrx(int ), (int)42))) break block60;
            if (var9_6) ** GOTO lbl6
            return (boolean)op.kqpb("kqwa", kqoy(int ), (int)43);
        }
        if (var9_6 || var9_6) ** GOTO lbl6
        var7_7 = op.CLIP.x / op.CLIP.w;
        if (var9_6 || var9_6) ** GOTO lbl6
        var8_8 = op.CLIP.y / op.CLIP.w;
        if (var9_6) ** GOTO lbl6
        if (var10_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var9_6) ** GOTO lbl6
                if (!Float.isFinite(var7_7)) ** GOTO lbl38
                if (var9_6) ** GOTO lbl6
                if (Float.isFinite(var8_8)) ** GOTO lbl40
                if (var9_6) ** GOTO lbl6
lbl38:
                // 2 sources

                if (var9_6 || var9_6) ** GOTO lbl6
                return (boolean)op.kqpb("kqwg", kqoy(int ), (int)44);
lbl40:
                // 1 sources

                if (var9_6 || var9_6) ** GOTO lbl6
                var6_3.set((var7_7 * op.kqpb("kqwj", kqrx(int ), (int)45) + op.kqpb("kqwk", kqrx(int ), (int)46)) * (float)ki.getFixedScaledWidth(), (float)((op.kqpb("kqwm", kqrx(int ), (int)47) - var8_8 * op.kqpb("kqwn", kqrx(int ), (int)48)) * (float)ki.getFixedScaledHeight()));
                if (!var9_6 && !var9_6) ** break;
                ** continue;
                return (boolean)op.kqpb("kqwp", kqoy(int ), (int)49);
            }
            case 0: {
                var10_5 /* !! */  = (int)op.kqpb("kqwq", kqoy(int ), (int)50);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl81
            }
            case 1: {
                var10_5 /* !! */  = (int)op.kqpb("kqwr", kqoy(int ), (int)51);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl56:
            // 3 sources

            case 2: {
                var10_5 /* !! */  = (int)op.kqpb("kqws", kqoy(int ), (int)52);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl95
            }
            case 3: {
                var10_5 /* !! */  = (int)op.kqpb("kqwt", kqoy(int ), (int)53);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl95
            }
            case 4: {
                var10_5 /* !! */  = (int)op.kqpb("kqwv", kqoy(int ), (int)54);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl71:
            // 2 sources

            case 5: {
                var10_5 /* !! */  = (int)op.kqpb("kqww", kqoy(int ), (int)55);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl105
            }
            case 6: {
                var10_5 /* !! */  = (int)op.kqpb("kqwy", kqoy(int ), (int)56);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl81:
            // 4 sources

            case 7: {
                var10_5 /* !! */  = (int)op.kqpb("kqwz", kqoy(int ), (int)57);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl86:
            // 2 sources

            case 8: {
                var10_5 /* !! */  = (int)op.kqpb("kqxa", kqoy(int ), (int)58);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 9: {
                var10_5 /* !! */  = (int)op.kqpb("kqxb", kqoy(int ), (int)59);
                if (var11_4) {
                    throw null;
                }
            }
lbl95:
            // 5 sources

            case 10: {
                var10_5 /* !! */  = (int)op.kqpb("kqxc", kqoy(int ), (int)60);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl100:
            // 2 sources

            case 11: {
                var10_5 /* !! */  = (int)op.kqpb("kqxd", kqoy(int ), (int)61);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl133
            }
lbl105:
            // 3 sources

            case 12: {
                var10_5 /* !! */  = (int)op.kqpb("kqxe", kqoy(int ), (int)62);
                if (!var11_4) ** GOTO lbl56
                throw null;
            }
lbl109:
            // 2 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_5 /* !! */  = (int)op.kqpb("kqxf", kqoy(int ), (int)63);
                    if (var11_4) {
                        throw null;
                    }
                    ** GOTO lbl133
                    break;
                }
            }
            case 14: {
                var10_5 /* !! */  = (int)op.kqpb("kqxg", kqoy(int ), (int)64);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl120:
            // 3 sources

            case 15: {
                var10_5 /* !! */  = (int)op.kqpb("kqxh", kqoy(int ), (int)65);
                if (!var11_4) ** GOTO lbl81
                throw null;
            }
lbl124:
            // 3 sources

            case 16: {
                var10_5 /* !! */  = (int)op.kqpb("kqxi", kqoy(int ), (int)66);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl161
            }
            case 17: {
                var10_5 /* !! */  = (int)op.kqpb("kqxj", kqoy(int ), (int)67);
                if (!var11_4) ** GOTO lbl105
                throw null;
            }
lbl133:
            // 4 sources

            case 18: {
                var10_5 /* !! */  = (int)op.kqpb("kqxk", kqoy(int ), (int)68);
                if (!var11_4) break;
                throw null;
            }
lbl137:
            // 2 sources

            case 19: {
                var10_5 /* !! */  = (int)op.kqpb("kqxl", kqoy(int ), (int)69);
                if (!var11_4) ** GOTO lbl81
                throw null;
            }
lbl141:
            // 2 sources

            case 20: {
                var10_5 /* !! */  = (int)op.kqpb("kqxm", kqoy(int ), (int)70);
                if (!var11_4) ** GOTO lbl120
                throw null;
            }
            case 21: {
                var10_5 /* !! */  = (int)op.kqpb("kqxn", kqoy(int ), (int)71);
                if (!var11_4) ** GOTO lbl100
                throw null;
            }
            case 22: {
                var10_5 /* !! */  = (int)op.kqpb("kqxo", kqoy(int ), (int)72);
                if (!var11_4) ** GOTO lbl71
                throw null;
            }
            case 23: {
                var10_5 /* !! */  = (int)op.kqpb("kqxp", kqoy(int ), (int)73);
                if (!var11_4) ** GOTO lbl120
                throw null;
            }
lbl157:
            // 2 sources

            case 24: {
                var10_5 /* !! */  = (int)op.kqpb("kqxq", kqoy(int ), (int)74);
                if (!var11_4) ** GOTO lbl86
                throw null;
            }
lbl161:
            // 3 sources

            case 25: {
                var10_5 /* !! */  = (int)op.kqpb("kqxr", kqoy(int ), (int)75);
                if (!var11_4) ** GOTO lbl109
                throw null;
            }
            case 26: {
                var10_5 /* !! */  = (int)op.kqpb("kqxs", kqoy(int ), (int)76);
                if (!var11_4) ** GOTO lbl56
                throw null;
            }
lbl169:
            // 2 sources

            case 27: {
                var10_5 /* !! */  = (int)op.kqpb("kqxt", kqoy(int ), (int)77);
                if (!var11_4) ** GOTO lbl124
                throw null;
            }
            case 28: 
        }
        var10_5 /* !! */  = (int)op.kqpb("kqxu", kqoy(int ), (int)78);
        ** while (!var11_4)
lbl176:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Vector2f project(class_243 var0) {
        v0 /* !! */  = op.sx;
        if (true) ** GOTO lbl5
        block53: while (true) {
            v0 /* !! */  = (long)(v1 - op.kqpb("kqsv", kqpf(int ), (int)41));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1092494678: {
                    break block53;
                }
                case 373209917: {
                    v1 = op.kqpb("kqsw", kqpf(int ), (int)42);
                    continue block53;
                }
                case 837749031: {
                    v1 = op.kqpb("kqsx", kqpf(int ), (int)43);
                    continue block53;
                }
            }
            break;
        }
        var4_1 = op.c;
        v2 /* !! */  = op.sx;
        if (true) ** GOTO lbl19
        block54: while (true) {
            v2 /* !! */  = (long)(v3 - op.kqpb("kqsy", kqpf(int ), (int)44));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1611551114: {
                    v3 = op.kqpb("kqta", kqpf(int ), (int)45);
                    continue block54;
                }
                case -1092494678: {
                    break block54;
                }
                case 1299756696: {
                    v3 = op.kqpb("kqtc", kqpf(int ), (int)46);
                    continue block54;
                }
                case 1873593411: {
                    v3 = op.kqpb("kqtd", kqpf(int ), (int)47);
                    continue block54;
                }
            }
            break;
        }
        var3_2 /* !! */  = op.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = op.sx - op.kqpb("kqti", kqpf(int ), (int)48)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == op.kqpb("kqtk", kqoy(int ), (int)28)) break;
            v4 /* !! */  = (long)op.kqpb("kqtm", kqoy(int ), (int)29);
        }
        var2_3 = op.a;
        if (var4_1) {
            throw null;
lbl41:
            // 4 sources

            return null;
        }
        if (var2_3 || var2_3) ** GOTO lbl41
        v5 /* !! */  = op.sx;
        if (true) ** GOTO lbl48
        block57: while (true) {
            v5 /* !! */  = (long)(v6 - op.kqpb("kqto", kqpf(int ), (int)49));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1904024659: {
                    v6 = op.kqpb("kqtp", kqpf(int ), (int)50);
                    continue block57;
                }
                case -1092494678: {
                    break block57;
                }
                case -1035315522: {
                    v6 = op.kqpb("kqtq", kqpf(int ), (int)51);
                    continue block57;
                }
            }
            break;
        }
        v7 /* !! */  = op.sx;
        if (true) ** GOTO lbl61
        block58: while (true) {
            v7 /* !! */  = (long)(v8 - op.kqpb("kqtt", kqpf(int ), (int)52));
lbl61:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1092494678: {
                    break block58;
                }
                case -623806647: {
                    v8 = op.kqpb("kqtv", kqpf(int ), (int)53);
                    continue block58;
                }
                case -357383435: {
                    v8 = op.kqpb("kqtw", kqpf(int ), (int)54);
                    continue block58;
                }
                case 1065306791: {
                    v8 = op.kqpb("kqty", kqpf(int ), (int)55);
                    continue block58;
                }
            }
            break;
        }
        var1_4 = new Vector2f();
        if (var2_3 || var2_3) ** GOTO lbl41
        v9 /* !! */  = op.sx;
        if (true) ** GOTO lbl79
        block59: while (true) {
            v9 /* !! */  = (long)(op.kqpb("kqud", kqpf(int ), (int)57) - op.kqpb("kqub", kqpf(int ), (int)56));
lbl79:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1092494678: {
                    break block59;
                }
                case -94277156: {
                    continue block59;
                }
            }
            break;
        }
        v10 = var0.field_1352;
        v11 /* !! */  = op.sx;
        if (true) ** GOTO lbl89
        block60: while (true) {
            v11 /* !! */  = (long)(op.kqpb("kquf", kqpf(int ), (int)59) - op.kqpb("kque", kqpf(int ), (int)58));
lbl89:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1092494678: {
                    break block60;
                }
                case 1554877943: {
                    continue block60;
                }
            }
            break;
        }
        v12 = var0.field_1351;
        v13 /* !! */  = op.sx;
        if (true) ** GOTO lbl99
        block61: while (true) {
            v13 /* !! */  = (long)(v14 - op.kqpb("kqug", kqpf(int ), (int)60));
lbl99:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1092494678: {
                    break block61;
                }
                case -106202851: {
                    v14 = op.kqpb("kquh", kqpf(int ), (int)61);
                    continue block61;
                }
                case 340130042: {
                    v14 = op.kqpb("kquj", kqpf(int ), (int)62);
                    continue block61;
                }
            }
            break;
        }
        v15 = var0.field_1350;
        v16 /* !! */  = op.sx;
        if (true) ** GOTO lbl113
        block62: while (true) {
            v16 /* !! */  = (long)(v17 - op.kqpb("kqum", kqpf(int ), (int)63));
lbl113:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1767273188: {
                    v17 = op.kqpb("kquo", kqpf(int ), (int)64);
                    continue block62;
                }
                case -1104329942: {
                    v17 = op.kqpb("kquq", kqpf(int ), (int)65);
                    continue block62;
                }
                case -1092494678: {
                    break block62;
                }
                case 1958622417: {
                    v17 = op.kqpb("kqur", kqpf(int ), (int)66);
                    continue block62;
                }
            }
            break;
        }
        if (!op.project(v10, v12, v15, var1_4)) ** GOTO lbl134
        if (var2_3) ** GOTO lbl41
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v18 = var1_4;
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl134:
            // 1 sources

            if (!var2_3 && !var2_3) ** break;
            ** continue;
            v18 = null;
lbl137:
            // 2 sources

            return v18;
            case 0: {
                var3_2 /* !! */  = (int)op.kqpb("kqut", kqoy(int ), (int)30);
                if (var4_1) {
                    throw null;
                }
            }
lbl142:
            // 4 sources

            case 1: {
                var3_2 /* !! */  = (int)op.kqpb("kquv", kqoy(int ), (int)31);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)op.kqpb("kqux", kqoy(int ), (int)32);
                    if (!var4_1) ** GOTO lbl142
                    throw null;
                }
            }
lbl152:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)op.kqpb("kquz", kqoy(int ), (int)33);
                if (var4_1) {
                    throw null;
                }
            }
lbl156:
            // 4 sources

            case 4: {
                var3_2 /* !! */  = (int)op.kqpb("kqvc", kqoy(int ), (int)34);
                if (!var4_1) break;
                throw null;
            }
lbl160:
            // 3 sources

            case 5: {
                var3_2 /* !! */  = (int)op.kqpb("kqve", kqoy(int ), (int)35);
                if (!var4_1) ** GOTO lbl156
                throw null;
            }
            case 6: {
                var3_2 /* !! */  = (int)op.kqpb("kqvg", kqoy(int ), (int)36);
                if (!var4_1) ** GOTO lbl160
                throw null;
            }
            case 7: {
                var3_2 /* !! */  = (int)op.kqpb("kqvi", kqoy(int ), (int)37);
                if (var4_1) {
                    throw null;
                }
            }
            case 8: {
                var3_2 /* !! */  = (int)op.kqpb("kqvk", kqoy(int ), (int)38);
                if (!var4_1) ** GOTO lbl160
                throw null;
            }
            case 9: 
        }
        var3_2 /* !! */  = (int)op.kqpb("kqvn", kqoy(int ), (int)39);
        ** while (!var4_1)
lbl179:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kqxx() {
        op.kqpg[0] = -555865502328427159L;
        op.kqpg[1] = 3189195160889677538L;
        op.kqpg[2] = 3479750816997255741L;
        op.kqpg[3] = -3824246235871362114L;
        op.kqpg[4] = 5106799622990040349L;
        op.kqpg[5] = 7420317853660762327L;
        op.kqpg[6] = 2826262133023769031L;
        op.kqpg[7] = -1439128284693564200L;
        op.kqpg[8] = -1057503261635874800L;
        op.kqpg[9] = 2440019010655723313L;
        op.kqpg[10] = 4074147487168422564L;
        op.kqpg[11] = -6766882602406190338L;
        op.kqpg[12] = 7474788152006120321L;
        op.kqpg[13] = 8219241692528392239L;
        op.kqpg[14] = 1925855122978318672L;
        op.kqpg[15] = 6928052410241300575L;
        op.kqpg[16] = -7792121013937027503L;
        op.kqpg[17] = 8244265880971132036L;
        op.kqpg[18] = -2508442624542215217L;
        op.kqpg[19] = 6165036497482190969L;
        op.kqpg[20] = -1007597337732559702L;
        op.kqpg[21] = -3184701854836733175L;
        op.kqpg[22] = -6782985927592192921L;
        op.kqpg[23] = -2928806463680026594L;
        op.kqpg[24] = 6198016002019213313L;
        op.kqpg[25] = 8235259719890332419L;
        op.kqpg[26] = 8554420053904591809L;
        op.kqpg[27] = 2434076723206922885L;
        op.kqpg[28] = 8572637359437754236L;
        op.kqpg[29] = -5151697109328308872L;
        op.kqpg[30] = 177828131779088015L;
        op.kqpg[31] = -5688995344699771765L;
        op.kqpg[32] = 5252194797318511631L;
        op.kqpg[33] = -6650016320982849514L;
        op.kqpg[34] = -1682100617026595840L;
        op.kqpg[35] = -937099627450764571L;
        op.kqpg[36] = 1024074158591066532L;
        op.kqpg[37] = -2691515649491577398L;
        op.kqpg[38] = -2976125800345069760L;
        op.kqpg[39] = -7301768366508427938L;
        op.kqpg[40] = -6334961732961165146L;
        op.kqpg[41] = -5440877488478318327L;
        op.kqpg[42] = -4581966325608011743L;
        op.kqpg[43] = 8391916814593517264L;
        op.kqpg[44] = -8816263443741329022L;
        op.kqpg[45] = 5508331387654966765L;
        op.kqpg[46] = 3793274691878050224L;
        op.kqpg[47] = -4328025197877586945L;
        op.kqpg[48] = 7446987535949494327L;
        op.kqpg[49] = -7456805614996698900L;
        op.kqpg[50] = 3166240904395868304L;
        op.kqpg[51] = 6008725618191722791L;
        op.kqpg[52] = 5136544385177730084L;
        op.kqpg[53] = -5047411717912862181L;
        op.kqpg[54] = -7915789718346179538L;
        op.kqpg[55] = 3743929769973160459L;
        op.kqpg[56] = 5233230473463660959L;
        op.kqpg[57] = 7766299463131883390L;
        op.kqpg[58] = 807345933307640626L;
        op.kqpg[59] = -185480451931018481L;
        op.kqpg[60] = -5662018964542755604L;
        op.kqpg[61] = -6234237421261341579L;
        op.kqpg[62] = 5225627291367342659L;
        op.kqpg[63] = 4983976537949504215L;
        op.kqpg[64] = -3362373516379258796L;
        op.kqpg[65] = -763716552705311234L;
        op.kqpg[66] = 5793481000895460838L;
    }

    private static /* synthetic */ int kqoy(int n2) {
        return kqoz[n2] ^ kqpa[n2];
    }
}

