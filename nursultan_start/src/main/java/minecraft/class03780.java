/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00891
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01683
 *  minecraft.class02566
 *  minecraft.class03610
 *  minecraft.class04453
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05904
 *  minecraft.class06125
 *  minecraft.class06202
 *  minecraft.class06601
 *  minecraft.class06626
 *  minecraft.class07036
 *  minecraft.class07267
 *  minecraft.class07807
 *  minecraft.class08385
 *  org.joml.Vector3f
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.stream.IntStream;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00891;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01683;
import minecraft.class02566;
import minecraft.class03610;
import minecraft.class04453;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05904;
import minecraft.class06125;
import minecraft.class06202;
import minecraft.class06601;
import minecraft.class06626;
import minecraft.class07036;
import minecraft.class07267;
import minecraft.class07807;
import minecraft.class08385;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class03780
extends class05096 {
    protected final class07267 L;
    private class03610 N;
    private final String[] y;
    private final boolean i;
    protected final class05904 u;
    private int R;
    private int M;
    private @Nullable class06125 B;

    private boolean L() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return (class04453)this.field_22787.T_4 != null && !this.L.k() && !this.L.y(((class04453)this.field_22787.T_4).method_5667());
    }

    private void L(class01054 class010542) {
        int n;
        int n2;
        int n3;
        String string;
        int n4;
        Vector3f vector3f = this.y();
        class010542.i().scale(vector3f.x(), vector3f.y());
        int n5 = this.N.N() ? this.N.y().R() : class08385.N((class03610)this.N);
        boolean bl = this.R / 6 % 2 == 0;
        int n6 = this.B.M();
        int n7 = this.B.B();
        int n8 = 4 * this.L.R() / 2;
        int n9 = this.M * this.L.R() - n8;
        for (n4 = 0; n4 < this.y.length; ++n4) {
            string = this.y[n4];
            if (string == null) continue;
            if (this.field_22793.N()) {
                string = this.field_22793.N(string);
            }
            n3 = -this.field_22793.y(string) / 2;
            class010542.N(this.field_22793, string, n3, n4 * this.L.R() - n8, n5, false);
            if (n4 != this.M || n6 < 0 || !bl) continue;
            n2 = this.field_22793.y(string.substring(0, Math.max(Math.min(n6, string.length()), 0)));
            n = n2 - this.field_22793.y(string) / 2;
            if (n6 < string.length()) continue;
            class010542.N(this.field_22793, "_", n, n9, n5, false);
        }
        for (n4 = 0; n4 < this.y.length; ++n4) {
            string = this.y[n4];
            if (string == null || n4 != this.M || n6 < 0) continue;
            n3 = this.field_22793.y(string.substring(0, Math.max(Math.min(n6, string.length()), 0)));
            n2 = n3 - this.field_22793.y(string) / 2;
            if (bl && n6 < string.length()) {
                class010542.N(n2, n9 - 1, n2 + 1, n9 + this.L.R(), class02566.M((int)n5));
            }
            if (n7 == n6) continue;
            n = Math.min(n6, n7);
            int n10 = Math.max(n6, n7);
            int n11 = this.field_22793.y(string.substring(0, n)) - this.field_22793.y(string) / 2;
            int n12 = this.field_22793.y(string.substring(0, n10)) - this.field_22793.y(string) / 2;
            int n13 = Math.min(n11, n12);
            int n14 = Math.max(n11, n12);
            class010542.N(n13, n9, n14, n9 + this.L.R(), true);
        }
    }

    public class03780(class07267 class072672, boolean bl, boolean bl2) {
        this(class072672, bl, bl2, (class00392)class00392.L((String)"sign.edit"));
    }

    public class03780(class07267 class072672, boolean bl, boolean bl2, class00392 class003922) {
        super(class003922);
        this.L = class072672;
        this.N = class072672.N(bl);
        this.i = bl;
        this.u = class07036.N((class00891)class072672.w().i());
        this.y = (String[])IntStream.range(0, 4).mapToObj(n -> this.N.N(n, bl2)).map(class00392::getString).toArray(String[]::new);
    }

    private void u() {
        this.field_22787.N(null);
    }

    private void y(class01054 class010542) {
        class010542.i().pushMatrix();
        class010542.i().translate((float)this.field_22789 / 2.0f, this.N());
        class010542.i().pushMatrix();
        this.N(class010542);
        class010542.i().popMatrix();
        this.L(class010542);
        class010542.i().popMatrix();
    }

    protected abstract Vector3f y();

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_4)) {
            callbackInfoReturnable.setReturnValue((Object)this.L.O().method_20526(this.L.w()));
        }
    }

    protected abstract float N();

    private void N(String string) {
        this.y[this.M] = string;
        this.N = this.N.N(this.M, (class00392)class00392.y((String)string));
        this.L.N(this.N, this.i);
    }

    protected abstract void N(class01054 var1);

    public void method_25426() {
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.u, class053622 -> this.u()).N(this.field_22789 / 2 - 100, this.field_22790 / 4 + 144, 200, 20).N());
        this.B = new class06125(() -> this.y[this.M], this::N, class06125.N((class06202)this.field_22787), class06125.L((class06202)this.field_22787), string -> ((class01590)this.field_22787.i_3).y(string) <= this.L.M());
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.B()) {
            this.M = this.M - 1 & 3;
            this.B.R();
            return true;
        }
        if (class066012.Z() || class066012.u()) {
            this.M = this.M + 1 & 3;
            this.B.R();
            return true;
        }
        if (this.B.N(class066012)) {
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_25393() {
        ++this.R;
        if (!this.L()) {
            this.u();
        }
    }

    public boolean method_73150() {
        return true;
    }

    public void method_25432() {
        class01683 class016832 = this.field_22787.NE();
        if (class016832 != null) {
            class016832.N((class00381)new class07807(this.L.d(), this.i, this.y[0], this.y[1], this.y[2], this.y[3]));
        }
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class010542.N(this.field_22793, this.field_22785, this.field_22789 / 2, 40, -1);
        this.y(class010542);
    }

    public void method_25419() {
        this.u();
    }

    public boolean method_25421() {
        return false;
    }

    public boolean method_25400(class06626 class066262) {
        this.B.N(class066262);
        return true;
    }
}

