/*
 * Decompiled with CFR 0.152.
 */
package baritone.pathing.movement.movements;

import baritone.pathing.movement.MovementHelper$PlaceResult;

class MovementTraverse$1 {
    static final /* synthetic */ int[] $SwitchMap$baritone$pathing$movement$MovementHelper$PlaceResult;

    static {
        $SwitchMap$baritone$pathing$movement$MovementHelper$PlaceResult = new int[MovementHelper$PlaceResult.values().length];
        try {
            MovementTraverse$1.$SwitchMap$baritone$pathing$movement$MovementHelper$PlaceResult[MovementHelper$PlaceResult.READY_TO_PLACE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            MovementTraverse$1.$SwitchMap$baritone$pathing$movement$MovementHelper$PlaceResult[MovementHelper$PlaceResult.ATTEMPTING.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

