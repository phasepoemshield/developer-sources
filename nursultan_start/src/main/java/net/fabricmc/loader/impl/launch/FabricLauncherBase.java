/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.loader.impl.launch;

import net.fabricmc.loader.impl.launch.FabricLauncher;

public abstract class FabricLauncherBase
implements FabricLauncher {
    private static FabricLauncher launcher = new Default();

    public static void setLauncher(FabricLauncher fabricLauncher) {
        launcher = fabricLauncher;
    }

    public static FabricLauncher getLauncher() {
        return launcher;
    }

    private static final class Default
    extends FabricLauncherBase {
        private Default() {
        }

        @Override
        public String getTargetNamespace() {
            return "intermediary";
        }

        @Override
        public ClassLoader getTargetClassLoader() {
            return FabricLauncherBase.class.getClassLoader();
        }

        @Override
        public boolean isDevelopment() {
            return false;
        }
    }
}

