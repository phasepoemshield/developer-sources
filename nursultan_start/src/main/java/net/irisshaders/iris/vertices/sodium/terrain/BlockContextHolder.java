/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.vertices.sodium.terrain;

public class BlockContextHolder {
    private byte blockEmission;
    private int blockId;
    private byte renderType;
    private int localPosX;
    private int localPosY;
    private int localPosZ;
    private boolean ignoreMidBlock;
    private int oldId = -1;

    public void overrideBlock(int n) {
        if (this.blockId == n) {
            return;
        }
        if (this.oldId == -1) {
            this.oldId = this.blockId;
        }
        this.blockId = n;
    }

    public void restoreBlock() {
        if (this.oldId == -1) {
            return;
        }
        this.blockId = this.oldId;
        this.oldId = -1;
    }

    public boolean ignoreMidBlock() {
        return this.ignoreMidBlock;
    }

    public int getBlockId() {
        return this.blockId;
    }

    public byte getBlockEmission() {
        return this.blockEmission;
    }

    public int getLocalPosZ() {
        return this.localPosZ;
    }

    public int getLocalPosY() {
        return this.localPosY;
    }

    public int getLocalPosX() {
        return this.localPosX;
    }

    public void setBlockData(int n, byte by, byte by2, int n2, int n3, int n4) {
        this.blockId = n;
        this.renderType = by;
        this.blockEmission = by2;
        this.localPosX = n2;
        this.localPosY = n3;
        this.localPosZ = n4;
    }

    public void setIgnoreMidBlock(boolean bl) {
        this.ignoreMidBlock = bl;
    }

    public byte getRenderType() {
        return this.renderType;
    }
}

