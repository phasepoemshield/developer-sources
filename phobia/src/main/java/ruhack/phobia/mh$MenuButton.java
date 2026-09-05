/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_332;
import ruhack.phobia.ki;
import ruhack.phobia.kq;
import ruhack.phobia.kv;
import ruhack.phobia.mh;
import ruhack.phobia.mh$Action;
import ruhack.phobia.nd;

final class mh$MenuButton {
    static final long pz = -1214238475869816391L;
    float hover;
    private static int[] inlg;
    public static final boolean a;
    final String icon;
    public static final int b;
    private static long[] inlp;
    final mh$Action action;
    private static long[] inlq;
    final String label;
    float width;
    private static int[] inlf;
    float height;
    float y;
    float x;
    public static final boolean c;

    static {
        inlf = new int[134];
        inlg = new int[134];
        mh$MenuButton.inrs();
        mh$MenuButton.inrt();
        mh$MenuButton.inru();
        mh$MenuButton.inrv();
        inlp = new long[28];
        inlq = new long[28];
        mh$MenuButton.inrw();
        mh$MenuButton.inrx();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void setBounds(float var1_1, float var2_2, float var3_3, float var4_4) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mh$MenuButton.pz - mh$MenuButton.inlh("inlr", inlo(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == mh$MenuButton.inlh("inls", inle(int ), (int)6)) break;
            v0 /* !! */  = (long)mh$MenuButton.inlh("inlt", inle(int ), (int)7);
        }
        var7_5 = mh$MenuButton.c;
        v1 /* !! */  = mh$MenuButton.pz;
        if (true) ** GOTO lbl11
        block26: while (true) {
            v1 /* !! */  = (long)(v2 - mh$MenuButton.inlh("inlu", inlo(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -617917208: {
                    v2 = mh$MenuButton.inlh("inlv", inlo(int ), (int)2);
                    continue block26;
                }
                case -98606789: {
                    v2 = mh$MenuButton.inlh("inlw", inlo(int ), (int)3);
                    continue block26;
                }
                case 489355705: {
                    break block26;
                }
            }
            break;
        }
        var6_6 /* !! */  = mh$MenuButton.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mh$MenuButton.pz - mh$MenuButton.inlh("inlx", inlo(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == mh$MenuButton.inlh("inly", inle(int ), (int)8)) break;
            v3 /* !! */  = (long)mh$MenuButton.inlh("inlz", inle(int ), (int)9);
        }
        var5_7 = mh$MenuButton.a;
        if (var7_5) {
            throw null;
lbl29:
            // 6 sources

            return;
        }
        if (var5_7 || var5_7) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = mh$MenuButton.pz - mh$MenuButton.inlh("inma", inlo(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == mh$MenuButton.inlh("inmb", inle(int ), (int)10)) break;
            v4 /* !! */  = (long)mh$MenuButton.inlh("inmc", inle(int ), (int)11);
        }
        this.x = var1_1;
        if (var5_7) ** GOTO lbl29
        if (var6_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_7) ** GOTO lbl29
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = mh$MenuButton.pz - mh$MenuButton.inlh("inmd", inlo(int ), (int)6)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == mh$MenuButton.inlh("inme", inle(int ), (int)12)) break;
                    v5 /* !! */  = (long)mh$MenuButton.inlh("inmf", inle(int ), (int)13);
                }
                this.y = var2_2;
                if (var5_7 || var5_7) ** GOTO lbl29
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = mh$MenuButton.pz - mh$MenuButton.inlh("inmg", inlo(int ), (int)7)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == mh$MenuButton.inlh("inmh", inle(int ), (int)14)) break;
                    v6 /* !! */  = (long)mh$MenuButton.inlh("inmi", inle(int ), (int)15);
                }
                this.width = var3_3;
                if (var5_7 || var5_7) ** GOTO lbl29
                v7 /* !! */  = mh$MenuButton.pz;
                if (true) ** GOTO lbl61
                block32: while (true) {
                    v7 /* !! */  = (long)(v8 - mh$MenuButton.inlh("inmj", inlo(int ), (int)8));
lbl61:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1206833758: {
                            v8 = mh$MenuButton.inlh("inmk", inlo(int ), (int)9);
                            continue block32;
                        }
                        case -559343246: {
                            v8 = mh$MenuButton.inlh("inml", inlo(int ), (int)10);
                            continue block32;
                        }
                        case 489355705: {
                            break block32;
                        }
                        case 1489783995: {
                            v8 = mh$MenuButton.inlh("inmm", inlo(int ), (int)11);
                            continue block32;
                        }
                    }
                    break;
                }
                this.height = var4_4;
                if (!var5_7 && !var5_7) ** break;
                ** continue;
                return;
            }
            case 0: {
                var6_6 /* !! */  = (int)mh$MenuButton.inlh("inmn", inle(int ), (int)16);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl106
            }
lbl82:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_6 /* !! */  = (int)mh$MenuButton.inlh("inmo", inle(int ), (int)17);
                    if (var7_5) {
                        throw null;
                    }
                    ** GOTO lbl115
                    break;
                }
            }
