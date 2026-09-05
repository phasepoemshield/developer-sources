/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import ruhack.phobia.jx;

public class kf
extends jx {
    public static final int b;
    public static final boolean a;
    private static int[] lihh;
    private static int[] lihg;
    private static long[] lihs;
    static final long tw = -1711351235603910040L;
    private List<String> list;
    private static long[] liht;
    public static final boolean c;
    private String value;

    static {
        lihg = new int[76];
        lihh = new int[76];
        kf.limo();
        kf.limp();
        lihs = new long[56];
        liht = new long[56];
        kf.limq();
        kf.limr();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kf visible(Supplier<Boolean> var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kf.tw - kf.lihi("lihu", lihr(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == kf.lihi("lihv", lihf(int ), (int)8)) break;
            v0 /* !! */  = (long)kf.lihi("lihw", lihf(int ), (int)9);
        }
        var4_2 = kf.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kf.tw - kf.lihi("lihx", lihr(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == kf.lihi("lihy", lihf(int ), (int)10)) break;
            v1 /* !! */  = (long)kf.lihi("lihz", lihf(int ), (int)11);
        }
        var3_3 /* !! */  = kf.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = kf.tw;
                if (true) ** GOTO lbl20
                block14: while (true) {
                    v2 /* !! */  = (long)(kf.lihi("liib", lihr(int ), (int)3) - kf.lihi("liia", lihr(int ), (int)2));
lbl20:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case 236874260: {
                            continue block14;
                        }
                        case 1273442920: {
                            break block14;
                        }
                    }
                    break;
                }
                var2_4 = kf.a;
                if (var4_2) {
                    throw null;
lbl28:
                    // 2 sources

                    return null;
                }
                if (var2_4 || var2_4) ** GOTO lbl28
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = kf.tw - kf.lihi("liic", lihr(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == kf.lihi("liid", lihf(int ), (int)12)) break;
                    v3 /* !! */  = (long)kf.lihi("liie", lihf(int ), (int)13);
                }
                this.setVisible(var1_1);
                if (var2_4 || var2_4) ** continue;
                return this;
            }
lbl39:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)kf.lihi("liif", lihf(int ), (int)14);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)kf.lihi("liig", lihf(int ), (int)15);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl54
                    break;
                }
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)kf.lihi("liih", lihf(int ), (int)16);
                } while (!var4_2);
                throw null;
            }
lbl54:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)kf.lihi("liii", lihf(int ), (int)17);
                if (!var4_2) break;
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)kf.lihi("liij", lihf(int ), (int)18);
                if (!var4_2) ** GOTO lbl39
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)kf.lihi("liik", lihf(int ), (int)19);
        ** while (!var4_2)
