/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1802
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1802;
import ruhack.phobia.aw;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.kg;

public class hf
extends ds {
    private static long[] ekkq;
    protected static final long ku = 1415738421555353301L;
    private final kb goldenHearts;
    private static int[] ekjs;
    private static long[] ekkp;
    public static final boolean a;
    public static final boolean c;
    public static final int b;
    private static int[] ekjt;
    private final kg healthThreshold;
    private int previousSlot;
    private boolean isEating;
    private final kb smartMode;
    private final kb returnSlot;

    private static /* synthetic */ void emem() {
        hf.ekkp[0] = -8948366854092394802L;
        hf.ekkp[1] = -8360072487201140265L;
        hf.ekkp[2] = -5730408821484800425L;
        hf.ekkp[3] = -1496108756988765214L;
        hf.ekkp[4] = -4360172231763451744L;
        hf.ekkp[5] = -2891243287792629461L;
        hf.ekkp[6] = 5247659455745034031L;
        hf.ekkp[7] = -506393358513232176L;
        hf.ekkp[8] = -3920031972729145187L;
        hf.ekkp[9] = -8204709915792273267L;
        hf.ekkp[10] = 2498238551291301136L;
        hf.ekkp[11] = 2718861383329487116L;
        hf.ekkp[12] = -7952137485149851183L;
        hf.ekkp[13] = 8446773210335013617L;
        hf.ekkp[14] = -8628747847387786182L;
        hf.ekkp[15] = -3153762169826992995L;
        hf.ekkp[16] = -8874219300616971117L;
        hf.ekkp[17] = -7116540818355875283L;
        hf.ekkp[18] = -5529020669791398483L;
        hf.ekkp[19] = 780728482625341565L;
        hf.ekkp[20] = 3969556352588360186L;
        hf.ekkp[21] = 5141008080248357463L;
        hf.ekkp[22] = 8504113051353468846L;
        hf.ekkp[23] = 6692129306001379093L;
        hf.ekkp[24] = 1994012166959242520L;
        hf.ekkp[25] = -755114883105384508L;
        hf.ekkp[26] = -2386443250534206841L;
        hf.ekkp[27] = -8968044151645301355L;
        hf.ekkp[28] = 5158360536384915050L;
        hf.ekkp[29] = 3760286875597997145L;
        hf.ekkp[30] = 7044766977906681964L;
        hf.ekkp[31] = 4352654215347988256L;
        hf.ekkp[32] = 6801101708021102868L;
        hf.ekkp[33] = 5970500979590727994L;
        hf.ekkp[34] = 353451336001505817L;
        hf.ekkp[35] = 1611873536542144593L;
        hf.ekkp[36] = 1272273724684193676L;
        hf.ekkp[37] = 839624768492152251L;
        hf.ekkp[38] = -5048690123142339256L;
        hf.ekkp[39] = -6734444007757562904L;
        hf.ekkp[40] = -6202688834631971440L;
        hf.ekkp[41] = -8976012050024274743L;
        hf.ekkp[42] = 7909497306857339612L;
        hf.ekkp[43] = 7846075838985683374L;
        hf.ekkp[44] = 324525883551632944L;
        hf.ekkp[45] = 7924058818196589697L;
        hf.ekkp[46] = -3541063885401324137L;
        hf.ekkp[47] = 1878981670052337469L;
        hf.ekkp[48] = 1255905401137394356L;
        hf.ekkp[49] = -6250277742539413108L;
        hf.ekkp[50] = -7898658734999531078L;
        hf.ekkp[51] = 2333901411856077575L;
        hf.ekkp[52] = -4956360067699442431L;
        hf.ekkp[53] = 54158388005577528L;
        hf.ekkp[54] = -3712012736632991747L;
        hf.ekkp[55] = -3781836432773495366L;
        hf.ekkp[56] = 3508506279968737126L;
        hf.ekkp[57] = 8801181878735236489L;
        hf.ekkp[58] = -1514473044069073244L;
        hf.ekkp[59] = 5065606018017448209L;
        hf.ekkp[60] = -8766812642067477565L;
        hf.ekkp[61] = 8605874457059565207L;
        hf.ekkp[62] = -9210621153691971234L;
        hf.ekkp[63] = 4911641637248099037L;
        hf.ekkp[64] = -8632470733785077966L;
        hf.ekkp[65] = -7791682663507383655L;
        hf.ekkp[66] = -5141398364466423963L;
        hf.ekkp[67] = -6095686489040019484L;
        hf.ekkp[68] = -7670514324521477720L;
        hf.ekkp[69] = 4983592323130590023L;
        hf.ekkp[70] = -8314081692420836946L;
        hf.ekkp[71] = -6724542410851150669L;
        hf.ekkp[72] = 7555303699542644051L;
        hf.ekkp[73] = -9071487322864901810L;
        hf.ekkp[74] = 8818490513208986963L;
        hf.ekkp[75] = 1347926555494305694L;
        hf.ekkp[76] = -2860414818187891467L;
        hf.ekkp[77] = -3403678142543074486L;
        hf.ekkp[78] = 4812662700656222621L;
        hf.ekkp[79] = -4664148350680811203L;
        hf.ekkp[80] = -7156464531629142386L;
        hf.ekkp[81] = 7939309309327070975L;
        hf.ekkp[82] = -4793186132161720753L;
        hf.ekkp[83] = 5379378198426433161L;
        hf.ekkp[84] = -2852259055439757754L;
        hf.ekkp[85] = -6831014866629644323L;
        hf.ekkp[86] = 8469291463765761044L;
        hf.ekkp[87] = 3213962625084157177L;
        hf.ekkp[88] = -3834049600085435786L;
        hf.ekkp[89] = -480213280301616877L;
        hf.ekkp[90] = -8340452744348353192L;
        hf.ekkp[91] = 3735642220795999221L;
        hf.ekkp[92] = -5721102625002491208L;
        hf.ekkp[93] = 999026507648834808L;
        hf.ekkp[94] = -2149501220603022633L;
        hf.ekkp[95] = -462964647920186881L;
        hf.ekkp[96] = 7518033256713216513L;
        hf.ekkp[97] = -8213284689972833152L;
        hf.ekkp[98] = 7077942804524917744L;
        hf.ekkp[99] = 4240653923564242240L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void stopEating() {
        block69: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hf.ku - hf.ekju("elrz", ekko(int ), (int)285)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == hf.ekju("elsa", ekjy(int ), (int)410)) break;
                v0 /* !! */  = (long)hf.ekju("elsb", ekjy(int ), (int)411);
            }
            var3_1 = hf.c;
            v1 /* !! */  = hf.ku;
            if (true) ** GOTO lbl11
            block50: while (true) {
                v1 /* !! */  = (long)(hf.ekju("elsd", ekko(int ), (int)287) - hf.ekju("elsc", ekko(int ), (int)286));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1154754312: {
                        continue block50;
                    }
                    case -273819947: {
                        break block50;
                    }
                }
                break;
            }
            var2_2 = hf.b;
            v2 /* !! */  = hf.ku;
            if (true) ** GOTO lbl21
            block51: while (true) {
                v2 /* !! */  = (long)(v3 - hf.ekju("else", ekko(int ), (int)288));
lbl21:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -273819947: {
                        break block51;
                    }
                    case 74083019: {
                        v3 = hf.ekju("elsf", ekko(int ), (int)289);
                        continue block51;
                    }
                    case 825429946: {
                        v3 = hf.ekju("elsg", ekko(int ), (int)290);
                        continue block51;
                    }
                }
                break;
            }
            var1_3 = hf.a;
            if (var3_1) {
                throw null;
lbl33:
                // 9 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl33
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = hf.ku - hf.ekju("elsh", ekko(int ), (int)291)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == hf.ekju("elsi", ekjy(int ), (int)412)) break;
                v4 /* !! */  = (long)hf.ekju("elsj", ekjy(int ), (int)413);
            }
            if (!this.isEating) break block69;
            if (var1_3 || var1_3) ** GOTO lbl33
            v5 /* !! */  = hf.ku;
            if (true) ** GOTO lbl47
            block54: while (true) {
                v5 /* !! */  = (long)(hf.ekju("elsm", ekko(int ), (int)293) - hf.ekju("elsk", ekko(int ), (int)292));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -273819947: {
                        break block54;
                    }
                    case -42799943: {
                        continue block54;
                    }
                }
                break;
            }
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_2 = hf.ku - hf.ekju("elsn", ekko(int ), (int)294)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == hf.ekju("elso", ekjy(int ), (int)414)) break;
                v6 /* !! */  = (long)hf.ekju("elsq", ekjy(int ), (int)415);
            }
            v7 = hf.mc.field_1690;
            v8 /* !! */  = hf.ku;
            if (true) ** GOTO lbl62
            block56: while (true) {
                v8 /* !! */  = (long)(v9 - hf.ekju("elsr", ekko(int ), (int)295));
lbl62:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -273819947: {
                        break block56;
                    }
                    case 392346250: {
                        v9 = hf.ekju("elss", ekko(int ), (int)296);
                        continue block56;
                    }
                    case 444540410: {
                        v9 = hf.ekju("elst", ekko(int ), (int)297);
                        continue block56;
                    }
                    case 1359704744: {
                        v9 = hf.ekju("elsu", ekko(int ), (int)298);
                        continue block56;
                    }
                }
                break;
            }
            v10 = v7.field_1904;
            v11 = hf.ekju("elsv", ekjy(int ), (int)416);
            v12 /* !! */  = hf.ku;
            if (true) ** GOTO lbl80
            block57: while (true) {
                v12 /* !! */  = (long)(hf.ekju("elsz", ekko(int ), (int)300) - hf.ekju("elsw", ekko(int ), (int)299));
lbl80:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -1782230846: {
                        continue block57;
                    }
                    case -273819947: {
                        break block57;
                    }
                }
                break;
            }
            v10.method_23481((boolean)v11);
            if (var1_3 || var1_3) ** GOTO lbl33
            v13 = hf.ekju("eltb", ekjy(int ), (int)417);
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_3 = hf.ku - hf.ekju("eltc", ekko(int ), (int)301)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == hf.ekju("elte", ekjy(int ), (int)418)) break;
                v14 /* !! */  = (long)hf.ekju("eltf", ekjy(int ), (int)419);
            }
            this.isEating = v13;
            if (var1_3 || var1_3) ** GOTO lbl33
            v15 /* !! */  = hf.ku;
            if (true) ** GOTO lbl99
            block59: while (true) {
                v15 /* !! */  = (long)(hf.ekju("elti", ekko(int ), (int)303) - hf.ekju("eltg", ekko(int ), (int)302));
lbl99:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -273819947: {
                        break block59;
                    }
                    case -60732826: {
                        continue block59;
                    }
                }
                break;
            }
            if (this.previousSlot == hf.ekju("eltl", ekjy(int ), (int)420)) break block69;
            if (var1_3) ** GOTO lbl33
            v16 /* !! */  = hf.ku;
            if (true) ** GOTO lbl110
            block60: while (true) {
                v16 /* !! */  = (long)(hf.ekju("eltn", ekko(int ), (int)305) - hf.ekju("eltm", ekko(int ), (int)304));
lbl110:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case -400295773: {
                        continue block60;
                    }
                    case -273819947: {
                        break block60;
                    }
                }
                break;
            }
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_4 = hf.ku - hf.ekju("elto", ekko(int ), (int)306)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == hf.ekju("eltp", ekjy(int ), (int)421)) break;
                v17 /* !! */  = (long)hf.ekju("eltq", ekjy(int ), (int)422);
            }
            if (!this.returnSlot.isValue()) break block69;
            if (var1_3 || var1_3) ** GOTO lbl33
            v18 /* !! */  = hf.ku;
            if (true) ** GOTO lbl126
            block62: while (true) {
                v18 /* !! */  = (long)(v19 - hf.ekju("eltt", ekko(int ), (int)307));
lbl126:
                // 2 sources

                switch ((int)v18 /* !! */ ) {
                    case -273819947: {
                        break block62;
                    }
                    case 735745528: {
                        v19 = hf.ekju("eltw", ekko(int ), (int)308);
                        continue block62;
                    }
                    case 1248457810: {
                        v19 = hf.ekju("elty", ekko(int ), (int)309);
                        continue block62;
                    }
                }
                break;
            }
            while (true) {
                if ((v20 /* !! */  = (cfr_temp_5 = hf.ku - hf.ekju("elua", ekko(int ), (int)310)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v20 /* !! */  == hf.ekju("eluc", ekjy(int ), (int)423)) break;
                v20 /* !! */  = (long)hf.ekju("elud", ekjy(int ), (int)424);
            }
            v21 = hf.mc.field_1724;
            v22 /* !! */  = hf.ku;
            if (true) ** GOTO lbl145
            block64: while (true) {
                v22 /* !! */  = (long)(hf.ekju("eluf", ekko(int ), (int)312) - hf.ekju("elue", ekko(int ), (int)311));
lbl145:
                // 2 sources

                switch ((int)v22 /* !! */ ) {
                    case -1373664037: {
                        continue block64;
                    }
                    case -273819947: {
                        break block64;
                    }
                }
                break;
            }
            v23 = v21.method_31548();
            v24 /* !! */  = hf.ku;
            if (true) ** GOTO lbl155
            block65: while (true) {
                v24 /* !! */  = (long)(v25 - hf.ekju("eluh", ekko(int ), (int)313));
lbl155:
                // 2 sources

                switch ((int)v24 /* !! */ ) {
                    case -1870531461: {
                        v25 = hf.ekju("eluj", ekko(int ), (int)314);
                        continue block65;
                    }
                    case -273819947: {
                        break block65;
                    }
                    case 2057606681: {
                        v25 = hf.ekju("elul", ekko(int ), (int)315);
                        continue block65;
                    }
                }
                break;
            }
            v26 /* !! */  = hf.ku;
            if (true) ** GOTO lbl168
            block66: while (true) {
                v26 /* !! */  = (long)(hf.ekju("eluq", ekko(int ), (int)317) - hf.ekju("elun", ekko(int ), (int)316));
lbl168:
                // 2 sources

                switch ((int)v26 /* !! */ ) {
                    case -273819947: {
                        break block66;
                    }
                    case 1608867045: {
                        continue block66;
                    }
                }
                break;
            }
            v23.method_61496(this.previousSlot);
            if (var1_3 || var1_3) ** GOTO lbl33
            v27 = hf.ekju("elus", ekjy(int ), (int)425);
            while (true) {
                if ((v28 /* !! */  = (cfr_temp_6 = hf.ku - hf.ekju("elut", ekko(int ), (int)318)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v28 /* !! */  == hf.ekju("eluu", ekjy(int ), (int)426)) break;
                v28 /* !! */  = (long)hf.ekju("eluv", ekjy(int ), (int)427);
            }
            this.previousSlot = (int)v27;
            if (var1_3) ** GOTO lbl33
        }
        if (!var1_3 && !var1_3) ** break;
        ** while (true)
    }

    private static /* synthetic */ float ekjr(int n2) {
        return Float.intBitsToFloat(ekjs[n2] ^ ekjt[n2]);
    }

    private static /* synthetic */ void emej() {
        hf.ekjt[200] = 2101297903;
        hf.ekjt[201] = 810540135;
        hf.ekjt[202] = -1644572948;
        hf.ekjt[203] = -1087291661;
        hf.ekjt[204] = 1313268375;
        hf.ekjt[205] = -784279096;
        hf.ekjt[206] = -886262847;
        hf.ekjt[207] = 358732957;
        hf.ekjt[208] = 548139535;
        hf.ekjt[209] = 621028448;
        hf.ekjt[210] = 713183497;
        hf.ekjt[211] = 956162866;
        hf.ekjt[212] = -717854154;
        hf.ekjt[213] = -1691087251;
        hf.ekjt[214] = -252136668;
        hf.ekjt[215] = -1929872606;
        hf.ekjt[216] = -1584361901;
        hf.ekjt[217] = 1144795014;
        hf.ekjt[218] = 1848486243;
        hf.ekjt[219] = 1026570733;
        hf.ekjt[220] = 146872304;
        hf.ekjt[221] = -1318788851;
        hf.ekjt[222] = 1165839857;
        hf.ekjt[223] = 1144407996;
        hf.ekjt[224] = 275108656;
        hf.ekjt[225] = 144079404;
        hf.ekjt[226] = 257074470;
        hf.ekjt[227] = 598934614;
        hf.ekjt[228] = 1134421482;
        hf.ekjt[229] = -132996202;
        hf.ekjt[230] = -58148039;
        hf.ekjt[231] = -215565468;
        hf.ekjt[232] = 747947528;
        hf.ekjt[233] = 1613826868;
        hf.ekjt[234] = 2066566999;
        hf.ekjt[235] = 1311328369;
        hf.ekjt[236] = 788330178;
        hf.ekjt[237] = 326798902;
        hf.ekjt[238] = -265254749;
        hf.ekjt[239] = -1347979463;
        hf.ekjt[240] = -627838383;
        hf.ekjt[241] = 1624906385;
        hf.ekjt[242] = -2117663771;
        hf.ekjt[243] = 829209271;
        hf.ekjt[244] = -672824414;
        hf.ekjt[245] = -1470820536;
        hf.ekjt[246] = -265226931;
        hf.ekjt[247] = 1188039687;
        hf.ekjt[248] = -1454669215;
        hf.ekjt[249] = 462297170;
        hf.ekjt[250] = 199297455;
        hf.ekjt[251] = 366888856;
        hf.ekjt[252] = 931153333;
        hf.ekjt[253] = -2142089336;
        hf.ekjt[254] = -626243123;
        hf.ekjt[255] = 2041870522;
        hf.ekjt[256] = 1246731048;
        hf.ekjt[257] = -1620963842;
        hf.ekjt[258] = -1686762530;
        hf.ekjt[259] = -1630893358;
        hf.ekjt[260] = -514799225;
        hf.ekjt[261] = -456853508;
        hf.ekjt[262] = -1181535142;
        hf.ekjt[263] = -1937615735;
        hf.ekjt[264] = -604353369;
        hf.ekjt[265] = 1989442660;
        hf.ekjt[266] = -395420642;
        hf.ekjt[267] = 1538115501;
        hf.ekjt[268] = 1403732724;
        hf.ekjt[269] = -2085066212;
        hf.ekjt[270] = 2137396840;
        hf.ekjt[271] = 1899999960;
        hf.ekjt[272] = -119383140;
        hf.ekjt[273] = -500003593;
        hf.ekjt[274] = -311662394;
        hf.ekjt[275] = 1092431026;
        hf.ekjt[276] = 918412698;
        hf.ekjt[277] = 1977328582;
        hf.ekjt[278] = 991299234;
        hf.ekjt[279] = -1044345409;
        hf.ekjt[280] = 336053437;
        hf.ekjt[281] = -1566006059;
        hf.ekjt[282] = -1530609563;
        hf.ekjt[283] = -122723265;
        hf.ekjt[284] = 446828408;
        hf.ekjt[285] = -338105559;
        hf.ekjt[286] = -1283062386;
        hf.ekjt[287] = -1841714253;
        hf.ekjt[288] = -1930545911;
        hf.ekjt[289] = -780765024;
        hf.ekjt[290] = 2112364231;
        hf.ekjt[291] = -445047662;
        hf.ekjt[292] = 1157794442;
        hf.ekjt[293] = 1457915491;
        hf.ekjt[294] = -1639900479;
        hf.ekjt[295] = 1972571800;
        hf.ekjt[296] = 72354461;
        hf.ekjt[297] = -1550708723;
        hf.ekjt[298] = -2123546587;
        hf.ekjt[299] = -1034798055;
    }

    private static /* synthetic */ void emcx() {
        hf.ekjs[200] = 2101297902;
        hf.ekjs[201] = -1390253809;
        hf.ekjs[202] = -1644572947;
        hf.ekjs[203] = -1087291661;
        hf.ekjs[204] = 1313268373;
        hf.ekjs[205] = -784279098;
        hf.ekjs[206] = -886262842;
        hf.ekjs[207] = 358732947;
        hf.ekjs[208] = 548139521;
        hf.ekjs[209] = 621028463;
        hf.ekjs[210] = 713183491;
        hf.ekjs[211] = 956162871;
        hf.ekjs[212] = -717854145;
        hf.ekjs[213] = -1691087249;
        hf.ekjs[214] = -252136659;
        hf.ekjs[215] = -1929872603;
        hf.ekjs[216] = -1584361890;
        hf.ekjs[217] = 1144795021;
        hf.ekjs[218] = 1848486244;
        hf.ekjs[219] = 1026570734;
        hf.ekjs[220] = 146872319;
        hf.ekjs[221] = -1318788852;
        hf.ekjs[222] = -1120213150;
        hf.ekjs[223] = 2054814376;
        hf.ekjs[224] = -275108657;
        hf.ekjs[225] = -1298687124;
        hf.ekjs[226] = -257074471;
        hf.ekjs[227] = 394842033;
        hf.ekjs[228] = 1134421483;
        hf.ekjs[229] = -1184605980;
        hf.ekjs[230] = -58148039;
        hf.ekjs[231] = -215565468;
        hf.ekjs[232] = 747947522;
        hf.ekjs[233] = 1613826864;
        hf.ekjs[234] = 2066566992;
        hf.ekjs[235] = 1311328372;
        hf.ekjs[236] = 788330183;
        hf.ekjs[237] = 326798902;
        hf.ekjs[238] = -265254749;
        hf.ekjs[239] = -1347979462;
        hf.ekjs[240] = -627838373;
        hf.ekjs[241] = 1624906385;
        hf.ekjs[242] = 2117663770;
        hf.ekjs[243] = -273723376;
        hf.ekjs[244] = -672824413;
        hf.ekjs[245] = -1470820536;
        hf.ekjs[246] = -265226939;
        hf.ekjs[247] = 1188039682;
        hf.ekjs[248] = -1454669207;
        hf.ekjs[249] = 462297170;
        hf.ekjs[250] = 199297450;
        hf.ekjs[251] = 366888863;
        hf.ekjs[252] = 931153329;
        hf.ekjs[253] = -2142089344;
        hf.ekjs[254] = -626243123;
        hf.ekjs[255] = 2041870515;
        hf.ekjs[256] = 1246731049;
        hf.ekjs[257] = 2124147756;
        hf.ekjs[258] = -1686762529;
        hf.ekjs[259] = 529048033;
        hf.ekjs[260] = -514799225;
        hf.ekjs[261] = -456853508;
        hf.ekjs[262] = -1181535149;
        hf.ekjs[263] = -1937615736;
        hf.ekjs[264] = 1730828245;
        hf.ekjs[265] = -1989442661;
        hf.ekjs[266] = 1236607186;
        hf.ekjs[267] = 1538115500;
        hf.ekjs[268] = 1403732724;
        hf.ekjs[269] = -2085066228;
        hf.ekjs[270] = 2137396856;
        hf.ekjs[271] = 1899999955;
        hf.ekjs[272] = -119383143;
        hf.ekjs[273] = -500003610;
        hf.ekjs[274] = -311662397;
        hf.ekjs[275] = 1092431032;
        hf.ekjs[276] = 918412688;
        hf.ekjs[277] = 1977328591;
        hf.ekjs[278] = 991299250;
        hf.ekjs[279] = -1044345412;
        hf.ekjs[280] = 336053436;
        hf.ekjs[281] = -1566006075;
        hf.ekjs[282] = -1530609559;
        hf.ekjs[283] = -122723269;
        hf.ekjs[284] = 446828393;
        hf.ekjs[285] = -338105567;
        hf.ekjs[286] = -1283062385;
        hf.ekjs[287] = -1841714249;
        hf.ekjs[288] = -1930545912;
        hf.ekjs[289] = -1864447163;
        hf.ekjs[290] = -2112364232;
        hf.ekjs[291] = 982568004;
        hf.ekjs[292] = 1157794443;
        hf.ekjs[293] = -1638700246;
        hf.ekjs[294] = -1639900479;
        hf.ekjs[295] = 1972571801;
        hf.ekjs[296] = 72354461;
        hf.ekjs[297] = -1550708723;
        hf.ekjs[298] = -2123546577;
        hf.ekjs[299] = -1034798052;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public kg getHealthThreshold() {
        boolean bl2;
        Object object = ku;
        boolean bl3 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - hf.ekju("elwc", ekko(int ), (int)319);
            }
            switch ((int)object) {
                case -1487926237: {
                    callSite = hf.ekju("elwe", ekko(int ), (int)320);
                    continue block16;
                }
                case -273819947: {
                    break block16;
                }
                case 874070207: {
                    callSite = hf.ekju("elwf", ekko(int ), (int)321);
                    continue block16;
                }
                case 1439102948: {
                    callSite = hf.ekju("elwg", ekko(int ), (int)322);
                    continue block16;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = ku;
        block17: while (true) {
            switch ((int)object2) {
                case -273819947: {
                    break block17;
                }
                case 203801667: {
                    object2 = hf.ekju("elwj", ekko(int ), (int)324) - hf.ekju("elwi", ekko(int ), (int)323);
                    continue block17;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = ku - hf.ekju("elwm", ekko(int ), (int)325)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == hf.ekju("elwn", ekjy(int ), (int)446)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = hf.ekju("elwp", ekjy(int ), (int)447);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object4 = ku;
        boolean bl5 = true;
        block19: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite - hf.ekju("elwq", ekko(int ), (int)326);
            }
            switch ((int)object4) {
                case -1875273928: {
                    callSite = hf.ekju("elwr", ekko(int ), (int)327);
                    continue block19;
                }
                case -273819947: {
                    return this.healthThreshold;
                }
                case 37082023: {
                    callSite = hf.ekju("elws", ekko(int ), (int)328);
                    continue block19;
                }
                case 1524653409: {
                    callSite = hf.ekju("elwt", ekko(int ), (int)329);
                    continue block19;
                }
            }
            break;
        }
        return this.healthThreshold;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void swapToGappleSlot() {
        block100: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hf.ku - hf.ekju("eljv", ekko(int ), (int)227)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == hf.ekju("eljw", ekjy(int ), (int)343)) break;
                v0 /* !! */  = (long)hf.ekju("eljx", ekjy(int ), (int)344);
            }
            var5_1 = hf.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = hf.ku - hf.ekju("elka", ekko(int ), (int)228)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == hf.ekju("elkb", ekjy(int ), (int)345)) break;
                v1 /* !! */  = (long)hf.ekju("elkc", ekjy(int ), (int)346);
            }
            var4_2 /* !! */  = hf.b;
            v2 /* !! */  = hf.ku;
            if (true) ** GOTO lbl17
            block64: while (true) {
                v2 /* !! */  = (long)(hf.ekju("elke", ekko(int ), (int)230) - hf.ekju("elkd", ekko(int ), (int)229));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -273819947: {
                        break block64;
                    }
                    case -22558040: {
                        continue block64;
                    }
                }
                break;
            }
            var3_3 = hf.a;
            if (var5_1) {
                throw null;
lbl25:
                // 13 sources

                return;
            }
            if (var3_3 || var3_3) ** GOTO lbl25
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = hf.ku - hf.ekju("elkf", ekko(int ), (int)231)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == hf.ekju("elkg", ekjy(int ), (int)347)) break;
                v3 /* !! */  = (long)hf.ekju("elkh", ekjy(int ), (int)348);
            }
            var1_4 = this.findGappleInHotbar();
            if (var3_3 || var3_3) ** GOTO lbl25
            if (var1_4 != hf.ekju("elki", ekjy(int ), (int)349)) break block100;
            if (var3_3) ** GOTO lbl25
            return;
        }
        if (var3_3) ** GOTO lbl25
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3) ** GOTO lbl25
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = hf.ku - hf.ekju("elkk", ekko(int ), (int)232)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == hf.ekju("elkm", ekjy(int ), (int)350)) break;
                    v4 /* !! */  = (long)hf.ekju("elko", ekjy(int ), (int)351);
                }
                v5 /* !! */  = hf.ku;
                if (true) ** GOTO lbl53
                block68: while (true) {
                    v5 /* !! */  = (long)(v6 - hf.ekju("elkq", ekko(int ), (int)233));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1016672569: {
                            v6 = hf.ekju("elks", ekko(int ), (int)234);
                            continue block68;
                        }
                        case -553148111: {
                            v6 = hf.ekju("elkt", ekko(int ), (int)235);
                            continue block68;
                        }
                        case -273819947: {
                            break block68;
                        }
                    }
                    break;
                }
                v7 = hf.mc.field_1724;
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = hf.ku - hf.ekju("elku", ekko(int ), (int)236)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == hf.ekju("elkv", ekjy(int ), (int)352)) break;
                    v8 /* !! */  = (long)hf.ekju("elkx", ekjy(int ), (int)353);
                }
                v9 = v7.method_31548();
                v10 /* !! */  = hf.ku;
                if (true) ** GOTO lbl73
                block70: while (true) {
                    v10 /* !! */  = (long)(v11 - hf.ekju("elkz", ekko(int ), (int)237));
lbl73:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -2005026967: {
                            v11 = hf.ekju("ella", ekko(int ), (int)238);
                            continue block70;
                        }
                        case -273819947: {
                            break block70;
                        }
                        case 1921134190: {
                            v11 = hf.ekju("ellf", ekko(int ), (int)239);
                            continue block70;
                        }
                    }
                    break;
                }
                var2_5 = v9.method_67532();
                if (var3_3 || var3_3) ** GOTO lbl25
                if (var2_5 == var1_4) ** GOTO lbl168
                if (var3_3 || var3_3) ** GOTO lbl25
                v12 /* !! */  = hf.ku;
                if (true) ** GOTO lbl90
                block71: while (true) {
                    v12 /* !! */  = (long)(v13 - hf.ekju("ellg", ekko(int ), (int)240));
lbl90:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -2016435758: {
                            v13 = hf.ekju("ellh", ekko(int ), (int)241);
                            continue block71;
                        }
                        case -273819947: {
                            break block71;
                        }
                        case 1592581492: {
                            v13 = hf.ekju("elli", ekko(int ), (int)242);
                            continue block71;
                        }
                        case 1944940254: {
                            v13 = hf.ekju("ellj", ekko(int ), (int)243);
                            continue block71;
                        }
                    }
                    break;
                }
                if (this.previousSlot != hf.ekju("ellk", ekjy(int ), (int)354)) ** GOTO lbl135
                if (var3_3) ** GOTO lbl25
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_5 = hf.ku - hf.ekju("ellm", ekko(int ), (int)244)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == hf.ekju("ellr", ekjy(int ), (int)355)) break;
                    v14 /* !! */  = (long)hf.ekju("ellt", ekjy(int ), (int)356);
                }
                v15 /* !! */  = hf.ku;
                if (true) ** GOTO lbl113
                block73: while (true) {
                    v15 /* !! */  = (long)(v16 - hf.ekju("ellv", ekko(int ), (int)245));
lbl113:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -273819947: {
                            break block73;
                        }
                        case 1005882334: {
                            v16 = hf.ekju("ellw", ekko(int ), (int)246);
                            continue block73;
                        }
                        case 1564965886: {
                            v16 = hf.ekju("ellx", ekko(int ), (int)247);
                            continue block73;
                        }
                    }
                    break;
                }
                if (!this.returnSlot.isValue()) ** GOTO lbl135
                if (var3_3 || var3_3) ** GOTO lbl25
                v17 /* !! */  = hf.ku;
                if (true) ** GOTO lbl128
                block74: while (true) {
                    v17 /* !! */  = (long)(hf.ekju("elma", ekko(int ), (int)249) - hf.ekju("elly", ekko(int ), (int)248));
lbl128:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -273819947: {
                            break block74;
                        }
                        case 1730654635: {
                            continue block74;
                        }
                    }
                    break;
                }
                this.previousSlot = var2_5;
                if (var3_3) ** GOTO lbl25
