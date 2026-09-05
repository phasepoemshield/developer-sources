/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.raphimc.vialegacy.ViaLegacyPlatformImpl
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.platform;

import com.viaversion.viaversion.api.Via;
import net.raphimc.vialegacy.ViaLegacyPlatformImpl;

public final class ViaFabricPlusViaLegacyPlatform
extends ViaLegacyPlatformImpl {
    public String getCpeAppName() {
        return Via.getPlatform().getPlatformName() + " " + Via.getPlatform().getPlatformVersion();
    }
}

