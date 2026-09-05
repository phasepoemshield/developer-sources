/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03678
 *  minecraft.class04086
 *  minecraft.class05946
 *  minecraft.class06826
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03678;
import minecraft.class04086;
import minecraft.class05946;
import minecraft.class06826;
import org.jspecify.annotations.Nullable;

public final class class08707
extends Record {
    private final class03678 selectedGameMode;
    private final class06826 gameRuleOverwrites;
    private final @Nullable class05946<class04086> flatLevelPreset;

    public @Nullable class05946<class04086> L() {
        return this.flatLevelPreset;
    }

    public class08707(class03678 class036782, class06826 class068262, @Nullable class05946<class04086> class059462) {
        this.selectedGameMode = class036782;
        this.gameRuleOverwrites = class068262;
        this.flatLevelPreset = class059462;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08707.class, "selectedGameMode;gameRuleOverwrites;flatLevelPreset", "selectedGameMode", "gameRuleOverwrites", "flatLevelPreset"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08707.class, "selectedGameMode;gameRuleOverwrites;flatLevelPreset", "selectedGameMode", "gameRuleOverwrites", "flatLevelPreset"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08707.class, "selectedGameMode;gameRuleOverwrites;flatLevelPreset", "selectedGameMode", "gameRuleOverwrites", "flatLevelPreset"}, this);
    }

    public class06826 y() {
        return this.gameRuleOverwrites;
    }

    public class03678 N() {
        return this.selectedGameMode;
    }
}

