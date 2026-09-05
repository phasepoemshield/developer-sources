/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  net.minecraft.class_1799
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_1799;

final class dw$Row
extends Record {
    private static int[] keaj = new int[86];
    public static final long se = 3742262504818249714L;
    private final class_1799 stack;
    public static final boolean a;
    private final String id;
    private static long[] keas;
    private final String name;
    private final float progress;
    private static long[] keat;
    private static int[] keak;
    public static final boolean c;
    public static final int b;
    private final int ticks;
    private final int color;

    private static /* synthetic */ void kegx() {
        dw$Row.keas[0] = -2358671813918561128L;
        dw$Row.keas[1] = -676508106553652314L;
        dw$Row.keas[2] = -2550917774175613002L;
        dw$Row.keas[3] = 4473953747692764476L;
        dw$Row.keas[4] = -919800217509753603L;
        dw$Row.keas[5] = -4643384019415446841L;
        dw$Row.keas[6] = -49395033439028032L;
        dw$Row.keas[7] = -2325352473242729305L;
        dw$Row.keas[8] = -734526822264032462L;
        dw$Row.keas[9] = 4570733060328306631L;
        dw$Row.keas[10] = -1666931946171489770L;
        dw$Row.keas[11] = 6102149695916752015L;
        dw$Row.keas[12] = 1873295618463101141L;
        dw$Row.keas[13] = 4062956452957174808L;
        dw$Row.keas[14] = 4472220528569664709L;
        dw$Row.keas[15] = -6335360759287549108L;
        dw$Row.keas[16] = -8864733796611486236L;
        dw$Row.keas[17] = 4309188681280878933L;
        dw$Row.keas[18] = 3038352432357044653L;
        dw$Row.keas[19] = 3826264945220595295L;
        dw$Row.keas[20] = -2631571190364042085L;
        dw$Row.keas[21] = 6660117339728150692L;
        dw$Row.keas[22] = 8280909691447147533L;
        dw$Row.keas[23] = 3389970279439935721L;
        dw$Row.keas[24] = -148129838567773512L;
        dw$Row.keas[25] = 593057810783502214L;
        dw$Row.keas[26] = 2032969328804041018L;
        dw$Row.keas[27] = -425199757248092955L;
        dw$Row.keas[28] = 4321765090971573558L;
        dw$Row.keas[29] = -2985678096286442783L;
        dw$Row.keas[30] = 7998821585365173244L;
        dw$Row.keas[31] = 7097826527939852305L;
        dw$Row.keas[32] = -8845197003084865610L;
        dw$Row.keas[33] = 7064173454702703902L;
        dw$Row.keas[34] = -2143827170284773780L;
        dw$Row.keas[35] = -694772725967205817L;
        dw$Row.keas[36] = 1613178753669457341L;
        dw$Row.keas[37] = -5350594762223723510L;
        dw$Row.keas[38] = 6725709487607918689L;
        dw$Row.keas[39] = -1367307309394173914L;
        dw$Row.keas[40] = 4359484893471406628L;
        dw$Row.keas[41] = -7371238003980409536L;
        dw$Row.keas[42] = 2380419639779129014L;
        dw$Row.keas[43] = 8329909838975991563L;
        dw$Row.keas[44] = 2999871582921183462L;
        dw$Row.keas[45] = 4881396484204437921L;
        dw$Row.keas[46] = 2527976940180672297L;
        dw$Row.keas[47] = 8081172016223188603L;
        dw$Row.keas[48] = -4452508063900776230L;
        dw$Row.keas[49] = 5715543133810536290L;
        dw$Row.keas[50] = 3869094898267103243L;
        dw$Row.keas[51] = -8787498269000096842L;
        dw$Row.keas[52] = -5770360003545306683L;
        dw$Row.keas[53] = -8289657344935083978L;
        dw$Row.keas[54] = 3172931480489884734L;
        dw$Row.keas[55] = 5824896279403451984L;
        dw$Row.keas[56] = -1440395475783153067L;
        dw$Row.keas[57] = 5188895350512834476L;
        dw$Row.keas[58] = -7384218578859075584L;
        dw$Row.keas[59] = 4332724282202822458L;
        dw$Row.keas[60] = 2924421161433228141L;
        dw$Row.keas[61] = -5014356070050713963L;
        dw$Row.keas[62] = 6804623508956235892L;
        dw$Row.keas[63] = 7090965117033204471L;
        dw$Row.keas[64] = -3136972296572311411L;
        dw$Row.keas[65] = 2924822928076024493L;
        dw$Row.keas[66] = 2706688550482512403L;
        dw$Row.keas[67] = 8354484379021964204L;
        dw$Row.keas[68] = -4485627860229046665L;
        dw$Row.keas[69] = -4979966923488047839L;
        dw$Row.keas[70] = 8856638714549583225L;
        dw$Row.keas[71] = 4607241616389846647L;
        dw$Row.keas[72] = -350896012302574730L;
        dw$Row.keas[73] = -8986646310758221527L;
        dw$Row.keas[74] = 3494412812139031985L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int ticks() {
        v0 /* !! */  = dw$Row.se;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - dw$Row.keal("keeq", kear(int ), (int)44));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1208709134: {
                    break block23;
                }
                case -219213799: {
                    v1 = dw$Row.keal("keer", kear(int ), (int)45);
                    continue block23;
                }
                case 748009236: {
                    v1 = dw$Row.keal("kees", kear(int ), (int)46);
                    continue block23;
                }
                case 1368727513: {
                    v1 = dw$Row.keal("keet", kear(int ), (int)47);
                    continue block23;
                }
            }
            break;
        }
        var3_1 = dw$Row.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = dw$Row.se - dw$Row.keal("keeu", kear(int ), (int)48)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == dw$Row.keal("keev", keai(int ), (int)61)) break;
            v2 /* !! */  = (long)dw$Row.keal("keew", keai(int ), (int)62);
        }
        var2_2 /* !! */  = dw$Row.b;
        v3 /* !! */  = dw$Row.se;
        if (true) ** GOTO lbl29
        block25: while (true) {
            v3 /* !! */  = (long)(v4 - dw$Row.keal("keex", kear(int ), (int)49));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1208709134: {
                    break block25;
                }
                case -288519985: {
                    v4 = dw$Row.keal("keey", kear(int ), (int)50);
                    continue block25;
                }
                case -86173793: {
                    v4 = dw$Row.keal("keez", kear(int ), (int)51);
                    continue block25;
                }
                case -43634770: {
                    v4 = dw$Row.keal("kefa", kear(int ), (int)52);
                    continue block25;
                }
            }
            break;
        }
        var1_3 = dw$Row.a;
        if (var3_1) {
            throw null;
lbl44:
            // 1 sources

            return (int)dw$Row.keal("kefb", keai(int ), (int)63);
        }
        ** while (var1_3 || var1_3)
