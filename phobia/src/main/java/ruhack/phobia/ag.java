/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 */
package ruhack.phobia;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;

public class ag {
    private static int[] cjdx;
    public static final int b;
    private static long[] cjem;
    private int BindKey;
    private static int[] cjdw;
    private static long[] cjel;
    private static ag instance;
    private final Gson gson;
    static final long fw = 5421973608925113796L;
    public static final boolean a;
    public static final boolean c;
    private final Path configPath;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ag getInstance() {
        block56: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ag.fw - ag.cjdy("cjen", cjek(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == ag.cjdy("cjeo", cjdv(int ), (int)11)) break;
                v0 /* !! */  = (long)ag.cjdy("cjep", cjdv(int ), (int)12);
            }
            var2 = ag.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = ag.fw - ag.cjdy("cjeq", cjek(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == ag.cjdy("cjer", cjdv(int ), (int)13)) break;
                v1 /* !! */  = (long)ag.cjdy("cjes", cjdv(int ), (int)14);
            }
            var1_1 /* !! */  = ag.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = ag.fw - ag.cjdy("cjet", cjek(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == ag.cjdy("cjeu", cjdv(int ), (int)15)) break;
                v2 /* !! */  = (long)ag.cjdy("cjev", cjdv(int ), (int)16);
            }
            var0_2 = ag.a;
            if (var2) {
                throw null;
lbl24:
                // 5 sources

                return null;
            }
            if (var0_2 || var0_2) ** GOTO lbl24
            v3 /* !! */  = ag.fw;
            if (true) ** GOTO lbl31
            block40: while (true) {
                v3 /* !! */  = (long)(v4 - ag.cjdy("cjew", cjek(int ), (int)3));
lbl31:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1982696562: {
                        v4 = ag.cjdy("cjex", cjek(int ), (int)4);
                        continue block40;
                    }
                    case 1032203716: {
                        break block40;
                    }
                    case 1760173843: {
                        v4 = ag.cjdy("cjey", cjek(int ), (int)5);
                        continue block40;
                    }
                }
                break;
            }
            if (ag.instance != null) break block56;
            if (var0_2 || var0_2) ** GOTO lbl24
            v5 /* !! */  = ag.fw;
            if (true) ** GOTO lbl46
            block41: while (true) {
                v5 /* !! */  = (long)(v6 - ag.cjdy("cjez", cjek(int ), (int)6));
lbl46:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1435654635: {
                        v6 = ag.cjdy("cjfa", cjek(int ), (int)7);
                        continue block41;
                    }
                    case 1003041451: {
                        v6 = ag.cjdy("cjfb", cjek(int ), (int)8);
                        continue block41;
                    }
                    case 1032203716: {
                        break block41;
                    }
                    case 1567332060: {
                        v6 = ag.cjdy("cjfc", cjek(int ), (int)9);
                        continue block41;
                    }
                }
                break;
            }
            v7 /* !! */  = ag.fw;
            if (true) ** GOTO lbl62
            block42: while (true) {
                v7 /* !! */  = (long)(v8 - ag.cjdy("cjfd", cjek(int ), (int)10));
lbl62:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1767048260: {
                        v8 = ag.cjdy("cjfe", cjek(int ), (int)11);
                        continue block42;
                    }
                    case 636334453: {
                        v8 = ag.cjdy("cjff", cjek(int ), (int)12);
                        continue block42;
                    }
                    case 1032203716: {
                        break block42;
                    }
                    case 1518016708: {
                        v8 = ag.cjdy("cjfg", cjek(int ), (int)13);
                        continue block42;
                    }
                }
                break;
            }
            v9 = new ag();
            v10 /* !! */  = ag.fw;
            if (true) ** GOTO lbl79
            block43: while (true) {
                v10 /* !! */  = (long)(ag.cjdy("cjfi", cjek(int ), (int)15) - ag.cjdy("cjfh", cjek(int ), (int)14));
lbl79:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case 1032203716: {
                        break block43;
                    }
                    case 1677550544: {
                        continue block43;
                    }
                }
                break;
            }
            ag.instance = v9;
            if (var0_2) ** GOTO lbl24
        }
        if (var0_2) ** GOTO lbl24
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var0_2) ** break;
                ** continue;
                v11 /* !! */  = ag.fw;
                if (true) ** GOTO lbl97
                block44: while (true) {
                    v11 /* !! */  = (long)(ag.cjdy("cjfk", cjek(int ), (int)17) - ag.cjdy("cjfj", cjek(int ), (int)16));
lbl97:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 1032203716: {
                            break block44;
                        }
                        case 1299671541: {
                            continue block44;
                        }
                    }
                    break;
                }
                return ag.instance;
            }
lbl103:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)ag.cjdy("cjfl", cjdv(int ), (int)17);
                if (!var2) break;
                throw null;
            }
lbl107:
            // 3 sources

            case 1: {
                var1_1 /* !! */  = (int)ag.cjdy("cjfm", cjdv(int ), (int)18);
                if (var2) {
                    throw null;
                }
            }
