/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class01894
 *  minecraft.class02324
 *  minecraft.class02325
 *  minecraft.class02350
 *  minecraft.class08501
 *  minecraft.class08524
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import minecraft.class01894;
import minecraft.class02170;
import minecraft.class02324;
import minecraft.class02325;
import minecraft.class02350;
import minecraft.class08501;
import minecraft.class08524;
import org.jspecify.annotations.Nullable;

public abstract class class02173<C, V>
implements class02170,
class02324<StringReader, V> {
    private final class08501<StringReader, class01894> y;
    protected final C N;
    private final class08524<CommandSyntaxException> L;

    protected class02173(class08501<StringReader, class01894> class085012, C c) {
        this.y = class085012;
        this.N = c;
        this.L = class08524.N((SimpleCommandExceptionType)class01894.L);
    }

    public @Nullable V y(class02325<StringReader> class023252) {
        ((StringReader)class023252.R()).skipWhitespace();
        int n = class023252.M();
        class01894 class018942 = (class01894)class023252.N(this.y);
        if (class018942 != null) {
            try {
                return this.N((ImmutableStringReader)class023252.R(), class018942);
            }
            catch (Exception exception) {
                class023252.y().N(n, (class02350)this, (Object)exception);
                return null;
            }
        }
        class023252.y().N(n, (class02350)this, this.L);
        return null;
    }

    protected abstract V N(ImmutableStringReader var1, class01894 var2) throws Exception;
}

