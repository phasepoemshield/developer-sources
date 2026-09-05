/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.viewport.frustum;

public interface Frustum {
    public boolean testAab(float var1, float var2, float var3, float var4, float var5, float var6);

    public int intersectAab(float var1, float var2, float var3, float var4, float var5, float var6);

    public boolean testSection(float var1, float var2, float var3);

    public boolean testSectionExpanded(float var1, float var2, float var3, float var4);
}

