/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1294
 *  net.minecraft.class_1934
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Supplier;
import net.minecraft.class_1294;
import net.minecraft.class_1934;
import ruhack.phobia.aw;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.hn;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.kf;

public class fs
extends ds {
    private static long[] gzjc;
    private final kf mode;
    private final kb requireHunger;
    public static final boolean c;
    private static long[] gzjd;
    private static int[] gzfp;
    private static int[] gzfo;
    private final kb omnidirectional;
    private final kb keepInWater;
    public static final int b;
    private static final long nv = -1538168082823274626L;
    public static final boolean a;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$1() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fs.nv - fs.gzfq("gzrh", gzjb(int ), (int)88)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fs.gzfq("gzri", gzfn(int ), (int)211)) break;
            v0 /* !! */  = (long)fs.gzfq("gzrj", gzfn(int ), (int)212);
        }
        var3_1 = fs.c;
        v1 /* !! */  = fs.nv;
        if (true) ** GOTO lbl12
        block25: while (true) {
            v1 /* !! */  = (long)(v2 - fs.gzfq("gzrk", gzjb(int ), (int)89));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -709875199: {
                    v2 = fs.gzfq("gzrl", gzjb(int ), (int)90);
                    continue block25;
                }
                case 456941826: {
                    v2 = fs.gzfq("gzrm", gzjb(int ), (int)91);
                    continue block25;
                }
                case 981049214: {
                    break block25;
                }
            }
            break;
        }
        var2_2 /* !! */  = fs.b;
        v3 /* !! */  = fs.nv;
        if (true) ** GOTO lbl26
        block26: while (true) {
            v3 /* !! */  = (long)(v4 - fs.gzfq("gzrn", gzjb(int ), (int)92));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 624240828: {
                    v4 = fs.gzfq("gzro", gzjb(int ), (int)93);
                    continue block26;
                }
                case 782782003: {
                    v4 = fs.gzfq("gzrp", gzjb(int ), (int)94);
                    continue block26;
                }
                case 981049214: {
                    break block26;
                }
            }
            break;
        }
        var1_3 = fs.a;
        if (var3_1) {
            throw null;
lbl38:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl38
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = fs.nv - fs.gzfq("gzrq", gzjb(int ), (int)95)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == fs.gzfq("gzrr", gzfn(int ), (int)213)) break;
                    v5 /* !! */  = (long)fs.gzfq("gzrs", gzfn(int ), (int)214);
                }
                v6 /* !! */  = fs.nv;
                if (true) ** GOTO lbl55
                block29: while (true) {
                    v6 /* !! */  = (long)(fs.gzfq("gzru", gzjb(int ), (int)97) - fs.gzfq("gzrt", gzjb(int ), (int)96));
lbl55:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -350103110: {
                            continue block29;
                        }
                        case 981049214: {
                            break block29;
                        }
                    }
                    break;
                }
                v7 = this.mode.isSelected("Legit");
                v8 /* !! */  = fs.nv;
                if (true) ** GOTO lbl65
                block30: while (true) {
                    v8 /* !! */  = (long)(fs.gzfq("gzrw", gzjb(int ), (int)99) - fs.gzfq("gzrv", gzjb(int ), (int)98));
lbl65:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -2001392513: {
                            continue block30;
                        }
                        case 981049214: {
                            break block30;
                        }
                    }
                    break;
                }
                return v7;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)fs.gzfq("gzrx", gzfn(int ), (int)215);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)fs.gzfq("gzry", gzfn(int ), (int)216);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)fs.gzfq("gzrz", gzfn(int ), (int)217);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)fs.gzfq("gzsa", gzfn(int ), (int)218);
        ** while (!var3_1)
lbl89:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gztg() {
        fs.gzjd[100] = -9174860515167520181L;
        fs.gzjd[101] = 5021714932683341944L;
        fs.gzjd[102] = -7469520370821279802L;
        fs.gzjd[103] = -3227468009549664018L;
        fs.gzjd[104] = 6212451617593133558L;
        fs.gzjd[105] = 8785647067428853669L;
        fs.gzjd[106] = -9198207158254407314L;
        fs.gzjd[107] = -1815250131613065338L;
        fs.gzjd[108] = -2984546527571282086L;
        fs.gzjd[109] = 6324980644597677901L;
        fs.gzjd[110] = 6745923083414050325L;
        fs.gzjd[111] = -4804082513540684763L;
    }

    public static /* synthetic */ CallSite gzfq(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean shouldLegitSprint() {
        var3_1 = fs.c;
        var2_2 /* !! */  = fs.b;
        var1_3 = fs.a;
        if (var3_1) {
            throw null;
lbl6:
            // 19 sources

            return (boolean)fs.gzfq("gzhl", gzfn(int ), (int)46);
        }
        if (var1_3 || var1_3) ** GOTO lbl6
        if (fs.mc.field_1755 != null) ** GOTO lbl-1000
        if (var1_3) ** GOTO lbl6
        if (this.hasMovementInput()) ** GOTO lbl18
        if (var1_3) ** GOTO lbl6
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 3 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl6
                return (boolean)fs.gzfq("gzhm", gzfn(int ), (int)47);
            }
lbl18:
            // 1 sources

            if (var1_3 || var1_3) ** GOTO lbl6
            if (fs.mc.field_1724.method_5715()) ** GOTO lbl25
            if (var1_3) ** GOTO lbl6
            if (fs.mc.field_1724.method_6115()) ** GOTO lbl25
            if (var1_3) ** GOTO lbl6
            if (!fs.mc.field_1724.field_5976) ** GOTO lbl27
            if (var1_3) ** GOTO lbl6
lbl25:
            // 3 sources

            if (var1_3 || var1_3) ** GOTO lbl6
            return (boolean)fs.gzfq("gzhn", gzfn(int ), (int)48);
lbl27:
            // 1 sources

            if (var1_3 || var1_3) ** GOTO lbl6
            if (!fs.mc.field_1724.method_6059(class_1294.field_5919)) ** GOTO lbl31
            if (var1_3 || var1_3) ** GOTO lbl6
            return (boolean)fs.gzfq("gzho", gzfn(int ), (int)49);
lbl31:
            // 1 sources

            if (var1_3 || var1_3) ** GOTO lbl6
            if (this.keepInWater.isValue()) ** GOTO lbl37
            if (var1_3) ** GOTO lbl6
            if (!fs.mc.field_1724.method_5799()) ** GOTO lbl37
            if (var1_3 || var1_3) ** GOTO lbl6
            return (boolean)fs.gzfq("gzhp", gzfn(int ), (int)50);
lbl37:
            // 2 sources

            if (var1_3 || var1_3) ** GOTO lbl6
            if (!this.requireHunger.isValue()) ** GOTO lbl42
            if (var1_3) ** GOTO lbl6
            if (!this.hasHunger()) ** GOTO lbl47
            if (var1_3) ** GOTO lbl6
lbl42:
            // 2 sources

            if (var1_3 || var1_3) ** GOTO lbl6
            v0 = fs.gzfq("gzhq", gzfn(int ), (int)51);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl50
lbl47:
            // 1 sources

            if (!var1_3 && !var1_3) ** break;
            ** continue;
            v0 = fs.gzfq("gzhr", gzfn(int ), (int)52);
lbl50:
            // 2 sources

            return (boolean)v0;
lbl51:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)fs.gzfq("gzhs", gzfn(int ), (int)53);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 1: {
                var2_2 /* !! */  = (int)fs.gzfq("gzht", gzfn(int ), (int)54);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl71
            }
lbl61:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)fs.gzfq("gzhu", gzfn(int ), (int)55);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl125
            }
lbl66:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)fs.gzfq("gzhv", gzfn(int ), (int)56);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl71:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)fs.gzfq("gzhw", gzfn(int ), (int)57);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl76:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)fs.gzfq("gzhx", gzfn(int ), (int)58);
                if (!var3_1) ** GOTO lbl51
                throw null;
            }
lbl80:
            // 3 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fs.gzfq("gzhy", gzfn(int ), (int)59);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl133
                    break;
                }
            }
lbl86:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)fs.gzfq("gzhz", gzfn(int ), (int)60);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 8: {
                var2_2 /* !! */  = (int)fs.gzfq("gzia", gzfn(int ), (int)61);
                if (!var3_1) ** GOTO lbl86
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)fs.gzfq("gzib", gzfn(int ), (int)62);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl100:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)fs.gzfq("gzic", gzfn(int ), (int)63);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 11: {
                var2_2 /* !! */  = (int)fs.gzfq("gzid", gzfn(int ), (int)64);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl133
            }
