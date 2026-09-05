/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03539
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03539;
import minecraft.class03556;
import minecraft.class03691;
import minecraft.class03699;
import minecraft.class03700;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;

public final class class03689
extends Record {
    private final String msgId;
    private final class03691 scaling;
    private final float exhaustion;
    private final class03699 effects;
    private final class03700 deathMessageType;
    public static final Codec<class03689> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.STRING.fieldOf("message_id").forGetter(class03689::N), (App)class03691.field_42288.fieldOf("scaling").forGetter(class03689::y), (App)Codec.FLOAT.fieldOf("exhaustion").forGetter(class03689::L), (App)class03699.field_42281.optionalFieldOf("effects", (Object)class03699.field_42275).forGetter(class03689::u), (App)class03700.field_42364.optionalFieldOf("death_message_type", (Object)class03700.field_42361).forGetter(class03689::i)).apply(instance, class03689::new));
    public static final Codec<class03556<class03689>> y = class03539.N((class05946)class04227.yN);
    public static final class02362<class04247, class03556<class03689>> L = class02389.y((class05946)class04227.yN);

    public float L() {
        return this.exhaustion;
    }

    public class03689(String string, class03691 class036912, float f, class03699 class036992, class03700 class037002) {
        this.msgId = string;
        this.scaling = class036912;
        this.exhaustion = f;
        this.effects = class036992;
        this.deathMessageType = class037002;
    }

    public class03689(String string, float f) {
        this(string, class03691.field_42286, f);
    }

    public class03689(String string, class03691 class036912, float f) {
        this(string, class036912, f, class03699.field_42275, class03700.field_42361);
    }

    public class03689(String string, class03691 class036912, float f, class03699 class036992) {
        this(string, class036912, f, class036992, class03700.field_42361);
    }

    public class03689(String string, float f, class03699 class036992) {
        this(string, class03691.field_42286, f, class036992);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03689.class, "msgId;scaling;exhaustion;effects;deathMessageType", "msgId", "scaling", "exhaustion", "effects", "deathMessageType"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03689.class, "msgId;scaling;exhaustion;effects;deathMessageType", "msgId", "scaling", "exhaustion", "effects", "deathMessageType"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03689.class, "msgId;scaling;exhaustion;effects;deathMessageType", "msgId", "scaling", "exhaustion", "effects", "deathMessageType"}, this);
    }

    public class03700 i() {
        return this.deathMessageType;
    }

    public class03699 u() {
        return this.effects;
    }

    public class03691 y() {
        return this.scaling;
    }

    public String N() {
        return this.msgId;
    }
}

