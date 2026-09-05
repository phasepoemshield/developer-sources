/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;

public final class mk$Event
extends Record {
    private final String recipient;
    private final String author;
    private static long[] cjp;
    private static int[] cjg;
    private final String text;
    public static final int b;
    public static final boolean a;
    private static final long m = 8147678704188105033L;
    private static int[] cjf;
    private final String role;
    public static final boolean c;
    private final boolean direct;
    private final long timestamp;
    private static long[] cjo;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static mk$Event direct(String var0, String var1_1, String var2_2, String var3_3, long var4_4) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mk$Event.m - mk$Event.cjh("ckj", cjn(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mk$Event.cjh("ckk", cje(int ), (int)14)) break;
            v0 /* !! */  = (long)mk$Event.cjh("ckl", cje(int ), (int)15);
        }
        var8_5 = mk$Event.c;
        v1 /* !! */  = mk$Event.m;
        if (true) ** GOTO lbl12
        block24: while (true) {
            v1 /* !! */  = (long)(v2 - mk$Event.cjh("ckm", cjn(int ), (int)11));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1593163027: {
                    v2 = mk$Event.cjh("ckn", cjn(int ), (int)12);
                    continue block24;
                }
                case -462119648: {
                    v2 = mk$Event.cjh("cko", cjn(int ), (int)13);
                    continue block24;
                }
                case -81419959: {
                    break block24;
                }
                case 1351286229: {
                    v2 = mk$Event.cjh("ckp", cjn(int ), (int)14);
                    continue block24;
                }
            }
            break;
        }
        var7_6 /* !! */  = mk$Event.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mk$Event.m - mk$Event.cjh("ckq", cjn(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mk$Event.cjh("ckr", cje(int ), (int)16)) break;
            v3 /* !! */  = (long)mk$Event.cjh("cks", cje(int ), (int)17);
        }
        var6_7 = mk$Event.a;
        if (var8_5) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var6_7) ** GOTO lbl34
        if (var7_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_7) ** continue;
                v4 /* !! */  = mk$Event.m;
                if (true) ** GOTO lbl45
                block27: while (true) {
                    v4 /* !! */  = (long)(v5 - mk$Event.cjh("ckt", cjn(int ), (int)16));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1217264460: {
                            v5 = mk$Event.cjh("cku", cjn(int ), (int)17);
                            continue block27;
                        }
                        case -298279573: {
                            v5 = mk$Event.cjh("ckv", cjn(int ), (int)18);
                            continue block27;
                        }
                        case -174821649: {
                            v5 = mk$Event.cjh("ckw", cjn(int ), (int)19);
                            continue block27;
                        }
                        case -81419959: {
                            break block27;
                        }
                    }
                    break;
                }
                v6 = mk$Event.cjh("ckx", cje(int ), (int)18);
                v7 /* !! */  = mk$Event.m;
                if (true) ** GOTO lbl62
                block28: while (true) {
                    v7 /* !! */  = (long)(v8 - mk$Event.cjh("cky", cjn(int ), (int)20));
lbl62:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -81419959: {
                            break block28;
                        }
                        case 145111079: {
                            v8 = mk$Event.cjh("ckz", cjn(int ), (int)21);
                            continue block28;
                        }
                        case 621846842: {
                            v8 = mk$Event.cjh("cla", cjn(int ), (int)22);
                            continue block28;
                        }
                    }
                    break;
                }
                return new mk$Event(var0, var1_1, var2_2, var3_3, var4_4, (boolean)v6);
            }
lbl72:
            // 3 sources

            case 0: {
                var7_6 /* !! */  = (int)mk$Event.cjh("clb", cje(int ), (int)19);
                if (var8_5) {
                    throw null;
                }
            }
            case 1: {
                var7_6 /* !! */  = (int)mk$Event.cjh("clc", cje(int ), (int)20);
                if (!var8_5) ** GOTO lbl72
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_6 /* !! */  = (int)mk$Event.cjh("cld", cje(int ), (int)21);
                    if (!var8_5) ** GOTO lbl72
                    throw null;
                }
            }
            case 3: 
        }
        var7_6 /* !! */  = (int)mk$Event.cjh("cle", cje(int ), (int)22);
        ** while (!var8_5)