lbl110:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)fs.gzfq("gzie", gzfn(int ), (int)65);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl115:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)fs.gzfq("gzif", gzfn(int ), (int)66);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 14: {
                var2_2 /* !! */  = (int)fs.gzfq("gzig", gzfn(int ), (int)67);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl125:
            // 2 sources

            case 15: {
                var2_2 /* !! */  = (int)fs.gzfq("gzih", gzfn(int ), (int)68);
                if (!var3_1) ** GOTO lbl80
                throw null;
            }
            case 16: {
                var2_2 /* !! */  = (int)fs.gzfq("gzii", gzfn(int ), (int)69);
                if (!var3_1) ** GOTO lbl110
                throw null;
            }
lbl133:
            // 3 sources

            case 17: {
                var2_2 /* !! */  = (int)fs.gzfq("gzij", gzfn(int ), (int)70);
                if (!var3_1) ** GOTO lbl80
                throw null;
            }
lbl137:
            // 2 sources

            case 18: {
                var2_2 /* !! */  = (int)fs.gzfq("gzik", gzfn(int ), (int)71);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl142:
            // 2 sources

            case 19: {
                var2_2 /* !! */  = (int)fs.gzfq("gzil", gzfn(int ), (int)72);
                if (!var3_1) ** GOTO lbl61
                throw null;
            }
lbl146:
            // 2 sources

            case 20: {
                var2_2 /* !! */  = (int)fs.gzfq("gzim", gzfn(int ), (int)73);
                if (!var3_1) ** GOTO lbl86
                throw null;
            }
            case 21: {
                var2_2 /* !! */  = (int)fs.gzfq("gzin", gzfn(int ), (int)74);
                if (!var3_1) ** GOTO lbl61
                throw null;
            }
lbl154:
            // 2 sources

            case 22: {
                var2_2 /* !! */  = (int)fs.gzfq("gzio", gzfn(int ), (int)75);
                if (var3_1) {
                    throw null;
                }
            }
            case 23: {
                var2_2 /* !! */  = (int)fs.gzfq("gzip", gzfn(int ), (int)76);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl192
            }
lbl163:
            // 2 sources

            case 24: {
                var2_2 /* !! */  = (int)fs.gzfq("gziq", gzfn(int ), (int)77);
                if (!var3_1) ** GOTO lbl137
                throw null;
            }
lbl167:
            // 2 sources

            case 25: {
                var2_2 /* !! */  = (int)fs.gzfq("gzir", gzfn(int ), (int)78);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl192
            }
lbl172:
            // 3 sources

            case 26: {
                var2_2 /* !! */  = (int)fs.gzfq("gzis", gzfn(int ), (int)79);
                if (!var3_1) ** GOTO lbl142
                throw null;
            }
lbl176:
            // 3 sources

            case 27: {
                var2_2 /* !! */  = (int)fs.gzfq("gzit", gzfn(int ), (int)80);
                if (!var3_1) ** GOTO lbl100
                throw null;
            }
            case 28: {
                var2_2 /* !! */  = (int)fs.gzfq("gziu", gzfn(int ), (int)81);
                if (!var3_1) ** GOTO lbl76
                throw null;
            }
lbl184:
            // 2 sources

            case 29: {
                var2_2 /* !! */  = (int)fs.gzfq("gziv", gzfn(int ), (int)82);
                if (!var3_1) ** GOTO lbl167
                throw null;
            }
            case 30: {
                var2_2 /* !! */  = (int)fs.gzfq("gziw", gzfn(int ), (int)83);
                if (!var3_1) ** GOTO lbl51
                throw null;
            }
lbl192:
            // 3 sources

            case 31: {
                var2_2 /* !! */  = (int)fs.gzfq("gzix", gzfn(int ), (int)84);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl197:
            // 2 sources

            case 32: {
                var2_2 /* !! */  = (int)fs.gzfq("gziy", gzfn(int ), (int)85);
                if (!var3_1) ** GOTO lbl163
                throw null;
            }
lbl201:
            // 3 sources

            case 33: {
                var2_2 /* !! */  = (int)fs.gzfq("gziz", gzfn(int ), (int)86);
                if (!var3_1) ** GOTO lbl66
                throw null;
            }
            case 34: 
        }
        var2_2 /* !! */  = (int)fs.gzfq("gzja", gzfn(int ), (int)87);
        ** while (!var3_1)
lbl208:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gzsz() {
        fs.gzfo[200] = -1354938392;
        fs.gzfo[201] = 611831923;
        fs.gzfo[202] = 465574177;
        fs.gzfo[203] = -1166148209;
        fs.gzfo[204] = -27624552;
        fs.gzfo[205] = 215602120;
        fs.gzfo[206] = 334097169;
        fs.gzfo[207] = 329275981;
        fs.gzfo[208] = 790753760;
        fs.gzfo[209] = -1178701947;
        fs.gzfo[210] = 1634522229;
        fs.gzfo[211] = 1462307245;
        fs.gzfo[212] = 1999758955;
        fs.gzfo[213] = 934167071;
        fs.gzfo[214] = 598842897;
        fs.gzfo[215] = -1059880074;
        fs.gzfo[216] = 58436912;
        fs.gzfo[217] = 316612948;
        fs.gzfo[218] = 1960984436;
        fs.gzfo[219] = -2082996849;
        fs.gzfo[220] = 1667077060;
        fs.gzfo[221] = -2062429209;
        fs.gzfo[222] = -1590941351;
        fs.gzfo[223] = 1253390704;
        fs.gzfo[224] = 1132144276;
        fs.gzfo[225] = -899296829;
        fs.gzfo[226] = -681655613;
        fs.gzfo[227] = 1651406245;
        fs.gzfo[228] = 100596803;
    }

    private static /* synthetic */ void gzte() {
        fs.gzjc[100] = 5190145415340899162L;
        fs.gzjc[101] = 8074875178452855176L;
        fs.gzjc[102] = -7231254175546080333L;
        fs.gzjc[103] = 8475247813380477015L;
        fs.gzjc[104] = 502709553301176933L;
        fs.gzjc[105] = -3644984586506105177L;
        fs.gzjc[106] = 854979229174662982L;
        fs.gzjc[107] = 7860741912585131276L;
        fs.gzjc[108] = -2188159881864589031L;
        fs.gzjc[109] = 7444223359951528481L;
        fs.gzjc[110] = 688425217135990450L;
        fs.gzjc[111] = 1738518882588483557L;
    }

    private static /* synthetic */ void gzta() {
        fs.gzfp[0] = -1676450205;
        fs.gzfp[1] = -1400108579;
        fs.gzfp[2] = 1734871962;
        fs.gzfp[3] = 601622332;
        fs.gzfp[4] = 646733985;
        fs.gzfp[5] = -450557398;
        fs.gzfp[6] = -1814088854;
        fs.gzfp[7] = -271075899;
        fs.gzfp[8] = 1452207154;
        fs.gzfp[9] = 160813425;
        fs.gzfp[10] = -1048276633;
        fs.gzfp[11] = 1624457087;
        fs.gzfp[12] = -1066693336;
        fs.gzfp[13] = -683039603;
        fs.gzfp[14] = 1484030262;
        fs.gzfp[15] = -2019692941;
        fs.gzfp[16] = -1866349429;
        fs.gzfp[17] = -619332941;
        fs.gzfp[18] = 1349172730;
        fs.gzfp[19] = 1298853829;
        fs.gzfp[20] = 325206397;
        fs.gzfp[21] = -1663139390;
        fs.gzfp[22] = 385085982;
        fs.gzfp[23] = 2126881322;
        fs.gzfp[24] = -960462689;
        fs.gzfp[25] = -1537453089;
        fs.gzfp[26] = 247594833;
        fs.gzfp[27] = -1764239465;
        fs.gzfp[28] = -1311474253;
        fs.gzfp[29] = -889359807;
        fs.gzfp[30] = -2018622766;
        fs.gzfp[31] = 1214643770;
        fs.gzfp[32] = -1657578621;
        fs.gzfp[33] = 812407112;
        fs.gzfp[34] = 1709529581;
        fs.gzfp[35] = -1615829843;
        fs.gzfp[36] = -617601536;
        fs.gzfp[37] = 270451156;
        fs.gzfp[38] = -1670632764;
        fs.gzfp[39] = -1079505559;
        fs.gzfp[40] = -733736275;
        fs.gzfp[41] = 1203954644;
        fs.gzfp[42] = 1273378130;
        fs.gzfp[43] = 1356383608;
        fs.gzfp[44] = -1760566467;
        fs.gzfp[45] = 228970013;
        fs.gzfp[46] = 780234925;
        fs.gzfp[47] = 1347514990;
        fs.gzfp[48] = 473845371;
        fs.gzfp[49] = -1400445060;
        fs.gzfp[50] = -311674742;
        fs.gzfp[51] = -739325031;
        fs.gzfp[52] = -794193047;
        fs.gzfp[53] = -184947442;
        fs.gzfp[54] = -1082257658;
        fs.gzfp[55] = -822349193;
        fs.gzfp[56] = -1180394836;
        fs.gzfp[57] = -457571890;
        fs.gzfp[58] = -66832733;
        fs.gzfp[59] = -648044952;
        fs.gzfp[60] = 980044326;
        fs.gzfp[61] = 258319215;
        fs.gzfp[62] = 472869008;
        fs.gzfp[63] = 1539559332;
        fs.gzfp[64] = 482078436;
        fs.gzfp[65] = -213608341;
        fs.gzfp[66] = 2041588524;
        fs.gzfp[67] = 1737571694;
        fs.gzfp[68] = 467788091;
        fs.gzfp[69] = 1161177947;
        fs.gzfp[70] = 904105165;
        fs.gzfp[71] = 2037838729;
        fs.gzfp[72] = 1322239789;
        fs.gzfp[73] = -1577629815;
        fs.gzfp[74] = 1657423548;
        fs.gzfp[75] = -1278618901;
        fs.gzfp[76] = -1906304752;
        fs.gzfp[77] = 232082115;
        fs.gzfp[78] = 1377864836;
        fs.gzfp[79] = -91297360;
        fs.gzfp[80] = 1571867761;
        fs.gzfp[81] = 1742446705;
        fs.gzfp[82] = -410186900;
        fs.gzfp[83] = 817813073;
        fs.gzfp[84] = 384125237;
        fs.gzfp[85] = -271091223;
        fs.gzfp[86] = -985539007;
        fs.gzfp[87] = -2072008171;
        fs.gzfp[88] = -69448927;
        fs.gzfp[89] = 2120353190;
        fs.gzfp[90] = 2145725608;
        fs.gzfp[91] = 184553441;
        fs.gzfp[92] = -19458827;
        fs.gzfp[93] = -2002526700;
        fs.gzfp[94] = -1246946840;
        fs.gzfp[95] = -1677241941;
        fs.gzfp[96] = 297924390;
        fs.gzfp[97] = 920348031;
        fs.gzfp[98] = 608170339;
        fs.gzfp[99] = -1495590432;
    }

    private static /* synthetic */ void gztd() {
        fs.gzjc[0] = -9114812252381590378L;
        fs.gzjc[1] = -6077028789812671496L;
        fs.gzjc[2] = -271333778513864642L;
        fs.gzjc[3] = -6907114982879769092L;
        fs.gzjc[4] = -6328506355201657120L;
        fs.gzjc[5] = -692721989645077465L;
        fs.gzjc[6] = 22108902472959566L;
        fs.gzjc[7] = 976351121152671056L;
        fs.gzjc[8] = 562251358223207500L;
        fs.gzjc[9] = -3504663365493007673L;
        fs.gzjc[10] = -3159611342986560593L;
        fs.gzjc[11] = 8913509306446909993L;
        fs.gzjc[12] = -5360044892448143403L;
        fs.gzjc[13] = 2257519625660275997L;
        fs.gzjc[14] = -8172739460891849958L;
        fs.gzjc[15] = -2760456261761479975L;
        fs.gzjc[16] = 6445714476142445278L;
        fs.gzjc[17] = -7479428417983177356L;
        fs.gzjc[18] = -1193356929560328589L;
        fs.gzjc[19] = 7885294367369318108L;
        fs.gzjc[20] = -71321733729737516L;
        fs.gzjc[21] = 737932158611062664L;
        fs.gzjc[22] = -653935111839984976L;
        fs.gzjc[23] = -1354281312579972180L;
        fs.gzjc[24] = -782843283803365155L;
        fs.gzjc[25] = 1099440073766206375L;
        fs.gzjc[26] = 2001106669388528322L;
        fs.gzjc[27] = -6432046153693695143L;
        fs.gzjc[28] = 5759366236593784034L;
        fs.gzjc[29] = 5068526731165816787L;
        fs.gzjc[30] = 4544132433922570416L;
        fs.gzjc[31] = 7236099987329714575L;
        fs.gzjc[32] = -2680699832438631216L;
        fs.gzjc[33] = -1616682056548144316L;
        fs.gzjc[34] = 7294320422364982123L;
        fs.gzjc[35] = 9030443438424967256L;
        fs.gzjc[36] = 887202004316901982L;
        fs.gzjc[37] = -3337282963197276165L;
        fs.gzjc[38] = -8871228134125277970L;
        fs.gzjc[39] = 1819202828206140129L;
        fs.gzjc[40] = -662170079630388258L;
        fs.gzjc[41] = -8990737511485640264L;
        fs.gzjc[42] = 8408852549597664703L;
        fs.gzjc[43] = 7944954711108018780L;
        fs.gzjc[44] = -6426329156651769592L;
        fs.gzjc[45] = -2468146145794942392L;
        fs.gzjc[46] = -3649921361719463291L;
        fs.gzjc[47] = 6229891218996788763L;
        fs.gzjc[48] = -1624573444342403791L;
        fs.gzjc[49] = 1090920419447717726L;
        fs.gzjc[50] = 4031479274945073254L;
        fs.gzjc[51] = 4511914658057429653L;
        fs.gzjc[52] = 6104376546191417031L;
        fs.gzjc[53] = 6439835929435071181L;
        fs.gzjc[54] = -7047034951228759857L;
        fs.gzjc[55] = 6390624957957364236L;
        fs.gzjc[56] = 7295088344149804193L;
        fs.gzjc[57] = 8943770915032108417L;
        fs.gzjc[58] = -2203918910221785830L;
        fs.gzjc[59] = -3633264361690555727L;
        fs.gzjc[60] = -8590042189749778260L;
        fs.gzjc[61] = -5761786776210227087L;
        fs.gzjc[62] = -8677295434144892361L;
        fs.gzjc[63] = -3828695568732953418L;
        fs.gzjc[64] = -8588784016099483181L;
        fs.gzjc[65] = -6884345588422234104L;
        fs.gzjc[66] = 2340430160836207142L;
        fs.gzjc[67] = -344617407624621247L;
        fs.gzjc[68] = -8760075420855312793L;
        fs.gzjc[69] = -2778124487517463184L;
        fs.gzjc[70] = -5364976745581470242L;
        fs.gzjc[71] = 6457324915640958174L;
        fs.gzjc[72] = 8014071147387597032L;
        fs.gzjc[73] = -722104830768895390L;
        fs.gzjc[74] = 1218999292311961415L;
        fs.gzjc[75] = -4490849982079602127L;
        fs.gzjc[76] = -2801460906254951419L;
        fs.gzjc[77] = 5254045475989069151L;
        fs.gzjc[78] = -8220800562962702341L;
        fs.gzjc[79] = 3986264669317904467L;
        fs.gzjc[80] = -4964873619517508009L;
        fs.gzjc[81] = -7814237570122011899L;
        fs.gzjc[82] = 3462469169075080879L;
        fs.gzjc[83] = -4579692517601110758L;
        fs.gzjc[84] = -3162972268054704143L;
        fs.gzjc[85] = -1242259209623345274L;
        fs.gzjc[86] = -3612057714664040914L;
        fs.gzjc[87] = 7592109307393535694L;
        fs.gzjc[88] = 902319282082688093L;
        fs.gzjc[89] = -7858567119919114903L;
        fs.gzjc[90] = -3261169267809418730L;
        fs.gzjc[91] = -8889897864939684041L;
        fs.gzjc[92] = 8292088154809593531L;
        fs.gzjc[93] = -4924268191832574685L;
        fs.gzjc[94] = -762952409735196467L;
        fs.gzjc[95] = 8473731647114809362L;
        fs.gzjc[96] = -6824453772996870043L;
        fs.gzjc[97] = -942556504409304844L;
        fs.gzjc[98] = 9147498664649264546L;
        fs.gzjc[99] = 560486334871869690L;
    }

    private static /* synthetic */ void gzsy() {
        fs.gzfo[100] = -744092833;
        fs.gzfo[101] = -624000223;
        fs.gzfo[102] = 258114916;
        fs.gzfo[103] = -396520279;
        fs.gzfo[104] = 1691598126;
        fs.gzfo[105] = -1010637342;
        fs.gzfo[106] = -976355796;
        fs.gzfo[107] = 537216219;
        fs.gzfo[108] = 1975459850;
        fs.gzfo[109] = 984795049;
        fs.gzfo[110] = 1280975068;
        fs.gzfo[111] = 362169128;
        fs.gzfo[112] = -824407606;
        fs.gzfo[113] = -1270688912;
        fs.gzfo[114] = -1942621153;
        fs.gzfo[115] = -1061618789;
        fs.gzfo[116] = -220856375;
        fs.gzfo[117] = -1889085528;
        fs.gzfo[118] = 823269699;
        fs.gzfo[119] = 325014857;
        fs.gzfo[120] = 906316552;
        fs.gzfo[121] = -235332702;
        fs.gzfo[122] = -1176120374;
        fs.gzfo[123] = 529844074;
        fs.gzfo[124] = -1013369909;
        fs.gzfo[125] = -273866419;
        fs.gzfo[126] = 619879464;
        fs.gzfo[127] = 1441840620;
        fs.gzfo[128] = -1325456217;
        fs.gzfo[129] = -114960531;
        fs.gzfo[130] = -1994414827;
        fs.gzfo[131] = -1707798183;
        fs.gzfo[132] = -1187312234;
        fs.gzfo[133] = 1763732679;
        fs.gzfo[134] = -312887609;
        fs.gzfo[135] = -912006384;
        fs.gzfo[136] = -11738732;
        fs.gzfo[137] = -68547646;
        fs.gzfo[138] = -694704719;
        fs.gzfo[139] = 405288910;
        fs.gzfo[140] = 890221253;
        fs.gzfo[141] = 1176163927;
        fs.gzfo[142] = 1148106935;
        fs.gzfo[143] = -1529268584;
        fs.gzfo[144] = 1421547868;
        fs.gzfo[145] = -1884499116;
        fs.gzfo[146] = -1140980504;
        fs.gzfo[147] = 1578772101;
        fs.gzfo[148] = -1587633567;
        fs.gzfo[149] = -539856444;
        fs.gzfo[150] = -1922606634;
        fs.gzfo[151] = -1481085236;
        fs.gzfo[152] = 511707774;
        fs.gzfo[153] = 1119987837;
        fs.gzfo[154] = -832219361;
        fs.gzfo[155] = -1429848057;
        fs.gzfo[156] = 1986109214;
        fs.gzfo[157] = 1392322223;
        fs.gzfo[158] = 1249079837;
        fs.gzfo[159] = 1413680676;
        fs.gzfo[160] = 714946239;
        fs.gzfo[161] = -1976863315;
        fs.gzfo[162] = 2110114931;
        fs.gzfo[163] = 23560816;
        fs.gzfo[164] = -1246864844;
        fs.gzfo[165] = 205145748;
        fs.gzfo[166] = 1655520996;
        fs.gzfo[167] = 463144740;
        fs.gzfo[168] = 201292394;
        fs.gzfo[169] = 495497866;
        fs.gzfo[170] = -1293939844;
        fs.gzfo[171] = -648913784;
        fs.gzfo[172] = 1808122491;
        fs.gzfo[173] = 326896709;
        fs.gzfo[174] = -598182494;
        fs.gzfo[175] = -1904217476;
        fs.gzfo[176] = 192123485;
        fs.gzfo[177] = 1694982513;
        fs.gzfo[178] = 1697488674;
        fs.gzfo[179] = -1375450118;
        fs.gzfo[180] = -1932243106;
        fs.gzfo[181] = 990376778;
        fs.gzfo[182] = -373215720;
        fs.gzfo[183] = -118351523;
        fs.gzfo[184] = 138512211;
        fs.gzfo[185] = -1274216861;
        fs.gzfo[186] = 1055389056;
        fs.gzfo[187] = 250107029;
        fs.gzfo[188] = -1997252925;
        fs.gzfo[189] = 1330233809;
        fs.gzfo[190] = -730839713;
        fs.gzfo[191] = -1215748830;
        fs.gzfo[192] = -265234019;
        fs.gzfo[193] = -836368346;
        fs.gzfo[194] = -52109661;
        fs.gzfo[195] = 228883558;
        fs.gzfo[196] = -948907144;
        fs.gzfo[197] = -1892266790;
        fs.gzfo[198] = 2106267967;
        fs.gzfo[199] = -1873867851;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public fs() {
        var2_1 /* !! */  = fs.b;
        super("AutoSprint", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u0441\u043f\u0440\u0438\u043d\u0442 \u0441 \u043e\u0431\u044b\u0447\u043d\u044b\u043c \u0438 \u043b\u0435\u0433\u0438\u0442\u043d\u044b\u043c \u0440\u0435\u0436\u0438\u043c\u0430\u043c\u0438", du.MOVEMENT);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u041e\u0431\u044b\u0447\u043d\u044b\u0439 \u043f\u043e\u0441\u0442\u043e\u044f\u043d\u043d\u043e \u0437\u0430\u0436\u0438\u043c\u0430\u0435\u0442 \u0441\u043f\u0440\u0438\u043d\u0442, Legit \u043f\u043e\u0432\u0442\u043e\u0440\u044f\u0435\u0442 \u0432\u0430\u043d\u0438\u043b\u044c\u043d\u043e\u0435 \u043f\u043e\u0432\u0435\u0434\u0435\u043d\u0438\u0435", "\u041e\u0431\u044b\u0447\u043d\u044b\u0439", new String[]{"\u041e\u0431\u044b\u0447\u043d\u044b\u0439", "Legit"});
                this.omnidirectional = new kb("\u0412\u0441\u0435\u043d\u0430\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u043d\u044b\u0439", "\u0421\u043f\u0440\u0438\u043d\u0442 \u0432 \u043b\u044e\u0431\u0443\u044e \u0441\u0442\u043e\u0440\u043e\u043d\u0443, \u0430 \u043d\u0435 \u0442\u043e\u043b\u044c\u043a\u043e \u0432\u043f\u0435\u0440\u0451\u0434 (\u043c\u0435\u043d\u0435\u0435 \u043b\u0435\u0433\u0438\u0442\u043d\u043e)").setValue((boolean)fs.gzfq("gzfr", gzfn(int ), (int)0)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$0(), ()Ljava/lang/Boolean;)((fs)this));
                this.keepInWater = new kb("\u0421\u043f\u0440\u0438\u043d\u0442 \u0432 \u0432\u043e\u0434\u0435", "\u0420\u0430\u0437\u0440\u0435\u0448\u0430\u0442\u044c \u0441\u043f\u0440\u0438\u043d\u0442 \u0432 \u0432\u043e\u0434\u0435").setValue((boolean)fs.gzfq("gzfs", gzfn(int ), (int)1)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$1(), ()Ljava/lang/Boolean;)((fs)this));
                this.requireHunger = new kb("\u0422\u0440\u0435\u0431\u043e\u0432\u0430\u0442\u044c \u0433\u043e\u043b\u043e\u0434", "\u041d\u0435 \u0441\u043f\u0440\u0438\u043d\u0442\u0438\u0442\u044c \u043f\u0440\u0438 \u0433\u043e\u043b\u043e\u0434\u0435 \u2264 6 (\u043a\u0430\u043a \u0432 \u0432\u0430\u043d\u0438\u043b\u043b\u0435)").setValue((boolean)fs.gzfq("gzft", gzfn(int ), (int)2)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$2(), ()Ljava/lang/Boolean;)((fs)this));
                this.settings(new jx[]{this.mode, this.omnidirectional, this.keepInWater, this.requireHunger});
                return;
            }
