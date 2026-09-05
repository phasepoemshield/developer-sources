/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_310
 *  org.joml.Matrix4f
 *  org.lwjgl.system.MemoryUtil
 */
package ruhack.phobia;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.Buffer;
import java.util.OptionalInt;
import java.util.function.Supplier;
import net.minecraft.class_310;
import org.joml.Matrix4f;
import org.lwjgl.system.MemoryUtil;

public class ko {
    static private final int UNIFORM_SIZE = 128;
    static private long[] hplv;
    static public final boolean a;
    static private RenderPipeline pipeline;
    static private int[] hpma;
    static public final boolean c;
    static private int[] hpmb;
    static private GpuBuffer uniformBuffer;
    static public final int b;
    static protected final long oq = 431569532755162417L;
    static private long[] hplw;

    public ko() {
    }

    private static void hpwz() {
        ko.hplw[100] = 7376575603458923589L;
        ko.hplw[101] = 1014311595520578883L;
        ko.hplw[102] = 1705079435935434722L;
        ko.hplw[103] = -7554414896070745015L;
    }

    private static void hpww() {
        ko.hplv[0] = -3829313797103339724L;
        ko.hplv[1] = 2570364970016056364L;
        ko.hplv[2] = -1813804819273800333L;
        ko.hplv[3] = -6290989715172049027L;
        ko.hplv[4] = 738549147777306585L;
        ko.hplv[5] = -5247024062337810517L;
        ko.hplv[6] = -2350040479425260037L;
        ko.hplv[7] = 1619406915499931197L;
        ko.hplv[8] = -6038456916417389104L;
        ko.hplv[9] = -5833812056923453633L;
        ko.hplv[10] = 5755461192798238902L;
        ko.hplv[11] = -1113084790965284270L;
        ko.hplv[12] = -3441576981713060953L;
        ko.hplv[13] = 2920185262715360784L;
        ko.hplv[14] = 4075677786542997734L;
        ko.hplv[15] = 7599413322188673383L;
        ko.hplv[16] = -2442206090592409101L;
        ko.hplv[17] = 5046518289543131711L;
        ko.hplv[18] = -181161785769953909L;
        ko.hplv[19] = -3116175416636877161L;
        ko.hplv[20] = -5170911118796051130L;
        ko.hplv[21] = 2103500043934315484L;
        ko.hplv[22] = 7858009437652044462L;
        ko.hplv[23] = 8812080096497793495L;
        ko.hplv[24] = 3455429018552226934L;
        ko.hplv[25] = 6351706006999953846L;
        ko.hplv[26] = -3353149678065614456L;
        ko.hplv[27] = -4357240882731132371L;
        ko.hplv[28] = 1543390115322111513L;
        ko.hplv[29] = 6821124565714476141L;
        ko.hplv[30] = -4196190496971775046L;
        ko.hplv[31] = 821161245123343497L;
        ko.hplv[32] = -4936946542306813185L;
        ko.hplv[33] = -6027292043161569322L;
        ko.hplv[34] = -7794366797965865268L;
        ko.hplv[35] = -1237526962151049917L;
        ko.hplv[36] = 7549848134029794361L;
        ko.hplv[37] = -7884914977023848576L;
        ko.hplv[38] = -4434127143455667061L;
        ko.hplv[39] = -307530911294931058L;
        ko.hplv[40] = -3108471758929376629L;
        ko.hplv[41] = 270892601015882774L;
        ko.hplv[42] = -7477151378229588626L;
        ko.hplv[43] = 9065895450172308978L;
        ko.hplv[44] = -2473838015186851704L;
        ko.hplv[45] = -6456685308532426678L;
        ko.hplv[46] = 3107450223376995473L;
        ko.hplv[47] = 2365371225399340241L;
        ko.hplv[48] = -6051818359907985107L;
        ko.hplv[49] = 606365265816449506L;
        ko.hplv[50] = 486149264075389057L;
        ko.hplv[51] = 3248788644783106919L;
        ko.hplv[52] = -2071253474458312791L;
        ko.hplv[53] = 88869657457100511L;
        ko.hplv[54] = -8059654309122945074L;
        ko.hplv[55] = 6226753082325438830L;
        ko.hplv[56] = -9192937981245838830L;
        ko.hplv[57] = 4335140167397686672L;
        ko.hplv[58] = -5367476743050736731L;
        ko.hplv[59] = 4228116710371669136L;
        ko.hplv[60] = -8343326717239109726L;
        ko.hplv[61] = 7141426159395367866L;
        ko.hplv[62] = -4563223988988850453L;
        ko.hplv[63] = 3270499154270461059L;
        ko.hplv[64] = 8027443026000658320L;
        ko.hplv[65] = -2974084244729025095L;
        ko.hplv[66] = -3593573745123210725L;
        ko.hplv[67] = 4744422093823961577L;
        ko.hplv[68] = -1694525238469610486L;
        ko.hplv[69] = 3181161921436388527L;
        ko.hplv[70] = 3502186172415623248L;
        ko.hplv[71] = 1855054182989261899L;
        ko.hplv[72] = -5343376662995410002L;
        ko.hplv[73] = -7162178957570679336L;
        ko.hplv[74] = 3041416084976908608L;
        ko.hplv[75] = -4251791409791622449L;
        ko.hplv[76] = -4653319199868527965L;
        ko.hplv[77] = -3906845898048192124L;
        ko.hplv[78] = -7832385554424807715L;
        ko.hplv[79] = 8014312830792489483L;
        ko.hplv[80] = -1391442347424141497L;
        ko.hplv[81] = -421228855921764014L;
        ko.hplv[82] = 1811382695250764086L;
        ko.hplv[83] = -1726655914796249961L;
        ko.hplv[84] = -2213164052609603766L;
        ko.hplv[85] = -4223302189180802683L;
        ko.hplv[86] = -4721184311661098265L;
        ko.hplv[87] = -6680792952523723672L;
        ko.hplv[88] = -6955516914664562943L;
        ko.hplv[89] = -7507580669344219662L;
        ko.hplv[90] = -2774788412041935283L;
        ko.hplv[91] = -842786224208283449L;
        ko.hplv[92] = -846451758375681604L;
        ko.hplv[93] = 6017597064246387411L;
        ko.hplv[94] = 7025166172490670335L;
        ko.hplv[95] = 6924402517747077410L;
        ko.hplv[96] = -5914171431086878993L;
        ko.hplv[97] = 7762957173309714768L;
        ko.hplv[98] = -3902674565060333246L;
        ko.hplv[99] = -6671144352575163722L;
    }

    private static void hpwx() {
        ko.hplv[100] = 1635636352389433352L;
        ko.hplv[101] = 2569833383864905484L;
        ko.hplv[102] = 6096787493647219900L;
        ko.hplv[103] = 8093392058463550696L;
    }

