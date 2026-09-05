/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08299
 *  net.fabricmc.fabric.impl.serialization.SpecialCodecs
 */
package net.fabricmc.fabric.api.serialization.v1.view;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import minecraft.class08299;
import net.fabricmc.fabric.impl.serialization.SpecialCodecs;

public interface FabricReadView {
    default public boolean contains(String string) {
        return (Boolean)((class08299)this).N(SpecialCodecs.contains((String)string)).orElseThrow();
    }

    default public Collection<String> keys() {
        return ((class08299)this).N(SpecialCodecs.KEYS_EXTRACT).orElse(List.of());
    }

    default public Optional<long[]> getOptionalLongArray(String string) {
        return ((class08299)this).N(string, SpecialCodecs.LONG_ARRAY);
    }

    default public Optional<byte[]> getOptionalByteArray(String string) {
        return ((class08299)this).N(string, SpecialCodecs.BYTE_ARRAY);
    }
}

