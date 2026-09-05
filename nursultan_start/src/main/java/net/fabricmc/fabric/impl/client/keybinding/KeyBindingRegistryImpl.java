/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.ReferenceArrayList
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06428
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.keybinding;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.util.ArrayList;
import java.util.List;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06428;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class KeyBindingRegistryImpl {
    private static final List<class06428> MODDED_KEY_BINDINGS = new ReferenceArrayList();

    public static class06428 registerKeyBinding(class06428 class064282) {
        if ((class05630)class06202.Nq().i_7 != null) {
            throw new IllegalStateException("GameOptions has already been initialised");
        }
        for (class06428 class064283 : MODDED_KEY_BINDINGS) {
            if (class064283 == class064282) {
                throw new IllegalArgumentException("Attempted to register a key binding twice: " + class064282.U());
            }
            if (!class064283.U().equals(class064282.U())) continue;
            throw new IllegalArgumentException("Attempted to register two key bindings with equal ID: " + class064282.U() + "!");
        }
        MODDED_KEY_BINDINGS.add(class064282);
        return class064282;
    }

    private KeyBindingRegistryImpl() {
    }

    public static class06428[] process(class06428[] class06428Array) {
        ArrayList arrayList = Lists.newArrayList((Object[])class06428Array);
        arrayList.removeAll(MODDED_KEY_BINDINGS);
        arrayList.addAll(MODDED_KEY_BINDINGS);
        return arrayList.toArray(new class06428[0]);
    }
}

