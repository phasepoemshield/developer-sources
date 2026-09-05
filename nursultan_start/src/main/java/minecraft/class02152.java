/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  minecraft.class00143
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class04494
 *  minecraft.class04531
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05744
 *  minecraft.class05765
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07955
 *  net.caffeinemc.mods.lithium.common.util.collections.LongJumpChoiceList
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import minecraft.class00143;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class02135;
import minecraft.class02146;
import minecraft.class04494;
import minecraft.class04531;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05744;
import minecraft.class05765;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07955;
import net.caffeinemc.mods.lithium.common.util.collections.LongJumpChoiceList;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class02152<E extends class07079>
extends class05765<E> {
    protected static final int N = 20;
    private static final int W = 40;
    protected static final int y = 8;
    private static final int m = 200;
    private static final List<Integer> P = Lists.newArrayList((Object[])new Integer[]{65, 70, 75, 80});
    private final class02135 s;
    protected final int L;
    protected final int u;
    protected final float i;
    protected List<class02146> R = Lists.newArrayList();
    protected Optional<class06889> Z = Optional.empty();
    protected @Nullable class06889 z;
    protected int U;
    protected long E;
    private final Function<E, class04891> T;
    private final BiPredicate<E, class07209> b;

    protected void L(class04782 class047822, E e, long l) {
        if (this.z != null) {
            if (l - this.E >= 40L) {
                e.method_36456(((class07438)e).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue());
                e.method_35054(true);
                double d = this.z.M();
                double d2 = d + (double)e.method_37416();
                e.method_18799(this.z.L(d2 / d));
                e.method_18868().N(class05378.C, (Object)true);
                class047822.method_43129(null, e, this.T.apply(e), class04911.field_15254, 1.0f, 1.0f);
            }
        } else {
            --this.U;
            this.u(class047822, e, l);
        }
    }

    public class02152(class02135 class021352, int n, int n2, float f, Function<E, class04891> function) {
        this(class021352, n, n2, f, function, class02152::N);
    }

    public class02152(class02135 class021352, int n, int n2, float f, Function<E, class04891> function, BiPredicate<E, class07209> biPredicate) {
        super((Map)ImmutableMap.of((Object)class05378.P, (Object)class05367.field_18458, (Object)class05378.f, (Object)class05367.field_18457, (Object)class05378.C, (Object)class05367.field_18457), 200);
        this.s = class021352;
        this.L = n;
        this.u = n2;
        this.i = f;
        this.T = function;
        this.b = biPredicate;
    }

    protected void u(class04782 class047822, E e, long l) {
        while (!this.R.isEmpty()) {
            class06889 class068892;
            class06889 class068893;
            class07209 class072092;
            Optional<class02146> var5 = this.N(class047822);
            if (var5.isEmpty() || !this.N(class047822, e, class072092 = var5.get().N()) || (class068893 = this.N((class07079)e, class068892 = class06889.y((class00753)class072092))) == null) continue;
            e.method_18868().N(class05378.P, (Object)new class05744(class072092));
            class00143 class001432 = e.f().N(class072092, 0, 8);
            if (class001432 != null && class001432.z()) continue;
            this.z = class068893;
            this.E = l;
            return;
        }
    }

    protected void y(class04782 class047822, E e, long l) {
        this.z = null;
        this.U = 20;
        this.Z = Optional.of(e.method_73189());
        class07209 class072092 = e.method_24515();
        int n = class072092.method_10263();
        int n2 = class072092.method_10264();
        int n3 = class072092.method_10260();
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class047822, (class07079)e, l, callbackInfo, class072092);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.R = class07209.method_17962((int)(n - this.u), (int)(n2 - this.L), (int)(n3 - this.u), (int)(n + this.u), (int)(n2 + this.L), (int)(n3 + this.u)).filter(class072093 -> !class072093.equals((Object)class072092)).map(class072093 -> new class02146(class072093.method_10062(), class04995.L((double)class072092.method_10262((class00753)class072093)))).collect(Collectors.toCollection(Lists::newArrayList));
    }

    private void N(Optional optional, Consumer consumer) {
        if (!(this.R instanceof LongJumpChoiceList)) {
            optional.ifPresent(consumer);
        }
    }

    private void N(class04782 class047822, class07079 class070792, long l, CallbackInfo callbackInfo, class07209 class072092) {
        if (this.u < 128 && this.L < 128) {
            this.R = LongJumpChoiceList.forCenter((class07209)class072092, (byte)((byte)this.u), (byte)((byte)this.L));
            callbackInfo.cancel();
        }
    }

    private Optional N(class06069 class060692, List list, ToIntFunction toIntFunction, Operation operation) {
        if (list instanceof LongJumpChoiceList) {
            return Optional.ofNullable(((LongJumpChoiceList)list).removeRandomWeightedByDistanceSq(class060692));
        }
        return (Optional)operation.call(new Object[]{class060692, list, toIntFunction});
    }

    protected Optional<class02146> N(class04782 class047822) {
        ToIntFunction<class02146> toIntFunction = class02146::y;
        List<class02146> var4 = this.R;
        Object object = class047822.field_9229;
        Optional optional = this.N((class06069)object, var4, toIntFunction, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_5819, java.util.List, java.util.function.ToIntFunction]");
            Object[] objectArray2 = objectArray;
            return class04531.N((class06069)((class06069)objectArray[0]), (List)((List)objectArray2[1]), (ToIntFunction)((ToIntFunction)objectArray2[2]));
        });
        Consumer<class02146> consumer = this.R::remove;
        object = optional;
        this.N((Optional)object, consumer);
        return optional;
    }

    protected boolean N(class04782 class047822, class07079 class070792, long l) {
        boolean bl;
        boolean bl2 = bl = this.Z.isPresent() && this.Z.get().equals((Object)class070792.method_73189()) && this.U > 0 && !class070792.method_5799() && (this.z != null || !this.R.isEmpty());
        if (!bl && class070792.method_18868().L(class05378.C).isEmpty()) {
            class070792.method_18868().N(class05378.f, (Object)(this.s.N(class047822.field_9229) / 2));
            class070792.method_18868().y(class05378.P);
        }
        return bl;
    }

    protected boolean N(class04782 class047822, class07079 class070792) {
        boolean bl;
        boolean bl2 = bl = class070792.method_24828() && !class070792.method_5799() && !class070792.method_5771() && !class047822.method_8320(class070792.method_24515()).N(class00869.TM);
        if (!bl) {
            class070792.method_18868().N(class05378.f, (Object)(this.s.N(class047822.field_9229) / 2));
        }
        return bl;
    }

    public static <E extends class07079> boolean N(E e, class07209 class072092) {
        class07209 class072093;
        class07299 class072992 = e.method_73183();
        return class072992.method_8320(class072093 = class072092.method_10074()).t() && e.N(class07955.N(e, (class07209)class072092)) == 0.0f;
    }

    protected @Nullable class06889 N(class07079 class070792, class06889 class068892) {
        ArrayList arrayList = Lists.newArrayList(P);
        Collections.shuffle(arrayList);
        float f = (float)(class070792.method_45325(class05298.T) * (double)this.i);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int n = (Integer)iterator.next();
            Optional var7 = class04494.N((class07079)class070792, (class06889)class068892, (float)f, (int)n, (boolean)true);
            if (!var7.isPresent()) continue;
            return (class06889)var7.get();
        }
        return null;
    }

    private boolean N(class04782 class047822, E e, class07209 class072092) {
        class07209 class072093 = e.method_24515();
        int n = class072093.method_10263();
        int n2 = class072093.method_10260();
        if (n == class072092.method_10263() && n2 == class072092.method_10260()) {
            return false;
        }
        return this.b.test(e, class072092);
    }
}

