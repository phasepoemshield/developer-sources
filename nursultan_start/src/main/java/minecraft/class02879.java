/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  minecraft.class00720
 *  minecraft.class00751
 *  minecraft.class01022
 *  minecraft.class01042
 *  minecraft.class01214
 *  minecraft.class02001
 *  minecraft.class02003
 *  minecraft.class02017
 *  minecraft.class02965
 *  minecraft.class02982
 *  minecraft.class03078
 *  minecraft.class03516
 *  minecraft.class03785
 *  minecraft.class05946
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07878
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.registry.sync.DynamicRegistriesImpl
 *  net.fabricmc.fabric.mixin.registry.sync.client.ClientRegistriesDynamicRegistriesAccessor
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import minecraft.class00720;
import minecraft.class00751;
import minecraft.class01022;
import minecraft.class01042;
import minecraft.class01214;
import minecraft.class02001;
import minecraft.class02003;
import minecraft.class02017;
import minecraft.class02857;
import minecraft.class02864;
import minecraft.class02892;
import minecraft.class02965;
import minecraft.class02982;
import minecraft.class03078;
import minecraft.class03516;
import minecraft.class03785;
import minecraft.class05946;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07878;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.registry.sync.DynamicRegistriesImpl;
import net.fabricmc.fabric.mixin.registry.sync.client.ClientRegistriesDynamicRegistriesAccessor;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class class02879 {
    private @Nullable class02892 N;
    private @Nullable class02864 y;

    private List N(Operation operation, class02857 class028572, ClientRegistriesDynamicRegistriesAccessor clientRegistriesDynamicRegistriesAccessor, boolean bl) {
        Map var5 = clientRegistriesDynamicRegistriesAccessor.getDynamicRegistries();
        ArrayList<class02965> arrayList = new ArrayList<class02965>((Collection)operation.call(new Object[0]));
        arrayList.removeIf(class029652 -> DynamicRegistriesImpl.SKIP_EMPTY_SYNC_REGISTRIES.contains(class029652.N()) && !var5.containsKey(class029652.N()));
        return arrayList;
    }

    private static void N(class07080 class070802, Map<class05946<? extends class00751<?>>, class02982> map, List<class00720<?>> list) {
        class07074 class070742 = class070802.N("Received Elements and Tags");
        class070742.N("Dynamic Registries", () -> map.entrySet().stream().sorted(Comparator.comparing(entry -> ((class05946)entry.getKey()).N())).map(entry -> String.format(Locale.ROOT, "\n\t\t%s: elements=%d tags=%d", ((class05946)entry.getKey()).N(), ((class02982)entry.getValue()).N().size(), ((class02982)entry.getValue()).y().y())).collect(Collectors.joining()));
        class070742.N("Static Registries", () -> list.stream().sorted(Comparator.comparing(class007202 -> class007202.N().N())).map(class007202 -> String.format(Locale.ROOT, "\n\t\t%s: tags=%d", class007202.N().N(), class007202.y())).collect(Collectors.joining()));
    }

    private class01042 N(class02857 class028572, class02892 class028922, boolean bl) {
        class01022 class010222;
        class02003 var5 = class03785.N();
        class01022 class010223 = var5.y((Object)class03785.field_40491);
        HashMap hashMap = new HashMap();
        class028922.N.forEach((class059462, list) -> hashMap.put((class05946<? extends class00751<?>>)class059462, new class02982(list, class03516.N)));
        ArrayList arrayList = new ArrayList();
        if (this.y != null) {
            this.y.N((? super class05946<? extends class00751<?>> class059463, ? super class03516 class035162) -> {
                if (class035162.N()) {
                    return;
                }
                if (class02001.N((class05946)class059463)) {
                    hashMap.compute((class05946<? extends class00751<?>>)class059463, (class059462, class029822) -> {
                        List list = class029822 != null ? class029822.N() : List.of();
                        return new class02982(list, class035162);
                    });
                } else if (!bl) {
                    arrayList.add(class02879.N(class010223, class059463, class035162));
                }
            });
        }
        List var9 = class01214.N((class01022)class010223, arrayList);
        try {
            class010222 = class03078.N(hashMap, (class02857)class028572, (List)var9, (List)this.N(objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)0, (String)"[]");
                return class03078.L;
            }, class028572, class028922, bl)).method_40316();
        }
        catch (Exception exception) {
            class07080 class070802 = class07080.N((Throwable)exception, (String)"Network Registry Load");
            class02879.N(class070802, hashMap, arrayList);
            throw new class07878(class070802);
        }
        class01022 class010224 = var5.N((Object)class03785.field_40491, new class01022[]{class010222}).N();
        arrayList.forEach(class00720::u);
        return class010224;
    }

    private static <T> class00720<T> N(class01022 class010222, class05946<? extends class00751<? extends T>> class059462, class03516 class035162) {
        class00751 class007512 = class010222.L(class059462);
        return class007512.N(class035162.N(class007512));
    }

    public void N(Map<class05946<? extends class00751<?>>, class03516> map) {
        if (this.y == null) {
            this.y = new class02864();
        }
        map.forEach(this.y::N);
    }

    public void N(class05946<? extends class00751<?>> class059462, List<class02017> list) {
        if (this.N == null) {
            this.N = new class02892();
        }
        this.N.N(class059462, list);
    }

    public class01022 N(class02857 class028572, class01022 class010222, boolean bl) {
        class01022 class010223;
        if (this.N != null) {
            class010223 = this.N(class028572, this.N, bl);
        } else {
            if (this.y != null) {
                this.N(this.y, class010222, !bl);
            }
            class010223 = class010222;
        }
        return class010223.method_40316();
    }

    private void N(class02864 class028642, class01022 class010222, boolean bl) {
        class028642.N((? super class05946<? extends class00751<?>> class059462, ? super class03516 class035162) -> {
            if (bl || class02001.N((class05946)class059462)) {
                class02879.N(class010222, class059462, class035162).u();
            }
        });
    }
}

