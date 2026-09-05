/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02063
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05660
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02063;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05660;
import minecraft.class05672;
import minecraft.class05946;

public final class class05666
extends Record {
    private final class03556<class05660> type;
    private final class03556<class05672> profession;
    private final int level;
    public static final int N = 1;
    public static final int y = 5;
    private static final int[] B = new int[]{0, 10, 70, 150, 250};
    public static final Codec<class05666> L = RecordCodecBuilder.create(instance -> instance.group((App)class04206.l.b().fieldOf("type").orElseGet(() -> class04206.l.y(class05660.L)).forGetter(class056662 -> class056662.type), (App)class04206.d.b().fieldOf("profession").orElseGet(() -> class04206.d.y(class05672.y)).forGetter(class056662 -> class056662.profession), (App)Codec.INT.fieldOf("level").orElse((Object)1).forGetter(class056662 -> class056662.level)).apply(instance, class05666::new));
    public static final class02362<class04247, class05666> u = class02362.N((class02362)class02389.y((class05946)class04227.NH), class05666::N, (class02362)class02389.y((class05946)class04227.Ne), class05666::y, (class02362)class02389.B, class05666::L, class05666::new);

    public static int L(int n) {
        return class05666.u(n) ? B[n] : 0;
    }

    public int L() {
        return this.level;
    }

    public class05666(class03556<class05660> class035562, class03556<class05672> class035563, int n) {
        n = Math.max(1, n);
        this.type = class035562;
        this.profession = class035563;
        this.level = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05666.class, "type;profession;level", "type", "profession", "level"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05666.class, "type;profession;level", "type", "profession", "level"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05666.class, "type;profession;level", "type", "profession", "level"}, this);
    }

    public static boolean u(int n) {
        return n >= 1 && n < 5;
    }

    public class03556<class05672> y() {
        return this.profession;
    }

    public class05666 y(class02063 class020632, class05946<class05672> class059462) {
        return this.y((class03556<class05672>)class020632.i(class059462));
    }

    public static int y(int n) {
        return class05666.u(n) ? B[n - 1] : 0;
    }

    public class05666 y(class03556<class05672> class035562) {
        return new class05666(this.type, class035562, this.level);
    }

    public class05666 N(class03556<class05660> class035562) {
        return new class05666(class035562, this.profession, this.level);
    }

    public class05666 N(int n) {
        return new class05666(this.type, this.profession, n);
    }

    public class05666 N(class02063 class020632, class05946<class05660> class059462) {
        return this.N((class03556<class05660>)class020632.i(class059462));
    }

    public class03556<class05660> N() {
        return this.type;
    }
}