    private static void hpwu() {
        ko.hpmb[0] = -457804345;
        ko.hpmb[1] = -1931126206;
        ko.hpmb[2] = 1227914103;
        ko.hpmb[3] = -2017387351;
        ko.hpmb[4] = -615076326;
        ko.hpmb[5] = -853685184;
        ko.hpmb[6] = 1591073121;
        ko.hpmb[7] = -119735915;
        ko.hpmb[8] = -2143032387;
        ko.hpmb[9] = 885002752;
        ko.hpmb[10] = 1797217122;
        ko.hpmb[11] = 1787909662;
        ko.hpmb[12] = -313133510;
        ko.hpmb[13] = 1279563141;
        ko.hpmb[14] = -338859044;
        ko.hpmb[15] = 1369125875;
        ko.hpmb[16] = -1143264145;
        ko.hpmb[17] = 1597616012;
        ko.hpmb[18] = 2131611470;
        ko.hpmb[19] = -2089987785;
        ko.hpmb[20] = 1511272504;
        ko.hpmb[21] = -2142829695;
        ko.hpmb[22] = -1915468726;
        ko.hpmb[23] = 1894658147;
        ko.hpmb[24] = 127125701;
        ko.hpmb[25] = -2021097032;
        ko.hpmb[26] = 1974665148;
        ko.hpmb[27] = 1097228932;
        ko.hpmb[28] = -1961821210;
        ko.hpmb[29] = -1139320436;
        ko.hpmb[30] = -1883014200;
        ko.hpmb[31] = 1449558293;
        ko.hpmb[32] = -1648711287;
        ko.hpmb[33] = -941456327;
        ko.hpmb[34] = -375732398;
        ko.hpmb[35] = -1422575713;
        ko.hpmb[36] = -55662274;
        ko.hpmb[37] = 1629993080;
        ko.hpmb[38] = -215343250;
        ko.hpmb[39] = 67821272;
        ko.hpmb[40] = -1661470553;
        ko.hpmb[41] = 453084541;
        ko.hpmb[42] = -106992621;
        ko.hpmb[43] = 1369556722;
        ko.hpmb[44] = 162131942;
        ko.hpmb[45] = -231320020;
        ko.hpmb[46] = -1881756692;
        ko.hpmb[47] = 2032019738;
        ko.hpmb[48] = 1385833042;
        ko.hpmb[49] = 808375738;
        ko.hpmb[50] = -1898043864;
        ko.hpmb[51] = 411817655;
        ko.hpmb[52] = 738924136;
        ko.hpmb[53] = 1960540820;
        ko.hpmb[54] = 1235969421;
        ko.hpmb[55] = -219080461;
        ko.hpmb[56] = 1832257791;
        ko.hpmb[57] = 1756191615;
        ko.hpmb[58] = -1732489005;
        ko.hpmb[59] = -449739655;
        ko.hpmb[60] = 1339109311;
        ko.hpmb[61] = 1130672896;
        ko.hpmb[62] = -1572801489;
        ko.hpmb[63] = -681327232;
        ko.hpmb[64] = -762106157;
        ko.hpmb[65] = 1941550333;
        ko.hpmb[66] = 404738093;
        ko.hpmb[67] = -2031507448;
        ko.hpmb[68] = -208947747;
        ko.hpmb[69] = 1560976036;
        ko.hpmb[70] = 133153218;
        ko.hpmb[71] = -456531868;
        ko.hpmb[72] = -667650006;
        ko.hpmb[73] = -1920726901;
        ko.hpmb[74] = -1759520863;
        ko.hpmb[75] = 2109691895;
        ko.hpmb[76] = -1751321562;
        ko.hpmb[77] = -1629015273;
        ko.hpmb[78] = 3582157;
        ko.hpmb[79] = 1584005698;
        ko.hpmb[80] = 440843794;
        ko.hpmb[81] = 1751344418;
        ko.hpmb[82] = -1835532177;
        ko.hpmb[83] = -766935523;
        ko.hpmb[84] = 980369907;
        ko.hpmb[85] = 1731120344;
        ko.hpmb[86] = 500757225;
        ko.hpmb[87] = 1743390532;
        ko.hpmb[88] = 165621965;
        ko.hpmb[89] = -1746619679;
        ko.hpmb[90] = 832024618;
        ko.hpmb[91] = -1003455467;
        ko.hpmb[92] = 1596394769;
        ko.hpmb[93] = 309166020;
        ko.hpmb[94] = -1538414781;
        ko.hpmb[95] = -96830569;
        ko.hpmb[96] = -1095529901;
        ko.hpmb[97] = -409521270;
        ko.hpmb[98] = 1810353978;
        ko.hpmb[99] = -1860968514;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void shutdown() {
        v0 /* !! */  = ko.oq;
        if (true) ** GOTO lbl5
        block45: while (true) {
            v0 /* !! */  = (long)(v1 - ko.hplx("hpuh", hplu(int ), (int)70));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1378863503: {
                    v1 = ko.hplx("hpui", hplu(int ), (int)71);
                    continue block45;
                }
                case -971250101: {
                    v1 = ko.hplx("hpuj", hplu(int ), (int)72);
                    continue block45;
                }
                case 398505265: {
                    break block45;
                }
            }
            break;
        }
        var2 = ko.c;
        v2 /* !! */  = ko.oq;
        if (true) ** GOTO lbl19
        block46: while (true) {
            v2 /* !! */  = (long)(ko.hplx("hpul", hplu(int ), (int)74) - ko.hplx("hpuk", hplu(int ), (int)73));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1665147539: {
                    continue block46;
                }
                case 398505265: {
                    break block46;
                }
            }
            break;
        }
        var1_1 /* !! */  = ko.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ko.oq - ko.hplx("hpum", hplu(int ), (int)75)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ko.hplx("hpun", hplz(int ), (int)115)) break;
            v3 /* !! */  = (long)ko.hplx("hpuo", hplz(int ), (int)116);
        }
        var0_2 = ko.a;
        if (var2) {
            throw null;
lbl33:
            // 6 sources

            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl33
        v4 /* !! */  = ko.oq;
        if (true) ** GOTO lbl40
        block49: while (true) {
            v4 /* !! */  = (long)(v5 - ko.hplx("hpup", hplu(int ), (int)76));
lbl40:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 398505265: {
                    break block49;
                }
                case 1728870256: {
                    v5 = ko.hplx("hpuq", hplu(int ), (int)77);
                    continue block49;
                }
                case 1931122729: {
                    v5 = ko.hplx("hpur", hplu(int ), (int)78);
                    continue block49;
                }
            }
            break;
        }
        if (ko.uniformBuffer == null) ** GOTO lbl100
        if (var0_2 || var0_2) ** GOTO lbl33
        v6 /* !! */  = ko.oq;
        if (true) ** GOTO lbl55
        block50: while (true) {
            v6 /* !! */  = (long)(v7 - ko.hplx("hpus", hplu(int ), (int)79));
lbl55:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 398505265: {
                    break block50;
                }
                case 1353456510: {
                    v7 = ko.hplx("hput", hplu(int ), (int)80);
                    continue block50;
                }
                case 1808397699: {
                    v7 = ko.hplx("hpuu", hplu(int ), (int)81);
                    continue block50;
                }
            }
            break;
        }
        v8 /* !! */  = ko.oq;
        if (true) ** GOTO lbl68
        block51: while (true) {
            v8 /* !! */  = (long)(v9 - ko.hplx("hpuv", hplu(int ), (int)82));
lbl68:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1608403020: {
                    v9 = ko.hplx("hpuw", hplu(int ), (int)83);
                    continue block51;
                }
                case -1045546114: {
                    v9 = ko.hplx("hpux", hplu(int ), (int)84);
                    continue block51;
                }
                case 398505265: {
                    break block51;
                }
            }
            break;
        }
        ko.uniformBuffer.close();
        if (var0_2 || var0_2) ** GOTO lbl33
        v10 /* !! */  = ko.oq;
        if (true) ** GOTO lbl83
        block52: while (true) {
            v10 /* !! */  = (long)(v11 - ko.hplx("hpuy", hplu(int ), (int)85));
lbl83:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -772241817: {
                    v11 = ko.hplx("hpuz", hplu(int ), (int)86);
                    continue block52;
                }
                case 398505265: {
                    break block52;
                }
                case 1515046159: {
                    v11 = ko.hplx("hpva", hplu(int ), (int)87);
                    continue block52;
                }
                case 1889761179: {
                    v11 = ko.hplx("hpvb", hplu(int ), (int)88);
                    continue block52;
                }
            }
            break;
        }
        ko.uniformBuffer = null;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl33
