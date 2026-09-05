/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class03428
 *  minecraft.class03457
 *  minecraft.class08813
 *  net.irisshaders.iris.gl.shader.ShaderCompileException
 */
package net.irisshaders.iris.gui.debug;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class03428;
import minecraft.class03457;
import minecraft.class08813;
import net.irisshaders.iris.gl.shader.ShaderCompileException;
import net.irisshaders.iris.gui.debug.DebugTextWidget$Content;
import net.irisshaders.iris.gui.debug.DebugTextWidget$ContentBuilder;

public class DebugTextWidget
extends class08813 {
    private final class01590 font;
    private final DebugTextWidget$Content content;

    public DebugTextWidget(int n, int n2, int n3, int n4, class01590 class015902, Exception exception) {
        super(n, n2, n3, n4, (class00392)class00392.i());
        this.font = class015902;
        this.content = this.buildContent(exception);
    }

    private DebugTextWidget$Content buildContent(Exception exception) {
        if (exception instanceof ShaderCompileException) {
            ShaderCompileException shaderCompileException = (ShaderCompileException)exception;
            return this.buildContentShader(shaderCompileException);
        }
        DebugTextWidget$ContentBuilder debugTextWidget$ContentBuilder = new DebugTextWidget$ContentBuilder(this.containerWidth());
        StackTraceElement[] stackTraceElementArray = exception.getStackTrace();
        debugTextWidget$ContentBuilder.addHeader(this.font, (class00392)class00392.y((String)"Error: "));
        Objects.requireNonNull(this.font);
        debugTextWidget$ContentBuilder.addSpacer(9);
        if (exception.getMessage() != null) {
            debugTextWidget$ContentBuilder.addLine(this.font, (class00392)class00392.y((String)exception.getMessage()));
        }
        Objects.requireNonNull(this.font);
        debugTextWidget$ContentBuilder.addSpacer(9);
        debugTextWidget$ContentBuilder.addHeader(this.font, (class00392)class00392.y((String)"Stack trace: "));
        Objects.requireNonNull(this.font);
        debugTextWidget$ContentBuilder.addSpacer(9);
        for (int i = 0; i < stackTraceElementArray.length; ++i) {
            StackTraceElement stackTraceElement = stackTraceElementArray[i];
            if (stackTraceElement == null) continue;
            debugTextWidget$ContentBuilder.addLine(this.font, (class00392)class00392.y((String)stackTraceElement.toString()));
            if (i >= stackTraceElementArray.length - 1) continue;
            Objects.requireNonNull(this.font);
            debugTextWidget$ContentBuilder.addSpacer(9);
        }
        return debugTextWidget$ContentBuilder.build();
    }

    private int containerWidth() {
        return this.field_22758 - this.method_65512();
    }

    private DebugTextWidget$Content buildContentShader(ShaderCompileException shaderCompileException) {
        DebugTextWidget$ContentBuilder debugTextWidget$ContentBuilder = new DebugTextWidget$ContentBuilder(this.containerWidth());
        debugTextWidget$ContentBuilder.addHeader(this.font, (class00392)class00392.y((String)("Shader compile error in " + shaderCompileException.getFilename() + ": ")));
        Objects.requireNonNull(this.font);
        debugTextWidget$ContentBuilder.addSpacer(9);
        debugTextWidget$ContentBuilder.addLine(this.font, (class00392)class00392.y((String)shaderCompileException.getError()));
        return debugTextWidget$ContentBuilder.build();
    }

    public void method_44389(class01054 class010542, int n, int n2, float f) {
        int n3 = this.method_46427() + this.method_65509();
        int n4 = this.method_46426() + this.method_65509();
        class010542.i().pushMatrix();
        class010542.i().translate((float)n4, (float)n3);
        this.content.container().method_48206(class064782 -> class064782.method_25394(class010542, n, n2, f));
        class010542.i().popMatrix();
    }

    public int method_44391() {
        return this.content.container().method_25364();
    }

    public void method_47399(class03428 class034282) {
        class034282.N(class03457.field_33788, this.content.narration());
    }

    public boolean method_44392() {
        return this.method_44391() > this.field_22759;
    }

    public double method_44393() {
        Objects.requireNonNull(this.font);
        return 9.0;
    }
}

