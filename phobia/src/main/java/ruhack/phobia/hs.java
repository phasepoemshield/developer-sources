/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2374
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2708
 *  net.minecraft.class_2743
 *  net.minecraft.class_2828$class_2830
 *  net.minecraft.class_2846
 *  net.minecraft.class_2846$class_2847
 *  net.minecraft.class_6373
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2374;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2708;
import net.minecraft.class_2743;
import net.minecraft.class_2828;
import net.minecraft.class_2846;
import net.minecraft.class_6373;
import ruhack.phobia.aw;
import ruhack.phobia.cr;
import ruhack.phobia.cr$Type;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.kf;
import ruhack.phobia.nj;

public class hs
extends ds {
    private int ccCooldown;
    public static final int b;
    private int grimTicks;
    private static int[] bonf;
    private static final long dq = -8330675675715520461L;
    private boolean flag;
    private final kf mode;
    public static final boolean c;
    private class_243 pendingVelocity;
    private static long[] bomv;
    private static long[] bomu;
    private static int[] bong;
    public static final boolean a;

    private static /* synthetic */ void bqdm() {
        hs.bomv[0] = -8578470409257588484L;
        hs.bomv[1] = -3616339350926538577L;
        hs.bomv[2] = -4083574102239810507L;
        hs.bomv[3] = -15188078750515915L;
        hs.bomv[4] = 1729901303683989847L;
        hs.bomv[5] = -857467951477680535L;
        hs.bomv[6] = 4310485986325899057L;
        hs.bomv[7] = 5308879685853597018L;
        hs.bomv[8] = -2973254277733744136L;
        hs.bomv[9] = 138377875710824804L;
        hs.bomv[10] = 7738079246007621060L;
        hs.bomv[11] = 7185394780681528095L;
        hs.bomv[12] = 5983392733154154545L;
        hs.bomv[13] = -1731216291065137870L;
        hs.bomv[14] = -1203568512204629151L;
        hs.bomv[15] = -1150688552608381499L;
        hs.bomv[16] = 1648917817938566922L;
        hs.bomv[17] = -7650819106217248882L;
        hs.bomv[18] = -8491009408567375167L;
        hs.bomv[19] = 2014496736496704299L;
        hs.bomv[20] = -941089133828624643L;
        hs.bomv[21] = 7151273552247671653L;
        hs.bomv[22] = -4600294670935242419L;
        hs.bomv[23] = 403420237823411424L;
        hs.bomv[24] = -6640066720139663766L;
        hs.bomv[25] = 8136694343937546850L;
        hs.bomv[26] = 9133245383236806104L;
        hs.bomv[27] = -5673528185141103826L;
        hs.bomv[28] = -6758818136137185540L;
        hs.bomv[29] = 1691189695515490295L;
        hs.bomv[30] = 7445841275762199808L;
        hs.bomv[31] = 4120002434003199676L;
        hs.bomv[32] = -5140852721688051640L;
        hs.bomv[33] = 3736159647143398807L;
        hs.bomv[34] = 9193096779627445178L;
        hs.bomv[35] = 3406013823472117478L;
        hs.bomv[36] = 5595466934733578983L;
        hs.bomv[37] = 4340514157219168878L;
        hs.bomv[38] = -8385924005711579869L;
        hs.bomv[39] = 5487387665428776495L;
        hs.bomv[40] = 6712691709737848150L;
        hs.bomv[41] = 8017458493704213388L;
        hs.bomv[42] = 5361032071691827507L;
        hs.bomv[43] = -9030707015328056801L;
        hs.bomv[44] = -7592717797690394066L;
        hs.bomv[45] = -5602401363928133149L;
        hs.bomv[46] = -8853612137010369078L;
        hs.bomv[47] = 5314461430284530274L;
        hs.bomv[48] = 6300057038339489139L;
        hs.bomv[49] = 7891570599688589221L;
        hs.bomv[50] = 3072571063422654737L;
        hs.bomv[51] = -306091280202525459L;
        hs.bomv[52] = 3376327076412953477L;
        hs.bomv[53] = 3601509057810110220L;
        hs.bomv[54] = -391998220301578464L;
        hs.bomv[55] = -1878570636301297680L;
        hs.bomv[56] = 932464846754266456L;
        hs.bomv[57] = 4134073198224224128L;
        hs.bomv[58] = 4017502597731657144L;
        hs.bomv[59] = 5745854637468790186L;
        hs.bomv[60] = -4923312970782726120L;
        hs.bomv[61] = 3582166379423631804L;
        hs.bomv[62] = -2222353095010177522L;
        hs.bomv[63] = 8416622894637642483L;
        hs.bomv[64] = 5471063864263311268L;
        hs.bomv[65] = -3644812919612287407L;
        hs.bomv[66] = -247755692396220598L;
        hs.bomv[67] = -5824154049088885325L;
        hs.bomv[68] = 4219853107691475214L;
        hs.bomv[69] = -880224801323176926L;
        hs.bomv[70] = -386218585198060696L;
        hs.bomv[71] = -7396009538004746980L;
        hs.bomv[72] = 4953942434858860262L;
        hs.bomv[73] = 7881850134338737628L;
        hs.bomv[74] = -8062910369883566171L;
        hs.bomv[75] = -6376664134156387638L;
        hs.bomv[76] = 6705643238765127082L;
        hs.bomv[77] = 1480119799659464135L;
        hs.bomv[78] = 8521550424788525709L;
        hs.bomv[79] = 3298068186192931270L;
        hs.bomv[80] = 736357353055203660L;
        hs.bomv[81] = -6667120597696059197L;
        hs.bomv[82] = -6725739936149539597L;
        hs.bomv[83] = -2906060097634258628L;
        hs.bomv[84] = -5188755461121875233L;
        hs.bomv[85] = -7843386082899000089L;
        hs.bomv[86] = -5588168374421286193L;
        hs.bomv[87] = -5394017171627830881L;
        hs.bomv[88] = 2517866700269226914L;
        hs.bomv[89] = -3237078693588456087L;
        hs.bomv[90] = -652494605165498078L;
        hs.bomv[91] = -5811716335196005833L;
        hs.bomv[92] = -8684057209295954306L;
        hs.bomv[93] = 761281039614418560L;
        hs.bomv[94] = 2858936969298382285L;
        hs.bomv[95] = 2796799168478974200L;
        hs.bomv[96] = -8427338258993984400L;
        hs.bomv[97] = 7049954793455227831L;
        hs.bomv[98] = -4480376224922463461L;
        hs.bomv[99] = 4522157230987033900L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleAdditionalPackets(cr var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hs.dq - hs.bomw("bosk", bomt(int ), (int)13)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hs.bomw("bosl", bone(int ), (int)126)) break;
            v0 /* !! */  = (long)hs.bomw("bosm", bone(int ), (int)127);
        }
        var4_2 = hs.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hs.dq - hs.bomw("bosn", bomt(int ), (int)14)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == hs.bomw("boso", bone(int ), (int)128)) break;
            v1 /* !! */  = (long)hs.bomw("bosp", bone(int ), (int)129);
        }
        var3_3 /* !! */  = hs.b;
        v2 /* !! */  = hs.dq;
        if (true) ** GOTO lbl17
        block48: while (true) {
            v2 /* !! */  = (long)(v3 - hs.bomw("bosq", bomt(int ), (int)15));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -477406061: {
                    v3 = hs.bomw("bosr", bomt(int ), (int)16);
                    continue block48;
                }
                case 456855278: {
                    v3 = hs.bomw("boss", bomt(int ), (int)17);
                    continue block48;
                }
                case 1509767219: {
                    break block48;
                }
                case 1623027947: {
                    v3 = hs.bomw("bost", bomt(int ), (int)18);
                    continue block48;
                }
            }
            break;
        }
        var2_4 = hs.a;
        if (var4_2) {
            throw null;
lbl32:
            // 11 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = hs.dq - hs.bomw("bosu", bomt(int ), (int)19)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == hs.bomw("bosv", bone(int ), (int)130)) break;
            v4 /* !! */  = (long)hs.bomw("bosw", bone(int ), (int)131);
        }
        v5 /* !! */  = hs.dq;
        if (true) ** GOTO lbl44
        block51: while (true) {
            v5 /* !! */  = (long)(v6 - hs.bomw("bosx", bomt(int ), (int)20));
lbl44:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -2141308773: {
                    v6 = hs.bomw("bosy", bomt(int ), (int)21);
                    continue block51;
                }
                case -1240585730: {
                    v6 = hs.bomw("bosz", bomt(int ), (int)22);
                    continue block51;
                }
                case 1509767219: {
                    break block51;
                }
            }
            break;
        }
        if (!this.mode.isSelected("OldGrim")) ** GOTO lbl108
        if (var2_4) ** GOTO lbl32
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = hs.dq - hs.bomw("bota", bomt(int ), (int)23)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == hs.bomw("botb", bone(int ), (int)132)) break;
            v7 /* !! */  = (long)hs.bomw("botc", bone(int ), (int)133);
        }
        if (!(var1_1.getPacket() instanceof class_6373)) ** GOTO lbl108
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl32
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = hs.dq - hs.bomw("botd", bomt(int ), (int)24)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == hs.bomw("bote", bone(int ), (int)134)) break;
                    v8 /* !! */  = (long)hs.bomw("botf", bone(int ), (int)135);
                }
                if (this.grimTicks <= 0) ** GOTO lbl108
                if (var2_4 || var2_4) ** GOTO lbl32
                v9 = hs.bomw("botg", bone(int ), (int)136);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = hs.dq - hs.bomw("both", bomt(int ), (int)25)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == hs.bomw("boti", bone(int ), (int)137)) break;
                    v10 /* !! */  = (long)hs.bomw("botj", bone(int ), (int)138);
                }
                var1_1.setCancelled((boolean)v9);
                if (var2_4 || var2_4) ** GOTO lbl32
                v11 /* !! */  = hs.dq;
                if (true) ** GOTO lbl84
                block55: while (true) {
                    v11 /* !! */  = (long)(v12 - hs.bomw("botk", bomt(int ), (int)26));
lbl84:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1755583401: {
                            v12 = hs.bomw("botl", bomt(int ), (int)27);
                            continue block55;
                        }
                        case 112944312: {
                            v12 = hs.bomw("botm", bomt(int ), (int)28);
                            continue block55;
                        }
                        case 706988963: {
                            v12 = hs.bomw("botn", bomt(int ), (int)29);
                            continue block55;
                        }
                        case 1509767219: {
                            break block55;
                        }
                    }
                    break;
                }
                v13 = this.grimTicks - hs.bomw("boto", bone(int ), (int)139);
                v14 /* !! */  = hs.dq;
                if (true) ** GOTO lbl101
                block56: while (true) {
                    v14 /* !! */  = (long)(hs.bomw("botq", bomt(int ), (int)31) - hs.bomw("botp", bomt(int ), (int)30));
lbl101:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case 1362816336: {
                            continue block56;
                        }
                        case 1509767219: {
                            break block56;
                        }
                    }
                    break;
                }
                this.grimTicks = v13;
                if (var2_4) ** GOTO lbl32
lbl108:
                // 4 sources

                if (var2_4 || var2_4) ** GOTO lbl32
                v15 /* !! */  = hs.dq;
                if (true) ** GOTO lbl113
                block57: while (true) {
                    v15 /* !! */  = (long)(hs.bomw("bots", bomt(int ), (int)33) - hs.bomw("botr", bomt(int ), (int)32));
lbl113:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case 980238547: {
                            continue block57;
                        }
                        case 1509767219: {
                            break block57;
                        }
                    }
                    break;
                }
                if (!(var1_1.getPacket() instanceof class_2708)) ** GOTO lbl140
                if (var2_4) ** GOTO lbl32
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_6 = hs.dq - hs.bomw("bott", bomt(int ), (int)34)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == hs.bomw("botu", bone(int ), (int)140)) break;
                    v16 /* !! */  = (long)hs.bomw("botv", bone(int ), (int)141);
                }
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_7 = hs.dq - hs.bomw("botw", bomt(int ), (int)35)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == hs.bomw("botx", bone(int ), (int)142)) break;
                    v17 /* !! */  = (long)hs.bomw("boty", bone(int ), (int)143);
                }
                if (!this.mode.isSelected("NewGrim")) ** GOTO lbl140
                if (var2_4 || var2_4) ** GOTO lbl32
                v18 = hs.bomw("botz", bone(int ), (int)144);
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_8 = hs.dq - hs.bomw("boua", bomt(int ), (int)36)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == hs.bomw("boub", bone(int ), (int)145)) break;
                    v19 /* !! */  = (long)hs.bomw("bouc", bone(int ), (int)146);
                }
                this.ccCooldown = (int)v18;
                if (var2_4) ** GOTO lbl32
lbl140:
                // 3 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl143:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)hs.bomw("boud", bone(int ), (int)147);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl220
            }
            case 1: {
                var3_3 /* !! */  = (int)hs.bomw("boue", bone(int ), (int)148);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl153:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)hs.bomw("bouf", bone(int ), (int)149);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 3: {
                var3_3 /* !! */  = (int)hs.bomw("boug", bone(int ), (int)150);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl163:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)hs.bomw("bouh", bone(int ), (int)151);
                if (!var4_2) break;
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)hs.bomw("boui", bone(int ), (int)152);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl172:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)hs.bomw("bouj", bone(int ), (int)153);
                if (var4_2) {
                    throw null;
                }
            }
            case 7: {
                var3_3 /* !! */  = (int)hs.bomw("bouk", bone(int ), (int)154);
                if (!var4_2) ** GOTO lbl143
                throw null;
            }
lbl180:
            // 3 sources

            case 8: {
                var3_3 /* !! */  = (int)hs.bomw("boul", bone(int ), (int)155);
                if (!var4_2) ** GOTO lbl143
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)hs.bomw("boum", bone(int ), (int)156);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl216
            }
            case 10: {
                var3_3 /* !! */  = (int)hs.bomw("boun", bone(int ), (int)157);
                if (!var4_2) ** GOTO lbl163
                throw null;
            }
            case 11: {
                var3_3 /* !! */  = (int)hs.bomw("bouo", bone(int ), (int)158);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl216
            }
            case 12: {
                var3_3 /* !! */  = (int)hs.bomw("boup", bone(int ), (int)159);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl203:
            // 2 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hs.bomw("bouq", bone(int ), (int)160);
                    if (!var4_2) ** GOTO lbl180
                    throw null;
                }
            }
lbl208:
            // 2 sources

            case 14: {
                var3_3 /* !! */  = (int)hs.bomw("bour", bone(int ), (int)161);
                if (!var4_2) ** GOTO lbl153
                throw null;
            }
            case 15: {
                var3_3 /* !! */  = (int)hs.bomw("bous", bone(int ), (int)162);
                if (!var4_2) ** GOTO lbl180
                throw null;
            }
lbl216:
            // 6 sources

            case 16: {
                var3_3 /* !! */  = (int)hs.bomw("bout", bone(int ), (int)163);
                if (!var4_2) ** GOTO lbl208
                throw null;
            }
lbl220:
            // 3 sources

            case 17: {
                var3_3 /* !! */  = (int)hs.bomw("bouu", bone(int ), (int)164);
                if (!var4_2) ** GOTO lbl203
                throw null;
            }
            case 18: 
        }
        var3_3 /* !! */  = (int)hs.bomw("bouv", bone(int ), (int)165);
        ** while (!var4_2)
lbl227:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static hs getInstance() {
        v0 /* !! */  = hs.dq;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - hs.bomw("bomx", bomt(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2016032475: {
                    v1 = hs.bomw("bomy", bomt(int ), (int)1);
                    continue block22;
                }
                case 274896382: {
                    v1 = hs.bomw("bomz", bomt(int ), (int)2);
                    continue block22;
                }
                case 1509767219: {
                    break block22;
                }
                case 1602947623: {
                    v1 = hs.bomw("bona", bomt(int ), (int)3);
                    continue block22;
                }
            }
            break;
        }
        var2 = hs.c;
        v2 /* !! */  = hs.dq;
        if (true) ** GOTO lbl22
        block23: while (true) {
            v2 /* !! */  = (long)(hs.bomw("bonc", bomt(int ), (int)5) - hs.bomw("bonb", bomt(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 919126691: {
                    continue block23;
                }
                case 1509767219: {
                    break block23;
                }
            }
            break;
        }
        var1_1 /* !! */  = hs.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = hs.dq - hs.bomw("bond", bomt(int ), (int)6)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hs.bomw("bonh", bone(int ), (int)0)) break;
            v3 /* !! */  = (long)hs.bomw("boni", bone(int ), (int)1);
        }
        var0_2 = hs.a;
        if (var2) {
            throw null;
lbl37:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl37
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                v4 /* !! */  = hs.dq;
                if (true) ** GOTO lbl48
                block26: while (true) {
                    v4 /* !! */  = (long)(v5 - hs.bomw("bonj", bomt(int ), (int)7));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1357799423: {
                            v5 = hs.bomw("bonk", bomt(int ), (int)8);
                            continue block26;
                        }
                        case -1328401721: {
                            v5 = hs.bomw("bonl", bomt(int ), (int)9);
                            continue block26;
                        }
                        case 565154086: {
                            v5 = hs.bomw("bonm", bomt(int ), (int)10);
                            continue block26;
                        }
                        case 1509767219: {
                            break block26;
                        }
                    }
                    break;
                }
                return nj.get(hs.class);
            }
            case 0: {
                var1_1 /* !! */  = (int)hs.bomw("bonn", bone(int ), (int)2);
                if (!var2) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)hs.bomw("bono", bone(int ), (int)3);
                    if (!var2) break block10;
                    throw null;
                }
            }
            case 2: {
                do {
                    var1_1 /* !! */  = (int)hs.bomw("bonp", bone(int ), (int)4);
                } while (!var2);
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)hs.bomw("bonq", bone(int ), (int)5);
        ** while (!var2)
