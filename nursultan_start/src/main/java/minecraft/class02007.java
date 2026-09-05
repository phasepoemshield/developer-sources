/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  net.irisshaders.iris.mixin.texture.SpriteContentsFrameInfoAccessor
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.irisshaders.iris.mixin.texture.SpriteContentsFrameInfoAccessor;

public final class class02007
extends Record
implements SpriteContentsFrameInfoAccessor {
    final int index;
    final int time;

    public class02007(int n, int n2) {
        this.index = n;
        this.time = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02007.class, "index;time", "index", "time"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02007.class, "index;time", "index", "time"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02007.class, "index;time", "index", "time"}, this);
    }

    public /* synthetic */ int getIndex() {
        return this.index;
    }

    public int y() {
        return this.time;
    }

    public /* synthetic */ int getTime() {
        return this.time;
    }

    public int N() {
        return this.index;
    }
}

