/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class02324
 *  minecraft.class02325
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import minecraft.class02324;
import minecraft.class02325;
import minecraft.class08524;
import org.jspecify.annotations.Nullable;

public class class08515
implements class02324<StringReader, String> {
    private final int N;
    private final class08524<CommandSyntaxException> y;

    public class08515(int n, class08524<CommandSyntaxException> class085242) {
        this.N = n;
        this.y = class085242;
    }

    public @Nullable String y(class02325<StringReader> class023252) {
        ((StringReader)class023252.R()).skipWhitespace();
        int n = class023252.M();
        String string = ((StringReader)class023252.R()).readUnquotedString();
        if (string.length() < this.N) {
            class023252.y().N(n, this.y);
            return null;
        }
        return string;
    }
}

