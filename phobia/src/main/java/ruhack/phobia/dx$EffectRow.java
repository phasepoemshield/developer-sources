/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  net.minecraft.class_2960
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_2960;

final class dx$EffectRow
extends Record {
    public static final int b;
    private final int level;
    public static final long gm = 3128186905741535143L;
    private final int duration;
    private static long[] cuod;
    public static final boolean c;
    private final String name;
    private final String id;
    public static final boolean a;
    private static int[] cuno;
    private static int[] cunq;
    private static long[] cuof;
    private final class_2960 icon;
    private final boolean harmful;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String name() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dx$EffectRow.gm - dx$EffectRow.cuns("cuso", cuoc(int ), (int)31)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dx$EffectRow.cuns("cusq", cunm(int ), (int)37)) break;
            v0 /* !! */  = (long)dx$EffectRow.cuns("cuss", cunm(int ), (int)38);
        }
        var3_1 = dx$EffectRow.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = dx$EffectRow.gm - dx$EffectRow.cuns("cust", cuoc(int ), (int)32)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == dx$EffectRow.cuns("cusw", cunm(int ), (int)39)) break;
            v1 /* !! */  = (long)dx$EffectRow.cuns("cusx", cunm(int ), (int)40);
        }
        var2_2 = dx$EffectRow.b;
        v2 /* !! */  = dx$EffectRow.gm;
        if (true) ** GOTO lbl19
        block8: while (true) {
            v2 /* !! */  = (long)(v3 - dx$EffectRow.cuns("cusy", cuoc(int ), (int)33));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1145002073: {
                    break block8;
                }
                case -720196048: {
                    v3 = dx$EffectRow.cuns("cuta", cuoc(int ), (int)34);
                    continue block8;
                }
                case 832957068: {
                    v3 = dx$EffectRow.cuns("cutb", cuoc(int ), (int)35);
                    continue block8;
                }
                case 1242156030: {
                    v3 = dx$EffectRow.cuns("cutd", cuoc(int ), (int)36);
                    continue block8;
                }
            }
            break;
        }
        var1_3 = dx$EffectRow.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = dx$EffectRow.gm - dx$EffectRow.cuns("cutg", cuoc(int ), (int)37)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == dx$EffectRow.cuns("cuti", cunm(int ), (int)41)) break;
            v4 /* !! */  = (long)dx$EffectRow.cuns("cutk", cunm(int ), (int)42);
        }
        return this.name;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_2960 icon() {
        v0 /* !! */  = dx$EffectRow.gm;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - dx$EffectRow.cuns("cuxd", cuoc(int ), (int)60));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1835400567: {
                    v1 = dx$EffectRow.cuns("cuxe", cuoc(int ), (int)61);
                    continue block16;
                }
                case -1145002073: {
                    break block16;
                }
                case -355144147: {
                    v1 = dx$EffectRow.cuns("cuxf", cuoc(int ), (int)62);
                    continue block16;
                }
                case -201404197: {
                    v1 = dx$EffectRow.cuns("cuxh", cuoc(int ), (int)63);
                    continue block16;
                }
            }
            break;
        }
        var3_1 = dx$EffectRow.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = dx$EffectRow.gm - dx$EffectRow.cuns("cuxk", cuoc(int ), (int)64)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == dx$EffectRow.cuns("cuxl", cunm(int ), (int)76)) break;
            v2 /* !! */  = (long)dx$EffectRow.cuns("cuxm", cunm(int ), (int)77);
        }
        var2_2 /* !! */  = dx$EffectRow.b;
        v3 /* !! */  = dx$EffectRow.gm;
        if (true) ** GOTO lbl29
        block18: while (true) {
            v3 /* !! */  = (long)(dx$EffectRow.cuns("cuxo", cuoc(int ), (int)66) - dx$EffectRow.cuns("cuxn", cuoc(int ), (int)65));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2110839850: {
                    continue block18;
                }
                case -1145002073: {
                    break block18;
                }
            }
            break;
        }
        var1_3 = dx$EffectRow.a;
        if (var3_1) {
            throw null;
lbl37:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl40:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = dx$EffectRow.gm - dx$EffectRow.cuns("cuxq", cuoc(int ), (int)67)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == dx$EffectRow.cuns("cuxs", cunm(int ), (int)78)) break;
                    v4 /* !! */  = (long)dx$EffectRow.cuns("cuxv", cunm(int ), (int)79);
                }
                return this.icon;
            }
lbl50:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)dx$EffectRow.cuns("cuxw", cunm(int ), (int)80);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl60
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dx$EffectRow.cuns("cuxy", cunm(int ), (int)81);
                    if (!var3_1) break block10;
                    throw null;
                }
            }
lbl60:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)dx$EffectRow.cuns("cuxz", cunm(int ), (int)82);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)dx$EffectRow.cuns("cuya", cunm(int ), (int)83);
        ** while (!var3_1)
