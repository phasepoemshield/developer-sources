/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 *  net.minecraft.class_2828
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Supplier;
import net.minecraft.class_243;
import net.minecraft.class_2828;
import ruhack.phobia.aw;
import ruhack.phobia.cq;
import ruhack.phobia.cr;
import ruhack.phobia.df;
import ruhack.phobia.di;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.kg;
import ruhack.phobia.nj;

public final class fr
extends ds {
    public static final boolean a;
    private final kb catchMoment;
    private static int[] haet;
    private boolean frozen;
    private static long[] hafc;
    private final kb changeAuraDistance;
    private static int[] haes;
    public static final long nx = -5903074028126118840L;
    public static final boolean c;
    private double peakY;
    public static final int b;
    private static long[] hafd;
    private final kg auraDistance;

    private static /* synthetic */ void hasu() {
        fr.hafd[100] = 6100265640779779868L;
        fr.hafd[101] = 2950561357711268368L;
        fr.hafd[102] = 1903093347748631691L;
        fr.hafd[103] = -7983762527970522889L;
        fr.hafd[104] = 934697869413277176L;
        fr.hafd[105] = 3610920343505105815L;
        fr.hafd[106] = 8995728281293695411L;
        fr.hafd[107] = 123824531397643224L;
        fr.hafd[108] = -5319523828962737646L;
        fr.hafd[109] = -6018683487020750877L;
        fr.hafd[110] = 6809456053087313650L;
        fr.hafd[111] = 8583274876976488871L;
        fr.hafd[112] = 42700698068887578L;
        fr.hafd[113] = 312802155016720944L;
        fr.hafd[114] = -2408119325404805305L;
        fr.hafd[115] = -8988327668555103044L;
        fr.hafd[116] = -4673608029074811119L;
        fr.hafd[117] = -2129264864173317887L;
        fr.hafd[118] = 6597930042122069326L;
        fr.hafd[119] = 3326288170723878101L;
        fr.hafd[120] = -2366029566141984721L;
        fr.hafd[121] = -6042839262548030673L;
        fr.hafd[122] = -9185332280731308457L;
        fr.hafd[123] = -5983116637988676631L;
        fr.hafd[124] = -4641735868820905981L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @aw(value=4)
    public void onMove(cq var1_1) {
        v0 /* !! */  = fr.nx;
        if (true) ** GOTO lbl5
        block37: while (true) {
            v0 /* !! */  = (long)(v1 - fr.haeu("haob", hafn(int ), (int)83));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -213667599: {
                    v1 = fr.haeu("haoc", hafn(int ), (int)84);
                    continue block37;
                }
                case 1124669502: {
                    v1 = fr.haeu("haod", hafn(int ), (int)85);
                    continue block37;
                }
                case 2125814856: {
                    break block37;
                }
            }
            break;
        }
        var4_2 = fr.c;
        while (true) {
            block78: {
                if ((v2 /* !! */  = (cfr_temp_1 = fr.nx - fr.haeu("haoe", hafn(int ), (int)86)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  != fr.haeu("haof", haer(int ), (int)152)) break block78;
                var3_3 /* !! */  = fr.b;
                if (var3_3 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v2 /* !! */  = (long)fr.haeu("haog", haer(int ), (int)153);
        }
        cfr_temp_0 = -2147483648;
        block39: while (true) {
            block79: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v3 /* !! */  = fr.nx;
                        block40: while (true) {
                            switch ((int)v3 /* !! */ ) {
                                case -658417855: {
                                    v4 = fr.haeu("haoi", hafn(int ), (int)88);
                                    ** GOTO lbl40
                                }
                                case 1067189999: {
                                    v4 = fr.haeu("haoj", hafn(int ), (int)89);
                                    ** GOTO lbl40
                                }
                                case 1837927171: {
                                    v4 = fr.haeu("haok", hafn(int ), (int)90);
lbl40:
                                    // 3 sources

                                    v3 /* !! */  = (long)(v4 - fr.haeu("haoh", hafn(int ), (int)87));
                                    continue block40;
                                }
                                case 2125814856: {
                                    break block40;
                                }
                            }
                            break;
                        }
                        var2_4 = fr.a;
                        if (var4_2) {
                            throw null;
                        }
                        if (var2_4 || var2_4) return;
                        v5 /* !! */  = fr.nx;
                        block41: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case -1027114324: {
                                    v6 = fr.haeu("haom", hafn(int ), (int)92);
                                    ** GOTO lbl56
                                }
                                case -744410334: {
                                    v6 = fr.haeu("haon", hafn(int ), (int)93);
lbl56:
                                    // 2 sources

                                    v5 /* !! */  = (long)(v6 - fr.haeu("haol", hafn(int ), (int)91));
                                    continue block41;
                                }
                                case 2125814856: {
                                    break block41;
                                }
                            }
                            break;
                        }
                        if (!this.frozen) ** GOTO lbl148
                        if (var2_4) return;
                        while (true) {
                            if ((v7 /* !! */  = (cfr_temp_2 = fr.nx - fr.haeu("haoo", hafn(int ), (int)94)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v7 /* !! */  != fr.haeu("haop", haer(int ), (int)154)) {
                                v7 /* !! */  = (long)fr.haeu("haoq", haer(int ), (int)155);
                                continue;
                            }
                            ** GOTO lbl139
                            break;
                        }
                    }
                    case 0: {
                        ** GOTO lbl130
                    }
                    case 3: {
                        var3_3 /* !! */  = (int)fr.haeu("hapo", haer(int ), (int)171);
                        cfr_temp_0 = 10;
                        if (var4_2) {
                            throw null;
                        }
                        break block79;
                    }
                    case 5: {
                        var3_3 /* !! */  = (int)fr.haeu("hapq", haer(int ), (int)173);
                        cfr_temp_0 = 10;
                        if (var4_2) {
                            throw null;
                        }
                        break block79;
                    }
                    case 6: {
                        do {
                            var3_3 /* !! */  = (int)fr.haeu("hapr", haer(int ), (int)174);
                        } while (!var4_2);
                        throw null;
                    }
                    case 7: {
                        var3_3 /* !! */  = (int)fr.haeu("haps", haer(int ), (int)175);
                        cfr_temp_0 = 1;
                        if (var4_2) {
                            throw null;
                        }
                        break block79;
                    }
                    case 9: {
                        var3_3 /* !! */  = (int)fr.haeu("hapu", haer(int ), (int)177);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 8: {
                        var3_3 /* !! */  = (int)fr.haeu("hapt", haer(int ), (int)176);
                        cfr_temp_0 = 2;
                        if (var4_2) {
                            throw null;
                        }
                        break block79;
                    }
                    case 10: {
                        do {
                            var3_3 /* !! */  = (int)fr.haeu("hapv", haer(int ), (int)178);
                        } while (!var4_2);
                        throw null;
                    }
                    case 11: {
                        var3_3 /* !! */  = (int)fr.haeu("hapw", haer(int ), (int)179);
                        cfr_temp_0 = 4;
                        if (var4_2) {
                            throw null;
                        }
                        break block79;
                    }
                    case 12: {
                        var3_3 /* !! */  = (int)fr.haeu("hapx", haer(int ), (int)180);
                        cfr_temp_0 = 4;
                        if (var4_2) {
                            throw null;
                        }
                        break block79;
                    }
                    case 13: {
                        var3_3 /* !! */  = (int)fr.haeu("hapy", haer(int ), (int)181);
                        cfr_temp_0 = 1;
                        if (var4_2) {
                            throw null;
                        }
                        break block79;
                    }
                    case 14: {
                        var3_3 /* !! */  = (int)fr.haeu("hapz", haer(int ), (int)182);
                        if (var4_2) {
                            throw null;
                        }
lbl130:
                        // 3 sources

                        var3_3 /* !! */  = (int)fr.haeu("hapl", haer(int ), (int)168);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 1: {
                        var3_3 /* !! */  = (int)fr.haeu("hapm", haer(int ), (int)169);
                        cfr_temp_0 = 4;
                        if (var4_2) {
                            throw null;
                        }
                        break block79;
                    }
lbl139:
                    // 1 sources

                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_3 = fr.nx - fr.haeu("haor", hafn(int ), (int)95)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v8 /* !! */  != fr.haeu("haos", haer(int ), (int)156)) ** GOTO lbl145
                        if (fr.mc.field_1724 == null) {
                            break;
                        }
                        ** GOTO lbl150
lbl145:
                        // 1 sources

                        v8 /* !! */  = (long)fr.haeu("haot", haer(int ), (int)157);
                    }
                    if (var2_4) return;
lbl148:
                    // 2 sources

                    if (var2_4 || var2_4) return;
                    return;
lbl150:
                    // 1 sources

                    if (var2_4 || var2_4) return;
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_4 = fr.nx - fr.haeu("haou", hafn(int ), (int)96)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v9 /* !! */  == fr.haeu("haov", haer(int ), (int)158)) break;
                        v9 /* !! */  = (long)fr.haeu("haow", haer(int ), (int)159);
                    }
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_5 = fr.nx - fr.haeu("haox", hafn(int ), (int)97)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == fr.haeu("haoy", haer(int ), (int)160)) break;
                        v10 /* !! */  = (long)fr.haeu("haoz", haer(int ), (int)161);
                    }
                    v11 = fr.mc.field_1724;
                    v12 /* !! */  = fr.nx;
                    block48: while (true) {
                        switch ((int)v12 /* !! */ ) {
                            case 863044737: {
                                v12 /* !! */  = (long)(fr.haeu("hapb", hafn(int ), (int)99) - fr.haeu("hapa", hafn(int ), (int)98));
                                continue block48;
                            }
                            case 2125814856: {
                                break block48;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v13 /* !! */  = (cfr_temp_6 = fr.nx - fr.haeu("hapc", hafn(int ), (int)100)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v13 /* !! */  == fr.haeu("hapd", haer(int ), (int)162)) {
                            v11.method_18799(class_243.field_1353);
                            if (var2_4) return;
                            break;
                        }
                        v13 /* !! */  = (long)fr.haeu("hape", haer(int ), (int)163);
                    }
                    if (var2_4) return;
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_7 = fr.nx - fr.haeu("hapf", hafn(int ), (int)101)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  == fr.haeu("hapg", haer(int ), (int)164)) break;
                        v14 /* !! */  = (long)fr.haeu("haph", haer(int ), (int)165);
                    }
                    while (true) {
                        if ((v15 /* !! */  = (cfr_temp_8 = fr.nx - fr.haeu("hapi", hafn(int ), (int)102)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v15 /* !! */  == fr.haeu("hapj", haer(int ), (int)166)) {
                            var1_1.setMovement(class_243.field_1353);
                            if (var2_4) return;
                            break;
                        }
                        v15 /* !! */  = (long)fr.haeu("hapk", haer(int ), (int)167);
                    }
                    if (!var2_4) return;
                    return;
                    case 2: {
                        var3_3 /* !! */  = (int)fr.haeu("hapn", haer(int ), (int)170);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 4: 
                }
                ** GOTO lbl203
            }
            do {
                if (true) continue block39;
lbl203:
                // 2 sources

                var3_3 /* !! */  = (int)fr.haeu("happ", haer(int ), (int)172);
                cfr_temp_0 = 2;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getKillAuraDistance() {
        v0 /* !! */  = fr.nx;
        if (true) ** GOTO lbl5
        block30: while (true) {
            v0 /* !! */  = (long)(v1 - fr.haeu("hajr", hafn(int ), (int)54));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1149137163: {
                    v1 = fr.haeu("hajs", hafn(int ), (int)55);
                    continue block30;
                }
                case 633286736: {
                    v1 = fr.haeu("hajt", hafn(int ), (int)56);
                    continue block30;
                }
                case 1174154743: {
                    v1 = fr.haeu("haju", hafn(int ), (int)57);
                    continue block30;
                }
                case 2125814856: {
                    break block30;
                }
            }
            break;
        }
        var3_1 = fr.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fr.nx - fr.haeu("hajv", hafn(int ), (int)58)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == fr.haeu("hajw", haer(int ), (int)67)) break;
            v2 /* !! */  = (long)fr.haeu("hajx", haer(int ), (int)68);
        }
        var2_2 /* !! */  = fr.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = fr.nx - fr.haeu("hajy", hafn(int ), (int)59)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == fr.haeu("hajz", haer(int ), (int)69)) break;
            v3 /* !! */  = (long)fr.haeu("haka", haer(int ), (int)70);
        }
        var1_3 = fr.a;
        if (var3_1) {
            throw null;
lbl34:
            // 4 sources

            return (float)fr.haeu("hakb", haew(int ), (int)71);
        }
        if (var1_3 || var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = fr.nx;
                if (true) ** GOTO lbl44
                block34: while (true) {
                    v4 /* !! */  = (long)(v5 - fr.haeu("hakc", hafn(int ), (int)60));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1897827942: {
                            v5 = fr.haeu("hakd", hafn(int ), (int)61);
                            continue block34;
                        }
                        case 47594141: {
                            v5 = fr.haeu("hake", hafn(int ), (int)62);
                            continue block34;
                        }
                        case 822626285: {
                            v5 = fr.haeu("hakf", hafn(int ), (int)63);
                            continue block34;
                        }
                        case 2125814856: {
                            break block34;
                        }
                    }
                    break;
                }
                if (!this.isState()) ** GOTO lbl95
                if (var1_3) ** GOTO lbl34
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = fr.nx - fr.haeu("hakg", hafn(int ), (int)64)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == fr.haeu("hakh", haer(int ), (int)72)) break;
                    v6 /* !! */  = (long)fr.haeu("haki", haer(int ), (int)73);
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = fr.nx - fr.haeu("hakj", hafn(int ), (int)65)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == fr.haeu("hakk", haer(int ), (int)74)) break;
                    v7 /* !! */  = (long)fr.haeu("hakl", haer(int ), (int)75);
                }
                if (!this.changeAuraDistance.isValue()) ** GOTO lbl95
                if (var1_3 || var1_3) ** GOTO lbl34
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = fr.nx - fr.haeu("hakm", hafn(int ), (int)66)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == fr.haeu("hakn", haer(int ), (int)76)) break;
                    v8 /* !! */  = (long)fr.haeu("hako", haer(int ), (int)77);
                }
                v9 /* !! */  = fr.nx;
                if (true) ** GOTO lbl82
                block38: while (true) {
                    v9 /* !! */  = (long)(v10 - fr.haeu("hakp", hafn(int ), (int)67));
lbl82:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1596430530: {
                            v10 = fr.haeu("hakq", hafn(int ), (int)68);
                            continue block38;
                        }
                        case -606582266: {
                            v10 = fr.haeu("hakr", hafn(int ), (int)69);
                            continue block38;
                        }
                        case 236629409: {
                            v10 = fr.haeu("haks", hafn(int ), (int)70);
                            continue block38;
                        }
                        case 2125814856: {
                            break block38;
                        }
                    }
                    break;
                }
                return this.auraDistance.getValue();
