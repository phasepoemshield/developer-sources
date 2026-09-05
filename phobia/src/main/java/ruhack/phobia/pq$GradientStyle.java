/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public final class pq$GradientStyle
extends Enum<pq$GradientStyle> {
    public static final /* enum */ pq$GradientStyle TWO_COLOR_FADE;
    public static final boolean a;
    public static final boolean c;
    private static final /* synthetic */ pq$GradientStyle[] $VALUES;
    private static int[] ljse;
    private static long[] ljrx;
    public static final /* enum */ pq$GradientStyle FULL_GRADIENT;
    private static long[] ljrw;
    private static final long tz = 7008164869347272837L;
    public static final int b;
    private static int[] ljsd;
    public static final /* enum */ pq$GradientStyle HALF_SPLIT;
    public static final /* enum */ pq$GradientStyle ASTOLFO;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static pq$GradientStyle[] values() {
        boolean bl2;
        Object object = tz;
        block15: while (true) {
            switch ((int)object) {
                case 658099418: {
                    object = pq$GradientStyle.ljry("ljsa", ljrv(int ), (int)1) - pq$GradientStyle.ljry("ljrz", ljrv(int ), (int)0);
                    continue block15;
                }
                case 1557194885: {
                    break block15;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = tz - pq$GradientStyle.ljry("ljsb", ljrv(int ), (int)2)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == pq$GradientStyle.ljry("ljsf", ljsc(int ), (int)0)) break;
            object2 = pq$GradientStyle.ljry("ljsg", ljsc(int ), (int)1);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = tz - pq$GradientStyle.ljry("ljsh", ljrv(int ), (int)3)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == pq$GradientStyle.ljry("ljsi", ljsc(int ), (int)2)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = pq$GradientStyle.ljry("ljsj", ljsc(int ), (int)3);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object4 = tz;
        boolean bl4 = true;
        block18: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object4 = callSite - pq$GradientStyle.ljry("ljsk", ljrv(int ), (int)4);
            }
            switch ((int)object4) {
                case -1681389037: {
                    callSite = pq$GradientStyle.ljry("ljsl", ljrv(int ), (int)5);
                    continue block18;
                }
                case -733054791: {
                    callSite = pq$GradientStyle.ljry("ljsm", ljrv(int ), (int)6);
                    continue block18;
                }
                case -491670727: {
                    callSite = pq$GradientStyle.ljry("ljsn", ljrv(int ), (int)7);
                    continue block18;
                }
                case 1557194885: {
                    break block18;
                }
            }
            break;
        }
        Object object5 = tz;
        boolean bl5 = true;
        block19: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object5 = callSite - pq$GradientStyle.ljry("ljso", ljrv(int ), (int)8);
            }
            switch ((int)object5) {
                case -924037675: {
                    callSite = pq$GradientStyle.ljry("ljsp", ljrv(int ), (int)9);
                    continue block19;
                }
                case 1557194885: {
                    return (pq$GradientStyle[])$VALUES.clone();
                }
                case 1781844850: {
                    callSite = pq$GradientStyle.ljry("ljsq", ljrv(int ), (int)10);
                    continue block19;
                }
            }
            break;
        }
        return (pq$GradientStyle[])$VALUES.clone();
    }

    private static /* synthetic */ void ljuz() {
        pq$GradientStyle.ljrx[0] = 3539392097730729030L;
        pq$GradientStyle.ljrx[1] = 7299235782015084145L;
        pq$GradientStyle.ljrx[2] = 2044240539208317991L;
        pq$GradientStyle.ljrx[3] = -6157167640863547805L;
        pq$GradientStyle.ljrx[4] = -988241365996508290L;
        pq$GradientStyle.ljrx[5] = 1191983763936440793L;
        pq$GradientStyle.ljrx[6] = -1958088685980311170L;
        pq$GradientStyle.ljrx[7] = -3528487228487568206L;
        pq$GradientStyle.ljrx[8] = 155173968089496490L;
        pq$GradientStyle.ljrx[9] = -8470311048450152905L;
        pq$GradientStyle.ljrx[10] = -6858054478111581548L;
        pq$GradientStyle.ljrx[11] = -7705837375468695332L;
        pq$GradientStyle.ljrx[12] = 3554423339771952424L;
        pq$GradientStyle.ljrx[13] = 3968021573452801656L;
        pq$GradientStyle.ljrx[14] = -2300331470479308800L;
        pq$GradientStyle.ljrx[15] = -8547371452534938048L;
        pq$GradientStyle.ljrx[16] = -6866611926971695171L;
        pq$GradientStyle.ljrx[17] = -3090747836560337973L;
        pq$GradientStyle.ljrx[18] = -6963228293601058732L;
        pq$GradientStyle.ljrx[19] = -8559884558379539008L;
        pq$GradientStyle.ljrx[20] = -5869758579902187427L;
        pq$GradientStyle.ljrx[21] = 3466908621077199108L;
        pq$GradientStyle.ljrx[22] = 4195992795971835225L;
        pq$GradientStyle.ljrx[23] = 8299672826057592252L;
        pq$GradientStyle.ljrx[24] = -7664497812188108072L;
        pq$GradientStyle.ljrx[25] = -1448424019380362585L;
        pq$GradientStyle.ljrx[26] = 2228103513560548308L;
        pq$GradientStyle.ljrx[27] = -1788788776318811538L;
        pq$GradientStyle.ljrx[28] = 8653453987588445485L;
        pq$GradientStyle.ljrx[29] = 3925837378236316429L;
        pq$GradientStyle.ljrx[30] = -3994375423854589116L;
        pq$GradientStyle.ljrx[31] = 6764914370726680195L;
        pq$GradientStyle.ljrx[32] = -9000014527139623621L;
        pq$GradientStyle.ljrx[33] = 484575953310438804L;
        pq$GradientStyle.ljrx[34] = -2928771216997485296L;
        pq$GradientStyle.ljrx[35] = 1792899306794663418L;
        pq$GradientStyle.ljrx[36] = 7494194116859546526L;
        pq$GradientStyle.ljrx[37] = 5573645158880879237L;
    }

    private static /* synthetic */ void ljuy() {
        pq$GradientStyle.ljrw[0] = 6359332812146155669L;
        pq$GradientStyle.ljrw[1] = 1734199123927214493L;
        pq$GradientStyle.ljrw[2] = 2860969760545259777L;
        pq$GradientStyle.ljrw[3] = 1442996142823215605L;
        pq$GradientStyle.ljrw[4] = 7225699378025723510L;
        pq$GradientStyle.ljrw[5] = 8747047421762607953L;
        pq$GradientStyle.ljrw[6] = 6075779688870714161L;
        pq$GradientStyle.ljrw[7] = 2286549605141849823L;
        pq$GradientStyle.ljrw[8] = -9221558162449598456L;
        pq$GradientStyle.ljrw[9] = -2495631354387533369L;
        pq$GradientStyle.ljrw[10] = 7176332412677406059L;
        pq$GradientStyle.ljrw[11] = 3488677260140354081L;
        pq$GradientStyle.ljrw[12] = -3862593943002752321L;
        pq$GradientStyle.ljrw[13] = 7085577673513548286L;
        pq$GradientStyle.ljrw[14] = 64261969260008104L;
        pq$GradientStyle.ljrw[15] = 7461663238600141211L;
        pq$GradientStyle.ljrw[16] = 5230188693762802742L;
        pq$GradientStyle.ljrw[17] = -3031700339008101782L;
        pq$GradientStyle.ljrw[18] = -240506150024293834L;
        pq$GradientStyle.ljrw[19] = 415987479839587769L;
        pq$GradientStyle.ljrw[20] = -5988007903810565600L;
        pq$GradientStyle.ljrw[21] = -6423546751630983991L;
        pq$GradientStyle.ljrw[22] = 1358411251446201555L;
        pq$GradientStyle.ljrw[23] = -2465451217080255130L;
        pq$GradientStyle.ljrw[24] = 7369540787218116465L;
        pq$GradientStyle.ljrw[25] = 5581792931917516434L;
        pq$GradientStyle.ljrw[26] = -3480528665603167148L;
        pq$GradientStyle.ljrw[27] = -7398409809838535272L;
        pq$GradientStyle.ljrw[28] = -3500389312115103209L;
        pq$GradientStyle.ljrw[29] = -4870244629260501803L;
        pq$GradientStyle.ljrw[30] = 5243222135391816701L;
        pq$GradientStyle.ljrw[31] = -1200432166563168917L;
        pq$GradientStyle.ljrw[32] = -1193993922164132210L;
        pq$GradientStyle.ljrw[33] = 6566460772300205886L;
        pq$GradientStyle.ljrw[34] = -6173005194893697270L;
        pq$GradientStyle.ljrw[35] = -8284872138712947729L;
        pq$GradientStyle.ljrw[36] = 9082554328389329286L;
        pq$GradientStyle.ljrw[37] = 5874336203250536448L;
    }

    private static /* synthetic */ void ljux() {
        pq$GradientStyle.ljse[0] = -1643923651;
        pq$GradientStyle.ljse[1] = -1060314706;
        pq$GradientStyle.ljse[2] = 1048055036;
        pq$GradientStyle.ljse[3] = -2036746962;
        pq$GradientStyle.ljse[4] = -667355515;
        pq$GradientStyle.ljse[5] = 570379277;
        pq$GradientStyle.ljse[6] = -2114407432;
        pq$GradientStyle.ljse[7] = -2028492710;
        pq$GradientStyle.ljse[8] = 546370829;
        pq$GradientStyle.ljse[9] = 192596689;
        pq$GradientStyle.ljse[10] = 761296923;
        pq$GradientStyle.ljse[11] = -491204069;
        pq$GradientStyle.ljse[12] = -591823804;
        pq$GradientStyle.ljse[13] = 867207445;
        pq$GradientStyle.ljse[14] = 1257748057;
        pq$GradientStyle.ljse[15] = -1099312953;
        pq$GradientStyle.ljse[16] = 801580385;
        pq$GradientStyle.ljse[17] = 1502722549;
        pq$GradientStyle.ljse[18] = 1559249216;
        pq$GradientStyle.ljse[19] = -981261916;
        pq$GradientStyle.ljse[20] = 1774184035;
        pq$GradientStyle.ljse[21] = -1752163062;
        pq$GradientStyle.ljse[22] = 1868648161;
        pq$GradientStyle.ljse[23] = 1762367435;
        pq$GradientStyle.ljse[24] = -12987380;
        pq$GradientStyle.ljse[25] = 1755139416;
        pq$GradientStyle.ljse[26] = -2026437377;
        pq$GradientStyle.ljse[27] = -284865158;
        pq$GradientStyle.ljse[28] = -133035891;
        pq$GradientStyle.ljse[29] = -576409034;
        pq$GradientStyle.ljse[30] = 1590724037;
        pq$GradientStyle.ljse[31] = -1128325948;
        pq$GradientStyle.ljse[32] = 1275719170;
        pq$GradientStyle.ljse[33] = -1165090072;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ pq$GradientStyle[] $values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = pq$GradientStyle.tz - pq$GradientStyle.ljry("ljtp", ljrv(int ), (int)22)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == pq$GradientStyle.ljry("ljtq", ljsc(int ), (int)17)) break;
            v0 /* !! */  = (long)pq$GradientStyle.ljry("ljtr", ljsc(int ), (int)18);
        }
        var2 = pq$GradientStyle.c;
        v1 /* !! */  = pq$GradientStyle.tz;
        if (true) ** GOTO lbl12
        block28: while (true) {
            v1 /* !! */  = (long)(v2 - pq$GradientStyle.ljry("ljts", ljrv(int ), (int)23));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1575632944: {
                    v2 = pq$GradientStyle.ljry("ljtt", ljrv(int ), (int)24);
                    continue block28;
                }
                case -238723038: {
                    v2 = pq$GradientStyle.ljry("ljtu", ljrv(int ), (int)25);
                    continue block28;
                }
                case 502134331: {
                    v2 = pq$GradientStyle.ljry("ljtv", ljrv(int ), (int)26);
                    continue block28;
                }
                case 1557194885: {
                    break block28;
                }
            }
            break;
        }
        var1_1 /* !! */  = pq$GradientStyle.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = pq$GradientStyle.tz - pq$GradientStyle.ljry("ljtw", ljrv(int ), (int)27)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == pq$GradientStyle.ljry("ljtx", ljsc(int ), (int)19)) break;
            v3 /* !! */  = (long)pq$GradientStyle.ljry("ljty", ljsc(int ), (int)20);
        }
        var0_2 = pq$GradientStyle.a;
        if (var2) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl34
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                v4 = new pq$GradientStyle[4];
                v5 = pq$GradientStyle.ljry("ljtz", ljsc(int ), (int)21);
                v6 /* !! */  = pq$GradientStyle.tz;
                if (true) ** GOTO lbl47
                block31: while (true) {
                    v6 /* !! */  = (long)(pq$GradientStyle.ljry("ljub", ljrv(int ), (int)29) - pq$GradientStyle.ljry("ljua", ljrv(int ), (int)28));
lbl47:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 1557194885: {
                            break block31;
                        }
                        case 2127883222: {
                            continue block31;
                        }
                    }
                    break;
                }
                v4[v5] = pq$GradientStyle.HALF_SPLIT;
                v7 = pq$GradientStyle.ljry("ljuc", ljsc(int ), (int)22);
                while (true) {
                    if ((v8 = (cfr_temp_2 = pq$GradientStyle.tz - pq$GradientStyle.ljry("ljud", ljrv(int ), (int)30)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 == pq$GradientStyle.ljry("ljue", ljsc(int ), (int)23)) break;
                    v8 = 863336591;
                }
                v4[v7] = pq$GradientStyle.FULL_GRADIENT;
                v9 = pq$GradientStyle.ljry("ljuf", ljsc(int ), (int)24);
                v10 /* !! */  = pq$GradientStyle.tz;
                if (true) ** GOTO lbl66
                block33: while (true) {
                    v10 /* !! */  = (long)(v11 - pq$GradientStyle.ljry("ljug", ljrv(int ), (int)31));
lbl66:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1990957278: {
                            v11 = pq$GradientStyle.ljry("ljuh", ljrv(int ), (int)32);
                            continue block33;
                        }
                        case -1811702623: {
                            v11 = pq$GradientStyle.ljry("ljui", ljrv(int ), (int)33);
                            continue block33;
                        }
                        case -1251529125: {
                            v11 = pq$GradientStyle.ljry("ljuj", ljrv(int ), (int)34);
                            continue block33;
                        }
                        case 1557194885: {
                            break block33;
                        }
                    }
                    break;
                }
                v4[v9] = pq$GradientStyle.ASTOLFO;
                v12 = pq$GradientStyle.ljry("ljuk", ljsc(int ), (int)25);
                v13 /* !! */  = pq$GradientStyle.tz;
                if (true) ** GOTO lbl84
                block34: while (true) {
                    v13 /* !! */  = (long)(v14 - pq$GradientStyle.ljry("ljul", ljrv(int ), (int)35));
lbl84:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case 1033670642: {
                            v14 = pq$GradientStyle.ljry("ljum", ljrv(int ), (int)36);
                            continue block34;
                        }
                        case 1204210025: {
                            v14 = pq$GradientStyle.ljry("ljun", ljrv(int ), (int)37);
                            continue block34;
                        }
                        case 1557194885: {
                            break block34;
                        }
                    }
                    break;
                }
                v4[v12] = pq$GradientStyle.TWO_COLOR_FADE;
                return v4;
            }
