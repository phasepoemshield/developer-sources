/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class00392
 *  minecraft.class00751
 *  minecraft.class01929
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02625
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class06497
 *  minecraft.class06591
 *  minecraft.class07304
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00751;
import minecraft.class01929;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02625;
import minecraft.class02666;
import minecraft.class02694;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class06497;
import minecraft.class06591;
import minecraft.class07304;
import org.jspecify.annotations.Nullable;

public class class02710
implements class02694 {
    public static final class02710 N = new class02710((Object2IntOpenHashMap<class03556<class07304>>)new Object2IntOpenHashMap());
    private static final Codec<Integer> i = Codec.intRange((int)1, (int)255);
    public static final Codec<class02710> y = Codec.unboundedMap((Codec)class07304.L, i).xmap(map -> new class02710((Object2IntOpenHashMap<class03556<class07304>>)new Object2IntOpenHashMap(map)), class027102 -> class027102.u);
    public static final class02362<class04247, class02710> L = class02362.N((class02362)class02389.N(Object2IntOpenHashMap::new, (class02362)class07304.u, (class02362)class02389.B), (T class027102) -> class027102.u, class02710::new);
    final Object2IntOpenHashMap<class03556<class07304>> u;

    public int L() {
        return this.u.size();
    }

    class02710(Object2IntOpenHashMap<class03556<class07304>> object2IntOpenHashMap) {
        this.u = object2IntOpenHashMap;
        for (Object2IntMap.Entry entry : object2IntOpenHashMap.object2IntEntrySet()) {
            int n = entry.getIntValue();
            if (n >= 0 && n <= 255) continue;
            throw new IllegalArgumentException("Enchantment " + String.valueOf(entry.getKey()) + " has invalid level " + n);
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof class02710) {
            class02710 class027102 = (class02710)object;
            return this.u.equals(class027102.u);
        }
        return false;
    }

    public String toString() {
        return "ItemEnchantments{enchantments=" + String.valueOf(this.u) + "}";
    }

    public int hashCode() {
        return this.u.hashCode();
    }

    public boolean u() {
        return this.u.isEmpty();
    }

    public Set<Object2IntMap.Entry<class03556<class07304>>> y() {
        return Collections.unmodifiableSet(this.u.object2IntEntrySet());
    }

    private static <T> class03543<T> N(@Nullable class01929 class019292, class05946<class00751<T>> class059462, class03530<T> class035302) {
        Optional optional;
        if (class019292 != null && (optional = class019292.y(class059462).N(class035302)).isPresent()) {
            return (class03543)optional.get();
        }
        return class03543.N((class03556[])new class03556[0]);
    }

    public Set<class03556<class07304>> N() {
        return Collections.unmodifiableSet(this.u.keySet());
    }

    @Override
    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
        class03543 var6 = class02710.N(class065912.N(), class04227.yR, class02625.N);
        for (class03556 class035562 : var6) {
            int n = this.u.getInt((Object)class035562);
            if (n <= 0) continue;
            consumer.accept(class07304.N((class03556)class035562, (int)n));
        }
        for (class03556 class035562 : this.u.object2IntEntrySet()) {
            class03556 var9 = (class03556)class035562.getKey();
            if (var6.N(var9)) continue;
            consumer.accept(class07304.N((class03556)((class03556)class035562.getKey()), (int)class035562.getIntValue()));
        }
    }

    public int N(class03556<class07304> class035562) {
        return this.u.getInt(class035562);
    }
}

