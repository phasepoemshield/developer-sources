/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.registry.Registries
 *  net.minecraft.registry.Registry
 *  net.minecraft.sound.SoundEvent
 *  net.minecraft.util.Identifier
 */
package oxxxde;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0005\u0010\tR\u0017\u0010\n\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0012\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0014\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0016\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0018\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u001a\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u001c\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\r\u00a8\u0006\u001e"}, d2={"Loxxxde/\u0632\u062f;", "", "<init>", "()V", "", "register", "", "path", "Lnet/minecraft/class_3414;", "(Ljava/lang/String;)Lnet/minecraft/class_3414;", "BELL", "Lnet/minecraft/class_3414;", "getBELL", "()Lnet/minecraft/class_3414;", "BONK", "getBONK", "BUBBLE", "getBUBBLE", "MODULE_DISABLE", "getMODULE_DISABLE", "MODULE_ENABLE", "getMODULE_ENABLE", "POP", "getPOP", "SLIDER", "getSLIDER", "UWU", "getUWU", "VK", "getVK", "rain-visuals"})
public final class \u0632\u062f {
    @NotNull
    private static final SoundEvent SLIDER;
    @NotNull
    private static final SoundEvent BELL;
    @NotNull
    private static final SoundEvent MODULE_DISABLE;
    @NotNull
    private static final SoundEvent POP;
    @NotNull
    public static final \u0632\u062f INSTANCE;
    @NotNull
    private static final SoundEvent MODULE_ENABLE;
    @NotNull
    private static final SoundEvent VK;
    @NotNull
    private static final SoundEvent BUBBLE;
    @NotNull
    private static final SoundEvent BONK;
    @NotNull
    private static final SoundEvent UWU;

    private final SoundEvent register(String path) {
        Identifier identifier = Identifier.of((String)"rain", (String)path);
        Intrinsics.checkNotNullExpressionValue(identifier, "fromNamespaceAndPath(...)");
        Identifier id = identifier;
        Object object = Registry.register((Registry)Registries.SOUND_EVENT, (Identifier)id, (Object)SoundEvent.of((Identifier)id));
        Intrinsics.checkNotNullExpressionValue(object, "register(...)");
        return (SoundEvent)object;
    }

    private \u0632\u062f() {
    }

    static {
        INSTANCE = new \u0632\u062f();
        BELL = INSTANCE.register("bell");
        BONK = INSTANCE.register("bonk");
        BUBBLE = INSTANCE.register("bubble");
        MODULE_DISABLE = INSTANCE.register("module_disable");
        MODULE_ENABLE = INSTANCE.register("module_enable");
        POP = INSTANCE.register("pop");
        SLIDER = INSTANCE.register("slider");
        UWU = INSTANCE.register("uwu");
        VK = INSTANCE.register("vk");
    }

    public final void register() {
    }

    @NotNull
    public final SoundEvent getBONK() {
        return BONK;
    }

    @NotNull
    public final SoundEvent getBELL() {
        return BELL;
    }

    @NotNull
    public final SoundEvent getSLIDER() {
        return SLIDER;
    }

    @NotNull
    public final SoundEvent getBUBBLE() {
        return BUBBLE;
    }

    @NotNull
    public final SoundEvent getVK() {
        return VK;
    }

    @NotNull
    public final SoundEvent getMODULE_DISABLE() {
        return MODULE_DISABLE;
    }

    @NotNull
    public final SoundEvent getUWU() {
        return UWU;
    }

    @NotNull
    public final SoundEvent getPOP() {
        return POP;
    }

    @NotNull
    public final SoundEvent getMODULE_ENABLE() {
        return MODULE_ENABLE;
    }
}

