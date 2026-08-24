/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 */
package kotakbaz.rain.event.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2={"Loxxxde/\u0630\u0645;", "", "Lnet/minecraft/class_1297;", "entity", "<init>", "(Lnet/minecraft/class_1297;)V", "Lnet/minecraft/class_1297;", "getEntity", "()Lnet/minecraft/class_1297;", "rain-visuals"})
public final class AttackEvent {
    @NotNull
    private final Entity entity;

    public AttackEvent(@NotNull Entity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        this.entity = entity;
    }

    @NotNull
    public final Entity getEntity() {
        return this.entity;
    }
}