lbl100:
                // 2 sources

                if (var0_2 || var0_2) ** GOTO lbl33
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_1 = ko.oq - ko.hplx("hpvc", hplu(int ), (int)89)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ko.hplx("hpvd", hplz(int ), (int)117)) break;
                    v12 /* !! */  = (long)ko.hplx("hpve", hplz(int ), (int)118);
                }
                ko.pipeline = null;
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
            case 0: {
                var1_1 /* !! */  = (int)ko.hplx("hpvf", hplz(int ), (int)119);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl120
            }
            case 1: {
                var1_1 /* !! */  = (int)ko.hplx("hpvg", hplz(int ), (int)120);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl120:
            // 4 sources

            case 2: {
                var1_1 /* !! */  = (int)ko.hplx("hpvh", hplz(int ), (int)121);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl125:
            // 2 sources

            case 3: {
                var1_1 /* !! */  = (int)ko.hplx("hpvi", hplz(int ), (int)122);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl130:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)ko.hplx("hpvj", hplz(int ), (int)123);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl135:
            // 2 sources

            case 5: {
                var1_1 /* !! */  = (int)ko.hplx("hpvk", hplz(int ), (int)124);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl140:
            // 2 sources

            case 6: {
                var1_1 /* !! */  = (int)ko.hplx("hpvl", hplz(int ), (int)125);
                if (!var2) ** GOTO lbl135
                throw null;
            }
            case 7: {
                var1_1 /* !! */  = (int)ko.hplx("hpvm", hplz(int ), (int)126);
                if (!var2) ** GOTO lbl120
                throw null;
            }
            case 8: {
                var1_1 /* !! */  = (int)ko.hplx("hpvn", hplz(int ), (int)127);
                if (!var2) ** GOTO lbl140
                throw null;
            }
lbl152:
            // 2 sources

            case 9: {
                var1_1 /* !! */  = (int)ko.hplx("hpvo", hplz(int ), (int)128);
                if (!var2) ** GOTO lbl125
                throw null;
            }
lbl156:
            // 2 sources

            case 10: {
                var1_1 /* !! */  = (int)ko.hplx("hpvp", hplz(int ), (int)129);
                if (!var2) break;
                throw null;
            }
lbl160:
            // 2 sources

            case 11: {
                var1_1 /* !! */  = (int)ko.hplx("hpvq", hplz(int ), (int)130);
                if (!var2) ** GOTO lbl120
                throw null;
            }
            case 12: 
        }
        var1_1 /* !! */  = (int)ko.hplx("hpvr", hplz(int ), (int)131);
        ** while (!var2)
lbl167:
        // 1 sources

        throw null;
    }

    private static void hpws() {
        ko.hpma[0] = 457804344;
        ko.hpma[1] = -1304807381;
        ko.hpma[2] = -1227914104;
        ko.hpma[3] = 395549685;
        ko.hpma[4] = -615076325;
        ko.hpma[5] = 1822361699;
        ko.hpma[6] = 1591073120;
        ko.hpma[7] = -1898655670;
        ko.hpma[8] = 2143032386;
        ko.hpma[9] = 315048150;
        ko.hpma[10] = 1797217123;
        ko.hpma[11] = 1969691568;
        ko.hpma[12] = -313133510;
        ko.hpma[13] = -1279563142;
        ko.hpma[14] = 1313324010;
        ko.hpma[15] = -1369125876;
        ko.hpma[16] = 439481133;
        ko.hpma[17] = 1597616013;
        ko.hpma[18] = 2119589143;
        ko.hpma[19] = -2089987649;
        ko.hpma[20] = 1511272505;
        ko.hpma[21] = -77824492;
        ko.hpma[22] = -1915468725;
        ko.hpma[23] = -1532302123;
        ko.hpma[24] = -127125702;
        ko.hpma[25] = 1507738857;
        ko.hpma[26] = -1974665149;
        ko.hpma[27] = 1589760223;
        ko.hpma[28] = -1961821209;
        ko.hpma[29] = -264855621;
        ko.hpma[30] = -1883014194;
        ko.hpma[31] = 1449558291;
        ko.hpma[32] = -1648711283;
        ko.hpma[33] = -941456329;
        ko.hpma[34] = -375732414;
        ko.hpma[35] = -1422575721;
        ko.hpma[36] = -55662273;
        ko.hpma[37] = 1629993083;
        ko.hpma[38] = -215343254;
        ko.hpma[39] = 67821276;
        ko.hpma[40] = -1661470553;
        ko.hpma[41] = 453084531;
        ko.hpma[42] = -106992611;
        ko.hpma[43] = 1369556729;
        ko.hpma[44] = 162131944;
        ko.hpma[45] = -231320030;
        ko.hpma[46] = -1881756697;
        ko.hpma[47] = 2032019730;
        ko.hpma[48] = 1385833170;
        ko.hpma[49] = 808375802;
        ko.hpma[50] = -1898043864;
        ko.hpma[51] = 411817649;
        ko.hpma[52] = 738924099;
        ko.hpma[53] = 1960540854;
        ko.hpma[54] = 1235969417;
        ko.hpma[55] = -219080486;
        ko.hpma[56] = 1832257783;
        ko.hpma[57] = 1756191601;
        ko.hpma[58] = -1732489006;
        ko.hpma[59] = -449739681;
        ko.hpma[60] = 1339109254;
        ko.hpma[61] = 1130672953;
        ko.hpma[62] = -1572801513;
        ko.hpma[63] = -681327188;
        ko.hpma[64] = -762106174;
        ko.hpma[65] = 1941550308;
        ko.hpma[66] = 404738076;
        ko.hpma[67] = -2031507408;
        ko.hpma[68] = -208947775;
        ko.hpma[69] = 1560976059;
        ko.hpma[70] = 133153239;
        ko.hpma[71] = -456531902;
        ko.hpma[72] = -667650047;
        ko.hpma[73] = -1920726884;
        ko.hpma[74] = -1759520896;
        ko.hpma[75] = 2109691900;
        ko.hpma[76] = -1751321599;
        ko.hpma[77] = -1629015236;
        ko.hpma[78] = 3582149;
        ko.hpma[79] = 1584005742;
        ko.hpma[80] = 440843818;
        ko.hpma[81] = 1751344417;
        ko.hpma[82] = -1835532169;
        ko.hpma[83] = -766935549;
        ko.hpma[84] = 980369861;
        ko.hpma[85] = 1731120325;
        ko.hpma[86] = 500757214;
        ko.hpma[87] = 1743390585;
        ko.hpma[88] = 165621978;
        ko.hpma[89] = -1746619664;
        ko.hpma[90] = 832024579;
        ko.hpma[91] = -1003455484;
        ko.hpma[92] = 1596394792;
        ko.hpma[93] = 309166040;
        ko.hpma[94] = -1538414744;
        ko.hpma[95] = -96830574;
        ko.hpma[96] = -1095529880;
        ko.hpma[97] = -409521221;
        ko.hpma[98] = 1810353942;
        ko.hpma[99] = -1860968557;
    }

    private static long hplu(int n2) {
        return hplv[n2] ^ hplw[n2];
    }

    private static void hpwy() {
        ko.hplw[0] = -8725541484261952616L;
        ko.hplw[1] = -8575900249117117542L;
        ko.hplw[2] = -6971023089807005408L;
        ko.hplw[3] = 784422131157137512L;
        ko.hplw[4] = -2923651772275455320L;
        ko.hplw[5] = -5136265454294361569L;
        ko.hplw[6] = -3088962723794637777L;
        ko.hplw[7] = 6288461679190230366L;
        ko.hplw[8] = 8632213547652015257L;
        ko.hplw[9] = -2119275151654627984L;
        ko.hplw[10] = -2273721129522031326L;
        ko.hplw[11] = -2256174575653524304L;
        ko.hplw[12] = 1719934446446793307L;
        ko.hplw[13] = 1687482544605015849L;
        ko.hplw[14] = -8978848853727356559L;
        ko.hplw[15] = 4614129179733263228L;
        ko.hplw[16] = 1204660423377851829L;
        ko.hplw[17] = -4209743014949487098L;
        ko.hplw[18] = 1397200053700328023L;
        ko.hplw[19] = -3153951189089330623L;
        ko.hplw[20] = -3582245369353653131L;
        ko.hplw[21] = 8255132602426336875L;
        ko.hplw[22] = 6199321146630175060L;
        ko.hplw[23] = 8168125907880183140L;
        ko.hplw[24] = -5190945834403203860L;
        ko.hplw[25] = 5658454857893358300L;
        ko.hplw[26] = -4386028001963477587L;
        ko.hplw[27] = 8357379731506358895L;
        ko.hplw[28] = 6804500427916004484L;
        ko.hplw[29] = -2598534197868543009L;
        ko.hplw[30] = 6064891195302087L;
        ko.hplw[31] = -1366696454958542376L;
        ko.hplw[32] = 2646447157671738290L;
        ko.hplw[33] = 3019881946675362243L;
        ko.hplw[34] = 5953676871010647556L;
        ko.hplw[35] = 268513241437493336L;
        ko.hplw[36] = -341723959145560740L;
        ko.hplw[37] = 439812945256518739L;
        ko.hplw[38] = 1159399049236775563L;
        ko.hplw[39] = -1100494167986227834L;
        ko.hplw[40] = -5835288109003868266L;
        ko.hplw[41] = 534688113381005611L;
        ko.hplw[42] = -5975015301398856954L;
        ko.hplw[43] = 617100522827001429L;
        ko.hplw[44] = -146495289650262923L;
        ko.hplw[45] = 1693709954084098982L;
        ko.hplw[46] = -9063496447883906780L;
        ko.hplw[47] = -3919290563384318347L;
        ko.hplw[48] = -611600085127237649L;
        ko.hplw[49] = 4330315027876832145L;
        ko.hplw[50] = 6308560835207682681L;
        ko.hplw[51] = 4686209371118884959L;
        ko.hplw[52] = -7019119500360876884L;
        ko.hplw[53] = -808168163583215600L;
        ko.hplw[54] = -6691349915780315604L;
        ko.hplw[55] = -2888762178262831883L;
        ko.hplw[56] = 1446712865572908969L;
        ko.hplw[57] = 5315451880573142750L;
        ko.hplw[58] = -6021223734376616922L;
        ko.hplw[59] = 232990127095621854L;
        ko.hplw[60] = 5936469849743548710L;
        ko.hplw[61] = 7141426159395367738L;
        ko.hplw[62] = 8449272666734871703L;
        ko.hplw[63] = 3010984122369032404L;
        ko.hplw[64] = 7319301894865408077L;
        ko.hplw[65] = -3198592902698862695L;
        ko.hplw[66] = -4492193435729060743L;
        ko.hplw[67] = 3730285933072416351L;
        ko.hplw[68] = -4273685400623216582L;
        ko.hplw[69] = -260383097171783432L;
        ko.hplw[70] = 4032014635512927638L;
        ko.hplw[71] = -2763961460991797825L;
        ko.hplw[72] = -2895281338822149809L;
        ko.hplw[73] = 872576493648297825L;
        ko.hplw[74] = -1512894937998471037L;
        ko.hplw[75] = 6855326770815534573L;
        ko.hplw[76] = 1436634989304077282L;
        ko.hplw[77] = 2176441514374549004L;
        ko.hplw[78] = -280155589263918230L;
        ko.hplw[79] = 7449262997502123704L;
        ko.hplw[80] = 3993445956283658154L;
        ko.hplw[81] = 3442226227271294773L;
        ko.hplw[82] = -958532023955415206L;
        ko.hplw[83] = -5110089109860049769L;
        ko.hplw[84] = -4132540976084882280L;
        ko.hplw[85] = -8388537588667419401L;
        ko.hplw[86] = 6103434861834829305L;
        ko.hplw[87] = -554004527578146643L;
        ko.hplw[88] = -7443028533370256159L;
        ko.hplw[89] = 2391715667370977983L;
        ko.hplw[90] = 3644159028827846517L;
        ko.hplw[91] = 5398446886633559093L;
        ko.hplw[92] = -1383584011493031095L;
        ko.hplw[93] = -3719879516244636656L;
        ko.hplw[94] = -8770919156511848034L;
        ko.hplw[95] = 459359527943647685L;
        ko.hplw[96] = 7211489033964801619L;
        ko.hplw[97] = -283374474056879803L;
        ko.hplw[98] = 2360343189613547382L;
        ko.hplw[99] = 1513137483785533659L;
    }

    public static CallSite hplx(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static String lambda$draw$1() {
        v0 /* !! */  = ko.oq;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - ko.hplx("hpvs", hplu(int ), (int)90));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1301100167: {
                    v1 = ko.hplx("hpvt", hplu(int ), (int)91);
                    continue block17;
                }
                case -283470497: {
                    v1 = ko.hplx("hpvu", hplu(int ), (int)92);
                    continue block17;
                }
                case 398505265: {
                    break block17;
                }
            }
            break;
        }
        var2 = ko.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ko.oq - ko.hplx("hpvv", hplu(int ), (int)93)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ko.hplx("hpvw", hplz(int ), (int)132)) break;
            v2 /* !! */  = (long)ko.hplx("hpvx", hplz(int ), (int)133);
        }
        var1_1 /* !! */  = ko.b;
        v3 /* !! */  = ko.oq;
        if (true) ** GOTO lbl26
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - ko.hplx("hpvy", hplu(int ), (int)94));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1044506566: {
                    v4 = ko.hplx("hpvz", hplu(int ), (int)95);
                    continue block19;
                }
                case 398505265: {
                    break block19;
                }
                case 649182376: {
                    v4 = ko.hplx("hpwa", hplu(int ), (int)96);
                    continue block19;
                }
                case 957946638: {
                    v4 = ko.hplx("hpwb", hplu(int ), (int)97);
                    continue block19;
                }
            }
            break;
        }
        var0_2 = ko.a;
        if (var2) {
            throw null;
lbl41:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl41
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block11 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                return "ColorPicker2D";
            }
