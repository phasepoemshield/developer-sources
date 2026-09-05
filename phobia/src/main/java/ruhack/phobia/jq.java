/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1306
 *  net.minecraft.class_1747
 *  net.minecraft.class_1755
 *  net.minecraft.class_1764
 *  net.minecraft.class_1787
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1806
 *  net.minecraft.class_1835
 *  net.minecraft.class_1839
 *  net.minecraft.class_2389
 *  net.minecraft.class_3481
 *  net.minecraft.class_3489
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_742
 *  net.minecraft.class_7833
 *  net.minecraft.class_7923
 *  org.joml.Quaternionfc
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Supplier;
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1747;
import net.minecraft.class_1755;
import net.minecraft.class_1764;
import net.minecraft.class_1787;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1806;
import net.minecraft.class_1835;
import net.minecraft.class_1839;
import net.minecraft.class_2389;
import net.minecraft.class_3481;
import net.minecraft.class_3489;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_742;
import net.minecraft.class_7833;
import net.minecraft.class_7923;
import org.joml.Quaternionfc;
import ruhack.phobia.aw;
import ruhack.phobia.ax;
import ruhack.phobia.cc;
import ruhack.phobia.cd;
import ruhack.phobia.dd;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.hn;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.nj;

public class jq
extends ds {
    private float holdVerticalVelocity;
    private static long[] keqf;
    private static long[] keqg;
    private final kf swingType;
    private float holdPreviousSwing;
    public static final int b;
    private static int[] kenr;
    private float spinAngle;
    private long holdPreviousFrameNanos;
    private final kg holdSmoothness;
    private final kb onlyAura;
    private boolean wasSwinging;
    private final kg swingSpeedSetting;
    private boolean holdAlternateSwing;
    public static final boolean a;
    private final kg holdScale;
    private static int[] kens;
    private boolean holdPhysicsUpdated;
    private float spinBackTimer;
    private final kf holdAttack;
    private float holdVerticalAngle;
    private float holdClimbBlend;
    public static final long sf = 7109513653653320061L;
    private float holdWaterBlend;
    private final kb onlySwing;
    public static final boolean c;
    private final kg hitStrengthSetting;
    private double holdDeltaTime;

    private static /* synthetic */ void kiql() {
        jq.keqf[300] = 690231571792161069L;
        jq.keqf[301] = -8825461171356127785L;
        jq.keqf[302] = 8980660771358862562L;
        jq.keqf[303] = -5331779508642295738L;
        jq.keqf[304] = -5990322472415540175L;
        jq.keqf[305] = 3302391125540935043L;
        jq.keqf[306] = 5068499316932836289L;
        jq.keqf[307] = -2743621447215112921L;
        jq.keqf[308] = -1475558569576320155L;
        jq.keqf[309] = 1605091924008963769L;
        jq.keqf[310] = 8924812173366133824L;
        jq.keqf[311] = -7946636668042554406L;
        jq.keqf[312] = 7252497226858250616L;
        jq.keqf[313] = -1840297627621301948L;
        jq.keqf[314] = 4837015913191846009L;
        jq.keqf[315] = -7556778559618027487L;
        jq.keqf[316] = -2440768188463355871L;
        jq.keqf[317] = 379294426049355257L;
        jq.keqf[318] = 3592893430599799745L;
        jq.keqf[319] = 8286691846675881028L;
        jq.keqf[320] = 2658198222034035659L;
        jq.keqf[321] = -2679330984269495422L;
        jq.keqf[322] = 3816420646724648751L;
        jq.keqf[323] = -397271245744328439L;
        jq.keqf[324] = 4429491577518614812L;
        jq.keqf[325] = 2705114947508059736L;
        jq.keqf[326] = -2447695099478020219L;
        jq.keqf[327] = 4378423741436794373L;
        jq.keqf[328] = -6441589469427690550L;
        jq.keqf[329] = 7648916155833154088L;
        jq.keqf[330] = 1155344631037726836L;
        jq.keqf[331] = -2965503113424694671L;
        jq.keqf[332] = 2584885742765918525L;
        jq.keqf[333] = 4447964071470855350L;
        jq.keqf[334] = -6635605782356107170L;
        jq.keqf[335] = 3266278939522668648L;
        jq.keqf[336] = 8971569737145589648L;
        jq.keqf[337] = 1637968807202668221L;
        jq.keqf[338] = 4349799222117223977L;
        jq.keqf[339] = -2813070729887008661L;
        jq.keqf[340] = 6966329259055642662L;
        jq.keqf[341] = 7690535777654217004L;
        jq.keqf[342] = 5838944822234040246L;
        jq.keqf[343] = 2996184512681744586L;
        jq.keqf[344] = -1334531261168765205L;
        jq.keqf[345] = 3743521713998825649L;
        jq.keqf[346] = -4619750736690793420L;
        jq.keqf[347] = -1473064965668415981L;
        jq.keqf[348] = 805669232807704300L;
        jq.keqf[349] = 4388411324513428053L;
        jq.keqf[350] = 5529914928863466699L;
        jq.keqf[351] = -5398929998064344749L;
        jq.keqf[352] = 4682703085160761625L;
        jq.keqf[353] = 6796611399821724477L;
        jq.keqf[354] = 7518079090836193931L;
        jq.keqf[355] = 2116484251582708342L;
        jq.keqf[356] = 7413227991917180537L;
        jq.keqf[357] = -4490402972555414135L;
        jq.keqf[358] = -2288702464728725810L;
        jq.keqf[359] = -8998156317015794163L;
        jq.keqf[360] = -1021704964195843773L;
        jq.keqf[361] = 2311073230246271698L;
        jq.keqf[362] = -4550218884817847629L;
        jq.keqf[363] = -5434028384714162556L;
        jq.keqf[364] = -6982475563773509975L;
        jq.keqf[365] = 8396128498205773990L;
        jq.keqf[366] = -1015821128154955143L;
        jq.keqf[367] = 3467409400473307590L;
        jq.keqf[368] = -4561402862208338278L;
        jq.keqf[369] = -7025249546092400732L;
        jq.keqf[370] = -7114055801054203135L;
        jq.keqf[371] = 2824713312550537922L;
        jq.keqf[372] = 3382748550952517134L;
        jq.keqf[373] = -7758460292039059266L;
        jq.keqf[374] = 3859746605267825883L;
        jq.keqf[375] = -8728688145322762852L;
        jq.keqf[376] = -1026285330168252520L;
        jq.keqf[377] = -4695944955778633685L;
        jq.keqf[378] = 3841575289563630390L;
        jq.keqf[379] = -2816739937647591294L;
        jq.keqf[380] = 6153635352533938986L;
        jq.keqf[381] = -4758522231156793466L;
        jq.keqf[382] = 2511175619409244346L;
        jq.keqf[383] = -5244503655891806764L;
        jq.keqf[384] = -6893788565555567477L;
        jq.keqf[385] = -3620460635895222466L;
        jq.keqf[386] = 6137842791564133386L;
        jq.keqf[387] = -6392541265434899293L;
        jq.keqf[388] = 9091354514337050667L;
        jq.keqf[389] = -8888531700980547105L;
        jq.keqf[390] = -6194266910301848105L;
        jq.keqf[391] = -2768645914065675379L;
        jq.keqf[392] = 8079228773127778145L;
        jq.keqf[393] = -887060243275633206L;
        jq.keqf[394] = 7277377293631203456L;
        jq.keqf[395] = 3115180603767177131L;
        jq.keqf[396] = 5584379138054705653L;
        jq.keqf[397] = 3659995188152145018L;
        jq.keqf[398] = -8610273137128398822L;
        jq.keqf[399] = 8811608650314394469L;
    }

    private static /* synthetic */ void kiow() {
        jq.kens[1500] = 618930269;
        jq.kens[1501] = -2049004891;
        jq.kens[1502] = 7479682;
        jq.kens[1503] = -514811501;
        jq.kens[1504] = 2053832396;
        jq.kens[1505] = 2108275771;
        jq.kens[1506] = -1625893836;
        jq.kens[1507] = -683722567;
        jq.kens[1508] = -100577068;
        jq.kens[1509] = 1957322083;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public jq() {
        var2_1 /* !! */  = jq.b;
        super("SwingAnimation", "\u0414\u043e\u0431\u0430\u0432\u043b\u044f\u0435\u0442 \u0430\u043d\u0438\u043c\u0430\u0446\u0438\u044e \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432 \u0432 \u0440\u0443\u043a\u0435", du.RENDER);
        this.swingType = new kf("\u0422\u0438\u043f \u0432\u0437\u043c\u0430\u0445\u0430", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0442\u0438\u043f \u0432\u0437\u043c\u0430\u0445\u0430", "Chop", new String[]{"Chop", "Swipe", "Down", "Smooth", "Smooth 2", "Power", "Feast", "Twist", "Default"});
        this.hitStrengthSetting = new kg("\u0421\u0438\u043b\u0430 \u0432\u0437\u043c\u0430\u0445\u0430", "\u0421\u0438\u043b\u0430 \u0430\u043d\u0438\u043c\u0430\u0446\u0438\u0438 \u0432\u0437\u043c\u0430\u0445\u0430", 1.0f).range((float)jq.kent("kenu", kenp(int ), (int)0), (float)jq.kent("kenv", kenp(int ), (int)1)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$0(), ()Ljava/lang/Boolean;)((jq)this));
        this.swingSpeedSetting = new kg("\u0414\u043b\u0438\u0442\u0435\u043b\u044c\u043d\u043e\u0441\u0442\u044c \u0432\u0437\u043c\u0430\u0445\u0430", "\u0414\u043b\u0438\u0442\u0435\u043b\u044c\u043d\u043e\u0441\u0442\u044c \u0430\u043d\u0438\u043c\u0430\u0446\u0438\u0438 \u0443\u0434\u0430\u0440\u0430", 1.0f).range((float)jq.kent("keny", kenp(int ), (int)2), (float)jq.kent("kenz", kenp(int ), (int)3)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$1(), ()Ljava/lang/Boolean;)((jq)this));
        this.onlySwing = new kb("\u0422\u043e\u043b\u044c\u043a\u043e \u043f\u0440\u0438 \u0432\u0437\u043c\u0430\u0445\u0435", "\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u0430\u043d\u0438\u043c\u0430\u0446\u0438\u044e \u0442\u043e\u043b\u044c\u043a\u043e \u043f\u0440\u0438 \u0432\u0437\u043c\u0430\u0445\u0435").setValue((boolean)jq.kent("keoc", keoa(int ), (int)4)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$2(), ()Ljava/lang/Boolean;)((jq)this));
        this.onlyAura = new kb("\u0422\u043e\u043b\u044c\u043a\u043e \u043f\u0440\u0438 \u0432\u043a\u043b\u044e\u0447\u0435\u043d\u043d\u043e\u0439 \u041a\u0438\u043b\u043b\u0410\u0443\u0440\u0435", "\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u0430\u043d\u0438\u043c\u0430\u0446\u0438\u044e \u0442\u043e\u043b\u044c\u043a\u043e \u043f\u0440\u0438 \u0432\u043a\u043b\u044e\u0447\u0435\u043d\u043d\u043e\u0439 \u043a\u0438\u043b\u043b\u0430\u0443\u0440\u0435").setValue((boolean)jq.kent("keod", keoa(int ), (int)5)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$3(), ()Ljava/lang/Boolean;)((jq)this));
        this.holdAttack = new kf("3D \u0410\u0442\u0430\u043a\u0430", "\u0421\u0442\u0438\u043b\u044c \u0430\u0442\u0430\u043a\u0438 HoldMyItems", "\u0412\u0437\u043c\u0430\u0445", new String[]{"\u0412\u0437\u043c\u0430\u0445", "\u0412\u043f\u0435\u0440\u0451\u0434", "\u041e\u0431\u044b\u0447\u043d\u0430\u044f", "New"}).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, isHoldMyItems(), ()Ljava/lang/Boolean;)((jq)this));
        this.holdSmoothness = new kg("3D \u041f\u043b\u0430\u0432\u043d\u043e\u0441\u0442\u044c", "\u041f\u043b\u0430\u0432\u043d\u043e\u0441\u0442\u044c \u0444\u0438\u0437\u0438\u043a\u0438 HoldMyItems", (float)jq.kent("keoe", kenp(int ), (int)6)).range((float)jq.kent("keof", kenp(int ), (int)7), (float)jq.kent("keoh", kenp(int ), (int)8)).step(1.0f).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$4(), ()Ljava/lang/Boolean;)((jq)this));
        this.holdScale = new kg("3D \u041c\u0430\u0441\u0448\u0442\u0430\u0431", "\u041c\u0430\u0441\u0448\u0442\u0430\u0431 \u0440\u0443\u043a HoldMyItems", (float)jq.kent("keoj", kenp(int ), (int)9)).range((float)jq.kent("keol", kenp(int ), (int)10), (float)jq.kent("keom", kenp(int ), (int)11)).step((float)jq.kent("keoo", kenp(int ), (int)12)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$5(), ()Ljava/lang/Boolean;)((jq)this));
        this.spinAngle = 0.0f;
        this.spinBackTimer = 0.0f;
        this.wasSwinging = jq.kent("keor", keoa(int ), (int)13);
        this.holdPreviousFrameNanos = System.nanoTime();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.swingType.getList().add("HoldMyItems");
                this.settings(new jx[]{this.swingType, this.hitStrengthSetting, this.swingSpeedSetting, this.onlySwing, this.onlyAura, this.holdAttack, this.holdSmoothness, this.holdScale});
                return;
            }
lbl22:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)jq.kent("keoy", keoa(int ), (int)14);
                    ** GOTO lbl33
                    break;
                }
            }
lbl26:
            // 3 sources

            case 1: {
                var2_1 /* !! */  = (int)jq.kent("kepa", keoa(int ), (int)15);
                ** GOTO lbl49
            }
lbl29:
            // 3 sources

            case 2: {
                while (true) {
                    var2_1 /* !! */  = (int)jq.kent("kepc", keoa(int ), (int)16);
                }
            }
lbl33:
            // 4 sources

            case 3: {
                var2_1 /* !! */  = (int)jq.kent("kepd", keoa(int ), (int)17);
                ** GOTO lbl29
            }
            case 4: {
                var2_1 /* !! */  = (int)jq.kent("kepf", keoa(int ), (int)18);
                ** GOTO lbl26
            }
            case 5: {
                var2_1 /* !! */  = (int)jq.kent("keph", keoa(int ), (int)19);
                ** GOTO lbl33
            }
            case 6: {
                while (true) {
                    var2_1 /* !! */  = (int)jq.kent("kepi", keoa(int ), (int)20);
                }
            }
            case 7: {
                var2_1 /* !! */  = (int)jq.kent("kepk", keoa(int ), (int)21);
                break;
            }
lbl49:
            // 2 sources

            case 8: {
                var2_1 /* !! */  = (int)jq.kent("kepm", keoa(int ), (int)22);
                ** GOTO lbl55
            }
            case 9: {
                var2_1 /* !! */  = (int)jq.kent("kepn", keoa(int ), (int)23);
                ** GOTO lbl67
            }
lbl55:
            // 2 sources

            case 10: {
                var2_1 /* !! */  = (int)jq.kent("kepp", keoa(int ), (int)24);
                ** GOTO lbl33
            }
            case 11: {
                var2_1 /* !! */  = (int)jq.kent("kepr", keoa(int ), (int)25);
                ** GOTO lbl29
            }
            case 12: {
                var2_1 /* !! */  = (int)jq.kent("keps", keoa(int ), (int)26);
                ** GOTO lbl22
            }
            case 13: {
                var2_1 /* !! */  = (int)jq.kent("kepu", keoa(int ), (int)27);
                ** GOTO lbl22
            }
lbl67:
            // 3 sources

            case 14: {
                var2_1 /* !! */  = (int)jq.kent("kepw", keoa(int ), (int)28);
                ** GOTO lbl26
            }
            case 15: {
                var2_1 /* !! */  = (int)jq.kent("kepx", keoa(int ), (int)29);
                ** GOTO lbl67
            }
            case 16: 
        }
        var2_1 /* !! */  = (int)jq.kent("kepz", keoa(int ), (int)30);
        ** while (true)
    }

    private static /* synthetic */ void kilj() {
        jq.kenr[1100] = 378034037;
        jq.kenr[1101] = 173343320;
        jq.kenr[1102] = -1032175171;
        jq.kenr[1103] = 2011495846;
        jq.kenr[1104] = 1686734089;
        jq.kenr[1105] = 1546326365;
        jq.kenr[1106] = 987557881;
        jq.kenr[1107] = -59224994;
        jq.kenr[1108] = -832537233;
        jq.kenr[1109] = 717722330;
        jq.kenr[1110] = 1891900331;
        jq.kenr[1111] = -1993085847;
        jq.kenr[1112] = -849706462;
        jq.kenr[1113] = 815387643;
        jq.kenr[1114] = -121783193;
        jq.kenr[1115] = 394287668;
        jq.kenr[1116] = -1630747274;
        jq.kenr[1117] = -2016843326;
        jq.kenr[1118] = 1060671782;
        jq.kenr[1119] = 1196010251;
        jq.kenr[1120] = -811197687;
        jq.kenr[1121] = 833125829;
        jq.kenr[1122] = -625768446;
        jq.kenr[1123] = 1435250317;
        jq.kenr[1124] = 682932029;
        jq.kenr[1125] = 1430330098;
        jq.kenr[1126] = -412547502;
        jq.kenr[1127] = -171640849;
        jq.kenr[1128] = -756317886;
        jq.kenr[1129] = -291973542;
        jq.kenr[1130] = -997317352;
        jq.kenr[1131] = -89575808;
        jq.kenr[1132] = -459079144;
        jq.kenr[1133] = 869383243;
        jq.kenr[1134] = 168890697;
        jq.kenr[1135] = -2068671385;
        jq.kenr[1136] = -411531056;
        jq.kenr[1137] = -2031932385;
        jq.kenr[1138] = 1184201928;
        jq.kenr[1139] = 280489551;
        jq.kenr[1140] = -2023164068;
        jq.kenr[1141] = -361526527;
        jq.kenr[1142] = 1672408864;
        jq.kenr[1143] = -645919682;
        jq.kenr[1144] = -1364283071;
        jq.kenr[1145] = -312821057;
        jq.kenr[1146] = 904538616;
        jq.kenr[1147] = 1305073728;
        jq.kenr[1148] = 1822016404;
        jq.kenr[1149] = 1249928644;
        jq.kenr[1150] = -1395936129;
        jq.kenr[1151] = 1228309806;
        jq.kenr[1152] = -1939430820;
        jq.kenr[1153] = 57195865;
        jq.kenr[1154] = 584406012;
        jq.kenr[1155] = -1724217408;
        jq.kenr[1156] = 907264980;
        jq.kenr[1157] = -930127454;
        jq.kenr[1158] = 359994376;
        jq.kenr[1159] = -1719272048;
        jq.kenr[1160] = -927075036;
        jq.kenr[1161] = 561067310;
        jq.kenr[1162] = 885496745;
        jq.kenr[1163] = 83491959;
        jq.kenr[1164] = 1633828908;
        jq.kenr[1165] = -305852902;
        jq.kenr[1166] = 766723235;
        jq.kenr[1167] = 600291068;
        jq.kenr[1168] = -1929354421;
        jq.kenr[1169] = 841351899;
        jq.kenr[1170] = 1576835125;
        jq.kenr[1171] = -1935832710;
        jq.kenr[1172] = 265771254;
        jq.kenr[1173] = 1887981499;
        jq.kenr[1174] = -430231568;
        jq.kenr[1175] = 517928081;
        jq.kenr[1176] = -1062456024;
        jq.kenr[1177] = -993337752;
        jq.kenr[1178] = 1102612777;
        jq.kenr[1179] = -1545074251;
        jq.kenr[1180] = -1404830360;
        jq.kenr[1181] = -1018757196;
        jq.kenr[1182] = -205056408;
        jq.kenr[1183] = -1152998046;
        jq.kenr[1184] = 493023036;
        jq.kenr[1185] = 1242651779;
        jq.kenr[1186] = -1012089039;
        jq.kenr[1187] = 1682060265;
        jq.kenr[1188] = 1232543822;
        jq.kenr[1189] = -1489859328;
        jq.kenr[1190] = -364124136;
        jq.kenr[1191] = -153512619;
        jq.kenr[1192] = 1900517836;
        jq.kenr[1193] = -1698405698;
        jq.kenr[1194] = -2090793347;
        jq.kenr[1195] = -1827518923;
        jq.kenr[1196] = -1984777199;
        jq.kenr[1197] = 579872335;
        jq.kenr[1198] = -611767187;
        jq.kenr[1199] = -1667757365;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void applyHoldMyItemsItem(class_4587 var1_1, class_742 var2_2, class_1268 var3_3, class_1799 var4_4, float var5_5) {
        block294: {
            block293: {
                block288: {
                    block290: {
                        block292: {
                            block291: {
                                block289: {
                                    block285: {
                                        block287: {
                                            block286: {
                                                block284: {
                                                    block283: {
                                                        block282: {
                                                            block281: {
                                                                block280: {
                                                                    block279: {
                                                                        var13_6 = jq.c;
                                                                        var12_7 /* !! */  = jq.b;
                                                                        var11_8 = jq.a;
                                                                        if (var13_6) {
                                                                            throw null;
lbl6:
                                                                            // 75 sources

                                                                            return;
                                                                        }
                                                                        if (var11_8 || var11_8) ** GOTO lbl6
                                                                        if (var3_3 != class_1268.field_5808) break block279;
                                                                        if (var11_8) ** GOTO lbl6
                                                                        v0 = var2_2.method_6068();
                                                                        if (var13_6) {
                                                                            throw null;
                                                                        }
                                                                        break block280;
                                                                    }
                                                                    if (var11_8 || var11_8) ** GOTO lbl6
                                                                    v0 = var6_9 = var2_2.method_6068().method_5928();
                                                                }
                                                                if (var11_8 || var11_8) ** GOTO lbl6
                                                                if (var6_9 != class_1306.field_6183) break block281;
                                                                if (var11_8) ** GOTO lbl6
                                                                v1 = jq.kent("kfzv", keoa(int ), (int)578);
                                                                if (var13_6) {
                                                                    throw null;
                                                                }
                                                                break block282;
                                                            }
                                                            if (var11_8 || var11_8) ** GOTO lbl6
                                                            v1 = var7_10 = jq.kent("kfzw", keoa(int ), (int)579);
                                                        }
                                                        if (var11_8 || var11_8) ** GOTO lbl6
                                                        if (var3_3 != class_1268.field_5808) break block283;
                                                        if (var11_8) ** GOTO lbl6
                                                        v2 = jq.kent("kfzx", keoa(int ), (int)580);
                                                        if (var13_6) {
                                                            throw null;
                                                        }
                                                        break block284;
                                                    }
                                                    if (var11_8 || var11_8) ** GOTO lbl6
                                                    v2 = var8_11 = jq.kent("kfzy", keoa(int ), (int)581);
                                                }
                                                if (var11_8 || var11_8) ** GOTO lbl6
                                                if (var2_2.method_6068() != class_1306.field_6182) break block285;
                                                if (var11_8) ** GOTO lbl6
                                                if (var8_11 != false) break block286;
                                                if (var11_8) ** GOTO lbl6
                                                v3 = jq.kent("kfzz", keoa(int ), (int)582);
                                                if (var13_6) {
                                                    throw null;
                                                }
                                                break block287;
                                            }
                                            if (var11_8 || var11_8) ** GOTO lbl6
                                            v3 = var8_11 = jq.kent("kgaa", keoa(int ), (int)583);
                                        }
                                        if (var11_8) ** GOTO lbl6
                                    }
                                    if (var11_8 || var11_8) ** GOTO lbl6
                                    var1_1.method_46416((float)(jq.kent("kgab", kenp(int ), (int)584) * (float)var7_10), (float)jq.kent("kgac", kenp(int ), (int)585), (float)jq.kent("kgad", kenp(int ), (int)586));
                                    if (var11_8 || var11_8) ** GOTO lbl6
                                    var1_1.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees((float)(jq.kent("kgae", kenp(int ), (int)587) * (float)var7_10)));
                                    if (var11_8 || var11_8) ** GOTO lbl6
                                    var1_1.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees((float)jq.kent("kgaf", kenp(int ), (int)588)));
                                    if (var11_8 || var11_8) ** GOTO lbl6
                                    var10_12 = var4_4.method_7909();
                                    if (var11_8) ** GOTO lbl6
                                    if (!(var10_12 instanceof class_1747)) break block288;
                                    if (var11_8) ** GOTO lbl6
                                    var9_13 = (class_1747)var10_12;
                                    if (var11_8 || var11_8) ** GOTO lbl6
                                    if (var4_4.method_7909() instanceof class_1755) break block288;
                                    if (var11_8) ** GOTO lbl6
                                    if (var4_4.method_7976() == class_1839.field_8950) break block288;
                                    if (var11_8 || var11_8) ** GOTO lbl6
                                    if (!this.isTorch(var4_4)) break block289;
                                    if (var11_8 || var11_8) ** GOTO lbl6
                                    var1_1.method_22905((float)jq.kent("kgag", kenp(int ), (int)589), (float)jq.kent("kgah", kenp(int ), (int)590), (float)jq.kent("kgai", kenp(int ), (int)591));
                                    if (var11_8 || var11_8) ** GOTO lbl6
                                    this.blockPose(var1_1, (int)var7_10, (float)jq.kent("kgaj", kenp(int ), (int)592));
                                    if (var11_8) ** GOTO lbl6
                                    if (var13_6) {
                                        throw null;
                                    }
                                    break block290;
                                }
                                if (var11_8 || var11_8) ** GOTO lbl6
                                if (!this.isThinBlock(var9_13, var4_4)) break block291;
                                if (var11_8 || var11_8) ** GOTO lbl6
                                var1_1.method_46416(0.0f, 0.0f, (float)jq.kent("kgak", kenp(int ), (int)593));
                                if (var11_8 || var11_8) ** GOTO lbl6
                                var1_1.method_22907((Quaternionfc)class_7833.field_40715.rotationDegrees((float)(jq.kent("kgal", kenp(int ), (int)594) * (float)var7_10)));
                                if (var11_8 || var11_8) ** GOTO lbl6
                                var1_1.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees((float)jq.kent("kgam", kenp(int ), (int)595)));
                                if (var11_8 || var11_8) ** GOTO lbl6
                                var1_1.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees((float)(jq.kent("kgan", kenp(int ), (int)596) * (float)var7_10)));
                                if (var11_8) ** GOTO lbl6
                                if (var13_6) {
                                    throw null;
                                }
                                break block290;
                            }
                            if (var11_8 || var11_8) ** GOTO lbl6
                            if (!this.isLantern(var4_4)) break block292;
                            if (var11_8 || var11_8) ** GOTO lbl6
                            var1_1.method_46416(0.0f, 0.0f, (float)jq.kent("kgao", kenp(int ), (int)597));
                            if (var11_8 || var11_8) ** GOTO lbl6
                            var1_1.method_22907((Quaternionfc)class_7833.field_40715.rotationDegrees((float)(jq.kent("kgap", kenp(int ), (int)598) * (float)var7_10)));
                            if (var11_8 || var11_8) ** GOTO lbl6
                            var1_1.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees((float)jq.kent("kgaq", kenp(int ), (int)599)));
                            if (var11_8 || var11_8) ** GOTO lbl6
                            var1_1.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees((float)(jq.kent("kgar", kenp(int ), (int)600) * (float)var7_10)));
                            if (var11_8 || var11_8) ** GOTO lbl6
                            var1_1.method_46416((float)(jq.kent("kgas", kenp(int ), (int)601) * (float)var7_10), (float)jq.kent("kgat", kenp(int ), (int)602), 0.0f);
                            if (var11_8 || var11_8) ** GOTO lbl6
                            var1_1.method_22905((float)jq.kent("kgau", kenp(int ), (int)603), (float)jq.kent("kgav", kenp(int ), (int)604), (float)jq.kent("kgaw", kenp(int ), (int)605));
                            if (var11_8) ** GOTO lbl6
                            if (var13_6) {
                                throw null;
                            }
                            break block290;
                        }
                        if (var11_8 || var11_8) ** GOTO lbl6
                        this.blockPose(var1_1, (int)var7_10, (float)jq.kent("kgax", kenp(int ), (int)606));
                        if (var11_8) ** GOTO lbl6
                    }
                    if (var11_8 || var11_8) ** GOTO lbl6
                    return;
                }
                if (var11_8 || var11_8) ** GOTO lbl6
                if (!this.isSmallItem(var4_4)) break block293;
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_22907((Quaternionfc)class_7833.field_40715.rotationDegrees((float)(jq.kent("kgay", kenp(int ), (int)607) * (float)var7_10)));
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees((float)jq.kent("kgaz", kenp(int ), (int)608)));
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees((float)(jq.kent("kgba", kenp(int ), (int)609) * (float)var7_10)));
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_46416(0.0f, (float)jq.kent("kgbb", kenp(int ), (int)610), (float)jq.kent("kgbc", kenp(int ), (int)611));
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_22905((float)jq.kent("kgbd", kenp(int ), (int)612), (float)jq.kent("kgbe", kenp(int ), (int)613), (float)jq.kent("kgbf", kenp(int ), (int)614));
                if (var11_8 || var11_8) ** GOTO lbl6
                return;
            }
            if (var11_8 || var11_8) ** GOTO lbl6
            if (var4_4.method_7976() != class_1839.field_8949) break block294;
            if (var11_8 || var11_8) ** GOTO lbl6
            var1_1.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees((float)(jq.kent("kgbg", kenp(int ), (int)615) * (float)var7_10)));
            if (var11_8 || var11_8) ** GOTO lbl6
            var1_1.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees((float)(jq.kent("kgbh", kenp(int ), (int)616) * (float)var7_10)));
            if (var11_8 || var11_8) ** GOTO lbl6
            var1_1.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees((float)jq.kent("kgbi", kenp(int ), (int)617)));
            if (var11_8 || var11_8) ** GOTO lbl6
            var1_1.method_22905((float)jq.kent("kgbj", kenp(int ), (int)618), (float)jq.kent("kgbk", kenp(int ), (int)619), (float)jq.kent("kgbl", kenp(int ), (int)620));
            if (var11_8 || var11_8) ** GOTO lbl6
            v4 = jq.kent("kgbm", kenp(int ), (int)621) * (float)var7_10;
            if (var8_11 != false) {
                v5 = jq.kent("kgbn", kenp(int ), (int)622);
                if (var13_6) {
                    throw null;
                }
            } else {
                v5 = jq.kent("kgbo", kenp(int ), (int)623);
            }
            if (var8_11 != false) {
                v6 = jq.kent("kgbp", kenp(int ), (int)624);
                if (var13_6) {
                    throw null;
                }
            } else {
                v6 = jq.kent("kgbq", kenp(int ), (int)625);
            }
            var1_1.method_46416((float)v4, (float)v5, (float)v6);
            if (var11_8 || var11_8) ** GOTO lbl6
            var1_1.method_46416((float)(jq.kent("kgbr", kenp(int ), (int)626) * (float)var7_10), 0.0f, (float)jq.kent("kgbs", kenp(int ), (int)627));
            if (var11_8 || var11_8) ** GOTO lbl6
            var1_1.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees((float)(jq.kent("kgbt", kenp(int ), (int)628) * (float)var7_10)));
            if (var11_8 || var11_8) ** GOTO lbl6
            return;
        }
        if (var11_8 || var11_8) ** GOTO lbl6
        if (var4_4.method_7976() != class_1839.field_8951) ** GOTO lbl187
        if (var11_8 || var11_8) ** GOTO lbl6
        var1_1.method_22907((Quaternionfc)class_7833.field_40715.rotationDegrees((float)(jq.kent("kgbu", kenp(int ), (int)629) * (float)var7_10)));
        if (var11_8) ** GOTO lbl6
        if (var12_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var11_8) ** GOTO lbl6
                var1_1.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees((float)jq.kent("kgbv", kenp(int ), (int)630)));
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees((float)(jq.kent("kgbw", kenp(int ), (int)631) * (float)var7_10)));
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_46416((float)(jq.kent("kgbx", kenp(int ), (int)632) * (float)var7_10), 0.0f, 0.0f);
                if (var11_8 || var11_8) ** GOTO lbl6
                return;
            }
lbl187:
            // 1 sources

            if (var11_8 || var11_8) ** GOTO lbl6
            var1_1.method_22907((Quaternionfc)class_7833.field_40715.rotationDegrees((float)(jq.kent("kgby", kenp(int ), (int)633) * (float)var7_10)));
            if (var11_8 || var11_8) ** GOTO lbl6
            var1_1.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees((float)jq.kent("kgca", kenp(int ), (int)634)));
            if (var11_8 || var11_8) ** GOTO lbl6
            var1_1.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees((float)(jq.kent("kgcf", kenp(int ), (int)635) * (float)var7_10)));
            if (var11_8 || var11_8) ** GOTO lbl6
            var1_1.method_22905((float)jq.kent("kgck", kenp(int ), (int)636), (float)jq.kent("kgcm", kenp(int ), (int)637), (float)jq.kent("kgcp", kenp(int ), (int)638));
            if (var11_8 || var11_8) ** GOTO lbl6
            if (var4_4.method_7976() != class_1839.field_8953) ** GOTO lbl202
            if (var11_8) ** GOTO lbl6
            if (var2_2.method_6115()) ** GOTO lbl202
            if (var11_8 || var11_8) ** GOTO lbl6
            var1_1.method_46416((float)(jq.kent("kgcv", kenp(int ), (int)639) * (float)var7_10), (float)jq.kent("kgcw", kenp(int ), (int)640), 0.0f);
            if (var11_8) ** GOTO lbl6
lbl202:
            // 3 sources

            if (!var11_8 && !var11_8) ** break;
            ** continue;
            return;
lbl205:
            // 2 sources

            case 0: {
                var12_7 /* !! */  = (int)jq.kent("kgcy", keoa(int ), (int)641);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl210:
            // 3 sources

            case 1: {
                var12_7 /* !! */  = (int)jq.kent("kgda", keoa(int ), (int)642);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl684
            }
            case 2: {
                var12_7 /* !! */  = (int)jq.kent("kgdc", keoa(int ), (int)643);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl707
            }
lbl220:
            // 3 sources

            case 3: {
                var12_7 /* !! */  = (int)jq.kent("kgde", keoa(int ), (int)644);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl462
            }
lbl225:
            // 3 sources

            case 4: {
                var12_7 /* !! */  = (int)jq.kent("kgdg", keoa(int ), (int)645);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl703
            }
lbl230:
            // 3 sources

            case 5: {
                var12_7 /* !! */  = (int)jq.kent("kgdi", keoa(int ), (int)646);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl319
            }
lbl235:
            // 2 sources

            case 6: {
                var12_7 /* !! */  = (int)jq.kent("kgdk", keoa(int ), (int)647);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl285
            }
            case 7: {
                var12_7 /* !! */  = (int)jq.kent("kgdm", keoa(int ), (int)648);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl750
            }
lbl245:
            // 5 sources

            case 8: {
                var12_7 /* !! */  = (int)jq.kent("kgdo", keoa(int ), (int)649);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl730
            }
lbl250:
            // 2 sources

            case 9: {
                var12_7 /* !! */  = (int)jq.kent("kgdq", keoa(int ), (int)650);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl643
            }
lbl255:
            // 2 sources

            case 10: {
                var12_7 /* !! */  = (int)jq.kent("kgdt", keoa(int ), (int)651);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl684
            }
lbl260:
            // 2 sources

            case 11: {
                var12_7 /* !! */  = (int)jq.kent("kgdv", keoa(int ), (int)652);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl300
            }
lbl265:
            // 2 sources

            case 12: {
                var12_7 /* !! */  = (int)jq.kent("kgdy", keoa(int ), (int)653);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl763
            }
lbl270:
            // 2 sources

            case 13: {
                var12_7 /* !! */  = (int)jq.kent("kgeb", keoa(int ), (int)654);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl407
            }
lbl275:
            // 2 sources

            case 14: {
                var12_7 /* !! */  = (int)jq.kent("kgee", keoa(int ), (int)655);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl324
            }
lbl280:
            // 3 sources

            case 15: {
                var12_7 /* !! */  = (int)jq.kent("kgeg", keoa(int ), (int)656);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl295
            }
lbl285:
            // 3 sources

            case 16: {
                do {
                    var12_7 /* !! */  = (int)jq.kent("kgeh", keoa(int ), (int)657);
                } while (!var13_6);
                throw null;
            }
            case 17: {
                var12_7 /* !! */  = (int)jq.kent("kgei", keoa(int ), (int)658);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl779
            }
lbl295:
            // 3 sources

            case 18: {
                var12_7 /* !! */  = (int)jq.kent("kgej", keoa(int ), (int)659);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl684
            }
lbl300:
            // 3 sources

            case 19: {
                var12_7 /* !! */  = (int)jq.kent("kgek", keoa(int ), (int)660);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl523
            }
lbl305:
            // 3 sources

            case 20: {
                var12_7 /* !! */  = (int)jq.kent("kgel", keoa(int ), (int)661);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl656
            }
            case 21: {
                var12_7 /* !! */  = (int)jq.kent("kgeo", keoa(int ), (int)662);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl807
            }
            case 22: {
                var12_7 /* !! */  = (int)jq.kent("kger", keoa(int ), (int)663);
                if (!var13_6) break;
                throw null;
            }
lbl319:
            // 2 sources

            case 23: {
                var12_7 /* !! */  = (int)jq.kent("kgev", keoa(int ), (int)664);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl362
            }
lbl324:
            // 6 sources

            case 24: {
                var12_7 /* !! */  = (int)jq.kent("kgey", keoa(int ), (int)665);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl812
            }
lbl329:
            // 2 sources

            case 25: {
                var12_7 /* !! */  = (int)jq.kent("kgfa", keoa(int ), (int)666);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl546
            }
            case 26: {
                do {
                    var12_7 /* !! */  = (int)jq.kent("kgfc", keoa(int ), (int)667);
                } while (!var13_6);
                throw null;
            }
            case 27: {
                var12_7 /* !! */  = (int)jq.kent("kgff", keoa(int ), (int)668);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl648
            }
lbl344:
            // 3 sources

            case 28: {
                var12_7 /* !! */  = (int)jq.kent("kgfi", keoa(int ), (int)669);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl755
            }
            case 29: {
                var12_7 /* !! */  = (int)jq.kent("kgfl", keoa(int ), (int)670);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl579
            }
lbl354:
            // 2 sources

            case 30: {
                var12_7 /* !! */  = (int)jq.kent("kgfo", keoa(int ), (int)671);
                if (!var13_6) ** GOTO lbl230
                throw null;
            }
            case 31: {
                var12_7 /* !! */  = (int)jq.kent("kgfr", keoa(int ), (int)672);
                if (!var13_6) ** GOTO lbl344
                throw null;
            }
lbl362:
            // 2 sources

            case 32: {
                var12_7 /* !! */  = (int)jq.kent("kgft", keoa(int ), (int)673);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl425
            }
lbl367:
            // 3 sources

            case 33: {
                var12_7 /* !! */  = (int)jq.kent("kgfw", keoa(int ), (int)674);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl477
            }
lbl372:
            // 2 sources

            case 34: {
                var12_7 /* !! */  = (int)jq.kent("kgfy", keoa(int ), (int)675);
                if (!var13_6) ** GOTO lbl210
                throw null;
            }
            case 35: {
                var12_7 /* !! */  = (int)jq.kent("kgga", keoa(int ), (int)676);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl546
            }
lbl381:
            // 2 sources

            case 36: {
                var12_7 /* !! */  = (int)jq.kent("kggd", keoa(int ), (int)677);
                if (!var13_6) ** GOTO lbl245
                throw null;
            }
lbl385:
            // 3 sources

            case 37: {
                var12_7 /* !! */  = (int)jq.kent("kgge", keoa(int ), (int)678);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl795
            }
lbl390:
            // 2 sources

            case 38: {
                var12_7 /* !! */  = (int)jq.kent("kggf", keoa(int ), (int)679);
                if (!var13_6) ** GOTO lbl354
                throw null;
            }
lbl394:
            // 2 sources

            case 39: {
                var12_7 /* !! */  = (int)jq.kent("kggk", keoa(int ), (int)680);
                if (!var13_6) ** GOTO lbl324
                throw null;
            }
lbl398:
            // 3 sources

            case 40: {
                var12_7 /* !! */  = (int)jq.kent("kggn", keoa(int ), (int)681);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl601
            }
lbl403:
            // 2 sources

            case 41: {
                var12_7 /* !! */  = (int)jq.kent("kggp", keoa(int ), (int)682);
                if (!var13_6) ** GOTO lbl220
                throw null;
            }
lbl407:
            // 2 sources

            case 42: {
                var12_7 /* !! */  = (int)jq.kent("kggt", keoa(int ), (int)683);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl643
            }
            case 43: {
                var12_7 /* !! */  = (int)jq.kent("kggv", keoa(int ), (int)684);
                if (!var13_6) ** GOTO lbl280
                throw null;
            }
lbl416:
            // 2 sources

            case 44: {
                var12_7 /* !! */  = (int)jq.kent("kggz", keoa(int ), (int)685);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl634
            }
            case 45: {
                var12_7 /* !! */  = (int)jq.kent("kghd", keoa(int ), (int)686);
                if (!var13_6) ** GOTO lbl372
                throw null;
            }
lbl425:
            // 3 sources

            case 46: {
                var12_7 /* !! */  = (int)jq.kent("kghg", keoa(int ), (int)687);
                if (!var13_6) ** GOTO lbl250
                throw null;
            }
            case 47: {
                var12_7 /* !! */  = (int)jq.kent("kghj", keoa(int ), (int)688);
                if (!var13_6) ** GOTO lbl210
                throw null;
            }
lbl433:
            // 2 sources

            case 48: {
                var12_7 /* !! */  = (int)jq.kent("kghm", keoa(int ), (int)689);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl491
            }
            case 49: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_7 /* !! */  = (int)jq.kent("kgho", keoa(int ), (int)690);
                    if (!var13_6) ** GOTO lbl245
                    throw null;
                }
            }
            case 50: {
                var12_7 /* !! */  = (int)jq.kent("kghp", keoa(int ), (int)691);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl750
            }
            case 51: {
                var12_7 /* !! */  = (int)jq.kent("kghr", keoa(int ), (int)692);
                if (!var13_6) ** GOTO lbl403
                throw null;
            }
lbl452:
            // 2 sources

            case 52: {
                var12_7 /* !! */  = (int)jq.kent("kghv", keoa(int ), (int)693);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl791
            }
            case 53: {
                var12_7 /* !! */  = (int)jq.kent("kghz", keoa(int ), (int)694);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl676
            }
lbl462:
            // 4 sources

            case 54: {
                var12_7 /* !! */  = (int)jq.kent("kgic", keoa(int ), (int)695);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl693
            }
            case 55: {
                var12_7 /* !! */  = (int)jq.kent("kgif", keoa(int ), (int)696);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl689
            }
            case 56: {
                var12_7 /* !! */  = (int)jq.kent("kgij", keoa(int ), (int)697);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl622
            }
lbl477:
            // 2 sources

            case 57: {
                var12_7 /* !! */  = (int)jq.kent("kgin", keoa(int ), (int)698);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl509
            }
            case 58: {
                var12_7 /* !! */  = (int)jq.kent("kgiq", keoa(int ), (int)699);
                if (!var13_6) ** GOTO lbl275
                throw null;
            }
lbl486:
            // 2 sources

            case 59: {
                var12_7 /* !! */  = (int)jq.kent("kgir", keoa(int ), (int)700);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl787
            }
lbl491:
            // 2 sources

            case 60: {
                var12_7 /* !! */  = (int)jq.kent("kgiv", keoa(int ), (int)701);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl609
            }
            case 61: {
                var12_7 /* !! */  = (int)jq.kent("kgiz", keoa(int ), (int)702);
                if (!var13_6) ** GOTO lbl205
                throw null;
            }
            case 62: {
                var12_7 /* !! */  = (int)jq.kent("kgjd", keoa(int ), (int)703);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl528
            }
            case 63: {
                var12_7 /* !! */  = (int)jq.kent("kgjf", keoa(int ), (int)704);
                if (!var13_6) ** GOTO lbl425
                throw null;
            }
lbl509:
            // 4 sources

            case 64: {
                var12_7 /* !! */  = (int)jq.kent("kgjk", keoa(int ), (int)705);
                if (!var13_6) ** GOTO lbl305
                throw null;
            }
            case 65: {
                var12_7 /* !! */  = (int)jq.kent("kgjn", keoa(int ), (int)706);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl742
            }
            case 66: {
                var12_7 /* !! */  = (int)jq.kent("kgjr", keoa(int ), (int)707);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl609
            }
lbl523:
            // 3 sources

            case 67: {
                var12_7 /* !! */  = (int)jq.kent("kgjv", keoa(int ), (int)708);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl703
            }
lbl528:
            // 2 sources

            case 68: {
                var12_7 /* !! */  = (int)jq.kent("kgjz", keoa(int ), (int)709);
                if (!var13_6) ** GOTO lbl398
                throw null;
            }
            case 69: {
                var12_7 /* !! */  = (int)jq.kent("kgkd", keoa(int ), (int)710);
                if (!var13_6) ** GOTO lbl367
                throw null;
            }
            case 70: {
                var12_7 /* !! */  = (int)jq.kent("kgke", keoa(int ), (int)711);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl759
            }
lbl541:
            // 2 sources

            case 71: {
                var12_7 /* !! */  = (int)jq.kent("kgkf", keoa(int ), (int)712);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl750
            }
lbl546:
            // 3 sources

            case 72: {
                var12_7 /* !! */  = (int)jq.kent("kgkg", keoa(int ), (int)713);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl575
            }
            case 73: {
                var12_7 /* !! */  = (int)jq.kent("kgkh", keoa(int ), (int)714);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl680
            }
            case 74: {
                var12_7 /* !! */  = (int)jq.kent("kgkk", keoa(int ), (int)715);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl622
            }
lbl561:
            // 2 sources

            case 75: {
                var12_7 /* !! */  = (int)jq.kent("kgkm", keoa(int ), (int)716);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl787
            }
            case 76: {
                var12_7 /* !! */  = (int)jq.kent("kgko", keoa(int ), (int)717);
                if (!var13_6) ** GOTO lbl230
                throw null;
            }
            case 77: {
                var12_7 /* !! */  = (int)jq.kent("kgkq", keoa(int ), (int)718);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl779
            }
lbl575:
            // 2 sources

            case 78: {
                var12_7 /* !! */  = (int)jq.kent("kgks", keoa(int ), (int)719);
                if (!var13_6) break;
                throw null;
            }
lbl579:
            // 2 sources

            case 79: {
                var12_7 /* !! */  = (int)jq.kent("kgku", keoa(int ), (int)720);
                if (!var13_6) ** GOTO lbl324
                throw null;
            }
            case 80: {
                var12_7 /* !! */  = (int)jq.kent("kgkx", keoa(int ), (int)721);
                if (!var13_6) ** GOTO lbl280
                throw null;
            }
            case 81: {
                var12_7 /* !! */  = (int)jq.kent("kgla", keoa(int ), (int)722);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl807
            }
lbl592:
            // 2 sources

            case 82: {
                var12_7 /* !! */  = (int)jq.kent("kglc", keoa(int ), (int)723);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl707
            }
            case 83: {
                var12_7 /* !! */  = (int)jq.kent("kglf", keoa(int ), (int)724);
                if (!var13_6) ** GOTO lbl225
                throw null;
            }
lbl601:
            // 2 sources

            case 84: {
                var12_7 /* !! */  = (int)jq.kent("kglh", keoa(int ), (int)725);
                if (!var13_6) ** GOTO lbl509
                throw null;
            }
            case 85: {
                var12_7 /* !! */  = (int)jq.kent("kglk", keoa(int ), (int)726);
                if (!var13_6) ** GOTO lbl324
                throw null;
            }
lbl609:
            // 3 sources

            case 86: {
                var12_7 /* !! */  = (int)jq.kent("kglo", keoa(int ), (int)727);
                if (!var13_6) ** GOTO lbl509
                throw null;
            }
lbl613:
            // 2 sources

            case 87: {
                var12_7 /* !! */  = (int)jq.kent("kglr", keoa(int ), (int)728);
                if (!var13_6) ** GOTO lbl344
                throw null;
            }
            case 88: {
                var12_7 /* !! */  = (int)jq.kent("kglu", keoa(int ), (int)729);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl730
            }
lbl622:
            // 4 sources

            case 89: {
                var12_7 /* !! */  = (int)jq.kent("kglx", keoa(int ), (int)730);
                if (!var13_6) ** GOTO lbl592
                throw null;
            }
            case 90: {
                var12_7 /* !! */  = (int)jq.kent("kglz", keoa(int ), (int)731);
                if (!var13_6) ** GOTO lbl486
                throw null;
            }
            case 91: {
                var12_7 /* !! */  = (int)jq.kent("kgmb", keoa(int ), (int)732);
                if (!var13_6) ** GOTO lbl324
                throw null;
            }
lbl634:
            // 2 sources

            case 92: {
                var12_7 /* !! */  = (int)jq.kent("kgmd", keoa(int ), (int)733);
                if (!var13_6) ** GOTO lbl390
                throw null;
            }
            case 93: {
                var12_7 /* !! */  = (int)jq.kent("kgme", keoa(int ), (int)734);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl693
            }
lbl643:
            // 3 sources

            case 94: {
                var12_7 /* !! */  = (int)jq.kent("kgmf", keoa(int ), (int)735);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl759
            }
lbl648:
            // 2 sources

            case 95: {
                var12_7 /* !! */  = (int)jq.kent("kgmg", keoa(int ), (int)736);
                if (!var13_6) ** GOTO lbl367
                throw null;
            }
lbl652:
            // 2 sources

            case 96: {
                var12_7 /* !! */  = (int)jq.kent("kgmh", keoa(int ), (int)737);
                if (!var13_6) ** GOTO lbl398
                throw null;
            }
lbl656:
            // 2 sources

            case 97: {
                var12_7 /* !! */  = (int)jq.kent("kgmi", keoa(int ), (int)738);
                if (!var13_6) ** GOTO lbl270
                throw null;
            }
            case 98: {
                var12_7 /* !! */  = (int)jq.kent("kgmj", keoa(int ), (int)739);
                if (!var13_6) ** GOTO lbl265
                throw null;
            }
lbl664:
            // 2 sources

            case 99: {
                var12_7 /* !! */  = (int)jq.kent("kgmk", keoa(int ), (int)740);
                if (!var13_6) ** GOTO lbl245
                throw null;
            }
            case 100: {
                var12_7 /* !! */  = (int)jq.kent("kgml", keoa(int ), (int)741);
                if (!var13_6) ** GOTO lbl305
                throw null;
            }
            case 101: {
                var12_7 /* !! */  = (int)jq.kent("kgmn", keoa(int ), (int)742);
                if (!var13_6) ** GOTO lbl462
                throw null;
            }
lbl676:
            // 2 sources

            case 102: {
                var12_7 /* !! */  = (int)jq.kent("kgmo", keoa(int ), (int)743);
                if (!var13_6) ** GOTO lbl220
                throw null;
            }
lbl680:
            // 2 sources

            case 103: {
                var12_7 /* !! */  = (int)jq.kent("kgmq", keoa(int ), (int)744);
                if (!var13_6) ** GOTO lbl652
                throw null;
            }
lbl684:
            // 4 sources

            case 104: {
                var12_7 /* !! */  = (int)jq.kent("kgms", keoa(int ), (int)745);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl707
            }
lbl689:
            // 2 sources

            case 105: {
                var12_7 /* !! */  = (int)jq.kent("kgmt", keoa(int ), (int)746);
                if (!var13_6) ** GOTO lbl385
                throw null;
            }
lbl693:
            // 3 sources

            case 106: {
                var12_7 /* !! */  = (int)jq.kent("kgmu", keoa(int ), (int)747);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl783
            }
lbl698:
            // 2 sources

            case 107: {
                var12_7 /* !! */  = (int)jq.kent("kgmx", keoa(int ), (int)748);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl726
            }
lbl703:
            // 4 sources

            case 108: {
                var12_7 /* !! */  = (int)jq.kent("kgmy", keoa(int ), (int)749);
                if (!var13_6) ** GOTO lbl329
                throw null;
            }
lbl707:
            // 4 sources

            case 109: {
                var12_7 /* !! */  = (int)jq.kent("kgna", keoa(int ), (int)750);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl734
            }
            case 110: {
                var12_7 /* !! */  = (int)jq.kent("kgnc", keoa(int ), (int)751);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl820
            }
lbl717:
            // 2 sources

            case 111: {
                var12_7 /* !! */  = (int)jq.kent("kgnd", keoa(int ), (int)752);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl726
            }
            case 112: {
                var12_7 /* !! */  = (int)jq.kent("kgne", keoa(int ), (int)753);
                if (!var13_6) ** GOTO lbl235
                throw null;
            }
lbl726:
            // 3 sources

            case 113: {
                var12_7 /* !! */  = (int)jq.kent("kgng", keoa(int ), (int)754);
                if (!var13_6) ** GOTO lbl541
                throw null;
            }
lbl730:
            // 3 sources

            case 114: {
                var12_7 /* !! */  = (int)jq.kent("kgnj", keoa(int ), (int)755);
                if (!var13_6) ** GOTO lbl703
                throw null;
            }
lbl734:
            // 2 sources

            case 115: {
                var12_7 /* !! */  = (int)jq.kent("kgnl", keoa(int ), (int)756);
                if (!var13_6) ** GOTO lbl613
                throw null;
            }
            case 116: {
                var12_7 /* !! */  = (int)jq.kent("kgnn", keoa(int ), (int)757);
                if (!var13_6) ** GOTO lbl433
                throw null;
            }
lbl742:
            // 2 sources

            case 117: {
                var12_7 /* !! */  = (int)jq.kent("kgnp", keoa(int ), (int)758);
                if (!var13_6) ** GOTO lbl416
                throw null;
            }
            case 118: {
                var12_7 /* !! */  = (int)jq.kent("kgnr", keoa(int ), (int)759);
                if (!var13_6) ** GOTO lbl285
                throw null;
            }
lbl750:
            // 4 sources

            case 119: {
                var12_7 /* !! */  = (int)jq.kent("kgnt", keoa(int ), (int)760);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl816
            }
lbl755:
            // 2 sources

            case 120: {
                var12_7 /* !! */  = (int)jq.kent("kgnv", keoa(int ), (int)761);
                if (var13_6) {
                    throw null;
                }
            }
lbl759:
            // 5 sources

            case 121: {
                var12_7 /* !! */  = (int)jq.kent("kgnw", keoa(int ), (int)762);
                if (!var13_6) ** GOTO lbl523
                throw null;
            }
lbl763:
            // 3 sources

            case 122: {
                var12_7 /* !! */  = (int)jq.kent("kgny", keoa(int ), (int)763);
                if (!var13_6) ** GOTO lbl561
                throw null;
            }
            case 123: {
                var12_7 /* !! */  = (int)jq.kent("kgob", keoa(int ), (int)764);
                if (!var13_6) ** GOTO lbl385
                throw null;
            }
            case 124: {
                var12_7 /* !! */  = (int)jq.kent("kgod", keoa(int ), (int)765);
                if (!var13_6) ** GOTO lbl300
                throw null;
            }
            case 125: {
                var12_7 /* !! */  = (int)jq.kent("kgof", keoa(int ), (int)766);
                if (!var13_6) ** GOTO lbl698
                throw null;
            }
lbl779:
            // 3 sources

            case 126: {
                var12_7 /* !! */  = (int)jq.kent("kgoh", keoa(int ), (int)767);
                if (!var13_6) ** GOTO lbl225
                throw null;
            }
lbl783:
            // 2 sources

            case 127: {
                var12_7 /* !! */  = (int)jq.kent("kgou", keoa(int ), (int)768);
                if (!var13_6) ** GOTO lbl717
                throw null;
            }
lbl787:
            // 3 sources

            case 128: {
                var12_7 /* !! */  = (int)jq.kent("kgow", keoa(int ), (int)769);
                if (!var13_6) ** GOTO lbl622
                throw null;
            }
lbl791:
            // 2 sources

            case 129: {
                var12_7 /* !! */  = (int)jq.kent("kgoy", keoa(int ), (int)770);
                if (!var13_6) ** GOTO lbl295
                throw null;
            }
lbl795:
            // 2 sources

            case 130: {
                var12_7 /* !! */  = (int)jq.kent("kgpa", keoa(int ), (int)771);
                if (!var13_6) ** GOTO lbl462
                throw null;
            }
            case 131: {
                var12_7 /* !! */  = (int)jq.kent("kgpc", keoa(int ), (int)772);
                if (!var13_6) ** GOTO lbl452
                throw null;
            }
lbl803:
            // 2 sources

            case 132: {
                var12_7 /* !! */  = (int)jq.kent("kgpe", keoa(int ), (int)773);
                if (!var13_6) ** GOTO lbl664
                throw null;
            }
lbl807:
            // 3 sources

            case 133: {
                var12_7 /* !! */  = (int)jq.kent("kgpg", keoa(int ), (int)774);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl820
            }
lbl812:
            // 2 sources

            case 134: {
                var12_7 /* !! */  = (int)jq.kent("kgpi", keoa(int ), (int)775);
                if (!var13_6) ** GOTO lbl260
                throw null;
            }
lbl816:
            // 2 sources

            case 135: {
                var12_7 /* !! */  = (int)jq.kent("kgpj", keoa(int ), (int)776);
                if (!var13_6) ** GOTO lbl394
                throw null;
            }
lbl820:
            // 3 sources

            case 136: {
                var12_7 /* !! */  = (int)jq.kent("kgpk", keoa(int ), (int)777);
                if (!var13_6) ** GOTO lbl763
                throw null;
            }
            case 137: {
                var12_7 /* !! */  = (int)jq.kent("kgpo", keoa(int ), (int)778);
                if (!var13_6) ** GOTO lbl245
                throw null;
            }
            case 138: {
                var12_7 /* !! */  = (int)jq.kent("kgps", keoa(int ), (int)779);
                if (!var13_6) ** GOTO lbl803
                throw null;
            }
            case 139: {
                var12_7 /* !! */  = (int)jq.kent("kgpt", keoa(int ), (int)780);
                if (!var13_6) ** GOTO lbl381
                throw null;
            }
            case 140: 
        }
        var12_7 /* !! */  = (int)jq.kent("kgpu", keoa(int ), (int)781);
        ** while (!var13_6)
lbl839:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$2() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jq.sf - jq.kent("kihz", keqe(int ), (int)459)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jq.kent("kiia", keoa(int ), (int)1463)) break;
            v0 /* !! */  = (long)jq.kent("kiib", keoa(int ), (int)1464);
        }
        var3_1 = jq.c;
        v1 /* !! */  = jq.sf;
        if (true) ** GOTO lbl12
        block30: while (true) {
            v1 /* !! */  = (long)(jq.kent("kiid", keqe(int ), (int)461) - jq.kent("kiic", keqe(int ), (int)460));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 197898621: {
                    break block30;
                }
                case 1782243525: {
                    continue block30;
                }
            }
            break;
        }
        var2_2 /* !! */  = jq.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = jq.sf;
                if (true) ** GOTO lbl25
                block31: while (true) {
                    v2 /* !! */  = (long)(v3 - jq.kent("kiie", keqe(int ), (int)462));
lbl25:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -292024853: {
                            v3 = jq.kent("kiif", keqe(int ), (int)463);
                            continue block31;
                        }
                        case 168116285: {
                            v3 = jq.kent("kiig", keqe(int ), (int)464);
                            continue block31;
                        }
                        case 197898621: {
                            break block31;
                        }
                    }
                    break;
                }
                var1_3 = jq.a;
                if (var3_1) {
                    throw null;
lbl37:
                    // 3 sources

                    return null;
                }
                if (var1_3 || var1_3) ** GOTO lbl37
                v4 /* !! */  = jq.sf;
                if (true) ** GOTO lbl44
                block33: while (true) {
                    v4 /* !! */  = (long)(v5 - jq.kent("kiih", keqe(int ), (int)465));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1309786462: {
                            v5 = jq.kent("kiii", keqe(int ), (int)466);
                            continue block33;
                        }
                        case 197898621: {
                            break block33;
                        }
                        case 212148938: {
                            v5 = jq.kent("kiij", keqe(int ), (int)467);
                            continue block33;
                        }
                        case 960575687: {
                            v5 = jq.kent("kiik", keqe(int ), (int)468);
                            continue block33;
                        }
                    }
                    break;
                }
                if (this.isHoldMyItems()) ** GOTO lbl62
                if (var1_3) ** GOTO lbl37
                v6 = jq.kent("kiil", keoa(int ), (int)1465);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl65
lbl62:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v6 = jq.kent("kiim", keoa(int ), (int)1466);
lbl65:
                // 2 sources

                v7 /* !! */  = jq.sf;
                if (true) ** GOTO lbl69
                block34: while (true) {
                    v7 /* !! */  = (long)(jq.kent("kiio", keqe(int ), (int)470) - jq.kent("kiin", keqe(int ), (int)469));
lbl69:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 197898621: {
                            break block34;
                        }
                        case 1602169704: {
                            continue block34;
                        }
                    }
                    break;
                }
                return (boolean)v6;
            }
            case 0: {
                var2_2 /* !! */  = (int)jq.kent("kiip", keoa(int ), (int)1467);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl100
            }
lbl80:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)jq.kent("kiiq", keoa(int ), (int)1468);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl90
            }
lbl85:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)jq.kent("kiir", keoa(int ), (int)1469);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl104
            }
lbl90:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)jq.kent("kiis", keoa(int ), (int)1470);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl104
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jq.kent("kiit", keoa(int ), (int)1471);
                    if (!var3_1) ** GOTO lbl85
                    throw null;
                }
            }
lbl100:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)jq.kent("kiiu", keoa(int ), (int)1472);
                if (!var3_1) ** GOTO lbl80
                throw null;
            }
lbl104:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)jq.kent("kiiv", keoa(int ), (int)1473);
                if (!var3_1) ** GOTO lbl90
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)jq.kent("kiiw", keoa(int ), (int)1474);
        ** while (!var3_1)
lbl111:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kimv() {
        jq.kens[400] = -1367888668;
        jq.kens[401] = 1532867985;
        jq.kens[402] = 500438281;
        jq.kens[403] = 1881556830;
        jq.kens[404] = 651232496;
        jq.kens[405] = -1529949768;
        jq.kens[406] = -778237884;
        jq.kens[407] = -1214390604;
        jq.kens[408] = -1709239482;
        jq.kens[409] = 843000584;
        jq.kens[410] = 1900562197;
        jq.kens[411] = 1552801568;
        jq.kens[412] = -647736291;
        jq.kens[413] = -877857364;
        jq.kens[414] = 711349602;
        jq.kens[415] = 1792465198;
        jq.kens[416] = 1541104501;
        jq.kens[417] = 458780998;
        jq.kens[418] = 308460633;
        jq.kens[419] = 1973074387;
        jq.kens[420] = -1625242207;
        jq.kens[421] = 2070208803;
        jq.kens[422] = 989622416;
        jq.kens[423] = -613113918;
        jq.kens[424] = -569232380;
        jq.kens[425] = 781472687;
        jq.kens[426] = 106690156;
        jq.kens[427] = -1127730690;
        jq.kens[428] = 1624207903;
        jq.kens[429] = 129232171;
        jq.kens[430] = -1321408313;
        jq.kens[431] = 1972849584;
        jq.kens[432] = -1803227446;
        jq.kens[433] = 980789660;
        jq.kens[434] = 1222034893;
        jq.kens[435] = 333844794;
        jq.kens[436] = 627619265;
        jq.kens[437] = -892351994;
        jq.kens[438] = -1769265626;
        jq.kens[439] = 1134740107;
        jq.kens[440] = 1960211810;
        jq.kens[441] = 1288265946;
        jq.kens[442] = -1558330791;
        jq.kens[443] = 847765172;
        jq.kens[444] = -251683660;
        jq.kens[445] = -1726041684;
        jq.kens[446] = -1600329105;
        jq.kens[447] = -2033947461;
        jq.kens[448] = 1198577067;
        jq.kens[449] = -358655960;
        jq.kens[450] = -2090380330;
        jq.kens[451] = 1134525871;
        jq.kens[452] = -402759767;
        jq.kens[453] = -539792826;
        jq.kens[454] = -1306107512;
        jq.kens[455] = 1292450812;
        jq.kens[456] = 1455230536;
        jq.kens[457] = -342619716;
        jq.kens[458] = -1201517972;
        jq.kens[459] = -1487070208;
        jq.kens[460] = -372903850;
        jq.kens[461] = 1494685876;
        jq.kens[462] = 835174908;
        jq.kens[463] = -390200867;
        jq.kens[464] = -1897995488;
        jq.kens[465] = -1548417601;
        jq.kens[466] = 2072839975;
        jq.kens[467] = -22122352;
        jq.kens[468] = 1711445491;
        jq.kens[469] = 732619528;
        jq.kens[470] = -2015462024;
        jq.kens[471] = 705959490;
        jq.kens[472] = 1952891359;
        jq.kens[473] = 1720335564;
        jq.kens[474] = 1125725302;
        jq.kens[475] = 922175966;
        jq.kens[476] = -2008573506;
        jq.kens[477] = 1596678921;
        jq.kens[478] = -971243186;
        jq.kens[479] = -1589359133;
        jq.kens[480] = -190073228;
        jq.kens[481] = 1963858549;
        jq.kens[482] = 1784549039;
        jq.kens[483] = -975344517;
        jq.kens[484] = -171703433;
        jq.kens[485] = -55951157;
        jq.kens[486] = -155226223;
        jq.kens[487] = -1505640053;
        jq.kens[488] = 1092773348;
        jq.kens[489] = -879632167;
        jq.kens[490] = -1070705873;
        jq.kens[491] = -63951456;
        jq.kens[492] = -387597490;
        jq.kens[493] = 1201017574;
        jq.kens[494] = -739560954;
        jq.kens[495] = -326539251;
        jq.kens[496] = 999488874;
        jq.kens[497] = 82952221;
        jq.kens[498] = -1891539382;
        jq.kens[499] = -214322808;
    }

    private static /* synthetic */ void kiky() {
        jq.kenr[0] = -1198332137;
        jq.kenr[1] = 1880498809;
        jq.kenr[2] = -989601793;
        jq.kenr[3] = 286382664;
        jq.kenr[4] = -15142797;
        jq.kenr[5] = -7211278;
        jq.kenr[6] = -1368633024;
        jq.kenr[7] = 479981667;
        jq.kenr[8] = 201408410;
        jq.kenr[9] = -2142365073;
        jq.kenr[10] = 1825790498;
        jq.kenr[11] = -830019304;
        jq.kenr[12] = -862115986;
        jq.kenr[13] = 1931799195;
        jq.kenr[14] = 587788455;
        jq.kenr[15] = 986782040;
        jq.kenr[16] = 1582861685;
        jq.kenr[17] = -1673471313;
        jq.kenr[18] = -1766102069;
        jq.kenr[19] = 1869451062;
        jq.kenr[20] = 1463395472;
        jq.kenr[21] = -297123116;
        jq.kenr[22] = -1989705802;
        jq.kenr[23] = -109813542;
        jq.kenr[24] = -1711602660;
        jq.kenr[25] = 447052602;
        jq.kenr[26] = 339811507;
        jq.kenr[27] = 770756529;
        jq.kenr[28] = -1787196437;
        jq.kenr[29] = -1528809763;
        jq.kenr[30] = 591991714;
        jq.kenr[31] = 781575474;
        jq.kenr[32] = -1671137934;
        jq.kenr[33] = -2100664424;
        jq.kenr[34] = -1827415280;
        jq.kenr[35] = -1879654864;
        jq.kenr[36] = -1393435635;
        jq.kenr[37] = -1439868880;
        jq.kenr[38] = 87400370;
        jq.kenr[39] = -527777620;
        jq.kenr[40] = 83811812;
        jq.kenr[41] = -1320503950;
        jq.kenr[42] = -797953338;
        jq.kenr[43] = 1296064357;
        jq.kenr[44] = -949975837;
        jq.kenr[45] = -1974891807;
        jq.kenr[46] = -561321831;
        jq.kenr[47] = -1629066891;
        jq.kenr[48] = -1661954229;
        jq.kenr[49] = 1902849967;
        jq.kenr[50] = 1710245352;
        jq.kenr[51] = -154444578;
        jq.kenr[52] = 289526764;
        jq.kenr[53] = 189953262;
        jq.kenr[54] = 2050375721;
        jq.kenr[55] = 486098905;
        jq.kenr[56] = -920140708;
        jq.kenr[57] = -2139604563;
        jq.kenr[58] = 1588621925;
        jq.kenr[59] = -157510105;
        jq.kenr[60] = -961050774;
        jq.kenr[61] = -986764557;
        jq.kenr[62] = -2034888891;
        jq.kenr[63] = 1395209440;
        jq.kenr[64] = -480524103;
        jq.kenr[65] = -1246602454;
        jq.kenr[66] = 1291417080;
        jq.kenr[67] = 347513701;
        jq.kenr[68] = 426045074;
        jq.kenr[69] = -870295568;
        jq.kenr[70] = 2146918525;
        jq.kenr[71] = 1769311705;
        jq.kenr[72] = 1688720682;
        jq.kenr[73] = 359702493;
        jq.kenr[74] = 2026371127;
        jq.kenr[75] = -1010403459;
        jq.kenr[76] = -1031472404;
        jq.kenr[77] = 1369307545;
        jq.kenr[78] = 1560470957;
        jq.kenr[79] = 1308340597;
        jq.kenr[80] = 693952229;
        jq.kenr[81] = -1191298957;
        jq.kenr[82] = 456315401;
        jq.kenr[83] = -467016590;
        jq.kenr[84] = -1016046446;
        jq.kenr[85] = -165018135;
        jq.kenr[86] = -121377184;
        jq.kenr[87] = -80617091;
        jq.kenr[88] = -936948598;
        jq.kenr[89] = -1576635208;
        jq.kenr[90] = 759602009;
        jq.kenr[91] = -1318779756;
        jq.kenr[92] = 356407103;
        jq.kenr[93] = -1542234453;
        jq.kenr[94] = -1447939388;
        jq.kenr[95] = -761548170;
        jq.kenr[96] = -1933184801;
        jq.kenr[97] = 1473845852;
        jq.kenr[98] = -863818770;
        jq.kenr[99] = 837076479;
    }

    private static /* synthetic */ int keoa(int n2) {
        return kenr[n2] ^ kens[n2];
    }

    static {
        kenr = new int[1510];
        kens = new int[1510];
        jq.kiky();
        jq.kikz();
        jq.kila();
        jq.kilb();
        jq.kilc();
        jq.kild();
        jq.kile();
        jq.kilf();
        jq.kilg();
        jq.kilh();
        jq.kili();
        jq.kilj();
        jq.kilk();
        jq.kill();
        jq.kilm();
        jq.kilv();
        jq.kilw();
        jq.kimb();
        jq.kimj();
        jq.kimp();
        jq.kimv();
        jq.kinc();
        jq.kinh();
        jq.kinn();
        jq.kinq();
        jq.kinu();
        jq.kinw();
        jq.kinz();
        jq.kiod();
        jq.kioe();
        jq.kiop();
        jq.kiow();
        keqf = new long[489];
        keqg = new long[489];
        jq.kioy();
        jq.kipn();
        jq.kipy();
        jq.kiql();
        jq.kiqu();
        jq.kiqy();
        jq.kire();
        jq.kirj();
        jq.kirv();
        jq.kise();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float approach(float var1_1, float var2_2, float var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jq.sf - jq.kent("kidz", keqe(int ), (int)424)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jq.kent("kiea", keoa(int ), (int)1394)) break;
            v0 /* !! */  = (long)jq.kent("kieb", keoa(int ), (int)1395);
        }
        var6_4 = jq.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jq.sf - jq.kent("kiec", keqe(int ), (int)425)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jq.kent("kied", keoa(int ), (int)1396)) break;
            v1 /* !! */  = (long)jq.kent("kiee", keoa(int ), (int)1397);
        }
        var5_5 /* !! */  = jq.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = jq.sf - jq.kent("kief", keqe(int ), (int)426)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jq.kent("kieg", keoa(int ), (int)1398)) break;
            v2 /* !! */  = (long)jq.kent("kieh", keoa(int ), (int)1399);
        }
        var4_6 = jq.a;
        if (var6_4) {
            throw null;
lbl24:
            // 3 sources

            return (float)jq.kent("kiei", kenp(int ), (int)1400);
        }
        if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_6 || var4_6) ** GOTO lbl24
                if (!(var1_1 < var2_2)) ** GOTO lbl49
                if (var4_6) ** GOTO lbl24
                v3 /* !! */  = jq.sf;
                if (true) ** GOTO lbl36
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - jq.kent("kiej", keqe(int ), (int)427));
lbl36:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1552356528: {
                            v4 = jq.kent("kiek", keqe(int ), (int)428);
                            continue block20;
                        }
                        case -406577733: {
                            v4 = jq.kent("kiel", keqe(int ), (int)429);
                            continue block20;
                        }
                        case 197898621: {
                            break block20;
                        }
                        case 1095738088: {
                            v4 = jq.kent("kiem", keqe(int ), (int)430);
                            continue block20;
                        }
                    }
                    break;
                }
                return Math.min(var2_2, var1_1 + var3_3);
lbl49:
                // 1 sources

                if (!var4_6 && !var4_6) ** break;
                ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = jq.sf - jq.kent("kien", keqe(int ), (int)431)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == jq.kent("kieo", keoa(int ), (int)1401)) break;
                    v5 /* !! */  = (long)jq.kent("kiep", keoa(int ), (int)1402);
                }
                return Math.max(var2_2, var1_1 - var3_3);
            }
            case 0: {
                var5_5 /* !! */  = (int)jq.kent("kieq", keoa(int ), (int)1403);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl76
            }
lbl63:
            // 3 sources

            case 1: {
                var5_5 /* !! */  = (int)jq.kent("kier", keoa(int ), (int)1404);
                if (!var6_4) break;
                throw null;
            }
            case 2: {
                var5_5 /* !! */  = (int)jq.kent("kies", keoa(int ), (int)1405);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl85
            }
            case 3: {
                var5_5 /* !! */  = (int)jq.kent("kiet", keoa(int ), (int)1406);
                if (!var6_4) break;
                throw null;
            }
lbl76:
            // 2 sources

            case 4: {
                var5_5 /* !! */  = (int)jq.kent("kieu", keoa(int ), (int)1407);
                if (var6_4) {
                    throw null;
                }
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_5 /* !! */  = (int)jq.kent("kiev", keoa(int ), (int)1408);
                    if (!var6_4) ** GOTO lbl63
                    throw null;
                }
            }
lbl85:
            // 2 sources

            case 6: {
                var5_5 /* !! */  = (int)jq.kent("kiew", keoa(int ), (int)1409);
                if (!var6_4) ** GOTO lbl63
                throw null;
            }
            case 7: 
        }
        var5_5 /* !! */  = (int)jq.kent("kiex", keoa(int ), (int)1410);
        ** while (!var6_4)
lbl92:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kili() {
        jq.kenr[1000] = 1472584772;
        jq.kenr[1001] = 1857695408;
        jq.kenr[1002] = -1156015688;
        jq.kenr[1003] = 33163848;
        jq.kenr[1004] = -929909837;
        jq.kenr[1005] = 55396221;
        jq.kenr[1006] = -1519812040;
        jq.kenr[1007] = -1022109580;
        jq.kenr[1008] = 92425730;
        jq.kenr[1009] = 1607342787;
        jq.kenr[1010] = 399525206;
        jq.kenr[1011] = -1360525992;
        jq.kenr[1012] = -966048920;
        jq.kenr[1013] = 136332551;
        jq.kenr[1014] = 739582673;
        jq.kenr[1015] = 825767320;
        jq.kenr[1016] = 1120945261;
        jq.kenr[1017] = -2118392689;
        jq.kenr[1018] = 1392080058;
        jq.kenr[1019] = -1639675565;
        jq.kenr[1020] = -311066362;
        jq.kenr[1021] = 2097045647;
        jq.kenr[1022] = -941492770;
        jq.kenr[1023] = 740072819;
        jq.kenr[1024] = -1250549181;
        jq.kenr[1025] = -318626527;
        jq.kenr[1026] = 518563031;
        jq.kenr[1027] = 2131315597;
        jq.kenr[1028] = 1075641155;
        jq.kenr[1029] = -1544835248;
        jq.kenr[1030] = 1397232416;
        jq.kenr[1031] = 387422300;
        jq.kenr[1032] = -581836676;
        jq.kenr[1033] = 1235974555;
        jq.kenr[1034] = -2098588269;
        jq.kenr[1035] = -530547007;
        jq.kenr[1036] = -107006156;
        jq.kenr[1037] = 723099705;
        jq.kenr[1038] = -134208311;
        jq.kenr[1039] = -114253886;
        jq.kenr[1040] = -1964395387;
        jq.kenr[1041] = -1740028102;
        jq.kenr[1042] = 1395386916;
        jq.kenr[1043] = -605163702;
        jq.kenr[1044] = -1842454372;
        jq.kenr[1045] = -801167655;
        jq.kenr[1046] = 1814218931;
        jq.kenr[1047] = 1573448318;
        jq.kenr[1048] = -617002389;
        jq.kenr[1049] = -552090573;
        jq.kenr[1050] = -1407233047;
        jq.kenr[1051] = -232129744;
        jq.kenr[1052] = -712406077;
        jq.kenr[1053] = 1063202629;
        jq.kenr[1054] = 1495271709;
        jq.kenr[1055] = -459078161;
        jq.kenr[1056] = -843216601;
        jq.kenr[1057] = 2032491190;
        jq.kenr[1058] = 589483084;
        jq.kenr[1059] = 2067288615;
        jq.kenr[1060] = 791446525;
        jq.kenr[1061] = -1367907527;
        jq.kenr[1062] = -1451172275;
        jq.kenr[1063] = 1616068892;
        jq.kenr[1064] = 1744891960;
        jq.kenr[1065] = -426290098;
        jq.kenr[1066] = 109536775;
        jq.kenr[1067] = 837060937;
        jq.kenr[1068] = -780587770;
        jq.kenr[1069] = -1395571537;
        jq.kenr[1070] = 1722073750;
        jq.kenr[1071] = 2036524720;
        jq.kenr[1072] = -1070957002;
        jq.kenr[1073] = 107338390;
        jq.kenr[1074] = 2000889769;
        jq.kenr[1075] = -1448182985;
        jq.kenr[1076] = -411273850;
        jq.kenr[1077] = -101740558;
        jq.kenr[1078] = 65886596;
        jq.kenr[1079] = -1951381415;
        jq.kenr[1080] = 911288344;
        jq.kenr[1081] = -1826012200;
        jq.kenr[1082] = 1591899874;
        jq.kenr[1083] = -200245537;
        jq.kenr[1084] = -1825516256;
        jq.kenr[1085] = -44960494;
        jq.kenr[1086] = 1896489752;
        jq.kenr[1087] = -623536134;
        jq.kenr[1088] = -1701452854;
        jq.kenr[1089] = -1781353648;
        jq.kenr[1090] = 1149932557;
        jq.kenr[1091] = 1416193371;
        jq.kenr[1092] = 341859436;
        jq.kenr[1093] = -1517740555;
        jq.kenr[1094] = 290864856;
        jq.kenr[1095] = 1235260199;
        jq.kenr[1096] = -62505556;
        jq.kenr[1097] = 1114244433;
        jq.kenr[1098] = -870372274;
        jq.kenr[1099] = -1523298758;
    }

    /*
     * Unable to fully structure code
     */
    private void applyHoldEnvironment(class_4587 var1_1, class_742 var2_2, class_1268 var3_3, class_1306 var4_4, class_1799 var5_5, float var6_6, float var7_7) {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            block24: {
                                block26: {
                                    block25: {
                                        block23: {
                                            block22: {
                                                block21: {
                                                    block20: {
                                                        block19: {
                                                            block18: {
                                                                block17: {
                                                                    block16: {
                                                                        block15: {
                                                                            block14: {
                                                                                block13: {
                                                                                    var17_8 = jq.c;
                                                                                    var16_9 = jq.b;
                                                                                    var15_10 = jq.a;
                                                                                    if (var17_8) {
                                                                                        throw null;
lbl6:
                                                                                        // 61 sources

                                                                                        return;
                                                                                    }
                                                                                    if (var15_10 || var15_10) ** GOTO lbl6
                                                                                    var8_11 = this.holdDeltaTime * jq.kent("kgww", kffx(int ), (int)173);
                                                                                    if (var15_10 || var15_10) ** GOTO lbl6
                                                                                    if (!var2_2.method_6101()) break block13;
                                                                                    if (var15_10) ** GOTO lbl6
                                                                                    if (var2_2.method_24828()) break block13;
                                                                                    if (var15_10) ** GOTO lbl6
                                                                                    v0 = jq.kent("kgwy", keoa(int ), (int)826);
                                                                                    if (var17_8) {
                                                                                        throw null;
                                                                                    }
                                                                                    break block14;
                                                                                }
                                                                                if (var15_10 || var15_10) ** GOTO lbl6
                                                                                v0 = var10_12 = jq.kent("kgxb", keoa(int ), (int)827);
                                                                            }
                                                                            if (var15_10 || var15_10) ** GOTO lbl6
                                                                            if (!var2_2.method_5681()) break block15;
                                                                            if (var15_10) ** GOTO lbl6
                                                                            if (var2_2.method_5799()) break block15;
                                                                            if (var15_10) ** GOTO lbl6
                                                                            v1 = jq.kent("kgxd", keoa(int ), (int)828);
                                                                            if (var17_8) {
                                                                                throw null;
                                                                            }
                                                                            break block16;
                                                                        }
                                                                        if (var15_10 || var15_10) ** GOTO lbl6
                                                                        v1 = var11_13 = jq.kent("kgxe", keoa(int ), (int)829);
                                                                    }
                                                                    if (var15_10 || var15_10) ** GOTO lbl6
                                                                    if (!var2_2.method_5799()) break block17;
                                                                    if (var15_10) ** GOTO lbl6
                                                                    if (var2_2.method_5681()) break block17;
                                                                    if (var15_10) ** GOTO lbl6
                                                                    v2 = jq.kent("kgxg", keoa(int ), (int)830);
                                                                    if (var17_8) {
                                                                        throw null;
                                                                    }
                                                                    break block18;
                                                                }
                                                                if (var15_10 || var15_10) ** GOTO lbl6
                                                                v2 = var12_14 = jq.kent("kgxj", keoa(int ), (int)831);
                                                            }
                                                            if (var15_10 || var15_10) ** GOTO lbl6
                                                            if (this.holdPhysicsUpdated) break block19;
                                                            if (var15_10 || var15_10) ** GOTO lbl6
                                                            var13_15 = class_3532.method_15350((double)var2_2.method_18798().field_1351, (double)jq.kent("kgxk", kffx(int ), (int)174), (double)jq.kent("kgxm", kffx(int ), (int)175));
                                                            if (var15_10 || var15_10) ** GOTO lbl6
                                                            this.holdVerticalVelocity += (float)(var13_15 * jq.kent("kgxp", kffx(int ), (int)176) * var8_11 - (double)this.holdVerticalAngle * jq.kent("kgxs", kffx(int ), (int)177) * var8_11);
                                                            if (var15_10 || var15_10) ** GOTO lbl6
                                                            this.holdVerticalVelocity *= (float)Math.pow((double)jq.kent("kgxw", kffx(int ), (int)178), var8_11);
                                                            if (var15_10 || var15_10) ** GOTO lbl6
                                                            this.holdVerticalAngle += this.holdVerticalVelocity * (float)var8_11;
                                                            if (var15_10 || var15_10) ** GOTO lbl6
                                                            if (var12_14 != false) {
                                                                v3 = 1.0f;
                                                                if (var17_8) {
                                                                    throw null;
                                                                }
                                                            } else {
                                                                v3 = 0.0f;
                                                            }
                                                            this.holdWaterBlend = this.approach(this.holdWaterBlend, v3, (float)(jq.kent("kgyb", kffx(int ), (int)179) * var8_11));
                                                            if (var15_10 || var15_10) ** GOTO lbl6
                                                            if (!(var10_12 == false && var11_13 == false || var2_2.method_6115() || var6_6 != 0.0f)) {
                                                                v4 = 1.0f;
                                                                if (var17_8) {
                                                                    throw null;
                                                                }
                                                            } else {
                                                                v4 = 0.0f;
                                                            }
                                                            this.holdClimbBlend = this.approach(this.holdClimbBlend, v4, (float)(jq.kent("kgyg", kffx(int ), (int)180) * var8_11));
                                                            if (var15_10 || var15_10) ** GOTO lbl6
                                                            this.holdPhysicsUpdated = jq.kent("kgyi", keoa(int ), (int)832);
                                                            if (var15_10) ** GOTO lbl6
                                                        }
                                                        if (var15_10 || var15_10) ** GOTO lbl6
                                                        if (var4_4 != class_1306.field_6183) break block20;
                                                        if (var15_10) ** GOTO lbl6
                                                        v5 = jq.kent("kgyl", keoa(int ), (int)833);
                                                        if (var17_8) {
                                                            throw null;
                                                        }
                                                        break block21;
                                                    }
                                                    if (var15_10 || var15_10) ** GOTO lbl6
                                                    v5 = var13_16 = jq.kent("kgyo", keoa(int ), (int)834);
                                                }
                                                if (var15_10 || var15_10) ** GOTO lbl6
                                                if (var3_3 != class_1268.field_5808) break block22;
                                                if (var15_10) ** GOTO lbl6
                                                v6 = 1.0f;
                                                if (var17_8) {
                                                    throw null;
                                                }
                                                break block23;
                                            }
                                            if (var15_10 || var15_10) ** GOTO lbl6
                                            v6 = var14_17 = (float)jq.kent("kgyt", kenp(int ), (int)835);
                                        }
                                        if (var15_10 || var15_10) ** GOTO lbl6
                                        if (!var2_2.method_6128()) break block24;
                                        if (var15_10 || var15_10) ** GOTO lbl6
                                        if (var5_5.method_7960()) break block25;
                                        if (var15_10) ** GOTO lbl6
                                        if (var5_5.method_7976() == class_1839.field_8949) break block25;
                                        if (var15_10) ** GOTO lbl6
                                        var1_1.method_46416(0.0f, (float)jq.kent("kgyw", kenp(int ), (int)836), (float)jq.kent("kgyx", kenp(int ), (int)837));
                                        if (var15_10) ** GOTO lbl6
                                    }
                                    if (var15_10 || var15_10) ** GOTO lbl6
                                    if (!this.isLantern(var5_5)) break block26;
                                    if (var15_10) ** GOTO lbl6
                                    var1_1.method_46416(0.0f, (float)jq.kent("kgyz", kenp(int ), (int)838), 0.0f);
                                    if (var15_10) ** GOTO lbl6
                                }
                                if (var15_10 || var15_10) ** GOTO lbl6
                                return;
                            }
                            if (var15_10 || var15_10) ** GOTO lbl6
                            if (this.isLantern(var5_5)) break block27;
                            if (var15_10) ** GOTO lbl6
                            var1_1.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees((float)(jq.kent("kgza", kenp(int ), (int)839) * this.holdClimbBlend)));
                            if (var15_10) ** GOTO lbl6
                        }
                        if (var15_10 || var15_10) ** GOTO lbl6
                        if (var10_12 == false) break block28;
                        if (var15_10) ** GOTO lbl6
                        if (this.isLantern(var5_5)) break block28;
                        if (var15_10) ** GOTO lbl6
                        if (var2_2.method_6115()) break block28;
                        if (var15_10) ** GOTO lbl6
                        var1_1.method_46416(0.0f, (float)jq.kent("kgzc", kenp(int ), (int)840), (float)jq.kent("kgzd", kenp(int ), (int)841));
                        if (var15_10) ** GOTO lbl6
                    }
                    if (var15_10 || var15_10) ** GOTO lbl6
                    var1_1.method_46416(0.0f, (float)(jq.kent("kgze", kenp(int ), (int)842) * this.holdWaterBlend - this.holdVerticalAngle), 0.0f);
                    if (var15_10 || var15_10) ** GOTO lbl6
                    var1_1.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees((float)(jq.kent("kgzf", kenp(int ), (int)843) * var14_17 * this.holdWaterBlend)));
                    if (var15_10 || var15_10) ** GOTO lbl6
                    var1_1.method_22904(0.0, Math.sin((double)((float)var2_2.field_6012 + var7_7) * jq.kent("kgzh", kffx(int ), (int)181)) * jq.kent("kgzi", kffx(int ), (int)182) * (double)var13_16, 0.0);
                    if (var15_10 || var15_10) ** GOTO lbl6
                    var1_1.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees((float)(jq.kent("kgzk", kenp(int ), (int)844) * class_3532.method_15374((double)(((float)var2_2.field_6012 + var7_7) * jq.kent("kgzl", kenp(int ), (int)845))) * (float)var13_16)));
                    if (var15_10 || var15_10) ** GOTO lbl6
                    if (!var5_5.method_7960()) break block29;
                    if (var15_10) ** GOTO lbl6
                    if (var11_13 != false) break block29;
                    if (var15_10) ** GOTO lbl6
                    if (var10_12 != false) break block29;
                    if (var15_10) ** GOTO lbl6
                    if (!var2_2.method_5681()) break block30;
                    if (var15_10) ** GOTO lbl6
                }
                if (var15_10 || var15_10) ** GOTO lbl6
                if (var5_5.method_7976() == class_1839.field_8949) break block30;
                if (var15_10 || var15_10) ** GOTO lbl6
                var1_1.method_46416(0.0f, (float)jq.kent("kgzn", kenp(int ), (int)846), (float)jq.kent("kgzo", kenp(int ), (int)847));
                if (var15_10) ** GOTO lbl6
            }
            if (var15_10 || var15_10) ** GOTO lbl6
            if (!this.isLantern(var5_5)) break block31;
            if (var15_10) ** GOTO lbl6
            var1_1.method_46416(0.0f, (float)jq.kent("kgzp", kenp(int ), (int)848), 0.0f);
            if (var15_10) ** GOTO lbl6
        }
        if (!var15_10 && !var15_10) ** break;
        ** while (true)
    }

    private static /* synthetic */ void kilg() {
        jq.kenr[800] = 1417965348;
        jq.kenr[801] = -356145965;
        jq.kenr[802] = -1155322558;
        jq.kenr[803] = 1502507120;
        jq.kenr[804] = -1141202608;
        jq.kenr[805] = 1883501161;
        jq.kenr[806] = 1019501846;
        jq.kenr[807] = 1006752354;
        jq.kenr[808] = -694967237;
        jq.kenr[809] = -1847607100;
        jq.kenr[810] = 97583222;
        jq.kenr[811] = 542082832;
        jq.kenr[812] = 266934901;
        jq.kenr[813] = -1704513034;
        jq.kenr[814] = 1285339389;
        jq.kenr[815] = -757247725;
        jq.kenr[816] = -1152974358;
        jq.kenr[817] = 1808176576;
        jq.kenr[818] = -1593017921;
        jq.kenr[819] = -1707521806;
        jq.kenr[820] = -547495894;
        jq.kenr[821] = 2072245063;
        jq.kenr[822] = 870412301;
        jq.kenr[823] = -1332382578;
        jq.kenr[824] = 1653688286;
        jq.kenr[825] = 501382251;
        jq.kenr[826] = -366600884;
        jq.kenr[827] = -499677699;
        jq.kenr[828] = -1863390237;
        jq.kenr[829] = 2137461404;
        jq.kenr[830] = 350633395;
        jq.kenr[831] = 1769984702;
        jq.kenr[832] = 343128022;
        jq.kenr[833] = -1039197235;
        jq.kenr[834] = -641588967;
        jq.kenr[835] = 1873120585;
        jq.kenr[836] = -2130976289;
        jq.kenr[837] = -1204910561;
        jq.kenr[838] = -138460949;
        jq.kenr[839] = 1019651297;
        jq.kenr[840] = -1107953801;
        jq.kenr[841] = -350560665;
        jq.kenr[842] = -1390351363;
        jq.kenr[843] = 696296156;
        jq.kenr[844] = 1520220570;
        jq.kenr[845] = 662652683;
        jq.kenr[846] = -1117809343;
        jq.kenr[847] = 72910667;
        jq.kenr[848] = -1318042998;
        jq.kenr[849] = 1620021976;
        jq.kenr[850] = -1154416073;
        jq.kenr[851] = -831258103;
        jq.kenr[852] = 1067036513;
        jq.kenr[853] = -673629147;
        jq.kenr[854] = 1129685772;
        jq.kenr[855] = -1042684740;
        jq.kenr[856] = -133903650;
        jq.kenr[857] = -1904224498;
        jq.kenr[858] = -628575064;
        jq.kenr[859] = 1329951332;
        jq.kenr[860] = 1970229319;
        jq.kenr[861] = 2027161040;
        jq.kenr[862] = 737625870;
        jq.kenr[863] = 2132666307;
        jq.kenr[864] = -440498707;
        jq.kenr[865] = 22989700;
        jq.kenr[866] = -300609901;
        jq.kenr[867] = -1422709447;
        jq.kenr[868] = -61418334;
        jq.kenr[869] = -1904445477;
        jq.kenr[870] = -459066135;
        jq.kenr[871] = -404434607;
        jq.kenr[872] = 613355214;
        jq.kenr[873] = 78401164;
        jq.kenr[874] = -2008223063;
        jq.kenr[875] = -1694971885;
        jq.kenr[876] = -1872405486;
        jq.kenr[877] = 462932370;
        jq.kenr[878] = 1837511431;
        jq.kenr[879] = -1550655323;
        jq.kenr[880] = -440031028;
        jq.kenr[881] = 950894963;
        jq.kenr[882] = -1135031213;
        jq.kenr[883] = -2007423724;
        jq.kenr[884] = 1196147397;
        jq.kenr[885] = -883355027;
        jq.kenr[886] = -628030102;
        jq.kenr[887] = -387932861;
        jq.kenr[888] = 1466532312;
        jq.kenr[889] = -844982753;
        jq.kenr[890] = 159546217;
        jq.kenr[891] = 1631658388;
        jq.kenr[892] = 813408911;
        jq.kenr[893] = -711622787;
        jq.kenr[894] = -1532322378;
        jq.kenr[895] = -1855572643;
        jq.kenr[896] = -1747043661;
        jq.kenr[897] = -378015737;
        jq.kenr[898] = -419017046;
        jq.kenr[899] = -1466032839;
    }

    /*
     * Exception decompiling
     */
    @aw
    public void onHandAnimation(cc var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [14[CASE]], but top level block is 22[SWITCH]
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

    private static /* synthetic */ void kilv() {
        jq.kenr[1500] = -903324853;
        jq.kenr[1501] = -2049004883;
        jq.kenr[1502] = 7479682;
        jq.kenr[1503] = -514811502;
        jq.kenr[1504] = 2053832392;
        jq.kenr[1505] = 2108275772;
        jq.kenr[1506] = -1625893838;
        jq.kenr[1507] = -683722561;
        jq.kenr[1508] = -100577072;
        jq.kenr[1509] = 1957322085;
    }

    public static /* synthetic */ CallSite kent(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void kimp() {
        jq.kens[300] = -1529872632;
        jq.kens[301] = 4073559;
        jq.kens[302] = -1545067349;
        jq.kens[303] = 1120623337;
        jq.kens[304] = -624413438;
        jq.kens[305] = -594497178;
        jq.kens[306] = 1087508725;
        jq.kens[307] = -863160416;
        jq.kens[308] = -229117710;
        jq.kens[309] = 1040194420;
        jq.kens[310] = -173757205;
        jq.kens[311] = 168197729;
        jq.kens[312] = 445464689;
        jq.kens[313] = -424520760;
        jq.kens[314] = 906293002;
        jq.kens[315] = 958783699;
        jq.kens[316] = 23571771;
        jq.kens[317] = 935743056;
        jq.kens[318] = -778744620;
        jq.kens[319] = -864540140;
        jq.kens[320] = 749596542;
        jq.kens[321] = 1361708177;
        jq.kens[322] = 1712488622;
        jq.kens[323] = 23288011;
        jq.kens[324] = 1828061269;
        jq.kens[325] = -698552360;
        jq.kens[326] = -1612953078;
        jq.kens[327] = -1875851651;
        jq.kens[328] = 180179086;
        jq.kens[329] = 1470329525;
        jq.kens[330] = 75992008;
        jq.kens[331] = -272502752;
        jq.kens[332] = 1191651251;
        jq.kens[333] = 1854072233;
        jq.kens[334] = 1426681049;
        jq.kens[335] = 812692461;
        jq.kens[336] = -606900408;
        jq.kens[337] = -2052768994;
        jq.kens[338] = -337551579;
        jq.kens[339] = -397076358;
        jq.kens[340] = 622882384;
        jq.kens[341] = 851340951;
        jq.kens[342] = -1046335313;
        jq.kens[343] = 1278734599;
        jq.kens[344] = 357447958;
        jq.kens[345] = -1677905113;
        jq.kens[346] = 1167624949;
        jq.kens[347] = 756740887;
        jq.kens[348] = -1478305495;
        jq.kens[349] = -315386585;
        jq.kens[350] = -347110244;
        jq.kens[351] = -810282686;
        jq.kens[352] = 135950759;
        jq.kens[353] = -1434746078;
        jq.kens[354] = 110766412;
        jq.kens[355] = 717434697;
        jq.kens[356] = 1973347262;
        jq.kens[357] = 837186068;
        jq.kens[358] = 1221794777;
        jq.kens[359] = 403080043;
        jq.kens[360] = 1031190384;
        jq.kens[361] = -351891244;
        jq.kens[362] = 1232189090;
        jq.kens[363] = 184760566;
        jq.kens[364] = 133385365;
        jq.kens[365] = 487800525;
        jq.kens[366] = -64598466;
        jq.kens[367] = 1713186848;
        jq.kens[368] = -1302161370;
        jq.kens[369] = -1034831372;
        jq.kens[370] = -1247446444;
        jq.kens[371] = 315733782;
        jq.kens[372] = -590810697;
        jq.kens[373] = -1132054539;
        jq.kens[374] = 1885636809;
        jq.kens[375] = 1922512981;
        jq.kens[376] = -181684923;
        jq.kens[377] = -910106961;
        jq.kens[378] = -771260639;
        jq.kens[379] = -2078057927;
        jq.kens[380] = -1824670414;
        jq.kens[381] = 1981632482;
        jq.kens[382] = 325275166;
        jq.kens[383] = 2045803475;
        jq.kens[384] = 1691023500;
        jq.kens[385] = -314393561;
        jq.kens[386] = 1442651053;
        jq.kens[387] = 1409481471;
        jq.kens[388] = 1028694421;
        jq.kens[389] = 417181984;
        jq.kens[390] = 1025099522;
        jq.kens[391] = 91017140;
        jq.kens[392] = 1443092607;
        jq.kens[393] = 1999378159;
        jq.kens[394] = 1275005697;
        jq.kens[395] = -2028009315;
        jq.kens[396] = -1218402697;
        jq.kens[397] = -918089493;
        jq.kens[398] = -1187388705;
        jq.kens[399] = 176028905;
    }

    private static /* synthetic */ void kilb() {
        jq.kenr[300] = -1529872574;
        jq.kenr[301] = 4073726;
        jq.kenr[302] = -1545067365;
        jq.kenr[303] = 1120623189;
        jq.kenr[304] = -624413353;
        jq.kenr[305] = -594497236;
        jq.kenr[306] = 1087508606;
        jq.kenr[307] = -863160524;
        jq.kenr[308] = -229117759;
        jq.kenr[309] = 1040194321;
        jq.kenr[310] = -173757241;
        jq.kenr[311] = 168197873;
        jq.kenr[312] = 445464753;
        jq.kenr[313] = -424520770;
        jq.kenr[314] = 906293013;
        jq.kenr[315] = 958783517;
        jq.kenr[316] = 23571793;
        jq.kenr[317] = 935743185;
        jq.kenr[318] = -778744732;
        jq.kenr[319] = -864539937;
        jq.kenr[320] = 749596469;
        jq.kenr[321] = 1361708051;
        jq.kenr[322] = 1712488556;
        jq.kenr[323] = 23288052;
        jq.kenr[324] = 1828061327;
        jq.kenr[325] = -698552345;
        jq.kenr[326] = -1612953070;
        jq.kenr[327] = -1875851558;
        jq.kenr[328] = 180179164;
        jq.kenr[329] = 1470329505;
        jq.kenr[330] = 75992037;
        jq.kenr[331] = -272502613;
        jq.kenr[332] = 1191651285;
        jq.kenr[333] = 1854072309;
        jq.kenr[334] = 1426680900;
        jq.kenr[335] = 812692396;
        jq.kenr[336] = -606900239;
        jq.kenr[337] = -2052768964;
        jq.kenr[338] = -337551374;
        jq.kenr[339] = -397076422;
        jq.kenr[340] = 622882545;
        jq.kenr[341] = 851341045;
        jq.kenr[342] = -1046335313;
        jq.kenr[343] = 1278734634;
        jq.kenr[344] = 357448076;
        jq.kenr[345] = -1677904953;
        jq.kenr[346] = 1167624751;
        jq.kenr[347] = 756740897;
        jq.kenr[348] = -1478305442;
        jq.kenr[349] = -315386377;
        jq.kenr[350] = -347110204;
        jq.kenr[351] = -810282715;
        jq.kenr[352] = 135950698;
        jq.kenr[353] = -1434745987;
        jq.kenr[354] = 110766449;
        jq.kenr[355] = 717434729;
        jq.kenr[356] = 1973347127;
        jq.kenr[357] = 837186161;
        jq.kenr[358] = 1221794577;
        jq.kenr[359] = 403080137;
        jq.kenr[360] = 1031190301;
        jq.kenr[361] = -351891313;
        jq.kenr[362] = 1232189030;
        jq.kenr[363] = 184760557;
        jq.kenr[364] = 133385471;
        jq.kenr[365] = 487800386;
        jq.kenr[366] = -64598363;
        jq.kenr[367] = 1713186820;
        jq.kenr[368] = -1302161376;
        jq.kenr[369] = -1034831494;
        jq.kenr[370] = -1247446492;
        jq.kenr[371] = 315733885;
        jq.kenr[372] = -590810732;
        jq.kenr[373] = -1132054549;
        jq.kenr[374] = 1885636687;
        jq.kenr[375] = 1922512965;
        jq.kenr[376] = -181684780;
        jq.kenr[377] = -910106947;
        jq.kenr[378] = -771260550;
        jq.kenr[379] = -2078057895;
        jq.kenr[380] = -1824670223;
        jq.kenr[381] = 1981632454;
        jq.kenr[382] = 325275359;
        jq.kenr[383] = 2045803369;
        jq.kenr[384] = 1691023533;
        jq.kenr[385] = -314393442;
        jq.kenr[386] = 1442651109;
        jq.kenr[387] = 1409481434;
        jq.kenr[388] = 1028694515;
        jq.kenr[389] = 417182133;
        jq.kenr[390] = 1025099694;
        jq.kenr[391] = 91017088;
        jq.kenr[392] = 1443092670;
        jq.kenr[393] = 1999378115;
        jq.kenr[394] = 1275005789;
        jq.kenr[395] = -2028009458;
        jq.kenr[396] = -1218402763;
        jq.kenr[397] = -918089510;
        jq.kenr[398] = -1187388767;
        jq.kenr[399] = 176028861;
    }

    private static /* synthetic */ void kioe() {
        jq.kens[1300] = 1803557914;
        jq.kens[1301] = 1038349702;
        jq.kens[1302] = 1963117847;
        jq.kens[1303] = -1151816828;
        jq.kens[1304] = 1202226785;
        jq.kens[1305] = 656788224;
        jq.kens[1306] = -904320769;
        jq.kens[1307] = 352311089;
        jq.kens[1308] = 388454068;
        jq.kens[1309] = -1288181967;
        jq.kens[1310] = -1072561755;
        jq.kens[1311] = 1273344460;
        jq.kens[1312] = -1532340043;
        jq.kens[1313] = -1770467557;
        jq.kens[1314] = -1917230549;
        jq.kens[1315] = -297220812;
        jq.kens[1316] = -1615664053;
        jq.kens[1317] = -458604700;
        jq.kens[1318] = -1411029460;
        jq.kens[1319] = 1291767084;
        jq.kens[1320] = 1329849984;
        jq.kens[1321] = 1829104675;
        jq.kens[1322] = -1175620156;
        jq.kens[1323] = 321649435;
        jq.kens[1324] = -524917284;
        jq.kens[1325] = -1083609911;
        jq.kens[1326] = 1680526560;
        jq.kens[1327] = -775898181;
        jq.kens[1328] = 1701324148;
        jq.kens[1329] = 129418355;
        jq.kens[1330] = 397556811;
        jq.kens[1331] = -1416556042;
        jq.kens[1332] = 1441532277;
        jq.kens[1333] = -1811815146;
        jq.kens[1334] = 1119499805;
        jq.kens[1335] = -1001220577;
        jq.kens[1336] = 830428392;
        jq.kens[1337] = 1368936167;
        jq.kens[1338] = 657831872;
        jq.kens[1339] = -455857422;
        jq.kens[1340] = -2103455941;
        jq.kens[1341] = 1386752703;
        jq.kens[1342] = 1709198831;
        jq.kens[1343] = -2023840345;
        jq.kens[1344] = 447785025;
        jq.kens[1345] = 533872710;
        jq.kens[1346] = -1030155227;
        jq.kens[1347] = 1132593493;
        jq.kens[1348] = 2007223236;
        jq.kens[1349] = 171711425;
        jq.kens[1350] = -2028382623;
        jq.kens[1351] = -1915975081;
        jq.kens[1352] = -658936064;
        jq.kens[1353] = -1551286114;
        jq.kens[1354] = -664418178;
        jq.kens[1355] = -1051198013;
        jq.kens[1356] = -1155178934;
        jq.kens[1357] = -996333904;
        jq.kens[1358] = 725161692;
        jq.kens[1359] = 1677978807;
        jq.kens[1360] = -1270410491;
        jq.kens[1361] = 1346699949;
        jq.kens[1362] = 1089690687;
        jq.kens[1363] = 1992665956;
        jq.kens[1364] = 1483379818;
        jq.kens[1365] = -967723037;
        jq.kens[1366] = 1712483304;
        jq.kens[1367] = 1557490410;
        jq.kens[1368] = 245186586;
        jq.kens[1369] = -1381254160;
        jq.kens[1370] = -366181832;
        jq.kens[1371] = 1971939480;
        jq.kens[1372] = -1970907003;
        jq.kens[1373] = -1015436948;
        jq.kens[1374] = -1056066902;
        jq.kens[1375] = -1564542291;
        jq.kens[1376] = -1559611159;
        jq.kens[1377] = 111800711;
        jq.kens[1378] = -2089465139;
        jq.kens[1379] = -1708229386;
        jq.kens[1380] = -255480698;
        jq.kens[1381] = -579423349;
        jq.kens[1382] = 670163290;
        jq.kens[1383] = 1820988395;
        jq.kens[1384] = 1975671908;
        jq.kens[1385] = -887278577;
        jq.kens[1386] = 1638194359;
        jq.kens[1387] = -1932000537;
        jq.kens[1388] = -1968148845;
        jq.kens[1389] = -396160125;
        jq.kens[1390] = -359532489;
        jq.kens[1391] = -229178937;
        jq.kens[1392] = -1968286270;
        jq.kens[1393] = 1103614965;
        jq.kens[1394] = -497916833;
        jq.kens[1395] = -1085632642;
        jq.kens[1396] = 313367717;
        jq.kens[1397] = 791683583;
        jq.kens[1398] = -1940063016;
        jq.kens[1399] = 1570093581;
    }

    private static /* synthetic */ void kirj() {
        jq.keqg[200] = 3227617374095580776L;
        jq.keqg[201] = 1044598856673311824L;
        jq.keqg[202] = 3664936699259078571L;
        jq.keqg[203] = -7978317709577215887L;
        jq.keqg[204] = -127065389187831329L;
        jq.keqg[205] = 5528012434683765922L;
        jq.keqg[206] = -4351350943986962106L;
        jq.keqg[207] = 7822412731283392744L;
        jq.keqg[208] = -6826674492501940616L;
        jq.keqg[209] = 3944696924216856536L;
        jq.keqg[210] = 8429544529904599073L;
        jq.keqg[211] = 465908466427315245L;
        jq.keqg[212] = -3523899123285787299L;
        jq.keqg[213] = -874498304812903752L;
        jq.keqg[214] = -8484218518097304063L;
        jq.keqg[215] = 7177674532649109340L;
        jq.keqg[216] = 8474603403084638806L;
        jq.keqg[217] = 7769361217392476576L;
        jq.keqg[218] = 8675138362539219628L;
        jq.keqg[219] = -5042557182389676040L;
        jq.keqg[220] = 2241368852555041429L;
        jq.keqg[221] = 2284298970630075375L;
        jq.keqg[222] = 4825672160488749102L;
        jq.keqg[223] = 1523337903036636232L;
        jq.keqg[224] = -4154294753875961123L;
        jq.keqg[225] = -9058822329599715234L;
        jq.keqg[226] = 8942812415935452176L;
        jq.keqg[227] = 8258969580145658635L;
        jq.keqg[228] = -6202375652706701132L;
        jq.keqg[229] = -5276303255227932953L;
        jq.keqg[230] = 2501230260668767025L;
        jq.keqg[231] = 8039074534928997328L;
        jq.keqg[232] = 8080229849424376312L;
        jq.keqg[233] = -6524880167761083179L;
        jq.keqg[234] = 2262309553772803070L;
        jq.keqg[235] = -2208159574035528348L;
        jq.keqg[236] = -1068220417776232796L;
        jq.keqg[237] = -6296497654356575413L;
        jq.keqg[238] = 3837758157397754333L;
        jq.keqg[239] = 1189056047082323996L;
        jq.keqg[240] = 7512187386277275467L;
        jq.keqg[241] = 3141360999053333248L;
        jq.keqg[242] = 8066338986393903504L;
        jq.keqg[243] = -5653817177314350060L;
        jq.keqg[244] = 7097433005302793052L;
        jq.keqg[245] = -7227037586013169970L;
        jq.keqg[246] = 8076894964899052593L;
        jq.keqg[247] = 5062799391274819805L;
        jq.keqg[248] = 3423859081635604300L;
        jq.keqg[249] = 7348170037003858123L;
        jq.keqg[250] = -3276358196752742392L;
        jq.keqg[251] = 1863030215992718327L;
        jq.keqg[252] = 2107008124162807661L;
        jq.keqg[253] = -5610843706951704696L;
        jq.keqg[254] = -900894535232741926L;
        jq.keqg[255] = 1100896466089789506L;
        jq.keqg[256] = 5688415655938754046L;
        jq.keqg[257] = 2033130385175177434L;
        jq.keqg[258] = -5187984489141994920L;
        jq.keqg[259] = 4441746333734991966L;
        jq.keqg[260] = 4565610341197724419L;
        jq.keqg[261] = 2409665188232444958L;
        jq.keqg[262] = 3892841614899506139L;
        jq.keqg[263] = -8838552385385999280L;
        jq.keqg[264] = 7648319236268323919L;
        jq.keqg[265] = 7631029771682181994L;
        jq.keqg[266] = -4600300204420853464L;
        jq.keqg[267] = -7880317510449197005L;
        jq.keqg[268] = -965003641473933992L;
        jq.keqg[269] = 3475964824607789204L;
        jq.keqg[270] = 3609902160894191307L;
        jq.keqg[271] = 8564118135283851929L;
        jq.keqg[272] = 282328289664427889L;
        jq.keqg[273] = -7466867647955413106L;
        jq.keqg[274] = 522523164405001298L;
        jq.keqg[275] = -3195968103499728781L;
        jq.keqg[276] = 2225322547144113551L;
        jq.keqg[277] = 2965297696503495582L;
        jq.keqg[278] = -8120067295381434157L;
        jq.keqg[279] = -2528155166724433866L;
        jq.keqg[280] = -7345485437645024656L;
        jq.keqg[281] = -6598105503433579605L;
        jq.keqg[282] = 1492178924145844848L;
        jq.keqg[283] = 242194908078886633L;
        jq.keqg[284] = -5286960758863175787L;
        jq.keqg[285] = -5259058355595082079L;
        jq.keqg[286] = 2698692979421678277L;
        jq.keqg[287] = 329389471671975572L;
        jq.keqg[288] = -2483740859844281976L;
        jq.keqg[289] = 6461004741613336398L;
        jq.keqg[290] = -825681071649700340L;
        jq.keqg[291] = -8344786853062414008L;
        jq.keqg[292] = -5692395603871092536L;
        jq.keqg[293] = -2613779158426460492L;
        jq.keqg[294] = 1086834769246662350L;
        jq.keqg[295] = 4600906738388410119L;
        jq.keqg[296] = -2619567216926383865L;
        jq.keqg[297] = -8652388790147824582L;
        jq.keqg[298] = -3460215733791050070L;
        jq.keqg[299] = 6721991710864704446L;
    }

    private static /* synthetic */ void kill() {
        jq.kenr[1300] = -1803557915;
        jq.kenr[1301] = -1281084894;
        jq.kenr[1302] = -1963117848;
        jq.kenr[1303] = 1336219093;
        jq.kenr[1304] = 1202226784;
        jq.kenr[1305] = 656788224;
        jq.kenr[1306] = -904320776;
        jq.kenr[1307] = 352311088;
        jq.kenr[1308] = 388454065;
        jq.kenr[1309] = -1288181967;
        jq.kenr[1310] = -1072561758;
        jq.kenr[1311] = 1273344460;
        jq.kenr[1312] = -1532340048;
        jq.kenr[1313] = -1770467554;
        jq.kenr[1314] = -1917230552;
        jq.kenr[1315] = -297220803;
        jq.kenr[1316] = -1615664053;
        jq.kenr[1317] = -458604699;
        jq.kenr[1318] = 1143938729;
        jq.kenr[1319] = 1291767085;
        jq.kenr[1320] = -1739910523;
        jq.kenr[1321] = -1829104676;
        jq.kenr[1322] = 1373037560;
        jq.kenr[1323] = 321649435;
        jq.kenr[1324] = -524917283;
        jq.kenr[1325] = -1637154816;
        jq.kenr[1326] = 1680526561;
        jq.kenr[1327] = 736091498;
        jq.kenr[1328] = 1701324150;
        jq.kenr[1329] = 129418352;
        jq.kenr[1330] = 397556808;
        jq.kenr[1331] = -1416556041;
        jq.kenr[1332] = -1441532278;
        jq.kenr[1333] = 1878450635;
        jq.kenr[1334] = 1119499804;
        jq.kenr[1335] = -217489830;
        jq.kenr[1336] = 830428392;
        jq.kenr[1337] = 1368936166;
        jq.kenr[1338] = 931256643;
        jq.kenr[1339] = -455857421;
        jq.kenr[1340] = 1544890016;
        jq.kenr[1341] = 1386752702;
        jq.kenr[1342] = -987938738;
        jq.kenr[1343] = -2023840346;
        jq.kenr[1344] = 494799934;
        jq.kenr[1345] = 533872711;
        jq.kenr[1346] = 1211479554;
        jq.kenr[1347] = 1132593492;
        jq.kenr[1348] = 2007223236;
        jq.kenr[1349] = 171711438;
        jq.kenr[1350] = -2028382609;
        jq.kenr[1351] = -1915975075;
        jq.kenr[1352] = -658936061;
        jq.kenr[1353] = -1551286121;
        jq.kenr[1354] = -664418194;
        jq.kenr[1355] = -1051198015;
        jq.kenr[1356] = -1155178933;
        jq.kenr[1357] = -996333892;
        jq.kenr[1358] = 725161689;
        jq.kenr[1359] = 1677978791;
        jq.kenr[1360] = -1270410487;
        jq.kenr[1361] = 1346699939;
        jq.kenr[1362] = 1089690677;
        jq.kenr[1363] = 1992665958;
        jq.kenr[1364] = 1483379808;
        jq.kenr[1365] = -967723039;
        jq.kenr[1366] = 1712483305;
        jq.kenr[1367] = 2022508908;
        jq.kenr[1368] = 245186587;
        jq.kenr[1369] = -1381254159;
        jq.kenr[1370] = 1462643328;
        jq.kenr[1371] = -1971939481;
        jq.kenr[1372] = -1153995916;
        jq.kenr[1373] = -1015436947;
        jq.kenr[1374] = 1334615484;
        jq.kenr[1375] = -1564542292;
        jq.kenr[1376] = 1168158083;
        jq.kenr[1377] = 111800710;
        jq.kenr[1378] = -2089465139;
        jq.kenr[1379] = -1708229387;
        jq.kenr[1380] = -255480690;
        jq.kenr[1381] = -579423347;
        jq.kenr[1382] = 670163292;
        jq.kenr[1383] = 1820988393;
        jq.kenr[1384] = 1975671904;
        jq.kenr[1385] = -887278587;
        jq.kenr[1386] = 1638194359;
        jq.kenr[1387] = -1932000540;
        jq.kenr[1388] = -1968148838;
        jq.kenr[1389] = -396160117;
        jq.kenr[1390] = -359532494;
        jq.kenr[1391] = -229178938;
        jq.kenr[1392] = -1968286261;
        jq.kenr[1393] = 1103614974;
        jq.kenr[1394] = -497916834;
        jq.kenr[1395] = -384368259;
        jq.kenr[1396] = 313367716;
        jq.kenr[1397] = 1550160618;
        jq.kenr[1398] = -1940063015;
        jq.kenr[1399] = -1439339831;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void applyHoldSwing(class_4587 var1_1, class_742 var2_2, class_1268 var3_3, class_1799 var4_4, float var5_5) {
        block248: {
            block247: {
                block246: {
                    block245: {
                        block242: {
                            block244: {
                                block243: {
                                    block241: {
                                        block240: {
                                            var13_6 = jq.c;
                                            var12_7 /* !! */  = jq.b;
                                            var11_8 = jq.a;
                                            if (var13_6) {
                                                throw null;
lbl6:
                                                // 63 sources

                                                return;
                                            }
                                            if (var11_8 || var11_8) ** GOTO lbl6
                                            if (var3_3 != class_1268.field_5808) break block240;
                                            if (var11_8) ** GOTO lbl6
                                            v0 = jq.kent("khdp", keoa(int ), (int)949);
                                            if (var13_6) {
                                                throw null;
                                            }
                                            break block241;
                                        }
                                        if (var11_8 || var11_8) ** GOTO lbl6
                                        v0 = var6_9 = jq.kent("khdq", keoa(int ), (int)950);
                                    }
                                    if (var11_8 || var11_8) ** GOTO lbl6
                                    if (var2_2.method_6068() != class_1306.field_6182) break block242;
                                    if (var11_8) ** GOTO lbl6
                                    if (var6_9 != false) break block243;
                                    if (var11_8) ** GOTO lbl6
                                    v1 = jq.kent("khdr", keoa(int ), (int)951);
                                    if (var13_6) {
                                        throw null;
                                    }
                                    break block244;
                                }
                                if (var11_8 || var11_8) ** GOTO lbl6
                                v1 = var6_9 = jq.kent("khds", keoa(int ), (int)952);
                            }
                            if (var11_8) ** GOTO lbl6
                        }
                        if (var11_8 || var11_8) ** GOTO lbl6
                        if (var6_9 == false) break block245;
                        if (var11_8) ** GOTO lbl6
                        v2 = 1.0f;
                        if (var13_6) {
                            throw null;
                        }
                        break block246;
                    }
                    if (var11_8 || var11_8) ** GOTO lbl6
                    v2 = var7_10 = (float)jq.kent("khdt", kenp(int ), (int)953);
                }
                if (var11_8 || var11_8) ** GOTO lbl6
                if (var3_3 != class_1268.field_5808) break block247;
                if (var11_8) ** GOTO lbl6
                v3 = 1.0f;
                if (var13_6) {
                    throw null;
                }
                break block248;
            }
            if (var11_8 || var11_8) ** GOTO lbl6
            v3 = var8_11 = (float)jq.kent("khdu", kenp(int ), (int)954);
        }
        if (var12_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var11_8 || var11_8) ** GOTO lbl6
                var9_12 = this.holdSwingRot(var5_5);
                if (var11_8 || var11_8) ** GOTO lbl6
                var10_13 = this.holdEase(class_3532.method_15374((double)(var5_5 * jq.kent("khdv", kenp(int ), (int)955))));
                if (var11_8 || var11_8) ** GOTO lbl6
                if (!this.isSword(var4_4)) ** GOTO lbl81
                if (var11_8) ** GOTO lbl6
                if (!this.holdAttack.isSelected("\u0412\u043f\u0435\u0440\u0451\u0434")) ** GOTO lbl81
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_46416((float)(jq.kent("khdw", kenp(int ), (int)956) * var7_10 * var9_12), (float)(jq.kent("khdx", kenp(int ), (int)957) * var9_12), (float)(jq.kent("khdy", kenp(int ), (int)958) * var10_13));
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_46416((float)(jq.kent("khdz", kenp(int ), (int)959) * var7_10 * var10_13), (float)(jq.kent("khea", kenp(int ), (int)960) * var10_13), (float)(jq.kent("kheb", kenp(int ), (int)961) * var9_12));
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees((float)(jq.kent("khec", kenp(int ), (int)962) * var9_12 * var7_10)));
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_22907((Quaternionfc)class_7833.field_40713.rotationDegrees((float)(jq.kent("khed", kenp(int ), (int)963) * var9_12)));
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees((float)(jq.kent("khee", kenp(int ), (int)964) * var9_12 * var7_10)));
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_22907((Quaternionfc)class_7833.field_40713.rotationDegrees((float)(jq.kent("khef", kenp(int ), (int)965) * var10_13)));
                if (var11_8 || var11_8) ** GOTO lbl6
                return;
lbl81:
                // 2 sources

                if (var11_8 || var11_8) ** GOTO lbl6
                if (!this.isSword(var4_4)) ** GOTO lbl89
                if (var11_8) ** GOTO lbl6
                if (!this.holdAttack.isSelected("\u041e\u0431\u044b\u0447\u043d\u0430\u044f")) ** GOTO lbl89
                if (var11_8 || var11_8) ** GOTO lbl6
                this.genericHoldSwing(var1_1, var7_10, var9_12, var10_13);
                if (var11_8 || var11_8) ** GOTO lbl6
                return;
lbl89:
                // 2 sources

                if (var11_8 || var11_8) ** GOTO lbl6
                if (this.holdAlternateSwing) ** GOTO lbl98
                if (var11_8) ** GOTO lbl6
                if (var4_4.method_31573(class_3489.field_42612)) ** GOTO lbl98
                if (var11_8) ** GOTO lbl6
                if (var4_4.method_7976() == class_1839.field_8951) ** GOTO lbl98
                if (var11_8) ** GOTO lbl6
                if (var4_4.method_7976() != class_1839.field_8949) ** GOTO lbl132
                if (var11_8) ** GOTO lbl6
lbl98:
                // 4 sources

                if (var11_8 || var11_8) ** GOTO lbl6
                if (var4_4.method_31573(class_3489.field_42615)) ** GOTO lbl132
                if (var11_8 || var11_8) ** GOTO lbl6
                if (!this.isWeapon(var4_4)) ** GOTO lbl120
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_46416((float)(jq.kent("kheg", kenp(int ), (int)966) * var7_10 * var9_12), (float)(jq.kent("kheh", kenp(int ), (int)967) * var9_12), (float)(jq.kent("khei", kenp(int ), (int)968) * var10_13));
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees((float)(jq.kent("khej", kenp(int ), (int)969) * var9_12 * var7_10)));
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_22907((Quaternionfc)class_7833.field_40713.rotationDegrees((float)(jq.kent("khek", kenp(int ), (int)970) * var9_12)));
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees((float)(jq.kent("khel", kenp(int ), (int)971) * var9_12 * var7_10)));
                if (var11_8 || var11_8) ** GOTO lbl6
                if (this.isSword(var4_4)) {
                    v4 = jq.kent("khem", kenp(int ), (int)972);
                    if (var13_6) {
                        throw null;
                    }
                } else {
                    v4 = jq.kent("khen", kenp(int ), (int)973);
                }
                var1_1.method_22907((Quaternionfc)class_7833.field_40713.rotationDegrees((float)(v4 * var10_13)));
                if (var11_8 || var11_8) ** GOTO lbl6
                return;
lbl120:
                // 1 sources

                if (var11_8 || var11_8) ** GOTO lbl6
                if (var4_4.method_7976() != class_1839.field_8951) ** GOTO lbl132
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_46416(0.0f, 0.0f, (float)(jq.kent("kheo", kenp(int ), (int)974) * var9_12));
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_46416((float)(jq.kent("khep", kenp(int ), (int)975) * var8_11 * var10_13), (float)(jq.kent("kheq", kenp(int ), (int)976) * var9_12), (float)(jq.kent("kher", kenp(int ), (int)977) * var10_13));
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees((float)(jq.kent("khes", kenp(int ), (int)978) * var9_12 * var7_10)));
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees((float)(jq.kent("khet", kenp(int ), (int)979) * var9_12 * var7_10)));
                if (var11_8 || var11_8) ** GOTO lbl6
                return;
lbl132:
                // 3 sources

                if (var11_8 || var11_8) ** GOTO lbl6
                if (!var4_4.method_31573(class_3489.field_42615)) ** GOTO lbl142
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_46416(0.0f, (float)(jq.kent("kheu", kenp(int ), (int)980) * var9_12), (float)(jq.kent("khev", kenp(int ), (int)981) * var9_12 - jq.kent("khew", kenp(int ), (int)982) * var10_13));
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees((float)(jq.kent("khex", kenp(int ), (int)983) * var9_12)));
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees((float)(jq.kent("khey", kenp(int ), (int)984) * var9_12 + jq.kent("khez", kenp(int ), (int)985) * var10_13)));
                if (var11_8 || var11_8) ** GOTO lbl6
                return;
lbl142:
                // 1 sources

                if (var11_8 || var11_8) ** GOTO lbl6
                if (!this.isSword(var4_4)) ** GOTO lbl158
                if (var11_8) ** GOTO lbl6
                if (this.holdAlternateSwing) ** GOTO lbl158
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_46416((float)(jq.kent("khfa", kenp(int ), (int)986) * var7_10 * var9_12), (float)(jq.kent("khfb", kenp(int ), (int)987) * var9_12), (float)(jq.kent("khfc", kenp(int ), (int)988) * var10_13));
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees((float)(jq.kent("khfd", kenp(int ), (int)989) * var9_12 * var7_10)));
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_22907((Quaternionfc)class_7833.field_40713.rotationDegrees((float)(jq.kent("khfe", kenp(int ), (int)990) * var9_12)));
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees((float)(jq.kent("khff", kenp(int ), (int)991) * var9_12 * var7_10)));
                if (var11_8 || var11_8) ** GOTO lbl6
                var1_1.method_22907((Quaternionfc)class_7833.field_40713.rotationDegrees((float)(jq.kent("khfg", kenp(int ), (int)992) * var10_13)));
                if (var11_8 || var11_8) ** GOTO lbl6
                return;
lbl158:
                // 2 sources

                if (var11_8 || var11_8) ** GOTO lbl6
                this.genericHoldSwing(var1_1, var7_10, var9_12, var10_13);
                if (!var11_8 && !var11_8) ** break;
                ** continue;
                return;
            }
lbl163:
            // 2 sources

            case 0: {
                var12_7 /* !! */  = (int)jq.kent("khfh", keoa(int ), (int)993);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl622
            }
lbl168:
            // 2 sources

            case 1: {
                var12_7 /* !! */  = (int)jq.kent("khfi", keoa(int ), (int)994);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl337
            }
lbl173:
            // 4 sources

            case 2: {
                var12_7 /* !! */  = (int)jq.kent("khfj", keoa(int ), (int)995);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl380
            }
            case 3: {
                var12_7 /* !! */  = (int)jq.kent("khfk", keoa(int ), (int)996);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl366
            }
lbl183:
            // 3 sources

            case 4: {
                var12_7 /* !! */  = (int)jq.kent("khfl", keoa(int ), (int)997);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl318
            }
lbl188:
            // 2 sources

            case 5: {
                var12_7 /* !! */  = (int)jq.kent("khfm", keoa(int ), (int)998);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl193:
            // 3 sources

            case 6: {
                var12_7 /* !! */  = (int)jq.kent("khfn", keoa(int ), (int)999);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl653
            }
lbl198:
            // 2 sources

            case 7: {
                var12_7 /* !! */  = (int)jq.kent("khfo", keoa(int ), (int)1000);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl526
            }
lbl203:
            // 2 sources

            case 8: {
                var12_7 /* !! */  = (int)jq.kent("khfp", keoa(int ), (int)1001);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl449
            }
lbl208:
            // 2 sources

            case 9: {
                var12_7 /* !! */  = (int)jq.kent("khfq", keoa(int ), (int)1002);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl322
            }
lbl213:
            // 2 sources

            case 10: {
                var12_7 /* !! */  = (int)jq.kent("khfr", keoa(int ), (int)1003);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl218:
            // 2 sources

            case 11: {
                var12_7 /* !! */  = (int)jq.kent("khfs", keoa(int ), (int)1004);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl573
            }
lbl223:
            // 4 sources

            case 12: {
                var12_7 /* !! */  = (int)jq.kent("khft", keoa(int ), (int)1005);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl677
            }
            case 13: {
                var12_7 /* !! */  = (int)jq.kent("khfu", keoa(int ), (int)1006);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl649
            }
lbl233:
            // 2 sources

            case 14: {
                var12_7 /* !! */  = (int)jq.kent("khfv", keoa(int ), (int)1007);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl521
            }
            case 15: {
                var12_7 /* !! */  = (int)jq.kent("khfw", keoa(int ), (int)1008);
                if (!var13_6) ** GOTO lbl168
                throw null;
            }
            case 16: {
                var12_7 /* !! */  = (int)jq.kent("khfx", keoa(int ), (int)1009);
                if (!var13_6) ** GOTO lbl183
                throw null;
            }
            case 17: {
                var12_7 /* !! */  = (int)jq.kent("khfy", keoa(int ), (int)1010);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl653
            }
            case 18: {
                var12_7 /* !! */  = (int)jq.kent("khfz", keoa(int ), (int)1011);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl560
            }
            case 19: {
                var12_7 /* !! */  = (int)jq.kent("khga", keoa(int ), (int)1012);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl497
            }
            case 20: {
                var12_7 /* !! */  = (int)jq.kent("khgb", keoa(int ), (int)1013);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl690
            }
lbl266:
            // 2 sources

            case 21: {
                var12_7 /* !! */  = (int)jq.kent("khgc", keoa(int ), (int)1014);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl304
            }
            case 22: {
                var12_7 /* !! */  = (int)jq.kent("khgd", keoa(int ), (int)1015);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl521
            }
lbl276:
            // 2 sources

            case 23: {
                var12_7 /* !! */  = (int)jq.kent("khge", keoa(int ), (int)1016);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl596
            }
            case 24: {
                var12_7 /* !! */  = (int)jq.kent("khgf", keoa(int ), (int)1017);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl412
            }
            case 25: {
                var12_7 /* !! */  = (int)jq.kent("khgg", keoa(int ), (int)1018);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl318
            }
            case 26: {
                var12_7 /* !! */  = (int)jq.kent("khgh", keoa(int ), (int)1019);
                if (!var13_6) ** GOTO lbl276
                throw null;
            }
            case 27: {
                var12_7 /* !! */  = (int)jq.kent("khgi", keoa(int ), (int)1020);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl300:
            // 2 sources

            case 28: {
                var12_7 /* !! */  = (int)jq.kent("khgj", keoa(int ), (int)1021);
                if (!var13_6) ** GOTO lbl203
                throw null;
            }
lbl304:
            // 2 sources

            case 29: {
                var12_7 /* !! */  = (int)jq.kent("khgk", keoa(int ), (int)1022);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl622
            }
lbl309:
            // 4 sources

            case 30: {
                var12_7 /* !! */  = (int)jq.kent("khgl", keoa(int ), (int)1023);
                if (var13_6) {
                    throw null;
                }
            }
            case 31: {
                var12_7 /* !! */  = (int)jq.kent("khgm", keoa(int ), (int)1024);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl444
            }
lbl318:
            // 3 sources

            case 32: {
                var12_7 /* !! */  = (int)jq.kent("khgn", keoa(int ), (int)1025);
                if (!var13_6) ** GOTO lbl223
                throw null;
            }
lbl322:
            // 3 sources

            case 33: {
                var12_7 /* !! */  = (int)jq.kent("khgo", keoa(int ), (int)1026);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl380
            }
            case 34: {
                var12_7 /* !! */  = (int)jq.kent("khgp", keoa(int ), (int)1027);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl502
            }
            case 35: {
                var12_7 /* !! */  = (int)jq.kent("khgq", keoa(int ), (int)1028);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl434
            }
lbl337:
            // 3 sources

            case 36: {
                var12_7 /* !! */  = (int)jq.kent("khgr", keoa(int ), (int)1029);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl351
            }
            case 37: {
                var12_7 /* !! */  = (int)jq.kent("khgs", keoa(int ), (int)1030);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl626
            }
            case 38: {
                var12_7 /* !! */  = (int)jq.kent("khgt", keoa(int ), (int)1031);
                if (!var13_6) ** GOTO lbl300
                throw null;
            }
lbl351:
            // 2 sources

            case 39: {
                var12_7 /* !! */  = (int)jq.kent("khgu", keoa(int ), (int)1032);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl560
            }
            case 40: {
                var12_7 /* !! */  = (int)jq.kent("khgv", keoa(int ), (int)1033);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl472
            }
lbl361:
            // 3 sources

            case 41: {
                var12_7 /* !! */  = (int)jq.kent("khgw", keoa(int ), (int)1034);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl385
            }
lbl366:
            // 2 sources

            case 42: {
                var12_7 /* !! */  = (int)jq.kent("khgx", keoa(int ), (int)1035);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl463
            }
            case 43: {
                var12_7 /* !! */  = (int)jq.kent("khgy", keoa(int ), (int)1036);
                if (!var13_6) ** GOTO lbl193
                throw null;
            }
            case 44: {
                var12_7 /* !! */  = (int)jq.kent("khgz", keoa(int ), (int)1037);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl645
            }
lbl380:
            // 4 sources

            case 45: {
                var12_7 /* !! */  = (int)jq.kent("khha", keoa(int ), (int)1038);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl535
            }
lbl385:
            // 2 sources

            case 46: {
                var12_7 /* !! */  = (int)jq.kent("khhb", keoa(int ), (int)1039);
                if (!var13_6) ** GOTO lbl183
                throw null;
            }
            case 47: {
                var12_7 /* !! */  = (int)jq.kent("khhc", keoa(int ), (int)1040);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl657
            }
            case 48: {
                var12_7 /* !! */  = (int)jq.kent("khhd", keoa(int ), (int)1041);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl626
            }
            case 49: {
                var12_7 /* !! */  = (int)jq.kent("khhe", keoa(int ), (int)1042);
                if (!var13_6) ** GOTO lbl233
                throw null;
            }
            case 50: {
                var12_7 /* !! */  = (int)jq.kent("khhf", keoa(int ), (int)1043);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl468
            }
lbl408:
            // 2 sources

            case 51: {
                var12_7 /* !! */  = (int)jq.kent("khhg", keoa(int ), (int)1044);
                if (!var13_6) ** GOTO lbl198
                throw null;
            }
lbl412:
            // 2 sources

            case 52: {
                var12_7 /* !! */  = (int)jq.kent("khhh", keoa(int ), (int)1045);
                if (!var13_6) ** GOTO lbl163
                throw null;
            }
            case 53: {
                var12_7 /* !! */  = (int)jq.kent("khhi", keoa(int ), (int)1046);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl686
            }
            case 54: {
                var12_7 /* !! */  = (int)jq.kent("khhj", keoa(int ), (int)1047);
                if (!var13_6) ** GOTO lbl173
                throw null;
            }
            case 55: {
                var12_7 /* !! */  = (int)jq.kent("khhk", keoa(int ), (int)1048);
                if (!var13_6) ** GOTO lbl309
                throw null;
            }
            case 56: {
                var12_7 /* !! */  = (int)jq.kent("khhl", keoa(int ), (int)1049);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl649
            }
lbl434:
            // 2 sources

            case 57: {
                var12_7 /* !! */  = (int)jq.kent("khhm", keoa(int ), (int)1050);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl690
            }
lbl439:
            // 2 sources

            case 58: {
                var12_7 /* !! */  = (int)jq.kent("khhn", keoa(int ), (int)1051);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl485
            }
lbl444:
            // 2 sources

            case 59: {
                var12_7 /* !! */  = (int)jq.kent("khho", keoa(int ), (int)1052);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl618
            }
lbl449:
            // 2 sources

            case 60: {
                var12_7 /* !! */  = (int)jq.kent("khhp", keoa(int ), (int)1053);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl690
            }
lbl454:
            // 4 sources

            case 61: {
                var12_7 /* !! */  = (int)jq.kent("khhq", keoa(int ), (int)1054);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl686
            }
lbl459:
            // 3 sources

            case 62: {
                var12_7 /* !! */  = (int)jq.kent("khhr", keoa(int ), (int)1055);
                if (!var13_6) ** GOTO lbl380
                throw null;
            }
lbl463:
            // 2 sources

            case 63: {
                var12_7 /* !! */  = (int)jq.kent("khhs", keoa(int ), (int)1056);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl507
            }
lbl468:
            // 2 sources

            case 64: {
                var12_7 /* !! */  = (int)jq.kent("khht", keoa(int ), (int)1057);
                if (!var13_6) ** GOTO lbl459
                throw null;
            }
lbl472:
            // 5 sources

            case 65: {
                var12_7 /* !! */  = (int)jq.kent("khhu", keoa(int ), (int)1058);
                if (!var13_6) ** GOTO lbl193
                throw null;
            }
            case 66: {
                var12_7 /* !! */  = (int)jq.kent("khhv", keoa(int ), (int)1059);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl512
            }
            case 67: {
                var12_7 /* !! */  = (int)jq.kent("khhw", keoa(int ), (int)1060);
                if (!var13_6) ** GOTO lbl361
                throw null;
            }
lbl485:
            // 2 sources

            case 68: {
                var12_7 /* !! */  = (int)jq.kent("khhx", keoa(int ), (int)1061);
                if (!var13_6) ** GOTO lbl213
                throw null;
            }
            case 69: {
                var12_7 /* !! */  = (int)jq.kent("khhy", keoa(int ), (int)1062);
                if (!var13_6) ** GOTO lbl472
                throw null;
            }
            case 70: {
                var12_7 /* !! */  = (int)jq.kent("khhz", keoa(int ), (int)1063);
                if (!var13_6) ** GOTO lbl472
                throw null;
            }
lbl497:
            // 2 sources

            case 71: {
                var12_7 /* !! */  = (int)jq.kent("khia", keoa(int ), (int)1064);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl682
            }
lbl502:
            // 2 sources

            case 72: {
                var12_7 /* !! */  = (int)jq.kent("khib", keoa(int ), (int)1065);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl577
            }
lbl507:
            // 2 sources

            case 73: {
                var12_7 /* !! */  = (int)jq.kent("khic", keoa(int ), (int)1066);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl661
            }
lbl512:
            // 2 sources

            case 74: {
                var12_7 /* !! */  = (int)jq.kent("khid", keoa(int ), (int)1067);
                if (!var13_6) ** GOTO lbl472
                throw null;
            }
lbl516:
            // 2 sources

            case 75: {
                var12_7 /* !! */  = (int)jq.kent("khie", keoa(int ), (int)1068);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl645
            }
lbl521:
            // 4 sources

            case 76: {
                do {
                    var12_7 /* !! */  = (int)jq.kent("khif", keoa(int ), (int)1069);
                } while (!var13_6);
                throw null;
            }
lbl526:
            // 3 sources

            case 77: {
                var12_7 /* !! */  = (int)jq.kent("khig", keoa(int ), (int)1070);
                if (!var13_6) ** GOTO lbl266
                throw null;
            }
            case 78: {
                var12_7 /* !! */  = (int)jq.kent("khih", keoa(int ), (int)1071);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl592
            }
lbl535:
            // 2 sources

            case 79: {
                var12_7 /* !! */  = (int)jq.kent("khii", keoa(int ), (int)1072);
                if (!var13_6) ** GOTO lbl526
                throw null;
            }
            case 80: {
                var12_7 /* !! */  = (int)jq.kent("khij", keoa(int ), (int)1073);
                if (!var13_6) ** GOTO lbl173
                throw null;
            }
lbl543:
            // 2 sources

            case 81: {
                var12_7 /* !! */  = (int)jq.kent("khik", keoa(int ), (int)1074);
                if (!var13_6) ** GOTO lbl188
                throw null;
            }
lbl547:
            // 2 sources

            case 82: {
                var12_7 /* !! */  = (int)jq.kent("khil", keoa(int ), (int)1075);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl573
            }
            case 83: {
                var12_7 /* !! */  = (int)jq.kent("khim", keoa(int ), (int)1076);
                if (!var13_6) ** GOTO lbl454
                throw null;
            }
            case 84: {
                var12_7 /* !! */  = (int)jq.kent("khin", keoa(int ), (int)1077);
                if (!var13_6) ** GOTO lbl408
                throw null;
            }
lbl560:
            // 3 sources

            case 85: {
                var12_7 /* !! */  = (int)jq.kent("khio", keoa(int ), (int)1078);
                if (!var13_6) ** GOTO lbl361
                throw null;
            }
lbl564:
            // 2 sources

            case 86: {
                var12_7 /* !! */  = (int)jq.kent("khip", keoa(int ), (int)1079);
                if (!var13_6) ** GOTO lbl208
                throw null;
            }
lbl568:
            // 2 sources

            case 87: {
                var12_7 /* !! */  = (int)jq.kent("khiq", keoa(int ), (int)1080);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl587
            }
lbl573:
            // 3 sources

            case 88: {
                var12_7 /* !! */  = (int)jq.kent("khir", keoa(int ), (int)1081);
                if (!var13_6) ** GOTO lbl322
                throw null;
            }
lbl577:
            // 3 sources

            case 89: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_7 /* !! */  = (int)jq.kent("khis", keoa(int ), (int)1082);
                    if (var13_6) {
                        throw null;
                    }
                    ** GOTO lbl592
                    break;
                }
            }
            case 90: {
                var12_7 /* !! */  = (int)jq.kent("khit", keoa(int ), (int)1083);
                if (!var13_6) ** GOTO lbl439
                throw null;
            }
lbl587:
            // 2 sources

            case 91: {
                do {
                    var12_7 /* !! */  = (int)jq.kent("khiu", keoa(int ), (int)1084);
                } while (!var13_6);
                throw null;
            }
lbl592:
            // 3 sources

            case 92: {
                var12_7 /* !! */  = (int)jq.kent("khiv", keoa(int ), (int)1085);
                if (!var13_6) ** GOTO lbl454
                throw null;
            }
lbl596:
            // 2 sources

            case 93: {
                var12_7 /* !! */  = (int)jq.kent("khiw", keoa(int ), (int)1086);
                if (!var13_6) ** GOTO lbl173
                throw null;
            }
            case 94: {
                var12_7 /* !! */  = (int)jq.kent("khix", keoa(int ), (int)1087);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl618
            }
lbl605:
            // 2 sources

            case 95: {
                var12_7 /* !! */  = (int)jq.kent("khiy", keoa(int ), (int)1088);
                if (!var13_6) ** GOTO lbl521
                throw null;
            }
            case 96: {
                var12_7 /* !! */  = (int)jq.kent("khiz", keoa(int ), (int)1089);
                if (!var13_6) ** GOTO lbl547
                throw null;
            }
            case 97: {
                var12_7 /* !! */  = (int)jq.kent("khja", keoa(int ), (int)1090);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl641
            }
lbl618:
            // 3 sources

            case 98: {
                var12_7 /* !! */  = (int)jq.kent("khjb", keoa(int ), (int)1091);
                if (!var13_6) ** GOTO lbl564
                throw null;
            }
lbl622:
            // 3 sources

            case 99: {
                var12_7 /* !! */  = (int)jq.kent("khjc", keoa(int ), (int)1092);
                if (!var13_6) ** GOTO lbl605
                throw null;
            }
lbl626:
            // 3 sources

            case 100: {
                var12_7 /* !! */  = (int)jq.kent("khjd", keoa(int ), (int)1093);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl682
            }
            case 101: {
                var12_7 /* !! */  = (int)jq.kent("khje", keoa(int ), (int)1094);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl669
            }
lbl636:
            // 2 sources

            case 102: {
                var12_7 /* !! */  = (int)jq.kent("khjf", keoa(int ), (int)1095);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl698
            }
lbl641:
            // 2 sources

            case 103: {
                var12_7 /* !! */  = (int)jq.kent("khjg", keoa(int ), (int)1096);
                if (!var13_6) ** GOTO lbl459
                throw null;
            }
lbl645:
            // 3 sources

            case 104: {
                var12_7 /* !! */  = (int)jq.kent("khjh", keoa(int ), (int)1097);
                if (!var13_6) ** GOTO lbl516
                throw null;
            }
lbl649:
            // 4 sources

            case 105: {
                var12_7 /* !! */  = (int)jq.kent("khji", keoa(int ), (int)1098);
                if (!var13_6) ** GOTO lbl636
                throw null;
            }
lbl653:
            // 3 sources

            case 106: {
                var12_7 /* !! */  = (int)jq.kent("khjj", keoa(int ), (int)1099);
                if (var13_6) {
                    throw null;
                }
            }
lbl657:
            // 5 sources

            case 107: {
                var12_7 /* !! */  = (int)jq.kent("khjk", keoa(int ), (int)1100);
                if (!var13_6) ** GOTO lbl577
                throw null;
            }
lbl661:
            // 2 sources

            case 108: {
                var12_7 /* !! */  = (int)jq.kent("khjl", keoa(int ), (int)1101);
                if (!var13_6) ** GOTO lbl454
                throw null;
            }
            case 109: {
                var12_7 /* !! */  = (int)jq.kent("khjm", keoa(int ), (int)1102);
                if (!var13_6) ** GOTO lbl309
                throw null;
            }
lbl669:
            // 2 sources

            case 110: {
                var12_7 /* !! */  = (int)jq.kent("khjn", keoa(int ), (int)1103);
                if (var13_6) {
                    throw null;
                }
            }
            case 111: {
                var12_7 /* !! */  = (int)jq.kent("khjo", keoa(int ), (int)1104);
                if (!var13_6) ** GOTO lbl649
                throw null;
            }
lbl677:
            // 2 sources

            case 112: {
                var12_7 /* !! */  = (int)jq.kent("khjp", keoa(int ), (int)1105);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl690
            }
lbl682:
            // 3 sources

            case 113: {
                var12_7 /* !! */  = (int)jq.kent("khjq", keoa(int ), (int)1106);
                if (!var13_6) ** GOTO lbl568
                throw null;
            }
lbl686:
            // 3 sources

            case 114: {
                var12_7 /* !! */  = (int)jq.kent("khjr", keoa(int ), (int)1107);
                if (!var13_6) ** GOTO lbl218
                throw null;
            }
lbl690:
            // 5 sources

            case 115: {
                var12_7 /* !! */  = (int)jq.kent("khjs", keoa(int ), (int)1108);
                if (!var13_6) ** GOTO lbl657
                throw null;
            }
            case 116: {
                var12_7 /* !! */  = (int)jq.kent("khjt", keoa(int ), (int)1109);
                if (!var13_6) ** GOTO lbl543
                throw null;
            }
lbl698:
            // 2 sources

            case 117: {
                var12_7 /* !! */  = (int)jq.kent("khju", keoa(int ), (int)1110);
                if (var13_6) {
                    throw null;
                }
            }
            case 118: {
                var12_7 /* !! */  = (int)jq.kent("khjv", keoa(int ), (int)1111);
                if (!var13_6) ** GOTO lbl337
                throw null;
            }
            case 119: 
        }
        var12_7 /* !! */  = (int)jq.kent("khjw", keoa(int ), (int)1112);
        ** while (!var13_6)
lbl709:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kise() {
        jq.keqg[400] = 6090611376314836387L;
        jq.keqg[401] = 2675422226988456024L;
        jq.keqg[402] = 5476508220100252344L;
        jq.keqg[403] = -3575596526436472576L;
        jq.keqg[404] = -4530938588949150754L;
        jq.keqg[405] = -964428428951767107L;
        jq.keqg[406] = -7769371122922583468L;
        jq.keqg[407] = 827889166927896448L;
        jq.keqg[408] = -1685898722529657837L;
        jq.keqg[409] = -5645338354938862624L;
        jq.keqg[410] = 1155396880687769791L;
        jq.keqg[411] = 4336141713752362137L;
        jq.keqg[412] = -4748981012559835080L;
        jq.keqg[413] = -8238187857871469958L;
        jq.keqg[414] = 8585557822962235874L;
        jq.keqg[415] = -1656997483577105252L;
        jq.keqg[416] = -5580679590539956027L;
        jq.keqg[417] = -5438582472256386369L;
        jq.keqg[418] = 4863511175401825737L;
        jq.keqg[419] = 6124307459721708360L;
        jq.keqg[420] = -5114102036530477227L;
        jq.keqg[421] = 6265150148203294092L;
        jq.keqg[422] = 7868131566405939001L;
        jq.keqg[423] = 1053194724792087630L;
        jq.keqg[424] = 2320050630326706580L;
        jq.keqg[425] = 2269841979711384088L;
        jq.keqg[426] = -1243984984088019788L;
        jq.keqg[427] = -3259180676226954289L;
        jq.keqg[428] = 6838440233093423781L;
        jq.keqg[429] = 3940890829736225203L;
        jq.keqg[430] = 2381959125688295825L;
        jq.keqg[431] = -6614172716698998523L;
        jq.keqg[432] = 1143781141310971946L;
        jq.keqg[433] = 3706364627246896829L;
        jq.keqg[434] = -3892256814755421311L;
        jq.keqg[435] = 7228715224349039197L;
        jq.keqg[436] = 7917264078934004088L;
        jq.keqg[437] = -7846248917949962323L;
        jq.keqg[438] = -601174146097319872L;
        jq.keqg[439] = 4497437356933177270L;
        jq.keqg[440] = 2751280851333904586L;
        jq.keqg[441] = 1430682498818906449L;
        jq.keqg[442] = -918152902281672299L;
        jq.keqg[443] = -7105499735627187661L;
        jq.keqg[444] = 8817832293097863013L;
        jq.keqg[445] = -2913839138135119996L;
        jq.keqg[446] = 7279329843149064123L;
        jq.keqg[447] = 7522019690283987804L;
        jq.keqg[448] = -8912988390960034265L;
        jq.keqg[449] = 5805233266081626118L;
        jq.keqg[450] = -1625818870398162954L;
        jq.keqg[451] = -7877017459072217152L;
        jq.keqg[452] = 4950742752403106864L;
        jq.keqg[453] = -6437289879178400980L;
        jq.keqg[454] = -2322487985713609934L;
        jq.keqg[455] = -314236731572459581L;
        jq.keqg[456] = -7174176515736898567L;
        jq.keqg[457] = 5867773794067797261L;
        jq.keqg[458] = 9003459810685703088L;
        jq.keqg[459] = 4138751610329699652L;
        jq.keqg[460] = -4437239013296378330L;
        jq.keqg[461] = 7068718151642357057L;
        jq.keqg[462] = 1584287986239129900L;
        jq.keqg[463] = -1980249459013916783L;
        jq.keqg[464] = 5451400622604833371L;
        jq.keqg[465] = -5473492933772571910L;
        jq.keqg[466] = -72393901984743477L;
        jq.keqg[467] = 8984085618775980804L;
        jq.keqg[468] = 102983368122987730L;
        jq.keqg[469] = -378227454773103774L;
        jq.keqg[470] = -7173230781206259189L;
        jq.keqg[471] = -7716662318729874633L;
        jq.keqg[472] = -3278776041626441404L;
        jq.keqg[473] = 7053088159020793450L;
        jq.keqg[474] = 59911759153199134L;
        jq.keqg[475] = 8491521843565463124L;
        jq.keqg[476] = -6130119708066175024L;
        jq.keqg[477] = 7728669318850828052L;
        jq.keqg[478] = -7094366730663171710L;
        jq.keqg[479] = -5361414481136685187L;
        jq.keqg[480] = -5938617892021161867L;
        jq.keqg[481] = 5203664966283605553L;
        jq.keqg[482] = -434708254654714541L;
        jq.keqg[483] = 384011330100872099L;
        jq.keqg[484] = 2998507688986498052L;
        jq.keqg[485] = -2483374486629232258L;
        jq.keqg[486] = -3090559208211494L;
        jq.keqg[487] = -607305448415717788L;
        jq.keqg[488] = -5652478693590522432L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isTorch(class_1799 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jq.sf - jq.kent("khwr", keqe(int ), (int)311)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jq.kent("khws", keoa(int ), (int)1317)) break;
            v0 /* !! */  = (long)jq.kent("khwt", keoa(int ), (int)1318);
        }
        var4_2 = jq.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jq.sf - jq.kent("khwu", keqe(int ), (int)312)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == jq.kent("khwv", keoa(int ), (int)1319)) break;
            v1 /* !! */  = (long)jq.kent("khww", keoa(int ), (int)1320);
        }
        var3_3 /* !! */  = jq.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = jq.sf - jq.kent("khwx", keqe(int ), (int)313)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jq.kent("khwy", keoa(int ), (int)1321)) break;
            v2 /* !! */  = (long)jq.kent("khwz", keoa(int ), (int)1322);
        }
        var2_4 = jq.a;
        if (var4_2) {
            throw null;
lbl21:
            // 2 sources

            return (boolean)jq.kent("khxa", keoa(int ), (int)1323);
        }
        if (var2_4) ** GOTO lbl21
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                v3 /* !! */  = jq.sf;
                if (true) ** GOTO lbl32
                block25: while (true) {
                    v3 /* !! */  = (long)(jq.kent("khxc", keqe(int ), (int)315) - jq.kent("khxb", keqe(int ), (int)314));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 197898621: {
                            break block25;
                        }
                        case 242041178: {
                            continue block25;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = jq.sf - jq.kent("khxd", keqe(int ), (int)316)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == jq.kent("khxe", keoa(int ), (int)1324)) break;
                    v4 /* !! */  = (long)jq.kent("khxf", keoa(int ), (int)1325);
                }
                v5 = var1_1.method_7909();
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = jq.sf - jq.kent("khxg", keqe(int ), (int)317)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == jq.kent("khxh", keoa(int ), (int)1326)) break;
                    v6 /* !! */  = (long)jq.kent("khxi", keoa(int ), (int)1327);
                }
                v7 = class_7923.field_41178.method_10221((Object)v5);
                v8 /* !! */  = jq.sf;
                if (true) ** GOTO lbl53
                block28: while (true) {
                    v8 /* !! */  = (long)(v9 - jq.kent("khxj", keqe(int ), (int)318));
lbl53:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1712176453: {
                            v9 = jq.kent("khxk", keqe(int ), (int)319);
                            continue block28;
                        }
                        case -1109776925: {
                            v9 = jq.kent("khxl", keqe(int ), (int)320);
                            continue block28;
                        }
                        case 197898621: {
                            break block28;
                        }
                        case 2050729655: {
                            v9 = jq.kent("khxm", keqe(int ), (int)321);
                            continue block28;
                        }
                    }
                    break;
                }
                v10 = v7.method_12832();
                v11 /* !! */  = jq.sf;
                if (true) ** GOTO lbl70
                block29: while (true) {
                    v11 /* !! */  = (long)(v12 - jq.kent("khxn", keqe(int ), (int)322));
lbl70:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -59305209: {
                            v12 = jq.kent("khxo", keqe(int ), (int)323);
                            continue block29;
                        }
                        case 197898621: {
                            break block29;
                        }
                        case 327896417: {
                            v12 = jq.kent("khxp", keqe(int ), (int)324);
                            continue block29;
                        }
                    }
                    break;
                }
                return v10.contains("torch");
            }
            case 0: {
                var3_3 /* !! */  = (int)jq.kent("khxq", keoa(int ), (int)1328);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)jq.kent("khxr", keoa(int ), (int)1329);
                if (!var4_2) break;
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)jq.kent("khxs", keoa(int ), (int)1330);
                if (!var4_2) break;
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)jq.kent("khxt", keoa(int ), (int)1331);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void kilc() {
        jq.kenr[400] = -1367888793;
        jq.kenr[401] = 1532867986;
        jq.kenr[402] = 500438405;
        jq.kenr[403] = 1881556966;
        jq.kenr[404] = 651232508;
        jq.kenr[405] = -1529949930;
        jq.kenr[406] = -778237939;
        jq.kenr[407] = -1214390736;
        jq.kenr[408] = -1709239476;
        jq.kenr[409] = 843000624;
        jq.kenr[410] = 1900562191;
        jq.kenr[411] = 1552801762;
        jq.kenr[412] = -647736215;
        jq.kenr[413] = -877857381;
        jq.kenr[414] = 711349755;
        jq.kenr[415] = 1792465399;
        jq.kenr[416] = 1541104499;
        jq.kenr[417] = 458781054;
        jq.kenr[418] = 308460584;
        jq.kenr[419] = 1973074312;
        jq.kenr[420] = -1625242137;
        jq.kenr[421] = 2070209017;
        jq.kenr[422] = 989622400;
        jq.kenr[423] = -613113920;
        jq.kenr[424] = -569232235;
        jq.kenr[425] = 781472670;
        jq.kenr[426] = 106690257;
        jq.kenr[427] = -1127730786;
        jq.kenr[428] = 1624208034;
        jq.kenr[429] = 129232278;
        jq.kenr[430] = -1321408363;
        jq.kenr[431] = 1972849440;
        jq.kenr[432] = -1803227505;
        jq.kenr[433] = 980789542;
        jq.kenr[434] = 1222034865;
        jq.kenr[435] = 333844909;
        jq.kenr[436] = 627619289;
        jq.kenr[437] = -892351949;
        jq.kenr[438] = -1769265468;
        jq.kenr[439] = 1134740210;
        jq.kenr[440] = 1960211729;
        jq.kenr[441] = 1288265933;
        jq.kenr[442] = -1558330812;
        jq.kenr[443] = 847765238;
        jq.kenr[444] = -251683678;
        jq.kenr[445] = -1726041816;
        jq.kenr[446] = -1600329125;
        jq.kenr[447] = -2033947639;
        jq.kenr[448] = 1198577100;
        jq.kenr[449] = -358655753;
        jq.kenr[450] = -2090380365;
        jq.kenr[451] = 1134525841;
        jq.kenr[452] = -402759905;
        jq.kenr[453] = -539792841;
        jq.kenr[454] = -1306107512;
        jq.kenr[455] = 1292450814;
        jq.kenr[456] = 1455230591;
        jq.kenr[457] = -342619785;
        jq.kenr[458] = -1201518026;
        jq.kenr[459] = -1487070186;
        jq.kenr[460] = -372903716;
        jq.kenr[461] = 1494685850;
        jq.kenr[462] = 835174723;
        jq.kenr[463] = -390200947;
        jq.kenr[464] = -1897995500;
        jq.kenr[465] = -1548417667;
        jq.kenr[466] = 2072839963;
        jq.kenr[467] = -22122405;
        jq.kenr[468] = 1711445356;
        jq.kenr[469] = 732619567;
        jq.kenr[470] = -2015462096;
        jq.kenr[471] = 705959462;
        jq.kenr[472] = 1952891229;
        jq.kenr[473] = 1720335380;
        jq.kenr[474] = 1125725357;
        jq.kenr[475] = 922175832;
        jq.kenr[476] = -2008573534;
        jq.kenr[477] = 1596678932;
        jq.kenr[478] = -971243113;
        jq.kenr[479] = -1589359140;
        jq.kenr[480] = -190073341;
        jq.kenr[481] = 1963858630;
        jq.kenr[482] = 1784549003;
        jq.kenr[483] = -975344393;
        jq.kenr[484] = -171703303;
        jq.kenr[485] = 55951156;
        jq.kenr[486] = 41008317;
        jq.kenr[487] = -1505640054;
        jq.kenr[488] = -17203246;
        jq.kenr[489] = -879632168;
        jq.kenr[490] = -305844519;
        jq.kenr[491] = -63951455;
        jq.kenr[492] = -387597489;
        jq.kenr[493] = -1536059148;
        jq.kenr[494] = -739560953;
        jq.kenr[495] = -1890761934;
        jq.kenr[496] = -999488875;
        jq.kenr[497] = 608403219;
        jq.kenr[498] = -1891539381;
        jq.kenr[499] = 1205626604;
    }

    private static /* synthetic */ void kild() {
        jq.kenr[500] = 1925229167;
        jq.kenr[501] = -963396289;
        jq.kenr[502] = -1399560640;
        jq.kenr[503] = -1041518706;
        jq.kenr[504] = 1505738650;
        jq.kenr[505] = 1678083016;
        jq.kenr[506] = 2045769857;
        jq.kenr[507] = 1573223160;
        jq.kenr[508] = 1871939370;
        jq.kenr[509] = 2035686840;
        jq.kenr[510] = 1373306705;
        jq.kenr[511] = -763032930;
        jq.kenr[512] = 1148506190;
        jq.kenr[513] = 1122281072;
        jq.kenr[514] = 774289571;
        jq.kenr[515] = -1377273170;
        jq.kenr[516] = -634931996;
        jq.kenr[517] = 1390255078;
        jq.kenr[518] = 546116736;
        jq.kenr[519] = 1281672819;
        jq.kenr[520] = 2104970118;
        jq.kenr[521] = 1543846396;
        jq.kenr[522] = -2120362163;
        jq.kenr[523] = 257006020;
        jq.kenr[524] = -268549207;
        jq.kenr[525] = 691578509;
        jq.kenr[526] = 2047740410;
        jq.kenr[527] = 216141534;
        jq.kenr[528] = -429485333;
        jq.kenr[529] = -1050071290;
        jq.kenr[530] = 1186342950;
        jq.kenr[531] = 220611292;
        jq.kenr[532] = -1014882413;
        jq.kenr[533] = 2008298303;
        jq.kenr[534] = -59616213;
        jq.kenr[535] = 1822020254;
        jq.kenr[536] = -113852242;
        jq.kenr[537] = 718640124;
        jq.kenr[538] = -1003485582;
        jq.kenr[539] = 1449170100;
        jq.kenr[540] = -1432510349;
        jq.kenr[541] = -686825486;
        jq.kenr[542] = -2099391694;
        jq.kenr[543] = -961272340;
        jq.kenr[544] = -688446650;
        jq.kenr[545] = -1574143242;
        jq.kenr[546] = 1596028209;
        jq.kenr[547] = -1219356410;
        jq.kenr[548] = -82578117;
        jq.kenr[549] = 887714429;
        jq.kenr[550] = 1129327784;
        jq.kenr[551] = -2117869162;
        jq.kenr[552] = -850023573;
        jq.kenr[553] = 769739063;
        jq.kenr[554] = 107647029;
        jq.kenr[555] = -1463366963;
        jq.kenr[556] = 1083739206;
        jq.kenr[557] = -1671909357;
        jq.kenr[558] = 423803588;
        jq.kenr[559] = 1533775999;
        jq.kenr[560] = -1137934773;
        jq.kenr[561] = 1269424856;
        jq.kenr[562] = -1502839712;
        jq.kenr[563] = -381784903;
        jq.kenr[564] = 616522345;
        jq.kenr[565] = 935107672;
        jq.kenr[566] = 1802334480;
        jq.kenr[567] = 1115795142;
        jq.kenr[568] = -1216651214;
        jq.kenr[569] = 645190965;
        jq.kenr[570] = -392355407;
        jq.kenr[571] = 2106732566;
        jq.kenr[572] = 733996395;
        jq.kenr[573] = -101596420;
        jq.kenr[574] = 696488960;
        jq.kenr[575] = 70137960;
        jq.kenr[576] = -1459331553;
        jq.kenr[577] = 790219073;
        jq.kenr[578] = 1267133337;
        jq.kenr[579] = -634170026;
        jq.kenr[580] = -1176508160;
        jq.kenr[581] = 1787253493;
        jq.kenr[582] = -492895686;
        jq.kenr[583] = 280725281;
        jq.kenr[584] = 1572345243;
        jq.kenr[585] = 1368629290;
        jq.kenr[586] = -669199097;
        jq.kenr[587] = 1830297072;
        jq.kenr[588] = 1270394004;
        jq.kenr[589] = 2001537142;
        jq.kenr[590] = 2052852920;
        jq.kenr[591] = 49578294;
        jq.kenr[592] = -852635356;
        jq.kenr[593] = 865175778;
        jq.kenr[594] = 1997250728;
        jq.kenr[595] = 1115360504;
        jq.kenr[596] = 1915874872;
        jq.kenr[597] = 1838099319;
        jq.kenr[598] = -1058283692;
        jq.kenr[599] = 1901729843;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private float holdSwingRot(float var1_1) {
        while (true) {
            block42: {
                if ((v0 /* !! */  = (cfr_temp_1 = jq.sf - jq.kent("khnr", keqe(int ), (int)216)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  != jq.kent("khns", keoa(int ), (int)1178)) break block42;
                var4_2 = jq.c;
                v1 /* !! */  = jq.sf;
                if (true) ** GOTO lbl12
            }
            v0 /* !! */  = (long)jq.kent("khnt", keoa(int ), (int)1179);
        }
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - jq.kent("khnu", keqe(int ), (int)217));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1453937271: {
                    v2 = jq.kent("khnv", keqe(int ), (int)218);
                    continue block22;
                }
                case 122424818: {
                    v2 = jq.kent("khnw", keqe(int ), (int)219);
                    continue block22;
                }
                case 197898621: {
                    break block22;
                }
                case 654302269: {
                    v2 = jq.kent("khnx", keqe(int ), (int)220);
                    continue block22;
                }
            }
            break;
        }
        var3_3 /* !! */  = jq.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = jq.sf - jq.kent("khny", keqe(int ), (int)221)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == jq.kent("khnz", keoa(int ), (int)1180)) {
                var2_4 = jq.a;
                if (var4_2) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)jq.kent("khoa", keoa(int ), (int)1181);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block24: while (true) {
            block43: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var2_4 != false) return (float)jq.kent("khob", kenp(int ), (int)1182);
                        if (var2_4 != false) return (float)jq.kent("khob", kenp(int ), (int)1182);
                        if (var1_1 < jq.kent("khoc", kenp(int ), (int)1183)) {
                            if (var2_4 != false) return (float)jq.kent("khob", kenp(int ), (int)1182);
                            if (var2_4 != false) return (float)jq.kent("khob", kenp(int ), (int)1182);
                            v4 = jq.kent("khod", kenp(int ), (int)1184);
                            ** break;
                        }
                        if (var2_4 != false) return (float)jq.kent("khob", kenp(int ), (int)1182);
                        if (var2_4 != false) return (float)jq.kent("khob", kenp(int ), (int)1182);
                        v5 = jq.kent("khok", kenp(int ), (int)1188);
                        v6 = jq.kent("khol", kenp(int ), (int)1189);
                        while (true) {
                            if ((v7 /* !! */  = (cfr_temp_3 = jq.sf - jq.kent("khom", keqe(int ), (int)225)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v7 /* !! */  != jq.kent("khon", keoa(int ), (int)1190)) ** GOTO lbl55
                            v8 = class_3532.method_15363((float)var1_1, (float)v5, (float)v6) * jq.kent("khop", kenp(int ), (int)1192);
                            ** GOTO lbl101
lbl55:
                            // 1 sources

                            v7 /* !! */  = (long)jq.kent("khoo", keoa(int ), (int)1191);
                        }
                    }
                    case 3: {
                        var3_3 /* !! */  = (int)jq.kent("khow", keoa(int ), (int)1198);
                        cfr_temp_0 = 6;
                        if (var4_2) {
                            throw null;
                        }
                        break block43;
                    }
                    case 5: {
                        var3_3 /* !! */  = (int)jq.kent("khoy", keoa(int ), (int)1200);
                        cfr_temp_0 = 4;
                        if (var4_2) {
                            throw null;
                        }
                        break block43;
                    }
                    case 7: {
                        var3_3 /* !! */  = (int)jq.kent("khpa", keoa(int ), (int)1202);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 4: {
                        var3_3 /* !! */  = (int)jq.kent("khox", keoa(int ), (int)1199);
                        cfr_temp_0 = 6;
                        if (var4_2) {
                            throw null;
                        }
                        break block43;
                    }
                    case 8: {
                        var3_3 /* !! */  = (int)jq.kent("khpb", keoa(int ), (int)1203);
                        if (var4_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
lbl84:
                    // 1 sources

                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_4 = jq.sf - jq.kent("khoe", keqe(int ), (int)222)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v9 /* !! */  == jq.kent("khof", keoa(int ), (int)1185)) break;
                        v9 /* !! */  = (long)jq.kent("khog", keoa(int ), (int)1186);
                    }
                    v10 = class_3532.method_15363((float)var1_1, (float)0.0f, (float)v4) * jq.kent("khoh", kenp(int ), (int)1187);
                    v11 /* !! */  = jq.sf;
                    block27: while (true) {
                        switch ((int)v11 /* !! */ ) {
                            case -389553514: {
                                v11 /* !! */  = (long)(jq.kent("khoj", keqe(int ), (int)224) - jq.kent("khoi", keqe(int ), (int)223));
                                continue block27;
                            }
                            case 197898621: {
                                break block27;
                            }
                        }
                        break;
                    }
                    v12 = class_3532.method_15374((double)v10);
                    if (var4_2 == false) return v12;
                    throw null;
lbl101:
                    // 1 sources

                    while (true) {
                        if ((v13 /* !! */  = (cfr_temp_5 = jq.sf - jq.kent("khoq", keqe(int ), (int)226)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v13 /* !! */  == jq.kent("khor", keoa(int ), (int)1193)) {
                            v12 = class_3532.method_15374((double)v8);
                            return v12;
                        }
                        v13 /* !! */  = (long)jq.kent("khos", keoa(int ), (int)1194);
                    }
                    case 0: {
                        var3_3 /* !! */  = (int)jq.kent("khot", keoa(int ), (int)1195);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var3_3 /* !! */  = (int)jq.kent("khoz", keoa(int ), (int)1201);
                        cfr_temp_0 = 0;
                        if (var4_2) {
                            throw null;
                        }
                        break block43;
                    }
                    case 1: lbl-1000:
                    // 2 sources

                    {
                        var3_3 /* !! */  = (int)jq.kent("khou", keoa(int ), (int)1196);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl127
            }
            do {
                if (true) continue block24;
lbl127:
                // 2 sources

                var3_3 /* !! */  = (int)jq.kent("khov", keoa(int ), (int)1197);
                cfr_temp_0 = 1;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void kila() {
        jq.kenr[200] = 1183176604;
        jq.kenr[201] = -1864035378;
        jq.kenr[202] = -1021488948;
        jq.kenr[203] = 1450017199;
        jq.kenr[204] = 94421360;
        jq.kenr[205] = 310066967;
        jq.kenr[206] = 480943341;
        jq.kenr[207] = 1910690516;
        jq.kenr[208] = 1976332930;
        jq.kenr[209] = 1547510674;
        jq.kenr[210] = 271082920;
        jq.kenr[211] = -1059739422;
        jq.kenr[212] = -404986596;
        jq.kenr[213] = 540004932;
        jq.kenr[214] = -1986549538;
        jq.kenr[215] = -787582799;
        jq.kenr[216] = -704438219;
        jq.kenr[217] = 2031959054;
        jq.kenr[218] = 1294334227;
        jq.kenr[219] = 1230743120;
        jq.kenr[220] = 587020525;
        jq.kenr[221] = 426966031;
        jq.kenr[222] = 794113405;
        jq.kenr[223] = -1816123892;
        jq.kenr[224] = 151183480;
        jq.kenr[225] = 990463053;
        jq.kenr[226] = 1798108036;
        jq.kenr[227] = -955213114;
        jq.kenr[228] = 943376540;
        jq.kenr[229] = -236739843;
        jq.kenr[230] = 1185984531;
        jq.kenr[231] = 187139162;
        jq.kenr[232] = 112303176;
        jq.kenr[233] = -439739869;
        jq.kenr[234] = -1263209937;
        jq.kenr[235] = -591138468;
        jq.kenr[236] = 1447298098;
        jq.kenr[237] = 1875427684;
        jq.kenr[238] = 903097331;
        jq.kenr[239] = 773261515;
        jq.kenr[240] = -599069922;
        jq.kenr[241] = -1975639372;
        jq.kenr[242] = 360875377;
        jq.kenr[243] = -2144591938;
        jq.kenr[244] = -1563647432;
        jq.kenr[245] = 197075629;
        jq.kenr[246] = 447580757;
        jq.kenr[247] = 1135317357;
        jq.kenr[248] = 518206628;
        jq.kenr[249] = -602871046;
        jq.kenr[250] = -81279530;
        jq.kenr[251] = 7830369;
        jq.kenr[252] = -2111112517;
        jq.kenr[253] = 1285152014;
        jq.kenr[254] = -62109764;
        jq.kenr[255] = -134001532;
        jq.kenr[256] = -709635877;
        jq.kenr[257] = 1383789612;
        jq.kenr[258] = 1169419788;
        jq.kenr[259] = 2027485152;
        jq.kenr[260] = 1111240177;
        jq.kenr[261] = -753379861;
        jq.kenr[262] = -297970973;
        jq.kenr[263] = -656749237;
        jq.kenr[264] = -1761049416;
        jq.kenr[265] = 663582675;
        jq.kenr[266] = 1061285891;
        jq.kenr[267] = 289508288;
        jq.kenr[268] = -1860256;
        jq.kenr[269] = 339795259;
        jq.kenr[270] = -1557987397;
        jq.kenr[271] = -186864683;
        jq.kenr[272] = 0x33D30D0;
        jq.kenr[273] = -223901391;
        jq.kenr[274] = -424427213;
        jq.kenr[275] = -500370190;
        jq.kenr[276] = 638481235;
        jq.kenr[277] = -9824071;
        jq.kenr[278] = 23514679;
        jq.kenr[279] = 120367422;
        jq.kenr[280] = 150090059;
        jq.kenr[281] = 686022561;
        jq.kenr[282] = 773886953;
        jq.kenr[283] = -2047217968;
        jq.kenr[284] = 1691042502;
        jq.kenr[285] = 1750382732;
        jq.kenr[286] = 1579916969;
        jq.kenr[287] = -1345508819;
        jq.kenr[288] = 696309265;
        jq.kenr[289] = 813003342;
        jq.kenr[290] = 410100106;
        jq.kenr[291] = -1745973839;
        jq.kenr[292] = 201846548;
        jq.kenr[293] = 1655319051;
        jq.kenr[294] = 468078595;
        jq.kenr[295] = 1073412302;
        jq.kenr[296] = -295311419;
        jq.kenr[297] = 940368302;
        jq.kenr[298] = -1153466314;
        jq.kenr[299] = -218501130;
    }

    private static /* synthetic */ void kioy() {
        jq.keqf[0] = 5310510774412377484L;
        jq.keqf[1] = 1910248805011371230L;
        jq.keqf[2] = -5931288824400227444L;
        jq.keqf[3] = -2867395637831587109L;
        jq.keqf[4] = -3163224882430177460L;
        jq.keqf[5] = -1243262567364245791L;
        jq.keqf[6] = -2832411934256835341L;
        jq.keqf[7] = 3181519334093760840L;
        jq.keqf[8] = -8662439271958537604L;
        jq.keqf[9] = 8638542962070234410L;
        jq.keqf[10] = 3091256874603458975L;
        jq.keqf[11] = 4619086351206265437L;
        jq.keqf[12] = -6971879542923324766L;
        jq.keqf[13] = -5532694871313001314L;
        jq.keqf[14] = 8609451419110156472L;
        jq.keqf[15] = -3727358466971720895L;
        jq.keqf[16] = -7085685780517812227L;
        jq.keqf[17] = -2838937067968152300L;
        jq.keqf[18] = -7741174448204476450L;
        jq.keqf[19] = -4887046402955480398L;
        jq.keqf[20] = -6628647846890067134L;
        jq.keqf[21] = -4509534402270495855L;
        jq.keqf[22] = -6896326533325860392L;
        jq.keqf[23] = -149414659778398030L;
        jq.keqf[24] = -2617439871152644431L;
        jq.keqf[25] = 182340878774448558L;
        jq.keqf[26] = 1804071831058908208L;
        jq.keqf[27] = 2923794068068624217L;
        jq.keqf[28] = 144139163508430023L;
        jq.keqf[29] = 8153680662424374129L;
        jq.keqf[30] = 8114964517366047180L;
        jq.keqf[31] = 2078420657714706253L;
        jq.keqf[32] = -8675237703642829381L;
        jq.keqf[33] = 4168068962496146604L;
        jq.keqf[34] = -1972988703871398150L;
        jq.keqf[35] = 1607375122972515791L;
        jq.keqf[36] = -6987611502601348656L;
        jq.keqf[37] = 7555670049989496218L;
        jq.keqf[38] = -4967656668477213132L;
        jq.keqf[39] = 1169408546971819976L;
        jq.keqf[40] = -5078140159428805759L;
        jq.keqf[41] = -5392596377963783456L;
        jq.keqf[42] = 1916010066886893204L;
        jq.keqf[43] = -2750521996108168723L;
        jq.keqf[44] = 6824022672388799164L;
        jq.keqf[45] = -3701412279783967006L;
        jq.keqf[46] = 7877586278503450103L;
        jq.keqf[47] = -5899939663106781466L;
        jq.keqf[48] = 9220344735571732540L;
        jq.keqf[49] = -3336470052556601117L;
        jq.keqf[50] = -5386906779629623091L;
        jq.keqf[51] = 357015022718269246L;
        jq.keqf[52] = -5661968380238951449L;
        jq.keqf[53] = -7617586039592320141L;
        jq.keqf[54] = 4691744534128197627L;
        jq.keqf[55] = -225470033518832336L;
        jq.keqf[56] = -7186635591469928511L;
        jq.keqf[57] = 2317217725917821112L;
        jq.keqf[58] = 3661214585010522070L;
        jq.keqf[59] = -8266293280318170122L;
        jq.keqf[60] = 8001951680122571717L;
        jq.keqf[61] = 95184905143245402L;
        jq.keqf[62] = 5666317626712404239L;
        jq.keqf[63] = -2891899966626816269L;
        jq.keqf[64] = -6246751080063787392L;
        jq.keqf[65] = -3267114425533588908L;
        jq.keqf[66] = 6264125510888982447L;
        jq.keqf[67] = -656987049338708980L;
        jq.keqf[68] = -3455870317830908691L;
        jq.keqf[69] = 7662414704664154826L;
        jq.keqf[70] = 1966378211476055133L;
        jq.keqf[71] = -7545501946630002880L;
        jq.keqf[72] = 3324894660335228698L;
        jq.keqf[73] = 6810165969301803640L;
        jq.keqf[74] = 318985263263039780L;
        jq.keqf[75] = -9123399445921480316L;
        jq.keqf[76] = 2826990968142443422L;
        jq.keqf[77] = -5789649113830450846L;
        jq.keqf[78] = 3609743067538915026L;
        jq.keqf[79] = 2844343433366887237L;
        jq.keqf[80] = 7412134742801399380L;
        jq.keqf[81] = -6637309331741112633L;
        jq.keqf[82] = 6307885601140926937L;
        jq.keqf[83] = 3358320462616026261L;
        jq.keqf[84] = 3524295580688818843L;
        jq.keqf[85] = -533948298239785827L;
        jq.keqf[86] = 1660747204157414974L;
        jq.keqf[87] = -2592139315287544020L;
        jq.keqf[88] = -6060296523892349249L;
        jq.keqf[89] = 4934585123273346247L;
        jq.keqf[90] = 5621247139672207116L;
        jq.keqf[91] = -9027866027728545020L;
        jq.keqf[92] = -212423977574661806L;
        jq.keqf[93] = 4074409553365105963L;
        jq.keqf[94] = -7526249271797125758L;
        jq.keqf[95] = 5718373378372376606L;
        jq.keqf[96] = -3909019584195402306L;
        jq.keqf[97] = -4332770785507705900L;
        jq.keqf[98] = -7033638328965612129L;
        jq.keqf[99] = -3519788849648772565L;
    }

    private static /* synthetic */ void kipy() {
        jq.keqf[200] = 3665558743510515827L;
        jq.keqf[201] = -227195781625546408L;
        jq.keqf[202] = -996014063773263748L;
        jq.keqf[203] = 3358793378078996627L;
        jq.keqf[204] = -7437068750897306116L;
        jq.keqf[205] = 5168533328157030723L;
        jq.keqf[206] = -6272957738561410512L;
        jq.keqf[207] = -8127312991160149693L;
        jq.keqf[208] = 4262913547800656267L;
        jq.keqf[209] = 8273963183340216336L;
        jq.keqf[210] = 5137169739653684576L;
        jq.keqf[211] = -3596881537208102732L;
        jq.keqf[212] = 2585560744189253486L;
        jq.keqf[213] = -652963035281282687L;
        jq.keqf[214] = 8567236362961905982L;
        jq.keqf[215] = -5784889070063488333L;
        jq.keqf[216] = -9039188523845652558L;
        jq.keqf[217] = 3585961628925532783L;
        jq.keqf[218] = 5033774326772512380L;
        jq.keqf[219] = 8352099568444270334L;
        jq.keqf[220] = 279009594695177403L;
        jq.keqf[221] = -1841427328526661534L;
        jq.keqf[222] = -7664877672749408227L;
        jq.keqf[223] = -5585563992747025794L;
        jq.keqf[224] = -8838798748967197630L;
        jq.keqf[225] = -8142500429956569441L;
        jq.keqf[226] = -1395932955476292371L;
        jq.keqf[227] = 1672632757963361533L;
        jq.keqf[228] = 2505842418931595732L;
        jq.keqf[229] = 5648191282834294059L;
        jq.keqf[230] = 7431399410951960941L;
        jq.keqf[231] = 8195818180716398378L;
        jq.keqf[232] = -510230997846718606L;
        jq.keqf[233] = -6112666425957606872L;
        jq.keqf[234] = -5581404954824334734L;
        jq.keqf[235] = -2995435112838406548L;
        jq.keqf[236] = -7346306424180904760L;
        jq.keqf[237] = 2383155619164210627L;
        jq.keqf[238] = -7021718115119498686L;
        jq.keqf[239] = -2863810541105022204L;
        jq.keqf[240] = 5158032583900095297L;
        jq.keqf[241] = 6458874728627277320L;
        jq.keqf[242] = -3317681334869044325L;
        jq.keqf[243] = 4268394080093661158L;
        jq.keqf[244] = 8420208519813913165L;
        jq.keqf[245] = -4593607784828198882L;
        jq.keqf[246] = -6896366174819935518L;
        jq.keqf[247] = 3136704948461906365L;
        jq.keqf[248] = -6686530705346700244L;
        jq.keqf[249] = 7686994122308630060L;
        jq.keqf[250] = 1925136209971044818L;
        jq.keqf[251] = 3736140697805225622L;
        jq.keqf[252] = 1108402321684255280L;
        jq.keqf[253] = 2437603942048310697L;
        jq.keqf[254] = 1299805440138423146L;
        jq.keqf[255] = 8102900987718910847L;
        jq.keqf[256] = -6246955250938927077L;
        jq.keqf[257] = 4316834257377607855L;
        jq.keqf[258] = 2517602832858819505L;
        jq.keqf[259] = -2098346217190074948L;
        jq.keqf[260] = -7578762953049406126L;
        jq.keqf[261] = -6096896742308551887L;
        jq.keqf[262] = -235147094421884866L;
        jq.keqf[263] = -2267529865345352128L;
        jq.keqf[264] = -5608113331467348418L;
        jq.keqf[265] = -6953954506719457325L;
        jq.keqf[266] = 8274080638283547252L;
        jq.keqf[267] = -74719998326230861L;
        jq.keqf[268] = -4792715702382580030L;
        jq.keqf[269] = -2602207331188133525L;
        jq.keqf[270] = -6916279160187364808L;
        jq.keqf[271] = 8844787162229787000L;
        jq.keqf[272] = 5305089701678041227L;
        jq.keqf[273] = 6527794649341889430L;
        jq.keqf[274] = -5514037164804755170L;
        jq.keqf[275] = -1367635822108995977L;
        jq.keqf[276] = 3814431401373282645L;
        jq.keqf[277] = 280574060334116293L;
        jq.keqf[278] = -5727903911250066186L;
        jq.keqf[279] = 8232397758129623291L;
        jq.keqf[280] = 1751288857860387216L;
        jq.keqf[281] = -7591429139894719562L;
        jq.keqf[282] = -2252355537861505123L;
        jq.keqf[283] = -6286172798555811616L;
        jq.keqf[284] = 6919397640052757007L;
        jq.keqf[285] = -8632399075959960756L;
        jq.keqf[286] = 6086809554423073912L;
        jq.keqf[287] = -6376026283591410639L;
        jq.keqf[288] = -6595007947532173886L;
        jq.keqf[289] = 3850169462062746403L;
        jq.keqf[290] = 4858665387337801213L;
        jq.keqf[291] = 7568645539177265388L;
        jq.keqf[292] = -8890692978357944551L;
        jq.keqf[293] = -2172412756429868159L;
        jq.keqf[294] = 2356346229353502865L;
        jq.keqf[295] = 821486277652197675L;
        jq.keqf[296] = 1725326508091511129L;
        jq.keqf[297] = 4031930897405011821L;
        jq.keqf[298] = -5363002026249458872L;
        jq.keqf[299] = -8877562733268669193L;
    }

    private static /* synthetic */ void kilk() {
        jq.kenr[1200] = 1700471621;
        jq.kenr[1201] = 337910854;
        jq.kenr[1202] = -138767444;
        jq.kenr[1203] = 1893990119;
        jq.kenr[1204] = 665496120;
        jq.kenr[1205] = -1538410779;
        jq.kenr[1206] = -1784133406;
        jq.kenr[1207] = 1965832545;
        jq.kenr[1208] = 1291738107;
        jq.kenr[1209] = -1477390287;
        jq.kenr[1210] = -1444309114;
        jq.kenr[1211] = -1471596632;
        jq.kenr[1212] = 1567908143;
        jq.kenr[1213] = -1351517317;
        jq.kenr[1214] = -536906131;
        jq.kenr[1215] = 195135300;
        jq.kenr[1216] = 380504445;
        jq.kenr[1217] = 1036849764;
        jq.kenr[1218] = 455305169;
        jq.kenr[1219] = -1880905962;
        jq.kenr[1220] = 1242475906;
        jq.kenr[1221] = 976549356;
        jq.kenr[1222] = -659185831;
        jq.kenr[1223] = 774339872;
        jq.kenr[1224] = -111486772;
        jq.kenr[1225] = -682349864;
        jq.kenr[1226] = 945991375;
        jq.kenr[1227] = 411817416;
        jq.kenr[1228] = -2097921596;
        jq.kenr[1229] = 1714446849;
        jq.kenr[1230] = -1859744948;
        jq.kenr[1231] = -1649703113;
        jq.kenr[1232] = 1410988118;
        jq.kenr[1233] = 1674330133;
        jq.kenr[1234] = 227947512;
        jq.kenr[1235] = -454262152;
        jq.kenr[1236] = 894671914;
        jq.kenr[1237] = 91802924;
        jq.kenr[1238] = -1153502677;
        jq.kenr[1239] = 1699421655;
        jq.kenr[1240] = -2035828738;
        jq.kenr[1241] = -836223370;
        jq.kenr[1242] = -983599928;
        jq.kenr[1243] = 1955168531;
        jq.kenr[1244] = -994169182;
        jq.kenr[1245] = 911822739;
        jq.kenr[1246] = 1470587665;
        jq.kenr[1247] = 1746427782;
        jq.kenr[1248] = 1989257755;
        jq.kenr[1249] = -827382393;
        jq.kenr[1250] = -595928898;
        jq.kenr[1251] = -645333156;
        jq.kenr[1252] = 527416088;
        jq.kenr[1253] = -1046159706;
        jq.kenr[1254] = -499430186;
        jq.kenr[1255] = 583974622;
        jq.kenr[1256] = 320985610;
        jq.kenr[1257] = 780211738;
        jq.kenr[1258] = 256795137;
        jq.kenr[1259] = 1702445893;
        jq.kenr[1260] = -1531050581;
        jq.kenr[1261] = -954444782;
        jq.kenr[1262] = 921439119;
        jq.kenr[1263] = -53503771;
        jq.kenr[1264] = -1853657689;
        jq.kenr[1265] = -1405569756;
        jq.kenr[1266] = 579947551;
        jq.kenr[1267] = -170423166;
        jq.kenr[1268] = 1454190212;
        jq.kenr[1269] = 406886677;
        jq.kenr[1270] = -1904467230;
        jq.kenr[1271] = -1113316296;
        jq.kenr[1272] = 54624477;
        jq.kenr[1273] = -1172307049;
        jq.kenr[1274] = 67332969;
        jq.kenr[1275] = 824421919;
        jq.kenr[1276] = -758909663;
        jq.kenr[1277] = -1432276829;
        jq.kenr[1278] = 1727135264;
        jq.kenr[1279] = -1213807294;
        jq.kenr[1280] = 1784512713;
        jq.kenr[1281] = 529371312;
        jq.kenr[1282] = 1321676608;
        jq.kenr[1283] = 213854307;
        jq.kenr[1284] = 292915945;
        jq.kenr[1285] = 877932371;
        jq.kenr[1286] = 221966453;
        jq.kenr[1287] = -44398354;
        jq.kenr[1288] = -1182425532;
        jq.kenr[1289] = 1766268954;
        jq.kenr[1290] = -1122104265;
        jq.kenr[1291] = 1520383861;
        jq.kenr[1292] = -816265309;
        jq.kenr[1293] = -525964708;
        jq.kenr[1294] = 929666361;
        jq.kenr[1295] = -44237223;
        jq.kenr[1296] = 1883099980;
        jq.kenr[1297] = 1595346596;
        jq.kenr[1298] = 1143363284;
        jq.kenr[1299] = -1331598149;
    }

    private static /* synthetic */ void kiqy() {
        jq.keqg[0] = -8778265213641510301L;
        jq.keqg[1] = -1358493299624794694L;
        jq.keqg[2] = -699480810288406026L;
        jq.keqg[3] = -8308213313794055895L;
        jq.keqg[4] = -6606148857622433981L;
        jq.keqg[5] = 9111049796939805024L;
        jq.keqg[6] = -936124307508417705L;
        jq.keqg[7] = 55785871750907047L;
        jq.keqg[8] = -6662597582031628756L;
        jq.keqg[9] = -9155207809506104243L;
        jq.keqg[10] = 6985521108331778963L;
        jq.keqg[11] = 6708173900173010377L;
        jq.keqg[12] = -7523943647788422416L;
        jq.keqg[13] = -4462011856538326471L;
        jq.keqg[14] = -7798776389902581392L;
        jq.keqg[15] = 494517768789997626L;
        jq.keqg[16] = -1256326083603900085L;
        jq.keqg[17] = 8655072190547891136L;
        jq.keqg[18] = -6960162323390549552L;
        jq.keqg[19] = 7337560056899119513L;
        jq.keqg[20] = -7519752042233898730L;
        jq.keqg[21] = 315697297669084544L;
        jq.keqg[22] = 6806017252033348508L;
        jq.keqg[23] = -3521876939278270677L;
        jq.keqg[24] = 8878288168418829188L;
        jq.keqg[25] = 3470310756988822873L;
        jq.keqg[26] = 5972153561823790739L;
        jq.keqg[27] = -6186927028403921196L;
        jq.keqg[28] = 6508138550257457616L;
        jq.keqg[29] = -4036050800623147942L;
        jq.keqg[30] = -8716044348160688035L;
        jq.keqg[31] = -403244270881168036L;
        jq.keqg[32] = -1175613015023399084L;
        jq.keqg[33] = 7542322205946843595L;
        jq.keqg[34] = -5550798350072240685L;
        jq.keqg[35] = 8772682468051603897L;
        jq.keqg[36] = 7464668847012059764L;
        jq.keqg[37] = -2239823216619185122L;
        jq.keqg[38] = 6361707547977471114L;
        jq.keqg[39] = -436116537988624374L;
        jq.keqg[40] = 8581214687229271139L;
        jq.keqg[41] = -3257392161911502922L;
        jq.keqg[42] = 2633225092642794901L;
        jq.keqg[43] = -6706980356122480791L;
        jq.keqg[44] = -6197879399160035987L;
        jq.keqg[45] = 4253478446537277263L;
        jq.keqg[46] = -107785631538355860L;
        jq.keqg[47] = -8765397600990546202L;
        jq.keqg[48] = 7867037659513475821L;
        jq.keqg[49] = 6734938809837754129L;
        jq.keqg[50] = -6315170378719645085L;
        jq.keqg[51] = 7275676718679893651L;
        jq.keqg[52] = -7908360543114593679L;
        jq.keqg[53] = -4470399640662918776L;
        jq.keqg[54] = -7217313648446069563L;
        jq.keqg[55] = -6313344330371588457L;
        jq.keqg[56] = -9022504806453296343L;
        jq.keqg[57] = 2734350751938182824L;
        jq.keqg[58] = -8023099238427215471L;
        jq.keqg[59] = -7166676518385513442L;
        jq.keqg[60] = -7077802377799073336L;
        jq.keqg[61] = 4069108056168757786L;
        jq.keqg[62] = -4223509859213789990L;
        jq.keqg[63] = 9066778361542217382L;
        jq.keqg[64] = -9031223915266115505L;
        jq.keqg[65] = 9127928741067221625L;
        jq.keqg[66] = -8907224714141469934L;
        jq.keqg[67] = -9053033028656869535L;
        jq.keqg[68] = 1316603366939870382L;
        jq.keqg[69] = 6372727366857326707L;
        jq.keqg[70] = -4691636051199055013L;
        jq.keqg[71] = 6189364030346716557L;
        jq.keqg[72] = 8079702135670517982L;
        jq.keqg[73] = 5251563404647998557L;
        jq.keqg[74] = 4403362415308834388L;
        jq.keqg[75] = 7965293194176067145L;
        jq.keqg[76] = -8547534024120804994L;
        jq.keqg[77] = 2322054570801149050L;
        jq.keqg[78] = 6742123703050082235L;
        jq.keqg[79] = 5337098978181791666L;
        jq.keqg[80] = -8923948957101305256L;
        jq.keqg[81] = -5860138963082154354L;
        jq.keqg[82] = -447673981022012803L;
        jq.keqg[83] = 3777636887875500632L;
        jq.keqg[84] = 7384982359799973066L;
        jq.keqg[85] = 6128864464095367132L;
        jq.keqg[86] = -409648359555128182L;
        jq.keqg[87] = 2327423681829163916L;
        jq.keqg[88] = 263022458406365189L;
        jq.keqg[89] = -2152970306672399713L;
        jq.keqg[90] = -8004196563116897059L;
        jq.keqg[91] = 6075974833296129726L;
        jq.keqg[92] = -8752228100075711096L;
        jq.keqg[93] = -6002985908140331162L;
        jq.keqg[94] = 62809635343866642L;
        jq.keqg[95] = 6170653247575910737L;
        jq.keqg[96] = -8587690186506234176L;
        jq.keqg[97] = 7438418057565549771L;
        jq.keqg[98] = -4682336267852804657L;
        jq.keqg[99] = -6642149309351132751L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void applyNewHmiViewModel(class_4587 var0, class_1799 var1_1, class_1268 var2_2) {
        v0 /* !! */  = jq.sf;
        if (true) ** GOTO lbl5
        block34: while (true) {
            v0 /* !! */  = (long)(v1 - jq.kent("kexo", keqe(int ), (int)51));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1630356898: {
                    v1 = jq.kent("kexq", keqe(int ), (int)52);
                    continue block34;
                }
                case -929260533: {
                    v1 = jq.kent("kexs", keqe(int ), (int)53);
                    continue block34;
                }
                case -847260400: {
                    v1 = jq.kent("kexu", keqe(int ), (int)54);
                    continue block34;
                }
                case 197898621: {
                    break block34;
                }
            }
            break;
        }
        var7_3 = jq.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = jq.sf - jq.kent("kexw", keqe(int ), (int)55)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jq.kent("kexy", keoa(int ), (int)79)) break;
            v2 /* !! */  = (long)jq.kent("keya", keoa(int ), (int)80);
        }
        var6_4 /* !! */  = jq.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = jq.sf - jq.kent("keyc", keqe(int ), (int)56)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == jq.kent("keye", keoa(int ), (int)81)) break;
            v3 /* !! */  = (long)jq.kent("keyf", keoa(int ), (int)82);
        }
        var5_5 = jq.a;
        if (var7_3) {
            throw null;
lbl32:
            // 8 sources

            return;
        }
        if (var5_5 || var5_5) ** GOTO lbl32
        v4 /* !! */  = jq.sf;
        if (true) ** GOTO lbl39
        block38: while (true) {
            v4 /* !! */  = (long)(v5 - jq.kent("keyh", keqe(int ), (int)57));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -854072200: {
                    v5 = jq.kent("keyj", keqe(int ), (int)58);
                    continue block38;
                }
                case 197898621: {
                    break block38;
                }
                case 468033534: {
                    v5 = jq.kent("keyl", keqe(int ), (int)59);
                    continue block38;
                }
                case 2085960274: {
                    v5 = jq.kent("keyn", keqe(int ), (int)60);
                    continue block38;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = jq.sf - jq.kent("keyp", keqe(int ), (int)61)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == jq.kent("keyr", keoa(int ), (int)83)) break;
            v6 /* !! */  = (long)jq.kent("keyt", keoa(int ), (int)84);
        }
        var3_6 = new cd(var0, var1_1, var2_2);
        if (var5_5 || var5_5) ** GOTO lbl32
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = jq.sf - jq.kent("keyu", keqe(int ), (int)62)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == jq.kent("keyv", keoa(int ), (int)85)) break;
            v7 /* !! */  = (long)jq.kent("keyw", keoa(int ), (int)86);
        }
        ax.callEvent(var3_6);
        if (var5_5 || var5_5) ** GOTO lbl32
        v8 /* !! */  = jq.sf;
        if (true) ** GOTO lbl69
        block41: while (true) {
            v8 /* !! */  = (long)(v9 - jq.kent("keyy", keqe(int ), (int)63));
lbl69:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1677898519: {
                    v9 = jq.kent("keyz", keqe(int ), (int)64);
                    continue block41;
                }
                case 197898621: {
                    break block41;
                }
                case 824944026: {
                    v9 = jq.kent("keza", keqe(int ), (int)65);
                    continue block41;
                }
            }
            break;
        }
        var4_7 = var3_6.getScale();
        if (var5_5) ** GOTO lbl32
        if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_5) ** GOTO lbl32
                if (var4_7 == 1.0f) ** GOTO lbl93
                if (var5_5 || var5_5) ** GOTO lbl32
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = jq.sf - jq.kent("kezd", keqe(int ), (int)66)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == jq.kent("kezf", keoa(int ), (int)87)) break;
                    v10 /* !! */  = (long)jq.kent("kezh", keoa(int ), (int)88);
                }
                var0.method_22905(var4_7, var4_7, var4_7);
                if (var5_5) ** GOTO lbl32
lbl93:
                // 2 sources

                if (!var5_5 && !var5_5) ** break;
                ** continue;
                return;
            }
            case 0: {
                var6_4 /* !! */  = (int)jq.kent("kezj", keoa(int ), (int)89);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl101:
            // 3 sources

            case 1: {
                var6_4 /* !! */  = (int)jq.kent("kezm", keoa(int ), (int)90);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl106:
            // 2 sources

            case 2: {
                var6_4 /* !! */  = (int)jq.kent("kezn", keoa(int ), (int)91);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl124
            }
            case 3: {
                var6_4 /* !! */  = (int)jq.kent("kezp", keoa(int ), (int)92);
                if (!var7_3) ** GOTO lbl101
                throw null;
            }
lbl115:
            // 2 sources

            case 4: {
                var6_4 /* !! */  = (int)jq.kent("kezs", keoa(int ), (int)93);
                if (var7_3) {
                    throw null;
                }
            }
            case 5: {
                var6_4 /* !! */  = (int)jq.kent("kezu", keoa(int ), (int)94);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl144
            }
lbl124:
            // 2 sources

            case 6: {
                var6_4 /* !! */  = (int)jq.kent("kezw", keoa(int ), (int)95);
                if (var7_3) {
                    throw null;
                }
            }
            case 7: {
                var6_4 /* !! */  = (int)jq.kent("kezy", keoa(int ), (int)96);
                if (!var7_3) break;
                throw null;
            }
lbl132:
            // 2 sources

            case 8: {
                var6_4 /* !! */  = (int)jq.kent("kfaa", keoa(int ), (int)97);
                if (!var7_3) ** GOTO lbl101
                throw null;
            }
lbl136:
            // 2 sources

            case 9: {
                var6_4 /* !! */  = (int)jq.kent("kfad", keoa(int ), (int)98);
                if (!var7_3) ** GOTO lbl132
                throw null;
            }
lbl140:
            // 2 sources

            case 10: {
                var6_4 /* !! */  = (int)jq.kent("kfag", keoa(int ), (int)99);
                if (!var7_3) ** GOTO lbl106
                throw null;
            }
lbl144:
            // 2 sources

            case 11: {
                var6_4 /* !! */  = (int)jq.kent("kfai", keoa(int ), (int)100);
                if (!var7_3) ** GOTO lbl136
                throw null;
            }
            case 12: {
                var6_4 /* !! */  = (int)jq.kent("kfal", keoa(int ), (int)101);
                if (!var7_3) ** GOTO lbl115
                throw null;
            }
lbl152:
            // 3 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_4 /* !! */  = (int)jq.kent("kfan", keoa(int ), (int)102);
                    if (!var7_3) ** GOTO lbl140
                    throw null;
                }
            }
            case 14: 
        }
        var6_4 /* !! */  = (int)jq.kent("kfap", keoa(int ), (int)103);
        ** while (!var7_3)
lbl160:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float kenp(int n2) {
        return Float.intBitsToFloat(kenr[n2] ^ kens[n2]);
    }

    private static /* synthetic */ void kinn() {
        jq.kens[700] = -1268861611;
        jq.kens[701] = 59273149;
        jq.kens[702] = -1902113900;
        jq.kens[703] = -1155696405;
        jq.kens[704] = 220026874;
        jq.kens[705] = -2102128154;
        jq.kens[706] = -1573075588;
        jq.kens[707] = -1450409580;
        jq.kens[708] = -1316201648;
        jq.kens[709] = 174528162;
        jq.kens[710] = 1561306607;
        jq.kens[711] = 368605500;
        jq.kens[712] = 1984950108;
        jq.kens[713] = 1228707043;
        jq.kens[714] = -1020127656;
        jq.kens[715] = 1608955098;
        jq.kens[716] = 1701838967;
        jq.kens[717] = 832931067;
        jq.kens[718] = -2137454288;
        jq.kens[719] = -1860455946;
        jq.kens[720] = 1605517397;
        jq.kens[721] = 1493708619;
        jq.kens[722] = -857942877;
        jq.kens[723] = -1353546117;
        jq.kens[724] = -1516422333;
        jq.kens[725] = -1512353216;
        jq.kens[726] = -2049862798;
        jq.kens[727] = 5962193;
        jq.kens[728] = 1497431471;
        jq.kens[729] = -461819008;
        jq.kens[730] = 583675930;
        jq.kens[731] = 1456970539;
        jq.kens[732] = 1621495277;
        jq.kens[733] = 494276703;
        jq.kens[734] = 1667137078;
        jq.kens[735] = -1751750371;
        jq.kens[736] = -1484014024;
        jq.kens[737] = -1526161001;
        jq.kens[738] = 1194264097;
        jq.kens[739] = 336846448;
        jq.kens[740] = 304814838;
        jq.kens[741] = 952804920;
        jq.kens[742] = 1722246879;
        jq.kens[743] = -278824903;
        jq.kens[744] = -2109474497;
        jq.kens[745] = -1157453347;
        jq.kens[746] = -915770819;
        jq.kens[747] = -1264187096;
        jq.kens[748] = -535959136;
        jq.kens[749] = 1074231840;
        jq.kens[750] = -736008394;
        jq.kens[751] = 1392471581;
        jq.kens[752] = -234941669;
        jq.kens[753] = -161415345;
        jq.kens[754] = 2132405911;
        jq.kens[755] = 1861384192;
        jq.kens[756] = -50906510;
        jq.kens[757] = -1403949985;
        jq.kens[758] = 1068809702;
        jq.kens[759] = 252649169;
        jq.kens[760] = 981301668;
        jq.kens[761] = 1085078048;
        jq.kens[762] = -1839135616;
        jq.kens[763] = 356274685;
        jq.kens[764] = -2136773705;
        jq.kens[765] = -2003459662;
        jq.kens[766] = -268499200;
        jq.kens[767] = 1233123828;
        jq.kens[768] = 1460195512;
        jq.kens[769] = 856918583;
        jq.kens[770] = -498692889;
        jq.kens[771] = 1531772663;
        jq.kens[772] = -1029247488;
        jq.kens[773] = -36037175;
        jq.kens[774] = 1970537593;
        jq.kens[775] = -1532335818;
        jq.kens[776] = 1857760952;
        jq.kens[777] = 1595210158;
        jq.kens[778] = 743014629;
        jq.kens[779] = 1948511769;
        jq.kens[780] = 1755105438;
        jq.kens[781] = 1310141898;
        jq.kens[782] = -922319672;
        jq.kens[783] = -1221331900;
        jq.kens[784] = 1280181164;
        jq.kens[785] = 865684264;
        jq.kens[786] = -1267387012;
        jq.kens[787] = 1608677464;
        jq.kens[788] = 227414265;
        jq.kens[789] = 43461796;
        jq.kens[790] = -1380117897;
        jq.kens[791] = -284302809;
        jq.kens[792] = 657239826;
        jq.kens[793] = -516530377;
        jq.kens[794] = -1942231441;
        jq.kens[795] = -2121475880;
        jq.kens[796] = 2043971436;
        jq.kens[797] = 1913189831;
        jq.kens[798] = -1611400823;
        jq.kens[799] = -1235306753;
    }

    private static /* synthetic */ void kilf() {
        jq.kenr[700] = -1268861666;
        jq.kenr[701] = 59273165;
        jq.kenr[702] = -1902113821;
        jq.kenr[703] = -1155696482;
        jq.kenr[704] = 220026807;
        jq.kenr[705] = -2102128240;
        jq.kenr[706] = -1573075689;
        jq.kenr[707] = -1450409552;
        jq.kenr[708] = -1316201696;
        jq.kenr[709] = 174528200;
        jq.kenr[710] = 1561306537;
        jq.kenr[711] = 368605442;
        jq.kenr[712] = 1984950108;
        jq.kenr[713] = 1228706979;
        jq.kenr[714] = -1020127732;
        jq.kenr[715] = 1608954960;
        jq.kenr[716] = 1701838937;
        jq.kenr[717] = 832931054;
        jq.kenr[718] = -2137454249;
        jq.kenr[719] = -1860455941;
        jq.kenr[720] = 1605517383;
        jq.kenr[721] = 1493708614;
        jq.kenr[722] = -857942819;
        jq.kenr[723] = -1353546113;
        jq.kenr[724] = -1516422371;
        jq.kenr[725] = -1512353153;
        jq.kenr[726] = -2049862785;
        jq.kenr[727] = 5962133;
        jq.kenr[728] = 1497431521;
        jq.kenr[729] = -461818887;
        jq.kenr[730] = 583675936;
        jq.kenr[731] = 1456970588;
        jq.kenr[732] = 1621495287;
        jq.kenr[733] = 494276639;
        jq.kenr[734] = 1667137041;
        jq.kenr[735] = -1751750249;
        jq.kenr[736] = -1484014000;
        jq.kenr[737] = -1526160951;
        jq.kenr[738] = 1194264083;
        jq.kenr[739] = 336846583;
        jq.kenr[740] = 304814815;
        jq.kenr[741] = 952805048;
        jq.kenr[742] = 1722246740;
        jq.kenr[743] = -278824920;
        jq.kenr[744] = -2109474453;
        jq.kenr[745] = -1157453316;
        jq.kenr[746] = -915770693;
        jq.kenr[747] = -1264186975;
        jq.kenr[748] = -535959134;
        jq.kenr[749] = 1074231810;
        jq.kenr[750] = -736008345;
        jq.kenr[751] = 1392471711;
        jq.kenr[752] = -234941653;
        jq.kenr[753] = -161415323;
        jq.kenr[754] = 2132405952;
        jq.kenr[755] = 1861384253;
        jq.kenr[756] = -50906556;
        jq.kenr[757] = -1403950001;
        jq.kenr[758] = 1068809568;
        jq.kenr[759] = 252649041;
        jq.kenr[760] = 981301739;
        jq.kenr[761] = 1085078181;
        jq.kenr[762] = -1839135739;
        jq.kenr[763] = 356274611;
        jq.kenr[764] = -2136773836;
        jq.kenr[765] = -2003459641;
        jq.kenr[766] = -268499102;
        jq.kenr[767] = 1233123793;
        jq.kenr[768] = 1460195539;
        jq.kenr[769] = 856918599;
        jq.kenr[770] = -498692991;
        jq.kenr[771] = 1531772617;
        jq.kenr[772] = -1029247402;
        jq.kenr[773] = -36037310;
        jq.kenr[774] = 1970537478;
        jq.kenr[775] = -1532335768;
        jq.kenr[776] = 1857760930;
        jq.kenr[777] = 1595210233;
        jq.kenr[778] = 743014509;
        jq.kenr[779] = 1948511803;
        jq.kenr[780] = 1755105413;
        jq.kenr[781] = 1310141881;
        jq.kenr[782] = -922319671;
        jq.kenr[783] = -340472467;
        jq.kenr[784] = -1280181165;
        jq.kenr[785] = 313663398;
        jq.kenr[786] = -1267387011;
        jq.kenr[787] = -1395837550;
        jq.kenr[788] = 227414264;
        jq.kenr[789] = -1748414812;
        jq.kenr[790] = -1380117897;
        jq.kenr[791] = -284302810;
        jq.kenr[792] = -1772299323;
        jq.kenr[793] = -516530378;
        jq.kenr[794] = -1942231441;
        jq.kenr[795] = -2121475879;
        jq.kenr[796] = -573043008;
        jq.kenr[797] = 1913189830;
        jq.kenr[798] = 839048909;
        jq.kenr[799] = -1235306778;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isTool(class_1799 var1_1) {
        block78: {
            v0 /* !! */  = jq.sf;
            if (true) ** GOTO lbl5
            block47: while (true) {
                v0 /* !! */  = (long)(v1 - jq.kent("khsm", keqe(int ), (int)264));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1505773655: {
                        v1 = jq.kent("khsn", keqe(int ), (int)265);
                        continue block47;
                    }
                    case -1161226775: {
                        v1 = jq.kent("khso", keqe(int ), (int)266);
                        continue block47;
                    }
                    case 197898621: {
                        break block47;
                    }
                    case 1196304311: {
                        v1 = jq.kent("khsp", keqe(int ), (int)267);
                        continue block47;
                    }
                }
                break;
            }
            var4_2 = jq.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = jq.sf - jq.kent("khsq", keqe(int ), (int)268)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == jq.kent("khsr", keoa(int ), (int)1255)) break;
                v2 /* !! */  = (long)jq.kent("khss", keoa(int ), (int)1256);
            }
            var3_3 /* !! */  = jq.b;
            v3 /* !! */  = jq.sf;
            if (true) ** GOTO lbl29
            block49: while (true) {
                v3 /* !! */  = (long)(v4 - jq.kent("khst", keqe(int ), (int)269));
lbl29:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1204903579: {
                        v4 = jq.kent("khsu", keqe(int ), (int)270);
                        continue block49;
                    }
                    case -1046321921: {
                        v4 = jq.kent("khsv", keqe(int ), (int)271);
                        continue block49;
                    }
                    case 197898621: {
                        break block49;
                    }
                }
                break;
            }
            var2_4 = jq.a;
            if (var4_2) {
                throw null;
lbl41:
                // 9 sources

                return (boolean)jq.kent("khsw", keoa(int ), (int)1257);
            }
            if (var2_4 || var2_4) ** GOTO lbl41
            v5 /* !! */  = jq.sf;
            if (true) ** GOTO lbl48
            block51: while (true) {
                v5 /* !! */  = (long)(v6 - jq.kent("khsx", keqe(int ), (int)272));
lbl48:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1905535777: {
                        v6 = jq.kent("khsy", keqe(int ), (int)273);
                        continue block51;
                    }
                    case -754498040: {
                        v6 = jq.kent("khsz", keqe(int ), (int)274);
                        continue block51;
                    }
                    case 197898621: {
                        break block51;
                    }
                    case 1243017406: {
                        v6 = jq.kent("khta", keqe(int ), (int)275);
                        continue block51;
                    }
                }
                break;
            }
            v7 /* !! */  = jq.sf;
            if (true) ** GOTO lbl64
            block52: while (true) {
                v7 /* !! */  = (long)(v8 - jq.kent("khtb", keqe(int ), (int)276));
lbl64:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -605780676: {
                        v8 = jq.kent("khtc", keqe(int ), (int)277);
                        continue block52;
                    }
                    case 197898621: {
                        break block52;
                    }
                    case 1494289560: {
                        v8 = jq.kent("khtd", keqe(int ), (int)278);
                        continue block52;
                    }
                    case 2105193787: {
                        v8 = jq.kent("khte", keqe(int ), (int)279);
                        continue block52;
                    }
                }
                break;
            }
            if (var1_1.method_31573(class_3489.field_42612)) break block78;
            if (var2_4) ** GOTO lbl41
            v9 /* !! */  = jq.sf;
            if (true) ** GOTO lbl82
            block53: while (true) {
                v9 /* !! */  = (long)(jq.kent("khtg", keqe(int ), (int)281) - jq.kent("khtf", keqe(int ), (int)280));
lbl82:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1057163582: {
                        continue block53;
                    }
                    case 197898621: {
                        break block53;
                    }
                }
                break;
            }
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_1 = jq.sf - jq.kent("khth", keqe(int ), (int)282)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v10 /* !! */  == jq.kent("khti", keoa(int ), (int)1258)) break;
                v10 /* !! */  = (long)jq.kent("khtj", keoa(int ), (int)1259);
            }
            if (var1_1.method_31573(class_3489.field_42614)) break block78;
            if (var2_4) ** GOTO lbl41
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_2 = jq.sf - jq.kent("khtk", keqe(int ), (int)283)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v11 /* !! */  == jq.kent("khtl", keoa(int ), (int)1260)) break;
                v11 /* !! */  = (long)jq.kent("khtm", keoa(int ), (int)1261);
            }
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_3 = jq.sf - jq.kent("khtn", keqe(int ), (int)284)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v12 /* !! */  == jq.kent("khto", keoa(int ), (int)1262)) break;
                v12 /* !! */  = (long)jq.kent("khtp", keoa(int ), (int)1263);
            }
            if (var1_1.method_31573(class_3489.field_42615)) break block78;
            if (var2_4) ** GOTO lbl41
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_4 = jq.sf - jq.kent("khtq", keqe(int ), (int)285)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v13 /* !! */  == jq.kent("khtr", keoa(int ), (int)1264)) break;
                v13 /* !! */  = (long)jq.kent("khts", keoa(int ), (int)1265);
            }
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_5 = jq.sf - jq.kent("khtt", keqe(int ), (int)286)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v14 /* !! */  == jq.kent("khtu", keoa(int ), (int)1266)) break;
                v14 /* !! */  = (long)jq.kent("khtv", keoa(int ), (int)1267);
            }
            if (var1_1.method_31573(class_3489.field_42613)) break block78;
            if (var2_4) ** GOTO lbl41
            v15 /* !! */  = jq.sf;
            if (true) ** GOTO lbl127
            block59: while (true) {
                v15 /* !! */  = (long)(jq.kent("khtx", keqe(int ), (int)288) - jq.kent("khtw", keqe(int ), (int)287));
lbl127:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case 197898621: {
                        break block59;
                    }
                    case 2087765532: {
                        continue block59;
                    }
                }
                break;
            }
            if (!(var1_1.method_7909() instanceof class_1835)) ** GOTO lbl144
            if (var2_4) ** GOTO lbl41
        }
        if (var2_4) ** GOTO lbl41
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl41
                v16 = jq.kent("khty", keoa(int ), (int)1268);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl144:
            // 1 sources

            if (!var2_4 && !var2_4) ** break;
            ** continue;
            v16 = jq.kent("khtz", keoa(int ), (int)1269);
lbl147:
            // 2 sources

            return (boolean)v16;
lbl148:
            // 4 sources

            case 0: {
                var3_3 /* !! */  = (int)jq.kent("khua", keoa(int ), (int)1270);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl153:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)jq.kent("khub", keoa(int ), (int)1271);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl177
                    break;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)jq.kent("khuc", keoa(int ), (int)1272);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 3: {
                var3_3 /* !! */  = (int)jq.kent("khud", keoa(int ), (int)1273);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 4: {
                var3_3 /* !! */  = (int)jq.kent("khue", keoa(int ), (int)1274);
                if (!var4_2) break;
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)jq.kent("khuf", keoa(int ), (int)1275);
                if (!var4_2) ** GOTO lbl148
                throw null;
            }
lbl177:
            // 4 sources

            case 6: {
                var3_3 /* !! */  = (int)jq.kent("khug", keoa(int ), (int)1276);
                if (!var4_2) ** GOTO lbl148
                throw null;
            }
lbl181:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)jq.kent("khuh", keoa(int ), (int)1277);
                if (var4_2) {
                    throw null;
                }
            }
lbl185:
            // 4 sources

            case 8: {
                var3_3 /* !! */  = (int)jq.kent("khui", keoa(int ), (int)1278);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl194
            }
            case 9: {
                var3_3 /* !! */  = (int)jq.kent("khuj", keoa(int ), (int)1279);
                if (!var4_2) ** GOTO lbl148
                throw null;
            }
lbl194:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)jq.kent("khuk", keoa(int ), (int)1280);
                if (!var4_2) ** GOTO lbl177
                throw null;
            }
lbl198:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)jq.kent("khul", keoa(int ), (int)1281);
                if (!var4_2) ** GOTO lbl177
                throw null;
            }
            case 12: {
                var3_3 /* !! */  = (int)jq.kent("khum", keoa(int ), (int)1282);
                if (!var4_2) ** GOTO lbl153
                throw null;
            }
            case 13: 
        }
        var3_3 /* !! */  = (int)jq.kent("khun", keoa(int ), (int)1283);
        ** while (!var4_2)
lbl209:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isSmallItem(class_1799 var1_1) {
        v0 /* !! */  = jq.sf;
        if (true) ** GOTO lbl5
        block68: while (true) {
            v0 /* !! */  = (long)(v1 - jq.kent("kibl", keqe(int ), (int)386));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 10115772: {
                    v1 = jq.kent("kibm", keqe(int ), (int)387);
                    continue block68;
                }
                case 197898621: {
                    break block68;
                }
                case 766030873: {
                    v1 = jq.kent("kibn", keqe(int ), (int)388);
                    continue block68;
                }
                case 2041864821: {
                    v1 = jq.kent("kibo", keqe(int ), (int)389);
                    continue block68;
                }
            }
            break;
        }
        var4_2 = jq.c;
        v2 /* !! */  = jq.sf;
        if (true) ** GOTO lbl22
        block69: while (true) {
            v2 /* !! */  = (long)(v3 - jq.kent("kibp", keqe(int ), (int)390));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2006075744: {
                    v3 = jq.kent("kibq", keqe(int ), (int)391);
                    continue block69;
                }
                case 197898621: {
                    break block69;
                }
                case 584218943: {
                    v3 = jq.kent("kibr", keqe(int ), (int)392);
                    continue block69;
                }
                case 1490046093: {
                    v3 = jq.kent("kibs", keqe(int ), (int)393);
                    continue block69;
                }
            }
            break;
        }
        var3_3 /* !! */  = jq.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = jq.sf - jq.kent("kibt", keqe(int ), (int)394)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == jq.kent("kibu", keoa(int ), (int)1366)) break;
            v4 /* !! */  = (long)jq.kent("kibv", keoa(int ), (int)1367);
        }
        var2_4 = jq.a;
        if (var4_2) {
            throw null;
lbl44:
            // 10 sources

            return (boolean)jq.kent("kibw", keoa(int ), (int)1368);
        }
        if (var2_4 || var2_4) ** GOTO lbl44
        v5 /* !! */  = jq.sf;
        if (true) ** GOTO lbl51
        block72: while (true) {
            v5 /* !! */  = (long)(jq.kent("kiby", keqe(int ), (int)396) - jq.kent("kibx", keqe(int ), (int)395));
lbl51:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 197898621: {
                    break block72;
                }
                case 1878996258: {
                    continue block72;
                }
            }
            break;
        }
        if (var1_1.method_7909() instanceof class_1747) ** GOTO lbl199
        if (var2_4) ** GOTO lbl44
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = jq.sf - jq.kent("kibz", keqe(int ), (int)397)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 /* !! */  == jq.kent("kica", keoa(int ), (int)1369)) break;
            v6 /* !! */  = (long)jq.kent("kicb", keoa(int ), (int)1370);
        }
        if (this.isTool(var1_1)) ** GOTO lbl199
        if (var2_4) ** GOTO lbl44
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = jq.sf - jq.kent("kicc", keqe(int ), (int)398)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 /* !! */  == jq.kent("kicd", keoa(int ), (int)1371)) break;
            v7 /* !! */  = (long)jq.kent("kice", keoa(int ), (int)1372);
        }
        if (this.isWeapon(var1_1)) ** GOTO lbl199
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block16 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl44
                v8 /* !! */  = jq.sf;
                if (true) ** GOTO lbl81
                block75: while (true) {
                    v8 /* !! */  = (long)(v9 - jq.kent("kicf", keqe(int ), (int)399));
lbl81:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 197898621: {
                            break block75;
                        }
                        case 248508698: {
                            v9 = jq.kent("kicg", keqe(int ), (int)400);
                            continue block75;
                        }
                        case 1541770433: {
                            v9 = jq.kent("kich", keqe(int ), (int)401);
                            continue block75;
                        }
                        case 1941990161: {
                            v9 = jq.kent("kici", keqe(int ), (int)402);
                            continue block75;
                        }
                    }
                    break;
                }
                if (var1_1.method_7909() instanceof class_1787) ** GOTO lbl199
                if (var2_4) ** GOTO lbl44
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = jq.sf - jq.kent("kicj", keqe(int ), (int)403)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == jq.kent("kick", keoa(int ), (int)1373)) break;
                    v10 /* !! */  = (long)jq.kent("kicl", keoa(int ), (int)1374);
                }
                if (var1_1.method_7909() instanceof class_1755) ** GOTO lbl199
                if (var2_4) ** GOTO lbl44
                v11 /* !! */  = jq.sf;
                if (true) ** GOTO lbl107
                block77: while (true) {
                    v11 /* !! */  = (long)(v12 - jq.kent("kicm", keqe(int ), (int)404));
lbl107:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -217270538: {
                            v12 = jq.kent("kicn", keqe(int ), (int)405);
                            continue block77;
                        }
                        case 197898621: {
                            break block77;
                        }
                        case 865706924: {
                            v12 = jq.kent("kico", keqe(int ), (int)406);
                            continue block77;
                        }
                        case 1161669634: {
                            v12 = jq.kent("kicp", keqe(int ), (int)407);
                            continue block77;
                        }
                    }
                    break;
                }
                v13 = var1_1.method_7976();
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = jq.sf - jq.kent("kicq", keqe(int ), (int)408)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v14 /* !! */  == jq.kent("kicr", keoa(int ), (int)1375)) break;
                    v14 /* !! */  = (long)jq.kent("kics", keoa(int ), (int)1376);
                }
                if (v13 == class_1839.field_8953) ** GOTO lbl199
                if (var2_4) ** GOTO lbl44
                v15 /* !! */  = jq.sf;
                if (true) ** GOTO lbl132
                block79: while (true) {
                    v15 /* !! */  = (long)(v16 - jq.kent("kict", keqe(int ), (int)409));
lbl132:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1674740673: {
                            v16 = jq.kent("kicu", keqe(int ), (int)410);
                            continue block79;
                        }
                        case 40464027: {
                            v16 = jq.kent("kicv", keqe(int ), (int)411);
                            continue block79;
                        }
                        case 197898621: {
                            break block79;
                        }
                        case 1016331423: {
                            v16 = jq.kent("kicw", keqe(int ), (int)412);
                            continue block79;
                        }
                    }
                    break;
                }
                v17 = var1_1.method_7976();
                v18 /* !! */  = jq.sf;
                if (true) ** GOTO lbl149
                block80: while (true) {
                    v18 /* !! */  = (long)(v19 - jq.kent("kicx", keqe(int ), (int)413));
lbl149:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1784026628: {
                            v19 = jq.kent("kicy", keqe(int ), (int)414);
                            continue block80;
                        }
                        case -1193052635: {
                            v19 = jq.kent("kicz", keqe(int ), (int)415);
                            continue block80;
                        }
                        case -97347349: {
                            v19 = jq.kent("kida", keqe(int ), (int)416);
                            continue block80;
                        }
                        case 197898621: {
                            break block80;
                        }
                    }
                    break;
                }
                if (v17 == class_1839.field_8951) ** GOTO lbl199
                if (var2_4) ** GOTO lbl44
                v20 /* !! */  = jq.sf;
                if (true) ** GOTO lbl167
                block81: while (true) {
                    v20 /* !! */  = (long)(v21 - jq.kent("kidb", keqe(int ), (int)417));
lbl167:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -2030518882: {
                            v21 = jq.kent("kidc", keqe(int ), (int)418);
                            continue block81;
                        }
                        case -1791111328: {
                            v21 = jq.kent("kidd", keqe(int ), (int)419);
                            continue block81;
                        }
                        case -362872977: {
                            v21 = jq.kent("kide", keqe(int ), (int)420);
                            continue block81;
                        }
                        case 197898621: {
                            break block81;
                        }
                    }
                    break;
                }
                v22 = var1_1.method_7976();
                v23 /* !! */  = jq.sf;
                if (true) ** GOTO lbl184
                block82: while (true) {
                    v23 /* !! */  = (long)(v24 - jq.kent("kidf", keqe(int ), (int)421));
lbl184:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case 197898621: {
                            break block82;
                        }
                        case 409538591: {
                            v24 = jq.kent("kidg", keqe(int ), (int)422);
                            continue block82;
                        }
                        case 475428672: {
                            v24 = jq.kent("kidh", keqe(int ), (int)423);
                            continue block82;
                        }
                    }
                    break;
                }
                if (v22 == class_1839.field_8949) ** GOTO lbl199
                if (var2_4) ** GOTO lbl44
                v25 = jq.kent("kidi", keoa(int ), (int)1377);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl202
lbl199:
                // 8 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v25 = jq.kent("kidj", keoa(int ), (int)1378);
lbl202:
                // 2 sources

                return (boolean)v25;
            }
            case 0: {
                var3_3 /* !! */  = (int)jq.kent("kidk", keoa(int ), (int)1379);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl244
            }
            case 1: {
                var3_3 /* !! */  = (int)jq.kent("kidl", keoa(int ), (int)1380);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl240
            }
lbl213:
            // 3 sources

            case 2: {
                do {
                    var3_3 /* !! */  = (int)jq.kent("kidm", keoa(int ), (int)1381);
                } while (!var4_2);
                throw null;
            }
lbl218:
            // 3 sources

            case 3: {
                var3_3 /* !! */  = (int)jq.kent("kidn", keoa(int ), (int)1382);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 4: {
                var3_3 /* !! */  = (int)jq.kent("kido", keoa(int ), (int)1383);
                if (var4_2) {
                    throw null;
                }
            }
lbl227:
            // 4 sources

            case 5: {
                do {
                    var3_3 /* !! */  = (int)jq.kent("kidp", keoa(int ), (int)1384);
                } while (!var4_2);
                throw null;
            }
lbl232:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)jq.kent("kidq", keoa(int ), (int)1385);
                if (!var4_2) ** GOTO lbl213
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)jq.kent("kidr", keoa(int ), (int)1386);
                if (!var4_2) ** GOTO lbl227
                throw null;
            }
lbl240:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)jq.kent("kids", keoa(int ), (int)1387);
                if (!var4_2) ** GOTO lbl213
                throw null;
            }
lbl244:
            // 2 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)jq.kent("kidt", keoa(int ), (int)1388);
                    if (!var4_2) break block16;
                    throw null;
                }
            }
lbl249:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)jq.kent("kidu", keoa(int ), (int)1389);
                if (!var4_2) ** GOTO lbl232
                throw null;
            }
            case 11: {
                var3_3 /* !! */  = (int)jq.kent("kidv", keoa(int ), (int)1390);
                if (!var4_2) ** GOTO lbl218
                throw null;
            }
            case 12: {
                var3_3 /* !! */  = (int)jq.kent("kidw", keoa(int ), (int)1391);
                if (!var4_2) ** GOTO lbl249
                throw null;
            }
            case 13: {
                var3_3 /* !! */  = (int)jq.kent("kidx", keoa(int ), (int)1392);
                if (!var4_2) ** GOTO lbl218
                throw null;
            }
            case 14: 
        }
        var3_3 /* !! */  = (int)jq.kent("kidy", keoa(int ), (int)1393);
        ** while (!var4_2)
lbl268:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void applyHoldMyItemsHand(class_4587 var1_1, class_742 var2_2, class_1268 var3_3, class_1799 var4_4, float var5_5, float var6_6, float var7_7) {
        block92: {
            block91: {
                block90: {
                    block89: {
                        var12_8 = jq.c;
                        var11_9 /* !! */  = jq.b;
                        var10_10 = jq.a;
                        if (var12_8) {
                            throw null;
lbl6:
                            // 23 sources

                            return;
                        }
                        if (var10_10 || var10_10) ** GOTO lbl6
                        this.updateHoldPhysics(var3_3, var6_6);
                        if (var10_10 || var10_10) ** GOTO lbl6
                        if (var3_3 != class_1268.field_5808) break block89;
                        if (var10_10) ** GOTO lbl6
                        v0 = var2_2.method_6068();
                        if (var12_8) {
                            throw null;
                        }
                        break block90;
                    }
                    if (var10_10 || var10_10) ** GOTO lbl6
                    v0 = var8_11 = var2_2.method_6068().method_5928();
                }
                if (var10_10 || var10_10) ** GOTO lbl6
                this.applyHoldSwing(var1_1, var2_2, var3_3, var4_4, var6_6);
                if (var10_10 || var10_10) ** GOTO lbl6
                this.applyHoldEnvironment(var1_1, var2_2, var3_3, var8_11, var4_4, var6_6, var7_7);
                if (var10_10 || var10_10) ** GOTO lbl6
                if (var8_11 != class_1306.field_6183) break block91;
                if (var10_10) ** GOTO lbl6
                v1 = jq.kent("kfxs", keoa(int ), (int)523);
                if (var12_8) {
                    throw null;
                }
                break block92;
            }
            if (var10_10 || var10_10) ** GOTO lbl6
            v1 = var9_12 = jq.kent("kfxt", keoa(int ), (int)524);
        }
        if (var10_10 || var10_10) ** GOTO lbl6
        if (!this.isLantern(var4_4)) ** GOTO lbl50
        if (var10_10) ** GOTO lbl6
        if (var11_9 /* !! */  == 0) ** GOTO lbl-1000
        switch (var11_9 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var10_10) ** GOTO lbl6
                var1_1.method_46416((float)(jq.kent("kfxu", kenp(int ), (int)525) * (float)var9_12), 0.0f, (float)jq.kent("kfxv", kenp(int ), (int)526));
                if (var10_10 || var10_10) ** GOTO lbl6
                var1_1.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees((float)jq.kent("kfxw", kenp(int ), (int)527)));
                if (var10_10) ** GOTO lbl6
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl55
            }
lbl50:
            // 1 sources

            if (var10_10 || var10_10) ** GOTO lbl6
            if (var4_4.method_7976() != class_1839.field_8949) ** GOTO lbl55
            if (var10_10 || var10_10) ** GOTO lbl6
            var1_1.method_46416(0.0f, (float)jq.kent("kfxx", kenp(int ), (int)528), 0.0f);
            if (var10_10) ** GOTO lbl6
lbl55:
            // 3 sources

            if (var10_10 || var10_10) ** GOTO lbl6
            var1_1.method_46416((float)var9_12, -var5_5 * jq.kent("kfxy", kenp(int ), (int)529), (float)jq.kent("kfxz", kenp(int ), (int)530));
            if (var10_10 || var10_10) ** GOTO lbl6
            var1_1.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees((float)(jq.kent("kfya", kenp(int ), (int)531) * (float)var9_12)));
            if (var10_10 || var10_10) ** GOTO lbl6
            var1_1.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees((float)(jq.kent("kfyb", kenp(int ), (int)532) * (float)var9_12)));
            if (var10_10 || var10_10) ** GOTO lbl6
            var1_1.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees((float)jq.kent("kfyc", kenp(int ), (int)533)));
            if (var10_10 || var10_10) ** GOTO lbl6
            var1_1.method_22905(this.holdScale.getValue(), this.holdScale.getValue(), this.holdScale.getValue());
            if (!var10_10 && !var10_10) ** break;
            ** continue;
            return;
            case 0: {
                var11_9 /* !! */  = (int)jq.kent("kfyd", keoa(int ), (int)534);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl89
            }
            case 1: {
                var11_9 /* !! */  = (int)jq.kent("kfye", keoa(int ), (int)535);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 2: {
                var11_9 /* !! */  = (int)jq.kent("kfyf", keoa(int ), (int)536);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl83:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var11_9 /* !! */  = (int)jq.kent("kfyg", keoa(int ), (int)537);
                    if (var12_8) {
                        throw null;
                    }
                    ** GOTO lbl103
                    break;
                }
            }
lbl89:
            // 2 sources

            case 4: {
                var11_9 /* !! */  = (int)jq.kent("kfyh", keoa(int ), (int)538);
                if (!var12_8) break;
                throw null;
            }
lbl93:
            // 2 sources

            case 5: {
                var11_9 /* !! */  = (int)jq.kent("kfyi", keoa(int ), (int)539);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 6: {
                do {
                    var11_9 /* !! */  = (int)jq.kent("kfyj", keoa(int ), (int)540);
                } while (!var12_8);
                throw null;
            }
lbl103:
            // 2 sources

            case 7: {
                var11_9 /* !! */  = (int)jq.kent("kfyk", keoa(int ), (int)541);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl108:
            // 3 sources

            case 8: {
                var11_9 /* !! */  = (int)jq.kent("kfyl", keoa(int ), (int)542);
                if (!var12_8) ** GOTO lbl93
                throw null;
            }
            case 9: {
                var11_9 /* !! */  = (int)jq.kent("kfym", keoa(int ), (int)543);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl251
            }
            case 10: {
                var11_9 /* !! */  = (int)jq.kent("kfyn", keoa(int ), (int)544);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl122:
            // 3 sources

            case 11: {
                var11_9 /* !! */  = (int)jq.kent("kfyo", keoa(int ), (int)545);
                if (!var12_8) ** GOTO lbl108
                throw null;
            }
lbl126:
            // 2 sources

            case 12: {
                var11_9 /* !! */  = (int)jq.kent("kfyp", keoa(int ), (int)546);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl243
            }
            case 13: {
                var11_9 /* !! */  = (int)jq.kent("kfyq", keoa(int ), (int)547);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 14: {
                var11_9 /* !! */  = (int)jq.kent("kfyr", keoa(int ), (int)548);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 15: {
                var11_9 /* !! */  = (int)jq.kent("kfys", keoa(int ), (int)549);
                if (!var12_8) ** GOTO lbl122
                throw null;
            }
lbl145:
            // 3 sources

            case 16: {
                var11_9 /* !! */  = (int)jq.kent("kfyt", keoa(int ), (int)550);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl150:
            // 4 sources

            case 17: {
                var11_9 /* !! */  = (int)jq.kent("kfyu", keoa(int ), (int)551);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 18: {
                var11_9 /* !! */  = (int)jq.kent("kfyv", keoa(int ), (int)552);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl259
            }
lbl160:
            // 3 sources

            case 19: {
                do {
                    var11_9 /* !! */  = (int)jq.kent("kfyw", keoa(int ), (int)553);
                } while (!var12_8);
                throw null;
            }
            case 20: {
                var11_9 /* !! */  = (int)jq.kent("kfyx", keoa(int ), (int)554);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl170:
            // 2 sources

            case 21: {
                var11_9 /* !! */  = (int)jq.kent("kfyy", keoa(int ), (int)555);
                if (!var12_8) ** GOTO lbl122
                throw null;
            }
lbl174:
            // 3 sources

            case 22: {
                var11_9 /* !! */  = (int)jq.kent("kfyz", keoa(int ), (int)556);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl179:
            // 5 sources

            case 23: {
                var11_9 /* !! */  = (int)jq.kent("kfza", keoa(int ), (int)557);
                if (!var12_8) ** GOTO lbl83
                throw null;
            }
lbl183:
            // 2 sources

            case 24: {
                var11_9 /* !! */  = (int)jq.kent("kfzb", keoa(int ), (int)558);
                if (!var12_8) ** GOTO lbl174
                throw null;
            }
lbl187:
            // 2 sources

            case 25: {
                var11_9 /* !! */  = (int)jq.kent("kfzc", keoa(int ), (int)559);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl200
            }
            case 26: {
                var11_9 /* !! */  = (int)jq.kent("kfzd", keoa(int ), (int)560);
                if (!var12_8) ** GOTO lbl160
                throw null;
            }
lbl196:
            // 3 sources

            case 27: {
                var11_9 /* !! */  = (int)jq.kent("kfze", keoa(int ), (int)561);
                if (!var12_8) ** GOTO lbl145
                throw null;
            }
lbl200:
            // 2 sources

            case 28: {
                var11_9 /* !! */  = (int)jq.kent("kfzf", keoa(int ), (int)562);
                if (!var12_8) ** GOTO lbl145
                throw null;
            }
            case 29: {
                var11_9 /* !! */  = (int)jq.kent("kfzg", keoa(int ), (int)563);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl209:
            // 2 sources

            case 30: {
                var11_9 /* !! */  = (int)jq.kent("kfzh", keoa(int ), (int)564);
                if (!var12_8) ** GOTO lbl196
                throw null;
            }
            case 31: {
                var11_9 /* !! */  = (int)jq.kent("kfzi", keoa(int ), (int)565);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl218:
            // 2 sources

            case 32: {
                var11_9 /* !! */  = (int)jq.kent("kfzj", keoa(int ), (int)566);
                if (!var12_8) ** GOTO lbl108
                throw null;
            }
            case 33: {
                var11_9 /* !! */  = (int)jq.kent("kfzk", keoa(int ), (int)567);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl227:
            // 3 sources

            case 34: {
                var11_9 /* !! */  = (int)jq.kent("kfzl", keoa(int ), (int)568);
                if (var12_8) {
                    throw null;
                }
            }
lbl231:
            // 4 sources

            case 35: {
                var11_9 /* !! */  = (int)jq.kent("kfzm", keoa(int ), (int)569);
                if (!var12_8) ** GOTO lbl179
                throw null;
            }
            case 36: {
                var11_9 /* !! */  = (int)jq.kent("kfzn", keoa(int ), (int)570);
                if (!var12_8) ** GOTO lbl160
                throw null;
            }
lbl239:
            // 2 sources

            case 37: {
                var11_9 /* !! */  = (int)jq.kent("kfzo", keoa(int ), (int)571);
                if (!var12_8) ** GOTO lbl126
                throw null;
            }
lbl243:
            // 3 sources

            case 38: {
                var11_9 /* !! */  = (int)jq.kent("kfzp", keoa(int ), (int)572);
                if (!var12_8) ** GOTO lbl231
                throw null;
            }
            case 39: {
                var11_9 /* !! */  = (int)jq.kent("kfzq", keoa(int ), (int)573);
                if (!var12_8) ** GOTO lbl243
                throw null;
            }
lbl251:
            // 3 sources

            case 40: {
                var11_9 /* !! */  = (int)jq.kent("kfzr", keoa(int ), (int)574);
                if (!var12_8) ** GOTO lbl150
                throw null;
            }
            case 41: {
                var11_9 /* !! */  = (int)jq.kent("kfzs", keoa(int ), (int)575);
                if (!var12_8) ** GOTO lbl187
                throw null;
            }
lbl259:
            // 2 sources

            case 42: {
                var11_9 /* !! */  = (int)jq.kent("kfzt", keoa(int ), (int)576);
                if (!var12_8) ** GOTO lbl150
                throw null;
            }
            case 43: 
        }
        var11_9 /* !! */  = (int)jq.kent("kfzu", keoa(int ), (int)577);
        ** while (!var12_8)
lbl266:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isNewHmi() {
        v0 /* !! */  = jq.sf;
        if (true) ** GOTO lbl5
        block36: while (true) {
            v0 /* !! */  = (long)(v1 - jq.kent("kesx", keqe(int ), (int)23));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -149156307: {
                    v1 = jq.kent("kesz", keqe(int ), (int)24);
                    continue block36;
                }
                case 197898621: {
                    break block36;
                }
                case 1916859566: {
                    v1 = jq.kent("ketb", keqe(int ), (int)25);
                    continue block36;
                }
            }
            break;
        }
        var3_1 = jq.c;
        v2 /* !! */  = jq.sf;
        if (true) ** GOTO lbl19
        block37: while (true) {
            v2 /* !! */  = (long)(v3 - jq.kent("ketc", keqe(int ), (int)26));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 197898621: {
                    break block37;
                }
                case 450419849: {
                    v3 = jq.kent("kete", keqe(int ), (int)27);
                    continue block37;
                }
                case 1891713265: {
                    v3 = jq.kent("ketg", keqe(int ), (int)28);
                    continue block37;
                }
            }
            break;
        }
        var2_2 /* !! */  = jq.b;
        v4 /* !! */  = jq.sf;
        if (true) ** GOTO lbl33
        block38: while (true) {
            v4 /* !! */  = (long)(v5 - jq.kent("keti", keqe(int ), (int)29));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 197898621: {
                    break block38;
                }
                case 658178522: {
                    v5 = jq.kent("ketk", keqe(int ), (int)30);
                    continue block38;
                }
                case 1025326122: {
                    v5 = jq.kent("ketl", keqe(int ), (int)31);
                    continue block38;
                }
            }
            break;
        }
        var1_3 = jq.a;
        if (var3_1) {
            throw null;
lbl45:
            // 4 sources

            return (boolean)jq.kent("ketn", keoa(int ), (int)44);
        }
        if (var1_3 || var1_3) ** GOTO lbl45
        v6 /* !! */  = jq.sf;
        if (true) ** GOTO lbl52
        block40: while (true) {
            v6 /* !! */  = (long)(jq.kent("ketr", keqe(int ), (int)33) - jq.kent("ketp", keqe(int ), (int)32));
lbl52:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 197898621: {
                    break block40;
                }
                case 1711471107: {
                    continue block40;
                }
            }
            break;
        }
        if (!this.isHoldMyItems()) ** GOTO lbl90
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block19 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl45
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_0 = jq.sf - jq.kent("ketu", keqe(int ), (int)34)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == jq.kent("ketw", keoa(int ), (int)45)) break;
                    v7 /* !! */  = (long)jq.kent("ketx", keoa(int ), (int)46);
                }
                v8 /* !! */  = jq.sf;
                if (true) ** GOTO lbl72
                block42: while (true) {
                    v8 /* !! */  = (long)(v9 - jq.kent("ketz", keqe(int ), (int)35));
lbl72:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1578426107: {
                            v9 = jq.kent("keua", keqe(int ), (int)36);
                            continue block42;
                        }
                        case -1066900353: {
                            v9 = jq.kent("keub", keqe(int ), (int)37);
                            continue block42;
                        }
                        case 197898621: {
                            break block42;
                        }
                        case 288490451: {
                            v9 = jq.kent("keuc", keqe(int ), (int)38);
                            continue block42;
                        }
                    }
                    break;
                }
                if (!this.holdAttack.isSelected("New")) ** GOTO lbl90
                if (var1_3) ** GOTO lbl45
                v10 = jq.kent("keud", keoa(int ), (int)47);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl93
lbl90:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v10 = jq.kent("keug", keoa(int ), (int)48);
lbl93:
                // 2 sources

                return (boolean)v10;
            }
lbl94:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)jq.kent("keui", keoa(int ), (int)49);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl99:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jq.kent("keuk", keoa(int ), (int)50);
                    if (!var3_1) break block19;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)jq.kent("keum", keoa(int ), (int)51);
                if (!var3_1) ** GOTO lbl94
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)jq.kent("keuo", keoa(int ), (int)52);
                if (!var3_1) break;
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)jq.kent("keuq", keoa(int ), (int)53);
                if (!var3_1) break;
                throw null;
            }
lbl116:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)jq.kent("keus", keoa(int ), (int)54);
                if (!var3_1) ** GOTO lbl99
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)jq.kent("keut", keoa(int ), (int)55);
                if (var3_1) {
                    throw null;
                }
            }
lbl124:
            // 4 sources

            case 7: {
                var2_2 /* !! */  = (int)jq.kent("keuv", keoa(int ), (int)56);
                if (!var3_1) ** GOTO lbl116
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)jq.kent("keuy", keoa(int ), (int)57);
        ** while (!var3_1)
lbl131:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kiod() {
        jq.kens[1200] = 1700471617;
        jq.kens[1201] = 337910848;
        jq.kens[1202] = -138767444;
        jq.kens[1203] = 1893990115;
        jq.kens[1204] = -665496121;
        jq.kens[1205] = 718477882;
        jq.kens[1206] = -1784133405;
        jq.kens[1207] = 812081762;
        jq.kens[1208] = 1291738106;
        jq.kens[1209] = 256336765;
        jq.kens[1210] = -1444309113;
        jq.kens[1211] = 911386543;
        jq.kens[1212] = 500457775;
        jq.kens[1213] = -1351517318;
        jq.kens[1214] = 1443634840;
        jq.kens[1215] = 1228375876;
        jq.kens[1216] = 380504444;
        jq.kens[1217] = 418053544;
        jq.kens[1218] = 455305168;
        jq.kens[1219] = 741586935;
        jq.kens[1220] = 1950507343;
        jq.kens[1221] = 74987809;
        jq.kens[1222] = -436644972;
        jq.kens[1223] = 774339883;
        jq.kens[1224] = -111486780;
        jq.kens[1225] = -682349869;
        jq.kens[1226] = 945991375;
        jq.kens[1227] = 411817416;
        jq.kens[1228] = -2097921597;
        jq.kens[1229] = 1714446858;
        jq.kens[1230] = -1859744952;
        jq.kens[1231] = -1649703117;
        jq.kens[1232] = 1410988127;
        jq.kens[1233] = 1674330143;
        jq.kens[1234] = 227947516;
        jq.kens[1235] = -454262151;
        jq.kens[1236] = 1742284450;
        jq.kens[1237] = 91802925;
        jq.kens[1238] = -944169409;
        jq.kens[1239] = 1699421654;
        jq.kens[1240] = -2035828737;
        jq.kens[1241] = -45026211;
        jq.kens[1242] = -983599927;
        jq.kens[1243] = 1955168531;
        jq.kens[1244] = -994169180;
        jq.kens[1245] = 911822746;
        jq.kens[1246] = 1470587669;
        jq.kens[1247] = 1746427782;
        jq.kens[1248] = 1989257759;
        jq.kens[1249] = -827382394;
        jq.kens[1250] = -595928908;
        jq.kens[1251] = -645333162;
        jq.kens[1252] = 527416092;
        jq.kens[1253] = -1046159712;
        jq.kens[1254] = -499430191;
        jq.kens[1255] = 583974623;
        jq.kens[1256] = -375909446;
        jq.kens[1257] = 780211739;
        jq.kens[1258] = 256795136;
        jq.kens[1259] = -1237031193;
        jq.kens[1260] = -1531050582;
        jq.kens[1261] = -282094909;
        jq.kens[1262] = 921439118;
        jq.kens[1263] = 94881724;
        jq.kens[1264] = -1853657690;
        jq.kens[1265] = -89398043;
        jq.kens[1266] = -579947552;
        jq.kens[1267] = 231412255;
        jq.kens[1268] = 1454190213;
        jq.kens[1269] = 406886677;
        jq.kens[1270] = -1904467221;
        jq.kens[1271] = -1113316303;
        jq.kens[1272] = 54624471;
        jq.kens[1273] = -1172307055;
        jq.kens[1274] = 67332969;
        jq.kens[1275] = 824421907;
        jq.kens[1276] = -758909655;
        jq.kens[1277] = -1432276818;
        jq.kens[1278] = 1727135272;
        jq.kens[1279] = -1213807294;
        jq.kens[1280] = 1784512718;
        jq.kens[1281] = 529371324;
        jq.kens[1282] = 1321676610;
        jq.kens[1283] = 213854306;
        jq.kens[1284] = -292915946;
        jq.kens[1285] = -170059686;
        jq.kens[1286] = 221966453;
        jq.kens[1287] = -44398353;
        jq.kens[1288] = 434460570;
        jq.kens[1289] = 1766268953;
        jq.kens[1290] = -1122104265;
        jq.kens[1291] = 1520383863;
        jq.kens[1292] = -816265309;
        jq.kens[1293] = -525964707;
        jq.kens[1294] = 1390876867;
        jq.kens[1295] = -44237224;
        jq.kens[1296] = 1390380431;
        jq.kens[1297] = 1595346596;
        jq.kens[1298] = -1143363285;
        jq.kens[1299] = 1041018107;
    }

    private static /* synthetic */ void kimb() {
        jq.kens[100] = 1825415933;
        jq.kens[101] = -1932608766;
        jq.kens[102] = -948508564;
        jq.kens[103] = 2023239979;
        jq.kens[104] = -1753245756;
        jq.kens[105] = -61811769;
        jq.kens[106] = 876697055;
        jq.kens[107] = 56192871;
        jq.kens[108] = -1725121617;
        jq.kens[109] = 2099545222;
        jq.kens[110] = -1407918475;
        jq.kens[111] = -1074410174;
        jq.kens[112] = -1068374175;
        jq.kens[113] = -573425637;
        jq.kens[114] = 1576562929;
        jq.kens[115] = -1216878644;
        jq.kens[116] = 2080340232;
        jq.kens[117] = -440280818;
        jq.kens[118] = 1146997725;
        jq.kens[119] = 1587056945;
        jq.kens[120] = 606261480;
        jq.kens[121] = 27163059;
        jq.kens[122] = 1057720041;
        jq.kens[123] = 393611625;
        jq.kens[124] = 246571864;
        jq.kens[125] = 1169155042;
        jq.kens[126] = 1770536607;
        jq.kens[127] = 1813774451;
        jq.kens[128] = 354638010;
        jq.kens[129] = -1243300018;
        jq.kens[130] = 2050149951;
        jq.kens[131] = 2057947789;
        jq.kens[132] = 1185389531;
        jq.kens[133] = -413365730;
        jq.kens[134] = -3793215;
        jq.kens[135] = 1933575867;
        jq.kens[136] = -778280422;
        jq.kens[137] = 660860292;
        jq.kens[138] = 1109840398;
        jq.kens[139] = -136930696;
        jq.kens[140] = -99365884;
        jq.kens[141] = -1211199484;
        jq.kens[142] = 1681064194;
        jq.kens[143] = 2055595273;
        jq.kens[144] = 529745867;
        jq.kens[145] = 1480435932;
        jq.kens[146] = 150043159;
        jq.kens[147] = 954466182;
        jq.kens[148] = 910708627;
        jq.kens[149] = 1409585807;
        jq.kens[150] = 1313472205;
        jq.kens[151] = -1745047470;
        jq.kens[152] = 2057044917;
        jq.kens[153] = 410552744;
        jq.kens[154] = -1040548776;
        jq.kens[155] = -1907994341;
        jq.kens[156] = 595991116;
        jq.kens[157] = -563655218;
        jq.kens[158] = -2019751644;
        jq.kens[159] = -518405433;
        jq.kens[160] = -399651211;
        jq.kens[161] = 622695000;
        jq.kens[162] = 724665253;
        jq.kens[163] = 71925436;
        jq.kens[164] = -181704234;
        jq.kens[165] = -852188127;
        jq.kens[166] = 247468721;
        jq.kens[167] = -496810021;
        jq.kens[168] = 131749713;
        jq.kens[169] = -1202812062;
        jq.kens[170] = -300501687;
        jq.kens[171] = -2091775476;
        jq.kens[172] = -1892334333;
        jq.kens[173] = -1707545868;
        jq.kens[174] = 1876853426;
        jq.kens[175] = -1099625347;
        jq.kens[176] = 784159459;
        jq.kens[177] = -578707936;
        jq.kens[178] = -1831443609;
        jq.kens[179] = 2065864327;
        jq.kens[180] = -603709381;
        jq.kens[181] = 2041897117;
        jq.kens[182] = 865801095;
        jq.kens[183] = 1147128764;
        jq.kens[184] = 1110540341;
        jq.kens[185] = 875134494;
        jq.kens[186] = -1467787095;
        jq.kens[187] = -1642156485;
        jq.kens[188] = -1057886304;
        jq.kens[189] = -234418493;
        jq.kens[190] = -1685588155;
        jq.kens[191] = 598307398;
        jq.kens[192] = 833626868;
        jq.kens[193] = -888207662;
        jq.kens[194] = 1072372305;
        jq.kens[195] = -1976109295;
        jq.kens[196] = -1597312877;
        jq.kens[197] = 1153076646;
        jq.kens[198] = 234623279;
        jq.kens[199] = 906852572;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$4() {
        block23: {
            block22: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = jq.sf - jq.kent("kifz", keqe(int ), (int)440)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  == jq.kent("kiga", keoa(int ), (int)1430)) break;
                    v0 /* !! */  = (long)jq.kent("kigb", keoa(int ), (int)1431);
                }
                var3_1 = jq.c;
                v1 /* !! */  = jq.sf;
                if (true) ** GOTO lbl12
                block10: while (true) {
                    v1 /* !! */  = (long)(v2 - jq.kent("kigc", keqe(int ), (int)441));
lbl12:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -241553727: {
                            v2 = jq.kent("kigd", keqe(int ), (int)442);
                            continue block10;
                        }
                        case 197898621: {
                            break block10;
                        }
                        case 733958770: {
                            v2 = jq.kent("kige", keqe(int ), (int)443);
                            continue block10;
                        }
                    }
                    break;
                }
                var2_2 = jq.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = jq.sf - jq.kent("kigf", keqe(int ), (int)444)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == jq.kent("kigg", keoa(int ), (int)1432)) break;
                    v3 /* !! */  = (long)jq.kent("kigh", keoa(int ), (int)1433);
                }
                var1_3 = jq.a;
                if (var3_1) {
                    throw null;
lbl31:
                    // 4 sources

                    return null;
                }
                if (var1_3 || var1_3) ** GOTO lbl31
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = jq.sf - jq.kent("kigi", keqe(int ), (int)445)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == jq.kent("kigj", keoa(int ), (int)1434)) break;
                    v4 /* !! */  = (long)jq.kent("kigk", keoa(int ), (int)1435);
                }
                if (!this.isHoldMyItems()) break block22;
                if (var1_3) ** GOTO lbl31
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = jq.sf - jq.kent("kigl", keqe(int ), (int)446)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == jq.kent("kigm", keoa(int ), (int)1436)) break;
                    v5 /* !! */  = (long)jq.kent("kign", keoa(int ), (int)1437);
                }
                if (this.isNewHmi()) break block22;
                if (var1_3) ** GOTO lbl31
                v6 = jq.kent("kigo", keoa(int ), (int)1438);
                if (var3_1) {
                    throw null;
                }
                break block23;
            }
            if (!var1_3 && !var1_3) ** break;
            ** while (true)
            v6 = jq.kent("kigp", keoa(int ), (int)1439);
        }
        v7 /* !! */  = jq.sf;
        if (true) ** GOTO lbl63
        block15: while (true) {
            v7 /* !! */  = (long)(jq.kent("kigr", keqe(int ), (int)448) - jq.kent("kigq", keqe(int ), (int)447));
lbl63:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 197898621: {
                    break block15;
                }
                case 1932880624: {
                    continue block15;
                }
            }
            break;
        }
        return (boolean)v6;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean shouldRenderHoldMyItems(class_742 var1_1, class_1268 var2_2, class_1799 var3_3) {
        block68: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = jq.sf - jq.kent("kfvs", keqe(int ), (int)118)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == jq.kent("kfvt", keoa(int ), (int)485)) break;
                v0 /* !! */  = (long)jq.kent("kfvu", keoa(int ), (int)486);
            }
            var6_4 = jq.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = jq.sf - jq.kent("kfvv", keqe(int ), (int)119)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == jq.kent("kfvw", keoa(int ), (int)487)) break;
                v1 /* !! */  = (long)jq.kent("kfvx", keoa(int ), (int)488);
            }
            var5_5 /* !! */  = jq.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = jq.sf - jq.kent("kfvy", keqe(int ), (int)120)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == jq.kent("kfvz", keoa(int ), (int)489)) break;
                v2 /* !! */  = (long)jq.kent("kfwa", keoa(int ), (int)490);
            }
            var4_6 = jq.a;
            if (var6_4) {
                throw null;
lbl24:
                // 11 sources

                return (boolean)jq.kent("kfwb", keoa(int ), (int)491);
            }
            if (var4_6 || var4_6) ** GOTO lbl24
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_3 = jq.sf - jq.kent("kfwc", keqe(int ), (int)121)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == jq.kent("kfwd", keoa(int ), (int)492)) break;
                v3 /* !! */  = (long)jq.kent("kfwe", keoa(int ), (int)493);
            }
            if (!this.isHoldMyItemsActive()) ** GOTO lbl110
            if (var4_6) ** GOTO lbl24
            v4 /* !! */  = jq.sf;
            if (true) ** GOTO lbl39
            block33: while (true) {
                v4 /* !! */  = (long)(v5 - jq.kent("kfwf", keqe(int ), (int)122));
lbl39:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case 60628607: {
                        v5 = jq.kent("kfwg", keqe(int ), (int)123);
                        continue block33;
                    }
                    case 197898621: {
                        break block33;
                    }
                    case 1248569305: {
                        v5 = jq.kent("kfwh", keqe(int ), (int)124);
                        continue block33;
                    }
                }
                break;
            }
            if (this.isNewHmi()) ** GOTO lbl110
            if (var4_6) ** GOTO lbl24
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_4 = jq.sf - jq.kent("kfwi", keqe(int ), (int)125)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v6 /* !! */  == jq.kent("kfwj", keoa(int ), (int)494)) break;
                v6 /* !! */  = (long)jq.kent("kfwk", keoa(int ), (int)495);
            }
            if (var1_1.method_31550()) ** GOTO lbl110
            if (var4_6) ** GOTO lbl24
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_5 = jq.sf - jq.kent("kfwl", keqe(int ), (int)126)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v7 /* !! */  == jq.kent("kfwm", keoa(int ), (int)496)) break;
                v7 /* !! */  = (long)jq.kent("kfwn", keoa(int ), (int)497);
            }
            if (var3_3.method_7909() instanceof class_1806) ** GOTO lbl110
            if (var4_6) ** GOTO lbl24
            v8 /* !! */  = jq.sf;
            if (true) ** GOTO lbl70
            block36: while (true) {
                v8 /* !! */  = (long)(jq.kent("kfwp", keqe(int ), (int)128) - jq.kent("kfwo", keqe(int ), (int)127));
lbl70:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -1572831880: {
                        continue block36;
                    }
                    case 197898621: {
                        break block36;
                    }
                }
                break;
            }
            if (var3_3.method_7909() instanceof class_1764) ** GOTO lbl110
            if (var4_6) ** GOTO lbl24
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_6 = jq.sf - jq.kent("kfwq", keqe(int ), (int)129)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v9 /* !! */  == jq.kent("kfwr", keoa(int ), (int)498)) break;
                v9 /* !! */  = (long)jq.kent("kfws", keoa(int ), (int)499);
            }
            if (!var1_1.method_6115()) break block68;
            if (var4_6) ** GOTO lbl24
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_7 = jq.sf - jq.kent("kfwt", keqe(int ), (int)130)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v10 /* !! */  == jq.kent("kfwu", keoa(int ), (int)500)) break;
                v10 /* !! */  = (long)jq.kent("kfwv", keoa(int ), (int)501);
            }
            if (var1_1.method_6058() == var2_2) ** GOTO lbl110
            if (var4_6) ** GOTO lbl24
        }
        if (var4_6 || var4_6) ** GOTO lbl24
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_8 = jq.sf - jq.kent("kfww", keqe(int ), (int)131)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v11 /* !! */  == jq.kent("kfwx", keoa(int ), (int)502)) break;
            v11 /* !! */  = (long)jq.kent("kfwy", keoa(int ), (int)503);
        }
        if (var1_1.method_6123()) ** GOTO lbl110
        if (var4_6) ** GOTO lbl24
        if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v12 = jq.kent("kfwz", keoa(int ), (int)504);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl110:
            // 7 sources

            if (!var4_6 && !var4_6) ** break;
            ** continue;
            v12 = jq.kent("kfxa", keoa(int ), (int)505);
lbl113:
            // 2 sources

            return (boolean)v12;
lbl114:
            // 2 sources

            case 0: {
                var5_5 /* !! */  = (int)jq.kent("kfxb", keoa(int ), (int)506);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl119:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_5 /* !! */  = (int)jq.kent("kfxc", keoa(int ), (int)507);
                    if (var6_4) {
                        throw null;
                    }
                    ** GOTO lbl134
                    break;
                }
            }
            case 2: {
                var5_5 /* !! */  = (int)jq.kent("kfxd", keoa(int ), (int)508);
                if (!var6_4) ** GOTO lbl119
                throw null;
            }
            case 3: {
                var5_5 /* !! */  = (int)jq.kent("kfxe", keoa(int ), (int)509);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl134:
            // 2 sources

            case 4: {
                var5_5 /* !! */  = (int)jq.kent("kfxf", keoa(int ), (int)510);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 5: {
                do {
                    var5_5 /* !! */  = (int)jq.kent("kfxg", keoa(int ), (int)511);
                } while (!var6_4);
                throw null;
            }
lbl144:
            // 2 sources

            case 6: {
                var5_5 /* !! */  = (int)jq.kent("kfxh", keoa(int ), (int)512);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl159
            }
            case 7: {
                var5_5 /* !! */  = (int)jq.kent("kfxi", keoa(int ), (int)513);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl181
            }
            case 8: {
                var5_5 /* !! */  = (int)jq.kent("kfxj", keoa(int ), (int)514);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl173
            }
lbl159:
            // 2 sources

            case 9: {
                var5_5 /* !! */  = (int)jq.kent("kfxk", keoa(int ), (int)515);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl164:
            // 2 sources

            case 10: {
                var5_5 /* !! */  = (int)jq.kent("kfxl", keoa(int ), (int)516);
                if (!var6_4) ** GOTO lbl114
                throw null;
            }
lbl168:
            // 2 sources

            case 11: {
                var5_5 /* !! */  = (int)jq.kent("kfxm", keoa(int ), (int)517);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl173:
            // 2 sources

            case 12: {
                var5_5 /* !! */  = (int)jq.kent("kfxn", keoa(int ), (int)518);
                if (!var6_4) ** GOTO lbl164
                throw null;
            }
lbl177:
            // 2 sources

            case 13: {
                var5_5 /* !! */  = (int)jq.kent("kfxo", keoa(int ), (int)519);
                if (var6_4) {
                    throw null;
                }
            }
lbl181:
            // 5 sources

            case 14: {
                var5_5 /* !! */  = (int)jq.kent("kfxp", keoa(int ), (int)520);
                if (var6_4) {
                    throw null;
                }
            }
lbl185:
            // 5 sources

            case 15: {
                var5_5 /* !! */  = (int)jq.kent("kfxq", keoa(int ), (int)521);
                if (!var6_4) ** GOTO lbl144
                throw null;
            }
            case 16: 
        }
        var5_5 /* !! */  = (int)jq.kent("kfxr", keoa(int ), (int)522);
        ** while (!var6_4)
lbl192:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean isHoldMyItemsActive() {
        CallSite callSite;
        boolean bl2;
        block64: {
            boolean bl3;
            block63: {
                block66: {
                    block65: {
                        while (true) {
                            long l2;
                            Object object;
                            if ((object = (l2 = sf - jq.kent("kfaq", keqe(int ), (int)67)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                            if (object == jq.kent("kfar", keoa(int ), (int)104)) break;
                            object = jq.kent("kfas", keoa(int ), (int)105);
                        }
                        bl3 = c;
                        Object object = sf;
                        block34: while (true) {
                            switch ((int)object) {
                                case 197898621: {
                                    break block34;
                                }
                                case 399715409: {
                                    object = jq.kent("kfau", keqe(int ), (int)69) - jq.kent("kfat", keqe(int ), (int)68);
                                    continue block34;
                                }
                            }
                            break;
                        }
                        int n2 = b;
                        Object object2 = sf;
                        boolean bl4 = true;
                        block35: while (true) {
                            CallSite callSite2;
                            if (!bl4 || (bl4 = false) || !true) {
                                object2 = callSite2 - jq.kent("kfav", keqe(int ), (int)70);
                            }
                            switch ((int)object2) {
                                case -1420713986: {
                                    callSite2 = jq.kent("kfaw", keqe(int ), (int)71);
                                    continue block35;
                                }
                                case 197898621: {
                                    break block35;
                                }
                                case 1399910911: {
                                    callSite2 = jq.kent("kfax", keqe(int ), (int)72);
                                    continue block35;
                                }
                            }
                            break;
                        }
                        bl2 = a;
                        if (bl3) {
                            throw null;
                        }
                        if (bl2 || bl2) return (boolean)jq.kent("kfay", keoa(int ), (int)106);
                        Object object3 = sf;
                        block36: while (true) {
                            switch ((int)object3) {
                                case -1288700645: {
                                    object3 = jq.kent("kfba", keqe(int ), (int)74) - jq.kent("kfaz", keqe(int ), (int)73);
                                    continue block36;
                                }
                                case 197898621: {
                                    break block36;
                                }
                            }
                            break;
                        }
                        if (!this.state) break block65;
                        if (bl2) return (boolean)jq.kent("kfay", keoa(int ), (int)106);
                        Object object4 = sf;
                        boolean bl5 = true;
                        block37: while (true) {
                            CallSite callSite3;
                            if (!bl5 || (bl5 = false) || !true) {
                                object4 = callSite3 - jq.kent("kfbb", keqe(int ), (int)75);
                            }
                            switch ((int)object4) {
                                case 197898621: {
                                    break block37;
                                }
                                case 239889894: {
                                    callSite3 = jq.kent("kfbc", keqe(int ), (int)76);
                                    continue block37;
                                }
                                case 491372078: {
                                    callSite3 = jq.kent("kfbd", keqe(int ), (int)77);
                                    continue block37;
                                }
                                case 1649265931: {
                                    callSite3 = jq.kent("kfbe", keqe(int ), (int)78);
                                    continue block37;
                                }
                            }
                            break;
                        }
                        if (this.isHoldMyItems()) break block66;
                        if (bl2) return (boolean)jq.kent("kfay", keoa(int ), (int)106);
                    }
                    if (bl2 || bl2) return (boolean)jq.kent("kfay", keoa(int ), (int)106);
                    return (boolean)jq.kent("kfbf", keoa(int ), (int)107);
                }
                if (bl2 || bl2) return (boolean)jq.kent("kfay", keoa(int ), (int)106);
                Object object = sf;
                boolean bl6 = true;
                block38: while (true) {
                    CallSite callSite4;
                    if (!bl6 || (bl6 = false) || !true) {
                        object = callSite4 - jq.kent("kfbg", keqe(int ), (int)79);
                    }
                    switch ((int)object) {
                        case -1618264458: {
                            callSite4 = jq.kent("kfbh", keqe(int ), (int)80);
                            continue block38;
                        }
                        case 197898621: {
                            break block38;
                        }
                        case 1088131364: {
                            callSite4 = jq.kent("kfbi", keqe(int ), (int)81);
                            continue block38;
                        }
                        case 1291435005: {
                            callSite4 = jq.kent("kfbk", keqe(int ), (int)82);
                            continue block38;
                        }
                    }
                    break;
                }
                hn hn2 = hn.getInstance();
                if (bl2 || bl2) return (boolean)jq.kent("kfay", keoa(int ), (int)106);
                Object object5 = sf;
                block39: while (true) {
                    switch ((int)object5) {
                        case -1906900190: {
                            object5 = jq.kent("kfbn", keqe(int ), (int)84) - jq.kent("kfbl", keqe(int ), (int)83);
                            continue block39;
                        }
                        case 197898621: {
                            break block39;
                        }
                    }
                    break;
                }
                while (true) {
                    long l3;
                    Object object6;
                    if ((object6 = (l3 = sf - jq.kent("kfbp", keqe(int ), (int)85)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                    if (object6 == jq.kent("kfbq", keoa(int ), (int)108)) {
                        if (this.onlyAura.isValue()) {
                            break;
                        }
                        break block63;
                    }
                    object6 = jq.kent("kfbs", keoa(int ), (int)109);
                }
                if (bl2) return (boolean)jq.kent("kfay", keoa(int ), (int)106);
                if (hn2 == null) break block64;
                if (bl2) return (boolean)jq.kent("kfay", keoa(int ), (int)106);
                while (true) {
                    long l4;
                    Object object7;
                    if ((object7 = (l4 = sf - jq.kent("kfbu", keqe(int ), (int)86)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
                    if (object7 == jq.kent("kfbv", keoa(int ), (int)110)) {
                        if (hn2.isState()) {
                            break;
                        }
                        break block64;
                    }
                    object7 = jq.kent("kfbw", keoa(int ), (int)111);
                }
                if (bl2) return (boolean)jq.kent("kfay", keoa(int ), (int)106);
                Object object8 = sf;
                block42: while (true) {
                    switch ((int)object8) {
                        case 197898621: {
                            break block42;
                        }
                        case 1441251874: {
                            object8 = jq.kent("kfbz", keqe(int ), (int)88) - jq.kent("kfby", keqe(int ), (int)87);
                            continue block42;
                        }
                    }
                    break;
                }
                if (hn2.getTarget() == null) break block64;
                if (bl2) return (boolean)jq.kent("kfay", keoa(int ), (int)106);
            }
            if (bl2 || bl2) return (boolean)jq.kent("kfay", keoa(int ), (int)106);
            callSite = jq.kent("kfca", keoa(int ), (int)112);
            if (!bl3) return (boolean)callSite;
            throw null;
        }
        if (bl2 || bl2) {
            return (boolean)jq.kent("kfay", keoa(int ), (int)106);
        }
        callSite = jq.kent("kfcd", keoa(int ), (int)113);
        return (boolean)callSite;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean isWeapon(class_1799 var1_1) {
        block54: {
            block52: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_1 = jq.sf - jq.kent("khrh", keqe(int ), (int)253)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == jq.kent("khri", keoa(int ), (int)1235)) break;
                    v0 /* !! */  = (long)jq.kent("khrj", keoa(int ), (int)1236);
                }
                var4_2 = jq.c;
                v1 /* !! */  = jq.sf;
                block28: while (true) {
                    switch ((int)v1 /* !! */ ) {
                        case -2053583016: {
                            v1 /* !! */  = (long)(jq.kent("khrl", keqe(int ), (int)255) - jq.kent("khrk", keqe(int ), (int)254));
                            continue block28;
                        }
                        case 197898621: {
                            break block28;
                        }
                    }
                    break;
                }
                var3_3 /* !! */  = jq.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = jq.sf - jq.kent("khrm", keqe(int ), (int)256)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == jq.kent("khrn", keoa(int ), (int)1237)) {
                        var2_4 = jq.a;
                        if (var4_2) {
                            throw null;
                        }
                        break;
                    }
                    v2 /* !! */  = (long)jq.kent("khro", keoa(int ), (int)1238);
                }
                if (var2_4 || var2_4) return (boolean)jq.kent("khrp", keoa(int ), (int)1239);
                v3 /* !! */  = jq.sf;
                if (true) ** GOTO lbl30
                block30: while (true) {
                    v3 /* !! */  = (long)(v4 - jq.kent("khrq", keqe(int ), (int)257));
lbl30:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1651511261: {
                            v4 = jq.kent("khrr", keqe(int ), (int)258);
                            continue block30;
                        }
                        case 197898621: {
                            break block30;
                        }
                        case 219625540: {
                            v4 = jq.kent("khrs", keqe(int ), (int)259);
                            continue block30;
                        }
                    }
                    break;
                }
                if (this.isSword(var1_1)) break block52;
                if (var2_4) return (boolean)jq.kent("khrp", keoa(int ), (int)1239);
                while (true) {
                    block53: {
                        if ((v5 /* !! */  = (cfr_temp_3 = jq.sf - jq.kent("khrt", keqe(int ), (int)260)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v5 /* !! */  != jq.kent("khru", keoa(int ), (int)1240)) break block53;
                        v6 /* !! */  = jq.sf;
                        if (true) ** GOTO lbl51
                    }
                    v5 /* !! */  = (long)jq.kent("khrv", keoa(int ), (int)1241);
                }
                block32: while (true) {
                    v6 /* !! */  = (long)(v7 - jq.kent("khrw", keqe(int ), (int)261));
lbl51:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 197898621: {
                            break block32;
                        }
                        case 689829664: {
                            v7 = jq.kent("khrx", keqe(int ), (int)262);
                            continue block32;
                        }
                        case 1370769035: {
                            v7 = jq.kent("khry", keqe(int ), (int)263);
                            continue block32;
                        }
                    }
                    break;
                }
                if (!var1_1.method_31573(class_3489.field_42612)) break block54;
                if (var2_4) return (boolean)jq.kent("khrp", keoa(int ), (int)1239);
            }
            if (var2_4 || var2_4) return (boolean)jq.kent("khrp", keoa(int ), (int)1239);
            v8 = jq.kent("khrz", keoa(int ), (int)1242);
            if (!var4_2) return (boolean)v8;
            throw null;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block33: while (true) {
            block55: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var2_4 || var2_4) {
                            return (boolean)jq.kent("khrp", keoa(int ), (int)1239);
                        }
                        v8 = jq.kent("khsa", keoa(int ), (int)1243);
                        return (boolean)v8;
                    }
                    case 1: {
                        var3_3 /* !! */  = (int)jq.kent("khsc", keoa(int ), (int)1245);
                        cfr_temp_0 = 4;
                        if (var4_2) {
                            throw null;
                        }
                        break block55;
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)jq.kent("khsd", keoa(int ), (int)1246);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 0: {
                        do {
                            var3_3 /* !! */  = (int)jq.kent("khsb", keoa(int ), (int)1244);
                        } while (!var4_2);
                        throw null;
                    }
                    case 4: {
                        var3_3 /* !! */  = (int)jq.kent("khsf", keoa(int ), (int)1248);
                        cfr_temp_0 = 6;
                        if (var4_2) {
                            throw null;
                        }
                        break block55;
                    }
                    case 5: {
                        var3_3 /* !! */  = (int)jq.kent("khsg", keoa(int ), (int)1249);
                        if (!var4_2) ** break;
                        throw null;
                    }
                    case 6: {
                        var3_3 /* !! */  = (int)jq.kent("khsh", keoa(int ), (int)1250);
                        cfr_temp_0 = 3;
                        if (var4_2) {
                            throw null;
                        }
                        break block55;
                    }
                    case 7: {
                        do {
                            var3_3 /* !! */  = (int)jq.kent("khsi", keoa(int ), (int)1251);
                        } while (!var4_2);
                        throw null;
                    }
                    case 8: {
                        ** GOTO lbl124
                    }
                    case 10: {
                        ** GOTO lbl121
                    }
                    case 3: {
                        var3_3 /* !! */  = (int)jq.kent("khse", keoa(int ), (int)1247);
                        if (!var4_2) ** break;
                        throw null;
lbl121:
                        // 3 sources

                        var3_3 /* !! */  = (int)jq.kent("khsl", keoa(int ), (int)1254);
                        if (var4_2) {
                            throw null;
                        }
lbl124:
                        // 3 sources

                        var3_3 /* !! */  = (int)jq.kent("khsj", keoa(int ), (int)1252);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 9: 
                }
                ** GOTO lbl132
            }
            do {
                if (true) continue block33;
lbl132:
                // 2 sources

                var3_3 /* !! */  = (int)jq.kent("khsk", keoa(int ), (int)1253);
                cfr_temp_0 = 3;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$5() {
        block22: {
            block21: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = jq.sf - jq.kent("kiey", keqe(int ), (int)432)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  == jq.kent("kiez", keoa(int ), (int)1411)) break;
                    v0 /* !! */  = (long)jq.kent("kifa", keoa(int ), (int)1412);
                }
                var3_1 = jq.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = jq.sf - jq.kent("kifb", keqe(int ), (int)433)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v1 /* !! */  == jq.kent("kifc", keoa(int ), (int)1413)) break;
                    v1 /* !! */  = (long)jq.kent("kifd", keoa(int ), (int)1414);
                }
                var2_2 = jq.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = jq.sf - jq.kent("kife", keqe(int ), (int)434)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == jq.kent("kiff", keoa(int ), (int)1415)) break;
                    v2 /* !! */  = (long)jq.kent("kifg", keoa(int ), (int)1416);
                }
                var1_3 = jq.a;
                if (var3_1) {
                    throw null;
lbl24:
                    // 4 sources

                    return null;
                }
                if (var1_3 || var1_3) ** GOTO lbl24
                v3 /* !! */  = jq.sf;
                if (true) ** GOTO lbl31
                block12: while (true) {
                    v3 /* !! */  = (long)(jq.kent("kifi", keqe(int ), (int)436) - jq.kent("kifh", keqe(int ), (int)435));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 197898621: {
                            break block12;
                        }
                        case 1547044181: {
                            continue block12;
                        }
                    }
                    break;
                }
                if (!this.isHoldMyItems()) break block21;
                if (var1_3) ** GOTO lbl24
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = jq.sf - jq.kent("kifj", keqe(int ), (int)437)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == jq.kent("kifk", keoa(int ), (int)1417)) break;
                    v4 /* !! */  = (long)jq.kent("kifl", keoa(int ), (int)1418);
                }
                if (this.isNewHmi()) break block21;
                if (var1_3) ** GOTO lbl24
                v5 = jq.kent("kifm", keoa(int ), (int)1419);
                if (var3_1) {
                    throw null;
                }
                break block22;
            }
            if (!var1_3 && !var1_3) ** break;
            ** while (true)
            v5 = jq.kent("kifn", keoa(int ), (int)1420);
        }
        v6 /* !! */  = jq.sf;
        if (true) ** GOTO lbl59
        block14: while (true) {
            v6 /* !! */  = (long)(jq.kent("kifp", keqe(int ), (int)439) - jq.kent("kifo", keqe(int ), (int)438));
lbl59:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -432826363: {
                    continue block14;
                }
                case 197898621: {
                    break block14;
                }
            }
            break;
        }
        return (boolean)v5;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private /* synthetic */ Boolean lambda$new$0() {
        v0 /* !! */  = jq.sf;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - jq.kent("kijx", keqe(int ), (int)479));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1706274436: {
                    v1 = jq.kent("kijy", keqe(int ), (int)480);
                    continue block24;
                }
                case 197898621: {
                    break block24;
                }
                case 1169426451: {
                    v1 = jq.kent("kijz", keqe(int ), (int)481);
                    continue block24;
                }
            }
            break;
        }
        var3_1 = jq.c;
        while (true) {
            block47: {
                if ((v2 /* !! */  = (cfr_temp_1 = jq.sf - jq.kent("kika", keqe(int ), (int)482)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  != jq.kent("kikb", keoa(int ), (int)1493)) break block47;
                var2_2 /* !! */  = jq.b;
                if (var2_2 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v2 /* !! */  = (long)jq.kent("kikc", keoa(int ), (int)1494);
        }
        cfr_temp_0 = -2147483648;
        block26: do {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    v3 /* !! */  = jq.sf;
                    block27: while (true) {
                        switch ((int)v3 /* !! */ ) {
                            case -929344695: {
                                v3 /* !! */  = (long)(jq.kent("kike", keqe(int ), (int)484) - jq.kent("kikd", keqe(int ), (int)483));
                                continue block27;
                            }
                            case 197898621: {
                                break block27;
                            }
                        }
                        break;
                    }
                    var1_3 = jq.a;
                    if (var3_1) {
                        throw null;
                    }
                    if (var1_3 != false) return null;
                    if (var1_3 != false) return null;
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_2 = jq.sf - jq.kent("kikf", keqe(int ), (int)485)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v4 /* !! */  != jq.kent("kikg", keoa(int ), (int)1495)) ** GOTO lbl50
                        if (!this.isHoldMyItems()) {
                            break;
                        }
                        ** GOTO lbl-1000
lbl50:
                        // 1 sources

                        v4 /* !! */  = (long)jq.kent("kikh", keoa(int ), (int)1496);
                    }
                    if (var1_3 != false) return null;
                    v5 /* !! */  = jq.sf;
                    block29: while (true) {
                        switch ((int)v5 /* !! */ ) {
                            case -2014346355: {
                                v5 /* !! */  = (long)(jq.kent("kikj", keqe(int ), (int)487) - jq.kent("kiki", keqe(int ), (int)486));
                                continue block29;
                            }
                            case 197898621: {
                                break block29;
                            }
                        }
                        break;
                    }
                    if (!this.isNewHmi()) {
                        if (var1_3 != false) return null;
                        v6 = jq.kent("kikk", keoa(int ), (int)1497);
                        if (var3_1) {
                            throw null;
                        }
                    } else lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 != false) return null;
                        if (var1_3 != false) return null;
                        v6 = jq.kent("kikl", keoa(int ), (int)1498);
                    }
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_3 = jq.sf - jq.kent("kikm", keqe(int ), (int)488)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v7 /* !! */  == jq.kent("kikn", keoa(int ), (int)1499)) {
                            return (boolean)v6;
                        }
                        v7 /* !! */  = (long)jq.kent("kiko", keoa(int ), (int)1500);
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)jq.kent("kikq", keoa(int ), (int)1502);
                    cfr_temp_0 = 6;
                    if (!var3_1) continue block26;
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)jq.kent("kikr", keoa(int ), (int)1503);
                    cfr_temp_0 = 4;
                    if (!var3_1) continue block26;
                    throw null;
                }
                case 3: {
                    var2_2 /* !! */  = (int)jq.kent("kiks", keoa(int ), (int)1504);
                    cfr_temp_0 = 4;
                    if (!var3_1) continue block26;
                    throw null;
                }
                case 6: {
                    var2_2 /* !! */  = (int)jq.kent("kikv", keoa(int ), (int)1507);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 0: {
                    var2_2 /* !! */  = (int)jq.kent("kikp", keoa(int ), (int)1501);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 4: {
                    ** GOTO lbl111
                }
                case 7: {
                    do {
                        var2_2 /* !! */  = (int)jq.kent("kikw", keoa(int ), (int)1508);
                    } while (!var3_1);
                    throw null;
                }
                case 8: {
                    var2_2 /* !! */  = (int)jq.kent("kikx", keoa(int ), (int)1509);
                    if (var3_1) {
                        throw null;
                    }
lbl111:
                    // 3 sources

                    var2_2 /* !! */  = (int)jq.kent("kikt", keoa(int ), (int)1505);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 5: 
            }
            break;
        } while (true);
        do {
            var2_2 /* !! */  = (int)jq.kent("kiku", keoa(int ), (int)1506);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void kirv() {
        jq.keqg[300] = -4461320746999572617L;
        jq.keqg[301] = -2131829741261425159L;
        jq.keqg[302] = 141277483018829714L;
        jq.keqg[303] = -1208124573528530055L;
        jq.keqg[304] = 5110715042825382197L;
        jq.keqg[305] = 4988971542141707971L;
        jq.keqg[306] = 3225425481681569668L;
        jq.keqg[307] = -1672716682281275225L;
        jq.keqg[308] = 5401160767776227100L;
        jq.keqg[309] = 5626289085126341012L;
        jq.keqg[310] = 1016978161582140802L;
        jq.keqg[311] = 6157883583200241606L;
        jq.keqg[312] = -7408339541699483962L;
        jq.keqg[313] = -7910408743592649773L;
        jq.keqg[314] = 1219469959989553115L;
        jq.keqg[315] = -1677718468823043770L;
        jq.keqg[316] = 5681855961150125654L;
        jq.keqg[317] = 5922142182624143289L;
        jq.keqg[318] = -6635215822999249601L;
        jq.keqg[319] = -4642590295738771653L;
        jq.keqg[320] = -6202766899233768592L;
        jq.keqg[321] = -9079164825842974011L;
        jq.keqg[322] = 2387724034150910865L;
        jq.keqg[323] = -2542395228149134137L;
        jq.keqg[324] = -198461885656088482L;
        jq.keqg[325] = 5968160407777114327L;
        jq.keqg[326] = 8001438932325618986L;
        jq.keqg[327] = 4767601530466922889L;
        jq.keqg[328] = -5519977799391498649L;
        jq.keqg[329] = -7783305837514794017L;
        jq.keqg[330] = 310315560047835480L;
        jq.keqg[331] = 3865080835308732310L;
        jq.keqg[332] = -3963839256303384371L;
        jq.keqg[333] = 1109499452452390712L;
        jq.keqg[334] = 8417546512034764598L;
        jq.keqg[335] = 2110352321634402045L;
        jq.keqg[336] = -8469189746662368324L;
        jq.keqg[337] = 7522460292003980068L;
        jq.keqg[338] = 6056646833591493083L;
        jq.keqg[339] = 3618923140196219497L;
        jq.keqg[340] = 3916160895191275183L;
        jq.keqg[341] = 3683924451601016996L;
        jq.keqg[342] = 7583979046739392180L;
        jq.keqg[343] = -337586582675600780L;
        jq.keqg[344] = -3305217963302888304L;
        jq.keqg[345] = -8475920954691430630L;
        jq.keqg[346] = -1908973247746945124L;
        jq.keqg[347] = -2946098908469363548L;
        jq.keqg[348] = -342293122510899550L;
        jq.keqg[349] = -3052159396527990195L;
        jq.keqg[350] = -1989887658416213272L;
        jq.keqg[351] = -5659115982487798493L;
        jq.keqg[352] = -4474278285778589843L;
        jq.keqg[353] = -4641065794013527318L;
        jq.keqg[354] = -1910004396399792014L;
        jq.keqg[355] = 849351873333643072L;
        jq.keqg[356] = -5493635415691985151L;
        jq.keqg[357] = -8097972666182365674L;
        jq.keqg[358] = -7596746135238711828L;
        jq.keqg[359] = -8317200633095872356L;
        jq.keqg[360] = 4380274245618885254L;
        jq.keqg[361] = 8932703323742487606L;
        jq.keqg[362] = -9045172048221256642L;
        jq.keqg[363] = 7773914665238422755L;
        jq.keqg[364] = 2750797732906418129L;
        jq.keqg[365] = -8311214841227670985L;
        jq.keqg[366] = -6933957627157933914L;
        jq.keqg[367] = -2604512116067807202L;
        jq.keqg[368] = -2679642343377652990L;
        jq.keqg[369] = -4224402781269024801L;
        jq.keqg[370] = -4529372217852498930L;
        jq.keqg[371] = -5057393597349439100L;
        jq.keqg[372] = 6546775438688356494L;
        jq.keqg[373] = 1205238991214998612L;
        jq.keqg[374] = -6438979072749642450L;
        jq.keqg[375] = 2159807236991228067L;
        jq.keqg[376] = -6554104997399017919L;
        jq.keqg[377] = -2346779029088859830L;
        jq.keqg[378] = 4274634088291397237L;
        jq.keqg[379] = -7684874171606023319L;
        jq.keqg[380] = -858738118930838353L;
        jq.keqg[381] = 7784583858181666121L;
        jq.keqg[382] = 7487070775499828051L;
        jq.keqg[383] = 3371760877073928013L;
        jq.keqg[384] = 6608207941121341450L;
        jq.keqg[385] = 1367927968813392724L;
        jq.keqg[386] = -1901271557425141540L;
        jq.keqg[387] = -7413042842069998045L;
        jq.keqg[388] = -3294382081986695120L;
        jq.keqg[389] = 40144460774204157L;
        jq.keqg[390] = 4054229854929643194L;
        jq.keqg[391] = 7833194459672810028L;
        jq.keqg[392] = 6795224141049404342L;
        jq.keqg[393] = 3222637383793594707L;
        jq.keqg[394] = 9221568208851614999L;
        jq.keqg[395] = 2246035726776274772L;
        jq.keqg[396] = 6423756435878936561L;
        jq.keqg[397] = 6943767840223020919L;
        jq.keqg[398] = -1351365719616326434L;
        jq.keqg[399] = 3632135042798626385L;
    }

    private static /* synthetic */ void kiop() {
        jq.kens[1400] = 1845763020;
        jq.kens[1401] = 430509345;
        jq.kens[1402] = -420854771;
        jq.kens[1403] = -1308410286;
        jq.kens[1404] = -258870299;
        jq.kens[1405] = -1779467540;
        jq.kens[1406] = 1760722731;
        jq.kens[1407] = 865581792;
        jq.kens[1408] = -1918058096;
        jq.kens[1409] = 379540682;
        jq.kens[1410] = -805491530;
        jq.kens[1411] = -29275231;
        jq.kens[1412] = 826979482;
        jq.kens[1413] = 501888185;
        jq.kens[1414] = 2037852290;
        jq.kens[1415] = -1018354508;
        jq.kens[1416] = 525792707;
        jq.kens[1417] = 1328635130;
        jq.kens[1418] = 852017901;
        jq.kens[1419] = -1940956175;
        jq.kens[1420] = 1174584133;
        jq.kens[1421] = -1008708293;
        jq.kens[1422] = -159706811;
        jq.kens[1423] = 1800837316;
        jq.kens[1424] = -1539489329;
        jq.kens[1425] = -1289626078;
        jq.kens[1426] = 1696902314;
        jq.kens[1427] = 22892642;
        jq.kens[1428] = 186182758;
        jq.kens[1429] = -1542176076;
        jq.kens[1430] = 1767914584;
        jq.kens[1431] = -1657319775;
        jq.kens[1432] = -1269429170;
        jq.kens[1433] = -1538817556;
        jq.kens[1434] = 2123956981;
        jq.kens[1435] = -326118458;
        jq.kens[1436] = 1855024985;
        jq.kens[1437] = -379075661;
        jq.kens[1438] = -526957745;
        jq.kens[1439] = -583553511;
        jq.kens[1440] = -1639202651;
        jq.kens[1441] = 998550649;
        jq.kens[1442] = -717079715;
        jq.kens[1443] = -930329248;
        jq.kens[1444] = -63523571;
        jq.kens[1445] = -154776478;
        jq.kens[1446] = 249601086;
        jq.kens[1447] = 515123935;
        jq.kens[1448] = 648612662;
        jq.kens[1449] = 1383636883;
        jq.kens[1450] = -109120673;
        jq.kens[1451] = -1781647729;
        jq.kens[1452] = -1497728319;
        jq.kens[1453] = 414506385;
        jq.kens[1454] = 724976470;
        jq.kens[1455] = 1012119628;
        jq.kens[1456] = -408625865;
        jq.kens[1457] = -1135336784;
        jq.kens[1458] = -1454782153;
        jq.kens[1459] = -184403813;
        jq.kens[1460] = 324805558;
        jq.kens[1461] = -1949120714;
        jq.kens[1462] = 1311461490;
        jq.kens[1463] = -564021101;
        jq.kens[1464] = -2036729307;
        jq.kens[1465] = 510032400;
        jq.kens[1466] = 273579672;
        jq.kens[1467] = -667837700;
        jq.kens[1468] = -783745105;
        jq.kens[1469] = 826108840;
        jq.kens[1470] = -1905453733;
        jq.kens[1471] = -1828744661;
        jq.kens[1472] = 1694013972;
        jq.kens[1473] = 577768130;
        jq.kens[1474] = 437134007;
        jq.kens[1475] = 1170835767;
        jq.kens[1476] = -2115508836;
        jq.kens[1477] = -997356954;
        jq.kens[1478] = 2064064215;
        jq.kens[1479] = 1214606433;
        jq.kens[1480] = 920071021;
        jq.kens[1481] = 1218258312;
        jq.kens[1482] = 567628566;
        jq.kens[1483] = -416601812;
        jq.kens[1484] = -1010750678;
        jq.kens[1485] = -709357147;
        jq.kens[1486] = -1228700153;
        jq.kens[1487] = -28483448;
        jq.kens[1488] = -1298122001;
        jq.kens[1489] = 1175882448;
        jq.kens[1490] = 465712446;
        jq.kens[1491] = 1184471066;
        jq.kens[1492] = 913768556;
        jq.kens[1493] = -347567104;
        jq.kens[1494] = 1667114277;
        jq.kens[1495] = 2030760681;
        jq.kens[1496] = -457094116;
        jq.kens[1497] = -1508217263;
        jq.kens[1498] = 1228199471;
        jq.kens[1499] = -306098841;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float holdEase(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jq.sf - jq.kent("khmp", keqe(int ), (int)212)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jq.kent("khmq", keoa(int ), (int)1154)) break;
            v0 /* !! */  = (long)jq.kent("khmr", keoa(int ), (int)1155);
        }
        var6_2 = jq.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jq.sf - jq.kent("khms", keqe(int ), (int)213)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jq.kent("khmt", keoa(int ), (int)1156)) break;
            v1 /* !! */  = (long)jq.kent("khmu", keoa(int ), (int)1157);
        }
        var5_3 /* !! */  = jq.b;
        v2 /* !! */  = jq.sf;
        if (true) ** GOTO lbl19
        block23: while (true) {
            v2 /* !! */  = (long)(jq.kent("khmw", keqe(int ), (int)215) - jq.kent("khmv", keqe(int ), (int)214));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 139854794: {
                    continue block23;
                }
                case 197898621: {
                    break block23;
                }
            }
            break;
        }
        var4_4 = jq.a;
        if (var6_2) {
            throw null;
lbl27:
            // 7 sources

            return (float)jq.kent("khmx", kenp(int ), (int)1158);
        }
        if (var4_4 || var4_4) ** GOTO lbl27
        var2_5 = jq.kent("khmy", kenp(int ), (int)1159);
        if (var4_4) ** GOTO lbl27
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl27
                if (!(var1_1 < jq.kent("khmz", kenp(int ), (int)1160))) ** GOTO lbl41
                if (var4_4 || var4_4) ** GOTO lbl27
                var3_6 = 2.0f * var1_1;
                if (var4_4 || var4_4) ** GOTO lbl27
                return var3_6 * var3_6 * ((var2_5 + 1.0f) * var3_6 - var2_5) * jq.kent("khna", kenp(int ), (int)1161);
lbl41:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl27
                var3_7 = 2.0f * var1_1 - 2.0f;
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return (var3_7 * var3_7 * ((var2_5 + 1.0f) * var3_7 + var2_5) + 2.0f) * jq.kent("khnb", kenp(int ), (int)1162);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)jq.kent("khnc", keoa(int ), (int)1163);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl75
                    break;
                }
            }
lbl52:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)jq.kent("khnd", keoa(int ), (int)1164);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl80
            }
            case 2: {
                var5_3 /* !! */  = (int)jq.kent("khne", keoa(int ), (int)1165);
                if (!var6_2) break;
                throw null;
            }
lbl61:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)jq.kent("khnf", keoa(int ), (int)1166);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl75
            }
            case 4: {
                var5_3 /* !! */  = (int)jq.kent("khng", keoa(int ), (int)1167);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl89
            }
            case 5: {
                var5_3 /* !! */  = (int)jq.kent("khnh", keoa(int ), (int)1168);
                if (!var6_2) ** GOTO lbl52
                throw null;
            }
lbl75:
            // 3 sources

            case 6: {
                var5_3 /* !! */  = (int)jq.kent("khni", keoa(int ), (int)1169);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl93
            }
lbl80:
            // 3 sources

            case 7: {
                var5_3 /* !! */  = (int)jq.kent("khnj", keoa(int ), (int)1170);
                if (!var6_2) break;
                throw null;
            }
lbl84:
            // 2 sources

            case 8: {
                var5_3 /* !! */  = (int)jq.kent("khnk", keoa(int ), (int)1171);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl101
            }
lbl89:
            // 3 sources

            case 9: {
                var5_3 /* !! */  = (int)jq.kent("khnl", keoa(int ), (int)1172);
                if (!var6_2) ** GOTO lbl80
                throw null;
            }
lbl93:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)jq.kent("khnm", keoa(int ), (int)1173);
                if (!var6_2) break;
                throw null;
            }
            case 11: {
                var5_3 /* !! */  = (int)jq.kent("khnn", keoa(int ), (int)1174);
                if (!var6_2) ** GOTO lbl89
                throw null;
            }
lbl101:
            // 2 sources

            case 12: {
                var5_3 /* !! */  = (int)jq.kent("khno", keoa(int ), (int)1175);
                if (!var6_2) ** GOTO lbl61
                throw null;
            }
            case 13: {
                var5_3 /* !! */  = (int)jq.kent("khnp", keoa(int ), (int)1176);
                if (!var6_2) ** GOTO lbl84
                throw null;
            }
            case 14: 
        }
        var5_3 /* !! */  = (int)jq.kent("khnq", keoa(int ), (int)1177);
        ** while (!var6_2)
lbl112:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kinq() {
        jq.kens[800] = 1417965361;
        jq.kens[801] = -356145966;
        jq.kens[802] = -1155322546;
        jq.kens[803] = 1502507133;
        jq.kens[804] = -1141202601;
        jq.kens[805] = 1883501153;
        jq.kens[806] = 1019501826;
        jq.kens[807] = 1006752359;
        jq.kens[808] = -694967248;
        jq.kens[809] = -1847607093;
        jq.kens[810] = 97583220;
        jq.kens[811] = 542082820;
        jq.kens[812] = 266934881;
        jq.kens[813] = -1704513052;
        jq.kens[814] = 1285339384;
        jq.kens[815] = -757247713;
        jq.kens[816] = -1152974352;
        jq.kens[817] = 1808176602;
        jq.kens[818] = -1593017936;
        jq.kens[819] = -1707521799;
        jq.kens[820] = -547495893;
        jq.kens[821] = 2072245057;
        jq.kens[822] = 870412300;
        jq.kens[823] = -1332382591;
        jq.kens[824] = 1653688264;
        jq.kens[825] = 501382251;
        jq.kens[826] = -366600883;
        jq.kens[827] = -499677699;
        jq.kens[828] = -1863390238;
        jq.kens[829] = 2137461404;
        jq.kens[830] = 350633394;
        jq.kens[831] = 1769984702;
        jq.kens[832] = 343128023;
        jq.kens[833] = -1039197236;
        jq.kens[834] = 641588966;
        jq.kens[835] = -802845367;
        jq.kens[836] = 1027026194;
        jq.kens[837] = -2048767278;
        jq.kens[838] = -898397146;
        jq.kens[839] = -43604767;
        jq.kens[840] = -2143732806;
        jq.kens[841] = 1431704234;
        jq.kens[842] = -1853670153;
        jq.kens[843] = 1753260764;
        jq.kens[844] = 1686446080;
        jq.kens[845] = 426172049;
        jq.kens[846] = 9656716;
        jq.kens[847] = 966019974;
        jq.kens[848] = -1933799865;
        jq.kens[849] = 1620022013;
        jq.kens[850] = -1154416088;
        jq.kens[851] = -831258062;
        jq.kens[852] = 1067036502;
        jq.kens[853] = -673629085;
        jq.kens[854] = 1129685839;
        jq.kens[855] = -1042684702;
        jq.kens[856] = -133903659;
        jq.kens[857] = -1904224436;
        jq.kens[858] = -628574981;
        jq.kens[859] = 1329951286;
        jq.kens[860] = 1970229262;
        jq.kens[861] = 2027161049;
        jq.kens[862] = 737625904;
        jq.kens[863] = 2132666242;
        jq.kens[864] = -440498733;
        jq.kens[865] = 22989778;
        jq.kens[866] = -300609916;
        jq.kens[867] = -1422709495;
        jq.kens[868] = -61418337;
        jq.kens[869] = -1904445442;
        jq.kens[870] = -459066142;
        jq.kens[871] = -404434581;
        jq.kens[872] = 613355259;
        jq.kens[873] = 78401204;
        jq.kens[874] = -2008223094;
        jq.kens[875] = -1694971813;
        jq.kens[876] = -1872405469;
        jq.kens[877] = 462932402;
        jq.kens[878] = 1837511515;
        jq.kens[879] = -1550655340;
        jq.kens[880] = -440030999;
        jq.kens[881] = 950894892;
        jq.kens[882] = -1135031212;
        jq.kens[883] = -2007423731;
        jq.kens[884] = 1196147416;
        jq.kens[885] = -883355096;
        jq.kens[886] = -628030120;
        jq.kens[887] = -387932821;
        jq.kens[888] = 1466532251;
        jq.kens[889] = -844982776;
        jq.kens[890] = 159546161;
        jq.kens[891] = 1631658422;
        jq.kens[892] = 813408928;
        jq.kens[893] = -711622808;
        jq.kens[894] = -1532322346;
        jq.kens[895] = -1855572657;
        jq.kens[896] = -1747043592;
        jq.kens[897] = -378015703;
        jq.kens[898] = -419016976;
        jq.kens[899] = -1466032863;
    }

    private static /* synthetic */ void kile() {
        jq.kenr[600] = -1119042570;
        jq.kenr[601] = -1516791922;
        jq.kenr[602] = 115780226;
        jq.kenr[603] = -597482700;
        jq.kenr[604] = 364842986;
        jq.kenr[605] = -788805779;
        jq.kenr[606] = -196380336;
        jq.kenr[607] = -1717954778;
        jq.kenr[608] = 1721603845;
        jq.kenr[609] = -2103642925;
        jq.kenr[610] = -1573812022;
        jq.kenr[611] = 1495442977;
        jq.kenr[612] = 1844541652;
        jq.kenr[613] = -426469373;
        jq.kenr[614] = -1878128925;
        jq.kenr[615] = -1357823695;
        jq.kenr[616] = 1949111648;
        jq.kenr[617] = 1334268278;
        jq.kenr[618] = -67201808;
        jq.kenr[619] = -1068051524;
        jq.kenr[620] = -947259084;
        jq.kenr[621] = 2095806338;
        jq.kenr[622] = 2094126952;
        jq.kenr[623] = -419125650;
        jq.kenr[624] = 1050883716;
        jq.kenr[625] = 1562680182;
        jq.kenr[626] = -274510803;
        jq.kenr[627] = -1146253175;
        jq.kenr[628] = 2078531607;
        jq.kenr[629] = -1334362835;
        jq.kenr[630] = 735736158;
        jq.kenr[631] = 1748689526;
        jq.kenr[632] = 197725261;
        jq.kenr[633] = 2116302998;
        jq.kenr[634] = 784326984;
        jq.kenr[635] = -1099196235;
        jq.kenr[636] = 2087388929;
        jq.kenr[637] = -1336215434;
        jq.kenr[638] = 1157007155;
        jq.kenr[639] = -683678187;
        jq.kenr[640] = 405939684;
        jq.kenr[641] = 374805646;
        jq.kenr[642] = 1959217774;
        jq.kenr[643] = 2002217268;
        jq.kenr[644] = -1785127589;
        jq.kenr[645] = 1032510708;
        jq.kenr[646] = -231650357;
        jq.kenr[647] = 610118948;
        jq.kenr[648] = -824052802;
        jq.kenr[649] = -1119502712;
        jq.kenr[650] = 1731413719;
        jq.kenr[651] = -1451720525;
        jq.kenr[652] = 1438651112;
        jq.kenr[653] = 549867436;
        jq.kenr[654] = 627494726;
        jq.kenr[655] = 1566424998;
        jq.kenr[656] = 1481864517;
        jq.kenr[657] = -2034872671;
        jq.kenr[658] = 2009039331;
        jq.kenr[659] = -711189980;
        jq.kenr[660] = -288646840;
        jq.kenr[661] = -338642834;
        jq.kenr[662] = -1001267811;
        jq.kenr[663] = 1290532347;
        jq.kenr[664] = -535231557;
        jq.kenr[665] = 1115849326;
        jq.kenr[666] = -1984917535;
        jq.kenr[667] = 520163015;
        jq.kenr[668] = 796316463;
        jq.kenr[669] = 1539144483;
        jq.kenr[670] = -978025591;
        jq.kenr[671] = -1088196536;
        jq.kenr[672] = 1792111441;
        jq.kenr[673] = 1823994748;
        jq.kenr[674] = 837185259;
        jq.kenr[675] = -2077521786;
        jq.kenr[676] = -1092903034;
        jq.kenr[677] = -238338700;
        jq.kenr[678] = -66671326;
        jq.kenr[679] = -1847165412;
        jq.kenr[680] = 2062767378;
        jq.kenr[681] = 726537956;
        jq.kenr[682] = -1852139393;
        jq.kenr[683] = -89846651;
        jq.kenr[684] = 1896635630;
        jq.kenr[685] = 1164414925;
        jq.kenr[686] = 2050277196;
        jq.kenr[687] = 1829275552;
        jq.kenr[688] = 82740126;
        jq.kenr[689] = -357954026;
        jq.kenr[690] = 2006949582;
        jq.kenr[691] = -1220096400;
        jq.kenr[692] = -1770930314;
        jq.kenr[693] = 34433251;
        jq.kenr[694] = 2070462154;
        jq.kenr[695] = -2091430556;
        jq.kenr[696] = -1941782850;
        jq.kenr[697] = 1457147655;
        jq.kenr[698] = -524001472;
        jq.kenr[699] = -1408739301;
    }

    private static /* synthetic */ void kikz() {
        jq.kenr[100] = 1825415932;
        jq.kenr[101] = -1932608764;
        jq.kenr[102] = -948508565;
        jq.kenr[103] = 2023239977;
        jq.kenr[104] = 1753245755;
        jq.kenr[105] = 736214372;
        jq.kenr[106] = 876697055;
        jq.kenr[107] = 56192871;
        jq.kenr[108] = -1725121618;
        jq.kenr[109] = 2091980531;
        jq.kenr[110] = -1407918476;
        jq.kenr[111] = -1819136323;
        jq.kenr[112] = -1068374176;
        jq.kenr[113] = -573425637;
        jq.kenr[114] = 1576562930;
        jq.kenr[115] = -1216878653;
        jq.kenr[116] = 2080340224;
        jq.kenr[117] = -440280823;
        jq.kenr[118] = 1146997725;
        jq.kenr[119] = 1587056930;
        jq.kenr[120] = 606261499;
        jq.kenr[121] = 27163043;
        jq.kenr[122] = 1057720061;
        jq.kenr[123] = 393611620;
        jq.kenr[124] = 246571856;
        jq.kenr[125] = 1169155058;
        jq.kenr[126] = 1770536602;
        jq.kenr[127] = 1813774461;
        jq.kenr[128] = 354638015;
        jq.kenr[129] = -1243300019;
        jq.kenr[130] = 2050149934;
        jq.kenr[131] = 2057947789;
        jq.kenr[132] = 1185389525;
        jq.kenr[133] = -413365731;
        jq.kenr[134] = -3793204;
        jq.kenr[135] = 1933575866;
        jq.kenr[136] = 599772794;
        jq.kenr[137] = 660860293;
        jq.kenr[138] = 1555187147;
        jq.kenr[139] = -136930695;
        jq.kenr[140] = -1167079880;
        jq.kenr[141] = -1211199483;
        jq.kenr[142] = 541179557;
        jq.kenr[143] = -2055595274;
        jq.kenr[144] = 870628220;
        jq.kenr[145] = 1480435933;
        jq.kenr[146] = 1842885853;
        jq.kenr[147] = 954466176;
        jq.kenr[148] = 910708637;
        jq.kenr[149] = 1409585806;
        jq.kenr[150] = 1313472198;
        jq.kenr[151] = -1745047470;
        jq.kenr[152] = 2057044916;
        jq.kenr[153] = 410552751;
        jq.kenr[154] = -1040548771;
        jq.kenr[155] = -1907994352;
        jq.kenr[156] = 595991106;
        jq.kenr[157] = -563655217;
        jq.kenr[158] = -2019751640;
        jq.kenr[159] = -518405439;
        jq.kenr[160] = -399651214;
        jq.kenr[161] = 622694994;
        jq.kenr[162] = 724665258;
        jq.kenr[163] = 71925437;
        jq.kenr[164] = 181704233;
        jq.kenr[165] = -1921143814;
        jq.kenr[166] = 1317608810;
        jq.kenr[167] = 496810020;
        jq.kenr[168] = 131749713;
        jq.kenr[169] = -1202812061;
        jq.kenr[170] = -300501685;
        jq.kenr[171] = -2091775473;
        jq.kenr[172] = -1892334329;
        jq.kenr[173] = -1707545871;
        jq.kenr[174] = 1876853428;
        jq.kenr[175] = -1099625350;
        jq.kenr[176] = 784159467;
        jq.kenr[177] = -493960695;
        jq.kenr[178] = 741811401;
        jq.kenr[179] = -1004877973;
        jq.kenr[180] = 1649336511;
        jq.kenr[181] = 998301853;
        jq.kenr[182] = -231009401;
        jq.kenr[183] = -2030056516;
        jq.kenr[184] = 2096975096;
        jq.kenr[185] = 174437075;
        jq.kenr[186] = -1764780956;
        jq.kenr[187] = 555658811;
        jq.kenr[188] = -44943190;
        jq.kenr[189] = -1280897341;
        jq.kenr[190] = 1495791429;
        jq.kenr[191] = 1644786246;
        jq.kenr[192] = 247430877;
        jq.kenr[193] = 1974949694;
        jq.kenr[194] = -2133636163;
        jq.kenr[195] = -1976109247;
        jq.kenr[196] = 1652486291;
        jq.kenr[197] = 113937830;
        jq.kenr[198] = -871624401;
        jq.kenr[199] = -1950239727;
    }

    private static /* synthetic */ void kinw() {
        jq.kens[1000] = 1472584783;
        jq.kens[1001] = 1857695411;
        jq.kens[1002] = -1156015730;
        jq.kens[1003] = 33163854;
        jq.kens[1004] = -929909847;
        jq.kens[1005] = 55396196;
        jq.kens[1006] = -1519811991;
        jq.kens[1007] = -1022109599;
        jq.kens[1008] = 92425793;
        jq.kens[1009] = 1607342825;
        jq.kens[1010] = 399525184;
        jq.kens[1011] = -1360526033;
        jq.kens[1012] = -966048980;
        jq.kens[1013] = 136332590;
        jq.kens[1014] = 739582654;
        jq.kens[1015] = 825767300;
        jq.kens[1016] = 1120945180;
        jq.kens[1017] = -2118392579;
        jq.kens[1018] = 1392080119;
        jq.kens[1019] = -1639675631;
        jq.kens[1020] = -311066364;
        jq.kens[1021] = 2097045723;
        jq.kens[1022] = -941492824;
        jq.kens[1023] = 740072798;
        jq.kens[1024] = -1250549247;
        jq.kens[1025] = -318626543;
        jq.kens[1026] = 518563010;
        jq.kens[1027] = 2131315711;
        jq.kens[1028] = 1075641208;
        jq.kens[1029] = -1544835320;
        jq.kens[1030] = 1397232425;
        jq.kens[1031] = 387422213;
        jq.kens[1032] = -581836677;
        jq.kens[1033] = 1235974618;
        jq.kens[1034] = -2098588232;
        jq.kens[1035] = -530547017;
        jq.kens[1036] = -107006096;
        jq.kens[1037] = 723099684;
        jq.kens[1038] = -134208376;
        jq.kens[1039] = -114253950;
        jq.kens[1040] = -1964395276;
        jq.kens[1041] = -1740028127;
        jq.kens[1042] = 1395386994;
        jq.kens[1043] = -605163731;
        jq.kens[1044] = -1842454276;
        jq.kens[1045] = -801167628;
        jq.kens[1046] = 1814218961;
        jq.kens[1047] = 1573448272;
        jq.kens[1048] = -617002435;
        jq.kens[1049] = -552090556;
        jq.kens[1050] = -1407233140;
        jq.kens[1051] = -232129786;
        jq.kens[1052] = -712406066;
        jq.kens[1053] = 1063202574;
        jq.kens[1054] = 1495271763;
        jq.kens[1055] = -459078175;
        jq.kens[1056] = -843216630;
        jq.kens[1057] = 2032491189;
        jq.kens[1058] = 589483048;
        jq.kens[1059] = 2067288606;
        jq.kens[1060] = 791446458;
        jq.kens[1061] = -1367907491;
        jq.kens[1062] = -1451172320;
        jq.kens[1063] = 1616068889;
        jq.kens[1064] = 1744892020;
        jq.kens[1065] = -426290054;
        jq.kens[1066] = 109536874;
        jq.kens[1067] = 837060867;
        jq.kens[1068] = -780587715;
        jq.kens[1069] = -1395571549;
        jq.kens[1070] = 1722073744;
        jq.kens[1071] = 2036524753;
        jq.kens[1072] = -1070956939;
        jq.kens[1073] = 107338412;
        jq.kens[1074] = 2000889853;
        jq.kens[1075] = -1448182921;
        jq.kens[1076] = -411273740;
        jq.kens[1077] = -101740558;
        jq.kens[1078] = 65886654;
        jq.kens[1079] = -1951381419;
        jq.kens[1080] = 911288431;
        jq.kens[1081] = -1826012168;
        jq.kens[1082] = 1591899788;
        jq.kens[1083] = -200245519;
        jq.kens[1084] = -1825516256;
        jq.kens[1085] = -44960462;
        jq.kens[1086] = 1896489737;
        jq.kens[1087] = -623536153;
        jq.kens[1088] = -1701452890;
        jq.kens[1089] = -1781353695;
        jq.kens[1090] = 1149932618;
        jq.kens[1091] = 1416193309;
        jq.kens[1092] = 341859369;
        jq.kens[1093] = -1517740641;
        jq.kens[1094] = 290864789;
        jq.kens[1095] = 1235260218;
        jq.kens[1096] = -62505535;
        jq.kens[1097] = 1114244475;
        jq.kens[1098] = -870372245;
        jq.kens[1099] = -1523298728;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onSwingDuration(dd var1_1) {
        block82: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = jq.sf - jq.kent("kfdm", keqe(int ), (int)89)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == jq.kent("kfdn", keoa(int ), (int)135)) break;
                v0 /* !! */  = (long)jq.kent("kfdo", keoa(int ), (int)136);
            }
            var5_2 = jq.c;
            v1 /* !! */  = jq.sf;
            if (true) ** GOTO lbl12
            block50: while (true) {
                v1 /* !! */  = (long)(v2 - jq.kent("kfdp", keqe(int ), (int)90));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -721405983: {
                        v2 = jq.kent("kfdq", keqe(int ), (int)91);
                        continue block50;
                    }
                    case 197898621: {
                        break block50;
                    }
                    case 541416511: {
                        v2 = jq.kent("kfdr", keqe(int ), (int)92);
                        continue block50;
                    }
                }
                break;
            }
            var4_3 /* !! */  = jq.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = jq.sf - jq.kent("kfds", keqe(int ), (int)93)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == jq.kent("kfdt", keoa(int ), (int)137)) break;
                v3 /* !! */  = (long)jq.kent("kfdv", keoa(int ), (int)138);
            }
            var3_4 = jq.a;
            if (var5_2) {
                throw null;
lbl31:
                // 10 sources

                return;
            }
            if (var3_4 || var3_4) ** GOTO lbl31
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = jq.sf - jq.kent("kfdw", keqe(int ), (int)94)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == jq.kent("kfdx", keoa(int ), (int)139)) break;
                v4 /* !! */  = (long)jq.kent("kfdy", keoa(int ), (int)140);
            }
            var2_5 = hn.getInstance();
            if (var3_4 || var3_4) ** GOTO lbl31
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_3 = jq.sf - jq.kent("kfdz", keqe(int ), (int)95)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == jq.kent("kfea", keoa(int ), (int)141)) break;
                v5 /* !! */  = (long)jq.kent("kfeb", keoa(int ), (int)142);
            }
            v6 /* !! */  = jq.sf;
            if (true) ** GOTO lbl52
            block55: while (true) {
                v6 /* !! */  = (long)(v7 - jq.kent("kfee", keqe(int ), (int)96));
lbl52:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case 197898621: {
                        break block55;
                    }
                    case 978309602: {
                        v7 = jq.kent("kfef", keqe(int ), (int)97);
                        continue block55;
                    }
                    case 2007199192: {
                        v7 = jq.kent("kfeg", keqe(int ), (int)98);
                        continue block55;
                    }
                }
                break;
            }
            if (!this.onlyAura.isValue()) break block82;
            if (var3_4) ** GOTO lbl31
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_4 = jq.sf - jq.kent("kfeh", keqe(int ), (int)99)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v8 /* !! */  == jq.kent("kfei", keoa(int ), (int)143)) break;
                v8 /* !! */  = (long)jq.kent("kfej", keoa(int ), (int)144);
            }
            if (!var2_5.isState()) ** GOTO lbl144
            if (var3_4) ** GOTO lbl31
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_5 = jq.sf - jq.kent("kfek", keqe(int ), (int)100)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v9 /* !! */  == jq.kent("kfel", keoa(int ), (int)145)) break;
                v9 /* !! */  = (long)jq.kent("kfem", keoa(int ), (int)146);
            }
            if (var2_5.getTarget() == null) ** GOTO lbl144
            if (var3_4) ** GOTO lbl31
        }
        if (var3_4) ** GOTO lbl31
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl31
                v10 /* !! */  = jq.sf;
                if (true) ** GOTO lbl89
                block58: while (true) {
                    v10 /* !! */  = (long)(v11 - jq.kent("kfen", keqe(int ), (int)101));
lbl89:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -2014671098: {
                            v11 = jq.kent("kfep", keqe(int ), (int)102);
                            continue block58;
                        }
                        case -1381723193: {
                            v11 = jq.kent("kfeq", keqe(int ), (int)103);
                            continue block58;
                        }
                        case -241075831: {
                            v11 = jq.kent("kfer", keqe(int ), (int)104);
                            continue block58;
                        }
                        case 197898621: {
                            break block58;
                        }
                    }
                    break;
                }
                v12 /* !! */  = jq.sf;
                if (true) ** GOTO lbl105
                block59: while (true) {
                    v12 /* !! */  = (long)(v13 - jq.kent("kfet", keqe(int ), (int)105));
lbl105:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -975846885: {
                            v13 = jq.kent("kfeu", keqe(int ), (int)106);
                            continue block59;
                        }
                        case 197898621: {
                            break block59;
                        }
                        case 1086178610: {
                            v13 = jq.kent("kfev", keqe(int ), (int)107);
                            continue block59;
                        }
                    }
                    break;
                }
                v14 = this.swingSpeedSetting.getValue();
                v15 /* !! */  = jq.sf;
                if (true) ** GOTO lbl119
                block60: while (true) {
                    v15 /* !! */  = (long)(jq.kent("kfex", keqe(int ), (int)109) - jq.kent("kfew", keqe(int ), (int)108));
lbl119:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case 197898621: {
                            break block60;
                        }
                        case 1462632322: {
                            continue block60;
                        }
                    }
                    break;
                }
                var1_1.setAnimation(v14);
                if (var3_4 || var3_4) ** GOTO lbl31
                v16 /* !! */  = jq.sf;
                if (true) ** GOTO lbl130
                block61: while (true) {
                    v16 /* !! */  = (long)(v17 - jq.kent("kfey", keqe(int ), (int)110));
lbl130:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1699412472: {
                            v17 = jq.kent("kfez", keqe(int ), (int)111);
                            continue block61;
                        }
                        case 197898621: {
                            break block61;
                        }
                        case 1085104237: {
                            v17 = jq.kent("kffb", keqe(int ), (int)112);
                            continue block61;
                        }
                        case 2112268619: {
                            v17 = jq.kent("kffc", keqe(int ), (int)113);
                            continue block61;
                        }
                    }
                    break;
                }
                var1_1.cancel();
                if (var3_4) ** GOTO lbl31
lbl144:
                // 3 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
lbl147:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)jq.kent("kffd", keoa(int ), (int)147);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl152:
            // 4 sources

            case 1: {
                var4_3 /* !! */  = (int)jq.kent("kffe", keoa(int ), (int)148);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl181
            }
            case 2: {
                var4_3 /* !! */  = (int)jq.kent("kfff", keoa(int ), (int)149);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl202
            }
            case 3: {
                var4_3 /* !! */  = (int)jq.kent("kffg", keoa(int ), (int)150);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl167:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)jq.kent("kffh", keoa(int ), (int)151);
                if (!var5_2) ** GOTO lbl152
                throw null;
            }
lbl171:
            // 2 sources

            case 5: {
                var4_3 /* !! */  = (int)jq.kent("kffi", keoa(int ), (int)152);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 6: {
                var4_3 /* !! */  = (int)jq.kent("kffj", keoa(int ), (int)153);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl181:
            // 3 sources

            case 7: {
                var4_3 /* !! */  = (int)jq.kent("kffk", keoa(int ), (int)154);
                if (!var5_2) ** GOTO lbl171
                throw null;
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)jq.kent("kffl", keoa(int ), (int)155);
                    if (!var5_2) break block10;
                    throw null;
                }
            }
            case 9: {
                var4_3 /* !! */  = (int)jq.kent("kffm", keoa(int ), (int)156);
                if (!var5_2) ** GOTO lbl181
                throw null;
            }
lbl194:
            // 2 sources

            case 10: {
                var4_3 /* !! */  = (int)jq.kent("kffn", keoa(int ), (int)157);
                if (!var5_2) ** GOTO lbl147
                throw null;
            }
lbl198:
            // 2 sources

            case 11: {
                var4_3 /* !! */  = (int)jq.kent("kffo", keoa(int ), (int)158);
                if (!var5_2) ** GOTO lbl194
                throw null;
            }
lbl202:
            // 3 sources

            case 12: {
                var4_3 /* !! */  = (int)jq.kent("kffp", keoa(int ), (int)159);
                if (!var5_2) ** GOTO lbl152
                throw null;
            }
            case 13: {
                var4_3 /* !! */  = (int)jq.kent("kffq", keoa(int ), (int)160);
                if (!var5_2) ** GOTO lbl152
                throw null;
            }
lbl210:
            // 3 sources

            case 14: {
                var4_3 /* !! */  = (int)jq.kent("kffr", keoa(int ), (int)161);
                if (!var5_2) ** GOTO lbl167
                throw null;
            }
            case 15: 
        }
        var4_3 /* !! */  = (int)jq.kent("kffs", keoa(int ), (int)162);
        ** while (!var5_2)
lbl217:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void genericHoldSwing(class_4587 var1_1, float var2_2, float var3_3, float var4_4) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jq.sf - jq.kent("khjx", keqe(int ), (int)183)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jq.kent("khjy", keoa(int ), (int)1113)) break;
            v0 /* !! */  = (long)jq.kent("khjz", keoa(int ), (int)1114);
        }
        var7_5 = jq.c;
        v1 /* !! */  = jq.sf;
        if (true) ** GOTO lbl11
        block48: while (true) {
            v1 /* !! */  = (long)(v2 - jq.kent("khka", keqe(int ), (int)184));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -923416354: {
                    v2 = jq.kent("khkb", keqe(int ), (int)185);
                    continue block48;
                }
                case -67283687: {
                    v2 = jq.kent("khkc", keqe(int ), (int)186);
                    continue block48;
                }
                case 197898621: {
                    break block48;
                }
            }
            break;
        }
        var6_6 /* !! */  = jq.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = jq.sf - jq.kent("khkd", keqe(int ), (int)187)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == jq.kent("khke", keoa(int ), (int)1115)) break;
            v3 /* !! */  = (long)jq.kent("khkf", keoa(int ), (int)1116);
        }
        var5_7 = jq.a;
        if (var7_5) {
            throw null;
lbl29:
            // 7 sources

            return;
        }
        if (var5_7 || var5_7) ** GOTO lbl29
        v4 = jq.kent("khkg", kenp(int ), (int)1117) * var2_2 * var3_3;
        v5 = jq.kent("khkh", kenp(int ), (int)1118) * var3_3;
        v6 = jq.kent("khki", kenp(int ), (int)1119) * var4_4;
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = jq.sf - jq.kent("khkj", keqe(int ), (int)188)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == jq.kent("khkk", keoa(int ), (int)1120)) break;
            v7 /* !! */  = (long)jq.kent("khkl", keoa(int ), (int)1121);
        }
        var1_1.method_46416((float)v4, (float)v5, (float)v6);
        if (var5_7 || var5_7) ** GOTO lbl29
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = jq.sf - jq.kent("khkm", keqe(int ), (int)189)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == jq.kent("khkn", keoa(int ), (int)1122)) break;
            v8 /* !! */  = (long)jq.kent("khko", keoa(int ), (int)1123);
        }
        v9 = jq.kent("khkp", kenp(int ), (int)1124) * var3_3;
        v10 /* !! */  = jq.sf;
        if (true) ** GOTO lbl52
        block53: while (true) {
            v10 /* !! */  = (long)(v11 - jq.kent("khkq", keqe(int ), (int)190));
lbl52:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1057721671: {
                    v11 = jq.kent("khkr", keqe(int ), (int)191);
                    continue block53;
                }
                case -375919936: {
                    v11 = jq.kent("khks", keqe(int ), (int)192);
                    continue block53;
                }
                case 197898621: {
                    break block53;
                }
                case 1453926261: {
                    v11 = jq.kent("khkt", keqe(int ), (int)193);
                    continue block53;
                }
            }
            break;
        }
        v12 = class_7833.field_40713.rotationDegrees((float)v9);
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_4 = jq.sf - jq.kent("khku", keqe(int ), (int)194)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == jq.kent("khkv", keoa(int ), (int)1125)) break;
            v13 /* !! */  = (long)jq.kent("khkw", keoa(int ), (int)1126);
        }
        var1_1.method_22907((Quaternionfc)v12);
        if (var5_7 || var5_7) ** GOTO lbl29
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_5 = jq.sf - jq.kent("khkx", keqe(int ), (int)195)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == jq.kent("khky", keoa(int ), (int)1127)) break;
            v14 /* !! */  = (long)jq.kent("khkz", keoa(int ), (int)1128);
        }
        v15 = jq.kent("khla", kenp(int ), (int)1129) * var3_3 * var2_2;
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_6 = jq.sf - jq.kent("khlb", keqe(int ), (int)196)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == jq.kent("khlc", keoa(int ), (int)1130)) break;
            v16 /* !! */  = (long)jq.kent("khld", keoa(int ), (int)1131);
        }
        v17 = class_7833.field_40718.rotationDegrees((float)v15);
        v18 /* !! */  = jq.sf;
        if (true) ** GOTO lbl88
        block57: while (true) {
            v18 /* !! */  = (long)(jq.kent("khlf", keqe(int ), (int)198) - jq.kent("khle", keqe(int ), (int)197));
lbl88:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case 197898621: {
                    break block57;
                }
                case 977552372: {
                    continue block57;
                }
            }
            break;
        }
        var1_1.method_22907((Quaternionfc)v17);
        if (var5_7) ** GOTO lbl29
        if (var6_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_7) ** GOTO lbl29
                v19 /* !! */  = jq.sf;
                if (true) ** GOTO lbl103
                block58: while (true) {
                    v19 /* !! */  = (long)(v20 - jq.kent("khlg", keqe(int ), (int)199));
lbl103:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -740049413: {
                            v20 = jq.kent("khlh", keqe(int ), (int)200);
                            continue block58;
                        }
                        case 139909813: {
                            v20 = jq.kent("khli", keqe(int ), (int)201);
                            continue block58;
                        }
                        case 197898621: {
                            break block58;
                        }
                        case 659812108: {
                            v20 = jq.kent("khlj", keqe(int ), (int)202);
                            continue block58;
                        }
                    }
                    break;
                }
                v21 = jq.kent("khlk", kenp(int ), (int)1132) * var4_4;
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_7 = jq.sf - jq.kent("khll", keqe(int ), (int)203)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == jq.kent("khlm", keoa(int ), (int)1133)) break;
                    v22 /* !! */  = (long)jq.kent("khln", keoa(int ), (int)1134);
                }
                v23 = class_7833.field_40713.rotationDegrees((float)v21);
                v24 /* !! */  = jq.sf;
                if (true) ** GOTO lbl126
                block60: while (true) {
                    v24 /* !! */  = (long)(jq.kent("khlp", keqe(int ), (int)205) - jq.kent("khlo", keqe(int ), (int)204));
lbl126:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case 197898621: {
                            break block60;
                        }
                        case 1320817551: {
                            continue block60;
                        }
                    }
                    break;
                }
                var1_1.method_22907((Quaternionfc)v23);
                if (var5_7 || var5_7) ** GOTO lbl29
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_8 = jq.sf - jq.kent("khlq", keqe(int ), (int)206)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == jq.kent("khlr", keoa(int ), (int)1135)) break;
                    v25 /* !! */  = (long)jq.kent("khls", keoa(int ), (int)1136);
                }
                v26 = jq.kent("khlt", kenp(int ), (int)1137) * var4_4 * var2_2;
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_9 = jq.sf - jq.kent("khlu", keqe(int ), (int)207)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == jq.kent("khlv", keoa(int ), (int)1138)) break;
                    v27 /* !! */  = (long)jq.kent("khlw", keoa(int ), (int)1139);
                }
                v28 = class_7833.field_40716.rotationDegrees((float)v26);
                v29 /* !! */  = jq.sf;
                if (true) ** GOTO lbl149
                block63: while (true) {
                    v29 /* !! */  = (long)(v30 - jq.kent("khlx", keqe(int ), (int)208));
lbl149:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -210699638: {
                            v30 = jq.kent("khly", keqe(int ), (int)209);
                            continue block63;
                        }
                        case 31195841: {
                            v30 = jq.kent("khlz", keqe(int ), (int)210);
                            continue block63;
                        }
                        case 197898621: {
                            break block63;
                        }
                        case 893258634: {
                            v30 = jq.kent("khma", keqe(int ), (int)211);
                            continue block63;
                        }
                    }
                    break;
                }
                var1_1.method_22907((Quaternionfc)v28);
                if (!var5_7 && !var5_7) ** break;
                ** continue;
                return;
            }
lbl165:
            // 2 sources

            case 0: {
                var6_6 /* !! */  = (int)jq.kent("khmb", keoa(int ), (int)1140);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl170:
            // 2 sources

            case 1: {
                var6_6 /* !! */  = (int)jq.kent("khmc", keoa(int ), (int)1141);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 2: {
                var6_6 /* !! */  = (int)jq.kent("khmd", keoa(int ), (int)1142);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl180:
            // 4 sources

            case 3: {
                var6_6 /* !! */  = (int)jq.kent("khme", keoa(int ), (int)1143);
                if (!var7_5) ** GOTO lbl170
                throw null;
            }
lbl184:
            // 2 sources

            case 4: {
                var6_6 /* !! */  = (int)jq.kent("khmf", keoa(int ), (int)1144);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl202
            }
            case 5: {
                var6_6 /* !! */  = (int)jq.kent("khmg", keoa(int ), (int)1145);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl194:
            // 2 sources

            case 6: {
                var6_6 /* !! */  = (int)jq.kent("khmh", keoa(int ), (int)1146);
                if (!var7_5) ** GOTO lbl180
                throw null;
            }
lbl198:
            // 3 sources

            case 7: {
                var6_6 /* !! */  = (int)jq.kent("khmi", keoa(int ), (int)1147);
                if (!var7_5) ** GOTO lbl180
                throw null;
            }
lbl202:
            // 3 sources

            case 8: {
                var6_6 /* !! */  = (int)jq.kent("khmj", keoa(int ), (int)1148);
                if (!var7_5) ** GOTO lbl194
                throw null;
            }
            case 9: {
                var6_6 /* !! */  = (int)jq.kent("khmk", keoa(int ), (int)1149);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 10: {
                var6_6 /* !! */  = (int)jq.kent("khml", keoa(int ), (int)1150);
                if (!var7_5) ** GOTO lbl198
                throw null;
            }
            case 11: {
                var6_6 /* !! */  = (int)jq.kent("khmm", keoa(int ), (int)1151);
                if (!var7_5) ** GOTO lbl198
                throw null;
            }
lbl219:
            // 3 sources

            case 12: {
                var6_6 /* !! */  = (int)jq.kent("khmn", keoa(int ), (int)1152);
                if (!var7_5) ** GOTO lbl165
                throw null;
            }
            case 13: 
        }
        do {
            var6_6 /* !! */  = (int)jq.kent("khmo", keoa(int ), (int)1153);
        } while (!var7_5);
        throw null;
    }

    private static /* synthetic */ void kire() {
        jq.keqg[100] = -5358236957141562569L;
        jq.keqg[101] = 1783141650917111543L;
        jq.keqg[102] = 1049339598364758973L;
        jq.keqg[103] = 3059838375479250886L;
        jq.keqg[104] = -152751256747503835L;
        jq.keqg[105] = 1672641023580550933L;
        jq.keqg[106] = -2614816087601062877L;
        jq.keqg[107] = 3330040727467985050L;
        jq.keqg[108] = 393360515632850486L;
        jq.keqg[109] = 4723453378033865774L;
        jq.keqg[110] = 3457564535816911630L;
        jq.keqg[111] = -3566693964468465160L;
        jq.keqg[112] = 2500057169523479886L;
        jq.keqg[113] = -2095536145842293557L;
        jq.keqg[114] = 3191387156520680670L;
        jq.keqg[115] = -4637944028009258651L;
        jq.keqg[116] = -6924894051626009898L;
        jq.keqg[117] = 4712526311008934149L;
        jq.keqg[118] = -3936171701485435147L;
        jq.keqg[119] = 1701920570458455177L;
        jq.keqg[120] = -270342763773135738L;
        jq.keqg[121] = -6913527217888635574L;
        jq.keqg[122] = 6095847772751224898L;
        jq.keqg[123] = -5404984727577825400L;
        jq.keqg[124] = 2566001702915581317L;
        jq.keqg[125] = 3230578478742150380L;
        jq.keqg[126] = -5289001567683783211L;
        jq.keqg[127] = 5136857653117070476L;
        jq.keqg[128] = -3952768643025756522L;
        jq.keqg[129] = 7612811978621268061L;
        jq.keqg[130] = -6958875535389231547L;
        jq.keqg[131] = -656878772418610968L;
        jq.keqg[132] = -243486130284691747L;
        jq.keqg[133] = 5674932490481598292L;
        jq.keqg[134] = 8687261375982513251L;
        jq.keqg[135] = -4255569418859076916L;
        jq.keqg[136] = -1663393339145477844L;
        jq.keqg[137] = -2901970747536843683L;
        jq.keqg[138] = -8280503140026063124L;
        jq.keqg[139] = 4058686469734078096L;
        jq.keqg[140] = 4562190083703939837L;
        jq.keqg[141] = -8887722722030694887L;
        jq.keqg[142] = 1464461033146244223L;
        jq.keqg[143] = 8344109460099406871L;
        jq.keqg[144] = -6153867926024039775L;
        jq.keqg[145] = 7469282712220810015L;
        jq.keqg[146] = 8990225973454201987L;
        jq.keqg[147] = 6173636261799002380L;
        jq.keqg[148] = -1497785869582674640L;
        jq.keqg[149] = -1348526131949877741L;
        jq.keqg[150] = -8821245169575830836L;
        jq.keqg[151] = -6242419366007101165L;
        jq.keqg[152] = -7346422115591590647L;
        jq.keqg[153] = 7105269744037971249L;
        jq.keqg[154] = -5576941083236792609L;
        jq.keqg[155] = 6686261461165100924L;
        jq.keqg[156] = -8482921544622588723L;
        jq.keqg[157] = -4653450384105480584L;
        jq.keqg[158] = -4158864667160830070L;
        jq.keqg[159] = 4573120905264172876L;
        jq.keqg[160] = 5411941303104277962L;
        jq.keqg[161] = -1008694755031246844L;
        jq.keqg[162] = 1875229606389222479L;
        jq.keqg[163] = -7405932968531823111L;
        jq.keqg[164] = 5815541453982882425L;
        jq.keqg[165] = -2191408964769820035L;
        jq.keqg[166] = -5664274482551671388L;
        jq.keqg[167] = 6827550938576255388L;
        jq.keqg[168] = -3296092628109886892L;
        jq.keqg[169] = 3369286918557560902L;
        jq.keqg[170] = -8299235893372177769L;
        jq.keqg[171] = 8738601484944427970L;
        jq.keqg[172] = -7354098413289418535L;
        jq.keqg[173] = -5644293933339496766L;
        jq.keqg[174] = 5856561833321258166L;
        jq.keqg[175] = -358762657083471694L;
        jq.keqg[176] = 507210920114124979L;
        jq.keqg[177] = 6011642268515197799L;
        jq.keqg[178] = -6880485994253996637L;
        jq.keqg[179] = -551890039784474739L;
        jq.keqg[180] = -8120211681370628677L;
        jq.keqg[181] = -5804846530544343724L;
        jq.keqg[182] = -7608904915159502846L;
        jq.keqg[183] = -3486853734338969409L;
        jq.keqg[184] = -8816453012619326956L;
        jq.keqg[185] = -2431419231945900452L;
        jq.keqg[186] = -6163118657617071887L;
        jq.keqg[187] = 1871246894204211659L;
        jq.keqg[188] = -4690485255914674210L;
        jq.keqg[189] = 4298628086189664412L;
        jq.keqg[190] = -5503900612004702855L;
        jq.keqg[191] = -6404517552696911546L;
        jq.keqg[192] = 5705188444256886565L;
        jq.keqg[193] = 9160036080420067566L;
        jq.keqg[194] = -5747035916102461566L;
        jq.keqg[195] = -7745255561160783436L;
        jq.keqg[196] = 1082928417402972552L;
        jq.keqg[197] = -9169528433907406269L;
        jq.keqg[198] = 536684244045537983L;
        jq.keqg[199] = 3584727953468301989L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isLantern(class_1799 var1_1) {
        block46: {
            v0 /* !! */  = jq.sf;
            if (true) ** GOTO lbl5
            block23: while (true) {
                v0 /* !! */  = (long)(v1 - jq.kent("khvi", keqe(int ), (int)300));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -32706784: {
                        v1 = jq.kent("khvj", keqe(int ), (int)301);
                        continue block23;
                    }
                    case 197898621: {
                        break block23;
                    }
                    case 1094916761: {
                        v1 = jq.kent("khvk", keqe(int ), (int)302);
                        continue block23;
                    }
                }
                break;
            }
            var4_2 = jq.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = jq.sf - jq.kent("khvl", keqe(int ), (int)303)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == jq.kent("khvm", keoa(int ), (int)1293)) break;
                v2 /* !! */  = (long)jq.kent("khvn", keoa(int ), (int)1294);
            }
            var3_3 /* !! */  = jq.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = jq.sf - jq.kent("khvo", keqe(int ), (int)304)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == jq.kent("khvp", keoa(int ), (int)1295)) break;
                v3 /* !! */  = (long)jq.kent("khvq", keoa(int ), (int)1296);
            }
            var2_4 = jq.a;
            if (var4_2) {
                throw null;
lbl31:
                // 5 sources

                return (boolean)jq.kent("khvr", keoa(int ), (int)1297);
            }
            if (var2_4 || var2_4) ** GOTO lbl31
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = jq.sf - jq.kent("khvs", keqe(int ), (int)305)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == jq.kent("khvt", keoa(int ), (int)1298)) break;
                v4 /* !! */  = (long)jq.kent("khvu", keoa(int ), (int)1299);
            }
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_3 = jq.sf - jq.kent("khvv", keqe(int ), (int)306)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == jq.kent("khvw", keoa(int ), (int)1300)) break;
                v5 /* !! */  = (long)jq.kent("khvx", keoa(int ), (int)1301);
            }
            if (var1_1.method_31574(class_1802.field_16539)) break block46;
            if (var2_4) ** GOTO lbl31
            v6 /* !! */  = jq.sf;
            if (true) ** GOTO lbl52
            block29: while (true) {
                v6 /* !! */  = (long)(v7 - jq.kent("khvy", keqe(int ), (int)307));
lbl52:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -883487371: {
                        v7 = jq.kent("khvz", keqe(int ), (int)308);
                        continue block29;
                    }
                    case -563877695: {
                        v7 = jq.kent("khwa", keqe(int ), (int)309);
                        continue block29;
                    }
                    case 197898621: {
                        break block29;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_4 = jq.sf - jq.kent("khwb", keqe(int ), (int)310)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v8 /* !! */  == jq.kent("khwc", keoa(int ), (int)1302)) break;
                v8 /* !! */  = (long)jq.kent("khwd", keoa(int ), (int)1303);
            }
            if (!var1_1.method_31574(class_1802.field_22016)) ** GOTO lbl78
            if (var2_4) ** GOTO lbl31
        }
        if (var2_4 || var2_4) ** GOTO lbl31
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v9 = jq.kent("khwe", keoa(int ), (int)1304);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl81
            }
lbl78:
            // 1 sources

            if (!var2_4 && !var2_4) ** break;
            ** continue;
            v9 = jq.kent("khwf", keoa(int ), (int)1305);
lbl81:
            // 2 sources

            return (boolean)v9;
lbl82:
            // 4 sources

            case 0: {
                var3_3 /* !! */  = (int)jq.kent("khwg", keoa(int ), (int)1306);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl87:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)jq.kent("khwh", keoa(int ), (int)1307);
                if (!var4_2) ** GOTO lbl82
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)jq.kent("khwi", keoa(int ), (int)1308);
                if (!var4_2) ** GOTO lbl87
                throw null;
            }
lbl95:
            // 3 sources

            case 3: {
                var3_3 /* !! */  = (int)jq.kent("khwj", keoa(int ), (int)1309);
                if (!var4_2) ** GOTO lbl82
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)jq.kent("khwk", keoa(int ), (int)1310);
                if (var4_2) {
                    throw null;
                }
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)jq.kent("khwl", keoa(int ), (int)1311);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl113
                    break;
                }
            }
            case 6: {
                var3_3 /* !! */  = (int)jq.kent("khwm", keoa(int ), (int)1312);
                if (!var4_2) ** GOTO lbl82
                throw null;
            }
lbl113:
            // 3 sources

            case 7: {
                var3_3 /* !! */  = (int)jq.kent("khwn", keoa(int ), (int)1313);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl122
            }
            case 8: {
                var3_3 /* !! */  = (int)jq.kent("khwo", keoa(int ), (int)1314);
                if (!var4_2) ** GOTO lbl95
                throw null;
            }
lbl122:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)jq.kent("khwp", keoa(int ), (int)1315);
                if (!var4_2) ** GOTO lbl95
                throw null;
            }
            case 10: 
        }
        var3_3 /* !! */  = (int)jq.kent("khwq", keoa(int ), (int)1316);
        ** while (!var4_2)
lbl129:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isHoldMyItems() {
        v0 /* !! */  = jq.sf;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - jq.kent("kerh", keqe(int ), (int)10));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -976945265: {
                    v1 = jq.kent("keri", keqe(int ), (int)11);
                    continue block23;
                }
                case -255171506: {
                    v1 = jq.kent("kerj", keqe(int ), (int)12);
                    continue block23;
                }
                case 197898621: {
                    break block23;
                }
                case 612241646: {
                    v1 = jq.kent("kerk", keqe(int ), (int)13);
                    continue block23;
                }
            }
            break;
        }
        var3_1 = jq.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = jq.sf - jq.kent("kern", keqe(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jq.kent("kerp", keoa(int ), (int)35)) break;
            v2 /* !! */  = (long)jq.kent("kerr", keoa(int ), (int)36);
        }
        var2_2 /* !! */  = jq.b;
        v3 /* !! */  = jq.sf;
        if (true) ** GOTO lbl29
        block25: while (true) {
            v3 /* !! */  = (long)(v4 - jq.kent("kert", keqe(int ), (int)15));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1677318051: {
                    v4 = jq.kent("kerv", keqe(int ), (int)16);
                    continue block25;
                }
                case -1282899407: {
                    v4 = jq.kent("kerx", keqe(int ), (int)17);
                    continue block25;
                }
                case 197898621: {
                    break block25;
                }
                case 2000039145: {
                    v4 = jq.kent("kerz", keqe(int ), (int)18);
                    continue block25;
                }
            }
            break;
        }
        var1_3 = jq.a;
        if (var3_1) {
            throw null;
lbl44:
            // 1 sources

            return (boolean)jq.kent("kesa", keoa(int ), (int)37);
        }
        ** while (var1_3 || var1_3)
lbl47:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block12 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = jq.sf;
                if (true) ** GOTO lbl54
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - jq.kent("kesd", keqe(int ), (int)19));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1816224691: {
                            v6 = jq.kent("kesf", keqe(int ), (int)20);
                            continue block27;
                        }
                        case 197898621: {
                            break block27;
                        }
                        case 738988244: {
                            v6 = jq.kent("kesh", keqe(int ), (int)21);
                            continue block27;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = jq.sf - jq.kent("kesj", keqe(int ), (int)22)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == jq.kent("kesl", keoa(int ), (int)38)) break;
                    v7 /* !! */  = (long)jq.kent("kesn", keoa(int ), (int)39);
                }
                return this.swingType.isSelected("HoldMyItems");
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jq.kent("keso", keoa(int ), (int)40);
                    if (!var3_1) break block12;
                    throw null;
                }
            }
lbl75:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)jq.kent("kesp", keoa(int ), (int)41);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)jq.kent("kesr", keoa(int ), (int)42);
                if (!var3_1) ** GOTO lbl75
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)jq.kent("kest", keoa(int ), (int)43);
        ** while (!var3_1)
lbl86:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kinz() {
        jq.kens[1100] = 378033944;
        jq.kens[1101] = 173343304;
        jq.kens[1102] = -1032175160;
        jq.kens[1103] = 2011495927;
        jq.kens[1104] = 1686734157;
        jq.kens[1105] = 1546326386;
        jq.kens[1106] = 987557800;
        jq.kens[1107] = -59225035;
        jq.kens[1108] = -832537317;
        jq.kens[1109] = 717722257;
        jq.kens[1110] = 1891900365;
        jq.kens[1111] = -1993085893;
        jq.kens[1112] = -849706438;
        jq.kens[1113] = 815387642;
        jq.kens[1114] = 1105703172;
        jq.kens[1115] = 394287669;
        jq.kens[1116] = -753558320;
        jq.kens[1117] = -1174035185;
        jq.kens[1118] = 49569259;
        jq.kens[1119] = -91920442;
        jq.kens[1120] = -811197688;
        jq.kens[1121] = 2134932092;
        jq.kens[1122] = -625768445;
        jq.kens[1123] = 1706310491;
        jq.kens[1124] = -381372611;
        jq.kens[1125] = 1430330099;
        jq.kens[1126] = 1050331579;
        jq.kens[1127] = -171640850;
        jq.kens[1128] = -2119411227;
        jq.kens[1129] = 800642650;
        jq.kens[1130] = -997317351;
        jq.kens[1131] = 518062401;
        jq.kens[1132] = -1501363688;
        jq.kens[1133] = 869383242;
        jq.kens[1134] = 1733307065;
        jq.kens[1135] = 2068671384;
        jq.kens[1136] = 1723374135;
        jq.kens[1137] = -943510497;
        jq.kens[1138] = 1184201929;
        jq.kens[1139] = -1878069250;
        jq.kens[1140] = -2023164065;
        jq.kens[1141] = -361526526;
        jq.kens[1142] = 1672408875;
        jq.kens[1143] = -645919688;
        jq.kens[1144] = -1364283070;
        jq.kens[1145] = -312821068;
        jq.kens[1146] = 904538621;
        jq.kens[1147] = 1305073728;
        jq.kens[1148] = 1822016406;
        jq.kens[1149] = 1249928642;
        jq.kens[1150] = -1395936131;
        jq.kens[1151] = 1228309805;
        jq.kens[1152] = -1939430820;
        jq.kens[1153] = 57195864;
        jq.kens[1154] = 584406013;
        jq.kens[1155] = -1217033159;
        jq.kens[1156] = 907264981;
        jq.kens[1157] = 847114486;
        jq.kens[1158] = 737043172;
        jq.kens[1159] = -643567761;
        jq.kens[1160] = -138545884;
        jq.kens[1161] = 510735662;
        jq.kens[1162] = 197630889;
        jq.kens[1163] = 83491964;
        jq.kens[1164] = 1633828903;
        jq.kens[1165] = -305852909;
        jq.kens[1166] = 766723245;
        jq.kens[1167] = 600291067;
        jq.kens[1168] = -1929354430;
        jq.kens[1169] = 841351889;
        jq.kens[1170] = 1576835123;
        jq.kens[1171] = -1935832720;
        jq.kens[1172] = 265771262;
        jq.kens[1173] = 1887981499;
        jq.kens[1174] = -430231558;
        jq.kens[1175] = 517928091;
        jq.kens[1176] = -1062456021;
        jq.kens[1177] = -993337752;
        jq.kens[1178] = 1102612776;
        jq.kens[1179] = 821890725;
        jq.kens[1180] = -1404830359;
        jq.kens[1181] = 1646881548;
        jq.kens[1182] = -861629377;
        jq.kens[1183] = -2074133256;
        jq.kens[1184] = 593682567;
        jq.kens[1185] = 1242651778;
        jq.kens[1186] = -85781429;
        jq.kens[1187] = 621463082;
        jq.kens[1188] = 1985426615;
        jq.kens[1189] = -1737320985;
        jq.kens[1190] = -364124135;
        jq.kens[1191] = 846596016;
        jq.kens[1192] = 806317071;
        jq.kens[1193] = -1698405697;
        jq.kens[1194] = 1721688154;
        jq.kens[1195] = -1827518927;
        jq.kens[1196] = -1984777198;
        jq.kens[1197] = 579872332;
        jq.kens[1198] = -611767190;
        jq.kens[1199] = -1667757366;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void updateHoldPhysics(class_1268 var1_1, float var2_2) {
        v0 /* !! */  = jq.sf;
        if (true) ** GOTO lbl5
        block79: while (true) {
            v0 /* !! */  = (long)(v1 - jq.kent("kgpv", keqe(int ), (int)132));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 197898621: {
                    break block79;
                }
                case 1145153045: {
                    v1 = jq.kent("kgpw", keqe(int ), (int)133);
                    continue block79;
                }
                case 2101629927: {
                    v1 = jq.kent("kgpx", keqe(int ), (int)134);
                    continue block79;
                }
            }
            break;
        }
        var9_3 = jq.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = jq.sf - jq.kent("kgpy", keqe(int ), (int)135)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jq.kent("kgpz", keoa(int ), (int)782)) break;
            v2 /* !! */  = (long)jq.kent("kgqa", keoa(int ), (int)783);
        }
        var8_4 /* !! */  = jq.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = jq.sf - jq.kent("kgqb", keqe(int ), (int)136)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == jq.kent("kgqc", keoa(int ), (int)784)) break;
            v3 /* !! */  = (long)jq.kent("kgqd", keoa(int ), (int)785);
        }
        var7_5 = jq.a;
        if (var9_3) {
            throw null;
lbl29:
            // 15 sources

            return;
        }
        if (var7_5 || var7_5) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = jq.sf - jq.kent("kgqe", keqe(int ), (int)137)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == jq.kent("kgqf", keoa(int ), (int)786)) break;
            v4 /* !! */  = (long)jq.kent("kgqg", keoa(int ), (int)787);
        }
        var3_6 = System.nanoTime();
        if (var7_5 || var7_5) ** GOTO lbl29
        v5 /* !! */  = jq.sf;
        if (true) ** GOTO lbl43
        block84: while (true) {
            v5 /* !! */  = (long)(v6 - jq.kent("kgqh", keqe(int ), (int)138));
lbl43:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1942242831: {
                    v6 = jq.kent("kgqi", keqe(int ), (int)139);
                    continue block84;
                }
                case 197898621: {
                    break block84;
                }
                case 1843285387: {
                    v6 = jq.kent("kgqj", keqe(int ), (int)140);
                    continue block84;
                }
            }
            break;
        }
        var5_7 = var3_6 - this.holdPreviousFrameNanos;
        if (var8_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_5 || var7_5) ** GOTO lbl29
                if (var5_7 <= jq.kent("kgqm", keqe(int ), (int)141)) ** GOTO lbl156
                if (var7_5 || var7_5) ** GOTO lbl29
                v7 = jq.kent("kgqo", kffx(int ), (int)142);
                v8 = (double)var5_7 / jq.kent("kgqq", kffx(int ), (int)143);
                v9 /* !! */  = jq.sf;
                if (true) ** GOTO lbl65
                block85: while (true) {
                    v9 /* !! */  = (long)(v10 - jq.kent("kgqr", keqe(int ), (int)144));
lbl65:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1272340574: {
                            v10 = jq.kent("kgqt", keqe(int ), (int)145);
                            continue block85;
                        }
                        case -936023695: {
                            v10 = jq.kent("kgqv", keqe(int ), (int)146);
                            continue block85;
                        }
                        case 197898621: {
                            break block85;
                        }
                    }
                    break;
                }
                v11 = Math.max(0.0, v8);
                v12 /* !! */  = jq.sf;
                if (true) ** GOTO lbl79
                block86: while (true) {
                    v12 /* !! */  = (long)(v13 - jq.kent("kgqx", keqe(int ), (int)147));
lbl79:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -420671217: {
                            v13 = jq.kent("kgqz", keqe(int ), (int)148);
                            continue block86;
                        }
                        case 197898621: {
                            break block86;
                        }
                        case 1010690341: {
                            v13 = jq.kent("kgra", keqe(int ), (int)149);
                            continue block86;
                        }
                    }
                    break;
                }
                v14 = Math.min((double)v7, v11);
                v15 /* !! */  = jq.sf;
                if (true) ** GOTO lbl93
                block87: while (true) {
                    v15 /* !! */  = (long)(v16 - jq.kent("kgrd", keqe(int ), (int)150));
lbl93:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -302430255: {
                            v16 = jq.kent("kgre", keqe(int ), (int)151);
                            continue block87;
                        }
                        case 197898621: {
                            break block87;
                        }
                        case 1299456987: {
                            v16 = jq.kent("kgrg", keqe(int ), (int)152);
                            continue block87;
                        }
                        case 1882048429: {
                            v16 = jq.kent("kgrh", keqe(int ), (int)153);
                            continue block87;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_3 = jq.sf - jq.kent("kgrk", keqe(int ), (int)154)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == jq.kent("kgrm", keoa(int ), (int)788)) break;
                    v17 /* !! */  = (long)jq.kent("kgrn", keoa(int ), (int)789);
                }
                v18 = v14 * (double)this.holdSmoothness.getValue() / jq.kent("kgrp", kffx(int ), (int)155);
                v19 /* !! */  = jq.sf;
                if (true) ** GOTO lbl115
                block89: while (true) {
                    v19 /* !! */  = (long)(v20 - jq.kent("kgrr", keqe(int ), (int)156));
lbl115:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -258664224: {
                            v20 = jq.kent("kgrt", keqe(int ), (int)157);
                            continue block89;
                        }
                        case 197898621: {
                            break block89;
                        }
                        case 1667631867: {
                            v20 = jq.kent("kgrv", keqe(int ), (int)158);
                            continue block89;
                        }
                        case 2016613242: {
                            v20 = jq.kent("kgrx", keqe(int ), (int)159);
                            continue block89;
                        }
                    }
                    break;
                }
                this.holdDeltaTime = v18;
                if (var7_5 || var7_5) ** GOTO lbl29
                v21 /* !! */  = jq.sf;
                if (true) ** GOTO lbl133
                block90: while (true) {
                    v21 /* !! */  = (long)(jq.kent("kgsc", keqe(int ), (int)161) - jq.kent("kgsa", keqe(int ), (int)160));
lbl133:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case 197898621: {
                            break block90;
                        }
                        case 549281599: {
                            continue block90;
                        }
                    }
                    break;
                }
                this.holdPreviousFrameNanos = var3_6;
                if (var7_5 || var7_5) ** GOTO lbl29
                v22 = jq.kent("kgse", keoa(int ), (int)790);
                v23 /* !! */  = jq.sf;
                if (true) ** GOTO lbl145
                block91: while (true) {
                    v23 /* !! */  = (long)(v24 - jq.kent("kgsf", keqe(int ), (int)162));
lbl145:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1301577558: {
                            v24 = jq.kent("kgsg", keqe(int ), (int)163);
                            continue block91;
                        }
                        case 197898621: {
                            break block91;
                        }
                        case 1956669895: {
                            v24 = jq.kent("kgsj", keqe(int ), (int)164);
                            continue block91;
                        }
                    }
                    break;
                }
                this.holdPhysicsUpdated = v22;
                if (var7_5) ** GOTO lbl29
lbl156:
                // 2 sources

                if (var7_5 || var7_5) ** GOTO lbl29
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_4 = jq.sf - jq.kent("kgsn", keqe(int ), (int)165)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == jq.kent("kgsp", keoa(int ), (int)791)) break;
                    v25 /* !! */  = (long)jq.kent("kgsr", keoa(int ), (int)792);
                }
                if (var1_1 != class_1268.field_5808) ** GOTO lbl211
                if (var7_5 || var7_5) ** GOTO lbl29
                if (!(var2_2 > 0.0f)) ** GOTO lbl203
                if (var7_5) ** GOTO lbl29
                v26 /* !! */  = jq.sf;
                if (true) ** GOTO lbl170
                block93: while (true) {
                    v26 /* !! */  = (long)(jq.kent("kgsx", keqe(int ), (int)167) - jq.kent("kgsv", keqe(int ), (int)166));
lbl170:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case 197898621: {
                            break block93;
                        }
                        case 1480762617: {
                            continue block93;
                        }
                    }
                    break;
                }
                if (this.holdPreviousSwing != 0.0f) ** GOTO lbl203
                if (var7_5) ** GOTO lbl29
                v27 /* !! */  = jq.sf;
                if (true) ** GOTO lbl181
                block94: while (true) {
                    v27 /* !! */  = (long)(v28 - jq.kent("kgtb", keqe(int ), (int)168));
lbl181:
                    // 2 sources

                    switch ((int)v27 /* !! */ ) {
                        case -110545133: {
                            v28 = jq.kent("kgtd", keqe(int ), (int)169);
                            continue block94;
                        }
                        case 197898621: {
                            break block94;
                        }
                        case 1255257191: {
                            v28 = jq.kent("kgtg", keqe(int ), (int)170);
                            continue block94;
                        }
                    }
                    break;
                }
                if (!this.holdAlternateSwing) {
                    v29 = jq.kent("kgti", keoa(int ), (int)793);
                    if (var9_3) {
                        throw null;
                    }
                } else {
                    v29 = jq.kent("kgtk", keoa(int ), (int)794);
                }
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_5 = jq.sf - jq.kent("kgtn", keqe(int ), (int)171)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == jq.kent("kgto", keoa(int ), (int)795)) break;
                    v30 /* !! */  = (long)jq.kent("kgtq", keoa(int ), (int)796);
                }
                this.holdAlternateSwing = v29;
                if (var7_5) ** GOTO lbl29
lbl203:
                // 3 sources

                if (var7_5 || var7_5) ** GOTO lbl29
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_6 = jq.sf - jq.kent("kgtu", keqe(int ), (int)172)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == jq.kent("kgtw", keoa(int ), (int)797)) break;
                    v31 /* !! */  = (long)jq.kent("kgtx", keoa(int ), (int)798);
                }
                this.holdPreviousSwing = var2_2;
                if (var7_5) ** GOTO lbl29
lbl211:
                // 2 sources

                if (!var7_5 && !var7_5) ** break;
                ** continue;
                return;
            }
            case 0: {
                var8_4 /* !! */  = (int)jq.kent("kgty", keoa(int ), (int)799);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl219:
            // 4 sources

            case 1: {
                var8_4 /* !! */  = (int)jq.kent("kgtz", keoa(int ), (int)800);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl273
            }
lbl224:
            // 2 sources

            case 2: {
                var8_4 /* !! */  = (int)jq.kent("kgua", keoa(int ), (int)801);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl229:
            // 3 sources

            case 3: {
                var8_4 /* !! */  = (int)jq.kent("kguc", keoa(int ), (int)802);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl291
            }
lbl234:
            // 2 sources

            case 4: {
                var8_4 /* !! */  = (int)jq.kent("kguf", keoa(int ), (int)803);
                if (var9_3) {
                    throw null;
                }
            }
lbl238:
            // 5 sources

            case 5: {
                var8_4 /* !! */  = (int)jq.kent("kgui", keoa(int ), (int)804);
                if (!var9_3) ** GOTO lbl234
                throw null;
            }
lbl242:
            // 2 sources

            case 6: {
                var8_4 /* !! */  = (int)jq.kent("kgul", keoa(int ), (int)805);
                if (!var9_3) ** GOTO lbl238
                throw null;
            }
            case 7: {
                var8_4 /* !! */  = (int)jq.kent("kguo", keoa(int ), (int)806);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl287
            }
            case 8: {
                var8_4 /* !! */  = (int)jq.kent("kgur", keoa(int ), (int)807);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl295
            }
lbl256:
            // 2 sources

            case 9: {
                var8_4 /* !! */  = (int)jq.kent("kgut", keoa(int ), (int)808);
                if (!var9_3) ** GOTO lbl229
                throw null;
            }
            case 10: {
                var8_4 /* !! */  = (int)jq.kent("kguw", keoa(int ), (int)809);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl269
            }
lbl265:
            // 3 sources

            case 11: {
                var8_4 /* !! */  = (int)jq.kent("kguz", keoa(int ), (int)810);
                if (!var9_3) ** GOTO lbl229
                throw null;
            }
lbl269:
            // 2 sources

            case 12: {
                var8_4 /* !! */  = (int)jq.kent("kgvc", keoa(int ), (int)811);
                if (!var9_3) ** GOTO lbl224
                throw null;
            }
lbl273:
            // 4 sources

            case 13: {
                do {
                    var8_4 /* !! */  = (int)jq.kent("kgve", keoa(int ), (int)812);
                } while (!var9_3);
                throw null;
            }
            case 14: {
                var8_4 /* !! */  = (int)jq.kent("kgvh", keoa(int ), (int)813);
                if (!var9_3) ** GOTO lbl219
                throw null;
            }
lbl282:
            // 2 sources

            case 15: {
                var8_4 /* !! */  = (int)jq.kent("kgvk", keoa(int ), (int)814);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl303
            }
lbl287:
            // 2 sources

            case 16: {
                var8_4 /* !! */  = (int)jq.kent("kgvm", keoa(int ), (int)815);
                if (!var9_3) ** GOTO lbl256
                throw null;
            }
lbl291:
            // 2 sources

            case 17: {
                var8_4 /* !! */  = (int)jq.kent("kgvp", keoa(int ), (int)816);
                if (!var9_3) ** GOTO lbl242
                throw null;
            }
lbl295:
            // 2 sources

            case 18: {
                var8_4 /* !! */  = (int)jq.kent("kgvr", keoa(int ), (int)817);
                if (!var9_3) ** GOTO lbl273
                throw null;
            }
lbl299:
            // 2 sources

            case 19: {
                var8_4 /* !! */  = (int)jq.kent("kgvu", keoa(int ), (int)818);
                if (!var9_3) ** GOTO lbl282
                throw null;
            }
lbl303:
            // 2 sources

            case 20: {
                var8_4 /* !! */  = (int)jq.kent("kgvy", keoa(int ), (int)819);
                if (!var9_3) ** GOTO lbl299
                throw null;
            }
            case 21: {
                var8_4 /* !! */  = (int)jq.kent("kgwb", keoa(int ), (int)820);
                if (!var9_3) ** GOTO lbl273
                throw null;
            }
            case 22: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_4 /* !! */  = (int)jq.kent("kgwe", keoa(int ), (int)821);
                    if (!var9_3) ** GOTO lbl219
                    throw null;
                }
            }
            case 23: {
                var8_4 /* !! */  = (int)jq.kent("kgwg", keoa(int ), (int)822);
                if (!var9_3) ** GOTO lbl219
                throw null;
            }
            case 24: {
                var8_4 /* !! */  = (int)jq.kent("kgwi", keoa(int ), (int)823);
                if (!var9_3) ** GOTO lbl238
                throw null;
            }
            case 25: {
                do {
                    var8_4 /* !! */  = (int)jq.kent("kgwk", keoa(int ), (int)824);
                } while (!var9_3);
                throw null;
            }
            case 26: 
        }
        var8_4 /* !! */  = (int)jq.kent("kgwm", keoa(int ), (int)825);
        ** while (!var9_3)
lbl332:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void blockPose(class_4587 var1_1, int var2_2, float var3_3) {
        while (true) {
            block78: {
                if ((v0 /* !! */  = (cfr_temp_1 = jq.sf - jq.kent("khpc", keqe(int ), (int)227)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  != jq.kent("khpd", keoa(int ), (int)1204)) break block78;
                var6_4 = jq.c;
                v1 /* !! */  = jq.sf;
                if (true) ** GOTO lbl12
            }
            v0 /* !! */  = (long)jq.kent("khpe", keoa(int ), (int)1205);
        }
        block46: while (true) {
            v1 /* !! */  = (long)(v2 - jq.kent("khpf", keqe(int ), (int)228));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 197898621: {
                    break block46;
                }
                case 693717999: {
                    v2 = jq.kent("khpg", keqe(int ), (int)229);
                    continue block46;
                }
                case 1841137028: {
                    v2 = jq.kent("khph", keqe(int ), (int)230);
                    continue block46;
                }
                case 2019120100: {
                    v2 = jq.kent("khpi", keqe(int ), (int)231);
                    continue block46;
                }
            }
            break;
        }
        var5_5 /* !! */  = jq.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = jq.sf - jq.kent("khpj", keqe(int ), (int)232)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == jq.kent("khpk", keoa(int ), (int)1206)) {
                var4_6 = jq.a;
                if (var6_4) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)jq.kent("khpl", keoa(int ), (int)1207);
        }
        if (var4_6 || var4_6) return;
        if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block48: while (true) {
            block79: {
                switch (cfr_temp_0 == -2147483648 ? var5_5 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_3 = jq.sf - jq.kent("khpm", keqe(int ), (int)233)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v4 /* !! */  != jq.kent("khpn", keoa(int ), (int)1208)) ** GOTO lbl45
                            v5 = var3_3 * (float)var2_2;
                            ** GOTO lbl97
lbl45:
                            // 1 sources

                            v4 /* !! */  = (long)jq.kent("khpo", keoa(int ), (int)1209);
                        }
                    }
                    case 1: {
                        var5_5 /* !! */  = (int)jq.kent("khqw", keoa(int ), (int)1224);
                        cfr_temp_0 = 4;
                        if (var6_4) {
                            throw null;
                        }
                        break block79;
                    }
                    case 3: {
                        var5_5 /* !! */  = (int)jq.kent("khqy", keoa(int ), (int)1226);
                        cfr_temp_0 = 9;
                        if (var6_4) {
                            throw null;
                        }
                        break block79;
                    }
                    case 4: {
                        ** GOTO lbl81
                    }
                    case 6: {
                        var5_5 /* !! */  = (int)jq.kent("khrb", keoa(int ), (int)1229);
                        cfr_temp_0 = 5;
                        if (var6_4) {
                            throw null;
                        }
                        break block79;
                    }
                    case 9: {
                        var5_5 /* !! */  = (int)jq.kent("khre", keoa(int ), (int)1232);
                        if (var6_4) {
                            throw null;
                        }
                    }
                    case 7: {
                        var5_5 /* !! */  = (int)jq.kent("khrc", keoa(int ), (int)1230);
                        cfr_temp_0 = 5;
                        if (var6_4) {
                            throw null;
                        }
                        break block79;
                    }
                    case 11: {
                        var5_5 /* !! */  = (int)jq.kent("khrg", keoa(int ), (int)1234);
                        if (var6_4) {
                            throw null;
                        }
lbl81:
                        // 3 sources

                        var5_5 /* !! */  = (int)jq.kent("khqz", keoa(int ), (int)1227);
                        if (var6_4) {
                            throw null;
                        }
                    }
                    case 5: {
                        var5_5 /* !! */  = (int)jq.kent("khra", keoa(int ), (int)1228);
                        if (var6_4) {
                            throw null;
                        }
                    }
                    case 0: {
                        var5_5 /* !! */  = (int)jq.kent("khqv", keoa(int ), (int)1223);
                        if (var6_4) {
                            throw null;
                        }
                    }
                    case 8: {
                        var5_5 /* !! */  = (int)jq.kent("khrd", keoa(int ), (int)1231);
                        if (var6_4) {
                            throw null;
                        }
                        ** GOTO lbl199
                    }
lbl97:
                    // 1 sources

                    while (true) {
                        if ((v6 /* !! */  = (cfr_temp_4 = jq.sf - jq.kent("khpp", keqe(int ), (int)234)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v6 /* !! */  == jq.kent("khpq", keoa(int ), (int)1210)) break;
                        v6 /* !! */  = (long)jq.kent("khpr", keoa(int ), (int)1211);
                    }
                    v7 = class_7833.field_40715.rotationDegrees(v5);
                    v8 /* !! */  = jq.sf;
                    block51: while (true) {
                        switch ((int)v8 /* !! */ ) {
                            case 197898621: {
                                break block51;
                            }
                            case 301758746: {
                                v8 /* !! */  = (long)(jq.kent("khpt", keqe(int ), (int)236) - jq.kent("khps", keqe(int ), (int)235));
                                continue block51;
                            }
                        }
                        break;
                    }
                    var1_1.method_22907((Quaternionfc)v7);
                    if (var4_6 || var4_6) return;
                    v9 /* !! */  = jq.sf;
                    if (true) ** GOTO lbl117
                    block52: while (true) {
                        v9 /* !! */  = (long)(v10 - jq.kent("khpu", keqe(int ), (int)237));
lbl117:
                        // 2 sources

                        switch ((int)v9 /* !! */ ) {
                            case -2081537142: {
                                v10 = jq.kent("khpv", keqe(int ), (int)238);
                                continue block52;
                            }
                            case 197898621: {
                                break block52;
                            }
                            case 1934824105: {
                                v10 = jq.kent("khpw", keqe(int ), (int)239);
                                continue block52;
                            }
                        }
                        break;
                    }
                    v11 = jq.kent("khpx", kenp(int ), (int)1212);
                    while (true) {
                        if ((v12 /* !! */  = (cfr_temp_5 = jq.sf - jq.kent("khpy", keqe(int ), (int)240)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v12 /* !! */  != jq.kent("khpz", keoa(int ), (int)1213)) ** GOTO lbl133
                        v13 = class_7833.field_40714.rotationDegrees((float)v11);
                        v14 /* !! */  = jq.sf;
                        if (true) ** GOTO lbl137
lbl133:
                        // 1 sources

                        v12 /* !! */  = (long)jq.kent("khqa", keoa(int ), (int)1214);
                    }
                    block54: while (true) {
                        v14 /* !! */  = (long)(v15 - jq.kent("khqb", keqe(int ), (int)241));
lbl137:
                        // 2 sources

                        switch ((int)v14 /* !! */ ) {
                            case -1076592656: {
                                v15 = jq.kent("khqc", keqe(int ), (int)242);
                                continue block54;
                            }
                            case 197898621: {
                                break block54;
                            }
                            case 1689458491: {
                                v15 = jq.kent("khqd", keqe(int ), (int)243);
                                continue block54;
                            }
                        }
                        break;
                    }
                    var1_1.method_22907((Quaternionfc)v13);
                    if (var4_6 || var4_6) return;
                    v16 /* !! */  = jq.sf;
                    if (true) ** GOTO lbl152
                    block55: while (true) {
                        v16 /* !! */  = (long)(v17 - jq.kent("khqe", keqe(int ), (int)244));
lbl152:
                        // 2 sources

                        switch ((int)v16 /* !! */ ) {
                            case -1865589137: {
                                v17 = jq.kent("khqf", keqe(int ), (int)245);
                                continue block55;
                            }
                            case -857779776: {
                                v17 = jq.kent("khqg", keqe(int ), (int)246);
                                continue block55;
                            }
                            case 197898621: {
                                break block55;
                            }
                            case 2026463659: {
                                v17 = jq.kent("khqh", keqe(int ), (int)247);
                                continue block55;
                            }
                        }
                        break;
                    }
                    v18 = jq.kent("khqi", kenp(int ), (int)1215) * (float)var2_2;
                    while (true) {
                        if ((v19 /* !! */  = (cfr_temp_6 = jq.sf - jq.kent("khqj", keqe(int ), (int)248)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v19 /* !! */  == jq.kent("khqk", keoa(int ), (int)1216)) break;
                        v19 /* !! */  = (long)jq.kent("khql", keoa(int ), (int)1217);
                    }
                    v20 = class_7833.field_40718.rotationDegrees((float)v18);
                    while (true) {
                        if ((v21 /* !! */  = (cfr_temp_7 = jq.sf - jq.kent("khqm", keqe(int ), (int)249)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v21 /* !! */  == jq.kent("khqn", keoa(int ), (int)1218)) {
                            var1_1.method_22907((Quaternionfc)v20);
                            if (var4_6) return;
                            break;
                        }
                        v21 /* !! */  = (long)jq.kent("khqo", keoa(int ), (int)1219);
                    }
                    if (var4_6) return;
                    v22 = jq.kent("khqp", kenp(int ), (int)1220) * (float)var2_2;
                    v23 = jq.kent("khqq", kenp(int ), (int)1221);
                    v24 = jq.kent("khqr", kenp(int ), (int)1222);
                    v25 /* !! */  = jq.sf;
                    if (true) ** GOTO lbl187
                    block58: while (true) {
                        v25 /* !! */  = (long)(v26 - jq.kent("khqs", keqe(int ), (int)250));
lbl187:
                        // 2 sources

                        switch ((int)v25 /* !! */ ) {
                            case -776002293: {
                                v26 = jq.kent("khqt", keqe(int ), (int)251);
                                continue block58;
                            }
                            case 197898621: {
                                break block58;
                            }
                            case 1664317717: {
                                v26 = jq.kent("khqu", keqe(int ), (int)252);
                                continue block58;
                            }
                        }
                        break;
                    }
                    var1_1.method_46416((float)v22, (float)v23, (float)v24);
                    if (!var4_6 && !var4_6) return;
                    return;
lbl199:
                    // 2 sources

                    case 2: {
                        var5_5 /* !! */  = (int)jq.kent("khqx", keoa(int ), (int)1225);
                        if (var6_4) {
                            throw null;
                        }
                    }
                    case 10: 
                }
                ** GOTO lbl208
            }
            do {
                if (true) continue block48;
lbl208:
                // 2 sources

                var5_5 /* !! */  = (int)jq.kent("khrf", keoa(int ), (int)1233);
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
    private /* synthetic */ Boolean lambda$new$3() {
        v0 /* !! */  = jq.sf;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - jq.kent("kihb", keqe(int ), (int)449));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 197898621: {
                    break block24;
                }
                case 312399661: {
                    v1 = jq.kent("kihc", keqe(int ), (int)450);
                    continue block24;
                }
                case 1348443907: {
                    v1 = jq.kent("kihd", keqe(int ), (int)451);
                    continue block24;
                }
            }
            break;
        }
        var3_1 = jq.c;
        v2 /* !! */  = jq.sf;
        if (true) ** GOTO lbl19
        block25: while (true) {
            v2 /* !! */  = (long)(v3 - jq.kent("kihe", keqe(int ), (int)452));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -724946636: {
                    v3 = jq.kent("kihf", keqe(int ), (int)453);
                    continue block25;
                }
                case 197898621: {
                    break block25;
                }
                case 485526526: {
                    v3 = jq.kent("kihg", keqe(int ), (int)454);
                    continue block25;
                }
            }
            break;
        }
        var2_2 /* !! */  = jq.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = jq.sf - jq.kent("kihh", keqe(int ), (int)455)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == jq.kent("kihi", keoa(int ), (int)1449)) break;
                    v4 /* !! */  = (long)jq.kent("kihj", keoa(int ), (int)1450);
                }
                var1_3 = jq.a;
                if (var3_1) {
                    throw null;
lbl41:
                    // 3 sources

                    return null;
                }
                if (var1_3 || var1_3) ** GOTO lbl41
                v5 /* !! */  = jq.sf;
                if (true) ** GOTO lbl48
                block28: while (true) {
                    v5 /* !! */  = (long)(jq.kent("kihl", keqe(int ), (int)457) - jq.kent("kihk", keqe(int ), (int)456));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -858908664: {
                            continue block28;
                        }
                        case 197898621: {
                            break block28;
                        }
                    }
                    break;
                }
                if (this.isNewHmi()) ** GOTO lbl59
                if (var1_3) ** GOTO lbl41
                v6 = jq.kent("kihm", keoa(int ), (int)1451);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl62
lbl59:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v6 = jq.kent("kihn", keoa(int ), (int)1452);
lbl62:
                // 2 sources

                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = jq.sf - jq.kent("kiho", keqe(int ), (int)458)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == jq.kent("kihp", keoa(int ), (int)1453)) break;
                    v7 /* !! */  = (long)jq.kent("kihq", keoa(int ), (int)1454);
                }
                return (boolean)v6;
            }
lbl69:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)jq.kent("kihr", keoa(int ), (int)1455);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl82
            }
            case 1: {
                var2_2 /* !! */  = (int)jq.kent("kihs", keoa(int ), (int)1456);
                if (var3_1) {
                    throw null;
                }
            }
lbl78:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)jq.kent("kiht", keoa(int ), (int)1457);
                if (!var3_1) ** GOTO lbl69
                throw null;
            }
lbl82:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)jq.kent("kihu", keoa(int ), (int)1458);
                if (!var3_1) ** GOTO lbl69
                throw null;
            }
lbl86:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)jq.kent("kihv", keoa(int ), (int)1459);
                if (var3_1) {
                    throw null;
                }
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jq.kent("kihw", keoa(int ), (int)1460);
                    if (!var3_1) ** GOTO lbl86
                    throw null;
                }
            }
            case 6: {
                var2_2 /* !! */  = (int)jq.kent("kihx", keoa(int ), (int)1461);
                if (!var3_1) ** GOTO lbl78
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)jq.kent("kihy", keoa(int ), (int)1462);
        ** while (!var3_1)
lbl102:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kimj() {
        jq.kens[200] = 2076777297;
        jq.kens[201] = -1343598617;
        jq.kens[202] = 2109638598;
        jq.kens[203] = -380252093;
        jq.kens[204] = 94421302;
        jq.kens[205] = -310066949;
        jq.kens[206] = -603284243;
        jq.kens[207] = -1290612012;
        jq.kens[208] = -1220513150;
        jq.kens[209] = 1664253883;
        jq.kens[210] = -1355973872;
        jq.kens[211] = -2774814;
        jq.kens[212] = 1491350768;
        jq.kens[213] = 540004969;
        jq.kens[214] = 1986549517;
        jq.kens[215] = -301912936;
        jq.kens[216] = 1755379519;
        jq.kens[217] = -970625566;
        jq.kens[218] = 1294334303;
        jq.kens[219] = -1979996592;
        jq.kens[220] = -533382931;
        jq.kens[221] = -630588401;
        jq.kens[222] = -308464259;
        jq.kens[223] = -1395688923;
        jq.kens[224] = -1210717627;
        jq.kens[225] = -2077157983;
        jq.kens[226] = 689501060;
        jq.kens[227] = 112237254;
        jq.kens[228] = -107296612;
        jq.kens[229] = 860070653;
        jq.kens[230] = -2071678957;
        jq.kens[231] = 875092083;
        jq.kens[232] = -1201236363;
        jq.kens[233] = 1525828559;
        jq.kens[234] = 1981084207;
        jq.kens[235] = -473125515;
        jq.kens[236] = -387460296;
        jq.kens[237] = -789540728;
        jq.kens[238] = 903097294;
        jq.kens[239] = -289994549;
        jq.kens[240] = 498789150;
        jq.kens[241] = 1213080244;
        jq.kens[242] = -671971983;
        jq.kens[243] = -1088207977;
        jq.kens[244] = 477066546;
        jq.kens[245] = -1266191551;
        jq.kens[246] = 447580747;
        jq.kens[247] = 20812141;
        jq.kens[248] = -589876060;
        jq.kens[249] = -602871068;
        jq.kens[250] = 965199318;
        jq.kens[251] = 7830338;
        jq.kens[252] = -1121605998;
        jq.kens[253] = -207830090;
        jq.kens[254] = 1131681360;
        jq.kens[255] = -134001602;
        jq.kens[256] = -709636031;
        jq.kens[257] = 1383789606;
        jq.kens[258] = 1169419929;
        jq.kens[259] = 2027485141;
        jq.kens[260] = 1111240105;
        jq.kens[261] = -753380048;
        jq.kens[262] = -297971103;
        jq.kens[263] = -656749288;
        jq.kens[264] = -1761049546;
        jq.kens[265] = 663582670;
        jq.kens[266] = 1061286018;
        jq.kens[267] = 289508167;
        jq.kens[268] = -1860148;
        jq.kens[269] = 339795375;
        jq.kens[270] = -1557987415;
        jq.kens[271] = -186864725;
        jq.kens[272] = 54341644;
        jq.kens[273] = -223901402;
        jq.kens[274] = -424427204;
        jq.kens[275] = -500370270;
        jq.kens[276] = 638481365;
        jq.kens[277] = -9824156;
        jq.kens[278] = 23514743;
        jq.kens[279] = 120367611;
        jq.kens[280] = 150089997;
        jq.kens[281] = 686022634;
        jq.kens[282] = 773886936;
        jq.kens[283] = -2047218045;
        jq.kens[284] = 1691042465;
        jq.kens[285] = 1750382648;
        jq.kens[286] = 1579916989;
        jq.kens[287] = -1345508640;
        jq.kens[288] = 696309449;
        jq.kens[289] = 813003466;
        jq.kens[290] = 410100042;
        jq.kens[291] = -1745973860;
        jq.kens[292] = 201846672;
        jq.kens[293] = 1655319108;
        jq.kens[294] = 468078736;
        jq.kens[295] = 1073412228;
        jq.kens[296] = -295311469;
        jq.kens[297] = 940368363;
        jq.kens[298] = -1153466133;
        jq.kens[299] = -218501325;
    }

    private static /* synthetic */ void kilm() {
        jq.kenr[1400] = 1359078576;
        jq.kenr[1401] = 430509344;
        jq.kenr[1402] = -1381198208;
        jq.kenr[1403] = -1308410288;
        jq.kenr[1404] = -258870298;
        jq.kenr[1405] = -1779467541;
        jq.kenr[1406] = 1760722728;
        jq.kenr[1407] = 865581797;
        jq.kenr[1408] = -1918058096;
        jq.kenr[1409] = 379540684;
        jq.kenr[1410] = -805491531;
        jq.kenr[1411] = -29275232;
        jq.kenr[1412] = 1597686538;
        jq.kenr[1413] = 501888184;
        jq.kenr[1414] = 873404739;
        jq.kenr[1415] = -1018354507;
        jq.kenr[1416] = -1340575553;
        jq.kenr[1417] = -1328635131;
        jq.kenr[1418] = 1318285101;
        jq.kenr[1419] = -1940956176;
        jq.kenr[1420] = 1174584133;
        jq.kenr[1421] = -1008708294;
        jq.kenr[1422] = -159706803;
        jq.kenr[1423] = 1800837317;
        jq.kenr[1424] = -1539489333;
        jq.kenr[1425] = -1289626070;
        jq.kenr[1426] = 1696902312;
        jq.kenr[1427] = 22892645;
        jq.kenr[1428] = 186182755;
        jq.kenr[1429] = -1542176074;
        jq.kenr[1430] = 1767914585;
        jq.kenr[1431] = 1424161244;
        jq.kenr[1432] = -1269429169;
        jq.kenr[1433] = 2023731588;
        jq.kenr[1434] = 2123956980;
        jq.kenr[1435] = -1866308341;
        jq.kenr[1436] = 1855024984;
        jq.kenr[1437] = 185530414;
        jq.kenr[1438] = -526957746;
        jq.kenr[1439] = -583553511;
        jq.kenr[1440] = -1639202650;
        jq.kenr[1441] = 998550641;
        jq.kenr[1442] = -717079719;
        jq.kenr[1443] = -930329242;
        jq.kenr[1444] = -63523579;
        jq.kenr[1445] = -154776473;
        jq.kenr[1446] = 249601078;
        jq.kenr[1447] = 515123932;
        jq.kenr[1448] = 648612661;
        jq.kenr[1449] = 1383636882;
        jq.kenr[1450] = 675421984;
        jq.kenr[1451] = -1781647730;
        jq.kenr[1452] = -1497728319;
        jq.kenr[1453] = 414506384;
        jq.kenr[1454] = 763271960;
        jq.kenr[1455] = 1012119627;
        jq.kenr[1456] = -408625868;
        jq.kenr[1457] = -1135336781;
        jq.kenr[1458] = -1454782155;
        jq.kenr[1459] = -184403812;
        jq.kenr[1460] = 324805555;
        jq.kenr[1461] = -1949120714;
        jq.kenr[1462] = 1311461491;
        jq.kenr[1463] = -564021102;
        jq.kenr[1464] = -1535783961;
        jq.kenr[1465] = 510032401;
        jq.kenr[1466] = 273579672;
        jq.kenr[1467] = -667837704;
        jq.kenr[1468] = -783745105;
        jq.kenr[1469] = 826108847;
        jq.kenr[1470] = -1905453733;
        jq.kenr[1471] = -1828744658;
        jq.kenr[1472] = 1694013973;
        jq.kenr[1473] = 577768131;
        jq.kenr[1474] = 437134003;
        jq.kenr[1475] = 1170835766;
        jq.kenr[1476] = 946957493;
        jq.kenr[1477] = -997356953;
        jq.kenr[1478] = -1584748644;
        jq.kenr[1479] = 1214606432;
        jq.kenr[1480] = 1921978811;
        jq.kenr[1481] = 1218258313;
        jq.kenr[1482] = 567628566;
        jq.kenr[1483] = -416601811;
        jq.kenr[1484] = -64231021;
        jq.kenr[1485] = -709357147;
        jq.kenr[1486] = -1228700160;
        jq.kenr[1487] = -28483446;
        jq.kenr[1488] = -1298122003;
        jq.kenr[1489] = 1175882454;
        jq.kenr[1490] = 465712442;
        jq.kenr[1491] = 1184471069;
        jq.kenr[1492] = 913768552;
        jq.kenr[1493] = -347567103;
        jq.kenr[1494] = -362765525;
        jq.kenr[1495] = 2030760680;
        jq.kenr[1496] = -130492179;
        jq.kenr[1497] = -1508217264;
        jq.kenr[1498] = 1228199471;
        jq.kenr[1499] = -306098842;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isThinBlock(class_1747 var1_1, class_1799 var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jq.sf - jq.kent("khxu", keqe(int ), (int)325)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jq.kent("khxv", keoa(int ), (int)1332)) break;
            v0 /* !! */  = (long)jq.kent("khxw", keoa(int ), (int)1333);
        }
        var5_3 = jq.c;
        v1 /* !! */  = jq.sf;
        if (true) ** GOTO lbl11
        block108: while (true) {
            v1 /* !! */  = (long)(v2 - jq.kent("khxx", keqe(int ), (int)326));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1259197510: {
                    v2 = jq.kent("khxy", keqe(int ), (int)327);
                    continue block108;
                }
                case -454239262: {
                    v2 = jq.kent("khxz", keqe(int ), (int)328);
                    continue block108;
                }
                case 197898621: {
                    break block108;
                }
            }
            break;
        }
        var4_4 /* !! */  = jq.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = jq.sf - jq.kent("khya", keqe(int ), (int)329)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == jq.kent("khyb", keoa(int ), (int)1334)) break;
            v3 /* !! */  = (long)jq.kent("khyc", keoa(int ), (int)1335);
        }
        var3_5 = jq.a;
        if (var5_3) {
            throw null;
lbl29:
            // 11 sources

            return (boolean)jq.kent("khyd", keoa(int ), (int)1336);
        }
        if (var3_5 || var3_5) ** GOTO lbl29
        v4 /* !! */  = jq.sf;
        if (true) ** GOTO lbl36
        block111: while (true) {
            v4 /* !! */  = (long)(v5 - jq.kent("khye", keqe(int ), (int)330));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1451750016: {
                    v5 = jq.kent("khyf", keqe(int ), (int)331);
                    continue block111;
                }
                case -720881165: {
                    v5 = jq.kent("khyg", keqe(int ), (int)332);
                    continue block111;
                }
                case -599774415: {
                    v5 = jq.kent("khyh", keqe(int ), (int)333);
                    continue block111;
                }
                case 197898621: {
                    break block111;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = jq.sf - jq.kent("khyi", keqe(int ), (int)334)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == jq.kent("khyj", keoa(int ), (int)1337)) break;
            v6 /* !! */  = (long)jq.kent("khyk", keoa(int ), (int)1338);
        }
        if (var2_2.method_31574(class_1802.field_8276)) ** GOTO lbl-1000
        if (var3_5) ** GOTO lbl29
        v7 /* !! */  = jq.sf;
        if (true) ** GOTO lbl59
        block113: while (true) {
            v7 /* !! */  = (long)(jq.kent("khym", keqe(int ), (int)336) - jq.kent("khyl", keqe(int ), (int)335));
lbl59:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 197898621: {
                    break block113;
                }
                case 209027027: {
                    continue block113;
                }
            }
            break;
        }
        v8 /* !! */  = jq.sf;
        if (true) ** GOTO lbl68
        block114: while (true) {
            v8 /* !! */  = (long)(v9 - jq.kent("khyn", keqe(int ), (int)337));
lbl68:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1304740278: {
                    v9 = jq.kent("khyo", keqe(int ), (int)338);
                    continue block114;
                }
                case -259242941: {
                    v9 = jq.kent("khyp", keqe(int ), (int)339);
                    continue block114;
                }
                case 197898621: {
                    break block114;
                }
                case 839784458: {
                    v9 = jq.kent("khyq", keqe(int ), (int)340);
                    continue block114;
                }
            }
            break;
        }
        if (var2_2.method_31574(class_1802.field_8725)) ** GOTO lbl-1000
        if (var3_5) ** GOTO lbl29
        v10 /* !! */  = jq.sf;
        if (true) ** GOTO lbl86
        block115: while (true) {
            v10 /* !! */  = (long)(v11 - jq.kent("khyr", keqe(int ), (int)341));
lbl86:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1773975737: {
                    v11 = jq.kent("khys", keqe(int ), (int)342);
                    continue block115;
                }
                case 119822341: {
                    v11 = jq.kent("khyt", keqe(int ), (int)343);
                    continue block115;
                }
                case 197898621: {
                    break block115;
                }
                case 423818145: {
                    v11 = jq.kent("khyu", keqe(int ), (int)344);
                    continue block115;
                }
            }
            break;
        }
        v12 /* !! */  = jq.sf;
        if (true) ** GOTO lbl102
        block116: while (true) {
            v12 /* !! */  = (long)(v13 - jq.kent("khyv", keqe(int ), (int)345));
lbl102:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1208005005: {
                    v13 = jq.kent("khyw", keqe(int ), (int)346);
                    continue block116;
                }
                case 197898621: {
                    break block116;
                }
                case 1739291444: {
                    v13 = jq.kent("khyx", keqe(int ), (int)347);
                    continue block116;
                }
            }
            break;
        }
        if (var2_2.method_31574(class_1802.field_8865)) ** GOTO lbl-1000
        if (var3_5) ** GOTO lbl29
        v14 /* !! */  = jq.sf;
        if (true) ** GOTO lbl117
        block117: while (true) {
            v14 /* !! */  = (long)(v15 - jq.kent("khyy", keqe(int ), (int)348));
lbl117:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1504145824: {
                    v15 = jq.kent("khyz", keqe(int ), (int)349);
                    continue block117;
                }
                case -1037180852: {
                    v15 = jq.kent("khza", keqe(int ), (int)350);
                    continue block117;
                }
                case 197898621: {
                    break block117;
                }
                case 1767958112: {
                    v15 = jq.kent("khzb", keqe(int ), (int)351);
                    continue block117;
                }
            }
            break;
        }
        v16 /* !! */  = jq.sf;
        if (true) ** GOTO lbl133
        block118: while (true) {
            v16 /* !! */  = (long)(v17 - jq.kent("khzc", keqe(int ), (int)352));
lbl133:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1497569092: {
                    v17 = jq.kent("khzd", keqe(int ), (int)353);
                    continue block118;
                }
                case 197898621: {
                    break block118;
                }
                case 1450957192: {
                    v17 = jq.kent("khze", keqe(int ), (int)354);
                    continue block118;
                }
            }
            break;
        }
        if (var2_2.method_31574(class_1802.field_8366)) ** GOTO lbl-1000
        if (var3_5) ** GOTO lbl29
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_3 = jq.sf - jq.kent("khzf", keqe(int ), (int)355)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == jq.kent("khzg", keoa(int ), (int)1339)) break;
            v18 /* !! */  = (long)jq.kent("khzh", keoa(int ), (int)1340);
        }
        if (var1_1.method_7711() instanceof class_2389) ** GOTO lbl-1000
        if (var3_5) ** GOTO lbl29
        v19 /* !! */  = jq.sf;
        if (true) ** GOTO lbl155
        block120: while (true) {
            v19 /* !! */  = (long)(v20 - jq.kent("khzi", keqe(int ), (int)356));
lbl155:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -1443095778: {
                    v20 = jq.kent("khzj", keqe(int ), (int)357);
                    continue block120;
                }
                case 197898621: {
                    break block120;
                }
                case 488236184: {
                    v20 = jq.kent("khzk", keqe(int ), (int)358);
                    continue block120;
                }
            }
            break;
        }
        v21 = var1_1.method_7711();
        v22 /* !! */  = jq.sf;
        if (true) ** GOTO lbl169
        block121: while (true) {
            v22 /* !! */  = (long)(jq.kent("khzm", keqe(int ), (int)360) - jq.kent("khzl", keqe(int ), (int)359));
lbl169:
            // 2 sources

            switch ((int)v22 /* !! */ ) {
                case 197898621: {
                    break block121;
                }
                case 1833544984: {
                    continue block121;
                }
            }
            break;
        }
        v23 = v21.method_9564();
        v24 /* !! */  = jq.sf;
        if (true) ** GOTO lbl179
        block122: while (true) {
            v24 /* !! */  = (long)(v25 - jq.kent("khzn", keqe(int ), (int)361));
lbl179:
            // 2 sources

            switch ((int)v24 /* !! */ ) {
                case -1723443110: {
                    v25 = jq.kent("khzo", keqe(int ), (int)362);
                    continue block122;
                }
                case -995311790: {
                    v25 = jq.kent("khzp", keqe(int ), (int)363);
                    continue block122;
                }
                case -675198421: {
                    v25 = jq.kent("khzq", keqe(int ), (int)364);
                    continue block122;
                }
                case 197898621: {
                    break block122;
                }
            }
            break;
        }
        while (true) {
            if ((v26 /* !! */  = (cfr_temp_4 = jq.sf - jq.kent("khzr", keqe(int ), (int)365)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v26 /* !! */  == jq.kent("khzs", keoa(int ), (int)1341)) break;
            v26 /* !! */  = (long)jq.kent("khzt", keoa(int ), (int)1342);
        }
        if (v23.method_26164(class_3481.field_15463)) ** GOTO lbl-1000
        if (var3_5) ** GOTO lbl29
        v27 /* !! */  = jq.sf;
        if (true) ** GOTO lbl202
        block124: while (true) {
            v27 /* !! */  = (long)(v28 - jq.kent("khzu", keqe(int ), (int)366));
lbl202:
            // 2 sources

            switch ((int)v27 /* !! */ ) {
                case 197898621: {
                    break block124;
                }
                case 200439729: {
                    v28 = jq.kent("khzv", keqe(int ), (int)367);
                    continue block124;
                }
                case 1142423382: {
                    v28 = jq.kent("khzw", keqe(int ), (int)368);
                    continue block124;
                }
            }
            break;
        }
        v29 = var1_1.method_7711();
        while (true) {
            if ((v30 /* !! */  = (cfr_temp_5 = jq.sf - jq.kent("khzx", keqe(int ), (int)369)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v30 /* !! */  == jq.kent("khzy", keoa(int ), (int)1343)) break;
            v30 /* !! */  = (long)jq.kent("khzz", keoa(int ), (int)1344);
        }
        v31 = v29.method_9564();
        v32 /* !! */  = jq.sf;
        if (true) ** GOTO lbl222
        block126: while (true) {
            v32 /* !! */  = (long)(v33 - jq.kent("kiaa", keqe(int ), (int)370));
lbl222:
            // 2 sources

            switch ((int)v32 /* !! */ ) {
                case -783667065: {
                    v33 = jq.kent("kiab", keqe(int ), (int)371);
                    continue block126;
                }
                case 197898621: {
                    break block126;
                }
                case 608796305: {
                    v33 = jq.kent("kiac", keqe(int ), (int)372);
                    continue block126;
                }
            }
            break;
        }
        while (true) {
            if ((v34 /* !! */  = (cfr_temp_6 = jq.sf - jq.kent("kiad", keqe(int ), (int)373)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v34 /* !! */  == jq.kent("kiae", keoa(int ), (int)1345)) break;
            v34 /* !! */  = (long)jq.kent("kiaf", keoa(int ), (int)1346);
        }
        if (v31.method_26164(class_3481.field_22414)) ** GOTO lbl-1000
        if (var3_5) ** GOTO lbl29
        v35 /* !! */  = jq.sf;
        if (true) ** GOTO lbl242
        block128: while (true) {
            v35 /* !! */  = (long)(jq.kent("kiah", keqe(int ), (int)375) - jq.kent("kiag", keqe(int ), (int)374));
lbl242:
            // 2 sources

            switch ((int)v35 /* !! */ ) {
                case -1942590881: {
                    continue block128;
                }
                case 197898621: {
                    break block128;
                }
            }
            break;
        }
        v36 = var1_1.method_7711();
        v37 /* !! */  = jq.sf;
        if (true) ** GOTO lbl252
        block129: while (true) {
            v37 /* !! */  = (long)(jq.kent("kiaj", keqe(int ), (int)377) - jq.kent("kiai", keqe(int ), (int)376));
lbl252:
            // 2 sources

            switch ((int)v37 /* !! */ ) {
                case 197898621: {
                    break block129;
                }
                case 387466213: {
                    continue block129;
                }
            }
            break;
        }
        v38 = v36.method_9564();
        v39 /* !! */  = jq.sf;
        if (true) ** GOTO lbl262
        block130: while (true) {
            v39 /* !! */  = (long)(v40 - jq.kent("kiak", keqe(int ), (int)378));
lbl262:
            // 2 sources

            switch ((int)v39 /* !! */ ) {
                case -834931854: {
                    v40 = jq.kent("kial", keqe(int ), (int)379);
                    continue block130;
                }
                case 197898621: {
                    break block130;
                }
                case 1448676765: {
                    v40 = jq.kent("kiam", keqe(int ), (int)380);
                    continue block130;
                }
                case 1734418851: {
                    v40 = jq.kent("kian", keqe(int ), (int)381);
                    continue block130;
                }
            }
            break;
        }
        v41 /* !! */  = jq.sf;
        if (true) ** GOTO lbl278
        block131: while (true) {
            v41 /* !! */  = (long)(v42 - jq.kent("kiao", keqe(int ), (int)382));
lbl278:
            // 2 sources

            switch ((int)v41 /* !! */ ) {
                case -1056796950: {
                    v42 = jq.kent("kiap", keqe(int ), (int)383);
                    continue block131;
                }
                case -23285180: {
                    v42 = jq.kent("kiaq", keqe(int ), (int)384);
                    continue block131;
                }
                case 197898621: {
                    break block131;
                }
                case 1926954907: {
                    v42 = jq.kent("kiar", keqe(int ), (int)385);
                    continue block131;
                }
            }
            break;
        }
        if (!v38.method_26164(class_3481.field_15495)) ** GOTO lbl300
        if (var3_5) ** GOTO lbl29
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 9 sources

            {
                if (var3_5 || var3_5) ** GOTO lbl29
                v43 = jq.kent("kias", keoa(int ), (int)1347);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl303
            }
lbl300:
            // 1 sources

            if (!var3_5 && !var3_5) ** break;
            ** continue;
            v43 = jq.kent("kiat", keoa(int ), (int)1348);
lbl303:
            // 2 sources

            return (boolean)v43;
            case 0: {
                var4_4 /* !! */  = (int)jq.kent("kiau", keoa(int ), (int)1349);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl364
            }
lbl309:
            // 2 sources

            case 1: {
                var4_4 /* !! */  = (int)jq.kent("kiav", keoa(int ), (int)1350);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl323
            }
            case 2: {
                var4_4 /* !! */  = (int)jq.kent("kiaw", keoa(int ), (int)1351);
                if (var5_3) {
                    throw null;
                }
            }
lbl318:
            // 4 sources

            case 3: {
                var4_4 /* !! */  = (int)jq.kent("kiax", keoa(int ), (int)1352);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl333
            }
lbl323:
            // 3 sources

            case 4: {
                do {
                    var4_4 /* !! */  = (int)jq.kent("kiay", keoa(int ), (int)1353);
                } while (!var5_3);
                throw null;
            }
            case 5: {
                var4_4 /* !! */  = (int)jq.kent("kiaz", keoa(int ), (int)1354);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl368
            }
lbl333:
            // 2 sources

            case 6: {
                var4_4 /* !! */  = (int)jq.kent("kiba", keoa(int ), (int)1355);
                if (!var5_3) break;
                throw null;
            }
lbl337:
            // 2 sources

            case 7: {
                var4_4 /* !! */  = (int)jq.kent("kibb", keoa(int ), (int)1356);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl360
            }
            case 8: {
                var4_4 /* !! */  = (int)jq.kent("kibc", keoa(int ), (int)1357);
                if (!var5_3) ** GOTO lbl309
                throw null;
            }
            case 9: {
                var4_4 /* !! */  = (int)jq.kent("kibd", keoa(int ), (int)1358);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl372
            }
lbl351:
            // 3 sources

            case 10: {
                var4_4 /* !! */  = (int)jq.kent("kibe", keoa(int ), (int)1359);
                if (!var5_3) ** GOTO lbl318
                throw null;
            }
            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)jq.kent("kibf", keoa(int ), (int)1360);
                    if (!var5_3) ** GOTO lbl351
                    throw null;
                }
            }
lbl360:
            // 2 sources

            case 12: {
                var4_4 /* !! */  = (int)jq.kent("kibg", keoa(int ), (int)1361);
                if (!var5_3) ** GOTO lbl337
                throw null;
            }
lbl364:
            // 2 sources

            case 13: {
                var4_4 /* !! */  = (int)jq.kent("kibh", keoa(int ), (int)1362);
                if (!var5_3) ** GOTO lbl351
                throw null;
            }
lbl368:
            // 2 sources

            case 14: {
                var4_4 /* !! */  = (int)jq.kent("kibi", keoa(int ), (int)1363);
                if (!var5_3) break;
                throw null;
            }
lbl372:
            // 2 sources

            case 15: {
                var4_4 /* !! */  = (int)jq.kent("kibj", keoa(int ), (int)1364);
                if (!var5_3) ** GOTO lbl323
                throw null;
            }
            case 16: 
        }
        var4_4 /* !! */  = (int)jq.kent("kibk", keoa(int ), (int)1365);
        ** while (!var5_3)
lbl379:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean shouldUseNewHmiRenderer() {
        block50: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = jq.sf - jq.kent("keve", keqe(int ), (int)39)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == jq.kent("kevg", keoa(int ), (int)58)) break;
                v0 /* !! */  = (long)jq.kent("kevi", keoa(int ), (int)59);
            }
            var3 = jq.c;
            v1 /* !! */  = jq.sf;
            if (true) ** GOTO lbl12
            block30: while (true) {
                v1 /* !! */  = (long)(v2 - jq.kent("kevk", keqe(int ), (int)40));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1122350271: {
                        v2 = jq.kent("kevn", keqe(int ), (int)41);
                        continue block30;
                    }
                    case 197898621: {
                        break block30;
                    }
                    case 1197127248: {
                        v2 = jq.kent("kevo", keqe(int ), (int)42);
                        continue block30;
                    }
                    case 1990057555: {
                        v2 = jq.kent("kevq", keqe(int ), (int)43);
                        continue block30;
                    }
                }
                break;
            }
            var2_1 /* !! */  = jq.b;
            v3 /* !! */  = jq.sf;
            if (true) ** GOTO lbl29
            block31: while (true) {
                v3 /* !! */  = (long)(jq.kent("kevt", keqe(int ), (int)45) - jq.kent("kevs", keqe(int ), (int)44));
lbl29:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 197898621: {
                        break block31;
                    }
                    case 2115859841: {
                        continue block31;
                    }
                }
                break;
            }
            var1_2 = jq.a;
            if (var3) {
                throw null;
lbl37:
                // 6 sources

                return (boolean)jq.kent("kevv", keoa(int ), (int)60);
            }
            if (var1_2 || var1_2) ** GOTO lbl37
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = jq.sf - jq.kent("kevx", keqe(int ), (int)46)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == jq.kent("kevz", keoa(int ), (int)61)) break;
                v4 /* !! */  = (long)jq.kent("kewb", keoa(int ), (int)62);
            }
            var0_3 = jq.getInstance();
            if (var1_2 || var1_2) ** GOTO lbl37
            if (var0_3 == null) break block50;
            if (var1_2) ** GOTO lbl37
            v5 /* !! */  = jq.sf;
            if (true) ** GOTO lbl54
            block34: while (true) {
                v5 /* !! */  = (long)(v6 - jq.kent("kewe", keqe(int ), (int)47));
lbl54:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -72826252: {
                        v6 = jq.kent("kewg", keqe(int ), (int)48);
                        continue block34;
                    }
                    case 197898621: {
                        break block34;
                    }
                    case 424134422: {
                        v6 = jq.kent("kewh", keqe(int ), (int)49);
                        continue block34;
                    }
                }
                break;
            }
            if (!var0_3.state) break block50;
            if (var1_2) ** GOTO lbl37
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_2 = jq.sf - jq.kent("kewj", keqe(int ), (int)50)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v7 /* !! */  == jq.kent("kewl", keoa(int ), (int)63)) break;
                v7 /* !! */  = (long)jq.kent("kewn", keoa(int ), (int)64);
            }
            if (!var0_3.isNewHmi()) break block50;
            if (var1_2) ** GOTO lbl37
            v8 = jq.kent("kewp", keoa(int ), (int)65);
            if (var3) {
                throw null;
            }
            ** GOTO lbl84
        }
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_2 && !var1_2) ** break;
                ** continue;
                v8 = jq.kent("kewr", keoa(int ), (int)66);
lbl84:
                // 2 sources

                return (boolean)v8;
            }
lbl85:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)jq.kent("kews", keoa(int ), (int)67);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl94
            }
            case 1: {
                var2_1 /* !! */  = (int)jq.kent("kewt", keoa(int ), (int)68);
                if (!var3) ** GOTO lbl85
                throw null;
            }
lbl94:
            // 4 sources

            case 2: {
                var2_1 /* !! */  = (int)jq.kent("kewu", keoa(int ), (int)69);
                if (var3) {
                    throw null;
                }
            }
lbl98:
            // 4 sources

            case 3: {
                var2_1 /* !! */  = (int)jq.kent("kewv", keoa(int ), (int)70);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl103:
            // 3 sources

            case 4: {
                var2_1 /* !! */  = (int)jq.kent("keww", keoa(int ), (int)71);
                if (!var3) ** GOTO lbl94
                throw null;
            }
            case 5: {
                var2_1 /* !! */  = (int)jq.kent("kewx", keoa(int ), (int)72);
                if (!var3) ** GOTO lbl98
                throw null;
            }
            case 6: {
                var2_1 /* !! */  = (int)jq.kent("kewz", keoa(int ), (int)73);
                if (!var3) ** GOTO lbl94
                throw null;
            }
            case 7: {
                var2_1 /* !! */  = (int)jq.kent("kexb", keoa(int ), (int)74);
                if (!var3) break;
                throw null;
            }
            case 8: {
                var2_1 /* !! */  = (int)jq.kent("kexc", keoa(int ), (int)75);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl124:
            // 2 sources

            case 9: {
                var2_1 /* !! */  = (int)jq.kent("kexe", keoa(int ), (int)76);
                if (!var3) ** GOTO lbl103
                throw null;
            }
lbl128:
            // 2 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)jq.kent("kexh", keoa(int ), (int)77);
                    if (!var3) ** GOTO lbl103
                    throw null;
                }
            }
            case 11: 
        }
        var2_1 /* !! */  = (int)jq.kent("kexj", keoa(int ), (int)78);
        ** while (!var3)
lbl136:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean isSword(class_1799 var1_1) {
        block34: {
            while (true) {
                block35: {
                    if ((v0 /* !! */  = (cfr_temp_1 = jq.sf - jq.kent("khuo", keqe(int ), (int)289)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  != jq.kent("khup", keoa(int ), (int)1284)) break block35;
                    var4_2 = jq.c;
                    v1 /* !! */  = jq.sf;
                    if (true) ** GOTO lbl13
                }
                v0 /* !! */  = (long)jq.kent("khuq", keoa(int ), (int)1285);
            }
            block22: while (true) {
                v1 /* !! */  = (long)(v2 - jq.kent("khur", keqe(int ), (int)290));
lbl13:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -888074019: {
                        v2 = jq.kent("khus", keqe(int ), (int)291);
                        continue block22;
                    }
                    case 197898621: {
                        break block22;
                    }
                    case 1039136790: {
                        v2 = jq.kent("khut", keqe(int ), (int)292);
                        continue block22;
                    }
                }
                break;
            }
            var3_3 /* !! */  = jq.b;
            v3 /* !! */  = jq.sf;
            if (true) ** GOTO lbl27
            block23: while (true) {
                v3 /* !! */  = (long)(v4 - jq.kent("khuu", keqe(int ), (int)293));
lbl27:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -98764425: {
                        v4 = jq.kent("khuv", keqe(int ), (int)294);
                        continue block23;
                    }
                    case -22209443: {
                        v4 = jq.kent("khuw", keqe(int ), (int)295);
                        continue block23;
                    }
                    case 197898621: {
                        break block23;
                    }
                }
                break;
            }
            var2_4 = jq.a;
            if (var4_2) {
                throw null;
            }
            if (var2_4 != false) return (boolean)jq.kent("khux", keoa(int ), (int)1286);
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block24: do {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var2_4 != false) return (boolean)jq.kent("khux", keoa(int ), (int)1286);
                        v5 /* !! */  = jq.sf;
                        block25: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case -1433049242: {
                                    v6 = jq.kent("khuz", keqe(int ), (int)297);
                                    ** GOTO lbl56
                                }
                                case 197898621: {
                                    break block25;
                                }
                                case 1209107762: {
                                    v6 = jq.kent("khva", keqe(int ), (int)298);
lbl56:
                                    // 2 sources

                                    v5 /* !! */  = (long)(v6 - jq.kent("khuy", keqe(int ), (int)296));
                                    continue block25;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v7 /* !! */  = (cfr_temp_2 = jq.sf - jq.kent("khvb", keqe(int ), (int)299)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v7 /* !! */  == jq.kent("khvc", keoa(int ), (int)1287)) {
                                return var1_1.method_31573(class_3489.field_42611);
                            }
                            v7 /* !! */  = (long)jq.kent("khvd", keoa(int ), (int)1288);
                        }
                    }
                    case 0: {
                        ** break;
                    }
                    case 2: {
                        do {
                            var3_3 /* !! */  = (int)jq.kent("khvg", keoa(int ), (int)1291);
                        } while (!var4_2);
                        throw null;
                    }
                    case 3: {
                        break block34;
                    }
lbl74:
                    // 2 sources

                    while (true) {
                        var3_3 /* !! */  = (int)jq.kent("khve", keoa(int ), (int)1289);
                        cfr_temp_0 = 1;
                        if (!var4_2) continue block24;
                        throw null;
                    }
                    case 1: 
                }
                break;
            } while (true);
            var3_3 /* !! */  = (int)jq.kent("khvf", keoa(int ), (int)1290);
            if (var4_2) {
                throw null;
            }
        }
        var3_3 /* !! */  = (int)jq.kent("khvh", keoa(int ), (int)1292);
        ** while (!var4_2)
lbl88:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kilh() {
        jq.kenr[900] = -2017729645;
        jq.kenr[901] = 936959175;
        jq.kenr[902] = 0x664464B4;
        jq.kenr[903] = -1069046456;
        jq.kenr[904] = -1990130879;
        jq.kenr[905] = -1374908126;
        jq.kenr[906] = -1789455351;
        jq.kenr[907] = 965888233;
        jq.kenr[908] = -493953923;
        jq.kenr[909] = -1055626876;
        jq.kenr[910] = -1484617083;
        jq.kenr[911] = -246697015;
        jq.kenr[912] = -773833234;
        jq.kenr[913] = 1063769981;
        jq.kenr[914] = -1440271964;
        jq.kenr[915] = 1559284581;
        jq.kenr[916] = -1425276403;
        jq.kenr[917] = -1428029675;
        jq.kenr[918] = -227905837;
        jq.kenr[919] = -454575226;
        jq.kenr[920] = -1578124647;
        jq.kenr[921] = -92762965;
        jq.kenr[922] = 1690882995;
        jq.kenr[923] = 606843685;
        jq.kenr[924] = 755968914;
        jq.kenr[925] = 546670467;
        jq.kenr[926] = 1137250838;
        jq.kenr[927] = 621430857;
        jq.kenr[928] = -1277460188;
        jq.kenr[929] = -969456150;
        jq.kenr[930] = 951527783;
        jq.kenr[931] = 2015213825;
        jq.kenr[932] = 1960795464;
        jq.kenr[933] = 563529130;
        jq.kenr[934] = 298032196;
        jq.kenr[935] = -844202807;
        jq.kenr[936] = 1377510778;
        jq.kenr[937] = 172363644;
        jq.kenr[938] = 609923049;
        jq.kenr[939] = -312880449;
        jq.kenr[940] = 1085222400;
        jq.kenr[941] = -1581422777;
        jq.kenr[942] = -1924927294;
        jq.kenr[943] = -612216820;
        jq.kenr[944] = 447197973;
        jq.kenr[945] = 1600613569;
        jq.kenr[946] = 1515884756;
        jq.kenr[947] = 988451665;
        jq.kenr[948] = 1352185019;
        jq.kenr[949] = -1482067541;
        jq.kenr[950] = 2008240647;
        jq.kenr[951] = -2111203081;
        jq.kenr[952] = -1560926742;
        jq.kenr[953] = -1058625512;
        jq.kenr[954] = -1014166034;
        jq.kenr[955] = 1675783603;
        jq.kenr[956] = 1325582432;
        jq.kenr[957] = 1399989671;
        jq.kenr[958] = 1573266532;
        jq.kenr[959] = -834391733;
        jq.kenr[960] = 726973514;
        jq.kenr[961] = -293100878;
        jq.kenr[962] = 1658387727;
        jq.kenr[963] = 2093316544;
        jq.kenr[964] = 78601045;
        jq.kenr[965] = 2118388354;
        jq.kenr[966] = 1285536859;
        jq.kenr[967] = -1256016898;
        jq.kenr[968] = -674818457;
        jq.kenr[969] = 2122498077;
        jq.kenr[970] = 121263394;
        jq.kenr[971] = -2070496610;
        jq.kenr[972] = -2120514593;
        jq.kenr[973] = -105103110;
        jq.kenr[974] = 1823890575;
        jq.kenr[975] = 548484552;
        jq.kenr[976] = 166093030;
        jq.kenr[977] = 1165932423;
        jq.kenr[978] = 1110166176;
        jq.kenr[979] = 1574457173;
        jq.kenr[980] = -757998362;
        jq.kenr[981] = -1107022792;
        jq.kenr[982] = -2016990733;
        jq.kenr[983] = -1645084344;
        jq.kenr[984] = -908208509;
        jq.kenr[985] = 2137155900;
        jq.kenr[986] = -268717880;
        jq.kenr[987] = -1335373529;
        jq.kenr[988] = 1362893317;
        jq.kenr[989] = -312580301;
        jq.kenr[990] = -2025560894;
        jq.kenr[991] = 1077201078;
        jq.kenr[992] = -6420989;
        jq.kenr[993] = -1138614253;
        jq.kenr[994] = -1720668554;
        jq.kenr[995] = -380630395;
        jq.kenr[996] = -1883039180;
        jq.kenr[997] = 1015732262;
        jq.kenr[998] = 2091792739;
        jq.kenr[999] = -2131364486;
    }

    private static /* synthetic */ void kinh() {
        jq.kens[600] = -2440202;
        jq.kens[601] = -1693577708;
        jq.kens[602] = -1202349647;
        jq.kens[603] = -475847884;
        jq.kens[604] = 712970218;
        jq.kens[605] = -281294995;
        jq.kens[606] = -1249674928;
        jq.kens[607] = -650504410;
        jq.kens[608] = 669882117;
        jq.kens[609] = -1073023789;
        jq.kens[610] = 528303111;
        jq.kens[611] = -454137108;
        jq.kens[612] = 1388465127;
        jq.kens[613] = -643323088;
        jq.kens[614] = -1354943024;
        jq.kens[615] = -332316367;
        jq.kens[616] = -1235413664;
        jq.kens[617] = -1928638090;
        jq.kens[618] = -994142992;
        jq.kens[619] = -15281220;
        jq.kens[620] = -120981196;
        jq.kens[621] = 1123216920;
        jq.kens[622] = 1113777243;
        jq.kens[623] = -639451128;
        jq.kens[624] = -2135249122;
        jq.kens[625] = -521644101;
        jq.kens[626] = -779265962;
        jq.kens[627] = -2060187373;
        jq.kens[628] = -1185423337;
        jq.kens[629] = -220119763;
        jq.kens[630] = 1768845662;
        jq.kens[631] = 705618550;
        jq.kens[632] = -1253009961;
        jq.kens[633] = 1018312854;
        jq.kens[634] = 1815339336;
        jq.kens[635] = -61892427;
        jq.kens[636] = 1139973787;
        jq.kens[637] = -1883020820;
        jq.kens[638] = 2070879913;
        jq.kens[639] = 1794321112;
        jq.kens[640] = -1501632215;
        jq.kens[641] = 374805676;
        jq.kens[642] = 1959217783;
        jq.kens[643] = 2002217274;
        jq.kens[644] = -1785127663;
        jq.kens[645] = 1032510662;
        jq.kens[646] = -231650320;
        jq.kens[647] = 610119072;
        jq.kens[648] = -824052940;
        jq.kens[649] = -1119502632;
        jq.kens[650] = 1731413690;
        jq.kens[651] = -1451720563;
        jq.kens[652] = 1438651018;
        jq.kens[653] = 549867423;
        jq.kens[654] = 627494731;
        jq.kens[655] = 1566425043;
        jq.kens[656] = 1481864479;
        jq.kens[657] = -2034872663;
        jq.kens[658] = 2009039242;
        jq.kens[659] = -711189907;
        jq.kens[660] = -288646819;
        jq.kens[661] = -338642865;
        jq.kens[662] = -1001267786;
        jq.kens[663] = 1290532236;
        jq.kens[664] = -535231599;
        jq.kens[665] = 1115849442;
        jq.kens[666] = -1984917625;
        jq.kens[667] = 520163055;
        jq.kens[668] = 796316583;
        jq.kens[669] = 1539144484;
        jq.kens[670] = -978025582;
        jq.kens[671] = -1088196489;
        jq.kens[672] = 1792111416;
        jq.kens[673] = 1823994874;
        jq.kens[674] = 837185265;
        jq.kens[675] = -2077521670;
        jq.kens[676] = -1092902970;
        jq.kens[677] = -238338722;
        jq.kens[678] = -66671326;
        jq.kens[679] = -1847165354;
        jq.kens[680] = 2062767429;
        jq.kens[681] = 726537882;
        jq.kens[682] = -1852139473;
        jq.kens[683] = -89846583;
        jq.kens[684] = 1896635613;
        jq.kens[685] = 1164414898;
        jq.kens[686] = 2050277135;
        jq.kens[687] = 1829275520;
        jq.kens[688] = 82740206;
        jq.kens[689] = -357954015;
        jq.kens[690] = 2006949452;
        jq.kens[691] = -1220096403;
        jq.kens[692] = -1770930348;
        jq.kens[693] = 34433224;
        jq.kens[694] = 2070462181;
        jq.kens[695] = -2091430563;
        jq.kens[696] = -1941782805;
        jq.kens[697] = 1457147683;
        jq.kens[698] = -524001419;
        jq.kens[699] = -1408739255;
    }

    private static /* synthetic */ void kilw() {
        jq.kens[0] = -2020415721;
        jq.kens[1] = 810951289;
        jq.kens[2] = -100409345;
        jq.kens[3] = 1368513096;
        jq.kens[4] = -15142797;
        jq.kens[5] = -7211278;
        jq.kens[6] = -274968256;
        jq.kens[7] = 1547432035;
        jq.kens[8] = 1316044698;
        jq.kens[9] = -1087865847;
        jq.kens[10] = 1406360098;
        jq.kens[11] = -247011048;
        jq.kens[12] = -237900893;
        jq.kens[13] = 1931799195;
        jq.kens[14] = 587788460;
        jq.kens[15] = 986782035;
        jq.kens[16] = 1582861689;
        jq.kens[17] = -1673471318;
        jq.kens[18] = -1766102069;
        jq.kens[19] = 1869451071;
        jq.kens[20] = 1463395481;
        jq.kens[21] = -297123107;
        jq.kens[22] = -1989705794;
        jq.kens[23] = -109813544;
        jq.kens[24] = -1711602663;
        jq.kens[25] = 447052586;
        jq.kens[26] = 339811508;
        jq.kens[27] = 770756543;
        jq.kens[28] = -1787196437;
        jq.kens[29] = -1528809775;
        jq.kens[30] = 591991730;
        jq.kens[31] = 781575475;
        jq.kens[32] = -1671137933;
        jq.kens[33] = -2100664423;
        jq.kens[34] = -1827415277;
        jq.kens[35] = -1879654863;
        jq.kens[36] = 1756840004;
        jq.kens[37] = -1439868880;
        jq.kens[38] = 87400371;
        jq.kens[39] = -177795285;
        jq.kens[40] = 83811812;
        jq.kens[41] = -1320503951;
        jq.kens[42] = -797953340;
        jq.kens[43] = 1296064358;
        jq.kens[44] = -949975837;
        jq.kens[45] = -1974891808;
        jq.kens[46] = 267558818;
        jq.kens[47] = -1629066892;
        jq.kens[48] = -1661954229;
        jq.kens[49] = 1902849964;
        jq.kens[50] = 1710245357;
        jq.kens[51] = -154444584;
        jq.kens[52] = 289526760;
        jq.kens[53] = 189953262;
        jq.kens[54] = 2050375720;
        jq.kens[55] = 486098908;
        jq.kens[56] = -920140712;
        jq.kens[57] = -2139604564;
        jq.kens[58] = 1588621924;
        jq.kens[59] = 2130071250;
        jq.kens[60] = -961050773;
        jq.kens[61] = -986764558;
        jq.kens[62] = -1558536785;
        jq.kens[63] = 1395209441;
        jq.kens[64] = -1071115692;
        jq.kens[65] = -1246602453;
        jq.kens[66] = 1291417080;
        jq.kens[67] = 347513708;
        jq.kens[68] = 426045080;
        jq.kens[69] = -870295557;
        jq.kens[70] = 2146918527;
        jq.kens[71] = 1769311704;
        jq.kens[72] = 1688720683;
        jq.kens[73] = 359702493;
        jq.kens[74] = 2026371133;
        jq.kens[75] = -1010403461;
        jq.kens[76] = -1031472409;
        jq.kens[77] = 1369307550;
        jq.kens[78] = 1560470952;
        jq.kens[79] = 1308340596;
        jq.kens[80] = 479089358;
        jq.kens[81] = -1191298958;
        jq.kens[82] = 13732479;
        jq.kens[83] = -467016589;
        jq.kens[84] = 122258810;
        jq.kens[85] = -165018136;
        jq.kens[86] = -46925743;
        jq.kens[87] = -80617092;
        jq.kens[88] = -1892324121;
        jq.kens[89] = -1576635207;
        jq.kens[90] = 759602009;
        jq.kens[91] = -1318779760;
        jq.kens[92] = 356407098;
        jq.kens[93] = -1542234451;
        jq.kens[94] = -1447939386;
        jq.kens[95] = -761548171;
        jq.kens[96] = -1933184803;
        jq.kens[97] = 1473845842;
        jq.kens[98] = -863818779;
        jq.kens[99] = 837076467;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$1() {
        v0 /* !! */  = jq.sf;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - jq.kent("kiix", keqe(int ), (int)471));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1007676730: {
                    v1 = jq.kent("kiiy", keqe(int ), (int)472);
                    continue block16;
                }
                case 35387521: {
                    v1 = jq.kent("kiiz", keqe(int ), (int)473);
                    continue block16;
                }
                case 197898621: {
                    break block16;
                }
                case 376233337: {
                    v1 = jq.kent("kija", keqe(int ), (int)474);
                    continue block16;
                }
            }
            break;
        }
        var3_1 = jq.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = jq.sf - jq.kent("kijb", keqe(int ), (int)475)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jq.kent("kijc", keoa(int ), (int)1475)) break;
            v2 /* !! */  = (long)jq.kent("kijd", keoa(int ), (int)1476);
        }
        var2_2 /* !! */  = jq.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = jq.sf - jq.kent("kije", keqe(int ), (int)476)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == jq.kent("kijf", keoa(int ), (int)1477)) break;
            v3 /* !! */  = (long)jq.kent("kijg", keoa(int ), (int)1478);
        }
        var1_3 = jq.a;
        if (var3_1) {
            throw null;
lbl34:
            // 4 sources

            return null;
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl34
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = jq.sf - jq.kent("kijh", keqe(int ), (int)477)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == jq.kent("kiji", keoa(int ), (int)1479)) break;
                    v4 /* !! */  = (long)jq.kent("kijj", keoa(int ), (int)1480);
                }
                if (this.isNewHmi()) ** GOTO lbl53
                if (var1_3) ** GOTO lbl34
                v5 = jq.kent("kijk", keoa(int ), (int)1481);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl56
lbl53:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v5 = jq.kent("kijl", keoa(int ), (int)1482);
lbl56:
                // 2 sources

                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = jq.sf - jq.kent("kijm", keqe(int ), (int)478)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == jq.kent("kijn", keoa(int ), (int)1483)) break;
                    v6 /* !! */  = (long)jq.kent("kijo", keoa(int ), (int)1484);
                }
                return (boolean)v5;
            }
lbl63:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)jq.kent("kijp", keoa(int ), (int)1485);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)jq.kent("kijq", keoa(int ), (int)1486);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)jq.kent("kijr", keoa(int ), (int)1487);
                if (!var3_1) ** GOTO lbl63
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)jq.kent("kijs", keoa(int ), (int)1488);
                if (!var3_1) break;
                throw null;
            }
lbl81:
            // 2 sources

            case 4: {
                do {
                    var2_2 /* !! */  = (int)jq.kent("kijt", keoa(int ), (int)1489);
                } while (!var3_1);
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)jq.kent("kiju", keoa(int ), (int)1490);
                if (!var3_1) ** GOTO lbl81
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)jq.kent("kijv", keoa(int ), (int)1491);
                if (!var3_1) break;
                throw null;
            }
            case 7: 
        }
        do {
            var2_2 /* !! */  = (int)jq.kent("kijw", keoa(int ), (int)1492);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static jq getInstance() {
        v0 /* !! */  = jq.sf;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(jq.kent("keqj", keqe(int ), (int)1) - jq.kent("keqh", keqe(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -195266851: {
                    continue block24;
                }
                case 197898621: {
                    break block24;
                }
            }
            break;
        }
        var2 = jq.c;
        v1 /* !! */  = jq.sf;
        if (true) ** GOTO lbl15
        block25: while (true) {
            v1 /* !! */  = (long)(v2 - jq.kent("keql", keqe(int ), (int)2));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2129366387: {
                    v2 = jq.kent("keqm", keqe(int ), (int)3);
                    continue block25;
                }
                case -1018829100: {
                    v2 = jq.kent("keqn", keqe(int ), (int)4);
                    continue block25;
                }
                case 197898621: {
                    break block25;
                }
            }
            break;
        }
        var1_1 /* !! */  = jq.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = jq.sf;
                if (true) ** GOTO lbl32
                block26: while (true) {
                    v3 /* !! */  = (long)(v4 - jq.kent("keqp", keqe(int ), (int)5));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 197898621: {
                            break block26;
                        }
                        case 307439107: {
                            v4 = jq.kent("keqr", keqe(int ), (int)6);
                            continue block26;
                        }
                        case 619103968: {
                            v4 = jq.kent("keqs", keqe(int ), (int)7);
                            continue block26;
                        }
                    }
                    break;
                }
                var0_2 = jq.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                v5 /* !! */  = jq.sf;
                if (true) ** GOTO lbl51
                block28: while (true) {
                    v5 /* !! */  = (long)(jq.kent("keqw", keqe(int ), (int)9) - jq.kent("keqv", keqe(int ), (int)8));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 197898621: {
                            break block28;
                        }
                        case 1128106502: {
                            continue block28;
                        }
                    }
                    break;
                }
                return nj.get(jq.class);
            }
            case 0: {
                do {
                    var1_1 /* !! */  = (int)jq.kent("keqy", keoa(int ), (int)31);
                } while (!var2);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)jq.kent("kera", keoa(int ), (int)32);
                    if (!var2) break block9;
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)jq.kent("kerb", keoa(int ), (int)33);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)jq.kent("kerd", keoa(int ), (int)34);
        ** while (!var2)
lbl74:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kinc() {
        jq.kens[500] = 1925229166;
        jq.kens[501] = -302547445;
        jq.kens[502] = 1399560639;
        jq.kens[503] = -1851997360;
        jq.kens[504] = 1505738651;
        jq.kens[505] = 1678083016;
        jq.kens[506] = 2045769866;
        jq.kens[507] = 1573223154;
        jq.kens[508] = 1871939360;
        jq.kens[509] = 2035686836;
        jq.kens[510] = 1373306714;
        jq.kens[511] = -763032943;
        jq.kens[512] = 1148506187;
        jq.kens[513] = 1122281085;
        jq.kens[514] = 774289568;
        jq.kens[515] = -1377273183;
        jq.kens[516] = -634931997;
        jq.kens[517] = 1390255087;
        jq.kens[518] = 546116752;
        jq.kens[519] = 1281672831;
        jq.kens[520] = 2104970114;
        jq.kens[521] = 1543846399;
        jq.kens[522] = -2120362168;
        jq.kens[523] = 257006021;
        jq.kens[524] = 268549206;
        jq.kens[525] = 351562304;
        jq.kens[526] = -943536841;
        jq.kens[527] = 1304563422;
        jq.kens[528] = 1479171622;
        jq.kens[529] = -1001828;
        jq.kens[530] = 2016391612;
        jq.kens[531] = 1326596828;
        jq.kens[532] = 27402131;
        jq.kens[533] = 910439231;
        jq.kens[534] = -59616243;
        jq.kens[535] = 1822020232;
        jq.kens[536] = -113852256;
        jq.kens[537] = 718640086;
        jq.kens[538] = -1003485606;
        jq.kens[539] = 1449170106;
        jq.kens[540] = -1432510348;
        jq.kens[541] = -686825479;
        jq.kens[542] = -2099391695;
        jq.kens[543] = -961272341;
        jq.kens[544] = -688446627;
        jq.kens[545] = -1574143260;
        jq.kens[546] = 1596028195;
        jq.kens[547] = -1219356408;
        jq.kens[548] = -82578152;
        jq.kens[549] = 887714413;
        jq.kens[550] = 1129327784;
        jq.kens[551] = -2117869176;
        jq.kens[552] = -850023601;
        jq.kens[553] = 769739058;
        jq.kens[554] = 107647039;
        jq.kens[555] = -1463366976;
        jq.kens[556] = 1083739234;
        jq.kens[557] = -1671909359;
        jq.kens[558] = 423803609;
        jq.kens[559] = 1533775989;
        jq.kens[560] = -1137934742;
        jq.kens[561] = 1269424860;
        jq.kens[562] = -1502839689;
        jq.kens[563] = -381784909;
        jq.kens[564] = 616522362;
        jq.kens[565] = 935107661;
        jq.kens[566] = 1802334481;
        jq.kens[567] = 1115795164;
        jq.kens[568] = -1216651225;
        jq.kens[569] = 645190967;
        jq.kens[570] = -392355398;
        jq.kens[571] = 2106732547;
        jq.kens[572] = 733996362;
        jq.kens[573] = -101596418;
        jq.kens[574] = 696488960;
        jq.kens[575] = 70137978;
        jq.kens[576] = -1459331580;
        jq.kens[577] = 790219081;
        jq.kens[578] = 1267133336;
        jq.kens[579] = 634170025;
        jq.kens[580] = -1176508159;
        jq.kens[581] = 1787253493;
        jq.kens[582] = -492895685;
        jq.kens[583] = 280725281;
        jq.kens[584] = -484340735;
        jq.kens[585] = 1857406540;
        jq.kens[586] = 1708136906;
        jq.kens[587] = -1348854288;
        jq.kens[588] = 177777812;
        jq.kens[589] = 1217202294;
        jq.kens[590] = 1167854776;
        jq.kens[591] = 1026851126;
        jq.kens[592] = -1931095772;
        jq.kens[593] = -1906490321;
        jq.kens[594] = 933994664;
        jq.kens[595] = 51055864;
        jq.kens[596] = 816311864;
        jq.kens[597] = -800856134;
        jq.kens[598] = -2098733228;
        jq.kens[599] = 808065075;
    }

    private static /* synthetic */ void kipn() {
        jq.keqf[100] = 4003902688725300175L;
        jq.keqf[101] = 7979177560335262794L;
        jq.keqf[102] = 8158550070022243862L;
        jq.keqf[103] = 7058451211921757483L;
        jq.keqf[104] = -6532812920003648609L;
        jq.keqf[105] = 5996768578881889885L;
        jq.keqf[106] = -6167014537255447565L;
        jq.keqf[107] = 7458850202008332654L;
        jq.keqf[108] = 3431672704595452336L;
        jq.keqf[109] = -7021549462192157583L;
        jq.keqf[110] = 632378174798491935L;
        jq.keqf[111] = 5312901113133248451L;
        jq.keqf[112] = 8146413284461111501L;
        jq.keqf[113] = -5866203074439633526L;
        jq.keqf[114] = 7801136491721953734L;
        jq.keqf[115] = -9204594050162941595L;
        jq.keqf[116] = 2331822360686240588L;
        jq.keqf[117] = -81108569146589025L;
        jq.keqf[118] = -5451784354003136774L;
        jq.keqf[119] = 5898899751149164109L;
        jq.keqf[120] = 2074701457921664310L;
        jq.keqf[121] = 1759371815905878473L;
        jq.keqf[122] = 14450437701465541L;
        jq.keqf[123] = -8165784190821194255L;
        jq.keqf[124] = -8134747235040137274L;
        jq.keqf[125] = -6947147787773025911L;
        jq.keqf[126] = -4202698417714459000L;
        jq.keqf[127] = -6092857548973591970L;
        jq.keqf[128] = -7305818437709352694L;
        jq.keqf[129] = -5584810825059810781L;
        jq.keqf[130] = 8572421139691360864L;
        jq.keqf[131] = -8998461160003654535L;
        jq.keqf[132] = 5877891067518232123L;
        jq.keqf[133] = -1871806664913558288L;
        jq.keqf[134] = -5884047762955728592L;
        jq.keqf[135] = 7897472793806143524L;
        jq.keqf[136] = -9168538069578672934L;
        jq.keqf[137] = -3147271121055697715L;
        jq.keqf[138] = 832940152962450113L;
        jq.keqf[139] = -44864961833340160L;
        jq.keqf[140] = 886791689481103989L;
        jq.keqf[141] = -8887722722029859751L;
        jq.keqf[142] = 3169221412817520101L;
        jq.keqf[143] = 3603431920072104983L;
        jq.keqf[144] = 4346228683830588216L;
        jq.keqf[145] = -4120220027207777994L;
        jq.keqf[146] = 2380446632865010097L;
        jq.keqf[147] = -6815389936096157149L;
        jq.keqf[148] = -112109866189017648L;
        jq.keqf[149] = 4975075862078524871L;
        jq.keqf[150] = -6141486002176588754L;
        jq.keqf[151] = 9084868345187992148L;
        jq.keqf[152] = -6121436703440883445L;
        jq.keqf[153] = 5829762054208923451L;
        jq.keqf[154] = 7525337903463675082L;
        jq.keqf[155] = 2086397391759560572L;
        jq.keqf[156] = 7278815192132502970L;
        jq.keqf[157] = -7513655557055279165L;
        jq.keqf[158] = -1125753740027372556L;
        jq.keqf[159] = -165072515356240962L;
        jq.keqf[160] = 7320897616822673635L;
        jq.keqf[161] = 6067361180448473591L;
        jq.keqf[162] = -3515252915034332844L;
        jq.keqf[163] = 5622947639732754241L;
        jq.keqf[164] = 4791953719656965601L;
        jq.keqf[165] = 9098760212852029496L;
        jq.keqf[166] = 4542659015814152378L;
        jq.keqf[167] = -7955128709806693476L;
        jq.keqf[168] = 8403045908943564827L;
        jq.keqf[169] = 4106629357243163084L;
        jq.keqf[170] = 144619559345238074L;
        jq.keqf[171] = -5133360494426121391L;
        jq.keqf[172] = -4399971570752934912L;
        jq.keqf[173] = -1038800364399743294L;
        jq.keqf[174] = -1253040065908758953L;
        jq.keqf[175] = -4260534972419853741L;
        jq.keqf[176] = 4073296908840134155L;
        jq.keqf[177] = 7841960279226972925L;
        jq.keqf[178] = -6958146616893116022L;
        jq.keqf[179] = -4040059306206794217L;
        jq.keqf[180] = -5695171276260998111L;
        jq.keqf[181] = -8013993580623856434L;
        jq.keqf[182] = -6261391876745111173L;
        jq.keqf[183] = 2060610265787309259L;
        jq.keqf[184] = -2198739187203677924L;
        jq.keqf[185] = -3547618183192847895L;
        jq.keqf[186] = -4059290990391560206L;
        jq.keqf[187] = -6596847400984683213L;
        jq.keqf[188] = -2176443561418439318L;
        jq.keqf[189] = -3991223245248385481L;
        jq.keqf[190] = 4198378038197984597L;
        jq.keqf[191] = 6642703960983302572L;
        jq.keqf[192] = -1525127618111683466L;
        jq.keqf[193] = -5054717726242663766L;
        jq.keqf[194] = -8692041380018705444L;
        jq.keqf[195] = 7579952567192162772L;
        jq.keqf[196] = 2835973404799903791L;
        jq.keqf[197] = 4700528956342249348L;
        jq.keqf[198] = 3709659117550014982L;
        jq.keqf[199] = -7463428512371561425L;
    }

    private static /* synthetic */ void kinu() {
        jq.kens[900] = -2017729664;
        jq.kens[901] = 936959182;
        jq.kens[902] = 1715758234;
        jq.kens[903] = -1069046505;
        jq.kens[904] = -1990130875;
        jq.kens[905] = -1374908154;
        jq.kens[906] = -1789455256;
        jq.kens[907] = 965888205;
        jq.kens[908] = -493954012;
        jq.kens[909] = -1055626871;
        jq.kens[910] = -1484617045;
        jq.kens[911] = -246697079;
        jq.kens[912] = -773833295;
        jq.kens[913] = 1063769895;
        jq.kens[914] = -1440271886;
        jq.kens[915] = 1559284588;
        jq.kens[916] = -1425276326;
        jq.kens[917] = -1428029667;
        jq.kens[918] = -227905838;
        jq.kens[919] = -454575132;
        jq.kens[920] = -1578124597;
        jq.kens[921] = -92762966;
        jq.kens[922] = 1690883050;
        jq.kens[923] = 606843748;
        jq.kens[924] = 755968914;
        jq.kens[925] = 546670561;
        jq.kens[926] = 1137250849;
        jq.kens[927] = 621430871;
        jq.kens[928] = -1277460218;
        jq.kens[929] = -969456192;
        jq.kens[930] = 951527729;
        jq.kens[931] = 2015213905;
        jq.kens[932] = 1960795493;
        jq.kens[933] = 563529090;
        jq.kens[934] = 298032233;
        jq.kens[935] = -844202873;
        jq.kens[936] = 1377510716;
        jq.kens[937] = 172363569;
        jq.kens[938] = 609922990;
        jq.kens[939] = -312880511;
        jq.kens[940] = 1085222411;
        jq.kens[941] = -1581422722;
        jq.kens[942] = -1924927294;
        jq.kens[943] = -612216819;
        jq.kens[944] = 447197992;
        jq.kens[945] = 1600613588;
        jq.kens[946] = 1515884744;
        jq.kens[947] = 988451702;
        jq.kens[948] = 1352185059;
        jq.kens[949] = -1482067542;
        jq.kens[950] = 2008240647;
        jq.kens[951] = -2111203082;
        jq.kens[952] = -1560926742;
        jq.kens[953] = 2137434136;
        jq.kens[954] = 2081230318;
        jq.kens[955] = 598434408;
        jq.kens[956] = 1928792815;
        jq.kens[957] = 1850864301;
        jq.kens[958] = -491448489;
        jq.kens[959] = -219683263;
        jq.kens[960] = 379089031;
        jq.kens[961] = 1397452415;
        jq.kens[962] = 601423119;
        jq.kens[963] = -1113228864;
        jq.kens[964] = -985703595;
        jq.kens[965] = 1011092098;
        jq.kens[966] = 1943236758;
        jq.kens[967] = -1950668188;
        jq.kens[968] = 1757877863;
        jq.kens[969] = 1072873501;
        jq.kens[970] = -962964190;
        jq.kens[971] = 1176156830;
        jq.kens[972] = -1011121185;
        jq.kens[973] = -1202962182;
        jq.kens[974] = 1380989673;
        jq.kens[975] = -1640942136;
        jq.kens[976] = -1219144747;
        jq.kens[977] = -93901283;
        jq.kens[978] = 56347296;
        jq.kens[979] = 472403797;
        jq.kens[980] = -322419332;
        jq.kens[981] = 8662072;
        jq.kens[982] = -1182014146;
        jq.kens[983] = -595459768;
        jq.kens[984] = 198301315;
        jq.kens[985] = 1049782588;
        jq.kens[986] = 1358396421;
        jq.kens[987] = 254483946;
        jq.kens[988] = -294058819;
        jq.kens[989] = -1375836365;
        jq.kens[990] = 1186227394;
        jq.kens[991] = 45664438;
        jq.kens[992] = -1110047229;
        jq.kens[993] = -1138614196;
        jq.kens[994] = -1720668590;
        jq.kens[995] = -380630376;
        jq.kens[996] = -1883039143;
        jq.kens[997] = 1015732279;
        jq.kens[998] = 2091792744;
        jq.kens[999] = -2131364522;
    }

    private static /* synthetic */ void kiqu() {
        jq.keqf[400] = -1226900508060354270L;
        jq.keqf[401] = 5464767763671223933L;
        jq.keqf[402] = 7801578671969718740L;
        jq.keqf[403] = 2377819865144855550L;
        jq.keqf[404] = -8281737018615196604L;
        jq.keqf[405] = -1548405874139689518L;
        jq.keqf[406] = 5468848985841260552L;
        jq.keqf[407] = -463911878279382271L;
        jq.keqf[408] = 3698244354160917894L;
        jq.keqf[409] = -5094007781448191709L;
        jq.keqf[410] = -7027898926884353147L;
        jq.keqf[411] = 8641660219446551193L;
        jq.keqf[412] = 8577897675233115099L;
        jq.keqf[413] = -5808997372380293840L;
        jq.keqf[414] = 6627070073116364786L;
        jq.keqf[415] = 4065144466416904996L;
        jq.keqf[416] = 5512471473741544314L;
        jq.keqf[417] = -3959372318662133713L;
        jq.keqf[418] = -37343808334918106L;
        jq.keqf[419] = -3151125575851646527L;
        jq.keqf[420] = 7986553105743279619L;
        jq.keqf[421] = 7505622621143739434L;
        jq.keqf[422] = -836694456783567928L;
        jq.keqf[423] = -4158963775977074497L;
        jq.keqf[424] = -2010420146711635053L;
        jq.keqf[425] = 1938278372667036167L;
        jq.keqf[426] = -503396676182839496L;
        jq.keqf[427] = 7396403784866880301L;
        jq.keqf[428] = -6134349549423458241L;
        jq.keqf[429] = -738317193798409266L;
        jq.keqf[430] = -7928570239158503598L;
        jq.keqf[431] = 7618231386950046225L;
        jq.keqf[432] = 2350351592394064709L;
        jq.keqf[433] = -8146732810908635147L;
        jq.keqf[434] = -4335959650197455281L;
        jq.keqf[435] = 3813635172058974459L;
        jq.keqf[436] = 2875366243799038941L;
        jq.keqf[437] = -1934822751495609589L;
        jq.keqf[438] = -3198646147534298660L;
        jq.keqf[439] = -7019585484202735370L;
        jq.keqf[440] = 1491251370444327723L;
        jq.keqf[441] = 4068121798052908113L;
        jq.keqf[442] = 7175026690377719141L;
        jq.keqf[443] = 1363188628156323276L;
        jq.keqf[444] = -3555985906413763220L;
        jq.keqf[445] = 6887845119562871763L;
        jq.keqf[446] = -4096213777678839227L;
        jq.keqf[447] = -2440061667643230968L;
        jq.keqf[448] = 7662874235284355646L;
        jq.keqf[449] = 1562581824475434043L;
        jq.keqf[450] = 5139108940926721815L;
        jq.keqf[451] = 1409533988849324923L;
        jq.keqf[452] = 1752469669264038941L;
        jq.keqf[453] = -7610285585658435736L;
        jq.keqf[454] = 3392843976055096010L;
        jq.keqf[455] = 3115225691154551482L;
        jq.keqf[456] = 1870952696971061794L;
        jq.keqf[457] = -4334223682265915025L;
        jq.keqf[458] = -8668387201802292690L;
        jq.keqf[459] = 9007157466980738963L;
        jq.keqf[460] = 555557756685958270L;
        jq.keqf[461] = 1734885119353818848L;
        jq.keqf[462] = -5845578564101464439L;
        jq.keqf[463] = 8348367408314456530L;
        jq.keqf[464] = 6100026190664828221L;
        jq.keqf[465] = 8476442469423539239L;
        jq.keqf[466] = -6979872246135359727L;
        jq.keqf[467] = -4229990304559963823L;
        jq.keqf[468] = -5543949931682808857L;
        jq.keqf[469] = 5552462049858193965L;
        jq.keqf[470] = -6773046770765649360L;
        jq.keqf[471] = -7876027022970353824L;
        jq.keqf[472] = 1280531203552852974L;
        jq.keqf[473] = -4095120938604077758L;
        jq.keqf[474] = -8898849314925429569L;
        jq.keqf[475] = 6946270062478179039L;
        jq.keqf[476] = -6605691649181692646L;
        jq.keqf[477] = 4584283155837773537L;
        jq.keqf[478] = 3974018664412888307L;
        jq.keqf[479] = -3868245704510052394L;
        jq.keqf[480] = 5563566841299727454L;
        jq.keqf[481] = 1662934358109630080L;
        jq.keqf[482] = 9014564553652397999L;
        jq.keqf[483] = 8925700490146619176L;
        jq.keqf[484] = -8295827702409175742L;
        jq.keqf[485] = -989493963464992657L;
        jq.keqf[486] = 2322838518940092552L;
        jq.keqf[487] = 1002133068218973826L;
        jq.keqf[488] = 5574101585345029536L;
    }

    private static /* synthetic */ double kffx(int n2) {
        return Double.longBitsToDouble(keqf[n2] ^ keqg[n2]);
    }

    private static /* synthetic */ long keqe(int n2) {
        return keqf[n2] ^ keqg[n2];
    }
}

