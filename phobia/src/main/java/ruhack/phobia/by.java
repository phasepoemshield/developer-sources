/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_243;
import ruhack.phobia.az;

public class by
implements az {
    private float boostMultiplier;
    private float ySpeed;
    private static int[] dzhy = new int[97];
    private static long[] dzip;
    private static int[] dzhz;
    public static final int b;
    public static final boolean c;
    private float baseBoost;
    private static long[] dzio;
    public static final long jt = 3459686440043209781L;
    private float smoothingFactor;
    public static final boolean a;
    private class_243 direction;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getBaseBoost() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = by.jt - by.dzia("dzji", dzin(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == by.dzia("dzjj", dzhv(int ), (int)17)) break;
            v0 /* !! */  = (long)by.dzia("dzjk", dzhv(int ), (int)18);
        }
        var3_1 = by.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = by.jt - by.dzia("dzjl", dzin(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == by.dzia("dzjm", dzhv(int ), (int)19)) break;
            v1 /* !! */  = (long)by.dzia("dzjn", dzhv(int ), (int)20);
        }
        var2_2 /* !! */  = by.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = by.jt - by.dzia("dzjo", dzin(int ), (int)9)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == by.dzia("dzjp", dzhv(int ), (int)21)) break;
            v2 /* !! */  = (long)by.dzia("dzjq", dzhv(int ), (int)22);
        }
        var1_3 = by.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (float)by.dzia("dzjr", dziy(int ), (int)23);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = by.jt - by.dzia("dzjs", dzin(int ), (int)10)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == by.dzia("dzju", dzhv(int ), (int)24)) break;
                    v3 /* !! */  = (long)by.dzia("dzjv", dzhv(int ), (int)25);
                }
                return this.baseBoost;
            }
lbl37:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)by.dzia("dzjw", dzhv(int ), (int)26);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)by.dzia("dzjx", dzhv(int ), (int)27);
                if (!var3_1) ** GOTO lbl37
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)by.dzia("dzjy", dzhv(int ), (int)28);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)by.dzia("dzjz", dzhv(int ), (int)29);
        ** while (!var3_1)
lbl53:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public by(float var1_1, float var2_2, float var3_3, class_243 var4_4) {
        var6_5 /* !! */  = by.b;
        super();
        this.boostMultiplier = var1_1;
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.baseBoost = var2_2;
                this.smoothingFactor = var3_3;
                this.ySpeed = var1_1;
                this.direction = var4_4;
                return;
            }
            case 0: {
                var6_5 /* !! */  = (int)by.dzia("dzie", dzhv(int ), (int)0);
            }
lbl14:
            // 3 sources

            case 1: {
                var6_5 /* !! */  = (int)by.dzia("dzif", dzhv(int ), (int)1);
                ** GOTO lbl23
            }
lbl17:
            // 3 sources

            case 2: {
                var6_5 /* !! */  = (int)by.dzia("dzig", dzhv(int ), (int)2);
                ** GOTO lbl14
            }
            case 3: {
                var6_5 /* !! */  = (int)by.dzia("dzih", dzhv(int ), (int)3);
                ** GOTO lbl17
            }
lbl23:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_5 /* !! */  = (int)by.dzia("dzii", dzhv(int ), (int)4);
                    continue;
                    break;
                }
            }
            case 5: {
                var6_5 /* !! */  = (int)by.dzia("dzij", dzhv(int ), (int)5);
                ** GOTO lbl17
            }
            case 6: {
                var6_5 /* !! */  = (int)by.dzia("dzil", dzhv(int ), (int)6);
            }
            case 7: 
        }
        var6_5 /* !! */  = (int)by.dzia("dzim", dzhv(int ), (int)7);
        ** while (true)
    }

    private static /* synthetic */ float dziy(int n2) {
        return Float.intBitsToFloat(dzhy[n2] ^ dzhz[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getYSpeed() {
        v0 /* !! */  = by.jt;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - by.dzia("dzkt", dzin(int ), (int)20));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1392319435: {
                    break block16;
                }
                case -334333669: {
                    v1 = by.dzia("dzku", dzin(int ), (int)21);
                    continue block16;
                }
                case -151793197: {
                    v1 = by.dzia("dzkv", dzin(int ), (int)22);
                    continue block16;
                }
            }
            break;
        }
        var3_1 = by.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = by.jt - by.dzia("dzkw", dzin(int ), (int)23)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == by.dzia("dzkx", dzhv(int ), (int)39)) break;
            v2 /* !! */  = (long)by.dzia("dzky", dzhv(int ), (int)40);
        }
        var2_2 /* !! */  = by.b;
        v3 /* !! */  = by.jt;
        if (true) ** GOTO lbl26
        block18: while (true) {
            v3 /* !! */  = (long)(v4 - by.dzia("dzkz", dzin(int ), (int)24));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1392319435: {
                    break block18;
                }
                case -663561058: {
                    v4 = by.dzia("dzla", dzin(int ), (int)25);
                    continue block18;
                }
                case -150662625: {
                    v4 = by.dzia("dzlb", dzin(int ), (int)26);
                    continue block18;
                }
            }
            break;
        }
        var1_3 = by.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (float)by.dzia("dzlc", dziy(int ), (int)41);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = by.jt - by.dzia("dzld", dzin(int ), (int)27)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == by.dzia("dzle", dzhv(int ), (int)42)) break;
                    v5 /* !! */  = (long)by.dzia("dzlf", dzhv(int ), (int)43);
                }
                return this.ySpeed;
            }
            case 0: {
                var2_2 /* !! */  = (int)by.dzia("dzlg", dzhv(int ), (int)44);
                if (var3_1) {
                    throw null;
                }
            }
