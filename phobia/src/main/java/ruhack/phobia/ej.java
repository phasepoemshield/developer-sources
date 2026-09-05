/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_310;
import ruhack.phobia.aw;
import ruhack.phobia.bj;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kg;

public class ej
extends ds {
    private final class_310 mc;
    private int shiftTapDuration;
    private static int[] vkc;
    public static final int b;
    public static final boolean a;
    private long shiftTapEndTime;
    public static final long bg = 8223652286689310400L;
    private boolean isModuleControllingSneak;
    public final kg speed;
    public static final boolean c;
    private static long[] vju;
    private static int[] vkb;
    private static long[] vjs;

    private static /* synthetic */ void vtd() {
        ej.vjs[0] = -7134199446515468065L;
        ej.vjs[1] = 4435896082603129307L;
        ej.vjs[2] = -5510723497759986143L;
        ej.vjs[3] = -6120869115167792993L;
        ej.vjs[4] = -3297790165506602486L;
        ej.vjs[5] = -1240224812850044207L;
        ej.vjs[6] = -6241692489614733137L;
        ej.vjs[7] = 1149797176912637380L;
        ej.vjs[8] = 1458630286536196277L;
        ej.vjs[9] = 2024679684980881663L;
        ej.vjs[10] = -8009904724567376376L;
        ej.vjs[11] = -2868440744670954759L;
        ej.vjs[12] = -5947210357798115594L;
        ej.vjs[13] = -4337277094759523213L;
        ej.vjs[14] = -9157107899973239713L;
        ej.vjs[15] = -6093357349745169419L;
        ej.vjs[16] = -7861836957258149616L;
        ej.vjs[17] = -7847782712390075408L;
        ej.vjs[18] = -5801660271406620480L;
        ej.vjs[19] = 5203911241941788479L;
        ej.vjs[20] = 4790624723043103138L;
        ej.vjs[21] = 7089196625504099926L;
        ej.vjs[22] = -1030505573606464705L;
        ej.vjs[23] = 5394910713798563388L;
        ej.vjs[24] = -3130003365061210530L;
        ej.vjs[25] = -4224471043536903025L;
        ej.vjs[26] = -3272579226362260761L;
        ej.vjs[27] = 2241414635417754893L;
        ej.vjs[28] = -1743612062200361189L;
        ej.vjs[29] = -155004981829845956L;
        ej.vjs[30] = -8535210019737494904L;
        ej.vjs[31] = 6092313357623109901L;
        ej.vjs[32] = -1682240749023699062L;
        ej.vjs[33] = 7445315470033165917L;
        ej.vjs[34] = -4868958450911612952L;
        ej.vjs[35] = 6208544210852686940L;
        ej.vjs[36] = 8903609683627449739L;
        ej.vjs[37] = -7067046646901710662L;
        ej.vjs[38] = 3660004232903162167L;
        ej.vjs[39] = 3906816308362231277L;
        ej.vjs[40] = 5534535601592376647L;
        ej.vjs[41] = 6617166533531046675L;
        ej.vjs[42] = -6390703459331928909L;
        ej.vjs[43] = 3553998419884567998L;
        ej.vjs[44] = -3978300641099764606L;
        ej.vjs[45] = 7196708680018122939L;
        ej.vjs[46] = 1668635832602163417L;
        ej.vjs[47] = 6781340725406480508L;
        ej.vjs[48] = 1371005382220943761L;
        ej.vjs[49] = -7013252113301256801L;
        ej.vjs[50] = 2180034944780463945L;
        ej.vjs[51] = 8088016859994022300L;
        ej.vjs[52] = 3413305365652119121L;
        ej.vjs[53] = -2737637300240339991L;
        ej.vjs[54] = -2260475307492249418L;
        ej.vjs[55] = 711063443403381681L;
        ej.vjs[56] = -5119263245130850764L;
        ej.vjs[57] = 693056311835100528L;
        ej.vjs[58] = -6962589383913874803L;
        ej.vjs[59] = -2598284924768221117L;
        ej.vjs[60] = -998446756215657676L;
        ej.vjs[61] = 9057745097053703137L;
        ej.vjs[62] = -2348104417684956220L;
        ej.vjs[63] = 5058075092572188555L;
        ej.vjs[64] = -2621542950982224643L;
        ej.vjs[65] = -7957629750007916960L;
        ej.vjs[66] = 1151518781809093911L;
        ej.vjs[67] = -6452369032427318716L;
        ej.vjs[68] = -2213644236313690949L;
        ej.vjs[69] = 1313671790294082490L;
        ej.vjs[70] = 8997069629518831760L;
        ej.vjs[71] = 3894611055590661134L;
        ej.vjs[72] = 8401239160308072218L;
        ej.vjs[73] = -4902019277063047099L;
    }

    private static /* synthetic */ long vjq(int n2) {
        return vjs[n2] ^ vju[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ej() {
        var2_1 /* !! */  = ej.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("ShiftTap", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043d\u0430\u0436\u0438\u043c\u0430\u0435\u0442 \u0448\u0438\u0444\u0442 \u043f\u0440\u0438 \u0443\u0434\u0430\u0440\u0435", du.LEGIT);
                this.shiftTapEndTime = (long)ej.vjv("vjx", vjq(int ), (int)0);
                this.isModuleControllingSneak = ej.vjv("vkd", vjz(int ), (int)0);
                this.shiftTapDuration = (int)ej.vjv("vkf", vjz(int ), (int)1);
                this.speed = new kg("\u0412\u0440\u0435\u043c\u044f", "\u0412\u0440\u0435\u043c\u044f \u0443\u0434\u0435\u0440\u0436\u0430\u043d\u0438\u044f \u0448\u0438\u0444\u0442\u0430", (float)ej.vjv("vkk", vki(int ), (int)2)).range((float)ej.vjv("vkl", vki(int ), (int)3), (float)ej.vjv("vkn", vki(int ), (int)4)).step((float)ej.vjv("vko", vki(int ), (int)5));
                this.mc = class_310.method_1551();
                this.settings(new jx[]{this.speed});
                return;
            }
lbl13:
            // 2 sources

            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)ej.vjv("vkr", vjz(int ), (int)6);
                }
            }
            case 1: {
                var2_1 /* !! */  = (int)ej.vjv("vkt", vjz(int ), (int)7);
                ** GOTO lbl35
            }
            case 2: {
                var2_1 /* !! */  = (int)ej.vjv("vkv", vjz(int ), (int)8);
            }
lbl22:
            // 4 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ej.vjv("vkx", vjz(int ), (int)9);
                    ** GOTO lbl13
                    break;
                }
            }
            case 4: {
                var2_1 /* !! */  = (int)ej.vjv("vky", vjz(int ), (int)10);
                ** GOTO lbl22
            }
            case 5: {
                var2_1 /* !! */  = (int)ej.vjv("vla", vjz(int ), (int)11);
                ** GOTO lbl35
            }
            case 6: {
                var2_1 /* !! */  = (int)ej.vjv("vlb", vjz(int ), (int)12);
                ** GOTO lbl22
            }
