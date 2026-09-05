/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_3532
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.minecraft.class_3532;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.gk$Palette;
import ruhack.phobia.jx;
import ruhack.phobia.kf;
import ruhack.phobia.nd;
import ruhack.phobia.nj;
import ruhack.phobia.ol;

public final class gk
extends ds {
    private static long[] eblg;
    public static final int b;
    public static final boolean c;
    private static final Map<String, String> LEGACY_THEMES;
    private static int[] ebkx;
    private static int[] ebkw;
    private static final String DEFAULT_NAME = "JShine";
    private static long[] eblf;
    private static final Map<String, gk$Palette> PALETTES_BY_NAME;
    public final kf color;
    protected static final long ki = 980854539067614680L;
    public static final boolean a;
    private static final List<gk$Palette> PALETTES;

    private static /* synthetic */ void eckv() {
        gk.eblf[100] = -3664722310005670787L;
        gk.eblf[101] = 3224206587208347225L;
        gk.eblf[102] = 801625442438753878L;
        gk.eblf[103] = 2800709469249576062L;
        gk.eblf[104] = -5039732608769344267L;
        gk.eblf[105] = 1534601419866889449L;
        gk.eblf[106] = 4752210315721625590L;
        gk.eblf[107] = -8220623985067974998L;
        gk.eblf[108] = 7884663058180413493L;
        gk.eblf[109] = 5429891798093304134L;
        gk.eblf[110] = -296259204910967715L;
        gk.eblf[111] = -2075916742912639912L;
        gk.eblf[112] = -4930009184916306708L;
        gk.eblf[113] = 5207325242941516874L;
        gk.eblf[114] = -1816861619442169808L;
        gk.eblf[115] = 8539512106660959884L;
        gk.eblf[116] = -8411584721259750135L;
        gk.eblf[117] = -6944417609316230027L;
        gk.eblf[118] = -3207325699845604810L;
        gk.eblf[119] = 7032648905698496174L;
        gk.eblf[120] = -1833944962713967122L;
        gk.eblf[121] = -4040329470538329666L;
        gk.eblf[122] = 4035866659200465934L;
        gk.eblf[123] = 8709476378359944549L;
        gk.eblf[124] = -4101995349608987639L;
        gk.eblf[125] = 3673680069091261218L;
        gk.eblf[126] = -9170377026788970073L;
        gk.eblf[127] = 1957548258622546631L;
        gk.eblf[128] = -4377924179757432551L;
        gk.eblf[129] = -3864495729847561868L;
        gk.eblf[130] = -4224751907788417094L;
        gk.eblf[131] = -8141873168539244520L;
        gk.eblf[132] = 8906010018917364161L;
        gk.eblf[133] = -2059124052333778691L;
        gk.eblf[134] = 4237063228815370120L;
        gk.eblf[135] = 1277709740278486989L;
        gk.eblf[136] = -5519291084977127097L;
        gk.eblf[137] = -4300345852001872884L;
        gk.eblf[138] = -4841016583519807972L;
        gk.eblf[139] = -1103514381254569075L;
        gk.eblf[140] = 3613102951397519255L;
        gk.eblf[141] = -2566169147883064069L;
        gk.eblf[142] = 7841621653789570648L;
        gk.eblf[143] = -1371621704626202014L;
        gk.eblf[144] = 1321289890164602684L;
        gk.eblf[145] = -1616180232773442536L;
        gk.eblf[146] = -6303437705314075231L;
        gk.eblf[147] = 9171898797985612321L;
        gk.eblf[148] = 6924590345978031443L;
        gk.eblf[149] = 4567752341682160538L;
        gk.eblf[150] = -9015408478959346800L;
        gk.eblf[151] = 2049851332470601011L;
        gk.eblf[152] = 1157401599273261838L;
        gk.eblf[153] = 3266243708739824949L;
        gk.eblf[154] = -6894417980710276039L;
        gk.eblf[155] = -5959426502855180210L;
        gk.eblf[156] = -5336399138634600515L;
        gk.eblf[157] = -7395509678125560070L;
        gk.eblf[158] = -5239901417013098283L;
        gk.eblf[159] = -2906739998513481154L;
        gk.eblf[160] = 6587404420297732365L;
        gk.eblf[161] = -8942119051484080753L;
        gk.eblf[162] = 1493288377185193903L;
        gk.eblf[163] = 7003050746177137614L;
        gk.eblf[164] = -6322830643920955840L;
        gk.eblf[165] = -1676128252114270960L;
        gk.eblf[166] = -5576920402911270565L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ gk$Palette lambda$static$0(gk$Palette var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gk.ki - gk.ebky("ecgj", eble(int ), (int)164)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gk.ebky("ecgk", ebkv(int ), (int)186)) break;
            v0 /* !! */  = (long)gk.ebky("ecgl", ebkv(int ), (int)187);
        }
        var3_1 = gk.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gk.ki - gk.ebky("ecgn", eble(int ), (int)165)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gk.ebky("ecgr", ebkv(int ), (int)188)) break;
            v1 /* !! */  = (long)gk.ebky("ecgt", ebkv(int ), (int)189);
        }
        var2_2 /* !! */  = gk.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = gk.ki - gk.ebky("ecgv", eble(int ), (int)166)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gk.ebky("ecgw", ebkv(int ), (int)190)) break;
            v2 /* !! */  = (long)gk.ebky("ecgx", ebkv(int ), (int)191);
        }
        var1_3 = gk.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                return var0;
            }
lbl32:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)gk.ebky("eche", ebkv(int ), (int)192);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)gk.ebky("echf", ebkv(int ), (int)193);
                if (!var3_1) ** GOTO lbl32
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)gk.ebky("echg", ebkv(int ), (int)194);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)gk.ebky("echh", ebkv(int ), (int)195);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ float ebnv(int n2) {
        return Float.intBitsToFloat(ebkw[n2] ^ ebkx[n2]);
    }

    public static /* synthetic */ CallSite ebky(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String[] lambda$new$1(int var0) {
        v0 /* !! */  = gk.ki;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - gk.ebky("ecfi", eble(int ), (int)156));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1451989544: {
                    break block17;
                }
                case -1402442560: {
                    v1 = gk.ebky("ecfj", eble(int ), (int)157);
                    continue block17;
                }
                case 455724247: {
                    v1 = gk.ebky("ecfk", eble(int ), (int)158);
                    continue block17;
                }
            }
            break;
        }
        var3_1 = gk.c;
        v2 /* !! */  = gk.ki;
        if (true) ** GOTO lbl19
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - gk.ebky("ecfm", eble(int ), (int)159));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1451989544: {
                    break block18;
                }
                case -545490639: {
                    v3 = gk.ebky("ecfp", eble(int ), (int)160);
                    continue block18;
                }
                case -222378696: {
                    v3 = gk.ebky("ecft", eble(int ), (int)161);
                    continue block18;
                }
                case 881758655: {
                    v3 = gk.ebky("ecfu", eble(int ), (int)162);
                    continue block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = gk.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = gk.ki - gk.ebky("ecfv", eble(int ), (int)163)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == gk.ebky("ecfw", ebkv(int ), (int)180)) break;
                    v4 /* !! */  = (long)gk.ebky("ecfx", ebkv(int ), (int)181);
                }
                var1_3 = gk.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                return new String[var0];
            }
lbl48:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)gk.ebky("ecga", ebkv(int ), (int)182);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)gk.ebky("ecgg", ebkv(int ), (int)183);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)gk.ebky("ecgh", ebkv(int ), (int)184);
                if (!var3_1) ** GOTO lbl48
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)gk.ebky("ecgi", ebkv(int ), (int)185);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static gk$Palette palette(String var0, String ... var1_1) {
        v0 /* !! */  = gk.ki;
        if (true) ** GOTO lbl5
        block45: while (true) {
            v0 /* !! */  = (long)(gk.ebky("ecch", eble(int ), (int)131) - gk.ebky("ecce", eble(int ), (int)130));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1451989544: {
                    break block45;
                }
                case 611706535: {
                    continue block45;
                }
            }
            break;
        }
        var6_2 = gk.c;
        v1 /* !! */  = gk.ki;
        if (true) ** GOTO lbl15
        block46: while (true) {
            v1 /* !! */  = (long)(v2 - gk.ebky("ecci", eble(int ), (int)132));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2068983491: {
                    v2 = gk.ebky("ecck", eble(int ), (int)133);
                    continue block46;
                }
                case -1451989544: {
                    break block46;
                }
                case 473286655: {
                    v2 = gk.ebky("eccl", eble(int ), (int)134);
                    continue block46;
                }
                case 2056291628: {
                    v2 = gk.ebky("eccm", eble(int ), (int)135);
                    continue block46;
                }
            }
            break;
        }
        var5_3 /* !! */  = gk.b;
        v3 /* !! */  = gk.ki;
        if (true) ** GOTO lbl32
        block47: while (true) {
            v3 /* !! */  = (long)(v4 - gk.ebky("eccn", eble(int ), (int)136));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1451989544: {
                    break block47;
                }
                case -1108710264: {
                    v4 = gk.ebky("ecco", eble(int ), (int)137);
                    continue block47;
                }
                case -458389001: {
                    v4 = gk.ebky("eccp", eble(int ), (int)138);
                    continue block47;
                }
                case 1190291278: {
                    v4 = gk.ebky("eccq", eble(int ), (int)139);
                    continue block47;
                }
            }
            break;
        }
        var4_4 = gk.a;
        if (var6_2) {
            throw null;
lbl47:
            // 8 sources

            return null;
        }
        if (var4_4 || var4_4) ** GOTO lbl47
        var2_5 = new int[var1_1.length];
        if (var4_4 || var4_4) ** GOTO lbl47
        var3_6 = gk.ebky("eccs", ebkv(int ), (int)153);
        if (var4_4) ** GOTO lbl47
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                do {
                    if (var4_4 || var4_4) ** GOTO lbl47
                    if (var3_6 >= var1_1.length) ** GOTO lbl77
                    if (var4_4 || var4_4) ** GOTO lbl47
                    v5 = var1_1[var3_6];
                    v6 /* !! */  = gk.ki;
                    if (true) ** GOTO lbl66
                    block50: while (true) {
                        v6 /* !! */  = (long)(gk.ebky("eccw", eble(int ), (int)141) - gk.ebky("eccu", eble(int ), (int)140));
lbl66:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case -1451989544: {
                                break block50;
                            }
                            case 689388771: {
                                continue block50;
                            }
                        }
                        break;
                    }
                    var2_5[var3_6] = nd.toColor(v5);
                    if (var4_4 || var4_4) ** GOTO lbl47
                    ++var3_6;
                    if (var4_4) ** GOTO lbl47
                } while (!var6_2);
                throw null;
lbl77:
                // 1 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_0 = gk.ki - gk.ebky("eccy", eble(int ), (int)142)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == gk.ebky("eccz", ebkv(int ), (int)154)) break;
                    v7 /* !! */  = (long)gk.ebky("ecdd", ebkv(int ), (int)155);
                }
                v8 /* !! */  = gk.ki;
                if (true) ** GOTO lbl89
                block52: while (true) {
                    v8 /* !! */  = (long)(v9 - gk.ebky("ecde", eble(int ), (int)143));
lbl89:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1604127435: {
                            v9 = gk.ebky("ecdf", eble(int ), (int)144);
                            continue block52;
                        }
                        case -1601206618: {
                            v9 = gk.ebky("ecdg", eble(int ), (int)145);
                            continue block52;
                        }
                        case -1451989544: {
                            break block52;
                        }
                        case 1332663320: {
                            v9 = gk.ebky("ecdh", eble(int ), (int)146);
                            continue block52;
                        }
                    }
                    break;
                }
                return new gk$Palette(var0, var2_5);
            }
lbl102:
            // 3 sources

            case 0: {
                do {
                    var5_3 /* !! */  = (int)gk.ebky("ecdi", ebkv(int ), (int)156);
                } while (!var6_2);
                throw null;
            }
