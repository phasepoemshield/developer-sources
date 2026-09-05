/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.HashFunction
 *  com.google.common.hash.Hashing
 *  com.mojang.util.UndashedUuid
 *  com.viaversion.viafabricplus.features.networking.resource_pack_header.ResourcePackHeaderDiff
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class01603
 *  minecraft.class01789
 *  minecraft.class01797
 *  minecraft.class03813
 *  minecraft.class03814
 *  minecraft.class03848
 *  minecraft.class04551
 *  minecraft.class04771
 *  minecraft.class08735
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.mojang.util.UndashedUuid;
import com.viaversion.viafabricplus.features.networking.resource_pack_header.ResourcePackHeaderDiff;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.net.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import minecraft.class00232;
import minecraft.class01603;
import minecraft.class01789;
import minecraft.class01797;
import minecraft.class03813;
import minecraft.class03814;
import minecraft.class03848;
import minecraft.class04551;
import minecraft.class04771;
import minecraft.class08735;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

class class00222
implements class03813 {
    private static final int R = 0xFA00000;
    private static final HashFunction M = Hashing.sha1();
    final /* synthetic */ class04771 N;
    final /* synthetic */ class01789 y;
    final /* synthetic */ Proxy L;
    final /* synthetic */ Executor u;
    final /* synthetic */ class00232 i;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class00222(class00232 class002322, class04771 class047712, class01789 class017892, Proxy proxy, Executor executor) {
        this.i = class002322;
        this.N = class047712;
        this.y = class017892;
        this.L = proxy;
        this.u = executor;
    }

    private class04551 y() {
        return ResourcePackHeaderDiff.get((ProtocolVersion)ProtocolTranslator.getTargetVersion());
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map)callbackInfoReturnable.getReturnValue());
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_3)) {
            linkedHashMap.remove("X-Minecraft-Version-ID");
            if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
                linkedHashMap.remove("X-Minecraft-Pack-Format");
                linkedHashMap.remove("User-Agent");
            }
        }
        callbackInfoReturnable.setReturnValue(linkedHashMap);
    }

    private String N(Object object) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_7) && object instanceof class08735) {
            return String.valueOf(((class08735)object).y());
        }
        return String.valueOf(object);
    }

    public void N(Map<UUID, class03848> map, Consumer<class03814> consumer) {
        this.y.N(new class01797(M, 0xFA00000, this.N(), this.L, this.i.N(map.size())), map).thenAcceptAsync(consumer, this.u);
    }

    private Map<String, String> N() {
        class04551 class045512 = this.y();
        class08735 class087352 = class045512.method_70592(class01603.field_14188);
        CallbackInfoReturnable callbackInfoReturnable = Map.of("X-Minecraft-Username", this.N.L(), "X-Minecraft-UUID", UndashedUuid.toString((UUID)this.N.y()), "X-Minecraft-Version", class045512.comp_4025(), "X-Minecraft-Version-ID", class045512.comp_4024(), "X-Minecraft-Pack-Format", this.N(class087352), "User-Agent", "Minecraft Java/" + class045512.comp_4025());
        CallbackInfoReturnable callbackInfoReturnable2 = callbackInfoReturnable;
        callbackInfoReturnable2 = new CallbackInfoReturnable("", true, callbackInfoReturnable2);
        this.N(callbackInfoReturnable2);
        if (callbackInfoReturnable2.isCancelled()) {
            return (Map)callbackInfoReturnable2.getReturnValue();
        }
        return callbackInfoReturnable;
    }
}

