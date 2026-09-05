/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2535
 *  net.minecraft.class_2547
 *  net.minecraft.class_2596
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package ruhack.phobia.a;

import net.minecraft.class_2535;
import net.minecraft.class_2547;
import net.minecraft.class_2596;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_2535.class})
public interface k {
    @Accessor(value="field_11652")
    public class_2547 client$listener();

    @Invoker(value="method_10759")
    public static <T extends class_2547> void handlePacket(class_2596<T> packet, class_2547 listener) {
        throw new UnsupportedOperationException();
    }
}

