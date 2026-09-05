/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.stream.Stream;
import minecraft.class02325;

public interface class02350<S> {
    public static <S> class02350<S> N() {
        return class023252 -> Stream.empty();
    }

    public Stream<String> possibleValues(class02325<S> var1);
}

