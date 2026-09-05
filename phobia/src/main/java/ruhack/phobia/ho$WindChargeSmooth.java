/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import ruhack.phobia.hy;
import ruhack.phobia.ov;
import ruhack.phobia.ow;

final class ho$WindChargeSmooth
extends hy {
    private static int[] fkcq = new int[24];
    public static final long mh = -3277050910084510970L;
    public static final boolean a;
    public static final boolean c;
    public static final int b;
    private static int[] fkcr;
    private static long[] fkcm;
    private static long[] fkcl;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public ov limitAngleChange(ov var1_1, ov var2_2, class_243 var3_3, class_1297 var4_4) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ho$WindChargeSmooth.mh - ho$WindChargeSmooth.fkcn("fkco", fkck(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ho$WindChargeSmooth.fkcn("fkcs", fkcp(int ), (int)0)) break;
            v0 /* !! */  = (long)ho$WindChargeSmooth.fkcn("fkct", fkcp(int ), (int)1);
        }
        var8_5 = ho$WindChargeSmooth.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ho$WindChargeSmooth.mh - ho$WindChargeSmooth.fkcn("fkcu", fkck(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ho$WindChargeSmooth.fkcn("fkcv", fkcp(int ), (int)2)) break;
            v1 /* !! */  = (long)ho$WindChargeSmooth.fkcn("fkcw", fkcp(int ), (int)3);
        }
        var7_6 /* !! */  = ho$WindChargeSmooth.b;
        v2 /* !! */  = ho$WindChargeSmooth.mh;
        if (true) ** GOTO lbl17
        block34: while (true) {
            v2 /* !! */  = (long)(v3 - ho$WindChargeSmooth.fkcn("fkcx", fkck(int ), (int)2));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -678302240: {
                    v3 = ho$WindChargeSmooth.fkcn("fkcy", fkck(int ), (int)3);
                    continue block34;
                }
                case -3134287: {
                    v3 = ho$WindChargeSmooth.fkcn("fkcz", fkck(int ), (int)4);
                    continue block34;
                }
                case 618517065: {
                    v3 = ho$WindChargeSmooth.fkcn("fkda", fkck(int ), (int)5);
                    continue block34;
                }
                case 1368050438: {
                    break block34;
                }
            }
            break;
        }
        var6_7 = ho$WindChargeSmooth.a;
        if (var8_5) {
            throw null;
lbl32:
            // 2 sources

            return null;
        }
        if (var6_7 || var6_7) ** GOTO lbl32
        if (var7_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ho$WindChargeSmooth.mh - ho$WindChargeSmooth.fkcn("fkdb", fkck(int ), (int)6)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ho$WindChargeSmooth.fkcn("fkdc", fkcp(int ), (int)4)) break;
                    v4 /* !! */  = (long)ho$WindChargeSmooth.fkcn("fkdd", fkcp(int ), (int)5);
                }
                var5_8 = ow.calculateDelta(var1_1, var2_2);
                if (var6_7 || var6_7) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = ho$WindChargeSmooth.mh - ho$WindChargeSmooth.fkcn("fkde", fkck(int ), (int)7)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ho$WindChargeSmooth.fkcn("fkdf", fkcp(int ), (int)6)) break;
                    v5 /* !! */  = (long)ho$WindChargeSmooth.fkcn("fkdg", fkcp(int ), (int)7);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = ho$WindChargeSmooth.mh - ho$WindChargeSmooth.fkcn("fkdh", fkck(int ), (int)8)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ho$WindChargeSmooth.fkcn("fkdi", fkcp(int ), (int)8)) break;
                    v6 /* !! */  = (long)ho$WindChargeSmooth.fkcn("fkdj", fkcp(int ), (int)9);
                }
                v7 = var1_1.getYaw();
                v8 /* !! */  = ho$WindChargeSmooth.mh;
                if (true) ** GOTO lbl60
                block39: while (true) {
                    v8 /* !! */  = (long)(ho$WindChargeSmooth.fkcn("fkdl", fkck(int ), (int)10) - ho$WindChargeSmooth.fkcn("fkdk", fkck(int ), (int)9));
lbl60:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -231987980: {
                            continue block39;
                        }
                        case 1368050438: {
                            break block39;
                        }
                    }
                    break;
                }
                v9 = var5_8.getYaw();
                v10 = ho$WindChargeSmooth.fkcn("fkdn", fkdm(int ), (int)10);
                v11 = ho$WindChargeSmooth.fkcn("fkdo", fkdm(int ), (int)11);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = ho$WindChargeSmooth.mh - ho$WindChargeSmooth.fkcn("fkdp", fkck(int ), (int)11)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ho$WindChargeSmooth.fkcn("fkdq", fkcp(int ), (int)12)) break;
                    v12 /* !! */  = (long)ho$WindChargeSmooth.fkcn("fkdr", fkcp(int ), (int)13);
                }
                v13 = v7 + class_3532.method_15363((float)v9, (float)v10, (float)v11);
                v14 /* !! */  = ho$WindChargeSmooth.mh;
                if (true) ** GOTO lbl78
                block41: while (true) {
                    v14 /* !! */  = (long)(v15 - ho$WindChargeSmooth.fkcn("fkds", fkck(int ), (int)12));
lbl78:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1244907581: {
                            v15 = ho$WindChargeSmooth.fkcn("fkdt", fkck(int ), (int)13);
                            continue block41;
                        }
                        case 868055695: {
                            v15 = ho$WindChargeSmooth.fkcn("fkdu", fkck(int ), (int)14);
                            continue block41;
                        }
                        case 1368050438: {
                            break block41;
                        }
                        case 1918077309: {
                            v15 = ho$WindChargeSmooth.fkcn("fkdv", fkck(int ), (int)15);
                            continue block41;
                        }
                    }
                    break;
                }
                v16 = var1_1.getPitch();
                v17 /* !! */  = ho$WindChargeSmooth.mh;
                if (true) ** GOTO lbl95
                block42: while (true) {
                    v17 /* !! */  = (long)(ho$WindChargeSmooth.fkcn("fkdx", fkck(int ), (int)17) - ho$WindChargeSmooth.fkcn("fkdw", fkck(int ), (int)16));
lbl95:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -151803277: {
                            continue block42;
                        }
                        case 1368050438: {
                            break block42;
                        }
                    }
                    break;
                }
                v18 = var5_8.getPitch();
                v19 = ho$WindChargeSmooth.fkcn("fkdy", fkdm(int ), (int)14);
                v20 = ho$WindChargeSmooth.fkcn("fkdz", fkdm(int ), (int)15);
                v21 /* !! */  = ho$WindChargeSmooth.mh;
                if (true) ** GOTO lbl107
                block43: while (true) {
                    v21 /* !! */  = (long)(ho$WindChargeSmooth.fkcn("fkeb", fkck(int ), (int)19) - ho$WindChargeSmooth.fkcn("fkea", fkck(int ), (int)18));
lbl107:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -91962894: {
                            continue block43;
                        }
                        case 1368050438: {
                            break block43;
                        }
                    }
                    break;
                }
                v22 = v16 + class_3532.method_15363((float)v18, (float)v19, (float)v20);
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_6 = ho$WindChargeSmooth.mh - ho$WindChargeSmooth.fkcn("fkec", fkck(int ), (int)20)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == ho$WindChargeSmooth.fkcn("fked", fkcp(int ), (int)16)) break;
                    v23 /* !! */  = (long)ho$WindChargeSmooth.fkcn("fkee", fkcp(int ), (int)17);
                }
                return new ov(v13, v22);
            }
