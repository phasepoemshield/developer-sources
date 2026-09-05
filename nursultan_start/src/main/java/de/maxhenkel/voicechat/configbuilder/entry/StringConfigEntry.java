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

public class StringConfigEntry
extends AbstractConfigEntry<String> {
    public StringConfigEntry(CommentedPropertyConfig commentedPropertyConfig, ValueSerializer<String> valueSerializer, String[] stringArray, String string, String string2) {
        super(commentedPropertyConfig, valueSerializer, stringArray, string, (Object)string2);
        this.reload();
    }
}