lbl135:
                // 3 sources

                if (var3_3 || var3_3) ** GOTO lbl25
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_6 = hf.ku - hf.ekju("elmd", ekko(int ), (int)250)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == hf.ekju("elme", ekjy(int ), (int)357)) break;
                    v18 /* !! */  = (long)hf.ekju("elmh", ekjy(int ), (int)358);
                }
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_7 = hf.ku - hf.ekju("elmi", ekko(int ), (int)251)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == hf.ekju("elmj", ekjy(int ), (int)359)) break;
                    v19 /* !! */  = (long)hf.ekju("elmk", ekjy(int ), (int)360);
                }
                v20 = hf.mc.field_1724;
                v21 /* !! */  = hf.ku;
                if (true) ** GOTO lbl151
                block77: while (true) {
                    v21 /* !! */  = (long)(hf.ekju("elmo", ekko(int ), (int)253) - hf.ekju("elmn", ekko(int ), (int)252));
lbl151:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -273819947: {
                            break block77;
                        }
                        case 1259359957: {
                            continue block77;
                        }
                    }
                    break;
                }
                v22 = v20.method_31548();
                v23 /* !! */  = hf.ku;
                if (true) ** GOTO lbl161
                block78: while (true) {
                    v23 /* !! */  = (long)(hf.ekju("elmq", ekko(int ), (int)255) - hf.ekju("elmp", ekko(int ), (int)254));
lbl161:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -283100387: {
                            continue block78;
                        }
                        case -273819947: {
                            break block78;
                        }
                    }
                    break;
                }
                v22.method_61496(var1_4);
                if (var3_3) ** GOTO lbl25
lbl168:
                // 2 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return;
            }
lbl171:
            // 4 sources

            case 0: {
                var4_2 /* !! */  = (int)hf.ekju("elmt", ekjy(int ), (int)361);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl225
            }
lbl176:
            // 2 sources

            case 1: {
                var4_2 /* !! */  = (int)hf.ekju("elmv", ekjy(int ), (int)362);
                if (!var5_1) ** GOTO lbl171
                throw null;
            }
lbl180:
            // 2 sources

            case 2: {
                var4_2 /* !! */  = (int)hf.ekju("elmx", ekjy(int ), (int)363);
                if (var5_1) {
                    throw null;
                }
            }
            case 3: {
                var4_2 /* !! */  = (int)hf.ekju("elnb", ekjy(int ), (int)364);
                if (!var5_1) ** GOTO lbl176
                throw null;
            }
            case 4: {
                var4_2 /* !! */  = (int)hf.ekju("elnc", ekjy(int ), (int)365);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl220
            }
            case 5: {
                var4_2 /* !! */  = (int)hf.ekju("elnd", ekjy(int ), (int)366);
                if (!var5_1) ** GOTO lbl171
                throw null;
            }
            case 6: {
                var4_2 /* !! */  = (int)hf.ekju("elng", ekjy(int ), (int)367);
                if (var5_1) {
                    throw null;
                }
            }
            case 7: {
                var4_2 /* !! */  = (int)hf.ekju("elni", ekjy(int ), (int)368);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl266
            }
lbl206:
            // 2 sources

            case 8: {
                var4_2 /* !! */  = (int)hf.ekju("elnk", ekjy(int ), (int)369);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl220
            }
            case 9: {
                var4_2 /* !! */  = (int)hf.ekju("elnm", ekjy(int ), (int)370);
                if (!var5_1) ** GOTO lbl180
                throw null;
            }
lbl215:
            // 3 sources

            case 10: {
                var4_2 /* !! */  = (int)hf.ekju("elno", ekjy(int ), (int)371);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl220:
            // 3 sources

            case 11: {
                var4_2 /* !! */  = (int)hf.ekju("elnp", ekjy(int ), (int)372);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl225:
            // 3 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)hf.ekju("elnq", ekjy(int ), (int)373);
                    if (!var5_1) ** GOTO lbl215
                    throw null;
                }
            }
            case 13: {
                var4_2 /* !! */  = (int)hf.ekju("elnr", ekjy(int ), (int)374);
                if (!var5_1) ** GOTO lbl215
                throw null;
            }
            case 14: {
                var4_2 /* !! */  = (int)hf.ekju("elnu", ekjy(int ), (int)375);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl239:
            // 3 sources

            case 15: {
                var4_2 /* !! */  = (int)hf.ekju("elnx", ekjy(int ), (int)376);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl244:
            // 2 sources

            case 16: {
                var4_2 /* !! */  = (int)hf.ekju("elny", ekjy(int ), (int)377);
                if (!var5_1) ** GOTO lbl225
                throw null;
            }
            case 17: {
                var4_2 /* !! */  = (int)hf.ekju("eloc", ekjy(int ), (int)378);
                if (!var5_1) ** GOTO lbl206
                throw null;
            }
            case 18: {
                do {
                    var4_2 /* !! */  = (int)hf.ekju("elod", ekjy(int ), (int)379);
                } while (!var5_1);
                throw null;
            }
lbl257:
            // 2 sources

            case 19: {
                var4_2 /* !! */  = (int)hf.ekju("eloe", ekjy(int ), (int)380);
                if (!var5_1) ** GOTO lbl239
                throw null;
            }
lbl261:
            // 2 sources

            case 20: {
                do {
                    var4_2 /* !! */  = (int)hf.ekju("elof", ekjy(int ), (int)381);
                } while (!var5_1);
                throw null;
            }
lbl266:
            // 2 sources

            case 21: {
                var4_2 /* !! */  = (int)hf.ekju("elog", ekjy(int ), (int)382);
                if (!var5_1) ** GOTO lbl171
                throw null;
            }
            case 22: 
        }
        var4_2 /* !! */  = (int)hf.ekju("eloi", ekjy(int ), (int)383);
        ** while (!var5_1)
lbl273:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void emca() {
        hf.ekjs[0] = -634414936;
        hf.ekjs[1] = 2132807549;
        hf.ekjs[2] = 149126627;
        hf.ekjs[3] = -1036444341;
        hf.ekjs[4] = -662989814;
        hf.ekjs[5] = 1104830023;
        hf.ekjs[6] = -530921612;
        hf.ekjs[7] = -637871174;
        hf.ekjs[8] = -1581841088;
        hf.ekjs[9] = -713276906;
        hf.ekjs[10] = 838413857;
        hf.ekjs[11] = -1384938576;
        hf.ekjs[12] = -1776369609;
        hf.ekjs[13] = 567736783;
        hf.ekjs[14] = -1799877864;
        hf.ekjs[15] = 1035306680;
        hf.ekjs[16] = -1195429448;
        hf.ekjs[17] = -216607248;
        hf.ekjs[18] = 1000024029;
        hf.ekjs[19] = -1789893874;
        hf.ekjs[20] = 854732323;
        hf.ekjs[21] = -556332341;
        hf.ekjs[22] = -1278202294;
        hf.ekjs[23] = -1512844004;
        hf.ekjs[24] = -45482112;
        hf.ekjs[25] = -577440746;
        hf.ekjs[26] = -1669130217;
        hf.ekjs[27] = 91339438;
        hf.ekjs[28] = -584066131;
        hf.ekjs[29] = 1895754731;
        hf.ekjs[30] = -217233060;
        hf.ekjs[31] = -1744699522;
        hf.ekjs[32] = 1111945566;
        hf.ekjs[33] = 925274151;
        hf.ekjs[34] = 814349336;
        hf.ekjs[35] = 288679622;
        hf.ekjs[36] = 594210420;
        hf.ekjs[37] = -1413199953;
        hf.ekjs[38] = -952047255;
        hf.ekjs[39] = -1867615135;
        hf.ekjs[40] = 1140591827;
        hf.ekjs[41] = -447051310;
        hf.ekjs[42] = 1378677631;
        hf.ekjs[43] = 1244712282;
        hf.ekjs[44] = 1567634085;
        hf.ekjs[45] = 182024198;
        hf.ekjs[46] = -1765162564;
        hf.ekjs[47] = 362065805;
        hf.ekjs[48] = 1687627509;
        hf.ekjs[49] = 376806880;
        hf.ekjs[50] = 459669547;
        hf.ekjs[51] = -1242380325;
        hf.ekjs[52] = 1643604975;
        hf.ekjs[53] = 1372840590;
        hf.ekjs[54] = 1404953314;
        hf.ekjs[55] = 1271829687;
        hf.ekjs[56] = -212886415;
        hf.ekjs[57] = 640877563;
        hf.ekjs[58] = 15141121;
        hf.ekjs[59] = 211389317;
        hf.ekjs[60] = -803454883;
        hf.ekjs[61] = -2092192624;
        hf.ekjs[62] = 348465380;
        hf.ekjs[63] = -1410063122;
        hf.ekjs[64] = 129759673;
        hf.ekjs[65] = -335577336;
        hf.ekjs[66] = -840308900;
        hf.ekjs[67] = -169530218;
        hf.ekjs[68] = -861404816;
        hf.ekjs[69] = 1474097721;
        hf.ekjs[70] = -180316375;
        hf.ekjs[71] = -1933211215;
        hf.ekjs[72] = -663947682;
        hf.ekjs[73] = -819749093;
        hf.ekjs[74] = -1720231568;
        hf.ekjs[75] = -1973760070;
        hf.ekjs[76] = 290910456;
        hf.ekjs[77] = -1708772566;
        hf.ekjs[78] = 175066561;
        hf.ekjs[79] = -1268267824;
        hf.ekjs[80] = 1446002877;
        hf.ekjs[81] = -193307386;
        hf.ekjs[82] = 1087817083;
        hf.ekjs[83] = 412328907;
        hf.ekjs[84] = 915398172;
        hf.ekjs[85] = 909108953;
        hf.ekjs[86] = -1325469301;
        hf.ekjs[87] = 1110792675;
        hf.ekjs[88] = 1760461679;
        hf.ekjs[89] = -1273433425;
        hf.ekjs[90] = -1085384705;
        hf.ekjs[91] = 785523220;
        hf.ekjs[92] = -228760515;
        hf.ekjs[93] = -1062565447;
        hf.ekjs[94] = -810722653;
        hf.ekjs[95] = -1568300926;
        hf.ekjs[96] = 2137172231;
        hf.ekjs[97] = -1257835836;
        hf.ekjs[98] = -1131978171;
        hf.ekjs[99] = -1384160836;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kb getSmartMode() {
        v0 /* !! */  = hf.ku;
        if (true) ** GOTO lbl5
        block11: while (true) {
            v0 /* !! */  = (long)(v1 - hf.ekju("elxc", ekko(int ), (int)330));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -273819947: {
                    break block11;
                }
                case 0xB69BBB9: {
                    v1 = hf.ekju("elxe", ekko(int ), (int)331);
                    continue block11;
                }
                case 435510098: {
                    v1 = hf.ekju("elxh", ekko(int ), (int)332);
                    continue block11;
                }
            }
            break;
        }
        var3_1 = hf.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hf.ku - hf.ekju("elxi", ekko(int ), (int)333)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hf.ekju("elxj", ekjy(int ), (int)452)) break;
            v2 /* !! */  = (long)hf.ekju("elxk", ekjy(int ), (int)453);
        }
        var2_2 /* !! */  = hf.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hf.ku - hf.ekju("elxl", ekko(int ), (int)334)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hf.ekju("elxm", ekjy(int ), (int)454)) break;
            v3 /* !! */  = (long)hf.ekju("elxo", ekjy(int ), (int)455);
        }
        var1_3 = hf.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = hf.ku - hf.ekju("elxr", ekko(int ), (int)335)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hf.ekju("elxs", ekjy(int ), (int)456)) break;
                    v4 /* !! */  = (long)hf.ekju("elxt", ekjy(int ), (int)457);
                }
                return this.smartMode;
            }
            case 0: {
                var2_2 /* !! */  = (int)hf.ekju("elxv", ekjy(int ), (int)458);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)hf.ekju("elxw", ekjy(int ), (int)459);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hf.ekju("elxy", ekjy(int ), (int)460);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hf.ekju("elyb", ekjy(int ), (int)461);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleEating() {
        v0 /* !! */  = hf.ku;
        if (true) ** GOTO lbl5
        block67: while (true) {
            v0 /* !! */  = (long)(v1 - hf.ekju("eknt", ekko(int ), (int)31));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -273819947: {
                    break block67;
                }
                case 1320607899: {
                    v1 = hf.ekju("eknu", ekko(int ), (int)32);
                    continue block67;
                }
                case 1493906914: {
                    v1 = hf.ekju("eknv", ekko(int ), (int)33);
                    continue block67;
                }
                case 1781220332: {
                    v1 = hf.ekju("eknw", ekko(int ), (int)34);
                    continue block67;
                }
            }
            break;
        }
        var3_1 = hf.c;
        v2 /* !! */  = hf.ku;
        if (true) ** GOTO lbl22
        block68: while (true) {
            v2 /* !! */  = (long)(hf.ekju("ekny", ekko(int ), (int)36) - hf.ekju("eknx", ekko(int ), (int)35));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -494597292: {
                    continue block68;
                }
                case -273819947: {
                    break block68;
                }
            }
            break;
        }
        var2_2 /* !! */  = hf.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = hf.ku - hf.ekju("eknz", ekko(int ), (int)37)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hf.ekju("ekoa", ekjy(int ), (int)67)) break;
            v3 /* !! */  = (long)hf.ekju("ekob", ekjy(int ), (int)68);
        }
        var1_3 = hf.a;
        if (var3_1) {
            throw null;
lbl36:
            // 15 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl36
        v4 /* !! */  = hf.ku;
        if (true) ** GOTO lbl43
        block71: while (true) {
            v4 /* !! */  = (long)(hf.ekju("ekod", ekko(int ), (int)39) - hf.ekju("ekoc", ekko(int ), (int)38));
lbl43:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -273819947: {
                    break block71;
                }
                case 1809820834: {
                    continue block71;
                }
            }
            break;
        }
        if (!this.canEat()) ** GOTO lbl135
        if (var1_3 || var1_3) ** GOTO lbl36
        v5 /* !! */  = hf.ku;
        if (true) ** GOTO lbl54
        block72: while (true) {
            v5 /* !! */  = (long)(v6 - hf.ekju("ekoe", ekko(int ), (int)40));
lbl54:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -2145353823: {
                    v6 = hf.ekju("ekof", ekko(int ), (int)41);
                    continue block72;
                }
                case -273819947: {
                    break block72;
                }
                case 311069775: {
                    v6 = hf.ekju("ekog", ekko(int ), (int)42);
                    continue block72;
                }
            }
            break;
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_1 = hf.ku - hf.ekju("ekoh", ekko(int ), (int)43)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == hf.ekju("ekoi", ekjy(int ), (int)69)) break;
            v7 /* !! */  = (long)hf.ekju("ekoj", ekjy(int ), (int)70);
        }
        if (!this.smartMode.isValue()) ** GOTO lbl109
        if (var1_3 || var1_3) ** GOTO lbl36
        v8 /* !! */  = hf.ku;
        if (true) ** GOTO lbl74
        block74: while (true) {
            v8 /* !! */  = (long)(v9 - hf.ekju("ekok", ekko(int ), (int)44));
lbl74:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1212367991: {
                    v9 = hf.ekju("ekol", ekko(int ), (int)45);
                    continue block74;
                }
                case -273819947: {
                    break block74;
                }
                case 567609332: {
                    v9 = hf.ekju("ekom", ekko(int ), (int)46);
                    continue block74;
                }
                case 1893377408: {
                    v9 = hf.ekju("ekon", ekko(int ), (int)47);
                    continue block74;
                }
            }
            break;
        }
        if (this.hasGappleInHand()) ** GOTO lbl98
        if (var1_3 || var1_3) ** GOTO lbl36
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_2 = hf.ku - hf.ekju("ekoo", ekko(int ), (int)48)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == hf.ekju("ekop", ekjy(int ), (int)71)) break;
            v10 /* !! */  = (long)hf.ekju("ekoq", ekjy(int ), (int)72);
        }
        this.swapToGappleSlot();
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl36
lbl98:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl36
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = hf.ku - hf.ekju("ekor", ekko(int ), (int)49)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == hf.ekju("ekos", ekjy(int ), (int)73)) break;
                    v11 /* !! */  = (long)hf.ekju("ekot", ekjy(int ), (int)74);
                }
                this.startEating();
                if (var1_3) ** GOTO lbl36
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl109:
            // 1 sources

            if (var1_3 || var1_3) ** GOTO lbl36
            v12 /* !! */  = hf.ku;
            if (true) ** GOTO lbl114
            block77: while (true) {
                v12 /* !! */  = (long)(hf.ekju("ekov", ekko(int ), (int)51) - hf.ekju("ekou", ekko(int ), (int)50));
lbl114:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -273819947: {
                        break block77;
                    }
                    case 2058578511: {
                        continue block77;
                    }
                }
                break;
            }
            if (!this.hasGappleInOffhand()) ** GOTO lbl161
            if (var1_3 || var1_3) ** GOTO lbl36
            v13 /* !! */  = hf.ku;
            if (true) ** GOTO lbl125
            block78: while (true) {
                v13 /* !! */  = (long)(hf.ekju("ekox", ekko(int ), (int)53) - hf.ekju("ekow", ekko(int ), (int)52));
lbl125:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -273819947: {
                        break block78;
                    }
                    case 1672018861: {
                        continue block78;
                    }
                }
                break;
            }
            this.startEating();
            if (var1_3) ** GOTO lbl36
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl161
lbl135:
            // 1 sources

            if (var1_3 || var1_3) ** GOTO lbl36
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_4 = hf.ku - hf.ekju("ekoy", ekko(int ), (int)54)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == hf.ekju("ekoz", ekjy(int ), (int)75)) break;
                v14 /* !! */  = (long)hf.ekju("ekpa", ekjy(int ), (int)76);
            }
            if (!this.isEating) ** GOTO lbl161
            if (var1_3) ** GOTO lbl36
            v15 /* !! */  = hf.ku;
            if (true) ** GOTO lbl147
            block80: while (true) {
                v15 /* !! */  = (long)(hf.ekju("ekpc", ekko(int ), (int)56) - hf.ekju("ekpb", ekko(int ), (int)55));
lbl147:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -2125555200: {
                        continue block80;
                    }
                    case -273819947: {
                        break block80;
                    }
                }
                break;
            }
            if (this.shouldContinueEating()) ** GOTO lbl161
            if (var1_3 || var1_3) ** GOTO lbl36
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_5 = hf.ku - hf.ekju("ekpd", ekko(int ), (int)57)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v16 /* !! */  == hf.ekju("ekpe", ekjy(int ), (int)77)) break;
                v16 /* !! */  = (long)hf.ekju("ekpf", ekjy(int ), (int)78);
            }
            this.stopEating();
            if (var1_3) ** GOTO lbl36
lbl161:
            // 6 sources

            if (!var1_3 && !var1_3) ** break;
            ** continue;
            return;
lbl164:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)hf.ekju("ekpg", ekjy(int ), (int)79);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl169:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hf.ekju("ekph", ekjy(int ), (int)80);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl237
            }
            case 2: {
                var2_2 /* !! */  = (int)hf.ekju("ekpi", ekjy(int ), (int)81);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl273
            }
            case 3: {
                do {
                    var2_2 /* !! */  = (int)hf.ekju("ekpj", ekjy(int ), (int)82);
                } while (!var3_1);
                throw null;
            }
lbl184:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)hf.ekju("ekpk", ekjy(int ), (int)83);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl273
            }
lbl189:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)hf.ekju("ekpl", ekjy(int ), (int)84);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl194:
            // 4 sources

            case 6: {
                var2_2 /* !! */  = (int)hf.ekju("ekpm", ekjy(int ), (int)85);
                if (!var3_1) break;
                throw null;
            }
lbl198:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)hf.ekju("ekpn", ekjy(int ), (int)86);
                if (!var3_1) ** GOTO lbl194
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)hf.ekju("ekpo", ekjy(int ), (int)87);
                if (!var3_1) ** GOTO lbl189
                throw null;
            }
