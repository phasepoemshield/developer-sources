/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  minecraft.class01055
 *  minecraft.class01623
 *  minecraft.class01894
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.resource.pack.FabricPack
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import minecraft.class01055;
import minecraft.class01250;
import minecraft.class01254;
import minecraft.class01272;
import minecraft.class01277;
import minecraft.class01623;
import minecraft.class01894;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.resource.pack.FabricPack;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class01257 {
    private final class01623 i;
    final List<class01055> N;
    final List<class01055> y;
    final Function<class01055, class01894> L;
    final Consumer<class01250> u;
    private final Consumer<class01623> R;

    void L() {
        this.i.y((Collection)Lists.reverse(this.N).stream().map(class01055::M).collect(ImmutableList.toImmutableList()));
    }

    public class01257(Consumer<class01250> consumer, Function<class01055, class01894> function, class01623 class016232, Consumer<class01623> consumer2) {
        this.u = consumer;
        this.L = function;
        this.i = class016232;
        this.N = Lists.newArrayList((Iterable)class016232.M());
        Collections.reverse(this.N);
        this.y = Lists.newArrayList((Iterable)class016232.u());
        this.y.removeAll(this.N);
        this.R = consumer2;
        this.N(consumer, function, class016232, consumer2, null);
    }

    public void i() {
        this.i.N();
        this.N.retainAll(this.i.u());
        this.y.clear();
        this.y.addAll(this.i.u());
        this.y.removeAll(this.N);
        this.N((CallbackInfo)null);
    }

    public void u() {
        this.L();
        this.R.accept(this.i);
    }

    public Stream<class01272> y() {
        return this.N.stream().map(class010552 -> new class01277(this, (class01055)class010552));
    }

    public Stream<class01272> N() {
        return this.y.stream().map(class010552 -> new class01254(this, (class01055)class010552));
    }

    private void N(Consumer consumer, Function function, class01623 class016232, Consumer consumer2, CallbackInfo callbackInfo) {
        this.N.removeIf(class010552 -> ((FabricPack)class010552).fabric$isHidden());
        this.y.removeIf(class010552 -> ((FabricPack)class010552).fabric$isHidden());
    }

    private void N(CallbackInfo callbackInfo) {
        this.N.removeIf(class010552 -> ((FabricPack)class010552).fabric$isHidden());
        this.y.removeIf(class010552 -> ((FabricPack)class010552).fabric$isHidden());
    }
}

