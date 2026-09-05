/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.RecordBuilder$AbstractUniversalBuilder
 *  minecraft.class06244
 */
package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.RecordBuilder;
import minecraft.class06244;

final class class02643
extends RecordBuilder.AbstractUniversalBuilder<class06244, class06244> {
    public class02643(DynamicOps<class06244> dynamicOps) {
        super(dynamicOps);
    }

    protected DataResult<class06244> build(class06244 class062442, class06244 class062443) {
        return DataResult.success((Object)class062443);
    }

    protected class06244 append(class06244 class062442, class06244 class062443, class06244 class062444) {
        return class062444;
    }

    protected class06244 initBuilder() {
        return class06244.field_17274;
    }
}