lbl12:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)fs.gzfq("gzfu", gzfn(int ), (int)3);
            }
            case 1: {
                var2_1 /* !! */  = (int)fs.gzfq("gzfv", gzfn(int ), (int)4);
            }
            case 2: {
                var2_1 /* !! */  = (int)fs.gzfq("gzfw", gzfn(int ), (int)5);
                break;
            }
lbl19:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)fs.gzfq("gzfx", gzfn(int ), (int)6);
                ** GOTO lbl12
            }
lbl22:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)fs.gzfq("gzfy", gzfn(int ), (int)7);
            }
            case 5: {
                var2_1 /* !! */  = (int)fs.gzfq("gzfz", gzfn(int ), (int)8);
                ** GOTO lbl19
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)fs.gzfq("gzga", gzfn(int ), (int)9);
                    ** GOTO lbl22
                    break;
                }
            }
            case 7: 
        }
        var2_1 /* !! */  = (int)fs.gzfq("gzgb", gzfn(int ), (int)10);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void tick(df var1_1) {
        var5_2 = fs.c;
        var4_3 /* !! */  = fs.b;
        var3_4 = fs.a;
        if (var5_2) {
            throw null;
lbl6:
            // 16 sources

            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl6
        if (fs.mc.field_1724 == null) ** GOTO lbl16
        if (var3_4) ** GOTO lbl6
        if (fs.mc.field_1690 != null) ** GOTO lbl18
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl6
lbl16:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl6
                return;
            }
lbl18:
            // 1 sources

            if (var3_4 || var3_4) ** GOTO lbl6
            var2_5 = hn.getInstance();
            if (var3_4 || var3_4) ** GOTO lbl6
            if (var2_5 == null) ** GOTO lbl32
            if (var3_4) ** GOTO lbl6
            if (!var2_5.isState()) ** GOTO lbl32
            if (var3_4) ** GOTO lbl6
            if (!var2_5.isSprintResetInProgress()) ** GOTO lbl32
            if (var3_4 || var3_4) ** GOTO lbl6
            fs.mc.field_1690.field_1867.method_23481((boolean)fs.gzfq("gzgc", gzfn(int ), (int)11));
            if (var3_4 || var3_4) ** GOTO lbl6
            fs.mc.field_1724.method_5728((boolean)fs.gzfq("gzgd", gzfn(int ), (int)12));
            if (var3_4 || var3_4) ** GOTO lbl6
            return;
lbl32:
            // 3 sources

            if (var3_4 || var3_4) ** GOTO lbl6
            if (!this.mode.isSelected("\u041e\u0431\u044b\u0447\u043d\u044b\u0439")) ** GOTO lbl38
            if (var3_4 || var3_4) ** GOTO lbl6
            fs.mc.field_1690.field_1867.method_23481((boolean)fs.gzfq("gzge", gzfn(int ), (int)13));
            if (var3_4 || var3_4) ** GOTO lbl6
            return;
lbl38:
            // 1 sources

            if (var3_4 || var3_4) ** GOTO lbl6
            fs.mc.field_1690.field_1867.method_23481(this.shouldLegitSprint());
            if (!var3_4 && !var3_4) ** break;
            ** continue;
            return;
lbl43:
            // 6 sources

            case 0: {
                var4_3 /* !! */  = (int)fs.gzfq("gzgf", gzfn(int ), (int)14);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl67
            }
            case 1: {
                var4_3 /* !! */  = (int)fs.gzfq("gzgg", gzfn(int ), (int)15);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl77
            }
            case 2: {
                var4_3 /* !! */  = (int)fs.gzfq("gzgh", gzfn(int ), (int)16);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 3: {
                var4_3 /* !! */  = (int)fs.gzfq("gzgi", gzfn(int ), (int)17);
                if (!var5_2) ** GOTO lbl43
                throw null;
            }
lbl62:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)fs.gzfq("gzgj", gzfn(int ), (int)18);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl67:
            // 4 sources

            case 5: {
                var4_3 /* !! */  = (int)fs.gzfq("gzgk", gzfn(int ), (int)19);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 6: {
                var4_3 /* !! */  = (int)fs.gzfq("gzgl", gzfn(int ), (int)20);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl77:
            // 3 sources

            case 7: {
                var4_3 /* !! */  = (int)fs.gzfq("gzgm", gzfn(int ), (int)21);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl114
            }
            case 8: {
                var4_3 /* !! */  = (int)fs.gzfq("gzgn", gzfn(int ), (int)22);
                if (!var5_2) ** GOTO lbl43
                throw null;
            }
            case 9: {
                var4_3 /* !! */  = (int)fs.gzfq("gzgo", gzfn(int ), (int)23);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 10: {
                var4_3 /* !! */  = (int)fs.gzfq("gzgp", gzfn(int ), (int)24);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl96:
            // 3 sources

            case 11: {
                var4_3 /* !! */  = (int)fs.gzfq("gzgq", gzfn(int ), (int)25);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl101:
            // 2 sources

            case 12: {
                var4_3 /* !! */  = (int)fs.gzfq("gzgr", gzfn(int ), (int)26);
                if (!var5_2) ** GOTO lbl67
                throw null;
            }
            case 13: {
                var4_3 /* !! */  = (int)fs.gzfq("gzgs", gzfn(int ), (int)27);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl136
            }
            case 14: {
                var4_3 /* !! */  = (int)fs.gzfq("gzgt", gzfn(int ), (int)28);
                if (!var5_2) ** GOTO lbl43
                throw null;
            }
lbl114:
            // 3 sources

            case 15: {
                var4_3 /* !! */  = (int)fs.gzfq("gzgu", gzfn(int ), (int)29);
                if (!var5_2) ** GOTO lbl43
                throw null;
            }
            case 16: {
                var4_3 /* !! */  = (int)fs.gzfq("gzgv", gzfn(int ), (int)30);
                if (var5_2) {
                    throw null;
                }
            }
lbl122:
            // 5 sources

            case 17: {
                var4_3 /* !! */  = (int)fs.gzfq("gzgw", gzfn(int ), (int)31);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 18: {
                var4_3 /* !! */  = (int)fs.gzfq("gzgx", gzfn(int ), (int)32);
                if (!var5_2) ** GOTO lbl96
                throw null;
            }
lbl131:
            // 3 sources

            case 19: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)fs.gzfq("gzgy", gzfn(int ), (int)33);
                    if (!var5_2) ** GOTO lbl43
                    throw null;
                }
            }
lbl136:
            // 2 sources

            case 20: {
                var4_3 /* !! */  = (int)fs.gzfq("gzgz", gzfn(int ), (int)34);
                if (!var5_2) ** GOTO lbl77
                throw null;
            }
            case 21: {
                var4_3 /* !! */  = (int)fs.gzfq("gzha", gzfn(int ), (int)35);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 22: {
                var4_3 /* !! */  = (int)fs.gzfq("gzhb", gzfn(int ), (int)36);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl150:
            // 3 sources

            case 23: {
                var4_3 /* !! */  = (int)fs.gzfq("gzhc", gzfn(int ), (int)37);
                if (!var5_2) ** GOTO lbl67
                throw null;
            }
            case 24: {
                var4_3 /* !! */  = (int)fs.gzfq("gzhd", gzfn(int ), (int)38);
                if (!var5_2) ** GOTO lbl150
                throw null;
            }
            case 25: {
                var4_3 /* !! */  = (int)fs.gzfq("gzhe", gzfn(int ), (int)39);
                if (!var5_2) ** GOTO lbl114
                throw null;
            }
lbl162:
            // 3 sources

            case 26: {
                var4_3 /* !! */  = (int)fs.gzfq("gzhf", gzfn(int ), (int)40);
                if (!var5_2) ** GOTO lbl101
                throw null;
            }
lbl166:
            // 2 sources

            case 27: {
                var4_3 /* !! */  = (int)fs.gzfq("gzhg", gzfn(int ), (int)41);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl171:
            // 2 sources

            case 28: {
                var4_3 /* !! */  = (int)fs.gzfq("gzhh", gzfn(int ), (int)42);
                if (!var5_2) ** GOTO lbl62
                throw null;
            }
lbl175:
            // 3 sources

            case 29: {
                var4_3 /* !! */  = (int)fs.gzfq("gzhi", gzfn(int ), (int)43);
                if (!var5_2) ** GOTO lbl96
                throw null;
            }
lbl179:
            // 2 sources

            case 30: {
                var4_3 /* !! */  = (int)fs.gzfq("gzhj", gzfn(int ), (int)44);
                if (!var5_2) ** GOTO lbl131
                throw null;
            }
            case 31: 
        }
        var4_3 /* !! */  = (int)fs.gzfq("gzhk", gzfn(int ), (int)45);
        ** while (!var5_2)
lbl186:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$0() {
        v0 /* !! */  = fs.nv;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(fs.gzfq("gzsc", gzjb(int ), (int)101) - fs.gzfq("gzsb", gzjb(int ), (int)100));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 981049214: {
                    break block15;
                }
                case 1910905323: {
                    continue block15;
                }
            }
            break;
        }
        var3_1 = fs.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = fs.nv - fs.gzfq("gzsd", gzjb(int ), (int)102)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fs.gzfq("gzse", gzfn(int ), (int)219)) break;
            v1 /* !! */  = (long)fs.gzfq("gzsf", gzfn(int ), (int)220);
        }
        var2_2 = fs.b;
        v2 /* !! */  = fs.nv;
        if (true) ** GOTO lbl21
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - fs.gzfq("gzsg", gzjb(int ), (int)103));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 831811416: {
                    v3 = fs.gzfq("gzsh", gzjb(int ), (int)104);
                    continue block17;
                }
                case 981049214: {
                    break block17;
                }
                case 1759413935: {
                    v3 = fs.gzfq("gzsi", gzjb(int ), (int)105);
                    continue block17;
                }
            }
            break;
        }
        var1_3 = fs.a;
        if (var3_1) {
            throw null;
lbl33:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl36:
        // 1 sources

        v4 /* !! */  = fs.nv;
        if (true) ** GOTO lbl40
        block19: while (true) {
            v4 /* !! */  = (long)(v5 - fs.gzfq("gzsj", gzjb(int ), (int)106));
lbl40:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1925921876: {
                    v5 = fs.gzfq("gzsk", gzjb(int ), (int)107);
                    continue block19;
                }
                case -494360042: {
                    v5 = fs.gzfq("gzsl", gzjb(int ), (int)108);
                    continue block19;
                }
                case 13146844: {
                    v5 = fs.gzfq("gzsm", gzjb(int ), (int)109);
                    continue block19;
                }
                case 981049214: {
                    break block19;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = fs.nv - fs.gzfq("gzsn", gzjb(int ), (int)110)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == fs.gzfq("gzso", gzfn(int ), (int)221)) break;
            v6 /* !! */  = (long)fs.gzfq("gzsp", gzfn(int ), (int)222);
        }
        v7 = this.mode.isSelected("Legit");
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_2 = fs.nv - fs.gzfq("gzsq", gzjb(int ), (int)111)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == fs.gzfq("gzsr", gzfn(int ), (int)223)) break;
            v8 /* !! */  = (long)fs.gzfq("gzss", gzfn(int ), (int)224);
        }
        return v7;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fs.nv - fs.gzfq("gzov", gzjb(int ), (int)60)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fs.gzfq("gzow", gzfn(int ), (int)175)) break;
            v0 /* !! */  = (long)fs.gzfq("gzox", gzfn(int ), (int)176);
        }
        var3_1 = fs.c;
        v1 /* !! */  = fs.nv;
        if (true) ** GOTO lbl11
        block32: while (true) {
            v1 /* !! */  = (long)(v2 - fs.gzfq("gzoy", gzjb(int ), (int)61));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 758974944: {
                    v2 = fs.gzfq("gzoz", gzjb(int ), (int)62);
                    continue block32;
                }
                case 981049214: {
                    break block32;
                }
                case 1116762402: {
                    v2 = fs.gzfq("gzpa", gzjb(int ), (int)63);
                    continue block32;
                }
            }
            break;
        }
        var2_2 /* !! */  = fs.b;
        v3 /* !! */  = fs.nv;
        if (true) ** GOTO lbl25
        block33: while (true) {
            v3 /* !! */  = (long)(v4 - fs.gzfq("gzpb", gzjb(int ), (int)64));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1704983232: {
                    v4 = fs.gzfq("gzpc", gzjb(int ), (int)65);
                    continue block33;
                }
                case 981049214: {
                    break block33;
                }
                case 1734304518: {
                    v4 = fs.gzfq("gzpd", gzjb(int ), (int)66);
                    continue block33;
                }
            }
            break;
        }
        var1_3 = fs.a;
        if (var3_1) {
            throw null;
lbl37:
            // 5 sources

            return;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl37
                v5 /* !! */  = fs.nv;
                if (true) ** GOTO lbl47
                block35: while (true) {
                    v5 /* !! */  = (long)(fs.gzfq("gzpf", gzjb(int ), (int)68) - fs.gzfq("gzpe", gzjb(int ), (int)67));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1213192993: {
                            continue block35;
                        }
                        case 981049214: {
                            break block35;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = fs.nv - fs.gzfq("gzpg", gzjb(int ), (int)69)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == fs.gzfq("gzph", gzfn(int ), (int)177)) break;
                    v6 /* !! */  = (long)fs.gzfq("gzpi", gzfn(int ), (int)178);
                }
                if (fs.mc.field_1690 == null) ** GOTO lbl84
                if (var1_3 || var1_3) ** GOTO lbl37
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = fs.nv - fs.gzfq("gzpj", gzjb(int ), (int)70)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == fs.gzfq("gzpk", gzfn(int ), (int)179)) break;
                    v7 /* !! */  = (long)fs.gzfq("gzpl", gzfn(int ), (int)180);
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = fs.nv - fs.gzfq("gzpm", gzjb(int ), (int)71)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == fs.gzfq("gzpn", gzfn(int ), (int)181)) break;
                    v8 /* !! */  = (long)fs.gzfq("gzpo", gzfn(int ), (int)182);
                }
                v9 = fs.mc.field_1690;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = fs.nv - fs.gzfq("gzpp", gzjb(int ), (int)72)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == fs.gzfq("gzpq", gzfn(int ), (int)183)) break;
                    v10 /* !! */  = (long)fs.gzfq("gzpr", gzfn(int ), (int)184);
                }
                v11 = v9.field_1867;
                v12 = fs.gzfq("gzps", gzfn(int ), (int)185);
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_5 = fs.nv - fs.gzfq("gzpt", gzjb(int ), (int)73)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == fs.gzfq("gzpu", gzfn(int ), (int)186)) break;
                    v13 /* !! */  = (long)fs.gzfq("gzpv", gzfn(int ), (int)187);
                }
                v11.method_23481((boolean)v12);
                if (var1_3) ** GOTO lbl37