lbl111:
            // 4 sources

            case 2: {
                var1_1 /* !! */  = (int)ag.cjdy("cjfn", cjdv(int ), (int)19);
                if (!var2) ** GOTO lbl103
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)ag.cjdy("cjfo", cjdv(int ), (int)20);
                    if (!var2) ** GOTO lbl107
                    throw null;
                }
            }
lbl120:
            // 2 sources

            case 4: {
                var1_1 /* !! */  = (int)ag.cjdy("cjfp", cjdv(int ), (int)21);
                if (!var2) ** GOTO lbl111
                throw null;
            }
lbl124:
            // 2 sources

            case 5: {
                var1_1 /* !! */  = (int)ag.cjdy("cjfq", cjdv(int ), (int)22);
                if (!var2) ** GOTO lbl120
                throw null;
            }
            case 6: {
                var1_1 /* !! */  = (int)ag.cjdy("cjfr", cjdv(int ), (int)23);
                if (!var2) ** GOTO lbl124
                throw null;
            }
            case 7: {
                var1_1 /* !! */  = (int)ag.cjdy("cjfs", cjdv(int ), (int)24);
                if (!var2) ** GOTO lbl107
                throw null;
            }
            case 8: 
        }
        var1_1 /* !! */  = (int)ag.cjdy("cjft", cjdv(int ), (int)25);
        ** while (!var2)
lbl139:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ag() {
        var4_1 /* !! */  = ag.b;
        super();
        if (var4_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.gson = new GsonBuilder().setPrettyPrinting().create();
                this.BindKey = (int)ag.cjdy("cjdz", cjdv(int ), (int)0);
                var1_2 = Paths.get("Phobia", new String[]{"configs"});
                try {
                    Files.createDirectories(var1_2, new FileAttribute[0]);
                }
                catch (IOException var2_3) {
                    // empty catch block
                }
                this.configPath = var1_2.resolve("Bind.file");
                this.load();
                return;
            }
lbl18:
            // 2 sources

            case 0: {
                var4_1 /* !! */  = (int)ag.cjdy("cjea", cjdv(int ), (int)1);
                ** GOTO lbl40
            }
lbl21:
            // 2 sources

            case 1: {
                var4_1 /* !! */  = (int)ag.cjdy("cjeb", cjdv(int ), (int)2);
                ** GOTO lbl18
            }
            case 2: {
                var4_1 /* !! */  = (int)ag.cjdy("cjec", cjdv(int ), (int)3);
                ** GOTO lbl31
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_1 /* !! */  = (int)ag.cjdy("cjed", cjdv(int ), (int)4);
                    ** GOTO lbl21
                    break;
                }
            }
lbl31:
            // 3 sources

            case 4: {
                var4_1 /* !! */  = (int)ag.cjdy("cjee", cjdv(int ), (int)5);
                ** GOTO lbl43
            }
lbl34:
            // 2 sources

            case 5: {
                var4_1 /* !! */  = (int)ag.cjdy("cjef", cjdv(int ), (int)6);
                ** GOTO lbl40
            }
            case 6: {
                var4_1 /* !! */  = (int)ag.cjdy("cjeg", cjdv(int ), (int)7);
                ** GOTO lbl34
            }
lbl40:
            // 3 sources

            case 7: {
                var4_1 /* !! */  = (int)ag.cjdy("cjeh", cjdv(int ), (int)8);
                ** GOTO lbl31
            }
