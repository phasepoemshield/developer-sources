/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.compatibility.environment.OsUtils
 *  net.caffeinemc.mods.sodium.client.compatibility.environment.OsUtils$OperatingSystem
 *  org.lwjgl.opengl.GL
 *  org.lwjgl.opengl.GLCapabilities
 */
package net.caffeinemc.mods.sodium.client.gl.device;

import net.caffeinemc.mods.sodium.client.compatibility.environment.OsUtils;
import net.caffeinemc.mods.sodium.client.gl.device.CommandList;
import net.caffeinemc.mods.sodium.client.gl.device.DrawCommandList;
import net.caffeinemc.mods.sodium.client.gl.device.GLRenderDevice$ImmediateCommandList;
import net.caffeinemc.mods.sodium.client.gl.device.GLRenderDevice$ImmediateDrawCommandList;
import net.caffeinemc.mods.sodium.client.gl.device.RenderDevice;
import net.caffeinemc.mods.sodium.client.gl.functions.DeviceFunctions;
import net.caffeinemc.mods.sodium.client.gl.state.GlStateTracker;
import net.caffeinemc.mods.sodium.client.gl.tessellation.GlTessellation;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLCapabilities;

public class GLRenderDevice
implements RenderDevice {
    private final GlStateTracker stateTracker = new GlStateTracker();
    final CommandList commandList = new GLRenderDevice$ImmediateCommandList(this, this.stateTracker);
    final DrawCommandList drawCommandList = new GLRenderDevice$ImmediateDrawCommandList(this);
    final DeviceFunctions functions = new DeviceFunctions(this);
    private boolean isActive;
    GlTessellation activeTessellation;

    @Override
    public GLCapabilities getCapabilities() {
        return GL.getCapabilities();
    }

    private void checkDeviceActive() {
        if (!this.isActive) {
            throw new IllegalStateException("Tried to access device from unmanaged context");
        }
    }

    @Override
    public void makeInactive() {
        if (!this.isActive) {
            return;
        }
        this.stateTracker.clear();
        this.isActive = false;
    }

    @Override
    public CommandList createCommandList() {
        this.checkDeviceActive();
        return this.commandList;
    }

    @Override
    public int getSubTexelPrecisionBits() {
        if (OsUtils.getOs() == OsUtils.OperatingSystem.MAC) {
            return 4;
        }
        return 8;
    }

    @Override
    public void makeActive() {
        if (this.isActive) {
            return;
        }
        this.stateTracker.clear();
        this.isActive = true;
    }

    @Override
    public DeviceFunctions getDeviceFunctions() {
        return this.functions;
    }
}

