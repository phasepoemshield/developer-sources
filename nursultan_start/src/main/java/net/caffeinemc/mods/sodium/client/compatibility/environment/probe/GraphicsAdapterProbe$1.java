/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.compatibility.environment.probe;

import net.caffeinemc.mods.sodium.client.compatibility.environment.OsUtils$OperatingSystem;

class GraphicsAdapterProbe$1 {
    static final /* synthetic */ int[] $SwitchMap$net$caffeinemc$mods$sodium$client$compatibility$environment$OsUtils$OperatingSystem;

    static {
        $SwitchMap$net$caffeinemc$mods$sodium$client$compatibility$environment$OsUtils$OperatingSystem = new int[OsUtils$OperatingSystem.values().length];
        try {
            GraphicsAdapterProbe$1.$SwitchMap$net$caffeinemc$mods$sodium$client$compatibility$environment$OsUtils$OperatingSystem[OsUtils$OperatingSystem.WIN.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            GraphicsAdapterProbe$1.$SwitchMap$net$caffeinemc$mods$sodium$client$compatibility$environment$OsUtils$OperatingSystem[OsUtils$OperatingSystem.LINUX.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

