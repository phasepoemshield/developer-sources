/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ReferenceLinkedOpenHashSet
 *  it.unimi.dsi.fastutil.objects.ReferenceSortedSets
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  java.util.SequencedSet
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02477
 *  minecraft.class04247
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ReferenceLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceSortedSets;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.SequencedSet;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02477;
import minecraft.class04247;

public final class class08562
extends Record {
    private final boolean hideTooltip;
    private final SequencedSet<class02477<?>> hiddenComponents;
    private static final Codec<SequencedSet<class02477<?>>> R = class02477.N.listOf().xmap(ReferenceLinkedOpenHashSet::new, List::copyOf);
    public static final Codec<class08562> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.BOOL.optionalFieldOf("hide_tooltip", (Object)false).forGetter(class08562::N), (App)R.optionalFieldOf("hidden_components", (Object)ReferenceSortedSets.emptySet()).forGetter(class08562::y)).apply(instance, class08562::new));
    public static final class02362<class04247, class08562> y = class02362.N((class02362)class02389.y, class08562::N, (class02362)class02477.y.N_33(class02389.N(ReferenceLinkedOpenHashSet::new)), class08562::y, class08562::new);
    public static final class08562 L = new class08562(false, (SequencedSet<class02477<?>>)ReferenceSortedSets.emptySet());

    public class08562(boolean bl, SequencedSet<class02477<?>> sequencedSet) {
        this.hideTooltip = bl;
        this.hiddenComponents = sequencedSet;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08562.class, "hideTooltip;hiddenComponents", "hideTooltip", "hiddenComponents"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08562.class, "hideTooltip;hiddenComponents", "hideTooltip", "hiddenComponents"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08562.class, "hideTooltip;hiddenComponents", "hideTooltip", "hiddenComponents"}, this);
    }

    public SequencedSet<class02477<?>> y() {
        return this.hiddenComponents;
    }

    public boolean N(class02477<?> class024772) {
        return !this.hideTooltip && !this.hiddenComponents.contains(class024772);
    }

    public boolean N() {
        return this.hideTooltip;
    }

    public class08562 N(class02477<?> class024772, boolean bl) {
        if (this.hiddenComponents.contains(class024772) == bl) {
            return this;
        }
        ReferenceLinkedOpenHashSet referenceLinkedOpenHashSet = new ReferenceLinkedOpenHashSet(this.hiddenComponents);
        if (bl) {
            referenceLinkedOpenHashSet.add(class024772);
        } else {
            referenceLinkedOpenHashSet.remove(class024772);
        }
        return new class08562(this.hideTooltip, (SequencedSet<class02477<?>>)referenceLinkedOpenHashSet);
    }
}

