/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class04891
 *  minecraft.class06584
 *  minecraft.class07299
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02362;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class04891;
import minecraft.class06584;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08200;
import minecraft.class08217;

public final class class08229
extends Record
implements class08200 {
    private final class03556<class04891> sound;
    public static final MapCodec<class08229> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04891.y.fieldOf("sound").forGetter(class08229::y)).apply(instance, class08229::new));
    public static final class02362<class04247, class08229> y = class02362.N((class02362)class04891.u, class08229::y, class08229::new);

    public class08229(class03556<class04891> class035562) {
        this.sound = class035562;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08229.class, "sound", "sound"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08229.class, "sound", "sound"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08229.class, "sound", "sound"}, this);
    }

    public class03556<class04891> y() {
        return this.sound;
    }

    @Override
    public boolean N(class07299 class072992, class06584 class065842, class07438 class074382) {
        class072992.method_8396(null, class074382.method_24515(), (class04891)this.sound.N(), class074382.method_5634(), 1.0f, 1.0f);
        return true;
    }

    public class08217<class08229> N() {
        return class08217.i;
    }
}

