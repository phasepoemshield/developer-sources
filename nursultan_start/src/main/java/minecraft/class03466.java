/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class01846
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.OutputStream;
import minecraft.class01846;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03466
extends class01846 {
    private static final Logger y = LogUtils.getLogger();

    public class03466(String string, OutputStream outputStream) {
        super(string, outputStream);
    }

    protected void N(@Nullable String string) {
        StackTraceElement[] stackTraceElementArray = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTraceElementArray[Math.min(3, stackTraceElementArray.length)];
        y.info("[{}]@.({}:{}): {}", new Object[]{this.N, stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), string});
    }
}

