/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  java.lang.Record
 *  minecraft.class06790
 *  minecraft.class06794
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import minecraft.class06790;
import minecraft.class06794;

public final class class08262
extends Record {
    private final String y;
    private final class06794 L;
    public static final Codec<class08262> N = Codec.STRING.comapFlatMap(class08262::N, class08262::a);

    public class08262(String string, class06794 class067942) {
        this.y = string;
        this.L = class067942;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (!(object instanceof class08262)) return false;
        class08262 class082622 = (class08262)((Object)object);
        if (!this.y.equals(class082622.y)) return false;
        return true;
    }

    public String toString() {
        return this.y;
    }

    public int hashCode() {
        return this.y.hashCode();
    }

    public class06794 y() {
        return this.L;
    }

    public String N() {
        return this.y;
    }

    public static DataResult<class08262> N(String string) {
        try {
            class06790 class067902 = new class06790(new StringReader(string), true);
            return DataResult.success((Object)((Object)new class08262(string, class067902.v())));
        }
        catch (CommandSyntaxException commandSyntaxException) {
            return DataResult.error(() -> "Invalid selector component: " + string + ": " + commandSyntaxException.getMessage());
        }
    }

    public String a() {
        return this.y;
    }
}

