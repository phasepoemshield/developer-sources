/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class01894
 *  minecraft.class05074
 *  minecraft.class05441
 *  minecraft.class05457
 *  minecraft.class06929
 *  minecraft.class08122
 *  minecraft.class08137
 *  minecraft.class08967
 *  net.fabricmc.fabric.api.loot.v2.FabricLootTableBuilder
 *  net.fabricmc.fabric.api.loot.v3.FabricLootPoolBuilder
 *  net.fabricmc.fabric.api.loot.v3.FabricLootTableBuilder
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.function.Consumer;
import minecraft.class01894;
import minecraft.class05074;
import minecraft.class05441;
import minecraft.class05457;
import minecraft.class06929;
import minecraft.class08122;
import minecraft.class08137;
import minecraft.class08967;
import net.fabricmc.fabric.api.loot.v2.FabricLootTableBuilder;
import net.fabricmc.fabric.api.loot.v3.FabricLootPoolBuilder;

public class class05062
implements class08967<class05062>,
FabricLootTableBuilder,
net.fabricmc.fabric.api.loot.v3.FabricLootTableBuilder {
    private ImmutableList.Builder<class05441> N = ImmutableList.builder();
    private final ImmutableList.Builder<class08122> y = ImmutableList.builder();
    private class06929 L = class05074.y;
    private Optional<class01894> u = Optional.empty();

    public class05074 L() {
        return new class05074(this.L, this.u, (List)this.N.build(), (List)this.y.build());
    }

    public class05062 apply(class08122 class081222) {
        this.y.add((Object)class081222);
        return this.u();
    }

    public class05062 apply(Collection collection) {
        this.y.addAll((Iterable)collection);
        return this.u();
    }

    public class05062 pool(class05441 class054412) {
        this.N.add((Object)class054412);
        return this.u();
    }

    private class05062 u() {
        return this;
    }

    public class05062 N() {
        return this;
    }

    public class05062 N(class08137 class081372) {
        this.y.add((Object)class081372.y());
        return this;
    }

    public class05062 N(class05457 class054572) {
        this.N.add((Object)class054572.L());
        return this;
    }

    public class05062 N(class06929 class069292) {
        this.L = class069292;
        return this;
    }

    public class05062 N(class01894 class018942) {
        this.u = Optional.of(class018942);
        return this;
    }

    public class05062 pools(Collection collection) {
        this.N.addAll((Iterable)collection);
        return this.u();
    }

    public class05062 modifyPools(Consumer consumer) {
        ArrayList arrayList = new ArrayList(this.N.build());
        ListIterator<class05441> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            class05457 class054572 = FabricLootPoolBuilder.copyOf((class05441)((class05441)listIterator.next()));
            consumer.accept(class054572);
            listIterator.set(class054572.L());
        }
        this.N = ImmutableList.builder();
        this.N.addAll(arrayList);
        return this.u();
    }
}

