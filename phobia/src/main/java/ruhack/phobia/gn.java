/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_2338
 *  net.minecraft.class_2680
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import ruhack.phobia.aw;
import ruhack.phobia.bk;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.nv;

public final class gn
extends ds {
    private static int[] dees = new int[188];
    private static long[] defb;
    private static long[] defc;
    private int previousSlot;
    private class_2338 activeBlock;
    public static final boolean a;
    public static final int b;
    private static final long hf = 4467777512762140331L;
    public static final boolean c;
    private static int[] deet;

    private static /* synthetic */ void dfit() {
        gn.defb[0] = 6029537933765315750L;
        gn.defb[1] = -8031010940686969057L;
        gn.defb[2] = 8304221152133109955L;
        gn.defb[3] = 4412455559710909435L;
        gn.defb[4] = -6915451275681939683L;
        gn.defb[5] = -4238479556663188308L;
        gn.defb[6] = -5880341910141551463L;
        gn.defb[7] = -2360818004146610802L;
        gn.defb[8] = -4140416000771855968L;
        gn.defb[9] = -5455159785527853374L;
        gn.defb[10] = 1021311087558739316L;
        gn.defb[11] = 4298137779857662716L;
        gn.defb[12] = 5148572955278868457L;
        gn.defb[13] = -6527395376252522578L;
        gn.defb[14] = -7443101147638123051L;
        gn.defb[15] = 8018821171180929867L;
        gn.defb[16] = 6616268329436002130L;
        gn.defb[17] = -1128757628485607030L;
        gn.defb[18] = 5590760650548953967L;
        gn.defb[19] = 2167094344783537321L;
        gn.defb[20] = -6690711287617402314L;
        gn.defb[21] = -291550187244639638L;
        gn.defb[22] = 6944852288351255936L;
        gn.defb[23] = -5896537477421592077L;
        gn.defb[24] = -9140802632690861449L;
        gn.defb[25] = -8219029945109922642L;
        gn.defb[26] = -7647060311838067443L;
        gn.defb[27] = -557416300101236088L;
        gn.defb[28] = -5250492138749637735L;
        gn.defb[29] = -4749698070004930274L;
        gn.defb[30] = 6073453302299187306L;
        gn.defb[31] = 8979222495516826427L;
        gn.defb[32] = -7970942119929460297L;
        gn.defb[33] = -5871887965384695674L;
        gn.defb[34] = -2999038635785664906L;
        gn.defb[35] = -2078352080766094768L;
        gn.defb[36] = -7109744221384950386L;
        gn.defb[37] = 7614866188394214260L;
        gn.defb[38] = -6406493856217369645L;
        gn.defb[39] = 6425423530937900330L;
        gn.defb[40] = -4661365464593620369L;
        gn.defb[41] = 7368250410958564737L;
        gn.defb[42] = 5733727302667548728L;
        gn.defb[43] = 4480823613561256108L;
        gn.defb[44] = 7104642222386654873L;
        gn.defb[45] = -8032207114540820681L;
        gn.defb[46] = 18093640409389553L;
        gn.defb[47] = 477784736813630073L;
        gn.defb[48] = 6526606652685579783L;
        gn.defb[49] = 3631214735625926325L;
        gn.defb[50] = -1188666256065021865L;
        gn.defb[51] = -332064233092785606L;
        gn.defb[52] = 7976098829923696561L;
        gn.defb[53] = 8503938435700658037L;
        gn.defb[54] = -2404372296279602544L;
        gn.defb[55] = 953117077555155392L;
        gn.defb[56] = -8179016173910153035L;
        gn.defb[57] = 6805316191396869571L;
        gn.defb[58] = 6203928500053961183L;
        gn.defb[59] = -422048669086916501L;
        gn.defb[60] = -3831625500593130419L;
        gn.defb[61] = -6863330734275217752L;
        gn.defb[62] = 2842740773357952349L;
        gn.defb[63] = -2594696615932659582L;
        gn.defb[64] = 808620523180896078L;
        gn.defb[65] = -3083531141216455551L;
        gn.defb[66] = -6125772513029710983L;
        gn.defb[67] = 6930002887453483617L;
        gn.defb[68] = -3412252712702728090L;
        gn.defb[69] = -5121786218599610384L;
        gn.defb[70] = 4812921304863453322L;
        gn.defb[71] = -390552290047955639L;
        gn.defb[72] = 3725261415037471131L;
        gn.defb[73] = -8327089419746396668L;
        gn.defb[74] = -7900715362459728365L;
        gn.defb[75] = -8756693577569071324L;
        gn.defb[76] = 2330666479098957284L;
        gn.defb[77] = -4340411664930360036L;
        gn.defb[78] = 4610478519640491908L;
        gn.defb[79] = -3403824605388343411L;
        gn.defb[80] = -7775360118842586925L;
        gn.defb[81] = -430766472056390190L;
        gn.defb[82] = -5444738082274522129L;
        gn.defb[83] = 1428388611216953277L;
        gn.defb[84] = -3905778718558870146L;
        gn.defb[85] = 5179525521673662960L;
        gn.defb[86] = 8001731528198281342L;
        gn.defb[87] = -7680890555008218932L;
        gn.defb[88] = 8525640104904745632L;
        gn.defb[89] = 8395195045300039904L;
        gn.defb[90] = 5930627126898542227L;
        gn.defb[91] = 1351472435525599630L;
        gn.defb[92] = -7109043208245658868L;
        gn.defb[93] = -5641002292650883615L;
        gn.defb[94] = -711485892027847306L;
        gn.defb[95] = -1718573098397133624L;
        gn.defb[96] = 241493714498867286L;
        gn.defb[97] = 7617882694406403001L;
        gn.defb[98] = -1148670333652503022L;
        gn.defb[99] = 2556785040243324419L;
    }

    private static /* synthetic */ void dfiq() {
        gn.dees[100] = -474056643;
        gn.dees[101] = 1100107868;
        gn.dees[102] = 1207706322;
        gn.dees[103] = 1307881851;
        gn.dees[104] = -1911185587;
        gn.dees[105] = -1705344192;
        gn.dees[106] = -1682096206;
        gn.dees[107] = 1700936852;
        gn.dees[108] = -680620503;
        gn.dees[109] = 181938222;
        gn.dees[110] = 420046074;
        gn.dees[111] = 1200837554;
        gn.dees[112] = 324002728;
        gn.dees[113] = 719891625;
        gn.dees[114] = -1435241417;
        gn.dees[115] = -1560239179;
        gn.dees[116] = 875330946;
        gn.dees[117] = -1269721769;
        gn.dees[118] = 1040057074;
        gn.dees[119] = -1287519494;
        gn.dees[120] = -300580226;
        gn.dees[121] = 94966393;
        gn.dees[122] = 689954718;
        gn.dees[123] = 219746158;
        gn.dees[124] = 1530011838;
        gn.dees[125] = -1367574740;
        gn.dees[126] = 830074386;
        gn.dees[127] = 1377825690;
        gn.dees[128] = -1476141636;
        gn.dees[129] = -2086031828;
        gn.dees[130] = 337948847;
        gn.dees[131] = -1397847180;
        gn.dees[132] = 1451260171;
        gn.dees[133] = -1660412037;
        gn.dees[134] = 39204767;
        gn.dees[135] = 692963677;
        gn.dees[136] = 1273022829;
        gn.dees[137] = -1826343095;
        gn.dees[138] = 1141283987;
        gn.dees[139] = 325641333;
        gn.dees[140] = 342527366;
        gn.dees[141] = -1287402816;
        gn.dees[142] = -1520291105;
        gn.dees[143] = -1433707252;
        gn.dees[144] = 883558547;
        gn.dees[145] = -1987577550;
        gn.dees[146] = 1630666188;
        gn.dees[147] = -1132913170;
        gn.dees[148] = -283205613;
        gn.dees[149] = -1478745686;
        gn.dees[150] = -1588578421;
        gn.dees[151] = 138679655;
        gn.dees[152] = -1507886998;
        gn.dees[153] = 1507799773;
        gn.dees[154] = 763901237;
        gn.dees[155] = 252405203;
        gn.dees[156] = 127948100;
        gn.dees[157] = -1173702824;
        gn.dees[158] = 313451225;
        gn.dees[159] = 133578299;
        gn.dees[160] = -1817747487;
        gn.dees[161] = -1385692173;
        gn.dees[162] = 1619887213;
        gn.dees[163] = -2109898309;
        gn.dees[164] = 582496042;
        gn.dees[165] = -1628482527;
        gn.dees[166] = -1169537889;
        gn.dees[167] = 929508753;
        gn.dees[168] = -1616843426;
        gn.dees[169] = -1667683992;
        gn.dees[170] = -145137399;
        gn.dees[171] = 941771752;
        gn.dees[172] = 1852265427;
        gn.dees[173] = 1980837979;
        gn.dees[174] = 1431247930;
        gn.dees[175] = 1471896517;
        gn.dees[176] = 2010616331;
        gn.dees[177] = -423148933;
        gn.dees[178] = -41309060;
        gn.dees[179] = 1017632233;
        gn.dees[180] = -684436964;
        gn.dees[181] = -906665150;
        gn.dees[182] = -1003371346;
        gn.dees[183] = -1940268300;
        gn.dees[184] = -1189544777;
        gn.dees[185] = 1408384586;
        gn.dees[186] = 961433338;
        gn.dees[187] = -786730556;
    }

    static {
        deet = new int[188];
        gn.dfip();
        gn.dfiq();
        gn.dfir();
        gn.dfis();
        defb = new long[138];
        defc = new long[138];
        gn.dfit();
        gn.dfiu();
        gn.dfiv();
        gn.dfiw();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gn.hf - gn.deeu("dfbv", defa(int ), (int)69)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gn.deeu("dfbw", deer(int ), (int)82)) break;
            v0 /* !! */  = (long)gn.deeu("dfbx", deer(int ), (int)83);
        }
        var3_1 = gn.c;
        v1 /* !! */  = gn.hf;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - gn.deeu("dfby", defa(int ), (int)70));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1547286129: {
                    v2 = gn.deeu("dfbz", defa(int ), (int)71);
                    continue block19;
                }
                case -5609813: {
                    break block19;
                }
                case 106412866: {
                    v2 = gn.deeu("dfca", defa(int ), (int)72);
                    continue block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = gn.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = gn.hf - gn.deeu("dfcb", defa(int ), (int)73)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == gn.deeu("dfcc", deer(int ), (int)84)) break;
            v3 /* !! */  = (long)gn.deeu("dfcd", deer(int ), (int)85);
        }
        var1_3 = gn.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl34:
                    // 2 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl34
                v4 /* !! */  = gn.hf;
                if (true) ** GOTO lbl41
                block22: while (true) {
                    v4 /* !! */  = (long)(v5 - gn.deeu("dfce", defa(int ), (int)74));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1118082547: {
                            v5 = gn.deeu("dfcf", defa(int ), (int)75);
                            continue block22;
                        }
                        case -5609813: {
                            break block22;
                        }
                        case 845689437: {
                            v5 = gn.deeu("dfcg", defa(int ), (int)76);
                            continue block22;
                        }
                    }
                    break;
                }
                this.restoreSlot();
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl53:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)gn.deeu("dfch", deer(int ), (int)86);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl72
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gn.deeu("dfci", deer(int ), (int)87);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl68
                    break;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)gn.deeu("dfcj", deer(int ), (int)88);
                if (!var3_1) ** GOTO lbl53
                throw null;
            }
