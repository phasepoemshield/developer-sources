/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00768
 *  minecraft.class02265
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class07280
 *  minecraft.class07769
 *  minecraft.class07790
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import minecraft.class00381;
import minecraft.class00768;
import minecraft.class02265;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07280;
import minecraft.class07769;
import minecraft.class07790;
import org.jspecify.annotations.Nullable;

public final class class00480
extends Record
implements class00381<class07280> {
    private final class02265 mapId;
    private final byte scale;
    private final boolean locked;
    private final Optional<List<class00768>> decorations;
    private final Optional<class07790> colorPatch;
    public static final class02362<class04247, class00480> N = class02362.N((class02362)class02265.y, class00480::N, (class02362)class02389.L, class00480::y, (class02362)class02389.y, class00480::L, (class02362)class00768.N.N_33(class02389.N()).N_33(class02389::N), class00480::u, (class02362)class07790.N, class00480::M, class00480::new);

    public boolean L() {
        return this.locked;
    }

    public Optional<class07790> M() {
        return this.colorPatch;
    }

    public class00480(class02265 class022652, byte by, boolean bl, @Nullable Collection<class00768> collection, @Nullable class07790 class077902) {
        this(class022652, by, bl, collection != null ? Optional.of(List.copyOf(collection)) : Optional.empty(), Optional.ofNullable(class077902));
    }

    public class00480(class02265 class022652, byte by, boolean bl, Optional<List<class00768>> optional, Optional<class07790> optional2) {
        this.mapId = class022652;
        this.scale = by;
        this.locked = bl;
        this.decorations = optional;
        this.colorPatch = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00480.class, "mapId;scale;locked;decorations;colorPatch", "mapId", "scale", "locked", "decorations", "colorPatch"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00480.class, "mapId;scale;locked;decorations;colorPatch", "mapId", "scale", "locked", "decorations", "colorPatch"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00480.class, "mapId;scale;locked;decorations;colorPatch", "mapId", "scale", "locked", "decorations", "colorPatch"}, this);
    }

    public Optional<List<class00768>> u() {
        return this.decorations;
    }

    public byte y() {
        return this.scale;
    }

    public class02265 N() {
        return this.mapId;
    }

    public void N(class07769 class077692) {
        this.decorations.ifPresent(arg_0 -> ((class07769)class077692).N(arg_0));
        this.colorPatch.ifPresent(class077902 -> class077902.N(class077692));
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class00480> method_65080() {
        return class04248.C;
    }
}

