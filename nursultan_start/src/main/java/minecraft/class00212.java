/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00392
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class05216
 *  minecraft.class05523
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;
import minecraft.class00195;
import minecraft.class00201;
import minecraft.class00225;
import minecraft.class00392;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class05216;
import minecraft.class05523;
import minecraft.class05946;

public class class00212
extends class00201 {
    public static final MapCodec<class00212> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05946.N((class05946)class04227.NJ).fieldOf("function").forGetter(class00212::T), (App)class00195.N.forGetter(class00201::m)).apply(instance, class00212::new));
    private final class05946<Consumer<class05523>> L;

    @Override
    public class00392 L() {
        return this.P().y((class00392)this.N("test_instance.description.function", this.L.N().toString())).y(this.s());
    }

    private class05946<Consumer<class05523>> T() {
        return this.L;
    }

    public class00212(class05946<Consumer<class05523>> class059462, class00195<class03556<class00225>> class001952) {
        super(class001952);
        this.L = class059462;
    }

    @Override
    protected class05216 y() {
        return class00392.L((String)"test_instance.type.function");
    }

    @Override
    public void N(class05523 class055232) {
        class055232.N().method_30349().u(this.L).map(class03529::N).orElseThrow(() -> new IllegalStateException("Trying to access missing test function: " + String.valueOf(this.L.N()))).accept(class055232);
    }

    public MapCodec<class00212> N() {
        return N;
    }
}

