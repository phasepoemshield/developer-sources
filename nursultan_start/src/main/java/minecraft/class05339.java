/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.screen.impl.ProtocolSelectionScreen
 *  com.viaversion.viafabricplus.settings.impl.GeneralSettings
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class03420
 *  minecraft.class04568
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05630
 *  minecraft.class06601
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.viaversion.viafabricplus.screen.impl.ProtocolSelectionScreen;
import com.viaversion.viafabricplus.settings.impl.GeneralSettings;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class03420;
import minecraft.class04568;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05373;
import minecraft.class05630;
import minecraft.class06601;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05339
extends class05096 {
    private static final class00392 N = class00392.L((String)"manageServer.enterIp");
    private class05362 y;
    private final class04568 L;
    private class04927 u;
    private final BooleanConsumer i;
    private final class05096 R;

    public class05339(class05096 class050962, BooleanConsumer booleanConsumer, class04568 class045682) {
        super((class00392)class00392.L((String)"selectServer.direct"));
        this.R = class050962;
        this.L = class045682;
        this.i = booleanConsumer;
    }

    private void y() {
        this.y.field_22763 = class03420.y((String)this.u.method_1882());
    }

    private void N() {
        this.L.y = this.u.method_1882();
        this.i.accept(true);
    }

    private void N(CallbackInfo callbackInfo) {
        int n = GeneralSettings.INSTANCE.directConnectScreenButtonOrientation.getIndex();
        if (n == 0) {
            return;
        }
        class05373 class053732 = class05362.method_46430(class00392.N((String)"ViaFabricPlus"), class053622 -> ProtocolSelectionScreen.INSTANCE.open((class05096)this)).y(98, 20);
        GeneralSettings.setOrientation(class053732::N, (int)n, (int)this.field_22789, (int)this.field_22790);
        this.method_37063((class04654)class053732.N());
    }

    public void method_25426() {
        this.u = new class04927(this.field_22793, this.field_22789 / 2 - 100, 116, 200, 20, N);
        this.u.method_1880(128);
        this.u.method_1852(((class05630)this.field_22787.i_7).Nl);
        this.u.method_1863(string -> this.y());
        this.method_25429((class04654)this.u);
        this.y = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"selectServer.select"), class053622 -> this.N()).N(this.field_22789 / 2 - 100, this.field_22790 / 4 + 96 + 12, 200, 20).N());
        this.method_37063((class04654)class05362.method_46430(class05220.i, class053622 -> this.i.accept(false)).N(this.field_22789 / 2 - 100, this.field_22790 / 4 + 120 + 12, 200, 20).N());
        this.y();
        this.N((CallbackInfo)null);
    }

    protected void method_56131() {
        this.method_48265((class04654)this.u);
    }

    public boolean method_25404(class06601 class066012) {
        if (this.y.field_22763 && this.method_25399() == this.u && class066012.u()) {
            this.N();
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_25432() {
        ((class05630)this.field_22787.i_7).Nl = this.u.method_1882();
        ((class05630)this.field_22787.i_7).Np();
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class010542.N(this.field_22793, this.field_22785, this.field_22789 / 2, 20, -1);
        class010542.y(this.field_22793, N, this.field_22789 / 2 - 100 + 1, 100, -6250336);
        this.u.method_25394(class010542, n, n2, f);
    }

    public void method_25419() {
        this.field_22787.N(this.R);
    }

    public void method_25410(int n, int n2) {
        String string = this.u.method_1882();
        this.method_25423(n, n2);
        this.u.method_1852(string);
    }
}

