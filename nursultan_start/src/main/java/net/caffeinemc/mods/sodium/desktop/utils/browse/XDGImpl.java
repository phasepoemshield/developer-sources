/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.desktop.utils.browse;

import java.io.IOException;
import java.util.Locale;
import net.caffeinemc.mods.sodium.desktop.utils.browse.BrowseUrlHandler;

class XDGImpl
implements BrowseUrlHandler {
    XDGImpl() {
    }

    public static boolean isSupported() {
        String string = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        return string.equals("linux");
    }

    @Override
    public void browseTo(String string) throws IOException {
        Process process = Runtime.getRuntime().exec(new String[]{"xdg-open", string});
        try {
            int n = process.waitFor();
            if (n != 0) {
                throw new IOException("xdg-open exited with code: %d".formatted(new Object[]{n}));
            }
        }
        catch (InterruptedException interruptedException) {
            throw new RuntimeException(interruptedException);
        }
    }
}