lbl55:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)by.dzia("dzlh", dzhv(int ), (int)45);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)by.dzia("dzli", dzhv(int ), (int)46);
                    if (!var3_1) ** GOTO lbl55
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)by.dzia("dzlj", dzhv(int ), (int)47);
        ** while (!var3_1)
lbl67:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void setDirection(class_243 class_2432) {
        Object object = jt;
        block13: while (true) {
            switch ((int)object) {
                case -1684206578: {
                    object = by.dzia("dzoo", dzin(int ), (int)68) - by.dzia("dzon", dzin(int ), (int)67);
                    continue block13;
                }
                case -1392319435: {
                    break block13;
                }
            }
            break;
        }
        boolean bl2 = c;
        Object object2 = jt;
        boolean bl3 = true;
        block14: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object2 = callSite - by.dzia("dzop", dzin(int ), (int)69);
            }
            switch ((int)object2) {
                case -1392319435: {
                    break block14;
                }
                case -920961558: {
                    callSite = by.dzia("dzoq", dzin(int ), (int)70);
                    continue block14;
                }
                case -817628752: {
                    callSite = by.dzia("dzor", dzin(int ), (int)71);
                    continue block14;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = jt;
        block15: while (true) {
            switch ((int)object3) {
                case -1392319435: {
                    break block15;
                }
                case -17548350: {
                    object3 = by.dzia("dzot", dzin(int ), (int)73) - by.dzia("dzos", dzin(int ), (int)72);
                    continue block15;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl2) {
            throw null;
        }
        if (bl4 || bl4) return;
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = jt - by.dzia("dzou", dzin(int ), (int)74)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == by.dzia("dzov", dzhv(int ), (int)90)) {
                this.direction = class_2432;
                if (bl4) return;
                return;
            }
            object4 = by.dzia("dzow", dzhv(int ), (int)91);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setBaseBoost(float var1_1) {
        v0 /* !! */  = by.jt;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(by.dzia("dzmq", dzin(int ), (int)39) - by.dzia("dzmp", dzin(int ), (int)38));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1392319435: {
                    break block23;
                }
                case 1144243228: {
                    continue block23;
                }
            }
            break;
        }
        var4_2 = by.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = by.jt - by.dzia("dzmr", dzin(int ), (int)40)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == by.dzia("dzms", dzhv(int ), (int)69)) break;
            v1 /* !! */  = (long)by.dzia("dzmt", dzhv(int ), (int)70);
        }
        var3_3 /* !! */  = by.b;
        v2 /* !! */  = by.jt;
        if (true) ** GOTO lbl22
        block25: while (true) {
            v2 /* !! */  = (long)(v3 - by.dzia("dzmu", dzin(int ), (int)41));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1805521892: {
                    v3 = by.dzia("dzmv", dzin(int ), (int)42);
                    continue block25;
                }
                case -1392319435: {
                    break block25;
                }
                case 1067318721: {
                    v3 = by.dzia("dzmw", dzin(int ), (int)43);
                    continue block25;
                }
                case 1323612456: {
                    v3 = by.dzia("dzmx", dzin(int ), (int)44);
                    continue block25;
                }
            }
            break;
        }
        var2_4 = by.a;
        if (!var4_2) ** GOTO lbl41
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl41:
                // 1 sources

                if (var2_4 || var2_4) continue block26;
                v4 /* !! */  = by.jt;
                if (true) ** GOTO lbl46
                block27: while (true) {
                    v4 /* !! */  = (long)(v5 - by.dzia("dzmy", dzin(int ), (int)45));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1395088665: {
                            v5 = by.dzia("dzmz", dzin(int ), (int)46);
                            continue block27;
                        }
                        case -1392319435: {
                            break block27;
                        }
                        case -249343204: {
                            v5 = by.dzia("dzna", dzin(int ), (int)47);
                            continue block27;
                        }
                        case -241387350: {
                            v5 = by.dzia("dznb", dzin(int ), (int)48);
                            continue block27;
                        }
                    }
                    break;
                }
                this.baseBoost = var1_1;
                if (!var2_4) ** break;
                continue block26;
                return;
                case 0: {
                    var3_3 /* !! */  = (int)by.dzia("dznc", dzhv(int ), (int)71);
                    if (var4_2) {
                        throw null;
                    }
                }
