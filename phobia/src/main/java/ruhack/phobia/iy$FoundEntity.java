/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.ObjectMethods
 *  net.minecraft.class_1297
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_1297;
import ruhack.phobia.iy$EntityType;

record iy$FoundEntity(class_1297 entity, iy$EntityType type) {
    public static final boolean a;
    static final long ba = 3279264960959707334L;
    private static long[] rrj;
    public static final int b;
    private static int[] rrc;
    private final class_1297 entity;
    private static long[] rri;
    public static final boolean c;
    private final iy$EntityType type;
    private static int[] rrb;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private iy$FoundEntity(class_1297 var1_1, iy$EntityType var2_2) {
        var4_3 /* !! */  = iy$FoundEntity.b;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.entity = var1_1;
                this.type = var2_2;
                return;
            }
lbl9:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)iy$FoundEntity.rrd("rre", rra(int ), (int)0);
                    continue;
                    break;
                }
            }
            case 1: {
                var4_3 /* !! */  = (int)iy$FoundEntity.rrd("rrf", rra(int ), (int)1);
                ** GOTO lbl9
            }
            case 2: 
        }
        var4_3 /* !! */  = (int)iy$FoundEntity.rrd("rrg", rra(int ), (int)2);
        ** while (true)
    }

    private static /* synthetic */ void rut() {
        iy$FoundEntity.rrj[0] = 5132736608195775974L;
        iy$FoundEntity.rrj[1] = -1737085698602577802L;
        iy$FoundEntity.rrj[2] = 9221776844495518403L;
        iy$FoundEntity.rrj[3] = -5906593550100934244L;
        iy$FoundEntity.rrj[4] = 1850509821557457464L;
        iy$FoundEntity.rrj[5] = -4315384929436906550L;
        iy$FoundEntity.rrj[6] = -5796892190941551234L;
        iy$FoundEntity.rrj[7] = -105385028875884831L;
        iy$FoundEntity.rrj[8] = 3666081695746160129L;
        iy$FoundEntity.rrj[9] = -5912987211511049758L;
        iy$FoundEntity.rrj[10] = -7345067454639260958L;
        iy$FoundEntity.rrj[11] = -6302917019966150830L;
        iy$FoundEntity.rrj[12] = 3880689295011279325L;
        iy$FoundEntity.rrj[13] = -9146149067229852575L;
        iy$FoundEntity.rrj[14] = 4631018439074186008L;
        iy$FoundEntity.rrj[15] = 1543807454616272206L;
        iy$FoundEntity.rrj[16] = 934731316551729087L;
        iy$FoundEntity.rrj[17] = -970725131660463290L;
        iy$FoundEntity.rrj[18] = -1860250507346432506L;
        iy$FoundEntity.rrj[19] = 2336888019452200439L;
        iy$FoundEntity.rrj[20] = -7920287083684551594L;
        iy$FoundEntity.rrj[21] = 9006725436590225871L;
        iy$FoundEntity.rrj[22] = 7649874613545205520L;
        iy$FoundEntity.rrj[23] = 3521683959749624298L;
        iy$FoundEntity.rrj[24] = 5126394633003886570L;
        iy$FoundEntity.rrj[25] = -8894369122954134265L;
        iy$FoundEntity.rrj[26] = 146224363571654435L;
        iy$FoundEntity.rrj[27] = 1022545277360397210L;
        iy$FoundEntity.rrj[28] = 2549111224246236230L;
        iy$FoundEntity.rrj[29] = 1805593794069245232L;
        iy$FoundEntity.rrj[30] = -64364801013269840L;
        iy$FoundEntity.rrj[31] = -1962176889386639199L;
        iy$FoundEntity.rrj[32] = -3745146814936611300L;
        iy$FoundEntity.rrj[33] = 8783863524329483307L;
        iy$FoundEntity.rrj[34] = 7966895005157642165L;
        iy$FoundEntity.rrj[35] = 1551985306069785656L;
        iy$FoundEntity.rrj[36] = 1728077095026956715L;
        iy$FoundEntity.rrj[37] = 8507663913504366349L;
        iy$FoundEntity.rrj[38] = -2494187915906433920L;
        iy$FoundEntity.rrj[39] = 6574752168852004682L;
        iy$FoundEntity.rrj[40] = -8840287713641267944L;
        iy$FoundEntity.rrj[41] = -59604801502849478L;
        iy$FoundEntity.rrj[42] = 8173984820358400687L;
        iy$FoundEntity.rrj[43] = 646217514576012344L;
    }

    public static /* synthetic */ CallSite rrd(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = iy$FoundEntity.ba - iy$FoundEntity.rrd("rsa", rrh(int ), (int)6)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == iy$FoundEntity.rrd("rsb", rra(int ), (int)13)) break;
            v0 /* !! */  = (long)iy$FoundEntity.rrd("rsc", rra(int ), (int)14);
        }
        var3_1 = iy$FoundEntity.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = iy$FoundEntity.ba - iy$FoundEntity.rrd("rsd", rrh(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == iy$FoundEntity.rrd("rse", rra(int ), (int)15)) break;
            v1 /* !! */  = (long)iy$FoundEntity.rrd("rsf", rra(int ), (int)16);
        }
        var2_2 /* !! */  = iy$FoundEntity.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = iy$FoundEntity.ba - iy$FoundEntity.rrd("rsg", rrh(int ), (int)8)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == iy$FoundEntity.rrd("rsh", rra(int ), (int)17)) break;
                    v2 /* !! */  = (long)iy$FoundEntity.rrd("rsi", rra(int ), (int)18);
                }
                var1_3 = iy$FoundEntity.a;
                if (var3_1) {
                    throw null;
                    return (int)iy$FoundEntity.rrd("rsj", rra(int ), (int)19);
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = iy$FoundEntity.ba;
                if (true) ** GOTO lbl34
                block15: while (true) {
                    v3 /* !! */  = (long)(v4 - iy$FoundEntity.rrd("rsk", rrh(int ), (int)9));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1838974778: {
                            break block15;
                        }
                        case -511468468: {
                            v4 = iy$FoundEntity.rrd("rsl", rrh(int ), (int)10);
                            continue block15;
                        }
                        case 194262590: {
                            v4 = iy$FoundEntity.rrd("rsm", rrh(int ), (int)11);
                            continue block15;
                        }
                    }
                    break;
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{iy$FoundEntity.class, "entity;type", "entity", "type"}, this);
            }
