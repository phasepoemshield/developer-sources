/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.Message
 *  com.mojang.datafixers.util.Either
 *  minecraft.class00923
 *  minecraft.class00926
 *  minecraft.class01028
 *  minecraft.class01751
 *  minecraft.class01894
 *  minecraft.class04439
 *  minecraft.class04457
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05935
 *  minecraft.class05936
 *  minecraft.class05977
 *  minecraft.class07321
 *  minecraft.class08262
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.datafixers.util.Either;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import minecraft.class00388;
import minecraft.class00405;
import minecraft.class00413;
import minecraft.class00414;
import minecraft.class00418;
import minecraft.class00421;
import minecraft.class00923;
import minecraft.class00926;
import minecraft.class01028;
import minecraft.class01751;
import minecraft.class01894;
import minecraft.class04439;
import minecraft.class04457;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05935;
import minecraft.class05936;
import minecraft.class05977;
import minecraft.class07321;
import minecraft.class08262;
import org.jspecify.annotations.Nullable;

public interface class00392
extends class05936,
Message {
    default public String getString() {
        return super.getString();
    }

    default public class05216 L() {
        return new class05216(this.method_10851(), new ArrayList<class00392>(this.method_10855()), this.method_10866());
    }

    public static class05216 L(String string) {
        return class05216.N((class04439)new class00388(string, null, class00388.N));
    }

    public class00405 method_10866();

    public List<class00392> method_10855();

    public static class05216 i() {
        return class05216.N((class04439)class01751.L);
    }

    default public List<class00392> u() {
        return this.N(class00405.N);
    }

    public static class05216 u(String string) {
        return class05216.N((class04439)new class00413(string));
    }

    public static class05216 y(String string) {
        return class05216.N((class04439)class01751.y((String)string));
    }

    public static class05216 y(String string, Object ... objectArray) {
        for (int i = 0; i < objectArray.length; ++i) {
            Object object = objectArray[i];
            if (class00388.N(object) || object instanceof class00392) continue;
            objectArray[i] = String.valueOf(object);
        }
        return class00392.N(string, objectArray);
    }

    public static class05216 y(String string, String string2) {
        return class05216.N((class04439)new class00421((Either<class08262, String>)Either.right((Object)string), string2));
    }

    default public class05216 y() {
        return class05216.N((class04439)this.method_10851());
    }

    public static class05216 N(class00926 class009262) {
        return class05216.N((class04439)new class00923(class009262));
    }

    public static class00392 N(Date date) {
        return class00392.y(date.toString());
    }

    public static class00392 N(Message message) {
        return message instanceof class00392 ? (class00392)message : class00392.y(message.getString());
    }

    public static class05216 N(class08262 class082622, Optional<class00392> optional) {
        return class05216.N((class04439)new class00414(class082622, optional));
    }

    public static class05216 N(class08262 class082622, String string) {
        return class05216.N((class04439)new class00421((Either<class08262, String>)Either.left((Object)class082622), string));
    }

    public static class05216 N(String string, boolean bl, Optional<class00392> optional, class04457 class044572) {
        return class05216.N((class04439)new class00418(string, bl, optional, class044572));
    }

    public static class00392 N(URI uRI) {
        return class00392.y(uRI.toString());
    }

    public static class00392 N(class07321 class073212) {
        return class00392.y(class073212.toString());
    }

    public static class00392 N(class01894 class018942) {
        return class00392.y(class018942.toString());
    }

    public static class00392 N(UUID uUID) {
        return class00392.y(uUID.toString());
    }

    public static class05216 N(String string, Object ... objectArray) {
        return class05216.N((class04439)new class00388(string, null, objectArray));
    }

    default public <T> Optional<T> N_8(class05977<T> class059772) {
        Optional optional = this.method_10851().method_27659(class059772);
        if (optional.isPresent()) {
            return optional;
        }
        Iterator<class00392> var3 = this.method_10855().iterator();
        while (var3.hasNext()) {
            Optional<T> optional2 = var3.next().N_8(class059772);
            if (!optional2.isPresent()) continue;
            return optional2;
        }
        return Optional.empty();
    }

    default public <T> Optional<T> N(class05935<T> class059352, class00405 class004052) {
        class00405 class004053 = this.method_10866().N(class004052);
        Optional optional = this.method_10851().method_27660(class059352, class004053);
        if (optional.isPresent()) {
            return optional;
        }
        Iterator<class00392> var5 = this.method_10855().iterator();
        while (var5.hasNext()) {
            Optional<T> optional2 = var5.next().N(class059352, class004053);
            if (!optional2.isPresent()) continue;
            return optional2;
        }
        return Optional.empty();
    }

    public static class00392 N(@Nullable String string) {
        return string != null ? class00392.y(string) : class05220.N;
    }

    default public boolean N(class00392 class003922) {
        List<class00392> var3;
        if (this.equals(class003922)) {
            return true;
        }
        List<class00392> var2 = this.u();
        return Collections.indexOfSubList(var2, var3 = class003922.N(this.method_10866())) != -1;
    }

    default public List<class00392> N(class00405 class004053) {
        ArrayList arrayList = Lists.newArrayList();
        this.N((class004052, string) -> {
            if (!string.isEmpty()) {
                arrayList.add(class00392.y(string).L(class004052));
            }
            return Optional.empty();
        }, class004053);
        return arrayList;
    }

    default public String N(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        this.N_8(string -> {
            int n2 = n - stringBuilder.length();
            if (n2 <= 0) {
                return L;
            }
            stringBuilder.append(string.length() <= n2 ? string : string.substring(0, n2));
            return Optional.empty();
        });
        return stringBuilder.toString();
    }

    default public @Nullable String N() {
        class04439 class044392 = this.method_10851();
        if (class044392 instanceof class01751) {
            class01751 class017512 = (class01751)class044392;
            if (this.method_10855().isEmpty() && this.method_10866().B()) {
                return class017512.comp_737();
            }
        }
        return null;
    }

    public static class05216 N(String string, @Nullable String string2, Object ... objectArray) {
        return class05216.N((class04439)new class00388(string, string2, objectArray));
    }

    public static class05216 N(String string, @Nullable String string2) {
        return class05216.N((class04439)new class00388(string, string2, class00388.N));
    }

    public class01028 method_30937();

    public class04439 method_10851();
}