lbl49:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)ko.hplx("hpwc", hplz(int ), (int)134);
                    if (!var2) break block11;
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)ko.hplx("hpwd", hplz(int ), (int)135);
                if (!var2) break;
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)ko.hplx("hpwe", hplz(int ), (int)136);
                if (!var2) ** GOTO lbl49
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)ko.hplx("hpwf", hplz(int ), (int)137);
        ** while (!var2)
lbl65:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void draw(Matrix4f var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8) {
        block126: {
            block125: {
                block124: {
                    var17_9 = ko.c;
                    var16_10 /* !! */  = ko.b;
                    var15_11 = ko.a;
                    if (var17_9) {
                        throw null;
lbl6:
                        // 37 sources

                        return;
                    }
                    if (var15_11 || var15_11) ** GOTO lbl6
                    if (ko.pipeline != null) break block124;
                    if (var15_11 || var15_11) ** GOTO lbl6
                    ko.init();
                    if (var15_11) ** GOTO lbl6
                }
                if (var15_11 || var15_11) ** GOTO lbl6
                if (ko.pipeline == null) break block125;
                if (var15_11) ** GOTO lbl6
                if (ko.uniformBuffer != null) break block126;
                if (var15_11) ** GOTO lbl6
            }
            if (var15_11 || var15_11) ** GOTO lbl6
            return;
        }
        if (var15_11 || var15_11) ** GOTO lbl6
        var9_12 = MemoryUtil.memAlloc((int)ko.hplx("hprl", hplz(int ), (int)48));
        if (var15_11 || var15_11) ** GOTO lbl6
        var9_12.putFloat(var0.m00()).putFloat(var0.m01()).putFloat(var0.m02()).putFloat(var0.m03());
        if (var15_11 || var15_11) ** GOTO lbl6
        var9_12.putFloat(var0.m10()).putFloat(var0.m11()).putFloat(var0.m12()).putFloat(var0.m13());
        if (var15_11 || var15_11) ** GOTO lbl6
        var9_12.putFloat(var0.m20()).putFloat(var0.m21()).putFloat(var0.m22()).putFloat(var0.m23());
        if (var15_11 || var15_11) ** GOTO lbl6
        var9_12.putFloat(var0.m30()).putFloat(var0.m31()).putFloat(var0.m32()).putFloat(var0.m33());
        if (var15_11 || var15_11) ** GOTO lbl6
        var9_12.position((int)ko.hplx("hprn", hplz(int ), (int)49));
        if (var15_11 || var15_11) ** GOTO lbl6
        var9_12.putFloat(var1_1).putFloat(var2_2).putFloat(var3_3).putFloat(var4_4);
        if (var15_11 || var15_11) ** GOTO lbl6
        var9_12.putFloat(var5_5).putFloat(var6_6).putFloat(var7_7).putFloat(var8_8);
        if (var15_11 || var15_11) ** GOTO lbl6
        var9_12.flip();
        if (var15_11) ** GOTO lbl6
        if (var16_10 /* !! */  == 0) ** GOTO lbl-1000
        switch (var16_10 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var15_11) ** GOTO lbl6
                var10_13 = RenderSystem.getDevice().createCommandEncoder();
                if (var15_11 || var15_11) ** GOTO lbl6
                var10_13.writeToBuffer(ko.uniformBuffer.slice(), var9_12);
                if (var15_11 || var15_11) ** GOTO lbl6
                MemoryUtil.memFree((Buffer)var9_12);
                if (var15_11 || var15_11) ** GOTO lbl6
                var11_14 = class_310.method_1551().method_1522();
                if (var15_11 || var15_11) ** GOTO lbl6
                var12_15 = var10_13.createRenderPass((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$draw$1(), ()Ljava/lang/String;)(), var11_14.method_71639(), OptionalInt.empty());
                if (var15_11) ** GOTO lbl6
                try {
                    if (var15_11) ** GOTO lbl6
                    var12_15.setPipeline(ko.pipeline);
                    if (var15_11 || var15_11) ** GOTO lbl6
                    var12_15.setUniform("Uniforms", ko.uniformBuffer);
                    if (var15_11 || var15_11) ** GOTO lbl6
                    var12_15.draw((int)ko.hplx("hprq", hplz(int ), (int)50), (int)ko.hplx("hprr", hplz(int ), (int)51));
                    if (var15_11 || var15_11) ** GOTO lbl6
                    if (var12_15 == null) ** GOTO lbl96
                    if (var15_11) ** GOTO lbl6
                }
                catch (Throwable var13_16) {
                    if (var15_11) ** GOTO lbl6
                    if (var12_15 == null) ** GOTO lbl89
                    if (var15_11) ** GOTO lbl6
                    try {
                        if (var15_11) ** GOTO lbl6
                        var12_15.close();
                        if (var15_11 || var15_11) ** GOTO lbl6
                        ** if (!var17_9) goto lbl-1000
                    }
                    catch (Throwable var14_17) {
                        if (var15_11) ** GOTO lbl6
                        var13_16.addSuppressed(var14_17);
                        if (var15_11) ** GOTO lbl6
                    }
lbl-1000:
                    // 1 sources

                    {
                        throw null;
                    }
lbl-1000:
                    // 1 sources

                    {
                    }
lbl89:
                    // 3 sources

                    if (var15_11 || var15_11) ** GOTO lbl6
                    throw var13_16;
                }
                var12_15.close();
                if (var15_11) ** GOTO lbl6
                if (var17_9) {
                    throw null;
                }
lbl96:
                // 3 sources

                if (!var15_11 && !var15_11) ** break;
                ** continue;
                return;
            }
