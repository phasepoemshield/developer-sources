/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  minecraft.class03079
 *  minecraft.class04469
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayDeque;
import java.util.List;
import minecraft.class03079;
import minecraft.class04469;
import org.jspecify.annotations.Nullable;

public class class03397 {
    public static final int N = -1;
    private static final int y = 128;
    private final @Nullable class04469[] L;

    public class03397(int n) {
        this.L = new class04469[n];
    }

    public void N(class03079 class030792, @Nullable class04469 class044692) {
        List var3 = class030792.u().y();
        ArrayDeque<class04469> arrayDeque = new ArrayDeque<class04469>(var3.size() + 1);
        arrayDeque.addAll(var3);
        if (class044692 != null) {
            arrayDeque.add(class044692);
        }
        this.N(arrayDeque);
    }

    void N(List<class04469> list) {
        this.N(new ArrayDeque<class04469>(list));
    }

    private void N(ArrayDeque<class04469> arrayDeque) {
        ObjectOpenHashSet objectOpenHashSet = new ObjectOpenHashSet(arrayDeque);
        for (int i = 0; !arrayDeque.isEmpty() && i < this.L.length; ++i) {
            class04469 class044692 = this.L[i];
            this.L[i] = arrayDeque.removeLast();
            if (class044692 == null || objectOpenHashSet.contains(class044692)) continue;
            arrayDeque.addFirst(class044692);
        }
    }

    public @Nullable class04469 N(int n) {
        return this.L[n];
    }

    public int N(class04469 class044692) {
        for (int i = 0; i < this.L.length; ++i) {
            if (!class044692.equals((Object)this.L[i])) continue;
            return i;
        }
        return -1;
    }

    public static class03397 N() {
        return new class03397(128);
    }
}