lbl84:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl37
                v14 /* !! */  = fs.nv;
                if (true) ** GOTO lbl89
                block41: while (true) {
                    v14 /* !! */  = (long)(fs.gzfq("gzpx", gzjb(int ), (int)75) - fs.gzfq("gzpw", gzjb(int ), (int)74));
lbl89:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case 981049214: {
                            break block41;
                        }
                        case 1639945971: {
                            continue block41;
                        }
                    }
                    break;
                }
                super.deactivate();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl98:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)fs.gzfq("gzpy", gzfn(int ), (int)188);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 1: {
                var2_2 /* !! */  = (int)fs.gzfq("gzpz", gzfn(int ), (int)189);
                if (var3_1) {
                    throw null;
                }
            }
lbl107:
            // 5 sources

            case 2: {
                var2_2 /* !! */  = (int)fs.gzfq("gzqa", gzfn(int ), (int)190);
                if (var3_1) {
                    throw null;
                }
            }
lbl111:
            // 4 sources

            case 3: {
                var2_2 /* !! */  = (int)fs.gzfq("gzqb", gzfn(int ), (int)191);
                if (!var3_1) ** GOTO lbl107
                throw null;
            }
lbl115:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)fs.gzfq("gzqc", gzfn(int ), (int)192);
                if (!var3_1) ** GOTO lbl98
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)fs.gzfq("gzqd", gzfn(int ), (int)193);
                if (!var3_1) ** GOTO lbl115
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)fs.gzfq("gzqe", gzfn(int ), (int)194);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl138
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fs.gzfq("gzqf", gzfn(int ), (int)195);
                    if (!var3_1) ** GOTO lbl107
                    throw null;
                }
            }
            case 8: {
                do {
                    var2_2 /* !! */  = (int)fs.gzfq("gzqg", gzfn(int ), (int)196);
                } while (!var3_1);
                throw null;
            }