lbl88:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public mk$Event(String var1_1, String var2_2, String var3_3, String var4_4, long var5_5, boolean var7_6) {
        var9_7 /* !! */  = mk$Event.b;
        super();
        this.role = var1_1;
        if (var9_7 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block7: while (true) {
            block9: {
                switch (cfr_temp_0 == -2147483648 ? var9_7 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        this.author = var2_2;
                        this.recipient = var3_3;
                        this.text = var4_4;
                        this.timestamp = var5_5;
                        this.direct = var7_6;
                        return;
                    }
                    case 0: {
                        var9_7 /* !! */  = (int)mk$Event.cjh("cji", cje(int ), (int)0);
                        cfr_temp_0 = 3;
                        break block9;
                    }
                    case 1: {
                        ** GOTO lbl23
                    }
                    case 4: {
                        var9_7 /* !! */  = (int)mk$Event.cjh("cjm", cje(int ), (int)4);
lbl23:
                        // 2 sources

                        var9_7 /* !! */  = (int)mk$Event.cjh("cjj", cje(int ), (int)1);
                        cfr_temp_0 = 3;
                        break block9;
                    }
                    case 2: {
                        var9_7 /* !! */  = (int)mk$Event.cjh("cjk", cje(int ), (int)2);
                    }
                    case 3: 
                }
                ** GOTO lbl33
            }
            while (true) {
                if (true) continue block7;
lbl33:
                // 2 sources

                var9_7 /* !! */  = (int)mk$Event.cjh("cjl", cje(int ), (int)3);
                cfr_temp_0 = 2;
            }
            break;
        }
    }

    private static /* synthetic */ void cqu() {
        mk$Event.cjp[0] = 7737165941166682389L;
        mk$Event.cjp[1] = 4571972477274728576L;
        mk$Event.cjp[2] = -3640489382799335710L;
        mk$Event.cjp[3] = 9145786980331159465L;
        mk$Event.cjp[4] = -5982758962525844547L;
        mk$Event.cjp[5] = 684770498201040672L;
        mk$Event.cjp[6] = -3331353343841354359L;
        mk$Event.cjp[7] = -2532356705896198809L;
        mk$Event.cjp[8] = 5791761550251371956L;
        mk$Event.cjp[9] = 5483604021729947488L;
        mk$Event.cjp[10] = -2514490786260969819L;
        mk$Event.cjp[11] = 1467085489967402686L;
        mk$Event.cjp[12] = 6624378993374273102L;
        mk$Event.cjp[13] = -6498266756750530944L;
        mk$Event.cjp[14] = -2173207829757943939L;
        mk$Event.cjp[15] = -4014307507148208458L;
        mk$Event.cjp[16] = 4450869575841571372L;
        mk$Event.cjp[17] = 2094982744236850464L;
        mk$Event.cjp[18] = -8770063632846738060L;
        mk$Event.cjp[19] = 1392536350009336742L;
        mk$Event.cjp[20] = 3360968339121080185L;
        mk$Event.cjp[21] = -2718730529290936781L;
        mk$Event.cjp[22] = -4844876045682137333L;
        mk$Event.cjp[23] = 6507877979313734261L;
        mk$Event.cjp[24] = -2105633193010820953L;
        mk$Event.cjp[25] = 8664563418720701512L;
        mk$Event.cjp[26] = -6436420246014409665L;
        mk$Event.cjp[27] = -2930845000340379076L;
        mk$Event.cjp[28] = 6237405031027163762L;
        mk$Event.cjp[29] = 7712401736466292447L;
        mk$Event.cjp[30] = 5134059213488827944L;
        mk$Event.cjp[31] = 7478628025679859721L;
        mk$Event.cjp[32] = -5366564760786513930L;
        mk$Event.cjp[33] = -1762567968607254421L;
        mk$Event.cjp[34] = 7297139605368815980L;
        mk$Event.cjp[35] = 5533628818596191313L;
        mk$Event.cjp[36] = -4539131019324341200L;
        mk$Event.cjp[37] = 3214635717881429415L;
        mk$Event.cjp[38] = -6321158194522773429L;
        mk$Event.cjp[39] = -4187047960332213105L;
        mk$Event.cjp[40] = 4574637558519595565L;
        mk$Event.cjp[41] = -5914335247319075134L;
        mk$Event.cjp[42] = -1497597030241217429L;
        mk$Event.cjp[43] = -8972225675050643506L;
        mk$Event.cjp[44] = -6346915903491271570L;
        mk$Event.cjp[45] = 8038343076963624490L;
        mk$Event.cjp[46] = 8981033920461274185L;
        mk$Event.cjp[47] = 2243264104298160538L;
        mk$Event.cjp[48] = -3103564134029953293L;
        mk$Event.cjp[49] = -7520626769365254041L;
        mk$Event.cjp[50] = 3518287937034040767L;
        mk$Event.cjp[51] = 6004714748904597926L;
        mk$Event.cjp[52] = 8727780612783643560L;
        mk$Event.cjp[53] = 4316497695523890205L;
        mk$Event.cjp[54] = -9141833888270480298L;
        mk$Event.cjp[55] = 8940557203753644572L;
        mk$Event.cjp[56] = 6956078247849857812L;
        mk$Event.cjp[57] = 5894511325241913352L;
        mk$Event.cjp[58] = 8628799914815812305L;
        mk$Event.cjp[59] = -7626692447930184400L;
        mk$Event.cjp[60] = -6447139141503834903L;
        mk$Event.cjp[61] = -7885755983818981975L;
        mk$Event.cjp[62] = -6116167134844134982L;
        mk$Event.cjp[63] = -1206030867701038206L;
        mk$Event.cjp[64] = -979008554568018673L;
        mk$Event.cjp[65] = 7473530960811427915L;
        mk$Event.cjp[66] = -5822739014356356722L;
        mk$Event.cjp[67] = 1634959657904590754L;
        mk$Event.cjp[68] = 8983259287765985141L;
        mk$Event.cjp[69] = 3777535994032246538L;
        mk$Event.cjp[70] = 4584239028422505277L;
        mk$Event.cjp[71] = 2174392154050378085L;
        mk$Event.cjp[72] = -8097248750305654965L;
        mk$Event.cjp[73] = 4273579645306157256L;
        mk$Event.cjp[74] = 6012329701365116312L;
        mk$Event.cjp[75] = 5911882188810352513L;
        mk$Event.cjp[76] = -6434542699306238978L;
        mk$Event.cjp[77] = -5161474528070749563L;
        mk$Event.cjp[78] = -6200840753466553651L;
        mk$Event.cjp[79] = 2168154551960543364L;
        mk$Event.cjp[80] = 3966723456214031114L;
        mk$Event.cjp[81] = -2115804416183252206L;
        mk$Event.cjp[82] = -7445188402986965034L;
        mk$Event.cjp[83] = -594036996650107034L;
        mk$Event.cjp[84] = 5609852604881555427L;
        mk$Event.cjp[85] = -2913181012398612079L;
        mk$Event.cjp[86] = -7221897955080681421L;
        mk$Event.cjp[87] = -1784550837683428545L;
        mk$Event.cjp[88] = 7652369087366612175L;
        mk$Event.cjp[89] = -4190806229827275753L;
        mk$Event.cjp[90] = -6814294038240942201L;
        mk$Event.cjp[91] = -452251059403507749L;
        mk$Event.cjp[92] = -1135971883356679629L;
        mk$Event.cjp[93] = -7653527565533015890L;
    }

    private static /* synthetic */ int cje(int n2) {
        return cjf[n2] ^ cjg[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public long timestamp() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = mk$Event.m - mk$Event.cjh("cpm", cjn(int ), (int)78)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == mk$Event.cjh("cpn", cje(int ), (int)79)) break;
            v0 /* !! */  = (long)mk$Event.cjh("cpo", cje(int ), (int)80);
        }
        var3_1 = mk$Event.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_2 = mk$Event.m - mk$Event.cjh("cpp", cjn(int ), (int)79)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == mk$Event.cjh("cpq", cje(int ), (int)81)) break;
            v1 /* !! */  = (long)mk$Event.cjh("cpr", cje(int ), (int)82);
        }
        var2_2 /* !! */  = mk$Event.b;
        v2 /* !! */  = mk$Event.m;
        block17: while (true) {
            switch ((int)v2 /* !! */ ) {
                case -81419959: {
                    break block17;
                }
                case -49907672: {
                    v2 /* !! */  = (long)(mk$Event.cjh("cpt", cjn(int ), (int)81) - mk$Event.cjh("cps", cjn(int ), (int)80));
                    continue block17;
                }
            }
            break;
        }
        var1_3 = mk$Event.a;
        if (var3_1) {
            throw null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var1_3 != false) return (long)mk$Event.cjh("cpu", cjn(int ), (int)82);
                    if (var1_3 != false) return (long)mk$Event.cjh("cpu", cjn(int ), (int)82);
                    v3 /* !! */  = mk$Event.m;
                    block19: while (true) {
                        switch ((int)v3 /* !! */ ) {
                            case -203684514: {
                                v4 = mk$Event.cjh("cpw", cjn(int ), (int)84);
                                ** GOTO lbl41
                            }
                            case -81419959: {
                                return this.timestamp;
                            }
                            case 492655221: {
                                v4 = mk$Event.cjh("cpx", cjn(int ), (int)85);
lbl41:
                                // 2 sources

                                v3 /* !! */  = (long)(v4 - mk$Event.cjh("cpv", cjn(int ), (int)83));
                                continue block19;
                            }
                        }
                        break;
                    }
                    return this.timestamp;
                }
                case 1: {
                    ** GOTO lbl55
                }
                case 3: {
                    ** GOTO lbl52
                }
                case 0: {
                    var2_2 /* !! */  = (int)mk$Event.cjh("cpy", cje(int ), (int)83);
                    if (var3_1) {
                        throw null;
                    }
lbl52:
                    // 3 sources

                    var2_2 /* !! */  = (int)mk$Event.cjh("cqb", cje(int ), (int)86);
                    if (var3_1) {
                        throw null;
                    }
lbl55:
                    // 3 sources

                    var2_2 /* !! */  = (int)mk$Event.cjh("cpz", cje(int ), (int)84);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: 
            }
            if (true) ** GOTO lbl62
            break;
        }
        do {
            if (true) ** continue;
lbl62:
            // 2 sources

            var2_2 /* !! */  = (int)mk$Event.cjh("cqa", cje(int ), (int)85);
            cfr_temp_0 = 0;
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        v0 /* !! */  = mk$Event.m;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(mk$Event.cjh("cmm", cjn(int ), (int)41) - mk$Event.cjh("cml", cjn(int ), (int)40));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -81419959: {
                    break block14;
                }
                case 57258350: {
                    continue block14;
                }
            }
            break;
        }
        var4_2 = mk$Event.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = mk$Event.m - mk$Event.cjh("cmn", cjn(int ), (int)42)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mk$Event.cjh("cmo", cje(int ), (int)38)) break;
            v1 /* !! */  = (long)mk$Event.cjh("cmp", cje(int ), (int)39);
        }
        var3_3 /* !! */  = mk$Event.b;
        v2 /* !! */  = mk$Event.m;
        if (true) ** GOTO lbl22
        block16: while (true) {
            v2 /* !! */  = (long)(mk$Event.cjh("cmr", cjn(int ), (int)44) - mk$Event.cjh("cmq", cjn(int ), (int)43));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -99015908: {
                    continue block16;
                }
                case -81419959: {
                    break block16;
                }
            }
            break;
        }
        var2_4 = mk$Event.a;
        if (!var4_2) ** GOTO lbl34
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)mk$Event.cjh("cms", cje(int ), (int)40);
                }
