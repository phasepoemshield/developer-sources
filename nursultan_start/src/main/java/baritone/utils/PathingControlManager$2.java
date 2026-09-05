/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.process.PathingCommandType
 */
package baritone.utils;

import baritone.api.process.PathingCommandType;

class PathingControlManager$2 {
    static final /* synthetic */ int[] $SwitchMap$baritone$api$process$PathingCommandType;

    static {
        $SwitchMap$baritone$api$process$PathingCommandType = new int[PathingCommandType.values().length];
        try {
            PathingControlManager$2.$SwitchMap$baritone$api$process$PathingCommandType[PathingCommandType.SET_GOAL_AND_PAUSE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            PathingControlManager$2.$SwitchMap$baritone$api$process$PathingCommandType[PathingCommandType.REQUEST_PAUSE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            PathingControlManager$2.$SwitchMap$baritone$api$process$PathingCommandType[PathingCommandType.CANCEL_AND_SET_GOAL.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            PathingControlManager$2.$SwitchMap$baritone$api$process$PathingCommandType[PathingCommandType.FORCE_REVALIDATE_GOAL_AND_PATH.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            PathingControlManager$2.$SwitchMap$baritone$api$process$PathingCommandType[PathingCommandType.REVALIDATE_GOAL_AND_PATH.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            PathingControlManager$2.$SwitchMap$baritone$api$process$PathingCommandType[PathingCommandType.SET_GOAL_AND_PATH.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

