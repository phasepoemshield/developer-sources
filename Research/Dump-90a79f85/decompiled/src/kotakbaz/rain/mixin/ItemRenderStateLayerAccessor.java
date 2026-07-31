/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10444$class_10446
 *  net.minecraft.class_1921
 *  net.minecraft.class_804
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package kotakbaz.rain.mixin;

import net.minecraft.class_10444;
import net.minecraft.class_1921;
import net.minecraft.class_804;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_10444.class_10446.class})
public interface ItemRenderStateLayerAccessor {
    @Accessor(value="field_56967")
    public class_804 rain$getTransform();

    @Accessor(value="field_55347")
    public class_1921 rain$getRenderLayer();
}