lbl95:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return (float)fr.haeu("hakt", haew(int ), (int)78);
            }
            case 0: {
                var2_2 /* !! */  = (int)fr.haeu("haku", haer(int ), (int)79);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl132
            }
            case 1: {
                var2_2 /* !! */  = (int)fr.haeu("hakv", haer(int ), (int)80);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl132
            }
            case 2: {
                var2_2 /* !! */  = (int)fr.haeu("hakw", haer(int ), (int)81);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl117
            }
            case 3: {
                var2_2 /* !! */  = (int)fr.haeu("hakx", haer(int ), (int)82);
                if (var3_1) {
                    throw null;
                }
            }
lbl117:
            // 4 sources

            case 4: {
                var2_2 /* !! */  = (int)fr.haeu("haky", haer(int ), (int)83);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl132
            }
lbl122:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)fr.haeu("hakz", haer(int ), (int)84);
                if (var3_1) {
                    throw null;
                }
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fr.haeu("hala", haer(int ), (int)85);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl136
                    break;
                }
            }
lbl132:
            // 4 sources

            case 7: {
                var2_2 /* !! */  = (int)fr.haeu("halb", haer(int ), (int)86);
                if (var3_1) {
                    throw null;
                }
            }
lbl136:
            // 4 sources

            case 8: {
                var2_2 /* !! */  = (int)fr.haeu("halc", haer(int ), (int)87);
                if (!var3_1) ** GOTO lbl122
                throw null;
            }
            case 9: 
        }
        var2_2 /* !! */  = (int)fr.haeu("hald", haer(int ), (int)88);
        ** while (!var3_1)
