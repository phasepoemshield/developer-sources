/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.util.Arm
 */
package kotakbaz.rain.event.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Arm;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0633\u0636;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013\u00a8\u0006\u0015"}, d2={"Loxxxde/\u0631\u0623;", "Loxxxde/\u0633\u0636;", "Lnet/minecraft/class_4587;", "matrices", "Lnet/minecraft/class_1306;", "arm", "", "swingProgress", "equipProgress", "<init>", "(Lnet/minecraft/class_4587;Lnet/minecraft/class_1306;FF)V", "Lnet/minecraft/class_4587;", "getMatrices", "()Lnet/minecraft/class_4587;", "Lnet/minecraft/class_1306;", "getArm", "()Lnet/minecraft/class_1306;", "F", "getSwingProgress", "()F", "getEquipProgress", "rain-visuals"})
public final class HandSwingEvent
extends \u0633\u0636 {
    @NotNull
    private final MatrixStack matrices;
    @NotNull
    private final Arm arm;
    private final float equipProgress;
    private final float swingProgress;

    @NotNull
    public final MatrixStack getMatrices() {
        return this.matrices;
    }

    public final float getEquipProgress() {
        return this.equipProgress;
    }

    @NotNull
    public final Arm getArm() {
        return this.arm;
    }

    public HandSwingEvent(@NotNull MatrixStack matrices, @NotNull Arm arm, float swingProgress, float equipProgress) {
        Intrinsics.checkNotNullParameter(matrices, "matrices");
        Intrinsics.checkNotNullParameter(arm, "arm");
        this.matrices = matrices;
        this.arm = arm;
        this.swingProgress = swingProgress;
        this.equipProgress = equipProgress;
    }

    public final float getSwingProgress() {
        return this.swingProgress;
    }
}

