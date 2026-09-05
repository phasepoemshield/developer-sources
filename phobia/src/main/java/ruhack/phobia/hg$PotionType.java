/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1291
 *  net.minecraft.class_1294
 *  net.minecraft.class_6880
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1291;
import net.minecraft.class_1294;
import net.minecraft.class_6880;
import ruhack.phobia.hg;

final class hg$PotionType
extends Enum<hg$PotionType> {
    private static int[] ltsl = new int[46];
    final class_6880<class_1291> effect;
    private static long[] ltsb;
    public static final boolean a;
    public static final /* enum */ hg$PotionType FIRE_RESISTANCE;
    final String settingName;
    private static long[] ltsa;
    public static final int b;
    public static final /* enum */ hg$PotionType STRENGTH;
    public static final /* enum */ hg$PotionType SPEED;
    static final long ul = -4288155823898540602L;
    private static final /* synthetic */ hg$PotionType[] $VALUES;
    public static final boolean c;
    private static int[] ltsm;

    public static /* synthetic */ CallSite ltsc(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void ltvp() {
        hg$PotionType.ltsa[0] = -7192197336282896396L;
        hg$PotionType.ltsa[1] = -3733287733839581673L;
        hg$PotionType.ltsa[2] = -8254977298953384277L;
        hg$PotionType.ltsa[3] = 6697125651195968155L;
        hg$PotionType.ltsa[4] = 7017739987639649189L;
        hg$PotionType.ltsa[5] = -1493573012771245782L;
        hg$PotionType.ltsa[6] = -9177814171745406505L;
        hg$PotionType.ltsa[7] = 124849731037667191L;
        hg$PotionType.ltsa[8] = 3991805226113984664L;
        hg$PotionType.ltsa[9] = 5859830689816081789L;
        hg$PotionType.ltsa[10] = -7419337451951094734L;
        hg$PotionType.ltsa[11] = -4519516205030208257L;
        hg$PotionType.ltsa[12] = 1443253815326728392L;
        hg$PotionType.ltsa[13] = -1858055329956769825L;
        hg$PotionType.ltsa[14] = 5046189816482891715L;
        hg$PotionType.ltsa[15] = -4098719829966530979L;
        hg$PotionType.ltsa[16] = -257816369059652318L;
        hg$PotionType.ltsa[17] = 7993250725399013852L;
        hg$PotionType.ltsa[18] = 7021716545841222055L;
        hg$PotionType.ltsa[19] = 6104111851960921875L;
        hg$PotionType.ltsa[20] = -8206906945562746887L;
        hg$PotionType.ltsa[21] = -4227707575938605946L;
        hg$PotionType.ltsa[22] = -981217827895393273L;
        hg$PotionType.ltsa[23] = -8883979010620042994L;
        hg$PotionType.ltsa[24] = -924919494109224672L;
        hg$PotionType.ltsa[25] = -6268132618128950067L;
        hg$PotionType.ltsa[26] = 2495345840904436788L;
        hg$PotionType.ltsa[27] = 2988395514548825117L;
        hg$PotionType.ltsa[28] = -8471480050347529075L;
        hg$PotionType.ltsa[29] = 6298028082368013204L;
        hg$PotionType.ltsa[30] = -810596373658736898L;
        hg$PotionType.ltsa[31] = -1039623531866772448L;
        hg$PotionType.ltsa[32] = -1776398648361357783L;
        hg$PotionType.ltsa[33] = -1588385480353249207L;
        hg$PotionType.ltsa[34] = -1748663859214713957L;
        hg$PotionType.ltsa[35] = -1587316914602128264L;
        hg$PotionType.ltsa[36] = 7487016188435227284L;
        hg$PotionType.ltsa[37] = 4786382516971254620L;
        hg$PotionType.ltsa[38] = -4063534330865485789L;
    }

    private static /* synthetic */ long ltrz(int n2) {
        return ltsa[n2] ^ ltsb[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static hg$PotionType valueOf(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hg$PotionType.ul - hg$PotionType.ltsc("ltsy", ltrz(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hg$PotionType.ltsc("ltsz", ltsk(int ), (int)8)) break;
            v0 /* !! */  = (long)hg$PotionType.ltsc("ltta", ltsk(int ), (int)9);
        }
        var3_1 = hg$PotionType.c;
        v1 /* !! */  = hg$PotionType.ul;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(v2 - hg$PotionType.ltsc("lttb", ltrz(int ), (int)11));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1733490084: {
                    v2 = hg$PotionType.ltsc("lttc", ltrz(int ), (int)12);
                    continue block16;
                }
                case 1252369557: {
                    v2 = hg$PotionType.ltsc("lttd", ltrz(int ), (int)13);
                    continue block16;
                }
                case 1862354374: {
                    break block16;
                }
            }
            break;
        }
        var2_2 /* !! */  = hg$PotionType.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hg$PotionType.ul - hg$PotionType.ltsc("ltte", ltrz(int ), (int)14)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hg$PotionType.ltsc("lttf", ltsk(int ), (int)10)) break;
            v3 /* !! */  = (long)hg$PotionType.ltsc("lttg", ltsk(int ), (int)11);
        }
        var1_3 = hg$PotionType.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = hg$PotionType.ul;
                if (true) ** GOTO lbl42
                block19: while (true) {
                    v4 /* !! */  = (long)(hg$PotionType.ltsc("ltti", ltrz(int ), (int)16) - hg$PotionType.ltsc("ltth", ltrz(int ), (int)15));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1265877943: {
                            continue block19;
                        }
                        case 1862354374: {
                            break block19;
                        }
                    }
                    break;
                }
                return Enum.valueOf(hg$PotionType.class, var0);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hg$PotionType.ltsc("lttj", ltsk(int ), (int)12);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl58
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)hg$PotionType.ltsc("lttk", ltsk(int ), (int)13);
                if (!var3_1) break;
                throw null;
            }