lbl143:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hasr() {
        fr.hafc[0] = 7811322360248252147L;
        fr.hafc[1] = 378821813815889996L;
        fr.hafc[2] = 781250077939324086L;
        fr.hafc[3] = -7825703892352927620L;
        fr.hafc[4] = 7680179017440287669L;
        fr.hafc[5] = 5436945266845312678L;
        fr.hafc[6] = 5585606232954831047L;
        fr.hafc[7] = 7051920916864735492L;
        fr.hafc[8] = -5018635775084336455L;
        fr.hafc[9] = -7778064280352250839L;
        fr.hafc[10] = 7314979633900236054L;
        fr.hafc[11] = -8694755656167395177L;
        fr.hafc[12] = -1761462346182818266L;
        fr.hafc[13] = -7806153026543046810L;
        fr.hafc[14] = 8160207298739830069L;
        fr.hafc[15] = -9009460879742861217L;
        fr.hafc[16] = 8987280351590793537L;
        fr.hafc[17] = 6433248034925829652L;
        fr.hafc[18] = 3680946767098709435L;
        fr.hafc[19] = 6280915236009555041L;
        fr.hafc[20] = -1655354982645310885L;
        fr.hafc[21] = -984451515124635408L;
        fr.hafc[22] = -3748989557011484845L;
        fr.hafc[23] = -1087694157776829088L;
        fr.hafc[24] = 6945431713424788628L;
        fr.hafc[25] = 4630681330128068745L;
        fr.hafc[26] = 1953536594879770363L;
        fr.hafc[27] = -3997925777824545384L;
        fr.hafc[28] = 8537350325798237951L;
        fr.hafc[29] = -5080023974966712214L;
        fr.hafc[30] = 114255002798166160L;
        fr.hafc[31] = -6097401409719313677L;
        fr.hafc[32] = -1084775181724556446L;
        fr.hafc[33] = -4834734589712533365L;
        fr.hafc[34] = -6214228625791485205L;
        fr.hafc[35] = 4689100774187930751L;
        fr.hafc[36] = 9074560599431271462L;
        fr.hafc[37] = 4784742747082825411L;
        fr.hafc[38] = 7177840268800077924L;
        fr.hafc[39] = -6597140482838021482L;
        fr.hafc[40] = 1679161001111247554L;
        fr.hafc[41] = 6970451556936583250L;
        fr.hafc[42] = -702069659425756860L;
        fr.hafc[43] = -2772637754791357693L;
        fr.hafc[44] = 2950138242539374418L;
        fr.hafc[45] = -8959629578121187555L;
        fr.hafc[46] = -8440265295804010918L;
        fr.hafc[47] = 9140877771830199749L;
        fr.hafc[48] = 5225167250045090956L;
        fr.hafc[49] = 5357348294339280316L;
        fr.hafc[50] = -9209430197250343945L;
        fr.hafc[51] = -1998061817262379271L;
        fr.hafc[52] = -6665393803641259587L;
        fr.hafc[53] = 6671755919615060663L;
        fr.hafc[54] = 8049524871359035531L;
        fr.hafc[55] = 7892752541102901524L;
        fr.hafc[56] = 8591601243381582991L;
        fr.hafc[57] = -5905264085159213312L;
        fr.hafc[58] = -5502369102076852809L;
        fr.hafc[59] = 8856602556574538857L;
        fr.hafc[60] = 4946605602671097150L;
        fr.hafc[61] = 3054600420806955720L;
        fr.hafc[62] = -8329414061417599361L;
        fr.hafc[63] = -518535796465644549L;
        fr.hafc[64] = -3221004152264196860L;
        fr.hafc[65] = 8373709761257720683L;
        fr.hafc[66] = -3030804324660984385L;
        fr.hafc[67] = -8510365604665524415L;
        fr.hafc[68] = 423993745936474974L;
        fr.hafc[69] = -6741174261401048719L;
        fr.hafc[70] = -2962881175026237077L;
        fr.hafc[71] = -9009705406872773420L;
        fr.hafc[72] = -2495399335180982917L;
        fr.hafc[73] = -8393136690770906361L;
        fr.hafc[74] = -1899860229218545360L;
        fr.hafc[75] = 3287683436380455287L;
        fr.hafc[76] = 575790008150422666L;
        fr.hafc[77] = -7615754044585187307L;
        fr.hafc[78] = 5340376717674638621L;
        fr.hafc[79] = -2298121682340402853L;
        fr.hafc[80] = 3316390883217778598L;
        fr.hafc[81] = -5450527831337328111L;
        fr.hafc[82] = 8981047079731535536L;
        fr.hafc[83] = 13625502361389125L;
        fr.hafc[84] = 6942407409685615584L;
        fr.hafc[85] = -8139889631294488518L;
        fr.hafc[86] = 5905844485531155410L;
        fr.hafc[87] = 1194313160256264622L;
        fr.hafc[88] = 2796691589099126402L;
        fr.hafc[89] = -8685909110358846983L;
        fr.hafc[90] = 8434567383428686675L;
        fr.hafc[91] = -2064035223540976585L;
        fr.hafc[92] = 5545865469548917140L;
        fr.hafc[93] = 6435769280418475564L;
        fr.hafc[94] = 2856602099801070071L;
        fr.hafc[95] = -7025491991264770725L;
        fr.hafc[96] = -7483875686069621378L;
        fr.hafc[97] = 2357946258297425536L;
        fr.hafc[98] = 5034969978849164027L;
        fr.hafc[99] = 2812569992328182704L;
    }

    private static /* synthetic */ void hasq() {
        fr.haet[200] = 1447660359;
        fr.haet[201] = 1667329485;
        fr.haet[202] = -1041194606;
        fr.haet[203] = -722427807;
        fr.haet[204] = -588834015;
        fr.haet[205] = 584205468;
        fr.haet[206] = -173537374;
        fr.haet[207] = 1239480931;
        fr.haet[208] = 1416315562;
        fr.haet[209] = 830424429;
        fr.haet[210] = 375318474;
        fr.haet[211] = -104087109;
        fr.haet[212] = -1676893378;
        fr.haet[213] = 824613057;
        fr.haet[214] = -1875950248;
        fr.haet[215] = 312811183;
        fr.haet[216] = -1489603110;
        fr.haet[217] = 759942898;
        fr.haet[218] = 1964421031;
        fr.haet[219] = 799136968;
        fr.haet[220] = 176369459;
        fr.haet[221] = -2106335890;
        fr.haet[222] = 464179343;
        fr.haet[223] = -1783133960;
    }

    private static /* synthetic */ int haer(int n2) {
        return haes[n2] ^ haet[n2];
    }

    private static /* synthetic */ void hast() {
        fr.hafd[0] = 1413959089568462579L;
        fr.hafd[1] = 4492003176026573957L;
        fr.hafd[2] = 4348722021950013907L;
        fr.hafd[3] = 7671094967210250189L;
        fr.hafd[4] = -2411090550502495998L;
        fr.hafd[5] = -6760414246986322592L;
        fr.hafd[6] = 3292004692225106828L;
        fr.hafd[7] = 7065733883353494213L;
        fr.hafd[8] = 6346026468392294054L;
        fr.hafd[9] = -8164548897752333352L;
        fr.hafd[10] = 942536666628218873L;
        fr.hafd[11] = -2027192069272015811L;
        fr.hafd[12] = -5029886694702261972L;
        fr.hafd[13] = -6138404107893444583L;
        fr.hafd[14] = -6015593042777442701L;
        fr.hafd[15] = -4601661801682536540L;
        fr.hafd[16] = 106573624907230993L;
        fr.hafd[17] = 2211271494466084871L;
        fr.hafd[18] = -5347013554425488081L;
        fr.hafd[19] = -3541329652882584385L;
        fr.hafd[20] = -1657225548692715435L;
        fr.hafd[21] = -2699713839728021004L;
        fr.hafd[22] = -833911622955112955L;
        fr.hafd[23] = -2336957291092165306L;
        fr.hafd[24] = -4212704780658508107L;
        fr.hafd[25] = 7401966788827866411L;
        fr.hafd[26] = 402825614080918951L;
        fr.hafd[27] = 2789458014327938699L;
        fr.hafd[28] = -667768684617743017L;
        fr.hafd[29] = 7329902173000202151L;
        fr.hafd[30] = 206288431985186182L;
        fr.hafd[31] = 4763072639065656906L;
        fr.hafd[32] = -7462426152626708842L;
        fr.hafd[33] = 3605465940213380414L;
        fr.hafd[34] = 5504087582092983832L;
        fr.hafd[35] = 4045971539516357889L;
        fr.hafd[36] = 3960693876888772771L;
        fr.hafd[37] = -5154584682639322183L;
        fr.hafd[38] = 2045988493411397732L;
        fr.hafd[39] = 7060938495294954497L;
        fr.hafd[40] = 1918105793975780029L;
        fr.hafd[41] = -7686037248524459120L;
        fr.hafd[42] = 8378474344761537767L;
        fr.hafd[43] = 8660962209081245485L;
        fr.hafd[44] = -8705052705568709383L;
        fr.hafd[45] = -7249187480824267303L;
        fr.hafd[46] = -3042085256589618024L;
        fr.hafd[47] = 8259114378190568188L;
        fr.hafd[48] = 2199065013571016480L;
        fr.hafd[49] = 5408726988609487112L;
        fr.hafd[50] = 1022701082450359058L;
        fr.hafd[51] = 3059532319985896441L;
        fr.hafd[52] = -2555859143665681987L;
        fr.hafd[53] = -2700441385614548719L;
        fr.hafd[54] = 2650037544797929621L;
        fr.hafd[55] = -4184325969340046416L;
        fr.hafd[56] = -2390601277414466020L;
        fr.hafd[57] = -1355730129915727802L;
        fr.hafd[58] = 2205047332716824379L;
        fr.hafd[59] = -7949921489935946306L;
        fr.hafd[60] = 5299674954905253073L;
        fr.hafd[61] = 4118337187935124421L;
        fr.hafd[62] = 7528702599879320182L;
        fr.hafd[63] = -9108085068825887926L;
        fr.hafd[64] = -3263462672086536016L;
        fr.hafd[65] = -3510532392195852814L;
        fr.hafd[66] = 2884688603353250127L;
        fr.hafd[67] = -2891872391099353573L;
        fr.hafd[68] = -585146181802090065L;
        fr.hafd[69] = 2910476489334142418L;
        fr.hafd[70] = -8366551167584163694L;
        fr.hafd[71] = 3099628919906729453L;
        fr.hafd[72] = 7740092945404392317L;
        fr.hafd[73] = -1199161882414450143L;
        fr.hafd[74] = 853978674776764468L;
        fr.hafd[75] = -8462792272658614917L;
        fr.hafd[76] = -3834440926059829514L;
        fr.hafd[77] = -727843693213750850L;
        fr.hafd[78] = -8524348356495132910L;
        fr.hafd[79] = 2969520056457282701L;
        fr.hafd[80] = 2094196475698081705L;
        fr.hafd[81] = -4699640986530170884L;
        fr.hafd[82] = 241812002819088048L;
        fr.hafd[83] = -73616569394303377L;
        fr.hafd[84] = -3145352295809693063L;
        fr.hafd[85] = -6219312710726492250L;
        fr.hafd[86] = -8025118579122449759L;
        fr.hafd[87] = -7962343849880587266L;
        fr.hafd[88] = -2205398857892295301L;
        fr.hafd[89] = 7259512049936211596L;
        fr.hafd[90] = 1325349655874095066L;
        fr.hafd[91] = -4078187712815299739L;
        fr.hafd[92] = 948944637370315486L;
        fr.hafd[93] = 3704238277127200869L;
        fr.hafd[94] = 2074985812498500718L;
        fr.hafd[95] = -8801488867750415583L;
        fr.hafd[96] = 3154452716425107715L;
        fr.hafd[97] = -9112614326582190440L;
        fr.hafd[98] = 2116317406182316576L;
        fr.hafd[99] = -4764189316826052290L;
    }

    private static /* synthetic */ void haso() {
        fr.haet[0] = -1677604451;
        fr.haet[1] = 2066345149;
        fr.haet[2] = -375532422;
        fr.haet[3] = -1961254473;
        fr.haet[4] = -594974284;
        fr.haet[5] = -1879189420;
        fr.haet[6] = 1927367417;
        fr.haet[7] = -751373215;
        fr.haet[8] = -967976387;
        fr.haet[9] = 335451860;
        fr.haet[10] = 2092456430;
        fr.haet[11] = 2064136991;
        fr.haet[12] = 904517062;
        fr.haet[13] = -2064134512;
        fr.haet[14] = 1295480862;
        fr.haet[15] = 1960022934;
        fr.haet[16] = -249798249;
        fr.haet[17] = -1862859641;
        fr.haet[18] = 1075744367;
        fr.haet[19] = 1787991000;
        fr.haet[20] = -1373641492;
        fr.haet[21] = -1347399520;
        fr.haet[22] = 234716363;
        fr.haet[23] = 486849869;
        fr.haet[24] = 698158899;
        fr.haet[25] = 1499474472;
        fr.haet[26] = -3423836;
        fr.haet[27] = -919798827;
        fr.haet[28] = 1091808432;
        fr.haet[29] = -1861339465;
        fr.haet[30] = -1028954905;
        fr.haet[31] = -516392423;
        fr.haet[32] = -2024833709;
        fr.haet[33] = -1572248971;
        fr.haet[34] = -1547215932;
        fr.haet[35] = -1000087828;
        fr.haet[36] = -781927583;
        fr.haet[37] = -425181242;
        fr.haet[38] = 220876830;
        fr.haet[39] = -1178991432;
        fr.haet[40] = -181601590;
        fr.haet[41] = -1489014161;
        fr.haet[42] = 987738644;
        fr.haet[43] = 1622727026;
        fr.haet[44] = -7397745;
        fr.haet[45] = -676230963;
        fr.haet[46] = 230445708;
        fr.haet[47] = -1316372015;
        fr.haet[48] = -770923781;
        fr.haet[49] = 124611684;
        fr.haet[50] = 1150193838;
        fr.haet[51] = -1416946301;
        fr.haet[52] = -1432087383;
        fr.haet[53] = 875540264;
        fr.haet[54] = 244484967;
        fr.haet[55] = 1401859389;
        fr.haet[56] = -1854692118;
        fr.haet[57] = 1071855162;
        fr.haet[58] = 1797865346;
        fr.haet[59] = 141830816;
        fr.haet[60] = -1686753771;
        fr.haet[61] = -1215429215;
        fr.haet[62] = -607826901;
        fr.haet[63] = 276229526;
        fr.haet[64] = 726822987;
        fr.haet[65] = -1140227985;
        fr.haet[66] = 692752458;
        fr.haet[67] = 1782299248;
        fr.haet[68] = 1458140702;
        fr.haet[69] = -2009239419;
        fr.haet[70] = -1223066428;
        fr.haet[71] = -1359638309;
        fr.haet[72] = 1968316510;
        fr.haet[73] = 199850258;
        fr.haet[74] = 1593720855;
        fr.haet[75] = -384535513;
        fr.haet[76] = 1051962552;
        fr.haet[77] = -390853893;
        fr.haet[78] = -386585564;
        fr.haet[79] = -679582665;
        fr.haet[80] = -82751955;
        fr.haet[81] = 204457703;
        fr.haet[82] = 1678019305;
        fr.haet[83] = 1094074816;
        fr.haet[84] = 68238856;
        fr.haet[85] = 885190122;
        fr.haet[86] = 960693608;
        fr.haet[87] = 1660688433;
        fr.haet[88] = -548207589;
        fr.haet[89] = -1467580684;
        fr.haet[90] = -2101770042;
        fr.haet[91] = -1084910185;
        fr.haet[92] = 328045839;
        fr.haet[93] = -1561972539;
        fr.haet[94] = -1337207505;
        fr.haet[95] = -658780649;
        fr.haet[96] = -2079348462;
        fr.haet[97] = 1579070833;
        fr.haet[98] = -982563184;
        fr.haet[99] = -1876958649;
    }

    private static /* synthetic */ void hasn() {
        fr.haes[200] = 1447660364;
        fr.haes[201] = 1667329479;
        fr.haes[202] = -1041194595;
        fr.haes[203] = -722427805;
        fr.haes[204] = -588834008;
        fr.haes[205] = 584205459;
        fr.haes[206] = -173537365;
        fr.haes[207] = 1239480932;
        fr.haes[208] = 1416315554;
        fr.haes[209] = 830424417;
        fr.haes[210] = 375318469;
        fr.haes[211] = -104087125;
        fr.haes[212] = -1676893394;
        fr.haes[213] = -824613058;
        fr.haes[214] = 1004290179;
        fr.haes[215] = 312811183;
        fr.haes[216] = 1489603109;
        fr.haes[217] = 1505151722;
        fr.haes[218] = 1964421030;
        fr.haes[219] = 799136971;
        fr.haes[220] = 176369462;
        fr.haes[221] = -2106335890;
        fr.haes[222] = 464179340;
        fr.haes[223] = -1783133957;
    }

    static {
        haes = new int[224];
        haet = new int[224];
        fr.hasl();
        fr.hasm();
        fr.hasn();
        fr.haso();
        fr.hasp();
        fr.hasq();
        hafc = new long[125];
        hafd = new long[125];
        fr.hasr();
        fr.hass();
        fr.hast();
        fr.hasu();
    }

    public static /* synthetic */ CallSite haeu(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldLoad(di var1_1) {
        v0 /* !! */  = fr.nx;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - fr.haeu("hars", hafn(int ), (int)117));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1355601209: {
                    v1 = fr.haeu("hart", hafn(int ), (int)118);
                    continue block18;
                }
                case 1991043618: {
                    v1 = fr.haeu("haru", hafn(int ), (int)119);
                    continue block18;
                }
                case 2125814856: {
                    break block18;
                }
            }
            break;
        }
        var4_2 = fr.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fr.nx - fr.haeu("harv", hafn(int ), (int)120)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fr.haeu("harw", haer(int ), (int)213)) break;
            v2 /* !! */  = (long)fr.haeu("harx", haer(int ), (int)214);
        }
        var3_3 /* !! */  = fr.b;
        v3 /* !! */  = fr.nx;
        if (true) ** GOTO lbl25
        block20: while (true) {
            v3 /* !! */  = (long)(v4 - fr.haeu("hary", hafn(int ), (int)121));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 234258337: {
                    v4 = fr.haeu("harz", hafn(int ), (int)122);
                    continue block20;
                }
                case 534311037: {
                    v4 = fr.haeu("hasa", hafn(int ), (int)123);
                    continue block20;
                }
                case 2125814856: {
                    break block20;
                }
            }
            break;
        }
        var2_4 = fr.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
