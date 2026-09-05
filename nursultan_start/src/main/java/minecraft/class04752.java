/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02796
 *  minecraft.class06709
 *  minecraft.class07299
 *  minecraft.class08700
 */
package minecraft;

import java.util.function.BooleanSupplier;
import minecraft.class02796;
import minecraft.class04751;
import minecraft.class06709;
import minecraft.class07299;
import minecraft.class08700;

public final class class04752
extends class06709<Runnable> {
    final /* synthetic */ class04751 N;

    protected boolean L(Runnable runnable) {
        return true;
    }

    protected void M_1(Runnable runnable) {
        class08700.N().R("runTask");
        super.M_1(runnable);
    }

    class04752(class04751 class047512, class07299 class072992) {
        this.N = class047512;
        super("Chunk source main thread executor for " + String.valueOf(class072992.method_27983().N()));
    }

    public boolean J() {
        if (this.N.Z()) {
            return true;
        }
        this.N.y.y();
        return super.J();
    }

    protected Thread k() {
        return this.N.N;
    }

    public void y(BooleanSupplier booleanSupplier) {
        super.y(() -> class02796.Nn() && booleanSupplier.getAsBoolean());
    }

    public Runnable y(Runnable runnable) {
        return runnable;
    }

    protected boolean Y() {
        return true;
    }
}