lbl206:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)hf.ekju("ekpp", ekjy(int ), (int)88);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl269
            }
            case 10: {
                var2_2 /* !! */  = (int)hf.ekju("ekpq", ekjy(int ), (int)89);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl269
            }
lbl216:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)hf.ekju("ekpr", ekjy(int ), (int)90);
                if (!var3_1) ** GOTO lbl206
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)hf.ekju("ekps", ekjy(int ), (int)91);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl250
            }
            case 13: {
                var2_2 /* !! */  = (int)hf.ekju("ekpt", ekjy(int ), (int)92);
                if (!var3_1) ** GOTO lbl194
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)hf.ekju("ekpu", ekjy(int ), (int)93);
                if (!var3_1) ** GOTO lbl184
                throw null;
            }
            case 15: {
                var2_2 /* !! */  = (int)hf.ekju("ekpv", ekjy(int ), (int)94);
                if (!var3_1) break;
                throw null;
            }
lbl237:
            // 2 sources

            case 16: {
                var2_2 /* !! */  = (int)hf.ekju("ekpw", ekjy(int ), (int)95);
                if (!var3_1) break;
                throw null;
            }
lbl241:
            // 2 sources

            case 17: {
                var2_2 /* !! */  = (int)hf.ekju("ekpx", ekjy(int ), (int)96);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl277
            }
            case 18: {
                var2_2 /* !! */  = (int)hf.ekju("ekpy", ekjy(int ), (int)97);
                if (!var3_1) ** GOTO lbl194
                throw null;
            }
lbl250:
            // 2 sources

            case 19: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hf.ekju("ekpz", ekjy(int ), (int)98);
                    if (!var3_1) ** GOTO lbl164
                    throw null;
                }
            }
            case 20: {
                var2_2 /* !! */  = (int)hf.ekju("ekqa", ekjy(int ), (int)99);
                if (!var3_1) ** GOTO lbl164
                throw null;
            }
lbl259:
            // 2 sources

            case 21: {
                var2_2 /* !! */  = (int)hf.ekju("ekqb", ekjy(int ), (int)100);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl273
            }
            case 22: {
                var2_2 /* !! */  = (int)hf.ekju("ekqc", ekjy(int ), (int)101);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl277
            }
lbl269:
            // 3 sources

            case 23: {
                var2_2 /* !! */  = (int)hf.ekju("ekqd", ekjy(int ), (int)102);
                if (!var3_1) ** GOTO lbl169
                throw null;
            }
lbl273:
            // 4 sources

            case 24: {
                var2_2 /* !! */  = (int)hf.ekju("ekqe", ekjy(int ), (int)103);
                if (!var3_1) ** GOTO lbl189
                throw null;
            }
lbl277:
            // 3 sources

            case 25: {
                var2_2 /* !! */  = (int)hf.ekju("ekqf", ekjy(int ), (int)104);
                if (!var3_1) ** GOTO lbl259
                throw null;
            }
            case 26: {
                var2_2 /* !! */  = (int)hf.ekju("ekqg", ekjy(int ), (int)105);
                if (!var3_1) ** GOTO lbl198
                throw null;
            }
            case 27: 
        }
        var2_2 /* !! */  = (int)hf.ekju("ekqh", ekjy(int ), (int)106);
        ** while (!var3_1)
lbl288:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean hasGappleInOffhand() {
        block45: {
            block44: {
                v0 /* !! */  = hf.ku;
                if (true) ** GOTO lbl5
                block32: while (true) {
                    v0 /* !! */  = (long)(hf.ekju("ekzp", ekko(int ), (int)163) - hf.ekju("ekzn", ekko(int ), (int)162));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1881346155: {
                            continue block32;
                        }
                        case -273819947: {
                            break block32;
                        }
                    }
                    break;
                }
                var4_1 = hf.c;
                v1 /* !! */  = hf.ku;
                if (true) ** GOTO lbl15
                block33: while (true) {
                    v1 /* !! */  = (long)(v2 - hf.ekju("ekzr", ekko(int ), (int)164));
lbl15:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -273819947: {
                            break block33;
                        }
                        case 278264413: {
                            v2 = hf.ekju("ekzs", ekko(int ), (int)165);
                            continue block33;
                        }
                        case 452734070: {
                            v2 = hf.ekju("ekzt", ekko(int ), (int)166);
                            continue block33;
                        }
                    }
                    break;
                }
                var3_2 = hf.b;
                v3 /* !! */  = hf.ku;
                if (true) ** GOTO lbl29
                block34: while (true) {
                    v3 /* !! */  = (long)(hf.ekju("ekzv", ekko(int ), (int)168) - hf.ekju("ekzu", ekko(int ), (int)167));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1576528128: {
                            continue block34;
                        }
                        case -273819947: {
                            break block34;
                        }
                    }
                    break;
                }
                var2_3 = hf.a;
                if (var4_1) {
                    throw null;
lbl37:
                    // 4 sources

                    return (boolean)hf.ekju("ekzx", ekjy(int ), (int)241);
                }
                if (var2_3 || var2_3) ** GOTO lbl37
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = hf.ku - hf.ekju("ekzz", ekko(int ), (int)169)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hf.ekju("elaa", ekjy(int ), (int)242)) break;
                    v4 /* !! */  = (long)hf.ekju("elab", ekjy(int ), (int)243);
                }
                v5 /* !! */  = hf.ku;
                if (true) ** GOTO lbl50
                block37: while (true) {
                    v5 /* !! */  = (long)(v6 - hf.ekju("elac", ekko(int ), (int)170));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -273819947: {
                            break block37;
                        }
                        case 414355628: {
                            v6 = hf.ekju("elad", ekko(int ), (int)171);
                            continue block37;
                        }
                        case 2073999112: {
                            v6 = hf.ekju("elae", ekko(int ), (int)172);
                            continue block37;
                        }
                    }
                    break;
                }
                v7 = hf.mc.field_1724;
                v8 /* !! */  = hf.ku;
                if (true) ** GOTO lbl64
                block38: while (true) {
                    v8 /* !! */  = (long)(v9 - hf.ekju("elaf", ekko(int ), (int)173));
lbl64:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1049636785: {
                            v9 = hf.ekju("elag", ekko(int ), (int)174);
                            continue block38;
                        }
                        case -553699352: {
                            v9 = hf.ekju("elah", ekko(int ), (int)175);
                            continue block38;
                        }
                        case -273819947: {
                            break block38;
                        }
                    }
                    break;
                }
                var1_4 = v7.method_6079();
                if (var2_3 || var2_3) ** GOTO lbl37
                v10 /* !! */  = hf.ku;
                if (true) ** GOTO lbl79
                block39: while (true) {
                    v10 /* !! */  = (long)(v11 - hf.ekju("elai", ekko(int ), (int)176));
lbl79:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -273819947: {
                            break block39;
                        }
                        case 170175867: {
                            v11 = hf.ekju("elaj", ekko(int ), (int)177);
                            continue block39;
                        }
                        case 374615255: {
                            v11 = hf.ekju("elak", ekko(int ), (int)178);
                            continue block39;
                        }
                    }
                    break;
                }
                v12 = var1_4.method_7909();
                v13 /* !! */  = hf.ku;
                if (true) ** GOTO lbl93
                block40: while (true) {
                    v13 /* !! */  = (long)(hf.ekju("elam", ekko(int ), (int)180) - hf.ekju("elal", ekko(int ), (int)179));
lbl93:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -273819947: {
                            break block40;
                        }
                        case 1056901390: {
                            continue block40;
                        }
                    }
                    break;
                }
                if (v12 != class_1802.field_8463) break block44;
                if (var2_3) ** GOTO lbl37
                v14 = hf.ekju("elan", ekjy(int ), (int)244);
                if (var4_1) {
                    throw null;
                }
                break block45;
            }
            if (!var2_3 && !var2_3) ** break;
            ** while (true)
            v14 = hf.ekju("elao", ekjy(int ), (int)245);
        }
        return (boolean)v14;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean canEat() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hf.ku - hf.ekju("ekrs", ekko(int ), (int)73)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hf.ekju("ekrt", ekjy(int ), (int)128)) break;
            v0 /* !! */  = (long)hf.ekju("ekru", ekjy(int ), (int)129);
        }
        var4_1 = hf.c;
        v1 /* !! */  = hf.ku;
        if (true) ** GOTO lbl11
        block65: while (true) {
            v1 /* !! */  = (long)(v2 - hf.ekju("ekrv", ekko(int ), (int)74));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1612793268: {
                    v2 = hf.ekju("ekrw", ekko(int ), (int)75);
                    continue block65;
                }
                case -273819947: {
                    break block65;
                }
                case 838346543: {
                    v2 = hf.ekju("ekrx", ekko(int ), (int)76);
                    continue block65;
                }
            }
            break;
        }
        var3_2 /* !! */  = hf.b;
        v3 /* !! */  = hf.ku;
        if (true) ** GOTO lbl25
        block66: while (true) {
            v3 /* !! */  = (long)(v4 - hf.ekju("ekry", ekko(int ), (int)77));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -273819947: {
                    break block66;
                }
                case 103481523: {
                    v4 = hf.ekju("ekrz", ekko(int ), (int)78);
                    continue block66;
                }
                case 299076829: {
                    v4 = hf.ekju("eksa", ekko(int ), (int)79);
                    continue block66;
                }
            }
            break;
        }
        var2_3 = hf.a;
        if (!var4_1) ** GOTO lbl41
        throw null;
        {
            if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)hf.ekju("eksb", ekjy(int ), (int)130);
                }
lbl41:
                // 1 sources

                if (var2_3 || var2_3) continue block67;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = hf.ku - hf.ekju("eksc", ekko(int ), (int)80)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == hf.ekju("eksd", ekjy(int ), (int)131)) break;
                    v5 /* !! */  = (long)hf.ekju("ekse", ekjy(int ), (int)132);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = hf.ku - hf.ekju("eksf", ekko(int ), (int)81)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == hf.ekju("eksg", ekjy(int ), (int)133)) break;
                    v6 /* !! */  = (long)hf.ekju("eksh", ekjy(int ), (int)134);
                }
                v7 = hf.mc.field_1724;
                v8 /* !! */  = hf.ku;
                if (true) ** GOTO lbl57
                block70: while (true) {
                    v8 /* !! */  = (long)(v9 - hf.ekju("eksi", ekko(int ), (int)82));
lbl57:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -273819947: {
                            break block70;
                        }
                        case 391790779: {
                            v9 = hf.ekju("eksj", ekko(int ), (int)83);
                            continue block70;
                        }
                        case 1681765234: {
                            v9 = hf.ekju("eksk", ekko(int ), (int)84);
                            continue block70;
                        }
                        case 1699993620: {
                            v9 = hf.ekju("eksl", ekko(int ), (int)85);
                            continue block70;
                        }
                    }
                    break;
                }
                if (v7.method_29504()) {
                    if (var2_3) continue block67;
                    return (boolean)hf.ekju("eksm", ekjy(int ), (int)135);
                }
                if (var2_3 || var2_3) continue block67;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = hf.ku - hf.ekju("eksn", ekko(int ), (int)86)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == hf.ekju("ekso", ekjy(int ), (int)136)) break;
                    v10 /* !! */  = (long)hf.ekju("eksp", ekjy(int ), (int)137);
                }
                v11 /* !! */  = hf.ku;
                if (true) ** GOTO lbl82
                block72: while (true) {
                    v11 /* !! */  = (long)(v12 - hf.ekju("eksq", ekko(int ), (int)87));
lbl82:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -273819947: {
                            break block72;
                        }
                        case 304129464: {
                            v12 = hf.ekju("eksr", ekko(int ), (int)88);
                            continue block72;
                        }
                        case 577434518: {
                            v12 = hf.ekju("ekss", ekko(int ), (int)89);
                            continue block72;
                        }
                    }
                    break;
                }
                v13 = hf.mc.field_1724;
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = hf.ku - hf.ekju("ekst", ekko(int ), (int)90)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == hf.ekju("eksu", ekjy(int ), (int)138)) break;
                    v14 /* !! */  = (long)hf.ekju("eksv", ekjy(int ), (int)139);
                }
                v15 = v13.method_7357();
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_5 = hf.ku - hf.ekju("eksw", ekko(int ), (int)91)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == hf.ekju("eksx", ekjy(int ), (int)140)) break;
                    v16 /* !! */  = (long)hf.ekju("eksy", ekjy(int ), (int)141);
                }
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_6 = hf.ku - hf.ekju("eksz", ekko(int ), (int)92)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == hf.ekju("ekta", ekjy(int ), (int)142)) break;
                    v17 /* !! */  = (long)hf.ekju("ektb", ekjy(int ), (int)143);
                }
                v18 = class_1802.field_8463.method_7854();
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_7 = hf.ku - hf.ekju("ektc", ekko(int ), (int)93)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == hf.ekju("ektd", ekjy(int ), (int)144)) break;
                    v19 /* !! */  = (long)hf.ekju("ekte", ekjy(int ), (int)145);
                }
                if (v15.method_7904(v18)) {
                    if (var2_3) continue block67;
                    return (boolean)hf.ekju("ektf", ekjy(int ), (int)146);
                }
                if (var2_3 || var2_3) continue block67;
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_8 = hf.ku - hf.ekju("ektg", ekko(int ), (int)94)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == hf.ekju("ekth", ekjy(int ), (int)147)) break;
                    v20 /* !! */  = (long)hf.ekju("ekti", ekjy(int ), (int)148);
                }
                v21 /* !! */  = hf.ku;
                if (true) ** GOTO lbl127
                block78: while (true) {
                    v21 /* !! */  = (long)(v22 - hf.ekju("ektj", ekko(int ), (int)95));
lbl127:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1432552287: {
                            v22 = hf.ekju("ektk", ekko(int ), (int)96);
                            continue block78;
                        }
                        case -273819947: {
                            break block78;
                        }
                        case 346017004: {
                            v22 = hf.ekju("ektl", ekko(int ), (int)97);
                            continue block78;
                        }
                    }
                    break;
                }
                if (this.smartMode.isValue()) {
                    if (var2_3 || var2_3) continue block67;
                    while (true) {
                        if ((v23 /* !! */  = (cfr_temp_9 = hf.ku - hf.ekju("ektm", ekko(int ), (int)98)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                        if (v23 /* !! */  == hf.ekju("ektn", ekjy(int ), (int)149)) break;
                        v23 /* !! */  = (long)hf.ekju("ekto", ekjy(int ), (int)150);
                    }
                    if (!this.hasGapple()) {
                        if (var2_3) continue block67;
                        return (boolean)hf.ekju("ektp", ekjy(int ), (int)151);
                    }
                } else {
                    if (var2_3 || var2_3) continue block67;
                    while (true) {
                        if ((v24 /* !! */  = (cfr_temp_10 = hf.ku - hf.ekju("ektq", ekko(int ), (int)99)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                        if (v24 /* !! */  == hf.ekju("ektr", ekjy(int ), (int)152)) break;
                        v24 /* !! */  = (long)hf.ekju("ekts", ekjy(int ), (int)153);
                    }
                    if (!this.hasGappleInOffhand()) {
                        if (var2_3) continue block67;
                        return (boolean)hf.ekju("ektt", ekjy(int ), (int)154);
                    }
                }
                if (var2_3 || var2_3) continue block67;
                v25 /* !! */  = hf.ku;
                if (true) ** GOTO lbl161
                block81: while (true) {
                    v25 /* !! */  = (long)(hf.ekju("ektv", ekko(int ), (int)101) - hf.ekju("ektu", ekko(int ), (int)100));
lbl161:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -273819947: {
                            break block81;
                        }
                        case 1277368104: {
                            continue block81;
                        }
                    }
                    break;
                }
                var1_4 = this.getEffectiveHealth();
                if (var2_3 || var2_3) continue block67;
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_11 = hf.ku - hf.ekju("ektw", ekko(int ), (int)102)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == hf.ekju("ektx", ekjy(int ), (int)155)) break;
                    v26 /* !! */  = (long)hf.ekju("ekty", ekjy(int ), (int)156);
                }
                v27 /* !! */  = hf.ku;
                if (true) ** GOTO lbl177
                block83: while (true) {
                    v27 /* !! */  = (long)(v28 - hf.ekju("ektz", ekko(int ), (int)103));
lbl177:
                    // 2 sources

                    switch ((int)v27 /* !! */ ) {
                        case -432127556: {
                            v28 = hf.ekju("ekua", ekko(int ), (int)104);
                            continue block83;
                        }
                        case -273819947: {
                            break block83;
                        }
                        case 58131736: {
                            v28 = hf.ekju("ekub", ekko(int ), (int)105);
                            continue block83;
                        }
                        case 137413014: {
                            v28 = hf.ekju("ekuc", ekko(int ), (int)106);
                            continue block83;
                        }
                    }
                    break;
                }
                if (var1_4 <= this.healthThreshold.getValue()) {
                    if (var2_3) continue block67;
                    v29 = hf.ekju("ekud", ekjy(int ), (int)157);
                    if (var4_1) {
                        throw null;
                    }
                } else {
                    if (!var2_3 && !var2_3) ** break;
                    continue block67;
                    v29 = hf.ekju("ekue", ekjy(int ), (int)158);
                }
                return (boolean)v29;
lbl199:
                // 2 sources

                case 0: {
                    var3_2 /* !! */  = (int)hf.ekju("ekuf", ekjy(int ), (int)159);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl302
                }
lbl204:
                // 2 sources

                case 1: {
                    var3_2 /* !! */  = (int)hf.ekju("ekug", ekjy(int ), (int)160);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl248
                }
                case 2: {
                    var3_2 /* !! */  = (int)hf.ekju("ekuh", ekjy(int ), (int)161);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl218
                }
                case 3: {
                    var3_2 /* !! */  = (int)hf.ekju("ekui", ekjy(int ), (int)162);
                    if (!var4_1) ** GOTO lbl204
                    throw null;
                }
lbl218:
                // 2 sources

                case 4: {
                    var3_2 /* !! */  = (int)hf.ekju("ekuj", ekjy(int ), (int)163);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl243
                }
lbl223:
                // 2 sources

                case 5: {
                    var3_2 /* !! */  = (int)hf.ekju("ekuk", ekjy(int ), (int)164);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl272
                }
                case 6: {
                    var3_2 /* !! */  = (int)hf.ekju("ekul", ekjy(int ), (int)165);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl294
                }
lbl233:
                // 2 sources

                case 7: {
                    var3_2 /* !! */  = (int)hf.ekju("ekum", ekjy(int ), (int)166);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl310
                }
lbl238:
                // 2 sources

                case 8: {
                    var3_2 /* !! */  = (int)hf.ekju("ekun", ekjy(int ), (int)167);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl268
                }
lbl243:
                // 3 sources

                case 9: {
                    var3_2 /* !! */  = (int)hf.ekju("ekuo", ekjy(int ), (int)168);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl258
                }
lbl248:
                // 3 sources

                case 10: {
                    var3_2 /* !! */  = (int)hf.ekju("ekup", ekjy(int ), (int)169);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl302
                }
                case 11: {
                    var3_2 /* !! */  = (int)hf.ekju("ekuq", ekjy(int ), (int)170);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl272
                }
lbl258:
                // 2 sources

                case 12: {
                    var3_2 /* !! */  = (int)hf.ekju("ekur", ekjy(int ), (int)171);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl285
                }
                case 13: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_2 /* !! */  = (int)hf.ekju("ekus", ekjy(int ), (int)172);
                        if (!var4_1) ** GOTO lbl199
                        throw null;
                    }
                }
lbl268:
                // 2 sources

                case 14: {
                    var3_2 /* !! */  = (int)hf.ekju("ekut", ekjy(int ), (int)173);
                    if (var4_1) {
                        throw null;
                    }
                }
lbl272:
                // 5 sources

                case 15: {
                    var3_2 /* !! */  = (int)hf.ekju("ekuu", ekjy(int ), (int)174);
                    if (!var4_1) ** GOTO lbl248
                    throw null;
                }
lbl276:
                // 3 sources

                case 16: {
                    var3_2 /* !! */  = (int)hf.ekju("ekuv", ekjy(int ), (int)175);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl306
                }
                case 17: {
                    var3_2 /* !! */  = (int)hf.ekju("ekuw", ekjy(int ), (int)176);
                    if (!var4_1) ** GOTO lbl223
                    throw null;
                }
lbl285:
                // 2 sources

                case 18: {
                    var3_2 /* !! */  = (int)hf.ekju("ekux", ekjy(int ), (int)177);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl294
                }
lbl290:
                // 2 sources

                case 19: {
                    var3_2 /* !! */  = (int)hf.ekju("ekuy", ekjy(int ), (int)178);
                    if (!var4_1) ** GOTO lbl238
                    throw null;
                }
lbl294:
                // 3 sources

                case 20: {
                    var3_2 /* !! */  = (int)hf.ekju("ekuz", ekjy(int ), (int)179);
                    if (!var4_1) ** GOTO lbl276
                    throw null;
                }
                case 21: {
                    var3_2 /* !! */  = (int)hf.ekju("ekva", ekjy(int ), (int)180);
                    if (!var4_1) ** GOTO lbl233
                    throw null;
                }
lbl302:
                // 3 sources

                case 22: {
                    var3_2 /* !! */  = (int)hf.ekju("ekvb", ekjy(int ), (int)181);
                    if (!var4_1) ** GOTO lbl276
                    throw null;
                }
lbl306:
                // 2 sources

                case 23: {
                    var3_2 /* !! */  = (int)hf.ekju("ekvc", ekjy(int ), (int)182);
                    if (!var4_1) ** GOTO lbl243
                    throw null;
                }
lbl310:
                // 2 sources

                case 24: {
                    var3_2 /* !! */  = (int)hf.ekju("ekvd", ekjy(int ), (int)183);
                    if (!var4_1) ** GOTO lbl290
                    throw null;
                }
                case 25: 
            }
        }
        var3_2 /* !! */  = (int)hf.ekju("ekve", ekjy(int ), (int)184);
        ** while (!var4_1)
lbl317:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void emen() {
        hf.ekkp[100] = -7887219443042728896L;
        hf.ekkp[101] = 810468723820435717L;
        hf.ekkp[102] = 5176924586591861175L;
        hf.ekkp[103] = -8453272575848379514L;
        hf.ekkp[104] = -1749385611352361407L;
        hf.ekkp[105] = -5446773399283816295L;
        hf.ekkp[106] = 4362366987129901508L;
        hf.ekkp[107] = -5200300662958837590L;
        hf.ekkp[108] = 5883616595351207096L;
        hf.ekkp[109] = -1881728666704734693L;
        hf.ekkp[110] = -7520658085934044431L;
        hf.ekkp[111] = -1686800471946413775L;
        hf.ekkp[112] = -5882880355633665136L;
        hf.ekkp[113] = -2075823443553271405L;
        hf.ekkp[114] = 8382677451809216801L;
        hf.ekkp[115] = -207273730496770243L;
        hf.ekkp[116] = 2402188750215120019L;
        hf.ekkp[117] = 4912973235802686317L;
        hf.ekkp[118] = -4068752193094814264L;
        hf.ekkp[119] = 8193655258399343371L;
        hf.ekkp[120] = 4118475943379561681L;
        hf.ekkp[121] = -2307340192785119544L;
        hf.ekkp[122] = -2604071794410681630L;
        hf.ekkp[123] = 1172460173803444254L;
        hf.ekkp[124] = -2045092302715787676L;
        hf.ekkp[125] = -6826310076694521896L;
        hf.ekkp[126] = -1053539620162462920L;
        hf.ekkp[127] = -3480121669062769071L;
        hf.ekkp[128] = 3435384495378239721L;
        hf.ekkp[129] = -6026022692512825789L;
        hf.ekkp[130] = 8699826572531634757L;
        hf.ekkp[131] = -93926318116807400L;
        hf.ekkp[132] = 7784217049016784891L;
        hf.ekkp[133] = 5944678694148441367L;
        hf.ekkp[134] = -7027382584085134075L;
        hf.ekkp[135] = -5734044997657212965L;
        hf.ekkp[136] = 5233090895597285792L;
        hf.ekkp[137] = 4555289729067219428L;
        hf.ekkp[138] = -8706887059130656024L;
        hf.ekkp[139] = 834575924385997437L;
        hf.ekkp[140] = -4144433792349964231L;
        hf.ekkp[141] = 8652479262208043032L;
        hf.ekkp[142] = 4906850227258901026L;
        hf.ekkp[143] = 282052211926596902L;
        hf.ekkp[144] = 1745676941807338471L;
        hf.ekkp[145] = 2890800082996527975L;
        hf.ekkp[146] = -8516553056845283535L;
        hf.ekkp[147] = 8328180350900550843L;
        hf.ekkp[148] = 2974109934097809380L;
        hf.ekkp[149] = -5020146781094496592L;
        hf.ekkp[150] = 3055021264906615869L;
        hf.ekkp[151] = -78888323801805800L;
        hf.ekkp[152] = -861170017806836071L;
        hf.ekkp[153] = -7506619100120609840L;
        hf.ekkp[154] = -1749571531508505130L;
        hf.ekkp[155] = 9030887863452708896L;
        hf.ekkp[156] = -3378863363030273289L;
        hf.ekkp[157] = -6531587631445688931L;
        hf.ekkp[158] = -5778902043802213684L;
        hf.ekkp[159] = -614613979057913719L;
        hf.ekkp[160] = 6980213414606317946L;
        hf.ekkp[161] = -997787001648596994L;
        hf.ekkp[162] = -5079800628035870247L;
        hf.ekkp[163] = -3491890385755359260L;
        hf.ekkp[164] = 8500440308239919265L;
        hf.ekkp[165] = -7325232725670676629L;
        hf.ekkp[166] = -1186150076532528212L;
        hf.ekkp[167] = 3225577067923815463L;
        hf.ekkp[168] = 3689749773403325800L;
        hf.ekkp[169] = -8799298080727766521L;
        hf.ekkp[170] = 8099849122249385422L;
        hf.ekkp[171] = -7789483804259830237L;
        hf.ekkp[172] = -4195460992564170075L;
        hf.ekkp[173] = -4850920125667819093L;
        hf.ekkp[174] = 3986731752639517080L;
        hf.ekkp[175] = -2778585139623865951L;
        hf.ekkp[176] = -8055660126756729834L;
        hf.ekkp[177] = -9095186412060674226L;
        hf.ekkp[178] = -5404758884734606791L;
        hf.ekkp[179] = 6372081488264367101L;
        hf.ekkp[180] = 8385532051982099452L;
        hf.ekkp[181] = 3497632351619747705L;
        hf.ekkp[182] = -1592845771401568789L;
        hf.ekkp[183] = -8760455212987918658L;
        hf.ekkp[184] = -4410363310549014708L;
        hf.ekkp[185] = -3106677561892470148L;
        hf.ekkp[186] = -1649864417416555005L;
        hf.ekkp[187] = -4682314409411571337L;
        hf.ekkp[188] = 6071039440262033380L;
        hf.ekkp[189] = -5719278199982907923L;
        hf.ekkp[190] = 2494369238648737172L;
        hf.ekkp[191] = 9116051557748401816L;
        hf.ekkp[192] = -9043489129395110809L;
        hf.ekkp[193] = -1343092936179179365L;
        hf.ekkp[194] = 3599127348584782164L;
        hf.ekkp[195] = 8554295926354749217L;
        hf.ekkp[196] = -689073927421497951L;
        hf.ekkp[197] = 7351396300714861643L;
        hf.ekkp[198] = -6984648213976180422L;
        hf.ekkp[199] = 381657639904715373L;
    }

    public static /* synthetic */ CallSite ekju(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean hasGapple() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hf.ku - hf.ekju("eley", ekko(int ), (int)201)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hf.ekju("elfa", ekjy(int ), (int)288)) break;
            v0 /* !! */  = (long)hf.ekju("elfb", ekjy(int ), (int)289);
        }
        var3_1 = hf.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hf.ku - hf.ekju("elfd", ekko(int ), (int)202)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hf.ekju("elff", ekjy(int ), (int)290)) break;
            v1 /* !! */  = (long)hf.ekju("elfg", ekjy(int ), (int)291);
        }
        var2_2 /* !! */  = hf.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = hf.ku - hf.ekju("elfh", ekko(int ), (int)203)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hf.ekju("elfj", ekjy(int ), (int)292)) break;
            v2 /* !! */  = (long)hf.ekju("elfk", ekjy(int ), (int)293);
        }
        var1_3 = hf.a;
        if (!var3_1) ** GOTO lbl28
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)hf.ekju("elfl", ekjy(int ), (int)294);
                }
