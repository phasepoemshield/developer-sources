/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 */
package minecraft;

import java.util.Optional;
import minecraft.class04782;
import minecraft.class05513;

public interface class05516 {
    public static final class05516 N = class055133 -> Optional.ofNullable(class055133.P()).map(class055132 -> class055132.N(1));
    public static final class05516 y = class055132 -> Optional.empty();

    default public void N(class04782 class047822) {
    }

    public Optional<class05513> spawnStructure(class05513 var1);
}

