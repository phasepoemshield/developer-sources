/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.BaritoneAPI
 *  baritone.api.command.IBaritoneChatControl
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalBlock
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.Helper
 *  minecraft.class00392
 *  minecraft.class00625
 *  minecraft.class00647
 *  minecraft.class00734
 *  minecraft.class01054
 *  minecraft.class01421
 *  minecraft.class04453
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class06183
 *  minecraft.class06220
 *  minecraft.class06541
 *  minecraft.class06613
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07331
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector4f
 */
package baritone.utils;

import baritone.Baritone;
import baritone.api.BaritoneAPI;
import baritone.api.command.IBaritoneChatControl;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.Helper;
import baritone.utils.IRenderer;
import baritone.utils.PathRenderer;
import java.awt.Color;
import java.util.Collections;
import minecraft.class00392;
import minecraft.class00625;
import minecraft.class00647;
import minecraft.class00734;
import minecraft.class01054;
import minecraft.class01421;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06183;
import minecraft.class06220;
import minecraft.class06541;
import minecraft.class06613;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07331;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector4f;

public class GuiClick
extends class05096
implements Helper {
    private Matrix4f projectionViewMatrix;
    private class07209 clickStart;
    private class07209 currentMouseOver;

    public GuiClick() {
        super((class00392)class00392.y((String)"CLICK"));
    }

    public void method_25420(class01054 class010542, int n, int n2, float f) {
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        double d = ((class06220)GuiClick.mc.L_2).i();
        double d2 = ((class06220)GuiClick.mc.L_2).R();
        d2 = (double)mc.Nt().m() - d2;
        class06889 class068892 = this.toWorld(d *= (double)mc.Nt().U() / (double)mc.Nt().W(), d2 *= (double)mc.Nt().E() / (double)mc.Nt().m(), 0.0);
        class06889 class068893 = this.toWorld(d, d2, 1.0);
        if (class068892 != null && class068893 != null) {
            class06889 class068894 = new class06889(PathRenderer.posX(), PathRenderer.posY(), PathRenderer.posZ());
            class04453 class044532 = BaritoneAPI.getProvider().getPrimaryBaritone().getPlayerContext().player();
            class06183 class061832 = class044532.method_73183().N(new class05862(class068892.i(class068894), class068893.i(class068894), class05849.field_17559, class05835.field_1348, (class07049)class044532));
            if (class061832 != null && class061832.N() == class07113.field_1332) {
                this.currentMouseOver = class061832.u();
            }
        }
    }

    public boolean method_25421() {
        return false;
    }

    public boolean method_25406(class06613 class066132) {
        if (this.currentMouseOver != null) {
            if (class066132.v() == 0) {
                if (this.clickStart != null && !this.clickStart.equals((Object)this.currentMouseOver)) {
                    BaritoneAPI.getProvider().getPrimaryBaritone().getSelectionManager().removeAllSelections();
                    BaritoneAPI.getProvider().getPrimaryBaritone().getSelectionManager().addSelection(BetterBlockPos.from((class07209)this.clickStart), BetterBlockPos.from((class07209)this.currentMouseOver));
                    class05216 class052162 = class00392.y((String)("Selection made! For usage: " + (String)Baritone.settings().prefix.value + "help sel"));
                    class052162.y(class052162.method_10866().N(class06541.field_1068).N((class00647)new class00625(IBaritoneChatControl.FORCE_COMMAND_PREFIX + "help sel")));
                    Helper.HELPER.logDirect(new class00392[]{class052162});
                    this.clickStart = null;
                } else {
                    BaritoneAPI.getProvider().getPrimaryBaritone().getCustomGoalProcess().setGoalAndPath((Goal)new GoalBlock(this.currentMouseOver));
                }
            } else if (class066132.v() == 1) {
                BaritoneAPI.getProvider().getPrimaryBaritone().getCustomGoalProcess().setGoalAndPath((Goal)new GoalBlock(this.currentMouseOver.method_10084()));
            }
        }
        this.clickStart = null;
        return super.method_25406(class066132);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        this.clickStart = this.currentMouseOver;
        return super.method_25402(class066132, bl);
    }

    public void onRender(class01421 class014212, Matrix4f matrix4f) {
        this.projectionViewMatrix = new Matrix4f((Matrix4fc)matrix4f);
        this.projectionViewMatrix.mul((Matrix4fc)class014212.L().N());
        this.projectionViewMatrix.invert();
        if (this.currentMouseOver != null) {
            class07049 class070492 = mc.F();
            PathRenderer.drawManySelectionBoxes(class014212, class070492, Collections.singletonList(this.currentMouseOver), Color.CYAN);
            if (this.clickStart != null && !this.clickStart.equals((Object)this.currentMouseOver)) {
                class07331 class073312 = IRenderer.startLines(Color.RED);
                BetterBlockPos betterBlockPos = new BetterBlockPos(this.currentMouseOver);
                BetterBlockPos betterBlockPos2 = new BetterBlockPos(this.clickStart);
                IRenderer.emitAABB(class073312, class014212, new class00734((double)Math.min(betterBlockPos.x, betterBlockPos2.x), (double)Math.min(betterBlockPos.y, betterBlockPos2.y), (double)Math.min(betterBlockPos.z, betterBlockPos2.z), (double)(Math.max(betterBlockPos.x, betterBlockPos2.x) + 1), (double)(Math.max(betterBlockPos.y, betterBlockPos2.y) + 1), (double)(Math.max(betterBlockPos.z, betterBlockPos2.z) + 1)), ((Float)Baritone.settings().pathRenderLineWidthPixels.value).floatValue());
                IRenderer.endLines(class073312, true);
            }
        }
    }

    private class06889 toWorld(double d, double d2, double d3) {
        if (this.projectionViewMatrix == null) {
            return null;
        }
        d /= (double)mc.Nt().U();
        d2 /= (double)mc.Nt().E();
        d = d * 2.0 - 1.0;
        d2 = d2 * 2.0 - 1.0;
        Vector4f vector4f = new Vector4f((float)d, (float)d2, (float)d3, 1.0f);
        this.projectionViewMatrix.transform(vector4f);
        if (vector4f.w() == 0.0f) {
            return null;
        }
        vector4f.mul(1.0f / vector4f.w());
        return new class06889((double)vector4f.x(), (double)vector4f.y(), (double)vector4f.z());
    }
}