lbl65:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long lihr(int n2) {
        return lihs[n2] ^ liht[n2];
    }

    private static /* synthetic */ void limq() {
        kf.lihs[0] = 8801442367536447448L;
        kf.lihs[1] = 8270428921493525093L;
        kf.lihs[2] = -7735372431508062738L;
        kf.lihs[3] = 4964205873194014847L;
        kf.lihs[4] = -1439344347321104234L;
        kf.lihs[5] = -25849160562377105L;
        kf.lihs[6] = 6679282032040811811L;
        kf.lihs[7] = 4514393446865155120L;
        kf.lihs[8] = 1475502087544688761L;
        kf.lihs[9] = -8022353771648011540L;
        kf.lihs[10] = -2413817446595985004L;
        kf.lihs[11] = -6410876719319469165L;
        kf.lihs[12] = 8299723434463259947L;
        kf.lihs[13] = -4615391555298689941L;
        kf.lihs[14] = -8883394515659151168L;
        kf.lihs[15] = 4581192089309069250L;
        kf.lihs[16] = -8173582152365651946L;
        kf.lihs[17] = -5228901377198495487L;
        kf.lihs[18] = 6790785050482632531L;
        kf.lihs[19] = 1947824530036043555L;
        kf.lihs[20] = -6722354770840186323L;
        kf.lihs[21] = 5046940829118068776L;
        kf.lihs[22] = 2228902855348817107L;
        kf.lihs[23] = -6553747589951274168L;
        kf.lihs[24] = 3801085385611315632L;
        kf.lihs[25] = 3243867256198468713L;
        kf.lihs[26] = 7943416592329259921L;
        kf.lihs[27] = -6088553720958596669L;
        kf.lihs[28] = -1691827465449871335L;
        kf.lihs[29] = -5984536912361688538L;
        kf.lihs[30] = 2640448166997206861L;
        kf.lihs[31] = 3720409220843803777L;
        kf.lihs[32] = -2336168287654775956L;
        kf.lihs[33] = 1546094516558763603L;
        kf.lihs[34] = -5239926019203749005L;
        kf.lihs[35] = 6650004662915745254L;
        kf.lihs[36] = -6817470389431435475L;
        kf.lihs[37] = 3707778964818291837L;
        kf.lihs[38] = -5502024919571242125L;
        kf.lihs[39] = -4152596469933508060L;
        kf.lihs[40] = -6088467624606180319L;
        kf.lihs[41] = -6961545725996432475L;
        kf.lihs[42] = -8779421932823393466L;
        kf.lihs[43] = -7892871443760095282L;
        kf.lihs[44] = -2351065119660320285L;
        kf.lihs[45] = 7883385825758897825L;
        kf.lihs[46] = -127708724903867878L;
        kf.lihs[47] = -1214203897690892638L;
        kf.lihs[48] = -8201979600529856355L;
        kf.lihs[49] = -7431315153143644165L;
        kf.lihs[50] = 8902328216691159149L;
        kf.lihs[51] = 6253391577400991769L;
        kf.lihs[52] = -48088028625929201L;
        kf.lihs[53] = -6673235122323241048L;
        kf.lihs[54] = -6764029412686734983L;
        kf.lihs[55] = 7124124973017958943L;
    }

    private static /* synthetic */ int lihf(int n2) {
        return lihg[n2] ^ lihh[n2];
    }

    public static /* synthetic */ CallSite lihi(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setValue(String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kf.tw - kf.lihi("lilw", lihr(int ), (int)47)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kf.lihi("lilx", lihf(int ), (int)67)) break;
            v0 /* !! */  = (long)kf.lihi("lily", lihf(int ), (int)68);
        }
        var4_2 = kf.c;
        v1 /* !! */  = kf.tw;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - kf.lihi("lilz", lihr(int ), (int)48));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 788442482: {
                    v2 = kf.lihi("lima", lihr(int ), (int)49);
                    continue block19;
                }
                case 1014473399: {
                    v2 = kf.lihi("limb", lihr(int ), (int)50);
                    continue block19;
                }
                case 1273442920: {
                    break block19;
                }
            }
            break;
        }
        var3_3 /* !! */  = kf.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = kf.tw - kf.lihi("limc", lihr(int ), (int)51)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == kf.lihi("limd", lihf(int ), (int)69)) break;
            v3 /* !! */  = (long)kf.lihi("lime", lihf(int ), (int)70);
        }
        var2_4 = kf.a;
        if (var4_2) {
            throw null;
lbl31:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl31
        v4 /* !! */  = kf.tw;
        if (true) ** GOTO lbl38
        block22: while (true) {
            v4 /* !! */  = (long)(v5 - kf.lihi("limf", lihr(int ), (int)52));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 746917075: {
                    v5 = kf.lihi("limg", lihr(int ), (int)53);
                    continue block22;
                }
                case 1260462623: {
                    v5 = kf.lihi("limh", lihr(int ), (int)54);
                    continue block22;
                }
                case 1273442920: {
                    break block22;
                }
                case 1562853026: {
                    v5 = kf.lihi("limi", lihr(int ), (int)55);
                    continue block22;
                }
            }
            break;
        }
        this.value = var1_1;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl57:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)kf.lihi("limj", lihf(int ), (int)71);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)kf.lihi("limk", lihf(int ), (int)72);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl71
            }
            case 2: {
                var3_3 /* !! */  = (int)kf.lihi("liml", lihf(int ), (int)73);
                if (!var4_2) ** GOTO lbl57
                throw null;
            }