lbl40:
                    // 2 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl40
                v5 = fr.haeu("hasb", haer(int ), (int)215);
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = fr.nx - fr.haeu("hasc", hafn(int ), (int)124)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == fr.haeu("hasd", haer(int ), (int)216)) break;
                    v6 /* !! */  = (long)fr.haeu("hase", haer(int ), (int)217);
                }
                this.setState((boolean)v5);
                if (var2_4 || var2_4) ** continue;
                return;
            }
lbl52:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)fr.haeu("hasf", haer(int ), (int)218);
                    if (!var4_2) break block10;
                    throw null;
                }
            }
lbl57:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)fr.haeu("hasg", haer(int ), (int)219);
                if (!var4_2) ** GOTO lbl52
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)fr.haeu("hash", haer(int ), (int)220);
                if (!var4_2) ** GOTO lbl52
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)fr.haeu("hasi", haer(int ), (int)221);
                if (!var4_2) break;
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)fr.haeu("hasj", haer(int ), (int)222);
                if (!var4_2) ** GOTO lbl57
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)fr.haeu("hask", haer(int ), (int)223);
        ** while (!var4_2)
lbl76:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hasl() {
        fr.haes[0] = -1677604451;
        fr.haes[1] = 994700477;
        fr.haes[2] = -1453468550;
        fr.haes[3] = -1227526790;
        fr.haes[4] = -594974283;
        fr.haes[5] = -1879189417;
        fr.haes[6] = 1927367420;
        fr.haes[7] = -751373216;
        fr.haes[8] = -967976386;
        fr.haes[9] = 335451861;
        fr.haes[10] = 2092456431;
        fr.haes[11] = 2064136984;
        fr.haes[12] = 904517060;
        fr.haes[13] = 2064134511;
        fr.haes[14] = 1225881240;
        fr.haes[15] = 1960022933;
        fr.haes[16] = -249798252;
        fr.haes[17] = -1862859644;
        fr.haes[18] = 1075744364;
        fr.haes[19] = -1787991001;
        fr.haes[20] = 1731500653;
        fr.haes[21] = 1347399519;
        fr.haes[22] = -1711577379;
        fr.haes[23] = -486849870;
        fr.haes[24] = -1769414447;
        fr.haes[25] = 1499474473;
        fr.haes[26] = -1972653211;
        fr.haes[27] = -919798828;
        fr.haes[28] = 1852720102;
        fr.haes[29] = 1861339464;
        fr.haes[30] = 1497977633;
        fr.haes[31] = 516392422;
        fr.haes[32] = 563074506;
        fr.haes[33] = -1572248971;
        fr.haes[34] = -1547215931;
        fr.haes[35] = 1000087827;
        fr.haes[36] = -1789190023;
        fr.haes[37] = -425181240;
        fr.haes[38] = 220876822;
        fr.haes[39] = -1178991436;
        fr.haes[40] = -181601588;
        fr.haes[41] = -1489014162;
        fr.haes[42] = 987738644;
        fr.haes[43] = 1622727032;
        fr.haes[44] = -7397745;
        fr.haes[45] = -676230970;
        fr.haes[46] = 230445704;
        fr.haes[47] = -1316372005;
        fr.haes[48] = -770923781;
        fr.haes[49] = 124611680;
        fr.haes[50] = 1150193832;
        fr.haes[51] = -1416946294;
        fr.haes[52] = -1432087384;
        fr.haes[53] = 1868126800;
        fr.haes[54] = 244484967;
        fr.haes[55] = -1401859390;
        fr.haes[56] = 1704496919;
        fr.haes[57] = 1071855163;
        fr.haes[58] = 654550039;
        fr.haes[59] = 141830823;
        fr.haes[60] = -1686753773;
        fr.haes[61] = -1215429209;
        fr.haes[62] = -607826901;
        fr.haes[63] = 276229523;
        fr.haes[64] = 726822988;
        fr.haes[65] = -1140227987;
        fr.haes[66] = 692752457;
        fr.haes[67] = 1782299249;
        fr.haes[68] = -426497593;
        fr.haes[69] = 2009239418;
        fr.haes[70] = 624062344;
        fr.haes[71] = -1851902634;
        fr.haes[72] = -1968316511;
        fr.haes[73] = 762293580;
        fr.haes[74] = -1593720856;
        fr.haes[75] = 1289838577;
        fr.haes[76] = -1051962553;
        fr.haes[77] = -1725192262;
        fr.haes[78] = 1467296804;
        fr.haes[79] = -679582670;
        fr.haes[80] = -82751959;
        fr.haes[81] = 204457702;
        fr.haes[82] = 1678019309;
        fr.haes[83] = 1094074819;
        fr.haes[84] = 68238857;
        fr.haes[85] = 885190126;
        fr.haes[86] = 960693611;
        fr.haes[87] = 1660688435;
        fr.haes[88] = -548207592;
        fr.haes[89] = -1467580683;
        fr.haes[90] = 1438058556;
        fr.haes[91] = 1084910184;
        fr.haes[92] = 1054517786;
        fr.haes[93] = -1561972539;
        fr.haes[94] = 1337207504;
        fr.haes[95] = 746853902;
        fr.haes[96] = -2079348461;
        fr.haes[97] = 1579070833;
        fr.haes[98] = -982563184;
        fr.haes[99] = -1876958641;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public fr() {
        var2_1 /* !! */  = fr.b;
        super("AirStuck", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0437\u0430\u0432\u0438\u0441\u043d\u0443\u0442\u044c \u0432 \u0432\u043e\u0437\u0434\u0443\u0445\u0435", du.MOVEMENT);
        this.changeAuraDistance = new kb("\u0418\u0437\u043c\u0435\u043d\u044f\u0442\u044c \u0434\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044e \u043a\u0438\u043b\u043b\u0430\u0443\u0440\u044b", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u043e\u0442\u0434\u0435\u043b\u044c\u043d\u0443\u044e \u0434\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044e KillAura \u0432\u043e \u0432\u0440\u0435\u043c\u044f AirStuck").setValue((boolean)fr.haeu("haev", haer(int ), (int)0));
        this.auraDistance = new kg("\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u043a\u0438\u043b\u043b\u0430\u0443\u0440\u044b", "\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u0430\u0442\u0430\u043a\u0438 KillAura \u0432\u043e \u0432\u0440\u0435\u043c\u044f AirStuck", (float)fr.haeu("haex", haew(int ), (int)1)).range(2.0f, (float)fr.haeu("haey", haew(int ), (int)2)).step((float)fr.haeu("haez", haew(int ), (int)3)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, isValue(), ()Ljava/lang/Boolean;)((kb)this.changeAuraDistance));
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.catchMoment = new kb("\u041b\u043e\u0432\u0438\u0442\u044c \u043c\u043e\u043c\u0435\u043d\u0442", "\u0417\u0430\u043c\u043e\u0440\u043e\u0437\u0438\u0442\u044c\u0441\u044f \u0432 \u0432\u0435\u0440\u0445\u043d\u0435\u0439 \u0442\u043e\u0447\u043a\u0435 \u043f\u0440\u044b\u0436\u043a\u0430").setValue((boolean)fr.haeu("hafa", haer(int ), (int)4));
                this.peakY = (double)fr.haeu("hafe", hafb(int ), (int)0);
                this.settings(new jx[]{this.changeAuraDistance, this.auraDistance, this.catchMoment});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)fr.haeu("haff", haer(int ), (int)5);
                ** GOTO lbl21
            }
            case 1: {
                var2_1 /* !! */  = (int)fr.haeu("hafg", haer(int ), (int)6);
                ** GOTO lbl28
            }
lbl21:
            // 4 sources

            case 2: {
                var2_1 /* !! */  = (int)fr.haeu("hafh", haer(int ), (int)7);
            }
            case 3: {
                var2_1 /* !! */  = (int)fr.haeu("hafi", haer(int ), (int)8);
                ** GOTO lbl31
            }
            case 4: {
                var2_1 /* !! */  = (int)fr.haeu("hafj", haer(int ), (int)9);
            }
lbl28:
            // 3 sources

            case 5: {
                var2_1 /* !! */  = (int)fr.haeu("hafk", haer(int ), (int)10);
                ** GOTO lbl21
            }
lbl31:
            // 2 sources

            case 6: {
                var2_1 /* !! */  = (int)fr.haeu("hafl", haer(int ), (int)11);
                ** GOTO lbl21
            }
            case 7: 
        }
        while (true) {
            var2_1 /* !! */  = (int)fr.haeu("hafm", haer(int ), (int)12);
        }
    }

    private static /* synthetic */ double hafb(int n2) {
        return Double.longBitsToDouble(hafc[n2] ^ hafd[n2]);
    }

    private static /* synthetic */ void hasm() {
        fr.haes[100] = 114570632;
        fr.haes[101] = 728099498;
        fr.haes[102] = -768365206;
        fr.haes[103] = 1059379716;
        fr.haes[104] = 1167641762;
        fr.haes[105] = -1373304601;
        fr.haes[106] = 1514938125;
        fr.haes[107] = -1782851031;
        fr.haes[108] = -999426880;
        fr.haes[109] = -1884890239;
        fr.haes[110] = 529537557;
        fr.haes[111] = 64637195;
        fr.haes[112] = 1278502138;
        fr.haes[113] = 1625741157;
        fr.haes[114] = -1728978383;
        fr.haes[115] = 1337310910;
        fr.haes[116] = 1482970305;
        fr.haes[117] = 1778552786;
        fr.haes[118] = -469122639;
        fr.haes[119] = -375653758;
        fr.haes[120] = -942491544;
        fr.haes[121] = -2062127253;
        fr.haes[122] = 157584503;
        fr.haes[123] = -669464294;
        fr.haes[124] = -125758939;
        fr.haes[125] = -158630632;
        fr.haes[126] = 870523736;
        fr.haes[127] = -615105492;
        fr.haes[128] = -1180112456;
        fr.haes[129] = 1061486375;
        fr.haes[130] = -1450700641;
        fr.haes[131] = 1941260975;
        fr.haes[132] = 1806191117;
        fr.haes[133] = -1393651961;
        fr.haes[134] = -672239822;
        fr.haes[135] = 1075247187;
        fr.haes[136] = 89038550;
        fr.haes[137] = -1625726722;
        fr.haes[138] = 820744530;
        fr.haes[139] = 892104310;
        fr.haes[140] = -567639653;
        fr.haes[141] = 1837089656;
        fr.haes[142] = 1442847154;
        fr.haes[143] = -2086230890;
        fr.haes[144] = 510544802;
        fr.haes[145] = -1682826026;
        fr.haes[146] = 173309178;
        fr.haes[147] = -175865487;
        fr.haes[148] = -938835028;
        fr.haes[149] = 1893787280;
        fr.haes[150] = -1907876519;
        fr.haes[151] = -1790405814;
        fr.haes[152] = 1420472616;
        fr.haes[153] = 1250276323;
        fr.haes[154] = -1942567915;
        fr.haes[155] = -1396598964;
        fr.haes[156] = -438394235;
        fr.haes[157] = -1287130245;
        fr.haes[158] = -224169698;
        fr.haes[159] = -1279824065;
        fr.haes[160] = -168250390;
        fr.haes[161] = 547868734;
        fr.haes[162] = 1655230307;
        fr.haes[163] = -316318785;
        fr.haes[164] = 1578710734;
        fr.haes[165] = 1119258973;
        fr.haes[166] = -1409613682;
        fr.haes[167] = 145458025;
        fr.haes[168] = -1940955344;
        fr.haes[169] = 423818607;
        fr.haes[170] = 570642685;
        fr.haes[171] = 975566199;
        fr.haes[172] = -968542896;
        fr.haes[173] = -365825724;
        fr.haes[174] = -1077336446;
        fr.haes[175] = -141437728;
        fr.haes[176] = 248501402;
        fr.haes[177] = 2008047467;
        fr.haes[178] = 1755747215;
        fr.haes[179] = 437577860;
        fr.haes[180] = 1103404449;
        fr.haes[181] = -876255566;
        fr.haes[182] = 1196365989;
        fr.haes[183] = 1598041673;
        fr.haes[184] = 2035615484;
        fr.haes[185] = 110911288;
        fr.haes[186] = -1747287458;
        fr.haes[187] = 1642690036;
        fr.haes[188] = 151897784;
        fr.haes[189] = -949774522;
        fr.haes[190] = -819364140;
        fr.haes[191] = 1799807799;
        fr.haes[192] = -1662761632;
        fr.haes[193] = 804713872;
        fr.haes[194] = -850075711;
        fr.haes[195] = -588372137;
        fr.haes[196] = 799847995;
        fr.haes[197] = -1979380424;
        fr.haes[198] = 2077807236;
        fr.haes[199] = 2127195462;
    }

    private static /* synthetic */ void hasp() {
        fr.haet[100] = 114570635;
        fr.haet[101] = 728099498;
        fr.haet[102] = -768365201;
        fr.haet[103] = 1059379716;
        fr.haet[104] = 1167641770;
        fr.haet[105] = -1373304608;
        fr.haet[106] = 1514938121;
        fr.haet[107] = -1782851031;
        fr.haet[108] = -999426879;
        fr.haet[109] = -1884890233;
        fr.haet[110] = 529537536;
        fr.haet[111] = 64637213;
        fr.haet[112] = 1278502123;
        fr.haet[113] = 1625741158;
        fr.haet[114] = -1728978407;
        fr.haet[115] = 1337310908;
        fr.haet[116] = 1482970343;
        fr.haet[117] = 1778552783;
        fr.haet[118] = -469122625;
        fr.haet[119] = -375653745;
        fr.haet[120] = -942491534;
        fr.haet[121] = -2062127255;
        fr.haet[122] = 157584507;
        fr.haet[123] = -669464308;
        fr.haet[124] = -125758920;
        fr.haet[125] = -158630637;
        fr.haet[126] = 870523718;
        fr.haet[127] = -615105474;
        fr.haet[128] = -1180112468;
        fr.haet[129] = 1061486378;
        fr.haet[130] = -1450700672;
        fr.haet[131] = 1941260965;
        fr.haet[132] = 1806191132;
        fr.haet[133] = -1393651957;
        fr.haet[134] = -672239833;
        fr.haet[135] = 1075247194;
        fr.haet[136] = 89038591;
        fr.haet[137] = -1625726762;
        fr.haet[138] = 820744516;
        fr.haet[139] = 892104310;
        fr.haet[140] = -567639663;
        fr.haet[141] = 1837089653;
        fr.haet[142] = 1442847144;
        fr.haet[143] = -2086230860;
        fr.haet[144] = 510544801;
        fr.haet[145] = -1682826020;
        fr.haet[146] = 173309144;
        fr.haet[147] = -175865515;
        fr.haet[148] = -938835031;
        fr.haet[149] = 1893787281;
        fr.haet[150] = -1907876539;
        fr.haet[151] = -1790405821;
        fr.haet[152] = -1420472617;
        fr.haet[153] = -785295355;
        fr.haet[154] = 1942567914;
        fr.haet[155] = -463019503;
        fr.haet[156] = 438394234;
        fr.haet[157] = -774750284;
        fr.haet[158] = 224169697;
        fr.haet[159] = 2058384842;
        fr.haet[160] = -168250389;
        fr.haet[161] = -1627372894;
        fr.haet[162] = -1655230308;
        fr.haet[163] = 258670205;
        fr.haet[164] = -1578710735;
        fr.haet[165] = 1960887419;
        fr.haet[166] = 1409613681;
        fr.haet[167] = 1847187512;
        fr.haet[168] = -1940955331;
        fr.haet[169] = 423818596;
        fr.haet[170] = 570642679;
        fr.haet[171] = 975566199;
        fr.haet[172] = -968542885;
        fr.haet[173] = -365825723;
        fr.haet[174] = -1077336440;
        fr.haet[175] = -141437720;
        fr.haet[176] = 248501398;
        fr.haet[177] = 2008047469;
        fr.haet[178] = 1755747207;
        fr.haet[179] = 437577864;
        fr.haet[180] = 1103404457;
        fr.haet[181] = -876255567;
        fr.haet[182] = 1196365997;
        fr.haet[183] = -1598041674;
        fr.haet[184] = -1875109916;
        fr.haet[185] = -110911289;
        fr.haet[186] = 1663062165;
        fr.haet[187] = 1642690037;
        fr.haet[188] = 926725978;
        fr.haet[189] = 949774521;
        fr.haet[190] = -1599541096;
        fr.haet[191] = 1799807798;
        fr.haet[192] = 1515680473;
        fr.haet[193] = 804713873;
        fr.haet[194] = -850075712;
        fr.haet[195] = 1690479550;
        fr.haet[196] = 799847994;
        fr.haet[197] = -1979380429;
        fr.haet[198] = 2077807233;
        fr.haet[199] = 2127195458;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean isFrozen() {
        CallSite callSite;
        boolean bl2;
        block29: {
            Object object = nx;
            boolean bl3 = true;
            block12: while (true) {
                CallSite callSite2;
                if (!bl3 || (bl3 = false) || !true) {
                    object = callSite2 - fr.haeu("hale", hafn(int ), (int)71);
                }
                switch ((int)object) {
                    case -2029146818: {
                        callSite2 = fr.haeu("half", hafn(int ), (int)72);
                        continue block12;
                    }
                    case -947027058: {
                        callSite2 = fr.haeu("halg", hafn(int ), (int)73);
                        continue block12;
                    }
                    case -455507885: {
                        callSite2 = fr.haeu("halh", hafn(int ), (int)74);
                        continue block12;
                    }
                    case 2125814856: {
                        break block12;
                    }
                }
                break;
            }
            boolean bl4 = c;
            while (true) {
                long l2;
                Object object2;
                if ((object2 = (l2 = nx - fr.haeu("hali", hafn(int ), (int)75)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                if (object2 == fr.haeu("halj", haer(int ), (int)89)) break;
                object2 = fr.haeu("halk", haer(int ), (int)90);
            }
            int n2 = b;
            while (true) {
                long l3;
                Object object3;
                if ((object3 = (l3 = nx - fr.haeu("hall", hafn(int ), (int)76)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                if (object3 == fr.haeu("halm", haer(int ), (int)91)) {
                    bl2 = a;
                    if (bl4) {
                        throw null;
                    }
                    break;
                }
                object3 = fr.haeu("haln", haer(int ), (int)92);
            }
            if (bl2 || bl2) return (boolean)fr.haeu("halo", haer(int ), (int)93);
            Object object4 = nx;
            boolean bl5 = true;
            block15: while (true) {
                CallSite callSite3;
                if (!bl5 || (bl5 = false) || !true) {
                    object4 = callSite3 - fr.haeu("halp", hafn(int ), (int)77);
                }
                switch ((int)object4) {
                    case 123810341: {
                        callSite3 = fr.haeu("halq", hafn(int ), (int)78);
                        continue block15;
                    }
                    case 407414342: {
                        callSite3 = fr.haeu("halr", hafn(int ), (int)79);
                        continue block15;
                    }
                    case 873473597: {
                        callSite3 = fr.haeu("hals", hafn(int ), (int)80);
                        continue block15;
                    }
                    case 2125814856: {
                        break block15;
                    }
                }
                break;
            }
            if (this.isState()) {
                if (bl2) return (boolean)fr.haeu("halo", haer(int ), (int)93);
                while (true) {
                    long l4;
                    Object object5;
                    if ((object5 = (l4 = nx - fr.haeu("halt", hafn(int ), (int)81)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
                    if (object5 == fr.haeu("halu", haer(int ), (int)94)) {
                        if (this.frozen) {
                            break;
                        }
                        break block29;
                    }
                    object5 = fr.haeu("halv", haer(int ), (int)95);
                }
                if (bl2) return (boolean)fr.haeu("halo", haer(int ), (int)93);
                callSite = fr.haeu("halw", haer(int ), (int)96);
                if (!bl4) return (boolean)callSite;
                throw null;
            }
        }
        if (bl2 || bl2) {
            return (boolean)fr.haeu("halo", haer(int ), (int)93);
        }
        callSite = fr.haeu("halx", haer(int ), (int)97);
        return (boolean)callSite;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void activate() {
        v0 /* !! */  = fr.nx;
        if (true) ** GOTO lbl5
        block57: while (true) {
            v0 /* !! */  = (long)(v1 - fr.haeu("hagf", hafn(int ), (int)12));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1330589127: {
                    v1 = fr.haeu("hagg", hafn(int ), (int)13);
                    continue block57;
                }
                case 333447267: {
                    v1 = fr.haeu("hagh", hafn(int ), (int)14);
                    continue block57;
                }
                case 2125814856: {
                    break block57;
                }
            }
            break;
        }
        var3_1 = fr.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fr.nx - fr.haeu("hagi", hafn(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fr.haeu("hagj", haer(int ), (int)19)) break;
            v2 /* !! */  = (long)fr.haeu("hagk", haer(int ), (int)20);
        }
        var2_2 /* !! */  = fr.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = fr.nx - fr.haeu("hagl", hafn(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == fr.haeu("hagm", haer(int ), (int)21)) break;
            v3 /* !! */  = (long)fr.haeu("hagn", haer(int ), (int)22);
        }
        var1_3 = fr.a;
        if (var3_1) {
            throw null;
lbl29:
            // 7 sources

            return;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl29
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = fr.nx - fr.haeu("hago", hafn(int ), (int)17)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == fr.haeu("hagp", haer(int ), (int)23)) break;
                    v4 /* !! */  = (long)fr.haeu("hagq", haer(int ), (int)24);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = fr.nx - fr.haeu("hagr", hafn(int ), (int)18)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == fr.haeu("hags", haer(int ), (int)25)) break;
                    v5 /* !! */  = (long)fr.haeu("hagt", haer(int ), (int)26);
                }
                if (!this.catchMoment.isValue()) ** GOTO lbl167
                if (var1_3 || var1_3) ** GOTO lbl29
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = fr.nx - fr.haeu("hagu", hafn(int ), (int)19)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == fr.haeu("hagv", haer(int ), (int)27)) break;
                    v6 /* !! */  = (long)fr.haeu("hagw", haer(int ), (int)28);
                }
                v7 /* !! */  = fr.nx;
                if (true) ** GOTO lbl56
                block64: while (true) {
                    v7 /* !! */  = (long)(v8 - fr.haeu("hagx", hafn(int ), (int)20));
lbl56:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -2014350176: {
                            v8 = fr.haeu("hagy", hafn(int ), (int)21);
                            continue block64;
                        }
                        case -898514993: {
                            v8 = fr.haeu("hagz", hafn(int ), (int)22);
                            continue block64;
                        }
                        case 395586910: {
                            v8 = fr.haeu("haha", hafn(int ), (int)23);
                            continue block64;
                        }
                        case 2125814856: {
                            break block64;
                        }
                    }
                    break;
                }
                if (fr.mc.field_1724 == null) ** GOTO lbl137
                v9 /* !! */  = fr.nx;
                if (true) ** GOTO lbl73
                block65: while (true) {
                    v9 /* !! */  = (long)(fr.haeu("hahc", hafn(int ), (int)25) - fr.haeu("hahb", hafn(int ), (int)24));
lbl73:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1384180699: {
                            continue block65;
                        }
                        case 2125814856: {
                            break block65;
                        }
                    }
                    break;
                }
                v10 /* !! */  = fr.nx;
                if (true) ** GOTO lbl82
                block66: while (true) {
                    v10 /* !! */  = (long)(v11 - fr.haeu("hahd", hafn(int ), (int)26));
lbl82:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1729922004: {
                            v11 = fr.haeu("hahe", hafn(int ), (int)27);
                            continue block66;
                        }
                        case 639091794: {
                            v11 = fr.haeu("hahf", hafn(int ), (int)28);
                            continue block66;
                        }
                        case 1455606401: {
                            v11 = fr.haeu("hahg", hafn(int ), (int)29);
                            continue block66;
                        }
                        case 2125814856: {
                            break block66;
                        }
                    }
                    break;
                }
                v12 = fr.mc.field_1724;
                v13 /* !! */  = fr.nx;
                if (true) ** GOTO lbl99
                block67: while (true) {
                    v13 /* !! */  = (long)(fr.haeu("hahi", hafn(int ), (int)31) - fr.haeu("hahh", hafn(int ), (int)30));
lbl99:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -746058602: {
                            continue block67;
                        }
                        case 2125814856: {
                            break block67;
                        }
                    }
                    break;
                }
                if (v12.method_24828()) ** GOTO lbl137
                v14 /* !! */  = fr.nx;
                if (true) ** GOTO lbl109
                block68: while (true) {
                    v14 /* !! */  = (long)(fr.haeu("hahk", hafn(int ), (int)33) - fr.haeu("hahj", hafn(int ), (int)32));
lbl109:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -510913905: {
                            continue block68;
                        }
                        case 2125814856: {
                            break block68;
                        }
                    }
                    break;
                }
                v15 /* !! */  = fr.nx;
                if (true) ** GOTO lbl118
                block69: while (true) {
                    v15 /* !! */  = (long)(v16 - fr.haeu("hahl", hafn(int ), (int)34));
lbl118:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1742202921: {
                            v16 = fr.haeu("hahm", hafn(int ), (int)35);
                            continue block69;
                        }
                        case 1417270490: {
                            v16 = fr.haeu("hahn", hafn(int ), (int)36);
                            continue block69;
                        }
                        case 2125814856: {
                            break block69;
                        }
                    }
                    break;
                }
                v17 = fr.mc.field_1724;
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_5 = fr.nx - fr.haeu("haho", hafn(int ), (int)37)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == fr.haeu("hahp", haer(int ), (int)29)) break;
                    v18 /* !! */  = (long)fr.haeu("hahq", haer(int ), (int)30);
                }
                v19 /* !! */  = (CallSite)v17.method_23318();
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl138
lbl137:
                // 2 sources

                v19 /* !! */  = fr.haeu("hahr", hafb(int ), (int)38);