lbl68:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)gn.deeu("dfck", deer(int ), (int)89);
                if (var3_1) {
                    throw null;
                }
            }
lbl72:
            // 4 sources

            case 4: {
                var2_2 /* !! */  = (int)gn.deeu("dfcl", deer(int ), (int)90);
                if (!var3_1) break;
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)gn.deeu("dfcm", deer(int ), (int)91);
        ** while (!var3_1)
lbl79:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @aw
    public void onTick(df var1_1) {
        v0 /* !! */  = gn.hf;
        block48: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -5609813: {
                    break block48;
                }
                case 472391322: {
                    v0 /* !! */  = (long)(gn.deeu("dfae", defa(int ), (int)46) - gn.deeu("dfad", defa(int ), (int)45));
                    continue block48;
                }
            }
            break;
        }
        var4_2 = gn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gn.hf - gn.deeu("dfaf", defa(int ), (int)47)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gn.deeu("dfag", deer(int ), (int)62)) break;
            v1 /* !! */  = (long)gn.deeu("dfah", deer(int ), (int)63);
        }
        var3_3 /* !! */  = gn.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = gn.hf - gn.deeu("dfai", defa(int ), (int)48)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == gn.deeu("dfaj", deer(int ), (int)64)) {
                var2_4 = gn.a;
                if (var4_2) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)gn.deeu("dfak", deer(int ), (int)65);
        }
        if (var2_4 || var2_4) return;
        v3 /* !! */  = gn.hf;
        if (true) ** GOTO lbl30
        block51: while (true) {
            v3 /* !! */  = (long)(v4 - gn.deeu("dfal", defa(int ), (int)49));
lbl30:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1235659496: {
                    v4 = gn.deeu("dfam", defa(int ), (int)50);
                    continue block51;
                }
                case -5609813: {
                    break block51;
                }
                case 1365479844: {
                    v4 = gn.deeu("dfan", defa(int ), (int)51);
                    continue block51;
                }
            }
            break;
        }
        if (this.activeBlock == null) ** GOTO lbl172
        if (var2_4) return;
        v5 /* !! */  = gn.hf;
        block52: while (true) {
            switch ((int)v5 /* !! */ ) {
                case -485167533: {
                    v5 /* !! */  = (long)(gn.deeu("dfap", defa(int ), (int)53) - gn.deeu("dfao", defa(int ), (int)52));
                    continue block52;
                }
                case -5609813: {
                    break block52;
                }
            }
            break;
        }
        v6 /* !! */  = gn.hf;
        if (true) ** GOTO lbl53
        block53: while (true) {
            v6 /* !! */  = (long)(v7 - gn.deeu("dfaq", defa(int ), (int)54));
lbl53:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -2114388040: {
                    v7 = gn.deeu("dfar", defa(int ), (int)55);
                    continue block53;
                }
                case -5609813: {
                    break block53;
                }
                case 1577524967: {
                    v7 = gn.deeu("dfas", defa(int ), (int)56);
                    continue block53;
                }
            }
            break;
        }
        if (gn.mc.field_1724 == null) ** GOTO lbl153
        if (var2_4) return;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block54: while (true) {
            block78: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v8 /* !! */  = (cfr_temp_3 = gn.hf - gn.deeu("dfat", defa(int ), (int)57)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v8 /* !! */  != gn.deeu("dfau", deer(int ), (int)66)) ** GOTO lbl74
                            v9 /* !! */  = gn.hf;
                            if (true) ** GOTO lbl120
lbl74:
                            // 1 sources

                            v8 /* !! */  = (long)gn.deeu("dfav", deer(int ), (int)67);
                        }
                    }
                    case 0: {
                        var3_3 /* !! */  = (int)gn.deeu("dfbj", deer(int ), (int)70);
                        cfr_temp_0 = 2;
                        if (var4_2) {
                            throw null;
                        }
                        break block78;
                    }
                    case 1: {
                        ** GOTO lbl106
                    }
                    case 4: {
                        var3_3 /* !! */  = (int)gn.deeu("dfbn", deer(int ), (int)74);
                        cfr_temp_0 = 10;
                        if (var4_2) {
                            throw null;
                        }
                        break block78;
                    }
                    case 7: {
                        var3_3 /* !! */  = (int)gn.deeu("dfbq", deer(int ), (int)77);
                        cfr_temp_0 = 5;
                        if (var4_2) {
                            throw null;
                        }
                        break block78;
                    }
                    case 9: {
                        var3_3 /* !! */  = (int)gn.deeu("dfbs", deer(int ), (int)79);
                        cfr_temp_0 = 3;
                        if (var4_2) {
                            throw null;
                        }
                        break block78;
                    }
                    case 11: {
                        var3_3 /* !! */  = (int)gn.deeu("dfbu", deer(int ), (int)81);
                        if (var4_2) {
                            throw null;
                        }
lbl106:
                        // 3 sources

                        var3_3 /* !! */  = (int)gn.deeu("dfbk", deer(int ), (int)71);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)gn.deeu("dfbl", deer(int ), (int)72);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 3: {
                        do {
                            var3_3 /* !! */  = (int)gn.deeu("dfbm", deer(int ), (int)73);
                        } while (!var4_2);
                        throw null;
                    }
                    block57: while (true) {
                        v9 /* !! */  = (long)(v10 - gn.deeu("dfaw", defa(int ), (int)58));
lbl120:
                        // 2 sources

                        switch ((int)v9 /* !! */ ) {
                            case -5609813: {
                                break block57;
                            }
                            case 1121706984: {
                                v10 = gn.deeu("dfax", defa(int ), (int)59);
                                continue block57;
                            }
                            case 1620039320: {
                                v10 = gn.deeu("dfay", defa(int ), (int)60);
                                continue block57;
                            }
                        }
                        break;
                    }
                    v11 = gn.mc.field_1690;
                    v12 /* !! */  = gn.hf;
                    if (true) ** GOTO lbl134
                    block58: while (true) {
                        v12 /* !! */  = (long)(v13 - gn.deeu("dfaz", defa(int ), (int)61));
lbl134:
                        // 2 sources

                        switch ((int)v12 /* !! */ ) {
                            case -32420685: {
                                v13 = gn.deeu("dfba", defa(int ), (int)62);
                                continue block58;
                            }
                            case -5609813: {
                                break block58;
                            }
                            case 770243899: {
                                v13 = gn.deeu("dfbb", defa(int ), (int)63);
                                continue block58;
                            }
                        }
                        break;
                    }
                    v14 = v11.field_1886;
                    while (true) {
                        if ((v15 /* !! */  = (cfr_temp_4 = gn.hf - gn.deeu("dfbc", defa(int ), (int)64)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v15 /* !! */  != gn.deeu("dfbd", deer(int ), (int)68)) ** GOTO lbl150
                        if (!v14.method_1434()) {
                            break;
                        }
                        ** GOTO lbl172
lbl150:
                        // 1 sources

                        v15 /* !! */  = (long)gn.deeu("dfbe", deer(int ), (int)69);
                    }
                    if (var2_4) return;
lbl153:
                    // 2 sources

                    if (var2_4 || var2_4) return;
                    v16 /* !! */  = gn.hf;
                    if (true) ** GOTO lbl158
                    block60: while (true) {
                        v16 /* !! */  = (long)(v17 - gn.deeu("dfbf", defa(int ), (int)65));
lbl158:
                        // 2 sources

                        switch ((int)v16 /* !! */ ) {
                            case -2027562695: {
                                v17 = gn.deeu("dfbg", defa(int ), (int)66);
                                continue block60;
                            }
                            case -768686482: {
                                v17 = gn.deeu("dfbh", defa(int ), (int)67);
                                continue block60;
                            }
                            case -5609813: {
                                break block60;
                            }
                            case 1497854950: {
                                v17 = gn.deeu("dfbi", defa(int ), (int)68);
                                continue block60;
                            }
                        }
                        break;
                    }
                    this.restoreSlot();
                    if (var2_4) return;
lbl172:
                    // 3 sources

                    if (!var2_4 && !var2_4) return;
                    return;
                    case 5: {
                        var3_3 /* !! */  = (int)gn.deeu("dfbo", deer(int ), (int)75);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var3_3 /* !! */  = (int)gn.deeu("dfbp", deer(int ), (int)76);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 10: {
                        var3_3 /* !! */  = (int)gn.deeu("dfbt", deer(int ), (int)80);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 8: 
                }
                ** GOTO lbl191
            }
            do {
                if (true) continue block54;
lbl191:
                // 2 sources

                var3_3 /* !! */  = (int)gn.deeu("dfbr", deer(int ), (int)78);
                cfr_temp_0 = 5;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void dfir() {
        gn.deet[0] = -1687992672;
        gn.deet[1] = -1095309668;
        gn.deet[2] = 2105664599;
        gn.deet[3] = 742658057;
        gn.deet[4] = 1114553180;
        gn.deet[5] = 1619306710;
        gn.deet[6] = 460033252;
        gn.deet[7] = -1903238197;
        gn.deet[8] = -1911206937;
        gn.deet[9] = -1314371834;
        gn.deet[10] = -1239211440;
        gn.deet[11] = -551431985;
        gn.deet[12] = 1486257437;
        gn.deet[13] = 1435949846;
        gn.deet[14] = -2085045894;
        gn.deet[15] = 600582860;
        gn.deet[16] = -702959497;
        gn.deet[17] = 827053278;
        gn.deet[18] = -510432537;
        gn.deet[19] = 676730067;
        gn.deet[20] = -1546300271;
        gn.deet[21] = 1143494100;
        gn.deet[22] = 1623192315;
        gn.deet[23] = 1354593587;
        gn.deet[24] = -88590463;
        gn.deet[25] = 861691979;
        gn.deet[26] = 1281025841;
        gn.deet[27] = 973934800;
        gn.deet[28] = 1216554712;
        gn.deet[29] = 1169181871;
        gn.deet[30] = 1917006155;
        gn.deet[31] = -870829571;
        gn.deet[32] = 304185361;
        gn.deet[33] = -618994647;
        gn.deet[34] = -1714892524;
        gn.deet[35] = 1583862682;
        gn.deet[36] = 362759660;
        gn.deet[37] = -1786290608;
        gn.deet[38] = -905345508;
        gn.deet[39] = -1017794034;
        gn.deet[40] = 613578171;
        gn.deet[41] = -1698437409;
        gn.deet[42] = 108886099;
        gn.deet[43] = 1197832178;
        gn.deet[44] = 1917201239;
        gn.deet[45] = -1891930334;
        gn.deet[46] = 610837068;
        gn.deet[47] = 1554553717;
        gn.deet[48] = -178820299;
        gn.deet[49] = -74917862;
        gn.deet[50] = -1687427514;
        gn.deet[51] = 1093597345;
        gn.deet[52] = -618464786;
        gn.deet[53] = -1924058990;
        gn.deet[54] = -928549712;
        gn.deet[55] = 1987514248;
        gn.deet[56] = -1436381079;
        gn.deet[57] = 1513832564;
        gn.deet[58] = 582915824;
        gn.deet[59] = 870805949;
        gn.deet[60] = -1742295495;
        gn.deet[61] = 763622744;
        gn.deet[62] = -1480130141;
        gn.deet[63] = -537373380;
        gn.deet[64] = -1588087601;
        gn.deet[65] = 1298008729;
        gn.deet[66] = 366057653;
        gn.deet[67] = 1873703468;
        gn.deet[68] = 1919616179;
        gn.deet[69] = 603804292;
        gn.deet[70] = 1696200064;
        gn.deet[71] = -1551125426;
        gn.deet[72] = 2061391778;
        gn.deet[73] = -514160909;
        gn.deet[74] = -1695539165;
        gn.deet[75] = 1377897242;
        gn.deet[76] = 1011241607;
        gn.deet[77] = 652275554;
        gn.deet[78] = -406688934;
        gn.deet[79] = -1987298482;
        gn.deet[80] = 2016771442;
        gn.deet[81] = 1059967849;
        gn.deet[82] = -918490620;
        gn.deet[83] = -1411321099;
        gn.deet[84] = 926660992;
        gn.deet[85] = 1903037275;
        gn.deet[86] = 1968475595;
        gn.deet[87] = 1698630953;
        gn.deet[88] = 2136025992;
        gn.deet[89] = 222527101;
        gn.deet[90] = -1484566462;
        gn.deet[91] = 595153667;
        gn.deet[92] = -488710487;
        gn.deet[93] = -1473024067;
        gn.deet[94] = 132525675;
        gn.deet[95] = 376248680;
        gn.deet[96] = 650541169;
        gn.deet[97] = -2138597069;
        gn.deet[98] = 1790672809;
        gn.deet[99] = 1000374089;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public gn() {
        var2_1 /* !! */  = gn.b;
        super("AutoTool", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0432\u044b\u0431\u0438\u0440\u0430\u0435\u0442 \u043b\u0443\u0447\u0448\u0438\u0439 \u0438\u043d\u0441\u0442\u0440\u0443\u043c\u0435\u043d\u0442 \u0438\u0437 \u0445\u043e\u0442\u0431\u0430\u0440\u0430 \u043f\u0440\u0438 \u043b\u043e\u043c\u0430\u043d\u0438\u0438 \u0431\u043b\u043e\u043a\u0430", du.PLAYER);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.previousSlot = (int)gn.deeu("deev", deer(int ), (int)0);
                return;
            }
            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)gn.deeu("deew", deer(int ), (int)1);
                }
            }
lbl12:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)gn.deeu("deex", deer(int ), (int)2);
                    continue;
                    break;
                }
            }
            case 2: {
                var2_1 /* !! */  = (int)gn.deeu("deey", deer(int ), (int)3);
                ** GOTO lbl12
            }
            case 3: 
        }
        var2_1 /* !! */  = (int)gn.deeu("deez", deer(int ), (int)4);
        ** while (true)
    }

    private static /* synthetic */ void dfis() {
        gn.deet[100] = 1543302727;
        gn.deet[101] = 1100107869;
        gn.deet[102] = 133636344;
        gn.deet[103] = -1307881852;
        gn.deet[104] = 1445199327;
        gn.deet[105] = 1705344191;
        gn.deet[106] = 1655618616;
        gn.deet[107] = 1700936853;
        gn.deet[108] = 631662862;
        gn.deet[109] = 181938222;
        gn.deet[110] = 420046067;
        gn.deet[111] = 1200837555;
        gn.deet[112] = -1932774674;
        gn.deet[113] = 719891624;
        gn.deet[114] = 738611921;
        gn.deet[115] = -1560239180;
        gn.deet[116] = -1021537485;
        gn.deet[117] = -1269721772;
        gn.deet[118] = 1040057074;
        gn.deet[119] = -1287519500;
        gn.deet[120] = -300580238;
        gn.deet[121] = 94966385;
        gn.deet[122] = 689954715;
        gn.deet[123] = 219746167;
        gn.deet[124] = 1530011839;
        gn.deet[125] = -1367574747;
        gn.deet[126] = 830074388;
        gn.deet[127] = 1377825676;
        gn.deet[128] = -1476141638;
        gn.deet[129] = -2086031835;
        gn.deet[130] = 337948836;
        gn.deet[131] = -1397847180;
        gn.deet[132] = 1451260179;
        gn.deet[133] = -1660412052;
        gn.deet[134] = 39204751;
        gn.deet[135] = 692963672;
        gn.deet[136] = 1273022836;
        gn.deet[137] = -1826343089;
        gn.deet[138] = 1141283994;
        gn.deet[139] = 325641341;
        gn.deet[140] = 342527390;
        gn.deet[141] = -1287402803;
        gn.deet[142] = -1520291122;
        gn.deet[143] = -1433707251;
        gn.deet[144] = 206514123;
        gn.deet[145] = -1223840602;
        gn.deet[146] = 1538453411;
        gn.deet[147] = -1132913173;
        gn.deet[148] = -283205613;
        gn.deet[149] = -1478745685;
        gn.deet[150] = -1588578421;
        gn.deet[151] = 138679650;
        gn.deet[152] = -1507886999;
        gn.deet[153] = -1507799774;
        gn.deet[154] = 1063959838;
        gn.deet[155] = 252405202;
        gn.deet[156] = -640244218;
        gn.deet[157] = 1173702823;
        gn.deet[158] = -1295632124;
        gn.deet[159] = 133578298;
        gn.deet[160] = -1728410208;
        gn.deet[161] = -1385692174;
        gn.deet[162] = 1623927581;
        gn.deet[163] = -2109898310;
        gn.deet[164] = 1970773539;
        gn.deet[165] = -1628482520;
        gn.deet[166] = -1169537890;
        gn.deet[167] = 450790611;
        gn.deet[168] = 1616843425;
        gn.deet[169] = -1667683991;
        gn.deet[170] = 1450341827;
        gn.deet[171] = 941771753;
        gn.deet[172] = -1212048420;
        gn.deet[173] = 1980837974;
        gn.deet[174] = 1431247928;
        gn.deet[175] = 1471896524;
        gn.deet[176] = 2010616332;
        gn.deet[177] = -423148942;
        gn.deet[178] = -41309064;
        gn.deet[179] = 1017632227;
        gn.deet[180] = -684436967;
        gn.deet[181] = -906665144;
        gn.deet[182] = -1003371354;
        gn.deet[183] = -1940268301;
        gn.deet[184] = -1189544777;
        gn.deet[185] = 1408384580;
        gn.deet[186] = 961433330;
        gn.deet[187] = -786730547;
    }

    private static /* synthetic */ long defa(int n2) {
        return defb[n2] ^ defc[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int findBestTool(class_2680 var1_1) {
        block51: {
            v0 /* !! */  = gn.hf;
            if (true) ** GOTO lbl5
            block31: while (true) {
                v0 /* !! */  = (long)(v1 - gn.deeu("dfcn", defa(int ), (int)77));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -828798016: {
                        v1 = gn.deeu("dfco", defa(int ), (int)78);
                        continue block31;
                    }
                    case -5609813: {
                        break block31;
                    }
                    case 78554704: {
                        v1 = gn.deeu("dfcp", defa(int ), (int)79);
                        continue block31;
                    }
                    case 145404534: {
                        v1 = gn.deeu("dfcq", defa(int ), (int)80);
                        continue block31;
                    }
                }
                break;
            }
            var8_2 = gn.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = gn.hf - gn.deeu("dfcr", defa(int ), (int)81)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == gn.deeu("dfcs", deer(int ), (int)92)) break;
                v2 /* !! */  = (long)gn.deeu("dfct", deer(int ), (int)93);
            }
            var7_3 = gn.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = gn.hf - gn.deeu("dfcu", defa(int ), (int)82)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == gn.deeu("dfcv", deer(int ), (int)94)) break;
                v3 /* !! */  = (long)gn.deeu("dfcw", deer(int ), (int)95);
            }
            var6_4 = gn.a;
            if (var8_2) {
                throw null;
lbl32:
                // 13 sources

                return (int)gn.deeu("dfcx", deer(int ), (int)96);
            }
            if (var6_4 || var6_4) ** GOTO lbl32
            v4 /* !! */  = gn.hf;
            if (true) ** GOTO lbl39
            block35: while (true) {
                v4 /* !! */  = (long)(v5 - gn.deeu("dfcy", defa(int ), (int)83));
lbl39:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1626092255: {
                        v5 = gn.deeu("dfcz", defa(int ), (int)84);
                        continue block35;
                    }
                    case -5609813: {
                        break block35;
                    }
                    case 606413407: {
                        v5 = gn.deeu("dfda", defa(int ), (int)85);
                        continue block35;
                    }
                    case 1284310146: {
                        v5 = gn.deeu("dfdb", defa(int ), (int)86);
                        continue block35;
                    }
                }
                break;
            }
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_2 = gn.hf - gn.deeu("dfdc", defa(int ), (int)87)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == gn.deeu("dfdd", deer(int ), (int)97)) break;
                v6 /* !! */  = (long)gn.deeu("dfde", deer(int ), (int)98);
            }
            v7 = gn.mc.field_1724;
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = gn.hf - gn.deeu("dfdf", defa(int ), (int)88)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == gn.deeu("dfdg", deer(int ), (int)99)) break;
                v8 /* !! */  = (long)gn.deeu("dfdh", deer(int ), (int)100);
            }
            v9 = v7.method_31548();
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_4 = gn.hf - gn.deeu("dfdi", defa(int ), (int)89)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == gn.deeu("dfdj", deer(int ), (int)101)) break;
                v10 /* !! */  = (long)gn.deeu("dfdk", deer(int ), (int)102);
            }
            var2_5 /* !! */  = v9.method_67532();
            if (var6_4 || var6_4) ** GOTO lbl32
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_5 = gn.hf - gn.deeu("dfdl", defa(int ), (int)90)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == gn.deeu("dfdm", deer(int ), (int)103)) break;
                v11 /* !! */  = (long)gn.deeu("dfdn", deer(int ), (int)104);
            }
            v12 /* !! */  = gn.hf;
            if (true) ** GOTO lbl79
            block40: while (true) {
                v12 /* !! */  = (long)(gn.deeu("dfdp", defa(int ), (int)92) - gn.deeu("dfdo", defa(int ), (int)91));
lbl79:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -1466162615: {
                        continue block40;
                    }
                    case -5609813: {
                        break block40;
                    }
                }
                break;
            }
            v13 = gn.mc.field_1724;
            v14 /* !! */  = gn.hf;
            if (true) ** GOTO lbl89
            block41: while (true) {
                v14 /* !! */  = (long)(v15 - gn.deeu("dfdq", defa(int ), (int)93));
lbl89:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -5609813: {
                        break block41;
                    }
                    case 486851157: {
                        v15 = gn.deeu("dfdr", defa(int ), (int)94);
                        continue block41;
                    }
                    case 1252945299: {
                        v15 = gn.deeu("dfds", defa(int ), (int)95);
                        continue block41;
                    }
                    case 1261580210: {
                        v15 = gn.deeu("dfdt", defa(int ), (int)96);
                        continue block41;
                    }
                }
                break;
            }
            v16 = v13.method_31548();
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_6 = gn.hf - gn.deeu("dfdu", defa(int ), (int)97)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == gn.deeu("dfdv", deer(int ), (int)105)) break;
                v17 /* !! */  = (long)gn.deeu("dfdw", deer(int ), (int)106);
            }
            v18 = v16.method_5438(var2_5 /* !! */ );
            while (true) {
                if ((v19 /* !! */  = (cfr_temp_7 = gn.hf - gn.deeu("dfdx", defa(int ), (int)98)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v19 /* !! */  == gn.deeu("dfdy", deer(int ), (int)107)) break;
                v19 /* !! */  = (long)gn.deeu("dfdz", deer(int ), (int)108);
            }
            var3_6 = gn.miningScore(v18, var1_1);
            if (var6_4 || var6_4) ** GOTO lbl32
            var4_7 = gn.deeu("dfea", deer(int ), (int)109);
            if (var6_4) ** GOTO lbl32
            do {
                block52: {
                    if (var6_4 || var6_4) ** GOTO lbl32
                    if (var4_7 >= gn.deeu("dfeb", deer(int ), (int)110)) break block51;
                    if (var6_4 || var6_4) ** GOTO lbl32
                    v20 /* !! */  = gn.hf;
                    if (true) ** GOTO lbl125
                    block45: while (true) {
                        v20 /* !! */  = (long)(v21 - gn.deeu("dfec", defa(int ), (int)99));
lbl125:
                        // 2 sources

                        switch ((int)v20 /* !! */ ) {
                            case -1515020271: {
                                v21 = gn.deeu("dfed", defa(int ), (int)100);
                                continue block45;
                            }
                            case -5609813: {
                                break block45;
                            }
                            case 1234499423: {
                                v21 = gn.deeu("dfee", defa(int ), (int)101);
                                continue block45;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v22 /* !! */  = (cfr_temp_8 = gn.hf - gn.deeu("dfef", defa(int ), (int)102)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v22 /* !! */  == gn.deeu("dfeg", deer(int ), (int)111)) break;
                        v22 /* !! */  = (long)gn.deeu("dfeh", deer(int ), (int)112);
                    }
                    v23 = gn.mc.field_1724;
                    v24 /* !! */  = gn.hf;
                    if (true) ** GOTO lbl144
                    block47: while (true) {
                        v24 /* !! */  = (long)(gn.deeu("dfej", defa(int ), (int)104) - gn.deeu("dfei", defa(int ), (int)103));
lbl144:
                        // 2 sources

                        switch ((int)v24 /* !! */ ) {
                            case -5609813: {
                                break block47;
                            }
                            case 1364065089: {
                                continue block47;
                            }
                        }
                        break;
                    }
                    v25 = v23.method_31548();
                    while (true) {
                        if ((v26 /* !! */  = (cfr_temp_9 = gn.hf - gn.deeu("dfek", defa(int ), (int)105)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                        if (v26 /* !! */  == gn.deeu("dfel", deer(int ), (int)113)) break;
                        v26 /* !! */  = (long)gn.deeu("dfem", deer(int ), (int)114);
                    }
                    v27 = v25.method_5438((int)var4_7);
                    while (true) {
                        if ((v28 /* !! */  = (cfr_temp_10 = gn.hf - gn.deeu("dfen", defa(int ), (int)106)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                        if (v28 /* !! */  == gn.deeu("dfeo", deer(int ), (int)115)) break;
                        v28 /* !! */  = (long)gn.deeu("dfep", deer(int ), (int)116);
                    }
                    var5_8 = gn.miningScore(v27, var1_1);
                    if (var6_4 || var6_4) ** GOTO lbl32
                    if (!(var5_8 > var3_6)) break block52;
                    if (var6_4 || var6_4) ** GOTO lbl32
                    var3_6 = var5_8;
                    if (var6_4 || var6_4) ** GOTO lbl32
                    var2_5 /* !! */  = (int)var4_7;
                    if (var6_4) ** GOTO lbl32
                }
                if (var6_4 || var6_4) ** GOTO lbl32
                ++var4_7;
                if (var6_4) ** GOTO lbl32
            } while (!var8_2);
            throw null;
        }
        if (!var6_4 && !var6_4) ** break;
        ** while (true)
        return var2_5 /* !! */ ;
    }

    private static /* synthetic */ void dfiv() {
        gn.defc[0] = -5337733643864877369L;
        gn.defc[1] = 3554764370599124982L;
        gn.defc[2] = -1593941348239447616L;
        gn.defc[3] = 4376239080930397908L;
        gn.defc[4] = -6136540581480393650L;
        gn.defc[5] = 9073206627945546594L;
        gn.defc[6] = -6719592295520713519L;
        gn.defc[7] = -6574839300910343437L;
        gn.defc[8] = 4355587444527436927L;
        gn.defc[9] = 8882483784419571754L;
        gn.defc[10] = -1938176825189455134L;
        gn.defc[11] = -1902182664495076933L;
        gn.defc[12] = -3216894830894962733L;
        gn.defc[13] = 7950988337710726802L;
        gn.defc[14] = -1563261280289825229L;
        gn.defc[15] = 8117173583177494410L;
        gn.defc[16] = -5308444262910082429L;
        gn.defc[17] = 8214825218402144110L;
        gn.defc[18] = -7635958639632748567L;
        gn.defc[19] = 9066541385806904485L;
        gn.defc[20] = -8115156546267613493L;
        gn.defc[21] = 4890725383531014748L;
        gn.defc[22] = -8709584898990441750L;
        gn.defc[23] = 4010083230065873875L;
        gn.defc[24] = -6117015038748237794L;
        gn.defc[25] = -2696532320020824169L;
        gn.defc[26] = 7608320311402660653L;
        gn.defc[27] = 4242118565529125484L;
        gn.defc[28] = 3761764183763698613L;
        gn.defc[29] = -7985276168531979842L;
        gn.defc[30] = -3717743455099314540L;
        gn.defc[31] = 3801264531426698525L;
        gn.defc[32] = -8016162948716686551L;
        gn.defc[33] = 3271359820323866748L;
        gn.defc[34] = -5954802831949412153L;
        gn.defc[35] = -4608424913483911186L;
        gn.defc[36] = -5301642063044583877L;
        gn.defc[37] = -4287796091943758794L;
        gn.defc[38] = -5906303809826546903L;
        gn.defc[39] = -3683632247641189893L;
        gn.defc[40] = -3250514380508524052L;
        gn.defc[41] = 7580743555175098524L;
        gn.defc[42] = 550564284955436806L;
        gn.defc[43] = -8728425803330526840L;
        gn.defc[44] = 6456272116126670263L;
        gn.defc[45] = 866628875099902726L;
        gn.defc[46] = -8741295272990833571L;
        gn.defc[47] = -1420578267049397937L;
        gn.defc[48] = 8438111769357371360L;
        gn.defc[49] = 4555227512549392850L;
        gn.defc[50] = -1595502435492676708L;
        gn.defc[51] = 2645926376901402559L;
        gn.defc[52] = 877915786315281088L;
        gn.defc[53] = -606438577499994952L;
        gn.defc[54] = -5279908734426790422L;
        gn.defc[55] = 1600347668047191675L;
        gn.defc[56] = 2454201145135373245L;
        gn.defc[57] = 5521606430616198373L;
        gn.defc[58] = -3388401040734311259L;
        gn.defc[59] = -2158593306784286128L;
        gn.defc[60] = -6262998533538617038L;
        gn.defc[61] = 3263687134659878267L;
        gn.defc[62] = -7655389149396403714L;
        gn.defc[63] = -4087618048138821748L;
        gn.defc[64] = -5554474242611556629L;
        gn.defc[65] = 5342241300895428606L;
        gn.defc[66] = 2252922246135533401L;
        gn.defc[67] = 2030455405232297042L;
        gn.defc[68] = -7440710082007177206L;
        gn.defc[69] = 8248768911418133228L;
        gn.defc[70] = -179393638970692976L;
        gn.defc[71] = -3582356808835131361L;
        gn.defc[72] = 5489639515380726757L;
        gn.defc[73] = 3614125516940608705L;
        gn.defc[74] = 3824614367675098444L;
        gn.defc[75] = -4979836743473680106L;
        gn.defc[76] = -7273763832867611431L;
        gn.defc[77] = 4578033495722051552L;
        gn.defc[78] = 8984636820838914089L;
        gn.defc[79] = -195303886588481264L;
        gn.defc[80] = 1316660447468231205L;
        gn.defc[81] = 9126192517576205714L;
        gn.defc[82] = 742804875194890938L;
        gn.defc[83] = 5243939548939120339L;
        gn.defc[84] = -5345169136664296253L;
        gn.defc[85] = 2363123177284295656L;
        gn.defc[86] = -6063999398986660431L;
        gn.defc[87] = 4328801736347276387L;
        gn.defc[88] = -7238319503313834896L;
        gn.defc[89] = -3267103619120633679L;
        gn.defc[90] = 1690548251482154375L;
        gn.defc[91] = 4210048967619260051L;
        gn.defc[92] = 7433635041578209019L;
        gn.defc[93] = -176306937599915398L;
        gn.defc[94] = -2161186743280403064L;
        gn.defc[95] = -2903305686507061528L;
        gn.defc[96] = -9037207065618538586L;
        gn.defc[97] = 3702098404418998487L;
        gn.defc[98] = 2325187970048574737L;
        gn.defc[99] = -5625965067264841914L;
    }

    private static /* synthetic */ int deer(int n2) {
        return dees[n2] ^ deet[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float miningScore(class_1799 var0, class_2680 var1_1) {
        v0 /* !! */  = gn.hf;
        if (true) ** GOTO lbl5
        block29: while (true) {
            v0 /* !! */  = (long)(v1 - gn.deeu("dffq", defa(int ), (int)107));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -450182240: {
                    v1 = gn.deeu("dffr", defa(int ), (int)108);
                    continue block29;
                }
                case -5609813: {
                    break block29;
                }
                case 401155353: {
                    v1 = gn.deeu("dffs", defa(int ), (int)109);
                    continue block29;
                }
                case 529905094: {
                    v1 = gn.deeu("dfft", defa(int ), (int)110);
                    continue block29;
                }
            }
            break;
        }
        var5_2 = gn.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = gn.hf - gn.deeu("dffu", defa(int ), (int)111)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gn.deeu("dffv", deer(int ), (int)143)) break;
            v2 /* !! */  = (long)gn.deeu("dffw", deer(int ), (int)144);
        }
        var4_3 /* !! */  = gn.b;
        v3 /* !! */  = gn.hf;
        if (true) ** GOTO lbl29
        block31: while (true) {
            v3 /* !! */  = (long)(v4 - gn.deeu("dffx", defa(int ), (int)112));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -429448254: {
                    v4 = gn.deeu("dffy", defa(int ), (int)113);
                    continue block31;
                }
                case -5609813: {
                    break block31;
                }
                case 186950059: {
                    v4 = gn.deeu("dffz", defa(int ), (int)114);
                    continue block31;
                }
                case 431439896: {
                    v4 = gn.deeu("dfga", defa(int ), (int)115);
                    continue block31;
                }
            }
            break;
        }
        var3_4 = gn.a;
        if (var5_2) {
            throw null;
lbl44:
            // 2 sources

            return (float)gn.deeu("dfgc", dfgb(int ), (int)145);
        }
        if (var3_4 || var3_4) ** GOTO lbl44
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = gn.hf;
                if (true) ** GOTO lbl54
                block33: while (true) {
                    v5 /* !! */  = (long)(gn.deeu("dfge", defa(int ), (int)117) - gn.deeu("dfgd", defa(int ), (int)116));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -5609813: {
                            break block33;
                        }
                        case 1595817901: {
                            continue block33;
                        }
                    }
                    break;
                }
                var2_5 = var0.method_7924(var1_1);
                if (var3_4 || var3_4) ** continue;
                v6 /* !! */  = gn.hf;
                if (true) ** GOTO lbl65
                block34: while (true) {
                    v6 /* !! */  = (long)(v7 - gn.deeu("dfgf", defa(int ), (int)118));
lbl65:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1080371617: {
                            v7 = gn.deeu("dfgg", defa(int ), (int)119);
                            continue block34;
                        }
                        case -5609813: {
                            break block34;
                        }
                        case 1303877277: {
                            v7 = gn.deeu("dfgh", defa(int ), (int)120);
                            continue block34;
                        }
                    }
                    break;
                }
                if (var0.method_7951(var1_1)) {
                    v8 /* !! */  = (float)gn.deeu("dfgi", dfgb(int ), (int)146);
                    if (var5_2) {
                        throw null;
                    }
                } else {
                    v8 /* !! */  = 0.0f;
                }
                return var2_5 + v8 /* !! */ ;
            }
lbl81:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)gn.deeu("dfgj", deer(int ), (int)147);
                if (var5_2) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var4_3 /* !! */  = (int)gn.deeu("dfgk", deer(int ), (int)148);
                } while (!var5_2);
                throw null;
            }
            case 2: {
                var4_3 /* !! */  = (int)gn.deeu("dfgl", deer(int ), (int)149);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl100
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)gn.deeu("dfgm", deer(int ), (int)150);
                    if (!var5_2) ** GOTO lbl81
                    throw null;
                }
            }