lbl78:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void handleNewGrimTick() {
        v0 /* !! */  = hs.dq;
        if (true) ** GOTO lbl5
        block107: while (true) {
            v0 /* !! */  = (long)(v1 - hs.bomw("bpfu", bomt(int ), (int)199));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 421008776: {
                    v1 = hs.bomw("bpfv", bomt(int ), (int)200);
                    continue block107;
                }
                case 1009265226: {
                    v1 = hs.bomw("bpfw", bomt(int ), (int)201);
                    continue block107;
                }
                case 1509767219: {
                    break block107;
                }
                case 2014486031: {
                    v1 = hs.bomw("bpfx", bomt(int ), (int)202);
                    continue block107;
                }
            }
            break;
        }
        var3_1 = hs.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = hs.dq - hs.bomw("bpfy", bomt(int ), (int)203)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hs.bomw("bpfz", bone(int ), (int)287)) break;
            v2 /* !! */  = (long)hs.bomw("bpga", bone(int ), (int)288);
        }
        var2_2 /* !! */  = hs.b;
        v3 /* !! */  = hs.dq;
        block109: while (true) {
            switch ((int)v3 /* !! */ ) {
                case 1509767219: {
                    break block109;
                }
                case 2048732501: {
                    v3 /* !! */  = (long)(hs.bomw("bpgc", bomt(int ), (int)205) - hs.bomw("bpgb", bomt(int ), (int)204));
                    continue block109;
                }
            }
            break;
        }
        var1_3 = hs.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block110: while (true) {
            block168: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var3_1) {
                            throw null;
                        }
                        if (var1_3 || var1_3) return;
                        v4 /* !! */  = hs.dq;
                        block111: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -2091574286: {
                                    v5 = hs.bomw("bpge", bomt(int ), (int)207);
                                    ** GOTO lbl52
                                }
                                case -662260912: {
                                    v5 = hs.bomw("bpgf", bomt(int ), (int)208);
                                    ** GOTO lbl52
                                }
                                case -273785108: {
                                    v5 = hs.bomw("bpgg", bomt(int ), (int)209);
lbl52:
                                    // 3 sources

                                    v4 /* !! */  = (long)(v5 - hs.bomw("bpgd", bomt(int ), (int)206));
                                    continue block111;
                                }
                                case 1509767219: {
                                    break block111;
                                }
                            }
                            break;
                        }
                        if (this.ccCooldown > 0) ** GOTO lbl417
                        if (var1_3 || var1_3) return;
                        while (true) {
                            if ((v6 /* !! */  = (cfr_temp_2 = hs.dq - hs.bomw("bpgh", bomt(int ), (int)210)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v6 /* !! */  != hs.bomw("bpgi", bone(int ), (int)289)) ** GOTO lbl63
                            v7 /* !! */  = hs.dq;
                            if (true) ** GOTO lbl114
lbl63:
                            // 1 sources

                            v6 /* !! */  = (long)hs.bomw("bpgj", bone(int ), (int)290);
                        }
                    }
                    case 1: {
                        var2_2 /* !! */  = (int)hs.bomw("bpks", bone(int ), (int)336);
                        cfr_temp_0 = 0;
                        if (var3_1) {
                            throw null;
                        }
                        break block168;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)hs.bomw("bptz", bone(int ), (int)338);
                        cfr_temp_0 = 4;
                        if (var3_1) {
                            throw null;
                        }
                        break block168;
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)hs.bomw("bpub", bone(int ), (int)340);
                        cfr_temp_0 = 0;
                        if (var3_1) {
                            throw null;
                        }
                        break block168;
                    }
                    case 6: {
                        var2_2 /* !! */  = (int)hs.bomw("bpuc", bone(int ), (int)341);
                        cfr_temp_0 = 0;
                        if (var3_1) {
                            throw null;
                        }
                        break block168;
                    }
                    case 7: {
                        var2_2 /* !! */  = (int)hs.bomw("bpud", bone(int ), (int)342);
                        cfr_temp_0 = 0;
                        if (var3_1) {
                            throw null;
                        }
                        break block168;
                    }
                    case 8: {
                        ** GOTO lbl107
                    }
                    case 11: {
                        var2_2 /* !! */  = (int)hs.bomw("bpuh", bone(int ), (int)346);
                        cfr_temp_0 = 10;
                        if (var3_1) {
                            throw null;
                        }
                        break block168;
                    }
                    case 12: {
                        var2_2 /* !! */  = (int)hs.bomw("bpui", bone(int ), (int)347);
                        if (var3_1) {
                            throw null;
                        }
lbl107:
                        // 3 sources

                        var2_2 /* !! */  = (int)hs.bomw("bpue", bone(int ), (int)343);
                        cfr_temp_0 = 10;
                        if (var3_1) {
                            throw null;
                        }
                        break block168;
                    }
                    block113: while (true) {
                        v7 /* !! */  = (long)(v8 - hs.bomw("bpgk", bomt(int ), (int)211));
lbl114:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -1508461589: {
                                v8 = hs.bomw("bpgl", bomt(int ), (int)212);
                                continue block113;
                            }
                            case 1292385061: {
                                v8 = hs.bomw("bpgm", bomt(int ), (int)213);
                                continue block113;
                            }
                            case 1509767219: {
                                break block113;
                            }
                            case 1863551536: {
                                v8 = hs.bomw("bpgn", bomt(int ), (int)214);
                                continue block113;
                            }
                        }
                        break;
                    }
                    v9 = hs.mc.field_1724;
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_3 = hs.dq - hs.bomw("bpgo", bomt(int ), (int)215)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == hs.bomw("bpgp", bone(int ), (int)291)) break;
                        v10 /* !! */  = (long)hs.bomw("bpgq", bone(int ), (int)292);
                    }
                    v11 = v9.field_3944;
                    while (true) {
                        if ((v12 /* !! */  = (cfr_temp_4 = hs.dq - hs.bomw("bpgr", bomt(int ), (int)216)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v12 /* !! */  != hs.bomw("bpgs", bone(int ), (int)293)) ** GOTO lbl138
                        v13 /* !! */  = hs.dq;
                        if (true) ** GOTO lbl142
lbl138:
                        // 1 sources

                        v12 /* !! */  = (long)hs.bomw("bpgt", bone(int ), (int)294);
                    }
                    block116: while (true) {
                        v13 /* !! */  = (long)(v14 - hs.bomw("bpgu", bomt(int ), (int)217));
lbl142:
                        // 2 sources

                        switch ((int)v13 /* !! */ ) {
                            case -506735117: {
                                v14 = hs.bomw("bpgv", bomt(int ), (int)218);
                                continue block116;
                            }
                            case -344657255: {
                                v14 = hs.bomw("bpgw", bomt(int ), (int)219);
                                continue block116;
                            }
                            case 1509767219: {
                                break block116;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v15 /* !! */  = (cfr_temp_5 = hs.dq - hs.bomw("bpgx", bomt(int ), (int)220)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v15 /* !! */  == hs.bomw("bpgy", bone(int ), (int)295)) break;
                        v15 /* !! */  = (long)hs.bomw("bpgz", bone(int ), (int)296);
                    }
                    v16 = hs.mc.field_1724;
                    while (true) {
                        if ((v17 /* !! */  = (cfr_temp_6 = hs.dq - hs.bomw("bpha", bomt(int ), (int)221)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v17 /* !! */  == hs.bomw("bphb", bone(int ), (int)297)) break;
                        v17 /* !! */  = (long)hs.bomw("bphc", bone(int ), (int)298);
                    }
                    v18 = v16.method_23317();
                    v19 /* !! */  = hs.dq;
                    block119: while (true) {
                        switch ((int)v19 /* !! */ ) {
                            case 1400977167: {
                                v19 /* !! */  = (long)(hs.bomw("bphe", bomt(int ), (int)223) - hs.bomw("bphd", bomt(int ), (int)222));
                                continue block119;
                            }
                            case 1509767219: {
                                break block119;
                            }
                        }
                        break;
                    }
                    v20 /* !! */  = hs.dq;
                    block120: while (true) {
                        switch ((int)v20 /* !! */ ) {
                            case 70096450: {
                                v20 /* !! */  = (long)(hs.bomw("bphg", bomt(int ), (int)225) - hs.bomw("bphf", bomt(int ), (int)224));
                                continue block120;
                            }
                            case 1509767219: {
                                break block120;
                            }
                        }
                        break;
                    }
                    v21 = hs.mc.field_1724;
                    while (true) {
                        if ((v22 /* !! */  = (cfr_temp_7 = hs.dq - hs.bomw("bphh", bomt(int ), (int)226)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v22 /* !! */  == hs.bomw("bphi", bone(int ), (int)299)) break;
                        v22 /* !! */  = (long)hs.bomw("bphj", bone(int ), (int)300);
                    }
                    v23 = v21.method_23318();
                    while (true) {
                        if ((v24 /* !! */  = (cfr_temp_8 = hs.dq - hs.bomw("bphk", bomt(int ), (int)227)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v24 /* !! */  != hs.bomw("bphl", bone(int ), (int)301)) ** GOTO lbl191
                        v25 /* !! */  = hs.dq;
                        if (true) ** GOTO lbl195
lbl191:
                        // 1 sources

                        v24 /* !! */  = (long)hs.bomw("bphm", bone(int ), (int)302);
                    }
                    block123: while (true) {
                        v25 /* !! */  = (long)(v26 - hs.bomw("bphn", bomt(int ), (int)228));
lbl195:
                        // 2 sources

                        switch ((int)v25 /* !! */ ) {
                            case -1864140772: {
                                v26 = hs.bomw("bpho", bomt(int ), (int)229);
                                continue block123;
                            }
                            case -1628786787: {
                                v26 = hs.bomw("bphp", bomt(int ), (int)230);
                                continue block123;
                            }
                            case -1042459422: {
                                v26 = hs.bomw("bphq", bomt(int ), (int)231);
                                continue block123;
                            }
                            case 1509767219: {
                                break block123;
                            }
                        }
                        break;
                    }
                    v27 = hs.mc.field_1724;
                    v28 /* !! */  = hs.dq;
                    if (true) ** GOTO lbl212
                    block124: while (true) {
                        v28 /* !! */  = (long)(v29 - hs.bomw("bphr", bomt(int ), (int)232));
lbl212:
                        // 2 sources

                        switch ((int)v28 /* !! */ ) {
                            case -976893986: {
                                v29 = hs.bomw("bphs", bomt(int ), (int)233);
                                continue block124;
                            }
                            case 865205729: {
                                v29 = hs.bomw("bpht", bomt(int ), (int)234);
                                continue block124;
                            }
                            case 1509767219: {
                                break block124;
                            }
                        }
                        break;
                    }
                    v30 = v27.method_23321();
                    v31 /* !! */  = hs.dq;
                    if (true) ** GOTO lbl226
                    block125: while (true) {
                        v31 /* !! */  = (long)(v32 - hs.bomw("bphu", bomt(int ), (int)235));
lbl226:
                        // 2 sources

                        switch ((int)v31 /* !! */ ) {
                            case -1364290645: {
                                v32 = hs.bomw("bphv", bomt(int ), (int)236);
                                continue block125;
                            }
                            case 1509767219: {
                                break block125;
                            }
                            case 1586651286: {
                                v32 = hs.bomw("bphw", bomt(int ), (int)237);
                                continue block125;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v33 /* !! */  = (cfr_temp_9 = hs.dq - hs.bomw("bphx", bomt(int ), (int)238)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                        if (v33 /* !! */  != hs.bomw("bphy", bone(int ), (int)303)) ** GOTO lbl241
                        v34 = hs.mc.field_1724;
                        v35 /* !! */  = hs.dq;
                        if (true) ** GOTO lbl245
lbl241:
                        // 1 sources

                        v33 /* !! */  = (long)hs.bomw("bphz", bone(int ), (int)304);
                    }
                    block127: while (true) {
                        v35 /* !! */  = (long)(v36 - hs.bomw("bpia", bomt(int ), (int)239));
lbl245:
                        // 2 sources

                        switch ((int)v35 /* !! */ ) {
                            case -2143658803: {
                                v36 = hs.bomw("bpib", bomt(int ), (int)240);
                                continue block127;
                            }
                            case 854069751: {
                                v36 = hs.bomw("bpic", bomt(int ), (int)241);
                                continue block127;
                            }
                            case 1339788909: {
                                v36 = hs.bomw("bpid", bomt(int ), (int)242);
                                continue block127;
                            }
                            case 1509767219: {
                                break block127;
                            }
                        }
                        break;
                    }
                    v37 = v34.method_36454();
                    while (true) {
                        if ((v38 /* !! */  = (cfr_temp_10 = hs.dq - hs.bomw("bpie", bomt(int ), (int)243)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                        if (v38 /* !! */  == hs.bomw("bpif", bone(int ), (int)305)) break;
                        v38 /* !! */  = (long)hs.bomw("bpig", bone(int ), (int)306);
                    }
                    while (true) {
                        if ((v39 /* !! */  = (cfr_temp_11 = hs.dq - hs.bomw("bpih", bomt(int ), (int)244)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                        if (v39 /* !! */  == hs.bomw("bpii", bone(int ), (int)307)) break;
                        v39 /* !! */  = (long)hs.bomw("bpij", bone(int ), (int)308);
                    }
                    v40 = hs.mc.field_1724;
                    while (true) {
                        if ((v41 /* !! */  = (cfr_temp_12 = hs.dq - hs.bomw("bpik", bomt(int ), (int)245)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                        if (v41 /* !! */  == hs.bomw("bpil", bone(int ), (int)309)) break;
                        v41 /* !! */  = (long)hs.bomw("bpim", bone(int ), (int)310);
                    }
                    v42 = v40.method_36455();
                    while (true) {
                        if ((v43 /* !! */  = (cfr_temp_13 = hs.dq - hs.bomw("bpin", bomt(int ), (int)246)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                        if (v43 /* !! */  == hs.bomw("bpio", bone(int ), (int)311)) break;
                        v43 /* !! */  = (long)hs.bomw("bpip", bone(int ), (int)312);
                    }
                    while (true) {
                        if ((v44 /* !! */  = (cfr_temp_14 = hs.dq - hs.bomw("bpiq", bomt(int ), (int)247)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                        if (v44 /* !! */  == hs.bomw("bpir", bone(int ), (int)313)) break;
                        v44 /* !! */  = (long)hs.bomw("bpis", bone(int ), (int)314);
                    }
                    v45 = hs.mc.field_1724;
                    while (true) {
                        if ((v46 /* !! */  = (cfr_temp_15 = hs.dq - hs.bomw("bpit", bomt(int ), (int)248)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                        if (v46 /* !! */  == hs.bomw("bpiu", bone(int ), (int)315)) break;
                        v46 /* !! */  = (long)hs.bomw("bpiv", bone(int ), (int)316);
                    }
                    v47 = v45.method_24828();
                    v48 = hs.bomw("bpiw", bone(int ), (int)317);
                    while (true) {
                        if ((v49 /* !! */  = (cfr_temp_16 = hs.dq - hs.bomw("bpix", bomt(int ), (int)249)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                        if (v49 /* !! */  == hs.bomw("bpiy", bone(int ), (int)318)) break;
                        v49 /* !! */  = (long)hs.bomw("bpiz", bone(int ), (int)319);
                    }
                    v50 = new class_2828.class_2830(v18, v23, v30, v37, v42, v47, (boolean)v48);
                    while (true) {
                        if ((v51 /* !! */  = (cfr_temp_17 = hs.dq - hs.bomw("bpja", bomt(int ), (int)250)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
                        if (v51 /* !! */  == hs.bomw("bpjb", bone(int ), (int)320)) {
                            v11.method_52787((class_2596)v50);
                            if (var1_3) return;
                            break;
                        }
                        v51 /* !! */  = (long)hs.bomw("bpjc", bone(int ), (int)321);
                    }
                    if (var1_3) return;
                    v52 /* !! */  = hs.dq;
                    if (true) ** GOTO lbl312
                    block136: while (true) {
                        v52 /* !! */  = (long)(v53 - hs.bomw("bpjd", bomt(int ), (int)251));
lbl312:
                        // 2 sources

                        switch ((int)v52 /* !! */ ) {
                            case -1501366083: {
                                v53 = hs.bomw("bpje", bomt(int ), (int)252);
                                continue block136;
                            }
                            case -975201127: {
                                v53 = hs.bomw("bpjf", bomt(int ), (int)253);
                                continue block136;
                            }
                            case 1509767219: {
                                break block136;
                            }
                        }
                        break;
                    }
                    v54 /* !! */  = hs.dq;
                    if (true) ** GOTO lbl325
                    block137: while (true) {
                        v54 /* !! */  = (long)(v55 - hs.bomw("bpjg", bomt(int ), (int)254));
lbl325:
                        // 2 sources

                        switch ((int)v54 /* !! */ ) {
                            case -2115137512: {
                                v55 = hs.bomw("bpjh", bomt(int ), (int)255);
                                continue block137;
                            }
                            case -1414451732: {
                                v55 = hs.bomw("bpji", bomt(int ), (int)256);
                                continue block137;
                            }
                            case 1509767219: {
                                break block137;
                            }
                        }
                        break;
                    }
                    v56 = hs.mc.field_1724;
                    while (true) {
                        if ((v57 /* !! */  = (cfr_temp_18 = hs.dq - hs.bomw("bpjj", bomt(int ), (int)257)) == 0L ? 0 : (cfr_temp_18 < 0L ? -1 : 1)) == false) continue;
                        if (v57 /* !! */  == hs.bomw("bpjk", bone(int ), (int)322)) break;
                        v57 /* !! */  = (long)hs.bomw("bpjl", bone(int ), (int)323);
                    }
                    v58 = v56.field_3944;
                    while (true) {
                        if ((v59 /* !! */  = (cfr_temp_19 = hs.dq - hs.bomw("bpjm", bomt(int ), (int)258)) == 0L ? 0 : (cfr_temp_19 < 0L ? -1 : 1)) == false) continue;
                        if (v59 /* !! */  == hs.bomw("bpjn", bone(int ), (int)324)) break;
                        v59 /* !! */  = (long)hs.bomw("bpjo", bone(int ), (int)325);
                    }
                    while (true) {
                        if ((v60 /* !! */  = (cfr_temp_20 = hs.dq - hs.bomw("bpjp", bomt(int ), (int)259)) == 0L ? 0 : (cfr_temp_20 < 0L ? -1 : 1)) == false) continue;
                        if (v60 /* !! */  != hs.bomw("bpjq", bone(int ), (int)326)) ** GOTO lbl351
                        v61 /* !! */  = hs.dq;
                        if (true) ** GOTO lbl355
lbl351:
                        // 1 sources

                        v60 /* !! */  = (long)hs.bomw("bpjr", bone(int ), (int)327);
                    }
                    block141: while (true) {
                        v61 /* !! */  = (long)(v62 - hs.bomw("bpjs", bomt(int ), (int)260));
lbl355:
                        // 2 sources

                        switch ((int)v61 /* !! */ ) {
                            case 882096420: {
                                v62 = hs.bomw("bpjt", bomt(int ), (int)261);
                                continue block141;
                            }
                            case 1509767219: {
                                break block141;
                            }
                            case 1979046030: {
                                v62 = hs.bomw("bpju", bomt(int ), (int)262);
                                continue block141;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v63 /* !! */  = (cfr_temp_21 = hs.dq - hs.bomw("bpjv", bomt(int ), (int)263)) == 0L ? 0 : (cfr_temp_21 < 0L ? -1 : 1)) == false) continue;
                        if (v63 /* !! */  == hs.bomw("bpjw", bone(int ), (int)328)) break;
                        v63 /* !! */  = (long)hs.bomw("bpjx", bone(int ), (int)329);
                    }
                    v64 = hs.mc.field_1724;
                    v65 /* !! */  = hs.dq;
                    block143: while (true) {
                        switch ((int)v65 /* !! */ ) {
                            case -721680496: {
                                v65 /* !! */  = (long)(hs.bomw("bpjz", bomt(int ), (int)265) - hs.bomw("bpjy", bomt(int ), (int)264));
                                continue block143;
                            }
                            case 1509767219: {
                                break block143;
                            }
                        }
                        break;
                    }
                    v66 = v64.method_73189();
                    while (true) {
                        if ((v67 /* !! */  = (cfr_temp_22 = hs.dq - hs.bomw("bpka", bomt(int ), (int)266)) == 0L ? 0 : (cfr_temp_22 < 0L ? -1 : 1)) == false) continue;
                        if (v67 /* !! */  != hs.bomw("bpkb", bone(int ), (int)330)) ** GOTO lbl385
                        v68 = class_2338.method_49638((class_2374)v66);
                        v69 /* !! */  = hs.dq;
                        if (true) ** GOTO lbl389
lbl385:
                        // 1 sources

                        v67 /* !! */  = (long)hs.bomw("bpkc", bone(int ), (int)331);
                    }
                    block145: while (true) {
                        v69 /* !! */  = (long)(v70 - hs.bomw("bpkd", bomt(int ), (int)267));
lbl389:
                        // 2 sources

                        switch ((int)v69 /* !! */ ) {
                            case -1140202920: {
                                v70 = hs.bomw("bpke", bomt(int ), (int)268);
                                continue block145;
                            }
                            case -799347775: {
                                v70 = hs.bomw("bpkf", bomt(int ), (int)269);
                                continue block145;
                            }
                            case 1392714476: {
                                v70 = hs.bomw("bpkg", bomt(int ), (int)270);
                                continue block145;
                            }
                            case 1509767219: {
                                break block145;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v71 /* !! */  = (cfr_temp_23 = hs.dq - hs.bomw("bpkh", bomt(int ), (int)271)) == 0L ? 0 : (cfr_temp_23 < 0L ? -1 : 1)) == false) continue;
                        if (v71 /* !! */  == hs.bomw("bpki", bone(int ), (int)332)) break;
                        v71 /* !! */  = (long)hs.bomw("bpkj", bone(int ), (int)333);
                    }
                    v72 = new class_2846(class_2846.class_2847.field_12973, v68, class_2350.field_11033);
                    v73 /* !! */  = hs.dq;
                    block147: while (true) {
                        switch ((int)v73 /* !! */ ) {
                            case -1089515456: {
                                v73 /* !! */  = (long)(hs.bomw("bpkl", bomt(int ), (int)273) - hs.bomw("bpkk", bomt(int ), (int)272));
                                continue block147;
                            }
                            case 1509767219: {
                                break block147;
                            }
                        }
                        break;
                    }
                    v58.method_52787((class_2596)v72);
                    if (var1_3) return;
lbl417:
                    // 2 sources

                    if (var1_3 || var1_3) return;
                    v74 = hs.bomw("bpkm", bone(int ), (int)334);
                    v75 /* !! */  = hs.dq;
                    if (true) ** GOTO lbl423
                    block148: while (true) {
                        v75 /* !! */  = (long)(v76 - hs.bomw("bpkn", bomt(int ), (int)274));
lbl423:
                        // 2 sources

                        switch ((int)v75 /* !! */ ) {
                            case -1947461848: {
                                v76 = hs.bomw("bpko", bomt(int ), (int)275);
                                continue block148;
                            }
                            case -516075766: {
                                v76 = hs.bomw("bpkp", bomt(int ), (int)276);
                                continue block148;
                            }
                            case 84989373: {
                                v76 = hs.bomw("bpkq", bomt(int ), (int)277);
                                continue block148;
                            }
                            case 1509767219: {
                                break block148;
                            }
                        }
                        break;
                    }
                    this.flag = v74;
                    if (!var1_3 && !var1_3) return;
                    return;
                    case 0: {
                        var2_2 /* !! */  = (int)hs.bomw("bpkr", bone(int ), (int)335);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)hs.bomw("bpkt", bone(int ), (int)337);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 4: {
                        var2_2 /* !! */  = (int)hs.bomw("bpua", bone(int ), (int)339);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 10: {
                        var2_2 /* !! */  = (int)hs.bomw("bpug", bone(int ), (int)345);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 9: 
                }
                ** GOTO lbl459
            }
            do {
                if (true) continue block110;
lbl459:
                // 2 sources

                var2_2 /* !! */  = (int)hs.bomw("bpuf", bone(int ), (int)344);
                cfr_temp_0 = 0;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    public static /* synthetic */ CallSite bomw(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setCcCooldown(int var1_1) {
        v0 /* !! */  = hs.dq;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(hs.bomw("bpyj", bomt(int ), (int)333) - hs.bomw("bpyi", bomt(int ), (int)332));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 193621031: {
                    continue block17;
                }
                case 1509767219: {
                    break block17;
                }
            }
            break;
        }
        var4_2 = hs.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = hs.dq - hs.bomw("bpyk", bomt(int ), (int)334)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == hs.bomw("bpyl", bone(int ), (int)397)) break;
            v1 /* !! */  = (long)hs.bomw("bpym", bone(int ), (int)398);
        }
        var3_3 /* !! */  = hs.b;
        v2 /* !! */  = hs.dq;
        if (true) ** GOTO lbl21
        block19: while (true) {
            v2 /* !! */  = (long)(v3 - hs.bomw("bpyn", bomt(int ), (int)335));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1698958785: {
                    v3 = hs.bomw("bpyo", bomt(int ), (int)336);
                    continue block19;
                }
                case 379189310: {
                    v3 = hs.bomw("bpyp", bomt(int ), (int)337);
                    continue block19;
                }
                case 839024147: {
                    v3 = hs.bomw("bpyq", bomt(int ), (int)338);
                    continue block19;
                }
                case 1509767219: {
                    break block19;
                }
            }
            break;
        }
        var2_4 = hs.a;
        if (var4_2) {
            throw null;
lbl36:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl36
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = hs.dq - hs.bomw("bpyr", bomt(int ), (int)339)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == hs.bomw("bpys", bone(int ), (int)399)) break;
                    v4 /* !! */  = (long)hs.bomw("bpyt", bone(int ), (int)400);
                }
                this.ccCooldown = var1_1;
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl51:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)hs.bomw("bpyu", bone(int ), (int)401);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)hs.bomw("bpyv", bone(int ), (int)402);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl65
            }
lbl60:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hs.bomw("bpyw", bone(int ), (int)403);
                    if (!var4_2) ** GOTO lbl51
                    throw null;
                }
            }
lbl65:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)hs.bomw("bpyx", bone(int ), (int)404);
                if (!var4_2) ** GOTO lbl60
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)hs.bomw("bpyy", bone(int ), (int)405);
        ** while (!var4_2)
lbl72:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bqdh() {
        hs.bong[400] = 540791385;
        hs.bong[401] = 1410513313;
        hs.bong[402] = -1243999223;
        hs.bong[403] = -1366054924;
        hs.bong[404] = 1316907212;
        hs.bong[405] = -1630096971;
        hs.bong[406] = -510244495;
        hs.bong[407] = -1472658787;
        hs.bong[408] = 1724322101;
        hs.bong[409] = -192211994;
        hs.bong[410] = 240962543;
        hs.bong[411] = -1392712235;
        hs.bong[412] = -1620113568;
        hs.bong[413] = 51258434;
        hs.bong[414] = -1115417926;
        hs.bong[415] = -76130391;
        hs.bong[416] = -329420455;
        hs.bong[417] = -1996224731;
        hs.bong[418] = -334318002;
        hs.bong[419] = 854198399;
        hs.bong[420] = 1597850040;
        hs.bong[421] = 969123529;
        hs.bong[422] = -2042791465;
        hs.bong[423] = -1834177561;
        hs.bong[424] = 1655221715;
        hs.bong[425] = -60370161;
        hs.bong[426] = -1668624777;
        hs.bong[427] = 953765192;
        hs.bong[428] = -696498862;
        hs.bong[429] = 227312259;
        hs.bong[430] = -1674928909;
        hs.bong[431] = -2060766825;
        hs.bong[432] = 117314636;
        hs.bong[433] = -1258795602;
        hs.bong[434] = 404280699;
        hs.bong[435] = 1103868428;
        hs.bong[436] = -1348935087;
        hs.bong[437] = 2038046536;
        hs.bong[438] = -874729829;
        hs.bong[439] = 1582647813;
        hs.bong[440] = -710765126;
        hs.bong[441] = -1671697658;
        hs.bong[442] = -1549461956;
        hs.bong[443] = -303168357;
        hs.bong[444] = -2115865515;
        hs.bong[445] = 1422413821;
        hs.bong[446] = -1681976971;
        hs.bong[447] = -181347382;
        hs.bong[448] = 527483588;
        hs.bong[449] = -164904769;
        hs.bong[450] = 1360031672;
        hs.bong[451] = 1549111952;
        hs.bong[452] = -355984669;
        hs.bong[453] = -1539233434;
        hs.bong[454] = -2041427334;
        hs.bong[455] = -1534104070;
        hs.bong[456] = -889238548;
        hs.bong[457] = 596989035;
    }

    private static /* synthetic */ void bqdl() {
        hs.bomu[300] = 971313779395263397L;
        hs.bomu[301] = 6571954474859650659L;
        hs.bomu[302] = -2582548803339425904L;
        hs.bomu[303] = -5942477605336045499L;
        hs.bomu[304] = -5116215770334774130L;
        hs.bomu[305] = 969993037019980778L;
        hs.bomu[306] = 6849929402141432135L;
        hs.bomu[307] = -1440908194871885676L;
        hs.bomu[308] = -5608415716756483438L;
        hs.bomu[309] = -3995076875421400065L;
        hs.bomu[310] = -8647313839209802300L;
        hs.bomu[311] = -3695428651985505890L;
        hs.bomu[312] = -691751357655147466L;
        hs.bomu[313] = -7611614308432645726L;
        hs.bomu[314] = 4797653337606094866L;
        hs.bomu[315] = 4070151952778334913L;
        hs.bomu[316] = -6126789222708026739L;
        hs.bomu[317] = -7999886244992338165L;
        hs.bomu[318] = -370308823300858195L;
        hs.bomu[319] = -5137104471023257151L;
        hs.bomu[320] = -1323450052848531871L;
        hs.bomu[321] = -2534925903479981895L;
        hs.bomu[322] = 709619713105773503L;
        hs.bomu[323] = -2050928283669223758L;
        hs.bomu[324] = -2746934662379377031L;
        hs.bomu[325] = -4312605213741090469L;
        hs.bomu[326] = 6632537256047595662L;
        hs.bomu[327] = -9193729639363127308L;
        hs.bomu[328] = 2877473154485787870L;
        hs.bomu[329] = 8242413562275965117L;
        hs.bomu[330] = 8605008783076209656L;
        hs.bomu[331] = -8955562152470221266L;
        hs.bomu[332] = -4860577929484432237L;
        hs.bomu[333] = -8252434862161493019L;
        hs.bomu[334] = -6780453539011829379L;
        hs.bomu[335] = 7236457744783779036L;
        hs.bomu[336] = 8529520088885932309L;
        hs.bomu[337] = 2215464646079471261L;
        hs.bomu[338] = -777544197315777656L;
        hs.bomu[339] = -3546319024614255303L;
        hs.bomu[340] = 7707364074243647703L;
        hs.bomu[341] = 5123682856957638135L;
        hs.bomu[342] = -4262987404037001113L;
        hs.bomu[343] = -2021558964619252742L;
        hs.bomu[344] = 8573295161513488546L;
        hs.bomu[345] = 1454985553799844934L;
        hs.bomu[346] = -6271315338072987464L;
        hs.bomu[347] = 5667113885231286957L;
        hs.bomu[348] = -5061593497967362557L;
        hs.bomu[349] = -5621427964138391479L;
        hs.bomu[350] = -828003211375792126L;
        hs.bomu[351] = -1115961734354982910L;
        hs.bomu[352] = -7329682904028183493L;
        hs.bomu[353] = -8002896330110768193L;
        hs.bomu[354] = 4705839564944735743L;
        hs.bomu[355] = 5644505962418440495L;
        hs.bomu[356] = -1331290751207180420L;
        hs.bomu[357] = -1563263406245549831L;
        hs.bomu[358] = 5705572496084179835L;
        hs.bomu[359] = -5748875962928245754L;
        hs.bomu[360] = -3109802143091150922L;
        hs.bomu[361] = -1118951004763248987L;
        hs.bomu[362] = 4691187414296205453L;
        hs.bomu[363] = 6922805117056285109L;
        hs.bomu[364] = 1231864324214268239L;
        hs.bomu[365] = 4258588631434076532L;
        hs.bomu[366] = 7962641105062870125L;
        hs.bomu[367] = 4338919419599596639L;
        hs.bomu[368] = 6163890673679131909L;
        hs.bomu[369] = -2241749322826333311L;
        hs.bomu[370] = -5913789100127904959L;
        hs.bomu[371] = -1148256361246766694L;
        hs.bomu[372] = 138729518099054750L;
        hs.bomu[373] = 2563233121222014739L;
        hs.bomu[374] = 2246574149049070629L;
        hs.bomu[375] = -615307269794221077L;
        hs.bomu[376] = 8661344669487021765L;
        hs.bomu[377] = 4432328764036598523L;
        hs.bomu[378] = -5643369334237741089L;
        hs.bomu[379] = 8279913431735077800L;
        hs.bomu[380] = -1374132458724770497L;
        hs.bomu[381] = 6631270144600892449L;
        hs.bomu[382] = 8806778023449978773L;
        hs.bomu[383] = -4003966302868781141L;
        hs.bomu[384] = 1674426264662735859L;
        hs.bomu[385] = 7918581892250870468L;
        hs.bomu[386] = 6568365847461938804L;
        hs.bomu[387] = 170643703525768977L;
        hs.bomu[388] = -2419429280303929212L;
        hs.bomu[389] = 921255565392937565L;
        hs.bomu[390] = -6998752096363349975L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getGrimTicks() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hs.dq - hs.bomw("bqay", bomt(int ), (int)365)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hs.bomw("bqaz", bone(int ), (int)432)) break;
            v0 /* !! */  = (long)hs.bomw("bqba", bone(int ), (int)433);
        }
        var3_1 = hs.c;
        v1 /* !! */  = hs.dq;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(v2 - hs.bomw("bqbb", bomt(int ), (int)366));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -203440397: {
                    v2 = hs.bomw("bqbc", bomt(int ), (int)367);
                    continue block16;
                }
                case 1351087379: {
                    v2 = hs.bomw("bqbd", bomt(int ), (int)368);
                    continue block16;
                }
                case 1509767219: {
                    break block16;
                }
            }
            break;
        }
        var2_2 /* !! */  = hs.b;
        v3 /* !! */  = hs.dq;
        if (true) ** GOTO lbl26
        block17: while (true) {
            v3 /* !! */  = (long)(hs.bomw("bqbf", bomt(int ), (int)370) - hs.bomw("bqbe", bomt(int ), (int)369));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 880950774: {
                    continue block17;
                }
                case 1509767219: {
                    break block17;
                }
            }
            break;
        }
        var1_3 = hs.a;
        if (var3_1) {
            throw null;
            return (int)hs.bomw("bqbg", bone(int ), (int)434);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = hs.dq - hs.bomw("bqbh", bomt(int ), (int)371)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hs.bomw("bqbi", bone(int ), (int)435)) break;
                    v4 /* !! */  = (long)hs.bomw("bqbj", bone(int ), (int)436);
                }
                return this.grimTicks;
            }
            case 0: {
                var2_2 /* !! */  = (int)hs.bomw("bqbk", bone(int ), (int)437);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)hs.bomw("bqbl", bone(int ), (int)438);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)hs.bomw("bqbm", bone(int ), (int)439);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hs.bomw("bqbn", bone(int ), (int)440);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kf getMode() {
        v0 /* !! */  = hs.dq;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - hs.bomw("bpzq", bomt(int ), (int)348));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -120524665: {
                    v1 = hs.bomw("bpzr", bomt(int ), (int)349);
                    continue block18;
                }
                case 661605415: {
                    v1 = hs.bomw("bpzs", bomt(int ), (int)350);
                    continue block18;
                }
                case 1239309378: {
                    v1 = hs.bomw("bpzt", bomt(int ), (int)351);
                    continue block18;
                }
                case 1509767219: {
                    break block18;
                }
            }
            break;
        }
        var3_1 = hs.c;
        v2 /* !! */  = hs.dq;
        if (true) ** GOTO lbl22
        block19: while (true) {
            v2 /* !! */  = (long)(v3 - hs.bomw("bpzu", bomt(int ), (int)352));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -499009370: {
                    v3 = hs.bomw("bpzv", bomt(int ), (int)353);
                    continue block19;
                }
                case -448156625: {
                    v3 = hs.bomw("bpzw", bomt(int ), (int)354);
                    continue block19;
                }
                case 380505363: {
                    v3 = hs.bomw("bpzx", bomt(int ), (int)355);
                    continue block19;
                }
                case 1509767219: {
                    break block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = hs.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = hs.dq - hs.bomw("bpzy", bomt(int ), (int)356)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hs.bomw("bpzz", bone(int ), (int)415)) break;
                    v4 /* !! */  = (long)hs.bomw("bqaa", bone(int ), (int)416);
                }
                var1_3 = hs.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = hs.dq - hs.bomw("bqab", bomt(int ), (int)357)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hs.bomw("bqac", bone(int ), (int)417)) break;
                    v5 /* !! */  = (long)hs.bomw("bqad", bone(int ), (int)418);
                }
                return this.mode;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)hs.bomw("bqae", bone(int ), (int)419);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)hs.bomw("bqaf", bone(int ), (int)420);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)hs.bomw("bqag", bone(int ), (int)421);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hs.bomw("bqah", bone(int ), (int)422);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float bpat(int n2) {
        return Float.intBitsToFloat(bonf[n2] ^ bong[n2]);
    }

    private static /* synthetic */ void bqdo() {
        hs.bomv[200] = 1221843788858483190L;
        hs.bomv[201] = -1607186039854090050L;
        hs.bomv[202] = -1147497162335443843L;
        hs.bomv[203] = 1365496844364458538L;
        hs.bomv[204] = -5634863111348932613L;
        hs.bomv[205] = -3558358896866311925L;
        hs.bomv[206] = -5977359974050335916L;
        hs.bomv[207] = -1602426481582175040L;
        hs.bomv[208] = -6100730464925500833L;
        hs.bomv[209] = -2454436323064570123L;
        hs.bomv[210] = -534981793563866514L;
        hs.bomv[211] = 5224178768485337186L;
        hs.bomv[212] = -2386106808199147327L;
        hs.bomv[213] = -316914507417289904L;
        hs.bomv[214] = 2103894383306852904L;
        hs.bomv[215] = 3575873953926485345L;
        hs.bomv[216] = -3900653253597894919L;
        hs.bomv[217] = -5395417190184083430L;
        hs.bomv[218] = 6696731104458507303L;
        hs.bomv[219] = -6747706131103742965L;
        hs.bomv[220] = 2422652167574900729L;
        hs.bomv[221] = -1090897761198405024L;
        hs.bomv[222] = -6601625275899512304L;
        hs.bomv[223] = 2795580089858555317L;
        hs.bomv[224] = -732635332524198218L;
        hs.bomv[225] = -3438702201809662938L;
        hs.bomv[226] = -7316247437351167942L;
        hs.bomv[227] = 4942598430152021573L;
        hs.bomv[228] = -3462861998028563454L;
        hs.bomv[229] = -7718076558302253566L;
        hs.bomv[230] = -6476080330148408281L;
        hs.bomv[231] = -7114420414002267006L;
        hs.bomv[232] = 4968673042568753462L;
        hs.bomv[233] = -5932567125313051565L;
        hs.bomv[234] = -4952813362823219713L;
        hs.bomv[235] = 2198845115401845901L;
        hs.bomv[236] = 3960296278556983914L;
        hs.bomv[237] = 6174980779586311188L;
        hs.bomv[238] = 4730630433374759027L;
        hs.bomv[239] = -4764594400730395276L;
        hs.bomv[240] = 4323439817305113025L;
        hs.bomv[241] = -1844075246548477014L;
        hs.bomv[242] = -2242143211085558851L;
        hs.bomv[243] = -7416247884986152975L;
        hs.bomv[244] = -4024289826381238318L;
        hs.bomv[245] = -8252522511923784769L;
        hs.bomv[246] = -6690851800525360740L;
        hs.bomv[247] = -2078210730171825279L;
        hs.bomv[248] = 7187324128022652606L;
        hs.bomv[249] = -7068629279084653951L;
        hs.bomv[250] = 4887789263744595111L;
        hs.bomv[251] = -3888690864118844272L;
        hs.bomv[252] = -53755895801050681L;
        hs.bomv[253] = -3673923616936415559L;
        hs.bomv[254] = 8723763667412301516L;
        hs.bomv[255] = 8981900437731556441L;
        hs.bomv[256] = -8615960506643694100L;
        hs.bomv[257] = -2563233190927515758L;
        hs.bomv[258] = 3787181621959065316L;
        hs.bomv[259] = -3856217763255467039L;
        hs.bomv[260] = -9087482839053029082L;
        hs.bomv[261] = 5735822841826346542L;
        hs.bomv[262] = 6138081244947841929L;
        hs.bomv[263] = 7147039162616835798L;
        hs.bomv[264] = -1415896383805494190L;
        hs.bomv[265] = 9140364718986830880L;
        hs.bomv[266] = 9121945121217700378L;
        hs.bomv[267] = 2883872492910940403L;
        hs.bomv[268] = -6143635650163856527L;
        hs.bomv[269] = 3254102477986699836L;
        hs.bomv[270] = 8093765717351785414L;
        hs.bomv[271] = -2547418027686271865L;
        hs.bomv[272] = -3622468028648508054L;
        hs.bomv[273] = -1932852507118115533L;
        hs.bomv[274] = 4655759492407066432L;
        hs.bomv[275] = -1183842594225060803L;
        hs.bomv[276] = -292931707618634964L;
        hs.bomv[277] = -3077051462405905896L;
        hs.bomv[278] = -606365216815991826L;
        hs.bomv[279] = 4384591440574352321L;
        hs.bomv[280] = 7900141448116324565L;
        hs.bomv[281] = 4104254832154934879L;
        hs.bomv[282] = -8497571707991180722L;
        hs.bomv[283] = 7347352114498422324L;
        hs.bomv[284] = -2333431021182437247L;
        hs.bomv[285] = 896671879112003464L;
        hs.bomv[286] = 3720727432000946304L;
        hs.bomv[287] = -792977910116667616L;
        hs.bomv[288] = -8287529002396296355L;
        hs.bomv[289] = 4437305245995498726L;
        hs.bomv[290] = -2205210484287877202L;
        hs.bomv[291] = 6891317685029569026L;
        hs.bomv[292] = -8326094387182790340L;
        hs.bomv[293] = -1401396179335053067L;
        hs.bomv[294] = 4599598375733143496L;
        hs.bomv[295] = -5901844031727473078L;
        hs.bomv[296] = -5914133493831175436L;
        hs.bomv[297] = 5857680342902730239L;
        hs.bomv[298] = -2993879445801186831L;
        hs.bomv[299] = 1946070343535640088L;
    }

    private static /* synthetic */ void bqdc() {
        hs.bonf[400] = 2084613501;
        hs.bonf[401] = 1410513317;
        hs.bonf[402] = -1243999222;
        hs.bonf[403] = -1366054922;
        hs.bonf[404] = 1316907213;
        hs.bonf[405] = -1630096970;
        hs.bonf[406] = -510244496;
        hs.bonf[407] = 1911233219;
        hs.bonf[408] = -1724322102;
        hs.bonf[409] = -688832305;
        hs.bonf[410] = 240962540;
        hs.bonf[411] = -1392712233;
        hs.bonf[412] = -1620113567;
        hs.bonf[413] = 51258438;
        hs.bonf[414] = -1115417927;
        hs.bonf[415] = 76130390;
        hs.bonf[416] = 398813133;
        hs.bonf[417] = 1996224730;
        hs.bonf[418] = 1585863377;
        hs.bonf[419] = 854198398;
        hs.bonf[420] = 1597850042;
        hs.bonf[421] = 969123530;
        hs.bonf[422] = -2042791467;
        hs.bonf[423] = 1834177560;
        hs.bonf[424] = -467297938;
        hs.bonf[425] = 60370160;
        hs.bonf[426] = -1611030226;
        hs.bonf[427] = 953765192;
        hs.bonf[428] = -696498861;
        hs.bonf[429] = 227312256;
        hs.bonf[430] = -1674928910;
        hs.bonf[431] = -2060766827;
        hs.bonf[432] = -117314637;
        hs.bonf[433] = 86423145;
        hs.bonf[434] = 441678599;
        hs.bonf[435] = -1103868429;
        hs.bonf[436] = 493426105;
        hs.bonf[437] = 2038046539;
        hs.bonf[438] = -874729831;
        hs.bonf[439] = 1582647815;
        hs.bonf[440] = -710765128;
        hs.bonf[441] = 1671697657;
        hs.bonf[442] = -1650079678;
        hs.bonf[443] = -1780303602;
        hs.bonf[444] = 2115865514;
        hs.bonf[445] = 8584686;
        hs.bonf[446] = -1681976970;
        hs.bonf[447] = -181347381;
        hs.bonf[448] = 527483590;
        hs.bonf[449] = -164904772;
        hs.bonf[450] = -1360031673;
        hs.bonf[451] = 1812060776;
        hs.bonf[452] = 355984668;
        hs.bonf[453] = -717386419;
        hs.bonf[454] = -2041427336;
        hs.bonf[455] = -1534104071;
        hs.bonf[456] = -889238548;
        hs.bonf[457] = 596989033;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPacket(cr var1_1) {
        block73: {
            block72: {
                block71: {
                    block70: {
                        var6_2 = hs.c;
                        var5_3 /* !! */  = hs.b;
                        var4_4 = hs.a;
                        if (var6_2) {
                            throw null;
lbl6:
                            // 22 sources

                            return;
                        }
                        if (var4_4 || var4_4) ** GOTO lbl6
                        if (this.state) break block70;
                        if (var4_4) ** GOTO lbl6
                        return;
                    }
                    if (var4_4 || var4_4) ** GOTO lbl6
                    if (var1_1.getType() == cr$Type.RECEIVE) break block71;
                    if (var4_4) ** GOTO lbl6
                    return;
                }
                if (var4_4 || var4_4) ** GOTO lbl6
                if (hs.mc.field_1724 == null) break block72;
                if (var4_4) ** GOTO lbl6
                if (hs.mc.field_1724.method_5799()) break block72;
                if (var4_4) ** GOTO lbl6
                if (hs.mc.field_1724.method_5869()) break block72;
                if (var4_4) ** GOTO lbl6
                if (!hs.mc.field_1724.method_5771()) break block73;
                if (var4_4) ** GOTO lbl6
            }
            if (var4_4 || var4_4) ** GOTO lbl6
            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl6
        if (this.ccCooldown <= 0) ** GOTO lbl41
        if (var4_4 || var4_4) ** GOTO lbl6
        this.ccCooldown -= hs.bomw("bonw", bone(int ), (int)11);
        if (var4_4) ** GOTO lbl6
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl6
                return;
            }
lbl41:
            // 1 sources

            if (var4_4 || var4_4) ** GOTO lbl6
            var3_5 = var1_1.getPacket();
            if (var4_4) ** GOTO lbl6
            if (!(var3_5 instanceof class_2743)) ** GOTO lbl52
            if (var4_4) ** GOTO lbl6
            var2_6 = (class_2743)var3_5;
            if (var4_4 || var4_4) ** GOTO lbl6
            if (var2_6.method_11818() != hs.mc.field_1724.method_5628()) ** GOTO lbl52
            if (var4_4 || var4_4) ** GOTO lbl6
            this.handleVelocityPacket(var1_1, var2_6);
            if (var4_4) ** GOTO lbl6
lbl52:
            // 3 sources

            if (var4_4 || var4_4) ** GOTO lbl6
            this.handleAdditionalPackets(var1_1);
            if (!var4_4 && !var4_4) ** break;
            ** continue;
            return;
lbl57:
            // 3 sources

            case 0: {
                var5_3 /* !! */  = (int)hs.bomw("bonx", bone(int ), (int)12);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl82
            }
            case 1: {
                var5_3 /* !! */  = (int)hs.bomw("bony", bone(int ), (int)13);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl67:
            // 2 sources

            case 2: {
                var5_3 /* !! */  = (int)hs.bomw("bonz", bone(int ), (int)14);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl72:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)hs.bomw("booa", bone(int ), (int)15);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl77:
            // 2 sources

            case 4: {
                var5_3 /* !! */  = (int)hs.bomw("boob", bone(int ), (int)16);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl96
            }
lbl82:
            // 6 sources

            case 5: {
                var5_3 /* !! */  = (int)hs.bomw("booc", bone(int ), (int)17);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 6: {
                var5_3 /* !! */  = (int)hs.bomw("bood", bone(int ), (int)18);
                if (!var6_2) ** GOTO lbl82
                throw null;
            }
lbl91:
            // 3 sources

            case 7: {
                var5_3 /* !! */  = (int)hs.bomw("booe", bone(int ), (int)19);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl96:
            // 2 sources

            case 8: {
                var5_3 /* !! */  = (int)hs.bomw("boof", bone(int ), (int)20);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl101:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)hs.bomw("boog", bone(int ), (int)21);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl199
            }
            case 10: {
                var5_3 /* !! */  = (int)hs.bomw("booh", bone(int ), (int)22);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl111:
            // 3 sources

            case 11: {
                var5_3 /* !! */  = (int)hs.bomw("booi", bone(int ), (int)23);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl116:
            // 4 sources

            case 12: {
                var5_3 /* !! */  = (int)hs.bomw("booj", bone(int ), (int)24);
                if (!var6_2) ** GOTO lbl91
                throw null;
            }
lbl120:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)hs.bomw("book", bone(int ), (int)25);
                if (!var6_2) ** GOTO lbl101
                throw null;
            }
            case 14: {
                do {
                    var5_3 /* !! */  = (int)hs.bomw("bool", bone(int ), (int)26);
                } while (!var6_2);
                throw null;
            }
lbl129:
            // 2 sources

            case 15: {
                var5_3 /* !! */  = (int)hs.bomw("boom", bone(int ), (int)27);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 16: {
                var5_3 /* !! */  = (int)hs.bomw("boon", bone(int ), (int)28);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl167
            }
            case 17: {
                var5_3 /* !! */  = (int)hs.bomw("booo", bone(int ), (int)29);
                if (!var6_2) ** GOTO lbl57
                throw null;
            }
            case 18: {
                var5_3 /* !! */  = (int)hs.bomw("boop", bone(int ), (int)30);
                if (!var6_2) ** GOTO lbl116
                throw null;
            }
            case 19: {
                var5_3 /* !! */  = (int)hs.bomw("booq", bone(int ), (int)31);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl152:
            // 2 sources

            case 20: {
                var5_3 /* !! */  = (int)hs.bomw("boor", bone(int ), (int)32);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl157:
            // 2 sources

            case 21: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)hs.bomw("boos", bone(int ), (int)33);
                    if (!var6_2) ** GOTO lbl91
                    throw null;
                }
            }
lbl162:
            // 2 sources

            case 22: {
                var5_3 /* !! */  = (int)hs.bomw("boot", bone(int ), (int)34);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl167:
            // 2 sources

            case 23: {
                var5_3 /* !! */  = (int)hs.bomw("boou", bone(int ), (int)35);
                if (!var6_2) ** GOTO lbl120
                throw null;
            }
lbl171:
            // 2 sources

            case 24: {
                var5_3 /* !! */  = (int)hs.bomw("boov", bone(int ), (int)36);
                if (var6_2) {
                    throw null;
                }
            }
            case 25: {
                var5_3 /* !! */  = (int)hs.bomw("boow", bone(int ), (int)37);
                if (!var6_2) ** GOTO lbl67
                throw null;
            }
lbl179:
            // 2 sources

            case 26: {
                var5_3 /* !! */  = (int)hs.bomw("boox", bone(int ), (int)38);
                if (!var6_2) ** GOTO lbl116
                throw null;
            }
lbl183:
            // 2 sources

            case 27: {
                var5_3 /* !! */  = (int)hs.bomw("booy", bone(int ), (int)39);
                if (!var6_2) ** GOTO lbl82
                throw null;
            }
lbl187:
            // 2 sources

            case 28: {
                var5_3 /* !! */  = (int)hs.bomw("booz", bone(int ), (int)40);
                if (!var6_2) ** GOTO lbl72
                throw null;
            }
            case 29: {
                var5_3 /* !! */  = (int)hs.bomw("bopa", bone(int ), (int)41);
                if (!var6_2) break;
                throw null;
            }
            case 30: {
                var5_3 /* !! */  = (int)hs.bomw("bopb", bone(int ), (int)42);
                if (!var6_2) ** GOTO lbl77
                throw null;
            }
lbl199:
            // 2 sources

            case 31: {
                var5_3 /* !! */  = (int)hs.bomw("bopc", bone(int ), (int)43);
                if (!var6_2) ** GOTO lbl111
                throw null;
            }
            case 32: {
                var5_3 /* !! */  = (int)hs.bomw("bopd", bone(int ), (int)44);
                if (!var6_2) ** GOTO lbl57
                throw null;
            }
lbl207:
            // 2 sources

            case 33: {
                var5_3 /* !! */  = (int)hs.bomw("bope", bone(int ), (int)45);
                if (!var6_2) ** GOTO lbl82
                throw null;
            }
lbl211:
            // 3 sources

            case 34: {
                var5_3 /* !! */  = (int)hs.bomw("bopf", bone(int ), (int)46);
                if (!var6_2) ** GOTO lbl82
                throw null;
            }
            case 35: {
                var5_3 /* !! */  = (int)hs.bomw("bopg", bone(int ), (int)47);
                if (!var6_2) ** GOTO lbl116
                throw null;
            }
            case 36: 
        }
        var5_3 /* !! */  = (int)hs.bomw("boph", bone(int ), (int)48);
        ** while (!var6_2)
lbl222:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isFlag() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hs.dq - hs.bomw("bqai", bomt(int ), (int)358)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hs.bomw("bqaj", bone(int ), (int)423)) break;
            v0 /* !! */  = (long)hs.bomw("bqak", bone(int ), (int)424);
        }
        var3_1 = hs.c;
        v1 /* !! */  = hs.dq;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(hs.bomw("bqam", bomt(int ), (int)360) - hs.bomw("bqal", bomt(int ), (int)359));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -207912973: {
                    continue block16;
                }
                case 1509767219: {
                    break block16;
                }
            }
            break;
        }
        var2_2 /* !! */  = hs.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = hs.dq - hs.bomw("bqan", bomt(int ), (int)361)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == hs.bomw("bqao", bone(int ), (int)425)) break;
                    v2 /* !! */  = (long)hs.bomw("bqap", bone(int ), (int)426);
                }
                var1_3 = hs.a;
                if (var3_1) {
                    throw null;
                    return (boolean)hs.bomw("bqaq", bone(int ), (int)427);
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = hs.dq;
                if (true) ** GOTO lbl37
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - hs.bomw("bqar", bomt(int ), (int)362));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1430360470: {
                            v4 = hs.bomw("bqas", bomt(int ), (int)363);
                            continue block19;
                        }
                        case 93487412: {
                            v4 = hs.bomw("bqat", bomt(int ), (int)364);
                            continue block19;
                        }
                        case 1509767219: {
                            break block19;
                        }
                    }
                    break;
                }
                return this.flag;
            }
lbl47:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)hs.bomw("bqau", bone(int ), (int)428);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hs.bomw("bqav", bone(int ), (int)429);
                    if (!var3_1) ** GOTO lbl47
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)hs.bomw("bqaw", bone(int ), (int)430);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hs.bomw("bqax", bone(int ), (int)431);
        ** while (!var3_1)
lbl65:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bqdj() {
        hs.bomu[100] = 2164687658220915613L;
        hs.bomu[101] = 6109019673196957604L;
        hs.bomu[102] = -137296074503002776L;
        hs.bomu[103] = 8446836718112498049L;
        hs.bomu[104] = -460534301517290051L;
        hs.bomu[105] = -4175803456181261904L;
        hs.bomu[106] = -5334055044495108838L;
        hs.bomu[107] = 186186607159622895L;
        hs.bomu[108] = 6292399847799685860L;
        hs.bomu[109] = -3036967723252672960L;
        hs.bomu[110] = -985963467111445564L;
        hs.bomu[111] = -7125003481696194677L;
        hs.bomu[112] = 4120919906228427017L;
        hs.bomu[113] = 9019372234282758294L;
        hs.bomu[114] = 4167568228681840163L;
        hs.bomu[115] = 2827324628827111342L;
        hs.bomu[116] = -120551701519407615L;
        hs.bomu[117] = 99329886803778996L;
        hs.bomu[118] = -6117644760083213843L;
        hs.bomu[119] = 2405869478352688014L;
        hs.bomu[120] = -9081138599281445246L;
        hs.bomu[121] = -7190648728897859069L;
        hs.bomu[122] = 4403542316065412783L;
        hs.bomu[123] = -6183461759924550957L;
        hs.bomu[124] = 7911373299637322379L;
        hs.bomu[125] = 1365122931899346521L;
        hs.bomu[126] = -7515677914503698147L;
        hs.bomu[127] = -1459147712875177681L;
        hs.bomu[128] = 5917174234095735484L;
        hs.bomu[129] = -594540583763837192L;
        hs.bomu[130] = 5079655625437514190L;
        hs.bomu[131] = 2993063778368372365L;
        hs.bomu[132] = 8672368929740712528L;
        hs.bomu[133] = 4925748338620427601L;
        hs.bomu[134] = 1721112978272542246L;
        hs.bomu[135] = 8011538620946432007L;
        hs.bomu[136] = -1896345424952294597L;
        hs.bomu[137] = -5321197414362725592L;
        hs.bomu[138] = -4006288534837663046L;
        hs.bomu[139] = 3833485753518088964L;
        hs.bomu[140] = -7116311063597212568L;
        hs.bomu[141] = -55284426604059347L;
        hs.bomu[142] = -5790036880507692712L;
        hs.bomu[143] = -1699307201471580698L;
        hs.bomu[144] = 2483072081460261002L;
        hs.bomu[145] = -7614675676078716198L;
        hs.bomu[146] = 1125870862407932979L;
        hs.bomu[147] = 6382640922926100713L;
        hs.bomu[148] = -6921760135386323508L;
        hs.bomu[149] = 7159064406155564949L;
        hs.bomu[150] = -3298653075554733494L;
        hs.bomu[151] = 708603542826703365L;
        hs.bomu[152] = 883959288016622344L;
        hs.bomu[153] = 1299654611527796167L;
        hs.bomu[154] = -8705036380122328941L;
        hs.bomu[155] = -8726608198329150816L;
        hs.bomu[156] = 9117094473206477200L;
        hs.bomu[157] = 8698092763615839298L;
        hs.bomu[158] = 6614225277606218043L;
        hs.bomu[159] = -1780907926670107971L;
        hs.bomu[160] = 6153986147163223333L;
        hs.bomu[161] = -4755844273709893935L;
        hs.bomu[162] = -4561126334422353560L;
        hs.bomu[163] = 1666711473246380492L;
        hs.bomu[164] = -4864779128741566506L;
        hs.bomu[165] = -7228288959107949136L;
        hs.bomu[166] = -1548776702839951204L;
        hs.bomu[167] = 5508917352179617941L;
        hs.bomu[168] = 4114830856231000027L;
        hs.bomu[169] = -3402204423203195943L;
        hs.bomu[170] = -9044532297728294548L;
        hs.bomu[171] = 8474680079818922025L;
        hs.bomu[172] = 4309328698108508180L;
        hs.bomu[173] = 4283282488811953921L;
        hs.bomu[174] = 2978543087265921697L;
        hs.bomu[175] = 6030884988240329210L;
        hs.bomu[176] = -2013576868514089530L;
        hs.bomu[177] = -4418619924276261305L;
        hs.bomu[178] = 5434003343351002318L;
        hs.bomu[179] = 1924052288452490250L;
        hs.bomu[180] = 3609508633115439680L;
        hs.bomu[181] = -5387983057023924519L;
        hs.bomu[182] = -61158306131993193L;
        hs.bomu[183] = 1673504593542599496L;
        hs.bomu[184] = 5079217847008990221L;
        hs.bomu[185] = 5782924256172730621L;
        hs.bomu[186] = -4027890696044673530L;
        hs.bomu[187] = 3965996651858283302L;
        hs.bomu[188] = 8175251557767784222L;
        hs.bomu[189] = 2859853661258200292L;
        hs.bomu[190] = 5483943009377060784L;
        hs.bomu[191] = -1642030741451165524L;
        hs.bomu[192] = -6230879922876800816L;
        hs.bomu[193] = -3241646944502209621L;
        hs.bomu[194] = -7693901528444946622L;
        hs.bomu[195] = -1277586137926581397L;
        hs.bomu[196] = -1623037715339606793L;
        hs.bomu[197] = 6474691272836608015L;
        hs.bomu[198] = 7178245882823547107L;
        hs.bomu[199] = -8909273039151650709L;
    }

    private static /* synthetic */ void bqdg() {
        hs.bong[300] = 1346157450;
        hs.bong[301] = -1521116337;
        hs.bong[302] = -1534151385;
        hs.bong[303] = -1119219371;
        hs.bong[304] = 1620850753;
        hs.bong[305] = -120848551;
        hs.bong[306] = 543684923;
        hs.bong[307] = 2121585624;
        hs.bong[308] = 147401923;
        hs.bong[309] = -310100919;
        hs.bong[310] = 402904645;
        hs.bong[311] = 1353902883;
        hs.bong[312] = -1206977734;
        hs.bong[313] = -1171790178;
        hs.bong[314] = -370664184;
        hs.bong[315] = -1223639710;
        hs.bong[316] = -357867094;
        hs.bong[317] = 643585780;
        hs.bong[318] = 1500717712;
        hs.bong[319] = -2072837360;
        hs.bong[320] = 1013384643;
        hs.bong[321] = 1285719091;
        hs.bong[322] = 1590515802;
        hs.bong[323] = -1015829811;
        hs.bong[324] = 61410840;
        hs.bong[325] = 436858022;
        hs.bong[326] = 1890356841;
        hs.bong[327] = 1503852052;
        hs.bong[328] = -631130306;
        hs.bong[329] = 2103063183;
        hs.bong[330] = 1185463766;
        hs.bong[331] = -1183651971;
        hs.bong[332] = -862035934;
        hs.bong[333] = 107303418;
        hs.bong[334] = -1141747184;
        hs.bong[335] = 826874434;
        hs.bong[336] = -122324828;
        hs.bong[337] = -876676299;
        hs.bong[338] = -65648496;
        hs.bong[339] = 1414490066;
        hs.bong[340] = -2093473805;
        hs.bong[341] = 73125724;
        hs.bong[342] = -876699046;
        hs.bong[343] = 1919228089;
        hs.bong[344] = 1316183601;
        hs.bong[345] = 1049637608;
        hs.bong[346] = 242439701;
        hs.bong[347] = 1811269903;
        hs.bong[348] = -447155519;
        hs.bong[349] = 1694157463;
        hs.bong[350] = -185108356;
        hs.bong[351] = 1659680550;
        hs.bong[352] = -1932687470;
        hs.bong[353] = -22278626;
        hs.bong[354] = -2144274142;
        hs.bong[355] = 1438994150;
        hs.bong[356] = 29645013;
        hs.bong[357] = -1870664573;
        hs.bong[358] = -951349507;
        hs.bong[359] = -1133243438;
        hs.bong[360] = 852766886;
        hs.bong[361] = -1062952973;
        hs.bong[362] = -646834555;
        hs.bong[363] = -1467486455;
        hs.bong[364] = -107762703;
        hs.bong[365] = 1107207202;
        hs.bong[366] = -1177731398;
        hs.bong[367] = -1782030359;
        hs.bong[368] = -292069651;
        hs.bong[369] = -148479454;
        hs.bong[370] = -524448808;
        hs.bong[371] = 1723029159;
        hs.bong[372] = -254310569;
        hs.bong[373] = -1191147432;
        hs.bong[374] = -1874272399;
        hs.bong[375] = -1493762679;
        hs.bong[376] = 567619059;
        hs.bong[377] = 694743016;
        hs.bong[378] = -661165833;
        hs.bong[379] = -2032098410;
        hs.bong[380] = -1896181045;
        hs.bong[381] = 579183723;
        hs.bong[382] = -143379751;
        hs.bong[383] = -2080522105;
        hs.bong[384] = -1707091073;
        hs.bong[385] = 1052216130;
        hs.bong[386] = -1610768502;
        hs.bong[387] = 800921961;
        hs.bong[388] = 722683955;
        hs.bong[389] = 1087493073;
        hs.bong[390] = -717672561;
        hs.bong[391] = -1332320676;
        hs.bong[392] = 1201719419;
        hs.bong[393] = 1355777951;
        hs.bong[394] = -448632015;
        hs.bong[395] = -1068862076;
        hs.bong[396] = 226483160;
        hs.bong[397] = -1082305578;
        hs.bong[398] = 569680630;
        hs.bong[399] = -619216039;
    }

    private static /* synthetic */ void bqdb() {
        hs.bonf[300] = -302553621;
        hs.bonf[301] = 1521116336;
        hs.bonf[302] = -2000619004;
        hs.bonf[303] = 1119219370;
        hs.bonf[304] = -1014538336;
        hs.bonf[305] = 120848550;
        hs.bonf[306] = 2081701629;
        hs.bonf[307] = -2121585625;
        hs.bonf[308] = -1508551730;
        hs.bonf[309] = 310100918;
        hs.bonf[310] = -1898983503;
        hs.bonf[311] = -1353902884;
        hs.bonf[312] = -1750579300;
        hs.bonf[313] = 1171790177;
        hs.bonf[314] = -1265553848;
        hs.bonf[315] = 1223639709;
        hs.bonf[316] = 1417481448;
        hs.bonf[317] = 643585780;
        hs.bonf[318] = -1500717713;
        hs.bonf[319] = -1831370578;
        hs.bonf[320] = -1013384644;
        hs.bonf[321] = -454974721;
        hs.bonf[322] = -1590515803;
        hs.bonf[323] = -286511822;
        hs.bonf[324] = -61410841;
        hs.bonf[325] = 917639637;
        hs.bonf[326] = -1890356842;
        hs.bonf[327] = 1132677819;
        hs.bonf[328] = 631130305;
        hs.bonf[329] = -1350403398;
        hs.bonf[330] = -1185463767;
        hs.bonf[331] = 1454270267;
        hs.bonf[332] = 862035933;
        hs.bonf[333] = 1368259949;
        hs.bonf[334] = -1141747184;
        hs.bonf[335] = 826874435;
        hs.bonf[336] = -122324830;
        hs.bonf[337] = -876676300;
        hs.bonf[338] = -65648492;
        hs.bonf[339] = 1414490078;
        hs.bonf[340] = -2093473800;
        hs.bonf[341] = 73125717;
        hs.bonf[342] = -876699042;
        hs.bonf[343] = 1919228092;
        hs.bonf[344] = 1316183613;
        hs.bonf[345] = 1049637613;
        hs.bonf[346] = 242439700;
        hs.bonf[347] = 1811269900;
        hs.bonf[348] = 447155518;
        hs.bonf[349] = -1968189356;
        hs.bonf[350] = -185108356;
        hs.bonf[351] = -1659680551;
        hs.bonf[352] = -947334808;
        hs.bonf[353] = -22278626;
        hs.bonf[354] = -2144274142;
        hs.bonf[355] = -1438994151;
        hs.bonf[356] = -1591320221;
        hs.bonf[357] = -1870664576;
        hs.bonf[358] = -951349508;
        hs.bonf[359] = -1133243435;
        hs.bonf[360] = 852766891;
        hs.bonf[361] = -1062952967;
        hs.bonf[362] = -646834558;
        hs.bonf[363] = -1467486462;
        hs.bonf[364] = -107762702;
        hs.bonf[365] = 1107207207;
        hs.bonf[366] = -1177731396;
        hs.bonf[367] = -1782030359;
        hs.bonf[368] = -292069663;
        hs.bonf[369] = -148479453;
        hs.bonf[370] = -524448816;
        hs.bonf[371] = -1723029160;
        hs.bonf[372] = 1338123653;
        hs.bonf[373] = 1191147431;
        hs.bonf[374] = 1279939369;
        hs.bonf[375] = -1493762673;
        hs.bonf[376] = 567619062;
        hs.bonf[377] = 694743023;
        hs.bonf[378] = -661165833;
        hs.bonf[379] = -2032098409;
        hs.bonf[380] = -1896181042;
        hs.bonf[381] = 579183721;
        hs.bonf[382] = -143379749;
        hs.bonf[383] = 2080522104;
        hs.bonf[384] = -339846343;
        hs.bonf[385] = 1052216128;
        hs.bonf[386] = -1610768498;
        hs.bonf[387] = 800921963;
        hs.bonf[388] = 722683959;
        hs.bonf[389] = 1087493077;
        hs.bonf[390] = 717672560;
        hs.bonf[391] = 917463946;
        hs.bonf[392] = 1201719418;
        hs.bonf[393] = 1355777951;
        hs.bonf[394] = -448632013;
        hs.bonf[395] = -1068862076;
        hs.bonf[396] = 226483162;
        hs.bonf[397] = 1082305577;
        hs.bonf[398] = -159965745;
        hs.bonf[399] = 619216038;
    }

    static {
        bonf = new int[458];
        bong = new int[458];
        hs.bqcy();
        hs.bqcz();
        hs.bqda();
        hs.bqdb();
        hs.bqdc();
        hs.bqdd();
        hs.bqde();
        hs.bqdf();
        hs.bqdg();
        hs.bqdh();
        bomu = new long[391];
        bomv = new long[391];
        hs.bqdi();
        hs.bqdj();
        hs.bqdk();
        hs.bqdl();
        hs.bqdm();
        hs.bqdn();
        hs.bqdo();
        hs.bqdp();
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void setGrimTicks(int var1_1) {
        while (true) {
            block39: {
                if ((v0 /* !! */  = (cfr_temp_1 = hs.dq - hs.bomw("bpxp", bomt(int ), (int)320)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  != hs.bomw("bpxq", bone(int ), (int)390)) break block39;
                var4_2 = hs.c;
                v1 /* !! */  = hs.dq;
                if (true) ** GOTO lbl13
            }
            v0 /* !! */  = (long)hs.bomw("bpxr", bone(int ), (int)391);
        }
        block25: while (true) {
            v1 /* !! */  = (long)(v2 - hs.bomw("bpxs", bomt(int ), (int)321));
lbl13:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1071414777: {
                    v2 = hs.bomw("bpxt", bomt(int ), (int)322);
                    continue block25;
                }
                case 1110152220: {
                    v2 = hs.bomw("bpxu", bomt(int ), (int)323);
                    continue block25;
                }
                case 1509767219: {
                    break block25;
                }
            }
            break;
        }
        var3_3 /* !! */  = hs.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    v3 /* !! */  = hs.dq;
                    block27: while (true) {
                        switch ((int)v3 /* !! */ ) {
                            case -129194997: {
                                v4 = hs.bomw("bpxw", bomt(int ), (int)325);
                                ** GOTO lbl41
                            }
                            case 522357615: {
                                v4 = hs.bomw("bpxx", bomt(int ), (int)326);
                                ** GOTO lbl41
                            }
                            case 1509767219: {
                                break block27;
                            }
                            case 2125392859: {
                                v4 = hs.bomw("bpxy", bomt(int ), (int)327);
lbl41:
                                // 3 sources

                                v3 /* !! */  = (long)(v4 - hs.bomw("bpxv", bomt(int ), (int)324));
                                continue block27;
                            }
                        }
                        break;
                    }
                    var2_4 = hs.a;
                    if (var4_2) {
                        throw null;
                    }
                    if (var2_4 || var2_4) ** GOTO lbl64
                    v5 /* !! */  = hs.dq;
                    block28: while (true) {
                        switch ((int)v5 /* !! */ ) {
                            case -401094429: {
                                v6 = hs.bomw("bpya", bomt(int ), (int)329);
                                ** GOTO lbl58
                            }
                            case 119820201: {
                                v6 = hs.bomw("bpyb", bomt(int ), (int)330);
                                ** GOTO lbl58
                            }
                            case 1032538190: {
                                v6 = hs.bomw("bpyc", bomt(int ), (int)331);
lbl58:
                                // 3 sources

                                v5 /* !! */  = (long)(v6 - hs.bomw("bpxz", bomt(int ), (int)328));
                                continue block28;
                            }
                            case 1509767219: {
                                break block28;
                            }
                        }
                        break;
                    }
                    this.grimTicks = var1_1;
                    if (!var2_4) ** GOTO lbl65
lbl64:
                    // 2 sources

                    return;
lbl65:
                    // 1 sources

                    return;
                }
                case 2: {
                    ** GOTO lbl72
                }
                case 4: {
                    var3_3 /* !! */  = (int)hs.bomw("bpyh", bone(int ), (int)396);
                    if (var4_2) {
                        throw null;
                    }
lbl72:
                    // 3 sources

                    var3_3 /* !! */  = (int)hs.bomw("bpyf", bone(int ), (int)394);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 3: {
                    do {
                        var3_3 /* !! */  = (int)hs.bomw("bpyg", bone(int ), (int)395);
                    } while (!var4_2);
                    throw null;
                }
                case 0: {
                    var3_3 /* !! */  = (int)hs.bomw("bpyd", bone(int ), (int)392);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 1: 
            }
            if (true) ** GOTO lbl88
            break;
        }
        do {
            if (true) ** continue;
lbl88:
            // 2 sources

            var3_3 /* !! */  = (int)hs.bomw("bpye", bone(int ), (int)393);
            cfr_temp_0 = 0;
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void bqcz() {
        hs.bonf[100] = 566482219;
        hs.bonf[101] = -321867062;
        hs.bonf[102] = 1349650168;
        hs.bonf[103] = -1467098219;
        hs.bonf[104] = 1862990730;
        hs.bonf[105] = 1132556838;
        hs.bonf[106] = -1246023076;
        hs.bonf[107] = 1430309687;
        hs.bonf[108] = -1856497251;
        hs.bonf[109] = -1346924756;
        hs.bonf[110] = 962018899;
        hs.bonf[111] = -1241096687;
        hs.bonf[112] = 750055002;
        hs.bonf[113] = -767059871;
        hs.bonf[114] = -1240576822;
        hs.bonf[115] = -502965998;
        hs.bonf[116] = 1637391373;
        hs.bonf[117] = 87576513;
        hs.bonf[118] = 625341440;
        hs.bonf[119] = 1794646889;
        hs.bonf[120] = -1254633823;
        hs.bonf[121] = 20396203;
        hs.bonf[122] = 785467526;
        hs.bonf[123] = -1090687490;
        hs.bonf[124] = -1883780752;
        hs.bonf[125] = -1507827611;
        hs.bonf[126] = 429865732;
        hs.bonf[127] = 1459224051;
        hs.bonf[128] = 1026670682;
        hs.bonf[129] = -148823049;
        hs.bonf[130] = 424479073;
        hs.bonf[131] = 1650457658;
        hs.bonf[132] = -229031517;
        hs.bonf[133] = -312490325;
        hs.bonf[134] = 264516082;
        hs.bonf[135] = 436018623;
        hs.bonf[136] = -190804208;
        hs.bonf[137] = 1000115553;
        hs.bonf[138] = -426782274;
        hs.bonf[139] = -1099845425;
        hs.bonf[140] = -623524109;
        hs.bonf[141] = -2103388783;
        hs.bonf[142] = 1565138537;
        hs.bonf[143] = 587148083;
        hs.bonf[144] = 1186683189;
        hs.bonf[145] = 1200071337;
        hs.bonf[146] = 1177817128;
        hs.bonf[147] = -612631231;
        hs.bonf[148] = 1396528672;
        hs.bonf[149] = -1326545766;
        hs.bonf[150] = -1622489316;
        hs.bonf[151] = -520006525;
        hs.bonf[152] = -978964588;
        hs.bonf[153] = -1971679470;
        hs.bonf[154] = -1676193446;
        hs.bonf[155] = -352594718;
        hs.bonf[156] = -249191713;
        hs.bonf[157] = 1119510962;
        hs.bonf[158] = -918436893;
        hs.bonf[159] = -1773253032;
        hs.bonf[160] = -1878301379;
        hs.bonf[161] = 1230038513;
        hs.bonf[162] = -1977247369;
        hs.bonf[163] = -644781540;
        hs.bonf[164] = -587746781;
        hs.bonf[165] = 1881873362;
        hs.bonf[166] = 243647579;
        hs.bonf[167] = -1305085695;
        hs.bonf[168] = -777451805;
        hs.bonf[169] = -800866654;
        hs.bonf[170] = -1316598221;
        hs.bonf[171] = -1137587347;
        hs.bonf[172] = 1915202652;
        hs.bonf[173] = 1383333507;
        hs.bonf[174] = 1961293180;
        hs.bonf[175] = 885651509;
        hs.bonf[176] = -1742590202;
        hs.bonf[177] = 1962336429;
        hs.bonf[178] = -1726668777;
        hs.bonf[179] = 219273212;
        hs.bonf[180] = -1201698686;
        hs.bonf[181] = -1895084019;
        hs.bonf[182] = -836551401;
        hs.bonf[183] = 869591321;
        hs.bonf[184] = -1665398525;
        hs.bonf[185] = 709211647;
        hs.bonf[186] = 872498512;
        hs.bonf[187] = 659037492;
        hs.bonf[188] = -568961667;
        hs.bonf[189] = -1209885241;
        hs.bonf[190] = -749613906;
        hs.bonf[191] = -70358700;
        hs.bonf[192] = -568670532;
        hs.bonf[193] = -310467049;
        hs.bonf[194] = 613046354;
        hs.bonf[195] = 1524970569;
        hs.bonf[196] = -2050578462;
        hs.bonf[197] = -1796782276;
        hs.bonf[198] = 1802591964;
        hs.bonf[199] = -1072735268;
    }

    private static /* synthetic */ int bone(int n2) {
        return bonf[n2] ^ bong[n2];
    }

    private static /* synthetic */ long bomt(int n2) {
        return bomu[n2] ^ bomv[n2];
    }

    private static /* synthetic */ void bqda() {
        hs.bonf[200] = -606675991;
        hs.bonf[201] = -1123685705;
        hs.bonf[202] = -1524008560;
        hs.bonf[203] = 1470486935;
        hs.bonf[204] = 12669235;
        hs.bonf[205] = -1352328561;
        hs.bonf[206] = 1703466064;
        hs.bonf[207] = -36093138;
        hs.bonf[208] = 1668763719;
        hs.bonf[209] = 978329458;
        hs.bonf[210] = -1784596784;
        hs.bonf[211] = -363300312;
        hs.bonf[212] = -1174242427;
        hs.bonf[213] = -66781058;
        hs.bonf[214] = 656301875;
        hs.bonf[215] = -1169663129;
        hs.bonf[216] = -450363253;
        hs.bonf[217] = -1970730659;
        hs.bonf[218] = 58454696;
        hs.bonf[219] = 1065507258;
        hs.bonf[220] = 40776210;
        hs.bonf[221] = 932980456;
        hs.bonf[222] = -175461208;
        hs.bonf[223] = -1857775341;
        hs.bonf[224] = 2128541317;
        hs.bonf[225] = -114222619;
        hs.bonf[226] = 1779941922;
        hs.bonf[227] = 629122849;
        hs.bonf[228] = 1195128076;
        hs.bonf[229] = -1613818039;
        hs.bonf[230] = 1304898261;
        hs.bonf[231] = 1411164202;
        hs.bonf[232] = 2064430840;
        hs.bonf[233] = -2089938432;
        hs.bonf[234] = -1914894361;
        hs.bonf[235] = 1025826380;
        hs.bonf[236] = -305655982;
        hs.bonf[237] = 1163446192;
        hs.bonf[238] = -1556194602;
        hs.bonf[239] = 801870247;
        hs.bonf[240] = 571743638;
        hs.bonf[241] = -1094821560;
        hs.bonf[242] = -620429021;
        hs.bonf[243] = 1793813118;
        hs.bonf[244] = 116976786;
        hs.bonf[245] = -1696142329;
        hs.bonf[246] = -1111453284;
        hs.bonf[247] = -1444009761;
        hs.bonf[248] = 1034343393;
        hs.bonf[249] = 616608062;
        hs.bonf[250] = -799563524;
        hs.bonf[251] = 698635365;
        hs.bonf[252] = -1948548190;
        hs.bonf[253] = -455332578;
        hs.bonf[254] = -934352049;
        hs.bonf[255] = -372999563;
        hs.bonf[256] = -2099963434;
        hs.bonf[257] = -1421355500;
        hs.bonf[258] = -683266808;
        hs.bonf[259] = -230059542;
        hs.bonf[260] = 2032107760;
        hs.bonf[261] = -2055351049;
        hs.bonf[262] = -1330972403;
        hs.bonf[263] = 803470961;
        hs.bonf[264] = 732834741;
        hs.bonf[265] = -264157431;
        hs.bonf[266] = 909445055;
        hs.bonf[267] = 482935103;
        hs.bonf[268] = 1753555487;
        hs.bonf[269] = -1818993591;
        hs.bonf[270] = 1253724166;
        hs.bonf[271] = -616792476;
        hs.bonf[272] = -215146935;
        hs.bonf[273] = 148765505;
        hs.bonf[274] = 1607534665;
        hs.bonf[275] = -828643929;
        hs.bonf[276] = 557208924;
        hs.bonf[277] = -1063367858;
        hs.bonf[278] = -560633878;
        hs.bonf[279] = -977908567;
        hs.bonf[280] = -595515163;
        hs.bonf[281] = 48420427;
        hs.bonf[282] = 1067484792;
        hs.bonf[283] = 573373062;
        hs.bonf[284] = -361052514;
        hs.bonf[285] = 1989398976;
        hs.bonf[286] = 1452620255;
        hs.bonf[287] = -1273573480;
        hs.bonf[288] = -2097992553;
        hs.bonf[289] = -822737630;
        hs.bonf[290] = -153109183;
        hs.bonf[291] = 1606813077;
        hs.bonf[292] = -650156175;
        hs.bonf[293] = 971829158;
        hs.bonf[294] = -792936135;
        hs.bonf[295] = 43533632;
        hs.bonf[296] = -1813245529;
        hs.bonf[297] = 1989051403;
        hs.bonf[298] = -882692324;
        hs.bonf[299] = 960484660;
    }

    private static /* synthetic */ void bqdk() {
        hs.bomu[200] = -4240581213891233944L;
        hs.bomu[201] = 4013800778923061596L;
        hs.bomu[202] = -1124158239343069621L;
        hs.bomu[203] = 4888987502785724269L;
        hs.bomu[204] = -99624213423045299L;
        hs.bomu[205] = 2655363218351737715L;
        hs.bomu[206] = -5828850078717353947L;
        hs.bomu[207] = -884934732470314275L;
        hs.bomu[208] = 4294389874861820216L;
        hs.bomu[209] = 5943694357880446564L;
        hs.bomu[210] = -2790601866605907641L;
        hs.bomu[211] = 6920766269028574570L;
        hs.bomu[212] = -2062509958894552558L;
        hs.bomu[213] = -1990205916585106370L;
        hs.bomu[214] = -7086056819893187346L;
        hs.bomu[215] = -3291828422092606456L;
        hs.bomu[216] = 2335613217942050992L;
        hs.bomu[217] = 1486092358653806867L;
        hs.bomu[218] = -8358950588782535279L;
        hs.bomu[219] = -969458385822278738L;
        hs.bomu[220] = 2870830940417724961L;
        hs.bomu[221] = 1594386532668800650L;
        hs.bomu[222] = 7628210829864921495L;
        hs.bomu[223] = 2258100024754829859L;
        hs.bomu[224] = -7871952562320734387L;
        hs.bomu[225] = 8883804532076437849L;
        hs.bomu[226] = 2803094153285888645L;
        hs.bomu[227] = 4747537290860073097L;
        hs.bomu[228] = -900235896962134604L;
        hs.bomu[229] = -3875277404550588059L;
        hs.bomu[230] = -7417371263069934176L;
        hs.bomu[231] = 4845363921766305143L;
        hs.bomu[232] = -6462069249059306905L;
        hs.bomu[233] = -8159990990386015076L;
        hs.bomu[234] = -301586519395667486L;
        hs.bomu[235] = -2245777452907916092L;
        hs.bomu[236] = -893914741879429142L;
        hs.bomu[237] = 4866918740754119772L;
        hs.bomu[238] = 6962678071826203482L;
        hs.bomu[239] = 4193943961458364580L;
        hs.bomu[240] = -8968193374095830261L;
        hs.bomu[241] = -5027879388761692853L;
        hs.bomu[242] = 8111028535463830501L;
        hs.bomu[243] = 5575659611976955655L;
        hs.bomu[244] = -2155990778072564972L;
        hs.bomu[245] = -3280019147682726976L;
        hs.bomu[246] = -6635754310690786534L;
        hs.bomu[247] = 4029798135865993043L;
        hs.bomu[248] = 8802041100984361732L;
        hs.bomu[249] = -4849789353541545288L;
        hs.bomu[250] = 251626071122615176L;
        hs.bomu[251] = 6083767208827969096L;
        hs.bomu[252] = 1994303343597922305L;
        hs.bomu[253] = -3501218027402720301L;
        hs.bomu[254] = 3001865164855246405L;
        hs.bomu[255] = 835906846168683737L;
        hs.bomu[256] = 3956148895021852630L;
        hs.bomu[257] = 2287241652201472051L;
        hs.bomu[258] = -2303401594509984939L;
        hs.bomu[259] = 7537727662415484756L;
        hs.bomu[260] = 4126780739322916872L;
        hs.bomu[261] = 1252753223386849042L;
        hs.bomu[262] = -3185664876600532887L;
        hs.bomu[263] = -2875967854693939224L;
        hs.bomu[264] = 1431903691330984077L;
        hs.bomu[265] = 7267019827151524372L;
        hs.bomu[266] = -6409839835113713493L;
        hs.bomu[267] = 7748538529653405923L;
        hs.bomu[268] = -9155198552474166190L;
        hs.bomu[269] = -5836310441034773618L;
        hs.bomu[270] = 8750485157054161965L;
        hs.bomu[271] = 4675141890758196130L;
        hs.bomu[272] = 3671884287091578189L;
        hs.bomu[273] = -6653626631551398176L;
        hs.bomu[274] = 5554197910277387518L;
        hs.bomu[275] = 8881564965584172132L;
        hs.bomu[276] = 54105085371185738L;
        hs.bomu[277] = 23518659595807082L;
        hs.bomu[278] = 3939991670999552895L;
        hs.bomu[279] = 3959456526116860387L;
        hs.bomu[280] = 9085022075055734770L;
        hs.bomu[281] = 3012423054336031219L;
        hs.bomu[282] = 6894398165092035472L;
        hs.bomu[283] = 6863076547635617065L;
        hs.bomu[284] = 2568945442129847311L;
        hs.bomu[285] = -4222027794611159781L;
        hs.bomu[286] = 2601631703569550552L;
        hs.bomu[287] = 230057019546992102L;
        hs.bomu[288] = -1800932508018907481L;
        hs.bomu[289] = -5703735139599476340L;
        hs.bomu[290] = 2815450768511923269L;
        hs.bomu[291] = -4369698006109202766L;
        hs.bomu[292] = -3967626578268150143L;
        hs.bomu[293] = 3631871687334810564L;
        hs.bomu[294] = -2640382443235945407L;
        hs.bomu[295] = 5610527066676081640L;
        hs.bomu[296] = -4192014949402293711L;
        hs.bomu[297] = -1140183724064415210L;
        hs.bomu[298] = -3849208299223354642L;
        hs.bomu[299] = 2863716030363519956L;
    }

    private static /* synthetic */ double bopr(int n2) {
        return Double.longBitsToDouble(bomu[n2] ^ bomv[n2]);
    }

    private static /* synthetic */ void bqdf() {
        hs.bong[200] = -606675986;
        hs.bong[201] = -1123685725;
        hs.bong[202] = -1524008571;
        hs.bong[203] = 1470486916;
        hs.bong[204] = 12669236;
        hs.bong[205] = -1352328569;
        hs.bong[206] = 1703466065;
        hs.bong[207] = -36093146;
        hs.bong[208] = 1668763721;
        hs.bong[209] = 978329442;
        hs.bong[210] = 1784596783;
        hs.bong[211] = 1079646224;
        hs.bong[212] = 1174242426;
        hs.bong[213] = -1985235613;
        hs.bong[214] = -656301876;
        hs.bong[215] = -1364665912;
        hs.bong[216] = 450363252;
        hs.bong[217] = -1132483007;
        hs.bong[218] = -58454697;
        hs.bong[219] = 517211265;
        hs.bong[220] = -40776211;
        hs.bong[221] = 1106047067;
        hs.bong[222] = 175461207;
        hs.bong[223] = 1315714273;
        hs.bong[224] = -2128541318;
        hs.bong[225] = -1934011336;
        hs.bong[226] = -1779941923;
        hs.bong[227] = -831726787;
        hs.bong[228] = 2075316025;
        hs.bong[229] = 1613818038;
        hs.bong[230] = 879130688;
        hs.bong[231] = -1411164203;
        hs.bong[232] = -1062414541;
        hs.bong[233] = -2089938431;
        hs.bong[234] = -1779352469;
        hs.bong[235] = -1025826381;
        hs.bong[236] = -1779667199;
        hs.bong[237] = -1163446193;
        hs.bong[238] = 425226385;
        hs.bong[239] = 801870246;
        hs.bong[240] = -340278071;
        hs.bong[241] = 1094821559;
        hs.bong[242] = -2132076162;
        hs.bong[243] = -1793813119;
        hs.bong[244] = 1395644367;
        hs.bong[245] = 1696142328;
        hs.bong[246] = 1672458012;
        hs.bong[247] = 1444009760;
        hs.bong[248] = 1144670385;
        hs.bong[249] = -616608063;
        hs.bong[250] = 509709141;
        hs.bong[251] = -698635366;
        hs.bong[252] = 110431248;
        hs.bong[253] = 455332577;
        hs.bong[254] = -526994884;
        hs.bong[255] = 372999562;
        hs.bong[256] = -2016609244;
        hs.bong[257] = 1421355499;
        hs.bong[258] = 1762901131;
        hs.bong[259] = 230059541;
        hs.bong[260] = -942121226;
        hs.bong[261] = -2055351051;
        hs.bong[262] = -1330972404;
        hs.bong[263] = 803470961;
        hs.bong[264] = 732834738;
        hs.bong[265] = -264157411;
        hs.bong[266] = 909445040;
        hs.bong[267] = 482935095;
        hs.bong[268] = 1753555484;
        hs.bong[269] = -1818993593;
        hs.bong[270] = 1253724169;
        hs.bong[271] = -616792468;
        hs.bong[272] = -215146920;
        hs.bong[273] = 148765513;
        hs.bong[274] = 1607534659;
        hs.bong[275] = -828643935;
        hs.bong[276] = 557208909;
        hs.bong[277] = -1063367863;
        hs.bong[278] = -560633864;
        hs.bong[279] = -977908571;
        hs.bong[280] = -595515156;
        hs.bong[281] = 48420427;
        hs.bong[282] = 1067484792;
        hs.bong[283] = 573373062;
        hs.bong[284] = -361052524;
        hs.bong[285] = 1989398982;
        hs.bong[286] = 1452620235;
        hs.bong[287] = 1273573479;
        hs.bong[288] = 237886505;
        hs.bong[289] = 822737629;
        hs.bong[290] = 693134893;
        hs.bong[291] = -1606813078;
        hs.bong[292] = -409204616;
        hs.bong[293] = -971829159;
        hs.bong[294] = -1885229524;
        hs.bong[295] = -43533633;
        hs.bong[296] = -1655917772;
        hs.bong[297] = -1989051404;
        hs.bong[298] = 1574612811;
        hs.bong[299] = -960484661;
    }

    private static /* synthetic */ void bqde() {
        hs.bong[100] = 566482227;
        hs.bong[101] = -321867031;
        hs.bong[102] = 1349650132;
        hs.bong[103] = -1467098201;
        hs.bong[104] = 1862990743;
        hs.bong[105] = 1132556845;
        hs.bong[106] = -1246023096;
        hs.bong[107] = 1430309683;
        hs.bong[108] = -1856497224;
        hs.bong[109] = -1346924759;
        hs.bong[110] = 962018926;
        hs.bong[111] = -1241096662;
        hs.bong[112] = 750054998;
        hs.bong[113] = -767059877;
        hs.bong[114] = -1240576803;
        hs.bong[115] = -502966012;
        hs.bong[116] = 1637391390;
        hs.bong[117] = 87576546;
        hs.bong[118] = 625341446;
        hs.bong[119] = 1794646911;
        hs.bong[120] = -1254633833;
        hs.bong[121] = 20396184;
        hs.bong[122] = 785467579;
        hs.bong[123] = -1090687530;
        hs.bong[124] = -1883780799;
        hs.bong[125] = -1507827611;
        hs.bong[126] = -429865733;
        hs.bong[127] = -2105017390;
        hs.bong[128] = -1026670683;
        hs.bong[129] = 1846126300;
        hs.bong[130] = -424479074;
        hs.bong[131] = -1226923561;
        hs.bong[132] = 229031516;
        hs.bong[133] = -1810782336;
        hs.bong[134] = -264516083;
        hs.bong[135] = -2123318136;
        hs.bong[136] = -190804207;
        hs.bong[137] = -1000115554;
        hs.bong[138] = -1753383608;
        hs.bong[139] = -1099845426;
        hs.bong[140] = 623524108;
        hs.bong[141] = 586216044;
        hs.bong[142] = -1565138538;
        hs.bong[143] = -599073640;
        hs.bong[144] = 1186683184;
        hs.bong[145] = -1200071338;
        hs.bong[146] = -960370291;
        hs.bong[147] = -612631231;
        hs.bong[148] = 1396528677;
        hs.bong[149] = -1326545767;
        hs.bong[150] = -1622489328;
        hs.bong[151] = -520006519;
        hs.bong[152] = -978964582;
        hs.bong[153] = -1971679460;
        hs.bong[154] = -1676193451;
        hs.bong[155] = -352594717;
        hs.bong[156] = -249191716;
        hs.bong[157] = 1119510966;
        hs.bong[158] = -918436877;
        hs.bong[159] = -1773253037;
        hs.bong[160] = -1878301395;
        hs.bong[161] = 1230038514;
        hs.bong[162] = -1977247372;
        hs.bong[163] = -644781555;
        hs.bong[164] = -587746780;
        hs.bong[165] = 1881873374;
        hs.bong[166] = -243647580;
        hs.bong[167] = -623895849;
        hs.bong[168] = 777451804;
        hs.bong[169] = 1035694705;
        hs.bong[170] = 1316598220;
        hs.bong[171] = -1418786689;
        hs.bong[172] = -1915202653;
        hs.bong[173] = 1935651082;
        hs.bong[174] = -1961293181;
        hs.bong[175] = -811192484;
        hs.bong[176] = 1742590201;
        hs.bong[177] = -498806015;
        hs.bong[178] = 1726668776;
        hs.bong[179] = -1640876397;
        hs.bong[180] = -1201698685;
        hs.bong[181] = -1895084007;
        hs.bong[182] = -836551397;
        hs.bong[183] = 869591298;
        hs.bong[184] = -1665398497;
        hs.bong[185] = 709211645;
        hs.bong[186] = 872498502;
        hs.bong[187] = 659037474;
        hs.bong[188] = -568961682;
        hs.bong[189] = -1209885232;
        hs.bong[190] = -749613895;
        hs.bong[191] = -70358692;
        hs.bong[192] = -568670531;
        hs.bong[193] = -310467056;
        hs.bong[194] = 613046346;
        hs.bong[195] = 1524970591;
        hs.bong[196] = -2050578440;
        hs.bong[197] = -1796782278;
        hs.bong[198] = 1802591957;
        hs.bong[199] = -1072735265;
    }

    private static /* synthetic */ void bqdi() {
        hs.bomu[0] = 1972163024813733415L;
        hs.bomu[1] = 4877663430903119798L;
        hs.bomu[2] = 4742950127983625850L;
        hs.bomu[3] = 27543766041461071L;
        hs.bomu[4] = -5986342729827854522L;
        hs.bomu[5] = 2946119150167029441L;
        hs.bomu[6] = 9184276353337074240L;
        hs.bomu[7] = 8596142207954060772L;
        hs.bomu[8] = -341290623208322582L;
        hs.bomu[9] = 9099049961598729594L;
        hs.bomu[10] = 7712463325398195505L;
        hs.bomu[11] = -2590062495109580155L;
        hs.bomu[12] = -1391367760242081365L;
        hs.bomu[13] = -5256372522361415953L;
        hs.bomu[14] = -2652826512973728716L;
        hs.bomu[15] = -7164940400035306161L;
        hs.bomu[16] = -4069197511522538374L;
        hs.bomu[17] = 1152701699558722039L;
        hs.bomu[18] = -6512792494237505547L;
        hs.bomu[19] = -616603543390190168L;
        hs.bomu[20] = -6496676221350537044L;
        hs.bomu[21] = 7232126794234630770L;
        hs.bomu[22] = 6293815902527926958L;
        hs.bomu[23] = 8042971276826150689L;
        hs.bomu[24] = 7667880378071868759L;
        hs.bomu[25] = 6802378301293809139L;
        hs.bomu[26] = 2268490655888017343L;
        hs.bomu[27] = 3233474436461653711L;
        hs.bomu[28] = -7131745167708342146L;
        hs.bomu[29] = 407544427932926416L;
        hs.bomu[30] = -8742188271321646543L;
        hs.bomu[31] = 7431642408552093071L;
        hs.bomu[32] = 3971552413043610536L;
        hs.bomu[33] = -2886972250174586434L;
        hs.bomu[34] = 6730051424493052480L;
        hs.bomu[35] = 4735011074572687561L;
        hs.bomu[36] = -9101637571973124650L;
        hs.bomu[37] = 833575840729055956L;
        hs.bomu[38] = -3441008241492517376L;
        hs.bomu[39] = 2983847476673844526L;
        hs.bomu[40] = -7311559520859033487L;
        hs.bomu[41] = 1176787689450903739L;
        hs.bomu[42] = -8802313892612494693L;
        hs.bomu[43] = -6540671336392846844L;
        hs.bomu[44] = 956630135629640397L;
        hs.bomu[45] = 8427023287959969525L;
        hs.bomu[46] = -7550345093828750743L;
        hs.bomu[47] = 2177474373561550509L;
        hs.bomu[48] = 5813421935213764331L;
        hs.bomu[49] = -4972549607420060918L;
        hs.bomu[50] = -342704996047507897L;
        hs.bomu[51] = -1728315799780902753L;
        hs.bomu[52] = -3059149911581410989L;
        hs.bomu[53] = 7415374171561918070L;
        hs.bomu[54] = 7416375685205733376L;
        hs.bomu[55] = 1483930332927045288L;
        hs.bomu[56] = 8095528335609087440L;
        hs.bomu[57] = 7511295305004220161L;
        hs.bomu[58] = 2032351174907217614L;
        hs.bomu[59] = 5304266845301183700L;
        hs.bomu[60] = 8810792841730200760L;
        hs.bomu[61] = -4108968568762492029L;
        hs.bomu[62] = 1090381378065134298L;
        hs.bomu[63] = 2546701098320981804L;
        hs.bomu[64] = -5110785110974718335L;
        hs.bomu[65] = -7954650218235457156L;
        hs.bomu[66] = 6410179478493671850L;
        hs.bomu[67] = 1242764263520443619L;
        hs.bomu[68] = 5802760956179876070L;
        hs.bomu[69] = 3431615233721003436L;
        hs.bomu[70] = 4665755547153924734L;
        hs.bomu[71] = -1397872899110768363L;
        hs.bomu[72] = -8731096870689297045L;
        hs.bomu[73] = 4679358071056290703L;
        hs.bomu[74] = -4483187948558445897L;
        hs.bomu[75] = -1841068667460674245L;
        hs.bomu[76] = -1786034218136165220L;
        hs.bomu[77] = -7825298291793605419L;
        hs.bomu[78] = 7629823485316971843L;
        hs.bomu[79] = -7801847227836036592L;
        hs.bomu[80] = -3313352395138490972L;
        hs.bomu[81] = 936234969994429790L;
        hs.bomu[82] = -8166099791211685989L;
        hs.bomu[83] = -9129732364989272757L;
        hs.bomu[84] = 4603173223637968562L;
        hs.bomu[85] = -2078397920442124876L;
        hs.bomu[86] = 109503784692476443L;
        hs.bomu[87] = -1749376473099720685L;
        hs.bomu[88] = -2537467334432882444L;
        hs.bomu[89] = 4027883263414922175L;
        hs.bomu[90] = -1886835120583931213L;
        hs.bomu[91] = -4975668992873531629L;
        hs.bomu[92] = 2654698325216676526L;
        hs.bomu[93] = -3307753115792567111L;
        hs.bomu[94] = -6311493882512123441L;
        hs.bomu[95] = -265782452253675192L;
        hs.bomu[96] = -2851115489324446405L;
        hs.bomu[97] = 8627451973110965898L;
        hs.bomu[98] = -6442157706921567257L;
        hs.bomu[99] = -7521213081222107376L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public class_243 getPendingVelocity() {
        while (true) {
            block30: {
                if ((v0 /* !! */  = (cfr_temp_1 = hs.dq - hs.bomw("bqch", bomt(int ), (int)382)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  != hs.bomw("bqci", bone(int ), (int)450)) break block30;
                var3_1 = hs.c;
                v1 /* !! */  = hs.dq;
                if (true) ** GOTO lbl13
            }
            v0 /* !! */  = (long)hs.bomw("bqcj", bone(int ), (int)451);
        }
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - hs.bomw("bqck", bomt(int ), (int)383));
lbl13:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -222265779: {
                    v2 = hs.bomw("bqcl", bomt(int ), (int)384);
                    continue block18;
                }
                case 529691834: {
                    v2 = hs.bomw("bqcm", bomt(int ), (int)385);
                    continue block18;
                }
                case 575319328: {
                    v2 = hs.bomw("bqcn", bomt(int ), (int)386);
                    continue block18;
                }
                case 1509767219: {
                    break block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = hs.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = hs.dq - hs.bomw("bqco", bomt(int ), (int)387)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hs.bomw("bqcp", bone(int ), (int)452)) {
                var1_3 = hs.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)hs.bomw("bqcq", bone(int ), (int)453);
        }
        if (var1_3 != false) return null;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block20: while (true) {
            block31: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 != false) return null;
                        v4 /* !! */  = hs.dq;
                        block21: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -1874548112: {
                                    v5 = hs.bomw("bqcs", bomt(int ), (int)389);
                                    ** GOTO lbl51
                                }
                                case 674371163: {
                                    v5 = hs.bomw("bqct", bomt(int ), (int)390);
lbl51:
                                    // 2 sources

                                    v4 /* !! */  = (long)(v5 - hs.bomw("bqcr", bomt(int ), (int)388));
                                    continue block21;
                                }
                                case 1509767219: {
                                    return this.pendingVelocity;
                                }
                            }
                            break;
                        }
                        return this.pendingVelocity;
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)hs.bomw("bqcu", bone(int ), (int)454);
                        cfr_temp_0 = 2;
                        if (var3_1) {
                            throw null;
                        }
                        break block31;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)hs.bomw("bqcx", bone(int ), (int)457);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 1: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)hs.bomw("bqcv", bone(int ), (int)455);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl76
            }
            do {
                if (true) continue block20;
lbl76:
                // 2 sources

                var2_2 /* !! */  = (int)hs.bomw("bqcw", bone(int ), (int)456);
                cfr_temp_0 = 1;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void setFlag(boolean var1_1) {
        block37: {
            v0 /* !! */  = hs.dq;
            if (true) ** GOTO lbl5
            block24: while (true) {
                v0 /* !! */  = (long)(v1 - hs.bomw("bpww", bomt(int ), (int)308));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -695268125: {
                        v1 = hs.bomw("bpwx", bomt(int ), (int)309);
                        continue block24;
                    }
                    case -157404646: {
                        v1 = hs.bomw("bpwy", bomt(int ), (int)310);
                        continue block24;
                    }
                    case 867749838: {
                        v1 = hs.bomw("bpwz", bomt(int ), (int)311);
                        continue block24;
                    }
                    case 1509767219: {
                        break block24;
                    }
                }
                break;
            }
            var4_2 = hs.c;
            while (true) {
                block38: {
                    if ((v2 /* !! */  = (cfr_temp_1 = hs.dq - hs.bomw("bpxa", bomt(int ), (int)312)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  != hs.bomw("bpxb", bone(int ), (int)383)) break block38;
                    var3_3 /* !! */  = hs.b;
                    v3 /* !! */  = hs.dq;
                    if (true) ** GOTO lbl30
                }
                v2 /* !! */  = (long)hs.bomw("bpxc", bone(int ), (int)384);
            }
            block26: while (true) {
                v3 /* !! */  = (long)(v4 - hs.bomw("bpxd", bomt(int ), (int)313));
lbl30:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -690069010: {
                        v4 = hs.bomw("bpxe", bomt(int ), (int)314);
                        continue block26;
                    }
                    case 294819754: {
                        v4 = hs.bomw("bpxf", bomt(int ), (int)315);
                        continue block26;
                    }
                    case 1509767219: {
                        break block26;
                    }
                }
                break;
            }
            var2_4 = hs.a;
            if (var4_2) {
                throw null;
            }
            if (var2_4 || var2_4) ** GOTO lbl66
            v5 /* !! */  = hs.dq;
            if (true) ** GOTO lbl47
            block27: while (true) {
                v5 /* !! */  = (long)(v6 - hs.bomw("bpxg", bomt(int ), (int)316));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1723322667: {
                        v6 = hs.bomw("bpxh", bomt(int ), (int)317);
                        continue block27;
                    }
                    case -1170260176: {
                        v6 = hs.bomw("bpxi", bomt(int ), (int)318);
                        continue block27;
                    }
                    case 840146214: {
                        v6 = hs.bomw("bpxj", bomt(int ), (int)319);
                        continue block27;
                    }
                    case 1509767219: {
                        break block27;
                    }
                }
                break;
            }
            this.flag = var1_1;
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block28: do {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (!var2_4) ** GOTO lbl67
lbl66:
                        // 2 sources

                        return;
lbl67:
                        // 1 sources

                        return;
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)hs.bomw("bpxm", bone(int ), (int)387);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 0: {
                        ** break;
                    }
                    case 3: {
                        do {
                            var3_3 /* !! */  = (int)hs.bomw("bpxn", bone(int ), (int)388);
                        } while (!var4_2);
                        throw null;
                    }
                    case 4: {
                        break block37;
                    }
lbl81:
                    // 2 sources

                    while (true) {
                        var3_3 /* !! */  = (int)hs.bomw("bpxk", bone(int ), (int)385);
                        cfr_temp_0 = 1;
                        if (!var4_2) continue block28;
                        throw null;
                    }
                    case 1: 
                }
                break;
            } while (true);
            var3_3 /* !! */  = (int)hs.bomw("bpxl", bone(int ), (int)386);
            if (!var4_2) ** break;
            throw null;
        }
        var3_3 /* !! */  = (int)hs.bomw("bpxo", bone(int ), (int)389);
        ** while (!var4_2)
lbl95:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bqdp() {
        hs.bomv[300] = 3004279049608482288L;
        hs.bomv[301] = -3060484632868075686L;
        hs.bomv[302] = 974456211055657691L;
        hs.bomv[303] = 6310310879814807041L;
        hs.bomv[304] = -235261648982866560L;
        hs.bomv[305] = 6602465638747988458L;
        hs.bomv[306] = 2801113086540742299L;
        hs.bomv[307] = -9089638337104438381L;
        hs.bomv[308] = 5614697848634464613L;
        hs.bomv[309] = 4027808584589297327L;
        hs.bomv[310] = 4665771644012775422L;
        hs.bomv[311] = 7263173156688710461L;
        hs.bomv[312] = 4372464184118902285L;
        hs.bomv[313] = -8620653518069865524L;
        hs.bomv[314] = 1680355359915699147L;
        hs.bomv[315] = 932747035885833719L;
        hs.bomv[316] = 5244946745618095415L;
        hs.bomv[317] = 4579301108746951123L;
        hs.bomv[318] = 7135200936665539383L;
        hs.bomv[319] = -4841942466870229647L;
        hs.bomv[320] = 4573432183010218599L;
        hs.bomv[321] = -2856147951444199354L;
        hs.bomv[322] = -5086459458813923597L;
        hs.bomv[323] = 4494005993621502592L;
        hs.bomv[324] = 7191890884816182894L;
        hs.bomv[325] = -5841611495996160313L;
        hs.bomv[326] = -7653104393491290211L;
        hs.bomv[327] = 3964050298316925787L;
        hs.bomv[328] = 8999420035365952452L;
        hs.bomv[329] = -7645808058601321829L;
        hs.bomv[330] = 5367735460044036677L;
        hs.bomv[331] = -7220551251765726241L;
        hs.bomv[332] = -3555240513383266432L;
        hs.bomv[333] = -6481317276838940489L;
        hs.bomv[334] = 1663366150574678347L;
        hs.bomv[335] = -4278350450615408742L;
        hs.bomv[336] = -5119505755471241741L;
        hs.bomv[337] = 8852216129078443502L;
        hs.bomv[338] = 3911669827664556040L;
        hs.bomv[339] = 8420694336655648096L;
        hs.bomv[340] = 2561385607243312029L;
        hs.bomv[341] = 9018526803227061926L;
        hs.bomv[342] = 226614235098938830L;
        hs.bomv[343] = 4230007611375035364L;
        hs.bomv[344] = 7109509654964233212L;
        hs.bomv[345] = -4658545945589141952L;
        hs.bomv[346] = 3365941954983056432L;
        hs.bomv[347] = 384679694280516822L;
        hs.bomv[348] = -1080592472971855675L;
        hs.bomv[349] = -1214646411081909601L;
        hs.bomv[350] = -574579450022631906L;
        hs.bomv[351] = 2171734384250379901L;
        hs.bomv[352] = -767114294297005486L;
        hs.bomv[353] = 4415425391086131157L;
        hs.bomv[354] = 6696866042895986938L;
        hs.bomv[355] = 6627030231049853686L;
        hs.bomv[356] = 5508282695935891745L;
        hs.bomv[357] = 2466468717740138571L;
        hs.bomv[358] = 3146955356434396649L;
        hs.bomv[359] = 2538060228762803811L;
        hs.bomv[360] = 7686400040616198494L;
        hs.bomv[361] = 3950669267501853106L;
        hs.bomv[362] = -4223123352166308011L;
        hs.bomv[363] = 2859713074895589007L;
        hs.bomv[364] = 7248374300585446071L;
        hs.bomv[365] = 6430405513663222496L;
        hs.bomv[366] = 6969672387526447366L;
        hs.bomv[367] = 9010190763555293178L;
        hs.bomv[368] = -3100853496279186672L;
        hs.bomv[369] = -8861895036693977609L;
        hs.bomv[370] = 2968115919791549988L;
        hs.bomv[371] = 7250529370115225549L;
        hs.bomv[372] = -59584404501380316L;
        hs.bomv[373] = -5428941092488109968L;
        hs.bomv[374] = -1088171762638142087L;
        hs.bomv[375] = 718348489285240035L;
        hs.bomv[376] = 6046204210754196250L;
        hs.bomv[377] = 7182268755116251031L;
        hs.bomv[378] = 1882957449959302046L;
        hs.bomv[379] = 7278968336111252346L;
        hs.bomv[380] = -8258395270046116946L;
        hs.bomv[381] = 2226728081200210611L;
        hs.bomv[382] = 5875547082215171901L;
        hs.bomv[383] = -4472703218735084818L;
        hs.bomv[384] = 6317815797138733449L;
        hs.bomv[385] = 1343753240466727228L;
        hs.bomv[386] = -4177922940505180767L;
        hs.bomv[387] = -5477251322143695979L;
        hs.bomv[388] = 7805779157243075151L;
        hs.bomv[389] = 3610201974059083754L;
        hs.bomv[390] = 1766669193767267768L;
    }

    private static /* synthetic */ void bqdn() {
        hs.bomv[100] = 3971248040114340953L;
        hs.bomv[101] = 6940817058642621247L;
        hs.bomv[102] = -7681538283782245089L;
        hs.bomv[103] = -1896963245081994756L;
        hs.bomv[104] = -6346304666197555137L;
        hs.bomv[105] = -6143042902797597532L;
        hs.bomv[106] = -2358680894617526424L;
        hs.bomv[107] = 3407144495692264995L;
        hs.bomv[108] = 5752365731548617013L;
        hs.bomv[109] = 7192392461315208379L;
        hs.bomv[110] = 2685720200926949465L;
        hs.bomv[111] = 270164725095882335L;
        hs.bomv[112] = 2265534745133554200L;
        hs.bomv[113] = 2293794923299608568L;
        hs.bomv[114] = 7224170846580311976L;
        hs.bomv[115] = -6924625505755942728L;
        hs.bomv[116] = 5856164357169338887L;
        hs.bomv[117] = 1573090803706425931L;
        hs.bomv[118] = 8605380328677756276L;
        hs.bomv[119] = 5329516104486617191L;
        hs.bomv[120] = 7800479077606344961L;
        hs.bomv[121] = -4845908019512075153L;
        hs.bomv[122] = -5579201911626954243L;
        hs.bomv[123] = 6180082656629868220L;
        hs.bomv[124] = 3706746684498710377L;
        hs.bomv[125] = 8682690382617800619L;
        hs.bomv[126] = -7079884006813971382L;
        hs.bomv[127] = -2437766723242321722L;
        hs.bomv[128] = -6106228595618052958L;
        hs.bomv[129] = -8424953750036301857L;
        hs.bomv[130] = -3655273538548867469L;
        hs.bomv[131] = -3815269327269208263L;
        hs.bomv[132] = 290982751884793959L;
        hs.bomv[133] = -6963383665897630990L;
        hs.bomv[134] = -4871443733033895616L;
        hs.bomv[135] = 2664436258962425905L;
        hs.bomv[136] = -3663993619105927169L;
        hs.bomv[137] = 7217080763508465088L;
        hs.bomv[138] = -3641427050935852272L;
        hs.bomv[139] = -5740699625043133530L;
        hs.bomv[140] = 4521769543181902010L;
        hs.bomv[141] = -8355700480502402921L;
        hs.bomv[142] = 7048210562496403778L;
        hs.bomv[143] = -5313996484405740475L;
        hs.bomv[144] = 8714476805761006556L;
        hs.bomv[145] = -5094377561331920735L;
        hs.bomv[146] = -6857592007414051952L;
        hs.bomv[147] = -900461390308915578L;
        hs.bomv[148] = 2565800724788327794L;
        hs.bomv[149] = 6901314384220986118L;
        hs.bomv[150] = 4621818800995517447L;
        hs.bomv[151] = 7839794596804286461L;
        hs.bomv[152] = -3740897228397168476L;
        hs.bomv[153] = -1737641084459267113L;
        hs.bomv[154] = 7447568105238421481L;
        hs.bomv[155] = -409457122462810038L;
        hs.bomv[156] = 3230233535452229918L;
        hs.bomv[157] = -1666959850717614513L;
        hs.bomv[158] = 3737408298137915094L;
        hs.bomv[159] = 9038741357649527818L;
        hs.bomv[160] = 76316773329489587L;
        hs.bomv[161] = -1882703732081993257L;
        hs.bomv[162] = -3123091101844608660L;
        hs.bomv[163] = -6852435126477769116L;
        hs.bomv[164] = -4102792602634206275L;
        hs.bomv[165] = -7218857663399214533L;
        hs.bomv[166] = -8486487379248899684L;
        hs.bomv[167] = 3791105898785508085L;
        hs.bomv[168] = 6795898232944552723L;
        hs.bomv[169] = -144444054216082479L;
        hs.bomv[170] = -1838339343938169170L;
        hs.bomv[171] = 7278724484621280674L;
        hs.bomv[172] = 2445423551746625962L;
        hs.bomv[173] = -7263378439642467584L;
        hs.bomv[174] = -5569471772126474953L;
        hs.bomv[175] = -6263549645362320532L;
        hs.bomv[176] = 1735562795125969501L;
        hs.bomv[177] = 3980759504137824336L;
        hs.bomv[178] = 126254673813950426L;
        hs.bomv[179] = 8387940688938776184L;
        hs.bomv[180] = 2870623750438591333L;
        hs.bomv[181] = 841670818150226364L;
        hs.bomv[182] = -820484972901551072L;
        hs.bomv[183] = -4804485475079597550L;
        hs.bomv[184] = 8369279445548856813L;
        hs.bomv[185] = -680049271472326950L;
        hs.bomv[186] = 7497400546878002809L;
        hs.bomv[187] = 6394811388553575003L;
        hs.bomv[188] = 7132180977705614605L;
        hs.bomv[189] = -1574229136206813382L;
        hs.bomv[190] = 2585083873170522997L;
        hs.bomv[191] = 4037772516687240607L;
        hs.bomv[192] = -5498249675182372419L;
        hs.bomv[193] = 5008920524412067497L;
        hs.bomv[194] = 3259464255898939074L;
        hs.bomv[195] = -8136923342956909236L;
        hs.bomv[196] = -6296557450729498027L;
        hs.bomv[197] = -7215625210448883668L;
        hs.bomv[198] = 5369170960371720190L;
        hs.bomv[199] = -6666466238231033928L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block158: {
            block157: {
                v0 /* !! */  = hs.dq;
                if (true) ** GOTO lbl5
                block108: while (true) {
                    v0 /* !! */  = (long)(v1 - hs.bomw("bouw", bomt(int ), (int)37));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case 1302755585: {
                            v1 = hs.bomw("boux", bomt(int ), (int)38);
                            continue block108;
                        }
                        case 1509767219: {
                            break block108;
                        }
                        case 1668768265: {
                            v1 = hs.bomw("bouy", bomt(int ), (int)39);
                            continue block108;
                        }
                    }
                    break;
                }
                var4_2 = hs.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = hs.dq - hs.bomw("bouz", bomt(int ), (int)40)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == hs.bomw("bova", bone(int ), (int)166)) break;
                    v2 /* !! */  = (long)hs.bomw("bovb", bone(int ), (int)167);
                }
                var3_3 /* !! */  = hs.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = hs.dq - hs.bomw("bovc", bomt(int ), (int)41)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == hs.bomw("bovd", bone(int ), (int)168)) break;
                    v3 /* !! */  = (long)hs.bomw("bove", bone(int ), (int)169);
                }
                var2_4 = hs.a;
                if (var4_2) {
                    throw null;
lbl29:
                    // 17 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl29
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = hs.dq - hs.bomw("bovf", bomt(int ), (int)42)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == hs.bomw("bovg", bone(int ), (int)170)) break;
                    v4 /* !! */  = (long)hs.bomw("bovh", bone(int ), (int)171);
                }
                if (!this.state) break block157;
                if (var2_4) ** GOTO lbl29
                v5 /* !! */  = hs.dq;
                if (true) ** GOTO lbl43
                block113: while (true) {
                    v5 /* !! */  = (long)(hs.bomw("bovj", bomt(int ), (int)44) - hs.bomw("bovi", bomt(int ), (int)43));
lbl43:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -448787233: {
                            continue block113;
                        }
                        case 1509767219: {
                            break block113;
                        }
                    }
                    break;
                }
                v6 /* !! */  = hs.dq;
                if (true) ** GOTO lbl52
                block114: while (true) {
                    v6 /* !! */  = (long)(hs.bomw("bovl", bomt(int ), (int)46) - hs.bomw("bovk", bomt(int ), (int)45));
lbl52:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1227239845: {
                            continue block114;
                        }
                        case 1509767219: {
                            break block114;
                        }
                    }
                    break;
                }
                if (hs.mc.field_1724 == null) break block157;
                if (var2_4) ** GOTO lbl29
                v7 /* !! */  = hs.dq;
                if (true) ** GOTO lbl63
                block115: while (true) {
                    v7 /* !! */  = (long)(v8 - hs.bomw("bovm", bomt(int ), (int)47));
lbl63:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -2036142064: {
                            v8 = hs.bomw("bovn", bomt(int ), (int)48);
                            continue block115;
                        }
                        case -1978826742: {
                            v8 = hs.bomw("bovo", bomt(int ), (int)49);
                            continue block115;
                        }
                        case 1509767219: {
                            break block115;
                        }
                    }
                    break;
                }
                v9 /* !! */  = hs.dq;
                if (true) ** GOTO lbl76
                block116: while (true) {
                    v9 /* !! */  = (long)(hs.bomw("bovq", bomt(int ), (int)51) - hs.bomw("bovp", bomt(int ), (int)50));
lbl76:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -403940858: {
                            continue block116;
                        }
                        case 1509767219: {
                            break block116;
                        }
                    }
                    break;
                }
                v10 = hs.mc.field_1724;
                v11 /* !! */  = hs.dq;
                if (true) ** GOTO lbl86
                block117: while (true) {
                    v11 /* !! */  = (long)(v12 - hs.bomw("bovr", bomt(int ), (int)52));
lbl86:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 796268039: {
                            v12 = hs.bomw("bovs", bomt(int ), (int)53);
                            continue block117;
                        }
                        case 864865994: {
                            v12 = hs.bomw("bovt", bomt(int ), (int)54);
                            continue block117;
                        }
                        case 1509767219: {
                            break block117;
                        }
                    }
                    break;
                }
                if (v10.method_5799()) break block157;
                if (var2_4) ** GOTO lbl29
                v13 /* !! */  = hs.dq;
                if (true) ** GOTO lbl101
                block118: while (true) {
                    v13 /* !! */  = (long)(v14 - hs.bomw("bovu", bomt(int ), (int)55));
lbl101:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1976952381: {
                            v14 = hs.bomw("bovv", bomt(int ), (int)56);
                            continue block118;
                        }
                        case -1870641113: {
                            v14 = hs.bomw("bovw", bomt(int ), (int)57);
                            continue block118;
                        }
                        case -1869782585: {
                            v14 = hs.bomw("bovx", bomt(int ), (int)58);
                            continue block118;
                        }
                        case 1509767219: {
                            break block118;
                        }
                    }
                    break;
                }
                v15 /* !! */  = hs.dq;
                if (true) ** GOTO lbl117
                block119: while (true) {
                    v15 /* !! */  = (long)(v16 - hs.bomw("bovy", bomt(int ), (int)59));
lbl117:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1244344023: {
                            v16 = hs.bomw("bovz", bomt(int ), (int)60);
                            continue block119;
                        }
                        case 1304883243: {
                            v16 = hs.bomw("bowa", bomt(int ), (int)61);
                            continue block119;
                        }
                        case 1509767219: {
                            break block119;
                        }
                    }
                    break;
                }
                v17 = hs.mc.field_1724;
                v18 /* !! */  = hs.dq;
                if (true) ** GOTO lbl131
                block120: while (true) {
                    v18 /* !! */  = (long)(v19 - hs.bomw("bowb", bomt(int ), (int)62));
lbl131:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1048780567: {
                            v19 = hs.bomw("bowc", bomt(int ), (int)63);
                            continue block120;
                        }
                        case 381179794: {
                            v19 = hs.bomw("bowd", bomt(int ), (int)64);
                            continue block120;
                        }
                        case 699751378: {
                            v19 = hs.bomw("bowe", bomt(int ), (int)65);
                            continue block120;
                        }
                        case 1509767219: {
                            break block120;
                        }
                    }
                    break;
                }
                if (!v17.method_5869()) break block158;
                if (var2_4) ** GOTO lbl29
            }
            if (var2_4 || var2_4) ** GOTO lbl29
            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl29
        v20 /* !! */  = hs.dq;
        if (true) ** GOTO lbl154
        block121: while (true) {
            v20 /* !! */  = (long)(v21 - hs.bomw("bowf", bomt(int ), (int)66));
lbl154:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case -1360464190: {
                    v21 = hs.bomw("bowg", bomt(int ), (int)67);
                    continue block121;
                }
                case -433817506: {
                    v21 = hs.bomw("bowh", bomt(int ), (int)68);
                    continue block121;
                }
                case 1509767219: {
                    break block121;
                }
            }
            break;
        }
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_3 = hs.dq - hs.bomw("bowi", bomt(int ), (int)69)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == hs.bomw("bowj", bone(int ), (int)172)) break;
            v22 /* !! */  = (long)hs.bomw("bowk", bone(int ), (int)173);
        }
        if (!this.mode.isSelected("Matrix")) ** GOTO lbl-1000
        if (var2_4 || var2_4) ** GOTO lbl29
        v23 /* !! */  = hs.dq;
        if (true) ** GOTO lbl174
        block123: while (true) {
            v23 /* !! */  = (long)(v24 - hs.bomw("bowl", bomt(int ), (int)70));
lbl174:
            // 2 sources

            switch ((int)v23 /* !! */ ) {
                case 834791303: {
                    v24 = hs.bomw("bowm", bomt(int ), (int)71);
                    continue block123;
                }
                case 1509767219: {
                    break block123;
                }
                case 1572320259: {
                    v24 = hs.bomw("bown", bomt(int ), (int)72);
                    continue block123;
                }
            }
            break;
        }
        this.handleMatrixTick();
        if (var2_4) ** GOTO lbl29
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 3 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl29
                v25 /* !! */  = hs.dq;
                if (true) ** GOTO lbl193
                block124: while (true) {
                    v25 /* !! */  = (long)(v26 - hs.bomw("bowo", bomt(int ), (int)73));
lbl193:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -2144285173: {
                            v26 = hs.bomw("bowp", bomt(int ), (int)74);
                            continue block124;
                        }
                        case -1351403859: {
                            v26 = hs.bomw("bowq", bomt(int ), (int)75);
                            continue block124;
                        }
                        case 333037891: {
                            v26 = hs.bomw("bowr", bomt(int ), (int)76);
                            continue block124;
                        }
                        case 1509767219: {
                            break block124;
                        }
                    }
                    break;
                }
                v27 /* !! */  = hs.dq;
                if (true) ** GOTO lbl209
                block125: while (true) {
                    v27 /* !! */  = (long)(v28 - hs.bomw("bows", bomt(int ), (int)77));
lbl209:
                    // 2 sources

                    switch ((int)v27 /* !! */ ) {
                        case -1771163399: {
                            v28 = hs.bomw("bowt", bomt(int ), (int)78);
                            continue block125;
                        }
                        case -287524856: {
                            v28 = hs.bomw("bowu", bomt(int ), (int)79);
                            continue block125;
                        }
                        case 575128653: {
                            v28 = hs.bomw("bowv", bomt(int ), (int)80);
                            continue block125;
                        }
                        case 1509767219: {
                            break block125;
                        }
                    }
                    break;
                }
                if (!this.mode.isSelected("New Grim")) ** GOTO lbl237
                if (var2_4) ** GOTO lbl29
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_4 = hs.dq - hs.bomw("boww", bomt(int ), (int)81)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == hs.bomw("bowx", bone(int ), (int)174)) break;
                    v29 /* !! */  = (long)hs.bomw("bowy", bone(int ), (int)175);
                }
                if (!this.flag) ** GOTO lbl237
                if (var2_4 || var2_4) ** GOTO lbl29
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_5 = hs.dq - hs.bomw("bowz", bomt(int ), (int)82)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == hs.bomw("boxa", bone(int ), (int)176)) break;
                    v30 /* !! */  = (long)hs.bomw("boxb", bone(int ), (int)177);
                }
                this.handleNewGrimTick();
                if (var2_4) ** GOTO lbl29