lbl43:
            // 2 sources

            case 8: {
                while (true) {
                    var4_1 /* !! */  = (int)ag.cjdy("cjei", cjdv(int ), (int)9);
                }
            }
            case 9: 
        }
        var4_1 /* !! */  = (int)ag.cjdy("cjej", cjdv(int ), (int)10);
        ** while (true)
    }

    private static /* synthetic */ void cjnh() {
        ag.cjdx[100] = -237503945;
        ag.cjdx[101] = -1849364186;
        ag.cjdx[102] = -2113892038;
        ag.cjdx[103] = -1609349584;
        ag.cjdx[104] = -67177241;
        ag.cjdx[105] = 509159886;
        ag.cjdx[106] = 1584324431;
        ag.cjdx[107] = 1814074484;
        ag.cjdx[108] = 1451815466;
        ag.cjdx[109] = -576453030;
        ag.cjdx[110] = 942991645;
        ag.cjdx[111] = -1086020809;
        ag.cjdx[112] = 864215276;
        ag.cjdx[113] = -349362964;
        ag.cjdx[114] = 1025340894;
        ag.cjdx[115] = 2132676034;
        ag.cjdx[116] = 252983521;
        ag.cjdx[117] = 704681758;
        ag.cjdx[118] = 69540403;
        ag.cjdx[119] = 1052354518;
        ag.cjdx[120] = 479181205;
        ag.cjdx[121] = 1055667599;
        ag.cjdx[122] = -1471193257;
        ag.cjdx[123] = 1753016013;
        ag.cjdx[124] = -1823823465;
        ag.cjdx[125] = -773113602;
        ag.cjdx[126] = 1288147457;
        ag.cjdx[127] = 1214181222;
        ag.cjdx[128] = -63780266;
        ag.cjdx[129] = 434132638;
        ag.cjdx[130] = -1135951312;
        ag.cjdx[131] = -1391998199;
        ag.cjdx[132] = 1845403014;
    }

    private static /* synthetic */ void cjnk() {
        ag.cjem[0] = 8756039730192315077L;
        ag.cjem[1] = 6848398460767039788L;
        ag.cjem[2] = -161335297008896506L;
        ag.cjem[3] = -1354350351618139788L;
        ag.cjem[4] = -5115133434514773236L;
        ag.cjem[5] = 7434461019354368805L;
        ag.cjem[6] = -626681889642273114L;
        ag.cjem[7] = 1822112654017885674L;
        ag.cjem[8] = 8247676717181815513L;
        ag.cjem[9] = -603081015630493560L;
        ag.cjem[10] = 4944009396243317012L;
        ag.cjem[11] = 1419553849606485968L;
        ag.cjem[12] = 1787181936483535115L;
        ag.cjem[13] = -8775436924082909715L;
        ag.cjem[14] = -7383140223867483593L;
        ag.cjem[15] = -6181559496756454660L;
        ag.cjem[16] = 5165610784868108417L;
        ag.cjem[17] = -7043911009520952607L;
        ag.cjem[18] = 4782261734428440497L;
        ag.cjem[19] = 7847153331671889798L;
        ag.cjem[20] = 1136049725091892743L;
        ag.cjem[21] = -4564644657894593351L;
        ag.cjem[22] = -1722477051629631981L;
        ag.cjem[23] = -7088435290322541243L;
        ag.cjem[24] = 4048380052772073712L;
        ag.cjem[25] = 3775409393648808902L;
        ag.cjem[26] = 1717300411776801975L;
        ag.cjem[27] = -3725703155564632459L;
        ag.cjem[28] = -2751670417780024575L;
        ag.cjem[29] = -843242861983083546L;
        ag.cjem[30] = -3607348983523651596L;
        ag.cjem[31] = -654306890577131882L;
        ag.cjem[32] = -6412585127221416002L;
        ag.cjem[33] = 5443868345967396995L;
        ag.cjem[34] = 1363776082979344780L;
        ag.cjem[35] = -7249129420148595078L;
        ag.cjem[36] = -759151388394606236L;
        ag.cjem[37] = 7518783598545238817L;
        ag.cjem[38] = 1938743225317382015L;
        ag.cjem[39] = 1216532260503567013L;
        ag.cjem[40] = -7180171066774435328L;
        ag.cjem[41] = 5510399105194924092L;
        ag.cjem[42] = 6155466304626332687L;
        ag.cjem[43] = 281266616451493669L;
        ag.cjem[44] = -7421713092950488170L;
        ag.cjem[45] = -2296622599320299280L;
        ag.cjem[46] = 4655415604005615072L;
        ag.cjem[47] = 1892007696423428085L;
        ag.cjem[48] = -7569948629742292300L;
        ag.cjem[49] = -670454652031527794L;
        ag.cjem[50] = 3536887271215330238L;
        ag.cjem[51] = -4907529033908978744L;
        ag.cjem[52] = -3285400072623267249L;
        ag.cjem[53] = 8202365046753750559L;
        ag.cjem[54] = 4689822608076216734L;
        ag.cjem[55] = -337204957549790721L;
        ag.cjem[56] = -7212931590367824148L;
        ag.cjem[57] = -2604155457646384505L;
        ag.cjem[58] = -4872431883095373847L;
        ag.cjem[59] = -690171515845200241L;
        ag.cjem[60] = -5680703097869108394L;
        ag.cjem[61] = 487745826170927083L;
        ag.cjem[62] = -6733507219469718798L;
        ag.cjem[63] = 6084691246865137018L;
        ag.cjem[64] = -671728622581042093L;
        ag.cjem[65] = 7937355751098360433L;
        ag.cjem[66] = 4149762680290824290L;
        ag.cjem[67] = -5139967545094884854L;
        ag.cjem[68] = -4446903071970451569L;
        ag.cjem[69] = 9163153807257703266L;
        ag.cjem[70] = 8964838022006673645L;
        ag.cjem[71] = 3471020613147007221L;
        ag.cjem[72] = 310795763427433039L;
        ag.cjem[73] = 5895848331011182245L;
        ag.cjem[74] = 2288392642367907247L;
        ag.cjem[75] = -8985859480742176191L;
        ag.cjem[76] = 8670158275394389831L;
        ag.cjem[77] = 7300975972844710104L;
        ag.cjem[78] = 2167557082884667260L;
        ag.cjem[79] = 3224640557413143851L;
        ag.cjem[80] = -2172315342340939045L;
        ag.cjem[81] = -6846297657996346034L;
        ag.cjem[82] = 2160252511141794954L;
        ag.cjem[83] = -803004999359146549L;
        ag.cjem[84] = -3878238003920217271L;
        ag.cjem[85] = 575321494177135299L;
        ag.cjem[86] = 5623801280065085475L;
        ag.cjem[87] = 6202575741432156623L;
        ag.cjem[88] = 8515793529751957247L;
        ag.cjem[89] = -1643597603721636501L;
        ag.cjem[90] = -7236751146406026894L;
        ag.cjem[91] = -2275796218372536600L;
        ag.cjem[92] = -2632278825704497613L;
        ag.cjem[93] = 8496240401355095605L;
        ag.cjem[94] = 2356714633738366712L;
        ag.cjem[95] = -30745408519674340L;
        ag.cjem[96] = -2384507844989802595L;
        ag.cjem[97] = -6310609749722684557L;
        ag.cjem[98] = 4798480942960945733L;
        ag.cjem[99] = -4575754687433368189L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setKeyAndSave(int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ag.fw - ag.cjdy("cjgm", cjek(int ), (int)26)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ag.cjdy("cjgn", cjdv(int ), (int)36)) break;
            v0 /* !! */  = (long)ag.cjdy("cjgo", cjdv(int ), (int)37);
        }
        var4_2 = ag.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ag.fw - ag.cjdy("cjgp", cjek(int ), (int)27)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ag.cjdy("cjgq", cjdv(int ), (int)38)) break;
            v1 /* !! */  = (long)ag.cjdy("cjgr", cjdv(int ), (int)39);
        }
        var3_3 /* !! */  = ag.b;
        v2 /* !! */  = ag.fw;
        if (true) ** GOTO lbl17
        block20: while (true) {
            v2 /* !! */  = (long)(ag.cjdy("cjgt", cjek(int ), (int)29) - ag.cjdy("cjgs", cjek(int ), (int)28));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -979979099: {
                    continue block20;
                }
                case 1032203716: {
                    break block20;
                }
            }
            break;
        }
        var2_4 = ag.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