lbl34:
                // 1 sources

                if (var2_4 || var2_4) continue block17;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = mk$Event.m - mk$Event.cjh("cmt", cjn(int ), (int)45)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == mk$Event.cjh("cmu", cje(int ), (int)41)) break;
                    v3 /* !! */  = (long)mk$Event.cjh("cmv", cje(int ), (int)42);
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{mk$Event.class, "role;author;recipient;text;timestamp;direct", "role", "author", "recipient", "text", "timestamp", "direct"}, this, var1_1);
lbl42:
                // 2 sources

                case 0: {
                    var3_3 /* !! */  = (int)mk$Event.cjh("cmw", cje(int ), (int)43);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 1: {
                    var3_3 /* !! */  = (int)mk$Event.cjh("cmx", cje(int ), (int)44);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 2: {
                    var3_3 /* !! */  = (int)mk$Event.cjh("cmy", cje(int ), (int)45);
                    if (!var4_2) ** GOTO lbl42
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var3_3 /* !! */  = (int)mk$Event.cjh("cmz", cje(int ), (int)46);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ long cjn(int n2) {
        return cjo[n2] ^ cjp[n2];
    }

    /*
     * Enabled aggressive block sorting
     */
    public String role() {
        boolean bl2;
        Object object = m;
        block4: while (true) {
            switch ((int)object) {
                case -1943242348: {
                    object = mk$Event.cjh("cnb", cjn(int ), (int)47) - mk$Event.cjh("cna", cjn(int ), (int)46);
                    continue block4;
                }
                case -81419959: {
                    break block4;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = m - mk$Event.cjh("cnc", cjn(int ), (int)48)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == mk$Event.cjh("cnd", cje(int ), (int)47)) break;
            object2 = mk$Event.cjh("cne", cje(int ), (int)48);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = m - mk$Event.cjh("cnf", cjn(int ), (int)49)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == mk$Event.cjh("cng", cje(int ), (int)49)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = mk$Event.cjh("cnh", cje(int ), (int)50);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l4;
            Object object4;
            if ((object4 = (l4 = m - mk$Event.cjh("cni", cjn(int ), (int)50)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object4 == mk$Event.cjh("cnj", cje(int ), (int)51)) {
                return this.role;
            }
            object4 = mk$Event.cjh("cnk", cje(int ), (int)52);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static mk$Event chat(String var0, String var1_1, String var2_2, long var3_3) {
        v0 /* !! */  = mk$Event.m;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - mk$Event.cjh("cjq", cjn(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -81419959: {
                    break block20;
                }
                case 339660697: {
                    v1 = mk$Event.cjh("cjr", cjn(int ), (int)1);
                    continue block20;
                }
                case 1829523628: {
                    v1 = mk$Event.cjh("cjs", cjn(int ), (int)2);
                    continue block20;
                }
            }
            break;
        }
        var7_4 = mk$Event.c;
        v2 /* !! */  = mk$Event.m;
        if (true) ** GOTO lbl19
        block21: while (true) {
            v2 /* !! */  = (long)(mk$Event.cjh("cju", cjn(int ), (int)4) - mk$Event.cjh("cjt", cjn(int ), (int)3));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1785954306: {
                    continue block21;
                }
                case -81419959: {
                    break block21;
                }
            }
            break;
        }
        var6_5 /* !! */  = mk$Event.b;
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var6_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = mk$Event.m;
                if (true) ** GOTO lbl32
                block22: while (true) {
                    v3 /* !! */  = (long)(v4 - mk$Event.cjh("cjv", cjn(int ), (int)5));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1409382556: {
                            v4 = mk$Event.cjh("cjw", cjn(int ), (int)6);
                            continue block22;
                        }
                        case -81419959: {
                            break block22;
                        }
                        case 166366977: {
                            v4 = mk$Event.cjh("cjx", cjn(int ), (int)7);
                            continue block22;
                        }
                    }
                    break;
                }
                var5_6 = mk$Event.a;
                if (var7_4) {
                    throw null;
                    return null;
                }
                if (var5_6 || var5_6) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = mk$Event.m - mk$Event.cjh("cjy", cjn(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == mk$Event.cjh("cjz", cje(int ), (int)5)) break;
                    v5 /* !! */  = (long)mk$Event.cjh("cka", cje(int ), (int)6);
                }
                v6 = mk$Event.cjh("ckb", cje(int ), (int)7);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = mk$Event.m - mk$Event.cjh("ckc", cjn(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == mk$Event.cjh("ckd", cje(int ), (int)8)) break;
                    v7 /* !! */  = (long)mk$Event.cjh("cke", cje(int ), (int)9);
                }
                return new mk$Event(var0, var1_1, "", var2_2, var3_3, (boolean)v6);
            }
            case 0: {
                var6_5 /* !! */  = (int)mk$Event.cjh("ckf", cje(int ), (int)10);
                if (var7_4) {
                    throw null;
                }
            }
            case 1: {
                var6_5 /* !! */  = (int)mk$Event.cjh("ckg", cje(int ), (int)11);
                if (var7_4) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_5 /* !! */  = (int)mk$Event.cjh("ckh", cje(int ), (int)12);
                    if (!var7_4) break block9;
                    throw null;
                }
            }
            case 3: 
        }
        var6_5 /* !! */  = (int)mk$Event.cjh("cki", cje(int ), (int)13);
        ** while (!var7_4)
lbl77:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        v0 /* !! */  = mk$Event.m;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(mk$Event.cjh("clg", cjn(int ), (int)24) - mk$Event.cjh("clf", cjn(int ), (int)23));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1953596876: {
                    continue block15;
                }
                case -81419959: {
                    break block15;
                }
            }
            break;
        }
        var3_1 = mk$Event.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = mk$Event.m - mk$Event.cjh("clh", cjn(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mk$Event.cjh("cli", cje(int ), (int)23)) break;
            v1 /* !! */  = (long)mk$Event.cjh("clj", cje(int ), (int)24);
        }
        var2_2 /* !! */  = mk$Event.b;
        v2 /* !! */  = mk$Event.m;
        if (true) ** GOTO lbl22
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - mk$Event.cjh("clk", cjn(int ), (int)26));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -81419959: {
                    break block17;
                }
                case 1253415681: {
                    v3 = mk$Event.cjh("cll", cjn(int ), (int)27);
                    continue block17;
                }
                case 1776808709: {
                    v3 = mk$Event.cjh("clm", cjn(int ), (int)28);
                    continue block17;
                }
            }
            break;
        }
        var1_3 = mk$Event.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = mk$Event.m - mk$Event.cjh("cln", cjn(int ), (int)29)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mk$Event.cjh("clo", cje(int ), (int)25)) break;
                    v4 /* !! */  = (long)mk$Event.cjh("clp", cje(int ), (int)26);
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{mk$Event.class, "role;author;recipient;text;timestamp;direct", "role", "author", "recipient", "text", "timestamp", "direct"}, this);
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)mk$Event.cjh("clq", cje(int ), (int)27);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)mk$Event.cjh("clr", cje(int ), (int)28);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)mk$Event.cjh("cls", cje(int ), (int)29);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mk$Event.cjh("clt", cje(int ), (int)30);
        ** while (!var3_1)
