/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  minecraft.class01289
 *  minecraft.class04142
 *  minecraft.class04782
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class07438
 *  net.caffeinemc.mods.lithium.common.ai.MemoryModificationCounter
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Map;
import minecraft.class01289;
import minecraft.class04142;
import minecraft.class04782;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05748;
import minecraft.class07438;
import net.caffeinemc.mods.lithium.common.ai.MemoryModificationCounter;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class05765<E extends class07438>
implements class04142<E> {
    public static final int M = 60;
    protected Map<class05378<?>, class05367> B;
    private class05748 N = class05748.field_18337;
    private long y;
    private final int L;
    private final int u;
    private long i = -1L;
    private boolean R;

    protected void L(class04782 class047822, E e, long l) {
    }

    public class05765(Map<class05378<?>, class05367> map, int n, int n2) {
        this.L = n;
        this.u = n2;
        this.B = map;
        this.N(map, n, n2, null);
    }

    public class05765(Map<class05378<?>, class05367> map, int n) {
        this(map, n, n);
    }

    public class05765(Map<class05378<?>, class05367> map) {
        this(map, 60);
    }

    protected void u(class04782 class047822, E e, long l) {
    }

    protected void y(class04782 class047822, E e, long l) {
    }

    protected boolean N(class04782 class047822, E e) {
        return true;
    }

    protected boolean N(class04782 class047822, E e, long l) {
        return false;
    }

    private void N(Map map, int n, int n2, CallbackInfo callbackInfo) {
        this.B = new Reference2ObjectOpenHashMap(map);
    }

    protected boolean N(long l) {
        return l > this.y;
    }

    public boolean N(class07438 class074382) {
        class01289 var2 = class074382.method_18868();
        long l = ((MemoryModificationCounter)var2).lithium$getModCount();
        if (this.i == l) {
            return this.R;
        }
        this.i = l;
        ObjectIterator objectIterator = ((Reference2ObjectOpenHashMap)this.B).reference2ObjectEntrySet().fastIterator();
        while (objectIterator.hasNext()) {
            Reference2ObjectMap.Entry entry = (Reference2ObjectMap.Entry)objectIterator.next();
            if (var2.N_22((class05378)entry.getKey(), (class05367)entry.getValue())) continue;
            this.R = false;
            return false;
        }
        this.R = true;
        return true;
    }

    public String method_46910() {
        return this.getClass().getSimpleName();
    }

    public final void method_18925(class04782 class047822, E e, long l) {
        this.N = class05748.field_18337;
        this.y(class047822, e, l);
    }

    public final void method_18923(class04782 class047822, E e, long l) {
        if (!this.N(l) && this.N(class047822, e, l)) {
            this.L(class047822, e, l);
        } else {
            this.method_18925(class047822, e, l);
        }
    }

    public class05748 method_18921() {
        return this.N;
    }

    public final boolean method_18922(class04782 class047822, E e, long l) {
        if (this.N((class07438)e) && this.N(class047822, e)) {
            this.N = class05748.field_18338;
            int n = this.L + class047822.method_8409().y(this.u + 1 - this.L);
            this.y = l + (long)n;
            this.u(class047822, e, l);
            return true;
        }
        return false;
    }
}

