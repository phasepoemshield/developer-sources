/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07001
 *  org.apache.commons.lang3.mutable.MutableBoolean
 */
package minecraft;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class07741;
import minecraft.class07759;
import minecraft.class07773;
import org.apache.commons.lang3.mutable.MutableBoolean;

class class07762
implements class07773 {
    private final class07001 N;
    private final Predicate<class07709> y;

    public class07762(class07001 class070012) {
        this.N = class070012;
        this.y = class07759.N(class070012);
    }

    @Override
    public int N(class07709 class077092, Supplier<class07709> supplier) {
        int n = 0;
        if (class077092 instanceof class07741) {
            class07741 class077412 = (class07741)((Object)class077092);
            int n2 = class077412.size();
            if (n2 == 0) {
                class077412.add(supplier.get());
                ++n;
            } else {
                for (int i = 0; i < n2; ++i) {
                    class07709 class077093;
                    class07709 class077094 = class077412.get(i);
                    if (!this.y.test(class077094) || (class077093 = supplier.get()).equals(class077094) || !class077412.N(i, class077093)) continue;
                    ++n;
                }
            }
        }
        return n;
    }

    @Override
    public int N(class07709 class077092) {
        int n = 0;
        if (class077092 instanceof class07741) {
            class07741 class077412 = (class07741)((Object)class077092);
            for (int i = class077412.size() - 1; i >= 0; --i) {
                if (!this.y.test(class077412.get(i))) continue;
                class077412.remove(i);
                ++n;
            }
        }
        return n;
    }

    @Override
    public class07709 N() {
        return new class07741();
    }

    @Override
    public void N(class07709 class077093, Supplier<class07709> supplier, List<class07709> list) {
        MutableBoolean mutableBoolean = new MutableBoolean();
        if (class077093 instanceof class07741) {
            class07741 class077412 = (class07741)((Object)class077093);
            class077412.stream().filter(this.y).forEach(class077092 -> {
                list.add((class07709)class077092);
                mutableBoolean.setTrue();
            });
            if (mutableBoolean.isFalse()) {
                class07001 class070012 = this.N.N();
                class077412.add(class070012);
                list.add((class07709)class070012);
            }
        }
    }

    @Override
    public void N(class07709 class077092, List<class07709> list) {
        if (class077092 instanceof class07741) {
            ((class07741)((Object)class077092)).stream().filter(this.y).forEach(list::add);
        }
    }
}