lbl65:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String recipient() {
        v0 /* !! */  = mk$Event.m;
        if (true) ** GOTO lbl5
        block27: while (true) {
            v0 /* !! */  = (long)(v1 - mk$Event.cjh("coe", cjn(int ), (int)56));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1081204385: {
                    v1 = mk$Event.cjh("cof", cjn(int ), (int)57);
                    continue block27;
                }
                case -830102087: {
                    v1 = mk$Event.cjh("cog", cjn(int ), (int)58);
                    continue block27;
                }
                case -81419959: {
                    break block27;
                }
            }
            break;
        }
        var3_1 = mk$Event.c;
        v2 /* !! */  = mk$Event.m;
        if (true) ** GOTO lbl19
        block28: while (true) {
            v2 /* !! */  = (long)(v3 - mk$Event.cjh("coh", cjn(int ), (int)59));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1586790004: {
                    v3 = mk$Event.cjh("coi", cjn(int ), (int)60);
                    continue block28;
                }
                case -81419959: {
                    break block28;
                }
                case 206492693: {
                    v3 = mk$Event.cjh("coj", cjn(int ), (int)61);
                    continue block28;
                }
                case 1043151179: {
                    v3 = mk$Event.cjh("cok", cjn(int ), (int)62);
                    continue block28;
                }
            }
            break;
        }
        var2_2 /* !! */  = mk$Event.b;
        v4 /* !! */  = mk$Event.m;
        if (true) ** GOTO lbl36
        block29: while (true) {
            v4 /* !! */  = (long)(v5 - mk$Event.cjh("col", cjn(int ), (int)63));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -81419959: {
                    break block29;
                }
                case 171816206: {
                    v5 = mk$Event.cjh("com", cjn(int ), (int)64);
                    continue block29;
                }
                case 350658168: {
                    v5 = mk$Event.cjh("conn", cjn(int ), (int)65);
                    continue block29;
                }
            }
            break;
        }
        var1_3 = mk$Event.a;
        if (!var3_1) ** GOTO lbl52
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl52:
                // 1 sources

                if (var1_3 || var1_3) continue block30;
                v6 /* !! */  = mk$Event.m;
                if (true) ** GOTO lbl57
                block31: while (true) {
                    v6 /* !! */  = (long)(v7 - mk$Event.cjh("coo", cjn(int ), (int)66));
lbl57:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -81419959: {
                            break block31;
                        }
                        case 383676654: {
                            v7 = mk$Event.cjh("cop", cjn(int ), (int)67);
                            continue block31;
                        }
                        case 413260145: {
                            v7 = mk$Event.cjh("coq", cjn(int ), (int)68);
                            continue block31;
                        }
                    }
                    break;
                }
                return this.recipient;
