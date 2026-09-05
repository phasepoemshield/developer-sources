/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.reflect.stream.RStream
 */
package com.viaversion.viafabricplus.features.movement.elytra;

import java.util.Set;
import net.lenni0451.reflect.stream.RStream;

public final class FabricAPIWorkaround {
    public static void init() {
        Set set = (Set)RStream.of((String)"org.spongepowered.asm.mixin.transformer.MixinConfig").fields().by("globalMixinList").get();
        set.add("net.fabricmc.fabric.mixin.client.entity.event.elytra.ClientPlayerEntityMixin");
        set.add("net.fabricmc.fabric.mixin.entity.event.elytra.LivingEntityMixin");
        set.add("net.fabricmc.fabric.mixin.entity.event.elytra.PlayerEntityMixin");
    }
}

