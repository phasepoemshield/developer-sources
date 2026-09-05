/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2DoubleArrayMap
 *  it.unimi.dsi.fastutil.objects.Reference2DoubleMap$Entry
 *  it.unimi.dsi.fastutil.objects.Reference2DoubleMaps
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2DoubleMap;
import it.unimi.dsi.fastutil.objects.Reference2DoubleMaps;
import java.util.Objects;
import minecraft.class00587;
import minecraft.class00607;
import minecraft.class00610;

public class class00602 {
    private final Reference2DoubleArrayMap<class00587> N = new Reference2DoubleArrayMap();

    public <Value> Value N(class00607<Value> class006072, Value Value) {
        if (this.N.isEmpty()) {
            return Value;
        }
        if (this.N.size() == 1) {
            class00587 class005872 = (class00587)this.N.keySet().iterator().next();
            return class005872.N(class006072, Value);
        }
        class00610 class006102 = class006072.N().R();
        Object var4_5 = null;
        double d = 0.0;
        for (Reference2DoubleMap.Entry entry : Reference2DoubleMaps.fastIterable(this.N)) {
            class00587 class005873 = (class00587)entry.getKey();
            double d2 = entry.getDoubleValue();
            Value Value2 = class005873.N(class006072, Value);
            d += d2;
            if (var4_5 == null) {
                var4_5 = Value2;
                continue;
            }
            float f = (float)(d2 / d);
            var4_5 = class006102.apply(f, var4_5, Value2);
        }
        return Objects.requireNonNull(var4_5);
    }

    public class00602 N(double d, class00587 class005872) {
        this.N.mergeDouble((Object)class005872, d, Double::sum);
        return this;
    }

    public void N() {
        this.N.clear();
    }
}

