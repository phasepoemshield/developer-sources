/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.viaversion.viafabricplus.injection.access.base.IServerData
 *  com.viaversion.viafabricplus.save.impl.SettingsSave
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00392
 *  minecraft.class03726
 *  minecraft.class04585
 *  minecraft.class06338
 *  minecraft.class07001
 *  minecraft.class07529
 *  minecraft.class07837
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.injection.access.base.IServerData;
import com.viaversion.viafabricplus.save.impl.SettingsSave;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import minecraft.class00392;
import minecraft.class03726;
import minecraft.class04575;
import minecraft.class04579;
import minecraft.class04585;
import minecraft.class06338;
import minecraft.class07001;
import minecraft.class07529;
import minecraft.class07837;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class04568
implements IServerData {
    private static final Logger z = LogUtils.getLogger();
    private static final int U = 1024;
    public String N;
    public String y;
    public class00392 L;
    public class00392 u;
    public @Nullable class07837 i;
    public long R;
    public int M = class07529.y().comp_4027();
    public class00392 B = class00392.y((String)class07529.y().comp_4025());
    public List<class00392> Z = Collections.emptyList();
    private class04575 E = class04575.field_3767;
    private byte @Nullable [] W;
    private class04585 m;
    private int P;
    private class04579 s = class04579.field_47880;
    private ProtocolVersion T = null;
    private boolean b;
    private ProtocolVersion j;

    public byte @Nullable [] L() {
        return this.W;
    }

    public void M() {
        this.P = 0;
    }

    public class04568(String string, String string2, class04585 class045852) {
        this.N = string;
        this.y = string2;
        this.m = class045852;
    }

    public class04579 B() {
        return this.s;
    }

    public boolean i() {
        return this.m == class04585.field_45610;
    }

    public boolean u() {
        return this.m == class04585.field_45609;
    }

    public void y(String string) {
        this.P = string.hashCode();
    }

    public static byte @Nullable [] y(byte @Nullable [] byArray) {
        if (byArray != null) {
            try {
                class03726 class037262 = class03726.N((byte[])byArray);
                if (class037262.N() <= 1024 && class037262.y() <= 1024) {
                    return byArray;
                }
            }
            catch (IOException iOException) {
                z.warn("Failed to decode server icon", (Throwable)iOException);
            }
        }
        return null;
    }

    public void y(class04568 class045682) {
        this.N(class045682);
        this.N(class045682.y());
        this.m = class045682.m;
    }

    public class04575 y() {
        return this.E;
    }

    public void viaFabricPlus$setTranslatingVersion(ProtocolVersion protocolVersion) {
        this.j = protocolVersion;
    }

    public boolean viaFabricPlus$passedDirectConnectScreen() {
        return this.b;
    }

    public void viaFabricPlus$passDirectConnectScreen(boolean bl) {
        this.b = bl;
    }

    public class07001 N() {
        class07001 class070012 = new class07001();
        class070012.N_67("name", this.N);
        class070012.N_67("ip", this.y);
        class070012.y("icon", class06338.d, (Object)this.W);
        class070012.N(class04575.field_56800, (Object)this.E);
        if (this.P != 0) {
            class070012.N("acceptedCodeOfConduct", this.P);
        }
        this.N(null, class070012);
        return class070012;
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable, class07001 class070012) {
        if (this.T != null) {
            class070012.N_67("viafabricplus_forcedversion", this.T.getName());
        }
    }

    private static void N(class07001 class070012, CallbackInfoReturnable callbackInfoReturnable, class04568 class045682) {
        ProtocolVersion protocolVersion;
        if (class070012.y("viafabricplus_forcedversion") && (protocolVersion = SettingsSave.protocolVersionByName((String)class070012.y("viafabricplus_forcedversion", null))) != null) {
            ((IServerData)class045682).viaFabricPlus$forceVersion(protocolVersion);
        }
    }

    private void N(class04568 class045682, CallbackInfo callbackInfo) {
        this.viaFabricPlus$forceVersion(((IServerData)class045682).viaFabricPlus$forcedVersion());
    }

    public boolean N(String string) {
        return this.P == string.hashCode();
    }

    public void N(class04568 class045682) {
        this.y = class045682.y;
        this.N = class045682.N;
        this.W = class045682.W;
        this.N(class045682, null);
    }

    public void N(byte @Nullable [] byArray) {
        this.W = byArray;
    }

    public static class04568 N(class07001 class070012) {
        class04568 class045682 = new class04568(class070012.y("name", ""), class070012.y("ip", ""), class04585.field_45611);
        class045682.N((byte[])class070012.N_15("icon", class06338.d).orElse(null));
        class045682.N(class070012.N(class04575.field_56800).orElse(class04575.field_3767));
        class045682.P = class070012.y("acceptedCodeOfConduct", 0);
        class04568.N(class070012, null, class045682);
        return class045682;
    }

    public void N(class04575 class045752) {
        this.E = class045752;
    }

    public void N(class04579 class045792) {
        this.s = class045792;
    }

    public class04585 R() {
        return this.m;
    }

    public void viaFabricPlus$forceVersion(ProtocolVersion protocolVersion) {
        this.T = protocolVersion;
    }

    public ProtocolVersion viaFabricPlus$forcedVersion() {
        return this.T;
    }

    public ProtocolVersion viaFabricPlus$translatingVersion() {
        return this.j;
    }
}