lbl58:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)hg$PotionType.ltsc("lttl", ltsk(int ), (int)14);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hg$PotionType.ltsc("lttm", ltsk(int ), (int)15);
        ** while (!var3_1)
lbl66:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ltvq() {
        hg$PotionType.ltsb[0] = 7454083133479804169L;
        hg$PotionType.ltsb[1] = 8528344653936864061L;
        hg$PotionType.ltsb[2] = 8918743050306377151L;
        hg$PotionType.ltsb[3] = -3260455148875513280L;
        hg$PotionType.ltsb[4] = 6056277418863104809L;
        hg$PotionType.ltsb[5] = -8709424231469587974L;
        hg$PotionType.ltsb[6] = -974312393614417708L;
        hg$PotionType.ltsb[7] = 8351202997975227080L;
        hg$PotionType.ltsb[8] = -2956377796978011411L;
        hg$PotionType.ltsb[9] = -3298628020555853L;
        hg$PotionType.ltsb[10] = 4941725725736400591L;
        hg$PotionType.ltsb[11] = 4459780654044593076L;
        hg$PotionType.ltsb[12] = -2978031951431990804L;
        hg$PotionType.ltsb[13] = -2161429678659936350L;
        hg$PotionType.ltsb[14] = 6664156440958695570L;
        hg$PotionType.ltsb[15] = -8321466754769398501L;
        hg$PotionType.ltsb[16] = 9129296294563926385L;
        hg$PotionType.ltsb[17] = 4827121681687751335L;
        hg$PotionType.ltsb[18] = 4997794215149507188L;
        hg$PotionType.ltsb[19] = 2765162222358078425L;
        hg$PotionType.ltsb[20] = -6111393856168529827L;
        hg$PotionType.ltsb[21] = -4411655698094744214L;
        hg$PotionType.ltsb[22] = 1828923604940118846L;
        hg$PotionType.ltsb[23] = 7556742343821296698L;
        hg$PotionType.ltsb[24] = -7702070515748859972L;
        hg$PotionType.ltsb[25] = -3641156286387124876L;
        hg$PotionType.ltsb[26] = 6212628190216343213L;
        hg$PotionType.ltsb[27] = 3146520396162134664L;
        hg$PotionType.ltsb[28] = -1260093105716070327L;
        hg$PotionType.ltsb[29] = 3731536716494855707L;
        hg$PotionType.ltsb[30] = -8212750586268054450L;
        hg$PotionType.ltsb[31] = -7713816198581561289L;
        hg$PotionType.ltsb[32] = 2464026343421176297L;
        hg$PotionType.ltsb[33] = 4088468994537973743L;
        hg$PotionType.ltsb[34] = -6990985854615867451L;
        hg$PotionType.ltsb[35] = 4369785252170933999L;
        hg$PotionType.ltsb[36] = -5036261271660163539L;
        hg$PotionType.ltsb[37] = 4763276807321371015L;
        hg$PotionType.ltsb[38] = 3472365883657659734L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private hg$PotionType(class_6880<class_1291> var3_3, String var4_4) {
        var6_5 /* !! */  = hg$PotionType.b;
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var6_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var5_6 = hg$PotionType.a;
                super(var1_1, var2_2);
                this.effect = var3_3;
                this.settingName = var4_4;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_5 /* !! */  = (int)hg$PotionType.ltsc("lttn", ltsk(int ), (int)16);
                    break block0;
                    break;
                }
            }
            case 1: {
                var6_5 /* !! */  = (int)hg$PotionType.ltsc("ltto", ltsk(int ), (int)17);
                ** GOTO lbl19
            }
            case 2: {
                var6_5 /* !! */  = (int)hg$PotionType.ltsc("lttp", ltsk(int ), (int)18);
            }