lbl66:
                // 4 sources

                case 1: {
                    var3_3 /* !! */  = (int)by.dzia("dznd", dzhv(int ), (int)72);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 2: {
                    var3_3 /* !! */  = (int)by.dzia("dzne", dzhv(int ), (int)73);
                    if (!var4_2) ** GOTO lbl66
                    throw null;
                }
                case 3: {
                    var3_3 /* !! */  = (int)by.dzia("dznf", dzhv(int ), (int)74);
                    if (!var4_2) break block26;
                    throw null;
                }
                case 4: 
            }
        }
        do {
            var3_3 /* !! */  = (int)by.dzia("dzng", dzhv(int ), (int)75);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void dzpe() {
        by.dzio[0] = 8269986713696022859L;
        by.dzio[1] = 8000144622560393950L;
        by.dzio[2] = 5161750019640457807L;
        by.dzio[3] = -783947962520976127L;
        by.dzio[4] = -8176327285762357609L;
        by.dzio[5] = -559629401676810742L;
        by.dzio[6] = 6568797890192942972L;
        by.dzio[7] = -3196946897908255563L;
        by.dzio[8] = -8256732911771544364L;
        by.dzio[9] = -121736711160111766L;
        by.dzio[10] = 7259877227827654324L;
        by.dzio[11] = -8202850086630162059L;
        by.dzio[12] = -2768026855126525749L;
        by.dzio[13] = -4756716075691737826L;
        by.dzio[14] = -1233506516849052165L;
        by.dzio[15] = -8900934981768050601L;
        by.dzio[16] = 8523596547176070183L;
        by.dzio[17] = -6243031166286391817L;
        by.dzio[18] = 868916385108561910L;
        by.dzio[19] = 3411670801890362712L;
        by.dzio[20] = -2247243432258031634L;
        by.dzio[21] = -1974372770799605751L;
        by.dzio[22] = -8615222925846647883L;
        by.dzio[23] = -4552055192597525104L;
        by.dzio[24] = -4798927118181752617L;
        by.dzio[25] = -592665773689100680L;
        by.dzio[26] = -7181880274920629965L;
        by.dzio[27] = 597812749273896319L;
        by.dzio[28] = 4139123232556116642L;
        by.dzio[29] = -7088646613104149512L;
        by.dzio[30] = -7782578483796254632L;
        by.dzio[31] = -7746062822828130902L;
        by.dzio[32] = -9043540362792642764L;
        by.dzio[33] = -8788783797331956865L;
        by.dzio[34] = 8331890916774209195L;
        by.dzio[35] = -8611580243848105859L;
        by.dzio[36] = -7557854639515498109L;
        by.dzio[37] = -2772831026522511024L;
        by.dzio[38] = 9130859243526711274L;
        by.dzio[39] = -1077847674228052143L;
        by.dzio[40] = -3568284406571326441L;
        by.dzio[41] = -2068686785834160051L;
        by.dzio[42] = 6516418659593405215L;
        by.dzio[43] = 3891934915158087278L;
        by.dzio[44] = 2409402109314666742L;
        by.dzio[45] = -3582721895268034866L;
        by.dzio[46] = 6986957912481636943L;
        by.dzio[47] = -2767963632581534245L;
        by.dzio[48] = 6202531472677345951L;
        by.dzio[49] = -4774649753047555899L;
        by.dzio[50] = 5466442192381003158L;
        by.dzio[51] = 8390981918075473198L;
        by.dzio[52] = -7120727174609585765L;
        by.dzio[53] = 5384836042223164372L;
        by.dzio[54] = 2303230971634624964L;
        by.dzio[55] = -8081090302770365942L;
        by.dzio[56] = -2739495224226267045L;
        by.dzio[57] = 2638878508757568692L;
        by.dzio[58] = -6557003094517233436L;
        by.dzio[59] = 586795834571600587L;
        by.dzio[60] = -6208920998579169376L;
        by.dzio[61] = -2053267196473391051L;
        by.dzio[62] = 1583714203412145715L;
        by.dzio[63] = 589460462842168674L;
        by.dzio[64] = 5247709594788703186L;
        by.dzio[65] = -1484438208466663214L;
        by.dzio[66] = 5442149758967697519L;
        by.dzio[67] = 8257710614803282856L;
        by.dzio[68] = 8578085149758939908L;
        by.dzio[69] = 1390156504579098630L;
        by.dzio[70] = 9222294909911469167L;
        by.dzio[71] = 829653956335284260L;
        by.dzio[72] = -5049559469405992361L;
        by.dzio[73] = 1987770351345814972L;
        by.dzio[74] = -4531482290203825110L;
    }

    private static /* synthetic */ void dzpd() {
        by.dzhz[0] = -1718772584;
        by.dzhz[1] = 1149143193;
        by.dzhz[2] = 231133434;
        by.dzhz[3] = 1118753324;
        by.dzhz[4] = -501240496;
        by.dzhz[5] = -492091260;
        by.dzhz[6] = -1595886315;
        by.dzhz[7] = -1969007717;
        by.dzhz[8] = -2061764518;
        by.dzhz[9] = -1177983201;
        by.dzhz[10] = 592523905;
        by.dzhz[11] = -1447009386;
        by.dzhz[12] = 921922933;
        by.dzhz[13] = -2028832882;
        by.dzhz[14] = 1329959953;
        by.dzhz[15] = 415574292;
        by.dzhz[16] = 839218763;
        by.dzhz[17] = 106631051;
        by.dzhz[18] = -540790712;
        by.dzhz[19] = 248979054;
        by.dzhz[20] = -1758491808;
        by.dzhz[21] = 423247202;
        by.dzhz[22] = 1185085656;
        by.dzhz[23] = 1739178297;
        by.dzhz[24] = 342754861;
        by.dzhz[25] = 798674276;
        by.dzhz[26] = 197309130;
        by.dzhz[27] = -788994545;
        by.dzhz[28] = 1168196148;
        by.dzhz[29] = -1128695299;
        by.dzhz[30] = -1193160574;
        by.dzhz[31] = -1462669559;
        by.dzhz[32] = 1666731789;
        by.dzhz[33] = -1984907805;
        by.dzhz[34] = -989614058;
        by.dzhz[35] = -1548278629;
        by.dzhz[36] = -1336631772;
        by.dzhz[37] = 1571007647;
        by.dzhz[38] = -1168993747;
        by.dzhz[39] = 470607919;
        by.dzhz[40] = -154272211;
        by.dzhz[41] = -59285871;
        by.dzhz[42] = 1414502359;
        by.dzhz[43] = -998609891;
        by.dzhz[44] = 1014220498;
        by.dzhz[45] = -465900392;
        by.dzhz[46] = 1973469028;
        by.dzhz[47] = 1826659964;
        by.dzhz[48] = -1456546530;
        by.dzhz[49] = 1870712483;
        by.dzhz[50] = 549640368;
        by.dzhz[51] = 1037136800;
        by.dzhz[52] = 1752537048;
        by.dzhz[53] = 202234113;
        by.dzhz[54] = 455842914;
        by.dzhz[55] = 848050765;
        by.dzhz[56] = -1176833182;
        by.dzhz[57] = 1179998719;
        by.dzhz[58] = -52718040;
        by.dzhz[59] = 1339725110;
        by.dzhz[60] = -1129290707;
        by.dzhz[61] = 1346130554;
        by.dzhz[62] = -1924042595;
        by.dzhz[63] = -507043655;
        by.dzhz[64] = 1198978777;
        by.dzhz[65] = 101383456;
        by.dzhz[66] = 1913742137;
        by.dzhz[67] = -270872488;
        by.dzhz[68] = 1918433883;
        by.dzhz[69] = -231640091;
        by.dzhz[70] = 889472765;
        by.dzhz[71] = 1888600086;
        by.dzhz[72] = -93217863;
        by.dzhz[73] = -1235267514;
        by.dzhz[74] = -1281454224;
        by.dzhz[75] = 1002363015;
        by.dzhz[76] = -1539963363;
        by.dzhz[77] = -1926908991;
        by.dzhz[78] = 415399615;
        by.dzhz[79] = 70672043;
        by.dzhz[80] = 1499962628;
        by.dzhz[81] = 1257127045;
        by.dzhz[82] = 20811722;
        by.dzhz[83] = -1852088718;
        by.dzhz[84] = 1613092009;
        by.dzhz[85] = -105103518;
        by.dzhz[86] = -1742237616;
        by.dzhz[87] = -732983151;
        by.dzhz[88] = 422995376;
        by.dzhz[89] = 1118537844;
        by.dzhz[90] = -285002587;
        by.dzhz[91] = 1535626997;
        by.dzhz[92] = 853119621;
        by.dzhz[93] = -1245058933;
        by.dzhz[94] = 221934922;
        by.dzhz[95] = -2062376781;
        by.dzhz[96] = -1042807048;
    }

    private static /* synthetic */ long dzin(int n2) {
        return dzio[n2] ^ dzip[n2];
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public float getBoostMultiplier() {
        boolean bl2;
        Object object = jt;
        block9: while (true) {
            switch ((int)object) {
                case -1392319435: {
                    break block9;
                }
                case 1915002678: {
                    object = by.dzia("dzir", dzin(int ), (int)1) - by.dzia("dziq", dzin(int ), (int)0);
                    continue block9;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = jt;
        boolean bl4 = true;
        block10: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - by.dzia("dzis", dzin(int ), (int)2);
            }
            switch ((int)object2) {
                case -1392319435: {
                    break block10;
                }
                case -1259983547: {
                    callSite = by.dzia("dzit", dzin(int ), (int)3);
                    continue block10;
                }
                case 355543087: {
                    callSite = by.dzia("dziu", dzin(int ), (int)4);
                    continue block10;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = jt - by.dzia("dziv", dzin(int ), (int)5)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == by.dzia("dziw", dzhv(int ), (int)8)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = by.dzia("dzix", dzhv(int ), (int)9);
        }
        if (bl2) return (float)by.dzia("dziz", dziy(int ), (int)10);
        if (bl2) return (float)by.dzia("dziz", dziy(int ), (int)10);
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = jt - by.dzia("dzja", dzin(int ), (int)6)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == by.dzia("dzjb", dzhv(int ), (int)11)) {
                return this.boostMultiplier;
            }
            object4 = by.dzia("dzjc", dzhv(int ), (int)12);
        }
    }

    private static /* synthetic */ void dzpf() {
        by.dzip[0] = 1130543514887617806L;
        by.dzip[1] = -4154289171077064939L;
        by.dzip[2] = 7163973765585122682L;
        by.dzip[3] = 7344606262007987354L;
        by.dzip[4] = 863680683803360710L;
        by.dzip[5] = -2660857221167276684L;
        by.dzip[6] = -8389207959701785558L;
        by.dzip[7] = -8720433038488349729L;
        by.dzip[8] = -766002262117573032L;
        by.dzip[9] = 568561814787285047L;
        by.dzip[10] = 1038580493969341493L;
        by.dzip[11] = -2430090621691391002L;
        by.dzip[12] = 8721875119156294199L;
        by.dzip[13] = 2859742483967897074L;
        by.dzip[14] = -579290814990814894L;
        by.dzip[15] = -6749361352400307019L;
        by.dzip[16] = 8040326363431469784L;
        by.dzip[17] = -4983738500350744328L;
        by.dzip[18] = 817035303340850464L;
        by.dzip[19] = 2032782698312701748L;
        by.dzip[20] = 2540957086800260204L;
        by.dzip[21] = -44699394019138918L;
        by.dzip[22] = -4551596343907242776L;
        by.dzip[23] = -7552814312176377325L;
        by.dzip[24] = 5880931786223452847L;
        by.dzip[25] = -2178975125124439359L;
        by.dzip[26] = 6380234882709433581L;
        by.dzip[27] = 5977450523516885055L;
        by.dzip[28] = 2183109854097791320L;
        by.dzip[29] = -7524189509304478112L;
        by.dzip[30] = 3601620779947127131L;
        by.dzip[31] = -2299642112085490644L;
        by.dzip[32] = 7577522970334859847L;
        by.dzip[33] = -3352073696660781012L;
        by.dzip[34] = -3722935711685993890L;
        by.dzip[35] = 4325478274820103760L;
        by.dzip[36] = -5250763048892359127L;
        by.dzip[37] = -3467083253798325430L;
        by.dzip[38] = 3314493541140235134L;
        by.dzip[39] = 5404752255526316030L;
        by.dzip[40] = 8867184358068376071L;
        by.dzip[41] = -1332533901444983761L;
        by.dzip[42] = -1816987830731724608L;
        by.dzip[43] = -7511431074282408454L;
        by.dzip[44] = -8539601679451637922L;
        by.dzip[45] = 8021332127739258420L;
        by.dzip[46] = 33089298717337700L;
        by.dzip[47] = 8786825880915579098L;
        by.dzip[48] = -4371873558510200876L;
        by.dzip[49] = 7153556055810640864L;
        by.dzip[50] = -5257321203547846983L;
        by.dzip[51] = 8307283184472897381L;
        by.dzip[52] = -5300485866612341556L;
        by.dzip[53] = -3650128496798899132L;
        by.dzip[54] = 4269472253011905250L;
        by.dzip[55] = -934005224427609067L;
        by.dzip[56] = -196529747780831480L;
        by.dzip[57] = 6320674017048421108L;
        by.dzip[58] = -4610277667249206149L;
        by.dzip[59] = -4815079515716390769L;
        by.dzip[60] = 590275273003974623L;
        by.dzip[61] = -6725039885898084083L;
        by.dzip[62] = 3128734610940602208L;
        by.dzip[63] = 5787490113834404828L;
        by.dzip[64] = -8137892656642617699L;
        by.dzip[65] = -5809460795770891047L;
        by.dzip[66] = 2323481783647679029L;
        by.dzip[67] = 1164116166452761924L;
        by.dzip[68] = -8233015936891103349L;
        by.dzip[69] = 6796764504444221607L;
        by.dzip[70] = 119446557214494780L;
        by.dzip[71] = -1856158779751093542L;
        by.dzip[72] = 6587663355796668770L;
        by.dzip[73] = 911362639201734633L;
        by.dzip[74] = 8616988489265876017L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getSmoothingFactor() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = by.jt - by.dzia("dzka", dzin(int ), (int)11)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == by.dzia("dzkb", dzhv(int ), (int)30)) break;
            v0 /* !! */  = (long)by.dzia("dzkc", dzhv(int ), (int)31);
        }
        var3_1 = by.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = by.jt - by.dzia("dzkd", dzin(int ), (int)12)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == by.dzia("dzke", dzhv(int ), (int)32)) break;
            v1 /* !! */  = (long)by.dzia("dzkf", dzhv(int ), (int)33);
        }
        var2_2 /* !! */  = by.b;
        v2 /* !! */  = by.jt;
        if (true) ** GOTO lbl19
        block19: while (true) {
            v2 /* !! */  = (long)(v3 - by.dzia("dzkg", dzin(int ), (int)13));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1417101766: {
                    v3 = by.dzia("dzkh", dzin(int ), (int)14);
                    continue block19;
                }
                case -1392319435: {
                    break block19;
                }
                case -441981310: {
                    v3 = by.dzia("dzki", dzin(int ), (int)15);
                    continue block19;
                }
                case 832675537: {
                    v3 = by.dzia("dzkj", dzin(int ), (int)16);
                    continue block19;
                }
            }
            break;
        }
        var1_3 = by.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (float)by.dzia("dzkk", dziy(int ), (int)34);
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = by.jt;
                if (true) ** GOTO lbl44
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - by.dzia("dzkl", dzin(int ), (int)17));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1860250827: {
                            v5 = by.dzia("dzkn", dzin(int ), (int)18);
                            continue block21;
                        }
                        case -1392319435: {
                            break block21;
                        }
                        case 238067896: {
                            v5 = by.dzia("dzko", dzin(int ), (int)19);
                            continue block21;
                        }
                    }
                    break;
                }
                return this.smoothingFactor;
            }
            case 0: {
                var2_2 /* !! */  = (int)by.dzia("dzkp", dzhv(int ), (int)35);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)by.dzia("dzkq", dzhv(int ), (int)36);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)by.dzia("dzkr", dzhv(int ), (int)37);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)by.dzia("dzks", dzhv(int ), (int)38);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    static {
        dzhz = new int[97];
        by.dzpc();
        by.dzpd();
        dzio = new long[75];
        dzip = new long[75];
        by.dzpe();
        by.dzpf();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setBoostMultiplier(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = by.jt - by.dzia("dzly", dzin(int ), (int)34)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == by.dzia("dzlz", dzhv(int ), (int)56)) break;
            v0 /* !! */  = (long)by.dzia("dzma", dzhv(int ), (int)57);
        }
        var4_2 = by.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = by.jt - by.dzia("dzmb", dzin(int ), (int)35)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == by.dzia("dzmc", dzhv(int ), (int)58)) break;
            v1 /* !! */  = (long)by.dzia("dzmd", dzhv(int ), (int)59);
        }
        var3_3 /* !! */  = by.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = by.jt - by.dzia("dzme", dzin(int ), (int)36)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == by.dzia("dzmf", dzhv(int ), (int)60)) break;
            v2 /* !! */  = (long)by.dzia("dzmg", dzhv(int ), (int)61);
        }
        var2_4 = by.a;
        if (var4_2) {
            throw null;
lbl21:
            // 2 sources

            return;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl21
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = by.jt - by.dzia("dzmh", dzin(int ), (int)37)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == by.dzia("dzmi", dzhv(int ), (int)62)) break;
                    v3 /* !! */  = (long)by.dzia("dzmj", dzhv(int ), (int)63);
                }
                this.boostMultiplier = var1_1;
                if (!var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)by.dzia("dzmk", dzhv(int ), (int)64);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl49
            }
            case 1: {
                var3_3 /* !! */  = (int)by.dzia("dzml", dzhv(int ), (int)65);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)by.dzia("dzmm", dzhv(int ), (int)66);
                if (!var4_2) break;
                throw null;
            }