lbl88:
            // 2 sources

            case 2: {
                var6_6 /* !! */  = (int)mh$MenuButton.inlh("inmp", inle(int ), (int)18);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl93:
            // 2 sources

            case 3: {
                do {
                    var6_6 /* !! */  = (int)mh$MenuButton.inlh("inmq", inle(int ), (int)19);
                } while (!var7_5);
                throw null;
            }
lbl98:
            // 3 sources

            case 4: {
                var6_6 /* !! */  = (int)mh$MenuButton.inlh("inmr", inle(int ), (int)20);
                if (!var7_5) ** GOTO lbl93
                throw null;
            }
            case 5: {
                var6_6 /* !! */  = (int)mh$MenuButton.inlh("inms", inle(int ), (int)21);
                if (!var7_5) ** GOTO lbl98
                throw null;
            }
lbl106:
            // 2 sources

            case 6: {
                var6_6 /* !! */  = (int)mh$MenuButton.inlh("inmt", inle(int ), (int)22);
                if (!var7_5) ** GOTO lbl98
                throw null;
            }
lbl110:
            // 2 sources

            case 7: {
                var6_6 /* !! */  = (int)mh$MenuButton.inlh("inmu", inle(int ), (int)23);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl115:
            // 2 sources

            case 8: {
                var6_6 /* !! */  = (int)mh$MenuButton.inlh("inmv", inle(int ), (int)24);
                if (!var7_5) ** GOTO lbl82
                throw null;
            }
            case 9: {
                var6_6 /* !! */  = (int)mh$MenuButton.inlh("inmw", inle(int ), (int)25);
                if (!var7_5) ** GOTO lbl88
                throw null;
            }
lbl123:
            // 3 sources

            case 10: {
                var6_6 /* !! */  = (int)mh$MenuButton.inlh("inmx", inle(int ), (int)26);
                if (!var7_5) ** GOTO lbl110
                throw null;
            }
            case 11: 
        }
        var6_6 /* !! */  = (int)mh$MenuButton.inlh("inmy", inle(int ), (int)27);
        ** while (!var7_5)
lbl130:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    boolean contains(float var1_1, float var2_2) {
        block60: {
            v0 /* !! */  = mh$MenuButton.pz;
            if (true) ** GOTO lbl5
            block35: while (true) {
                v0 /* !! */  = (long)(mh$MenuButton.inlh("inna", inlo(int ), (int)13) - mh$MenuButton.inlh("inmz", inlo(int ), (int)12));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1205453266: {
                        continue block35;
                    }
                    case 489355705: {
                        break block35;
                    }
                }
                break;
            }
            var5_3 = mh$MenuButton.c;
            v1 /* !! */  = mh$MenuButton.pz;
            if (true) ** GOTO lbl15
            block36: while (true) {
                v1 /* !! */  = (long)(mh$MenuButton.inlh("innc", inlo(int ), (int)15) - mh$MenuButton.inlh("innb", inlo(int ), (int)14));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1875177587: {
                        continue block36;
                    }
                    case 489355705: {
                        break block36;
                    }
                }
                break;
            }
            var4_4 /* !! */  = mh$MenuButton.b;
            v2 /* !! */  = mh$MenuButton.pz;
            if (true) ** GOTO lbl25
            block37: while (true) {
                v2 /* !! */  = (long)(v3 - mh$MenuButton.inlh("innd", inlo(int ), (int)16));
lbl25:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -2051624878: {
                        v3 = mh$MenuButton.inlh("inne", inlo(int ), (int)17);
                        continue block37;
                    }
                    case 489355705: {
                        break block37;
                    }
                    case 1946711051: {
                        v3 = mh$MenuButton.inlh("innf", inlo(int ), (int)18);
                        continue block37;
                    }
                    case 1988777205: {
                        v3 = mh$MenuButton.inlh("inng", inlo(int ), (int)19);
                        continue block37;
                    }
                }
                break;
            }
            var3_5 = mh$MenuButton.a;
            if (var5_3) {
                throw null;
lbl40:
                // 6 sources

                return (boolean)mh$MenuButton.inlh("innh", inle(int ), (int)28);
            }
            if (var3_5 || var3_5) ** GOTO lbl40
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_0 = mh$MenuButton.pz - mh$MenuButton.inlh("inni", inlo(int ), (int)20)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == mh$MenuButton.inlh("innj", inle(int ), (int)29)) break;
                v4 /* !! */  = (long)mh$MenuButton.inlh("innk", inle(int ), (int)30);
            }
            if (!(var1_1 >= this.x)) break block60;
            if (var3_5) ** GOTO lbl40
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = mh$MenuButton.pz - mh$MenuButton.inlh("innl", inlo(int ), (int)21)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == mh$MenuButton.inlh("innm", inle(int ), (int)31)) break;
                v5 /* !! */  = (long)mh$MenuButton.inlh("innn", inle(int ), (int)32);
            }
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_2 = mh$MenuButton.pz - mh$MenuButton.inlh("inno", inlo(int ), (int)22)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v6 /* !! */  == mh$MenuButton.inlh("innp", inle(int ), (int)33)) break;
                v6 /* !! */  = (long)mh$MenuButton.inlh("innq", inle(int ), (int)34);
            }
            if (!(var1_1 <= this.x + this.width)) break block60;
            if (var3_5) ** GOTO lbl40
            v7 /* !! */  = mh$MenuButton.pz;
            if (true) ** GOTO lbl69
            block42: while (true) {
                v7 /* !! */  = (long)(mh$MenuButton.inlh("inns", inlo(int ), (int)24) - mh$MenuButton.inlh("innr", inlo(int ), (int)23));
lbl69:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case 23904110: {
                        continue block42;
                    }
                    case 489355705: {
                        break block42;
                    }
                }
                break;
            }
            if (!(var2_2 >= this.y)) break block60;
            if (var3_5) ** GOTO lbl40
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = mh$MenuButton.pz - mh$MenuButton.inlh("innt", inlo(int ), (int)25)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v8 /* !! */  == mh$MenuButton.inlh("innu", inle(int ), (int)35)) break;
                v8 /* !! */  = (long)mh$MenuButton.inlh("innv", inle(int ), (int)36);
            }
            v9 /* !! */  = mh$MenuButton.pz;
            if (true) ** GOTO lbl86
            block44: while (true) {
                v9 /* !! */  = (long)(mh$MenuButton.inlh("innx", inlo(int ), (int)27) - mh$MenuButton.inlh("innw", inlo(int ), (int)26));
lbl86:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case 489355705: {
                        break block44;
                    }
                    case 1428879715: {
                        continue block44;
                    }
                }
                break;
            }
            if (!(var2_2 <= this.y + this.height)) break block60;
            if (var3_5) ** GOTO lbl40
            v10 = mh$MenuButton.inlh("inny", inle(int ), (int)37);
            if (var5_3) {
                throw null;
            }
            ** GOTO lbl104
        }
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var3_5 && !var3_5) ** break;
                ** continue;
                v10 = mh$MenuButton.inlh("innz", inle(int ), (int)38);
