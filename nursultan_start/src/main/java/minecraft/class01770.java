/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  minecraft.class00490
 *  minecraft.class00518
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import minecraft.class00490;
import minecraft.class00518;
import org.jspecify.annotations.Nullable;

class class01770 {
    private final Reference2ObjectOpenHashMap<class00518, class00490> N = new Reference2ObjectOpenHashMap(16, 0.5f);

    Map<class00518, class00490> L() {
        return Collections.unmodifiableMap(this.N);
    }

    class01770() {
    }

    public boolean y(class00518 class005182) {
        return this.N.remove((Object)class005182) != null;
    }

    public Object2IntMap<class00518> y() {
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        this.N.forEach((arg_0, arg_1) -> class01770.N((Object2IntMap)object2IntOpenHashMap, arg_0, arg_1));
        return object2IntOpenHashMap;
    }

    private static /* synthetic */ void N(Object2IntMap object2IntMap, class00518 class005182, class00490 class004902) {
        object2IntMap.put((Object)class005182, class004902.y());
    }

    public @Nullable class00490 N(class00518 class005182) {
        return (class00490)this.N.get((Object)class005182);
    }

    void N(class00518 class005182, class00490 class004902) {
        this.N.put((Object)class005182, (Object)class004902);
    }

    public class00490 N(class00518 class005182, Consumer<class00490> consumer) {
        return (class00490)this.N.computeIfAbsent((Object)class005182, object -> {
            class00490 class004902 = new class00490();
            consumer.accept(class004902);
            return class004902;
        });
    }

    public boolean N() {
        return !this.N.isEmpty();
    }
}

