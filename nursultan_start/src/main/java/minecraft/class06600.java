/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class03810
 *  minecraft.class03831
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class06889
 *  minecraft.class07070
 *  minecraft.class07078
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08030
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Map;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class03810;
import minecraft.class03831;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class06889;
import minecraft.class07070;
import minecraft.class07078;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08030;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06600
extends class07438 {
    public static final class07070 field_62509 = class07070.field_6183;
    public static final int field_62510 = 0;
    public static final float field_62511 = 1.62f;
    public static final class06889 field_62512 = new class06889(0.0, 0.6, 0.0);
    private static final float field_63007 = 1.5f;
    private static final float field_63008 = 0.6f;
    public static final float field_63009 = 0.6f;
    protected static final class01325 field_63010 = class01325.y((float)0.6f, (float)1.8f).y(1.62f).N(class03810.N().N(class03831.field_47744, field_62512));
    protected static final Map<class01312, class01325> field_63011 = ImmutableMap.builder().put((Object)class01312.field_18076, (Object)field_63010).put((Object)class01312.field_18078, (Object)staticFields_7212a028292fd3c078969e3ee4c71d9e8_1).put((Object)class01312.field_18077, (Object)class01325.y((float)0.6f, (float)0.6f).y(0.4f)).put((Object)class01312.field_18079, (Object)class01325.y((float)0.6f, (float)0.6f).y(0.4f)).put((Object)class01312.field_18080, (Object)class01325.y((float)0.6f, (float)0.6f).y(0.4f)).put((Object)class01312.field_18081, (Object)class01325.y((float)0.6f, (float)1.5f).y(1.27f).N(class03810.N().N(class03831.field_47744, field_62512))).put((Object)class01312.field_18082, (Object)class01325.L((float)0.2f, (float)0.2f).y(1.62f)).build();
    protected static final class02131<class07070> field_62513 = class03289.N(class06600.class, (class04383)class02154.H);
    protected static final class02131<Byte> field_62514 = class03289.N(class06600.class, (class04383)class02154.N);
    private static final class01325 viaFabricPlus$sneaking_dimensions_v1_13_2 = class01325.y((float)0.6f, (float)1.65f).y(1.54f).N(class03810.N().N(class03831.field_47744, field_62512));
    private static final class01325 viaFabricPlus$sneaking_dimensions_v1_8 = class01325.y((float)0.6f, (float)1.8f).y(1.54f).N(class03810.N().N(class03831.field_47744, field_62512));

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(field_62513, (Object)field_62509);
        class042932.N(field_62514, (Object)0);
    }

    public class07070 method_6068() {
        return (class07070)this.field_6011.N(field_62513);
    }

    public class06600(class07078<? extends class07438> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public class01325 method_55694(class01312 class013122) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$dmi000$viafabricplus$modifyDimensions(class013122, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class01325)callbackInfoReturnable.getReturnValue();
        }
        return field_63011.getOrDefault(class013122, field_63010);
    }

    private void handler$dmi000$viafabricplus$modifyDimensions(class01312 class013122, CallbackInfoReturnable callbackInfoReturnable) {
        if (class013122 == class01312.field_18081) {
            if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
                callbackInfoReturnable.setReturnValue((Object)viaFabricPlus$sneaking_dimensions_v1_8);
            } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
                callbackInfoReturnable.setReturnValue((Object)viaFabricPlus$sneaking_dimensions_v1_13_2);
            }
        }
    }

    public boolean method_74091(class08030 class080302) {
        return ((Byte)this.method_5841().N(field_62514) & class080302.N()) == class080302.N();
    }

    public void method_74090(class07070 class070702) {
        this.field_6011.N(field_62513, (Object)class070702);
    }
}

