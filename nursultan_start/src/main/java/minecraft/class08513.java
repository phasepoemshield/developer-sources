/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class02324
 *  minecraft.class02325
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import minecraft.class02324;
import minecraft.class02325;
import minecraft.class08524;

public final class class08513
implements class02324<StringReader, String> {
    private final Pattern N;
    private final class08524<CommandSyntaxException> y;

    public class08513(Pattern pattern, class08524<CommandSyntaxException> class085242) {
        this.N = pattern;
        this.y = class085242;
    }

    public String y(class02325<StringReader> class023252) {
        StringReader stringReader = (StringReader)class023252.R();
        String string = stringReader.getString();
        Matcher matcher = this.N.matcher(string).region(stringReader.getCursor(), string.length());
        if (!matcher.lookingAt()) {
            class023252.y().N(class023252.M(), this.y);
            return null;
        }
        stringReader.setCursor(matcher.end());
        return matcher.group(0);
    }
}

