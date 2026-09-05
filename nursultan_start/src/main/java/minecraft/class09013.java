/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 *  minecraft.class06584
 *  minecraft.class09034
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class06338;
import minecraft.class06584;
import minecraft.class09022;
import minecraft.class09034;

public final class class09013
extends Record
implements class09034 {
    private final class06584 item;
    private final Optional<class09022> description;
    private final boolean showDecorations;
    private final boolean showTooltip;
    private final int width;
    private final int height;
    public static final MapCodec<class09013> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06584.u.fieldOf("item").forGetter(class09013::y), (App)class09022.i.optionalFieldOf("description").forGetter(class09013::L), (App)Codec.BOOL.optionalFieldOf("show_decorations", (Object)true).forGetter(class09013::u), (App)Codec.BOOL.optionalFieldOf("show_tooltip", (Object)true).forGetter(class09013::i), (App)class06338.N((int)1, (int)256).optionalFieldOf("width", (Object)16).forGetter(class09013::R), (App)class06338.N((int)1, (int)256).optionalFieldOf("height", (Object)16).forGetter(class09013::M)).apply(instance, class09013::new));

    public Optional<class09022> L() {
        return this.description;
    }

    public int M() {
        return this.height;
    }

    public class09013(class06584 class065842, Optional<class09022> optional, boolean bl, boolean bl2, int n, int n2) {
        this.item = class065842;
        this.description = optional;
        this.showDecorations = bl;
        this.showTooltip = bl2;
        this.width = n;
        this.height = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09013.class, "item;description;showDecorations;showTooltip;width;height", "item", "description", "showDecorations", "showTooltip", "width", "height"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09013.class, "item;description;showDecorations;showTooltip;width;height", "item", "description", "showDecorations", "showTooltip", "width", "height"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09013.class, "item;description;showDecorations;showTooltip;width;height", "item", "description", "showDecorations", "showTooltip", "width", "height"}, this);
    }

    public boolean i() {
        return this.showTooltip;
    }

    public boolean u() {
        return this.showDecorations;
    }

    public class06584 y() {
        return this.item;
    }

    public MapCodec<class09013> N() {
        return L;
    }

    public int R() {
        return this.width;
    }
}

