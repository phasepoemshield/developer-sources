/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07671
 *  minecraft.class08152
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01898;
import minecraft.class07671;
import minecraft.class08152;

public final class class01908
extends Record {
    final class01898 packConfig;
    private final class07671 commandSelection;
    private final class08152 functionCompilationPermissions;

    public class08152 L() {
        return this.functionCompilationPermissions;
    }

    public class01908(class01898 class018982, class07671 class076712, class08152 class081522) {
        this.packConfig = class018982;
        this.commandSelection = class076712;
        this.functionCompilationPermissions = class081522;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01908.class, "packConfig;commandSelection;functionCompilationPermissions", "packConfig", "commandSelection", "functionCompilationPermissions"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01908.class, "packConfig;commandSelection;functionCompilationPermissions", "packConfig", "commandSelection", "functionCompilationPermissions"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01908.class, "packConfig;commandSelection;functionCompilationPermissions", "packConfig", "commandSelection", "functionCompilationPermissions"}, this);
    }

    public class07671 y() {
        return this.commandSelection;
    }

    public class01898 N() {
        return this.packConfig;
    }
}

