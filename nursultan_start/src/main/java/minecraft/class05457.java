/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class04111
 *  minecraft.class04129
 *  minecraft.class04711
 *  minecraft.class05952
 *  minecraft.class05957
 *  minecraft.class06378
 *  minecraft.class07297
 *  minecraft.class08122
 *  minecraft.class08137
 *  minecraft.class08967
 *  net.fabricmc.fabric.api.loot.v2.FabricLootPoolBuilder
 *  net.fabricmc.fabric.api.loot.v3.FabricLootPoolBuilder
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import minecraft.class04111;
import minecraft.class04129;
import minecraft.class04711;
import minecraft.class05441;
import minecraft.class05952;
import minecraft.class05957;
import minecraft.class06378;
import minecraft.class07297;
import minecraft.class08122;
import minecraft.class08137;
import minecraft.class08967;
import net.fabricmc.fabric.api.loot.v3.FabricLootPoolBuilder;

public class class05457
implements class07297<class05457>,
class08967<class05457>,
net.fabricmc.fabric.api.loot.v2.FabricLootPoolBuilder,
FabricLootPoolBuilder {
    private final ImmutableList.Builder<class04129> N = ImmutableList.builder();
    private final ImmutableList.Builder<class05957> y = ImmutableList.builder();
    private final ImmutableList.Builder<class08122> L = ImmutableList.builder();
    private class06378 u = class04711.N((float)1.0f);
    private class06378 i = class04711.N((float)0.0f);

    public class05441 L() {
        return new class05441((List<class04129>)this.N.build(), (List<class05957>)this.y.build(), (List<class08122>)this.L.build(), this.u, this.i);
    }

    public class05457 apply(Collection collection) {
        this.L.addAll((Iterable)collection);
        return this.u();
    }

    public class05457 apply(class08122 class081222) {
        this.L.add((Object)class081222);
        return this.u();
    }

    public class05457 with(class04129 class041292) {
        this.N.add((Object)class041292);
        return this.u();
    }

    public class05457 with(Collection collection) {
        this.N.addAll((Iterable)collection);
        return this.u();
    }

    private class05457 u() {
        return this;
    }

    public class05457 N(class08137 class081372) {
        this.L.add((Object)class081372.y());
        return this;
    }

    public class05457 y(class06378 class063782) {
        this.i = class063782;
        return this;
    }

    public class05457 M() {
        return this;
    }

    public class05457 N(class06378 class063782) {
        this.u = class063782;
        return this;
    }

    public class05457 N(class04111<?> class041112) {
        this.N.add((Object)class041112.y());
        return this;
    }

    public class05457 y(class05952 class059522) {
        this.y.add((Object)class059522.build());
        return this;
    }

    public class05457 conditionally(class05957 class059572) {
        this.y.add((Object)class059572);
        return this.u();
    }

    public class05457 conditionally(Collection collection) {
        this.y.addAll((Iterable)collection);
        return this.u();
    }
}

