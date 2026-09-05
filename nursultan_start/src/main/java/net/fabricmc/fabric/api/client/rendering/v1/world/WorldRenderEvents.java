/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.client.rendering.v1.world;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$AfterBlockOutlineExtraction;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$AfterEntities;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$BeforeBlockOutline;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$BeforeEntities;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$BeforeTranslucent;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$DebugRender;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$EndExtraction;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$EndMain;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$StartMain;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@Environment(value=EnvType.CLIENT)
public final class WorldRenderEvents {
    public static final Event<WorldRenderEvents$AfterBlockOutlineExtraction> AFTER_BLOCK_OUTLINE_EXTRACTION = EventFactory.createArrayBacked(WorldRenderEvents$AfterBlockOutlineExtraction.class, worldRenderEvents$AfterBlockOutlineExtractionArray -> (worldExtractionContext, class070892) -> {
        for (WorldRenderEvents$AfterBlockOutlineExtraction worldRenderEvents$AfterBlockOutlineExtraction : worldRenderEvents$AfterBlockOutlineExtractionArray) {
            worldRenderEvents$AfterBlockOutlineExtraction.afterBlockOutlineExtraction(worldExtractionContext, class070892);
        }
    });
    public static final Event<WorldRenderEvents$EndExtraction> END_EXTRACTION = EventFactory.createArrayBacked(WorldRenderEvents$EndExtraction.class, worldRenderEvents$EndExtractionArray -> worldExtractionContext -> {
        for (WorldRenderEvents$EndExtraction worldRenderEvents$EndExtraction : worldRenderEvents$EndExtractionArray) {
            worldRenderEvents$EndExtraction.endExtraction(worldExtractionContext);
        }
    });
    public static final Event<WorldRenderEvents$StartMain> START_MAIN = EventFactory.createArrayBacked(WorldRenderEvents$StartMain.class, worldRenderEvents$StartMainArray -> worldTerrainRenderContext -> {
        for (WorldRenderEvents$StartMain worldRenderEvents$StartMain : worldRenderEvents$StartMainArray) {
            worldRenderEvents$StartMain.startMain(worldTerrainRenderContext);
        }
    });
    public static final Event<WorldRenderEvents$BeforeEntities> BEFORE_ENTITIES = EventFactory.createArrayBacked(WorldRenderEvents$BeforeEntities.class, worldRenderEvents$BeforeEntitiesArray -> worldRenderContext -> {
        for (WorldRenderEvents$BeforeEntities worldRenderEvents$BeforeEntities : worldRenderEvents$BeforeEntitiesArray) {
            worldRenderEvents$BeforeEntities.beforeEntities(worldRenderContext);
        }
    });
    public static final Event<WorldRenderEvents$AfterEntities> AFTER_ENTITIES = EventFactory.createArrayBacked(WorldRenderEvents$AfterEntities.class, worldRenderEvents$AfterEntitiesArray -> worldRenderContext -> {
        for (WorldRenderEvents$AfterEntities worldRenderEvents$AfterEntities : worldRenderEvents$AfterEntitiesArray) {
            worldRenderEvents$AfterEntities.afterEntities(worldRenderContext);
        }
    });
    public static final Event<WorldRenderEvents$DebugRender> BEFORE_DEBUG_RENDER = EventFactory.createArrayBacked(WorldRenderEvents$DebugRender.class, worldRenderEvents$DebugRenderArray -> worldRenderContext -> {
        for (WorldRenderEvents$DebugRender worldRenderEvents$DebugRender : worldRenderEvents$DebugRenderArray) {
            worldRenderEvents$DebugRender.beforeDebugRender(worldRenderContext);
        }
    });
    public static final Event<WorldRenderEvents$BeforeTranslucent> BEFORE_TRANSLUCENT = EventFactory.createArrayBacked(WorldRenderEvents$BeforeTranslucent.class, worldRenderEvents$BeforeTranslucentArray -> worldRenderContext -> {
        for (WorldRenderEvents$BeforeTranslucent worldRenderEvents$BeforeTranslucent : worldRenderEvents$BeforeTranslucentArray) {
            worldRenderEvents$BeforeTranslucent.beforeTranslucent(worldRenderContext);
        }
    });
    public static final Event<WorldRenderEvents$BeforeBlockOutline> BEFORE_BLOCK_OUTLINE = EventFactory.createArrayBacked(WorldRenderEvents$BeforeBlockOutline.class, worldRenderEvents$BeforeBlockOutlineArray -> (worldRenderContext, class069732) -> {
        boolean bl = true;
        for (WorldRenderEvents$BeforeBlockOutline worldRenderEvents$BeforeBlockOutline : worldRenderEvents$BeforeBlockOutlineArray) {
            if (worldRenderEvents$BeforeBlockOutline.beforeBlockOutline(worldRenderContext, class069732)) continue;
            bl = false;
        }
        return bl;
    });
    public static final Event<WorldRenderEvents$EndMain> END_MAIN = EventFactory.createArrayBacked(WorldRenderEvents$EndMain.class, worldRenderEvents$EndMainArray -> worldRenderContext -> {
        for (WorldRenderEvents$EndMain worldRenderEvents$EndMain : worldRenderEvents$EndMainArray) {
            worldRenderEvents$EndMain.endMain(worldRenderContext);
        }
    });

    private WorldRenderEvents() {
    }
}

