/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gl.PostEffectPass
 *  net.minecraft.client.gl.PostEffectProcessor
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package kotakbaz.rain.mixin;

import java.util.List;
import net.minecraft.client.gl.PostEffectPass;
import net.minecraft.client.gl.PostEffectProcessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={PostEffectProcessor.class})
public interface PostChainAccessor {
    @Accessor(value="field_1497")
    public List<PostEffectPass> rain$getPasses();
}

