/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01834
 *  minecraft.class07321
 *  minecraft.class07357
 */
package Nursultan;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import minecraft.class01834;
import minecraft.class07321;
import minecraft.class07357;

public class class10739
extends ByteArrayOutputStream {
    private final class07321 y;
    final /* synthetic */ class07357 N;

    public class10739(class07357 class073572, class07321 class073212) {
        this.N = class073572;
        super(8096);
        super.write(0);
        super.write(0);
        super.write(0);
        super.write(0);
        super.write(class073572.L.y());
        this.y = class073212;
    }

    @Override
    public void close() throws IOException {
        ByteBuffer byteBuffer = ByteBuffer.wrap(this.buf, 0, this.count);
        int n = this.count - 5 + 1;
        class01834.M.y(this.N.y, this.y, this.N.L, n);
        byteBuffer.putInt(0, n);
        this.N.N(this.y, byteBuffer);
    }
}