lbl71:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)kf.lihi("limm", lihf(int ), (int)74);
                if (!var4_2) ** GOTO lbl57
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)kf.lihi("limn", lihf(int ), (int)75);
        ** while (!var4_2)
lbl78:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kf(String var1_1, String var2_2, String var3_3, String ... var4_4) {
        var6_5 /* !! */  = kf.b;
        super(var1_1, var2_2);
        this.list = new ArrayList<String>(Arrays.asList(var4_4));
        this.value = var3_3;
        if (this.list.contains(var3_3)) ** GOTO lbl10
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.list.add((int)kf.lihi("lihj", lihf(int ), (int)0), var3_3);
lbl10:
                // 2 sources

                return;
            }
lbl11:
            // 2 sources

            case 0: {
                var6_5 /* !! */  = (int)kf.lihi("lihk", lihf(int ), (int)1);
                break;
            }
lbl14:
            // 2 sources

            case 1: {
                var6_5 /* !! */  = (int)kf.lihi("lihl", lihf(int ), (int)2);
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_5 /* !! */  = (int)kf.lihi("lihm", lihf(int ), (int)3);
                    ** GOTO lbl14
                    break;
                }
            }
lbl20:
            // 2 sources

            case 3: {
                var6_5 /* !! */  = (int)kf.lihi("lihn", lihf(int ), (int)4);
                ** GOTO lbl26
            }
            case 4: {
                var6_5 /* !! */  = (int)kf.lihi("liho", lihf(int ), (int)5);
                ** GOTO lbl11
            }
lbl26:
            // 2 sources

            case 5: {
                var6_5 /* !! */  = (int)kf.lihi("lihp", lihf(int ), (int)6);
                ** GOTO lbl20
            }
            case 6: 
        }
        var6_5 /* !! */  = (int)kf.lihi("lihq", lihf(int ), (int)7);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kf selected(String var1_1) {
        block49: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = kf.tw - kf.lihi("liil", lihr(int ), (int)5)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == kf.lihi("liim", lihf(int ), (int)20)) break;
                v0 /* !! */  = (long)kf.lihi("liin", lihf(int ), (int)21);
            }
            var4_2 = kf.c;
            v1 /* !! */  = kf.tw;
            if (true) ** GOTO lbl12
            block32: while (true) {
                v1 /* !! */  = (long)(kf.lihi("liip", lihr(int ), (int)7) - kf.lihi("liio", lihr(int ), (int)6));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -2038678572: {
                        continue block32;
                    }
                    case 1273442920: {
                        break block32;
                    }
                }
                break;
            }
            var3_3 /* !! */  = kf.b;
            v2 /* !! */  = kf.tw;
            if (true) ** GOTO lbl22
            block33: while (true) {
                v2 /* !! */  = (long)(v3 - kf.lihi("liiq", lihr(int ), (int)8));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -84336203: {
                        v3 = kf.lihi("liir", lihr(int ), (int)9);
                        continue block33;
                    }
                    case 1273442920: {
                        break block33;
                    }
                    case 1727316384: {
                        v3 = kf.lihi("liis", lihr(int ), (int)10);
                        continue block33;
                    }
                    case 1997489786: {
                        v3 = kf.lihi("liit", lihr(int ), (int)11);
                        continue block33;
                    }
                }
                break;
            }
            var2_4 = kf.a;
            if (var4_2) {
                throw null;
lbl37:
                // 5 sources

                return null;
            }
            if (var2_4 || var2_4) ** GOTO lbl37
            v4 /* !! */  = kf.tw;
            if (true) ** GOTO lbl44
            block35: while (true) {
                v4 /* !! */  = (long)(v5 - kf.lihi("liiu", lihr(int ), (int)12));
lbl44:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case 146470783: {
                        v5 = kf.lihi("liiv", lihr(int ), (int)13);
                        continue block35;
                    }
                    case 746125787: {
                        v5 = kf.lihi("liiw", lihr(int ), (int)14);
                        continue block35;
                    }
                    case 1273442920: {
                        break block35;
                    }
                }
                break;
            }
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_1 = kf.tw - kf.lihi("liix", lihr(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v6 /* !! */  == kf.lihi("liiy", lihf(int ), (int)22)) break;
                v6 /* !! */  = (long)kf.lihi("liiz", lihf(int ), (int)23);
            }
            if (!this.list.contains(var1_1)) break block49;
            if (var2_4 || var2_4) ** GOTO lbl37
            v7 /* !! */  = kf.tw;
            if (true) ** GOTO lbl65
            block37: while (true) {
                v7 /* !! */  = (long)(v8 - kf.lihi("lija", lihr(int ), (int)16));
lbl65:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -47667814: {
                        v8 = kf.lihi("lijb", lihr(int ), (int)17);
                        continue block37;
                    }
                    case 845938304: {
                        v8 = kf.lihi("lijc", lihr(int ), (int)18);
                        continue block37;
                    }
                    case 1273442920: {
                        break block37;
                    }
                }
                break;
            }
            this.value = var1_1;
            if (var2_4) ** GOTO lbl37
        }
        if (var2_4) ** GOTO lbl37
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return this;
            }
            case 0: {
                var3_3 /* !! */  = (int)kf.lihi("lijd", lihf(int ), (int)24);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl94
            }
