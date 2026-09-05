/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10192
 *  net.minecraft.class_1304
 *  net.minecraft.class_1713
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2735
 *  net.minecraft.class_9334
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_10192;
import net.minecraft.class_1304;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2735;
import net.minecraft.class_9334;
import ruhack.phobia.aw;
import ruhack.phobia.br;
import ruhack.phobia.cr;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.ke;

public class fc
extends ds {
    public static final long cs = -4358390956333766682L;
    private final ke protections;
    private static int[] aziw;
    public static final boolean a;
    public static final boolean c;
    public static final int b;
    private static long[] azjl;
    private static long[] azjk;
    private static int[] aziv;

    static {
        aziv = new int[81];
        aziw = new int[81];
        fc.azql();
        fc.azqq();
        azjk = new long[31];
        azjl = new long[31];
        fc.azqu();
        fc.azqz();
    }

    private static /* synthetic */ long azji(int n2) {
        return azjk[n2] ^ azjl[n2];
    }

    private static /* synthetic */ int azit(int n2) {
        return aziv[n2] ^ aziw[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean isChestArmor(class_1799 var0) {
        v0 /* !! */  = fc.cs;
        if (true) ** GOTO lbl5
        block39: while (true) {
            v0 /* !! */  = (long)(v1 - fc.aziy("aznp", azji(int ), (int)12));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1474178193: {
                    v1 = fc.aziy("aznr", azji(int ), (int)13);
                    continue block39;
                }
                case -1458807869: {
                    v1 = fc.aziy("azns", azji(int ), (int)14);
                    continue block39;
                }
                case -794028848: {
                    v1 = fc.aziy("aznv", azji(int ), (int)15);
                    continue block39;
                }
                case 1467181030: {
                    break block39;
                }
            }
            break;
        }
        var4_1 = fc.c;
        v2 /* !! */  = fc.cs;
        if (true) ** GOTO lbl22
        block40: while (true) {
            v2 /* !! */  = (long)(fc.aziy("aznz", azji(int ), (int)17) - fc.aziy("aznx", azji(int ), (int)16));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 1467181030: {
                    break block40;
                }
                case 2133142177: {
                    continue block40;
                }
            }
            break;
        }
        var3_2 /* !! */  = fc.b;
        v3 /* !! */  = fc.cs;
        if (true) ** GOTO lbl32
        block41: while (true) {
            v3 /* !! */  = (long)(fc.aziy("azoc", azji(int ), (int)19) - fc.aziy("azoa", azji(int ), (int)18));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 463526858: {
                    continue block41;
                }
                case 1467181030: {
                    break block41;
                }
            }
            break;
        }
        var2_3 = fc.a;
        if (var4_1) {
            throw null;
lbl40:
            // 6 sources

            return (boolean)fc.aziy("azod", azit(int ), (int)58);
        }
        if (var2_3 || var2_3) ** GOTO lbl40
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = fc.cs - fc.aziy("azoe", azji(int ), (int)20)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == fc.aziy("azog", azit(int ), (int)59)) break;
            v4 /* !! */  = (long)fc.aziy("azoi", azit(int ), (int)60);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = fc.cs - fc.aziy("azoj", azji(int ), (int)21)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == fc.aziy("azol", azit(int ), (int)61)) break;
            v5 /* !! */  = (long)fc.aziy("azom", azit(int ), (int)62);
        }
        var1_4 = (class_10192)var0.method_58694(class_9334.field_54196);
        if (var2_3 || var2_3) ** GOTO lbl40
        if (var1_4 == null) ** GOTO lbl112
        if (var2_3) ** GOTO lbl40
        v6 /* !! */  = fc.cs;
        if (true) ** GOTO lbl63
        block45: while (true) {
            v6 /* !! */  = (long)(v7 - fc.aziy("azoo", azji(int ), (int)22));
lbl63:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 438379423: {
                    v7 = fc.aziy("azoq", azji(int ), (int)23);
                    continue block45;
                }
                case 768250581: {
                    v7 = fc.aziy("azos", azji(int ), (int)24);
                    continue block45;
                }
                case 1467181030: {
                    break block45;
                }
            }
            break;
        }
        v8 = var1_4.comp_3174();
        v9 /* !! */  = fc.cs;
        if (true) ** GOTO lbl77
        block46: while (true) {
            v9 /* !! */  = (long)(v10 - fc.aziy("azot", azji(int ), (int)25));
lbl77:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1014010391: {
                    v10 = fc.aziy("azov", azji(int ), (int)26);
                    continue block46;
                }
                case 421053706: {
                    v10 = fc.aziy("azow", azji(int ), (int)27);
                    continue block46;
                }
                case 1454838096: {
                    v10 = fc.aziy("azox", azji(int ), (int)28);
                    continue block46;
                }
                case 1467181030: {
                    break block46;
                }
            }
            break;
        }
        if (v8 != class_1304.field_6174) ** GOTO lbl112
        if (var2_3) ** GOTO lbl40
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_2 = fc.cs - fc.aziy("azoy", azji(int ), (int)29)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v11 /* !! */  == fc.aziy("azpb", azit(int ), (int)63)) break;
            v11 /* !! */  = (long)fc.aziy("azpd", azit(int ), (int)64);
        }
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_3 = fc.cs - fc.aziy("azpe", azji(int ), (int)30)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v12 /* !! */  == fc.aziy("azpg", azit(int ), (int)65)) break;
            v12 /* !! */  = (long)fc.aziy("azph", azit(int ), (int)66);
        }
        if (var0.method_31574(class_1802.field_8833)) ** GOTO lbl112
        if (var2_3) ** GOTO lbl40
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v13 = fc.aziy("azpj", azit(int ), (int)67);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl112:
            // 3 sources

            if (!var2_3 && !var2_3) ** break;
            ** continue;
            v13 = fc.aziy("azpl", azit(int ), (int)68);
