/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01422
 *  minecraft.class06202
 *  minecraft.class08097
 *  minecraft.class08647
 *  minecraft.class08648
 *  minecraft.class08649
 *  minecraft.class08660
 *  minecraft.class08663
 *  minecraft.class08664
 *  minecraft.class08665
 *  minecraft.class08667
 *  minecraft.class08671
 *  minecraft.class08672
 *  minecraft.class08674
 *  minecraft.class08676
 *  minecraft.class08680
 *  minecraft.class08682
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.SpecialGuiElementRegistry$Context
 *  net.fabricmc.fabric.api.client.rendering.v1.SpecialGuiElementRegistry$Factory
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.client.rendering;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import minecraft.class01237;
import minecraft.class01422;
import minecraft.class06202;
import minecraft.class08097;
import minecraft.class08647;
import minecraft.class08648;
import minecraft.class08649;
import minecraft.class08660;
import minecraft.class08663;
import minecraft.class08664;
import minecraft.class08665;
import minecraft.class08667;
import minecraft.class08671;
import minecraft.class08672;
import minecraft.class08674;
import minecraft.class08676;
import minecraft.class08680;
import minecraft.class08682;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.SpecialGuiElementRegistry;
import net.fabricmc.fabric.impl.client.rendering.SpecialGuiElementRegistryImpl$ContextImpl;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public final class SpecialGuiElementRegistryImpl {
    private static final List<SpecialGuiElementRegistry.Factory> FACTORIES = new ArrayList<SpecialGuiElementRegistry.Factory>();
    private static final Map<Class<? extends class08647>, SpecialGuiElementRegistry.Factory> REGISTERED_FACTORIES = new HashMap<Class<? extends class08647>, SpecialGuiElementRegistry.Factory>();
    private static boolean frozen;

    private SpecialGuiElementRegistryImpl() {
    }

    public static void register(SpecialGuiElementRegistry.Factory factory) {
        if (frozen) {
            throw new IllegalStateException("Too late to register, GuiRenderer has already been initialized.");
        }
        FACTORIES.add(factory);
    }

    public static Collection<Class<? extends class08647>> getRegisteredFactoryStateClasses() {
        return REGISTERED_FACTORIES.keySet();
    }

    public static <S extends class08647> @Nullable class08672<S> createNewRenderer(S s, class06202 class062022, class01422 class014222, class01237 class012372) {
        SpecialGuiElementRegistry.Factory factory = REGISTERED_FACTORIES.get(s.getClass());
        return factory == null ? null : factory.createSpecialRenderer((SpecialGuiElementRegistry.Context)new SpecialGuiElementRegistryImpl$ContextImpl(class062022, class014222, class012372));
    }

    public static void onReady(class06202 class062022, class01422 class014222, class01237 class012372, Map<Class<? extends class08647>, class08672<?>> map) {
        frozen = true;
        SpecialGuiElementRegistryImpl.registerVanillaFactories();
        SpecialGuiElementRegistryImpl$ContextImpl specialGuiElementRegistryImpl$ContextImpl = new SpecialGuiElementRegistryImpl$ContextImpl(class062022, class014222, class012372);
        for (SpecialGuiElementRegistry.Factory factory : FACTORIES) {
            class08672 class086722 = factory.createSpecialRenderer((SpecialGuiElementRegistry.Context)specialGuiElementRegistryImpl$ContextImpl);
            map.put(class086722.N(), class086722);
            REGISTERED_FACTORIES.put(class086722.N(), factory);
        }
    }

    private static void registerVanillaFactories() {
        REGISTERED_FACTORIES.put(class08665.class, context -> new class08682(context.vertexConsumers(), context.client().Ng()));
        REGISTERED_FACTORIES.put(class08676.class, context -> new class08648(context.vertexConsumers()));
        REGISTERED_FACTORIES.put(class08649.class, context -> new class08671(context.vertexConsumers()));
        REGISTERED_FACTORIES.put(class08667.class, context -> new class08664(context.vertexConsumers(), (class08097)context.client().yW()));
        REGISTERED_FACTORIES.put(class08663.class, context -> new class08680(context.vertexConsumers(), (class08097)context.client().yW()));
        REGISTERED_FACTORIES.put(class08660.class, context -> new class08674(context.vertexConsumers()));
    }
}

