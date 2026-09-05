/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class05216
 *  minecraft.class06790
 *  minecraft.class06794
 *  minecraft.class07771
 *  minecraft.class08162
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import minecraft.class00392;
import minecraft.class05216;
import minecraft.class06790;
import minecraft.class06794;
import minecraft.class07690;
import minecraft.class07701;
import minecraft.class07771;
import minecraft.class08162;

public final class class07699
extends Record {
    final String text;
    private final class07771[] parts;

    public class07699(String string, class07771[] class07771Array) {
        this.text = string;
        this.parts = class07771Array;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07699.class, "text;parts", "text", "parts"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07699.class, "text;parts", "text", "parts"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07699.class, "text;parts", "text", "parts"}, this);
    }

    public class07771[] y() {
        return this.parts;
    }

    public static class07699 N(StringReader stringReader, boolean bl) throws CommandSyntaxException {
        if (stringReader.getRemainingLength() > 256) {
            throw class07690.N.create((Object)stringReader.getRemainingLength(), (Object)256);
        }
        String string = stringReader.getRemaining();
        if (!bl) {
            stringReader.setCursor(stringReader.getTotalLength());
            return new class07699(string, new class07771[0]);
        }
        ArrayList arrayList = Lists.newArrayList();
        int n = stringReader.getCursor();
        while (stringReader.canRead()) {
            if (stringReader.peek() == '@') {
                class06794 class067942;
                int n2 = stringReader.getCursor();
                try {
                    class06790 class067902 = new class06790(stringReader, true);
                    class067942 = class067902.v();
                }
                catch (CommandSyntaxException commandSyntaxException) {
                    if (commandSyntaxException.getType() == class06790.B || commandSyntaxException.getType() == class06790.R) {
                        stringReader.setCursor(n2 + 1);
                        continue;
                    }
                    throw commandSyntaxException;
                }
                arrayList.add(new class07771(n2 - n, stringReader.getCursor() - n, class067942));
                continue;
            }
            stringReader.skip();
        }
        return new class07699(string, arrayList.toArray(new class07771[0]));
    }

    public String N() {
        return this.text;
    }

    class00392 N(class07701 class077012) throws CommandSyntaxException {
        return this.N(class077012, class077012.N().hasPermission(class08162.i));
    }

    public class00392 N(class07701 class077012, boolean bl) throws CommandSyntaxException {
        if (this.parts.length == 0 || !bl) {
            return class00392.y((String)this.text);
        }
        class05216 class052162 = class00392.y((String)this.text.substring(0, this.parts[0].N()));
        int n = this.parts[0].N();
        for (class07771 class077712 : this.parts) {
            class00392 class003922 = class077712.N(class077012);
            if (n < class077712.N()) {
                class052162.i(this.text.substring(n, class077712.N()));
            }
            class052162.y(class003922);
            n = class077712.y();
        }
        if (n < this.text.length()) {
            class052162.i(this.text.substring(n));
        }
        return class052162;
    }
}

