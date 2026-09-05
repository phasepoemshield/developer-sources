/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1802
 *  net.minecraft.class_2596
 *  net.minecraft.class_2848
 *  net.minecraft.class_2848$class_2849
 *  net.minecraft.class_2886
 *  net.minecraft.class_3532
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1802;
import net.minecraft.class_2596;
import net.minecraft.class_2848;
import net.minecraft.class_2886;
import net.minecraft.class_3532;
import ruhack.phobia.aw;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.nj;
import ruhack.phobia.nn;
import ruhack.phobia.os;
import ruhack.phobia.ot;
import ruhack.phobia.ov;
import ruhack.phobia.pn;
import ruhack.phobia.pr;
import ruhack.phobia.v;

public class fu
extends ds {
    private static long[] jpuw;
    private final kg speedY;
    private final kf mode;
    private static long[] jpux;
    private static int[] jpvh;
    public static final int b;
    public static final boolean a;
    private static int[] jpvf;
    public static final boolean c;
    protected static final long ru = -3375799637405872914L;
    private pr timer;
    private final kg speedXZ;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleFunTimeMode() {
        block91: {
            var15_1 = fu.c;
            var14_2 /* !! */  = fu.b;
            var13_3 = fu.a;
            if (var15_1) {
                throw null;
lbl6:
                // 26 sources

                return;
            }
            if (var13_3 || var13_3) ** GOTO lbl6
            if (fu.mc.field_1724 != null) break block91;
            if (var13_3) ** GOTO lbl6
            return;
        }
        if (var13_3 || var13_3) ** GOTO lbl6
        fu.mc.field_1724.field_3944.method_52787((class_2596)new class_2886(class_1268.field_5808, (int)fu.jpuz("jqis", jpvd(int ), (int)103), fu.mc.field_1724.method_36454(), fu.mc.field_1724.method_36455()));
        if (var13_3 || var13_3) ** GOTO lbl6
        fu.mc.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)fu.mc.field_1724, class_2848.class_2849.field_12982));
        if (var13_3 || var13_3) ** GOTO lbl6
        fu.mc.field_1724.field_3944.method_52787((class_2596)new class_2886(class_1268.field_5808, (int)fu.jpuz("jqiw", jpvd(int ), (int)104), fu.mc.field_1724.method_36454(), fu.mc.field_1724.method_36455()));
        if (var13_3 || var13_3) ** GOTO lbl6
        var1_4 = fu.mc.field_1724.method_36454();
        if (var13_3 || var13_3) ** GOTO lbl6
        var2_5 = (double)this.speedXZ.getValue() / fu.jpuz("jqiz", jpyv(int ), (int)9);
        if (var13_3 || var13_3) ** GOTO lbl6
        var4_6 = (double)this.speedY.getValue() / fu.jpuz("jqjb", jpyv(int ), (int)10);
        if (var13_3 || var13_3) ** GOTO lbl6
        var6_7 = fu.mc.field_1724.field_6250;
        if (var13_3 || var13_3) ** GOTO lbl6
        var7_8 = fu.mc.field_1724.field_6212;
        if (var13_3) ** GOTO lbl6
        if (var14_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var14_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var13_3) ** GOTO lbl6
                if (var6_7 != 0.0f) ** GOTO lbl38
                if (var13_3) ** GOTO lbl6
                if (var7_8 == 0.0f) ** GOTO lbl47
                if (var13_3) ** GOTO lbl6
lbl38:
                // 2 sources

                if (var13_3 || var13_3) ** GOTO lbl6
                var8_9 = var1_4 * fu.jpuz("jqjg", jpxb(int ), (int)105);
                if (var13_3 || var13_3) ** GOTO lbl6
                var9_10 = (double)(-class_3532.method_15374((double)var8_9)) * var2_5 * (double)var6_7 + (double)class_3532.method_15362((double)var8_9) * var2_5 * (double)var7_8;
                if (var13_3 || var13_3) ** GOTO lbl6
                var11_11 = (double)class_3532.method_15362((double)var8_9) * var2_5 * (double)var6_7 + (double)class_3532.method_15374((double)var8_9) * var2_5 * (double)var7_8;
                if (var13_3 || var13_3) ** GOTO lbl6
                fu.mc.field_1724.method_18800(var9_10, fu.mc.field_1724.method_18798().field_1351, var11_11);
                if (var13_3) ** GOTO lbl6
lbl47:
                // 2 sources

                if (var13_3 || var13_3) ** GOTO lbl6
                if (!fu.mc.field_1690.field_1903.method_1434()) ** GOTO lbl55
                if (var13_3 || var13_3) ** GOTO lbl6
                fu.mc.field_1724.method_18800(fu.mc.field_1724.method_18798().field_1352, var4_6, fu.mc.field_1724.method_18798().field_1350);
                if (var13_3) ** GOTO lbl6
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl60
lbl55:
                // 1 sources

                if (var13_3 || var13_3) ** GOTO lbl6
                if (!fu.mc.field_1690.field_1832.method_1434()) ** GOTO lbl60
                if (var13_3 || var13_3) ** GOTO lbl6
                fu.mc.field_1724.method_18800(fu.mc.field_1724.method_18798().field_1352, -var4_6, fu.mc.field_1724.method_18798().field_1350);
                if (var13_3) ** GOTO lbl6
lbl60:
                // 3 sources

                if (!var13_3 && !var13_3) ** break;
                ** continue;
                return;
            }
lbl63:
            // 2 sources

            case 0: {
                var14_2 /* !! */  = (int)fu.jpuz("jqju", jpvd(int ), (int)106);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl68:
            // 4 sources

            case 1: {
                var14_2 /* !! */  = (int)fu.jpuz("jqjw", jpvd(int ), (int)107);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl106
            }
lbl73:
            // 3 sources

            case 2: {
                var14_2 /* !! */  = (int)fu.jpuz("jqjz", jpvd(int ), (int)108);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl78:
            // 2 sources

            case 3: {
                var14_2 /* !! */  = (int)fu.jpuz("jqkb", jpvd(int ), (int)109);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl83:
            // 2 sources

            case 4: {
                var14_2 /* !! */  = (int)fu.jpuz("jqkc", jpvd(int ), (int)110);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl139
            }
            case 5: {
                var14_2 /* !! */  = (int)fu.jpuz("jqkd", jpvd(int ), (int)111);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl93:
            // 3 sources

            case 6: {
                var14_2 /* !! */  = (int)fu.jpuz("jqke", jpvd(int ), (int)112);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl98:
            // 2 sources

            case 7: {
                var14_2 /* !! */  = (int)fu.jpuz("jqkg", jpvd(int ), (int)113);
                if (!var15_1) ** GOTO lbl78
                throw null;
            }
            case 8: {
                var14_2 /* !! */  = (int)fu.jpuz("jqki", jpvd(int ), (int)114);
                if (var15_1) {
                    throw null;
                }
            }
lbl106:
            // 6 sources

            case 9: {
                var14_2 /* !! */  = (int)fu.jpuz("jqkk", jpvd(int ), (int)115);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl111:
            // 2 sources

            case 10: {
                var14_2 /* !! */  = (int)fu.jpuz("jqkm", jpvd(int ), (int)116);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 11: {
                var14_2 /* !! */  = (int)fu.jpuz("jqko", jpvd(int ), (int)117);
                if (!var15_1) ** GOTO lbl106
                throw null;
            }
lbl120:
            // 2 sources

            case 12: {
                var14_2 /* !! */  = (int)fu.jpuz("jqkq", jpvd(int ), (int)118);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 13: {
                var14_2 /* !! */  = (int)fu.jpuz("jqks", jpvd(int ), (int)119);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl130:
            // 2 sources

            case 14: {
                var14_2 /* !! */  = (int)fu.jpuz("jqku", jpvd(int ), (int)120);
                if (!var15_1) ** GOTO lbl73
                throw null;
            }
lbl134:
            // 2 sources

            case 15: {
                var14_2 /* !! */  = (int)fu.jpuz("jqkw", jpvd(int ), (int)121);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl139:
            // 3 sources

            case 16: {
                var14_2 /* !! */  = (int)fu.jpuz("jqkx", jpvd(int ), (int)122);
                if (!var15_1) ** GOTO lbl68
                throw null;
            }
            case 17: {
                var14_2 /* !! */  = (int)fu.jpuz("jqkz", jpvd(int ), (int)123);
                if (!var15_1) ** GOTO lbl106
                throw null;
            }
            case 18: {
                var14_2 /* !! */  = (int)fu.jpuz("jqlb", jpvd(int ), (int)124);
                if (!var15_1) ** GOTO lbl134
                throw null;
            }
lbl151:
            // 2 sources

            case 19: {
                var14_2 /* !! */  = (int)fu.jpuz("jqlc", jpvd(int ), (int)125);
                if (!var15_1) ** GOTO lbl93
                throw null;
            }
lbl155:
            // 3 sources

            case 20: {
                var14_2 /* !! */  = (int)fu.jpuz("jqld", jpvd(int ), (int)126);
                if (!var15_1) ** GOTO lbl68
                throw null;
            }
lbl159:
            // 2 sources

            case 21: {
                var14_2 /* !! */  = (int)fu.jpuz("jqle", jpvd(int ), (int)127);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl195
            }
lbl164:
            // 3 sources

            case 22: {
                var14_2 /* !! */  = (int)fu.jpuz("jqlf", jpvd(int ), (int)128);
                if (!var15_1) ** GOTO lbl139
                throw null;
            }
            case 23: {
                var14_2 /* !! */  = (int)fu.jpuz("jqlj", jpvd(int ), (int)129);
                if (!var15_1) ** GOTO lbl120
                throw null;
            }
lbl172:
            // 2 sources

            case 24: {
                var14_2 /* !! */  = (int)fu.jpuz("jqlm", jpvd(int ), (int)130);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl200
            }
            case 25: {
                var14_2 /* !! */  = (int)fu.jpuz("jqlo", jpvd(int ), (int)131);
                if (!var15_1) ** GOTO lbl155
                throw null;
            }
            case 26: {
                var14_2 /* !! */  = (int)fu.jpuz("jqlq", jpvd(int ), (int)132);
                if (!var15_1) ** GOTO lbl111
                throw null;
            }
lbl185:
            // 2 sources

            case 27: {
                var14_2 /* !! */  = (int)fu.jpuz("jqls", jpvd(int ), (int)133);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl190:
            // 2 sources

            case 28: {
                var14_2 /* !! */  = (int)fu.jpuz("jqlu", jpvd(int ), (int)134);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl195:
            // 4 sources

            case 29: {
                var14_2 /* !! */  = (int)fu.jpuz("jqlw", jpvd(int ), (int)135);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl200:
            // 2 sources

            case 30: {
                var14_2 /* !! */  = (int)fu.jpuz("jqmi", jpvd(int ), (int)136);
                if (!var15_1) ** GOTO lbl68
                throw null;
            }
            case 31: {
                var14_2 /* !! */  = (int)fu.jpuz("jqmk", jpvd(int ), (int)137);
                if (!var15_1) ** GOTO lbl93
                throw null;
            }
lbl208:
            // 2 sources

            case 32: {
                var14_2 /* !! */  = (int)fu.jpuz("jqmm", jpvd(int ), (int)138);
                if (!var15_1) ** GOTO lbl155
                throw null;
            }
lbl212:
            // 2 sources

            case 33: {
                var14_2 /* !! */  = (int)fu.jpuz("jqmq", jpvd(int ), (int)139);
                if (!var15_1) ** GOTO lbl190
                throw null;
            }
lbl216:
            // 3 sources

            case 34: {
                var14_2 /* !! */  = (int)fu.jpuz("jqnd", jpvd(int ), (int)140);
                if (!var15_1) ** GOTO lbl151
                throw null;
            }
            case 35: {
                var14_2 /* !! */  = (int)fu.jpuz("jqnj", jpvd(int ), (int)141);
                if (!var15_1) ** GOTO lbl208
                throw null;
            }
            case 36: {
                var14_2 /* !! */  = (int)fu.jpuz("jqnm", jpvd(int ), (int)142);
                if (!var15_1) ** GOTO lbl83
                throw null;
            }
            case 37: {
                var14_2 /* !! */  = (int)fu.jpuz("jqnq", jpvd(int ), (int)143);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl245
            }
lbl233:
            // 2 sources

            case 38: {
                var14_2 /* !! */  = (int)fu.jpuz("jqnu", jpvd(int ), (int)144);
                if (!var15_1) ** GOTO lbl63
                throw null;
            }
            case 39: {
                var14_2 /* !! */  = (int)fu.jpuz("jqnx", jpvd(int ), (int)145);
                if (!var15_1) ** GOTO lbl195
                throw null;
            }
            case 40: {
                var14_2 /* !! */  = (int)fu.jpuz("jqoc", jpvd(int ), (int)146);
                if (!var15_1) ** GOTO lbl73
                throw null;
            }
lbl245:
            // 2 sources

            case 41: {
                var14_2 /* !! */  = (int)fu.jpuz("jqoi", jpvd(int ), (int)147);
                if (!var15_1) ** GOTO lbl98
                throw null;
            }
            case 42: {
                var14_2 /* !! */  = (int)fu.jpuz("jqon", jpvd(int ), (int)148);
                if (!var15_1) ** GOTO lbl159
                throw null;
            }
lbl253:
            // 3 sources

            case 43: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var14_2 /* !! */  = (int)fu.jpuz("jqor", jpvd(int ), (int)149);
                    if (!var15_1) break block0;
                    throw null;
                }
            }
lbl258:
            // 4 sources

            case 44: {
                var14_2 /* !! */  = (int)fu.jpuz("jqow", jpvd(int ), (int)150);
                if (!var15_1) ** GOTO lbl195
                throw null;
            }
            case 45: {
                var14_2 /* !! */  = (int)fu.jpuz("jqpb", jpvd(int ), (int)151);
                if (!var15_1) ** GOTO lbl258
                throw null;
            }
            case 46: 
        }
        var14_2 /* !! */  = (int)fu.jpuz("jqpg", jpvd(int ), (int)152);
        ** while (!var15_1)
lbl269:
        // 1 sources

        throw null;
    }

    static {
        jpvf = new int[388];
        jpvh = new int[388];
        fu.jrqx();
        fu.jrrc();
        fu.jrrd();
        fu.jrre();
        fu.jrrf();
        fu.jrrg();
        fu.jrrh();
        fu.jrri();
        jpuw = new long[138];
        jpux = new long[138];
        fu.jrrj();
        fu.jrrk();
        fu.jrrl();
        fu.jrrm();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public fu() {
        var2_1 /* !! */  = fu.b;
        var1_2 = fu.a;
        super("Fly", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0438\u0433\u0440\u043e\u043a\u0443 \u043b\u0435\u0442\u0430\u0442\u044c", du.MOVEMENT);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0440\u0435\u0436\u0438\u043c \u043f\u043e\u043b\u0435\u0442\u0430", "Vanilla", new String[]{"Vanilla", "Gliding", "Elytra 1.17", "Dragon Fly", "FunTime"}).selected("Vanilla");
                this.speedXZ = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c XZ", "\u0413\u043e\u0440\u0438\u0437\u043e\u043d\u0442\u0430\u043b\u044c\u043d\u0430\u044f \u0441\u043a\u043e\u0440\u043e\u0441\u0442\u044c", (float)fu.jpuz("jpxi", jpxb(int ), (int)10)).range((float)fu.jpuz("jpxk", jpxb(int ), (int)11), (float)fu.jpuz("jpxm", jpxb(int ), (int)12));
                this.speedY = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c Y", "\u0412\u0435\u0440\u0442\u0438\u043a\u0430\u043b\u044c\u043d\u0430\u044f \u0441\u043a\u043e\u0440\u043e\u0441\u0442\u044c", 1.0f).range((float)fu.jpuz("jpxo", jpxb(int ), (int)13), (float)fu.jpuz("jpxq", jpxb(int ), (int)14));
                this.timer = new pr();
                this.settings(new jx[]{this.mode, this.speedXZ, this.speedY});
                return;
            }
lbl13:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)fu.jpuz("jpxu", jpvd(int ), (int)15);
                ** GOTO lbl28
            }
lbl16:
            // 4 sources

            case 1: {
                var2_1 /* !! */  = (int)fu.jpuz("jpxw", jpvd(int ), (int)16);
                break;
            }
            case 2: {
                var2_1 /* !! */  = (int)fu.jpuz("jpxx", jpvd(int ), (int)17);
                ** GOTO lbl16
            }
            case 3: {
                var2_1 /* !! */  = (int)fu.jpuz("jpxz", jpvd(int ), (int)18);
                ** GOTO lbl16
            }
            case 4: {
                var2_1 /* !! */  = (int)fu.jpuz("jpya", jpvd(int ), (int)19);
                ** GOTO lbl16
            }
lbl28:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)fu.jpuz("jpyb", jpvd(int ), (int)20);
                    continue;
                    break;
                }
            }
            case 6: {
                var2_1 /* !! */  = (int)fu.jpuz("jpyd", jpvd(int ), (int)21);
                ** GOTO lbl13
            }
            case 7: 
        }
        var2_1 /* !! */  = (int)fu.jpuz("jpye", jpvd(int ), (int)22);
        ** while (true)
    }

    private static /* synthetic */ void jrrm() {
        fu.jpux[100] = -3003079753514866391L;
        fu.jpux[101] = 4863115014530078718L;
        fu.jpux[102] = 789570505356918341L;
        fu.jpux[103] = 4671497186369297908L;
        fu.jpux[104] = -1773040828247913450L;
        fu.jpux[105] = 2068496674894151073L;
        fu.jpux[106] = -804432360489236951L;
        fu.jpux[107] = -8070557682850480311L;
        fu.jpux[108] = 3487892625201571222L;
        fu.jpux[109] = -9220748565048571794L;
        fu.jpux[110] = -3501994928931873846L;
        fu.jpux[111] = -6550405024342074214L;
        fu.jpux[112] = 4532364816926284782L;
        fu.jpux[113] = -3540058255697501270L;
        fu.jpux[114] = 6602580177423025499L;
        fu.jpux[115] = -316190769250292102L;
        fu.jpux[116] = -3607299058438674137L;
        fu.jpux[117] = -3569670262255242440L;
        fu.jpux[118] = -3685539770558287596L;
        fu.jpux[119] = -6023736892999858684L;
        fu.jpux[120] = 7879049626791101223L;
        fu.jpux[121] = -4373856661526233409L;
        fu.jpux[122] = 344267811133943544L;
        fu.jpux[123] = -1314087731821204091L;
        fu.jpux[124] = 1356883781208151255L;
        fu.jpux[125] = -6962114545386845834L;
        fu.jpux[126] = -9206322421275828287L;
        fu.jpux[127] = -5262853770617286912L;
        fu.jpux[128] = -4532967618445144225L;
        fu.jpux[129] = 713541892049796181L;
        fu.jpux[130] = -6269660201106976746L;
        fu.jpux[131] = -8845236741290029560L;
        fu.jpux[132] = -8796601076968472410L;
        fu.jpux[133] = 1365698807187494311L;
        fu.jpux[134] = 874296967290860861L;
        fu.jpux[135] = -2497662533563017099L;
        fu.jpux[136] = -4206451675029204865L;
        fu.jpux[137] = -2644271732390375908L;
    }

    private static /* synthetic */ int jpvd(int n2) {
        return jpvf[n2] ^ jpvh[n2];
    }

    private static /* synthetic */ double jpyv(int n2) {
        return Double.longBitsToDouble(jpuw[n2] ^ jpux[n2]);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void addMotion() {
        block7: {
            block4: {
                double d2;
                double d3;
                boolean bl2;
                block6: {
                    float f2;
                    float f3;
                    float f4;
                    block5: {
                        boolean bl3 = c;
                        int n2 = b;
                        bl2 = a;
                        if (bl3) {
                            throw null;
                        }
                        if (bl2 || bl2) break block4;
                        f4 = ot.INSTANCE.getRotation().getYaw();
                        if (bl2 || bl2) break block4;
                        f3 = fu.mc.field_1724.field_6250;
                        if (bl2 || bl2) break block4;
                        f2 = fu.mc.field_1724.field_6212;
                        if (bl2 || bl2) break block4;
                        d3 = 0.0;
                        if (bl2) return;
                        if (bl2) break block4;
                        d2 = 0.0;
                        if (bl2) return;
                        if (bl2) break block4;
                        if (f3 != 0.0f) break block5;
                        if (bl2) break block4;
                        if (f2 == 0.0f) break block6;
                        if (bl2) break block4;
                    }
                    if (bl2 || bl2) break block4;
                    float f5 = f4 * fu.jpuz("jqpo", jpxb(int ), (int)153);
                    if (bl2 || bl2) break block4;
                    d3 = -class_3532.method_15374((double)f5) * this.speedXZ.getValue() / fu.jpuz("jqpq", jpxb(int ), (int)154) * f3 + class_3532.method_15362((double)f5) * this.speedXZ.getValue() / fu.jpuz("jqps", jpxb(int ), (int)155) * f2;
                    if (bl2 || bl2) break block4;
                    d2 = class_3532.method_15362((double)f5) * this.speedXZ.getValue() / fu.jpuz("jqpv", jpxb(int ), (int)156) * f3 + class_3532.method_15374((double)f5) * this.speedXZ.getValue() / fu.jpuz("jqpx", jpxb(int ), (int)157) * f2;
                    if (bl2) break block4;
                }
                if (bl2 || bl2) break block4;
                fu.mc.field_1724.method_5762(d3, fu.mc.field_1724.method_18798().field_1351, d2);
                if (!bl2 && !bl2) break block7;
            }
            return;
        }
    }

    public static /* synthetic */ CallSite jpuz(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private double getMotionY() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fu.ru - fu.jpuz("jrcx", jpuu(int ), (int)68)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fu.jpuz("jrda", jpvd(int ), (int)274)) break;
            v0 /* !! */  = (long)fu.jpuz("jrdc", jpvd(int ), (int)275);
        }
        var3_1 = fu.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fu.ru - fu.jpuz("jrde", jpuu(int ), (int)69)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fu.jpuz("jrdf", jpvd(int ), (int)276)) break;
            v1 /* !! */  = (long)fu.jpuz("jrdh", jpvd(int ), (int)277);
        }
        var2_2 /* !! */  = fu.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = fu.ru - fu.jpuz("jrdi", jpuu(int ), (int)70)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fu.jpuz("jrdk", jpvd(int ), (int)278)) break;
            v2 /* !! */  = (long)fu.jpuz("jrdm", jpvd(int ), (int)279);
        }
        var1_3 = fu.a;
        if (var3_1) {
            throw null;
lbl21:
            // 5 sources

            return (double)fu.jpuz("jrdo", jpyv(int ), (int)71);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl21
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = fu.ru - fu.jpuz("jrdq", jpuu(int ), (int)72)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == fu.jpuz("jrds", jpvd(int ), (int)280)) break;
                    v3 /* !! */  = (long)fu.jpuz("jrdt", jpvd(int ), (int)281);
                }
                v4 /* !! */  = fu.ru;
                if (true) ** GOTO lbl36
                block41: while (true) {
                    v4 /* !! */  = (long)(v5 - fu.jpuz("jrdv", jpuu(int ), (int)73));
lbl36:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1819816722: {
                            break block41;
                        }
                        case 1113920648: {
                            v5 = fu.jpuz("jrdx", jpuu(int ), (int)74);
                            continue block41;
                        }
                        case 1823724409: {
                            v5 = fu.jpuz("jrdz", jpuu(int ), (int)75);
                            continue block41;
                        }
                    }
                    break;
                }
                v6 = fu.mc.field_1690;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = fu.ru - fu.jpuz("jreb", jpuu(int ), (int)76)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == fu.jpuz("jred", jpvd(int ), (int)282)) break;
                    v7 /* !! */  = (long)fu.jpuz("jref", jpvd(int ), (int)283);
                }
                v8 = v6.field_1832;
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_5 = fu.ru - fu.jpuz("jreh", jpuu(int ), (int)77)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == fu.jpuz("jrej", jpvd(int ), (int)284)) break;
                    v9 /* !! */  = (long)fu.jpuz("jrel", jpvd(int ), (int)285);
                }
                if (!v8.method_1434()) ** GOTO lbl70
                if (var1_3 || var1_3) ** GOTO lbl21
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_6 = fu.ru - fu.jpuz("jren", jpuu(int ), (int)78)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == fu.jpuz("jreo", jpvd(int ), (int)286)) break;
                    v10 /* !! */  = (long)fu.jpuz("jrep", jpvd(int ), (int)287);
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_7 = fu.ru - fu.jpuz("jreq", jpuu(int ), (int)79)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == fu.jpuz("jrer", jpvd(int ), (int)288)) break;
                    v11 /* !! */  = (long)fu.jpuz("jres", jpvd(int ), (int)289);
                }
                return -this.speedY.getValue();