lbl89:
            // 2 sources

            case 1: {
                do {
                    var3_3 /* !! */  = (int)kf.lihi("lije", lihf(int ), (int)25);
                } while (!var4_2);
                throw null;
            }
lbl94:
            // 4 sources

            case 2: {
                var3_3 /* !! */  = (int)kf.lihi("lijf", lihf(int ), (int)26);
                if (!var4_2) ** GOTO lbl89
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)kf.lihi("lijg", lihf(int ), (int)27);
                if (var4_2) {
                    throw null;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)kf.lihi("lijh", lihf(int ), (int)28);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl112
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)kf.lihi("liji", lihf(int ), (int)29);
                    if (!var4_2) ** GOTO lbl94
                    throw null;
                }
            }
lbl112:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)kf.lihi("lijj", lihf(int ), (int)30);
                if (var4_2) {
                    throw null;
                }
            }
            case 7: {
                var3_3 /* !! */  = (int)kf.lihi("lijk", lihf(int ), (int)31);
                if (!var4_2) ** GOTO lbl94
                throw null;
            }
            case 8: 
        }
        var3_3 /* !! */  = (int)kf.lihi("lijl", lihf(int ), (int)32);
        ** while (!var4_2)
lbl123:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isSelected(String var1_1) {
        v0 /* !! */  = kf.tw;
        if (true) ** GOTO lbl5
        block29: while (true) {
            v0 /* !! */  = (long)(kf.lihi("lijn", lihr(int ), (int)20) - kf.lihi("lijm", lihr(int ), (int)19));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1273442920: {
                    break block29;
                }
                case 1706743164: {
                    continue block29;
                }
            }
            break;
        }
        var4_2 = kf.c;
        v1 /* !! */  = kf.tw;
        if (true) ** GOTO lbl15
        block30: while (true) {
            v1 /* !! */  = (long)(v2 - kf.lihi("lijo", lihr(int ), (int)21));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 507590439: {
                    v2 = kf.lihi("lijp", lihr(int ), (int)22);
                    continue block30;
                }
                case 1273442920: {
                    break block30;
                }
                case 1885244956: {
                    v2 = kf.lihi("lijq", lihr(int ), (int)23);
                    continue block30;
                }
            }
            break;
        }
        var3_3 /* !! */  = kf.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = kf.tw - kf.lihi("lijr", lihr(int ), (int)24)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == kf.lihi("lijs", lihf(int ), (int)33)) break;
            v3 /* !! */  = (long)kf.lihi("lijt", lihf(int ), (int)34);
        }
        var2_4 = kf.a;
        if (var4_2) {
            throw null;
lbl34:
            // 4 sources

            return (boolean)kf.lihi("liju", lihf(int ), (int)35);
        }
        if (var2_4 || var2_4) ** GOTO lbl34
        v4 /* !! */  = kf.tw;
        if (true) ** GOTO lbl41
        block33: while (true) {
            v4 /* !! */  = (long)(v5 - kf.lihi("lijv", lihr(int ), (int)25));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2128352199: {
                    v5 = kf.lihi("lijw", lihr(int ), (int)26);
                    continue block33;
                }
                case 689689229: {
                    v5 = kf.lihi("lijx", lihr(int ), (int)27);
                    continue block33;
                }
                case 1273442920: {
                    break block33;
                }
            }
            break;
        }
        if (this.value == null) ** GOTO lbl76
        if (var2_4) ** GOTO lbl34
        v6 /* !! */  = kf.tw;
        if (true) ** GOTO lbl56
        block34: while (true) {
            v6 /* !! */  = (long)(kf.lihi("lijz", lihr(int ), (int)29) - kf.lihi("lijy", lihr(int ), (int)28));
lbl56:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -968242069: {
                    continue block34;
                }
                case 1273442920: {
                    break block34;
                }
            }
            break;
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_1 = kf.tw - kf.lihi("lika", lihr(int ), (int)30)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 /* !! */  == kf.lihi("likb", lihf(int ), (int)36)) break;
            v7 /* !! */  = (long)kf.lihi("likc", lihf(int ), (int)37);
        }
        if (!this.value.equals(var1_1)) ** GOTO lbl76
        if (var2_4) ** GOTO lbl34
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v8 = kf.lihi("likd", lihf(int ), (int)38);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl79
            }
