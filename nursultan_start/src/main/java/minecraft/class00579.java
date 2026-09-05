/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  minecraft.class00780
 *  minecraft.class05517
 *  minecraft.class06889
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import minecraft.class00597;
import minecraft.class00602;
import minecraft.class00607;
import minecraft.class00618;
import minecraft.class00780;
import minecraft.class05517;
import minecraft.class06889;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public class class00579 {
    private final Map<class00607<?>, class00597<?>> u = new Reference2ObjectOpenHashMap();
    private final Function<class00607<?>, class00597<?>> i = class006072 -> new class00597(this, (class00607)class006072);
    @Nullable class07299 N;
    @Nullable class06889 y;
    final class00602 L = new class00602();

    public <Value> Value N(class00607<Value> class006072, float f) {
        return (Value)this.u.computeIfAbsent(class006072, this.i).N(class006072, f);
    }

    public void N(class07299 class072992, class06889 class068892) {
        this.N = class072992;
        this.y = class068892;
        this.u.values().removeIf(class00597::N);
        this.L.N();
        class00618.N(class068892.L(0.25), (arg_0, arg_1, arg_2) -> ((class05517)class072992.method_22385()).N(arg_0, arg_1, arg_2), (d, class035562) -> this.L.N(d, ((class00780)class035562.N()).R()));
    }

    public void N() {
        this.N = null;
        this.y = null;
        this.L.N();
        this.u.clear();
    }
}

