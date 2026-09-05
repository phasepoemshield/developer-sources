/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10104
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectList
 *  minecraft.class01993
 *  minecraft.class04469
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10104;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.util.List;
import minecraft.class01993;
import minecraft.class03048;
import minecraft.class03058;
import minecraft.class04469;
import org.jspecify.annotations.Nullable;

public class class03060 {
    private final int N;
    private final ObjectList<class01993> y = new ObjectArrayList();
    private @Nullable class04469 L;

    public class03060(int n) {
        this.N = n;
        for (int i = 0; i < n; ++i) {
            this.y.add(null);
        }
    }

    public class03048 N(class03058 class030582) throws class10104 {
        this.N(class030582.N());
        ObjectArrayList objectArrayList = new ObjectArrayList(class030582.y().cardinality());
        if (class030582.y().length() > this.N) {
            throw new class10104("Last seen update contained " + class030582.y().length() + " messages, but maximum window size is " + this.N);
        }
        for (int i = 0; i < this.N; ++i) {
            boolean bl = class030582.y().get(i);
            class01993 class019932 = (class01993)this.y.get(i);
            if (bl) {
                if (class019932 == null) {
                    throw new class10104("Last seen update acknowledged unknown or previously ignored message at index " + i);
                }
                this.y.set(i, (Object)class019932.N());
                objectArrayList.add((Object)class019932.y());
                continue;
            }
            if (class019932 != null && !class019932.L()) {
                throw new class10104("Last seen update ignored previously acknowledged message at index " + i + " and signature " + String.valueOf(class019932.y()));
            }
            this.y.set(i, null);
        }
        class03048 class030482 = new class03048((List<class04469>)objectArrayList);
        if (!class030582.N(class030482)) {
            throw new class10104("Checksum mismatch on last seen update: the client and server must have desynced");
        }
        return class030482;
    }

    public void N(int n) throws class10104 {
        int n2 = this.y.size() - this.N;
        if (n < 0 || n > n2) {
            throw new class10104("Advanced last seen window by " + n + " messages, but expected at most " + n2);
        }
        this.y.removeElements(0, n);
    }

    public int N() {
        return this.y.size();
    }

    public void N(class04469 class044692) {
        if (!class044692.equals((Object)this.L)) {
            this.y.add((Object)new class01993(class044692, true));
            this.L = class044692;
        }
    }
}

