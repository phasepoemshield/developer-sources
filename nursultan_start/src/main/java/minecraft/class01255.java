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
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class07376
 *  minecraft.class08088
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class07376;
import minecraft.class08088;

public final class class01255
extends Record {
    private final class03556<class07376> type;
    private final class08088 generator;
    public static final Codec<class01255> N = RecordCodecBuilder.create(instance -> instance.group((App)class07376.E.fieldOf("type").forGetter(class01255::N), (App)class08088.N.fieldOf("generator").forGetter(class01255::y)).apply(instance, instance.stable(class01255::new)));
    public static final class05946<class01255> y = class05946.N((class05946)class04227.yI, (class01894)class01894.y((String)"overworld"));
    public static final class05946<class01255> L = class05946.N((class05946)class04227.yI, (class01894)class01894.y((String)"the_nether"));
    public static final class05946<class01255> u = class05946.N((class05946)class04227.yI, (class01894)class01894.y((String)"the_end"));

    public class01255(class03556<class07376> class035562, class08088 class080882) {
        this.type = class035562;
        this.generator = class080882;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01255.class, "type;generator", "type", "generator"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01255.class, "type;generator", "type", "generator"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01255.class, "type;generator", "type", "generator"}, this);
    }

    public class08088 y() {
        return this.generator;
    }

    public class03556<class07376> N() {
        return this.type;
    }
}

