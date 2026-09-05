/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class02324
 *  minecraft.class02325
 *  minecraft.class07755
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import minecraft.class02324;
import minecraft.class02325;
import minecraft.class07755;
import org.jspecify.annotations.Nullable;

public class class02190<T>
implements class02324<StringReader, Dynamic<?>> {
    private final class07755<T> N;

    public class02190(DynamicOps<T> dynamicOps) {
        this.N = class07755.N(dynamicOps);
    }

    public @Nullable Dynamic<T> y(class02325<StringReader> class023252) {
        ((StringReader)class023252.R()).skipWhitespace();
        int n = class023252.M();
        try {
            return new Dynamic(this.N.N(), this.N.y((StringReader)class023252.R()));
        }
        catch (Exception exception) {
            class023252.y().N(n, (Object)exception);
            return null;
        }
    }
}

