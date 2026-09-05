/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class00412
 *  minecraft.class02362
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class05216
 *  minecraft.class06563
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class00412;
import minecraft.class02362;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class05216;
import minecraft.class06563;

public final class class02717
extends Record {
    private final class03556<class00412> pattern;
    private final class06563 color;
    public static final Codec<class02717> N = RecordCodecBuilder.create(instance -> instance.group((App)class00412.L.fieldOf("pattern").forGetter(class02717::y), (App)class06563.field_41600.fieldOf("color").forGetter(class02717::L)).apply(instance, class02717::new));
    public static final class02362<class04247, class02717> y = class02362.N((class02362)class00412.u, class02717::y, (class02362)class06563.field_49259, class02717::L, class02717::new);

    public class06563 L() {
        return this.color;
    }

    public class02717(class03556<class00412> class035562, class06563 class065632) {
        this.pattern = class035562;
        this.color = class065632;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02717.class, "pattern;color", "pattern", "color"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02717.class, "pattern;color", "pattern", "color"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02717.class, "pattern;color", "pattern", "color"}, this);
    }

    public class03556<class00412> y() {
        return this.pattern;
    }

    public class05216 N() {
        return class00392.L((String)(((class00412)this.pattern.N()).y() + "." + this.color.y()));
    }
}

