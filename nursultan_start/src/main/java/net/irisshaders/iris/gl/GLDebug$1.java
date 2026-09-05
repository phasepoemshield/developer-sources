/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.gl;

import java.io.PrintStream;
import java.util.function.Consumer;
import net.irisshaders.iris.gl.GLDebug;

class GLDebug$1
implements Consumer<String> {
    boolean first = true;
    final /* synthetic */ PrintStream val$stream;

    GLDebug$1(PrintStream printStream) {
        this.val$stream = printStream;
    }

    @Override
    public void accept(String string) {
        if (this.first) {
            GLDebug.printDetail(this.val$stream, "Stacktrace", string);
            this.first = false;
        } else {
            GLDebug.printDetailLine(this.val$stream, "Stacktrace", string);
        }
    }
}