lbl119:
            // 2 sources

            case 0: {
                var7_6 /* !! */  = (int)ho$WindChargeSmooth.fkcn("fkef", fkcp(int ), (int)18);
                if (var8_5) {
                    throw null;
                }
                ** GOTO lbl133
            }
lbl124:
            // 2 sources

            case 1: {
                var7_6 /* !! */  = (int)ho$WindChargeSmooth.fkcn("fkeg", fkcp(int ), (int)19);
                if (var8_5) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl129:
            // 2 sources

            case 2: {
                var7_6 /* !! */  = (int)ho$WindChargeSmooth.fkcn("fkeh", fkcp(int ), (int)20);
                if (!var8_5) ** GOTO lbl124
                throw null;
            }
lbl133:
            // 2 sources

            case 3: {
                var7_6 /* !! */  = (int)ho$WindChargeSmooth.fkcn("fkei", fkcp(int ), (int)21);
                if (!var8_5) ** GOTO lbl119
                throw null;
            }
lbl137:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_6 /* !! */  = (int)ho$WindChargeSmooth.fkcn("fkej", fkcp(int ), (int)22);
                    if (!var8_5) ** GOTO lbl129
                    throw null;
                }
            }
            case 5: 
        }
        var7_6 /* !! */  = (int)ho$WindChargeSmooth.fkcn("fkek", fkcp(int ), (int)23);
        ** while (!var8_5)