lbl70:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl21
                v12 /* !! */  = fu.ru;
                if (true) ** GOTO lbl75
                block46: while (true) {
                    v12 /* !! */  = (long)(v13 - fu.jpuz("jret", jpuu(int ), (int)80));
lbl75:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1819816722: {
                            break block46;
                        }
                        case 1057362440: {
                            v13 = fu.jpuz("jreu", jpuu(int ), (int)81);
                            continue block46;
                        }
                        case 1771162934: {
                            v13 = fu.jpuz("jrev", jpuu(int ), (int)82);
                            continue block46;
                        }
                        case 1828092439: {
                            v13 = fu.jpuz("jrew", jpuu(int ), (int)83);
                            continue block46;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_8 = fu.ru - fu.jpuz("jrex", jpuu(int ), (int)84)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == fu.jpuz("jrez", jpvd(int ), (int)290)) break;
                    v14 /* !! */  = (long)fu.jpuz("jrfb", jpvd(int ), (int)291);
                }
                v15 = fu.mc.field_1690;
                v16 /* !! */  = fu.ru;
                if (true) ** GOTO lbl97
                block48: while (true) {
                    v16 /* !! */  = (long)(v17 - fu.jpuz("jrfd", jpuu(int ), (int)85));
lbl97:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1928826125: {
                            v17 = fu.jpuz("jrff", jpuu(int ), (int)86);
                            continue block48;
                        }
                        case -1819816722: {
                            break block48;
                        }
                        case -1070316739: {
                            v17 = fu.jpuz("jrfi", jpuu(int ), (int)87);
                            continue block48;
                        }
                        case 1256310254: {
                            v17 = fu.jpuz("jrfk", jpuu(int ), (int)88);
                            continue block48;
                        }
                    }
                    break;
                }
                v18 = v15.field_1903;
                v19 /* !! */  = fu.ru;
                if (true) ** GOTO lbl114
                block49: while (true) {
                    v19 /* !! */  = (long)(fu.jpuz("jrfo", jpuu(int ), (int)90) - fu.jpuz("jrfm", jpuu(int ), (int)89));
lbl114:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1819816722: {
                            break block49;
                        }
                        case 2034918158: {
                            continue block49;
                        }
                    }
                    break;
                }
                if (!v18.method_1434()) ** GOTO lbl132
                if (var1_3 || var1_3) ** GOTO lbl21
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_9 = fu.ru - fu.jpuz("jrfr", jpuu(int ), (int)91)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == fu.jpuz("jrft", jpvd(int ), (int)292)) break;
                    v20 /* !! */  = (long)fu.jpuz("jrfv", jpvd(int ), (int)293);
                }
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_10 = fu.ru - fu.jpuz("jrfx", jpuu(int ), (int)92)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == fu.jpuz("jrfz", jpvd(int ), (int)294)) break;
                    v21 /* !! */  = (long)fu.jpuz("jrgb", jpvd(int ), (int)295);
                }
                return this.speedY.getValue();
lbl132:
                // 1 sources

                if (var1_3 || var1_3) ** continue;
                return 0.0;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fu.jpuz("jrgd", jpvd(int ), (int)296);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl180
                    break;
                }
            }
lbl140:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)fu.jpuz("jrgf", jpvd(int ), (int)297);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl145:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)fu.jpuz("jrgi", jpvd(int ), (int)298);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl150:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)fu.jpuz("jrgj", jpvd(int ), (int)299);
                if (!var3_1) ** GOTO lbl140
                throw null;
            }
lbl154:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)fu.jpuz("jrgm", jpvd(int ), (int)300);
                if (!var3_1) ** GOTO lbl150
                throw null;
            }
            case 5: {
                do {
                    var2_2 /* !! */  = (int)fu.jpuz("jrgo", jpvd(int ), (int)301);
                } while (!var3_1);
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)fu.jpuz("jrgq", jpvd(int ), (int)302);
                if (var3_1) {
                    throw null;
                }
            }
            case 7: {
                var2_2 /* !! */  = (int)fu.jpuz("jrgs", jpvd(int ), (int)303);
                if (!var3_1) break;
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)fu.jpuz("jrgu", jpvd(int ), (int)304);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 9: {
                var2_2 /* !! */  = (int)fu.jpuz("jrgw", jpvd(int ), (int)305);
                if (!var3_1) ** GOTO lbl154
                throw null;
            }
lbl180:
            // 3 sources

            case 10: {
                var2_2 /* !! */  = (int)fu.jpuz("jrgy", jpvd(int ), (int)306);
                if (!var3_1) ** GOTO lbl145
                throw null;
            }
lbl184:
            // 2 sources

            case 11: {
                do {
                    var2_2 /* !! */  = (int)fu.jpuz("jrgz", jpvd(int ), (int)307);
                } while (!var3_1);
                throw null;
            }
            case 12: 
        }
        var2_2 /* !! */  = (int)fu.jpuz("jrhb", jpvd(int ), (int)308);
        ** while (!var3_1)