lbl138:
            // 2 sources

            case 9: {
                do {
                    var2_2 /* !! */  = (int)fs.gzfq("gzqh", gzfn(int ), (int)197);
                } while (!var3_1);
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)fs.gzfq("gzqi", gzfn(int ), (int)198);
        ** while (!var3_1)
lbl146:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean hasHunger() {
        block66: {
            block65: {
                block64: {
                    block63: {
                        block62: {
                            block61: {
                                while (true) {
                                    if ((v0 /* !! */  = (cfr_temp_0 = fs.nv - fs.gzfq("gzmc", gzjb(int ), (int)27)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                                    if (v0 /* !! */  == fs.gzfq("gzmd", gzfn(int ), (int)137)) break;
                                    v0 /* !! */  = (long)fs.gzfq("gzme", gzfn(int ), (int)138);
                                }
                                var4_1 = fs.c;
                                while (true) {
                                    if ((v1 /* !! */  = (cfr_temp_1 = fs.nv - fs.gzfq("gzmf", gzjb(int ), (int)28)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                                    if (v1 /* !! */  == fs.gzfq("gzmg", gzfn(int ), (int)139)) break;
                                    v1 /* !! */  = (long)fs.gzfq("gzmh", gzfn(int ), (int)140);
                                }
                                var3_2 = fs.b;
                                while (true) {
                                    if ((v2 /* !! */  = (cfr_temp_2 = fs.nv - fs.gzfq("gzmi", gzjb(int ), (int)29)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                                    if (v2 /* !! */  == fs.gzfq("gzmj", gzfn(int ), (int)141)) break;
                                    v2 /* !! */  = (long)fs.gzfq("gzmk", gzfn(int ), (int)142);
                                }
                                var2_3 = fs.a;
                                if (var4_1) {
                                    throw null;
lbl21:
                                    // 10 sources

                                    return (boolean)fs.gzfq("gzml", gzfn(int ), (int)143);
                                }
                                if (var2_3 || var2_3) ** GOTO lbl21
                                v3 /* !! */  = fs.nv;
                                if (true) ** GOTO lbl28
                                block47: while (true) {
                                    v3 /* !! */  = (long)(fs.gzfq("gzmn", gzjb(int ), (int)31) - fs.gzfq("gzmm", gzjb(int ), (int)30));
lbl28:
                                    // 2 sources

                                    switch ((int)v3 /* !! */ ) {
                                        case -574672243: {
                                            continue block47;
                                        }
                                        case 981049214: {
                                            break block47;
                                        }
                                    }
                                    break;
                                }
                                v4 /* !! */  = fs.nv;
                                if (true) ** GOTO lbl37
                                block48: while (true) {
                                    v4 /* !! */  = (long)(v5 - fs.gzfq("gzmo", gzjb(int ), (int)32));
lbl37:
                                    // 2 sources

                                    switch ((int)v4 /* !! */ ) {
                                        case -627099041: {
                                            v5 = fs.gzfq("gzmp", gzjb(int ), (int)33);
                                            continue block48;
                                        }
                                        case -96470633: {
                                            v5 = fs.gzfq("gzmq", gzjb(int ), (int)34);
                                            continue block48;
                                        }
                                        case 981049214: {
                                            break block48;
                                        }
                                    }
                                    break;
                                }
                                if (fs.mc.field_1761 == null) break block61;
                                if (var2_3 || var2_3) ** GOTO lbl21
                                v6 /* !! */  = fs.nv;
                                if (true) ** GOTO lbl52
                                block49: while (true) {
                                    v6 /* !! */  = (long)(v7 - fs.gzfq("gzmr", gzjb(int ), (int)35));
lbl52:
                                    // 2 sources

                                    switch ((int)v6 /* !! */ ) {
                                        case -2069318171: {
                                            v7 = fs.gzfq("gzms", gzjb(int ), (int)36);
                                            continue block49;
                                        }
                                        case -516440542: {
                                            v7 = fs.gzfq("gzmt", gzjb(int ), (int)37);
                                            continue block49;
                                        }
                                        case 981049214: {
                                            break block49;
                                        }
                                    }
                                    break;
                                }
                                while (true) {
                                    if ((v8 /* !! */  = (cfr_temp_3 = fs.nv - fs.gzfq("gzmu", gzjb(int ), (int)38)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                                    if (v8 /* !! */  == fs.gzfq("gzmv", gzfn(int ), (int)144)) break;
                                    v8 /* !! */  = (long)fs.gzfq("gzmw", gzfn(int ), (int)145);
                                }
                                v9 = fs.mc.field_1761;
                                v10 /* !! */  = fs.nv;
                                if (true) ** GOTO lbl71
                                block51: while (true) {
                                    v10 /* !! */  = (long)(v11 - fs.gzfq("gzmx", gzjb(int ), (int)39));
lbl71:
                                    // 2 sources

                                    switch ((int)v10 /* !! */ ) {
                                        case -1267439511: {
                                            v11 = fs.gzfq("gzmy", gzjb(int ), (int)40);
                                            continue block51;
                                        }
                                        case -867064945: {
                                            v11 = fs.gzfq("gzmz", gzjb(int ), (int)41);
                                            continue block51;
                                        }
                                        case -551560160: {
                                            v11 = fs.gzfq("gzna", gzjb(int ), (int)42);
                                            continue block51;
                                        }
                                        case 981049214: {
                                            break block51;
                                        }
                                    }
                                    break;
                                }
                                v12 = v9.method_2920();
                                if (var4_1) {
                                    throw null;
                                }
                                break block62;
                            }
                            if (var2_3 || var2_3) ** GOTO lbl21
                            v12 = var1_4 = null;
                        }
                        if (var2_3 || var2_3) ** GOTO lbl21
                        v13 /* !! */  = fs.nv;
                        if (true) ** GOTO lbl96
                        block52: while (true) {
                            v13 /* !! */  = (long)(v14 - fs.gzfq("gznb", gzjb(int ), (int)43));
lbl96:
                            // 2 sources

                            switch ((int)v13 /* !! */ ) {
                                case -1990464393: {
                                    v14 = fs.gzfq("gznc", gzjb(int ), (int)44);
                                    continue block52;
                                }
                                case 293177432: {
                                    v14 = fs.gzfq("gznd", gzjb(int ), (int)45);
                                    continue block52;
                                }
                                case 881859141: {
                                    v14 = fs.gzfq("gzne", gzjb(int ), (int)46);
                                    continue block52;
                                }
                                case 981049214: {
                                    break block52;
                                }
                            }
                            break;
                        }
                        if (var1_4 == class_1934.field_9220) break block63;
                        if (var2_3) ** GOTO lbl21
                        while (true) {
                            if ((v15 /* !! */  = (cfr_temp_4 = fs.nv - fs.gzfq("gznf", gzjb(int ), (int)47)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v15 /* !! */  == fs.gzfq("gzng", gzfn(int ), (int)146)) break;
                            v15 /* !! */  = (long)fs.gzfq("gznh", gzfn(int ), (int)147);
                        }
                        if (var1_4 != class_1934.field_9219) break block64;
                        if (var2_3) ** GOTO lbl21
                    }
                    if (var2_3 || var2_3) ** GOTO lbl21
                    return (boolean)fs.gzfq("gzni", gzfn(int ), (int)148);
                }
                if (var2_3 || var2_3) ** GOTO lbl21
                v16 /* !! */  = fs.nv;
                if (true) ** GOTO lbl126
                block54: while (true) {
                    v16 /* !! */  = (long)(v17 - fs.gzfq("gznj", gzjb(int ), (int)48));
lbl126:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -2082783934: {
                            v17 = fs.gzfq("gznk", gzjb(int ), (int)49);
                            continue block54;
                        }
                        case -1478074608: {
                            v17 = fs.gzfq("gznl", gzjb(int ), (int)50);
                            continue block54;
                        }
                        case 981049214: {
                            break block54;
                        }
                        case 1092898455: {
                            v17 = fs.gzfq("gznm", gzjb(int ), (int)51);
                            continue block54;
                        }
                    }
                    break;
                }
                v18 /* !! */  = fs.nv;
                if (true) ** GOTO lbl142
                block55: while (true) {
                    v18 /* !! */  = (long)(v19 - fs.gzfq("gznn", gzjb(int ), (int)52));
lbl142:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -2096718119: {
                            v19 = fs.gzfq("gzno", gzjb(int ), (int)53);
                            continue block55;
                        }
                        case -1267598885: {
                            v19 = fs.gzfq("gznp", gzjb(int ), (int)54);
                            continue block55;
                        }
                        case 39125004: {
                            v19 = fs.gzfq("gznq", gzjb(int ), (int)55);
                            continue block55;
                        }
                        case 981049214: {
                            break block55;
                        }
                    }
                    break;
                }
                v20 = fs.mc.field_1724;
                v21 /* !! */  = fs.nv;
                if (true) ** GOTO lbl159
                block56: while (true) {
                    v21 /* !! */  = (long)(v22 - fs.gzfq("gznr", gzjb(int ), (int)56));
lbl159:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1839053183: {
                            v22 = fs.gzfq("gzns", gzjb(int ), (int)57);
                            continue block56;
                        }
                        case 108156921: {
                            v22 = fs.gzfq("gznt", gzjb(int ), (int)58);
                            continue block56;
                        }
                        case 981049214: {
                            break block56;
                        }
                    }
                    break;
                }
                v23 = v20.method_7344();
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_5 = fs.nv - fs.gzfq("gznu", gzjb(int ), (int)59)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == fs.gzfq("gznv", gzfn(int ), (int)149)) break;
                    v24 /* !! */  = (long)fs.gzfq("gznw", gzfn(int ), (int)150);
                }
                if (v23.method_7586() <= fs.gzfq("gznx", gzfn(int ), (int)151)) break block65;
                if (var2_3) ** GOTO lbl21
                v25 = fs.gzfq("gzny", gzfn(int ), (int)152);
                if (var4_1) {
                    throw null;
                }
                break block66;
            }
            if (!var2_3 && !var2_3) ** break;
            ** while (true)
            v25 = fs.gzfq("gznz", gzfn(int ), (int)153);
        }
        return (boolean)v25;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private /* synthetic */ Boolean lambda$new$2() {
        boolean bl2;
        Object object = nv;
        boolean bl3 = true;
        block12: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - fs.gzfq("gzqj", gzjb(int ), (int)76);
            }
            switch ((int)object) {
                case -1687886277: {
                    callSite = fs.gzfq("gzqk", gzjb(int ), (int)77);
                    continue block12;
                }
                case 981049214: {
                    break block12;
                }
                case 1363976397: {
                    callSite = fs.gzfq("gzql", gzjb(int ), (int)78);
                    continue block12;
                }
                case 1475634614: {
                    callSite = fs.gzfq("gzqm", gzjb(int ), (int)79);
                    continue block12;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = nv - fs.gzfq("gzqn", gzjb(int ), (int)80)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == fs.gzfq("gzqo", gzfn(int ), (int)199)) break;
            object2 = fs.gzfq("gzqp", gzfn(int ), (int)200);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = nv - fs.gzfq("gzqq", gzjb(int ), (int)81)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == fs.gzfq("gzqr", gzfn(int ), (int)201)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = fs.gzfq("gzqs", gzfn(int ), (int)202);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object4 = nv;
        boolean bl5 = true;
        block15: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite - fs.gzfq("gzqt", gzjb(int ), (int)82);
            }
            switch ((int)object4) {
                case -819838598: {
                    callSite = fs.gzfq("gzqu", gzjb(int ), (int)83);
                    continue block15;
                }
                case 981049214: {
                    break block15;
                }
                case 1557031113: {
                    callSite = fs.gzfq("gzqv", gzjb(int ), (int)84);
                    continue block15;
                }
                case 1790613145: {
                    callSite = fs.gzfq("gzqw", gzjb(int ), (int)85);
                    continue block15;
                }
            }
            break;
        }
        while (true) {
            long l4;
            Object object5;
            if ((object5 = (l4 = nv - fs.gzfq("gzqx", gzjb(int ), (int)86)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object5 == fs.gzfq("gzqy", gzfn(int ), (int)203)) break;
            object5 = fs.gzfq("gzqz", gzfn(int ), (int)204);
        }
        boolean bl6 = this.mode.isSelected("Legit");
        while (true) {
            long l5;
            Object object6;
            if ((object6 = (l5 = nv - fs.gzfq("gzra", gzjb(int ), (int)87)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object6 == fs.gzfq("gzrb", gzfn(int ), (int)205)) {
                return bl6;
            }
            object6 = fs.gzfq("gzrc", gzfn(int ), (int)206);
        }
    }

    private static /* synthetic */ void gzsx() {
        fs.gzfo[0] = -1676450205;
        fs.gzfo[1] = -1400108579;
        fs.gzfo[2] = 1734871963;
        fs.gzfo[3] = 601622332;
        fs.gzfo[4] = 646733991;
        fs.gzfo[5] = -450557393;
        fs.gzfo[6] = -1814088850;
        fs.gzfo[7] = -271075898;
        fs.gzfo[8] = 1452207154;
        fs.gzfo[9] = 160813428;
        fs.gzfo[10] = -1048276640;
        fs.gzfo[11] = 1624457087;
        fs.gzfo[12] = -1066693336;
        fs.gzfo[13] = -683039604;
        fs.gzfo[14] = 1484030262;
        fs.gzfo[15] = -2019692945;
        fs.gzfo[16] = -1866349430;
        fs.gzfo[17] = -619332942;
        fs.gzfo[18] = 1349172709;
        fs.gzfo[19] = 1298853843;
        fs.gzfo[20] = 325206383;
        fs.gzfo[21] = -1663139384;
        fs.gzfo[22] = 385085981;
        fs.gzfo[23] = 2126881327;
        fs.gzfo[24] = -960462694;
        fs.gzfo[25] = -1537453095;
        fs.gzfo[26] = 247594819;
        fs.gzfo[27] = -1764239473;
        fs.gzfo[28] = -1311474241;
        fs.gzfo[29] = -889359804;
        fs.gzfo[30] = -2018622755;
        fs.gzfo[31] = 1214643744;
        fs.gzfo[32] = -1657578612;
        fs.gzfo[33] = 812407132;
        fs.gzfo[34] = 1709529569;
        fs.gzfo[35] = -1615829833;
        fs.gzfo[36] = -617601526;
        fs.gzfo[37] = 270451145;
        fs.gzfo[38] = -1670632740;
        fs.gzfo[39] = -1079505558;
        fs.gzfo[40] = -733736269;
        fs.gzfo[41] = 1203954648;
        fs.gzfo[42] = 1273378131;
        fs.gzfo[43] = 1356383600;
        fs.gzfo[44] = -1760566467;
        fs.gzfo[45] = 228970008;
        fs.gzfo[46] = 780234924;
        fs.gzfo[47] = 1347514990;
        fs.gzfo[48] = 473845371;
        fs.gzfo[49] = -1400445060;
        fs.gzfo[50] = -311674742;
        fs.gzfo[51] = -739325032;
        fs.gzfo[52] = -794193047;
        fs.gzfo[53] = -184947432;
        fs.gzfo[54] = -1082257638;
        fs.gzfo[55] = -822349187;
        fs.gzfo[56] = -1180394848;
        fs.gzfo[57] = -457571876;
        fs.gzfo[58] = -66832729;
        fs.gzfo[59] = -648044932;
        fs.gzfo[60] = 980044341;
        fs.gzfo[61] = 258319214;
        fs.gzfo[62] = 472869011;
        fs.gzfo[63] = 1539559354;
        fs.gzfo[64] = 482078444;
        fs.gzfo[65] = -213608346;
        fs.gzfo[66] = 2041588518;
        fs.gzfo[67] = 1737571708;
        fs.gzfo[68] = 467788068;
        fs.gzfo[69] = 1161177949;
        fs.gzfo[70] = 904105168;
        fs.gzfo[71] = 2037838725;
        fs.gzfo[72] = 1322239792;
        fs.gzfo[73] = -1577629797;
        fs.gzfo[74] = 1657423525;
        fs.gzfo[75] = -1278618886;
        fs.gzfo[76] = -1906304737;
        fs.gzfo[77] = 232082116;
        fs.gzfo[78] = 1377864850;
        fs.gzfo[79] = -91297361;
        fs.gzfo[80] = 1571867764;
        fs.gzfo[81] = 1742446709;
        fs.gzfo[82] = -410186901;
        fs.gzfo[83] = 817813061;
        fs.gzfo[84] = 384125236;
        fs.gzfo[85] = -271091221;
        fs.gzfo[86] = -985538978;
        fs.gzfo[87] = -2072008187;
        fs.gzfo[88] = 69448926;
        fs.gzfo[89] = 354721223;
        fs.gzfo[90] = 2145725609;
        fs.gzfo[91] = -184553442;
        fs.gzfo[92] = 2063669585;
        fs.gzfo[93] = 2002526699;
        fs.gzfo[94] = -1613122915;
        fs.gzfo[95] = -1677241942;
        fs.gzfo[96] = 623466077;
        fs.gzfo[97] = 920348030;
        fs.gzfo[98] = 1402082;
        fs.gzfo[99] = 1495590431;
    }

    static {
        gzfo = new int[229];
        gzfp = new int[229];
        fs.gzsx();
        fs.gzsy();
        fs.gzsz();
        fs.gzta();
        fs.gztb();
        fs.gztc();
        gzjc = new long[112];
        gzjd = new long[112];
        fs.gztd();
        fs.gzte();
        fs.gztf();
        fs.gztg();
    }

    private static /* synthetic */ int gzfn(int n2) {
        return gzfo[n2] ^ gzfp[n2];
    }

    private static /* synthetic */ void gztf() {
        fs.gzjd[0] = -4886391296535676926L;
        fs.gzjd[1] = -84872024874942778L;
        fs.gzjd[2] = -123672127877916185L;
        fs.gzjd[3] = -3986298294943534168L;
        fs.gzjd[4] = -1974611758696102611L;
        fs.gzjd[5] = 4807020140073810726L;
        fs.gzjd[6] = -6803503301240686898L;
        fs.gzjd[7] = 7524027582910369655L;
        fs.gzjd[8] = 8734523037420173567L;
        fs.gzjd[9] = -6140812129958210045L;
        fs.gzjd[10] = -7564238151841250202L;
        fs.gzjd[11] = -1521857415109164523L;
        fs.gzjd[12] = -671718716476750281L;
        fs.gzjd[13] = -7327246799757635111L;
        fs.gzjd[14] = 2670099191359399136L;
        fs.gzjd[15] = -3226231072785537392L;
        fs.gzjd[16] = -7190294266689156717L;
        fs.gzjd[17] = 7172327227338413575L;
        fs.gzjd[18] = -2924557416297551570L;
        fs.gzjd[19] = -5234177884577754510L;
        fs.gzjd[20] = -7952254693549771455L;
        fs.gzjd[21] = 9219120272184500362L;
        fs.gzjd[22] = 8734949121573445835L;
        fs.gzjd[23] = 1675599426902675753L;
        fs.gzjd[24] = 6946378157480493033L;
        fs.gzjd[25] = 2319568411045739082L;
        fs.gzjd[26] = -1570286091608228768L;
        fs.gzjd[27] = -2896892192848961115L;
        fs.gzjd[28] = 5463025428044933465L;
        fs.gzjd[29] = -4980402798016163847L;
        fs.gzjd[30] = 2022716990124188762L;
        fs.gzjd[31] = -3865551652643193700L;
        fs.gzjd[32] = 2395751361101154326L;
        fs.gzjd[33] = -8261403010987590347L;
        fs.gzjd[34] = 3744865951913822492L;
        fs.gzjd[35] = 2966530745212930772L;
        fs.gzjd[36] = -6820248866893770329L;
        fs.gzjd[37] = 8188135285502536428L;
        fs.gzjd[38] = -8910302744120518450L;
        fs.gzjd[39] = 3928476206180995724L;
        fs.gzjd[40] = 2773326378855149654L;
        fs.gzjd[41] = -4223904389151634147L;
        fs.gzjd[42] = 7230473130146015347L;
        fs.gzjd[43] = 3862687185524412299L;
        fs.gzjd[44] = -4129058031585314108L;
        fs.gzjd[45] = 2034335528099040647L;
        fs.gzjd[46] = 5213948117894398744L;
        fs.gzjd[47] = -4056882097935891332L;
        fs.gzjd[48] = 6836417921962121483L;
        fs.gzjd[49] = -235074633433714558L;
        fs.gzjd[50] = -1426248213297655035L;
        fs.gzjd[51] = -4310751442289784494L;
        fs.gzjd[52] = -1183412257865086799L;
        fs.gzjd[53] = 5673604002935649381L;
        fs.gzjd[54] = -4132685965430129700L;
        fs.gzjd[55] = -1505873268775886498L;
        fs.gzjd[56] = 1207151981497434374L;
        fs.gzjd[57] = -3390940827530365365L;
        fs.gzjd[58] = 8167810289603317349L;
        fs.gzjd[59] = -5455203465721995186L;
        fs.gzjd[60] = 5388199830164432842L;
        fs.gzjd[61] = 3186080686178049328L;
        fs.gzjd[62] = 6367095763227053447L;
        fs.gzjd[63] = 8380481322598370179L;
        fs.gzjd[64] = -8852260470130018799L;
        fs.gzjd[65] = -5667358603741760295L;
        fs.gzjd[66] = 917416918153740659L;
        fs.gzjd[67] = 4803347784970626531L;
        fs.gzjd[68] = 8069024617467485374L;
        fs.gzjd[69] = 5151887074314951063L;
        fs.gzjd[70] = -6742544135195528433L;
        fs.gzjd[71] = -3948401867054566992L;
        fs.gzjd[72] = -3011724140192283761L;
        fs.gzjd[73] = -6777677680614527019L;
        fs.gzjd[74] = 5387612260242635505L;
        fs.gzjd[75] = -7874320083105018154L;
        fs.gzjd[76] = 5810277181247972016L;
        fs.gzjd[77] = 5568316527730756093L;
        fs.gzjd[78] = -8149985892476701685L;
        fs.gzjd[79] = -6024914873120696808L;
        fs.gzjd[80] = 6560215124254578463L;
        fs.gzjd[81] = 7917595489033876724L;
        fs.gzjd[82] = -6363487611740074777L;
        fs.gzjd[83] = -481562781731437186L;
        fs.gzjd[84] = 347723402303740880L;
        fs.gzjd[85] = -4889443509073051614L;
        fs.gzjd[86] = 6160330684871856487L;
        fs.gzjd[87] = 7641052555526158307L;
        fs.gzjd[88] = 3436124992174060178L;
        fs.gzjd[89] = -4404676574836239355L;
        fs.gzjd[90] = 1896314977942074126L;
        fs.gzjd[91] = 8133288666205761510L;
        fs.gzjd[92] = -4187850221980499602L;
        fs.gzjd[93] = -2787755823929401769L;
        fs.gzjd[94] = 704653576337184130L;
        fs.gzjd[95] = 4177382007598399248L;
        fs.gzjd[96] = 5398343691871514825L;
        fs.gzjd[97] = -73007234066794865L;
        fs.gzjd[98] = 7877044589255105247L;
        fs.gzjd[99] = 7985998070706438054L;
    }

    private static /* synthetic */ void gztc() {
        fs.gzfp[200] = 803714997;
        fs.gzfp[201] = -611831924;
        fs.gzfp[202] = -529445026;
        fs.gzfp[203] = -1166148210;
        fs.gzfp[204] = 151744771;
        fs.gzfp[205] = -215602121;
        fs.gzfp[206] = 1988181956;
        fs.gzfp[207] = 329275981;
        fs.gzfp[208] = 790753763;
        fs.gzfp[209] = -1178701947;
        fs.gzfp[210] = 1634522231;
        fs.gzfp[211] = -1462307246;
        fs.gzfp[212] = 188843621;
        fs.gzfp[213] = -934167072;
        fs.gzfp[214] = -1201227767;
        fs.gzfp[215] = -1059880074;
        fs.gzfp[216] = 58436913;
        fs.gzfp[217] = 316612951;
        fs.gzfp[218] = 1960984438;
        fs.gzfp[219] = 2082996848;
        fs.gzfp[220] = -1428040578;
        fs.gzfp[221] = 2062429208;
        fs.gzfp[222] = -1175784331;
        fs.gzfp[223] = 1253390705;
        fs.gzfp[224] = 1399096610;
        fs.gzfp[225] = -899296830;
        fs.gzfp[226] = -681655613;
        fs.gzfp[227] = 1651406247;
        fs.gzfp[228] = 100596801;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean hasMovementInput() {
        v0 /* !! */  = fs.nv;
        if (true) ** GOTO lbl5
        block53: while (true) {
            v0 /* !! */  = (long)(v1 - fs.gzfq("gzje", gzjb(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1750940044: {
                    v1 = fs.gzfq("gzjf", gzjb(int ), (int)1);
                    continue block53;
                }
                case -1607057642: {
                    v1 = fs.gzfq("gzjg", gzjb(int ), (int)2);
                    continue block53;
                }
                case 613699035: {
                    v1 = fs.gzfq("gzjh", gzjb(int ), (int)3);
                    continue block53;
                }
                case 981049214: {
                    break block53;
                }
            }
            break;
        }
        var4_1 = fs.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fs.nv - fs.gzfq("gzji", gzjb(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fs.gzfq("gzjj", gzfn(int ), (int)88)) break;
            v2 /* !! */  = (long)fs.gzfq("gzjk", gzfn(int ), (int)89);
        }
        var3_2 /* !! */  = fs.b;
        v3 /* !! */  = fs.nv;
        if (true) ** GOTO lbl28
        block55: while (true) {
            v3 /* !! */  = (long)(v4 - fs.gzfq("gzjl", gzjb(int ), (int)5));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1222509569: {
                    v4 = fs.gzfq("gzjm", gzjb(int ), (int)6);
                    continue block55;
                }
                case 20798534: {
                    v4 = fs.gzfq("gzjn", gzjb(int ), (int)7);
                    continue block55;
                }
                case 656178918: {
                    v4 = fs.gzfq("gzjo", gzjb(int ), (int)8);
                    continue block55;
                }
                case 981049214: {
                    break block55;
                }
            }
            break;
        }
        var2_3 = fs.a;
        if (var4_1) {
            throw null;
lbl43:
            // 13 sources

            return (boolean)fs.gzfq("gzjp", gzfn(int ), (int)90);
        }
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3 || var2_3) ** GOTO lbl43
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = fs.nv - fs.gzfq("gzjq", gzjb(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == fs.gzfq("gzjr", gzfn(int ), (int)91)) break;
                    v5 /* !! */  = (long)fs.gzfq("gzjs", gzfn(int ), (int)92);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = fs.nv - fs.gzfq("gzjt", gzjb(int ), (int)10)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == fs.gzfq("gzju", gzfn(int ), (int)93)) break;
                    v6 /* !! */  = (long)fs.gzfq("gzjv", gzfn(int ), (int)94);
                }
                v7 = fs.mc.field_1724;
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = fs.nv - fs.gzfq("gzjw", gzjb(int ), (int)11)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == fs.gzfq("gzjx", gzfn(int ), (int)95)) break;
                    v8 /* !! */  = (long)fs.gzfq("gzjy", gzfn(int ), (int)96);
                }
                v9 = v7.field_3913;
                v10 /* !! */  = fs.nv;
                if (true) ** GOTO lbl70
                block60: while (true) {
                    v10 /* !! */  = (long)(v11 - fs.gzfq("gzjz", gzjb(int ), (int)12));
lbl70:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -2089484289: {
                            v11 = fs.gzfq("gzka", gzjb(int ), (int)13);
                            continue block60;
                        }
                        case -846529726: {
                            v11 = fs.gzfq("gzkb", gzjb(int ), (int)14);
                            continue block60;
                        }
                        case -664489561: {
                            v11 = fs.gzfq("gzkc", gzjb(int ), (int)15);
                            continue block60;
                        }
                        case 981049214: {
                            break block60;
                        }
                    }
                    break;
                }
                var1_4 = v9.field_54155;
                if (var2_3 || var2_3) ** GOTO lbl43
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = fs.nv - fs.gzfq("gzkd", gzjb(int ), (int)16)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == fs.gzfq("gzke", gzfn(int ), (int)97)) break;
                    v12 /* !! */  = (long)fs.gzfq("gzkf", gzfn(int ), (int)98);
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_5 = fs.nv - fs.gzfq("gzkg", gzjb(int ), (int)17)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == fs.gzfq("gzkh", gzfn(int ), (int)99)) break;
                    v13 /* !! */  = (long)fs.gzfq("gzki", gzfn(int ), (int)100);
                }
                if (!this.omnidirectional.isValue()) ** GOTO lbl136
                if (var2_3 || var2_3) ** GOTO lbl43
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_6 = fs.nv - fs.gzfq("gzkj", gzjb(int ), (int)18)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == fs.gzfq("gzkk", gzfn(int ), (int)101)) break;
                    v14 /* !! */  = (long)fs.gzfq("gzkl", gzfn(int ), (int)102);
                }
                if (var1_4.comp_3159()) ** GOTO lbl128
                if (var2_3) ** GOTO lbl43
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_7 = fs.nv - fs.gzfq("gzkm", gzjb(int ), (int)19)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == fs.gzfq("gzkn", gzfn(int ), (int)103)) break;
                    v15 /* !! */  = (long)fs.gzfq("gzko", gzfn(int ), (int)104);
                }
                if (var1_4.comp_3160()) ** GOTO lbl128
                if (var2_3) ** GOTO lbl43
                v16 /* !! */  = fs.nv;
                if (true) ** GOTO lbl114
                block65: while (true) {
                    v16 /* !! */  = (long)(fs.gzfq("gzkq", gzjb(int ), (int)21) - fs.gzfq("gzkp", gzjb(int ), (int)20));
lbl114:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1299069890: {
                            continue block65;
                        }
                        case 981049214: {
                            break block65;
                        }
                    }
                    break;
                }
                if (var1_4.comp_3161()) ** GOTO lbl128
                if (var2_3) ** GOTO lbl43
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_8 = fs.nv - fs.gzfq("gzkr", gzjb(int ), (int)22)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == fs.gzfq("gzks", gzfn(int ), (int)105)) break;
                    v17 /* !! */  = (long)fs.gzfq("gzkt", gzfn(int ), (int)106);
                }
                if (!var1_4.comp_3162()) ** GOTO lbl133
                if (var2_3) ** GOTO lbl43
