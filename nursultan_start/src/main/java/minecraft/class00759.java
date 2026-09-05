/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03659
 *  minecraft.class03689
 *  minecraft.class04227
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05946
 *  minecraft.class06889
 *  minecraft.class07072
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import minecraft.class00821;
import minecraft.class03659;
import minecraft.class03689;
import minecraft.class04227;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05946;
import minecraft.class06889;
import minecraft.class07072;

public final class class00759
extends Record {
    private final List<class03659<class03689>> tags;
    private final Optional<class00821> directEntity;
    private final Optional<class00821> sourceEntity;
    private final Optional<Boolean> isDirect;
    public static final Codec<class00759> N = RecordCodecBuilder.create(instance -> instance.group((App)class03659.N((class05946)class04227.yN).listOf().optionalFieldOf("tags", List.of()).forGetter(class00759::N), (App)class00821.N.optionalFieldOf("direct_entity").forGetter(class00759::y), (App)class00821.N.optionalFieldOf("source_entity").forGetter(class00759::L), (App)Codec.BOOL.optionalFieldOf("is_direct").forGetter(class00759::u)).apply(instance, class00759::new));

    public Optional<class00821> L() {
        return this.sourceEntity;
    }

    public class00759(List<class03659<class03689>> list, Optional<class00821> optional, Optional<class00821> optional2, Optional<Boolean> optional3) {
        this.tags = list;
        this.directEntity = optional;
        this.sourceEntity = optional2;
        this.isDirect = optional3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00759.class, "tags;directEntity;sourceEntity;isDirect", "tags", "directEntity", "sourceEntity", "isDirect"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00759.class, "tags;directEntity;sourceEntity;isDirect", "tags", "directEntity", "sourceEntity", "isDirect"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00759.class, "tags;directEntity;sourceEntity;isDirect", "tags", "directEntity", "sourceEntity", "isDirect"}, this);
    }

    public Optional<Boolean> u() {
        return this.isDirect;
    }

    public Optional<class00821> y() {
        return this.directEntity;
    }

    public List<class03659<class03689>> N() {
        return this.tags;
    }

    public boolean N(class04782 class047822, class06889 class068892, class07072 class070722) {
        Iterator<class03659<class03689>> iterator = this.tags.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().N(class070722.E())) continue;
            return false;
        }
        if (this.directEntity.isPresent() && !this.directEntity.get().N(class047822, class068892, class070722.L())) {
            return false;
        }
        if (this.sourceEntity.isPresent() && !this.sourceEntity.get().N(class047822, class068892, class070722.u())) {
            return false;
        }
        return !this.isDirect.isPresent() || this.isDirect.get().booleanValue() == class070722.y();
    }

    public boolean N(class04770 class047702, class07072 class070722) {
        return this.N(class047702.method_51469(), class047702.method_73189(), class070722);
    }
}

