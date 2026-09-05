/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09443
 *  Nursultan.class09448
 *  Nursultan.class09449
 *  com.google.gson.JsonElement
 *  com.mojang.datafixers.util.Either
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class00720
 *  minecraft.class00751
 *  minecraft.class01022
 *  minecraft.class01042
 *  minecraft.class01079
 *  minecraft.class01089
 *  minecraft.class01229
 *  minecraft.class01894
 *  minecraft.class01921
 *  minecraft.class03069
 *  minecraft.class03495
 *  minecraft.class03511
 *  minecraft.class03516
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class03932
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class07099
 *  minecraft.class08326
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class09443;
import Nursultan.class09448;
import Nursultan.class09449;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import minecraft.class00720;
import minecraft.class00751;
import minecraft.class01022;
import minecraft.class01042;
import minecraft.class01079;
import minecraft.class01089;
import minecraft.class01196;
import minecraft.class01208;
import minecraft.class01229;
import minecraft.class01894;
import minecraft.class01921;
import minecraft.class03069;
import minecraft.class03495;
import minecraft.class03511;
import minecraft.class03516;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class03932;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class07099;
import minecraft.class08326;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01214<T> {
    private static final Logger y = LogUtils.getLogger();
    public final class01229<T> N;
    private final String L;

    public class01214(class01229<T> class012292, String string) {
        this.N = class012292;
        this.L = string;
    }

    private /* synthetic */ void N(class01208 class012082, Map map, class01894 class018942, class09449 class094492) {
        this.N(class012082, class094492.N()).ifLeft(list -> y.error("Couldn't load tag {} as it is missing following references: {}", (Object)class018942, (Object)list.stream().map(Objects::toString).collect(Collectors.joining(", ")))).ifRight(list -> map.put(class018942, list));
    }

    public static <T> void N(class01089 class010892, class07099<T> class070992) {
        class05946 class059462 = class070992.i();
        class01214<T> class012142 = new class01214<T>(class01229.N(class070992), class04227.u((class05946)class059462));
        class012142.N(class012142.N(class010892)).forEach((class018942, list) -> class070992.N(class03530.N((class05946)class059462, (class01894)class018942), list));
    }

    public static List<class00720<?>> N(class01089 class010892, class01042 class010422) {
        return class010422.method_40311().map(class010122 -> class01214.N(class010892, class010122.y())).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
    }

    public static <T> void N(class03516 class035162, class07099<T> class070992) {
        class035162.N(class070992).y().forEach((arg_0, arg_1) -> class070992.N(arg_0, arg_1));
    }

    public Map<class01894, List<T>> N(Map<class01894, List<class09443>> map) {
        HashMap<class01894, List<T>> hashMap = new HashMap<class01894, List<T>>();
        class09448 class094482 = new class09448(this, hashMap);
        class03495 class034952 = new class03495();
        map.forEach((class018942, list) -> class034952.N(class018942, (class03511)new class09449(list)));
        class034952.N((arg_0, arg_1) -> this.N((class01208)class094482, hashMap, arg_0, arg_1));
        return hashMap;
    }

    private Either<List<class09443>, List<T>> N(class01208<T> class012082, List<class09443> list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList<class09443> arrayList = new ArrayList<class09443>();
        for (class09443 class094432 : list) {
            if (class094432.N().method_26790(class012082, linkedHashSet::add)) continue;
            arrayList.add(class094432);
        }
        return arrayList.isEmpty() ? Either.right(List.copyOf(linkedHashSet)) : Either.left(arrayList);
    }

    public Map<class01894, List<class09443>> N(class01089 class010892) {
        HashMap<class01894, List<class09443>> hashMap = new HashMap<class01894, List<class09443>>();
        class03069 class030692 = class03069.N((String)this.L);
        for (Map.Entry entry : class030692.y(class010892).entrySet()) {
            class01894 class018943 = (class01894)entry.getKey();
            class01894 class018944 = class030692.y(class018943);
            for (class01079 class010792 : (List)entry.getValue()) {
                try {
                    BufferedReader bufferedReader = class010792.method_43039();
                    try {
                        JsonElement jsonElement = class08326.N((Reader)bufferedReader);
                        List list = hashMap.computeIfAbsent(class018944, class018942 -> new ArrayList());
                        class03932 class039322 = (class03932)class03932.N.parse(new Dynamic((DynamicOps)JsonOps.INSTANCE, (Object)jsonElement)).getOrThrow();
                        if (class039322.y()) {
                            list.clear();
                        }
                        String string = class010792.method_14480();
                        class039322.N().forEach(class012152 -> list.add(new class09443(class012152, string)));
                    }
                    finally {
                        if (bufferedReader == null) continue;
                        ((Reader)bufferedReader).close();
                    }
                }
                catch (Exception exception) {
                    y.error("Couldn't read tag list {} from {} in data pack {}", new Object[]{class018944, class018943, class010792.method_14480(), exception});
                }
            }
        }
        return hashMap;
    }

    private static @Nullable class00720<?> N(List<class00720<?>> list, class05946<? extends class00751<?>> class059462) {
        for (class00720<?> class007202 : list) {
            if (class007202.N() != class059462) continue;
            return class007202;
        }
        return null;
    }

    public static List<class01921<?>> N(class01022 class010222, List<class00720<?>> list) {
        ArrayList arrayList = new ArrayList();
        class010222.method_40311().forEach(class010122 -> {
            class00720<?> var3 = class01214.N(list, class010122.N());
            arrayList.add((class01921<?>)(var3 != null ? var3.L() : class010122.y()));
        });
        return arrayList;
    }

    private static <T> Optional<class00720<T>> N(class01089 class010892, class00751<T> class007512) {
        class05946 class059462 = class007512.i();
        class01214<T> class012142 = new class01214<T>(class01229.N(class007512), class04227.u((class05946)class059462));
        class01196<T> class011962 = new class01196<T>(class059462, class01214.N(class007512.i(), class012142.N(class012142.N(class010892))));
        return class011962.y().isEmpty() ? Optional.empty() : Optional.of(class007512.N(class011962));
    }

    private static <T> Map<class03530<T>, List<class03556<T>>> N(class05946<? extends class00751<T>> class059462, Map<class01894, List<class03556<T>>> map) {
        return map.entrySet().stream().collect(Collectors.toUnmodifiableMap(entry -> class03530.N((class05946)class059462, (class01894)((class01894)entry.getKey())), Map.Entry::getValue));
    }
}

