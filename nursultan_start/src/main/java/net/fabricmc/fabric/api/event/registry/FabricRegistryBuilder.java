/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 *  minecraft.class00731
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class02819
 *  minecraft.class05946
 *  minecraft.class07099
 *  minecraft.class07219
 *  net.fabricmc.fabric.mixin.registry.sync.BuiltInRegistriesAccessor
 */
package net.fabricmc.fabric.api.event.registry;

import com.mojang.serialization.Lifecycle;
import java.util.EnumSet;
import minecraft.class00731;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class02819;
import minecraft.class05946;
import minecraft.class07099;
import minecraft.class07219;
import net.fabricmc.fabric.api.event.registry.RegistryAttribute;
import net.fabricmc.fabric.api.event.registry.RegistryAttributeHolder;
import net.fabricmc.fabric.mixin.registry.sync.BuiltInRegistriesAccessor;

public final class FabricRegistryBuilder<T, R extends class07099<T>> {
    private final R registry;
    private final EnumSet<RegistryAttribute> attributes = EnumSet.noneOf(RegistryAttribute.class);

    private FabricRegistryBuilder(R r) {
        this.registry = r;
        this.attribute(RegistryAttribute.MODDED);
    }

    public static <T, R extends class07099<T>> FabricRegistryBuilder<T, R> from(R r) {
        return new FabricRegistryBuilder<T, R>(r);
    }

    public FabricRegistryBuilder<T, R> attribute(RegistryAttribute registryAttribute) {
        this.attributes.add(registryAttribute);
        return this;
    }

    @Deprecated
    public static <T> FabricRegistryBuilder<T, class00731<T>> createSimple(Class<T> clazz, class01894 class018942) {
        return FabricRegistryBuilder.createSimple(class05946.N((class01894)class018942));
    }

    public static <T> FabricRegistryBuilder<T, class00731<T>> createSimple(class05946<class00751<T>> class059462) {
        return FabricRegistryBuilder.from(new class00731(class059462, Lifecycle.stable(), false));
    }

    public R buildAndRegister() {
        class05946 class059462 = this.registry.i();
        for (RegistryAttribute registryAttribute : this.attributes) {
            RegistryAttributeHolder.get(class059462).addAttribute(registryAttribute);
        }
        BuiltInRegistriesAccessor.getWRITABLE_REGISTRY().N(class059462, this.registry, class02819.N);
        return this.registry;
    }

    public static <T> FabricRegistryBuilder<T, class07219<T>> createDefaulted(class05946<class00751<T>> class059462, class01894 class018942) {
        return FabricRegistryBuilder.from(new class07219(class018942.toString(), class059462, Lifecycle.stable(), false));
    }

    @Deprecated
    public static <T> FabricRegistryBuilder<T, class07219<T>> createDefaulted(Class<T> clazz, class01894 class018942, class01894 class018943) {
        return FabricRegistryBuilder.createDefaulted(class05946.N((class01894)class018942), class018943);
    }
}

