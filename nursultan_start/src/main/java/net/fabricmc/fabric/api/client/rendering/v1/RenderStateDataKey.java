/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class RenderStateDataKey<T> {
    private final Supplier<String> name;

    public static <T> RenderStateDataKey<T> create() {
        return new RenderStateDataKey<T>(() -> "unnamed");
    }

    public static <T> RenderStateDataKey<T> create(Supplier<String> supplier) {
        return new RenderStateDataKey<T>(supplier);
    }

    private RenderStateDataKey(Supplier<String> supplier) {
        this.name = supplier;
    }

    public String toString() {
        return "RenderStateDataKey(" + this.name.get() + ")";
    }
}

