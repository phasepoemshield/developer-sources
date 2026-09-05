/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01263
 *  minecraft.class05946
 *  minecraft.class06521
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class01263;
import minecraft.class05946;
import minecraft.class06521;

public final class class04930
extends Record {
    final class01263 settings;
    final List<class05946<class06521<?>>> known;
    final List<class05946<class06521<?>>> highlight;
    public static final Codec<class04930> u = RecordCodecBuilder.create(instance -> instance.group((App)class01263.y.forGetter(class04930::N), (App)class06521.M.listOf().fieldOf("recipes").forGetter(class04930::y), (App)class06521.M.listOf().fieldOf("toBeDisplayed").forGetter(class04930::L)).apply(instance, class04930::new));

    public List<class05946<class06521<?>>> L() {
        return this.highlight;
    }

    public class04930(class01263 class012632, List<class05946<class06521<?>>> list, List<class05946<class06521<?>>> list2) {
        this.settings = class012632;
        this.known = list;
        this.highlight = list2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04930.class, "settings;known;highlight", "settings", "known", "highlight"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04930.class, "settings;known;highlight", "settings", "known", "highlight"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04930.class, "settings;known;highlight", "settings", "known", "highlight"}, this);
    }

    public List<class05946<class06521<?>>> y() {
        return this.known;
    }

    public class01263 N() {
        return this.settings;
    }
}

