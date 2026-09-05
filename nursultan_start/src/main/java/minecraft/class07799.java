/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07001
 */
package minecraft;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class07759;
import minecraft.class07773;

class class07799
implements class07773 {
    private final Predicate<class07709> N;

    public class07799(class07001 class070012) {
        this.N = class07759.N(class070012);
    }

    @Override
    public class07709 N() {
        return new class07001();
    }

    @Override
    public int N(class07709 class077092, Supplier<class07709> supplier) {
        return 0;
    }

    @Override
    public int N(class07709 class077092) {
        return 0;
    }

    @Override
    public void N(class07709 class077092, Supplier<class07709> supplier, List<class07709> list) {
        this.N(class077092, list);
    }

    @Override
    public void N(class07709 class077092, List<class07709> list) {
        if (class077092 instanceof class07001 && this.N.test(class077092)) {
            list.add(class077092);
        }
    }
}

