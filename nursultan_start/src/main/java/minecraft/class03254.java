/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11647
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02666
 *  minecraft.class02694
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class05220
 *  minecraft.class05946
 *  minecraft.class06497
 *  minecraft.class06541
 *  minecraft.class06591
 *  minecraft.class07536
 *  minecraft.class08569
 */
package minecraft;

import Nursultan.class11647;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02666;
import minecraft.class02694;
import minecraft.class03246;
import minecraft.class03252;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class05220;
import minecraft.class05946;
import minecraft.class06497;
import minecraft.class06541;
import minecraft.class06591;
import minecraft.class07536;
import minecraft.class08569;

public final class class03254
extends Record
implements class02694 {
    private final class03556<class03252> material;
    private final class03556<class03246> pattern;
    public static final Codec<class03254> N = RecordCodecBuilder.create(instance -> instance.group((App)class03252.L.fieldOf("material").forGetter(class03254::N), (App)class03246.L.fieldOf("pattern").forGetter(class03254::y)).apply(instance, class03254::new));
    public static final class02362<class04247, class03254> y = class02362.N(class03252.u, class03254::N, class03246.u, class03254::y, class03254::new);
    private static final class00392 i = class00392.L((String)class07536.N((String)"item", (class01894)class01894.y((String)"smithing_template.upgrade"))).N(class06541.field_1080);

    public class03254(class03556<class03252> class035562, class03556<class03246> class035563) {
        this.material = class035562;
        this.pattern = class035563;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03254.class, "material;pattern", "material", "pattern"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03254.class, "material;pattern", "material", "pattern"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03254.class, "material;pattern", "material", "pattern"}, this);
    }

    public class03556<class03246> y() {
        return this.pattern;
    }

    public class01894 N(String string, class05946<class11647> class059462) {
        class08569 class085692 = ((class03252)((Object)this.N().N())).N().N(class059462);
        return ((class03246)((Object)this.y().N())).N().N(string2 -> string + "/" + string2 + "_" + class085692.N());
    }

    public class03556<class03252> N() {
        return this.material;
    }

    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
        consumer.accept(i);
        consumer.accept((class00392)class05220.N().y(((class03246)((Object)this.pattern.N())).N(this.material)));
        consumer.accept((class00392)class05220.N().y(((class03252)((Object)this.material.N())).y()));
    }
}