lbl47:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = dw$Row.se;
                if (true) ** GOTO lbl54
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - dw$Row.keal("kefc", kear(int ), (int)53));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1208709134: {
                            break block27;
                        }
                        case -734882749: {
                            v6 = dw$Row.keal("kefd", kear(int ), (int)54);
                            continue block27;
                        }
                        case 2144009073: {
                            v6 = dw$Row.keal("kefe", kear(int ), (int)55);
                            continue block27;
                        }
                    }
                    break;
                }
                return this.ticks;
            }
lbl64:
            // 3 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)dw$Row.keal("keff", keai(int ), (int)64);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)dw$Row.keal("kefg", keai(int ), (int)65);
                if (!var3_1) ** GOTO lbl64
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dw$Row.keal("kefh", keai(int ), (int)66);
                    if (!var3_1) ** GOTO lbl64
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)dw$Row.keal("kefi", keai(int ), (int)67);
        ** while (!var3_1)
lbl81:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dw$Row.se - dw$Row.keal("kebj", kear(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dw$Row.keal("kebk", keai(int ), (int)11)) break;
            v0 /* !! */  = (long)dw$Row.keal("kebl", keai(int ), (int)12);
        }
        var3_1 = dw$Row.c;
        v1 /* !! */  = dw$Row.se;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - dw$Row.keal("kebm", kear(int ), (int)10));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1208709134: {
                    break block19;
                }
                case -526807653: {
                    v2 = dw$Row.keal("kebn", kear(int ), (int)11);
                    continue block19;
                }
                case 408845200: {
                    v2 = dw$Row.keal("kebo", kear(int ), (int)12);
                    continue block19;
                }
                case 2100339921: {
                    v2 = dw$Row.keal("kebp", kear(int ), (int)13);
                    continue block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = dw$Row.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = dw$Row.se;
                if (true) ** GOTO lbl32
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - dw$Row.keal("kebq", kear(int ), (int)14));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1208709134: {
                            break block20;
                        }
                        case -610854589: {
                            v4 = dw$Row.keal("kebr", kear(int ), (int)15);
                            continue block20;
                        }
                        case -235643419: {
                            v4 = dw$Row.keal("kebs", kear(int ), (int)16);
                            continue block20;
                        }
                        case 731924721: {
                            v4 = dw$Row.keal("kebt", kear(int ), (int)17);
                            continue block20;
                        }
                    }
                    break;
                }
                var1_3 = dw$Row.a;
                if (var3_1) {
                    throw null;
                    return (int)dw$Row.keal("kebu", keai(int ), (int)13);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = dw$Row.se - dw$Row.keal("kebv", kear(int ), (int)18)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == dw$Row.keal("kebw", keai(int ), (int)14)) break;
                    v5 /* !! */  = (long)dw$Row.keal("kebx", keai(int ), (int)15);
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dw$Row.class, "id;name;stack;ticks;progress;color", "id", "name", "stack", "ticks", "progress", "color"}, this);
            }
