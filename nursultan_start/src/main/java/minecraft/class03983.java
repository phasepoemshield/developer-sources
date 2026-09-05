/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Iterables
 *  minecraft.class04003
 *  minecraft.class04782
 *  minecraft.class05360
 *  minecraft.class05378
 *  minecraft.class07078
 *  minecraft.class07438
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class04003;
import minecraft.class04782;
import minecraft.class05360;
import minecraft.class05378;
import minecraft.class07078;
import minecraft.class07438;

public class class03983
extends class05360<class04003> {
    public Set<class05378<?>> N() {
        return ImmutableSet.copyOf((Iterable)Iterables.concat((Iterable)super.N(), List.of(class05378.Q)));
    }

    protected void N(class04782 class047822, class04003 class040032) {
        super.N(class047822, (class07438)class040032);
        class03983.N(class040032, (class07438 class074382) -> class074382.method_5864() == class07078.Ly).or(() -> class03983.N(class040032, (class07438 class074382) -> class074382.method_5864() != class07078.Ly)).ifPresentOrElse(class074382 -> class040032.method_18868().N(class05378.Q, class074382), () -> class040032.method_18868().y(class05378.Q));
    }

    private static Optional<class07438> N(class04003 class040032, Predicate<class07438> predicate) {
        return class040032.method_18868().L(class05378.M).stream().flatMap(Collection::stream).filter(arg_0 -> ((class04003)class040032).L(arg_0)).filter(predicate).findFirst();
    }
}