lbl28:
                // 1 sources

                if (var1_3 || var1_3) continue block28;
                v3 /* !! */  = hf.ku;
                if (true) ** GOTO lbl33
                block29: while (true) {
                    v3 /* !! */  = (long)(v4 - hf.ekju("elfm", ekko(int ), (int)204));
lbl33:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2046080253: {
                            v4 = hf.ekju("elfn", ekko(int ), (int)205);
                            continue block29;
                        }
                        case -1315524366: {
                            v4 = hf.ekju("elfo", ekko(int ), (int)206);
                            continue block29;
                        }
                        case -273819947: {
                            break block29;
                        }
                        case 1821965141: {
                            v4 = hf.ekju("elfp", ekko(int ), (int)207);
                            continue block29;
                        }
                    }
                    break;
                }
                if (this.hasGappleInOffhand()) ** GOTO lbl66
                if (var1_3) continue block28;
                v5 /* !! */  = hf.ku;
                if (true) ** GOTO lbl51
                block30: while (true) {
                    v5 /* !! */  = (long)(v6 - hf.ekju("elfq", ekko(int ), (int)208));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -391596640: {
                            v6 = hf.ekju("elfr", ekko(int ), (int)209);
                            continue block30;
                        }
                        case -273819947: {
                            break block30;
                        }
                        case 607403554: {
                            v6 = hf.ekju("elft", ekko(int ), (int)210);
                            continue block30;
                        }
                        case 1136143423: {
                            v6 = hf.ekju("elfu", ekko(int ), (int)211);
                            continue block30;
                        }
                    }
                    break;
                }
                if (this.hasGappleInHotbar()) {
                    if (var1_3) continue block28;
                }
                ** GOTO lbl71
lbl66:
                // 2 sources

                if (var1_3 || var1_3) continue block28;
                v7 = hf.ekju("elfv", ekjy(int ), (int)295);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl74
lbl71:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                continue block28;
                v7 = hf.ekju("elfx", ekjy(int ), (int)296);
lbl74:
                // 2 sources

                return (boolean)v7;
lbl75:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)hf.ekju("elfz", ekjy(int ), (int)297);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl113
                }
                case 1: {
                    var2_2 /* !! */  = (int)hf.ekju("elgd", ekjy(int ), (int)298);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl90
                }
                case 2: {
                    do {
                        var2_2 /* !! */  = (int)hf.ekju("elge", ekjy(int ), (int)299);
                    } while (!var3_1);
                    throw null;
                }
lbl90:
                // 2 sources

                case 3: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)hf.ekju("elgf", ekjy(int ), (int)300);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 4: {
                    do {
                        var2_2 /* !! */  = (int)hf.ekju("elgg", ekjy(int ), (int)301);
                    } while (!var3_1);
                    throw null;
                }
lbl100:
                // 2 sources

                case 5: {
                    var2_2 /* !! */  = (int)hf.ekju("elgh", ekjy(int ), (int)302);
                    if (!var3_1) break block28;
                    throw null;
                }
                case 6: {
                    var2_2 /* !! */  = (int)hf.ekju("elgi", ekjy(int ), (int)303);
                    if (!var3_1) ** GOTO lbl75
                    throw null;
                }
                case 7: {
                    var2_2 /* !! */  = (int)hf.ekju("elgj", ekjy(int ), (int)304);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl117
                }
lbl113:
                // 2 sources

                case 8: {
                    var2_2 /* !! */  = (int)hf.ekju("elgo", ekjy(int ), (int)305);
                    if (!var3_1) break block28;
                    throw null;
                }
lbl117:
                // 2 sources

                case 9: {
                    var2_2 /* !! */  = (int)hf.ekju("elgp", ekjy(int ), (int)306);
                    if (!var3_1) ** GOTO lbl100
                    throw null;
                }
                case 10: 
            }
        }
        var2_2 /* !! */  = (int)hf.ekju("elgr", ekjy(int ), (int)307);
        ** while (!var3_1)
lbl124:
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
        v0 /* !! */  = hf.ku;
        block27: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -273819947: {
                    break block27;
                }
                case 1365419019: {
                    v0 /* !! */  = (long)(hf.ekju("ekks", ekko(int ), (int)1) - hf.ekju("ekkr", ekko(int ), (int)0));
                    continue block27;
                }
            }
            break;
        }
        var3_1 = hf.c;
        v1 /* !! */  = hf.ku;
        block28: while (true) {
            switch ((int)v1 /* !! */ ) {
                case -1222133467: {
                    v1 /* !! */  = (long)(hf.ekju("ekku", ekko(int ), (int)3) - hf.ekju("ekkt", ekko(int ), (int)2));
                    continue block28;
                }
                case -273819947: {
                    break block28;
                }
            }
            break;
        }
        var2_2 /* !! */  = hf.b;
        v2 /* !! */  = hf.ku;
        block29: while (true) {
            switch ((int)v2 /* !! */ ) {
                case -273819947: {
                    break block29;
                }
                case -18807732: {
                    v2 /* !! */  = (long)(hf.ekju("ekkw", ekko(int ), (int)5) - hf.ekju("ekkv", ekko(int ), (int)4));
                    continue block29;
                }
            }
            break;
        }
        var1_3 = hf.a;
        if (var3_1) {
            throw null;
        }
        if (var1_3 || var1_3) ** GOTO lbl64
        v3 = hf.ekju("ekkx", ekjy(int ), (int)18);
        v4 /* !! */  = hf.ku;
        if (true) ** GOTO lbl36
        block30: while (true) {
            v4 /* !! */  = (long)(v5 - hf.ekju("ekky", ekko(int ), (int)6));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1889984961: {
                    v5 = hf.ekju("ekkz", ekko(int ), (int)7);
                    continue block30;
                }
                case -273819947: {
                    break block30;
                }
                case 186342248: {
                    v5 = hf.ekju("ekla", ekko(int ), (int)8);
                    continue block30;
                }
            }
            break;
        }
        this.isEating = v3;
        if (var1_3 || var1_3) ** GOTO lbl64
        v6 = hf.ekju("eklb", ekjy(int ), (int)19);
        while (true) {
            block48: {
                if ((v7 /* !! */  = (cfr_temp_1 = hf.ku - hf.ekju("eklc", ekko(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v7 /* !! */  != hf.ekju("ekld", ekjy(int ), (int)20)) break block48;
                this.previousSlot = (int)v6;
                if (var2_2 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v7 /* !! */  = (long)hf.ekju("ekle", ekjy(int ), (int)21);
        }
        cfr_temp_0 = -2147483648;
        block32: while (true) {
            block49: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (!var1_3 && !var1_3) ** GOTO lbl65
lbl64:
                        // 3 sources

                        return;
lbl65:
                        // 1 sources

                        return;
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)hf.ekju("eklf", ekjy(int ), (int)22);
                        cfr_temp_0 = 6;
                        if (var3_1) {
                            throw null;
                        }
                        break block49;
                    }
                    case 1: {
                        var2_2 /* !! */  = (int)hf.ekju("eklg", ekjy(int ), (int)23);
                        cfr_temp_0 = 6;
                        if (var3_1) {
                            throw null;
                        }
                        break block49;
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)hf.ekju("eklk", ekjy(int ), (int)27);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 6: {
                        var2_2 /* !! */  = (int)hf.ekju("ekll", ekjy(int ), (int)28);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: {
                        ** GOTO lbl92
                    }
                    case 7: {
                        var2_2 /* !! */  = (int)hf.ekju("eklm", ekjy(int ), (int)29);
                        if (var3_1) {
                            throw null;
                        }
lbl92:
                        // 3 sources

                        var2_2 /* !! */  = (int)hf.ekju("eklh", ekjy(int ), (int)24);
                        cfr_temp_0 = 4;
                        if (var3_1) {
                            throw null;
                        }
                        break block49;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)hf.ekju("ekli", ekjy(int ), (int)25);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 4: 
                }
                ** GOTO lbl106
            }
            do {
                if (true) continue block32;
lbl106:
                // 2 sources

                var2_2 /* !! */  = (int)hf.ekju("eklj", ekjy(int ), (int)26);
                cfr_temp_0 = 3;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void emdr() {
        hf.ekjs[400] = -1605724339;
        hf.ekjs[401] = -1594079627;
        hf.ekjs[402] = 1768096918;
        hf.ekjs[403] = -1553459555;
        hf.ekjs[404] = 1364200523;
        hf.ekjs[405] = -915490475;
        hf.ekjs[406] = 329824261;
        hf.ekjs[407] = 1809511329;
        hf.ekjs[408] = -1607491003;
        hf.ekjs[409] = -1591291984;
        hf.ekjs[410] = 895495893;
        hf.ekjs[411] = 938986844;
        hf.ekjs[412] = 384327609;
        hf.ekjs[413] = 681163716;
        hf.ekjs[414] = -1908631050;
        hf.ekjs[415] = -614111530;
        hf.ekjs[416] = -1904817607;
        hf.ekjs[417] = 1405380633;
        hf.ekjs[418] = 1227278855;
        hf.ekjs[419] = 1918693144;
        hf.ekjs[420] = 2002217014;
        hf.ekjs[421] = -1041991084;
        hf.ekjs[422] = 1764756838;
        hf.ekjs[423] = -1576780684;
        hf.ekjs[424] = -1317510294;
        hf.ekjs[425] = 1848811443;
        hf.ekjs[426] = 1519087534;
        hf.ekjs[427] = -919075605;
        hf.ekjs[428] = -733763080;
        hf.ekjs[429] = -736221385;
        hf.ekjs[430] = 162253535;
        hf.ekjs[431] = 880773739;
        hf.ekjs[432] = 990655845;
        hf.ekjs[433] = 1461593291;
        hf.ekjs[434] = -1137056476;
        hf.ekjs[435] = -1439889007;
        hf.ekjs[436] = 148389631;
        hf.ekjs[437] = -714843227;
        hf.ekjs[438] = -1681070512;
        hf.ekjs[439] = 1933738952;
        hf.ekjs[440] = -784138576;
        hf.ekjs[441] = -324816852;
        hf.ekjs[442] = 1234909803;
        hf.ekjs[443] = 620699260;
        hf.ekjs[444] = 39834195;
        hf.ekjs[445] = -672535868;
        hf.ekjs[446] = -1200097214;
        hf.ekjs[447] = 451004785;
        hf.ekjs[448] = 690275496;
        hf.ekjs[449] = -442845983;
        hf.ekjs[450] = 468653946;
        hf.ekjs[451] = 1955854433;
        hf.ekjs[452] = -1068137514;
        hf.ekjs[453] = 1500496837;
        hf.ekjs[454] = 590262202;
        hf.ekjs[455] = -653027494;
        hf.ekjs[456] = 1003461000;
        hf.ekjs[457] = -1283013043;
        hf.ekjs[458] = -451703155;
        hf.ekjs[459] = 718472319;
        hf.ekjs[460] = 689796788;
        hf.ekjs[461] = -1577952516;
        hf.ekjs[462] = -481418423;
        hf.ekjs[463] = 1164543177;
        hf.ekjs[464] = 457827674;
        hf.ekjs[465] = 747549863;
        hf.ekjs[466] = 1299638436;
        hf.ekjs[467] = 279472379;
        hf.ekjs[468] = 1076719413;
        hf.ekjs[469] = -1870138505;
        hf.ekjs[470] = 1825352133;
        hf.ekjs[471] = -624433382;
        hf.ekjs[472] = -1092652538;
        hf.ekjs[473] = -1178530852;
        hf.ekjs[474] = -1061395094;
        hf.ekjs[475] = 1874657587;
        hf.ekjs[476] = 234521493;
        hf.ekjs[477] = -816777805;
        hf.ekjs[478] = -361032567;
        hf.ekjs[479] = -600521749;
        hf.ekjs[480] = 1082934592;
        hf.ekjs[481] = -117878445;
        hf.ekjs[482] = 518398573;
        hf.ekjs[483] = -212269575;
        hf.ekjs[484] = 1450842910;
        hf.ekjs[485] = -745504742;
        hf.ekjs[486] = -933556319;
        hf.ekjs[487] = -174740917;
        hf.ekjs[488] = 1369569252;
        hf.ekjs[489] = -358499000;
        hf.ekjs[490] = -175216557;
        hf.ekjs[491] = 1281350040;
        hf.ekjs[492] = -559552717;
        hf.ekjs[493] = -1557361913;
        hf.ekjs[494] = -1932916691;
        hf.ekjs[495] = 931916442;
        hf.ekjs[496] = 1925380379;
        hf.ekjs[497] = -1275203142;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean hasGappleInHand() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hf.ku - hf.ekju("ekqi", ekko(int ), (int)58)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hf.ekju("ekqj", ekjy(int ), (int)107)) break;
            v0 /* !! */  = (long)hf.ekju("ekqk", ekjy(int ), (int)108);
        }
        var4_1 = hf.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hf.ku - hf.ekju("ekql", ekko(int ), (int)59)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hf.ekju("ekqm", ekjy(int ), (int)109)) break;
            v1 /* !! */  = (long)hf.ekju("ekqn", ekjy(int ), (int)110);
        }
        var3_2 /* !! */  = hf.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = hf.ku - hf.ekju("ekqo", ekko(int ), (int)60)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hf.ekju("ekqp", ekjy(int ), (int)111)) break;
            v2 /* !! */  = (long)hf.ekju("ekqq", ekjy(int ), (int)112);
        }
        var2_3 = hf.a;
        if (var4_1) {
            throw null;
lbl24:
            // 4 sources

            return (boolean)hf.ekju("ekqr", ekjy(int ), (int)113);
        }
        if (var2_3 || var2_3) ** GOTO lbl24
        v3 /* !! */  = hf.ku;
        if (true) ** GOTO lbl31
        block35: while (true) {
            v3 /* !! */  = (long)(v4 - hf.ekju("ekqs", ekko(int ), (int)61));
lbl31:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1838561392: {
                    v4 = hf.ekju("ekqt", ekko(int ), (int)62);
                    continue block35;
                }
                case -1715116369: {
                    v4 = hf.ekju("ekqu", ekko(int ), (int)63);
                    continue block35;
                }
                case -273819947: {
                    break block35;
                }
                case -194908665: {
                    v4 = hf.ekju("ekqv", ekko(int ), (int)64);
                    continue block35;
                }
            }
            break;
        }
        v5 /* !! */  = hf.ku;
        if (true) ** GOTO lbl47
        block36: while (true) {
            v5 /* !! */  = (long)(hf.ekju("ekqx", ekko(int ), (int)66) - hf.ekju("ekqw", ekko(int ), (int)65));
lbl47:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -547784081: {
                    continue block36;
                }
                case -273819947: {
                    break block36;
                }
            }
            break;
        }
        v6 = hf.mc.field_1724;
        v7 /* !! */  = hf.ku;
        if (true) ** GOTO lbl57
        block37: while (true) {
            v7 /* !! */  = (long)(v8 - hf.ekju("ekqy", ekko(int ), (int)67));
lbl57:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -273819947: {
                    break block37;
                }
                case 43018347: {
                    v8 = hf.ekju("ekqz", ekko(int ), (int)68);
                    continue block37;
                }
                case 421803333: {
                    v8 = hf.ekju("ekra", ekko(int ), (int)69);
                    continue block37;
                }
            }
            break;
        }
        var1_4 = v6.method_6047();
        if (var2_3 || var2_3) ** GOTO lbl24
        v9 /* !! */  = hf.ku;
        if (true) ** GOTO lbl72
        block38: while (true) {
            v9 /* !! */  = (long)(hf.ekju("ekrc", ekko(int ), (int)71) - hf.ekju("ekrb", ekko(int ), (int)70));
lbl72:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -273819947: {
                    break block38;
                }
                case 253921066: {
                    continue block38;
                }
            }
            break;
        }
        v10 = var1_4.method_7909();
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_3 = hf.ku - hf.ekju("ekrd", ekko(int ), (int)72)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v11 /* !! */  == hf.ekju("ekre", ekjy(int ), (int)114)) break;
            v11 /* !! */  = (long)hf.ekju("ekrf", ekjy(int ), (int)115);
        }
        if (v10 != class_1802.field_8463) ** GOTO lbl93
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl24
                v12 = hf.ekju("ekrg", ekjy(int ), (int)116);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl96
            }
lbl93:
            // 1 sources

            if (!var2_3 && !var2_3) ** break;
            ** continue;
            v12 = hf.ekju("ekrh", ekjy(int ), (int)117);
lbl96:
            // 2 sources

            return (boolean)v12;
lbl97:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)hf.ekju("ekri", ekjy(int ), (int)118);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl102:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)hf.ekju("ekrj", ekjy(int ), (int)119);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl111
            }
lbl107:
            // 3 sources

            case 2: {
                var3_2 /* !! */  = (int)hf.ekju("ekrk", ekjy(int ), (int)120);
                if (!var4_1) break;
                throw null;
            }
lbl111:
            // 3 sources

            case 3: {
                var3_2 /* !! */  = (int)hf.ekju("ekrl", ekjy(int ), (int)121);
                if (!var4_1) ** GOTO lbl97
                throw null;
            }
            case 4: {
                var3_2 /* !! */  = (int)hf.ekju("ekrm", ekjy(int ), (int)122);
                if (!var4_1) ** GOTO lbl102
                throw null;
            }
