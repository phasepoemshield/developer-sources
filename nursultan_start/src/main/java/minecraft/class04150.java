/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01603
 *  minecraft.class02968
 *  minecraft.class08735
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.regex.Pattern;
import minecraft.class01603;
import minecraft.class02968;
import minecraft.class04152;
import minecraft.class08735;

public final class class04150
extends Record {
    private final List<class04152> overlays;
    private static final Pattern u = Pattern.compile("[-_a-zA-Z0-9.]+");
    public static final class02968<class04150> N = new class02968("overlays", class04150.N(class01603.field_14188));
    public static final class02968<class04150> y = new class02968("overlays", class04150.N(class01603.field_14190));

    public class04150(List<class04152> list) {
        this.overlays = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04150.class, "overlays", "overlays"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04150.class, "overlays", "overlays"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04150.class, "overlays", "overlays"}, this);
    }

    public static class02968<class04150> y(class01603 class016032) {
        return switch (class016032) {
            default -> throw new MatchException(null, null);
            case class01603.field_14188 -> N;
            case class01603.field_14190 -> y;
        };
    }

    public static Codec<class04150> N(class01603 class016032) {
        return RecordCodecBuilder.create(instance -> instance.group((App)class04152.N(class016032).fieldOf("entries").forGetter(class04150::N)).apply((Applicative)instance, class04150::new));
    }

    public List<class04152> N() {
        return this.overlays;
    }

    public static DataResult<String> N(String string) {
        if (!u.matcher(string).matches()) {
            return DataResult.error(() -> string + " is not accepted directory name");
        }
        return DataResult.success((Object)string);
    }

    public List<String> N(class08735 class087352) {
        return this.overlays.stream().filter(class041522 -> class041522.N(class087352)).map(class04152::y).toList();
    }
}

