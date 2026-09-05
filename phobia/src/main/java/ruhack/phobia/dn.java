/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.minecraft.class_310;
import ruhack.phobia.al;
import ruhack.phobia.aw;
import ruhack.phobia.ax;
import ruhack.phobia.cn;
import ruhack.phobia.df;
import ruhack.phobia.dm;
import ruhack.phobia.nx;

public class dn {
    private int stopTicks;
    static final long eg = -4437914653936909397L;
    private final nx movement;
    public static final boolean c;
    private static long[] btjz;
    public static final int b;
    private dm pendingMacro;
    public static final boolean a;
    private final List<dm> macroList;
    private static dn instance;
    private static int[] btjp;
    private static long[] btka;
    private final class_310 mc;
    private static int[] btjo;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void init() {
        v0 /* !! */  = dn.eg;
        if (true) ** GOTO lbl5
        block27: while (true) {
            v0 /* !! */  = (long)(v1 - dn.btjq("btli", btjy(int ), (int)14));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2107909663: {
                    v1 = dn.btjq("btlj", btjy(int ), (int)15);
                    continue block27;
                }
                case -1533606997: {
                    break block27;
                }
                case 148861018: {
                    v1 = dn.btjq("btlk", btjy(int ), (int)16);
                    continue block27;
                }
            }
            break;
        }
        var3_1 = dn.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = dn.eg - dn.btjq("btll", btjy(int ), (int)17)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == dn.btjq("btlm", btjn(int ), (int)26)) break;
            v2 /* !! */  = (long)dn.btjq("btln", btjn(int ), (int)27);
        }
        var2_2 /* !! */  = dn.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = dn.eg - dn.btjq("btlo", btjy(int ), (int)18)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == dn.btjq("btlp", btjn(int ), (int)28)) break;
            v3 /* !! */  = (long)dn.btjq("btlq", btjn(int ), (int)29);
        }
        var1_3 = dn.a;
        if (var3_1) {
            throw null;
lbl29:
            // 4 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = dn.eg - dn.btjq("btlr", btjy(int ), (int)19)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == dn.btjq("btls", btjn(int ), (int)30)) break;
            v4 /* !! */  = (long)dn.btjq("btlt", btjn(int ), (int)31);
        }
        ax.register(this);
        if (var1_3 || var1_3) ** GOTO lbl29
        v5 /* !! */  = dn.eg;
        if (true) ** GOTO lbl43
        block32: while (true) {
            v5 /* !! */  = (long)(v6 - dn.btjq("btlu", btjy(int ), (int)20));
lbl43:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1533606997: {
                    break block32;
                }
                case -1192637360: {
                    v6 = dn.btjq("btlv", btjy(int ), (int)21);
                    continue block32;
                }
                case 1262977198: {
                    v6 = dn.btjq("btlw", btjy(int ), (int)22);
                    continue block32;
                }
                case 1849192267: {
                    v6 = dn.btjq("btlx", btjy(int ), (int)23);
                    continue block32;
                }
            }
            break;
        }
        v7 = al.getInstance();
        v8 /* !! */  = dn.eg;
        if (true) ** GOTO lbl60
        block33: while (true) {
            v8 /* !! */  = (long)(v9 - dn.btjq("btly", btjy(int ), (int)24));
lbl60:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1533606997: {
                    break block33;
                }
                case -1408070919: {
                    v9 = dn.btjq("btlz", btjy(int ), (int)25);
                    continue block33;
                }
                case 172778191: {
                    v9 = dn.btjq("btma", btjy(int ), (int)26);
                    continue block33;
                }
                case 1895602674: {
                    v9 = dn.btjq("btmb", btjy(int ), (int)27);
                    continue block33;
                }
            }
            break;
        }
        v7.load();
        if (var1_3) ** GOTO lbl29
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)dn.btjq("btmc", btjn(int ), (int)32);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl99
            }
lbl85:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)dn.btjq("btmd", btjn(int ), (int)33);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl99
            }
            case 2: {
                var2_2 /* !! */  = (int)dn.btjq("btme", btjn(int ), (int)34);
                if (!var3_1) break;
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)dn.btjq("btmf", btjn(int ), (int)35);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl99:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)dn.btjq("btmg", btjn(int ), (int)36);
                if (var3_1) {
                    throw null;
                }
            }
lbl103:
            // 4 sources

            case 5: {
                var2_2 /* !! */  = (int)dn.btjq("btmh", btjn(int ), (int)37);
                if (!var3_1) ** GOTO lbl85
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)dn.btjq("btmi", btjn(int ), (int)38);
                if (!var3_1) ** GOTO lbl103
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)dn.btjq("btmj", btjn(int ), (int)39);
        ** while (!var3_1)
lbl114:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void buwk() {
        dn.btjo[200] = 197993953;
        dn.btjo[201] = -1314724492;
        dn.btjo[202] = 831874283;
        dn.btjo[203] = 874488657;
        dn.btjo[204] = 1803120122;
        dn.btjo[205] = -1065035185;
        dn.btjo[206] = 1367455082;
        dn.btjo[207] = 735632307;
        dn.btjo[208] = -1367466448;
        dn.btjo[209] = 1679349106;
        dn.btjo[210] = -1285827124;
        dn.btjo[211] = -2019922861;
        dn.btjo[212] = -999779032;
        dn.btjo[213] = 370868171;
        dn.btjo[214] = -1296764963;
        dn.btjo[215] = 1493515582;
        dn.btjo[216] = -609040365;
        dn.btjo[217] = -848028158;
        dn.btjo[218] = 1925370700;
        dn.btjo[219] = -1753780880;
        dn.btjo[220] = 961984152;
        dn.btjo[221] = 65375408;
        dn.btjo[222] = -2133094;
        dn.btjo[223] = -655691536;
        dn.btjo[224] = -797383174;
        dn.btjo[225] = 1694945782;
        dn.btjo[226] = -658318039;
        dn.btjo[227] = 86593371;
        dn.btjo[228] = 642455167;
        dn.btjo[229] = -1787827726;
        dn.btjo[230] = 622721324;
        dn.btjo[231] = -1969338580;
        dn.btjo[232] = 312977833;
        dn.btjo[233] = -252071775;
        dn.btjo[234] = 1657647596;
        dn.btjo[235] = 543905803;
        dn.btjo[236] = -1862702382;
        dn.btjo[237] = -642773171;
        dn.btjo[238] = -163361609;
        dn.btjo[239] = -1426425237;
        dn.btjo[240] = -838160678;
        dn.btjo[241] = -1129853370;
        dn.btjo[242] = 2000162075;
        dn.btjo[243] = -143751427;
        dn.btjo[244] = -644743293;
        dn.btjo[245] = -123456645;
        dn.btjo[246] = -980454183;
        dn.btjo[247] = 187961946;
        dn.btjo[248] = 1023526381;
        dn.btjo[249] = 1654049888;
        dn.btjo[250] = 2091693535;
        dn.btjo[251] = 266191143;
        dn.btjo[252] = 1199810575;
        dn.btjo[253] = -212031686;
        dn.btjo[254] = 1344021072;
        dn.btjo[255] = -777780136;
        dn.btjo[256] = 1419694291;
        dn.btjo[257] = -889458640;
        dn.btjo[258] = 1212047190;
        dn.btjo[259] = 480346159;
        dn.btjo[260] = 943123900;
        dn.btjo[261] = -714989557;
        dn.btjo[262] = -92186392;
        dn.btjo[263] = -1652089212;
        dn.btjo[264] = -1327496566;
        dn.btjo[265] = 779596537;
        dn.btjo[266] = 968812552;
        dn.btjo[267] = 607060497;
        dn.btjo[268] = -1478128127;
        dn.btjo[269] = 1677302541;
        dn.btjo[270] = 815562501;
        dn.btjo[271] = -60060589;
        dn.btjo[272] = 156306053;
        dn.btjo[273] = -256914045;
        dn.btjo[274] = -538823334;
        dn.btjo[275] = -750374976;
        dn.btjo[276] = 1207938110;
        dn.btjo[277] = -69941267;
        dn.btjo[278] = -1898134217;
        dn.btjo[279] = -1726487264;
        dn.btjo[280] = -994001808;
        dn.btjo[281] = -410975818;
        dn.btjo[282] = -2096905719;
        dn.btjo[283] = 294398688;
        dn.btjo[284] = 912438410;
        dn.btjo[285] = 918923637;
        dn.btjo[286] = 1042582937;
        dn.btjo[287] = 350126865;
        dn.btjo[288] = 908666554;
        dn.btjo[289] = 942885447;
        dn.btjo[290] = 18241758;
        dn.btjo[291] = -1121399483;
        dn.btjo[292] = 2113719055;
        dn.btjo[293] = 234396953;
        dn.btjo[294] = 377661797;
        dn.btjo[295] = -2043570579;
        dn.btjo[296] = -1183932527;
        dn.btjo[297] = -561248276;
        dn.btjo[298] = 2023599587;
        dn.btjo[299] = -1703614007;
    }

    private static /* synthetic */ void bvco() {
        dn.btka[200] = 4933027334692771628L;
        dn.btka[201] = 3078455310806998953L;
        dn.btka[202] = 6812809464820911409L;
        dn.btka[203] = 8923854839308257130L;
        dn.btka[204] = -162786360402740065L;
        dn.btka[205] = 5210119868268349336L;
        dn.btka[206] = 3628747360649775927L;
        dn.btka[207] = 1076626518401318551L;
        dn.btka[208] = 314840660631083390L;
        dn.btka[209] = -5428262971102824754L;
        dn.btka[210] = 2355221200243038208L;
        dn.btka[211] = 4810999664509803044L;
        dn.btka[212] = -5046368075004389270L;
        dn.btka[213] = -7680299713529928950L;
        dn.btka[214] = -761605345379046591L;
        dn.btka[215] = -6655235463415883975L;
        dn.btka[216] = -410336066990831299L;
        dn.btka[217] = 8029427306040140030L;
        dn.btka[218] = 1675111359267269688L;
        dn.btka[219] = -1782769849624637466L;
        dn.btka[220] = 5459299510844015837L;
        dn.btka[221] = 8395309088950573458L;
        dn.btka[222] = -306281689571206972L;
        dn.btka[223] = 8625563727094055115L;
        dn.btka[224] = -8935300131315008669L;
        dn.btka[225] = -6917806280850917867L;
        dn.btka[226] = 4803067422876183459L;
        dn.btka[227] = 8766890297509675191L;
        dn.btka[228] = -4818457223410287055L;
        dn.btka[229] = -6591709016402875891L;
        dn.btka[230] = 1565267878087318276L;
        dn.btka[231] = -4808349528902605349L;
        dn.btka[232] = 3661232309580858028L;
        dn.btka[233] = 4422489897928919964L;
        dn.btka[234] = -6376829226175082410L;
        dn.btka[235] = 8722681545348101415L;
        dn.btka[236] = -2174838751685502778L;
        dn.btka[237] = -7405062303228873924L;
        dn.btka[238] = 1956836741197524879L;
        dn.btka[239] = -6451322797166149649L;
        dn.btka[240] = -171365682344138112L;
        dn.btka[241] = 4910503457645161081L;
        dn.btka[242] = -660042137289581721L;
        dn.btka[243] = 1360895764423310827L;
        dn.btka[244] = -609161528103468206L;
        dn.btka[245] = 1657076401905320686L;
        dn.btka[246] = -4293149280134492207L;
        dn.btka[247] = 8985811641146983567L;
        dn.btka[248] = -3386447944849908854L;
        dn.btka[249] = -3631595273897432435L;
        dn.btka[250] = -3905030257547742406L;
        dn.btka[251] = -1253207149062308213L;
        dn.btka[252] = 7585100250305530891L;
        dn.btka[253] = -3822715008110608140L;
        dn.btka[254] = 3329749419160188179L;
        dn.btka[255] = 6374817719429522113L;
        dn.btka[256] = -78679755080769290L;
        dn.btka[257] = -6852767675089043673L;
        dn.btka[258] = -1089782699685122602L;
        dn.btka[259] = -8627102034994360273L;
        dn.btka[260] = -5737402694343753938L;
        dn.btka[261] = 2425900518983081238L;
        dn.btka[262] = 6242316623097754395L;
        dn.btka[263] = -8374908295396861069L;
        dn.btka[264] = 1344920925781619173L;
        dn.btka[265] = 8510947270137248153L;
        dn.btka[266] = 3420020513431988222L;
        dn.btka[267] = -7851461426316766908L;
        dn.btka[268] = 3642144180099502615L;
        dn.btka[269] = 2698135538816782454L;
        dn.btka[270] = -4397171379534474772L;
        dn.btka[271] = 1971213074748159166L;
        dn.btka[272] = -43450529825053278L;
        dn.btka[273] = 5745907133139218821L;
        dn.btka[274] = -5104499941997808220L;
        dn.btka[275] = 4974900958559828578L;
        dn.btka[276] = 2936215297256132445L;
        dn.btka[277] = 1425618808451114468L;
        dn.btka[278] = -6975101438207793167L;
        dn.btka[279] = -830114223553848646L;
        dn.btka[280] = 1187682463435218261L;
        dn.btka[281] = 6204858881755510607L;
        dn.btka[282] = -3532834677196850684L;
        dn.btka[283] = -1756083572249795197L;
        dn.btka[284] = -596558942660679150L;
        dn.btka[285] = 1727670279547193631L;
        dn.btka[286] = -2924497408134963463L;
        dn.btka[287] = 7018903410675810547L;
        dn.btka[288] = -6445759511774844951L;
        dn.btka[289] = -888992278991461058L;
        dn.btka[290] = -1935720138402084700L;
        dn.btka[291] = 4824490250373585778L;
        dn.btka[292] = -5371618424346288132L;
        dn.btka[293] = -8265269184302800180L;
        dn.btka[294] = 9097081326452682901L;
        dn.btka[295] = -3596013270117814817L;
        dn.btka[296] = 2375592647311688961L;
        dn.btka[297] = 7216851548821568370L;
        dn.btka[298] = 2391368384649038719L;
        dn.btka[299] = -84618254672595755L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public dn() {
        var2_1 /* !! */  = dn.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.macroList = new ArrayList<dm>();
                this.mc = class_310.method_1551();
                this.movement = new nx();
                dn.instance = this;
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)dn.btjq("btjr", btjn(int ), (int)0);
                ** GOTO lbl24
            }
            case 1: {
                var2_1 /* !! */  = (int)dn.btjq("btjs", btjn(int ), (int)1);
                ** GOTO lbl20
            }
            case 2: {
                var2_1 /* !! */  = (int)dn.btjq("btjt", btjn(int ), (int)2);
                break;
            }
lbl20:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)dn.btjq("btju", btjn(int ), (int)3);
                    continue;
                    break;
                }
            }
lbl24:
            // 3 sources

            case 4: {
                var2_1 /* !! */  = (int)dn.btjq("btjv", btjn(int ), (int)4);
                break;
            }
            case 5: {
                var2_1 /* !! */  = (int)dn.btjq("btjw", btjn(int ), (int)5);
                ** GOTO lbl24
            }
            case 6: 
        }
        var2_1 /* !! */  = (int)dn.btjq("btjx", btjn(int ), (int)6);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List<String> getMacroNames() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dn.eg - dn.btjq("btux", btjy(int ), (int)137)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == dn.btjq("btuy", btjn(int ), (int)152)) break;
            v0 /* !! */  = (long)dn.btjq("btuz", btjn(int ), (int)153);
        }
        var3_1 = dn.c;
        v1 /* !! */  = dn.eg;
        if (true) ** GOTO lbl11
        block25: while (true) {
            v1 /* !! */  = (long)(dn.btjq("btvb", btjy(int ), (int)139) - dn.btjq("btva", btjy(int ), (int)138));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1533606997: {
                    break block25;
                }
                case 1127427987: {
                    continue block25;
                }
            }
            break;
        }
        var2_2 /* !! */  = dn.b;
        v2 /* !! */  = dn.eg;
        if (true) ** GOTO lbl21
        block26: while (true) {
            v2 /* !! */  = (long)(dn.btjq("btvd", btjy(int ), (int)141) - dn.btjq("btvc", btjy(int ), (int)140));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1533606997: {
                    break block26;
                }
                case 393370968: {
                    continue block26;
                }
            }
            break;
        }
        var1_3 = dn.a;
        if (var3_1) {
            throw null;
lbl29:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl29
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = dn.eg - dn.btjq("btve", btjy(int ), (int)142)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == dn.btjq("btvf", btjn(int ), (int)154)) break;
                    v3 /* !! */  = (long)dn.btjq("btvg", btjn(int ), (int)155);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = dn.eg - dn.btjq("btvh", btjy(int ), (int)143)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == dn.btjq("btvi", btjn(int ), (int)156)) break;
                    v4 /* !! */  = (long)dn.btjq("btvj", btjn(int ), (int)157);
                }
                v5 = this.macroList.stream();
                v6 /* !! */  = dn.eg;
                if (true) ** GOTO lbl51
                block30: while (true) {
                    v6 /* !! */  = (long)(v7 - dn.btjq("btvk", btjy(int ), (int)144));
lbl51:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1561414380: {
                            v7 = dn.btjq("btvl", btjy(int ), (int)145);
                            continue block30;
                        }
                        case -1533606997: {
                            break block30;
                        }
                        case 2127746855: {
                            v7 = dn.btjq("btvm", btjy(int ), (int)146);
                            continue block30;
                        }
                    }
                    break;
                }
                v8 = (Function<dm, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, name(), (Lruhack/phobia/dm;)Ljava/lang/String;)();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = dn.eg - dn.btjq("btvn", btjy(int ), (int)147)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == dn.btjq("btvo", btjn(int ), (int)158)) break;
                    v9 /* !! */  = (long)dn.btjq("btvp", btjn(int ), (int)159);
                }
                v10 = v5.map(v8);
                v11 /* !! */  = dn.eg;
                if (true) ** GOTO lbl71
                block32: while (true) {
                    v11 /* !! */  = (long)(v12 - dn.btjq("btvq", btjy(int ), (int)148));
lbl71:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1533606997: {
                            break block32;
                        }
                        case 1707751622: {
                            v12 = dn.btjq("btvr", btjy(int ), (int)149);
                            continue block32;
                        }
                        case 1903637045: {
                            v12 = dn.btjq("btvs", btjy(int ), (int)150);
                            continue block32;
                        }
                    }
                    break;
                }
                v13 = Collectors.toList();
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = dn.eg - dn.btjq("btvt", btjy(int ), (int)151)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == dn.btjq("btvu", btjn(int ), (int)160)) break;
                    v14 /* !! */  = (long)dn.btjq("btvv", btjn(int ), (int)161);
                }
                return v10.collect(v13);
            }
