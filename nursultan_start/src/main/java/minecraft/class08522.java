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

public abstract class class08522
implements class02324<StringReader, String> {
    private final int N;
    private final int y;
    private final class08524<CommandSyntaxException> L;

    public class08522(int n, class08524<CommandSyntaxException> class085242) {
        this(n, Integer.MAX_VALUE, class085242);
    }

    public class08522(int n, int n2, class08524<CommandSyntaxException> class085242) {
        this.N = n;
        this.y = n2;
        this.L = class085242;
    }

    protected abstract boolean N(char var1);

    public @Nullable String y(class02325<StringReader> class023252) {
        int n;
        int n2;
        StringReader stringReader = (StringReader)class023252.R();
        String string = stringReader.getString();
        for (n2 = n = stringReader.getCursor(); n2 < string.length() && this.N(string.charAt(n2)) && n2 - n < this.y; ++n2) {
        }
        if (n2 - n < this.N) {
            class023252.y().N(class023252.M(), this.L);
            return null;
        }
        stringReader.setCursor(n2);
        return string.substring(n, n2);
    }
}

