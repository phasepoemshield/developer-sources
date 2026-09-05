/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.Hook$HookFunction
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00622
 *  minecraft.class01894
 *  minecraft.class06962
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.Hook;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import minecraft.class00622;
import minecraft.class01894;
import minecraft.class06531;
import minecraft.class06538;
import minecraft.class06962;

public class class06534
extends class00622 {
    public static final String y = "_special";
    protected static final Hook.HookFunction L = new class06531();
    protected static final Hook.HookFunction u = new class06538();

    public class06534(int n, Schema schema) {
        super(n, schema);
    }

    public static String y(String string) {
        class01894 class018942 = class01894.L((String)string);
        return class018942 != null ? class018942.y() + "." + class018942.N() : string;
    }

    protected static Map<String, Supplier<TypeTemplate>> N(Schema schema) {
        Supplier<Object> supplier = () -> DSL.optionalFields((String)"id", (TypeTemplate)class06962.K.in(schema));
        Supplier<Object> supplier2 = () -> DSL.optionalFields((String)"id", (TypeTemplate)class06962.q.in(schema));
        Supplier<Object> supplier3 = () -> DSL.optionalFields((String)"id", (TypeTemplate)class06962.I.in(schema));
        HashMap hashMap = Maps.newHashMap();
        hashMap.put("minecraft:mined", supplier2);
        hashMap.put("minecraft:crafted", supplier);
        hashMap.put("minecraft:used", supplier);
        hashMap.put("minecraft:broken", supplier);
        hashMap.put("minecraft:picked_up", supplier);
        hashMap.put("minecraft:dropped", supplier);
        hashMap.put("minecraft:killed", supplier3);
        hashMap.put("minecraft:killed_by", supplier3);
        hashMap.put("minecraft:custom", () -> DSL.optionalFields((String)"id", (TypeTemplate)DSL.constType((Type)class06534.N())));
        hashMap.put(y, () -> DSL.optionalFields((String)"id", (TypeTemplate)DSL.constType((Type)DSL.string())));
        return hashMap;
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        Supplier<TypeTemplate> supplier = () -> DSL.compoundList((TypeTemplate)class06962.K.in(schema), (TypeTemplate)DSL.constType((Type)DSL.intType()));
        schema.registerType(false, class06962.B, () -> DSL.optionalFields((String)"stats", (TypeTemplate)DSL.optionalFields((Pair[])new Pair[]{Pair.of((Object)"minecraft:mined", (Object)DSL.compoundList((TypeTemplate)class06962.q.in(schema), (TypeTemplate)DSL.constType((Type)DSL.intType()))), Pair.of((Object)"minecraft:crafted", (Object)((TypeTemplate)supplier.get())), Pair.of((Object)"minecraft:used", (Object)((TypeTemplate)supplier.get())), Pair.of((Object)"minecraft:broken", (Object)((TypeTemplate)supplier.get())), Pair.of((Object)"minecraft:picked_up", (Object)((TypeTemplate)supplier.get())), Pair.of((Object)"minecraft:dropped", (Object)((TypeTemplate)supplier.get())), Pair.of((Object)"minecraft:killed", (Object)DSL.compoundList((TypeTemplate)class06962.I.in(schema), (TypeTemplate)DSL.constType((Type)DSL.intType()))), Pair.of((Object)"minecraft:killed_by", (Object)DSL.compoundList((TypeTemplate)class06962.I.in(schema), (TypeTemplate)DSL.constType((Type)DSL.intType()))), Pair.of((Object)"minecraft:custom", (Object)DSL.compoundList((TypeTemplate)DSL.constType((Type)class06534.N()), (TypeTemplate)DSL.constType((Type)DSL.intType())))})));
        Map<String, Supplier<TypeTemplate>> map3 = class06534.N(schema);
        schema.registerType(false, class06962.c, () -> DSL.hook((TypeTemplate)DSL.optionalFields((String)"CriteriaType", (TypeTemplate)DSL.taggedChoiceLazy((String)"type", (Type)DSL.string(), (Map)map3), (String)"DisplayName", (TypeTemplate)class06962.O.in(schema)), (Hook.HookFunction)L, (Hook.HookFunction)u));
    }
}