lbl87:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)dn.btjq("btvw", btjn(int ), (int)162);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)dn.btjq("btvx", btjn(int ), (int)163);
                if (!var3_1) ** GOTO lbl87
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)dn.btjq("btvy", btjn(int ), (int)164);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)dn.btjq("btvz", btjn(int ), (int)165);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$onKey$3(cn var0, dm var1_1) {
        block15: {
            block14: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = dn.eg - dn.btjq("bupm", btjy(int ), (int)263)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == dn.btjq("bupo", btjn(int ), (int)338)) break;
                    v0 /* !! */  = (long)dn.btjq("bups", btjn(int ), (int)339);
                }
                var4_2 = dn.c;
                v1 /* !! */  = dn.eg;
                if (true) ** GOTO lbl11
                block7: while (true) {
                    v1 /* !! */  = (long)(v2 - dn.btjq("bupt", btjy(int ), (int)264));
lbl11:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -1533606997: {
                            break block7;
                        }
                        case -526496763: {
                            v2 = dn.btjq("bupu", btjy(int ), (int)265);
                            continue block7;
                        }
                        case -18698442: {
                            v2 = dn.btjq("bupw", btjy(int ), (int)266);
                            continue block7;
                        }
                        case 186460536: {
                            v2 = dn.btjq("bupx", btjy(int ), (int)267);
                            continue block7;
                        }
                    }
                    break;
                }
                var3_3 = dn.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = dn.eg - dn.btjq("bupy", btjy(int ), (int)268)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == dn.btjq("bupz", btjn(int ), (int)340)) break;
                    v3 /* !! */  = (long)dn.btjq("buqb", btjn(int ), (int)341);
                }
                var2_4 = dn.a;
                if (var4_2) {
                    throw null;
lbl32:
                    // 3 sources

                    return (boolean)dn.btjq("buqd", btjn(int ), (int)342);
                }
                if (var2_4 || var2_4) ** GOTO lbl32
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = dn.eg - dn.btjq("buqe", btjy(int ), (int)269)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == dn.btjq("buqf", btjn(int ), (int)343)) break;
                    v4 /* !! */  = (long)dn.btjq("buqg", btjn(int ), (int)344);
                }
                v5 = var1_1.key();
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = dn.eg - dn.btjq("buqh", btjy(int ), (int)270)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == dn.btjq("buqj", btjn(int ), (int)345)) break;
                    v6 /* !! */  = (long)dn.btjq("buqo", btjn(int ), (int)346);
                }
                if (v5 != var0.key()) break block14;
                if (var2_4) ** GOTO lbl32
                v7 = dn.btjq("buqq", btjn(int ), (int)347);
                if (var4_2) {
                    throw null;
                }
                break block15;
            }
            if (!var2_4 && !var2_4) ** break;
            ** while (true)
            v7 = dn.btjq("buqs", btjn(int ), (int)348);
        }
        return (boolean)v7;
    }

    private static /* synthetic */ void buxl() {
        dn.btjp[0] = -1650672028;
        dn.btjp[1] = -1508163840;
        dn.btjp[2] = 190940524;
        dn.btjp[3] = 2004629465;
        dn.btjp[4] = -254896642;
        dn.btjp[5] = 746095217;
        dn.btjp[6] = 708076655;
        dn.btjp[7] = 1967114618;
        dn.btjp[8] = -485530437;
        dn.btjp[9] = 2035080787;
        dn.btjp[10] = -442964659;
        dn.btjp[11] = -1017400662;
        dn.btjp[12] = -1905173726;
        dn.btjp[13] = 1188823916;
        dn.btjp[14] = -1520095169;
        dn.btjp[15] = 537549484;
        dn.btjp[16] = 1080498534;
        dn.btjp[17] = -1393080432;
        dn.btjp[18] = 1085745212;
        dn.btjp[19] = -270448983;
        dn.btjp[20] = 95648879;
        dn.btjp[21] = 1272648255;
        dn.btjp[22] = -1642547376;
        dn.btjp[23] = 83514218;
        dn.btjp[24] = -738079654;
        dn.btjp[25] = -2006299329;
        dn.btjp[26] = 569725264;
        dn.btjp[27] = 1003132089;
        dn.btjp[28] = 1207778650;
        dn.btjp[29] = -475684579;
        dn.btjp[30] = 1307537558;
        dn.btjp[31] = -1405083508;
        dn.btjp[32] = -1619564079;
        dn.btjp[33] = 1511786741;
        dn.btjp[34] = 1500693490;
        dn.btjp[35] = 159401759;
        dn.btjp[36] = -1665570260;
        dn.btjp[37] = 850382779;
        dn.btjp[38] = 1939584691;
        dn.btjp[39] = -940823517;
        dn.btjp[40] = -1150620879;
        dn.btjp[41] = -837217438;
        dn.btjp[42] = 2132911500;
        dn.btjp[43] = 90797632;
        dn.btjp[44] = -1045396582;
        dn.btjp[45] = -873200755;
        dn.btjp[46] = -2142232092;
        dn.btjp[47] = 1292650498;
        dn.btjp[48] = 1047669973;
        dn.btjp[49] = 248562144;
        dn.btjp[50] = 1471265964;
        dn.btjp[51] = 625786103;
        dn.btjp[52] = 235201068;
        dn.btjp[53] = -1085630060;
        dn.btjp[54] = -1735102421;
        dn.btjp[55] = 121922395;
        dn.btjp[56] = 538063770;
        dn.btjp[57] = -1170927954;
        dn.btjp[58] = -498714048;
        dn.btjp[59] = -1921486507;
        dn.btjp[60] = 1263206451;
        dn.btjp[61] = -139836478;
        dn.btjp[62] = 113934899;
        dn.btjp[63] = 1552344858;
        dn.btjp[64] = 1380947771;
        dn.btjp[65] = 772195812;
        dn.btjp[66] = 375843687;
        dn.btjp[67] = -238698883;
        dn.btjp[68] = -1723220512;
        dn.btjp[69] = 1534199499;
        dn.btjp[70] = 547483667;
        dn.btjp[71] = 1980175523;
        dn.btjp[72] = 657902559;
        dn.btjp[73] = 969378328;
        dn.btjp[74] = 1744625929;
        dn.btjp[75] = 1563045703;
        dn.btjp[76] = -1256552203;
        dn.btjp[77] = -1441338616;
        dn.btjp[78] = -1446860518;
        dn.btjp[79] = -1482203619;
        dn.btjp[80] = -1025667446;
        dn.btjp[81] = 678877290;
        dn.btjp[82] = 12511276;
        dn.btjp[83] = -1425954254;
        dn.btjp[84] = 2007264905;
        dn.btjp[85] = -966735715;
        dn.btjp[86] = 474198264;
        dn.btjp[87] = -2058147083;
        dn.btjp[88] = 457951902;
        dn.btjp[89] = 317446954;
        dn.btjp[90] = -1907884752;
        dn.btjp[91] = 979182839;
        dn.btjp[92] = 591982039;
        dn.btjp[93] = 1723088211;
        dn.btjp[94] = 979914829;
        dn.btjp[95] = -1837000017;
        dn.btjp[96] = 1177435539;
        dn.btjp[97] = -688473166;
        dn.btjp[98] = -1613510139;
        dn.btjp[99] = 1286331279;
    }

    private static /* synthetic */ int btjn(int n2) {
        return btjo[n2] ^ btjp[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onKey(cn var1_1) {
        block66: {
            block65: {
                block64: {
                    block63: {
                        while (true) {
                            if ((v0 /* !! */  = (cfr_temp_0 = dn.eg - dn.btjq("btxp", btjy(int ), (int)163)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                            if (v0 /* !! */  == dn.btjq("btxr", btjn(int ), (int)182)) break;
                            v0 /* !! */  = (long)dn.btjq("btxs", btjn(int ), (int)183);
                        }
                        var4_2 = dn.c;
                        while (true) {
                            if ((v1 /* !! */  = (cfr_temp_1 = dn.eg - dn.btjq("btxt", btjy(int ), (int)164)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                            if (v1 /* !! */  == dn.btjq("btxu", btjn(int ), (int)184)) break;
                            v1 /* !! */  = (long)dn.btjq("btxw", btjn(int ), (int)185);
                        }
                        var3_3 = dn.b;
                        while (true) {
                            if ((v2 /* !! */  = (cfr_temp_2 = dn.eg - dn.btjq("btxy", btjy(int ), (int)165)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v2 /* !! */  == dn.btjq("btya", btjn(int ), (int)186)) break;
                            v2 /* !! */  = (long)dn.btjq("btyc", btjn(int ), (int)187);
                        }
                        var2_4 = dn.a;
                        if (var4_2) {
                            throw null;
lbl21:
                            // 10 sources

                            return;
                        }
                        if (var2_4 || var2_4) ** GOTO lbl21
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_3 = dn.eg - dn.btjq("btyg", btjy(int ), (int)166)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v3 /* !! */  == dn.btjq("btyh", btjn(int ), (int)188)) break;
                            v3 /* !! */  = (long)dn.btjq("btyi", btjn(int ), (int)189);
                        }
                        v4 /* !! */  = dn.eg;
                        if (true) ** GOTO lbl33
                        block50: while (true) {
                            v4 /* !! */  = (long)(v5 - dn.btjq("btym", btjy(int ), (int)167));
lbl33:
                            // 2 sources

                            switch ((int)v4 /* !! */ ) {
                                case -1533606997: {
                                    break block50;
                                }
                                case -301567256: {
                                    v5 = dn.btjq("btyn", btjy(int ), (int)168);
                                    continue block50;
                                }
                                case -48153345: {
                                    v5 = dn.btjq("btyo", btjy(int ), (int)169);
                                    continue block50;
                                }
                                case 170744608: {
                                    v5 = dn.btjq("btyp", btjy(int ), (int)170);
                                    continue block50;
                                }
                            }
                            break;
                        }
                        if (this.mc.field_1724 == null) break block63;
                        if (var2_4) ** GOTO lbl21
                        while (true) {
                            if ((v6 /* !! */  = (cfr_temp_4 = dn.eg - dn.btjq("btyq", btjy(int ), (int)171)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v6 /* !! */  == dn.btjq("btyr", btjn(int ), (int)190)) break;
                            v6 /* !! */  = (long)dn.btjq("btys", btjn(int ), (int)191);
                        }
                        v7 /* !! */  = dn.eg;
                        if (true) ** GOTO lbl56
                        block52: while (true) {
                            v7 /* !! */  = (long)(dn.btjq("btyw", btjy(int ), (int)173) - dn.btjq("btyu", btjy(int ), (int)172));
lbl56:
                            // 2 sources

                            switch ((int)v7 /* !! */ ) {
                                case -1533606997: {
                                    break block52;
                                }
                                case -1344231357: {
                                    continue block52;
                                }
                            }
                            break;
                        }
                        if (this.mc.field_1755 == null) break block64;
                        if (var2_4) ** GOTO lbl21
                    }
                    if (var2_4 || var2_4) ** GOTO lbl21
                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl21
                v8 /* !! */  = dn.eg;
                if (true) ** GOTO lbl72
                block53: while (true) {
                    v8 /* !! */  = (long)(v9 - dn.btjq("btyy", btjy(int ), (int)174));
lbl72:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -2134874898: {
                            v9 = dn.btjq("btyz", btjy(int ), (int)175);
                            continue block53;
                        }
                        case -1533606997: {
                            break block53;
                        }
                        case 1192469724: {
                            v9 = dn.btjq("btza", btjy(int ), (int)176);
                            continue block53;
                        }
                        case 1523225773: {
                            v9 = dn.btjq("btzc", btjy(int ), (int)177);
                            continue block53;
                        }
                    }
                    break;
                }
                if (var1_1.action() == dn.btjq("btzi", btjn(int ), (int)192)) break block65;
                if (var2_4) ** GOTO lbl21
                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl21
            v10 /* !! */  = dn.eg;
            if (true) ** GOTO lbl93
            block54: while (true) {
                v10 /* !! */  = (long)(v11 - dn.btjq("btzk", btjy(int ), (int)178));
lbl93:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1974058016: {
                        v11 = dn.btjq("btzm", btjy(int ), (int)179);
                        continue block54;
                    }
                    case -1533606997: {
                        break block54;
                    }
                    case 437538877: {
                        v11 = dn.btjq("btzo", btjy(int ), (int)180);
                        continue block54;
                    }
                    case 959801197: {
                        v11 = dn.btjq("btzs", btjy(int ), (int)181);
                        continue block54;
                    }
                }
                break;
            }
            if (this.pendingMacro == null) break block66;
            if (var2_4) ** GOTO lbl21
            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl21
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_5 = dn.eg - dn.btjq("btzu", btjy(int ), (int)182)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == dn.btjq("btzw", btjn(int ), (int)193)) break;
            v12 /* !! */  = (long)dn.btjq("buaa", btjn(int ), (int)194);
        }
        v13 /* !! */  = dn.eg;
        if (true) ** GOTO lbl119
        block56: while (true) {
            v13 /* !! */  = (long)(dn.btjq("buae", btjy(int ), (int)184) - dn.btjq("buac", btjy(int ), (int)183));
lbl119:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1533606997: {
                    break block56;
                }
                case 1269194198: {
                    continue block56;
                }
            }
            break;
        }
        v14 = this.macroList.stream();
        v15 /* !! */  = dn.eg;
        if (true) ** GOTO lbl129
        block57: while (true) {
            v15 /* !! */  = (long)(v16 - dn.btjq("buaf", btjy(int ), (int)185));
lbl129:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -1533606997: {
                    break block57;
                }
                case 741946922: {
                    v16 = dn.btjq("buag", btjy(int ), (int)186);
                    continue block57;
                }
                case 1098910564: {
                    v16 = dn.btjq("buah", btjy(int ), (int)187);
                    continue block57;
                }
            }
            break;
        }
        v17 = (Predicate<dm>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$onKey$3(ruhack.phobia.cn ruhack.phobia.dm ), (Lruhack/phobia/dm;)Z)((cn)var1_1);
        v18 /* !! */  = dn.eg;
        if (true) ** GOTO lbl143
        block58: while (true) {
            v18 /* !! */  = (long)(v19 - dn.btjq("buak", btjy(int ), (int)188));
lbl143:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -1533606997: {
                    break block58;
                }
                case -1156496355: {
                    v19 = dn.btjq("buao", btjy(int ), (int)189);
                    continue block58;
                }
                case 871672155: {
                    v19 = dn.btjq("buap", btjy(int ), (int)190);
                    continue block58;
                }
            }
            break;
        }
        v20 = v14.filter(v17);
        v21 /* !! */  = dn.eg;
        if (true) ** GOTO lbl157
        block59: while (true) {
            v21 /* !! */  = (long)(v22 - dn.btjq("buar", btjy(int ), (int)191));
lbl157:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -1703655829: {
                    v22 = dn.btjq("buaw", btjy(int ), (int)192);
                    continue block59;
                }
                case -1533606997: {
                    break block59;
                }
                case -790193077: {
                    v22 = dn.btjq("buay", btjy(int ), (int)193);
                    continue block59;
                }
            }
            break;
        }
        v23 = v20.findFirst();
        v24 /* !! */  = dn.eg;
        if (true) ** GOTO lbl171
        block60: while (true) {
            v24 /* !! */  = (long)(dn.btjq("buba", btjy(int ), (int)195) - dn.btjq("buaz", btjy(int ), (int)194));
lbl171:
            // 2 sources

            switch ((int)v24 /* !! */ ) {
                case -1533606997: {
                    break block60;
                }
                case 11229838: {
                    continue block60;
                }
            }
            break;
        }
        v25 = (Consumer<dm>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, queueReallyWorldMacro(ruhack.phobia.dm ), (Lruhack/phobia/dm;)V)((dn)this);
        while (true) {
            if ((v26 /* !! */  = (cfr_temp_6 = dn.eg - dn.btjq("bubc", btjy(int ), (int)196)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v26 /* !! */  == dn.btjq("bube", btjn(int ), (int)195)) break;
            v26 /* !! */  = (long)dn.btjq("bubf", btjn(int ), (int)196);
        }
        v23.ifPresent(v25);
        if (!var2_4 && !var2_4) ** break;
        ** while (true)
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public int getStopTicks() {
        boolean bl2;
        Object object = eg;
        block9: while (true) {
            switch ((int)object) {
                case -1533606997: {
                    break block9;
                }
                case 1612802178: {
                    object = dn.btjq("buoj", btjy(int ), (int)257) - dn.btjq("buoi", btjy(int ), (int)256);
                    continue block9;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = eg - dn.btjq("buok", btjy(int ), (int)258)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == dn.btjq("buol", btjn(int ), (int)329)) break;
            object2 = dn.btjq("buon", btjn(int ), (int)330);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = eg - dn.btjq("buoo", btjy(int ), (int)259)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == dn.btjq("buos", btjn(int ), (int)331)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = dn.btjq("buou", btjn(int ), (int)332);
        }
        if (bl2) return (int)dn.btjq("buow", btjn(int ), (int)333);
        if (bl2) return (int)dn.btjq("buow", btjn(int ), (int)333);
        Object object4 = eg;
        boolean bl4 = true;
        block12: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object4 = callSite - dn.btjq("buoy", btjy(int ), (int)260);
            }
            switch ((int)object4) {
                case -1533606997: {
                    return this.stopTicks;
                }
                case 113351099: {
                    callSite = dn.btjq("buoz", btjy(int ), (int)261);
                    continue block12;
                }
                case 1287750196: {
                    callSite = dn.btjq("bupa", btjy(int ), (int)262);
                    continue block12;
                }
            }
            break;
        }
        return this.stopTicks;
    }

    private static /* synthetic */ void buyq() {
        dn.btjp[200] = 197993955;
        dn.btjp[201] = -1314724486;
        dn.btjp[202] = 831874299;
        dn.btjp[203] = 874488668;
        dn.btjp[204] = 1803120122;
        dn.btjp[205] = -1065035199;
        dn.btjp[206] = 1367455097;
        dn.btjp[207] = 735632306;
        dn.btjp[208] = -1367466443;
        dn.btjp[209] = 1679349112;
        dn.btjp[210] = -1285827106;
        dn.btjp[211] = -2019922863;
        dn.btjp[212] = -999779030;
        dn.btjp[213] = 370868170;
        dn.btjp[214] = -1296764978;
        dn.btjp[215] = 1493515580;
        dn.btjp[216] = -609040355;
        dn.btjp[217] = -848028157;
        dn.btjp[218] = 1925370701;
        dn.btjp[219] = -1753780896;
        dn.btjp[220] = 961984184;
        dn.btjp[221] = 65375406;
        dn.btjp[222] = -2133098;
        dn.btjp[223] = -655691567;
        dn.btjp[224] = -797383173;
        dn.btjp[225] = 1694945791;
        dn.btjp[226] = -658318038;
        dn.btjp[227] = 86593369;
        dn.btjp[228] = 642455153;
        dn.btjp[229] = -1787827725;
        dn.btjp[230] = 622721323;
        dn.btjp[231] = -1969338572;
        dn.btjp[232] = 312977828;
        dn.btjp[233] = -252071755;
        dn.btjp[234] = 1657647593;
        dn.btjp[235] = 543905812;
        dn.btjp[236] = -1862702382;
        dn.btjp[237] = -642773180;
        dn.btjp[238] = -163361603;
        dn.btjp[239] = -1426425238;
        dn.btjp[240] = -838160673;
        dn.btjp[241] = -1129853359;
        dn.btjp[242] = 2000162069;
        dn.btjp[243] = -143751449;
        dn.btjp[244] = -644743282;
        dn.btjp[245] = -123456659;
        dn.btjp[246] = -980454192;
        dn.btjp[247] = 187961920;
        dn.btjp[248] = 1023526379;
        dn.btjp[249] = 1654049891;
        dn.btjp[250] = 2091693516;
        dn.btjp[251] = 266191153;
        dn.btjp[252] = 1199810571;
        dn.btjp[253] = 212031685;
        dn.btjp[254] = 677350904;
        dn.btjp[255] = -777780135;
        dn.btjp[256] = 1419694290;
        dn.btjp[257] = 1576606004;
        dn.btjp[258] = 1212047191;
        dn.btjp[259] = -228288335;
        dn.btjp[260] = 943123899;
        dn.btjp[261] = -714989568;
        dn.btjp[262] = -92186387;
        dn.btjp[263] = -1652089216;
        dn.btjp[264] = -1327496568;
        dn.btjp[265] = 779596539;
        dn.btjp[266] = 968812552;
        dn.btjp[267] = 607060504;
        dn.btjp[268] = -1478128122;
        dn.btjp[269] = 1677302535;
        dn.btjp[270] = 815562497;
        dn.btjp[271] = -60060591;
        dn.btjp[272] = -156306054;
        dn.btjp[273] = -1214228483;
        dn.btjp[274] = -538823333;
        dn.btjp[275] = 975909391;
        dn.btjp[276] = -1207938111;
        dn.btjp[277] = 222622078;
        dn.btjp[278] = -1898134218;
        dn.btjp[279] = 1446865262;
        dn.btjp[280] = 994001807;
        dn.btjp[281] = 493050913;
        dn.btjp[282] = -2096905720;
        dn.btjp[283] = 809556935;
        dn.btjp[284] = 912438410;
        dn.btjp[285] = -918923638;
        dn.btjp[286] = -859225;
        dn.btjp[287] = 350126871;
        dn.btjp[288] = 908666557;
        dn.btjp[289] = 942885447;
        dn.btjp[290] = 18241758;
        dn.btjp[291] = -1121399475;
        dn.btjp[292] = 2113719045;
        dn.btjp[293] = 234396944;
        dn.btjp[294] = 377661794;
        dn.btjp[295] = -2043570577;
        dn.btjp[296] = -1183932519;
        dn.btjp[297] = -561248282;
        dn.btjp[298] = 2023599591;
        dn.btjp[299] = -1703614008;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void finishMacro() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dn.eg - dn.btjq("buie", btjy(int ), (int)216)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == dn.btjq("buif", btjn(int ), (int)272)) break;
            v0 /* !! */  = (long)dn.btjq("buig", btjn(int ), (int)273);
        }
        var3_1 = dn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = dn.eg - dn.btjq("buii", btjy(int ), (int)217)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == dn.btjq("buij", btjn(int ), (int)274)) break;
            v1 /* !! */  = (long)dn.btjq("buik", btjn(int ), (int)275);
        }
        var2_2 /* !! */  = dn.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = dn.eg - dn.btjq("buim", btjy(int ), (int)218)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == dn.btjq("buin", btjn(int ), (int)276)) break;
            v2 /* !! */  = (long)dn.btjq("buio", btjn(int ), (int)277);
        }
        var1_3 = dn.a;
        if (var3_1) {
            throw null;
lbl21:
            // 6 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = dn.eg - dn.btjq("buip", btjy(int ), (int)219)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == dn.btjq("buiq", btjn(int ), (int)278)) break;
            v3 /* !! */  = (long)dn.btjq("buis", btjn(int ), (int)279);
        }
        v4 /* !! */  = dn.eg;
        if (true) ** GOTO lbl33
        block28: while (true) {
            v4 /* !! */  = (long)(dn.btjq("buiu", btjy(int ), (int)221) - dn.btjq("buit", btjy(int ), (int)220));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1533606997: {
                    break block28;
                }
                case -837967879: {
                    continue block28;
                }
            }
            break;
        }
        if (!this.movement.isBlocked()) ** GOTO lbl-1000
        if (var1_3) ** GOTO lbl21
        v5 /* !! */  = dn.eg;
        if (true) ** GOTO lbl44
        block29: while (true) {
            v5 /* !! */  = (long)(v6 - dn.btjq("buiw", btjy(int ), (int)222));
lbl44:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1533606997: {
                    break block29;
                }
                case 923201522: {
                    v6 = dn.btjq("buix", btjy(int ), (int)223);
                    continue block29;
                }
                case 1776323720: {
                    v6 = dn.btjq("buiy", btjy(int ), (int)224);
                    continue block29;
                }
            }
            break;
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_4 = dn.eg - dn.btjq("buiz", btjy(int ), (int)225)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == dn.btjq("buja", btjn(int ), (int)280)) break;
            v7 /* !! */  = (long)dn.btjq("bujb", btjn(int ), (int)281);
        }
        this.movement.restoreFromCurrent();
        if (var1_3) ** GOTO lbl21
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 3 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl21
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_5 = dn.eg - dn.btjq("bujd", btjy(int ), (int)226)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == dn.btjq("buje", btjn(int ), (int)282)) break;
                    v8 /* !! */  = (long)dn.btjq("bujf", btjn(int ), (int)283);
                }
                this.pendingMacro = null;
                if (var1_3 || var1_3) ** GOTO lbl21
                v9 = dn.btjq("bujg", btjn(int ), (int)284);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_6 = dn.eg - dn.btjq("bujh", btjy(int ), (int)227)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == dn.btjq("bujj", btjn(int ), (int)285)) break;
                    v10 /* !! */  = (long)dn.btjq("bujk", btjn(int ), (int)286);
                }
                this.stopTicks = (int)v9;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl81:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)dn.btjq("bujl", btjn(int ), (int)287);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl108
            }