lbl145:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fken() {
        ho$WindChargeSmooth.fkcl[0] = -6995502029846144825L;
        ho$WindChargeSmooth.fkcl[1] = -8960811208643769742L;
        ho$WindChargeSmooth.fkcl[2] = -9164575634916391239L;
        ho$WindChargeSmooth.fkcl[3] = -1995518710207953351L;
        ho$WindChargeSmooth.fkcl[4] = -1569808456594824052L;
        ho$WindChargeSmooth.fkcl[5] = -7097267744618869769L;
        ho$WindChargeSmooth.fkcl[6] = -1414959696424443019L;
        ho$WindChargeSmooth.fkcl[7] = -2200213457262686431L;
        ho$WindChargeSmooth.fkcl[8] = 1062711413070016953L;
        ho$WindChargeSmooth.fkcl[9] = 8130026066061607597L;
        ho$WindChargeSmooth.fkcl[10] = -5652741574107930050L;
        ho$WindChargeSmooth.fkcl[11] = -7190209840470855599L;
        ho$WindChargeSmooth.fkcl[12] = -8111077296648710747L;
        ho$WindChargeSmooth.fkcl[13] = -6052346920834408325L;
        ho$WindChargeSmooth.fkcl[14] = -2347131697183866655L;
        ho$WindChargeSmooth.fkcl[15] = -5842067078062474245L;
        ho$WindChargeSmooth.fkcl[16] = 2900594532924617468L;
        ho$WindChargeSmooth.fkcl[17] = -6436343121283875591L;
        ho$WindChargeSmooth.fkcl[18] = -455925385356158143L;
        ho$WindChargeSmooth.fkcl[19] = 2142887019263274408L;
        ho$WindChargeSmooth.fkcl[20] = 1052183479968216933L;
    }

    private static /* synthetic */ long fkck(int n2) {
        return fkcl[n2] ^ fkcm[n2];
    }

    private ho$WindChargeSmooth() {
    }

    private static /* synthetic */ void fkem() {
        ho$WindChargeSmooth.fkcr[0] = 1464263466;
        ho$WindChargeSmooth.fkcr[1] = -1903272975;
        ho$WindChargeSmooth.fkcr[2] = -1701798780;
        ho$WindChargeSmooth.fkcr[3] = -1476285879;
        ho$WindChargeSmooth.fkcr[4] = -1953512397;
        ho$WindChargeSmooth.fkcr[5] = -554881684;
        ho$WindChargeSmooth.fkcr[6] = -1888085353;
        ho$WindChargeSmooth.fkcr[7] = 458564696;
        ho$WindChargeSmooth.fkcr[8] = 1008916503;
        ho$WindChargeSmooth.fkcr[9] = 827810352;
        ho$WindChargeSmooth.fkcr[10] = 1016962160;
        ho$WindChargeSmooth.fkcr[11] = -2071273243;
        ho$WindChargeSmooth.fkcr[12] = 1755172355;
        ho$WindChargeSmooth.fkcr[13] = 294299814;
        ho$WindChargeSmooth.fkcr[14] = 1546152205;
        ho$WindChargeSmooth.fkcr[15] = 399788639;
        ho$WindChargeSmooth.fkcr[16] = 1271632612;
        ho$WindChargeSmooth.fkcr[17] = -429721913;
        ho$WindChargeSmooth.fkcr[18] = -708072640;
        ho$WindChargeSmooth.fkcr[19] = -1077550255;
        ho$WindChargeSmooth.fkcr[20] = 450655711;
        ho$WindChargeSmooth.fkcr[21] = -864748384;
        ho$WindChargeSmooth.fkcr[22] = 1081781012;
        ho$WindChargeSmooth.fkcr[23] = 2053937851;
    }

    public static /* synthetic */ CallSite fkcn(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void fkeo() {
        ho$WindChargeSmooth.fkcm[0] = 5545928269145596337L;
        ho$WindChargeSmooth.fkcm[1] = 2225562407590755019L;
        ho$WindChargeSmooth.fkcm[2] = 2447032815743916151L;
        ho$WindChargeSmooth.fkcm[3] = 2509518484296255690L;
        ho$WindChargeSmooth.fkcm[4] = 6536796902138474475L;
        ho$WindChargeSmooth.fkcm[5] = -6522870225588330595L;
        ho$WindChargeSmooth.fkcm[6] = -4403943710271028259L;
        ho$WindChargeSmooth.fkcm[7] = -1210585475738619046L;
        ho$WindChargeSmooth.fkcm[8] = -5383443107344948778L;
        ho$WindChargeSmooth.fkcm[9] = -3708254820762317693L;
        ho$WindChargeSmooth.fkcm[10] = 5754389308523378655L;
        ho$WindChargeSmooth.fkcm[11] = 5286014394626061348L;
        ho$WindChargeSmooth.fkcm[12] = 1912431076400129417L;
        ho$WindChargeSmooth.fkcm[13] = -3677517531902746970L;
        ho$WindChargeSmooth.fkcm[14] = 5741230090853861261L;
        ho$WindChargeSmooth.fkcm[15] = 7106947856893804886L;
        ho$WindChargeSmooth.fkcm[16] = -2197934501148225757L;
        ho$WindChargeSmooth.fkcm[17] = -5050627074957560250L;
        ho$WindChargeSmooth.fkcm[18] = -7750915006308936965L;
        ho$WindChargeSmooth.fkcm[19] = 4669081967203059566L;
        ho$WindChargeSmooth.fkcm[20] = 5139131251926572806L;
    }

    private static /* synthetic */ int fkcp(int n2) {
        return fkcq[n2] ^ fkcr[n2];
    }

    private static /* synthetic */ float fkdm(int n2) {
        return Float.intBitsToFloat(fkcq[n2] ^ fkcr[n2]);
    }

    private static /* synthetic */ void fkel() {
        ho$WindChargeSmooth.fkcq[0] = 1464263467;
        ho$WindChargeSmooth.fkcq[1] = -769955437;
        ho$WindChargeSmooth.fkcq[2] = -1701798779;
        ho$WindChargeSmooth.fkcq[3] = 1143562645;
        ho$WindChargeSmooth.fkcq[4] = 1953512396;
        ho$WindChargeSmooth.fkcq[5] = 2124560808;
        ho$WindChargeSmooth.fkcq[6] = 1888085352;
        ho$WindChargeSmooth.fkcq[7] = -778582831;
        ho$WindChargeSmooth.fkcq[8] = 1008916502;
        ho$WindChargeSmooth.fkcq[9] = 815237087;
        ho$WindChargeSmooth.fkcq[10] = -17982352;
        ho$WindChargeSmooth.fkcq[11] = -956636955;
        ho$WindChargeSmooth.fkcq[12] = -1755172356;
        ho$WindChargeSmooth.fkcq[13] = -1664091338;
        ho$WindChargeSmooth.fkcq[14] = -1642305267;
        ho$WindChargeSmooth.fkcq[15] = 1440762463;
        ho$WindChargeSmooth.fkcq[16] = -1271632613;
        ho$WindChargeSmooth.fkcq[17] = -2092571737;
        ho$WindChargeSmooth.fkcq[18] = -708072637;
        ho$WindChargeSmooth.fkcq[19] = -1077550253;
        ho$WindChargeSmooth.fkcq[20] = 450655711;
        ho$WindChargeSmooth.fkcq[21] = -864748379;
        ho$WindChargeSmooth.fkcq[22] = 1081781013;
        ho$WindChargeSmooth.fkcq[23] = 2053937851;
    }

    static {
        fkcr = new int[24];
        ho$WindChargeSmooth.fkel();
        ho$WindChargeSmooth.fkem();
        fkcl = new long[21];
        fkcm = new long[21];
        ho$WindChargeSmooth.fken();
        ho$WindChargeSmooth.fkeo();
    }
}

