/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01894
 *  minecraft.class05715
 *  minecraft.class06338
 *  minecraft.class06555
 *  minecraft.class07001
 *  minecraft.class08413
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import minecraft.class01418;
import minecraft.class01894;
import minecraft.class05715;
import minecraft.class06338;
import minecraft.class06555;
import minecraft.class07001;
import minecraft.class08413;

class class01410
extends class06555 {
    public static final Codec<class01410> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.unboundedMap((Codec)class06338.X, (Codec)class07001.N).fieldOf("contents").forGetter(class014102 -> class014102.y)).apply(instance, class01410::new));
    private final Map<String, class07001> y;

    public Stream<class01894> L(String string) {
        return this.y.keySet().stream().map(string2 -> class01894.N((String)string, (String)string2));
    }

    private class01410(Map<String, class07001> map) {
        this.y = new HashMap<String, class07001>(map);
    }

    private class01410() {
        this(new HashMap<String, class07001>());
    }

    public class07001 y(String string) {
        class07001 class070012 = this.y.get(string);
        return class070012 != null ? class070012 : new class07001();
    }

    public static class08413<class01410> N(String string) {
        return new class08413(class01418.N(string), class01410::new, N, class05715.field_45077);
    }

    public void N(String string, class07001 class070012) {
        if (class070012.z()) {
            this.y.remove(string);
        } else {
            this.y.put(string, class070012);
        }
        this.method_80();
    }
}

