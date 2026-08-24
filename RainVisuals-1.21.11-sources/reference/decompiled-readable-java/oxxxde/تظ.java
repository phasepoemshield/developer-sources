/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.lwjgl.opengl.GL15
 */
package oxxxde;

import java.nio.ByteBuffer;
import lombok.Generated;
import org.lwjgl.opengl.GL15;
import oxxxde.\u0627\u064b;
import oxxxde.\u0632\u0632;
import oxxxde.\u0638\u062d;

public class \u062a\u0638
implements \u0632\u0632,
AutoCloseable {
    private boolean closed = false;
    private final \u0638\u062d target;
    private final \u0627\u064b usage;
    private final int id = GL15.glGenBuffers();

    @Override
    public void bind() {
        GL15.glBindBuffer((int)this.target.glId, (int)this.id);
    }

    /*
     * WARNING - void declaration
     */
    public \u062a\u0638(ByteBuffer data, \u0627\u064b usage, \u0638\u062d target) {
        void var1_1;
        this.usage = usage;
        this.target = target;
        this.upload((ByteBuffer)var1_1);
    }

    @Override
    public void unbind() {
        GL15.glBindBuffer((int)this.target.glId, (int)0);
    }

    @Override
    public void close() {
        if (!this.closed) {
            GL15.glDeleteBuffers((int)this.id);
        }
        this.closed = true;
    }

    public void upload(ByteBuffer data) {
        if (this.closed) {
            throw new IllegalStateException("Cannot upload data to a closed GPU buffer");
        }
        this.bind();
        GL15.glBufferData((int)this.target.glId, (ByteBuffer)data, (int)this.usage.glId);
        GL15.glBindBuffer((int)this.target.glId, (int)0);
    }

    @Generated
    public int getId() {
        return this.id;
    }

    @Generated
    public \u0638\u062d getTarget() {
        return this.target;
    }

    @Generated
    public \u0627\u064b getUsage() {
        return this.usage;
    }
}

