/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11175
 *  Nursultan.class11180
 *  Nursultan.class11181
 *  Nursultan.class11183
 *  Nursultan.class11199
 *  Nursultan.class11203
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  org.lwjgl.opengl.GL30
 *  org.lwjgl.opengl.GL33
 */
package Nursultan;

import Nursultan.class09057;
import Nursultan.class09060;
import Nursultan.class09073;
import Nursultan.class09086;
import Nursultan.class09088;
import Nursultan.class09098;
import Nursultan.class11175;
import Nursultan.class11180;
import Nursultan.class11181;
import Nursultan.class11183;
import Nursultan.class11199;
import Nursultan.class11203;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL33;

public class class09058
implements class09060 {
    @Override
    public void N(class09086 class090862, class09086 class090863, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        if (n3 <= 0 || n4 <= 0 || n7 <= 0 || n8 <= 0) {
            return;
        }
        int n11 = GlStateManager.getFrameBuffer((int)36008);
        int n12 = GlStateManager.getFrameBuffer((int)36009);
        GlStateManager._glBindFramebuffer((int)36008, (int)class090862.i());
        GlStateManager._glBindFramebuffer((int)36009, (int)class090863.i());
        GlStateManager._glBlitFrameBuffer((int)n, (int)n2, (int)(n + n3), (int)(n2 + n4), (int)n5, (int)n6, (int)(n5 + n7), (int)(n6 + n8), (int)n9, (int)n10);
        GlStateManager._glBindFramebuffer((int)36009, (int)n12);
        GlStateManager._glBindFramebuffer((int)36008, (int)n11);
    }

    @Override
    public class09086 N(class09057 class090572, class09057 class090573, String string) {
        return new class09088(class090572, class090573, string);
    }

    @Override
    public class09057 N(class09073 class090732) {
        class11183 class111832 = class11203.N((class11181)class090732.y());
        int n = GL30.glGenTextures();
        GlStateManager._bindTexture((int)n);
        GL30.glTexImage2D((int)3553, (int)0, (int)class111832.y(), (int)class090732.B(), (int)class090732.N(), (int)0, (int)class111832.L(), (int)class111832.N(), (ByteBuffer)null);
        GL30.glTexParameteri((int)3553, (int)10241, (int)class11203.N((class11199)class090732.M()));
        GL30.glTexParameteri((int)3553, (int)10240, (int)class11203.N((class11199)class090732.R()));
        GL30.glTexParameteri((int)3553, (int)10242, (int)class11203.N((class11175)class090732.L()));
        GL30.glTexParameteri((int)3553, (int)10243, (int)class11203.N((class11175)class090732.i()));
        if (class090732.u()) {
            GL30.glGenerateMipmap((int)3553);
        }
        return new class09098(class090732, n);
    }

    @Override
    public class09086 N(int n, int n2, int n3) {
        return new class11180(n, n2, n3);
    }

    @Override
    public void N(int n, class09057 class090572) {
        GlStateManager._activeTexture((int)(33984 + n));
        GlStateManager._bindTexture((int)(class090572 == null ? 0 : class090572.i()));
        GL33.glBindSampler((int)n, (int)0);
    }
}