lbl28:
                    // 3 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl28
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ag.fw - ag.cjdy("cjgu", cjek(int ), (int)30)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ag.cjdy("cjgv", cjdv(int ), (int)40)) break;
                    v3 /* !! */  = (long)ag.cjdy("cjgw", cjdv(int ), (int)41);
                }
                this.setKey(var1_1);
                if (var2_4 || var2_4) ** GOTO lbl28
                v4 /* !! */  = ag.fw;
                if (true) ** GOTO lbl42
                block23: while (true) {
                    v4 /* !! */  = (long)(ag.cjdy("cjgy", cjek(int ), (int)32) - ag.cjdy("cjgx", cjek(int ), (int)31));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -962990766: {
                            continue block23;
                        }
                        case 1032203716: {
                            break block23;
                        }
                    }
                    break;
                }
                this.save();
                if (var2_4 || var2_4) ** continue;
                return;
            }
lbl50:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)ag.cjdy("cjgz", cjdv(int ), (int)42);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl77
            }
lbl55:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ag.cjdy("cjha", cjdv(int ), (int)43);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl77
                    break;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)ag.cjdy("cjhb", cjdv(int ), (int)44);
                if (!var4_2) ** GOTO lbl50
                throw null;
            }
lbl65:
            // 4 sources

            case 3: {
                var3_3 /* !! */  = (int)ag.cjdy("cjhc", cjdv(int ), (int)45);
                if (!var4_2) ** GOTO lbl55
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)ag.cjdy("cjhd", cjdv(int ), (int)46);
                if (!var4_2) ** GOTO lbl65
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)ag.cjdy("cjhe", cjdv(int ), (int)47);
                if (!var4_2) ** GOTO lbl65
                throw null;
            }
lbl77:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)ag.cjdy("cjhf", cjdv(int ), (int)48);
                if (!var4_2) ** GOTO lbl65
                throw null;
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)ag.cjdy("cjhg", cjdv(int ), (int)49);
        ** while (!var4_2)
