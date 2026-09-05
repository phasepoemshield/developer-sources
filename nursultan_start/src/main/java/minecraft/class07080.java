/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  minecraft.class02587
 *  minecraft.class03463
 *  minecraft.class04583
 *  minecraft.class06290
 *  minecraft.class07878
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CompletionException;
import minecraft.class02587;
import minecraft.class03463;
import minecraft.class04583;
import minecraft.class06290;
import minecraft.class07074;
import minecraft.class07878;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07080 {
    private static final Logger N = LogUtils.getLogger();
    private static final DateTimeFormatter y = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.ROOT);
    private final String L;
    private final Throwable u;
    private final List<class07074> i = Lists.newArrayList();
    private @Nullable Path R;
    private boolean M = true;
    private StackTraceElement[] B = new StackTraceElement[0];
    private final class03463 Z = new class03463();

    public String L() {
        StringBuilder stringBuilder = new StringBuilder();
        this.N(stringBuilder);
        return stringBuilder.toString();
    }

    public static void M() {
        class04583.N();
        new class07080("Don't panic!", new Throwable()).N(class02587.N);
    }

    public class07080(String string, Throwable throwable) {
        this.L = string;
        this.u = throwable;
    }

    public @Nullable Path i() {
        return this.R;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String u() {
        String string;
        StringWriter stringWriter = null;
        PrintWriter printWriter = null;
        Throwable throwable = this.u;
        if (throwable.getMessage() == null) {
            if (throwable instanceof NullPointerException) {
                throwable = new NullPointerException(this.L);
            } else if (throwable instanceof StackOverflowError) {
                throwable = new StackOverflowError(this.L);
            } else if (throwable instanceof OutOfMemoryError) {
                throwable = new OutOfMemoryError(this.L);
            }
            throwable.setStackTrace(this.u.getStackTrace());
        }
        try {
            stringWriter = new StringWriter();
            printWriter = new PrintWriter(stringWriter);
            throwable.printStackTrace(printWriter);
            string = stringWriter.toString();
        }
        catch (Throwable throwable2) {
            IOUtils.closeQuietly((Writer)stringWriter);
            IOUtils.closeQuietly(printWriter);
            throw throwable2;
        }
        IOUtils.closeQuietly((Writer)stringWriter);
        IOUtils.closeQuietly((Writer)printWriter);
        return string;
    }

    public Throwable y() {
        return this.u;
    }

    public class07074 N(String string) {
        return this.N(string, 1);
    }

    public class07074 N(String string, int n) {
        class07074 class070742 = new class07074(string);
        if (this.M) {
            int n2 = class070742.N(n);
            StackTraceElement[] stackTraceElementArray = this.u.getStackTrace();
            StackTraceElement stackTraceElement = null;
            StackTraceElement stackTraceElement2 = null;
            int n3 = stackTraceElementArray.length - n2;
            if (n3 < 0) {
                N.error("Negative index in crash report handler ({}/{})", (Object)stackTraceElementArray.length, (Object)n2);
            }
            if (stackTraceElementArray != null && 0 <= n3 && n3 < stackTraceElementArray.length) {
                stackTraceElement = stackTraceElementArray[n3];
                if (stackTraceElementArray.length + 1 - n2 < stackTraceElementArray.length) {
                    stackTraceElement2 = stackTraceElementArray[stackTraceElementArray.length + 1 - n2];
                }
            }
            this.M = class070742.N(stackTraceElement, stackTraceElement2);
            if (stackTraceElementArray != null && stackTraceElementArray.length >= n2 && 0 <= n3 && n3 < stackTraceElementArray.length) {
                this.B = new StackTraceElement[n3];
                System.arraycopy(stackTraceElementArray, 0, this.B, 0, this.B.length);
            } else {
                this.M = false;
            }
        }
        this.i.add(class070742);
        return class070742;
    }

    public static class07080 N(Throwable throwable, String string) {
        while (throwable instanceof CompletionException && throwable.getCause() != null) {
            throwable = throwable.getCause();
        }
        class07080 class070802 = throwable instanceof class07878 ? ((class07878)throwable).N() : new class07080(string, throwable);
        return class070802;
    }

    public void N(StringBuilder stringBuilder) {
        if (!(this.B != null && this.B.length > 0 || this.i.isEmpty())) {
            this.B = (StackTraceElement[])ArrayUtils.subarray((Object[])this.i.get(0).N(), (int)0, (int)1);
        }
        if (this.B != null && this.B.length > 0) {
            stringBuilder.append("-- Head --\n");
            stringBuilder.append("Thread: ").append(Thread.currentThread().getName()).append("\n");
            stringBuilder.append("Stacktrace:\n");
            for (StackTraceElement stackTraceElement : this.B) {
                stringBuilder.append("\t").append("at ").append(stackTraceElement);
                stringBuilder.append("\n");
            }
            stringBuilder.append("\n");
        }
        for (class07074 class070742 : this.i) {
            class070742.N(stringBuilder);
            stringBuilder.append("\n\n");
        }
        this.Z.N(stringBuilder);
    }

    public String N() {
        return this.L;
    }

    public String N(class02587 class025872) {
        return this.N(class025872, List.of());
    }

    public String N(class02587 class025872, List<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        class025872.N(stringBuilder, list);
        stringBuilder.append("Time: ");
        stringBuilder.append(y.format(ZonedDateTime.now()));
        stringBuilder.append("\n");
        stringBuilder.append("Description: ");
        stringBuilder.append(this.L);
        stringBuilder.append("\n\n");
        stringBuilder.append(this.u());
        stringBuilder.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
        for (int i = 0; i < 87; ++i) {
            stringBuilder.append("-");
        }
        stringBuilder.append("\n\n");
        this.N(stringBuilder);
        return stringBuilder.toString();
    }

    public boolean N(Path path, class02587 class025872) {
        return this.N(path, class025872, List.of());
    }

    public boolean N(Path path, class02587 class025872, List<String> list) {
        if (this.R != null) {
            return false;
        }
        try {
            if (path.getParent() != null) {
                class06290.L((Path)path.getParent());
            }
            try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, StandardCharsets.UTF_8, new OpenOption[0]);){
                bufferedWriter.write(this.N(class025872, list));
            }
            this.R = path;
            return true;
        }
        catch (Throwable throwable) {
            N.error("Could not save crash report to {}", (Object)path, (Object)throwable);
            return false;
        }
    }

    public class03463 R() {
        return this.Z;
    }
}

