/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  com.mojang.logging.LogUtils
 *  minecraft.class03950
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import minecraft.class03950;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03130 {
    private static final Logger field_46904 = LogUtils.getLogger();
    private final Queue<class03950> field_46905;
    private volatile int field_46906;

    public class03130(List<class03950> list) {
        this.field_46905 = Queues.newArrayDeque(list);
        this.field_46906 = this.field_46905.size();
    }

    public int method_54646() {
        return this.field_46906;
    }

    public boolean method_54645() {
        return this.field_46905.isEmpty();
    }

    public @Nullable class03950 method_54642() {
        class03950 class039502 = this.field_46905.poll();
        if (class039502 != null) {
            this.field_46906 = this.field_46905.size();
            return class039502;
        }
        return null;
    }

    public void method_54644(class03950 class039502) {
        this.field_46905.add(class039502);
        this.field_46906 = this.field_46905.size();
    }

    public static class03130 method_54643(int n) {
        int n2 = Math.max(1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3) / class03950.N);
        int n3 = Math.max(1, Math.min(n, n2));
        ArrayList<class03950> arrayList = new ArrayList<class03950>(n3);
        try {
            for (int i = 0; i < n3; ++i) {
                arrayList.add(new class03950());
            }
        }
        catch (OutOfMemoryError outOfMemoryError) {
            field_46904.warn("Allocated only {}/{} buffers", (Object)arrayList.size(), (Object)n3);
            int n4 = Math.min(arrayList.size() * 2 / 3, arrayList.size() - 1);
            for (int i = 0; i < n4; ++i) {
                ((class03950)arrayList.remove(arrayList.size() - 1)).close();
            }
        }
        return new class03130(arrayList);
    }
}

