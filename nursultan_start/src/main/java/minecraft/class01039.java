/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class04297
 *  minecraft.class04323
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import minecraft.class01034;
import minecraft.class04297;
import minecraft.class04323;
import minecraft.class06069;
import minecraft.class07209;

public class class01039
extends class04297 {
    private static final class01039 L = new class01039();
    public static final MapCodec<class01039> N = MapCodec.unit(() -> L);

    public static class01039 y() {
        return L;
    }

    public Stream<class07209> N(class01034 class010342, class06069 class060692, class07209 class072092) {
        int n = class060692.y(16) + class072092.method_10263();
        int n2 = class060692.y(16) + class072092.method_10260();
        return Stream.of(new class07209(n, class072092.method_10264(), n2));
    }

    public class04323<?> N() {
        return class04323.W;
    }
}

