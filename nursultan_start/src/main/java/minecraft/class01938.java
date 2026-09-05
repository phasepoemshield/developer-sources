/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class03556
 *  minecraft.class03689
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07280
 *  minecraft.class07299
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class03556;
import minecraft.class03689;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07280;
import minecraft.class07299;

public final class class01938
extends Record
implements class00381<class07280> {
    private final int entityId;
    private final class03556<class03689> sourceType;
    private final int sourceCauseId;
    private final int sourceDirectId;
    private final Optional<class06889> sourcePosition;
    public static final class02362<class04247, class01938> N = class00381.N(class01938::N, class01938::new);

    public int L() {
        return this.sourceCauseId;
    }

    public Optional<class06889> M() {
        return this.sourcePosition;
    }

    public class01938(class07049 class070492, class07072 class070722) {
        this(class070492.method_5628(), (class03556<class03689>)class070722.E(), class070722.u() != null ? class070722.u().method_5628() : -1, class070722.L() != null ? class070722.L().method_5628() : -1, Optional.ofNullable(class070722.z()));
    }

    public class01938(int n, class03556<class03689> class035562, int n2, int n3, Optional<class06889> optional) {
        this.entityId = n;
        this.sourceType = class035562;
        this.sourceCauseId = n2;
        this.sourceDirectId = n3;
        this.sourcePosition = optional;
    }

    private class01938(class04247 class042472) {
        this(class042472.E(), (class03556<class03689>)((class03556)class03689.L.decode((Object)class042472)), class01938.N((class00667)class042472), class01938.N((class00667)class042472), class042472.y(class006672 -> new class06889(class006672.readDouble(), class006672.readDouble(), class006672.readDouble())));
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01938.class, "entityId;sourceType;sourceCauseId;sourceDirectId;sourcePosition", "entityId", "sourceType", "sourceCauseId", "sourceDirectId", "sourcePosition"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01938.class, "entityId;sourceType;sourceCauseId;sourceDirectId;sourcePosition", "entityId", "sourceType", "sourceCauseId", "sourceDirectId", "sourcePosition"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01938.class, "entityId;sourceType;sourceCauseId;sourceDirectId;sourcePosition", "entityId", "sourceType", "sourceCauseId", "sourceDirectId", "sourcePosition"}, this);
    }

    public int u() {
        return this.sourceDirectId;
    }

    public class03556<class03689> y() {
        return this.sourceType;
    }

    public class07072 N(class07299 class072992) {
        if (this.sourcePosition.isPresent()) {
            return new class07072(this.sourceType, this.sourcePosition.get());
        }
        class07049 class070492 = class072992.method_8469(this.sourceCauseId);
        class07049 class070493 = class072992.method_8469(this.sourceDirectId);
        return new class07072(this.sourceType, class070493, class070492);
    }

    private static void N(class00667 class006672, int n) {
        class006672.L(n + 1);
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public int N() {
        return this.entityId;
    }

    private void N(class04247 class042472) {
        class042472.L(this.entityId);
        class03689.L.encode((Object)class042472, this.sourceType);
        class01938.N((class00667)class042472, this.sourceCauseId);
        class01938.N((class00667)class042472, this.sourceDirectId);
        class042472.N_13(this.sourcePosition, (class006672, class068892) -> {
            class006672.writeDouble(class068892.N());
            class006672.writeDouble(class068892.y());
            class006672.writeDouble(class068892.L());
        });
    }

    private static int N(class00667 class006672) {
        return class006672.E() - 1;
    }

    public class02897<class01938> method_65080() {
        return class04248.d;
    }
}

