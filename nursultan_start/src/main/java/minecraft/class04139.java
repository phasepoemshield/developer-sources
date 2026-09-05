/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.K1
 *  minecraft.class01289
 *  minecraft.class05378
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.Optional;
import minecraft.class01289;
import minecraft.class05378;

public final class class04139<F extends K1, Value> {
    private final class01289<?> N;
    private final class05378<Value> y;
    private final App<F, Value> L;

    public class04139(class01289<?> class012892, class05378<Value> class053782, App<F, Value> app) {
        this.N = class012892;
        this.y = class053782;
        this.L = app;
    }

    public void y() {
        this.N.y(this.y);
    }

    public void N(Optional<Value> optional) {
        this.N.N(this.y, optional);
    }

    public void N(Value Value, long l) {
        this.N.N(this.y, Value, l);
    }

    public App<F, Value> N() {
        return this.L;
    }

    public void N(Value Value) {
        this.N.N(this.y, Optional.of(Value));
    }
}