lbl237:
                // 3 sources

                if (var2_4 || var2_4) ** GOTO lbl29
                v31 /* !! */  = hs.dq;
                if (true) ** GOTO lbl242
                block128: while (true) {
                    v31 /* !! */  = (long)(v32 - hs.bomw("boxc", bomt(int ), (int)83));
lbl242:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -1529908254: {
                            v32 = hs.bomw("boxd", bomt(int ), (int)84);
                            continue block128;
                        }
                        case 334058525: {
                            v32 = hs.bomw("boxe", bomt(int ), (int)85);
                            continue block128;
                        }
                        case 1509767219: {
                            break block128;
                        }
                    }
                    break;
                }
                if (this.grimTicks <= 0) ** GOTO lbl277
                if (var2_4 || var2_4) ** GOTO lbl29
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_6 = hs.dq - hs.bomw("boxf", bomt(int ), (int)86)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == hs.bomw("boxg", bone(int ), (int)178)) break;
                    v33 /* !! */  = (long)hs.bomw("boxh", bone(int ), (int)179);
                }
                v34 = this.grimTicks - hs.bomw("boxi", bone(int ), (int)180);
                v35 /* !! */  = hs.dq;
                if (true) ** GOTO lbl263
                block130: while (true) {
                    v35 /* !! */  = (long)(v36 - hs.bomw("boxj", bomt(int ), (int)87));
lbl263:
                    // 2 sources

                    switch ((int)v35 /* !! */ ) {
                        case -1585997426: {
                            v36 = hs.bomw("boxk", bomt(int ), (int)88);
                            continue block130;
                        }
                        case -701392863: {
                            v36 = hs.bomw("boxl", bomt(int ), (int)89);
                            continue block130;
                        }
                        case 1398209342: {
                            v36 = hs.bomw("boxm", bomt(int ), (int)90);
                            continue block130;
                        }
                        case 1509767219: {
                            break block130;
                        }
                    }
                    break;
                }
                this.grimTicks = v34;
                if (var2_4) ** GOTO lbl29
