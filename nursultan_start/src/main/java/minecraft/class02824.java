/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class07468
 *  minecraft.class07471
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02831;
import minecraft.class02834;
import minecraft.class02846;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class07468;
import minecraft.class07471;

public final class class02824
extends Record {
    final class03556<class07468> attribute;
    final class07471 modifier;
    final class02834 slot;
    final class02831 display;
    public static final Codec<class02824> i = RecordCodecBuilder.create(instance -> instance.group((App)class07468.N.fieldOf("type").forGetter(class02824::N), (App)class07471.N.forGetter(class02824::y), (App)class02834.field_49226.optionalFieldOf("slot", (Object)class02834.field_49216).forGetter(class02824::L), (App)class02831.N.optionalFieldOf("display", (Object)class02846.L).forGetter(class02824::u)).apply(instance, class02824::new));
    public static final class02362<class04247, class02824> R = class02362.N((class02362)class07468.y, class02824::N, (class02362)class07471.L, class02824::y, class02834.field_49227, class02824::L, class02831.y, class02824::u, class02824::new);

    public class02834 L() {
        return this.slot;
    }

    public class02824(class03556<class07468> class035562, class07471 class074712, class02834 class028342) {
        this(class035562, class074712, class028342, class02831.N());
    }

    public class02824(class03556<class07468> class035562, class07471 class074712, class02834 class028342, class02831 class028312) {
        this.attribute = class035562;
        this.modifier = class074712;
        this.slot = class028342;
        this.display = class028312;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02824.class, "attribute;modifier;slot;display", "attribute", "modifier", "slot", "display"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02824.class, "attribute;modifier;slot;display", "attribute", "modifier", "slot", "display"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02824.class, "attribute;modifier;slot;display", "attribute", "modifier", "slot", "display"}, this);
    }

    public class02831 u() {
        return this.display;
    }

    public class07471 y() {
        return this.modifier;
    }

    public class03556<class07468> N() {
        return this.attribute;
    }

    public boolean N(class03556<class07468> class035562, class01894 class018942) {
        return class035562.equals(this.attribute) && this.modifier.N(class018942);
    }
}

