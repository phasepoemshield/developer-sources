/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.logging.LogUtils
 *  com.viaversion.viafabricplus.injection.access.base.IServerData
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.screen.impl.ProtocolSelectionScreen
 *  com.viaversion.viafabricplus.settings.impl.BedrockSettings
 *  com.viaversion.viafabricplus.settings.impl.GeneralSettings
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00392
 *  minecraft.class01885
 *  minecraft.class02102
 *  minecraft.class03420
 *  minecraft.class03686
 *  minecraft.class04563
 *  minecraft.class04568
 *  minecraft.class04584
 *  minecraft.class04585
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05681
 *  minecraft.class05691
 *  minecraft.class05692
 *  minecraft.class05714
 *  minecraft.class05733
 *  minecraft.class05763
 *  minecraft.class06202
 *  minecraft.class06326
 *  minecraft.class06478
 *  minecraft.class06601
 *  minecraft.class08293
 *  minecraft.class08311
 *  minecraft.class08392
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  ru.fiw.proxyserver.Config
 *  ru.fiw.proxyserver.GuiProxy
 *  ru.fiw.proxyserver.Proxy
 *  ru.fiw.proxyserver.ProxyServer
 *  ru.fiw.proxyserver.mixin.ScreenAccessor
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.injection.access.base.IServerData;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.screen.impl.ProtocolSelectionScreen;
import com.viaversion.viafabricplus.settings.impl.BedrockSettings;
import com.viaversion.viafabricplus.settings.impl.GeneralSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.List;
import minecraft.class00392;
import minecraft.class01885;
import minecraft.class02102;
import minecraft.class03420;
import minecraft.class03686;
import minecraft.class04563;
import minecraft.class04568;
import minecraft.class04584;
import minecraft.class04585;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05339;
import minecraft.class05362;
import minecraft.class05681;
import minecraft.class05691;
import minecraft.class05692;
import minecraft.class05714;
import minecraft.class05733;
import minecraft.class05763;
import minecraft.class06202;
import minecraft.class06326;
import minecraft.class06478;
import minecraft.class06601;
import minecraft.class08293;
import minecraft.class08311;
import minecraft.class08392;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.fiw.proxyserver.Config;
import ru.fiw.proxyserver.GuiProxy;
import ru.fiw.proxyserver.Proxy;
import ru.fiw.proxyserver.ProxyServer;
import ru.fiw.proxyserver.mixin.ScreenAccessor;

