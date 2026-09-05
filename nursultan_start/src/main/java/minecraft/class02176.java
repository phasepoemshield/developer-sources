/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  minecraft.class02315
 *  minecraft.class02325
 *  minecraft.class02328
 *  minecraft.class02332
 *  minecraft.class02350
 *  minecraft.class08524
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.stream.Stream;
import minecraft.class02315;
import minecraft.class02325;
import minecraft.class02328;
import minecraft.class02332;
import minecraft.class02350;
import minecraft.class08524;

public final class class02176
implements class02315<StringReader> {
    private final String N;
    private final class08524<CommandSyntaxException> y;
    private final class02350<StringReader> L;

    public class02176(String string) {
        this.N = string;
        this.y = class08524.N((DynamicCommandExceptionType)CommandSyntaxException.BUILT_IN_EXCEPTIONS.literalIncorrect(), (String)string);
        this.L = class023252 -> Stream.of(string);
    }

    public String toString() {
        return "terminal[" + this.N + "]";
    }

    public boolean N(class02325<StringReader> class023252, class02332 class023322, class02328 class023282) {
        ((StringReader)class023252.R()).skipWhitespace();
        int n = class023252.M();
        if (!((StringReader)class023252.R()).readUnquotedString().equals(this.N)) {
            class023252.y().N(n, this.L, this.y);
            return false;
        }
        return true;
    }
}

