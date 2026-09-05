/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09057
 *  Nursultan.class09060
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL13
 *  org.lwjgl.opengl.GL33
 */
package Nursultan;

import Nursultan.class09057;
import Nursultan.class09060;
import Nursultan.class12003;
import com.mojang.blaze3d.opengl.GlStateManager;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL33;

public class class12026
extends class12003 {
    public class12026(int n) {
        super(n);
    }

    private static void y(int n, int n2) {
        GL13.glActiveTexture((int)n);
        GL11.glBindTexture((int)3553, (int)n2);
        GL33.glBindSampler((int)(n - 33984), (int)0);
        GlStateManager._activeTexture((int)n);
        GlStateManager._bindTexture((int)n2);
    }

    public void N(int n, int n2) {
        class12026.y(n, n2);
        super.N(n - 33984);
    }

    @Override
    public void N(int n) {
        class12026.y(33984, n);
        super.N(0);
    }

    public void N(class09057 class090572) {
        class09060.N().N(0, class090572);
        super.N(0);
    }

    public void N(int n, class09057 class090572) {
        class09060.N().N(n, class090572);
        super.N(n);
    }
}

