/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10239
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.Products$P1
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00731
 *  minecraft.class00751
 *  minecraft.class00765
 *  minecraft.class01255
 *  minecraft.class01905
 *  minecraft.class01929
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class03565
 *  minecraft.class04057
 *  minecraft.class04227
 *  minecraft.class04865
 *  minecraft.class05943
 *  minecraft.class05946
 *  minecraft.class05997
 *  minecraft.class06228
 *  minecraft.class07099
 *  minecraft.class07299
 *  minecraft.class07376
 *  minecraft.class07663
 *  minecraft.class07833
 *  minecraft.class07850
 *  minecraft.class08088
 *  net.fabricmc.fabric.impl.dimension.FailSoftMapCodec
 */
package minecraft;

import Nursultan.class10239;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00731;
import minecraft.class00751;
import minecraft.class00765;
import minecraft.class01255;
import minecraft.class01905;
import minecraft.class01929;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class03565;
import minecraft.class03781;
import minecraft.class04057;
import minecraft.class04227;
import minecraft.class04865;
import minecraft.class05943;
import minecraft.class05946;
import minecraft.class05997;
import minecraft.class06228;
import minecraft.class07099;
import minecraft.class07299;
import minecraft.class07376;
import minecraft.class07663;
import minecraft.class07833;
import minecraft.class07850;
import minecraft.class08088;
import net.fabricmc.fabric.impl.dimension.FailSoftMapCodec;

public final class class03764
extends Record {
    private final Map<class05946<class01255>, class01255> dimensions;
    public static final MapCodec<class03764> N = RecordCodecBuilder.mapCodec(instance -> class03764.N(instance, (App)Codec.unboundedMap((Codec)class05946.N((class05946)class04227.yI), (Codec)class01255.N).fieldOf("dimensions").forGetter(class03764::u)).apply(instance, instance.stable(class03764::new)));
    private static final Set<class05946<class01255>> L = ImmutableSet.of((Object)class01255.y, (Object)class01255.L, (Object)class01255.u);
    private static final int u = L.size();

    public boolean L() {
        return this.N() instanceof class07833;
    }

    private static boolean L(class01255 class012552) {
        class04865 class048652;
        class08088 class080882;
        return class012552.N().N(class04057.L) && (class080882 = class012552.y()) instanceof class04865 && (class048652 = (class04865)class080882).N(class05943.M) && class048652.u() instanceof class07663;
    }

    public class03764(Map<class05946<class01255>, class01255> map) {
        if (map.get(class01255.y) == null) {
            throw new IllegalStateException("Overworld settings missing");
        }
        this.dimensions = map;
    }

    public class03764(class00751<class01255> class007512) {
        this(class007512.z().collect(Collectors.toMap(class03529::B, class03529::N)));
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03764.class, "dimensions", "dimensions"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03764.class, "dimensions", "dimensions"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03764.class, "dimensions", "dimensions"}, this);
    }

    public Map<class05946<class01255>, class01255> u() {
        return this.dimensions;
    }

    private static boolean y(class05946<class01255> class059462, class01255 class012552) {
        if (class059462 == class01255.y) {
            return class03764.N(class012552);
        }
        if (class059462 == class01255.L) {
            return class03764.y(class012552);
        }
        if (class059462 == class01255.u) {
            return class03764.L(class012552);
        }
        return false;
    }

    private static boolean y(class01255 class012552) {
        class04865 class048652;
        class08088 class080882;
        return class012552.N().N(class04057.y) && (class080882 = class012552.y()) instanceof class04865 && (class048652 = (class04865)class080882).N(class05943.R) && (class080882 = class048652.u()) instanceof class05997 && ((class05997)class080882).N(class03565.N);
    }

    private static class06228 y(class00751<class01255> class007512) {
        return class007512.M(class01255.y).map(class012552 -> {
            class08088 class080882 = class012552.y();
            if (class080882 instanceof class07833) {
                return class06228.field_40375;
            }
            if (class080882 instanceof class07850) {
                return class06228.field_40374;
            }
            return class06228.field_40373;
        }).orElse(class06228.field_40373);
    }

    public ImmutableSet<class05946<class07299>> y() {
        return (ImmutableSet)this.u().keySet().stream().map(class04227::N).collect(ImmutableSet.toImmutableSet());
    }

    private static Products.P1 N(RecordCodecBuilder.Instance instance, App app) {
        return instance.group((App)new FailSoftMapCodec(class05946.N((class05946)class04227.yI), class01255.N).fieldOf("dimensions").forGetter(class03764::u));
    }

    private static /* synthetic */ void N(class07099 class070992, class10239 class102392) {
        class070992.N(class102392.y(), (Object)class102392.L(), class102392.N());
    }

    public static Lifecycle N(class05946<class01255> class059462, class01255 class012552) {
        return class03764.y(class059462, class012552) ? Lifecycle.stable() : Lifecycle.experimental();
    }

    public class03764 N(class01929 class019292, class08088 class080882) {
        Map<class05946<class01255>, class01255> var4 = class03764.N((class01905<class07376>)class019292.y(class04227.yu), this.dimensions, class080882);
        return new class03764(var4);
    }

    public Optional<class01255> N(class05946<class01255> class059462) {
        return Optional.ofNullable(this.dimensions.get(class059462));
    }

    public class08088 N() {
        class01255 class012552 = this.dimensions.get(class01255.y);
        if (class012552 == null) {
            throw new IllegalStateException("Overworld settings missing");
        }
        return class012552.y();
    }

    public static Map<class05946<class01255>, class01255> N(Map<class05946<class01255>, class01255> map, class03556<class07376> class035562, class08088 class080882) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.putAll(map);
        builder.put((Object)class01255.y, (Object)new class01255(class035562, class080882));
        return builder.buildKeepingLast();
    }

    public static Map<class05946<class01255>, class01255> N(class01905<class07376> class019052, Map<class05946<class01255>, class01255> map, class08088 class080882) {
        class01255 class012552 = map.get(class01255.y);
        class03556 var4 = class012552 == null ? class019052.y(class04057.N) : class012552.N();
        return class03764.N(map, (class03556<class07376>)var4, class080882);
    }

    public class03781 N(class00751<class01255> class007512) {
        Stream<class05946<class01255>> stream = Stream.concat(class007512.B().stream(), this.dimensions.keySet().stream()).distinct();
        ArrayList arrayList = new ArrayList();
        class03764.N(stream).forEach(class059462 -> class007512.M(class059462).or(() -> Optional.ofNullable(this.dimensions.get(class059462))).ifPresent(class012552 -> arrayList.add(new class10239(class059462, class012552))));
        Lifecycle lifecycle = arrayList.size() == u ? Lifecycle.stable() : Lifecycle.experimental();
        class00731 class007312 = new class00731(class04227.yI, lifecycle);
        arrayList.forEach(arg_0 -> class03764.N((class07099)class007312, arg_0));
        class00751 class007513 = class007312.W();
        class06228 class062282 = class03764.y((class00751<class01255>)class007513);
        return new class03781((class00751<class01255>)class007513.W(), class062282);
    }

    public static Stream<class05946<class01255>> N(Stream<class05946<class01255>> stream) {
        return Stream.concat(L.stream(), stream.filter(class059462 -> !L.contains(class059462)));
    }

    private static boolean N(class01255 class012552) {
        class03556 var1 = class012552.N();
        if (!var1.N(class04057.N) && !var1.N(class04057.u)) {
            return false;
        }
        class00765 class007652 = class012552.y().u();
        return !(class007652 instanceof class05997) || ((class05997)class007652).N(class03565.y);
    }
}