lbl128:
                // 4 sources

                if (var2_3 || var2_3) ** GOTO lbl43
                v18 = fs.gzfq("gzku", gzfn(int ), (int)107);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl135
lbl133:
                // 1 sources

                if (var2_3 || var2_3) ** GOTO lbl43
                v18 = fs.gzfq("gzkv", gzfn(int ), (int)108);
lbl135:
                // 2 sources

                return (boolean)v18;
lbl136:
                // 1 sources

                if (var2_3 || var2_3) ** GOTO lbl43
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_9 = fs.nv - fs.gzfq("gzkw", gzjb(int ), (int)23)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == fs.gzfq("gzkx", gzfn(int ), (int)109)) break;
                    v19 /* !! */  = (long)fs.gzfq("gzky", gzfn(int ), (int)110);
                }
                if (!var1_4.comp_3159()) ** GOTO lbl163
                if (var2_3) ** GOTO lbl43
                v20 /* !! */  = fs.nv;
                if (true) ** GOTO lbl148
                block68: while (true) {
                    v20 /* !! */  = (long)(v21 - fs.gzfq("gzkz", gzjb(int ), (int)24));
lbl148:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -69192131: {
                            v21 = fs.gzfq("gzla", gzjb(int ), (int)25);
                            continue block68;
                        }
                        case 981049214: {
                            break block68;
                        }
                        case 1966315428: {
                            v21 = fs.gzfq("gzlb", gzjb(int ), (int)26);
                            continue block68;
                        }
                    }
                    break;
                }
                if (var1_4.comp_3160()) ** GOTO lbl163
                if (var2_3) ** GOTO lbl43
                v22 = fs.gzfq("gzlc", gzfn(int ), (int)111);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl166
