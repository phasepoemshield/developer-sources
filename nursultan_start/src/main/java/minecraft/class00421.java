/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00518
 *  minecraft.class01759
 *  minecraft.class01762
 *  minecraft.class01766
 *  minecraft.class01788
 *  minecraft.class02796
 *  minecraft.class04439
 *  minecraft.class05216
 *  minecraft.class06394
 *  minecraft.class07049
 *  minecraft.class07680
 *  minecraft.class07701
 *  minecraft.class08262
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class00518;
import minecraft.class01759;
import minecraft.class01762;
import minecraft.class01766;
import minecraft.class01788;
import minecraft.class02796;
import minecraft.class04439;
import minecraft.class05216;
import minecraft.class06394;
import minecraft.class07049;
import minecraft.class07680;
import minecraft.class07701;
import minecraft.class08262;
import org.jspecify.annotations.Nullable;

public final class class00421
extends Record
implements class04439 {
    private final Either<class08262, String> name;
    private final String objective;
    public static final MapCodec<class00421> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.either((Codec)class08262.N, (Codec)Codec.STRING).fieldOf("name").forGetter(class00421::y), (App)Codec.STRING.fieldOf("objective").forGetter(class00421::L)).apply(instance, class00421::new));
    public static final MapCodec<class00421> y = N.fieldOf("score");

    public String L() {
        return this.objective;
    }

    public class00421(Either<class08262, String> either, String string) {
        this.name = either;
        this.objective = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00421.class, "name;objective", "name", "objective"}, this, object);
    }

    public String toString() {
        return "score{name='" + String.valueOf(this.name) + "', objective='" + this.objective + "'}";
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00421.class, "name;objective", "name", "objective"}, this);
    }

    public Either<class08262, String> y() {
        return this.name;
    }

    public MapCodec<class00421> N() {
        return y;
    }

    private class05216 N(class01766 class017662, class07701 class077012) {
        class01788 class017882;
        class06394 class063942;
        class00518 class005182;
        class02796 class027962 = class077012.W();
        if (class027962 != null && (class005182 = (class063942 = class027962.yB()).N(this.objective)) != null && (class017882 = class063942.y(class017662, class005182)) != null) {
            return class017882.y(class005182.N((class01762)class01759.y));
        }
        return class00392.i();
    }

    public class05216 N(@Nullable class07701 class077012, @Nullable class07049 class070492, int n) throws CommandSyntaxException {
        if (class077012 == null) {
            return class00392.i();
        }
        class01766 class017662 = this.N(class077012);
        class01766 class017663 = class070492 != null && class017662.equals((Object)class01766.Ni) ? class070492 : class017662;
        return this.N(class017663, class077012);
    }

    private class01766 N(class07701 class077012) throws CommandSyntaxException {
        Optional var2 = this.name.left();
        if (var2.isPresent()) {
            List var3 = ((class08262)var2.get()).y().y(class077012);
            if (!var3.isEmpty()) {
                if (var3.size() != 1) {
                    throw class07680.N.create();
                }
                return (class01766)var3.getFirst();
            }
            return class01766.N((String)((class08262)var2.get()).N());
        }
        return class01766.N((String)((String)this.name.right().orElseThrow()));
    }
}

