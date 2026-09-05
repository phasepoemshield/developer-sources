/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1011
 *  net.minecraft.class_1041
 *  net.minecraft.class_3262
 *  net.minecraft.class_8518
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWImage
 *  org.lwjgl.glfw.GLFWImage$Buffer
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import net.minecraft.class_1011;
import net.minecraft.class_1041;
import net.minecraft.class_3262;
import net.minecraft.class_8518;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.fl;

@Mixin(value={class_1041.class})
public class by {
    private static final String TRAY_ICON = "/assets/phobia/tray_icon.png";
    @Shadow
    @Final
    private long field_5187;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Inject(method={"method_4491"}, at={@At(value="HEAD")}, cancellable=true)
    private void onSetIcon(class_3262 resourcePack, class_8518 icons, CallbackInfo ci2) {
        if (System.getProperty("os.name", "").contains("Mac")) {
            ci2.cancel();
            return;
        }
        if (fl.isUnhooked()) {
            return;
        }
        ci2.cancel();
        try (MemoryStack memoryStack = MemoryStack.stackPush();
             InputStream stream = by.class.getResourceAsStream(TRAY_ICON);){
            if (stream == null) {
                return;
            }
            GLFWImage.Buffer buffer = GLFWImage.malloc((int)1, (MemoryStack)memoryStack);
            try (class_1011 nativeImage = class_1011.method_4309((InputStream)stream);){
                ByteBuffer byteBuffer = MemoryUtil.memAlloc((int)(nativeImage.method_4307() * nativeImage.method_4323() * 4));
                try {
                    byteBuffer.asIntBuffer().put(nativeImage.method_48463());
                    buffer.position(0);
                    buffer.width(nativeImage.method_4307());
                    buffer.height(nativeImage.method_4323());
                    buffer.pixels(byteBuffer);
                    GLFW.glfwSetWindowIcon((long)this.field_5187, (GLFWImage.Buffer)((GLFWImage.Buffer)buffer.position(0)));
                }
                finally {
                    MemoryUtil.memFree((Buffer)byteBuffer);
                }
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}
