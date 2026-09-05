/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class00507
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02666
 *  minecraft.class02694
 *  minecraft.class04593
 *  minecraft.class06497
 *  minecraft.class06541
 *  minecraft.class06591
 *  minecraft.class07536
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00500;
import minecraft.class00507;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02666;
import minecraft.class02694;
import minecraft.class04593;
import minecraft.class06497;
import minecraft.class06541;
import minecraft.class06591;
import minecraft.class07536;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public final class class02841
extends Record
implements class02694 {
    private final Map<String, String> properties;
    public static final class02841 N = new class02841(Map.of());
    public static final Codec<class02841> y = Codec.unboundedMap((Codec)Codec.STRING, (Codec)Codec.STRING).xmap(class02841::new, class02841::y);
    private static final class02362<ByteBuf, Map<String, String>> i = class02389.N(Object2ObjectOpenHashMap::new, (class02362)class02389.s, (class02362)class02389.s);
    public static final class02362<ByteBuf, class02841> L = i.N_10(class02841::new, class02841::y);

    public class02841(Map<String, String> map) {
        this.properties = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02841.class, "properties", "properties"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02841.class, "properties", "properties"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02841.class, "properties", "properties"}, this);
    }

    public Map<String, String> y() {
        return this.properties;
    }

    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
        Integer n = (Integer)this.N((class08092)class04593.L);
        if (n != null) {
            consumer.accept((class00392)class00392.N((String)"container.beehive.honey", (Object[])new Object[]{n, 5}).N(class06541.field_1080));
        }
    }

    public <T extends Comparable<T>> class02841 N(class08092<T> class080922, class00500 class005002) {
        return this.N(class080922, class005002.L(class080922));
    }

    public <T extends Comparable<T>> @Nullable T N(class08092<T> class080922) {
        String string = this.properties.get(class080922.R());
        if (string == null) {
            return null;
        }
        return (T)((Comparable)class080922.y(string).orElse(null));
    }

    public class00500 N(class00500 class005002) {
        class00507 var2 = class005002.i().E();
        for (Map.Entry<String, String> entry : this.properties.entrySet()) {
            class08092 var5 = var2.N(entry.getKey());
            if (var5 == null) continue;
            class005002 = class02841.N(class005002, var5, entry.getValue());
        }
        return class005002;
    }

    private static <T extends Comparable<T>> class00500 N(class00500 class005002, class08092<T> class080922, String string) {
        return class080922.y(string).map(comparable -> (class00500)class005002.y(class080922, comparable)).orElse(class005002);
    }

    public boolean N() {
        return this.properties.isEmpty();
    }

    public <T extends Comparable<T>> class02841 N(class08092<T> class080922, T t) {
        return new class02841(class07536.N(this.properties, (Object)class080922.R(), (Object)class080922.y(t)));
    }
}