lbl86:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)dn.btjq("bujn", btjn(int ), (int)288);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)dn.btjq("bujo", btjn(int ), (int)289);
                if (!var3_1) ** GOTO lbl81
                throw null;
            }
lbl94:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)dn.btjq("bujp", btjn(int ), (int)290);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl121
            }
lbl99:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)dn.btjq("bujq", btjn(int ), (int)291);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl112
            }
            case 5: {
                var2_2 /* !! */  = (int)dn.btjq("bujs", btjn(int ), (int)292);
                if (!var3_1) ** GOTO lbl81
                throw null;
            }
lbl108:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)dn.btjq("bujt", btjn(int ), (int)293);
                if (!var3_1) ** GOTO lbl99
                throw null;
            }
lbl112:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)dn.btjq("buju", btjn(int ), (int)294);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl121
            }
            case 8: {
                var2_2 /* !! */  = (int)dn.btjq("bujv", btjn(int ), (int)295);
                if (!var3_1) ** GOTO lbl86
                throw null;
            }
lbl121:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)dn.btjq("bujx", btjn(int ), (int)296);
                if (var3_1) {
                    throw null;
                }
            }
            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dn.btjq("bujy", btjn(int ), (int)297);
                    if (!var3_1) ** GOTO lbl94
                    throw null;
                }
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)dn.btjq("bujz", btjn(int ), (int)298);
        ** while (!var3_1)
lbl133:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void addMacro(String var1_1, String var2_2, int var3_3) {
        v0 /* !! */  = dn.eg;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - dn.btjq("btmk", btjy(int ), (int)28));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1533606997: {
                    break block28;
                }
                case -1299171607: {
                    v1 = dn.btjq("btml", btjy(int ), (int)29);
                    continue block28;
                }
                case 854246013: {
                    v1 = dn.btjq("btmm", btjy(int ), (int)30);
                    continue block28;
                }
                case 1819902383: {
                    v1 = dn.btjq("btmn", btjy(int ), (int)31);
                    continue block28;
                }
            }
            break;
        }
        var6_4 = dn.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = dn.eg - dn.btjq("btmo", btjy(int ), (int)32)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == dn.btjq("btmp", btjn(int ), (int)40)) break;
            v2 /* !! */  = (long)dn.btjq("btmq", btjn(int ), (int)41);
        }
        var5_5 /* !! */  = dn.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = dn.eg - dn.btjq("btmr", btjy(int ), (int)33)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == dn.btjq("btms", btjn(int ), (int)42)) {
                var4_6 = dn.a;
                if (var6_4) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)dn.btjq("btmt", btjn(int ), (int)43);
        }
        if (var4_6 || var4_6) return;
        if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block31: while (true) {
            block47: {
                switch (cfr_temp_0 == -2147483648 ? var5_5 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v4 /* !! */  = dn.eg;
                        block32: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -1533606997: {
                                    break block32;
                                }
                                case -1213678646: {
                                    v4 /* !! */  = (long)(dn.btjq("btmv", btjy(int ), (int)35) - dn.btjq("btmu", btjy(int ), (int)34));
                                    continue block32;
                                }
                            }
                            break;
                        }
                        v5 /* !! */  = dn.eg;
                        block33: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case -1533606997: {
                                    break block33;
                                }
                                case -36458792: {
                                    v6 = dn.btjq("btmx", btjy(int ), (int)37);
                                    ** GOTO lbl60
                                }
                                case 1543970510: {
                                    v6 = dn.btjq("btmy", btjy(int ), (int)38);
                                    ** GOTO lbl60
                                }
                                case 2037412723: {
                                    v6 = dn.btjq("btmz", btjy(int ), (int)39);
lbl60:
                                    // 3 sources

                                    v5 /* !! */  = (long)(v6 - dn.btjq("btmw", btjy(int ), (int)36));
                                    continue block33;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v7 /* !! */  = (cfr_temp_3 = dn.eg - dn.btjq("btna", btjy(int ), (int)40)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v7 /* !! */  != dn.btjq("btnb", btjn(int ), (int)44)) ** GOTO lbl68
                            v8 = new dm(var1_1, var2_2, var3_3);
                            v9 /* !! */  = dn.eg;
                            ** GOTO lbl90
lbl68:
                            // 1 sources

                            v7 /* !! */  = (long)dn.btjq("btnc", btjn(int ), (int)45);
                        }
                    }
                    case 0: {
                        var5_5 /* !! */  = (int)dn.btjq("btnf", btjn(int ), (int)46);
                        if (var6_4) {
                            throw null;
                        }
                    }
                    case 1: {
                        do {
                            var5_5 /* !! */  = (int)dn.btjq("btng", btjn(int ), (int)47);
                        } while (!var6_4);
                        throw null;
                    }
                    case 3: {
                        ** GOTO lbl85
                    }
                    case 5: {
                        var5_5 /* !! */  = (int)dn.btjq("btnk", btjn(int ), (int)51);
                        if (var6_4) {
                            throw null;
                        }
lbl85:
                        // 3 sources

                        var5_5 /* !! */  = (int)dn.btjq("btni", btjn(int ), (int)49);
                        cfr_temp_0 = 4;
                        if (var6_4) {
                            throw null;
                        }
                        break block47;
                    }
lbl90:
                    // 1 sources

                    block36: while (true) {
                        switch ((int)v9 /* !! */ ) {
                            case -1533606997: {
                                break block36;
                            }
                            case 1636545454: {
                                v9 /* !! */  = (long)(dn.btjq("btne", btjy(int ), (int)42) - dn.btjq("btnd", btjy(int ), (int)41));
                                continue block36;
                            }
                        }
                        break;
                    }
                    this.macroList.add(v8);
                    if (!var4_6 && !var4_6) return;
                    return;
                    case 2: {
                        var5_5 /* !! */  = (int)dn.btjq("btnh", btjn(int ), (int)48);
                        if (var6_4) {
                            throw null;
                        }
                    }
                    case 4: 
                }
                ** GOTO lbl110
            }
            do {
                if (true) continue block31;
lbl110:
                // 2 sources

                var5_5 /* !! */  = (int)dn.btjq("btnj", btjn(int ), (int)50);
                cfr_temp_0 = 2;
            } while (!var6_4);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void deleteMacro(String var1_1) {
        v0 /* !! */  = dn.eg;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - dn.btjq("btqn", btjy(int ), (int)86));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1533606997: {
                    break block21;
                }
                case 1528668822: {
                    v1 = dn.btjq("btqo", btjy(int ), (int)87);
                    continue block21;
                }
                case 1982939211: {
                    v1 = dn.btjq("btqp", btjy(int ), (int)88);
                    continue block21;
                }
            }
            break;
        }
        var4_2 = dn.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = dn.eg - dn.btjq("btqq", btjy(int ), (int)89)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == dn.btjq("btqr", btjn(int ), (int)89)) break;
            v2 /* !! */  = (long)dn.btjq("btqs", btjn(int ), (int)90);
        }
        var3_3 /* !! */  = dn.b;
        v3 /* !! */  = dn.eg;
        if (true) ** GOTO lbl25
        block23: while (true) {
            v3 /* !! */  = (long)(dn.btjq("btqu", btjy(int ), (int)91) - dn.btjq("btqt", btjy(int ), (int)90));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1533606997: {
                    break block23;
                }
                case 841993766: {
                    continue block23;
                }
            }
            break;
        }
        var2_4 = dn.a;
        if (var4_2) {
            throw null;
lbl33:
            // 3 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl33
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = dn.eg - dn.btjq("btqv", btjy(int ), (int)92)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == dn.btjq("btqw", btjn(int ), (int)91)) break;
            v4 /* !! */  = (long)dn.btjq("btqx", btjn(int ), (int)92);
        }
        v5 /* !! */  = dn.eg;
        if (true) ** GOTO lbl45
        block26: while (true) {
            v5 /* !! */  = (long)(dn.btjq("btqz", btjy(int ), (int)94) - dn.btjq("btqy", btjy(int ), (int)93));
lbl45:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1533606997: {
                    break block26;
                }
                case -1057803320: {
                    continue block26;
                }
            }
            break;
        }
        v6 = (Predicate<dm>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$deleteMacro$2(java.lang.String ruhack.phobia.dm ), (Lruhack/phobia/dm;)Z)((String)var1_1);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = dn.eg - dn.btjq("btra", btjy(int ), (int)95)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == dn.btjq("btrb", btjn(int ), (int)93)) break;
            v7 /* !! */  = (long)dn.btjq("btrc", btjn(int ), (int)94);
        }
        this.macroList.removeIf(v6);
        if (var2_4) ** GOTO lbl33
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl64:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)dn.btjq("btrd", btjn(int ), (int)95);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl73
            }
lbl69:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)dn.btjq("btre", btjn(int ), (int)96);
                if (var4_2) {
                    throw null;
                }
            }
lbl73:
            // 4 sources

            case 2: {
                var3_3 /* !! */  = (int)dn.btjq("btrf", btjn(int ), (int)97);
                if (!var4_2) break;
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)dn.btjq("btrg", btjn(int ), (int)98);
                    if (!var4_2) ** GOTO lbl64
                    throw null;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)dn.btjq("btrh", btjn(int ), (int)99);
                if (!var4_2) ** GOTO lbl69
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)dn.btjq("btri", btjn(int ), (int)100);
        ** while (!var4_2)
lbl89:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void buza() {
        dn.btjp[300] = 1613558608;
        dn.btjp[301] = -1675835668;
        dn.btjp[302] = 465502892;
        dn.btjp[303] = 1507719243;
        dn.btjp[304] = 1464644707;
        dn.btjp[305] = 1213132186;
        dn.btjp[306] = 2080773594;
        dn.btjp[307] = -608193992;
        dn.btjp[308] = 217124673;
        dn.btjp[309] = -1133136163;
        dn.btjp[310] = -669286352;
        dn.btjp[311] = -998084886;
        dn.btjp[312] = -450610101;
        dn.btjp[313] = -1738531505;
        dn.btjp[314] = -1038842574;
        dn.btjp[315] = 1063593561;
        dn.btjp[316] = 476858502;
        dn.btjp[317] = -1410900894;
        dn.btjp[318] = -997034166;
        dn.btjp[319] = -583381148;
        dn.btjp[320] = -2061317947;
        dn.btjp[321] = 250856659;
        dn.btjp[322] = 90858319;
        dn.btjp[323] = 1842936184;
        dn.btjp[324] = -824063535;
        dn.btjp[325] = 1872845597;
        dn.btjp[326] = 126598911;
        dn.btjp[327] = 1932323930;
        dn.btjp[328] = 818611226;
        dn.btjp[329] = 114289509;
        dn.btjp[330] = 729032749;
        dn.btjp[331] = -484881934;
        dn.btjp[332] = -1469261579;
        dn.btjp[333] = -627842531;
        dn.btjp[334] = -1221959691;
        dn.btjp[335] = -2042344190;
        dn.btjp[336] = -322896429;
        dn.btjp[337] = -222662284;
        dn.btjp[338] = -1541365243;
        dn.btjp[339] = 365200149;
        dn.btjp[340] = 538640337;
        dn.btjp[341] = -771437277;
        dn.btjp[342] = -1326295475;
        dn.btjp[343] = 1485468017;
        dn.btjp[344] = -2014709234;
        dn.btjp[345] = 1924415548;
        dn.btjp[346] = -1668809918;
        dn.btjp[347] = 510306799;
        dn.btjp[348] = -14266010;
        dn.btjp[349] = -773071800;
        dn.btjp[350] = -1051666905;
        dn.btjp[351] = 1647855425;
        dn.btjp[352] = 2093221365;
        dn.btjp[353] = -968690125;
        dn.btjp[354] = -1686371733;
        dn.btjp[355] = 52957735;
        dn.btjp[356] = 430623481;
        dn.btjp[357] = -8764945;
        dn.btjp[358] = -1587999275;
        dn.btjp[359] = 135317298;
        dn.btjp[360] = 1819189985;
        dn.btjp[361] = 560617125;
        dn.btjp[362] = -1227873609;
        dn.btjp[363] = -557627312;
        dn.btjp[364] = -116134347;
        dn.btjp[365] = 1954301669;
        dn.btjp[366] = -1414365748;
        dn.btjp[367] = 192653689;
        dn.btjp[368] = 388183029;
        dn.btjp[369] = -2045397646;
        dn.btjp[370] = -1535761243;
        dn.btjp[371] = -323622384;
        dn.btjp[372] = -1944882907;
        dn.btjp[373] = 1601136614;
        dn.btjp[374] = 1256092504;
        dn.btjp[375] = -1077416515;
        dn.btjp[376] = -1460854414;
        dn.btjp[377] = -254908140;
        dn.btjp[378] = -503079671;
        dn.btjp[379] = 286398619;
        dn.btjp[380] = 1995354727;
        dn.btjp[381] = -660875414;
        dn.btjp[382] = 1061213915;
        dn.btjp[383] = -815279414;
        dn.btjp[384] = 2126969441;
        dn.btjp[385] = -868012407;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static dn getInstance() {
        v0 /* !! */  = dn.eg;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(v1 - dn.btjq("btkb", btjy(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1824015830: {
                    v1 = dn.btjq("btkc", btjy(int ), (int)1);
                    continue block26;
                }
                case -1533606997: {
                    break block26;
                }
                case -1311322058: {
                    v1 = dn.btjq("btkd", btjy(int ), (int)2);
                    continue block26;
                }
            }
            break;
        }
        var2 = dn.c;
        v2 /* !! */  = dn.eg;
        if (true) ** GOTO lbl19
        block27: while (true) {
            v2 /* !! */  = (long)(dn.btjq("btkf", btjy(int ), (int)4) - dn.btjq("btke", btjy(int ), (int)3));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1533606997: {
                    break block27;
                }
                case 453178322: {
                    continue block27;
                }
            }
            break;
        }
        var1_1 /* !! */  = dn.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = dn.eg - dn.btjq("btkg", btjy(int ), (int)5)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == dn.btjq("btkh", btjn(int ), (int)7)) break;
            v3 /* !! */  = (long)dn.btjq("btki", btjn(int ), (int)8);
        }
        var0_2 = dn.a;
        if (!var2) ** GOTO lbl37
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl37:
                // 1 sources

                if (var0_2 || var0_2) continue block29;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = dn.eg - dn.btjq("btkj", btjy(int ), (int)6)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == dn.btjq("btkk", btjn(int ), (int)9)) break;
                    v4 /* !! */  = (long)dn.btjq("btkl", btjn(int ), (int)10);
                }
                if (dn.instance != null) ** GOTO lbl74
                if (var0_2 || var0_2) continue block29;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = dn.eg - dn.btjq("btkm", btjy(int ), (int)7)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == dn.btjq("btkn", btjn(int ), (int)11)) break;
                    v5 /* !! */  = (long)dn.btjq("btko", btjn(int ), (int)12);
                }
                v6 /* !! */  = dn.eg;
                if (true) ** GOTO lbl54
                block32: while (true) {
                    v6 /* !! */  = (long)(v7 - dn.btjq("btkp", btjy(int ), (int)8));
lbl54:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1533606997: {
                            break block32;
                        }
                        case -1164615435: {
                            v7 = dn.btjq("btkq", btjy(int ), (int)9);
                            continue block32;
                        }
                        case -1100929934: {
                            v7 = dn.btjq("btkr", btjy(int ), (int)10);
                            continue block32;
                        }
                        case 1639344994: {
                            v7 = dn.btjq("btks", btjy(int ), (int)11);
                            continue block32;
                        }
                    }
                    break;
                }
                v8 = new dn();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = dn.eg - dn.btjq("btkt", btjy(int ), (int)12)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == dn.btjq("btku", btjn(int ), (int)13)) break;
                    v9 /* !! */  = (long)dn.btjq("btkv", btjn(int ), (int)14);
                }
                dn.instance = v8;
                if (var0_2) continue block29;
lbl74:
                // 2 sources

                if (!var0_2 && !var0_2) ** break;
                continue block29;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = dn.eg - dn.btjq("btkw", btjy(int ), (int)13)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == dn.btjq("btkx", btjn(int ), (int)15)) break;
                    v10 /* !! */  = (long)dn.btjq("btky", btjn(int ), (int)16);
                }
                return dn.instance;
                case 0: {
                    var1_1 /* !! */  = (int)dn.btjq("btkz", btjn(int ), (int)17);
                    if (!var2) break block29;
                    throw null;
                }
lbl86:
                // 2 sources

                case 1: {
                    var1_1 /* !! */  = (int)dn.btjq("btla", btjn(int ), (int)18);
                    if (!var2) break block29;
                    throw null;
                }
lbl90:
                // 2 sources

                case 2: {
                    var1_1 /* !! */  = (int)dn.btjq("btlb", btjn(int ), (int)19);
                    if (var2) {
                        throw null;
                    }
                }
lbl94:
                // 4 sources

                case 3: {
                    var1_1 /* !! */  = (int)dn.btjq("btlc", btjn(int ), (int)20);
                    if (var2) {
                        throw null;
                    }
                }
                case 4: {
                    var1_1 /* !! */  = (int)dn.btjq("btld", btjn(int ), (int)21);
                    if (!var2) ** GOTO lbl90
                    throw null;
                }
                case 5: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 /* !! */  = (int)dn.btjq("btle", btjn(int ), (int)22);
                        if (!var2) break block29;
                        throw null;
                    }
                }
                case 6: {
                    var1_1 /* !! */  = (int)dn.btjq("btlf", btjn(int ), (int)23);
                    if (!var2) ** GOTO lbl94
                    throw null;
                }
                case 7: {
                    var1_1 /* !! */  = (int)dn.btjq("btlg", btjn(int ), (int)24);
                    if (!var2) ** GOTO lbl86
                    throw null;
                }
                case 8: 
            }
        }
        var1_1 /* !! */  = (int)dn.btjq("btlh", btjn(int ), (int)25);
        ** while (!var2)