lbl107:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)gk.ebky("ecdl", ebkv(int ), (int)157);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl151
            }
            case 2: {
                do {
                    var5_3 /* !! */  = (int)gk.ebky("ecdm", ebkv(int ), (int)158);
                } while (!var6_2);
                throw null;
            }
            case 3: {
                var5_3 /* !! */  = (int)gk.ebky("ecdn", ebkv(int ), (int)159);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl132
            }
            case 4: {
                var5_3 /* !! */  = (int)gk.ebky("ecdo", ebkv(int ), (int)160);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl127:
            // 3 sources

            case 5: {
                var5_3 /* !! */  = (int)gk.ebky("ecdq", ebkv(int ), (int)161);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl132:
            // 2 sources

            case 6: {
                var5_3 /* !! */  = (int)gk.ebky("ecdt", ebkv(int ), (int)162);
                if (!var6_2) ** GOTO lbl127
                throw null;
            }
            case 7: {
                var5_3 /* !! */  = (int)gk.ebky("ecdu", ebkv(int ), (int)163);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 8: {
                var5_3 /* !! */  = (int)gk.ebky("ecdv", ebkv(int ), (int)164);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl160
            }
            case 9: {
                do {
                    var5_3 /* !! */  = (int)gk.ebky("ecdw", ebkv(int ), (int)165);
                } while (!var6_2);
                throw null;
            }
lbl151:
            // 3 sources

            case 10: {
                do {
                    var5_3 /* !! */  = (int)gk.ebky("ecdx", ebkv(int ), (int)166);
                } while (!var6_2);
                throw null;
            }
            case 11: {
                var5_3 /* !! */  = (int)gk.ebky("ecdy", ebkv(int ), (int)167);
                if (!var6_2) ** GOTO lbl102
                throw null;
            }
lbl160:
            // 3 sources

            case 12: {
                var5_3 /* !! */  = (int)gk.ebky("ecec", ebkv(int ), (int)168);
                if (!var6_2) ** GOTO lbl127
                throw null;
            }
lbl164:
            // 3 sources

            case 13: {
                var5_3 /* !! */  = (int)gk.ebky("ecee", ebkv(int ), (int)169);
                if (!var6_2) ** GOTO lbl151
                throw null;
            }
            case 14: {
                var5_3 /* !! */  = (int)gk.ebky("eceg", ebkv(int ), (int)170);
                if (!var6_2) ** GOTO lbl107
                throw null;
            }
            case 15: {
                var5_3 /* !! */  = (int)gk.ebky("eceh", ebkv(int ), (int)171);
                if (!var6_2) ** GOTO lbl102
                throw null;
            }
            case 16: 
        }
        do {
            var5_3 /* !! */  = (int)gk.ebky("ecei", ebkv(int ), (int)172);
        } while (!var6_2);
        throw null;
    }

    private static /* synthetic */ void eckk() {
        gk.eblf[0] = 2960694845384542085L;
        gk.eblf[1] = 3309657107665320439L;
        gk.eblf[2] = 5925028233228965653L;
        gk.eblf[3] = -8968669747336235856L;
        gk.eblf[4] = 2827099102823964195L;
        gk.eblf[5] = 3974425947005103821L;
        gk.eblf[6] = -4884917868145497105L;
        gk.eblf[7] = -9223177418247970615L;
        gk.eblf[8] = -2566647359498188664L;
        gk.eblf[9] = -4022589287079522448L;
        gk.eblf[10] = -8538495197133353656L;
        gk.eblf[11] = -1259628251747835880L;
        gk.eblf[12] = 5687415943163627709L;
        gk.eblf[13] = -6575181800459742719L;
        gk.eblf[14] = -3941031733589420356L;
        gk.eblf[15] = 3514004374927758518L;
        gk.eblf[16] = 4816825852757055685L;
        gk.eblf[17] = 5344607553909359434L;
        gk.eblf[18] = 8952951436732085494L;
        gk.eblf[19] = 5714297885351295207L;
        gk.eblf[20] = -2431927547744108225L;
        gk.eblf[21] = 4621772350323439486L;
        gk.eblf[22] = 4813703804128106665L;
        gk.eblf[23] = -709235634116414063L;
        gk.eblf[24] = -4059495877637650359L;
        gk.eblf[25] = -7874245460343684505L;
        gk.eblf[26] = -3152200451523596006L;
        gk.eblf[27] = 7766021219783588368L;
        gk.eblf[28] = 5255642953591267768L;
        gk.eblf[29] = 1288293406923485353L;
        gk.eblf[30] = 655194832593998223L;
        gk.eblf[31] = -5133973536678171391L;
        gk.eblf[32] = 317753245114575472L;
        gk.eblf[33] = 2111956679425149981L;
        gk.eblf[34] = 7113443801862427609L;
        gk.eblf[35] = 5732462796247497115L;
        gk.eblf[36] = 4860660250614076392L;
        gk.eblf[37] = -8976294837630188757L;
        gk.eblf[38] = 1357759295514944496L;
        gk.eblf[39] = -5036585797418063180L;
        gk.eblf[40] = 5573860094054746340L;
        gk.eblf[41] = 3863260901504656230L;
        gk.eblf[42] = 2649508314364037827L;
        gk.eblf[43] = -6999528909801888562L;
        gk.eblf[44] = 2679281502315859847L;
        gk.eblf[45] = 6156874870359246051L;
        gk.eblf[46] = 346507088095831822L;
        gk.eblf[47] = 3573980315999418722L;
        gk.eblf[48] = -148776007611264077L;
        gk.eblf[49] = 1704630988830983613L;
        gk.eblf[50] = 6985902931823017964L;
        gk.eblf[51] = 9022742163232648178L;
        gk.eblf[52] = 2949818029024361323L;
        gk.eblf[53] = -4638035312005780191L;
        gk.eblf[54] = -5301907071998991735L;
        gk.eblf[55] = -4147920147503184498L;
        gk.eblf[56] = 6047891742419187251L;
        gk.eblf[57] = -4698621830999762992L;
        gk.eblf[58] = 3248185024431667774L;
        gk.eblf[59] = 6588833874385359658L;
        gk.eblf[60] = 1285759089825242954L;
        gk.eblf[61] = 662686285705387767L;
        gk.eblf[62] = 6155044935228654859L;
        gk.eblf[63] = 8612404833003922528L;
        gk.eblf[64] = 7719256978496526753L;
        gk.eblf[65] = -2016229984982666727L;
        gk.eblf[66] = 5967923559454908929L;
        gk.eblf[67] = -5588073485676782738L;
        gk.eblf[68] = 1013786628624081325L;
        gk.eblf[69] = 5357659140333505595L;
        gk.eblf[70] = -6113883344170227675L;
        gk.eblf[71] = -4779673988424869187L;
        gk.eblf[72] = -8004116127801131196L;
        gk.eblf[73] = -1141054407242821901L;
        gk.eblf[74] = 7161535251831911698L;
        gk.eblf[75] = -7774720819723880028L;
        gk.eblf[76] = -4086190230164242249L;
        gk.eblf[77] = -7212163146423774078L;
        gk.eblf[78] = 6715260779661746710L;
        gk.eblf[79] = -4289632885050658432L;
        gk.eblf[80] = 8782129287656946645L;
        gk.eblf[81] = 3038556083424965496L;
        gk.eblf[82] = -3852156683420055342L;
        gk.eblf[83] = -8866695112734067868L;
        gk.eblf[84] = -2088033604582695878L;
        gk.eblf[85] = -630686656635647826L;
        gk.eblf[86] = 1686591187065015408L;
        gk.eblf[87] = 7601535621646200548L;
        gk.eblf[88] = -1954500109310217971L;
        gk.eblf[89] = 3091139714271552238L;
        gk.eblf[90] = 7184198220445456968L;
        gk.eblf[91] = 2965312592027912295L;
        gk.eblf[92] = -3012667412086299061L;
        gk.eblf[93] = 4052469162473878591L;
        gk.eblf[94] = -6523026955337810175L;
        gk.eblf[95] = 5424309244404094347L;
        gk.eblf[96] = 55223960187061230L;
        gk.eblf[97] = 5338128165756678531L;
        gk.eblf[98] = 4919645762711624641L;
        gk.eblf[99] = 2143914768634148291L;
    }

    private static /* synthetic */ void eclt() {
        gk.eblg[100] = 2704772468921631040L;
        gk.eblg[101] = 8416710577046928415L;
        gk.eblg[102] = -6616762518608601372L;
        gk.eblg[103] = -1946265655545615528L;
        gk.eblg[104] = 2263950241629260970L;
        gk.eblg[105] = -712765766942047712L;
        gk.eblg[106] = 4190280110885168153L;
        gk.eblg[107] = 4341822035819838388L;
        gk.eblg[108] = -7859962971598124221L;
        gk.eblg[109] = 3141481818749646706L;
        gk.eblg[110] = -6555811427711912333L;
        gk.eblg[111] = 8799548799614687291L;
        gk.eblg[112] = 5897275667093409405L;
        gk.eblg[113] = -8323322147191525271L;
        gk.eblg[114] = 5276630211941937902L;
        gk.eblg[115] = -2383138742912347508L;
        gk.eblg[116] = -233080203012403750L;
        gk.eblg[117] = -5872282682028981159L;
        gk.eblg[118] = 4889744502803835777L;
        gk.eblg[119] = 5863051993276752879L;
        gk.eblg[120] = -6334572230165390214L;
        gk.eblg[121] = -162426826039863281L;
        gk.eblg[122] = 3993425765479697787L;
        gk.eblg[123] = 3991795367234721814L;
        gk.eblg[124] = -1482329793067181138L;
        gk.eblg[125] = 1940799014794722087L;
        gk.eblg[126] = -7480328991328722780L;
        gk.eblg[127] = 2074101856564602685L;
        gk.eblg[128] = -6020168781567604344L;
        gk.eblg[129] = 2675733574367501543L;
        gk.eblg[130] = -5732532923602557318L;
        gk.eblg[131] = 7681181565136996509L;
        gk.eblg[132] = 4341676021332739535L;
        gk.eblg[133] = -568325778891431170L;
        gk.eblg[134] = 8058540033209231065L;
        gk.eblg[135] = 199995143411501930L;
        gk.eblg[136] = -3571760665046192033L;
        gk.eblg[137] = 761099577458972234L;
        gk.eblg[138] = -2801367566699849638L;
        gk.eblg[139] = 776408141624158558L;
        gk.eblg[140] = -413669202676326602L;
        gk.eblg[141] = 1994727328379276655L;
        gk.eblg[142] = 15825655177258596L;
        gk.eblg[143] = -8088280977743802348L;
        gk.eblg[144] = -432765105801393074L;
        gk.eblg[145] = -2989655658935865226L;
        gk.eblg[146] = -2239555665537895506L;
        gk.eblg[147] = 6271716432560663291L;
        gk.eblg[148] = -632524223837092384L;
        gk.eblg[149] = -7863934718700416697L;
        gk.eblg[150] = -462985449618418820L;
        gk.eblg[151] = -1118171848527804067L;
        gk.eblg[152] = -6846401260282362579L;
        gk.eblg[153] = -3641356816202771860L;
        gk.eblg[154] = -3461860515059508548L;
        gk.eblg[155] = -4990978921240385536L;
        gk.eblg[156] = 883340436746832791L;
        gk.eblg[157] = 2946499866827076101L;
        gk.eblg[158] = -2146961214746726293L;
        gk.eblg[159] = -4274022528254504029L;
        gk.eblg[160] = -7796766948335278271L;
        gk.eblg[161] = -5501969159932899442L;
        gk.eblg[162] = 5284217902220229130L;
        gk.eblg[163] = -3707465334391565604L;
        gk.eblg[164] = 8533710959990195831L;
        gk.eblg[165] = -2970268395466339791L;
        gk.eblg[166] = -949237129672346638L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List<gk$Palette> palettes() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gk.ki - gk.ebky("ebuc", eble(int ), (int)72)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gk.ebky("ebui", ebkv(int ), (int)71)) break;
            v0 /* !! */  = (long)gk.ebky("ebuk", ebkv(int ), (int)72);
        }
        var3_1 = gk.c;
        v1 /* !! */  = gk.ki;
        if (true) ** GOTO lbl12
        block21: while (true) {
            v1 /* !! */  = (long)(gk.ebky("ebum", eble(int ), (int)74) - gk.ebky("ebul", eble(int ), (int)73));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1451989544: {
                    break block21;
                }
                case -71295862: {
                    continue block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = gk.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = gk.ki;
                if (true) ** GOTO lbl25
                block22: while (true) {
                    v2 /* !! */  = (long)(gk.ebky("ebuo", eble(int ), (int)76) - gk.ebky("ebun", eble(int ), (int)75));
lbl25:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -2058399273: {
                            continue block22;
                        }
                        case -1451989544: {
                            break block22;
                        }
                    }
                    break;
                }
                var1_3 = gk.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = gk.ki;
                if (true) ** GOTO lbl40
                block24: while (true) {
                    v3 /* !! */  = (long)(v4 - gk.ebky("ebut", eble(int ), (int)77));
lbl40:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1451989544: {
                            break block24;
                        }
                        case -1002807135: {
                            v4 = gk.ebky("ebuv", eble(int ), (int)78);
                            continue block24;
                        }
                        case 1339242233: {
                            v4 = gk.ebky("ebuw", eble(int ), (int)79);
                            continue block24;
                        }
                        case 1506997619: {
                            v4 = gk.ebky("ebux", eble(int ), (int)80);
                            continue block24;
                        }
                    }
                    break;
                }
                return gk.PALETTES;
            }
