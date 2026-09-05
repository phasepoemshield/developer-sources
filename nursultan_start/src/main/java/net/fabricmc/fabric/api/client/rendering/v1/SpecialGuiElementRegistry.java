/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.rendering.SpecialGuiElementRegistryImpl
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import java.util.Objects;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.SpecialGuiElementRegistry$Factory;
import net.fabricmc.fabric.impl.client.rendering.SpecialGuiElementRegistryImpl;

@Environment(value=EnvType.CLIENT)
public final class SpecialGuiElementRegistry {
    public static void register(SpecialGuiElementRegistry$Factory specialGuiElementRegistry$Factory) {
        Objects.requireNonNull(specialGuiElementRegistry$Factory, "factory");
        SpecialGuiElementRegistryImpl.register((SpecialGuiElementRegistry$Factory)specialGuiElementRegistry$Factory);
    }
}

