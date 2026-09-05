/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.event.events.RenderEvent
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalComposite
 *  baritone.api.pathing.goals.GoalGetToBlock
 *  baritone.api.pathing.goals.GoalInverted
 *  baritone.api.pathing.goals.GoalTwoBlocks
 *  baritone.api.pathing.goals.GoalXZ
 *  baritone.api.pathing.goals.GoalYLevel
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.IPlayerContext
 *  baritone.api.utils.interfaces.IGoalRenderPos
 *  baritone.behavior.PathingBehavior
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class01421
 *  minecraft.class01423
 *  minecraft.class02058
 *  minecraft.class03575
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07331
 *  minecraft.class07376
 *  org.joml.Quaternionfc
 */
package baritone.utils;

import baritone.api.BaritoneAPI;
import baritone.api.event.events.RenderEvent;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalComposite;
import baritone.api.pathing.goals.GoalGetToBlock;
import baritone.api.pathing.goals.GoalInverted;
import baritone.api.pathing.goals.GoalTwoBlocks;
import baritone.api.pathing.goals.GoalXZ;
import baritone.api.pathing.goals.GoalYLevel;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.interfaces.IGoalRenderPos;
import baritone.behavior.PathingBehavior;
import baritone.pathing.path.PathExecutor;
import baritone.utils.BlockStateInterface;
import baritone.utils.GuiClick;
import baritone.utils.IRenderer;
import java.awt.Color;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class01421;
import minecraft.class01423;
import minecraft.class02058;
import minecraft.class03575;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07331;
import minecraft.class07376;
import org.joml.Quaternionfc;

