/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class01424
 *  minecraft.class01465
 *  minecraft.class03154
 *  minecraft.class03175
 *  minecraft.class04818
 *  minecraft.class04836
 *  minecraft.class06995
 *  minecraft.class07001
 *  minecraft.class07023
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.io.DataOutput;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class01424;
import minecraft.class01465;
import minecraft.class03154;
import minecraft.class03175;
import minecraft.class04818;
import minecraft.class04836;
import minecraft.class06995;
import minecraft.class07001;
import minecraft.class07023;
import minecraft.class07707;
import minecraft.class07709;
import minecraft.class07724;
import minecraft.class07737;
import minecraft.class07757;
import org.jspecify.annotations.Nullable;

public final class class07741
extends AbstractList<class07709>
implements class07023 {
    private static final String y = "";
    private static final int L = 36;
    public static final class01424<class07741> N = new class07724();
    private final List<class07709> t;

    public byte L() {
        return 9;
    }

    @Override
    public class07709 set(int n, class07709 class077092) {
        return this.t.set(n, class077092);
    }

    @Override
    public class07709 get(int n) {
        return this.t.get(n);
    }

    public class07741 N() {
        ArrayList<class07709> arrayList = new ArrayList<class07709>(this.t.size());
        for (class07709 class077092 : this.t) {
            arrayList.add(class077092.N());
        }
        return new class07741(arrayList);
    }

    public Optional<Short> M(int n) {
        return this.P(n).flatMap(class07709::T);
    }

    private Optional<class07709> P(int n) {
        return Optional.ofNullable(this.m(n));
    }

    class07741(List<class07709> list) {
        this.t = list;
    }

    public class07741() {
        this(new ArrayList<class07709>());
    }

    @Override
    public int size() {
        return this.t.size();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof class07741 && Objects.equals(this.t, ((class07741)object).t);
    }

    @Override
    public String toString() {
        class04818 class048182 = new class04818();
        class048182.N(this);
        return class048182.N();
    }

    @Override
    public int hashCode() {
        return this.t.hashCode();
    }

    public Optional<Integer> B(int n) {
        return this.P(n).flatMap(class07709::b);
    }

    public Optional<int[]> Z(int n) {
        class07709 class077092 = this.m(n);
        if (class077092 instanceof class06995) {
            return Optional.of(((class06995)class077092).M());
        }
        return Optional.empty();
    }

    @Override
    public void clear() {
        this.t.clear();
    }

    @Override
    public boolean isEmpty() {
        return this.t.isEmpty();
    }

    @Override
    public Stream<class07709> stream() {
        return super.stream();
    }

    byte i() {
        byte by = 0;
        Iterator<class07709> var2 = this.t.iterator();
        while (var2.hasNext()) {
            byte by2 = var2.next().L();
            if (by == 0) {
                by = by2;
                continue;
            }
            if (by == by2) continue;
            return 10;
        }
        return by;
    }

    public Optional<class07741> i(int n) {
        class07709 class077092 = this.m(n);
        if (class077092 instanceof class07741) {
            return Optional.of((class07741)((Object)class077092));
        }
        return Optional.empty();
    }

    private @Nullable class07709 m(int n) {
        return n >= 0 && n < this.t.size() ? this.t.get(n) : null;
    }

    public Optional<Double> U(int n) {
        return this.P(n).flatMap(class07709::n);
    }

    public Stream<class07001> z() {
        return this.stream().mapMulti((class077092, consumer) -> {
            if (class077092 instanceof class07001) {
                class07001 class070012 = (class07001)class077092;
                consumer.accept(class070012);
            }
        });
    }

    public Optional<long[]> z(int n) {
        class07709 class077092 = this.m(n);
        if (class077092 instanceof class07757) {
            return Optional.of(((class07757)((Object)class077092)).M());
        }
        return Optional.empty();
    }

    public class01424<class07741> u() {
        return N;
    }

    @Override
    public void add(int n, class07709 class077092) {
        this.t.add(n, class077092);
    }

    @Override
    public class07709 remove(int n) {
        return this.t.remove(n);
    }

    public boolean y(int n, class07709 class077092) {
        this.t.add(n, class077092);
        return true;
    }

    private static boolean y(class07001 class070012) {
        return class070012.Z() == 1 && class070012.y(y);
    }

    public class07001 y(int n) {
        return this.N(n).orElseGet(class07001::new);
    }

    public int y() {
        int n = 36;
        n += 4 * this.t.size();
        for (class07709 class077092 : this.t) {
            n += class077092.y();
        }
        return n;
    }

    private static class07001 y(class07709 class077092) {
        return new class07001(Map.of(y, class077092));
    }

    public Optional<Float> E(int n) {
        return this.P(n).flatMap(class07709::v);
    }

    public Optional<class07001> N(int n) {
        class07709 class077092 = this.m(n);
        if (class077092 instanceof class07001) {
            return Optional.of((class07001)class077092);
        }
        return Optional.empty();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String N(int n, String string) {
        class07709 class077092 = this.m(n);
        if (!(class077092 instanceof class07707)) return string;
        class07707 class077072 = (class07707)((Object)class077092);
        try {
            return class077072.U();
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
    }

    public class03154 N(class03175 class031752) {
        byte by = this.i();
        switch (class031752.N(class01465.N((int)by), this.t.size())) {
            case field_36255: {
                return class03154.field_36255;
            }
            case field_36254: {
                return class031752.y();
            }
        }
        block13: for (int i = 0; i < this.t.size(); ++i) {
            class07709 class077092 = class07741.N(by, this.t.get(i));
            switch (class031752.y(class077092.u(), i)) {
                case field_36251: {
                    return class03154.field_36255;
                }
                case field_36249: {
                    continue block13;
                }
                case field_36250: {
                    return class031752.y();
                }
                default: {
                    switch (class077092.N(class031752)) {
                        case field_36255: {
                            return class03154.field_36255;
                        }
                        case field_36254: {
                            return class031752.y();
                        }
                    }
                }
            }
        }
        return class031752.y();
    }

    public short N(int n, short s) {
        class07709 class077092 = this.m(n);
        if (class077092 instanceof class07737) {
            return ((class07737)((Object)class077092)).Z();
        }
        return s;
    }

    public void N(class04836 class048362) {
        class048362.N(this);
    }

    private static class07709 N(byte by, class07709 class077092) {
        class07001 class070012;
        if (by != 10) {
            return class077092;
        }
        if (class077092 instanceof class07001 && !class07741.y(class070012 = (class07001)class077092)) {
            return class070012;
        }
        return class07741.y(class077092);
    }

    public void N(class07709 class077092) {
        if (class077092 instanceof class07001) {
            class07001 class070012 = (class07001)class077092;
            this.add(class07741.N(class070012));
        } else {
            this.add(class077092);
        }
    }

    private static class07709 N(class07001 class070012) {
        class07709 class077092;
        if (class070012.Z() == 1 && (class077092 = class070012.N(y)) != null) {
            return class077092;
        }
        return class070012;
    }

    public boolean N(int n, class07709 class077092) {
        this.t.set(n, class077092);
        return true;
    }

    public float N(int n, float f) {
        class07709 class077092 = this.m(n);
        if (class077092 instanceof class07737) {
            return ((class07737)((Object)class077092)).E();
        }
        return f;
    }

    public void N(DataOutput dataOutput) throws IOException {
        byte by = this.i();
        dataOutput.writeByte(by);
        dataOutput.writeInt(this.t.size());
        for (class07709 class077092 : this.t) {
            class07741.N(by, class077092).N(dataOutput);
        }
    }

    public int N(int n, int n2) {
        class07709 class077092 = this.m(n);
        if (class077092 instanceof class07737) {
            return ((class07737)((Object)class077092)).B();
        }
        return n2;
    }

    public double N(int n, double d) {
        class07709 class077092 = this.m(n);
        if (class077092 instanceof class07737) {
            return ((class07737)((Object)class077092)).U();
        }
        return d;
    }

    public Optional<String> W(int n) {
        return this.P(n).flatMap(class07709::ah_);
    }

    public class07741 R(int n) {
        return this.i(n).orElseGet(class07741::new);
    }

    public Optional<class07741> al_() {
        return Optional.of(this);
    }
}

