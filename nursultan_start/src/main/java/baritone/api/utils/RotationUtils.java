/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class05989
 *  minecraft.class06183
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07089
 *  minecraft.class07113
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07290
 */
package baritone.api.utils;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.RayTraceUtils;
import baritone.api.utils.Rotation;
import baritone.api.utils.VecUtils;
import java.util.Optional;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05989;
import minecraft.class06183;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07089;
import minecraft.class07113;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07290;

public final class RotationUtils {
    public static final double DEG_TO_RAD = Math.PI / 180;
    public static final float DEG_TO_RAD_F = (float)Math.PI / 180;
    public static final double RAD_TO_DEG = 57.29577951308232;
    public static final float RAD_TO_DEG_F = 57.29578f;
    private static final class06889[] BLOCK_SIDE_MULTIPLIERS = new class06889[]{new class06889(0.5, 0.0, 0.5), new class06889(0.5, 1.0, 0.5), new class06889(0.5, 0.5, 0.0), new class06889(0.5, 0.5, 1.0), new class06889(0.0, 0.5, 0.5), new class06889(1.0, 0.5, 0.5)};

    private RotationUtils() {
    }

    public static Optional<Rotation> reachable(IPlayerContext iPlayerContext, class07209 class072092) {
        return RotationUtils.reachable(iPlayerContext, class072092, false);
    }

    public static Optional<Rotation> reachable(IPlayerContext iPlayerContext, class07209 class072092, boolean bl) {
        return RotationUtils.reachable(iPlayerContext, class072092, iPlayerContext.playerController().getBlockReachDistance(), bl);
    }

    public static Optional<Rotation> reachable(IPlayerContext iPlayerContext, class07209 class072092, double d) {
        return RotationUtils.reachable(iPlayerContext, class072092, d, false);
    }

    @Deprecated
    public static Optional<Rotation> reachable(class04453 class044532, class07209 class072092, double d) {
        return RotationUtils.reachable(class044532, class072092, d, false);
    }

    @Deprecated
    public static Optional<Rotation> reachable(class04453 class044532, class07209 class072092, double d, boolean bl) {
        IBaritone iBaritone = BaritoneAPI.getProvider().getBaritoneForPlayer(class044532);
        IPlayerContext iPlayerContext = iBaritone.getPlayerContext();
        return RotationUtils.reachable(iPlayerContext, class072092, d, bl);
    }