lbl192:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jrre() {
        fu.jpvf[300] = 2043797001;
        fu.jpvf[301] = 1726482835;
        fu.jpvf[302] = -1940070315;
        fu.jpvf[303] = 1534339739;
        fu.jpvf[304] = 2030551958;
        fu.jpvf[305] = -1105636537;
        fu.jpvf[306] = -1823939210;
        fu.jpvf[307] = -1387472769;
        fu.jpvf[308] = -611693498;
        fu.jpvf[309] = 808574585;
        fu.jpvf[310] = -857259886;
        fu.jpvf[311] = 40980802;
        fu.jpvf[312] = 943789916;
        fu.jpvf[313] = -2020964086;
        fu.jpvf[314] = -2046520232;
        fu.jpvf[315] = 117411728;
        fu.jpvf[316] = 1998880498;
        fu.jpvf[317] = -1945944647;
        fu.jpvf[318] = 820176955;
        fu.jpvf[319] = 334604481;
        fu.jpvf[320] = -904954720;
        fu.jpvf[321] = -1828098183;
        fu.jpvf[322] = -422418489;
        fu.jpvf[323] = 1268230911;
        fu.jpvf[324] = 143207412;
        fu.jpvf[325] = 1249539460;
        fu.jpvf[326] = 1893950390;
        fu.jpvf[327] = -1295164074;
        fu.jpvf[328] = 1958317614;
        fu.jpvf[329] = 1022795345;
        fu.jpvf[330] = -788800865;
        fu.jpvf[331] = -1694574550;
        fu.jpvf[332] = -1395427791;
        fu.jpvf[333] = 120785185;
        fu.jpvf[334] = -822757127;
        fu.jpvf[335] = -355850152;
        fu.jpvf[336] = 1551351088;
        fu.jpvf[337] = 908435455;
        fu.jpvf[338] = -672985845;
        fu.jpvf[339] = 624652579;
        fu.jpvf[340] = 578499172;
        fu.jpvf[341] = -475574653;
        fu.jpvf[342] = -1012319306;
        fu.jpvf[343] = 530652978;
        fu.jpvf[344] = -2001585751;
        fu.jpvf[345] = -1998908587;
        fu.jpvf[346] = -585122625;
        fu.jpvf[347] = -1989990669;
        fu.jpvf[348] = 374948168;
        fu.jpvf[349] = 1880556097;
        fu.jpvf[350] = 251379249;
        fu.jpvf[351] = -1508196395;
        fu.jpvf[352] = 155297027;
        fu.jpvf[353] = -259031135;
        fu.jpvf[354] = 960377802;
        fu.jpvf[355] = -1380377728;
        fu.jpvf[356] = 1809468054;
        fu.jpvf[357] = -274084214;
        fu.jpvf[358] = -159040701;
        fu.jpvf[359] = -1347166555;
        fu.jpvf[360] = -512575626;
        fu.jpvf[361] = -169305526;
        fu.jpvf[362] = 435362227;
        fu.jpvf[363] = 2134995235;
        fu.jpvf[364] = -1047156167;
        fu.jpvf[365] = 1033144898;
        fu.jpvf[366] = -102235979;
        fu.jpvf[367] = 1888109158;
        fu.jpvf[368] = -2092190402;
        fu.jpvf[369] = 1095313412;
        fu.jpvf[370] = 526437435;
        fu.jpvf[371] = 1859771362;
        fu.jpvf[372] = 289932232;
        fu.jpvf[373] = -1954951293;
        fu.jpvf[374] = 1758144004;
        fu.jpvf[375] = 2059620870;
        fu.jpvf[376] = 1379531422;
        fu.jpvf[377] = -1092662411;
        fu.jpvf[378] = 1560603680;
        fu.jpvf[379] = 1187704461;
        fu.jpvf[380] = -542571317;
        fu.jpvf[381] = -1871582376;
        fu.jpvf[382] = 1290168441;
        fu.jpvf[383] = -1761433967;
        fu.jpvf[384] = 125853380;
        fu.jpvf[385] = 1950934467;
        fu.jpvf[386] = 1117639153;
        fu.jpvf[387] = 2092135893;
    }

    private static /* synthetic */ void jrrk() {
        fu.jpuw[100] = -5575612276635211473L;
        fu.jpuw[101] = 666087661539646265L;
        fu.jpuw[102] = 7629996062948694370L;
        fu.jpuw[103] = 3575105482515580680L;
        fu.jpuw[104] = 7904907554239810243L;
        fu.jpuw[105] = 12356361189551304L;
        fu.jpuw[106] = -4593243815520272922L;
        fu.jpuw[107] = -2144162653611048300L;
        fu.jpuw[108] = -5017718531178526491L;
        fu.jpuw[109] = 4578118452355342568L;
        fu.jpuw[110] = -8604126642893198164L;
        fu.jpuw[111] = -5332002413314312484L;
        fu.jpuw[112] = -3366852793110831847L;
        fu.jpuw[113] = 2883944580093984661L;
        fu.jpuw[114] = 6770871696804227987L;
        fu.jpuw[115] = 7098192955832650330L;
        fu.jpuw[116] = 3936590267710912655L;
        fu.jpuw[117] = 2437531068558401321L;
        fu.jpuw[118] = 1666701668251349068L;
        fu.jpuw[119] = -3592254636836928692L;
        fu.jpuw[120] = -116496458642046883L;
        fu.jpuw[121] = 7790246663469431779L;
        fu.jpuw[122] = 4413072168420903196L;
        fu.jpuw[123] = -1961718660712849642L;
        fu.jpuw[124] = 2275094625609777415L;
        fu.jpuw[125] = 8908567904936844216L;
        fu.jpuw[126] = 7616268184122907834L;
        fu.jpuw[127] = 8569695382536552136L;
        fu.jpuw[128] = -60496728715462581L;
        fu.jpuw[129] = -6344256368147344934L;
        fu.jpuw[130] = -1582234748756755802L;
        fu.jpuw[131] = 7028950448714099097L;
        fu.jpuw[132] = 1223395437421534333L;
        fu.jpuw[133] = -7059722989414688367L;
        fu.jpuw[134] = 937397733436654302L;
        fu.jpuw[135] = 7051985429353454114L;
        fu.jpuw[136] = 724132610152306464L;
        fu.jpuw[137] = -8972073375028671974L;
    }

    private static /* synthetic */ void jrrc() {
        fu.jpvf[100] = 603731916;
        fu.jpvf[101] = 1346172297;
        fu.jpvf[102] = -280164056;
        fu.jpvf[103] = 1554913249;
        fu.jpvf[104] = -1247163533;
        fu.jpvf[105] = -1130063005;
        fu.jpvf[106] = -955569909;
        fu.jpvf[107] = -1670275080;
        fu.jpvf[108] = 1509482245;
        fu.jpvf[109] = 1758306311;
        fu.jpvf[110] = 181889908;
        fu.jpvf[111] = -784215959;
        fu.jpvf[112] = 1902261976;
        fu.jpvf[113] = 1424884499;
        fu.jpvf[114] = -973487114;
        fu.jpvf[115] = 531299816;
        fu.jpvf[116] = 183841821;
        fu.jpvf[117] = 657066891;
        fu.jpvf[118] = 1016552127;
        fu.jpvf[119] = 499656836;
        fu.jpvf[120] = 185970706;
        fu.jpvf[121] = -504309165;
        fu.jpvf[122] = -2062444754;
        fu.jpvf[123] = 1979579785;
        fu.jpvf[124] = -1149888159;
        fu.jpvf[125] = -454842681;
        fu.jpvf[126] = -1632095884;
        fu.jpvf[127] = -2112300113;
        fu.jpvf[128] = -129841088;
        fu.jpvf[129] = 601313253;
        fu.jpvf[130] = 1867874905;
        fu.jpvf[131] = 34714731;
        fu.jpvf[132] = -1420546724;
        fu.jpvf[133] = 1909872767;
        fu.jpvf[134] = -569321355;
        fu.jpvf[135] = 54803004;
        fu.jpvf[136] = 1137917213;
        fu.jpvf[137] = -810228265;
        fu.jpvf[138] = 1201329312;
        fu.jpvf[139] = 1788089437;
        fu.jpvf[140] = -913457384;
        fu.jpvf[141] = 483235002;
        fu.jpvf[142] = -2074864719;
        fu.jpvf[143] = 1369835698;
        fu.jpvf[144] = 787374846;
        fu.jpvf[145] = -627624720;
        fu.jpvf[146] = 1566484534;
        fu.jpvf[147] = 271404939;
        fu.jpvf[148] = 1701232356;
        fu.jpvf[149] = -2043624350;
        fu.jpvf[150] = 227485506;
        fu.jpvf[151] = 1570540047;
        fu.jpvf[152] = -1537761740;
        fu.jpvf[153] = -1282621075;
        fu.jpvf[154] = -21344363;
        fu.jpvf[155] = 1762461879;
        fu.jpvf[156] = 1575370537;
        fu.jpvf[157] = 1843788692;
        fu.jpvf[158] = -1675064554;
        fu.jpvf[159] = 925260435;
        fu.jpvf[160] = -1359779116;
        fu.jpvf[161] = 1597504491;
        fu.jpvf[162] = 969462216;
        fu.jpvf[163] = 972773231;
        fu.jpvf[164] = 223577010;
        fu.jpvf[165] = -1268449556;
        fu.jpvf[166] = -179261382;
        fu.jpvf[167] = 7412106;
        fu.jpvf[168] = 464844091;
        fu.jpvf[169] = -463115368;
        fu.jpvf[170] = 974091966;
        fu.jpvf[171] = -166225431;
        fu.jpvf[172] = 2056561529;
        fu.jpvf[173] = 104110925;
        fu.jpvf[174] = -65612618;
        fu.jpvf[175] = -224205718;
        fu.jpvf[176] = 1970684605;
        fu.jpvf[177] = -1542541178;
        fu.jpvf[178] = -1162124324;
        fu.jpvf[179] = -575727777;
        fu.jpvf[180] = 814790751;
        fu.jpvf[181] = -766751808;
        fu.jpvf[182] = -1248597944;
        fu.jpvf[183] = 1399365948;
        fu.jpvf[184] = 394062347;
        fu.jpvf[185] = 1783423123;
        fu.jpvf[186] = 824772312;
        fu.jpvf[187] = 1955825287;
        fu.jpvf[188] = 1326079962;
        fu.jpvf[189] = 1649207355;
        fu.jpvf[190] = -2058373393;
        fu.jpvf[191] = 1812733723;
        fu.jpvf[192] = 634293940;
        fu.jpvf[193] = -1588926968;
        fu.jpvf[194] = -316320819;
        fu.jpvf[195] = -1694710399;
        fu.jpvf[196] = -1363125132;
        fu.jpvf[197] = -1447195542;
        fu.jpvf[198] = -166468894;
        fu.jpvf[199] = 1007478974;
    }

    private static /* synthetic */ void jrqx() {
        fu.jpvf[0] = 18137421;
        fu.jpvf[1] = -1610589021;
        fu.jpvf[2] = -1023677637;
        fu.jpvf[3] = 1870106918;
        fu.jpvf[4] = -1119099436;
        fu.jpvf[5] = 1599788553;
        fu.jpvf[6] = -438135822;
        fu.jpvf[7] = -59825752;
        fu.jpvf[8] = 1741680860;
        fu.jpvf[9] = -344694367;
        fu.jpvf[10] = -829818898;
        fu.jpvf[11] = 1592540554;
        fu.jpvf[12] = 1055300304;
        fu.jpvf[13] = 469354234;
        fu.jpvf[14] = -1521644792;
        fu.jpvf[15] = 51646253;
        fu.jpvf[16] = -1835119122;
        fu.jpvf[17] = -1063871924;
        fu.jpvf[18] = 745659131;
        fu.jpvf[19] = -1441572837;
        fu.jpvf[20] = -1819272883;
        fu.jpvf[21] = 1089924175;
        fu.jpvf[22] = -1272806174;
        fu.jpvf[23] = 978339210;
        fu.jpvf[24] = -942460673;
        fu.jpvf[25] = -1076804571;
        fu.jpvf[26] = -593959584;
        fu.jpvf[27] = 1714949265;
        fu.jpvf[28] = -1537160388;
        fu.jpvf[29] = -2036823176;
        fu.jpvf[30] = 70666604;
        fu.jpvf[31] = -1388789115;
        fu.jpvf[32] = 197531027;
        fu.jpvf[33] = 1695417382;
        fu.jpvf[34] = -67273847;
        fu.jpvf[35] = -571220799;
        fu.jpvf[36] = -118960412;
        fu.jpvf[37] = -1998536154;
        fu.jpvf[38] = 871865816;
        fu.jpvf[39] = 1136346849;
        fu.jpvf[40] = -788945539;
        fu.jpvf[41] = -1893865501;
        fu.jpvf[42] = 1991395621;
        fu.jpvf[43] = 401738492;
        fu.jpvf[44] = 382246976;
        fu.jpvf[45] = -976350135;
        fu.jpvf[46] = 1826453249;
        fu.jpvf[47] = -645576550;
        fu.jpvf[48] = 51316793;
        fu.jpvf[49] = 429968208;
        fu.jpvf[50] = -2077076699;
        fu.jpvf[51] = -1179434874;
        fu.jpvf[52] = 1188869033;
        fu.jpvf[53] = -2054692178;
        fu.jpvf[54] = -656572613;
        fu.jpvf[55] = 748857669;
        fu.jpvf[56] = 273736315;
        fu.jpvf[57] = -1917693959;
        fu.jpvf[58] = 457935314;
        fu.jpvf[59] = -709113673;
        fu.jpvf[60] = 27591801;
        fu.jpvf[61] = -1502157486;
        fu.jpvf[62] = 1692311752;
        fu.jpvf[63] = 282590104;
        fu.jpvf[64] = 1511133942;
        fu.jpvf[65] = -2018192207;
        fu.jpvf[66] = -520045851;
        fu.jpvf[67] = 158574797;
        fu.jpvf[68] = 1837064414;
        fu.jpvf[69] = -1892087018;
        fu.jpvf[70] = -42613183;
        fu.jpvf[71] = -1554396624;
        fu.jpvf[72] = 762578226;
        fu.jpvf[73] = 102022006;
        fu.jpvf[74] = 554014556;
        fu.jpvf[75] = -604009675;
        fu.jpvf[76] = -776846743;
        fu.jpvf[77] = 2126686015;
        fu.jpvf[78] = 1523426190;
        fu.jpvf[79] = -465983694;
        fu.jpvf[80] = 594973006;
        fu.jpvf[81] = -1984036835;
        fu.jpvf[82] = 50775676;
        fu.jpvf[83] = 375159899;
        fu.jpvf[84] = -238406766;
        fu.jpvf[85] = -1257836588;
        fu.jpvf[86] = 1342936504;
        fu.jpvf[87] = 1752371346;
        fu.jpvf[88] = 1374907639;
        fu.jpvf[89] = -1908531529;
        fu.jpvf[90] = -1540354987;
        fu.jpvf[91] = -867667862;
        fu.jpvf[92] = 1930153212;
        fu.jpvf[93] = 532794516;
        fu.jpvf[94] = 180587630;
        fu.jpvf[95] = -1966988678;
        fu.jpvf[96] = -1989727574;
        fu.jpvf[97] = -456373471;
        fu.jpvf[98] = 2023914771;
        fu.jpvf[99] = 1958847101;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void deactivate() {
        while (true) {
            block51: {
                if ((v0 /* !! */  = (cfr_temp_1 = fu.ru - fu.jpuz("jrjx", jpuu(int ), (int)93)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  != fu.jpuz("jrjy", jpvd(int ), (int)340)) break block51;
                var3_1 = fu.c;
                v1 /* !! */  = fu.ru;
                if (true) ** GOTO lbl13
            }
            v0 /* !! */  = (long)fu.jpuz("jrjz", jpvd(int ), (int)341);
        }
        block27: while (true) {
            v1 /* !! */  = (long)(v2 - fu.jpuz("jrkb", jpuu(int ), (int)94));
lbl13:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1819816722: {
                    break block27;
                }
                case -1711182734: {
                    v2 = fu.jpuz("jrkc", jpuu(int ), (int)95);
                    continue block27;
                }
                case 1832038217: {
                    v2 = fu.jpuz("jrkd", jpuu(int ), (int)96);
                    continue block27;
                }
                case 2065948372: {
                    v2 = fu.jpuz("jrke", jpuu(int ), (int)97);
                    continue block27;
                }
            }
            break;
        }
        var2_2 /* !! */  = fu.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block28: while (true) {
            block52: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_2 = fu.ru - fu.jpuz("jrkf", jpuu(int ), (int)98)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v3 /* !! */  == fu.jpuz("jrkg", jpvd(int ), (int)342)) {
                                var1_3 = fu.a;
                                if (var3_1) {
                                    throw null;
                                }
                                break;
                            }
                            v3 /* !! */  = (long)fu.jpuz("jrkh", jpvd(int ), (int)343);
                        }
                        if (var1_3 || var1_3) return;
                        v4 /* !! */  = fu.ru;
                        block30: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -1819816722: {
                                    break block30;
                                }
                                case 1156173636: {
                                    v4 /* !! */  = (long)(fu.jpuz("jrkm", jpuu(int ), (int)100) - fu.jpuz("jrkk", jpuu(int ), (int)99));
                                    continue block30;
                                }
                            }
                            break;
                        }
                        super.deactivate();
                        if (var1_3 || var1_3) return;
                        v5 /* !! */  = fu.ru;
                        block31: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case -1819816722: {
                                    break block31;
                                }
                                case -527009564: {
                                    v6 = fu.jpuz("jrkr", jpuu(int ), (int)102);
                                    ** GOTO lbl65
                                }
                                case 353357917: {
                                    v6 = fu.jpuz("jrkt", jpuu(int ), (int)103);
                                    ** GOTO lbl65
                                }
                                case 627666243: {
                                    v6 = fu.jpuz("jrkv", jpuu(int ), (int)104);
lbl65:
                                    // 3 sources

                                    v5 /* !! */  = (long)(v6 - fu.jpuz("jrkp", jpuu(int ), (int)101));
                                    continue block31;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v7 /* !! */  = (cfr_temp_3 = fu.ru - fu.jpuz("jrkx", jpuu(int ), (int)105)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v7 /* !! */  == fu.jpuz("jrkz", jpvd(int ), (int)344)) {
                                this.timer.reset();
                                if (var1_3) return;
                                break;
                            }
                            v7 /* !! */  = (long)fu.jpuz("jrla", jpvd(int ), (int)345);
                        }
                        if (!var1_3) return;
                        return;
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)fu.jpuz("jrlf", jpvd(int ), (int)348);
                        cfr_temp_0 = 1;
                        if (var3_1) {
                            throw null;
                        }
                        break block52;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)fu.jpuz("jrlh", jpvd(int ), (int)349);
                        cfr_temp_0 = 5;
                        if (var3_1) {
                            throw null;
                        }
                        break block52;
                    }
                    case 4: {
                        var2_2 /* !! */  = (int)fu.jpuz("jrlj", jpvd(int ), (int)350);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)fu.jpuz("jrll", jpvd(int ), (int)351);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 7: lbl-1000:
                    // 3 sources

                    {
                        var2_2 /* !! */  = (int)fu.jpuz("jrlq", jpvd(int ), (int)353);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 0: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)fu.jpuz("jrld", jpvd(int ), (int)346);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 6: {
                        var2_2 /* !! */  = (int)fu.jpuz("jrlo", jpvd(int ), (int)352);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 1: 
                }
                ** GOTO lbl118
            }
            do {
                if (true) continue block28;
lbl118:
                // 2 sources

                var2_2 /* !! */  = (int)fu.jpuz("jrle", jpvd(int ), (int)347);
                cfr_temp_0 = 0;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void setMotion(float var1_1) {
        var13_2 = fu.c;
        var12_3 /* !! */  = fu.b;
        var11_4 = fu.a;
        if (var12_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var13_2) {
                    throw null;
lbl9:
                    // 15 sources

                    return;
                }
                if (var11_4 || var11_4) ** GOTO lbl9
                var2_5 = fu.mc.field_1724.method_36454();
                if (var11_4 || var11_4) ** GOTO lbl9
                var3_6 = fu.mc.field_1724.field_6250;
                if (var11_4 || var11_4) ** GOTO lbl9
                var4_7 = fu.mc.field_1724.field_6212;
                if (var11_4 || var11_4) ** GOTO lbl9
                var5_8 = var1_1 / fu.jpuz("jrhh", jpxb(int ), (int)309);
                if (var11_4 || var11_4) ** GOTO lbl9
                var6_9 = 0.0;
                if (var11_4 || var11_4) ** GOTO lbl9
                var8_10 = 0.0;
                if (var11_4 || var11_4) ** GOTO lbl9
                if (var3_6 != 0.0f) ** GOTO lbl28
                if (var11_4) ** GOTO lbl9
                if (var4_7 == 0.0f) ** GOTO lbl35
                if (var11_4) ** GOTO lbl9
lbl28:
                // 2 sources

                if (var11_4 || var11_4) ** GOTO lbl9
                var10_11 = var2_5 * fu.jpuz("jrhm", jpxb(int ), (int)310);
                if (var11_4 || var11_4) ** GOTO lbl9
                var6_9 = -class_3532.method_15374((double)var10_11) * var5_8 * var3_6 + class_3532.method_15362((double)var10_11) * var5_8 * var4_7;
                if (var11_4 || var11_4) ** GOTO lbl9
                var8_10 = class_3532.method_15362((double)var10_11) * var5_8 * var3_6 + class_3532.method_15374((double)var10_11) * var5_8 * var4_7;
                if (var11_4) ** GOTO lbl9
lbl35:
                // 2 sources

                if (var11_4 || var11_4) ** GOTO lbl9
                fu.mc.field_1724.method_18800(var6_9, fu.mc.field_1724.method_18798().field_1351, var8_10);
                if (!var11_4 && !var11_4) ** break;
                ** continue;
                return;
            }
lbl40:
            // 3 sources

            case 0: {
                var12_3 /* !! */  = (int)fu.jpuz("jrhr", jpvd(int ), (int)311);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl75
            }
lbl45:
            // 2 sources

            case 1: {
                var12_3 /* !! */  = (int)fu.jpuz("jrht", jpvd(int ), (int)312);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl147
            }
            case 2: {
                var12_3 /* !! */  = (int)fu.jpuz("jrhv", jpvd(int ), (int)313);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl60
            }
lbl55:
            // 2 sources

            case 3: {
                var12_3 /* !! */  = (int)fu.jpuz("jrhw", jpvd(int ), (int)314);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl84
            }
lbl60:
            // 2 sources

            case 4: {
                var12_3 /* !! */  = (int)fu.jpuz("jrhy", jpvd(int ), (int)315);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl97
            }
lbl65:
            // 2 sources

            case 5: {
                var12_3 /* !! */  = (int)fu.jpuz("jria", jpvd(int ), (int)316);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl70:
            // 2 sources

            case 6: {
                var12_3 /* !! */  = (int)fu.jpuz("jric", jpvd(int ), (int)317);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl75:
            // 3 sources

            case 7: {
                var12_3 /* !! */  = (int)fu.jpuz("jrie", jpvd(int ), (int)318);
                if (!var13_2) ** GOTO lbl40
                throw null;
            }
lbl79:
            // 2 sources

            case 8: {
                do {
                    var12_3 /* !! */  = (int)fu.jpuz("jrig", jpvd(int ), (int)319);
                } while (!var13_2);
                throw null;
            }
lbl84:
            // 2 sources

            case 9: {
                var12_3 /* !! */  = (int)fu.jpuz("jrih", jpvd(int ), (int)320);
                if (!var13_2) ** GOTO lbl75
                throw null;
            }
            case 10: {
                var12_3 /* !! */  = (int)fu.jpuz("jrin", jpvd(int ), (int)321);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl107
            }
            case 11: {
                var12_3 /* !! */  = (int)fu.jpuz("jrip", jpvd(int ), (int)322);
                if (!var13_2) ** GOTO lbl70
                throw null;
            }
lbl97:
            // 3 sources

            case 12: {
                var12_3 /* !! */  = (int)fu.jpuz("jrir", jpvd(int ), (int)323);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl102:
            // 2 sources

            case 13: {
                var12_3 /* !! */  = (int)fu.jpuz("jrit", jpvd(int ), (int)324);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl133
            }
lbl107:
            // 2 sources

            case 14: {
                var12_3 /* !! */  = (int)fu.jpuz("jriu", jpvd(int ), (int)325);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl112:
            // 2 sources

            case 15: {
                var12_3 /* !! */  = (int)fu.jpuz("jriv", jpvd(int ), (int)326);
                if (!var13_2) ** GOTO lbl45
                throw null;
            }
            case 16: {
                var12_3 /* !! */  = (int)fu.jpuz("jrix", jpvd(int ), (int)327);
                if (!var13_2) ** GOTO lbl65
                throw null;
            }
lbl120:
            // 3 sources

            case 17: {
                var12_3 /* !! */  = (int)fu.jpuz("jriz", jpvd(int ), (int)328);
                if (!var13_2) ** GOTO lbl112
                throw null;
            }
lbl124:
            // 2 sources

            case 18: {
                var12_3 /* !! */  = (int)fu.jpuz("jrjb", jpvd(int ), (int)329);
                if (!var13_2) ** GOTO lbl79
                throw null;
            }
            case 19: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_3 /* !! */  = (int)fu.jpuz("jrjd", jpvd(int ), (int)330);
                    if (!var13_2) ** GOTO lbl120
                    throw null;
                }
            }
lbl133:
            // 2 sources

            case 20: {
                var12_3 /* !! */  = (int)fu.jpuz("jrjf", jpvd(int ), (int)331);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 21: {
                var12_3 /* !! */  = (int)fu.jpuz("jrjg", jpvd(int ), (int)332);
                if (!var13_2) ** GOTO lbl55
                throw null;
            }
            case 22: {
                var12_3 /* !! */  = (int)fu.jpuz("jrji", jpvd(int ), (int)333);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl147:
            // 2 sources

            case 23: {
                var12_3 /* !! */  = (int)fu.jpuz("jrjk", jpvd(int ), (int)334);
                if (!var13_2) ** GOTO lbl40
                throw null;
            }
lbl151:
            // 2 sources

            case 24: {
                var12_3 /* !! */  = (int)fu.jpuz("jrjl", jpvd(int ), (int)335);
                if (!var13_2) ** GOTO lbl97
                throw null;
            }
lbl155:
            // 4 sources

            case 25: {
                var12_3 /* !! */  = (int)fu.jpuz("jrjn", jpvd(int ), (int)336);
                if (!var13_2) ** GOTO lbl102
                throw null;
            }
lbl159:
            // 2 sources

            case 26: {
                var12_3 /* !! */  = (int)fu.jpuz("jrjp", jpvd(int ), (int)337);
                if (!var13_2) ** GOTO lbl124
                throw null;
            }
lbl163:
            // 2 sources

            case 27: {
                var12_3 /* !! */  = (int)fu.jpuz("jrjr", jpvd(int ), (int)338);
                if (!var13_2) ** GOTO lbl120
                throw null;
            }
            case 28: 
        }
        var12_3 /* !! */  = (int)fu.jpuz("jrjt", jpvd(int ), (int)339);
        ** while (!var13_2)
lbl170:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block158: {
            block159: {
                block156: {
                    block157: {
                        block155: {
                            block154: {
                                block153: {
                                    var14_2 = fu.c;
                                    var13_3 /* !! */  = fu.b;
                                    var12_4 = fu.a;
                                    if (var14_2) {
                                        throw null;
lbl6:
                                        // 45 sources

                                        return;
                                    }
                                    if (var12_4 || var12_4) ** GOTO lbl6
                                    if (!this.state) break block153;
                                    if (var12_4) ** GOTO lbl6
                                    if (fu.mc.field_1724 == null) break block153;
                                    if (var12_4) ** GOTO lbl6
                                    if (fu.mc.field_1687 != null) break block154;
                                    if (var12_4) ** GOTO lbl6
                                }
                                if (var12_4 || var12_4) ** GOTO lbl6
                                return;
                            }
                            if (var12_4 || var12_4) ** GOTO lbl6
                            if (!this.mode.isSelected("Vanilla")) break block155;
                            if (var12_4 || var12_4) ** GOTO lbl6
                            this.handleVanillaMode();
                            if (var12_4) ** GOTO lbl6
                            if (var14_2) {
                                throw null;
                            }
                            break block156;
                        }
                        if (var12_4 || var12_4) ** GOTO lbl6
                        if (!this.mode.isSelected("Dragon Fly")) break block157;
                        if (var12_4 || var12_4) ** GOTO lbl6
                        this.handleDragonFlyMode();
                        if (var12_4) ** GOTO lbl6
                        if (var14_2) {
                            throw null;
                        }
                        break block156;
                    }
                    if (var12_4 || var12_4) ** GOTO lbl6
                    if (!this.mode.isSelected("FunTime")) break block156;
                    if (var12_4 || var12_4) ** GOTO lbl6
                    this.handleFunTimeMode();
                    if (var12_4) ** GOTO lbl6
                }
                if (var12_4 || var12_4) ** GOTO lbl6
                if (!this.mode.isSelected("Elytra 1.17")) ** GOTO lbl95
                if (var12_4 || var12_4) ** GOTO lbl6
                if (!fu.mc.field_1724.method_6118(class_1304.field_6174).method_7909().equals(class_1802.field_8833)) break block158;
                if (var12_4) ** GOTO lbl6
                if (fu.mc.field_1724.method_18798().field_1352 != 0.0) break block158;
                if (var12_4) ** GOTO lbl6
                if (fu.mc.field_1724.method_18798().field_1350 != 0.0) break block158;
                if (var12_4) ** GOTO lbl6
                if (!(fu.mc.field_1724.method_18798().field_1351 >= 0.0)) break block158;
                if (var12_4 || var12_4) ** GOTO lbl6
                if (!fu.mc.field_1724.method_24828()) break block159;
                if (var12_4) ** GOTO lbl6
                fu.mc.field_1690.field_1903.method_23481((boolean)fu.jpuz("jpyq", jpvd(int ), (int)23));
                if (var12_4) ** GOTO lbl6
                if (var14_2) {
                    throw null;
                }
                break block158;
            }
            if (var12_4 || var12_4) ** GOTO lbl6
            if (fu.mc.field_1724.method_6128()) break block158;
            if (var12_4) ** GOTO lbl6
            pn.startFallFlying();
            if (var12_4) ** GOTO lbl6
        }
        if (var12_4 || var12_4) ** GOTO lbl6
        if (!fu.mc.field_1724.method_6128()) ** GOTO lbl95
        if (var12_4) ** GOTO lbl6
        if (fu.mc.field_1724.method_6118(class_1304.field_6174).method_7909() != class_1802.field_8833) ** GOTO lbl95
        if (var12_4 || var12_4) ** GOTO lbl6
        var2_5 = fu.mc.field_1724.method_18798().field_1351;
        if (var12_4 || var12_4) ** GOTO lbl6
        var4_6 = this.speedY.getValue();
        if (var12_4 || var12_4) ** GOTO lbl6
        var6_8 = fu.jpuz("jpyy", jpyv(int ), (int)7);
        if (var12_4 || var12_4) ** GOTO lbl6
        var8_9 = fu.jpuz("jpza", jpuu(int ), (int)8);
        if (var12_4 || var12_4) ** GOTO lbl6
        ot.INSTANCE.rotateTo(new ov(fu.mc.field_1724.method_36454(), (float)fu.jpuz("jpzc", jpxb(int ), (int)24)), os.DEFAULT, nn.HIGH_IMPORTANCE_1, this);
        if (var12_4 || var12_4) ** GOTO lbl6
        if (var13_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!this.timer.every((double)var8_9)) ** GOTO lbl92
                if (var12_4 || var12_4) ** GOTO lbl6
                var10_10 = Math.min(var2_5 + var6_8, var4_6);
                if (var12_4 || var12_4) ** GOTO lbl6
                fu.mc.field_1724.method_18800(0.0, var10_10, 0.0);
                if (var12_4) ** GOTO lbl6
lbl92:
                // 2 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                fu.mc.field_1690.field_1903.method_23481((boolean)fu.jpuz("jpzg", jpvd(int ), (int)25));
                if (var12_4) ** GOTO lbl6
lbl95:
                // 4 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                if (!this.mode.isSelected("Gliding")) ** GOTO lbl106
                if (var12_4 || var12_4) ** GOTO lbl6
                var2_5 = this.getMotionY2();
                if (var12_4 || var12_4) ** GOTO lbl6
                this.addMotion();
                if (var12_4 || var12_4) ** GOTO lbl6
                var4_7 = fu.mc.field_1724.method_18798();
                if (var12_4 || var12_4) ** GOTO lbl6
                fu.mc.field_1724.method_18800(var4_7.field_1352, var2_5, var4_7.field_1350);
                if (var12_4) ** GOTO lbl6
lbl106:
                // 2 sources

                if (!var12_4 && !var12_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var13_3 /* !! */  = (int)fu.jpuz("jqab", jpvd(int ), (int)26);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl447
            }
lbl114:
            // 2 sources

            case 1: {
                var13_3 /* !! */  = (int)fu.jpuz("jqaf", jpvd(int ), (int)27);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl419
            }
lbl119:
            // 2 sources

            case 2: {
                var13_3 /* !! */  = (int)fu.jpuz("jqaj", jpvd(int ), (int)28);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl350
            }
lbl124:
            // 5 sources

            case 3: {
                var13_3 /* !! */  = (int)fu.jpuz("jqan", jpvd(int ), (int)29);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl302
            }
lbl129:
            // 2 sources

            case 4: {
                var13_3 /* !! */  = (int)fu.jpuz("jqar", jpvd(int ), (int)30);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl134:
            // 2 sources

            case 5: {
                var13_3 /* !! */  = (int)fu.jpuz("jqau", jpvd(int ), (int)31);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl139:
            // 2 sources

            case 6: {
                var13_3 /* !! */  = (int)fu.jpuz("jqay", jpvd(int ), (int)32);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl245
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_3 /* !! */  = (int)fu.jpuz("jqbb", jpvd(int ), (int)33);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl398
                    break;
                }
            }
            case 8: {
                var13_3 /* !! */  = (int)fu.jpuz("jqbe", jpvd(int ), (int)34);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl324
            }
            case 9: {
                var13_3 /* !! */  = (int)fu.jpuz("jqbf", jpvd(int ), (int)35);
                if (!var14_2) ** GOTO lbl129
                throw null;
            }
lbl159:
            // 2 sources

            case 10: {
                var13_3 /* !! */  = (int)fu.jpuz("jqbg", jpvd(int ), (int)36);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl164:
            // 2 sources

            case 11: {
                var13_3 /* !! */  = (int)fu.jpuz("jqbh", jpvd(int ), (int)37);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl245
            }
lbl169:
            // 2 sources

            case 12: {
                var13_3 /* !! */  = (int)fu.jpuz("jqbi", jpvd(int ), (int)38);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl447
            }
lbl174:
            // 2 sources

            case 13: {
                var13_3 /* !! */  = (int)fu.jpuz("jqbm", jpvd(int ), (int)39);
                if (!var14_2) ** GOTO lbl114
                throw null;
            }
lbl178:
            // 3 sources

            case 14: {
                var13_3 /* !! */  = (int)fu.jpuz("jqbo", jpvd(int ), (int)40);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl398
            }
            case 15: {
                var13_3 /* !! */  = (int)fu.jpuz("jqbr", jpvd(int ), (int)41);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl298
            }
            case 16: {
                do {
                    var13_3 /* !! */  = (int)fu.jpuz("jqbs", jpvd(int ), (int)42);
                } while (!var14_2);
                throw null;
            }
lbl193:
            // 2 sources

            case 17: {
                var13_3 /* !! */  = (int)fu.jpuz("jqbu", jpvd(int ), (int)43);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl385
            }
            case 18: {
                var13_3 /* !! */  = (int)fu.jpuz("jqbw", jpvd(int ), (int)44);
                if (!var14_2) ** GOTO lbl159
                throw null;
            }
lbl202:
            // 3 sources

            case 19: {
                var13_3 /* !! */  = (int)fu.jpuz("jqby", jpvd(int ), (int)45);
                if (!var14_2) ** GOTO lbl124
                throw null;
            }
            case 20: {
                var13_3 /* !! */  = (int)fu.jpuz("jqca", jpvd(int ), (int)46);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl407
            }
            case 21: {
                var13_3 /* !! */  = (int)fu.jpuz("jqcc", jpvd(int ), (int)47);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl381
            }
            case 22: {
                var13_3 /* !! */  = (int)fu.jpuz("jqcf", jpvd(int ), (int)48);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl288
            }
lbl221:
            // 2 sources

            case 23: {
                var13_3 /* !! */  = (int)fu.jpuz("jqcg", jpvd(int ), (int)49);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl359
            }
lbl226:
            // 3 sources

            case 24: {
                var13_3 /* !! */  = (int)fu.jpuz("jqci", jpvd(int ), (int)50);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl415
            }
            case 25: {
                var13_3 /* !! */  = (int)fu.jpuz("jqck", jpvd(int ), (int)51);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl264
            }
            case 26: {
                var13_3 /* !! */  = (int)fu.jpuz("jqcn", jpvd(int ), (int)52);
                if (!var14_2) ** GOTO lbl202
                throw null;
            }
lbl240:
            // 2 sources

            case 27: {
                var13_3 /* !! */  = (int)fu.jpuz("jqcq", jpvd(int ), (int)53);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl245:
            // 5 sources

            case 28: {
                var13_3 /* !! */  = (int)fu.jpuz("jqcr", jpvd(int ), (int)54);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl415
            }
lbl250:
            // 2 sources

            case 29: {
                var13_3 /* !! */  = (int)fu.jpuz("jqcu", jpvd(int ), (int)55);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl319
            }
lbl255:
            // 2 sources

            case 30: {
                var13_3 /* !! */  = (int)fu.jpuz("jqcy", jpvd(int ), (int)56);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl381
            }
lbl260:
            // 3 sources

            case 31: {
                var13_3 /* !! */  = (int)fu.jpuz("jqdb", jpvd(int ), (int)57);
                if (!var14_2) ** GOTO lbl169
                throw null;
            }
lbl264:
            // 2 sources

            case 32: {
                var13_3 /* !! */  = (int)fu.jpuz("jqde", jpvd(int ), (int)58);
                if (!var14_2) ** GOTO lbl260
                throw null;
            }
lbl268:
            // 3 sources

            case 33: {
                var13_3 /* !! */  = (int)fu.jpuz("jqdk", jpvd(int ), (int)59);
                if (!var14_2) ** GOTO lbl178
                throw null;
            }
lbl272:
            // 3 sources

            case 34: {
                var13_3 /* !! */  = (int)fu.jpuz("jqdp", jpvd(int ), (int)60);
                if (!var14_2) break;
                throw null;
            }
            case 35: {
                var13_3 /* !! */  = (int)fu.jpuz("jqdu", jpvd(int ), (int)61);
                if (!var14_2) ** GOTO lbl139
                throw null;
            }
lbl280:
            // 2 sources

            case 36: {
                var13_3 /* !! */  = (int)fu.jpuz("jqdz", jpvd(int ), (int)62);
                if (!var14_2) ** GOTO lbl260
                throw null;
            }
            case 37: {
                var13_3 /* !! */  = (int)fu.jpuz("jqec", jpvd(int ), (int)63);
                if (!var14_2) ** GOTO lbl240
                throw null;
            }
lbl288:
            // 2 sources

            case 38: {
                var13_3 /* !! */  = (int)fu.jpuz("jqeg", jpvd(int ), (int)64);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl385
            }
            case 39: {
                var13_3 /* !! */  = (int)fu.jpuz("jqek", jpvd(int ), (int)65);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl435
            }
lbl298:
            // 2 sources

            case 40: {
                var13_3 /* !! */  = (int)fu.jpuz("jqem", jpvd(int ), (int)66);
                if (!var14_2) ** GOTO lbl124
                throw null;
            }
lbl302:
            // 2 sources

            case 41: {
                var13_3 /* !! */  = (int)fu.jpuz("jqeo", jpvd(int ), (int)67);
                if (!var14_2) ** GOTO lbl124
                throw null;
            }
            case 42: {
                var13_3 /* !! */  = (int)fu.jpuz("jqeq", jpvd(int ), (int)68);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl423
            }
lbl311:
            // 2 sources

            case 43: {
                var13_3 /* !! */  = (int)fu.jpuz("jqet", jpvd(int ), (int)69);
                if (!var14_2) ** GOTO lbl272
                throw null;
            }
lbl315:
            // 2 sources

            case 44: {
                var13_3 /* !! */  = (int)fu.jpuz("jqev", jpvd(int ), (int)70);
                if (!var14_2) ** GOTO lbl134
                throw null;
            }
lbl319:
            // 2 sources

            case 45: {
                var13_3 /* !! */  = (int)fu.jpuz("jqey", jpvd(int ), (int)71);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl346
            }
lbl324:
            // 2 sources

            case 46: {
                var13_3 /* !! */  = (int)fu.jpuz("jqfa", jpvd(int ), (int)72);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl389
            }
            case 47: {
                var13_3 /* !! */  = (int)fu.jpuz("jqfc", jpvd(int ), (int)73);
                if (!var14_2) ** GOTO lbl250
                throw null;
            }
lbl333:
            // 2 sources

            case 48: {
                var13_3 /* !! */  = (int)fu.jpuz("jqff", jpvd(int ), (int)74);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl368
            }
            case 49: {
                var13_3 /* !! */  = (int)fu.jpuz("jqfh", jpvd(int ), (int)75);
                if (!var14_2) ** GOTO lbl202
                throw null;
            }
lbl342:
            // 2 sources

            case 50: {
                var13_3 /* !! */  = (int)fu.jpuz("jqfj", jpvd(int ), (int)76);
                if (!var14_2) ** GOTO lbl221
                throw null;
            }
lbl346:
            // 3 sources

            case 51: {
                var13_3 /* !! */  = (int)fu.jpuz("jqfl", jpvd(int ), (int)77);
                if (!var14_2) ** GOTO lbl272
                throw null;
            }
lbl350:
            // 2 sources

            case 52: {
                var13_3 /* !! */  = (int)fu.jpuz("jqfn", jpvd(int ), (int)78);
                if (!var14_2) ** GOTO lbl193
                throw null;
            }
lbl354:
            // 2 sources

            case 53: {
                var13_3 /* !! */  = (int)fu.jpuz("jqfq", jpvd(int ), (int)79);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl372
            }
lbl359:
            // 2 sources

            case 54: {
                var13_3 /* !! */  = (int)fu.jpuz("jqfs", jpvd(int ), (int)80);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl411
            }
            case 55: {
                var13_3 /* !! */  = (int)fu.jpuz("jqfu", jpvd(int ), (int)81);
                if (!var14_2) ** GOTO lbl245
                throw null;
            }
lbl368:
            // 2 sources

            case 56: {
                var13_3 /* !! */  = (int)fu.jpuz("jqfw", jpvd(int ), (int)82);
                if (!var14_2) ** GOTO lbl354
                throw null;
            }
lbl372:
            // 2 sources

            case 57: {
                var13_3 /* !! */  = (int)fu.jpuz("jqfz", jpvd(int ), (int)83);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl439
            }
            case 58: {
                var13_3 /* !! */  = (int)fu.jpuz("jqgb", jpvd(int ), (int)84);
                if (!var14_2) ** GOTO lbl315
                throw null;
            }
lbl381:
            // 4 sources

            case 59: {
                var13_3 /* !! */  = (int)fu.jpuz("jqgd", jpvd(int ), (int)85);
                if (var14_2) {
                    throw null;
                }
            }
lbl385:
            // 5 sources

            case 60: {
                var13_3 /* !! */  = (int)fu.jpuz("jqgf", jpvd(int ), (int)86);
                if (!var14_2) ** GOTO lbl346
                throw null;
            }
lbl389:
            // 2 sources

            case 61: {
                var13_3 /* !! */  = (int)fu.jpuz("jqgh", jpvd(int ), (int)87);
                if (!var14_2) ** GOTO lbl268
                throw null;
            }
            case 62: {
                var13_3 /* !! */  = (int)fu.jpuz("jqgk", jpvd(int ), (int)88);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl402
            }
lbl398:
            // 4 sources

            case 63: {
                var13_3 /* !! */  = (int)fu.jpuz("jqgq", jpvd(int ), (int)89);
                if (!var14_2) ** GOTO lbl342
                throw null;
            }
lbl402:
            // 2 sources

            case 64: {
                var13_3 /* !! */  = (int)fu.jpuz("jqgu", jpvd(int ), (int)90);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl415
            }
lbl407:
            // 2 sources

            case 65: {
                var13_3 /* !! */  = (int)fu.jpuz("jqgx", jpvd(int ), (int)91);
                if (!var14_2) ** GOTO lbl280
                throw null;
            }
lbl411:
            // 2 sources

            case 66: {
                var13_3 /* !! */  = (int)fu.jpuz("jqhb", jpvd(int ), (int)92);
                if (!var14_2) ** GOTO lbl174
                throw null;
            }
lbl415:
            // 4 sources

            case 67: {
                var13_3 /* !! */  = (int)fu.jpuz("jqhe", jpvd(int ), (int)93);
                if (!var14_2) ** GOTO lbl311
                throw null;
            }
lbl419:
            // 2 sources

            case 68: {
                var13_3 /* !! */  = (int)fu.jpuz("jqhh", jpvd(int ), (int)94);
                if (!var14_2) ** GOTO lbl245
                throw null;
            }
lbl423:
            // 2 sources

            case 69: {
                var13_3 /* !! */  = (int)fu.jpuz("jqhi", jpvd(int ), (int)95);
                if (!var14_2) ** GOTO lbl333
                throw null;
            }
            case 70: {
                var13_3 /* !! */  = (int)fu.jpuz("jqhq", jpvd(int ), (int)96);
                if (!var14_2) ** GOTO lbl255
                throw null;
            }
            case 71: {
                var13_3 /* !! */  = (int)fu.jpuz("jqhu", jpvd(int ), (int)97);
                if (!var14_2) ** GOTO lbl398
                throw null;
            }
lbl435:
            // 2 sources

            case 72: {
                var13_3 /* !! */  = (int)fu.jpuz("jqhw", jpvd(int ), (int)98);
                if (!var14_2) ** GOTO lbl119
                throw null;
            }
lbl439:
            // 2 sources

            case 73: {
                var13_3 /* !! */  = (int)fu.jpuz("jqia", jpvd(int ), (int)99);
                if (!var14_2) ** GOTO lbl124
                throw null;
            }
            case 74: {
                var13_3 /* !! */  = (int)fu.jpuz("jqie", jpvd(int ), (int)100);
                if (!var14_2) ** GOTO lbl226
                throw null;
            }
lbl447:
            // 3 sources

            case 75: {
                var13_3 /* !! */  = (int)fu.jpuz("jqih", jpvd(int ), (int)101);
                if (!var14_2) ** GOTO lbl381
                throw null;
            }
            case 76: 
        }
        var13_3 /* !! */  = (int)fu.jpuz("jqik", jpvd(int ), (int)102);
        ** while (!var14_2)
lbl454:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jrrf() {
        fu.jpvh[0] = -18137422;
        fu.jpvh[1] = 1338384830;
        fu.jpvh[2] = 1023677636;
        fu.jpvh[3] = -650649705;
        fu.jpvh[4] = 1119099435;
        fu.jpvh[5] = -89066172;
        fu.jpvh[6] = -438135823;
        fu.jpvh[7] = -59825752;
        fu.jpvh[8] = 1741680861;
        fu.jpvh[9] = -344694367;
        fu.jpvh[10] = -246810642;
        fu.jpvh[11] = 1642872202;
        fu.jpvh[12] = 2118556368;
        fu.jpvh[13] = 641010231;
        fu.jpvh[14] = -452097272;
        fu.jpvh[15] = 51646255;
        fu.jpvh[16] = -1835119123;
        fu.jpvh[17] = -1063871922;
        fu.jpvh[18] = 745659133;
        fu.jpvh[19] = -1441572840;
        fu.jpvh[20] = -1819272884;
        fu.jpvh[21] = 1089924175;
        fu.jpvh[22] = -1272806170;
        fu.jpvh[23] = 978339211;
        fu.jpvh[24] = 122892543;
        fu.jpvh[25] = -1076804571;
        fu.jpvh[26] = -593959641;
        fu.jpvh[27] = 1714949255;
        fu.jpvh[28] = -1537160445;
        fu.jpvh[29] = -2036823174;
        fu.jpvh[30] = 70666595;
        fu.jpvh[31] = -1388789098;
        fu.jpvh[32] = 197531053;
        fu.jpvh[33] = 1695417376;
        fu.jpvh[34] = -67273816;
        fu.jpvh[35] = -571220764;
        fu.jpvh[36] = -118960468;
        fu.jpvh[37] = -1998536089;
        fu.jpvh[38] = 871865753;
        fu.jpvh[39] = 1136346791;
        fu.jpvh[40] = -788945605;
        fu.jpvh[41] = -1893865477;
        fu.jpvh[42] = 1991395598;
        fu.jpvh[43] = 401738454;
        fu.jpvh[44] = 382247039;
        fu.jpvh[45] = -976350086;
        fu.jpvh[46] = 1826453270;
        fu.jpvh[47] = -645576484;
        fu.jpvh[48] = 51316787;
        fu.jpvh[49] = 429968199;
        fu.jpvh[50] = -2077076673;
        fu.jpvh[51] = -1179434873;
        fu.jpvh[52] = 1188868998;
        fu.jpvh[53] = -2054692195;
        fu.jpvh[54] = -656572652;
        fu.jpvh[55] = 748857670;
        fu.jpvh[56] = 273736259;
        fu.jpvh[57] = -1917693978;
        fu.jpvh[58] = 457935334;
        fu.jpvh[59] = -709113709;
        fu.jpvh[60] = 27591730;
        fu.jpvh[61] = -1502157491;
        fu.jpvh[62] = 1692311759;
        fu.jpvh[63] = 282590126;
        fu.jpvh[64] = 1511133886;
        fu.jpvh[65] = -2018192238;
        fu.jpvh[66] = -520045837;
        fu.jpvh[67] = 158574731;
        fu.jpvh[68] = 1837064407;
        fu.jpvh[69] = -1892087012;
        fu.jpvh[70] = -42613239;
        fu.jpvh[71] = -1554396660;
        fu.jpvh[72] = 762578201;
        fu.jpvh[73] = 102021972;
        fu.jpvh[74] = 554014489;
        fu.jpvh[75] = -604009614;
        fu.jpvh[76] = -776846803;
        fu.jpvh[77] = 2126686000;
        fu.jpvh[78] = 1523426182;
        fu.jpvh[79] = -465983727;
        fu.jpvh[80] = 594973039;
        fu.jpvh[81] = -1984036851;
        fu.jpvh[82] = 50775631;
        fu.jpvh[83] = 375159875;
        fu.jpvh[84] = -238406703;
        fu.jpvh[85] = -1257836607;
        fu.jpvh[86] = 1342936465;
        fu.jpvh[87] = 1752371358;
        fu.jpvh[88] = 1374907646;
        fu.jpvh[89] = -1908531472;
        fu.jpvh[90] = -1540354992;
        fu.jpvh[91] = -867667863;
        fu.jpvh[92] = 1930153154;
        fu.jpvh[93] = 532794526;
        fu.jpvh[94] = 180587638;
        fu.jpvh[95] = -1966988725;
        fu.jpvh[96] = -1989727576;
        fu.jpvh[97] = -456373498;
        fu.jpvh[98] = 2023914779;
        fu.jpvh[99] = 1958847045;
    }

    private static /* synthetic */ long jpuu(int n2) {
        return jpuw[n2] ^ jpux[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public pr getTimer() {
        while (true) {
            block27: {
                if ((v0 /* !! */  = (cfr_temp_1 = fu.ru - fu.jpuz("jroz", jpuu(int ), (int)131)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  != fu.jpuz("jrpb", jpvd(int ), (int)378)) break block27;
                var3_1 = fu.c;
                v1 /* !! */  = fu.ru;
                if (true) ** GOTO lbl13
            }
            v0 /* !! */  = (long)fu.jpuz("jrpd", jpvd(int ), (int)379);
        }
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - fu.jpuz("jrpe", jpuu(int ), (int)132));
lbl13:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1819816722: {
                    break block13;
                }
                case -1660289968: {
                    v2 = fu.jpuz("jrpg", jpuu(int ), (int)133);
                    continue block13;
                }
                case -160016937: {
                    v2 = fu.jpuz("jrpi", jpuu(int ), (int)134);
                    continue block13;
                }
                case 1106209143: {
                    v2 = fu.jpuz("jrpk", jpuu(int ), (int)135);
                    continue block13;
                }
            }
            break;
        }
        var2_2 /* !! */  = fu.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = fu.ru - fu.jpuz("jrpm", jpuu(int ), (int)136)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == fu.jpuz("jrpo", jpvd(int ), (int)380)) {
                var1_3 = fu.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)fu.jpuz("jrpq", jpvd(int ), (int)381);
        }
        if (var1_3 != false) return null;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var1_3 != false) return null;
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_3 = fu.ru - fu.jpuz("jrps", jpuu(int ), (int)137)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v4 /* !! */  == fu.jpuz("jrpu", jpvd(int ), (int)382)) {
                            return this.timer;
                        }
                        v4 /* !! */  = (long)fu.jpuz("jrpw", jpvd(int ), (int)383);
                    }
                }
                case 0: {
                    ** GOTO lbl56
                }
                case 3: {
                    var2_2 /* !! */  = (int)fu.jpuz("jrqu", jpvd(int ), (int)387);
                    if (var3_1) {
                        throw null;
                    }
lbl56:
                    // 3 sources

                    var2_2 /* !! */  = (int)fu.jpuz("jrqp", jpvd(int ), (int)384);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)fu.jpuz("jrqr", jpvd(int ), (int)385);
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

            var2_2 /* !! */  = (int)fu.jpuz("jrqs", jpvd(int ), (int)386);
            cfr_temp_0 = 1;
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kf getMode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fu.ru - fu.jpuz("jrlv", jpuu(int ), (int)106)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fu.jpuz("jrlw", jpvd(int ), (int)354)) break;
            v0 /* !! */  = (long)fu.jpuz("jrlx", jpvd(int ), (int)355);
        }
        var3_1 = fu.c;
        v1 /* !! */  = fu.ru;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - fu.jpuz("jrlz", jpuu(int ), (int)107));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1819816722: {
                    break block17;
                }
                case -351290371: {
                    v2 = fu.jpuz("jrma", jpuu(int ), (int)108);
                    continue block17;
                }
                case 789111511: {
                    v2 = fu.jpuz("jrmc", jpuu(int ), (int)109);
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = fu.b;
        v3 /* !! */  = fu.ru;
        if (true) ** GOTO lbl26
        block18: while (true) {
            v3 /* !! */  = (long)(v4 - fu.jpuz("jrme", jpuu(int ), (int)110));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1819816722: {
                    break block18;
                }
                case -1612184564: {
                    v4 = fu.jpuz("jrmg", jpuu(int ), (int)111);
                    continue block18;
                }
                case 279501895: {
                    v4 = fu.jpuz("jrmh", jpuu(int ), (int)112);
                    continue block18;
                }
            }
            break;
        }
        var1_3 = fu.a;
        if (!var3_1) ** GOTO lbl42
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl42:
                // 1 sources

                if (var1_3 || var1_3) continue block19;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = fu.ru - fu.jpuz("jrmj", jpuu(int ), (int)113)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == fu.jpuz("jrml", jpvd(int ), (int)356)) break;
                    v5 /* !! */  = (long)fu.jpuz("jrmm", jpvd(int ), (int)357);
                }
                return this.mode;
                case 0: {
                    var2_2 /* !! */  = (int)fu.jpuz("jrmn", jpvd(int ), (int)358);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl60
                }
                case 1: {
                    do {
                        var2_2 /* !! */  = (int)fu.jpuz("jrmp", jpvd(int ), (int)359);
                    } while (!var3_1);
                    throw null;
                }