lbl163:
                // 2 sources

                if (!var2_3 && !var2_3) ** break;
                ** continue;
                v22 = fs.gzfq("gzld", gzfn(int ), (int)112);
lbl166:
                // 2 sources

                return (boolean)v22;
            }
            case 0: {
                var3_2 /* !! */  = (int)fs.gzfq("gzle", gzfn(int ), (int)113);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl172:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)fs.gzfq("gzlf", gzfn(int ), (int)114);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl177:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)fs.gzfq("gzlg", gzfn(int ), (int)115);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl260
                    break;
                }
            }
            case 3: {
                var3_2 /* !! */  = (int)fs.gzfq("gzlh", gzfn(int ), (int)116);
                if (!var4_1) ** GOTO lbl177
                throw null;
            }
            case 4: {
                var3_2 /* !! */  = (int)fs.gzfq("gzli", gzfn(int ), (int)117);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl243
            }
lbl192:
            // 3 sources

            case 5: {
                var3_2 /* !! */  = (int)fs.gzfq("gzlj", gzfn(int ), (int)118);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl235
            }
lbl197:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)fs.gzfq("gzlk", gzfn(int ), (int)119);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl217
            }
            case 7: {
                do {
                    var3_2 /* !! */  = (int)fs.gzfq("gzll", gzfn(int ), (int)120);
                } while (!var4_1);
                throw null;
            }