lbl99:
            // 3 sources

            case 0: {
                var16_10 /* !! */  = (int)ko.hplx("hprt", hplz(int ), (int)52);
                if (var17_9) {
                    throw null;
                }
                ** GOTO lbl246
            }
lbl104:
            // 2 sources

            case 1: {
                var16_10 /* !! */  = (int)ko.hplx("hpru", hplz(int ), (int)53);
                if (var17_9) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl109:
            // 2 sources

            case 2: {
                var16_10 /* !! */  = (int)ko.hplx("hprv", hplz(int ), (int)54);
                if (var17_9) {
                    throw null;
                }
                ** GOTO lbl224
            }
            case 3: {
                var16_10 /* !! */  = (int)ko.hplx("hprw", hplz(int ), (int)55);
                if (var17_9) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl119:
            // 4 sources

            case 4: {
                var16_10 /* !! */  = (int)ko.hplx("hprx", hplz(int ), (int)56);
                if (!var17_9) ** GOTO lbl99
                throw null;
            }
lbl123:
            // 3 sources

            case 5: {
                var16_10 /* !! */  = (int)ko.hplx("hprz", hplz(int ), (int)57);
                if (!var17_9) ** GOTO lbl119
                throw null;
            }
lbl127:
            // 2 sources

            case 6: {
                var16_10 /* !! */  = (int)ko.hplx("hpsa", hplz(int ), (int)58);
                if (var17_9) {
                    throw null;
                }
                ** GOTO lbl347
            }
lbl132:
            // 4 sources

            case 7: {
                var16_10 /* !! */  = (int)ko.hplx("hpsb", hplz(int ), (int)59);
                if (!var17_9) ** GOTO lbl119
                throw null;
            }
lbl136:
            // 2 sources

            case 8: {
                var16_10 /* !! */  = (int)ko.hplx("hpsc", hplz(int ), (int)60);
                if (var17_9) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl141:
            // 2 sources

            case 9: {
                var16_10 /* !! */  = (int)ko.hplx("hpsd", hplz(int ), (int)61);
                if (!var17_9) ** GOTO lbl132
                throw null;
            }
lbl145:
            // 3 sources

            case 10: {
                var16_10 /* !! */  = (int)ko.hplx("hpse", hplz(int ), (int)62);
                if (!var17_9) break;
                throw null;
            }
lbl149:
            // 2 sources

            case 11: {
                var16_10 /* !! */  = (int)ko.hplx("hpsg", hplz(int ), (int)63);
                if (var17_9) {
                    throw null;
                }
                ** GOTO lbl314
            }
            case 12: {
                var16_10 /* !! */  = (int)ko.hplx("hpsh", hplz(int ), (int)64);
                if (var17_9) {
                    throw null;
                }
                ** GOTO lbl343
            }
lbl159:
            // 2 sources

            case 13: {
                var16_10 /* !! */  = (int)ko.hplx("hpsi", hplz(int ), (int)65);
                if (!var17_9) ** GOTO lbl119
                throw null;
            }
            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var16_10 /* !! */  = (int)ko.hplx("hpsj", hplz(int ), (int)66);
                    if (!var17_9) ** GOTO lbl145
                    throw null;
                }
            }
            case 15: {
                var16_10 /* !! */  = (int)ko.hplx("hpsk", hplz(int ), (int)67);
                if (var17_9) {
                    throw null;
                }
                ** GOTO lbl331
            }
lbl173:
            // 3 sources

            case 16: {
                var16_10 /* !! */  = (int)ko.hplx("hpsl", hplz(int ), (int)68);
                if (!var17_9) ** GOTO lbl104
                throw null;
            }
lbl177:
            // 3 sources

            case 17: {
                var16_10 /* !! */  = (int)ko.hplx("hpsm", hplz(int ), (int)69);
                if (!var17_9) ** GOTO lbl141
                throw null;
            }
lbl181:
            // 2 sources

            case 18: {
                var16_10 /* !! */  = (int)ko.hplx("hpso", hplz(int ), (int)70);
                if (!var17_9) ** GOTO lbl109
                throw null;
            }
lbl185:
            // 3 sources

            case 19: {
                var16_10 /* !! */  = (int)ko.hplx("hpsp", hplz(int ), (int)71);
                if (!var17_9) ** GOTO lbl159
                throw null;
            }
lbl189:
            // 2 sources

            case 20: {
                var16_10 /* !! */  = (int)ko.hplx("hpsq", hplz(int ), (int)72);
                if (!var17_9) ** GOTO lbl99
                throw null;
            }
            case 21: {
                var16_10 /* !! */  = (int)ko.hplx("hpsr", hplz(int ), (int)73);
                if (!var17_9) ** GOTO lbl177
                throw null;
            }
lbl197:
            // 2 sources

            case 22: {
                var16_10 /* !! */  = (int)ko.hplx("hpss", hplz(int ), (int)74);
                if (var17_9) {
                    throw null;
                }
                ** GOTO lbl278
            }
lbl202:
            // 2 sources

            case 23: {
                var16_10 /* !! */  = (int)ko.hplx("hpst", hplz(int ), (int)75);
                if (!var17_9) ** GOTO lbl173
                throw null;
            }
            case 24: {
                var16_10 /* !! */  = (int)ko.hplx("hpsu", hplz(int ), (int)76);
                if (var17_9) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl211:
            // 2 sources

            case 25: {
                var16_10 /* !! */  = (int)ko.hplx("hpsv", hplz(int ), (int)77);
                if (var17_9) {
                    throw null;
                }
                ** GOTO lbl310
            }
lbl216:
            // 2 sources

            case 26: {
                var16_10 /* !! */  = (int)ko.hplx("hpsw", hplz(int ), (int)78);
                if (!var17_9) ** GOTO lbl123
                throw null;
            }
lbl220:
            // 3 sources

            case 27: {
                var16_10 /* !! */  = (int)ko.hplx("hpsx", hplz(int ), (int)79);
                if (!var17_9) ** GOTO lbl216
                throw null;
            }
lbl224:
            // 2 sources

            case 28: {
                var16_10 /* !! */  = (int)ko.hplx("hpsy", hplz(int ), (int)80);
                if (var17_9) {
                    throw null;
                }
                ** GOTO lbl310
            }
lbl229:
            // 2 sources

            case 29: {
                var16_10 /* !! */  = (int)ko.hplx("hpsz", hplz(int ), (int)81);
                if (!var17_9) ** GOTO lbl127
                throw null;
            }
lbl233:
            // 2 sources

            case 30: {
                var16_10 /* !! */  = (int)ko.hplx("hpta", hplz(int ), (int)82);
                if (var17_9) {
                    throw null;
                }
                ** GOTO lbl302
            }
            case 31: {
                var16_10 /* !! */  = (int)ko.hplx("hptb", hplz(int ), (int)83);
                if (!var17_9) ** GOTO lbl189
                throw null;
            }
lbl242:
            // 3 sources

            case 32: {
                var16_10 /* !! */  = (int)ko.hplx("hptc", hplz(int ), (int)84);
                if (!var17_9) ** GOTO lbl185
                throw null;
            }
lbl246:
            // 3 sources

            case 33: {
                var16_10 /* !! */  = (int)ko.hplx("hptd", hplz(int ), (int)85);
                if (var17_9) {
                    throw null;
                }
                ** GOTO lbl286
            }
            case 34: {
                var16_10 /* !! */  = (int)ko.hplx("hpte", hplz(int ), (int)86);
                if (!var17_9) ** GOTO lbl149
                throw null;
            }
            case 35: {
                var16_10 /* !! */  = (int)ko.hplx("hptf", hplz(int ), (int)87);
                if (var17_9) {
                    throw null;
                }
                ** GOTO lbl314
            }
            case 36: {
                var16_10 /* !! */  = (int)ko.hplx("hptg", hplz(int ), (int)88);
                if (!var17_9) ** GOTO lbl202
                throw null;
            }
            case 37: {
                var16_10 /* !! */  = (int)ko.hplx("hpth", hplz(int ), (int)89);
                if (!var17_9) ** GOTO lbl136
                throw null;
            }
lbl268:
            // 2 sources

            case 38: {
                var16_10 /* !! */  = (int)ko.hplx("hpti", hplz(int ), (int)90);
                if (var17_9) {
                    throw null;
                }
                ** GOTO lbl310
            }
lbl273:
            // 2 sources

            case 39: {
                var16_10 /* !! */  = (int)ko.hplx("hptj", hplz(int ), (int)91);
                if (var17_9) {
                    throw null;
                }
                ** GOTO lbl286
            }
lbl278:
            // 2 sources

            case 40: {
                var16_10 /* !! */  = (int)ko.hplx("hptk", hplz(int ), (int)92);
                if (var17_9) {
                    throw null;
                }
            }
            case 41: {
                var16_10 /* !! */  = (int)ko.hplx("hptl", hplz(int ), (int)93);
                if (!var17_9) ** GOTO lbl132
                throw null;
            }
lbl286:
            // 3 sources

            case 42: {
                var16_10 /* !! */  = (int)ko.hplx("hptm", hplz(int ), (int)94);
                if (!var17_9) ** GOTO lbl211
                throw null;
            }
lbl290:
            // 2 sources

            case 43: {
                var16_10 /* !! */  = (int)ko.hplx("hptn", hplz(int ), (int)95);
                if (!var17_9) ** GOTO lbl233
                throw null;
            }
            case 44: {
                var16_10 /* !! */  = (int)ko.hplx("hpto", hplz(int ), (int)96);
                if (!var17_9) ** GOTO lbl173
                throw null;
            }
            case 45: {
                var16_10 /* !! */  = (int)ko.hplx("hptp", hplz(int ), (int)97);
                if (!var17_9) ** GOTO lbl181
                throw null;
            }
lbl302:
            // 3 sources

            case 46: {
                var16_10 /* !! */  = (int)ko.hplx("hptq", hplz(int ), (int)98);
                if (!var17_9) ** GOTO lbl132
                throw null;
            }
            case 47: {
                var16_10 /* !! */  = (int)ko.hplx("hptr", hplz(int ), (int)99);
                if (!var17_9) ** GOTO lbl246
                throw null;
            }
lbl310:
            // 4 sources

            case 48: {
                var16_10 /* !! */  = (int)ko.hplx("hpts", hplz(int ), (int)100);
                if (!var17_9) ** GOTO lbl273
                throw null;
            }
lbl314:
            // 4 sources

            case 49: {
                var16_10 /* !! */  = (int)ko.hplx("hptt", hplz(int ), (int)101);
                if (!var17_9) ** GOTO lbl290
                throw null;
            }
            case 50: {
                var16_10 /* !! */  = (int)ko.hplx("hptu", hplz(int ), (int)102);
                if (var17_9) {
                    throw null;
                }
                ** GOTO lbl347
            }
lbl323:
            // 2 sources

            case 51: {
                var16_10 /* !! */  = (int)ko.hplx("hptv", hplz(int ), (int)103);
                if (!var17_9) ** GOTO lbl220
                throw null;
            }
            case 52: {
                var16_10 /* !! */  = (int)ko.hplx("hptw", hplz(int ), (int)104);
                if (!var17_9) ** GOTO lbl242
                throw null;
            }
lbl331:
            // 2 sources

            case 53: {
                var16_10 /* !! */  = (int)ko.hplx("hptx", hplz(int ), (int)105);
                if (!var17_9) ** GOTO lbl123
                throw null;
            }
            case 54: {
                var16_10 /* !! */  = (int)ko.hplx("hpty", hplz(int ), (int)106);
                if (!var17_9) ** GOTO lbl242
                throw null;
            }
            case 55: {
                var16_10 /* !! */  = (int)ko.hplx("hptz", hplz(int ), (int)107);
                if (!var17_9) ** GOTO lbl268
                throw null;
            }
lbl343:
            // 2 sources

            case 56: {
                var16_10 /* !! */  = (int)ko.hplx("hpua", hplz(int ), (int)108);
                if (!var17_9) break;
                throw null;
            }
lbl347:
            // 3 sources

            case 57: {
                var16_10 /* !! */  = (int)ko.hplx("hpub", hplz(int ), (int)109);
                if (!var17_9) ** GOTO lbl145
                throw null;
            }
            case 58: {
                var16_10 /* !! */  = (int)ko.hplx("hpuc", hplz(int ), (int)110);
                if (!var17_9) ** GOTO lbl323
                throw null;
            }
            case 59: {
                var16_10 /* !! */  = (int)ko.hplx("hpud", hplz(int ), (int)111);
                if (!var17_9) ** GOTO lbl302
                throw null;
            }
            case 60: {
                var16_10 /* !! */  = (int)ko.hplx("hpue", hplz(int ), (int)112);
                if (!var17_9) ** GOTO lbl314
                throw null;
            }
            case 61: {
                var16_10 /* !! */  = (int)ko.hplx("hpuf", hplz(int ), (int)113);
                if (!var17_9) ** GOTO lbl177
                throw null;
            }
            case 62: 
        }
        var16_10 /* !! */  = (int)ko.hplx("hpug", hplz(int ), (int)114);
        ** while (!var17_9)
lbl370:
        // 1 sources

        throw null;
    }

    static {
        hpma = new int[144];
        hpmb = new int[144];
        ko.hpws();
        ko.hpwt();
        ko.hpwu();
        ko.hpwv();
        hplv = new long[104];
        hplw = new long[104];
        ko.hpww();
        ko.hpwx();
        ko.hpwy();
        ko.hpwz();
    }

    private static void hpwt() {
        ko.hpma[100] = -2086947828;
        ko.hpma[101] = 952841111;
        ko.hpma[102] = -1822807798;
        ko.hpma[103] = -590145587;
        ko.hpma[104] = 867569863;
        ko.hpma[105] = -1581739235;
        ko.hpma[106] = -299839635;
        ko.hpma[107] = 1505896361;
        ko.hpma[108] = -106876520;
        ko.hpma[109] = -1885849470;
        ko.hpma[110] = -1762515384;
        ko.hpma[111] = -699249209;
        ko.hpma[112] = -650155713;
        ko.hpma[113] = 1814202355;
        ko.hpma[114] = -1626668484;
        ko.hpma[115] = 1048749600;
        ko.hpma[116] = -1617843149;
        ko.hpma[117] = 105309534;
        ko.hpma[118] = -2083594822;
        ko.hpma[119] = 859130851;
        ko.hpma[120] = -1122634606;
        ko.hpma[121] = -2111074774;
        ko.hpma[122] = 1133830541;
        ko.hpma[123] = 951617070;
        ko.hpma[124] = -1211293472;
        ko.hpma[125] = 296427570;
        ko.hpma[126] = -107023732;
        ko.hpma[127] = -794035184;
        ko.hpma[128] = -798215661;
        ko.hpma[129] = 1301059153;
        ko.hpma[130] = 1785800949;
        ko.hpma[131] = -290101096;
        ko.hpma[132] = -226019394;
        ko.hpma[133] = -353736648;
        ko.hpma[134] = 1900113314;
        ko.hpma[135] = 1870559148;
        ko.hpma[136] = 1806163366;
        ko.hpma[137] = -1765392838;
        ko.hpma[138] = -1965342629;
        ko.hpma[139] = 824703827;
        ko.hpma[140] = 2107377025;
        ko.hpma[141] = -235416553;
        ko.hpma[142] = -1911904872;
        ko.hpma[143] = -1540373273;
    }

    /*
     * Exception decompiling
     */
    public static void init() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 79[SWITCH]
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

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static String lambda$init$0() {
        v0 /* !! */  = ko.oq;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(v1 - ko.hplx("hpwg", hplu(int ), (int)98));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 398505265: {
                    break block15;
                }
                case 463177828: {
                    v1 = ko.hplx("hpwh", hplu(int ), (int)99);
                    continue block15;
                }
                case 1684207044: {
                    v1 = ko.hplx("hpwi", hplu(int ), (int)100);
                    continue block15;
                }
            }
            break;
        }
        var2 = ko.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ko.oq - ko.hplx("hpwj", hplu(int ), (int)101)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ko.hplx("hpwk", hplz(int ), (int)138)) break;
            v2 /* !! */  = (long)ko.hplx("hpwl", hplz(int ), (int)139);
        }
        var1_1 /* !! */  = ko.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = ko.oq;
                if (true) ** GOTO lbl29
                block17: while (true) {
                    v3 /* !! */  = (long)(ko.hplx("hpwn", hplu(int ), (int)103) - ko.hplx("hpwm", hplu(int ), (int)102));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1034713466: {
                            continue block17;
                        }
                        case 398505265: {
                            break block17;
                        }
                    }
                    break;
                }
                var0_2 = ko.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                return "ColorPicker2D Uniforms";
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)ko.hplx("hpwo", hplz(int ), (int)140);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)ko.hplx("hpwp", hplz(int ), (int)141);
                if (var2) {
                    throw null;
                }
            }
            case 2: {
                do {
                    var1_1 /* !! */  = (int)ko.hplx("hpwq", hplz(int ), (int)142);
                } while (!var2);
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)ko.hplx("hpwr", hplz(int ), (int)143);
        ** while (!var2)