lbl104:
                // 2 sources

                return (boolean)v10;
            }
lbl105:
            // 2 sources

            case 0: {
                var4_4 /* !! */  = (int)mh$MenuButton.inlh("inoa", inle(int ), (int)39);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl110:
            // 2 sources

            case 1: {
                var4_4 /* !! */  = (int)mh$MenuButton.inlh("inob", inle(int ), (int)40);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl115:
            // 3 sources

            case 2: {
                var4_4 /* !! */  = (int)mh$MenuButton.inlh("inoc", inle(int ), (int)41);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl125
            }
            case 3: {
                var4_4 /* !! */  = (int)mh$MenuButton.inlh("inod", inle(int ), (int)42);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl125:
            // 5 sources

            case 4: {
                var4_4 /* !! */  = (int)mh$MenuButton.inlh("inoe", inle(int ), (int)43);
                if (!var5_3) ** GOTO lbl105
                throw null;
            }
            case 5: {
                var4_4 /* !! */  = (int)mh$MenuButton.inlh("inof", inle(int ), (int)44);
                if (!var5_3) ** GOTO lbl125
                throw null;
            }
            case 6: {
                var4_4 /* !! */  = (int)mh$MenuButton.inlh("inog", inle(int ), (int)45);
                if (!var5_3) ** GOTO lbl115
                throw null;
            }
            case 7: {
                var4_4 /* !! */  = (int)mh$MenuButton.inlh("inoh", inle(int ), (int)46);
                if (!var5_3) ** GOTO lbl125
                throw null;
            }
lbl141:
            // 3 sources

            case 8: {
                var4_4 /* !! */  = (int)mh$MenuButton.inlh("inoi", inle(int ), (int)47);
                if (!var5_3) ** GOTO lbl125
                throw null;
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)mh$MenuButton.inlh("inoj", inle(int ), (int)48);
                    if (!var5_3) ** GOTO lbl110
                    throw null;
                }
            }
            case 10: 
        }
        var4_4 /* !! */  = (int)mh$MenuButton.inlh("inok", inle(int ), (int)49);
        ** while (!var5_3)
