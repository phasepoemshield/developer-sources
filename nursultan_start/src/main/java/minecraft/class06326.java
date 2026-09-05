/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.injection.access.base.IServerData
 *  com.viaversion.viafabricplus.screen.impl.PerServerVersionScreen
 *  com.viaversion.viafabricplus.settings.impl.GeneralSettings
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class03420
 *  minecraft.class04568
 *  minecraft.class04575
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05373
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.viaversion.viafabricplus.injection.access.base.IServerData;
import com.viaversion.viafabricplus.screen.impl.PerServerVersionScreen;
import com.viaversion.viafabricplus.settings.impl.GeneralSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class03420;
import minecraft.class04568;
import minecraft.class04575;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05373;
import minecraft.class06366;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06326
extends class05096 {
    private static final class00392 N = class00392.L((String)"manageServer.enterName");
    private static final class00392 y = class00392.L((String)"manageServer.enterIp");
    private static final class00392 L = class00392.L((String)"selectServer.defaultName");
    private class05362 u;
    private final BooleanConsumer i;
    private final class04568 R;
    private class04927 M;
    private class04927 B;
    private final class05096 Z;
    private String z;
    private String U;

    public class06326(class05096 class050962, class00392 class003922, BooleanConsumer booleanConsumer, class04568 class045682) {
        super(class003922);
        this.Z = class050962;
        this.i = booleanConsumer;
        this.R = class045682;
    }

    private void y() {
        this.u.field_22763 = class03420.y((String)this.M.method_1882());
    }

    private void N(CallbackInfo callbackInfo) {
        int n = GeneralSettings.INSTANCE.addServerScreenButtonOrientation.getIndex();
        if (n == 0) {
            return;
        }
        IServerData iServerData = (IServerData)this.R;
        ProtocolVersion protocolVersion = iServerData.viaFabricPlus$forcedVersion();
        if (this.z != null && this.U != null) {
            this.B.method_1852(this.z);
            this.M.method_1852(this.U);
            this.z = null;
            this.U = null;
        }
        class05373 class053732 = class05362.method_46430((class00392)(protocolVersion == null ? class00392.L((String)"base.viafabricplus.set_version") : class00392.N((String)protocolVersion.getName())), class053622 -> {
            this.z = this.B.method_1882();
            this.U = this.M.method_1882();
            this.field_22787.N((class05096)new PerServerVersionScreen((class05096)this, arg_0 -> ((IServerData)iServerData).viaFabricPlus$forceVersion(arg_0), () -> ((IServerData)iServerData).viaFabricPlus$forcedVersion()));
        }).y(98, 20);
        GeneralSettings.setOrientation((arg_0, arg_1) -> ((class05373)class053732).N(arg_0, arg_1), (int)n, (int)this.field_22789, (int)this.field_22790);
        this.method_37063((class04654)class053732.N());
    }

    private void N() {
        String string = this.B.method_1882();
        this.R.N = string.isEmpty() ? L.getString() : string;
        this.R.y = this.M.method_1882();
        this.i.accept(true);
    }

    public void method_25426() {
        this.B = new class04927(this.field_22793, this.field_22789 / 2 - 100, 66, 200, 20, N);
        this.B.method_1852(this.R.N);
        this.B.method_47404(L);
        this.B.method_1863(string -> this.y());
        this.method_25429((class04654)this.B);
        this.M = new class04927(this.field_22793, this.field_22789 / 2 - 100, 106, 200, 20, y);
        this.M.method_1880(128);
        this.M.method_1852(this.R.y);
        this.M.method_1863(string -> this.y());
        this.method_25429((class04654)this.M);
        this.method_37063((class04654)class06366.N(class04575::N, this.R.y()).N((class04575[])class04575.values()).N(this.field_22789 / 2 - 100, this.field_22790 / 4 + 72, 200, 20, (class00392)class00392.L((String)"manageServer.resourcePack"), (class063662, class045752) -> this.R.N(class045752)));
        this.u = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)class05220.u, class053622 -> this.N()).N(this.field_22789 / 2 - 100, this.field_22790 / 4 + 96 + 18, 200, 20).N());
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.i, class053622 -> this.i.accept(false)).N(this.field_22789 / 2 - 100, this.field_22790 / 4 + 120 + 18, 200, 20).N());
        this.y();
        this.N((CallbackInfo)null);
    }

    protected void method_56131() {
        this.method_48265((class04654)this.B);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class010542.N(this.field_22793, this.field_22785, this.field_22789 / 2, 17, -1);
        class010542.y(this.field_22793, N, this.field_22789 / 2 - 100 + 1, 53, -6250336);
        class010542.y(this.field_22793, y, this.field_22789 / 2 - 100 + 1, 94, -6250336);
        this.B.method_25394(class010542, n, n2, f);
        this.M.method_25394(class010542, n, n2, f);
    }

    public void method_25419() {
        this.field_22787.N(this.Z);
    }

    public void method_25410(int n, int n2) {
        String string = this.M.method_1882();
        String string2 = this.B.method_1882();
        this.method_25423(n, n2);
        this.M.method_1852(string);
        this.B.method_1852(string2);
    }
}

