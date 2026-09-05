/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.seibel.distanthorizons.api.DhApi
 *  com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiAfterDhInitEvent
 *  com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiBeforeApplyShaderRenderEvent
 *  com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiBeforeBufferRenderEvent
 *  com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiBeforeDeferredRenderEvent
 *  com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiBeforeGenericObjectRenderEvent
 *  com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiBeforeGenericRenderSetupEvent
 *  com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiBeforeRenderCleanupEvent
 *  com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiBeforeRenderEvent
 *  com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiBeforeRenderPassEvent
 *  com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiBeforeRenderSetupEvent
 *  com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiBeforeTextureClearEvent
 *  com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiColorDepthTextureCreatedEvent
 *  com.seibel.distanthorizons.coreapi.interfaces.dependencyInjection.IBindable
 *  net.irisshaders.iris.compat.dh.LodRendererEvents$1
 *  net.irisshaders.iris.compat.dh.LodRendererEvents$10
 *  net.irisshaders.iris.compat.dh.LodRendererEvents$11
 *  net.irisshaders.iris.compat.dh.LodRendererEvents$12
 *  net.irisshaders.iris.compat.dh.LodRendererEvents$13
 *  net.irisshaders.iris.compat.dh.LodRendererEvents$14
 *  net.irisshaders.iris.compat.dh.LodRendererEvents$2
 *  net.irisshaders.iris.compat.dh.LodRendererEvents$3
 *  net.irisshaders.iris.compat.dh.LodRendererEvents$4
 *  net.irisshaders.iris.compat.dh.LodRendererEvents$5
 *  net.irisshaders.iris.compat.dh.LodRendererEvents$6
 *  net.irisshaders.iris.compat.dh.LodRendererEvents$7
 *  net.irisshaders.iris.compat.dh.LodRendererEvents$8
 *  net.irisshaders.iris.compat.dh.LodRendererEvents$9
 *  net.irisshaders.iris.pipeline.WorldRenderingPipeline
 */
package net.irisshaders.iris.compat.dh;

import com.seibel.distanthorizons.api.DhApi;
import com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiAfterDhInitEvent;
import com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiBeforeApplyShaderRenderEvent;
import com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiBeforeBufferRenderEvent;
import com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiBeforeDeferredRenderEvent;
import com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiBeforeGenericObjectRenderEvent;
import com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiBeforeGenericRenderSetupEvent;
import com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiBeforeRenderCleanupEvent;
import com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiBeforeRenderEvent;
import com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiBeforeRenderPassEvent;
import com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiBeforeRenderSetupEvent;
import com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiBeforeTextureClearEvent;
import com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiColorDepthTextureCreatedEvent;
import com.seibel.distanthorizons.coreapi.interfaces.dependencyInjection.IBindable;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.compat.dh.DHCompat;
import net.irisshaders.iris.compat.dh.DHCompatInternal;
import net.irisshaders.iris.compat.dh.LodRendererEvents;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;

public class LodRendererEvents {
    private static boolean eventHandlersBound = false;
    static boolean atTranslucent = false;
    static int textureWidth;
    static int textureHeight;

    public static void setupEventHandlers() {
        if (!eventHandlersBound) {
            eventHandlersBound = true;
            Iris.logger.info("Queuing DH event binding...");
            1 var0 = new 1();
            DhApi.events.bind(DhApiAfterDhInitEvent.class, (IBindable)var0);
        }
    }

    static DHCompatInternal getInstance() {
        return (DHCompatInternal)Iris.getPipelineManager().getPipeline().map(WorldRenderingPipeline::getDHCompat).map(DHCompat::getInstance).orElse(DHCompatInternal.SHADERLESS);
    }

    static void setupReconnectDepthTextureEvent() {
        3 var0 = new 3();
        DhApi.events.bind(DhApiBeforeTextureClearEvent.class, (IBindable)var0);
    }

    static void setupCreateDepthTextureEvent() {
        6 var0 = new 6();
        DhApi.events.bind(DhApiColorDepthTextureCreatedEvent.class, (IBindable)var0);
    }

    static void setupBeforeRenderCleanupEvent() {
        9 var0 = new 9();
        DhApi.events.bind(DhApiBeforeRenderCleanupEvent.class, (IBindable)var0);
    }

    static void setupBeforeBufferClearEvent() {
        10 var0 = new 10();
        DhApi.events.bind(DhApiBeforeTextureClearEvent.class, (IBindable)var0);
    }

    static void setupBeforeApplyShaderEvent() {
        14 var0 = new 14();
        DhApi.events.bind(DhApiBeforeApplyShaderRenderEvent.class, (IBindable)var0);
    }

    static void setupTransparentRendererEventCancling() {
        7 var0 = new 7();
        8 var1_1 = new 8();
        DhApi.events.bind(DhApiBeforeRenderEvent.class, (IBindable)var0);
        DhApi.events.bind(DhApiBeforeDeferredRenderEvent.class, (IBindable)var1_1);
    }

    static void setupBeforeRenderFrameBufferBinding() {
        12 var0 = new 12();
        DhApi.events.bind(DhApiBeforeRenderSetupEvent.class, (IBindable)var0);
    }

    static void setupSetDeferredBeforeRenderingEvent() {
        2 var0 = new 2();
        DhApi.events.bind(DhApiBeforeRenderEvent.class, (IBindable)var0);
    }

    static void setupGenericEvent() {
        4 var0 = new 4();
        5 var1_1 = new 5();
        DhApi.events.bind(DhApiBeforeGenericRenderSetupEvent.class, (IBindable)var0);
        DhApi.events.bind(DhApiBeforeGenericObjectRenderEvent.class, (IBindable)var1_1);
    }

    static void beforeBufferRenderEvent() {
        11 var0 = new 11();
        DhApi.events.bind(DhApiBeforeBufferRenderEvent.class, (IBindable)var0);
    }

    static void setupBeforeRenderPassEvent() {
        13 var0 = new 13();
        DhApi.events.bind(DhApiBeforeRenderPassEvent.class, (IBindable)var0);
    }
}

