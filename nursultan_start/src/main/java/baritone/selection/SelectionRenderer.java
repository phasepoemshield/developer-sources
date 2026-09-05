/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.event.events.RenderEvent
 *  baritone.api.event.listener.AbstractGameEventListener
 *  baritone.api.event.listener.IGameEventListener
 *  baritone.api.selection.ISelection
 *  minecraft.class00734
 *  minecraft.class01421
 *  minecraft.class07209
 *  minecraft.class07331
 */
package baritone.selection;

import baritone.Baritone;
import baritone.api.event.events.RenderEvent;
import baritone.api.event.listener.AbstractGameEventListener;
import baritone.api.event.listener.IGameEventListener;
import baritone.api.selection.ISelection;
import baritone.selection.SelectionManager;
import baritone.utils.IRenderer;
import java.awt.Color;
import minecraft.class00734;
import minecraft.class01421;
import minecraft.class07209;
import minecraft.class07331;

public class SelectionRenderer
implements AbstractGameEventListener,
IRenderer {
    public static final double SELECTION_BOX_EXPANSION = 0.005;
    private final SelectionManager manager;

    SelectionRenderer(Baritone baritone, SelectionManager selectionManager) {
        this.manager = selectionManager;
        baritone.getGameEventHandler().registerEventListener((IGameEventListener)this);
    }

    public void onRenderPass(RenderEvent renderEvent) {
        SelectionRenderer.renderSelections(renderEvent.getModelViewStack(), this.manager.getSelections());
    }

    public static void renderSelections(class01421 class014212, ISelection[] iSelectionArray) {
        float f = ((Float)SelectionRenderer.settings.selectionOpacity.value).floatValue();
        boolean bl = (Boolean)SelectionRenderer.settings.renderSelectionIgnoreDepth.value;
        float f2 = ((Float)SelectionRenderer.settings.selectionLineWidth.value).floatValue();
        if (!((Boolean)SelectionRenderer.settings.renderSelection.value).booleanValue() || iSelectionArray.length == 0) {
            return;
        }
        class07331 class073312 = IRenderer.startLines((Color)SelectionRenderer.settings.colorSelection.value, f);
        for (ISelection iSelection : iSelectionArray) {
            IRenderer.emitAABB(class073312, class014212, iSelection.aabb(), 0.005, f2);
        }
        if (((Boolean)SelectionRenderer.settings.renderSelectionCorners.value).booleanValue()) {
            IRenderer.glColor((Color)SelectionRenderer.settings.colorSelectionPos1.value, f);
            for (ISelection iSelection : iSelectionArray) {
                IRenderer.emitAABB(class073312, class014212, new class00734((class07209)iSelection.pos1()), f2);
            }
            IRenderer.glColor((Color)SelectionRenderer.settings.colorSelectionPos2.value, f);
            for (ISelection iSelection : iSelectionArray) {
                IRenderer.emitAABB(class073312, class014212, new class00734((class07209)iSelection.pos2()), f2);
            }
        }
        IRenderer.endLines(class073312, bl);
    }
}