lbl153:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float inol(int n2) {
        return Float.intBitsToFloat(inlf[n2] ^ inlg[n2]);
    }

    private static /* synthetic */ void inrs() {
        mh$MenuButton.inlf[0] = 2034295200;
        mh$MenuButton.inlf[1] = 2068863080;
        mh$MenuButton.inlf[2] = -948425485;
        mh$MenuButton.inlf[3] = -1888181743;
        mh$MenuButton.inlf[4] = 1004620651;
        mh$MenuButton.inlf[5] = 1628989672;
        mh$MenuButton.inlf[6] = 789841221;
        mh$MenuButton.inlf[7] = -1170347541;
        mh$MenuButton.inlf[8] = -1897844467;
        mh$MenuButton.inlf[9] = 987198704;
        mh$MenuButton.inlf[10] = -767261828;
        mh$MenuButton.inlf[11] = -940823873;
        mh$MenuButton.inlf[12] = -1604568424;
        mh$MenuButton.inlf[13] = 400864588;
        mh$MenuButton.inlf[14] = 1129494806;
        mh$MenuButton.inlf[15] = 637386682;
        mh$MenuButton.inlf[16] = 1933697546;
        mh$MenuButton.inlf[17] = -1867841868;
        mh$MenuButton.inlf[18] = 1301424701;
        mh$MenuButton.inlf[19] = 1588679047;
        mh$MenuButton.inlf[20] = 1121342363;
        mh$MenuButton.inlf[21] = -1986290065;
        mh$MenuButton.inlf[22] = -1916729599;
        mh$MenuButton.inlf[23] = -83059758;
        mh$MenuButton.inlf[24] = 352928775;
        mh$MenuButton.inlf[25] = -895383585;
        mh$MenuButton.inlf[26] = -136595133;
        mh$MenuButton.inlf[27] = -1121284715;
        mh$MenuButton.inlf[28] = -571611486;
        mh$MenuButton.inlf[29] = -1647452159;
        mh$MenuButton.inlf[30] = 784229207;
        mh$MenuButton.inlf[31] = -1458216012;
        mh$MenuButton.inlf[32] = 791241447;
        mh$MenuButton.inlf[33] = -1668230995;
        mh$MenuButton.inlf[34] = 40706010;
        mh$MenuButton.inlf[35] = -817587674;
        mh$MenuButton.inlf[36] = 264957717;
        mh$MenuButton.inlf[37] = -153694006;
        mh$MenuButton.inlf[38] = 83815337;
        mh$MenuButton.inlf[39] = -1881568562;
        mh$MenuButton.inlf[40] = -550360524;
        mh$MenuButton.inlf[41] = 573546351;
        mh$MenuButton.inlf[42] = 1767060773;
        mh$MenuButton.inlf[43] = -1389470005;
        mh$MenuButton.inlf[44] = -1333852148;
        mh$MenuButton.inlf[45] = -542271702;
        mh$MenuButton.inlf[46] = -93441684;
        mh$MenuButton.inlf[47] = -1441208028;
        mh$MenuButton.inlf[48] = 569733634;
        mh$MenuButton.inlf[49] = -406002052;
        mh$MenuButton.inlf[50] = 1243368151;
        mh$MenuButton.inlf[51] = 615944377;
        mh$MenuButton.inlf[52] = 854887266;
        mh$MenuButton.inlf[53] = -43096025;
        mh$MenuButton.inlf[54] = -1060177046;
        mh$MenuButton.inlf[55] = 232060380;
        mh$MenuButton.inlf[56] = -488470992;
        mh$MenuButton.inlf[57] = 2122231245;
        mh$MenuButton.inlf[58] = 579579090;
        mh$MenuButton.inlf[59] = 1034352764;
        mh$MenuButton.inlf[60] = -318457182;
        mh$MenuButton.inlf[61] = 1967165307;
        mh$MenuButton.inlf[62] = 1009806849;
        mh$MenuButton.inlf[63] = 676790746;
        mh$MenuButton.inlf[64] = -1905351306;
        mh$MenuButton.inlf[65] = 997550528;
        mh$MenuButton.inlf[66] = -390533070;
        mh$MenuButton.inlf[67] = -2064628051;
        mh$MenuButton.inlf[68] = 1120095033;
        mh$MenuButton.inlf[69] = 1362846747;
        mh$MenuButton.inlf[70] = 946356000;
        mh$MenuButton.inlf[71] = -596562920;
        mh$MenuButton.inlf[72] = -1354257774;
        mh$MenuButton.inlf[73] = -1046712807;
        mh$MenuButton.inlf[74] = -2145230141;
        mh$MenuButton.inlf[75] = -1196583511;
        mh$MenuButton.inlf[76] = -1996736603;
        mh$MenuButton.inlf[77] = -1970351878;
        mh$MenuButton.inlf[78] = -2081904746;
        mh$MenuButton.inlf[79] = -856150813;
        mh$MenuButton.inlf[80] = 492736922;
        mh$MenuButton.inlf[81] = 609385404;
        mh$MenuButton.inlf[82] = -2103112742;
        mh$MenuButton.inlf[83] = -244429267;
        mh$MenuButton.inlf[84] = -1055659689;
        mh$MenuButton.inlf[85] = -2028704450;
        mh$MenuButton.inlf[86] = -1391789698;
        mh$MenuButton.inlf[87] = 1611781163;
        mh$MenuButton.inlf[88] = -1630549754;
        mh$MenuButton.inlf[89] = -1502354983;
        mh$MenuButton.inlf[90] = 1138232349;
        mh$MenuButton.inlf[91] = -1812479391;
        mh$MenuButton.inlf[92] = -636341102;
        mh$MenuButton.inlf[93] = -1977932503;
        mh$MenuButton.inlf[94] = -937406665;
        mh$MenuButton.inlf[95] = -1196184508;
        mh$MenuButton.inlf[96] = 1687377084;
        mh$MenuButton.inlf[97] = -732418160;
        mh$MenuButton.inlf[98] = 2091350775;
        mh$MenuButton.inlf[99] = 311661002;
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    mh$MenuButton(mh$Action mh$Action, String string, String string2) {
        int n2 = b;
        this.action = mh$Action;
        this.label = string;
        this.icon = string2;
        if (n2 == 0) return;
        int n3 = Integer.MIN_VALUE;
        block8: do {
            switch (n3 == Integer.MIN_VALUE ? n2 : n3) {
                default: {
                    return;
                }
                case 1: {
                    CallSite callSite = mh$MenuButton.inlh("inlj", inle(int ), (int)1);
                    n3 = 0;
                    continue block8;
                }
                case 2: {
                    CallSite callSite = mh$MenuButton.inlh("inlk", inle(int ), (int)2);
                }
                case 0: {
                    CallSite callSite = mh$MenuButton.inlh("inli", inle(int ), (int)0);
                    n3 = 4;
                    continue block8;
                }
                case 3: {
                    break;
                }
                case 4: {
                    while (true) {
                        CallSite callSite = mh$MenuButton.inlh("inlm", inle(int ), (int)4);
                    }
                }
                case 5: {
                    CallSite callSite = mh$MenuButton.inlh("inln", inle(int ), (int)5);
                }
            }
            break;
        } while (true);
        while (true) {
            CallSite callSite = mh$MenuButton.inlh("inll", inle(int ), (int)3);
        }
    }

    private static /* synthetic */ void inrv() {
        mh$MenuButton.inlg[100] = -1209917122;
        mh$MenuButton.inlg[101] = 314536531;
        mh$MenuButton.inlg[102] = 907896880;
        mh$MenuButton.inlg[103] = 47657621;
        mh$MenuButton.inlg[104] = 1109311389;
        mh$MenuButton.inlg[105] = -207260763;
        mh$MenuButton.inlg[106] = -289962249;
        mh$MenuButton.inlg[107] = 607788723;
        mh$MenuButton.inlg[108] = -1911519559;
        mh$MenuButton.inlg[109] = 1222779941;
        mh$MenuButton.inlg[110] = 2129292736;
        mh$MenuButton.inlg[111] = -740817155;
        mh$MenuButton.inlg[112] = 1583538117;
        mh$MenuButton.inlg[113] = 437980210;
        mh$MenuButton.inlg[114] = -844900507;
        mh$MenuButton.inlg[115] = 887558624;
        mh$MenuButton.inlg[116] = -925665896;
        mh$MenuButton.inlg[117] = 218085497;
        mh$MenuButton.inlg[118] = 529965458;
        mh$MenuButton.inlg[119] = 1128020066;
        mh$MenuButton.inlg[120] = 1003448152;
        mh$MenuButton.inlg[121] = -625604454;
        mh$MenuButton.inlg[122] = 472883351;
        mh$MenuButton.inlg[123] = 88731493;
        mh$MenuButton.inlg[124] = -1767607691;
        mh$MenuButton.inlg[125] = 225068043;
        mh$MenuButton.inlg[126] = -253535106;
        mh$MenuButton.inlg[127] = 311009580;
        mh$MenuButton.inlg[128] = -1522120743;
        mh$MenuButton.inlg[129] = -1580132035;
        mh$MenuButton.inlg[130] = 1307708256;
        mh$MenuButton.inlg[131] = -482034914;
        mh$MenuButton.inlg[132] = 1677164637;
        mh$MenuButton.inlg[133] = -1800934660;
    }

    public static /* synthetic */ CallSite inlh(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void inrx() {
        mh$MenuButton.inlq[0] = -478500939915255258L;
        mh$MenuButton.inlq[1] = -2761201478004085122L;
        mh$MenuButton.inlq[2] = -8121229806301738327L;
        mh$MenuButton.inlq[3] = -1494483970313055608L;
        mh$MenuButton.inlq[4] = -4758442480895465852L;
        mh$MenuButton.inlq[5] = 5364830341457836078L;
        mh$MenuButton.inlq[6] = 2105581916032424621L;
        mh$MenuButton.inlq[7] = -8608264365097070394L;
        mh$MenuButton.inlq[8] = -3025997958761129313L;
        mh$MenuButton.inlq[9] = 3089134387768421950L;
        mh$MenuButton.inlq[10] = 5694157034277994918L;
        mh$MenuButton.inlq[11] = -3256365949379724908L;
        mh$MenuButton.inlq[12] = 4573924848178186627L;
        mh$MenuButton.inlq[13] = 4596152701158710469L;
        mh$MenuButton.inlq[14] = -2293230363997745087L;
        mh$MenuButton.inlq[15] = 5353772843074668036L;
        mh$MenuButton.inlq[16] = -1325663756262232868L;
        mh$MenuButton.inlq[17] = -8634071097035134311L;
        mh$MenuButton.inlq[18] = 8531919263949015966L;
        mh$MenuButton.inlq[19] = -3668756995471111498L;
        mh$MenuButton.inlq[20] = 2930438411751800050L;
        mh$MenuButton.inlq[21] = 6062152807376015295L;
        mh$MenuButton.inlq[22] = -5317858665363733258L;
        mh$MenuButton.inlq[23] = 5417440592090929146L;
        mh$MenuButton.inlq[24] = -6806134567292290777L;
        mh$MenuButton.inlq[25] = -3035183780163676407L;
        mh$MenuButton.inlq[26] = 3271935791789289354L;
        mh$MenuButton.inlq[27] = 4764007429032207779L;
    }

    private static /* synthetic */ long inlo(int n2) {
        return inlp[n2] ^ inlq[n2];
    }

    private static /* synthetic */ int inle(int n2) {
        return inlf[n2] ^ inlg[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    void render(class_332 var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
        block133: {
            var15_6 = mh$MenuButton.c;
            var14_7 /* !! */  = mh$MenuButton.b;
            var13_8 = mh$MenuButton.a;
            if (var15_6) {
                throw null;
            }
            if (var13_8 || var13_8) return;
            if (this.contains(var2_2, var3_3)) {
                if (var13_8) return;
                v0 = 1.0f;
                if (var15_6) {
                    throw null;
                }
            } else {
                if (var13_8 || var13_8) return;
                v0 = var6_9 = 0.0f;
            }
            if (var13_8 || var13_8) return;
            this.hover += (var6_9 - this.hover) * Math.min(1.0f, var4_4 * mh$MenuButton.inlh("inom", inol(int ), (int)50));
            if (var13_8 || var13_8) return;
            var7_10 = this.y - this.hover * mh$MenuButton.inlh("inon", inol(int ), (int)51);
            if (var13_8 || var13_8) return;
            ki.blur(var1_1, this.x, var7_10, this.width, this.height, (float)mh$MenuButton.inlh("inoo", inol(int ), (int)52), (float)mh$MenuButton.inlh("inop", inol(int ), (int)53), (boolean)mh$MenuButton.inlh("inoq", inle(int ), (int)54));
            if (var13_8 || var13_8) return;
            ki.rect(var1_1, this.x, var7_10, this.width, this.height, (float)mh$MenuButton.inlh("inor", inol(int ), (int)55), nd.rgba((int)mh$MenuButton.inlh("inos", inle(int ), (int)56), (int)mh$MenuButton.inlh("inot", inle(int ), (int)57), (int)mh$MenuButton.inlh("inou", inle(int ), (int)58), Math.round((float)((mh$MenuButton.inlh("inov", inol(int ), (int)59) + this.hover * mh$MenuButton.inlh("inow", inol(int ), (int)60)) * var5_5))), (boolean)mh$MenuButton.inlh("inox", inle(int ), (int)61));
            if (var13_8 || var13_8) return;
            if (this.hover > mh$MenuButton.inlh("inoy", inol(int ), (int)62)) {
                if (var13_8) return;
                v1 = mh.ACCENT;
                if (var15_6) {
                    throw null;
                }
            } else {
                if (var13_8 || var13_8) return;
                v1 = mh.TEXT;
            }
            var8_11 = nd.multAlpha(v1, var5_5);
            if (var13_8 || var13_8) return;
            if (kv.ICONS == null) ** GOTO lbl65
            if (var13_8) return;
            if (this.icon.isEmpty()) ** GOTO lbl65
            if (var13_8 || var13_8) return;
            var9_12 = mh$MenuButton.inlh("inoz", inol(int ), (int)63);
            if (var13_8 || var13_8) return;
            var10_14 = var7_10 + (this.height - kq.height(kv.ICONS, (float)var9_12)) * mh$MenuButton.inlh("inpa", inol(int ), (int)64);
            if (var13_8 || var13_8) return;
            if (this.label.isEmpty()) {
                if (var13_8 || var13_8) return;
                mh.centered(var1_1, kv.ICONS, this.icon, this.x + this.width * mh$MenuButton.inlh("inpb", inol(int ), (int)65), var10_14, (float)var9_12, var8_11);
                if (var13_8 || var13_8) return;
                return;
            }
            if (var13_8 || var13_8) return;
            var11_16 = mh$MenuButton.inlh("inpc", inol(int ), (int)66);
            if (var13_8 || var13_8) return;
            var12_18 = this.x + mh$MenuButton.inlh("inpd", inol(int ), (int)67);
            if (var13_8) return;
            if (var14_7 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            while (true) {
                switch (cfr_temp_0 == -2147483648 ? var14_7 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var13_8) return;
                        kq.text(var1_1, kv.ICONS, this.icon, var12_18, var10_14, (float)var9_12, var8_11, (boolean)mh$MenuButton.inlh("inpe", inle(int ), (int)68));
                        if (var13_8 || var13_8) return;
                        mh.centered(var1_1, kv.BOLD, this.label, this.x + this.width * mh$MenuButton.inlh("inpf", inol(int ), (int)69), var7_10 + mh$MenuButton.inlh("inpg", inol(int ), (int)70), (float)var11_16, var8_11);
                        if (var13_8 || var13_8) return;
                        if (var15_6) {
                            throw null;
                        }
                        ** GOTO lbl76
                    }
lbl65:
                    // 2 sources

                    if (var13_8 || var13_8) return;
                    var9_13 = mh$MenuButton.inlh("inph", inol(int ), (int)71);
                    if (var13_8 || var13_8) return;
                    var10_15 = kq.width(kv.BOLD, this.label, (float)var9_13);
                    if (var13_8 || var13_8) return;
                    var11_17 = this.x + this.width * mh$MenuButton.inlh("inpi", inol(int ), (int)72) - var10_15 * mh$MenuButton.inlh("inpj", inol(int ), (int)73);
                    if (var13_8 || var13_8) return;
                    var12_19 = var7_10 + mh$MenuButton.inlh("inpk", inol(int ), (int)74);
                    if (var13_8 || var13_8) return;
                    kq.text(var1_1, kv.BOLD, this.label, var11_17, var12_19, (float)var9_13, var8_11, (boolean)mh$MenuButton.inlh("inpl", inle(int ), (int)75));
                    if (var13_8) return;
lbl76:
                    // 2 sources

                    if (!var13_8 && !var13_8) return;
                    return;
                    case 1: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inpn", inle(int ), (int)77);
                        cfr_temp_0 = 14;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 6: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inps", inle(int ), (int)82);
                        cfr_temp_0 = 56;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 8: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inpu", inle(int ), (int)84);
                        cfr_temp_0 = 20;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 11: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inpx", inle(int ), (int)87);
                        cfr_temp_0 = 42;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 12: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inpy", inle(int ), (int)88);
                        cfr_temp_0 = 21;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 13: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inpz", inle(int ), (int)89);
                        cfr_temp_0 = 41;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 14: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqa", inle(int ), (int)90);
                        cfr_temp_0 = 5;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 19: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqf", inle(int ), (int)95);
                        cfr_temp_0 = 49;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 22: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqi", inle(int ), (int)98);
                        cfr_temp_0 = 24;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 26: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqm", inle(int ), (int)102);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 16: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqc", inle(int ), (int)92);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 18: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqe", inle(int ), (int)94);
                        cfr_temp_0 = 29;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 27: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqn", inle(int ), (int)103);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 20: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqg", inle(int ), (int)96);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 0: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inpm", inle(int ), (int)76);
                        cfr_temp_0 = 44;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 32: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqs", inle(int ), (int)108);
                        cfr_temp_0 = 9;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 33: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqt", inle(int ), (int)109);
                        cfr_temp_0 = 29;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 34: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqu", inle(int ), (int)110);
                        cfr_temp_0 = 17;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 35: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqv", inle(int ), (int)111);
                        cfr_temp_0 = 30;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 38: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqy", inle(int ), (int)114);
                        cfr_temp_0 = 29;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 39: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqz", inle(int ), (int)115);
                        cfr_temp_0 = 31;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 41: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inrb", inle(int ), (int)117);
                        cfr_temp_0 = 2;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 42: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inrc", inle(int ), (int)118);
                        cfr_temp_0 = 47;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 43: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inrd", inle(int ), (int)119);
                        cfr_temp_0 = 49;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 44: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inre", inle(int ), (int)120);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 15: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqb", inle(int ), (int)91);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 2: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inpo", inle(int ), (int)78);
                        cfr_temp_0 = 23;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 48: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inri", inle(int ), (int)124);
                        cfr_temp_0 = 31;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 49: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inrj", inle(int ), (int)125);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 28: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqo", inle(int ), (int)104);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 47: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inrh", inle(int ), (int)123);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 21: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqh", inle(int ), (int)97);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 5: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inpr", inle(int ), (int)81);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 50: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inrk", inle(int ), (int)126);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 4: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inpq", inle(int ), (int)80);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 10: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inpw", inle(int ), (int)86);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 36: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqw", inle(int ), (int)112);
                        cfr_temp_0 = 45;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 51: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inrl", inle(int ), (int)127);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 37: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqx", inle(int ), (int)113);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 45: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inrf", inle(int ), (int)121);
                        cfr_temp_0 = 24;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 52: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inrm", inle(int ), (int)128);
                        cfr_temp_0 = 46;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 53: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inrn", inle(int ), (int)129);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 25: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inql", inle(int ), (int)101);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 17: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqd", inle(int ), (int)93);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 23: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqj", inle(int ), (int)99);
                        cfr_temp_0 = 40;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 54: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inro", inle(int ), (int)130);
                        cfr_temp_0 = 31;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 55: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inrp", inle(int ), (int)131);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 40: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inra", inle(int ), (int)116);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 9: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inpv", inle(int ), (int)85);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 46: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inrg", inle(int ), (int)122);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 24: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqk", inle(int ), (int)100);
                        cfr_temp_0 = 29;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 56: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inrq", inle(int ), (int)132);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 30: {
                        ** GOTO lbl348
                    }
                    case 57: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inrr", inle(int ), (int)133);
                        if (var15_6) {
                            throw null;
                        }