lbl60:
                // 2 sources

                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)fu.jpuz("jrmr", jpvd(int ), (int)360);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)fu.jpuz("jrmt", jpvd(int ), (int)361);
        ** while (!var3_1)
lbl68:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jrrg() {
        fu.jpvh[100] = 603731940;
        fu.jpvh[101] = 1346172329;
        fu.jpvh[102] = -280164090;
        fu.jpvh[103] = 1554913249;
        fu.jpvh[104] = -1247163533;
        fu.jpvh[105] = -2144706218;
        fu.jpvh[106] = -955569898;
        fu.jpvh[107] = -1670275104;
        fu.jpvh[108] = 1509482249;
        fu.jpvh[109] = 1758306313;
        fu.jpvh[110] = 181889887;
        fu.jpvh[111] = -784215963;
        fu.jpvh[112] = 1902261954;
        fu.jpvh[113] = 1424884528;
        fu.jpvh[114] = -973487105;
        fu.jpvh[115] = 531299834;
        fu.jpvh[116] = 183841849;
        fu.jpvh[117] = 657066922;
        fu.jpvh[118] = 1016552107;
        fu.jpvh[119] = 499656879;
        fu.jpvh[120] = 185970746;
        fu.jpvh[121] = -504309163;
        fu.jpvh[122] = -2062444768;
        fu.jpvh[123] = 1979579798;
        fu.jpvh[124] = -1149888140;
        fu.jpvh[125] = -454842652;
        fu.jpvh[126] = -1632095898;
        fu.jpvh[127] = -2112300103;
        fu.jpvh[128] = -129841060;
        fu.jpvh[129] = 601313269;
        fu.jpvh[130] = 1867874904;
        fu.jpvh[131] = 34714702;
        fu.jpvh[132] = -1420546736;
        fu.jpvh[133] = 1909872738;
        fu.jpvh[134] = -569321374;
        fu.jpvh[135] = 54802985;
        fu.jpvh[136] = 1137917184;
        fu.jpvh[137] = -810228266;
        fu.jpvh[138] = 1201329292;
        fu.jpvh[139] = 1788089457;
        fu.jpvh[140] = -913457399;
        fu.jpvh[141] = 483234979;
        fu.jpvh[142] = -2074864712;
        fu.jpvh[143] = 1369835670;
        fu.jpvh[144] = 0x2EEE62E2;
        fu.jpvh[145] = -627624749;
        fu.jpvh[146] = 1566484519;
        fu.jpvh[147] = 271404930;
        fu.jpvh[148] = 1701232379;
        fu.jpvh[149] = -2043624324;
        fu.jpvh[150] = 227485505;
        fu.jpvh[151] = 1570540046;
        fu.jpvh[152] = -1537761757;
        fu.jpvh[153] = -1895679144;
        fu.jpvh[154] = -1086697579;
        fu.jpvh[155] = 680331447;
        fu.jpvh[156] = 476462889;
        fu.jpvh[157] = 744881044;
        fu.jpvh[158] = -1675064547;
        fu.jpvh[159] = 925260432;
        fu.jpvh[160] = -1359779130;
        fu.jpvh[161] = 1597504488;
        fu.jpvh[162] = 969462215;
        fu.jpvh[163] = 972773242;
        fu.jpvh[164] = 223577018;
        fu.jpvh[165] = -1268449561;
        fu.jpvh[166] = -179261392;
        fu.jpvh[167] = 7412115;
        fu.jpvh[168] = 464844084;
        fu.jpvh[169] = -463115368;
        fu.jpvh[170] = 974091954;
        fu.jpvh[171] = -166225428;
        fu.jpvh[172] = 2056561526;
        fu.jpvh[173] = 104110916;
        fu.jpvh[174] = -65612640;
        fu.jpvh[175] = -224205698;
        fu.jpvh[176] = 1970684600;
        fu.jpvh[177] = -1542541167;
        fu.jpvh[178] = -1162124337;
        fu.jpvh[179] = -575727779;
        fu.jpvh[180] = 814790733;
        fu.jpvh[181] = -766751793;
        fu.jpvh[182] = -1248597927;
        fu.jpvh[183] = 1399365933;
        fu.jpvh[184] = 394062340;
        fu.jpvh[185] = 1783423122;
        fu.jpvh[186] = -139543900;
        fu.jpvh[187] = -1955825288;
        fu.jpvh[188] = -76111271;
        fu.jpvh[189] = -1649207356;
        fu.jpvh[190] = 981550285;
        fu.jpvh[191] = 1812733722;
        fu.jpvh[192] = 27583345;
        fu.jpvh[193] = 1588926967;
        fu.jpvh[194] = -2076719226;
        fu.jpvh[195] = 1694710398;
        fu.jpvh[196] = 1436874282;
        fu.jpvh[197] = 1447195541;
        fu.jpvh[198] = -2129922770;
        fu.jpvh[199] = 1007478974;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kg getSpeedY() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fu.ru - fu.jpuz("jrod", jpuu(int ), (int)125)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fu.jpuz("jroe", jpvd(int ), (int)368)) break;
            v0 /* !! */  = (long)fu.jpuz("jrog", jpvd(int ), (int)369);
        }
        var3_1 = fu.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fu.ru - fu.jpuz("jroh", jpuu(int ), (int)126)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == fu.jpuz("jroj", jpvd(int ), (int)370)) break;
            v1 /* !! */  = (long)fu.jpuz("jrok", jpvd(int ), (int)371);
        }
        var2_2 /* !! */  = fu.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = fu.ru;
                if (true) ** GOTO lbl22
                block13: while (true) {
                    v2 /* !! */  = (long)(v3 - fu.jpuz("jrom", jpuu(int ), (int)127));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1928394277: {
                            v3 = fu.jpuz("jroo", jpuu(int ), (int)128);
                            continue block13;
                        }
                        case -1819816722: {
                            break block13;
                        }
                        case 518478262: {
                            v3 = fu.jpuz("jrop", jpuu(int ), (int)129);
                            continue block13;
                        }
                    }
                    break;
                }
                var1_3 = fu.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = fu.ru - fu.jpuz("jros", jpuu(int ), (int)130)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == fu.jpuz("jrot", jpvd(int ), (int)372)) break;
                    v4 /* !! */  = (long)fu.jpuz("jrou", jpvd(int ), (int)373);
                }
                return this.speedY;
            }