lbl277:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl280:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)hs.bomw("boxn", bone(int ), (int)181);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl346
            }
            case 1: {
                var3_3 /* !! */  = (int)hs.bomw("boxo", bone(int ), (int)182);
                if (!var4_2) ** GOTO lbl280
                throw null;
            }
lbl289:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)hs.bomw("boxp", bone(int ), (int)183);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl393
            }
lbl294:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)hs.bomw("boxq", bone(int ), (int)184);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl373
            }
            case 4: {
                var3_3 /* !! */  = (int)hs.bomw("boxr", bone(int ), (int)185);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl401
            }
lbl304:
            // 4 sources

            case 5: {
                var3_3 /* !! */  = (int)hs.bomw("boxs", bone(int ), (int)186);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl338
            }
lbl309:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)hs.bomw("boxt", bone(int ), (int)187);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl377
            }
lbl314:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)hs.bomw("boxu", bone(int ), (int)188);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl324
            }
            case 8: {
                var3_3 /* !! */  = (int)hs.bomw("boxv", bone(int ), (int)189);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl363
            }
lbl324:
            // 4 sources

            case 9: {
                var3_3 /* !! */  = (int)hs.bomw("boxw", bone(int ), (int)190);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl338
            }
lbl329:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)hs.bomw("boxx", bone(int ), (int)191);
                if (!var4_2) break;
                throw null;
            }
            case 11: {
                var3_3 /* !! */  = (int)hs.bomw("boxy", bone(int ), (int)192);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl346
            }