lbl19:
            // 3 sources

            case 3: {
                var6_5 /* !! */  = (int)hg$PotionType.ltsc("lttq", ltsk(int ), (int)19);
            }
            case 4: 
        }
        var6_5 /* !! */  = (int)hg$PotionType.ltsc("lttr", ltsk(int ), (int)20);
        ** while (true)
    }

    static {
        ltsm = new int[46];
        hg$PotionType.ltvn();
        hg$PotionType.ltvo();
        ltsa = new long[39];
        ltsb = new long[39];
        hg$PotionType.ltvp();
        hg$PotionType.ltvq();
        STRENGTH = new hg$PotionType((class_6880<class_1291>)class_1294.field_5910, "\u0421\u0438\u043b\u0443");
        SPEED = new hg$PotionType((class_6880<class_1291>)class_1294.field_5904, "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c");
        FIRE_RESISTANCE = new hg$PotionType((class_6880<class_1291>)class_1294.field_5918, "\u041e\u0433\u043d\u0435\u0441\u0442\u043e\u0439\u043a\u043e\u0441\u0442\u044c");
        $VALUES = hg$PotionType.$values();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ hg$PotionType[] $values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hg$PotionType.ul - hg$PotionType.ltsc("ltuo", ltrz(int ), (int)32)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hg$PotionType.ltsc("ltup", ltsk(int ), (int)28)) break;
            v0 /* !! */  = (long)hg$PotionType.ltsc("ltuq", ltsk(int ), (int)29);
        }
        var2 = hg$PotionType.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hg$PotionType.ul - hg$PotionType.ltsc("ltur", ltrz(int ), (int)33)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hg$PotionType.ltsc("ltus", ltsk(int ), (int)30)) break;
            v1 /* !! */  = (long)hg$PotionType.ltsc("ltut", ltsk(int ), (int)31);
        }
        var1_1 /* !! */  = hg$PotionType.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = hg$PotionType.ul - hg$PotionType.ltsc("ltuu", ltrz(int ), (int)34)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hg$PotionType.ltsc("ltuv", ltsk(int ), (int)32)) break;
            v2 /* !! */  = (long)hg$PotionType.ltsc("ltuw", ltsk(int ), (int)33);
        }
        var0_2 = hg$PotionType.a;
        if (!var2) ** GOTO lbl28
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl28:
                // 1 sources

                if (var0_2 || var0_2) continue block13;
                v3 = new hg$PotionType[3];
                v4 = hg$PotionType.ltsc("ltux", ltsk(int ), (int)34);
                while (true) {
                    if ((v5 = (cfr_temp_3 = hg$PotionType.ul - hg$PotionType.ltsc("ltuy", ltrz(int ), (int)35)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 == hg$PotionType.ltsc("ltuz", ltsk(int ), (int)35)) break;
                    v5 = 1458623519;
                }
                v3[v4] = hg$PotionType.STRENGTH;
                v6 = hg$PotionType.ltsc("ltva", ltsk(int ), (int)36);
                while (true) {
                    if ((v7 = (cfr_temp_4 = hg$PotionType.ul - hg$PotionType.ltsc("ltvb", ltrz(int ), (int)36)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 == hg$PotionType.ltsc("ltvc", ltsk(int ), (int)37)) break;
                    v7 = 1018115;
                }
                v3[v6] = hg$PotionType.SPEED;
                v8 = hg$PotionType.ltsc("ltvd", ltsk(int ), (int)38);
                v9 /* !! */  = hg$PotionType.ul;
                if (true) ** GOTO lbl51
                block16: while (true) {
                    v9 /* !! */  = (long)(hg$PotionType.ltsc("ltvf", ltrz(int ), (int)38) - hg$PotionType.ltsc("ltve", ltrz(int ), (int)37));
lbl51:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1849479233: {
                            continue block16;
                        }
                        case 1862354374: {
                            break block16;
                        }
                    }
                    break;
                }
                v3[v8] = hg$PotionType.FIRE_RESISTANCE;
                return v3;
lbl58:
                // 2 sources

                case 0: {
                    do {
                        var1_1 /* !! */  = (int)hg$PotionType.ltsc("ltvg", ltsk(int ), (int)39);
                    } while (!var2);
                    throw null;
                }
                case 1: {
                    var1_1 /* !! */  = (int)hg$PotionType.ltsc("ltvh", ltsk(int ), (int)40);
                    if (!var2) ** GOTO lbl58
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 /* !! */  = (int)hg$PotionType.ltsc("ltvi", ltsk(int ), (int)41);
                        if (!var2) break block13;
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var1_1 /* !! */  = (int)hg$PotionType.ltsc("ltvj", ltsk(int ), (int)42);
        ** while (!var2)
lbl75:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static hg$PotionType[] values() {
        block33: {
            v0 /* !! */  = hg$PotionType.ul;
            block20: while (true) {
                switch ((int)v0 /* !! */ ) {
                    case -1335608023: {
                        v0 /* !! */  = (long)(hg$PotionType.ltsc("ltse", ltrz(int ), (int)1) - hg$PotionType.ltsc("ltsd", ltrz(int ), (int)0));
                        continue block20;
                    }
                    case 1862354374: {
                        break block20;
                    }
                }
                break;
            }
            var2 = hg$PotionType.c;
            v1 /* !! */  = hg$PotionType.ul;
            if (true) ** GOTO lbl14
            block21: while (true) {
                v1 /* !! */  = (long)(v2 - hg$PotionType.ltsc("ltsf", ltrz(int ), (int)2));
lbl14:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -170350983: {
                        v2 = hg$PotionType.ltsc("ltsg", ltrz(int ), (int)3);
                        continue block21;
                    }
                    case 775299390: {
                        v2 = hg$PotionType.ltsc("ltsh", ltrz(int ), (int)4);
                        continue block21;
                    }
                    case 1862354374: {
                        break block21;
                    }
                    case 1877652154: {
                        v2 = hg$PotionType.ltsc("ltsi", ltrz(int ), (int)5);
                        continue block21;
                    }
                }
                break;
            }
            var1_1 /* !! */  = hg$PotionType.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = hg$PotionType.ul - hg$PotionType.ltsc("ltsj", ltrz(int ), (int)6)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == hg$PotionType.ltsc("ltsn", ltsk(int ), (int)0)) {
                    var0_2 = hg$PotionType.a;
                    if (var2) {
                        throw null;
                    }
                    break;
                }
                v3 /* !! */  = (long)hg$PotionType.ltsc("ltso", ltsk(int ), (int)1);
            }
            if (!var0_2 && !var0_2) ** GOTO lbl43
            if (var1_1 /* !! */  == 0) return null;
            cfr_temp_0 = -2147483648;
            while (true) {
                switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                    default: {
                        return null;
                    }
lbl43:
                    // 1 sources

                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_2 = hg$PotionType.ul - hg$PotionType.ltsc("ltsp", ltrz(int ), (int)7)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v4 /* !! */  != hg$PotionType.ltsc("ltsq", ltsk(int ), (int)2)) {
                            v4 /* !! */  = (long)hg$PotionType.ltsc("ltsr", ltsk(int ), (int)3);
                            continue;
                        }
                        ** GOTO lbl60
                        break;
                    }
                    case 2: {
                        var1_1 /* !! */  = (int)hg$PotionType.ltsc("ltsw", ltsk(int ), (int)6);
                        cfr_temp_0 = 0;
                        if (var2) {
                            throw null;
                        }
                        break block33;
                    }
                    case 3: {
                        var1_1 /* !! */  = (int)hg$PotionType.ltsc("ltsx", ltsk(int ), (int)7);
                        if (var2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
lbl60:
                    // 1 sources

                    v5 /* !! */  = hg$PotionType.ul;
                    block25: while (true) {
                        switch ((int)v5 /* !! */ ) {
                            case 842488575: {
                                v5 /* !! */  = (long)(hg$PotionType.ltsc("ltst", ltrz(int ), (int)9) - hg$PotionType.ltsc("ltss", ltrz(int ), (int)8));
                                continue block25;
                            }
                            case 1862354374: {
                                return (hg$PotionType[])hg$PotionType.$VALUES.clone();
                            }
                        }
                        break;
                    }
                    return (hg$PotionType[])hg$PotionType.$VALUES.clone();
                    case 0: lbl-1000:
                    // 2 sources

                    {
                        var1_1 /* !! */  = (int)hg$PotionType.ltsc("ltsu", ltsk(int ), (int)4);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 1: 
                }
                break;
            }
            ** GOTO lbl78
        }
        do {
            if (true) ** continue;
lbl78:
            // 2 sources

            var1_1 /* !! */  = (int)hg$PotionType.ltsc("ltsv", ltsk(int ), (int)5);
            cfr_temp_0 = 0;
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ int ltsk(int n2) {
        return ltsl[n2] ^ ltsm[n2];
    }

    private static /* synthetic */ void ltvn() {
        hg$PotionType.ltsl[0] = 2043119357;
        hg$PotionType.ltsl[1] = -462341931;
        hg$PotionType.ltsl[2] = 1279186500;
        hg$PotionType.ltsl[3] = -845600789;
        hg$PotionType.ltsl[4] = 1477785096;
        hg$PotionType.ltsl[5] = -1089214295;
        hg$PotionType.ltsl[6] = 759277173;
        hg$PotionType.ltsl[7] = 609856531;
        hg$PotionType.ltsl[8] = -1432748108;
        hg$PotionType.ltsl[9] = -762280150;
        hg$PotionType.ltsl[10] = -917686595;
        hg$PotionType.ltsl[11] = -1961279023;
        hg$PotionType.ltsl[12] = -319067679;
        hg$PotionType.ltsl[13] = -2089503951;
        hg$PotionType.ltsl[14] = -153780671;
        hg$PotionType.ltsl[15] = 413872783;
        hg$PotionType.ltsl[16] = -1777647510;
        hg$PotionType.ltsl[17] = -1770774968;
        hg$PotionType.ltsl[18] = 2095009619;
        hg$PotionType.ltsl[19] = 1131313582;
        hg$PotionType.ltsl[20] = -2120855943;
        hg$PotionType.ltsl[21] = -1218104032;
        hg$PotionType.ltsl[22] = -2102545981;
        hg$PotionType.ltsl[23] = -709724354;
        hg$PotionType.ltsl[24] = 482751306;
        hg$PotionType.ltsl[25] = 659885415;
        hg$PotionType.ltsl[26] = 606531319;
        hg$PotionType.ltsl[27] = 1845671957;
        hg$PotionType.ltsl[28] = -1550415048;
        hg$PotionType.ltsl[29] = -316512370;
        hg$PotionType.ltsl[30] = 1450717376;
        hg$PotionType.ltsl[31] = -1479224154;
        hg$PotionType.ltsl[32] = 1605594543;
        hg$PotionType.ltsl[33] = 1138178471;
        hg$PotionType.ltsl[34] = 477181008;
        hg$PotionType.ltsl[35] = -2124955726;
        hg$PotionType.ltsl[36] = -212115166;
        hg$PotionType.ltsl[37] = 444749231;
        hg$PotionType.ltsl[38] = -53043646;
        hg$PotionType.ltsl[39] = -40298921;
        hg$PotionType.ltsl[40] = 1539654780;
        hg$PotionType.ltsl[41] = 1201299034;
        hg$PotionType.ltsl[42] = -641542376;
        hg$PotionType.ltsl[43] = 222091988;
        hg$PotionType.ltsl[44] = 1778760545;
        hg$PotionType.ltsl[45] = -2128738709;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isEnabled(hg var1_1) {
        v0 /* !! */  = hg$PotionType.ul;
        if (true) ** GOTO lbl5
        block30: while (true) {
            v0 /* !! */  = (long)(hg$PotionType.ltsc("lttt", ltrz(int ), (int)18) - hg$PotionType.ltsc("ltts", ltrz(int ), (int)17));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1862354374: {
                    break block30;
                }
                case 2080030243: {
                    continue block30;
                }
            }
            break;
        }
        var4_2 = hg$PotionType.c;
        v1 /* !! */  = hg$PotionType.ul;
        if (true) ** GOTO lbl15
        block31: while (true) {
            v1 /* !! */  = (long)(hg$PotionType.ltsc("lttv", ltrz(int ), (int)20) - hg$PotionType.ltsc("lttu", ltrz(int ), (int)19));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1993811189: {
                    continue block31;
                }
                case 1862354374: {
                    break block31;
                }
            }
            break;
        }
        var3_3 /* !! */  = hg$PotionType.b;
        v2 /* !! */  = hg$PotionType.ul;
        if (true) ** GOTO lbl25
        block32: while (true) {
            v2 /* !! */  = (long)(v3 - hg$PotionType.ltsc("lttw", ltrz(int ), (int)21));
lbl25:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1526618149: {
                    v3 = hg$PotionType.ltsc("lttx", ltrz(int ), (int)22);
                    continue block32;
                }
                case 26046138: {
                    v3 = hg$PotionType.ltsc("ltty", ltrz(int ), (int)23);
                    continue block32;
                }
                case 1862354374: {
                    break block32;
                }
            }
            break;
        }
        var2_4 = hg$PotionType.a;
        if (!var4_2) ** GOTO lbl41
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)hg$PotionType.ltsc("lttz", ltsk(int ), (int)21);
                }
