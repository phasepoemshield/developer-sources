/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  minecraft.class07049
 *  minecraft.class07536
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import minecraft.class07049;
import minecraft.class07536;
import minecraft.class08397;
import minecraft.class08400;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08418
implements class08400 {
    private static final class08397[] y = class08397.values();
    private static final int L = -1;
    private Set<class08397> u;
    private Map<class08397, List<Consumer<class07049>>> i;
    private Map<class08397, List<Consumer<class07049>>> R;
    private List<Consumer<class07049>> M;
    private int B;

    private Object L(Map map, Object object2, Operation operation) {
        Map<class08397, List<Consumer<class07049>>> var1;
        if (map == null) {
            var1 = this.R = new EnumMap<class08397, List<Consumer<class07049>>>(class08397.class);
        }
        return var1.computeIfAbsent((class08397)((Object)object2), (Function<class08397, List<Consumer<class07049>>>)((Function<Object, Object>)object -> new ArrayList()));
    }

    private boolean L(List list) {
        return list != null;
    }

    public class08418() {
        Class<class08397> var1 = class08397.class;
        this.u = this.N(var1, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[java.lang.Class]");
            return EnumSet.noneOf((Class)objectArray[0]);
        });
        Function<class08397, List> function = class083972 -> new ArrayList();
        Class<class08397> clazz = class08397.class;
        this.i = this.N(clazz, function, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[java.lang.Class, java.util.function.Function]");
            return class07536.N_74((Class)((Class)objectArray[0]), (Function)((Function)objectArray[1]));
        });
        function = class083972 -> new ArrayList();
        clazz = class08397.class;
        this.R = this.N(clazz, function, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[java.lang.Class, java.util.function.Function]");
            return class07536.N_74((Class)((Class)objectArray[0]), (Function)((Function)objectArray[1]));
        });
        this.M = this.N(objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)0, (String)"[]");
            return new ArrayList();
        });
        this.B = -1;
    }

    @Override
    public void y(class08397 class083972, Consumer<class07049> consumer) {
        class08397 class083973 = class083972;
        Map<class08397, List<Consumer<class07049>>> var3 = this.R;
        ((List)this.L(var3, (Object)class083973, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[java.util.Map, java.lang.Object]");
            return ((Map)objectArray[0]).get(objectArray[1]);
        })).add(consumer);
    }

    private Object y(Map map, Object object2, Operation operation) {
        Map<class08397, List<Consumer<class07049>>> var1;
        if (map == null) {
            var1 = this.i = new EnumMap<class08397, List<Consumer<class07049>>>(class08397.class);
        }
        return var1.computeIfAbsent((class08397)((Object)object2), (Function<class08397, List<Consumer<class07049>>>)((Function<Object, Object>)object -> new ArrayList()));
    }

    private boolean y(List list) {
        return list != null;
    }

    @Override
    public void N(class08397 class083972, Consumer<class07049> consumer) {
        class08397 class083973 = class083972;
        Map<class08397, List<Consumer<class07049>>> var3 = this.i;
        ((List)this.y(var3, (Object)class083973, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[java.util.Map, java.lang.Object]");
            return ((Map)objectArray[0]).get(objectArray[1]);
        })).add(consumer);
    }

    public void N(int n) {
        if (this.B != n) {
            this.B = n;
            this.N();
        }
    }

    public void N(class07049 class070492) {
        this.N();
        List<Consumer<class07049>> var4 = this.M;
        for (Consumer consumer : this.N(var4)) {
            if (!class070492.method_5805()) break;
            consumer.accept(class070492);
        }
        if (this.y(var4 = this.M)) {
            var4.clear();
        }
        this.B = -1;
    }

    private void N() {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class08397[] class08397Array = y;
        int n = class08397Array.length;
        for (int i = 0; i < n; ++i) {
            class08397 class083972;
            Object object = class083972 = class08397Array[i];
            List list = this.i;
            List list2 = (List)this.N((Map)((Object)list), object, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[java.util.Map, java.lang.Object]");
                return ((Map)objectArray[0]).get(objectArray[1]);
            });
            object = list2;
            list = this.M;
            this.N(list, (Collection)object, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[java.util.List, java.util.Collection]");
                return ((List)objectArray[0]).addAll((Collection)objectArray[1]);
            });
            list = list2;
            if (this.L(list)) {
                list.clear();
            }
            if (this.N((Set)((Object)(list = this.u)), object = class083972, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[java.util.Set, java.lang.Object]");
                return ((Set)objectArray[0]).remove(objectArray[1]);
            })) {
                this.M.add(class083972.N());
            }
            object = class083972;
            list = this.R;
            List list3 = (List)this.N((Map)((Object)list), object, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[java.util.Map, java.lang.Object]");
                return ((Map)objectArray[0]).get(objectArray[1]);
            });
            object = list3;
            list = this.M;
            this.N(list, (Collection)object, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[java.util.List, java.util.Collection]");
                return ((List)objectArray[0]).addAll((Collection)objectArray[1]);
            });
            list = list3;
            if (!this.L(list)) continue;
            list.clear();
        }
    }

    @Override
    public void N(class08397 class083972) {
        this.N(class083972, (CallbackInfo)null);
        this.u.add(class083972);
    }

    private boolean N(Set set, Object object, Operation operation) {
        if (set == null) {
            return false;
        }
        return (Boolean)operation.call(new Object[]{set, object});
    }

    private void N(CallbackInfo callbackInfo) {
        if (!(this.u != null && !this.u.isEmpty() || this.i != null && !this.i.isEmpty() || this.R != null && !this.R.isEmpty())) {
            callbackInfo.cancel();
            return;
        }
        if (this.M == null) {
            this.M = new ArrayList<Consumer<class07049>>();
        }
    }

    private List N(List list) {
        return list == null ? Collections.emptyList() : list;
    }

    private ArrayList N(Operation operation) {
        return null;
    }

    private EnumSet N(Class clazz, Operation operation) {
        return null;
    }

    private Map<class08397, List<Consumer<class07049>>> N(Class clazz, Function function, Operation operation) {
        return null;
    }

    private void N(class08397 class083972, CallbackInfo callbackInfo) {
        if (this.u == null) {
            this.u = EnumSet.noneOf(class08397.class);
        }
    }

    private Object N(Map map, Object object, Operation operation) {
        if (map == null) {
            return null;
        }
        return operation.call(new Object[]{map, object});
    }

    private boolean N(List list, Collection collection, Operation operation) {
        if (collection != null && !collection.isEmpty()) {
            return (Boolean)operation.call(new Object[]{list, collection});
        }
        return false;
    }
}

