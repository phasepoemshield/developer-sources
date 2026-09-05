/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10697
 *  Nursultan.class10700
 *  Nursultan.class10701
 *  Nursultan.class10703
 *  minecraft.class00381
 *  minecraft.class00394
 *  minecraft.class00437
 *  minecraft.class00449
 *  minecraft.class00455
 *  minecraft.class00474
 *  minecraft.class00570
 *  minecraft.class04206
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05377
 *  minecraft.class06265
 *  minecraft.class06954
 *  minecraft.class06965
 *  minecraft.class06968
 *  minecraft.class07209
 *  minecraft.class07280
 *  minecraft.class07321
 */
package minecraft;

import Nursultan.class10697;
import Nursultan.class10700;
import Nursultan.class10701;
import Nursultan.class10703;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import minecraft.class00381;
import minecraft.class00394;
import minecraft.class00437;
import minecraft.class00449;
import minecraft.class00455;
import minecraft.class00474;
import minecraft.class00570;
import minecraft.class04206;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05377;
import minecraft.class06265;
import minecraft.class06954;
import minecraft.class06965;
import minecraft.class06968;
import minecraft.class06990;
import minecraft.class06991;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07280;
import minecraft.class07321;

public class class06987 {
    private final class04782 N;
    private final List<class06968<?>> y = new ArrayList();
    private final Map<class00455<?>, class10701<?>> L = new HashMap();
    private final class06991 u = new class06991();
    private final class06965 i = new class06965();
    private boolean R = true;
    private Set<class00455<?>> M = Set.of();

    public void L(class07209 class072092) {
        if (this.R) {
            return;
        }
        this.u.N(this.N, class072092);
        this.i.N(this.N, class072092);
    }

    public class06987(class04782 class047822) {
        this.N = class047822;
        for (class00455 var3 : class04206.R) {
            if (var3.y() == null) continue;
            this.L.put(var3, new class10701(var3));
        }
        this.y.addAll(this.L.values());
        this.y.add(this.u);
        this.y.add((class06968<?>)this.i);
    }

    public void y(class07049 class070492) {
        if (this.R) {
            return;
        }
        Iterator<class10701<?>> var2 = this.L.values().iterator();
        while (var2.hasNext()) {
            var2.next().N(class070492);
        }
    }

    public void y(class07209 class072092) {
        if (this.R) {
            return;
        }
        this.u.y(this.N, class072092);
    }

    public boolean y(class00455<?> class004552) {
        return this.M.contains(class004552);
    }

    public <T> void y(class07209 class072092, class00455<T> class004552, T t) {
        if (this.y(class004552)) {
            this.N(new class07321(class072092), class004552, (class00381<? super class07280>)new class00474(class004552.y(t)));
        }
    }

    private void N(class07321 class073212, class00455<?> class004552, class00381<? super class07280> class003812) {
        for (class04770 class047702 : this.N.method_14178().L.N(class073212, false)) {
            if (!class047702.method_74538().contains(class004552)) continue;
            class047702.field_13987.method_14364(class003812);
        }
    }

    private void N(class07049 class070492, class00455<?> class004552, class00381<? super class07280> class003812) {
        this.N.method_14178().L.N(class070492, class003812, class047702 -> class047702.method_74538().contains(class004552));
    }

    public <T> void N(class07049 class070492, class00455<T> class004552, T t) {
        if (this.y(class004552)) {
            this.N(class070492, class004552, new class00449(class070492.method_5628(), class004552.N(t)));
        }
    }

    public <T> void N(class07209 class072092, class00455<T> class004552, T t) {
        if (this.y(class004552)) {
            this.N(new class07321(class072092), class004552, (class00381<? super class07280>)new class00437(class072092, class004552.N(t)));
        }
    }

    public <T> void N(class07209 class072092, class00455<T> class004552) {
        if (this.y(class004552)) {
            this.N(new class07321(class072092), class004552, (class00381<? super class07280>)new class00437(class072092, class004552.N()));
        }
    }

    public <T> void N(class07049 class070492, class00455<T> class004552) {
        if (this.y(class004552)) {
            this.N(class070492, class004552, new class00449(class070492.method_5628(), class004552.N()));
        }
    }

    public void N(class00394 class003942) {
        if (this.R) {
            return;
        }
        class003942.method_74589(this.N, (class06990)new class10700(this, class003942));
    }

    public void N(class07321 class073212) {
        if (this.R) {
            return;
        }
        Iterator<class10701<?>> var2 = this.L.values().iterator();
        while (var2.hasNext()) {
            var2.next().N(class073212);
        }
    }

    public void N(class00570 class005702) {
        if (this.R) {
            return;
        }
        class005702.method_74589(this.N, (class06990)new class10703(this, class005702));
        class005702.o().values().forEach(this::N);
    }

    public <T> class10701<T> N(class00455<T> class004552) {
        return this.L.get(class004552);
    }

    private void N() {
        class06265 class062652 = this.N.method_14178().L;
        class062652.y(this::N);
        for (class07049 class070492 : this.N.method_27909()) {
            if (!class062652.L(class070492)) continue;
            this.N(class070492);
        }
    }

    public void N(class06954 class069542) {
        this.M = class069542.y();
        boolean bl = this.M.isEmpty();
        if (this.R != bl) {
            this.R = bl;
            if (bl) {
                for (class06968<?> var4 : this.y) {
                    var4.N();
                }
            } else {
                this.N();
            }
        }
        if (!this.R) {
            for (class06968<?> class069682 : this.y) {
                class069682.N(this.N);
            }
        }
    }

    public void N(class05377 class053772) {
        if (this.R) {
            return;
        }
        this.u.N(this.N, class053772);
        this.i.N(this.N, class053772);
    }

    public void N(class04770 class047702, class07049 class070492) {
        if (this.R) {
            return;
        }
        Iterator<class06968<?>> var3 = this.y.iterator();
        while (var3.hasNext()) {
            var3.next().N(class047702, class070492);
        }
    }

    public void N(class04770 class047702, class07321 class073212) {
        if (this.R) {
            return;
        }
        Iterator<class06968<?>> var3 = this.y.iterator();
        while (var3.hasNext()) {
            var3.next().N(class047702, class073212);
        }
    }

    public void N(class07049 class070492) {
        if (this.R) {
            return;
        }
        class070492.method_74589(this.N, (class06990)new class10697(this, class070492));
    }

    public void N(class07209 class072092) {
        if (this.R) {
            return;
        }
        Iterator<class10701<?>> var2 = this.L.values().iterator();
        while (var2.hasNext()) {
            var2.next().N(this.N, class072092);
        }
    }
}

