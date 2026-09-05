/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00985
 *  minecraft.class04795
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.rendering;

import java.util.HashMap;
import java.util.function.BiConsumer;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00985;
import minecraft.class04795;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class BlockEntityRendererRegistryImpl {
    private static final HashMap<class00404<?>, class04795<?, ?>> MAP = new HashMap();
    private static BiConsumer<class00404<?>, class04795<?, ?>> handler = (class004042, class047952) -> MAP.put((class00404<?>)class004042, (class04795<?, ?>)class047952);

    private BlockEntityRendererRegistryImpl() {
    }

    public static <E extends class00394, S extends class00985> void register(class00404<E> class004042, class04795<? super E, ? super S> class047952) {
        handler.accept(class004042, class047952);
    }

    public static void setup(BiConsumer<class00404<?>, class04795<?, ?>> biConsumer) {
        MAP.forEach(biConsumer);
        handler = biConsumer;
    }
}