lbl57:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)dw$Row.keal("keby", keai(int ), (int)16);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)dw$Row.keal("kebz", keai(int ), (int)17);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)dw$Row.keal("keca", keai(int ), (int)18);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)dw$Row.keal("kecb", keai(int ), (int)19);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String id() {
        v0 /* !! */  = dw$Row.se;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(dw$Row.keal("kecu", kear(int ), (int)24) - dw$Row.keal("kect", kear(int ), (int)23));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1208709134: {
                    break block15;
                }
                case 954124940: {
                    continue block15;
                }
            }
            break;
        }
        var3_1 = dw$Row.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = dw$Row.se - dw$Row.keal("kecv", kear(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == dw$Row.keal("kecw", keai(int ), (int)33)) break;
            v1 /* !! */  = (long)dw$Row.keal("kecx", keai(int ), (int)34);
        }
        var2_2 = dw$Row.b;
        v2 /* !! */  = dw$Row.se;
        if (true) ** GOTO lbl22
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - dw$Row.keal("kecy", kear(int ), (int)26));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1920257848: {
                    v3 = dw$Row.keal("kecz", kear(int ), (int)27);
                    continue block17;
                }
                case -1208709134: {
                    break block17;
                }
                case -115812554: {
                    v3 = dw$Row.keal("keda", kear(int ), (int)28);
                    continue block17;
                }
                case 891469899: {
                    v3 = dw$Row.keal("kedb", kear(int ), (int)29);
                    continue block17;
                }
            }
            break;
        }
        var1_3 = dw$Row.a;
        if (var3_1) {
            throw null;
lbl37:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl40:
        // 1 sources

        v4 /* !! */  = dw$Row.se;
        if (true) ** GOTO lbl44
        block19: while (true) {
            v4 /* !! */  = (long)(v5 - dw$Row.keal("kedc", kear(int ), (int)30));
lbl44:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1208709134: {
                    break block19;
                }
                case -698801480: {
                    v5 = dw$Row.keal("kedd", kear(int ), (int)31);
                    continue block19;
                }
                case 1916328547: {
                    v5 = dw$Row.keal("kede", kear(int ), (int)32);
                    continue block19;
                }
            }
            break;
        }
        return this.id;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dw$Row.se - dw$Row.keal("kecc", kear(int ), (int)19)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dw$Row.keal("kecd", keai(int ), (int)20)) break;
            v0 /* !! */  = (long)dw$Row.keal("kece", keai(int ), (int)21);
        }
        var4_2 = dw$Row.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = dw$Row.se - dw$Row.keal("kecf", kear(int ), (int)20)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == dw$Row.keal("kecg", keai(int ), (int)22)) break;
            v1 /* !! */  = (long)dw$Row.keal("kech", keai(int ), (int)23);
        }
        var3_3 /* !! */  = dw$Row.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = dw$Row.se - dw$Row.keal("keci", kear(int ), (int)21)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == dw$Row.keal("kecj", keai(int ), (int)24)) break;
            v2 /* !! */  = (long)dw$Row.keal("keck", keai(int ), (int)25);
        }
        var2_4 = dw$Row.a;
        if (var4_2) {
            throw null;
lbl24:
            // 1 sources

            return (boolean)dw$Row.keal("kecl", keai(int ), (int)26);
        }
        ** while (var2_4 || var2_4)
lbl27:
        // 1 sources

        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = dw$Row.se - dw$Row.keal("kecm", kear(int ), (int)22)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == dw$Row.keal("kecn", keai(int ), (int)27)) break;
                    v3 /* !! */  = (long)dw$Row.keal("keco", keai(int ), (int)28);
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dw$Row.class, "id;name;stack;ticks;progress;color", "id", "name", "stack", "ticks", "progress", "color"}, this, var1_1);
            }
            case 0: {
                var3_3 /* !! */  = (int)dw$Row.keal("kecp", keai(int ), (int)29);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)dw$Row.keal("kecq", keai(int ), (int)30);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)dw$Row.keal("kecr", keai(int ), (int)31);
                    if (!var4_2) break block0;
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)dw$Row.keal("kecs", keai(int ), (int)32);
        ** while (!var4_2)
