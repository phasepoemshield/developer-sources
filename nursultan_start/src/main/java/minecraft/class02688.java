/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00568
 *  minecraft.class01224
 *  minecraft.class04775
 *  minecraft.class04782
 *  minecraft.class08088
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.concurrent.Executor;
import minecraft.class00568;
import minecraft.class01224;
import minecraft.class04775;
import minecraft.class04782;
import minecraft.class08088;

public final class class02688
extends Record {
    private final class04782 level;
    private final class08088 generator;
    private final class01224 structureManager;
    private final class04775 lightEngine;
    private final Executor mainThreadExecutor;
    private final class00568 unsavedListener;

    public class01224 L() {
        return this.structureManager;
    }

    public class02688(class04782 class047822, class08088 class080882, class01224 class012242, class04775 class047752, Executor executor, class00568 class005682) {
        this.level = class047822;
        this.generator = class080882;
        this.structureManager = class012242;
        this.lightEngine = class047752;
        this.mainThreadExecutor = executor;
        this.unsavedListener = class005682;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02688.class, "level;generator;structureManager;lightEngine;mainThreadExecutor;unsavedListener", "level", "generator", "structureManager", "lightEngine", "mainThreadExecutor", "unsavedListener"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02688.class, "level;generator;structureManager;lightEngine;mainThreadExecutor;unsavedListener", "level", "generator", "structureManager", "lightEngine", "mainThreadExecutor", "unsavedListener"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02688.class, "level;generator;structureManager;lightEngine;mainThreadExecutor;unsavedListener", "level", "generator", "structureManager", "lightEngine", "mainThreadExecutor", "unsavedListener"}, this);
    }

    public Executor i() {
        return this.mainThreadExecutor;
    }

    public class04775 u() {
        return this.lightEngine;
    }

    public class08088 y() {
        return this.generator;
    }

    public class04782 N() {
        return this.level;
    }

    public class00568 R() {
        return this.unsavedListener;
    }
}

