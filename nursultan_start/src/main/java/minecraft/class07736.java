/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.RecordBuilder$AbstractStringBuilder
 *  minecraft.class06997
 *  minecraft.class07001
 */
package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.RecordBuilder;
import java.util.Map;
import minecraft.class06997;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class07713;

public class class07736
extends RecordBuilder.AbstractStringBuilder<class07709, class07001> {
    public class07736(class07713 class077132) {
        super((DynamicOps)class077132);
    }

    protected class07001 append(String string, class07709 class077092, class07001 class070012) {
        class070012.N(string, class077092);
        return class070012;
    }

    protected class07001 initBuilder() {
        return new class07001();
    }

    protected DataResult<class07709> build(class07001 class070012, class07709 class077092) {
        if (class077092 == null || class077092 == class06997.y) {
            return DataResult.success((Object)class070012);
        }
        if (class077092 instanceof class07001) {
            class07001 class070013 = ((class07001)class077092).U();
            for (Map.Entry entry : class070012.M()) {
                class070013.N((String)entry.getKey(), (class07709)entry.getValue());
            }
            return DataResult.success((Object)class070013);
        }
        return DataResult.error(() -> "mergeToMap called with not a map: " + String.valueOf(class077092), (Object)class077092);
    }
}