lbl67:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cuzg() {
        dx$EffectRow.cuof[0] = 8178633989217633719L;
        dx$EffectRow.cuof[1] = -6244019929654856488L;
        dx$EffectRow.cuof[2] = 2067538251451861634L;
        dx$EffectRow.cuof[3] = 5174948648540871979L;
        dx$EffectRow.cuof[4] = 635605300044423984L;
        dx$EffectRow.cuof[5] = 4026768860245230295L;
        dx$EffectRow.cuof[6] = 7100735485673878756L;
        dx$EffectRow.cuof[7] = -3130098132019554458L;
        dx$EffectRow.cuof[8] = -8040526363364427972L;
        dx$EffectRow.cuof[9] = 8995485727917476057L;
        dx$EffectRow.cuof[10] = 1924108395115984636L;
        dx$EffectRow.cuof[11] = -457975222740426508L;
        dx$EffectRow.cuof[12] = 6402204670019015522L;
        dx$EffectRow.cuof[13] = -5983442626169769902L;
        dx$EffectRow.cuof[14] = 1487944474571711032L;
        dx$EffectRow.cuof[15] = -6099253602432458182L;
        dx$EffectRow.cuof[16] = -4051356112376148159L;
        dx$EffectRow.cuof[17] = -5705178673017821103L;
        dx$EffectRow.cuof[18] = -7807329300400208318L;
        dx$EffectRow.cuof[19] = 252881986793842433L;
        dx$EffectRow.cuof[20] = -2392775892618546835L;
        dx$EffectRow.cuof[21] = -2307472829809332727L;
        dx$EffectRow.cuof[22] = -8458582253107435094L;
        dx$EffectRow.cuof[23] = 7910327115443979664L;
        dx$EffectRow.cuof[24] = 4255352190015568277L;
        dx$EffectRow.cuof[25] = -9035659272364951144L;
        dx$EffectRow.cuof[26] = 6744906704188388368L;
        dx$EffectRow.cuof[27] = -2720385467289169334L;
        dx$EffectRow.cuof[28] = -7700217948590458313L;
        dx$EffectRow.cuof[29] = -4798067567397598826L;
        dx$EffectRow.cuof[30] = 326681194586629102L;
        dx$EffectRow.cuof[31] = 4756711675362700749L;
        dx$EffectRow.cuof[32] = -5404140438842034663L;
        dx$EffectRow.cuof[33] = -3812306739358020792L;
        dx$EffectRow.cuof[34] = -1271922284535327638L;
        dx$EffectRow.cuof[35] = -1653144665391415963L;
        dx$EffectRow.cuof[36] = 5606366021054350390L;
        dx$EffectRow.cuof[37] = 8964921978483478649L;
        dx$EffectRow.cuof[38] = -210687211931451982L;
        dx$EffectRow.cuof[39] = 3658041253030215141L;
        dx$EffectRow.cuof[40] = 7003223394431882682L;
        dx$EffectRow.cuof[41] = -591752316995813971L;
        dx$EffectRow.cuof[42] = 8116391075704293526L;
        dx$EffectRow.cuof[43] = 1723456395701739175L;
        dx$EffectRow.cuof[44] = -2553711970874908047L;
        dx$EffectRow.cuof[45] = 6439760359842795013L;
        dx$EffectRow.cuof[46] = -5256299273989110878L;
        dx$EffectRow.cuof[47] = -4751790518598781852L;
        dx$EffectRow.cuof[48] = 8641569314372241178L;
        dx$EffectRow.cuof[49] = -2204661853375575902L;
        dx$EffectRow.cuof[50] = 7737171985158641228L;
        dx$EffectRow.cuof[51] = 7766836748033926162L;
        dx$EffectRow.cuof[52] = -7353609126866439847L;
        dx$EffectRow.cuof[53] = -1261410730081362797L;
        dx$EffectRow.cuof[54] = 7887425159774391587L;
        dx$EffectRow.cuof[55] = 5411225139611545471L;
        dx$EffectRow.cuof[56] = 5833980771028155109L;
        dx$EffectRow.cuof[57] = -1190658521377284729L;
        dx$EffectRow.cuof[58] = 3812552810025179995L;
        dx$EffectRow.cuof[59] = 8651568932066176893L;
        dx$EffectRow.cuof[60] = -4625733503066215703L;
        dx$EffectRow.cuof[61] = -6249587120275398261L;
        dx$EffectRow.cuof[62] = -8668727910632770583L;
        dx$EffectRow.cuof[63] = -5319749391269128907L;
        dx$EffectRow.cuof[64] = 3593702052308293184L;
        dx$EffectRow.cuof[65] = 1654672451440384837L;
        dx$EffectRow.cuof[66] = 999633325384332339L;
        dx$EffectRow.cuof[67] = 3851643653201246704L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int level() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dx$EffectRow.gm - dx$EffectRow.cuns("cuts", cuoc(int ), (int)38)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dx$EffectRow.cuns("cutt", cunm(int ), (int)47)) break;
            v0 /* !! */  = (long)dx$EffectRow.cuns("cutu", cunm(int ), (int)48);
        }
        var3_1 = dx$EffectRow.c;
        v1 /* !! */  = dx$EffectRow.gm;
        if (true) ** GOTO lbl12
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - dx$EffectRow.cuns("cutv", cuoc(int ), (int)39));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1486850098: {
                    v2 = dx$EffectRow.cuns("cutw", cuoc(int ), (int)40);
                    continue block18;
                }
                case -1145002073: {
                    break block18;
                }
                case 444733499: {
                    v2 = dx$EffectRow.cuns("cuua", cuoc(int ), (int)41);
                    continue block18;
                }
                case 1236219865: {
                    v2 = dx$EffectRow.cuns("cuuc", cuoc(int ), (int)42);
                    continue block18;
                }
            }
            break;
        }
        var2_2 = dx$EffectRow.b;
        v3 /* !! */  = dx$EffectRow.gm;
        if (true) ** GOTO lbl29
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - dx$EffectRow.cuns("cuud", cuoc(int ), (int)43));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1819476135: {
                    v4 = dx$EffectRow.cuns("cuuf", cuoc(int ), (int)44);
                    continue block19;
                }
                case -1145002073: {
                    break block19;
                }
                case 1858993389: {
                    v4 = dx$EffectRow.cuns("cuug", cuoc(int ), (int)45);
                    continue block19;
                }
            }
            break;
        }
        var1_3 = dx$EffectRow.a;
        if (var3_1) {
            throw null;
lbl41:
            // 1 sources

            return (int)dx$EffectRow.cuns("cuui", cunm(int ), (int)49);
        }
        ** while (var1_3 || var1_3)
