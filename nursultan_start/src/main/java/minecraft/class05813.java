/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.ints.IntList
 *  it.unimi.dsi.fastutil.ints.IntListIterator
 *  java.lang.MatchException
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.ArrayList;
import java.util.Arrays;
import minecraft.class05819;
import minecraft.class05821;
import minecraft.class05823;
import minecraft.class05830;
import org.jspecify.annotations.Nullable;

final class class05813 {
    private int N;
    private final @Nullable class05821[] y = new class05821[16];
    private final Dynamic<?> L;
    private final int u;
    private final int i;
    private final Int2ObjectMap<Dynamic<?>> R = new Int2ObjectLinkedOpenHashMap(16);

    private @Nullable Dynamic<?> L(int n) {
        return (Dynamic)this.R.remove(n);
    }

    public class05813(Dynamic<?> dynamic) {
        this.L = dynamic;
        this.u = dynamic.get("xPos").asInt(0) << 4;
        this.i = dynamic.get("zPos").asInt(0) << 4;
        dynamic.get("TileEntities").asStreamOpt().ifSuccess(stream -> stream.forEach(dynamic -> {
            int n;
            int n2 = dynamic.get("x").asInt(0) - this.u & 0xF;
            int n3 = dynamic.get("y").asInt(0);
            int n4 = n3 << 8 | (n = dynamic.get("z").asInt(0) - this.i & 0xF) << 4 | n2;
            if (this.R.put(n4, dynamic) != null) {
                class05819.N.warn("In chunk: {}x{} found a duplicate block entity at position: [{}, {}, {}]", new Object[]{this.u, this.i, n2, n3, n});
            }
        }));
        boolean bl = dynamic.get("convertedFromAlphaFormat").asBoolean(false);
        dynamic.get("Sections").asStreamOpt().ifSuccess(stream -> stream.forEach(dynamic -> {
            class05821 class058212 = new class05821((Dynamic<?>)dynamic);
            this.N = class058212.y(this.N);
            this.y[class058212.L] = class058212;
        }));
        for (class05821 class058212 : this.y) {
            if (class058212 == null) continue;
            block30: for (Int2ObjectMap.Entry entry : class058212.N.int2ObjectEntrySet()) {
                int n = class058212.L << 12;
                switch (entry.getIntKey()) {
                    case 2: {
                        Object object;
                        Dynamic<?> var12;
                        int n2;
                        IntListIterator intListIterator = ((IntList)entry.getValue()).iterator();
                        while (intListIterator.hasNext()) {
                            n2 = (Integer)intListIterator.next();
                            var12 = this.N(n2 |= n);
                            if (!"minecraft:grass_block".equals(class05819.N(var12)) || !"minecraft:snow".equals(object = class05819.N(this.N(class05813.N(n2, class05823.field_15863)))) && !"minecraft:snow_layer".equals(object)) continue;
                            this.N(n2, class05830.i);
                        }
                        continue block30;
                    }
                    case 3: {
                        Object object;
                        Dynamic<?> var12;
                        int n2;
                        IntListIterator intListIterator = ((IntList)entry.getValue()).iterator();
                        while (intListIterator.hasNext()) {
                            n2 = (Integer)intListIterator.next();
                            var12 = this.N(n2 |= n);
                            if (!"minecraft:podzol".equals(class05819.N(var12)) || !"minecraft:snow".equals(object = class05819.N(this.N(class05813.N(n2, class05823.field_15863)))) && !"minecraft:snow_layer".equals(object)) continue;
                            this.N(n2, class05830.u);
                        }
                        continue block30;
                    }
                    case 110: {
                        Object object;
                        Dynamic<?> var12;
                        int n2;
                        IntListIterator intListIterator = ((IntList)entry.getValue()).iterator();
                        while (intListIterator.hasNext()) {
                            n2 = (Integer)intListIterator.next();
                            var12 = this.N(n2 |= n);
                            if (!"minecraft:mycelium".equals(class05819.N(var12)) || !"minecraft:snow".equals(object = class05819.N(this.N(class05813.N(n2, class05823.field_15863)))) && !"minecraft:snow_layer".equals(object)) continue;
                            this.N(n2, class05830.R);
                        }
                        continue block30;
                    }
                    case 25: {
                        Object object;
                        Dynamic<?> var12;
                        int n2;
                        IntListIterator intListIterator = ((IntList)entry.getValue()).iterator();
                        while (intListIterator.hasNext()) {
                            n2 = (Integer)intListIterator.next();
                            var12 = this.L(n2 |= n);
                            if (var12 == null) continue;
                            object = Boolean.toString(var12.get("powered").asBoolean(false)) + (byte)Math.min(Math.max(var12.get("note").asInt(0), 0), 24);
                            this.N(n2, class05830.s.getOrDefault(object, class05830.s.get("false0")));
                        }
                        continue block30;
                    }
                    case 26: {
                        Object object;
                        Object var13;
                        Dynamic<?> var12;
                        int n2;
                        IntListIterator intListIterator = ((IntList)entry.getValue()).iterator();
                        while (intListIterator.hasNext()) {
                            int n3;
                            n2 = (Integer)intListIterator.next();
                            var12 = this.y(n2 |= n);
                            var13 = this.N(n2);
                            if (var12 == null || (n3 = var12.get("color").asInt(0)) == 14 || n3 < 0 || n3 >= 16 || !class05830.T.containsKey(object = class05819.N(var13, "facing") + class05819.N(var13, "occupied") + class05819.N(var13, "part") + n3)) continue;
                            this.N(n2, class05830.T.get(object));
                        }
                        continue block30;
                    }
                    case 176: 
                    case 177: {
                        Object object;
                        Object var13;
                        Dynamic<?> var12;
                        int n2;
                        IntListIterator intListIterator = ((IntList)entry.getValue()).iterator();
                        while (intListIterator.hasNext()) {
                            int n4;
                            n2 = (Integer)intListIterator.next();
                            var12 = this.y(n2 |= n);
                            var13 = this.N(n2);
                            if (var12 == null || (n4 = var12.get("Base").asInt(0)) == 15 || n4 < 0 || n4 >= 16 || !class05830.b.containsKey(object = class05819.N(var13, entry.getIntKey() == 176 ? "rotation" : "facing") + "_" + n4)) continue;
                            this.N(n2, class05830.b.get(object));
                        }
                        continue block30;
                    }
                    case 86: {
                        Object var13;
                        Dynamic<?> var12;
                        int n2;
                        IntListIterator intListIterator = ((IntList)entry.getValue()).iterator();
                        while (intListIterator.hasNext()) {
                            n2 = (Integer)intListIterator.next();
                            var12 = this.N(n2 |= n);
                            if (!"minecraft:carved_pumpkin".equals(class05819.N(var12)) || !"minecraft:grass_block".equals(var13 = class05819.N(this.N(class05813.N(n2, class05823.field_15858)))) && !"minecraft:dirt".equals(var13)) continue;
                            this.N(n2, class05830.L);
                        }
                        continue block30;
                    }
                    case 140: {
                        Object var13;
                        Dynamic<?> var12;
                        int n2;
                        IntListIterator intListIterator = ((IntList)entry.getValue()).iterator();
                        while (intListIterator.hasNext()) {
                            n2 = (Integer)intListIterator.next();
                            var12 = this.L(n2 |= n);
                            if (var12 == null) continue;
                            var13 = var12.get("Item").asString("") + var12.get("Data").asInt(0);
                            this.N(n2, class05830.W.getOrDefault(var13, class05830.W.get("minecraft:air0")));
                        }
                        continue block30;
                    }
                    case 144: {
                        Object object;
                        Object var13;
                        Dynamic<?> var12;
                        int n2;
                        IntListIterator intListIterator = ((IntList)entry.getValue()).iterator();
                        while (intListIterator.hasNext()) {
                            n2 = (Integer)intListIterator.next();
                            var12 = this.y(n2 |= n);
                            if (var12 == null) continue;
                            var13 = String.valueOf(var12.get("SkullType").asInt(0));
                            String string = class05819.N(this.N(n2), "facing");
                            object = "up".equals(string) || "down".equals(string) ? "" + var13 + var12.get("Rot").asInt(0) : var13 + string;
                            var12.remove("SkullType");
                            var12.remove("facing");
                            var12.remove("Rot");
                            this.N(n2, class05830.m.getOrDefault(object, class05830.m.get("0north")));
                        }
                        continue block30;
                    }
                    case 64: 
                    case 71: 
                    case 193: 
                    case 194: 
                    case 195: 
                    case 196: 
                    case 197: {
                        Object var13;
                        Dynamic<?> var12;
                        int n2;
                        IntListIterator intListIterator = ((IntList)entry.getValue()).iterator();
                        while (intListIterator.hasNext()) {
                            n2 = (Integer)intListIterator.next();
                            var12 = this.N(n2 |= n);
                            if (!class05819.N(var12).endsWith("_door") || !"lower".equals(class05819.N(var13 = this.N(n2), "half"))) continue;
                            int n5 = class05813.N(n2, class05823.field_15863);
                            Dynamic<?> var15 = this.N(n5);
                            String string = class05819.N(var13);
                            if (!string.equals(class05819.N(var15))) continue;
                            String string2 = class05819.N(var13, "facing");
                            String string3 = class05819.N(var13, "open");
                            String string4 = bl ? "left" : class05819.N(var15, "hinge");
                            String string5 = bl ? "false" : class05819.N(var15, "powered");
                            this.N(n2, class05830.P.get(string + string2 + "lower" + string4 + string3 + string5));
                            this.N(n5, class05830.P.get(string + string2 + "upper" + string4 + string3 + string5));
                        }
                        continue block30;
                    }
                    case 175: {
                        Object var13;
                        Dynamic<?> var12;
                        int n2;
                        IntListIterator intListIterator = ((IntList)entry.getValue()).iterator();
                        while (intListIterator.hasNext()) {
                            n2 = (Integer)intListIterator.next();
                            var12 = this.N(n2 |= n);
                            if (!"upper".equals(class05819.N(var12, "half"))) continue;
                            var13 = this.N(class05813.N(n2, class05823.field_15858));
                            String string = class05819.N(var13);
                            switch (string) {
                                case "minecraft:sunflower": {
                                    this.N(n2, class05830.M);
                                    break;
                                }
                                case "minecraft:lilac": {
                                    this.N(n2, class05830.B);
                                    break;
                                }
                                case "minecraft:tall_grass": {
                                    this.N(n2, class05830.Z);
                                    break;
                                }
                                case "minecraft:large_fern": {
                                    this.N(n2, class05830.z);
                                    break;
                                }
                                case "minecraft:rose_bush": {
                                    this.N(n2, class05830.U);
                                    break;
                                }
                                case "minecraft:peony": {
                                    this.N(n2, class05830.E);
                                }
                            }
                        }
                        break;
                    }
                }
            }
        }
    }

