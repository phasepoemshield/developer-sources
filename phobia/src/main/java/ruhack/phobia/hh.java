/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_437
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Locale;
import java.util.function.Supplier;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_437;
import ruhack.phobia.aw;
import ruhack.phobia.cn;
import ruhack.phobia.df;
import ruhack.phobia.dj;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.ee;
import ruhack.phobia.jx;
import ruhack.phobia.ka;
import ruhack.phobia.kf;
import ruhack.phobia.mc;
import ruhack.phobia.nu;
import ruhack.phobia.nv;
import ruhack.phobia.nz;
import ruhack.phobia.oc;

public class hh
extends ds {
    private final kf swapMode;
    private int targetSlot;
    private final kf firstItem;
    private boolean isFromHotbar;
    private static long[] ebeu;
    public static final int b;
    private final ka ringBind;
    private final kf secondItem;
    private final kf mode;
    private static int[] ebbf;
    public static final boolean c;
    static final long kf = 6172558609995561657L;
    private static int[] ebbg;
    private final ka bind;
    private static final String SWAP_ID = "AutoSwap";
    private static long[] ebet;
    private final class_1799[] ringItems;
    public static final boolean a;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean swapRingItem(int var1_1) {
        var6_2 = hh.c;
        var5_3 /* !! */  = hh.b;
        var4_4 = hh.a;
        if (var6_2) {
            throw null;
lbl6:
            // 15 sources

            return (boolean)hh.ebbh("ecpm", ebbe(int ), (int)327);
        }
        if (var4_4 || var4_4) ** GOTO lbl6
        if (!this.isRingSlot(var1_1)) ** GOTO lbl20
        if (var4_4) ** GOTO lbl6
        if (hh.mc.field_1724 == null) ** GOTO lbl20
        if (var4_4) ** GOTO lbl6
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (this.ringItems[var1_1].method_7960()) ** GOTO lbl20
                if (var4_4) ** GOTO lbl6
                if (!nz.isSwapQueued("AutoSwap")) ** GOTO lbl22
                if (var4_4) ** GOTO lbl6
lbl20:
                // 4 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                return (boolean)hh.ebbh("ecpn", ebbe(int ), (int)328);
lbl22:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                var2_5 = this.ringItems[var1_1];
                if (var4_4 || var4_4) ** GOTO lbl6
                if (!this.sameRingItem(hh.mc.field_1724.method_6079(), var2_5)) ** GOTO lbl28
                if (var4_4 || var4_4) ** GOTO lbl6
                return (boolean)hh.ebbh("ecpo", ebbe(int ), (int)329);
lbl28:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                var3_6 = this.findExactItem(var2_5);
                if (var4_4 || var4_4) ** GOTO lbl6
                if (var3_6 >= 0) ** GOTO lbl36
                if (var4_4 || var4_4) ** GOTO lbl6
                this.clearRingItem(var1_1);
                if (var4_4 || var4_4) ** GOTO lbl6
                return (boolean)hh.ebbh("ecpp", ebbe(int ), (int)330);
lbl36:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                this.prepareSwapNew(var3_6);
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return (boolean)hh.ebbh("ecpq", ebbe(int ), (int)331);
            }
lbl41:
            // 3 sources

            case 0: {
                var5_3 /* !! */  = (int)hh.ebbh("ecpr", ebbe(int ), (int)332);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl81
            }
            case 1: {
                var5_3 /* !! */  = (int)hh.ebbh("ecps", ebbe(int ), (int)333);
                if (!var6_2) break;
                throw null;
            }
lbl50:
            // 2 sources

            case 2: {
                var5_3 /* !! */  = (int)hh.ebbh("ecpt", ebbe(int ), (int)334);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl55:
            // 3 sources

            case 3: {
                var5_3 /* !! */  = (int)hh.ebbh("ecpu", ebbe(int ), (int)335);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl60:
            // 3 sources

            case 4: {
                var5_3 /* !! */  = (int)hh.ebbh("ecpv", ebbe(int ), (int)336);
                if (!var6_2) ** GOTO lbl41
                throw null;
            }
            case 5: {
                var5_3 /* !! */  = (int)hh.ebbh("ecpw", ebbe(int ), (int)337);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl91
            }
lbl69:
            // 2 sources

            case 6: {
                var5_3 /* !! */  = (int)hh.ebbh("ecpx", ebbe(int ), (int)338);
                if (!var6_2) ** GOTO lbl60
                throw null;
            }
lbl73:
            // 2 sources

            case 7: {
                var5_3 /* !! */  = (int)hh.ebbh("ecpy", ebbe(int ), (int)339);
                if (!var6_2) ** GOTO lbl41
                throw null;
            }
            case 8: {
                var5_3 /* !! */  = (int)hh.ebbh("ecpz", ebbe(int ), (int)340);
                if (!var6_2) ** GOTO lbl69
                throw null;
            }
lbl81:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)hh.ebbh("ecqa", ebbe(int ), (int)341);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl86:
            // 3 sources

            case 10: {
                var5_3 /* !! */  = (int)hh.ebbh("ecqb", ebbe(int ), (int)342);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl91:
            // 2 sources

            case 11: {
                var5_3 /* !! */  = (int)hh.ebbh("ecqc", ebbe(int ), (int)343);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl120
            }
            case 12: {
                var5_3 /* !! */  = (int)hh.ebbh("ecqd", ebbe(int ), (int)344);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl135
            }
lbl101:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)hh.ebbh("ecqe", ebbe(int ), (int)345);
                if (!var6_2) ** GOTO lbl86
                throw null;
            }
            case 14: {
                var5_3 /* !! */  = (int)hh.ebbh("ecqf", ebbe(int ), (int)346);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl135
            }
            case 15: {
                var5_3 /* !! */  = (int)hh.ebbh("ecqg", ebbe(int ), (int)347);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl130
            }
            case 16: {
                var5_3 /* !! */  = (int)hh.ebbh("ecqh", ebbe(int ), (int)348);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl120:
            // 3 sources

            case 17: {
                var5_3 /* !! */  = (int)hh.ebbh("ecqi", ebbe(int ), (int)349);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl125:
            // 2 sources

            case 18: {
                var5_3 /* !! */  = (int)hh.ebbh("ecqj", ebbe(int ), (int)350);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl130:
            // 3 sources

            case 19: {
                var5_3 /* !! */  = (int)hh.ebbh("ecqk", ebbe(int ), (int)351);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl135:
            // 3 sources

            case 20: {
                var5_3 /* !! */  = (int)hh.ebbh("ecql", ebbe(int ), (int)352);
                if (!var6_2) ** GOTO lbl60
                throw null;
            }
lbl139:
            // 3 sources

            case 21: {
                var5_3 /* !! */  = (int)hh.ebbh("ecqm", ebbe(int ), (int)353);
                if (!var6_2) ** GOTO lbl73
                throw null;
            }
lbl143:
            // 2 sources

            case 22: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)hh.ebbh("ecqn", ebbe(int ), (int)354);
                    if (!var6_2) ** GOTO lbl55
                    throw null;
                }
            }
            case 23: {
                var5_3 /* !! */  = (int)hh.ebbh("ecqo", ebbe(int ), (int)355);
                if (!var6_2) ** GOTO lbl50
                throw null;
            }
lbl152:
            // 2 sources

            case 24: {
                var5_3 /* !! */  = (int)hh.ebbh("ecqp", ebbe(int ), (int)356);
                if (!var6_2) ** GOTO lbl55
                throw null;
            }
            case 25: {
                var5_3 /* !! */  = (int)hh.ebbh("ecqq", ebbe(int ), (int)357);
                if (!var6_2) ** GOTO lbl101
                throw null;
            }
            case 26: {
                var5_3 /* !! */  = (int)hh.ebbh("ecqr", ebbe(int ), (int)358);
                if (!var6_2) ** GOTO lbl86
                throw null;
            }
lbl164:
            // 3 sources

            case 27: {
                var5_3 /* !! */  = (int)hh.ebbh("ecqs", ebbe(int ), (int)359);
                if (!var6_2) ** GOTO lbl120
                throw null;
            }
lbl168:
            // 2 sources

            case 28: {
                var5_3 /* !! */  = (int)hh.ebbh("ecqt", ebbe(int ), (int)360);
                if (!var6_2) ** GOTO lbl125
                throw null;
            }
            case 29: 
        }
        var5_3 /* !! */  = (int)hh.ebbh("ecqu", ebbe(int ), (int)361);
        ** while (!var6_2)
lbl175:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void efnj() {
        hh.ebbf[400] = 1819652668;
        hh.ebbf[401] = -2107885176;
        hh.ebbf[402] = -1586074939;
        hh.ebbf[403] = -525931003;
        hh.ebbf[404] = -6024401;
        hh.ebbf[405] = -1241270200;
        hh.ebbf[406] = 1754073437;
        hh.ebbf[407] = 57935126;
        hh.ebbf[408] = 2041100386;
        hh.ebbf[409] = -919590864;
        hh.ebbf[410] = -1461714967;
        hh.ebbf[411] = 529277622;
        hh.ebbf[412] = -114918461;
        hh.ebbf[413] = 1319750487;
        hh.ebbf[414] = 1209022026;
        hh.ebbf[415] = -510091583;
        hh.ebbf[416] = -1761817693;
        hh.ebbf[417] = 878887807;
        hh.ebbf[418] = 1842516465;
        hh.ebbf[419] = -87799441;
        hh.ebbf[420] = -2145274806;
        hh.ebbf[421] = -980019125;
        hh.ebbf[422] = 1003373977;
        hh.ebbf[423] = -381710802;
        hh.ebbf[424] = -464490820;
        hh.ebbf[425] = -1051654119;
        hh.ebbf[426] = 272379123;
        hh.ebbf[427] = 1700520;
        hh.ebbf[428] = 468215455;
        hh.ebbf[429] = 1904157670;
        hh.ebbf[430] = -205568304;
        hh.ebbf[431] = 61424703;
        hh.ebbf[432] = -918048329;
        hh.ebbf[433] = 75771076;
        hh.ebbf[434] = 2061107043;
        hh.ebbf[435] = -1094021748;
        hh.ebbf[436] = 1978712102;
        hh.ebbf[437] = -814961056;
        hh.ebbf[438] = 1652324247;
        hh.ebbf[439] = 882440610;
        hh.ebbf[440] = 817421132;
        hh.ebbf[441] = 795174276;
        hh.ebbf[442] = -1625614507;
        hh.ebbf[443] = -561868954;
        hh.ebbf[444] = -2119107403;
        hh.ebbf[445] = -230442632;
        hh.ebbf[446] = 163505283;
        hh.ebbf[447] = -2019271865;
        hh.ebbf[448] = -1928534809;
        hh.ebbf[449] = -1837516416;
        hh.ebbf[450] = -483166468;
        hh.ebbf[451] = -246908294;
        hh.ebbf[452] = -2081411608;
        hh.ebbf[453] = 1555142192;
        hh.ebbf[454] = 2119792261;
        hh.ebbf[455] = -1344550611;
        hh.ebbf[456] = -2000827301;
        hh.ebbf[457] = 48625249;
        hh.ebbf[458] = 458308591;
        hh.ebbf[459] = 684276216;
        hh.ebbf[460] = -2057718734;
        hh.ebbf[461] = -1103179552;
        hh.ebbf[462] = -1403623754;
        hh.ebbf[463] = -1543169884;
        hh.ebbf[464] = -1131178736;
        hh.ebbf[465] = -78599464;
        hh.ebbf[466] = -1319207820;
        hh.ebbf[467] = 1341308536;
        hh.ebbf[468] = -940777173;
        hh.ebbf[469] = 0xDD660D6;
        hh.ebbf[470] = 1310319763;
        hh.ebbf[471] = -135038716;
        hh.ebbf[472] = 1465619310;
        hh.ebbf[473] = 1608244870;
        hh.ebbf[474] = -2011703664;
        hh.ebbf[475] = 496347842;
        hh.ebbf[476] = 1020160507;
        hh.ebbf[477] = 1859283080;
        hh.ebbf[478] = 1573063753;
        hh.ebbf[479] = 2118608784;
        hh.ebbf[480] = -665942446;
        hh.ebbf[481] = 91052934;
        hh.ebbf[482] = 1542868566;
        hh.ebbf[483] = -1277161345;
        hh.ebbf[484] = -689591763;
        hh.ebbf[485] = -172980477;
        hh.ebbf[486] = 205860164;
        hh.ebbf[487] = 831042720;
        hh.ebbf[488] = -718306702;
        hh.ebbf[489] = 25658872;
        hh.ebbf[490] = 721845361;
        hh.ebbf[491] = 147012440;
        hh.ebbf[492] = -101730846;
        hh.ebbf[493] = 600815669;
        hh.ebbf[494] = -17604306;
        hh.ebbf[495] = -1882417260;
        hh.ebbf[496] = 476949512;
        hh.ebbf[497] = 1848952018;
        hh.ebbf[498] = 1980173466;
        hh.ebbf[499] = -1550413999;
    }

    private static /* synthetic */ void efoe() {
        hh.ebet[500] = 2576035340204962226L;
        hh.ebet[501] = -8268970549662932180L;
        hh.ebet[502] = -9111144216897859319L;
        hh.ebet[503] = -6340719369271951263L;
        hh.ebet[504] = 2254847738640767904L;
        hh.ebet[505] = 1125465016828628685L;
        hh.ebet[506] = -3379368796277333509L;
        hh.ebet[507] = -7956936260731138245L;
        hh.ebet[508] = -6471639160891158895L;
        hh.ebet[509] = -2647007511814929320L;
        hh.ebet[510] = -916222098702350531L;
        hh.ebet[511] = -2367039605019032820L;
        hh.ebet[512] = -4416901609388809983L;
        hh.ebet[513] = 1556207349151564525L;
        hh.ebet[514] = -6322147155015808745L;
        hh.ebet[515] = -1638230328515187045L;
        hh.ebet[516] = 2837393890761596889L;
        hh.ebet[517] = 8176594541038529879L;
        hh.ebet[518] = 3271454089185152827L;
        hh.ebet[519] = -1887947164521035068L;
        hh.ebet[520] = -9181529060629835073L;
        hh.ebet[521] = 5514454434530843732L;
        hh.ebet[522] = 5101587733580303710L;
        hh.ebet[523] = -4189579691519478193L;
        hh.ebet[524] = 777951011573455525L;
        hh.ebet[525] = 8617833556088720712L;
        hh.ebet[526] = 6392247371122005842L;
        hh.ebet[527] = -9181284559286736333L;
        hh.ebet[528] = -7876685799671674311L;
        hh.ebet[529] = -8054471315564400133L;
        hh.ebet[530] = 5331830143750868428L;
        hh.ebet[531] = 4336436619136658364L;
        hh.ebet[532] = 6184407358794706679L;
        hh.ebet[533] = -4645552984268102870L;
        hh.ebet[534] = 3552389079413886577L;
        hh.ebet[535] = -2371528935040345394L;
        hh.ebet[536] = 6099106770573725396L;
        hh.ebet[537] = 4241825369653410169L;
        hh.ebet[538] = -537312706113892737L;
        hh.ebet[539] = -4439746808097813090L;
        hh.ebet[540] = 8608093150989436251L;
        hh.ebet[541] = 922931337962055954L;
        hh.ebet[542] = -3750332624228625600L;
        hh.ebet[543] = -2497384020449346058L;
        hh.ebet[544] = -8360622426508424166L;
        hh.ebet[545] = 2030248449255295725L;
        hh.ebet[546] = -1842635358463192841L;
        hh.ebet[547] = 7329197293584047716L;
        hh.ebet[548] = -3347132601343647838L;
        hh.ebet[549] = 7157125191835695178L;
        hh.ebet[550] = 6578502638582442295L;
        hh.ebet[551] = 3695752056003719464L;
        hh.ebet[552] = -706191604134182807L;
        hh.ebet[553] = -1966894868042140775L;
        hh.ebet[554] = 7495276208259470123L;
        hh.ebet[555] = -4828253161126214569L;
        hh.ebet[556] = -8664817763557624772L;
        hh.ebet[557] = -5591610472613833546L;
        hh.ebet[558] = -432355243428859850L;
        hh.ebet[559] = -3327335979281022588L;
        hh.ebet[560] = -7168386563091082556L;
        hh.ebet[561] = 8986124204324610820L;
        hh.ebet[562] = -679209972003615314L;
        hh.ebet[563] = 714632293179487827L;
        hh.ebet[564] = -7155288563382300106L;
        hh.ebet[565] = -2042538811694630023L;
        hh.ebet[566] = -6912987422994388899L;
        hh.ebet[567] = -5219001633441833200L;
        hh.ebet[568] = 6000274810839748600L;
        hh.ebet[569] = -1888595002160695661L;
        hh.ebet[570] = 4791946782167995878L;
        hh.ebet[571] = -8529914661008596871L;
        hh.ebet[572] = 1812430965872575322L;
        hh.ebet[573] = -7785940702153818054L;
        hh.ebet[574] = 5564143296239863333L;
        hh.ebet[575] = -3193044052933557006L;
        hh.ebet[576] = -7786018924993636757L;
        hh.ebet[577] = -3450112919294732690L;
        hh.ebet[578] = 3123605122998194696L;
        hh.ebet[579] = -8989416662584234646L;
        hh.ebet[580] = 4533904773928321729L;
        hh.ebet[581] = -7096501269474385351L;
        hh.ebet[582] = 5953898684683301906L;
        hh.ebet[583] = -3627899063549969123L;
        hh.ebet[584] = -1582925422213564251L;
        hh.ebet[585] = -5315971051901984667L;
        hh.ebet[586] = 99112570176794307L;
        hh.ebet[587] = -4730524187561985089L;
        hh.ebet[588] = 5998022568626928845L;
        hh.ebet[589] = -2497607975476322846L;
        hh.ebet[590] = 259668326066528551L;
        hh.ebet[591] = -4757725989021761360L;
        hh.ebet[592] = 7389198538889879455L;
        hh.ebet[593] = -2613987318580718016L;
        hh.ebet[594] = -2837542538648265857L;
        hh.ebet[595] = -8798076061536123107L;
        hh.ebet[596] = 4278631558795406181L;
        hh.ebet[597] = -2781256034969313884L;
        hh.ebet[598] = -7240173831091839578L;
        hh.ebet[599] = 2766547890949074263L;
    }

    private static /* synthetic */ void efnp() {
        hh.ebbg[0] = -1993098550;
        hh.ebbg[1] = 375925020;
        hh.ebbg[2] = -262124036;
        hh.ebbg[3] = 1893722007;
        hh.ebbg[4] = -2124473928;
        hh.ebbg[5] = 1581403231;
        hh.ebbg[6] = 1692630414;
        hh.ebbg[7] = -480242734;
        hh.ebbg[8] = 92175502;
        hh.ebbg[9] = -974285164;
        hh.ebbg[10] = -1925734815;
        hh.ebbg[11] = 194674906;
        hh.ebbg[12] = -558345557;
        hh.ebbg[13] = -1523515623;
        hh.ebbg[14] = 1418032309;
        hh.ebbg[15] = -1413883520;
        hh.ebbg[16] = -1977151309;
        hh.ebbg[17] = -1839572520;
        hh.ebbg[18] = -495394524;
        hh.ebbg[19] = 1487840205;
        hh.ebbg[20] = -1447071217;
        hh.ebbg[21] = 1107717544;
        hh.ebbg[22] = 62931261;
        hh.ebbg[23] = -912238592;
        hh.ebbg[24] = 567598488;
        hh.ebbg[25] = -118911758;
        hh.ebbg[26] = -993475246;
        hh.ebbg[27] = -425040937;
        hh.ebbg[28] = 724754830;
        hh.ebbg[29] = 49714327;
        hh.ebbg[30] = -393621615;
        hh.ebbg[31] = 323984909;
        hh.ebbg[32] = -1245840690;
        hh.ebbg[33] = -524520175;
        hh.ebbg[34] = -406933423;
        hh.ebbg[35] = 783478308;
        hh.ebbg[36] = 134028100;
        hh.ebbg[37] = 1320200664;
        hh.ebbg[38] = -1156623442;
        hh.ebbg[39] = -1890833308;
        hh.ebbg[40] = 1745920925;
        hh.ebbg[41] = 1688158982;
        hh.ebbg[42] = 27112535;
        hh.ebbg[43] = 901545506;
        hh.ebbg[44] = -1850555327;
        hh.ebbg[45] = 601843005;
        hh.ebbg[46] = 1450649509;
        hh.ebbg[47] = 1926607429;
        hh.ebbg[48] = -970425984;
        hh.ebbg[49] = 1534419912;
        hh.ebbg[50] = 1741018864;
        hh.ebbg[51] = -333684218;
        hh.ebbg[52] = -842426613;
        hh.ebbg[53] = -1338386176;
        hh.ebbg[54] = -1013974498;
        hh.ebbg[55] = -263923210;
        hh.ebbg[56] = 1916376741;
        hh.ebbg[57] = 1454334192;
        hh.ebbg[58] = 1150789500;
        hh.ebbg[59] = 1453788997;
        hh.ebbg[60] = -472768999;
        hh.ebbg[61] = 178707004;
        hh.ebbg[62] = -1614328624;
        hh.ebbg[63] = 564536640;
        hh.ebbg[64] = 1868263534;
        hh.ebbg[65] = -1737731778;
        hh.ebbg[66] = 616834478;
        hh.ebbg[67] = 13387547;
        hh.ebbg[68] = -1572979111;
        hh.ebbg[69] = -902497935;
        hh.ebbg[70] = 1140933386;
        hh.ebbg[71] = -735847952;
        hh.ebbg[72] = -300054030;
        hh.ebbg[73] = 1428740370;
        hh.ebbg[74] = -1623001074;
        hh.ebbg[75] = -211596537;
        hh.ebbg[76] = 1887343018;
        hh.ebbg[77] = -370603260;
        hh.ebbg[78] = 673955885;
        hh.ebbg[79] = 957414999;
        hh.ebbg[80] = 1393555068;
        hh.ebbg[81] = 1864219379;
        hh.ebbg[82] = 1214837368;
        hh.ebbg[83] = 1880695117;
        hh.ebbg[84] = 1417711971;
        hh.ebbg[85] = -1482342468;
        hh.ebbg[86] = 27711024;
        hh.ebbg[87] = -1985518133;
        hh.ebbg[88] = -170333029;
        hh.ebbg[89] = -38606478;
        hh.ebbg[90] = 64783387;
        hh.ebbg[91] = 2060111140;
        hh.ebbg[92] = -1773606789;
        hh.ebbg[93] = -443137852;
        hh.ebbg[94] = -1072003170;
        hh.ebbg[95] = -948231256;
        hh.ebbg[96] = 1269294411;
        hh.ebbg[97] = -1259896539;
        hh.ebbg[98] = -95427301;
        hh.ebbg[99] = 1375380250;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void swapTo(String var1_1) {
        block55: {
            block54: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("ecqv", ebes(int ), (int)245)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == hh.ebbh("ecqw", ebbe(int ), (int)362)) break;
                    v0 /* !! */  = (long)hh.ebbh("ecqx", ebbe(int ), (int)363);
                }
                var4_2 = hh.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("ecqy", ebes(int ), (int)246)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == hh.ebbh("ecqz", ebbe(int ), (int)364)) break;
                    v1 /* !! */  = (long)hh.ebbh("ecra", ebbe(int ), (int)365);
                }
                var3_3 /* !! */  = hh.b;
                v2 /* !! */  = hh.kf;
                if (true) ** GOTO lbl17
                block33: while (true) {
                    v2 /* !! */  = (long)(hh.ebbh("ecrc", ebes(int ), (int)248) - hh.ebbh("ecrb", ebes(int ), (int)247));
lbl17:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case 672168633: {
                            break block33;
                        }
                        case 1545409672: {
                            continue block33;
                        }
                    }
                    break;
                }
                var2_4 = hh.a;
                if (var4_2) {
                    throw null;
lbl25:
                    // 7 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl25
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("ecrd", ebes(int ), (int)249)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == hh.ebbh("ecre", ebbe(int ), (int)366)) break;
                    v3 /* !! */  = (long)hh.ebbh("ecrf", ebbe(int ), (int)367);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = hh.kf - hh.ebbh("ecrg", ebes(int ), (int)250)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == hh.ebbh("ecrh", ebbe(int ), (int)368)) break;
                    v4 /* !! */  = (long)hh.ebbh("ecri", ebbe(int ), (int)369);
                }
                if (!this.swapMode.isSelected("\u0411\u044b\u0441\u0442\u0440\u044b\u0439")) break block54;
                if (var2_4 || var2_4) ** GOTO lbl25
                v5 /* !! */  = hh.kf;
                if (true) ** GOTO lbl44
                block37: while (true) {
                    v5 /* !! */  = (long)(hh.ebbh("ecrk", ebes(int ), (int)252) - hh.ebbh("ecrj", ebes(int ), (int)251));
lbl44:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1283241714: {
                            continue block37;
                        }
                        case 672168633: {
                            break block37;
                        }
                    }
                    break;
                }
                this.executeSwapInstant(var1_1);
                if (var2_4) ** GOTO lbl25
                if (var4_2) {
                    throw null;
                }
                break block55;
            }
            if (var2_4 || var2_4) ** GOTO lbl25
            v6 /* !! */  = hh.kf;
            if (true) ** GOTO lbl60
            block38: while (true) {
                v6 /* !! */  = (long)(v7 - hh.ebbh("ecrl", ebes(int ), (int)253));
lbl60:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -2068336874: {
                        v7 = hh.ebbh("ecrm", ebes(int ), (int)254);
                        continue block38;
                    }
                    case -534579848: {
                        v7 = hh.ebbh("ecrn", ebes(int ), (int)255);
                        continue block38;
                    }
                    case 138856109: {
                        v7 = hh.ebbh("ecro", ebes(int ), (int)256);
                        continue block38;
                    }
                    case 672168633: {
                        break block38;
                    }
                }
                break;
            }
            if (nz.isSwapQueued("AutoSwap")) break block55;
            if (var2_4 || var2_4) ** GOTO lbl25
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_4 = hh.kf - hh.ebbh("ecrp", ebes(int ), (int)257)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == hh.ebbh("ecrq", ebbe(int ), (int)370)) break;
                v8 /* !! */  = (long)hh.ebbh("ecrr", ebbe(int ), (int)371);
            }
            this.prepareSwapNew(var1_1);
            if (var2_4) ** GOTO lbl25
        }
        if (!var2_4 && !var2_4) ** break;
        ** while (true)
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl88:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)hh.ebbh("ecrs", ebbe(int ), (int)372);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl103
            }
lbl93:
            // 3 sources

            case 1: {
                var3_3 /* !! */  = (int)hh.ebbh("ecrt", ebbe(int ), (int)373);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl98:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)hh.ebbh("ecru", ebbe(int ), (int)374);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl103:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)hh.ebbh("ecrv", ebbe(int ), (int)375);
                if (!var4_2) ** GOTO lbl93
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)hh.ebbh("ecrw", ebbe(int ), (int)376);
                if (var4_2) {
                    throw null;
                }
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hh.ebbh("ecrx", ebbe(int ), (int)377);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl133
                    break;
                }
            }
lbl117:
            // 4 sources

            case 6: {
                var3_3 /* !! */  = (int)hh.ebbh("ecry", ebbe(int ), (int)378);
                if (var4_2) {
                    throw null;
                }
            }
            case 7: {
                var3_3 /* !! */  = (int)hh.ebbh("ecrz", ebbe(int ), (int)379);
                if (!var4_2) ** GOTO lbl117
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)hh.ebbh("ecsa", ebbe(int ), (int)380);
                if (!var4_2) break;
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)hh.ebbh("ecsb", ebbe(int ), (int)381);
                if (!var4_2) ** GOTO lbl117
                throw null;
            }
lbl133:
            // 2 sources

            case 10: {
                do {
                    var3_3 /* !! */  = (int)hh.ebbh("ecsc", ebbe(int ), (int)382);
                } while (!var4_2);
                throw null;
            }
lbl138:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)hh.ebbh("ecsd", ebbe(int ), (int)383);
                if (!var4_2) ** GOTO lbl93
                throw null;
            }
            case 12: {
                var3_3 /* !! */  = (int)hh.ebbh("ecse", ebbe(int ), (int)384);
                if (!var4_2) ** GOTO lbl88
                throw null;
            }
            case 13: {
                var3_3 /* !! */  = (int)hh.ebbh("ecsf", ebbe(int ), (int)385);
                if (!var4_2) ** GOTO lbl98
                throw null;
            }
            case 14: 
        }
        var3_3 /* !! */  = (int)hh.ebbh("ecsg", ebbe(int ), (int)386);
        ** while (!var4_2)
lbl153:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void prepareSwapNew(String var1_1) {
        block69: {
            var6_2 = hh.c;
            var5_3 /* !! */  = hh.b;
            var4_4 = hh.a;
            if (var6_2) {
                throw null;
lbl6:
                // 16 sources

                return;
            }
            if (var4_4 || var4_4) ** GOTO lbl6
            if (!this.matches(hh.mc.field_1724.method_6079(), var1_1)) break block69;
            if (var4_4) ** GOTO lbl6
            if (this.isSphereToSphere()) break block69;
            if (var4_4 || var4_4) ** GOTO lbl6
            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl6
        var2_5 = this.findItemHotbar(var1_1);
        if (var4_4 || var4_4) ** GOTO lbl6
        if (!var2_5.found()) ** GOTO lbl30
        if (var4_4 || var4_4) ** GOTO lbl6
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.targetSlot = var2_5.slot();
                if (var4_4 || var4_4) ** GOTO lbl6
                this.isFromHotbar = hh.ebbh("ecww", ebbe(int ), (int)470);
                if (var4_4) ** GOTO lbl6
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl41
            }
lbl30:
            // 1 sources

            if (var4_4 || var4_4) ** GOTO lbl6
            var3_6 = this.findItemInventory(var1_1);
            if (var4_4 || var4_4) ** GOTO lbl6
            if (var3_6.found()) ** GOTO lbl36
            if (var4_4 || var4_4) ** GOTO lbl6
            return;
lbl36:
            // 1 sources

            if (var4_4 || var4_4) ** GOTO lbl6
            this.targetSlot = var3_6.slot();
            if (var4_4 || var4_4) ** GOTO lbl6
            this.isFromHotbar = hh.ebbh("ecwx", ebbe(int ), (int)471);
            if (var4_4) ** GOTO lbl6
lbl41:
            // 2 sources

            if (var4_4 || var4_4) ** GOTO lbl6
            nz.queueSwap("AutoSwap", (int)hh.ebbh("ecwy", ebbe(int ), (int)472), (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, executeSwapLegit(), ()V)((hh)this), this.createOneTickSettings(), (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, cleanup(), ()V)((hh)this));
            if (!var4_4 && !var4_4) ** break;
            ** continue;
            return;
            case 0: {
                var5_3 /* !! */  = (int)hh.ebbh("ecwz", ebbe(int ), (int)473);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl87
            }
lbl52:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxa", ebbe(int ), (int)474);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl120
            }
            case 2: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxb", ebbe(int ), (int)475);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 3: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxc", ebbe(int ), (int)476);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl67:
            // 2 sources

            case 4: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxd", ebbe(int ), (int)477);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl72:
            // 2 sources

            case 5: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxe", ebbe(int ), (int)478);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl77:
            // 2 sources

            case 6: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxf", ebbe(int ), (int)479);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl82:
            // 3 sources

            case 7: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxg", ebbe(int ), (int)480);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl87:
            // 3 sources

            case 8: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxh", ebbe(int ), (int)481);
                if (!var6_2) ** GOTO lbl77
                throw null;
            }
lbl91:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxi", ebbe(int ), (int)482);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl96:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxj", ebbe(int ), (int)483);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 11: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxk", ebbe(int ), (int)484);
                if (!var6_2) ** GOTO lbl82
                throw null;
            }
lbl105:
            // 2 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)hh.ebbh("ecxl", ebbe(int ), (int)485);
                    if (!var6_2) ** GOTO lbl52
                    throw null;
                }
            }
            case 13: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxm", ebbe(int ), (int)486);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 14: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxn", ebbe(int ), (int)487);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl120:
            // 4 sources

            case 15: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxo", ebbe(int ), (int)488);
                if (!var6_2) ** GOTO lbl87
                throw null;
            }
lbl124:
            // 2 sources

            case 16: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxp", ebbe(int ), (int)489);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl129:
            // 2 sources

            case 17: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxq", ebbe(int ), (int)490);
                if (!var6_2) ** GOTO lbl67
                throw null;
            }
lbl133:
            // 2 sources

            case 18: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxr", ebbe(int ), (int)491);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 19: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxs", ebbe(int ), (int)492);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl143:
            // 2 sources

            case 20: {
                do {
                    var5_3 /* !! */  = (int)hh.ebbh("ecxt", ebbe(int ), (int)493);
                } while (!var6_2);
                throw null;
            }
lbl148:
            // 2 sources

            case 21: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxu", ebbe(int ), (int)494);
                if (var6_2) {
                    throw null;
                }
            }
lbl152:
            // 4 sources

            case 22: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxv", ebbe(int ), (int)495);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 23: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxw", ebbe(int ), (int)496);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 24: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxx", ebbe(int ), (int)497);
                if (!var6_2) ** GOTO lbl82
                throw null;
            }
lbl166:
            // 3 sources

            case 25: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxy", ebbe(int ), (int)498);
                if (!var6_2) ** GOTO lbl133
                throw null;
            }
lbl170:
            // 3 sources

            case 26: {
                var5_3 /* !! */  = (int)hh.ebbh("ecxz", ebbe(int ), (int)499);
                if (!var6_2) ** GOTO lbl96
                throw null;
            }
lbl174:
            // 3 sources

            case 27: {
                var5_3 /* !! */  = (int)hh.ebbh("ecya", ebbe(int ), (int)500);
                if (!var6_2) ** GOTO lbl91
                throw null;
            }
lbl178:
            // 4 sources

            case 28: {
                var5_3 /* !! */  = (int)hh.ebbh("ecyb", ebbe(int ), (int)501);
                if (!var6_2) break;
                throw null;
            }
            case 29: {
                var5_3 /* !! */  = (int)hh.ebbh("ecyc", ebbe(int ), (int)502);
                if (!var6_2) ** GOTO lbl72
                throw null;
            }
            case 30: {
                var5_3 /* !! */  = (int)hh.ebbh("ecyd", ebbe(int ), (int)503);
                if (!var6_2) ** GOTO lbl148
                throw null;
            }
            case 31: {
                var5_3 /* !! */  = (int)hh.ebbh("ecye", ebbe(int ), (int)504);
                if (!var6_2) ** GOTO lbl105
                throw null;
            }
            case 32: 
        }
        var5_3 /* !! */  = (int)hh.ebbh("ecyf", ebbe(int ), (int)505);
        ** while (!var6_2)
lbl197:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void efom() {
        hh.ebeu[600] = -7336794722315054576L;
        hh.ebeu[601] = 8625989933864595164L;
        hh.ebeu[602] = -7860164980138489968L;
        hh.ebeu[603] = -1853018684835916874L;
        hh.ebeu[604] = 751998584308341280L;
        hh.ebeu[605] = 3429659007293551868L;
        hh.ebeu[606] = 1022668438214205693L;
        hh.ebeu[607] = -3694423893040053248L;
        hh.ebeu[608] = -1143605564120548207L;
        hh.ebeu[609] = 2122468264674259997L;
        hh.ebeu[610] = -8078014935625771736L;
        hh.ebeu[611] = 7755806173207988517L;
        hh.ebeu[612] = -1754685421645421479L;
        hh.ebeu[613] = 4704606005393115859L;
        hh.ebeu[614] = 3621100232760839583L;
        hh.ebeu[615] = 8921625438966409232L;
        hh.ebeu[616] = 5867521545581382808L;
        hh.ebeu[617] = 7413218907045283721L;
        hh.ebeu[618] = -9109807970320021146L;
        hh.ebeu[619] = -7080655436381139604L;
        hh.ebeu[620] = 2263732966051931088L;
        hh.ebeu[621] = -6782540433382701426L;
        hh.ebeu[622] = 2939486401489367222L;
        hh.ebeu[623] = 8806519412056966047L;
        hh.ebeu[624] = -4706289423707090388L;
        hh.ebeu[625] = 5288060257002575663L;
        hh.ebeu[626] = 5100163888668752235L;
        hh.ebeu[627] = 5950470130948068986L;
        hh.ebeu[628] = 6373354866308823128L;
        hh.ebeu[629] = 4642449342477273177L;
        hh.ebeu[630] = -6120714655500063718L;
        hh.ebeu[631] = 8989995984466226918L;
        hh.ebeu[632] = 4907014607060392418L;
        hh.ebeu[633] = -5688650047442709560L;
        hh.ebeu[634] = 6864539482173510415L;
        hh.ebeu[635] = -2536367150297613769L;
        hh.ebeu[636] = 4273280536173430054L;
        hh.ebeu[637] = 7172639190566678205L;
        hh.ebeu[638] = 5782004843290075936L;
        hh.ebeu[639] = -6274829629374521178L;
        hh.ebeu[640] = -3365348686595030696L;
        hh.ebeu[641] = -4115645770686870681L;
        hh.ebeu[642] = 8673879673287111611L;
        hh.ebeu[643] = 3494939737025801325L;
        hh.ebeu[644] = -3002406714405949770L;
        hh.ebeu[645] = 8043244500791567417L;
        hh.ebeu[646] = 8609904162653721L;
        hh.ebeu[647] = 2589494949792218938L;
        hh.ebeu[648] = 2877629571611176015L;
        hh.ebeu[649] = -7333322879491738480L;
        hh.ebeu[650] = -8650123343630999065L;
        hh.ebeu[651] = -6376789380452733462L;
        hh.ebeu[652] = -6254844330966251055L;
        hh.ebeu[653] = 4780186880388113089L;
        hh.ebeu[654] = -7679110079190130330L;
        hh.ebeu[655] = 6749171998633357771L;
        hh.ebeu[656] = 5963312264285245116L;
        hh.ebeu[657] = 5823049104705556160L;
    }

    private static /* synthetic */ void efnn() {
        hh.ebbf[800] = -622942959;
        hh.ebbf[801] = 1925205803;
        hh.ebbf[802] = -873149316;
        hh.ebbf[803] = -1557920947;
        hh.ebbf[804] = 2021346701;
        hh.ebbf[805] = -992364305;
        hh.ebbf[806] = -1378709604;
        hh.ebbf[807] = 200439742;
        hh.ebbf[808] = -1867048975;
        hh.ebbf[809] = -1798742562;
        hh.ebbf[810] = -1416350891;
        hh.ebbf[811] = 921159040;
        hh.ebbf[812] = -4190074;
        hh.ebbf[813] = -56652654;
        hh.ebbf[814] = -623324436;
        hh.ebbf[815] = -494685585;
        hh.ebbf[816] = 1541246599;
        hh.ebbf[817] = 1845891971;
        hh.ebbf[818] = 421418639;
        hh.ebbf[819] = -747412342;
        hh.ebbf[820] = 1934431019;
        hh.ebbf[821] = -700918203;
        hh.ebbf[822] = -407751294;
        hh.ebbf[823] = 895202868;
        hh.ebbf[824] = 1586718675;
        hh.ebbf[825] = -291012375;
        hh.ebbf[826] = 15158502;
        hh.ebbf[827] = -863224456;
        hh.ebbf[828] = -1659371090;
        hh.ebbf[829] = -1585898368;
        hh.ebbf[830] = -1120226642;
        hh.ebbf[831] = -716939660;
        hh.ebbf[832] = 621417435;
        hh.ebbf[833] = 1395973158;
        hh.ebbf[834] = 399675300;
        hh.ebbf[835] = -573237741;
        hh.ebbf[836] = 290751707;
        hh.ebbf[837] = -1096114492;
        hh.ebbf[838] = -187656553;
        hh.ebbf[839] = 727858559;
        hh.ebbf[840] = -1432768570;
        hh.ebbf[841] = -1483619570;
        hh.ebbf[842] = -1377141008;
        hh.ebbf[843] = 108290395;
        hh.ebbf[844] = 225800933;
        hh.ebbf[845] = -1570676570;
        hh.ebbf[846] = -929137833;
        hh.ebbf[847] = 198757144;
        hh.ebbf[848] = 2030989172;
        hh.ebbf[849] = 189465010;
        hh.ebbf[850] = -994537180;
        hh.ebbf[851] = -1350149630;
        hh.ebbf[852] = 628561730;
        hh.ebbf[853] = 1360127710;
        hh.ebbf[854] = 1585186643;
        hh.ebbf[855] = -295922289;
        hh.ebbf[856] = -438665024;
        hh.ebbf[857] = 1905036277;
        hh.ebbf[858] = -1392454090;
        hh.ebbf[859] = 1697861316;
        hh.ebbf[860] = -1728013525;
        hh.ebbf[861] = -320742932;
        hh.ebbf[862] = 909624212;
        hh.ebbf[863] = -2113150573;
        hh.ebbf[864] = -1786538824;
        hh.ebbf[865] = -726797837;
        hh.ebbf[866] = -1067244883;
        hh.ebbf[867] = 821141726;
        hh.ebbf[868] = -314891520;
        hh.ebbf[869] = 63238542;
        hh.ebbf[870] = -871572128;
        hh.ebbf[871] = -235902141;
        hh.ebbf[872] = -226536870;
        hh.ebbf[873] = -1734496830;
        hh.ebbf[874] = -1513733144;
        hh.ebbf[875] = 516832086;
        hh.ebbf[876] = -349981056;
        hh.ebbf[877] = 2028569377;
        hh.ebbf[878] = -1974847818;
        hh.ebbf[879] = 94972620;
        hh.ebbf[880] = 2144942608;
        hh.ebbf[881] = 1959237008;
        hh.ebbf[882] = 41276765;
        hh.ebbf[883] = 1277424713;
        hh.ebbf[884] = 1568041689;
        hh.ebbf[885] = -2030969842;
        hh.ebbf[886] = 942222618;
        hh.ebbf[887] = 24136097;
        hh.ebbf[888] = -1712542545;
        hh.ebbf[889] = 1405205908;
        hh.ebbf[890] = 417339463;
        hh.ebbf[891] = -1190382117;
        hh.ebbf[892] = -696615289;
        hh.ebbf[893] = 818454095;
        hh.ebbf[894] = -312679638;
        hh.ebbf[895] = 1541026233;
        hh.ebbf[896] = -610015547;
        hh.ebbf[897] = 339531306;
        hh.ebbf[898] = -650892700;
        hh.ebbf[899] = -473212979;
    }

    private static /* synthetic */ void efnf() {
        hh.ebbf[0] = 1993098549;
        hh.ebbf[1] = 375925020;
        hh.ebbf[2] = -262124041;
        hh.ebbf[3] = 1893722012;
        hh.ebbf[4] = -2124473934;
        hh.ebbf[5] = 1581403223;
        hh.ebbf[6] = 1692630406;
        hh.ebbf[7] = -480242733;
        hh.ebbf[8] = 92175500;
        hh.ebbf[9] = -974285156;
        hh.ebbf[10] = -1925734807;
        hh.ebbf[11] = 194674910;
        hh.ebbf[12] = -558345555;
        hh.ebbf[13] = -1523515618;
        hh.ebbf[14] = 1418032319;
        hh.ebbf[15] = -1413883519;
        hh.ebbf[16] = -1977151309;
        hh.ebbf[17] = 1839572519;
        hh.ebbf[18] = -495394524;
        hh.ebbf[19] = 1487840204;
        hh.ebbf[20] = -1447071219;
        hh.ebbf[21] = 1107717547;
        hh.ebbf[22] = 62931257;
        hh.ebbf[23] = -912238587;
        hh.ebbf[24] = 567598489;
        hh.ebbf[25] = -118911758;
        hh.ebbf[26] = -993475246;
        hh.ebbf[27] = -425040903;
        hh.ebbf[28] = 724754878;
        hh.ebbf[29] = 49714363;
        hh.ebbf[30] = -393621570;
        hh.ebbf[31] = 323984959;
        hh.ebbf[32] = -1245840693;
        hh.ebbf[33] = -524520180;
        hh.ebbf[34] = -406933400;
        hh.ebbf[35] = 783478308;
        hh.ebbf[36] = 134028143;
        hh.ebbf[37] = 1320200691;
        hh.ebbf[38] = -1156623427;
        hh.ebbf[39] = -1890833328;
        hh.ebbf[40] = 1745920952;
        hh.ebbf[41] = 1688159012;
        hh.ebbf[42] = 27112531;
        hh.ebbf[43] = 901545519;
        hh.ebbf[44] = -1850555286;
        hh.ebbf[45] = 601842982;
        hh.ebbf[46] = 1450649532;
        hh.ebbf[47] = 1926607472;
        hh.ebbf[48] = -970425976;
        hh.ebbf[49] = 1534419960;
        hh.ebbf[50] = 1741018842;
        hh.ebbf[51] = -333684215;
        hh.ebbf[52] = -842426608;
        hh.ebbf[53] = -1338386156;
        hh.ebbf[54] = -1013974483;
        hh.ebbf[55] = -263923216;
        hh.ebbf[56] = 1916376722;
        hh.ebbf[57] = 1454334204;
        hh.ebbf[58] = 1150789457;
        hh.ebbf[59] = 1453789020;
        hh.ebbf[60] = -472768962;
        hh.ebbf[61] = 178706978;
        hh.ebbf[62] = -1614328585;
        hh.ebbf[63] = 564536660;
        hh.ebbf[64] = 1868263547;
        hh.ebbf[65] = -1737731805;
        hh.ebbf[66] = 616834442;
        hh.ebbf[67] = 13387540;
        hh.ebbf[68] = -1572979076;
        hh.ebbf[69] = -902497939;
        hh.ebbf[70] = 1140933435;
        hh.ebbf[71] = -735847955;
        hh.ebbf[72] = -300054077;
        hh.ebbf[73] = 1428740355;
        hh.ebbf[74] = -1623001050;
        hh.ebbf[75] = -211596506;
        hh.ebbf[76] = 1887342976;
        hh.ebbf[77] = -370603237;
        hh.ebbf[78] = 673955855;
        hh.ebbf[79] = 957414985;
        hh.ebbf[80] = 1393555060;
        hh.ebbf[81] = 1864219372;
        hh.ebbf[82] = 1214837325;
        hh.ebbf[83] = 1880695117;
        hh.ebbf[84] = 1417711978;
        hh.ebbf[85] = -1482342486;
        hh.ebbf[86] = 27711015;
        hh.ebbf[87] = -1985518109;
        hh.ebbf[88] = -170333030;
        hh.ebbf[89] = -314429858;
        hh.ebbf[90] = 64783386;
        hh.ebbf[91] = -739068519;
        hh.ebbf[92] = -1773606790;
        hh.ebbf[93] = 1174435572;
        hh.ebbf[94] = -1072003169;
        hh.ebbf[95] = -948231255;
        hh.ebbf[96] = -1037497471;
        hh.ebbf[97] = -1259896540;
        hh.ebbf[98] = 1307448079;
        hh.ebbf[99] = 1375380251;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private oc createOneTickSettings() {
        block92: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("edix", ebes(int ), (int)432)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == hh.ebbh("ediy", ebbe(int ), (int)645)) break;
                v0 /* !! */  = (long)hh.ebbh("ediz", ebbe(int ), (int)646);
            }
            var3_1 = hh.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("edja", ebes(int ), (int)433)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == hh.ebbh("edjb", ebbe(int ), (int)647)) break;
                v1 /* !! */  = (long)hh.ebbh("edjc", ebbe(int ), (int)648);
            }
            var2_2 = hh.b;
            v2 /* !! */  = hh.kf;
            if (true) ** GOTO lbl17
            block64: while (true) {
                v2 /* !! */  = (long)(v3 - hh.ebbh("edjd", ebes(int ), (int)434));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1618367353: {
                        v3 = hh.ebbh("edje", ebes(int ), (int)435);
                        continue block64;
                    }
                    case -868398377: {
                        v3 = hh.ebbh("edjf", ebes(int ), (int)436);
                        continue block64;
                    }
                    case 672168633: {
                        break block64;
                    }
                    case 1167112384: {
                        v3 = hh.ebbh("edjg", ebes(int ), (int)437);
                        continue block64;
                    }
                }
                break;
            }
            var1_3 = hh.a;
            if (var3_1) {
                throw null;
lbl32:
                // 3 sources

                return null;
            }
            if (var1_3 || var1_3) ** GOTO lbl32
            v4 /* !! */  = hh.kf;
            if (true) ** GOTO lbl39
            block66: while (true) {
                v4 /* !! */  = (long)(v5 - hh.ebbh("edjh", ebes(int ), (int)438));
lbl39:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1651021765: {
                        v5 = hh.ebbh("edji", ebes(int ), (int)439);
                        continue block66;
                    }
                    case -56324676: {
                        v5 = hh.ebbh("edjj", ebes(int ), (int)440);
                        continue block66;
                    }
                    case 165530156: {
                        v5 = hh.ebbh("edjk", ebes(int ), (int)441);
                        continue block66;
                    }
                    case 672168633: {
                        break block66;
                    }
                }
                break;
            }
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("edjl", ebes(int ), (int)442)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == hh.ebbh("edjm", ebbe(int ), (int)649)) break;
                v6 /* !! */  = (long)hh.ebbh("edjn", ebbe(int ), (int)650);
            }
            if (!this.swapMode.isSelected("ReallyWorld")) break block92;
            if (var1_3 || var1_3) ** GOTO lbl32
            v7 /* !! */  = hh.kf;
            if (true) ** GOTO lbl62
            block68: while (true) {
                v7 /* !! */  = (long)(hh.ebbh("edjp", ebes(int ), (int)444) - hh.ebbh("edjo", ebes(int ), (int)443));
lbl62:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case 672168633: {
                        break block68;
                    }
                    case 1060391534: {
                        continue block68;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = hh.kf - hh.ebbh("edjq", ebes(int ), (int)445)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == hh.ebbh("edjr", ebbe(int ), (int)651)) break;
                v8 /* !! */  = (long)hh.ebbh("edjs", ebbe(int ), (int)652);
            }
            v9 = new oc();
            v10 = hh.ebbh("edjt", ebbe(int ), (int)653);
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_4 = hh.kf - hh.ebbh("edju", ebes(int ), (int)446)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == hh.ebbh("edjv", ebbe(int ), (int)654)) break;
                v11 /* !! */  = (long)hh.ebbh("edjw", ebbe(int ), (int)655);
            }
            v12 = v9.stopMovement((boolean)v10);
            v13 = hh.ebbh("edjx", ebbe(int ), (int)656);
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_5 = hh.kf - hh.ebbh("edjy", ebes(int ), (int)447)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == hh.ebbh("edjz", ebbe(int ), (int)657)) break;
                v14 /* !! */  = (long)hh.ebbh("edka", ebbe(int ), (int)658);
            }
            v15 = v12.stopSprint((boolean)v13);
            v16 = hh.ebbh("edkb", ebbe(int ), (int)659);
            v17 /* !! */  = hh.kf;
            if (true) ** GOTO lbl92
            block72: while (true) {
                v17 /* !! */  = (long)(v18 - hh.ebbh("edkc", ebes(int ), (int)448));
lbl92:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -1312140440: {
                        v18 = hh.ebbh("edkd", ebes(int ), (int)449);
                        continue block72;
                    }
                    case -717409743: {
                        v18 = hh.ebbh("edke", ebes(int ), (int)450);
                        continue block72;
                    }
                    case 672168633: {
                        break block72;
                    }
                    case 1821607349: {
                        v18 = hh.ebbh("edkf", ebes(int ), (int)451);
                        continue block72;
                    }
                }
                break;
            }
            v19 = v15.closeInventory((boolean)v16);
            v20 = hh.ebbh("edkg", ebbe(int ), (int)660);
            v21 = hh.ebbh("edkh", ebbe(int ), (int)661);
            while (true) {
                if ((v22 /* !! */  = (cfr_temp_6 = hh.kf - hh.ebbh("edki", ebes(int ), (int)452)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v22 /* !! */  == hh.ebbh("edkj", ebbe(int ), (int)662)) break;
                v22 /* !! */  = (long)hh.ebbh("edkk", ebbe(int ), (int)663);
            }
            v23 = v19.preStopDelay((int)v20, (int)v21);
            v24 = hh.ebbh("edkl", ebbe(int ), (int)664);
            v25 = hh.ebbh("edkm", ebbe(int ), (int)665);
            v26 /* !! */  = hh.kf;
            if (true) ** GOTO lbl119
            block74: while (true) {
                v26 /* !! */  = (long)(v27 - hh.ebbh("edkn", ebes(int ), (int)453));
lbl119:
                // 2 sources

                switch ((int)v26 /* !! */ ) {
                    case -1587777624: {
                        v27 = hh.ebbh("edko", ebes(int ), (int)454);
                        continue block74;
                    }
                    case 672168633: {
                        break block74;
                    }
                    case 806826772: {
                        v27 = hh.ebbh("edkp", ebes(int ), (int)455);
                        continue block74;
                    }
                    case 930235029: {
                        v27 = hh.ebbh("edkq", ebes(int ), (int)456);
                        continue block74;
                    }
                }
                break;
            }
            v28 = v23.waitStopDelay((int)v24, (int)v25);
            v29 = hh.ebbh("edkr", ebbe(int ), (int)666);
            v30 /* !! */  = hh.kf;
            if (true) ** GOTO lbl137
            block75: while (true) {
                v30 /* !! */  = (long)(v31 - hh.ebbh("edkt", ebes(int ), (int)457));
lbl137:
                // 2 sources

                switch ((int)v30 /* !! */ ) {
                    case -1103444979: {
                        v31 = hh.ebbh("edku", ebes(int ), (int)458);
                        continue block75;
                    }
                    case -794606763: {
                        v31 = hh.ebbh("edkv", ebes(int ), (int)459);
                        continue block75;
                    }
                    case 672168633: {
                        break block75;
                    }
                }
                break;
            }
            v32 = v28.minimumStopDelay((int)v29);
            v33 = hh.ebbh("edkw", ebbe(int ), (int)667);
            v34 = hh.ebbh("edkx", ebbe(int ), (int)668);
            while (true) {
                if ((v35 /* !! */  = (cfr_temp_7 = hh.kf - hh.ebbh("edky", ebes(int ), (int)460)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v35 /* !! */  == hh.ebbh("edlg", ebbe(int ), (int)669)) break;
                v35 /* !! */  = (long)hh.ebbh("edlh", ebbe(int ), (int)670);
            }
            v36 = v32.preSwapDelay((int)v33, (int)v34);
            v37 = hh.ebbh("edli", ebbe(int ), (int)671);
            v38 = hh.ebbh("edlj", ebbe(int ), (int)672);
            while (true) {
                if ((v39 /* !! */  = (cfr_temp_8 = hh.kf - hh.ebbh("edlk", ebes(int ), (int)461)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v39 /* !! */  == hh.ebbh("edll", ebbe(int ), (int)673)) break;
                v39 /* !! */  = (long)hh.ebbh("edlm", ebbe(int ), (int)674);
            }
            v40 = v36.postSwapDelay((int)v37, (int)v38);
            v41 = hh.ebbh("edls", ebbe(int ), (int)675);
            v42 = hh.ebbh("edlt", ebbe(int ), (int)676);
            v43 /* !! */  = hh.kf;
            if (true) ** GOTO lbl169
            block78: while (true) {
                v43 /* !! */  = (long)(v44 - hh.ebbh("edlv", ebes(int ), (int)462));
lbl169:
                // 2 sources

                switch ((int)v43 /* !! */ ) {
                    case -850649316: {
                        v44 = hh.ebbh("edlw", ebes(int ), (int)463);
                        continue block78;
                    }
                    case 672168633: {
                        break block78;
                    }
                    case 756344188: {
                        v44 = hh.ebbh("edlx", ebes(int ), (int)464);
                        continue block78;
                    }
                }
                break;
            }
            return v40.resumeDelay((int)v41, (int)v42);
        }
        ** while (var1_3 || var1_3)
lbl181:
        // 1 sources

        while (true) {
            if ((v45 /* !! */  = (cfr_temp_9 = hh.kf - hh.ebbh("edly", ebes(int ), (int)465)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v45 /* !! */  == hh.ebbh("edlz", ebbe(int ), (int)677)) break;
            v45 /* !! */  = (long)hh.ebbh("edmh", ebbe(int ), (int)678);
        }
        while (true) {
            if ((v46 /* !! */  = (cfr_temp_10 = hh.kf - hh.ebbh("edmi", ebes(int ), (int)466)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v46 /* !! */  == hh.ebbh("edmj", ebbe(int ), (int)679)) break;
            v46 /* !! */  = (long)hh.ebbh("edmk", ebbe(int ), (int)680);
        }
        v47 = new oc();
        v48 = hh.ebbh("edml", ebbe(int ), (int)681);
        v49 /* !! */  = hh.kf;
        if (true) ** GOTO lbl197
        block81: while (true) {
            v49 /* !! */  = (long)(v50 - hh.ebbh("edmm", ebes(int ), (int)467));
lbl197:
            // 2 sources

            switch ((int)v49 /* !! */ ) {
                case -1928129799: {
                    v50 = hh.ebbh("edmo", ebes(int ), (int)468);
                    continue block81;
                }
                case 283666187: {
                    v50 = hh.ebbh("edmv", ebes(int ), (int)469);
                    continue block81;
                }
                case 672168633: {
                    break block81;
                }
            }
            break;
        }
        v51 = v47.stopMovement((boolean)v48);
        v52 = hh.ebbh("edmw", ebbe(int ), (int)682);
        while (true) {
            if ((v53 /* !! */  = (cfr_temp_11 = hh.kf - hh.ebbh("edmx", ebes(int ), (int)470)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v53 /* !! */  == hh.ebbh("edmy", ebbe(int ), (int)683)) break;
            v53 /* !! */  = (long)hh.ebbh("edna", ebbe(int ), (int)684);
        }
        v54 = v51.stopSprint((boolean)v52);
        v55 = hh.ebbh("ednc", ebbe(int ), (int)685);
        while (true) {
            if ((v56 /* !! */  = (cfr_temp_12 = hh.kf - hh.ebbh("edne", ebes(int ), (int)471)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
            if (v56 /* !! */  == hh.ebbh("edni", ebbe(int ), (int)686)) break;
            v56 /* !! */  = (long)hh.ebbh("ednj", ebbe(int ), (int)687);
        }
        v57 = v54.closeInventory((boolean)v55);
        v58 = hh.ebbh("ednk", ebbe(int ), (int)688);
        v59 = hh.ebbh("ednm", ebbe(int ), (int)689);
        v60 /* !! */  = hh.kf;
        if (true) ** GOTO lbl227
        block84: while (true) {
            v60 /* !! */  = (long)(v61 - hh.ebbh("edno", ebes(int ), (int)472));
lbl227:
            // 2 sources

            switch ((int)v60 /* !! */ ) {
                case -2122054149: {
                    v61 = hh.ebbh("edns", ebes(int ), (int)473);
                    continue block84;
                }
                case -1014139253: {
                    v61 = hh.ebbh("ednu", ebes(int ), (int)474);
                    continue block84;
                }
                case 672168633: {
                    break block84;
                }
                case 984961090: {
                    v61 = hh.ebbh("edoc", ebes(int ), (int)475);
                    continue block84;
                }
            }
            break;
        }
        v62 = v57.preStopDelay((int)v58, (int)v59);
        v63 = hh.ebbh("edod", ebbe(int ), (int)690);
        v64 = hh.ebbh("edof", ebbe(int ), (int)691);
        v65 /* !! */  = hh.kf;
        if (true) ** GOTO lbl246
        block85: while (true) {
            v65 /* !! */  = (long)(hh.ebbh("edom", ebes(int ), (int)477) - hh.ebbh("edoi", ebes(int ), (int)476));
lbl246:
            // 2 sources

            switch ((int)v65 /* !! */ ) {
                case 672168633: {
                    break block85;
                }
                case 1699736247: {
                    continue block85;
                }
            }
            break;
        }
        v66 = v62.waitStopDelay((int)v63, (int)v64);
        v67 = hh.ebbh("edoo", ebbe(int ), (int)692);
        while (true) {
            if ((v68 /* !! */  = (cfr_temp_13 = hh.kf - hh.ebbh("edot", ebes(int ), (int)478)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
            if (v68 /* !! */  == hh.ebbh("edou", ebbe(int ), (int)693)) break;
            v68 /* !! */  = (long)hh.ebbh("edov", ebbe(int ), (int)694);
        }
        v69 = v66.minimumStopDelay((int)v67);
        v70 = hh.ebbh("edoz", ebbe(int ), (int)695);
        v71 = hh.ebbh("edpb", ebbe(int ), (int)696);
        v72 /* !! */  = hh.kf;
        if (true) ** GOTO lbl265
        block87: while (true) {
            v72 /* !! */  = (long)(v73 - hh.ebbh("edpe", ebes(int ), (int)479));
lbl265:
            // 2 sources

            switch ((int)v72 /* !! */ ) {
                case -1091119817: {
                    v73 = hh.ebbh("edpg", ebes(int ), (int)480);
                    continue block87;
                }
                case 672168633: {
                    break block87;
                }
                case 1101780077: {
                    v73 = hh.ebbh("edpk", ebes(int ), (int)481);
                    continue block87;
                }
            }
            break;
        }
        v74 = v69.preSwapDelay((int)v70, (int)v71);
        v75 = hh.ebbh("edpl", ebbe(int ), (int)697);
        v76 = hh.ebbh("edpm", ebbe(int ), (int)698);
        while (true) {
            if ((v77 /* !! */  = (cfr_temp_14 = hh.kf - hh.ebbh("edpp", ebes(int ), (int)482)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
            if (v77 /* !! */  == hh.ebbh("edps", ebbe(int ), (int)699)) break;
            v77 /* !! */  = (long)hh.ebbh("edpt", ebbe(int ), (int)700);
        }
        v78 = v74.postSwapDelay((int)v75, (int)v76);
        v79 = hh.ebbh("edpu", ebbe(int ), (int)701);
        v80 = hh.ebbh("edpz", ebbe(int ), (int)702);
        while (true) {
            if ((v81 /* !! */  = (cfr_temp_15 = hh.kf - hh.ebbh("edqb", ebes(int ), (int)483)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
            if (v81 /* !! */  == hh.ebbh("edqd", ebbe(int ), (int)703)) break;
            v81 /* !! */  = (long)hh.ebbh("edqe", ebbe(int ), (int)704);
        }
        v82 = v78.resumeDelay((int)v79, (int)v80);
        v83 = hh.ebbh("edqh", edqf(int ), (int)484);
        v84 /* !! */  = hh.kf;
        if (true) ** GOTO lbl296
        block90: while (true) {
            v84 /* !! */  = (long)(hh.ebbh("edqk", ebes(int ), (int)486) - hh.ebbh("edqi", ebes(int ), (int)485));
lbl296:
            // 2 sources

            switch ((int)v84 /* !! */ ) {
                case 408763729: {
                    continue block90;
                }
                case 672168633: {
                    break block90;
                }
            }
            break;
        }
        return v82.velocityThreshold((double)v83);
    }

    public static /* synthetic */ CallSite ebbh(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void efng() {
        hh.ebbf[100] = -1419975411;
        hh.ebbf[101] = 1088869911;
        hh.ebbf[102] = 667900519;
        hh.ebbf[103] = 1064031426;
        hh.ebbf[104] = -402654572;
        hh.ebbf[105] = 224021402;
        hh.ebbf[106] = -1502515806;
        hh.ebbf[107] = -783981696;
        hh.ebbf[108] = 556003745;
        hh.ebbf[109] = -1044657889;
        hh.ebbf[110] = 414431017;
        hh.ebbf[111] = 1576601292;
        hh.ebbf[112] = 1256495438;
        hh.ebbf[113] = -937115115;
        hh.ebbf[114] = -754895465;
        hh.ebbf[115] = 1096155177;
        hh.ebbf[116] = 1119755008;
        hh.ebbf[117] = 783296643;
        hh.ebbf[118] = -1166712342;
        hh.ebbf[119] = -1456013316;
        hh.ebbf[120] = -1292916638;
        hh.ebbf[121] = -1742365654;
        hh.ebbf[122] = 1366732059;
        hh.ebbf[123] = 775130517;
        hh.ebbf[124] = 541826761;
        hh.ebbf[125] = 1154276036;
        hh.ebbf[126] = 400252127;
        hh.ebbf[127] = -2058676953;
        hh.ebbf[128] = 730659944;
        hh.ebbf[129] = 891051983;
        hh.ebbf[130] = 279853205;
        hh.ebbf[131] = 973499866;
        hh.ebbf[132] = 430485568;
        hh.ebbf[133] = 440024078;
        hh.ebbf[134] = 1660352240;
        hh.ebbf[135] = -1645379911;
        hh.ebbf[136] = 466994589;
        hh.ebbf[137] = 2049902294;
        hh.ebbf[138] = 1095660024;
        hh.ebbf[139] = 166777654;
        hh.ebbf[140] = 1349448286;
        hh.ebbf[141] = 708108563;
        hh.ebbf[142] = -2003403250;
        hh.ebbf[143] = -397663546;
        hh.ebbf[144] = 104469883;
        hh.ebbf[145] = 1265296833;
        hh.ebbf[146] = 1253323549;
        hh.ebbf[147] = 771713732;
        hh.ebbf[148] = 489781605;
        hh.ebbf[149] = -973007364;
        hh.ebbf[150] = 2100862384;
        hh.ebbf[151] = 9272779;
        hh.ebbf[152] = 177934731;
        hh.ebbf[153] = 1808726701;
        hh.ebbf[154] = -1276940682;
        hh.ebbf[155] = 1824615828;
        hh.ebbf[156] = -181959004;
        hh.ebbf[157] = -1493549867;
        hh.ebbf[158] = -1043509004;
        hh.ebbf[159] = -920178773;
        hh.ebbf[160] = 245326477;
        hh.ebbf[161] = -1694572596;
        hh.ebbf[162] = -1997732671;
        hh.ebbf[163] = 466871008;
        hh.ebbf[164] = -1073543429;
        hh.ebbf[165] = -872811422;
        hh.ebbf[166] = -594135115;
        hh.ebbf[167] = -1996137992;
        hh.ebbf[168] = -1604616819;
        hh.ebbf[169] = -316650958;
        hh.ebbf[170] = 224791060;
        hh.ebbf[171] = -1061001290;
        hh.ebbf[172] = -463124189;
        hh.ebbf[173] = -1344671401;
        hh.ebbf[174] = 45529669;
        hh.ebbf[175] = -120902356;
        hh.ebbf[176] = 2095960961;
        hh.ebbf[177] = 1270750671;
        hh.ebbf[178] = 528445311;
        hh.ebbf[179] = 499103599;
        hh.ebbf[180] = 142878816;
        hh.ebbf[181] = 1343078694;
        hh.ebbf[182] = 1771463608;
        hh.ebbf[183] = -1311059747;
        hh.ebbf[184] = -1446064776;
        hh.ebbf[185] = 2103844233;
        hh.ebbf[186] = 1368229010;
        hh.ebbf[187] = -1188629906;
        hh.ebbf[188] = -1393516729;
        hh.ebbf[189] = 2138533405;
        hh.ebbf[190] = -1196874735;
        hh.ebbf[191] = -1166705823;
        hh.ebbf[192] = -1138503479;
        hh.ebbf[193] = 1773224886;
        hh.ebbf[194] = 328202462;
        hh.ebbf[195] = -307288351;
        hh.ebbf[196] = 1706945858;
        hh.ebbf[197] = -519488307;
        hh.ebbf[198] = -1795455326;
        hh.ebbf[199] = 521556309;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private /* synthetic */ Boolean lambda$new$3() {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = kf - hh.ebbh("eecn", ebes(int ), (int)611)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == hh.ebbh("eeco", ebbe(int ), (int)893)) break;
            object = hh.ebbh("eecp", ebbe(int ), (int)894);
        }
        boolean bl2 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = kf - hh.ebbh("eecq", ebes(int ), (int)612)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == hh.ebbh("eecr", ebbe(int ), (int)895)) break;
            object = hh.ebbh("eecs", ebbe(int ), (int)896);
        }
        int n2 = b;
        Object object = kf;
        block21: while (true) {
            switch ((int)object) {
                case 672168633: {
                    break block21;
                }
                case 1562417744: {
                    object = hh.ebbh("eecu", ebes(int ), (int)614) - hh.ebbh("eect", ebes(int ), (int)613);
                    continue block21;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return null;
        if (bl3) return null;
        Object object2 = kf;
        boolean bl4 = true;
        block22: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - hh.ebbh("eecv", ebes(int ), (int)615);
            }
            switch ((int)object2) {
                case -2143587964: {
                    callSite = hh.ebbh("eecw", ebes(int ), (int)616);
                    continue block22;
                }
                case -1373998308: {
                    callSite = hh.ebbh("eecx", ebes(int ), (int)617);
                    continue block22;
                }
                case -289026838: {
                    callSite = hh.ebbh("eecy", ebes(int ), (int)618);
                    continue block22;
                }
                case 672168633: {
                    break block22;
                }
            }
            break;
        }
        Object object3 = kf;
        block23: while (true) {
            switch ((int)object3) {
                case 242782781: {
                    object3 = hh.ebbh("eeda", ebes(int ), (int)620) - hh.ebbh("eecz", ebes(int ), (int)619);
                    continue block23;
                }
                case 672168633: {
                    break block23;
                }
            }
            break;
        }
        boolean bl5 = this.mode.isSelected("\u041e\u0431\u044b\u0447\u043d\u044b\u0439");
        Object object4 = kf;
        boolean bl6 = true;
        block24: while (true) {
            CallSite callSite;
            if (!bl6 || (bl6 = false) || !true) {
                object4 = callSite - hh.ebbh("eedb", ebes(int ), (int)621);
            }
            switch ((int)object4) {
                case -585318295: {
                    callSite = hh.ebbh("eedc", ebes(int ), (int)622);
                    continue block24;
                }
                case 672168633: {
                    return bl5;
                }
                case 1253088531: {
                    callSite = hh.ebbh("eedd", ebes(int ), (int)623);
                    continue block24;
                }
            }
            break;
        }
        return bl5;
    }

    private static /* synthetic */ void efog() {
        hh.ebeu[0] = 3740710127606429708L;
        hh.ebeu[1] = -6280391958847632057L;
        hh.ebeu[2] = 3690319260897542314L;
        hh.ebeu[3] = 5510196696403002508L;
        hh.ebeu[4] = -692701950693091659L;
        hh.ebeu[5] = 3497454947259484400L;
        hh.ebeu[6] = 2254534092831894670L;
        hh.ebeu[7] = 6126519423432584245L;
        hh.ebeu[8] = -1144132563110007855L;
        hh.ebeu[9] = -160172033624385499L;
        hh.ebeu[10] = -3828251093984944192L;
        hh.ebeu[11] = -7375911693771253669L;
        hh.ebeu[12] = 6031490087119740660L;
        hh.ebeu[13] = -5581789193427657191L;
        hh.ebeu[14] = -2019736612958081703L;
        hh.ebeu[15] = -367162662924953312L;
        hh.ebeu[16] = 4348201653054900001L;
        hh.ebeu[17] = -6383872919911436355L;
        hh.ebeu[18] = 8688147773764085797L;
        hh.ebeu[19] = 516634993820490115L;
        hh.ebeu[20] = 8092853664623186482L;
        hh.ebeu[21] = -984418571525174340L;
        hh.ebeu[22] = 2625204263651324718L;
        hh.ebeu[23] = -6345928933464884816L;
        hh.ebeu[24] = -8130100749110543841L;
        hh.ebeu[25] = 4464048556105374049L;
        hh.ebeu[26] = 8806195364139311948L;
        hh.ebeu[27] = -2390316992579584944L;
        hh.ebeu[28] = -595805972515872697L;
        hh.ebeu[29] = 4133957162268320031L;
        hh.ebeu[30] = -1877944062427202514L;
        hh.ebeu[31] = -5571140313940345993L;
        hh.ebeu[32] = -7932217311674761171L;
        hh.ebeu[33] = 8333018444672800299L;
        hh.ebeu[34] = 982127261922663494L;
        hh.ebeu[35] = 6068387870266431572L;
        hh.ebeu[36] = -4264304209385992096L;
        hh.ebeu[37] = 6710662303754932556L;
        hh.ebeu[38] = 3902551972731972638L;
        hh.ebeu[39] = 597630895610313916L;
        hh.ebeu[40] = -3797023615440785477L;
        hh.ebeu[41] = -842675474512732703L;
        hh.ebeu[42] = 7329521131642538067L;
        hh.ebeu[43] = -3299015736912374504L;
        hh.ebeu[44] = 7506616947022305091L;
        hh.ebeu[45] = -4897502503988175723L;
        hh.ebeu[46] = 3145062317672683324L;
        hh.ebeu[47] = -5997232821299596427L;
        hh.ebeu[48] = -5986902078221965246L;
        hh.ebeu[49] = -7712969784002348214L;
        hh.ebeu[50] = -6112178314670752236L;
        hh.ebeu[51] = 3361145295584641854L;
        hh.ebeu[52] = -6692102602281670794L;
        hh.ebeu[53] = -1259312221504448515L;
        hh.ebeu[54] = -922565308459280657L;
        hh.ebeu[55] = 3330181198634982844L;
        hh.ebeu[56] = 316577063206303844L;
        hh.ebeu[57] = 3773805645807884412L;
        hh.ebeu[58] = 6377479750518127875L;
        hh.ebeu[59] = 6358714803170194575L;
        hh.ebeu[60] = -1476789594078822046L;
        hh.ebeu[61] = 8399532732093886951L;
        hh.ebeu[62] = 5421582050248712285L;
        hh.ebeu[63] = 5928009001173913961L;
        hh.ebeu[64] = -7673685299730255247L;
        hh.ebeu[65] = 2646091834597099031L;
        hh.ebeu[66] = 5228995767981423951L;
        hh.ebeu[67] = 5961649569819709593L;
        hh.ebeu[68] = 624650475351299928L;
        hh.ebeu[69] = 8350111099910263156L;
        hh.ebeu[70] = -944669615608326254L;
        hh.ebeu[71] = 859740476333850802L;
        hh.ebeu[72] = 3158191070950920177L;
        hh.ebeu[73] = 6016667458122546113L;
        hh.ebeu[74] = -3114894968716105768L;
        hh.ebeu[75] = 3178961426068817126L;
        hh.ebeu[76] = 157357423294230087L;
        hh.ebeu[77] = 5741559471457814888L;
        hh.ebeu[78] = 1227062755436557955L;
        hh.ebeu[79] = 3866481240949585571L;
        hh.ebeu[80] = -3889327992158600279L;
        hh.ebeu[81] = -8139118308579752342L;
        hh.ebeu[82] = 8305922504762275165L;
        hh.ebeu[83] = -2009148508836696525L;
        hh.ebeu[84] = 729801406965358461L;
        hh.ebeu[85] = -2868963402243509617L;
        hh.ebeu[86] = -1854815308770078879L;
        hh.ebeu[87] = -4727190640078483767L;
        hh.ebeu[88] = 4628053204345148896L;
        hh.ebeu[89] = -5129224659564112939L;
        hh.ebeu[90] = 3851908595743449984L;
        hh.ebeu[91] = -2703760830786128785L;
        hh.ebeu[92] = 2266742132997008191L;
        hh.ebeu[93] = -8718709459928764540L;
        hh.ebeu[94] = 4444792476884239548L;
        hh.ebeu[95] = 6240735034068828375L;
        hh.ebeu[96] = 8068171689866562613L;
        hh.ebeu[97] = -2706150343702241559L;
        hh.ebeu[98] = -1742072054508798231L;
        hh.ebeu[99] = -7862626237293994128L;
    }

    private static /* synthetic */ long ebes(int n2) {
        return ebet[n2] ^ ebeu[n2];
    }

    private static /* synthetic */ void efnx() {
        hh.ebbg[800] = 622942958;
        hh.ebbg[801] = 1925205803;
        hh.ebbg[802] = -873149352;
        hh.ebbg[803] = -1557920948;
        hh.ebbg[804] = -509963682;
        hh.ebbg[805] = -992364306;
        hh.ebbg[806] = 1521295899;
        hh.ebbg[807] = -200439743;
        hh.ebbg[808] = -1867048983;
        hh.ebbg[809] = -1798742561;
        hh.ebbg[810] = -1416350894;
        hh.ebbg[811] = 921159064;
        hh.ebbg[812] = -4190073;
        hh.ebbg[813] = -56652656;
        hh.ebbg[814] = -623324436;
        hh.ebbg[815] = -494685597;
        hh.ebbg[816] = 1541246609;
        hh.ebbg[817] = 1845891980;
        hh.ebbg[818] = 421418625;
        hh.ebbg[819] = -747412334;
        hh.ebbg[820] = 1934431033;
        hh.ebbg[821] = -700918187;
        hh.ebbg[822] = -407751273;
        hh.ebbg[823] = 895202872;
        hh.ebbg[824] = 1586718663;
        hh.ebbg[825] = -291012359;
        hh.ebbg[826] = 15158509;
        hh.ebbg[827] = -863224465;
        hh.ebbg[828] = -1659371093;
        hh.ebbg[829] = -1585898349;
        hh.ebbg[830] = -1120226644;
        hh.ebbg[831] = -716939656;
        hh.ebbg[832] = 621417429;
        hh.ebbg[833] = 1395973159;
        hh.ebbg[834] = 2037702980;
        hh.ebbg[835] = -573237742;
        hh.ebbg[836] = -1014830336;
        hh.ebbg[837] = -1096114491;
        hh.ebbg[838] = -187656554;
        hh.ebbg[839] = -278873603;
        hh.ebbg[840] = 1432768569;
        hh.ebbg[841] = -2041281166;
        hh.ebbg[842] = -1377141007;
        hh.ebbg[843] = 108290395;
        hh.ebbg[844] = 225800933;
        hh.ebbg[845] = -1570676571;
        hh.ebbg[846] = -929137835;
        hh.ebbg[847] = 198757148;
        hh.ebbg[848] = 2030989180;
        hh.ebbg[849] = 189465015;
        hh.ebbg[850] = -994537177;
        hh.ebbg[851] = -1350149630;
        hh.ebbg[852] = 628561728;
        hh.ebbg[853] = 1360127707;
        hh.ebbg[854] = 1585186643;
        hh.ebbg[855] = 295922288;
        hh.ebbg[856] = -438665023;
        hh.ebbg[857] = 1905036277;
        hh.ebbg[858] = -1392454096;
        hh.ebbg[859] = 1697861324;
        hh.ebbg[860] = -1728013527;
        hh.ebbg[861] = -320742930;
        hh.ebbg[862] = 909624212;
        hh.ebbg[863] = -2113150573;
        hh.ebbg[864] = -1786538820;
        hh.ebbg[865] = -726797840;
        hh.ebbg[866] = -1067244886;
        hh.ebbg[867] = 821141727;
        hh.ebbg[868] = 514284828;
        hh.ebbg[869] = 63238543;
        hh.ebbg[870] = -968139829;
        hh.ebbg[871] = -235902142;
        hh.ebbg[872] = -1984806561;
        hh.ebbg[873] = -1734496826;
        hh.ebbg[874] = -1513733143;
        hh.ebbg[875] = 516832087;
        hh.ebbg[876] = -349981052;
        hh.ebbg[877] = 2028569376;
        hh.ebbg[878] = -1974847820;
        hh.ebbg[879] = 94972618;
        hh.ebbg[880] = 2144942611;
        hh.ebbg[881] = 1959237009;
        hh.ebbg[882] = 1981632166;
        hh.ebbg[883] = 1277424712;
        hh.ebbg[884] = -1330156178;
        hh.ebbg[885] = -2030969841;
        hh.ebbg[886] = -257699261;
        hh.ebbg[887] = 24136096;
        hh.ebbg[888] = 1153890711;
        hh.ebbg[889] = 1405205911;
        hh.ebbg[890] = 417339463;
        hh.ebbg[891] = -1190382118;
        hh.ebbg[892] = -696615292;
        hh.ebbg[893] = 818454094;
        hh.ebbg[894] = 1739614806;
        hh.ebbg[895] = 1541026232;
        hh.ebbg[896] = -1158426951;
        hh.ebbg[897] = 339531306;
        hh.ebbg[898] = -650892699;
        hh.ebbg[899] = -473212980;
    }

    private static /* synthetic */ void efob() {
        hh.ebet[200] = -7254037576109630487L;
        hh.ebet[201] = -984126204473298315L;
        hh.ebet[202] = 2061049527747624314L;
        hh.ebet[203] = 3555667917984865427L;
        hh.ebet[204] = -1336270833296846981L;
        hh.ebet[205] = 2559295703058651699L;
        hh.ebet[206] = 5600392804456153924L;
        hh.ebet[207] = 6550932637588532261L;
        hh.ebet[208] = -5472107705930623246L;
        hh.ebet[209] = -7303592853100397542L;
        hh.ebet[210] = -6880558757842437196L;
        hh.ebet[211] = -2253227979977153105L;
        hh.ebet[212] = -6516601103819537181L;
        hh.ebet[213] = -3868786735080746704L;
        hh.ebet[214] = -4563917944545214635L;
        hh.ebet[215] = 8686826721520102247L;
        hh.ebet[216] = 5521261810985299292L;
        hh.ebet[217] = -933554196745623479L;
        hh.ebet[218] = -158283662828100305L;
        hh.ebet[219] = -6734986910488327655L;
        hh.ebet[220] = -4836675821953840690L;
        hh.ebet[221] = 1079009349302326084L;
        hh.ebet[222] = -8873964206270576081L;
        hh.ebet[223] = 1427992644920156129L;
        hh.ebet[224] = 4940670384486894953L;
        hh.ebet[225] = 4787914951496488958L;
        hh.ebet[226] = -3544410738360095925L;
        hh.ebet[227] = -9127507041356074155L;
        hh.ebet[228] = -7819516426625777110L;
        hh.ebet[229] = 57552016232128591L;
        hh.ebet[230] = -3858102089433613900L;
        hh.ebet[231] = -26611084817536206L;
        hh.ebet[232] = -1359527670087961830L;
        hh.ebet[233] = -1575725646372460176L;
        hh.ebet[234] = -4183256297332674733L;
        hh.ebet[235] = -799990277097801215L;
        hh.ebet[236] = 3355315277770755820L;
        hh.ebet[237] = -4104564282337857350L;
        hh.ebet[238] = -1870472182484563415L;
        hh.ebet[239] = -3072597406956137180L;
        hh.ebet[240] = -4911313158925849992L;
        hh.ebet[241] = -7033200472129897517L;
        hh.ebet[242] = 1470241332701618470L;
        hh.ebet[243] = -4599978745590311988L;
        hh.ebet[244] = -4753456803777571382L;
        hh.ebet[245] = 286215107513961483L;
        hh.ebet[246] = -7125989312974758529L;
        hh.ebet[247] = 662505764894987163L;
        hh.ebet[248] = -7432020308530302592L;
        hh.ebet[249] = 2057631069770955798L;
        hh.ebet[250] = -1733706855076881494L;
        hh.ebet[251] = -3087373178547946776L;
        hh.ebet[252] = -1699156838622437579L;
        hh.ebet[253] = 3318810038923794441L;
        hh.ebet[254] = 6670338906427036971L;
        hh.ebet[255] = 5243679495816453205L;
        hh.ebet[256] = -2470323374578172250L;
        hh.ebet[257] = 258394411419329368L;
        hh.ebet[258] = 4040067308592921779L;
        hh.ebet[259] = -6226185337071951601L;
        hh.ebet[260] = 6902132003476495376L;
        hh.ebet[261] = -1376251113650557695L;
        hh.ebet[262] = 995230195695135817L;
        hh.ebet[263] = -4931961417390300216L;
        hh.ebet[264] = 7189162346907006103L;
        hh.ebet[265] = 3052805763936507773L;
        hh.ebet[266] = -3088455792252271174L;
        hh.ebet[267] = 1871480869772008124L;
        hh.ebet[268] = 4687938278197689981L;
        hh.ebet[269] = 5681078463148930861L;
        hh.ebet[270] = -20568772367633768L;
        hh.ebet[271] = 1752011124221172272L;
        hh.ebet[272] = -4419991912442463530L;
        hh.ebet[273] = -6368133792303952830L;
        hh.ebet[274] = 2911284133189515064L;
        hh.ebet[275] = -4244843977379733560L;
        hh.ebet[276] = -4115281100580313045L;
        hh.ebet[277] = 5417623026621916128L;
        hh.ebet[278] = 1878379232423828215L;
        hh.ebet[279] = -8855742183224283589L;
        hh.ebet[280] = 9029550152673145289L;
        hh.ebet[281] = 1596048933470449429L;
        hh.ebet[282] = -4036184619618409573L;
        hh.ebet[283] = -3366919771614854580L;
        hh.ebet[284] = 5486591349709060782L;
        hh.ebet[285] = -1042048586570063000L;
        hh.ebet[286] = -3416270569734884818L;
        hh.ebet[287] = 2239842349379685340L;
        hh.ebet[288] = 2639014844175906213L;
        hh.ebet[289] = 1406338876871320083L;
        hh.ebet[290] = -7293956222923541051L;
        hh.ebet[291] = -421366860598566912L;
        hh.ebet[292] = -5577049855321305345L;
        hh.ebet[293] = -6785031576720494015L;
        hh.ebet[294] = -3121848558973366679L;
        hh.ebet[295] = -1959749943858779670L;
        hh.ebet[296] = -3556975322491674289L;
        hh.ebet[297] = 4380957393738976924L;
        hh.ebet[298] = 4256126593709830636L;
        hh.ebet[299] = -8672040441507631069L;
    }

    private static /* synthetic */ void efno() {
        hh.ebbf[900] = -1845316705;
        hh.ebbf[901] = 1228680707;
        hh.ebbf[902] = -1729744462;
        hh.ebbf[903] = -164775260;
        hh.ebbf[904] = 1738175167;
        hh.ebbf[905] = -1031063390;
        hh.ebbf[906] = 374339937;
        hh.ebbf[907] = 1691641953;
        hh.ebbf[908] = -970699658;
        hh.ebbf[909] = -1054412093;
        hh.ebbf[910] = -1100428260;
        hh.ebbf[911] = 200887281;
        hh.ebbf[912] = -1030445327;
        hh.ebbf[913] = 1011471973;
        hh.ebbf[914] = 674209451;
        hh.ebbf[915] = -1344267947;
        hh.ebbf[916] = 604442592;
        hh.ebbf[917] = 1376967517;
        hh.ebbf[918] = 1139120154;
        hh.ebbf[919] = 630249624;
        hh.ebbf[920] = -1438233110;
        hh.ebbf[921] = 1354110092;
        hh.ebbf[922] = -419496475;
        hh.ebbf[923] = 1495100270;
        hh.ebbf[924] = 1635191098;
        hh.ebbf[925] = 265209403;
        hh.ebbf[926] = -2042974247;
        hh.ebbf[927] = -1016843698;
        hh.ebbf[928] = -332135721;
        hh.ebbf[929] = -770460969;
        hh.ebbf[930] = 231525328;
        hh.ebbf[931] = -1030387303;
        hh.ebbf[932] = -128708780;
        hh.ebbf[933] = -678615018;
        hh.ebbf[934] = -919699043;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_1799 getRingItemStack(int var1_1) {
        v0 /* !! */  = hh.kf;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - hh.ebbh("ebvv", ebes(int ), (int)94));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1557089497: {
                    v1 = hh.ebbh("ebvw", ebes(int ), (int)95);
                    continue block20;
                }
                case 672168633: {
                    break block20;
                }
                case 1014929687: {
                    v1 = hh.ebbh("ebwf", ebes(int ), (int)96);
                    continue block20;
                }
            }
            break;
        }
        var4_2 = hh.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("ebwh", ebes(int ), (int)97)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hh.ebbh("ebwi", ebbe(int ), (int)164)) break;
            v2 /* !! */  = (long)hh.ebbh("ebwp", ebbe(int ), (int)165);
        }
        var3_3 /* !! */  = hh.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("ebws", ebes(int ), (int)98)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hh.ebbh("ebwu", ebbe(int ), (int)166)) break;
            v3 /* !! */  = (long)hh.ebbh("ebwv", ebbe(int ), (int)167);
        }
        var2_4 = hh.a;
        if (var4_2) {
            throw null;
lbl31:
            // 3 sources

            return null;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl31
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("ebww", ebes(int ), (int)99)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hh.ebbh("ebwx", ebbe(int ), (int)168)) break;
                    v4 /* !! */  = (long)hh.ebbh("ebwy", ebbe(int ), (int)169);
                }
                if (!this.isRingSlot(var1_1)) ** GOTO lbl55
                if (var2_4) ** GOTO lbl31
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = hh.kf - hh.ebbh("ebxg", ebes(int ), (int)100)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hh.ebbh("ebxj", ebbe(int ), (int)170)) break;
                    v5 /* !! */  = (long)hh.ebbh("ebxk", ebbe(int ), (int)171);
                }
                v6 = this.ringItems[var1_1];
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl71
lbl55:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v7 /* !! */  = hh.kf;
                if (true) ** GOTO lbl61
                block26: while (true) {
                    v7 /* !! */  = (long)(v8 - hh.ebbh("ebxo", ebes(int ), (int)101));
lbl61:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 351175186: {
                            v8 = hh.ebbh("ebxp", ebes(int ), (int)102);
                            continue block26;
                        }
                        case 489317531: {
                            v8 = hh.ebbh("ebxq", ebes(int ), (int)103);
                            continue block26;
                        }
                        case 672168633: {
                            break block26;
                        }
                    }
                    break;
                }
                v6 = class_1799.field_8037;
lbl71:
                // 2 sources

                return v6;
            }
            case 0: {
                var3_3 /* !! */  = (int)hh.ebbh("ebxr", ebbe(int ), (int)172);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)hh.ebbh("ebxz", ebbe(int ), (int)173);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)hh.ebbh("ebya", ebbe(int ), (int)174);
                if (!var4_2) break;
                throw null;
            }
            case 3: {
                do {
                    var3_3 /* !! */  = (int)hh.ebbh("ebyb", ebbe(int ), (int)175);
                } while (!var4_2);
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)hh.ebbh("ebyd", ebbe(int ), (int)176);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl95:
            // 2 sources

            case 5: {
                do {
                    var3_3 /* !! */  = (int)hh.ebbh("ebyg", ebbe(int ), (int)177);
                } while (!var4_2);
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)hh.ebbh("ebyj", ebbe(int ), (int)178);
                if (!var4_2) ** GOTO lbl95
                throw null;
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)hh.ebbh("ebyk", ebbe(int ), (int)179);
        ** while (!var4_2)
lbl107:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$4() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("eebr", ebes(int ), (int)601)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hh.ebbh("eebs", ebbe(int ), (int)881)) break;
            v0 /* !! */  = (long)hh.ebbh("eebt", ebbe(int ), (int)882);
        }
        var3_1 = hh.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("eebu", ebes(int ), (int)602)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hh.ebbh("eebv", ebbe(int ), (int)883)) break;
            v1 /* !! */  = (long)hh.ebbh("eebw", ebbe(int ), (int)884);
        }
        var2_2 /* !! */  = hh.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("eebx", ebes(int ), (int)603)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hh.ebbh("eeby", ebbe(int ), (int)885)) break;
            v2 /* !! */  = (long)hh.ebbh("eebz", ebbe(int ), (int)886);
        }
        var1_3 = hh.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = hh.kf;
                if (true) ** GOTO lbl34
                block20: while (true) {
                    v3 /* !! */  = (long)(hh.ebbh("eecb", ebes(int ), (int)605) - hh.ebbh("eeca", ebes(int ), (int)604));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 672168633: {
                            break block20;
                        }
                        case 1048262877: {
                            continue block20;
                        }
                    }
                    break;
                }
                v4 /* !! */  = hh.kf;
                if (true) ** GOTO lbl43
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - hh.ebbh("eecc", ebes(int ), (int)606));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1541081628: {
                            v5 = hh.ebbh("eecd", ebes(int ), (int)607);
                            continue block21;
                        }
                        case 672168633: {
                            break block21;
                        }
                        case 966977708: {
                            v5 = hh.ebbh("eece", ebes(int ), (int)608);
                            continue block21;
                        }
                        case 1411767921: {
                            v5 = hh.ebbh("eecf", ebes(int ), (int)609);
                            continue block21;
                        }
                    }
                    break;
                }
                v6 = this.mode.isSelected("\u041e\u0431\u044b\u0447\u043d\u044b\u0439");
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = hh.kf - hh.ebbh("eecg", ebes(int ), (int)610)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == hh.ebbh("eech", ebbe(int ), (int)887)) break;
                    v7 /* !! */  = (long)hh.ebbh("eeci", ebbe(int ), (int)888);
                }
                return v6;
            }
            case 0: {
                var2_2 /* !! */  = (int)hh.ebbh("eecj", ebbe(int ), (int)889);
                if (!var3_1) break;
                throw null;
            }
lbl67:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)hh.ebbh("eeck", ebbe(int ), (int)890);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hh.ebbh("eecl", ebbe(int ), (int)891);
                    if (!var3_1) ** GOTO lbl67
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hh.ebbh("eecm", ebbe(int ), (int)892);
        ** while (!var3_1)
lbl80:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void validateRingItems() {
        v0 /* !! */  = hh.kf;
        if (true) ** GOTO lbl5
        block82: while (true) {
            v0 /* !! */  = (long)(hh.ebbh("ecib", ebes(int ), (int)152) - hh.ebbh("ecia", ebes(int ), (int)151));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 672168633: {
                    break block82;
                }
                case 1259002404: {
                    continue block82;
                }
            }
            break;
        }
        var4_1 = hh.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("ecic", ebes(int ), (int)153)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hh.ebbh("ecid", ebbe(int ), (int)235)) break;
            v1 /* !! */  = (long)hh.ebbh("ecie", ebbe(int ), (int)236);
        }
        var3_2 /* !! */  = hh.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("ecif", ebes(int ), (int)154)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hh.ebbh("ecig", ebbe(int ), (int)237)) break;
            v2 /* !! */  = (long)hh.ebbh("ecih", ebbe(int ), (int)238);
        }
        var2_3 = hh.a;
        if (var4_1) {
            throw null;
lbl27:
            // 12 sources

            return;
        }
        if (var2_3 || var2_3) ** GOTO lbl27
        var1_4 = hh.ebbh("ecii", ebbe(int ), (int)239);
        if (var2_3) ** GOTO lbl27
        block86: while (true) {
            if (var2_3 || var2_3) ** GOTO lbl27
            while (true) {
                if ((v3 = (cfr_temp_2 = hh.kf - hh.ebbh("ecij", ebes(int ), (int)155)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 == hh.ebbh("ecik", ebbe(int ), (int)240)) break;
                v3 = -947100335;
            }
            if (var1_4 >= this.ringItems.length) ** GOTO lbl229
            if (var2_3) ** GOTO lbl27
            if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var2_3) ** GOTO lbl27
                    v4 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl50
                    block88: while (true) {
                        v4 /* !! */  = (long)(hh.ebbh("ecin", ebes(int ), (int)157) - hh.ebbh("ecil", ebes(int ), (int)156));
lbl50:
                        // 2 sources

                        switch ((int)v4 /* !! */ ) {
                            case -507009745: {
                                continue block88;
                            }
                            case 672168633: {
                                break block88;
                            }
                        }
                        break;
                    }
                    v5 = this.ringItems[var1_4];
                    while (true) {
                        if ((v6 /* !! */  = (cfr_temp_3 = hh.kf - hh.ebbh("ecio", ebes(int ), (int)158)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v6 /* !! */  == hh.ebbh("ecip", ebbe(int ), (int)241)) break;
                        v6 /* !! */  = (long)hh.ebbh("eciq", ebbe(int ), (int)242);
                    }
                    if (v5.method_7960()) ** GOTO lbl224
                    if (var2_3) ** GOTO lbl27
                    v7 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl68
                    block90: while (true) {
                        v7 /* !! */  = (long)(v8 - hh.ebbh("ecir", ebes(int ), (int)159));
lbl68:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -2060531425: {
                                v8 = hh.ebbh("ecis", ebes(int ), (int)160);
                                continue block90;
                            }
                            case -1606856916: {
                                v8 = hh.ebbh("ecit", ebes(int ), (int)161);
                                continue block90;
                            }
                            case -1332545716: {
                                v8 = hh.ebbh("eciu", ebes(int ), (int)162);
                                continue block90;
                            }
                            case 672168633: {
                                break block90;
                            }
                        }
                        break;
                    }
                    v9 = this.ringItems[var1_4];
                    v10 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl85
                    block91: while (true) {
                        v10 /* !! */  = (long)(v11 - hh.ebbh("eciv", ebes(int ), (int)163));
lbl85:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case -1345881609: {
                                v11 = hh.ebbh("eciw", ebes(int ), (int)164);
                                continue block91;
                            }
                            case 672168633: {
                                break block91;
                            }
                            case 1843163354: {
                                v11 = hh.ebbh("ecix", ebes(int ), (int)165);
                                continue block91;
                            }
                        }
                        break;
                    }
                    if (this.findExactItem(v9) != hh.ebbh("eciy", ebbe(int ), (int)243)) ** GOTO lbl224
                    if (var2_3) ** GOTO lbl27
                    v12 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl100
                    block92: while (true) {
                        v12 /* !! */  = (long)(v13 - hh.ebbh("eciz", ebes(int ), (int)166));
lbl100:
                        // 2 sources

                        switch ((int)v12 /* !! */ ) {
                            case 7521762: {
                                v13 = hh.ebbh("ecja", ebes(int ), (int)167);
                                continue block92;
                            }
                            case 209893271: {
                                v13 = hh.ebbh("ecjb", ebes(int ), (int)168);
                                continue block92;
                            }
                            case 372181217: {
                                v13 = hh.ebbh("ecjc", ebes(int ), (int)169);
                                continue block92;
                            }
                            case 672168633: {
                                break block92;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_4 = hh.kf - hh.ebbh("ecjd", ebes(int ), (int)170)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v14 /* !! */  == hh.ebbh("ecje", ebbe(int ), (int)244)) break;
                        v14 /* !! */  = (long)hh.ebbh("ecjg", ebbe(int ), (int)245);
                    }
                    if (hh.mc.field_1724 != null) ** GOTO lbl132
                    v15 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl123
                    block94: while (true) {
                        v15 /* !! */  = (long)(hh.ebbh("ecji", ebes(int ), (int)172) - hh.ebbh("ecjh", ebes(int ), (int)171));
lbl123:
                        // 2 sources

                        switch ((int)v15 /* !! */ ) {
                            case -26764374: {
                                continue block94;
                            }
                            case 672168633: {
                                break block94;
                            }
                        }
                        break;
                    }
                    v16 = class_1799.field_8037;
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl168
lbl132:
                    // 1 sources

                    v17 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl136
                    block95: while (true) {
                        v17 /* !! */  = (long)(hh.ebbh("ecjk", ebes(int ), (int)174) - hh.ebbh("ecjj", ebes(int ), (int)173));
lbl136:
                        // 2 sources

                        switch ((int)v17 /* !! */ ) {
                            case -1232152164: {
                                continue block95;
                            }
                            case 672168633: {
                                break block95;
                            }
                        }
                        break;
                    }
                    v18 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl145
                    block96: while (true) {
                        v18 /* !! */  = (long)(v19 - hh.ebbh("ecjl", ebes(int ), (int)175));
lbl145:
                        // 2 sources

                        switch ((int)v18 /* !! */ ) {
                            case -1326552116: {
                                v19 = hh.ebbh("ecjm", ebes(int ), (int)176);
                                continue block96;
                            }
                            case 520673188: {
                                v19 = hh.ebbh("ecjn", ebes(int ), (int)177);
                                continue block96;
                            }
                            case 672168633: {
                                break block96;
                            }
                            case 1269081176: {
                                v19 = hh.ebbh("ecjo", ebes(int ), (int)178);
                                continue block96;
                            }
                        }
                        break;
                    }
                    v20 = hh.mc.field_1724;
                    v21 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl162
                    block97: while (true) {
                        v21 /* !! */  = (long)(hh.ebbh("ecjr", ebes(int ), (int)180) - hh.ebbh("ecjq", ebes(int ), (int)179));
lbl162:
                        // 2 sources

                        switch ((int)v21 /* !! */ ) {
                            case 356679001: {
                                continue block97;
                            }
                            case 672168633: {
                                break block97;
                            }
                        }
                        break;
                    }
                    v16 = v20.method_6079();
lbl168:
                    // 2 sources

                    v22 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl172
                    block98: while (true) {
                        v22 /* !! */  = (long)(v23 - hh.ebbh("ecjs", ebes(int ), (int)181));
lbl172:
                        // 2 sources

                        switch ((int)v22 /* !! */ ) {
                            case -176040198: {
                                v23 = hh.ebbh("ecjt", ebes(int ), (int)182);
                                continue block98;
                            }
                            case 614706902: {
                                v23 = hh.ebbh("ecju", ebes(int ), (int)183);
                                continue block98;
                            }
                            case 672168633: {
                                break block98;
                            }
                            case 739285074: {
                                v23 = hh.ebbh("ecjv", ebes(int ), (int)184);
                                continue block98;
                            }
                        }
                        break;
                    }
                    v24 = this.ringItems[var1_4];
                    v25 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl189
                    block99: while (true) {
                        v25 /* !! */  = (long)(v26 - hh.ebbh("ecjw", ebes(int ), (int)185));
lbl189:
                        // 2 sources

                        switch ((int)v25 /* !! */ ) {
                            case 275729687: {
                                v26 = hh.ebbh("ecjx", ebes(int ), (int)186);
                                continue block99;
                            }
                            case 672168633: {
                                break block99;
                            }
                            case 1465277435: {
                                v26 = hh.ebbh("ecjy", ebes(int ), (int)187);
                                continue block99;
                            }
                        }
                        break;
                    }
                    if (this.sameRingItem(v16, v24)) ** GOTO lbl224
                    if (var2_3 || var2_3) ** GOTO lbl27
                    while (true) {
                        if ((v27 /* !! */  = (cfr_temp_5 = hh.kf - hh.ebbh("ecjz", ebes(int ), (int)188)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v27 /* !! */  == hh.ebbh("ecka", ebbe(int ), (int)246)) break;
                        v27 /* !! */  = (long)hh.ebbh("eckb", ebbe(int ), (int)247);
                    }
                    v28 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl210
                    block101: while (true) {
                        v28 /* !! */  = (long)(v29 - hh.ebbh("eckd", ebes(int ), (int)189));
lbl210:
                        // 2 sources

                        switch ((int)v28 /* !! */ ) {
                            case -1754910454: {
                                v29 = hh.ebbh("ecke", ebes(int ), (int)190);
                                continue block101;
                            }
                            case 672168633: {
                                break block101;
                            }
                            case 1634006939: {
                                v29 = hh.ebbh("eckf", ebes(int ), (int)191);
                                continue block101;
                            }
                            case 2128496793: {
                                v29 = hh.ebbh("eckg", ebes(int ), (int)192);
                                continue block101;
                            }
                        }
                        break;
                    }
                    this.ringItems[var1_4] = class_1799.field_8037;
                    if (var2_3) ** GOTO lbl27
lbl224:
                    // 4 sources

                    if (var2_3 || var2_3) ** GOTO lbl27
                    ++var1_4;
                    if (var2_3) ** GOTO lbl27
                    if (!var4_1) continue block86;
                    throw null;
                }
lbl229:
                // 1 sources

                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return;
lbl232:
                // 2 sources

                case 0: {
                    var3_2 /* !! */  = (int)hh.ebbh("eckh", ebbe(int ), (int)248);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl282
                }
                case 1: {
                    var3_2 /* !! */  = (int)hh.ebbh("ecki", ebbe(int ), (int)249);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl272
                }
                case 2: {
                    var3_2 /* !! */  = (int)hh.ebbh("eckj", ebbe(int ), (int)250);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl286
                }
                case 3: {
                    var3_2 /* !! */  = (int)hh.ebbh("eckl", ebbe(int ), (int)251);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl286
                }
                case 4: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_2 /* !! */  = (int)hh.ebbh("eckm", ebbe(int ), (int)252);
                        if (var4_1) {
                            throw null;
                        }
                        ** GOTO lbl272
                        break;
                    }
                }
lbl258:
                // 2 sources

                case 5: {
                    var3_2 /* !! */  = (int)hh.ebbh("eckn", ebbe(int ), (int)253);
                    if (!var4_1) ** GOTO lbl232
                    throw null;
                }
lbl262:
                // 2 sources

                case 6: {
                    var3_2 /* !! */  = (int)hh.ebbh("ecko", ebbe(int ), (int)254);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl277
                }
                case 7: {
                    var3_2 /* !! */  = (int)hh.ebbh("eckp", ebbe(int ), (int)255);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl291
                }
lbl272:
                // 3 sources

                case 8: {
                    var3_2 /* !! */  = (int)hh.ebbh("eckq", ebbe(int ), (int)256);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl315
                }
lbl277:
                // 4 sources

                case 9: {
                    var3_2 /* !! */  = (int)hh.ebbh("eckr", ebbe(int ), (int)257);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl311
                }
lbl282:
                // 3 sources

                case 10: {
                    var3_2 /* !! */  = (int)hh.ebbh("ecks", ebbe(int ), (int)258);
                    if (!var4_1) ** GOTO lbl258
                    throw null;
                }
lbl286:
                // 4 sources

                case 11: {
                    do {
                        var3_2 /* !! */  = (int)hh.ebbh("eckt", ebbe(int ), (int)259);
                    } while (!var4_1);
                    throw null;
                }
lbl291:
                // 3 sources

                case 12: {
                    var3_2 /* !! */  = (int)hh.ebbh("ecku", ebbe(int ), (int)260);
                    if (!var4_1) ** GOTO lbl286
                    throw null;
                }
lbl295:
                // 2 sources

                case 13: {
                    var3_2 /* !! */  = (int)hh.ebbh("eckw", ebbe(int ), (int)261);
                    if (!var4_1) ** GOTO lbl262
                    throw null;
                }
                case 14: {
                    var3_2 /* !! */  = (int)hh.ebbh("eckx", ebbe(int ), (int)262);
                    if (!var4_1) ** GOTO lbl295
                    throw null;
                }
                case 15: {
                    var3_2 /* !! */  = (int)hh.ebbh("ecky", ebbe(int ), (int)263);
                    if (!var4_1) ** GOTO lbl282
                    throw null;
                }
                case 16: {
                    var3_2 /* !! */  = (int)hh.ebbh("eckz", ebbe(int ), (int)264);
                    if (!var4_1) ** GOTO lbl277
                    throw null;
                }
lbl311:
                // 2 sources

                case 17: {
                    var3_2 /* !! */  = (int)hh.ebbh("ecla", ebbe(int ), (int)265);
                    if (!var4_1) ** GOTO lbl291
                    throw null;
                }
lbl315:
                // 2 sources

                case 18: {
                    var3_2 /* !! */  = (int)hh.ebbh("eclb", ebbe(int ), (int)266);
                    if (!var4_1) ** GOTO lbl277
                    throw null;
                }
                case 19: 
            }
            break;
        }
        var3_2 /* !! */  = (int)hh.ebbh("eclc", ebbe(int ), (int)267);
        ** while (!var4_1)
lbl322:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private nu findItemHotbar(String var1_1) {
        block100: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("edqw", ebes(int ), (int)487)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == hh.ebbh("edqx", ebbe(int ), (int)714)) break;
                v0 /* !! */  = (long)hh.ebbh("edqy", ebbe(int ), (int)715);
            }
            var6_2 = hh.c;
            v1 /* !! */  = hh.kf;
            if (true) ** GOTO lbl12
            block54: while (true) {
                v1 /* !! */  = (long)(v2 - hh.ebbh("edqz", ebes(int ), (int)488));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1754317183: {
                        v2 = hh.ebbh("edra", ebes(int ), (int)489);
                        continue block54;
                    }
                    case -952930195: {
                        v2 = hh.ebbh("edrb", ebes(int ), (int)490);
                        continue block54;
                    }
                    case 672168633: {
                        break block54;
                    }
                }
                break;
            }
            var5_3 /* !! */  = hh.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("edrc", ebes(int ), (int)491)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == hh.ebbh("edrd", ebbe(int ), (int)716)) break;
                v3 /* !! */  = (long)hh.ebbh("edre", ebbe(int ), (int)717);
            }
            var4_4 = hh.a;
            if (var6_2) {
                throw null;
lbl31:
                // 12 sources

                return null;
            }
            if (var4_4 || var4_4) ** GOTO lbl31
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("edrf", ebes(int ), (int)492)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == hh.ebbh("edrg", ebbe(int ), (int)718)) break;
                v4 /* !! */  = (long)hh.ebbh("edrh", ebbe(int ), (int)719);
            }
            v5 /* !! */  = hh.kf;
            if (true) ** GOTO lbl44
            block58: while (true) {
                v5 /* !! */  = (long)(v6 - hh.ebbh("edri", ebes(int ), (int)493));
lbl44:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1576402034: {
                        v6 = hh.ebbh("edrj", ebes(int ), (int)494);
                        continue block58;
                    }
                    case 672168633: {
                        break block58;
                    }
                    case 1671800550: {
                        v6 = hh.ebbh("edrk", ebes(int ), (int)495);
                        continue block58;
                    }
                }
                break;
            }
            if (hh.mc.field_1724 != null) break block100;
            if (var4_4 || var4_4) ** GOTO lbl31
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_3 = hh.kf - hh.ebbh("edrl", ebes(int ), (int)496)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v7 /* !! */  == hh.ebbh("edrm", ebbe(int ), (int)720)) break;
                v7 /* !! */  = (long)hh.ebbh("edrn", ebbe(int ), (int)721);
            }
            return nu.notFound();
        }
        if (var4_4 || var4_4) ** GOTO lbl31
        var2_5 = hh.ebbh("edro", ebbe(int ), (int)722);
        if (var4_4) ** GOTO lbl31
        block60: while (true) {
            if (var4_4 || var4_4) ** GOTO lbl31
            if (var2_5 >= hh.ebbh("edrp", ebbe(int ), (int)723)) ** GOTO lbl156
            if (var4_4 || var4_4) ** GOTO lbl31
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_4 = hh.kf - hh.ebbh("edrq", ebes(int ), (int)497)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v8 /* !! */  == hh.ebbh("edrr", ebbe(int ), (int)724)) break;
                v8 /* !! */  = (long)hh.ebbh("edrs", ebbe(int ), (int)725);
            }
            v9 /* !! */  = hh.kf;
            if (true) ** GOTO lbl80
            block62: while (true) {
                v9 /* !! */  = (long)(v10 - hh.ebbh("edrt", ebes(int ), (int)498));
lbl80:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1628753496: {
                        v10 = hh.ebbh("edru", ebes(int ), (int)499);
                        continue block62;
                    }
                    case -576390212: {
                        v10 = hh.ebbh("edrv", ebes(int ), (int)500);
                        continue block62;
                    }
                    case 672168633: {
                        break block62;
                    }
                    case 1799113726: {
                        v10 = hh.ebbh("edrw", ebes(int ), (int)501);
                        continue block62;
                    }
                }
                break;
            }
            v11 = hh.mc.field_1724;
            v12 /* !! */  = hh.kf;
            if (true) ** GOTO lbl97
            block63: while (true) {
                v12 /* !! */  = (long)(v13 - hh.ebbh("edrx", ebes(int ), (int)502));
lbl97:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -1726522917: {
                        v13 = hh.ebbh("edry", ebes(int ), (int)503);
                        continue block63;
                    }
                    case 672168633: {
                        break block63;
                    }
                    case 1989527365: {
                        v13 = hh.ebbh("edrz", ebes(int ), (int)504);
                        continue block63;
                    }
                }
                break;
            }
            v14 = v11.method_31548();
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_5 = hh.kf - hh.ebbh("edsa", ebes(int ), (int)505)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v15 /* !! */  == hh.ebbh("edsb", ebbe(int ), (int)726)) break;
                v15 /* !! */  = (long)hh.ebbh("edsc", ebbe(int ), (int)727);
            }
            var3_6 = v14.method_5438((int)var2_5);
            if (var4_4) ** GOTO lbl31
            if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var5_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var4_4) ** GOTO lbl31
                    while (true) {
                        if ((v16 /* !! */  = (cfr_temp_6 = hh.kf - hh.ebbh("edsd", ebes(int ), (int)506)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v16 /* !! */  == hh.ebbh("edse", ebbe(int ), (int)728)) break;
                        v16 /* !! */  = (long)hh.ebbh("edsf", ebbe(int ), (int)729);
                    }
                    if (!this.matches(var3_6, var1_1)) ** GOTO lbl151
                    if (var4_4 || var4_4) ** GOTO lbl31
                    v17 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl131
                    block66: while (true) {
                        v17 /* !! */  = (long)(v18 - hh.ebbh("edsg", ebes(int ), (int)507));
lbl131:
                        // 2 sources

                        switch ((int)v17 /* !! */ ) {
                            case -1990139919: {
                                v18 = hh.ebbh("edsh", ebes(int ), (int)508);
                                continue block66;
                            }
                            case -514782163: {
                                v18 = hh.ebbh("edsi", ebes(int ), (int)509);
                                continue block66;
                            }
                            case 672168633: {
                                break block66;
                            }
                            case 1181008839: {
                                v18 = hh.ebbh("edsj", ebes(int ), (int)510);
                                continue block66;
                            }
                        }
                        break;
                    }
                    v19 = hh.ebbh("edsk", ebbe(int ), (int)730);
                    while (true) {
                        if ((v20 /* !! */  = (cfr_temp_7 = hh.kf - hh.ebbh("edsl", ebes(int ), (int)511)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v20 /* !! */  == hh.ebbh("edsm", ebbe(int ), (int)731)) break;
                        v20 /* !! */  = (long)hh.ebbh("edsn", ebbe(int ), (int)732);
                    }
                    return new nu((int)var2_5, (boolean)v19, var3_6);
lbl151:
                    // 1 sources

                    if (var4_4 || var4_4) ** GOTO lbl31
                    ++var2_5;
                    if (var4_4) ** GOTO lbl31
                    if (!var6_2) continue block60;
                    throw null;
                }
lbl156:
                // 1 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_8 = hh.kf - hh.ebbh("edso", ebes(int ), (int)512)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v21 /* !! */  == hh.ebbh("edsp", ebbe(int ), (int)733)) break;
                    v21 /* !! */  = (long)hh.ebbh("edsq", ebbe(int ), (int)734);
                }
                return nu.notFound();
                case 0: {
                    var5_3 /* !! */  = (int)hh.ebbh("edsr", ebbe(int ), (int)735);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl254
                }
                case 1: {
                    var5_3 /* !! */  = (int)hh.ebbh("edss", ebbe(int ), (int)736);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl191
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var5_3 /* !! */  = (int)hh.ebbh("edst", ebbe(int ), (int)737);
                        if (var6_2) {
                            throw null;
                        }
                        ** GOTO lbl210
                        break;
                    }
                }
                case 3: {
                    var5_3 /* !! */  = (int)hh.ebbh("edsu", ebbe(int ), (int)738);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl220
                }
lbl186:
                // 5 sources

                case 4: {
                    var5_3 /* !! */  = (int)hh.ebbh("edsv", ebbe(int ), (int)739);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl206
                }
lbl191:
                // 2 sources

                case 5: {
                    var5_3 /* !! */  = (int)hh.ebbh("edsw", ebbe(int ), (int)740);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl246
                }
                case 6: {
                    var5_3 /* !! */  = (int)hh.ebbh("edsx", ebbe(int ), (int)741);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl224
                }
                case 7: {
                    var5_3 /* !! */  = (int)hh.ebbh("edsy", ebbe(int ), (int)742);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl262
                }
lbl206:
                // 3 sources

                case 8: {
                    var5_3 /* !! */  = (int)hh.ebbh("edsz", ebbe(int ), (int)743);
                    if (var6_2) {
                        throw null;
                    }
                }
lbl210:
                // 4 sources

                case 9: {
                    var5_3 /* !! */  = (int)hh.ebbh("edta", ebbe(int ), (int)744);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl266
                }
                case 10: {
                    var5_3 /* !! */  = (int)hh.ebbh("edtb", ebbe(int ), (int)745);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl258
                }
lbl220:
                // 3 sources

                case 11: {
                    var5_3 /* !! */  = (int)hh.ebbh("edtc", ebbe(int ), (int)746);
                    if (!var6_2) ** GOTO lbl186
                    throw null;
                }
lbl224:
                // 2 sources

                case 12: {
                    var5_3 /* !! */  = (int)hh.ebbh("edtd", ebbe(int ), (int)747);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl254
                }
                case 13: {
                    do {
                        var5_3 /* !! */  = (int)hh.ebbh("edte", ebbe(int ), (int)748);
                    } while (!var6_2);
                    throw null;
                }
lbl234:
                // 2 sources

                case 14: {
                    var5_3 /* !! */  = (int)hh.ebbh("edtf", ebbe(int ), (int)749);
                    if (!var6_2) ** GOTO lbl186
                    throw null;
                }
                case 15: {
                    var5_3 /* !! */  = (int)hh.ebbh("edtg", ebbe(int ), (int)750);
                    if (!var6_2) ** GOTO lbl220
                    throw null;
                }
lbl242:
                // 2 sources

                case 16: {
                    var5_3 /* !! */  = (int)hh.ebbh("edth", ebbe(int ), (int)751);
                    if (!var6_2) ** GOTO lbl186
                    throw null;
                }
lbl246:
                // 2 sources

                case 17: {
                    var5_3 /* !! */  = (int)hh.ebbh("edti", ebbe(int ), (int)752);
                    if (!var6_2) ** GOTO lbl186
                    throw null;
                }
lbl250:
                // 2 sources

                case 18: {
                    var5_3 /* !! */  = (int)hh.ebbh("edtj", ebbe(int ), (int)753);
                    if (!var6_2) ** GOTO lbl234
                    throw null;
                }
lbl254:
                // 3 sources

                case 19: {
                    var5_3 /* !! */  = (int)hh.ebbh("edtk", ebbe(int ), (int)754);
                    if (!var6_2) ** GOTO lbl250
                    throw null;
                }
lbl258:
                // 3 sources

                case 20: {
                    var5_3 /* !! */  = (int)hh.ebbh("edtl", ebbe(int ), (int)755);
                    if (!var6_2) ** GOTO lbl206
                    throw null;
                }
lbl262:
                // 2 sources

                case 21: {
                    var5_3 /* !! */  = (int)hh.ebbh("edtm", ebbe(int ), (int)756);
                    if (!var6_2) ** GOTO lbl242
                    throw null;
                }
lbl266:
                // 2 sources

                case 22: {
                    var5_3 /* !! */  = (int)hh.ebbh("edtn", ebbe(int ), (int)757);
                    if (!var6_2) ** GOTO lbl258
                    throw null;
                }
                case 23: 
            }
            break;
        }
        var5_3 /* !! */  = (int)hh.ebbh("edto", ebbe(int ), (int)758);
        ** while (!var6_2)
lbl273:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void executeSwapLegit() {
        block122: {
            block121: {
                block120: {
                    block119: {
                        while (true) {
                            if ((v0 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("edev", ebes(int ), (int)382)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                            if (v0 /* !! */  == hh.ebbh("edew", ebbe(int ), (int)589)) break;
                            v0 /* !! */  = (long)hh.ebbh("edex", ebbe(int ), (int)590);
                        }
                        var5_1 = hh.c;
                        v1 /* !! */  = hh.kf;
                        if (true) ** GOTO lbl11
                        block78: while (true) {
                            v1 /* !! */  = (long)(v2 - hh.ebbh("edey", ebes(int ), (int)383));
lbl11:
                            // 2 sources

                            switch ((int)v1 /* !! */ ) {
                                case 672168633: {
                                    break block78;
                                }
                                case 1520168702: {
                                    v2 = hh.ebbh("edez", ebes(int ), (int)384);
                                    continue block78;
                                }
                                case 1709170874: {
                                    v2 = hh.ebbh("edfa", ebes(int ), (int)385);
                                    continue block78;
                                }
                            }
                            break;
                        }
                        var4_2 /* !! */  = hh.b;
                        v3 /* !! */  = hh.kf;
                        if (true) ** GOTO lbl25
                        block79: while (true) {
                            v3 /* !! */  = (long)(v4 - hh.ebbh("edfb", ebes(int ), (int)386));
lbl25:
                            // 2 sources

                            switch ((int)v3 /* !! */ ) {
                                case -1847806947: {
                                    v4 = hh.ebbh("edfc", ebes(int ), (int)387);
                                    continue block79;
                                }
                                case -313129775: {
                                    v4 = hh.ebbh("edfd", ebes(int ), (int)388);
                                    continue block79;
                                }
                                case 672168633: {
                                    break block79;
                                }
                            }
                            break;
                        }
                        var3_3 = hh.a;
                        if (var5_1) {
                            throw null;
lbl37:
                            // 13 sources

                            return;
                        }
                        if (var3_3 || var3_3) ** GOTO lbl37
                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("edfe", ebes(int ), (int)389)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                            if (v5 /* !! */  == hh.ebbh("edff", ebbe(int ), (int)591)) break;
                            v5 /* !! */  = (long)hh.ebbh("edfg", ebbe(int ), (int)592);
                        }
                        if (this.targetSlot < 0) break block119;
                        if (var3_3) ** GOTO lbl37
                        while (true) {
                            if ((v6 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("edfh", ebes(int ), (int)390)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v6 /* !! */  == hh.ebbh("edfi", ebbe(int ), (int)593)) break;
                            v6 /* !! */  = (long)hh.ebbh("edfj", ebbe(int ), (int)594);
                        }
                        if (this.targetSlot >= hh.ebbh("edfk", ebbe(int ), (int)595)) break block119;
                        if (var3_3 || var3_3) ** GOTO lbl37
                        v7 /* !! */  = hh.kf;
                        if (true) ** GOTO lbl58
                        block83: while (true) {
                            v7 /* !! */  = (long)(hh.ebbh("edfm", ebes(int ), (int)392) - hh.ebbh("edfl", ebes(int ), (int)391));
lbl58:
                            // 2 sources

                            switch ((int)v7 /* !! */ ) {
                                case -1796019446: {
                                    continue block83;
                                }
                                case 672168633: {
                                    break block83;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v8 /* !! */  = (cfr_temp_3 = hh.kf - hh.ebbh("edfn", ebes(int ), (int)393)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v8 /* !! */  == hh.ebbh("edfo", ebbe(int ), (int)596)) break;
                            v8 /* !! */  = (long)hh.ebbh("edfp", ebbe(int ), (int)597);
                        }
                        v9 = hh.mc.field_1724;
                        v10 /* !! */  = hh.kf;
                        if (true) ** GOTO lbl73
                        block85: while (true) {
                            v10 /* !! */  = (long)(v11 - hh.ebbh("edfq", ebes(int ), (int)394));
lbl73:
                            // 2 sources

                            switch ((int)v10 /* !! */ ) {
                                case -1354459753: {
                                    v11 = hh.ebbh("edfr", ebes(int ), (int)395);
                                    continue block85;
                                }
                                case -145355929: {
                                    v11 = hh.ebbh("edfs", ebes(int ), (int)396);
                                    continue block85;
                                }
                                case 672168633: {
                                    break block85;
                                }
                                case 1501213915: {
                                    v11 = hh.ebbh("edft", ebes(int ), (int)397);
                                    continue block85;
                                }
                            }
                            break;
                        }
                        v12 = v9.method_31548();
                        while (true) {
                            if ((v13 /* !! */  = (cfr_temp_4 = hh.kf - hh.ebbh("edfu", ebes(int ), (int)398)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v13 /* !! */  == hh.ebbh("edfv", ebbe(int ), (int)598)) break;
                            v13 /* !! */  = (long)hh.ebbh("edfw", ebbe(int ), (int)599);
                        }
                        while (true) {
                            if ((v14 /* !! */  = (cfr_temp_5 = hh.kf - hh.ebbh("edfx", ebes(int ), (int)399)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                            if (v14 /* !! */  == hh.ebbh("edfy", ebbe(int ), (int)600)) break;
                            v14 /* !! */  = (long)hh.ebbh("edfz", ebbe(int ), (int)601);
                        }
                        v15 = v12.method_5438(this.targetSlot);
                        v16 = hh.ebbh("edga", ebbe(int ), (int)602);
                        while (true) {
                            if ((v17 /* !! */  = (cfr_temp_6 = hh.kf - hh.ebbh("edgb", ebes(int ), (int)400)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                            if (v17 /* !! */  == hh.ebbh("edgc", ebbe(int ), (int)603)) break;
                            v17 /* !! */  = (long)hh.ebbh("edgd", ebbe(int ), (int)604);
                        }
                        v18 = v15.method_46651((int)v16);
                        if (var5_1) {
                            throw null;
                        }
                        break block120;
                    }
                    if (var3_3 || var3_3) ** GOTO lbl37
                    v19 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl113
                    block89: while (true) {
                        v19 /* !! */  = (long)(v20 - hh.ebbh("edge", ebes(int ), (int)401));
lbl113:
                        // 2 sources

                        switch ((int)v19 /* !! */ ) {
                            case -1461749473: {
                                v20 = hh.ebbh("edgf", ebes(int ), (int)402);
                                continue block89;
                            }
                            case -1281024672: {
                                v20 = hh.ebbh("edgg", ebes(int ), (int)403);
                                continue block89;
                            }
                            case 672168633: {
                                break block89;
                            }
                        }
                        break;
                    }
                    v18 = var1_4 = class_1799.field_8037;
                }
                if (var3_3 || var3_3) ** GOTO lbl37
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_7 = hh.kf - hh.ebbh("edgh", ebes(int ), (int)404)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == hh.ebbh("edgi", ebbe(int ), (int)605)) break;
                    v21 /* !! */  = (long)hh.ebbh("edgj", ebbe(int ), (int)606);
                }
                if (!this.isFromHotbar) break block121;
                if (var3_3 || var3_3) ** GOTO lbl37
                v22 /* !! */  = hh.kf;
                if (true) ** GOTO lbl136
                block91: while (true) {
                    v22 /* !! */  = (long)(v23 - hh.ebbh("edgk", ebes(int ), (int)405));
lbl136:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1779276399: {
                            v23 = hh.ebbh("edgl", ebes(int ), (int)406);
                            continue block91;
                        }
                        case -1609897: {
                            v23 = hh.ebbh("edgm", ebes(int ), (int)407);
                            continue block91;
                        }
                        case 672168633: {
                            break block91;
                        }
                        case 2029293133: {
                            v23 = hh.ebbh("edgn", ebes(int ), (int)408);
                            continue block91;
                        }
                    }
                    break;
                }
                var2_5 = this.targetSlot + hh.ebbh("edgo", ebbe(int ), (int)607);
                if (var3_3 || var3_3) ** GOTO lbl37
                v24 /* !! */  = hh.kf;
                if (true) ** GOTO lbl154
                block92: while (true) {
                    v24 /* !! */  = (long)(v25 - hh.ebbh("edgp", ebes(int ), (int)409));
lbl154:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case 107585017: {
                            v25 = hh.ebbh("edgq", ebes(int ), (int)410);
                            continue block92;
                        }
                        case 672168633: {
                            break block92;
                        }
                        case 1628917159: {
                            v25 = hh.ebbh("edgr", ebes(int ), (int)411);
                            continue block92;
                        }
                    }
                    break;
                }
                nv.swapToOffhand(var2_5);
                if (var3_3 || var3_3) ** GOTO lbl37
                if (var5_1) {
                    throw null;
                }
                break block122;
            }
            if (var3_3 || var3_3) ** GOTO lbl37
            v26 /* !! */  = hh.kf;
            if (true) ** GOTO lbl174
            block93: while (true) {
                v26 /* !! */  = (long)(hh.ebbh("edgt", ebes(int ), (int)413) - hh.ebbh("edgs", ebes(int ), (int)412));
lbl174:
                // 2 sources

                switch ((int)v26 /* !! */ ) {
                    case 672168633: {
                        break block93;
                    }
                    case 1201527695: {
                        continue block93;
                    }
                }
                break;
            }
            v27 /* !! */  = hh.kf;
            if (true) ** GOTO lbl183
            block94: while (true) {
                v27 /* !! */  = (long)(hh.ebbh("edgv", ebes(int ), (int)415) - hh.ebbh("edgu", ebes(int ), (int)414));
lbl183:
                // 2 sources

                switch ((int)v27 /* !! */ ) {
                    case -477719553: {
                        continue block94;
                    }
                    case 672168633: {
                        break block94;
                    }
                }
                break;
            }
            nv.swapToOffhand(this.targetSlot);
            if (var3_3) ** GOTO lbl37
        }
        if (var3_3 || var3_3) ** GOTO lbl37
        v28 /* !! */  = hh.kf;
        if (true) ** GOTO lbl196
        block95: while (true) {
            v28 /* !! */  = (long)(v29 - hh.ebbh("edgw", ebes(int ), (int)416));
lbl196:
            // 2 sources

            switch ((int)v28 /* !! */ ) {
                case -1001908798: {
                    v29 = hh.ebbh("edgx", ebes(int ), (int)417);
                    continue block95;
                }
                case -358147604: {
                    v29 = hh.ebbh("edgy", ebes(int ), (int)418);
                    continue block95;
                }
                case 672168633: {
                    break block95;
                }
                case 1924737266: {
                    v29 = hh.ebbh("edgz", ebes(int ), (int)419);
                    continue block95;
                }
            }
            break;
        }
        ee.item(var1_4);
        if (var3_3) ** GOTO lbl37
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var3_3) ** break;
                ** continue;
                return;
            }
lbl216:
            // 3 sources

            case 0: {
                var4_2 /* !! */  = (int)hh.ebbh("edha", ebbe(int ), (int)608);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl272
            }
            case 1: {
                var4_2 /* !! */  = (int)hh.ebbh("edhb", ebbe(int ), (int)609);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl304
            }
            case 2: {
                var4_2 /* !! */  = (int)hh.ebbh("edhc", ebbe(int ), (int)610);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl286
            }
lbl231:
            // 5 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)hh.ebbh("edhd", ebbe(int ), (int)611);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl272
                    break;
                }
            }
lbl237:
            // 2 sources

            case 4: {
                var4_2 /* !! */  = (int)hh.ebbh("edhe", ebbe(int ), (int)612);
                if (!var5_1) ** GOTO lbl231
                throw null;
            }
            case 5: {
                var4_2 /* !! */  = (int)hh.ebbh("edhf", ebbe(int ), (int)613);
                if (!var5_1) ** GOTO lbl216
                throw null;
            }
lbl245:
            // 2 sources

            case 6: {
                var4_2 /* !! */  = (int)hh.ebbh("edhg", ebbe(int ), (int)614);
                if (!var5_1) ** GOTO lbl237
                throw null;
            }
lbl249:
            // 2 sources

            case 7: {
                var4_2 /* !! */  = (int)hh.ebbh("edhh", ebbe(int ), (int)615);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl320
            }
            case 8: {
                var4_2 /* !! */  = (int)hh.ebbh("edhi", ebbe(int ), (int)616);
                if (!var5_1) ** GOTO lbl245
                throw null;
            }
            case 9: {
                var4_2 /* !! */  = (int)hh.ebbh("edhj", ebbe(int ), (int)617);
                if (!var5_1) break;
                throw null;
            }
            case 10: {
                do {
                    var4_2 /* !! */  = (int)hh.ebbh("edhk", ebbe(int ), (int)618);
                } while (!var5_1);
                throw null;
            }
lbl267:
            // 2 sources

            case 11: {
                var4_2 /* !! */  = (int)hh.ebbh("edhl", ebbe(int ), (int)619);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl276
            }
lbl272:
            // 3 sources

            case 12: {
                var4_2 /* !! */  = (int)hh.ebbh("edhm", ebbe(int ), (int)620);
                if (!var5_1) ** GOTO lbl216
                throw null;
            }
lbl276:
            // 2 sources

            case 13: {
                var4_2 /* !! */  = (int)hh.ebbh("edhn", ebbe(int ), (int)621);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl312
            }
lbl281:
            // 2 sources

            case 14: {
                var4_2 /* !! */  = (int)hh.ebbh("edho", ebbe(int ), (int)622);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl312
            }
lbl286:
            // 2 sources

            case 15: {
                var4_2 /* !! */  = (int)hh.ebbh("edhp", ebbe(int ), (int)623);
                if (!var5_1) ** GOTO lbl231
                throw null;
            }
            case 16: {
                var4_2 /* !! */  = (int)hh.ebbh("edhq", ebbe(int ), (int)624);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl316
            }
            case 17: {
                var4_2 /* !! */  = (int)hh.ebbh("edhr", ebbe(int ), (int)625);
                if (!var5_1) ** GOTO lbl281
                throw null;
            }
lbl299:
            // 2 sources

            case 18: {
                var4_2 /* !! */  = (int)hh.ebbh("edhs", ebbe(int ), (int)626);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl312
            }
lbl304:
            // 2 sources

            case 19: {
                var4_2 /* !! */  = (int)hh.ebbh("edht", ebbe(int ), (int)627);
                if (!var5_1) ** GOTO lbl231
                throw null;
            }
            case 20: {
                var4_2 /* !! */  = (int)hh.ebbh("edhu", ebbe(int ), (int)628);
                if (!var5_1) ** GOTO lbl267
                throw null;
            }
lbl312:
            // 4 sources

            case 21: {
                var4_2 /* !! */  = (int)hh.ebbh("edhv", ebbe(int ), (int)629);
                if (!var5_1) ** GOTO lbl299
                throw null;
            }
lbl316:
            // 2 sources

            case 22: {
                var4_2 /* !! */  = (int)hh.ebbh("edhw", ebbe(int ), (int)630);
                if (!var5_1) ** GOTO lbl249
                throw null;
            }
lbl320:
            // 2 sources

            case 23: {
                var4_2 /* !! */  = (int)hh.ebbh("edhx", ebbe(int ), (int)631);
                if (!var5_1) ** GOTO lbl231
                throw null;
            }
            case 24: 
        }
        var4_2 /* !! */  = (int)hh.ebbh("edhy", ebbe(int ), (int)632);
        ** while (!var5_1)
lbl327:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private void cleanup() {
        boolean bl2;
        Object object = kf;
        block19: while (true) {
            switch ((int)object) {
                case 519574154: {
                    object = hh.ebbh("edia", ebes(int ), (int)421) - hh.ebbh("edhz", ebes(int ), (int)420);
                    continue block19;
                }
                case 672168633: {
                    break block19;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = kf;
        block20: while (true) {
            switch ((int)object2) {
                case -1846210716: {
                    object2 = hh.ebbh("edic", ebes(int ), (int)423) - hh.ebbh("edib", ebes(int ), (int)422);
                    continue block20;
                }
                case 672168633: {
                    break block20;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = kf - hh.ebbh("edid", ebes(int ), (int)424)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == hh.ebbh("edie", ebbe(int ), (int)633)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = hh.ebbh("edif", ebbe(int ), (int)634);
        }
        if (bl2 || bl2) return;
        CallSite callSite = hh.ebbh("edig", ebbe(int ), (int)635);
        Object object4 = kf;
        boolean bl4 = true;
        block22: while (true) {
            CallSite callSite2;
            if (!bl4 || (bl4 = false) || !true) {
                object4 = callSite2 - hh.ebbh("edih", ebes(int ), (int)425);
            }
            switch ((int)object4) {
                case -1665528852: {
                    callSite2 = hh.ebbh("edii", ebes(int ), (int)426);
                    continue block22;
                }
                case -210277546: {
                    callSite2 = hh.ebbh("edij", ebes(int ), (int)427);
                    continue block22;
                }
                case 672168633: {
                    break block22;
                }
            }
            break;
        }
        this.targetSlot = (int)callSite;
        if (bl2 || bl2) return;
        CallSite callSite3 = hh.ebbh("edik", ebbe(int ), (int)636);
        Object object5 = kf;
        boolean bl5 = true;
        block23: while (true) {
            CallSite callSite4;
            if (!bl5 || (bl5 = false) || !true) {
                object5 = callSite4 - hh.ebbh("edil", ebes(int ), (int)428);
            }
            switch ((int)object5) {
                case -800635150: {
                    callSite4 = hh.ebbh("edim", ebes(int ), (int)429);
                    continue block23;
                }
                case 171976641: {
                    callSite4 = hh.ebbh("edin", ebes(int ), (int)430);
                    continue block23;
                }
                case 496850616: {
                    callSite4 = hh.ebbh("edio", ebes(int ), (int)431);
                    continue block23;
                }
                case 672168633: {
                    break block23;
                }
            }
            break;
        }
        this.isFromHotbar = callSite3;
        if (!bl2 && !bl2) return;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("eefb", ebes(int ), (int)647)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hh.ebbh("eefc", ebbe(int ), (int)923)) break;
            v0 /* !! */  = (long)hh.ebbh("eefd", ebbe(int ), (int)924);
        }
        var3_1 = hh.c;
        v1 /* !! */  = hh.kf;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - hh.ebbh("eefe", ebes(int ), (int)648));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1456834127: {
                    v2 = hh.ebbh("eeff", ebes(int ), (int)649);
                    continue block12;
                }
                case -918830413: {
                    v2 = hh.ebbh("eefg", ebes(int ), (int)650);
                    continue block12;
                }
                case 672168633: {
                    break block12;
                }
                case 2018082786: {
                    v2 = hh.ebbh("eefh", ebes(int ), (int)651);
                    continue block12;
                }
            }
            break;
        }
        var2_2 = hh.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("eefi", ebes(int ), (int)652)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hh.ebbh("eefj", ebbe(int ), (int)925)) break;
            v3 /* !! */  = (long)hh.ebbh("eefk", ebbe(int ), (int)926);
        }
        var1_3 = hh.a;
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
            if ((v4 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("eefl", ebes(int ), (int)653)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == hh.ebbh("eefm", ebbe(int ), (int)927)) break;
            v4 /* !! */  = (long)hh.ebbh("eefn", ebbe(int ), (int)928);
        }
        v5 /* !! */  = hh.kf;
        if (true) ** GOTO lbl47
        block16: while (true) {
            v5 /* !! */  = (long)(v6 - hh.ebbh("eefo", ebes(int ), (int)654));
lbl47:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1608279854: {
                    v6 = hh.ebbh("eefp", ebes(int ), (int)655);
                    continue block16;
                }
                case 672168633: {
                    break block16;
                }
                case 895698679: {
                    v6 = hh.ebbh("efmx", ebes(int ), (int)656);
                    continue block16;
                }
            }
            break;
        }
        v7 = this.mode.isSelected("\u041e\u0431\u044b\u0447\u043d\u044b\u0439");
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = hh.kf - hh.ebbh("efmy", ebes(int ), (int)657)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v8 /* !! */  == hh.ebbh("efmz", ebbe(int ), (int)929)) break;
            v8 /* !! */  = (long)hh.ebbh("efna", ebbe(int ), (int)930);
        }
        return v7;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$1() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("eeee", ebes(int ), (int)634)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hh.ebbh("eeef", ebbe(int ), (int)913)) break;
            v0 /* !! */  = (long)hh.ebbh("eeeg", ebbe(int ), (int)914);
        }
        var3_1 = hh.c;
        v1 /* !! */  = hh.kf;
        if (true) ** GOTO lbl12
        block23: while (true) {
            v1 /* !! */  = (long)(v2 - hh.ebbh("eeeh", ebes(int ), (int)635));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1181375594: {
                    v2 = hh.ebbh("eeei", ebes(int ), (int)636);
                    continue block23;
                }
                case -1077173017: {
                    v2 = hh.ebbh("eeej", ebes(int ), (int)637);
                    continue block23;
                }
                case -529168756: {
                    v2 = hh.ebbh("eeek", ebes(int ), (int)638);
                    continue block23;
                }
                case 672168633: {
                    break block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = hh.b;
        v3 /* !! */  = hh.kf;
        if (true) ** GOTO lbl29
        block24: while (true) {
            v3 /* !! */  = (long)(hh.ebbh("eeem", ebes(int ), (int)640) - hh.ebbh("eeel", ebes(int ), (int)639));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 624658643: {
                    continue block24;
                }
                case 672168633: {
                    break block24;
                }
            }
            break;
        }
        var1_3 = hh.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("eeen", ebes(int ), (int)641)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hh.ebbh("eeeo", ebbe(int ), (int)915)) break;
                    v4 /* !! */  = (long)hh.ebbh("eeep", ebbe(int ), (int)916);
                }
                v5 /* !! */  = hh.kf;
                if (true) ** GOTO lbl54
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - hh.ebbh("eeeq", ebes(int ), (int)642));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1609005144: {
                            v6 = hh.ebbh("eeer", ebes(int ), (int)643);
                            continue block27;
                        }
                        case 143749689: {
                            v6 = hh.ebbh("eees", ebes(int ), (int)644);
                            continue block27;
                        }
                        case 478462974: {
                            v6 = hh.ebbh("eeet", ebes(int ), (int)645);
                            continue block27;
                        }
                        case 672168633: {
                            break block27;
                        }
                    }
                    break;
                }
                v7 = this.mode.isSelected("\u0422\u0440\u043e\u0439\u043d\u043e\u0439");
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("eeeu", ebes(int ), (int)646)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == hh.ebbh("eeev", ebbe(int ), (int)917)) break;
                    v8 /* !! */  = (long)hh.ebbh("eeew", ebbe(int ), (int)918);
                }
                return v7;
            }
            case 0: {
                var2_2 /* !! */  = (int)hh.ebbh("eeex", ebbe(int ), (int)919);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl83
            }
            case 1: {
                var2_2 /* !! */  = (int)hh.ebbh("eeey", ebbe(int ), (int)920);
                if (!var3_1) break;
                throw null;
            }
lbl83:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)hh.ebbh("eeez", ebbe(int ), (int)921);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hh.ebbh("eefa", ebbe(int ), (int)922);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void efnm() {
        hh.ebbf[700] = -930906960;
        hh.ebbf[701] = -707800776;
        hh.ebbf[702] = 1920227308;
        hh.ebbf[703] = -1580594333;
        hh.ebbf[704] = 1401146732;
        hh.ebbf[705] = 146832473;
        hh.ebbf[706] = 876034827;
        hh.ebbf[707] = -259673163;
        hh.ebbf[708] = 666421787;
        hh.ebbf[709] = -1571251757;
        hh.ebbf[710] = 1330798333;
        hh.ebbf[711] = -1243761908;
        hh.ebbf[712] = -1216421761;
        hh.ebbf[713] = -561523472;
        hh.ebbf[714] = 259028906;
        hh.ebbf[715] = -745857672;
        hh.ebbf[716] = -1421432691;
        hh.ebbf[717] = 322744951;
        hh.ebbf[718] = 110176578;
        hh.ebbf[719] = 1419385011;
        hh.ebbf[720] = -2075095847;
        hh.ebbf[721] = -1761243336;
        hh.ebbf[722] = 1948513538;
        hh.ebbf[723] = 25064752;
        hh.ebbf[724] = 1376987902;
        hh.ebbf[725] = -583939999;
        hh.ebbf[726] = 849370601;
        hh.ebbf[727] = 97517150;
        hh.ebbf[728] = 252089073;
        hh.ebbf[729] = -597816102;
        hh.ebbf[730] = 224732149;
        hh.ebbf[731] = 271446201;
        hh.ebbf[732] = -1619313823;
        hh.ebbf[733] = -64040282;
        hh.ebbf[734] = -1863646988;
        hh.ebbf[735] = -2001482247;
        hh.ebbf[736] = -1858862743;
        hh.ebbf[737] = -830674497;
        hh.ebbf[738] = -1795183049;
        hh.ebbf[739] = -1128407404;
        hh.ebbf[740] = -1695163790;
        hh.ebbf[741] = 729549169;
        hh.ebbf[742] = -825690887;
        hh.ebbf[743] = -753813806;
        hh.ebbf[744] = 1804761401;
        hh.ebbf[745] = 1472871259;
        hh.ebbf[746] = 340162460;
        hh.ebbf[747] = -2060944339;
        hh.ebbf[748] = 318087083;
        hh.ebbf[749] = -961222907;
        hh.ebbf[750] = 615811384;
        hh.ebbf[751] = 1462773172;
        hh.ebbf[752] = -710889661;
        hh.ebbf[753] = 1555660602;
        hh.ebbf[754] = 551773730;
        hh.ebbf[755] = 2131886141;
        hh.ebbf[756] = 697491478;
        hh.ebbf[757] = 1742583504;
        hh.ebbf[758] = -535339384;
        hh.ebbf[759] = -773357024;
        hh.ebbf[760] = -1556897557;
        hh.ebbf[761] = -625219404;
        hh.ebbf[762] = 1053761519;
        hh.ebbf[763] = -1728933151;
        hh.ebbf[764] = -2103009648;
        hh.ebbf[765] = -1360464620;
        hh.ebbf[766] = 1936839300;
        hh.ebbf[767] = 1733657233;
        hh.ebbf[768] = -1626107321;
        hh.ebbf[769] = -1005912169;
        hh.ebbf[770] = -1347688297;
        hh.ebbf[771] = -1070503454;
        hh.ebbf[772] = 1845600798;
        hh.ebbf[773] = 966195082;
        hh.ebbf[774] = -1639489550;
        hh.ebbf[775] = -258348628;
        hh.ebbf[776] = -1091839698;
        hh.ebbf[777] = 826054826;
        hh.ebbf[778] = 2008386844;
        hh.ebbf[779] = 956251681;
        hh.ebbf[780] = 73206989;
        hh.ebbf[781] = 964448267;
        hh.ebbf[782] = 980601079;
        hh.ebbf[783] = -208494269;
        hh.ebbf[784] = -193259819;
        hh.ebbf[785] = -1059781559;
        hh.ebbf[786] = 1900507184;
        hh.ebbf[787] = 401090592;
        hh.ebbf[788] = 43889792;
        hh.ebbf[789] = -482463487;
        hh.ebbf[790] = -271911666;
        hh.ebbf[791] = -1996869617;
        hh.ebbf[792] = -1826887291;
        hh.ebbf[793] = 1766370006;
        hh.ebbf[794] = 1728242845;
        hh.ebbf[795] = 233316639;
        hh.ebbf[796] = -1677977461;
        hh.ebbf[797] = 1864574796;
        hh.ebbf[798] = -1566491873;
        hh.ebbf[799] = -45824258;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$2() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("eedi", ebes(int ), (int)624)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hh.ebbh("eedj", ebbe(int ), (int)901)) break;
            v0 /* !! */  = (long)hh.ebbh("eedk", ebbe(int ), (int)902);
        }
        var3_1 = hh.c;
        v1 /* !! */  = hh.kf;
        if (true) ** GOTO lbl11
        block17: while (true) {
            v1 /* !! */  = (long)(hh.ebbh("eedm", ebes(int ), (int)626) - hh.ebbh("eedl", ebes(int ), (int)625));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 672168633: {
                    break block17;
                }
                case 911362789: {
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = hh.b;
        v2 /* !! */  = hh.kf;
        if (true) ** GOTO lbl21
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - hh.ebbh("eedn", ebes(int ), (int)627));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2091723823: {
                    v3 = hh.ebbh("eedo", ebes(int ), (int)628);
                    continue block18;
                }
                case 349385542: {
                    v3 = hh.ebbh("eedp", ebes(int ), (int)629);
                    continue block18;
                }
                case 672168633: {
                    break block18;
                }
                case 958791068: {
                    v3 = hh.ebbh("eedq", ebes(int ), (int)630);
                    continue block18;
                }
            }
            break;
        }
        var1_3 = hh.a;
        if (var3_1) {
            throw null;
lbl36:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl39:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("eedr", ebes(int ), (int)631)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == hh.ebbh("eeds", ebbe(int ), (int)903)) break;
                    v4 /* !! */  = (long)hh.ebbh("eedt", ebbe(int ), (int)904);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("eedu", ebes(int ), (int)632)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == hh.ebbh("eedv", ebbe(int ), (int)905)) break;
                    v5 /* !! */  = (long)hh.ebbh("eedw", ebbe(int ), (int)906);
                }
                v6 = this.mode.isSelected("\u041e\u0431\u044b\u0447\u043d\u044b\u0439");
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = hh.kf - hh.ebbh("eedx", ebes(int ), (int)633)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == hh.ebbh("eedy", ebbe(int ), (int)907)) break;
                    v7 /* !! */  = (long)hh.ebbh("eedz", ebbe(int ), (int)908);
                }
                return v6;
            }
lbl59:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hh.ebbh("eeea", ebbe(int ), (int)909);
                if (!var3_1) break;
                throw null;
            }
lbl63:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hh.ebbh("eeeb", ebbe(int ), (int)910);
                if (!var3_1) ** GOTO lbl59
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hh.ebbh("eeec", ebbe(int ), (int)911);
                    if (!var3_1) ** GOTO lbl63
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hh.ebbh("eeed", ebbe(int ), (int)912);
        ** while (!var3_1)
lbl75:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void efol() {
        hh.ebeu[500] = -241366541566840773L;
        hh.ebeu[501] = 2680324752609563781L;
        hh.ebeu[502] = 3480244546790775890L;
        hh.ebeu[503] = 4694231444138150133L;
        hh.ebeu[504] = -8796928105805279234L;
        hh.ebeu[505] = 3231267379859096369L;
        hh.ebeu[506] = -7037853610235619964L;
        hh.ebeu[507] = -8956618701369593468L;
        hh.ebeu[508] = -8749664558184966770L;
        hh.ebeu[509] = 3543473653823842931L;
        hh.ebeu[510] = -3814500560144220707L;
        hh.ebeu[511] = 986351988558620037L;
        hh.ebeu[512] = 4975468983860074192L;
        hh.ebeu[513] = -2003375220816753669L;
        hh.ebeu[514] = 3600300435279602762L;
        hh.ebeu[515] = 1314321199696559144L;
        hh.ebeu[516] = 3563674655520695246L;
        hh.ebeu[517] = -255701444872793480L;
        hh.ebeu[518] = 6653217595681952519L;
        hh.ebeu[519] = 8017244718650125870L;
        hh.ebeu[520] = -8495227250297820418L;
        hh.ebeu[521] = -4740897176895288097L;
        hh.ebeu[522] = -5501155206074974124L;
        hh.ebeu[523] = -8092818911685205933L;
        hh.ebeu[524] = 2118952293269823467L;
        hh.ebeu[525] = -2397282132738695848L;
        hh.ebeu[526] = -1255726415458447192L;
        hh.ebeu[527] = -6762212284210183488L;
        hh.ebeu[528] = 2878903473600801172L;
        hh.ebeu[529] = 8122210713683091873L;
        hh.ebeu[530] = 1470184223474744828L;
        hh.ebeu[531] = 6959890743462270021L;
        hh.ebeu[532] = -7642511401116989102L;
        hh.ebeu[533] = 105807066035699849L;
        hh.ebeu[534] = 8145544142424585270L;
        hh.ebeu[535] = -60475378749234060L;
        hh.ebeu[536] = -374502966440153464L;
        hh.ebeu[537] = 1434316813719119774L;
        hh.ebeu[538] = 2526859981832741182L;
        hh.ebeu[539] = -976525551275091198L;
        hh.ebeu[540] = 7972846931611395152L;
        hh.ebeu[541] = -2687267824468245287L;
        hh.ebeu[542] = 8593511595968581546L;
        hh.ebeu[543] = 9062824248766192228L;
        hh.ebeu[544] = -6072331021430388001L;
        hh.ebeu[545] = -144199507862419907L;
        hh.ebeu[546] = 6369027602836245730L;
        hh.ebeu[547] = -2932439166243252120L;
        hh.ebeu[548] = -4590877957619104010L;
        hh.ebeu[549] = -6568793209385609516L;
        hh.ebeu[550] = 8769266424214940494L;
        hh.ebeu[551] = 2205627799703817134L;
        hh.ebeu[552] = 7861111150936663585L;
        hh.ebeu[553] = -4822616827825764588L;
        hh.ebeu[554] = 538975485429340016L;
        hh.ebeu[555] = 506093087147148515L;
        hh.ebeu[556] = -3096409506599661571L;
        hh.ebeu[557] = -2622627322520533228L;
        hh.ebeu[558] = -3924925737076139564L;
        hh.ebeu[559] = -6502366529226771655L;
        hh.ebeu[560] = 6492165718164920148L;
        hh.ebeu[561] = 5217030008733822635L;
        hh.ebeu[562] = -2772009429580607588L;
        hh.ebeu[563] = -5546382535789575369L;
        hh.ebeu[564] = -8830352839465981644L;
        hh.ebeu[565] = -5845495006824292649L;
        hh.ebeu[566] = 8839977567164910992L;
        hh.ebeu[567] = 4353194051416514757L;
        hh.ebeu[568] = -2666596887441593233L;
        hh.ebeu[569] = 7860443914865809884L;
        hh.ebeu[570] = -8831706965706376935L;
        hh.ebeu[571] = -4981110394821139235L;
        hh.ebeu[572] = 6249705599523678342L;
        hh.ebeu[573] = -6598609539734265219L;
        hh.ebeu[574] = 7364006961550928911L;
        hh.ebeu[575] = -6481261077382948759L;
        hh.ebeu[576] = 1990624541114665761L;
        hh.ebeu[577] = 4082247730276968831L;
        hh.ebeu[578] = 8840366069693259366L;
        hh.ebeu[579] = 4216311314070585034L;
        hh.ebeu[580] = -8127501031818075354L;
        hh.ebeu[581] = 4540433505478831175L;
        hh.ebeu[582] = -6888728553225955804L;
        hh.ebeu[583] = -3160880164125869840L;
        hh.ebeu[584] = 8672714714243692832L;
        hh.ebeu[585] = -6708755236370824147L;
        hh.ebeu[586] = -5227844957098090226L;
        hh.ebeu[587] = 6996334648880648602L;
        hh.ebeu[588] = 2942786144286517805L;
        hh.ebeu[589] = 2163039150762182462L;
        hh.ebeu[590] = 4456228887370773715L;
        hh.ebeu[591] = -3395289776021675552L;
        hh.ebeu[592] = -816677573237006308L;
        hh.ebeu[593] = 1020875602497635891L;
        hh.ebeu[594] = -6839323776137825267L;
        hh.ebeu[595] = -1452373010565065756L;
        hh.ebeu[596] = -506789072649182612L;
        hh.ebeu[597] = 1150351153018975870L;
        hh.ebeu[598] = 4646922827681851999L;
        hh.ebeu[599] = -8677303117554976307L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean sameRingItem(class_1799 var1_1, class_1799 var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("edyp", ebes(int ), (int)569)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hh.ebbh("edyq", ebbe(int ), (int)833)) break;
            v0 /* !! */  = (long)hh.ebbh("edyr", ebbe(int ), (int)834);
        }
        var5_3 = hh.c;
        v1 /* !! */  = hh.kf;
        if (true) ** GOTO lbl12
        block24: while (true) {
            v1 /* !! */  = (long)(v2 - hh.ebbh("edys", ebes(int ), (int)570));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1108451704: {
                    v2 = hh.ebbh("edyt", ebes(int ), (int)571);
                    continue block24;
                }
                case -872892217: {
                    v2 = hh.ebbh("edyu", ebes(int ), (int)572);
                    continue block24;
                }
                case 672168633: {
                    break block24;
                }
            }
            break;
        }
        var4_4 /* !! */  = hh.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("edyv", ebes(int ), (int)573)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hh.ebbh("edyw", ebbe(int ), (int)835)) break;
            v3 /* !! */  = (long)hh.ebbh("edyx", ebbe(int ), (int)836);
        }
        var3_5 = hh.a;
        if (var5_3) {
            throw null;
lbl31:
            // 6 sources

            return (boolean)hh.ebbh("edyy", ebbe(int ), (int)837);
        }
        if (var3_5) ** GOTO lbl31
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** GOTO lbl31
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("edyz", ebes(int ), (int)574)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hh.ebbh("edza", ebbe(int ), (int)838)) break;
                    v4 /* !! */  = (long)hh.ebbh("edzb", ebbe(int ), (int)839);
                }
                if (!this.isSelectableRingItem(var1_1)) ** GOTO lbl76
                if (var3_5) ** GOTO lbl31
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = hh.kf - hh.ebbh("edzc", ebes(int ), (int)575)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hh.ebbh("edzd", ebbe(int ), (int)840)) break;
                    v5 /* !! */  = (long)hh.ebbh("edze", ebbe(int ), (int)841);
                }
                if (!this.isSelectableRingItem(var2_2)) ** GOTO lbl76
                if (var3_5) ** GOTO lbl31
                v6 /* !! */  = hh.kf;
                if (true) ** GOTO lbl58
                block29: while (true) {
                    v6 /* !! */  = (long)(v7 - hh.ebbh("edzf", ebes(int ), (int)576));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 422476188: {
                            v7 = hh.ebbh("edzg", ebes(int ), (int)577);
                            continue block29;
                        }
                        case 666297832: {
                            v7 = hh.ebbh("edzh", ebes(int ), (int)578);
                            continue block29;
                        }
                        case 672168633: {
                            break block29;
                        }
                        case 731467747: {
                            v7 = hh.ebbh("edzi", ebes(int ), (int)579);
                            continue block29;
                        }
                    }
                    break;
                }
                if (!class_1799.method_31577((class_1799)var1_1, (class_1799)var2_2)) ** GOTO lbl76
                if (var3_5) ** GOTO lbl31
                v8 = hh.ebbh("edzj", ebbe(int ), (int)842);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl79
lbl76:
                // 3 sources

                if (!var3_5 && !var3_5) ** break;
                ** continue;
                v8 = hh.ebbh("edzk", ebbe(int ), (int)843);
lbl79:
                // 2 sources

                return (boolean)v8;
            }
lbl80:
            // 3 sources

            case 0: {
                var4_4 /* !! */  = (int)hh.ebbh("edzl", ebbe(int ), (int)844);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl112
            }
            case 1: {
                var4_4 /* !! */  = (int)hh.ebbh("edzm", ebbe(int ), (int)845);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl112
            }
            case 2: {
                var4_4 /* !! */  = (int)hh.ebbh("edzn", ebbe(int ), (int)846);
                if (!var5_3) ** GOTO lbl80
                throw null;
            }
lbl94:
            // 3 sources

            case 3: {
                var4_4 /* !! */  = (int)hh.ebbh("edzo", ebbe(int ), (int)847);
                if (!var5_3) ** GOTO lbl80
                throw null;
            }
lbl98:
            // 3 sources

            case 4: {
                var4_4 /* !! */  = (int)hh.ebbh("edzp", ebbe(int ), (int)848);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl107
            }
            case 5: {
                var4_4 /* !! */  = (int)hh.ebbh("edzq", ebbe(int ), (int)849);
                if (!var5_3) ** GOTO lbl94
                throw null;
            }
lbl107:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)hh.ebbh("edzr", ebbe(int ), (int)850);
                    if (!var5_3) ** GOTO lbl98
                    throw null;
                }
            }
lbl112:
            // 3 sources

            case 7: {
                var4_4 /* !! */  = (int)hh.ebbh("edzs", ebbe(int ), (int)851);
                if (!var5_3) ** GOTO lbl98
                throw null;
            }
            case 8: {
                var4_4 /* !! */  = (int)hh.ebbh("edzt", ebbe(int ), (int)852);
                if (!var5_3) ** GOTO lbl94
                throw null;
            }
            case 9: 
        }
        var4_4 /* !! */  = (int)hh.ebbh("edzu", ebbe(int ), (int)853);
        ** while (!var5_3)
lbl123:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void efoh() {
        hh.ebeu[100] = -7780307672477986643L;
        hh.ebeu[101] = -123028723482226331L;
        hh.ebeu[102] = 7625209034623330143L;
        hh.ebeu[103] = -3462467618533722054L;
        hh.ebeu[104] = -1480806948744011956L;
        hh.ebeu[105] = 2991547062859735868L;
        hh.ebeu[106] = -7041567543125927834L;
        hh.ebeu[107] = -325284633491241890L;
        hh.ebeu[108] = 5261834325621191058L;
        hh.ebeu[109] = -4561358080783193774L;
        hh.ebeu[110] = 5083392589653102073L;
        hh.ebeu[111] = 5967643497924199060L;
        hh.ebeu[112] = -2666225684901973272L;
        hh.ebeu[113] = 7073876668199724067L;
        hh.ebeu[114] = 3655885371262697074L;
        hh.ebeu[115] = 5901410530429197525L;
        hh.ebeu[116] = 769471177257706788L;
        hh.ebeu[117] = 6848959546873607428L;
        hh.ebeu[118] = -7138986611166571213L;
        hh.ebeu[119] = 4671709849687784707L;
        hh.ebeu[120] = 3141227869461339961L;
        hh.ebeu[121] = -7554842914948996039L;
        hh.ebeu[122] = -8346561813409912924L;
        hh.ebeu[123] = 4988284645345804640L;
        hh.ebeu[124] = -1414326129697332245L;
        hh.ebeu[125] = 7330956320042506595L;
        hh.ebeu[126] = -9092171645600387638L;
        hh.ebeu[127] = 2876306737722410413L;
        hh.ebeu[128] = 6202824152474708282L;
        hh.ebeu[129] = -7741876287032863473L;
        hh.ebeu[130] = -4354218040892128125L;
        hh.ebeu[131] = 953061199758193994L;
        hh.ebeu[132] = -4660744093947771364L;
        hh.ebeu[133] = -4158611345738344323L;
        hh.ebeu[134] = -2929699145352132350L;
        hh.ebeu[135] = -659396387360370122L;
        hh.ebeu[136] = -8251353926414779231L;
        hh.ebeu[137] = -1831864973410341920L;
        hh.ebeu[138] = -4536407355045586131L;
        hh.ebeu[139] = -5618843203947020173L;
        hh.ebeu[140] = 744154712806020092L;
        hh.ebeu[141] = -5833589384330696634L;
        hh.ebeu[142] = 4405158347537709213L;
        hh.ebeu[143] = -83379249523605708L;
        hh.ebeu[144] = 254761245112841796L;
        hh.ebeu[145] = 3744414467255485327L;
        hh.ebeu[146] = 7010719203545600687L;
        hh.ebeu[147] = -3174017812245132775L;
        hh.ebeu[148] = -1491873814388580417L;
        hh.ebeu[149] = 3972490650771936330L;
        hh.ebeu[150] = -3367831548978864593L;
        hh.ebeu[151] = 1083366597066821342L;
        hh.ebeu[152] = 4920818362354121709L;
        hh.ebeu[153] = 7404885836436952149L;
        hh.ebeu[154] = -8144039579360229815L;
        hh.ebeu[155] = -258052680518881767L;
        hh.ebeu[156] = -9140819607013966044L;
        hh.ebeu[157] = 5115355622670662630L;
        hh.ebeu[158] = 3980002406119255893L;
        hh.ebeu[159] = -561375816305155077L;
        hh.ebeu[160] = -4045001787137319345L;
        hh.ebeu[161] = 7385970643028533918L;
        hh.ebeu[162] = 6016346293160687976L;
        hh.ebeu[163] = -4751511165483595476L;
        hh.ebeu[164] = 4203463092297208229L;
        hh.ebeu[165] = -2694177062146119926L;
        hh.ebeu[166] = 8213779209421761293L;
        hh.ebeu[167] = 4951658773545350244L;
        hh.ebeu[168] = -2103277971732388400L;
        hh.ebeu[169] = -4688224239572613738L;
        hh.ebeu[170] = -5857516442455376669L;
        hh.ebeu[171] = -8232853083609630903L;
        hh.ebeu[172] = 1088926158220910062L;
        hh.ebeu[173] = -1606853606262599985L;
        hh.ebeu[174] = -8629228354152801610L;
        hh.ebeu[175] = 6899470320195512944L;
        hh.ebeu[176] = 789709953690234649L;
        hh.ebeu[177] = 1828269766597942010L;
        hh.ebeu[178] = -6545457655963236392L;
        hh.ebeu[179] = 516568169914842609L;
        hh.ebeu[180] = -2591801478170450189L;
        hh.ebeu[181] = 1403869140422388402L;
        hh.ebeu[182] = 8094152148155387758L;
        hh.ebeu[183] = 2191719639385476571L;
        hh.ebeu[184] = 6681569416063658327L;
        hh.ebeu[185] = 1456119202763675370L;
        hh.ebeu[186] = 8872514612041556486L;
        hh.ebeu[187] = -5095792681981993949L;
        hh.ebeu[188] = 2621424622506544294L;
        hh.ebeu[189] = -7551567105193146636L;
        hh.ebeu[190] = -9166954315873326814L;
        hh.ebeu[191] = 7033439570574747206L;
        hh.ebeu[192] = 3509352978112571860L;
        hh.ebeu[193] = 2426251565839992508L;
        hh.ebeu[194] = -5628380263840039600L;
        hh.ebeu[195] = -3036524883447153975L;
        hh.ebeu[196] = 8252220181113139554L;
        hh.ebeu[197] = -1574883737122629291L;
        hh.ebeu[198] = -3292165221964044789L;
        hh.ebeu[199] = -8115270956384490312L;
    }

    private static /* synthetic */ void efoj() {
        hh.ebeu[300] = -3175831250078519796L;
        hh.ebeu[301] = 2390588726673144274L;
        hh.ebeu[302] = -2120670854630597558L;
        hh.ebeu[303] = 1908075780188854312L;
        hh.ebeu[304] = 5144496150438323603L;
        hh.ebeu[305] = -7842965165755967874L;
        hh.ebeu[306] = -5486075461244536500L;
        hh.ebeu[307] = 8071667382056074461L;
        hh.ebeu[308] = 7498091457449265308L;
        hh.ebeu[309] = -1194835303428269553L;
        hh.ebeu[310] = -4507529345283032111L;
        hh.ebeu[311] = 7112591601401646960L;
        hh.ebeu[312] = 7005675773550008461L;
        hh.ebeu[313] = -4672395051723538374L;
        hh.ebeu[314] = 7692249403792984493L;
        hh.ebeu[315] = -3165760411858509501L;
        hh.ebeu[316] = -9217449799897064616L;
        hh.ebeu[317] = -4541616820670411004L;
        hh.ebeu[318] = 2099776807647950988L;
        hh.ebeu[319] = 5613052425801799838L;
        hh.ebeu[320] = 8105176230063916963L;
        hh.ebeu[321] = -6316302831880346996L;
        hh.ebeu[322] = 3825291027639086094L;
        hh.ebeu[323] = -1780586274620537032L;
        hh.ebeu[324] = 7303003459521353489L;
        hh.ebeu[325] = -6304321708421544776L;
        hh.ebeu[326] = 39300153394172953L;
        hh.ebeu[327] = 3242730197613459689L;
        hh.ebeu[328] = 7839248294054461847L;
        hh.ebeu[329] = 3612996475855788584L;
        hh.ebeu[330] = 1509763252000567208L;
        hh.ebeu[331] = 7932054970271205051L;
        hh.ebeu[332] = -2221029593129694121L;
        hh.ebeu[333] = -8689247214340382327L;
        hh.ebeu[334] = 6479952419765241682L;
        hh.ebeu[335] = -1656324852788945232L;
        hh.ebeu[336] = 2476691120890775450L;
        hh.ebeu[337] = 2093298431519987464L;
        hh.ebeu[338] = -8177272450382352258L;
        hh.ebeu[339] = -5586379281762403155L;
        hh.ebeu[340] = 7983305991444495711L;
        hh.ebeu[341] = -8763665727184112301L;
        hh.ebeu[342] = 1713184704296164485L;
        hh.ebeu[343] = -6922043519684065023L;
        hh.ebeu[344] = -3966903255957755426L;
        hh.ebeu[345] = -6567441151695211546L;
        hh.ebeu[346] = 709238874482005569L;
        hh.ebeu[347] = -8746343179399040106L;
        hh.ebeu[348] = 6952483009584247355L;
        hh.ebeu[349] = -4221717249008063111L;
        hh.ebeu[350] = -6545071422584527500L;
        hh.ebeu[351] = -4909333764374748806L;
        hh.ebeu[352] = -6281412281377762227L;
        hh.ebeu[353] = 6535018646294188932L;
        hh.ebeu[354] = 7701453971677991474L;
        hh.ebeu[355] = -6159712460793404964L;
        hh.ebeu[356] = -5013028158335279533L;
        hh.ebeu[357] = 4720805428533022768L;
        hh.ebeu[358] = -3146637099573893288L;
        hh.ebeu[359] = -1061489346572261763L;
        hh.ebeu[360] = -3763920256129803203L;
        hh.ebeu[361] = -1949090207791416036L;
        hh.ebeu[362] = -8144428011329949159L;
        hh.ebeu[363] = -7705485731267172215L;
        hh.ebeu[364] = -6980185467973891104L;
        hh.ebeu[365] = -6822924253499924384L;
        hh.ebeu[366] = 5679715835474673668L;
        hh.ebeu[367] = 7520176772917774657L;
        hh.ebeu[368] = 1101714504509535667L;
        hh.ebeu[369] = 2867016405461963800L;
        hh.ebeu[370] = -2455422262109647148L;
        hh.ebeu[371] = 5657213852124487421L;
        hh.ebeu[372] = -2723243885167970925L;
        hh.ebeu[373] = -1797499862117687505L;
        hh.ebeu[374] = -7493486335101389905L;
        hh.ebeu[375] = 5245070148662612644L;
        hh.ebeu[376] = -433833537691857262L;
        hh.ebeu[377] = -741246691128341442L;
        hh.ebeu[378] = -8017765042112147295L;
        hh.ebeu[379] = 6779547024917319484L;
        hh.ebeu[380] = 4982432511842669525L;
        hh.ebeu[381] = 8374398417251134962L;
        hh.ebeu[382] = 603123406250870499L;
        hh.ebeu[383] = 4615382027463303646L;
        hh.ebeu[384] = 841307595977347283L;
        hh.ebeu[385] = -3984556172942393674L;
        hh.ebeu[386] = 3998046596248969781L;
        hh.ebeu[387] = -5511985878078075204L;
        hh.ebeu[388] = -3299469136509176446L;
        hh.ebeu[389] = -7707930773659808186L;
        hh.ebeu[390] = -2452563775694395450L;
        hh.ebeu[391] = -4230441251785657781L;
        hh.ebeu[392] = 7221315945321094053L;
        hh.ebeu[393] = -4455630022981576393L;
        hh.ebeu[394] = -9061067072043381387L;
        hh.ebeu[395] = -6340791939708869193L;
        hh.ebeu[396] = -8586036919846805537L;
        hh.ebeu[397] = -930059299627707164L;
        hh.ebeu[398] = 4215289186918127330L;
        hh.ebeu[399] = 5689299753816427396L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int findExactItem(class_1799 var1_1) {
        v0 /* !! */  = hh.kf;
        if (true) ** GOTO lbl5
        block65: while (true) {
            v0 /* !! */  = (long)(v1 - hh.ebbh("edwb", ebes(int ), (int)541));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -436848511: {
                    v1 = hh.ebbh("edwc", ebes(int ), (int)542);
                    continue block65;
                }
                case 672168633: {
                    break block65;
                }
                case 1032662247: {
                    v1 = hh.ebbh("edwd", ebes(int ), (int)543);
                    continue block65;
                }
                case 1797283774: {
                    v1 = hh.ebbh("edwe", ebes(int ), (int)544);
                    continue block65;
                }
            }
            break;
        }
        var5_2 = hh.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("edwf", ebes(int ), (int)545)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hh.ebbh("edwg", ebbe(int ), (int)795)) break;
            v2 /* !! */  = (long)hh.ebbh("edwh", ebbe(int ), (int)796);
        }
        var4_3 /* !! */  = hh.b;
        v3 /* !! */  = hh.kf;
        if (true) ** GOTO lbl28
        block67: while (true) {
            v3 /* !! */  = (long)(hh.ebbh("edwj", ebes(int ), (int)547) - hh.ebbh("edwi", ebes(int ), (int)546));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1117633429: {
                    continue block67;
                }
                case 672168633: {
                    break block67;
                }
            }
            break;
        }
        var3_4 = hh.a;
        if (var5_2) {
            throw null;
lbl36:
            // 13 sources

            return (int)hh.ebbh("edwk", ebbe(int ), (int)797);
        }
        if (var3_4 || var3_4) ** GOTO lbl36
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("edwl", ebes(int ), (int)548)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == hh.ebbh("edwm", ebbe(int ), (int)798)) break;
            v4 /* !! */  = (long)hh.ebbh("edwn", ebbe(int ), (int)799);
        }
        v5 /* !! */  = hh.kf;
        if (true) ** GOTO lbl48
        block70: while (true) {
            v5 /* !! */  = (long)(v6 - hh.ebbh("edwo", ebes(int ), (int)549));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 672168633: {
                    break block70;
                }
                case 1652904833: {
                    v6 = hh.ebbh("edwp", ebes(int ), (int)550);
                    continue block70;
                }
                case 2023600740: {
                    v6 = hh.ebbh("edwq", ebes(int ), (int)551);
                    continue block70;
                }
            }
            break;
        }
        if (hh.mc.field_1724 == null) ** GOTO lbl79
        if (var3_4) ** GOTO lbl36
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_1 == null) ** GOTO lbl79
                if (var3_4) ** GOTO lbl36
                v7 /* !! */  = hh.kf;
                if (true) ** GOTO lbl68
                block71: while (true) {
                    v7 /* !! */  = (long)(v8 - hh.ebbh("edwr", ebes(int ), (int)552));
lbl68:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1719163263: {
                            v8 = hh.ebbh("edws", ebes(int ), (int)553);
                            continue block71;
                        }
                        case -166272223: {
                            v8 = hh.ebbh("edwt", ebes(int ), (int)554);
                            continue block71;
                        }
                        case 672168633: {
                            break block71;
                        }
                    }
                    break;
                }
                if (!var1_1.method_7960()) ** GOTO lbl81
                if (var3_4) ** GOTO lbl36
lbl79:
                // 3 sources

                if (var3_4 || var3_4) ** GOTO lbl36
                return (int)hh.ebbh("edwu", ebbe(int ), (int)800);
lbl81:
                // 1 sources

                if (var3_4 || var3_4) ** GOTO lbl36
                var2_5 = hh.ebbh("edwv", ebbe(int ), (int)801);
                if (var3_4) ** GOTO lbl36
                do {
                    if (var3_4 || var3_4) ** GOTO lbl36
                    if (var2_5 >= hh.ebbh("edww", ebbe(int ), (int)802)) ** GOTO lbl157
                    if (var3_4 || var3_4) ** GOTO lbl36
                    v9 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl92
                    block73: while (true) {
                        v9 /* !! */  = (long)(v10 - hh.ebbh("edwx", ebes(int ), (int)555));
lbl92:
                        // 2 sources

                        switch ((int)v9 /* !! */ ) {
                            case -966083832: {
                                v10 = hh.ebbh("edwy", ebes(int ), (int)556);
                                continue block73;
                            }
                            case -300290058: {
                                v10 = hh.ebbh("edwz", ebes(int ), (int)557);
                                continue block73;
                            }
                            case -101886998: {
                                v10 = hh.ebbh("edxa", ebes(int ), (int)558);
                                continue block73;
                            }
                            case 672168633: {
                                break block73;
                            }
                        }
                        break;
                    }
                    v11 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl108
                    block74: while (true) {
                        v11 /* !! */  = (long)(v12 - hh.ebbh("edxb", ebes(int ), (int)559));
lbl108:
                        // 2 sources

                        switch ((int)v11 /* !! */ ) {
                            case 540560199: {
                                v12 = hh.ebbh("edxc", ebes(int ), (int)560);
                                continue block74;
                            }
                            case 672168633: {
                                break block74;
                            }
                            case 1256366354: {
                                v12 = hh.ebbh("edxd", ebes(int ), (int)561);
                                continue block74;
                            }
                            case 1658347407: {
                                v12 = hh.ebbh("edxe", ebes(int ), (int)562);
                                continue block74;
                            }
                        }
                        break;
                    }
                    v13 = hh.mc.field_1724;
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("edxf", ebes(int ), (int)563)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  == hh.ebbh("edxg", ebbe(int ), (int)803)) break;
                        v14 /* !! */  = (long)hh.ebbh("edxh", ebbe(int ), (int)804);
                    }
                    v15 = v13.method_31548();
                    while (true) {
                        if ((v16 /* !! */  = (cfr_temp_3 = hh.kf - hh.ebbh("edxi", ebes(int ), (int)564)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v16 /* !! */  == hh.ebbh("edxj", ebbe(int ), (int)805)) break;
                        v16 /* !! */  = (long)hh.ebbh("edxk", ebbe(int ), (int)806);
                    }
                    v17 = v15.method_5438((int)var2_5);
                    v18 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl137
                    block77: while (true) {
                        v18 /* !! */  = (long)(v19 - hh.ebbh("edxl", ebes(int ), (int)565));
lbl137:
                        // 2 sources

                        switch ((int)v18 /* !! */ ) {
                            case -1165620941: {
                                v19 = hh.ebbh("edxm", ebes(int ), (int)566);
                                continue block77;
                            }
                            case 672168633: {
                                break block77;
                            }
                            case 1245507789: {
                                v19 = hh.ebbh("edxn", ebes(int ), (int)567);
                                continue block77;
                            }
                            case 2061677081: {
                                v19 = hh.ebbh("edxo", ebes(int ), (int)568);
                                continue block77;
                            }
                        }
                        break;
                    }
                    if (!this.sameRingItem(v17, var1_1)) ** GOTO lbl152
                    if (var3_4 || var3_4) ** GOTO lbl36
                    return (int)var2_5;
lbl152:
                    // 1 sources

                    if (var3_4 || var3_4) ** GOTO lbl36
                    ++var2_5;
                    if (var3_4) ** GOTO lbl36
                } while (!var5_2);
                throw null;
lbl157:
                // 1 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return (int)hh.ebbh("edxp", ebbe(int ), (int)807);
            }
lbl160:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)hh.ebbh("edxq", ebbe(int ), (int)808);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl246
            }
            case 1: {
                var4_3 /* !! */  = (int)hh.ebbh("edxr", ebbe(int ), (int)809);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl170:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)hh.ebbh("edxs", ebbe(int ), (int)810);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl175:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)hh.ebbh("edxt", ebbe(int ), (int)811);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl259
            }
            case 4: {
                var4_3 /* !! */  = (int)hh.ebbh("edxu", ebbe(int ), (int)812);
                if (!var5_2) ** GOTO lbl160
                throw null;
            }
lbl184:
            // 4 sources

            case 5: {
                var4_3 /* !! */  = (int)hh.ebbh("edxv", ebbe(int ), (int)813);
                if (!var5_2) ** GOTO lbl170
                throw null;
            }
            case 6: {
                var4_3 /* !! */  = (int)hh.ebbh("edxw", ebbe(int ), (int)814);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 7: {
                var4_3 /* !! */  = (int)hh.ebbh("edxx", ebbe(int ), (int)815);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl259
            }
            case 8: {
                var4_3 /* !! */  = (int)hh.ebbh("edxy", ebbe(int ), (int)816);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl203:
            // 4 sources

            case 9: {
                var4_3 /* !! */  = (int)hh.ebbh("edxz", ebbe(int ), (int)817);
                if (!var5_2) ** GOTO lbl184
                throw null;
            }
            case 10: {
                var4_3 /* !! */  = (int)hh.ebbh("edya", ebbe(int ), (int)818);
                if (!var5_2) ** GOTO lbl203
                throw null;
            }
lbl211:
            // 2 sources

            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)hh.ebbh("edyb", ebbe(int ), (int)819);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl238
                    break;
                }
            }
            case 12: {
                var4_3 /* !! */  = (int)hh.ebbh("edyc", ebbe(int ), (int)820);
                if (!var5_2) ** GOTO lbl203
                throw null;
            }
            case 13: {
                var4_3 /* !! */  = (int)hh.ebbh("edyd", ebbe(int ), (int)821);
                if (var5_2) {
                    throw null;
                }
            }
lbl225:
            // 5 sources

            case 14: {
                var4_3 /* !! */  = (int)hh.ebbh("edye", ebbe(int ), (int)822);
                if (!var5_2) ** GOTO lbl175
                throw null;
            }
lbl229:
            // 2 sources

            case 15: {
                var4_3 /* !! */  = (int)hh.ebbh("edyf", ebbe(int ), (int)823);
                if (!var5_2) ** GOTO lbl225
                throw null;
            }
lbl233:
            // 2 sources

            case 16: {
                var4_3 /* !! */  = (int)hh.ebbh("edyg", ebbe(int ), (int)824);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
lbl238:
            // 2 sources

            case 17: {
                var4_3 /* !! */  = (int)hh.ebbh("edyh", ebbe(int ), (int)825);
                if (!var5_2) ** GOTO lbl203
                throw null;
            }
lbl242:
            // 3 sources

            case 18: {
                var4_3 /* !! */  = (int)hh.ebbh("edyi", ebbe(int ), (int)826);
                if (!var5_2) ** GOTO lbl184
                throw null;
            }
lbl246:
            // 2 sources

            case 19: {
                var4_3 /* !! */  = (int)hh.ebbh("edyj", ebbe(int ), (int)827);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
            case 20: {
                var4_3 /* !! */  = (int)hh.ebbh("edyk", ebbe(int ), (int)828);
                if (!var5_2) break;
                throw null;
            }
            case 21: {
                var4_3 /* !! */  = (int)hh.ebbh("edyl", ebbe(int ), (int)829);
                if (!var5_2) ** GOTO lbl242
                throw null;
            }
lbl259:
            // 3 sources

            case 22: {
                var4_3 /* !! */  = (int)hh.ebbh("edym", ebbe(int ), (int)830);
                if (!var5_2) ** GOTO lbl242
                throw null;
            }
lbl263:
            // 3 sources

            case 23: {
                var4_3 /* !! */  = (int)hh.ebbh("edyn", ebbe(int ), (int)831);
                if (!var5_2) ** GOTO lbl225
                throw null;
            }
            case 24: 
        }
        var4_3 /* !! */  = (int)hh.ebbh("edyo", ebbe(int ), (int)832);
        ** while (!var5_2)
lbl270:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isRingItemEquipped(int var1_1) {
        block47: {
            block46: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("ecnq", ebes(int ), (int)220)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == hh.ebbh("ecnr", ebbe(int ), (int)304)) break;
                    v0 /* !! */  = (long)hh.ebbh("ecns", ebbe(int ), (int)305);
                }
                var4_2 = hh.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("ecnt", ebes(int ), (int)221)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == hh.ebbh("ecnu", ebbe(int ), (int)306)) break;
                    v1 /* !! */  = (long)hh.ebbh("ecnv", ebbe(int ), (int)307);
                }
                var3_3 = hh.b;
                v2 /* !! */  = hh.kf;
                if (true) ** GOTO lbl17
                block34: while (true) {
                    v2 /* !! */  = (long)(hh.ebbh("ecnx", ebes(int ), (int)223) - hh.ebbh("ecnw", ebes(int ), (int)222));
lbl17:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -405204179: {
                            continue block34;
                        }
                        case 672168633: {
                            break block34;
                        }
                    }
                    break;
                }
                var2_4 = hh.a;
                if (var4_2) {
                    throw null;
lbl25:
                    // 5 sources

                    return (boolean)hh.ebbh("ecny", ebbe(int ), (int)308);
                }
                if (var2_4 || var2_4) ** GOTO lbl25
                v3 /* !! */  = hh.kf;
                if (true) ** GOTO lbl32
                block36: while (true) {
                    v3 /* !! */  = (long)(v4 - hh.ebbh("ecnz", ebes(int ), (int)224));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1977978424: {
                            v4 = hh.ebbh("ecoa", ebes(int ), (int)225);
                            continue block36;
                        }
                        case 164063419: {
                            v4 = hh.ebbh("ecob", ebes(int ), (int)226);
                            continue block36;
                        }
                        case 672168633: {
                            break block36;
                        }
                    }
                    break;
                }
                if (!this.isRingSlot(var1_1)) break block46;
                if (var2_4) ** GOTO lbl25
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("ecoc", ebes(int ), (int)227)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == hh.ebbh("ecod", ebbe(int ), (int)309)) break;
                    v5 /* !! */  = (long)hh.ebbh("ecoe", ebbe(int ), (int)310);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = hh.kf - hh.ebbh("ecof", ebes(int ), (int)228)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == hh.ebbh("ecog", ebbe(int ), (int)311)) break;
                    v6 /* !! */  = (long)hh.ebbh("ecoh", ebbe(int ), (int)312);
                }
                if (hh.mc.field_1724 == null) break block46;
                if (var2_4) ** GOTO lbl25
                v7 /* !! */  = hh.kf;
                if (true) ** GOTO lbl59
                block39: while (true) {
                    v7 /* !! */  = (long)(v8 - hh.ebbh("ecoi", ebes(int ), (int)229));
lbl59:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 480961047: {
                            v8 = hh.ebbh("ecoj", ebes(int ), (int)230);
                            continue block39;
                        }
                        case 672168633: {
                            break block39;
                        }
                        case 748138291: {
                            v8 = hh.ebbh("ecok", ebes(int ), (int)231);
                            continue block39;
                        }
                        case 1910616265: {
                            v8 = hh.ebbh("ecol", ebes(int ), (int)232);
                            continue block39;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_4 = hh.kf - hh.ebbh("ecom", ebes(int ), (int)233)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == hh.ebbh("econ", ebbe(int ), (int)313)) break;
                    v9 /* !! */  = (long)hh.ebbh("ecoo", ebbe(int ), (int)314);
                }
                v10 = hh.mc.field_1724;
                v11 /* !! */  = hh.kf;
                if (true) ** GOTO lbl81
                block41: while (true) {
                    v11 /* !! */  = (long)(v12 - hh.ebbh("ecop", ebes(int ), (int)234));
lbl81:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -2016952916: {
                            v12 = hh.ebbh("ecoq", ebes(int ), (int)235);
                            continue block41;
                        }
                        case 672168633: {
                            break block41;
                        }
                        case 1447629545: {
                            v12 = hh.ebbh("ecor", ebes(int ), (int)236);
                            continue block41;
                        }
                        case 1607528889: {
                            v12 = hh.ebbh("ecos", ebes(int ), (int)237);
                            continue block41;
                        }
                    }
                    break;
                }
                v13 = v10.method_6079();
                v14 /* !! */  = hh.kf;
                if (true) ** GOTO lbl98
                block42: while (true) {
                    v14 /* !! */  = (long)(v15 - hh.ebbh("ecot", ebes(int ), (int)238));
lbl98:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1257534157: {
                            v15 = hh.ebbh("ecou", ebes(int ), (int)239);
                            continue block42;
                        }
                        case 584072330: {
                            v15 = hh.ebbh("ecov", ebes(int ), (int)240);
                            continue block42;
                        }
                        case 672168633: {
                            break block42;
                        }
                        case 1822258392: {
                            v15 = hh.ebbh("ecow", ebes(int ), (int)241);
                            continue block42;
                        }
                    }
                    break;
                }
                v16 = this.ringItems[var1_1];
                v17 /* !! */  = hh.kf;
                if (true) ** GOTO lbl115
                block43: while (true) {
                    v17 /* !! */  = (long)(v18 - hh.ebbh("ecox", ebes(int ), (int)242));
lbl115:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -279227777: {
                            v18 = hh.ebbh("ecoy", ebes(int ), (int)243);
                            continue block43;
                        }
                        case 672168633: {
                            break block43;
                        }
                        case 2055183528: {
                            v18 = hh.ebbh("ecoz", ebes(int ), (int)244);
                            continue block43;
                        }
                    }
                    break;
                }
                if (!this.sameRingItem(v13, v16)) break block46;
                if (var2_4) ** GOTO lbl25
                v19 = hh.ebbh("ecpa", ebbe(int ), (int)315);
                if (var4_2) {
                    throw null;
                }
                break block47;
            }
            if (!var2_4 && !var2_4) ** break;
            ** while (true)
            v19 = hh.ebbh("ecpb", ebbe(int ), (int)316);
        }
        return (boolean)v19;
    }

    private static /* synthetic */ void efoa() {
        hh.ebet[100] = 4305857654376628505L;
        hh.ebet[101] = -8947584142938388170L;
        hh.ebet[102] = 3683999572841722494L;
        hh.ebet[103] = -3323396531577252212L;
        hh.ebet[104] = -1220941766169012162L;
        hh.ebet[105] = -8754632478766644557L;
        hh.ebet[106] = -6259471724365920386L;
        hh.ebet[107] = 4548742637792755370L;
        hh.ebet[108] = -7408875472520084669L;
        hh.ebet[109] = 7601022936088023086L;
        hh.ebet[110] = -1205249450721428160L;
        hh.ebet[111] = 8727302157264353133L;
        hh.ebet[112] = 7049355025208177662L;
        hh.ebet[113] = -4314857055447866104L;
        hh.ebet[114] = -3639496908765855327L;
        hh.ebet[115] = 1193487893911331993L;
        hh.ebet[116] = 6171991696002933872L;
        hh.ebet[117] = -3527520272018996681L;
        hh.ebet[118] = 4232376547442187766L;
        hh.ebet[119] = 2817410540510816588L;
        hh.ebet[120] = 7765201555179224095L;
        hh.ebet[121] = 7481738326382748749L;
        hh.ebet[122] = 3988313233114121970L;
        hh.ebet[123] = -5137302261168629399L;
        hh.ebet[124] = -1623427965370715432L;
        hh.ebet[125] = -1705098393420068243L;
        hh.ebet[126] = 5314689428102025998L;
        hh.ebet[127] = -2509037216544775777L;
        hh.ebet[128] = -8434698323971582947L;
        hh.ebet[129] = -3775082766449638716L;
        hh.ebet[130] = 3682413301545274433L;
        hh.ebet[131] = 1979235518188285392L;
        hh.ebet[132] = -7265620425438886641L;
        hh.ebet[133] = -3124234496405942764L;
        hh.ebet[134] = 7688547954337432273L;
        hh.ebet[135] = -6717670764024329403L;
        hh.ebet[136] = 1951324242885049530L;
        hh.ebet[137] = 6494546640660889372L;
        hh.ebet[138] = 7860944502256026357L;
        hh.ebet[139] = -2977899238966532822L;
        hh.ebet[140] = -1916806874147150413L;
        hh.ebet[141] = 8697304685638032553L;
        hh.ebet[142] = -1993816480204513306L;
        hh.ebet[143] = -3269940408591281895L;
        hh.ebet[144] = -5018053751965752412L;
        hh.ebet[145] = 6104042901922560019L;
        hh.ebet[146] = -2160235977967249031L;
        hh.ebet[147] = 4008695151674326005L;
        hh.ebet[148] = 4889115207913239583L;
        hh.ebet[149] = -6665599785018633092L;
        hh.ebet[150] = -8193359400353099559L;
        hh.ebet[151] = 3764422220838191710L;
        hh.ebet[152] = -7533269555597442448L;
        hh.ebet[153] = -3317717384027378084L;
        hh.ebet[154] = 2942040975638926280L;
        hh.ebet[155] = -588342628564953497L;
        hh.ebet[156] = 957134860839166464L;
        hh.ebet[157] = -842764042030804165L;
        hh.ebet[158] = 7134315703967496066L;
        hh.ebet[159] = 5883586950461563149L;
        hh.ebet[160] = 3872402781171981758L;
        hh.ebet[161] = -779209474552277694L;
        hh.ebet[162] = 2160816387198323175L;
        hh.ebet[163] = -1582734175605431928L;
        hh.ebet[164] = -538143240941638295L;
        hh.ebet[165] = 5634947062983771798L;
        hh.ebet[166] = -954509548736819152L;
        hh.ebet[167] = -6222837620638006539L;
        hh.ebet[168] = 2474422421848644959L;
        hh.ebet[169] = 3707535226954857868L;
        hh.ebet[170] = 323675268334649382L;
        hh.ebet[171] = 4307792073111094932L;
        hh.ebet[172] = 6121327047302779659L;
        hh.ebet[173] = 6427816661452211827L;
        hh.ebet[174] = -7659284529670377513L;
        hh.ebet[175] = 9009731126596339755L;
        hh.ebet[176] = 1897485183859972711L;
        hh.ebet[177] = -3411716526944851092L;
        hh.ebet[178] = 2329279898246779987L;
        hh.ebet[179] = -5931523351930783625L;
        hh.ebet[180] = -4443889933043585206L;
        hh.ebet[181] = 5855653974081107965L;
        hh.ebet[182] = -1167344040098919114L;
        hh.ebet[183] = -2584095905441958424L;
        hh.ebet[184] = 981265811329069531L;
        hh.ebet[185] = 2145074028306347617L;
        hh.ebet[186] = -8845794075416620397L;
        hh.ebet[187] = -361621458107050128L;
        hh.ebet[188] = 4839894241624125636L;
        hh.ebet[189] = -1234503278778844286L;
        hh.ebet[190] = 727653131176660185L;
        hh.ebet[191] = 1961700586475488967L;
        hh.ebet[192] = 3047426042661650124L;
        hh.ebet[193] = -3804074813812768617L;
        hh.ebet[194] = -6826983463897671246L;
        hh.ebet[195] = 5989503684671814849L;
        hh.ebet[196] = 660314998649933400L;
        hh.ebet[197] = 1921818104958803296L;
        hh.ebet[198] = -2756702915790191237L;
        hh.ebet[199] = 6904075733457538014L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isTalisman(class_1799 var1_1) {
        block42: {
            block41: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("ebev", ebes(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  == hh.ebbh("ebew", ebbe(int ), (int)88)) break;
                    v0 /* !! */  = (long)hh.ebbh("ebex", ebbe(int ), (int)89);
                }
                var4_2 = hh.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("ebey", ebes(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v1 /* !! */  == hh.ebbh("ebez", ebbe(int ), (int)90)) break;
                    v1 /* !! */  = (long)hh.ebbh("ebfa", ebbe(int ), (int)91);
                }
                var3_3 = hh.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("ebfb", ebes(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == hh.ebbh("ebfc", ebbe(int ), (int)92)) break;
                    v2 /* !! */  = (long)hh.ebbh("ebfd", ebbe(int ), (int)93);
                }
                var2_4 = hh.a;
                if (var4_2) {
                    throw null;
lbl24:
                    // 4 sources

                    return (boolean)hh.ebbh("ebfe", ebbe(int ), (int)94);
                }
                if (var2_4 || var2_4) ** GOTO lbl24
                v3 /* !! */  = hh.kf;
                if (true) ** GOTO lbl31
                block27: while (true) {
                    v3 /* !! */  = (long)(hh.ebbh("ebfg", ebes(int ), (int)4) - hh.ebbh("ebff", ebes(int ), (int)3));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 216958780: {
                            continue block27;
                        }
                        case 672168633: {
                            break block27;
                        }
                    }
                    break;
                }
                v4 /* !! */  = hh.kf;
                if (true) ** GOTO lbl40
                block28: while (true) {
                    v4 /* !! */  = (long)(hh.ebbh("ebfi", ebes(int ), (int)6) - hh.ebbh("ebfh", ebes(int ), (int)5));
lbl40:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 672168633: {
                            break block28;
                        }
                        case 1620832276: {
                            continue block28;
                        }
                    }
                    break;
                }
                if (!var1_1.method_31574(class_1802.field_8288)) break block41;
                if (var2_4) ** GOTO lbl24
                v5 /* !! */  = hh.kf;
                if (true) ** GOTO lbl51
                block29: while (true) {
                    v5 /* !! */  = (long)(v6 - hh.ebbh("ebfj", ebes(int ), (int)7));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1274986360: {
                            v6 = hh.ebbh("ebfk", ebes(int ), (int)8);
                            continue block29;
                        }
                        case -608314995: {
                            v6 = hh.ebbh("ebfl", ebes(int ), (int)9);
                            continue block29;
                        }
                        case 672168633: {
                            break block29;
                        }
                        case 1485890024: {
                            v6 = hh.ebbh("ebfm", ebes(int ), (int)10);
                            continue block29;
                        }
                    }
                    break;
                }
                v7 = var1_1.method_7964();
                v8 /* !! */  = hh.kf;
                if (true) ** GOTO lbl68
                block30: while (true) {
                    v8 /* !! */  = (long)(hh.ebbh("ebfo", ebes(int ), (int)12) - hh.ebbh("ebfn", ebes(int ), (int)11));
lbl68:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -291175138: {
                            continue block30;
                        }
                        case 672168633: {
                            break block30;
                        }
                    }
                    break;
                }
                v9 = v7.getString();
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = hh.kf - hh.ebbh("ebfp", ebes(int ), (int)13)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == hh.ebbh("ebfq", ebbe(int ), (int)95)) break;
                    v10 /* !! */  = (long)hh.ebbh("ebfr", ebbe(int ), (int)96);
                }
                v11 /* !! */  = hh.kf;
                if (true) ** GOTO lbl84
                block32: while (true) {
                    v11 /* !! */  = (long)(v12 - hh.ebbh("ebfs", ebes(int ), (int)14));
lbl84:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1961486961: {
                            v12 = hh.ebbh("ebft", ebes(int ), (int)15);
                            continue block32;
                        }
                        case 672168633: {
                            break block32;
                        }
                        case 1433598642: {
                            v12 = hh.ebbh("ebfu", ebes(int ), (int)16);
                            continue block32;
                        }
                    }
                    break;
                }
                v13 = v9.toLowerCase(Locale.ROOT);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = hh.kf - hh.ebbh("ebfv", ebes(int ), (int)17)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v14 /* !! */  == hh.ebbh("ebfw", ebbe(int ), (int)97)) break;
                    v14 /* !! */  = (long)hh.ebbh("ebfx", ebbe(int ), (int)98);
                }
                if (!v13.contains("\u0442\u0430\u043b\u0438\u0441\u043c\u0430\u043d")) break block41;
                if (var2_4) ** GOTO lbl24
                v15 = hh.ebbh("ebfy", ebbe(int ), (int)99);
                if (var4_2) {
                    throw null;
                }
                break block42;
            }
            if (!var2_4 && !var2_4) ** break;
            ** while (true)
            v15 = hh.ebbh("ebfz", ebbe(int ), (int)100);
        }
        return (boolean)v15;
    }

    static {
        ebbf = new int[935];
        ebbg = new int[935];
        hh.efnf();
        hh.efng();
        hh.efnh();
        hh.efni();
        hh.efnj();
        hh.efnk();
        hh.efnl();
        hh.efnm();
        hh.efnn();
        hh.efno();
        hh.efnp();
        hh.efnq();
        hh.efnr();
        hh.efns();
        hh.efnt();
        hh.efnu();
        hh.efnv();
        hh.efnw();
        hh.efnx();
        hh.efny();
        ebet = new long[658];
        ebeu = new long[658];
        hh.efnz();
        hh.efoa();
        hh.efob();
        hh.efoc();
        hh.efod();
        hh.efoe();
        hh.efof();
        hh.efog();
        hh.efoh();
        hh.efoi();
        hh.efoj();
        hh.efok();
        hh.efol();
        hh.efom();
    }

    private static /* synthetic */ void efnr() {
        hh.ebbg[200] = -858343906;
        hh.ebbg[201] = -562164961;
        hh.ebbg[202] = -1809798036;
        hh.ebbg[203] = 1008247557;
        hh.ebbg[204] = 1825503916;
        hh.ebbg[205] = -1471698282;
        hh.ebbg[206] = 37112088;
        hh.ebbg[207] = 1054619577;
        hh.ebbg[208] = 285579218;
        hh.ebbg[209] = -1627466647;
        hh.ebbg[210] = -1707967250;
        hh.ebbg[211] = 1550335175;
        hh.ebbg[212] = 888018472;
        hh.ebbg[213] = -64043142;
        hh.ebbg[214] = 33940042;
        hh.ebbg[215] = -857900009;
        hh.ebbg[216] = -268097142;
        hh.ebbg[217] = 2103608986;
        hh.ebbg[218] = 322361144;
        hh.ebbg[219] = -1269978077;
        hh.ebbg[220] = 52937572;
        hh.ebbg[221] = -894863337;
        hh.ebbg[222] = 1076882870;
        hh.ebbg[223] = 163611661;
        hh.ebbg[224] = -1906981277;
        hh.ebbg[225] = -428169356;
        hh.ebbg[226] = 497015654;
        hh.ebbg[227] = 2025922114;
        hh.ebbg[228] = 646889898;
        hh.ebbg[229] = 168170356;
        hh.ebbg[230] = 394495175;
        hh.ebbg[231] = 1144161226;
        hh.ebbg[232] = 63101416;
        hh.ebbg[233] = -1348240019;
        hh.ebbg[234] = 1702752254;
        hh.ebbg[235] = -1789593158;
        hh.ebbg[236] = 1573969936;
        hh.ebbg[237] = -1419428212;
        hh.ebbg[238] = 1372967666;
        hh.ebbg[239] = -400919570;
        hh.ebbg[240] = 1647191010;
        hh.ebbg[241] = -34047286;
        hh.ebbg[242] = 1445149168;
        hh.ebbg[243] = -1170914882;
        hh.ebbg[244] = 834514497;
        hh.ebbg[245] = 660859324;
        hh.ebbg[246] = 399818554;
        hh.ebbg[247] = -1779246921;
        hh.ebbg[248] = -1612983404;
        hh.ebbg[249] = 870609103;
        hh.ebbg[250] = 936811185;
        hh.ebbg[251] = -606643181;
        hh.ebbg[252] = -281375235;
        hh.ebbg[253] = -420763871;
        hh.ebbg[254] = -832445735;
        hh.ebbg[255] = 777975071;
        hh.ebbg[256] = 239794153;
        hh.ebbg[257] = 1191944690;
        hh.ebbg[258] = -1035125678;
        hh.ebbg[259] = 979155862;
        hh.ebbg[260] = -2124390240;
        hh.ebbg[261] = 1882769442;
        hh.ebbg[262] = -568032855;
        hh.ebbg[263] = -444262630;
        hh.ebbg[264] = 901016289;
        hh.ebbg[265] = -183803652;
        hh.ebbg[266] = -1356440319;
        hh.ebbg[267] = 1797240368;
        hh.ebbg[268] = -935763381;
        hh.ebbg[269] = 1407086187;
        hh.ebbg[270] = -1870157984;
        hh.ebbg[271] = 1693105244;
        hh.ebbg[272] = -1476588931;
        hh.ebbg[273] = -960129701;
        hh.ebbg[274] = -161595372;
        hh.ebbg[275] = -982600173;
        hh.ebbg[276] = 1685551521;
        hh.ebbg[277] = 224281836;
        hh.ebbg[278] = -1797618911;
        hh.ebbg[279] = -538031975;
        hh.ebbg[280] = 1498384280;
        hh.ebbg[281] = -2078811197;
        hh.ebbg[282] = 1978014931;
        hh.ebbg[283] = 1613109823;
        hh.ebbg[284] = -2030588663;
        hh.ebbg[285] = 355897619;
        hh.ebbg[286] = -834118225;
        hh.ebbg[287] = -945546616;
        hh.ebbg[288] = 2006936156;
        hh.ebbg[289] = -830740332;
        hh.ebbg[290] = 33608386;
        hh.ebbg[291] = 860999604;
        hh.ebbg[292] = -2066764510;
        hh.ebbg[293] = -773636510;
        hh.ebbg[294] = 571752154;
        hh.ebbg[295] = -1791021231;
        hh.ebbg[296] = -1264720684;
        hh.ebbg[297] = -56952989;
        hh.ebbg[298] = 1431014475;
        hh.ebbg[299] = -1660806869;
    }

    private static /* synthetic */ void efoc() {
        hh.ebet[300] = 6480814520266093876L;
        hh.ebet[301] = 4239188589601664939L;
        hh.ebet[302] = -7859578676899570170L;
        hh.ebet[303] = 1174399566467378714L;
        hh.ebet[304] = 9029003351127318094L;
        hh.ebet[305] = 6664642938437264273L;
        hh.ebet[306] = 6569155204189484316L;
        hh.ebet[307] = 6137645808266628545L;
        hh.ebet[308] = 7023356242513626684L;
        hh.ebet[309] = -4160054042089816632L;
        hh.ebet[310] = 5852093231196290085L;
        hh.ebet[311] = 1938099245873212812L;
        hh.ebet[312] = 1134907793159811476L;
        hh.ebet[313] = 341358545387523643L;
        hh.ebet[314] = 8219124222890672189L;
        hh.ebet[315] = -5782574980196245805L;
        hh.ebet[316] = 8091890339138738199L;
        hh.ebet[317] = 2068057162957929288L;
        hh.ebet[318] = -7376130411276474290L;
        hh.ebet[319] = 376103517511066793L;
        hh.ebet[320] = 6628839616057172764L;
        hh.ebet[321] = 64805760763040193L;
        hh.ebet[322] = -4710495682688232998L;
        hh.ebet[323] = -8157588075607894348L;
        hh.ebet[324] = -50282694620691723L;
        hh.ebet[325] = -7299499143441867140L;
        hh.ebet[326] = -8556562088959553652L;
        hh.ebet[327] = -7420935154724343452L;
        hh.ebet[328] = 8620790409692931631L;
        hh.ebet[329] = -6210408039268655097L;
        hh.ebet[330] = 7526295838436259268L;
        hh.ebet[331] = 2560883224049691465L;
        hh.ebet[332] = 186389874431421970L;
        hh.ebet[333] = 5517544887589145365L;
        hh.ebet[334] = -2952345896524449360L;
        hh.ebet[335] = -5412125602576865182L;
        hh.ebet[336] = 6777049928103758952L;
        hh.ebet[337] = 354509638408483260L;
        hh.ebet[338] = 6203578612250423943L;
        hh.ebet[339] = -3171740275004670503L;
        hh.ebet[340] = 6068731551265097740L;
        hh.ebet[341] = 4501929680817765695L;
        hh.ebet[342] = 2585311660927422548L;
        hh.ebet[343] = -765520547075795830L;
        hh.ebet[344] = -6506133880655835443L;
        hh.ebet[345] = -6646284931260004827L;
        hh.ebet[346] = -8228044083144590414L;
        hh.ebet[347] = -5901658280166703458L;
        hh.ebet[348] = 1015742807236771016L;
        hh.ebet[349] = 8256156796088634388L;
        hh.ebet[350] = 8405557382408266769L;
        hh.ebet[351] = -194312807968411355L;
        hh.ebet[352] = -1501394120330313740L;
        hh.ebet[353] = -4420766220234514609L;
        hh.ebet[354] = -1024743827746415968L;
        hh.ebet[355] = 5382196867682628080L;
        hh.ebet[356] = 6181378274971902649L;
        hh.ebet[357] = 8207057307562062754L;
        hh.ebet[358] = 5236273035993114704L;
        hh.ebet[359] = -5602406162776427617L;
        hh.ebet[360] = -2333852026598854670L;
        hh.ebet[361] = -7428458460441608797L;
        hh.ebet[362] = -7314807070887167066L;
        hh.ebet[363] = -6327163613167341948L;
        hh.ebet[364] = 8719247054747410338L;
        hh.ebet[365] = -742441566182749122L;
        hh.ebet[366] = -4287040100369061224L;
        hh.ebet[367] = -185759472561784865L;
        hh.ebet[368] = -3613243482101372281L;
        hh.ebet[369] = 2753878932189495562L;
        hh.ebet[370] = -823561286687588949L;
        hh.ebet[371] = -7654806711711538607L;
        hh.ebet[372] = -3197549210609841013L;
        hh.ebet[373] = 3355118930196681593L;
        hh.ebet[374] = -982938812002479350L;
        hh.ebet[375] = 205930852610083499L;
        hh.ebet[376] = 7375934453321683095L;
        hh.ebet[377] = 2160873332561887546L;
        hh.ebet[378] = -5801145101507557898L;
        hh.ebet[379] = -6401102278351835356L;
        hh.ebet[380] = -5750747803837241811L;
        hh.ebet[381] = -2272813372641672902L;
        hh.ebet[382] = -7036473740222802745L;
        hh.ebet[383] = -8725434317191587684L;
        hh.ebet[384] = -5534492427571728543L;
        hh.ebet[385] = -7632154247989968857L;
        hh.ebet[386] = -2515549252166405045L;
        hh.ebet[387] = -6215683722463748341L;
        hh.ebet[388] = 5209815753903947785L;
        hh.ebet[389] = -7186840605685591398L;
        hh.ebet[390] = 527179565383815132L;
        hh.ebet[391] = 5702535415064606186L;
        hh.ebet[392] = -4725534980033935805L;
        hh.ebet[393] = -8818439925495395087L;
        hh.ebet[394] = -8050855205918291249L;
        hh.ebet[395] = 2520905104429704682L;
        hh.ebet[396] = -2604653217080964683L;
        hh.ebet[397] = -9042995059621904067L;
        hh.ebet[398] = 7499993955209251681L;
        hh.ebet[399] = -759704506088755148L;
    }

    private static /* synthetic */ void efoi() {
        hh.ebeu[200] = -763920647629840066L;
        hh.ebeu[201] = 164419361651358650L;
        hh.ebeu[202] = -7492700324655711780L;
        hh.ebeu[203] = -1875712431194148044L;
        hh.ebeu[204] = 4026286124272707008L;
        hh.ebeu[205] = 4999032932562209765L;
        hh.ebeu[206] = -5903849717226650492L;
        hh.ebeu[207] = -247015244054923350L;
        hh.ebeu[208] = -335949787471198923L;
        hh.ebeu[209] = 174289172958058869L;
        hh.ebeu[210] = -3704427996531522680L;
        hh.ebeu[211] = -7542527362076919185L;
        hh.ebeu[212] = -695380187776923000L;
        hh.ebeu[213] = 2176076655773828602L;
        hh.ebeu[214] = -7500929392893821418L;
        hh.ebeu[215] = 8537546617374020620L;
        hh.ebeu[216] = 2125913919067365377L;
        hh.ebeu[217] = 2004282769455116318L;
        hh.ebeu[218] = -4291466395277847212L;
        hh.ebeu[219] = 3764247570489929091L;
        hh.ebeu[220] = 6601033070448580851L;
        hh.ebeu[221] = 4813494498668172502L;
        hh.ebeu[222] = -7960962209172566885L;
        hh.ebeu[223] = -427233882693819415L;
        hh.ebeu[224] = 6109991372482645029L;
        hh.ebeu[225] = -5773634371887616456L;
        hh.ebeu[226] = -484530224150658321L;
        hh.ebeu[227] = -4658121026912107109L;
        hh.ebeu[228] = -2807830322947671201L;
        hh.ebeu[229] = -8636830520096776553L;
        hh.ebeu[230] = -3920086567400908586L;
        hh.ebeu[231] = -4551092623651808904L;
        hh.ebeu[232] = -4952127697236723427L;
        hh.ebeu[233] = 7604729482160797773L;
        hh.ebeu[234] = 423945658210118574L;
        hh.ebeu[235] = 8512115340009740683L;
        hh.ebeu[236] = -8840885415616890384L;
        hh.ebeu[237] = -6004484055112111684L;
        hh.ebeu[238] = 7413840644730934239L;
        hh.ebeu[239] = -305963430264131327L;
        hh.ebeu[240] = -7651327205403000662L;
        hh.ebeu[241] = 1457329893171547126L;
        hh.ebeu[242] = -1976791109115472610L;
        hh.ebeu[243] = -604686279850083229L;
        hh.ebeu[244] = -757565136844068329L;
        hh.ebeu[245] = -3022297243481718656L;
        hh.ebeu[246] = -457294406075440505L;
        hh.ebeu[247] = -8888309963263051844L;
        hh.ebeu[248] = 149037282893162816L;
        hh.ebeu[249] = -7193270224674405748L;
        hh.ebeu[250] = 8770700452191517605L;
        hh.ebeu[251] = -173221594381267051L;
        hh.ebeu[252] = -4045327638215856089L;
        hh.ebeu[253] = -6704267636466527567L;
        hh.ebeu[254] = -5679256449996205792L;
        hh.ebeu[255] = 8831278341637607223L;
        hh.ebeu[256] = 3281042899082396863L;
        hh.ebeu[257] = 2046710502883266998L;
        hh.ebeu[258] = 1951221698508799780L;
        hh.ebeu[259] = -2804367966442202883L;
        hh.ebeu[260] = 7659209674954703430L;
        hh.ebeu[261] = 6513165423910328663L;
        hh.ebeu[262] = -2168790643325289885L;
        hh.ebeu[263] = -3031113721793757818L;
        hh.ebeu[264] = -6458129287130071173L;
        hh.ebeu[265] = 7430852255677733994L;
        hh.ebeu[266] = 6275621837749312492L;
        hh.ebeu[267] = 4551367281636172609L;
        hh.ebeu[268] = -3964841729075964035L;
        hh.ebeu[269] = 1441844424049922501L;
        hh.ebeu[270] = -643344993312435482L;
        hh.ebeu[271] = 6359625040767664379L;
        hh.ebeu[272] = -4170710656149818716L;
        hh.ebeu[273] = -1393621921568390741L;
        hh.ebeu[274] = -982058182681785765L;
        hh.ebeu[275] = 6884037131228297067L;
        hh.ebeu[276] = 4053103098056336661L;
        hh.ebeu[277] = -2891138980559914895L;
        hh.ebeu[278] = -1030915943424761024L;
        hh.ebeu[279] = 3823811832544795317L;
        hh.ebeu[280] = -881769007765602121L;
        hh.ebeu[281] = -4333601851138684205L;
        hh.ebeu[282] = 6341736869478396143L;
        hh.ebeu[283] = -8046034615773524993L;
        hh.ebeu[284] = 397027877538431897L;
        hh.ebeu[285] = 4819497599264459013L;
        hh.ebeu[286] = -3659531860119682941L;
        hh.ebeu[287] = -6944765237925917666L;
        hh.ebeu[288] = 4026143682936182438L;
        hh.ebeu[289] = 6614723201190651982L;
        hh.ebeu[290] = 6623415258662656682L;
        hh.ebeu[291] = -2898802426258824706L;
        hh.ebeu[292] = 6474060209936070126L;
        hh.ebeu[293] = -394669777527714654L;
        hh.ebeu[294] = 6802841235687568460L;
        hh.ebeu[295] = -2344951796688163711L;
        hh.ebeu[296] = -4753399573354491244L;
        hh.ebeu[297] = 5061578584250804783L;
        hh.ebeu[298] = -6305423388467887692L;
        hh.ebeu[299] = -8291439759868908650L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String getRingItemName(int var1_1) {
        block61: {
            v0 /* !! */  = hh.kf;
            if (true) ** GOTO lbl5
            block42: while (true) {
                v0 /* !! */  = (long)(hh.ebbh("ebsv", ebes(int ), (int)76) - hh.ebbh("ebsu", ebes(int ), (int)75));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case 672168633: {
                        break block42;
                    }
                    case 1877283642: {
                        continue block42;
                    }
                }
                break;
            }
            var5_2 = hh.c;
            v1 /* !! */  = hh.kf;
            if (true) ** GOTO lbl15
            block43: while (true) {
                v1 /* !! */  = (long)(v2 - hh.ebbh("ebsw", ebes(int ), (int)77));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -481038148: {
                        v2 = hh.ebbh("ebte", ebes(int ), (int)78);
                        continue block43;
                    }
                    case 672168633: {
                        break block43;
                    }
                    case 1198541171: {
                        v2 = hh.ebbh("ebtg", ebes(int ), (int)79);
                        continue block43;
                    }
                }
                break;
            }
            var4_3 /* !! */  = hh.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("ebti", ebes(int ), (int)80)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == hh.ebbh("ebtk", ebbe(int ), (int)152)) break;
                v3 /* !! */  = (long)hh.ebbh("ebtl", ebbe(int ), (int)153);
            }
            var3_4 = hh.a;
            if (var5_2) {
                throw null;
lbl34:
                // 5 sources

                return null;
            }
            if (var3_4 || var3_4) ** GOTO lbl34
            v4 /* !! */  = hh.kf;
            if (true) ** GOTO lbl41
            block46: while (true) {
                v4 /* !! */  = (long)(v5 - hh.ebbh("ebtq", ebes(int ), (int)81));
lbl41:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -2022522222: {
                        v5 = hh.ebbh("ebtr", ebes(int ), (int)82);
                        continue block46;
                    }
                    case -331316302: {
                        v5 = hh.ebbh("ebts", ebes(int ), (int)83);
                        continue block46;
                    }
                    case 672168633: {
                        break block46;
                    }
                }
                break;
            }
            var2_5 = this.getRingItemStack(var1_1);
            if (var3_4 || var3_4) ** GOTO lbl34
            v6 /* !! */  = hh.kf;
            if (true) ** GOTO lbl56
            block47: while (true) {
                v6 /* !! */  = (long)(v7 - hh.ebbh("ebtt", ebes(int ), (int)84));
lbl56:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -2098807505: {
                        v7 = hh.ebbh("ebtu", ebes(int ), (int)85);
                        continue block47;
                    }
                    case 672168633: {
                        break block47;
                    }
                    case 1196767787: {
                        v7 = hh.ebbh("ebtw", ebes(int ), (int)86);
                        continue block47;
                    }
                }
                break;
            }
            if (!var2_5.method_7960()) break block61;
            if (var3_4) ** GOTO lbl34
            v8 = "\u0412\u044b\u0431\u0440\u0430\u0442\u044c \u043f\u0440\u0435\u0434\u043c\u0435\u0442";
            if (var5_2) {
                throw null;
            }
            ** GOTO lbl109
        }
        if (var3_4) ** GOTO lbl34
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var3_4) ** break;
                ** continue;
                v9 /* !! */  = hh.kf;
                if (true) ** GOTO lbl82
                block48: while (true) {
                    v9 /* !! */  = (long)(v10 - hh.ebbh("ebtz", ebes(int ), (int)87));
lbl82:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1697578098: {
                            v10 = hh.ebbh("ebud", ebes(int ), (int)88);
                            continue block48;
                        }
                        case -678068222: {
                            v10 = hh.ebbh("ebue", ebes(int ), (int)89);
                            continue block48;
                        }
                        case 230244935: {
                            v10 = hh.ebbh("ebuf", ebes(int ), (int)90);
                            continue block48;
                        }
                        case 672168633: {
                            break block48;
                        }
                    }
                    break;
                }
                v11 = var2_5.method_7964();
                v12 /* !! */  = hh.kf;
                if (true) ** GOTO lbl99
                block49: while (true) {
                    v12 /* !! */  = (long)(v13 - hh.ebbh("ebug", ebes(int ), (int)91));
lbl99:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case 486242501: {
                            v13 = hh.ebbh("ebuh", ebes(int ), (int)92);
                            continue block49;
                        }
                        case 672168633: {
                            break block49;
                        }
                        case 1736616285: {
                            v13 = hh.ebbh("ebuj", ebes(int ), (int)93);
                            continue block49;
                        }
                    }
                    break;
                }
                v8 = v11.getString();
lbl109:
                // 2 sources

                return v8;
            }
lbl110:
            // 3 sources

            case 0: {
                var4_3 /* !! */  = (int)hh.ebbh("ebup", ebbe(int ), (int)154);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl133
            }
lbl115:
            // 3 sources

            case 1: {
                do {
                    var4_3 /* !! */  = (int)hh.ebbh("ebuq", ebbe(int ), (int)155);
                } while (!var5_2);
                throw null;
            }
lbl120:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)hh.ebbh("ebur", ebbe(int ), (int)156);
                if (!var5_2) ** GOTO lbl110
                throw null;
            }
lbl124:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)hh.ebbh("ebus", ebbe(int ), (int)157);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 4: {
                var4_3 /* !! */  = (int)hh.ebbh("ebuu", ebbe(int ), (int)158);
                if (!var5_2) ** GOTO lbl115
                throw null;
            }
lbl133:
            // 2 sources

            case 5: {
                var4_3 /* !! */  = (int)hh.ebbh("ebuy", ebbe(int ), (int)159);
                if (!var5_2) ** GOTO lbl115
                throw null;
            }
            case 6: {
                var4_3 /* !! */  = (int)hh.ebbh("ebvb", ebbe(int ), (int)160);
                if (!var5_2) ** GOTO lbl110
                throw null;
            }
lbl141:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)hh.ebbh("ebvh", ebbe(int ), (int)161);
                    if (!var5_2) ** GOTO lbl120
                    throw null;
                }
            }
            case 8: {
                var4_3 /* !! */  = (int)hh.ebbh("ebvj", ebbe(int ), (int)162);
                if (!var5_2) ** GOTO lbl124
                throw null;
            }
            case 9: 
        }
        var4_3 /* !! */  = (int)hh.ebbh("ebvm", ebbe(int ), (int)163);
        ** while (!var5_2)
lbl153:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void executeSwapInstant(String var1_1) {
        var6_2 = hh.c;
        var5_3 /* !! */  = hh.b;
        var4_4 = hh.a;
        if (var6_2) {
            throw null;
        }
        if (var4_4 || var4_4) return;
        if (this.matches(hh.mc.field_1724.method_6079(), var1_1)) {
            if (var4_4) return;
            if (!this.isSphereToSphere()) {
                if (var4_4 || var4_4) return;
                return;
            }
        }
        if (var4_4 || var4_4) return;
        var2_5 = this.findItemHotbar(var1_1);
        if (var4_4) return;
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block33: while (true) {
            block77: {
                switch (cfr_temp_0 == -2147483648 ? var5_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var4_4) return;
                        if (var2_5.found()) {
                            if (var4_4 || var4_4) return;
                            var3_6 = var2_5.slot() + hh.ebbh("ecvq", ebbe(int ), (int)438);
                            if (var4_4 || var4_4) return;
                            nv.swapToOffhand(var3_6);
                            if (var4_4 || var4_4) return;
                            ee.item(var2_5.stack());
                            if (var4_4 || var4_4) return;
                            return;
                        }
                        if (var4_4 || var4_4) return;
                        var3_7 = this.findItemInventory(var1_1);
                        if (var4_4 || var4_4) return;
                        if (var3_7.found()) {
                            if (var4_4 || var4_4) return;
                            nv.swapToOffhand(var3_7.slot());
                            if (var4_4 || var4_4) return;
                            ee.item(var3_7.stack());
                            if (var4_4) return;
                        }
                        if (!var4_4 && !var4_4) return;
                        return;
                    }
                    case 2: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecvt", ebbe(int ), (int)441);
                        if (!var6_2) ** break;
                        throw null;
                    }
                    case 4: {
                        ** GOTO lbl149
                    }
                    case 6: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecvx", ebbe(int ), (int)445);
                        cfr_temp_0 = 21;
                        if (var6_2) {
                            throw null;
                        }
                        break block77;
                    }
                    case 11: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecwc", ebbe(int ), (int)450);
                        cfr_temp_0 = 20;
                        if (var6_2) {
                            throw null;
                        }
                        break block77;
                    }
                    case 12: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecwd", ebbe(int ), (int)451);
                        cfr_temp_0 = 3;
                        if (var6_2) {
                            throw null;
                        }
                        break block77;
                    }
                    case 13: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecwe", ebbe(int ), (int)452);
                        cfr_temp_0 = 0;
                        if (var6_2) {
                            throw null;
                        }
                        break block77;
                    }
                    case 17: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecwi", ebbe(int ), (int)456);
                        cfr_temp_0 = 15;
                        if (var6_2) {
                            throw null;
                        }
                        break block77;
                    }
                    case 19: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecwk", ebbe(int ), (int)458);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 16: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecwh", ebbe(int ), (int)455);
                        cfr_temp_0 = 7;
                        if (var6_2) {
                            throw null;
                        }
                        break block77;
                    }
                    case 20: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecwl", ebbe(int ), (int)459);
                        cfr_temp_0 = 26;
                        if (var6_2) {
                            throw null;
                        }
                        break block77;
                    }
                    case 21: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecwm", ebbe(int ), (int)460);
                        if (!var6_2) ** break;
                        throw null;
                    }
                    case 22: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecwn", ebbe(int ), (int)461);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 3: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecvu", ebbe(int ), (int)442);
                        cfr_temp_0 = 28;
                        if (var6_2) {
                            throw null;
                        }
                        break block77;
                    }
                    case 23: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecwo", ebbe(int ), (int)462);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 15: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecwg", ebbe(int ), (int)454);
                        cfr_temp_0 = 25;
                        if (var6_2) {
                            throw null;
                        }
                        break block77;
                    }
                    case 24: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecwp", ebbe(int ), (int)463);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 25: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecwq", ebbe(int ), (int)464);
                        cfr_temp_0 = 18;
                        if (var6_2) {
                            throw null;
                        }
                        break block77;
                    }
                    case 27: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecws", ebbe(int ), (int)466);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 28: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecwt", ebbe(int ), (int)467);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 1: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecvs", ebbe(int ), (int)440);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 7: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecvy", ebbe(int ), (int)446);
                        cfr_temp_0 = 10;
                        if (var6_2) {
                            throw null;
                        }
                        break block77;
                    }
                    case 30: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecwv", ebbe(int ), (int)469);
                        if (var6_2) {
                            throw null;
                        }
lbl149:
                        // 3 sources

                        var5_3 /* !! */  = (int)hh.ebbh("ecvv", ebbe(int ), (int)443);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 10: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecwb", ebbe(int ), (int)449);
                        cfr_temp_0 = 18;
                        if (var6_2) {
                            throw null;
                        }
                        break block77;
                    }
                    case 0: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecvr", ebbe(int ), (int)439);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 26: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecwr", ebbe(int ), (int)465);
                        cfr_temp_0 = 0;
                        if (var6_2) {
                            throw null;
                        }
                        break block77;
                    }
                    case 5: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecvw", ebbe(int ), (int)444);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 8: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecvz", ebbe(int ), (int)447);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 14: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecwf", ebbe(int ), (int)453);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 18: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecwj", ebbe(int ), (int)457);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 29: {
                        var5_3 /* !! */  = (int)hh.ebbh("ecwu", ebbe(int ), (int)468);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 9: 
                }
                ** GOTO lbl193
            }
            do {
                if (true) continue block33;
lbl193:
                // 2 sources

                var5_3 /* !! */  = (int)hh.ebbh("ecwa", ebbe(int ), (int)448);
                cfr_temp_0 = 5;
            } while (!var6_2);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onKey(cn var1_1) {
        block166: {
            block165: {
                block164: {
                    v0 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl5
                    block115: while (true) {
                        v0 /* !! */  = (long)(v1 - hh.ebbh("ebgj", ebes(int ), (int)18));
lbl5:
                        // 2 sources

                        switch ((int)v0 /* !! */ ) {
                            case -1247771086: {
                                v1 = hh.ebbh("ebgk", ebes(int ), (int)19);
                                continue block115;
                            }
                            case 672168633: {
                                break block115;
                            }
                            case 2084923212: {
                                v1 = hh.ebbh("ebgl", ebes(int ), (int)20);
                                continue block115;
                            }
                        }
                        break;
                    }
                    var4_2 = hh.c;
                    v2 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl19
                    block116: while (true) {
                        v2 /* !! */  = (long)(v3 - hh.ebbh("ebgm", ebes(int ), (int)21));
lbl19:
                        // 2 sources

                        switch ((int)v2 /* !! */ ) {
                            case -842937672: {
                                v3 = hh.ebbh("ebgn", ebes(int ), (int)22);
                                continue block116;
                            }
                            case -628060104: {
                                v3 = hh.ebbh("ebgo", ebes(int ), (int)23);
                                continue block116;
                            }
                            case 672168633: {
                                break block116;
                            }
                        }
                        break;
                    }
                    var3_3 /* !! */  = hh.b;
                    v4 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl33
                    block117: while (true) {
                        v4 /* !! */  = (long)(hh.ebbh("ebgq", ebes(int ), (int)25) - hh.ebbh("ebgp", ebes(int ), (int)24));
lbl33:
                        // 2 sources

                        switch ((int)v4 /* !! */ ) {
                            case -1599798006: {
                                continue block117;
                            }
                            case 672168633: {
                                break block117;
                            }
                        }
                        break;
                    }
                    var2_4 = hh.a;
                    if (var4_2) {
                        throw null;
lbl41:
                        // 14 sources

                        return;
                    }
                    if (var2_4 || var2_4) ** GOTO lbl41
                    v5 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl48
                    block119: while (true) {
                        v5 /* !! */  = (long)(v6 - hh.ebbh("ebgr", ebes(int ), (int)26));
lbl48:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case 395960828: {
                                v6 = hh.ebbh("ebgs", ebes(int ), (int)27);
                                continue block119;
                            }
                            case 672168633: {
                                break block119;
                            }
                            case 1171673407: {
                                v6 = hh.ebbh("ebgt", ebes(int ), (int)28);
                                continue block119;
                            }
                            case 1565128121: {
                                v6 = hh.ebbh("ebgu", ebes(int ), (int)29);
                                continue block119;
                            }
                        }
                        break;
                    }
                    v7 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl64
                    block120: while (true) {
                        v7 /* !! */  = (long)(v8 - hh.ebbh("ebgv", ebes(int ), (int)30));
lbl64:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -231190772: {
                                v8 = hh.ebbh("ebgw", ebes(int ), (int)31);
                                continue block120;
                            }
                            case 672168633: {
                                break block120;
                            }
                            case 1536056041: {
                                v8 = hh.ebbh("ebgx", ebes(int ), (int)32);
                                continue block120;
                            }
                            case 2123322118: {
                                v8 = hh.ebbh("ebgy", ebes(int ), (int)33);
                                continue block120;
                            }
                        }
                        break;
                    }
                    if (hh.mc.field_1724 == null) break block164;
                    if (var2_4) ** GOTO lbl41
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("ebgz", ebes(int ), (int)34)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v9 /* !! */  == hh.ebbh("ebha", ebbe(int ), (int)110)) break;
                        v9 /* !! */  = (long)hh.ebbh("ebhb", ebbe(int ), (int)111);
                    }
                    v10 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl87
                    block122: while (true) {
                        v10 /* !! */  = (long)(v11 - hh.ebbh("ebhc", ebes(int ), (int)35));
lbl87:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case 33497972: {
                                v11 = hh.ebbh("ebhd", ebes(int ), (int)36);
                                continue block122;
                            }
                            case 672168633: {
                                break block122;
                            }
                            case 2055571866: {
                                v11 = hh.ebbh("ebhe", ebes(int ), (int)37);
                                continue block122;
                            }
                        }
                        break;
                    }
                    if (hh.mc.field_1755 == null) break block165;
                    if (var2_4) ** GOTO lbl41
                }
                if (var2_4 || var2_4) ** GOTO lbl41
                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl41
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("ebma", ebes(int ), (int)38)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == hh.ebbh("ebmg", ebbe(int ), (int)112)) break;
                v12 /* !! */  = (long)hh.ebbh("ebmh", ebbe(int ), (int)113);
            }
            this.normalizeLegacyMode();
            if (var2_4 || var2_4) ** GOTO lbl41
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("ebmk", ebes(int ), (int)39)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == hh.ebbh("ebmm", ebbe(int ), (int)114)) break;
                v13 /* !! */  = (long)hh.ebbh("ebmn", ebbe(int ), (int)115);
            }
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_3 = hh.kf - hh.ebbh("ebmo", ebes(int ), (int)40)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == hh.ebbh("ebmp", ebbe(int ), (int)116)) break;
                v14 /* !! */  = (long)hh.ebbh("ebmv", ebbe(int ), (int)117);
            }
            if (!this.mode.isSelected("\u0422\u0440\u043e\u0439\u043d\u043e\u0439")) ** GOTO lbl228
            if (var2_4 || var2_4) ** GOTO lbl41
            v15 /* !! */  = hh.kf;
            if (true) ** GOTO lbl126
            block126: while (true) {
                v15 /* !! */  = (long)(v16 - hh.ebbh("ebmw", ebes(int ), (int)41));
lbl126:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case 478338078: {
                        v16 = hh.ebbh("ebmx", ebes(int ), (int)42);
                        continue block126;
                    }
                    case 672168633: {
                        break block126;
                    }
                    case 1150681762: {
                        v16 = hh.ebbh("ebmy", ebes(int ), (int)43);
                        continue block126;
                    }
                    case 1258052036: {
                        v16 = hh.ebbh("ebmz", ebes(int ), (int)44);
                        continue block126;
                    }
                }
                break;
            }
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_4 = hh.kf - hh.ebbh("ebnb", ebes(int ), (int)45)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == hh.ebbh("ebnd", ebbe(int ), (int)118)) break;
                v17 /* !! */  = (long)hh.ebbh("ebnj", ebbe(int ), (int)119);
            }
            if (var1_1.isBindReleased(this.ringBind)) break block166;
            if (var2_4 || var2_4) ** GOTO lbl41
            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl41
        v18 /* !! */  = hh.kf;
        if (true) ** GOTO lbl152
        block128: while (true) {
            v18 /* !! */  = (long)(v19 - hh.ebbh("ebnl", ebes(int ), (int)46));
lbl152:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -1591005586: {
                    v19 = hh.ebbh("ebnn", ebes(int ), (int)47);
                    continue block128;
                }
                case 672168633: {
                    break block128;
                }
                case 1913656895: {
                    v19 = hh.ebbh("ebnq", ebes(int ), (int)48);
                    continue block128;
                }
            }
            break;
        }
        v20 /* !! */  = hh.kf;
        if (true) ** GOTO lbl165
        block129: while (true) {
            v20 /* !! */  = (long)(v21 - hh.ebbh("ebns", ebes(int ), (int)49));
lbl165:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case -1056604816: {
                    v21 = hh.ebbh("ebnt", ebes(int ), (int)50);
                    continue block129;
                }
                case 672168633: {
                    break block129;
                }
                case 1298964074: {
                    v21 = hh.ebbh("ebnw", ebes(int ), (int)51);
                    continue block129;
                }
                case 1970479368: {
                    v21 = hh.ebbh("ebnx", ebes(int ), (int)52);
                    continue block129;
                }
            }
            break;
        }
        v22 /* !! */  = hh.kf;
        if (true) ** GOTO lbl181
        block130: while (true) {
            v22 /* !! */  = (long)(v23 - hh.ebbh("ebnz", ebes(int ), (int)53));
lbl181:
            // 2 sources

            switch ((int)v22 /* !! */ ) {
                case 672168633: {
                    break block130;
                }
                case 1164007199: {
                    v23 = hh.ebbh("eboc", ebes(int ), (int)54);
                    continue block130;
                }
                case 1730295580: {
                    v23 = hh.ebbh("ebod", ebes(int ), (int)55);
                    continue block130;
                }
            }
            break;
        }
        v24 /* !! */  = hh.kf;
        if (true) ** GOTO lbl194
        block131: while (true) {
            v24 /* !! */  = (long)(v25 - hh.ebbh("ebog", ebes(int ), (int)56));
lbl194:
            // 2 sources

            switch ((int)v24 /* !! */ ) {
                case -1190294293: {
                    v25 = hh.ebbh("eboh", ebes(int ), (int)57);
                    continue block131;
                }
                case 672168633: {
                    break block131;
                }
                case 1361495153: {
                    v25 = hh.ebbh("eboj", ebes(int ), (int)58);
                    continue block131;
                }
                case 1444090596: {
                    v25 = hh.ebbh("ebol", ebes(int ), (int)59);
                    continue block131;
                }
            }
            break;
        }
        v26 = hh.mc.field_1755;
        while (true) {
            if ((v27 /* !! */  = (cfr_temp_5 = hh.kf - hh.ebbh("eboo", ebes(int ), (int)60)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v27 /* !! */  == hh.ebbh("eboq", ebbe(int ), (int)120)) break;
            v27 /* !! */  = (long)hh.ebbh("ebos", ebbe(int ), (int)121);
        }
        v28 = new mc(this, v26);
        v29 /* !! */  = hh.kf;
        if (true) ** GOTO lbl217
        block133: while (true) {
            v29 /* !! */  = (long)(hh.ebbh("ebox", ebes(int ), (int)62) - hh.ebbh("ebou", ebes(int ), (int)61));
lbl217:
            // 2 sources

            switch ((int)v29 /* !! */ ) {
                case -563874207: {
                    continue block133;
                }
                case 672168633: {
                    break block133;
                }
            }
            break;
        }
        hh.mc.method_1507((class_437)v28);
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl41
                return;
            }
lbl228:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl41
            v30 /* !! */  = hh.kf;
            if (true) ** GOTO lbl233
            block134: while (true) {
                v30 /* !! */  = (long)(v31 - hh.ebbh("ebpc", ebes(int ), (int)63));
lbl233:
                // 2 sources

                switch ((int)v30 /* !! */ ) {
                    case -1951904769: {
                        v31 = hh.ebbh("ebpd", ebes(int ), (int)64);
                        continue block134;
                    }
                    case -540807865: {
                        v31 = hh.ebbh("ebpe", ebes(int ), (int)65);
                        continue block134;
                    }
                    case 561223914: {
                        v31 = hh.ebbh("ebpf", ebes(int ), (int)66);
                        continue block134;
                    }
                    case 672168633: {
                        break block134;
                    }
                }
                break;
            }
            v32 /* !! */  = hh.kf;
            if (true) ** GOTO lbl249
            block135: while (true) {
                v32 /* !! */  = (long)(v33 - hh.ebbh("ebpg", ebes(int ), (int)67));
lbl249:
                // 2 sources

                switch ((int)v32 /* !! */ ) {
                    case -1162297002: {
                        v33 = hh.ebbh("ebpn", ebes(int ), (int)68);
                        continue block135;
                    }
                    case 459050359: {
                        v33 = hh.ebbh("ebpp", ebes(int ), (int)69);
                        continue block135;
                    }
                    case 672168633: {
                        break block135;
                    }
                }
                break;
            }
            if (var1_1.isBindReleased(this.bind)) ** GOTO lbl261
            if (var2_4 || var2_4) ** GOTO lbl41
            return;
lbl261:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl41
            v34 /* !! */  = hh.kf;
            if (true) ** GOTO lbl266
            block136: while (true) {
                v34 /* !! */  = (long)(hh.ebbh("ebpr", ebes(int ), (int)71) - hh.ebbh("ebpq", ebes(int ), (int)70));
lbl266:
                // 2 sources

                switch ((int)v34 /* !! */ ) {
                    case -144830476: {
                        continue block136;
                    }
                    case 672168633: {
                        break block136;
                    }
                }
                break;
            }
            v35 = this.resolveToggleTarget();
            v36 /* !! */  = hh.kf;
            if (true) ** GOTO lbl276
            block137: while (true) {
                v36 /* !! */  = (long)(v37 - hh.ebbh("ebpt", ebes(int ), (int)72));
lbl276:
                // 2 sources

                switch ((int)v36 /* !! */ ) {
                    case 55329526: {
                        v37 = hh.ebbh("ebpu", ebes(int ), (int)73);
                        continue block137;
                    }
                    case 672168633: {
                        break block137;
                    }
                    case 1365097091: {
                        v37 = hh.ebbh("ebpv", ebes(int ), (int)74);
                        continue block137;
                    }
                }
                break;
            }
            this.swapTo(v35);
            if (!var2_4 && !var2_4) ** break;
            ** continue;
            return;
lbl289:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)hh.ebbh("ebpz", ebbe(int ), (int)122);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl400
            }
            case 1: {
                var3_3 /* !! */  = (int)hh.ebbh("ebqd", ebbe(int ), (int)123);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl304
            }
lbl299:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)hh.ebbh("ebqg", ebbe(int ), (int)124);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl319
            }
lbl304:
            // 3 sources

            case 3: {
                var3_3 /* !! */  = (int)hh.ebbh("ebqh", ebbe(int ), (int)125);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl396
            }
lbl309:
            // 4 sources

            case 4: {
                var3_3 /* !! */  = (int)hh.ebbh("ebqi", ebbe(int ), (int)126);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl371
            }
            case 5: {
                var3_3 /* !! */  = (int)hh.ebbh("ebqj", ebbe(int ), (int)127);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl347
            }
lbl319:
            // 5 sources

            case 6: {
                var3_3 /* !! */  = (int)hh.ebbh("ebqk", ebbe(int ), (int)128);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl404
            }
            case 7: {
                var3_3 /* !! */  = (int)hh.ebbh("ebqq", ebbe(int ), (int)129);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl396
            }
            case 8: {
                var3_3 /* !! */  = (int)hh.ebbh("ebqr", ebbe(int ), (int)130);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl379
            }
lbl334:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)hh.ebbh("ebqu", ebbe(int ), (int)131);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl343
            }
lbl339:
            // 3 sources

            case 10: {
                var3_3 /* !! */  = (int)hh.ebbh("ebqx", ebbe(int ), (int)132);
                if (!var4_2) ** GOTO lbl309
                throw null;
            }
lbl343:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)hh.ebbh("ebra", ebbe(int ), (int)133);
                if (!var4_2) ** GOTO lbl299
                throw null;
            }
lbl347:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)hh.ebbh("ebrc", ebbe(int ), (int)134);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl379
            }
lbl352:
            // 2 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hh.ebbh("ebrd", ebbe(int ), (int)135);
                    if (!var4_2) ** GOTO lbl339
                    throw null;
                }
            }
            case 14: {
                var3_3 /* !! */  = (int)hh.ebbh("ebre", ebbe(int ), (int)136);
                if (!var4_2) ** GOTO lbl334
                throw null;
            }
            case 15: {
                var3_3 /* !! */  = (int)hh.ebbh("ebrl", ebbe(int ), (int)137);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl412
            }
            case 16: {
                var3_3 /* !! */  = (int)hh.ebbh("ebrm", ebbe(int ), (int)138);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl416
            }
lbl371:
            // 2 sources

            case 17: {
                var3_3 /* !! */  = (int)hh.ebbh("ebrn", ebbe(int ), (int)139);
                if (!var4_2) ** GOTO lbl309
                throw null;
            }
            case 18: {
                var3_3 /* !! */  = (int)hh.ebbh("ebrp", ebbe(int ), (int)140);
                if (!var4_2) ** GOTO lbl319
                throw null;
            }
lbl379:
            // 3 sources

            case 19: {
                var3_3 /* !! */  = (int)hh.ebbh("ebrr", ebbe(int ), (int)141);
                if (!var4_2) ** GOTO lbl319
                throw null;
            }
            case 20: {
                var3_3 /* !! */  = (int)hh.ebbh("ebru", ebbe(int ), (int)142);
                if (!var4_2) ** GOTO lbl339
                throw null;
            }
            case 21: {
                var3_3 /* !! */  = (int)hh.ebbh("ebrx", ebbe(int ), (int)143);
                if (!var4_2) ** GOTO lbl289
                throw null;
            }
            case 22: {
                var3_3 /* !! */  = (int)hh.ebbh("ebrz", ebbe(int ), (int)144);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl404
            }
lbl396:
            // 3 sources

            case 23: {
                var3_3 /* !! */  = (int)hh.ebbh("ebsc", ebbe(int ), (int)145);
                if (!var4_2) ** GOTO lbl309
                throw null;
            }
lbl400:
            // 2 sources

            case 24: {
                var3_3 /* !! */  = (int)hh.ebbh("ebsf", ebbe(int ), (int)146);
                if (!var4_2) ** GOTO lbl304
                throw null;
            }
lbl404:
            // 3 sources

            case 25: {
                var3_3 /* !! */  = (int)hh.ebbh("ebsh", ebbe(int ), (int)147);
                if (!var4_2) ** GOTO lbl319
                throw null;
            }
lbl408:
            // 2 sources

            case 26: {
                var3_3 /* !! */  = (int)hh.ebbh("ebsj", ebbe(int ), (int)148);
                if (var4_2) {
                    throw null;
                }
            }
lbl412:
            // 4 sources

            case 27: {
                var3_3 /* !! */  = (int)hh.ebbh("ebsk", ebbe(int ), (int)149);
                if (!var4_2) ** GOTO lbl352
                throw null;
            }
lbl416:
            // 2 sources

            case 28: {
                var3_3 /* !! */  = (int)hh.ebbh("ebsl", ebbe(int ), (int)150);
                if (!var4_2) ** GOTO lbl408
                throw null;
            }
            case 29: 
        }
        var3_3 /* !! */  = (int)hh.ebbh("ebsr", ebbe(int ), (int)151);
        ** while (!var4_2)
lbl423:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void efnl() {
        hh.ebbf[600] = -1019029293;
        hh.ebbf[601] = -995770974;
        hh.ebbf[602] = -2101874784;
        hh.ebbf[603] = 1622265372;
        hh.ebbf[604] = 1690489600;
        hh.ebbf[605] = -1391670125;
        hh.ebbf[606] = 583304935;
        hh.ebbf[607] = 1968995113;
        hh.ebbf[608] = 2111476057;
        hh.ebbf[609] = -1779436044;
        hh.ebbf[610] = 955171468;
        hh.ebbf[611] = -412731113;
        hh.ebbf[612] = -1686229623;
        hh.ebbf[613] = 1857831049;
        hh.ebbf[614] = 2101122552;
        hh.ebbf[615] = 1957727280;
        hh.ebbf[616] = 1920715459;
        hh.ebbf[617] = -1992953128;
        hh.ebbf[618] = -290587412;
        hh.ebbf[619] = 1066543909;
        hh.ebbf[620] = -144380070;
        hh.ebbf[621] = -2030563482;
        hh.ebbf[622] = -454120157;
        hh.ebbf[623] = -611344704;
        hh.ebbf[624] = -1935393962;
        hh.ebbf[625] = 1632028765;
        hh.ebbf[626] = 1626184134;
        hh.ebbf[627] = 1950466499;
        hh.ebbf[628] = 144418358;
        hh.ebbf[629] = -460777600;
        hh.ebbf[630] = -1993349840;
        hh.ebbf[631] = -676438358;
        hh.ebbf[632] = 1754540111;
        hh.ebbf[633] = 1321960769;
        hh.ebbf[634] = 1761264320;
        hh.ebbf[635] = 320293842;
        hh.ebbf[636] = -1659225257;
        hh.ebbf[637] = -992603609;
        hh.ebbf[638] = 555377047;
        hh.ebbf[639] = -1638217620;
        hh.ebbf[640] = 1799621125;
        hh.ebbf[641] = 138013041;
        hh.ebbf[642] = 1201417984;
        hh.ebbf[643] = 546776008;
        hh.ebbf[644] = -1029206471;
        hh.ebbf[645] = 2013176988;
        hh.ebbf[646] = -528862109;
        hh.ebbf[647] = -504559446;
        hh.ebbf[648] = 893912778;
        hh.ebbf[649] = -1447205114;
        hh.ebbf[650] = -1994931280;
        hh.ebbf[651] = -1664604624;
        hh.ebbf[652] = -1962444222;
        hh.ebbf[653] = -139074270;
        hh.ebbf[654] = 18361922;
        hh.ebbf[655] = 943469150;
        hh.ebbf[656] = -1042956524;
        hh.ebbf[657] = -1172553276;
        hh.ebbf[658] = -1717134458;
        hh.ebbf[659] = -2066463501;
        hh.ebbf[660] = -1245352678;
        hh.ebbf[661] = -509164593;
        hh.ebbf[662] = 787186173;
        hh.ebbf[663] = -1321736053;
        hh.ebbf[664] = 780782378;
        hh.ebbf[665] = 1092754828;
        hh.ebbf[666] = 14279585;
        hh.ebbf[667] = 268645154;
        hh.ebbf[668] = -233946267;
        hh.ebbf[669] = 817887870;
        hh.ebbf[670] = -223224112;
        hh.ebbf[671] = -1414442977;
        hh.ebbf[672] = 1682141052;
        hh.ebbf[673] = -1799842834;
        hh.ebbf[674] = -1233729873;
        hh.ebbf[675] = -1215918615;
        hh.ebbf[676] = -1669527399;
        hh.ebbf[677] = 1712838345;
        hh.ebbf[678] = 808238962;
        hh.ebbf[679] = -281325691;
        hh.ebbf[680] = 2044464298;
        hh.ebbf[681] = 1827036235;
        hh.ebbf[682] = 2145023649;
        hh.ebbf[683] = 1501876615;
        hh.ebbf[684] = 852839261;
        hh.ebbf[685] = -522904364;
        hh.ebbf[686] = -1989539690;
        hh.ebbf[687] = -1429633249;
        hh.ebbf[688] = -2080630157;
        hh.ebbf[689] = 96867698;
        hh.ebbf[690] = -748672985;
        hh.ebbf[691] = 1805483171;
        hh.ebbf[692] = -1582373556;
        hh.ebbf[693] = 1008945976;
        hh.ebbf[694] = 383527390;
        hh.ebbf[695] = -1132848564;
        hh.ebbf[696] = 1302640459;
        hh.ebbf[697] = -996569239;
        hh.ebbf[698] = -2100469452;
        hh.ebbf[699] = 787872080;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isRingSlot(int var1_1) {
        v0 /* !! */  = hh.kf;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - hh.ebbh("edzv", ebes(int ), (int)580));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 672168633: {
                    break block28;
                }
                case 1394988013: {
                    v1 = hh.ebbh("edzw", ebes(int ), (int)581);
                    continue block28;
                }
                case 1674850361: {
                    v1 = hh.ebbh("edzx", ebes(int ), (int)582);
                    continue block28;
                }
            }
            break;
        }
        var4_2 = hh.c;
        v2 /* !! */  = hh.kf;
        if (true) ** GOTO lbl19
        block29: while (true) {
            v2 /* !! */  = (long)(v3 - hh.ebbh("edzy", ebes(int ), (int)583));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1695988329: {
                    v3 = hh.ebbh("edzz", ebes(int ), (int)584);
                    continue block29;
                }
                case -560283378: {
                    v3 = hh.ebbh("eeaa", ebes(int ), (int)585);
                    continue block29;
                }
                case 470389883: {
                    v3 = hh.ebbh("eeab", ebes(int ), (int)586);
                    continue block29;
                }
                case 672168633: {
                    break block29;
                }
            }
            break;
        }
        var3_3 /* !! */  = hh.b;
        v4 /* !! */  = hh.kf;
        if (true) ** GOTO lbl36
        block30: while (true) {
            v4 /* !! */  = (long)(v5 - hh.ebbh("eeac", ebes(int ), (int)587));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 58330922: {
                    v5 = hh.ebbh("eead", ebes(int ), (int)588);
                    continue block30;
                }
                case 542341331: {
                    v5 = hh.ebbh("eeae", ebes(int ), (int)589);
                    continue block30;
                }
                case 672168633: {
                    break block30;
                }
                case 1852221365: {
                    v5 = hh.ebbh("eeaf", ebes(int ), (int)590);
                    continue block30;
                }
            }
            break;
        }
        var2_4 = hh.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
lbl54:
                    // 4 sources

                    return (boolean)hh.ebbh("eeag", ebbe(int ), (int)854);
                }
                if (var2_4 || var2_4) ** GOTO lbl54
                if (var1_1 < 0) ** GOTO lbl71
                if (var2_4) ** GOTO lbl54
                while (true) {
                    if ((v6 = (cfr_temp_0 = hh.kf - hh.ebbh("eeah", ebes(int ), (int)591)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 == hh.ebbh("eeai", ebbe(int ), (int)855)) break;
                    v6 = -340551171;
                }
                if (var1_1 >= this.ringItems.length) ** GOTO lbl71
                if (var2_4) ** GOTO lbl54
                v7 = hh.ebbh("eeaj", ebbe(int ), (int)856);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl74
lbl71:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v7 = hh.ebbh("eeak", ebbe(int ), (int)857);
lbl74:
                // 2 sources

                return (boolean)v7;
            }
lbl75:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)hh.ebbh("eeal", ebbe(int ), (int)858);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl85
            }
lbl80:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hh.ebbh("eeam", ebbe(int ), (int)859);
                    if (!var4_2) ** GOTO lbl75
                    throw null;
                }
            }
lbl85:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)hh.ebbh("eean", ebbe(int ), (int)860);
                if (!var4_2) ** GOTO lbl80
                throw null;
            }
lbl89:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)hh.ebbh("eeao", ebbe(int ), (int)861);
                if (var4_2) {
                    throw null;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)hh.ebbh("eeap", ebbe(int ), (int)862);
                if (var4_2) {
                    throw null;
                }
            }
lbl97:
            // 4 sources

            case 5: {
                var3_3 /* !! */  = (int)hh.ebbh("eeaq", ebbe(int ), (int)863);
                if (!var4_2) ** GOTO lbl89
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)hh.ebbh("eear", ebbe(int ), (int)864);
                if (!var4_2) ** GOTO lbl97
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)hh.ebbh("eeas", ebbe(int ), (int)865);
                if (!var4_2) break;
                throw null;
            }
            case 8: 
        }
        var3_3 /* !! */  = (int)hh.ebbh("eeat", ebbe(int ), (int)866);
        ** while (!var4_2)
lbl112:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isSelectableRingItem(class_1799 var1_1) {
        block63: {
            v0 /* !! */  = hh.kf;
            if (true) ** GOTO lbl5
            block37: while (true) {
                v0 /* !! */  = (long)(v1 - hh.ebbh("ebys", ebes(int ), (int)104));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1556817506: {
                        v1 = hh.ebbh("ebyv", ebes(int ), (int)105);
                        continue block37;
                    }
                    case 446330390: {
                        v1 = hh.ebbh("ebyx", ebes(int ), (int)106);
                        continue block37;
                    }
                    case 672168633: {
                        break block37;
                    }
                    case 713631488: {
                        v1 = hh.ebbh("ebyz", ebes(int ), (int)107);
                        continue block37;
                    }
                }
                break;
            }
            var4_2 = hh.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("ebzi", ebes(int ), (int)108)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == hh.ebbh("ebzk", ebbe(int ), (int)180)) break;
                v2 /* !! */  = (long)hh.ebbh("ebzl", ebbe(int ), (int)181);
            }
            var3_3 /* !! */  = hh.b;
            v3 /* !! */  = hh.kf;
            if (true) ** GOTO lbl29
            block39: while (true) {
                v3 /* !! */  = (long)(v4 - hh.ebbh("ebzm", ebes(int ), (int)109));
lbl29:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -2032490409: {
                        v4 = hh.ebbh("ebzn", ebes(int ), (int)110);
                        continue block39;
                    }
                    case -1402575229: {
                        v4 = hh.ebbh("ebzo", ebes(int ), (int)111);
                        continue block39;
                    }
                    case -966595533: {
                        v4 = hh.ebbh("ebzq", ebes(int ), (int)112);
                        continue block39;
                    }
                    case 672168633: {
                        break block39;
                    }
                }
                break;
            }
            var2_4 = hh.a;
            if (var4_2) {
                throw null;
lbl44:
                // 8 sources

                return (boolean)hh.ebbh("ebzy", ebbe(int ), (int)182);
            }
            if (var2_4 || var2_4) ** GOTO lbl44
            if (var1_1 == null) ** GOTO lbl108
            if (var2_4) ** GOTO lbl44
            v5 /* !! */  = hh.kf;
            if (true) ** GOTO lbl53
            block41: while (true) {
                v5 /* !! */  = (long)(hh.ebbh("ecae", ebes(int ), (int)114) - hh.ebbh("ecac", ebes(int ), (int)113));
lbl53:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -328879360: {
                        continue block41;
                    }
                    case 672168633: {
                        break block41;
                    }
                }
                break;
            }
            if (var1_1.method_7960()) ** GOTO lbl108
            if (var2_4) ** GOTO lbl44
            v6 /* !! */  = hh.kf;
            if (true) ** GOTO lbl64
            block42: while (true) {
                v6 /* !! */  = (long)(v7 - hh.ebbh("ecaf", ebes(int ), (int)115));
lbl64:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case 244920406: {
                        v7 = hh.ebbh("ecah", ebes(int ), (int)116);
                        continue block42;
                    }
                    case 635205875: {
                        v7 = hh.ebbh("ecak", ebes(int ), (int)117);
                        continue block42;
                    }
                    case 672168633: {
                        break block42;
                    }
                    case 1243316198: {
                        v7 = hh.ebbh("ecal", ebes(int ), (int)118);
                        continue block42;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("ecat", ebes(int ), (int)119)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v8 /* !! */  == hh.ebbh("ecav", ebbe(int ), (int)183)) break;
                v8 /* !! */  = (long)hh.ebbh("ecaw", ebbe(int ), (int)184);
            }
            if (var1_1.method_31574(class_1802.field_8575)) break block63;
            if (var2_4) ** GOTO lbl44
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("ecax", ebes(int ), (int)120)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v9 /* !! */  == hh.ebbh("ecba", ebbe(int ), (int)185)) break;
                v9 /* !! */  = (long)hh.ebbh("ecbb", ebbe(int ), (int)186);
            }
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_3 = hh.kf - hh.ebbh("ecbi", ebes(int ), (int)121)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v10 /* !! */  == hh.ebbh("ecbl", ebbe(int ), (int)187)) break;
                v10 /* !! */  = (long)hh.ebbh("ecbn", ebbe(int ), (int)188);
            }
            if (!var1_1.method_31574(class_1802.field_8288)) ** GOTO lbl108
            if (var2_4) ** GOTO lbl44
        }
        if (var2_4) ** GOTO lbl44
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl44
                v11 = hh.ebbh("ecbr", ebbe(int ), (int)189);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl111
            }
lbl108:
            // 3 sources

            if (!var2_4 && !var2_4) ** break;
            ** continue;
            v11 = hh.ebbh("ecbs", ebbe(int ), (int)190);
lbl111:
            // 2 sources

            return (boolean)v11;
            case 0: {
                var3_3 /* !! */  = (int)hh.ebbh("ecca", ebbe(int ), (int)191);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl117:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)hh.ebbh("eccf", ebbe(int ), (int)192);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl122:
            // 4 sources

            case 2: {
                var3_3 /* !! */  = (int)hh.ebbh("eccg", ebbe(int ), (int)193);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl159
            }
            case 3: {
                do {
                    var3_3 /* !! */  = (int)hh.ebbh("eccj", ebbe(int ), (int)194);
                } while (!var4_2);
                throw null;
            }
lbl132:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)hh.ebbh("eccr", ebbe(int ), (int)195);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 5: {
                var3_3 /* !! */  = (int)hh.ebbh("ecct", ebbe(int ), (int)196);
                if (!var4_2) ** GOTO lbl132
                throw null;
            }
            case 6: {
                do {
                    var3_3 /* !! */  = (int)hh.ebbh("eccv", ebbe(int ), (int)197);
                } while (!var4_2);
                throw null;
            }
lbl146:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)hh.ebbh("eccx", ebbe(int ), (int)198);
                if (!var4_2) ** GOTO lbl117
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)hh.ebbh("ecda", ebbe(int ), (int)199);
                if (!var4_2) ** GOTO lbl132
                throw null;
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hh.ebbh("ecdb", ebbe(int ), (int)200);
                    if (!var4_2) ** GOTO lbl122
                    throw null;
                }
            }
lbl159:
            // 3 sources

            case 10: {
                var3_3 /* !! */  = (int)hh.ebbh("ecdc", ebbe(int ), (int)201);
                if (!var4_2) ** GOTO lbl122
                throw null;
            }
lbl163:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)hh.ebbh("ecdj", ebbe(int ), (int)202);
                if (!var4_2) ** GOTO lbl159
                throw null;
            }
            case 12: 
        }
        var3_3 /* !! */  = (int)hh.ebbh("ecdk", ebbe(int ), (int)203);
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
        v0 /* !! */  = hh.kf;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - hh.ebbh("eeau", ebes(int ), (int)592));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 153575098: {
                    v1 = hh.ebbh("eeav", ebes(int ), (int)593);
                    continue block20;
                }
                case 672168633: {
                    break block20;
                }
                case 868081462: {
                    v1 = hh.ebbh("eeaw", ebes(int ), (int)594);
                    continue block20;
                }
            }
            break;
        }
        var3_1 = hh.c;
        v2 /* !! */  = hh.kf;
        if (true) ** GOTO lbl19
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - hh.ebbh("eeax", ebes(int ), (int)595));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1400239497: {
                    v3 = hh.ebbh("eeay", ebes(int ), (int)596);
                    continue block21;
                }
                case 672168633: {
                    break block21;
                }
                case 1445937677: {
                    v3 = hh.ebbh("eeaz", ebes(int ), (int)597);
                    continue block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = hh.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("eeba", ebes(int ), (int)598)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == hh.ebbh("eebb", ebbe(int ), (int)867)) break;
            v4 /* !! */  = (long)hh.ebbh("eebc", ebbe(int ), (int)868);
        }
        var1_3 = hh.a;
        if (var3_1) {
            throw null;
lbl37:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("eebd", ebes(int ), (int)599)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == hh.ebbh("eebe", ebbe(int ), (int)869)) break;
                    v5 /* !! */  = (long)hh.ebbh("eebf", ebbe(int ), (int)870);
                }
                nz.cancelSwap("AutoSwap");
                if (var1_3 || var1_3) ** GOTO lbl37
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("eebg", ebes(int ), (int)600)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == hh.ebbh("eebh", ebbe(int ), (int)871)) break;
                    v6 /* !! */  = (long)hh.ebbh("eebi", ebbe(int ), (int)872);
                }
                this.cleanup();
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl58:
            // 3 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)hh.ebbh("eebj", ebbe(int ), (int)873);
                } while (!var3_1);
                throw null;
            }
lbl63:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)hh.ebbh("eebk", ebbe(int ), (int)874);
                if (!var3_1) ** GOTO lbl58
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hh.ebbh("eebl", ebbe(int ), (int)875);
                if (!var3_1) ** GOTO lbl63
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)hh.ebbh("eebm", ebbe(int ), (int)876);
                if (var3_1) {
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)hh.ebbh("eebn", ebbe(int ), (int)877);
                if (!var3_1) ** GOTO lbl63
                throw null;
            }
            case 5: {
                do {
                    var2_2 /* !! */  = (int)hh.ebbh("eebo", ebbe(int ), (int)878);
                } while (!var3_1);
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)hh.ebbh("eebp", ebbe(int ), (int)879);
                if (!var3_1) ** GOTO lbl58
                throw null;
            }
            case 7: 
        }
        do {
            var2_2 /* !! */  = (int)hh.ebbh("eebq", ebbe(int ), (int)880);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ double edqf(int n2) {
        return Double.longBitsToDouble(ebet[n2] ^ ebeu[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private String resolveToggleTarget() {
        v0 /* !! */  = hh.kf;
        if (true) ** GOTO lbl5
        block43: while (true) {
            v0 /* !! */  = (long)(v1 - hh.ebbh("ecsh", ebes(int ), (int)258));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1594242994: {
                    v1 = hh.ebbh("ecsi", ebes(int ), (int)259);
                    continue block43;
                }
                case 672168633: {
                    break block43;
                }
                case 1659735761: {
                    v1 = hh.ebbh("ecsj", ebes(int ), (int)260);
                    continue block43;
                }
            }
            break;
        }
        var6_1 = hh.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("ecsk", ebes(int ), (int)261)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hh.ebbh("ecsl", ebbe(int ), (int)387)) break;
            v2 /* !! */  = (long)hh.ebbh("ecsm", ebbe(int ), (int)388);
        }
        var5_2 /* !! */  = hh.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("ecsn", ebes(int ), (int)262)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hh.ebbh("ecso", ebbe(int ), (int)389)) break;
            v3 /* !! */  = (long)hh.ebbh("ecsp", ebbe(int ), (int)390);
        }
        var4_3 = hh.a;
        if (var6_1) {
            throw null;
lbl29:
            // 7 sources

            return null;
        }
        if (var4_3 || var4_3) ** GOTO lbl29
        v4 /* !! */  = hh.kf;
        if (true) ** GOTO lbl36
        block47: while (true) {
            v4 /* !! */  = (long)(v5 - hh.ebbh("ecsq", ebes(int ), (int)263));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -106209276: {
                    v5 = hh.ebbh("ecsr", ebes(int ), (int)264);
                    continue block47;
                }
                case -69414215: {
                    v5 = hh.ebbh("ecss", ebes(int ), (int)265);
                    continue block47;
                }
                case 672168633: {
                    break block47;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("ecst", ebes(int ), (int)266)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == hh.ebbh("ecsu", ebbe(int ), (int)391)) break;
            v6 /* !! */  = (long)hh.ebbh("ecsv", ebbe(int ), (int)392);
        }
        var1_4 = this.firstItem.getValue();
        if (var4_3 || var4_3) ** GOTO lbl29
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = hh.kf - hh.ebbh("ecsw", ebes(int ), (int)267)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == hh.ebbh("ecsx", ebbe(int ), (int)393)) break;
                    v7 /* !! */  = (long)hh.ebbh("ecsy", ebbe(int ), (int)394);
                }
                v8 /* !! */  = hh.kf;
                if (true) ** GOTO lbl64
                block50: while (true) {
                    v8 /* !! */  = (long)(hh.ebbh("ecta", ebes(int ), (int)269) - hh.ebbh("ecsz", ebes(int ), (int)268));
lbl64:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -325051876: {
                            continue block50;
                        }
                        case 672168633: {
                            break block50;
                        }
                    }
                    break;
                }
                var2_5 = this.secondItem.getValue();
                if (var4_3 || var4_3) ** GOTO lbl29
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_4 = hh.kf - hh.ebbh("ectb", ebes(int ), (int)270)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == hh.ebbh("ectc", ebbe(int ), (int)395)) break;
                    v9 /* !! */  = (long)hh.ebbh("ectd", ebbe(int ), (int)396);
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = hh.kf - hh.ebbh("ecte", ebes(int ), (int)271)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == hh.ebbh("ectf", ebbe(int ), (int)397)) break;
                    v10 /* !! */  = (long)hh.ebbh("ectg", ebbe(int ), (int)398);
                }
                v11 = hh.mc.field_1724;
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_6 = hh.kf - hh.ebbh("ecth", ebes(int ), (int)272)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == hh.ebbh("ecti", ebbe(int ), (int)399)) break;
                    v12 /* !! */  = (long)hh.ebbh("ectj", ebbe(int ), (int)400);
                }
                var3_6 = v11.method_6079();
                if (var4_3 || var4_3) ** GOTO lbl29
                v13 /* !! */  = hh.kf;
                if (true) ** GOTO lbl93
                block54: while (true) {
                    v13 /* !! */  = (long)(hh.ebbh("ectl", ebes(int ), (int)274) - hh.ebbh("ectk", ebes(int ), (int)273));
lbl93:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case 431038175: {
                            continue block54;
                        }
                        case 672168633: {
                            break block54;
                        }
                    }
                    break;
                }
                if (!this.matches(var3_6, var1_4)) ** GOTO lbl101
                if (var4_3 || var4_3) ** GOTO lbl29
                return var2_5;
lbl101:
                // 1 sources

                if (var4_3 || var4_3) ** GOTO lbl29
                v14 /* !! */  = hh.kf;
                if (true) ** GOTO lbl106
                block55: while (true) {
                    v14 /* !! */  = (long)(hh.ebbh("ectn", ebes(int ), (int)276) - hh.ebbh("ectm", ebes(int ), (int)275));
lbl106:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1572833686: {
                            continue block55;
                        }
                        case 672168633: {
                            break block55;
                        }
                    }
                    break;
                }
                if (this.matches(var3_6, var2_5) != false ? var4_3 == false && var4_3 == false : var4_3 == false && var4_3 == false) ** break;
                ** continue;
                return var1_4;
            }
lbl114:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)hh.ebbh("ecto", ebbe(int ), (int)401);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl167
                    break;
                }
            }
            case 1: {
                var5_2 /* !! */  = (int)hh.ebbh("ectp", ebbe(int ), (int)402);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl125:
            // 2 sources

            case 2: {
                var5_2 /* !! */  = (int)hh.ebbh("ectq", ebbe(int ), (int)403);
                if (!var6_1) break;
                throw null;
            }
lbl129:
            // 2 sources

            case 3: {
                var5_2 /* !! */  = (int)hh.ebbh("ectr", ebbe(int ), (int)404);
                if (!var6_1) ** GOTO lbl114
                throw null;
            }
            case 4: {
                var5_2 /* !! */  = (int)hh.ebbh("ects", ebbe(int ), (int)405);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
            case 5: {
                var5_2 /* !! */  = (int)hh.ebbh("ectt", ebbe(int ), (int)406);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 6: {
                var5_2 /* !! */  = (int)hh.ebbh("ectu", ebbe(int ), (int)407);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl148:
            // 2 sources

            case 7: {
                var5_2 /* !! */  = (int)hh.ebbh("ectv", ebbe(int ), (int)408);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl153:
            // 3 sources

            case 8: {
                var5_2 /* !! */  = (int)hh.ebbh("ectw", ebbe(int ), (int)409);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl167
            }
            case 9: {
                var5_2 /* !! */  = (int)hh.ebbh("ectx", ebbe(int ), (int)410);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl163:
            // 4 sources

            case 10: {
                var5_2 /* !! */  = (int)hh.ebbh("ecty", ebbe(int ), (int)411);
                if (!var6_1) ** GOTO lbl129
                throw null;
            }
lbl167:
            // 4 sources

            case 11: {
                var5_2 /* !! */  = (int)hh.ebbh("ectz", ebbe(int ), (int)412);
                if (!var6_1) ** GOTO lbl163
                throw null;
            }
            case 12: {
                var5_2 /* !! */  = (int)hh.ebbh("ecua", ebbe(int ), (int)413);
                if (!var6_1) ** GOTO lbl125
                throw null;
            }
            case 13: {
                var5_2 /* !! */  = (int)hh.ebbh("ecub", ebbe(int ), (int)414);
                if (!var6_1) ** GOTO lbl153
                throw null;
            }
            case 14: {
                var5_2 /* !! */  = (int)hh.ebbh("ecuc", ebbe(int ), (int)415);
                if (!var6_1) ** GOTO lbl163
                throw null;
            }
lbl183:
            // 3 sources

            case 15: {
                var5_2 /* !! */  = (int)hh.ebbh("ecud", ebbe(int ), (int)416);
                if (!var6_1) ** GOTO lbl167
                throw null;
            }
lbl187:
            // 3 sources

            case 16: {
                var5_2 /* !! */  = (int)hh.ebbh("ecue", ebbe(int ), (int)417);
                if (var6_1) {
                    throw null;
                }
            }
            case 17: {
                var5_2 /* !! */  = (int)hh.ebbh("ecuf", ebbe(int ), (int)418);
                if (!var6_1) ** GOTO lbl163
                throw null;
            }
            case 18: 
        }
        var5_2 /* !! */  = (int)hh.ebbh("ecug", ebbe(int ), (int)419);
        ** while (!var6_1)
lbl198:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldRender(dj var1_1) {
        block53: {
            v0 /* !! */  = hh.kf;
            if (true) ** GOTO lbl5
            block33: while (true) {
                v0 /* !! */  = (long)(v1 - hh.ebbh("edbc", ebes(int ), (int)325));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1883722420: {
                        v1 = hh.ebbh("edbd", ebes(int ), (int)326);
                        continue block33;
                    }
                    case -708334576: {
                        v1 = hh.ebbh("edbe", ebes(int ), (int)327);
                        continue block33;
                    }
                    case 672168633: {
                        break block33;
                    }
                    case 2030794268: {
                        v1 = hh.ebbh("edbf", ebes(int ), (int)328);
                        continue block33;
                    }
                }
                break;
            }
            var4_2 = hh.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("edbg", ebes(int ), (int)329)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == hh.ebbh("edbh", ebbe(int ), (int)549)) break;
                v2 /* !! */  = (long)hh.ebbh("edbi", ebbe(int ), (int)550);
            }
            var3_3 /* !! */  = hh.b;
            v3 /* !! */  = hh.kf;
            if (true) ** GOTO lbl29
            block35: while (true) {
                v3 /* !! */  = (long)(v4 - hh.ebbh("edbj", ebes(int ), (int)330));
lbl29:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1075281080: {
                        v4 = hh.ebbh("edbk", ebes(int ), (int)331);
                        continue block35;
                    }
                    case 638288239: {
                        v4 = hh.ebbh("edbl", ebes(int ), (int)332);
                        continue block35;
                    }
                    case 672168633: {
                        break block35;
                    }
                }
                break;
            }
            var2_4 = hh.a;
            if (var4_2) {
                throw null;
lbl41:
                // 6 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl41
            v5 /* !! */  = hh.kf;
            if (true) ** GOTO lbl48
            block37: while (true) {
                v5 /* !! */  = (long)(v6 - hh.ebbh("edbm", ebes(int ), (int)333));
lbl48:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -628305693: {
                        v6 = hh.ebbh("edbn", ebes(int ), (int)334);
                        continue block37;
                    }
                    case 672168633: {
                        break block37;
                    }
                    case 1840242049: {
                        v6 = hh.ebbh("edbo", ebes(int ), (int)335);
                        continue block37;
                    }
                }
                break;
            }
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("edbp", ebes(int ), (int)336)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v7 /* !! */  == hh.ebbh("edbq", ebbe(int ), (int)551)) break;
                v7 /* !! */  = (long)hh.ebbh("edbr", ebbe(int ), (int)552);
            }
            if (!this.swapMode.isSelected("ReallyWorld")) break block53;
            if (var2_4) ** GOTO lbl41
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("edbs", ebes(int ), (int)337)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v8 /* !! */  == hh.ebbh("edbt", ebbe(int ), (int)553)) break;
                v8 /* !! */  = (long)hh.ebbh("edbu", ebbe(int ), (int)554);
            }
            if (!nz.isSwapQueued("AutoSwap")) break block53;
            if (var2_4 || var2_4) ** GOTO lbl41
            v9 /* !! */  = hh.kf;
            if (true) ** GOTO lbl77
            block40: while (true) {
                v9 /* !! */  = (long)(v10 - hh.ebbh("edbv", ebes(int ), (int)338));
lbl77:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -2128853581: {
                        v10 = hh.ebbh("edbw", ebes(int ), (int)339);
                        continue block40;
                    }
                    case 555686137: {
                        v10 = hh.ebbh("edbx", ebes(int ), (int)340);
                        continue block40;
                    }
                    case 672168633: {
                        break block40;
                    }
                }
                break;
            }
            nz.tick();
            if (var2_4) ** GOTO lbl41
        }
        if (var2_4) ** GOTO lbl41
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl96:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)hh.ebbh("edby", ebbe(int ), (int)555);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)hh.ebbh("edbz", ebbe(int ), (int)556);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)hh.ebbh("edca", ebbe(int ), (int)557);
                if (!var4_2) break;
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)hh.ebbh("edcb", ebbe(int ), (int)558);
                if (!var4_2) ** GOTO lbl96
                throw null;
            }
lbl113:
            // 3 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hh.ebbh("edcc", ebbe(int ), (int)559);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl128
                    break;
                }
            }
            case 5: {
                var3_3 /* !! */  = (int)hh.ebbh("edcd", ebbe(int ), (int)560);
                if (!var4_2) ** GOTO lbl113
                throw null;
            }
lbl123:
            // 2 sources

            case 6: {
                do {
                    var3_3 /* !! */  = (int)hh.ebbh("edce", ebbe(int ), (int)561);
                } while (!var4_2);
                throw null;
            }
lbl128:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)hh.ebbh("edcf", ebbe(int ), (int)562);
                if (!var4_2) ** GOTO lbl113
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)hh.ebbh("edcg", ebbe(int ), (int)563);
                if (!var4_2) ** GOTO lbl123
                throw null;
            }
            case 9: 
        }
        var3_3 /* !! */  = (int)hh.ebbh("edch", ebbe(int ), (int)564);
        ** while (!var4_2)
lbl139:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean matches(class_1799 class_17992, String string) {
        Object object;
        boolean bl2;
        boolean bl3;
        block22: {
            block21: {
                bl3 = c;
                int n2 = b;
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (class_17992 == null) break block21;
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (!class_17992.method_7960()) break block22;
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
            }
            if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
            if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
            return (boolean)hh.ebbh("ebby", ebbe(int ), (int)16);
        }
        if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
        if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
        String string2 = string;
        if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
        CallSite callSite = hh.ebbh("ebbz", ebbe(int ), (int)17);
        if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
        switch (string2.hashCode()) {
            case 1009763266: {
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (!string2.equals("\u0421\u0444\u0435\u0440\u0430")) break;
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                callSite = hh.ebbh("ebca", ebbe(int ), (int)18);
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (!bl3) break;
                throw null;
            }
            case 1010520205: {
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (!string2.equals("\u0422\u043e\u0442\u0435\u043c")) break;
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                callSite = hh.ebbh("ebcb", ebbe(int ), (int)19);
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (!bl3) break;
                throw null;
            }
            case 1245091347: {
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (!string2.equals("\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d")) break;
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                callSite = hh.ebbh("ebcc", ebbe(int ), (int)20);
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (!bl3) break;
                throw null;
            }
            case 1058035: {
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (!string2.equals("\u0429\u0438\u0442")) break;
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                callSite = hh.ebbh("ebcd", ebbe(int ), (int)21);
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (!bl3) break;
                throw null;
            }
            case 368602458: {
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (!string2.equals("\u0417\u043e\u043b\u043e\u0442\u043e\u0435 \u044f\u0431\u043b\u043e\u043a\u043e")) break;
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                callSite = hh.ebbh("ebce", ebbe(int ), (int)22);
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (!bl3) break;
                throw null;
            }
            case 996396589: {
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (!string2.equals("\u0413\u0435\u043f\u043b\u044b")) break;
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                callSite = hh.ebbh("ebcf", ebbe(int ), (int)23);
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                break;
            }
        }
        if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
        if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
        switch (callSite) {
            case 0: {
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                object = class_17992.method_31574(class_1802.field_8575);
                if (!bl3) return (boolean)object;
                throw null;
            }
            case 1: {
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (class_17992.method_31574(class_1802.field_8288)) {
                    if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                    if (!this.isTalisman(class_17992)) {
                        if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                        object = hh.ebbh("ebcg", ebbe(int ), (int)24);
                        if (!bl3) return (boolean)object;
                        throw null;
                    }
                }
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                object = hh.ebbh("ebch", ebbe(int ), (int)25);
                if (!bl3) return (boolean)object;
                throw null;
            }
            case 2: {
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                object = this.isTalisman(class_17992);
                if (!bl3) return (boolean)object;
                throw null;
            }
            case 3: {
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                object = class_17992.method_31574(class_1802.field_8255);
                if (!bl3) return (boolean)object;
                throw null;
            }
            case 4: 
            case 5: {
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
                object = class_17992.method_31574(class_1802.field_8463);
                if (!bl3) return (boolean)object;
                throw null;
            }
        }
        if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
        if (bl2) return (boolean)hh.ebbh("ebbx", ebbe(int ), (int)15);
        object = hh.ebbh("ebci", ebbe(int ), (int)26);
        return (boolean)object;
    }

    private static /* synthetic */ void efnv() {
        hh.ebbg[600] = -1019029294;
        hh.ebbg[601] = -1488390772;
        hh.ebbg[602] = -2101874783;
        hh.ebbg[603] = 1622265373;
        hh.ebbg[604] = -1862446552;
        hh.ebbg[605] = 1391670124;
        hh.ebbg[606] = -1767659400;
        hh.ebbg[607] = 1968995085;
        hh.ebbg[608] = 2111476055;
        hh.ebbg[609] = -1779436044;
        hh.ebbg[610] = 955171485;
        hh.ebbg[611] = -412731112;
        hh.ebbg[612] = -1686229620;
        hh.ebbg[613] = 1857831046;
        hh.ebbg[614] = 2101122528;
        hh.ebbg[615] = 1957727266;
        hh.ebbg[616] = 1920715456;
        hh.ebbg[617] = -1992953142;
        hh.ebbg[618] = -290587410;
        hh.ebbg[619] = 1066543907;
        hh.ebbg[620] = -144380068;
        hh.ebbg[621] = -2030563472;
        hh.ebbg[622] = -454120152;
        hh.ebbg[623] = -611344698;
        hh.ebbg[624] = -1935393958;
        hh.ebbg[625] = 1632028764;
        hh.ebbg[626] = 1626184145;
        hh.ebbg[627] = 1950466512;
        hh.ebbg[628] = 144418366;
        hh.ebbg[629] = -460777591;
        hh.ebbg[630] = -1993349848;
        hh.ebbg[631] = -676438359;
        hh.ebbg[632] = 1754540102;
        hh.ebbg[633] = 1321960768;
        hh.ebbg[634] = -624614687;
        hh.ebbg[635] = -320293843;
        hh.ebbg[636] = -1659225257;
        hh.ebbg[637] = -992603611;
        hh.ebbg[638] = 555377044;
        hh.ebbg[639] = -1638217621;
        hh.ebbg[640] = 1799621121;
        hh.ebbg[641] = 138013043;
        hh.ebbg[642] = 1201417987;
        hh.ebbg[643] = 546776014;
        hh.ebbg[644] = -1029206471;
        hh.ebbg[645] = 2013176989;
        hh.ebbg[646] = 904126637;
        hh.ebbg[647] = -504559445;
        hh.ebbg[648] = 460686993;
        hh.ebbg[649] = -1447205113;
        hh.ebbg[650] = -1493290872;
        hh.ebbg[651] = 1664604623;
        hh.ebbg[652] = -1718343307;
        hh.ebbg[653] = -139074270;
        hh.ebbg[654] = 18361923;
        hh.ebbg[655] = -1094877532;
        hh.ebbg[656] = -1042956524;
        hh.ebbg[657] = -1172553275;
        hh.ebbg[658] = -1036025946;
        hh.ebbg[659] = -2066463501;
        hh.ebbg[660] = -1245352678;
        hh.ebbg[661] = -509164593;
        hh.ebbg[662] = -787186174;
        hh.ebbg[663] = -1235195389;
        hh.ebbg[664] = 780782378;
        hh.ebbg[665] = 1092754828;
        hh.ebbg[666] = 14279585;
        hh.ebbg[667] = 268645135;
        hh.ebbg[668] = -233946296;
        hh.ebbg[669] = 817887871;
        hh.ebbg[670] = -1615000482;
        hh.ebbg[671] = -1414442977;
        hh.ebbg[672] = 1682141052;
        hh.ebbg[673] = -1799842833;
        hh.ebbg[674] = -462963346;
        hh.ebbg[675] = -1215918615;
        hh.ebbg[676] = -1669527399;
        hh.ebbg[677] = -1712838346;
        hh.ebbg[678] = -1090545258;
        hh.ebbg[679] = -281325692;
        hh.ebbg[680] = -1905398965;
        hh.ebbg[681] = 1827036234;
        hh.ebbg[682] = 2145023649;
        hh.ebbg[683] = 1501876614;
        hh.ebbg[684] = -1661609845;
        hh.ebbg[685] = -522904364;
        hh.ebbg[686] = -1989539689;
        hh.ebbg[687] = 1762330048;
        hh.ebbg[688] = -2080630157;
        hh.ebbg[689] = 96867698;
        hh.ebbg[690] = -748672985;
        hh.ebbg[691] = 1805483171;
        hh.ebbg[692] = -1582373506;
        hh.ebbg[693] = 1008945977;
        hh.ebbg[694] = 1403819467;
        hh.ebbg[695] = -1132848564;
        hh.ebbg[696] = 1302640459;
        hh.ebbg[697] = -996569239;
        hh.ebbg[698] = -2100469452;
        hh.ebbg[699] = 787872081;
    }

    private static /* synthetic */ void efnt() {
        hh.ebbg[400] = 1679458904;
        hh.ebbg[401] = -2107885169;
        hh.ebbg[402] = -1586074938;
        hh.ebbg[403] = -525930996;
        hh.ebbg[404] = -6024414;
        hh.ebbg[405] = -1241270193;
        hh.ebbg[406] = 1754073435;
        hh.ebbg[407] = 57935135;
        hh.ebbg[408] = 2041100398;
        hh.ebbg[409] = -919590859;
        hh.ebbg[410] = -1461714952;
        hh.ebbg[411] = 529277622;
        hh.ebbg[412] = -114918458;
        hh.ebbg[413] = 1319750485;
        hh.ebbg[414] = 1209022029;
        hh.ebbg[415] = -510091577;
        hh.ebbg[416] = -1761817685;
        hh.ebbg[417] = 878887791;
        hh.ebbg[418] = 1842516451;
        hh.ebbg[419] = -87799444;
        hh.ebbg[420] = -2145274805;
        hh.ebbg[421] = -1564729590;
        hh.ebbg[422] = 1003373977;
        hh.ebbg[423] = -381710801;
        hh.ebbg[424] = 1186514036;
        hh.ebbg[425] = -1051654120;
        hh.ebbg[426] = 741599565;
        hh.ebbg[427] = 1700521;
        hh.ebbg[428] = 468215455;
        hh.ebbg[429] = 1904157664;
        hh.ebbg[430] = -205568300;
        hh.ebbg[431] = 61424695;
        hh.ebbg[432] = -918048330;
        hh.ebbg[433] = 75771072;
        hh.ebbg[434] = 2061107044;
        hh.ebbg[435] = -1094021749;
        hh.ebbg[436] = 1978712099;
        hh.ebbg[437] = -814961050;
        hh.ebbg[438] = 1652324275;
        hh.ebbg[439] = 882440629;
        hh.ebbg[440] = 817421130;
        hh.ebbg[441] = 795174282;
        hh.ebbg[442] = -1625614528;
        hh.ebbg[443] = -561868949;
        hh.ebbg[444] = -2119107410;
        hh.ebbg[445] = -230442653;
        hh.ebbg[446] = 163505283;
        hh.ebbg[447] = -2019271856;
        hh.ebbg[448] = -1928534805;
        hh.ebbg[449] = -1837516400;
        hh.ebbg[450] = -483166471;
        hh.ebbg[451] = -246908296;
        hh.ebbg[452] = -2081411607;
        hh.ebbg[453] = 1555142203;
        hh.ebbg[454] = 2119792256;
        hh.ebbg[455] = -1344550613;
        hh.ebbg[456] = -2000827314;
        hh.ebbg[457] = 48625275;
        hh.ebbg[458] = 458308580;
        hh.ebbg[459] = 684276201;
        hh.ebbg[460] = -2057718732;
        hh.ebbg[461] = -1103179526;
        hh.ebbg[462] = -1403623751;
        hh.ebbg[463] = -1543169874;
        hh.ebbg[464] = -1131178724;
        hh.ebbg[465] = -78599465;
        hh.ebbg[466] = -1319207830;
        hh.ebbg[467] = 1341308535;
        hh.ebbg[468] = -940777183;
        hh.ebbg[469] = 232153293;
        hh.ebbg[470] = 1310319762;
        hh.ebbg[471] = -135038716;
        hh.ebbg[472] = 1465619312;
        hh.ebbg[473] = 1608244884;
        hh.ebbg[474] = -2011703670;
        hh.ebbg[475] = 496347870;
        hh.ebbg[476] = 1020160503;
        hh.ebbg[477] = 1859283079;
        hh.ebbg[478] = 1573063746;
        hh.ebbg[479] = 2118608795;
        hh.ebbg[480] = -665942436;
        hh.ebbg[481] = 91052934;
        hh.ebbg[482] = 1542868564;
        hh.ebbg[483] = -1277161376;
        hh.ebbg[484] = -689591760;
        hh.ebbg[485] = -172980451;
        hh.ebbg[486] = 205860182;
        hh.ebbg[487] = 831042726;
        hh.ebbg[488] = -718306716;
        hh.ebbg[489] = 25658853;
        hh.ebbg[490] = 721845359;
        hh.ebbg[491] = 147012417;
        hh.ebbg[492] = -101730821;
        hh.ebbg[493] = 600815658;
        hh.ebbg[494] = -17604308;
        hh.ebbg[495] = -1882417250;
        hh.ebbg[496] = 476949504;
        hh.ebbg[497] = 1848952014;
        hh.ebbg[498] = 1980173460;
        hh.ebbg[499] = -1550414004;
    }

    private static /* synthetic */ void efny() {
        hh.ebbg[900] = -1845316706;
        hh.ebbg[901] = -1228680708;
        hh.ebbg[902] = 1763029391;
        hh.ebbg[903] = -164775259;
        hh.ebbg[904] = -1381087800;
        hh.ebbg[905] = -1031063389;
        hh.ebbg[906] = 1559921602;
        hh.ebbg[907] = 1691641952;
        hh.ebbg[908] = 82835170;
        hh.ebbg[909] = -1054412094;
        hh.ebbg[910] = -1100428257;
        hh.ebbg[911] = 200887283;
        hh.ebbg[912] = -1030445327;
        hh.ebbg[913] = -1011471974;
        hh.ebbg[914] = 935250524;
        hh.ebbg[915] = -1344267948;
        hh.ebbg[916] = 295738062;
        hh.ebbg[917] = 1376967516;
        hh.ebbg[918] = 414961604;
        hh.ebbg[919] = 630249625;
        hh.ebbg[920] = -1438233112;
        hh.ebbg[921] = 1354110092;
        hh.ebbg[922] = -419496474;
        hh.ebbg[923] = 1495100271;
        hh.ebbg[924] = 1364150188;
        hh.ebbg[925] = 265209402;
        hh.ebbg[926] = -1775733338;
        hh.ebbg[927] = -1016843697;
        hh.ebbg[928] = -1023421385;
        hh.ebbg[929] = 770460968;
        hh.ebbg[930] = 1418409886;
        hh.ebbg[931] = -1030387304;
        hh.ebbg[932] = -128708778;
        hh.ebbg[933] = -678615018;
        hh.ebbg[934] = -919699042;
    }

    private static /* synthetic */ void efod() {
        hh.ebet[400] = -6725739221379743920L;
        hh.ebet[401] = 7750624744967353068L;
        hh.ebet[402] = 620898583464320395L;
        hh.ebet[403] = -3071622644925919158L;
        hh.ebet[404] = -7376622105801929397L;
        hh.ebet[405] = 9214034660037366518L;
        hh.ebet[406] = -2766666143384536024L;
        hh.ebet[407] = -3135030693573169427L;
        hh.ebet[408] = -1374995785264480329L;
        hh.ebet[409] = 3267601932614485883L;
        hh.ebet[410] = 5775721397662681762L;
        hh.ebet[411] = 3138042748201073856L;
        hh.ebet[412] = -1837904304280964303L;
        hh.ebet[413] = 2150312105035665746L;
        hh.ebet[414] = 3764161864705350682L;
        hh.ebet[415] = 360086806848859176L;
        hh.ebet[416] = -6548030049637133344L;
        hh.ebet[417] = -4196419908601750101L;
        hh.ebet[418] = 1328160466260750754L;
        hh.ebet[419] = 1088089084204839699L;
        hh.ebet[420] = 1858989036662604307L;
        hh.ebet[421] = 5468317957184849L;
        hh.ebet[422] = 2722575156688568929L;
        hh.ebet[423] = -7348330798290228388L;
        hh.ebet[424] = 4334770194209045991L;
        hh.ebet[425] = -5081873549289825406L;
        hh.ebet[426] = -1866256670710690106L;
        hh.ebet[427] = -1655214816186361236L;
        hh.ebet[428] = -1075566412360829684L;
        hh.ebet[429] = 6922131025165335472L;
        hh.ebet[430] = -7319126824222093483L;
        hh.ebet[431] = 8333275126626934154L;
        hh.ebet[432] = -5726656250618965219L;
        hh.ebet[433] = -534003465023378330L;
        hh.ebet[434] = 8609160924593007768L;
        hh.ebet[435] = -4741506252429599408L;
        hh.ebet[436] = 8045289452265461384L;
        hh.ebet[437] = -5400324425849104304L;
        hh.ebet[438] = 79097146908731651L;
        hh.ebet[439] = 1918084832859512260L;
        hh.ebet[440] = -6498719574875238267L;
        hh.ebet[441] = 4045979533201581503L;
        hh.ebet[442] = -7434345401509225493L;
        hh.ebet[443] = 1870333346037068365L;
        hh.ebet[444] = -2667900136554400055L;
        hh.ebet[445] = 7080503955924421426L;
        hh.ebet[446] = -7158960883854960025L;
        hh.ebet[447] = 7653775405897477590L;
        hh.ebet[448] = -3434176302790039370L;
        hh.ebet[449] = -3167830400433696826L;
        hh.ebet[450] = 1569149625601133462L;
        hh.ebet[451] = 5504895816190158922L;
        hh.ebet[452] = 6393463273910193206L;
        hh.ebet[453] = 5403229922942447471L;
        hh.ebet[454] = -8194186419878233181L;
        hh.ebet[455] = 1788714112223684894L;
        hh.ebet[456] = -3213686387293615629L;
        hh.ebet[457] = -8187006144048199615L;
        hh.ebet[458] = -1051254940176727795L;
        hh.ebet[459] = -8849414915567463525L;
        hh.ebet[460] = 1579025332759940803L;
        hh.ebet[461] = -6758066923885945617L;
        hh.ebet[462] = 2126367170138540435L;
        hh.ebet[463] = -4401356439278862982L;
        hh.ebet[464] = -2018750482722020340L;
        hh.ebet[465] = 7891173511642223952L;
        hh.ebet[466] = -1798417779394302381L;
        hh.ebet[467] = 3458914026087382616L;
        hh.ebet[468] = -7881346006407418512L;
        hh.ebet[469] = 7623878437773185722L;
        hh.ebet[470] = 5079652169069839091L;
        hh.ebet[471] = -3547870529316101484L;
        hh.ebet[472] = -6858921747159506001L;
        hh.ebet[473] = -2470506257602820733L;
        hh.ebet[474] = -972281583769021038L;
        hh.ebet[475] = 4704974174718079997L;
        hh.ebet[476] = 2290072860966306732L;
        hh.ebet[477] = -6299411307932044111L;
        hh.ebet[478] = -8335030547183250985L;
        hh.ebet[479] = 7770722616417625958L;
        hh.ebet[480] = -3262908852063762188L;
        hh.ebet[481] = 7592655869985295990L;
        hh.ebet[482] = -2792892688366209903L;
        hh.ebet[483] = 2176840885629384869L;
        hh.ebet[484] = -8683152581795445712L;
        hh.ebet[485] = 3441113498734652410L;
        hh.ebet[486] = -4515364672406086207L;
        hh.ebet[487] = 3304404806751073075L;
        hh.ebet[488] = 8686697493435737573L;
        hh.ebet[489] = -8880661734276182589L;
        hh.ebet[490] = 8996679009453070146L;
        hh.ebet[491] = 4766198879345317683L;
        hh.ebet[492] = 7454228462284576047L;
        hh.ebet[493] = -2331681504504413038L;
        hh.ebet[494] = -2207135172321704653L;
        hh.ebet[495] = -8207315195924947031L;
        hh.ebet[496] = -732534408179429407L;
        hh.ebet[497] = -1739521216830564528L;
        hh.ebet[498] = -1978128648459052080L;
        hh.ebet[499] = 8458585724093850082L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private nu findItemInventory(String var1_1) {
        block104: {
            block105: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("edtp", ebes(int ), (int)513)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == hh.ebbh("edtq", ebbe(int ), (int)759)) break;
                    v0 /* !! */  = (long)hh.ebbh("edtr", ebbe(int ), (int)760);
                }
                var6_2 = hh.c;
                v1 /* !! */  = hh.kf;
                if (true) ** GOTO lbl11
                block66: while (true) {
                    v1 /* !! */  = (long)(hh.ebbh("edtt", ebes(int ), (int)515) - hh.ebbh("edts", ebes(int ), (int)514));
lbl11:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -129623865: {
                            continue block66;
                        }
                        case 672168633: {
                            break block66;
                        }
                    }
                    break;
                }
                var5_3 /* !! */  = hh.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("edtu", ebes(int ), (int)516)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == hh.ebbh("edtv", ebbe(int ), (int)761)) break;
                    v2 /* !! */  = (long)hh.ebbh("edtw", ebbe(int ), (int)762);
                }
                var4_4 = hh.a;
                if (var6_2) {
                    throw null;
lbl25:
                    // 11 sources

                    return null;
                }
                if (var4_4 || var4_4) ** GOTO lbl25
                v3 /* !! */  = hh.kf;
                if (true) ** GOTO lbl32
                block69: while (true) {
                    v3 /* !! */  = (long)(v4 - hh.ebbh("edtx", ebes(int ), (int)517));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1605080593: {
                            v4 = hh.ebbh("edty", ebes(int ), (int)518);
                            continue block69;
                        }
                        case 672168633: {
                            break block69;
                        }
                        case 1964019757: {
                            v4 = hh.ebbh("edtz", ebes(int ), (int)519);
                            continue block69;
                        }
                    }
                    break;
                }
                v5 /* !! */  = hh.kf;
                if (true) ** GOTO lbl45
                block70: while (true) {
                    v5 /* !! */  = (long)(hh.ebbh("edub", ebes(int ), (int)521) - hh.ebbh("edua", ebes(int ), (int)520));
lbl45:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1263782504: {
                            continue block70;
                        }
                        case 672168633: {
                            break block70;
                        }
                    }
                    break;
                }
                if (hh.mc.field_1724 != null) break block105;
                if (var4_4 || var4_4) ** GOTO lbl25
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("educ", ebes(int ), (int)522)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == hh.ebbh("edud", ebbe(int ), (int)763)) break;
                    v6 /* !! */  = (long)hh.ebbh("edue", ebbe(int ), (int)764);
                }
                return nu.notFound();
            }
            if (var4_4 || var4_4) ** GOTO lbl25
            var2_5 = hh.ebbh("eduf", ebbe(int ), (int)765);
            if (var4_4) ** GOTO lbl25
            do {
                block106: {
                    if (var4_4 || var4_4) ** GOTO lbl25
                    if (var2_5 >= hh.ebbh("edug", ebbe(int ), (int)766)) break block104;
                    if (var4_4 || var4_4) ** GOTO lbl25
                    v7 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl70
                    block73: while (true) {
                        v7 /* !! */  = (long)(v8 - hh.ebbh("eduh", ebes(int ), (int)523));
lbl70:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -1856884377: {
                                v8 = hh.ebbh("edui", ebes(int ), (int)524);
                                continue block73;
                            }
                            case 325520692: {
                                v8 = hh.ebbh("eduj", ebes(int ), (int)525);
                                continue block73;
                            }
                            case 672168633: {
                                break block73;
                            }
                            case 1942261921: {
                                v8 = hh.ebbh("eduk", ebes(int ), (int)526);
                                continue block73;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_3 = hh.kf - hh.ebbh("edul", ebes(int ), (int)527)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v9 /* !! */  == hh.ebbh("edum", ebbe(int ), (int)767)) break;
                        v9 /* !! */  = (long)hh.ebbh("edun", ebbe(int ), (int)768);
                    }
                    v10 = hh.mc.field_1724;
                    while (true) {
                        if ((v11 /* !! */  = (cfr_temp_4 = hh.kf - hh.ebbh("eduo", ebes(int ), (int)528)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v11 /* !! */  == hh.ebbh("edup", ebbe(int ), (int)769)) break;
                        v11 /* !! */  = (long)hh.ebbh("eduq", ebbe(int ), (int)770);
                    }
                    v12 = v10.method_31548();
                    v13 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl98
                    block76: while (true) {
                        v13 /* !! */  = (long)(v14 - hh.ebbh("edur", ebes(int ), (int)529));
lbl98:
                        // 2 sources

                        switch ((int)v13 /* !! */ ) {
                            case -176480062: {
                                v14 = hh.ebbh("edus", ebes(int ), (int)530);
                                continue block76;
                            }
                            case 672168633: {
                                break block76;
                            }
                            case 1150212175: {
                                v14 = hh.ebbh("edut", ebes(int ), (int)531);
                                continue block76;
                            }
                        }
                        break;
                    }
                    var3_6 = v12.method_5438((int)var2_5);
                    if (var4_4 || var4_4) ** GOTO lbl25
                    v15 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl113
                    block77: while (true) {
                        v15 /* !! */  = (long)(v16 - hh.ebbh("eduu", ebes(int ), (int)532));
lbl113:
                        // 2 sources

                        switch ((int)v15 /* !! */ ) {
                            case -1010058036: {
                                v16 = hh.ebbh("eduv", ebes(int ), (int)533);
                                continue block77;
                            }
                            case 672168633: {
                                break block77;
                            }
                            case 1007264951: {
                                v16 = hh.ebbh("eduw", ebes(int ), (int)534);
                                continue block77;
                            }
                        }
                        break;
                    }
                    if (!this.matches(var3_6, var1_1)) break block106;
                    if (var4_4 || var4_4) ** GOTO lbl25
                    v17 /* !! */  = hh.kf;
                    if (true) ** GOTO lbl128
                    block78: while (true) {
                        v17 /* !! */  = (long)(hh.ebbh("eduy", ebes(int ), (int)536) - hh.ebbh("edux", ebes(int ), (int)535));
lbl128:
                        // 2 sources

                        switch ((int)v17 /* !! */ ) {
                            case 672168633: {
                                break block78;
                            }
                            case 786191302: {
                                continue block78;
                            }
                        }
                        break;
                    }
                    return nu.of((int)var2_5, var3_6);
                }
                if (var4_4 || var4_4) ** GOTO lbl25
                ++var2_5;
                if (var4_4) ** GOTO lbl25
            } while (!var6_2);
            throw null;
        }
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                v18 /* !! */  = hh.kf;
                if (true) ** GOTO lbl150
                block79: while (true) {
                    v18 /* !! */  = (long)(v19 - hh.ebbh("eduz", ebes(int ), (int)537));
lbl150:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case 672168633: {
                            break block79;
                        }
                        case 974056760: {
                            v19 = hh.ebbh("edva", ebes(int ), (int)538);
                            continue block79;
                        }
                        case 1045731135: {
                            v19 = hh.ebbh("edvb", ebes(int ), (int)539);
                            continue block79;
                        }
                        case 1397063649: {
                            v19 = hh.ebbh("edvc", ebes(int ), (int)540);
                            continue block79;
                        }
                    }
                    break;
                }
                return nu.notFound();
            }
lbl163:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)hh.ebbh("edvd", ebbe(int ), (int)771);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl188
            }
            case 1: {
                var5_3 /* !! */  = (int)hh.ebbh("edve", ebbe(int ), (int)772);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl173:
            // 2 sources

            case 2: {
                var5_3 /* !! */  = (int)hh.ebbh("edvf", ebbe(int ), (int)773);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 3: {
                var5_3 /* !! */  = (int)hh.ebbh("edvg", ebbe(int ), (int)774);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
            case 4: {
                var5_3 /* !! */  = (int)hh.ebbh("edvh", ebbe(int ), (int)775);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl188:
            // 2 sources

            case 5: {
                var5_3 /* !! */  = (int)hh.ebbh("edvi", ebbe(int ), (int)776);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl193:
            // 3 sources

            case 6: {
                var5_3 /* !! */  = (int)hh.ebbh("edvj", ebbe(int ), (int)777);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl218
            }
            case 7: {
                var5_3 /* !! */  = (int)hh.ebbh("edvk", ebbe(int ), (int)778);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
            case 8: {
                var5_3 /* !! */  = (int)hh.ebbh("edvl", ebbe(int ), (int)779);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl245
            }
lbl208:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)hh.ebbh("edvm", ebbe(int ), (int)780);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl258
            }
            case 10: {
                var5_3 /* !! */  = (int)hh.ebbh("edvn", ebbe(int ), (int)781);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl218:
            // 3 sources

            case 11: {
                var5_3 /* !! */  = (int)hh.ebbh("edvo", ebbe(int ), (int)782);
                if (!var6_2) break;
                throw null;
            }
lbl222:
            // 2 sources

            case 12: {
                do {
                    var5_3 /* !! */  = (int)hh.ebbh("edvp", ebbe(int ), (int)783);
                } while (!var6_2);
                throw null;
            }
lbl227:
            // 3 sources

            case 13: {
                var5_3 /* !! */  = (int)hh.ebbh("edvq", ebbe(int ), (int)784);
                if (!var6_2) ** GOTO lbl193
                throw null;
            }
lbl231:
            // 2 sources

            case 14: {
                var5_3 /* !! */  = (int)hh.ebbh("edvr", ebbe(int ), (int)785);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl236:
            // 2 sources

            case 15: {
                var5_3 /* !! */  = (int)hh.ebbh("edvs", ebbe(int ), (int)786);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl249
            }
lbl241:
            // 2 sources

            case 16: {
                var5_3 /* !! */  = (int)hh.ebbh("edvt", ebbe(int ), (int)787);
                if (!var6_2) ** GOTO lbl227
                throw null;
            }
lbl245:
            // 2 sources

            case 17: {
                var5_3 /* !! */  = (int)hh.ebbh("edvu", ebbe(int ), (int)788);
                if (!var6_2) ** GOTO lbl163
                throw null;
            }
lbl249:
            // 2 sources

            case 18: {
                var5_3 /* !! */  = (int)hh.ebbh("edvv", ebbe(int ), (int)789);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl267
            }
            case 19: {
                var5_3 /* !! */  = (int)hh.ebbh("edvw", ebbe(int ), (int)790);
                if (!var6_2) ** GOTO lbl208
                throw null;
            }
lbl258:
            // 3 sources

            case 20: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)hh.ebbh("edvx", ebbe(int ), (int)791);
                    if (!var6_2) ** GOTO lbl222
                    throw null;
                }
            }
lbl263:
            // 3 sources

            case 21: {
                var5_3 /* !! */  = (int)hh.ebbh("edvy", ebbe(int ), (int)792);
                if (!var6_2) ** GOTO lbl173
                throw null;
            }
lbl267:
            // 2 sources

            case 22: {
                var5_3 /* !! */  = (int)hh.ebbh("edvz", ebbe(int ), (int)793);
                if (!var6_2) ** GOTO lbl258
                throw null;
            }
            case 23: 
        }
        var5_3 /* !! */  = (int)hh.ebbh("edwa", ebbe(int ), (int)794);
        ** while (!var6_2)
lbl274:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void efnk() {
        hh.ebbf[500] = -789431106;
        hh.ebbf[501] = -1143356293;
        hh.ebbf[502] = 829976953;
        hh.ebbf[503] = 140104628;
        hh.ebbf[504] = -2100116987;
        hh.ebbf[505] = 2076670623;
        hh.ebbf[506] = 171457412;
        hh.ebbf[507] = -1761222560;
        hh.ebbf[508] = 1401452702;
        hh.ebbf[509] = -423006222;
        hh.ebbf[510] = -1380089767;
        hh.ebbf[511] = -587767384;
        hh.ebbf[512] = 1455553826;
        hh.ebbf[513] = -169304199;
        hh.ebbf[514] = -363464421;
        hh.ebbf[515] = -1948836555;
        hh.ebbf[516] = -759719805;
        hh.ebbf[517] = 1829969342;
        hh.ebbf[518] = 1820208476;
        hh.ebbf[519] = 1955766270;
        hh.ebbf[520] = 1371286607;
        hh.ebbf[521] = 1006782317;
        hh.ebbf[522] = 1433321733;
        hh.ebbf[523] = -725216428;
        hh.ebbf[524] = -1039286596;
        hh.ebbf[525] = -1592852246;
        hh.ebbf[526] = 275746647;
        hh.ebbf[527] = 2084343301;
        hh.ebbf[528] = 107103970;
        hh.ebbf[529] = -1563805068;
        hh.ebbf[530] = -1048578488;
        hh.ebbf[531] = 540099245;
        hh.ebbf[532] = -182519101;
        hh.ebbf[533] = 865359444;
        hh.ebbf[534] = -3729217;
        hh.ebbf[535] = 1410924732;
        hh.ebbf[536] = -1321548677;
        hh.ebbf[537] = 1027730224;
        hh.ebbf[538] = 327387132;
        hh.ebbf[539] = -684242604;
        hh.ebbf[540] = -976548062;
        hh.ebbf[541] = 1205871694;
        hh.ebbf[542] = 1641747822;
        hh.ebbf[543] = 246422376;
        hh.ebbf[544] = 1135187183;
        hh.ebbf[545] = 1218821034;
        hh.ebbf[546] = -161584915;
        hh.ebbf[547] = 193284873;
        hh.ebbf[548] = -863718216;
        hh.ebbf[549] = -831193501;
        hh.ebbf[550] = 2016279350;
        hh.ebbf[551] = -145563613;
        hh.ebbf[552] = 443210149;
        hh.ebbf[553] = 2010969466;
        hh.ebbf[554] = 2121002450;
        hh.ebbf[555] = -237971591;
        hh.ebbf[556] = 52193313;
        hh.ebbf[557] = -453261141;
        hh.ebbf[558] = 417478217;
        hh.ebbf[559] = 534670961;
        hh.ebbf[560] = -445309707;
        hh.ebbf[561] = -1248703445;
        hh.ebbf[562] = -1398400290;
        hh.ebbf[563] = 1107152194;
        hh.ebbf[564] = -31170267;
        hh.ebbf[565] = -528929058;
        hh.ebbf[566] = -102202968;
        hh.ebbf[567] = 925875356;
        hh.ebbf[568] = -345848058;
        hh.ebbf[569] = -1103371473;
        hh.ebbf[570] = 773103157;
        hh.ebbf[571] = 1669527759;
        hh.ebbf[572] = 1048429132;
        hh.ebbf[573] = 148396152;
        hh.ebbf[574] = 224846217;
        hh.ebbf[575] = 20416947;
        hh.ebbf[576] = 2088755132;
        hh.ebbf[577] = -885213304;
        hh.ebbf[578] = -1224901731;
        hh.ebbf[579] = 897118326;
        hh.ebbf[580] = 1712898610;
        hh.ebbf[581] = -1909800713;
        hh.ebbf[582] = -189554020;
        hh.ebbf[583] = 830012971;
        hh.ebbf[584] = -927975021;
        hh.ebbf[585] = 423214190;
        hh.ebbf[586] = 1371467172;
        hh.ebbf[587] = 1967623361;
        hh.ebbf[588] = 787408011;
        hh.ebbf[589] = -1022297237;
        hh.ebbf[590] = 1516576965;
        hh.ebbf[591] = -639099762;
        hh.ebbf[592] = -1873152301;
        hh.ebbf[593] = -1065342810;
        hh.ebbf[594] = 2061143566;
        hh.ebbf[595] = -1865218104;
        hh.ebbf[596] = 895254166;
        hh.ebbf[597] = -1438731375;
        hh.ebbf[598] = -109042829;
        hh.ebbf[599] = -1501459404;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean hasRingItem(int var1_1) {
        block93: {
            block92: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("ecle", ebes(int ), (int)193)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == hh.ebbh("eclf", ebbe(int ), (int)268)) break;
                    v0 /* !! */  = (long)hh.ebbh("eclg", ebbe(int ), (int)269);
                }
                var4_2 = hh.c;
                v1 /* !! */  = hh.kf;
                if (true) ** GOTO lbl11
                block57: while (true) {
                    v1 /* !! */  = (long)(hh.ebbh("ecli", ebes(int ), (int)195) - hh.ebbh("eclh", ebes(int ), (int)194));
lbl11:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case 672168633: {
                            break block57;
                        }
                        case 1618199738: {
                            continue block57;
                        }
                    }
                    break;
                }
                var3_3 /* !! */  = hh.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("eclj", ebes(int ), (int)196)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == hh.ebbh("eclk", ebbe(int ), (int)270)) break;
                    v2 /* !! */  = (long)hh.ebbh("ecll", ebbe(int ), (int)271);
                }
                var2_4 = hh.a;
                if (var4_2) {
                    throw null;
lbl25:
                    // 10 sources

                    return (boolean)hh.ebbh("eclm", ebbe(int ), (int)272);
                }
                if (var2_4 || var2_4) ** GOTO lbl25
                v3 /* !! */  = hh.kf;
                if (true) ** GOTO lbl32
                block60: while (true) {
                    v3 /* !! */  = (long)(hh.ebbh("eclo", ebes(int ), (int)198) - hh.ebbh("ecln", ebes(int ), (int)197));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 672168633: {
                            break block60;
                        }
                        case 1657133333: {
                            continue block60;
                        }
                    }
                    break;
                }
                if (!this.isRingSlot(var1_1)) break block92;
                if (var2_4) ** GOTO lbl25
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("eclp", ebes(int ), (int)199)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == hh.ebbh("eclq", ebbe(int ), (int)273)) break;
                    v4 /* !! */  = (long)hh.ebbh("eclr", ebbe(int ), (int)274);
                }
                v5 /* !! */  = hh.kf;
                if (true) ** GOTO lbl48
                block62: while (true) {
                    v5 /* !! */  = (long)(v6 - hh.ebbh("ecls", ebes(int ), (int)200));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1129769875: {
                            v6 = hh.ebbh("eclu", ebes(int ), (int)201);
                            continue block62;
                        }
                        case -97558526: {
                            v6 = hh.ebbh("eclv", ebes(int ), (int)202);
                            continue block62;
                        }
                        case 672168633: {
                            break block62;
                        }
                    }
                    break;
                }
                if (hh.mc.field_1724 == null) break block92;
                if (var2_4) ** GOTO lbl25
                v7 /* !! */  = hh.kf;
                if (true) ** GOTO lbl63
                block63: while (true) {
                    v7 /* !! */  = (long)(v8 - hh.ebbh("eclw", ebes(int ), (int)203));
lbl63:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1236974905: {
                            v8 = hh.ebbh("eclx", ebes(int ), (int)204);
                            continue block63;
                        }
                        case 672168633: {
                            break block63;
                        }
                        case 2015766195: {
                            v8 = hh.ebbh("ecly", ebes(int ), (int)205);
                            continue block63;
                        }
                        case 2141187107: {
                            v8 = hh.ebbh("eclz", ebes(int ), (int)206);
                            continue block63;
                        }
                    }
                    break;
                }
                v9 = this.ringItems[var1_1];
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = hh.kf - hh.ebbh("ecma", ebes(int ), (int)207)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == hh.ebbh("ecmb", ebbe(int ), (int)275)) break;
                    v10 /* !! */  = (long)hh.ebbh("ecmc", ebbe(int ), (int)276);
                }
                if (!v9.method_7960()) break block93;
                if (var2_4) ** GOTO lbl25
            }
            if (var2_4 || var2_4) ** GOTO lbl25
            return (boolean)hh.ebbh("ecmd", ebbe(int ), (int)277);
        }
        if (var2_4 || var2_4) ** GOTO lbl25
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = hh.kf - hh.ebbh("ecme", ebes(int ), (int)208)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == hh.ebbh("ecmf", ebbe(int ), (int)278)) break;
                    v11 /* !! */  = (long)hh.ebbh("ecmg", ebbe(int ), (int)279);
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = hh.kf - hh.ebbh("ecmh", ebes(int ), (int)209)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == hh.ebbh("ecmi", ebbe(int ), (int)280)) break;
                    v12 /* !! */  = (long)hh.ebbh("ecmj", ebbe(int ), (int)281);
                }
                v13 = hh.mc.field_1724;
                v14 /* !! */  = hh.kf;
                if (true) ** GOTO lbl106
                block67: while (true) {
                    v14 /* !! */  = (long)(hh.ebbh("ecml", ebes(int ), (int)211) - hh.ebbh("ecmk", ebes(int ), (int)210));
lbl106:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -697014163: {
                            continue block67;
                        }
                        case 672168633: {
                            break block67;
                        }
                    }
                    break;
                }
                v15 = v13.method_6079();
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_6 = hh.kf - hh.ebbh("ecmm", ebes(int ), (int)212)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == hh.ebbh("ecmn", ebbe(int ), (int)282)) break;
                    v16 /* !! */  = (long)hh.ebbh("ecmo", ebbe(int ), (int)283);
                }
                v17 = this.ringItems[var1_1];
                v18 /* !! */  = hh.kf;
                if (true) ** GOTO lbl122
                block69: while (true) {
                    v18 /* !! */  = (long)(hh.ebbh("ecmq", ebes(int ), (int)214) - hh.ebbh("ecmp", ebes(int ), (int)213));
lbl122:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1038998326: {
                            continue block69;
                        }
                        case 672168633: {
                            break block69;
                        }
                    }
                    break;
                }
                if (this.sameRingItem(v15, v17)) ** GOTO lbl154
                if (var2_4) ** GOTO lbl25
                v19 /* !! */  = hh.kf;
                if (true) ** GOTO lbl133
                block70: while (true) {
                    v19 /* !! */  = (long)(hh.ebbh("ecms", ebes(int ), (int)216) - hh.ebbh("ecmr", ebes(int ), (int)215));
lbl133:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case 672168633: {
                            break block70;
                        }
                        case 951131003: {
                            continue block70;
                        }
                    }
                    break;
                }
                v20 = this.ringItems[var1_1];
                v21 /* !! */  = hh.kf;
                if (true) ** GOTO lbl143
                block71: while (true) {
                    v21 /* !! */  = (long)(v22 - hh.ebbh("ecmt", ebes(int ), (int)217));
lbl143:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -645060606: {
                            v22 = hh.ebbh("ecmu", ebes(int ), (int)218);
                            continue block71;
                        }
                        case 672168633: {
                            break block71;
                        }
                        case 1438220819: {
                            v22 = hh.ebbh("ecmv", ebes(int ), (int)219);
                            continue block71;
                        }
                    }
                    break;
                }
                if (this.findExactItem(v20) < 0) ** GOTO lbl159
                if (var2_4) ** GOTO lbl25
lbl154:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl25
                v23 = hh.ebbh("ecmw", ebbe(int ), (int)284);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl162
lbl159:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v23 = hh.ebbh("ecmx", ebbe(int ), (int)285);
lbl162:
                // 2 sources

                return (boolean)v23;
            }
lbl163:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)hh.ebbh("ecmy", ebbe(int ), (int)286);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl206
            }
lbl168:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)hh.ebbh("ecmz", ebbe(int ), (int)287);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl206
            }
lbl173:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)hh.ebbh("ecna", ebbe(int ), (int)288);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl188
            }
            case 3: {
                var3_3 /* !! */  = (int)hh.ebbh("ecnb", ebbe(int ), (int)289);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl230
            }
            case 4: {
                var3_3 /* !! */  = (int)hh.ebbh("ecnc", ebbe(int ), (int)290);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl188:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)hh.ebbh("ecnd", ebbe(int ), (int)291);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl193:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)hh.ebbh("ecne", ebbe(int ), (int)292);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 7: {
                var3_3 /* !! */  = (int)hh.ebbh("ecnf", ebbe(int ), (int)293);
                if (!var4_2) ** GOTO lbl168
                throw null;
            }
lbl202:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)hh.ebbh("ecng", ebbe(int ), (int)294);
                if (!var4_2) ** GOTO lbl193
                throw null;
            }
lbl206:
            // 3 sources

            case 9: {
                var3_3 /* !! */  = (int)hh.ebbh("ecnh", ebbe(int ), (int)295);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl211:
            // 3 sources

            case 10: {
                var3_3 /* !! */  = (int)hh.ebbh("ecni", ebbe(int ), (int)296);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl234
            }
            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hh.ebbh("ecnj", ebbe(int ), (int)297);
                    if (!var4_2) ** GOTO lbl211
                    throw null;
                }
            }
            case 12: {
                var3_3 /* !! */  = (int)hh.ebbh("ecnk", ebbe(int ), (int)298);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl226:
            // 2 sources

            case 13: {
                var3_3 /* !! */  = (int)hh.ebbh("ecnl", ebbe(int ), (int)299);
                if (var4_2) {
                    throw null;
                }
            }
lbl230:
            // 5 sources

            case 14: {
                var3_3 /* !! */  = (int)hh.ebbh("ecnm", ebbe(int ), (int)300);
                if (!var4_2) ** GOTO lbl163
                throw null;
            }
lbl234:
            // 2 sources

            case 15: {
                var3_3 /* !! */  = (int)hh.ebbh("ecnn", ebbe(int ), (int)301);
                if (var4_2) {
                    throw null;
                }
            }
lbl238:
            // 4 sources

            case 16: {
                var3_3 /* !! */  = (int)hh.ebbh("ecno", ebbe(int ), (int)302);
                if (!var4_2) ** GOTO lbl173
                throw null;
            }
            case 17: 
        }
        var3_3 /* !! */  = (int)hh.ebbh("ecnp", ebbe(int ), (int)303);
        ** while (!var4_2)
lbl245:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int ebbe(int n2) {
        return ebbf[n2] ^ ebbg[n2];
    }

    private static /* synthetic */ void efni() {
        hh.ebbf[300] = 665387966;
        hh.ebbf[301] = -1804378563;
        hh.ebbf[302] = -894802705;
        hh.ebbf[303] = 602478237;
        hh.ebbf[304] = -920444693;
        hh.ebbf[305] = 1906424152;
        hh.ebbf[306] = 412765912;
        hh.ebbf[307] = -83276712;
        hh.ebbf[308] = 1239695767;
        hh.ebbf[309] = -583409777;
        hh.ebbf[310] = 2022767250;
        hh.ebbf[311] = -295763137;
        hh.ebbf[312] = -1882438188;
        hh.ebbf[313] = -1221375747;
        hh.ebbf[314] = -1957011074;
        hh.ebbf[315] = 367963438;
        hh.ebbf[316] = 316704469;
        hh.ebbf[317] = -969009891;
        hh.ebbf[318] = 788055607;
        hh.ebbf[319] = -1241191015;
        hh.ebbf[320] = 1129928042;
        hh.ebbf[321] = 1416362687;
        hh.ebbf[322] = 890711745;
        hh.ebbf[323] = -250648327;
        hh.ebbf[324] = 1159050218;
        hh.ebbf[325] = -854465549;
        hh.ebbf[326] = -646360042;
        hh.ebbf[327] = 231780339;
        hh.ebbf[328] = -1250363106;
        hh.ebbf[329] = 320823992;
        hh.ebbf[330] = 145820863;
        hh.ebbf[331] = 297286903;
        hh.ebbf[332] = 477229392;
        hh.ebbf[333] = -907241644;
        hh.ebbf[334] = -1936518029;
        hh.ebbf[335] = 1891589952;
        hh.ebbf[336] = -813031822;
        hh.ebbf[337] = 1702942097;
        hh.ebbf[338] = -982089240;
        hh.ebbf[339] = 1180150705;
        hh.ebbf[340] = 856203384;
        hh.ebbf[341] = 2051529332;
        hh.ebbf[342] = 908142650;
        hh.ebbf[343] = -61532221;
        hh.ebbf[344] = 1563565169;
        hh.ebbf[345] = -710519350;
        hh.ebbf[346] = 1736201934;
        hh.ebbf[347] = -1497619660;
        hh.ebbf[348] = 1181758425;
        hh.ebbf[349] = 145149061;
        hh.ebbf[350] = 451980796;
        hh.ebbf[351] = 922661730;
        hh.ebbf[352] = -88055503;
        hh.ebbf[353] = 2047088263;
        hh.ebbf[354] = -989923128;
        hh.ebbf[355] = 1958249849;
        hh.ebbf[356] = -2039263586;
        hh.ebbf[357] = -848888444;
        hh.ebbf[358] = 2023179375;
        hh.ebbf[359] = -5875172;
        hh.ebbf[360] = -951912410;
        hh.ebbf[361] = 922795941;
        hh.ebbf[362] = -1537789457;
        hh.ebbf[363] = 57975332;
        hh.ebbf[364] = -154493050;
        hh.ebbf[365] = -2136789751;
        hh.ebbf[366] = -2134658148;
        hh.ebbf[367] = -1150473591;
        hh.ebbf[368] = 839334067;
        hh.ebbf[369] = -589273820;
        hh.ebbf[370] = 1722928728;
        hh.ebbf[371] = 1359485541;
        hh.ebbf[372] = 875745049;
        hh.ebbf[373] = 1968002987;
        hh.ebbf[374] = -280289115;
        hh.ebbf[375] = 783506787;
        hh.ebbf[376] = -1072748036;
        hh.ebbf[377] = 2081014899;
        hh.ebbf[378] = -44058487;
        hh.ebbf[379] = -30371504;
        hh.ebbf[380] = -672737495;
        hh.ebbf[381] = 1188331606;
        hh.ebbf[382] = -1871318937;
        hh.ebbf[383] = -1726202632;
        hh.ebbf[384] = -584246545;
        hh.ebbf[385] = -560191988;
        hh.ebbf[386] = -1667595669;
        hh.ebbf[387] = 432160319;
        hh.ebbf[388] = 681008791;
        hh.ebbf[389] = -1459681747;
        hh.ebbf[390] = 628063331;
        hh.ebbf[391] = 1041390689;
        hh.ebbf[392] = 624695892;
        hh.ebbf[393] = 1590639663;
        hh.ebbf[394] = -50816068;
        hh.ebbf[395] = 2044997438;
        hh.ebbf[396] = 1078249219;
        hh.ebbf[397] = 1017660975;
        hh.ebbf[398] = 1098462500;
        hh.ebbf[399] = 1247224490;
    }

    private static /* synthetic */ void efnz() {
        hh.ebet[0] = -2299175730812611906L;
        hh.ebet[1] = 504459649228549810L;
        hh.ebet[2] = -2106784497019052555L;
        hh.ebet[3] = 3577380514005226242L;
        hh.ebet[4] = 4360104266342577383L;
        hh.ebet[5] = 2118083922049423715L;
        hh.ebet[6] = 4824906783479358402L;
        hh.ebet[7] = 5700235030653100648L;
        hh.ebet[8] = 382131441779123522L;
        hh.ebet[9] = -8608066798333869883L;
        hh.ebet[10] = 6636146477239693458L;
        hh.ebet[11] = 4201312367957778214L;
        hh.ebet[12] = 8581096980772850570L;
        hh.ebet[13] = -4802480862404314905L;
        hh.ebet[14] = -6126742921329708659L;
        hh.ebet[15] = 8261354540290481942L;
        hh.ebet[16] = -7769511762985789373L;
        hh.ebet[17] = 4004645607705424474L;
        hh.ebet[18] = 558681627447754112L;
        hh.ebet[19] = 4505998308531471304L;
        hh.ebet[20] = 7768156326230858920L;
        hh.ebet[21] = 2384379189242503055L;
        hh.ebet[22] = -9146921570690031920L;
        hh.ebet[23] = 1913204401825942840L;
        hh.ebet[24] = -1235297959193587106L;
        hh.ebet[25] = -6369080884445159110L;
        hh.ebet[26] = -4566844438069899544L;
        hh.ebet[27] = -8789393384457303230L;
        hh.ebet[28] = -5192848828495978778L;
        hh.ebet[29] = 4199050680084573965L;
        hh.ebet[30] = 497122833351832210L;
        hh.ebet[31] = 391163526291847130L;
        hh.ebet[32] = -8206889329662711829L;
        hh.ebet[33] = -4540779514520746384L;
        hh.ebet[34] = 822382464252283107L;
        hh.ebet[35] = 6365186636947900724L;
        hh.ebet[36] = -873408879602908781L;
        hh.ebet[37] = 4209999917292026806L;
        hh.ebet[38] = -355269387699561823L;
        hh.ebet[39] = 4420619402344868524L;
        hh.ebet[40] = -771339939552609321L;
        hh.ebet[41] = 3152638781619279634L;
        hh.ebet[42] = 3359388965282561698L;
        hh.ebet[43] = 7435593539960622685L;
        hh.ebet[44] = 1488325749429397033L;
        hh.ebet[45] = -4287980105191626925L;
        hh.ebet[46] = -8849396932567057565L;
        hh.ebet[47] = 7420605634258589206L;
        hh.ebet[48] = -5069720296188045921L;
        hh.ebet[49] = 5670323773918370581L;
        hh.ebet[50] = -1645393823947378306L;
        hh.ebet[51] = 2854791036328030734L;
        hh.ebet[52] = 1155582166932638502L;
        hh.ebet[53] = -3789274598127471789L;
        hh.ebet[54] = -5773466812855143750L;
        hh.ebet[55] = 2386756075961090483L;
        hh.ebet[56] = 4660572910425065991L;
        hh.ebet[57] = -7049188641118549327L;
        hh.ebet[58] = 3491460290022599155L;
        hh.ebet[59] = -4673132022693535682L;
        hh.ebet[60] = 7776552158376268490L;
        hh.ebet[61] = 5812120404734387484L;
        hh.ebet[62] = 204196848072804311L;
        hh.ebet[63] = -1441604414832980018L;
        hh.ebet[64] = -1002221713528836839L;
        hh.ebet[65] = -3115611714369532212L;
        hh.ebet[66] = -8702122933703862869L;
        hh.ebet[67] = 3283556845450790992L;
        hh.ebet[68] = 3577009234037379627L;
        hh.ebet[69] = -1409182541725504231L;
        hh.ebet[70] = -8226220946340106001L;
        hh.ebet[71] = 8745555422630777776L;
        hh.ebet[72] = 9168037734623853130L;
        hh.ebet[73] = -2826981038604767153L;
        hh.ebet[74] = -3082407519195545782L;
        hh.ebet[75] = -7950616319174752720L;
        hh.ebet[76] = 4205755930299576971L;
        hh.ebet[77] = 7605995359957086129L;
        hh.ebet[78] = -5399082149675926972L;
        hh.ebet[79] = 8563427627660629403L;
        hh.ebet[80] = 7872457405797339968L;
        hh.ebet[81] = 7771139108162841869L;
        hh.ebet[82] = -6112837502584272839L;
        hh.ebet[83] = 8854633842567562613L;
        hh.ebet[84] = 5696367852833178729L;
        hh.ebet[85] = -8453205148611621882L;
        hh.ebet[86] = -8190490469868633379L;
        hh.ebet[87] = -1148573999387335974L;
        hh.ebet[88] = 2505697942541658821L;
        hh.ebet[89] = 4058910360056587360L;
        hh.ebet[90] = -2711829972698119940L;
        hh.ebet[91] = 2061900713587251508L;
        hh.ebet[92] = -6712402241382077755L;
        hh.ebet[93] = 2806077778001492961L;
        hh.ebet[94] = 7015310201262941306L;
        hh.ebet[95] = -721700655188201571L;
        hh.ebet[96] = -525918803369103950L;
        hh.ebet[97] = 8693470126770728625L;
        hh.ebet[98] = 1236427051001945010L;
        hh.ebet[99] = 7315728103290410684L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void clearRingItem(int var1_1) {
        v0 /* !! */  = hh.kf;
        if (true) ** GOTO lbl5
        block27: while (true) {
            v0 /* !! */  = (long)(hh.ebbh("ecgs", ebes(int ), (int)139) - hh.ebbh("ecgq", ebes(int ), (int)138));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -109224361: {
                    continue block27;
                }
                case 672168633: {
                    break block27;
                }
            }
            break;
        }
        var4_2 = hh.c;
        v1 /* !! */  = hh.kf;
        if (true) ** GOTO lbl15
        block28: while (true) {
            v1 /* !! */  = (long)(v2 - hh.ebbh("ecgu", ebes(int ), (int)140));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1982371575: {
                    v2 = hh.ebbh("ecgy", ebes(int ), (int)141);
                    continue block28;
                }
                case 672168633: {
                    break block28;
                }
                case 975457657: {
                    v2 = hh.ebbh("ecgz", ebes(int ), (int)142);
                    continue block28;
                }
                case 1606015641: {
                    v2 = hh.ebbh("echa", ebes(int ), (int)143);
                    continue block28;
                }
            }
            break;
        }
        var3_3 /* !! */  = hh.b;
        v3 /* !! */  = hh.kf;
        if (true) ** GOTO lbl32
        block29: while (true) {
            v3 /* !! */  = (long)(v4 - hh.ebbh("echb", ebes(int ), (int)144));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -826240763: {
                    v4 = hh.ebbh("echc", ebes(int ), (int)145);
                    continue block29;
                }
                case 672168633: {
                    break block29;
                }
                case 1145400223: {
                    v4 = hh.ebbh("echd", ebes(int ), (int)146);
                    continue block29;
                }
                case 1186334608: {
                    v4 = hh.ebbh("echi", ebes(int ), (int)147);
                    continue block29;
                }
            }
            break;
        }
        var2_4 = hh.a;
        if (var4_2) {
            throw null;
lbl47:
            // 4 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl47
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("echj", ebes(int ), (int)148)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == hh.ebbh("echk", ebbe(int ), (int)221)) break;
            v5 /* !! */  = (long)hh.ebbh("echl", ebbe(int ), (int)222);
        }
        if (!this.isRingSlot(var1_1)) ** GOTO lbl-1000
        if (var2_4 || var2_4) ** GOTO lbl47
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("echm", ebes(int ), (int)149)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 /* !! */  == hh.ebbh("echn", ebbe(int ), (int)223)) break;
            v6 /* !! */  = (long)hh.ebbh("echo", ebbe(int ), (int)224);
        }
        while (true) {
            if ((v7 = (cfr_temp_2 = hh.kf - hh.ebbh("echp", ebes(int ), (int)150)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 == hh.ebbh("echq", ebbe(int ), (int)225)) break;
            v7 = 407042880;
        }
        this.ringItems[var1_1] = class_1799.field_8037;
        if (var2_4) ** GOTO lbl47
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 3 sources

            {
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)hh.ebbh("echr", ebbe(int ), (int)226);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl108
            }
            case 1: {
                var3_3 /* !! */  = (int)hh.ebbh("echs", ebbe(int ), (int)227);
                if (var4_2) {
                    throw null;
                }
            }
lbl87:
            // 4 sources

            case 2: {
                var3_3 /* !! */  = (int)hh.ebbh("echt", ebbe(int ), (int)228);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl104
            }
            case 3: {
                var3_3 /* !! */  = (int)hh.ebbh("echu", ebbe(int ), (int)229);
                if (!var4_2) break;
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)hh.ebbh("echv", ebbe(int ), (int)230);
                if (!var4_2) ** GOTO lbl87
                throw null;
            }
lbl100:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)hh.ebbh("echw", ebbe(int ), (int)231);
                if (!var4_2) break;
                throw null;
            }
lbl104:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)hh.ebbh("echx", ebbe(int ), (int)232);
                if (!var4_2) ** GOTO lbl100
                throw null;
            }
lbl108:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)hh.ebbh("echy", ebbe(int ), (int)233);
                if (!var4_2) ** GOTO lbl104
                throw null;
            }
            case 8: 
        }
        do {
            var3_3 /* !! */  = (int)hh.ebbh("echz", ebbe(int ), (int)234);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void efok() {
        hh.ebeu[400] = -5940649614051688049L;
        hh.ebeu[401] = 8432416966987525779L;
        hh.ebeu[402] = -3538155374462013014L;
        hh.ebeu[403] = -3743119525412644681L;
        hh.ebeu[404] = -2144868675042173474L;
        hh.ebeu[405] = -2093578384600002318L;
        hh.ebeu[406] = -2484116807377369878L;
        hh.ebeu[407] = -4657254312175593058L;
        hh.ebeu[408] = -2249960271716639252L;
        hh.ebeu[409] = -547941115312511888L;
        hh.ebeu[410] = -4979039879113515457L;
        hh.ebeu[411] = 3044005076435664745L;
        hh.ebeu[412] = 775653832467866042L;
        hh.ebeu[413] = -858002791384940208L;
        hh.ebeu[414] = -8544568505907449420L;
        hh.ebeu[415] = 2807333174512417783L;
        hh.ebeu[416] = -425909920561616000L;
        hh.ebeu[417] = 227042264761117560L;
        hh.ebeu[418] = -7262192287661576977L;
        hh.ebeu[419] = -8895379097899798988L;
        hh.ebeu[420] = 5064440899727609527L;
        hh.ebeu[421] = 8596985871257977567L;
        hh.ebeu[422] = 5388392099762451181L;
        hh.ebeu[423] = -8690715455936652197L;
        hh.ebeu[424] = 387469356144816106L;
        hh.ebeu[425] = 7812553046281752803L;
        hh.ebeu[426] = -3592066400753722078L;
        hh.ebeu[427] = 5088916966506071877L;
        hh.ebeu[428] = 3565258144322775780L;
        hh.ebeu[429] = 3055906069640937696L;
        hh.ebeu[430] = 9178726903354218870L;
        hh.ebeu[431] = -2023961826273193141L;
        hh.ebeu[432] = 5283628618873558025L;
        hh.ebeu[433] = 3353840001213179970L;
        hh.ebeu[434] = 5347597256750448819L;
        hh.ebeu[435] = -3495282488286064192L;
        hh.ebeu[436] = 6173448957917648159L;
        hh.ebeu[437] = -5988211780638132168L;
        hh.ebeu[438] = -819017797009627495L;
        hh.ebeu[439] = 9192769348700352200L;
        hh.ebeu[440] = -4860209582729086118L;
        hh.ebeu[441] = -7520745874218124537L;
        hh.ebeu[442] = -9220671570066570284L;
        hh.ebeu[443] = -8674644940521521914L;
        hh.ebeu[444] = -6677582760873636533L;
        hh.ebeu[445] = 2154856933229011986L;
        hh.ebeu[446] = 2599649062279612067L;
        hh.ebeu[447] = -7097722984739469252L;
        hh.ebeu[448] = -4577688406056155715L;
        hh.ebeu[449] = -5568165270293443210L;
        hh.ebeu[450] = 6528717775375684438L;
        hh.ebeu[451] = -8831755801030858958L;
        hh.ebeu[452] = 4527181742924459076L;
        hh.ebeu[453] = -5532429434704008757L;
        hh.ebeu[454] = 8575895958407652019L;
        hh.ebeu[455] = -9024098905624206945L;
        hh.ebeu[456] = 2609866427534870127L;
        hh.ebeu[457] = 188177581311788195L;
        hh.ebeu[458] = -3591353498231223744L;
        hh.ebeu[459] = 1303424992801927937L;
        hh.ebeu[460] = 2452266278298601359L;
        hh.ebeu[461] = -8790960627260560084L;
        hh.ebeu[462] = -283131549098147882L;
        hh.ebeu[463] = 5801873434987334970L;
        hh.ebeu[464] = 5795561244234164363L;
        hh.ebeu[465] = 1718868803610671367L;
        hh.ebeu[466] = -2935551636902943663L;
        hh.ebeu[467] = 3647924437747040566L;
        hh.ebeu[468] = 7299771599190609849L;
        hh.ebeu[469] = 4631796940153636232L;
        hh.ebeu[470] = 7523816125411369564L;
        hh.ebeu[471] = 1523609637601143541L;
        hh.ebeu[472] = -125162410807239950L;
        hh.ebeu[473] = -4308780023401878053L;
        hh.ebeu[474] = 746395549061254837L;
        hh.ebeu[475] = 1338020030337964015L;
        hh.ebeu[476] = -6422869758977482192L;
        hh.ebeu[477] = 1505012549811456549L;
        hh.ebeu[478] = -9037171872161379884L;
        hh.ebeu[479] = -4658710525569372837L;
        hh.ebeu[480] = -7898392828331224712L;
        hh.ebeu[481] = 1727125287011183084L;
        hh.ebeu[482] = 3433310338354655673L;
        hh.ebeu[483] = -3372534036788004966L;
        hh.ebeu[484] = -5181481738140157238L;
        hh.ebeu[485] = -7825050970164395446L;
        hh.ebeu[486] = -7687861104355612801L;
        hh.ebeu[487] = -1650897958388149L;
        hh.ebeu[488] = -2748548263166071852L;
        hh.ebeu[489] = -1799589180877868255L;
        hh.ebeu[490] = 4706825191972639743L;
        hh.ebeu[491] = 4526664209413398080L;
        hh.ebeu[492] = 2216896768971493091L;
        hh.ebeu[493] = 5591527795040580998L;
        hh.ebeu[494] = 6643195255763121832L;
        hh.ebeu[495] = -7842151392044370247L;
        hh.ebeu[496] = -700146206334243537L;
        hh.ebeu[497] = 3197095092680760361L;
        hh.ebeu[498] = -7231025575163016714L;
        hh.ebeu[499] = 4584838728596213437L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void normalizeLegacyMode() {
        block110: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("edci", ebes(int ), (int)341)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == hh.ebbh("edcj", ebbe(int ), (int)565)) break;
                v0 /* !! */  = (long)hh.ebbh("edck", ebbe(int ), (int)566);
            }
            var3_1 = hh.c;
            v1 /* !! */  = hh.kf;
            if (true) ** GOTO lbl11
            block78: while (true) {
                v1 /* !! */  = (long)(hh.ebbh("edcm", ebes(int ), (int)343) - hh.ebbh("edcl", ebes(int ), (int)342));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -941348830: {
                        continue block78;
                    }
                    case 672168633: {
                        break block78;
                    }
                }
                break;
            }
            var2_2 /* !! */  = hh.b;
            v2 /* !! */  = hh.kf;
            if (true) ** GOTO lbl21
            block79: while (true) {
                v2 /* !! */  = (long)(v3 - hh.ebbh("edcn", ebes(int ), (int)344));
lbl21:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -2074970764: {
                        v3 = hh.ebbh("edco", ebes(int ), (int)345);
                        continue block79;
                    }
                    case -1176992927: {
                        v3 = hh.ebbh("edcp", ebes(int ), (int)346);
                        continue block79;
                    }
                    case 672168633: {
                        break block79;
                    }
                    case 1744371147: {
                        v3 = hh.ebbh("edcq", ebes(int ), (int)347);
                        continue block79;
                    }
                }
                break;
            }
            var1_3 = hh.a;
            if (var3_1) {
                throw null;
lbl36:
                // 7 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl36
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("edcr", ebes(int ), (int)348)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == hh.ebbh("edcs", ebbe(int ), (int)567)) break;
                v4 /* !! */  = (long)hh.ebbh("edct", ebbe(int ), (int)568);
            }
            v5 /* !! */  = hh.kf;
            if (true) ** GOTO lbl48
            block82: while (true) {
                v5 /* !! */  = (long)(v6 - hh.ebbh("edcu", ebes(int ), (int)349));
lbl48:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1906332761: {
                        v6 = hh.ebbh("edcv", ebes(int ), (int)350);
                        continue block82;
                    }
                    case 170043674: {
                        v6 = hh.ebbh("edcw", ebes(int ), (int)351);
                        continue block82;
                    }
                    case 205718195: {
                        v6 = hh.ebbh("edcx", ebes(int ), (int)352);
                        continue block82;
                    }
                    case 672168633: {
                        break block82;
                    }
                }
                break;
            }
            v7 = this.mode.getList();
            v8 /* !! */  = hh.kf;
            if (true) ** GOTO lbl65
            block83: while (true) {
                v8 /* !! */  = (long)(v9 - hh.ebbh("edcy", ebes(int ), (int)353));
lbl65:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case 205692337: {
                        v9 = hh.ebbh("edcz", ebes(int ), (int)354);
                        continue block83;
                    }
                    case 672168633: {
                        break block83;
                    }
                    case 1778704984: {
                        v9 = hh.ebbh("edda", ebes(int ), (int)355);
                        continue block83;
                    }
                    case 1839476414: {
                        v9 = hh.ebbh("eddb", ebes(int ), (int)356);
                        continue block83;
                    }
                }
                break;
            }
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("eddc", ebes(int ), (int)357)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == hh.ebbh("eddd", ebbe(int ), (int)569)) break;
                v10 /* !! */  = (long)hh.ebbh("edde", ebbe(int ), (int)570);
            }
            v11 = this.mode.getValue();
            v12 /* !! */  = hh.kf;
            if (true) ** GOTO lbl87
            block85: while (true) {
                v12 /* !! */  = (long)(v13 - hh.ebbh("eddf", ebes(int ), (int)358));
lbl87:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -1613942511: {
                        v13 = hh.ebbh("eddg", ebes(int ), (int)359);
                        continue block85;
                    }
                    case 672168633: {
                        break block85;
                    }
                    case 1132107159: {
                        v13 = hh.ebbh("eddh", ebes(int ), (int)360);
                        continue block85;
                    }
                }
                break;
            }
            if (!v7.contains(v11)) break block110;
            if (var1_3 || var1_3) ** GOTO lbl36
            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl36
        v14 /* !! */  = hh.kf;
        if (true) ** GOTO lbl105
        block86: while (true) {
            v14 /* !! */  = (long)(v15 - hh.ebbh("eddi", ebes(int ), (int)361));
lbl105:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1723868922: {
                    v15 = hh.ebbh("eddj", ebes(int ), (int)362);
                    continue block86;
                }
                case 672168633: {
                    break block86;
                }
                case 1749870196: {
                    v15 = hh.ebbh("eddk", ebes(int ), (int)363);
                    continue block86;
                }
                case 1955646663: {
                    v15 = hh.ebbh("eddl", ebes(int ), (int)364);
                    continue block86;
                }
            }
            break;
        }
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_3 = hh.kf - hh.ebbh("eddm", ebes(int ), (int)365)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == hh.ebbh("eddn", ebbe(int ), (int)571)) break;
            v16 /* !! */  = (long)hh.ebbh("eddo", ebbe(int ), (int)572);
        }
        v17 = this.mode.getValue();
        v18 /* !! */  = hh.kf;
        if (true) ** GOTO lbl127
        block88: while (true) {
            v18 /* !! */  = (long)(v19 - hh.ebbh("eddp", ebes(int ), (int)366));
lbl127:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case 672168633: {
                    break block88;
                }
                case 1084365047: {
                    v19 = hh.ebbh("eddq", ebes(int ), (int)367);
                    continue block88;
                }
                case 1246736950: {
                    v19 = hh.ebbh("eddr", ebes(int ), (int)368);
                    continue block88;
                }
                case 1838452194: {
                    v19 = hh.ebbh("edds", ebes(int ), (int)369);
                    continue block88;
                }
            }
            break;
        }
        if (!"New".equals(v17)) ** GOTO lbl-1000
        if (var1_3 || var1_3) ** GOTO lbl36
        v20 /* !! */  = hh.kf;
        if (true) ** GOTO lbl145
        block89: while (true) {
            v20 /* !! */  = (long)(hh.ebbh("eddu", ebes(int ), (int)371) - hh.ebbh("eddt", ebes(int ), (int)370));
lbl145:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case -2101063640: {
                    continue block89;
                }
                case 672168633: {
                    break block89;
                }
            }
            break;
        }
        v21 /* !! */  = hh.kf;
        if (true) ** GOTO lbl154
        block90: while (true) {
            v21 /* !! */  = (long)(hh.ebbh("eddw", ebes(int ), (int)373) - hh.ebbh("eddv", ebes(int ), (int)372));
lbl154:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case 672168633: {
                    break block90;
                }
                case 1234555427: {
                    continue block90;
                }
            }
            break;
        }
        this.swapMode.setValue("New");
        if (var1_3) ** GOTO lbl36
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 3 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl36
                v22 /* !! */  = hh.kf;
                if (true) ** GOTO lbl169
                block91: while (true) {
                    v22 /* !! */  = (long)(v23 - hh.ebbh("eddx", ebes(int ), (int)374));
lbl169:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -862631281: {
                            v23 = hh.ebbh("eddy", ebes(int ), (int)375);
                            continue block91;
                        }
                        case 672168633: {
                            break block91;
                        }
                        case 1567512427: {
                            v23 = hh.ebbh("eddz", ebes(int ), (int)376);
                            continue block91;
                        }
                        case 2067960477: {
                            v23 = hh.ebbh("edea", ebes(int ), (int)377);
                            continue block91;
                        }
                    }
                    break;
                }
                v24 /* !! */  = hh.kf;
                if (true) ** GOTO lbl185
                block92: while (true) {
                    v24 /* !! */  = (long)(v25 - hh.ebbh("edeb", ebes(int ), (int)378));
lbl185:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -622711498: {
                            v25 = hh.ebbh("edec", ebes(int ), (int)379);
                            continue block92;
                        }
                        case -295439207: {
                            v25 = hh.ebbh("eded", ebes(int ), (int)380);
                            continue block92;
                        }
                        case 672168633: {
                            break block92;
                        }
                        case 1545351032: {
                            v25 = hh.ebbh("edee", ebes(int ), (int)381);
                            continue block92;
                        }
                    }
                    break;
                }
                this.mode.setValue("\u041e\u0431\u044b\u0447\u043d\u044b\u0439");
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl201:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hh.ebbh("edef", ebbe(int ), (int)573);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl206:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hh.ebbh("edeg", ebbe(int ), (int)574);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl243
            }
            case 2: {
                var2_2 /* !! */  = (int)hh.ebbh("edeh", ebbe(int ), (int)575);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl247
            }
            case 3: {
                var2_2 /* !! */  = (int)hh.ebbh("edei", ebbe(int ), (int)576);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl225
            }
lbl221:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)hh.ebbh("edej", ebbe(int ), (int)577);
                if (!var3_1) ** GOTO lbl206
                throw null;
            }
lbl225:
            // 3 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hh.ebbh("edek", ebbe(int ), (int)578);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl239
                    break;
                }
            }
lbl231:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)hh.ebbh("edel", ebbe(int ), (int)579);
                if (!var3_1) ** GOTO lbl221
                throw null;
            }
lbl235:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)hh.ebbh("edem", ebbe(int ), (int)580);
                if (!var3_1) ** GOTO lbl225
                throw null;
            }
lbl239:
            // 4 sources

            case 8: {
                var2_2 /* !! */  = (int)hh.ebbh("eden", ebbe(int ), (int)581);
                if (!var3_1) ** GOTO lbl201
                throw null;
            }
lbl243:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)hh.ebbh("edeo", ebbe(int ), (int)582);
                if (!var3_1) ** GOTO lbl235
                throw null;
            }
lbl247:
            // 3 sources

            case 10: {
                var2_2 /* !! */  = (int)hh.ebbh("edep", ebbe(int ), (int)583);
                if (!var3_1) ** GOTO lbl231
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)hh.ebbh("edeq", ebbe(int ), (int)584);
                if (!var3_1) ** GOTO lbl239
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)hh.ebbh("eder", ebbe(int ), (int)585);
                if (!var3_1) ** GOTO lbl247
                throw null;
            }
            case 13: {
                do {
                    var2_2 /* !! */  = (int)hh.ebbh("edes", ebbe(int ), (int)586);
                } while (!var3_1);
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)hh.ebbh("edet", ebbe(int ), (int)587);
                if (!var3_1) ** GOTO lbl243
                throw null;
            }
            case 15: 
        }
        var2_2 /* !! */  = (int)hh.ebbh("edeu", ebbe(int ), (int)588);
        ** while (!var3_1)
lbl271:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void selectRingItem(int var1_1, class_1799 var2_2) {
        v0 /* !! */  = hh.kf;
        if (true) ** GOTO lbl5
        block33: while (true) {
            v0 /* !! */  = (long)(hh.ebbh("ecdr", ebes(int ), (int)123) - hh.ebbh("ecdp", ebes(int ), (int)122));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 672168633: {
                    break block33;
                }
                case 1492878629: {
                    continue block33;
                }
            }
            break;
        }
        var5_3 = hh.c;
        v1 /* !! */  = hh.kf;
        if (true) ** GOTO lbl15
        block34: while (true) {
            v1 /* !! */  = (long)(v2 - hh.ebbh("ecds", ebes(int ), (int)124));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -547122878: {
                    v2 = hh.ebbh("ecdz", ebes(int ), (int)125);
                    continue block34;
                }
                case -222167582: {
                    v2 = hh.ebbh("ecea", ebes(int ), (int)126);
                    continue block34;
                }
                case 672168633: {
                    break block34;
                }
            }
            break;
        }
        var4_4 /* !! */  = hh.b;
        v3 /* !! */  = hh.kf;
        if (true) ** GOTO lbl29
        block35: while (true) {
            v3 /* !! */  = (long)(v4 - hh.ebbh("eceb", ebes(int ), (int)127));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1294654237: {
                    v4 = hh.ebbh("eced", ebes(int ), (int)128);
                    continue block35;
                }
                case -577191850: {
                    v4 = hh.ebbh("ecef", ebes(int ), (int)129);
                    continue block35;
                }
                case 672168633: {
                    break block35;
                }
                case 1000001608: {
                    v4 = hh.ebbh("ecej", ebes(int ), (int)130);
                    continue block35;
                }
            }
            break;
        }
        var3_5 = hh.a;
        if (var5_3) {
            throw null;
lbl44:
            // 6 sources

            return;
        }
        if (var3_5) ** GOTO lbl44
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        block15 : switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** GOTO lbl44
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("ecel", ebes(int ), (int)131)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hh.ebbh("ecet", ebbe(int ), (int)204)) break;
                    v5 /* !! */  = (long)hh.ebbh("eceu", ebbe(int ), (int)205);
                }
                if (!this.isRingSlot(var1_1)) ** GOTO lbl92
                if (var3_5) ** GOTO lbl44
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("ecev", ebes(int ), (int)132)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == hh.ebbh("ecex", ebbe(int ), (int)206)) break;
                    v6 /* !! */  = (long)hh.ebbh("ecfa", ebbe(int ), (int)207);
                }
                if (!this.isSelectableRingItem(var2_2)) ** GOTO lbl92
                if (var3_5 || var3_5) ** GOTO lbl44
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("ecfe", ebes(int ), (int)133)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == hh.ebbh("ecfg", ebbe(int ), (int)208)) break;
                    v7 /* !! */  = (long)hh.ebbh("ecfl", ebbe(int ), (int)209);
                }
                v8 = hh.ebbh("ecfn", ebbe(int ), (int)210);
                v9 /* !! */  = hh.kf;
                if (true) ** GOTO lbl78
                block40: while (true) {
                    v9 /* !! */  = (long)(v10 - hh.ebbh("ecfo", ebes(int ), (int)134));
lbl78:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -470657872: {
                            v10 = hh.ebbh("ecfq", ebes(int ), (int)135);
                            continue block40;
                        }
                        case -270646923: {
                            v10 = hh.ebbh("ecfr", ebes(int ), (int)136);
                            continue block40;
                        }
                        case -246168074: {
                            v10 = hh.ebbh("ecfs", ebes(int ), (int)137);
                            continue block40;
                        }
                        case 672168633: {
                            break block40;
                        }
                    }
                    break;
                }
                this.ringItems[var1_1] = var2_2.method_46651((int)v8);
                if (var3_5) ** GOTO lbl44
lbl92:
                // 3 sources

                if (!var3_5 && !var3_5) ** break;
                ** continue;
                return;
            }
lbl95:
            // 2 sources

            case 0: {
                var4_4 /* !! */  = (int)hh.ebbh("ecfy", ebbe(int ), (int)211);
                if (var5_3) {
                    throw null;
                }
            }
lbl99:
            // 5 sources

            case 1: {
                var4_4 /* !! */  = (int)hh.ebbh("ecfz", ebbe(int ), (int)212);
                if (!var5_3) break;
                throw null;
            }
            case 2: {
                var4_4 /* !! */  = (int)hh.ebbh("ecgb", ebbe(int ), (int)213);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl117
            }
            case 3: {
                var4_4 /* !! */  = (int)hh.ebbh("ecgc", ebbe(int ), (int)214);
                if (!var5_3) ** GOTO lbl99
                throw null;
            }
            case 4: {
                var4_4 /* !! */  = (int)hh.ebbh("ecgd", ebbe(int ), (int)215);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl121
            }
lbl117:
            // 3 sources

            case 5: {
                var4_4 /* !! */  = (int)hh.ebbh("ecge", ebbe(int ), (int)216);
                if (!var5_3) ** GOTO lbl95
                throw null;
            }
lbl121:
            // 2 sources

            case 6: {
                var4_4 /* !! */  = (int)hh.ebbh("ecgf", ebbe(int ), (int)217);
                if (!var5_3) ** GOTO lbl117
                throw null;
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)hh.ebbh("ecgm", ebbe(int ), (int)218);
                    if (!var5_3) break block15;
                    throw null;
                }
            }
            case 8: {
                var4_4 /* !! */  = (int)hh.ebbh("ecgo", ebbe(int ), (int)219);
                if (!var5_3) ** GOTO lbl99
                throw null;
            }
            case 9: 
        }
        var4_4 /* !! */  = (int)hh.ebbh("ecgp", ebbe(int ), (int)220);
        ** while (!var5_3)
lbl137:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isSphereToSphere() {
        block54: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("ecuh", ebes(int ), (int)277)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == hh.ebbh("ecui", ebbe(int ), (int)420)) break;
                v0 /* !! */  = (long)hh.ebbh("ecuj", ebbe(int ), (int)421);
            }
            var3_1 = hh.c;
            v1 /* !! */  = hh.kf;
            if (true) ** GOTO lbl12
            block34: while (true) {
                v1 /* !! */  = (long)(v2 - hh.ebbh("ecuk", ebes(int ), (int)278));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1909728153: {
                        v2 = hh.ebbh("ecul", ebes(int ), (int)279);
                        continue block34;
                    }
                    case -1202636050: {
                        v2 = hh.ebbh("ecum", ebes(int ), (int)280);
                        continue block34;
                    }
                    case 672168633: {
                        break block34;
                    }
                }
                break;
            }
            var2_2 /* !! */  = hh.b;
            v3 /* !! */  = hh.kf;
            if (true) ** GOTO lbl26
            block35: while (true) {
                v3 /* !! */  = (long)(v4 - hh.ebbh("ecun", ebes(int ), (int)281));
lbl26:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1170996148: {
                        v4 = hh.ebbh("ecuo", ebes(int ), (int)282);
                        continue block35;
                    }
                    case 639321023: {
                        v4 = hh.ebbh("ecup", ebes(int ), (int)283);
                        continue block35;
                    }
                    case 672168633: {
                        break block35;
                    }
                }
                break;
            }
            var1_3 = hh.a;
            if (var3_1) {
                throw null;
lbl38:
                // 4 sources

                return (boolean)hh.ebbh("ecuq", ebbe(int ), (int)422);
            }
            if (var1_3 || var1_3) ** GOTO lbl38
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("ecur", ebes(int ), (int)284)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == hh.ebbh("ecus", ebbe(int ), (int)423)) break;
                v5 /* !! */  = (long)hh.ebbh("ecut", ebbe(int ), (int)424);
            }
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("ecuu", ebes(int ), (int)285)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v6 /* !! */  == hh.ebbh("ecuv", ebbe(int ), (int)425)) break;
                v6 /* !! */  = (long)hh.ebbh("ecuw", ebbe(int ), (int)426);
            }
            if (!this.firstItem.isSelected("\u0421\u0444\u0435\u0440\u0430")) break block54;
            if (var1_3) ** GOTO lbl38
            v7 /* !! */  = hh.kf;
            if (true) ** GOTO lbl59
            block39: while (true) {
                v7 /* !! */  = (long)(v8 - hh.ebbh("ecux", ebes(int ), (int)286));
lbl59:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -920328545: {
                        v8 = hh.ebbh("ecuy", ebes(int ), (int)287);
                        continue block39;
                    }
                    case 193561769: {
                        v8 = hh.ebbh("ecuz", ebes(int ), (int)288);
                        continue block39;
                    }
                    case 672168633: {
                        break block39;
                    }
                    case 804292685: {
                        v8 = hh.ebbh("ecva", ebes(int ), (int)289);
                        continue block39;
                    }
                }
                break;
            }
            v9 /* !! */  = hh.kf;
            if (true) ** GOTO lbl75
            block40: while (true) {
                v9 /* !! */  = (long)(v10 - hh.ebbh("ecvb", ebes(int ), (int)290));
lbl75:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1078753934: {
                        v10 = hh.ebbh("ecvc", ebes(int ), (int)291);
                        continue block40;
                    }
                    case -202468411: {
                        v10 = hh.ebbh("ecvd", ebes(int ), (int)292);
                        continue block40;
                    }
                    case 672168633: {
                        break block40;
                    }
                    case 1980531254: {
                        v10 = hh.ebbh("ecve", ebes(int ), (int)293);
                        continue block40;
                    }
                }
                break;
            }
            if (!this.secondItem.isSelected("\u0421\u0444\u0435\u0440\u0430")) break block54;
            if (var1_3) ** GOTO lbl38
            v11 = hh.ebbh("ecvf", ebbe(int ), (int)427);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl100
        }
        if (!var1_3 && !var1_3) ** break;
        ** while (true)
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block22 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v11 = hh.ebbh("ecvg", ebbe(int ), (int)428);
lbl100:
                // 2 sources

                return (boolean)v11;
            }
            case 0: {
                var2_2 /* !! */  = (int)hh.ebbh("ecvh", ebbe(int ), (int)429);
                if (var3_1) {
                    throw null;
                }
            }
lbl105:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)hh.ebbh("ecvi", ebbe(int ), (int)430);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 2: {
                var2_2 /* !! */  = (int)hh.ebbh("ecvj", ebbe(int ), (int)431);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl124
            }
            case 3: {
                var2_2 /* !! */  = (int)hh.ebbh("ecvk", ebbe(int ), (int)432);
                if (var3_1) {
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)hh.ebbh("ecvl", ebbe(int ), (int)433);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl124:
            // 2 sources

            case 5: {
                do {
                    var2_2 /* !! */  = (int)hh.ebbh("ecvm", ebbe(int ), (int)434);
                } while (!var3_1);
                throw null;
            }
lbl129:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)hh.ebbh("ecvn", ebbe(int ), (int)435);
                if (!var3_1) ** GOTO lbl105
                throw null;
            }
lbl133:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hh.ebbh("ecvo", ebbe(int ), (int)436);
                    if (!var3_1) break block22;
                    throw null;
                }
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)hh.ebbh("ecvp", ebbe(int ), (int)437);
        ** while (!var3_1)
lbl141:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void efof() {
        hh.ebet[600] = -3991392244927436223L;
        hh.ebet[601] = -3397263275574768407L;
        hh.ebet[602] = -3386622318951115770L;
        hh.ebet[603] = 1059659658861221754L;
        hh.ebet[604] = -8931341044989321160L;
        hh.ebet[605] = -4292980784010422923L;
        hh.ebet[606] = -1353257841044085163L;
        hh.ebet[607] = -2035797504123403482L;
        hh.ebet[608] = -9017096013407431542L;
        hh.ebet[609] = 7830668448968830503L;
        hh.ebet[610] = -7453870286616279337L;
        hh.ebet[611] = -5479751775321620999L;
        hh.ebet[612] = 1023638742219266963L;
        hh.ebet[613] = -7324328167955118331L;
        hh.ebet[614] = -3912525794112801553L;
        hh.ebet[615] = 6031727289052885764L;
        hh.ebet[616] = 6030251484277390698L;
        hh.ebet[617] = 7190167132852661810L;
        hh.ebet[618] = -5502010715770791194L;
        hh.ebet[619] = -816549299239148054L;
        hh.ebet[620] = -1873803024794530418L;
        hh.ebet[621] = -7592474711267694130L;
        hh.ebet[622] = 6774743107420009493L;
        hh.ebet[623] = -1793065651941213346L;
        hh.ebet[624] = -3001189989448861338L;
        hh.ebet[625] = 6978935436069174882L;
        hh.ebet[626] = -2349033860710220833L;
        hh.ebet[627] = -1516056310493252724L;
        hh.ebet[628] = -1927149972880213578L;
        hh.ebet[629] = 8605092333307004458L;
        hh.ebet[630] = 4279076042077897645L;
        hh.ebet[631] = -7077577967240599584L;
        hh.ebet[632] = -3081923092667924338L;
        hh.ebet[633] = 4528541020449483367L;
        hh.ebet[634] = 3308076564651066933L;
        hh.ebet[635] = -8746195180878543597L;
        hh.ebet[636] = 7182939943034263551L;
        hh.ebet[637] = 2908156268760402811L;
        hh.ebet[638] = -8646284433209097676L;
        hh.ebet[639] = 1886486938523788435L;
        hh.ebet[640] = 8351130506072409171L;
        hh.ebet[641] = 6036309534110790435L;
        hh.ebet[642] = 4279110842626949283L;
        hh.ebet[643] = -4262592890376069963L;
        hh.ebet[644] = 4153849073960993573L;
        hh.ebet[645] = 1850598443898863440L;
        hh.ebet[646] = -7668035776880008552L;
        hh.ebet[647] = -1365567871459917610L;
        hh.ebet[648] = -8325841618250406371L;
        hh.ebet[649] = -6070753017598608365L;
        hh.ebet[650] = -7664643619452653012L;
        hh.ebet[651] = 5287331286027197486L;
        hh.ebet[652] = 5372819441636008080L;
        hh.ebet[653] = -8139160718874078158L;
        hh.ebet[654] = -2505045526596412419L;
        hh.ebet[655] = 2531899633075416692L;
        hh.ebet[656] = -9047994021762497449L;
        hh.ebet[657] = 4187832966548677512L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public hh() {
        var2_1 /* !! */  = hh.b;
        super("AutoSwap", "\u041f\u0435\u0440\u0435\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0435 \u043c\u0435\u0436\u0434\u0443 \u0434\u0432\u0443\u043c\u044f \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u044b\u043c\u0438 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430\u043c\u0438 \u0432 \u043e\u0444\u0444\u0445\u0430\u043d\u0434\u0435", du.RAGE);
        this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u041e\u0431\u044b\u0447\u043d\u044b\u0439 \u043f\u0435\u0440\u0435\u043a\u043b\u044e\u0447\u0430\u0435\u0442 \u0434\u0432\u0430 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430, \u0422\u0440\u043e\u0439\u043d\u043e\u0439 \u043e\u0442\u043a\u0440\u044b\u0432\u0430\u0435\u0442 \u043a\u043e\u043b\u0435\u0441\u043e \u0438\u0437 \u0442\u0440\u0451\u0445 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432", "\u041e\u0431\u044b\u0447\u043d\u044b\u0439", new String[]{"\u041e\u0431\u044b\u0447\u043d\u044b\u0439", "\u0422\u0440\u043e\u0439\u043d\u043e\u0439"});
        this.bind = new ka("\u041a\u043d\u043e\u043f\u043a\u0430 \u0441\u0432\u0430\u043f\u0430", "\u041a\u043b\u0430\u0432\u0438\u0448\u0430 \u0434\u043b\u044f \u043f\u0435\u0440\u0435\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f \u043c\u0435\u0436\u0434\u0443 \u0434\u0432\u0443\u043c\u044f \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430\u043c\u0438 \u0432 \u043e\u0444\u0444\u0445\u0430\u043d\u0434\u0435").visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$0(), ()Ljava/lang/Boolean;)((hh)this));
        this.ringBind = new ka("\u041a\u043d\u043e\u043f\u043a\u0430 \u043a\u043e\u043b\u0435\u0441\u0430", "\u041a\u043b\u0430\u0432\u0438\u0448\u0430 \u0434\u043b\u044f \u043e\u0442\u043a\u0440\u044b\u0442\u0438\u044f \u043a\u043e\u043b\u0435\u0441\u0430 \u0438\u0437 \u0442\u0440\u0451\u0445 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432").visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$1(), ()Ljava/lang/Boolean;)((hh)this));
        this.swapMode = new kf("\u0420\u0435\u0436\u0438\u043c \u0441\u0432\u0430\u043f\u0430", "\u0411\u044b\u0441\u0442\u0440\u044b\u0439 - \u043c\u043e\u043c\u0435\u043d\u0442\u0430\u043b\u044c\u043d\u044b\u0439, ReallyWorld - \u0437\u0430\u0434\u0435\u0440\u0436\u043a\u0430 \u043f\u043e\u043b \u0442\u0438\u043a\u0430, New - \u043e\u0441\u0442\u0430\u043d\u043e\u0432\u043a\u0430 \u043d\u0430 \u043e\u0434\u0438\u043d \u0442\u0438\u043a", "\u0411\u044b\u0441\u0442\u0440\u044b\u0439", new String[]{"\u0411\u044b\u0441\u0442\u0440\u044b\u0439", "ReallyWorld", "New"}).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$2(), ()Ljava/lang/Boolean;)((hh)this));
        this.firstItem = new kf("1 \u043f\u0440\u0435\u0434\u043c\u0435\u0442", "\u041f\u0435\u0440\u0432\u044b\u0439 \u043f\u0440\u0435\u0434\u043c\u0435\u0442 \u0434\u043b\u044f \u043f\u0435\u0440\u0435\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f", "\u0421\u0444\u0435\u0440\u0430", new String[]{"\u0421\u0444\u0435\u0440\u0430", "\u0422\u043e\u0442\u0435\u043c", "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d", "\u0429\u0438\u0442", "\u0417\u043e\u043b\u043e\u0442\u043e\u0435 \u044f\u0431\u043b\u043e\u043a\u043e"}).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$3(), ()Ljava/lang/Boolean;)((hh)this));
        this.secondItem = new kf("2 \u043f\u0440\u0435\u0434\u043c\u0435\u0442", "\u0412\u0442\u043e\u0440\u043e\u0439 \u043f\u0440\u0435\u0434\u043c\u0435\u0442 \u0434\u043b\u044f \u043f\u0435\u0440\u0435\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f", "\u0422\u043e\u0442\u0435\u043c", new String[]{"\u0421\u0444\u0435\u0440\u0430", "\u0422\u043e\u0442\u0435\u043c", "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d", "\u0429\u0438\u0442", "\u0417\u043e\u043b\u043e\u0442\u043e\u0435 \u044f\u0431\u043b\u043e\u043a\u043e"}).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$4(), ()Ljava/lang/Boolean;)((hh)this));
        this.ringItems = new class_1799[]{class_1799.field_8037, class_1799.field_8037, class_1799.field_8037};
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.targetSlot = (int)hh.ebbh("ebbi", ebbe(int ), (int)0);
                this.isFromHotbar = hh.ebbh("ebbj", ebbe(int ), (int)1);
                this.settings(new jx[]{this.mode, this.bind, this.ringBind, this.swapMode, this.firstItem, this.secondItem});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)hh.ebbh("ebbk", ebbe(int ), (int)2);
                ** GOTO lbl41
            }
lbl20:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)hh.ebbh("ebbl", ebbe(int ), (int)3);
                ** GOTO lbl33
            }
            case 2: {
                var2_1 /* !! */  = (int)hh.ebbh("ebbm", ebbe(int ), (int)4);
                ** GOTO lbl50
            }
lbl26:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)hh.ebbh("ebbn", ebbe(int ), (int)5);
                    break block0;
                    break;
                }
            }
            case 4: {
                var2_1 /* !! */  = (int)hh.ebbh("ebbo", ebbe(int ), (int)6);
                ** GOTO lbl35
            }
lbl33:
            // 3 sources

            case 5: {
                var2_1 /* !! */  = (int)hh.ebbh("ebbp", ebbe(int ), (int)7);
            }
lbl35:
            // 4 sources

            case 6: {
                var2_1 /* !! */  = (int)hh.ebbh("ebbq", ebbe(int ), (int)8);
                ** GOTO lbl20
            }
lbl38:
            // 2 sources

            case 7: {
                var2_1 /* !! */  = (int)hh.ebbh("ebbr", ebbe(int ), (int)9);
                ** GOTO lbl26
            }
lbl41:
            // 2 sources

            case 8: {
                var2_1 /* !! */  = (int)hh.ebbh("ebbs", ebbe(int ), (int)10);
                ** GOTO lbl38
            }
            case 9: {
                var2_1 /* !! */  = (int)hh.ebbh("ebbt", ebbe(int ), (int)11);
                ** GOTO lbl33
            }
            case 10: {
                var2_1 /* !! */  = (int)hh.ebbh("ebbu", ebbe(int ), (int)12);
                ** GOTO lbl35
            }
lbl50:
            // 2 sources

            case 11: {
                while (true) {
                    var2_1 /* !! */  = (int)hh.ebbh("ebbv", ebbe(int ), (int)13);
                }
            }
            case 12: 
        }
        var2_1 /* !! */  = (int)hh.ebbh("ebbw", ebbe(int ), (int)14);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void prepareSwapNew(int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("ecyg", ebes(int ), (int)294)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hh.ebbh("ecyh", ebbe(int ), (int)506)) break;
            v0 /* !! */  = (long)hh.ebbh("ecyi", ebbe(int ), (int)507);
        }
        var4_2 = hh.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("ecyj", ebes(int ), (int)295)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == hh.ebbh("ecyk", ebbe(int ), (int)508)) break;
            v1 /* !! */  = (long)hh.ebbh("ecyl", ebbe(int ), (int)509);
        }
        var3_3 /* !! */  = hh.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("ecym", ebes(int ), (int)296)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hh.ebbh("ecyn", ebbe(int ), (int)510)) break;
            v2 /* !! */  = (long)hh.ebbh("ecyo", ebbe(int ), (int)511);
        }
        var2_4 = hh.a;
        if (var4_2) {
            throw null;
lbl21:
            // 5 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl21
        v3 /* !! */  = hh.kf;
        if (true) ** GOTO lbl28
        block35: while (true) {
            v3 /* !! */  = (long)(hh.ebbh("ecyq", ebes(int ), (int)298) - hh.ebbh("ecyp", ebes(int ), (int)297));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 672168633: {
                    break block35;
                }
                case 896673926: {
                    continue block35;
                }
            }
            break;
        }
        this.targetSlot = var1_1;
        if (var2_4 || var2_4) ** GOTO lbl21
        if (var1_1 < hh.ebbh("ecyr", ebbe(int ), (int)512)) {
            v4 = hh.ebbh("ecys", ebbe(int ), (int)513);
            if (var4_2) {
                throw null;
            }
        } else {
            v4 = hh.ebbh("ecyt", ebbe(int ), (int)514);
        }
        v5 /* !! */  = hh.kf;
        if (true) ** GOTO lbl45
        block36: while (true) {
            v5 /* !! */  = (long)(hh.ebbh("ecyv", ebes(int ), (int)300) - hh.ebbh("ecyu", ebes(int ), (int)299));
lbl45:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -490703101: {
                    continue block36;
                }
                case 672168633: {
                    break block36;
                }
            }
            break;
        }
        this.isFromHotbar = v4;
        if (var2_4) ** GOTO lbl21
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl21
                v6 = hh.ebbh("ecyw", ebbe(int ), (int)515);
                v7 /* !! */  = hh.kf;
                if (true) ** GOTO lbl61
                block37: while (true) {
                    v7 /* !! */  = (long)(v8 - hh.ebbh("ecyx", ebes(int ), (int)301));
lbl61:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1203311686: {
                            v8 = hh.ebbh("ecyy", ebes(int ), (int)302);
                            continue block37;
                        }
                        case 405328369: {
                            v8 = hh.ebbh("ecyz", ebes(int ), (int)303);
                            continue block37;
                        }
                        case 672168633: {
                            break block37;
                        }
                        case 892393431: {
                            v8 = hh.ebbh("ecza", ebes(int ), (int)304);
                            continue block37;
                        }
                    }
                    break;
                }
                v9 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, executeSwapLegit(), ()V)((hh)this);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = hh.kf - hh.ebbh("eczb", ebes(int ), (int)305)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == hh.ebbh("eczc", ebbe(int ), (int)516)) break;
                    v10 /* !! */  = (long)hh.ebbh("eczd", ebbe(int ), (int)517);
                }
                v11 = this.createOneTickSettings();
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = hh.kf - hh.ebbh("ecze", ebes(int ), (int)306)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == hh.ebbh("eczf", ebbe(int ), (int)518)) break;
                    v12 /* !! */  = (long)hh.ebbh("eczg", ebbe(int ), (int)519);
                }
                v13 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, cleanup(), ()V)((hh)this);
                v14 /* !! */  = hh.kf;
                if (true) ** GOTO lbl90
                block40: while (true) {
                    v14 /* !! */  = (long)(v15 - hh.ebbh("eczh", ebes(int ), (int)307));
lbl90:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -842140924: {
                            v15 = hh.ebbh("eczi", ebes(int ), (int)308);
                            continue block40;
                        }
                        case 672168633: {
                            break block40;
                        }
                        case 1292984796: {
                            v15 = hh.ebbh("eczj", ebes(int ), (int)309);
                            continue block40;
                        }
                    }
                    break;
                }
                nz.queueSwap("AutoSwap", (int)v6, v9, v11, v13);
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)hh.ebbh("eczk", ebbe(int ), (int)520);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl109:
            // 3 sources

            case 1: {
                var3_3 /* !! */  = (int)hh.ebbh("eczl", ebbe(int ), (int)521);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hh.ebbh("eczm", ebbe(int ), (int)522);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl134
                    break;
                }
            }
            case 3: {
                var3_3 /* !! */  = (int)hh.ebbh("eczn", ebbe(int ), (int)523);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
            case 4: {
                var3_3 /* !! */  = (int)hh.ebbh("eczo", ebbe(int ), (int)524);
                if (!var4_2) ** GOTO lbl109
                throw null;
            }
lbl129:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)hh.ebbh("eczp", ebbe(int ), (int)525);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl134:
            // 5 sources

            case 6: {
                var3_3 /* !! */  = (int)hh.ebbh("eczq", ebbe(int ), (int)526);
                if (!var4_2) break;
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)hh.ebbh("eczr", ebbe(int ), (int)527);
                if (!var4_2) ** GOTO lbl134
                throw null;
            }
lbl142:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)hh.ebbh("eczs", ebbe(int ), (int)528);
                if (!var4_2) ** GOTO lbl109
                throw null;
            }
            case 9: 
        }
        var3_3 /* !! */  = (int)hh.ebbh("eczt", ebbe(int ), (int)529);
        ** while (!var4_2)
lbl149:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block55: {
            v0 /* !! */  = hh.kf;
            if (true) ** GOTO lbl5
            block35: while (true) {
                v0 /* !! */  = (long)(hh.ebbh("eczv", ebes(int ), (int)311) - hh.ebbh("eczu", ebes(int ), (int)310));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1119786343: {
                        continue block35;
                    }
                    case 672168633: {
                        break block35;
                    }
                }
                break;
            }
            var4_2 = hh.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_0 = hh.kf - hh.ebbh("eczw", ebes(int ), (int)312)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == hh.ebbh("eczx", ebbe(int ), (int)530)) break;
                v1 /* !! */  = (long)hh.ebbh("eczy", ebbe(int ), (int)531);
            }
            var3_3 /* !! */  = hh.b;
            v2 /* !! */  = hh.kf;
            if (true) ** GOTO lbl21
            block37: while (true) {
                v2 /* !! */  = (long)(v3 - hh.ebbh("eczz", ebes(int ), (int)313));
lbl21:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case 316812671: {
                        v3 = hh.ebbh("edaa", ebes(int ), (int)314);
                        continue block37;
                    }
                    case 672168633: {
                        break block37;
                    }
                    case 1187504585: {
                        v3 = hh.ebbh("edab", ebes(int ), (int)315);
                        continue block37;
                    }
                    case 1294680940: {
                        v3 = hh.ebbh("edac", ebes(int ), (int)316);
                        continue block37;
                    }
                }
                break;
            }
            var2_4 = hh.a;
            if (var4_2) {
                throw null;
lbl36:
                // 6 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl36
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = hh.kf - hh.ebbh("edad", ebes(int ), (int)317)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == hh.ebbh("edae", ebbe(int ), (int)532)) break;
                v4 /* !! */  = (long)hh.ebbh("edaf", ebbe(int ), (int)533);
            }
            this.normalizeLegacyMode();
            if (var2_4 || var2_4) ** GOTO lbl36
            v5 /* !! */  = hh.kf;
            if (true) ** GOTO lbl50
            block40: while (true) {
                v5 /* !! */  = (long)(v6 - hh.ebbh("edag", ebes(int ), (int)318));
lbl50:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1360961457: {
                        v6 = hh.ebbh("edah", ebes(int ), (int)319);
                        continue block40;
                    }
                    case -15410897: {
                        v6 = hh.ebbh("edai", ebes(int ), (int)320);
                        continue block40;
                    }
                    case 672168633: {
                        break block40;
                    }
                    case 1590678171: {
                        v6 = hh.ebbh("edaj", ebes(int ), (int)321);
                        continue block40;
                    }
                }
                break;
            }
            v7 /* !! */  = hh.kf;
            if (true) ** GOTO lbl66
            block41: while (true) {
                v7 /* !! */  = (long)(hh.ebbh("edal", ebes(int ), (int)323) - hh.ebbh("edak", ebes(int ), (int)322));
lbl66:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -42053084: {
                        continue block41;
                    }
                    case 672168633: {
                        break block41;
                    }
                }
                break;
            }
            if (hh.mc.field_1724 != null) break block55;
            if (var2_4 || var2_4) ** GOTO lbl36
            return;
        }
        if (var2_4) ** GOTO lbl36
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl36
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = hh.kf - hh.ebbh("edam", ebes(int ), (int)324)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == hh.ebbh("edan", ebbe(int ), (int)534)) break;
                    v8 /* !! */  = (long)hh.ebbh("edao", ebbe(int ), (int)535);
                }
                nz.tick();
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl89:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)hh.ebbh("edap", ebbe(int ), (int)536);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl94:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)hh.ebbh("edaq", ebbe(int ), (int)537);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl120
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hh.ebbh("edar", ebbe(int ), (int)538);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl120
                    break;
                }
            }
            case 3: {
                var3_3 /* !! */  = (int)hh.ebbh("edas", ebbe(int ), (int)539);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl110:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)hh.ebbh("edat", ebbe(int ), (int)540);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 5: {
                do {
                    var3_3 /* !! */  = (int)hh.ebbh("edau", ebbe(int ), (int)541);
                } while (!var4_2);
                throw null;
            }
lbl120:
            // 4 sources

            case 6: {
                do {
                    var3_3 /* !! */  = (int)hh.ebbh("edav", ebbe(int ), (int)542);
                } while (!var4_2);
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)hh.ebbh("edaw", ebbe(int ), (int)543);
                if (!var4_2) ** GOTO lbl94
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)hh.ebbh("edax", ebbe(int ), (int)544);
                if (!var4_2) ** GOTO lbl110
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)hh.ebbh("eday", ebbe(int ), (int)545);
                if (!var4_2) break;
                throw null;
            }
            case 10: {
                var3_3 /* !! */  = (int)hh.ebbh("edaz", ebbe(int ), (int)546);
                if (!var4_2) ** GOTO lbl89
                throw null;
            }
lbl141:
            // 3 sources

            case 11: {
                var3_3 /* !! */  = (int)hh.ebbh("edba", ebbe(int ), (int)547);
                if (!var4_2) ** GOTO lbl110
                throw null;
            }
            case 12: 
        }
        var3_3 /* !! */  = (int)hh.ebbh("edbb", ebbe(int ), (int)548);
        ** while (!var4_2)
lbl148:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void efnu() {
        hh.ebbg[500] = -789431110;
        hh.ebbg[501] = -1143356308;
        hh.ebbg[502] = 829976953;
        hh.ebbg[503] = 140104637;
        hh.ebbg[504] = -2100116961;
        hh.ebbg[505] = 2076670655;
        hh.ebbg[506] = 171457413;
        hh.ebbg[507] = 1656373829;
        hh.ebbg[508] = 1401452703;
        hh.ebbg[509] = 1617989151;
        hh.ebbg[510] = 1380089766;
        hh.ebbg[511] = 1531258427;
        hh.ebbg[512] = 1455553835;
        hh.ebbg[513] = -169304200;
        hh.ebbg[514] = -363464421;
        hh.ebbg[515] = -1948836565;
        hh.ebbg[516] = -759719806;
        hh.ebbg[517] = 1840177828;
        hh.ebbg[518] = 1820208477;
        hh.ebbg[519] = 1857529314;
        hh.ebbg[520] = 1371286605;
        hh.ebbg[521] = 1006782319;
        hh.ebbg[522] = 1433321729;
        hh.ebbg[523] = -725216426;
        hh.ebbg[524] = -1039286594;
        hh.ebbg[525] = -1592852245;
        hh.ebbg[526] = 275746654;
        hh.ebbg[527] = 2084343302;
        hh.ebbg[528] = 107103974;
        hh.ebbg[529] = -1563805066;
        hh.ebbg[530] = 1048578487;
        hh.ebbg[531] = -363319657;
        hh.ebbg[532] = -182519102;
        hh.ebbg[533] = -148445368;
        hh.ebbg[534] = -3729218;
        hh.ebbg[535] = 1917544677;
        hh.ebbg[536] = -1321548688;
        hh.ebbg[537] = 1027730228;
        hh.ebbg[538] = 327387120;
        hh.ebbg[539] = -684242604;
        hh.ebbg[540] = -976548060;
        hh.ebbg[541] = 1205871690;
        hh.ebbg[542] = 1641747812;
        hh.ebbg[543] = 246422376;
        hh.ebbg[544] = 1135187174;
        hh.ebbg[545] = 1218821038;
        hh.ebbg[546] = -161584919;
        hh.ebbg[547] = 193284872;
        hh.ebbg[548] = -863718216;
        hh.ebbg[549] = -831193502;
        hh.ebbg[550] = -867865431;
        hh.ebbg[551] = 145563612;
        hh.ebbg[552] = 205620353;
        hh.ebbg[553] = 2010969467;
        hh.ebbg[554] = 1945046040;
        hh.ebbg[555] = -237971589;
        hh.ebbg[556] = 52193321;
        hh.ebbg[557] = -453261142;
        hh.ebbg[558] = 417478208;
        hh.ebbg[559] = 534670966;
        hh.ebbg[560] = -445309700;
        hh.ebbg[561] = -1248703442;
        hh.ebbg[562] = -1398400289;
        hh.ebbg[563] = 1107152192;
        hh.ebbg[564] = -31170259;
        hh.ebbg[565] = -528929057;
        hh.ebbg[566] = 1991117489;
        hh.ebbg[567] = -925875357;
        hh.ebbg[568] = 1631606276;
        hh.ebbg[569] = -1103371474;
        hh.ebbg[570] = -508368129;
        hh.ebbg[571] = 1669527758;
        hh.ebbg[572] = -961388291;
        hh.ebbg[573] = 148396147;
        hh.ebbg[574] = 224846218;
        hh.ebbg[575] = 20416958;
        hh.ebbg[576] = 2088755132;
        hh.ebbg[577] = -885213300;
        hh.ebbg[578] = -1224901737;
        hh.ebbg[579] = 897118329;
        hh.ebbg[580] = 1712898608;
        hh.ebbg[581] = -1909800718;
        hh.ebbg[582] = -189554018;
        hh.ebbg[583] = 830012975;
        hh.ebbg[584] = -927975022;
        hh.ebbg[585] = 423214189;
        hh.ebbg[586] = 1371467172;
        hh.ebbg[587] = 1967623373;
        hh.ebbg[588] = 787408012;
        hh.ebbg[589] = -1022297238;
        hh.ebbg[590] = 1301468958;
        hh.ebbg[591] = -639099761;
        hh.ebbg[592] = 56094366;
        hh.ebbg[593] = -1065342809;
        hh.ebbg[594] = 347887180;
        hh.ebbg[595] = -1865218068;
        hh.ebbg[596] = 895254167;
        hh.ebbg[597] = -654548969;
        hh.ebbg[598] = -109042830;
        hh.ebbg[599] = 1001364043;
    }

    private static /* synthetic */ void efnh() {
        hh.ebbf[200] = -858343909;
        hh.ebbf[201] = -562164962;
        hh.ebbf[202] = -1809798033;
        hh.ebbf[203] = 1008247566;
        hh.ebbf[204] = 1825503917;
        hh.ebbf[205] = 1899529943;
        hh.ebbf[206] = 37112089;
        hh.ebbf[207] = 1522691021;
        hh.ebbf[208] = 285579219;
        hh.ebbf[209] = 1742122676;
        hh.ebbf[210] = -1707967249;
        hh.ebbf[211] = 1550335182;
        hh.ebbf[212] = 888018476;
        hh.ebbf[213] = -64043150;
        hh.ebbf[214] = 33940035;
        hh.ebbf[215] = -857900002;
        hh.ebbf[216] = -268097149;
        hh.ebbf[217] = 2103608989;
        hh.ebbf[218] = 322361144;
        hh.ebbf[219] = -1269978076;
        hh.ebbf[220] = 52937581;
        hh.ebbf[221] = -894863338;
        hh.ebbf[222] = 1481376901;
        hh.ebbf[223] = 163611660;
        hh.ebbf[224] = -767935947;
        hh.ebbf[225] = 428169355;
        hh.ebbf[226] = 497015651;
        hh.ebbf[227] = 2025922113;
        hh.ebbf[228] = 646889901;
        hh.ebbf[229] = 168170352;
        hh.ebbf[230] = 394495168;
        hh.ebbf[231] = 1144161226;
        hh.ebbf[232] = 63101422;
        hh.ebbf[233] = -1348240022;
        hh.ebbf[234] = 1702752251;
        hh.ebbf[235] = -1789593157;
        hh.ebbf[236] = 207894131;
        hh.ebbf[237] = -1419428211;
        hh.ebbf[238] = -1604681999;
        hh.ebbf[239] = -400919570;
        hh.ebbf[240] = 1647191011;
        hh.ebbf[241] = -34047285;
        hh.ebbf[242] = 2060602008;
        hh.ebbf[243] = 1170914881;
        hh.ebbf[244] = 834514496;
        hh.ebbf[245] = -685283530;
        hh.ebbf[246] = -399818555;
        hh.ebbf[247] = 1683976381;
        hh.ebbf[248] = -1612983406;
        hh.ebbf[249] = 870609116;
        hh.ebbf[250] = 936811196;
        hh.ebbf[251] = -606643172;
        hh.ebbf[252] = -281375233;
        hh.ebbf[253] = -420763862;
        hh.ebbf[254] = -832445752;
        hh.ebbf[255] = 777975071;
        hh.ebbf[256] = 239794149;
        hh.ebbf[257] = 1191944693;
        hh.ebbf[258] = -1035125696;
        hh.ebbf[259] = 979155864;
        hh.ebbf[260] = -2124390234;
        hh.ebbf[261] = 1882769448;
        hh.ebbf[262] = -568032840;
        hh.ebbf[263] = -444262645;
        hh.ebbf[264] = 901016288;
        hh.ebbf[265] = -183803664;
        hh.ebbf[266] = -1356440301;
        hh.ebbf[267] = 1797240381;
        hh.ebbf[268] = -935763382;
        hh.ebbf[269] = 66135312;
        hh.ebbf[270] = 1870157983;
        hh.ebbf[271] = 149816214;
        hh.ebbf[272] = -1476588931;
        hh.ebbf[273] = -960129702;
        hh.ebbf[274] = 192161564;
        hh.ebbf[275] = -982600174;
        hh.ebbf[276] = -94213428;
        hh.ebbf[277] = 224281836;
        hh.ebbf[278] = -1797618912;
        hh.ebbf[279] = 347722129;
        hh.ebbf[280] = 1498384281;
        hh.ebbf[281] = 256463180;
        hh.ebbf[282] = 1978014930;
        hh.ebbf[283] = 2076266233;
        hh.ebbf[284] = -2030588664;
        hh.ebbf[285] = 355897619;
        hh.ebbf[286] = -834118228;
        hh.ebbf[287] = -945546618;
        hh.ebbf[288] = 2006936151;
        hh.ebbf[289] = -830740328;
        hh.ebbf[290] = 33608387;
        hh.ebbf[291] = 860999602;
        hh.ebbf[292] = -2066764499;
        hh.ebbf[293] = -773636508;
        hh.ebbf[294] = 571752158;
        hh.ebbf[295] = -1791021225;
        hh.ebbf[296] = -1264720676;
        hh.ebbf[297] = -56952986;
        hh.ebbf[298] = 1431014469;
        hh.ebbf[299] = -1660806853;
    }

    private static /* synthetic */ void efnq() {
        hh.ebbg[100] = -1419975411;
        hh.ebbg[101] = 1088869910;
        hh.ebbg[102] = 667900516;
        hh.ebbg[103] = 1064031429;
        hh.ebbg[104] = -402654571;
        hh.ebbg[105] = 224021401;
        hh.ebbg[106] = -1502515804;
        hh.ebbg[107] = -783981693;
        hh.ebbg[108] = 556003749;
        hh.ebbg[109] = -1044657891;
        hh.ebbg[110] = 414431016;
        hh.ebbg[111] = 1770058653;
        hh.ebbg[112] = 1256495439;
        hh.ebbg[113] = -1087895866;
        hh.ebbg[114] = -754895466;
        hh.ebbg[115] = 575306940;
        hh.ebbg[116] = 1119755009;
        hh.ebbg[117] = -601098864;
        hh.ebbg[118] = 1166712341;
        hh.ebbg[119] = -636130667;
        hh.ebbg[120] = -1292916637;
        hh.ebbg[121] = -903146661;
        hh.ebbg[122] = 1366732051;
        hh.ebbg[123] = 775130523;
        hh.ebbg[124] = 541826781;
        hh.ebbg[125] = 1154276062;
        hh.ebbg[126] = 400252113;
        hh.ebbg[127] = -2058676953;
        hh.ebbg[128] = 730659945;
        hh.ebbg[129] = 891051988;
        hh.ebbg[130] = 279853201;
        hh.ebbg[131] = 973499870;
        hh.ebbg[132] = 430485582;
        hh.ebbg[133] = 440024071;
        hh.ebbg[134] = 1660352227;
        hh.ebbg[135] = -1645379919;
        hh.ebbg[136] = 466994569;
        hh.ebbg[137] = 2049902274;
        hh.ebbg[138] = 1095660021;
        hh.ebbg[139] = 166777642;
        hh.ebbg[140] = 1349448259;
        hh.ebbg[141] = 708108566;
        hh.ebbg[142] = -2003403263;
        hh.ebbg[143] = -397663535;
        hh.ebbg[144] = 104469863;
        hh.ebbg[145] = 1265296860;
        hh.ebbg[146] = 1253323526;
        hh.ebbg[147] = 771713744;
        hh.ebbg[148] = 489781620;
        hh.ebbg[149] = -973007366;
        hh.ebbg[150] = 2100862394;
        hh.ebbg[151] = 9272793;
        hh.ebbg[152] = 177934730;
        hh.ebbg[153] = 1250730325;
        hh.ebbg[154] = -1276940687;
        hh.ebbg[155] = 1824615824;
        hh.ebbg[156] = -181959007;
        hh.ebbg[157] = -1493549871;
        hh.ebbg[158] = -1043508996;
        hh.ebbg[159] = -920178781;
        hh.ebbg[160] = 245326477;
        hh.ebbg[161] = -1694572598;
        hh.ebbg[162] = -1997732664;
        hh.ebbg[163] = 466871017;
        hh.ebbg[164] = -1073543430;
        hh.ebbg[165] = 680241315;
        hh.ebbg[166] = -594135116;
        hh.ebbg[167] = 541061690;
        hh.ebbg[168] = -1604616820;
        hh.ebbg[169] = -1215376101;
        hh.ebbg[170] = 224791061;
        hh.ebbg[171] = -995967566;
        hh.ebbg[172] = -463124188;
        hh.ebbg[173] = -1344671401;
        hh.ebbg[174] = 45529665;
        hh.ebbg[175] = -120902353;
        hh.ebbg[176] = 2095960962;
        hh.ebbg[177] = 1270750668;
        hh.ebbg[178] = 528445307;
        hh.ebbg[179] = 499103595;
        hh.ebbg[180] = 142878817;
        hh.ebbg[181] = 2070960253;
        hh.ebbg[182] = 1771463609;
        hh.ebbg[183] = 1311059746;
        hh.ebbg[184] = -1257096635;
        hh.ebbg[185] = 2103844232;
        hh.ebbg[186] = -858093766;
        hh.ebbg[187] = -1188629905;
        hh.ebbg[188] = 703048280;
        hh.ebbg[189] = 2138533404;
        hh.ebbg[190] = -1196874735;
        hh.ebbg[191] = -1166705814;
        hh.ebbg[192] = -1138503478;
        hh.ebbg[193] = 1773224882;
        hh.ebbg[194] = 328202463;
        hh.ebbg[195] = -307288349;
        hh.ebbg[196] = 1706945867;
        hh.ebbg[197] = -519488309;
        hh.ebbg[198] = -1795455320;
        hh.ebbg[199] = 521556319;
    }

    private static /* synthetic */ void efns() {
        hh.ebbg[300] = 665387961;
        hh.ebbg[301] = -1804378564;
        hh.ebbg[302] = -894802707;
        hh.ebbg[303] = 602478231;
        hh.ebbg[304] = -920444694;
        hh.ebbg[305] = -2003139914;
        hh.ebbg[306] = 412765913;
        hh.ebbg[307] = 1548186362;
        hh.ebbg[308] = 1239695766;
        hh.ebbg[309] = -583409778;
        hh.ebbg[310] = 1650178922;
        hh.ebbg[311] = -295763138;
        hh.ebbg[312] = 2076211495;
        hh.ebbg[313] = -1221375748;
        hh.ebbg[314] = -1904419670;
        hh.ebbg[315] = 367963439;
        hh.ebbg[316] = 316704469;
        hh.ebbg[317] = -969009895;
        hh.ebbg[318] = 788055602;
        hh.ebbg[319] = -1241191023;
        hh.ebbg[320] = 1129928041;
        hh.ebbg[321] = 1416362679;
        hh.ebbg[322] = 890711751;
        hh.ebbg[323] = -250648322;
        hh.ebbg[324] = 1159050218;
        hh.ebbg[325] = -854465549;
        hh.ebbg[326] = -646360042;
        hh.ebbg[327] = 231780338;
        hh.ebbg[328] = -1250363106;
        hh.ebbg[329] = 320823992;
        hh.ebbg[330] = 145820863;
        hh.ebbg[331] = 297286902;
        hh.ebbg[332] = 477229405;
        hh.ebbg[333] = -907241656;
        hh.ebbg[334] = -1936518025;
        hh.ebbg[335] = 1891589958;
        hh.ebbg[336] = -813031838;
        hh.ebbg[337] = 1702942082;
        hh.ebbg[338] = -982089224;
        hh.ebbg[339] = 1180150707;
        hh.ebbg[340] = 856203365;
        hh.ebbg[341] = 2051529315;
        hh.ebbg[342] = 908142649;
        hh.ebbg[343] = -61532214;
        hh.ebbg[344] = 1563565160;
        hh.ebbg[345] = -710519346;
        hh.ebbg[346] = 1736201951;
        hh.ebbg[347] = -1497619658;
        hh.ebbg[348] = 1181758417;
        hh.ebbg[349] = 145149071;
        hh.ebbg[350] = 451980787;
        hh.ebbg[351] = 922661730;
        hh.ebbg[352] = -88055496;
        hh.ebbg[353] = 2047088285;
        hh.ebbg[354] = -989923116;
        hh.ebbg[355] = 1958249826;
        hh.ebbg[356] = -2039263614;
        hh.ebbg[357] = -848888417;
        hh.ebbg[358] = 2023179374;
        hh.ebbg[359] = -5875181;
        hh.ebbg[360] = -951912402;
        hh.ebbg[361] = 922795953;
        hh.ebbg[362] = -1537789458;
        hh.ebbg[363] = -184255897;
        hh.ebbg[364] = 154493049;
        hh.ebbg[365] = -1340227055;
        hh.ebbg[366] = -2134658147;
        hh.ebbg[367] = 556121225;
        hh.ebbg[368] = 839334066;
        hh.ebbg[369] = -1309821304;
        hh.ebbg[370] = 1722928729;
        hh.ebbg[371] = 609187564;
        hh.ebbg[372] = 875745053;
        hh.ebbg[373] = 1968002989;
        hh.ebbg[374] = -280289105;
        hh.ebbg[375] = 783506792;
        hh.ebbg[376] = -1072748046;
        hh.ebbg[377] = 2081014898;
        hh.ebbg[378] = -44058483;
        hh.ebbg[379] = -30371497;
        hh.ebbg[380] = -672737501;
        hh.ebbg[381] = 1188331605;
        hh.ebbg[382] = -1871318934;
        hh.ebbg[383] = -1726202627;
        hh.ebbg[384] = -584246550;
        hh.ebbg[385] = -560191995;
        hh.ebbg[386] = -1667595679;
        hh.ebbg[387] = 432160318;
        hh.ebbg[388] = -328990323;
        hh.ebbg[389] = -1459681748;
        hh.ebbg[390] = 1097667193;
        hh.ebbg[391] = 1041390688;
        hh.ebbg[392] = -1455538154;
        hh.ebbg[393] = 1590639662;
        hh.ebbg[394] = -2035444424;
        hh.ebbg[395] = 2044997439;
        hh.ebbg[396] = 773767107;
        hh.ebbg[397] = 1017660974;
        hh.ebbg[398] = 595304805;
        hh.ebbg[399] = 1247224491;
    }

    private static /* synthetic */ void efnw() {
        hh.ebbg[700] = -978609560;
        hh.ebbg[701] = -707800776;
        hh.ebbg[702] = 1920227308;
        hh.ebbg[703] = -1580594334;
        hh.ebbg[704] = -842861488;
        hh.ebbg[705] = 146832476;
        hh.ebbg[706] = 876034825;
        hh.ebbg[707] = -259673162;
        hh.ebbg[708] = 666421788;
        hh.ebbg[709] = -1571251753;
        hh.ebbg[710] = 1330798332;
        hh.ebbg[711] = -1243761916;
        hh.ebbg[712] = -1216421769;
        hh.ebbg[713] = -561523468;
        hh.ebbg[714] = 259028907;
        hh.ebbg[715] = -573764459;
        hh.ebbg[716] = 1421432690;
        hh.ebbg[717] = 907849903;
        hh.ebbg[718] = -110176579;
        hh.ebbg[719] = -881340700;
        hh.ebbg[720] = -2075095848;
        hh.ebbg[721] = -1715833893;
        hh.ebbg[722] = 1948513538;
        hh.ebbg[723] = 25064761;
        hh.ebbg[724] = 1376987903;
        hh.ebbg[725] = -1985154629;
        hh.ebbg[726] = 849370600;
        hh.ebbg[727] = -859752530;
        hh.ebbg[728] = 252089072;
        hh.ebbg[729] = 1781416194;
        hh.ebbg[730] = 224732148;
        hh.ebbg[731] = 271446200;
        hh.ebbg[732] = -1475676308;
        hh.ebbg[733] = -64040281;
        hh.ebbg[734] = -527396445;
        hh.ebbg[735] = -2001482261;
        hh.ebbg[736] = -1858862744;
        hh.ebbg[737] = -830674505;
        hh.ebbg[738] = -1795183071;
        hh.ebbg[739] = -1128407420;
        hh.ebbg[740] = -1695163803;
        hh.ebbg[741] = 729549181;
        hh.ebbg[742] = -825690895;
        hh.ebbg[743] = -753813824;
        hh.ebbg[744] = 1804761394;
        hh.ebbg[745] = 1472871259;
        hh.ebbg[746] = 340162453;
        hh.ebbg[747] = -2060944341;
        hh.ebbg[748] = 318087076;
        hh.ebbg[749] = -961222911;
        hh.ebbg[750] = 615811385;
        hh.ebbg[751] = 1462773180;
        hh.ebbg[752] = -710889651;
        hh.ebbg[753] = 1555660598;
        hh.ebbg[754] = 551773739;
        hh.ebbg[755] = 2131886137;
        hh.ebbg[756] = 697491474;
        hh.ebbg[757] = 1742583512;
        hh.ebbg[758] = -535339381;
        hh.ebbg[759] = -773357023;
        hh.ebbg[760] = -978028482;
        hh.ebbg[761] = -625219403;
        hh.ebbg[762] = 411017881;
        hh.ebbg[763] = -1728933152;
        hh.ebbg[764] = 1263848407;
        hh.ebbg[765] = -1360464611;
        hh.ebbg[766] = 1936839328;
        hh.ebbg[767] = 1733657232;
        hh.ebbg[768] = 1217752801;
        hh.ebbg[769] = -1005912170;
        hh.ebbg[770] = -1886020429;
        hh.ebbg[771] = -1070503435;
        hh.ebbg[772] = 1845600792;
        hh.ebbg[773] = 966195102;
        hh.ebbg[774] = -1639489546;
        hh.ebbg[775] = -258348631;
        hh.ebbg[776] = -1091839709;
        hh.ebbg[777] = 826054816;
        hh.ebbg[778] = 2008386837;
        hh.ebbg[779] = 956251700;
        hh.ebbg[780] = 73206983;
        hh.ebbg[781] = 964448283;
        hh.ebbg[782] = 980601078;
        hh.ebbg[783] = -208494267;
        hh.ebbg[784] = -193259810;
        hh.ebbg[785] = -1059781561;
        hh.ebbg[786] = 1900507192;
        hh.ebbg[787] = 401090605;
        hh.ebbg[788] = 43889803;
        hh.ebbg[789] = -482463477;
        hh.ebbg[790] = -271911672;
        hh.ebbg[791] = -1996869622;
        hh.ebbg[792] = -1826887282;
        hh.ebbg[793] = 1766369988;
        hh.ebbg[794] = 1728242830;
        hh.ebbg[795] = 233316638;
        hh.ebbg[796] = -1528727153;
        hh.ebbg[797] = 1878027318;
        hh.ebbg[798] = -1566491874;
        hh.ebbg[799] = 103963178;
    }
}