lbl138:
                // 2 sources

                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_6 = fr.nx - fr.haeu("hahs", hafn(int ), (int)39)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == fr.haeu("haht", haer(int ), (int)31)) break;
                    v20 /* !! */  = (long)fr.haeu("hahu", haer(int ), (int)32);
                }
                this.peakY = (double)v19 /* !! */ ;
                if (var1_3 || var1_3) ** GOTO lbl29
                v21 = fr.haeu("hahv", haer(int ), (int)33);
                v22 /* !! */  = fr.nx;
                if (true) ** GOTO lbl150
                block72: while (true) {
                    v22 /* !! */  = (long)(v23 - fr.haeu("hahw", hafn(int ), (int)40));
lbl150:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case 413738949: {
                            v23 = fr.haeu("hahx", hafn(int ), (int)41);
                            continue block72;
                        }
                        case 1076989412: {
                            v23 = fr.haeu("hahy", hafn(int ), (int)42);
                            continue block72;
                        }
                        case 1721130027: {
                            v23 = fr.haeu("hahz", hafn(int ), (int)43);
                            continue block72;
                        }
                        case 2125814856: {
                            break block72;
                        }
                    }
                    break;
                }
                this.frozen = v21;
                if (var1_3) ** GOTO lbl29
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl176
lbl167:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl29
                v24 = fr.haeu("haia", haer(int ), (int)34);
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_7 = fr.nx - fr.haeu("haib", hafn(int ), (int)44)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == fr.haeu("haic", haer(int ), (int)35)) break;
                    v25 /* !! */  = (long)fr.haeu("haid", haer(int ), (int)36);
                }
                this.frozen = v24;
                if (var1_3) ** GOTO lbl29
