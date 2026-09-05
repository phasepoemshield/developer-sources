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

public abstract class class08499
implements class02324<StringReader, String> {
    private final class08524<CommandSyntaxException> N;
    private final class08524<CommandSyntaxException> y;

    public class08499(class08524<CommandSyntaxException> class085242, class08524<CommandSyntaxException> class085243) {
        this.N = class085242;
        this.y = class085243;
    }

    public @Nullable String y(class02325<StringReader> class023252) {
        int n;
        int n2;
        StringReader stringReader = (StringReader)class023252.R();
        stringReader.skipWhitespace();
        String string = stringReader.getString();
        for (n2 = n = stringReader.getCursor(); n2 < string.length() && this.N(string.charAt(n2)); ++n2) {
        }
        if (n2 - n == 0) {
            class023252.y().N(class023252.M(), this.N);
            return null;
        }
        if (string.charAt(n) == '_' || string.charAt(n2 - 1) == '_') {
            class023252.y().N(class023252.M(), this.y);
            return null;
        }
        stringReader.setCursor(n2);
        return string.substring(n, n2);
    }

    protected abstract boolean N(char var1);
}

