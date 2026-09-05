/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class01993
 *  minecraft.class04469
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;
import minecraft.class01993;
import minecraft.class03048;
import minecraft.class03058;
import minecraft.class03064;
import minecraft.class04469;
import org.jspecify.annotations.Nullable;

public class class03046 {
    private final @Nullable class01993[] N;
    private int y;
    private int L;
    private @Nullable class04469 u;

    public int L() {
        return this.L;
    }

    public class03046(int n) {
        this.N = new class01993[n];
    }

    public class03064 y() {
        int n = this.N();
        BitSet bitSet = new BitSet(this.N.length);
        ObjectArrayList objectArrayList = new ObjectArrayList(this.N.length);
        for (int i = 0; i < this.N.length; ++i) {
            int n2 = (this.y + i) % this.N.length;
            class01993 class019932 = this.N[n2];
            if (class019932 == null) continue;
            bitSet.set(i, true);
            objectArrayList.add((Object)class019932.y());
            this.N[n2] = class019932.N();
        }
        class03048 class030482 = new class03048((List<class04469>)objectArrayList);
        class03058 class030582 = new class03058(n, bitSet, class030482.N());
        return new class03064(class030482, class030582);
    }

    public void N(class04469 class044692) {
        for (int i = 0; i < this.N.length; ++i) {
            class01993 class019932 = this.N[i];
            if (class019932 == null || !class019932.L() || !class044692.equals((Object)class019932.y())) continue;
            this.N[i] = null;
            break;
        }
    }

    public int N() {
        int n = this.L;
        this.L = 0;
        return n;
    }

    public boolean N(class04469 class044692, boolean bl) {
        if (Objects.equals(class044692, this.u)) {
            return false;
        }
        this.u = class044692;
        this.N(bl ? new class01993(class044692, true) : null);
        return true;
    }

    private void N(@Nullable class01993 class019932) {
        int n = this.y;
        this.y = (n + 1) % this.N.length;
        ++this.L;
        this.N[n] = class019932;
    }
}