lbl115:
            // 2 sources

            return (boolean)v13;
lbl116:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)fc.aziy("azpn", azit(int ), (int)69);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl135
            }
lbl121:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)fc.aziy("azpo", azit(int ), (int)70);
                if (!var4_1) ** GOTO lbl116
                throw null;
            }
            case 2: {
                var3_2 /* !! */  = (int)fc.aziy("azpq", azit(int ), (int)71);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl161
            }
            case 3: {
                do {
                    var3_2 /* !! */  = (int)fc.aziy("azpr", azit(int ), (int)72);
                } while (!var4_1);
                throw null;
            }
lbl135:
            // 3 sources

            case 4: {
                var3_2 /* !! */  = (int)fc.aziy("azpt", azit(int ), (int)73);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl148
            }
            case 5: {
                var3_2 /* !! */  = (int)fc.aziy("azpw", azit(int ), (int)74);
                if (!var4_1) break;
                throw null;
            }
            case 6: {
                var3_2 /* !! */  = (int)fc.aziy("azpy", azit(int ), (int)75);
                if (!var4_1) ** GOTO lbl121
                throw null;
            }
lbl148:
            // 3 sources

            case 7: {
                var3_2 /* !! */  = (int)fc.aziy("azqa", azit(int ), (int)76);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl153:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)fc.aziy("azqb", azit(int ), (int)77);
                if (!var4_1) ** GOTO lbl135
                throw null;
            }
            case 9: {
                var3_2 /* !! */  = (int)fc.aziy("azqd", azit(int ), (int)78);
                if (!var4_1) ** GOTO lbl148
                throw null;
            }
lbl161:
            // 3 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)fc.aziy("azqe", azit(int ), (int)79);
                    if (!var4_1) ** GOTO lbl153
                    throw null;
                }
            }
            case 11: 
        }
        var3_2 /* !! */  = (int)fc.aziy("azqf", azit(int ), (int)80);
        ** while (!var4_1)