lbl100:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)gn.deeu("dfgn", deer(int ), (int)151);
                if (!var5_2) break;
                throw null;
            }
            case 5: 
        }
        var4_3 /* !! */  = (int)gn.deeu("dfgo", deer(int ), (int)152);
        ** while (!var5_2)
lbl107:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dfiw() {
        gn.defc[100] = -4826492819733722253L;
        gn.defc[101] = -6387611617359552017L;
        gn.defc[102] = -1922927460574806429L;
        gn.defc[103] = -1236442782734739466L;
        gn.defc[104] = -7336200465757810139L;
        gn.defc[105] = -5626795110801357693L;
        gn.defc[106] = -6622661409590486903L;
        gn.defc[107] = 2775844325389741010L;
        gn.defc[108] = 6871346427248275068L;
        gn.defc[109] = -6056933478540278927L;
        gn.defc[110] = 2960565624885135745L;
        gn.defc[111] = -2133504509954149146L;
        gn.defc[112] = -3680181962515414077L;
        gn.defc[113] = -5027411295590318053L;
        gn.defc[114] = -5786117434702743766L;
        gn.defc[115] = -346617909564879604L;
        gn.defc[116] = 7875982583917784413L;
        gn.defc[117] = 4165700269953958684L;
        gn.defc[118] = 7607441757617294729L;
        gn.defc[119] = 7948926217118230954L;
        gn.defc[120] = 2655628922293183898L;
        gn.defc[121] = 5738987317502394316L;
        gn.defc[122] = -1479273709500378083L;
        gn.defc[123] = 7881303608386856296L;
        gn.defc[124] = -4196888268418280669L;
        gn.defc[125] = -5549552565750376624L;
        gn.defc[126] = 354167395502152051L;
        gn.defc[127] = -1870028607718968329L;
        gn.defc[128] = 841887734187823813L;
        gn.defc[129] = -5760958832763938485L;
        gn.defc[130] = -3047112926465315204L;
        gn.defc[131] = 6313559709478233844L;
        gn.defc[132] = 3893049863264510636L;
        gn.defc[133] = 7980787445359172964L;
        gn.defc[134] = 7414741361710820112L;
        gn.defc[135] = -1971911293636373859L;
        gn.defc[136] = -7478007140021742621L;
        gn.defc[137] = 1872747171071220509L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onBlockBreaking(bk var1_1) {
        block134: {
            block133: {
                v0 /* !! */  = gn.hf;
                if (true) ** GOTO lbl5
                block81: while (true) {
                    v0 /* !! */  = (long)(gn.deeu("defe", defa(int ), (int)1) - gn.deeu("defd", defa(int ), (int)0));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -5609813: {
                            break block81;
                        }
                        case 1079590478: {
                            continue block81;
                        }
                    }
                    break;
                }
                var6_2 = gn.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_0 = gn.hf - gn.deeu("deff", defa(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == gn.deeu("defg", deer(int ), (int)5)) break;
                    v1 /* !! */  = (long)gn.deeu("defh", deer(int ), (int)6);
                }
                var5_3 /* !! */  = gn.b;
                v2 /* !! */  = gn.hf;
                if (true) ** GOTO lbl21
                block83: while (true) {
                    v2 /* !! */  = (long)(gn.deeu("defj", defa(int ), (int)4) - gn.deeu("defi", defa(int ), (int)3));
lbl21:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -5609813: {
                            break block83;
                        }
                        case 2093934719: {
                            continue block83;
                        }
                    }
                    break;
                }
                var4_4 = gn.a;
                if (var6_2) {
                    throw null;
lbl29:
                    // 14 sources

                    return;
                }
                if (var4_4 || var4_4) ** GOTO lbl29
                v3 /* !! */  = gn.hf;
                if (true) ** GOTO lbl36
                block85: while (true) {
                    v3 /* !! */  = (long)(v4 - gn.deeu("defk", defa(int ), (int)5));
lbl36:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1954459000: {
                            v4 = gn.deeu("defl", defa(int ), (int)6);
                            continue block85;
                        }
                        case -5609813: {
                            break block85;
                        }
                        case 1103095439: {
                            v4 = gn.deeu("defm", defa(int ), (int)7);
                            continue block85;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = gn.hf - gn.deeu("defn", defa(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == gn.deeu("defo", deer(int ), (int)7)) break;
                    v5 /* !! */  = (long)gn.deeu("defp", deer(int ), (int)8);
                }
                if (gn.mc.field_1724 == null) break block133;
                if (var4_4) ** GOTO lbl29
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = gn.hf - gn.deeu("defq", defa(int ), (int)9)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == gn.deeu("defr", deer(int ), (int)9)) break;
                    v6 /* !! */  = (long)gn.deeu("defs", deer(int ), (int)10);
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = gn.hf - gn.deeu("deft", defa(int ), (int)10)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == gn.deeu("defu", deer(int ), (int)11)) break;
                    v7 /* !! */  = (long)gn.deeu("defv", deer(int ), (int)12);
                }
                if (gn.mc.field_1687 == null) break block133;
                if (var4_4) ** GOTO lbl29
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = gn.hf - gn.deeu("defw", defa(int ), (int)11)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == gn.deeu("defx", deer(int ), (int)13)) break;
                    v8 /* !! */  = (long)gn.deeu("defy", deer(int ), (int)14);
                }
                v9 = var1_1.blockPos();
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = gn.hf - gn.deeu("defz", defa(int ), (int)12)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == gn.deeu("dega", deer(int ), (int)15)) break;
                    v10 /* !! */  = (long)gn.deeu("degb", deer(int ), (int)16);
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_6 = gn.hf - gn.deeu("degc", defa(int ), (int)13)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == gn.deeu("degd", deer(int ), (int)17)) break;
                    v11 /* !! */  = (long)gn.deeu("dege", deer(int ), (int)18);
                }
                if (!v9.equals((Object)this.activeBlock)) break block134;
                if (var4_4) ** GOTO lbl29
            }
            if (var4_4 || var4_4) ** GOTO lbl29
            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl29
        v12 /* !! */  = gn.hf;
        if (true) ** GOTO lbl91
        block92: while (true) {
            v12 /* !! */  = (long)(v13 - gn.deeu("degf", defa(int ), (int)14));
lbl91:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1882675690: {
                    v13 = gn.deeu("degg", defa(int ), (int)15);
                    continue block92;
                }
                case -5609813: {
                    break block92;
                }
                case 1281299256: {
                    v13 = gn.deeu("degh", defa(int ), (int)16);
                    continue block92;
                }
                case 1930096650: {
                    v13 = gn.deeu("degi", defa(int ), (int)17);
                    continue block92;
                }
            }
            break;
        }
        this.restoreSlot();
        if (var4_4 || var4_4) ** GOTO lbl29
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_7 = gn.hf - gn.deeu("degj", defa(int ), (int)18)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == gn.deeu("degk", deer(int ), (int)19)) break;
            v14 /* !! */  = (long)gn.deeu("degl", deer(int ), (int)20);
        }
        v15 = var1_1.blockPos();
        v16 /* !! */  = gn.hf;
        if (true) ** GOTO lbl115
        block94: while (true) {
            v16 /* !! */  = (long)(v17 - gn.deeu("degm", defa(int ), (int)19));
lbl115:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1987016106: {
                    v17 = gn.deeu("degn", defa(int ), (int)20);
                    continue block94;
                }
                case -5609813: {
                    break block94;
                }
                case 1624112341: {
                    v17 = gn.deeu("dego", defa(int ), (int)21);
                    continue block94;
                }
            }
            break;
        }
        v18 = v15.method_10062();
        v19 /* !! */  = gn.hf;
        if (true) ** GOTO lbl129
        block95: while (true) {
            v19 /* !! */  = (long)(gn.deeu("degq", defa(int ), (int)23) - gn.deeu("degp", defa(int ), (int)22));
lbl129:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -1524603411: {
                    continue block95;
                }
                case -5609813: {
                    break block95;
                }
            }
            break;
        }
        this.activeBlock = v18;
        if (var4_4 || var4_4) ** GOTO lbl29
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_8 = gn.hf - gn.deeu("degr", defa(int ), (int)24)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == gn.deeu("degs", deer(int ), (int)21)) break;
            v20 /* !! */  = (long)gn.deeu("degt", deer(int ), (int)22);
        }
        v21 /* !! */  = gn.hf;
        if (true) ** GOTO lbl145
        block97: while (true) {
            v21 /* !! */  = (long)(v22 - gn.deeu("degu", defa(int ), (int)25));
lbl145:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -1064363351: {
                    v22 = gn.deeu("degv", defa(int ), (int)26);
                    continue block97;
                }
                case -193698350: {
                    v22 = gn.deeu("degw", defa(int ), (int)27);
                    continue block97;
                }
                case -5609813: {
                    break block97;
                }
            }
            break;
        }
        v23 = gn.mc.field_1724;
        v24 /* !! */  = gn.hf;
        if (true) ** GOTO lbl159
        block98: while (true) {
            v24 /* !! */  = (long)(v25 - gn.deeu("degx", defa(int ), (int)28));
lbl159:
            // 2 sources

            switch ((int)v24 /* !! */ ) {
                case -835963326: {
                    v25 = gn.deeu("degy", defa(int ), (int)29);
                    continue block98;
                }
                case -5609813: {
                    break block98;
                }
                case 2119237323: {
                    v25 = gn.deeu("degz", defa(int ), (int)30);
                    continue block98;
                }
            }
            break;
        }
        v26 = v23.method_31548();
        while (true) {
            if ((v27 /* !! */  = (cfr_temp_9 = gn.hf - gn.deeu("deha", defa(int ), (int)31)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v27 /* !! */  == gn.deeu("dehb", deer(int ), (int)23)) break;
            v27 /* !! */  = (long)gn.deeu("dehc", deer(int ), (int)24);
        }
        v28 = v26.method_67532();
        while (true) {
            if ((v29 /* !! */  = (cfr_temp_10 = gn.hf - gn.deeu("dehd", defa(int ), (int)32)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v29 /* !! */  == gn.deeu("dehe", deer(int ), (int)25)) break;
            v29 /* !! */  = (long)gn.deeu("dehf", deer(int ), (int)26);
        }
        this.previousSlot = v28;
        if (var4_4 || var4_4) ** GOTO lbl29
        while (true) {
            if ((v30 /* !! */  = (cfr_temp_11 = gn.hf - gn.deeu("dehg", defa(int ), (int)33)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v30 /* !! */  == gn.deeu("dehh", deer(int ), (int)27)) break;
            v30 /* !! */  = (long)gn.deeu("dehi", deer(int ), (int)28);
        }
        v31 /* !! */  = gn.hf;
        if (true) ** GOTO lbl191
        block102: while (true) {
            v31 /* !! */  = (long)(v32 - gn.deeu("dehj", defa(int ), (int)34));
lbl191:
            // 2 sources

            switch ((int)v31 /* !! */ ) {
                case -1228522520: {
                    v32 = gn.deeu("dehk", defa(int ), (int)35);
                    continue block102;
                }
                case -503414781: {
                    v32 = gn.deeu("dehl", defa(int ), (int)36);
                    continue block102;
                }
                case -5609813: {
                    break block102;
                }
            }
            break;
        }
        v33 = gn.mc.field_1687;
        v34 /* !! */  = gn.hf;
        if (true) ** GOTO lbl205
        block103: while (true) {
            v34 /* !! */  = (long)(gn.deeu("dehn", defa(int ), (int)38) - gn.deeu("dehm", defa(int ), (int)37));
lbl205:
            // 2 sources

            switch ((int)v34 /* !! */ ) {
                case -5609813: {
                    break block103;
                }
                case 1004168825: {
                    continue block103;
                }
            }
            break;
        }
        v35 /* !! */  = gn.hf;
        if (true) ** GOTO lbl214
        block104: while (true) {
            v35 /* !! */  = (long)(v36 - gn.deeu("deho", defa(int ), (int)39));
lbl214:
            // 2 sources

            switch ((int)v35 /* !! */ ) {
                case -69021344: {
                    v36 = gn.deeu("dehp", defa(int ), (int)40);
                    continue block104;
                }
                case -5609813: {
                    break block104;
                }
                case 962802096: {
                    v36 = gn.deeu("dehq", defa(int ), (int)41);
                    continue block104;
                }
            }
            break;
        }
        var2_5 = v33.method_8320(this.activeBlock);
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        block52 : switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4 || var4_4) ** GOTO lbl29
                while (true) {
                    if ((v37 /* !! */  = (cfr_temp_12 = gn.hf - gn.deeu("dehr", defa(int ), (int)42)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v37 /* !! */  == gn.deeu("dehs", deer(int ), (int)29)) break;
                    v37 /* !! */  = (long)gn.deeu("deyv", deer(int ), (int)30);
                }
                var3_6 = this.findBestTool(var2_5);
                if (var4_4 || var4_4) ** GOTO lbl29
                while (true) {
                    if ((v38 /* !! */  = (cfr_temp_13 = gn.hf - gn.deeu("deyw", defa(int ), (int)43)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v38 /* !! */  == gn.deeu("deyx", deer(int ), (int)31)) break;
                    v38 /* !! */  = (long)gn.deeu("deyy", deer(int ), (int)32);
                }
                if (var3_6 == this.previousSlot) ** GOTO lbl249
                if (var4_4 || var4_4) ** GOTO lbl29
                while (true) {
                    if ((v39 /* !! */  = (cfr_temp_14 = gn.hf - gn.deeu("deyz", defa(int ), (int)44)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v39 /* !! */  == gn.deeu("deza", deer(int ), (int)33)) break;
                    v39 /* !! */  = (long)gn.deeu("dezb", deer(int ), (int)34);
                }
                nv.selectSlot(var3_6);
                if (var4_4) ** GOTO lbl29
lbl249:
                // 2 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl252:
            // 3 sources

            case 0: {
                var5_3 /* !! */  = (int)gn.deeu("dezc", deer(int ), (int)35);
                if (var6_2) {
                    throw null;
                }
            }
            case 1: {
                var5_3 /* !! */  = (int)gn.deeu("dezd", deer(int ), (int)36);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl367
            }
            case 2: {
                var5_3 /* !! */  = (int)gn.deeu("deze", deer(int ), (int)37);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl305
            }
lbl266:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)gn.deeu("dezf", deer(int ), (int)38);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl367
            }
lbl271:
            // 2 sources

            case 4: {
                var5_3 /* !! */  = (int)gn.deeu("dezg", deer(int ), (int)39);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl276:
            // 2 sources

            case 5: {
                var5_3 /* !! */  = (int)gn.deeu("dezh", deer(int ), (int)40);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl346
            }
lbl281:
            // 3 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)gn.deeu("dezi", deer(int ), (int)41);
                    if (!var6_2) break block52;
                    throw null;
                }
            }
lbl286:
            // 2 sources

            case 7: {
                var5_3 /* !! */  = (int)gn.deeu("dezj", deer(int ), (int)42);
                if (!var6_2) ** GOTO lbl252
                throw null;
            }
            case 8: {
                var5_3 /* !! */  = (int)gn.deeu("dezk", deer(int ), (int)43);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl319
            }
            case 9: {
                var5_3 /* !! */  = (int)gn.deeu("dezl", deer(int ), (int)44);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl359
            }
lbl300:
            // 3 sources

            case 10: {
                var5_3 /* !! */  = (int)gn.deeu("dezm", deer(int ), (int)45);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl337
            }
lbl305:
            // 2 sources

            case 11: {
                var5_3 /* !! */  = (int)gn.deeu("dezn", deer(int ), (int)46);
                if (!var6_2) ** GOTO lbl252
                throw null;
            }
            case 12: {
                var5_3 /* !! */  = (int)gn.deeu("dezo", deer(int ), (int)47);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl337
            }
            case 13: {
                var5_3 /* !! */  = (int)gn.deeu("dezp", deer(int ), (int)48);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl332
            }
lbl319:
            // 2 sources

            case 14: {
                var5_3 /* !! */  = (int)gn.deeu("dezq", deer(int ), (int)49);
                if (!var6_2) ** GOTO lbl286
                throw null;
            }
            case 15: {
                var5_3 /* !! */  = (int)gn.deeu("dezr", deer(int ), (int)50);
                if (!var6_2) ** GOTO lbl300
                throw null;
            }
            case 16: {
                var5_3 /* !! */  = (int)gn.deeu("dezs", deer(int ), (int)51);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl346
            }
lbl332:
            // 3 sources

            case 17: {
                var5_3 /* !! */  = (int)gn.deeu("dezt", deer(int ), (int)52);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl363
            }
lbl337:
            // 3 sources

            case 18: {
                var5_3 /* !! */  = (int)gn.deeu("dezu", deer(int ), (int)53);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl359
            }
            case 19: {
                var5_3 /* !! */  = (int)gn.deeu("dezv", deer(int ), (int)54);
                if (!var6_2) ** GOTO lbl271
                throw null;
            }
lbl346:
            // 3 sources

            case 20: {
                var5_3 /* !! */  = (int)gn.deeu("dezw", deer(int ), (int)55);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl367
            }
            case 21: {
                var5_3 /* !! */  = (int)gn.deeu("dezx", deer(int ), (int)56);
                if (!var6_2) ** GOTO lbl332
                throw null;
            }
            case 22: {
                var5_3 /* !! */  = (int)gn.deeu("dezy", deer(int ), (int)57);
                if (!var6_2) ** GOTO lbl281
                throw null;
            }
lbl359:
            // 3 sources

            case 23: {
                var5_3 /* !! */  = (int)gn.deeu("dezz", deer(int ), (int)58);
                if (!var6_2) ** GOTO lbl300
                throw null;
            }
lbl363:
            // 2 sources

            case 24: {
                var5_3 /* !! */  = (int)gn.deeu("dfaa", deer(int ), (int)59);
                if (!var6_2) ** GOTO lbl266
                throw null;
            }
lbl367:
            // 4 sources

            case 25: {
                var5_3 /* !! */  = (int)gn.deeu("dfab", deer(int ), (int)60);
                if (!var6_2) ** GOTO lbl276
                throw null;
            }
            case 26: 
        }
        var5_3 /* !! */  = (int)gn.deeu("dfac", deer(int ), (int)61);
        ** while (!var6_2)
lbl374:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float dfgb(int n2) {
        return Float.intBitsToFloat(dees[n2] ^ deet[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void restoreSlot() {
        v0 /* !! */  = gn.hf;
        if (true) ** GOTO lbl5
        block29: while (true) {
            v0 /* !! */  = (long)(v1 - gn.deeu("dfgp", defa(int ), (int)121));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1587885662: {
                    v1 = gn.deeu("dfgq", defa(int ), (int)122);
                    continue block29;
                }
                case -1340950572: {
                    v1 = gn.deeu("dfgr", defa(int ), (int)123);
                    continue block29;
                }
                case -5609813: {
                    break block29;
                }
                case 1645242593: {
                    v1 = gn.deeu("dfgs", defa(int ), (int)124);
                    continue block29;
                }
            }
            break;
        }
        var3_1 = gn.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = gn.hf - gn.deeu("dfgt", defa(int ), (int)125)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == gn.deeu("dfgu", deer(int ), (int)153)) break;
            v2 /* !! */  = (long)gn.deeu("dfgv", deer(int ), (int)154);
        }
        var2_2 /* !! */  = gn.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = gn.hf - gn.deeu("dfgw", defa(int ), (int)126)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == gn.deeu("dfgx", deer(int ), (int)155)) break;
            v3 /* !! */  = (long)gn.deeu("dfgy", deer(int ), (int)156);
        }
        var1_3 = gn.a;
        if (var3_1) {
            throw null;
lbl32:
            // 8 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = gn.hf - gn.deeu("dfgz", defa(int ), (int)127)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == gn.deeu("dfha", deer(int ), (int)157)) break;
            v4 /* !! */  = (long)gn.deeu("dfhb", deer(int ), (int)158);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = gn.hf - gn.deeu("dfhc", defa(int ), (int)128)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == gn.deeu("dfhd", deer(int ), (int)159)) break;
            v5 /* !! */  = (long)gn.deeu("dfhe", deer(int ), (int)160);
        }
        if (gn.mc.field_1724 == null) ** GOTO lbl87
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl32
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = gn.hf - gn.deeu("dfhf", defa(int ), (int)129)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == gn.deeu("dfhg", deer(int ), (int)161)) break;
                    v6 /* !! */  = (long)gn.deeu("dfhh", deer(int ), (int)162);
                }
                if (this.previousSlot < 0) ** GOTO lbl87
                if (var1_3) ** GOTO lbl32
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_5 = gn.hf - gn.deeu("dfhi", defa(int ), (int)130)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == gn.deeu("dfhj", deer(int ), (int)163)) break;
                    v7 /* !! */  = (long)gn.deeu("dfhk", deer(int ), (int)164);
                }
                if (this.previousSlot >= gn.deeu("dfhl", deer(int ), (int)165)) ** GOTO lbl87
                if (var1_3 || var1_3) ** GOTO lbl32
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_6 = gn.hf - gn.deeu("dfhm", defa(int ), (int)131)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == gn.deeu("dfhn", deer(int ), (int)166)) break;
                    v8 /* !! */  = (long)gn.deeu("dfho", deer(int ), (int)167);
                }
                v9 /* !! */  = gn.hf;
                if (true) ** GOTO lbl73
                block38: while (true) {
                    v9 /* !! */  = (long)(v10 - gn.deeu("dfhp", defa(int ), (int)132));
lbl73:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1077614714: {
                            v10 = gn.deeu("dfhq", defa(int ), (int)133);
                            continue block38;
                        }
                        case -5609813: {
                            break block38;
                        }
                        case 895497133: {
                            v10 = gn.deeu("dfhr", defa(int ), (int)134);
                            continue block38;
                        }
                        case 1252310390: {
                            v10 = gn.deeu("dfhs", defa(int ), (int)135);
                            continue block38;
                        }
                    }
                    break;
                }
                nv.selectSlot(this.previousSlot);
                if (var1_3) ** GOTO lbl32