lbl118:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List<dm> getMacroList() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dn.eg - dn.btjq("bukb", btjy(int ), (int)228)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dn.btjq("bukc", btjn(int ), (int)299)) break;
            v0 /* !! */  = (long)dn.btjq("bukd", btjn(int ), (int)300);
        }
        var3_1 = dn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = dn.eg - dn.btjq("bukf", btjy(int ), (int)229)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == dn.btjq("bukg", btjn(int ), (int)301)) break;
            v1 /* !! */  = (long)dn.btjq("bukh", btjn(int ), (int)302);
        }
        var2_2 /* !! */  = dn.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = dn.eg - dn.btjq("buki", btjy(int ), (int)230)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == dn.btjq("bukj", btjn(int ), (int)303)) break;
            v2 /* !! */  = (long)dn.btjq("bukk", btjn(int ), (int)304);
        }
        var1_3 = dn.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = dn.eg;
                if (true) ** GOTO lbl34
                block14: while (true) {
                    v3 /* !! */  = (long)(dn.btjq("bukm", btjy(int ), (int)232) - dn.btjq("bukl", btjy(int ), (int)231));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1533606997: {
                            break block14;
                        }
                        case -115175129: {
                            continue block14;
                        }
                    }
                    break;
                }
                return this.macroList;
            }
            case 0: {
                var2_2 /* !! */  = (int)dn.btjq("bukn", btjn(int ), (int)305);
                if (var3_1) {
                    throw null;
                }
            }
lbl44:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)dn.btjq("buko", btjn(int ), (int)306);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dn.btjq("bukq", btjn(int ), (int)307);
                    if (!var3_1) ** GOTO lbl44
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)dn.btjq("buks", btjn(int ), (int)308);
        ** while (!var3_1)
lbl56:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void deleteMacroAndSave(String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dn.eg - dn.btjq("btrj", btjy(int ), (int)96)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == dn.btjq("btrk", btjn(int ), (int)101)) break;
            v0 /* !! */  = (long)dn.btjq("btrl", btjn(int ), (int)102);
        }
        var4_2 = dn.c;
        v1 /* !! */  = dn.eg;
        if (true) ** GOTO lbl11
        block26: while (true) {
            v1 /* !! */  = (long)(v2 - dn.btjq("btrm", btjy(int ), (int)97));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1533606997: {
                    break block26;
                }
                case 952495197: {
                    v2 = dn.btjq("btrn", btjy(int ), (int)98);
                    continue block26;
                }
                case 1287379238: {
                    v2 = dn.btjq("btro", btjy(int ), (int)99);
                    continue block26;
                }
                case 1441837712: {
                    v2 = dn.btjq("btrp", btjy(int ), (int)100);
                    continue block26;
                }
            }
            break;
        }
        var3_3 /* !! */  = dn.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = dn.eg - dn.btjq("btrq", btjy(int ), (int)101)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == dn.btjq("btrr", btjn(int ), (int)103)) break;
            v3 /* !! */  = (long)dn.btjq("btrs", btjn(int ), (int)104);
        }
        var2_4 = dn.a;
        if (var4_2) {
            throw null;
lbl32:
            // 4 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = dn.eg - dn.btjq("btrt", btjy(int ), (int)102)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == dn.btjq("btru", btjn(int ), (int)105)) break;
            v4 /* !! */  = (long)dn.btjq("btrv", btjn(int ), (int)106);
        }
        this.deleteMacro(var1_1);
        if (var2_4 || var2_4) ** GOTO lbl32
        v5 /* !! */  = dn.eg;
        if (true) ** GOTO lbl46
        block30: while (true) {
            v5 /* !! */  = (long)(dn.btjq("btrx", btjy(int ), (int)104) - dn.btjq("btrw", btjy(int ), (int)103));
lbl46:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1533606997: {
                    break block30;
                }
                case 1021955203: {
                    continue block30;
                }
            }
            break;
        }
        v6 = al.getInstance();
        v7 /* !! */  = dn.eg;
        if (true) ** GOTO lbl56
        block31: while (true) {
            v7 /* !! */  = (long)(v8 - dn.btjq("btry", btjy(int ), (int)105));
lbl56:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1860968989: {
                    v8 = dn.btjq("btrz", btjy(int ), (int)106);
                    continue block31;
                }
                case -1533606997: {
                    break block31;
                }
                case 591528049: {
                    v8 = dn.btjq("btsa", btjy(int ), (int)107);
                    continue block31;
                }
            }
            break;
        }
        v6.save();
        if (var2_4) ** GOTO lbl32
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)dn.btjq("btsb", btjn(int ), (int)107);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl96
            }
lbl78:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)dn.btjq("btsc", btjn(int ), (int)108);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl96
            }
            case 2: {
                var3_3 /* !! */  = (int)dn.btjq("btsd", btjn(int ), (int)109);
                if (!var4_2) ** GOTO lbl78
                throw null;
            }
lbl87:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)dn.btjq("btse", btjn(int ), (int)110);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl96
            }
            case 4: {
                var3_3 /* !! */  = (int)dn.btjq("btsf", btjn(int ), (int)111);
                if (!var4_2) ** GOTO lbl87
                throw null;
            }
lbl96:
            // 4 sources

            case 5: {
                var3_3 /* !! */  = (int)dn.btjq("btsg", btjn(int ), (int)112);
                if (var4_2) {
                    throw null;
                }
            }
            case 6: {
                var3_3 /* !! */  = (int)dn.btjq("btsh", btjn(int ), (int)113);
                if (!var4_2) break;
                throw null;
            }
            case 7: 
        }
        do {
            var3_3 /* !! */  = (int)dn.btjq("btsi", btjn(int ), (int)114);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void bvcb() {
        dn.btka[100] = 997659844293539236L;
        dn.btka[101] = 3023680192413769709L;
        dn.btka[102] = 158683302999689396L;
        dn.btka[103] = 2232241124919113613L;
        dn.btka[104] = 45996262052841322L;
        dn.btka[105] = -2737616109480927341L;
        dn.btka[106] = 1251914649703118330L;
        dn.btka[107] = 8429915970774125811L;
        dn.btka[108] = 7396883791915358296L;
        dn.btka[109] = -8552839395751941630L;
        dn.btka[110] = -3936451569626968748L;
        dn.btka[111] = 5256805083628051395L;
        dn.btka[112] = 1896451646263324891L;
        dn.btka[113] = -3030745008592773477L;
        dn.btka[114] = -9077874079017278607L;
        dn.btka[115] = 8939812558565091126L;
        dn.btka[116] = 5336487006815975740L;
        dn.btka[117] = 4230900262432238418L;
        dn.btka[118] = -6191286343697689852L;
        dn.btka[119] = 555675202077553949L;
        dn.btka[120] = -2561351983792647163L;
        dn.btka[121] = 1899035929043484697L;
        dn.btka[122] = -2271980259538521045L;
        dn.btka[123] = 4705337673881683404L;
        dn.btka[124] = -7529634948219580403L;
        dn.btka[125] = -8039922790148193254L;
        dn.btka[126] = -225777164463356143L;
        dn.btka[127] = -1793192343290426834L;
        dn.btka[128] = 1013014387001096118L;
        dn.btka[129] = -174988718120846501L;
        dn.btka[130] = -7918161570798085642L;
        dn.btka[131] = 8055190180305344540L;
        dn.btka[132] = -3003032304100995783L;
        dn.btka[133] = -2913299359232424359L;
        dn.btka[134] = 9197604987450865194L;
        dn.btka[135] = -3535260207276164803L;
        dn.btka[136] = 1766909614837160028L;
        dn.btka[137] = -7990557357868054809L;
        dn.btka[138] = 6234673689388640773L;
        dn.btka[139] = 8303359143930837021L;
        dn.btka[140] = -5185560514509629352L;
        dn.btka[141] = 4337232336776490233L;
        dn.btka[142] = -5339811576602095086L;
        dn.btka[143] = -3312529705468758436L;
        dn.btka[144] = -8728195637772495754L;
        dn.btka[145] = -7682740773015473735L;
        dn.btka[146] = 171018668274477858L;
        dn.btka[147] = -4976305355688473644L;
        dn.btka[148] = 3954106532496322446L;
        dn.btka[149] = 510772487760775872L;
        dn.btka[150] = 2695750569095355732L;
        dn.btka[151] = -8841009249837035347L;
        dn.btka[152] = 8643723870447372689L;
        dn.btka[153] = -3841553987198341308L;
        dn.btka[154] = 1321786909204196331L;
        dn.btka[155] = 8020568543854390739L;
        dn.btka[156] = 648292659833649736L;
        dn.btka[157] = 2307572154775639134L;
        dn.btka[158] = 5225555536854534557L;
        dn.btka[159] = -8551000038195364518L;
        dn.btka[160] = -5179778101666711820L;
        dn.btka[161] = 2806513308970780081L;
        dn.btka[162] = -8684407925492817950L;
        dn.btka[163] = -9143870352830496492L;
        dn.btka[164] = -5079333283011016514L;
        dn.btka[165] = 2748421256145419484L;
        dn.btka[166] = 7414089368633124016L;
        dn.btka[167] = -2851781552044792886L;
        dn.btka[168] = 8276955314304757272L;
        dn.btka[169] = 2697084295867549393L;
        dn.btka[170] = -7080733318353179798L;
        dn.btka[171] = 7654780750875302019L;
        dn.btka[172] = -257128303960489223L;
        dn.btka[173] = -7503530873871932111L;
        dn.btka[174] = 6044396305623548207L;
        dn.btka[175] = 7515122693136901884L;
        dn.btka[176] = -7624540897498602301L;
        dn.btka[177] = -8581603406651178380L;
        dn.btka[178] = -451287964720949516L;
        dn.btka[179] = 2305791208137901600L;
        dn.btka[180] = -1325918598500585590L;
        dn.btka[181] = -7368692766838166952L;
        dn.btka[182] = -4112925978954624217L;
        dn.btka[183] = 7146976753848858047L;
        dn.btka[184] = 8310010906539410301L;
        dn.btka[185] = 7819933148138287037L;
        dn.btka[186] = 7767088251381599595L;
        dn.btka[187] = -7985054791943550478L;
        dn.btka[188] = -4786355236671641358L;
        dn.btka[189] = 1823286787325285578L;
        dn.btka[190] = 1634064110975077500L;
        dn.btka[191] = -4476674599902363968L;
        dn.btka[192] = -2764613637550302412L;
        dn.btka[193] = -8326051178454114797L;
        dn.btka[194] = 1887491326193559514L;
        dn.btka[195] = -718483561545768519L;
        dn.btka[196] = 4617824634911707349L;
        dn.btka[197] = -1169232890019108676L;
        dn.btka[198] = -6121057789914456770L;
        dn.btka[199] = -4140199132220784155L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public int size() {
        block27: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = dn.eg - dn.btjq("btue", btjy(int ), (int)129)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == dn.btjq("btuf", btjn(int ), (int)141)) break;
                v0 /* !! */  = (long)dn.btjq("btug", btjn(int ), (int)142);
            }
            var3_1 = dn.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_2 = dn.eg - dn.btjq("btuh", btjy(int ), (int)130)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == dn.btjq("btui", btjn(int ), (int)143)) break;
                v1 /* !! */  = (long)dn.btjq("btuj", btjn(int ), (int)144);
            }
            var2_2 /* !! */  = dn.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_3 = dn.eg - dn.btjq("btuk", btjy(int ), (int)131)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == dn.btjq("btul", btjn(int ), (int)145)) {
                    var1_3 = dn.a;
                    if (var3_1) {
                        throw null;
                    }
                    break;
                }
                v2 /* !! */  = (long)dn.btjq("btum", btjn(int ), (int)146);
            }
            if (var1_3 || var1_3) break block27;
            v3 /* !! */  = dn.eg;
            ** GOTO lbl32
        }
        if (var2_2 /* !! */  == 0) return (int)dn.btjq("btun", btjn(int ), (int)147);
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: {
                    return (int)dn.btjq("btun", btjn(int ), (int)147);
                }
lbl32:
                // 1 sources

                block19: while (true) {
                    switch ((int)v3 /* !! */ ) {
                        case -1533606997: {
                            break block19;
                        }
                        case -1391913552: {
                            v4 = dn.btjq("btup", btjy(int ), (int)133);
                            ** GOTO lbl41
                        }
                        case -790568804: {
                            v4 = dn.btjq("btuq", btjy(int ), (int)134);
lbl41:
                            // 2 sources

                            v3 /* !! */  = (long)(v4 - dn.btjq("btuo", btjy(int ), (int)132));
                            continue block19;
                        }
                    }
                    break;
                }
                ** GOTO lbl49
                case 3: {
                    var2_2 /* !! */  = (int)dn.btjq("btuw", btjn(int ), (int)151);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
lbl49:
                // 1 sources

                v5 /* !! */  = dn.eg;
                block20: while (true) {
                    switch ((int)v5 /* !! */ ) {
                        case -1533606997: {
                            return this.macroList.size();
                        }
                        case 1527009088: {
                            v5 /* !! */  = (long)(dn.btjq("btus", btjy(int ), (int)136) - dn.btjq("btur", btjy(int ), (int)135));
                            continue block20;
                        }
                    }
                    break;
                }
                return this.macroList.size();
                case 0: {
                    var2_2 /* !! */  = (int)dn.btjq("btut", btjn(int ), (int)148);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)dn.btjq("btuu", btjn(int ), (int)149);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: 
            }
            break;
        }
        if (true) ** GOTO lbl70
        do {
            if (true) ** continue;
lbl70:
            // 2 sources

            var2_2 /* !! */  = (int)dn.btjq("btuv", btjn(int ), (int)150);
            cfr_temp_0 = 0;
        } while (!var3_1);
        throw null;
    }

    public static /* synthetic */ CallSite btjq(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long btjy(int n2) {
        return btjz[n2] ^ btka[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void addMacroAndSave(String var1_1, String var2_2, int var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dn.eg - dn.btjq("btnl", btjy(int ), (int)43)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == dn.btjq("btnm", btjn(int ), (int)52)) break;
            v0 /* !! */  = (long)dn.btjq("btnn", btjn(int ), (int)53);
        }
        var6_4 = dn.c;
        v1 /* !! */  = dn.eg;
        if (true) ** GOTO lbl11
        block23: while (true) {
            v1 /* !! */  = (long)(v2 - dn.btjq("btno", btjy(int ), (int)44));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1533606997: {
                    break block23;
                }
                case -938215200: {
                    v2 = dn.btjq("btnp", btjy(int ), (int)45);
                    continue block23;
                }
                case -564890772: {
                    v2 = dn.btjq("btnq", btjy(int ), (int)46);
                    continue block23;
                }
                case 1742242897: {
                    v2 = dn.btjq("btnr", btjy(int ), (int)47);
                    continue block23;
                }
            }
            break;
        }
        var5_5 /* !! */  = dn.b;
        v3 /* !! */  = dn.eg;
        if (true) ** GOTO lbl28
        block24: while (true) {
            v3 /* !! */  = (long)(v4 - dn.btjq("btns", btjy(int ), (int)48));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2138398486: {
                    v4 = dn.btjq("btnt", btjy(int ), (int)49);
                    continue block24;
                }
                case -1533606997: {
                    break block24;
                }
                case -757498469: {
                    v4 = dn.btjq("btnu", btjy(int ), (int)50);
                    continue block24;
                }
                case -449483046: {
                    v4 = dn.btjq("btnv", btjy(int ), (int)51);
                    continue block24;
                }
            }
            break;
        }
        var4_6 = dn.a;
        if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4) {
                    throw null;
lbl46:
                    // 3 sources

                    return;
                }
                if (var4_6 || var4_6) ** GOTO lbl46
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = dn.eg - dn.btjq("btnw", btjy(int ), (int)52)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == dn.btjq("btnx", btjn(int ), (int)54)) break;
                    v5 /* !! */  = (long)dn.btjq("btny", btjn(int ), (int)55);
                }
                this.addMacro(var1_1, var2_2, var3_3);
                if (var4_6 || var4_6) ** GOTO lbl46
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = dn.eg - dn.btjq("btnz", btjy(int ), (int)53)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == dn.btjq("btoa", btjn(int ), (int)56)) break;
                    v6 /* !! */  = (long)dn.btjq("btob", btjn(int ), (int)57);
                }
                v7 = al.getInstance();
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = dn.eg - dn.btjq("btoc", btjy(int ), (int)54)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == dn.btjq("btod", btjn(int ), (int)58)) break;
                    v8 /* !! */  = (long)dn.btjq("btoe", btjn(int ), (int)59);
                }
                v7.save();
                if (var4_6 || var4_6) ** continue;
                return;
            }
lbl70:
            // 2 sources

            case 0: {
                var5_5 /* !! */  = (int)dn.btjq("btof", btjn(int ), (int)60);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl85
            }
            case 1: {
                do {
                    var5_5 /* !! */  = (int)dn.btjq("btog", btjn(int ), (int)61);
                } while (!var6_4);
                throw null;
            }
lbl80:
            // 2 sources

            case 2: {
                var5_5 /* !! */  = (int)dn.btjq("btoh", btjn(int ), (int)62);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl90
            }
lbl85:
            // 2 sources

            case 3: {
                var5_5 /* !! */  = (int)dn.btjq("btoi", btjn(int ), (int)63);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl94
            }
lbl90:
            // 2 sources

            case 4: {
                var5_5 /* !! */  = (int)dn.btjq("btoj", btjn(int ), (int)64);
                if (!var6_4) ** GOTO lbl80
                throw null;
            }
