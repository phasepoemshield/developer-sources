/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02471
 *  minecraft.class02504
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class06338
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07310
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.UnaryOperator;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02471;
import minecraft.class02504;
import minecraft.class02666;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class06338;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07310;

public final class class02680
extends Record {
    private final class03556<class06581> item;
    private final int count;
    private final class02471 components;
    private final class06584 itemStack;
    public static final Codec<class02680> N = RecordCodecBuilder.create(instance -> instance.group((App)class06581.u.fieldOf("id").forGetter(class02680::N), (App)class06338.b.fieldOf("count").orElse((Object)1).forGetter(class02680::y), (App)class02471.N.optionalFieldOf("components", (Object)class02471.L).forGetter(class02680::L)).apply(instance, class02680::new));
    public static final class02362<class04247, class02680> y = class02362.N((class02362)class06581.i, class02680::N, (class02362)class02389.B, class02680::y, (class02362)class02471.y, class02680::L, class02680::new);
    public static final class02362<class04247, Optional<class02680>> L = y.N_33(class02389::N);

    public class02471 L() {
        return this.components;
    }

    public class02680(class03556<class06581> class035562, int n, class02471 class024712, class06584 class065842) {
        this.item = class035562;
        this.count = n;
        this.components = class024712;
        this.itemStack = class065842;
    }

    public class02680(class03556<class06581> class035562, int n, class02471 class024712) {
        this(class035562, n, class024712, class02680.N(class035562, n, class024712));
    }

    public class02680(class07310 class073102, int n) {
        this((class03556<class06581>)class073102.B().i(), n, class02471.L);
    }

    public class02680(class07310 class073102) {
        this(class073102, 1);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02680.class, "item;count;components;itemStack", "item", "count", "components", "itemStack"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02680.class, "item;count;components;itemStack", "item", "count", "components", "itemStack"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02680.class, "item;count;components;itemStack", "item", "count", "components", "itemStack"}, this);
    }

    public class06584 u() {
        return this.itemStack;
    }

    public int y() {
        return this.count;
    }

    public boolean N(class06584 class065842) {
        return class065842.N(this.item) && this.components.test((class02666)class065842);
    }

    private static class06584 N(class03556<class06581> class035562, int n, class02471 class024712) {
        return new class06584(class035562, n, class024712.u());
    }

    public class02680 N(UnaryOperator<class02504> unaryOperator) {
        return new class02680(this.item, this.count, ((class02504)unaryOperator.apply(class02471.N())).N());
    }

    public class03556<class06581> N() {
        return this.item;
    }
}

