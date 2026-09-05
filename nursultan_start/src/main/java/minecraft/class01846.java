/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01846
extends PrintStream {
    private static final Logger y = LogUtils.getLogger();
    protected final String N;

    public class01846(String string, OutputStream outputStream) {
        super(outputStream, false, StandardCharsets.UTF_8);
        this.N = string;
    }

    @Override
    public void println(@Nullable String string) {
        this.N(string);
    }

    @Override
    public void println(@Nullable Object object) {
        this.N(String.valueOf(object));
    }

    protected void N(@Nullable String string) {
        y.info("[{}]: {}", (Object)this.N, (Object)string);
    }
}

