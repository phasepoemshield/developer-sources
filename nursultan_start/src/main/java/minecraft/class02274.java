/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet
 *  minecraft.class01487
 *  minecraft.class04782
 *  minecraft.class06584
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import minecraft.class01487;
import minecraft.class02281;
import minecraft.class02296;
import minecraft.class04782;
import minecraft.class06584;
import minecraft.class07209;

public class class02274 {
    static final String N = "shared_data";
    static Codec<class02274> y = RecordCodecBuilder.create(instance -> instance.group((App)class06584.N((String)"display_item").forGetter(class022742 -> class022742.u), (App)class01487.L.lenientOptionalFieldOf("connected_players", Set.of()).forGetter(class022742 -> class022742.i), (App)Codec.DOUBLE.lenientOptionalFieldOf("connected_particles_range", (Object)class02281.y.u()).forGetter(class022742 -> class022742.R)).apply(instance, class02274::new));
    private class06584 u = class06584.E;
    private Set<UUID> i = new ObjectLinkedOpenHashSet();
    private double R = class02281.y.u();
    boolean L;

    boolean L() {
        return !this.i.isEmpty();
    }

    class02274(class06584 class065842, Set<UUID> set, double d) {
        this.u = class065842;
        this.i.addAll(set);
        this.R = d;
    }

    class02274() {
    }

    double i() {
        return this.R;
    }

    Set<UUID> u() {
        return this.i;
    }

    public boolean y() {
        return !this.u.R();
    }

    public class06584 N() {
        return this.u;
    }

    void N(class04782 class047822, class07209 class072092, class02296 class022962, class02281 class022812, double d) {
        Set set = class022812.N().detect(class047822, class022812.M(), class072092, d, false).stream().filter(uUID -> !class022962.y().contains(uUID)).collect(Collectors.toSet());
        if (!this.i.equals(set)) {
            this.i = set;
            this.R();
        }
    }

    public void N(class06584 class065842) {
        if (class06584.N((class06584)this.u, (class06584)class065842)) {
            return;
        }
        this.u = class065842.t();
        this.R();
    }

    void N(class02274 class022742) {
        this.u = class022742.u;
        this.i = class022742.i;
        this.R = class022742.R;
    }

    private void R() {
        this.L = true;
    }
}

