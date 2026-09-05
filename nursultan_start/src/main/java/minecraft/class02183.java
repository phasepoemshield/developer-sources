/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class05908
 *  minecraft.class06339
 *  minecraft.class06341
 *  minecraft.class06378
 *  minecraft.class07001
 *  minecraft.class07709
 *  minecraft.class07737
 *  minecraft.class07793
 */
package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class01894;
import minecraft.class05908;
import minecraft.class06339;
import minecraft.class06341;
import minecraft.class06378;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class07737;
import minecraft.class07793;

public final class class02183
extends Record
implements class06378 {
    private final class01894 storage;
    private final class07793 path;
    public static final MapCodec<class02183> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("storage").forGetter(class02183::L), (App)class07793.N.fieldOf("path").forGetter(class02183::u)).apply(instance, class02183::new));

    public class01894 L() {
        return this.storage;
    }

    public class02183(class01894 class018942, class07793 class077932) {
        this.storage = class018942;
        this.path = class077932;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02183.class, "storage;path", "storage", "path"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02183.class, "storage;path", "storage", "path"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02183.class, "storage;path", "storage", "path"}, this);
    }

    public class07793 u() {
        return this.path;
    }

    public float y(class05908 class059082) {
        return this.N(class059082, Float.valueOf(0.0f)).floatValue();
    }

    private Number N(class05908 class059082, Number number) {
        class07001 class070012 = class059082.u().method_8503().yZ().N(this.storage);
        try {
            Object object;
            List list = this.path.N((class07709)class070012);
            if (list.size() == 1 && (object = list.getFirst()) instanceof class07737) {
                return ((class07737)object).W();
            }
        }
        catch (CommandSyntaxException commandSyntaxException) {
            // empty catch block
        }
        return number;
    }

    public int N(class05908 class059082) {
        return this.N(class059082, 0).intValue();
    }

    public class06341 N() {
        return class06339.R;
    }
}

