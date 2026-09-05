/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01042
 *  minecraft.class01089
 *  minecraft.class01224
 *  minecraft.class02796
 *  minecraft.class04782
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01042;
import minecraft.class01089;
import minecraft.class01224;
import minecraft.class02796;
import minecraft.class04782;

public final class class03298
extends Record {
    private final class01089 resourceManager;
    private final class01042 registryAccess;
    private final class01224 structureTemplateManager;

    public class01224 L() {
        return this.structureTemplateManager;
    }

    public class03298(class01089 class010892, class01042 class010422, class01224 class012242) {
        this.resourceManager = class010892;
        this.registryAccess = class010422;
        this.structureTemplateManager = class012242;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03298.class, "resourceManager;registryAccess;structureTemplateManager", "resourceManager", "registryAccess", "structureTemplateManager"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03298.class, "resourceManager;registryAccess;structureTemplateManager", "resourceManager", "registryAccess", "structureTemplateManager"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03298.class, "resourceManager;registryAccess;structureTemplateManager", "resourceManager", "registryAccess", "structureTemplateManager"}, this);
    }

    public class01042 y() {
        return this.registryAccess;
    }

    public class01089 N() {
        return this.resourceManager;
    }

    public static class03298 N(class04782 class047822) {
        class02796 class027962 = class047822.method_8503();
        return new class03298(class027962.yw(), (class01042)class027962.yt(), class027962.yv());
    }
}

