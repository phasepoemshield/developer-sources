/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  it.unimi.dsi.fastutil.chars.CharList
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
import it.unimi.dsi.fastutil.chars.CharList;
import java.util.stream.Collectors;
import minecraft.class02315;
import minecraft.class02325;
import minecraft.class02328;
import minecraft.class02332;
import minecraft.class02350;
import minecraft.class08524;

public abstract class class02165
implements class02315<StringReader> {
    private final class08524<CommandSyntaxException> N;
    private final class02350<StringReader> y;

    public class02165(CharList charList) {
        String string = charList.intStream().mapToObj(Character::toString).collect(Collectors.joining("|"));
        this.N = class08524.N((DynamicCommandExceptionType)CommandSyntaxException.BUILT_IN_EXCEPTIONS.literalIncorrect(), (String)string);
        this.y = class023252 -> charList.intStream().mapToObj(Character::toString);
    }

    protected abstract boolean N(char var1);

    public boolean N(class02325<StringReader> class023252, class02332 class023322, class02328 class023282) {
        ((StringReader)class023252.R()).skipWhitespace();
        int n = class023252.M();
        if (!((StringReader)class023252.R()).canRead() || !this.N(((StringReader)class023252.R()).read())) {
            class023252.y().N(n, this.y, this.N);
            return false;
        }
        return true;
    }
}

