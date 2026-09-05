/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.configbuilder.CommentedPropertyConfig
 *  de.maxhenkel.configbuilder.entry.AbstractConfigEntry
 *  de.maxhenkel.configbuilder.entry.serializer.ValueSerializer
 */
package de.maxhenkel.configbuilder.entry;

import de.maxhenkel.configbuilder.CommentedPropertyConfig;
import de.maxhenkel.configbuilder.entry.AbstractConfigEntry;
import de.maxhenkel.configbuilder.entry.serializer.ValueSerializer;

public class BooleanConfigEntry
extends AbstractConfigEntry<Boolean> {
    public BooleanConfigEntry(CommentedPropertyConfig config, ValueSerializer<Boolean> serializer, String[] comments, String key, Boolean def) {
        super(config, serializer, comments, key, (Object)def);
        this.reload();
    }
}