lbl67:
                // 3 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)mk$Event.cjh("cor", cje(int ), (int)67);
                        if (!var3_1) break block30;
                        throw null;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)mk$Event.cjh("cos", cje(int ), (int)68);
                    if (!var3_1) ** GOTO lbl67
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)mk$Event.cjh("cot", cje(int ), (int)69);
                    if (!var3_1) ** GOTO lbl67
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)mk$Event.cjh("cou", cje(int ), (int)70);
        ** while (!var3_1)
lbl83:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String author() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mk$Event.m - mk$Event.cjh("cnp", cjn(int ), (int)51)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mk$Event.cjh("cnq", cje(int ), (int)57)) break;
            v0 /* !! */  = (long)mk$Event.cjh("cnr", cje(int ), (int)58);
        }
        var3_1 = mk$Event.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mk$Event.m - mk$Event.cjh("cns", cjn(int ), (int)52)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mk$Event.cjh("cnt", cje(int ), (int)59)) break;
            v1 /* !! */  = (long)mk$Event.cjh("cnu", cje(int ), (int)60);
        }
        var2_2 /* !! */  = mk$Event.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = mk$Event.m - mk$Event.cjh("cnv", cjn(int ), (int)53)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mk$Event.cjh("cnw", cje(int ), (int)61)) break;
            v2 /* !! */  = (long)mk$Event.cjh("cnx", cje(int ), (int)62);
        }
        var1_3 = mk$Event.a;
        if (var3_1) {
            throw null;
lbl24:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl27:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = mk$Event.m;
                if (true) ** GOTO lbl34
                block14: while (true) {
                    v3 /* !! */  = (long)(mk$Event.cjh("cnz", cjn(int ), (int)55) - mk$Event.cjh("cny", cjn(int ), (int)54));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1131668721: {
                            continue block14;
                        }
                        case -81419959: {
                            break block14;
                        }
                    }
                    break;
                }
                return this.author;
            }
lbl40:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)mk$Event.cjh("coa", cje(int ), (int)63);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)mk$Event.cjh("cob", cje(int ), (int)64);
                if (!var3_1) ** GOTO lbl40
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)mk$Event.cjh("coc", cje(int ), (int)65);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mk$Event.cjh("cod", cje(int ), (int)66);
        ** while (!var3_1)
lbl56:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean direct() {
        v0 /* !! */  = mk$Event.m;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - mk$Event.cjh("cqc", cjn(int ), (int)86));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -81419959: {
                    break block19;
                }
                case 1579380649: {
                    v1 = mk$Event.cjh("cqd", cjn(int ), (int)87);
                    continue block19;
                }
                case 1992666250: {
                    v1 = mk$Event.cjh("cqe", cjn(int ), (int)88);
                    continue block19;
                }
            }
            break;
        }
        var3_1 = mk$Event.c;
        v2 /* !! */  = mk$Event.m;
        if (true) ** GOTO lbl19
        block20: while (true) {
            v2 /* !! */  = (long)(mk$Event.cjh("cqg", cjn(int ), (int)90) - mk$Event.cjh("cqf", cjn(int ), (int)89));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -132537080: {
                    continue block20;
                }
                case -81419959: {
                    break block20;
                }
            }
            break;
        }
        var2_2 /* !! */  = mk$Event.b;
        v3 /* !! */  = mk$Event.m;
        if (true) ** GOTO lbl29
        block21: while (true) {
            v3 /* !! */  = (long)(mk$Event.cjh("cqi", cjn(int ), (int)92) - mk$Event.cjh("cqh", cjn(int ), (int)91));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -81419959: {
                    break block21;
                }
                case 1411602853: {
                    continue block21;
                }
            }
            break;
        }
        var1_3 = mk$Event.a;
        if (!var3_1) ** GOTO lbl41
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)mk$Event.cjh("cqj", cje(int ), (int)87);
                }
lbl41:
                // 1 sources

                if (var1_3 || var1_3) continue block22;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = mk$Event.m - mk$Event.cjh("cqk", cjn(int ), (int)93)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mk$Event.cjh("cql", cje(int ), (int)88)) break;
                    v4 /* !! */  = (long)mk$Event.cjh("cqm", cje(int ), (int)89);
                }
                return this.direct;
                case 0: {
                    var2_2 /* !! */  = (int)mk$Event.cjh("cqn", cje(int ), (int)90);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl58
                }
                case 1: {
                    var2_2 /* !! */  = (int)mk$Event.cjh("cqo", cje(int ), (int)91);
                    if (var3_1) {
                        throw null;
                    }
                }
lbl58:
                // 4 sources

                case 2: {
                    var2_2 /* !! */  = (int)mk$Event.cjh("cqp", cje(int ), (int)92);
                    if (!var3_1) break block22;
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)mk$Event.cjh("cqq", cje(int ), (int)93);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String text() {
        v0 /* !! */  = mk$Event.m;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - mk$Event.cjh("cov", cjn(int ), (int)69));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -81419959: {
                    break block17;
                }
                case 450575244: {
                    v1 = mk$Event.cjh("cow", cjn(int ), (int)70);
                    continue block17;
                }
                case 1636832887: {
                    v1 = mk$Event.cjh("cox", cjn(int ), (int)71);
                    continue block17;
                }
                case 1867877213: {
                    v1 = mk$Event.cjh("coy", cjn(int ), (int)72);
                    continue block17;
                }
            }
            break;
        }
        var3_1 = mk$Event.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mk$Event.m - mk$Event.cjh("coz", cjn(int ), (int)73)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mk$Event.cjh("cpa", cje(int ), (int)71)) break;
            v2 /* !! */  = (long)mk$Event.cjh("cpb", cje(int ), (int)72);
        }
        var2_2 /* !! */  = mk$Event.b;
        v3 /* !! */  = mk$Event.m;
        if (true) ** GOTO lbl29
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - mk$Event.cjh("cpc", cjn(int ), (int)74));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1151792530: {
                    v4 = mk$Event.cjh("cpd", cjn(int ), (int)75);
                    continue block19;
                }
                case -81419959: {
                    break block19;
                }
                case 1756192584: {
                    v4 = mk$Event.cjh("cpe", cjn(int ), (int)76);
                    continue block19;
                }
            }
            break;
        }
        var1_3 = mk$Event.a;
        if (var3_1) {
            throw null;
lbl41:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = mk$Event.m - mk$Event.cjh("cpf", cjn(int ), (int)77)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == mk$Event.cjh("cpg", cje(int ), (int)73)) break;
                    v5 /* !! */  = (long)mk$Event.cjh("cph", cje(int ), (int)74);
                }
                return this.text;
            }
