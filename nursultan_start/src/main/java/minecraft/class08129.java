/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableBiMap
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00891
 *  minecraft.class00948
 *  minecraft.class06581
 */
package minecraft;

import com.google.common.collect.ImmutableBiMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import java.util.function.Function;
import minecraft.class00891;
import minecraft.class00948;
import minecraft.class06581;

public final class class08129
extends Record {
    private final class06581 unaffected;
    private final class06581 exposed;
    private final class06581 weathered;
    private final class06581 oxidized;
    private final class06581 waxed;
    private final class06581 waxedExposed;
    private final class06581 waxedWeathered;
    private final class06581 waxedOxidized;

    public class06581 L() {
        return this.exposed;
    }

    public class06581 M() {
        return this.waxedExposed;
    }

    public class08129(class06581 class065812, class06581 class065813, class06581 class065814, class06581 class065815, class06581 class065816, class06581 class065817, class06581 class065818, class06581 class065819) {
        this.unaffected = class065812;
        this.exposed = class065813;
        this.weathered = class065814;
        this.oxidized = class065815;
        this.waxed = class065816;
        this.waxedExposed = class065817;
        this.waxedWeathered = class065818;
        this.waxedOxidized = class065819;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08129.class, "unaffected;exposed;weathered;oxidized;waxed;waxedExposed;waxedWeathered;waxedOxidized", "unaffected", "exposed", "weathered", "oxidized", "waxed", "waxedExposed", "waxedWeathered", "waxedOxidized"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08129.class, "unaffected;exposed;weathered;oxidized;waxed;waxedExposed;waxedWeathered;waxedOxidized", "unaffected", "exposed", "weathered", "oxidized", "waxed", "waxedExposed", "waxedWeathered", "waxedOxidized"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08129.class, "unaffected;exposed;weathered;oxidized;waxed;waxedExposed;waxedWeathered;waxedOxidized", "unaffected", "exposed", "weathered", "oxidized", "waxed", "waxedExposed", "waxedWeathered", "waxedOxidized"}, this);
    }

    public class06581 B() {
        return this.waxedWeathered;
    }

    public class06581 Z() {
        return this.waxedOxidized;
    }

    public class06581 i() {
        return this.oxidized;
    }

    public class06581 u() {
        return this.weathered;
    }

    public class06581 y() {
        return this.unaffected;
    }

    public static class08129 N(class00948 class009482, Function<class00891, class06581> function) {
        return new class08129(function.apply(class009482.u()), function.apply(class009482.i()), function.apply(class009482.R()), function.apply(class009482.M()), function.apply(class009482.B()), function.apply(class009482.Z()), function.apply(class009482.z()), function.apply(class009482.U()));
    }

    public ImmutableBiMap<class06581, class06581> N() {
        return ImmutableBiMap.of((Object)this.unaffected, (Object)this.waxed, (Object)this.exposed, (Object)this.waxedExposed, (Object)this.weathered, (Object)this.waxedWeathered, (Object)this.oxidized, (Object)this.waxedOxidized);
    }

    public void N(Consumer<class06581> consumer) {
        consumer.accept(this.unaffected);
        consumer.accept(this.exposed);
        consumer.accept(this.weathered);
        consumer.accept(this.oxidized);
        consumer.accept(this.waxed);
        consumer.accept(this.waxedExposed);
        consumer.accept(this.waxedWeathered);
        consumer.accept(this.waxedOxidized);
    }

    public class06581 R() {
        return this.waxed;
    }
}