lbl338:
            // 3 sources

            case 12: {
                var3_3 /* !! */  = (int)hs.bomw("boxz", bone(int ), (int)193);
                if (!var4_2) ** GOTO lbl314
                throw null;
            }
            case 13: {
                var3_3 /* !! */  = (int)hs.bomw("boya", bone(int ), (int)194);
                if (!var4_2) ** GOTO lbl304
                throw null;
            }
lbl346:
            // 3 sources

            case 14: {
                var3_3 /* !! */  = (int)hs.bomw("boyb", bone(int ), (int)195);
                if (!var4_2) ** GOTO lbl289
                throw null;
            }
            case 15: {
                var3_3 /* !! */  = (int)hs.bomw("boyc", bone(int ), (int)196);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl401
            }
lbl355:
            // 2 sources

            case 16: {
                var3_3 /* !! */  = (int)hs.bomw("boyd", bone(int ), (int)197);
                if (!var4_2) ** GOTO lbl324
                throw null;
            }
            case 17: {
                var3_3 /* !! */  = (int)hs.bomw("boye", bone(int ), (int)198);
                if (!var4_2) ** GOTO lbl329
                throw null;
            }
lbl363:
            // 3 sources

            case 18: {
                var3_3 /* !! */  = (int)hs.bomw("boyf", bone(int ), (int)199);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl377
            }
            case 19: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hs.bomw("boyg", bone(int ), (int)200);
                    if (!var4_2) ** GOTO lbl355
                    throw null;
                }
            }