lbl53:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)gk.ebky("ebuz", ebkv(int ), (int)73);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl63
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)gk.ebky("ebva", ebkv(int ), (int)74);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl63:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)gk.ebky("ebvc", ebkv(int ), (int)75);
                if (!var3_1) ** GOTO lbl53
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)gk.ebky("ebvd", ebkv(int ), (int)76);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ecld() {
        gk.eblg[0] = -8686822024628284610L;
        gk.eblg[1] = 2323870442623344874L;
        gk.eblg[2] = -5955639416132288482L;
        gk.eblg[3] = -7422794546056758716L;
        gk.eblg[4] = -3168161953350858434L;
        gk.eblg[5] = -5489779590716210052L;
        gk.eblg[6] = -8017242303679472168L;
        gk.eblg[7] = -1986871709309578671L;
        gk.eblg[8] = 1916054864137777757L;
        gk.eblg[9] = -3067348026799181889L;
        gk.eblg[10] = -9161315541521951950L;
        gk.eblg[11] = 8662088414677807042L;
        gk.eblg[12] = -9090615506446616574L;
        gk.eblg[13] = 2175173765340518632L;
        gk.eblg[14] = -2695393270701140135L;
        gk.eblg[15] = -7772754471181980805L;
        gk.eblg[16] = 7313908373248831331L;
        gk.eblg[17] = -1269994288918271187L;
        gk.eblg[18] = 4192205245494015897L;
        gk.eblg[19] = -1658670415310831061L;
        gk.eblg[20] = 5062888546781255581L;
        gk.eblg[21] = -6085696087109052073L;
        gk.eblg[22] = -3023341358923249570L;
        gk.eblg[23] = 527431818050004118L;
        gk.eblg[24] = -6070421072105313310L;
        gk.eblg[25] = -7285170195552891852L;
        gk.eblg[26] = -121016395335315276L;
        gk.eblg[27] = -3236232694019875571L;
        gk.eblg[28] = -7797761485897421837L;
        gk.eblg[29] = -503842375399631849L;
        gk.eblg[30] = -2675757363317558261L;
        gk.eblg[31] = -7121678672599676483L;
        gk.eblg[32] = -6562951192268907250L;
        gk.eblg[33] = 5961663989934419437L;
        gk.eblg[34] = -6036325133907063377L;
        gk.eblg[35] = -3813774557674665390L;
        gk.eblg[36] = -7882823978971543001L;
        gk.eblg[37] = -6074920522881688194L;
        gk.eblg[38] = 8869485375028071872L;
        gk.eblg[39] = 8946854266934566604L;
        gk.eblg[40] = -1162571225429059556L;
        gk.eblg[41] = 5266223982061092917L;
        gk.eblg[42] = 6541271860133805098L;
        gk.eblg[43] = 9197601026617436308L;
        gk.eblg[44] = -7942918559502413296L;
        gk.eblg[45] = 4315573988049102190L;
        gk.eblg[46] = 7731766750786448003L;
        gk.eblg[47] = -1629509771206041457L;
        gk.eblg[48] = -8100314943797863886L;
        gk.eblg[49] = 5894008647539081730L;
        gk.eblg[50] = -1146063462632717002L;
        gk.eblg[51] = -9048791941695658464L;
        gk.eblg[52] = 6615450237026682728L;
        gk.eblg[53] = 5193060884893477082L;
        gk.eblg[54] = -4071950498225533247L;
        gk.eblg[55] = 5588665066778977380L;
        gk.eblg[56] = 1546984304892335547L;
        gk.eblg[57] = 2539941524950981848L;
        gk.eblg[58] = -192203072123250285L;
        gk.eblg[59] = -4362657858639851906L;
        gk.eblg[60] = -8288198991955731412L;
        gk.eblg[61] = -7449830071486849971L;
        gk.eblg[62] = -7677038865229193165L;
        gk.eblg[63] = -8377666058466991438L;
        gk.eblg[64] = -7595504403248774269L;
        gk.eblg[65] = 4926016935902737039L;
        gk.eblg[66] = 1607614747845974985L;
        gk.eblg[67] = 8466299888504715397L;
        gk.eblg[68] = 8131530031110650219L;
        gk.eblg[69] = -1511469295422299L;
        gk.eblg[70] = -3931588418667584187L;
        gk.eblg[71] = 6435690200976271605L;
        gk.eblg[72] = 2202076081273958450L;
        gk.eblg[73] = -7250208522617711015L;
        gk.eblg[74] = 1684556832035867258L;
        gk.eblg[75] = -3240860057532702765L;
        gk.eblg[76] = -362615241425256171L;
        gk.eblg[77] = 850294719535498747L;
        gk.eblg[78] = -4638020624509518616L;
        gk.eblg[79] = 19022787746545947L;
        gk.eblg[80] = -6222139193969053027L;
        gk.eblg[81] = -4921589228233267319L;
        gk.eblg[82] = -5725411131147285588L;
        gk.eblg[83] = -3156759480402437612L;
        gk.eblg[84] = 8950940787834767574L;
        gk.eblg[85] = -549326715278491031L;
        gk.eblg[86] = -6002607990759889231L;
        gk.eblg[87] = -338317931415308348L;
        gk.eblg[88] = 1563284214110948941L;
        gk.eblg[89] = 4064343518906632765L;
        gk.eblg[90] = -576971398216016254L;
        gk.eblg[91] = -6980397210216046761L;
        gk.eblg[92] = -1074619182238081528L;
        gk.eblg[93] = 7567157329003764947L;
        gk.eblg[94] = 6502066970291413331L;
        gk.eblg[95] = 835203646018291531L;
        gk.eblg[96] = 3267529220999019328L;
        gk.eblg[97] = 6261408652883237510L;
        gk.eblg[98] = -1081281309165113081L;
        gk.eblg[99] = -824971753337291477L;
    }

    private static /* synthetic */ long eble(int n2) {
        return eblf[n2] ^ eblg[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public int getAccentColor() {
        v0 /* !! */  = gk.ki;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - gk.ebky("eblv", eble(int ), (int)6));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1451989544: {
                    break block21;
                }
                case 540303335: {
                    v1 = gk.ebky("eblw", eble(int ), (int)7);
                    continue block21;
                }
                case 1278628027: {
                    v1 = gk.ebky("eblx", eble(int ), (int)8);
                    continue block21;
                }
                case 1642805316: {
                    v1 = gk.ebky("ebly", eble(int ), (int)9);
                    continue block21;
                }
            }
            break;
        }
        var3_1 = gk.c;
        v2 /* !! */  = gk.ki;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - gk.ebky("eblz", eble(int ), (int)10));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1451989544: {
                    break block22;
                }
                case -408271205: {
                    v3 = gk.ebky("ebmb", eble(int ), (int)11);
                    continue block22;
                }
                case 1783758223: {
                    v3 = gk.ebky("ebmc", eble(int ), (int)12);
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = gk.b;
        v4 /* !! */  = gk.ki;
        block23: while (true) {
            switch ((int)v4 /* !! */ ) {
                case -1451989544: {
                    break block23;
                }
                case -544084661: {
                    v4 /* !! */  = (long)(gk.ebky("ebme", eble(int ), (int)14) - gk.ebky("ebmd", eble(int ), (int)13));
                    continue block23;
                }
            }
            break;
        }
        var1_3 = gk.a;
        if (var3_1) {
            throw null;
        }
        if (var1_3 != false) return (int)gk.ebky("ebmf", ebkv(int ), (int)13);
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var1_3 != false) return (int)gk.ebky("ebmf", ebkv(int ), (int)13);
                    v5 = gk.ebky("ebmg", ebkv(int ), (int)14);
                    while (true) {
                        if ((v6 /* !! */  = (cfr_temp_1 = gk.ki - gk.ebky("ebmi", eble(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v6 /* !! */  == gk.ebky("ebmj", ebkv(int ), (int)15)) {
                            return this.getColorAt(0.0f, (int)v5);
                        }
                        v6 /* !! */  = (long)gk.ebky("ebml", ebkv(int ), (int)16);
                    }
                }
                case 1: {
                    ** GOTO lbl69
                }
                case 3: {
                    ** GOTO lbl66
                }
                case 0: {
                    var2_2 /* !! */  = (int)gk.ebky("ebmq", ebkv(int ), (int)17);
                    if (var3_1) {
                        throw null;
                    }
lbl66:
                    // 3 sources

                    var2_2 /* !! */  = (int)gk.ebky("ebmt", ebkv(int ), (int)20);
                    if (var3_1) {
                        throw null;
                    }
lbl69:
                    // 3 sources

                    var2_2 /* !! */  = (int)gk.ebky("ebmr", ebkv(int ), (int)18);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: 
            }
            if (true) ** GOTO lbl76
            break;
        }
        do {
            if (true) ** continue;
lbl76:
            // 2 sources

            var2_2 /* !! */  = (int)gk.ebky("ebms", ebkv(int ), (int)19);
            cfr_temp_0 = 0;
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isSelected(gk$Palette var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gk.ki - gk.ebky("ebve", eble(int ), (int)81)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gk.ebky("ebvf", ebkv(int ), (int)77)) break;
            v0 /* !! */  = (long)gk.ebky("ebvg", ebkv(int ), (int)78);
        }
        var4_2 = gk.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gk.ki - gk.ebky("ebvi", eble(int ), (int)82)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gk.ebky("ebvj", ebkv(int ), (int)79)) break;
            v1 /* !! */  = (long)gk.ebky("ebvk", ebkv(int ), (int)80);
        }
        var3_3 /* !! */  = gk.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = gk.ki;
                if (true) ** GOTO lbl22
                block22: while (true) {
                    v2 /* !! */  = (long)(gk.ebky("ebvm", eble(int ), (int)84) - gk.ebky("ebvl", eble(int ), (int)83));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1457522936: {
                            continue block22;
                        }
                        case -1451989544: {
                            break block22;
                        }
                    }
                    break;
                }
                var2_4 = gk.a;
                if (var4_2) {
                    throw null;
                    return (boolean)gk.ebky("ebvn", ebkv(int ), (int)81);
                }
                if (var2_4 || var2_4) ** continue;
                v3 /* !! */  = gk.ki;
                if (true) ** GOTO lbl37
                block24: while (true) {
                    v3 /* !! */  = (long)(gk.ebky("ebvp", eble(int ), (int)86) - gk.ebky("ebvo", eble(int ), (int)85));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1757029847: {
                            continue block24;
                        }
                        case -1451989544: {
                            break block24;
                        }
                    }
                    break;
                }
                v4 = var1_1.name();
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = gk.ki - gk.ebky("ebvq", eble(int ), (int)87)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == gk.ebky("ebvr", ebkv(int ), (int)82)) break;
                    v5 /* !! */  = (long)gk.ebky("ebvs", ebkv(int ), (int)83);
                }
                v6 /* !! */  = gk.ki;
                if (true) ** GOTO lbl53
                block26: while (true) {
                    v6 /* !! */  = (long)(v7 - gk.ebky("ebvt", eble(int ), (int)88));
lbl53:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -2113205143: {
                            v7 = gk.ebky("ebvu", eble(int ), (int)89);
                            continue block26;
                        }
                        case -1451989544: {
                            break block26;
                        }
                        case 364285: {
                            v7 = gk.ebky("ebvx", eble(int ), (int)90);
                            continue block26;
                        }
                        case 1936119525: {
                            v7 = gk.ebky("ebvy", eble(int ), (int)91);
                            continue block26;
                        }
                    }
                    break;
                }
                v8 = this.color.getValue();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = gk.ki - gk.ebky("ebvz", eble(int ), (int)92)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == gk.ebky("ebwa", ebkv(int ), (int)84)) break;
                    v9 /* !! */  = (long)gk.ebky("ebwb", ebkv(int ), (int)85);
                }
                return v4.equals(v8);
            }
            case 0: {
                var3_3 /* !! */  = (int)gk.ebky("ebwc", ebkv(int ), (int)86);
                if (!var4_2) break;
                throw null;
            }
