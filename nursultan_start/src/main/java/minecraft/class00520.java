/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00931
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class04540
 *  minecraft.class04891
 *  minecraft.class06889
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07280
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00381;
import minecraft.class00931;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class04540;
import minecraft.class04891;
import minecraft.class06889;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07280;

public final class class00520
extends Record
implements class00381<class07280> {
    private final class06889 center;
    private final float radius;
    private final int blockCount;
    private final Optional<class06889> playerKnockback;
    private final class07126 explosionParticle;
    private final class03556<class04891> explosionSound;
    private final class04540<class00931> blockParticles;
    public static final class02362<class04247, class00520> N = class02362.N((class02362)class06889.y, class00520::N, (class02362)class02389.E, class00520::y, (class02362)class02389.M, class00520::L, (class02362)class06889.y.N_33(class02389::N), class00520::u, (class02362)class07107.yW, class00520::M, (class02362)class04891.u, class00520::B, (class02362)class04540.N((class02362)class00931.y), class00520::Z, class00520::new);

    public int L() {
        return this.blockCount;
    }

    public class07126 M() {
        return this.explosionParticle;
    }

    public class00520(class06889 class068892, float f, int n, Optional<class06889> optional, class07126 class071262, class03556<class04891> class035562, class04540<class00931> class045402) {
        this.center = class068892;
        this.radius = f;
        this.blockCount = n;
        this.playerKnockback = optional;
        this.explosionParticle = class071262;
        this.explosionSound = class035562;
        this.blockParticles = class045402;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00520.class, "center;radius;blockCount;playerKnockback;explosionParticle;explosionSound;blockParticles", "center", "radius", "blockCount", "playerKnockback", "explosionParticle", "explosionSound", "blockParticles"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00520.class, "center;radius;blockCount;playerKnockback;explosionParticle;explosionSound;blockParticles", "center", "radius", "blockCount", "playerKnockback", "explosionParticle", "explosionSound", "blockParticles"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00520.class, "center;radius;blockCount;playerKnockback;explosionParticle;explosionSound;blockParticles", "center", "radius", "blockCount", "playerKnockback", "explosionParticle", "explosionSound", "blockParticles"}, this);
    }

    public class03556<class04891> B() {
        return this.explosionSound;
    }

    public class04540<class00931> Z() {
        return this.blockParticles;
    }

    public Optional<class06889> u() {
        return this.playerKnockback;
    }

    public float y() {
        return this.radius;
    }

    public class06889 N() {
        return this.center;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class00520> method_65080() {
        return class04248.q;
    }
}

