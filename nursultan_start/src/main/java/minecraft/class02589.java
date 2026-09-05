/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01034
 *  minecraft.class01296
 *  minecraft.class04297
 *  minecraft.class04323
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class01034;
import minecraft.class01296;
import minecraft.class04297;
import minecraft.class04323;
import minecraft.class06069;
import minecraft.class07209;

public class class02589
extends class04297 {
    public static final MapCodec<class02589> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class07209.field_25064.listOf().fieldOf("positions").forGetter(class025892 -> class025892.L)).apply(instance, class02589::new));
    private final List<class07209> L;

    private class02589(List<class07209> list) {
        this.L = list;
    }

    public static class02589 N(class07209 ... class07209Array) {
        return new class02589(List.of(class07209Array));
    }

    public class04323<?> N() {
        return class04323.P;
    }

    private static boolean N(int n, int n2, class07209 class072092) {
        return n == class01296.N((int)class072092.method_10263()) && n2 == class01296.N((int)class072092.method_10260());
    }

    public Stream<class07209> N(class01034 class010342, class06069 class060692, class07209 class072093) {
        int n = class01296.N((int)class072093.method_10263());
        int n2 = class01296.N((int)class072093.method_10260());
        boolean bl = false;
        for (class07209 class072094 : this.L) {
            if (!class02589.N(n, n2, class072094)) continue;
            bl = true;
            break;
        }
        if (!bl) {
            return Stream.empty();
        }
        return this.L.stream().filter(class072092 -> class02589.N(n, n2, class072092));
    }
}