lbl77:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gk.ebky("ebwd", ebkv(int ), (int)87);
                    if (!var4_2) break block0;
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)gk.ebky("ebwe", ebkv(int ), (int)88);
                if (!var4_2) ** GOTO lbl77
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)gk.ebky("ebwg", ebkv(int ), (int)89);
        ** while (!var4_2)
lbl89:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ecjp() {
        gk.ebkx[0] = -1686838425;
        gk.ebkx[1] = -266796100;
        gk.ebkx[2] = -78898312;
        gk.ebkx[3] = -989432434;
        gk.ebkx[4] = -1938705846;
        gk.ebkx[5] = -1859195699;
        gk.ebkx[6] = 1433682223;
        gk.ebkx[7] = -199376329;
        gk.ebkx[8] = 1725680724;
        gk.ebkx[9] = -685062139;
        gk.ebkx[10] = -32539324;
        gk.ebkx[11] = -592595981;
        gk.ebkx[12] = -1040798692;
        gk.ebkx[13] = 83761801;
        gk.ebkx[14] = -1815705437;
        gk.ebkx[15] = -1910813037;
        gk.ebkx[16] = 562148922;
        gk.ebkx[17] = 1560889569;
        gk.ebkx[18] = 481063025;
        gk.ebkx[19] = 531682770;
        gk.ebkx[20] = -1714261759;
        gk.ebkx[21] = -1252834838;
        gk.ebkx[22] = -1329295927;
        gk.ebkx[23] = -485058355;
        gk.ebkx[24] = 263872247;
        gk.ebkx[25] = -2094343219;
        gk.ebkx[26] = -865883397;
        gk.ebkx[27] = -210560432;
        gk.ebkx[28] = -138446398;
        gk.ebkx[29] = 1915644767;
        gk.ebkx[30] = -1250427720;
        gk.ebkx[31] = 958993484;
        gk.ebkx[32] = -8038557;
        gk.ebkx[33] = 1365338736;
        gk.ebkx[34] = -466618442;
        gk.ebkx[35] = 479686842;
        gk.ebkx[36] = 239892656;
        gk.ebkx[37] = -2141092534;
        gk.ebkx[38] = 2008993344;
        gk.ebkx[39] = 464375845;
        gk.ebkx[40] = 620497902;
        gk.ebkx[41] = -1828992032;
        gk.ebkx[42] = 389427292;
        gk.ebkx[43] = 852011014;
        gk.ebkx[44] = 695914902;
        gk.ebkx[45] = -521974079;
        gk.ebkx[46] = -1499330518;
        gk.ebkx[47] = -298199212;
        gk.ebkx[48] = -1673302165;
        gk.ebkx[49] = -2112274822;
        gk.ebkx[50] = 48006276;
        gk.ebkx[51] = 710924783;
        gk.ebkx[52] = 1648809467;
        gk.ebkx[53] = -1771305119;
        gk.ebkx[54] = -1703058995;
        gk.ebkx[55] = -1584012082;
        gk.ebkx[56] = 2123877438;
        gk.ebkx[57] = -488713098;
        gk.ebkx[58] = -1223906442;
        gk.ebkx[59] = 1147899103;
        gk.ebkx[60] = 1761062254;
        gk.ebkx[61] = 402293433;
        gk.ebkx[62] = 68802245;
        gk.ebkx[63] = 394145919;
        gk.ebkx[64] = 1582360491;
        gk.ebkx[65] = -777616619;
        gk.ebkx[66] = -914078555;
        gk.ebkx[67] = 1885632813;
        gk.ebkx[68] = -150303104;
        gk.ebkx[69] = 2091179546;
        gk.ebkx[70] = 1838180831;
        gk.ebkx[71] = -1598925020;
        gk.ebkx[72] = 1576242449;
        gk.ebkx[73] = -685267086;
        gk.ebkx[74] = -996147170;
        gk.ebkx[75] = 407047560;
        gk.ebkx[76] = 1603674193;
        gk.ebkx[77] = -1516481871;
        gk.ebkx[78] = -1198151765;
        gk.ebkx[79] = -1023175860;
        gk.ebkx[80] = 983921968;
        gk.ebkx[81] = -1218126746;
        gk.ebkx[82] = 5152710;
        gk.ebkx[83] = 1170848993;
        gk.ebkx[84] = -1483776553;
        gk.ebkx[85] = -529508787;
        gk.ebkx[86] = 1646116915;
        gk.ebkx[87] = 764241799;
        gk.ebkx[88] = 1957880321;
        gk.ebkx[89] = -1230260405;
        gk.ebkx[90] = 933058098;
        gk.ebkx[91] = -1654649882;
        gk.ebkx[92] = 1818296032;
        gk.ebkx[93] = 2112552002;
        gk.ebkx[94] = -1510302441;
        gk.ebkx[95] = 1677437146;
        gk.ebkx[96] = -1639107458;
        gk.ebkx[97] = 567349986;
        gk.ebkx[98] = 1209907971;
        gk.ebkx[99] = -1141986535;
    }

    static {
        ebkw = new int[196];
        ebkx = new int[196];
        gk.ecim();
        gk.ecjf();
        gk.ecjp();
        gk.eckc();
        eblf = new long[167];
        eblg = new long[167];
        gk.eckk();
        gk.eckv();
        gk.ecld();
        gk.eclt();
        PALETTES = List.of(gk.palette("\u041a\u0440\u0430\u0441\u043d\u0430\u044f", "#FF4055"), gk.palette("\u0411\u0435\u043b\u0430\u044f", "#F2F3F7"), gk.palette("\u0416\u0451\u043b\u0442\u0430\u044f", "#FFD447"), gk.palette("\u0421\u0438\u043d\u044f\u044f", "#7387FF", "#858CFF"), gk.palette("\u0417\u0435\u043b\u0451\u043d\u0430\u044f", "#45D483"), gk.palette("\u0424\u0438\u043e\u043b\u0435\u0442\u043e\u0432\u0430\u044f", "#AD73FF", "#C685FF"), gk.palette("\u0420\u043e\u0437\u043e\u0432\u0430\u044f", "#FF72B6"), gk.palette("\u041e\u0440\u0430\u043d\u0436\u0435\u0432\u0430\u044f", "#FF8A45"), gk.palette("\u0411\u0438\u0440\u044e\u0437\u043e\u0432\u0430\u044f", "#3EDBC5"), gk.palette("\u041f\u0440\u043e\u0437\u0440\u0430\u0447\u043d\u0430\u044f", "#5F71BF", "#858CFF"), gk.palette(DEFAULT_NAME, "#78BCFF", "#FF73A8"), gk.palette("\u041b\u0435\u0434\u044f\u043d\u0430\u044f \u0441\u0438\u0440\u0435\u043d\u044c", "#5F71BF", "#A0B0EF"), gk.palette("\u0421\u0435\u0432\u0435\u0440\u043d\u043e\u0435 \u0441\u0438\u044f\u043d\u0438\u0435", "#42E8B4", "#55B8FF", "#987BFF"), gk.palette("\u041b\u0438\u043b\u043e\u0432\u044b\u0439 \u0441\u0443\u043c\u0440\u0430\u043a", "#7362B0", "#9C8ADF"), gk.palette("\u0427\u0438\u0441\u0442\u043e\u0435 \u043d\u0435\u0431\u043e", "#6FA4C8", "#7FBAF4"), gk.palette("\u041f\u0435\u0441\u0447\u0430\u043d\u043e\u0435 \u0442\u0435\u043f\u043b\u043e", "#B9B079", "#D6D4A8"), gk.palette("\u041f\u0443\u0434\u0440\u043e\u0432\u0430\u044f \u0440\u043e\u0437\u0430", "#C78097", "#DD95B1"), gk.palette("\u0417\u0430\u043a\u0430\u0442\u043d\u044b\u0439 \u043a\u043e\u0440\u0430\u043b\u043b", "#C97576", "#DD7F81"), gk.palette("\u0420\u0443\u0431\u0438\u043d\u043e\u0432\u044b\u0439 \u043d\u0435\u043e\u043d", "#FF315C", "#FF587D", "#BE3BFF"), gk.palette("\u041c\u044f\u0442\u043d\u044b\u0439 \u043e\u043a\u0435\u0430\u043d", "#2DE2B3", "#25BCEB", "#477BFF"), gk.palette("\u0417\u043e\u043b\u043e\u0442\u043e\u0439 \u0447\u0430\u0441", "#FFB347", "#FFD56A", "#FF7B62"), gk.palette("Cyber Lime", "#B8FF5A", "#39E6A2", "#31A8FF"), gk.palette("Electric Night", "#335CFF", "#8B5CFF", "#FF4FD8"), gk.palette("Cherry Ice", "#FF477E", "#FF85A1", "#86C5FF"), gk.palette("Deep Space", "#3548C8", "#805AD5", "#D946EF"), gk.palette("Toxic Sunset", "#C9FF45", "#FFCF4A", "#FF5F57"), gk.palette("Ocean Flame", "#00D4FF", "#4169E1", "#FF4D8D"), gk.palette("Aurora Glass", "#67F5C8", "#7BB8FF", "#E2A8FF"), gk.palette("Crimson Frost", "#FF365D", "#B75CFF", "#70C7FF"));
        PALETTES_BY_NAME = PALETTES.stream().collect(Collectors.toUnmodifiableMap(gk$Palette::name, gk::lambda$static$0));
        LEGACY_THEMES = Map.of("\u041a\u0440\u0430\u0441\u043d\u0430\u044f", "\u041a\u0440\u0430\u0441\u043d\u0430\u044f", "\u0411\u0435\u043b\u0430\u044f", "\u0411\u0435\u043b\u0430\u044f", "\u0416\u0451\u043b\u0442\u0430\u044f", "\u0416\u0451\u043b\u0442\u0430\u044f", "\u0421\u0438\u043d\u044f\u044f", "\u0421\u0438\u043d\u044f\u044f", "\u0417\u0435\u043b\u0451\u043d\u0430\u044f", "\u0417\u0435\u043b\u0451\u043d\u0430\u044f", "\u0424\u0438\u043e\u043b\u0435\u0442\u043e\u0432\u0430\u044f", "\u0424\u0438\u043e\u043b\u0435\u0442\u043e\u0432\u0430\u044f", "\u0420\u043e\u0437\u043e\u0432\u0430\u044f", "\u0420\u043e\u0437\u043e\u0432\u0430\u044f", "\u041e\u0440\u0430\u043d\u0436\u0435\u0432\u0430\u044f", "\u041e\u0440\u0430\u043d\u0436\u0435\u0432\u0430\u044f", "\u0411\u0438\u0440\u044e\u0437\u043e\u0432\u0430\u044f", "\u0411\u0438\u0440\u044e\u0437\u043e\u0432\u0430\u044f", "Custom", DEFAULT_NAME);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void applyGlobally(gk$Palette var1_1) {
        block69: {
            block68: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = gk.ki - gk.ebky("ebzs", eble(int ), (int)113)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == gk.ebky("ebzt", ebkv(int ), (int)125)) break;
                    v0 /* !! */  = (long)gk.ebky("ebzu", ebkv(int ), (int)126);
                }
                var4_2 = gk.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = gk.ki - gk.ebky("ebzv", eble(int ), (int)114)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == gk.ebky("ebzw", ebkv(int ), (int)127)) break;
                    v1 /* !! */  = (long)gk.ebky("ebzx", ebkv(int ), (int)128);
                }
                var3_3 /* !! */  = gk.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = gk.ki - gk.ebky("ebzz", eble(int ), (int)115)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == gk.ebky("ecaa", ebkv(int ), (int)129)) break;
                    v2 /* !! */  = (long)gk.ebky("ecab", ebkv(int ), (int)130);
                }
                var2_4 = gk.a;
                if (var4_2) {
                    throw null;
lbl21:
                    // 9 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl21
                if (var1_1 == null) break block68;
                if (var2_4) ** GOTO lbl21
                v3 /* !! */  = gk.ki;
                if (true) ** GOTO lbl30
                block46: while (true) {
                    v3 /* !! */  = (long)(v4 - gk.ebky("ecad", eble(int ), (int)116));
lbl30:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1492328942: {
                            v4 = gk.ebky("ecag", eble(int ), (int)117);
                            continue block46;
                        }
                        case -1451989544: {
                            break block46;
                        }
                        case -390121906: {
                            v4 = gk.ebky("ecai", eble(int ), (int)118);
                            continue block46;
                        }
                        case 1969908464: {
                            v4 = gk.ebky("ecaj", eble(int ), (int)119);
                            continue block46;
                        }
                    }
                    break;
                }
                if (var1_1.colors().length != 0) break block69;
                if (var2_4) ** GOTO lbl21
            }
            if (var2_4 || var2_4) ** GOTO lbl21
            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl21
        v5 /* !! */  = gk.ki;
        if (true) ** GOTO lbl53
        block47: while (true) {
            v5 /* !! */  = (long)(gk.ebky("ecan", eble(int ), (int)121) - gk.ebky("ecam", eble(int ), (int)120));
lbl53:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1451989544: {
                    break block47;
                }
                case 373871315: {
                    continue block47;
                }
            }
            break;
        }
        v6 = var1_1.colors();
        v7 /* !! */  = gk.ki;
        if (true) ** GOTO lbl63
        block48: while (true) {
            v7 /* !! */  = (long)(v8 - gk.ebky("ecao", eble(int ), (int)122));
lbl63:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -2004060648: {
                    v8 = gk.ebky("ecap", eble(int ), (int)123);
                    continue block48;
                }
                case -1451989544: {
                    break block48;
                }
                case -263199600: {
                    v8 = gk.ebky("ecaq", eble(int ), (int)124);
                    continue block48;
                }
                case 1036682510: {
                    v8 = gk.ebky("ecar", eble(int ), (int)125);
                    continue block48;
                }
            }
            break;
        }
        nd.setClientColors(v6);
        if (var2_4 || var2_4) ** GOTO lbl21
        v9 /* !! */  = gk.ki;
        if (true) ** GOTO lbl81
        block49: while (true) {
            v9 /* !! */  = (long)(v10 - gk.ebky("ecas", eble(int ), (int)126));
lbl81:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1451989544: {
                    break block49;
                }
                case 254699092: {
                    v10 = gk.ebky("ecau", eble(int ), (int)127);
                    continue block49;
                }
                case 1801929681: {
                    v10 = gk.ebky("ecay", eble(int ), (int)128);
                    continue block49;
                }
            }
            break;
        }
        if (var1_1.colors().length <= gk.ebky("ecaz", ebkv(int ), (int)131)) ** GOTO lbl99
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl21
                v11 = "\u041f\u0435\u0440\u0435\u043b\u0438\u0432\u0430\u043d\u0438\u0435";
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl101
            }
