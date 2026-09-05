/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class01066
 *  minecraft.class01079
 *  minecraft.class01089
 *  minecraft.class01603
 *  minecraft.class01622
 *  minecraft.class01894
 *  minecraft.class04414
 *  net.fabricmc.fabric.impl.resource.FabricLifecycledResourceManager
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class01066;
import minecraft.class01079;
import minecraft.class01089;
import minecraft.class01603;
import minecraft.class01622;
import minecraft.class01894;
import minecraft.class03554;
import minecraft.class04414;
import net.fabricmc.fabric.impl.resource.FabricLifecycledResourceManager;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class03545
implements class03554,
FabricLifecycledResourceManager {
    private static final Logger N = LogUtils.getLogger();
    private final Map<String, class01066> y;
    private final List<class01622> u;
    private class01603 i;

    public Map<class01894, List<class01079>> L(String string, Predicate<class01894> predicate) {
        class03545.N(string);
        TreeMap<class01894, List<class01079>> treeMap = new TreeMap<class01894, List<class01079>>();
        for (class01066 class010662 : this.y.values()) {
            treeMap.putAll(class010662.L(string, predicate));
        }
        return treeMap;
    }

    public class03545(class01603 class016032, List<class01622> list) {
        this.u = List.copyOf(list);
        HashMap<String, class01066> hashMap = new HashMap<String, class01066>();
        List list2 = list.stream().flatMap(class016222 -> class016222.method_14406(class016032).stream()).distinct().toList();
        for (class01622 class016223 : list) {
            class04414 class044142 = this.N(class016223);
            Set var8 = class016223.method_14406(class016032);
            Predicate<class01894> predicate = class044142 != null ? class018942 -> class044142.y(class018942.N()) : null;
            for (String string : list2) {
                boolean bl;
                boolean bl2 = var8.contains(string);
                boolean bl3 = bl = class044142 != null && class044142.N(string);
                if (!bl2 && !bl) continue;
                class01066 class010662 = (class01066)hashMap.get(string);
                if (class010662 == null) {
                    class010662 = new class01066(class016032, string);
                    hashMap.put(string, class010662);
                }
                if (bl2 && bl) {
                    class010662.N(class016223, predicate);
                    continue;
                }
                if (bl2) {
                    class010662.N(class016223);
                    continue;
                }
                class010662.N(class016223.method_14409(), predicate);
            }
        }
        this.y = hashMap;
        this.N(class016032, list, null);
    }

    @Override
    public void close() {
        this.u.forEach(class01622::close);
    }

    public Map<class01894, class01079> y(String string, Predicate<class01894> predicate) {
        class03545.N(string);
        TreeMap<class01894, class01079> treeMap = new TreeMap<class01894, class01079>();
        for (class01066 class010662 : this.y.values()) {
            treeMap.putAll(class010662.y(string, predicate));
        }
        return treeMap;
    }

    public Stream<class01622> y() {
        return this.u.stream();
    }

    private void N(class01603 class016032, List list, CallbackInfo callbackInfo) {
        this.i = class016032;
    }

    private @Nullable class04414 N(class01622 class016222) {
        try {
            return (class04414)class016222.method_14407(class04414.N);
        }
        catch (IOException iOException) {
            N.error("Failed to get filter section from pack {}", (Object)class016222.method_14409());
            return null;
        }
    }

    public Set<String> N() {
        return this.y.keySet();
    }

    private static void N(String string) {
        if (string.endsWith("/")) {
            throw new IllegalArgumentException("Trailing slash in path " + string);
        }
    }

    public List<class01079> N(class01894 class018942) {
        class01089 class010892 = (class01089)this.y.get(class018942.y());
        if (class010892 != null) {
            return class010892.N(class018942);
        }
        return List.of();
    }

    public Optional<class01079> method_14486(class01894 class018942) {
        class01089 class010892 = (class01089)this.y.get(class018942.y());
        if (class010892 != null) {
            return class010892.method_14486(class018942);
        }
        return Optional.empty();
    }

    public class01603 fabric$getResourceType() {
        return this.i;
    }
}

