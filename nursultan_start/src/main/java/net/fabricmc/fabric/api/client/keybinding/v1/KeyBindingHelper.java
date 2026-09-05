/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04671
 *  minecraft.class06428
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.keybinding.KeyBindingRegistryImpl
 *  net.fabricmc.fabric.mixin.client.keybinding.KeyMappingAccessor
 */
package net.fabricmc.fabric.api.client.keybinding.v1;

import java.util.Objects;
import minecraft.class04671;
import minecraft.class06428;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.keybinding.KeyBindingRegistryImpl;
import net.fabricmc.fabric.mixin.client.keybinding.KeyMappingAccessor;

@Environment(value=EnvType.CLIENT)
public final class KeyBindingHelper {
    public static class06428 registerKeyBinding(class06428 class064282) {
        Objects.requireNonNull(class064282, "key binding cannot be null");
        return KeyBindingRegistryImpl.registerKeyBinding((class06428)class064282);
    }

    private KeyBindingHelper() {
    }

    public static class04671 getBoundKeyOf(class06428 class064282) {
        return ((KeyMappingAccessor)class064282).fabric_getBoundKey();
    }
}