lbl44:
        // 1 sources

        v5 /* !! */  = dx$EffectRow.gm;
        if (true) ** GOTO lbl48
        block21: while (true) {
            v5 /* !! */  = (long)(v6 - dx$EffectRow.cuns("cuuk", cuoc(int ), (int)46));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1145002073: {
                    break block21;
                }
                case -827540736: {
                    v6 = dx$EffectRow.cuns("cuum", cuoc(int ), (int)47);
                    continue block21;
                }
                case 1926601546: {
                    v6 = dx$EffectRow.cuns("cuuo", cuoc(int ), (int)48);
                    continue block21;
                }
                case 1928532467: {
                    v6 = dx$EffectRow.cuns("cuuq", cuoc(int ), (int)49);
                    continue block21;
                }
            }
            break;
        }
        return this.level;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int duration() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dx$EffectRow.gm - dx$EffectRow.cuns("cuva", cuoc(int ), (int)50)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dx$EffectRow.cuns("cuvb", cunm(int ), (int)54)) break;
            v0 /* !! */  = (long)dx$EffectRow.cuns("cuvd", cunm(int ), (int)55);
        }
        var3_1 = dx$EffectRow.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = dx$EffectRow.gm - dx$EffectRow.cuns("cuve", cuoc(int ), (int)51)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == dx$EffectRow.cuns("cuvf", cunm(int ), (int)56)) break;
            v1 /* !! */  = (long)dx$EffectRow.cuns("cuvl", cunm(int ), (int)57);
        }
        var2_2 /* !! */  = dx$EffectRow.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = dx$EffectRow.gm - dx$EffectRow.cuns("cuvm", cuoc(int ), (int)52)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == dx$EffectRow.cuns("cuvn", cunm(int ), (int)58)) break;
            v2 /* !! */  = (long)dx$EffectRow.cuns("cuvo", cunm(int ), (int)59);
        }
        var1_3 = dx$EffectRow.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return (int)dx$EffectRow.cuns("cuvp", cunm(int ), (int)60);
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = dx$EffectRow.gm;
                if (true) ** GOTO lbl35
                block14: while (true) {
                    v3 /* !! */  = (long)(dx$EffectRow.cuns("cuvr", cuoc(int ), (int)54) - dx$EffectRow.cuns("cuvq", cuoc(int ), (int)53));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1145002073: {
                            break block14;
                        }
                        case 1941527644: {
                            continue block14;
                        }
                    }
                    break;
                }
                return this.duration;
            }
lbl41:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)dx$EffectRow.cuns("cuvs", cunm(int ), (int)61);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)dx$EffectRow.cuns("cuvu", cunm(int ), (int)62);
                if (!var3_1) ** GOTO lbl41
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dx$EffectRow.cuns("cuvw", cunm(int ), (int)63);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)dx$EffectRow.cuns("cuvy", cunm(int ), (int)64);
        ** while (!var3_1)