lbl176:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)fr.haeu("haie", haer(int ), (int)37);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl184:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)fr.haeu("haif", haer(int ), (int)38);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl199
            }
lbl189:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)fr.haeu("haig", haer(int ), (int)39);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl240
            }
            case 3: {
                var2_2 /* !! */  = (int)fr.haeu("haih", haer(int ), (int)40);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl199:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)fr.haeu("haii", haer(int ), (int)41);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl236
            }
            case 5: {
                var2_2 /* !! */  = (int)fr.haeu("haij", haer(int ), (int)42);
                if (!var3_1) ** GOTO lbl189
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)fr.haeu("haik", haer(int ), (int)43);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl213:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)fr.haeu("hail", haer(int ), (int)44);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl231
            }
            case 8: {
                var2_2 /* !! */  = (int)fr.haeu("haim", haer(int ), (int)45);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl223:
            // 4 sources

            case 9: {
                var2_2 /* !! */  = (int)fr.haeu("hain", haer(int ), (int)46);
                if (!var3_1) ** GOTO lbl199
                throw null;
            }
lbl227:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)fr.haeu("haio", haer(int ), (int)47);
                if (!var3_1) ** GOTO lbl223
                throw null;
            }
lbl231:
            // 3 sources

            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fr.haeu("haip", haer(int ), (int)48);
                    if (!var3_1) ** GOTO lbl184
                    throw null;
                }
            }
lbl236:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)fr.haeu("haiq", haer(int ), (int)49);
                if (!var3_1) ** GOTO lbl223
                throw null;
            }
lbl240:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)fr.haeu("hair", haer(int ), (int)50);
                if (!var3_1) break;
                throw null;
            }
            case 14: 
        }
        var2_2 /* !! */  = (int)fr.haeu("hais", haer(int ), (int)51);
        ** while (!var3_1)