lbl99:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl21
            v11 = "\u0421\u0442\u0430\u0442\u0438\u0447\u043d\u044b\u0439";
lbl101:
            // 2 sources

            while (true) {
                if ((v12 /* !! */  = (cfr_temp_3 = gk.ki - gk.ebky("ecbc", eble(int ), (int)129)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == gk.ebky("ecbd", ebkv(int ), (int)132)) break;
                v12 /* !! */  = (long)gk.ebky("ecbe", ebkv(int ), (int)133);
            }
            nd.setClientColorMode(v11);
            if (!var2_4 && !var2_4) ** break;
            ** continue;
            return;
lbl110:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)gk.ebky("ecbf", ebkv(int ), (int)134);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 1: {
                var3_3 /* !! */  = (int)gk.ebky("ecbg", ebkv(int ), (int)135);
                if (!var4_2) ** GOTO lbl110
                throw null;
            }
lbl119:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)gk.ebky("ecbh", ebkv(int ), (int)136);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
            case 3: {
                var3_3 /* !! */  = (int)gk.ebky("ecbj", ebkv(int ), (int)137);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl129:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)gk.ebky("ecbk", ebkv(int ), (int)138);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl134:
            // 3 sources

            case 5: {
                var3_3 /* !! */  = (int)gk.ebky("ecbm", ebkv(int ), (int)139);
                if (!var4_2) ** GOTO lbl119
                throw null;
            }
lbl138:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)gk.ebky("ecbo", ebkv(int ), (int)140);
                if (!var4_2) ** GOTO lbl110
                throw null;
            }
lbl142:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)gk.ebky("ecbp", ebkv(int ), (int)141);
                if (!var4_2) ** GOTO lbl134
                throw null;
            }
lbl146:
            // 4 sources

            case 8: {
                var3_3 /* !! */  = (int)gk.ebky("ecbq", ebkv(int ), (int)142);
                if (!var4_2) break;
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)gk.ebky("ecbt", ebkv(int ), (int)143);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl155:
            // 4 sources

            case 10: {
                var3_3 /* !! */  = (int)gk.ebky("ecbu", ebkv(int ), (int)144);
                if (!var4_2) ** GOTO lbl138
                throw null;
            }
            case 11: {
                var3_3 /* !! */  = (int)gk.ebky("ecbv", ebkv(int ), (int)145);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl164:
            // 3 sources

            case 12: {
                var3_3 /* !! */  = (int)gk.ebky("ecbw", ebkv(int ), (int)146);
                if (!var4_2) ** GOTO lbl142
                throw null;
            }
            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gk.ebky("ecbx", ebkv(int ), (int)147);
                    if (!var4_2) ** GOTO lbl129
                    throw null;
                }
            }
            case 14: {
                var3_3 /* !! */  = (int)gk.ebky("ecby", ebkv(int ), (int)148);
                if (!var4_2) ** GOTO lbl155
                throw null;
            }
            case 15: {
                var3_3 /* !! */  = (int)gk.ebky("ecbz", ebkv(int ), (int)149);
                if (!var4_2) ** GOTO lbl146
                throw null;
            }
lbl181:
            // 2 sources

            case 16: {
                var3_3 /* !! */  = (int)gk.ebky("eccb", ebkv(int ), (int)150);
                if (!var4_2) ** GOTO lbl146
                throw null;
            }
            case 17: {
                var3_3 /* !! */  = (int)gk.ebky("eccc", ebkv(int ), (int)151);
                if (!var4_2) ** GOTO lbl146
                throw null;
            }
            case 18: 
        }
        var3_3 /* !! */  = (int)gk.ebky("eccd", ebkv(int ), (int)152);
        ** while (!var4_2)
lbl192:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void eckc() {
        gk.ebkx[100] = -1530381643;
        gk.ebkx[101] = 391258591;
        gk.ebkx[102] = -1719926398;
        gk.ebkx[103] = -845577411;
        gk.ebkx[104] = 1559073861;
        gk.ebkx[105] = 2036235800;
        gk.ebkx[106] = 1113435739;
        gk.ebkx[107] = 17478000;
        gk.ebkx[108] = -136320760;
        gk.ebkx[109] = -1457884834;
        gk.ebkx[110] = -1433761373;
        gk.ebkx[111] = 18318908;
        gk.ebkx[112] = 2066736450;
        gk.ebkx[113] = 296108811;
        gk.ebkx[114] = -1401084281;
        gk.ebkx[115] = -1353624803;
        gk.ebkx[116] = -2029638721;
        gk.ebkx[117] = -281016616;
        gk.ebkx[118] = -1869853098;
        gk.ebkx[119] = -1771196027;
        gk.ebkx[120] = -846560452;
        gk.ebkx[121] = -612489031;
        gk.ebkx[122] = -1348096628;
        gk.ebkx[123] = -424552833;
        gk.ebkx[124] = -1650129759;
        gk.ebkx[125] = -436268780;
        gk.ebkx[126] = -885712370;
        gk.ebkx[127] = 870889708;
        gk.ebkx[128] = -84846990;
        gk.ebkx[129] = 1549874574;
        gk.ebkx[130] = 2058271711;
        gk.ebkx[131] = -736355850;
        gk.ebkx[132] = 285584791;
        gk.ebkx[133] = -260533021;
        gk.ebkx[134] = -977111072;
        gk.ebkx[135] = 532965324;
        gk.ebkx[136] = -1428203569;
        gk.ebkx[137] = 881005978;
        gk.ebkx[138] = 2139450328;
        gk.ebkx[139] = 1157103865;
        gk.ebkx[140] = -895420442;
        gk.ebkx[141] = 425448906;
        gk.ebkx[142] = -507337069;
        gk.ebkx[143] = 1081850596;
        gk.ebkx[144] = -109334915;
        gk.ebkx[145] = 267550415;
        gk.ebkx[146] = 837441078;
        gk.ebkx[147] = -659088555;
        gk.ebkx[148] = -709924715;
        gk.ebkx[149] = 225464850;
        gk.ebkx[150] = -1993198470;
        gk.ebkx[151] = 1509528687;
        gk.ebkx[152] = 141426241;
        gk.ebkx[153] = 1918016701;
        gk.ebkx[154] = -13743540;
        gk.ebkx[155] = -1409932533;
        gk.ebkx[156] = -1357022804;
        gk.ebkx[157] = -1946126341;
        gk.ebkx[158] = -1186862728;
        gk.ebkx[159] = -1868997513;
        gk.ebkx[160] = 1495665889;
        gk.ebkx[161] = 518967064;
        gk.ebkx[162] = 1092047022;
        gk.ebkx[163] = -962253257;
        gk.ebkx[164] = -1367163324;
        gk.ebkx[165] = -53433783;
        gk.ebkx[166] = 327831667;
        gk.ebkx[167] = 142676572;
        gk.ebkx[168] = 912312647;
        gk.ebkx[169] = -1141777832;
        gk.ebkx[170] = -1560653424;
        gk.ebkx[171] = 1085736987;
        gk.ebkx[172] = 1598393415;
        gk.ebkx[173] = -1008541191;
        gk.ebkx[174] = -2084553214;
        gk.ebkx[175] = -1481709341;
        gk.ebkx[176] = -1201990133;
        gk.ebkx[177] = -2142051514;
        gk.ebkx[178] = -1989407115;
        gk.ebkx[179] = 523603284;
        gk.ebkx[180] = -521000906;
        gk.ebkx[181] = 1238292423;
        gk.ebkx[182] = 133848924;
        gk.ebkx[183] = 1919022499;
        gk.ebkx[184] = 528465810;
        gk.ebkx[185] = -282760336;
        gk.ebkx[186] = -2111903209;
        gk.ebkx[187] = 1738489112;
        gk.ebkx[188] = 1329489961;
        gk.ebkx[189] = 260342093;
        gk.ebkx[190] = 362928239;
        gk.ebkx[191] = -965772604;
        gk.ebkx[192] = 840194558;
        gk.ebkx[193] = -837527193;
        gk.ebkx[194] = -428240698;
        gk.ebkx[195] = -1320218058;
    }

    private static /* synthetic */ void ecim() {
        gk.ebkw[0] = -1686838426;
        gk.ebkw[1] = -266796099;
        gk.ebkw[2] = -78898310;
        gk.ebkw[3] = -989432438;
        gk.ebkw[4] = -1938705845;
        gk.ebkw[5] = -1859195700;
        gk.ebkw[6] = 1341791809;
        gk.ebkw[7] = 199376328;
        gk.ebkw[8] = 141986620;
        gk.ebkw[9] = -685062140;
        gk.ebkw[10] = -32539323;
        gk.ebkw[11] = -592595982;
        gk.ebkw[12] = -1040798690;
        gk.ebkw[13] = -1132407899;
        gk.ebkw[14] = -1815705508;
        gk.ebkw[15] = -1910813038;
        gk.ebkw[16] = -2025747262;
        gk.ebkw[17] = 1560889569;
        gk.ebkw[18] = 481063024;
        gk.ebkw[19] = 531682771;
        gk.ebkw[20] = -1714261760;
        gk.ebkw[21] = 1252834837;
        gk.ebkw[22] = -982988974;
        gk.ebkw[23] = -744749944;
        gk.ebkw[24] = 263872229;
        gk.ebkw[25] = -1063330867;
        gk.ebkw[26] = 865883396;
        gk.ebkw[27] = 1417414530;
        gk.ebkw[28] = 138446397;
        gk.ebkw[29] = 839725221;
        gk.ebkw[30] = -1250427720;
        gk.ebkw[31] = 958993587;
        gk.ebkw[32] = -8038558;
        gk.ebkw[33] = 907553623;
        gk.ebkw[34] = -466618444;
        gk.ebkw[35] = 479686843;
        gk.ebkw[36] = 239892657;
        gk.ebkw[37] = -2141092534;
        gk.ebkw[38] = 2008993349;
        gk.ebkw[39] = 464375841;
        gk.ebkw[40] = 620497897;
        gk.ebkw[41] = -1828992032;
        gk.ebkw[42] = 389427293;
        gk.ebkw[43] = -919497479;
        gk.ebkw[44] = 695914903;
        gk.ebkw[45] = -1259741175;
        gk.ebkw[46] = 1499330517;
        gk.ebkw[47] = -1761248104;
        gk.ebkw[48] = 1673302164;
        gk.ebkw[49] = 91538003;
        gk.ebkw[50] = 48006277;
        gk.ebkw[51] = 1817638893;
        gk.ebkw[52] = 1648809466;
        gk.ebkw[53] = 1848795348;
        gk.ebkw[54] = 1703058994;
        gk.ebkw[55] = -92471390;
        gk.ebkw[56] = -2123877439;
        gk.ebkw[57] = 1154449556;
        gk.ebkw[58] = -1223906441;
        gk.ebkw[59] = -382787092;
        gk.ebkw[60] = 1761062251;
        gk.ebkw[61] = 402293439;
        gk.ebkw[62] = 68802242;
        gk.ebkw[63] = 394145916;
        gk.ebkw[64] = 1582360483;
        gk.ebkw[65] = -777616611;
        gk.ebkw[66] = -914078560;
        gk.ebkw[67] = 1885632804;
        gk.ebkw[68] = -150303094;
        gk.ebkw[69] = 2091179538;
        gk.ebkw[70] = 1838180831;
        gk.ebkw[71] = -1598925019;
        gk.ebkw[72] = 1099349328;
        gk.ebkw[73] = -685267085;
        gk.ebkw[74] = -996147171;
        gk.ebkw[75] = 407047560;
        gk.ebkw[76] = 1603674193;
        gk.ebkw[77] = -1516481872;
        gk.ebkw[78] = 1410286130;
        gk.ebkw[79] = 1023175859;
        gk.ebkw[80] = -1179979844;
        gk.ebkw[81] = -1218126745;
        gk.ebkw[82] = 5152711;
        gk.ebkw[83] = -590989298;
        gk.ebkw[84] = 1483776552;
        gk.ebkw[85] = 1302120560;
        gk.ebkw[86] = 1646116912;
        gk.ebkw[87] = 764241798;
        gk.ebkw[88] = 1957880321;
        gk.ebkw[89] = -1230260406;
        gk.ebkw[90] = 933058099;
        gk.ebkw[91] = -1522316839;
        gk.ebkw[92] = 1818296033;
        gk.ebkw[93] = 8803557;
        gk.ebkw[94] = -1510302442;
        gk.ebkw[95] = 1467506641;
        gk.ebkw[96] = -1639107458;
        gk.ebkw[97] = 567349992;
        gk.ebkw[98] = 1209907970;
        gk.ebkw[99] = -1141986533;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ Boolean lambda$new$2() {
        v0 /* !! */  = gk.ki;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(gk.ebky("ecem", eble(int ), (int)148) - gk.ebky("ecek", eble(int ), (int)147));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1451989544: {
                    break block20;
                }
                case -210666198: {
                    continue block20;
                }
            }
            break;
        }
        var2 = gk.c;
        v1 /* !! */  = gk.ki;
        if (true) ** GOTO lbl15
        block21: while (true) {
            v1 /* !! */  = (long)(gk.ebky("eceo", eble(int ), (int)150) - gk.ebky("ecen", eble(int ), (int)149));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1451989544: {
                    break block21;
                }
                case 1201132507: {
                    continue block21;
                }
            }
            break;
        }
        var1_1 /* !! */  = gk.b;
        v2 /* !! */  = gk.ki;
        if (true) ** GOTO lbl25
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - gk.ebky("ecep", eble(int ), (int)151));
lbl25:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1451989544: {
                    break block22;
                }
                case -1403304163: {
                    v3 = gk.ebky("eceq", eble(int ), (int)152);
                    continue block22;
                }
                case -1116420440: {
                    v3 = gk.ebky("ecer", eble(int ), (int)153);
                    continue block22;
                }
                case 1289873755: {
                    v3 = gk.ebky("eces", eble(int ), (int)154);
                    continue block22;
                }
            }
            break;
        }
        var0_2 = gk.a;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                v4 = gk.ebky("ecew", ebkv(int ), (int)173);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = gk.ki - gk.ebky("ecey", eble(int ), (int)155)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == gk.ebky("ecez", ebkv(int ), (int)174)) break;
                    v5 /* !! */  = (long)gk.ebky("ecfb", ebkv(int ), (int)175);
                }
                return (boolean)v4;
            }
