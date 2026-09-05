/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.pathing.movement.MovementHelper$PlaceResult
 */
package baritone.process;

import baritone.pathing.movement.MovementHelper;

class BackfillProcess$1 {
    static final /* synthetic */ int[] $SwitchMap$baritone$pathing$movement$MovementHelper$PlaceResult;

    static {
        $SwitchMap$baritone$pathing$movement$MovementHelper$PlaceResult = new int[MovementHelper.PlaceResult.values().length];
        try {
            BackfillProcess$1.$SwitchMap$baritone$pathing$movement$MovementHelper$PlaceResult[MovementHelper.PlaceResult.NO_OPTION.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            BackfillProcess$1.$SwitchMap$baritone$pathing$movement$MovementHelper$PlaceResult[MovementHelper.PlaceResult.READY_TO_PLACE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            BackfillProcess$1.$SwitchMap$baritone$pathing$movement$MovementHelper$PlaceResult[MovementHelper.PlaceResult.ATTEMPTING.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