    public static Optional<Rotation> reachable(IPlayerContext iPlayerContext, class07209 class072092, double d, boolean bl) {
        class00500 class005002;
        Optional<Rotation> optional;
        if (((Boolean)BaritoneAPI.getSettings().remainWithExistingLookDirection.value).booleanValue() && iPlayerContext.isLookingAt(class072092)) {
            optional = iPlayerContext.playerRotations().add(new Rotation(0.0f, 1.0E-4f));
            if (bl) {
                class005002 = RayTraceUtils.rayTraceTowards((class07049)iPlayerContext.player(), (Rotation)((Object)optional), d, true);
                if (class005002 != null && class005002.N() == class07113.field_1332 && ((class06183)class005002).u().equals((Object)class072092)) {
                    return Optional.of(optional);
                }
            } else {
                return Optional.of(optional);
            }
        }
        if ((optional = RotationUtils.reachableCenter(iPlayerContext, class072092, d, bl)).isPresent()) {
            return optional;
        }
        class005002 = iPlayerContext.world().method_8320(class072092);
        class00494 class004942 = class005002.R((class07290)iPlayerContext.world(), class072092);
        if (class004942.method_1110()) {
            class004942 = class00389.y();
        }
        for (class06889 class068892 : BLOCK_SIDE_MULTIPLIERS) {
            double d2 = class004942.method_1091(class07185.field_11048) * class068892.M + class004942.method_1105(class07185.field_11048) * (1.0 - class068892.M);
            double d3 = class004942.method_1091(class07185.field_11052) * class068892.B + class004942.method_1105(class07185.field_11052) * (1.0 - class068892.B);
            double d4 = class004942.method_1091(class07185.field_11051) * class068892.Z + class004942.method_1105(class07185.field_11051) * (1.0 - class068892.Z);
            optional = RotationUtils.reachableOffset(iPlayerContext, class072092, new class06889((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260()).y(d2, d3, d4), d, bl);
            if (!optional.isPresent()) continue;
            return optional;
        }
        return Optional.empty();
    }

    public static class06889 calcLookDirectionFromRotation(Rotation rotation) {
        float f = class04995.P((double)(-rotation.getYaw() * ((float)Math.PI / 180) - (float)Math.PI));
        float f2 = class04995.m((double)(-rotation.getYaw() * ((float)Math.PI / 180) - (float)Math.PI));
        float f3 = -class04995.P((double)(-rotation.getPitch() * ((float)Math.PI / 180)));
        float f4 = class04995.m((double)(-rotation.getPitch() * ((float)Math.PI / 180)));
        return new class06889((double)(f2 * f3), (double)f4, (double)(f * f3));
    }

    @Deprecated
    public static Optional<Rotation> reachableCenter(class07049 class070492, class07209 class072092, double d, boolean bl) {
        return RotationUtils.reachableOffset(class070492, class072092, VecUtils.calculateBlockCenter(class070492.method_73183(), class072092), d, bl);
    }

    public static Optional<Rotation> reachableCenter(IPlayerContext iPlayerContext, class07209 class072092, double d, boolean bl) {
        return RotationUtils.reachableOffset(iPlayerContext, class072092, VecUtils.calculateBlockCenter(iPlayerContext.world(), class072092), d, bl);
    }

    @Deprecated
    public static Optional<Rotation> reachableOffset(class07049 class070492, class07209 class072092, class06889 class068892, double d, boolean bl) {
        class06889 class068893 = bl ? RayTraceUtils.inferSneakingEyePosition(class070492) : class070492.method_5836(1.0f);
        Rotation rotation = RotationUtils.calcRotationFromVec3d(class068893, class068892, new Rotation(class070492.method_36454(), class070492.method_36455()));
        class07089 class070892 = RayTraceUtils.rayTraceTowards(class070492, rotation, d, bl);
        if (class070892 != null && class070892.N() == class07113.field_1332) {
            if (((class06183)class070892).u().equals((Object)class072092)) {
                return Optional.of(rotation);
            }
            if (class070492.method_73183().method_8320(class072092).i() instanceof class05989 && ((class06183)class070892).u().equals((Object)class072092.method_10074())) {
                return Optional.of(rotation);
            }
        }
        return Optional.empty();
    }

    public static Optional<Rotation> reachableOffset(IPlayerContext iPlayerContext, class07209 class072092, class06889 class068892, double d, boolean bl) {
        class06889 class068893 = bl ? RayTraceUtils.inferSneakingEyePosition((class07049)iPlayerContext.player()) : iPlayerContext.player().method_5836(1.0f);
        Rotation rotation = RotationUtils.calcRotationFromVec3d(class068893, class068892, iPlayerContext.playerRotations());
        Rotation rotation2 = BaritoneAPI.getProvider().getBaritoneForPlayer(iPlayerContext.player()).getLookBehavior().getAimProcessor().peekRotation(rotation);
        class07089 class070892 = RayTraceUtils.rayTraceTowards((class07049)iPlayerContext.player(), rotation2, d, bl);
        if (class070892 != null && class070892.N() == class07113.field_1332) {
            if (((class06183)class070892).u().equals((Object)class072092)) {
                return Optional.of(rotation);
            }
            if (iPlayerContext.world().method_8320(class072092).i() instanceof class05989 && ((class06183)class070892).u().equals((Object)class072092.method_10074())) {
                return Optional.of(rotation);
            }
        }
        return Optional.empty();
    }

    public static Rotation calcRotationFromCoords(class07209 class072092, class07209 class072093) {
        return RotationUtils.calcRotationFromVec3d(new class06889((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260()), new class06889((double)class072093.method_10263(), (double)class072093.method_10264(), (double)class072093.method_10260()));
    }

    public static Rotation calcRotationFromVec3d(class06889 class068892, class06889 class068893, Rotation rotation) {
        return RotationUtils.wrapAnglesToRelative(rotation, RotationUtils.calcRotationFromVec3d(class068892, class068893));
    }

    private static Rotation calcRotationFromVec3d(class06889 class068892, class06889 class068893) {
        double[] dArray = new double[]{class068892.M - class068893.M, class068892.B - class068893.B, class068892.Z - class068893.Z};
        double d = class04995.u((double)dArray[0], (double)(-dArray[2]));
        double d2 = Math.sqrt(dArray[0] * dArray[0] + dArray[2] * dArray[2]);
        double d3 = class04995.u((double)dArray[1], (double)d2);
        return new Rotation((float)(d * 57.29577951308232), (float)(d3 * 57.29577951308232));
    }

    @Deprecated
    public static class06889 calcVec3dFromRotation(Rotation rotation) {
        return RotationUtils.calcLookDirectionFromRotation(rotation);
    }

    public static Rotation wrapAnglesToRelative(Rotation rotation, Rotation rotation2) {
        if (rotation.yawIsReallyClose(rotation2)) {
            return new Rotation(rotation.getYaw(), rotation2.getPitch());
        }
        return rotation2.subtract(rotation).normalize().add(rotation);
    }
}

