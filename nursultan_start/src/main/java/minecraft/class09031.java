/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class08734
 *  minecraft.class08752
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class08734;
import minecraft.class08752;
import minecraft.class09032;
import minecraft.class09039;

public final class class09031
extends Record
implements class09032 {
    private final class09039 common;
    private final class08734 yesButton;
    private final class08734 noButton;
    public static final MapCodec<class09031> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class09039.N.forGetter(class09031::H_), (App)class08734.N.fieldOf("yes").forGetter(class09031::i), (App)class08734.N.fieldOf("no").forGetter(class09031::R)).apply(instance, class09031::new));

    public class09031(class09039 class090392, class08734 class087342, class08734 class087343) {
        this.common = class090392;
        this.yesButton = class087342;
        this.noButton = class087343;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09031.class, "common;yesButton;noButton", "common", "yesButton", "noButton"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09031.class, "common;yesButton;noButton", "common", "yesButton", "noButton"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09031.class, "common;yesButton;noButton", "common", "yesButton", "noButton"}, this);
    }

    public class08734 i() {
        return this.yesButton;
    }

    @Override
    public Optional<class08752> u() {
        return this.noButton.y();
    }

    @Override
    public List<class08734> y() {
        return List.of(this.yesButton, this.noButton);
    }

    public MapCodec<class09031> N() {
        return N;
    }

    public class08734 R() {
        return this.noButton;
    }

    @Override
    public class09039 H_() {
        return this.common;
    }
}