lbl54:
            // 2 sources

            case 0: {
                do {
                    var1_1 /* !! */  = (int)gk.ebky("ecfc", ebkv(int ), (int)176);
                } while (!var2);
                throw null;
            }
lbl59:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)gk.ebky("ecfd", ebkv(int ), (int)177);
                if (!var2) ** GOTO lbl54
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)gk.ebky("ecff", ebkv(int ), (int)178);
                    if (!var2) ** GOTO lbl59
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)gk.ebky("ecfh", ebkv(int ), (int)179);
        ** while (!var2)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ecjf() {
        gk.ebkw[100] = -1530381644;
        gk.ebkw[101] = 391258586;
        gk.ebkw[102] = -1719926395;
        gk.ebkw[103] = -845577411;
        gk.ebkw[104] = 1559073870;
        gk.ebkw[105] = 2036235802;
        gk.ebkw[106] = 1113435737;
        gk.ebkw[107] = 17478009;
        gk.ebkw[108] = -136320757;
        gk.ebkw[109] = -1457884833;
        gk.ebkw[110] = 158570747;
        gk.ebkw[111] = -18318909;
        gk.ebkw[112] = -1640529677;
        gk.ebkw[113] = -296108812;
        gk.ebkw[114] = 639902836;
        gk.ebkw[115] = -1353624804;
        gk.ebkw[116] = -1106690904;
        gk.ebkw[117] = -281016615;
        gk.ebkw[118] = 1424729876;
        gk.ebkw[119] = -1771196026;
        gk.ebkw[120] = -846560455;
        gk.ebkw[121] = -612489031;
        gk.ebkw[122] = -1348096628;
        gk.ebkw[123] = -424552837;
        gk.ebkw[124] = -1650129755;
        gk.ebkw[125] = -436268779;
        gk.ebkw[126] = 183819885;
        gk.ebkw[127] = 870889709;
        gk.ebkw[128] = 1809003318;
        gk.ebkw[129] = 1549874575;
        gk.ebkw[130] = 2139782887;
        gk.ebkw[131] = -736355849;
        gk.ebkw[132] = 285584790;
        gk.ebkw[133] = 1460795502;
        gk.ebkw[134] = -977111067;
        gk.ebkw[135] = 532965318;
        gk.ebkw[136] = -1428203580;
        gk.ebkw[137] = 881005978;
        gk.ebkw[138] = 2139450331;
        gk.ebkw[139] = 1157103859;
        gk.ebkw[140] = -895420445;
        gk.ebkw[141] = 425448896;
        gk.ebkw[142] = -507337062;
        gk.ebkw[143] = 1081850612;
        gk.ebkw[144] = -109334928;
        gk.ebkw[145] = 267550402;
        gk.ebkw[146] = 837441081;
        gk.ebkw[147] = -659088571;
        gk.ebkw[148] = -709924714;
        gk.ebkw[149] = 225464848;
        gk.ebkw[150] = -1993198467;
        gk.ebkw[151] = 1509528703;
        gk.ebkw[152] = 141426249;
        gk.ebkw[153] = 1918016701;
        gk.ebkw[154] = 13743539;
        gk.ebkw[155] = 1556546193;
        gk.ebkw[156] = -1357022815;
        gk.ebkw[157] = -1946126338;
        gk.ebkw[158] = -1186862736;
        gk.ebkw[159] = -1868997510;
        gk.ebkw[160] = 1495665888;
        gk.ebkw[161] = 518967056;
        gk.ebkw[162] = 1092047011;
        gk.ebkw[163] = -962253260;
        gk.ebkw[164] = -1367163314;
        gk.ebkw[165] = -53433784;
        gk.ebkw[166] = 327831669;
        gk.ebkw[167] = 142676560;
        gk.ebkw[168] = 912312653;
        gk.ebkw[169] = -1141777836;
        gk.ebkw[170] = -1560653415;
        gk.ebkw[171] = 1085736986;
        gk.ebkw[172] = 1598393416;
        gk.ebkw[173] = -1008541191;
        gk.ebkw[174] = 2084553213;
        gk.ebkw[175] = -2053492068;
        gk.ebkw[176] = -1201990133;
        gk.ebkw[177] = -2142051516;
        gk.ebkw[178] = -1989407116;
        gk.ebkw[179] = 523603284;
        gk.ebkw[180] = -521000905;
        gk.ebkw[181] = -1799983815;
        gk.ebkw[182] = 133848925;
        gk.ebkw[183] = 1919022498;
        gk.ebkw[184] = 528465811;
        gk.ebkw[185] = -282760335;
        gk.ebkw[186] = -2111903210;
        gk.ebkw[187] = -1425546237;
        gk.ebkw[188] = -1329489962;
        gk.ebkw[189] = -1105254710;
        gk.ebkw[190] = -362928240;
        gk.ebkw[191] = -1134198542;
        gk.ebkw[192] = 840194558;
        gk.ebkw[193] = -837527194;
        gk.ebkw[194] = -428240699;
        gk.ebkw[195] = -1320218058;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void select(gk$Palette var1_1) {
        block56: {
            v0 /* !! */  = gk.ki;
            if (true) ** GOTO lbl5
            block35: while (true) {
                v0 /* !! */  = (long)(gk.ebky("ebwk", eble(int ), (int)94) - gk.ebky("ebwj", eble(int ), (int)93));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1451989544: {
                        break block35;
                    }
                    case 1297167882: {
                        continue block35;
                    }
                }
                break;
            }
            var4_2 = gk.c;
            v1 /* !! */  = gk.ki;
            if (true) ** GOTO lbl15
            block36: while (true) {
                v1 /* !! */  = (long)(v2 - gk.ebky("ebwl", eble(int ), (int)95));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1451989544: {
                        break block36;
                    }
                    case -186674498: {
                        v2 = gk.ebky("ebwm", eble(int ), (int)96);
                        continue block36;
                    }
                    case 50145737: {
                        v2 = gk.ebky("ebwn", eble(int ), (int)97);
                        continue block36;
                    }
                    case 77170599: {
                        v2 = gk.ebky("ebwo", eble(int ), (int)98);
                        continue block36;
                    }
                }
                break;
            }
            var3_3 /* !! */  = gk.b;
            v3 /* !! */  = gk.ki;
            if (true) ** GOTO lbl32
            block37: while (true) {
                v3 /* !! */  = (long)(v4 - gk.ebky("ebwq", eble(int ), (int)99));
lbl32:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1888236996: {
                        v4 = gk.ebky("ebwr", eble(int ), (int)100);
                        continue block37;
                    }
                    case -1451989544: {
                        break block37;
                    }
                    case -147083408: {
                        v4 = gk.ebky("ebwt", eble(int ), (int)101);
                        continue block37;
                    }
                }
                break;
            }
            var2_4 = gk.a;
            if (var4_2) {
                throw null;
lbl44:
                // 6 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl44
            if (var1_1 != null) break block56;
            if (var2_4 || var2_4) ** GOTO lbl44
            return;
        }
        if (var2_4) ** GOTO lbl44
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl44
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = gk.ki - gk.ebky("ebwz", eble(int ), (int)102)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == gk.ebky("ebxa", ebkv(int ), (int)90)) break;
                    v5 /* !! */  = (long)gk.ebky("ebxb", ebkv(int ), (int)91);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = gk.ki - gk.ebky("ebxc", eble(int ), (int)103)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == gk.ebky("ebxd", ebkv(int ), (int)92)) break;
                    v6 /* !! */  = (long)gk.ebky("ebxe", ebkv(int ), (int)93);
                }
                v7 = var1_1.name();
                v8 /* !! */  = gk.ki;
                if (true) ** GOTO lbl71
                block41: while (true) {
                    v8 /* !! */  = (long)(v9 - gk.ebky("ebxf", eble(int ), (int)104));
lbl71:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1451989544: {
                            break block41;
                        }
                        case -1167457597: {
                            v9 = gk.ebky("ebxh", eble(int ), (int)105);
                            continue block41;
                        }
                        case -139214829: {
                            v9 = gk.ebky("ebxi", eble(int ), (int)106);
                            continue block41;
                        }
                    }
                    break;
                }
                this.color.setValue(v7);
                if (var2_4 || var2_4) ** GOTO lbl44
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = gk.ki - gk.ebky("ebxl", eble(int ), (int)107)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == gk.ebky("ebxm", ebkv(int ), (int)94)) break;
                    v10 /* !! */  = (long)gk.ebky("ebxn", ebkv(int ), (int)95);
                }
                this.applyGlobally(var1_1);
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)gk.ebky("ebxs", ebkv(int ), (int)96);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl96:
            // 3 sources

            case 1: {
                do {
                    var3_3 /* !! */  = (int)gk.ebky("ebxt", ebkv(int ), (int)97);
                } while (!var4_2);
                throw null;
            }