lbl44:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)fu.jpuz("jrov", jpvd(int ), (int)374);
                } while (!var3_1);
                throw null;
            }
lbl49:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)fu.jpuz("jrow", jpvd(int ), (int)375);
                if (!var3_1) ** GOTO lbl44
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)fu.jpuz("jrox", jpvd(int ), (int)376);
                if (!var3_1) ** GOTO lbl49
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)fu.jpuz("jroy", jpvd(int ), (int)377);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ float jpxb(int n2) {
        return Float.intBitsToFloat(jpvf[n2] ^ jpvh[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleDragonFlyMode() {
        block65: {
            block64: {
                block63: {
                    var6_1 = fu.c;
                    var5_2 /* !! */  = fu.b;
                    var4_3 = fu.a;
                    if (var6_1) {
                        throw null;
lbl6:
                        // 15 sources

                        return;
                    }
                    if (var4_3 || var4_3) ** GOTO lbl6
                    if (!v.overridesDragonFlyMovement()) break block63;
                    if (var4_3 || var4_3) ** GOTO lbl6
                    return;
                }
                if (var4_3 || var4_3) ** GOTO lbl6
                if (!fu.mc.field_1724.method_31549().field_7479) ** GOTO lbl-1000
                if (var4_3 || var4_3) ** GOTO lbl6
                this.setMotion(this.speedXZ.getValue());
                if (var4_3 || var4_3) ** GOTO lbl6
                var1_4 = 0.0;
                if (var4_3 || var4_3) ** GOTO lbl6
                if (!fu.mc.field_1690.field_1903.method_1434()) break block64;
                if (var4_3 || var4_3) ** GOTO lbl6
                var1_4 = this.speedY.getValue();
                if (var4_3) ** GOTO lbl6
            }
            if (var4_3 || var4_3) ** GOTO lbl6
            if (!fu.mc.field_1690.field_1832.method_1434()) break block65;
            if (var4_3 || var4_3) ** GOTO lbl6
            var1_4 = -this.speedY.getValue();
            if (var4_3) ** GOTO lbl6
        }
        if (var4_3 || var4_3) ** GOTO lbl6
        var3_5 = fu.mc.field_1724.method_18798();
        if (var4_3 || var4_3) ** GOTO lbl6
        fu.mc.field_1724.method_18800(var3_5.field_1352, var1_4, var3_5.field_1350);
        if (var4_3) ** GOTO lbl6
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 3 sources

            {
                if (!var4_3 && !var4_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var5_2 /* !! */  = (int)fu.jpuz("jqwn", jpvd(int ), (int)211);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl105
            }
lbl47:
            // 2 sources

            case 1: {
                var5_2 /* !! */  = (int)fu.jpuz("jqwp", jpvd(int ), (int)212);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 2: {
                var5_2 /* !! */  = (int)fu.jpuz("jqwq", jpvd(int ), (int)213);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl76
            }
            case 3: {
                var5_2 /* !! */  = (int)fu.jpuz("jqws", jpvd(int ), (int)214);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 4: {
                var5_2 /* !! */  = (int)fu.jpuz("jqwu", jpvd(int ), (int)215);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl86
            }
lbl67:
            // 2 sources

            case 5: {
                var5_2 /* !! */  = (int)fu.jpuz("jqwv", jpvd(int ), (int)216);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl86
            }
lbl72:
            // 2 sources

            case 6: {
                var5_2 /* !! */  = (int)fu.jpuz("jqww", jpvd(int ), (int)217);
                if (!var6_1) break;
                throw null;
            }
lbl76:
            // 2 sources

            case 7: {
                var5_2 /* !! */  = (int)fu.jpuz("jqwx", jpvd(int ), (int)218);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl118
            }
lbl81:
            // 2 sources

            case 8: {
                var5_2 /* !! */  = (int)fu.jpuz("jqwy", jpvd(int ), (int)219);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl86:
            // 3 sources

            case 9: {
                var5_2 /* !! */  = (int)fu.jpuz("jqwz", jpvd(int ), (int)220);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl128
            }
            case 10: {
                var5_2 /* !! */  = (int)fu.jpuz("jqxa", jpvd(int ), (int)221);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl169
            }
            case 11: {
                var5_2 /* !! */  = (int)fu.jpuz("jqxb", jpvd(int ), (int)222);
                if (!var6_1) ** GOTO lbl81
                throw null;
            }
lbl100:
            // 2 sources

            case 12: {
                var5_2 /* !! */  = (int)fu.jpuz("jqxc", jpvd(int ), (int)223);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl105:
            // 3 sources

            case 13: {
                var5_2 /* !! */  = (int)fu.jpuz("jqxd", jpvd(int ), (int)224);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl110:
            // 2 sources

            case 14: {
                var5_2 /* !! */  = (int)fu.jpuz("jqxe", jpvd(int ), (int)225);
                if (!var6_1) ** GOTO lbl47
                throw null;
            }
            case 15: {
                var5_2 /* !! */  = (int)fu.jpuz("jqxf", jpvd(int ), (int)226);
                if (!var6_1) ** GOTO lbl100
                throw null;
            }
lbl118:
            // 2 sources

            case 16: {
                var5_2 /* !! */  = (int)fu.jpuz("jqxg", jpvd(int ), (int)227);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl123:
            // 2 sources

            case 17: {
                var5_2 /* !! */  = (int)fu.jpuz("jqxi", jpvd(int ), (int)228);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl128:
            // 3 sources

            case 18: {
                var5_2 /* !! */  = (int)fu.jpuz("jqxk", jpvd(int ), (int)229);
                if (!var6_1) ** GOTO lbl110
                throw null;
            }
            case 19: {
                var5_2 /* !! */  = (int)fu.jpuz("jqxm", jpvd(int ), (int)230);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 20: {
                var5_2 /* !! */  = (int)fu.jpuz("jqxp", jpvd(int ), (int)231);
                if (!var6_1) ** GOTO lbl128
                throw null;
            }
lbl141:
            // 2 sources

            case 21: {
                do {
                    var5_2 /* !! */  = (int)fu.jpuz("jqxr", jpvd(int ), (int)232);
                } while (!var6_1);
                throw null;
            }
lbl146:
            // 5 sources

            case 22: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)fu.jpuz("jqxu", jpvd(int ), (int)233);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl165
                    break;
                }
            }
lbl152:
            // 3 sources

            case 23: {
                var5_2 /* !! */  = (int)fu.jpuz("jqxw", jpvd(int ), (int)234);
                if (!var6_1) ** GOTO lbl146
                throw null;
            }
            case 24: {
                var5_2 /* !! */  = (int)fu.jpuz("jqxy", jpvd(int ), (int)235);
                if (!var6_1) ** GOTO lbl72
                throw null;
            }
            case 25: {
                do {
                    var5_2 /* !! */  = (int)fu.jpuz("jqya", jpvd(int ), (int)236);
                } while (!var6_1);
                throw null;
            }
lbl165:
            // 2 sources

            case 26: {
                var5_2 /* !! */  = (int)fu.jpuz("jqyc", jpvd(int ), (int)237);
                if (!var6_1) ** GOTO lbl105
                throw null;
            }
lbl169:
            // 3 sources

            case 27: {
                var5_2 /* !! */  = (int)fu.jpuz("jqyd", jpvd(int ), (int)238);
                if (!var6_1) ** GOTO lbl67
                throw null;
            }
            case 28: {
                do {
                    var5_2 /* !! */  = (int)fu.jpuz("jqyf", jpvd(int ), (int)239);
                } while (!var6_1);
                throw null;
            }
            case 29: 
        }
        var5_2 /* !! */  = (int)fu.jpuz("jqyi", jpvd(int ), (int)240);
        ** while (!var6_1)
lbl181:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jrri() {
        fu.jpvh[300] = 2043796994;
        fu.jpvh[301] = 1726482835;
        fu.jpvh[302] = -1940070316;
        fu.jpvh[303] = 1534339736;
        fu.jpvh[304] = 2030551954;
        fu.jpvh[305] = -1105636531;
        fu.jpvh[306] = -1823939213;
        fu.jpvh[307] = -1387472777;
        fu.jpvh[308] = -611693494;
        fu.jpvh[309] = 1886510713;
        fu.jpvh[310] = -261506393;
        fu.jpvh[311] = 40980814;
        fu.jpvh[312] = 943789901;
        fu.jpvh[313] = -2020964086;
        fu.jpvh[314] = -2046520225;
        fu.jpvh[315] = 117411733;
        fu.jpvh[316] = 1998880489;
        fu.jpvh[317] = -1945944645;
        fu.jpvh[318] = 820176955;
        fu.jpvh[319] = 334604493;
        fu.jpvh[320] = -904954704;
        fu.jpvh[321] = -1828098205;
        fu.jpvh[322] = -422418482;
        fu.jpvh[323] = 1268230907;
        fu.jpvh[324] = 143207399;
        fu.jpvh[325] = 1249539469;
        fu.jpvh[326] = 1893950373;
        fu.jpvh[327] = -1295164077;
        fu.jpvh[328] = 1958317604;
        fu.jpvh[329] = 1022795335;
        fu.jpvh[330] = -788800888;
        fu.jpvh[331] = -1694574542;
        fu.jpvh[332] = -1395427790;
        fu.jpvh[333] = 120785210;
        fu.jpvh[334] = -822757121;
        fu.jpvh[335] = -355850159;
        fu.jpvh[336] = 1551351095;
        fu.jpvh[337] = 908435450;
        fu.jpvh[338] = -672985833;
        fu.jpvh[339] = 624652599;
        fu.jpvh[340] = 578499173;
        fu.jpvh[341] = 226771695;
        fu.jpvh[342] = -1012319305;
        fu.jpvh[343] = 231218146;
        fu.jpvh[344] = 2001585750;
        fu.jpvh[345] = -827378960;
        fu.jpvh[346] = -585122632;
        fu.jpvh[347] = -1989990669;
        fu.jpvh[348] = 374948175;
        fu.jpvh[349] = 1880556102;
        fu.jpvh[350] = 251379252;
        fu.jpvh[351] = -1508196399;
        fu.jpvh[352] = 155297027;
        fu.jpvh[353] = -259031132;
        fu.jpvh[354] = -960377803;
        fu.jpvh[355] = -1964431134;
        fu.jpvh[356] = -1809468055;
        fu.jpvh[357] = -1988126704;
        fu.jpvh[358] = -159040703;
        fu.jpvh[359] = -1347166553;
        fu.jpvh[360] = -512575626;
        fu.jpvh[361] = -169305527;
        fu.jpvh[362] = -435362228;
        fu.jpvh[363] = -1058722212;
        fu.jpvh[364] = -1047156166;
        fu.jpvh[365] = 1033144899;
        fu.jpvh[366] = -102235977;
        fu.jpvh[367] = 1888109157;
        fu.jpvh[368] = 2092190401;
        fu.jpvh[369] = 145463276;
        fu.jpvh[370] = -526437436;
        fu.jpvh[371] = 992811700;
        fu.jpvh[372] = -289932233;
        fu.jpvh[373] = -1167993983;
        fu.jpvh[374] = 1758144004;
        fu.jpvh[375] = 2059620869;
        fu.jpvh[376] = 1379531420;
        fu.jpvh[377] = -1092662412;
        fu.jpvh[378] = -1560603681;
        fu.jpvh[379] = 324968486;
        fu.jpvh[380] = -542571318;
        fu.jpvh[381] = 450776845;
        fu.jpvh[382] = -1290168442;
        fu.jpvh[383] = 1286811844;
        fu.jpvh[384] = 125853380;
        fu.jpvh[385] = 1950934464;
        fu.jpvh[386] = 1117639154;
        fu.jpvh[387] = 2092135894;
    }

    private static /* synthetic */ void jrrj() {
        fu.jpuw[0] = -5620477535393769488L;
        fu.jpuw[1] = -9113144060168840991L;
        fu.jpuw[2] = -3531109804861902399L;
        fu.jpuw[3] = -6414117778023082367L;
        fu.jpuw[4] = 7197780233019988793L;
        fu.jpuw[5] = -6124603059237233111L;
        fu.jpuw[6] = 1794569717974715663L;
        fu.jpuw[7] = 1649807351863822693L;
        fu.jpuw[8] = -8867193218777801270L;
        fu.jpuw[9] = -6144611208326758029L;
        fu.jpuw[10] = -9221476842869732224L;
        fu.jpuw[11] = 6835092910931413148L;
        fu.jpuw[12] = 1643780282968306691L;
        fu.jpuw[13] = -6773487797091496770L;
        fu.jpuw[14] = 5453988695519001228L;
        fu.jpuw[15] = 8978990294726997153L;
        fu.jpuw[16] = -5508259088646965477L;
        fu.jpuw[17] = 3395234674247879385L;
        fu.jpuw[18] = -8006058082455103185L;
        fu.jpuw[19] = 926798019558716427L;
        fu.jpuw[20] = -9072546392454742225L;
        fu.jpuw[21] = 4098410927630111451L;
        fu.jpuw[22] = -5808223427684949991L;
        fu.jpuw[23] = -7546625971106219308L;
        fu.jpuw[24] = 4666627387333607307L;
        fu.jpuw[25] = -8361679248621778857L;
        fu.jpuw[26] = 7499378251742054608L;
        fu.jpuw[27] = 5147190443195327372L;
        fu.jpuw[28] = -6359301762748869111L;
        fu.jpuw[29] = -6653246829904884093L;
        fu.jpuw[30] = -4146860396462479450L;
        fu.jpuw[31] = -2768407872373420119L;
        fu.jpuw[32] = -5631955025380546424L;
        fu.jpuw[33] = 4269131060843555456L;
        fu.jpuw[34] = -7752767054267250339L;
        fu.jpuw[35] = 5124145263598810079L;
        fu.jpuw[36] = 6597403667162788608L;
        fu.jpuw[37] = -3968847399569132675L;
        fu.jpuw[38] = -5879331213714489105L;
        fu.jpuw[39] = -5714894002920236276L;
        fu.jpuw[40] = 9167915920032401023L;
        fu.jpuw[41] = -1998887600924770271L;
        fu.jpuw[42] = 190522319279328731L;
        fu.jpuw[43] = 1993320078277180182L;
        fu.jpuw[44] = 2116627441714526796L;
        fu.jpuw[45] = -2684279725455544149L;
        fu.jpuw[46] = 7267522603769741153L;
        fu.jpuw[47] = -3379017193954457627L;
        fu.jpuw[48] = 3792832751705702502L;
        fu.jpuw[49] = 3783025571445432286L;
        fu.jpuw[50] = 5193026460452521845L;
        fu.jpuw[51] = 1636356054176259081L;
        fu.jpuw[52] = 961864086665732546L;
        fu.jpuw[53] = 328431304379180376L;
        fu.jpuw[54] = 7146520003105095851L;
        fu.jpuw[55] = -186851076884501973L;
        fu.jpuw[56] = -4957280890605037260L;
        fu.jpuw[57] = -6035481454808833328L;
        fu.jpuw[58] = 5149946862698783533L;
        fu.jpuw[59] = -6475351164518564930L;
        fu.jpuw[60] = 8881956512228345622L;
        fu.jpuw[61] = 7400075921527619576L;
        fu.jpuw[62] = 1774214709671339342L;
        fu.jpuw[63] = -856298043768468831L;
        fu.jpuw[64] = 6495623485880196043L;
        fu.jpuw[65] = 7724436403483159374L;
        fu.jpuw[66] = 5235513697462781761L;
        fu.jpuw[67] = 4291595241170040260L;
        fu.jpuw[68] = 5874542760502848957L;
        fu.jpuw[69] = -7645694600976217196L;
        fu.jpuw[70] = 1399139926620764000L;
        fu.jpuw[71] = -8582138194324075100L;
        fu.jpuw[72] = 7851270853559569474L;
        fu.jpuw[73] = 5523748174974954204L;
        fu.jpuw[74] = -7732189094854756188L;
        fu.jpuw[75] = -8305100828343676721L;
        fu.jpuw[76] = -7352052248817699250L;
        fu.jpuw[77] = 7972119257665768828L;
        fu.jpuw[78] = 5911448735588227906L;
        fu.jpuw[79] = 4270290920938363094L;
        fu.jpuw[80] = -8024983091310492909L;
        fu.jpuw[81] = -4379988179189510790L;
        fu.jpuw[82] = -6408370171540808203L;
        fu.jpuw[83] = 5630910275474068601L;
        fu.jpuw[84] = -7323483090954536526L;
        fu.jpuw[85] = -8402366937135896446L;
        fu.jpuw[86] = -6825676231432960792L;
        fu.jpuw[87] = -2585753554425355279L;
        fu.jpuw[88] = -6025813331765480540L;
        fu.jpuw[89] = 8539658123548799033L;
        fu.jpuw[90] = 2248272421325065718L;
        fu.jpuw[91] = 5019402388759501043L;
        fu.jpuw[92] = 1794790393960838952L;
        fu.jpuw[93] = 1981326819370666773L;
        fu.jpuw[94] = 5770641982002721101L;
        fu.jpuw[95] = 1122312070616611017L;
        fu.jpuw[96] = -5529158697986248971L;
        fu.jpuw[97] = 8944702003041395683L;
        fu.jpuw[98] = 737757559768358773L;
        fu.jpuw[99] = 3534368949854703842L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public kg getSpeedXZ() {
        boolean bl2;
        Object object = ru;
        boolean bl3 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - fu.jpuz("jrmw", jpuu(int ), (int)114);
            }
            switch ((int)object) {
                case -1819816722: {
                    break block16;
                }
                case -1207928208: {
                    callSite = fu.jpuz("jrmy", jpuu(int ), (int)115);
                    continue block16;
                }
                case -559594378: {
                    callSite = fu.jpuz("jrna", jpuu(int ), (int)116);
                    continue block16;
                }
                case 1439771603: {
                    callSite = fu.jpuz("jrnb", jpuu(int ), (int)117);
                    continue block16;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = ru;
        boolean bl5 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite - fu.jpuz("jrnd", jpuu(int ), (int)118);
            }
            switch ((int)object2) {
                case -1819816722: {
                    break block17;
                }
                case -1752456121: {
                    callSite = fu.jpuz("jrnf", jpuu(int ), (int)119);
                    continue block17;
                }
                case 982823575: {
                    callSite = fu.jpuz("jrnh", jpuu(int ), (int)120);
                    continue block17;
                }
                case 1361903549: {
                    callSite = fu.jpuz("jrnj", jpuu(int ), (int)121);
                    continue block17;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = ru - fu.jpuz("jrnl", jpuu(int ), (int)122)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == fu.jpuz("jrnm", jpvd(int ), (int)362)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = fu.jpuz("jrno", jpvd(int ), (int)363);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object4 = ru;
        block19: while (true) {
            switch ((int)object4) {
                case -1819816722: {
                    return this.speedXZ;
                }
                case 1125414020: {
                    object4 = fu.jpuz("jrnt", jpuu(int ), (int)124) - fu.jpuz("jrnr", jpuu(int ), (int)123);
                    continue block19;
                }
            }
            break;
        }
        return this.speedXZ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private double getMotionY2() {
        block74: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = fu.ru - fu.jpuz("jqyp", jpuu(int ), (int)40)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == fu.jpuz("jqyr", jpvd(int ), (int)241)) break;
                v0 /* !! */  = (long)fu.jpuz("jqyt", jpvd(int ), (int)242);
            }
            var3_1 = fu.c;
            v1 /* !! */  = fu.ru;
            if (true) ** GOTO lbl11
            block46: while (true) {
                v1 /* !! */  = (long)(v2 - fu.jpuz("jqyv", jpuu(int ), (int)41));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1819816722: {
                        break block46;
                    }
                    case -1324042230: {
                        v2 = fu.jpuz("jqyw", jpuu(int ), (int)42);
                        continue block46;
                    }
                    case -1309108604: {
                        v2 = fu.jpuz("jqyx", jpuu(int ), (int)43);
                        continue block46;
                    }
                }
                break;
            }
            var2_2 /* !! */  = fu.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = fu.ru - fu.jpuz("jqyz", jpuu(int ), (int)44)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == fu.jpuz("jqza", jpvd(int ), (int)243)) break;
                v3 /* !! */  = (long)fu.jpuz("jqzd", jpvd(int ), (int)244);
            }
            var1_3 = fu.a;
            if (var3_1) {
                throw null;
lbl29:
                // 5 sources

                return (double)fu.jpuz("jqzf", jpyv(int ), (int)45);
            }
            if (var1_3 || var1_3) ** GOTO lbl29
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = fu.ru - fu.jpuz("jqzi", jpuu(int ), (int)46)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == fu.jpuz("jqzj", jpvd(int ), (int)245)) break;
                v4 /* !! */  = (long)fu.jpuz("jqzl", jpvd(int ), (int)246);
            }
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_3 = fu.ru - fu.jpuz("jqzm", jpuu(int ), (int)47)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == fu.jpuz("jqzo", jpvd(int ), (int)247)) break;
                v5 /* !! */  = (long)fu.jpuz("jqzq", jpvd(int ), (int)248);
            }
            v6 = fu.mc.field_1690;
            v7 /* !! */  = fu.ru;
            if (true) ** GOTO lbl47
            block51: while (true) {
                v7 /* !! */  = (long)(fu.jpuz("jqzv", jpuu(int ), (int)49) - fu.jpuz("jqzt", jpuu(int ), (int)48));
lbl47:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1819816722: {
                        break block51;
                    }
                    case 158402733: {
                        continue block51;
                    }
                }
                break;
            }
            v8 = v6.field_1832;
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_4 = fu.ru - fu.jpuz("jqzw", jpuu(int ), (int)50)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == fu.jpuz("jqzy", jpvd(int ), (int)249)) break;
                v9 /* !! */  = (long)fu.jpuz("jqzz", jpvd(int ), (int)250);
            }
            if (!v8.method_1434()) break block74;
            if (var1_3 || var1_3) ** GOTO lbl29
            v10 /* !! */  = fu.ru;
            if (true) ** GOTO lbl64
            block53: while (true) {
                v10 /* !! */  = (long)(v11 - fu.jpuz("jrac", jpuu(int ), (int)51));
lbl64:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1819816722: {
                        break block53;
                    }
                    case -1005019191: {
                        v11 = fu.jpuz("jrad", jpuu(int ), (int)52);
                        continue block53;
                    }
                    case 1490707761: {
                        v11 = fu.jpuz("jraf", jpuu(int ), (int)53);
                        continue block53;
                    }
                    case 1864402983: {
                        v11 = fu.jpuz("jrag", jpuu(int ), (int)54);
                        continue block53;
                    }
                }
                break;
            }
            v12 /* !! */  = fu.ru;
            if (true) ** GOTO lbl80
            block54: while (true) {
                v12 /* !! */  = (long)(fu.jpuz("jrak", jpuu(int ), (int)56) - fu.jpuz("jrai", jpuu(int ), (int)55));
lbl80:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -1819816722: {
                        break block54;
                    }
                    case -209506910: {
                        continue block54;
                    }
                }
                break;
            }
            return -this.speedY.getValue() / fu.jpuz("jram", jpxb(int ), (int)251);
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        v13 /* !! */  = fu.ru;
        if (true) ** GOTO lbl92
        block55: while (true) {
            v13 /* !! */  = (long)(v14 - fu.jpuz("jrao", jpuu(int ), (int)57));
lbl92:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1819816722: {
                    break block55;
                }
                case -1775545407: {
                    v14 = fu.jpuz("jrap", jpuu(int ), (int)58);
                    continue block55;
                }
                case 1515786453: {
                    v14 = fu.jpuz("jrar", jpuu(int ), (int)59);
                    continue block55;
                }
            }
            break;
        }
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_5 = fu.ru - fu.jpuz("jrat", jpuu(int ), (int)60)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == fu.jpuz("jrav", jpvd(int ), (int)252)) break;
            v15 /* !! */  = (long)fu.jpuz("jraw", jpvd(int ), (int)253);
        }
        v16 = fu.mc.field_1690;
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_6 = fu.ru - fu.jpuz("jray", jpuu(int ), (int)61)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == fu.jpuz("jraz", jpvd(int ), (int)254)) break;
            v17 /* !! */  = (long)fu.jpuz("jrba", jpvd(int ), (int)255);
        }
        v18 = v16.field_1903;
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_7 = fu.ru - fu.jpuz("jrbc", jpuu(int ), (int)62)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == fu.jpuz("jrbd", jpvd(int ), (int)256)) break;
            v19 /* !! */  = (long)fu.jpuz("jrbe", jpvd(int ), (int)257);
        }
        if (!v18.method_1434()) ** GOTO lbl145
        if (var1_3 || var1_3) ** GOTO lbl29
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_8 = fu.ru - fu.jpuz("jrbh", jpuu(int ), (int)63)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == fu.jpuz("jrbi", jpvd(int ), (int)258)) break;
                    v20 /* !! */  = (long)fu.jpuz("jrbk", jpvd(int ), (int)259);
                }
                v21 /* !! */  = fu.ru;
                if (true) ** GOTO lbl132
                block60: while (true) {
                    v21 /* !! */  = (long)(v22 - fu.jpuz("jrbm", jpuu(int ), (int)64));
lbl132:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1819816722: {
                            break block60;
                        }
                        case -1015720629: {
                            v22 = fu.jpuz("jrbn", jpuu(int ), (int)65);
                            continue block60;
                        }
                        case 1828733626: {
                            v22 = fu.jpuz("jrbp", jpuu(int ), (int)66);
                            continue block60;
                        }
                        case 2105226208: {
                            v22 = fu.jpuz("jrbq", jpuu(int ), (int)67);
                            continue block60;
                        }
                    }
                    break;
                }
                return this.speedY.getValue() / fu.jpuz("jrbs", jpxb(int ), (int)260);
            }
