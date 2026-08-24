/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.client.world.ClientWorld
 */
package oxxxde;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.world.ClientWorld;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=2, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0011\u0010\u0003\u001a\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002\"\u0011\u0010\u0007\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0011\u0010\u000b\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0011\u0010\u000f\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0010"}, d2={"Lnet/minecraft/class_310;", "getMc", "()Lnet/minecraft/class_310;", "mc", "Lnet/minecraft/class_746;", "getPlayer", "()Lnet/minecraft/class_746;", "player", "Lnet/minecraft/class_638;", "getWorld", "()Lnet/minecraft/class_638;", "world", "Lnet/minecraft/class_636;", "getInteractionManager", "()Lnet/minecraft/class_636;", "interactionManager", "rain-visuals"})
public final class \u0636\u0643 {
    @NotNull
    public static final ClientWorld getWorld() {
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        Intrinsics.checkNotNull(clientWorld);
        return clientWorld;
    }

    @NotNull
    public static final ClientPlayerInteractionManager getInteractionManager() {
        ClientPlayerInteractionManager clientPlayerInteractionManager = \u0636\u0643.getMc().interactionManager;
        Intrinsics.checkNotNull(clientPlayerInteractionManager);
        return clientPlayerInteractionManager;
    }

    @NotNull
    public static final ClientPlayerEntity getPlayer() {
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        Intrinsics.checkNotNull(clientPlayerEntity);
        return clientPlayerEntity;
    }

    @NotNull
    public static final MinecraftClient getMc() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        Intrinsics.checkNotNullExpressionValue(minecraftClient, "getInstance(...)");
        return minecraftClient;
    }
}