lbl169:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public fc() {
        var2_1 /* !! */  = fc.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("NoSlotChange", "\u0417\u0430\u0449\u0438\u0449\u0430\u0435\u0442 \u0441\u043b\u043e\u0442 \u0438 \u0432\u0430\u0436\u043d\u044b\u0435 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b \u043e\u0442 \u0441\u043b\u0443\u0447\u0430\u0439\u043d\u043e\u0439 \u0441\u043c\u0435\u043d\u044b \u0438\u043b\u0438 \u0432\u044b\u0431\u0440\u043e\u0441\u0430", du.MISC);
                this.protections = new ke("\u0417\u0430\u0449\u0438\u0442\u0430", "\u0427\u0442\u043e \u0437\u0430\u043f\u0440\u0435\u0449\u0435\u043d\u043e \u0441\u043b\u0443\u0447\u0430\u0439\u043d\u043e \u043c\u0435\u043d\u044f\u0442\u044c").value(new String[]{"\u0421\u043c\u0435\u043d\u0430 \u0441\u043b\u043e\u0442\u0430 \u0441\u0435\u0440\u0432\u0435\u0440\u043e\u043c", "\u0412\u044b\u0431\u0440\u043e\u0441 \u044d\u043b\u0438\u0442\u0440\u044b", "\u0412\u044b\u0431\u0440\u043e\u0441 \u043d\u0430\u0433\u0440\u0443\u0434\u043d\u0438\u043a\u0430", "\u0412\u044b\u0431\u0440\u043e\u0441 \u0433\u043e\u043b\u043e\u0432\u044b"}).selected(new String[]{"\u0421\u043c\u0435\u043d\u0430 \u0441\u043b\u043e\u0442\u0430 \u0441\u0435\u0440\u0432\u0435\u0440\u043e\u043c", "\u0412\u044b\u0431\u0440\u043e\u0441 \u044d\u043b\u0438\u0442\u0440\u044b", "\u0412\u044b\u0431\u0440\u043e\u0441 \u043d\u0430\u0433\u0440\u0443\u0434\u043d\u0438\u043a\u0430"});
                this.settings(new jx[]{this.protections});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)fc.aziy("azja", azit(int ), (int)0);
                break;
            }
            case 1: {
                var2_1 /* !! */  = (int)fc.aziy("azjc", azit(int ), (int)1);
            }
            case 2: {
                var2_1 /* !! */  = (int)fc.aziy("azjd", azit(int ), (int)2);
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)fc.aziy("azjf", azit(int ), (int)3);
                    break;
                }
            }
            case 4: 
        }
        var2_1 /* !! */  = (int)fc.aziy("azjg", azit(int ), (int)4);
        ** while (true)
    }

    private static /* synthetic */ void azqq() {
        fc.aziw[0] = -1657982258;
        fc.aziw[1] = -1028793377;
        fc.aziw[2] = 1141603743;
        fc.aziw[3] = -1342021746;
        fc.aziw[4] = -960770187;
        fc.aziw[5] = -311063341;
        fc.aziw[6] = -1855389755;
        fc.aziw[7] = 1022655705;
        fc.aziw[8] = -2086724676;
        fc.aziw[9] = -1015850449;
        fc.aziw[10] = -1735780561;
        fc.aziw[11] = -952196916;
        fc.aziw[12] = -593289630;
        fc.aziw[13] = 1276562750;
        fc.aziw[14] = -510215367;
        fc.aziw[15] = 1827646093;
        fc.aziw[16] = 113189898;
        fc.aziw[17] = -1266624338;
        fc.aziw[18] = 140551038;
        fc.aziw[19] = -1153363509;
        fc.aziw[20] = 723551311;
        fc.aziw[21] = 990023708;
        fc.aziw[22] = 1127315945;
        fc.aziw[23] = -1927055032;
        fc.aziw[24] = -1592013075;
        fc.aziw[25] = 1924894636;
        fc.aziw[26] = 1619543793;
        fc.aziw[27] = 1773291429;
        fc.aziw[28] = -112952512;
        fc.aziw[29] = 753843077;
        fc.aziw[30] = -955773343;
        fc.aziw[31] = -1011478557;
        fc.aziw[32] = 1947629744;
        fc.aziw[33] = 1163518815;
        fc.aziw[34] = 582328409;
        fc.aziw[35] = -1626492906;
        fc.aziw[36] = 1195243867;
        fc.aziw[37] = -1459199402;
        fc.aziw[38] = -355197288;
        fc.aziw[39] = -2114050217;
        fc.aziw[40] = -339819791;
        fc.aziw[41] = 971204608;
        fc.aziw[42] = -1632759299;
        fc.aziw[43] = 1305827070;
        fc.aziw[44] = -926602784;
        fc.aziw[45] = 143867585;
        fc.aziw[46] = 2090587210;
        fc.aziw[47] = 1750803217;
        fc.aziw[48] = -18277712;
        fc.aziw[49] = 2056659805;
        fc.aziw[50] = 1415598635;
        fc.aziw[51] = -145775114;
        fc.aziw[52] = -514992721;
        fc.aziw[53] = -1835892274;
        fc.aziw[54] = 536963446;
        fc.aziw[55] = 938240880;
        fc.aziw[56] = 1133461712;
        fc.aziw[57] = -1943819433;
        fc.aziw[58] = 1157176241;
        fc.aziw[59] = 700697593;
        fc.aziw[60] = -90919860;
        fc.aziw[61] = -393569423;
        fc.aziw[62] = -504030501;
        fc.aziw[63] = -868247918;
        fc.aziw[64] = 2075320289;
        fc.aziw[65] = -1671945594;
        fc.aziw[66] = -515125841;
        fc.aziw[67] = -1006256818;
        fc.aziw[68] = -1206389217;
        fc.aziw[69] = 815437438;
        fc.aziw[70] = -1169955255;
        fc.aziw[71] = -1869661111;
        fc.aziw[72] = 1129434503;
        fc.aziw[73] = -1720440046;
        fc.aziw[74] = -1442508483;
        fc.aziw[75] = 896265683;
        fc.aziw[76] = 19532886;
        fc.aziw[77] = 24282238;
        fc.aziw[78] = -1602570724;
        fc.aziw[79] = 1953631705;
        fc.aziw[80] = -1798876347;
    }

    private static /* synthetic */ void azqu() {
        fc.azjk[0] = -7593709698191271914L;
        fc.azjk[1] = -4089986547953976022L;
        fc.azjk[2] = 1555128148085232234L;
        fc.azjk[3] = 1374251988836890050L;
        fc.azjk[4] = 828842524604347307L;
        fc.azjk[5] = 7961912699306928771L;
        fc.azjk[6] = -3619069301748722328L;
        fc.azjk[7] = 1484153822732882961L;
        fc.azjk[8] = 9182109235516058583L;
        fc.azjk[9] = 7058682296471073744L;
        fc.azjk[10] = -5990147648198195686L;
        fc.azjk[11] = 5618801096796817161L;
        fc.azjk[12] = -1288446669673955838L;
        fc.azjk[13] = 947757604485795726L;
        fc.azjk[14] = 2812336656258988579L;
        fc.azjk[15] = -5749870622918980652L;
        fc.azjk[16] = 5993549699224062655L;
        fc.azjk[17] = 1227418362473705729L;
        fc.azjk[18] = 4220882807229493028L;
        fc.azjk[19] = -3140600924047708154L;
        fc.azjk[20] = -5339108029646231523L;
        fc.azjk[21] = 3734438995388787456L;
        fc.azjk[22] = -2003949449697587603L;
        fc.azjk[23] = 7300207275849251812L;
        fc.azjk[24] = -3945802188708142920L;
        fc.azjk[25] = -5668624668810366328L;
        fc.azjk[26] = -3617560041335810604L;
        fc.azjk[27] = -6035098384996922185L;
        fc.azjk[28] = 2564924557765189934L;
        fc.azjk[29] = -4637030143669197230L;
        fc.azjk[30] = -1082976288430468471L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onClickSlot(br var1_1) {
        block63: {
            block62: {
                var6_2 = fc.c;
                var5_3 /* !! */  = fc.b;
                var4_4 = fc.a;
                if (var6_2) {
                    throw null;
lbl6:
                    // 21 sources

                    return;
                }
                if (var4_4 || var4_4) ** GOTO lbl6
                if (fc.mc.field_1724 == null) break block62;
                if (var4_4) ** GOTO lbl6
                if (var1_1.getActionType() != class_1713.field_7795) break block62;
                if (var4_4) ** GOTO lbl6
                if (var1_1.getSlotId() < 0) break block62;
                if (var4_4) ** GOTO lbl6
                if (var1_1.getSlotId() < fc.mc.field_1724.field_7512.field_7761.size()) break block63;
                if (var4_4) ** GOTO lbl6
            }
            if (var4_4 || var4_4) ** GOTO lbl6
            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl6
        var2_5 = fc.mc.field_1724.field_7512.method_7611(var1_1.getSlotId());
        if (var4_4) ** GOTO lbl6
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl6
                var3_6 = var2_5.method_7677();
                if (var4_4 || var4_4) ** GOTO lbl6
                if (!this.protections.isSelected("\u0412\u044b\u0431\u0440\u043e\u0441 \u044d\u043b\u0438\u0442\u0440\u044b")) ** GOTO lbl34
                if (var4_4) ** GOTO lbl6
                if (var3_6.method_31574(class_1802.field_8833)) ** GOTO lbl44
                if (var4_4) ** GOTO lbl6
lbl34:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                if (!this.protections.isSelected("\u0412\u044b\u0431\u0440\u043e\u0441 \u043d\u0430\u0433\u0440\u0443\u0434\u043d\u0438\u043a\u0430")) ** GOTO lbl39
                if (var4_4) ** GOTO lbl6
                if (fc.isChestArmor(var3_6)) ** GOTO lbl44
                if (var4_4) ** GOTO lbl6
lbl39:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                if (!this.protections.isSelected("\u0412\u044b\u0431\u0440\u043e\u0441 \u0433\u043e\u043b\u043e\u0432\u044b")) ** GOTO lbl47
                if (var4_4) ** GOTO lbl6
                if (!var3_6.method_31574(class_1802.field_8575)) ** GOTO lbl47
                if (var4_4) ** GOTO lbl6
lbl44:
                // 3 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                var1_1.cancel();
                if (var4_4) ** GOTO lbl6
lbl47:
                // 3 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl50:
            // 3 sources

            case 0: {
                var5_3 /* !! */  = (int)fc.aziy("azlg", azit(int ), (int)26);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl167
            }
            case 1: {
                var5_3 /* !! */  = (int)fc.aziy("azlh", azit(int ), (int)27);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 2: {
                var5_3 /* !! */  = (int)fc.aziy("azlk", azit(int ), (int)28);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl65:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)fc.aziy("azlm", azit(int ), (int)29);
                if (!var6_2) ** GOTO lbl50
                throw null;
            }
lbl69:
            // 2 sources

            case 4: {
                var5_3 /* !! */  = (int)fc.aziy("azln", azit(int ), (int)30);
                if (!var6_2) break;
                throw null;
            }
            case 5: {
                var5_3 /* !! */  = (int)fc.aziy("azlr", azit(int ), (int)31);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl102
            }
lbl78:
            // 3 sources

            case 6: {
                var5_3 /* !! */  = (int)fc.aziy("azlt", azit(int ), (int)32);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl83:
            // 2 sources

            case 7: {
                var5_3 /* !! */  = (int)fc.aziy("azlv", azit(int ), (int)33);
                if (var6_2) {
                    throw null;
                }
            }
            case 8: {
                var5_3 /* !! */  = (int)fc.aziy("azlw", azit(int ), (int)34);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl92:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)fc.aziy("azlx", azit(int ), (int)35);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 10: {
                var5_3 /* !! */  = (int)fc.aziy("azlz", azit(int ), (int)36);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl102:
            // 2 sources

            case 11: {
                var5_3 /* !! */  = (int)fc.aziy("azmb", azit(int ), (int)37);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl107:
            // 2 sources

            case 12: {
                var5_3 /* !! */  = (int)fc.aziy("azmc", azit(int ), (int)38);
                if (!var6_2) break;
                throw null;
            }
            case 13: {
                var5_3 /* !! */  = (int)fc.aziy("azme", azit(int ), (int)39);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl116:
            // 4 sources

            case 14: {
                var5_3 /* !! */  = (int)fc.aziy("azmg", azit(int ), (int)40);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl125
            }
            case 15: {
                var5_3 /* !! */  = (int)fc.aziy("azmi", azit(int ), (int)41);
                if (!var6_2) ** GOTO lbl78
                throw null;
            }
lbl125:
            // 2 sources

            case 16: {
                var5_3 /* !! */  = (int)fc.aziy("azmk", azit(int ), (int)42);
                if (!var6_2) ** GOTO lbl50
                throw null;
            }
            case 17: {
                var5_3 /* !! */  = (int)fc.aziy("azml", azit(int ), (int)43);
                if (!var6_2) ** GOTO lbl69
                throw null;
            }
lbl133:
            // 3 sources

            case 18: {
                var5_3 /* !! */  = (int)fc.aziy("azmn", azit(int ), (int)44);
                if (!var6_2) ** GOTO lbl107
                throw null;
            }
            case 19: {
                var5_3 /* !! */  = (int)fc.aziy("azmo", azit(int ), (int)45);
                if (!var6_2) ** GOTO lbl133
                throw null;
            }
lbl141:
            // 2 sources

            case 20: {
                var5_3 /* !! */  = (int)fc.aziy("azmp", azit(int ), (int)46);
                if (!var6_2) ** GOTO lbl133
                throw null;
            }
            case 21: {
                var5_3 /* !! */  = (int)fc.aziy("azmr", azit(int ), (int)47);
                if (!var6_2) ** GOTO lbl83
                throw null;
            }
lbl149:
            // 2 sources

            case 22: {
                var5_3 /* !! */  = (int)fc.aziy("azmu", azit(int ), (int)48);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl154:
            // 4 sources

            case 23: {
                var5_3 /* !! */  = (int)fc.aziy("azmw", azit(int ), (int)49);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 24: {
                var5_3 /* !! */  = (int)fc.aziy("azmz", azit(int ), (int)50);
                if (!var6_2) ** GOTO lbl116
                throw null;
            }
lbl163:
            // 3 sources

            case 25: {
                var5_3 /* !! */  = (int)fc.aziy("azna", azit(int ), (int)51);
                if (!var6_2) ** GOTO lbl149
                throw null;
            }
lbl167:
            // 3 sources

            case 26: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)fc.aziy("aznb", azit(int ), (int)52);
                    if (!var6_2) ** GOTO lbl154
                    throw null;
                }
            }
            case 27: {
                var5_3 /* !! */  = (int)fc.aziy("aznd", azit(int ), (int)53);
                if (!var6_2) ** GOTO lbl92
                throw null;
            }
            case 28: {
                var5_3 /* !! */  = (int)fc.aziy("aznf", azit(int ), (int)54);
                if (!var6_2) ** GOTO lbl65
                throw null;
            }
lbl180:
            // 4 sources

            case 29: {
                var5_3 /* !! */  = (int)fc.aziy("aznh", azit(int ), (int)55);
                if (!var6_2) ** GOTO lbl78
                throw null;
            }
            case 30: {
                var5_3 /* !! */  = (int)fc.aziy("azni", azit(int ), (int)56);
                if (!var6_2) ** GOTO lbl116
                throw null;
            }
            case 31: 
        }
        var5_3 /* !! */  = (int)fc.aziy("aznm", azit(int ), (int)57);
        ** while (!var6_2)
lbl191:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void azqz() {
        fc.azjl[0] = -180311136511001899L;
        fc.azjl[1] = 8035444815580627980L;
        fc.azjl[2] = 3323034364553380040L;
        fc.azjl[3] = -7250730067152652232L;
        fc.azjl[4] = 2022120851071386860L;
        fc.azjl[5] = 6808793865492511787L;
        fc.azjl[6] = -9043678745448023444L;
        fc.azjl[7] = 2980401992975392809L;
        fc.azjl[8] = 6479586750970938274L;
        fc.azjl[9] = 5596860179161000273L;
        fc.azjl[10] = -3932295754593040786L;
        fc.azjl[11] = -3158318317960686789L;
        fc.azjl[12] = 4958858686719715016L;
        fc.azjl[13] = -4100540863139718696L;
        fc.azjl[14] = -8812580334611097526L;
        fc.azjl[15] = -4717130727009577884L;
        fc.azjl[16] = -8071375849402100237L;
        fc.azjl[17] = -5435341263404807920L;
        fc.azjl[18] = -5624689659882411161L;
        fc.azjl[19] = -6115393270715174899L;
        fc.azjl[20] = -2152855688224858928L;
        fc.azjl[21] = 1406700903414951742L;
        fc.azjl[22] = 570776067691573489L;
        fc.azjl[23] = 3992106724735972904L;
        fc.azjl[24] = -6378948291453743331L;
        fc.azjl[25] = -2101177984737338932L;
        fc.azjl[26] = 6496886127153339107L;
        fc.azjl[27] = 2629954362817299190L;
        fc.azjl[28] = -1677276445249718865L;
        fc.azjl[29] = -8387155227887358614L;
        fc.azjl[30] = 3436734044976151757L;
    }

    private static /* synthetic */ void azql() {
        fc.aziv[0] = -1657982257;
        fc.aziv[1] = -1028793378;
        fc.aziv[2] = 1141603739;
        fc.aziv[3] = -1342021750;
        fc.aziv[4] = -960770188;
        fc.aziv[5] = 311063340;
        fc.aziv[6] = -1923799866;
        fc.aziv[7] = -1022655706;
        fc.aziv[8] = 1059826920;
        fc.aziv[9] = 1015850448;
        fc.aziv[10] = 1627809509;
        fc.aziv[11] = 952196915;
        fc.aziv[12] = 1514251884;
        fc.aziv[13] = -1276562751;
        fc.aziv[14] = -1024822750;
        fc.aziv[15] = 1827646090;
        fc.aziv[16] = 113189888;
        fc.aziv[17] = -1266624342;
        fc.aziv[18] = 140551038;
        fc.aziv[19] = -1153363508;
        fc.aziv[20] = 723551309;
        fc.aziv[21] = 990023702;
        fc.aziv[22] = 1127315936;
        fc.aziv[23] = -1927055027;
        fc.aziv[24] = -1592013078;
        fc.aziv[25] = 1924894639;
        fc.aziv[26] = 1619543781;
        fc.aziv[27] = 1773291431;
        fc.aziv[28] = -112952507;
        fc.aziv[29] = 753843100;
        fc.aziv[30] = -955773325;
        fc.aziv[31] = -1011478535;
        fc.aziv[32] = 1947629752;
        fc.aziv[33] = 1163518793;
        fc.aziv[34] = 582328410;
        fc.aziv[35] = -1626492900;
        fc.aziv[36] = 1195243862;
        fc.aziv[37] = -1459199423;
        fc.aziv[38] = -355197284;
        fc.aziv[39] = -2114050227;
        fc.aziv[40] = -339819785;
        fc.aziv[41] = 971204617;
        fc.aziv[42] = -1632759328;
        fc.aziv[43] = 1305827059;
        fc.aziv[44] = -926602760;
        fc.aziv[45] = 143867605;
        fc.aziv[46] = 2090587221;
        fc.aziv[47] = 1750803209;
        fc.aziv[48] = -18277700;
        fc.aziv[49] = 2056659779;
        fc.aziv[50] = 1415598646;
        fc.aziv[51] = -145775118;
        fc.aziv[52] = -514992717;
        fc.aziv[53] = -1835892257;
        fc.aziv[54] = 536963426;
        fc.aziv[55] = 938240869;
        fc.aziv[56] = 1133461706;
        fc.aziv[57] = -1943819439;
        fc.aziv[58] = 1157176241;
        fc.aziv[59] = -700697594;
        fc.aziv[60] = 1686636926;
        fc.aziv[61] = 393569422;
        fc.aziv[62] = -1216852549;
        fc.aziv[63] = 868247917;
        fc.aziv[64] = 934202338;
        fc.aziv[65] = 1671945593;
        fc.aziv[66] = 452217992;
        fc.aziv[67] = -1006256817;
        fc.aziv[68] = -1206389217;
        fc.aziv[69] = 815437432;
        fc.aziv[70] = -1169955252;
        fc.aziv[71] = -1869661117;
        fc.aziv[72] = 1129434511;
        fc.aziv[73] = -1720440037;
        fc.aziv[74] = -1442508492;
        fc.aziv[75] = 896265681;
        fc.aziv[76] = 19532883;
        fc.aziv[77] = 24282229;
        fc.aziv[78] = -1602570721;
        fc.aziv[79] = 1953631704;
        fc.aziv[80] = -1798876339;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPacket(cr var1_1) {
        block28: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = fc.cs - fc.aziy("azjm", azji(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == fc.aziy("azjn", azit(int ), (int)5)) break;
                v0 /* !! */  = (long)fc.aziy("azjp", azit(int ), (int)6);
            }
            var4_2 = fc.c;
            v1 /* !! */  = fc.cs;
            if (true) ** GOTO lbl12
            block14: while (true) {
                v1 /* !! */  = (long)(v2 - fc.aziy("azjq", azji(int ), (int)1));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case 1420278065: {
                        v2 = fc.aziy("azjr", azji(int ), (int)2);
                        continue block14;
                    }
                    case 1467181030: {
                        break block14;
                    }
                    case 1965868019: {
                        v2 = fc.aziy("azjt", azji(int ), (int)3);
                        continue block14;
                    }
                }
                break;
            }
            var3_3 = fc.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = fc.cs - fc.aziy("azjv", azji(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == fc.aziy("azjw", azit(int ), (int)7)) break;
                v3 /* !! */  = (long)fc.aziy("azjx", azit(int ), (int)8);
            }
            var2_4 = fc.a;
            if (var4_2) {
                throw null;
lbl31:
                // 6 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl31
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = fc.cs - fc.aziy("azjz", azji(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == fc.aziy("azka", azit(int ), (int)9)) break;
                v4 /* !! */  = (long)fc.aziy("azkb", azit(int ), (int)10);
            }
            if (var1_1.isSend()) break block28;
            if (var2_4) ** GOTO lbl31
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_3 = fc.cs - fc.aziy("azkc", azji(int ), (int)6)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == fc.aziy("azkd", azit(int ), (int)11)) break;
                v5 /* !! */  = (long)fc.aziy("azke", azit(int ), (int)12);
            }
            v6 /* !! */  = fc.cs;
            if (true) ** GOTO lbl52
            block19: while (true) {
                v6 /* !! */  = (long)(fc.aziy("azkg", azji(int ), (int)8) - fc.aziy("azkf", azji(int ), (int)7));
lbl52:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1195120315: {
                        continue block19;
                    }
                    case 1467181030: {
                        break block19;
                    }
                }
                break;
            }
            if (!this.protections.isSelected("\u0421\u043c\u0435\u043d\u0430 \u0441\u043b\u043e\u0442\u0430 \u0441\u0435\u0440\u0432\u0435\u0440\u043e\u043c")) break block28;
            if (var2_4) ** GOTO lbl31
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_4 = fc.cs - fc.aziy("azkh", azji(int ), (int)9)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v7 /* !! */  == fc.aziy("azki", azit(int ), (int)13)) break;
                v7 /* !! */  = (long)fc.aziy("azkj", azit(int ), (int)14);
            }
            if (!(var1_1.getPacket() instanceof class_2735)) break block28;
            if (var2_4 || var2_4) ** GOTO lbl31
            v8 /* !! */  = fc.cs;
            if (true) ** GOTO lbl71
            block21: while (true) {
                v8 /* !! */  = (long)(fc.aziy("azkl", azji(int ), (int)11) - fc.aziy("azkk", azji(int ), (int)10));
lbl71:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case 1378466810: {
                        continue block21;
                    }
                    case 1467181030: {
                        break block21;
                    }
                }
                break;
            }
            var1_1.cancel();
            if (var2_4) ** GOTO lbl31
        }
        if (!var2_4 && !var2_4) ** break;
        ** while (true)
    }

    public static /* synthetic */ CallSite aziy(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