lbl373:
            // 2 sources

            case 20: {
                var3_3 /* !! */  = (int)hs.bomw("boyh", bone(int ), (int)201);
                if (!var4_2) ** GOTO lbl304
                throw null;
            }
lbl377:
            // 3 sources

            case 21: {
                var3_3 /* !! */  = (int)hs.bomw("boyi", bone(int ), (int)202);
                if (!var4_2) ** GOTO lbl363
                throw null;
            }
            case 22: {
                var3_3 /* !! */  = (int)hs.bomw("boyj", bone(int ), (int)203);
                if (var4_2) {
                    throw null;
                }
            }
lbl385:
            // 4 sources

            case 23: {
                var3_3 /* !! */  = (int)hs.bomw("boyk", bone(int ), (int)204);
                if (!var4_2) ** GOTO lbl309
                throw null;
            }
            case 24: {
                var3_3 /* !! */  = (int)hs.bomw("boyl", bone(int ), (int)205);
                if (!var4_2) ** GOTO lbl294
                throw null;
            }
lbl393:
            // 2 sources

            case 25: {
                var3_3 /* !! */  = (int)hs.bomw("boym", bone(int ), (int)206);
                if (!var4_2) ** GOTO lbl385
                throw null;
            }
            case 26: {
                var3_3 /* !! */  = (int)hs.bomw("boyn", bone(int ), (int)207);
                if (!var4_2) ** GOTO lbl304
                throw null;
            }
lbl401:
            // 3 sources

            case 27: {
                var3_3 /* !! */  = (int)hs.bomw("boyo", bone(int ), (int)208);
                if (!var4_2) ** GOTO lbl324
                throw null;
            }
            case 28: 
        }
        var3_3 /* !! */  = (int)hs.bomw("boyp", bone(int ), (int)209);
        ** while (!var4_2)
lbl408:
        // 1 sources

        throw null;
    }

    public hs() {
        int n2 = b;
        boolean bl2 = a;
        super("Velocity", "\u0423\u0431\u0438\u0440\u0430\u0435\u0442 \u043e\u0442\u0434\u0430\u0447\u0443 \u043f\u0440\u0438 \u043f\u043e\u043b\u0443\u0447\u0435\u043d\u0438\u0438 \u0443\u0440\u043e\u043d\u0430", du.RAGE);
        this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0440\u0435\u0436\u0438\u043c \u0443\u043c\u0435\u043d\u044c\u0448\u0435\u043d\u0438\u044f \u043e\u0442\u0434\u0430\u0447\u0438", "New Grim", "New Grim", "Old Grim", "Matrix", "Vanilla");
        this.settings(this.mode);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getCcCooldown() {
        v0 /* !! */  = hs.dq;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - hs.bomw("bqbo", bomt(int ), (int)372));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1883041136: {
                    v1 = hs.bomw("bqbp", bomt(int ), (int)373);
                    continue block18;
                }
                case -778745026: {
                    v1 = hs.bomw("bqbq", bomt(int ), (int)374);
                    continue block18;
                }
                case 1509767219: {
                    break block18;
                }
                case 1826186342: {
                    v1 = hs.bomw("bqbr", bomt(int ), (int)375);
                    continue block18;
                }
            }
            break;
        }
        var3_1 = hs.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hs.dq - hs.bomw("bqbs", bomt(int ), (int)376)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hs.bomw("bqbt", bone(int ), (int)441)) break;
            v2 /* !! */  = (long)hs.bomw("bqbu", bone(int ), (int)442);
        }
        var2_2 /* !! */  = hs.b;
        v3 /* !! */  = hs.dq;
        if (true) ** GOTO lbl29
        block20: while (true) {
            v3 /* !! */  = (long)(v4 - hs.bomw("bqbv", bomt(int ), (int)377));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1550559445: {
                    v4 = hs.bomw("bqbw", bomt(int ), (int)378);
                    continue block20;
                }
                case -1489457557: {
                    v4 = hs.bomw("bqbx", bomt(int ), (int)379);
                    continue block20;
                }
                case -1470047180: {
                    v4 = hs.bomw("bqby", bomt(int ), (int)380);
                    continue block20;
                }
                case 1509767219: {
                    break block20;
                }
            }
            break;
        }
        var1_3 = hs.a;
        if (!var3_1) ** GOTO lbl48
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)hs.bomw("bqbz", bone(int ), (int)443);
                }