lbl94:
            // 3 sources

            case 5: {
                var5_5 /* !! */  = (int)dn.btjq("btok", btjn(int ), (int)65);
                if (!var6_4) ** GOTO lbl70
                throw null;
            }
            case 6: {
                var5_5 /* !! */  = (int)dn.btjq("btol", btjn(int ), (int)66);
                if (!var6_4) ** GOTO lbl94
                throw null;
            }
            case 7: 
        }
        do {
            var5_5 /* !! */  = (int)dn.btjq("btom", btjn(int ), (int)67);
        } while (!var6_4);
        throw null;
    }

    private static /* synthetic */ void bvbn() {
        dn.btka[0] = -6784289531983779963L;
        dn.btka[1] = -4045235337357347133L;
        dn.btka[2] = 1492369730797329037L;
        dn.btka[3] = 4106862637808274260L;
        dn.btka[4] = 4718977252161049192L;
        dn.btka[5] = 6799496121940170285L;
        dn.btka[6] = 6345084995076021041L;
        dn.btka[7] = 3054248957613019140L;
        dn.btka[8] = 5176115616105621833L;
        dn.btka[9] = -1554557406695787832L;
        dn.btka[10] = 5503287851944658706L;
        dn.btka[11] = -4663307200121388560L;
        dn.btka[12] = 4739401583669114004L;
        dn.btka[13] = 4194738307053547290L;
        dn.btka[14] = -8885973567137662071L;
        dn.btka[15] = 616489467413168638L;
        dn.btka[16] = -3312814399975942379L;
        dn.btka[17] = 503398981498351079L;
        dn.btka[18] = 5597940855233550891L;
        dn.btka[19] = 3641666031048289220L;
        dn.btka[20] = -2741811377902473290L;
        dn.btka[21] = 5284518258596421334L;
        dn.btka[22] = -3305284037767239785L;
        dn.btka[23] = 5872624559857604983L;
        dn.btka[24] = -8943593011109242286L;
        dn.btka[25] = 5313252390887376888L;
        dn.btka[26] = -9066869742180291289L;
        dn.btka[27] = 3593978052332455573L;
        dn.btka[28] = -6985838277807364516L;
        dn.btka[29] = -2167963246265028020L;
        dn.btka[30] = 5752496377471096481L;
        dn.btka[31] = 995062004121177093L;
        dn.btka[32] = 7255480878574554500L;
        dn.btka[33] = 2474544713311140267L;
        dn.btka[34] = 7806420558524911154L;
        dn.btka[35] = -440227302158204758L;
        dn.btka[36] = -2500389925801464403L;
        dn.btka[37] = -497685170465658498L;
        dn.btka[38] = -3699612056707088020L;
        dn.btka[39] = -4170644491450038961L;
        dn.btka[40] = -5094959383950753536L;
        dn.btka[41] = 5290704637087510014L;
        dn.btka[42] = 4029875503862880739L;
        dn.btka[43] = 7859307190089608408L;
        dn.btka[44] = -7542093125745225204L;
        dn.btka[45] = 93734048763903529L;
        dn.btka[46] = 573839599742302984L;
        dn.btka[47] = 4142369440905927579L;
        dn.btka[48] = -8992904277256359348L;
        dn.btka[49] = 744119976371829932L;
        dn.btka[50] = -2850651591004784594L;
        dn.btka[51] = -4842429097937133697L;
        dn.btka[52] = -7303336467303341570L;
        dn.btka[53] = -5754748732196157589L;
        dn.btka[54] = -9115092817403387356L;
        dn.btka[55] = -4181492233932760933L;
        dn.btka[56] = 9189436998344132535L;
        dn.btka[57] = -396749034023955704L;
        dn.btka[58] = -4141953275901489157L;
        dn.btka[59] = 5549542212010682948L;
        dn.btka[60] = 2263576637603745022L;
        dn.btka[61] = -6837026554062589313L;
        dn.btka[62] = -7571588356594221895L;
        dn.btka[63] = -367590467867332858L;
        dn.btka[64] = 8777372104890229354L;
        dn.btka[65] = 6389957896111900046L;
        dn.btka[66] = 884431654103419568L;
        dn.btka[67] = -257245430632943800L;
        dn.btka[68] = -3206837789015553894L;
        dn.btka[69] = -8331643023240732444L;
        dn.btka[70] = -3775943414448437518L;
        dn.btka[71] = 5160033265885035297L;
        dn.btka[72] = -4282112108774411613L;
        dn.btka[73] = 5205743456084038463L;
        dn.btka[74] = 8701504658889925923L;
        dn.btka[75] = 4724458990445242640L;
        dn.btka[76] = -1750327909774534146L;
        dn.btka[77] = -8414190893614453920L;
        dn.btka[78] = -6872985559779380395L;
        dn.btka[79] = 2729900279264338813L;
        dn.btka[80] = 3532745572012404393L;
        dn.btka[81] = 6292574862216767120L;
        dn.btka[82] = 5327601801741464068L;
        dn.btka[83] = 4933948384138588423L;
        dn.btka[84] = 3761051188257171836L;
        dn.btka[85] = 2714977673838273229L;
        dn.btka[86] = 5828135403840215703L;
        dn.btka[87] = 8683957933825443577L;
        dn.btka[88] = -8384953975027235861L;
        dn.btka[89] = 4753983150718217281L;
        dn.btka[90] = -105896153949059173L;
        dn.btka[91] = 403257432966054085L;
        dn.btka[92] = 6762348218692461944L;
        dn.btka[93] = -1971497887571055246L;
        dn.btka[94] = 5652135292131424863L;
        dn.btka[95] = -2218584552394217636L;
        dn.btka[96] = -471978643885063670L;
        dn.btka[97] = -8105562719731242504L;
        dn.btka[98] = 5108098476233739253L;
        dn.btka[99] = -3764467278398399305L;
    }

    private static /* synthetic */ void bvah() {
        dn.btjz[100] = 139703984022702239L;
        dn.btjz[101] = -4815487738556962219L;
        dn.btjz[102] = 5678324535547414978L;
        dn.btjz[103] = -174170018458756128L;
        dn.btjz[104] = -3464936854556023629L;
        dn.btjz[105] = -888057724808707970L;
        dn.btjz[106] = 2379019297431421324L;
        dn.btjz[107] = -8235339626404643092L;
        dn.btjz[108] = 8457438344771680786L;
        dn.btjz[109] = 4539669280900417208L;
        dn.btjz[110] = 3625566439397821476L;
        dn.btjz[111] = 3170604806244207853L;
        dn.btjz[112] = 858073871944093328L;
        dn.btjz[113] = 1177093058691044748L;
        dn.btjz[114] = 2818264106788770068L;
        dn.btjz[115] = -819912017463343590L;
        dn.btjz[116] = 2831670673069930979L;
        dn.btjz[117] = -8744148001449685050L;
        dn.btjz[118] = -2039478691558559745L;
        dn.btjz[119] = -7363571887778648176L;
        dn.btjz[120] = -2645141100459484089L;
        dn.btjz[121] = 6565609214188447030L;
        dn.btjz[122] = -2494461105005270475L;
        dn.btjz[123] = 284915130619892515L;
        dn.btjz[124] = 2365793649978777183L;
        dn.btjz[125] = 294204265229177236L;
        dn.btjz[126] = 6282644736729418252L;
        dn.btjz[127] = 6092719810919448721L;
        dn.btjz[128] = -3365603686530321822L;
        dn.btjz[129] = -4116816929463965869L;
        dn.btjz[130] = -8672365650443713820L;
        dn.btjz[131] = -7785888607934650876L;
        dn.btjz[132] = 7279153733828363458L;
        dn.btjz[133] = -598104662812428173L;
        dn.btjz[134] = -7896196601716897473L;
        dn.btjz[135] = 7171147697949526257L;
        dn.btjz[136] = -3189071624823760505L;
        dn.btjz[137] = -324028730296723617L;
        dn.btjz[138] = 8151914309644222581L;
        dn.btjz[139] = 3143180344083032096L;
        dn.btjz[140] = 7031158491202147591L;
        dn.btjz[141] = 7124471888514433130L;
        dn.btjz[142] = 4892029825230615281L;
        dn.btjz[143] = -7049085283687059190L;
        dn.btjz[144] = -3342087360115172102L;
        dn.btjz[145] = -1058227359356935615L;
        dn.btjz[146] = 333324850715502471L;
        dn.btjz[147] = -4122841855747171908L;
        dn.btjz[148] = -5712707588061877854L;
        dn.btjz[149] = -2998792857198747143L;
        dn.btjz[150] = -120730029559326137L;
        dn.btjz[151] = -4960454881178535267L;
        dn.btjz[152] = 2742176260459294527L;
        dn.btjz[153] = 839607111133183250L;
        dn.btjz[154] = 2660609601593415432L;
        dn.btjz[155] = 8173405420876689431L;
        dn.btjz[156] = 1510382401628802486L;
        dn.btjz[157] = 692031613682385209L;
        dn.btjz[158] = -6502897222820377903L;
        dn.btjz[159] = 6315415797169039831L;
        dn.btjz[160] = 4457801195496622439L;
        dn.btjz[161] = -5360247626259674153L;
        dn.btjz[162] = -1105892921817982605L;
        dn.btjz[163] = 2473114503687812361L;
        dn.btjz[164] = -5060278977656651400L;
        dn.btjz[165] = -5688374495476710816L;
        dn.btjz[166] = -568854318269726203L;
        dn.btjz[167] = -3155484689387645062L;
        dn.btjz[168] = 8258071370802228359L;
        dn.btjz[169] = 8962194911526000081L;
        dn.btjz[170] = 2851989324177671476L;
        dn.btjz[171] = 6647563665845164993L;
        dn.btjz[172] = -3477767617618916724L;
        dn.btjz[173] = -2786049095541105982L;
        dn.btjz[174] = -5620441394294771133L;
        dn.btjz[175] = 496091065097330401L;
        dn.btjz[176] = 3290720332955722299L;
        dn.btjz[177] = 2195196243958213891L;
        dn.btjz[178] = -3217005190842469997L;
        dn.btjz[179] = -4897203813554267373L;
        dn.btjz[180] = -7056609484016307958L;
        dn.btjz[181] = 6008379761166171203L;
        dn.btjz[182] = -8471554822492874185L;
        dn.btjz[183] = -1290985243130021159L;
        dn.btjz[184] = -6036647211678731168L;
        dn.btjz[185] = -5555726873978064241L;
        dn.btjz[186] = -1476952990849655779L;
        dn.btjz[187] = -4859457666778768840L;
        dn.btjz[188] = 2626171703017006186L;
        dn.btjz[189] = -7482635843661976939L;
        dn.btjz[190] = -3521681104997936454L;
        dn.btjz[191] = 4719734865213518909L;
        dn.btjz[192] = -2555940214076632579L;
        dn.btjz[193] = 8404718451104241088L;
        dn.btjz[194] = 4824776303714604369L;
        dn.btjz[195] = 1002811015307714117L;
        dn.btjz[196] = 8578437953142991726L;
        dn.btjz[197] = -1843075241412197118L;
        dn.btjz[198] = -2822404864783799177L;
        dn.btjz[199] = -5147876281914250400L;
    }

    private static /* synthetic */ void bvax() {
        dn.btjz[200] = 2574210975507204320L;
        dn.btjz[201] = 7763880075142954774L;
        dn.btjz[202] = 7176254804920396288L;
        dn.btjz[203] = -5234320688250582296L;
        dn.btjz[204] = -658656239232101985L;
        dn.btjz[205] = -5506615986199914095L;
        dn.btjz[206] = -8399447091693425945L;
        dn.btjz[207] = 222849382238938488L;
        dn.btjz[208] = -5927491564592011886L;
        dn.btjz[209] = 697122906026812225L;
        dn.btjz[210] = 9045485684902121813L;
        dn.btjz[211] = -1343168204714142404L;
        dn.btjz[212] = -8449201111231595246L;
        dn.btjz[213] = -5348338585038221917L;
        dn.btjz[214] = -5405630938833223411L;
        dn.btjz[215] = 1811241724442941633L;
        dn.btjz[216] = 3560555996547799127L;
        dn.btjz[217] = -3083265655026048529L;
        dn.btjz[218] = 7048680974543562731L;
        dn.btjz[219] = 8575190343982738333L;
        dn.btjz[220] = -3423449685178428165L;
        dn.btjz[221] = 7160488656465067711L;
        dn.btjz[222] = -4835115006215263706L;
        dn.btjz[223] = -2846077651927598489L;
        dn.btjz[224] = -1437221823413143958L;
        dn.btjz[225] = -8577577735407010613L;
        dn.btjz[226] = -2106135730115341321L;
        dn.btjz[227] = 8904570429994295782L;
        dn.btjz[228] = 1586042081281000261L;
        dn.btjz[229] = -5198505528640377362L;
        dn.btjz[230] = -2264802126946893166L;
        dn.btjz[231] = -4103466241814933228L;
        dn.btjz[232] = -5401967557766255388L;
        dn.btjz[233] = 5050527133284816239L;
        dn.btjz[234] = 5465269688520359269L;
        dn.btjz[235] = -7541626818697614625L;
        dn.btjz[236] = -4555685370495569100L;
        dn.btjz[237] = -8993619238445574632L;
        dn.btjz[238] = -4904414459305298134L;
        dn.btjz[239] = 6742359367292066595L;
        dn.btjz[240] = 2886463682077143452L;
        dn.btjz[241] = 242664631382682850L;
        dn.btjz[242] = 8938144342144633990L;
        dn.btjz[243] = 5537742023771351049L;
        dn.btjz[244] = 7842716150940899106L;
        dn.btjz[245] = 9152231935368627054L;
        dn.btjz[246] = -6111337468215727372L;
        dn.btjz[247] = 6519130409157643048L;
        dn.btjz[248] = -3361481451747534722L;
        dn.btjz[249] = -6314107901230274469L;
        dn.btjz[250] = 5722561960746441710L;
        dn.btjz[251] = 1433799413370821369L;
        dn.btjz[252] = -7194562687987500749L;
        dn.btjz[253] = -798315444455920601L;
        dn.btjz[254] = 3962102398862901143L;
        dn.btjz[255] = -6991800176202117864L;
        dn.btjz[256] = -4444210207158302196L;
        dn.btjz[257] = 1673211513690864004L;
        dn.btjz[258] = -8161224101686847974L;
        dn.btjz[259] = -1303304806834615658L;
        dn.btjz[260] = -8855586964586821975L;
        dn.btjz[261] = -1558770022798787909L;
        dn.btjz[262] = -3952289772827343083L;
        dn.btjz[263] = -6159113893855946825L;
        dn.btjz[264] = -7278923243596861921L;
        dn.btjz[265] = -8546071832749588638L;
        dn.btjz[266] = 1244250667318739200L;
        dn.btjz[267] = 8995743139146623585L;
        dn.btjz[268] = 8942932899515583473L;
        dn.btjz[269] = 983230535597375777L;
        dn.btjz[270] = 1640112438416597391L;
        dn.btjz[271] = -8433063531168832807L;
        dn.btjz[272] = -7215270130813865138L;
        dn.btjz[273] = -4269328328434250529L;
        dn.btjz[274] = 4126826675513337213L;
        dn.btjz[275] = -2294236253913720998L;
        dn.btjz[276] = -2040878299444069128L;
        dn.btjz[277] = 5287159715578085317L;
        dn.btjz[278] = 1362868017645300787L;
        dn.btjz[279] = -1124230147582492338L;
        dn.btjz[280] = 4182597706887733226L;
        dn.btjz[281] = -1407377290727658244L;
        dn.btjz[282] = -3218586750455375859L;
        dn.btjz[283] = -1211971693789884381L;
        dn.btjz[284] = -6872647477320686451L;
        dn.btjz[285] = -6728154254136864698L;
        dn.btjz[286] = 34220240683454690L;
        dn.btjz[287] = -6721998520579400992L;
        dn.btjz[288] = 671098255383202012L;
        dn.btjz[289] = 140591898844754443L;
        dn.btjz[290] = -5564042174106694850L;
        dn.btjz[291] = 3373377694524086309L;
        dn.btjz[292] = 8687736963615619682L;
        dn.btjz[293] = 832807324788834511L;
        dn.btjz[294] = -8041966430756861410L;
        dn.btjz[295] = 1808282044460081151L;
        dn.btjz[296] = -2219494836779959594L;
        dn.btjz[297] = 92017951041593326L;
        dn.btjz[298] = 6576519179157062179L;
        dn.btjz[299] = 5765275923482231124L;
    }

    static {
        btjo = new int[386];
        btjp = new int[386];
        dn.buvm();
        dn.buvx();
        dn.buwk();
        dn.buwz();
        dn.buxl();
        dn.buyd();
        dn.buyq();
        dn.buza();
        btjz = new long[301];
        btka = new long[301];
        dn.buzk();
        dn.bvah();
        dn.bvax();
        dn.btjz[300] = 6213023365566044450L;
        dn.bvbn();
        dn.bvcb();
        dn.bvco();
        dn.btka[300] = -896059566196821657L;
    }

    private static /* synthetic */ void buvx() {
        dn.btjo[100] = 1272991898;
        dn.btjo[101] = 160598025;
        dn.btjo[102] = -1586501581;
        dn.btjo[103] = 1196964244;
        dn.btjo[104] = -1443023464;
        dn.btjo[105] = -685480418;
        dn.btjo[106] = 1224904302;
        dn.btjo[107] = 1528257477;
        dn.btjo[108] = 595528682;
        dn.btjo[109] = -1555182389;
        dn.btjo[110] = -1609621859;
        dn.btjo[111] = -255231801;
        dn.btjo[112] = -1289647057;
        dn.btjo[113] = -477275176;
        dn.btjo[114] = 1917200176;
        dn.btjo[115] = -1010468677;
        dn.btjo[116] = 1657207369;
        dn.btjo[117] = -770239615;
        dn.btjo[118] = 243972309;
        dn.btjo[119] = 584557998;
        dn.btjo[120] = -2035189481;
        dn.btjo[121] = -351324133;
        dn.btjo[122] = -1742181321;
        dn.btjo[123] = 292482560;
        dn.btjo[124] = -1835388312;
        dn.btjo[125] = 28695438;
        dn.btjo[126] = 715803242;
        dn.btjo[127] = -1542278377;
        dn.btjo[128] = -2071436936;
        dn.btjo[129] = 1005472767;
        dn.btjo[130] = -1815867494;
        dn.btjo[131] = -1371893110;
        dn.btjo[132] = -1203880069;
        dn.btjo[133] = 1275097640;
        dn.btjo[134] = 1743134831;
        dn.btjo[135] = 115705180;
        dn.btjo[136] = -1526001214;
        dn.btjo[137] = -1728941746;
        dn.btjo[138] = -673189175;
        dn.btjo[139] = -808666991;
        dn.btjo[140] = 1576664600;
        dn.btjo[141] = 1438991687;
        dn.btjo[142] = 1378803988;
        dn.btjo[143] = 1371040955;
        dn.btjo[144] = -1347858148;
        dn.btjo[145] = -812989578;
        dn.btjo[146] = -427735445;
        dn.btjo[147] = -1993619721;
        dn.btjo[148] = -1161120112;
        dn.btjo[149] = -2034415901;
        dn.btjo[150] = 966716210;
        dn.btjo[151] = -865110216;
        dn.btjo[152] = -1088581805;
        dn.btjo[153] = -600169103;
        dn.btjo[154] = -1865794868;
        dn.btjo[155] = -436734782;
        dn.btjo[156] = 1457341931;
        dn.btjo[157] = 605306544;
        dn.btjo[158] = 1885393111;
        dn.btjo[159] = -1678779387;
        dn.btjo[160] = -2108583655;
        dn.btjo[161] = 1280847644;
        dn.btjo[162] = 2030728304;
        dn.btjo[163] = 506956719;
        dn.btjo[164] = 1871524510;
        dn.btjo[165] = 1412009957;
        dn.btjo[166] = -1548189304;
        dn.btjo[167] = 1573583822;
        dn.btjo[168] = -753754909;
        dn.btjo[169] = -205581344;
        dn.btjo[170] = 2140545990;
        dn.btjo[171] = -1517398902;
        dn.btjo[172] = -2119555503;
        dn.btjo[173] = -1961895611;
        dn.btjo[174] = -1414997196;
        dn.btjo[175] = 2072491221;
        dn.btjo[176] = 1699868278;
        dn.btjo[177] = -719730358;
        dn.btjo[178] = 2042595664;
        dn.btjo[179] = 2001007214;
        dn.btjo[180] = -451023866;
        dn.btjo[181] = -1186968395;
        dn.btjo[182] = 798743924;
        dn.btjo[183] = 2131515037;
        dn.btjo[184] = -1531013817;
        dn.btjo[185] = -2076240359;
        dn.btjo[186] = 2111934003;
        dn.btjo[187] = -1894949731;
        dn.btjo[188] = 896496071;
        dn.btjo[189] = -725306124;
        dn.btjo[190] = 898956557;
        dn.btjo[191] = 1560488717;
        dn.btjo[192] = -1821248360;
        dn.btjo[193] = 1841622292;
        dn.btjo[194] = -1797506692;
        dn.btjo[195] = 1527449034;
        dn.btjo[196] = 1771609146;
        dn.btjo[197] = 928522558;
        dn.btjo[198] = -1187231330;
        dn.btjo[199] = -1173614532;
    }

    private static /* synthetic */ void buzk() {
        dn.btjz[0] = -6771638628512735200L;
        dn.btjz[1] = -8085459856708630473L;
        dn.btjz[2] = 1032835244844838545L;
        dn.btjz[3] = -2853303679386251187L;
        dn.btjz[4] = -2244785006394753773L;
        dn.btjz[5] = 1546818061094024546L;
        dn.btjz[6] = 339677473005449383L;
        dn.btjz[7] = -3914973116881996143L;
        dn.btjz[8] = 8895481489858712978L;
        dn.btjz[9] = 1595660678628017687L;
        dn.btjz[10] = -1669544091278052258L;
        dn.btjz[11] = -4362128423533735358L;
        dn.btjz[12] = -2159822581991346591L;
        dn.btjz[13] = 6176835299918827474L;
        dn.btjz[14] = 3208001713534426319L;
        dn.btjz[15] = 8565903471670228375L;
        dn.btjz[16] = 3754799243974304639L;
        dn.btjz[17] = 1021443113905896854L;
        dn.btjz[18] = -7867510413704681622L;
        dn.btjz[19] = -6920643013390873925L;
        dn.btjz[20] = 3262320949942249020L;
        dn.btjz[21] = 5470969524237497343L;
        dn.btjz[22] = 2086268080096371420L;
        dn.btjz[23] = -8486463479868730636L;
        dn.btjz[24] = 1965537693607650401L;
        dn.btjz[25] = 8401176818610570452L;
        dn.btjz[26] = -752316133571962355L;
        dn.btjz[27] = 3170810497718236483L;
        dn.btjz[28] = 9054348278512105173L;
        dn.btjz[29] = 7455999546737373871L;
        dn.btjz[30] = 6565838659885893053L;
        dn.btjz[31] = 5937199918458304178L;
        dn.btjz[32] = 3368666871932810287L;
        dn.btjz[33] = -2577011141744171131L;
        dn.btjz[34] = 7105570297224392389L;
        dn.btjz[35] = 4060251197095767641L;
        dn.btjz[36] = -6194519373763422244L;
        dn.btjz[37] = 9172698110347225660L;
        dn.btjz[38] = 5220747303026458316L;
        dn.btjz[39] = -966593346865833520L;
        dn.btjz[40] = -3345191025163428127L;
        dn.btjz[41] = -7347289077737452078L;
        dn.btjz[42] = 3783592498015697684L;
        dn.btjz[43] = 5441778210767711560L;
        dn.btjz[44] = -4225260896378475765L;
        dn.btjz[45] = -1345375122328395775L;
        dn.btjz[46] = 7439116203095787630L;
        dn.btjz[47] = -2112673544265398832L;
        dn.btjz[48] = -1508653583617227621L;
        dn.btjz[49] = 8899857071043645964L;
        dn.btjz[50] = -6617361992345828345L;
        dn.btjz[51] = -2567714207493488772L;
        dn.btjz[52] = -99701497920771344L;
        dn.btjz[53] = 5010442034060606039L;
        dn.btjz[54] = -8625624686196843376L;
        dn.btjz[55] = 5800740474508226669L;
        dn.btjz[56] = -7835977674825061184L;
        dn.btjz[57] = 5879358534354955840L;
        dn.btjz[58] = -8586234298824787094L;
        dn.btjz[59] = 7712344424132680520L;
        dn.btjz[60] = 2219364048056582259L;
        dn.btjz[61] = 3645475887404577477L;
        dn.btjz[62] = 3176107272047055079L;
        dn.btjz[63] = 1947218398338622895L;
        dn.btjz[64] = 7269477868567713898L;
        dn.btjz[65] = -1485646025440722723L;
        dn.btjz[66] = 5791411861227048184L;
        dn.btjz[67] = -3643228174307917987L;
        dn.btjz[68] = -7527851040208193491L;
        dn.btjz[69] = -2841753168384715264L;
        dn.btjz[70] = -2631898364934554507L;
        dn.btjz[71] = 1878844298526093709L;
        dn.btjz[72] = -4433966720175843023L;
        dn.btjz[73] = -5881921162239011625L;
        dn.btjz[74] = 8577478556413793926L;
        dn.btjz[75] = 1928676630374225277L;
        dn.btjz[76] = -6581163022878190188L;
        dn.btjz[77] = -6306997734290015544L;
        dn.btjz[78] = 7694364931492828309L;
        dn.btjz[79] = 119561569974003278L;
        dn.btjz[80] = -4525676590105477782L;
        dn.btjz[81] = -7116021321295308278L;
        dn.btjz[82] = -8068128597983610300L;
        dn.btjz[83] = -6678519516506052391L;
        dn.btjz[84] = 6793716598948142590L;
        dn.btjz[85] = 5516590741777958243L;
        dn.btjz[86] = -4102875086662275826L;
        dn.btjz[87] = 4588045100275205929L;
        dn.btjz[88] = 522838912583040512L;
        dn.btjz[89] = 8658604957752392446L;
        dn.btjz[90] = -281393178821066364L;
        dn.btjz[91] = 4669286703097257364L;
        dn.btjz[92] = 1341927413633902997L;
        dn.btjz[93] = 3873574947160211218L;
        dn.btjz[94] = -4928024651510774783L;
        dn.btjz[95] = -5291810689510045557L;
        dn.btjz[96] = 1315542341148518057L;
        dn.btjz[97] = 7583102306243295230L;
        dn.btjz[98] = -2286939852857572524L;
        dn.btjz[99] = -7965904375481453078L;
    }

    private static /* synthetic */ void buyd() {
        dn.btjp[100] = 1272991898;
        dn.btjp[101] = -160598026;
        dn.btjp[102] = 1618259942;
        dn.btjp[103] = 1196964245;
        dn.btjp[104] = 913096386;
        dn.btjp[105] = 685480417;
        dn.btjp[106] = 1522470879;
        dn.btjp[107] = 1528257474;
        dn.btjp[108] = 595528683;
        dn.btjp[109] = -1555182392;
        dn.btjp[110] = -1609621861;
        dn.btjp[111] = -255231806;
        dn.btjp[112] = -1289647059;
        dn.btjp[113] = -477275174;
        dn.btjp[114] = 1917200177;
        dn.btjp[115] = 1010468676;
        dn.btjp[116] = 1410672966;
        dn.btjp[117] = -770239616;
        dn.btjp[118] = -1900354869;
        dn.btjp[119] = -584557999;
        dn.btjp[120] = 169503801;
        dn.btjp[121] = 351324132;
        dn.btjp[122] = -184619659;
        dn.btjp[123] = 292482565;
        dn.btjp[124] = -1835388311;
        dn.btjp[125] = 28695434;
        dn.btjp[126] = 715803242;
        dn.btjp[127] = -1542278379;
        dn.btjp[128] = -2071436934;
        dn.btjp[129] = 1005472766;
        dn.btjp[130] = -658370344;
        dn.btjp[131] = -1371893109;
        dn.btjp[132] = 2145725769;
        dn.btjp[133] = 1275097647;
        dn.btjp[134] = 1743134826;
        dn.btjp[135] = 115705180;
        dn.btjp[136] = -1526001214;
        dn.btjp[137] = -1728941750;
        dn.btjp[138] = -673189173;
        dn.btjp[139] = -808666990;
        dn.btjp[140] = 1576664602;
        dn.btjp[141] = -1438991688;
        dn.btjp[142] = 1699459652;
        dn.btjp[143] = -1371040956;
        dn.btjp[144] = -533523690;
        dn.btjp[145] = 812989577;
        dn.btjp[146] = -4436304;
        dn.btjp[147] = -1973883022;
        dn.btjp[148] = -1161120112;
        dn.btjp[149] = -2034415904;
        dn.btjp[150] = 966716208;
        dn.btjp[151] = -865110213;
        dn.btjp[152] = 1088581804;
        dn.btjp[153] = 1723058976;
        dn.btjp[154] = 1865794867;
        dn.btjp[155] = 1808658041;
        dn.btjp[156] = -1457341932;
        dn.btjp[157] = 563548897;
        dn.btjp[158] = -1885393112;
        dn.btjp[159] = -789317054;
        dn.btjp[160] = 2108583654;
        dn.btjp[161] = 979775592;
        dn.btjp[162] = 2030728304;
        dn.btjp[163] = 506956716;
        dn.btjp[164] = 1871524509;
        dn.btjp[165] = 1412009957;
        dn.btjp[166] = 1548189303;
        dn.btjp[167] = -1658737663;
        dn.btjp[168] = -753754910;
        dn.btjp[169] = 1722846098;
        dn.btjp[170] = -2140545991;
        dn.btjp[171] = -1119484825;
        dn.btjp[172] = 2119555502;
        dn.btjp[173] = -340431483;
        dn.btjp[174] = -1414997194;
        dn.btjp[175] = 2072491216;
        dn.btjp[176] = 1699868272;
        dn.btjp[177] = -719730355;
        dn.btjp[178] = 2042595666;
        dn.btjp[179] = 2001007209;
        dn.btjp[180] = -451023872;
        dn.btjp[181] = -1186968397;
        dn.btjp[182] = 798743925;
        dn.btjp[183] = 650600384;
        dn.btjp[184] = 1531013816;
        dn.btjp[185] = 647520822;
        dn.btjp[186] = 2111934002;
        dn.btjp[187] = 1996079420;
        dn.btjp[188] = 896496070;
        dn.btjp[189] = 570049344;
        dn.btjp[190] = -898956558;
        dn.btjp[191] = 399773518;
        dn.btjp[192] = -1821248359;
        dn.btjp[193] = -1841622293;
        dn.btjp[194] = 879739885;
        dn.btjp[195] = -1527449035;
        dn.btjp[196] = 1680219540;
        dn.btjp[197] = 928522545;
        dn.btjp[198] = -1187231346;
        dn.btjp[199] = -1173614542;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void clearList() {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = eg - dn.btjq("btsj", btjy(int ), (int)108)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == dn.btjq("btsk", btjn(int ), (int)115)) break;
            object = dn.btjq("btsl", btjn(int ), (int)116);
        }
        boolean bl2 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = eg - dn.btjq("btsm", btjy(int ), (int)109)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == dn.btjq("btsn", btjn(int ), (int)117)) break;
            object = dn.btjq("btso", btjn(int ), (int)118);
        }
        int n2 = b;
        Object object = eg;
        block6: while (true) {
            switch ((int)object) {
                case -1533606997: {
                    break block6;
                }
                case 1123069835: {
                    object = dn.btjq("btsq", btjy(int ), (int)111) - dn.btjq("btsp", btjy(int ), (int)110);
                    continue block6;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3 || bl3) return;
        while (true) {
            long l4;
            Object object2;
            if ((object2 = (l4 = eg - dn.btjq("btsr", btjy(int ), (int)112)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object2 == dn.btjq("btss", btjn(int ), (int)119)) break;
            object2 = dn.btjq("btst", btjn(int ), (int)120);
        }
        while (true) {
            long l5;
            Object object3;
            if ((object3 = (l5 = eg - dn.btjq("btsu", btjy(int ), (int)113)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object3 == dn.btjq("btsv", btjn(int ), (int)121)) {
                this.macroList.clear();
                if (bl3) return;
                break;
            }
            object3 = dn.btjq("btsw", btjn(int ), (int)122);
        }
        if (!bl3) return;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setMacros(List<dm> var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dn.eg - dn.btjq("btwa", btjy(int ), (int)152)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == dn.btjq("btwb", btjn(int ), (int)166)) break;
            v0 /* !! */  = (long)dn.btjq("btwc", btjn(int ), (int)167);
        }
        var4_2 = dn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = dn.eg - dn.btjq("btwd", btjy(int ), (int)153)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == dn.btjq("btwe", btjn(int ), (int)168)) break;
            v1 /* !! */  = (long)dn.btjq("btwf", btjn(int ), (int)169);
        }
        var3_3 /* !! */  = dn.b;
        v2 /* !! */  = dn.eg;
        if (true) ** GOTO lbl17
        block25: while (true) {
            v2 /* !! */  = (long)(dn.btjq("btwh", btjy(int ), (int)155) - dn.btjq("btwg", btjy(int ), (int)154));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1533606997: {
                    break block25;
                }
                case 1470320166: {
                    continue block25;
                }
            }
            break;
        }
        var2_4 = dn.a;
        if (var4_2) {
            throw null;
lbl25:
            // 3 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl25
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = dn.eg - dn.btjq("btwi", btjy(int ), (int)156)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == dn.btjq("btwj", btjn(int ), (int)170)) break;
                    v3 /* !! */  = (long)dn.btjq("btwk", btjn(int ), (int)171);
                }
                v4 /* !! */  = dn.eg;
                if (true) ** GOTO lbl40
                block28: while (true) {
                    v4 /* !! */  = (long)(v5 - dn.btjq("btwl", btjy(int ), (int)157));
lbl40:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1533606997: {
                            break block28;
                        }
                        case 2091915943: {
                            v5 = dn.btjq("btwm", btjy(int ), (int)158);
                            continue block28;
                        }
                        case 2112892053: {
                            v5 = dn.btjq("btwn", btjy(int ), (int)159);
                            continue block28;
                        }
                    }
                    break;
                }
                this.macroList.clear();
                if (var2_4 || var2_4) ** GOTO lbl25
                v6 /* !! */  = dn.eg;
                if (true) ** GOTO lbl55
                block29: while (true) {
                    v6 /* !! */  = (long)(dn.btjq("btwp", btjy(int ), (int)161) - dn.btjq("btwo", btjy(int ), (int)160));
lbl55:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1533606997: {
                            break block29;
                        }
                        case 62426687: {
                            continue block29;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = dn.eg - dn.btjq("btwq", btjy(int ), (int)162)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == dn.btjq("btwr", btjn(int ), (int)172)) break;
                    v7 /* !! */  = (long)dn.btjq("btws", btjn(int ), (int)173);
                }
                this.macroList.addAll(var1_1);
                if (var2_4 || var2_4) ** continue;
                return;
            }
