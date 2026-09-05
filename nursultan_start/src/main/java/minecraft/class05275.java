/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class00471
 *  minecraft.class04794
 *  minecraft.class05644
 *  minecraft.class05677
 *  minecraft.class07793
 *  minecraft.class08122
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import minecraft.class00471;
import minecraft.class04794;
import minecraft.class05268;
import minecraft.class05644;
import minecraft.class05677;
import minecraft.class07793;
import minecraft.class08122;

public class class05275
extends class00471<class05275> {
    private final class04794 N;
    private final List<class05644> y = Lists.newArrayList();

    class05275(class04794 class047942) {
        this.N = class047942;
    }

    public class08122 y() {
        return new class05268(this.R(), this.N, this.y);
    }

    protected class05275 L() {
        return this;
    }

    public class05275 N(String string, String string2) {
        return this.N(string, string2, class05677.field_17032);
    }

    public class05275 N(String string, String string2, class05677 class056772) {
        try {
            this.y.add(new class05644(class07793.N((String)string), class07793.N((String)string2), class056772));
        }
        catch (CommandSyntaxException commandSyntaxException) {
            throw new IllegalArgumentException(commandSyntaxException);
        }
        return this;
    }
}

