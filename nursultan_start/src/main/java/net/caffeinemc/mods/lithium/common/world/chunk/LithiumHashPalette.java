/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.HashCommon
 *  it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap
 *  minecraft.class00667
 *  minecraft.class00750
 *  minecraft.class01657
 *  minecraft.class01816
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07340
 *  minecraft.class07342
 *  minecraft.class07878
 */
package net.caffeinemc.mods.lithium.common.world.chunk;

import it.unimi.dsi.fastutil.HashCommon;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class00667;
import minecraft.class00750;
import minecraft.class01657;
import minecraft.class01816;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07340;
import minecraft.class07342;
import minecraft.class07878;

public class LithiumHashPalette<T>
implements class07340<T> {
    private static final int ABSENT_VALUE = -1;
    private final int indexBits;
    private final Reference2IntOpenHashMap<T> table;
    private T[] entries;
    private int size = 0;

    public static <A> class07340<A> create(int n, List<A> list) {
        return new LithiumHashPalette<A>(n, list);
    }

    private LithiumHashPalette(int n, T[] TArray, Reference2IntOpenHashMap<T> reference2IntOpenHashMap, int n2) {
        this.indexBits = n;
        this.entries = TArray;
        this.table = reference2IntOpenHashMap;
        this.size = n2;
    }

    public LithiumHashPalette(int n) {
        this.indexBits = n;
        int n2 = 1 << n;
        this.entries = new Object[n2];
        this.table = new Reference2IntOpenHashMap(n2, 0.5f);
        this.table.defaultReturnValue(-1);
    }

    public LithiumHashPalette(int n, List<T> list) {
        this(n);
        for (T t : list) {
            this.addEntry(t);
        }
    }

    private void clear() {
        Arrays.fill(this.entries, null);
        this.table.clear();
        this.size = 0;
    }

    private int addEntry(T t) {
        int n = this.size;
        if (n >= this.entries.length) {
            this.resize(this.size);
        }
        this.table.put(t, n);
        this.entries[n] = t;
        ++this.size;
        return n;
    }

    private void resize(int n) {
        this.entries = Arrays.copyOf(this.entries, HashCommon.nextPowerOfTwo((int)(n + 1)));
    }

    public void method_12287(class00667 class006672, class00750<T> class007502) {
        int n = this.size;
        class006672.L(n);
        for (int i = 0; i < n; ++i) {
            class006672.L(class007502.N(this.method_12288(i)));
        }
    }

    public void method_12289(class00667 class006672, class00750<T> class007502) {
        this.clear();
        int n = class006672.E();
        for (int i = 0; i < n; ++i) {
            this.addEntry(class007502.y(class006672.E()));
        }
    }

    public class07340<T> method_39956() {
        return new LithiumHashPalette<Object>(this.indexBits, (Object[])this.entries.clone(), this.table.clone(), this.size);
    }

    public int method_12290(class00750<T> class007502) {
        int n = class01657.N((int)this.size);
        for (int i = 0; i < this.size; ++i) {
            n += class01657.N((int)class007502.N(this.method_12288(i)));
        }
        return n;
    }

    public int method_12291(T t, class07342<T> class073422) {
        int n = this.table.getInt(t);
        if (n == -1) {
            n = this.computeEntry(t, class073422);
        }
        return n;
    }

    public boolean method_19525(Predicate<T> predicate) {
        for (int i = 0; i < this.size; ++i) {
            if (!predicate.test(this.entries[i])) continue;
            return true;
        }
        return false;
    }

    public int method_12197() {
        return this.size;
    }

    public T method_12288(int n) {
        T[] TArray = this.entries;
        T t = null;
        if (n >= 0 && n < TArray.length) {
            t = TArray[n];
        }
        if (t != null) {
            return t;
        }
        return this.recoverMissingPaletteEntryOrCrash(n);
    }

    public List<T> getElements() {
        T[] TArray = Arrays.copyOf(this.entries, this.size);
        return Arrays.asList(TArray);
    }

    private T recoverMissingPaletteEntryOrCrash(int n) {
        try {
            Thread.sleep(1L);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        T[] TArray = this.entries;
        T t = null;
        if (n >= 0 && n < TArray.length) {
            t = TArray[n];
        }
        if (t != null) {
            return t;
        }
        throw this.missingPaletteEntryCrash(n);
    }

    private int computeEntry(T t, class07342<T> class073422) {
        int n = this.addEntry(t);
        if (n >= 1 << this.indexBits) {
            if (class073422 == null) {
                throw new IllegalStateException("Cannot grow");
            }
            n = class073422.onResize(this.indexBits + 1, t);
        }
        return n;
    }

    private class07878 missingPaletteEntryCrash(int n) {
        try {
            throw new class01816(n);
        }
        catch (class01816 class018162) {
            class07080 class070802 = class07080.N((Throwable)class018162, (String)"[Lithium] Getting Palette Entry");
            class07074 class070742 = class070802.N("Chunk section");
            class070742.N("IndexBits", (Object)this.indexBits);
            class070742.N("Entries", (Object)(this.entries.length + " Elements: " + Arrays.toString(this.entries)));
            class070742.N("Table", (Object)(this.table.size() + " Elements: " + String.valueOf(this.table)));
            return new class07878(class070802);
        }
    }
}

