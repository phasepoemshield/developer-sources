/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.buffer.ShaderStorageBufferHolder
 *  net.irisshaders.iris.shaderpack.properties.IndirectPointer
 */
package net.irisshaders.iris.shaderpack;

import net.irisshaders.iris.gl.buffer.ShaderStorageBufferHolder;
import net.irisshaders.iris.shaderpack.properties.IndirectPointer;

public record FilledIndirectPointer(int buffer, long offset) {
    public static FilledIndirectPointer basedOff(ShaderStorageBufferHolder shaderStorageBufferHolder, IndirectPointer indirectPointer) {
        if (indirectPointer == null || shaderStorageBufferHolder == null) {
            return null;
        }
        return new FilledIndirectPointer(shaderStorageBufferHolder.getBufferIndex(indirectPointer.buffer()), indirectPointer.offset());
    }
}