lbl84:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cjne() {
        ag.cjdw[0] = -1710692513;
        ag.cjdw[1] = -1641196417;
        ag.cjdw[2] = 2119062229;
        ag.cjdw[3] = 1879021775;
        ag.cjdw[4] = -399217203;
        ag.cjdw[5] = -1655516793;
        ag.cjdw[6] = 861346898;
        ag.cjdw[7] = 697852343;
        ag.cjdw[8] = 1232070630;
        ag.cjdw[9] = -1130919806;
        ag.cjdw[10] = -1529347540;
        ag.cjdw[11] = 2075465594;
        ag.cjdw[12] = 1565386402;
        ag.cjdw[13] = -532106569;
        ag.cjdw[14] = 236957471;
        ag.cjdw[15] = 447382991;
        ag.cjdw[16] = 1611631540;
        ag.cjdw[17] = 311340607;
        ag.cjdw[18] = 741224506;
        ag.cjdw[19] = -2082284563;
        ag.cjdw[20] = 714875992;
        ag.cjdw[21] = 0x46E6E4EE;
        ag.cjdw[22] = -733614769;
        ag.cjdw[23] = -1339236954;
        ag.cjdw[24] = -1655933619;
        ag.cjdw[25] = -1388953225;
        ag.cjdw[26] = 2070110038;
        ag.cjdw[27] = -2018471312;
        ag.cjdw[28] = 1489960791;
        ag.cjdw[29] = 1656987368;
        ag.cjdw[30] = -1700902150;
        ag.cjdw[31] = 118641271;
        ag.cjdw[32] = -980985976;
        ag.cjdw[33] = 1727141214;
        ag.cjdw[34] = 1081036924;
        ag.cjdw[35] = -210026397;
        ag.cjdw[36] = -1101626729;
        ag.cjdw[37] = -699682175;
        ag.cjdw[38] = 1031871118;
        ag.cjdw[39] = -1926353752;
        ag.cjdw[40] = 747671421;
        ag.cjdw[41] = 735956005;
        ag.cjdw[42] = 1217796965;
        ag.cjdw[43] = -1867166045;
        ag.cjdw[44] = 628153620;
        ag.cjdw[45] = -1998648888;
        ag.cjdw[46] = 617295141;
        ag.cjdw[47] = -1882664627;
        ag.cjdw[48] = -474080758;
        ag.cjdw[49] = -1183059199;
        ag.cjdw[50] = -659798647;
        ag.cjdw[51] = -219309174;
        ag.cjdw[52] = -415450617;
        ag.cjdw[53] = 987728121;
        ag.cjdw[54] = -604792726;
        ag.cjdw[55] = 621043724;
        ag.cjdw[56] = 664480029;
        ag.cjdw[57] = 1373295109;
        ag.cjdw[58] = -1270622610;
        ag.cjdw[59] = 858930224;
        ag.cjdw[60] = 274727228;
        ag.cjdw[61] = 1427527964;
        ag.cjdw[62] = 375345716;
        ag.cjdw[63] = 356480984;
        ag.cjdw[64] = 1554327401;
        ag.cjdw[65] = -1668428064;
        ag.cjdw[66] = 481176407;
        ag.cjdw[67] = 957141910;
        ag.cjdw[68] = 408590898;
        ag.cjdw[69] = -509484618;
        ag.cjdw[70] = -899756413;
        ag.cjdw[71] = 898273194;
        ag.cjdw[72] = 1982763719;
        ag.cjdw[73] = -340028079;
        ag.cjdw[74] = 905792390;
        ag.cjdw[75] = 1342871816;
        ag.cjdw[76] = -1365173237;
        ag.cjdw[77] = -1173399795;
        ag.cjdw[78] = -1791578054;
        ag.cjdw[79] = 1965393461;
        ag.cjdw[80] = 743873042;
        ag.cjdw[81] = 1420817512;
        ag.cjdw[82] = 178435084;
        ag.cjdw[83] = -1219417985;
        ag.cjdw[84] = 241630686;
        ag.cjdw[85] = -388189374;
        ag.cjdw[86] = 1330540668;
        ag.cjdw[87] = 198302933;
        ag.cjdw[88] = 1966483275;
        ag.cjdw[89] = -1610199159;
        ag.cjdw[90] = -860658810;
        ag.cjdw[91] = 659039507;
        ag.cjdw[92] = 2038206694;
        ag.cjdw[93] = 1854358207;
        ag.cjdw[94] = 18155775;
        ag.cjdw[95] = -1586285850;
        ag.cjdw[96] = -628587376;
        ag.cjdw[97] = -1136963974;
        ag.cjdw[98] = -464199942;
        ag.cjdw[99] = 1011250869;
    }

    /*
     * Exception decompiling
     */
    public void save() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 28[SWITCH]
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

    private static /* synthetic */ void cjni() {
        ag.cjel[0] = 8161404430018111851L;
        ag.cjel[1] = 2141464372199486729L;
        ag.cjel[2] = 197983825454072711L;
        ag.cjel[3] = 8996353051856690175L;
        ag.cjel[4] = 6225449847980970856L;
        ag.cjel[5] = 8523670902452106779L;
        ag.cjel[6] = -6353590112747099239L;
        ag.cjel[7] = -6918914318757864189L;
        ag.cjel[8] = -6915600626260719608L;
        ag.cjel[9] = -2311076751717768834L;
        ag.cjel[10] = 2771976406491220144L;
        ag.cjel[11] = -7976716177646504106L;
        ag.cjel[12] = 5269887098366023898L;
        ag.cjel[13] = -4626256773546976525L;
        ag.cjel[14] = -1244784217767543381L;
        ag.cjel[15] = 8366502596907536915L;
        ag.cjel[16] = 4646268796692307758L;
        ag.cjel[17] = 8091942251589239012L;
        ag.cjel[18] = -1347120062603916899L;
        ag.cjel[19] = 6335735940835249417L;
        ag.cjel[20] = -1770682861652194792L;
        ag.cjel[21] = 8741096735973027766L;
        ag.cjel[22] = 6112436476926445358L;
        ag.cjel[23] = -2278549703330783807L;
        ag.cjel[24] = 7044689725465135695L;
        ag.cjel[25] = 8262138201144198192L;
        ag.cjel[26] = 9142085814659042794L;
        ag.cjel[27] = 4982863362061872251L;
        ag.cjel[28] = 5080681533488595444L;
        ag.cjel[29] = -4718869719472490446L;
        ag.cjel[30] = -3241788210035872813L;
        ag.cjel[31] = -6404466592827650675L;
        ag.cjel[32] = -6681466781690169740L;
        ag.cjel[33] = -1151405315499840329L;
        ag.cjel[34] = -616683033273451505L;
        ag.cjel[35] = -5083373847726781408L;
        ag.cjel[36] = 6099918309425183709L;
        ag.cjel[37] = -363803596463747094L;
        ag.cjel[38] = 666365076023165831L;
        ag.cjel[39] = 8132181802027688904L;
        ag.cjel[40] = -6709659707536189623L;
        ag.cjel[41] = -8516788570782576229L;
        ag.cjel[42] = 6217904105184917636L;
        ag.cjel[43] = 8792740054633088208L;
        ag.cjel[44] = -4609184289891283138L;
        ag.cjel[45] = 4556999574828337233L;
        ag.cjel[46] = 6457271429999605619L;
        ag.cjel[47] = 1121841612957252210L;
        ag.cjel[48] = 5260790589918903666L;
        ag.cjel[49] = 8728887485162609687L;
        ag.cjel[50] = 4220823799378459279L;
        ag.cjel[51] = -5618004370326189833L;
        ag.cjel[52] = -7874631583997400941L;
        ag.cjel[53] = -4531762638566939258L;
        ag.cjel[54] = 4753867509614900122L;
        ag.cjel[55] = -8426893386110777753L;
        ag.cjel[56] = 8609012711890005786L;
        ag.cjel[57] = 8283504549576930414L;
        ag.cjel[58] = 1442982086090660210L;
        ag.cjel[59] = 2164702651355711488L;
        ag.cjel[60] = 9121333874859431940L;
        ag.cjel[61] = -7034542865736256455L;
        ag.cjel[62] = -2300120369315158243L;
        ag.cjel[63] = 701278654260172593L;
        ag.cjel[64] = 1536736900122591174L;
        ag.cjel[65] = -5678927544739033455L;
        ag.cjel[66] = 187672734827447389L;
        ag.cjel[67] = 5955012268395414820L;
        ag.cjel[68] = 2208960895700716061L;
        ag.cjel[69] = -7712366150242168755L;
        ag.cjel[70] = 9039710714687241407L;
        ag.cjel[71] = -7365160862477733085L;
        ag.cjel[72] = -4808482865152643106L;
        ag.cjel[73] = -5146927915896176696L;
        ag.cjel[74] = -936394392702959805L;
        ag.cjel[75] = -6236949794956515869L;
        ag.cjel[76] = 2363201302112417192L;
        ag.cjel[77] = 1447168523410700480L;
        ag.cjel[78] = 2463764284745601972L;
        ag.cjel[79] = 4804683832082636088L;
        ag.cjel[80] = 6541464003030864428L;
        ag.cjel[81] = -6457937492941443525L;
        ag.cjel[82] = 3730226878096863700L;
        ag.cjel[83] = 1275212182642767915L;
        ag.cjel[84] = -8405061257042393988L;
        ag.cjel[85] = -3246707836360261912L;
        ag.cjel[86] = -649898113830460847L;
        ag.cjel[87] = 9072118493543120114L;
        ag.cjel[88] = 7501900505529797916L;
        ag.cjel[89] = -5118713980010682496L;
        ag.cjel[90] = 6750220933304878382L;
        ag.cjel[91] = -3961599928102320522L;
        ag.cjel[92] = 4251564363911155738L;
        ag.cjel[93] = -4138574079649295039L;
        ag.cjel[94] = 4860873401493949207L;
        ag.cjel[95] = 5150596106647227848L;
        ag.cjel[96] = -4676266136839906460L;
        ag.cjel[97] = 1454463796508685579L;
        ag.cjel[98] = -6755111308639993719L;
        ag.cjel[99] = 2759820669643417822L;
    }

    private static /* synthetic */ void cjnf() {
        ag.cjdw[100] = -237503948;
        ag.cjdw[101] = -1849364192;
        ag.cjdw[102] = -2113892044;
        ag.cjdw[103] = -1609349594;
        ag.cjdw[104] = -67177229;
        ag.cjdw[105] = 509159902;
        ag.cjdw[106] = 1584324440;
        ag.cjdw[107] = 1814074491;
        ag.cjdw[108] = 1451815470;
        ag.cjdw[109] = -576453048;
        ag.cjdw[110] = 942991627;
        ag.cjdw[111] = -1086020828;
        ag.cjdw[112] = 864215272;
        ag.cjdw[113] = -349362969;
        ag.cjdw[114] = 1025340884;
        ag.cjdw[115] = 2132676055;
        ag.cjdw[116] = 252983520;
        ag.cjdw[117] = 704681748;
        ag.cjdw[118] = 69540386;
        ag.cjdw[119] = 1052354527;
        ag.cjdw[120] = 479181186;
        ag.cjdw[121] = 1055667599;
        ag.cjdw[122] = -1471193260;
        ag.cjdw[123] = 1753016025;
        ag.cjdw[124] = 1823823464;
        ag.cjdw[125] = 261369851;
        ag.cjdw[126] = 1288147456;
        ag.cjdw[127] = -500480590;
        ag.cjdw[128] = -908493078;
        ag.cjdw[129] = 434132638;
        ag.cjdw[130] = -1135951310;
        ag.cjdw[131] = -1391998197;
        ag.cjdw[132] = 1845403014;
    }

    public static /* synthetic */ CallSite cjdy(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long cjek(int n2) {
        return cjel[n2] ^ cjem[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setKey(int var1_1) {
        v0 /* !! */  = ag.fw;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(ag.cjdy("cjfv", cjek(int ), (int)19) - ag.cjdy("cjfu", cjek(int ), (int)18));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1032203716: {
                    break block18;
                }
                case 2065387929: {
                    continue block18;
                }
            }
            break;
        }
        var4_2 = ag.c;
        v1 /* !! */  = ag.fw;
        if (true) ** GOTO lbl15
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - ag.cjdy("cjfw", cjek(int ), (int)20));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2072142216: {
                    v2 = ag.cjdy("cjfx", cjek(int ), (int)21);
                    continue block19;
                }
                case -1258602230: {
                    v2 = ag.cjdy("cjfy", cjek(int ), (int)22);
                    continue block19;
                }
                case 1032203716: {
                    break block19;
                }
                case 1816265044: {
                    v2 = ag.cjdy("cjfz", cjek(int ), (int)23);
                    continue block19;
                }
            }
            break;
        }
        var3_3 /* !! */  = ag.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ag.fw - ag.cjdy("cjga", cjek(int ), (int)24)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ag.cjdy("cjgb", cjdv(int ), (int)26)) break;
            v3 /* !! */  = (long)ag.cjdy("cjgc", cjdv(int ), (int)27);
        }
        var2_4 = ag.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
