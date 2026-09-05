/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.behavior.IBehavior
 */
package baritone.api.utils;

import baritone.api.behavior.IBehavior;
import baritone.api.utils.input.Input;

public interface IInputOverrideHandler
extends IBehavior {
    public void setInputForceState(Input var1, boolean var2);

    public boolean isInputForcedDown(Input var1);

    public void clearAllKeys();
}

