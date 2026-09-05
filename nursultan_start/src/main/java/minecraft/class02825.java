/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.OptionalDynamic
 *  minecraft.class00622
 */
package minecraft;

import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.OptionalDynamic;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import minecraft.class00622;

class class02825 {
    private final String y;
    private final int L;
    private Dynamic<?> u;
    private final Dynamic<?> i;
    Dynamic<?> N;

    public boolean L(String string) {
        return this.u.get(string).result().isPresent();
    }

    private class02825(String string, int n, Dynamic<?> dynamic) {
        this.y = class00622.N((String)string);
        this.L = n;
        this.u = dynamic.emptyMap();
        this.N = dynamic.get("tag").orElseEmptyMap();
        this.i = dynamic.remove("tag");
    }

    public boolean y(String string) {
        return this.y.equals(string);
    }

    private static <T> Dynamic<T> N(Dynamic<T> dynamic, Dynamic<?> dynamic2) {
        DynamicOps dynamicOps = dynamic.getOps();
        return dynamicOps.getMap(dynamic.getValue()).flatMap(mapLike -> dynamicOps.mergeToMap(dynamic2.convert(dynamicOps).getValue(), mapLike)).map(object -> new Dynamic(dynamicOps, object)).result().orElse(dynamic);
    }

    public boolean N(Set<String> set) {
        return set.contains(this.y);
    }

    public Dynamic<?> N(String string, Dynamic<?> dynamic, String string2) {
        Optional var4 = this.N(string).result();
        if (var4.isPresent()) {
            return dynamic.set(string2, (Dynamic)var4.get());
        }
        return dynamic;
    }

    public void N(String string, OptionalDynamic<?> optionalDynamic) {
        optionalDynamic.result().ifPresent(dynamic -> {
            this.u = this.u.set(string, dynamic);
        });
    }

    public void N(String string, Dynamic<?> dynamic) {
        this.u = this.u.set(string, dynamic);
    }

    public OptionalDynamic<?> N(String string) {
        OptionalDynamic var2 = this.N.get(string);
        this.N = this.N.remove(string);
        return var2;
    }

    public static Optional<class02825> N(Dynamic<?> dynamic) {
        return dynamic.get("id").asString().apply2stable((string, number) -> new class02825((String)string, number.intValue(), (Dynamic<?>)dynamic.remove("id").remove("Count")), dynamic.get("Count").asNumber()).result();
    }

    public Dynamic<?> N() {
        Dynamic dynamic;
        Dynamic var1 = this.N.emptyMap().set("id", this.N.createString(this.y)).set("count", this.N.createInt(this.L));
        if (!this.N.equals((Object)this.N.emptyMap())) {
            this.u = this.u.set("minecraft:custom_data", this.N);
        }
        if (!this.u.equals((Object)this.N.emptyMap())) {
            dynamic = var1.set("components", this.u);
        }
        return class02825.N(dynamic, this.i);
    }

    public void N(String string, boolean bl, UnaryOperator<Dynamic<?>> unaryOperator) {
        OptionalDynamic var4 = this.N.get(string);
        if (bl && var4.result().isEmpty()) {
            return;
        }
        Dynamic var5 = var4.orElseEmptyMap();
        Dynamic dynamic = (Dynamic)unaryOperator.apply(var5);
        this.N = dynamic.equals((Object)dynamic.emptyMap()) ? this.N.remove(string) : this.N.set(string, dynamic);
    }

    public void N(String string, String string2) {
        this.N(string).result().ifPresent(dynamic -> this.N(string2, (Dynamic<?>)dynamic));
    }

    public void N(String string, String string2, Dynamic<?> dynamic) {
        Optional var4 = this.N(string).result();
        if (var4.isPresent() && !((Dynamic)var4.get()).equals(dynamic)) {
            this.N(string2, (Dynamic)var4.get());
        }
    }
}

