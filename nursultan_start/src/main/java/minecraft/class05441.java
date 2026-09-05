/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10416
 *  Nursultan.class10419
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class03599
 *  minecraft.class03942
 *  minecraft.class04129
 *  minecraft.class04489
 *  minecraft.class04711
 *  minecraft.class04995
 *  minecraft.class05561
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class06069
 *  minecraft.class06339
 *  minecraft.class06378
 *  minecraft.class06584
 *  minecraft.class07439
 *  minecraft.class07536
 *  minecraft.class08122
 *  net.fabricmc.fabric.mixin.loot.LootPoolAccessor
 *  org.apache.commons.lang3.mutable.MutableInt
 */
package minecraft;

import Nursultan.class10416;
import Nursultan.class10419;
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class03599;
import minecraft.class03942;
import minecraft.class04129;
import minecraft.class04489;
import minecraft.class04711;
import minecraft.class04995;
import minecraft.class05457;
import minecraft.class05561;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class06069;
import minecraft.class06339;
import minecraft.class06378;
import minecraft.class06584;
import minecraft.class07439;
import minecraft.class07536;
import minecraft.class08122;
import net.fabricmc.fabric.mixin.loot.LootPoolAccessor;
import org.apache.commons.lang3.mutable.MutableInt;

public class class05441
implements LootPoolAccessor {
    public static final Codec<class05441> N = RecordCodecBuilder.create(instance -> instance.group((App)class03942.N.listOf().fieldOf("entries").forGetter(class054412 -> class054412.y), (App)class05957.L.listOf().optionalFieldOf("conditions", List.of()).forGetter(class054412 -> class054412.L), (App)class07439.L.listOf().optionalFieldOf("functions", List.of()).forGetter(class054412 -> class054412.u), (App)class06339.N.fieldOf("rolls").forGetter(class054412 -> class054412.i), (App)class06339.N.fieldOf("bonus_rolls").orElse((Object)class04711.N((float)0.0f)).forGetter(class054412 -> class054412.R)).apply(instance, class05441::new));
    public final List<class04129> y;
    public final List<class05957> L;
    private final Predicate<class05908> M;
    public final List<class08122> u;
    private final BiFunction<class06584, class05908, class06584> B;
    public final class06378 i;
    public final class06378 R;

    class05441(List<class04129> list, List<class05957> list2, List<class08122> list3, class06378 class063782, class06378 class063783) {
        this.y = list;
        this.L = list2;
        this.M = class07536.N(list2);
        this.u = list3;
        this.B = class07439.N(list3);
        this.i = class063782;
        this.R = class063783;
    }

    private void y(Consumer<class06584> consumer, class05908 class059082) {
        class06069 class060692 = class059082.y();
        ArrayList arrayList = Lists.newArrayList();
        MutableInt mutableInt = new MutableInt();
        for (class04129 class041292 : this.y) {
            class041292.expand(class059082, class035992 -> {
                int n = class035992.N(class059082.L());
                if (n > 0) {
                    arrayList.add(class035992);
                    mutableInt.add(n);
                }
            });
        }
        int n = arrayList.size();
        if (mutableInt.intValue() == 0 || n == 0) {
            return;
        }
        if (n == 1) {
            ((class03599)arrayList.get(0)).N(consumer, class059082);
            return;
        }
        int n2 = class060692.y(mutableInt.intValue());
        for (class03599 class035993 : arrayList) {
            if ((n2 -= class035993.N(class059082.L())) >= 0) continue;
            class035993.N(consumer, class059082);
            return;
        }
    }

    public void N(Consumer<class06584> consumer, class05908 class059082) {
        if (!this.M.test(class059082)) {
            return;
        }
        Consumer var3 = class08122.N(this.B, consumer, (class05908)class059082);
        int n = this.i.N(class059082) + class04995.y((float)(this.R.y(class059082) * class059082.L()));
        for (int i = 0; i < n; ++i) {
            this.y(var3, class059082);
        }
    }

    public void N(class05561 class055612) {
        int n;
        for (n = 0; n < this.L.size(); ++n) {
            this.L.get(n).N(class055612.N((class04489)new class10416("conditions", n)));
        }
        for (n = 0; n < this.u.size(); ++n) {
            this.u.get(n).N(class055612.N((class04489)new class10416("functions", n)));
        }
        for (n = 0; n < this.y.size(); ++n) {
            this.y.get(n).N(class055612.N((class04489)new class10416("entries", n)));
        }
        this.i.N(class055612.N((class04489)new class10419("rolls")));
        this.R.N(class055612.N((class04489)new class10419("bonus_rolls")));
    }

    public static class05457 N() {
        return new class05457();
    }

    public /* synthetic */ class06378 fabric_getRolls() {
        return this.i;
    }

    public /* synthetic */ List fabric_getEntries() {
        return this.y;
    }

    public /* synthetic */ class06378 fabric_getBonusRolls() {
        return this.R;
    }

    public /* synthetic */ List fabric_getConditions() {
        return this.L;
    }

    public /* synthetic */ List fabric_getFunctions() {
        return this.u;
    }
}