lbl44:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)iy$FoundEntity.rrd("rsn", rra(int ), (int)20);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)iy$FoundEntity.rrd("rso", rra(int ), (int)21);
                if (!var3_1) ** GOTO lbl44
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)iy$FoundEntity.rrd("rsp", rra(int ), (int)22);
                if (!var3_1) ** GOTO lbl44
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)iy$FoundEntity.rrd("rsq", rra(int ), (int)23);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void rur() {
        iy$FoundEntity.rrc[0] = -578661640;
        iy$FoundEntity.rrc[1] = 967507771;
        iy$FoundEntity.rrc[2] = 1967485171;
        iy$FoundEntity.rrc[3] = -316708240;
        iy$FoundEntity.rrc[4] = 764160256;
        iy$FoundEntity.rrc[5] = -1724658442;
        iy$FoundEntity.rrc[6] = 803488339;
        iy$FoundEntity.rrc[7] = -937152760;
        iy$FoundEntity.rrc[8] = 1962787989;
        iy$FoundEntity.rrc[9] = -1159068242;
        iy$FoundEntity.rrc[10] = 1745263104;
        iy$FoundEntity.rrc[11] = -442823943;
        iy$FoundEntity.rrc[12] = -299797011;
        iy$FoundEntity.rrc[13] = -892841827;
        iy$FoundEntity.rrc[14] = 13268782;
        iy$FoundEntity.rrc[15] = 905049591;
        iy$FoundEntity.rrc[16] = -819619715;
        iy$FoundEntity.rrc[17] = -340762825;
        iy$FoundEntity.rrc[18] = 287233079;
        iy$FoundEntity.rrc[19] = -1888978880;
        iy$FoundEntity.rrc[20] = 298493055;
        iy$FoundEntity.rrc[21] = 1057464621;
        iy$FoundEntity.rrc[22] = -1126797220;
        iy$FoundEntity.rrc[23] = -192073119;
        iy$FoundEntity.rrc[24] = 534808225;
        iy$FoundEntity.rrc[25] = -448414407;
        iy$FoundEntity.rrc[26] = -1023408376;
        iy$FoundEntity.rrc[27] = -1511554078;
        iy$FoundEntity.rrc[28] = 1273150342;
        iy$FoundEntity.rrc[29] = -294865017;
        iy$FoundEntity.rrc[30] = -582869768;
        iy$FoundEntity.rrc[31] = 649999932;
        iy$FoundEntity.rrc[32] = 1155691382;
        iy$FoundEntity.rrc[33] = 311577944;
        iy$FoundEntity.rrc[34] = 264853708;
        iy$FoundEntity.rrc[35] = -434706403;
        iy$FoundEntity.rrc[36] = -124771511;
        iy$FoundEntity.rrc[37] = 2090231646;
        iy$FoundEntity.rrc[38] = -667408427;
        iy$FoundEntity.rrc[39] = 737472256;
        iy$FoundEntity.rrc[40] = 1036585807;
        iy$FoundEntity.rrc[41] = 2144762859;
        iy$FoundEntity.rrc[42] = 1606000570;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final boolean equals(Object object) {
        boolean bl2;
        Object object2 = ba;
        block15: while (true) {
            switch ((int)object2) {
                case -1838974778: {
                    break block15;
                }
                case -897779338: {
                    object2 = iy$FoundEntity.rrd("rss", rrh(int ), (int)13) - iy$FoundEntity.rrd("rsr", rrh(int ), (int)12);
                    continue block15;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object3 = ba;
        boolean bl4 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object3 = callSite - iy$FoundEntity.rrd("rst", rrh(int ), (int)14);
            }
            switch ((int)object3) {
                case -1838974778: {
                    break block16;
                }
                case -985371978: {
                    callSite = iy$FoundEntity.rrd("rsu", rrh(int ), (int)15);
                    continue block16;
                }
                case -821399221: {
                    callSite = iy$FoundEntity.rrd("rsv", rrh(int ), (int)16);
                    continue block16;
                }
                case 1592440855: {
                    callSite = iy$FoundEntity.rrd("rsw", rrh(int ), (int)17);
                    continue block16;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = ba - iy$FoundEntity.rrd("rsx", rrh(int ), (int)18)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == iy$FoundEntity.rrd("rsy", rra(int ), (int)24)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object4 = iy$FoundEntity.rrd("rsz", rra(int ), (int)25);
        }
        if (bl2) return (boolean)iy$FoundEntity.rrd("rta", rra(int ), (int)26);
        if (bl2) return (boolean)iy$FoundEntity.rrd("rta", rra(int ), (int)26);
        Object object5 = ba;
        boolean bl5 = true;
        block18: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object5 = callSite - iy$FoundEntity.rrd("rtb", rrh(int ), (int)19);
            }
            switch ((int)object5) {
                case -1838974778: {
                    return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{iy$FoundEntity.class, "entity;type", "entity", "type"}, this, object);
                }
                case -1353628512: {
                    callSite = iy$FoundEntity.rrd("rtc", rrh(int ), (int)20);
                    continue block18;
                }
                case 2123239684: {
                    callSite = iy$FoundEntity.rrd("rtd", rrh(int ), (int)21);
                    continue block18;
                }
            }
            break;
        }
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{iy$FoundEntity.class, "entity;type", "entity", "type"}, this, object);
    }

    private static /* synthetic */ void rus() {
        iy$FoundEntity.rri[0] = 7188439663800828673L;
        iy$FoundEntity.rri[1] = 3559935240399461792L;
        iy$FoundEntity.rri[2] = 1676365713315533569L;
        iy$FoundEntity.rri[3] = -3606538023613722370L;
        iy$FoundEntity.rri[4] = -6678739668836873361L;
        iy$FoundEntity.rri[5] = 8542221778733806880L;
        iy$FoundEntity.rri[6] = 2771650927141242145L;
        iy$FoundEntity.rri[7] = 8830939095483249504L;
        iy$FoundEntity.rri[8] = -5305700253421029115L;
        iy$FoundEntity.rri[9] = -7126532834739271854L;
        iy$FoundEntity.rri[10] = 548553474999883878L;
        iy$FoundEntity.rri[11] = -4826586061237810697L;
        iy$FoundEntity.rri[12] = 3871223563131122718L;
        iy$FoundEntity.rri[13] = 1851340547214563983L;
        iy$FoundEntity.rri[14] = -4711638731298190720L;
        iy$FoundEntity.rri[15] = 2771710273760872678L;
        iy$FoundEntity.rri[16] = -1617848392586992226L;
        iy$FoundEntity.rri[17] = -4598215505665474657L;
        iy$FoundEntity.rri[18] = -6162156215141432439L;
        iy$FoundEntity.rri[19] = 6874613068469302581L;
        iy$FoundEntity.rri[20] = 3073732870226362707L;
        iy$FoundEntity.rri[21] = 5805556298381899567L;
        iy$FoundEntity.rri[22] = 7281259252668144316L;
        iy$FoundEntity.rri[23] = -2727536743490471706L;
        iy$FoundEntity.rri[24] = -274480482741230397L;
        iy$FoundEntity.rri[25] = 7662770055415861240L;
        iy$FoundEntity.rri[26] = -7425681165924508441L;
        iy$FoundEntity.rri[27] = -3542411507628362675L;
        iy$FoundEntity.rri[28] = -8256991332097586814L;
        iy$FoundEntity.rri[29] = -9182401250616652224L;
        iy$FoundEntity.rri[30] = -1803705750283948665L;
        iy$FoundEntity.rri[31] = 9104611631249404466L;
        iy$FoundEntity.rri[32] = -134850524510584612L;
        iy$FoundEntity.rri[33] = -8138777424590962029L;
        iy$FoundEntity.rri[34] = -4501347761855547657L;
        iy$FoundEntity.rri[35] = -6243862488755516462L;
        iy$FoundEntity.rri[36] = 8992518653169321065L;
        iy$FoundEntity.rri[37] = -4285359747083200690L;
        iy$FoundEntity.rri[38] = -1151144887803825044L;
        iy$FoundEntity.rri[39] = 8904179329125189599L;
        iy$FoundEntity.rri[40] = -6219345725092395380L;
        iy$FoundEntity.rri[41] = 6919107585993050206L;
        iy$FoundEntity.rri[42] = -8041198866475541508L;
        iy$FoundEntity.rri[43] = 8087548514800312550L;
    }

    private static /* synthetic */ void ruq() {
        iy$FoundEntity.rrb[0] = -578661639;
        iy$FoundEntity.rrb[1] = 967507769;
        iy$FoundEntity.rrb[2] = 1967485169;
        iy$FoundEntity.rrb[3] = 316708239;
        iy$FoundEntity.rrb[4] = -675768678;
        iy$FoundEntity.rrb[5] = -1724658441;
        iy$FoundEntity.rrb[6] = -183093156;
        iy$FoundEntity.rrb[7] = -937152759;
        iy$FoundEntity.rrb[8] = -308586768;
        iy$FoundEntity.rrb[9] = -1159068244;
        iy$FoundEntity.rrb[10] = 1745263106;
        iy$FoundEntity.rrb[11] = -442823941;
        iy$FoundEntity.rrb[12] = -299797009;
        iy$FoundEntity.rrb[13] = -892841828;
        iy$FoundEntity.rrb[14] = -383114883;
        iy$FoundEntity.rrb[15] = 905049590;
        iy$FoundEntity.rrb[16] = -542508803;
        iy$FoundEntity.rrb[17] = -340762826;
        iy$FoundEntity.rrb[18] = -926505363;
        iy$FoundEntity.rrb[19] = 593975300;
        iy$FoundEntity.rrb[20] = 298493052;
        iy$FoundEntity.rrb[21] = 1057464623;
        iy$FoundEntity.rrb[22] = -1126797219;
        iy$FoundEntity.rrb[23] = -192073120;
        iy$FoundEntity.rrb[24] = -534808226;
        iy$FoundEntity.rrb[25] = 1184870060;
        iy$FoundEntity.rrb[26] = -1023408375;
        iy$FoundEntity.rrb[27] = -1511554080;
        iy$FoundEntity.rrb[28] = 1273150340;
        iy$FoundEntity.rrb[29] = -294865018;
        iy$FoundEntity.rrb[30] = -582869765;
        iy$FoundEntity.rrb[31] = 649999933;
        iy$FoundEntity.rrb[32] = -1371910874;
        iy$FoundEntity.rrb[33] = 311577947;
        iy$FoundEntity.rrb[34] = 264853708;
        iy$FoundEntity.rrb[35] = -434706402;
        iy$FoundEntity.rrb[36] = -124771511;
        iy$FoundEntity.rrb[37] = -2090231647;
        iy$FoundEntity.rrb[38] = -1133434179;
        iy$FoundEntity.rrb[39] = 737472258;
        iy$FoundEntity.rrb[40] = 1036585807;
        iy$FoundEntity.rrb[41] = 2144762856;
        iy$FoundEntity.rrb[42] = 1606000570;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_1297 entity() {
        v0 /* !! */  = iy$FoundEntity.ba;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - iy$FoundEntity.rrd("rti", rrh(int ), (int)22));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1838974778: {
                    break block22;
                }
                case -1346250678: {
                    v1 = iy$FoundEntity.rrd("rtj", rrh(int ), (int)23);
                    continue block22;
                }
                case -818277693: {
                    v1 = iy$FoundEntity.rrd("rtk", rrh(int ), (int)24);
                    continue block22;
                }
            }
            break;
        }
        var3_1 = iy$FoundEntity.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = iy$FoundEntity.ba - iy$FoundEntity.rrd("rtl", rrh(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == iy$FoundEntity.rrd("rtm", rra(int ), (int)31)) break;
            v2 /* !! */  = (long)iy$FoundEntity.rrd("rtn", rra(int ), (int)32);
        }
        var2_2 /* !! */  = iy$FoundEntity.b;
        v3 /* !! */  = iy$FoundEntity.ba;
        if (true) ** GOTO lbl26
        block24: while (true) {
            v3 /* !! */  = (long)(v4 - iy$FoundEntity.rrd("rto", rrh(int ), (int)26));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1838974778: {
                    break block24;
                }
                case -16045847: {
                    v4 = iy$FoundEntity.rrd("rtp", rrh(int ), (int)27);
                    continue block24;
                }
                case 1320071145: {
                    v4 = iy$FoundEntity.rrd("rtq", rrh(int ), (int)28);
                    continue block24;
                }
                case 2108217192: {
                    v4 = iy$FoundEntity.rrd("rtr", rrh(int ), (int)29);
                    continue block24;
                }
            }
            break;
        }
        var1_3 = iy$FoundEntity.a;
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
                v5 /* !! */  = iy$FoundEntity.ba;
                if (true) ** GOTO lbl52
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - iy$FoundEntity.rrd("rts", rrh(int ), (int)30));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1838974778: {
                            break block26;
                        }
                        case -324848744: {
                            v6 = iy$FoundEntity.rrd("rtt", rrh(int ), (int)31);
                            continue block26;
                        }
                        case 352163858: {
                            v6 = iy$FoundEntity.rrd("rtu", rrh(int ), (int)32);
                            continue block26;
                        }
                    }
                    break;
                }
                return this.entity;
            }