lbl348:
                        // 3 sources

                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqq", inle(int ), (int)106);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 31: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqr", inle(int ), (int)107);
                        cfr_temp_0 = 29;
                        if (var15_6) {
                            throw null;
                        }
                        break block133;
                    }
                    case 3: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inpp", inle(int ), (int)79);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 29: {
                        var14_7 /* !! */  = (int)mh$MenuButton.inlh("inqp", inle(int ), (int)105);
                        if (var15_6) {
                            throw null;
                        }
                    }
                    case 7: 
                }
                break;
            }
            ** GOTO lbl370
        }
        do {
            if (true) ** continue;
lbl370:
            // 2 sources

            var14_7 /* !! */  = (int)mh$MenuButton.inlh("inpt", inle(int ), (int)83);
            cfr_temp_0 = 3;
        } while (!var15_6);
        throw null;
    }

    private static /* synthetic */ void inrw() {
        mh$MenuButton.inlp[0] = 1662867335353392128L;
        mh$MenuButton.inlp[1] = 5490351513712664930L;
        mh$MenuButton.inlp[2] = 6801866056370960749L;
        mh$MenuButton.inlp[3] = 3020702642260902597L;
        mh$MenuButton.inlp[4] = -2893669000297379052L;
        mh$MenuButton.inlp[5] = 6589434828961306121L;
        mh$MenuButton.inlp[6] = -1662505853817183869L;
        mh$MenuButton.inlp[7] = 917022590673724860L;
        mh$MenuButton.inlp[8] = -4173137168793678763L;
        mh$MenuButton.inlp[9] = 3841355312913547384L;
        mh$MenuButton.inlp[10] = 3769457416464844204L;
        mh$MenuButton.inlp[11] = -4497367537584112052L;
        mh$MenuButton.inlp[12] = -2490195358044128173L;
        mh$MenuButton.inlp[13] = 2220094744613579479L;
        mh$MenuButton.inlp[14] = 7317468233042834021L;
        mh$MenuButton.inlp[15] = -4467817148753750306L;
        mh$MenuButton.inlp[16] = -3749017789432596056L;
        mh$MenuButton.inlp[17] = 5359460305293608166L;
        mh$MenuButton.inlp[18] = 1344163912159525072L;
        mh$MenuButton.inlp[19] = -3619553075835735884L;
        mh$MenuButton.inlp[20] = 6614295485911126937L;
        mh$MenuButton.inlp[21] = 3325224969104164587L;
        mh$MenuButton.inlp[22] = 4102366933315192727L;
        mh$MenuButton.inlp[23] = -337608387502478377L;
        mh$MenuButton.inlp[24] = -1861781498472957873L;
        mh$MenuButton.inlp[25] = -7643776374208822449L;
        mh$MenuButton.inlp[26] = 728166772184595636L;
        mh$MenuButton.inlp[27] = 4540416084241093887L;
    }

    private static /* synthetic */ void inru() {
        mh$MenuButton.inlg[0] = 2034295200;
        mh$MenuButton.inlg[1] = 2068863082;
        mh$MenuButton.inlg[2] = -948425481;
        mh$MenuButton.inlg[3] = -1888181741;
        mh$MenuButton.inlg[4] = 1004620654;
        mh$MenuButton.inlg[5] = 1628989673;
        mh$MenuButton.inlg[6] = 789841220;
        mh$MenuButton.inlg[7] = 942255602;
        mh$MenuButton.inlg[8] = 1897844466;
        mh$MenuButton.inlg[9] = 92149228;
        mh$MenuButton.inlg[10] = 767261827;
        mh$MenuButton.inlg[11] = 1401887762;
        mh$MenuButton.inlg[12] = 1604568423;
        mh$MenuButton.inlg[13] = 0x1EE77E7;
        mh$MenuButton.inlg[14] = 1129494807;
        mh$MenuButton.inlg[15] = 1519302624;
        mh$MenuButton.inlg[16] = 1933697537;
        mh$MenuButton.inlg[17] = -1867841871;
        mh$MenuButton.inlg[18] = 1301424698;
        mh$MenuButton.inlg[19] = 1588679046;
        mh$MenuButton.inlg[20] = 1121342367;
        mh$MenuButton.inlg[21] = -1986290074;
        mh$MenuButton.inlg[22] = -1916729590;
        mh$MenuButton.inlg[23] = -83059758;
        mh$MenuButton.inlg[24] = 352928768;
        mh$MenuButton.inlg[25] = -895383587;
        mh$MenuButton.inlg[26] = -136595133;
        mh$MenuButton.inlg[27] = -1121284716;
        mh$MenuButton.inlg[28] = -571611485;
        mh$MenuButton.inlg[29] = 1647452158;
        mh$MenuButton.inlg[30] = 1046346975;
        mh$MenuButton.inlg[31] = 1458216011;
        mh$MenuButton.inlg[32] = -1133986554;
        mh$MenuButton.inlg[33] = -1668230996;
        mh$MenuButton.inlg[34] = 103857795;
        mh$MenuButton.inlg[35] = 817587673;
        mh$MenuButton.inlg[36] = 1988451422;
        mh$MenuButton.inlg[37] = -153694005;
        mh$MenuButton.inlg[38] = 83815337;
        mh$MenuButton.inlg[39] = -1881568572;
        mh$MenuButton.inlg[40] = -550360523;
        mh$MenuButton.inlg[41] = 573546351;
        mh$MenuButton.inlg[42] = 1767060773;
        mh$MenuButton.inlg[43] = -1389470015;
        mh$MenuButton.inlg[44] = -1333852150;
        mh$MenuButton.inlg[45] = -542271712;
        mh$MenuButton.inlg[46] = -93441688;
        mh$MenuButton.inlg[47] = -1441208018;
        mh$MenuButton.inlg[48] = 569733636;
        mh$MenuButton.inlg[49] = -406002053;
        mh$MenuButton.inlg[50] = 189549271;
        mh$MenuButton.inlg[51] = 450352919;
        mh$MenuButton.inlg[52] = 1924434786;
        mh$MenuButton.inlg[53] = -1132566489;
        mh$MenuButton.inlg[54] = -1060177045;
        mh$MenuButton.inlg[55] = 1301607900;
        mh$MenuButton.inlg[56] = -488470920;
        mh$MenuButton.inlg[57] = 2122231169;
        mh$MenuButton.inlg[58] = 579579008;
        mh$MenuButton.inlg[59] = 2130901116;
        mh$MenuButton.inlg[60] = -1396393310;
        mh$MenuButton.inlg[61] = 1967165306;
        mh$MenuButton.inlg[62] = 34095085;
        mh$MenuButton.inlg[63] = 1757138199;
        mh$MenuButton.inlg[64] = -1318148746;
        mh$MenuButton.inlg[65] = 74803648;
        mh$MenuButton.inlg[66] = -1475439020;
        mh$MenuButton.inlg[67] = -974109011;
        mh$MenuButton.inlg[68] = 1120095032;
        mh$MenuButton.inlg[69] = 1849386011;
        mh$MenuButton.inlg[70] = 2021762746;
        mh$MenuButton.inlg[71] = -1664999637;
        mh$MenuButton.inlg[72] = -1874351470;
        mh$MenuButton.inlg[73] = -23302631;
        mh$MenuButton.inlg[74] = -1061946535;
        mh$MenuButton.inlg[75] = -1196583512;
        mh$MenuButton.inlg[76] = -1996736636;
        mh$MenuButton.inlg[77] = -1970351890;
        mh$MenuButton.inlg[78] = -2081904716;
        mh$MenuButton.inlg[79] = -856150805;
        mh$MenuButton.inlg[80] = 492736921;
        mh$MenuButton.inlg[81] = 609385364;
        mh$MenuButton.inlg[82] = -2103112724;
        mh$MenuButton.inlg[83] = -244429264;
        mh$MenuButton.inlg[84] = -1055659685;
        mh$MenuButton.inlg[85] = -2028704454;
        mh$MenuButton.inlg[86] = -1391789742;
        mh$MenuButton.inlg[87] = 1611781163;
        mh$MenuButton.inlg[88] = -1630549752;
        mh$MenuButton.inlg[89] = -1502354981;
        mh$MenuButton.inlg[90] = 1138232380;
        mh$MenuButton.inlg[91] = -1812479411;
        mh$MenuButton.inlg[92] = -636341116;
        mh$MenuButton.inlg[93] = -1977932500;
        mh$MenuButton.inlg[94] = -937406692;
        mh$MenuButton.inlg[95] = -1196184507;
        mh$MenuButton.inlg[96] = 1687377042;
        mh$MenuButton.inlg[97] = -732418118;
        mh$MenuButton.inlg[98] = 2091350734;
        mh$MenuButton.inlg[99] = 311661001;
    }

    private static /* synthetic */ void inrt() {
        mh$MenuButton.inlf[100] = -1209917166;
        mh$MenuButton.inlf[101] = 314536524;
        mh$MenuButton.inlf[102] = 907896866;
        mh$MenuButton.inlf[103] = 47657662;
        mh$MenuButton.inlf[104] = 1109311371;
        mh$MenuButton.inlf[105] = -207260755;
        mh$MenuButton.inlf[106] = -289962290;
        mh$MenuButton.inlf[107] = 607788696;
        mh$MenuButton.inlf[108] = -1911519599;
        mh$MenuButton.inlf[109] = 1222779925;
        mh$MenuButton.inlf[110] = 2129292765;
        mh$MenuButton.inlf[111] = -740817212;
        mh$MenuButton.inlf[112] = 1583538126;
        mh$MenuButton.inlf[113] = 437980177;
        mh$MenuButton.inlf[114] = -844900529;
        mh$MenuButton.inlf[115] = 887558595;
        mh$MenuButton.inlf[116] = -925665905;
        mh$MenuButton.inlf[117] = 218085450;
        mh$MenuButton.inlf[118] = 529965477;
        mh$MenuButton.inlf[119] = 1128020055;
        mh$MenuButton.inlf[120] = 1003448181;
        mh$MenuButton.inlf[121] = -625604471;
        mh$MenuButton.inlf[122] = 472883356;
        mh$MenuButton.inlf[123] = 88731512;
        mh$MenuButton.inlf[124] = -1767607731;
        mh$MenuButton.inlf[125] = 225068077;
        mh$MenuButton.inlf[126] = -253535140;
        mh$MenuButton.inlf[127] = 311009560;
        mh$MenuButton.inlf[128] = -1522120744;
        mh$MenuButton.inlf[129] = -1580132079;
        mh$MenuButton.inlf[130] = 1307708238;
        mh$MenuButton.inlf[131] = -482034937;
        mh$MenuButton.inlf[132] = 1677164625;
        mh$MenuButton.inlf[133] = -1800934662;
    }
}

