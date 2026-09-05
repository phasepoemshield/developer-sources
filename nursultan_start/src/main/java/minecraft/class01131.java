/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  minecraft.class04197
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.Map;
import java.util.UUID;
import minecraft.class01128;
import minecraft.class01135;
import minecraft.class04197;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01131<T extends class01135> {
    private static final Logger N = LogUtils.getLogger();
    private final Int2ObjectMap<T> y = new Int2ObjectLinkedOpenHashMap();
    private final Map<UUID, T> L = Maps.newHashMap();

    public void y(T t) {
        this.L.remove(t.method_5667());
        this.y.remove(t.method_5628());
    }

    public int y() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        return this.L.size();
    }

    public @Nullable T N(UUID uUID) {
        return (T)((class01135)this.L.get(uUID));
    }

    private boolean N(Map map, Object object) {
        return map.containsKey(object) && ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_16_4);
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_16_4)) {
            callbackInfoReturnable.setReturnValue((Object)this.y.size());
        }
    }

    public <U extends T> void N(class01128<T, U> class011282, class04197<U> class041972) {
        for (class01135 class011352 : this.y.values()) {
            class01135 class011353 = (class01135)class011282.N(class011352);
            if (class011353 == null || !class041972.accept((Object)class011353).N()) continue;
            return;
        }
    }

    public Iterable<T> N() {
        return Iterables.unmodifiableIterable((Iterable)this.y.values());
    }

    public void N(T t) {
        Map<UUID, T> map = this.L;
        UUID uUID = t.method_5667();
        UUID uUID2 = uUID;
        if (this.N(map, uUID2)) {
            N.warn("Duplicate entity UUID {}: {}", (Object)uUID, t);
            return;
        }
        this.L.put(uUID, t);
        this.y.put(t.method_5628(), t);
    }

    public @Nullable T N(int n) {
        return (T)((class01135)this.y.get(n));
    }
}