lbl62:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)iy$FoundEntity.rrd("rtv", rra(int ), (int)33);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl72
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)iy$FoundEntity.rrd("rtw", rra(int ), (int)34);
                if (!var3_1) ** GOTO lbl62
                throw null;
            }
lbl72:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)iy$FoundEntity.rrd("rtx", rra(int ), (int)35);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)iy$FoundEntity.rrd("rty", rra(int ), (int)36);
        ** while (!var3_1)
lbl80:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public iy$EntityType type() {
        v0 /* !! */  = iy$FoundEntity.ba;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - iy$FoundEntity.rrd("rtz", rrh(int ), (int)33));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2120566323: {
                    v1 = iy$FoundEntity.rrd("rua", rrh(int ), (int)34);
                    continue block22;
                }
                case -1838974778: {
                    break block22;
                }
                case -578441668: {
                    v1 = iy$FoundEntity.rrd("rub", rrh(int ), (int)35);
                    continue block22;
                }
            }
            break;
        }
        var3_1 = iy$FoundEntity.c;
        v2 /* !! */  = iy$FoundEntity.ba;
        if (true) ** GOTO lbl19
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - iy$FoundEntity.rrd("ruc", rrh(int ), (int)36));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1838974778: {
                    break block23;
                }
                case -511799921: {
                    v3 = iy$FoundEntity.rrd("rud", rrh(int ), (int)37);
                    continue block23;
                }
                case 302694825: {
                    v3 = iy$FoundEntity.rrd("rue", rrh(int ), (int)38);
                    continue block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = iy$FoundEntity.b;
        v4 /* !! */  = iy$FoundEntity.ba;
        if (true) ** GOTO lbl33
        block24: while (true) {
            v4 /* !! */  = (long)(v5 - iy$FoundEntity.rrd("ruf", rrh(int ), (int)39));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1838974778: {
                    break block24;
                }
                case -1015208297: {
                    v5 = iy$FoundEntity.rrd("rug", rrh(int ), (int)40);
                    continue block24;
                }
                case -755793757: {
                    v5 = iy$FoundEntity.rrd("ruh", rrh(int ), (int)41);
                    continue block24;
                }
                case 1013999227: {
                    v5 = iy$FoundEntity.rrd("rui", rrh(int ), (int)42);
                    continue block24;
                }
            }
            break;
        }
        var1_3 = iy$FoundEntity.a;
        if (var3_1) {
            throw null;
lbl48:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl48
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = iy$FoundEntity.ba - iy$FoundEntity.rrd("ruj", rrh(int ), (int)43)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == iy$FoundEntity.rrd("ruk", rra(int ), (int)37)) break;
                    v6 /* !! */  = (long)iy$FoundEntity.rrd("rul", rra(int ), (int)38);
                }
                return this.type;
            }
            case 0: {
                var2_2 /* !! */  = (int)iy$FoundEntity.rrd("rum", rra(int ), (int)39);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)iy$FoundEntity.rrd("run", rra(int ), (int)40);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)iy$FoundEntity.rrd("ruo", rra(int ), (int)41);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)iy$FoundEntity.rrd("rup", rra(int ), (int)42);
        ** while (!var3_1)
