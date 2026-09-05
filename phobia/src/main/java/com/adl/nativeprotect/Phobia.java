/*
 * Decompiled with CFR 0.152.
 */
package com.adl.nativeprotect;

import java.awt.Desktop;
import java.net.URI;

public final class Phobia {
    private static boolean opened;

    private Phobia() {
    }

    public static synchronized void open() {
        if (opened) {
            return;
        }
        opened = true;
        String string = "https://t.me/drugsoluti0ns";
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(URI.create(string));
                return;
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            new ProcessBuilder("rundll32", "url.dll,FileProtocolHandler", string).start();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }
}

