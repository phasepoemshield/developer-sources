/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 */
package net.irisshaders.iris.api.v0;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.nio.ByteBuffer;
import java.util.function.IntFunction;
import net.irisshaders.iris.api.v0.IrisApiConfig;
import net.irisshaders.iris.api.v0.IrisApiInternal;
import net.irisshaders.iris.api.v0.IrisProgram;
import net.irisshaders.iris.api.v0.IrisTextVertexSink;

public interface IrisApi {
    public float getSunPathRotation();

    public static IrisApi getInstance() {
        return IrisApiInternal.INSTANCE;
    }

    public IrisApiConfig getConfig();

    public void assignPipeline(RenderPipeline var1, IrisProgram var2);

    public boolean isShaderPackInUse();

    public IrisTextVertexSink createTextVertexSink(int var1, IntFunction<ByteBuffer> var2);

    public int getMinorApiRevision();

    public boolean isRenderingShadowPass();

    public String getMainScreenLanguageKey();

    public Object openMainIrisScreenObj(Object var1);
}

