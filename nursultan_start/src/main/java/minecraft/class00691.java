/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00744
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00681;
import minecraft.class00744;

public final class class00691
extends Record {
    private final class00744 head;
    private final class00744 body;
    private final class00744 leftArm;
    private final class00744 rightArm;
    private final class00744 leftLeg;
    private final class00744 rightLeg;
    public static final class00691 N = new class00691(class00681.y, class00681.L, class00681.u, class00681.i, class00681.R, class00681.M);
    public static final Codec<class00691> y = RecordCodecBuilder.create(instance -> instance.group((App)class00744.u.optionalFieldOf("Head", (Object)class00681.y).forGetter(class00691::N), (App)class00744.u.optionalFieldOf("Body", (Object)class00681.L).forGetter(class00691::y), (App)class00744.u.optionalFieldOf("LeftArm", (Object)class00681.u).forGetter(class00691::L), (App)class00744.u.optionalFieldOf("RightArm", (Object)class00681.i).forGetter(class00691::u), (App)class00744.u.optionalFieldOf("LeftLeg", (Object)class00681.R).forGetter(class00691::i), (App)class00744.u.optionalFieldOf("RightLeg", (Object)class00681.M).forGetter(class00691::R)).apply(instance, class00691::new));

    public class00744 L() {
        return this.leftArm;
    }

    public class00691(class00744 class007442, class00744 class007443, class00744 class007444, class00744 class007445, class00744 class007446, class00744 class007447) {
        this.head = class007442;
        this.body = class007443;
        this.leftArm = class007444;
        this.rightArm = class007445;
        this.leftLeg = class007446;
        this.rightLeg = class007447;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00691.class, "head;body;leftArm;rightArm;leftLeg;rightLeg", "head", "body", "leftArm", "rightArm", "leftLeg", "rightLeg"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00691.class, "head;body;leftArm;rightArm;leftLeg;rightLeg", "head", "body", "leftArm", "rightArm", "leftLeg", "rightLeg"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00691.class, "head;body;leftArm;rightArm;leftLeg;rightLeg", "head", "body", "leftArm", "rightArm", "leftLeg", "rightLeg"}, this);
    }

    public class00744 i() {
        return this.leftLeg;
    }

    public class00744 u() {
        return this.rightArm;
    }

    public class00744 y() {
        return this.body;
    }

    public class00744 N() {
        return this.head;
    }

    public class00744 R() {
        return this.rightLeg;
    }
}

