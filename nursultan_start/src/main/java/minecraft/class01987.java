/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10969
 *  Nursultan.class11938
 *  java.lang.MatchException
 *  minecraft.class00734
 *  minecraft.class01237
 *  minecraft.class01404
 *  minecraft.class01421
 *  minecraft.class01781
 *  minecraft.class03042
 *  minecraft.class03657
 *  minecraft.class03679
 *  minecraft.class03688
 *  minecraft.class04507
 *  minecraft.class04832
 *  minecraft.class05363
 *  minecraft.class06959
 *  minecraft.class07209
 *  minecraft.class08783
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10969;
import Nursultan.class11938;
import minecraft.class00734;
import minecraft.class01237;
import minecraft.class01404;
import minecraft.class01421;
import minecraft.class01781;
import minecraft.class03042;
import minecraft.class03657;
import minecraft.class03679;
import minecraft.class03688;
import minecraft.class04507;
import minecraft.class04832;
import minecraft.class05363;
import minecraft.class06959;
import minecraft.class07209;
import minecraft.class08783;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class01987<T extends class03688, S, ST extends class08783>
extends class04507<T, ST> {
    private final class01781 N;

    private static int L(class03688 class036882) {
        class03657 class036572 = class036882.L();
        return class036572 != null ? class036572.L() : -1;
    }

    protected class01987(class04832 class048322) {
        super(class048322);
        this.N = class048322.N();
    }

    protected int method_24087(T t, class07209 class072092) {
        int n = class01987.L(t);
        if (n != -1) {
            return class03042.N((int)n);
        }
        return super.method_24087(t, class072092);
    }

    protected float method_65247(ST ST) {
        class03657 class036572 = ((class08783)ST).y;
        if (class036572 == null) {
            return 0.0f;
        }
        return class036572.i().method_48886(((class08783)ST).L);
    }

    private static float y(float f) {
        return -f;
    }

    private static <T extends class03688> float y(T t, float f) {
        return t.method_61414(f);
    }

    protected boolean method_62406(T t) {
        return t.y();
    }

    private void N(class08783 class087832, class01421 class014212, class01237 class012372, class06959 class069592, CallbackInfo callbackInfo) {
        class10969 class109692 = class10969.N((class08783)class087832);
        class11938.L().L((Object)class109692);
        if (class109692.y()) {
            callbackInfo.cancel();
        }
    }

    private static <T extends class03688> float N(T t, float f) {
        return t.method_61415(f);
    }

    protected abstract void N(ST var1, class01421 var2, class01237 var3, int var4, float var5);

    public void method_62354(T t, ST ST, float f) {
        super.method_62354(t, ST, f);
        ((class08783)ST).y = t.L();
        ((class08783)ST).L = t.R(f);
        ((class08783)ST).u = class01987.N(t, f);
        ((class08783)ST).i = class01987.y(t, f);
        class05363 class053632 = this.N.y;
        ((class08783)ST).M = class053632.i();
        ((class08783)ST).R = class053632.R();
    }

    protected class00734 method_62358(T t) {
        return t.N();
    }

    protected int method_27950(T t, class07209 class072092) {
        int n = class01987.L(t);
        if (n != -1) {
            return class03042.y((int)n);
        }
        return super.method_27950(t, class072092);
    }

    protected float method_55831(ST ST) {
        class03657 class036572 = ((class08783)ST).y;
        if (class036572 == null) {
            return 0.0f;
        }
        return class036572.u().method_48886(((class08783)ST).L);
    }

    private static float N(float f) {
        return f - 180.0f;
    }

    private Quaternionf N(class03657 class036572, ST ST, Quaternionf quaternionf) {
        return switch (class036572.y()) {
            default -> throw new MatchException(null, null);
            case class03679.field_42406 -> quaternionf.rotationYXZ((float)(-Math.PI) / 180 * ((class08783)ST).u, (float)Math.PI / 180 * ((class08783)ST).i, 0.0f);
            case class03679.field_42408 -> quaternionf.rotationYXZ((float)(-Math.PI) / 180 * ((class08783)ST).u, (float)Math.PI / 180 * class01987.y(((class08783)ST).M), 0.0f);
            case class03679.field_42407 -> quaternionf.rotationYXZ((float)(-Math.PI) / 180 * class01987.N(((class08783)ST).R), (float)Math.PI / 180 * ((class08783)ST).i, 0.0f);
            case class03679.field_42409 -> quaternionf.rotationYXZ((float)(-Math.PI) / 180 * class01987.N(((class08783)ST).R), (float)Math.PI / 180 * class01987.y(((class08783)ST).M), 0.0f);
        };
    }

    public void method_3936(ST ST, class01421 class014212, class01237 class012372, class06959 class069592) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N((class08783)ST, class014212, class012372, class069592, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class03657 class036572 = ((class08783)ST).y;
        if (class036572 == null || !ST.N()) {
            return;
        }
        float f = ((class08783)ST).L;
        super.method_3936(ST, class014212, class012372, class069592);
        class014212.N();
        class014212.N((Quaternionfc)this.N(class036572, ST, new Quaternionf()));
        class01404 class014042 = (class01404)class036572.N().method_48888(f);
        class014212.N(class014042.L());
        this.N(ST, class014212, class012372, ((class08783)ST).G, f);
        class014212.y();
    }
}