lbl68:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)dn.btjq("btwt", btjn(int ), (int)174);
                if (var4_2) {
                    throw null;
                }
            }
lbl72:
            // 5 sources

            case 1: {
                var3_3 /* !! */  = (int)dn.btjq("btwv", btjn(int ), (int)175);
                if (!var4_2) ** GOTO lbl68
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)dn.btjq("btww", btjn(int ), (int)176);
                    if (!var4_2) ** GOTO lbl72
                    throw null;
                }
            }
lbl81:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)dn.btjq("btwy", btjn(int ), (int)177);
                if (!var4_2) ** GOTO lbl72
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)dn.btjq("btxa", btjn(int ), (int)178);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl95
            }
            case 5: {
                do {
                    var3_3 /* !! */  = (int)dn.btjq("btxc", btjn(int ), (int)179);
                } while (!var4_2);
                throw null;
            }
lbl95:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)dn.btjq("btxd", btjn(int ), (int)180);
                if (!var4_2) ** GOTO lbl81
                throw null;
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)dn.btjq("btxf", btjn(int ), (int)181);
        ** while (!var4_2)
lbl102:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$getMacro$1(String var0, dm var1_1) {
        v0 /* !! */  = dn.eg;
        if (true) ** GOTO lbl5
        block31: while (true) {
            v0 /* !! */  = (long)(v1 - dn.btjq("busp", btjy(int ), (int)279));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1533606997: {
                    break block31;
                }
                case -1508949540: {
                    v1 = dn.btjq("busq", btjy(int ), (int)280);
                    continue block31;
                }
                case 1360989152: {
                    v1 = dn.btjq("busr", btjy(int ), (int)281);
                    continue block31;
                }
                case 1711455615: {
                    v1 = dn.btjq("buss", btjy(int ), (int)282);
                    continue block31;
                }
            }
            break;
        }
        var4_2 = dn.c;
        v2 /* !! */  = dn.eg;
        if (true) ** GOTO lbl22
        block32: while (true) {
            v2 /* !! */  = (long)(v3 - dn.btjq("bust", btjy(int ), (int)283));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1533606997: {
                    break block32;
                }
                case -885064081: {
                    v3 = dn.btjq("busv", btjy(int ), (int)284);
                    continue block32;
                }
                case 1046915950: {
                    v3 = dn.btjq("busw", btjy(int ), (int)285);
                    continue block32;
                }
            }
            break;
        }
        var3_3 /* !! */  = dn.b;
        v4 /* !! */  = dn.eg;
        if (true) ** GOTO lbl36
        block33: while (true) {
            v4 /* !! */  = (long)(v5 - dn.btjq("busy", btjy(int ), (int)286));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1806943732: {
                    v5 = dn.btjq("busz", btjy(int ), (int)287);
                    continue block33;
                }
                case -1533606997: {
                    break block33;
                }
                case 707952598: {
                    v5 = dn.btjq("buta", btjy(int ), (int)288);
                    continue block33;
                }
                case 1264507780: {
                    v5 = dn.btjq("butb", btjy(int ), (int)289);
                    continue block33;
                }
            }
            break;
        }
        var2_4 = dn.a;
        if (var4_2) {
            throw null;
lbl51:
            // 2 sources

            return (boolean)dn.btjq("butd", btjn(int ), (int)368);
        }
        if (var2_4) ** GOTO lbl51
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block17 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                v6 /* !! */  = dn.eg;
                if (true) ** GOTO lbl62
                block35: while (true) {
                    v6 /* !! */  = (long)(dn.btjq("butf", btjy(int ), (int)291) - dn.btjq("bute", btjy(int ), (int)290));
lbl62:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1533606997: {
                            break block35;
                        }
                        case 1529460733: {
                            continue block35;
                        }
                    }
                    break;
                }
                v7 = var1_1.name();
                v8 /* !! */  = dn.eg;
                if (true) ** GOTO lbl72
                block36: while (true) {
                    v8 /* !! */  = (long)(dn.btjq("buth", btjy(int ), (int)293) - dn.btjq("butg", btjy(int ), (int)292));
lbl72:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1533606997: {
                            break block36;
                        }
                        case 2090785115: {
                            continue block36;
                        }
                    }
                    break;
                }
                return v7.equalsIgnoreCase(var0);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)dn.btjq("butj", btjn(int ), (int)369);
                    if (!var4_2) break block17;
                    throw null;
                }
            }
lbl83:
            // 2 sources

            case 1: {
                do {
                    var3_3 /* !! */  = (int)dn.btjq("butk", btjn(int ), (int)370);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)dn.btjq("butl", btjn(int ), (int)371);
                if (!var4_2) ** GOTO lbl83
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)dn.btjq("butm", btjn(int ), (int)372);
        ** while (!var4_2)
lbl95:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void buvm() {
        dn.btjo[0] = -1650672030;
        dn.btjo[1] = -1508163836;
        dn.btjo[2] = 190940521;
        dn.btjo[3] = 2004629471;
        dn.btjo[4] = -254896643;
        dn.btjo[5] = 746095217;
        dn.btjo[6] = 708076651;
        dn.btjo[7] = -1967114619;
        dn.btjo[8] = -656759279;
        dn.btjo[9] = -2035080788;
        dn.btjo[10] = -1655658641;
        dn.btjo[11] = 1017400661;
        dn.btjo[12] = -1852520074;
        dn.btjo[13] = 1188823917;
        dn.btjo[14] = 1694756468;
        dn.btjo[15] = -537549485;
        dn.btjo[16] = 292285987;
        dn.btjo[17] = -1393080429;
        dn.btjo[18] = 1085745209;
        dn.btjo[19] = -270448981;
        dn.btjo[20] = 95648873;
        dn.btjo[21] = 1272648255;
        dn.btjo[22] = -1642547368;
        dn.btjo[23] = 83514221;
        dn.btjo[24] = -738079653;
        dn.btjo[25] = -2006299336;
        dn.btjo[26] = -569725265;
        dn.btjo[27] = -1547647836;
        dn.btjo[28] = -1207778651;
        dn.btjo[29] = -439206206;
        dn.btjo[30] = 1307537559;
        dn.btjo[31] = 1345474478;
        dn.btjo[32] = -1619564073;
        dn.btjo[33] = 1511786743;
        dn.btjo[34] = 1500693492;
        dn.btjo[35] = 159401757;
        dn.btjo[36] = -1665570263;
        dn.btjo[37] = 850382782;
        dn.btjo[38] = 1939584694;
        dn.btjo[39] = -940823520;
        dn.btjo[40] = 1150620878;
        dn.btjo[41] = -570997388;
        dn.btjo[42] = -2132911501;
        dn.btjo[43] = 981217009;
        dn.btjo[44] = 1045396581;
        dn.btjo[45] = -1372732996;
        dn.btjo[46] = -2142232092;
        dn.btjo[47] = 1292650496;
        dn.btjo[48] = 1047669975;
        dn.btjo[49] = 248562144;
        dn.btjo[50] = 1471265964;
        dn.btjo[51] = 625786100;
        dn.btjo[52] = -235201069;
        dn.btjo[53] = -1121595705;
        dn.btjo[54] = 1735102420;
        dn.btjo[55] = 926484080;
        dn.btjo[56] = -538063771;
        dn.btjo[57] = 270667974;
        dn.btjo[58] = 498714047;
        dn.btjo[59] = 824820118;
        dn.btjo[60] = 1263206454;
        dn.btjo[61] = -139836473;
        dn.btjo[62] = 113934900;
        dn.btjo[63] = 1552344857;
        dn.btjo[64] = 1380947774;
        dn.btjo[65] = 772195814;
        dn.btjo[66] = 375843681;
        dn.btjo[67] = -238698884;
        dn.btjo[68] = -1723220511;
        dn.btjo[69] = -1534199500;
        dn.btjo[70] = 125645796;
        dn.btjo[71] = -1980175524;
        dn.btjo[72] = -29293786;
        dn.btjo[73] = 969378328;
        dn.btjo[74] = 1744625930;
        dn.btjo[75] = 1563045703;
        dn.btjo[76] = -1256552203;
        dn.btjo[77] = 1441338615;
        dn.btjo[78] = -1439470033;
        dn.btjo[79] = 1482203618;
        dn.btjo[80] = 1479640735;
        dn.btjo[81] = -678877291;
        dn.btjo[82] = -916655760;
        dn.btjo[83] = 1425954253;
        dn.btjo[84] = -1554550264;
        dn.btjo[85] = -966735714;
        dn.btjo[86] = 474198266;
        dn.btjo[87] = -2058147081;
        dn.btjo[88] = 457951900;
        dn.btjo[89] = -317446955;
        dn.btjo[90] = -705244199;
        dn.btjo[91] = -979182840;
        dn.btjo[92] = -1953933197;
        dn.btjo[93] = -1723088212;
        dn.btjo[94] = 1407008816;
        dn.btjo[95] = -1837000021;
        dn.btjo[96] = 1177435538;
        dn.btjo[97] = -688473166;
        dn.btjo[98] = -1613510139;
        dn.btjo[99] = 1286331278;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Optional<dm> getMacro(String var1_1) {
        v0 /* !! */  = dn.eg;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(dn.btjq("btpp", btjy(int ), (int)74) - dn.btjq("btpo", btjy(int ), (int)73));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1533606997: {
                    break block23;
                }
                case -1037887495: {
                    continue block23;
                }
            }
            break;
        }
        var4_2 = dn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = dn.eg - dn.btjq("btpq", btjy(int ), (int)75)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == dn.btjq("btpr", btjn(int ), (int)77)) break;
            v1 /* !! */  = (long)dn.btjq("btps", btjn(int ), (int)78);
        }
        var3_3 /* !! */  = dn.b;
        v2 /* !! */  = dn.eg;
        if (true) ** GOTO lbl21
        block25: while (true) {
            v2 /* !! */  = (long)(dn.btjq("btpu", btjy(int ), (int)77) - dn.btjq("btpt", btjy(int ), (int)76));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2129123406: {
                    continue block25;
                }
                case -1533606997: {
                    break block25;
                }
            }
            break;
        }
        var2_4 = dn.a;
        if (var4_2) {
            throw null;
            return null;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = dn.eg - dn.btjq("btpv", btjy(int ), (int)78)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == dn.btjq("btpw", btjn(int ), (int)79)) break;
                    v3 /* !! */  = (long)dn.btjq("btpx", btjn(int ), (int)80);
                }
                v4 /* !! */  = dn.eg;
                if (true) ** GOTO lbl44
                block28: while (true) {
                    v4 /* !! */  = (long)(v5 - dn.btjq("btpy", btjy(int ), (int)79));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1533606997: {
                            break block28;
                        }
                        case 300705055: {
                            v5 = dn.btjq("btpz", btjy(int ), (int)80);
                            continue block28;
                        }
                        case 1842872106: {
                            v5 = dn.btjq("btqa", btjy(int ), (int)81);
                            continue block28;
                        }
                    }
                    break;
                }
                v6 = this.macroList.stream();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = dn.eg - dn.btjq("btqb", btjy(int ), (int)82)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == dn.btjq("btqc", btjn(int ), (int)81)) break;
                    v7 /* !! */  = (long)dn.btjq("btqd", btjn(int ), (int)82);
                }
                v8 = (Predicate<dm>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$getMacro$1(java.lang.String ruhack.phobia.dm ), (Lruhack/phobia/dm;)Z)((String)var1_1);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = dn.eg - dn.btjq("btqe", btjy(int ), (int)83)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == dn.btjq("btqf", btjn(int ), (int)83)) break;
                    v9 /* !! */  = (long)dn.btjq("btqg", btjn(int ), (int)84);
                }
                v10 = v6.filter(v8);
                v11 /* !! */  = dn.eg;
                if (true) ** GOTO lbl70
                block31: while (true) {
                    v11 /* !! */  = (long)(dn.btjq("btqi", btjy(int ), (int)85) - dn.btjq("btqh", btjy(int ), (int)84));
lbl70:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1533606997: {
                            break block31;
                        }
                        case -121851567: {
                            continue block31;
                        }
                    }
                    break;
                }
                return v10.findFirst();
            }
            case 0: {
                var3_3 /* !! */  = (int)dn.btjq("btqj", btjn(int ), (int)85);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl85
            }
            case 1: {
                var3_3 /* !! */  = (int)dn.btjq("btqk", btjn(int ), (int)86);
                if (!var4_2) break;
                throw null;
            }
