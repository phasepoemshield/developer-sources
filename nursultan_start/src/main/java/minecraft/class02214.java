/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00389
 *  minecraft.class00753
 *  minecraft.class04025
 *  minecraft.class04054
 *  minecraft.class05974
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00389;
import minecraft.class00753;
import minecraft.class04025;
import minecraft.class04054;
import minecraft.class05974;
import minecraft.class07209;

final class class02214
extends Record
implements class04025 {
    private final class00753 offset;
    public static MapCodec<class02214> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00753.field_25123.optionalFieldOf("offset", (Object)class00753.field_11176).forGetter(class02214::M)).apply(instance, class02214::new));

    public class00753 M() {
        return this.offset;
    }

    class02214(class00753 class007532) {
        this.offset = class007532;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02214.class, "offset", "offset"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02214.class, "offset", "offset"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02214.class, "offset", "offset"}, this);
    }

    public class04054<?> N() {
        return class04054.W;
    }

    public boolean test(class05974 class059742, class07209 class072092) {
        return class059742.method_8611(null, class00389.y().method_66507((class00753)class072092));
    }
}

