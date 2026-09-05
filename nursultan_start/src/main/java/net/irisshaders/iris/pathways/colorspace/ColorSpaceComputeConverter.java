/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class08893
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.program.ComputeProgram
 *  net.irisshaders.iris.gl.program.ProgramBuilder
 *  net.irisshaders.iris.gl.texture.InternalTextureFormat
 *  net.irisshaders.iris.helpers.StringPair
 *  net.irisshaders.iris.shaderpack.preprocessor.JcppProcessor
 *  org.apache.commons.io.IOUtils
 */
package net.irisshaders.iris.pathways.colorspace;

import com.google.common.collect.ImmutableSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Objects;
import minecraft.class08893;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.program.ComputeProgram;
import net.irisshaders.iris.gl.program.ProgramBuilder;
import net.irisshaders.iris.gl.texture.InternalTextureFormat;
import net.irisshaders.iris.helpers.StringPair;
import net.irisshaders.iris.pathways.colorspace.ColorSpace;
import net.irisshaders.iris.pathways.colorspace.ColorSpaceConverter;
import net.irisshaders.iris.shaderpack.preprocessor.JcppProcessor;
import org.apache.commons.io.IOUtils;

public class ColorSpaceComputeConverter
implements ColorSpaceConverter {
    private int width;
    private int height;
    private ColorSpace colorSpace;
    private ComputeProgram program;
    private class08893 target;

    public ColorSpaceComputeConverter(int n, int n2, ColorSpace colorSpace) {
        this.rebuildProgram(n, n2, colorSpace);
    }

    @Override
    public void process(class08893 class088932) {
        if (this.colorSpace == ColorSpace.SRGB) {
            return;
        }
        this.target = class088932;
        this.program.use();
        IrisRenderSystem.dispatchCompute((int)(this.width / 8), (int)(this.height / 8), (int)1);
        IrisRenderSystem.memoryBarrier((int)40);
        ComputeProgram.unbind();
    }

    @Override
    public void rebuildProgram(int n, int n2, ColorSpace colorSpace) {
        String string;
        if (this.program != null) {
            this.program.destroy();
            this.program = null;
        }
        this.width = n;
        this.height = n2;
        this.colorSpace = colorSpace;
        try {
            string = new String(IOUtils.toByteArray((InputStream)Objects.requireNonNull(this.getClass().getResourceAsStream("/colorSpace.csh"))), StandardCharsets.UTF_8);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        ArrayList<StringPair> arrayList = new ArrayList<StringPair>();
        arrayList.add(new StringPair("COMPUTE", ""));
        arrayList.add(new StringPair("CURRENT_COLOR_SPACE", String.valueOf(colorSpace.ordinal())));
        for (ColorSpace colorSpace2 : ColorSpace.values()) {
            arrayList.add(new StringPair(colorSpace2.name(), String.valueOf(colorSpace2.ordinal())));
        }
        string = JcppProcessor.glslPreprocessSource((String)string, arrayList);
        ProgramBuilder programBuilder = ProgramBuilder.beginCompute((String)"colorSpaceCompute", (String)string, (ImmutableSet)ImmutableSet.of());
        programBuilder.addTextureImage(() -> this.target.N(), InternalTextureFormat.RGBA8, "readImage");
        this.program = programBuilder.buildCompute();
    }
}

