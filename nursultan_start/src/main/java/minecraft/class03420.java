/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.net.HostAndPort
 *  com.mojang.logging.LogUtils
 *  com.viaversion.viafabricplus.injection.access.base.bedrock.IServerAddress
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  dev.kastle.netty.channel.nethernet.config.NetherNetAddress
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.net.HostAndPort;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.injection.access.base.bedrock.IServerAddress;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import dev.kastle.netty.channel.nethernet.config.NetherNetAddress;
import java.net.IDN;
import minecraft.class03459;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public final class class03420
implements IServerAddress {
    private static final Logger N = LogUtils.getLogger();
    private final HostAndPort y;
    private static final class03420 L = new class03420(HostAndPort.fromParts((String)"server.invalid", (int)25565));
    private NetherNetAddress u;

    static int L(String string) {
        try {
            return Integer.parseInt(string.trim());
        }
        catch (Exception exception) {
            return 25565;
        }
    }

    public class03420(String string, int n) {
        this(HostAndPort.fromParts((String)string, (int)n));
    }

    private class03420(HostAndPort hostAndPort) {
        this.y = hostAndPort;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof class03420) {
            return this.y.equals((Object)((class03420)object).y);
        }
        return false;
    }

    public String toString() {
        return this.y.toString();
    }

    public int hashCode() {
        return this.y.hashCode();
    }

    public int y() {
        return this.y.getPort();
    }

    public static boolean y(String string) {
        try {
            String string2 = HostAndPort.fromString((String)string).getHost();
            if (!string2.isEmpty()) {
                IDN.toASCII(string2);
                return true;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        return false;
    }

    private static void N(String string, CallbackInfoReturnable callbackInfoReturnable) {
        if (!((class03420)callbackInfoReturnable.getReturnValue()).equals(L) && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_16_4)) {
            callbackInfoReturnable.setReturnValue((Object)class03459.N.y.lookupRedirect((class03420)callbackInfoReturnable.getReturnValue()).orElse((class03420)callbackInfoReturnable.getReturnValue()));
        }
    }

    public String N() {
        try {
            return IDN.toASCII(this.y.getHost());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return "";
        }
    }

    public static class03420 N(@Nullable String string) {
        class03420 class034202;
        HostAndPort hostAndPort;
        block8: {
            class03420 class034203;
            if (string == null) {
                class03420 class034204 = L;
                class03420 class034205 = class034204;
                class034205 = new CallbackInfoReturnable("", true, (Object)class034205);
                class03420.N(string, (CallbackInfoReturnable)class034205);
                if (class034205.isCancelled()) {
                    return (class03420)class034205.getReturnValue();
                }
                return class034204;
            }
            try {
                hostAndPort = HostAndPort.fromString((String)string).withDefaultPort(25565);
                if (!hostAndPort.getHost().isEmpty()) break block8;
                class034203 = L;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                N.info("Failed to parse URL {}", (Object)string, (Object)illegalArgumentException);
                class03420 class034206 = L;
                class03420 class034207 = class034206;
                class034207 = new CallbackInfoReturnable("", true, (Object)class034207);
                class03420.N(string, (CallbackInfoReturnable)class034207);
                if (class034207.isCancelled()) {
                    return (class03420)class034207.getReturnValue();
                }
                return class034206;
            }
            class03420 class034208 = class034203;
            class034208 = new CallbackInfoReturnable("", true, (Object)class034208);
            class03420.N(string, (CallbackInfoReturnable)class034208);
            if (class034208.isCancelled()) {
                return (class03420)class034208.getReturnValue();
            }
            return class034203;
        }
        class03420 class034209 = class034202 = new class03420(hostAndPort);
        class034202 = new CallbackInfoReturnable("", true, (Object)class034202);
        class03420.N(string, (CallbackInfoReturnable)class034202);
        if (class034202.isCancelled()) {
            return (class03420)class034202.getReturnValue();
        }
        return class034209;
    }

    public void viaFabricPlus$setNetherNetAddress(NetherNetAddress netherNetAddress) {
        this.u = netherNetAddress;
    }

    public NetherNetAddress viaFabricPlus$getNetherNetAddress() {
        return this.u;
    }
}

