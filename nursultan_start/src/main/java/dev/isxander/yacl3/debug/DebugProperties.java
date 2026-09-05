/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.platform.YACLPlatform
 */
package dev.isxander.yacl3.debug;

import dev.isxander.yacl3.platform.YACLPlatform;

public final class DebugProperties {
    public static final boolean IMAGE_FILTERING = DebugProperties.boolProp("imageFiltering", false, false);

    private static boolean boolProp(String string, boolean bl, boolean bl2) {
        boolean bl3 = YACLPlatform.isDevelopmentEnv() ? bl2 : bl;
        return Boolean.parseBoolean(System.getProperty("yacl3.debug." + string, Boolean.toString(bl3)));
    }
}