lbl53:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kegy() {
        dw$Row.keat[0] = -2496052564380961231L;
        dw$Row.keat[1] = -3844640778365071971L;
        dw$Row.keat[2] = -8461706913503438897L;
        dw$Row.keat[3] = 5023331588309994133L;
        dw$Row.keat[4] = -7112803137636713880L;
        dw$Row.keat[5] = -3497106640111187096L;
        dw$Row.keat[6] = 589948724228548024L;
        dw$Row.keat[7] = -8661045270273778909L;
        dw$Row.keat[8] = 7040451865629072313L;
        dw$Row.keat[9] = -7147920185994859915L;
        dw$Row.keat[10] = 8344752183178923584L;
        dw$Row.keat[11] = -2098823694168057814L;
        dw$Row.keat[12] = -8581707420896491225L;
        dw$Row.keat[13] = 4570263473913697222L;
        dw$Row.keat[14] = -809222453145172518L;
        dw$Row.keat[15] = 2946088359220240335L;
        dw$Row.keat[16] = 8790059980940415578L;
        dw$Row.keat[17] = -6862273920479999477L;
        dw$Row.keat[18] = -5164260158511887567L;
        dw$Row.keat[19] = 7011803656929850401L;
        dw$Row.keat[20] = -472349785412291069L;
        dw$Row.keat[21] = -2905598508110641187L;
        dw$Row.keat[22] = 7835585182054090873L;
        dw$Row.keat[23] = -372010861202253350L;
        dw$Row.keat[24] = 807110119350711188L;
        dw$Row.keat[25] = 2831431769953611198L;
        dw$Row.keat[26] = -8499700924285447648L;
        dw$Row.keat[27] = -1174734159435509793L;
        dw$Row.keat[28] = -9016648291239186398L;
        dw$Row.keat[29] = 4594782704766767211L;
        dw$Row.keat[30] = 152972439811639420L;
        dw$Row.keat[31] = 1113118370525990396L;
        dw$Row.keat[32] = -4670291487877076249L;
        dw$Row.keat[33] = 5443844637652405083L;
        dw$Row.keat[34] = 5469206412219254756L;
        dw$Row.keat[35] = 7823842163881293531L;
        dw$Row.keat[36] = -4215106642012063697L;
        dw$Row.keat[37] = -7658110690733143224L;
        dw$Row.keat[38] = -4916720486624753907L;
        dw$Row.keat[39] = 4270777580479736814L;
        dw$Row.keat[40] = 6320966772412467669L;
        dw$Row.keat[41] = 8708866798135954344L;
        dw$Row.keat[42] = 6541043037921703266L;
        dw$Row.keat[43] = -1902911773179797192L;
        dw$Row.keat[44] = -4748235329970436508L;
        dw$Row.keat[45] = -5500288008732781346L;
        dw$Row.keat[46] = -5990682922345123906L;
        dw$Row.keat[47] = -2569826582331156811L;
        dw$Row.keat[48] = -1267190284588598778L;
        dw$Row.keat[49] = -6963762657880015008L;
        dw$Row.keat[50] = 7788597809774161445L;
        dw$Row.keat[51] = 5017850564852928762L;
        dw$Row.keat[52] = -1296226450449860070L;
        dw$Row.keat[53] = 3997498055910444280L;
        dw$Row.keat[54] = 8458488508077201893L;
        dw$Row.keat[55] = 354080824505092228L;
        dw$Row.keat[56] = -2916545777355126634L;
        dw$Row.keat[57] = 8681151598359277429L;
        dw$Row.keat[58] = 3099147731221984007L;
        dw$Row.keat[59] = -8487371503877258286L;
        dw$Row.keat[60] = 574074950251001582L;
        dw$Row.keat[61] = -7412314597718206272L;
        dw$Row.keat[62] = 437415951988433041L;
        dw$Row.keat[63] = 8266639572515635402L;
        dw$Row.keat[64] = 967756164985936195L;
        dw$Row.keat[65] = 192011503894412134L;
        dw$Row.keat[66] = -3043054272763369612L;
        dw$Row.keat[67] = 1681447757701867617L;
        dw$Row.keat[68] = 2236417703854413007L;
        dw$Row.keat[69] = 8168431730207114290L;
        dw$Row.keat[70] = 2392090638362883330L;
        dw$Row.keat[71] = -3260323469557424734L;
        dw$Row.keat[72] = -304234126956164701L;
        dw$Row.keat[73] = 5346492007943455273L;
        dw$Row.keat[74] = -1911895663932983540L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String name() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dw$Row.se - dw$Row.keal("kedj", kear(int ), (int)33)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dw$Row.keal("kedk", keai(int ), (int)39)) break;
            v0 /* !! */  = (long)dw$Row.keal("kedl", keai(int ), (int)40);
        }
        var3_1 = dw$Row.c;
        v1 /* !! */  = dw$Row.se;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - dw$Row.keal("kedm", kear(int ), (int)34));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1647411824: {
                    v2 = dw$Row.keal("kedn", kear(int ), (int)35);
                    continue block13;
                }
                case -1376074556: {
                    v2 = dw$Row.keal("kedo", kear(int ), (int)36);
                    continue block13;
                }
                case -1208709134: {
                    break block13;
                }
                case 372374247: {
                    v2 = dw$Row.keal("kedp", kear(int ), (int)37);
                    continue block13;
                }
            }
            break;
        }
        var2_2 /* !! */  = dw$Row.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = dw$Row.se - dw$Row.keal("kedq", kear(int ), (int)38)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == dw$Row.keal("kedr", keai(int ), (int)41)) break;
            v3 /* !! */  = (long)dw$Row.keal("keds", keai(int ), (int)42);
        }
        var1_3 = dw$Row.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = dw$Row.se - dw$Row.keal("kedt", kear(int ), (int)39)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == dw$Row.keal("kedu", keai(int ), (int)43)) break;
                    v4 /* !! */  = (long)dw$Row.keal("kedv", keai(int ), (int)44);
                }
                return this.name;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)dw$Row.keal("kedw", keai(int ), (int)45);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)dw$Row.keal("kedx", keai(int ), (int)46);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dw$Row.keal("kedy", keai(int ), (int)47);
                    if (!var3_1) break block6;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)dw$Row.keal("kedz", keai(int ), (int)48);
        ** while (!var3_1)
