/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class02085
 *  net.irisshaders.iris.gl.shader.ShaderCompileException
 *  net.irisshaders.iris.helpers.FakeChainedJsonException
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import minecraft.class02085;
import net.irisshaders.iris.gl.shader.ShaderCompileException;
import net.irisshaders.iris.helpers.FakeChainedJsonException;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class04195
extends IOException {
    private final List<class02085> field_13371 = Lists.newArrayList();
    private final String field_13372;

    public class04195(String string) {
        this.field_13371.add(new class02085());
        this.field_13372 = string;
    }

    public class04195(String string, Throwable throwable) {
        super(throwable);
        this.field_13371.add(new class02085());
        this.field_13372 = string;
    }

    @Override
    public String getMessage() {
        return "Invalid " + String.valueOf(this.field_13371.get(this.field_13371.size() - 1)) + ": " + this.field_13372;
    }

    public void method_12854(String string) {
        this.field_13371.get(0).N(string);
    }

    public void method_12855(String string) {
        this.field_13371.get((int)0).N = string;
        this.field_13371.add(0, new class02085());
    }

    public static class04195 method_12856(Exception exception) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class04195.handler$bck000$iris$changeShaderParseException(exception, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class04195)callbackInfoReturnable.getReturnValue();
        }
        if (exception instanceof class04195) {
            return (class04195)exception;
        }
        String string = exception.getMessage();
        if (exception instanceof FileNotFoundException) {
            string = "File not found";
        }
        return new class04195(string, exception);
    }

    private static void handler$bck000$iris$changeShaderParseException(Exception exception, CallbackInfoReturnable callbackInfoReturnable) {
        if (exception instanceof ShaderCompileException) {
            ShaderCompileException shaderCompileException = (ShaderCompileException)exception;
            callbackInfoReturnable.setReturnValue((Object)new FakeChainedJsonException(shaderCompileException));
        }
    }
}