lbl76:
            // 2 sources

            if (!var2_4 && !var2_4) ** break;
            ** continue;
            v8 = kf.lihi("like", lihf(int ), (int)39);
lbl79:
            // 2 sources

            return (boolean)v8;
            case 0: {
                var3_3 /* !! */  = (int)kf.lihi("likf", lihf(int ), (int)40);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl94
            }
            case 1: {
                var3_3 /* !! */  = (int)kf.lihi("likg", lihf(int ), (int)41);
                if (!var4_2) break;
                throw null;
            }
lbl89:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)kf.lihi("likh", lihf(int ), (int)42);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl104
            }
lbl94:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)kf.lihi("liki", lihf(int ), (int)43);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)kf.lihi("likj", lihf(int ), (int)44);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl104:
            // 3 sources

            case 5: {
                do {
                    var3_3 /* !! */  = (int)kf.lihi("likk", lihf(int ), (int)45);
                } while (!var4_2);
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)kf.lihi("likl", lihf(int ), (int)46);
                if (!var4_2) ** GOTO lbl89
                throw null;
            }
lbl113:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)kf.lihi("likm", lihf(int ), (int)47);
                if (!var4_2) ** GOTO lbl104
                throw null;
            }
            case 8: 
        }
        var3_3 /* !! */  = (int)kf.lihi("likn", lihf(int ), (int)48);
        ** while (!var4_2)
