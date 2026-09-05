/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05957
 *  minecraft.class08122
 */
package minecraft;

import java.util.List;
import java.util.function.Function;
import minecraft.class00471;
import minecraft.class05957;
import minecraft.class08122;

final class class00460
extends class00471<class00460> {
    private final Function<List<class05957>, class08122> N;

    public class00460(Function<List<class05957>, class08122> function) {
        this.N = function;
    }

    public class08122 y() {
        return this.N.apply(this.R());
    }

    @Override
    protected class00460 L() {
        return this;
    }
}

