/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 */
package minecraft;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.function.Supplier;
import minecraft.class01066;
import minecraft.class01894;

class class01082
extends FilterInputStream {
    private final Supplier<String> N;
    private boolean y;

    public class01082(InputStream inputStream, class01894 class018942, String string) {
        super(inputStream);
        Exception exception = new Exception("Stacktrace");
        this.N = () -> {
            StringWriter stringWriter = new StringWriter();
            exception.printStackTrace(new PrintWriter(stringWriter));
            return "Leaked resource: '" + String.valueOf(class018942) + "' loaded from pack: '" + string + "'\n" + String.valueOf(stringWriter);
        };
    }

    protected void finalize() throws Throwable {
        if (!this.y) {
            class01066.N.warn("{}", (Object)this.N.get());
        }
        super.finalize();
    }

    @Override
    public void close() throws IOException {
        super.close();
        this.y = true;
    }
}

