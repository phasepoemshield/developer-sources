/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.List$ListType
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntIterator
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class06625
 *  minecraft.class06962
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import minecraft.class06599;
import minecraft.class06625;
import minecraft.class06962;

public class class06616
extends DataFix {
    private static final int L = 128;
    private static final int u = 64;
    private static final int i = 32;
    private static final int R = 16;
    private static final int M = 8;
    private static final int B = 4;
    private static final int Z = 2;
    private static final int z = 1;
    private static final int[][] U = new int[][]{{-1, 0, 0}, {1, 0, 0}, {0, -1, 0}, {0, 1, 0}, {0, 0, -1}, {0, 0, 1}};
    private static final int E = 7;
    private static final int W = 12;
    private static final int m = 4096;
    static final Object2IntMap<String> N = (Object2IntMap)DataFixUtils.make((Object)new Object2IntOpenHashMap(), object2IntOpenHashMap -> {
        object2IntOpenHashMap.put((Object)"minecraft:acacia_leaves", 0);
        object2IntOpenHashMap.put((Object)"minecraft:birch_leaves", 1);
        object2IntOpenHashMap.put((Object)"minecraft:dark_oak_leaves", 2);
        object2IntOpenHashMap.put((Object)"minecraft:jungle_leaves", 3);
        object2IntOpenHashMap.put((Object)"minecraft:oak_leaves", 4);
        object2IntOpenHashMap.put((Object)"minecraft:spruce_leaves", 5);
    });
    static final Set<String> y = ImmutableSet.of((Object)"minecraft:acacia_bark", (Object)"minecraft:birch_bark", (Object)"minecraft:dark_oak_bark", (Object)"minecraft:jungle_bark", (Object)"minecraft:oak_bark", (Object)"minecraft:spruce_bark", (Object[])new String[]{"minecraft:acacia_log", "minecraft:birch_log", "minecraft:dark_oak_log", "minecraft:jungle_log", "minecraft:oak_log", "minecraft:spruce_log", "minecraft:stripped_acacia_log", "minecraft:stripped_birch_log", "minecraft:stripped_dark_oak_log", "minecraft:stripped_jungle_log", "minecraft:stripped_oak_log", "minecraft:stripped_spruce_log"});

    private int L(int n) {
        return n >> 4 & 0xF;
    }

    public class06616(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private int y(int n) {
        return n >> 8 & 0xFF;
    }

    private static /* synthetic */ Typed N(Int2ObjectMap int2ObjectMap, Typed typed) {
        return ((class06625)int2ObjectMap.get(((Dynamic)typed.get(DSL.remainderFinder())).get("Y").asInt(0))).N(typed);
    }

    private int N(int n) {
        return n & 0xF;
    }

    public static int N(int n, int n2, int n3) {
        return n2 << 8 | n3 << 4 | n;
    }

    public static int N(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        int n = 0;
        if (bl3) {
            n = bl2 ? (n |= 2) : (bl ? (n |= 0x80) : (n |= 1));
        } else if (bl4) {
            n = bl ? (n |= 0x20) : (bl2 ? (n |= 8) : (n |= 0x10));
        } else if (bl2) {
            n |= 4;
        } else if (bl) {
            n |= 0x40;
        }
        return n;
    }

    protected TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.u);
        OpticFinder var2 = var1.findField("Level");
        OpticFinder var3 = var2.type().findField("Sections");
        Type var4 = var3.type();
        if (!(var4 instanceof List.ListType)) {
            throw new IllegalStateException("Expecting sections to be a list.");
        }
        OpticFinder opticFinder = DSL.typeFinder((Type)((List.ListType)var4).getElement());
        return this.fixTypeEverywhereTyped("Leaves fix", var1, typed2 -> typed2.updateTyped(var2, typed -> {
            Typed typed3;
            int[] nArray = new int[]{0};
            Typed var5 = typed.updateTyped(var3, typed2 -> {
                int n;
                int n2;
                Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap(typed2.getAllTyped(opticFinder).stream().map(typed -> new class06625(typed, this.getInputSchema())).collect(Collectors.toMap(class06599::L, class066252 -> class066252)));
                if (int2ObjectOpenHashMap.values().stream().allMatch(class06599::y)) {
                    return typed2;
                }
                ArrayList arrayList = Lists.newArrayList();
                for (int i = 0; i < 7; ++i) {
                    arrayList.add(new IntOpenHashSet());
                }
                for (class06625 class066253 : int2ObjectOpenHashMap.values()) {
                    if (class066253.y()) continue;
                    for (int i = 0; i < 4096; ++i) {
                        int n3 = class066253.u(i);
                        if (class066253.N(n3)) {
                            ((IntSet)arrayList.get(0)).add(class066253.L() << 12 | i);
                            continue;
                        }
                        if (!class066253.y(n3)) continue;
                        n2 = this.N(i);
                        n = this.L(i);
                        nArray[0] = nArray[0] | class06616.N(n2 == 0, n2 == 15, n == 0, n == 15);
                    }
                }
                for (int i = 1; i < 7; ++i) {
                    class06625 class066253;
                    class066253 = (IntSet)arrayList.get(i - 1);
                    IntSet intSet = (IntSet)arrayList.get(i);
                    IntIterator intIterator = class066253.iterator();
                    while (intIterator.hasNext()) {
                        n2 = intIterator.nextInt();
                        n = this.N(n2);
                        int n4 = this.y(n2);
                        int n5 = this.L(n2);
                        for (int[] nArray2 : U) {
                            int n6;
                            int n7;
                            class06625 class066254;
                            int n8 = n + nArray2[0];
                            int n9 = n4 + nArray2[1];
                            int n10 = n5 + nArray2[2];
                            if (n8 < 0 || n8 > 15 || n10 < 0 || n10 > 15 || n9 < 0 || n9 > 255 || (class066254 = (class06625)int2ObjectOpenHashMap.get(n9 >> 4)) == null || class066254.y() || !class066254.y(n7 = class066254.u(n6 = class06616.N(n8, n9 & 0xF, n10))) || class066254.L(n7) <= i) continue;
                            class066254.N(n6, n7, i);
                            intSet.add(class06616.N(n8, n9, n10));
                        }
                    }
                }
                return typed2.updateTyped(opticFinder, arg_0 -> class06616.N((Int2ObjectMap)int2ObjectOpenHashMap, arg_0));
            });
            if (nArray[0] != 0) {
                typed3 = var5.update(DSL.remainderFinder(), dynamic -> {
                    Dynamic dynamic2 = (Dynamic)DataFixUtils.orElse((Optional)dynamic.get("UpgradeData").result(), (Object)dynamic.emptyMap());
                    return dynamic.set("UpgradeData", dynamic2.set("Sides", dynamic.createByte((byte)(dynamic2.get("Sides").asByte((byte)0) | nArray[0]))));
                });
            }
            return typed3;
        }));
    }
}

