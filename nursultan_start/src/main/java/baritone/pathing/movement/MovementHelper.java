/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09334
 *  Nursultan.class11938
 *  baritone.Baritone
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.pathing.movement.ActionCosts
 *  baritone.api.pathing.movement.MovementStatus
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.Helper
 *  baritone.api.utils.IPlayerContext
 *  baritone.api.utils.RayTraceUtils
 *  baritone.api.utils.Rotation
 *  baritone.api.utils.RotationUtils
 *  baritone.api.utils.VecUtils
 *  baritone.api.utils.input.Input
 *  baritone.pathing.precompute.Ternary
 *  baritone.utils.BlockStateInterface
 *  baritone.utils.ToolSet
 *  minecraft.class00410
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00511
 *  minecraft.class00624
 *  minecraft.class00643
 *  minecraft.class00749
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class02710
 *  minecraft.class03556
 *  minecraft.class04644
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04995
 *  minecraft.class05453
 *  minecraft.class05476
 *  minecraft.class05555
 *  minecraft.class05787
 *  minecraft.class05989
 *  minecraft.class06089
 *  minecraft.class06183
 *  minecraft.class06342
 *  minecraft.class06667
 *  minecraft.class06889
 *  minecraft.class06999
 *  minecraft.class07000
 *  minecraft.class07007
 *  minecraft.class07027
 *  minecraft.class07049
 *  minecraft.class07085
 *  minecraft.class07089
 *  minecraft.class07101
 *  minecraft.class07113
 *  minecraft.class07117
 *  minecraft.class07131
 *  minecraft.class07137
 *  minecraft.class07185
 *  minecraft.class07188
 *  minecraft.class07196
 *  minecraft.class07204
 *  minecraft.class07207
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07314
 *  minecraft.class07662
 *  minecraft.class07688
 *  minecraft.class07734
 *  minecraft.class07746
 *  minecraft.class07784
 *  minecraft.class08052
 *  minecraft.class08054
 *  minecraft.class08061
 *  minecraft.class08092
 *  minecraft.class08791
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package baritone.pathing.movement;

