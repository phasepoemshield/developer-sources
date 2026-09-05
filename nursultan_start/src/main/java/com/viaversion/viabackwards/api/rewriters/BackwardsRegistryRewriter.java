/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.RegistryEntry
 *  com.viaversion.viaversion.rewriter.RegistryDataRewriter
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viabackwards.api.rewriters;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.RegistryEntry;
import com.viaversion.viaversion.rewriter.RegistryDataRewriter;
import com.viaversion.viaversion.util.Key;

public class BackwardsRegistryRewriter
extends RegistryDataRewriter {
    private final BackwardsProtocol<?, ?, ?, ?> protocol;

    public BackwardsRegistryRewriter(BackwardsProtocol<?, ?, ?, ?> protocol) {
        super(protocol);
        this.protocol = protocol;
    }

    public RegistryEntry[] handle(UserConnection connection, String key, RegistryEntry[] entries) {
        if (Key.stripMinecraftNamespace((String)key).equals("worldgen/biome")) {
            for (RegistryEntry entry : entries) {
                CompoundTag biome = (CompoundTag)entry.tag();
                if (biome == null) continue;
                CompoundTag effects = biome.getCompoundTag("effects");
                this.updateBiomeEffects(effects);
            }
        }
        return super.handle(connection, key, entries);
    }

    public void updateJukeboxSongs(RegistryEntry[] entries) {
        for (RegistryEntry entry : entries) {
            if (entry.tag() == null) continue;
            this.updateSound((CompoundTag)entry.tag(), "sound_event");
        }
    }

    private void updateSound(CompoundTag tag, String name) {
        if (tag == null) {
            return;
        }
        String sound = tag.getString(name);
        if (sound == null) {
            return;
        }
        String mappedSound = this.protocol.getMappingData().getMappedNamedSound(sound);
        if (mappedSound == null) {
            return;
        }
        if (mappedSound.isEmpty()) {
            tag.putString(name, "minecraft:intentionally_empty");
        } else {
            tag.putString(name, mappedSound);
        }
    }

    private void updateBiomeEffects(CompoundTag effects) {
        this.updateSound(effects.getCompoundTag("mood_sound"), "sound");
        this.updateSound(effects.getCompoundTag("additions_sound"), "sound");
        this.updateSound(effects.getCompoundTag("music"), "sound");
        this.updateSound(effects, "ambient_sound");
    }
}

