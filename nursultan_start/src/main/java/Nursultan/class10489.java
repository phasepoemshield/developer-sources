/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04741
 *  org.apache.commons.io.output.CountingOutputStream
 */
package Nursultan;

import java.io.IOException;
import java.io.OutputStream;
import minecraft.class04741;
import org.apache.commons.io.output.CountingOutputStream;

public class class10489
extends CountingOutputStream {
    private final class04741 N;

    public class10489(OutputStream outputStream, class04741 class047412) {
        super(outputStream);
        this.N = class047412;
    }

    protected void afterWrite(int n) throws IOException {
        super.afterWrite(n);
        this.N.N = this.getByteCount();
    }
}