public class class05304
extends class05096 {
    private static final Logger y = LogUtils.getLogger();
    private static final int L = 100;
    private static final int u = 74;
    private final class03686 i = new class03686((class05096)this, 33, 60);
    private final class04584 R = new class04584();
    private final class05096 M;
    protected class05691 N;
    private class04563 B;
    private class05362 Z;
    private class05362 z;
    private class05362 U;
    private class04568 E;
    private class08311 W;
    private @Nullable class08293 m;
    private class05362 P;

    public class04563 L() {
        return this.B;
    }

    private void L(boolean bl) {
        if (bl) {
            class04568 class045682 = this.B.y(this.E.y);
            if (class045682 != null) {
                class045682.N(this.E);
                this.B.y();
            } else {
                this.B.N(this.E, false);
                this.B.y();
            }
            this.N.method_25313(null);
            this.N.N(this.B);
        }
        this.field_22787.N((class05096)this);
    }

    public class05304(class05096 class050962) {
        super((class00392)class00392.L((String)"multiplayer.title"));
        this.M = class050962;
    }

    private void u(boolean bl) {
        if (bl) {
            class04568 class045682 = this.B.N(this.E.y);
            if (class045682 == null) {
                this.B.N(this.E, true);
                this.B.y();
                class04568 class045683 = this.E;
                class05304 class053042 = this;
                this.N(class053042, class045683, objectArray -> {
                    WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_500, net.minecraft.class_642]");
                    ((class05304)((Object)((Object)objectArray[0]))).N((class04568)objectArray[1]);
                    return null;
                });
            } else {
                class04568 class045684 = class045682;
                class05304 class053043 = this;
                this.N(class053043, class045684, objectArray -> {
                    WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_500, net.minecraft.class_642]");
                    ((class05304)((Object)((Object)objectArray[0]))).N((class04568)objectArray[1]);
                    return null;
                });
            }
        } else {
            this.field_22787.N((class05096)this);
        }
    }

    private void u() {
        this.field_22787.N((class05096)new class05304(this.M));
    }

    private void y(CallbackInfo callbackInfo) {
        int n = GeneralSettings.INSTANCE.multiplayerScreenButtonOrientation.getIndex();
        if (n == 0) {
            return;
        }
        if (this.P == null) {
            this.P = class05362.method_46430(class00392.N((String)"ViaFabricPlus"), class053622 -> ProtocolSelectionScreen.INSTANCE.open((class05096)this)).y(98, 20).N();
            this.method_37063((class04654)this.P);
        }
        GeneralSettings.setOrientation((arg_0, arg_1) -> ((class05362)this.P).y(arg_0, arg_1), (int)n, (int)this.field_22789, (int)this.field_22790);
    }

    public class04584 y() {
        return this.R;
    }

    private void y(boolean bl) {
        class05681 class056812 = (class05681)this.N.method_25334();
        if (bl && class056812 instanceof class05692) {
            class04568 class045682 = ((class05692)class056812).L();
            class045682.N = this.E.N;
            class045682.y = this.E.y;
            class045682.y(this.E);
            this.B.y();
            this.N.N(this.B);
        }
        this.field_22787.N((class05096)this);
    }

    private class03420 N(String string, Operation operation, class04568 class045682) {
        IServerData iServerData = (IServerData)class045682;
        ProtocolVersion protocolVersion = iServerData.viaFabricPlus$passedDirectConnectScreen() ? ProtocolTranslator.getTargetVersion() : iServerData.viaFabricPlus$forcedVersion();
        return (class03420)operation.call(new Object[]{BedrockSettings.replaceDefaultPort((String)string, (ProtocolVersion)protocolVersion)});
    }

    public void N(CallbackInfo callbackInfo) {
        String string = class06202.Nq().Ny().L();
        if (!string.equals(Config.lastPlayerName)) {
            Config.lastPlayerName = string;
            if (Config.accounts.containsKey(string)) {
                ProxyServer.proxy = (Proxy)Config.accounts.get(string);
            } else if (Config.accounts.containsKey("")) {
                ProxyServer.proxy = (Proxy)Config.accounts.get("");
            }
        }
        class05304 class053042 = this;
        ProxyServer.proxyMenuButton = class05362.method_46430((class00392)class00392.y((String)("Proxy: " + ProxyServer.getLastUsedProxyIp())), class053622 -> class06202.Nq().N((class05096)new GuiProxy((class05096)class053042))).N(class053042.field_22789 - 125, 5, 120, 20).N();
        ScreenAccessor screenAccessor = (ScreenAccessor)class053042;
        screenAccessor.getDrawables().add(ProxyServer.proxyMenuButton);
        screenAccessor.getSelectables().add(ProxyServer.proxyMenuButton);
        screenAccessor.getChildren().add(ProxyServer.proxyMenuButton);
    }

    private void N(boolean bl) {
        class05681 class056812 = (class05681)this.N.method_25334();
        if (bl && class056812 instanceof class05692) {
            this.B.N(((class05692)class056812).L());
            this.B.y();
            this.N.method_25313(null);
            this.N.N(this.B);
        }
        this.field_22787.N((class05096)this);
    }

    private void N(class05304 class053042, class04568 class045682, Operation operation) {
        ((IServerData)class045682).viaFabricPlus$passDirectConnectScreen(true);
        operation.call(new Object[]{class053042, class045682});
    }

    public void N(class04568 class045682) {
        String string = class045682.y;
        Operation operation = objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[java.lang.String]");
            return class03420.N((String)((String)objectArray[0]));
        };
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init((Object)class045682);
        class045682 = (class04568)localRefImpl.dispose();
        class05763.N((class05096)this, (class06202)this.field_22787, (class03420)this.N(string, operation, (LocalRef)localRefImpl), (class04568)class045682, (boolean)false, null);
    }

    protected void N() {
        this.z.field_22763 = false;
        this.Z.field_22763 = false;
        this.U.field_22763 = false;
        class05681 class056812 = (class05681)this.N.method_25334();
        if (class056812 != null && !(class056812 instanceof class05714)) {
            this.z.field_22763 = true;
            if (class056812 instanceof class05692) {
                this.Z.field_22763 = true;
                this.U.field_22763 = true;
            }
        }
    }

    private class03420 N(String string, Operation operation, LocalRef localRef) {
        return this.N(string, operation, (class04568)localRef.get());
    }

    public void method_25426() {
        this.i.N(this.field_22785, this.field_22793);
        this.B = new class04563(this.field_22787);
        this.B.N();
        this.W = new class08311();
        try {
            this.m = new class08293(this.W);
            this.m.start();
        }
        catch (Exception exception) {
            y.warn("Unable to start LAN server detection: {}", (Object)exception.getMessage());
        }
        this.N = (class05691)this.i.L((class02102)new class05691(this, this.field_22787, this.field_22789, this.i.u(), this.i.L(), 36));
        this.N.N(this.B);
        class01885 class018852 = (class01885)this.i.y((class02102)class01885.u().N(4));
        class018852.L().y();
        class01885 class018853 = (class01885)class018852.N((class02102)class01885.i().N(4));
        class01885 class018854 = (class01885)class018852.N((class02102)class01885.i().N(4));
        this.z = (class05362)class018853.N((class02102)class05362.method_46430((class00392)class00392.L((String)"selectServer.select"), class053622 -> {
            class05681 class056812 = (class05681)this.N.method_25334();
            if (class056812 != null) {
                class056812.N();
            }
        }).N(100).N());
        class018853.N((class02102)class05362.method_46430((class00392)class00392.L((String)"selectServer.direct"), class053622 -> {
            this.E = new class04568(class08392.N((String)"selectServer.defaultName", (Object[])new Object[0]), "", class04585.field_45611);
            this.field_22787.N((class05096)new class05339(this, this::u, this.E));
        }).N(100).N());
        class018853.N((class02102)class05362.method_46430((class00392)class00392.L((String)"selectServer.add"), class053622 -> {
            this.E = new class04568("", "", class04585.field_45611);
            this.field_22787.N((class05096)new class06326((class05096)this, (class00392)class00392.L((String)"manageServer.add.title"), this::L, this.E));
        }).N(100).N());
        this.Z = (class05362)class018854.N((class02102)class05362.method_46430((class00392)class00392.L((String)"selectServer.edit"), class053622 -> {
            class05681 class056812 = (class05681)this.N.method_25334();
            if (class056812 instanceof class05692) {
                class04568 class045682 = ((class05692)class056812).L();
                this.E = new class04568(class045682.N, class045682.y, class04585.field_45611);
                this.E.y(class045682);
                this.field_22787.N((class05096)new class06326((class05096)this, (class00392)class00392.L((String)"manageServer.edit.title"), this::y, this.E));
            }
        }).N(74).N());
        this.U = (class05362)class018854.N((class02102)class05362.method_46430((class00392)class00392.L((String)"selectServer.delete"), class053622 -> {
            String string;
            class05681 class056812 = (class05681)this.N.method_25334();
            if (class056812 instanceof class05692 && (string = ((class05692)class056812).L().N) != null) {
                class05216 class052162 = class00392.L((String)"selectServer.deleteQuestion");
                class05216 class052163 = class00392.N((String)"selectServer.deleteWarning", (Object[])new Object[]{string});
                class05216 class052164 = class00392.L((String)"selectServer.deleteButton");
                class00392 class003922 = class05220.i;
                this.field_22787.N((class05096)new class05733(this::N, (class00392)class052162, (class00392)class052163, (class00392)class052164, class003922));
            }
        }).N(74).N());
        class018854.N((class02102)class05362.method_46430((class00392)class00392.L((String)"selectServer.refresh"), class053622 -> this.u()).N(74).N());
        class018854.N((class02102)class05362.method_46430(class05220.U, class053622 -> this.method_25419()).N(74).N());
        this.i.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
        this.N();
        this.N((CallbackInfo)null);
    }

    public boolean method_25404(class06601 class066012) {
        if (super.method_25404(class066012)) {
            return true;
        }
        if (class066012.v() == 294) {
            this.u();
            return true;
        }
        return false;
    }

    public void method_48640() {
        this.i.N();
        if (this.N != null) {
            this.N.method_57712(this.field_22789, this.i);
        }
        this.y((CallbackInfo)null);
    }

    public void method_25393() {
        super.method_25393();
        List var1 = this.W.N();
        if (var1 != null) {
            this.N.N(var1);
        }
        this.R.N();
    }

    public void method_25432() {
        if (this.m != null) {
            this.m.interrupt();
            this.m = null;
        }
        this.R.y();
        this.N.y();
    }

    public void method_25419() {
        this.field_22787.N(this.M);
    }
}