public final class PathRenderer
implements IRenderer {
    private static final float GOAL_BEACON_INNER_RADIUS = 0.2f;
    private static final float GOAL_BEACON_GLOW_RADIUS = 0.25f;
    private static final int GOAL_BEACON_GLOW_ALPHA = 32;

    public static double posX() {
        return renderManager.renderPosX();
    }

    private PathRenderer() {
    }

    public static double posY() {
        return renderManager.renderPosY();
    }

    public static double posZ() {
        return renderManager.renderPosZ();
    }

    public static void render(RenderEvent renderEvent, PathingBehavior pathingBehavior) {
        class07376 class073762;
        IPlayerContext iPlayerContext = pathingBehavior.ctx;
        if (iPlayerContext.world() == null) {
            return;
        }
        if ((class05096)iPlayerContext.minecraft().v_3 instanceof GuiClick) {
            ((GuiClick)((class05096)iPlayerContext.minecraft().v_3)).onRender(renderEvent.getModelViewStack(), renderEvent.getProjectionMatrix());
        }
        float f = renderEvent.getPartialTicks();
        Goal goal = pathingBehavior.getGoal();
        class07376 class073763 = iPlayerContext.world().method_8597();
        if (class073763 != (class073762 = BaritoneAPI.getProvider().getPrimaryBaritone().getPlayerContext().world().method_8597())) {
            return;
        }
        if (goal != null && ((Boolean)PathRenderer.settings.renderGoal.value).booleanValue()) {
            PathRenderer.drawGoal(renderEvent.getModelViewStack(), iPlayerContext, goal, f, (Color)PathRenderer.settings.colorGoalBox.value);
        }
        if (!((Boolean)PathRenderer.settings.renderPath.value).booleanValue()) {
            return;
        }
        PathExecutor pathExecutor = pathingBehavior.getCurrent();
        PathExecutor pathExecutor2 = pathingBehavior.getNext();
        if (pathExecutor != null && ((Boolean)PathRenderer.settings.renderSelectionBoxes.value).booleanValue()) {
            PathRenderer.drawManySelectionBoxes(renderEvent.getModelViewStack(), (class07049)iPlayerContext.player(), pathExecutor.toBreak(), (Color)PathRenderer.settings.colorBlocksToBreak.value);
            PathRenderer.drawManySelectionBoxes(renderEvent.getModelViewStack(), (class07049)iPlayerContext.player(), pathExecutor.toPlace(), (Color)PathRenderer.settings.colorBlocksToPlace.value);
            PathRenderer.drawManySelectionBoxes(renderEvent.getModelViewStack(), (class07049)iPlayerContext.player(), pathExecutor.toWalkInto(), (Color)PathRenderer.settings.colorBlocksToWalkInto.value);
        }
        if (pathExecutor != null && pathExecutor.getPath() != null) {
            int n = Math.max(pathExecutor.getPosition() - 3, 0);
            PathRenderer.drawPath(renderEvent.getModelViewStack(), pathExecutor.getPath().positions(), n, (Color)PathRenderer.settings.colorCurrentPath.value, (Boolean)PathRenderer.settings.fadePath.value, 10, 20);
        }
        if (pathExecutor2 != null && pathExecutor2.getPath() != null) {
            PathRenderer.drawPath(renderEvent.getModelViewStack(), pathExecutor2.getPath().positions(), 0, (Color)PathRenderer.settings.colorNextPath.value, (Boolean)PathRenderer.settings.fadePath.value, 10, 20);
        }
        pathingBehavior.getInProgress().ifPresent(abstractNodeCostSearch -> {
            abstractNodeCostSearch.bestPathSoFar().ifPresent(iPath -> PathRenderer.drawPath(renderEvent.getModelViewStack(), iPath.positions(), 0, (Color)PathRenderer.settings.colorBestPathSoFar.value, (Boolean)PathRenderer.settings.fadePath.value, 10, 20));
            abstractNodeCostSearch.pathToMostRecentNodeConsidered().ifPresent(iPath -> {
                PathRenderer.drawPath(renderEvent.getModelViewStack(), iPath.positions(), 0, (Color)PathRenderer.settings.colorMostRecentConsidered.value, (Boolean)PathRenderer.settings.fadePath.value, 10, 20);
                PathRenderer.drawManySelectionBoxes(renderEvent.getModelViewStack(), (class07049)iPlayerContext.player(), Collections.singletonList(iPath.getDest()), (Color)PathRenderer.settings.colorMostRecentConsidered.value);
            });
        });
    }

    private static void drawGoal(class07331 class073312, class01421 class014212, IPlayerContext iPlayerContext, Goal goal, float f, Color color, boolean bl) {
        if (!bl && class073312 == null) {
            throw new RuntimeException("BufferBuilder must not be null if setupRender is false");
        }
        double d = PathRenderer.posX();
        double d2 = PathRenderer.posY();
        double d3 = PathRenderer.posZ();
        double d4 = (Boolean)PathRenderer.settings.renderGoalAnimated.value == false ? (double)0.999f : (double)class04995.P((double)((float)((double)((float)(System.nanoTime() / 100000L % 20000L) / 20000.0f) * Math.PI * 2.0)));
        if (goal instanceof IGoalRenderPos) {
            class07209 class072092 = ((IGoalRenderPos)goal).getGoalPos();
            double d5 = (double)class072092.method_10263() + 0.002 - d;
            double d6 = (double)(class072092.method_10263() + 1) - 0.002 - d;
            double d7 = (double)class072092.method_10260() + 0.002 - d3;
            double d8 = (double)(class072092.method_10260() + 1) - 0.002 - d3;
            if (goal instanceof GoalGetToBlock || goal instanceof GoalTwoBlocks) {
                d4 /= 2.0;
            }
            double d9 = 1.0 + d4 + (double)class072092.method_10264() - d2;
            double d10 = 1.0 - d4 + (double)class072092.method_10264() - d2;
            double d11 = (double)class072092.method_10264() - d2;
            double d12 = d11 + 2.0;
            if (goal instanceof GoalGetToBlock || goal instanceof GoalTwoBlocks) {
                d9 -= 0.5;
                d10 -= 0.5;
                d12 -= 1.0;
            }
            PathRenderer.drawDankLitGoalBox(class073312, class014212, color, d5, d6, d7, d8, d11, d12, d9, d10, bl);
        } else if (goal instanceof GoalXZ) {
            GoalXZ goalXZ = (GoalXZ)goal;
            double d13 = iPlayerContext.world().method_31607();
            double d14 = iPlayerContext.world().method_31600();
            double d15 = (double)goalXZ.getX() + 0.002 - d;
            double d16 = (double)(goalXZ.getX() + 1) - 0.002 - d;
            double d17 = (double)goalXZ.getZ() + 0.002 - d3;
            double d18 = (double)(goalXZ.getZ() + 1) - 0.002 - d3;
            double d19 = 0.0;
            double d20 = 0.0;
            PathRenderer.drawDankLitGoalBox(class073312, class014212, color, d15, d16, d17, d18, d13 -= d2, d14 -= d2, d19, d20, bl);
            PathRenderer.drawGoalXZBeacon(class014212, iPlayerContext, (GoalXZ)goal, d13, d14, f, color);
        } else if (goal instanceof GoalComposite) {
            boolean bl2 = Arrays.stream(((GoalComposite)goal).goals()).allMatch(IGoalRenderPos.class::isInstance);
            class07331 class073313 = class073312;
            if (bl2) {
                class073313 = IRenderer.startLines(color, ((Float)PathRenderer.settings.goalRenderLineWidthPixels.value).floatValue());
            }
            for (Goal goal2 : ((GoalComposite)goal).goals()) {
                PathRenderer.drawGoal(class073313, class014212, iPlayerContext, goal2, f, color, !bl2);
            }
            if (bl2) {
                IRenderer.endLines(class073313, (Boolean)PathRenderer.settings.renderGoalIgnoreDepth.value);
            }
        } else if (goal instanceof GoalInverted) {
            PathRenderer.drawGoal(class014212, iPlayerContext, ((GoalInverted)goal).origin, f, (Color)PathRenderer.settings.colorInvertedGoalBox.value);
        } else if (goal instanceof GoalYLevel) {
            GoalYLevel goalYLevel = (GoalYLevel)goal;
            double d21 = iPlayerContext.player().method_73189().M - (Double)PathRenderer.settings.yLevelBoxSize.value - d;
            double d22 = iPlayerContext.player().method_73189().Z - (Double)PathRenderer.settings.yLevelBoxSize.value - d3;
            double d23 = iPlayerContext.player().method_73189().M + (Double)PathRenderer.settings.yLevelBoxSize.value - d;
            double d24 = iPlayerContext.player().method_73189().Z + (Double)PathRenderer.settings.yLevelBoxSize.value - d3;
            double d25 = (double)((GoalYLevel)goal).level - d2;
            double d26 = d25 + 2.0;
            double d27 = 1.0 + d4 + (double)goalYLevel.level - d2;
            double d28 = 1.0 - d4 + (double)goalYLevel.level - d2;
            PathRenderer.drawDankLitGoalBox(class073312, class014212, color, d21, d23, d22, d24, d25, d26, d27, d28, bl);
        }
    }

    public static void drawGoal(class01421 class014212, IPlayerContext iPlayerContext, Goal goal, float f, Color color) {
        PathRenderer.drawGoal(null, class014212, iPlayerContext, goal, f, color, true);
    }

    public static void drawPath(class01421 class014212, List<BetterBlockPos> list, int n, Color color, boolean bl, int n2, int n3, double d) {
        class07331 class073312 = IRenderer.startLines(color);
        int n4 = n2 + n;
        int n5 = n3 + n;
        int n6 = n;
        while (n6 < list.size() - 1) {
            BetterBlockPos betterBlockPos = list.get(n6);
            int n7 = n6 + 1;
            BetterBlockPos betterBlockPos2 = list.get(n7);
            int n8 = betterBlockPos2.x - betterBlockPos.x;
            int n9 = betterBlockPos2.y - betterBlockPos.y;
            int n10 = betterBlockPos2.z - betterBlockPos.z;
            while (!(n7 + 1 >= list.size() || bl && n7 + 1 >= n4 || n8 != list.get((int)(n7 + 1)).x - betterBlockPos2.x || n9 != list.get((int)(n7 + 1)).y - betterBlockPos2.y || n10 != list.get((int)(n7 + 1)).z - betterBlockPos2.z)) {
                betterBlockPos2 = list.get(++n7);
            }
            if (bl) {
                float f;
                if (n6 <= n4) {
                    f = 0.4f;
                } else {
                    if (n6 > n5) break;
                    f = 0.4f * (1.0f - (float)(n6 - n4) / (float)(n5 - n4));
                }
                IRenderer.glColor(color, f);
            }
            PathRenderer.emitPathLine(class073312, class014212, betterBlockPos.x, betterBlockPos.y, betterBlockPos.z, betterBlockPos2.x, betterBlockPos2.y, betterBlockPos2.z, d);
            n6 = n7;
        }
        IRenderer.endLines(class073312, (Boolean)PathRenderer.settings.renderPathIgnoreDepth.value);
    }

    public static void drawPath(class01421 class014212, List<BetterBlockPos> list, int n, Color color, boolean bl, int n2, int n3) {
        PathRenderer.drawPath(class014212, list, n, color, bl, n2, n3, 0.5);
    }

    public static void drawManySelectionBoxes(class01421 class014212, class07049 class070492, Collection<class07209> collection, Color color) {
        class07331 class073312 = IRenderer.startLines(color);
        BlockStateInterface blockStateInterface = new BlockStateInterface(BaritoneAPI.getProvider().getPrimaryBaritone().getPlayerContext());
        collection.forEach(class072092 -> {
            class00500 class005002 = blockStateInterface.get0((class07209)class072092);
            class00494 class004942 = class005002.R((class07290)class070492.method_73183(), class072092);
            class00734 class007342 = class004942.method_1110() ? class00389.y().method_1107() : class004942.method_1107();
            class007342 = class007342.N(class072092);
            IRenderer.emitAABB(class073312, class014212, class007342, 0.002, ((Float)PathRenderer.settings.pathRenderLineWidthPixels.value).floatValue());
        });
        IRenderer.endLines(class073312, (Boolean)PathRenderer.settings.renderSelectionBoxesIgnoreDepth.value);
    }

    private static void renderHorizontalQuad(class07331 class073312, class01421 class014212, double d, double d2, double d3, double d4, double d5, float f) {
        if (d5 != 0.0) {
            IRenderer.emitLine(class073312, class014212, d, d5, d3, d2, d5, d3, 1.0, 0.0, 0.0, f);
            IRenderer.emitLine(class073312, class014212, d2, d5, d3, d2, d5, d4, 0.0, 0.0, 1.0, f);
            IRenderer.emitLine(class073312, class014212, d2, d5, d4, d, d5, d4, -1.0, 0.0, 0.0, f);
            IRenderer.emitLine(class073312, class014212, d, d5, d4, d, d5, d3, 0.0, 0.0, -1.0, f);
        }
    }

    private static void renderGoalXZBeaconLayer(class01421 class014212, double d, float f, int n, float f2, boolean bl) {
        class07331 class073312 = IRenderer.startBlockQuads();
        float f3 = class04995.M((float)(-f * 0.2f - (float)class04995.y((float)(-f * 0.1f))));
        class014212.N();
        class014212.N(0.5, 0.0, 0.5);
        if (!bl) {
            class014212.N();
            class014212.N((Quaternionfc)class02058.u.N(f * 2.25f - 45.0f));
        }
        float f4 = -1.0f + f3;
        float f5 = (float)(bl ? d + (double)f4 : d * (double)(0.5f / f2) + (double)f4);
        class01423 class014232 = class014212.L();
        if (bl) {
            PathRenderer.emitBeaconShell(class073312, class014232, n, 0.0f, (float)d, -f2, -f2, f2, -f2, -f2, f2, f2, f2, f4, f5);
        } else {
            PathRenderer.emitBeaconShell(class073312, class014232, n, 0.0f, (float)d, 0.0f, f2, f2, 0.0f, -f2, 0.0f, 0.0f, -f2, f4, f5);
        }
        if (!bl) {
            class014212.y();
        }
        class014212.y();
        IRenderer.endBuffer(class073312, IRenderer.beaconBeam(class03575.N, bl, (Boolean)PathRenderer.settings.renderGoalIgnoreDepth.value));
    }

    private static void drawGoalXZBeacon(class01421 class014212, IPlayerContext iPlayerContext, GoalXZ goalXZ, double d, double d2, float f, Color color) {
        float f2 = (Boolean)PathRenderer.settings.renderGoalAnimated.value != false ? (float)iPlayerContext.world().N() + f : 0.0f;
        int n = color.getRGB() & 0xFFFFFF | 0x20000000;
        double d3 = d2 - d;
        class014212.N();
        class014212.N((double)goalXZ.getX() - PathRenderer.posX(), d - PathRenderer.posY(), (double)goalXZ.getZ() - PathRenderer.posZ());
        PathRenderer.renderGoalXZBeaconLayer(class014212, d3, f2, color.getRGB(), 0.2f, false);
        PathRenderer.renderGoalXZBeaconLayer(class014212, d3, f2, n, 0.25f, true);
        class014212.y();
    }

    private static void emitBeaconShell(class07331 class073312, class01423 class014232, int n, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        PathRenderer.emitBeaconFace(class073312, class014232, n, f, f2, f3, f4, f5, f6, 0.0f, 1.0f, f11, f12);
        PathRenderer.emitBeaconFace(class073312, class014232, n, f, f2, f9, f10, f7, f8, 0.0f, 1.0f, f11, f12);
        PathRenderer.emitBeaconFace(class073312, class014232, n, f, f2, f5, f6, f9, f10, 0.0f, 1.0f, f11, f12);
        PathRenderer.emitBeaconFace(class073312, class014232, n, f, f2, f7, f8, f3, f4, 0.0f, 1.0f, f11, f12);
    }

    private static void emitBeaconFace(class07331 class073312, class01423 class014232, int n, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        float f11 = f6 - f4;
        float f12 = f3 - f5;
        float f13 = class04995.N((float)(f11 * f11 + f12 * f12));
        if (f13 != 0.0f) {
            f11 /= f13;
            f12 /= f13;
        }
        IRenderer.emitTexturedVertex(class073312, class014232, f3, f2, f4, n, f8, f9, f11, 0.0f, f12);
        IRenderer.emitTexturedVertex(class073312, class014232, f3, f, f4, n, f8, f10, f11, 0.0f, f12);
        IRenderer.emitTexturedVertex(class073312, class014232, f5, f, f6, n, f7, f10, f11, 0.0f, f12);
        IRenderer.emitTexturedVertex(class073312, class014232, f5, f2, f6, n, f7, f9, f11, 0.0f, f12);
    }

    private static void emitPathLine(class07331 class073312, class01421 class014212, double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = d7 + 0.03;
        double d9 = PathRenderer.posX();
        double d10 = PathRenderer.posY();
        double d11 = PathRenderer.posZ();
        boolean bl = (Boolean)PathRenderer.settings.renderPathAsLine.value == false;
        IRenderer.emitLine(class073312, class014212, d + d7 - d9, d2 + d7 - d10, d3 + d7 - d11, d4 + d7 - d9, d5 + d7 - d10, d6 + d7 - d11, ((Float)PathRenderer.settings.pathRenderLineWidthPixels.value).floatValue());
        if (bl) {
            IRenderer.emitLine(class073312, class014212, d4 + d7 - d9, d5 + d7 - d10, d6 + d7 - d11, d4 + d7 - d9, d5 + d8 - d10, d6 + d7 - d11, ((Float)PathRenderer.settings.pathRenderLineWidthPixels.value).floatValue());
            IRenderer.emitLine(class073312, class014212, d4 + d7 - d9, d5 + d8 - d10, d6 + d7 - d11, d + d7 - d9, d2 + d8 - d10, d3 + d7 - d11, ((Float)PathRenderer.settings.pathRenderLineWidthPixels.value).floatValue());
            IRenderer.emitLine(class073312, class014212, d + d7 - d9, d2 + d8 - d10, d3 + d7 - d11, d + d7 - d9, d2 + d7 - d10, d3 + d7 - d11, ((Float)PathRenderer.settings.pathRenderLineWidthPixels.value).floatValue());
        }
    }

    private static void drawDankLitGoalBox(class07331 class073312, class01421 class014212, Color color, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, boolean bl) {
        if (bl) {
            class073312 = IRenderer.startLines(color);
        }
        PathRenderer.renderHorizontalQuad(class073312, class014212, d, d2, d3, d4, d7, ((Float)PathRenderer.settings.goalRenderLineWidthPixels.value).floatValue());
        PathRenderer.renderHorizontalQuad(class073312, class014212, d, d2, d3, d4, d8, ((Float)PathRenderer.settings.goalRenderLineWidthPixels.value).floatValue());
        for (double d9 = d5; d9 < d6; d9 += 16.0) {
            double d10 = Math.min(d6, d9 + 16.0);
            IRenderer.emitLine(class073312, class014212, d, d9, d3, d, d10, d3, 0.0, 1.0, 0.0, ((Float)PathRenderer.settings.goalRenderLineWidthPixels.value).floatValue());
            IRenderer.emitLine(class073312, class014212, d2, d9, d3, d2, d10, d3, 0.0, 1.0, 0.0, ((Float)PathRenderer.settings.goalRenderLineWidthPixels.value).floatValue());
            IRenderer.emitLine(class073312, class014212, d2, d9, d4, d2, d10, d4, 0.0, 1.0, 0.0, ((Float)PathRenderer.settings.goalRenderLineWidthPixels.value).floatValue());
            IRenderer.emitLine(class073312, class014212, d, d9, d4, d, d10, d4, 0.0, 1.0, 0.0, ((Float)PathRenderer.settings.goalRenderLineWidthPixels.value).floatValue());
        }
        if (bl) {
            IRenderer.endLines(class073312, (Boolean)PathRenderer.settings.renderGoalIgnoreDepth.value);
        }
    }
}

