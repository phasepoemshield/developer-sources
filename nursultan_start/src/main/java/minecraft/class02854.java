/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.mojang.serialization.Codec
 *  minecraft.class00392
 *  minecraft.class00743
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02666
 *  minecraft.class02694
 *  minecraft.class04247
 *  minecraft.class06497
 *  minecraft.class06541
 *  minecraft.class06584
 *  minecraft.class06591
 *  net.fabricmc.fabric.mixin.transfer.ItemContainerContentsAccessor
 */
package minecraft;

import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class00743;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02666;
import minecraft.class02694;
import minecraft.class02809;
import minecraft.class04247;
import minecraft.class06497;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class06591;
import net.fabricmc.fabric.mixin.transfer.ItemContainerContentsAccessor;

public final class class02854
implements class02694,
ItemContainerContentsAccessor {
    private static final int u = -1;
    private static final int i = 256;
    public static final class02854 N = new class02854((class00743<class06584>)class00743.method_10211());
    public static final Codec<class02854> y = class02809.N.sizeLimitedListOf(256).xmap(class02854::y, class02854::R);
    public static final class02362<class04247, class02854> L = class06584.B.N_33(class02389.L((int)256)).N_10(class02854::new, class028542 -> class028542.R);
    private final class00743<class06584> R;
    private final int M;

    public Stream<class06584> L() {
        return this.R.stream().filter(class065842 -> !class065842.R()).map(class06584::t);
    }

    private static int L(List<class06584> list) {
        for (int i = list.size() - 1; i >= 0; --i) {
            if (list.get(i).R()) continue;
            return i;
        }
        return -1;
    }

    private class02854(class00743<class06584> class007432) {
        if (class007432.size() > 256) {
            throw new IllegalArgumentException("Got " + class007432.size() + " items, but maximum is 256");
        }
        this.R = class007432;
        this.M = class06584.N(class007432);
    }

    private class02854(List<class06584> list) {
        this(list.size());
        for (int i = 0; i < list.size(); ++i) {
            this.R.set(i, (Object)list.get(i));
        }
    }

    private class02854(int n) {
        this((class00743<class06584>)class00743.method_10213((int)n, (Object)class06584.E));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class02854)) return false;
        class02854 class028542 = (class02854)object;
        if (!class06584.N(this.R, class028542.R)) return false;
        return true;
    }

    public int hashCode() {
        return this.M;
    }

    public Iterable<class06584> i() {
        return Iterables.transform(this.u(), class06584::t);
    }

    public Iterable<class06584> u() {
        return Iterables.filter(this.R, class065842 -> !class065842.R());
    }

    private static class02854 y(List<class02809> list) {
        OptionalInt optionalInt = list.stream().mapToInt(class02809::N).max();
        if (optionalInt.isEmpty()) {
            return N;
        }
        class02854 class028542 = new class02854(optionalInt.getAsInt() + 1);
        for (class02809 class028092 : list) {
            class028542.R.set(class028092.N(), (Object)class028092.y());
        }
        return class028542;
    }

    public Stream<class06584> y() {
        return this.R.stream().map(class06584::t);
    }

    public static class02854 N(List<class06584> list) {
        int n = class02854.L(list);
        if (n == -1) {
            return N;
        }
        class02854 class028542 = new class02854(n + 1);
        for (int i = 0; i <= n; ++i) {
            class028542.R.set(i, (Object)list.get(i).t());
        }
        return class028542;
    }

    public class06584 N() {
        return this.R.isEmpty() ? class06584.E : ((class06584)this.R.get(0)).t();
    }

    public void N(class00743<class06584> class007432) {
        for (int i = 0; i < class007432.size(); ++i) {
            class06584 class065842 = i < this.R.size() ? (class06584)this.R.get(i) : class06584.E;
            class007432.set(i, (Object)class065842.t());
        }
    }

    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
        int n = 0;
        int n2 = 0;
        for (class06584 class065842 : this.u()) {
            ++n2;
            if (n > 4) continue;
            ++n;
            consumer.accept((class00392)class00392.N((String)"item.container.item_count", (Object[])new Object[]{class065842.d(), class065842.c()}));
        }
        if (n2 - n > 0) {
            consumer.accept((class00392)class00392.N((String)"item.container.more_items", (Object[])new Object[]{n2 - n}).N(class06541.field_1056));
        }
    }

    public /* synthetic */ class00743 fabric_getStacks() {
        return this.R;
    }

    private List<class02809> R() {
        ArrayList<class02809> arrayList = new ArrayList<class02809>();
        for (int i = 0; i < this.R.size(); ++i) {
            class06584 class065842 = (class06584)this.R.get(i);
            if (class065842.R()) continue;
            arrayList.add(new class02809(i, class065842));
        }
        return arrayList;
    }
}

