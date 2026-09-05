/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10096
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01818
 *  minecraft.class01894
 *  minecraft.class03979
 *  minecraft.class04017
 *  minecraft.class04018
 *  minecraft.class04039
 *  minecraft.class06055
 */
package minecraft;

import Nursultan.class10096;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01818;
import minecraft.class01894;
import minecraft.class03979;
import minecraft.class04017;
import minecraft.class04018;
import minecraft.class04039;
import minecraft.class06055;

public final class class03005
extends Record
implements class04017 {
    private final class01894 randomName;
    private final class06055 trueAtAndBelow;
    private final class06055 falseAtAndAbove;
    static final class03979<class03005> N = class03979.N((MapCodec)RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("random_name").forGetter(class03005::y), (App)class06055.N.fieldOf("true_at_and_below").forGetter(class03005::L), (App)class06055.N.fieldOf("false_at_and_above").forGetter(class03005::u)).apply(instance, class03005::new)));

    public class06055 L() {
        return this.trueAtAndBelow;
    }

    class03005(class01894 class018942, class06055 class060552, class06055 class060553) {
        this.randomName = class018942;
        this.trueAtAndBelow = class060552;
        this.falseAtAndAbove = class060553;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03005.class, "randomName;trueAtAndBelow;falseAtAndAbove", "randomName", "trueAtAndBelow", "falseAtAndAbove"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03005.class, "randomName;trueAtAndBelow;falseAtAndAbove", "randomName", "trueAtAndBelow", "falseAtAndAbove"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03005.class, "randomName;trueAtAndBelow;falseAtAndAbove", "randomName", "trueAtAndBelow", "falseAtAndAbove"}, this);
    }

    public class06055 u() {
        return this.falseAtAndAbove;
    }

    public class01894 y() {
        return this.randomName;
    }

    public class03979<? extends class04017> N() {
        return N;
    }

    public class04018 apply(class04039 class040392) {
        int n = this.L().N(class040392.B);
        int n2 = this.u().N(class040392.B);
        class01818 class018182 = class040392.R.N(this.y());
        return new class10096(this, class040392, n, n2, class018182);
    }
}