lbl39:
                    // 2 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl39
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = ag.fw - ag.cjdy("cjgd", cjek(int ), (int)25)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ag.cjdy("cjge", cjdv(int ), (int)28)) break;
                    v4 /* !! */  = (long)ag.cjdy("cjgf", cjdv(int ), (int)29);
                }
                this.BindKey = var1_1;
                if (var2_4 || var2_4) ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)ag.cjdy("cjgg", cjdv(int ), (int)30);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)ag.cjdy("cjgh", cjdv(int ), (int)31);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)ag.cjdy("cjgi", cjdv(int ), (int)32);
                if (!var4_2) break;
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ag.cjdy("cjgj", cjdv(int ), (int)33);
                    if (!var4_2) break block10;
                    throw null;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)ag.cjdy("cjgk", cjdv(int ), (int)34);
                if (!var4_2) break;
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)ag.cjdy("cjgl", cjdv(int ), (int)35);
        ** while (!var4_2)
lbl75:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cjnl() {
        ag.cjem[100] = -3033857304053824294L;
        ag.cjem[101] = -3570770101729517527L;
        ag.cjem[102] = 2349476345800661251L;
    }

    static {
        cjdw = new int[133];
        cjdx = new int[133];
        ag.cjne();
        ag.cjnf();
        ag.cjng();
        ag.cjnh();
        cjel = new long[103];
        cjem = new long[103];
        ag.cjni();
        ag.cjnj();
        ag.cjnk();
        ag.cjnl();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getBindKey() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ag.fw - ag.cjdy("cjmo", cjek(int ), (int)96)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ag.cjdy("cjmp", cjdv(int ), (int)124)) break;
            v0 /* !! */  = (long)ag.cjdy("cjmq", cjdv(int ), (int)125);
        }
        var3_1 = ag.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ag.fw - ag.cjdy("cjmr", cjek(int ), (int)97)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ag.cjdy("cjms", cjdv(int ), (int)126)) break;
            v1 /* !! */  = (long)ag.cjdy("cjmt", cjdv(int ), (int)127);
        }
        var2_2 /* !! */  = ag.b;
        v2 /* !! */  = ag.fw;
        if (true) ** GOTO lbl19
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - ag.cjdy("cjmu", cjek(int ), (int)98));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1155772587: {
                    v3 = ag.cjdy("cjmv", cjek(int ), (int)99);
                    continue block17;
                }
                case -1087049972: {
                    v3 = ag.cjdy("cjmw", cjek(int ), (int)100);
                    continue block17;
                }
                case 1032203716: {
                    break block17;
                }
            }
            break;
        }
        var1_3 = ag.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return (int)ag.cjdy("cjmx", cjdv(int ), (int)128);
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = ag.fw;
                if (true) ** GOTO lbl42
                block19: while (true) {
                    v4 /* !! */  = (long)(ag.cjdy("cjmz", cjek(int ), (int)102) - ag.cjdy("cjmy", cjek(int ), (int)101));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -721260844: {
                            continue block19;
                        }
                        case 1032203716: {
                            break block19;
                        }
                    }
                    break;
                }
                return this.BindKey;
            }
