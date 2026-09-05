/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.logging.LogUtils
 *  com.viaversion.viafabricplus.injection.access.base.ILocalSampleLogger
 *  com.viaversion.viafabricplus.injection.access.base.IServerData
 *  com.viaversion.viafabricplus.settings.impl.BedrockSettings
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00606
 *  minecraft.class00642
 *  minecraft.class02270
 *  minecraft.class03420
 *  minecraft.class03437
 *  minecraft.class03459
 *  minecraft.class04549
 *  minecraft.class04568
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05763
 *  minecraft.class06541
 *  minecraft.class07834
 *  minecraft.class07848
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.injection.access.base.ILocalSampleLogger;
import com.viaversion.viafabricplus.injection.access.base.IServerData;
import com.viaversion.viafabricplus.settings.impl.BedrockSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00606;
import minecraft.class00642;
import minecraft.class02270;
import minecraft.class03420;
import minecraft.class03437;
import minecraft.class03459;
import minecraft.class04549;
import minecraft.class04568;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05763;
import minecraft.class06541;
import minecraft.class07834;
import minecraft.class07848;
import org.slf4j.Logger;

public class class04584 {
    private static final Logger N = LogUtils.getLogger();
    private static final class00392 y = class00392.L((String)"multiplayer.status.cannot_connect").y(-65536);
    private final List<class00642> L = Collections.synchronizedList(Lists.newArrayList());

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void y() {
        List<class00642> var1 = this.L;
        synchronized (var1) {
            Iterator<class00642> var2 = this.L.iterator();
            while (var2.hasNext()) {
                class00642 class006422 = var2.next();
                if (!class006422.method_10758()) continue;
                var2.remove();
                class006422.method_10747((class00392)class00392.L((String)"multiplayer.status.cancelled"));
            }
        }
    }

    public void N(InetSocketAddress inetSocketAddress, class03420 class034202, class04568 class045682, class00606 class006062) {
    }

    private class00642 N(InetSocketAddress inetSocketAddress, class00606 class006062, class02270 class022702, Operation operation, LocalRef localRef) {
        return this.N(inetSocketAddress, class006062, class022702, operation, (class04568)localRef.get());
    }

    private class03420 N(String string, Operation operation, LocalRef localRef) {
        return this.N(string, operation, (class04568)localRef.get());
    }

    private class00642 N(InetSocketAddress inetSocketAddress, class00606 class006062, class02270 class022702, Operation operation, class04568 class045682) {
        IServerData iServerData = (IServerData)class045682;
        if (iServerData.viaFabricPlus$forcedVersion() != null && !iServerData.viaFabricPlus$passedDirectConnectScreen()) {
            if (class022702 == null) {
                class022702 = new class02270(1);
            }
            ((ILocalSampleLogger)class022702).viaFabricPlus$setForcedVersion(iServerData.viaFabricPlus$forcedVersion());
            iServerData.viaFabricPlus$passDirectConnectScreen(false);
        }
        return (class00642)operation.call(new Object[]{inetSocketAddress, class006062, class022702});
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void N() {
        List<class00642> var1 = this.L;
        synchronized (var1) {
            Iterator<class00642> var2 = this.L.iterator();
            while (var2.hasNext()) {
                class00642 class006422 = var2.next();
                if (class006422.method_10758()) {
                    class006422.method_10754();
                    continue;
                }
                var2.remove();
                class006422.method_10768();
            }
        }
    }

    public static class00392 N(int n, int n2) {
        class05216 class052162 = class00392.y((String)Integer.toString(n)).N(class06541.field_1080);
        class05216 class052163 = class00392.y((String)Integer.toString(n2)).N(class06541.field_1080);
        return class00392.N((String)"multiplayer.status.player_count", (Object[])new Object[]{class052162, class052163}).N(class06541.field_1063);
    }

    void N(class00392 class003922, class04568 class045682) {
        N.error("Can't ping {}: {}", (Object)class045682.y, (Object)class003922.getString());
        class045682.u = y;
        class045682.L = class05220.N;
    }

    public void N(class04568 class045682, Runnable runnable, Runnable runnable2, class00606 class006062) throws UnknownHostException {
        Object object = class045682.y;
        Operation operation = objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[java.lang.String]");
            return class03420.N((String)((String)objectArray[0]));
        };
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init((Object)class045682);
        class045682 = (class04568)localRefImpl.dispose();
        class03420 class034202 = this.N((String)object, operation, (LocalRef)localRefImpl);
        Optional<InetSocketAddress> optional = class03459.N.N(class034202).map(class03437::u);
        if (optional.isEmpty()) {
            this.N(class05763.L, class045682);
            return;
        }
        InetSocketAddress inetSocketAddress = optional.get();
        class02270 class022702 = null;
        class00606 class006063 = class006062;
        object = inetSocketAddress;
        Operation operation2 = objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[java.net.InetSocketAddress, net.minecraft.class_12239, net.minecraft.class_9191]");
            Object[] objectArray2 = objectArray;
            return class00642.method_10753((InetSocketAddress)((InetSocketAddress)objectArray[0]), (class00606)((class00606)objectArray2[1]), (class02270)((class02270)objectArray2[2]));
        };
        LocalRefImpl localRefImpl2 = new LocalRefImpl();
        localRefImpl2.init((Object)class045682);
        class045682 = (class04568)localRefImpl2.dispose();
        class00642 class006422 = this.N((InetSocketAddress)object, class006063, class022702, operation2, (LocalRef)localRefImpl2);
        this.L.add(class006422);
        class045682.u = class00392.L((String)"multiplayer.status.pinging");
        class045682.Z = Collections.emptyList();
        class04549 class045492 = new class04549(this, class006422, class045682, runnable, runnable2, inetSocketAddress, class034202, class006062);
        try {
            class006422.method_52903(class034202.N(), class034202.y(), (class07834)class045492);
            class006422.method_10743((class00381)class07848.N);
        }
        catch (Throwable throwable) {
            N.error("Failed to ping server {}", (Object)class034202, (Object)throwable);
        }
    }

    private class03420 N(String string, Operation operation, class04568 class045682) {
        return (class03420)operation.call(new Object[]{BedrockSettings.replaceDefaultPort((String)string, (ProtocolVersion)((IServerData)class045682).viaFabricPlus$forcedVersion())});
    }
}

