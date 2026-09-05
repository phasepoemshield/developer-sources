/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  minecraft.class00494
 *  minecraft.class07003
 *  minecraft.class07185
 *  minecraft.class07739
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package net.caffeinemc.mods.lithium.common.shapes;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import minecraft.class00494;
import minecraft.class07003;
import minecraft.class07185;
import minecraft.class07739;
import net.caffeinemc.mods.lithium.common.shapes.VoxelShapeSimpleCube;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class VoxelShapeMatchesAnywhere {
    private static boolean intersects(VoxelShapeSimpleCube voxelShapeSimpleCube, VoxelShapeSimpleCube voxelShapeSimpleCube2) {
        return voxelShapeSimpleCube.method_1091(class07185.field_11048) < voxelShapeSimpleCube2.method_1105(class07185.field_11048) - 1.0E-7 && voxelShapeSimpleCube.method_1105(class07185.field_11048) > voxelShapeSimpleCube2.method_1091(class07185.field_11048) + 1.0E-7 && voxelShapeSimpleCube.method_1091(class07185.field_11052) < voxelShapeSimpleCube2.method_1105(class07185.field_11052) - 1.0E-7 && voxelShapeSimpleCube.method_1105(class07185.field_11052) > voxelShapeSimpleCube2.method_1091(class07185.field_11052) + 1.0E-7 && voxelShapeSimpleCube.method_1091(class07185.field_11051) < voxelShapeSimpleCube2.method_1105(class07185.field_11051) - 1.0E-7 && voxelShapeSimpleCube.method_1105(class07185.field_11051) > voxelShapeSimpleCube2.method_1091(class07185.field_11051) + 1.0E-7;
    }

    private static boolean exceedsShape(VoxelShapeSimpleCube voxelShapeSimpleCube, VoxelShapeSimpleCube voxelShapeSimpleCube2) {
        return voxelShapeSimpleCube.method_1091(class07185.field_11048) < voxelShapeSimpleCube2.method_1091(class07185.field_11048) - 1.0E-7 || voxelShapeSimpleCube.method_1105(class07185.field_11048) > voxelShapeSimpleCube2.method_1105(class07185.field_11048) + 1.0E-7 || voxelShapeSimpleCube.method_1091(class07185.field_11052) < voxelShapeSimpleCube2.method_1091(class07185.field_11052) - 1.0E-7 || voxelShapeSimpleCube.method_1105(class07185.field_11052) > voxelShapeSimpleCube2.method_1105(class07185.field_11052) + 1.0E-7 || voxelShapeSimpleCube.method_1091(class07185.field_11051) < voxelShapeSimpleCube2.method_1091(class07185.field_11051) - 1.0E-7 || voxelShapeSimpleCube.method_1105(class07185.field_11051) > voxelShapeSimpleCube2.method_1105(class07185.field_11051) + 1.0E-7;
    }

    private static boolean exceedsCube(VoxelShapeSimpleCube voxelShapeSimpleCube, double d, double d2, double d3, double d4, double d5, double d6) {
        return voxelShapeSimpleCube.method_1091(class07185.field_11048) < d - 1.0E-7 || voxelShapeSimpleCube.method_1105(class07185.field_11048) > d4 + 1.0E-7 || voxelShapeSimpleCube.method_1091(class07185.field_11052) < d2 - 1.0E-7 || voxelShapeSimpleCube.method_1105(class07185.field_11052) > d5 + 1.0E-7 || voxelShapeSimpleCube.method_1091(class07185.field_11051) < d3 - 1.0E-7 || voxelShapeSimpleCube.method_1105(class07185.field_11051) > d6 + 1.0E-7;
    }

    public static void cuboidMatchesAnywhere(class00494 class004942, class00494 class004943, class07003 class070032, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (class004942 instanceof VoxelShapeSimpleCube && class004943 instanceof VoxelShapeSimpleCube) {
            if (((VoxelShapeSimpleCube)class004942).isTiny || ((VoxelShapeSimpleCube)class004943).isTiny) {
                return;
            }
            if (class070032.apply(true, true)) {
                if (VoxelShapeMatchesAnywhere.intersects((VoxelShapeSimpleCube)class004942, (VoxelShapeSimpleCube)class004943)) {
                    callbackInfoReturnable.setReturnValue((Object)true);
                    return;
                }
                callbackInfoReturnable.setReturnValue((Object)(class070032.apply(true, false) || class070032.apply(false, true) ? 1 : 0));
            } else {
                if (class070032.apply(true, false) && VoxelShapeMatchesAnywhere.exceedsShape((VoxelShapeSimpleCube)class004942, (VoxelShapeSimpleCube)class004943)) {
                    callbackInfoReturnable.setReturnValue((Object)true);
                    return;
                }
                if (class070032.apply(false, true) && VoxelShapeMatchesAnywhere.exceedsShape((VoxelShapeSimpleCube)class004943, (VoxelShapeSimpleCube)class004942)) {
                    callbackInfoReturnable.setReturnValue((Object)true);
                    return;
                }
            }
            callbackInfoReturnable.setReturnValue((Object)false);
        } else if (class004942 instanceof VoxelShapeSimpleCube || class004943 instanceof VoxelShapeSimpleCube) {
            class00494 class004944;
            VoxelShapeSimpleCube voxelShapeSimpleCube = (VoxelShapeSimpleCube)(class004942 instanceof VoxelShapeSimpleCube ? class004942 : class004943);
            class00494 class004945 = class004944 = voxelShapeSimpleCube == class004942 ? class004943 : class004942;
            if (voxelShapeSimpleCube.isTiny || VoxelShapeMatchesAnywhere.isTiny(class004944)) {
                return;
            }
            boolean bl = class070032.apply(class004942 == voxelShapeSimpleCube, class004943 == voxelShapeSimpleCube);
            if (bl && VoxelShapeMatchesAnywhere.exceedsCube(voxelShapeSimpleCube, class004944.method_1091(class07185.field_11048), class004944.method_1091(class07185.field_11052), class004944.method_1091(class07185.field_11051), class004944.method_1105(class07185.field_11048), class004944.method_1105(class07185.field_11052), class004944.method_1105(class07185.field_11051))) {
                callbackInfoReturnable.setReturnValue((Object)true);
                return;
            }
            boolean bl2 = class070032.apply(true, true);
            boolean bl3 = class070032.apply(class004942 == class004944, class004943 == class004944);
            class07739 class077392 = class004944.field_1401;
            DoubleList doubleList = class004944.method_1109(class07185.field_11048);
            DoubleList doubleList2 = class004944.method_1109(class07185.field_11052);
            DoubleList doubleList3 = class004944.method_1109(class07185.field_11051);
            int n = class077392.method_1045(class07185.field_11048);
            int n2 = class077392.method_1045(class07185.field_11052);
            int n3 = class077392.method_1045(class07185.field_11051);
            double d = voxelShapeSimpleCube.method_1105(class07185.field_11048);
            double d2 = voxelShapeSimpleCube.method_1091(class07185.field_11048);
            double d3 = voxelShapeSimpleCube.method_1105(class07185.field_11052);
            double d4 = voxelShapeSimpleCube.method_1091(class07185.field_11052);
            double d5 = voxelShapeSimpleCube.method_1105(class07185.field_11051);
            double d6 = voxelShapeSimpleCube.method_1091(class07185.field_11051);
            for (int i = class077392.method_1055(class07185.field_11048); i < n; ++i) {
                boolean bl4;
                boolean bl5 = bl4 = d - 1.0E-7 > doubleList.getDouble(i) && d2 < doubleList.getDouble(i + 1) - 1.0E-7;
                if (!bl3 && !bl4) continue;
                boolean bl6 = !(!bl3 || d >= doubleList.getDouble(i + 1) - 1.0E-7 && d2 - 1.0E-7 <= doubleList.getDouble(i));
                for (int j = class077392.method_1055(class07185.field_11052); j < n2; ++j) {
                    boolean bl7;
                    boolean bl8 = bl7 = d3 - 1.0E-7 > doubleList2.getDouble(j) && d4 < doubleList2.getDouble(j + 1) - 1.0E-7;
                    if (!bl3 && !bl7) continue;
                    boolean bl9 = !(!bl3 || d3 >= doubleList2.getDouble(j + 1) - 1.0E-7 && d4 - 1.0E-7 <= doubleList2.getDouble(j));
                    for (int k = class077392.method_1055(class07185.field_11051); k < n3; ++k) {
                        boolean bl10;
                        boolean bl11;
                        boolean bl12 = bl11 = d5 - 1.0E-7 > doubleList3.getDouble(k) && d6 < doubleList3.getDouble(k + 1) - 1.0E-7;
                        if (!bl3 && !bl11) continue;
                        boolean bl13 = !(!bl3 || d5 >= doubleList3.getDouble(k + 1) - 1.0E-7 && d6 - 1.0E-7 <= doubleList3.getDouble(k));
                        boolean bl14 = class077392.method_1044(i, j, k);
                        boolean bl15 = bl10 = bl4 && bl7 && bl11;
                        if (!(bl2 && bl14 && bl10 || bl && !bl14 && bl10) && (!bl3 || !bl14 || !bl6 && !bl9 && !bl13)) continue;
                        callbackInfoReturnable.setReturnValue((Object)true);
                        return;
                    }
                }
            }
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    private static boolean isTiny(class00494 class004942) {
        return class004942.method_1091(class07185.field_11048) > class004942.method_1105(class07185.field_11048) - 3.0E-7 || class004942.method_1091(class07185.field_11052) > class004942.method_1105(class07185.field_11052) - 3.0E-7 || class004942.method_1091(class07185.field_11051) > class004942.method_1105(class07185.field_11051) - 3.0E-7;
    }
}

