/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02471
 *  minecraft.class02487
 *  minecraft.class02500
 *  minecraft.class02666
 *  minecraft.class04247
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;
import minecraft.class02362;
import minecraft.class02471;
import minecraft.class02487;
import minecraft.class02500;
import minecraft.class02666;
import minecraft.class04247;

public final class class00142
extends Record
implements Predicate<class02666> {
    private final class02471 exact;
    private final Map<class02487<?>, class02500> partial;
    public static final class00142 N = new class00142(class02471.L, Map.of());
    public static final MapCodec<class00142> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02471.N.optionalFieldOf("components", (Object)class02471.L).forGetter(class00142::y), (App)class02500.y.optionalFieldOf("predicates", Map.of()).forGetter(class00142::L)).apply(instance, class00142::new));
    public static final class02362<class04247, class00142> L = class02362.N((class02362)class02471.y, class00142::y, (class02362)class02500.u, class00142::L, class00142::new);

    public Map<class02487<?>, class02500> L() {
        return this.partial;
    }

    public class00142(class02471 class024712, Map<class02487<?>, class02500> map) {
        this.exact = class024712;
        this.partial = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00142.class, "exact;partial", "exact", "partial"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00142.class, "exact;partial", "exact", "partial"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00142.class, "exact;partial", "exact", "partial"}, this);
    }

    public class02471 y() {
        return this.exact;
    }

    @Override
    public boolean test(class02666 class026662) {
        if (!this.exact.test(class026662)) {
            return false;
        }
        Iterator<class02500> iterator = this.partial.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().N(class026662)) continue;
            return false;
        }
        return true;
    }

    public boolean N() {
        return this.exact.y() && this.partial.isEmpty();
    }
}