lbl85:
            // 2 sources

            case 2: {
                do {
                    var3_3 /* !! */  = (int)dn.btjq("btql", btjn(int ), (int)87);
                } while (!var4_2);
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)dn.btjq("btqm", btjn(int ), (int)88);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean hasMacro(String var1_1) {
        v0 /* !! */  = dn.eg;
        if (true) ** GOTO lbl5
        block32: while (true) {
            v0 /* !! */  = (long)(v1 - dn.btjq("bton", btjy(int ), (int)55));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1575342381: {
                    v1 = dn.btjq("btoo", btjy(int ), (int)56);
                    continue block32;
                }
                case -1533606997: {
                    break block32;
                }
                case 986419256: {
                    v1 = dn.btjq("btop", btjy(int ), (int)57);
                    continue block32;
                }
            }
            break;
        }
        var4_2 = dn.c;
        v2 /* !! */  = dn.eg;
        if (true) ** GOTO lbl19
        block33: while (true) {
            v2 /* !! */  = (long)(v3 - dn.btjq("btoq", btjy(int ), (int)58));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1533606997: {
                    break block33;
                }
                case -307943606: {
                    v3 = dn.btjq("btor", btjy(int ), (int)59);
                    continue block33;
                }
                case 156236229: {
                    v3 = dn.btjq("btos", btjy(int ), (int)60);
                    continue block33;
                }
            }
            break;
        }
        var3_3 /* !! */  = dn.b;
        v4 /* !! */  = dn.eg;
        if (true) ** GOTO lbl33
        block34: while (true) {
            v4 /* !! */  = (long)(dn.btjq("btou", btjy(int ), (int)62) - dn.btjq("btot", btjy(int ), (int)61));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1533606997: {
                    break block34;
                }
                case 26203143: {
                    continue block34;
                }
            }
            break;
        }
        var2_4 = dn.a;
        if (var4_2) {
            throw null;
lbl41:
            // 1 sources

            return (boolean)dn.btjq("btov", btjn(int ), (int)68);
        }
        ** while (var2_4 || var2_4)
lbl44:
        // 1 sources

        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block14 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = dn.eg;
                if (true) ** GOTO lbl51
                block36: while (true) {
                    v5 /* !! */  = (long)(v6 - dn.btjq("btow", btjy(int ), (int)63));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2070184672: {
                            v6 = dn.btjq("btox", btjy(int ), (int)64);
                            continue block36;
                        }
                        case -2035272034: {
                            v6 = dn.btjq("btoy", btjy(int ), (int)65);
                            continue block36;
                        }
                        case -1533606997: {
                            break block36;
                        }
                        case -542164763: {
                            v6 = dn.btjq("btoz", btjy(int ), (int)66);
                            continue block36;
                        }
                    }
                    break;
                }
                v7 /* !! */  = dn.eg;
                if (true) ** GOTO lbl67
                block37: while (true) {
                    v7 /* !! */  = (long)(v8 - dn.btjq("btpa", btjy(int ), (int)67));
lbl67:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1533606997: {
                            break block37;
                        }
                        case -165626446: {
                            v8 = dn.btjq("btpb", btjy(int ), (int)68);
                            continue block37;
                        }
                        case 9471952: {
                            v8 = dn.btjq("btpc", btjy(int ), (int)69);
                            continue block37;
                        }
                        case 1391062666: {
                            v8 = dn.btjq("btpd", btjy(int ), (int)70);
                            continue block37;
                        }
                    }
                    break;
                }
                v9 = this.macroList.stream();
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_0 = dn.eg - dn.btjq("btpe", btjy(int ), (int)71)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == dn.btjq("btpf", btjn(int ), (int)69)) break;
                    v10 /* !! */  = (long)dn.btjq("btpg", btjn(int ), (int)70);
                }
                v11 = (Predicate<dm>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$hasMacro$0(java.lang.String ruhack.phobia.dm ), (Lruhack/phobia/dm;)Z)((String)var1_1);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_1 = dn.eg - dn.btjq("btph", btjy(int ), (int)72)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == dn.btjq("btpi", btjn(int ), (int)71)) break;
                    v12 /* !! */  = (long)dn.btjq("btpj", btjn(int ), (int)72);
                }
                return v9.anyMatch(v11);
            }
            case 0: {
                var3_3 /* !! */  = (int)dn.btjq("btpk", btjn(int ), (int)73);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl102
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)dn.btjq("btpl", btjn(int ), (int)74);
                    if (!var4_2) break block14;
                    throw null;
                }
            }
lbl102:
            // 2 sources

            case 2: {
                do {
                    var3_3 /* !! */  = (int)dn.btjq("btpm", btjn(int ), (int)75);
                } while (!var4_2);
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)dn.btjq("btpn", btjn(int ), (int)76);
        ** while (!var4_2)
lbl110:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void buwz() {
        dn.btjo[300] = -90467065;
        dn.btjo[301] = 1675835667;
        dn.btjo[302] = -349378752;
        dn.btjo[303] = -1507719244;
        dn.btjo[304] = 432176786;
        dn.btjo[305] = 1213132184;
        dn.btjo[306] = 2080773592;
        dn.btjo[307] = -608193990;
        dn.btjo[308] = 217124672;
        dn.btjo[309] = 1133136162;
        dn.btjo[310] = -512806121;
        dn.btjo[311] = -998084885;
        dn.btjo[312] = -450610104;
        dn.btjo[313] = -1738531506;
        dn.btjo[314] = -1038842574;
        dn.btjo[315] = 1063593560;
        dn.btjo[316] = -2137559544;
        dn.btjo[317] = -1410900895;
        dn.btjo[318] = -997034166;
        dn.btjo[319] = -583381148;
        dn.btjo[320] = -2061317948;
        dn.btjo[321] = -250856660;
        dn.btjo[322] = 458784869;
        dn.btjo[323] = -1842936185;
        dn.btjo[324] = -2115834068;
        dn.btjo[325] = 1872845596;
        dn.btjo[326] = 126598908;
        dn.btjo[327] = 1932323930;
        dn.btjo[328] = 818611227;
        dn.btjo[329] = -114289510;
        dn.btjo[330] = 232182116;
        dn.btjo[331] = 484881933;
        dn.btjo[332] = -630520374;
        dn.btjo[333] = -681149039;
        dn.btjo[334] = -1221959690;
        dn.btjo[335] = -2042344189;
        dn.btjo[336] = -322896431;
        dn.btjo[337] = -222662281;
        dn.btjo[338] = 1541365242;
        dn.btjo[339] = 1388413639;
        dn.btjo[340] = -538640338;
        dn.btjo[341] = 2044912695;
        dn.btjo[342] = -1326295476;
        dn.btjo[343] = -1485468018;
        dn.btjo[344] = 1103179260;
        dn.btjo[345] = -1924415549;
        dn.btjo[346] = 302134294;
        dn.btjo[347] = 510306798;
        dn.btjo[348] = -14266010;
        dn.btjo[349] = -773071798;
        dn.btjo[350] = -1051666910;
        dn.btjo[351] = 1647855430;
        dn.btjo[352] = 2093221363;
        dn.btjo[353] = -968690126;
        dn.btjo[354] = -1686371733;
        dn.btjo[355] = 52957728;
        dn.btjo[356] = 430623483;
        dn.btjo[357] = -8764946;
        dn.btjo[358] = -168131340;
        dn.btjo[359] = -135317299;
        dn.btjo[360] = 815128422;
        dn.btjo[361] = 560617125;
        dn.btjo[362] = -1227873610;
        dn.btjo[363] = -1209499330;
        dn.btjo[364] = -116134347;
        dn.btjo[365] = 1954301670;
        dn.btjo[366] = -1414365748;
        dn.btjo[367] = 192653691;
        dn.btjo[368] = 388183028;
        dn.btjo[369] = -2045397646;
        dn.btjo[370] = -1535761244;
        dn.btjo[371] = -323622383;
        dn.btjo[372] = -1944882906;
        dn.btjo[373] = -1601136615;
        dn.btjo[374] = 674507556;
        dn.btjo[375] = 1077416514;
        dn.btjo[376] = 1331100375;
        dn.btjo[377] = -254908140;
        dn.btjo[378] = -503079672;
        dn.btjo[379] = -135317023;
        dn.btjo[380] = 1995354726;
        dn.btjo[381] = 411300609;
        dn.btjo[382] = 1061213914;
        dn.btjo[383] = -815279414;
        dn.btjo[384] = 2126969440;
        dn.btjo[385] = -868012405;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block73: {
            block72: {
                block71: {
                    block70: {
                        var5_2 = dn.c;
                        var4_3 /* !! */  = dn.b;
                        var3_4 = dn.a;
                        if (var5_2) {
                            throw null;
lbl6:
                            // 19 sources

                            return;
                        }
                        if (var3_4 || var3_4) ** GOTO lbl6
                        if (this.pendingMacro != null) break block70;
                        if (var3_4) ** GOTO lbl6
                        return;
                    }
                    if (var3_4 || var3_4) ** GOTO lbl6
                    if (this.mc.field_1724 == null) break block71;
                    if (var3_4) ** GOTO lbl6
                    if (this.mc.field_1724.field_3944 != null) break block72;
                    if (var3_4) ** GOTO lbl6
                }
                if (var3_4 || var3_4) ** GOTO lbl6
                this.finishMacro();
                if (var3_4 || var3_4) ** GOTO lbl6
                return;
            }
            if (var3_4 || var3_4) ** GOTO lbl6
            this.movement.block();
            if (var3_4 || var3_4) ** GOTO lbl6
            v0 = this.stopTicks;
            this.stopTicks = v0 - dn.btjq("bucm", btjn(int ), (int)217);
            if (v0 <= 0) break block73;
            if (var3_4) ** GOTO lbl6
            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl6
        var2_5 = this.pendingMacro.message();
        if (var3_4) ** GOTO lbl6
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl6
                if (!var2_5.startsWith("/")) ** GOTO lbl47
                if (var3_4 || var3_4) ** GOTO lbl6
                this.mc.field_1724.field_3944.method_45730(var2_5.substring((int)dn.btjq("bucp", btjn(int ), (int)218)));
                if (var3_4) ** GOTO lbl6
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl50
lbl47:
                // 1 sources

                if (var3_4 || var3_4) ** GOTO lbl6
                this.mc.field_1724.field_3944.method_45729(var2_5);
                if (var3_4) ** GOTO lbl6
lbl50:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl6
                this.finishMacro();
                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
lbl55:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)dn.btjq("bucu", btjn(int ), (int)219);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl76
                    break;
                }
            }
            case 1: {
                var4_3 /* !! */  = (int)dn.btjq("bucw", btjn(int ), (int)220);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl110
            }
            case 2: {
                var4_3 /* !! */  = (int)dn.btjq("bucx", btjn(int ), (int)221);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl71:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)dn.btjq("bucz", btjn(int ), (int)222);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl76:
            // 3 sources

            case 4: {
                var4_3 /* !! */  = (int)dn.btjq("budb", btjn(int ), (int)223);
                if (var5_2) {
                    throw null;
                }
            }
lbl80:
            // 6 sources

            case 5: {
                var4_3 /* !! */  = (int)dn.btjq("budd", btjn(int ), (int)224);
                if (!var5_2) ** GOTO lbl55
                throw null;
            }
            case 6: {
                var4_3 /* !! */  = (int)dn.btjq("bude", btjn(int ), (int)225);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl89:
            // 2 sources

            case 7: {
                var4_3 /* !! */  = (int)dn.btjq("budg", btjn(int ), (int)226);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl94:
            // 2 sources

            case 8: {
                var4_3 /* !! */  = (int)dn.btjq("budi", btjn(int ), (int)227);
                if (!var5_2) ** GOTO lbl80
                throw null;
            }
            case 9: {
                var4_3 /* !! */  = (int)dn.btjq("budj", btjn(int ), (int)228);
                if (!var5_2) ** GOTO lbl94
                throw null;
            }
            case 10: {
                var4_3 /* !! */  = (int)dn.btjq("budl", btjn(int ), (int)229);
                if (!var5_2) ** GOTO lbl71
                throw null;
            }
lbl106:
            // 2 sources

            case 11: {
                var4_3 /* !! */  = (int)dn.btjq("budn", btjn(int ), (int)230);
                if (!var5_2) ** GOTO lbl80
                throw null;
            }
lbl110:
            // 3 sources

            case 12: {
                var4_3 /* !! */  = (int)dn.btjq("budp", btjn(int ), (int)231);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl115:
            // 2 sources

            case 13: {
                var4_3 /* !! */  = (int)dn.btjq("budq", btjn(int ), (int)232);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl120:
            // 3 sources

            case 14: {
                var4_3 /* !! */  = (int)dn.btjq("buds", btjn(int ), (int)233);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl125:
            // 2 sources

            case 15: {
                var4_3 /* !! */  = (int)dn.btjq("budt", btjn(int ), (int)234);
                if (!var5_2) ** GOTO lbl120
                throw null;
            }
lbl129:
            // 2 sources

            case 16: {
                var4_3 /* !! */  = (int)dn.btjq("budv", btjn(int ), (int)235);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl134:
            // 3 sources

            case 17: {
                var4_3 /* !! */  = (int)dn.btjq("budy", btjn(int ), (int)236);
                if (!var5_2) ** GOTO lbl89
                throw null;
            }
lbl138:
            // 2 sources

            case 18: {
                var4_3 /* !! */  = (int)dn.btjq("budz", btjn(int ), (int)237);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl143:
            // 2 sources

            case 19: {
                var4_3 /* !! */  = (int)dn.btjq("buea", btjn(int ), (int)238);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl148:
            // 2 sources

            case 20: {
                var4_3 /* !! */  = (int)dn.btjq("bueb", btjn(int ), (int)239);
                if (!var5_2) ** GOTO lbl110
                throw null;
            }
            case 21: {
                var4_3 /* !! */  = (int)dn.btjq("bued", btjn(int ), (int)240);
                if (!var5_2) ** GOTO lbl80
                throw null;
            }
            case 22: {
                var4_3 /* !! */  = (int)dn.btjq("buef", btjn(int ), (int)241);
                if (!var5_2) ** GOTO lbl129
                throw null;
            }
lbl160:
            // 3 sources

            case 23: {
                var4_3 /* !! */  = (int)dn.btjq("bueh", btjn(int ), (int)242);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl194
            }
lbl165:
            // 3 sources

            case 24: {
                var4_3 /* !! */  = (int)dn.btjq("buek", btjn(int ), (int)243);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl170:
            // 2 sources

            case 25: {
                var4_3 /* !! */  = (int)dn.btjq("buem", btjn(int ), (int)244);
                if (!var5_2) ** GOTO lbl138
                throw null;
            }
lbl174:
            // 2 sources

            case 26: {
                var4_3 /* !! */  = (int)dn.btjq("bueq", btjn(int ), (int)245);
                if (!var5_2) ** GOTO lbl160
                throw null;
            }
lbl178:
            // 2 sources

            case 27: {
                var4_3 /* !! */  = (int)dn.btjq("buet", btjn(int ), (int)246);
                if (!var5_2) ** GOTO lbl125
                throw null;
            }
lbl182:
            // 2 sources

            case 28: {
                var4_3 /* !! */  = (int)dn.btjq("buew", btjn(int ), (int)247);
                if (!var5_2) ** GOTO lbl160
                throw null;
            }
            case 29: {
                var4_3 /* !! */  = (int)dn.btjq("buex", btjn(int ), (int)248);
                if (!var5_2) ** GOTO lbl115
                throw null;
            }
            case 30: {
                var4_3 /* !! */  = (int)dn.btjq("buey", btjn(int ), (int)249);
                if (var5_2) {
                    throw null;
                }
            }
lbl194:
            // 4 sources

            case 31: {
                var4_3 /* !! */  = (int)dn.btjq("buez", btjn(int ), (int)250);
                if (!var5_2) ** GOTO lbl106
                throw null;
            }
            case 32: {
                var4_3 /* !! */  = (int)dn.btjq("bufc", btjn(int ), (int)251);
                if (!var5_2) ** GOTO lbl76
                throw null;
            }
            case 33: 
        }
        var4_3 /* !! */  = (int)dn.btjq("bufh", btjn(int ), (int)252);
        ** while (!var5_2)
lbl205:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void clearListAndSave() {
        v0 /* !! */  = dn.eg;
        if (true) ** GOTO lbl5
        block31: while (true) {
            v0 /* !! */  = (long)(v1 - dn.btjq("bttd", btjy(int ), (int)114));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1533606997: {
                    break block31;
                }
                case -1050449385: {
                    v1 = dn.btjq("btte", btjy(int ), (int)115);
                    continue block31;
                }
                case 1962181891: {
                    v1 = dn.btjq("bttf", btjy(int ), (int)116);
                    continue block31;
                }
            }
            break;
        }
        var3_1 = dn.c;
        v2 /* !! */  = dn.eg;
        if (true) ** GOTO lbl19
        block32: while (true) {
            v2 /* !! */  = (long)(v3 - dn.btjq("bttg", btjy(int ), (int)117));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1926383671: {
                    v3 = dn.btjq("btth", btjy(int ), (int)118);
                    continue block32;
                }
                case -1533606997: {
                    break block32;
                }
                case -1068509728: {
                    v3 = dn.btjq("btti", btjy(int ), (int)119);
                    continue block32;
                }
                case 1786474436: {
                    v3 = dn.btjq("bttj", btjy(int ), (int)120);
                    continue block32;
                }
            }
            break;
        }
        var2_2 /* !! */  = dn.b;
        v4 /* !! */  = dn.eg;
        if (true) ** GOTO lbl36
        block33: while (true) {
            v4 /* !! */  = (long)(v5 - dn.btjq("bttk", btjy(int ), (int)121));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2142702022: {
                    v5 = dn.btjq("bttl", btjy(int ), (int)122);
                    continue block33;
                }
                case -1533606997: {
                    break block33;
                }
                case -1137188486: {
                    v5 = dn.btjq("bttm", btjy(int ), (int)123);
                    continue block33;
                }
            }
            break;
        }
        var1_3 = dn.a;
        if (var3_1) {
            throw null;
lbl48:
            // 4 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl48
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_0 = dn.eg - dn.btjq("bttn", btjy(int ), (int)124)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == dn.btjq("btto", btjn(int ), (int)129)) break;
            v6 /* !! */  = (long)dn.btjq("bttp", btjn(int ), (int)130);
        }
        this.clearList();
        if (var1_3) ** GOTO lbl48
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl48
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = dn.eg - dn.btjq("bttq", btjy(int ), (int)125)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == dn.btjq("bttr", btjn(int ), (int)131)) break;
                    v7 /* !! */  = (long)dn.btjq("btts", btjn(int ), (int)132);
                }
                v8 = al.getInstance();
                v9 /* !! */  = dn.eg;
                if (true) ** GOTO lbl72
                block37: while (true) {
                    v9 /* !! */  = (long)(v10 - dn.btjq("bttt", btjy(int ), (int)126));
lbl72:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1591702270: {
                            v10 = dn.btjq("bttu", btjy(int ), (int)127);
                            continue block37;
                        }
                        case -1580114063: {
                            v10 = dn.btjq("bttv", btjy(int ), (int)128);
                            continue block37;
                        }
                        case -1533606997: {
                            break block37;
                        }
                    }
                    break;
                }
                v8.save();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl85:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)dn.btjq("bttw", btjn(int ), (int)133);
                } while (!var3_1);
                throw null;
            }
