/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import minecraft.class07531;
import minecraft.class07536;
import minecraft.class07548;

public class class07533
extends Enum<class07533> {
    public static final /* enum */ class07533 field_1135 = new class07533("linux");
    public static final /* enum */ class07533 field_1134 = new class07533("solaris");
    public static final /* enum */ class07533 field_1133 = new class07531("WINDOWS", 2, "windows");
    public static final /* enum */ class07533 field_1137 = new class07548("OSX", 3, "mac");
    public static final /* enum */ class07533 field_1132 = new class07533("unknown");
    private final String field_34894;
    private static final /* synthetic */ class07533[] field_1136;

    class07533(String string2) {
        this.field_34894 = string2;
    }

    public static class07533[] values() {
        return (class07533[])field_1136.clone();
    }

    public static class07533 valueOf(String string) {
        return Enum.valueOf(class07533.class, string);
    }

    protected String[] y(URI uRI) {
        String string = uRI.toString();
        if ("file".equals(uRI.getScheme())) {
            string = string.replace("file:", "file://");
        }
        return new String[]{"xdg-open", string};
    }

    private static /* synthetic */ class07533[] y() {
        return new class07533[]{field_1135, field_1134, field_1133, field_1137, field_1132};
    }

    public String N() {
        return this.field_34894;
    }

    public void N(Path path) {
        this.N(path.toUri());
    }

    public void N(String string) {
        try {
            this.N(new URI(string));
        }
        catch (IllegalArgumentException | URISyntaxException exception) {
            class07536.N.error("Couldn't open uri '{}'", (Object)string, (Object)exception);
        }
    }

    public void N(File file) {
        this.N(file.toURI());
    }

    public void N(URI uRI) {
        try {
            Process process = Runtime.getRuntime().exec(this.y(uRI));
            process.getInputStream().close();
            process.getErrorStream().close();
            process.getOutputStream().close();
        }
        catch (IOException iOException) {
            class07536.N.error("Couldn't open location '{}'", (Object)uRI, (Object)iOException);
        }
    }

    static {
        field_1136 = class07533.y();
    }
}

