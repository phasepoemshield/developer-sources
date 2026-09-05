/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlConst
 *  com.mojang.blaze3d.textures.AddressMode
 *  com.mojang.blaze3d.textures.FilterMode
 *  minecraft.class08151
 *  org.lwjgl.opengl.GL33C
 */
package minecraft;

import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import java.util.OptionalDouble;
import minecraft.class08151;
import minecraft.class08188;
import org.lwjgl.opengl.GL33C;

public class class08193
extends class08188 {
    private final int N;
    private final AddressMode y;
    private final AddressMode L;
    private final FilterMode u;
    private final FilterMode i;
    private final int R;
    private final OptionalDouble M;
    private boolean B;

    @Override
    public AddressMode L() {
        return this.L;
    }

    @Override
    public OptionalDouble M() {
        return this.M;
    }

    public class08193(AddressMode addressMode, AddressMode addressMode2, FilterMode filterMode, FilterMode filterMode2, int n, OptionalDouble optionalDouble) {
        this.y = addressMode;
        this.L = addressMode2;
        this.u = filterMode;
        this.i = filterMode2;
        this.R = n;
        this.M = optionalDouble;
        this.N = GL33C.glGenSamplers();
        GL33C.glSamplerParameteri((int)this.N, (int)10242, (int)GlConst.toGl((AddressMode)addressMode));
        GL33C.glSamplerParameteri((int)this.N, (int)10243, (int)GlConst.toGl((AddressMode)addressMode2));
        if (n > 1) {
            GL33C.glSamplerParameterf((int)this.N, (int)34046, (float)n);
        }
        switch (class08151.N[filterMode.ordinal()]) {
            case 1: {
                GL33C.glSamplerParameteri((int)this.N, (int)10241, (int)9986);
                break;
            }
            case 2: {
                GL33C.glSamplerParameteri((int)this.N, (int)10241, (int)9987);
            }
        }
        switch (class08151.N[filterMode2.ordinal()]) {
            case 1: {
                GL33C.glSamplerParameteri((int)this.N, (int)10240, (int)9728);
                break;
            }
            case 2: {
                GL33C.glSamplerParameteri((int)this.N, (int)10240, (int)9729);
            }
        }
        if (optionalDouble.isPresent()) {
            GL33C.glSamplerParameterf((int)this.N, (int)33083, (float)((float)optionalDouble.getAsDouble()));
        }
    }

    public boolean B() {
        return this.B;
    }

    @Override
    public FilterMode i() {
        return this.i;
    }

    @Override
    public void close() {
        if (!this.B) {
            this.B = true;
            GL33C.glDeleteSamplers((int)this.N);
        }
    }

    @Override
    public FilterMode u() {
        return this.u;
    }

    @Override
    public AddressMode y() {
        return this.y;
    }

    public int N() {
        return this.N;
    }

    @Override
    public int R() {
        return this.R;
    }
}

