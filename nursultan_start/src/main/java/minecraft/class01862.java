/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  it.unimi.dsi.fastutil.ints.IntList
 *  minecraft.class00392
 *  minecraft.class01711
 *  minecraft.class01716
 *  minecraft.class01737
 *  minecraft.class07684
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import minecraft.class00392;
import minecraft.class01711;
import minecraft.class01716;
import minecraft.class01737;
import minecraft.class01878;
import minecraft.class01887;
import minecraft.class01894;
import minecraft.class07684;

class class01862<T extends class01711<T>>
implements class01887<T> {
    private final class01737 N;
    private final IntList y;
    private final T L;

    public class01862(class01737 class017372, IntList intList, T t) {
        this.N = class017372;
        this.y = intList;
        this.L = t;
    }

    @Override
    public IntList N() {
        return this.y;
    }

    @Override
    public class01716<T> N(List<String> list, CommandDispatcher<T> commandDispatcher, class01894 class018942) throws class01878 {
        String string = this.N.N(list);
        try {
            return class07684.N(commandDispatcher, this.L, (StringReader)new StringReader(string));
        }
        catch (CommandSyntaxException commandSyntaxException) {
            throw new class01878((class00392)class00392.N((String)"commands.function.error.parse", (Object[])new Object[]{class00392.N((class01894)class018942), string, commandSyntaxException.getMessage()}));
        }
    }
}