lbl207:
            // 3 sources

            case 8: {
                var3_2 /* !! */  = (int)fs.gzfq("gzlm", gzfn(int ), (int)121);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl212:
            // 2 sources

            case 9: {
                var3_2 /* !! */  = (int)fs.gzfq("gzln", gzfn(int ), (int)122);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl243
            }
lbl217:
            // 3 sources

            case 10: {
                var3_2 /* !! */  = (int)fs.gzfq("gzlo", gzfn(int ), (int)123);
                if (!var4_1) ** GOTO lbl207
                throw null;
            }
            case 11: {
                var3_2 /* !! */  = (int)fs.gzfq("gzlp", gzfn(int ), (int)124);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl247
            }
            case 12: {
                var3_2 /* !! */  = (int)fs.gzfq("gzlq", gzfn(int ), (int)125);
                if (!var4_1) ** GOTO lbl192
                throw null;
            }
lbl230:
            // 2 sources

            case 13: {
                do {
                    var3_2 /* !! */  = (int)fs.gzfq("gzlr", gzfn(int ), (int)126);
                } while (!var4_1);
                throw null;
            }
lbl235:
            // 3 sources

            case 14: {
                var3_2 /* !! */  = (int)fs.gzfq("gzls", gzfn(int ), (int)127);
                if (!var4_1) break;
                throw null;
            }
            case 15: {
                var3_2 /* !! */  = (int)fs.gzfq("gzlt", gzfn(int ), (int)128);
                if (!var4_1) ** GOTO lbl207
                throw null;
            }
lbl243:
            // 3 sources

            case 16: {
                var3_2 /* !! */  = (int)fs.gzfq("gzlu", gzfn(int ), (int)129);
                if (!var4_1) ** GOTO lbl235
                throw null;
            }
lbl247:
            // 2 sources

            case 17: {
                var3_2 /* !! */  = (int)fs.gzfq("gzlv", gzfn(int ), (int)130);
                if (var4_1) {
                    throw null;
                }
            }
            case 18: {
                var3_2 /* !! */  = (int)fs.gzfq("gzlw", gzfn(int ), (int)131);
                if (!var4_1) ** GOTO lbl217
                throw null;
            }
lbl255:
            // 2 sources

            case 19: {
                do {
                    var3_2 /* !! */  = (int)fs.gzfq("gzlx", gzfn(int ), (int)132);
                } while (!var4_1);
                throw null;
            }
lbl260:
            // 2 sources

            case 20: {
                var3_2 /* !! */  = (int)fs.gzfq("gzly", gzfn(int ), (int)133);
                if (!var4_1) ** GOTO lbl172
                throw null;
            }
            case 21: {
                var3_2 /* !! */  = (int)fs.gzfq("gzlz", gzfn(int ), (int)134);
                if (!var4_1) ** GOTO lbl230
                throw null;
            }
            case 22: {
                var3_2 /* !! */  = (int)fs.gzfq("gzma", gzfn(int ), (int)135);
                if (!var4_1) ** GOTO lbl192
                throw null;
            }
            case 23: 
        }
        var3_2 /* !! */  = (int)fs.gzfq("gzmb", gzfn(int ), (int)136);
        ** while (!var4_1)
lbl275:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gztb() {
        fs.gzfp[100] = 1142617178;
        fs.gzfp[101] = 624000222;
        fs.gzfp[102] = 988266510;
        fs.gzfp[103] = -396520280;
        fs.gzfp[104] = 1225056913;
        fs.gzfp[105] = -1010637341;
        fs.gzfp[106] = -1666720604;
        fs.gzfp[107] = 537216218;
        fs.gzfp[108] = 1975459850;
        fs.gzfp[109] = -984795050;
        fs.gzfp[110] = 842745346;
        fs.gzfp[111] = 362169129;
        fs.gzfp[112] = -824407606;
        fs.gzfp[113] = -1270688921;
        fs.gzfp[114] = -1942621161;
        fs.gzfp[115] = -1061618786;
        fs.gzfp[116] = -220856379;
        fs.gzfp[117] = -1889085522;
        fs.gzfp[118] = 823269706;
        fs.gzfp[119] = 325014858;
        fs.gzfp[120] = 906316569;
        fs.gzfp[121] = -235332690;
        fs.gzfp[122] = -1176120374;
        fs.gzfp[123] = 529844068;
        fs.gzfp[124] = -1013369915;
        fs.gzfp[125] = -273866402;
        fs.gzfp[126] = 619879461;
        fs.gzfp[127] = 1441840623;
        fs.gzfp[128] = -1325456212;
        fs.gzfp[129] = -114960541;
        fs.gzfp[130] = -1994414845;
        fs.gzfp[131] = -1707798194;
        fs.gzfp[132] = -1187312232;
        fs.gzfp[133] = 1763732678;
        fs.gzfp[134] = -312887598;
        fs.gzfp[135] = -912006371;
        fs.gzfp[136] = -11738751;
        fs.gzfp[137] = 68547645;
        fs.gzfp[138] = -260492019;
        fs.gzfp[139] = -405288911;
        fs.gzfp[140] = -660684454;
        fs.gzfp[141] = -1176163928;
        fs.gzfp[142] = 219860731;
        fs.gzfp[143] = -1529268584;
        fs.gzfp[144] = -1421547869;
        fs.gzfp[145] = 861207269;
        fs.gzfp[146] = -1140980503;
        fs.gzfp[147] = 1846613688;
        fs.gzfp[148] = -1587633568;
        fs.gzfp[149] = 539856443;
        fs.gzfp[150] = 816035632;
        fs.gzfp[151] = -1481085238;
        fs.gzfp[152] = 511707775;
        fs.gzfp[153] = 1119987837;
        fs.gzfp[154] = -832219367;
        fs.gzfp[155] = -1429848050;
        fs.gzfp[156] = 1986109200;
        fs.gzfp[157] = 1392322215;
        fs.gzfp[158] = 1249079834;
        fs.gzfp[159] = 1413680681;
        fs.gzfp[160] = 714946226;
        fs.gzfp[161] = -1976863318;
        fs.gzfp[162] = 2110114932;
        fs.gzfp[163] = 23560801;
        fs.gzfp[164] = -1246864840;
        fs.gzfp[165] = 205145744;
        fs.gzfp[166] = 1655521012;
        fs.gzfp[167] = 463144757;
        fs.gzfp[168] = 201292409;
        fs.gzfp[169] = 495497864;
        fs.gzfp[170] = -1293939849;
        fs.gzfp[171] = -648913779;
        fs.gzfp[172] = 1808122489;
        fs.gzfp[173] = 326896706;
        fs.gzfp[174] = -598182479;
        fs.gzfp[175] = -1904217475;
        fs.gzfp[176] = 1014866985;
        fs.gzfp[177] = 1694982512;
        fs.gzfp[178] = 195708082;
        fs.gzfp[179] = 1375450117;
        fs.gzfp[180] = 1452993600;
        fs.gzfp[181] = 990376779;
        fs.gzfp[182] = -1183152311;
        fs.gzfp[183] = -118351524;
        fs.gzfp[184] = 20184492;
        fs.gzfp[185] = -1274216861;
        fs.gzfp[186] = -1055389057;
        fs.gzfp[187] = 2106390644;
        fs.gzfp[188] = -1997252927;
        fs.gzfp[189] = 1330233811;
        fs.gzfp[190] = -730839715;
        fs.gzfp[191] = -1215748831;
        fs.gzfp[192] = -265234019;
        fs.gzfp[193] = -836368350;
        fs.gzfp[194] = -52109653;
        fs.gzfp[195] = 228883566;
        fs.gzfp[196] = -948907144;
        fs.gzfp[197] = -1892266790;
        fs.gzfp[198] = 2106267957;
        fs.gzfp[199] = -1873867852;
    }

    private static /* synthetic */ long gzjb(int n2) {
        return gzjc[n2] ^ gzjd[n2];
    }
}