lbl48:
                // 1 sources

                if (var1_3 || var1_3) continue block21;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = hs.dq - hs.bomw("bqca", bomt(int ), (int)381)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hs.bomw("bqcb", bone(int ), (int)444)) break;
                    v5 /* !! */  = (long)hs.bomw("bqcc", bone(int ), (int)445);
                }
                return this.ccCooldown;
                case 0: {
                    var2_2 /* !! */  = (int)hs.bomw("bqcd", bone(int ), (int)446);
                    if (!var3_1) break block21;
                    throw null;
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)hs.bomw("bqce", bone(int ), (int)447);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)hs.bomw("bqcf", bone(int ), (int)448);
                    if (!var3_1) break block21;
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)hs.bomw("bqcg", bone(int ), (int)449);
        ** while (!var3_1)
lbl72:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bqcy() {
        hs.bonf[0] = 706849424;
        hs.bonf[1] = -426996461;
        hs.bonf[2] = -1055859621;
        hs.bonf[3] = 1178622801;
        hs.bonf[4] = 362447754;
        hs.bonf[5] = 1695983371;
        hs.bonf[6] = 1847891711;
        hs.bonf[7] = -678785723;
        hs.bonf[8] = -966830923;
        hs.bonf[9] = 1287972318;
        hs.bonf[10] = -775875680;
        hs.bonf[11] = -1883587969;
        hs.bonf[12] = -1061462182;
        hs.bonf[13] = 1786219902;
        hs.bonf[14] = -1405871472;
        hs.bonf[15] = 29563271;
        hs.bonf[16] = -1165409345;
        hs.bonf[17] = 2095825689;
        hs.bonf[18] = 657048805;
        hs.bonf[19] = -966892139;
        hs.bonf[20] = -2129200363;
        hs.bonf[21] = -1207658679;
        hs.bonf[22] = 1785656495;
        hs.bonf[23] = -1183177866;
        hs.bonf[24] = 118411317;
        hs.bonf[25] = 1871723332;
        hs.bonf[26] = -139086167;
        hs.bonf[27] = -122421988;
        hs.bonf[28] = -1117471158;
        hs.bonf[29] = 1774862419;
        hs.bonf[30] = 1327896382;
        hs.bonf[31] = -2000918110;
        hs.bonf[32] = -595568048;
        hs.bonf[33] = -757451972;
        hs.bonf[34] = 1378494736;
        hs.bonf[35] = -706735461;
        hs.bonf[36] = -1682331168;
        hs.bonf[37] = 1320102709;
        hs.bonf[38] = -74693140;
        hs.bonf[39] = -1038307733;
        hs.bonf[40] = -1245606431;
        hs.bonf[41] = -1014096944;
        hs.bonf[42] = -1343567205;
        hs.bonf[43] = 1748844975;
        hs.bonf[44] = 1458872540;
        hs.bonf[45] = 1722941746;
        hs.bonf[46] = 2146751252;
        hs.bonf[47] = 583334468;
        hs.bonf[48] = 690074303;
        hs.bonf[49] = 491112009;
        hs.bonf[50] = -619201500;
        hs.bonf[51] = 774839302;
        hs.bonf[52] = 2101035032;
        hs.bonf[53] = 1049927676;
        hs.bonf[54] = 226323399;
        hs.bonf[55] = -1954697626;
        hs.bonf[56] = 419270027;
        hs.bonf[57] = 1884699463;
        hs.bonf[58] = 1635054836;
        hs.bonf[59] = 1804887831;
        hs.bonf[60] = 1972162605;
        hs.bonf[61] = 416227125;
        hs.bonf[62] = 1398791618;
        hs.bonf[63] = -1130687753;
        hs.bonf[64] = -996895803;
        hs.bonf[65] = -1730085867;
        hs.bonf[66] = -552503431;
        hs.bonf[67] = 734834268;
        hs.bonf[68] = -1816323615;
        hs.bonf[69] = 683240227;
        hs.bonf[70] = -1962109360;
        hs.bonf[71] = -183059395;
        hs.bonf[72] = 92775258;
        hs.bonf[73] = 962952764;
        hs.bonf[74] = -1941496750;
        hs.bonf[75] = -1027309828;
        hs.bonf[76] = -147027845;
        hs.bonf[77] = 1193521582;
        hs.bonf[78] = 991635944;
        hs.bonf[79] = -260198563;
        hs.bonf[80] = 1028960831;
        hs.bonf[81] = -495788185;
        hs.bonf[82] = 785529355;
        hs.bonf[83] = -1619618545;
        hs.bonf[84] = 1343608719;
        hs.bonf[85] = -1404868166;
        hs.bonf[86] = 832072313;
        hs.bonf[87] = -776177997;
        hs.bonf[88] = 1688428711;
        hs.bonf[89] = 271625643;
        hs.bonf[90] = -1765379856;
        hs.bonf[91] = 1103401970;
        hs.bonf[92] = 1451234042;
        hs.bonf[93] = 125178939;
        hs.bonf[94] = 1330972811;
        hs.bonf[95] = 454238435;
        hs.bonf[96] = -962925293;
        hs.bonf[97] = -692825440;
        hs.bonf[98] = -1137388017;
        hs.bonf[99] = 741536883;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        v0 /* !! */  = hs.dq;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(hs.bomw("bpwa", bomt(int ), (int)298) - hs.bomw("bpvz", bomt(int ), (int)297));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1201570863: {
                    continue block25;
                }
                case 1509767219: {
                    break block25;
                }
            }
            break;
        }
        var3_1 = hs.c;
        v1 /* !! */  = hs.dq;
        if (true) ** GOTO lbl15
        block26: while (true) {
            v1 /* !! */  = (long)(v2 - hs.bomw("bpwb", bomt(int ), (int)299));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 460767166: {
                    v2 = hs.bomw("bpwc", bomt(int ), (int)300);
                    continue block26;
                }
                case 961962029: {
                    v2 = hs.bomw("bpwd", bomt(int ), (int)301);
                    continue block26;
                }
                case 1509767219: {
                    break block26;
                }
                case 2003991006: {
                    v2 = hs.bomw("bpwe", bomt(int ), (int)302);
                    continue block26;
                }
            }
            break;
        }
        var2_2 /* !! */  = hs.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = hs.dq - hs.bomw("bpwf", bomt(int ), (int)303)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hs.bomw("bpwg", bone(int ), (int)371)) break;
            v3 /* !! */  = (long)hs.bomw("bpwh", bone(int ), (int)372);
        }
        var1_3 = hs.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl39:
                    // 3 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl39
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = hs.dq - hs.bomw("bpwi", bomt(int ), (int)304)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == hs.bomw("bpwj", bone(int ), (int)373)) break;
                    v4 /* !! */  = (long)hs.bomw("bpwk", bone(int ), (int)374);
                }
                super.deactivate();
                if (var1_3 || var1_3) ** GOTO lbl39
                v5 /* !! */  = hs.dq;
                if (true) ** GOTO lbl53
                block30: while (true) {
                    v5 /* !! */  = (long)(v6 - hs.bomw("bpwl", bomt(int ), (int)305));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 1310448001: {
                            v6 = hs.bomw("bpwm", bomt(int ), (int)306);
                            continue block30;
                        }
                        case 1509767219: {
                            break block30;
                        }
                        case 2102475531: {
                            v6 = hs.bomw("bpwn", bomt(int ), (int)307);
                            continue block30;
                        }
                    }
                    break;
                }
                this.pendingVelocity = null;
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl65:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)hs.bomw("bpwo", bone(int ), (int)375);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl70:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)hs.bomw("bpwp", bone(int ), (int)376);
                if (!var3_1) ** GOTO lbl65
                throw null;
            }
lbl74:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)hs.bomw("bpwq", bone(int ), (int)377);
                } while (!var3_1);
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)hs.bomw("bpwr", bone(int ), (int)378);
                if (!var3_1) ** GOTO lbl70
                throw null;
            }
            case 4: {
                do {
                    var2_2 /* !! */  = (int)hs.bomw("bpws", bone(int ), (int)379);
                } while (!var3_1);
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)hs.bomw("bpwt", bone(int ), (int)380);
                if (!var3_1) ** GOTO lbl70
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)hs.bomw("bpwu", bone(int ), (int)381);
                if (!var3_1) ** GOTO lbl74
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)hs.bomw("bpwv", bone(int ), (int)382);
        ** while (!var3_1)
lbl99:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    private void handleVelocityPacket(cr var1_1, class_2743 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[CASE]], but top level block is 12[SWITCH]
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

    private static /* synthetic */ void bqdd() {
        hs.bong[0] = -706849425;
        hs.bong[1] = -195054460;
        hs.bong[2] = -1055859623;
        hs.bong[3] = 1178622802;
        hs.bong[4] = 362447753;
        hs.bong[5] = 1695983369;
        hs.bong[6] = 1847891710;
        hs.bong[7] = -678785722;
        hs.bong[8] = -966830922;
        hs.bong[9] = 1287972317;
        hs.bong[10] = -775875676;
        hs.bong[11] = -1883587970;
        hs.bong[12] = -1061462182;
        hs.bong[13] = 1786219871;
        hs.bong[14] = -1405871488;
        hs.bong[15] = 29563265;
        hs.bong[16] = -1165409347;
        hs.bong[17] = 2095825675;
        hs.bong[18] = 657048824;
        hs.bong[19] = -966892140;
        hs.bong[20] = -2129200361;
        hs.bong[21] = -1207658673;
        hs.bong[22] = 1785656493;
        hs.bong[23] = -1183177869;
        hs.bong[24] = 118411314;
        hs.bong[25] = 1871723358;
        hs.bong[26] = -139086149;
        hs.bong[27] = -122421955;
        hs.bong[28] = -1117471154;
        hs.bong[29] = 1774862403;
        hs.bong[30] = 1327896383;
        hs.bong[31] = -2000918097;
        hs.bong[32] = -595568060;
        hs.bong[33] = -757451976;
        hs.bong[34] = 1378494745;
        hs.bong[35] = -706735468;
        hs.bong[36] = -1682331155;
        hs.bong[37] = 1320102711;
        hs.bong[38] = -74693134;
        hs.bong[39] = -1038307716;
        hs.bong[40] = -1245606461;
        hs.bong[41] = -1014096943;
        hs.bong[42] = -1343567232;
        hs.bong[43] = 1748844972;
        hs.bong[44] = 1458872521;
        hs.bong[45] = 1722941759;
        hs.bong[46] = 2146751240;
        hs.bong[47] = 583334484;
        hs.bong[48] = 690074280;
        hs.bong[49] = -491112010;
        hs.bong[50] = -619201500;
        hs.bong[51] = 774839303;
        hs.bong[52] = 2101035034;
        hs.bong[53] = 1049927679;
        hs.bong[54] = 226323398;
        hs.bong[55] = -1954697625;
        hs.bong[56] = 419270027;
        hs.bong[57] = 1884699462;
        hs.bong[58] = 1635054837;
        hs.bong[59] = 1804887830;
        hs.bong[60] = 1972162603;
        hs.bong[61] = 416227124;
        hs.bong[62] = 1398791619;
        hs.bong[63] = -1130687776;
        hs.bong[64] = -996895759;
        hs.bong[65] = -1730085853;
        hs.bong[66] = -552503455;
        hs.bong[67] = 734834296;
        hs.bong[68] = -1816323606;
        hs.bong[69] = 683240200;
        hs.bong[70] = -1962109320;
        hs.bong[71] = -183059412;
        hs.bong[72] = 92775258;
        hs.bong[73] = 962952758;
        hs.bong[74] = -1941496739;
        hs.bong[75] = -1027309864;
        hs.bong[76] = -147027890;
        hs.bong[77] = 1193521566;
        hs.bong[78] = 991635934;
        hs.bong[79] = -260198570;
        hs.bong[80] = 1028960770;
        hs.bong[81] = -495788192;
        hs.bong[82] = 785529406;
        hs.bong[83] = -1619618508;
        hs.bong[84] = 1343608706;
        hs.bong[85] = -1404868187;
        hs.bong[86] = 832072317;
        hs.bong[87] = -776178009;
        hs.bong[88] = 1688428691;
        hs.bong[89] = 271625643;
        hs.bong[90] = -1765379877;
        hs.bong[91] = 1103401920;
        hs.bong[92] = 1451234002;
        hs.bong[93] = 125178912;
        hs.bong[94] = 1330972831;
        hs.bong[95] = 454238429;
        hs.bong[96] = -962925282;
        hs.bong[97] = -692825420;
        hs.bong[98] = -1137388012;
        hs.bong[99] = 741536865;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void activate() {
        v0 /* !! */  = hs.dq;
        if (true) ** GOTO lbl5
        block42: while (true) {
            v0 /* !! */  = (long)(hs.bomw("bpuk", bomt(int ), (int)279) - hs.bomw("bpuj", bomt(int ), (int)278));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 156977128: {
                    continue block42;
                }
                case 1509767219: {
                    break block42;
                }
            }
            break;
        }
        var3_1 = hs.c;
        v1 /* !! */  = hs.dq;
        if (true) ** GOTO lbl15
        block43: while (true) {
            v1 /* !! */  = (long)(v2 - hs.bomw("bpul", bomt(int ), (int)280));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1384480370: {
                    v2 = hs.bomw("bpum", bomt(int ), (int)281);
                    continue block43;
                }
                case -1063256609: {
                    v2 = hs.bomw("bpun", bomt(int ), (int)282);
                    continue block43;
                }
                case 261518672: {
                    v2 = hs.bomw("bpuo", bomt(int ), (int)283);
                    continue block43;
                }
                case 1509767219: {
                    break block43;
                }
            }
            break;
        }
        var2_2 /* !! */  = hs.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = hs.dq - hs.bomw("bpup", bomt(int ), (int)284)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hs.bomw("bpuq", bone(int ), (int)348)) break;
            v3 /* !! */  = (long)hs.bomw("bpur", bone(int ), (int)349);
        }
        var1_3 = hs.a;
        if (var3_1) {
            throw null;
lbl36:
            // 7 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl36
        v4 /* !! */  = hs.dq;
        if (true) ** GOTO lbl43
        block46: while (true) {
            v4 /* !! */  = (long)(v5 - hs.bomw("bpus", bomt(int ), (int)285));
lbl43:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1723257561: {
                    v5 = hs.bomw("bput", bomt(int ), (int)286);
                    continue block46;
                }
                case -987603819: {
                    v5 = hs.bomw("bpuu", bomt(int ), (int)287);
                    continue block46;
                }
                case 1509767219: {
                    break block46;
                }
                case 2102986911: {
                    v5 = hs.bomw("bpuv", bomt(int ), (int)288);
                    continue block46;
                }
            }
            break;
        }
        super.activate();
        if (var1_3 || var1_3) ** GOTO lbl36
        v6 = hs.bomw("bpuw", bone(int ), (int)350);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_1 = hs.dq - hs.bomw("bpux", bomt(int ), (int)289)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == hs.bomw("bpuy", bone(int ), (int)351)) break;
            v7 /* !! */  = (long)hs.bomw("bpuz", bone(int ), (int)352);
        }
        this.grimTicks = (int)v6;
        if (var1_3) ** GOTO lbl36
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block16 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl36
                v8 = hs.bomw("bpva", bone(int ), (int)353);
                v9 /* !! */  = hs.dq;
                if (true) ** GOTO lbl74
                block48: while (true) {
                    v9 /* !! */  = (long)(v10 - hs.bomw("bpvb", bomt(int ), (int)290));
lbl74:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -901742858: {
                            v10 = hs.bomw("bpvc", bomt(int ), (int)291);
                            continue block48;
                        }
                        case 1104032512: {
                            v10 = hs.bomw("bpvd", bomt(int ), (int)292);
                            continue block48;
                        }
                        case 1509767219: {
                            break block48;
                        }
                    }
                    break;
                }
                this.flag = v8;
                if (var1_3 || var1_3) ** GOTO lbl36
                v11 = hs.bomw("bpve", bone(int ), (int)354);
                v12 /* !! */  = hs.dq;
                if (true) ** GOTO lbl90
                block49: while (true) {
                    v12 /* !! */  = (long)(v13 - hs.bomw("bpvf", bomt(int ), (int)293));
lbl90:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1410956575: {
                            v13 = hs.bomw("bpvg", bomt(int ), (int)294);
                            continue block49;
                        }
                        case 125529599: {
                            v13 = hs.bomw("bpvh", bomt(int ), (int)295);
                            continue block49;
                        }
                        case 1509767219: {
                            break block49;
                        }
                    }
                    break;
                }
                this.ccCooldown = (int)v11;
                if (var1_3 || var1_3) ** GOTO lbl36
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_2 = hs.dq - hs.bomw("bpvi", bomt(int ), (int)296)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == hs.bomw("bpvj", bone(int ), (int)355)) break;
                    v14 /* !! */  = (long)hs.bomw("bpvk", bone(int ), (int)356);
                }
                this.pendingVelocity = null;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)hs.bomw("bpvl", bone(int ), (int)357);
                } while (!var3_1);
                throw null;
            }
lbl115:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)hs.bomw("bpvm", bone(int ), (int)358);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl120:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)hs.bomw("bpvn", bone(int ), (int)359);
                } while (!var3_1);
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)hs.bomw("bpvo", bone(int ), (int)360);
                if (!var3_1) ** GOTO lbl115
                throw null;
            }
lbl129:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)hs.bomw("bpvp", bone(int ), (int)361);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl134:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)hs.bomw("bpvq", bone(int ), (int)362);
                if (!var3_1) ** GOTO lbl115
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)hs.bomw("bpvr", bone(int ), (int)363);
                if (!var3_1) ** GOTO lbl129
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)hs.bomw("bpvs", bone(int ), (int)364);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hs.bomw("bpvt", bone(int ), (int)365);
                    if (!var3_1) break block16;
                    throw null;
                }
            }
lbl152:
            // 4 sources

            case 9: {
                var2_2 /* !! */  = (int)hs.bomw("bpvu", bone(int ), (int)366);
                if (!var3_1) ** GOTO lbl129
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)hs.bomw("bpvv", bone(int ), (int)367);
                if (!var3_1) ** GOTO lbl134
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)hs.bomw("bpvw", bone(int ), (int)368);
                if (!var3_1) ** GOTO lbl120
                throw null;
            }
            case 12: {
                do {
                    var2_2 /* !! */  = (int)hs.bomw("bpvx", bone(int ), (int)369);
                } while (!var3_1);
                throw null;
            }
            case 13: 
        }
        var2_2 /* !! */  = (int)hs.bomw("bpvy", bone(int ), (int)370);
        ** while (!var3_1)
lbl172:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setPendingVelocity(class_243 var1_1) {
        v0 /* !! */  = hs.dq;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(hs.bomw("bpza", bomt(int ), (int)341) - hs.bomw("bpyz", bomt(int ), (int)340));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 152628469: {
                    continue block17;
                }
                case 1509767219: {
                    break block17;
                }
            }
            break;
        }
        var4_2 = hs.c;
        v1 /* !! */  = hs.dq;
        if (true) ** GOTO lbl15
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - hs.bomw("bpzb", bomt(int ), (int)342));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -59699549: {
                    v2 = hs.bomw("bpzc", bomt(int ), (int)343);
                    continue block18;
                }
                case 1094688762: {
                    v2 = hs.bomw("bpzd", bomt(int ), (int)344);
                    continue block18;
                }
                case 1376331243: {
                    v2 = hs.bomw("bpze", bomt(int ), (int)345);
                    continue block18;
                }
                case 1509767219: {
                    break block18;
                }
            }
            break;
        }
        var3_3 /* !! */  = hs.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = hs.dq - hs.bomw("bpzf", bomt(int ), (int)346)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hs.bomw("bpzg", bone(int ), (int)406)) break;
            v3 /* !! */  = (long)hs.bomw("bpzh", bone(int ), (int)407);
        }
        var2_4 = hs.a;
        if (var4_2) {
            throw null;
lbl36:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl36
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = hs.dq - hs.bomw("bpzi", bomt(int ), (int)347)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == hs.bomw("bpzj", bone(int ), (int)408)) break;
            v4 /* !! */  = (long)hs.bomw("bpzk", bone(int ), (int)409);
        }
        this.pendingVelocity = var1_1;
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
                do {
                    var3_3 /* !! */  = (int)hs.bomw("bpzl", bone(int ), (int)410);
                } while (!var4_2);
                throw null;
            }
lbl56:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)hs.bomw("bpzm", bone(int ), (int)411);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)hs.bomw("bpzn", bone(int ), (int)412);
                if (var4_2) {
                    throw null;
                }
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hs.bomw("bpzo", bone(int ), (int)413);
                    if (!var4_2) ** GOTO lbl56
                    throw null;
                }
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)hs.bomw("bpzp", bone(int ), (int)414);
        ** while (!var4_2)
lbl72:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleMatrixTick() {
        v0 /* !! */  = hs.dq;
        if (true) ** GOTO lbl5
        block158: while (true) {
            v0 /* !! */  = (long)(v1 - hs.bomw("boyq", bomt(int ), (int)91));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1162139588: {
                    v1 = hs.bomw("boyr", bomt(int ), (int)92);
                    continue block158;
                }
                case 1162262524: {
                    v1 = hs.bomw("boys", bomt(int ), (int)93);
                    continue block158;
                }
                case 1509767219: {
                    break block158;
                }
            }
            break;
        }
        var7_1 = hs.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hs.dq - hs.bomw("boyt", bomt(int ), (int)94)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hs.bomw("boyu", bone(int ), (int)210)) break;
            v2 /* !! */  = (long)hs.bomw("boyv", bone(int ), (int)211);
        }
        var6_2 /* !! */  = hs.b;
        v3 /* !! */  = hs.dq;
        if (true) ** GOTO lbl25
        block160: while (true) {
            v3 /* !! */  = (long)(v4 - hs.bomw("boyw", bomt(int ), (int)95));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1779266190: {
                    v4 = hs.bomw("boyx", bomt(int ), (int)96);
                    continue block160;
                }
                case -1750072311: {
                    v4 = hs.bomw("boyy", bomt(int ), (int)97);
                    continue block160;
                }
                case 1509767219: {
                    break block160;
                }
            }
            break;
        }
        var5_3 = hs.a;
        if (!var7_1) ** GOTO lbl41
        throw null;
        {
            if (var6_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var6_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl41:
                // 1 sources

                if (var5_3 || var5_3) continue block161;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = hs.dq - hs.bomw("boyz", bomt(int ), (int)98)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == hs.bomw("boza", bone(int ), (int)212)) break;
                    v5 /* !! */  = (long)hs.bomw("bozb", bone(int ), (int)213);
                }
                if (this.pendingVelocity == null) ** GOTO lbl110
                if (var5_3 || var5_3) continue block161;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = hs.dq - hs.bomw("bozc", bomt(int ), (int)99)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == hs.bomw("bozd", bone(int ), (int)214)) break;
                    v6 /* !! */  = (long)hs.bomw("boze", bone(int ), (int)215);
                }
                v7 /* !! */  = hs.dq;
                if (true) ** GOTO lbl58
                block164: while (true) {
                    v7 /* !! */  = (long)(v8 - hs.bomw("bozf", bomt(int ), (int)100));
lbl58:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -941974314: {
                            v8 = hs.bomw("bozg", bomt(int ), (int)101);
                            continue block164;
                        }
                        case 910868337: {
                            v8 = hs.bomw("bozh", bomt(int ), (int)102);
                            continue block164;
                        }
                        case 1509767219: {
                            break block164;
                        }
                    }
                    break;
                }
                v9 = hs.mc.field_1724;
                v10 /* !! */  = hs.dq;
                if (true) ** GOTO lbl72
                block165: while (true) {
                    v10 /* !! */  = (long)(v11 - hs.bomw("bozi", bomt(int ), (int)103));
lbl72:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -257346009: {
                            v11 = hs.bomw("bozj", bomt(int ), (int)104);
                            continue block165;
                        }
                        case 1509767219: {
                            break block165;
                        }
                        case 1986076652: {
                            v11 = hs.bomw("bozk", bomt(int ), (int)105);
                            continue block165;
                        }
                    }
                    break;
                }
                v12 /* !! */  = hs.dq;
                if (true) ** GOTO lbl85
                block166: while (true) {
                    v12 /* !! */  = (long)(hs.bomw("bozm", bomt(int ), (int)107) - hs.bomw("bozl", bomt(int ), (int)106));
lbl85:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case 344699548: {
                            continue block166;
                        }
                        case 1509767219: {
                            break block166;
                        }
                    }
                    break;
                }
                v9.method_18799(this.pendingVelocity);
                if (var5_3 || var5_3) continue block161;
                v13 /* !! */  = hs.dq;
                if (true) ** GOTO lbl96
                block167: while (true) {
                    v13 /* !! */  = (long)(v14 - hs.bomw("bozn", bomt(int ), (int)108));
lbl96:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1106385492: {
                            v14 = hs.bomw("bozo", bomt(int ), (int)109);
                            continue block167;
                        }
                        case -820786591: {
                            v14 = hs.bomw("bozp", bomt(int ), (int)110);
                            continue block167;
                        }
                        case -366112304: {
                            v14 = hs.bomw("bozq", bomt(int ), (int)111);
                            continue block167;
                        }
                        case 1509767219: {
                            break block167;
                        }
                    }
                    break;
                }
                this.pendingVelocity = null;
                if (var5_3) continue block161;