lbl145:
            // 1 sources

            if (var1_3 || var1_3) ** continue;
            return 0.0;
lbl147:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)fu.jpuz("jrbv", jpvd(int ), (int)261);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 1: {
                var2_2 /* !! */  = (int)fu.jpuz("jrbx", jpvd(int ), (int)262);
                if (var3_1) {
                    throw null;
                }
            }
lbl156:
            // 5 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)fu.jpuz("jrbz", jpvd(int ), (int)263);
                } while (!var3_1);
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fu.jpuz("jrca", jpvd(int ), (int)264);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl197
                    break;
                }
            }
lbl167:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)fu.jpuz("jrcc", jpvd(int ), (int)265);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl172:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)fu.jpuz("jrce", jpvd(int ), (int)266);
                if (!var3_1) ** GOTO lbl156
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)fu.jpuz("jrcg", jpvd(int ), (int)267);
                if (!var3_1) ** GOTO lbl147
                throw null;
            }
            case 7: {
                do {
                    var2_2 /* !! */  = (int)fu.jpuz("jrci", jpvd(int ), (int)268);
                } while (!var3_1);
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)fu.jpuz("jrck", jpvd(int ), (int)269);
                if (!var3_1) ** GOTO lbl156
                throw null;
            }
lbl189:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)fu.jpuz("jrcm", jpvd(int ), (int)270);
                if (!var3_1) ** GOTO lbl167
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)fu.jpuz("jrco", jpvd(int ), (int)271);
                if (var3_1) {
                    throw null;
                }
            }
