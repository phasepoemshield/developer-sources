/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.KHRDebug
 */
package net.irisshaders.iris.gl;

import java.util.Stack;
import net.irisshaders.iris.gl.GLDebug$DebugState;
import org.lwjgl.opengl.KHRDebug;

class GLDebug$KHRDebugState
implements GLDebug$DebugState {
    private static final boolean ENABLE_DEBUG_GROUPS = true;
    private int stackSize;
    private final Stack<String> stack = new Stack();

    GLDebug$KHRDebugState() {
    }

    @Override
    public void popGroup() {
        if (this.stackSize != 0) {
            KHRDebug.glPopDebugGroup();
            this.stack.pop();
            --this.stackSize;
        }
    }

    @Override
    public void nameObject(int n, int n2, String string) {
        KHRDebug.glObjectLabel((int)n, (int)n2, (CharSequence)string);
    }

    @Override
    public void pushGroup(int n, String string) {
        KHRDebug.glPushDebugGroup((int)33354, (int)n, (CharSequence)string);
        this.stack.push(string);
        ++this.stackSize;
    }
}

