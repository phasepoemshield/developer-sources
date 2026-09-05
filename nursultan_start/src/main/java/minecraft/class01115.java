/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.Long2ObjectFunction
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  minecraft.class01101
 *  minecraft.class01102
 *  minecraft.class01103
 *  minecraft.class01296
 *  minecraft.class07209
 *  minecraft.class07321
 *  net.caffeinemc.mods.lithium.mixin.util.accessors.TransientEntitySectionManagerAccessor
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ObjectFunction;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import minecraft.class01101;
import minecraft.class01102;
import minecraft.class01103;
import minecraft.class01109;
import minecraft.class01122;
import minecraft.class01124;
import minecraft.class01129;
import minecraft.class01131;
import minecraft.class01135;
import minecraft.class01296;
import minecraft.class07209;
import minecraft.class07321;
import net.caffeinemc.mods.lithium.mixin.util.accessors.TransientEntitySectionManagerAccessor;
import org.slf4j.Logger;

public class class01115<T extends class01135>
implements TransientEntitySectionManagerAccessor {
    static final Logger N = LogUtils.getLogger();
    final class01109<T> y;
    final class01131<T> L;
    final class01129<T> u;
    private final LongSet i = new LongOpenHashSet();
    private final class01124<T> R;

    public /* synthetic */ class01129 getCache() {
        return this.u;
    }

    public String L() {
        return this.L.y() + "," + this.u.y() + "," + this.i.size();
    }

    public class01115(Class<T> clazz, class01109<T> class011092) {
        this.L = new class01131();
        this.u = new class01129<T>(clazz, (Long2ObjectFunction<class01102>)((Long2ObjectFunction)l -> this.i.contains(l) ? class01102.field_27291 : class01102.field_27290));
        this.y = class011092;
        this.R = new class01103(this.L, this.u);
    }

    public void y(class07321 class073212) {
        long l = class073212.y();
        this.i.remove(l);
        this.u.y(l).forEach(class011012 -> {
            if (class011012.N(class01102.field_27290).N()) {
                class011012.y().filter(class011352 -> !class011352.method_31747()).forEach(this.y::u);
            }
        });
    }

    public int y() {
        return this.L.y();
    }

    public class01124<T> N() {
        return this.R;
    }

    public void N(T t) {
        this.L.N(t);
        long l = class01296.L((class07209)t.method_24515());
        class01101<T> class011012 = this.u.L(l);
        class011012.N(t);
        t.method_31744(new class01122(this, (class01135)t, l, (class01101)class011012));
        this.y.M(t);
        this.y.L(t);
        if (t.method_31747() || class011012.L().N()) {
            this.y.i(t);
        }
    }

    public void N(class07321 class073212) {
        long l = class073212.y();
        this.i.add(l);
        this.u.y(l).forEach(class011012 -> {
            if (!class011012.N(class01102.field_27291).N()) {
                class011012.y().filter(class011352 -> !class011352.method_31747()).forEach(this.y::i);
            }
        });
    }

    void N(long l, class01101<T> class011012) {
        if (class011012.N()) {
            this.u.i(l);
        }
    }
}

