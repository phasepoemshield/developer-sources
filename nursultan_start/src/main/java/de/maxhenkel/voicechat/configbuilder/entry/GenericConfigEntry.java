/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.configbuilder.CommentedPropertyConfig
 *  de.maxhenkel.voicechat.configbuilder.entry.AbstractConfigEntry
 */
package de.maxhenkel.voicechat.configbuilder.entry;

import de.maxhenkel.voicechat.configbuilder.CommentedPropertyConfig;
import de.maxhenkel.voicechat.configbuilder.entry.AbstractConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer;

public class GenericConfigEntry<T>
extends AbstractConfigEntry<T> {
    public GenericConfigEntry(CommentedPropertyConfig commentedPropertyConfig, ValueSerializer<T> valueSerializer, String[] stringArray, String string, T t) {
        super(commentedPropertyConfig, valueSerializer, stringArray, string, t);
        this.reload();
    }
}