lbl35:
            // 3 sources

            case 7: {
                var2_1 /* !! */  = (int)ej.vjv("vlc", vjz(int ), (int)13);
            }
            case 8: 
        }
        var2_1 /* !! */  = (int)ej.vjv("vle", vjz(int ), (int)14);
        ** while (true)
    }

    private static /* synthetic */ float vki(int n2) {
        return Float.intBitsToFloat(vkb[n2] ^ vkc[n2]);
    }

    private static /* synthetic */ void vtc() {
        ej.vkc[100] = -212170222;
        ej.vkc[101] = 1436392990;
        ej.vkc[102] = 2085103320;
        ej.vkc[103] = -1640405967;
        ej.vkc[104] = 1622428538;
        ej.vkc[105] = -1831877192;
        ej.vkc[106] = 1538774176;
        ej.vkc[107] = -1077493831;
        ej.vkc[108] = 1918270474;
        ej.vkc[109] = 1150517343;
        ej.vkc[110] = 1984353505;
        ej.vkc[111] = -536684648;
        ej.vkc[112] = -1625141257;
        ej.vkc[113] = 154146364;
        ej.vkc[114] = -1038267273;
        ej.vkc[115] = 824832687;
        ej.vkc[116] = -1586954176;
        ej.vkc[117] = 370074396;
        ej.vkc[118] = -1559553218;
        ej.vkc[119] = 597700730;
        ej.vkc[120] = 128809856;
        ej.vkc[121] = 278866680;
        ej.vkc[122] = 87270360;
    }

    private static /* synthetic */ int vjz(int n2) {
        return vkb[n2] ^ vkc[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void startShiftTap() {
        v0 /* !! */  = ej.bg;
        if (true) ** GOTO lbl5
        block45: while (true) {
            v0 /* !! */  = (long)(v1 - ej.vjv("vlf", vjq(int ), (int)1));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1537580201: {
                    v1 = ej.vjv("vlg", vjq(int ), (int)2);
                    continue block45;
                }
                case -1353732222: {
                    v1 = ej.vjv("vli", vjq(int ), (int)3);
                    continue block45;
                }
                case -1223861338: {
                    v1 = ej.vjv("vlj", vjq(int ), (int)4);
                    continue block45;
                }
                case 410121920: {
                    break block45;
                }
            }
            break;
        }
        var3_1 = ej.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ej.bg - ej.vjv("vll", vjq(int ), (int)5)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ej.vjv("vlm", vjz(int ), (int)15)) break;
            v2 /* !! */  = (long)ej.vjv("vlp", vjz(int ), (int)16);
        }
        var2_2 /* !! */  = ej.b;
        v3 /* !! */  = ej.bg;
        if (true) ** GOTO lbl28
        block47: while (true) {
            v3 /* !! */  = (long)(v4 - ej.vjv("vlq", vjq(int ), (int)6));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -736529198: {
                    v4 = ej.vjv("vls", vjq(int ), (int)7);
                    continue block47;
                }
                case 410121920: {
                    break block47;
                }
                case 1368202357: {
                    v4 = ej.vjv("vlu", vjq(int ), (int)8);
                    continue block47;
                }
                case 1409748935: {
                    v4 = ej.vjv("vlw", vjq(int ), (int)9);
                    continue block47;
                }
            }
            break;
        }
        var1_3 = ej.a;
        if (var3_1) {
            throw null;
lbl43:
            // 6 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl43
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = ej.bg - ej.vjv("vlx", vjq(int ), (int)10)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ej.vjv("vly", vjz(int ), (int)17)) break;
            v5 /* !! */  = (long)ej.vjv("vlz", vjz(int ), (int)18);
        }
        v6 = System.currentTimeMillis();
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = ej.bg - ej.vjv("vma", vjq(int ), (int)11)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ej.vjv("vmb", vjz(int ), (int)19)) break;
            v7 /* !! */  = (long)ej.vjv("vmc", vjz(int ), (int)20);
        }
        v8 /* !! */  = ej.bg;
        if (true) ** GOTO lbl61
        block51: while (true) {
            v8 /* !! */  = (long)(v9 - ej.vjv("vmd", vjq(int ), (int)12));
lbl61:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -678318503: {
                    v9 = ej.vjv("vme", vjq(int ), (int)13);
                    continue block51;
                }
                case 410121920: {
                    break block51;
                }
                case 1119516881: {
                    v9 = ej.vjv("vmf", vjq(int ), (int)14);
                    continue block51;
                }
            }
            break;
        }
        v10 = v6 + (long)this.speed.getInt();
        v11 /* !! */  = ej.bg;
        if (true) ** GOTO lbl75
        block52: while (true) {
            v11 /* !! */  = (long)(ej.vjv("vmh", vjq(int ), (int)16) - ej.vjv("vmg", vjq(int ), (int)15));
lbl75:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1938147741: {
                    continue block52;
                }
                case 410121920: {
                    break block52;
                }
            }
            break;
        }
        this.shiftTapEndTime = v10;
        if (var1_3 || var1_3) ** GOTO lbl43
        v12 /* !! */  = ej.bg;
        if (true) ** GOTO lbl86
        block53: while (true) {
            v12 /* !! */  = (long)(v13 - ej.vjv("vmi", vjq(int ), (int)17));
lbl86:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1432533157: {
                    v13 = ej.vjv("vmk", vjq(int ), (int)18);
                    continue block53;
                }
                case -852413338: {
                    v13 = ej.vjv("vml", vjq(int ), (int)19);
                    continue block53;
                }
                case 410121920: {
                    break block53;
                }
            }
            break;
        }
        if (this.isModuleControllingSneak) ** GOTO lbl137
        if (var1_3 || var1_3) ** GOTO lbl43
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_3 = ej.bg - ej.vjv("vmm", vjq(int ), (int)20)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == ej.vjv("vmn", vjz(int ), (int)21)) break;
            v14 /* !! */  = (long)ej.vjv("vmo", vjz(int ), (int)22);
        }
        v15 /* !! */  = ej.bg;
        if (true) ** GOTO lbl106
        block55: while (true) {
            v15 /* !! */  = (long)(ej.vjv("vmq", vjq(int ), (int)22) - ej.vjv("vmp", vjq(int ), (int)21));
lbl106:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -1706361466: {
                    continue block55;
                }
                case 410121920: {
                    break block55;
                }
            }
            break;
        }
        v16 = this.mc.field_1690;
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_4 = ej.bg - ej.vjv("vmr", vjq(int ), (int)23)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == ej.vjv("vms", vjz(int ), (int)23)) break;
            v17 /* !! */  = (long)ej.vjv("vmt", vjz(int ), (int)24);
        }
        v18 = v16.field_1832;
        v19 = ej.vjv("vmu", vjz(int ), (int)25);
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_5 = ej.bg - ej.vjv("vmv", vjq(int ), (int)24)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == ej.vjv("vmw", vjz(int ), (int)26)) break;
            v20 /* !! */  = (long)ej.vjv("vmy", vjz(int ), (int)27);
        }
        v18.method_23481((boolean)v19);
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl43
                v21 = ej.vjv("vmz", vjz(int ), (int)28);
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_6 = ej.bg - ej.vjv("vna", vjq(int ), (int)25)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == ej.vjv("vnb", vjz(int ), (int)29)) break;
                    v22 /* !! */  = (long)ej.vjv("vnc", vjz(int ), (int)30);
                }
                this.isModuleControllingSneak = v21;
                if (var1_3) ** GOTO lbl43