lbl48:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ag.cjdy("cjna", cjdv(int ), (int)129);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl58
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ag.cjdy("cjnb", cjdv(int ), (int)130);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl58:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ag.cjdy("cjnc", cjdv(int ), (int)131);
                if (!var3_1) ** GOTO lbl48
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ag.cjdy("cjnd", cjdv(int ), (int)132);
        ** while (!var3_1)
lbl65:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cjnj() {
        ag.cjel[100] = -1045941296449201642L;
        ag.cjel[101] = -3838354348290053945L;
        ag.cjel[102] = -8450623294680036475L;
    }

    private static /* synthetic */ int cjdv(int n2) {
        return cjdw[n2] ^ cjdx[n2];
    }

    private static /* synthetic */ void cjng() {
        ag.cjdx[0] = -1710692857;
        ag.cjdx[1] = -1641196422;
        ag.cjdx[2] = 2119062236;
        ag.cjdx[3] = 1879021775;
        ag.cjdx[4] = -399217203;
        ag.cjdx[5] = -1655516785;
        ag.cjdx[6] = 861346900;
        ag.cjdx[7] = 697852337;
        ag.cjdx[8] = 1232070630;
        ag.cjdx[9] = -1130919805;
        ag.cjdx[10] = -1529347542;
        ag.cjdx[11] = 2075465595;
        ag.cjdx[12] = 1471674508;
        ag.cjdx[13] = -532106570;
        ag.cjdx[14] = -243686023;
        ag.cjdx[15] = 447382990;
        ag.cjdx[16] = -1945967943;
        ag.cjdx[17] = 311340603;
        ag.cjdx[18] = 741224505;
        ag.cjdx[19] = -2082284568;
        ag.cjdx[20] = 714875992;
        ag.cjdx[21] = 0x46E6E4E6;
        ag.cjdx[22] = -733614772;
        ag.cjdx[23] = -1339236960;
        ag.cjdx[24] = -1655933622;
        ag.cjdx[25] = -1388953225;
        ag.cjdx[26] = -2070110039;
        ag.cjdx[27] = 1471575220;
        ag.cjdx[28] = 1489960790;
        ag.cjdx[29] = -1354713368;
        ag.cjdx[30] = -1700902150;
        ag.cjdx[31] = 118641267;
        ag.cjdx[32] = -980985973;
        ag.cjdx[33] = 1727141215;
        ag.cjdx[34] = 1081036921;
        ag.cjdx[35] = -210026393;
        ag.cjdx[36] = 1101626728;
        ag.cjdx[37] = -792208433;
        ag.cjdx[38] = 1031871119;
        ag.cjdx[39] = -163875083;
        ag.cjdx[40] = 747671420;
        ag.cjdx[41] = 1192474196;
        ag.cjdx[42] = 1217796962;
        ag.cjdx[43] = -1867166046;
        ag.cjdx[44] = 628153620;
        ag.cjdx[45] = -1998648883;
        ag.cjdx[46] = 617295136;
        ag.cjdx[47] = -1882664629;
        ag.cjdx[48] = -474080755;
        ag.cjdx[49] = -1183059199;
        ag.cjdx[50] = -659798648;
        ag.cjdx[51] = -1201348483;
        ag.cjdx[52] = 415450616;
        ag.cjdx[53] = -1162297516;
        ag.cjdx[54] = 604792725;
        ag.cjdx[55] = 798404609;
        ag.cjdx[56] = -664480030;
        ag.cjdx[57] = -16732171;
        ag.cjdx[58] = -1270622609;
        ag.cjdx[59] = -589259796;
        ag.cjdx[60] = -274727229;
        ag.cjdx[61] = 896484922;
        ag.cjdx[62] = 375345717;
        ag.cjdx[63] = -944907612;
        ag.cjdx[64] = 1554327404;
        ag.cjdx[65] = -1668428054;
        ag.cjdx[66] = 481176412;
        ag.cjdx[67] = 957141919;
        ag.cjdx[68] = 408590902;
        ag.cjdx[69] = -509484617;
        ag.cjdx[70] = -899756408;
        ag.cjdx[71] = 898273191;
        ag.cjdx[72] = 1982763719;
        ag.cjdx[73] = -340028067;
        ag.cjdx[74] = 905792391;
        ag.cjdx[75] = 1342871823;
        ag.cjdx[76] = -1365173241;
        ag.cjdx[77] = -1173399794;
        ag.cjdx[78] = -1791578056;
        ag.cjdx[79] = 1965393460;
        ag.cjdx[80] = -231000383;
        ag.cjdx[81] = 1420817513;
        ag.cjdx[82] = -777438416;
        ag.cjdx[83] = -1219417986;
        ag.cjdx[84] = 858361037;
        ag.cjdx[85] = -388189373;
        ag.cjdx[86] = -761174382;
        ag.cjdx[87] = 198302932;
        ag.cjdx[88] = -1170671279;
        ag.cjdx[89] = -1610199160;
        ag.cjdx[90] = 1470732335;
        ag.cjdx[91] = 659039506;
        ag.cjdx[92] = 2121941084;
        ag.cjdx[93] = 1854358206;
        ag.cjdx[94] = 2116350425;
        ag.cjdx[95] = 1586285849;
        ag.cjdx[96] = -972751392;
        ag.cjdx[97] = -1136963973;
        ag.cjdx[98] = -997644009;
        ag.cjdx[99] = 1011250868;
    }

    /*
     * Exception decompiling
     */
    public void load() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 27[SWITCH]
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
}

