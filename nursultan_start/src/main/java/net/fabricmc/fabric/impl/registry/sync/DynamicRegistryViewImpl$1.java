/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01012
 *  minecraft.class01022
 *  minecraft.class05946
 */
package net.fabricmc.fabric.impl.registry.sync;

import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01012;
import minecraft.class01022;
import minecraft.class05946;
import net.fabricmc.fabric.impl.registry.sync.DynamicRegistryViewImpl;

class DynamicRegistryViewImpl$1
implements class01022 {
    final /* synthetic */ DynamicRegistryViewImpl this$0;

    DynamicRegistryViewImpl$1(DynamicRegistryViewImpl dynamicRegistryViewImpl) {
        this.this$0 = dynamicRegistryViewImpl;
    }

    private <T> class01012<T> entry(class00751<T> class007512) {
        return new class01012(class007512.i(), class007512);
    }

    public <T> Optional<class00751<T>> method_46759(class05946<? extends class00751<? extends T>> class059462) {
        return Optional.ofNullable(this.this$0.registries.get(class059462));
    }

    public Stream<class01012<?>> method_40311() {
        return this.this$0.stream().map(this::entry);
    }

    public class01022 method_40316() {
        return this;
    }
}

