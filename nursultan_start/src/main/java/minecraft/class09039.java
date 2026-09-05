/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class03748
 *  minecraft.class08782
 *  minecraft.class09009
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class03748;
import minecraft.class08782;
import minecraft.class09009;
import minecraft.class09034;

public final class class09039
extends Record {
    private final class00392 title;
    private final Optional<class00392> externalTitle;
    private final boolean canCloseWithEscape;
    private final boolean pause;
    private final class08782 afterAction;
    private final List<class09034> body;
    private final List<class09009> inputs;
    public static final MapCodec<class09039> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03748.N.fieldOf("title").forGetter(class09039::y), (App)class03748.N.optionalFieldOf("external_title").forGetter(class09039::L), (App)Codec.BOOL.optionalFieldOf("can_close_with_escape", (Object)true).forGetter(class09039::u), (App)Codec.BOOL.optionalFieldOf("pause", (Object)true).forGetter(class09039::i), (App)class08782.field_60966.optionalFieldOf("after_action", (Object)class08782.field_60962).forGetter(class09039::R), (App)class09034.y.optionalFieldOf("body", List.of()).forGetter(class09039::M), (App)class09009.N.listOf().optionalFieldOf("inputs", List.of()).forGetter(class09039::B)).apply(instance, class09039::new)).validate(class090392 -> {
        if (class090392.pause && !class090392.afterAction.N()) {
            return DataResult.error(() -> "Dialogs that pause the game must use after_action values that unpause it after user action!");
        }
        return DataResult.success((Object)class090392);
    });

    public Optional<class00392> L() {
        return this.externalTitle;
    }

    public List<class09034> M() {
        return this.body;
    }

    public class09039(class00392 class003922, Optional<class00392> optional, boolean bl, boolean bl2, class08782 class087822, List<class09034> list, List<class09009> list2) {
        this.title = class003922;
        this.externalTitle = optional;
        this.canCloseWithEscape = bl;
        this.pause = bl2;
        this.afterAction = class087822;
        this.body = list;
        this.inputs = list2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09039.class, "title;externalTitle;canCloseWithEscape;pause;afterAction;body;inputs", "title", "externalTitle", "canCloseWithEscape", "pause", "afterAction", "body", "inputs"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09039.class, "title;externalTitle;canCloseWithEscape;pause;afterAction;body;inputs", "title", "externalTitle", "canCloseWithEscape", "pause", "afterAction", "body", "inputs"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09039.class, "title;externalTitle;canCloseWithEscape;pause;afterAction;body;inputs", "title", "externalTitle", "canCloseWithEscape", "pause", "afterAction", "body", "inputs"}, this);
    }

    public List<class09009> B() {
        return this.inputs;
    }

    public boolean i() {
        return this.pause;
    }

    public boolean u() {
        return this.canCloseWithEscape;
    }

    public class00392 y() {
        return this.title;
    }

    public class00392 N() {
        return this.externalTitle.orElse(this.title);
    }

    public class08782 R() {
        return this.afterAction;
    }
}