lbl137:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl140:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)ej.vjv("vnd", vjz(int ), (int)31);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl145:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ej.vjv("vne", vjz(int ), (int)32);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl150:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ej.vjv("vnf", vjz(int ), (int)33);
                if (!var3_1) ** GOTO lbl140
                throw null;
            }
lbl154:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ej.vjv("vnh", vjz(int ), (int)34);
                if (!var3_1) break;
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)ej.vjv("vni", vjz(int ), (int)35);
                if (!var3_1) break;
                throw null;
            }
lbl162:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)ej.vjv("vnj", vjz(int ), (int)36);
                if (!var3_1) ** GOTO lbl150
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)ej.vjv("vnk", vjz(int ), (int)37);
                if (!var3_1) ** GOTO lbl145
                throw null;
            }
            case 7: {
                do {
                    var2_2 /* !! */  = (int)ej.vjv("vnl", vjz(int ), (int)38);
                } while (!var3_1);
                throw null;
            }
lbl175:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)ej.vjv("vnm", vjz(int ), (int)39);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ej.vjv("vnn", vjz(int ), (int)40);
                    if (!var3_1) ** GOTO lbl162
                    throw null;
                }
            }
            case 10: {
                var2_2 /* !! */  = (int)ej.vjv("vno", vjz(int ), (int)41);
                if (!var3_1) ** GOTO lbl140
                throw null;
            }
lbl189:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)ej.vjv("vnq", vjz(int ), (int)42);
                if (!var3_1) ** GOTO lbl162
                throw null;
            }
            case 12: 
        }
        var2_2 /* !! */  = (int)ej.vjv("vnr", vjz(int ), (int)43);
        ** while (!var3_1)