lbl41:
                // 1 sources

                if (var2_4 || var2_4) continue block33;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = hg$PotionType.ul - hg$PotionType.ltsc("ltua", ltrz(int ), (int)24)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == hg$PotionType.ltsc("ltub", ltsk(int ), (int)22)) break;
                    v4 /* !! */  = (long)hg$PotionType.ltsc("ltuc", ltsk(int ), (int)23);
                }
                v5 = var1_1.potions;
                v6 /* !! */  = hg$PotionType.ul;
                if (true) ** GOTO lbl52
                block35: while (true) {
                    v6 /* !! */  = (long)(v7 - hg$PotionType.ltsc("ltud", ltrz(int ), (int)25));
lbl52:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1420761153: {
                            v7 = hg$PotionType.ltsc("ltue", ltrz(int ), (int)26);
                            continue block35;
                        }
                        case -343966670: {
                            v7 = hg$PotionType.ltsc("ltuf", ltrz(int ), (int)27);
                            continue block35;
                        }
                        case 1862354374: {
                            break block35;
                        }
                        case 1945152034: {
                            v7 = hg$PotionType.ltsc("ltug", ltrz(int ), (int)28);
                            continue block35;
                        }
                    }
                    break;
                }
                v8 /* !! */  = hg$PotionType.ul;
                if (true) ** GOTO lbl68
                block36: while (true) {
                    v8 /* !! */  = (long)(v9 - hg$PotionType.ltsc("ltuh", ltrz(int ), (int)29));
lbl68:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -77066270: {
                            v9 = hg$PotionType.ltsc("ltui", ltrz(int ), (int)30);
                            continue block36;
                        }
                        case 401620959: {
                            v9 = hg$PotionType.ltsc("ltuj", ltrz(int ), (int)31);
                            continue block36;
                        }
                        case 1862354374: {
                            break block36;
                        }
                    }
                    break;
                }
                return v5.isSelected(this.settingName);
                case 0: {
                    var3_3 /* !! */  = (int)hg$PotionType.ltsc("ltuk", ltsk(int ), (int)24);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 1: {
                    var3_3 /* !! */  = (int)hg$PotionType.ltsc("ltul", ltsk(int ), (int)25);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 2: {
                    var3_3 /* !! */  = (int)hg$PotionType.ltsc("ltum", ltsk(int ), (int)26);
                    if (!var4_2) break block33;
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var3_3 /* !! */  = (int)hg$PotionType.ltsc("ltun", ltsk(int ), (int)27);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void ltvo() {
        hg$PotionType.ltsm[0] = -2043119358;
        hg$PotionType.ltsm[1] = 536318597;
        hg$PotionType.ltsm[2] = -1279186501;
        hg$PotionType.ltsm[3] = -1363483488;
        hg$PotionType.ltsm[4] = 1477785098;
        hg$PotionType.ltsm[5] = -1089214294;
        hg$PotionType.ltsm[6] = 759277173;
        hg$PotionType.ltsm[7] = 609856528;
        hg$PotionType.ltsm[8] = 1432748107;
        hg$PotionType.ltsm[9] = -1156534917;
        hg$PotionType.ltsm[10] = 917686594;
        hg$PotionType.ltsm[11] = 789527921;
        hg$PotionType.ltsm[12] = -319067680;
        hg$PotionType.ltsm[13] = -2089503950;
        hg$PotionType.ltsm[14] = -153780670;
        hg$PotionType.ltsm[15] = 413872781;
        hg$PotionType.ltsm[16] = -1777647510;
        hg$PotionType.ltsm[17] = -1770774967;
        hg$PotionType.ltsm[18] = 2095009617;
        hg$PotionType.ltsm[19] = 1131313581;
        hg$PotionType.ltsm[20] = -2120855941;
        hg$PotionType.ltsm[21] = -1218104031;
        hg$PotionType.ltsm[22] = 2102545980;
        hg$PotionType.ltsm[23] = -1425586546;
        hg$PotionType.ltsm[24] = 482751305;
        hg$PotionType.ltsm[25] = 659885415;
        hg$PotionType.ltsm[26] = 606531317;
        hg$PotionType.ltsm[27] = 1845671956;
        hg$PotionType.ltsm[28] = 1550415047;
        hg$PotionType.ltsm[29] = 1118763674;
        hg$PotionType.ltsm[30] = -1450717377;
        hg$PotionType.ltsm[31] = -127105757;
        hg$PotionType.ltsm[32] = -1605594544;
        hg$PotionType.ltsm[33] = -1351364476;
        hg$PotionType.ltsm[34] = 477181008;
        hg$PotionType.ltsm[35] = 2124955725;
        hg$PotionType.ltsm[36] = -212115165;
        hg$PotionType.ltsm[37] = -444749232;
        hg$PotionType.ltsm[38] = -53043648;
        hg$PotionType.ltsm[39] = -40298921;
        hg$PotionType.ltsm[40] = 1539654781;
        hg$PotionType.ltsm[41] = 1201299034;
        hg$PotionType.ltsm[42] = -641542375;
        hg$PotionType.ltsm[43] = 222091988;
        hg$PotionType.ltsm[44] = 1778760544;
        hg$PotionType.ltsm[45] = -2128738711;
    }
}