lbl101:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)gk.ebky("ebxu", ebkv(int ), (int)98);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 3: {
                var3_3 /* !! */  = (int)gk.ebky("ebxv", ebkv(int ), (int)99);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl121
            }
lbl111:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)gk.ebky("ebxw", ebkv(int ), (int)100);
                if (!var4_2) ** GOTO lbl96
                throw null;
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gk.ebky("ebxx", ebkv(int ), (int)101);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl125
                    break;
                }
            }
lbl121:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)gk.ebky("ebxy", ebkv(int ), (int)102);
                if (var4_2) {
                    throw null;
                }
            }
lbl125:
            // 4 sources

            case 7: {
                var3_3 /* !! */  = (int)gk.ebky("ebyc", ebkv(int ), (int)103);
                if (!var4_2) ** GOTO lbl96
                throw null;
            }
lbl129:
            // 3 sources

            case 8: {
                var3_3 /* !! */  = (int)gk.ebky("ebye", ebkv(int ), (int)104);
                if (!var4_2) ** GOTO lbl101
                throw null;
            }
            case 9: {
                do {
                    var3_3 /* !! */  = (int)gk.ebky("ebyf", ebkv(int ), (int)105);
                } while (!var4_2);
                throw null;
            }
            case 10: {
                var3_3 /* !! */  = (int)gk.ebky("ebyh", ebkv(int ), (int)106);
                if (!var4_2) ** GOTO lbl129
                throw null;
            }
            case 11: {
                var3_3 /* !! */  = (int)gk.ebky("ebyi", ebkv(int ), (int)107);
                if (!var4_2) ** GOTO lbl111
                throw null;
            }
            case 12: 
        }
        var3_3 /* !! */  = (int)gk.ebky("ebyl", ebkv(int ), (int)108);
        ** while (!var4_2)
lbl149:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static gk getInstance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gk.ki - gk.ebky("eblh", eble(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gk.ebky("ebli", ebkv(int ), (int)5)) break;
            v0 /* !! */  = (long)gk.ebky("eblj", ebkv(int ), (int)6);
        }
        var2 = gk.c;
        v1 /* !! */  = gk.ki;
        if (true) ** GOTO lbl12
        block15: while (true) {
            v1 /* !! */  = (long)(gk.ebky("ebll", eble(int ), (int)2) - gk.ebky("eblk", eble(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1451989544: {
                    break block15;
                }
                case -966170131: {
                    continue block15;
                }
            }
            break;
        }
        var1_1 /* !! */  = gk.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = gk.ki - gk.ebky("eblm", eble(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gk.ebky("ebln", ebkv(int ), (int)7)) break;
            v2 /* !! */  = (long)gk.ebky("eblo", ebkv(int ), (int)8);
        }
        var0_2 = gk.a;
        if (!var2) ** GOTO lbl31
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl31:
                // 1 sources

                if (var0_2 || var0_2) continue block17;
                v3 /* !! */  = gk.ki;
                if (true) ** GOTO lbl36
                block18: while (true) {
                    v3 /* !! */  = (long)(gk.ebky("eblq", eble(int ), (int)5) - gk.ebky("eblp", eble(int ), (int)4));
lbl36:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1451989544: {
                            break block18;
                        }
                        case -792926144: {
                            continue block18;
                        }
                    }
                    break;
                }
                return nj.get(gk.class);
                case 0: {
                    do {
                        var1_1 /* !! */  = (int)gk.ebky("eblr", ebkv(int ), (int)9);
                    } while (!var2);
                    throw null;
                }
                case 1: {
                    var1_1 /* !! */  = (int)gk.ebky("ebls", ebkv(int ), (int)10);
                    if (!var2) break block17;
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 /* !! */  = (int)gk.ebky("eblt", ebkv(int ), (int)11);
                        if (!var2) break block17;
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var1_1 /* !! */  = (int)gk.ebky("eblu", ebkv(int ), (int)12);
        ** while (!var2)
lbl59:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void applyGlobally() {
        block24: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = gk.ki - gk.ebky("ebym", eble(int ), (int)108)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == gk.ebky("ebyn", ebkv(int ), (int)109)) break;
                v0 /* !! */  = (long)gk.ebky("ebyo", ebkv(int ), (int)110);
            }
            var3_1 = gk.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_2 = gk.ki - gk.ebky("ebyp", eble(int ), (int)109)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == gk.ebky("ebyq", ebkv(int ), (int)111)) break;
                v1 /* !! */  = (long)gk.ebky("ebyr", ebkv(int ), (int)112);
            }
            var2_2 /* !! */  = gk.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_3 = gk.ki - gk.ebky("ebyt", eble(int ), (int)110)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == gk.ebky("ebyu", ebkv(int ), (int)113)) {
                    var1_3 = gk.a;
                    if (var3_1) {
                        throw null;
                    }
                    break;
                }
                v2 /* !! */  = (long)gk.ebky("ebyw", ebkv(int ), (int)114);
            }
            if (var1_3 || var1_3) return;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_4 = gk.ki - gk.ebky("ebyy", eble(int ), (int)111)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == gk.ebky("ebza", ebkv(int ), (int)115)) break;
                v3 /* !! */  = (long)gk.ebky("ebzb", ebkv(int ), (int)116);
            }
            v4 = this.selectedPalette();
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_5 = gk.ki - gk.ebky("ebzc", eble(int ), (int)112)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == gk.ebky("ebzd", ebkv(int ), (int)117)) {
                    this.applyGlobally(v4);
                    if (var1_3) return;
                    break;
                }
                v5 /* !! */  = (long)gk.ebky("ebze", ebkv(int ), (int)118);
            }
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block13: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (!var1_3) return;
                        return;
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)gk.ebky("ebzf", ebkv(int ), (int)119);
                        if (!var3_1) ** break;
                        throw null;
                    }
                    case 1: {
                        do {
                            var2_2 /* !! */  = (int)gk.ebky("ebzg", ebkv(int ), (int)120);
                        } while (!var3_1);
                        throw null;
                    }
                    case 2: {
                        do {
                            var2_2 /* !! */  = (int)gk.ebky("ebzh", ebkv(int ), (int)121);
                        } while (!var3_1);
                        throw null;
                    }
                    case 3: {
                        ** break;
                    }
                    case 5: {
                        break block24;
                    }
lbl62:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)gk.ebky("ebzj", ebkv(int ), (int)122);
                        cfr_temp_0 = 4;
                        if (!var3_1) continue block13;
                        throw null;
                    }
                    case 4: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)gk.ebky("ebzp", ebkv(int ), (int)123);
            if (!var3_1) ** break;
            throw null;
        }
        var2_2 /* !! */  = (int)gk.ebky("ebzr", ebkv(int ), (int)124);
        ** while (!var3_1)
