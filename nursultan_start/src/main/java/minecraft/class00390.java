/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.DataFixUtils
 *  java.lang.MatchException
 *  javax.annotation.CheckReturnValue
 *  minecraft.class00627
 *  minecraft.class00647
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class06541
 *  minecraft.class07018
 *  minecraft.class07049
 *  minecraft.class07701
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.CheckReturnValue;
import minecraft.class00388;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00405;
import minecraft.class00627;
import minecraft.class00647;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class06541;
import minecraft.class07018;
import minecraft.class07049;
import minecraft.class07701;
import org.jspecify.annotations.Nullable;

public class class00390 {
    public static final String N = ", ";
    public static final class00392 y = class00392.y(", ").N(class06541.field_1080);
    public static final class00392 L = class00392.y(", ");

    public static <T> class00392 y(Collection<? extends T> collection, Function<T, class00392> function) {
        return class00390.N(collection, y, function);
    }

    public static boolean y(@Nullable class00392 class003922) {
        Object object;
        if (class003922 != null && (object = class003922.method_10851()) instanceof class00388) {
            class00388 class003882 = (class00388)object;
            object = class003882.y();
            return class003882.L() != null || class07018.y().N((String)object);
        }
        return true;
    }

    public static class00392 N(Message message) {
        if (message instanceof class00392) {
            return (class00392)message;
        }
        return class00392.y(message.getString());
    }

    public static class05216 N(class00392 class003922) {
        return class00392.N("chat.square_brackets", class003922);
    }

    public static <T> class05216 N(Collection<? extends T> collection, class00392 class003922, Function<T, class00392> function) {
        if (collection.isEmpty()) {
            return class00392.i();
        }
        if (collection.size() == 1) {
            return function.apply(collection.iterator().next()).L();
        }
        class05216 class052162 = class00392.i();
        boolean bl = true;
        for (T t : collection) {
            if (!bl) {
                class052162.y(class003922);
            }
            class052162.y(function.apply(t));
            bl = false;
        }
        return class052162;
    }

    public static <T> class05216 N(Collection<? extends T> collection, Optional<? extends class00392> optional, Function<T, class00392> function) {
        return class00390.N(collection, (class00392)DataFixUtils.orElse(optional, (Object)y), function);
    }

    public static class05216 N(String string) {
        return class00390.N((class00392)class00392.y(string).N(class004052 -> class004052.N(class06541.field_1060).N((class00647)new class00627(string)).N(new class00401((class00392)class00392.L("chat.copy.click"))).N(string)));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static class00405 N(@Nullable class07701 class077012, class00405 class004052, @Nullable class07049 class070492, int n) throws CommandSyntaxException {
        class00395 class003952 = class004052.z();
        if (!(class003952 instanceof class00401)) return class004052;
        class00401 class004012 = (class00401)class003952;
        try {
            Object object = class004012.y();
            class00392 class003922 = object;
            object = new class00401((class00392)class00390.N(class077012, class003922, class070492, n + 1));
            return class004052.N((class00395)object);
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
    }

    public static class05216 N(@Nullable class07701 class077012, class00392 class003922, @Nullable class07049 class070492, int n) throws CommandSyntaxException {
        if (n > 100) {
            return class003922.L();
        }
        class05216 class052162 = class003922.method_10851().N(class077012, class070492, n + 1);
        for (class00392 class003923 : class003922.method_10855()) {
            class052162.y((class00392)class00390.N(class077012, class003923, class070492, n + 1));
        }
        return class052162.L(class00390.N(class077012, class003922.method_10866(), class070492, n));
    }

    public static Optional<class05216> N(@Nullable class07701 class077012, Optional<class00392> optional, @Nullable class07049 class070492, int n) throws CommandSyntaxException {
        return optional.isPresent() ? Optional.of(class00390.N(class077012, optional.get(), class070492, n)) : Optional.empty();
    }

    @CheckReturnValue
    public static class00392 N(class00392 class003922, class00405 class004052) {
        if (class004052.B()) {
            return class003922;
        }
        class00405 class004053 = class003922.method_10866();
        if (class004053.B()) {
            return class003922.L().y(class004052);
        }
        if (class004053.equals(class004052)) {
            return class003922;
        }
        return class003922.L().y(class004053.N(class004052));
    }

    public static class00392 N(Collection<? extends class00392> collection, class00392 class003922) {
        return class00390.N(collection, class003922, Function.identity());
    }

    @CheckReturnValue
    public static class05216 N(class05216 class052162, class00405 class004052) {
        if (class004052.B()) {
            return class052162;
        }
        class00405 class004053 = class052162.method_10866();
        if (class004053.B()) {
            return class052162.y(class004052);
        }
        if (class004053.equals(class004052)) {
            return class052162;
        }
        return class052162.y(class004053.N(class004052));
    }

    public static <T extends Comparable<T>> class00392 N(Collection<T> collection, Function<T, class00392> function) {
        if (collection.isEmpty()) {
            return class05220.N;
        }
        if (collection.size() == 1) {
            return function.apply((Comparable)collection.iterator().next());
        }
        ArrayList arrayList = Lists.newArrayList(collection);
        arrayList.sort(Comparable::compareTo);
        return class00390.y(arrayList, function);
    }

    public static class00392 N(Collection<String> collection) {
        return class00390.N(collection, (T string) -> class00392.y(string).N(class06541.field_1060));
    }
}

