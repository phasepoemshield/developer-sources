/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class05748
 *  minecraft.class07438
 */
package minecraft;

import minecraft.class04118;
import minecraft.class04142;
import minecraft.class04782;
import minecraft.class05748;
import minecraft.class07438;

public abstract class class04119<E extends class07438>
implements class04118<E>,
class04142<E> {
    private class05748 N = class05748.field_18337;

    @Override
    public String method_46910() {
        return this.getClass().getSimpleName();
    }

    @Override
    public final void method_18925(class04782 class047822, E e, long l) {
        this.N = class05748.field_18337;
    }

    @Override
    public final void method_18923(class04782 class047822, E e, long l) {
        this.method_18925(class047822, e, l);
    }

    @Override
    public final class05748 method_18921() {
        return this.N;
    }

    @Override
    public final boolean method_18922(class04782 class047822, E e, long l) {
        if (this.trigger(class047822, e, l)) {
            this.N = class05748.field_18338;
            return true;
        }
        return false;
    }
}