lbl49:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)by.dzia("dzmn", dzhv(int ), (int)67);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)by.dzia("dzmo", dzhv(int ), (int)68);
        ** while (!var4_2)
lbl57:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setYSpeed(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = by.jt - by.dzia("dznw", dzin(int ), (int)57)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == by.dzia("dznx", dzhv(int ), (int)83)) break;
            v0 /* !! */  = (long)by.dzia("dzny", dzhv(int ), (int)84);
        }
        var4_2 = by.c;
        v1 /* !! */  = by.jt;
        if (true) ** GOTO lbl12
        block23: while (true) {
            v1 /* !! */  = (long)(v2 - by.dzia("dznz", dzin(int ), (int)58));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1392319435: {
                    break block23;
                }
                case -1131289796: {
                    v2 = by.dzia("dzoa", dzin(int ), (int)59);
                    continue block23;
                }
                case 1566374825: {
                    v2 = by.dzia("dzob", dzin(int ), (int)60);
                    continue block23;
                }
            }
            break;
        }
        var3_3 /* !! */  = by.b;
        v3 /* !! */  = by.jt;
        if (true) ** GOTO lbl26
        block24: while (true) {
            v3 /* !! */  = (long)(v4 - by.dzia("dzoc", dzin(int ), (int)61));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1636785848: {
                    v4 = by.dzia("dzod", dzin(int ), (int)62);
                    continue block24;
                }
                case -1392319435: {
                    break block24;
                }
                case -290649720: {
                    v4 = by.dzia("dzoe", dzin(int ), (int)63);
                    continue block24;
                }
                case 231714592: {
                    v4 = by.dzia("dzof", dzin(int ), (int)64);
                    continue block24;
                }
            }
            break;
        }
        var2_4 = by.a;
        if (var4_2) {
            throw null;
lbl41:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl41
        v5 /* !! */  = by.jt;
        if (true) ** GOTO lbl48
        block26: while (true) {
            v5 /* !! */  = (long)(by.dzia("dzoh", dzin(int ), (int)66) - by.dzia("dzog", dzin(int ), (int)65));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -2142814861: {
                    continue block26;
                }
                case -1392319435: {
                    break block26;
                }
            }
            break;
        }
        this.ySpeed = var1_1;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block15 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)by.dzia("dzoi", dzhv(int ), (int)85);
                if (var4_2) {
                    throw null;
                }
            }