lbl197:
            // 4 sources

            case 11: {
                var2_2 /* !! */  = (int)fu.jpuz("jrcq", jpvd(int ), (int)272);
                if (!var3_1) ** GOTO lbl172
                throw null;
            }
            case 12: 
        }
        var2_2 /* !! */  = (int)fu.jpuz("jrcr", jpvd(int ), (int)273);
        ** while (!var3_1)
lbl204:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleVanillaMode() {
        v0 /* !! */  = fu.ru;
        if (true) ** GOTO lbl5
        block52: while (true) {
            v0 /* !! */  = (long)(v1 - fu.jpuz("jqrv", jpuu(int ), (int)11));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1985594001: {
                    v1 = fu.jpuz("jqrx", jpuu(int ), (int)12);
                    continue block52;
                }
                case -1819816722: {
                    break block52;
                }
                case -1281149447: {
                    v1 = fu.jpuz("jqry", jpuu(int ), (int)13);
                    continue block52;
                }
                case -818878051: {
                    v1 = fu.jpuz("jqrz", jpuu(int ), (int)14);
                    continue block52;
                }
            }
            break;
        }
        var6_1 = fu.c;
        v2 /* !! */  = fu.ru;
        if (true) ** GOTO lbl22
        block53: while (true) {
            v2 /* !! */  = (long)(fu.jpuz("jqsb", jpuu(int ), (int)16) - fu.jpuz("jqsa", jpuu(int ), (int)15));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1819816722: {
                    break block53;
                }
                case 152443661: {
                    continue block53;
                }
            }
            break;
        }
        var5_2 /* !! */  = fu.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = fu.ru - fu.jpuz("jqsc", jpuu(int ), (int)17)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == fu.jpuz("jqsd", jpvd(int ), (int)185)) break;
            v3 /* !! */  = (long)fu.jpuz("jqse", jpvd(int ), (int)186);
        }
        var4_3 = fu.a;
        if (var6_1) {
            throw null;
lbl36:
            // 5 sources

            return;
        }
        if (var4_3 || var4_3) ** GOTO lbl36
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = fu.ru - fu.jpuz("jqsh", jpuu(int ), (int)18)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == fu.jpuz("jqsj", jpvd(int ), (int)187)) break;
            v4 /* !! */  = (long)fu.jpuz("jqsl", jpvd(int ), (int)188);
        }
        var1_4 = this.getMotionY();
        if (var4_3 || var4_3) ** GOTO lbl36
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = fu.ru - fu.jpuz("jqso", jpuu(int ), (int)19)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == fu.jpuz("jqsq", jpvd(int ), (int)189)) break;
                    v5 /* !! */  = (long)fu.jpuz("jqss", jpvd(int ), (int)190);
                }
                v6 /* !! */  = fu.ru;
                if (true) ** GOTO lbl58
                block58: while (true) {
                    v6 /* !! */  = (long)(v7 - fu.jpuz("jqsu", jpuu(int ), (int)20));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1864002251: {
                            v7 = fu.jpuz("jqsv", jpuu(int ), (int)21);
                            continue block58;
                        }
                        case -1819816722: {
                            break block58;
                        }
                        case 1490784427: {
                            v7 = fu.jpuz("jqsx", jpuu(int ), (int)22);
                            continue block58;
                        }
                        case 1857092150: {
                            v7 = fu.jpuz("jqsy", jpuu(int ), (int)23);
                            continue block58;
                        }
                    }
                    break;
                }
                v8 = this.speedXZ.getValue();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = fu.ru - fu.jpuz("jqtk", jpuu(int ), (int)24)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == fu.jpuz("jqtn", jpvd(int ), (int)191)) break;
                    v9 /* !! */  = (long)fu.jpuz("jqtw", jpvd(int ), (int)192);
                }
                this.setMotion(v8);
                if (var4_3 || var4_3) ** GOTO lbl36
                v10 /* !! */  = fu.ru;
                if (true) ** GOTO lbl82
                block60: while (true) {
                    v10 /* !! */  = (long)(v11 - fu.jpuz("jqtx", jpuu(int ), (int)25));
lbl82:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1819816722: {
                            break block60;
                        }
                        case -817692885: {
                            v11 = fu.jpuz("jqty", jpuu(int ), (int)26);
                            continue block60;
                        }
                        case -644645525: {
                            v11 = fu.jpuz("jqtz", jpuu(int ), (int)27);
                            continue block60;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = fu.ru - fu.jpuz("jqua", jpuu(int ), (int)28)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == fu.jpuz("jquc", jpvd(int ), (int)193)) break;
                    v12 /* !! */  = (long)fu.jpuz("jque", jpvd(int ), (int)194);
                }
                v13 = fu.mc.field_1724;
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_5 = fu.ru - fu.jpuz("jqug", jpuu(int ), (int)29)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == fu.jpuz("jqui", jpvd(int ), (int)195)) break;
                    v14 /* !! */  = (long)fu.jpuz("jquk", jpvd(int ), (int)196);
                }
                var3_5 = v13.method_18798();
                if (var4_3 || var4_3) ** GOTO lbl36
                v15 /* !! */  = fu.ru;
                if (true) ** GOTO lbl108
                block63: while (true) {
                    v15 /* !! */  = (long)(fu.jpuz("jquo", jpuu(int ), (int)31) - fu.jpuz("jqum", jpuu(int ), (int)30));
lbl108:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1819816722: {
                            break block63;
                        }
                        case 1814894742: {
                            continue block63;
                        }
                    }
                    break;
                }
                v16 /* !! */  = fu.ru;
                if (true) ** GOTO lbl117
                block64: while (true) {
                    v16 /* !! */  = (long)(fu.jpuz("jqus", jpuu(int ), (int)33) - fu.jpuz("jquq", jpuu(int ), (int)32));
lbl117:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1819816722: {
                            break block64;
                        }
                        case -1523187164: {
                            continue block64;
                        }
                    }
                    break;
                }
                v17 = fu.mc.field_1724;
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_6 = fu.ru - fu.jpuz("jquv", jpuu(int ), (int)34)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == fu.jpuz("jqux", jpvd(int ), (int)197)) break;
                    v18 /* !! */  = (long)fu.jpuz("jquy", jpvd(int ), (int)198);
                }
                v19 = var3_5.field_1352;
                v20 /* !! */  = fu.ru;
                if (true) ** GOTO lbl133
                block66: while (true) {
                    v20 /* !! */  = (long)(fu.jpuz("jqvc", jpuu(int ), (int)36) - fu.jpuz("jqva", jpuu(int ), (int)35));
lbl133:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1819816722: {
                            break block66;
                        }
                        case -1413796576: {
                            continue block66;
                        }
                    }
                    break;
                }
                v21 = var3_5.field_1350;
                v22 /* !! */  = fu.ru;
                if (true) ** GOTO lbl143
                block67: while (true) {
                    v22 /* !! */  = (long)(v23 - fu.jpuz("jqvf", jpuu(int ), (int)37));
lbl143:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1819816722: {
                            break block67;
                        }
                        case -1751066162: {
                            v23 = fu.jpuz("jqvh", jpuu(int ), (int)38);
                            continue block67;
                        }
                        case -4842978: {
                            v23 = fu.jpuz("jqvi", jpuu(int ), (int)39);
                            continue block67;
                        }
                    }
                    break;
                }
                v17.method_18800(v19, var1_4, v21);
                if (var4_3 || var4_3) ** continue;
                return;
            }