lbl58:
        // 1 sources

        throw null;
    }

    private static int hplz(int n2) {
        return hpma[n2] ^ hpmb[n2];
    }

    private static void hpwv() {
        ko.hpmb[100] = -2086947777;
        ko.hpmb[101] = 952841121;
        ko.hpmb[102] = -1822807778;
        ko.hpmb[103] = -590145556;
        ko.hpmb[104] = 867569869;
        ko.hpmb[105] = -1581739261;
        ko.hpmb[106] = -299839653;
        ko.hpmb[107] = 1505896379;
        ko.hpmb[108] = -106876493;
        ko.hpmb[109] = -1885849449;
        ko.hpmb[110] = -1762515377;
        ko.hpmb[111] = -699249159;
        ko.hpmb[112] = -650155749;
        ko.hpmb[113] = 1814202327;
        ko.hpmb[114] = -1626668516;
        ko.hpmb[115] = 1048749601;
        ko.hpmb[116] = 1219795760;
        ko.hpmb[117] = 105309535;
        ko.hpmb[118] = -1765862124;
        ko.hpmb[119] = 859130854;
        ko.hpmb[120] = -1122634605;
        ko.hpmb[121] = -2111074783;
        ko.hpmb[122] = 1133830540;
        ko.hpmb[123] = 951617068;
        ko.hpmb[124] = -1211293460;
        ko.hpmb[125] = 296427573;
        ko.hpmb[126] = -107023732;
        ko.hpmb[127] = -794035179;
        ko.hpmb[128] = -798215661;
        ko.hpmb[129] = 1301059160;
        ko.hpmb[130] = 1785800949;
        ko.hpmb[131] = -290101092;
        ko.hpmb[132] = -226019393;
        ko.hpmb[133] = -1009908406;
        ko.hpmb[134] = 1900113312;
        ko.hpmb[135] = 1870559150;
        ko.hpmb[136] = 1806163364;
        ko.hpmb[137] = -1765392837;
        ko.hpmb[138] = 1965342628;
        ko.hpmb[139] = 1786984009;
        ko.hpmb[140] = 2107377027;
        ko.hpmb[141] = -235416553;
        ko.hpmb[142] = -1911904869;
        ko.hpmb[143] = -1540373274;
    }
}

