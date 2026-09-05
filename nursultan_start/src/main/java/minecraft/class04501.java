/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Iterables
 *  minecraft.class04782
 *  minecraft.class05355
 *  minecraft.class05360
 *  minecraft.class05378
 *  minecraft.class07042
 *  minecraft.class07438
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import minecraft.class04508;
import minecraft.class04782;
import minecraft.class05355;
import minecraft.class05360;
import minecraft.class05378;
import minecraft.class07042;
import minecraft.class07438;

public class class04501
extends class05360<class04508> {
    protected void N(class04782 class047822, class04508 class045082) {
        super.N(class047822, (class07438)class045082);
        class045082.method_18868().L(class05378.M).stream().flatMap(Collection::stream).filter(class07042.i).filter(class074382 -> class05355.y((class04782)class047822, (class07438)class045082, (class07438)class074382)).findFirst().ifPresentOrElse(class074382 -> class045082.method_18868().N(class05378.Q, class074382), () -> class045082.method_18868().y(class05378.Q));
    }

    public Set<class05378<?>> N() {
        return ImmutableSet.copyOf((Iterable)Iterables.concat((Iterable)super.N(), List.of(class05378.Q)));
    }
}

