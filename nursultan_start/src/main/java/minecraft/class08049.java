/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class01762
 *  minecraft.class01787
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class03748
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class07280
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class01762;
import minecraft.class01787;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class03748;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07280;

public final class class08049
extends Record
implements class00381<class07280> {
    private final String owner;
    private final String objectiveName;
    private final int score;
    private final Optional<class00392> display;
    private final Optional<class01762> numberFormat;
    public static final class02362<class04247, class08049> N = class02362.N((class02362)class02389.s, class08049::N, (class02362)class02389.s, class08049::y, (class02362)class02389.B, class08049::L, (class02362)class03748.i, class08049::u, (class02362)class01787.u, class08049::M, class08049::new);

    public int L() {
        return this.score;
    }

    public Optional<class01762> M() {
        return this.numberFormat;
    }

    public class08049(String string, String string2, int n, Optional<class00392> optional, Optional<class01762> optional2) {
        this.owner = string;
        this.objectiveName = string2;
        this.score = n;
        this.display = optional;
        this.numberFormat = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08049.class, "owner;objectiveName;score;display;numberFormat", "owner", "objectiveName", "score", "display", "numberFormat"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08049.class, "owner;objectiveName;score;display;numberFormat", "owner", "objectiveName", "score", "display", "numberFormat"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08049.class, "owner;objectiveName;score;display;numberFormat", "owner", "objectiveName", "score", "display", "numberFormat"}, this);
    }

    public Optional<class00392> u() {
        return this.display;
    }

    public String y() {
        return this.objectiveName;
    }

    public String N() {
        return this.owner;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class08049> method_65080() {
        return class04248.NC;
    }
}

