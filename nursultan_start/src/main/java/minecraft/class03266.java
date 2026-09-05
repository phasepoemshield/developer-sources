/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Supplier
 *  com.google.common.base.Suppliers
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.ints.Int2IntMap
 *  it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01079
 *  minecraft.class01089
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class03261
 *  minecraft.class04205
 *  minecraft.class04214
 *  minecraft.class04224
 *  minecraft.class04233
 *  minecraft.class08280
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.mojang.datafixers.kinds.App;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.IntUnaryOperator;
import minecraft.class01079;
import minecraft.class01089;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class03261;
import minecraft.class04205;
import minecraft.class04214;
import minecraft.class04224;
import minecraft.class04233;
import minecraft.class08280;
import org.slf4j.Logger;

public final class class03266
extends Record
implements class04233 {
    private final List<class01894> textures;
    private final class01894 paletteKey;
    private final Map<String, class01894> permutations;
    private final String separator;
    static final Logger y = LogUtils.getLogger();
    public static final String L = "_";
    public static final MapCodec<class03266> u = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.list((Codec)class01894.N).fieldOf("textures").forGetter(class03266::y), (App)class01894.N.fieldOf("palette_key").forGetter(class03266::L), (App)Codec.unboundedMap((Codec)Codec.STRING, (Codec)class01894.N).fieldOf("permutations").forGetter(class03266::u), (App)Codec.STRING.optionalFieldOf("separator", (Object)L).forGetter(class03266::i)).apply(instance, class03266::new));

    public class01894 L() {
        return this.paletteKey;
    }

    public class03266(List<class01894> list, class01894 class018942, Map<String, class01894> map) {
        this(list, class018942, map, L);
    }

    public class03266(List<class01894> list, class01894 class018942, Map<String, class01894> map, String string) {
        this.textures = list;
        this.paletteKey = class018942;
        this.permutations = map;
        this.separator = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03266.class, "textures;paletteKey;permutations;separator", "textures", "paletteKey", "permutations", "separator"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03266.class, "textures;paletteKey;permutations;separator", "textures", "paletteKey", "permutations", "separator"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03266.class, "textures;paletteKey;permutations;separator", "textures", "paletteKey", "permutations", "separator"}, this);
    }

    public String i() {
        return this.separator;
    }

    public Map<String, class01894> u() {
        return this.permutations;
    }

    public List<class01894> y() {
        return this.textures;
    }

    private static /* synthetic */ void N(Map map, java.util.function.Supplier supplier, class01089 class010892, String string, class01894 class018942) {
        map.put(string, Suppliers.memoize(() -> class03266.N((java.util.function.Supplier)supplier, class010892, class018942)));
    }

    private static /* synthetic */ IntUnaryOperator N(java.util.function.Supplier supplier, class01089 class010892, class01894 class018942) {
        return class03266.N((int[])supplier.get(), class03266.N(class010892, class018942));
    }

    /*
     * Enabled aggressive exception aggregation
     */
    private static int[] N(class01089 class010892, class01894 class018942) {
        Optional optional = class010892.method_14486(N.N(class018942));
        if (optional.isEmpty()) {
            y.error("Failed to load palette image {}", (Object)class018942);
            throw new IllegalArgumentException();
        }
        try (InputStream inputStream = ((class01079)optional.get()).method_14482();){
            int[] nArray;
            block15: {
                class08280 class082802 = class08280.N((InputStream)inputStream);
                try {
                    nArray = class082802.i();
                    if (class082802 == null) break block15;
                }
                catch (Throwable throwable) {
                    if (class082802 != null) {
                        try {
                            class082802.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                class082802.close();
            }
            return nArray;
        }
        catch (Exception exception) {
            y.error("Couldn't load texture {}", (Object)class018942, (Object)exception);
            throw new IllegalArgumentException();
        }
    }

    public void N(class01089 class010892, class04205 class042052) {
        Supplier supplier = Suppliers.memoize(() -> class03266.N(class010892, this.paletteKey));
        HashMap hashMap = new HashMap();
        this.permutations.forEach((arg_0, arg_1) -> class03266.N(hashMap, (java.util.function.Supplier)supplier, class010892, arg_0, arg_1));
        for (class01894 class018942 : this.textures) {
            class01894 class018943 = N.N(class018942);
            Optional optional = class010892.method_14486(class018943);
            if (optional.isEmpty()) {
                y.warn("Unable to find texture {}", (Object)class018943);
                continue;
            }
            class04224 class042242 = new class04224(class018943, (class01079)optional.get(), hashMap.size());
            for (Map.Entry entry : hashMap.entrySet()) {
                class01894 class018944 = class018942.M(this.separator + (String)entry.getKey());
                class042052.N(class018944, (class04214)new class03261(class042242, (java.util.function.Supplier)entry.getValue(), class018944));
            }
        }
    }

    private static IntUnaryOperator N(int[] nArray, int[] nArray2) {
        if (nArray2.length != nArray.length) {
            y.warn("Palette mapping has different sizes: {} and {}", (Object)nArray.length, (Object)nArray2.length);
            throw new IllegalArgumentException();
        }
        Int2IntOpenHashMap int2IntOpenHashMap = new Int2IntOpenHashMap(nArray2.length);
        for (int i = 0; i < nArray.length; ++i) {
            int n = nArray[i];
            if (class02566.y((int)n) == 0) continue;
            int2IntOpenHashMap.put(class02566.B((int)n), nArray2[i]);
        }
        return arg_0 -> class03266.N((Int2IntMap)int2IntOpenHashMap, arg_0);
    }

    public MapCodec<class03266> N() {
        return u;
    }

    private static /* synthetic */ int N(Int2IntMap int2IntMap, int n) {
        int n2 = class02566.y((int)n);
        if (n2 == 0) {
            return n;
        }
        int n3 = class02566.B((int)n);
        int n4 = int2IntMap.getOrDefault(n3, class02566.M((int)n3));
        int n5 = class02566.y((int)n4);
        return class02566.R((int)(n2 * n5 / 255), (int)n4);
    }
}

