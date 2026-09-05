/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  minecraft.class00751
 *  minecraft.class01196
 *  minecraft.class01894
 *  minecraft.class02001
 *  minecraft.class02003
 *  minecraft.class02969
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import minecraft.class00751;
import minecraft.class01196;
import minecraft.class01894;
import minecraft.class02001;
import minecraft.class02003;
import minecraft.class02969;
import minecraft.class03516;
import minecraft.class03530;
import minecraft.class03535;
import minecraft.class03556;
import minecraft.class05946;

public class class03525 {
    static <T> class01196<T> N(class00751<T> class007512, class03516 class035162) {
        class05946 class059462 = class007512.i();
        HashMap hashMap = new HashMap();
        class035162.y.forEach((class018942, intList) -> {
            class03530 class035302 = class03530.N(class059462, class018942);
            List list = intList.intStream().mapToObj(arg_0 -> ((class00751)class007512).L(arg_0)).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
            hashMap.put(class035302, list);
        });
        return new class01196(class059462, hashMap);
    }

    private static <T> class03516 N(class00751<T> class007512) {
        HashMap<class01894, IntList> hashMap = new HashMap<class01894, IntList>();
        class007512.U().forEach(class035522 -> {
            IntArrayList intArrayList = new IntArrayList(class035522.y());
            for (class03556 class035562 : class035522) {
                if (class035562.R() != class03535.field_36446) {
                    throw new IllegalStateException("Can't serialize unregistered value " + String.valueOf(class035562));
                }
                intArrayList.add(class007512.N(class035562.N()));
            }
            hashMap.put(class035522.B().y(), (IntList)intArrayList);
        });
        return new class03516(hashMap);
    }

    public static Map<class05946<? extends class00751<?>>, class03516> N(class02003<class02969> class020032) {
        return class02001.y(class020032).map(class010122 -> Pair.of((Object)class010122.N(), (Object)class03525.N(class010122.y()))).filter(pair -> !((class03516)pair.getSecond()).N()).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
    }
}

