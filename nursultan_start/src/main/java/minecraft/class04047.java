/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class03000
 *  minecraft.class03003
 *  minecraft.class03028
 *  minecraft.class03979
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00500;
import minecraft.class03000;
import minecraft.class03003;
import minecraft.class03028;
import minecraft.class03979;
import minecraft.class04039;

final class class04047
extends Record
implements class03028 {
    private final class00500 resultState;
    private final class03000 rule;
    static final class03979<class04047> N = class03979.N((MapCodec)class00500.N.xmap(class04047::new, class04047::y).fieldOf("result_state"));

    public class03000 L() {
        return this.rule;
    }

    class04047(class00500 class005002) {
        this(class005002, new class03000(class005002));
    }

    private class04047(class00500 class005002, class03000 class030002) {
        this.resultState = class005002;
        this.rule = class030002;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04047.class, "resultState;rule", "resultState", "rule"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04047.class, "resultState;rule", "resultState", "rule"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04047.class, "resultState;rule", "resultState", "rule"}, this);
    }

    public class00500 y() {
        return this.resultState;
    }

    public class03979<? extends class03028> N() {
        return N;
    }

    public class03003 apply(class04039 class040392) {
        return this.rule;
    }
}

