/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.injection.access.base.ILocalSampleLogger
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package minecraft;

import com.viaversion.viafabricplus.injection.access.base.ILocalSampleLogger;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class02272;
import minecraft.class02276;

public class class02270
extends class02272
implements class02276,
ILocalSampleLogger {
    public static final int L = 240;
    private final long[][] u;
    private int i;
    private int R;
    private ProtocolVersion M;

    @Override
    public int L() {
        return this.u.length;
    }

    public class02270(int n) {
        this(n, new long[n]);
    }

    public class02270(int n, long[] lArray) {
        super(n, lArray);
        this.u = new long[240][n];
    }

    @Override
    public void i() {
        this.i = 0;
        this.R = 0;
    }

    @Override
    public int u() {
        return this.R;
    }

    private int y(int n) {
        return n % 240;
    }

    @Override
    public long N(int n, int n2) {
        if (n < 0 || n >= this.R) {
            throw new IndexOutOfBoundsException(n + " out of bounds for length " + this.R);
        }
        long[] lArray = this.u[this.y(this.i + n)];
        if (n2 < 0 || n2 >= lArray.length) {
            throw new IndexOutOfBoundsException(n2 + " out of bounds for dimensions " + lArray.length);
        }
        return lArray[n2];
    }

    @Override
    public long N(int n) {
        return this.N(n, 0);
    }

    @Override
    protected void N() {
        int n = this.y(this.i + this.R);
        System.arraycopy(this.y, 0, this.u[n], 0, this.y.length);
        if (this.R < 240) {
            ++this.R;
        } else {
            this.i = this.y(this.i + 1);
        }
    }

    public ProtocolVersion viaFabricPlus$getForcedVersion() {
        return this.M;
    }

    public void viaFabricPlus$setForcedVersion(ProtocolVersion protocolVersion) {
        this.M = protocolVersion;
    }
}

