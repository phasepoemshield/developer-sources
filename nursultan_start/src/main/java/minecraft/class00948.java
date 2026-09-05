/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableBiMap
 *  com.google.common.collect.ImmutableList
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01362
 *  minecraft.class02774
 *  org.apache.commons.lang3.function.TriFunction
 */
package minecraft;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class02774;
import org.apache.commons.lang3.function.TriFunction;

public final class class00948
extends Record {
    private final class00891 unaffected;
    private final class00891 exposed;
    private final class00891 weathered;
    private final class00891 oxidized;
    private final class00891 waxed;
    private final class00891 waxedExposed;
    private final class00891 waxedWeathered;
    private final class00891 waxedOxidized;

    public ImmutableList<class00891> L() {
        return ImmutableList.of((Object)((Object)this.unaffected), (Object)((Object)this.waxed), (Object)((Object)this.exposed), (Object)((Object)this.waxedExposed), (Object)((Object)this.weathered), (Object)((Object)this.waxedWeathered), (Object)((Object)this.oxidized), (Object)((Object)this.waxedOxidized));
    }

    public class00891 M() {
        return this.oxidized;
    }

    public class00948(class00891 class008912, class00891 class008913, class00891 class008914, class00891 class008915, class00891 class008916, class00891 class008917, class00891 class008918, class00891 class008919) {
        this.unaffected = class008912;
        this.exposed = class008913;
        this.weathered = class008914;
        this.oxidized = class008915;
        this.waxed = class008916;
        this.waxedExposed = class008917;
        this.waxedWeathered = class008918;
        this.waxedOxidized = class008919;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00948.class, "unaffected;exposed;weathered;oxidized;waxed;waxedExposed;waxedWeathered;waxedOxidized", "unaffected", "exposed", "weathered", "oxidized", "waxed", "waxedExposed", "waxedWeathered", "waxedOxidized"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00948.class, "unaffected;exposed;weathered;oxidized;waxed;waxedExposed;waxedWeathered;waxedOxidized", "unaffected", "exposed", "weathered", "oxidized", "waxed", "waxedExposed", "waxedWeathered", "waxedOxidized"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00948.class, "unaffected;exposed;weathered;oxidized;waxed;waxedExposed;waxedWeathered;waxedOxidized", "unaffected", "exposed", "weathered", "oxidized", "waxed", "waxedExposed", "waxedWeathered", "waxedOxidized"}, this);
    }

    public class00891 B() {
        return this.waxed;
    }

    public class00891 Z() {
        return this.waxedExposed;
    }

    public class00891 i() {
        return this.exposed;
    }

    public class00891 U() {
        return this.waxedOxidized;
    }

    public class00891 z() {
        return this.waxedWeathered;
    }

    public class00891 u() {
        return this.unaffected;
    }

    public ImmutableBiMap<class00891, class00891> y() {
        return ImmutableBiMap.of((Object)((Object)this.unaffected), (Object)((Object)this.waxed), (Object)((Object)this.exposed), (Object)((Object)this.waxedExposed), (Object)((Object)this.weathered), (Object)((Object)this.waxedWeathered), (Object)((Object)this.oxidized), (Object)((Object)this.waxedOxidized));
    }

    public static <WaxedBlock extends class00891, WeatheringBlock extends class00891> class00948 N(String string, TriFunction<String, Function<class01362, class00891>, class01362, class00891> triFunction, Function<class01362, WaxedBlock> function, BiFunction<class02774, class01362, WeatheringBlock> biFunction, Function<class02774, class01362> function2) {
        return new class00948((class00891)((Object)triFunction.apply((Object)string, class013622 -> (class00891)((Object)((Object)biFunction.apply(class02774.field_28704, (class01362)class013622))), (Object)function2.apply(class02774.field_28704))), (class00891)((Object)triFunction.apply((Object)("exposed_" + string), class013622 -> (class00891)((Object)((Object)biFunction.apply(class02774.field_28705, (class01362)class013622))), (Object)function2.apply(class02774.field_28705))), (class00891)((Object)triFunction.apply((Object)("weathered_" + string), class013622 -> (class00891)((Object)((Object)biFunction.apply(class02774.field_28706, (class01362)class013622))), (Object)function2.apply(class02774.field_28706))), (class00891)((Object)triFunction.apply((Object)("oxidized_" + string), class013622 -> (class00891)((Object)((Object)biFunction.apply(class02774.field_28707, (class01362)class013622))), (Object)function2.apply(class02774.field_28707))), (class00891)((Object)triFunction.apply((Object)("waxed_" + string), function::apply, (Object)function2.apply(class02774.field_28704))), (class00891)((Object)triFunction.apply((Object)("waxed_exposed_" + string), function::apply, (Object)function2.apply(class02774.field_28705))), (class00891)((Object)triFunction.apply((Object)("waxed_weathered_" + string), function::apply, (Object)function2.apply(class02774.field_28706))), (class00891)((Object)triFunction.apply((Object)("waxed_oxidized_" + string), function::apply, (Object)function2.apply(class02774.field_28707))));
    }

    public void N(Consumer<class00891> consumer) {
        consumer.accept(this.unaffected);
        consumer.accept(this.exposed);
        consumer.accept(this.weathered);
        consumer.accept(this.oxidized);
        consumer.accept(this.waxed);
        consumer.accept(this.waxedExposed);
        consumer.accept(this.waxedWeathered);
        consumer.accept(this.waxedOxidized);
    }

    public ImmutableBiMap<class00891, class00891> N() {
        return ImmutableBiMap.of((Object)((Object)this.unaffected), (Object)((Object)this.exposed), (Object)((Object)this.exposed), (Object)((Object)this.weathered), (Object)((Object)this.weathered), (Object)((Object)this.oxidized));
    }

    public class00891 R() {
        return this.weathered;
    }
}