    private @Nullable class05821 u(int n) {
        int n2 = n >> 12;
        return n2 < this.y.length ? this.y[n2] : null;
    }

    private @Nullable Dynamic<?> y(int n) {
        return (Dynamic)this.R.get(n);
    }

    public Dynamic<?> N(int n) {
        if (n < 0 || n > 65535) {
            return class05830.j;
        }
        class05821 class058212 = this.u(n);
        if (class058212 == null) {
            return class05830.j;
        }
        return class058212.N(n & 0xFFF);
    }

    public Dynamic<?> N() {
        Dynamic dynamic;
        Dynamic dynamic2;
        Dynamic<?> var1 = this.L;
        dynamic2 = this.R.isEmpty() ? var1.remove("TileEntities") : dynamic2.set("TileEntities", dynamic2.createList(this.R.values().stream()));
        Dynamic var2 = dynamic2.emptyMap();
        ArrayList arrayList = Lists.newArrayList();
        for (class05821 class058212 : this.y) {
            if (class058212 == null) continue;
            arrayList.add(class058212.N());
            dynamic = var2.set(String.valueOf(class058212.L), var2.createIntList(Arrays.stream(class058212.y.toIntArray())));
        }
        Dynamic var4 = dynamic2.emptyMap();
        Dynamic dynamic3 = var4.set("Sides", var4.createByte((byte)this.N));
        dynamic3 = dynamic3.set("Indices", dynamic);
        return dynamic2.set("UpgradeData", dynamic3).set("Sections", dynamic3.createList(arrayList.stream()));
    }

    public static int N(int n, class05823 class058232) {
        return switch (class058232.y().ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                int var2_2 = (n & 0xF) + class058232.N().N();
                if (var2_2 < 0 || var2_2 > 15) {
                    yield -1;
                }
                yield n & 0xFFFFFFF0 | var2_2;
            }
            case 1 -> {
                int var2_3 = (n >> 8) + class058232.N().N();
                if (var2_3 < 0 || var2_3 > 255) {
                    yield -1;
                }
                yield n & 0xFF | var2_3 << 8;
            }
            case 2 -> {
                int var2_4 = (n >> 4 & 0xF) + class058232.N().N();
                if (var2_4 < 0 || var2_4 > 15) {
                    yield -1;
                }
                yield n & 0xFFFFFF0F | var2_4 << 4;
            }
        };
    }

    private void N(int n, Dynamic<?> dynamic) {
        if (n < 0 || n > 65535) {
            return;
        }
        class05821 class058212 = this.u(n);
        if (class058212 == null) {
            return;
        }
        class058212.N(n & 0xFFF, dynamic);
    }
}