lbl66:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kegv() {
        dw$Row.keaj[0] = -1474121623;
        dw$Row.keaj[1] = -1919748549;
        dw$Row.keaj[2] = 1776122316;
        dw$Row.keaj[3] = 1238730575;
        dw$Row.keaj[4] = 1911196843;
        dw$Row.keaj[5] = 263325601;
        dw$Row.keaj[6] = 803767158;
        dw$Row.keaj[7] = 2133962654;
        dw$Row.keaj[8] = -52224548;
        dw$Row.keaj[9] = -799950352;
        dw$Row.keaj[10] = -381199094;
        dw$Row.keaj[11] = 728049880;
        dw$Row.keaj[12] = 1960423048;
        dw$Row.keaj[13] = 774803308;
        dw$Row.keaj[14] = -546401519;
        dw$Row.keaj[15] = -897798912;
        dw$Row.keaj[16] = 2090940471;
        dw$Row.keaj[17] = -1496841003;
        dw$Row.keaj[18] = 2135565540;
        dw$Row.keaj[19] = -748858371;
        dw$Row.keaj[20] = -422809579;
        dw$Row.keaj[21] = -693658683;
        dw$Row.keaj[22] = -1277038091;
        dw$Row.keaj[23] = 1328280935;
        dw$Row.keaj[24] = 1534307261;
        dw$Row.keaj[25] = -1135846962;
        dw$Row.keaj[26] = 653480070;
        dw$Row.keaj[27] = -72642947;
        dw$Row.keaj[28] = 1034357566;
        dw$Row.keaj[29] = 70932647;
        dw$Row.keaj[30] = 2028813257;
        dw$Row.keaj[31] = -1701494970;
        dw$Row.keaj[32] = -996726050;
        dw$Row.keaj[33] = 1748912280;
        dw$Row.keaj[34] = -1984310023;
        dw$Row.keaj[35] = 612530957;
        dw$Row.keaj[36] = -14389480;
        dw$Row.keaj[37] = -235857636;
        dw$Row.keaj[38] = 2040741820;
        dw$Row.keaj[39] = -669337418;
        dw$Row.keaj[40] = -697682596;
        dw$Row.keaj[41] = -756712077;
        dw$Row.keaj[42] = -1087743802;
        dw$Row.keaj[43] = 822356909;
        dw$Row.keaj[44] = -1906360978;
        dw$Row.keaj[45] = 301341267;
        dw$Row.keaj[46] = -693211038;
        dw$Row.keaj[47] = 1417692122;
        dw$Row.keaj[48] = 1141366840;
        dw$Row.keaj[49] = -1946473459;
        dw$Row.keaj[50] = 867237197;
        dw$Row.keaj[51] = -1506291892;
        dw$Row.keaj[52] = -238114801;
        dw$Row.keaj[53] = -1280784795;
        dw$Row.keaj[54] = -189251150;
        dw$Row.keaj[55] = 1200196884;
        dw$Row.keaj[56] = 1361319551;
        dw$Row.keaj[57] = -375311864;
        dw$Row.keaj[58] = 656185051;
        dw$Row.keaj[59] = 370266106;
        dw$Row.keaj[60] = 1143301428;
        dw$Row.keaj[61] = 102769878;
        dw$Row.keaj[62] = 1300431509;
        dw$Row.keaj[63] = -1766175067;
        dw$Row.keaj[64] = -443694951;
        dw$Row.keaj[65] = -1750967200;
        dw$Row.keaj[66] = -1123762219;
        dw$Row.keaj[67] = 579791891;
        dw$Row.keaj[68] = -997659317;
        dw$Row.keaj[69] = -1904674963;
        dw$Row.keaj[70] = -838097833;
        dw$Row.keaj[71] = 1393841702;
        dw$Row.keaj[72] = -2042112497;
        dw$Row.keaj[73] = 682907769;
        dw$Row.keaj[74] = -362781166;
        dw$Row.keaj[75] = 580277855;
        dw$Row.keaj[76] = 1729657835;
        dw$Row.keaj[77] = 715365172;
        dw$Row.keaj[78] = -1688380496;
        dw$Row.keaj[79] = -1981755282;
        dw$Row.keaj[80] = 1643074912;
        dw$Row.keaj[81] = -1728164056;
        dw$Row.keaj[82] = 1070379805;
        dw$Row.keaj[83] = 78047997;
        dw$Row.keaj[84] = -1801120787;
        dw$Row.keaj[85] = 236697029;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int color() {
        v0 /* !! */  = dw$Row.se;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - dw$Row.keal("kegc", kear(int ), (int)65));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1781943810: {
                    v1 = dw$Row.keal("kegd", kear(int ), (int)66);
                    continue block18;
                }
                case -1208709134: {
                    break block18;
                }
                case 940476550: {
                    v1 = dw$Row.keal("kege", kear(int ), (int)67);
                    continue block18;
                }
                case 1865019354: {
                    v1 = dw$Row.keal("kegf", kear(int ), (int)68);
                    continue block18;
                }
            }
            break;
        }
        var3_1 = dw$Row.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = dw$Row.se - dw$Row.keal("kegg", kear(int ), (int)69)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == dw$Row.keal("kegh", keai(int ), (int)77)) break;
            v2 /* !! */  = (long)dw$Row.keal("kegi", keai(int ), (int)78);
        }
        var2_2 /* !! */  = dw$Row.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = dw$Row.se - dw$Row.keal("kegj", kear(int ), (int)70)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == dw$Row.keal("kegk", keai(int ), (int)79)) break;
            v3 /* !! */  = (long)dw$Row.keal("kegl", keai(int ), (int)80);
        }
        var1_3 = dw$Row.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return (int)dw$Row.keal("kegm", keai(int ), (int)81);
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = dw$Row.se;
                if (true) ** GOTO lbl44
                block22: while (true) {
                    v4 /* !! */  = (long)(v5 - dw$Row.keal("kegn", kear(int ), (int)71));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1208709134: {
                            break block22;
                        }
                        case 253429764: {
                            v5 = dw$Row.keal("kego", kear(int ), (int)72);
                            continue block22;
                        }
                        case 1074322699: {
                            v5 = dw$Row.keal("kegp", kear(int ), (int)73);
                            continue block22;
                        }
                        case 1802894653: {
                            v5 = dw$Row.keal("kegq", kear(int ), (int)74);
                            continue block22;
                        }
                    }
                    break;
                }
                return this.color;
            }