lbl119:
            // 3 sources

            case 5: {
                var3_2 /* !! */  = (int)hf.ekju("ekrn", ekjy(int ), (int)123);
                if (!var4_1) ** GOTO lbl107
                throw null;
            }
            case 6: {
                var3_2 /* !! */  = (int)hf.ekju("ekro", ekjy(int ), (int)124);
                if (!var4_1) ** GOTO lbl111
                throw null;
            }
            case 7: {
                var3_2 /* !! */  = (int)hf.ekju("ekrp", ekjy(int ), (int)125);
                if (!var4_1) ** GOTO lbl119
                throw null;
            }
            case 8: {
                var3_2 /* !! */  = (int)hf.ekju("ekrq", ekjy(int ), (int)126);
                if (!var4_1) ** GOTO lbl119
                throw null;
            }
            case 9: 
        }
        do {
            var3_2 /* !! */  = (int)hf.ekju("ekrr", ekjy(int ), (int)127);
        } while (!var4_1);
        throw null;
    }

    private static /* synthetic */ void emek() {
        hf.ekjt[300] = -574735472;
        hf.ekjt[301] = 442140176;
        hf.ekjt[302] = 2019919538;
        hf.ekjt[303] = -1362462498;
        hf.ekjt[304] = -1347181497;
        hf.ekjt[305] = -110020342;
        hf.ekjt[306] = -471021868;
        hf.ekjt[307] = -1882361337;
        hf.ekjt[308] = -2127966671;
        hf.ekjt[309] = 1348400027;
        hf.ekjt[310] = -795210698;
        hf.ekjt[311] = -2053027669;
        hf.ekjt[312] = 601211689;
        hf.ekjt[313] = -2107303723;
        hf.ekjt[314] = -1771334462;
        hf.ekjt[315] = 40294184;
        hf.ekjt[316] = 568510145;
        hf.ekjt[317] = -90224300;
        hf.ekjt[318] = 476895043;
        hf.ekjt[319] = 1513038107;
        hf.ekjt[320] = 1289123563;
        hf.ekjt[321] = 2106509222;
        hf.ekjt[322] = 974403748;
        hf.ekjt[323] = 1509631455;
        hf.ekjt[324] = -1695045145;
        hf.ekjt[325] = 1996688920;
        hf.ekjt[326] = 929616733;
        hf.ekjt[327] = -1288072160;
        hf.ekjt[328] = 220600833;
        hf.ekjt[329] = 764304096;
        hf.ekjt[330] = -735681611;
        hf.ekjt[331] = 1207715532;
        hf.ekjt[332] = -1543113703;
        hf.ekjt[333] = 1176829825;
        hf.ekjt[334] = 1050249031;
        hf.ekjt[335] = 1183143551;
        hf.ekjt[336] = 746286635;
        hf.ekjt[337] = -625828066;
        hf.ekjt[338] = 1595132303;
        hf.ekjt[339] = 1611629626;
        hf.ekjt[340] = -2043470824;
        hf.ekjt[341] = -406060516;
        hf.ekjt[342] = -1544021823;
        hf.ekjt[343] = 792199172;
        hf.ekjt[344] = -833014827;
        hf.ekjt[345] = 1090692013;
        hf.ekjt[346] = -1966578202;
        hf.ekjt[347] = -239740769;
        hf.ekjt[348] = -400861017;
        hf.ekjt[349] = -409553461;
        hf.ekjt[350] = -1600943218;
        hf.ekjt[351] = 1867851970;
        hf.ekjt[352] = -120370053;
        hf.ekjt[353] = -1368685948;
        hf.ekjt[354] = -107217546;
        hf.ekjt[355] = -1000472802;
        hf.ekjt[356] = 913149948;
        hf.ekjt[357] = 892536630;
        hf.ekjt[358] = 377430955;
        hf.ekjt[359] = -499047529;
        hf.ekjt[360] = 1540959912;
        hf.ekjt[361] = -1178773129;
        hf.ekjt[362] = -1117066151;
        hf.ekjt[363] = -869996794;
        hf.ekjt[364] = -2014249954;
        hf.ekjt[365] = 2096313698;
        hf.ekjt[366] = 681503751;
        hf.ekjt[367] = -308473646;
        hf.ekjt[368] = 1010137442;
        hf.ekjt[369] = 713096895;
        hf.ekjt[370] = 1787588119;
        hf.ekjt[371] = -53530561;
        hf.ekjt[372] = 1936290199;
        hf.ekjt[373] = 75602752;
        hf.ekjt[374] = -1343176989;
        hf.ekjt[375] = 265675379;
        hf.ekjt[376] = 1544046792;
        hf.ekjt[377] = -75983779;
        hf.ekjt[378] = 1331155082;
        hf.ekjt[379] = 339002426;
        hf.ekjt[380] = -822017900;
        hf.ekjt[381] = 1708041116;
        hf.ekjt[382] = 366545890;
        hf.ekjt[383] = 1474863589;
        hf.ekjt[384] = -954483539;
        hf.ekjt[385] = -596622994;
        hf.ekjt[386] = -2047309640;
        hf.ekjt[387] = -1832617612;
        hf.ekjt[388] = 1861333597;
        hf.ekjt[389] = -1883259100;
        hf.ekjt[390] = -515947948;
        hf.ekjt[391] = 916283364;
        hf.ekjt[392] = -1922220242;
        hf.ekjt[393] = -219019114;
        hf.ekjt[394] = -1142568212;
        hf.ekjt[395] = -24645428;
        hf.ekjt[396] = 573956510;
        hf.ekjt[397] = 1897216312;
        hf.ekjt[398] = -509187918;
        hf.ekjt[399] = -1976189538;
    }

    private static /* synthetic */ void emer() {
        hf.ekkq[100] = 4403085893511044610L;
        hf.ekkq[101] = 806856411831351775L;
        hf.ekkq[102] = -8635763864185129618L;
        hf.ekkq[103] = 1419263087900488106L;
        hf.ekkq[104] = 6260782170274357889L;
        hf.ekkq[105] = 4821157218614316341L;
        hf.ekkq[106] = 6929258385439756078L;
        hf.ekkq[107] = 7562284807349187979L;
        hf.ekkq[108] = 1739909763513504018L;
        hf.ekkq[109] = 1970364846108988548L;
        hf.ekkq[110] = 4999542998991827037L;
        hf.ekkq[111] = 6731585740703578621L;
        hf.ekkq[112] = -2565428641733085724L;
        hf.ekkq[113] = 2936788323273344779L;
        hf.ekkq[114] = 3747301016232309304L;
        hf.ekkq[115] = -4908005142414453285L;
        hf.ekkq[116] = -5087891137574993286L;
        hf.ekkq[117] = 6981354777688018646L;
        hf.ekkq[118] = -4010218165034149300L;
        hf.ekkq[119] = -3089334506066156244L;
        hf.ekkq[120] = 6008476223352220446L;
        hf.ekkq[121] = -3000267816868008315L;
        hf.ekkq[122] = 4834610646462130186L;
        hf.ekkq[123] = -8828819282410252460L;
        hf.ekkq[124] = -4709894509436330233L;
        hf.ekkq[125] = 1498705171254694951L;
        hf.ekkq[126] = -7832027073155321035L;
        hf.ekkq[127] = -8465461530325895053L;
        hf.ekkq[128] = -6770046446050443946L;
        hf.ekkq[129] = 7366573587001990502L;
        hf.ekkq[130] = 4684889567224736429L;
        hf.ekkq[131] = -2933800809700138628L;
        hf.ekkq[132] = -7381342609743078213L;
        hf.ekkq[133] = -6240473674945008599L;
        hf.ekkq[134] = -4509092321257132493L;
        hf.ekkq[135] = 4751826450403970756L;
        hf.ekkq[136] = -8610967977442788865L;
        hf.ekkq[137] = -3712901584533003956L;
        hf.ekkq[138] = 4446450389132048615L;
        hf.ekkq[139] = 8794649541951623215L;
        hf.ekkq[140] = -1733367921550767962L;
        hf.ekkq[141] = 5628776423652957645L;
        hf.ekkq[142] = -3090927075336323308L;
        hf.ekkq[143] = -226141653583847291L;
        hf.ekkq[144] = 8945121115282676606L;
        hf.ekkq[145] = -5411530017529538807L;
        hf.ekkq[146] = 5923719784110538698L;
        hf.ekkq[147] = 6552846605553307660L;
        hf.ekkq[148] = 4663655745171244522L;
        hf.ekkq[149] = -8330056150495442774L;
        hf.ekkq[150] = 2927789076473407452L;
        hf.ekkq[151] = -7636430532612453143L;
        hf.ekkq[152] = 252418680060329462L;
        hf.ekkq[153] = 8923552094074952299L;
        hf.ekkq[154] = 9038225745255952963L;
        hf.ekkq[155] = -7062990208945382033L;
        hf.ekkq[156] = -7598443164595649041L;
        hf.ekkq[157] = -4212322521039253795L;
        hf.ekkq[158] = -5354910873498590903L;
        hf.ekkq[159] = -832832484466109829L;
        hf.ekkq[160] = -3986760292419657541L;
        hf.ekkq[161] = -5996362459091126766L;
        hf.ekkq[162] = 317370542403959445L;
        hf.ekkq[163] = -2554222895948325061L;
        hf.ekkq[164] = -8011493261882903512L;
        hf.ekkq[165] = -953236263813403299L;
        hf.ekkq[166] = 8609803607868910798L;
        hf.ekkq[167] = -2228175118161424902L;
        hf.ekkq[168] = 8039384419480734883L;
        hf.ekkq[169] = -6254698245027243496L;
        hf.ekkq[170] = -9108684156636479489L;
        hf.ekkq[171] = -119304003517908892L;
        hf.ekkq[172] = -4136541698640684249L;
        hf.ekkq[173] = -7538891957660141226L;
        hf.ekkq[174] = 6049813641511817564L;
        hf.ekkq[175] = 7914717820444600003L;
        hf.ekkq[176] = 5586431554245688332L;
        hf.ekkq[177] = -6674564957379231036L;
        hf.ekkq[178] = -8602732948228827570L;
        hf.ekkq[179] = -4693069729482362895L;
        hf.ekkq[180] = -19648301703149786L;
        hf.ekkq[181] = -7072684856940298510L;
        hf.ekkq[182] = 6078193847558135242L;
        hf.ekkq[183] = 5689497040506049808L;
        hf.ekkq[184] = 5610305228482644003L;
        hf.ekkq[185] = 5292216219385832422L;
        hf.ekkq[186] = 2010429830778006895L;
        hf.ekkq[187] = -5074744946015919838L;
        hf.ekkq[188] = -5459350518513613617L;
        hf.ekkq[189] = 8906528825429046300L;
        hf.ekkq[190] = -847639498068735303L;
        hf.ekkq[191] = -6223494523013119905L;
        hf.ekkq[192] = -1552399313393535171L;
        hf.ekkq[193] = -8809756562720538876L;
        hf.ekkq[194] = -1207076671449878798L;
        hf.ekkq[195] = 5928399921434182273L;
        hf.ekkq[196] = 2378406305553272539L;
        hf.ekkq[197] = -1640356269692902596L;
        hf.ekkq[198] = -1666064131207445292L;
        hf.ekkq[199] = -4295377252172830073L;
    }

    /*
     * Exception decompiling
     */
    private boolean hasGappleInHotbar() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [31[CASE]], but top level block is 58[DOLOOP]
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

    private static /* synthetic */ void emeo() {
        hf.ekkp[200] = -6475477852592584109L;
        hf.ekkp[201] = -8045447853942087855L;
        hf.ekkp[202] = 6759613708503934094L;
        hf.ekkp[203] = -118023837607625087L;
        hf.ekkp[204] = -8281042499610346795L;
        hf.ekkp[205] = -4255294915340453346L;
        hf.ekkp[206] = -8647704594983522450L;
        hf.ekkp[207] = 5080508036527486540L;
        hf.ekkp[208] = -5111600442077571460L;
        hf.ekkp[209] = 1148121955869010522L;
        hf.ekkp[210] = -1799145159692600370L;
        hf.ekkp[211] = -6449627219125279220L;
        hf.ekkp[212] = 5022012406756871442L;
        hf.ekkp[213] = 3208846679833004737L;
        hf.ekkp[214] = -6281389599474195038L;
        hf.ekkp[215] = 5912494691389325957L;
        hf.ekkp[216] = -135328524449778518L;
        hf.ekkp[217] = -8860846044927854222L;
        hf.ekkp[218] = -6468727738034107429L;
        hf.ekkp[219] = -9026760607279290932L;
        hf.ekkp[220] = -820211158849481753L;
        hf.ekkp[221] = 2236871238293577057L;
        hf.ekkp[222] = 289210820109813239L;
        hf.ekkp[223] = -6068625850455089897L;
        hf.ekkp[224] = 6343984508550164267L;
        hf.ekkp[225] = 6294146295340473238L;
        hf.ekkp[226] = 4637008123572146504L;
        hf.ekkp[227] = -1933673245100295217L;
        hf.ekkp[228] = -7782108366529992930L;
        hf.ekkp[229] = -3155836244039249743L;
        hf.ekkp[230] = 7491671486144630072L;
        hf.ekkp[231] = -8602845264544233011L;
        hf.ekkp[232] = 6027577697378407394L;
        hf.ekkp[233] = 8866027690326748512L;
        hf.ekkp[234] = -8172911213469355200L;
        hf.ekkp[235] = 5836000056190758956L;
        hf.ekkp[236] = 2333651827944496140L;
        hf.ekkp[237] = -747091407154138753L;
        hf.ekkp[238] = -621894189370239307L;
        hf.ekkp[239] = 7055284591639449825L;
        hf.ekkp[240] = -1920898166248176338L;
        hf.ekkp[241] = -6732623531690555865L;
        hf.ekkp[242] = 4777946214925713927L;
        hf.ekkp[243] = -3706933063112442781L;
        hf.ekkp[244] = 8629726815518407678L;
        hf.ekkp[245] = 4095329432380703689L;
        hf.ekkp[246] = 6388735107106787179L;
        hf.ekkp[247] = -3667030355494673299L;
        hf.ekkp[248] = -8577962437838201790L;
        hf.ekkp[249] = -3863226076887274572L;
        hf.ekkp[250] = 8813508974686504850L;
        hf.ekkp[251] = -5834820628410192572L;
        hf.ekkp[252] = -7975547372875051615L;
        hf.ekkp[253] = 4876354329315180903L;
        hf.ekkp[254] = 8968031749677515431L;
        hf.ekkp[255] = -8050614860149688093L;
        hf.ekkp[256] = 4421779076074998869L;
        hf.ekkp[257] = -5770818333975598779L;
        hf.ekkp[258] = 870854611559548815L;
        hf.ekkp[259] = 1468515635301868802L;
        hf.ekkp[260] = 6712973520956506196L;
        hf.ekkp[261] = -9194533343771148212L;
        hf.ekkp[262] = 4075011304268280364L;
        hf.ekkp[263] = 8632380775742330689L;
        hf.ekkp[264] = -9056975378851849539L;
        hf.ekkp[265] = -5508202529372310447L;
        hf.ekkp[266] = 681386710600998752L;
        hf.ekkp[267] = -8689180678783509630L;
        hf.ekkp[268] = 8225671830725774068L;
        hf.ekkp[269] = -8237627921026873977L;
        hf.ekkp[270] = 2847855732177073566L;
        hf.ekkp[271] = -1966294460722005596L;
        hf.ekkp[272] = -6340960211097316867L;
        hf.ekkp[273] = -648708260450957527L;
        hf.ekkp[274] = -8774410864975135083L;
        hf.ekkp[275] = 2170443752433262935L;
        hf.ekkp[276] = 7886305558595206114L;
        hf.ekkp[277] = -5099551661379264461L;
        hf.ekkp[278] = -8312078843345206144L;
        hf.ekkp[279] = -3642394117547760280L;
        hf.ekkp[280] = 4928344384123363696L;
        hf.ekkp[281] = -5814639438489313312L;
        hf.ekkp[282] = -9110736799945400776L;
        hf.ekkp[283] = 7030923741092064221L;
        hf.ekkp[284] = -4303968996218116904L;
        hf.ekkp[285] = 2116506438319526527L;
        hf.ekkp[286] = -3747435414327714349L;
        hf.ekkp[287] = -1215292865195589176L;
        hf.ekkp[288] = -7765461075221920807L;
        hf.ekkp[289] = 4837965465060459825L;
        hf.ekkp[290] = -4597080312852851443L;
        hf.ekkp[291] = 1035926544871954058L;
        hf.ekkp[292] = -5391316714468490001L;
        hf.ekkp[293] = 1586954811282249783L;
        hf.ekkp[294] = -8575682133792013798L;
        hf.ekkp[295] = 2668527716387705245L;
        hf.ekkp[296] = 1938713307365029117L;
        hf.ekkp[297] = -8078725536165059899L;
        hf.ekkp[298] = -3510229333911991013L;
        hf.ekkp[299] = -5819862504265496218L;
    }

    private static /* synthetic */ void emet() {
        hf.ekkq[300] = 6782714707441969710L;
        hf.ekkq[301] = 24586581538159581L;
        hf.ekkq[302] = 8544110446782567567L;
        hf.ekkq[303] = -7397630596960277417L;
        hf.ekkq[304] = -6406775780163830811L;
        hf.ekkq[305] = 8018026242872291948L;
        hf.ekkq[306] = 3672387896625156112L;
        hf.ekkq[307] = 4561222396520181007L;
        hf.ekkq[308] = -3080445063712170150L;
        hf.ekkq[309] = 6544386612532198400L;
        hf.ekkq[310] = 2803968579162172717L;
        hf.ekkq[311] = -1997005629333558779L;
        hf.ekkq[312] = 9135603475121578961L;
        hf.ekkq[313] = 6966144122574035938L;
        hf.ekkq[314] = -8902004099577095958L;
        hf.ekkq[315] = -758113479161215344L;
        hf.ekkq[316] = -7154839460673767026L;
        hf.ekkq[317] = -5203929424076785930L;
        hf.ekkq[318] = -8297138700125807205L;
        hf.ekkq[319] = 995806726763413958L;
        hf.ekkq[320] = 6302587192328942692L;
        hf.ekkq[321] = -5395324653575024323L;
        hf.ekkq[322] = 4995494368853388369L;
        hf.ekkq[323] = -7232761593242965905L;
        hf.ekkq[324] = -7282706389033517920L;
        hf.ekkq[325] = -4758340617157566454L;
        hf.ekkq[326] = 7280215254131416858L;
        hf.ekkq[327] = 6147145172295340757L;
        hf.ekkq[328] = -1785237085515711352L;
        hf.ekkq[329] = -5104387900457512463L;
        hf.ekkq[330] = -5753162470727731102L;
        hf.ekkq[331] = 7706363378630570720L;
        hf.ekkq[332] = -4572600644133677783L;
        hf.ekkq[333] = -852110608969437557L;
        hf.ekkq[334] = 8143951391667409164L;
        hf.ekkq[335] = 8706818158875168505L;
        hf.ekkq[336] = 3739676922305639480L;
        hf.ekkq[337] = -7656304110813884316L;
        hf.ekkq[338] = 3402333300135539256L;
        hf.ekkq[339] = 47647735493222273L;
        hf.ekkq[340] = 313825007293588368L;
        hf.ekkq[341] = 8490539070334745568L;
        hf.ekkq[342] = -4192961928342757683L;
        hf.ekkq[343] = 5930881778802519262L;
        hf.ekkq[344] = 7994547455609104943L;
        hf.ekkq[345] = 1688330820427825147L;
        hf.ekkq[346] = -295804289747752902L;
        hf.ekkq[347] = 4606409210495919961L;
        hf.ekkq[348] = -678607323442190176L;
        hf.ekkq[349] = 5844377431693440526L;
        hf.ekkq[350] = -8710156671572162877L;
        hf.ekkq[351] = 8868807328481994031L;
        hf.ekkq[352] = 3999893280312228508L;
        hf.ekkq[353] = -7254824164756977089L;
        hf.ekkq[354] = 4281964305433273635L;
        hf.ekkq[355] = 5321353593991432940L;
        hf.ekkq[356] = 7459280927501404106L;
        hf.ekkq[357] = -2492971175896332781L;
        hf.ekkq[358] = 5093387328556806517L;
        hf.ekkq[359] = 2533959936464104652L;
        hf.ekkq[360] = 7206881794350004551L;
        hf.ekkq[361] = -3427955680054900942L;
        hf.ekkq[362] = 1507301546195570354L;
        hf.ekkq[363] = -6281478692961002416L;
        hf.ekkq[364] = -6393625199773772630L;
        hf.ekkq[365] = 4023432524774630328L;
        hf.ekkq[366] = 596834949221156712L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void startEating() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hf.ku - hf.ekju("eloo", ekko(int ), (int)256)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hf.ekju("elov", ekjy(int ), (int)384)) break;
            v0 /* !! */  = (long)hf.ekju("elow", ekjy(int ), (int)385);
        }
        var3_1 = hf.c;
        v1 /* !! */  = hf.ku;
        if (true) ** GOTO lbl11
        block52: while (true) {
            v1 /* !! */  = (long)(v2 - hf.ekju("eloy", ekko(int ), (int)257));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1671807292: {
                    v2 = hf.ekju("eloz", ekko(int ), (int)258);
                    continue block52;
                }
                case -273819947: {
                    break block52;
                }
                case -200938408: {
                    v2 = hf.ekju("elpb", ekko(int ), (int)259);
                    continue block52;
                }
                case 560194905: {
                    v2 = hf.ekju("elpc", ekko(int ), (int)260);
                    continue block52;
                }
            }
            break;
        }
        var2_2 /* !! */  = hf.b;
        v3 /* !! */  = hf.ku;
        if (true) ** GOTO lbl28
        block53: while (true) {
            v3 /* !! */  = (long)(v4 - hf.ekju("elpd", ekko(int ), (int)261));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1485222124: {
                    v4 = hf.ekju("elpe", ekko(int ), (int)262);
                    continue block53;
                }
                case -273819947: {
                    break block53;
                }
                case -44495932: {
                    v4 = hf.ekju("elpf", ekko(int ), (int)263);
                    continue block53;
                }
            }
            break;
        }
        var1_3 = hf.a;
        if (var3_1) {
            throw null;
lbl40:
            // 6 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl40
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = hf.ku - hf.ekju("elph", ekko(int ), (int)264)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == hf.ekju("elpk", ekjy(int ), (int)386)) break;
            v5 /* !! */  = (long)hf.ekju("elpm", ekjy(int ), (int)387);
        }
        if (this.isEating) ** GOTO lbl152
        if (var1_3) ** GOTO lbl40
        v6 /* !! */  = hf.ku;
        if (true) ** GOTO lbl54
        block56: while (true) {
            v6 /* !! */  = (long)(v7 - hf.ekju("elpn", ekko(int ), (int)265));
lbl54:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1925746844: {
                    v7 = hf.ekju("elpp", ekko(int ), (int)266);
                    continue block56;
                }
                case -1602976902: {
                    v7 = hf.ekju("elpq", ekko(int ), (int)267);
                    continue block56;
                }
                case -273819947: {
                    break block56;
                }
                case 1965459621: {
                    v7 = hf.ekju("elps", ekko(int ), (int)268);
                    continue block56;
                }
            }
            break;
        }
        v8 /* !! */  = hf.ku;
        if (true) ** GOTO lbl70
        block57: while (true) {
            v8 /* !! */  = (long)(hf.ekju("elpv", ekko(int ), (int)270) - hf.ekju("elpt", ekko(int ), (int)269));
lbl70:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1182345418: {
                    continue block57;
                }
                case -273819947: {
                    break block57;
                }
            }
            break;
        }
        v9 = hf.mc.field_1690;
        v10 /* !! */  = hf.ku;
        if (true) ** GOTO lbl80
        block58: while (true) {
            v10 /* !! */  = (long)(v11 - hf.ekju("elpw", ekko(int ), (int)271));
lbl80:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -397827868: {
                    v11 = hf.ekju("elpx", ekko(int ), (int)272);
                    continue block58;
                }
                case -273819947: {
                    break block58;
                }
                case 407610349: {
                    v11 = hf.ekju("elpy", ekko(int ), (int)273);
                    continue block58;
                }
            }
            break;
        }
        v12 = v9.field_1904;
        v13 /* !! */  = hf.ku;
        if (true) ** GOTO lbl94
        block59: while (true) {
            v13 /* !! */  = (long)(v14 - hf.ekju("elpz", ekko(int ), (int)274));
lbl94:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -390713550: {
                    v14 = hf.ekju("elqa", ekko(int ), (int)275);
                    continue block59;
                }
                case -273819947: {
                    break block59;
                }
                case 151749800: {
                    v14 = hf.ekju("elqb", ekko(int ), (int)276);
                    continue block59;
                }
                case 1792927792: {
                    v14 = hf.ekju("elqc", ekko(int ), (int)277);
                    continue block59;
                }
            }
            break;
        }
        if (v12.method_1434()) ** GOTO lbl152
        if (var1_3 || var1_3) ** GOTO lbl40
        v15 /* !! */  = hf.ku;
        if (true) ** GOTO lbl112
        block60: while (true) {
            v15 /* !! */  = (long)(v16 - hf.ekju("elqg", ekko(int ), (int)278));
lbl112:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -1564234842: {
                    v16 = hf.ekju("elqi", ekko(int ), (int)279);
                    continue block60;
                }
                case -1437554653: {
                    v16 = hf.ekju("elqj", ekko(int ), (int)280);
                    continue block60;
                }
                case -273819947: {
                    break block60;
                }
            }
            break;
        }
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_2 = hf.ku - hf.ekju("elql", ekko(int ), (int)281)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == hf.ekju("elqm", ekjy(int ), (int)388)) break;
            v17 /* !! */  = (long)hf.ekju("elqn", ekjy(int ), (int)389);
        }
        v18 = hf.mc.field_1690;
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_3 = hf.ku - hf.ekju("elqp", ekko(int ), (int)282)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == hf.ekju("elqq", ekjy(int ), (int)390)) break;
            v19 /* !! */  = (long)hf.ekju("elqr", ekjy(int ), (int)391);
        }
        v20 = v18.field_1904;
        v21 = hf.ekju("elqs", ekjy(int ), (int)392);
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_4 = hf.ku - hf.ekju("elqt", ekko(int ), (int)283)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == hf.ekju("elqv", ekjy(int ), (int)393)) break;
            v22 /* !! */  = (long)hf.ekju("elqw", ekjy(int ), (int)394);
        }
        v20.method_23481((boolean)v21);
        if (var1_3 || var1_3) ** GOTO lbl40
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v23 = hf.ekju("elqy", ekjy(int ), (int)395);
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_5 = hf.ku - hf.ekju("elqz", ekko(int ), (int)284)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == hf.ekju("elra", ekjy(int ), (int)396)) break;
                    v24 /* !! */  = (long)hf.ekju("elrb", ekjy(int ), (int)397);
                }
                this.isEating = v23;
                if (var1_3) ** GOTO lbl40
lbl152:
                // 3 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl155:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hf.ekju("elrc", ekjy(int ), (int)398);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl160:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hf.ekju("elrd", ekjy(int ), (int)399);
                if (!var3_1) ** GOTO lbl155
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hf.ekju("elre", ekjy(int ), (int)400);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 3: {
                var2_2 /* !! */  = (int)hf.ekju("elrf", ekjy(int ), (int)401);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl174:
            // 3 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)hf.ekju("elrj", ekjy(int ), (int)402);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)hf.ekju("elrl", ekjy(int ), (int)403);
                if (!var3_1) break;
                throw null;
            }
lbl183:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)hf.ekju("elro", ekjy(int ), (int)404);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 7: {
                var2_2 /* !! */  = (int)hf.ekju("elrp", ekjy(int ), (int)405);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 8: {
                var2_2 /* !! */  = (int)hf.ekju("elrq", ekjy(int ), (int)406);
                if (!var3_1) ** GOTO lbl174
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)hf.ekju("elrr", ekjy(int ), (int)407);
                if (!var3_1) ** GOTO lbl160
                throw null;
            }
lbl201:
            // 4 sources

            case 10: {
                var2_2 /* !! */  = (int)hf.ekju("elrs", ekjy(int ), (int)408);
                if (!var3_1) ** GOTO lbl174
                throw null;
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)hf.ekju("elrw", ekjy(int ), (int)409);
        ** while (!var3_1)
