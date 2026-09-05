/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class07433
 *  minecraft.class07463
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import minecraft.class01894;
import minecraft.class03556;
import minecraft.class07433;
import minecraft.class07463;
import minecraft.class07468;
import minecraft.class07471;
import org.jspecify.annotations.Nullable;

public class class07469 {
    private final class03556<class07468> N;
    private final Map<class07463, Map<class01894, class07471>> y = Maps.newEnumMap(class07463.class);
    private final Map<class01894, class07471> L = new Object2ObjectArrayMap();
    private final Map<class01894, class07471> u = new Object2ObjectArrayMap();
    private double i;
    private boolean R = true;
    private double M;
    private final Consumer<class07469> B;

    public void L(class07471 class074712) {
        this.L(class074712.N());
        this.R(class074712);
        this.u.put(class074712.N(), class074712);
    }

    public Set<class07471> L() {
        return ImmutableSet.copyOf(this.L.values());
    }

    public boolean L(class01894 class018942) {
        class07471 class074712 = this.L.remove(class018942);
        if (class074712 == null) {
            return false;
        }
        this.N(class074712.L()).remove(class018942);
        this.u.remove(class018942);
        this.i();
        return true;
    }

    public double M() {
        if (this.R) {
            this.M = this.Z();
            this.R = false;
        }
        return this.M;
    }

    public class07469(class03556<class07468> class035562, Consumer<class07469> consumer) {
        this.N = class035562;
        this.B = consumer;
        this.i = ((class07468)class035562.N()).N();
    }

    public class07433 B() {
        return new class07433(this.N, this.i, List.copyOf(this.u.values()));
    }

    private double Z() {
        double d = this.y();
        for (class07471 class074712 : this.y(class07463.field_6328)) {
            d += class074712.y();
        }
        double d2 = d;
        for (class07471 class074713 : this.y(class07463.field_6330)) {
            d2 += d * class074713.y();
        }
        for (class07471 class074713 : this.y(class07463.field_6331)) {
            d2 *= 1.0 + class074713.y();
        }
        return ((class07468)this.N.N()).N(d2);
    }

    protected void i() {
        this.R = true;
        this.B.accept(this);
    }

    public void i(class07471 class074712) {
        this.L(class074712.N());
    }

    public Set<class07471> u() {
        return ImmutableSet.copyOf(this.u.values());
    }

    public void u(class07471 class074712) {
        this.R(class074712);
        this.u.put(class074712.N(), class074712);
    }

    public double y() {
        return this.i;
    }

    private Collection<class07471> y(class07463 class074632) {
        return this.y.getOrDefault(class074632, Map.of()).values();
    }

    public void y(class07471 class074712) {
        this.R(class074712);
    }

    public boolean y(class01894 class018942) {
        return this.L.get(class018942) != null;
    }

    public @Nullable class07471 N(class01894 class018942) {
        return this.L.get(class018942);
    }

    public void N(class07469 class074692) {
        this.i = class074692.i;
        this.L.clear();
        this.L.putAll(class074692.L);
        this.u.clear();
        this.u.putAll(class074692.u);
        this.y.clear();
        class074692.y.forEach((class074632, map) -> this.N((class07463)class074632).putAll((Map<class01894, class07471>)map));
        this.i();
    }

    public void N(class07433 class074332) {
        this.i = class074332.y();
        for (class07471 class074712 : class074332.L()) {
            this.L.put(class074712.N(), class074712);
            this.N(class074712.L()).put(class074712.N(), class074712);
            this.u.put(class074712.N(), class074712);
        }
        this.i();
    }

    public void N(double d) {
        if (d == this.i) {
            return;
        }
        this.i = d;
        this.i();
    }

    public void N(Collection<class07471> collection) {
        for (class07471 class074712 : collection) {
            this.u(class074712);
        }
    }

    Map<class01894, class07471> N(class07463 class074633) {
        return this.y.computeIfAbsent(class074633, class074632 -> new Object2ObjectOpenHashMap());
    }

    public void N(class07471 class074712) {
        class07471 class074713 = this.L.put(class074712.N(), class074712);
        if (class074712 == class074713) {
            return;
        }
        this.N(class074712.L()).put(class074712.N(), class074712);
        this.i();
    }

    public class03556<class07468> N() {
        return this.N;
    }

    private void R(class07471 class074712) {
        if (this.L.putIfAbsent(class074712.N(), class074712) != null) {
            throw new IllegalArgumentException("Modifier is already applied on this attribute!");
        }
        this.N(class074712.L()).put(class074712.N(), class074712);
        this.i();
    }

    public void R() {
        for (class07471 class074712 : this.L()) {
            this.i(class074712);
        }
    }
}