lbl55:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)mk$Event.cjh("cpi", cje(int ), (int)75);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)mk$Event.cjh("cpj", cje(int ), (int)76);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mk$Event.cjh("cpk", cje(int ), (int)77);
                    if (!var3_1) ** GOTO lbl55
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mk$Event.cjh("cpl", cje(int ), (int)78);
        ** while (!var3_1)
lbl72:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cqr() {
        mk$Event.cjf[0] = 1099678912;
        mk$Event.cjf[1] = -719518269;
        mk$Event.cjf[2] = -1832133208;
        mk$Event.cjf[3] = -97241952;
        mk$Event.cjf[4] = 1983647772;
        mk$Event.cjf[5] = 1231629882;
        mk$Event.cjf[6] = -1958101748;
        mk$Event.cjf[7] = 1093208685;
        mk$Event.cjf[8] = 1789017937;
        mk$Event.cjf[9] = -1279184507;
        mk$Event.cjf[10] = -359470243;
        mk$Event.cjf[11] = -524035103;
        mk$Event.cjf[12] = 1870441778;
        mk$Event.cjf[13] = 653790690;
        mk$Event.cjf[14] = -1835554932;
        mk$Event.cjf[15] = 1818007657;
        mk$Event.cjf[16] = -741503025;
        mk$Event.cjf[17] = 1833868437;
        mk$Event.cjf[18] = 1923245797;
        mk$Event.cjf[19] = 1932900182;
        mk$Event.cjf[20] = 2025614126;
        mk$Event.cjf[21] = 1302048879;
        mk$Event.cjf[22] = -468563387;
        mk$Event.cjf[23] = -740272758;
        mk$Event.cjf[24] = -2106508642;
        mk$Event.cjf[25] = 365733818;
        mk$Event.cjf[26] = -1885404246;
        mk$Event.cjf[27] = 111923031;
        mk$Event.cjf[28] = -1522339018;
        mk$Event.cjf[29] = -781412029;
        mk$Event.cjf[30] = -932776074;
        mk$Event.cjf[31] = -700902739;
        mk$Event.cjf[32] = 1639837920;
        mk$Event.cjf[33] = 1444797021;
        mk$Event.cjf[34] = -1181316638;
        mk$Event.cjf[35] = -571763763;
        mk$Event.cjf[36] = 1866642703;
        mk$Event.cjf[37] = -1811354391;
        mk$Event.cjf[38] = 1484585604;
        mk$Event.cjf[39] = 409322881;
        mk$Event.cjf[40] = -1174128632;
        mk$Event.cjf[41] = -61275241;
        mk$Event.cjf[42] = 1637289475;
        mk$Event.cjf[43] = 639562754;
        mk$Event.cjf[44] = -1269162175;
        mk$Event.cjf[45] = -414169745;
        mk$Event.cjf[46] = -980660367;
        mk$Event.cjf[47] = 1838377080;
        mk$Event.cjf[48] = -643615197;
        mk$Event.cjf[49] = -1536998889;
        mk$Event.cjf[50] = 783246443;
        mk$Event.cjf[51] = -1241109580;
        mk$Event.cjf[52] = 1913411858;
        mk$Event.cjf[53] = 128291832;
        mk$Event.cjf[54] = 1983014841;
        mk$Event.cjf[55] = 956874597;
        mk$Event.cjf[56] = -1403944354;
        mk$Event.cjf[57] = 486905123;
        mk$Event.cjf[58] = -1215367698;
        mk$Event.cjf[59] = -670002456;
        mk$Event.cjf[60] = -1813193623;
        mk$Event.cjf[61] = -1077634262;
        mk$Event.cjf[62] = 1490298063;
        mk$Event.cjf[63] = 308997886;
        mk$Event.cjf[64] = -1562561395;
        mk$Event.cjf[65] = 1372343579;
        mk$Event.cjf[66] = 443783750;
        mk$Event.cjf[67] = 2055947636;
        mk$Event.cjf[68] = -296157428;
        mk$Event.cjf[69] = 1175422971;
        mk$Event.cjf[70] = 1437207174;
        mk$Event.cjf[71] = -1873827176;
        mk$Event.cjf[72] = 936725489;
        mk$Event.cjf[73] = 1086611027;
        mk$Event.cjf[74] = -138716645;
        mk$Event.cjf[75] = 2015651344;
        mk$Event.cjf[76] = -752549313;
        mk$Event.cjf[77] = 1939816167;
        mk$Event.cjf[78] = 246902370;
        mk$Event.cjf[79] = 445710078;
        mk$Event.cjf[80] = 944608191;
        mk$Event.cjf[81] = 1977079455;
        mk$Event.cjf[82] = -50219359;
        mk$Event.cjf[83] = 1073130732;
        mk$Event.cjf[84] = -1765923680;
        mk$Event.cjf[85] = -369827268;
        mk$Event.cjf[86] = 1343605977;
        mk$Event.cjf[87] = -1397357422;
        mk$Event.cjf[88] = -934840158;
        mk$Event.cjf[89] = 581348564;
        mk$Event.cjf[90] = 1855218549;
        mk$Event.cjf[91] = -924800416;
        mk$Event.cjf[92] = 2123463962;
        mk$Event.cjf[93] = 992332934;
    }

    public static /* synthetic */ CallSite cjh(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void cqs() {
        mk$Event.cjg[0] = 1099678915;
        mk$Event.cjg[1] = -719518265;
        mk$Event.cjg[2] = -1832133204;
        mk$Event.cjg[3] = -97241952;
        mk$Event.cjg[4] = 1983647774;
        mk$Event.cjg[5] = 1231629883;
        mk$Event.cjg[6] = -1867617680;
        mk$Event.cjg[7] = 1093208685;
        mk$Event.cjg[8] = 1789017936;
        mk$Event.cjg[9] = -415462078;
        mk$Event.cjg[10] = -359470241;
        mk$Event.cjg[11] = -524035102;
        mk$Event.cjg[12] = 1870441778;
        mk$Event.cjg[13] = 653790689;
        mk$Event.cjg[14] = -1835554931;
        mk$Event.cjg[15] = 1130446530;
        mk$Event.cjg[16] = -741503026;
        mk$Event.cjg[17] = 1316927679;
        mk$Event.cjg[18] = 1923245796;
        mk$Event.cjg[19] = 1932900181;
        mk$Event.cjg[20] = 2025614124;
        mk$Event.cjg[21] = 1302048878;
        mk$Event.cjg[22] = -468563388;
        mk$Event.cjg[23] = -740272757;
        mk$Event.cjg[24] = 1178176709;
        mk$Event.cjg[25] = -365733819;
        mk$Event.cjg[26] = -2011381309;
        mk$Event.cjg[27] = 111923031;
        mk$Event.cjg[28] = -1522339018;
        mk$Event.cjg[29] = -781412032;
        mk$Event.cjg[30] = -932776073;
        mk$Event.cjg[31] = -700902740;
        mk$Event.cjg[32] = -1441192646;
        mk$Event.cjg[33] = -1125272908;
        mk$Event.cjg[34] = -1181316637;
        mk$Event.cjg[35] = -571763764;
        mk$Event.cjg[36] = 1866642701;
        mk$Event.cjg[37] = -1811354391;
        mk$Event.cjg[38] = 1484585605;
        mk$Event.cjg[39] = -1207129081;
        mk$Event.cjg[40] = -1174128632;
        mk$Event.cjg[41] = -61275242;
        mk$Event.cjg[42] = -943578169;
        mk$Event.cjg[43] = 639562753;
        mk$Event.cjg[44] = -1269162175;
        mk$Event.cjg[45] = -414169747;
        mk$Event.cjg[46] = -980660366;
        mk$Event.cjg[47] = 1838377081;
        mk$Event.cjg[48] = -1944610681;
        mk$Event.cjg[49] = -1536998890;
        mk$Event.cjg[50] = -1103854445;
        mk$Event.cjg[51] = -1241109579;
        mk$Event.cjg[52] = -1045785675;
        mk$Event.cjg[53] = 128291834;
        mk$Event.cjg[54] = 1983014840;
        mk$Event.cjg[55] = 956874598;
        mk$Event.cjg[56] = -1403944356;
        mk$Event.cjg[57] = 486905122;
        mk$Event.cjg[58] = 215352701;
        mk$Event.cjg[59] = -670002455;
        mk$Event.cjg[60] = -996458001;
        mk$Event.cjg[61] = -1077634261;
        mk$Event.cjg[62] = -1184111370;
        mk$Event.cjg[63] = 308997887;
        mk$Event.cjg[64] = -1562561396;
        mk$Event.cjg[65] = 1372343578;
        mk$Event.cjg[66] = 443783751;
        mk$Event.cjg[67] = 2055947637;
        mk$Event.cjg[68] = -296157427;
        mk$Event.cjg[69] = 1175422970;
        mk$Event.cjg[70] = 1437207173;
        mk$Event.cjg[71] = -1873827175;
        mk$Event.cjg[72] = -57141953;
        mk$Event.cjg[73] = 1086611026;
        mk$Event.cjg[74] = 1943811907;
        mk$Event.cjg[75] = 2015651346;
        mk$Event.cjg[76] = -752549316;
        mk$Event.cjg[77] = 1939816165;
        mk$Event.cjg[78] = 246902368;
        mk$Event.cjg[79] = 445710079;
        mk$Event.cjg[80] = -430805547;
        mk$Event.cjg[81] = 1977079454;
        mk$Event.cjg[82] = -1150973255;
        mk$Event.cjg[83] = 1073130732;
        mk$Event.cjg[84] = -1765923677;
        mk$Event.cjg[85] = -369827266;
        mk$Event.cjg[86] = 1343605977;
        mk$Event.cjg[87] = -1397357421;
        mk$Event.cjg[88] = -934840157;
        mk$Event.cjg[89] = 1953469619;
        mk$Event.cjg[90] = 1855218551;
        mk$Event.cjg[91] = -924800416;
        mk$Event.cjg[92] = 2123463963;
        mk$Event.cjg[93] = 992332933;
    }

    static {
        cjf = new int[94];
        cjg = new int[94];
        mk$Event.cqr();
        mk$Event.cqs();
        cjo = new long[94];
        cjp = new long[94];
        mk$Event.cqt();
        mk$Event.cqu();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        v0 /* !! */  = mk$Event.m;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(mk$Event.cjh("clv", cjn(int ), (int)31) - mk$Event.cjh("clu", cjn(int ), (int)30));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -81419959: {
                    break block21;
                }
                case 1370754013: {
                    continue block21;
                }
            }
            break;
        }
        var3_1 = mk$Event.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = mk$Event.m - mk$Event.cjh("clw", cjn(int ), (int)32)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mk$Event.cjh("clx", cje(int ), (int)31)) break;
            v1 /* !! */  = (long)mk$Event.cjh("cly", cje(int ), (int)32);
        }
        var2_2 /* !! */  = mk$Event.b;
        v2 /* !! */  = mk$Event.m;
        if (true) ** GOTO lbl22
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - mk$Event.cjh("clz", cjn(int ), (int)33));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2111247472: {
                    v3 = mk$Event.cjh("cma", cjn(int ), (int)34);
                    continue block23;
                }
                case -1299677192: {
                    v3 = mk$Event.cjh("cmb", cjn(int ), (int)35);
                    continue block23;
                }
                case -142109961: {
                    v3 = mk$Event.cjh("cmc", cjn(int ), (int)36);
                    continue block23;
                }
                case -81419959: {
                    break block23;
                }
            }
            break;
        }
        var1_3 = mk$Event.a;
        if (var3_1) {
            throw null;
lbl37:
            // 1 sources

            return (int)mk$Event.cjh("cmd", cje(int ), (int)33);
        }
        ** while (var1_3 || var1_3)
