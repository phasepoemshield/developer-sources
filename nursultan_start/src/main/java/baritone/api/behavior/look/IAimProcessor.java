/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.Rotation
 */
package baritone.api.behavior.look;

import baritone.api.behavior.look.ITickableAimProcessor;
import baritone.api.utils.Rotation;

public interface IAimProcessor {
    public ITickableAimProcessor fork();

    public Rotation peekRotation(Rotation var1);
}

