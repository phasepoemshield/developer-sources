/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.texture.utils.gif.gif;

import java.io.IOException;
import java.util.Locale;
import javax.imageio.ImageReader;
import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.stream.ImageInputStream;
import oxxxde.\u0630\u0626;
import oxxxde.\u0632\u0641;

public class A
extends ImageReaderSpi {
    private static final String[] names;
    private static final String[] suffixes;
    private static final String version = "1.0";
    private static final String vendorName = "Oracle Corporation";
    private static final String[] writerSpiNames;
    private static final String[] MIMETypes;
    private static final String readerClassName = "com.sun.imageio.plugins.gif.GIFImageReader";

    static {
        String[] stringArray = new String[2];
        stringArray[0] = "gif";
        stringArray[1] = "GIF";
        names = stringArray;
        String[] stringArray2 = new String[1];
        stringArray2[0] = "gif";
        suffixes = stringArray2;
        String[] stringArray3 = new String[1];
        stringArray3[0] = "image/gif";
        MIMETypes = stringArray3;
        String[] stringArray4 = new String[1];
        stringArray4[0] = "com.sun.imageio.plugins.gif.GIFImageWriterSpi";
        writerSpiNames = stringArray4;
    }

    @Override
    public String getDescription(Locale locale) {
        return "Standard GIF image reader";
    }

    public A() {
        Class[] classArray = new Class[1];
        classArray[0] = ImageInputStream.class;
        super(vendorName, version, names, suffixes, MIMETypes, readerClassName, classArray, writerSpiNames, true, "javax_imageio_gif_stream_1.0", "com.sun.imageio.plugins.gif.GIFStreamMetadataFormat", null, null, true, "javax_imageio_gif_image_1.0", "com.sun.imageio.plugins.gif.GIFImageMetadataFormat", null, null);
    }

    @Override
    public ImageReader createReaderInstance(Object extension) {
        return new \u0630\u0626(this);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean canDecodeInput(Object input) throws IOException {
        void var3_3;
        if (!(input instanceof ImageInputStream)) return false;
        ImageInputStream stream = (ImageInputStream)input;
        byte[] b2 = new byte[6];
        stream.mark();
        boolean full = \u0632\u0641.tryReadFully(stream, b2);
        stream.reset();
        if (!full) return false;
        if (b2[0] != 71) return false;
        if (b2[1] != 73) return false;
        if (b2[2] != 70) return false;
        if (b2[3] != 56) return false;
        if (b2[4] != 55) {
            if (b2[4] != 57) return false;
        }
        if (var3_3[5] != 97) return false;
        return true;
    }
}

