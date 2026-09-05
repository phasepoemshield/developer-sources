/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.types.templates.Hook$HookFunction
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class01894
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.types.templates.Hook;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Map;
import minecraft.class01894;

class class06531
implements Hook.HookFunction {
    class06531() {
    }

    public <T> T apply(DynamicOps<T> dynamicOps, T t) {
        Dynamic dynamic = new Dynamic(dynamicOps, t);
        return (T)((Dynamic)DataFixUtils.orElse(dynamic.get("CriteriaName").asString().result().map(string -> {
            int n = string.indexOf(58);
            if (n < 0) {
                return Pair.of((Object)"_special", (Object)string);
            }
            try {
                class01894 class018942 = class01894.N((String)string.substring(0, n), (char)'.');
                class01894 class018943 = class01894.N((String)string.substring(n + 1), (char)'.');
                return Pair.of((Object)class018942.toString(), (Object)class018943.toString());
            }
            catch (Exception exception) {
                return Pair.of((Object)"_special", (Object)string);
            }
        }).map(pair -> dynamic.set("CriteriaType", dynamic.createMap((Map)ImmutableMap.of((Object)dynamic.createString("type"), (Object)dynamic.createString((String)pair.getFirst()), (Object)dynamic.createString("id"), (Object)dynamic.createString((String)pair.getSecond()))))), (Object)dynamic)).getValue();
    }
}