lbl196:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite vjv(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void vtb() {
        ej.vkc[0] = -1622829751;
        ej.vkc[1] = 413574699;
        ej.vkc[2] = 1454630823;
        ej.vkc[3] = -825905748;
        ej.vkc[4] = 1230177347;
        ej.vkc[5] = 1127256998;
        ej.vkc[6] = -2019951486;
        ej.vkc[7] = -561599921;
        ej.vkc[8] = -687290810;
        ej.vkc[9] = 1631324255;
        ej.vkc[10] = -1670673021;
        ej.vkc[11] = -89010959;
        ej.vkc[12] = 620938338;
        ej.vkc[13] = -1375928173;
        ej.vkc[14] = -665888207;
        ej.vkc[15] = 284234184;
        ej.vkc[16] = -319737920;
        ej.vkc[17] = -1520190713;
        ej.vkc[18] = -1459620229;
        ej.vkc[19] = -735072323;
        ej.vkc[20] = 1025359564;
        ej.vkc[21] = 642368356;
        ej.vkc[22] = 1228819013;
        ej.vkc[23] = 366986703;
        ej.vkc[24] = 920969754;
        ej.vkc[25] = 19289103;
        ej.vkc[26] = 1400605589;
        ej.vkc[27] = 2087909537;
        ej.vkc[28] = -38714205;
        ej.vkc[29] = 818041904;
        ej.vkc[30] = 893780734;
        ej.vkc[31] = -1232597324;
        ej.vkc[32] = -15760885;
        ej.vkc[33] = 1050697520;
        ej.vkc[34] = 1705017286;
        ej.vkc[35] = 517468310;
        ej.vkc[36] = -1104860757;
        ej.vkc[37] = -402651906;
        ej.vkc[38] = -137690731;
        ej.vkc[39] = -87895530;
        ej.vkc[40] = -1775221997;
        ej.vkc[41] = -945430220;
        ej.vkc[42] = 1617289369;
        ej.vkc[43] = -806351673;
        ej.vkc[44] = 952738713;
        ej.vkc[45] = 2083166867;
        ej.vkc[46] = 1350574451;
        ej.vkc[47] = 2123718573;
        ej.vkc[48] = 1721232195;
        ej.vkc[49] = 494095239;
        ej.vkc[50] = 105615828;
        ej.vkc[51] = 1548750419;
        ej.vkc[52] = 1273882658;
        ej.vkc[53] = 867755650;
        ej.vkc[54] = 1692547013;
        ej.vkc[55] = 1424913586;
        ej.vkc[56] = -686662195;
        ej.vkc[57] = -1223113531;
        ej.vkc[58] = -198434885;
        ej.vkc[59] = -1243629287;
        ej.vkc[60] = 1069218743;
        ej.vkc[61] = 126730368;
        ej.vkc[62] = 1035376643;
        ej.vkc[63] = -710592968;
        ej.vkc[64] = -800469276;
        ej.vkc[65] = -1887773536;
        ej.vkc[66] = -1266873068;
        ej.vkc[67] = -706941857;
        ej.vkc[68] = -355054633;
        ej.vkc[69] = -1504483435;
        ej.vkc[70] = -744799849;
        ej.vkc[71] = 921279047;
        ej.vkc[72] = 3347163;
        ej.vkc[73] = 632673162;
        ej.vkc[74] = -267746830;
        ej.vkc[75] = 1968630267;
        ej.vkc[76] = -717496502;
        ej.vkc[77] = 1528454743;
        ej.vkc[78] = -738424981;
        ej.vkc[79] = 433865264;
        ej.vkc[80] = -668623885;
        ej.vkc[81] = -1579634675;
        ej.vkc[82] = 1214219579;
        ej.vkc[83] = 832865707;
        ej.vkc[84] = -484266410;
        ej.vkc[85] = 2020032999;
        ej.vkc[86] = 241297153;
        ej.vkc[87] = 864446946;
        ej.vkc[88] = -1221799394;
        ej.vkc[89] = 9896627;
        ej.vkc[90] = -1510084132;
        ej.vkc[91] = 1078106851;
        ej.vkc[92] = 1694965236;
        ej.vkc[93] = 259075949;
        ej.vkc[94] = 327696199;
        ej.vkc[95] = -68078353;
        ej.vkc[96] = -2092290867;
        ej.vkc[97] = -403722202;
        ej.vkc[98] = -568715887;
        ej.vkc[99] = -1858175029;
    }

    private static /* synthetic */ void vte() {
        ej.vju[0] = -7134199446515468065L;
        ej.vju[1] = 6291348898465603953L;
        ej.vju[2] = -2619621361867757639L;
        ej.vju[3] = -7900849273044572585L;
        ej.vju[4] = -2939460654239641398L;
        ej.vju[5] = 1640317390075129482L;
        ej.vju[6] = -7534802301710690092L;
        ej.vju[7] = 8607983373432014596L;
        ej.vju[8] = -7147289668364631977L;
        ej.vju[9] = -7508026526949717071L;
        ej.vju[10] = -5512792799882198574L;
        ej.vju[11] = -3671600791063260895L;
        ej.vju[12] = 3707335989095834378L;
        ej.vju[13] = 3290762225361806383L;
        ej.vju[14] = -261926055955599562L;
        ej.vju[15] = 5817627771658742257L;
        ej.vju[16] = -508738412615758212L;
        ej.vju[17] = -4208883249311766267L;
        ej.vju[18] = -8460976050979817115L;
        ej.vju[19] = 6012495870250277928L;
        ej.vju[20] = -5037765995818079508L;
        ej.vju[21] = 3323169882709584773L;
        ej.vju[22] = 5917539400669590297L;
        ej.vju[23] = -4802789000095479712L;
        ej.vju[24] = -9119231869958137825L;
        ej.vju[25] = 218284372494964757L;
        ej.vju[26] = 6872566362329382461L;
        ej.vju[27] = -5090848896509777621L;
        ej.vju[28] = 7764039963010203558L;
        ej.vju[29] = -2272657651956601145L;
        ej.vju[30] = 1887284104427312617L;
        ej.vju[31] = 7687463653681214016L;
        ej.vju[32] = 4076221019605019402L;
        ej.vju[33] = -5328132676105581925L;
        ej.vju[34] = -5027618011063095017L;
        ej.vju[35] = -6560920595909433708L;
        ej.vju[36] = -8550955934424778551L;
        ej.vju[37] = -3635040924476213841L;
        ej.vju[38] = 426450143853879832L;
        ej.vju[39] = 1348998875210479965L;
        ej.vju[40] = -5680946109445658572L;
        ej.vju[41] = 7952807649180620443L;
        ej.vju[42] = -8044371792781748082L;
        ej.vju[43] = -2203343666097345962L;
        ej.vju[44] = 4622607890925144213L;
        ej.vju[45] = 838806414913371443L;
        ej.vju[46] = 1200621782199647699L;
        ej.vju[47] = 5886472037836801071L;
        ej.vju[48] = 4248525516056080329L;
        ej.vju[49] = -9134697614534667972L;
        ej.vju[50] = 5368971778183857645L;
        ej.vju[51] = -629878652510962037L;
        ej.vju[52] = -3824871904398013896L;
        ej.vju[53] = 1679690891052465951L;
        ej.vju[54] = 2839613094713643570L;
        ej.vju[55] = -5316197846895884268L;
        ej.vju[56] = 6260390205934018869L;
        ej.vju[57] = -800542142844867859L;
        ej.vju[58] = 2012399106176689252L;
        ej.vju[59] = 8174417483481473655L;
        ej.vju[60] = 6149904855269874633L;
        ej.vju[61] = 4861784277545654815L;
        ej.vju[62] = -1044491496754457092L;
        ej.vju[63] = 3256721305616751922L;
        ej.vju[64] = 5098655949325586592L;
        ej.vju[65] = -4877466887978348868L;
        ej.vju[66] = -245559428993187146L;
        ej.vju[67] = 3712789511208676537L;
        ej.vju[68] = -2731428047467312277L;
        ej.vju[69] = -8440946587739397226L;
        ej.vju[70] = 7077918545166590385L;
        ej.vju[71] = -1260146034540859639L;
        ej.vju[72] = -3638118873474338939L;
        ej.vju[73] = -8680528041551849899L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void stopShiftTap() {
        block56: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ej.bg - ej.vjv("vns", vjq(int ), (int)26)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ej.vjv("vnt", vjz(int ), (int)44)) break;
                v0 /* !! */  = (long)ej.vjv("vnu", vjz(int ), (int)45);
            }
            var3_1 = ej.c;
            v1 /* !! */  = ej.bg;
            if (true) ** GOTO lbl11
            block37: while (true) {
                v1 /* !! */  = (long)(ej.vjv("vnw", vjq(int ), (int)28) - ej.vjv("vnv", vjq(int ), (int)27));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -354433318: {
                        continue block37;
                    }
                    case 410121920: {
                        break block37;
                    }
                }
                break;
            }
            var2_2 /* !! */  = ej.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_1 = ej.bg - ej.vjv("vnx", vjq(int ), (int)29)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == ej.vjv("vnz", vjz(int ), (int)46)) break;
                v2 /* !! */  = (long)ej.vjv("voa", vjz(int ), (int)47);
            }
            var1_3 = ej.a;
            if (var3_1) {
                throw null;
lbl25:
                // 5 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl25
            v3 /* !! */  = ej.bg;
            if (true) ** GOTO lbl32
            block40: while (true) {
                v3 /* !! */  = (long)(v4 - ej.vjv("vob", vjq(int ), (int)30));
lbl32:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 410121920: {
                        break block40;
                    }
                    case 867969052: {
                        v4 = ej.vjv("voc", vjq(int ), (int)31);
                        continue block40;
                    }
                    case 1708642208: {
                        v4 = ej.vjv("vod", vjq(int ), (int)32);
                        continue block40;
                    }
                }
                break;
            }
            if (!this.isModuleControllingSneak) break block56;
            if (var1_3 || var1_3) ** GOTO lbl25
            v5 /* !! */  = ej.bg;
            if (true) ** GOTO lbl47
            block41: while (true) {
                v5 /* !! */  = (long)(ej.vjv("vof", vjq(int ), (int)34) - ej.vjv("voe", vjq(int ), (int)33));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1806131253: {
                        continue block41;
                    }
                    case 410121920: {
                        break block41;
                    }
                }
                break;
            }
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_2 = ej.bg - ej.vjv("voh", vjq(int ), (int)35)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == ej.vjv("voi", vjz(int ), (int)48)) break;
                v6 /* !! */  = (long)ej.vjv("voj", vjz(int ), (int)49);
            }
            v7 = this.mc.field_1690;
            v8 /* !! */  = ej.bg;
            if (true) ** GOTO lbl62
            block43: while (true) {
                v8 /* !! */  = (long)(v9 - ej.vjv("vok", vjq(int ), (int)36));
lbl62:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case 410121920: {
                        break block43;
                    }
                    case 1660061455: {
                        v9 = ej.vjv("vol", vjq(int ), (int)37);
                        continue block43;
                    }
                    case 1714596688: {
                        v9 = ej.vjv("vom", vjq(int ), (int)38);
                        continue block43;
                    }
                }
                break;
            }
            v10 = v7.field_1832;
            v11 = ej.vjv("von", vjz(int ), (int)50);
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_3 = ej.bg - ej.vjv("voo", vjq(int ), (int)39)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == ej.vjv("vop", vjz(int ), (int)51)) break;
                v12 /* !! */  = (long)ej.vjv("voq", vjz(int ), (int)52);
            }
            v10.method_23481((boolean)v11);
            if (var1_3 || var1_3) ** GOTO lbl25
            v13 = ej.vjv("vos", vjz(int ), (int)53);
            v14 /* !! */  = ej.bg;
            if (true) ** GOTO lbl85
            block45: while (true) {
                v14 /* !! */  = (long)(v15 - ej.vjv("vot", vjq(int ), (int)40));
lbl85:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -1310566018: {
                        v15 = ej.vjv("vou", vjq(int ), (int)41);
                        continue block45;
                    }
                    case -748385683: {
                        v15 = ej.vjv("vov", vjq(int ), (int)42);
                        continue block45;
                    }
                    case 410121920: {
                        break block45;
                    }
                }
                break;
            }
            this.isModuleControllingSneak = v13;
            if (var1_3) ** GOTO lbl25
        }
        if (!var1_3 && !var1_3) ** break;
        ** while (true)
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block23 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl103:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ej.vjv("vow", vjz(int ), (int)54);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl113
            }
            case 1: {
                var2_2 /* !! */  = (int)ej.vjv("vox", vjz(int ), (int)55);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl118
            }
