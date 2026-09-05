/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  minecraft.class00381
 *  minecraft.class01135
 *  minecraft.class01296
 *  minecraft.class01595
 *  minecraft.class01599
 *  minecraft.class04770
 *  minecraft.class04813
 *  minecraft.class06265
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07280
 *  net.fabricmc.fabric.mixin.networking.accessor.EntityTrackerAccessor
 */
package Nursultan;

import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class00381;
import minecraft.class01135;
import minecraft.class01296;
import minecraft.class01595;
import minecraft.class01599;
import minecraft.class04770;
import minecraft.class04813;
import minecraft.class06265;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07280;
import net.fabricmc.fabric.mixin.networking.accessor.EntityTrackerAccessor;

public class class10572
implements class01595,
EntityTrackerAccessor {
    public final class01599 N;
    public final class07049 y;
    private final int R;
    public class01296 L;
    public final Set<class04813> u = this.L();
    final /* synthetic */ class06265 i;

    private Set<class04813> L() {
        return new ReferenceOpenHashSet();
    }

    public class10572(class06265 class062652, class07049 class070492, int n, int n2, boolean bl) {
        this.i = class062652;
        this.N = new class01599(class062652.u, class070492, n2, bl, (class01595)this);
        this.y = class070492;
        this.R = n;
        this.L = class01296.N((class01135)class070492);
    }

    public boolean equals(Object object) {
        if (object instanceof class10572) {
            return ((class10572)object).y.method_5628() == this.y.method_5628();
        }
        return false;
    }

    public int hashCode() {
        return this.y.method_5628();
    }

    private int y() {
        int n = this.R;
        Iterator iterator = this.y.method_5736().iterator();
        while (iterator.hasNext()) {
            int n2 = ((class07049)iterator.next()).method_5864().W() * 16;
            if (n2 <= n) continue;
            n = n2;
        }
        return this.N(n);
    }

    public void y(class04770 class047702) {
        if (class047702 == this.y) {
            return;
        }
        class06889 class068892 = class047702.method_73189().u(this.y.method_73189());
        int n = this.i.N(class047702);
        double d = class068892.M * class068892.M + class068892.Z * class068892.Z;
        double d2 = Math.min(this.y(), n * 16);
        double d3 = d2 * d2;
        if (d <= d3 && this.y.method_5680(class047702) && this.i.N(class047702, this.y.method_31476().B, this.y.method_31476().Z)) {
            if (this.u.add((class04813)class047702.field_13987)) {
                this.N.y(class047702);
                if (this.u.size() == 1) {
                    this.i.u.method_74535().N(this.y);
                }
                this.i.u.method_74535().N(class047702, this.y);
            }
        } else {
            this.N(class047702);
        }
    }

    public void y(class00381<? super class07280> class003812) {
        this.N(class003812);
        class07049 class070492 = this.y;
        if (class070492 instanceof class04770) {
            ((class04770)class070492).field_13987.method_14364(class003812);
        }
    }

    private int N(int n) {
        return this.i.u.method_8503().N(n);
    }

    public void N(List<class04770> list) {
        for (class04770 class047702 : list) {
            this.y(class047702);
        }
    }

    public void N(class00381<? super class07280> class003812) {
        Iterator<class04813> var2 = this.u.iterator();
        while (var2.hasNext()) {
            var2.next().method_14364(class003812);
        }
    }

    public void N(class00381<? super class07280> class003812, Predicate<class04770> predicate) {
        for (class04813 class048132 : this.u) {
            if (!predicate.test(class048132.method_32311())) continue;
            class048132.method_14364(class003812);
        }
    }

    public void N() {
        for (class04813 class048132 : this.u) {
            this.N.N(class048132.method_32311());
        }
    }

    public void N(class04770 class047702) {
        if (this.u.remove(class047702.field_13987)) {
            this.N.N(class047702);
            if (this.u.isEmpty()) {
                this.i.u.method_74535().y(this.y);
            }
        }
    }

    public /* synthetic */ Set getPlayersTracking() {
        return this.u;
    }
}

