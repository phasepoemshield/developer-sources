/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00392
 *  minecraft.class00719
 *  minecraft.class02362
 *  minecraft.class02389
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.function.UnaryOperator;
import minecraft.class00392;
import minecraft.class00719;
import minecraft.class02362;
import minecraft.class02389;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public final class class01894
implements Comparable<class01894> {
    public static final Codec<class01894> N = Codec.STRING.comapFlatMap(class01894::u, class01894::toString).stable();
    public static final class02362<ByteBuf, class01894> y = class02389.s.N_10(class01894::N, class01894::toString);
    public static final SimpleCommandExceptionType L = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.id.invalid"));
    public static final char u = ':';
    public static final String i = "minecraft";
    public static final String R = "realms";
    private final String B;
    private final String Z;

    public static @Nullable class01894 L(String string) {
        return class01894.y(string, ':');
    }

    public String L(String string, String string2) {
        return string + "." + this.u() + "." + string2;
    }

    private static String L(StringReader stringReader) {
        int n = stringReader.getCursor();
        while (stringReader.canRead() && class01894.N(stringReader.peek())) {
            stringReader.skip();
        }
        return stringReader.getString().substring(n, stringReader.getCursor());
    }

    public String L() {
        return this.toString().replace('/', '_').replace(':', '_');
    }

    private static boolean L(char c) {
        return c == '_' || c == '-' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9' || c == '.';
    }

    public class01894 M(String string) {
        return this.i(this.Z + string);
    }

    private class01894(String string, String string2) {
        assert (class01894.z(string));
        assert (class01894.Z(string2));
        this.B = string;
        this.Z = string2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof class01894) {
            class01894 class018942 = (class01894)object;
            return this.B.equals(class018942.B) && this.Z.equals(class018942.Z);
        }
        return false;
    }

    public String toString() {
        return this.B + ":" + this.Z;
    }

    public int hashCode() {
        return 31 * this.B.hashCode() + this.Z.hashCode();
    }

    public String B(String string) {
        return string + "." + this.u();
    }

    public static boolean Z(String string) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class01894.N(string, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        for (int i = 0; i < string.length(); ++i) {
            if (class01894.y(string.charAt(i))) continue;
            return false;
        }
        return true;
    }

    public String i() {
        return this.B.equals(i) ? this.Z : this.u();
    }

    private static String i(String string, String string2) {
        if (!class01894.z(string)) {
            throw new class00719("Non [a-z0-9_.-] character in namespace of location: " + string + ":" + string2);
        }
        return string;
    }

    public class01894 i(String string) {
        return new class01894(this.B, class01894.R(this.B, string));
    }

    public static boolean z(String string) {
        for (int i = 0; i < string.length(); ++i) {
            if (class01894.L(string.charAt(i))) continue;
            return false;
        }
        return true;
    }

    private static class01894 u(String string, String string2) {
        return new class01894(class01894.i(string, string2), class01894.R(string, string2));
    }

    public String u() {
        return this.B + "." + this.Z;
    }

    public static DataResult<class01894> u(String string) {
        try {
            return DataResult.success((Object)class01894.N(string));
        }
        catch (class00719 class007192) {
            return DataResult.error(() -> "Not a valid resource location: " + string + " " + class007192.getMessage());
        }
    }

    public static boolean y(char c) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class01894.N(c, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return c == '_' || c == '-' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9' || c == '/' || c == '.';
    }

    public String y() {
        return this.B;
    }

    public static class01894 y(StringReader stringReader) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        String string = class01894.L(stringReader);
        if (string.isEmpty()) {
            throw L.createWithContext((ImmutableStringReader)stringReader);
        }
        try {
            return class01894.N(string);
        }
        catch (class00719 class007192) {
            stringReader.setCursor(n);
            throw L.createWithContext((ImmutableStringReader)stringReader);
        }
    }

    public static @Nullable class01894 y(String string, String string2) {
        if (class01894.z(string) && class01894.Z(string2)) {
            return new class01894(string, string2);
        }
        return null;
    }

    public static @Nullable class01894 y(String string, char c) {
        int n = string.indexOf(c);
        if (n >= 0) {
            String string2 = string.substring(n + 1);
            if (!class01894.Z(string2)) {
                return null;
            }
            if (n != 0) {
                String string3 = string.substring(0, n);
                return class01894.z(string3) ? new class01894(string3, string2) : null;
            }
            return new class01894(i, string2);
        }
        return class01894.Z(string) ? new class01894(i, string) : null;
    }

    public static class01894 y(String string) {
        return new class01894(i, class01894.R(i, string));
    }

    private static void N(String string, CallbackInfoReturnable callbackInfoReturnable) {
        if (string.equals("DUMMY")) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    private static void N(char c, CallbackInfoReturnable callbackInfoReturnable) {
        if (c >= 'A' && c <= 'Z') {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    public static class01894 N(String string, char c) {
        int n = string.indexOf(c);
        if (n >= 0) {
            String string2 = string.substring(n + 1);
            if (n != 0) {
                return class01894.u(string.substring(0, n), string2);
            }
            return class01894.y(string2);
        }
        return class01894.y(string);
    }

    public String N() {
        return this.Z;
    }

    @Override
    public int compareTo(class01894 class018942) {
        int n = this.Z.compareTo(class018942.Z);
        if (n == 0) {
            n = this.B.compareTo(class018942.B);
        }
        return n;
    }

    public class01894 N(UnaryOperator<String> unaryOperator) {
        return this.i((String)unaryOperator.apply(this.Z));
    }

    public static boolean N(char c) {
        return c >= '0' && c <= '9' || c >= 'a' && c <= 'z' || c == '_' || c == ':' || c == '/' || c == '.' || c == '-';
    }

    public static class01894 N(StringReader stringReader) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        String string = class01894.L(stringReader);
        try {
            return class01894.N(string);
        }
        catch (class00719 class007192) {
            stringReader.setCursor(n);
            throw L.createWithContext((ImmutableStringReader)stringReader);
        }
    }

    public static class01894 N(String string, String string2) {
        return class01894.u(string, string2);
    }

    public static class01894 N(String string) {
        return class01894.N(string, ':');
    }

    private static String R(String string, String string2) {
        if (!class01894.Z(string2)) {
            throw new class00719("Non [a-z0-9/._-] character in path of location: " + string + ":" + string2);
        }
        return string2;
    }

    public class01894 R(String string) {
        return this.i(string + this.Z);
    }

    public String R() {
        return this.B.equals(i) ? this.Z : this.toString();
    }
}