lbl87:
                // 4 sources

                if (var1_3 || var1_3) ** GOTO lbl32
                v11 = gn.deeu("dfht", deer(int ), (int)168);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_7 = gn.hf - gn.deeu("dfhu", defa(int ), (int)136)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == gn.deeu("dfhv", deer(int ), (int)169)) break;
                    v12 /* !! */  = (long)gn.deeu("dfhw", deer(int ), (int)170);
                }
                this.previousSlot = (int)v11;
                if (var1_3 || var1_3) ** GOTO lbl32
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_8 = gn.hf - gn.deeu("dfhx", defa(int ), (int)137)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == gn.deeu("dfhy", deer(int ), (int)171)) break;
                    v13 /* !! */  = (long)gn.deeu("dfhz", deer(int ), (int)172);
                }
                this.activeBlock = null;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)gn.deeu("dfia", deer(int ), (int)173);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 1: {
                var2_2 /* !! */  = (int)gn.deeu("dfib", deer(int ), (int)174);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 2: {
                var2_2 /* !! */  = (int)gn.deeu("dfic", deer(int ), (int)175);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 3: {
                var2_2 /* !! */  = (int)gn.deeu("dfid", deer(int ), (int)176);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 4: {
                var2_2 /* !! */  = (int)gn.deeu("dfie", deer(int ), (int)177);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 5: {
                var2_2 /* !! */  = (int)gn.deeu("dfif", deer(int ), (int)178);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl135:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)gn.deeu("dfig", deer(int ), (int)179);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl140:
            // 5 sources

            case 7: {
                var2_2 /* !! */  = (int)gn.deeu("dfih", deer(int ), (int)180);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 8: {
                var2_2 /* !! */  = (int)gn.deeu("dfii", deer(int ), (int)181);
                if (!var3_1) ** GOTO lbl140
                throw null;
            }
lbl149:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)gn.deeu("dfij", deer(int ), (int)182);
                if (!var3_1) break;
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)gn.deeu("dfik", deer(int ), (int)183);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl158:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)gn.deeu("dfil", deer(int ), (int)184);
                if (!var3_1) ** GOTO lbl140
                throw null;
            }
lbl162:
            // 4 sources

            case 12: {
                var2_2 /* !! */  = (int)gn.deeu("dfim", deer(int ), (int)185);
                if (!var3_1) break;
                throw null;
            }
lbl166:
            // 3 sources

            case 13: {
                var2_2 /* !! */  = (int)gn.deeu("dfin", deer(int ), (int)186);
                if (!var3_1) ** GOTO lbl135
                throw null;
            }
            case 14: 
        }
        do {
            var2_2 /* !! */  = (int)gn.deeu("dfio", deer(int ), (int)187);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void dfip() {
        gn.dees[0] = 1687992671;
        gn.dees[1] = -1095309666;
        gn.dees[2] = 2105664596;
        gn.dees[3] = 742658058;
        gn.dees[4] = 1114553181;
        gn.dees[5] = 1619306711;
        gn.dees[6] = 852087693;
        gn.dees[7] = -1903238198;
        gn.dees[8] = 2145810487;
        gn.dees[9] = -1314371833;
        gn.dees[10] = 897792764;
        gn.dees[11] = -551431986;
        gn.dees[12] = -1953920076;
        gn.dees[13] = 1435949847;
        gn.dees[14] = 1544671454;
        gn.dees[15] = 600582861;
        gn.dees[16] = -1604819272;
        gn.dees[17] = 827053279;
        gn.dees[18] = 110489102;
        gn.dees[19] = 676730066;
        gn.dees[20] = 1898348133;
        gn.dees[21] = 1143494101;
        gn.dees[22] = -481673463;
        gn.dees[23] = -1354593588;
        gn.dees[24] = -1828870794;
        gn.dees[25] = 861691978;
        gn.dees[26] = -1254271420;
        gn.dees[27] = 973934801;
        gn.dees[28] = -1781333004;
        gn.dees[29] = -1169181872;
        gn.dees[30] = 1481861286;
        gn.dees[31] = -870829572;
        gn.dees[32] = 1392372390;
        gn.dees[33] = -618994648;
        gn.dees[34] = 1817319284;
        gn.dees[35] = 1583862682;
        gn.dees[36] = 362759672;
        gn.dees[37] = -1786290601;
        gn.dees[38] = -905345517;
        gn.dees[39] = -1017794021;
        gn.dees[40] = 613578162;
        gn.dees[41] = -1698437424;
        gn.dees[42] = 108886086;
        gn.dees[43] = 1197832191;
        gn.dees[44] = 1917201240;
        gn.dees[45] = -1891930322;
        gn.dees[46] = 610837086;
        gn.dees[47] = 1554553716;
        gn.dees[48] = -178820292;
        gn.dees[49] = -74917880;
        gn.dees[50] = -1687427509;
        gn.dees[51] = 1093597357;
        gn.dees[52] = -618464775;
        gn.dees[53] = -1924058982;
        gn.dees[54] = -928549727;
        gn.dees[55] = 1987514266;
        gn.dees[56] = -1436381085;
        gn.dees[57] = 1513832548;
        gn.dees[58] = 582915838;
        gn.dees[59] = 870805946;
        gn.dees[60] = -1742295496;
        gn.dees[61] = 763622743;
        gn.dees[62] = -1480130142;
        gn.dees[63] = -597090592;
        gn.dees[64] = -1588087602;
        gn.dees[65] = 1968321479;
        gn.dees[66] = 366057652;
        gn.dees[67] = 980951590;
        gn.dees[68] = 1919616178;
        gn.dees[69] = 1817940769;
        gn.dees[70] = 1696200068;
        gn.dees[71] = -1551125435;
        gn.dees[72] = 2061391776;
        gn.dees[73] = -514160903;
        gn.dees[74] = -1695539157;
        gn.dees[75] = 1377897244;
        gn.dees[76] = 1011241613;
        gn.dees[77] = 652275557;
        gn.dees[78] = -406688942;
        gn.dees[79] = -1987298484;
        gn.dees[80] = 2016771442;
        gn.dees[81] = 1059967841;
        gn.dees[82] = -918490619;
        gn.dees[83] = -642928867;
        gn.dees[84] = 926660993;
        gn.dees[85] = -111428700;
        gn.dees[86] = 1968475599;
        gn.dees[87] = 1698630955;
        gn.dees[88] = 2136025995;
        gn.dees[89] = 222527103;
        gn.dees[90] = -1484566461;
        gn.dees[91] = 595153670;
        gn.dees[92] = -488710488;
        gn.dees[93] = 748716155;
        gn.dees[94] = 132525674;
        gn.dees[95] = -265636201;
        gn.dees[96] = 1077572096;
        gn.dees[97] = -2138597070;
        gn.dees[98] = -1537617390;
        gn.dees[99] = 1000374088;
    }

    public static /* synthetic */ CallSite deeu(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void dfiu() {
        gn.defb[100] = -3224153289898244659L;
        gn.defb[101] = 7231740595254870837L;
        gn.defb[102] = -1864154032766744695L;
        gn.defb[103] = -3777722024343567106L;
        gn.defb[104] = 6090537663774774605L;
        gn.defb[105] = 50055422210338747L;
        gn.defb[106] = -9018878921978032823L;
        gn.defb[107] = -2275255449103817616L;
        gn.defb[108] = -5377161661138723962L;
        gn.defb[109] = 6110431357384526301L;
        gn.defb[110] = -2152730715278468240L;
        gn.defb[111] = -557629599918796113L;
        gn.defb[112] = 6974922633291828317L;
        gn.defb[113] = -6725630547438429078L;
        gn.defb[114] = 8304623646209510914L;
        gn.defb[115] = -3862186342914734181L;
        gn.defb[116] = -3800104093784627504L;
        gn.defb[117] = 5994482455328674716L;
        gn.defb[118] = 9127646025469441996L;
        gn.defb[119] = -1527913515358996935L;
        gn.defb[120] = 3325881909652976855L;
        gn.defb[121] = -1406950836444344453L;
        gn.defb[122] = -848211533880843555L;
        gn.defb[123] = 4383026967224736060L;
        gn.defb[124] = -3762191682272986335L;
        gn.defb[125] = -251109727192384085L;
        gn.defb[126] = 644107256707177316L;
        gn.defb[127] = -4849050377510829353L;
        gn.defb[128] = -944654038646544606L;
        gn.defb[129] = 5727579059208859656L;
        gn.defb[130] = 4704563391107571459L;
        gn.defb[131] = -2543302539389926197L;
        gn.defb[132] = 5064259469266757505L;
        gn.defb[133] = 7556442931445348051L;
        gn.defb[134] = -5906859928030073351L;
        gn.defb[135] = 2168499851092649668L;
        gn.defb[136] = -5159350101108763524L;
        gn.defb[137] = -9168770615407033337L;
    }
}