lbl208:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int findGappleInHotbar() {
        block27: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hf.ku - hf.ekju("elgu", ekko(int ), (int)212)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == hf.ekju("elgv", ekjy(int ), (int)308)) break;
                v0 /* !! */  = (long)hf.ekju("elgw", ekjy(int ), (int)309);
            }
            var5_1 = hf.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = hf.ku - hf.ekju("elgx", ekko(int ), (int)213)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == hf.ekju("elgy", ekjy(int ), (int)310)) break;
                v1 /* !! */  = (long)hf.ekju("elgz", ekjy(int ), (int)311);
            }
            var4_2 = hf.b;
            v2 /* !! */  = hf.ku;
            if (true) ** GOTO lbl17
            block17: while (true) {
                v2 /* !! */  = (long)(v3 - hf.ekju("elhb", ekko(int ), (int)214));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -273819947: {
                        break block17;
                    }
                    case -205207136: {
                        v3 = hf.ekju("elhc", ekko(int ), (int)215);
                        continue block17;
                    }
                    case -168565607: {
                        v3 = hf.ekju("elhg", ekko(int ), (int)216);
                        continue block17;
                    }
                    case 2146196475: {
                        v3 = hf.ekju("elhh", ekko(int ), (int)217);
                        continue block17;
                    }
                }
                break;
            }
            var3_3 = hf.a;
            if (var5_1) {
                throw null;
lbl32:
                // 9 sources

                return (int)hf.ekju("elhj", ekjy(int ), (int)312);
            }
            if (var3_3 || var3_3) ** GOTO lbl32
            var1_4 = hf.ekju("elhk", ekjy(int ), (int)313);
            if (var3_3) ** GOTO lbl32
            do {
                block28: {
                    if (var3_3 || var3_3) ** GOTO lbl32
                    if (var1_4 >= hf.ekju("elhm", ekjy(int ), (int)314)) break block27;
                    if (var3_3 || var3_3) ** GOTO lbl32
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_2 = hf.ku - hf.ekju("elho", ekko(int ), (int)218)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v4 /* !! */  == hf.ekju("elhp", ekjy(int ), (int)315)) break;
                        v4 /* !! */  = (long)hf.ekju("elhq", ekjy(int ), (int)316);
                    }
                    v5 /* !! */  = hf.ku;
                    if (true) ** GOTO lbl50
                    block21: while (true) {
                        v5 /* !! */  = (long)(hf.ekju("elht", ekko(int ), (int)220) - hf.ekju("elhr", ekko(int ), (int)219));
lbl50:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case -273819947: {
                                break block21;
                            }
                            case 1117861687: {
                                continue block21;
                            }
                        }
                        break;
                    }
                    v6 = hf.mc.field_1724;
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_3 = hf.ku - hf.ekju("elhv", ekko(int ), (int)221)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v7 /* !! */  == hf.ekju("elhx", ekjy(int ), (int)317)) break;
                        v7 /* !! */  = (long)hf.ekju("elhy", ekjy(int ), (int)318);
                    }
                    v8 = v6.method_31548();
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_4 = hf.ku - hf.ekju("elia", ekko(int ), (int)222)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v9 /* !! */  == hf.ekju("elic", ekjy(int ), (int)319)) break;
                        v9 /* !! */  = (long)hf.ekju("elie", ekjy(int ), (int)320);
                    }
                    var2_5 = v8.method_5438((int)var1_4);
                    if (var3_3 || var3_3) ** GOTO lbl32
                    v10 /* !! */  = hf.ku;
                    if (true) ** GOTO lbl73
                    block24: while (true) {
                        v10 /* !! */  = (long)(v11 - hf.ekju("elif", ekko(int ), (int)223));
lbl73:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case -468412334: {
                                v11 = hf.ekju("elih", ekko(int ), (int)224);
                                continue block24;
                            }
                            case -273819947: {
                                break block24;
                            }
                            case 277930605: {
                                v11 = hf.ekju("elii", ekko(int ), (int)225);
                                continue block24;
                            }
                        }
                        break;
                    }
                    v12 = var2_5.method_7909();
                    while (true) {
                        if ((v13 /* !! */  = (cfr_temp_5 = hf.ku - hf.ekju("elij", ekko(int ), (int)226)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v13 /* !! */  == hf.ekju("elik", ekjy(int ), (int)321)) break;
                        v13 /* !! */  = (long)hf.ekju("elil", ekjy(int ), (int)322);
                    }
                    if (v12 != class_1802.field_8463) break block28;
                    if (var3_3 || var3_3) ** GOTO lbl32
                    return (int)var1_4;
                }
                if (var3_3 || var3_3) ** GOTO lbl32
                ++var1_4;
                if (var3_3) ** GOTO lbl32
            } while (!var5_1);
            throw null;
        }
        if (!var3_3 && !var3_3) ** break;
        ** while (true)
        return (int)hf.ekju("elio", ekjy(int ), (int)323);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public hf() {
        var2_1 /* !! */  = hf.b;
        super("AutoGApple", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0435\u0441\u0442 \u0437\u043e\u043b\u043e\u0442\u044b\u0435 \u044f\u0431\u043b\u043e\u043a\u0438", du.RAGE);
        this.healthThreshold = new kg("\u0417\u0434\u043e\u0440\u043e\u0432\u044c\u0435", "\u041f\u043e\u0440\u043e\u0433 \u0437\u0434\u043e\u0440\u043e\u0432\u044c\u044f \u0434\u043b\u044f \u0435\u0434\u044b", (float)hf.ekju("ekjv", ekjr(int ), (int)0)).range((float)hf.ekju("ekjw", ekjr(int ), (int)1), (float)hf.ekju("ekjx", ekjr(int ), (int)2));
        this.smartMode = new kb("\u0423\u043c\u043d\u044b\u0439", "\u0415\u0441\u0442\u044c \u0438\u0437 \u0445\u043e\u0442\u0431\u0430\u0440\u0430, \u0438\u043d\u0430\u0447\u0435 \u0442\u043e\u043b\u044c\u043a\u043e \u0441 \u043b\u0435\u0432\u043e\u0439 \u0440\u0443\u043a\u0438").setValue((boolean)hf.ekju("ekjz", ekjy(int ), (int)3));
        this.goldenHearts = new kb("\u0417\u043e\u043b\u043e\u0442\u044b\u0435 \u0441\u0435\u0440\u0434\u0446\u0430", "\u0423\u0447\u0438\u0442\u044b\u0432\u0430\u0442\u044c absorption").setValue((boolean)hf.ekju("ekka", ekjy(int ), (int)4));
        this.returnSlot = new kb("\u0412\u043e\u0437\u0432\u0440\u0430\u0449\u0430\u0442\u044c \u0441\u043b\u043e\u0442", "\u0412\u043e\u0437\u0432\u0440\u0430\u0449\u0430\u0442\u044c \u043f\u0440\u0435\u0434\u044b\u0434\u0443\u0449\u0438\u0439 \u0441\u043b\u043e\u0442 \u043f\u043e\u0441\u043b\u0435 \u0435\u0434\u044b").setValue((boolean)hf.ekju("ekkb", ekjy(int ), (int)5));
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.isEating = hf.ekju("ekkc", ekjy(int ), (int)6);
                this.previousSlot = (int)hf.ekju("ekkd", ekjy(int ), (int)7);
                this.settings(new jx[]{this.healthThreshold, this.smartMode, this.goldenHearts, this.returnSlot});
                return;
            }
lbl14:
            // 2 sources

            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)hf.ekju("ekke", ekjy(int ), (int)8);
                }
            }
            case 1: {
                var2_1 /* !! */  = (int)hf.ekju("ekkf", ekjy(int ), (int)9);
                ** GOTO lbl30
            }
lbl21:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)hf.ekju("ekkg", ekjy(int ), (int)10);
                ** GOTO lbl30
            }
            case 3: {
                var2_1 /* !! */  = (int)hf.ekju("ekkh", ekjy(int ), (int)11);
                ** GOTO lbl14
            }
            case 4: {
                var2_1 /* !! */  = (int)hf.ekju("ekki", ekjy(int ), (int)12);
                ** GOTO lbl33
            }
lbl30:
            // 4 sources

            case 5: {
                var2_1 /* !! */  = (int)hf.ekju("ekkj", ekjy(int ), (int)13);
                ** GOTO lbl21
            }
lbl33:
            // 3 sources

            case 6: {
                var2_1 /* !! */  = (int)hf.ekju("ekkk", ekjy(int ), (int)14);
            }
            case 7: {
                var2_1 /* !! */  = (int)hf.ekju("ekkl", ekjy(int ), (int)15);
                ** GOTO lbl33
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)hf.ekju("ekkm", ekjy(int ), (int)16);
                    ** GOTO lbl30
                    break;
                }
            }
            case 9: 
        }
        var2_1 /* !! */  = (int)hf.ekju("ekkn", ekjy(int ), (int)17);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kb getReturnSlot() {
        v0 /* !! */  = hf.ku;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - hf.ekju("elyz", ekko(int ), (int)344));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1441620314: {
                    v1 = hf.ekju("elza", ekko(int ), (int)345);
                    continue block17;
                }
                case -787489720: {
                    v1 = hf.ekju("elzb", ekko(int ), (int)346);
                    continue block17;
                }
                case -273819947: {
                    break block17;
                }
            }
            break;
        }
        var3_1 = hf.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hf.ku - hf.ekju("elzd", ekko(int ), (int)347)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hf.ekju("elze", ekjy(int ), (int)470)) break;
            v2 /* !! */  = (long)hf.ekju("elzf", ekjy(int ), (int)471);
        }
        var2_2 /* !! */  = hf.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = hf.ku;
                if (true) ** GOTO lbl29
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - hf.ekju("elzh", ekko(int ), (int)348));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1661606279: {
                            v4 = hf.ekju("elzi", ekko(int ), (int)349);
                            continue block19;
                        }
                        case -273819947: {
                            break block19;
                        }
                        case 186897333: {
                            v4 = hf.ekju("elzk", ekko(int ), (int)350);
                            continue block19;
                        }
                        case 424872753: {
                            v4 = hf.ekju("elzm", ekko(int ), (int)351);
                            continue block19;
                        }
                    }
                    break;
                }
                var1_3 = hf.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = hf.ku - hf.ekju("elzo", ekko(int ), (int)352)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hf.ekju("elzp", ekjy(int ), (int)472)) break;
                    v5 /* !! */  = (long)hf.ekju("elzr", ekjy(int ), (int)473);
                }
                return this.returnSlot;
            }
lbl54:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hf.ekju("elzs", ekjy(int ), (int)474);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)hf.ekju("elzu", ekjy(int ), (int)475);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hf.ekju("elzv", ekjy(int ), (int)476);
                    if (!var3_1) ** GOTO lbl54
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hf.ekju("elzw", ekjy(int ), (int)477);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void emep() {
        hf.ekkp[300] = -145267574891403507L;
        hf.ekkp[301] = -6200351191687067534L;
        hf.ekkp[302] = 4620963016536242113L;
        hf.ekkp[303] = -5673498032278045622L;
        hf.ekkp[304] = -1392353188781382358L;
        hf.ekkp[305] = -8076428927101038979L;
        hf.ekkp[306] = 6950066029280753082L;
        hf.ekkp[307] = 714490806095474647L;
        hf.ekkp[308] = 114676316954254004L;
        hf.ekkp[309] = 5005768353039705521L;
        hf.ekkp[310] = 7183015959246728812L;
        hf.ekkp[311] = -8550201628032920870L;
        hf.ekkp[312] = -2128161268423971343L;
        hf.ekkp[313] = 4536662613047318332L;
        hf.ekkp[314] = -920460316526661006L;
        hf.ekkp[315] = 6047271278219485336L;
        hf.ekkp[316] = -5099316686683228972L;
        hf.ekkp[317] = 2767406860722995027L;
        hf.ekkp[318] = 7441361204984722332L;
        hf.ekkp[319] = 2726190820839374562L;
        hf.ekkp[320] = -3859141176274878647L;
        hf.ekkp[321] = 5545535255925173040L;
        hf.ekkp[322] = 3317978226222840790L;
        hf.ekkp[323] = 3205939878528134297L;
        hf.ekkp[324] = 8363145541078995578L;
        hf.ekkp[325] = -7929992940701448707L;
        hf.ekkp[326] = -5287743679148176287L;
        hf.ekkp[327] = -8859902277187500851L;
        hf.ekkp[328] = -1400377501264797078L;
        hf.ekkp[329] = -3340828053393469029L;
        hf.ekkp[330] = 990402085642679511L;
        hf.ekkp[331] = -9147795468771041052L;
        hf.ekkp[332] = 4238561892276614395L;
        hf.ekkp[333] = 935906661521875467L;
        hf.ekkp[334] = 715023004008164318L;
        hf.ekkp[335] = -9206003681875038398L;
        hf.ekkp[336] = 5055772592939303868L;
        hf.ekkp[337] = -8450603910933017286L;
        hf.ekkp[338] = 8566831188933035054L;
        hf.ekkp[339] = 2183989040549355593L;
        hf.ekkp[340] = -5738468444339224253L;
        hf.ekkp[341] = -213517152229831287L;
        hf.ekkp[342] = 8614597896538849583L;
        hf.ekkp[343] = 5302923526773267114L;
        hf.ekkp[344] = 5542201027897486491L;
        hf.ekkp[345] = -5274524128545185578L;
        hf.ekkp[346] = 6284834376279416371L;
        hf.ekkp[347] = 1571033452938336352L;
        hf.ekkp[348] = -8570215026022264046L;
        hf.ekkp[349] = 4860038566903645263L;
        hf.ekkp[350] = 6425036829788292186L;
        hf.ekkp[351] = 4708595551722954832L;
        hf.ekkp[352] = 865790191561645623L;
        hf.ekkp[353] = 7572810904329501604L;
        hf.ekkp[354] = -2184263990935176729L;
        hf.ekkp[355] = -8788863014823772064L;
        hf.ekkp[356] = -3695135846578493818L;
        hf.ekkp[357] = -6711582981518098374L;
        hf.ekkp[358] = 2155399755429048457L;
        hf.ekkp[359] = -4854996504121775578L;
        hf.ekkp[360] = 7391801719765879109L;
        hf.ekkp[361] = -627285158883047535L;
        hf.ekkp[362] = -1449508286611899195L;
        hf.ekkp[363] = -5166338029857901072L;
        hf.ekkp[364] = -1284737890398729066L;
        hf.ekkp[365] = 396836173136903106L;
        hf.ekkp[366] = 3768014772270863144L;
    }

    private static /* synthetic */ void emef() {
        hf.ekjt[100] = 1228909314;
        hf.ekjt[101] = -304346814;
        hf.ekjt[102] = 107812473;
        hf.ekjt[103] = 605046852;
        hf.ekjt[104] = 1764152515;
        hf.ekjt[105] = -1128108338;
        hf.ekjt[106] = 1869995012;
        hf.ekjt[107] = 48700934;
        hf.ekjt[108] = -1194995761;
        hf.ekjt[109] = -295886535;
        hf.ekjt[110] = 490516456;
        hf.ekjt[111] = 1695379823;
        hf.ekjt[112] = 1806002255;
        hf.ekjt[113] = -873987089;
        hf.ekjt[114] = -1727815075;
        hf.ekjt[115] = -953489082;
        hf.ekjt[116] = 1932178882;
        hf.ekjt[117] = 1638238615;
        hf.ekjt[118] = -30625265;
        hf.ekjt[119] = -453812674;
        hf.ekjt[120] = -910300944;
        hf.ekjt[121] = 1908874527;
        hf.ekjt[122] = -1091090855;
        hf.ekjt[123] = -1711454921;
        hf.ekjt[124] = 481515777;
        hf.ekjt[125] = 72492667;
        hf.ekjt[126] = 1066892519;
        hf.ekjt[127] = 418781003;
        hf.ekjt[128] = -541173835;
        hf.ekjt[129] = -1836258830;
        hf.ekjt[130] = 1030784783;
        hf.ekjt[131] = -716148350;
        hf.ekjt[132] = -1032474214;
        hf.ekjt[133] = -1588009461;
        hf.ekjt[134] = -227585911;
        hf.ekjt[135] = -611865643;
        hf.ekjt[136] = 1837114833;
        hf.ekjt[137] = -438500389;
        hf.ekjt[138] = 246406478;
        hf.ekjt[139] = 200771734;
        hf.ekjt[140] = 215682412;
        hf.ekjt[141] = 1123433011;
        hf.ekjt[142] = -1966723761;
        hf.ekjt[143] = -219593313;
        hf.ekjt[144] = -1669277791;
        hf.ekjt[145] = -890985676;
        hf.ekjt[146] = 947157282;
        hf.ekjt[147] = -444268500;
        hf.ekjt[148] = -213790417;
        hf.ekjt[149] = 17276175;
        hf.ekjt[150] = -245811494;
        hf.ekjt[151] = 1577015210;
        hf.ekjt[152] = 1495074758;
        hf.ekjt[153] = -112657654;
        hf.ekjt[154] = 746778158;
        hf.ekjt[155] = -36323902;
        hf.ekjt[156] = -1428763317;
        hf.ekjt[157] = 373938592;
        hf.ekjt[158] = -611441226;
        hf.ekjt[159] = 1463428880;
        hf.ekjt[160] = 1276254989;
        hf.ekjt[161] = -1428513963;
        hf.ekjt[162] = -2080048742;
        hf.ekjt[163] = -1914668448;
        hf.ekjt[164] = 961726877;
        hf.ekjt[165] = 1077901498;
        hf.ekjt[166] = 1415850718;
        hf.ekjt[167] = 204662815;
        hf.ekjt[168] = -2143384811;
        hf.ekjt[169] = -1610931712;
        hf.ekjt[170] = -899228883;
        hf.ekjt[171] = -2041373372;
        hf.ekjt[172] = 56510613;
        hf.ekjt[173] = -109011196;
        hf.ekjt[174] = 1850963245;
        hf.ekjt[175] = 2017157656;
        hf.ekjt[176] = -651313251;
        hf.ekjt[177] = 1724118957;
        hf.ekjt[178] = 806172437;
        hf.ekjt[179] = -1591241924;
        hf.ekjt[180] = 792142018;
        hf.ekjt[181] = -712868200;
        hf.ekjt[182] = -1256500606;
        hf.ekjt[183] = -760862992;
        hf.ekjt[184] = -1849858658;
        hf.ekjt[185] = -2057452910;
        hf.ekjt[186] = 367104520;
        hf.ekjt[187] = 325507185;
        hf.ekjt[188] = -1124341583;
        hf.ekjt[189] = -1493529529;
        hf.ekjt[190] = -1237807216;
        hf.ekjt[191] = -34023254;
        hf.ekjt[192] = 1528486434;
        hf.ekjt[193] = -858137014;
        hf.ekjt[194] = 1978663909;
        hf.ekjt[195] = 2012392105;
        hf.ekjt[196] = -1316939924;
        hf.ekjt[197] = 1363137785;
        hf.ekjt[198] = 801987546;
        hf.ekjt[199] = -454634001;
    }

    private static /* synthetic */ void emcn() {
        hf.ekjs[100] = 1228909325;
        hf.ekjs[101] = -304346806;
        hf.ekjs[102] = 107812464;
        hf.ekjs[103] = 605046878;
        hf.ekjs[104] = 1764152512;
        hf.ekjs[105] = -1128108341;
        hf.ekjs[106] = 1869995022;
        hf.ekjs[107] = 48700935;
        hf.ekjs[108] = -1547202834;
        hf.ekjs[109] = 295886534;
        hf.ekjs[110] = -1411152032;
        hf.ekjs[111] = -1695379824;
        hf.ekjs[112] = 1631702437;
        hf.ekjs[113] = -873987090;
        hf.ekjs[114] = 1727815074;
        hf.ekjs[115] = 1697200823;
        hf.ekjs[116] = 1932178883;
        hf.ekjs[117] = 1638238615;
        hf.ekjs[118] = -30625273;
        hf.ekjs[119] = -453812677;
        hf.ekjs[120] = -910300935;
        hf.ekjs[121] = 1908874526;
        hf.ekjs[122] = -1091090864;
        hf.ekjs[123] = -1711454923;
        hf.ekjs[124] = 481515785;
        hf.ekjs[125] = 72492664;
        hf.ekjs[126] = 1066892514;
        hf.ekjs[127] = 418781006;
        hf.ekjs[128] = 541173834;
        hf.ekjs[129] = -247226630;
        hf.ekjs[130] = 1030784782;
        hf.ekjs[131] = -716148349;
        hf.ekjs[132] = 2042506695;
        hf.ekjs[133] = -1588009462;
        hf.ekjs[134] = 145535496;
        hf.ekjs[135] = -611865643;
        hf.ekjs[136] = -1837114834;
        hf.ekjs[137] = -1322312168;
        hf.ekjs[138] = -246406479;
        hf.ekjs[139] = -1003609369;
        hf.ekjs[140] = 215682413;
        hf.ekjs[141] = -487714168;
        hf.ekjs[142] = -1966723762;
        hf.ekjs[143] = 1715764127;
        hf.ekjs[144] = -1669277792;
        hf.ekjs[145] = -1875154218;
        hf.ekjs[146] = 947157282;
        hf.ekjs[147] = -444268499;
        hf.ekjs[148] = 368669148;
        hf.ekjs[149] = -17276176;
        hf.ekjs[150] = -731805068;
        hf.ekjs[151] = 1577015210;
        hf.ekjs[152] = -1495074759;
        hf.ekjs[153] = -269279134;
        hf.ekjs[154] = 746778158;
        hf.ekjs[155] = -36323901;
        hf.ekjs[156] = 1804982163;
        hf.ekjs[157] = 373938593;
        hf.ekjs[158] = -611441226;
        hf.ekjs[159] = 1463428891;
        hf.ekjs[160] = 1276255004;
        hf.ekjs[161] = -1428513967;
        hf.ekjs[162] = -2080048754;
        hf.ekjs[163] = -1914668439;
        hf.ekjs[164] = 961726875;
        hf.ekjs[165] = 1077901474;
        hf.ekjs[166] = 1415850701;
        hf.ekjs[167] = 204662810;
        hf.ekjs[168] = -2143384803;
        hf.ekjs[169] = -1610931703;
        hf.ekjs[170] = -899228883;
        hf.ekjs[171] = -2041373354;
        hf.ekjs[172] = 56510612;
        hf.ekjs[173] = -109011196;
        hf.ekjs[174] = 1850963260;
        hf.ekjs[175] = 2017157647;
        hf.ekjs[176] = -651313263;
        hf.ekjs[177] = 1724118946;
        hf.ekjs[178] = 806172441;
        hf.ekjs[179] = -1591241939;
        hf.ekjs[180] = 792142019;
        hf.ekjs[181] = -712868215;
        hf.ekjs[182] = -1256500597;
        hf.ekjs[183] = -760862999;
        hf.ekjs[184] = -1849858666;
        hf.ekjs[185] = -2057452909;
        hf.ekjs[186] = 34330717;
        hf.ekjs[187] = -325507186;
        hf.ekjs[188] = 395868764;
        hf.ekjs[189] = -1493529529;
        hf.ekjs[190] = -1237807215;
        hf.ekjs[191] = -148751365;
        hf.ekjs[192] = 1528486434;
        hf.ekjs[193] = -858137013;
        hf.ekjs[194] = -2115251481;
        hf.ekjs[195] = -2012392106;
        hf.ekjs[196] = -1715320622;
        hf.ekjs[197] = 1363137785;
        hf.ekjs[198] = 801987547;
        hf.ekjs[199] = -280430132;
    }

    private static /* synthetic */ int ekjy(int n2) {
        return ekjs[n2] ^ ekjt[n2];
    }

    private static /* synthetic */ void emeq() {
        hf.ekkq[0] = 4487892118464820651L;
        hf.ekkq[1] = 2830914833573595761L;
        hf.ekkq[2] = -3574703264957364369L;
        hf.ekkq[3] = 5222574846010382497L;
        hf.ekkq[4] = 5032660047976695105L;
        hf.ekkq[5] = 6853210706128639357L;
        hf.ekkq[6] = -6831252016416724321L;
        hf.ekkq[7] = -7208767429513847604L;
        hf.ekkq[8] = -5314992190364673746L;
        hf.ekkq[9] = -3879677609149288340L;
        hf.ekkq[10] = 1488332042799430229L;
        hf.ekkq[11] = -5224968034531538933L;
        hf.ekkq[12] = 1031337359971579941L;
        hf.ekkq[13] = -552514754969306305L;
        hf.ekkq[14] = -6501281489929785597L;
        hf.ekkq[15] = -9150967443301972156L;
        hf.ekkq[16] = 3574923398547818304L;
        hf.ekkq[17] = 2775577908589292326L;
        hf.ekkq[18] = -3615449925463120571L;
        hf.ekkq[19] = 6996806461000656311L;
        hf.ekkq[20] = 1971191272508401482L;
        hf.ekkq[21] = -2469834826295161549L;
        hf.ekkq[22] = -8962842672923731118L;
        hf.ekkq[23] = 712579641654331697L;
        hf.ekkq[24] = 3607360475858545830L;
        hf.ekkq[25] = 158403762089859214L;
        hf.ekkq[26] = -4314817392857477386L;
        hf.ekkq[27] = 6796426409152895142L;
        hf.ekkq[28] = -5671072844309261192L;
        hf.ekkq[29] = 6449546485548833206L;
        hf.ekkq[30] = -1299576397244366041L;
        hf.ekkq[31] = 4860238610119745655L;
        hf.ekkq[32] = -5495231417761057455L;
        hf.ekkq[33] = -125604541532464203L;
        hf.ekkq[34] = 7369265348708141599L;
        hf.ekkq[35] = 56621757739905210L;
        hf.ekkq[36] = 8972612467696055188L;
        hf.ekkq[37] = 8387058752941525202L;
        hf.ekkq[38] = 7540179253813928578L;
        hf.ekkq[39] = -8307837976763285667L;
        hf.ekkq[40] = 4059850621959315969L;
        hf.ekkq[41] = 6741372290289481017L;
        hf.ekkq[42] = -4795406991311031066L;
        hf.ekkq[43] = 7340649858193201973L;
        hf.ekkq[44] = 1702229917603953731L;
        hf.ekkq[45] = -6861110326707751121L;
        hf.ekkq[46] = -1825584730210879754L;
        hf.ekkq[47] = 6530118891314909065L;
        hf.ekkq[48] = -7972941092787285491L;
        hf.ekkq[49] = 1543794758958450256L;
        hf.ekkq[50] = -4861963730967080545L;
        hf.ekkq[51] = 2562547242249853090L;
        hf.ekkq[52] = -1908672095278356665L;
        hf.ekkq[53] = -5836969449515926590L;
        hf.ekkq[54] = 2501613730996851095L;
        hf.ekkq[55] = -6613391599402428237L;
        hf.ekkq[56] = 6271830296115477506L;
        hf.ekkq[57] = 5023410601250587303L;
        hf.ekkq[58] = 12618281285205106L;
        hf.ekkq[59] = 3617343353601477395L;
        hf.ekkq[60] = -3309077341922851555L;
        hf.ekkq[61] = 4208552598348186029L;
        hf.ekkq[62] = 4901384168814125761L;
        hf.ekkq[63] = -6805340710236898697L;
        hf.ekkq[64] = 2460261499486761895L;
        hf.ekkq[65] = 8804298724039747990L;
        hf.ekkq[66] = 3052176625807160740L;
        hf.ekkq[67] = -4573508348501431781L;
        hf.ekkq[68] = 8092244824870612184L;
        hf.ekkq[69] = 5528545458038802595L;
        hf.ekkq[70] = -1091710790259938706L;
        hf.ekkq[71] = -6767221889831802917L;
        hf.ekkq[72] = 3768798233518927543L;
        hf.ekkq[73] = -7643876139627597554L;
        hf.ekkq[74] = 6080841069959698395L;
        hf.ekkq[75] = -1069696583658870512L;
        hf.ekkq[76] = -51748500497794778L;
        hf.ekkq[77] = -4873182621407646412L;
        hf.ekkq[78] = 5368741637667225690L;
        hf.ekkq[79] = -199225059154775522L;
        hf.ekkq[80] = 9145520210602026754L;
        hf.ekkq[81] = -5459234651132451885L;
        hf.ekkq[82] = 6552948068410540798L;
        hf.ekkq[83] = 2605326482777523674L;
        hf.ekkq[84] = -4889115084876261685L;
        hf.ekkq[85] = 7682483384016724453L;
        hf.ekkq[86] = 6652033734519345695L;
        hf.ekkq[87] = 6964133626401685735L;
        hf.ekkq[88] = 2888418452892260662L;
        hf.ekkq[89] = -7248492536830657591L;
        hf.ekkq[90] = -4339773023170004334L;
        hf.ekkq[91] = -9025153121265321466L;
        hf.ekkq[92] = 1440292158840590713L;
        hf.ekkq[93] = -603992227093370559L;
        hf.ekkq[94] = 4151444796449843266L;
        hf.ekkq[95] = -5614059079648129373L;
        hf.ekkq[96] = 5829140497999971935L;
        hf.ekkq[97] = 6187903195392880980L;
        hf.ekkq[98] = 5494444777300643780L;
        hf.ekkq[99] = 254581522712469916L;
    }

    private static /* synthetic */ void emes() {
        hf.ekkq[200] = 1012895095333137191L;
        hf.ekkq[201] = 7314402273546675104L;
        hf.ekkq[202] = 2470005909404346455L;
        hf.ekkq[203] = 4821076615468756555L;
        hf.ekkq[204] = -1836930701181659136L;
        hf.ekkq[205] = -5350590006850792599L;
        hf.ekkq[206] = -8602005122815292397L;
        hf.ekkq[207] = -2976385827093791488L;
        hf.ekkq[208] = 1100068271043043199L;
        hf.ekkq[209] = -5643221883937984450L;
        hf.ekkq[210] = 2118658004255548068L;
        hf.ekkq[211] = 9027472744127868194L;
        hf.ekkq[212] = 1536148579899863493L;
        hf.ekkq[213] = 906925021038388222L;
        hf.ekkq[214] = -6227961047975607004L;
        hf.ekkq[215] = 8878032557453932982L;
        hf.ekkq[216] = 1214179544336321376L;
        hf.ekkq[217] = -4198781013401563825L;
        hf.ekkq[218] = 1964465526932048391L;
        hf.ekkq[219] = -6549535258663549737L;
        hf.ekkq[220] = 1784981543396096026L;
        hf.ekkq[221] = 4346282181600917053L;
        hf.ekkq[222] = -2255470031741513745L;
        hf.ekkq[223] = -764374237398972721L;
        hf.ekkq[224] = -79030263410945493L;
        hf.ekkq[225] = 3157276491562439739L;
        hf.ekkq[226] = -4518111175200399365L;
        hf.ekkq[227] = 7386589126332392089L;
        hf.ekkq[228] = -7692871950352636560L;
        hf.ekkq[229] = -1811921291578612513L;
        hf.ekkq[230] = 2475833659626889916L;
        hf.ekkq[231] = 8044915324074770014L;
        hf.ekkq[232] = -3965273756667247414L;
        hf.ekkq[233] = -2472368082501915519L;
        hf.ekkq[234] = 8677606651278823949L;
        hf.ekkq[235] = 1017177504199133159L;
        hf.ekkq[236] = -4124761626281171838L;
        hf.ekkq[237] = -5516547954739249981L;
        hf.ekkq[238] = -2182043632048904412L;
        hf.ekkq[239] = 7210984812802443713L;
        hf.ekkq[240] = -5222704234114849281L;
        hf.ekkq[241] = -2916010576581658239L;
        hf.ekkq[242] = -1142655462446851814L;
        hf.ekkq[243] = 4196355454658424354L;
        hf.ekkq[244] = 9091055622620032111L;
        hf.ekkq[245] = 514962055767001466L;
        hf.ekkq[246] = -3835717988571684964L;
        hf.ekkq[247] = -6610687869068233409L;
        hf.ekkq[248] = -641028245812203800L;
        hf.ekkq[249] = 5112063319625608173L;
        hf.ekkq[250] = -7966752336119606380L;
        hf.ekkq[251] = 3864136466013912428L;
        hf.ekkq[252] = 1372434906400782472L;
        hf.ekkq[253] = 5418171463061236336L;
        hf.ekkq[254] = 8210934112474980031L;
        hf.ekkq[255] = 6396338172751237249L;
        hf.ekkq[256] = 1500107986814910226L;
        hf.ekkq[257] = -5255487322266146264L;
        hf.ekkq[258] = 484573507256396512L;
        hf.ekkq[259] = -1286210914241589598L;
        hf.ekkq[260] = -8680472583393635595L;
        hf.ekkq[261] = 49901447796384221L;
        hf.ekkq[262] = 3440534963748523008L;
        hf.ekkq[263] = 4537811123670620759L;
        hf.ekkq[264] = 3060833585953235213L;
        hf.ekkq[265] = 6865418939122728774L;
        hf.ekkq[266] = 6070714447038901631L;
        hf.ekkq[267] = -1006248277695950441L;
        hf.ekkq[268] = 4367940777367850990L;
        hf.ekkq[269] = -6316197411894709611L;
        hf.ekkq[270] = -4606941384183118871L;
        hf.ekkq[271] = -553354788394641253L;
        hf.ekkq[272] = 9187192933566249229L;
        hf.ekkq[273] = 2829085685199691830L;
        hf.ekkq[274] = 531480190645081708L;
        hf.ekkq[275] = -28584989317637950L;
        hf.ekkq[276] = -3981348313624620584L;
        hf.ekkq[277] = -242041527759456428L;
        hf.ekkq[278] = -3629898263461693599L;
        hf.ekkq[279] = 4808660540246938586L;
        hf.ekkq[280] = 6302951546134127899L;
        hf.ekkq[281] = -5520444077125921663L;
        hf.ekkq[282] = -503791076030616746L;
        hf.ekkq[283] = 5202231715249516907L;
        hf.ekkq[284] = 9001304067256555015L;
        hf.ekkq[285] = 3487480399472971900L;
        hf.ekkq[286] = -343745922564204524L;
        hf.ekkq[287] = -1947720871012404865L;
        hf.ekkq[288] = -1546570874964457785L;
        hf.ekkq[289] = 6121653399640424765L;
        hf.ekkq[290] = -3671461994248098592L;
        hf.ekkq[291] = -7081539500742302968L;
        hf.ekkq[292] = -8425327568480610449L;
        hf.ekkq[293] = 2596905431524267262L;
        hf.ekkq[294] = 5779113266104634901L;
        hf.ekkq[295] = -109046013529973615L;
        hf.ekkq[296] = -1502628939589488409L;
        hf.ekkq[297] = -115234135214145643L;
        hf.ekkq[298] = -7612039000440507938L;
        hf.ekkq[299] = 5984521193333930792L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getPreviousSlot() {
        v0 /* !! */  = hf.ku;
        if (true) ** GOTO lbl5
        block12: while (true) {
            v0 /* !! */  = (long)(v1 - hf.ekju("emaq", ekko(int ), (int)360));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1694653687: {
                    v1 = hf.ekju("emaw", ekko(int ), (int)361);
                    continue block12;
                }
                case -1226246433: {
                    v1 = hf.ekju("emay", ekko(int ), (int)362);
                    continue block12;
                }
                case -500641767: {
                    v1 = hf.ekju("emaz", ekko(int ), (int)363);
                    continue block12;
                }
                case -273819947: {
                    break block12;
                }
            }
            break;
        }
        var3_1 = hf.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hf.ku - hf.ekju("emba", ekko(int ), (int)364)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hf.ekju("embb", ekjy(int ), (int)487)) break;
            v2 /* !! */  = (long)hf.ekju("embc", ekjy(int ), (int)488);
        }
        var2_2 /* !! */  = hf.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hf.ku - hf.ekju("embd", ekko(int ), (int)365)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hf.ekju("embf", ekjy(int ), (int)489)) break;
            v3 /* !! */  = (long)hf.ekju("embh", ekjy(int ), (int)490);
        }
        var1_3 = hf.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return (int)hf.ekju("embj", ekjy(int ), (int)491);
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = hf.ku - hf.ekju("embl", ekko(int ), (int)366)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hf.ekju("embn", ekjy(int ), (int)492)) break;
                    v4 /* !! */  = (long)hf.ekju("embp", ekjy(int ), (int)493);
                }
                return this.previousSlot;
            }
            case 0: {
                var2_2 /* !! */  = (int)hf.ekju("embq", ekjy(int ), (int)494);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)hf.ekju("embr", ekjy(int ), (int)495);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)hf.ekju("embs", ekjy(int ), (int)496);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hf.ekju("embt", ekjy(int ), (int)497);
        ** while (!var3_1)
