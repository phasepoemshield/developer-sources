/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.render;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.a_0;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.event.events.HandSwingEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.ModeSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Arm;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import org.jetbrains.annotations.NotNull;
import org.joml.Quaternionfc;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001c"}, d2={"Lkotakbaz/rain/module/modules/render/SwingAnimationModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "Lkotakbaz/rain/event/events/HandSwingEvent;", "event", "", "onHandSwing", "(Lkotakbaz/rain/event/events/HandSwingEvent;)V", "Lnet/minecraft/class_4587;", "matrices", "Lnet/minecraft/class_1306;", "arm", "applyEquipOffset", "(Lnet/minecraft/class_4587;Lnet/minecraft/class_1306;)V", "", "MODE_1", "I", "MODE_2", "MODE_3", "MODE_4", "MODE_5", "Lkotakbaz/rain/module/setting/ModeSetting;", "modeSetting", "Lkotakbaz/rain/module/setting/ModeSetting;", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "strength", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "rain-visuals"})
public final class SwingAnimationModule
extends Module {
    @NotNull
    public static final SwingAnimationModule INSTANCE;
    private static final int a = 0;
    private static final int A = 1;
    private static final int b = 2;
    private static final int B = 3;
    private static final int c = 4;
    @NotNull
    private static final ModeSetting C;
    @NotNull
    private static final SliderSetting d;
    private static Object[] D;
    private static Object E;
    private static Object[] f;
    private static Object[] e;
    private static Object[] F;
    public static int[] g;

    private SwingAnimationModule() {
        int n2 = g[0];
        n2 -= g[1];
        int n3 = g[3];
        n3 ^= g[4];
        int n4 = g[6];
        n4 ^= g[7];
        super((String)D[n2 += g[2]], a_0.getRENDER(), (String)D[n3 -= g[5]] + (String)D[n4 += g[8]]);
    }

    @Commando
    public final void onHandSwing(@NotNull HandSwingEvent event) {
        int n2 = g[9];
        n2 += g[10];
        Intrinsics.checkNotNullParameter(event, (String)D[n2 += g[11]]);
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null || (clientPlayerEntity = clientPlayerEntity.getMainArm()) == null) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        if (event.getArm() != clientPlayerEntity2) {
            return;
        }
        MatrixStack matrixStack = event.getMatrices();
        float f2 = event.getSwingProgress();
        float f3 = MathHelper.sin((float)(MathHelper.sqrt((float)f2) * (float)Math.PI));
        float f4 = (float)Math.sin((double)f2 * Double.longBitsToDouble(0x808A4DE3B10CD92CL ^ 0xBF736C18E548F434L) * Double.longBitsToDouble(0xBF07EA6D7F6C5969L ^ 0xFF07EA6D7F6C5969L));
        float f5 = clientPlayerEntity2 == Arm.LEFT ? -1.0f : 1.0f;
        switch (C.getSelectedIndex()) {
            case 0: {
                this.applyEquipOffset(matrixStack, (Arm)clientPlayerEntity2);
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(f5 * (45.0f + f4 * -20.0f)));
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_Z.rotationDegrees(f5 * f3 * -20.0f));
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(f3 * -80.0f));
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(f5 * -45.0f));
                break;
            }
            case 1: {
                this.applyEquipOffset(matrixStack, (Arm)clientPlayerEntity2);
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(50.0f));
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(f5 * -60.0f));
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_Z.rotationDegrees(f5 * (110.0f + ((Number)d.getValue()).floatValue() * f3)));
                break;
            }
            case 2: {
                this.applyEquipOffset(matrixStack, (Arm)clientPlayerEntity2);
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(50.0f));
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(f5 * (-30.0f * (1.0f - f3) - 30.0f + (((Number)d.getValue()).floatValue() - 20.0f) * f3)));
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_Z.rotationDegrees(f5 * 110.0f));
                break;
            }
            case 3: {
                this.applyEquipOffset(matrixStack, (Arm)clientPlayerEntity2);
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(f5 * 90.0f));
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_Z.rotationDegrees(f5 * -30.0f));
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(-90.0f - ((Number)d.getValue()).floatValue() * f4 + 10.0f));
                break;
            }
            case 4: {
                float f6 = f2 * -360.0f;
                this.applyEquipOffset(matrixStack, (Arm)clientPlayerEntity2);
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(f6));
            }
        }
        boolean bl = g[12];
        bl += g[13];
        event.setCancel(bl -= g[14]);
    }

    private final void applyEquipOffset(MatrixStack matrices, Arm arm) {
        double d2 = arm == Arm.RIGHT ? 1.0 : Double.longBitsToDouble(0x7F4826C26E2C551EL ^ 0xC0B826C26E2C551EL);
        matrices.translate(d2 * Double.longBitsToDouble(0xDE7A8653B4887772L ^ 0xE19B6DD6AA30269EL), Double.longBitsToDouble(0x3E2595CD9EDEB7EBL ^ 0x81C5361A94E3C74FL), Double.longBitsToDouble(0xFEFA7DA39DCAD221L ^ 0x411D779EED69052BL));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static final boolean strength$lambda$0() {
        int n2;
        if (C.getSelectedIndex() != 0) {
            int n3 = g[15];
            n3 -= g[16];
            if (C.getSelectedIndex() != (n3 += g[17])) {
                int n4 = g[18];
                n4 -= g[19];
                n2 = n4 -= g[20];
                return n2 != 0;
            }
        }
        int n5 = g[21];
        n5 += g[22];
        n2 = n5 ^= g[23];
        return n2 != 0;
    }

    static {
        SwingAnimationModule.b();
        long l2 = -8426668005775696444L;
        long l3 = -2184229173542869762L;
        long l4 = -7763482444336209967L;
        long l5 = -2237809827599698052L;
        long l6 = 59938063347714111L;
        long l7 = -6330727889550094733L;
        long l8 = 2575373433789167083L;
        long l9 = -5773656341374424671L;
        long l10 = -2190667404962200325L;
        long l11 = 3752257247234514212L;
        long l12 = -6852716993254371242L;
        long l13 = 8635499104448885256L;
        long l14 = 25761619070195286L;
        long l15 = 7087810233126353954L;
        int n2 = g[24];
        n2 += g[25];
        D = new Object[n2 ^= g[26]];
        long l16 = l15;
        int n3 = g[27];
        n3 ^= g[28];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= g[29]);
        Object[] objectArray = new Object[g[30]];
        objectArray[SwingAnimationModule.g[31]] = e;
        objectArray[SwingAnimationModule.g[32]] = g[33];
        int n4 = g[34];
        Object object = SwingAnimationModule.A()[g[35]];
        if (object == null) {
            char[] cArray = "\ud919\ud94e\ud92c\ud91b\ud94b\ud946\ud92c\ud941\ud917\ud922\ud94e\ud911\ud94e\ud92e\ud92b\ud8fe\ud933\ud94c\ud932\ud93b\ud938\ud94b\ud939\ud91d\ud942\ud8f5\ud94e\ud8f0\ud8f2\ud924\ud926\ud923\ud920\ud918\ud90f\ud937\ud91a\ud92b\ud91e\ud91e\ud925\ud91f\ud910\ud90f\ud91e\ud90f\ud913\ud948\ud919\ud932\ud922\ud921\ud918\ud93c\ud8f0\ud942\ud924\ud943\ud8fe\ud8f5\ud8f0\ud917\ud93f\ud93d\ud8f8\ud92f\ud920\ud91a\ud917\ud921\ud93a\ud93f\ud91e\ud921\ud93a\ud92e\ud913\ud8fa\ud93c\ud90f\ud91f\ud915\ud92e\ud940\ud91e\ud8ef\ud920\ud932\ud932\ud919\ud921\ud8f2\ud912\ud93e\ud93c\ud8f0\ud921\ud8ef\ud932\ud91d\ud93a\ud8fe\ud935\ud94e\ud915\ud93e\ud935\ud91a\ud8fb\ud919\ud90f\ud941\ud925\ud925\ud925\ud8ef\ud91c\ud942\ud943\ud944\ud924\ud910\ud912\ud8fa\ud943\ud926\ud923\ud8fe\ud923\ud91c\ud925\ud93a\ud931\ud933\ud91f\ud937\ud941\ud925\ud8fa\ud93e\ud918\ud8fe\ud92b\ud940\ud8fc\ud919\ud8f0\ud94b\ud921\ud942\ud921\ud92f\ud911\ud922\ud8fc\ud941\ud8f2\ud91c\ud8ef\ud906\ud91a\ud931\ud941\ud94e\ud931\ud925\ud8f2\ud924\ud921\ud911\ud8fb\ud939\ud942\ud925\ud8fa\ud91d\ud91a\ud915\ud937\ud93a\ud940\ud93c\ud935\ud910\ud93b\ud8ef\ud8f0\ud931\ud913\ud946\ud92c\ud8fc".toCharArray();
            for (int i2 = g[36]; i2 < g[37]; ++i2) {
                int n5 = cArray[i2];
                n5 -= g[38];
                n5 += g[39];
                n5 ^= g[40];
                n5 ^= g[41];
                n5 ^= g[42];
                n5 -= g[43];
                n5 += g[44];
                n5 -= g[45];
                n5 += g[46];
                n5 += g[47];
                cArray[i2] = (char)(n5 ^= g[48]);
            }
            object = SwingAnimationModule.A()[SwingAnimationModule.g[49]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)SwingAnimationModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = g[50];
        n6 ^= g[51];
        l6 = l17 ^ (0x5200000000L ^ l17) & -1L << (n6 ^= g[52]);
        long l18 = l13;
        int n7 = g[53];
        n7 += g[54];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += g[55]);
        while (true) {
            int n8 = g[56];
            n8 -= g[57];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= g[58]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = g[59];
            n10 ^= g[60];
            int n11 = g[62];
            n11 += g[63];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += g[61])) & -1L >>> (n11 -= g[64]);
            long l20 = l9;
            int n12 = g[65];
            n12 -= g[66];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= g[67]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = g[68];
            n14 += g[69];
            int n15 = g[71];
            n15 -= g[72];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= g[70])) & -1L >>> (n15 ^= g[73]);
            int n16 = g[74];
            n16 ^= g[75];
            long l22 = l10;
            int n17 = g[77];
            n17 += g[78];
            l10 = l22 ^ ((long)cArray[n13] << (n16 += g[76]) ^ l22) & -1L << (n17 += g[79]);
            int n18 = g[80];
            n18 -= g[81];
            n18 -= g[82];
            int n19 = g[83];
            n19 ^= g[84];
            long l23 = l12;
            int n20 = g[86];
            n20 -= g[87];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= g[85]))) ^ l23) & -1L >>> (n20 ^= g[88]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = g[89];
            n21 ^= g[90];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= g[91]);
            while (true) {
                int n22 = g[92];
                n22 -= g[93];
                if ((int)(l14 >>> (n22 += g[94])) >= (int)l12) break;
                int n23 = g[95];
                n23 += g[96];
                int n24 = g[98];
                n24 += g[99];
                cArray2[(int)(l14 >>> (n23 ^= SwingAnimationModule.g[97]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += g[100]))];
                l14 += 0x100000000L;
            }
            int n25 = g[101];
            n25 += g[102];
            int n26 = (int)(l15 >>> (n25 += g[103]));
            l15 += 0x100000000L;
            SwingAnimationModule.D[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = g[104];
            n27 -= g[105];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= g[106]);
        }
        INSTANCE = new SwingAnimationModule();
        int n28 = g[107];
        n28 ^= g[108];
        n28 ^= g[109];
        int n29 = g[110];
        n29 -= g[111];
        String[] stringArray = new String[n29 -= g[112]];
        int n30 = g[113];
        n30 += g[114];
        int n31 = g[116];
        n31 -= g[117];
        stringArray[n30 += SwingAnimationModule.g[115]] = (String)D[n31 -= g[118]];
        int n32 = g[119];
        n32 += g[120];
        int n33 = g[122];
        n33 -= g[123];
        stringArray[n32 ^= SwingAnimationModule.g[121]] = (String)D[n33 ^= g[124]];
        int n34 = g[125];
        n34 -= g[126];
        int n35 = g[128];
        n35 ^= g[129];
        stringArray[n34 += SwingAnimationModule.g[127]] = (String)D[n35 -= g[130]];
        int n36 = g[131];
        n36 -= g[132];
        int n37 = g[134];
        n37 -= g[135];
        stringArray[n36 -= SwingAnimationModule.g[133]] = (String)D[n37 -= g[136]];
        int n38 = g[137];
        n38 -= g[138];
        int n39 = g[140];
        n39 -= g[141];
        stringArray[n38 += SwingAnimationModule.g[139]] = (String)D[n39 += g[142]];
        int n40 = g[143];
        n40 += g[144];
        int n41 = g[146];
        n41 -= g[147];
        C = Module.mode$default(INSTANCE, (String)D[n28], CollectionsKt.listOf(stringArray), n40 -= g[145], n41 ^= g[148], null);
        int n42 = g[149];
        n42 ^= g[150];
        d = INSTANCE.slider((String)D[n42 -= g[151]], 20.0f, 20.0f, 75.0f, 0.1f).setVisible(SwingAnimationModule::strength$lambda$0);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[g[152]];
        String string = (String)object[g[153]];
        object = object[g[154]];
        Object[] objectArray = f;
        if (f == null) {
            objectArray = f = new Object[g[155]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[g[156]];
                e = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[g[158] ^ g[159]];
                byArray[SwingAnimationModule.g[160] ^ SwingAnimationModule.g[161]] = g[162] ^ g[163];
                byArray[SwingAnimationModule.g[164] ^ SwingAnimationModule.g[165]] = g[166] ^ g[167];
                byArray[SwingAnimationModule.g[168] ^ SwingAnimationModule.g[169]] = g[170] ^ g[171];
                byArray[SwingAnimationModule.g[172] ^ SwingAnimationModule.g[173]] = g[174] ^ g[175];
                byArray[SwingAnimationModule.g[176] ^ SwingAnimationModule.g[177]] = g[178] ^ g[179];
                byArray[SwingAnimationModule.g[180] ^ SwingAnimationModule.g[181]] = g[182] ^ g[183];
                byArray[SwingAnimationModule.g[184] ^ SwingAnimationModule.g[185]] = g[186] ^ g[187];
                byArray[SwingAnimationModule.g[188] ^ SwingAnimationModule.g[189]] = g[190] ^ g[191];
                byArray[SwingAnimationModule.g[192] ^ SwingAnimationModule.g[193]] = g[194] ^ g[195];
                byArray[SwingAnimationModule.g[196] ^ SwingAnimationModule.g[197]] = g[198] ^ g[199];
                byArray[SwingAnimationModule.g[200] ^ SwingAnimationModule.g[201]] = g[202] ^ g[203];
                byArray[SwingAnimationModule.g[204] ^ SwingAnimationModule.g[205]] = g[206] ^ g[207];
                byArray[SwingAnimationModule.g[208] ^ SwingAnimationModule.g[209]] = g[210] ^ g[211];
                byArray[SwingAnimationModule.g[212] ^ SwingAnimationModule.g[213]] = g[214] ^ g[215];
                byArray[SwingAnimationModule.g[216] ^ SwingAnimationModule.g[217]] = g[218] ^ g[219];
                byArray[SwingAnimationModule.g[220] ^ SwingAnimationModule.g[221]] = g[222] ^ g[223];
                objectArray2[SwingAnimationModule.g[157]] = byArray;
            }
            byte[] byArray = (byte[])object3[g[224]];
            if (E == null) {
                byte[] byArray2 = new byte[g[225] ^ g[226]];
                byArray2[SwingAnimationModule.g[227] ^ SwingAnimationModule.g[228]] = g[229] ^ g[230];
                byArray2[SwingAnimationModule.g[231] ^ SwingAnimationModule.g[232]] = g[233] ^ g[234];
                byArray2[SwingAnimationModule.g[235] ^ SwingAnimationModule.g[236]] = g[237] ^ g[238];
                byArray2[SwingAnimationModule.g[239] ^ SwingAnimationModule.g[240]] = g[241] ^ g[242];
                byArray2[SwingAnimationModule.g[243] ^ SwingAnimationModule.g[244]] = g[245] ^ g[246];
                byArray2[SwingAnimationModule.g[247] ^ SwingAnimationModule.g[248]] = g[249] ^ g[250];
                byArray2[SwingAnimationModule.g[251] ^ SwingAnimationModule.g[252]] = g[253] ^ g[254];
                byArray2[SwingAnimationModule.g[255] ^ SwingAnimationModule.g[256]] = g[257] ^ g[258];
                byArray2[SwingAnimationModule.g[259] ^ SwingAnimationModule.g[260]] = g[261] ^ g[262];
                byArray2[SwingAnimationModule.g[263] ^ SwingAnimationModule.g[264]] = g[265] ^ g[266];
                byArray2[SwingAnimationModule.g[267] ^ SwingAnimationModule.g[268]] = g[269] ^ g[270];
                byArray2[SwingAnimationModule.g[271] ^ SwingAnimationModule.g[272]] = g[273] ^ g[274];
                byArray2[SwingAnimationModule.g[275] ^ SwingAnimationModule.g[276]] = g[277] ^ g[278];
                byArray2[SwingAnimationModule.g[279] ^ SwingAnimationModule.g[280]] = g[281] ^ g[282];
                byArray2[SwingAnimationModule.g[283] ^ SwingAnimationModule.g[284]] = g[285] ^ g[286];
                byArray2[SwingAnimationModule.g[287] ^ SwingAnimationModule.g[288]] = g[289] ^ g[290];
                byArray2[SwingAnimationModule.g[291] ^ SwingAnimationModule.g[292]] = g[293] ^ g[294];
                byArray2[SwingAnimationModule.g[295] ^ SwingAnimationModule.g[296]] = g[297] ^ g[298];
                byArray2[SwingAnimationModule.g[299] ^ SwingAnimationModule.g[300]] = g[301] ^ g[302];
                byArray2[SwingAnimationModule.g[303] ^ SwingAnimationModule.g[304]] = g[305] ^ g[306];
                byArray2[SwingAnimationModule.g[307] ^ SwingAnimationModule.g[308]] = g[309] ^ g[310];
                byArray2[SwingAnimationModule.g[311] ^ SwingAnimationModule.g[312]] = g[313] ^ g[314];
                byArray2[SwingAnimationModule.g[315] ^ SwingAnimationModule.g[316]] = g[317] ^ g[318];
                byArray2[SwingAnimationModule.g[319] ^ SwingAnimationModule.g[320]] = g[321] ^ g[322];
                byArray2[SwingAnimationModule.g[323] ^ SwingAnimationModule.g[324]] = g[325] ^ g[326];
                byArray2[SwingAnimationModule.g[327] ^ SwingAnimationModule.g[328]] = g[329] ^ g[330];
                byArray2[SwingAnimationModule.g[331] ^ SwingAnimationModule.g[332]] = g[333] ^ g[334];
                byArray2[SwingAnimationModule.g[335] ^ SwingAnimationModule.g[336]] = g[337] ^ g[338];
                byArray2[SwingAnimationModule.g[339] ^ SwingAnimationModule.g[340]] = g[341] ^ g[342];
                byArray2[SwingAnimationModule.g[343] ^ SwingAnimationModule.g[344]] = g[345] ^ g[346];
                byArray2[SwingAnimationModule.g[347] ^ SwingAnimationModule.g[348]] = g[349] ^ g[350];
                byArray2[SwingAnimationModule.g[351] ^ SwingAnimationModule.g[352]] = g[353] ^ g[354];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, g[355], byArray3, g[356], byArray.length);
                System.arraycopy(byArray2, g[357], byArray3, byArray.length, byArray2.length);
                Object object4 = SwingAnimationModule.A()[g[358]];
                if (object4 == null) {
                    char[] cArray = "\ub5fa\ub5e0\ub5f7\ub5de\ub5e4\ub610\ub5b3\ub599\ub5ce\ub582\ub5e2\ub59d\ub581\ub57f\ub5af\ub5e2\ub5e1\ub611".toCharArray();
                    for (int i2 = g[359]; i2 < g[360]; ++i2) {
                        int n3 = cArray[i2];
                        n3 += g[361];
                        n3 += g[362];
                        n3 ^= g[363];
                        n3 ^= g[364];
                        n3 -= g[365];
                        n3 -= g[366];
                        n3 -= g[367];
                        n3 -= g[368];
                        n3 -= g[369];
                        n3 -= g[370];
                        n3 ^= g[371];
                        cArray[i2] = (char)(n3 -= g[372]);
                    }
                    object4 = SwingAnimationModule.A()[SwingAnimationModule.g[373]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[g[374]];
                byArray4[SwingAnimationModule.g[375]] = g[376];
                byArray4[SwingAnimationModule.g[377]] = g[378];
                byArray4[SwingAnimationModule.g[379]] = g[380];
                byArray4[SwingAnimationModule.g[381]] = g[382];
                byArray4[SwingAnimationModule.g[383]] = g[384];
                byArray4[SwingAnimationModule.g[385]] = g[386];
                byArray4[SwingAnimationModule.g[387]] = g[388];
                byArray4[SwingAnimationModule.g[389]] = g[390];
                byArray4[SwingAnimationModule.g[391]] = g[392];
                byArray4[SwingAnimationModule.g[393]] = g[394];
                byArray4[SwingAnimationModule.g[395]] = g[396];
                byArray4[SwingAnimationModule.g[397]] = g[398];
                byArray4[SwingAnimationModule.g[399]] = 98;
                byArray4[8] = -48;
                byArray4[10] = -109;
                byArray4[2] = -79;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 24, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = SwingAnimationModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u0fb5\u0f81\u0f13".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 ^= 0xBF41;
                        n4 ^= 0x5662;
                        n4 -= 37796;
                        n4 ^= 0xBDC5;
                        n4 -= 45579;
                        n4 -= 12975;
                        n4 -= 3794;
                        n4 += 28915;
                        n4 += 48502;
                        n4 -= 57367;
                        n4 ^= 0x87F9;
                        n4 -= 3097;
                        n4 += 12346;
                        n4 ^= 0x11BB;
                        n4 -= 35996;
                        n4 ^= 0x45BD;
                        cArray[i3] = (char)(n4 ^= 0x12FE);
                    }
                    object5 = SwingAnimationModule.A()[2] = new String(cArray);
                }
                E = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = SwingAnimationModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\u5f2e\u5f3a\u5f38\u605c\u5f28\u5f29\u5f28\u605c\u5f3f\u5f30\u5f28\u5f38\u5eaa\u5f3f\u5f0e\u5f1b\u5f1b\u5f16\u5f1d\u5f14".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 += 47488;
                    n5 ^= 0xD23;
                    n5 -= 52789;
                    n5 -= 58710;
                    n5 -= 54903;
                    n5 += 50808;
                    n5 -= 46184;
                    n5 += 13352;
                    n5 ^= 0xDD9A;
                    n5 ^= 0x14DC;
                    cArray[i4] = (char)(n5 += 59324);
                }
                object6 = SwingAnimationModule.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)E), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = F;
        if (F == null) {
            F = new Object[4];
            objectArray = F;
        }
        return objectArray;
    }

    public static void b() {
        g = new int[0xD4E1 ^ 0xD571];
        SwingAnimationModule.g[0xD46E ^ 0xD417] = 0xD433 ^ 0xD417;
        SwingAnimationModule.g[0x9295 ^ 0x92D4] = 0x92E1 ^ 0x92D4;
        SwingAnimationModule.g[0x5F6 ^ 0x535] = 0xE897 ^ 0x535;
        SwingAnimationModule.g[0x8A10 ^ 0x8A80] = 0xFFFF750E ^ 0x8A80;
        SwingAnimationModule.g[0xB859 ^ 0xB846] = 0xB846 ^ 0xB846;
        SwingAnimationModule.g[0x55CA ^ 0x54EB] = 0xFFFF12C5 ^ 0x54EB;
        SwingAnimationModule.g[0x2151 ^ 0x21C8] = 0x21CA ^ 0x21C8;
        SwingAnimationModule.g[0x29D5 ^ 0x2850] = 0x285C ^ 0x2850;
        SwingAnimationModule.g[0xB5E8 ^ 0xB53A] = 0xFDBA ^ 0xB53A;
        SwingAnimationModule.g[0x60F7 ^ 0x61F1] = 0xF52 ^ 0x61F1;
        SwingAnimationModule.g[0x5D5B ^ 0x5C3A] = 0xFFFFAC5F ^ 0x5C3A;
        SwingAnimationModule.g[0x17D5 ^ 0x17CB] = 0x17C8 ^ 0x17CB;
        SwingAnimationModule.g[0x21D5 ^ 0x21C3] = 0xFFFFDE70 ^ 0x21C3;
        SwingAnimationModule.g[0xC632 ^ 0xC736] = 0xA995 ^ 0xC736;
        SwingAnimationModule.g[0x9DE2 ^ 0x9DE9] = 0xFFFF626B ^ 0x9DE9;
        SwingAnimationModule.g[0xFFE0 ^ 0xFF7E] = 0xF975 ^ 0xFF7E;
        SwingAnimationModule.g[0x4859 ^ 0x48EB] = 0x14E41 ^ 0x48EB;
        SwingAnimationModule.g[0x7C50 ^ 0x7C6E] = 0xFFFF8303 ^ 0x7C6E;
        SwingAnimationModule.g[0x624C ^ 0x6357] = 0xEAEF ^ 0x6357;
        SwingAnimationModule.g[0x5BB2 ^ 0x5B69] = 0x3322 ^ 0x5B69;
        SwingAnimationModule.g[0xB4A9 ^ 0xB44D] = 0x6544 ^ 0xB44D;
        SwingAnimationModule.g[0xE5A6 ^ 0xE5AB] = 0xFFFF1A5D ^ 0xE5AB;
        SwingAnimationModule.g[0x455 ^ 0x52F] = 0xFFFFFAA9 ^ 0x52F;
        SwingAnimationModule.g[0xBAF3 ^ 0xBB90] = 0xBB90 ^ 0xBB90;
        SwingAnimationModule.g[0x7A41 ^ 0x7B61] = 0xC287 ^ 0x7B61;
        SwingAnimationModule.g[0x1893 ^ 0x1890] = 0xFFFFE732 ^ 0x1890;
        SwingAnimationModule.g[0x229E ^ 0x23DC] = 0x567D ^ 0x23DC;
        SwingAnimationModule.g[0xA1B0 ^ 0xA097] = 0xADCF ^ 0xA097;
        SwingAnimationModule.g[0x10834 ^ 0x1096F] = 0x14F3B ^ 0x1096F;
        SwingAnimationModule.g[0xD556 ^ 0xD410] = 0x639A ^ 0xD410;
        SwingAnimationModule.g[0x3C33 ^ 0x3D72] = 0xFFFFB718 ^ 0x3D72;
        SwingAnimationModule.g[0xBFD1 ^ 0xBFA3] = 0xFFFF4020 ^ 0xBFA3;
        SwingAnimationModule.g[0xBB52 ^ 0xBB3C] = 0xBB4C ^ 0xBB3C;
        SwingAnimationModule.g[0xB41F ^ 0xB47A] = 0xB401 ^ 0xB47A;
        SwingAnimationModule.g[0xBBF2 ^ 0xBBAB] = 0xBB8C ^ 0xBBAB;
        SwingAnimationModule.g[0xE9B6 ^ 0xE9E4] = 0xFFFF164A ^ 0xE9E4;
        SwingAnimationModule.g[0x1044A ^ 0x10493] = 0x16CD8 ^ 0x10493;
        SwingAnimationModule.g[0x314C ^ 0x31BB] = 0xC9AA ^ 0x31BB;
        SwingAnimationModule.g[0x8CC6 ^ 0x8C3E] = 0x743B ^ 0x8C3E;
        SwingAnimationModule.g[0xB601 ^ 0xB755] = 0x8502 ^ 0xB755;
        SwingAnimationModule.g[0xEFE5 ^ 0xEE6D] = 0xFFFF11B0 ^ 0xEE6D;
        SwingAnimationModule.g[0x5B60 ^ 0x5B04] = 0x5B6F ^ 0x5B04;
        SwingAnimationModule.g[0x4D10 ^ 0x4C1C] = 0x318D ^ 0x4C1C;
        SwingAnimationModule.g[0x50ED ^ 0x5070] = 0x5070 ^ 0x5070;
        SwingAnimationModule.g[0x89E4 ^ 0x88FD] = 0xFFFF1944 ^ 0x88FD;
        SwingAnimationModule.g[0x43E9 ^ 0x42DC] = 0xFFFF4EFC ^ 0x42DC;
        SwingAnimationModule.g[0xCF31 ^ 0xCE53] = 0xC1C5 ^ 0xCE53;
        SwingAnimationModule.g[0x8DF5 ^ 0x8DC8] = 0xFFFF725A ^ 0x8DC8;
        SwingAnimationModule.g[0x556C ^ 0x55C0] = 0x1EF0 ^ 0x55C0;
        SwingAnimationModule.g[0xB427 ^ 0xB430] = 0xB41C ^ 0xB430;
        SwingAnimationModule.g[0x1608 ^ 0x1622] = 0x19F7 ^ 0x1622;
        SwingAnimationModule.g[0x3C9C ^ 0x3C8F] = 0xFFFFC34E ^ 0x3C8F;
        SwingAnimationModule.g[0x73F1 ^ 0x7336] = 0x9F81 ^ 0x7336;
        SwingAnimationModule.g[0x10386 ^ 0x103CA] = 0xFFFEFC70 ^ 0x103CA;
        SwingAnimationModule.g[0x5304 ^ 0x53B4] = 0x15577 ^ 0x53B4;
        SwingAnimationModule.g[0x1E2 ^ 0x1C7] = 0x107 ^ 0x1C7;
        SwingAnimationModule.g[0xB482 ^ 0xB5CB] = 0xFFFF144A ^ 0xB5CB;
        SwingAnimationModule.g[0x107A6 ^ 0x1079A] = 0x10782 ^ 0x1079A;
        SwingAnimationModule.g[0x1CF ^ 0xEC] = 0x1A8B ^ 0xEC;
        SwingAnimationModule.g[0x10C63 ^ 0x10D28] = 0x1D516 ^ 0x10D28;
        SwingAnimationModule.g[0x91E ^ 0x9FF] = 0xBF46 ^ 0x9FF;
        SwingAnimationModule.g[0x102CF ^ 0x10343] = 0x1034C ^ 0x10343;
        SwingAnimationModule.g[0x70E3 ^ 0x7017] = 0x417B ^ 0x7017;
        SwingAnimationModule.g[0xEBD5 ^ 0xEAA0] = 0xEAA1 ^ 0xEAA0;
        SwingAnimationModule.g[0x2DB7 ^ 0x2D22] = 0x2D52 ^ 0x2D22;
        SwingAnimationModule.g[0x1ED4 ^ 0x1E3F] = 0xDFAA ^ 0x1E3F;
        SwingAnimationModule.g[0x80F0 ^ 0x80E5] = 0x809C ^ 0x80E5;
        SwingAnimationModule.g[0xC093 ^ 0xC1AE] = 0xBA58 ^ 0xC1AE;
        SwingAnimationModule.g[0x87F6 ^ 0x87F7] = 0x87E0 ^ 0x87F7;
        SwingAnimationModule.g[0x74D9 ^ 0x75A0] = 0x75AF ^ 0x75A0;
        SwingAnimationModule.g[0x196F ^ 0x1855] = 0x8E69 ^ 0x1855;
        SwingAnimationModule.g[0x6DC0 ^ 0x6C44] = 0x6C49 ^ 0x6C44;
        SwingAnimationModule.g[0x9D7E ^ 0x9D18] = 0x9D3A ^ 0x9D18;
        SwingAnimationModule.g[0xB9A6 ^ 0xB997] = 0xB997 ^ 0xB997;
        SwingAnimationModule.g[0xF458 ^ 0xF4C9] = 0xF48D ^ 0xF4C9;
        SwingAnimationModule.g[0xA44C ^ 0xA483] = 0x1A642 ^ 0xA483;
        SwingAnimationModule.g[0x29FA ^ 0x28D8] = 0x913E ^ 0x28D8;
        SwingAnimationModule.g[0x1163 ^ 0x100C] = 0xD5D9 ^ 0x100C;
        SwingAnimationModule.g[0xEA86 ^ 0xEAF8] = 0xEAF8 ^ 0xEAF8;
        SwingAnimationModule.g[0x699F ^ 0x6897] = 0x5AB1 ^ 0x6897;
        SwingAnimationModule.g[0x212E ^ 0x2136] = 0x2169 ^ 0x2136;
        SwingAnimationModule.g[0x28BD ^ 0x2878] = 0xC4CF ^ 0x2878;
        SwingAnimationModule.g[0x89FF ^ 0x892A] = 0x1871 ^ 0x892A;
        SwingAnimationModule.g[0x5A68 ^ 0x5B4E] = 0x412F ^ 0x5B4E;
        SwingAnimationModule.g[0xF76D ^ 0xF66E] = 0x98DB ^ 0xF66E;
        SwingAnimationModule.g[0xCDE3 ^ 0xCDE5] = 0xFFFF320F ^ 0xCDE5;
        SwingAnimationModule.g[0xE254 ^ 0xE29C] = 0xE31B ^ 0xE29C;
        SwingAnimationModule.g[0x4C8 ^ 0x5A6] = 0x8562 ^ 0x5A6;
        SwingAnimationModule.g[0x1353 ^ 0x13DE] = 0xFFFFEC22 ^ 0x13DE;
        SwingAnimationModule.g[0x1869 ^ 0x18A8] = 0xF50A ^ 0x18A8;
        SwingAnimationModule.g[0x9172 ^ 0x91C5] = 0x8CB2 ^ 0x91C5;
        SwingAnimationModule.g[0x10FA1 ^ 0x10ED3] = 0x10808 ^ 0x10ED3;
        SwingAnimationModule.g[0x71BD ^ 0x70AE] = 0x2304 ^ 0x70AE;
        SwingAnimationModule.g[0xBBAE ^ 0xBBCE] = 0xBBB5 ^ 0xBBCE;
        SwingAnimationModule.g[0x80C1 ^ 0x818E] = 0x8EF5 ^ 0x818E;
        SwingAnimationModule.g[0xE73D ^ 0xE60A] = 0x7036 ^ 0xE60A;
        SwingAnimationModule.g[0x5BC1 ^ 0x5B59] = 0x5B58 ^ 0x5B59;
        SwingAnimationModule.g[0x82A5 ^ 0x83CC] = 0xB6FC ^ 0x83CC;
        SwingAnimationModule.g[0xDBE4 ^ 0xDADD] = 0x4CD3 ^ 0xDADD;
        SwingAnimationModule.g[0x5BC7 ^ 0x5B74] = 0x15DBA ^ 0x5B74;
        SwingAnimationModule.g[0x343A ^ 0x3491] = 0x1601 ^ 0x3491;
        SwingAnimationModule.g[0x9FD0 ^ 0x9F20] = 0xEBC7 ^ 0x9F20;
        SwingAnimationModule.g[0x9325 ^ 0x938B] = 0xD8A4 ^ 0x938B;
        SwingAnimationModule.g[0x5382 ^ 0x52F6] = 0x819 ^ 0x52F6;
        SwingAnimationModule.g[0x5B5A ^ 0x5BE7] = 0x8ECF ^ 0x5BE7;
        SwingAnimationModule.g[0xC2 ^ 0x2E] = 0xC1B2 ^ 0x2E;
        SwingAnimationModule.g[0x1DF8 ^ 0x1CE5] = 0xFFFF6A89 ^ 0x1CE5;
        SwingAnimationModule.g[0x104F3 ^ 0x104A4] = 0x104A6 ^ 0x104A4;
        SwingAnimationModule.g[0x10780 ^ 0x106A5] = 0x11CE1 ^ 0x106A5;
        SwingAnimationModule.g[0xEA0E ^ 0xEB5F] = 0xFFFF1B9E ^ 0xEB5F;
        SwingAnimationModule.g[0xC8A3 ^ 0xC87E] = 0xCB16 ^ 0xC87E;
        SwingAnimationModule.g[0xFE3D ^ 0xFED8] = 0x2FFF ^ 0xFED8;
        SwingAnimationModule.g[0x40BE ^ 0x40EB] = 0x4088 ^ 0x40EB;
        SwingAnimationModule.g[0xBBFE ^ 0xBABE] = 0xCF1F ^ 0xBABE;
        SwingAnimationModule.g[0x3D2 ^ 0x390] = 0xFFFFFC4A ^ 0x390;
        SwingAnimationModule.g[0x1F26 ^ 0x1FAA] = 0xFFFFE01A ^ 0x1FAA;
        SwingAnimationModule.g[0x681 ^ 0x6C9] = 0xFFFFF94F ^ 0x6C9;
        SwingAnimationModule.g[0x10E83 ^ 0x10EF4] = 0x10EF1 ^ 0x10EF4;
        SwingAnimationModule.g[0x7EE0 ^ 0x7EEC] = 0xFFFF812C ^ 0x7EEC;
        SwingAnimationModule.g[0xB84 ^ 0xBB1] = 0xFFFFF455 ^ 0xBB1;
        SwingAnimationModule.g[0xED9B ^ 0xEDB6] = 0xAB7E ^ 0xEDB6;
        SwingAnimationModule.g[0x63EF ^ 0x6351] = 0xB65C ^ 0x6351;
        SwingAnimationModule.g[0x9533 ^ 0x9540] = 0x955E ^ 0x9540;
        SwingAnimationModule.g[0xBBB ^ 0xB90] = 0xFC35 ^ 0xB90;
        SwingAnimationModule.g[0xC34C ^ 0xC38A] = 0xFFFFD0EE ^ 0xC38A;
        SwingAnimationModule.g[0x109DA ^ 0x1099A] = 0xFFFEF63A ^ 0x1099A;
        SwingAnimationModule.g[0xCC26 ^ 0xCC06] = 0xCC07 ^ 0xCC06;
        SwingAnimationModule.g[0xF3E5 ^ 0xF2BB] = 0xB4E4 ^ 0xF2BB;
        SwingAnimationModule.g[0x810F ^ 0x817B] = 0x8102 ^ 0x817B;
        SwingAnimationModule.g[0x10B26 ^ 0x10B19] = 0x10B4A ^ 0x10B19;
        SwingAnimationModule.g[0x4FD4 ^ 0x4FA1] = 0x4FE1 ^ 0x4FA1;
        SwingAnimationModule.g[0x4572 ^ 0x454B] = 0xFFFFBABC ^ 0x454B;
        SwingAnimationModule.g[0x60E3 ^ 0x60CB] = 0x54A8 ^ 0x60CB;
        SwingAnimationModule.g[0x7EDE ^ 0x7E55] = 0xFFFF8193 ^ 0x7E55;
        SwingAnimationModule.g[0xD861 ^ 0xD86E] = 0xD80A ^ 0xD86E;
        SwingAnimationModule.g[0xD1D4 ^ 0xD147] = 0xFFFF2EB6 ^ 0xD147;
        SwingAnimationModule.g[0x5794 ^ 0x56A8] = 0x2D47 ^ 0x56A8;
        SwingAnimationModule.g[0x8CF9 ^ 0x8C83] = 0x8CA7 ^ 0x8C83;
        SwingAnimationModule.g[0xD801 ^ 0xD810] = 0xFFFF27D0 ^ 0xD810;
        SwingAnimationModule.g[0xE082 ^ 0xE079] = 0x8FF9 ^ 0xE079;
        SwingAnimationModule.g[0x7702 ^ 0x77AB] = 0x553B ^ 0x77AB;
        SwingAnimationModule.g[0xA895 ^ 0xA84B] = 0xAB4A ^ 0xA84B;
        SwingAnimationModule.g[0xC15F ^ 0xC1B7] = 0xFD28 ^ 0xC1B7;
        SwingAnimationModule.g[0x1ECB ^ 0x1FA0] = 0x96B2 ^ 0x1FA0;
        SwingAnimationModule.g[0xF183 ^ 0xF153] = 0xB9E2 ^ 0xF153;
        SwingAnimationModule.g[0x965A ^ 0x96EB] = 0x19025 ^ 0x96EB;
        SwingAnimationModule.g[0x38E0 ^ 0x388F] = 0xFFFFC762 ^ 0x388F;
        SwingAnimationModule.g[0xE8E7 ^ 0xE991] = 0xE981 ^ 0xE991;
        SwingAnimationModule.g[0xB514 ^ 0xB5F9] = 0x743F ^ 0xB5F9;
        SwingAnimationModule.g[0x1870 ^ 0x1942] = 0x8D1 ^ 0x1942;
        SwingAnimationModule.g[0x855E ^ 0x85FC] = 0xFFFF8C3E ^ 0x85FC;
        SwingAnimationModule.g[0xC265 ^ 0xC3E6] = 0xC3E2 ^ 0xC3E6;
        SwingAnimationModule.g[0x9A6F ^ 0x9B0A] = 0x9B0A ^ 0x9B0A;
        SwingAnimationModule.g[0x7DC5 ^ 0x7DBE] = 0xFFFF8247 ^ 0x7DBE;
        SwingAnimationModule.g[0x562E ^ 0x561A] = 0x5600 ^ 0x561A;
        SwingAnimationModule.g[0x108FB ^ 0x109D4] = 0x11844 ^ 0x109D4;
        SwingAnimationModule.g[0x3FD2 ^ 0x3EB8] = 0x1FCA ^ 0x3EB8;
        SwingAnimationModule.g[0xE47C ^ 0xE4BC] = 0x914 ^ 0xE4BC;
        SwingAnimationModule.g[0xFDFA ^ 0xFDDB] = 0xFDDB ^ 0xFDDB;
        SwingAnimationModule.g[0xA5A2 ^ 0xA4C6] = 0xA4C6 ^ 0xA4C6;
        SwingAnimationModule.g[0x27C6 ^ 0x27A1] = 0xFFFFD822 ^ 0x27A1;
        SwingAnimationModule.g[0x7F00 ^ 0x7F47] = 0xFFFF807F ^ 0x7F47;
        SwingAnimationModule.g[0x97E ^ 0x991] = 0x7D6F ^ 0x991;
        SwingAnimationModule.g[0xFA9C ^ 0xFAD7] = 0xFFFF051B ^ 0xFAD7;
        SwingAnimationModule.g[0x85B6 ^ 0x8509] = 0x5021 ^ 0x8509;
        SwingAnimationModule.g[0x7304 ^ 0x73E4] = 0x73E4 ^ 0x73E4;
        SwingAnimationModule.g[0xB135 ^ 0xB1C8] = 0xDE67 ^ 0xB1C8;
        SwingAnimationModule.g[0x8F22 ^ 0x8E0B] = 0x8324 ^ 0x8E0B;
        SwingAnimationModule.g[0xD79C ^ 0xD6B1] = 0xDB51 ^ 0xD6B1;
        SwingAnimationModule.g[0x879E ^ 0x86A5] = 0xFD45 ^ 0x86A5;
        SwingAnimationModule.g[0x1017D ^ 0x1019F] = 0x1B706 ^ 0x1019F;
        SwingAnimationModule.g[0x4ADD ^ 0x4ACF] = 0xFFFFB51E ^ 0x4ACF;
        SwingAnimationModule.g[0xF513 ^ 0xF5DF] = 0x1F71A ^ 0xF5DF;
        SwingAnimationModule.g[0x3049 ^ 0x3006] = 0xFFFFCFD2 ^ 0x3006;
        SwingAnimationModule.g[0xF984 ^ 0xF8C8] = 0x20F7 ^ 0xF8C8;
        SwingAnimationModule.g[0xE77B ^ 0xE70A] = 0xE755 ^ 0xE70A;
        SwingAnimationModule.g[0x4834 ^ 0x496D] = 0x147B ^ 0x496D;
        SwingAnimationModule.g[0x12E ^ 0x134] = 0xFFFFFEC1 ^ 0x134;
        SwingAnimationModule.g[0x8FB4 ^ 0x8ED4] = 0x8142 ^ 0x8ED4;
        SwingAnimationModule.g[0x4930 ^ 0x4840] = 0x2547 ^ 0x4840;
        SwingAnimationModule.g[0xE607 ^ 0xE785] = 0xE7DD ^ 0xE785;
        SwingAnimationModule.g[0x9D3D ^ 0x9C37] = 0xAE11 ^ 0x9C37;
        SwingAnimationModule.g[0x41E2 ^ 0x41A7] = 0x4186 ^ 0x41A7;
        SwingAnimationModule.g[0x42FB ^ 0x4374] = 0x4377 ^ 0x4374;
        SwingAnimationModule.g[0xFC9A ^ 0xFC1F] = 0xFFFF03D5 ^ 0xFC1F;
        SwingAnimationModule.g[0xB50E ^ 0xB47F] = 0x3316 ^ 0xB47F;
        SwingAnimationModule.g[0x3EAA ^ 0x3E0B] = 0xC852 ^ 0x3E0B;
        SwingAnimationModule.g[0xD70 ^ 0xC66] = 0x5FD9 ^ 0xC66;
        SwingAnimationModule.g[0xC21B ^ 0xC29C] = 0xC2D9 ^ 0xC29C;
        SwingAnimationModule.g[0x1476 ^ 0x152A] = 0x5375 ^ 0x152A;
        SwingAnimationModule.g[0xA2D4 ^ 0xA3E4] = 0xB277 ^ 0xA3E4;
        SwingAnimationModule.g[0xCDCB ^ 0xCDA3] = 0xCD93 ^ 0xCDA3;
        SwingAnimationModule.g[0xBA85 ^ 0xBBA1] = 0xA1C0 ^ 0xBBA1;
        SwingAnimationModule.g[0x13C3 ^ 0x1351] = 0xFFFFECF7 ^ 0x1351;
        SwingAnimationModule.g[0x778B ^ 0x76DD] = 0x448A ^ 0x76DD;
        SwingAnimationModule.g[0xDDE7 ^ 0xDDB1] = 0xDDA6 ^ 0xDDB1;
        SwingAnimationModule.g[0x9A0A ^ 0x9B1F] = 0xC8C2 ^ 0x9B1F;
        SwingAnimationModule.g[0xA2BF ^ 0xA20B] = 0xBF7B ^ 0xA20B;
        SwingAnimationModule.g[0xAC9C ^ 0xADE2] = 0xADDA ^ 0xADE2;
        SwingAnimationModule.g[0xC6A6 ^ 0xC6B2] = 0xC6BD ^ 0xC6B2;
        SwingAnimationModule.g[0xDC20 ^ 0xDC29] = 0xDC64 ^ 0xDC29;
        SwingAnimationModule.g[0xA77B ^ 0xA7F2] = 0xA7FE ^ 0xA7F2;
        SwingAnimationModule.g[0x69D0 ^ 0x69FF] = 0xD5F3 ^ 0x69FF;
        SwingAnimationModule.g[0x5B47 ^ 0x5BAE] = 0xFFFF98CE ^ 0x5BAE;
        SwingAnimationModule.g[0x6AA4 ^ 0x6A73] = 0xFB28 ^ 0x6A73;
        SwingAnimationModule.g[0x3DB ^ 0x325] = 0x6CB7 ^ 0x325;
        SwingAnimationModule.g[0x10D62 ^ 0x10C0F] = 0x143CB ^ 0x10C0F;
        SwingAnimationModule.g[0xA6EC ^ 0xA626] = 0xFFFF5810 ^ 0xA626;
        SwingAnimationModule.g[0x2D07 ^ 0x2D07] = 0x2D50 ^ 0x2D07;
        SwingAnimationModule.g[0xF6A ^ 0xF95] = 0x5577 ^ 0xF95;
        SwingAnimationModule.g[0x3352 ^ 0x33DD] = 0x336B ^ 0x33DD;
        SwingAnimationModule.g[0x7AD3 ^ 0x7B83] = 0x74F5 ^ 0x7B83;
        SwingAnimationModule.g[0x6720 ^ 0x67A0] = 0x67B7 ^ 0x67A0;
        SwingAnimationModule.g[0x6336 ^ 0x638C] = 0x5A34 ^ 0x638C;
        SwingAnimationModule.g[0xC44A ^ 0xC4FF] = 0xD988 ^ 0xC4FF;
        SwingAnimationModule.g[0xB625 ^ 0xB62F] = 0xB61E ^ 0xB62F;
        SwingAnimationModule.g[0x33D2 ^ 0x32AA] = 0x3295 ^ 0x32AA;
        SwingAnimationModule.g[0x8540 ^ 0x8545] = 0x851A ^ 0x8545;
        SwingAnimationModule.g[0x3644 ^ 0x3698] = 0x35F0 ^ 0x3698;
        SwingAnimationModule.g[0x51B1 ^ 0x50CC] = 0x50C7 ^ 0x50CC;
        SwingAnimationModule.g[0xA724 ^ 0xA6AE] = 0xFFFF5946 ^ 0xA6AE;
        SwingAnimationModule.g[0xEA23 ^ 0xEAFC] = 0xE994 ^ 0xEAFC;
        SwingAnimationModule.g[0xB9FC ^ 0xB8B2] = 0x608D ^ 0xB8B2;
        SwingAnimationModule.g[0x11A3 ^ 0x11C1] = 0xFFFFEE79 ^ 0x11C1;
        SwingAnimationModule.g[0x315D ^ 0x3042] = 0x89A8 ^ 0x3042;
        SwingAnimationModule.g[0x5A2E ^ 0x5AC8] = 0x8BC1 ^ 0x5AC8;
        SwingAnimationModule.g[0x9021 ^ 0x913B] = 0xFF26 ^ 0x913B;
        SwingAnimationModule.g[0x1792 ^ 0x1699] = 0x6B00 ^ 0x1699;
        SwingAnimationModule.g[0xA72B ^ 0xA7FD] = 0xFFFFC93F ^ 0xA7FD;
        SwingAnimationModule.g[0x44A0 ^ 0x4426] = 0xFFFFBBC7 ^ 0x4426;
        SwingAnimationModule.g[0xB65E ^ 0xB6F1] = 0xFDCF ^ 0xB6F1;
        SwingAnimationModule.g[0xD24E ^ 0xD2E4] = 0xF030 ^ 0xD2E4;
        SwingAnimationModule.g[0x1936 ^ 0x1839] = 0x7DD2 ^ 0x1839;
        SwingAnimationModule.g[0x41DF ^ 0x4191] = 0xFFFFBE1D ^ 0x4191;
        SwingAnimationModule.g[0xA241 ^ 0xA32D] = 0xB42F ^ 0xA32D;
        SwingAnimationModule.g[0x5F13 ^ 0x5F59] = 0xFFFFA0F3 ^ 0x5F59;
        SwingAnimationModule.g[0xDB97 ^ 0xDB9F] = 0xDBB4 ^ 0xDB9F;
        SwingAnimationModule.g[0xAE23 ^ 0xAF33] = 0xCAC6 ^ 0xAF33;
        SwingAnimationModule.g[0x413C ^ 0x410B] = 0x4100 ^ 0x410B;
        SwingAnimationModule.g[0xC53F ^ 0xC462] = 0xFFFF7DBF ^ 0xC462;
        SwingAnimationModule.g[0x261 ^ 0x271] = 0x251 ^ 0x271;
        SwingAnimationModule.g[0x4016 ^ 0x407F] = 0xFFFFBF86 ^ 0x407F;
        SwingAnimationModule.g[0xA75 ^ 0xB74] = 0xFFFFAE6B ^ 0xB74;
        SwingAnimationModule.g[0xB237 ^ 0xB33A] = 0xCE8F ^ 0xB33A;
        SwingAnimationModule.g[0x4AAD ^ 0x4A81] = 0xD109 ^ 0x4A81;
        SwingAnimationModule.g[0x54C5 ^ 0x55EE] = 0x5869 ^ 0x55EE;
        SwingAnimationModule.g[0xFB96 ^ 0xFA91] = 0xC8B3 ^ 0xFA91;
        SwingAnimationModule.g[0x34A6 ^ 0x34FE] = 0x34CB ^ 0x34FE;
        SwingAnimationModule.g[0xBE41 ^ 0xBFC8] = 0xBFC5 ^ 0xBFC8;
        SwingAnimationModule.g[0xA929 ^ 0xA820] = 0xFFFF65EA ^ 0xA820;
        SwingAnimationModule.g[0x53A7 ^ 0x52F2] = 0x6098 ^ 0x52F2;
        SwingAnimationModule.g[0xDFCB ^ 0xDF28] = 0xE32 ^ 0xDF28;
        SwingAnimationModule.g[0x3A02 ^ 0x3A95] = 0x3AD8 ^ 0x3A95;
        SwingAnimationModule.g[0x10656 ^ 0x106DE] = 0xFFFEF94D ^ 0x106DE;
        SwingAnimationModule.g[0xF561 ^ 0xF41A] = 0xF41C ^ 0xF41A;
        SwingAnimationModule.g[0x1818 ^ 0x185E] = 0xFFFFE7D2 ^ 0x185E;
        SwingAnimationModule.g[0x284C ^ 0x2833] = 0xFFFFD7EA ^ 0x2833;
        SwingAnimationModule.g[0x4BF7 ^ 0x4BD0] = 0xC01 ^ 0x4BD0;
        SwingAnimationModule.g[0xA895 ^ 0xA80A] = 0xAE11 ^ 0xA80A;
        SwingAnimationModule.g[0x699E ^ 0x693E] = 0x9F66 ^ 0x693E;
        SwingAnimationModule.g[0xD5C0 ^ 0xD4EA] = 0xD9AE ^ 0xD4EA;
        SwingAnimationModule.g[0x10B0B ^ 0x10A77] = 0xFFFEF593 ^ 0x10A77;
        SwingAnimationModule.g[0x346 ^ 0x31D] = 0xFFFFFC8F ^ 0x31D;
        SwingAnimationModule.g[0x6462 ^ 0x640E] = 0xFFFF9BB7 ^ 0x640E;
        SwingAnimationModule.g[0xCD25 ^ 0xCD1D] = 0xFFFF32FA ^ 0xCD1D;
        SwingAnimationModule.g[0xB240 ^ 0xB23D] = 0xB214 ^ 0xB23D;
        SwingAnimationModule.g[0x4F1D ^ 0x4E50] = 0xFFFF69EC ^ 0x4E50;
        SwingAnimationModule.g[0x96D9 ^ 0x97AE] = 0x97A9 ^ 0x97AE;
        SwingAnimationModule.g[0xA6D2 ^ 0xA624] = 0x9748 ^ 0xA624;
        SwingAnimationModule.g[0x4ECF ^ 0x4FD1] = 0xC673 ^ 0x4FD1;
        SwingAnimationModule.g[0xBCD9 ^ 0xBC7C] = 0x8B37 ^ 0xBC7C;
        SwingAnimationModule.g[0xFF3C ^ 0xFF4A] = 0xFF7F ^ 0xFF4A;
        SwingAnimationModule.g[0xC0AA ^ 0xC099] = 0xC0A0 ^ 0xC099;
        SwingAnimationModule.g[0xE533 ^ 0xE43D] = 0x99AC ^ 0xE43D;
        SwingAnimationModule.g[0xB55E ^ 0xB502] = 0xB591 ^ 0xB502;
        SwingAnimationModule.g[0x6939 ^ 0x6968] = 0x6948 ^ 0x6968;
        SwingAnimationModule.g[0xE352 ^ 0xE26C] = 0x9983 ^ 0xE26C;
        SwingAnimationModule.g[0x782F ^ 0x78FC] = 0x304F ^ 0x78FC;
        SwingAnimationModule.g[0x5767 ^ 0x5654] = 0xA5FE ^ 0x5654;
        SwingAnimationModule.g[0x4B6A ^ 0x4B12] = 0x4B32 ^ 0x4B12;
        SwingAnimationModule.g[0x9CCE ^ 0x9C05] = 0x9D81 ^ 0x9C05;
        SwingAnimationModule.g[0x4A8E ^ 0x4A47] = 0x4BC3 ^ 0x4A47;
        SwingAnimationModule.g[0xC873 ^ 0xC93B] = 0x9729 ^ 0xC93B;
        SwingAnimationModule.g[0x99BD ^ 0x98A5] = 0xF6B8 ^ 0x98A5;
        SwingAnimationModule.g[0x2DF8 ^ 0x2CFA] = 0x7616 ^ 0x2CFA;
        SwingAnimationModule.g[0x9FE2 ^ 0x9F44] = 0xA847 ^ 0x9F44;
        SwingAnimationModule.g[0xB2B8 ^ 0xB2E5] = 0xB2C3 ^ 0xB2E5;
        SwingAnimationModule.g[0xEC14 ^ 0xECC0] = 0x7D90 ^ 0xECC0;
        SwingAnimationModule.g[0x227E ^ 0x2270] = 0xFFFFDDC5 ^ 0x2270;
        SwingAnimationModule.g[0xE805 ^ 0xE8F7] = 0x9C10 ^ 0xE8F7;
        SwingAnimationModule.g[0xAD09 ^ 0xAC6E] = 0xAC6E ^ 0xAC6E;
        SwingAnimationModule.g[0xCB7C ^ 0xCB0C] = 0xCB72 ^ 0xCB0C;
        SwingAnimationModule.g[0x3624 ^ 0x36E0] = 0xDA51 ^ 0x36E0;
        SwingAnimationModule.g[0xF7D5 ^ 0xF69F] = 0xA88D ^ 0xF69F;
        SwingAnimationModule.g[0xEEB7 ^ 0xEF86] = 0xFFFF01E0 ^ 0xEF86;
        SwingAnimationModule.g[0x5348 ^ 0x5316] = 0xFFFFACA5 ^ 0x5316;
        SwingAnimationModule.g[0x311F ^ 0x3045] = 0x6D2F ^ 0x3045;
        SwingAnimationModule.g[0x9B2 ^ 0x9B0] = 0xFFFFF672 ^ 0x9B0;
        SwingAnimationModule.g[0x1BF1 ^ 0x1AE5] = 0x495A ^ 0x1AE5;
        SwingAnimationModule.g[0xD8D0 ^ 0xD9EF] = 0xAC51 ^ 0xD9EF;
        SwingAnimationModule.g[0xC6A ^ 0xD42] = 6 ^ 0xD42;
        SwingAnimationModule.g[0xA6B4 ^ 0xA733] = 0xA732 ^ 0xA733;
        SwingAnimationModule.g[0x978D ^ 0x97F1] = 0x97DF ^ 0x97F1;
        SwingAnimationModule.g[0x8B59 ^ 0x8B83] = 0xFFFF1C55 ^ 0x8B83;
        SwingAnimationModule.g[0x6228 ^ 0x6212] = 0xFFFF9DC2 ^ 0x6212;
        SwingAnimationModule.g[0xA24A ^ 0xA3C7] = 0xA3C9 ^ 0xA3C7;
        SwingAnimationModule.g[0x1011D ^ 0x101C5] = 0x16982 ^ 0x101C5;
        SwingAnimationModule.g[0xF9E4 ^ 0xF9D2] = 0xF9E3 ^ 0xF9D2;
        SwingAnimationModule.g[0x322E ^ 0x33A0] = 0xFFFFCC5A ^ 0x33A0;
        SwingAnimationModule.g[0x132C ^ 0x1341] = 0xFFFFECE1 ^ 0x1341;
        SwingAnimationModule.g[0xB4B7 ^ 0xB59B] = 0xB807 ^ 0xB59B;
        SwingAnimationModule.g[0xCC8A ^ 0xCC8D] = 0xCCBB ^ 0xCC8D;
        SwingAnimationModule.g[0x5F07 ^ 0x5E6F] = 0x5E7D ^ 0x5E6F;
        SwingAnimationModule.g[0x4231 ^ 0x42B5] = 0xFFFFBD3A ^ 0x42B5;
        SwingAnimationModule.g[0xFFA9 ^ 0xFF2B] = 0xFFFF00DD ^ 0xFF2B;
        SwingAnimationModule.g[0x172A ^ 0x1718] = 0x171B ^ 0x1718;
        SwingAnimationModule.g[0x608F ^ 0x6193] = 0xE831 ^ 0x6193;
        SwingAnimationModule.g[0x10C0C ^ 0x10C2A] = 0x1668A ^ 0x10C2A;
        SwingAnimationModule.g[0x4911 ^ 0x4897] = 0x48A0 ^ 0x4897;
        SwingAnimationModule.g[0xFD4D ^ 0xFD12] = 0xFFFF024A ^ 0xFD12;
        SwingAnimationModule.g[0xEAA1 ^ 0xEA37] = 0xEA10 ^ 0xEA37;
        SwingAnimationModule.g[0x901E ^ 0x90B6] = 0xB22F ^ 0x90B6;
        SwingAnimationModule.g[0x44FF ^ 0x457F] = 0xFFFFBA90 ^ 0x457F;
        SwingAnimationModule.g[0x134C ^ 0x1351] = 0xFFFFECC1 ^ 0x1351;
        SwingAnimationModule.g[0x4910 ^ 0x49DD] = 0x14B1C ^ 0x49DD;
        SwingAnimationModule.g[0xE8CA ^ 0xE94B] = 0xE94B ^ 0xE94B;
        SwingAnimationModule.g[0xCC03 ^ 0xCC68] = 0xCC72 ^ 0xCC68;
        SwingAnimationModule.g[0xD3D2 ^ 0xD328] = 0x2B2D ^ 0xD328;
        SwingAnimationModule.g[0xE22F ^ 0xE37C] = 0xD129 ^ 0xE37C;
        SwingAnimationModule.g[0x25E3 ^ 0x25FF] = 0xFFFFDA0F ^ 0x25FF;
        SwingAnimationModule.g[0x3A98 ^ 0x3AC2] = 0xFFFFC557 ^ 0x3AC2;
        SwingAnimationModule.g[0x6D71 ^ 0x6C45] = 0x9FE8 ^ 0x6C45;
        SwingAnimationModule.g[0x8C65 ^ 0x8CE6] = 0xFFFF73BA ^ 0x8CE6;
        SwingAnimationModule.g[0x60D3 ^ 0x6158] = 0x615D ^ 0x6158;
        SwingAnimationModule.g[0xFF7C ^ 0xFF3F] = 0xFF04 ^ 0xFF3F;
        SwingAnimationModule.g[0x23A5 ^ 0x2386] = 0x2386 ^ 0x2386;
        SwingAnimationModule.g[0x883D ^ 0x8979] = 0x3EF3 ^ 0x8979;
        SwingAnimationModule.g[0x8653 ^ 0x86F7] = 0xB1B3 ^ 0x86F7;
        SwingAnimationModule.g[0xD8B2 ^ 0xD9F1] = 0x6E71 ^ 0xD9F1;
        SwingAnimationModule.g[0xB17 ^ 0xB83] = 0xFFFFF432 ^ 0xB83;
        SwingAnimationModule.g[0x3159 ^ 0x3197] = 0x13349 ^ 0x3197;
        SwingAnimationModule.g[0x576A ^ 0x57F1] = 0x57F0 ^ 0x57F1;
        SwingAnimationModule.g[0xD84D ^ 0xD8F6] = 0xE14B ^ 0xD8F6;
        SwingAnimationModule.g[0x76B1 ^ 0x769F] = 0xC343 ^ 0x769F;
        SwingAnimationModule.g[0x1CA ^ 0x172] = 0x38CA ^ 0x172;
        SwingAnimationModule.g[0x16BD ^ 0x167F] = 0xFBE9 ^ 0x167F;
        SwingAnimationModule.g[0x95CD ^ 0x95A7] = 0x95B0 ^ 0x95A7;
        SwingAnimationModule.g[0xF1DA ^ 0xF1F8] = 0xF1FA ^ 0xF1F8;
        SwingAnimationModule.g[0x25F4 ^ 0x24E5] = 0x4156 ^ 0x24E5;
        SwingAnimationModule.g[0x10FE ^ 0x10D7] = 0x76E4 ^ 0x10D7;
        SwingAnimationModule.g[0x3430 ^ 0x349D] = 0x7FA3 ^ 0x349D;
        SwingAnimationModule.g[0x746D ^ 0x7449] = 0x7449 ^ 0x7449;
        SwingAnimationModule.g[0xA663 ^ 0xA633] = 0xFFFF59ED ^ 0xA633;
        SwingAnimationModule.g[0x8DA ^ 0x985] = 0x60B ^ 0x985;
        SwingAnimationModule.g[0x5E54 ^ 0x5EE2] = 0x43CF ^ 0x5EE2;
        SwingAnimationModule.g[0x8DB6 ^ 0x8D11] = 0xBA5A ^ 0x8D11;
        SwingAnimationModule.g[0xEAD6 ^ 0xEA82] = 0xFFFF153D ^ 0xEA82;
        SwingAnimationModule.g[0x3DD3 ^ 0x3CB5] = 0x3CB4 ^ 0x3CB5;
        SwingAnimationModule.g[0x711A ^ 0x71E3] = 0xFFFF7604 ^ 0x71E3;
        SwingAnimationModule.g[0x6345 ^ 0x627D] = 0xF441 ^ 0x627D;
        SwingAnimationModule.g[0xBD91 ^ 0xBDF0] = 0xFFFF4203 ^ 0xBDF0;
        SwingAnimationModule.g[0x7450 ^ 0x7433] = 0xFFFF8BCE ^ 0x7433;
        SwingAnimationModule.g[0xEB44 ^ 0xEBB7] = 0xDACC ^ 0xEBB7;
        SwingAnimationModule.g[0x38F4 ^ 0x384D] = 0x1F0 ^ 0x384D;
        SwingAnimationModule.g[0x7894 ^ 0x787E] = 0x44E1 ^ 0x787E;
        SwingAnimationModule.g[0x450D ^ 0x45DC] = 0xD6F ^ 0x45DC;
        SwingAnimationModule.g[0x35A0 ^ 0x34A0] = 0x6E4C ^ 0x34A0;
        SwingAnimationModule.g[0x5A65 ^ 0x5AEB] = 0x5AA6 ^ 0x5AEB;
        SwingAnimationModule.g[0x1A25 ^ 0x1A61] = 0xFFFFE50D ^ 0x1A61;
        SwingAnimationModule.g[0xA50B ^ 0xA597] = 0xA596 ^ 0xA597;
        SwingAnimationModule.g[0x3D9 ^ 0x2AA] = 0x5971 ^ 0x2AA;
        SwingAnimationModule.g[0x389B ^ 0x39E4] = 0x39ED ^ 0x39E4;
        SwingAnimationModule.g[0x331A ^ 0x322C] = 0xC181 ^ 0x322C;
        SwingAnimationModule.g[0xE931 ^ 0xE98D] = 0x3CAD ^ 0xE98D;
        SwingAnimationModule.g[0xF559 ^ 0xF44E] = 0x9A42 ^ 0xF44E;
        SwingAnimationModule.g[0xD35A ^ 0xD20D] = 0x8F77 ^ 0xD20D;
        SwingAnimationModule.g[0x4B71 ^ 0x4B4A] = 0x4B3D ^ 0x4B4A;
        SwingAnimationModule.g[0xDF7E ^ 0xDF99] = 0xE303 ^ 0xDF99;
        SwingAnimationModule.g[0x7326 ^ 0x7322] = 0xFFFF8CE7 ^ 0x7322;
        SwingAnimationModule.g[0xE762 ^ 0xE625] = 0xB82A ^ 0xE625;
        SwingAnimationModule.g[0xC06E ^ 0xC023] = 0xC0E3 ^ 0xC023;
        SwingAnimationModule.g[0xF9A1 ^ 0xF8E4] = 0x4F1C ^ 0xF8E4;
        SwingAnimationModule.g[0xFC43 ^ 0xFD11] = 0xF267 ^ 0xFD11;
        SwingAnimationModule.g[0xB10C ^ 0xB1FD] = 0xFFFF3AD0 ^ 0xB1FD;
        SwingAnimationModule.g[0x92 ^ 0x6E] = 0x6FFC ^ 0x6E;
        SwingAnimationModule.g[0x3E18 ^ 0x3EBB] = 0xC8E2 ^ 0x3EBB;
        SwingAnimationModule.g[0x4AB5 ^ 0x4BA7] = 0x2E52 ^ 0x4BA7;
        SwingAnimationModule.g[0x3D8 ^ 0x359] = 0xFFFFFCB2 ^ 0x359;
        SwingAnimationModule.g[0xBDE8 ^ 0xBDA1] = 0xFFFF4233 ^ 0xBDA1;
        SwingAnimationModule.g[0x452C ^ 0x451C] = 0xFF82 ^ 0x451C;
        SwingAnimationModule.g[0xB7FC ^ 0xB7E5] = 0xFFFF487A ^ 0xB7E5;
        SwingAnimationModule.g[0xC6B8 ^ 0xC64D] = 0xFFFF0885 ^ 0xC64D;
        SwingAnimationModule.g[0x6EF8 ^ 0x6FD6] = 0x624A ^ 0x6FD6;
        SwingAnimationModule.g[0x97CD ^ 0x9695] = 0xCBFF ^ 0x9695;
        SwingAnimationModule.g[0xF04C ^ 0xF149] = 0x9FD3 ^ 0xF149;
        SwingAnimationModule.g[0x4A1A ^ 0x4A49] = 0xFFFFB575 ^ 0x4A49;
        SwingAnimationModule.g[0x330C ^ 0x33E2] = 0xF27E ^ 0x33E2;
        SwingAnimationModule.g[0x10667 ^ 0x106FD] = 0x106FD ^ 0x106FD;
        SwingAnimationModule.g[0x7E7F ^ 0x7E64] = 0x7E24 ^ 0x7E64;
        SwingAnimationModule.g[0x3819 ^ 0x3893] = 0xFFFFC75D ^ 0x3893;
    }
}

