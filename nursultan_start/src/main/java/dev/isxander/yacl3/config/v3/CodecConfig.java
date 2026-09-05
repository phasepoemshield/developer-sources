/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.RecordBuilder
 */
package dev.isxander.yacl3.config.v3;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.RecordBuilder;
import dev.isxander.yacl3.config.v3.ChildConfigEntryImpl;
import dev.isxander.yacl3.config.v3.CodecConfigEntryImpl;
import dev.isxander.yacl3.config.v3.ConfigEntry;
import dev.isxander.yacl3.config.v3.EntryAddable;
import dev.isxander.yacl3.config.v3.ReadonlyConfigEntry;
import java.util.ArrayList;
import java.util.List;

public abstract class CodecConfig<S extends CodecConfig<S>>
implements Codec<S>,
EntryAddable {
    private final List<ReadonlyConfigEntry<?>> entries = new ArrayList();

    public CodecConfig() {
        CodecConfig codecConfig = this;
    }

    public final <R> boolean decode(R r, DynamicOps<R> dynamicOps) {
        boolean bl = true;
        for (ReadonlyConfigEntry<?> readonlyConfigEntry : this.entries) {
            bl &= readonlyConfigEntry.decode(r, dynamicOps);
        }
        this.onFinishedDecode(bl);
        return bl;
    }

    public <R> DataResult<Pair<S, R>> decode(DynamicOps<R> dynamicOps, R r) {
        this.decode(r, dynamicOps);
        return DataResult.success((Object)Pair.of((Object)this, r));
    }

    public <R> DataResult<R> encode(S s, DynamicOps<R> dynamicOps, R r) {
        if (s != null && s != this) {
            throw new IllegalArgumentException("`input` is ignored. It must be null or equal to `this`.");
        }
        return this.encode(dynamicOps, r);
    }

    public final <R> DataResult<R> encode(DynamicOps<R> dynamicOps, R r) {
        RecordBuilder<R> recordBuilder = dynamicOps.mapBuilder();
        for (ReadonlyConfigEntry<?> readonlyConfigEntry : this.entries) {
            recordBuilder = readonlyConfigEntry.encode(dynamicOps, recordBuilder);
        }
        return recordBuilder.build(r);
    }

    @Override
    public <T extends CodecConfig<T>> ReadonlyConfigEntry<T> register(String string, T t) {
        ChildConfigEntryImpl<T> childConfigEntryImpl = new ChildConfigEntryImpl<T>(string, t);
        this.entries.add(childConfigEntryImpl);
        return childConfigEntryImpl;
    }

    @Override
    public <T> ConfigEntry<T> register(String string, T t, Codec<T> codec) {
        CodecConfigEntryImpl<T> codecConfigEntryImpl = new CodecConfigEntryImpl<T>(string, t, codec);
        this.entries.add(codecConfigEntryImpl);
        return codecConfigEntryImpl;
    }

    public final <R> DataResult<R> encodeStart(DynamicOps<R> dynamicOps) {
        return this.encode(dynamicOps, dynamicOps.empty());
    }

    protected void onFinishedDecode(boolean bl) {
    }
}