import Nursultan.class09334;
import Nursultan.class11938;
import baritone.Baritone;
import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.pathing.movement.ActionCosts;
import baritone.api.pathing.movement.MovementStatus;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.Helper;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.RayTraceUtils;
import baritone.api.utils.Rotation;
import baritone.api.utils.RotationUtils;
import baritone.api.utils.VecUtils;
import baritone.api.utils.input.Input;
import baritone.pathing.movement.CalculationContext;
import baritone.pathing.movement.Movement;
import baritone.pathing.movement.MovementHelper$PlaceResult;
import baritone.pathing.movement.MovementOption;
import baritone.pathing.movement.MovementState;
import baritone.pathing.movement.MovementState$MovementTarget;
import baritone.pathing.precompute.Ternary;
import baritone.utils.BlockStateInterface;
import baritone.utils.ToolSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import minecraft.class00410;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00511;
import minecraft.class00624;
import minecraft.class00643;
import minecraft.class00749;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class02710;
import minecraft.class03556;
import minecraft.class04644;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04995;
import minecraft.class05453;
import minecraft.class05476;
import minecraft.class05555;
import minecraft.class05787;
import minecraft.class05989;
import minecraft.class06089;
import minecraft.class06183;
import minecraft.class06342;
import minecraft.class06667;
import minecraft.class06889;
import minecraft.class06999;
import minecraft.class07000;
import minecraft.class07007;
import minecraft.class07027;
import minecraft.class07049;
import minecraft.class07085;
import minecraft.class07089;
import minecraft.class07101;
import minecraft.class07113;
import minecraft.class07117;
import minecraft.class07131;
import minecraft.class07137;
import minecraft.class07185;
import minecraft.class07188;
import minecraft.class07196;
import minecraft.class07204;
import minecraft.class07207;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07314;
import minecraft.class07662;
import minecraft.class07688;
import minecraft.class07734;
import minecraft.class07746;
import minecraft.class07784;
import minecraft.class08052;
import minecraft.class08054;
import minecraft.class08061;
import minecraft.class08092;
import minecraft.class08791;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public interface MovementHelper
extends ActionCosts,
Helper {
    public static boolean canWalkOn(IPlayerContext iPlayerContext, BetterBlockPos betterBlockPos, class00500 class005002) {
        return MovementHelper.canWalkOn(new BlockStateInterface(iPlayerContext), betterBlockPos.x, betterBlockPos.y, betterBlockPos.z, class005002);
    }

    public static boolean canWalkOn(CalculationContext calculationContext, int n, int n2, int n3) {
        return MovementHelper.canWalkOn(calculationContext, n, n2, n3, calculationContext.get(n, n2, n3));
    }

    public static boolean canWalkOn(BlockStateInterface blockStateInterface, int n, int n2, int n3) {
        return MovementHelper.canWalkOn(blockStateInterface, n, n2, n3, blockStateInterface.get0(n, n2, n3));
    }

    public static boolean canWalkOn(CalculationContext calculationContext, int n, int n2, int n3, class00500 class005002) {
        return calculationContext.precomputedData.canWalkOn(calculationContext.bsi, n, n2, n3, class005002);
    }

    public static boolean canWalkOn(BlockStateInterface blockStateInterface, int n, int n2, int n3, class00500 class005002) {
        Ternary ternary = MovementHelper.canWalkOnBlockState(class005002);
        if (ternary == Ternary.YES) {
            return true;
        }
        if (ternary == Ternary.NO) {
            return false;
        }
        return MovementHelper.canWalkOnPosition(blockStateInterface, n, n2, n3, class005002);
    }

    public static boolean canWalkOn(IPlayerContext iPlayerContext, BetterBlockPos betterBlockPos) {
        return MovementHelper.canWalkOn(new BlockStateInterface(iPlayerContext), betterBlockPos.x, betterBlockPos.y, betterBlockPos.z);
    }

    public static boolean canWalkOn(IPlayerContext iPlayerContext, class07209 class072092) {
        return MovementHelper.canWalkOn(new BlockStateInterface(iPlayerContext), class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public static boolean isWater(IPlayerContext iPlayerContext, class07209 class072092) {
        return MovementHelper.isWater(BlockStateInterface.get((IPlayerContext)iPlayerContext, (class07209)class072092));
    }

    public static boolean isWater(class00500 class005002) {
        class04651 class046512 = class005002.Y().N();
        return class046512 == class04684.L || class046512 == class04684.y;
    }

    public static boolean isFlowing(int n, int n2, int n3, class00500 class005002, BlockStateInterface blockStateInterface) {
        class04688 class046882 = class005002.Y();
        if (!(class046882.N() instanceof class05787)) {
            return false;
        }
        if (class046882.N().u(class046882) != 8) {
            return true;
        }
        return MovementHelper.possiblyFlowing(blockStateInterface.get0(n + 1, n2, n3)) || MovementHelper.possiblyFlowing(blockStateInterface.get0(n - 1, n2, n3)) || MovementHelper.possiblyFlowing(blockStateInterface.get0(n, n2, n3 + 1)) || MovementHelper.possiblyFlowing(blockStateInterface.get0(n, n2, n3 - 1));
    }

    public static boolean isLiquid(IPlayerContext iPlayerContext, class07209 class072092) {
        return MovementHelper.isLiquid(BlockStateInterface.get((IPlayerContext)iPlayerContext, (class07209)class072092));
    }

    public static boolean isLiquid(class00500 class005002) {
        return !class005002.Y().W();
    }

    public static boolean isLava(class00500 class005002) {
        class04651 class046512 = class005002.Y().N();
        return class046512 == class04684.i || class046512 == class04684.u;
    }

    public static boolean mustBeSolidToWalkOn(CalculationContext calculationContext, int n, int n2, int n3, class00500 class005002) {
        class00891 class008912 = class005002.i();
        if (class008912 == class00869.uW || class008912 == class00869.Rc) {
            return false;
        }
        if (!class005002.Y().W()) {
            class08061 class080612;
            if (class008912 instanceof class07007) {
                if (class005002.L((class08092)class07007.y) != class08054.field_12681) {
                    return true;
                }
            } else if (class008912 instanceof class07746) {
                if (class005002.L((class08092)class07746.L) == class08052.field_12619) {
                    return true;
                }
                class080612 = (class08061)class005002.L((class08092)class07746.u);
                if (class080612 == class08061.field_12712 || class080612 == class08061.field_12713) {
                    return true;
                }
            } else if (class008912 instanceof class00624) {
                if (!((Boolean)class005002.L((class08092)class00624.y)).booleanValue() && class005002.L((class08092)class00624.L) == class08052.field_12619) {
                    return true;
                }
            } else {
                if (class008912 == class00869.Pa) {
                    return true;
                }
                if (class008912 instanceof class07131) {
                    return true;
                }
            }
            if (calculationContext.assumeWalkOnWater) {
                return false;
            }
            class080612 = calculationContext.getBlock(n, n2 + 1, n3);
            if (class080612 instanceof class07117) {
                return false;
            }
        }
        return true;
    }

    public static void switchToBestToolFor(IPlayerContext iPlayerContext, class00500 class005002, ToolSet toolSet, boolean bl) {
        if (((Boolean)Baritone.settings().autoTool.value).booleanValue() && !((Boolean)Baritone.settings().assumeExternalAutoTool.value).booleanValue()) {
            iPlayerContext.player().method_31548().N(toolSet.getBestSlot(class005002.i(), bl));
        }
    }

    public static void switchToBestToolFor(IPlayerContext iPlayerContext, class00500 class005002) {
        MovementHelper.switchToBestToolFor(iPlayerContext, class005002, new ToolSet(iPlayerContext.player()), (Boolean)BaritoneAPI.getSettings().preferSilkTouch.value);
    }

    public static Ternary canWalkThroughBlockState(class00500 class005002) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        MovementHelper.handler$cfn000$nursultan$injectCanWalkThroughBlockState(class005002, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (Ternary)callbackInfoReturnable.getReturnValue();
        }
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class07662) {
            return Ternary.YES;
        }
        if (class008912 instanceof class05989 || class008912 == class00869.yw || class008912 == class00869.MW || class008912 == class00869.Mb || class008912 instanceof class07688 || class008912 == class00869.PN || class008912 instanceof class07027 || class008912 instanceof class07007 || class008912 instanceof class00624 || class008912 == class00869.TM || class008912 == class00869.Es || class008912 == class00869.sM || class008912 == class00869.vp || class008912 instanceof class05453 || class008912 instanceof class05555) {
            return Ternary.NO;
        }
        if (class008912 == class00869.nL) {
            return Ternary.NO;
        }
        if (class008912 == class00869.ba) {
            return Ternary.NO;
        }
        if (((List)Baritone.settings().blocksToAvoid.value).contains(class008912)) {
            return Ternary.NO;
        }
        if (class008912 instanceof class07196 || class008912 instanceof class07188) {
            if (class008912 == class00869.ur) {
                return Ternary.NO;
            }
            return Ternary.YES;
        }
        if (class008912 instanceof class00410) {
            return Ternary.MAYBE;
        }
        if (class008912 instanceof class06999) {
            return Ternary.MAYBE;
        }
        class04688 class046882 = class005002.Y();
        if (!class046882.W()) {
            if (class046882.N().u(class046882) != 8) {
                return Ternary.NO;
            }
            return Ternary.MAYBE;
        }
        if (class008912 instanceof class05476) {
            return Ternary.NO;
        }
        if (class005002.N(class08791.field_50)) {
            return Ternary.YES;
        }
        return Ternary.NO;
    }

    public static double getMiningDurationTicks(CalculationContext calculationContext, int n, int n2, int n3, boolean bl) {
        return MovementHelper.getMiningDurationTicks(calculationContext, n, n2, n3, calculationContext.get(n, n2, n3), bl);
    }

    public static double getMiningDurationTicks(CalculationContext calculationContext, int n, int n2, int n3, class00500 class005002, boolean bl) {
        class00891 class008912 = class005002.i();
        if (!MovementHelper.canWalkThrough(calculationContext, n, n2, n3, class005002)) {
            class00500 class005003;
            if (!class005002.Y().W()) {
                return 1000000.0;
            }
            double d = calculationContext.breakCostMultiplierAt(n, n2, n3, class005002);
            if (d >= 1000000.0) {
                return 1000000.0;
            }
            if (MovementHelper.avoidBreaking(calculationContext.bsi, n, n2, n3, class005002)) {
                return 1000000.0;
            }
            double d2 = calculationContext.toolSet.getStrVsBlock(class005002);
            if (d2 <= 0.0) {
                return 1000000.0;
            }
            double d3 = 1.0 / d2;
            d3 += calculationContext.breakBlockAdditionalCost;
            d3 *= d;
            if (bl && (class005003 = calculationContext.get(n, n2 + 1, n3)).i() instanceof class07204) {
                d3 += MovementHelper.getMiningDurationTicks(calculationContext, n, n2 + 1, n3, class005003, true);
            }
            return d3;
        }
        return 0.0;
    }

    public static boolean isHorizontalBlockPassable(class07209 class072092, class00500 class005002, class07209 class072093, class06667 class066672) {
        class07185 class071852;
        if (class072093.equals((Object)class072092)) {
            return false;
        }
        class07185 class071853 = ((class07211)class005002.L((class08092)class07101.R)).z();
        boolean bl = (Boolean)class005002.L((class08092)class066672);
        if (class072093.method_10095().equals((Object)class072092) || class072093.method_10072().equals((Object)class072092)) {
            class071852 = class07185.field_11051;
        } else if (class072093.method_10078().equals((Object)class072092) || class072093.method_10067().equals((Object)class072092)) {
            class071852 = class07185.field_11048;
        } else {
            return true;
        }
        return class071853 == class071852 == bl;
    }

    public static Ternary canWalkOnBlockState(class00500 class005002) {
        class00891 class008912 = class005002.i();
        if (MovementHelper.isBlockNormalCube(class005002) && (class008912 != class00869.EI || ((Boolean)Baritone.settings().allowWalkOnMagmaBlocks.value).booleanValue()) && class008912 != class00869.PN && class008912 != class00869.TM) {
            return Ternary.YES;
        }
        if (class008912 instanceof class05555) {
            return Ternary.YES;
        }
        if (class008912 == class00869.uW || class008912 == class00869.Rc && ((Boolean)Baritone.settings().allowVines.value).booleanValue()) {
            return Ternary.YES;
        }
        if (class008912 == class00869.Lr || class008912 == class00869.Ek || class008912 == class00869.iw) {
            return Ternary.YES;
        }
        if (class008912 == class00869.Mt || class008912 == class00869.LA || class008912 == class00869.BH) {
            return Ternary.YES;
        }
        if (class008912 == class00869.ND || class008912 instanceof class07734) {
            return Ternary.YES;
        }
        if (class008912 instanceof class07746) {
            return Ternary.YES;
        }
        if (MovementHelper.isWater(class005002)) {
            return Ternary.MAYBE;
        }
        if (MovementHelper.isLava(class005002) && ((Boolean)Baritone.settings().assumeWalkOnLava.value).booleanValue()) {
            return Ternary.MAYBE;
        }
        if (class008912 instanceof class07007) {
            if (!((Boolean)Baritone.settings().allowWalkOnBottomSlab.value).booleanValue()) {
                if (class005002.L((class08092)class07007.y) != class08054.field_12681) {
                    return Ternary.YES;
                }
                return Ternary.NO;
            }
            return Ternary.YES;
        }
        return Ternary.NO;
    }

    public static MovementHelper$PlaceResult attemptToPlaceABlock(MovementState movementState, IBaritone iBaritone, class07209 class072092, boolean bl, boolean bl2) {
        class07209 class072093;
        IPlayerContext iPlayerContext = iBaritone.getPlayerContext();
        Optional optional = RotationUtils.reachable((IPlayerContext)iPlayerContext, (class07209)class072092, (boolean)bl2);
        boolean bl3 = false;
        if (optional.isPresent()) {
            movementState.setTarget(new MovementState$MovementTarget((Rotation)optional.get(), true));
            bl3 = true;
        }
        for (int i = 0; i < 5; ++i) {
            class072093 = class072092.method_10093(Movement.HORIZONTALS_BUT_ALSO_DOWN_____SO_EVERY_DIRECTION_EXCEPT_UP[i]);
            if (!MovementHelper.canPlaceAgainst(iPlayerContext, class072093)) continue;
            if (!((Baritone)iBaritone).getInventoryBehavior().selectThrowawayForLocation(false, class072092.method_10263(), class072092.method_10264(), class072092.method_10260())) {
                Helper.HELPER.logDebug("bb pls get me some blocks. dirt, netherrack, cobble");
                movementState.setStatus(MovementStatus.UNREACHABLE);
                return MovementHelper$PlaceResult.NO_OPTION;
            }
            double d = ((double)(class072092.method_10263() + class072093.method_10263()) + 1.0) * 0.5;
            double d2 = ((double)(class072092.method_10264() + class072093.method_10264()) + 0.5) * 0.5;
            double d3 = ((double)(class072092.method_10260() + class072093.method_10260()) + 1.0) * 0.5;
            Rotation rotation = RotationUtils.calcRotationFromVec3d((class06889)(bl2 ? RayTraceUtils.inferSneakingEyePosition((class07049)iPlayerContext.player()) : iPlayerContext.playerHead()), (class06889)new class06889(d, d2, d3), (Rotation)iPlayerContext.playerRotations());
            Rotation rotation2 = iBaritone.getLookBehavior().getAimProcessor().peekRotation(rotation);
            class07089 class070892 = RayTraceUtils.rayTraceTowards((class07049)iPlayerContext.player(), (Rotation)rotation2, (double)iPlayerContext.playerController().getBlockReachDistance(), (boolean)bl2);
            if (class070892 == null || class070892.N() != class07113.field_1332 || !((class06183)class070892).u().equals((Object)class072093) || !((class06183)class070892).u().method_10093(((class06183)class070892).i()).equals((Object)class072092)) continue;
            movementState.setTarget(new MovementState$MovementTarget(rotation, true));
            bl3 = true;
            if (!bl) break;
        }
        if (iPlayerContext.getSelectedBlock().isPresent()) {
            class07209 class072094 = (class07209)iPlayerContext.getSelectedBlock().get();
            class072093 = ((class06183)iPlayerContext.objectMouseOver()).i();
            if (class072094.equals((Object)class072092) || MovementHelper.canPlaceAgainst(iPlayerContext, class072094) && class072094.method_10093((class07211)class072093).equals((Object)class072092)) {
                if (bl2) {
                    movementState.setInput(Input.SNEAK, true);
                }
                ((Baritone)iBaritone).getInventoryBehavior().selectThrowawayForLocation(true, class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
                return MovementHelper$PlaceResult.READY_TO_PLACE;
            }
        }
        if (bl3) {
            if (bl2) {
                movementState.setInput(Input.SNEAK, true);
            }
            ((Baritone)iBaritone).getInventoryBehavior().selectThrowawayForLocation(true, class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
            return MovementHelper$PlaceResult.ATTEMPTING;
        }
        return MovementHelper$PlaceResult.NO_OPTION;
    }

    public static Ternary fullyPassableBlockState(class00500 class005002) {
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class07662) {
            return Ternary.YES;
        }
        if (class008912 instanceof class05989 || class008912 == class00869.Ml || class008912 == class00869.yw || class008912 == class00869.Rc || class008912 == class00869.uW || class008912 == class00869.Mb || class008912 instanceof class05555 || class008912 instanceof class07196 || class008912 instanceof class07188 || class008912 instanceof class06999 || !class005002.Y().W() || class008912 instanceof class00624 || class008912 instanceof class07207 || class008912 instanceof class07000 || class008912 instanceof class07027) {
            return Ternary.NO;
        }
        if (class005002.N(class08791.field_50)) {
            return Ternary.YES;
        }
        return Ternary.NO;
    }

    public static boolean avoidAdjacentBreaking(BlockStateInterface blockStateInterface, int n, int n2, int n3, boolean bl) {
        class00500 class005002 = blockStateInterface.get0(n, n2, n3);
        class00891 class008912 = class005002.i();
        if (!bl && class008912 instanceof class07204 && ((Boolean)Baritone.settings().avoidUpdatingFallingBlocks.value).booleanValue() && class07204.U((class00500)blockStateInterface.get0(n, n2 - 1, n3))) {
            return true;
        }
        if (class008912 instanceof class07117) {
            if (bl || ((Boolean)Baritone.settings().strictLiquidCheck.value).booleanValue()) {
                return true;
            }
            int n4 = (Integer)class005002.L((class08092)class07117.y);
            if (n4 == 0) {
                return true;
            }
            return !(blockStateInterface.get0(n, n2 - 1, n3).i() instanceof class07117);
        }
        return !class005002.Y().W();
    }

    public static boolean canWalkThroughPosition(BlockStateInterface blockStateInterface, int n, int n2, int n3, class00500 class005002) {
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class00410) {
            return MovementHelper.canWalkOn(blockStateInterface, n, n2 - 1, n3);
        }
        if (class008912 instanceof class06999) {
            if (!blockStateInterface.worldContainsLoadedChunk(n, n3)) {
                return true;
            }
            if ((Integer)class005002.L((class08092)class06999.L) >= 3) {
                return false;
            }
            return MovementHelper.canWalkOn(blockStateInterface, n, n2 - 1, n3);
        }
        class04688 class046882 = class005002.Y();
        if (!class046882.W()) {
            if (MovementHelper.isFlowing(n, n2, n3, class005002, blockStateInterface)) {
                return false;
            }
            if (((Boolean)Baritone.settings().assumeWalkOnWater.value).booleanValue()) {
                return false;
            }
            class00500 class005003 = blockStateInterface.get0(n, n2 + 1, n3);
            if (!class005003.Y().W() || class005003.i() instanceof class00643) {
                return false;
            }
            return class046882.N() instanceof class04644;
        }
        return class005002.N(class08791.field_50);
    }

    public static boolean fullyPassablePosition(BlockStateInterface blockStateInterface, int n, int n2, int n3, class00500 class005002) {
        return class005002.N(class08791.field_50);
    }

    public static void moveTowardsWithoutRotation(IPlayerContext iPlayerContext, MovementState movementState, class07209 class072092) {
        float f = RotationUtils.calcRotationFromVec3d((class06889)iPlayerContext.playerHead(), (class06889)VecUtils.getBlockPosCenter((class07209)class072092), (Rotation)iPlayerContext.playerRotations()).getYaw();
        MovementHelper.moveTowardsWithoutRotation(iPlayerContext, movementState, f);
    }

    public static void moveTowardsWithoutRotation(IPlayerContext iPlayerContext, MovementState movementState, float f) {
        MovementOption.getOptions(class04995.m((double)(iPlayerContext.playerRotations().getYaw() * ((float)Math.PI / 180))), class04995.P((double)(iPlayerContext.playerRotations().getYaw() * ((float)Math.PI / 180))), (Boolean)Baritone.settings().allowSprint.value).min(Comparator.comparing(movementOption -> Float.valueOf(movementOption.distanceToSq(class04995.m((double)(f * ((float)Math.PI / 180))), class04995.P((double)(f * ((float)Math.PI / 180))))))).ifPresent(movementOption -> movementOption.setInputs(movementState));
    }

    private static void handler$cfn000$nursultan$injectCanWalkThroughBlockState(class00500 class005002, CallbackInfoReturnable callbackInfoReturnable) {
        class09334 class093342 = class09334.N((class00500)class005002);
        class11938.L().L((Object)class093342);
        if (class093342.y()) {
            callbackInfoReturnable.setReturnValue((Object)Ternary.YES);
        }
    }

    public static void moveTowardsWithSlightRotation(IPlayerContext iPlayerContext, MovementState movementState, class07209 class072092) {
        float f = RotationUtils.calcRotationFromVec3d((class06889)iPlayerContext.playerHead(), (class06889)VecUtils.getBlockPosCenter((class07209)class072092), (Rotation)iPlayerContext.playerRotations()).getYaw();
        float f2 = Rotation.yawDistanceFromOffset((float)iPlayerContext.playerRotations().getYaw(), (float)f) % 45.0f;
        float f3 = f2 > 0.0f ? (f2 > 22.5f ? f2 - 45.0f : f2) : (f2 < -22.5f ? f2 + 45.0f : f2);
        movementState.setTarget(new MovementState$MovementTarget(new Rotation(iPlayerContext.playerRotations().getYaw() - f3, iPlayerContext.playerRotations().getPitch()), true));
        MovementHelper.moveTowardsWithoutRotation(iPlayerContext, movementState, f);
    }

    public static boolean possiblyFlowing(class00500 class005002) {
        class04688 class046882 = class005002.Y();
        return class046882.N() instanceof class05787 && class046882.N().u(class046882) != 8;
    }

    public static boolean isBottomSlab(class00500 class005002) {
        return class005002.i() instanceof class07007 && class005002.L((class08092)class07007.y) == class08054.field_12681;
    }

    public static boolean canWalkThrough(CalculationContext calculationContext, int n, int n2, int n3, class00500 class005002) {
        return calculationContext.precomputedData.canWalkThrough(calculationContext.bsi, n, n2, n3, class005002);
    }

    public static boolean canWalkThrough(BlockStateInterface blockStateInterface, int n, int n2, int n3) {
        return MovementHelper.canWalkThrough(blockStateInterface, n, n2, n3, blockStateInterface.get0(n, n2, n3));
    }

    public static boolean canWalkThrough(BlockStateInterface blockStateInterface, int n, int n2, int n3, class00500 class005002) {
        Ternary ternary = MovementHelper.canWalkThroughBlockState(class005002);
        if (ternary == Ternary.YES) {
            return true;
        }
        if (ternary == Ternary.NO) {
            return false;
        }
        return MovementHelper.canWalkThroughPosition(blockStateInterface, n, n2, n3, class005002);
    }

    public static boolean canWalkThrough(IPlayerContext iPlayerContext, BetterBlockPos betterBlockPos) {
        return MovementHelper.canWalkThrough(new BlockStateInterface(iPlayerContext), betterBlockPos.x, betterBlockPos.y, betterBlockPos.z);
    }

    public static boolean canWalkThrough(CalculationContext calculationContext, int n, int n2, int n3) {
        return calculationContext.precomputedData.canWalkThrough(calculationContext.bsi, n, n2, n3, calculationContext.get(n, n2, n3));
    }

    public static boolean avoidWalkingInto(class00500 class005002) {
        class00891 class008912 = class005002.i();
        return !class005002.Y().W() || class008912 == class00869.EI && (Boolean)Baritone.settings().allowWalkOnMagmaBlocks.value == false || class008912 == class00869.ij || class008912 == class00869.sM || class008912 instanceof class05989 || class008912 == class00869.MW || class008912 == class00869.yw || class008912 == class00869.PN;
    }

    public static List<BetterBlockPos> steppingOnBlocks(IPlayerContext iPlayerContext) {
        ArrayList<BetterBlockPos> arrayList = new ArrayList<BetterBlockPos>();
        for (int n = -1; n <= 1; n = (int)((byte)(n + 1))) {
            for (int n2 = -1; n2 <= 1; n2 = (int)((byte)(n2 + 1))) {
                if (!iPlayerContext.player().method_5829().N(class06889.N((class00753)iPlayerContext.player().method_24515()).y((double)n, 0.0, (double)n2), class06889.N((class00753)iPlayerContext.player().method_24515()).y((double)(n + 1), 1.0, (double)(n2 + 1)))) continue;
                arrayList.add(new BetterBlockPos(iPlayerContext.player().method_31477() + n, iPlayerContext.player().method_31478() - 1, iPlayerContext.player().method_31479() + n2));
            }
        }
        return arrayList;
    }

    public static boolean isBlockNormalCube(class00500 class005002) {
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class07784 || class008912 instanceof class00511 || class008912 instanceof class06089 || class008912 instanceof class07027 || class008912 instanceof class06342 || class008912 instanceof class05453) {
            return false;
        }
        try {
            return class00891.N((class00494)class005002.M(null, null));
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static boolean canUseFrostWalker(CalculationContext calculationContext, class00500 class005002) {
        return calculationContext.frostWalker != 0 && class005002 == class00749.y() && (Integer)class005002.L((class08092)class07117.y) == 0;
    }

    public static boolean canUseFrostWalker(IPlayerContext iPlayerContext, class07209 class072092) {
        boolean bl = false;
        block0: for (class07085 class070852 : class07085.values()) {
            class02710 class027102 = iPlayerContext.player().method_6118(class070852).J();
            for (class03556 class035562 : class027102.N()) {
                if (!class035562.N(class07314.z)) continue;
                bl = true;
                break block0;
            }
        }
        class00500 class005002 = BlockStateInterface.get((IPlayerContext)iPlayerContext, (class07209)class072092);
        return bl && class005002 == class00749.y() && (Integer)class005002.L((class08092)class07117.y) == 0;
    }

    public static boolean isReplaceable(int n, int n2, int n3, class00500 class005002, BlockStateInterface blockStateInterface) {
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class07662) {
            return true;
        }
        if (class008912 instanceof class06999) {
            if (!blockStateInterface.worldContainsLoadedChunk(n, n3)) {
                return true;
            }
            return (Integer)class005002.L((class08092)class06999.L) == 1;
        }
        if (class008912 == class00869.zk || class008912 == class00869.zw) {
            return true;
        }
        return class005002.d();
    }

    public static boolean fullyPassable(IPlayerContext iPlayerContext, class07209 class072092) {
        class00500 class005002 = iPlayerContext.world().method_8320(class072092);
        Ternary ternary = MovementHelper.fullyPassableBlockState(class005002);
        if (ternary == Ternary.YES) {
            return true;
        }
        if (ternary == Ternary.NO) {
            return false;
        }
        return class005002.N(class08791.field_50);
    }

    public static boolean fullyPassable(CalculationContext calculationContext, int n, int n2, int n3) {
        return MovementHelper.fullyPassable(calculationContext, n, n2, n3, calculationContext.get(n, n2, n3));
    }

    public static boolean fullyPassable(CalculationContext calculationContext, int n, int n2, int n3, class00500 class005002) {
        return calculationContext.precomputedData.fullyPassable(calculationContext.bsi, n, n2, n3, class005002);
    }

    public static boolean isDoorPassable(IPlayerContext iPlayerContext, class07209 class072092, class07209 class072093) {
        if (class072093.equals((Object)class072092)) {
            return false;
        }
        class00500 class005002 = BlockStateInterface.get((IPlayerContext)iPlayerContext, (class07209)class072092);
        if (!(class005002.i() instanceof class07196)) {
            return true;
        }
        return MovementHelper.isHorizontalBlockPassable(class072092, class005002, class072093, class07196.i);
    }

    public static boolean avoidBreaking(BlockStateInterface blockStateInterface, int n, int n2, int n3, class00500 class005002) {
        if (!blockStateInterface.worldBorder.canPlaceAt(n, n3)) {
            return true;
        }
        class00891 class008912 = class005002.i();
        return ((List)Baritone.settings().blocksToDisallowBreaking.value).contains(class008912) || class008912 == class00869.iT || class008912 instanceof class07137 || MovementHelper.avoidAdjacentBreaking(blockStateInterface, n, n2 + 1, n3, true) || MovementHelper.avoidAdjacentBreaking(blockStateInterface, n + 1, n2, n3, false) || MovementHelper.avoidAdjacentBreaking(blockStateInterface, n - 1, n2, n3, false) || MovementHelper.avoidAdjacentBreaking(blockStateInterface, n, n2, n3 + 1, false) || MovementHelper.avoidAdjacentBreaking(blockStateInterface, n, n2, n3 - 1, false);
    }

    public static void moveTowards(IPlayerContext iPlayerContext, MovementState movementState, class07209 class072092) {
        movementState.setTarget(new MovementState$MovementTarget(RotationUtils.calcRotationFromVec3d((class06889)iPlayerContext.playerHead(), (class06889)VecUtils.getBlockPosCenter((class07209)class072092), (Rotation)iPlayerContext.playerRotations()).withPitch(iPlayerContext.playerRotations().getPitch()), false)).setInput(Input.MOVE_FORWARD, true);
    }

    public static boolean isGatePassable(IPlayerContext iPlayerContext, class07209 class072092, class07209 class072093) {
        if (class072093.equals((Object)class072092)) {
            return false;
        }
        class00500 class005002 = BlockStateInterface.get((IPlayerContext)iPlayerContext, (class07209)class072092);
        if (!(class005002.i() instanceof class07188)) {
            return true;
        }
        return (Boolean)class005002.L((class08092)class07188.y);
    }

    public static boolean canPlaceAgainst(BlockStateInterface blockStateInterface, class07209 class072092) {
        return MovementHelper.canPlaceAgainst(blockStateInterface, class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public static boolean canPlaceAgainst(IPlayerContext iPlayerContext, class07209 class072092) {
        return MovementHelper.canPlaceAgainst(new BlockStateInterface(iPlayerContext), class072092);
    }

    public static boolean canPlaceAgainst(BlockStateInterface blockStateInterface, int n, int n2, int n3, class00500 class005002) {
        if (!blockStateInterface.worldBorder.canPlaceAt(n, n3)) {
            return false;
        }
        return MovementHelper.isBlockNormalCube(class005002) || class005002.i() == class00869.ND || class005002.i() instanceof class07734;
    }

    public static boolean canPlaceAgainst(BlockStateInterface blockStateInterface, int n, int n2, int n3) {
        return MovementHelper.canPlaceAgainst(blockStateInterface, n, n2, n3, blockStateInterface.get0(n, n2, n3));
    }

    @Deprecated
    public static boolean isReplacable(int n, int n2, int n3, class00500 class005002, BlockStateInterface blockStateInterface) {
        return MovementHelper.isReplaceable(n, n2, n3, class005002, blockStateInterface);
    }

    public static boolean canWalkOnPosition(BlockStateInterface blockStateInterface, int n, int n2, int n3, class00500 class005002) {
        class00891 class008912 = class005002.i();
        if (MovementHelper.isWater(class005002)) {
            class00500 class005003 = blockStateInterface.get0(n, n2 + 1, n3);
            class00891 class008913 = class005003.i();
            if (class008913 == class00869.RS || class008913 instanceof class00410) {
                return true;
            }
            if (MovementHelper.isFlowing(n, n2, n3, class005002, blockStateInterface) || class005003.Y().N() == class04684.y) {
                return MovementHelper.isWater(class005003) && (Boolean)Baritone.settings().assumeWalkOnWater.value == false;
            }
            return MovementHelper.isWater(class005003) ^ (Boolean)Baritone.settings().assumeWalkOnWater.value;
        }
        return MovementHelper.isLava(class005002) && !MovementHelper.isFlowing(n, n2, n3, class005002, blockStateInterface) && (Boolean)Baritone.settings().assumeWalkOnLava.value != false;
    }

    public static boolean isTransparent(class00891 class008912) {
        return class008912 instanceof class07662 || class008912 == class00869.V || class008912 == class00869.K;
    }
}

