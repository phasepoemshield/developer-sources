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

class class07779
implements class07773 {
    private final String N;
    private final class07001 y;
    private final Predicate<class07709> L;

    public class07779(String string, class07001 class070012) {
        this.N = string;
        this.y = class070012;
        this.L = class07759.N(class070012);
    }

    @Override
    public class07709 N() {
        return new class07001();
    }

    @Override
    public int N(class07709 class077092, Supplier<class07709> supplier) {
        class07709 class077093;
        class07001 class070012;
        class07709 class077094;
        if (class077092 instanceof class07001 && this.L.test(class077094 = (class070012 = (class07001)class077092).N(this.N)) && !(class077093 = supplier.get()).equals(class077094)) {
            class070012.N(this.N, class077093);
            return 1;
        }
        return 0;
    }

    @Override
    public int N(class07709 class077092) {
        class07001 class070012;
        class07709 class077093;
        if (class077092 instanceof class07001 && this.L.test(class077093 = (class070012 = (class07001)class077092).N(this.N))) {
            class070012.b(this.N);
            return 1;
        }
        return 0;
    }

    @Override
    public void N(class07709 class077092, Supplier<class07709> supplier, List<class07709> list) {
        if (class077092 instanceof class07001) {
            class07001 class070012 = (class07001)class077092;
            class07709 class077093 = class070012.N(this.N);
            if (class077093 == null) {
                class077093 = this.y.N();
                class070012.N(this.N, class077093);
                list.add(class077093);
            } else if (this.L.test(class077093)) {
                list.add(class077093);
            }
        }
    }

    @Override
    public void N(class07709 class077092, List<class07709> list) {
        class07709 class077093;
        if (class077092 instanceof class07001 && this.L.test(class077093 = ((class07001)class077092).N(this.N))) {
            list.add(class077093);
        }
    }
}

