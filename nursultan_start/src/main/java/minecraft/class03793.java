/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class03502
 *  minecraft.class03556
 *  minecraft.class03978
 *  org.apache.commons.lang3.tuple.Pair
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import minecraft.class03502;
import minecraft.class03556;
import minecraft.class03978;
import org.apache.commons.lang3.tuple.Pair;

public class class03793 {
    public static final Codec<class03793> N = RecordCodecBuilder.create(instance -> instance.group((App)class03978.N.lenientOptionalFieldOf("event").forGetter(class037932 -> class037932.y.map(Pair::getLeft)), (App)Codec.LONG.fieldOf("tick").forGetter(class037932 -> (Long)class037932.y.map(Pair::getRight).orElse(-1L))).apply(instance, class03793::new));
    private Optional<Pair<class03978, Long>> y;

    public class03793(Optional<class03978> optional, long l) {
        this.y = optional.map(class039782 -> Pair.of((Object)class039782, (Object)l));
    }

    public class03793() {
        this.y = Optional.empty();
    }

    private boolean y(class03978 class039782, long l) {
        if (this.y.isEmpty()) {
            return true;
        }
        Pair<class03978, Long> var4 = this.y.get();
        long l2 = (Long)var4.getRight();
        if (l != l2) {
            return false;
        }
        class03978 class039783 = (class03978)var4.getLeft();
        if (class039782.y() < class039783.y()) {
            return true;
        }
        if (class039782.y() > class039783.y()) {
            return false;
        }
        return class03502.N((class03556)class039782.N()) > class03502.N((class03556)class039783.N());
    }

    public void N() {
        this.y = Optional.empty();
    }

    public void N(class03978 class039782, long l) {
        if (this.y(class039782, l)) {
            this.y = Optional.of(Pair.of((Object)class039782, (Object)l));
        }
    }

    public Optional<class03978> N(long l) {
        if (this.y.isEmpty()) {
            return Optional.empty();
        }
        if ((Long)this.y.get().getRight() < l) {
            return Optional.of((class03978)this.y.get().getLeft());
        }
        return Optional.empty();
    }
}