lbl155:
            // 4 sources

            case 0: {
                var5_2 /* !! */  = (int)fu.jpuz("jqvl", jpvd(int ), (int)199);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 1: {
                var5_2 /* !! */  = (int)fu.jpuz("jqvn", jpvd(int ), (int)200);
                if (!var6_1) ** GOTO lbl155
                throw null;
            }
            case 2: {
                var5_2 /* !! */  = (int)fu.jpuz("jqvo", jpvd(int ), (int)201);
                if (!var6_1) break;
                throw null;
            }
lbl168:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)fu.jpuz("jqvq", jpvd(int ), (int)202);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl179
                    break;
                }
            }
            case 4: {
                var5_2 /* !! */  = (int)fu.jpuz("jqvs", jpvd(int ), (int)203);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl179:
            // 3 sources

            case 5: {
                var5_2 /* !! */  = (int)fu.jpuz("jqvt", jpvd(int ), (int)204);
                if (!var6_1) ** GOTO lbl155
                throw null;
            }
lbl183:
            // 2 sources

            case 6: {
                var5_2 /* !! */  = (int)fu.jpuz("jqvv", jpvd(int ), (int)205);
                if (!var6_1) ** GOTO lbl168
                throw null;
            }
            case 7: {
                var5_2 /* !! */  = (int)fu.jpuz("jqvw", jpvd(int ), (int)206);
                if (!var6_1) ** GOTO lbl183
                throw null;
            }
lbl191:
            // 3 sources

            case 8: {
                do {
                    var5_2 /* !! */  = (int)fu.jpuz("jqvy", jpvd(int ), (int)207);
                } while (!var6_1);
                throw null;
            }
            case 9: {
                var5_2 /* !! */  = (int)fu.jpuz("jqvz", jpvd(int ), (int)208);
                if (!var6_1) ** GOTO lbl191
                throw null;
            }
            case 10: {
                var5_2 /* !! */  = (int)fu.jpuz("jqwb", jpvd(int ), (int)209);
                if (!var6_1) ** GOTO lbl155
                throw null;
            }
            case 11: 
        }
        var5_2 /* !! */  = (int)fu.jpuz("jqwd", jpvd(int ), (int)210);
        ** while (!var6_1)
lbl207:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jrrd() {
        fu.jpvf[200] = 420789913;
        fu.jpvf[201] = -634935538;
        fu.jpvf[202] = 1818744971;
        fu.jpvf[203] = 1993499475;
        fu.jpvf[204] = 602637205;
        fu.jpvf[205] = -487881745;
        fu.jpvf[206] = 1265137502;
        fu.jpvf[207] = -557656716;
        fu.jpvf[208] = 580094223;
        fu.jpvf[209] = -861409425;
        fu.jpvf[210] = 1466727319;
        fu.jpvf[211] = -603067052;
        fu.jpvf[212] = 1344043928;
        fu.jpvf[213] = -99018985;
        fu.jpvf[214] = 1581899227;
        fu.jpvf[215] = 64340837;
        fu.jpvf[216] = -1467764332;
        fu.jpvf[217] = -871958918;
        fu.jpvf[218] = -116652557;
        fu.jpvf[219] = 2069347530;
        fu.jpvf[220] = 1508114790;
        fu.jpvf[221] = -715033676;
        fu.jpvf[222] = -798220091;
        fu.jpvf[223] = -1408188786;
        fu.jpvf[224] = -492392732;
        fu.jpvf[225] = -1885516114;
        fu.jpvf[226] = -105977934;
        fu.jpvf[227] = 1387824821;
        fu.jpvf[228] = -3754540;
        fu.jpvf[229] = -1329342235;
        fu.jpvf[230] = -89866600;
        fu.jpvf[231] = -1806090686;
        fu.jpvf[232] = -678955953;
        fu.jpvf[233] = -1789745472;
        fu.jpvf[234] = 938691452;
        fu.jpvf[235] = -1954178811;
        fu.jpvf[236] = 1930951098;
        fu.jpvf[237] = 405254534;
        fu.jpvf[238] = 2040393149;
        fu.jpvf[239] = 755045709;
        fu.jpvf[240] = 614890934;
        fu.jpvf[241] = 866962905;
        fu.jpvf[242] = -1237053509;
        fu.jpvf[243] = -1411772501;
        fu.jpvf[244] = 1051214940;
        fu.jpvf[245] = 1107175789;
        fu.jpvf[246] = -357514469;
        fu.jpvf[247] = 1542814511;
        fu.jpvf[248] = 702438622;
        fu.jpvf[249] = -1045883669;
        fu.jpvf[250] = -1978968214;
        fu.jpvf[251] = -2058015216;
        fu.jpvf[252] = -1825458154;
        fu.jpvf[253] = 1046710524;
        fu.jpvf[254] = 1592341660;
        fu.jpvf[255] = 1451955497;
        fu.jpvf[256] = 1546111491;
        fu.jpvf[257] = 1123581303;
        fu.jpvf[258] = -510919875;
        fu.jpvf[259] = 1763537034;
        fu.jpvf[260] = 996595026;
        fu.jpvf[261] = -1807945352;
        fu.jpvf[262] = 1182458998;
        fu.jpvf[263] = -797629685;
        fu.jpvf[264] = -1726054759;
        fu.jpvf[265] = -1996512483;
        fu.jpvf[266] = -1456254137;
        fu.jpvf[267] = 72075654;
        fu.jpvf[268] = -1531071849;
        fu.jpvf[269] = -1296012184;
        fu.jpvf[270] = -301078829;
        fu.jpvf[271] = -874895874;
        fu.jpvf[272] = -33415521;
        fu.jpvf[273] = -1682137151;
        fu.jpvf[274] = 972218693;
        fu.jpvf[275] = 87285089;
        fu.jpvf[276] = 1123199615;
        fu.jpvf[277] = -1448470191;
        fu.jpvf[278] = 2055966300;
        fu.jpvf[279] = 457161430;
        fu.jpvf[280] = 1352943583;
        fu.jpvf[281] = -1258177543;
        fu.jpvf[282] = 1786753588;
        fu.jpvf[283] = 1546263247;
        fu.jpvf[284] = 187664618;
        fu.jpvf[285] = -1840771927;
        fu.jpvf[286] = 1733773415;
        fu.jpvf[287] = -541303186;
        fu.jpvf[288] = -226115133;
        fu.jpvf[289] = 1835937502;
        fu.jpvf[290] = 1365011744;
        fu.jpvf[291] = 1629335566;
        fu.jpvf[292] = 1789066205;
        fu.jpvf[293] = 296338916;
        fu.jpvf[294] = 2048863310;
        fu.jpvf[295] = 2086312915;
        fu.jpvf[296] = -801763907;
        fu.jpvf[297] = 384958985;
        fu.jpvf[298] = 1621696896;
        fu.jpvf[299] = -1705264629;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static fu getInstance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fu.ru - fu.jpuz("jpvb", jpuu(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fu.jpuz("jpvi", jpvd(int ), (int)0)) break;
            v0 /* !! */  = (long)fu.jpuz("jpvl", jpvd(int ), (int)1);
        }
        var2 = fu.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fu.ru - fu.jpuz("jpvn", jpuu(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == fu.jpuz("jpvp", jpvd(int ), (int)2)) break;
            v1 /* !! */  = (long)fu.jpuz("jpvr", jpvd(int ), (int)3);
        }
        var1_1 /* !! */  = fu.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = fu.ru - fu.jpuz("jpvt", jpuu(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == fu.jpuz("jpvv", jpvd(int ), (int)4)) break;
            v2 /* !! */  = (long)fu.jpuz("jpvx", jpvd(int ), (int)5);
        }
        var0_2 = fu.a;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                v3 /* !! */  = fu.ru;
                if (true) ** GOTO lbl34
                block16: while (true) {
                    v3 /* !! */  = (long)(v4 - fu.jpuz("jpwa", jpuu(int ), (int)3));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1819816722: {
                            break block16;
                        }
                        case -1604017704: {
                            v4 = fu.jpuz("jpwc", jpuu(int ), (int)4);
                            continue block16;
                        }
                        case -871852706: {
                            v4 = fu.jpuz("jpwe", jpuu(int ), (int)5);
                            continue block16;
                        }
                        case -785838673: {
                            v4 = fu.jpuz("jpwg", jpuu(int ), (int)6);
                            continue block16;
                        }
                    }
                    break;
                }
                return nj.get(fu.class);
            }
lbl47:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)fu.jpuz("jpwi", jpvd(int ), (int)6);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)fu.jpuz("jpwl", jpvd(int ), (int)7);
                if (!var2) ** GOTO lbl47
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)fu.jpuz("jpwn", jpvd(int ), (int)8);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)fu.jpuz("jpwr", jpvd(int ), (int)9);
        ** while (!var2)
lbl63:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jrrl() {
        fu.jpux[0] = -7157334220138980450L;
        fu.jpux[1] = 5955467339813136293L;
        fu.jpux[2] = -5300817249625704446L;
        fu.jpux[3] = -5345223239683503205L;
        fu.jpux[4] = -8948377943841981893L;
        fu.jpux[5] = -3742210460595887139L;
        fu.jpux[6] = 7793227840365424200L;
        fu.jpux[7] = 2975739547891980253L;
        fu.jpux[8] = -8867193218777801270L;
        fu.jpux[9] = -1535176989713055373L;
        fu.jpux[10] = -4600783625187603328L;
        fu.jpux[11] = 5067869618518247581L;
        fu.jpux[12] = -6136872657146634288L;
        fu.jpux[13] = -426662742726966903L;
        fu.jpux[14] = -4534253516932424789L;
        fu.jpux[15] = -2238870195209495781L;
        fu.jpux[16] = 4154831852773919670L;
        fu.jpux[17] = -6702107618083413724L;
        fu.jpux[18] = -2599494517398969266L;
        fu.jpux[19] = 8136954848883378017L;
        fu.jpux[20] = -4707187047475077951L;
        fu.jpux[21] = -8439293028449521866L;
        fu.jpux[22] = -9083769201092274118L;
        fu.jpux[23] = -7144135395124884634L;
        fu.jpux[24] = -1981145233443317504L;
        fu.jpux[25] = 5368010437381476336L;
        fu.jpux[26] = -4211425269114684526L;
        fu.jpux[27] = -5620153254501808612L;
        fu.jpux[28] = -2537331217844263346L;
        fu.jpux[29] = -916612480493340966L;
        fu.jpux[30] = -4690868177326279239L;
        fu.jpux[31] = -8481694025775691455L;
        fu.jpux[32] = 8231535661972765609L;
        fu.jpux[33] = 193542627763780804L;
        fu.jpux[34] = -3486816703573829953L;
        fu.jpux[35] = -254621265869218352L;
        fu.jpux[36] = 4050635207496784774L;
        fu.jpux[37] = 8331277419940238867L;
        fu.jpux[38] = 4647992597044360604L;
        fu.jpux[39] = 60231209308950276L;
        fu.jpux[40] = 3857786187833194003L;
        fu.jpux[41] = 7720029994028090836L;
        fu.jpux[42] = 6266669522150976796L;
        fu.jpux[43] = -7438999692669143088L;
        fu.jpux[44] = 5578594608456565612L;
        fu.jpux[45] = -1912730587943684581L;
        fu.jpux[46] = 10445745984908412L;
        fu.jpux[47] = 5536159272186680999L;
        fu.jpux[48] = 957386617384242188L;
        fu.jpux[49] = -3052464513263152625L;
        fu.jpux[50] = -533279087006159003L;
        fu.jpux[51] = 1803356834044889884L;
        fu.jpux[52] = -6731852304796120461L;
        fu.jpux[53] = 8483853377767043635L;
        fu.jpux[54] = -6007261389197646590L;
        fu.jpux[55] = 3753645867059792744L;
        fu.jpux[56] = 4834990410769614150L;
        fu.jpux[57] = 7787192778373071238L;
        fu.jpux[58] = 2064363571655590086L;
        fu.jpux[59] = -7135289149188147271L;
        fu.jpux[60] = 317757791168256376L;
        fu.jpux[61] = 8904226157141137666L;
        fu.jpux[62] = -1773440818270013890L;
        fu.jpux[63] = -1779164094131710278L;
        fu.jpux[64] = -4638287997343924565L;
        fu.jpux[65] = -2350943355897176574L;
        fu.jpux[66] = 2008837539411528738L;
        fu.jpux[67] = -816062205264247035L;
        fu.jpux[68] = -6688304504124488442L;
        fu.jpux[69] = 1861357736959845158L;
        fu.jpux[70] = -6129591446072995718L;
        fu.jpux[71] = -5255834711768302113L;
        fu.jpux[72] = -1055120867025937240L;
        fu.jpux[73] = -5472007861572570302L;
        fu.jpux[74] = 905703998503309077L;
        fu.jpux[75] = 3396445892218576526L;
        fu.jpux[76] = -1141784083101909139L;
        fu.jpux[77] = -7909891097792445495L;
        fu.jpux[78] = 2454108176366129294L;
        fu.jpux[79] = 6922995771485735825L;
        fu.jpux[80] = -8332994081298486802L;
        fu.jpux[81] = 4390431180258355249L;
        fu.jpux[82] = -6081162591160281321L;
        fu.jpux[83] = -8088028450923641662L;
        fu.jpux[84] = 3417848166062029103L;
        fu.jpux[85] = 6340100441424553624L;
        fu.jpux[86] = 6303662113123484220L;
        fu.jpux[87] = 9089454546130903242L;
        fu.jpux[88] = 629606706410386377L;
        fu.jpux[89] = -5462246440629786522L;
        fu.jpux[90] = -6355010421234892405L;
        fu.jpux[91] = -3876886678726787446L;
        fu.jpux[92] = 2332374695483795303L;
        fu.jpux[93] = -5533756152987795553L;
        fu.jpux[94] = -1548513574855284844L;
        fu.jpux[95] = 747661631770990331L;
        fu.jpux[96] = 6112354251837014446L;
        fu.jpux[97] = 7573951187139111048L;
        fu.jpux[98] = -4433651822659823744L;
        fu.jpux[99] = 2230220719976515821L;
    }

    private static /* synthetic */ void jrrh() {
        fu.jpvh[200] = 420789906;
        fu.jpvh[201] = -634935537;
        fu.jpvh[202] = 1818744970;
        fu.jpvh[203] = 1993499473;
        fu.jpvh[204] = 602637213;
        fu.jpvh[205] = -487881745;
        fu.jpvh[206] = 1265137499;
        fu.jpvh[207] = -557656717;
        fu.jpvh[208] = 580094221;
        fu.jpvh[209] = -861409433;
        fu.jpvh[210] = 1466727327;
        fu.jpvh[211] = -603067044;
        fu.jpvh[212] = 1344043914;
        fu.jpvh[213] = -99018994;
        fu.jpvh[214] = 1581899219;
        fu.jpvh[215] = 64340862;
        fu.jpvh[216] = -1467764321;
        fu.jpvh[217] = -871958922;
        fu.jpvh[218] = -116652560;
        fu.jpvh[219] = 2069347545;
        fu.jpvh[220] = 1508114812;
        fu.jpvh[221] = -715033695;
        fu.jpvh[222] = -798220085;
        fu.jpvh[223] = -1408188788;
        fu.jpvh[224] = -492392713;
        fu.jpvh[225] = -1885516108;
        fu.jpvh[226] = -105977921;
        fu.jpvh[227] = 1387824814;
        fu.jpvh[228] = -3754540;
        fu.jpvh[229] = -1329342230;
        fu.jpvh[230] = -89866616;
        fu.jpvh[231] = -1806090658;
        fu.jpvh[232] = -678955963;
        fu.jpvh[233] = -1789745461;
        fu.jpvh[234] = 938691441;
        fu.jpvh[235] = -1954178792;
        fu.jpvh[236] = 1930951091;
        fu.jpvh[237] = 405254556;
        fu.jpvh[238] = 2040393138;
        fu.jpvh[239] = 755045706;
        fu.jpvh[240] = 614890942;
        fu.jpvh[241] = -866962906;
        fu.jpvh[242] = -1277181054;
        fu.jpvh[243] = 1411772500;
        fu.jpvh[244] = 1440085983;
        fu.jpvh[245] = -1107175790;
        fu.jpvh[246] = 420026335;
        fu.jpvh[247] = 1542814510;
        fu.jpvh[248] = 2075319037;
        fu.jpvh[249] = -1045883670;
        fu.jpvh[250] = 352631047;
        fu.jpvh[251] = -997904880;
        fu.jpvh[252] = 1825458153;
        fu.jpvh[253] = -1261307627;
        fu.jpvh[254] = -1592341661;
        fu.jpvh[255] = 324997003;
        fu.jpvh[256] = -1546111492;
        fu.jpvh[257] = 1528136507;
        fu.jpvh[258] = 510919874;
        fu.jpvh[259] = -1851980722;
        fu.jpvh[260] = 2058802514;
        fu.jpvh[261] = -1807945347;
        fu.jpvh[262] = 1182458992;
        fu.jpvh[263] = -797629689;
        fu.jpvh[264] = -1726054755;
        fu.jpvh[265] = -1996512481;
        fu.jpvh[266] = -1456254133;
        fu.jpvh[267] = 72075658;
        fu.jpvh[268] = -1531071853;
        fu.jpvh[269] = -1296012189;
        fu.jpvh[270] = -301078827;
        fu.jpvh[271] = -874895877;
        fu.jpvh[272] = -33415523;
        fu.jpvh[273] = -1682137139;
        fu.jpvh[274] = -972218694;
        fu.jpvh[275] = 162993794;
        fu.jpvh[276] = 1123199614;
        fu.jpvh[277] = 761574138;
        fu.jpvh[278] = 2055966301;
        fu.jpvh[279] = 806476531;
        fu.jpvh[280] = 1352943582;
        fu.jpvh[281] = 2012956474;
        fu.jpvh[282] = -1786753589;
        fu.jpvh[283] = 975389169;
        fu.jpvh[284] = -187664619;
        fu.jpvh[285] = -1285767528;
        fu.jpvh[286] = -1733773416;
        fu.jpvh[287] = 111148275;
        fu.jpvh[288] = 226115132;
        fu.jpvh[289] = 899553635;
        fu.jpvh[290] = 1365011745;
        fu.jpvh[291] = 2119983112;
        fu.jpvh[292] = 1789066204;
        fu.jpvh[293] = -1597222856;
        fu.jpvh[294] = -2048863311;
        fu.jpvh[295] = 1173910302;
        fu.jpvh[296] = -801763913;
        fu.jpvh[297] = 384958991;
        fu.jpvh[298] = 1621696903;
        fu.jpvh[299] = -1705264626;
    }
}