lbl113:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ej.vjv("voy", vjz(int ), (int)56);
                    if (!var3_1) break block23;
                    throw null;
                }
            }
lbl118:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)ej.vjv("voz", vjz(int ), (int)57);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl135
            }
            case 4: {
                var2_2 /* !! */  = (int)ej.vjv("vpb", vjz(int ), (int)58);
                if (!var3_1) ** GOTO lbl118
                throw null;
            }
lbl127:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)ej.vjv("vpc", vjz(int ), (int)59);
                if (!var3_1) ** GOTO lbl103
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)ej.vjv("vpd", vjz(int ), (int)60);
                if (var3_1) {
                    throw null;
                }
            }
lbl135:
            // 4 sources

            case 7: {
                var2_2 /* !! */  = (int)ej.vjv("vpe", vjz(int ), (int)61);
                if (!var3_1) break;
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)ej.vjv("vpf", vjz(int ), (int)62);
                if (var3_1) {
                    throw null;
                }
            }
            case 9: {
                var2_2 /* !! */  = (int)ej.vjv("vpg", vjz(int ), (int)63);
                if (!var3_1) ** GOTO lbl127
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)ej.vjv("vph", vjz(int ), (int)64);
        ** while (!var3_1)
lbl150:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onAttack(bj var1_1) {
        block45: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ej.bg - ej.vjv("vpj", vjq(int ), (int)43)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == ej.vjv("vpk", vjz(int ), (int)65)) break;
                v0 /* !! */  = (long)ej.vjv("vpl", vjz(int ), (int)66);
            }
            var4_2 = ej.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = ej.bg - ej.vjv("vpm", vjq(int ), (int)44)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == ej.vjv("vpn", vjz(int ), (int)67)) break;
                v1 /* !! */  = (long)ej.vjv("vpo", vjz(int ), (int)68);
            }
            var3_3 /* !! */  = ej.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = ej.bg - ej.vjv("vpp", vjq(int ), (int)45)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == ej.vjv("vpq", vjz(int ), (int)69)) break;
                v2 /* !! */  = (long)ej.vjv("vpr", vjz(int ), (int)70);
            }
            var2_4 = ej.a;
            if (var4_2) {
                throw null;
lbl24:
                // 5 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl24
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_3 = ej.bg - ej.vjv("vpt", vjq(int ), (int)46)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == ej.vjv("vpu", vjz(int ), (int)71)) break;
                v3 /* !! */  = (long)ej.vjv("vpv", vjz(int ), (int)72);
            }
            v4 /* !! */  = ej.bg;
            if (true) ** GOTO lbl37
            block28: while (true) {
                v4 /* !! */  = (long)(ej.vjv("vpx", vjq(int ), (int)48) - ej.vjv("vpw", vjq(int ), (int)47));
lbl37:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1950312023: {
                        continue block28;
                    }
                    case 410121920: {
                        break block28;
                    }
                }
                break;
            }
            if (this.mc.field_1724 != null) break block45;
            if (var2_4 || var2_4) ** GOTO lbl24
            return;
        }
        if (var2_4) ** GOTO lbl24
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl24
                v5 /* !! */  = ej.bg;
                if (true) ** GOTO lbl55
                block29: while (true) {
                    v5 /* !! */  = (long)(v6 - ej.vjv("vpy", vjq(int ), (int)49));
lbl55:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -854995608: {
                            v6 = ej.vjv("vpz", vjq(int ), (int)50);
                            continue block29;
                        }
                        case 410121920: {
                            break block29;
                        }
                        case 1553081964: {
                            v6 = ej.vjv("vqb", vjq(int ), (int)51);
                            continue block29;
                        }
                        case 1714217337: {
                            v6 = ej.vjv("vqc", vjq(int ), (int)52);
                            continue block29;
                        }
                    }
                    break;
                }
                this.startShiftTap();
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl71:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)ej.vjv("vqd", vjz(int ), (int)73);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl76:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)ej.vjv("vqe", vjz(int ), (int)74);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)ej.vjv("vqf", vjz(int ), (int)75);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl112
            }
            case 3: {
                var3_3 /* !! */  = (int)ej.vjv("vqg", vjz(int ), (int)76);
                if (!var4_2) ** GOTO lbl71
                throw null;
            }
