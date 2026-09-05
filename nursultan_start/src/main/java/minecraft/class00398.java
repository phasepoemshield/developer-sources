/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01487
 *  minecraft.class03748
 *  minecraft.class04206
 *  minecraft.class07078
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import minecraft.class00392;
import minecraft.class01487;
import minecraft.class03748;
import minecraft.class04206;
import minecraft.class07078;
import org.jspecify.annotations.Nullable;

public class class00398 {
    public static final MapCodec<class00398> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04206.M.T().fieldOf("id").forGetter(class003982 -> class003982.y), (App)class01487.R.fieldOf("uuid").forGetter(class003982 -> class003982.L), (App)class03748.N.optionalFieldOf("name").forGetter(class003982 -> class003982.u)).apply(instance, class00398::new));
    public final class07078<?> y;
    public final UUID L;
    public final Optional<class00392> u;
    private @Nullable List<class00392> i;

    public class00398(class07078<?> class070782, UUID uUID, @Nullable class00392 class003922) {
        this(class070782, uUID, Optional.ofNullable(class003922));
    }

    public class00398(class07078<?> class070782, UUID uUID, Optional<class00392> optional) {
        this.y = class070782;
        this.L = uUID;
        this.u = optional;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        class00398 class003982 = (class00398)object;
        return this.y.equals(class003982.y) && this.L.equals(class003982.L) && this.u.equals(class003982.u);
    }

    public int hashCode() {
        int n = this.y.hashCode();
        n = 31 * n + this.L.hashCode();
        n = 31 * n + this.u.hashCode();
        return n;
    }

    public List<class00392> N() {
        if (this.i == null) {
            this.i = new ArrayList<class00392>();
            this.u.ifPresent(this.i::add);
            this.i.add((class00392)class00392.N("gui.entity_tooltip.type", this.y.M()));
            this.i.add((class00392)class00392.y(this.L.toString()));
        }
        return this.i;
    }
}

