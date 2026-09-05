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
 *  minecraft.class00405
 *  minecraft.class00411
 *  minecraft.class00649
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04440
 *  minecraft.class06541
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00411;
import minecraft.class00649;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04440;
import minecraft.class06541;

public class class04475
extends Record {
    public List<class04440> parameters;
    public String translationKey;
    public class00405 style;
    public static Object u_0;
    public static Object u_1;

    public static class04475 L(String string) {
        return new class04475(string, List.of(class04440.TARGET, class04440.SENDER, class04440.CONTENT), class00405.N);
    }

    public List<class04440> L() {
        return this.parameters;
    }

    public class04475(String string, List<class04440> list, class00405 class004052) {
        this.translationKey = string;
        this.parameters = list;
        this.style = class004052;
    }

    static {
        class04475.B();
        u_0 = RecordCodecBuilder.create(instance -> instance.group((App)Codec.STRING.fieldOf("translation_key").forGetter(class04475::y), (App)((Codec)class04440.staticFields_0ec9e67d4a0683ab6bd6627d9711a269e_4).listOf().fieldOf("parameters").forGetter(class04475::L), (App)class00411.y.optionalFieldOf("style", (Object)class00405.N).forGetter(class04475::N)).apply(instance, class04475::new));
        Function<class04475, String> function = class04475::y;
        class02362 class023622 = class04440.staticFields_0ec9e67d4a0683ab6bd6627d9711a269e_5.N_33(class02389.N());
        Function<class04475, List> function2 = class04475::L;
        Function<class04475, class00405> function3 = class04475::N;
        u_1 = class02362.N((class02362)class02389.s, function, (class02362)class023622, function2, (class02362)class00411.L, function3, class04475::new);
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04475.class, "translationKey;parameters;style", "translationKey", "parameters", "style"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04475.class, "translationKey;parameters;style", "translationKey", "parameters", "style"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04475.class, "translationKey;parameters;style", "translationKey", "parameters", "style"}, this);
    }

    private static void B() {
        u_0 = null;
        u_1 = null;
    }

    public static class04475 u(String string) {
        class00405 class004052 = class00405.N.N(class06541.field_1080).y(Boolean.valueOf(true));
        return new class04475(string, List.of(class04440.TARGET, class04440.CONTENT), class004052);
    }

    public String y() {
        return this.translationKey;
    }

    private class00392[] y(class00392 class003922, class00649 class006492) {
        class00392[] class00392Array = new class00392[this.parameters.size()];
        for (int i = 0; i < class00392Array.length; ++i) {
            class04440 class044402 = this.parameters.get(i);
            class00392Array[i] = class044402.N(class003922, class006492);
        }
        return class00392Array;
    }

    public static class04475 y(String string) {
        return new class04475(string, List.of(class04440.SENDER, class04440.CONTENT), class00405.N);
    }

    public class00392 N(class00392 class003922, class00649 class006492) {
        Object[] objectArray = this.y(class003922, class006492);
        return class00392.N((String)this.translationKey, (Object[])objectArray).L(this.style);
    }

    public static class04475 N(String string) {
        class00405 class004052 = class00405.N.N(class06541.field_1080).y(Boolean.valueOf(true));
        return new class04475(string, List.of(class04440.SENDER, class04440.CONTENT), class004052);
    }

    public class00405 N() {
        return this.style;
    }
}

