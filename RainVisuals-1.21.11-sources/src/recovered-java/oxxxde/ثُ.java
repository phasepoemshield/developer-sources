/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.net.URL;
import oxxxde.\u0627\u0635;
import oxxxde.\u062b\u0624;
import oxxxde.\u062b\u0637;
import oxxxde.\u062d\u0635;
import oxxxde.\u0632\u0633;
import oxxxde.\u0632\u064d;

public final class \u062b\u064f {
    public static \u062b\u0624<\u0632\u0633> FILE_ENTRY;
    public static final \u062b\u0624<InputStream> INPUT_STREAM;
    public static \u062b\u0624<URL> URL;
    public static final \u062b\u0624<BufferedImage> BUFFERED_IMAGE;

    static {
        INPUT_STREAM = new \u062b\u0637();
        FILE_ENTRY = new \u0627\u0635();
        URL = new \u0632\u064d();
        BUFFERED_IMAGE = new \u062d\u0635();
    }
}

