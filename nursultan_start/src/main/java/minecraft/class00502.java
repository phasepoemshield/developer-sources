/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class06541
 *  minecraft.class06639
 *  minecraft.class06656
 *  minecraft.class06672
 *  minecraft.class06683
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.Sets;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00401;
import minecraft.class00405;
import minecraft.class00497;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class06541;
import minecraft.class06639;
import minecraft.class06656;
import minecraft.class06672;
import minecraft.class06683;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00502
extends class06639 {
    private static final int N = 0;
    private static final int y = 1;
    private final class06683 L;
    private final String u;
    private final Set<String> i = Sets.newHashSet();
    private class00392 R;
    private class00392 M = class05220.N;
    private class00392 B = class05220.N;
    private boolean Z = true;
    private boolean z = true;
    private class06672 U = class06672.field_1442;
    private class06672 E = class06672.field_1442;
    private class06541 W = class06541.field_1070;
    private class06656 m = class06656.field_1437;
    private final class00405 P;

    public void L(@Nullable class00392 class003922) {
        this.B = class003922 == null ? class05220.N : class003922;
        this.L.L(this);
    }

    public String L() {
        return this.u;
    }

    public class00392 M() {
        return this.B;
    }

    public class06541 P() {
        return this.W;
    }

    public class00502(class06683 class066832, String string) {
        this.L = class066832;
        this.u = string;
        this.R = class00392.y(string);
        this.P = class00405.N.N(string).N(new class00401((class00392)class00392.y(string)));
    }

    public Collection<String> B() {
        return this.i;
    }

    public boolean Z() {
        return this.Z;
    }

    private class00405 i(class00392 class003922) {
        for (int i = class003922.method_10855().size() - 1; i >= 0; --i) {
            class00392 class003923 = class003922.method_10855().get(i);
            if (class003923.method_10866() == class00405.N) continue;
            return class003923.method_10866();
        }
        return class003922.method_10866();
    }

    public class05216 i() {
        class05216 class052162 = class00390.N((class00392)this.R.L().L(this.P));
        class06541 class065412 = this.P();
        if (class065412 != class06541.field_1070) {
            class052162.N(class065412);
        }
        return class052162;
    }

    public int m() {
        int n = 0;
        if (this.Z()) {
            n |= 1;
        }
        if (this.z()) {
            n |= 2;
        }
        return n;
    }

    public class06672 U() {
        return this.U;
    }

    public boolean z() {
        return this.z;
    }

    public class05216 u(class00392 class003922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class003922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class05216)callbackInfoReturnable.getReturnValue();
        }
        class05216 class052162 = class00392.i().y(this.M).y(class003922).y(this.B);
        class06541 class065412 = this.P();
        if (class065412 != class06541.field_1070) {
            class052162.N(class065412);
        }
        return class052162;
    }

    public class00392 u() {
        return this.R;
    }

    public void y(boolean bl) {
        this.z = bl;
        this.L.L(this);
    }

    public void y(class06672 class066722) {
        this.E = class066722;
        this.L.L(this);
    }

    public class06683 y() {
        return this.L;
    }

    public void y(@Nullable class00392 class003922) {
        this.M = class003922 == null ? class05220.N : class003922;
        this.L.L(this);
    }

    public class06672 E() {
        return this.E;
    }

    public void N(class06656 class066562) {
        this.m = class066562;
        this.L.L(this);
    }

    private class00392 N(class00392 class003922, class00405 class004052) {
        if (class003922.method_10866() != class00405.N) {
            return class003922;
        }
        return class003922.L().L(class004052);
    }

    public void N(int n) {
        this.N((n & 1) > 0);
        this.y((n & 2) > 0);
    }

    private void N(class00392 class003922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            class00405 class004052 = this.i(this.M);
            class00392 class003923 = this.N(class003922, class004052);
            class00405 class004053 = this.i(class003923);
            callbackInfoReturnable.setReturnValue((Object)class00392.i().y(this.M).y(class003923).y(this.N(this.B, class004053)));
        }
    }

    public void N(class06541 class065412) {
        this.W = class065412;
        this.L.L(this);
    }

    public void N(class00392 class003922) {
        if (class003922 == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.R = class003922;
        this.L.L(this);
    }

    public class00497 N() {
        return new class00497(this.u, Optional.of(this.R), this.W != class06541.field_1070 ? Optional.of(this.W) : Optional.empty(), this.Z, this.z, this.M, this.B, this.U, this.E, this.m, List.copyOf(this.i));
    }

    public void N(boolean bl) {
        this.Z = bl;
        this.L.L(this);
    }

    public static class05216 N(@Nullable class06639 class066392, class00392 class003922) {
        if (class066392 == null) {
            return class003922.L();
        }
        return class066392.u(class003922);
    }

    public void N(class06672 class066722) {
        this.U = class066722;
        this.L.L(this);
    }

    public class06656 W() {
        return this.m;
    }

    public class00392 R() {
        return this.M;
    }
}