lbl247:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hass() {
        fr.hafc[100] = -4834487870871804258L;
        fr.hafc[101] = 2881256913226777981L;
        fr.hafc[102] = -3097260256514665982L;
        fr.hafc[103] = 6348220180612359774L;
        fr.hafc[104] = -2710201116280634983L;
        fr.hafc[105] = 5682496858074397567L;
        fr.hafc[106] = -140107084513074582L;
        fr.hafc[107] = 1206251005550739850L;
        fr.hafc[108] = -5601007530538090463L;
        fr.hafc[109] = -4234022981979868543L;
        fr.hafc[110] = -8002081291838325426L;
        fr.hafc[111] = -3144904195787918308L;
        fr.hafc[112] = 3665810346643672436L;
        fr.hafc[113] = -6411446635723048574L;
        fr.hafc[114] = 7958869620343721181L;
        fr.hafc[115] = 1758515708547111681L;
        fr.hafc[116] = 4080630243548192278L;
        fr.hafc[117] = -5827440383433270477L;
        fr.hafc[118] = 4915200024342309601L;
        fr.hafc[119] = 5086488654573474541L;
        fr.hafc[120] = 4574724941920646669L;
        fr.hafc[121] = -4498069383183299740L;
        fr.hafc[122] = 7000326551203597025L;
        fr.hafc[123] = 2765460162225278268L;
        fr.hafc[124] = -8513147999277873991L;
    }

    private static /* synthetic */ float haew(int n2) {
        return Float.intBitsToFloat(haes[n2] ^ haet[n2]);
    }

    private static /* synthetic */ long hafn(int n2) {
        return hafc[n2] ^ hafd[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static fr getInstance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fr.nx - fr.haeu("hafo", hafn(int ), (int)1)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fr.haeu("hafp", haer(int ), (int)13)) break;
            v0 /* !! */  = (long)fr.haeu("hafq", haer(int ), (int)14);
        }
        var2 = fr.c;
        v1 /* !! */  = fr.nx;
        if (true) ** GOTO lbl12
        block23: while (true) {
            v1 /* !! */  = (long)(v2 - fr.haeu("hafr", hafn(int ), (int)2));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1877628397: {
                    v2 = fr.haeu("hafs", hafn(int ), (int)3);
                    continue block23;
                }
                case -814836177: {
                    v2 = fr.haeu("haft", hafn(int ), (int)4);
                    continue block23;
                }
                case -51179880: {
                    v2 = fr.haeu("hafu", hafn(int ), (int)5);
                    continue block23;
                }
                case 2125814856: {
                    break block23;
                }
            }
            break;
        }
        var1_1 /* !! */  = fr.b;
        v3 /* !! */  = fr.nx;
        if (true) ** GOTO lbl29
        block24: while (true) {
            v3 /* !! */  = (long)(v4 - fr.haeu("hafv", hafn(int ), (int)6));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1533241014: {
                    v4 = fr.haeu("hafw", hafn(int ), (int)7);
                    continue block24;
                }
                case 729050828: {
                    v4 = fr.haeu("hafx", hafn(int ), (int)8);
                    continue block24;
                }
                case 1066718097: {
                    v4 = fr.haeu("hafy", hafn(int ), (int)9);
                    continue block24;
                }
                case 2125814856: {
                    break block24;
                }
            }
            break;
        }
        var0_2 = fr.a;
        if (!var2) ** GOTO lbl48
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl48:
                // 1 sources

                if (var0_2 || var0_2) continue block25;
                v5 /* !! */  = fr.nx;
                if (true) ** GOTO lbl53
                block26: while (true) {
                    v5 /* !! */  = (long)(fr.haeu("haga", hafn(int ), (int)11) - fr.haeu("hafz", hafn(int ), (int)10));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 1759532783: {
                            continue block26;
                        }
                        case 2125814856: {
                            break block26;
                        }
                    }
                    break;
                }
                return nj.get(fr.class);
lbl59:
                // 2 sources

                case 0: {
                    var1_1 /* !! */  = (int)fr.haeu("hagb", haer(int ), (int)15);
                    if (var2) {
                        throw null;
                    }
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 /* !! */  = (int)fr.haeu("hagc", haer(int ), (int)16);
                        if (!var2) ** GOTO lbl59
                        throw null;
                    }
                }
                case 2: {
                    do {
                        var1_1 /* !! */  = (int)fr.haeu("hagd", haer(int ), (int)17);
                    } while (!var2);
                    throw null;
                }
                case 3: 
            }
        }
        var1_1 /* !! */  = (int)fr.haeu("hage", haer(int ), (int)18);
        ** while (!var2)
lbl76:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPacket(cr var1_1) {
        v0 /* !! */  = fr.nx;
        if (true) ** GOTO lbl5
        block33: while (true) {
            v0 /* !! */  = (long)(fr.haeu("haqb", hafn(int ), (int)104) - fr.haeu("haqa", hafn(int ), (int)103));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1376997726: {
                    continue block33;
                }
                case 2125814856: {
                    break block33;
                }
            }
            break;
        }
        var4_2 = fr.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = fr.nx - fr.haeu("haqc", hafn(int ), (int)105)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fr.haeu("haqd", haer(int ), (int)183)) break;
            v1 /* !! */  = (long)fr.haeu("haqe", haer(int ), (int)184);
        }
        var3_3 /* !! */  = fr.b;
        v2 /* !! */  = fr.nx;
        if (true) ** GOTO lbl21
        block35: while (true) {
            v2 /* !! */  = (long)(fr.haeu("haqg", hafn(int ), (int)107) - fr.haeu("haqf", hafn(int ), (int)106));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1792482011: {
                    continue block35;
                }
                case 2125814856: {
                    break block35;
                }
            }
            break;
        }
        var2_4 = fr.a;
        if (var4_2) {
            throw null;
lbl29:
            // 9 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl29
        v3 /* !! */  = fr.nx;
        if (true) ** GOTO lbl36
        block37: while (true) {
            v3 /* !! */  = (long)(v4 - fr.haeu("haqh", hafn(int ), (int)108));
lbl36:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -707972865: {
                    v4 = fr.haeu("haqi", hafn(int ), (int)109);
                    continue block37;
                }
                case 919015925: {
                    v4 = fr.haeu("haqj", hafn(int ), (int)110);
                    continue block37;
                }
                case 1040490878: {
                    v4 = fr.haeu("haqk", hafn(int ), (int)111);
                    continue block37;
                }
                case 2125814856: {
                    break block37;
                }
            }
            break;
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = fr.nx - fr.haeu("haql", hafn(int ), (int)112)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == fr.haeu("haqm", haer(int ), (int)185)) break;
            v5 /* !! */  = (long)fr.haeu("haqn", haer(int ), (int)186);
        }
        if (fr.mc.field_1724 == null) ** GOTO lbl72
        if (var2_4) ** GOTO lbl29
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = fr.nx - fr.haeu("haqo", hafn(int ), (int)113)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == fr.haeu("haqp", haer(int ), (int)187)) break;
            v6 /* !! */  = (long)fr.haeu("haqq", haer(int ), (int)188);
        }
        if (!this.frozen) ** GOTO lbl72
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl29
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = fr.nx - fr.haeu("haqr", hafn(int ), (int)114)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == fr.haeu("haqs", haer(int ), (int)189)) break;
                    v7 /* !! */  = (long)fr.haeu("haqt", haer(int ), (int)190);
                }
                if (var1_1.isSend()) ** GOTO lbl74
                if (var2_4) ** GOTO lbl29
lbl72:
                // 3 sources

                if (var2_4 || var2_4) ** GOTO lbl29
                return;
lbl74:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl29
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = fr.nx - fr.haeu("haqu", hafn(int ), (int)115)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == fr.haeu("haqv", haer(int ), (int)191)) break;
                    v8 /* !! */  = (long)fr.haeu("haqw", haer(int ), (int)192);
                }
                if (!(var1_1.getPacket() instanceof class_2828)) ** GOTO lbl90
                if (var2_4 || var2_4) ** GOTO lbl29
                v9 = fr.haeu("haqx", haer(int ), (int)193);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = fr.nx - fr.haeu("haqy", hafn(int ), (int)116)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == fr.haeu("haqz", haer(int ), (int)194)) break;
                    v10 /* !! */  = (long)fr.haeu("hara", haer(int ), (int)195);
                }
                var1_1.setCancelled((boolean)v9);
                if (var2_4) ** GOTO lbl29
lbl90:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)fr.haeu("harb", haer(int ), (int)196);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl118
            }
lbl98:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)fr.haeu("harc", haer(int ), (int)197);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl108
            }
lbl103:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)fr.haeu("hard", haer(int ), (int)198);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl108:
            // 3 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)fr.haeu("hare", haer(int ), (int)199);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl163
                    break;
                }
            }
lbl114:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)fr.haeu("harf", haer(int ), (int)200);
                if (!var4_2) ** GOTO lbl98
                throw null;
            }
lbl118:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)fr.haeu("harg", haer(int ), (int)201);
                if (!var4_2) ** GOTO lbl108
                throw null;
            }
lbl122:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)fr.haeu("harh", haer(int ), (int)202);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl132
            }
            case 7: {
                var3_3 /* !! */  = (int)fr.haeu("hari", haer(int ), (int)203);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl132:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)fr.haeu("harj", haer(int ), (int)204);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 9: {
                var3_3 /* !! */  = (int)fr.haeu("hark", haer(int ), (int)205);
                if (!var4_2) ** GOTO lbl122
                throw null;
            }
            case 10: {
                var3_3 /* !! */  = (int)fr.haeu("harl", haer(int ), (int)206);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 11: {
                var3_3 /* !! */  = (int)fr.haeu("harm", haer(int ), (int)207);
                if (!var4_2) ** GOTO lbl114
                throw null;
            }
            case 12: {
                var3_3 /* !! */  = (int)fr.haeu("harn", haer(int ), (int)208);
                if (!var4_2) ** GOTO lbl122
                throw null;
            }
lbl154:
            // 2 sources

            case 13: {
                do {
                    var3_3 /* !! */  = (int)fr.haeu("haro", haer(int ), (int)209);
                } while (!var4_2);
                throw null;
            }
lbl159:
            // 2 sources

            case 14: {
                var3_3 /* !! */  = (int)fr.haeu("harp", haer(int ), (int)210);
                if (!var4_2) break;
                throw null;
            }
lbl163:
            // 4 sources

            case 15: {
                var3_3 /* !! */  = (int)fr.haeu("harq", haer(int ), (int)211);
                if (!var4_2) ** GOTO lbl103
                throw null;
            }
            case 16: 
        }
        var3_3 /* !! */  = (int)fr.haeu("harr", haer(int ), (int)212);
        ** while (!var4_2)
lbl170:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        v0 /* !! */  = fr.nx;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(fr.haeu("haiu", hafn(int ), (int)46) - fr.haeu("hait", hafn(int ), (int)45));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 609018564: {
                    continue block19;
                }
                case 2125814856: {
                    break block19;
                }
            }
            break;
        }
        var3_1 = fr.c;
        v1 /* !! */  = fr.nx;
        if (true) ** GOTO lbl15
        block20: while (true) {
            v1 /* !! */  = (long)(v2 - fr.haeu("haiv", hafn(int ), (int)47));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1709340919: {
                    v2 = fr.haeu("haiw", hafn(int ), (int)48);
                    continue block20;
                }
                case -116735962: {
                    v2 = fr.haeu("haix", hafn(int ), (int)49);
                    continue block20;
                }
                case 2125814856: {
                    break block20;
                }
            }
            break;
        }
        var2_2 /* !! */  = fr.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = fr.nx - fr.haeu("haiy", hafn(int ), (int)50)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == fr.haeu("haiz", haer(int ), (int)52)) break;
            v3 /* !! */  = (long)fr.haeu("haja", haer(int ), (int)53);
        }
        var1_3 = fr.a;
        if (var3_1) {
            throw null;
lbl33:
            // 4 sources

            return;
        }
        if (var1_3) ** GOTO lbl33
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl33
                v4 = fr.haeu("hajb", haer(int ), (int)54);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = fr.nx - fr.haeu("hajc", hafn(int ), (int)51)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == fr.haeu("hajd", haer(int ), (int)55)) break;
                    v5 /* !! */  = (long)fr.haeu("haje", haer(int ), (int)56);
                }
                this.frozen = v4;
                if (var1_3 || var1_3) ** GOTO lbl33
                v6 = fr.haeu("hajf", hafb(int ), (int)52);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = fr.nx - fr.haeu("hajg", hafn(int ), (int)53)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == fr.haeu("hajh", haer(int ), (int)57)) break;
                    v7 /* !! */  = (long)fr.haeu("haji", haer(int ), (int)58);
                }
                this.peakY = (double)v6;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl58:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)fr.haeu("hajj", haer(int ), (int)59);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl86
            }
            case 1: {
                var2_2 /* !! */  = (int)fr.haeu("hajk", haer(int ), (int)60);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl86
            }
            case 2: {
                var2_2 /* !! */  = (int)fr.haeu("hajl", haer(int ), (int)61);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl86
            }
