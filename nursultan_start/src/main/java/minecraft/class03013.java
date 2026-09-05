/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03028
 *  minecraft.class03029
 *  minecraft.class03979
 *  minecraft.class04017
 *  minecraft.class04018
 *  minecraft.class04039
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03003;
import minecraft.class03028;
import minecraft.class03029;
import minecraft.class03979;
import minecraft.class04017;
import minecraft.class04018;
import minecraft.class04039;

final class class03013
extends Record
implements class03028 {
    private final class04017 ifTrue;
    private final class03028 thenRun;
    static final class03979<class03013> N = class03979.N((MapCodec)RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04017.L.fieldOf("if_true").forGetter(class03013::y), (App)class03028.y.fieldOf("then_run").forGetter(class03013::L)).apply(instance, class03013::new)));

    public class03028 L() {
        return this.thenRun;
    }

    class03013(class04017 class040172, class03028 class030282) {
        this.ifTrue = class040172;
        this.thenRun = class030282;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03013.class, "ifTrue;thenRun", "ifTrue", "thenRun"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03013.class, "ifTrue;thenRun", "ifTrue", "thenRun"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03013.class, "ifTrue;thenRun", "ifTrue", "thenRun"}, this);
    }

    public class04017 y() {
        return this.ifTrue;
    }

    public class03979<? extends class03028> N() {
        return N;
    }

    public class03003 apply(class04039 class040392) {
        return new class03029((class04018)this.ifTrue.apply((Object)class040392), (class03003)this.thenRun.apply((Object)class040392));
    }
}