lbl120:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void limp() {
        kf.lihh[0] = -2015798735;
        kf.lihh[1] = -169961734;
        kf.lihh[2] = -248726399;
        kf.lihh[3] = -1264881571;
        kf.lihh[4] = 656722984;
        kf.lihh[5] = 1168674405;
        kf.lihh[6] = -1938668773;
        kf.lihh[7] = -610048473;
        kf.lihh[8] = 1085159116;
        kf.lihh[9] = 614042562;
        kf.lihh[10] = -1389126036;
        kf.lihh[11] = 1609408195;
        kf.lihh[12] = -372438782;
        kf.lihh[13] = 2053280212;
        kf.lihh[14] = -721460596;
        kf.lihh[15] = 593366629;
        kf.lihh[16] = 1203332216;
        kf.lihh[17] = -762185010;
        kf.lihh[18] = -1060178807;
        kf.lihh[19] = 1218175413;
        kf.lihh[20] = 2055783894;
        kf.lihh[21] = 1947223689;
        kf.lihh[22] = -722052375;
        kf.lihh[23] = -568322613;
        kf.lihh[24] = -417540165;
        kf.lihh[25] = -1655454690;
        kf.lihh[26] = -521669005;
        kf.lihh[27] = 564032022;
        kf.lihh[28] = 838253049;
        kf.lihh[29] = -2140280913;
        kf.lihh[30] = -753825181;
        kf.lihh[31] = 1600644847;
        kf.lihh[32] = -496407766;
        kf.lihh[33] = -1430026311;
        kf.lihh[34] = -1321055654;
        kf.lihh[35] = -640252121;
        kf.lihh[36] = -1133849910;
        kf.lihh[37] = -710410572;
        kf.lihh[38] = 1682929382;
        kf.lihh[39] = -566219259;
        kf.lihh[40] = -1640172082;
        kf.lihh[41] = 2029522279;
        kf.lihh[42] = -566169127;
        kf.lihh[43] = 126886747;
        kf.lihh[44] = -728311404;
        kf.lihh[45] = -1435743600;
        kf.lihh[46] = 1974105589;
        kf.lihh[47] = 316094769;
        kf.lihh[48] = 1210988381;
        kf.lihh[49] = -1161541674;
        kf.lihh[50] = -1235989994;
        kf.lihh[51] = -1530585091;
        kf.lihh[52] = -1487534068;
        kf.lihh[53] = 598913105;
        kf.lihh[54] = 779132853;
        kf.lihh[55] = -2134962226;
        kf.lihh[56] = -1972760821;
        kf.lihh[57] = 1237467437;
        kf.lihh[58] = 532102498;
        kf.lihh[59] = -1122075144;
        kf.lihh[60] = -747822709;
        kf.lihh[61] = -132868186;
        kf.lihh[62] = -997351484;
        kf.lihh[63] = -239510289;
        kf.lihh[64] = 410689292;
        kf.lihh[65] = -1601398623;
        kf.lihh[66] = -2067906838;
        kf.lihh[67] = -417826046;
        kf.lihh[68] = 292626335;
        kf.lihh[69] = -959651514;
        kf.lihh[70] = -1751990166;
        kf.lihh[71] = -59793902;
        kf.lihh[72] = -1771703919;
        kf.lihh[73] = -2116333907;
        kf.lihh[74] = -813230224;
        kf.lihh[75] = -106441610;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public List<String> getList() {
        while (true) {
            block31: {
                if ((v0 /* !! */  = (cfr_temp_1 = kf.tw - kf.lihi("lile", lihr(int ), (int)37)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  != kf.lihi("lilf", lihf(int ), (int)59)) break block31;
                var3_1 = kf.c;
                v1 /* !! */  = kf.tw;
                if (true) ** GOTO lbl13
            }
            v0 /* !! */  = (long)kf.lihi("lilg", lihf(int ), (int)60);
        }
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - kf.lihi("lilh", lihr(int ), (int)38));
lbl13:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1412440448: {
                    v2 = kf.lihi("lili", lihr(int ), (int)39);
                    continue block19;
                }
                case -492349965: {
                    v2 = kf.lihi("lilj", lihr(int ), (int)40);
                    continue block19;
                }
                case 1238481562: {
                    v2 = kf.lihi("lilk", lihr(int ), (int)41);
                    continue block19;
                }
                case 1273442920: {
                    break block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = kf.b;
        while (true) {
            block32: {
                if ((v3 /* !! */  = (cfr_temp_2 = kf.tw - kf.lihi("lill", lihr(int ), (int)42)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  != kf.lihi("lilm", lihf(int ), (int)61)) break block32;
                var1_3 = kf.a;
                if (var2_2 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v3 /* !! */  = (long)kf.lihi("liln", lihf(int ), (int)62);
        }
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var3_1) {
                        throw null;
                    }
                    if (var1_3 != false) return null;
                    if (var1_3 != false) return null;
                    v4 /* !! */  = kf.tw;
                    block22: while (true) {
                        switch ((int)v4 /* !! */ ) {
                            case -1525380986: {
                                v5 = kf.lihi("lilp", lihr(int ), (int)44);
                                ** GOTO lbl56
                            }
                            case -1081050582: {
                                v5 = kf.lihi("lilq", lihr(int ), (int)45);
                                ** GOTO lbl56
                            }
                            case 781862106: {
                                v5 = kf.lihi("lilr", lihr(int ), (int)46);
lbl56:
                                // 3 sources

                                v4 /* !! */  = (long)(v5 - kf.lihi("lilo", lihr(int ), (int)43));
                                continue block22;
                            }
                            case 1273442920: {
                                return this.list;
                            }
                        }
                        break;
                    }
                    return this.list;
                }
                case 3: {
                    var2_2 /* !! */  = (int)kf.lihi("lilv", lihf(int ), (int)66);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 0: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)kf.lihi("lils", lihf(int ), (int)63);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)kf.lihi("lilu", lihf(int ), (int)65);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: 
            }
            if (true) ** GOTO lbl78
            break;
        }
        do {
            if (true) ** continue;
lbl78:
            // 2 sources

            var2_2 /* !! */  = (int)kf.lihi("lilt", lihf(int ), (int)64);
            cfr_temp_0 = 0;
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void limo() {
        kf.lihg[0] = -2015798735;
        kf.lihg[1] = -169961734;
        kf.lihg[2] = -248726399;
        kf.lihg[3] = -1264881572;
        kf.lihg[4] = 656722984;
        kf.lihg[5] = 1168674404;
        kf.lihg[6] = -1938668769;
        kf.lihg[7] = -610048474;
        kf.lihg[8] = 1085159117;
        kf.lihg[9] = 760237686;
        kf.lihg[10] = 1389126035;
        kf.lihg[11] = 1781417983;
        kf.lihg[12] = 372438781;
        kf.lihg[13] = -1265437797;
        kf.lihg[14] = -721460600;
        kf.lihg[15] = 593366625;
        kf.lihg[16] = 1203332221;
        kf.lihg[17] = -762185012;
        kf.lihg[18] = -1060178803;
        kf.lihg[19] = 1218175408;
        kf.lihg[20] = 2055783895;
        kf.lihg[21] = -1032720930;
        kf.lihg[22] = 722052374;
        kf.lihg[23] = -1228377963;
        kf.lihg[24] = -417540165;
        kf.lihg[25] = -1655454692;
        kf.lihg[26] = -521669003;
        kf.lihg[27] = 564032020;
        kf.lihg[28] = 838253053;
        kf.lihg[29] = -2140280921;
        kf.lihg[30] = -753825177;
        kf.lihg[31] = 1600644839;
        kf.lihg[32] = -496407763;
        kf.lihg[33] = -1430026312;
        kf.lihg[34] = -1665650637;
        kf.lihg[35] = -640252121;
        kf.lihg[36] = -1133849909;
        kf.lihg[37] = -455254499;
        kf.lihg[38] = 1682929383;
        kf.lihg[39] = -566219259;
        kf.lihg[40] = -1640172082;
        kf.lihg[41] = 2029522277;
        kf.lihg[42] = -566169123;
        kf.lihg[43] = 126886751;
        kf.lihg[44] = -728311405;
        kf.lihg[45] = -1435743598;
        kf.lihg[46] = 1974105584;
        kf.lihg[47] = 316094775;
        kf.lihg[48] = 1210988376;
        kf.lihg[49] = -1161541673;
        kf.lihg[50] = 374875801;
        kf.lihg[51] = -1530585092;
        kf.lihg[52] = -1986296955;
        kf.lihg[53] = 598913104;
        kf.lihg[54] = -790968419;
        kf.lihg[55] = -2134962225;
        kf.lihg[56] = -1972760821;
        kf.lihg[57] = 1237467439;
        kf.lihg[58] = 532102497;
        kf.lihg[59] = 1122075143;
        kf.lihg[60] = -959014362;
        kf.lihg[61] = 132868185;
        kf.lihg[62] = -1370334052;
        kf.lihg[63] = -239510289;
        kf.lihg[64] = 410689294;
        kf.lihg[65] = -1601398621;
        kf.lihg[66] = -2067906837;
        kf.lihg[67] = -417826045;
        kf.lihg[68] = -1071641092;
        kf.lihg[69] = -959651513;
        kf.lihg[70] = -2132886184;
        kf.lihg[71] = -59793903;
        kf.lihg[72] = -1771703917;
        kf.lihg[73] = -2116333911;
        kf.lihg[74] = -813230222;
        kf.lihg[75] = -106441611;
    }

    private static /* synthetic */ void limr() {
        kf.liht[0] = -2510822219229958068L;
        kf.liht[1] = 44675952993275986L;
        kf.liht[2] = -8256947972458640588L;
        kf.liht[3] = -6662931356253536309L;
        kf.liht[4] = -2322833471548983048L;
        kf.liht[5] = 8582264288414980457L;
        kf.liht[6] = 4974786596281402420L;
        kf.liht[7] = 1995017743160997148L;
        kf.liht[8] = 3214826068701881831L;
        kf.liht[9] = -815517002702491461L;
        kf.liht[10] = -4279390603661522180L;
        kf.liht[11] = -2999868374246399628L;
        kf.liht[12] = -982128908004608893L;
        kf.liht[13] = 8275424003301004557L;
        kf.liht[14] = 5352721563064386614L;
        kf.liht[15] = 2777365724577372983L;
        kf.liht[16] = -7514173427029102333L;
        kf.liht[17] = 8433060905222216073L;
        kf.liht[18] = -1245079557795745899L;
        kf.liht[19] = -876501879775926111L;
        kf.liht[20] = 6165498475705611436L;
        kf.liht[21] = -356121977631559897L;
        kf.liht[22] = 486519998036881560L;
        kf.liht[23] = 3672889483408781853L;
        kf.liht[24] = -8273156251303220300L;
        kf.liht[25] = -5396647658177351425L;
        kf.liht[26] = 5838503682572138111L;
        kf.liht[27] = 3704869136076006647L;
        kf.liht[28] = 2938684866109718350L;
        kf.liht[29] = -6162659121100672184L;
        kf.liht[30] = -4286413853035753141L;
        kf.liht[31] = 1137736367369810005L;
        kf.liht[32] = -8796719329944876244L;
        kf.liht[33] = 4515694511117053920L;
        kf.liht[34] = 587263375678444018L;
        kf.liht[35] = -8780368361825483286L;
        kf.liht[36] = 2418241726608129350L;
        kf.liht[37] = 2898849792923050552L;
        kf.liht[38] = 6342285282370685742L;
        kf.liht[39] = -718727960630438193L;
        kf.liht[40] = 2661559334329834315L;
        kf.liht[41] = 8325716389914297401L;
        kf.liht[42] = -2803836935312455977L;
        kf.liht[43] = -1608206501631736541L;
        kf.liht[44] = 2027203372352898336L;
        kf.liht[45] = 5991010896656207599L;
        kf.liht[46] = 5869353068182090934L;
        kf.liht[47] = 7789904954973886786L;
        kf.liht[48] = -6199934287161771149L;
        kf.liht[49] = 7272467088050523647L;
        kf.liht[50] = 4135003057805573375L;
        kf.liht[51] = -4044232080593910661L;
        kf.liht[52] = 5348519523825435921L;
        kf.liht[53] = 3053561762553805628L;
        kf.liht[54] = -7708196779143537204L;
        kf.liht[55] = 575742377233905704L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public String getValue() {
        boolean bl2;
        Object object = tw;
        boolean bl3 = true;
        block5: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - kf.lihi("liko", lihr(int ), (int)31);
            }
            switch ((int)object) {
                case 1273442920: {
                    break block5;
                }
                case 1902216240: {
                    callSite = kf.lihi("likp", lihr(int ), (int)32);
                    continue block5;
                }
                case 2006805266: {
                    callSite = kf.lihi("likq", lihr(int ), (int)33);
                    continue block5;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = tw - kf.lihi("likr", lihr(int ), (int)34)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == kf.lihi("liks", lihf(int ), (int)49)) break;
            object2 = kf.lihi("likt", lihf(int ), (int)50);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = tw - kf.lihi("liku", lihr(int ), (int)35)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == kf.lihi("likv", lihf(int ), (int)51)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = kf.lihi("likw", lihf(int ), (int)52);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l4;
            Object object4;
            if ((object4 = (l4 = tw - kf.lihi("likx", lihr(int ), (int)36)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object4 == kf.lihi("liky", lihf(int ), (int)53)) {
                return this.value;
            }
            object4 = kf.lihi("likz", lihf(int ), (int)54);
        }
    }
}