lbl89:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)ej.vjv("vqh", vjz(int ), (int)77);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl103
            }
lbl94:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)ej.vjv("vqi", vjz(int ), (int)78);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl107
            }
            case 6: {
                var3_3 /* !! */  = (int)ej.vjv("vqj", vjz(int ), (int)79);
                if (!var4_2) ** GOTO lbl94
                throw null;
            }
lbl103:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)ej.vjv("vql", vjz(int ), (int)80);
                if (!var4_2) ** GOTO lbl89
                throw null;
            }
lbl107:
            // 3 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ej.vjv("vqm", vjz(int ), (int)81);
                    if (!var4_2) ** GOTO lbl76
                    throw null;
                }
            }
lbl112:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)ej.vjv("vqn", vjz(int ), (int)82);
                if (!var4_2) break;
                throw null;
            }
            case 10: 
        }
        var3_3 /* !! */  = (int)ej.vjv("vqo", vjz(int ), (int)83);
        ** while (!var4_2)
lbl119:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block77: {
            block76: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = ej.bg - ej.vjv("vqp", vjq(int ), (int)53)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == ej.vjv("vqq", vjz(int ), (int)84)) break;
                    v0 /* !! */  = (long)ej.vjv("vqr", vjz(int ), (int)85);
                }
                var6_2 = ej.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = ej.bg - ej.vjv("vqs", vjq(int ), (int)54)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == ej.vjv("vqu", vjz(int ), (int)86)) break;
                    v1 /* !! */  = (long)ej.vjv("vqv", vjz(int ), (int)87);
                }
                var5_3 /* !! */  = ej.b;
                v2 /* !! */  = ej.bg;
                if (true) ** GOTO lbl17
                block45: while (true) {
                    v2 /* !! */  = (long)(v3 - ej.vjv("vqw", vjq(int ), (int)55));
lbl17:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -2009936244: {
                            v3 = ej.vjv("vqx", vjq(int ), (int)56);
                            continue block45;
                        }
                        case 410121920: {
                            break block45;
                        }
                        case 1580724931: {
                            v3 = ej.vjv("vqy", vjq(int ), (int)57);
                            continue block45;
                        }
                    }
                    break;
                }
                var4_4 = ej.a;
                if (var6_2) {
                    throw null;
lbl29:
                    // 12 sources

                    return;
                }
                if (var4_4 || var4_4) ** GOTO lbl29
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ej.bg - ej.vjv("vqz", vjq(int ), (int)58)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ej.vjv("vra", vjz(int ), (int)88)) break;
                    v4 /* !! */  = (long)ej.vjv("vrb", vjz(int ), (int)89);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = ej.bg - ej.vjv("vrc", vjq(int ), (int)59)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ej.vjv("vrd", vjz(int ), (int)90)) break;
                    v5 /* !! */  = (long)ej.vjv("vrf", vjz(int ), (int)91);
                }
                if (this.mc.field_1724 == null) break block76;
                if (var4_4) ** GOTO lbl29
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = ej.bg - ej.vjv("vrg", vjq(int ), (int)60)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ej.vjv("vrh", vjz(int ), (int)92)) break;
                    v6 /* !! */  = (long)ej.vjv("vri", vjz(int ), (int)93);
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_5 = ej.bg - ej.vjv("vrj", vjq(int ), (int)61)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ej.vjv("vrk", vjz(int ), (int)94)) break;
                    v7 /* !! */  = (long)ej.vjv("vrl", vjz(int ), (int)95);
                }
                v8 = this.mc.field_1724;
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_6 = ej.bg - ej.vjv("vrm", vjq(int ), (int)62)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ej.vjv("vrn", vjz(int ), (int)96)) break;
                    v9 /* !! */  = (long)ej.vjv("vro", vjz(int ), (int)97);
                }
                if (!v8.method_7325()) break block77;
                if (var4_4) ** GOTO lbl29
            }
            if (var4_4 || var4_4) ** GOTO lbl29
            v10 /* !! */  = ej.bg;
            if (true) ** GOTO lbl68
            block52: while (true) {
                v10 /* !! */  = (long)(v11 - ej.vjv("vrp", vjq(int ), (int)63));
lbl68:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1013206814: {
                        v11 = ej.vjv("vrq", vjq(int ), (int)64);
                        continue block52;
                    }
                    case 410121920: {
                        break block52;
                    }
                    case 1534137436: {
                        v11 = ej.vjv("vrr", vjq(int ), (int)65);
                        continue block52;
                    }
                }
                break;
            }
            this.stopShiftTap();
            if (var4_4 || var4_4) ** GOTO lbl29
            return;
        }
        if (var4_4) ** GOTO lbl29
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl29
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_7 = ej.bg - ej.vjv("vrs", vjq(int ), (int)66)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ej.vjv("vrt", vjz(int ), (int)98)) break;
                    v12 /* !! */  = (long)ej.vjv("vru", vjz(int ), (int)99);
                }
                var2_5 = System.currentTimeMillis();
                if (var4_4 || var4_4) ** GOTO lbl29
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_8 = ej.bg - ej.vjv("vrv", vjq(int ), (int)67)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == ej.vjv("vrw", vjz(int ), (int)100)) break;
                    v13 /* !! */  = (long)ej.vjv("vrx", vjz(int ), (int)101);
                }
                if (!this.isModuleControllingSneak) ** GOTO lbl129
                if (var4_4) ** GOTO lbl29
                v14 /* !! */  = ej.bg;
                if (true) ** GOTO lbl104
                block55: while (true) {
                    v14 /* !! */  = (long)(ej.vjv("vrz", vjq(int ), (int)69) - ej.vjv("vry", vjq(int ), (int)68));
lbl104:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -2067369059: {
                            continue block55;
                        }
                        case 410121920: {
                            break block55;
                        }
                    }
                    break;
                }
                if (var2_5 <= this.shiftTapEndTime) ** GOTO lbl129
                if (var4_4 || var4_4) ** GOTO lbl29
                v15 /* !! */  = ej.bg;
                if (true) ** GOTO lbl115
                block56: while (true) {
                    v15 /* !! */  = (long)(v16 - ej.vjv("vsa", vjq(int ), (int)70));
lbl115:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -152171740: {
                            v16 = ej.vjv("vsb", vjq(int ), (int)71);
                            continue block56;
                        }
                        case 410121920: {
                            break block56;
                        }
                        case 855759617: {
                            v16 = ej.vjv("vsc", vjq(int ), (int)72);
                            continue block56;
                        }
                        case 1350300040: {
                            v16 = ej.vjv("vsd", vjq(int ), (int)73);
                            continue block56;
                        }
                    }
                    break;
                }
                this.stopShiftTap();
                if (var4_4) ** GOTO lbl29
