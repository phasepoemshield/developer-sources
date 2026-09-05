/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 */
package net.irisshaders.iris.helpers;

import net.irisshaders.iris.uniforms.CapturedRenderingState;

public class EntityState {
    private static int backupValue;
    private static boolean hasBackup;

    public static void interposeItemId(int n) {
        if (hasBackup) {
            return;
        }
        backupValue = CapturedRenderingState.INSTANCE.getCurrentRenderedItem();
        hasBackup = true;
        CapturedRenderingState.INSTANCE.setCurrentRenderedItem(n);
    }

    public static void restoreItemId() {
        if (hasBackup) {
            hasBackup = false;
            CapturedRenderingState.INSTANCE.setCurrentRenderedItem(backupValue);
        }
    }
}

