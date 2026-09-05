/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01894
 *  minecraft.class04037
 *  minecraft.class04042
 *  minecraft.class04043
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import minecraft.class01894;
import minecraft.class04037;
import minecraft.class04042;
import minecraft.class04043;
import minecraft.class06069;

public class class03512 {
    public static final Codec<class03512> N = RecordCodecBuilder.create(instance -> instance.group((App)class04042.y.fieldOf("source").forGetter(class035122 -> class035122.y)).apply(instance, class03512::new));
    private final class04042 y;

    public class03512(long l, Optional<class01894> optional) {
        this(class03512.N(l, optional));
    }

    public class03512(long l, class01894 class018942) {
        this(class03512.N(l, Optional.of(class018942)));
    }

    public class03512(class04042 class040422) {
        this.y = class040422;
    }

    public static class04037 N(class01894 class018942) {
        return class04043.N((String)class018942.toString());
    }

    public class06069 N() {
        return this.y;
    }

    private static class04042 N(long l, Optional<class01894> optional) {
        class04037 class040372 = class04043.y((long)l);
        if (optional.isPresent()) {
            class040372 = class040372.N(class03512.N(optional.get()));
        }
        return new class04042(class040372.N());
    }
}

