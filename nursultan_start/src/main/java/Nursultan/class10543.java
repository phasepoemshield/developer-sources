/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05880
 *  minecraft.class07209
 *  minecraft.class07299
 */
package Nursultan;

import java.util.Optional;
import java.util.function.BiFunction;
import minecraft.class05880;
import minecraft.class07209;
import minecraft.class07299;

public class class10543
implements class05880 {
    final /* synthetic */ class07299 y;
    final /* synthetic */ class07209 L;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10543(class07299 class072992, class07209 class072092) {
        this.y = class072992;
        this.L = class072092;
    }

    public <T> Optional<T> N(BiFunction<class07299, class07209, T> biFunction) {
        return Optional.of(biFunction.apply(this.y, this.L));
    }
}