lbl90:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)dn.btjq("bttx", btjn(int ), (int)134);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl100
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)dn.btjq("btty", btjn(int ), (int)135);
                } while (!var3_1);
                throw null;
            }
lbl100:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)dn.btjq("bttz", btjn(int ), (int)136);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl113
            }
            case 4: {
                var2_2 /* !! */  = (int)dn.btjq("btua", btjn(int ), (int)137);
                if (!var3_1) ** GOTO lbl100
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)dn.btjq("btub", btjn(int ), (int)138);
                if (!var3_1) ** GOTO lbl85
                throw null;
            }
lbl113:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)dn.btjq("btuc", btjn(int ), (int)139);
                if (!var3_1) ** GOTO lbl90
                throw null;
            }
            case 7: 
        }
        do {
            var2_2 /* !! */  = (int)dn.btjq("btud", btjn(int ), (int)140);
        } while (!var3_1);
        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public dm getPendingMacro() {
        Object object = eg;
        boolean bl2 = true;
        block9: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - dn.btjq("bunc", btjy(int ), (int)249);
            }
            switch ((int)object) {
                case -1533606997: {
                    break block9;
                }
                case -639205172: {
                    callSite = dn.btjq("bunf", btjy(int ), (int)250);
                    continue block9;
                }
                case 2130356178: {
                    callSite = dn.btjq("bung", btjy(int ), (int)251);
                    continue block9;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = eg - dn.btjq("bunh", btjy(int ), (int)252)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == dn.btjq("buni", btjn(int ), (int)321)) break;
            object2 = dn.btjq("bunj", btjn(int ), (int)322);
        }
        int n2 = b;
        Object object3 = eg;
        block11: while (true) {
            switch ((int)object3) {
                case -1533606997: {
                    break block11;
                }
                case 391993132: {
                    object3 = dn.btjq("bunl", btjy(int ), (int)254) - dn.btjq("bunk", btjy(int ), (int)253);
                    continue block11;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl3) {
            throw null;
        }
        if (bl4) return null;
        if (bl4) return null;
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = eg - dn.btjq("bunq", btjy(int ), (int)255)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object4 == dn.btjq("buns", btjn(int ), (int)323)) {
                return this.pendingMacro;
            }
            object4 = dn.btjq("bunu", btjn(int ), (int)324);
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean lambda$deleteMacro$2(String string, dm dm2) {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = eg - dn.btjq("burl", btjy(int ), (int)271)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == dn.btjq("burm", btjn(int ), (int)357)) break;
            object = dn.btjq("buro", btjn(int ), (int)358);
        }
        boolean bl2 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = eg - dn.btjq("burr", btjy(int ), (int)272)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == dn.btjq("burs", btjn(int ), (int)359)) break;
            object = dn.btjq("burt", btjn(int ), (int)360);
        }
        int n2 = b;
        Object object = eg;
        block11: while (true) {
            switch ((int)object) {
                case -1533606997: {
                    break block11;
                }
                case -875380813: {
                    object = dn.btjq("burv", btjy(int ), (int)274) - dn.btjq("buru", btjy(int ), (int)273);
                    continue block11;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return (boolean)dn.btjq("burw", btjn(int ), (int)361);
        if (bl3) return (boolean)dn.btjq("burw", btjn(int ), (int)361);
        Object object2 = eg;
        boolean bl4 = true;
        block12: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - dn.btjq("bury", btjy(int ), (int)275);
            }
            switch ((int)object2) {
                case -1533606997: {
                    break block12;
                }
                case -1426853121: {
                    callSite = dn.btjq("busc", btjy(int ), (int)276);
                    continue block12;
                }
                case 696794678: {
                    callSite = dn.btjq("busd", btjy(int ), (int)277);
                    continue block12;
                }
            }
            break;
        }
        String string2 = dm2.name();
        while (true) {
            long l4;
            Object object3;
            if ((object3 = (l4 = eg - dn.btjq("busf", btjy(int ), (int)278)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object3 == dn.btjq("bush", btjn(int ), (int)362)) {
                return string2.equalsIgnoreCase(string);
            }
            object3 = dn.btjq("busi", btjn(int ), (int)363);
        }
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean lambda$hasMacro$0(String var0, dm var1_1) {
        v0 /* !! */  = dn.eg;
        if (true) ** GOTO lbl5
        block11: while (true) {
            v0 /* !! */  = (long)(v1 - dn.btjq("buto", btjy(int ), (int)294));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1533606997: {
                    break block11;
                }
                case -944466091: {
                    v1 = dn.btjq("butp", btjy(int ), (int)295);
                    continue block11;
                }
                case -527838868: {
                    v1 = dn.btjq("butr", btjy(int ), (int)296);
                    continue block11;
                }
            }
            break;
        }
        var4_2 = dn.c;
        while (true) {
            block30: {
                if ((v2 /* !! */  = (cfr_temp_1 = dn.eg - dn.btjq("buts", btjy(int ), (int)297)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  != dn.btjq("butu", btjn(int ), (int)373)) break block30;
                var3_3 /* !! */  = dn.b;
                if (var3_3 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v2 /* !! */  = (long)dn.btjq("butv", btjn(int ), (int)374);
        }
        cfr_temp_0 = -2147483648;
        block13: while (true) {
            block31: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_2 = dn.eg - dn.btjq("butx", btjy(int ), (int)298)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v3 /* !! */  == dn.btjq("butz", btjn(int ), (int)375)) {
                                var2_4 = dn.a;
                                if (var4_2) {
                                    throw null;
                                }
                                break;
                            }
                            v3 /* !! */  = (long)dn.btjq("buua", btjn(int ), (int)376);
                        }
                        if (var2_4 != false) return (boolean)dn.btjq("buuf", btjn(int ), (int)377);
                        if (var2_4 != false) return (boolean)dn.btjq("buuf", btjn(int ), (int)377);
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_3 = dn.eg - dn.btjq("buug", btjy(int ), (int)299)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v4 /* !! */  == dn.btjq("buuh", btjn(int ), (int)378)) {
                                v5 = var1_1.name();
                                ** break;
                            }
                            v4 /* !! */  = (long)dn.btjq("buuj", btjn(int ), (int)379);
                        }
                    }
                    case 0: {
                        var3_3 /* !! */  = (int)dn.btjq("buus", btjn(int ), (int)382);
                        cfr_temp_0 = 2;
                        if (var4_2) {
                            throw null;
                        }
                        break block31;
                    }
                    case 3: {
                        var3_3 /* !! */  = (int)dn.btjq("buvi", btjn(int ), (int)385);
                        if (var4_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
lbl61:
                    // 1 sources

                    while (true) {
                        if ((v6 /* !! */  = (cfr_temp_4 = dn.eg - dn.btjq("buuk", btjy(int ), (int)300)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v6 /* !! */  == dn.btjq("buum", btjn(int ), (int)380)) {
                            return v5.equalsIgnoreCase(var0);
                        }
                        v6 /* !! */  = (long)dn.btjq("buun", btjn(int ), (int)381);
                    }
                    case 1: lbl-1000:
                    // 2 sources

                    {
                        var3_3 /* !! */  = (int)dn.btjq("buut", btjn(int ), (int)383);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl77
            }
            do {
                if (true) continue block13;
lbl77:
                // 2 sources

                var3_3 /* !! */  = (int)dn.btjq("buvf", btjn(int ), (int)384);
                cfr_temp_0 = 1;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void queueReallyWorldMacro(dm var1_1) {
        block76: {
            block74: {
                block72: {
                    while (true) {
                        block73: {
                            if ((v0 /* !! */  = (cfr_temp_0 = dn.eg - dn.btjq("bufm", btjy(int ), (int)197)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v0 /* !! */  != dn.btjq("bufo", btjn(int ), (int)253)) break block73;
                            var4_2 = dn.c;
                            v1 /* !! */  = dn.eg;
                            if (true) ** GOTO lbl13
                        }
                        v0 /* !! */  = (long)dn.btjq("bufp", btjn(int ), (int)254);
                    }
                    block43: while (true) {
                        v1 /* !! */  = (long)(v2 - dn.btjq("bufr", btjy(int ), (int)198));
lbl13:
                        // 2 sources

                        switch ((int)v1 /* !! */ ) {
                            case -2078665635: {
                                v2 = dn.btjq("bufv", btjy(int ), (int)199);
                                continue block43;
                            }
                            case -1533606997: {
                                break block43;
                            }
                            case -610861312: {
                                v2 = dn.btjq("bufw", btjy(int ), (int)200);
                                continue block43;
                            }
                        }
                        break;
                    }
                    var3_3 /* !! */  = dn.b;
                    v3 /* !! */  = dn.eg;
                    block44: while (true) {
                        switch ((int)v3 /* !! */ ) {
                            case -1777652717: {
                                v3 /* !! */  = (long)(dn.btjq("buga", btjy(int ), (int)202) - dn.btjq("bufz", btjy(int ), (int)201));
                                continue block44;
                            }
                            case -1533606997: {
                                break block44;
                            }
                        }
                        break;
                    }
                    var2_4 = dn.a;
                    if (var4_2) {
                        throw null;
                    }
                    if (var2_4 || var2_4) break block74;
                    v4 /* !! */  = dn.eg;
                    if (true) ** GOTO lbl39
                    block45: while (true) {
                        v4 /* !! */  = (long)(v5 - dn.btjq("bugc", btjy(int ), (int)203));
lbl39:
                        // 2 sources

                        switch ((int)v4 /* !! */ ) {
                            case -1533606997: {
                                break block45;
                            }
                            case -592834418: {
                                v5 = dn.btjq("buge", btjy(int ), (int)204);
                                continue block45;
                            }
                            case 1678987740: {
                                v5 = dn.btjq("bugh", btjy(int ), (int)205);
                                continue block45;
                            }
                        }
                        break;
                    }
                    this.pendingMacro = var1_1;
                    if (var2_4 || var2_4) break block74;
                    v6 = dn.btjq("bugj", btjn(int ), (int)255);
                    v7 /* !! */  = dn.eg;
                    block46: while (true) {
                        switch ((int)v7 /* !! */ ) {
                            case -2092470481: {
                                v7 /* !! */  = (long)(dn.btjq("bugm", btjy(int ), (int)207) - dn.btjq("bugk", btjy(int ), (int)206));
                                continue block46;
                            }
                            case -1533606997: {
                                break block46;
                            }
                        }
                        break;
                    }
                    this.stopTicks = (int)v6;
                    if (var2_4 || var2_4) break block74;
                    if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
                    switch (var3_3 /* !! */ ) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                if ((v8 /* !! */  = (cfr_temp_1 = dn.eg - dn.btjq("bugo", btjy(int ), (int)208)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                                    continue;
                                }
                                if (v8 /* !! */  == dn.btjq("bugp", btjn(int ), (int)256)) {
                                    v9 /* !! */  = dn.eg;
                                    break block72;
                                }
                                v8 /* !! */  = (long)dn.btjq("bugq", btjn(int ), (int)257);
                            }
                        }
                        case 1: {
                            var3_3 /* !! */  = (int)dn.btjq("buhk", btjn(int ), (int)261);
                            if (var4_2) {
                                throw null;
                            }
                        }
                        case 7: {
                            var3_3 /* !! */  = (int)dn.btjq("buhu", btjn(int ), (int)267);
                            if (var4_2) {
                                throw null;
                            }
                        }
                        case 2: {
                            ** GOTO lbl91
                        }
                        case 9: {
                            do {
                                var3_3 /* !! */  = (int)dn.btjq("buhy", btjn(int ), (int)269);
                            } while (!var4_2);
                            throw null;
                        }
                        case 11: {
                            var3_3 /* !! */  = (int)dn.btjq("buia", btjn(int ), (int)271);
                            if (var4_2) {
                                throw null;
                            }
lbl91:
                            // 3 sources

                            var3_3 /* !! */  = (int)dn.btjq("buhl", btjn(int ), (int)262);
                            if (var4_2) {
                                throw null;
                            }
                        }
                        case 6: {
                            var3_3 /* !! */  = (int)dn.btjq("buht", btjn(int ), (int)266);
                            if (var4_2) {
                                throw null;
                            }
                        }
                        case 8: {
                            var3_3 /* !! */  = (int)dn.btjq("buhw", btjn(int ), (int)268);
                            if (var4_2) {
                                throw null;
                            }
                        }
                        case 10: {
                            var3_3 /* !! */  = (int)dn.btjq("buhz", btjn(int ), (int)270);
                            if (var4_2) {
                                throw null;
                            }
                        }
                        case 5: {
                            var3_3 /* !! */  = (int)dn.btjq("buhr", btjn(int ), (int)265);
                            if (var4_2) {
                                throw null;
                            }
                        }
                        case 4: {
                            var3_3 /* !! */  = (int)dn.btjq("buho", btjn(int ), (int)264);
                            if (var4_2) {
                                throw null;
                            }
                        }
                        case 3: {
                            var3_3 /* !! */  = (int)dn.btjq("buhn", btjn(int ), (int)263);
                            if (var4_2) {
                                throw null;
                            }
                        }
                        case 0: 
                    }
                    do {
                        var3_3 /* !! */  = (int)dn.btjq("buhi", btjn(int ), (int)260);
                    } while (!var4_2);
                    throw null;
                }
                block50: while (true) {
                    switch ((int)v9 /* !! */ ) {
                        case -1533606997: {
                            break block50;
                        }
                        case 1730418346: {
                            v9 /* !! */  = (long)(dn.btjq("bugt", btjy(int ), (int)210) - dn.btjq("bugs", btjy(int ), (int)209));
                            continue block50;
                        }
                    }
                    break;
                }
                this.movement.saveState();
                if (var2_4 || var2_4) break block74;
                while (true) {
                    block75: {
                        if ((v10 /* !! */  = (cfr_temp_2 = dn.eg - dn.btjq("bugv", btjy(int ), (int)211)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v10 /* !! */  != dn.btjq("bugx", btjn(int ), (int)258)) break block75;
                        v11 /* !! */  = dn.eg;
                        if (true) ** GOTO lbl144
                    }
                    v10 /* !! */  = (long)dn.btjq("bugy", btjn(int ), (int)259);
                }
                block52: while (true) {
                    v11 /* !! */  = (long)(v12 - dn.btjq("bugz", btjy(int ), (int)212));
lbl144:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1533606997: {
                            break block52;
                        }
                        case -456647859: {
                            v12 = dn.btjq("buhb", btjy(int ), (int)213);
                            continue block52;
                        }
                        case 17510729: {
                            v12 = dn.btjq("buhg", btjy(int ), (int)214);
                            continue block52;
                        }
                        case 661158708: {
                            v12 = dn.btjq("buhh", btjy(int ), (int)215);
                            continue block52;
                        }
                    }
                    break;
                }
                this.movement.block();
                if (!var2_4 && !var2_4) break block76;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_310 getMc() {
        v0 /* !! */  = dn.eg;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - dn.btjq("bukt", btjy(int ), (int)233));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1533606997: {
                    break block20;
                }
                case -250646557: {
                    v1 = dn.btjq("buku", btjy(int ), (int)234);
                    continue block20;
                }
                case 1431611196: {
                    v1 = dn.btjq("bukv", btjy(int ), (int)235);
                    continue block20;
                }
                case 1707430812: {
                    v1 = dn.btjq("bukw", btjy(int ), (int)236);
                    continue block20;
                }
            }
            break;
        }
        var3_1 = dn.c;
        v2 /* !! */  = dn.eg;
        if (true) ** GOTO lbl22
        block21: while (true) {
            v2 /* !! */  = (long)(dn.btjq("bulb", btjy(int ), (int)238) - dn.btjq("bula", btjy(int ), (int)237));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1533606997: {
                    break block21;
                }
                case 511144490: {
                    continue block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = dn.b;
        v3 /* !! */  = dn.eg;
        if (true) ** GOTO lbl32
        block22: while (true) {
            v3 /* !! */  = (long)(dn.btjq("bulf", btjy(int ), (int)240) - dn.btjq("buld", btjy(int ), (int)239));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1533606997: {
                    break block22;
                }
                case 1067256877: {
                    continue block22;
                }
            }
            break;
        }
        var1_3 = dn.a;
        if (!var3_1) ** GOTO lbl44
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl44:
                // 1 sources

                if (var1_3 || var1_3) continue block23;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = dn.eg - dn.btjq("buli", btjy(int ), (int)241)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == dn.btjq("bulk", btjn(int ), (int)309)) break;
                    v4 /* !! */  = (long)dn.btjq("bulm", btjn(int ), (int)310);
                }
                return this.mc;
lbl52:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)dn.btjq("bulq", btjn(int ), (int)311);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl62
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)dn.btjq("buls", btjn(int ), (int)312);
                        if (!var3_1) break block23;
                        throw null;
                    }
                }
lbl62:
                // 2 sources

                case 2: {
                    var2_2 /* !! */  = (int)dn.btjq("bulu", btjn(int ), (int)313);
                    if (!var3_1) ** GOTO lbl52
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)dn.btjq("bulw", btjn(int ), (int)314);
        ** while (!var3_1)
lbl69:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public nx getMovement() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = dn.eg - dn.btjq("bulz", btjy(int ), (int)242)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == dn.btjq("buma", btjn(int ), (int)315)) break;
            v0 /* !! */  = (long)dn.btjq("bumh", btjn(int ), (int)316);
        }
        var3_1 = dn.c;
        v1 /* !! */  = dn.eg;
        block19: while (true) {
            switch ((int)v1 /* !! */ ) {
                case -1577055420: {
                    v1 /* !! */  = (long)(dn.btjq("bumj", btjy(int ), (int)244) - dn.btjq("bumi", btjy(int ), (int)243));
                    continue block19;
                }
                case -1533606997: {
                    break block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = dn.b;
        v2 /* !! */  = dn.eg;
        block20: while (true) {
            switch ((int)v2 /* !! */ ) {
                case -1533606997: {
                    break block20;
                }
                case -827595765: {
                    v2 /* !! */  = (long)(dn.btjq("bumm", btjy(int ), (int)246) - dn.btjq("buml", btjy(int ), (int)245));
                    continue block20;
                }
            }
            break;
        }
        var1_3 = dn.a;
        if (var3_1) {
            throw null;
        }
        if (var1_3 != false) return null;
        if (var1_3 != false) return null;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block21: while (true) {
            block28: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v3 /* !! */  = dn.eg;
                        block22: while (true) {
                            switch ((int)v3 /* !! */ ) {
                                case -1533606997: {
                                    return this.movement;
                                }
                                case 881610324: {
                                    v3 /* !! */  = (long)(dn.btjq("bumr", btjy(int ), (int)248) - dn.btjq("bumq", btjy(int ), (int)247));
                                    continue block22;
                                }
                            }
                            break;
                        }
                        return this.movement;
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)dn.btjq("bums", btjn(int ), (int)317);
                        cfr_temp_0 = 2;
                        if (var3_1) {
                            throw null;
                        }
                        break block28;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)dn.btjq("bumy", btjn(int ), (int)320);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 1: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)dn.btjq("bumu", btjn(int ), (int)318);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl63
            }
            do {
                if (true) continue block21;
lbl63:
                // 2 sources

                var2_2 /* !! */  = (int)dn.btjq("bumw", btjn(int ), (int)319);
                cfr_temp_0 = 1;
            } while (!var3_1);
            break;
        }
        throw null;
    }
}

