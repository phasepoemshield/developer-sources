/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  minecraft.class07023
 */
package minecraft;

import com.google.common.collect.Iterables;
import java.lang.invoke.LambdaMetafactory;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import minecraft.class07023;
import minecraft.class07709;
import minecraft.class07741;
import minecraft.class07773;

class class07782
implements class07773 {
    public static final class07782 N = new class07782();

    private class07782() {
    }

    @Override
    public class07709 N() {
        return new class07741();
    }

    @Override
    public int N(class07709 class077092) {
        class07023 class070232;
        int n;
        if (class077092 instanceof class07023 && (n = (class070232 = (class07023)class077092).size()) > 0) {
            class070232.clear();
            return n;
        }
        return 0;
    }

    @Override
    public int N(class07709 class077092, Supplier<class07709> supplier) {
        if (class077092 instanceof class07023) {
            class07023 class070232 = (class07023)class077092;
            int n = class070232.size();
            if (n == 0) {
                class070232.y(0, supplier.get());
                return 1;
            }
            class07709 class077093 = supplier.get();
            int n2 = n - (int)class070232.stream().filter((Predicate<class07709>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, equals(java.lang.Object ), (Lminecraft/class07709;)Z)((class07709)class077093)).count();
            if (n2 == 0) {
                return 0;
            }
            class070232.clear();
            if (!class070232.y(0, class077093)) {
                return 0;
            }
            for (int i = 1; i < n; ++i) {
                class070232.y(i, supplier.get());
            }
            return n2;
        }
        return 0;
    }

    @Override
    public void N(class07709 class077092, List<class07709> list) {
        if (class077092 instanceof class07023) {
            class07023 class070232 = (class07023)class077092;
            Iterables.addAll(list, (Iterable)class070232);
        }
    }

    @Override
    public void N(class07709 class077092, Supplier<class07709> supplier, List<class07709> list) {
        if (class077092 instanceof class07023) {
            class07023 class070232 = (class07023)class077092;
            if (class070232.isEmpty()) {
                class07709 class077093 = supplier.get();
                if (class070232.y(0, class077093)) {
                    list.add(class077093);
                }
            } else {
                Iterables.addAll(list, (Iterable)class070232);
            }
        }
    }
}