lbl57:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)dw$Row.keal("kegr", keai(int ), (int)82);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)dw$Row.keal("kegs", keai(int ), (int)83);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)dw$Row.keal("kegt", keai(int ), (int)84);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)dw$Row.keal("kegu", keai(int ), (int)85);
        } while (!var3_1);
        throw null;
    }

    public static /* synthetic */ CallSite keal(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_1799 stack() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dw$Row.se - dw$Row.keal("keea", kear(int ), (int)40)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dw$Row.keal("keeb", keai(int ), (int)49)) break;
            v0 /* !! */  = (long)dw$Row.keal("keec", keai(int ), (int)50);
        }
        var3_1 = dw$Row.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = dw$Row.se - dw$Row.keal("keed", kear(int ), (int)41)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == dw$Row.keal("keee", keai(int ), (int)51)) break;
            v1 /* !! */  = (long)dw$Row.keal("keef", keai(int ), (int)52);
        }
        var2_2 /* !! */  = dw$Row.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = dw$Row.se - dw$Row.keal("keeg", kear(int ), (int)42)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == dw$Row.keal("keeh", keai(int ), (int)53)) break;
            v2 /* !! */  = (long)dw$Row.keal("keei", keai(int ), (int)54);
        }
        var1_3 = dw$Row.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = dw$Row.se - dw$Row.keal("keej", kear(int ), (int)43)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == dw$Row.keal("keek", keai(int ), (int)55)) break;
                    v3 /* !! */  = (long)dw$Row.keal("keel", keai(int ), (int)56);
                }
                return this.stack;
            }
            case 0: {
                var2_2 /* !! */  = (int)dw$Row.keal("keem", keai(int ), (int)57);
                if (var3_1) {
                    throw null;
                }
            }
lbl42:
            // 4 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dw$Row.keal("keen", keai(int ), (int)58);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)dw$Row.keal("keeo", keai(int ), (int)59);
                if (!var3_1) ** GOTO lbl42
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)dw$Row.keal("keep", keai(int ), (int)60);
        ** while (!var3_1)
