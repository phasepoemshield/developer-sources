/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06584
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06584;

final class class02809
extends Record {
    private final int index;
    private final class06584 item;
    public static final Codec<class02809> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.intRange((int)0, (int)255).fieldOf("slot").forGetter(class02809::N), (App)class06584.y.fieldOf("item").forGetter(class02809::y)).apply(instance, class02809::new));

    class02809(int n, class06584 class065842) {
        this.index = n;
        this.item = class065842;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02809.class, "index;item", "index", "item"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02809.class, "index;item", "index", "item"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02809.class, "index;item", "index", "item"}, this);
    }

    public class06584 y() {
        return this.item;
    }

    public int N() {
        return this.index;
    }
}

