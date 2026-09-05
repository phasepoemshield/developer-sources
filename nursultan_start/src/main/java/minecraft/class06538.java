/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.types.templates.Hook$HookFunction
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 */
package minecraft;

import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.types.templates.Hook;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import minecraft.class06534;

class class06538
implements Hook.HookFunction {
    class06538() {
    }

    public <T> T apply(DynamicOps<T> dynamicOps, T t) {
        Dynamic dynamic = new Dynamic(dynamicOps, t);
        return (T)((Dynamic)DataFixUtils.orElse(dynamic.get("CriteriaType").get().result().flatMap(dynamic2 -> {
            Optional var2 = dynamic2.get("type").asString().result();
            Optional var3 = dynamic2.get("id").asString().result();
            if (var2.isPresent() && var3.isPresent()) {
                String string = (String)var2.get();
                if (string.equals("_special")) {
                    return Optional.of(dynamic.createString((String)var3.get()));
                }
                return Optional.of(dynamic2.createString(class06534.y(string) + ":" + class06534.y((String)var3.get())));
            }
            return Optional.empty();
        }).map(dynamic2 -> dynamic.set("CriteriaName", dynamic2).remove("CriteriaType")), (Object)dynamic)).getValue();
    }
}