lbl95:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)pq$GradientStyle.ljry("ljuo", ljsc(int ), (int)26);
                    if (!var2) break block6;
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)pq$GradientStyle.ljry("ljup", ljsc(int ), (int)27);
                if (!var2) ** GOTO lbl95
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)pq$GradientStyle.ljry("ljuq", ljsc(int ), (int)28);
                if (!var2) ** GOTO lbl95
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)pq$GradientStyle.ljry("ljur", ljsc(int ), (int)29);
        ** while (!var2)
lbl111:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ljuw() {
        pq$GradientStyle.ljsd[0] = -1643923652;
        pq$GradientStyle.ljsd[1] = -347552286;
        pq$GradientStyle.ljsd[2] = 1048055037;
        pq$GradientStyle.ljsd[3] = -1515758487;
        pq$GradientStyle.ljsd[4] = -667355513;
        pq$GradientStyle.ljsd[5] = 570379279;
        pq$GradientStyle.ljsd[6] = -2114407430;
        pq$GradientStyle.ljsd[7] = -2028492711;
        pq$GradientStyle.ljsd[8] = 546370828;
        pq$GradientStyle.ljsd[9] = 506663096;
        pq$GradientStyle.ljsd[10] = 761296922;
        pq$GradientStyle.ljsd[11] = -491204070;
        pq$GradientStyle.ljsd[12] = -591823803;
        pq$GradientStyle.ljsd[13] = 867207447;
        pq$GradientStyle.ljsd[14] = 1257748059;
        pq$GradientStyle.ljsd[15] = -1099312953;
        pq$GradientStyle.ljsd[16] = 801580384;
        pq$GradientStyle.ljsd[17] = 1502722548;
        pq$GradientStyle.ljsd[18] = -1320013182;
        pq$GradientStyle.ljsd[19] = 981261915;
        pq$GradientStyle.ljsd[20] = -32974077;
        pq$GradientStyle.ljsd[21] = -1752163062;
        pq$GradientStyle.ljsd[22] = 1868648160;
        pq$GradientStyle.ljsd[23] = 1762367434;
        pq$GradientStyle.ljsd[24] = -12987378;
        pq$GradientStyle.ljsd[25] = 1755139419;
        pq$GradientStyle.ljsd[26] = -2026437380;
        pq$GradientStyle.ljsd[27] = -284865158;
        pq$GradientStyle.ljsd[28] = -133035892;
        pq$GradientStyle.ljsd[29] = -576409034;
        pq$GradientStyle.ljsd[30] = 1590724037;
        pq$GradientStyle.ljsd[31] = -1128325947;
        pq$GradientStyle.ljsd[32] = 1275719168;
        pq$GradientStyle.ljsd[33] = -1165090069;
    }

    static {
        ljsd = new int[34];
        ljse = new int[34];
        pq$GradientStyle.ljuw();
        pq$GradientStyle.ljux();
        ljrw = new long[38];
        ljrx = new long[38];
        pq$GradientStyle.ljuy();
        pq$GradientStyle.ljuz();
        HALF_SPLIT = new pq$GradientStyle();
        FULL_GRADIENT = new pq$GradientStyle();
        ASTOLFO = new pq$GradientStyle();
        TWO_COLOR_FADE = new pq$GradientStyle();
        $VALUES = pq$GradientStyle.$values();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private pq$GradientStyle() {
        var4_3 /* !! */  = pq$GradientStyle.b;
        var3_4 = pq$GradientStyle.a;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super(var1_1, var2_2);
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)pq$GradientStyle.ljry("ljtm", ljsc(int ), (int)14);
            }
            case 1: {
                var4_3 /* !! */  = (int)pq$GradientStyle.ljry("ljtn", ljsc(int ), (int)15);
            }
            case 2: 
        }
        while (true) {
            var4_3 /* !! */  = (int)pq$GradientStyle.ljry("ljto", ljsc(int ), (int)16);
        }
    }

    private static /* synthetic */ long ljrv(int n2) {
        return ljrw[n2] ^ ljrx[n2];
    }

    private static /* synthetic */ int ljsc(int n2) {
        return ljsd[n2] ^ ljse[n2];
    }

    public static /* synthetic */ CallSite ljry(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static pq$GradientStyle valueOf(String var0) {
        v0 /* !! */  = pq$GradientStyle.tz;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - pq$GradientStyle.ljry("ljsv", ljrv(int ), (int)11));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1823227730: {
                    v1 = pq$GradientStyle.ljry("ljsw", ljrv(int ), (int)12);
                    continue block22;
                }
                case -584934950: {
                    v1 = pq$GradientStyle.ljry("ljsx", ljrv(int ), (int)13);
                    continue block22;
                }
                case 1107800984: {
                    v1 = pq$GradientStyle.ljry("ljsy", ljrv(int ), (int)14);
                    continue block22;
                }
                case 1557194885: {
                    break block22;
                }
            }
            break;
        }
        var3_1 = pq$GradientStyle.c;
        v2 /* !! */  = pq$GradientStyle.tz;
        if (true) ** GOTO lbl22
        block23: while (true) {
            v2 /* !! */  = (long)(pq$GradientStyle.ljry("ljta", ljrv(int ), (int)16) - pq$GradientStyle.ljry("ljsz", ljrv(int ), (int)15));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 212033903: {
                    continue block23;
                }
                case 1557194885: {
                    break block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = pq$GradientStyle.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = pq$GradientStyle.tz;
                if (true) ** GOTO lbl35
                block24: while (true) {
                    v3 /* !! */  = (long)(v4 - pq$GradientStyle.ljry("ljtb", ljrv(int ), (int)17));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1654561401: {
                            v4 = pq$GradientStyle.ljry("ljtc", ljrv(int ), (int)18);
                            continue block24;
                        }
                        case 993129590: {
                            v4 = pq$GradientStyle.ljry("ljtd", ljrv(int ), (int)19);
                            continue block24;
                        }
                        case 1494539383: {
                            v4 = pq$GradientStyle.ljry("ljte", ljrv(int ), (int)20);
                            continue block24;
                        }
                        case 1557194885: {
                            break block24;
                        }
                    }
                    break;
                }
                var1_3 = pq$GradientStyle.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = pq$GradientStyle.tz - pq$GradientStyle.ljry("ljtf", ljrv(int ), (int)21)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == pq$GradientStyle.ljry("ljtg", ljsc(int ), (int)8)) break;
                    v5 /* !! */  = (long)pq$GradientStyle.ljry("ljth", ljsc(int ), (int)9);
                }
                return Enum.valueOf(pq$GradientStyle.class, var0);
            }
lbl60:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)pq$GradientStyle.ljry("ljti", ljsc(int ), (int)10);
                if (var3_1) {
                    throw null;
                }
            }
lbl64:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)pq$GradientStyle.ljry("ljtj", ljsc(int ), (int)11);
                if (!var3_1) ** GOTO lbl60
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)pq$GradientStyle.ljry("ljtk", ljsc(int ), (int)12);
                    if (!var3_1) ** GOTO lbl64
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)pq$GradientStyle.ljry("ljtl", ljsc(int ), (int)13);
        ** while (!var3_1)
lbl76:
        // 1 sources

        throw null;
    }
}

