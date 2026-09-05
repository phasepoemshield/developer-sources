/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.settings.impl.DebugSettings
 *  java.lang.MatchException
 *  minecraft.class00381
 *  minecraft.class00384
 *  minecraft.class00392
 *  minecraft.class00402
 *  minecraft.class01475
 *  minecraft.class04654
 *  minecraft.class06366
 *  minecraft.class07327
 *  minecraft.class07358
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import minecraft.class00381;
import minecraft.class00384;
import minecraft.class00392;
import minecraft.class00402;
import minecraft.class01475;
import minecraft.class04654;
import minecraft.class06366;
import minecraft.class07327;
import minecraft.class07358;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05995
extends class01475 {
    private final class00402 M;
    private class06366<class00384> B;
    private class06366<Boolean> Z;
    private class06366<Boolean> z;
    private class00384 U = class00384.field_11924;
    private boolean E;
    private boolean W;

    protected void L() {
        this.B = (class06366)this.method_37063((class04654)class06366.N(class003842 -> switch (class003842) {
            default -> throw new MatchException(null, null);
            case class00384.field_11922 -> class00392.L((String)"advMode.mode.sequence");
            case class00384.field_11923 -> class00392.L((String)"advMode.mode.auto");
            case class00384.field_11924 -> class00392.L((String)"advMode.mode.redstone");
        }, (Object)this.U).N((Object[])class00384.values()).N().N(this.field_22789 / 2 - 50 - 100 - 4, 165, 100, 20, (class00392)class00392.L((String)"advMode.mode"), (class063662, class003842) -> {
            this.U = class003842;
        }));
        this.Z = (class06366)this.method_37063((class04654)class06366.N((class00392)class00392.L((String)"advMode.mode.conditional"), (class00392)class00392.L((String)"advMode.mode.unconditional"), (boolean)this.E).N().N(this.field_22789 / 2 - 50, 165, 100, 20, (class00392)class00392.L((String)"advMode.type"), (class063662, bl) -> {
            this.E = bl;
        }));
        this.z = (class06366)this.method_37063((class04654)class06366.N((class00392)class00392.L((String)"advMode.mode.autoexec.bat"), (class00392)class00392.L((String)"advMode.mode.redstoneTriggered"), (boolean)this.W).N().N(this.field_22789 / 2 + 50 + 4, 165, 100, 20, (class00392)class00392.L((String)"advMode.triggering"), (class063662, bl) -> {
            this.W = bl;
        }));
    }

    public class05995(class00402 class004022) {
        this.M = class004022;
    }

    protected void i() {
        this.field_22787.NE().N((class00381)new class07358(this.M.d(), this.N.method_1882(), this.U, this.M.N().M(), this.E, this.W));
    }

    private void y(boolean bl) {
        this.L.field_22763 = bl;
        this.i.field_22763 = bl;
        this.B.field_22763 = bl;
        this.Z.field_22763 = bl;
        this.z.field_22763 = bl;
    }

    int y() {
        return 135;
    }

    private void N(CallbackInfo callbackInfo) {
        if (DebugSettings.INSTANCE.hideModernCommandBlockScreenFeatures.isEnabled()) {
            this.B.field_22764 = false;
            this.Z.field_22764 = false;
            this.z.field_22764 = false;
            this.R();
        }
    }

    class07327 N() {
        return this.M.N();
    }

    public void method_25426() {
        super.method_25426();
        this.y(false);
        this.N(null);
    }

    public void method_25410(int n, int n2) {
        super.method_25410(n, n2);
        this.y(true);
    }

    public void R() {
        class07327 class073272 = this.M.N();
        this.N.method_1852(class073272.u());
        boolean bl = class073272.M();
        this.U = this.M.Z();
        this.E = this.M.z();
        this.W = this.M.u();
        this.i.N((Object)bl);
        this.B.N((Object)this.U);
        this.Z.N((Object)this.E);
        this.z.N((Object)this.W);
        this.N(bl);
        this.y(true);
    }
}

