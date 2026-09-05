/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10767
 *  Nursultan.class10772
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class06889
 *  minecraft.class07601
 *  minecraft.class07603
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10767;
import Nursultan.class10772;
import java.lang.runtime.SwitchBootstraps;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import minecraft.class00602;
import minecraft.class00607;
import minecraft.class06889;
import minecraft.class07601;
import minecraft.class07603;
import org.jspecify.annotations.Nullable;

class class00600<Value> {
    private final class00607<Value> L;
    final Value N;
    private final List<class07603<Value>> u;
    final boolean y;
    private @Nullable Value i;
    private int R;

    private Value L() {
        Object object = this.N;
        Iterator<class07603<Value>> iterator = this.u.iterator();
        while (iterator.hasNext()) {
            class07603<Value> class076032;
            Objects.requireNonNull(iterator.next());
            int n = 0;
            object = switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class10772.class, class07601.class, class10767.class}, class076032, (int)n)) {
                default -> throw new MatchException(null, null);
                case 0 -> ((class10772)class076032).applyConstant(object);
                case 1 -> ((class07601)class076032).applyTimeBased(object, this.R);
                case 2 -> {
                    class10767 var8_5 = (class10767)class076032;
                    yield object;
                }
            };
        }
        return this.L.N(object);
    }

    class00600(class00607<Value> class006072, Value Value, List<class07603<Value>> list, boolean bl) {
        this.L = class006072;
        this.N = Value;
        this.u = list;
        this.y = bl;
    }

    private Value y(class06889 class068892, @Nullable class00602 class006022) {
        Object object = this.N;
        Iterator<class07603<Value>> iterator = this.u.iterator();
        while (iterator.hasNext()) {
            class07603<Value> class076032;
            Objects.requireNonNull(iterator.next());
            int n = 0;
            object = switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class10772.class, class07601.class, class10767.class}, class076032, (int)n)) {
                default -> throw new MatchException(null, null);
                case 0 -> ((class10772)class076032).applyConstant(object);
                case 1 -> ((class07601)class076032).applyTimeBased(object, this.R);
                case 2 -> ((class10767)class076032).applyPositional(object, Objects.requireNonNull(class068892), class006022);
            };
        }
        return this.L.N(object);
    }

    public Value y() {
        if (this.i != null) {
            return this.i;
        }
        Value Value = this.L();
        this.i = Value;
        return Value;
    }

    public void N() {
        this.i = null;
        ++this.R;
    }

    public Value N(class06889 class068892, @Nullable class00602 class006022) {
        if (!this.y) {
            return this.y();
        }
        return this.y(class068892, class006022);
    }
}

