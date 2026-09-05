/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.HashCode
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.RecordBuilder$AbstractUniversalBuilder
 */
package minecraft;

import com.google.common.hash.HashCode;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.RecordBuilder;
import java.util.ArrayList;
import java.util.List;
import minecraft.class00166;

final class class00172
extends RecordBuilder.AbstractUniversalBuilder<HashCode, List<Pair<HashCode, HashCode>>> {
    static final /* synthetic */ boolean N;
    final /* synthetic */ class00166 y;

    public class00172(class00166 class001662) {
        this.y = class001662;
        super((DynamicOps)class001662);
    }

    static {
        N = !class00166.class.desiredAssertionStatus();
    }

    protected List<Pair<HashCode, HashCode>> append(HashCode hashCode, HashCode hashCode2, List<Pair<HashCode, HashCode>> list) {
        list.add((Pair<HashCode, HashCode>)Pair.of((Object)hashCode, (Object)hashCode2));
        return list;
    }

    protected DataResult<HashCode> build(List<Pair<HashCode, HashCode>> list, HashCode hashCode) {
        if (!N && !this.y.u(hashCode)) {
            throw new AssertionError();
        }
        return DataResult.success((Object)class00166.N(this.y.u.newHasher(), list.stream()).hash());
    }

    protected List<Pair<HashCode, HashCode>> initBuilder() {
        return new ArrayList<Pair<HashCode, HashCode>>();
    }
}

