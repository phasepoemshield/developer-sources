/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.configbuilder.entry;

import de.maxhenkel.voicechat.configbuilder.CommentedPropertyConfig;
import de.maxhenkel.voicechat.configbuilder.Config;
import de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer;
import java.util.Objects;
import javax.annotation.Nullable;

public abstract class AbstractConfigEntry<T>
implements ConfigEntry<T> {
    protected final CommentedPropertyConfig config;
    protected final ValueSerializer<T> serializer;
    protected String[] comments;
    protected String key;
    protected T def;
    @Nullable
    protected T value;

    public void reload() {
        if (this.config.getProperties().containsKey(this.key)) {
            Object object = this.serializer.deserialize(this.config.getProperties().get(this.key));
            if (object == null) {
                this.reset();
            } else {
                this.value = this.fixValue(object);
                this.syncEntryToProperties();
            }
        } else {
            this.reset();
        }
    }

    public AbstractConfigEntry(CommentedPropertyConfig commentedPropertyConfig, ValueSerializer<T> valueSerializer, String[] stringArray, String string, T t) {
        Objects.requireNonNull(commentedPropertyConfig);
        Objects.requireNonNull(valueSerializer);
        Objects.requireNonNull(stringArray);
        Objects.requireNonNull(string);
        Objects.requireNonNull(t);
        this.config = commentedPropertyConfig;
        this.serializer = valueSerializer;
        this.comments = stringArray;
        this.key = string;
        this.def = t;
    }

    @Override
    public ConfigEntry<T> reset() {
        this.value = this.def;
        this.syncEntryToProperties();
        return this;
    }

    @Override
    public T get() {
        return this.value;
    }

    @Override
    public T getDefault() {
        return this.def;
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public AbstractConfigEntry<T> set(T t) {
        if (this.value != null && this.value.equals(t)) {
            return this;
        }
        this.value = this.fixValue(t);
        this.syncEntryToProperties();
        return this;
    }

    @Override
    public ConfigEntry<T> save() {
        this.config.save();
        return this;
    }

    @Override
    public AbstractConfigEntry<T> comment(String ... stringArray) {
        this.comments = stringArray;
        this.syncEntryToProperties();
        return this;
    }

    public ValueSerializer<T> getSerializer() {
        return this.serializer;
    }

    @Override
    public Config getConfig() {
        return this.config;
    }

    private void syncEntryToProperties() {
        String string = this.serializer.serialize(this.value);
        if (string == null) {
            if (this.value == this.def) {
                throw new IllegalStateException("Failed to serialize default value");
            }
            this.reset();
            return;
        }
        this.config.getProperties().set(this.key, string, this.comments);
    }

    @Override
    public String[] getComments() {
        return this.comments;
    }

    T fixValue(T t) {
        return t;
    }

    @Override
    public ConfigEntry<T> saveSync() {
        this.config.saveSync();
        return this;
    }
}