lbl64:
            // 4 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)by.dzia("dzoj", dzhv(int ), (int)86);
                    if (!var4_2) break block15;
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)by.dzia("dzok", dzhv(int ), (int)87);
                if (!var4_2) ** GOTO lbl64
                throw null;
            }
            case 3: {
                do {
                    var3_3 /* !! */  = (int)by.dzia("dzol", dzhv(int ), (int)88);
                } while (!var4_2);
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)by.dzia("dzom", dzhv(int ), (int)89);
        ** while (!var4_2)
lbl81:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void setSmoothingFactor(float var1_1) {
        v0 /* !! */  = by.jt;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - by.dzia("dznh", dzin(int ), (int)49));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1392319435: {
                    break block20;
                }
                case -884923858: {
                    v1 = by.dzia("dzni", dzin(int ), (int)50);
                    continue block20;
                }
                case -570590325: {
                    v1 = by.dzia("dznj", dzin(int ), (int)51);
                    continue block20;
                }
            }
            break;
        }
        var4_2 = by.c;
        v2 /* !! */  = by.jt;
        block21: while (true) {
            switch ((int)v2 /* !! */ ) {
                case -1392319435: {
                    break block21;
                }
                case 872254506: {
                    v2 /* !! */  = (long)(by.dzia("dznl", dzin(int ), (int)53) - by.dzia("dznk", dzin(int ), (int)52));
                    continue block21;
                }
            }
            break;
        }
        var3_3 /* !! */  = by.b;
        while (true) {
            block36: {
                if ((v3 /* !! */  = (cfr_temp_1 = by.jt - by.dzia("dznm", dzin(int ), (int)54)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  != by.dzia("dznn", dzhv(int ), (int)76)) break block36;
                var2_4 = by.a;
                if (var3_3 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v3 /* !! */  = (long)by.dzia("dzno", dzhv(int ), (int)77);
        }
        cfr_temp_0 = -2147483648;
        block23: do {
            switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var4_2) {
                        throw null;
                    }
                    if (var2_4 || var2_4) ** GOTO lbl52
                    v4 /* !! */  = by.jt;
                    block24: while (true) {
                        switch ((int)v4 /* !! */ ) {
                            case -1392319435: {
                                break block24;
                            }
                            case 185844207: {
                                v4 /* !! */  = (long)(by.dzia("dznq", dzin(int ), (int)56) - by.dzia("dznp", dzin(int ), (int)55));
                                continue block24;
                            }
                        }
                        break;
                    }
                    this.smoothingFactor = var1_1;
                    if (!var2_4) ** GOTO lbl53
lbl52:
                    // 2 sources

                    return;
lbl53:
                    // 1 sources

                    return;
                }
                case 2: {
                    var3_3 /* !! */  = (int)by.dzia("dznt", dzhv(int ), (int)80);
                    cfr_temp_0 = 0;
                    if (!var4_2) continue block23;
                    throw null;
                }
                case 3: {
                    var3_3 /* !! */  = (int)by.dzia("dznu", dzhv(int ), (int)81);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 0: {
                    ** GOTO lbl69
                }
                case 4: {
                    var3_3 /* !! */  = (int)by.dzia("dznv", dzhv(int ), (int)82);
                    if (var4_2) {
                        throw null;
                    }
lbl69:
                    // 3 sources

                    var3_3 /* !! */  = (int)by.dzia("dznr", dzhv(int ), (int)78);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 1: 
            }
            break;
        } while (true);
        do {
            var3_3 /* !! */  = (int)by.dzia("dzns", dzhv(int ), (int)79);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_243 getDirection() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = by.jt - by.dzia("dzlk", dzin(int ), (int)28)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == by.dzia("dzll", dzhv(int ), (int)48)) break;
            v0 /* !! */  = (long)by.dzia("dzlm", dzhv(int ), (int)49);
        }
        var3_1 = by.c;
        v1 /* !! */  = by.jt;
        if (true) ** GOTO lbl12
        block15: while (true) {
            v1 /* !! */  = (long)(by.dzia("dzlo", dzin(int ), (int)30) - by.dzia("dzln", dzin(int ), (int)29));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1392319435: {
                    break block15;
                }
                case -894844201: {
                    continue block15;
                }
            }
            break;
        }
        var2_2 /* !! */  = by.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = by.jt - by.dzia("dzlp", dzin(int ), (int)31)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == by.dzia("dzlq", dzhv(int ), (int)50)) break;
                    v2 /* !! */  = (long)by.dzia("dzlr", dzhv(int ), (int)51);
                }
                var1_3 = by.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = by.jt;
                if (true) ** GOTO lbl37
                block18: while (true) {
                    v3 /* !! */  = (long)(by.dzia("dzlt", dzin(int ), (int)33) - by.dzia("dzls", dzin(int ), (int)32));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1392319435: {
                            break block18;
                        }
                        case 1729984178: {
                            continue block18;
                        }
                    }
                    break;
                }
                return this.direction;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)by.dzia("dzlu", dzhv(int ), (int)52);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)by.dzia("dzlv", dzhv(int ), (int)53);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)by.dzia("dzlw", dzhv(int ), (int)54);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)by.dzia("dzlx", dzhv(int ), (int)55);
        ** while (!var3_1)