lbl73:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)fr.haeu("hajm", haer(int ), (int)62);
                if (!var3_1) ** GOTO lbl58
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)fr.haeu("hajn", haer(int ), (int)63);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl86
            }
            case 5: {
                var2_2 /* !! */  = (int)fr.haeu("hajo", haer(int ), (int)64);
                if (!var3_1) ** GOTO lbl73
                throw null;
            }
lbl86:
            // 5 sources

            case 6: {
                do {
                    var2_2 /* !! */  = (int)fr.haeu("hajp", haer(int ), (int)65);
                } while (!var3_1);
                throw null;
            }
            case 7: 
        }
        do {
            var2_2 /* !! */  = (int)fr.haeu("hajq", haer(int ), (int)66);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        var6_2 = fr.c;
        var5_3 /* !! */  = fr.b;
        var4_4 = fr.a;
        if (var6_2) {
            throw null;
lbl6:
            // 22 sources

            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl6
        if (fr.mc.field_1724 != null) ** GOTO lbl15
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
            }
lbl15:
            // 1 sources

            if (var4_4 || var4_4) ** GOTO lbl6
            if (!this.catchMoment.isValue()) ** GOTO lbl52
            if (var4_4 || var4_4) ** GOTO lbl6
            var2_5 = fr.mc.field_1724.method_23318();
            if (var4_4 || var4_4) ** GOTO lbl6
            if (!fr.mc.field_1724.method_24828()) ** GOTO lbl29
            if (var4_4 || var4_4) ** GOTO lbl6
            this.peakY = (double)fr.haeu("hamh", hafb(int ), (int)82);
            if (var4_4 || var4_4) ** GOTO lbl6
            this.frozen = fr.haeu("hami", haer(int ), (int)107);
            if (var4_4) ** GOTO lbl6
            if (var6_2) {
                throw null;
            }
            ** GOTO lbl52
lbl29:
            // 1 sources

            if (var4_4 || var4_4) ** GOTO lbl6
            if (this.frozen) ** GOTO lbl52
            if (var4_4 || var4_4) ** GOTO lbl6
            if (!Double.isNaN(this.peakY)) ** GOTO lbl39
            if (var4_4 || var4_4) ** GOTO lbl6
            this.peakY = var2_5;
            if (var4_4) ** GOTO lbl6
            if (var6_2) {
                throw null;
            }
            ** GOTO lbl52
lbl39:
            // 1 sources

            if (var4_4 || var4_4) ** GOTO lbl6
            if (!(var2_5 > this.peakY)) ** GOTO lbl47
            if (var4_4 || var4_4) ** GOTO lbl6
            this.peakY = var2_5;
            if (var4_4) ** GOTO lbl6
            if (var6_2) {
                throw null;
            }
            ** GOTO lbl52
lbl47:
            // 1 sources

            if (var4_4 || var4_4) ** GOTO lbl6
            if (!(var2_5 < this.peakY)) ** GOTO lbl52
            if (var4_4 || var4_4) ** GOTO lbl6
            this.frozen = fr.haeu("hamj", haer(int ), (int)108);
            if (var4_4) ** GOTO lbl6
lbl52:
            // 7 sources

            if (var4_4 || var4_4) ** GOTO lbl6
            if (!this.frozen) ** GOTO lbl57
            if (var4_4 || var4_4) ** GOTO lbl6
            fr.mc.field_1724.method_18799(class_243.field_1353);
            if (var4_4) ** GOTO lbl6
lbl57:
            // 2 sources

            if (!var4_4 && !var4_4) ** break;
            ** continue;
            return;
            case 0: {
                var5_3 /* !! */  = (int)fr.haeu("hamk", haer(int ), (int)109);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl110
            }
lbl65:
            // 4 sources

            case 1: {
                var5_3 /* !! */  = (int)fr.haeu("haml", haer(int ), (int)110);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl119
            }
lbl70:
            // 3 sources

            case 2: {
                var5_3 /* !! */  = (int)fr.haeu("hamm", haer(int ), (int)111);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl110
            }
            case 3: {
                var5_3 /* !! */  = (int)fr.haeu("hamn", haer(int ), (int)112);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl167
            }
            case 4: {
                var5_3 /* !! */  = (int)fr.haeu("hamo", haer(int ), (int)113);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl105
            }
lbl85:
            // 4 sources

            case 5: {
                var5_3 /* !! */  = (int)fr.haeu("hamp", haer(int ), (int)114);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 6: {
                var5_3 /* !! */  = (int)fr.haeu("hamq", haer(int ), (int)115);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl128
            }
            case 7: {
                var5_3 /* !! */  = (int)fr.haeu("hamr", haer(int ), (int)116);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl194
            }
lbl100:
            // 2 sources

            case 8: {
                var5_3 /* !! */  = (int)fr.haeu("hams", haer(int ), (int)117);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl105:
            // 3 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)fr.haeu("hamt", haer(int ), (int)118);
                    if (!var6_2) ** GOTO lbl100
                    throw null;
                }
            }
lbl110:
            // 3 sources

            case 10: {
                var5_3 /* !! */  = (int)fr.haeu("hamu", haer(int ), (int)119);
                if (!var6_2) ** GOTO lbl70
                throw null;
            }
lbl114:
            // 5 sources

            case 11: {
                var5_3 /* !! */  = (int)fr.haeu("hamv", haer(int ), (int)120);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl119:
            // 2 sources

            case 12: {
                var5_3 /* !! */  = (int)fr.haeu("hamw", haer(int ), (int)121);
                if (!var6_2) ** GOTO lbl70
                throw null;
            }
lbl123:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)fr.haeu("hamx", haer(int ), (int)122);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl128:
            // 3 sources

            case 14: {
                var5_3 /* !! */  = (int)fr.haeu("hamy", haer(int ), (int)123);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 15: {
                var5_3 /* !! */  = (int)fr.haeu("hamz", haer(int ), (int)124);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 16: {
                var5_3 /* !! */  = (int)fr.haeu("hana", haer(int ), (int)125);
                if (!var6_2) ** GOTO lbl85
                throw null;
            }
lbl142:
            // 2 sources

            case 17: {
                var5_3 /* !! */  = (int)fr.haeu("hanb", haer(int ), (int)126);
                if (!var6_2) ** GOTO lbl114
                throw null;
            }
            case 18: {
                var5_3 /* !! */  = (int)fr.haeu("hanc", haer(int ), (int)127);
                if (!var6_2) ** GOTO lbl142
                throw null;
            }
            case 19: {
                var5_3 /* !! */  = (int)fr.haeu("hand", haer(int ), (int)128);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl243
            }
lbl155:
            // 5 sources

            case 20: {
                var5_3 /* !! */  = (int)fr.haeu("hane", haer(int ), (int)129);
                if (!var6_2) ** GOTO lbl105
                throw null;
            }
lbl159:
            // 2 sources

            case 21: {
                var5_3 /* !! */  = (int)fr.haeu("hanf", haer(int ), (int)130);
                if (!var6_2) ** GOTO lbl128
                throw null;
            }
lbl163:
            // 3 sources

            case 22: {
                var5_3 /* !! */  = (int)fr.haeu("hang", haer(int ), (int)131);
                if (!var6_2) ** GOTO lbl114
                throw null;
            }
lbl167:
            // 3 sources

            case 23: {
                var5_3 /* !! */  = (int)fr.haeu("hanh", haer(int ), (int)132);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl243
            }
            case 24: {
                var5_3 /* !! */  = (int)fr.haeu("hani", haer(int ), (int)133);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 25: {
                var5_3 /* !! */  = (int)fr.haeu("hanj", haer(int ), (int)134);
                if (!var6_2) ** GOTO lbl65
                throw null;
            }
            case 26: {
                var5_3 /* !! */  = (int)fr.haeu("hank", haer(int ), (int)135);
                if (var6_2) {
                    throw null;
                }
            }
lbl185:
            // 5 sources

            case 27: {
                var5_3 /* !! */  = (int)fr.haeu("hanl", haer(int ), (int)136);
                if (!var6_2) ** GOTO lbl85
                throw null;
            }
lbl189:
            // 2 sources

            case 28: {
                var5_3 /* !! */  = (int)fr.haeu("hanm", haer(int ), (int)137);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl194:
            // 2 sources

            case 29: {
                var5_3 /* !! */  = (int)fr.haeu("hann", haer(int ), (int)138);
                if (!var6_2) ** GOTO lbl85
                throw null;
            }
            case 30: {
                var5_3 /* !! */  = (int)fr.haeu("hano", haer(int ), (int)139);
                if (!var6_2) ** GOTO lbl65
                throw null;
            }
            case 31: {
                var5_3 /* !! */  = (int)fr.haeu("hanp", haer(int ), (int)140);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl243
            }
lbl207:
            // 2 sources

            case 32: {
                var5_3 /* !! */  = (int)fr.haeu("hanq", haer(int ), (int)141);
                if (!var6_2) ** GOTO lbl114
                throw null;
            }
            case 33: {
                var5_3 /* !! */  = (int)fr.haeu("hanr", haer(int ), (int)142);
                if (!var6_2) ** GOTO lbl114
                throw null;
            }
            case 34: {
                var5_3 /* !! */  = (int)fr.haeu("hans", haer(int ), (int)143);
                if (!var6_2) ** GOTO lbl167
                throw null;
            }
lbl219:
            // 2 sources

            case 35: {
                var5_3 /* !! */  = (int)fr.haeu("hant", haer(int ), (int)144);
                if (!var6_2) ** GOTO lbl163
                throw null;
            }
            case 36: {
                var5_3 /* !! */  = (int)fr.haeu("hanu", haer(int ), (int)145);
                if (!var6_2) ** GOTO lbl123
                throw null;
            }
lbl227:
            // 2 sources

            case 37: {
                var5_3 /* !! */  = (int)fr.haeu("hanv", haer(int ), (int)146);
                if (!var6_2) ** GOTO lbl159
                throw null;
            }
            case 38: {
                var5_3 /* !! */  = (int)fr.haeu("hanw", haer(int ), (int)147);
                if (!var6_2) ** GOTO lbl163
                throw null;
            }
            case 39: {
                var5_3 /* !! */  = (int)fr.haeu("hanx", haer(int ), (int)148);
                if (!var6_2) ** GOTO lbl65
                throw null;
            }
            case 40: {
                var5_3 /* !! */  = (int)fr.haeu("hany", haer(int ), (int)149);
                if (!var6_2) ** GOTO lbl185
                throw null;
            }
lbl243:
            // 4 sources

            case 41: {
                var5_3 /* !! */  = (int)fr.haeu("hanz", haer(int ), (int)150);
                if (!var6_2) ** GOTO lbl155
                throw null;
            }
            case 42: 
        }
        var5_3 /* !! */  = (int)fr.haeu("haoa", haer(int ), (int)151);
        ** while (!var6_2)
lbl250:
        // 1 sources

        throw null;
    }
}

