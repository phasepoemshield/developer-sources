/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.system.MemoryStack
 */
package Nursultan;

import Nursultan.class12037;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.MemoryStack;

public class class12039
implements class12037 {
    public Object N_0;
    public boolean N_init;
    public static Object y_0;

    private static void M() {
        y_0 = null;
    }

    public class12039() {
        this.u();
        int n = 0;
        int n2 = 0;
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            ByteBuffer byteBuffer = memoryStack.malloc(4);
            byteBuffer.put((byte)-1).put((byte)-1).put((byte)-1).put((byte)-1).flip();
            n = GL11.glGenTextures();
            n2 = GL11.glGetInteger((int)32873);
            GlStateManager._bindTexture((int)n);
            GlStateManager._texParameter((int)3553, (int)10240, (int)9729);
            GlStateManager._texParameter((int)3553, (int)10241, (int)9729);
            GlStateManager._texParameter((int)3553, (int)10242, (int)33071);
            GlStateManager._texParameter((int)3553, (int)10243, (int)33071);
            GlStateManager._pixelStore((int)3314, (int)0);
            GlStateManager._pixelStore((int)3316, (int)0);
            GlStateManager._pixelStore((int)3315, (int)0);
            GlStateManager._pixelStore((int)3317, (int)1);
            GL11.glTexImage2D((int)3553, (int)0, (int)32856, (int)1, (int)1, (int)0, (int)6408, (int)5121, (ByteBuffer)byteBuffer);
        }
        catch (Exception exception) {
            ((Logger)y_0).error("Failed to create blank texture", (Throwable)exception);
            if (n != 0) {
                GL11.glDeleteTextures((int)n);
                n = 0;
            }
            throw new RuntimeException(exception);
        }
        finally {
            if (n != 0) {
                GlStateManager._bindTexture((int)n2);
            }
        }
        this.N_0 = n;
    }

    static {
        class12039.M();
        y_0 = LogManager.getLogger(String.class);
    }

    private void u() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
        }
    }

    @Override
    public int N() {
        return (Integer)this.N_0;
    }
}

