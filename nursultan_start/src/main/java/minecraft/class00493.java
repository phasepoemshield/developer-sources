/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01762
 *  minecraft.class01787
 *  minecraft.class03748
 *  minecraft.class06640
 *  minecraft.class06675
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class01762;
import minecraft.class01787;
import minecraft.class03748;
import minecraft.class06640;
import minecraft.class06675;

public final class class00493
extends Record {
    private final String name;
    private final class06675 criteria;
    private final class00392 displayName;
    private final class06640 renderType;
    private final boolean displayAutoUpdate;
    private final Optional<class01762> numberFormat;
    public static final Codec<class00493> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.STRING.fieldOf("Name").forGetter(class00493::N), (App)class06675.N.optionalFieldOf("CriteriaName", (Object)class06675.y).forGetter(class00493::y), (App)class03748.N.fieldOf("DisplayName").forGetter(class00493::L), (App)class06640.field_41683.optionalFieldOf("RenderType", (Object)class06640.field_1472).forGetter(class00493::u), (App)Codec.BOOL.optionalFieldOf("display_auto_update", (Object)false).forGetter(class00493::i), (App)class01787.y.optionalFieldOf("format").forGetter(class00493::R)).apply(instance, class00493::new));

    public class00392 L() {
        return this.displayName;
    }

    public class00493(String string, class06675 class066752, class00392 class003922, class06640 class066402, boolean bl, Optional<class01762> optional) {
        this.name = string;
        this.criteria = class066752;
        this.displayName = class003922;
        this.renderType = class066402;
        this.displayAutoUpdate = bl;
        this.numberFormat = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00493.class, "name;criteria;displayName;renderType;displayAutoUpdate;numberFormat", "name", "criteria", "displayName", "renderType", "displayAutoUpdate", "numberFormat"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00493.class, "name;criteria;displayName;renderType;displayAutoUpdate;numberFormat", "name", "criteria", "displayName", "renderType", "displayAutoUpdate", "numberFormat"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00493.class, "name;criteria;displayName;renderType;displayAutoUpdate;numberFormat", "name", "criteria", "displayName", "renderType", "displayAutoUpdate", "numberFormat"}, this);
    }

    public boolean i() {
        return this.displayAutoUpdate;
    }

    public class06640 u() {
        return this.renderType;
    }

    public class06675 y() {
        return this.criteria;
    }

    public String N() {
        return this.name;
    }

    public Optional<class01762> R() {
        return this.numberFormat;
    }
}

