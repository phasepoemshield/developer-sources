/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09472
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class05096
 *  minecraft.class05153
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05910
 *  minecraft.class06366
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class07327
 */
package minecraft;

import Nursultan.class09472;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class05096;
import minecraft.class05153;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05910;
import minecraft.class06366;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class07327;

public abstract class class01475
extends class05096 {
    private static final class00392 M = class00392.L((String)"advMode.setCommand");
    private static final class00392 B = class00392.L((String)"advMode.command");
    private static final class00392 Z = class00392.L((String)"advMode.previousOutput");
    protected class04927 N;
    protected class04927 y;
    protected class05362 L;
    protected class05362 u;
    protected class06366<Boolean> i;
    public class05910 R;

    protected void L() {
    }

    public class01475() {
        super(class05153.N);
    }

    protected abstract void i();

    protected void u() {
        this.i();
        class07327 class073272 = this.N();
        if (!class073272.M()) {
            class073272.y(null);
        }
        this.field_22787.N(null);
    }

    abstract int y();

    protected void N(boolean bl) {
        this.y.method_1852(bl ? this.N().L().getString() : "-");
    }

    private void N(String string) {
        class05910 class059102 = this.R;
        this.N(class059102);
    }

    abstract class07327 N();

    private void N(class05910 class059102) {
        if (ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_13)) {
            class059102.u();
        }
    }

    public void method_25426() {
        boolean bl2 = this.N().M();
        this.N = new class09472(this, this.field_22793, this.field_22789 / 2 - 150, 50, 300, 20, (class00392)class00392.L((String)"advMode.command"));
        this.N.method_1880(32500);
        this.N.method_1863(this::N);
        this.method_25429((class04654)this.N);
        this.y = new class04927(this.field_22793, this.field_22789 / 2 - 150, this.y(), 276, 20, (class00392)class00392.L((String)"advMode.previousOutput"));
        this.y.method_1880(32500);
        this.y.method_1888(false);
        this.y.method_1852("-");
        this.method_25429((class04654)this.y);
        this.i = (class06366)this.method_37063((class04654)class06366.N((class00392)class00392.y((String)"O"), (class00392)class00392.y((String)"X"), (boolean)bl2).N().N(this.field_22789 / 2 + 150 - 20, this.y(), 20, 20, (class00392)class00392.L((String)"advMode.trackOutput"), (class063662, bl) -> {
            this.N().N(bl.booleanValue());
            this.N((boolean)bl);
        }));
        this.L();
        this.L = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)class05220.u, class053622 -> this.u()).N(this.field_22789 / 2 - 4 - 150, this.field_22790 / 4 + 120 + 12, 150, 20).N());
        this.u = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)class05220.i, class053622 -> this.method_25419()).N(this.field_22789 / 2 + 4, this.field_22790 / 4 + 120 + 12, 150, 20).N());
        this.R = new class05910(this.field_22787, (class05096)this, this.N, this.field_22793, true, true, 0, 7, false, Integer.MIN_VALUE);
        this.R.N(true);
        class05910 class059102 = this.R;
        this.N(class059102);
        this.N(bl2);
    }

    protected void method_56131() {
        this.method_48265((class04654)this.N);
    }

    public boolean method_25404(class06601 class066012) {
        if (this.R.N(class066012)) {
            return true;
        }
        if (super.method_25404(class066012)) {
            return true;
        }
        if (class066012.u()) {
            this.u();
            return true;
        }
        return false;
    }

    public void method_25393() {
        if (!this.N().N()) {
            this.method_25419();
        }
    }

    public boolean method_73150() {
        return true;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class010542.N(this.field_22793, M, this.field_22789 / 2, 20, -1);
        class010542.y(this.field_22793, B, this.field_22789 / 2 - 150 + 1, 40, -6250336);
        this.N.method_25394(class010542, n, n2, f);
        int n3 = 75;
        if (!this.y.method_1882().isEmpty()) {
            Objects.requireNonNull(this.field_22793);
            class010542.y(this.field_22793, Z, this.field_22789 / 2 - 150 + 1, (n3 += 5 * 9 + 1 + this.y() - 135) + 4, -6250336);
            this.y.method_25394(class010542, n, n2, f);
        }
        this.R.N(class010542, n, n2);
    }

    public void method_25410(int n, int n2) {
        String string = this.N.method_1882();
        this.method_25423(n, n2);
        this.N.method_1852(string);
        class05910 class059102 = this.R;
        this.N(class059102);
    }

    protected class00392 method_53870() {
        if (this.R.N()) {
            return this.R.y();
        }
        return super.method_53870();
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        if (this.R.N(d4)) {
            return true;
        }
        return super.method_25401(d, d2, d3, d4);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.R.N(class066132)) {
            return true;
        }
        return super.method_25402(class066132, bl);
    }
}

