/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  net.caffeinemc.mods.sodium.api.config.ConfigEntryPoint
 */
package net.caffeinemc.mods.sodium.client.config;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Supplier;
import net.caffeinemc.mods.sodium.api.config.ConfigEntryPoint;

final class ConfigManager$ConfigUser
extends Record {
    final Supplier<ConfigEntryPoint> configEntrypoint;
    final String modId;

    ConfigManager$ConfigUser(Supplier<ConfigEntryPoint> supplier, String string) {
        this.configEntrypoint = supplier;
        this.modId = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ConfigManager$ConfigUser.class, "configEntrypoint;modId", "configEntrypoint", "modId"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ConfigManager$ConfigUser.class, "configEntrypoint;modId", "configEntrypoint", "modId"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ConfigManager$ConfigUser.class, "configEntrypoint;modId", "configEntrypoint", "modId"}, this);
    }

    public String modId() {
        return this.modId;
    }

    public Supplier<ConfigEntryPoint> configEntrypoint() {
        return this.configEntrypoint;
    }
}

