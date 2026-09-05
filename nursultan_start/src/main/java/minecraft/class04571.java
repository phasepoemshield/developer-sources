/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.floats.FloatArrayList
 *  it.unimi.dsi.fastutil.floats.FloatList
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.floats.FloatArrayList;
import it.unimi.dsi.fastutil.floats.FloatList;
import java.util.List;
import minecraft.class04550;
import minecraft.class04562;
import minecraft.class04564;
import minecraft.class04573;

public final class class04571<C, I extends class04573<C>> {
    private final I N;
    private final class04573<Float> y;
    private final FloatList L = new FloatArrayList();
    private final List<class04562<C, I>> u = Lists.newArrayList();
    private final FloatList i = new FloatArrayList();

    protected class04571(I i) {
        this(i, class04573.y);
    }

    protected class04571(I i, class04573<Float> class045732) {
        this.N = i;
        this.y = class045732;
    }

    private class04571<C, I> N(float f, class04562<C, I> class045622, float f2) {
        if (!this.L.isEmpty() && f <= this.L.getFloat(this.L.size() - 1)) {
            throw new IllegalArgumentException("Please register points in ascending order");
        }
        this.L.add(f);
        this.u.add(class045622);
        this.i.add(f2);
        return this;
    }

    public class04571<C, I> N(float f, class04562<C, I> class045622) {
        return this.N(f, class045622, 0.0f);
    }

    public class04562<C, I> N() {
        if (this.L.isEmpty()) {
            throw new IllegalStateException("No elements added");
        }
        return class04564.N(this.N, this.L.toFloatArray(), ImmutableList.copyOf(this.u), this.i.toFloatArray());
    }

    public class04571<C, I> N(float f, float f2, float f3) {
        return this.N(f, new class04550(this.y.N(Float.valueOf(f2))), f3);
    }

    public class04571<C, I> N(float f, float f2) {
        return this.N(f, new class04550(this.y.N(Float.valueOf(f2))), 0.0f);
    }
}