lbl57:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long cuoc(int n2) {
        return cuod[n2] ^ cuof[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean harmful() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dx$EffectRow.gm - dx$EffectRow.cuns("cuwb", cuoc(int ), (int)55)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dx$EffectRow.cuns("cuwd", cunm(int ), (int)65)) break;
            v0 /* !! */  = (long)dx$EffectRow.cuns("cuwe", cunm(int ), (int)66);
        }
        var3_1 = dx$EffectRow.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = dx$EffectRow.gm - dx$EffectRow.cuns("cuwf", cuoc(int ), (int)56)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == dx$EffectRow.cuns("cuwh", cunm(int ), (int)67)) break;
            v1 /* !! */  = (long)dx$EffectRow.cuns("cuwi", cunm(int ), (int)68);
        }
        var2_2 /* !! */  = dx$EffectRow.b;
        v2 /* !! */  = dx$EffectRow.gm;
        if (true) ** GOTO lbl19
        block12: while (true) {
            v2 /* !! */  = (long)(dx$EffectRow.cuns("cuwl", cuoc(int ), (int)58) - dx$EffectRow.cuns("cuwk", cuoc(int ), (int)57));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2084853420: {
                    continue block12;
                }
                case -1145002073: {
                    break block12;
                }
            }
            break;
        }
        var1_3 = dx$EffectRow.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return (boolean)dx$EffectRow.cuns("cuwp", cunm(int ), (int)69);
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = dx$EffectRow.gm - dx$EffectRow.cuns("cuwr", cuoc(int ), (int)59)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == dx$EffectRow.cuns("cuwt", cunm(int ), (int)70)) break;
                    v3 /* !! */  = (long)dx$EffectRow.cuns("cuwu", cunm(int ), (int)71);
                }
                return this.harmful;
            }
            case 0: {
                var2_2 /* !! */  = (int)dx$EffectRow.cuns("cuwv", cunm(int ), (int)72);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)dx$EffectRow.cuns("cuww", cunm(int ), (int)73);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)dx$EffectRow.cuns("cuwz", cunm(int ), (int)74);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)dx$EffectRow.cuns("cuxa", cunm(int ), (int)75);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private dx$EffectRow(String var1_1, String var2_2, int var3_3, int var4_4, boolean var5_5, class_2960 var6_6) {
        var8_7 /* !! */  = dx$EffectRow.b;
        super();
        this.id = var1_1;
        this.name = var2_2;
        this.level = var3_3;
        if (var8_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.duration = var4_4;
                this.harmful = var5_5;
                this.icon = var6_6;
                return;
            }
lbl13:
            // 2 sources

            case 0: {
                var8_7 /* !! */  = (int)dx$EffectRow.cuns("cunu", cunm(int ), (int)0);
            }
lbl15:
            // 3 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_7 /* !! */  = (int)dx$EffectRow.cuns("cunv", cunm(int ), (int)1);
                    continue;
                    break;
                }
            }
            case 2: {
                var8_7 /* !! */  = (int)dx$EffectRow.cuns("cunx", cunm(int ), (int)2);
                ** GOTO lbl15
            }
            case 3: {
                var8_7 /* !! */  = (int)dx$EffectRow.cuns("cuoa", cunm(int ), (int)3);
                ** GOTO lbl13
            }
            case 4: 
        }
        var8_7 /* !! */  = (int)dx$EffectRow.cuns("cuob", cunm(int ), (int)4);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dx$EffectRow.gm - dx$EffectRow.cuns("cupj", cuoc(int ), (int)6)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dx$EffectRow.cuns("cupk", cunm(int ), (int)15)) break;
            v0 /* !! */  = (long)dx$EffectRow.cuns("cupl", cunm(int ), (int)16);
        }
        var3_1 = dx$EffectRow.c;
        v1 /* !! */  = dx$EffectRow.gm;
        if (true) ** GOTO lbl12
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - dx$EffectRow.cuns("cupm", cuoc(int ), (int)7));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1223279350: {
                    v2 = dx$EffectRow.cuns("cupn", cuoc(int ), (int)8);
                    continue block22;
                }
                case -1145002073: {
                    break block22;
                }
                case 1682278176: {
                    v2 = dx$EffectRow.cuns("cupo", cuoc(int ), (int)9);
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = dx$EffectRow.b;
        v3 /* !! */  = dx$EffectRow.gm;
        if (true) ** GOTO lbl26
        block23: while (true) {
            v3 /* !! */  = (long)(dx$EffectRow.cuns("cupq", cuoc(int ), (int)11) - dx$EffectRow.cuns("cupp", cuoc(int ), (int)10));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1145002073: {
                    break block23;
                }
                case 714608530: {
                    continue block23;
                }
            }
            break;
        }
        var1_3 = dx$EffectRow.a;
        if (!var3_1) ** GOTO lbl38
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)dx$EffectRow.cuns("cupr", cunm(int ), (int)17);
                }
lbl38:
                // 1 sources

                if (var1_3 || var1_3) continue block24;
                v4 /* !! */  = dx$EffectRow.gm;
                if (true) ** GOTO lbl43
                block25: while (true) {
                    v4 /* !! */  = (long)(v5 - dx$EffectRow.cuns("cupt", cuoc(int ), (int)12));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1145002073: {
                            break block25;
                        }
                        case -871327384: {
                            v5 = dx$EffectRow.cuns("cupu", cuoc(int ), (int)13);
                            continue block25;
                        }
                        case -438604849: {
                            v5 = dx$EffectRow.cuns("cupv", cuoc(int ), (int)14);
                            continue block25;
                        }
                        case -430067039: {
                            v5 = dx$EffectRow.cuns("cupy", cuoc(int ), (int)15);
                            continue block25;
                        }
                    }
                    break;
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dx$EffectRow.class, "id;name;level;duration;harmful;icon", "id", "name", "level", "duration", "harmful", "icon"}, this);
                case 0: {
                    var2_2 /* !! */  = (int)dx$EffectRow.cuns("cupz", cunm(int ), (int)18);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)dx$EffectRow.cuns("cuqa", cunm(int ), (int)19);
                    if (!var3_1) break block24;
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)dx$EffectRow.cuns("cuqb", cunm(int ), (int)20);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)dx$EffectRow.cuns("cuqd", cunm(int ), (int)21);
        ** while (!var3_1)
