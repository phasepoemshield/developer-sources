/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class01894
 *  minecraft.class02324
 *  minecraft.class02325
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import minecraft.class01894;
import minecraft.class02324;
import minecraft.class02325;
import org.jspecify.annotations.Nullable;

public class class02196
implements class02324<StringReader, class01894> {
    public static final class02324<StringReader, class01894> N = new class02196();

    private class02196() {
    }

    public @Nullable class01894 y(class02325<StringReader> class023252) {
        ((StringReader)class023252.R()).skipWhitespace();
        try {
            return class01894.y((StringReader)((StringReader)class023252.R()));
        }
        catch (CommandSyntaxException commandSyntaxException) {
            return null;
        }
    }
}

