/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09560
 *  com.mojang.serialization.Lifecycle
 *  minecraft.class00751
 *  minecraft.class01042
 *  minecraft.class01794
 *  minecraft.class01801
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class02066
 *  minecraft.class02074
 *  minecraft.class02076
 *  minecraft.class03529
 *  minecraft.class04112
 *  minecraft.class04132
 *  minecraft.class04144
 *  minecraft.class05946
 *  org.apache.commons.lang3.mutable.MutableObject
 */
package minecraft;

import Nursultan.class09560;
import com.mojang.serialization.Lifecycle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01042;
import minecraft.class01794;
import minecraft.class01801;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class02036;
import minecraft.class02038;
import minecraft.class02039;
import minecraft.class02042;
import minecraft.class02055;
import minecraft.class02059;
import minecraft.class02066;
import minecraft.class02074;
import minecraft.class02076;
import minecraft.class03529;
import minecraft.class04112;
import minecraft.class04132;
import minecraft.class04144;
import minecraft.class05946;
import org.apache.commons.lang3.mutable.MutableObject;

public class class02061 {
    public final List<class02076<?>> N = new ArrayList();

    private class02036 y(class01042 class010422) {
        class02036 class020362 = class02036.N(class010422, this.N.stream().map(class02076::N));
        this.N.forEach(class020762 -> class020762.N(class020362));
        return class020362;
    }

    private class01929 N(class01042 class010422, class01929 class019292, class01794 class017942, Map<class05946<? extends class00751<?>>, class02066<?>> map, class01929 class019293) {
        class02038 class020382 = new class02038();
        MutableObject mutableObject = new MutableObject();
        List list = map.keySet().stream().map(class059462 -> this.N((class02042)class020382, class017942, (class05946)class059462, class019293, class019292, (MutableObject<class01929>)mutableObject)).collect(Collectors.toUnmodifiableList());
        class01929 class019294 = class02061.N(class020382, class010422, list.stream());
        mutableObject.setValue((Object)class019294);
        return class019294;
    }

    public class01929 N(class01042 class010422) {
        class02036 class020362 = this.y(class010422);
        Stream<class01921<?>> stream = this.N.stream().map(class020762 -> class020762.y(class020362).N(class020362.i()));
        class01929 class019292 = class02061.N(class020362.i(), class010422, stream);
        class020362.L();
        class020362.y();
        class020362.u();
        return class019292;
    }

    private static class01929 N(class02038 class020382, class01042 class010422, Stream<class01921<?>> stream) {
        HashMap hashMap = new HashMap();
        class010422.method_40311().forEach(class010122 -> hashMap.put(class010122.N(), class04132.N((class01921)class010122.y())));
        stream.forEach(class019212 -> hashMap.put(class019212.i(), class04132.N((class02038)class020382, (class01921)class019212)));
        return new class02074(hashMap);
    }

    public <T> class02061 N(class05946<? extends class00751<T>> class059462, class02039<T> class020392) {
        return this.N(class059462, Lifecycle.stable(), class020392);
    }

    public <T> class02061 N(class05946<? extends class00751<T>> class059462, Lifecycle lifecycle, class02039<T> class020392) {
        this.N.add(new class02076(class059462, lifecycle, class020392));
        return this;
    }

    static <T> class01921<T> N(class05946<? extends class00751<? extends T>> class059462, Lifecycle lifecycle, class02042<T> class020422, Map<class05946<T>, class03529<T>> map) {
        return new class02059(class020422, class059462, lifecycle, map);
    }

    static <T> class02055<T> N(class01921<T> class019212) {
        return new class09560(class019212, class019212);
    }

    public class04144 N(class01042 class010422, class01929 class019292, class01794 class017942) {
        class02036 class020362 = this.y(class010422);
        HashMap hashMap = new HashMap();
        this.N.stream().map(class020762 -> class020762.y(class020362)).forEach(class020662 -> hashMap.put((class05946<class00751<?>>)class020662.N(), (class02066<?>)class020662));
        Set set = class010422.y().collect(Collectors.toUnmodifiableSet());
        class019292.y().filter(class059462 -> !set.contains(class059462)).forEach(class059462 -> hashMap.putIfAbsent((class05946<class00751<?>>)class059462, (class02066<?>)new class02066(class059462, Lifecycle.stable(), Map.of())));
        Stream<class01921<?>> stream = hashMap.values().stream().map(class020662 -> class020662.N(class020362.i()));
        class01929 class019293 = class02061.N(class020362.i(), class010422, stream);
        class020362.y();
        class020362.u();
        class01929 class019294 = this.N(class010422, class019292, class017942, hashMap, class019293);
        return new class04144(class019294, class019293);
    }

    private <T> class01921<T> N(class02042<T> class020422, class01794 class017942, class05946<? extends class00751<? extends T>> class059462, class01929 class019292, class01929 class019293, MutableObject<class01929> mutableObject) {
        class01801 class018012 = class017942.N(class059462);
        if (class018012 == null) {
            throw new NullPointerException("No cloner for " + String.valueOf(class059462.N()));
        }
        HashMap hashMap = new HashMap();
        class01921 class019212 = class019292.y(class059462);
        class019212.z().forEach(class035292 -> {
            class05946 class059462 = class035292.B();
            class04112 class041122 = new class04112(class020422, class059462);
            class041122.N = () -> class018012.N(class035292.N(), class019292, (class01929)mutableObject.get());
            hashMap.put((class05946)class059462, (class03529)class041122);
        });
        class01921 class019213 = class019293.y(class059462);
        class019213.z().forEach(class035292 -> {
            class05946 class059462 = class035292.B();
            hashMap.computeIfAbsent(class059462, class059463 -> {
                class04112 class041122 = new class04112(class020422, class059462);
                class041122.N = () -> class018012.N(class035292.N(), class019293, (class01929)mutableObject.get());
                return class041122;
            });
        });
        Lifecycle lifecycle = class019212.R().add(class019213.R());
        return class02061.N(class059462, lifecycle, class020422, hashMap);
    }
}

