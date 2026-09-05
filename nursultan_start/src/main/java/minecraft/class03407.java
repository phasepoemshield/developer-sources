/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  minecraft.class03047
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.ArrayList;
import java.util.List;
import minecraft.class03047;
import org.jspecify.annotations.Nullable;

public class class03407 {
    private final class03047[] N;
    private int y;

    private List<class03047> L() {
        ArrayList<class03047> arrayList = new ArrayList<class03047>(this.u());
        for (int i = this.N(); i <= this.y(); ++i) {
            arrayList.add(this.y(i));
        }
        return arrayList;
    }

    private int L(int n) {
        return n % this.N.length;
    }

    public class03407(int n) {
        this.N = new class03047[n];
    }

    private class03407(int n, List<class03047> list) {
        this.N = (class03047[])list.toArray(n2 -> new class03047[n]);
        this.y = list.size();
    }

    private int u() {
        return this.y() - this.N() + 1;
    }

    public int y() {
        return this.y - 1;
    }

    public @Nullable class03047 y(int n) {
        return n >= this.N() && n <= this.y() ? this.N[this.L(n)] : null;
    }

    public static Codec<class03407> N(int n) {
        return Codec.list((Codec)class03047.y).comapFlatMap(list -> {
            int n2 = list.size();
            if (n2 > n) {
                return DataResult.error(() -> "Expected: a buffer of size less than or equal to " + n + " but: " + n2 + " is greater than " + n);
            }
            return DataResult.success((Object)new class03407(n, (List<class03047>)list));
        }, class03407::L);
    }

    public void N(class03047 class030472) {
        this.N[this.L((int)this.y++)] = class030472;
    }

    public int N() {
        return Math.max(this.y - this.N.length, 0);
    }
}