lbl76:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public gk$Palette selectedPalette() {
        block75: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = gk.ki - gk.ebky("ebpw", eble(int ), (int)35)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == gk.ebky("ebpx", ebkv(int ), (int)42)) break;
                v0 /* !! */  = (long)gk.ebky("ebpy", ebkv(int ), (int)43);
            }
            var4_1 = gk.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = gk.ki - gk.ebky("ebqa", eble(int ), (int)36)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == gk.ebky("ebqb", ebkv(int ), (int)44)) break;
                v1 /* !! */  = (long)gk.ebky("ebqc", ebkv(int ), (int)45);
            }
            var3_2 = gk.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = gk.ki - gk.ebky("ebqe", eble(int ), (int)37)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == gk.ebky("ebqf", ebkv(int ), (int)46)) break;
                v2 /* !! */  = (long)gk.ebky("ebqg", ebkv(int ), (int)47);
            }
            var2_3 = gk.a;
            if (var4_1) {
                throw null;
lbl24:
                // 5 sources

                return null;
            }
            if (var2_3 || var2_3) ** GOTO lbl24
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_3 = gk.ki - gk.ebky("ebql", eble(int ), (int)38)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == gk.ebky("ebqm", ebkv(int ), (int)48)) break;
                v3 /* !! */  = (long)gk.ebky("ebqn", ebkv(int ), (int)49);
            }
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_4 = gk.ki - gk.ebky("ebqo", eble(int ), (int)39)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == gk.ebky("ebqp", ebkv(int ), (int)50)) break;
                v4 /* !! */  = (long)gk.ebky("ebqs", ebkv(int ), (int)51);
            }
            v5 /* !! */  = gk.ki;
            if (true) ** GOTO lbl43
            block52: while (true) {
                v5 /* !! */  = (long)(v6 - gk.ebky("ebqt", eble(int ), (int)40));
lbl43:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1451989544: {
                        break block52;
                    }
                    case 343587190: {
                        v6 = gk.ebky("ebqv", eble(int ), (int)41);
                        continue block52;
                    }
                    case 769810522: {
                        v6 = gk.ebky("ebqw", eble(int ), (int)42);
                        continue block52;
                    }
                    case 1238430179: {
                        v6 = gk.ebky("ebqy", eble(int ), (int)43);
                        continue block52;
                    }
                }
                break;
            }
            v7 = this.color.getValue();
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_5 = gk.ki - gk.ebky("ebqz", eble(int ), (int)44)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v8 /* !! */  == gk.ebky("ebrb", ebkv(int ), (int)52)) break;
                v8 /* !! */  = (long)gk.ebky("ebrf", ebkv(int ), (int)53);
            }
            v9 /* !! */  = gk.ki;
            if (true) ** GOTO lbl66
            block54: while (true) {
                v9 /* !! */  = (long)(v10 - gk.ebky("ebrg", eble(int ), (int)45));
lbl66:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1451989544: {
                        break block54;
                    }
                    case -1238822341: {
                        v10 = gk.ebky("ebrh", eble(int ), (int)46);
                        continue block54;
                    }
                    case 1794169446: {
                        v10 = gk.ebky("ebri", eble(int ), (int)47);
                        continue block54;
                    }
                }
                break;
            }
            v11 = this.color.getValue();
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_6 = gk.ki - gk.ebky("ebrj", eble(int ), (int)48)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v12 /* !! */  == gk.ebky("ebrk", ebkv(int ), (int)54)) break;
                v12 /* !! */  = (long)gk.ebky("ebro", ebkv(int ), (int)55);
            }
            var1_4 = gk.LEGACY_THEMES.getOrDefault(v7, v11);
            if (var2_3 || var2_3) ** GOTO lbl24
            v13 /* !! */  = gk.ki;
            if (true) ** GOTO lbl88
            block56: while (true) {
                v13 /* !! */  = (long)(v14 - gk.ebky("ebrq", eble(int ), (int)49));
lbl88:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -2097172241: {
                        v14 = gk.ebky("ebrs", eble(int ), (int)50);
                        continue block56;
                    }
                    case -1921202712: {
                        v14 = gk.ebky("ebrt", eble(int ), (int)51);
                        continue block56;
                    }
                    case -1451989544: {
                        break block56;
                    }
                    case -546709730: {
                        v14 = gk.ebky("ebrv", eble(int ), (int)52);
                        continue block56;
                    }
                }
                break;
            }
            v15 /* !! */  = gk.ki;
            if (true) ** GOTO lbl104
            block57: while (true) {
                v15 /* !! */  = (long)(v16 - gk.ebky("ebrw", eble(int ), (int)53));
lbl104:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -1451989544: {
                        break block57;
                    }
                    case 309913131: {
                        v16 = gk.ebky("ebry", eble(int ), (int)54);
                        continue block57;
                    }
                    case 604906532: {
                        v16 = gk.ebky("ebsa", eble(int ), (int)55);
                        continue block57;
                    }
                }
                break;
            }
            v17 = this.color.getValue();
            v18 /* !! */  = gk.ki;
            if (true) ** GOTO lbl118
            block58: while (true) {
                v18 /* !! */  = (long)(v19 - gk.ebky("ebsb", eble(int ), (int)56));
lbl118:
                // 2 sources

                switch ((int)v18 /* !! */ ) {
                    case -1451989544: {
                        break block58;
                    }
                    case -954577588: {
                        v19 = gk.ebky("ebsd", eble(int ), (int)57);
                        continue block58;
                    }
                    case -287502789: {
                        v19 = gk.ebky("ebse", eble(int ), (int)58);
                        continue block58;
                    }
                    case 1189737450: {
                        v19 = gk.ebky("ebsg", eble(int ), (int)59);
                        continue block58;
                    }
                }
                break;
            }
            if (var1_4.equals(v17)) break block75;
            if (var2_3 || var2_3) ** GOTO lbl24
            v20 /* !! */  = gk.ki;
            if (true) ** GOTO lbl136
            block59: while (true) {
                v20 /* !! */  = (long)(v21 - gk.ebky("ebsi", eble(int ), (int)60));
lbl136:
                // 2 sources

                switch ((int)v20 /* !! */ ) {
                    case -1451989544: {
                        break block59;
                    }
                    case 1678095856: {
                        v21 = gk.ebky("ebsm", eble(int ), (int)61);
                        continue block59;
                    }
                    case 1892629738: {
                        v21 = gk.ebky("ebsn", eble(int ), (int)62);
                        continue block59;
                    }
                }
                break;
            }
            v22 /* !! */  = gk.ki;
            if (true) ** GOTO lbl149
            block60: while (true) {
                v22 /* !! */  = (long)(v23 - gk.ebky("ebso", eble(int ), (int)63));
lbl149:
                // 2 sources

                switch ((int)v22 /* !! */ ) {
                    case -1882960562: {
                        v23 = gk.ebky("ebsp", eble(int ), (int)64);
                        continue block60;
                    }
                    case -1451989544: {
                        break block60;
                    }
                    case 655243799: {
                        v23 = gk.ebky("ebsq", eble(int ), (int)65);
                        continue block60;
                    }
                }
                break;
            }
            this.color.setValue(var1_4);
            if (var2_3) ** GOTO lbl24
        }
        if (!var2_3 && !var2_3) ** break;
        ** while (true)
        v24 /* !! */  = gk.ki;
        if (true) ** GOTO lbl167
        block61: while (true) {
            v24 /* !! */  = (long)(gk.ebky("ebst", eble(int ), (int)67) - gk.ebky("ebss", eble(int ), (int)66));
lbl167:
            // 2 sources

            switch ((int)v24 /* !! */ ) {
                case -1451989544: {
                    break block61;
                }
                case -207733646: {
                    continue block61;
                }
            }
            break;
        }
        while (true) {
            if ((v25 /* !! */  = (cfr_temp_7 = gk.ki - gk.ebky("ebsx", eble(int ), (int)68)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v25 /* !! */  == gk.ebky("ebsy", ebkv(int ), (int)56)) break;
            v25 /* !! */  = (long)gk.ebky("ebsz", ebkv(int ), (int)57);
        }
        v26 /* !! */  = gk.ki;
        if (true) ** GOTO lbl182
        block63: while (true) {
            v26 /* !! */  = (long)(gk.ebky("ebtb", eble(int ), (int)70) - gk.ebky("ebta", eble(int ), (int)69));
lbl182:
            // 2 sources

            switch ((int)v26 /* !! */ ) {
                case -1517380259: {
                    continue block63;
                }
                case -1451989544: {
                    break block63;
                }
            }
            break;
        }
        while (true) {
            if ((v27 /* !! */  = (cfr_temp_8 = gk.ki - gk.ebky("ebtc", eble(int ), (int)71)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v27 /* !! */  == gk.ebky("ebtd", ebkv(int ), (int)58)) break;
            v27 /* !! */  = (long)gk.ebky("ebtf", ebkv(int ), (int)59);
        }
        return gk.PALETTES_BY_NAME.getOrDefault(var1_4, gk.PALETTES_BY_NAME.get("JShine"));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getColorAt(float var1_1, int var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gk.ki - gk.ebky("ebmu", eble(int ), (int)16)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gk.ebky("ebna", ebkv(int ), (int)21)) break;
            v0 /* !! */  = (long)gk.ebky("ebnc", ebkv(int ), (int)22);
        }
        var7_3 = gk.c;
        v1 /* !! */  = gk.ki;
        if (true) ** GOTO lbl11
        block36: while (true) {
            v1 /* !! */  = (long)(v2 - gk.ebky("ebne", eble(int ), (int)17));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1451989544: {
                    break block36;
                }
                case -376422929: {
                    v2 = gk.ebky("ebnf", eble(int ), (int)18);
                    continue block36;
                }
                case -282474716: {
                    v2 = gk.ebky("ebng", eble(int ), (int)19);
                    continue block36;
                }
                case 589341357: {
                    v2 = gk.ebky("ebnh", eble(int ), (int)20);
                    continue block36;
                }
            }
            break;
        }
        var6_4 /* !! */  = gk.b;
        v3 /* !! */  = gk.ki;
        if (true) ** GOTO lbl28
        block37: while (true) {
            v3 /* !! */  = (long)(v4 - gk.ebky("ebni", eble(int ), (int)21));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1451989544: {
                    break block37;
                }
                case 588446391: {
                    v4 = gk.ebky("ebnk", eble(int ), (int)22);
                    continue block37;
                }
                case 1220636726: {
                    v4 = gk.ebky("ebnm", eble(int ), (int)23);
                    continue block37;
                }
            }
            break;
        }
        var5_5 = gk.a;
        if (var7_3) {
            throw null;
lbl40:
            // 3 sources

            return (int)gk.ebky("ebno", ebkv(int ), (int)23);
        }
        if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_5 || var5_5) ** GOTO lbl40
                v5 /* !! */  = gk.ki;
                if (true) ** GOTO lbl50
                block39: while (true) {
                    v5 /* !! */  = (long)(gk.ebky("ebnr", eble(int ), (int)25) - gk.ebky("ebnp", eble(int ), (int)24));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2108776266: {
                            continue block39;
                        }
                        case -1451989544: {
                            break block39;
                        }
                    }
                    break;
                }
                var3_6 = this.selectedPalette();
                if (var5_5 || var5_5) ** GOTO lbl40
                v6 = gk.ebky("ebnu", ebkv(int ), (int)24);
                v7 = var1_1 * gk.ebky("ebny", ebnv(int ), (int)25);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = gk.ki - gk.ebky("eboa", eble(int ), (int)26)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == gk.ebky("ebob", ebkv(int ), (int)26)) break;
                    v8 /* !! */  = (long)gk.ebky("eboe", ebkv(int ), (int)27);
                }
                v9 = Math.round(v7);
                v10 /* !! */  = gk.ki;
                if (true) ** GOTO lbl69
                block41: while (true) {
                    v10 /* !! */  = (long)(v11 - gk.ebky("ebof", eble(int ), (int)27));
lbl69:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1451989544: {
                            break block41;
                        }
                        case -1159812052: {
                            v11 = gk.ebky("eboi", eble(int ), (int)28);
                            continue block41;
                        }
                        case 192053813: {
                            v11 = gk.ebky("ebok", eble(int ), (int)29);
                            continue block41;
                        }
                        case 312433496: {
                            v11 = gk.ebky("ebom", eble(int ), (int)30);
                            continue block41;
                        }
                    }
                    break;
                }
                v12 = var3_6.colors();
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_2 = gk.ki - gk.ebky("ebon", eble(int ), (int)31)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == gk.ebky("ebop", ebkv(int ), (int)28)) break;
                    v13 /* !! */  = (long)gk.ebky("ebor", ebkv(int ), (int)29);
                }
                var4_7 = ol.color((int)v6, v9, v12);
                if (var5_5 || var5_5) ** continue;
                v14 = gk.ebky("ebot", ebkv(int ), (int)30);
                v15 = gk.ebky("ebov", ebkv(int ), (int)31);
                v16 /* !! */  = gk.ki;
                if (true) ** GOTO lbl95
                block43: while (true) {
                    v16 /* !! */  = (long)(gk.ebky("eboy", eble(int ), (int)33) - gk.ebky("ebow", eble(int ), (int)32));
lbl95:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1451989544: {
                            break block43;
                        }
                        case -452333196: {
                            continue block43;
                        }
                    }
                    break;
                }
                v17 = class_3532.method_15340((int)var2_2, (int)v14, (int)v15);
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_3 = gk.ki - gk.ebky("eboz", eble(int ), (int)34)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == gk.ebky("ebpa", ebkv(int ), (int)32)) break;
                    v18 /* !! */  = (long)gk.ebky("ebpb", ebkv(int ), (int)33);
                }
                return nd.replAlpha(var4_7, v17);
            }
            case 0: {
                var6_4 /* !! */  = (int)gk.ebky("ebph", ebkv(int ), (int)34);
                if (var7_3) {
                    throw null;
                }
            }
lbl111:
            // 5 sources

            case 1: {
                do {
                    var6_4 /* !! */  = (int)gk.ebky("ebpi", ebkv(int ), (int)35);
                } while (!var7_3);
                throw null;
            }
lbl116:
            // 2 sources

            case 2: {
                var6_4 /* !! */  = (int)gk.ebky("ebpj", ebkv(int ), (int)36);
                if (!var7_3) ** GOTO lbl111
                throw null;
            }
            case 3: {
                var6_4 /* !! */  = (int)gk.ebky("ebpk", ebkv(int ), (int)37);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl125:
            // 2 sources

            case 4: {
                var6_4 /* !! */  = (int)gk.ebky("ebpl", ebkv(int ), (int)38);
                if (!var7_3) ** GOTO lbl116
                throw null;
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_4 /* !! */  = (int)gk.ebky("ebpm", ebkv(int ), (int)39);
                    if (!var7_3) ** GOTO lbl125
                    throw null;
                }
            }
lbl134:
            // 2 sources

            case 6: {
                var6_4 /* !! */  = (int)gk.ebky("ebpo", ebkv(int ), (int)40);
                if (!var7_3) ** GOTO lbl111
                throw null;
            }
            case 7: 
        }
        var6_4 /* !! */  = (int)gk.ebky("ebps", ebkv(int ), (int)41);
        ** while (!var7_3)
lbl141:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int ebkv(int n2) {
        return ebkw[n2] ^ ebkx[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public gk() {
        var2_1 /* !! */  = gk.b;
        super("Theme", "\u0412\u044b\u0431\u043e\u0440 \u0433\u043e\u0442\u043e\u0432\u043e\u0439 \u0442\u0435\u043c\u044b \u043a\u043b\u0438\u0435\u043d\u0442\u0430", du.OTHER);
        this.color = new kf("\u0422\u0435\u043c\u0430", "\u0426\u0432\u0435\u0442 ClickGUI, HUD \u0438 \u0432\u0438\u0437\u0443\u0430\u043b\u044c\u043d\u044b\u0445 \u044d\u0444\u0444\u0435\u043a\u0442\u043e\u0432", "JShine", (String[])gk.PALETTES.stream().map((Function<gk$Palette, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, name(), (Lruhack/phobia/gk$Palette;)Ljava/lang/String;)()).toArray((IntFunction<String[]>)LambdaMetafactory.metafactory(null, null, null, (I)Ljava/lang/Object;, lambda$new$1(int ), (I)[Ljava/lang/String;)())).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$2(), ()Ljava/lang/Boolean;)());
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.settings(new jx[]{this.color});
                return;
            }
lbl9:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)gk.ebky("ebkz", ebkv(int ), (int)0);
                break;
            }
lbl12:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)gk.ebky("ebla", ebkv(int ), (int)1);
                ** GOTO lbl18
            }
            case 2: {
                var2_1 /* !! */  = (int)gk.ebky("eblb", ebkv(int ), (int)2);
                ** GOTO lbl12
            }
lbl18:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)gk.ebky("eblc", ebkv(int ), (int)3);
                    ** GOTO lbl9
                    break;
                }
            }
            case 4: 
        }
        var2_1 /* !! */  = (int)gk.ebky("ebld", ebkv(int ), (int)4);
        ** while (true)
    }
}

