/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1796
 *  net.minecraft.class_1796$class_1797
 *  net.minecraft.class_1799
 *  net.minecraft.class_2960
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package ruhack.phobia.a;

import java.util.Map;
import net.minecraft.class_1796;
import net.minecraft.class_1799;
import net.minecraft.class_2960;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_1796.class})
public interface aq {
    @Accessor(value="field_8024")
    public Map phobia$getEntries();

    @Accessor(value="field_8025")
    public int phobia$getTick();

    @Invoker(value="method_62836")
    public class_2960 phobia$invokeGetGroup(class_1799 var1);
}