lbl78:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        v0 /* !! */  = iy$FoundEntity.ba;
        if (true) ** GOTO lbl5
        block11: while (true) {
            v0 /* !! */  = (long)(v1 - iy$FoundEntity.rrd("rrk", rrh(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1838974778: {
                    break block11;
                }
                case -806550396: {
                    v1 = iy$FoundEntity.rrd("rrl", rrh(int ), (int)1);
                    continue block11;
                }
                case 462199108: {
                    v1 = iy$FoundEntity.rrd("rrm", rrh(int ), (int)2);
                    continue block11;
                }
            }
            break;
        }
        var3_1 = iy$FoundEntity.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = iy$FoundEntity.ba - iy$FoundEntity.rrd("rrn", rrh(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == iy$FoundEntity.rrd("rro", rra(int ), (int)3)) break;
            v2 /* !! */  = (long)iy$FoundEntity.rrd("rrp", rra(int ), (int)4);
        }
        var2_2 /* !! */  = iy$FoundEntity.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = iy$FoundEntity.ba - iy$FoundEntity.rrd("rrq", rrh(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == iy$FoundEntity.rrd("rrr", rra(int ), (int)5)) break;
            v3 /* !! */  = (long)iy$FoundEntity.rrd("rrs", rra(int ), (int)6);
        }
        var1_3 = iy$FoundEntity.a;
        if (!var3_1) ** GOTO lbl35
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl35:
                // 1 sources

                if (var1_3 || var1_3) continue block14;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = iy$FoundEntity.ba - iy$FoundEntity.rrd("rrt", rrh(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == iy$FoundEntity.rrd("rru", rra(int ), (int)7)) break;
                    v4 /* !! */  = (long)iy$FoundEntity.rrd("rrv", rra(int ), (int)8);
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{iy$FoundEntity.class, "entity;type", "entity", "type"}, this);
                case 0: {
                    do {
                        var2_2 /* !! */  = (int)iy$FoundEntity.rrd("rrw", rra(int ), (int)9);
                    } while (!var3_1);
                    throw null;
                }
                case 1: {
                    var2_2 /* !! */  = (int)iy$FoundEntity.rrd("rrx", rra(int ), (int)10);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: {
                    do {
                        var2_2 /* !! */  = (int)iy$FoundEntity.rrd("rry", rra(int ), (int)11);
                    } while (!var3_1);
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)iy$FoundEntity.rrd("rrz", rra(int ), (int)12);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ long rrh(int n2) {
        return rri[n2] ^ rrj[n2];
    }

    static {
        rrb = new int[43];
        rrc = new int[43];
        iy$FoundEntity.ruq();
        iy$FoundEntity.rur();
        rri = new long[44];
        rrj = new long[44];
        iy$FoundEntity.rus();
        iy$FoundEntity.rut();
    }

    private static /* synthetic */ int rra(int n2) {
        return rrb[n2] ^ rrc[n2];
    }
}

