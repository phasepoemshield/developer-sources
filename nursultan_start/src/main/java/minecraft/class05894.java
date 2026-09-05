/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01339
 *  minecraft.class04887
 *  minecraft.class06069
 *  minecraft.class06667
 *  minecraft.class07209
 *  minecraft.class08092
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01339;
import minecraft.class04887;
import minecraft.class06069;
import minecraft.class06667;
import minecraft.class07209;
import minecraft.class08092;

public final class class05894 {
    private final class04887 N;
    private final BiConsumer<class07209, class00500> y;
    private final class06069 L;
    private final ObjectArrayList<class07209> u;
    private final ObjectArrayList<class07209> i;
    private final ObjectArrayList<class07209> R;

    public ObjectArrayList<class07209> L() {
        return this.u;
    }

    public class05894(class04887 class048872, BiConsumer<class07209, class00500> biConsumer, class06069 class060692, Set<class07209> set, Set<class07209> set2, Set<class07209> set3) {
        this.N = class048872;
        this.y = biConsumer;
        this.L = class060692;
        this.R = new ObjectArrayList(set3);
        this.u = new ObjectArrayList(set);
        this.i = new ObjectArrayList(set2);
        this.u.sort(Comparator.comparingInt(class00753::method_10264));
        this.i.sort(Comparator.comparingInt(class00753::method_10264));
        this.R.sort(Comparator.comparingInt(class00753::method_10264));
    }

    public ObjectArrayList<class07209> i() {
        return this.R;
    }

    public ObjectArrayList<class07209> u() {
        return this.i;
    }

    public class06069 y() {
        return this.L;
    }

    public class04887 N() {
        return this.N;
    }

    public void N(class07209 class072092, class06667 class066672) {
        this.N(class072092, (class00500)class00869.Rc.W().y((class08092)class066672, (Comparable)Boolean.valueOf(true)));
    }

    public boolean N(class07209 class072092) {
        return this.N.method_16358(class072092, class01339::P);
    }

    public void N(class07209 class072092, class00500 class005002) {
        this.y.accept(class072092, class005002);
    }

    public boolean N(class07209 class072092, Predicate<class00500> predicate) {
        return this.N.method_16358(class072092, predicate);
    }
}

