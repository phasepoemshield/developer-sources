/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class12018
 */
package Nursultan;

import Nursultan.class11535;
import Nursultan.class11536;
import Nursultan.class12018;
import java.util.List;
import java.util.function.BooleanSupplier;

public class class11517<T extends class11535>
extends class11536<T> {
    public Object N_0;

    public List<T> L() {
        this.M();
        return List.copyOf((List)this.N_0);
    }

    private void M() {
    }

    public class11517(class12018 class120182, List<T> list) {
        super(class120182, null);
        this.M();
        this.N_0 = list;
        long l = list.stream().filter(class11535::U).count();
        if (l <= 0L) {
            throw new IllegalArgumentException("No value is selected");
        }
        if (l > 1L) {
            throw new IllegalArgumentException("More than one value is selected");
        }
        this.L(list.stream().filter(class11535::U).findFirst().orElseThrow());
        this.y((class11535)this.i());
    }

    @Override
    public void u() {
        this.y((class11535)this.U());
    }

    public void y(class11535 class115352) {
        this.M();
        if (class115352 == null || !((List)this.N_0).contains(class115352)) {
            throw new IllegalArgumentException("Entry is null or not found");
        }
        ((List)this.N_0).forEach(class115353 -> class115353.M(class115353 == class115352));
        this.L(class115352);
    }

    @Override
    public void N(T t) {
        throw new UnsupportedOperationException("Use selectEntry instead of setValue");
    }

    @Override
    public class11517<T> N(BooleanSupplier booleanSupplier, T t) {
        this.M();
        if (t == null || !((List)this.N_0).contains(t)) {
            throw new IllegalArgumentException("Entry is null or not found");
        }
        this.N(booleanSupplier, t);
        for (class11535 class115352 : (List)this.N_0) {
            class115352.N_5(() -> booleanSupplier.getAsBoolean() ? Boolean.valueOf(class115352 == t) : null);
        }
        return this;
    }

    @Override
    public boolean c_() {
        class11535 class115352 = (class11535)this.W();
        class11535 class115353 = (class11535)this.U();
        return !class115352.E().N().equals(class115353.E().N());
    }
}