lbl63:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long ekko(int n2) {
        return ekkp[n2] ^ ekkq[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean isEating() {
        v0 /* !! */  = hf.ku;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(v1 - hf.ekju("elzx", ekko(int ), (int)353));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1546791745: {
                    v1 = hf.ekju("elzz", ekko(int ), (int)354);
                    continue block15;
                }
                case -275781474: {
                    v1 = hf.ekju("emaa", ekko(int ), (int)355);
                    continue block15;
                }
                case -273819947: {
                    break block15;
                }
            }
            break;
        }
        var3_1 = hf.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = hf.ku - hf.ekju("emab", ekko(int ), (int)356)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hf.ekju("emac", ekjy(int ), (int)478)) break;
            v2 /* !! */  = (long)hf.ekju("emae", ekjy(int ), (int)479);
        }
        var2_2 /* !! */  = hf.b;
        v3 /* !! */  = hf.ku;
        block17: while (true) {
            switch ((int)v3 /* !! */ ) {
                case -1900032422: {
                    v3 /* !! */  = (long)(hf.ekju("emag", ekko(int ), (int)358) - hf.ekju("emaf", ekko(int ), (int)357));
                    continue block17;
                }
                case -273819947: {
                    break block17;
                }
            }
            break;
        }
        var1_3 = hf.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block18: while (true) {
            block26: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var3_1) {
                            throw null;
                        }
                        if (var1_3 != false) return (boolean)hf.ekju("emai", ekjy(int ), (int)480);
                        if (var1_3 != false) return (boolean)hf.ekju("emai", ekjy(int ), (int)480);
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_2 = hf.ku - hf.ekju("emaj", ekko(int ), (int)359)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v4 /* !! */  == hf.ekju("emak", ekjy(int ), (int)481)) {
                                return this.isEating;
                            }
                            v4 /* !! */  = (long)hf.ekju("emal", ekjy(int ), (int)482);
                        }
                    }
                    case 1: {
                        ** GOTO lbl51
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)hf.ekju("emap", ekjy(int ), (int)486);
                        if (var3_1) {
                            throw null;
                        }
lbl51:
                        // 3 sources

                        var2_2 /* !! */  = (int)hf.ekju("eman", ekjy(int ), (int)484);
                        cfr_temp_0 = 2;
                        if (var3_1) {
                            throw null;
                        }
                        break block26;
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)hf.ekju("emam", ekjy(int ), (int)483);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl65
            }
            do {
                if (true) continue block18;
lbl65:
                // 2 sources

                var2_2 /* !! */  = (int)hf.ekju("emao", ekjy(int ), (int)485);
                cfr_temp_0 = 0;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    static {
        ekjs = new int[498];
        ekjt = new int[498];
        hf.emca();
        hf.emcn();
        hf.emcx();
        hf.emdf();
        hf.emdr();
        hf.emdt();
        hf.emef();
        hf.emej();
        hf.emek();
        hf.emel();
        ekkp = new long[367];
        ekkq = new long[367];
        hf.emem();
        hf.emen();
        hf.emeo();
        hf.emep();
        hf.emeq();
        hf.emer();
        hf.emes();
        hf.emet();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hf.ku - hf.ekju("ekln", ekko(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hf.ekju("eklo", ekjy(int ), (int)30)) break;
            v0 /* !! */  = (long)hf.ekju("eklp", ekjy(int ), (int)31);
        }
        var3_1 = hf.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hf.ku - hf.ekju("eklq", ekko(int ), (int)11)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == hf.ekju("eklr", ekjy(int ), (int)32)) break;
            v1 /* !! */  = (long)hf.ekju("ekls", ekjy(int ), (int)33);
        }
        var2_2 /* !! */  = hf.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = hf.ku - hf.ekju("eklt", ekko(int ), (int)12)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == hf.ekju("eklu", ekjy(int ), (int)34)) break;
                    v2 /* !! */  = (long)hf.ekju("eklv", ekjy(int ), (int)35);
                }
                var1_3 = hf.a;
                if (var3_1) {
                    throw null;
lbl24:
                    // 2 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl24
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = hf.ku - hf.ekju("eklw", ekko(int ), (int)13)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == hf.ekju("eklx", ekjy(int ), (int)36)) break;
                    v3 /* !! */  = (long)hf.ekju("ekly", ekjy(int ), (int)37);
                }
                this.stopEating();
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl35:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)hf.ekju("eklz", ekjy(int ), (int)38);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl53
            }
lbl40:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hf.ekju("ekma", ekjy(int ), (int)39);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hf.ekju("ekmb", ekjy(int ), (int)40);
                    if (!var3_1) ** GOTO lbl35
                    throw null;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)hf.ekju("ekmc", ekjy(int ), (int)41);
                if (!var3_1) ** GOTO lbl40
                throw null;
            }
lbl53:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)hf.ekju("ekmd", ekjy(int ), (int)42);
                if (!var3_1) ** GOTO lbl35
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)hf.ekju("ekme", ekjy(int ), (int)43);
        ** while (!var3_1)
lbl60:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void emel() {
        hf.ekjt[400] = -1605724341;
        hf.ekjt[401] = -1594079627;
        hf.ekjt[402] = 1768096927;
        hf.ekjt[403] = -1553459556;
        hf.ekjt[404] = 1364200515;
        hf.ekjt[405] = -915490473;
        hf.ekjt[406] = 329824269;
        hf.ekjt[407] = 1809511331;
        hf.ekjt[408] = -1607490993;
        hf.ekjt[409] = -1591291984;
        hf.ekjt[410] = -895495894;
        hf.ekjt[411] = -738913875;
        hf.ekjt[412] = 384327608;
        hf.ekjt[413] = 1663751520;
        hf.ekjt[414] = -1908631049;
        hf.ekjt[415] = -1713502865;
        hf.ekjt[416] = -1904817607;
        hf.ekjt[417] = 1405380633;
        hf.ekjt[418] = 1227278854;
        hf.ekjt[419] = 2129122372;
        hf.ekjt[420] = -2002217015;
        hf.ekjt[421] = 1041991083;
        hf.ekjt[422] = 1715436093;
        hf.ekjt[423] = 1576780683;
        hf.ekjt[424] = 1162779953;
        hf.ekjt[425] = -1848811444;
        hf.ekjt[426] = 1519087535;
        hf.ekjt[427] = -119956;
        hf.ekjt[428] = -733763082;
        hf.ekjt[429] = -736221378;
        hf.ekjt[430] = 162253529;
        hf.ekjt[431] = 880773734;
        hf.ekjt[432] = 990655852;
        hf.ekjt[433] = 1461593287;
        hf.ekjt[434] = -1137056467;
        hf.ekjt[435] = -1439889007;
        hf.ekjt[436] = 148389626;
        hf.ekjt[437] = -714843219;
        hf.ekjt[438] = -1681070512;
        hf.ekjt[439] = 1933738954;
        hf.ekjt[440] = -784138567;
        hf.ekjt[441] = -324816861;
        hf.ekjt[442] = 1234909800;
        hf.ekjt[443] = 620699254;
        hf.ekjt[444] = 39834178;
        hf.ekjt[445] = -672535871;
        hf.ekjt[446] = 1200097213;
        hf.ekjt[447] = 1412239575;
        hf.ekjt[448] = 690275498;
        hf.ekjt[449] = -442845981;
        hf.ekjt[450] = 468653946;
        hf.ekjt[451] = 1955854434;
        hf.ekjt[452] = -1068137513;
        hf.ekjt[453] = -502791733;
        hf.ekjt[454] = -590262203;
        hf.ekjt[455] = -291140592;
        hf.ekjt[456] = 1003461001;
        hf.ekjt[457] = -1042419721;
        hf.ekjt[458] = -451703154;
        hf.ekjt[459] = 718472317;
        hf.ekjt[460] = 689796789;
        hf.ekjt[461] = -1577952515;
        hf.ekjt[462] = 481418422;
        hf.ekjt[463] = 1779408799;
        hf.ekjt[464] = -457827675;
        hf.ekjt[465] = -2062639842;
        hf.ekjt[466] = 1299638438;
        hf.ekjt[467] = 279472378;
        hf.ekjt[468] = 1076719415;
        hf.ekjt[469] = -1870138505;
        hf.ekjt[470] = -1825352134;
        hf.ekjt[471] = 983385979;
        hf.ekjt[472] = 1092652537;
        hf.ekjt[473] = 1912009946;
        hf.ekjt[474] = -1061395094;
        hf.ekjt[475] = 1874657587;
        hf.ekjt[476] = 234521494;
        hf.ekjt[477] = -816777806;
        hf.ekjt[478] = -361032568;
        hf.ekjt[479] = 662288606;
        hf.ekjt[480] = 1082934593;
        hf.ekjt[481] = -117878446;
        hf.ekjt[482] = -697448599;
        hf.ekjt[483] = -212269575;
        hf.ekjt[484] = 1450842908;
        hf.ekjt[485] = -745504742;
        hf.ekjt[486] = -933556318;
        hf.ekjt[487] = 174740916;
        hf.ekjt[488] = -330493341;
        hf.ekjt[489] = 358498999;
        hf.ekjt[490] = 669770095;
        hf.ekjt[491] = 187352401;
        hf.ekjt[492] = 559552716;
        hf.ekjt[493] = 1336888338;
        hf.ekjt[494] = -1932916690;
        hf.ekjt[495] = 931916441;
        hf.ekjt[496] = 1925380376;
        hf.ekjt[497] = -1275203141;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block62: {
            block61: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = hf.ku - hf.ekju("ekmf", ekko(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  == hf.ekju("ekmg", ekjy(int ), (int)44)) break;
                    v0 /* !! */  = (long)hf.ekju("ekmh", ekjy(int ), (int)45);
                }
                var4_2 = hf.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = hf.ku - hf.ekju("ekmi", ekko(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v1 /* !! */  == hf.ekju("ekmj", ekjy(int ), (int)46)) break;
                    v1 /* !! */  = (long)hf.ekju("ekmk", ekjy(int ), (int)47);
                }
                var3_3 /* !! */  = hf.b;
                v2 /* !! */  = hf.ku;
                if (true) ** GOTO lbl19
                block35: while (true) {
                    v2 /* !! */  = (long)(v3 - hf.ekju("ekml", ekko(int ), (int)16));
lbl19:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1451786068: {
                            v3 = hf.ekju("ekmm", ekko(int ), (int)17);
                            continue block35;
                        }
                        case -273819947: {
                            break block35;
                        }
                        case 895561051: {
                            v3 = hf.ekju("ekmn", ekko(int ), (int)18);
                            continue block35;
                        }
                        case 1143482788: {
                            v3 = hf.ekju("ekmo", ekko(int ), (int)19);
                            continue block35;
                        }
                    }
                    break;
                }
                var2_4 = hf.a;
                if (var4_2) {
                    throw null;
lbl34:
                    // 6 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl34
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = hf.ku - hf.ekju("ekmp", ekko(int ), (int)20)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hf.ekju("ekmq", ekjy(int ), (int)48)) break;
                    v4 /* !! */  = (long)hf.ekju("ekmr", ekjy(int ), (int)49);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = hf.ku - hf.ekju("ekms", ekko(int ), (int)21)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hf.ekju("ekmt", ekjy(int ), (int)50)) break;
                    v5 /* !! */  = (long)hf.ekju("ekmu", ekjy(int ), (int)51);
                }
                if (hf.mc.field_1724 == null) break block61;
                if (var2_4) ** GOTO lbl34
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = hf.ku - hf.ekju("ekmv", ekko(int ), (int)22)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == hf.ekju("ekmw", ekjy(int ), (int)52)) break;
                    v6 /* !! */  = (long)hf.ekju("ekmx", ekjy(int ), (int)53);
                }
                v7 /* !! */  = hf.ku;
                if (true) ** GOTO lbl61
                block40: while (true) {
                    v7 /* !! */  = (long)(v8 - hf.ekju("ekmy", ekko(int ), (int)23));
lbl61:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -841158989: {
                            v8 = hf.ekju("ekmz", ekko(int ), (int)24);
                            continue block40;
                        }
                        case -638096072: {
                            v8 = hf.ekju("ekna", ekko(int ), (int)25);
                            continue block40;
                        }
                        case -273819947: {
                            break block40;
                        }
                        case 1999288901: {
                            v8 = hf.ekju("eknb", ekko(int ), (int)26);
                            continue block40;
                        }
                    }
                    break;
                }
                if (hf.mc.field_1687 != null) break block62;
                if (var2_4) ** GOTO lbl34
            }
            if (var2_4 || var2_4) ** GOTO lbl34
            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl34
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v9 /* !! */  = hf.ku;
                if (true) ** GOTO lbl87
                block41: while (true) {
                    v9 /* !! */  = (long)(v10 - hf.ekju("eknc", ekko(int ), (int)27));
lbl87:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -856350595: {
                            v10 = hf.ekju("eknd", ekko(int ), (int)28);
                            continue block41;
                        }
                        case -409608455: {
                            v10 = hf.ekju("ekne", ekko(int ), (int)29);
                            continue block41;
                        }
                        case -273819947: {
                            break block41;
                        }
                        case 2096704037: {
                            v10 = hf.ekju("eknf", ekko(int ), (int)30);
                            continue block41;
                        }
                    }
                    break;
                }
                this.handleEating();
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)hf.ekju("ekng", ekjy(int ), (int)54);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)hf.ekju("eknh", ekjy(int ), (int)55);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl112:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)hf.ekju("ekni", ekjy(int ), (int)56);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl117:
            // 3 sources

            case 3: {
                var3_3 /* !! */  = (int)hf.ekju("eknj", ekjy(int ), (int)57);
                if (!var4_2) ** GOTO lbl112
                throw null;
            }
lbl121:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)hf.ekju("eknk", ekjy(int ), (int)58);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hf.ekju("eknl", ekjy(int ), (int)59);
                    if (!var4_2) ** GOTO lbl117
                    throw null;
                }
            }
lbl131:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)hf.ekju("eknm", ekjy(int ), (int)60);
                if (!var4_2) ** GOTO lbl121
                throw null;
            }
lbl135:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)hf.ekju("eknn", ekjy(int ), (int)61);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 8: {
                do {
                    var3_3 /* !! */  = (int)hf.ekju("ekno", ekjy(int ), (int)62);
                } while (!var4_2);
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)hf.ekju("eknp", ekjy(int ), (int)63);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl150:
            // 4 sources

            case 10: {
                var3_3 /* !! */  = (int)hf.ekju("eknq", ekjy(int ), (int)64);
                if (!var4_2) ** GOTO lbl135
                throw null;
            }
lbl154:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)hf.ekju("eknr", ekjy(int ), (int)65);
                if (!var4_2) ** GOTO lbl150
                throw null;
            }
            case 12: 
        }
        var3_3 /* !! */  = (int)hf.ekju("ekns", ekjy(int ), (int)66);
        ** while (!var4_2)
