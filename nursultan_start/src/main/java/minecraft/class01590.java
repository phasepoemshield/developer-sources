/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ibm.icu.text.ArabicShaping
 *  com.ibm.icu.text.ArabicShapingException
 *  com.ibm.icu.text.Bidi
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00949
 *  minecraft.class01028
 *  minecraft.class01407
 *  minecraft.class01583
 *  minecraft.class03448
 *  minecraft.class04995
 *  minecraft.class05197
 *  minecraft.class05228
 *  minecraft.class05232
 *  minecraft.class05936
 *  minecraft.class06069
 *  minecraft.class06202
 *  minecraft.class07018
 *  minecraft.class07915
 *  minecraft.class07948
 *  minecraft.class08985
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.List;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00949;
import minecraft.class01028;
import minecraft.class01407;
import minecraft.class01583;
import minecraft.class01588;
import minecraft.class01608;
import minecraft.class01609;
import minecraft.class01621;
import minecraft.class03448;
import minecraft.class04995;
import minecraft.class05197;
import minecraft.class05228;
import minecraft.class05232;
import minecraft.class05936;
import minecraft.class06069;
import minecraft.class06202;
import minecraft.class07018;
import minecraft.class07915;
import minecraft.class07948;
import minecraft.class08985;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01590 {
    private static final float u = 0.01f;
    private static final float i = 0.01f;
    private static final float R = -0.01f;
    public static final float N = 0.03f;
    public final int y;
    private final class06069 M = class06069.u();
    final class01621 L;
    private final class05228 B;

    public List<class01028> L(class05936 class059362, int n) {
        return class07018.y().N(this.B.y(class059362, n, class00405.N));
    }

    public class01590(class01621 class016212) {
        this.y = 9;
        this.L = class016212;
        this.B = new class05228((n, class004052) -> this.N(class004052.E()).N(n).N().N(class004052.L()));
    }

    public List<class05936> u(class05936 class059362, int n) {
        return this.B.y(class059362, n, class00405.N);
    }

    public class05228 y() {
        return this.B;
    }

    public int y(String string) {
        return class04995.u((float)this.B.N(string));
    }

    public int y(class05936 class059362, int n) {
        return 9 * this.B.y(class059362, n, class00405.N).size();
    }

    public String N(String string, int n) {
        return this.B.y(string, n, class00405.N);
    }

    public class05936 N(class05936 class059362, int n) {
        return this.B.N(class059362, n, class00405.N);
    }

    private void N(class05936 class059362, CallbackInfoReturnable callbackInfoReturnable) {
        if ((class03448)class06202.Nq().T_3 != null && ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            int n = 0;
            for (class01028 class010282 : this.L(class059362, Integer.MAX_VALUE)) {
                if (this.N(class010282) < n) continue;
                n = this.N(class010282);
            }
            callbackInfoReturnable.setReturnValue((Object)class04995.u((float)n));
        }
    }

    private void N(class00392 class003922, float f, float f2, int n, boolean bl, Matrix4f matrix4f, class01407 class014072, class01583 class015832, int n2, int n3, CallbackInfo callbackInfo) {
        List<class01028> var12;
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest) && !(var12 = this.L((class05936)class003922, Integer.MAX_VALUE)).isEmpty()) {
            callbackInfo.cancel();
            int n4 = var12.size();
            for (int i = 0; i < n4; ++i) {
                this.N(var12.get(i), f, f2 - (float)(var12.size() * (this.y + 2)) + (float)(i * (this.y + 2)), n, bl, new Matrix4f((Matrix4fc)matrix4f), class014072, class015832, n2, n3);
            }
        }
    }

    private void N(String string, float f, float f2, int n, boolean bl, Matrix4f matrix4f, class01407 class014072, class01583 class015832, int n2, int n3, CallbackInfo callbackInfo) {
        List<class01028> var12;
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest) && !(var12 = this.L(class05936.R((String)(this.N() ? this.N(string) : string)), Integer.MAX_VALUE)).isEmpty()) {
            callbackInfo.cancel();
            int n4 = var12.size();
            for (int i = 0; i < n4; ++i) {
                this.N(var12.get(i), f, f2 - (float)(n4 * (this.y + 2)) + (float)(i * (this.y + 2)), n, bl, new Matrix4f((Matrix4fc)matrix4f), class014072, class015832, n2, n3);
            }
        }
    }

    public boolean N() {
        return class07018.y().N();
    }

    public void N(class01028 class010282, float f, float f2, int n, int n2, Matrix4f matrix4f, class01407 class014072, int n3) {
        class01588 class015882 = new class01588(this, 0.0f, 0.0f, n2, false, false);
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                if (i == 0 && j == 0) continue;
                float[] object = new float[]{f};
                int n6 = i;
                int n7 = j;
                class010282.accept((n4, class004052, n5) -> {
                    boolean bl = class004052.L();
                    class07948 class079482 = this.N(n5, class004052);
                    class015882.N = object[0] + (float)n6 * class079482.N().y();
                    class015882.y = f2 + (float)n7 * class079482.N().y();
                    fArray[0] = object[0] + class079482.N().N(bl);
                    return class015882.N(n4, class004052.N(n2), class079482);
                });
            }
        }
        class01609 class016092 = class01609.N(class014072, matrix4f, class01583.field_33993, n3);
        for (class07915 class079152 : class015882.L) {
            class016092.N(class079152);
        }
        class01588 class015883 = new class01588(this, f, f2, n, false, true);
        class010282.accept((class05197)class015883);
        class015883.N(class01609.N(class014072, matrix4f, class01583.field_33995, n3));
    }

    public void N(class01028 class010282, float f, float f2, int n, boolean bl, Matrix4f matrix4f, class01407 class014072, class01583 class015832, int n2, int n3) {
        this.N(class010282, f, f2, n, bl, false, n2).N(class01609.N(class014072, matrix4f, class015832, n3));
    }

    public void N(class00392 class003922, float f, float f2, int n, boolean bl, Matrix4f matrix4f, class01407 class014072, class01583 class015832, int n2, int n3) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class003922, f, f2, n, bl, matrix4f, class014072, class015832, n2, n3, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.N(class003922.method_30937(), f, f2, n, bl, false, n2).N(class01609.N(class014072, matrix4f, class015832, n3));
    }

    public void N(String string, float f, float f2, int n, boolean bl, Matrix4f matrix4f, class01407 class014072, class01583 class015832, int n2, int n3) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(string, f, f2, n, bl, matrix4f, class014072, class015832, n2, n3, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.N(string, f, f2, n, bl, n2).N(class01609.N(class014072, matrix4f, class015832, n3));
    }

    public String N(String string) {
        try {
            Bidi bidi = new Bidi(new ArabicShaping(8).shape(string), 127);
            bidi.setReorderingMode(0);
            return bidi.writeReordered(2);
        }
        catch (ArabicShapingException arabicShapingException) {
            return string;
        }
    }

    private class08985 N(class00949 class009492) {
        return this.L.N(class009492);
    }

    public String N(String string, int n, boolean bl) {
        return bl ? this.B.L(string, n, class00405.N) : this.B.y(string, n, class00405.N);
    }

    public int N(class01028 class010282) {
        return class04995.u((float)this.B.N(class010282));
    }

    public int N(class05936 class059362) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class059362, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        return class04995.u((float)this.B.N(class059362));
    }

    public class01608 N(class01028 class010282, float f, float f2, int n, boolean bl, boolean bl2, int n2) {
        class01588 class015882 = new class01588(this, f, f2, n, n2, bl, bl2);
        class010282.accept((class05197)class015882);
        return class015882;
    }

    public class01608 N(String string, float f, float f2, int n, boolean bl, int n2) {
        if (this.N()) {
            string = this.N(string);
        }
        class01588 class015882 = new class01588(this, f, f2, n, n2, bl, false);
        class05232.L((String)string, (class00405)class00405.N, (class05197)class015882);
        return class015882;
    }

    public class07948 N(int n, class00405 class004052) {
        class08985 class089852 = this.N(class004052.E());
        class07948 class079482 = class089852.N(n);
        if (class004052.M() && n != 32) {
            int n2 = class04995.u((float)class079482.N().N(false));
            class079482 = class089852.N(this.M, n2);
        }
        return class079482;
    }
}