lbl110:
                // 2 sources

                if (var5_3 || var5_3) continue block161;
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_3 = hs.dq - hs.bomw("bozr", bomt(int ), (int)112)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == hs.bomw("bozs", bone(int ), (int)216)) break;
                    v15 /* !! */  = (long)hs.bomw("bozt", bone(int ), (int)217);
                }
                v16 /* !! */  = hs.dq;
                if (true) ** GOTO lbl120
                block169: while (true) {
                    v16 /* !! */  = (long)(v17 - hs.bomw("bozu", bomt(int ), (int)113));
lbl120:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1714087554: {
                            v17 = hs.bomw("bozv", bomt(int ), (int)114);
                            continue block169;
                        }
                        case 1005140487: {
                            v17 = hs.bomw("bozw", bomt(int ), (int)115);
                            continue block169;
                        }
                        case 1509767219: {
                            break block169;
                        }
                    }
                    break;
                }
                v18 = hs.mc.field_1724;
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_4 = hs.dq - hs.bomw("bozx", bomt(int ), (int)116)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == hs.bomw("bozy", bone(int ), (int)218)) break;
                    v19 /* !! */  = (long)hs.bomw("bozz", bone(int ), (int)219);
                }
                if (v18.field_6235 <= 0) ** GOTO lbl530
                if (var5_3) continue block161;
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_5 = hs.dq - hs.bomw("bpaa", bomt(int ), (int)117)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == hs.bomw("bpab", bone(int ), (int)220)) break;
                    v20 /* !! */  = (long)hs.bomw("bpac", bone(int ), (int)221);
                }
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_6 = hs.dq - hs.bomw("bpad", bomt(int ), (int)118)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == hs.bomw("bpae", bone(int ), (int)222)) break;
                    v21 /* !! */  = (long)hs.bomw("bpaf", bone(int ), (int)223);
                }
                v22 = hs.mc.field_1724;
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_7 = hs.dq - hs.bomw("bpag", bomt(int ), (int)119)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == hs.bomw("bpah", bone(int ), (int)224)) break;
                    v23 /* !! */  = (long)hs.bomw("bpai", bone(int ), (int)225);
                }
                if (v22.method_24828()) ** GOTO lbl530
                if (var5_3 || var5_3) continue block161;
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_8 = hs.dq - hs.bomw("bpaj", bomt(int ), (int)120)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == hs.bomw("bpak", bone(int ), (int)226)) break;
                    v24 /* !! */  = (long)hs.bomw("bpal", bone(int ), (int)227);
                }
                v25 /* !! */  = hs.dq;
                if (true) ** GOTO lbl164
                block175: while (true) {
                    v25 /* !! */  = (long)(v26 - hs.bomw("bpam", bomt(int ), (int)121));
lbl164:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case 873348001: {
                            v26 = hs.bomw("bpan", bomt(int ), (int)122);
                            continue block175;
                        }
                        case 1509767219: {
                            break block175;
                        }
                        case 1525320216: {
                            v26 = hs.bomw("bpao", bomt(int ), (int)123);
                            continue block175;
                        }
                        case 1853130307: {
                            v26 = hs.bomw("bpap", bomt(int ), (int)124);
                            continue block175;
                        }
                    }
                    break;
                }
                v27 = hs.mc.field_1724;
                v28 /* !! */  = hs.dq;
                if (true) ** GOTO lbl181
                block176: while (true) {
                    v28 /* !! */  = (long)(v29 - hs.bomw("bpaq", bomt(int ), (int)125));
lbl181:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -1276949069: {
                            v29 = hs.bomw("bpar", bomt(int ), (int)126);
                            continue block176;
                        }
                        case -1118137411: {
                            v29 = hs.bomw("bpas", bomt(int ), (int)127);
                            continue block176;
                        }
                        case 1509767219: {
                            break block176;
                        }
                    }
                    break;
                }
                var1_4 = v27.method_36454() * hs.bomw("bpau", bpat(int ), (int)228);
                if (var5_3 || var5_3) continue block161;
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_9 = hs.dq - hs.bomw("bpav", bomt(int ), (int)128)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == hs.bomw("bpaw", bone(int ), (int)229)) break;
                    v30 /* !! */  = (long)hs.bomw("bpax", bone(int ), (int)230);
                }
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_10 = hs.dq - hs.bomw("bpay", bomt(int ), (int)129)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == hs.bomw("bpaz", bone(int ), (int)231)) break;
                    v31 /* !! */  = (long)hs.bomw("bpba", bone(int ), (int)232);
                }
                v32 = hs.mc.field_1724;
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_11 = hs.dq - hs.bomw("bpbb", bomt(int ), (int)130)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == hs.bomw("bpbc", bone(int ), (int)233)) break;
                    v33 /* !! */  = (long)hs.bomw("bpbd", bone(int ), (int)234);
                }
                v34 = v32.method_18798();
                while (true) {
                    if ((v35 /* !! */  = (cfr_temp_12 = hs.dq - hs.bomw("bpbe", bomt(int ), (int)131)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v35 /* !! */  == hs.bomw("bpbf", bone(int ), (int)235)) break;
                    v35 /* !! */  = (long)hs.bomw("bpbg", bone(int ), (int)236);
                }
                v36 = v34.field_1352;
                while (true) {
                    if ((v37 /* !! */  = (cfr_temp_13 = hs.dq - hs.bomw("bpbh", bomt(int ), (int)132)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v37 /* !! */  == hs.bomw("bpbi", bone(int ), (int)237)) break;
                    v37 /* !! */  = (long)hs.bomw("bpbj", bone(int ), (int)238);
                }
                v38 /* !! */  = hs.dq;
                if (true) ** GOTO lbl224
                block182: while (true) {
                    v38 /* !! */  = (long)(v39 - hs.bomw("bpbk", bomt(int ), (int)133));
lbl224:
                    // 2 sources

                    switch ((int)v38 /* !! */ ) {
                        case 365324540: {
                            v39 = hs.bomw("bpbl", bomt(int ), (int)134);
                            continue block182;
                        }
                        case 1509767219: {
                            break block182;
                        }
                        case 1527192605: {
                            v39 = hs.bomw("bpbm", bomt(int ), (int)135);
                            continue block182;
                        }
                        case 1995952197: {
                            v39 = hs.bomw("bpbn", bomt(int ), (int)136);
                            continue block182;
                        }
                    }
                    break;
                }
                v40 = hs.mc.field_1724;
                v41 /* !! */  = hs.dq;
                if (true) ** GOTO lbl241
                block183: while (true) {
                    v41 /* !! */  = (long)(hs.bomw("bpbp", bomt(int ), (int)138) - hs.bomw("bpbo", bomt(int ), (int)137));
lbl241:
                    // 2 sources

                    switch ((int)v41 /* !! */ ) {
                        case -407685409: {
                            continue block183;
                        }
                        case 1509767219: {
                            break block183;
                        }
                    }
                    break;
                }
                v42 = v40.method_18798();
                while (true) {
                    if ((v43 /* !! */  = (cfr_temp_14 = hs.dq - hs.bomw("bpbq", bomt(int ), (int)139)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v43 /* !! */  == hs.bomw("bpbr", bone(int ), (int)239)) break;
                    v43 /* !! */  = (long)hs.bomw("bpbs", bone(int ), (int)240);
                }
                v44 = v36 * v42.field_1352;
                v45 /* !! */  = hs.dq;
                if (true) ** GOTO lbl257
                block185: while (true) {
                    v45 /* !! */  = (long)(hs.bomw("bpbu", bomt(int ), (int)141) - hs.bomw("bpbt", bomt(int ), (int)140));
lbl257:
                    // 2 sources

                    switch ((int)v45 /* !! */ ) {
                        case 384474501: {
                            continue block185;
                        }
                        case 1509767219: {
                            break block185;
                        }
                    }
                    break;
                }
                v46 /* !! */  = hs.dq;
                if (true) ** GOTO lbl266
                block186: while (true) {
                    v46 /* !! */  = (long)(hs.bomw("bpbw", bomt(int ), (int)143) - hs.bomw("bpbv", bomt(int ), (int)142));
lbl266:
                    // 2 sources

                    switch ((int)v46 /* !! */ ) {
                        case -853620011: {
                            continue block186;
                        }
                        case 1509767219: {
                            break block186;
                        }
                    }
                    break;
                }
                v47 = hs.mc.field_1724;
                while (true) {
                    if ((v48 /* !! */  = (cfr_temp_15 = hs.dq - hs.bomw("bpbx", bomt(int ), (int)144)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                    if (v48 /* !! */  == hs.bomw("bpby", bone(int ), (int)241)) break;
                    v48 /* !! */  = (long)hs.bomw("bpbz", bone(int ), (int)242);
                }
                v49 = v47.method_18798();
                v50 /* !! */  = hs.dq;
                if (true) ** GOTO lbl282
                block188: while (true) {
                    v50 /* !! */  = (long)(v51 - hs.bomw("bpca", bomt(int ), (int)145));
lbl282:
                    // 2 sources

                    switch ((int)v50 /* !! */ ) {
                        case -755300888: {
                            v51 = hs.bomw("bpcb", bomt(int ), (int)146);
                            continue block188;
                        }
                        case 118168939: {
                            v51 = hs.bomw("bpcc", bomt(int ), (int)147);
                            continue block188;
                        }
                        case 1509767219: {
                            break block188;
                        }
                        case 2044198032: {
                            v51 = hs.bomw("bpcd", bomt(int ), (int)148);
                            continue block188;
                        }
                    }
                    break;
                }
                v52 = v49.field_1350;
                v53 /* !! */  = hs.dq;
                if (true) ** GOTO lbl299
                block189: while (true) {
                    v53 /* !! */  = (long)(v54 - hs.bomw("bpce", bomt(int ), (int)149));
lbl299:
                    // 2 sources

                    switch ((int)v53 /* !! */ ) {
                        case 97775724: {
                            v54 = hs.bomw("bpcf", bomt(int ), (int)150);
                            continue block189;
                        }
                        case 310748005: {
                            v54 = hs.bomw("bpcg", bomt(int ), (int)151);
                            continue block189;
                        }
                        case 1377819578: {
                            v54 = hs.bomw("bpch", bomt(int ), (int)152);
                            continue block189;
                        }
                        case 1509767219: {
                            break block189;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v55 /* !! */  = (cfr_temp_16 = hs.dq - hs.bomw("bpci", bomt(int ), (int)153)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                    if (v55 /* !! */  == hs.bomw("bpcj", bone(int ), (int)243)) break;
                    v55 /* !! */  = (long)hs.bomw("bpck", bone(int ), (int)244);
                }
                v56 = hs.mc.field_1724;
                v57 /* !! */  = hs.dq;
                if (true) ** GOTO lbl321
                block191: while (true) {
                    v57 /* !! */  = (long)(v58 - hs.bomw("bpcl", bomt(int ), (int)154));
lbl321:
                    // 2 sources

                    switch ((int)v57 /* !! */ ) {
                        case -577882379: {
                            v58 = hs.bomw("bpcm", bomt(int ), (int)155);
                            continue block191;
                        }
                        case 1509767219: {
                            break block191;
                        }
                        case 1683038113: {
                            v58 = hs.bomw("bpcn", bomt(int ), (int)156);
                            continue block191;
                        }
                        case 1711756906: {
                            v58 = hs.bomw("bpco", bomt(int ), (int)157);
                            continue block191;
                        }
                    }
                    break;
                }
                v59 = v56.method_18798();
                while (true) {
                    if ((v60 /* !! */  = (cfr_temp_17 = hs.dq - hs.bomw("bpcp", bomt(int ), (int)158)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
                    if (v60 /* !! */  == hs.bomw("bpcq", bone(int ), (int)245)) break;
                    v60 /* !! */  = (long)hs.bomw("bpcr", bone(int ), (int)246);
                }
                v61 = v44 + v52 * v59.field_1350;
                while (true) {
                    if ((v62 /* !! */  = (cfr_temp_18 = hs.dq - hs.bomw("bpcs", bomt(int ), (int)159)) == 0L ? 0 : (cfr_temp_18 < 0L ? -1 : 1)) == false) continue;
                    if (v62 /* !! */  == hs.bomw("bpct", bone(int ), (int)247)) break;
                    v62 /* !! */  = (long)hs.bomw("bpcu", bone(int ), (int)248);
                }
                var3_5 = Math.sqrt(v61);
                if (var5_3 || var5_3) continue block161;
                v63 /* !! */  = hs.dq;
                if (true) ** GOTO lbl351
                block194: while (true) {
                    v63 /* !! */  = (long)(v64 - hs.bomw("bpcv", bomt(int ), (int)160));
lbl351:
                    // 2 sources

                    switch ((int)v63 /* !! */ ) {
                        case 1495249478: {
                            v64 = hs.bomw("bpcw", bomt(int ), (int)161);
                            continue block194;
                        }
                        case 1509767219: {
                            break block194;
                        }
                        case 1719711830: {
                            v64 = hs.bomw("bpcx", bomt(int ), (int)162);
                            continue block194;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v65 /* !! */  = (cfr_temp_19 = hs.dq - hs.bomw("bpcy", bomt(int ), (int)163)) == 0L ? 0 : (cfr_temp_19 < 0L ? -1 : 1)) == false) continue;
                    if (v65 /* !! */  == hs.bomw("bpcz", bone(int ), (int)249)) break;
                    v65 /* !! */  = (long)hs.bomw("bpda", bone(int ), (int)250);
                }
                v66 = hs.mc.field_1724;
                v67 /* !! */  = hs.dq;
                if (true) ** GOTO lbl370
                block196: while (true) {
                    v67 /* !! */  = (long)(v68 - hs.bomw("bpdb", bomt(int ), (int)164));
lbl370:
                    // 2 sources

                    switch ((int)v67 /* !! */ ) {
                        case -1002419947: {
                            v68 = hs.bomw("bpdc", bomt(int ), (int)165);
                            continue block196;
                        }
                        case 1509767219: {
                            break block196;
                        }
                        case 1675719158: {
                            v68 = hs.bomw("bpdd", bomt(int ), (int)166);
                            continue block196;
                        }
                        case 1992135452: {
                            v68 = hs.bomw("bpde", bomt(int ), (int)167);
                            continue block196;
                        }
                    }
                    break;
                }
                v69 = -Math.sin(var1_4) * var3_5;
                while (true) {
                    if ((v70 /* !! */  = (cfr_temp_20 = hs.dq - hs.bomw("bpdf", bomt(int ), (int)168)) == 0L ? 0 : (cfr_temp_20 < 0L ? -1 : 1)) == false) continue;
                    if (v70 /* !! */  == hs.bomw("bpdg", bone(int ), (int)251)) break;
                    v70 /* !! */  = (long)hs.bomw("bpdh", bone(int ), (int)252);
                }
                v71 /* !! */  = hs.dq;
                if (true) ** GOTO lbl392
                block198: while (true) {
                    v71 /* !! */  = (long)(v72 - hs.bomw("bpdi", bomt(int ), (int)169));
lbl392:
                    // 2 sources

                    switch ((int)v71 /* !! */ ) {
                        case -1736540656: {
                            v72 = hs.bomw("bpdj", bomt(int ), (int)170);
                            continue block198;
                        }
                        case 384222472: {
                            v72 = hs.bomw("bpdk", bomt(int ), (int)171);
                            continue block198;
                        }
                        case 1509767219: {
                            break block198;
                        }
                    }
                    break;
                }
                v73 = hs.mc.field_1724;
                while (true) {
                    if ((v74 /* !! */  = (cfr_temp_21 = hs.dq - hs.bomw("bpdl", bomt(int ), (int)172)) == 0L ? 0 : (cfr_temp_21 < 0L ? -1 : 1)) == false) continue;
                    if (v74 /* !! */  == hs.bomw("bpdm", bone(int ), (int)253)) break;
                    v74 /* !! */  = (long)hs.bomw("bpdn", bone(int ), (int)254);
                }
                v75 = v73.method_18798();
                v76 /* !! */  = hs.dq;
                if (true) ** GOTO lbl412
                block200: while (true) {
                    v76 /* !! */  = (long)(v77 - hs.bomw("bpdo", bomt(int ), (int)173));
lbl412:
                    // 2 sources

                    switch ((int)v76 /* !! */ ) {
                        case -650990810: {
                            v77 = hs.bomw("bpdp", bomt(int ), (int)174);
                            continue block200;
                        }
                        case -516501733: {
                            v77 = hs.bomw("bpdq", bomt(int ), (int)175);
                            continue block200;
                        }
                        case -168448317: {
                            v77 = hs.bomw("bpdr", bomt(int ), (int)176);
                            continue block200;
                        }
                        case 1509767219: {
                            break block200;
                        }
                    }
                    break;
                }
                v78 = v75.field_1351;
                while (true) {
                    if ((v79 /* !! */  = (cfr_temp_22 = hs.dq - hs.bomw("bpds", bomt(int ), (int)177)) == 0L ? 0 : (cfr_temp_22 < 0L ? -1 : 1)) == false) continue;
                    if (v79 /* !! */  == hs.bomw("bpdt", bone(int ), (int)255)) break;
                    v79 /* !! */  = (long)hs.bomw("bpdu", bone(int ), (int)256);
                }
                v80 = Math.cos(var1_4) * var3_5;
                v81 /* !! */  = hs.dq;
                if (true) ** GOTO lbl435
                block202: while (true) {
                    v81 /* !! */  = (long)(v82 - hs.bomw("bpdv", bomt(int ), (int)178));
lbl435:
                    // 2 sources

                    switch ((int)v81 /* !! */ ) {
                        case -698039351: {
                            v82 = hs.bomw("bpdw", bomt(int ), (int)179);
                            continue block202;
                        }
                        case 35204653: {
                            v82 = hs.bomw("bpdx", bomt(int ), (int)180);
                            continue block202;
                        }
                        case 1509767219: {
                            break block202;
                        }
                    }
                    break;
                }
                v66.method_18800(v69, v78, v80);
                if (var5_3 || var5_3) continue block161;
                v83 /* !! */  = hs.dq;
                if (true) ** GOTO lbl450
                block203: while (true) {
                    v83 /* !! */  = (long)(v84 - hs.bomw("bpdy", bomt(int ), (int)181));
lbl450:
                    // 2 sources

                    switch ((int)v83 /* !! */ ) {
                        case 778479567: {
                            v84 = hs.bomw("bpdz", bomt(int ), (int)182);
                            continue block203;
                        }
                        case 1509767219: {
                            break block203;
                        }
                        case 1546482412: {
                            v84 = hs.bomw("bpea", bomt(int ), (int)183);
                            continue block203;
                        }
                        case 1556945118: {
                            v84 = hs.bomw("bpeb", bomt(int ), (int)184);
                            continue block203;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v85 /* !! */  = (cfr_temp_23 = hs.dq - hs.bomw("bpec", bomt(int ), (int)185)) == 0L ? 0 : (cfr_temp_23 < 0L ? -1 : 1)) == false) continue;
                    if (v85 /* !! */  == hs.bomw("bped", bone(int ), (int)257)) break;
                    v85 /* !! */  = (long)hs.bomw("bpee", bone(int ), (int)258);
                }
                v86 = hs.mc.field_1724;
                while (true) {
                    if ((v87 /* !! */  = (cfr_temp_24 = hs.dq - hs.bomw("bpef", bomt(int ), (int)186)) == 0L ? 0 : (cfr_temp_24 < 0L ? -1 : 1)) == false) continue;
                    if (v87 /* !! */  == hs.bomw("bpeg", bone(int ), (int)259)) break;
                    v87 /* !! */  = (long)hs.bomw("bpeh", bone(int ), (int)260);
                }
                v88 /* !! */  = hs.dq;
                if (true) ** GOTO lbl477
                block206: while (true) {
                    v88 /* !! */  = (long)(v89 - hs.bomw("bpei", bomt(int ), (int)187));
lbl477:
                    // 2 sources

                    switch ((int)v88 /* !! */ ) {
                        case -1662164753: {
                            v89 = hs.bomw("bpej", bomt(int ), (int)188);
                            continue block206;
                        }
                        case -564439869: {
                            v89 = hs.bomw("bpek", bomt(int ), (int)189);
                            continue block206;
                        }
                        case 440167890: {
                            v89 = hs.bomw("bpel", bomt(int ), (int)190);
                            continue block206;
                        }
                        case 1509767219: {
                            break block206;
                        }
                    }
                    break;
                }
                v90 = hs.mc.field_1724;
                v91 /* !! */  = hs.dq;
                if (true) ** GOTO lbl494
                block207: while (true) {
                    v91 /* !! */  = (long)(v92 - hs.bomw("bpem", bomt(int ), (int)191));
lbl494:
                    // 2 sources

                    switch ((int)v91 /* !! */ ) {
                        case -302080540: {
                            v92 = hs.bomw("bpen", bomt(int ), (int)192);
                            continue block207;
                        }
                        case -45139611: {
                            v92 = hs.bomw("bpeo", bomt(int ), (int)193);
                            continue block207;
                        }
                        case 920529803: {
                            v92 = hs.bomw("bpep", bomt(int ), (int)194);
                            continue block207;
                        }
                        case 1509767219: {
                            break block207;
                        }
                    }
                    break;
                }
                if (v90.field_6012 % hs.bomw("bpeq", bone(int ), (int)261) != 0) {
                    v93 = hs.bomw("bper", bone(int ), (int)262);
                    if (var7_1) {
                        throw null;
                    }
                } else {
                    v93 = hs.bomw("bpes", bone(int ), (int)263);
                }
                v94 /* !! */  = hs.dq;
                if (true) ** GOTO lbl516
                block208: while (true) {
                    v94 /* !! */  = (long)(v95 - hs.bomw("bpet", bomt(int ), (int)195));
lbl516:
                    // 2 sources

                    switch ((int)v94 /* !! */ ) {
                        case -1025168399: {
                            v95 = hs.bomw("bpeu", bomt(int ), (int)196);
                            continue block208;
                        }
                        case 512572052: {
                            v95 = hs.bomw("bpev", bomt(int ), (int)197);
                            continue block208;
                        }
                        case 1447943714: {
                            v95 = hs.bomw("bpew", bomt(int ), (int)198);
                            continue block208;
                        }
                        case 1509767219: {
                            break block208;
                        }
                    }
                    break;
                }
                v86.method_5728((boolean)v93);
                if (var5_3) continue block161;
lbl530:
                // 3 sources

                if (!var5_3 && !var5_3) ** break;
                continue block161;
                return;
lbl533:
                // 4 sources

                case 0: {
                    var6_2 /* !! */  = (int)hs.bomw("bpex", bone(int ), (int)264);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl567
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var6_2 /* !! */  = (int)hs.bomw("bpey", bone(int ), (int)265);
                        if (var7_1) {
                            throw null;
                        }
                        ** GOTO lbl616
                        break;
                    }
                }
lbl544:
                // 2 sources

                case 2: {
                    var6_2 /* !! */  = (int)hs.bomw("bpez", bone(int ), (int)266);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl612
                }
lbl549:
                // 2 sources

                case 3: {
                    var6_2 /* !! */  = (int)hs.bomw("bpfa", bone(int ), (int)267);
                    if (!var7_1) ** GOTO lbl533
                    throw null;
                }
lbl553:
                // 2 sources

                case 4: {
                    var6_2 /* !! */  = (int)hs.bomw("bpfb", bone(int ), (int)268);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl616
                }
lbl558:
                // 2 sources

                case 5: {
                    var6_2 /* !! */  = (int)hs.bomw("bpfc", bone(int ), (int)269);
                    if (!var7_1) ** GOTO lbl549
                    throw null;
                }
                case 6: {
                    var6_2 /* !! */  = (int)hs.bomw("bpfd", bone(int ), (int)270);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl603
                }
lbl567:
                // 2 sources

                case 7: {
                    var6_2 /* !! */  = (int)hs.bomw("bpfe", bone(int ), (int)271);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl630
                }
                case 8: {
                    var6_2 /* !! */  = (int)hs.bomw("bpff", bone(int ), (int)272);
                    if (!var7_1) ** GOTO lbl558
                    throw null;
                }
                case 9: {
                    var6_2 /* !! */  = (int)hs.bomw("bpfg", bone(int ), (int)273);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl603
                }
                case 10: {
                    var6_2 /* !! */  = (int)hs.bomw("bpfh", bone(int ), (int)274);
                    if (!var7_1) ** GOTO lbl533
                    throw null;
                }
lbl585:
                // 2 sources

                case 11: {
                    var6_2 /* !! */  = (int)hs.bomw("bpfi", bone(int ), (int)275);
                    if (!var7_1) ** GOTO lbl553
                    throw null;
                }
                case 12: {
                    var6_2 /* !! */  = (int)hs.bomw("bpfj", bone(int ), (int)276);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl612
                }
                case 13: {
                    var6_2 /* !! */  = (int)hs.bomw("bpfk", bone(int ), (int)277);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl607
                }
                case 14: {
                    var6_2 /* !! */  = (int)hs.bomw("bpfl", bone(int ), (int)278);
                    if (!var7_1) ** GOTO lbl544
                    throw null;
                }
lbl603:
                // 3 sources

                case 15: {
                    var6_2 /* !! */  = (int)hs.bomw("bpfm", bone(int ), (int)279);
                    if (!var7_1) break block161;
                    throw null;
                }
lbl607:
                // 2 sources

                case 16: {
                    var6_2 /* !! */  = (int)hs.bomw("bpfn", bone(int ), (int)280);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl630
                }
lbl612:
                // 3 sources

                case 17: {
                    var6_2 /* !! */  = (int)hs.bomw("bpfo", bone(int ), (int)281);
                    if (!var7_1) ** GOTO lbl533
                    throw null;
                }
lbl616:
                // 3 sources

                case 18: {
                    var6_2 /* !! */  = (int)hs.bomw("bpfp", bone(int ), (int)282);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl630
                }
                case 19: {
                    var6_2 /* !! */  = (int)hs.bomw("bpfq", bone(int ), (int)283);
                    if (!var7_1) ** GOTO lbl585
                    throw null;
                }
                case 20: {
                    do {
                        var6_2 /* !! */  = (int)hs.bomw("bpfr", bone(int ), (int)284);
                    } while (!var7_1);
                    throw null;
                }
lbl630:
                // 4 sources

                case 21: {
                    var6_2 /* !! */  = (int)hs.bomw("bpfs", bone(int ), (int)285);
                    if (!var7_1) break block161;
                    throw null;
                }
                case 22: 
            }
        }
        var6_2 /* !! */  = (int)hs.bomw("bpft", bone(int ), (int)286);
        ** while (!var7_1)
lbl637:
        // 1 sources

        throw null;
    }
}