lbl129:
                // 3 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl132:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)ej.vjv("vse", vjz(int ), (int)102);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl137:
            // 4 sources

            case 1: {
                var5_3 /* !! */  = (int)ej.vjv("vsf", vjz(int ), (int)103);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl196
            }
            case 2: {
                var5_3 /* !! */  = (int)ej.vjv("vsg", vjz(int ), (int)104);
                if (!var6_2) ** GOTO lbl137
                throw null;
            }
lbl146:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)ej.vjv("vsh", vjz(int ), (int)105);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 4: {
                var5_3 /* !! */  = (int)ej.vjv("vsi", vjz(int ), (int)106);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl212
            }
            case 5: {
                do {
                    var5_3 /* !! */  = (int)ej.vjv("vsj", vjz(int ), (int)107);
                } while (!var6_2);
                throw null;
            }
lbl161:
            // 2 sources

            case 6: {
                do {
                    var5_3 /* !! */  = (int)ej.vjv("vsk", vjz(int ), (int)108);
                } while (!var6_2);
                throw null;
            }
lbl166:
            // 2 sources

            case 7: {
                var5_3 /* !! */  = (int)ej.vjv("vsl", vjz(int ), (int)109);
                if (!var6_2) ** GOTO lbl137
                throw null;
            }
lbl170:
            // 2 sources

            case 8: {
                var5_3 /* !! */  = (int)ej.vjv("vsm", vjz(int ), (int)110);
                if (var6_2) {
                    throw null;
                }
            }
            case 9: {
                var5_3 /* !! */  = (int)ej.vjv("vsn", vjz(int ), (int)111);
                if (!var6_2) break;
                throw null;
            }
lbl178:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)ej.vjv("vso", vjz(int ), (int)112);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl183:
            // 3 sources

            case 11: {
                var5_3 /* !! */  = (int)ej.vjv("vsp", vjz(int ), (int)113);
                if (!var6_2) ** GOTO lbl132
                throw null;
            }
lbl187:
            // 3 sources

            case 12: {
                var5_3 /* !! */  = (int)ej.vjv("vsq", vjz(int ), (int)114);
                if (!var6_2) ** GOTO lbl183
                throw null;
            }
            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)ej.vjv("vsr", vjz(int ), (int)115);
                    if (!var6_2) ** GOTO lbl178
                    throw null;
                }
            }
lbl196:
            // 3 sources

            case 14: {
                var5_3 /* !! */  = (int)ej.vjv("vss", vjz(int ), (int)116);
                if (!var6_2) ** GOTO lbl170
                throw null;
            }
            case 15: {
                var5_3 /* !! */  = (int)ej.vjv("vst", vjz(int ), (int)117);
                if (!var6_2) ** GOTO lbl196
                throw null;
            }
            case 16: {
                var5_3 /* !! */  = (int)ej.vjv("vsu", vjz(int ), (int)118);
                if (!var6_2) ** GOTO lbl137
                throw null;
            }
            case 17: {
                var5_3 /* !! */  = (int)ej.vjv("vsv", vjz(int ), (int)119);
                if (!var6_2) ** GOTO lbl187
                throw null;
            }
