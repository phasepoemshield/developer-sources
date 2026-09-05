/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10416
 *  baritone.api.utils.accessor.ILootTable
 *  com.google.common.collect.Lists
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectListIterator
 *  minecraft.class01281
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class04162
 *  minecraft.class04227
 *  minecraft.class04489
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05062
 *  minecraft.class05441
 *  minecraft.class05561
 *  minecraft.class05908
 *  minecraft.class05925
 *  minecraft.class05927
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06925
 *  minecraft.class06929
 *  minecraft.class07439
 *  minecraft.class07536
 *  minecraft.class08122
 *  net.fabricmc.fabric.api.loot.v3.LootTableEvents
 *  net.fabricmc.fabric.api.loot.v3.LootTableEvents$ModifyDrops
 *  net.fabricmc.fabric.impl.loot.FabricLootTable
 *  net.fabricmc.fabric.impl.loot.LootUtil
 *  net.fabricmc.fabric.mixin.loot.LootTableAccessor
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10416;
import baritone.api.utils.accessor.ILootTable;
import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.datafixers.kinds.App;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import minecraft.class01281;
import minecraft.class01894;
import minecraft.class03556;
import minecraft.class04162;
import minecraft.class04227;
import minecraft.class04489;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05062;
import minecraft.class05441;
import minecraft.class05561;
import minecraft.class05908;
import minecraft.class05925;
import minecraft.class05927;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06925;
import minecraft.class06929;
import minecraft.class07439;
import minecraft.class07536;
import minecraft.class08122;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.fabricmc.fabric.impl.loot.FabricLootTable;
import net.fabricmc.fabric.impl.loot.LootUtil;
import net.fabricmc.fabric.mixin.loot.LootTableAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05074
implements ILootTable,
FabricLootTable,
LootTableAccessor {
    private static final Logger B = LogUtils.getLogger();
    public static final Codec<class05946<class05074>> N = class05946.N((class05946)class04227.yJ);
    public static final class06929 y = class06925.b;
    public static final long L = 0L;
    public static final Codec<class05074> u = Codec.lazyInitialized(() -> RecordCodecBuilder.create(instance -> instance.group((App)class06925.y.lenientOptionalFieldOf("type", (Object)y).forGetter(class050742 -> class050742.Z), (App)class01894.N.optionalFieldOf("random_sequence").forGetter(class050742 -> class050742.z), (App)class05441.N.listOf().optionalFieldOf("pools", List.of()).forGetter(class050742 -> class050742.U), (App)class07439.L.listOf().optionalFieldOf("functions", List.of()).forGetter(class050742 -> class050742.E)).apply(instance, class05074::new)));
    public static final Codec<class03556<class05074>> i = class01281.N((class05946)class04227.yJ, u);
    public static final class05074 R = new class05074(class06925.L, Optional.empty(), List.of(), List.of());
    private final class06929 Z;
    private final Optional<class01894> z;
    private final List<class05441> U;
    private final List<class08122> E;
    private final BiFunction<class06584, class05908, class06584> W;
    @Nullable class03556 M = null;

    private void L(class05908 class059082, Consumer consumer) {
        class05925 var3 = class05908.N((class05074)this);
        if (class059082.y(var3)) {
            Consumer var4 = class08122.N(this.W, (Consumer)consumer, (class05908)class059082);
            Iterator<class05441> var5 = this.U.iterator();
            while (var5.hasNext()) {
                var5.next().N(var4, class059082);
            }
            class059082.L(var3);
        } else {
            B.warn("Detected infinite loop in loot tables");
        }
    }

    class05074(class06929 class069292, Optional<class01894> optional, List<class05441> list, List<class08122> list2) {
        this.Z = class069292;
        this.z = optional;
        this.U = list;
        this.E = list2;
        this.W = class07439.N(list2);
    }

    public static class05062 y() {
        return new class05062();
    }

    public void y(class04162 class041622, Consumer<class06584> consumer) {
        this.N(class041622, class05074.N(class041622.N(), consumer));
    }

    public void y(class05908 class059082, Consumer<class06584> consumer) {
        this.N(class059082, class05074.N(class059082.u(), consumer));
    }

    public void N(class04162 class041622, long l, Consumer<class06584> consumer) {
        this.N(new class05927(class041622).N(l).N(this.z), class05074.N(class041622.N(), consumer));
    }

    public static Consumer<class06584> N(class04782 class047822, Consumer<class06584> consumer) {
        return class065842 -> {
            if (!class065842.N(class047822.method_45162())) {
                return;
            }
            if (class065842.c() < class065842.U()) {
                consumer.accept((class06584)class065842);
            } else {
                class06584 class065843;
                for (int i = class065842.c(); i > 0; i -= class065843.c()) {
                    class065843 = class065842.L(Math.min(class065842.U(), i));
                    consumer.accept(class065843);
                }
            }
        };
    }

    private void N(class05908 class059082, Consumer consumer, Operation operation) {
        if (this.M == null) {
            this.M = LootUtil.getEntryOrDirect((class04782)class059082.u(), (class05074)this);
        }
        ObjectArrayList objectArrayList = new ObjectArrayList();
        Object[] objectArray = new Object[2];
        objectArray[0] = class059082;
        objectArray[1] = ((List)objectArrayList)::add;
        operation.call(objectArray);
        ((LootTableEvents.ModifyDrops)LootTableEvents.MODIFY_DROPS.invoker()).modifyLootTableDrops(this.M, class059082, (List)objectArrayList);
        objectArrayList.forEach(consumer);
    }

    public void N(class04162 class041622, Consumer<class06584> consumer) {
        this.N(new class05927(class041622).N(this.z), consumer);
    }

    public void N(class05908 class059082, Consumer<class06584> consumer) {
        this.N(class059082, consumer, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_47, java.util.function.Consumer]");
            this.L((class05908)objectArray[0], (Consumer)objectArray[1]);
            return null;
        });
    }

    public void N(class05561 class055612) {
        int n;
        for (n = 0; n < this.U.size(); ++n) {
            this.U.get(n).N(class055612.N((class04489)new class10416("pools", n)));
        }
        for (n = 0; n < this.E.size(); ++n) {
            this.E.get(n).N(class055612.N((class04489)new class10416("functions", n)));
        }
    }

    public class06929 N() {
        return this.Z;
    }

    private ObjectArrayList<class06584> N(class05908 class059082) {
        ObjectArrayList objectArrayList = new ObjectArrayList();
        this.y(class059082, arg_0 -> ((ObjectArrayList)objectArrayList).add(arg_0));
        return objectArrayList;
    }

    public ObjectArrayList<class06584> N(class04162 class041622) {
        return this.N(new class05927(class041622).N(this.z));
    }

    public ObjectArrayList<class06584> N(class04162 class041622, long l) {
        return this.N(new class05927(class041622).N(l).N(this.z));
    }

    public ObjectArrayList<class06584> N(class04162 class041622, class06069 class060692) {
        return this.N(new class05927(class041622).N(class060692).N(this.z));
    }

    private List<Integer> N(class06695 class066952, class06069 class060692) {
        ObjectArrayList objectArrayList = new ObjectArrayList();
        for (int i = 0; i < class066952.method_5439(); ++i) {
            if (!class066952.method_5438(i).R()) continue;
            objectArrayList.add((Object)i);
        }
        class07536.L((List)objectArrayList, (class06069)class060692);
        return objectArrayList;
    }

    private void N(ObjectArrayList<class06584> objectArrayList, int n, class06069 class060692) {
        ArrayList arrayList = Lists.newArrayList();
        ObjectListIterator objectListIterator = objectArrayList.iterator();
        while (objectListIterator.hasNext()) {
            class06584 class065842 = (class06584)objectListIterator.next();
            if (class065842.R()) {
                objectListIterator.remove();
                continue;
            }
            if (class065842.c() <= 1) continue;
            arrayList.add(class065842);
            objectListIterator.remove();
        }
        while (n - objectArrayList.size() - arrayList.size() > 0 && !arrayList.isEmpty()) {
            objectListIterator = (class06584)arrayList.remove(class04995.N((class06069)class060692, (int)0, (int)(arrayList.size() - 1)));
            int n2 = class04995.N((class06069)class060692, (int)1, (int)(objectListIterator.c() / 2));
            class06584 class065843 = objectListIterator.N(n2);
            if (objectListIterator.c() > 1 && class060692.Z()) {
                arrayList.add(objectListIterator);
            } else {
                objectArrayList.add((Object)objectListIterator);
            }
            if (class065843.c() > 1 && class060692.Z()) {
                arrayList.add(class065843);
                continue;
            }
            objectArrayList.add((Object)class065843);
        }
        objectArrayList.addAll((Collection)arrayList);
        class07536.L(objectArrayList, (class06069)class060692);
    }

    public void N(class06695 class066952, class04162 class041622, long l) {
        class05908 class059082 = new class05927(class041622).N(l).N(this.z);
        ObjectArrayList<class06584> var6 = this.N(class059082);
        class06069 class060692 = class059082.y();
        List<Integer> var8 = this.N(class066952, class060692);
        this.N(var6, var8.size(), class060692);
        for (class06584 class065842 : var6) {
            if (var8.isEmpty()) {
                B.warn("Tried to over-fill a container");
                return;
            }
            if (class065842.R()) {
                class066952.method_5447(var8.remove(var8.size() - 1).intValue(), class06584.E);
                continue;
            }
            class066952.method_5447(var8.remove(var8.size() - 1).intValue(), class065842);
        }
    }

    public /* synthetic */ List fabric_getPools() {
        return this.U;
    }

    public /* synthetic */ ObjectArrayList invokeGetRandomItems(class05908 class059082) {
        return this.N(class059082);
    }

    public /* synthetic */ Optional fabric_getRandomSequenceId() {
        return this.z;
    }

    public /* synthetic */ List fabric_getFunctions() {
        return this.E;
    }

    public void fabric$setRegistryEntry(class03556 class035562) {
        this.M = class035562;
    }
}