lbl61:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int dzhv(int n2) {
        return dzhy[n2] ^ dzhz[n2];
    }

    private static /* synthetic */ void dzpc() {
        by.dzhy[0] = -1718772579;
        by.dzhy[1] = 1149143193;
        by.dzhy[2] = 231133437;
        by.dzhy[3] = 1118753327;
        by.dzhy[4] = -501240491;
        by.dzhy[5] = -492091258;
        by.dzhy[6] = -1595886314;
        by.dzhy[7] = -1969007714;
        by.dzhy[8] = -2061764517;
        by.dzhy[9] = -595509394;
        by.dzhy[10] = 491085901;
        by.dzhy[11] = -1447009385;
        by.dzhy[12] = 669201437;
        by.dzhy[13] = -2028832882;
        by.dzhy[14] = 1329959955;
        by.dzhy[15] = 415574293;
        by.dzhy[16] = 839218763;
        by.dzhy[17] = -106631052;
        by.dzhy[18] = 582528677;
        by.dzhy[19] = -248979055;
        by.dzhy[20] = 761182186;
        by.dzhy[21] = 423247203;
        by.dzhy[22] = 1834590958;
        by.dzhy[23] = 1507789629;
        by.dzhy[24] = -342754862;
        by.dzhy[25] = -26984860;
        by.dzhy[26] = 0xBC2B2CB;
        by.dzhy[27] = -788994545;
        by.dzhy[28] = 1168196149;
        by.dzhy[29] = -1128695297;
        by.dzhy[30] = 1193160573;
        by.dzhy[31] = -1360740826;
        by.dzhy[32] = 1666731788;
        by.dzhy[33] = -306025876;
        by.dzhy[34] = -99395766;
        by.dzhy[35] = -1548278632;
        by.dzhy[36] = -1336631771;
        by.dzhy[37] = 1571007644;
        by.dzhy[38] = -1168993748;
        by.dzhy[39] = -470607920;
        by.dzhy[40] = -839628638;
        by.dzhy[41] = -1037958947;
        by.dzhy[42] = -1414502360;
        by.dzhy[43] = 925249473;
        by.dzhy[44] = 1014220499;
        by.dzhy[45] = -465900389;
        by.dzhy[46] = 1973469030;
        by.dzhy[47] = 1826659966;
        by.dzhy[48] = -1456546529;
        by.dzhy[49] = -301241481;
        by.dzhy[50] = -549640369;
        by.dzhy[51] = 1685067170;
        by.dzhy[52] = 1752537048;
        by.dzhy[53] = 202234114;
        by.dzhy[54] = 455842914;
        by.dzhy[55] = 848050766;
        by.dzhy[56] = -1176833181;
        by.dzhy[57] = 1274057105;
        by.dzhy[58] = -52718039;
        by.dzhy[59] = -1565012835;
        by.dzhy[60] = -1129290708;
        by.dzhy[61] = 1686602259;
        by.dzhy[62] = -1924042596;
        by.dzhy[63] = -104152226;
        by.dzhy[64] = 1198978781;
        by.dzhy[65] = 101383456;
        by.dzhy[66] = 1913742139;
        by.dzhy[67] = -270872485;
        by.dzhy[68] = 1918433883;
        by.dzhy[69] = -231640092;
        by.dzhy[70] = -702038460;
        by.dzhy[71] = 1888600085;
        by.dzhy[72] = -93217862;
        by.dzhy[73] = -1235267514;
        by.dzhy[74] = -1281454221;
        by.dzhy[75] = 1002363015;
        by.dzhy[76] = -1539963364;
        by.dzhy[77] = 78555273;
        by.dzhy[78] = 415399612;
        by.dzhy[79] = 70672042;
        by.dzhy[80] = 1499962631;
        by.dzhy[81] = 1257127046;
        by.dzhy[82] = 20811721;
        by.dzhy[83] = 1852088717;
        by.dzhy[84] = 1915829663;
        by.dzhy[85] = -105103517;
        by.dzhy[86] = -1742237612;
        by.dzhy[87] = -732983152;
        by.dzhy[88] = 422995376;
        by.dzhy[89] = 1118537847;
        by.dzhy[90] = -285002588;
        by.dzhy[91] = 1425183652;
        by.dzhy[92] = 853119623;
        by.dzhy[93] = -1245058933;
        by.dzhy[94] = 221934926;
        by.dzhy[95] = -2062376777;
        by.dzhy[96] = -1042807047;
    }

    public static /* synthetic */ CallSite dzia(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

