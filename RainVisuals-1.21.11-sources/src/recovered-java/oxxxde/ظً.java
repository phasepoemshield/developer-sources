/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.hit.EntityHitResult
 *  net.minecraft.util.hit.HitResult
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0636\u0643;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\n\u0010\bJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0014\u00a8\u0006\u0018"}, d2={"Loxxxde/\u0638\u064b;", "", "<init>", "()V", "", "update", "Lnet/minecraft/class_1657;", "currentTarget", "()Lnet/minecraft/class_1657;", "liveTarget", "hoveredTarget", "player", "track", "(Lnet/minecraft/class_1657;)V", "hoveredPlayer", "", "isUsableTarget", "(Lnet/minecraft/class_1657;)Z", "", "HOLD_MILLIS", "J", "LIVE_TARGET_MILLIS", "Lnet/minecraft/class_1657;", "lastSeenAt", "rain-visuals"})
@RecompileFormat
public final class \u0638\u064b {
    @Nullable
    private static PlayerEntity currentTarget;
    private static final long LIVE_TARGET_MILLIS = 100L;
    @NotNull
    public static final \u0638\u064b INSTANCE;
    private static long lastSeenAt;
    private static final long HOLD_MILLIS = 3000L;

    static {
        INSTANCE = new \u0638\u064b();
    }

    public final void update() {
        PlayerEntity hovered = this.hoveredPlayer();
        long now = System.currentTimeMillis();
        if (hovered != null) {
            currentTarget = hovered;
            lastSeenAt = now;
        } else {
            boolean bl;
            PlayerEntity playerEntity = currentTarget;
            if (playerEntity != null) {
                PlayerEntity p0 = playerEntity;
                boolean bl2 = false;
                bl = this.isUsableTarget(p0);
            } else {
                bl = false;
            }
            if (!bl && now - lastSeenAt > 3000L) {
                currentTarget = null;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public final PlayerEntity liveTarget() {
        void var1_1;
        PlayerEntity playerEntity = currentTarget;
        if (playerEntity == null) {
            return null;
        }
        PlayerEntity target = playerEntity;
        if (!this.isUsableTarget(target)) {
            return null;
        }
        if (System.currentTimeMillis() - lastSeenAt > 100L) {
            return null;
        }
        return var1_1;
    }

    private final PlayerEntity hoveredPlayer() {
        HitResult hitResult = \u0636\u0643.getMc().crosshairTarget;
        EntityHitResult entityHitResult = hitResult instanceof EntityHitResult ? (EntityHitResult)hitResult : null;
        if (entityHitResult == null) {
            return null;
        }
        EntityHitResult hitResult2 = entityHitResult;
        Entity entity = hitResult2.getEntity();
        PlayerEntity playerEntity = entity instanceof PlayerEntity ? (PlayerEntity)entity : null;
        if (playerEntity == null) {
            return null;
        }
        PlayerEntity player = playerEntity;
        if (Intrinsics.areEqual(player, \u0636\u0643.getMc().player)) {
            return null;
        }
        hitResult = player;
        HitResult p0 = hitResult;
        boolean bl = false;
        return this.isUsableTarget((PlayerEntity)entity) ? hitResult : null;
    }

    @Nullable
    public final PlayerEntity hoveredTarget() {
        return this.hoveredPlayer();
    }

    private final boolean isUsableTarget(PlayerEntity player) {
        return !player.isRemoved() && player.isAlive();
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public final PlayerEntity currentTarget() {
        void var1_1;
        PlayerEntity playerEntity = currentTarget;
        if (playerEntity == null) {
            return null;
        }
        PlayerEntity target = playerEntity;
        if (!this.isUsableTarget(target)) {
            return null;
        }
        if (System.currentTimeMillis() - lastSeenAt > 3000L) {
            return null;
        }
        return var1_1;
    }

    private \u0638\u064b() {
    }

    public final void track(@NotNull PlayerEntity player) {
        Intrinsics.checkNotNullParameter(player, "player");
        if (!this.isUsableTarget(player)) {
            return;
        }
        currentTarget = player;
        lastSeenAt = System.currentTimeMillis();
    }
}