lbl72:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean equals(Object object) {
        boolean bl2;
        Object object2 = gm;
        block8: while (true) {
            switch ((int)object2) {
                case -1145002073: {
                    break block8;
                }
                case 403715152: {
                    object2 = dx$EffectRow.cuns("cuqh", cuoc(int ), (int)17) - dx$EffectRow.cuns("cuqe", cuoc(int ), (int)16);
                    continue block8;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object3 = gm;
        block9: while (true) {
            switch ((int)object3) {
                case -1331432198: {
                    object3 = dx$EffectRow.cuns("cuqj", cuoc(int ), (int)19) - dx$EffectRow.cuns("cuqi", cuoc(int ), (int)18);
                    continue block9;
                }
                case -1145002073: {
                    break block9;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = gm - dx$EffectRow.cuns("cuqk", cuoc(int ), (int)20)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == dx$EffectRow.cuns("cuql", cunm(int ), (int)22)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object4 = dx$EffectRow.cuns("cuqm", cunm(int ), (int)23);
        }
        if (bl2) return (boolean)dx$EffectRow.cuns("curd", cunm(int ), (int)24);
        if (bl2) return (boolean)dx$EffectRow.cuns("curd", cunm(int ), (int)24);
        while (true) {
            long l3;
            Object object5;
            if ((object5 = (l3 = gm - dx$EffectRow.cuns("cure", cuoc(int ), (int)21)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object5 == dx$EffectRow.cuns("curf", cunm(int ), (int)25)) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dx$EffectRow.class, "id;name;level;duration;harmful;icon", "id", "name", "level", "duration", "harmful", "icon"}, this, object);
            }
            object5 = dx$EffectRow.cuns("curg", cunm(int ), (int)26);
        }
    }

    private static /* synthetic */ void cuyt() {
        dx$EffectRow.cuod[0] = -5397658687678736114L;
        dx$EffectRow.cuod[1] = 6858678011119662635L;
        dx$EffectRow.cuod[2] = 8976755342052265848L;
        dx$EffectRow.cuod[3] = -6981526263310605608L;
        dx$EffectRow.cuod[4] = -1725049091678567889L;
        dx$EffectRow.cuod[5] = 2981869390736099439L;
        dx$EffectRow.cuod[6] = 1087794259125894263L;
        dx$EffectRow.cuod[7] = 3183158234121355227L;
        dx$EffectRow.cuod[8] = 7393831325697025459L;
        dx$EffectRow.cuod[9] = 1180360534173578774L;
        dx$EffectRow.cuod[10] = -8942493027266553002L;
        dx$EffectRow.cuod[11] = -8949539150618919400L;
        dx$EffectRow.cuod[12] = 5007765032808046216L;
        dx$EffectRow.cuod[13] = -7717521110514245202L;
        dx$EffectRow.cuod[14] = 5251526931573791593L;
        dx$EffectRow.cuod[15] = -9049044612776611271L;
        dx$EffectRow.cuod[16] = -6813325243586192762L;
        dx$EffectRow.cuod[17] = -3078753036443295161L;
        dx$EffectRow.cuod[18] = 8618878191869314892L;
        dx$EffectRow.cuod[19] = -441631071203891318L;
        dx$EffectRow.cuod[20] = 398519194279700636L;
        dx$EffectRow.cuod[21] = 5253299649872185526L;
        dx$EffectRow.cuod[22] = -8392536998640994688L;
        dx$EffectRow.cuod[23] = -3069895372254590726L;
        dx$EffectRow.cuod[24] = 7062848025058551465L;
        dx$EffectRow.cuod[25] = 4246843807631006070L;
        dx$EffectRow.cuod[26] = 4349915860294559553L;
        dx$EffectRow.cuod[27] = -1106271846512047353L;
        dx$EffectRow.cuod[28] = 5139044874006956770L;
        dx$EffectRow.cuod[29] = -6739212166742828364L;
        dx$EffectRow.cuod[30] = 1833582968253212212L;
        dx$EffectRow.cuod[31] = -7735917975255616414L;
        dx$EffectRow.cuod[32] = -314019506829752512L;
        dx$EffectRow.cuod[33] = 6708115878611846841L;
        dx$EffectRow.cuod[34] = -3923508589457966995L;
        dx$EffectRow.cuod[35] = -6404321012969627141L;
        dx$EffectRow.cuod[36] = 8994651781417501935L;
        dx$EffectRow.cuod[37] = -5593334220700702072L;
        dx$EffectRow.cuod[38] = 2486253813569531077L;
        dx$EffectRow.cuod[39] = -1908255287535414179L;
        dx$EffectRow.cuod[40] = -6636125158834807568L;
        dx$EffectRow.cuod[41] = 83555783599782841L;
        dx$EffectRow.cuod[42] = 1048491082890934753L;
        dx$EffectRow.cuod[43] = 4072631252836307582L;
        dx$EffectRow.cuod[44] = 3668188603309035610L;
        dx$EffectRow.cuod[45] = 7708395146017675895L;
        dx$EffectRow.cuod[46] = -1681565151386722734L;
        dx$EffectRow.cuod[47] = -2188476074884705326L;
        dx$EffectRow.cuod[48] = -1634745036651826148L;
        dx$EffectRow.cuod[49] = 2498965448864269290L;
        dx$EffectRow.cuod[50] = -7665301251096399032L;
        dx$EffectRow.cuod[51] = 1263093643574688068L;
        dx$EffectRow.cuod[52] = 7328313928077926322L;
        dx$EffectRow.cuod[53] = 2553670794620577028L;
        dx$EffectRow.cuod[54] = -2201909506776993044L;
        dx$EffectRow.cuod[55] = -6844110447352382989L;
        dx$EffectRow.cuod[56] = -4283247977318326307L;
        dx$EffectRow.cuod[57] = -6739690187484997025L;
        dx$EffectRow.cuod[58] = 3954398078784922433L;
        dx$EffectRow.cuod[59] = -3836483495248053962L;
        dx$EffectRow.cuod[60] = -588016151351590619L;
        dx$EffectRow.cuod[61] = -8532488151379376075L;
        dx$EffectRow.cuod[62] = 5599354039425970830L;
        dx$EffectRow.cuod[63] = 1110674610350426873L;
        dx$EffectRow.cuod[64] = 5112536160777866244L;
        dx$EffectRow.cuod[65] = -8194065154888355723L;
        dx$EffectRow.cuod[66] = 6324473848857353708L;
        dx$EffectRow.cuod[67] = 1667317902575153003L;
    }

    private static /* synthetic */ void cuyb() {
        dx$EffectRow.cuno[0] = 0x9998BB;
        dx$EffectRow.cuno[1] = -1049158553;
        dx$EffectRow.cuno[2] = -1957974775;
        dx$EffectRow.cuno[3] = -1453457361;
        dx$EffectRow.cuno[4] = 979725493;
        dx$EffectRow.cuno[5] = -423800251;
        dx$EffectRow.cuno[6] = 234075453;
        dx$EffectRow.cuno[7] = -635566864;
        dx$EffectRow.cuno[8] = 196266193;
        dx$EffectRow.cuno[9] = 77271940;
        dx$EffectRow.cuno[10] = -1710400294;
        dx$EffectRow.cuno[11] = 928272099;
        dx$EffectRow.cuno[12] = 653169139;
        dx$EffectRow.cuno[13] = 585899072;
        dx$EffectRow.cuno[14] = 2101020115;
        dx$EffectRow.cuno[15] = 470498759;
        dx$EffectRow.cuno[16] = 1460106116;
        dx$EffectRow.cuno[17] = 1048782249;
        dx$EffectRow.cuno[18] = 1015544660;
        dx$EffectRow.cuno[19] = -1204626785;
        dx$EffectRow.cuno[20] = -1096610929;
        dx$EffectRow.cuno[21] = 1810088928;
        dx$EffectRow.cuno[22] = 1669277302;
        dx$EffectRow.cuno[23] = 1657319352;
        dx$EffectRow.cuno[24] = -967516699;
        dx$EffectRow.cuno[25] = -2085820360;
        dx$EffectRow.cuno[26] = 140506755;
        dx$EffectRow.cuno[27] = 515896779;
        dx$EffectRow.cuno[28] = -1731643166;
        dx$EffectRow.cuno[29] = 1486096877;
        dx$EffectRow.cuno[30] = 2115879109;
        dx$EffectRow.cuno[31] = -916306656;
        dx$EffectRow.cuno[32] = -1829826387;
        dx$EffectRow.cuno[33] = -1319981658;
        dx$EffectRow.cuno[34] = 1302220532;
        dx$EffectRow.cuno[35] = 2100594832;
        dx$EffectRow.cuno[36] = -1690393267;
        dx$EffectRow.cuno[37] = -1414067026;
        dx$EffectRow.cuno[38] = 881394806;
        dx$EffectRow.cuno[39] = -1495576016;
        dx$EffectRow.cuno[40] = -1446886282;
        dx$EffectRow.cuno[41] = -472718458;
        dx$EffectRow.cuno[42] = 608978361;
        dx$EffectRow.cuno[43] = 245170117;
        dx$EffectRow.cuno[44] = 1671648815;
        dx$EffectRow.cuno[45] = -1594623891;
        dx$EffectRow.cuno[46] = 1386822053;
        dx$EffectRow.cuno[47] = -1470872687;
        dx$EffectRow.cuno[48] = -1328216907;
        dx$EffectRow.cuno[49] = 2089547342;
        dx$EffectRow.cuno[50] = 1780737063;
        dx$EffectRow.cuno[51] = 1994662463;
        dx$EffectRow.cuno[52] = -741505560;
        dx$EffectRow.cuno[53] = 499466062;
        dx$EffectRow.cuno[54] = -1532094544;
        dx$EffectRow.cuno[55] = -80789435;
        dx$EffectRow.cuno[56] = 1855290287;
        dx$EffectRow.cuno[57] = 986009962;
        dx$EffectRow.cuno[58] = 1125611315;
        dx$EffectRow.cuno[59] = -1251830423;
        dx$EffectRow.cuno[60] = 1115934968;
        dx$EffectRow.cuno[61] = -2003999222;
        dx$EffectRow.cuno[62] = 1825469545;
        dx$EffectRow.cuno[63] = -106540013;
        dx$EffectRow.cuno[64] = -1510929446;
        dx$EffectRow.cuno[65] = -539389111;
        dx$EffectRow.cuno[66] = -2045231327;
        dx$EffectRow.cuno[67] = -565608157;
        dx$EffectRow.cuno[68] = 770619029;
        dx$EffectRow.cuno[69] = -375049158;
        dx$EffectRow.cuno[70] = 1206502515;
        dx$EffectRow.cuno[71] = 2014683936;
        dx$EffectRow.cuno[72] = 2099107649;
        dx$EffectRow.cuno[73] = -458845196;
        dx$EffectRow.cuno[74] = 1829529285;
        dx$EffectRow.cuno[75] = -1799100013;
        dx$EffectRow.cuno[76] = -1429665476;
        dx$EffectRow.cuno[77] = 1823021124;
        dx$EffectRow.cuno[78] = 1511209032;
        dx$EffectRow.cuno[79] = 346783686;
        dx$EffectRow.cuno[80] = -1301660401;
        dx$EffectRow.cuno[81] = 1590462380;
        dx$EffectRow.cuno[82] = 141041717;
        dx$EffectRow.cuno[83] = -1253942129;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public String id() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = dx$EffectRow.gm - dx$EffectRow.cuns("curl", cuoc(int ), (int)22)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == dx$EffectRow.cuns("curp", cunm(int ), (int)31)) break;
            v0 /* !! */  = (long)dx$EffectRow.cuns("curq", cunm(int ), (int)32);
        }
        var3_1 = dx$EffectRow.c;
        v1 /* !! */  = dx$EffectRow.gm;
        block21: while (true) {
            switch ((int)v1 /* !! */ ) {
                case -1145002073: {
                    break block21;
                }
                case 240931858: {
                    v1 /* !! */  = (long)(dx$EffectRow.cuns("curt", cuoc(int ), (int)24) - dx$EffectRow.cuns("curr", cuoc(int ), (int)23));
                    continue block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = dx$EffectRow.b;
        v2 /* !! */  = dx$EffectRow.gm;
        block22: while (true) {
            switch ((int)v2 /* !! */ ) {
                case -1934283873: {
                    v2 /* !! */  = (long)(dx$EffectRow.cuns("curv", cuoc(int ), (int)26) - dx$EffectRow.cuns("curu", cuoc(int ), (int)25));
                    continue block22;
                }
                case -1145002073: {
                    break block22;
                }
            }
            break;
        }
        var1_3 = dx$EffectRow.a;
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
                    if (var1_3 != false) return null;
                    if (var1_3 != false) return null;
                    v3 /* !! */  = dx$EffectRow.gm;
                    block24: while (true) {
                        switch ((int)v3 /* !! */ ) {
                            case -1404059450: {
                                v4 = dx$EffectRow.cuns("cusa", cuoc(int ), (int)28);
                                ** GOTO lbl47
                            }
                            case -1145002073: {
                                return this.id;
                            }
                            case -651719598: {
                                v4 = dx$EffectRow.cuns("cusc", cuoc(int ), (int)29);
                                ** GOTO lbl47
                            }
                            case 748594362: {
                                v4 = dx$EffectRow.cuns("cuse", cuoc(int ), (int)30);
lbl47:
                                // 3 sources

                                v3 /* !! */  = (long)(v4 - dx$EffectRow.cuns("cury", cuoc(int ), (int)27));
                                continue block24;
                            }
                        }
                        break;
                    }
                    return this.id;
                }
                case 3: {
                    var2_2 /* !! */  = (int)dx$EffectRow.cuns("cusm", cunm(int ), (int)36);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 0: {
                    var2_2 /* !! */  = (int)dx$EffectRow.cuns("cusg", cunm(int ), (int)33);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)dx$EffectRow.cuns("cusi", cunm(int ), (int)34);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: 
            }
            if (true) ** GOTO lbl67
            break;
        }
        do {
            if (true) ** continue;
lbl67:
            // 2 sources

            var2_2 /* !! */  = (int)dx$EffectRow.cuns("cusk", cunm(int ), (int)35);
            cfr_temp_0 = 0;
        } while (!var3_1);
        throw null;
    }

    public static /* synthetic */ CallSite cuns(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int cunm(int n2) {
        return cuno[n2] ^ cunq[n2];
    }

    private static /* synthetic */ void cuyi() {
        dx$EffectRow.cunq[0] = 0x9998B8;
        dx$EffectRow.cunq[1] = -1049158557;
        dx$EffectRow.cunq[2] = -1957974775;
        dx$EffectRow.cunq[3] = -1453457364;
        dx$EffectRow.cunq[4] = 979725495;
        dx$EffectRow.cunq[5] = -423800252;
        dx$EffectRow.cunq[6] = 1037782094;
        dx$EffectRow.cunq[7] = -635566863;
        dx$EffectRow.cunq[8] = 1288500137;
        dx$EffectRow.cunq[9] = 77271941;
        dx$EffectRow.cunq[10] = 1796039109;
        dx$EffectRow.cunq[11] = 928272099;
        dx$EffectRow.cunq[12] = 653169137;
        dx$EffectRow.cunq[13] = 585899074;
        dx$EffectRow.cunq[14] = 2101020112;
        dx$EffectRow.cunq[15] = -470498760;
        dx$EffectRow.cunq[16] = -1323884015;
        dx$EffectRow.cunq[17] = -1694451854;
        dx$EffectRow.cunq[18] = 1015544661;
        dx$EffectRow.cunq[19] = -1204626785;
        dx$EffectRow.cunq[20] = -1096610929;
        dx$EffectRow.cunq[21] = 1810088929;
        dx$EffectRow.cunq[22] = 1669277303;
        dx$EffectRow.cunq[23] = 598126882;
        dx$EffectRow.cunq[24] = -967516699;
        dx$EffectRow.cunq[25] = -2085820359;
        dx$EffectRow.cunq[26] = -1347642360;
        dx$EffectRow.cunq[27] = 515896778;
        dx$EffectRow.cunq[28] = -1731643168;
        dx$EffectRow.cunq[29] = 1486096877;
        dx$EffectRow.cunq[30] = 2115879108;
        dx$EffectRow.cunq[31] = -916306655;
        dx$EffectRow.cunq[32] = 120311891;
        dx$EffectRow.cunq[33] = -1319981660;
        dx$EffectRow.cunq[34] = 1302220532;
        dx$EffectRow.cunq[35] = 2100594832;
        dx$EffectRow.cunq[36] = -1690393267;
        dx$EffectRow.cunq[37] = -1414067025;
        dx$EffectRow.cunq[38] = 822162852;
        dx$EffectRow.cunq[39] = 1495576015;
        dx$EffectRow.cunq[40] = 336700094;
        dx$EffectRow.cunq[41] = -472718457;
        dx$EffectRow.cunq[42] = -1627361923;
        dx$EffectRow.cunq[43] = 245170118;
        dx$EffectRow.cunq[44] = 1671648813;
        dx$EffectRow.cunq[45] = -1594623890;
        dx$EffectRow.cunq[46] = 1386822052;
        dx$EffectRow.cunq[47] = -1470872688;
        dx$EffectRow.cunq[48] = 2135026848;
        dx$EffectRow.cunq[49] = 1131134234;
        dx$EffectRow.cunq[50] = 1780737062;
        dx$EffectRow.cunq[51] = 1994662461;
        dx$EffectRow.cunq[52] = -741505559;
        dx$EffectRow.cunq[53] = 499466060;
        dx$EffectRow.cunq[54] = -1532094543;
        dx$EffectRow.cunq[55] = -1858184409;
        dx$EffectRow.cunq[56] = -1855290288;
        dx$EffectRow.cunq[57] = -1165664366;
        dx$EffectRow.cunq[58] = 1125611314;
        dx$EffectRow.cunq[59] = 1159853343;
        dx$EffectRow.cunq[60] = 1755192743;
        dx$EffectRow.cunq[61] = -2003999222;
        dx$EffectRow.cunq[62] = 1825469544;
        dx$EffectRow.cunq[63] = -106540013;
        dx$EffectRow.cunq[64] = -1510929447;
        dx$EffectRow.cunq[65] = -539389112;
        dx$EffectRow.cunq[66] = -837014593;
        dx$EffectRow.cunq[67] = -565608158;
        dx$EffectRow.cunq[68] = -794025262;
        dx$EffectRow.cunq[69] = -375049157;
        dx$EffectRow.cunq[70] = 1206502514;
        dx$EffectRow.cunq[71] = 588788377;
        dx$EffectRow.cunq[72] = 2099107648;
        dx$EffectRow.cunq[73] = -458845195;
        dx$EffectRow.cunq[74] = 1829529287;
        dx$EffectRow.cunq[75] = -1799100015;
        dx$EffectRow.cunq[76] = 1429665475;
        dx$EffectRow.cunq[77] = 156567226;
        dx$EffectRow.cunq[78] = 1511209033;
        dx$EffectRow.cunq[79] = -520200355;
        dx$EffectRow.cunq[80] = -1301660402;
        dx$EffectRow.cunq[81] = 1590462383;
        dx$EffectRow.cunq[82] = 141041716;
        dx$EffectRow.cunq[83] = -1253942132;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dx$EffectRow.gm - dx$EffectRow.cuns("cuog", cuoc(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dx$EffectRow.cuns("cuoj", cunm(int ), (int)5)) break;
            v0 /* !! */  = (long)dx$EffectRow.cuns("cuol", cunm(int ), (int)6);
        }
        var3_1 = dx$EffectRow.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = dx$EffectRow.gm - dx$EffectRow.cuns("cuon", cuoc(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == dx$EffectRow.cuns("cuop", cunm(int ), (int)7)) break;
            v1 /* !! */  = (long)dx$EffectRow.cuns("cuoq", cunm(int ), (int)8);
        }
        var2_2 = dx$EffectRow.b;
        v2 /* !! */  = dx$EffectRow.gm;
        if (true) ** GOTO lbl19
        block7: while (true) {
            v2 /* !! */  = (long)(v3 - dx$EffectRow.cuns("cuor", cuoc(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1145002073: {
                    break block7;
                }
                case 76882328: {
                    v3 = dx$EffectRow.cuns("cuos", cuoc(int ), (int)3);
                    continue block7;
                }
                case 767182945: {
                    v3 = dx$EffectRow.cuns("cuot", cuoc(int ), (int)4);
                    continue block7;
                }
            }
            break;
        }
        var1_3 = dx$EffectRow.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = dx$EffectRow.gm - dx$EffectRow.cuns("cuow", cuoc(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == dx$EffectRow.cuns("cuoy", cunm(int ), (int)9)) break;
            v4 /* !! */  = (long)dx$EffectRow.cuns("cuoz", cunm(int ), (int)10);
        }
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dx$EffectRow.class, "id;name;level;duration;harmful;icon", "id", "name", "level", "duration", "harmful", "icon"}, this);
    }

    static {
        cuno = new int[84];
        cunq = new int[84];
        dx$EffectRow.cuyb();
        dx$EffectRow.cuyi();
        cuod = new long[68];
        cuof = new long[68];
        dx$EffectRow.cuyt();
        dx$EffectRow.cuzg();
    }
}

