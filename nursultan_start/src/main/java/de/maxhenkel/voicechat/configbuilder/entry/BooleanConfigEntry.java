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

public class BooleanConfigEntry
extends AbstractConfigEntry<Boolean> {
    public BooleanConfigEntry(CommentedPropertyConfig commentedPropertyConfig, ValueSerializer<Boolean> valueSerializer, String[] stringArray, String string, Boolean bl) {
        super(commentedPropertyConfig, valueSerializer, stringArray, string, bl);
        this.reload();
    }
}

