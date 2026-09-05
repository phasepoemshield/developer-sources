/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DataResult$Error
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.RecordBuilder
 *  dev.isxander.yacl3.impl.utils.YACLConstants
 */
package dev.isxander.yacl3.config.v3;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.RecordBuilder;
import dev.isxander.yacl3.config.v3.AbstractConfigEntry;
import dev.isxander.yacl3.impl.utils.YACLConstants;
import java.util.Optional;

public class CodecConfigEntryImpl<T>
extends AbstractConfigEntry<T> {
    private final MapCodec<T> mapCodec;

    public CodecConfigEntryImpl(String string, T t, Codec<T> codec) {
        super(string, t);
        this.mapCodec = codec.fieldOf(this.fieldName());
    }

    @Override
    public <R> boolean decode(R r, DynamicOps<R> dynamicOps) {
        DataResult dataResult = this.mapCodec.decoder().parse(dynamicOps, r);
        Optional optional = dataResult.error();
        if (optional.isPresent()) {
            YACLConstants.LOGGER.error("Failed to decode entry {}: {}", (Object)this.fieldName(), (Object)((DataResult.Error)optional.get()).message());
            return false;
        }
        Object t = dataResult.result().orElseThrow();
        this.set(t);
        return true;
    }

    @Override
    public <R> RecordBuilder<R> encode(DynamicOps<R> dynamicOps, RecordBuilder<R> recordBuilder) {
        return this.mapCodec.encode(this.get(), dynamicOps, recordBuilder);
    }
}

