/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.model.loading.v1;

import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class ExtraModelKey<T> {
    private final Supplier<String> name;

    public static <T> ExtraModelKey<T> create(Supplier<String> supplier) {
        return new ExtraModelKey<T>(supplier);
    }

    public static <T> ExtraModelKey<T> create() {
        return new ExtraModelKey<T>(() -> "unnamed");
    }

    private ExtraModelKey(Supplier<String> supplier) {
        this.name = supplier;
    }

    public String toString() {
        return "ExtraModelKey(" + this.name.get() + ")";
    }
}

