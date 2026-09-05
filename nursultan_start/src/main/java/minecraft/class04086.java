/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01281
 *  minecraft.class01584
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06581
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01281;
import minecraft.class01584;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class06581;

public final class class04086
extends Record {
    private final class03556<class06581> displayItem;
    private final class01584 settings;
    public static final Codec<class04086> N = RecordCodecBuilder.create(instance -> instance.group((App)class06581.u.fieldOf("display").forGetter(class040862 -> class040862.displayItem), (App)class01584.N.fieldOf("settings").forGetter(class040862 -> class040862.settings)).apply(instance, class04086::new));
    public static final Codec<class03556<class04086>> y = class01281.N((class05946)class04227.yM, N);

    public class04086(class03556<class06581> class035562, class01584 class015842) {
        this.displayItem = class035562;
        this.settings = class015842;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04086.class, "displayItem;settings", "displayItem", "settings"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04086.class, "displayItem;settings", "displayItem", "settings"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04086.class, "displayItem;settings", "displayItem", "settings"}, this);
    }

    public class01584 y() {
        return this.settings;
    }

    public class03556<class06581> N() {
        return this.displayItem;
    }
}