lbl54:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int keai(int n2) {
        return keaj[n2] ^ keak[n2];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private dw$Row(String var1_1, String var2_2, class_1799 var3_3, int var4_4, float var5_5, int var6_6) {
        var8_7 /* !! */  = dw$Row.b;
        super();
        if (var8_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.id = var1_1;
                this.name = var2_2;
                this.stack = var3_3;
                this.ticks = var4_4;
                this.progress = var5_5;
                this.color = var6_6;
                return;
            }
            case 1: {
                ** GOTO lbl17
            }
            case 4: {
                var8_7 /* !! */  = (int)dw$Row.keal("keaq", keai(int ), (int)4);
lbl17:
                // 2 sources

                var8_7 /* !! */  = (int)dw$Row.keal("kean", keai(int ), (int)1);
            }
            case 2: {
                var8_7 /* !! */  = (int)dw$Row.keal("keao", keai(int ), (int)2);
            }
            case 3: {
                var8_7 /* !! */  = (int)dw$Row.keal("keap", keai(int ), (int)3);
            }
            case 0: 
        }
        while (true) {
            var8_7 /* !! */  = (int)dw$Row.keal("keam", keai(int ), (int)0);
        }
    }

    private static /* synthetic */ void kegw() {
        dw$Row.keak[0] = -1474121619;
        dw$Row.keak[1] = -1919748545;
        dw$Row.keak[2] = 1776122317;
        dw$Row.keak[3] = 1238730572;
        dw$Row.keak[4] = 1911196840;
        dw$Row.keak[5] = -263325602;
        dw$Row.keak[6] = 41985894;
        dw$Row.keak[7] = 2133962654;
        dw$Row.keak[8] = -52224545;
        dw$Row.keak[9] = -799950350;
        dw$Row.keak[10] = -381199095;
        dw$Row.keak[11] = 728049881;
        dw$Row.keak[12] = 1620524445;
        dw$Row.keak[13] = -1708990401;
        dw$Row.keak[14] = -546401520;
        dw$Row.keak[15] = -681613896;
        dw$Row.keak[16] = 2090940469;
        dw$Row.keak[17] = -1496841002;
        dw$Row.keak[18] = 2135565542;
        dw$Row.keak[19] = -748858371;
        dw$Row.keak[20] = 422809578;
        dw$Row.keak[21] = 722611681;
        dw$Row.keak[22] = -1277038092;
        dw$Row.keak[23] = -440465212;
        dw$Row.keak[24] = 1534307260;
        dw$Row.keak[25] = -1106042842;
        dw$Row.keak[26] = 653480071;
        dw$Row.keak[27] = -72642948;
        dw$Row.keak[28] = 1097181680;
        dw$Row.keak[29] = 70932646;
        dw$Row.keak[30] = 2028813258;
        dw$Row.keak[31] = -1701494970;
        dw$Row.keak[32] = -996726051;
        dw$Row.keak[33] = 1748912281;
        dw$Row.keak[34] = 129596054;
        dw$Row.keak[35] = 612530959;
        dw$Row.keak[36] = -14389478;
        dw$Row.keak[37] = -235857634;
        dw$Row.keak[38] = 2040741821;
        dw$Row.keak[39] = -669337417;
        dw$Row.keak[40] = 842778592;
        dw$Row.keak[41] = -756712078;
        dw$Row.keak[42] = -518403728;
        dw$Row.keak[43] = 822356908;
        dw$Row.keak[44] = -597951432;
        dw$Row.keak[45] = 301341265;
        dw$Row.keak[46] = -693211040;
        dw$Row.keak[47] = 1417692122;
        dw$Row.keak[48] = 1141366842;
        dw$Row.keak[49] = 1946473458;
        dw$Row.keak[50] = 173792562;
        dw$Row.keak[51] = -1506291891;
        dw$Row.keak[52] = -1300221541;
        dw$Row.keak[53] = 1280784794;
        dw$Row.keak[54] = 452555929;
        dw$Row.keak[55] = 1200196885;
        dw$Row.keak[56] = -1129917927;
        dw$Row.keak[57] = -375311863;
        dw$Row.keak[58] = 656185048;
        dw$Row.keak[59] = 370266105;
        dw$Row.keak[60] = 1143301430;
        dw$Row.keak[61] = 102769879;
        dw$Row.keak[62] = 638680120;
        dw$Row.keak[63] = -1773517239;
        dw$Row.keak[64] = -443694950;
        dw$Row.keak[65] = -1750967200;
        dw$Row.keak[66] = -1123762217;
        dw$Row.keak[67] = 579791888;
        dw$Row.keak[68] = -997659318;
        dw$Row.keak[69] = 286304475;
        dw$Row.keak[70] = -251466282;
        dw$Row.keak[71] = 1393841703;
        dw$Row.keak[72] = 428991587;
        dw$Row.keak[73] = 682907769;
        dw$Row.keak[74] = -362781166;
        dw$Row.keak[75] = 580277854;
        dw$Row.keak[76] = 1729657832;
        dw$Row.keak[77] = 715365173;
        dw$Row.keak[78] = -151865410;
        dw$Row.keak[79] = 1981755281;
        dw$Row.keak[80] = -115194491;
        dw$Row.keak[81] = -438021699;
        dw$Row.keak[82] = 1070379806;
        dw$Row.keak[83] = 78047999;
        dw$Row.keak[84] = -1801120786;
        dw$Row.keak[85] = 236697029;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float progress() {
        v0 /* !! */  = dw$Row.se;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - dw$Row.keal("kefj", kear(int ), (int)56));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1208709134: {
                    break block17;
                }
                case 1412738443: {
                    v1 = dw$Row.keal("kefk", kear(int ), (int)57);
                    continue block17;
                }
                case 2053716249: {
                    v1 = dw$Row.keal("kefl", kear(int ), (int)58);
                    continue block17;
                }
            }
            break;
        }
        var3_1 = dw$Row.c;
        v2 /* !! */  = dw$Row.se;
        if (true) ** GOTO lbl19
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - dw$Row.keal("kefm", kear(int ), (int)59));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1466161815: {
                    v3 = dw$Row.keal("kefn", kear(int ), (int)60);
                    continue block18;
                }
                case -1208709134: {
                    break block18;
                }
                case -236508526: {
                    v3 = dw$Row.keal("kefo", kear(int ), (int)61);
                    continue block18;
                }
                case 1127627381: {
                    v3 = dw$Row.keal("kefp", kear(int ), (int)62);
                    continue block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = dw$Row.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = dw$Row.se - dw$Row.keal("kefq", kear(int ), (int)63)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == dw$Row.keal("kefr", keai(int ), (int)68)) break;
            v4 /* !! */  = (long)dw$Row.keal("kefs", keai(int ), (int)69);
        }
        var1_3 = dw$Row.a;
        if (var3_1) {
            throw null;
lbl41:
            // 2 sources

            return (float)dw$Row.keal("kefu", keft(int ), (int)70);
        }
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = dw$Row.se - dw$Row.keal("kefv", kear(int ), (int)64)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == dw$Row.keal("kefw", keai(int ), (int)71)) break;
                    v5 /* !! */  = (long)dw$Row.keal("kefx", keai(int ), (int)72);
                }
                return this.progress;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)dw$Row.keal("kefy", keai(int ), (int)73);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl60:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)dw$Row.keal("kefz", keai(int ), (int)74);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)dw$Row.keal("kega", keai(int ), (int)75);
                if (!var3_1) ** GOTO lbl60
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)dw$Row.keal("kegb", keai(int ), (int)76);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long kear(int n2) {
        return keas[n2] ^ keat[n2];
    }

    static {
        keak = new int[86];
        dw$Row.kegv();
        dw$Row.kegw();
        keas = new long[75];
        keat = new long[75];
        dw$Row.kegx();
        dw$Row.kegy();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        v0 /* !! */  = dw$Row.se;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(dw$Row.keal("keav", kear(int ), (int)1) - dw$Row.keal("keau", kear(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1726470036: {
                    continue block20;
                }
                case -1208709134: {
                    break block20;
                }
            }
            break;
        }
        var3_1 = dw$Row.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = dw$Row.se - dw$Row.keal("keaw", kear(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == dw$Row.keal("keax", keai(int ), (int)5)) break;
            v1 /* !! */  = (long)dw$Row.keal("keay", keai(int ), (int)6);
        }
        var2_2 /* !! */  = dw$Row.b;
        v2 /* !! */  = dw$Row.se;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - dw$Row.keal("keaz", kear(int ), (int)3));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1208709134: {
                    break block22;
                }
                case -347292903: {
                    v3 = dw$Row.keal("keba", kear(int ), (int)4);
                    continue block22;
                }
                case 305152473: {
                    v3 = dw$Row.keal("kebb", kear(int ), (int)5);
                    continue block22;
                }
            }
            break;
        }
        var1_3 = dw$Row.a;
        if (!var3_1) ** GOTO lbl38
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl38:
                // 1 sources

                if (var1_3 || var1_3) continue block23;
                v4 /* !! */  = dw$Row.se;
                if (true) ** GOTO lbl43
                block24: while (true) {
                    v4 /* !! */  = (long)(v5 - dw$Row.keal("kebc", kear(int ), (int)6));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1971633023: {
                            v5 = dw$Row.keal("kebd", kear(int ), (int)7);
                            continue block24;
                        }
                        case -1208709134: {
                            break block24;
                        }
                        case -1042566532: {
                            v5 = dw$Row.keal("kebe", kear(int ), (int)8);
                            continue block24;
                        }
                    }
                    break;
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{dw$Row.class, "id;name;stack;ticks;progress;color", "id", "name", "stack", "ticks", "progress", "color"}, this);
                case 0: {
                    var2_2 /* !! */  = (int)dw$Row.keal("kebf", keai(int ), (int)7);
                    if (var3_1) {
                        throw null;
                    }
                }
lbl57:
                // 4 sources

                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)dw$Row.keal("kebg", keai(int ), (int)8);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)dw$Row.keal("kebh", keai(int ), (int)9);
                    if (!var3_1) ** GOTO lbl57
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)dw$Row.keal("kebi", keai(int ), (int)10);
        ** while (!var3_1)
lbl69:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float keft(int n2) {
        return Float.intBitsToFloat(keaj[n2] ^ keak[n2]);
    }
}

