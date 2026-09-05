/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer
 */
package de.maxhenkel.voicechat.configbuilder.entry;

import de.maxhenkel.voicechat.configbuilder.CommentedPropertyConfig;
import de.maxhenkel.voicechat.configbuilder.entry.AbstractConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer;

public class EnumConfigEntry<E extends Enum<E>>
extends AbstractConfigEntry<E> {
    public EnumConfigEntry(CommentedPropertyConfig commentedPropertyConfig, ValueSerializer<E> valueSerializer, String[] stringArray, String string, E e) {
        super(commentedPropertyConfig, valueSerializer, stringArray, string, e);
        this.reload();
    }
}