lbl161:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void emdt() {
        hf.ekjt[0] = -1682990936;
        hf.ekjt[1] = 1063260029;
        hf.ekjt[2] = 1229159907;
        hf.ekjt[3] = -1036444342;
        hf.ekjt[4] = -662989813;
        hf.ekjt[5] = 1104830022;
        hf.ekjt[6] = -530921612;
        hf.ekjt[7] = 637871173;
        hf.ekjt[8] = -1581841085;
        hf.ekjt[9] = -713276909;
        hf.ekjt[10] = 838413858;
        hf.ekjt[11] = -1384938567;
        hf.ekjt[12] = -1776369611;
        hf.ekjt[13] = 567736777;
        hf.ekjt[14] = -1799877872;
        hf.ekjt[15] = 1035306687;
        hf.ekjt[16] = -1195429442;
        hf.ekjt[17] = -216607248;
        hf.ekjt[18] = 1000024029;
        hf.ekjt[19] = 1789893873;
        hf.ekjt[20] = -854732324;
        hf.ekjt[21] = 1005209543;
        hf.ekjt[22] = -1278202291;
        hf.ekjt[23] = -1512844006;
        hf.ekjt[24] = -45482105;
        hf.ekjt[25] = -577440749;
        hf.ekjt[26] = -1669130222;
        hf.ekjt[27] = 91339435;
        hf.ekjt[28] = -584066136;
        hf.ekjt[29] = 1895754731;
        hf.ekjt[30] = 217233059;
        hf.ekjt[31] = -427957266;
        hf.ekjt[32] = 1111945567;
        hf.ekjt[33] = -673794240;
        hf.ekjt[34] = 814349337;
        hf.ekjt[35] = 329736146;
        hf.ekjt[36] = 594210421;
        hf.ekjt[37] = 2051124966;
        hf.ekjt[38] = -952047251;
        hf.ekjt[39] = -1867615136;
        hf.ekjt[40] = 1140591830;
        hf.ekjt[41] = -447051310;
        hf.ekjt[42] = 1378677627;
        hf.ekjt[43] = 1244712286;
        hf.ekjt[44] = -1567634086;
        hf.ekjt[45] = 1451912577;
        hf.ekjt[46] = 1765162563;
        hf.ekjt[47] = 170423911;
        hf.ekjt[48] = -1687627510;
        hf.ekjt[49] = 1298906769;
        hf.ekjt[50] = 459669546;
        hf.ekjt[51] = -522466668;
        hf.ekjt[52] = 1643604974;
        hf.ekjt[53] = 1169789736;
        hf.ekjt[54] = 1404953316;
        hf.ekjt[55] = 1271829694;
        hf.ekjt[56] = -212886416;
        hf.ekjt[57] = 640877564;
        hf.ekjt[58] = 15141120;
        hf.ekjt[59] = 211389319;
        hf.ekjt[60] = -803454891;
        hf.ekjt[61] = -2092192624;
        hf.ekjt[62] = 348465377;
        hf.ekjt[63] = -1410063129;
        hf.ekjt[64] = 129759676;
        hf.ekjt[65] = -335577340;
        hf.ekjt[66] = -840308897;
        hf.ekjt[67] = 169530217;
        hf.ekjt[68] = 1722666744;
        hf.ekjt[69] = 1474097720;
        hf.ekjt[70] = -1332544222;
        hf.ekjt[71] = -1933211216;
        hf.ekjt[72] = -982033571;
        hf.ekjt[73] = -819749094;
        hf.ekjt[74] = -303880064;
        hf.ekjt[75] = -1973760069;
        hf.ekjt[76] = -1944625692;
        hf.ekjt[77] = 1708772565;
        hf.ekjt[78] = -1940679617;
        hf.ekjt[79] = -1268267817;
        hf.ekjt[80] = 1446002878;
        hf.ekjt[81] = -193307374;
        hf.ekjt[82] = 1087817058;
        hf.ekjt[83] = 412328903;
        hf.ekjt[84] = 915398164;
        hf.ekjt[85] = 909108952;
        hf.ekjt[86] = -1325469311;
        hf.ekjt[87] = 1110792692;
        hf.ekjt[88] = 1760461674;
        hf.ekjt[89] = -1273433413;
        hf.ekjt[90] = -1085384708;
        hf.ekjt[91] = 785523205;
        hf.ekjt[92] = -228760519;
        hf.ekjt[93] = -1062565459;
        hf.ekjt[94] = -810722643;
        hf.ekjt[95] = -1568300904;
        hf.ekjt[96] = 2137172233;
        hf.ekjt[97] = -1257835835;
        hf.ekjt[98] = -1131978147;
        hf.ekjt[99] = -1384160851;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean shouldContinueEating() {
        block86: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hf.ku - hf.ekju("ekvf", ekko(int ), (int)107)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == hf.ekju("ekvg", ekjy(int ), (int)185)) break;
                v0 /* !! */  = (long)hf.ekju("ekvh", ekjy(int ), (int)186);
            }
            var4_1 = hf.c;
            v1 /* !! */  = hf.ku;
            if (true) ** GOTO lbl11
            block56: while (true) {
                v1 /* !! */  = (long)(v2 - hf.ekju("ekvi", ekko(int ), (int)108));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1838297071: {
                        v2 = hf.ekju("ekvj", ekko(int ), (int)109);
                        continue block56;
                    }
                    case -273819947: {
                        break block56;
                    }
                    case 1322777406: {
                        v2 = hf.ekju("ekvk", ekko(int ), (int)110);
                        continue block56;
                    }
                    case 1411822536: {
                        v2 = hf.ekju("ekvl", ekko(int ), (int)111);
                        continue block56;
                    }
                }
                break;
            }
            var3_2 /* !! */  = hf.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = hf.ku - hf.ekju("ekvm", ekko(int ), (int)112)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == hf.ekju("ekvn", ekjy(int ), (int)187)) break;
                v3 /* !! */  = (long)hf.ekju("ekvo", ekjy(int ), (int)188);
            }
            var2_3 = hf.a;
            if (var4_1) {
                throw null;
lbl32:
                // 8 sources

                return (boolean)hf.ekju("ekvp", ekjy(int ), (int)189);
            }
            if (var2_3 || var2_3) ** GOTO lbl32
            v4 /* !! */  = hf.ku;
            if (true) ** GOTO lbl39
            block59: while (true) {
                v4 /* !! */  = (long)(v5 - hf.ekju("ekvq", ekko(int ), (int)113));
lbl39:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -273819947: {
                        break block59;
                    }
                    case -228010610: {
                        v5 = hf.ekju("ekvr", ekko(int ), (int)114);
                        continue block59;
                    }
                    case 1942302962: {
                        v5 = hf.ekju("ekvs", ekko(int ), (int)115);
                        continue block59;
                    }
                }
                break;
            }
            v6 /* !! */  = hf.ku;
            if (true) ** GOTO lbl52
            block60: while (true) {
                v6 /* !! */  = (long)(hf.ekju("ekvu", ekko(int ), (int)117) - hf.ekju("ekvt", ekko(int ), (int)116));
lbl52:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -273819947: {
                        break block60;
                    }
                    case -62200014: {
                        continue block60;
                    }
                }
                break;
            }
            v7 = hf.mc.field_1724;
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_2 = hf.ku - hf.ekju("ekvv", ekko(int ), (int)118)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == hf.ekju("ekvw", ekjy(int ), (int)190)) break;
                v8 /* !! */  = (long)hf.ekju("ekvx", ekjy(int ), (int)191);
            }
            if (!v7.method_29504()) break block86;
            if (var2_3) ** GOTO lbl32
            return (boolean)hf.ekju("ekvy", ekjy(int ), (int)192);
        }
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3 || var2_3) ** GOTO lbl32
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = hf.ku - hf.ekju("ekvz", ekko(int ), (int)119)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == hf.ekju("ekwa", ekjy(int ), (int)193)) break;
                    v9 /* !! */  = (long)hf.ekju("ekwb", ekjy(int ), (int)194);
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = hf.ku - hf.ekju("ekwc", ekko(int ), (int)120)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == hf.ekju("ekwd", ekjy(int ), (int)195)) break;
                    v10 /* !! */  = (long)hf.ekju("ekwe", ekjy(int ), (int)196);
                }
                v11 = hf.mc.field_1724;
                v12 /* !! */  = hf.ku;
                if (true) ** GOTO lbl86
                block64: while (true) {
                    v12 /* !! */  = (long)(v13 - hf.ekju("ekwf", ekko(int ), (int)121));
lbl86:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -2096638309: {
                            v13 = hf.ekju("ekwg", ekko(int ), (int)122);
                            continue block64;
                        }
                        case -1132254718: {
                            v13 = hf.ekju("ekwh", ekko(int ), (int)123);
                            continue block64;
                        }
                        case -273819947: {
                            break block64;
                        }
                        case 35348485: {
                            v13 = hf.ekju("ekwi", ekko(int ), (int)124);
                            continue block64;
                        }
                    }
                    break;
                }
                if (v11.method_6115()) ** GOTO lbl101
                if (var2_3) ** GOTO lbl32
                return (boolean)hf.ekju("ekwj", ekjy(int ), (int)197);
lbl101:
                // 1 sources

                if (var2_3 || var2_3) ** GOTO lbl32
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_5 = hf.ku - hf.ekju("ekwk", ekko(int ), (int)125)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == hf.ekju("ekwl", ekjy(int ), (int)198)) break;
                    v14 /* !! */  = (long)hf.ekju("ekwm", ekjy(int ), (int)199);
                }
                v15 /* !! */  = hf.ku;
                if (true) ** GOTO lbl111
                block66: while (true) {
                    v15 /* !! */  = (long)(hf.ekju("ekwo", ekko(int ), (int)127) - hf.ekju("ekwn", ekko(int ), (int)126));
lbl111:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1748200663: {
                            continue block66;
                        }
                        case -273819947: {
                            break block66;
                        }
                    }
                    break;
                }
                v16 = hf.mc.field_1724;
                v17 /* !! */  = hf.ku;
                if (true) ** GOTO lbl121
                block67: while (true) {
                    v17 /* !! */  = (long)(v18 - hf.ekju("ekwp", ekko(int ), (int)128));
lbl121:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1716445779: {
                            v18 = hf.ekju("ekwq", ekko(int ), (int)129);
                            continue block67;
                        }
                        case -273819947: {
                            break block67;
                        }
                        case 1179669638: {
                            v18 = hf.ekju("ekwr", ekko(int ), (int)130);
                            continue block67;
                        }
                        case 1259496045: {
                            v18 = hf.ekju("ekws", ekko(int ), (int)131);
                            continue block67;
                        }
                    }
                    break;
                }
                var1_4 = v16.method_6030();
                if (var2_3 || var2_3) ** GOTO lbl32
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_6 = hf.ku - hf.ekju("ekwt", ekko(int ), (int)132)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == hf.ekju("ekwu", ekjy(int ), (int)200)) break;
                    v19 /* !! */  = (long)hf.ekju("ekwv", ekjy(int ), (int)201);
                }
                v20 = var1_4.method_7909();
                v21 /* !! */  = hf.ku;
                if (true) ** GOTO lbl145
                block69: while (true) {
                    v21 /* !! */  = (long)(v22 - hf.ekju("ekww", ekko(int ), (int)133));
lbl145:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1974940119: {
                            v22 = hf.ekju("ekwx", ekko(int ), (int)134);
                            continue block69;
                        }
                        case -273819947: {
                            break block69;
                        }
                        case 1083817219: {
                            v22 = hf.ekju("ekwy", ekko(int ), (int)135);
                            continue block69;
                        }
                    }
                    break;
                }
                if (v20 != class_1802.field_8463) ** GOTO lbl160
                if (var2_3) ** GOTO lbl32
                v23 = hf.ekju("ekwz", ekjy(int ), (int)202);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl163
lbl160:
                // 1 sources

                if (!var2_3 && !var2_3) ** break;
                ** continue;
                v23 = hf.ekju("ekxa", ekjy(int ), (int)203);
lbl163:
                // 2 sources

                return (boolean)v23;
            }
            case 0: {
                var3_2 /* !! */  = (int)hf.ekju("ekxb", ekjy(int ), (int)204);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl169:
            // 3 sources

            case 1: {
                var3_2 /* !! */  = (int)hf.ekju("ekxc", ekjy(int ), (int)205);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl174:
            // 3 sources

            case 2: {
                var3_2 /* !! */  = (int)hf.ekju("ekxd", ekjy(int ), (int)206);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl179:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)hf.ekju("ekxe", ekjy(int ), (int)207);
                if (!var4_1) ** GOTO lbl169
                throw null;
            }
            case 4: {
                var3_2 /* !! */  = (int)hf.ekju("ekxf", ekjy(int ), (int)208);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl188:
            // 3 sources

            case 5: {
                var3_2 /* !! */  = (int)hf.ekju("ekxg", ekjy(int ), (int)209);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 6: {
                var3_2 /* !! */  = (int)hf.ekju("ekxh", ekjy(int ), (int)210);
                if (var4_1) {
                    throw null;
                }
            }
lbl197:
            // 4 sources

            case 7: {
                var3_2 /* !! */  = (int)hf.ekju("ekxi", ekjy(int ), (int)211);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl202:
            // 4 sources

            case 8: {
                var3_2 /* !! */  = (int)hf.ekju("ekxj", ekjy(int ), (int)212);
                if (!var4_1) ** GOTO lbl169
                throw null;
            }
lbl206:
            // 2 sources

            case 9: {
                var3_2 /* !! */  = (int)hf.ekju("ekxk", ekjy(int ), (int)213);
                if (!var4_1) ** GOTO lbl197
                throw null;
            }
lbl210:
            // 2 sources

            case 10: {
                var3_2 /* !! */  = (int)hf.ekju("ekxl", ekjy(int ), (int)214);
                if (!var4_1) ** GOTO lbl188
                throw null;
            }
lbl214:
            // 2 sources

            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)hf.ekju("ekxm", ekjy(int ), (int)215);
                    if (!var4_1) ** GOTO lbl174
                    throw null;
                }
            }
            case 12: {
                var3_2 /* !! */  = (int)hf.ekju("ekxn", ekjy(int ), (int)216);
                if (!var4_1) ** GOTO lbl188
                throw null;
            }
            case 13: {
                var3_2 /* !! */  = (int)hf.ekju("ekxo", ekjy(int ), (int)217);
                if (!var4_1) ** GOTO lbl210
                throw null;
            }
lbl227:
            // 2 sources

            case 14: {
                var3_2 /* !! */  = (int)hf.ekju("ekxp", ekjy(int ), (int)218);
                if (!var4_1) ** GOTO lbl174
                throw null;
            }
            case 15: {
                var3_2 /* !! */  = (int)hf.ekju("ekxq", ekjy(int ), (int)219);
                if (!var4_1) ** GOTO lbl202
                throw null;
            }
            case 16: 
        }
        var3_2 /* !! */  = (int)hf.ekju("ekxr", ekjy(int ), (int)220);
        ** while (!var4_1)
lbl238:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void emdf() {
        hf.ekjs[300] = -574735469;
        hf.ekjs[301] = 442140184;
        hf.ekjs[302] = 2019919543;
        hf.ekjs[303] = -1362462508;
        hf.ekjs[304] = -1347181489;
        hf.ekjs[305] = -110020350;
        hf.ekjs[306] = -471021869;
        hf.ekjs[307] = -1882361330;
        hf.ekjs[308] = 2127966670;
        hf.ekjs[309] = 1356800754;
        hf.ekjs[310] = 795210697;
        hf.ekjs[311] = -732521086;
        hf.ekjs[312] = -1530931017;
        hf.ekjs[313] = -2107303723;
        hf.ekjs[314] = -1771334453;
        hf.ekjs[315] = 40294185;
        hf.ekjs[316] = -715634331;
        hf.ekjs[317] = 90224299;
        hf.ekjs[318] = -142685624;
        hf.ekjs[319] = 1513038106;
        hf.ekjs[320] = 1741394361;
        hf.ekjs[321] = 2106509223;
        hf.ekjs[322] = -1969857797;
        hf.ekjs[323] = -1509631456;
        hf.ekjs[324] = -1695045145;
        hf.ekjs[325] = 1996688914;
        hf.ekjs[326] = 929616724;
        hf.ekjs[327] = -1288072152;
        hf.ekjs[328] = 220600844;
        hf.ekjs[329] = 764304111;
        hf.ekjs[330] = -735681614;
        hf.ekjs[331] = 1207715534;
        hf.ekjs[332] = -1543113702;
        hf.ekjs[333] = 1176829833;
        hf.ekjs[334] = 1050249038;
        hf.ekjs[335] = 1183143548;
        hf.ekjs[336] = 746286628;
        hf.ekjs[337] = -625828075;
        hf.ekjs[338] = 1595132300;
        hf.ekjs[339] = 1611629608;
        hf.ekjs[340] = -2043470827;
        hf.ekjs[341] = -406060522;
        hf.ekjs[342] = -1544021809;
        hf.ekjs[343] = 792199173;
        hf.ekjs[344] = 418005131;
        hf.ekjs[345] = 1090692012;
        hf.ekjs[346] = -527343421;
        hf.ekjs[347] = -239740770;
        hf.ekjs[348] = 1112707543;
        hf.ekjs[349] = 409553460;
        hf.ekjs[350] = -1600943217;
        hf.ekjs[351] = -26832759;
        hf.ekjs[352] = -120370054;
        hf.ekjs[353] = 545188480;
        hf.ekjs[354] = 107217545;
        hf.ekjs[355] = -1000472801;
        hf.ekjs[356] = -1310610802;
        hf.ekjs[357] = 892536631;
        hf.ekjs[358] = -2018500793;
        hf.ekjs[359] = -499047530;
        hf.ekjs[360] = -2001712750;
        hf.ekjs[361] = -1178773122;
        hf.ekjs[362] = -1117066159;
        hf.ekjs[363] = -869996782;
        hf.ekjs[364] = -2014249960;
        hf.ekjs[365] = 2096313716;
        hf.ekjs[366] = 681503758;
        hf.ekjs[367] = -308473663;
        hf.ekjs[368] = 1010137458;
        hf.ekjs[369] = 713096882;
        hf.ekjs[370] = 1787588099;
        hf.ekjs[371] = -53530578;
        hf.ekjs[372] = 1936290180;
        hf.ekjs[373] = 75602754;
        hf.ekjs[374] = -1343176970;
        hf.ekjs[375] = 265675383;
        hf.ekjs[376] = 1544046808;
        hf.ekjs[377] = -75983785;
        hf.ekjs[378] = 1331155080;
        hf.ekjs[379] = 339002422;
        hf.ekjs[380] = -822017913;
        hf.ekjs[381] = 1708041108;
        hf.ekjs[382] = 366545889;
        hf.ekjs[383] = 1474863605;
        hf.ekjs[384] = 954483538;
        hf.ekjs[385] = 761043417;
        hf.ekjs[386] = -2047309639;
        hf.ekjs[387] = 285997308;
        hf.ekjs[388] = -1861333598;
        hf.ekjs[389] = -142702939;
        hf.ekjs[390] = 515947947;
        hf.ekjs[391] = 1124792255;
        hf.ekjs[392] = -1922220241;
        hf.ekjs[393] = 219019113;
        hf.ekjs[394] = 1336323645;
        hf.ekjs[395] = -24645427;
        hf.ekjs[396] = 573956511;
        hf.ekjs[397] = -147775428;
        hf.ekjs[398] = -509187914;
        hf.ekjs[399] = -1976189541;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kb getGoldenHearts() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hf.ku - hf.ekju("elyc", ekko(int ), (int)336)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hf.ekju("elyd", ekjy(int ), (int)462)) break;
            v0 /* !! */  = (long)hf.ekju("elye", ekjy(int ), (int)463);
        }
        var3_1 = hf.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hf.ku - hf.ekju("elyf", ekko(int ), (int)337)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hf.ekju("elyg", ekjy(int ), (int)464)) break;
            v1 /* !! */  = (long)hf.ekju("elyi", ekjy(int ), (int)465);
        }
        var2_2 /* !! */  = hf.b;
        v2 /* !! */  = hf.ku;
        if (true) ** GOTO lbl19
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - hf.ekju("elyj", ekko(int ), (int)338));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -737239979: {
                    v3 = hf.ekju("elyl", ekko(int ), (int)339);
                    continue block18;
                }
                case -273819947: {
                    break block18;
                }
                case 1181182105: {
                    v3 = hf.ekju("elym", ekko(int ), (int)340);
                    continue block18;
                }
                case 2026343693: {
                    v3 = hf.ekju("elyn", ekko(int ), (int)341);
                    continue block18;
                }
            }
            break;
        }
        var1_3 = hf.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = hf.ku;
                if (true) ** GOTO lbl44
                block20: while (true) {
                    v4 /* !! */  = (long)(hf.ekju("elyr", ekko(int ), (int)343) - hf.ekju("elyp", ekko(int ), (int)342));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -273819947: {
                            break block20;
                        }
                        case 887652462: {
                            continue block20;
                        }
                    }
                    break;
                }
                return this.goldenHearts;
            }
            case 0: {
                var2_2 /* !! */  = (int)hf.ekju("elyu", ekjy(int ), (int)466);
                if (!var3_1) break;
                throw null;
            }
lbl54:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hf.ekju("elyv", ekjy(int ), (int)467);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hf.ekju("elyx", ekjy(int ), (int)468);
                    if (!var3_1) ** GOTO lbl54
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hf.ekju("elyy", ekjy(int ), (int)469);
        ** while (!var3_1)
lbl66:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float getEffectiveHealth() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hf.ku - hf.ekju("ekxs", ekko(int ), (int)136)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hf.ekju("ekxt", ekjy(int ), (int)221)) break;
            v0 /* !! */  = (long)hf.ekju("ekxu", ekjy(int ), (int)222);
        }
        var4_1 = hf.c;
        v1 /* !! */  = hf.ku;
        if (true) ** GOTO lbl11
        block50: while (true) {
            v1 /* !! */  = (long)(v2 - hf.ekju("ekxv", ekko(int ), (int)137));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1452256788: {
                    v2 = hf.ekju("ekxw", ekko(int ), (int)138);
                    continue block50;
                }
                case -557752701: {
                    v2 = hf.ekju("ekxx", ekko(int ), (int)139);
                    continue block50;
                }
                case -273819947: {
                    break block50;
                }
                case 1117448393: {
                    v2 = hf.ekju("ekxy", ekko(int ), (int)140);
                    continue block50;
                }
            }
            break;
        }
        var3_2 /* !! */  = hf.b;
        v3 /* !! */  = hf.ku;
        if (true) ** GOTO lbl28
        block51: while (true) {
            v3 /* !! */  = (long)(v4 - hf.ekju("ekxz", ekko(int ), (int)141));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -273819947: {
                    break block51;
                }
                case 804759316: {
                    v4 = hf.ekju("ekya", ekko(int ), (int)142);
                    continue block51;
                }
                case 1200395869: {
                    v4 = hf.ekju("ekyb", ekko(int ), (int)143);
                    continue block51;
                }
            }
            break;
        }
        var2_3 = hf.a;
        if (var4_1) {
            throw null;
lbl40:
            // 5 sources

            return (float)hf.ekju("ekyc", ekjr(int ), (int)223);
        }
        if (var2_3 || var2_3) ** GOTO lbl40
        v5 /* !! */  = hf.ku;
        if (true) ** GOTO lbl47
        block53: while (true) {
            v5 /* !! */  = (long)(v6 - hf.ekju("ekyd", ekko(int ), (int)144));
lbl47:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -273819947: {
                    break block53;
                }
                case 27854950: {
                    v6 = hf.ekju("ekye", ekko(int ), (int)145);
                    continue block53;
                }
                case 83881507: {
                    v6 = hf.ekju("ekyf", ekko(int ), (int)146);
                    continue block53;
                }
            }
            break;
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_1 = hf.ku - hf.ekju("ekyg", ekko(int ), (int)147)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == hf.ekju("ekyh", ekjy(int ), (int)224)) break;
            v7 /* !! */  = (long)hf.ekju("ekyi", ekjy(int ), (int)225);
        }
        v8 = hf.mc.field_1724;
        v9 /* !! */  = hf.ku;
        if (true) ** GOTO lbl66
        block55: while (true) {
            v9 /* !! */  = (long)(v10 - hf.ekju("ekyj", ekko(int ), (int)148));
lbl66:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -273819947: {
                    break block55;
                }
                case 519186263: {
                    v10 = hf.ekju("ekyk", ekko(int ), (int)149);
                    continue block55;
                }
                case 2115743901: {
                    v10 = hf.ekju("ekyl", ekko(int ), (int)150);
                    continue block55;
                }
            }
            break;
        }
        var1_4 = v8.method_6032();
        if (var2_3 || var2_3) ** GOTO lbl40
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_2 = hf.ku - hf.ekju("ekym", ekko(int ), (int)151)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == hf.ekju("ekyn", ekjy(int ), (int)226)) break;
            v11 /* !! */  = (long)hf.ekju("ekyo", ekjy(int ), (int)227);
        }
        v12 /* !! */  = hf.ku;
        if (true) ** GOTO lbl86
        block57: while (true) {
            v12 /* !! */  = (long)(v13 - hf.ekju("ekyp", ekko(int ), (int)152));
lbl86:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -273819947: {
                    break block57;
                }
                case 963828445: {
                    v13 = hf.ekju("ekyq", ekko(int ), (int)153);
                    continue block57;
                }
                case 1194629636: {
                    v13 = hf.ekju("ekyr", ekko(int ), (int)154);
                    continue block57;
                }
            }
            break;
        }
        if (!this.goldenHearts.isValue()) ** GOTO lbl-1000
        if (var2_3 || var2_3) ** GOTO lbl40
        v14 /* !! */  = hf.ku;
        if (true) ** GOTO lbl101
        block58: while (true) {
            v14 /* !! */  = (long)(v15 - hf.ekju("ekys", ekko(int ), (int)155));
lbl101:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -938804572: {
                    v15 = hf.ekju("ekyt", ekko(int ), (int)156);
                    continue block58;
                }
                case -891086977: {
                    v15 = hf.ekju("ekyu", ekko(int ), (int)157);
                    continue block58;
                }
                case -273819947: {
                    break block58;
                }
                case 1592801911: {
                    v15 = hf.ekju("ekyv", ekko(int ), (int)158);
                    continue block58;
                }
            }
            break;
        }
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_3 = hf.ku - hf.ekju("ekyw", ekko(int ), (int)159)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == hf.ekju("ekyx", ekjy(int ), (int)228)) break;
            v16 /* !! */  = (long)hf.ekju("ekyy", ekjy(int ), (int)229);
        }
        v17 = hf.mc.field_1724;
        v18 /* !! */  = hf.ku;
        if (true) ** GOTO lbl123
        block60: while (true) {
            v18 /* !! */  = (long)(hf.ekju("ekza", ekko(int ), (int)161) - hf.ekju("ekyz", ekko(int ), (int)160));
lbl123:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -273819947: {
                    break block60;
                }
                case 753930195: {
                    continue block60;
                }
            }
            break;
        }
        var1_4 += v17.method_6067();
        if (var2_3) ** GOTO lbl40
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 3 sources

            {
                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return var1_4;
            }
            case 0: {
                var3_2 /* !! */  = (int)hf.ekju("ekzb", ekjy(int ), (int)230);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl141:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)hf.ekju("ekzc", ekjy(int ), (int)231);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 2: {
                var3_2 /* !! */  = (int)hf.ekju("ekzd", ekjy(int ), (int)232);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl151:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)hf.ekju("ekze", ekjy(int ), (int)233);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 4: {
                var3_2 /* !! */  = (int)hf.ekju("ekzf", ekjy(int ), (int)234);
                if (!var4_1) ** GOTO lbl141
                throw null;
            }
lbl160:
            // 2 sources

            case 5: {
                do {
                    var3_2 /* !! */  = (int)hf.ekju("ekzg", ekjy(int ), (int)235);
                } while (!var4_1);
                throw null;
            }
lbl165:
            // 3 sources

            case 6: {
                do {
                    var3_2 /* !! */  = (int)hf.ekju("ekzh", ekjy(int ), (int)236);
                } while (!var4_1);
                throw null;
            }
lbl170:
            // 3 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_2 /* !! */  = (int)hf.ekju("ekzi", ekjy(int ), (int)237);
                    if (!var4_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 8: {
                var3_2 /* !! */  = (int)hf.ekju("ekzj", ekjy(int ), (int)238);
                if (!var4_1) ** GOTO lbl170
                throw null;
            }
            case 9: {
                var3_2 /* !! */  = (int)hf.ekju("ekzk", ekjy(int ), (int)239);
                if (!var4_1) ** GOTO lbl170
                throw null;
            }
            case 10: 
        }
        var3_2 /* !! */  = (int)hf.ekju("ekzl", ekjy(int ), (int)240);
        ** while (!var4_1)
lbl186:
        // 1 sources

        throw null;
    }
}