lbl212:
            // 2 sources

            case 18: {
                var5_3 /* !! */  = (int)ej.vjv("vsw", vjz(int ), (int)120);
                if (!var6_2) ** GOTO lbl146
                throw null;
            }
            case 19: {
                var5_3 /* !! */  = (int)ej.vjv("vsx", vjz(int ), (int)121);
                if (!var6_2) ** GOTO lbl166
                throw null;
            }
            case 20: 
        }
        var5_3 /* !! */  = (int)ej.vjv("vsy", vjz(int ), (int)122);
        ** while (!var6_2)
lbl223:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void vta() {
        ej.vkb[100] = -212170221;
        ej.vkb[101] = 1736511739;
        ej.vkb[102] = 2085103317;
        ej.vkb[103] = -1640405955;
        ej.vkb[104] = 1622428536;
        ej.vkb[105] = -1831877205;
        ej.vkb[106] = 1538774193;
        ej.vkb[107] = -1077493838;
        ej.vkb[108] = 1918270472;
        ej.vkb[109] = 1150517330;
        ej.vkb[110] = 1984353505;
        ej.vkb[111] = -536684656;
        ej.vkb[112] = -1625141263;
        ej.vkb[113] = 154146353;
        ej.vkb[114] = -1038267290;
        ej.vkb[115] = 824832700;
        ej.vkb[116] = -1586954175;
        ej.vkb[117] = 370074376;
        ej.vkb[118] = -1559553218;
        ej.vkb[119] = 597700722;
        ej.vkb[120] = 128809871;
        ej.vkb[121] = 278866665;
        ej.vkb[122] = 87270355;
    }

    private static /* synthetic */ void vsz() {
        ej.vkb[0] = -1622829751;
        ej.vkb[1] = 413574735;
        ej.vkb[2] = 352053159;
        ej.vkb[3] = -1905939028;
        ej.vkb[4] = 170460227;
        ej.vkb[5] = 59806630;
        ej.vkb[6] = -2019951484;
        ej.vkb[7] = -561599929;
        ej.vkb[8] = -687290810;
        ej.vkb[9] = 1631324247;
        ej.vkb[10] = -1670673020;
        ej.vkb[11] = -89010953;
        ej.vkb[12] = 620938337;
        ej.vkb[13] = -1375928169;
        ej.vkb[14] = -665888205;
        ej.vkb[15] = 284234185;
        ej.vkb[16] = 625488001;
        ej.vkb[17] = -1520190714;
        ej.vkb[18] = -1288229988;
        ej.vkb[19] = -735072324;
        ej.vkb[20] = 612428897;
        ej.vkb[21] = 642368357;
        ej.vkb[22] = -1848193442;
        ej.vkb[23] = 366986702;
        ej.vkb[24] = -1346206239;
        ej.vkb[25] = 19289102;
        ej.vkb[26] = 1400605588;
        ej.vkb[27] = -260510656;
        ej.vkb[28] = -38714206;
        ej.vkb[29] = 818041905;
        ej.vkb[30] = -661720352;
        ej.vkb[31] = -1232597316;
        ej.vkb[32] = -15760886;
        ej.vkb[33] = 1050697532;
        ej.vkb[34] = 1705017292;
        ej.vkb[35] = 517468308;
        ej.vkb[36] = -1104860755;
        ej.vkb[37] = -402651911;
        ej.vkb[38] = -137690724;
        ej.vkb[39] = -87895524;
        ej.vkb[40] = -1775221995;
        ej.vkb[41] = -945430212;
        ej.vkb[42] = 1617289374;
        ej.vkb[43] = -806351676;
        ej.vkb[44] = 952738712;
        ej.vkb[45] = 288459409;
        ej.vkb[46] = 1350574450;
        ej.vkb[47] = -876296633;
        ej.vkb[48] = 1721232194;
        ej.vkb[49] = 1631044785;
        ej.vkb[50] = 105615828;
        ej.vkb[51] = 1548750418;
        ej.vkb[52] = 320872524;
        ej.vkb[53] = 867755650;
        ej.vkb[54] = 1692547009;
        ej.vkb[55] = 1424913584;
        ej.vkb[56] = -686662196;
        ej.vkb[57] = -1223113530;
        ej.vkb[58] = -198434884;
        ej.vkb[59] = -1243629288;
        ej.vkb[60] = 1069218749;
        ej.vkb[61] = 126730374;
        ej.vkb[62] = 1035376642;
        ej.vkb[63] = -710592964;
        ej.vkb[64] = -800469278;
        ej.vkb[65] = -1887773535;
        ej.vkb[66] = 961858759;
        ej.vkb[67] = -706941858;
        ej.vkb[68] = -230829656;
        ej.vkb[69] = -1504483436;
        ej.vkb[70] = 123166002;
        ej.vkb[71] = 921279046;
        ej.vkb[72] = -11646309;
        ej.vkb[73] = 632673163;
        ej.vkb[74] = -267746827;
        ej.vkb[75] = 1968630266;
        ej.vkb[76] = -717496497;
        ej.vkb[77] = 1528454742;
        ej.vkb[78] = -738424990;
        ej.vkb[79] = 433865265;
        ej.vkb[80] = -668623884;
        ej.vkb[81] = -1579634679;
        ej.vkb[82] = 1214219581;
        ej.vkb[83] = 832865708;
        ej.vkb[84] = -484266409;
        ej.vkb[85] = -1016656360;
        ej.vkb[86] = 241297152;
        ej.vkb[87] = 196312743;
        ej.vkb[88] = -1221799393;
        ej.vkb[89] = -178377807;
        ej.vkb[90] = -1510084131;
        ej.vkb[91] = -163219663;
        ej.vkb[92] = 1694965237;
        ej.vkb[93] = 1201911473;
        ej.vkb[94] = 327696198;
        ej.vkb[95] = -687359330;
        ej.vkb[96] = -2092290868;
        ej.vkb[97] = 1256757849;
        ej.vkb[98] = -568715888;
        ej.vkb[99] = 1821059688;
    }

    static {
        vkb = new int[123];
        vkc = new int[123];
        ej.vsz();
        ej.vta();
        ej.vtb();
        ej.vtc();
        vjs = new long[74];
        vju = new long[74];
        ej.vtd();
        ej.vte();
    }
}

