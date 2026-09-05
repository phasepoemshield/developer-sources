/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  minecraft.class01894
 *  minecraft.class02265
 *  minecraft.class07769
 *  minecraft.class08627
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import minecraft.class01894;
import minecraft.class02265;
import minecraft.class07769;
import minecraft.class08258;
import minecraft.class08627;

public class class08265
implements AutoCloseable {
    private final Int2ObjectMap<class08258> y = new Int2ObjectOpenHashMap();
    final class08627 N;

    private class08258 L(class02265 class022652, class07769 class077692) {
        return (class08258)this.y.compute(class022652.y(), (n, class082582) -> {
            if (class082582 == null) {
                return new class08258(this, (int)n, class077692);
            }
            class082582.N(class077692);
            return class082582;
        });
    }

    public class08265(class08627 class086272) {
        this.N = class086272;
    }

    @Override
    public void close() {
        this.N();
    }

    public class01894 y(class02265 class022652, class07769 class077692) {
        class08258 class082582 = this.L(class022652, class077692);
        class082582.y();
        return class082582.N;
    }

    public void N() {
        ObjectIterator var1 = this.y.values().iterator();
        while (var1.hasNext()) {
            ((class08258)var1.next()).close();
        }
        this.y.clear();
    }

    public void N(class02265 class022652, class07769 class077692) {
        this.L(class022652, class077692).N();
    }
}