lbl40:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = mk$Event.m;
                if (true) ** GOTO lbl47
                block25: while (true) {
                    v4 /* !! */  = (long)(v5 - mk$Event.cjh("cme", cjn(int ), (int)37));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -598493946: {
                            v5 = mk$Event.cjh("cmf", cjn(int ), (int)38);
                            continue block25;
                        }
                        case -81419959: {
                            break block25;
                        }
                        case 835685020: {
                            v5 = mk$Event.cjh("cmg", cjn(int ), (int)39);
                            continue block25;
                        }
                    }
                    break;
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{mk$Event.class, "role;author;recipient;text;timestamp;direct", "role", "author", "recipient", "text", "timestamp", "direct"}, this);
            }
lbl57:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mk$Event.cjh("cmh", cje(int ), (int)34);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl68
                    break;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)mk$Event.cjh("cmi", cje(int ), (int)35);
                } while (!var3_1);
                throw null;
            }
lbl68:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)mk$Event.cjh("cmj", cje(int ), (int)36);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mk$Event.cjh("cmk", cje(int ), (int)37);
        ** while (!var3_1)
lbl75:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cqt() {
        mk$Event.cjo[0] = 1524020534421272993L;
        mk$Event.cjo[1] = -4730642461200053944L;
        mk$Event.cjo[2] = -6715317918019325899L;
        mk$Event.cjo[3] = 644330446856922262L;
        mk$Event.cjo[4] = -6839809671493050808L;
        mk$Event.cjo[5] = 176079505189764313L;
        mk$Event.cjo[6] = 900567193900804952L;
        mk$Event.cjo[7] = 2519158654559554150L;
        mk$Event.cjo[8] = -7771706094718710261L;
        mk$Event.cjo[9] = -3018336662550186571L;
        mk$Event.cjo[10] = 755994445958289710L;
        mk$Event.cjo[11] = 3901123553047908969L;
        mk$Event.cjo[12] = 2702620864495882139L;
        mk$Event.cjo[13] = -3581962555914900304L;
        mk$Event.cjo[14] = -3357252668084697715L;
        mk$Event.cjo[15] = 5566225811306185804L;
        mk$Event.cjo[16] = 2681621426836508321L;
        mk$Event.cjo[17] = 6125803393419606998L;
        mk$Event.cjo[18] = 4859802469726171405L;
        mk$Event.cjo[19] = -8198748337731636970L;
        mk$Event.cjo[20] = 8015835438737310328L;
        mk$Event.cjo[21] = -2081405161256855931L;
        mk$Event.cjo[22] = -4657467494086922330L;
        mk$Event.cjo[23] = 3741919535537917927L;
        mk$Event.cjo[24] = -3878537043902296285L;
        mk$Event.cjo[25] = -3917438746650891850L;
        mk$Event.cjo[26] = 1331976156837536339L;
        mk$Event.cjo[27] = -5524684433062526773L;
        mk$Event.cjo[28] = -5774316354127793530L;
        mk$Event.cjo[29] = 1827422627838632178L;
        mk$Event.cjo[30] = -5442791703479204148L;
        mk$Event.cjo[31] = -3226506551924357797L;
        mk$Event.cjo[32] = 3427956504456916745L;
        mk$Event.cjo[33] = -3845565690391199920L;
        mk$Event.cjo[34] = -2118374037948539353L;
        mk$Event.cjo[35] = -7228226933735306432L;
        mk$Event.cjo[36] = -3117297895828851030L;
        mk$Event.cjo[37] = 334853404143331659L;
        mk$Event.cjo[38] = -9187739533763368555L;
        mk$Event.cjo[39] = 4009464052016774058L;
        mk$Event.cjo[40] = -7134366380771767429L;
        mk$Event.cjo[41] = 2320403101671985335L;
        mk$Event.cjo[42] = -2870996793421242455L;
        mk$Event.cjo[43] = -4818651562839004126L;
        mk$Event.cjo[44] = -2381796719754430876L;
        mk$Event.cjo[45] = -3983986269170546055L;
        mk$Event.cjo[46] = 4299887546351832489L;
        mk$Event.cjo[47] = 6775137585736568287L;
        mk$Event.cjo[48] = -778367642107708182L;
        mk$Event.cjo[49] = 4059890253377877716L;
        mk$Event.cjo[50] = 6743406728713464680L;
        mk$Event.cjo[51] = 8643210522630697523L;
        mk$Event.cjo[52] = -5350904484810578792L;
        mk$Event.cjo[53] = 1848246561825080469L;
        mk$Event.cjo[54] = -6253166865662252320L;
        mk$Event.cjo[55] = -8068203754174972044L;
        mk$Event.cjo[56] = -1936739374724608988L;
        mk$Event.cjo[57] = -5091406454704222239L;
        mk$Event.cjo[58] = 3822264567723391273L;
        mk$Event.cjo[59] = 5328819758152336691L;
        mk$Event.cjo[60] = -9182964013278668888L;
        mk$Event.cjo[61] = 6500232121288507042L;
        mk$Event.cjo[62] = -8755931036869579599L;
        mk$Event.cjo[63] = -4026443478005599678L;
        mk$Event.cjo[64] = -7154826887362215491L;
        mk$Event.cjo[65] = 9203463756453252355L;
        mk$Event.cjo[66] = -628734741276238384L;
        mk$Event.cjo[67] = -3996128691026179416L;
        mk$Event.cjo[68] = -6531361574072571045L;
        mk$Event.cjo[69] = -8789528009658381576L;
        mk$Event.cjo[70] = -3565044039390428810L;
        mk$Event.cjo[71] = -7388765068084831880L;
        mk$Event.cjo[72] = -4899582144111830822L;
        mk$Event.cjo[73] = -8217493040225884945L;
        mk$Event.cjo[74] = -2665575961490974562L;
        mk$Event.cjo[75] = -5163366904034343259L;
        mk$Event.cjo[76] = 3896283367689619064L;
        mk$Event.cjo[77] = -5837261879050999752L;
        mk$Event.cjo[78] = -5207362834618463917L;
        mk$Event.cjo[79] = 652241491095952908L;
        mk$Event.cjo[80] = 2738431815355454728L;
        mk$Event.cjo[81] = -1598051407415260553L;
        mk$Event.cjo[82] = 5221689501842027403L;
        mk$Event.cjo[83] = -8182577920218254686L;
        mk$Event.cjo[84] = -2370121540570562341L;
        mk$Event.cjo[85] = 8692835211913530316L;
        mk$Event.cjo[86] = -4881551649872354316L;
        mk$Event.cjo[87] = 8931926655123724909L;
        mk$Event.cjo[88] = -6522858519261066455L;
        mk$Event.cjo[89] = 2775383412972464324L;
        mk$Event.cjo[90] = 9047837595762886911L;
        mk$Event.cjo[91] = 1317466028591583649L;
        mk$Event.cjo[92] = -4793355096008099495L;
        mk$Event.cjo[93] = 362152471663774494L;
    }
}

