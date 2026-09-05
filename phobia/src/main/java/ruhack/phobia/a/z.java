/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10055
 *  net.minecraft.class_10186$class_10189
 *  net.minecraft.class_10186$class_10190
 *  net.minecraft.class_10197
 *  net.minecraft.class_10394
 *  net.minecraft.class_11659
 *  net.minecraft.class_11890
 *  net.minecraft.class_1297
 *  net.minecraft.class_1799
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_3879
 *  net.minecraft.class_4587
 *  net.minecraft.class_5321
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import net.minecraft.class_10055;
import net.minecraft.class_10186;
import net.minecraft.class_10197;
import net.minecraft.class_10394;
import net.minecraft.class_11659;
import net.minecraft.class_11890;
import net.minecraft.class_1297;
import net.minecraft.class_1799;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3879;
import net.minecraft.class_4587;
import net.minecraft.class_5321;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.iv;
import ruhack.phobia.jd;

@Mixin(value={class_10197.class})
public abstract class z {
    @Unique
    private static final ThreadLocal<class_1799> PHOBIA_ARMOR_STACK = new ThreadLocal();

    @Inject(method={"method_64078(Lnet/minecraft/class_10186$class_10190;Lnet/minecraft/class_5321;Lnet/minecraft/class_3879;Ljava/lang/Object;Lnet/minecraft/class_1799;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;ILnet/minecraft/class_2960;II)V"}, at={@At(value="HEAD")}, cancellable=true)
    private <S> void phobia$storeArmorStack(class_10186.class_10190 layerType, class_5321<class_10394> asset, class_3879 model, S state, class_1799 stack, class_4587 matrices, class_11659 queue, int light, class_2960 texture, int outlineColor, int order, CallbackInfo ci2) {
        if (state instanceof class_10055) {
            class_11890 player;
            class_1297 class_12972;
            class_10055 playerState = (class_10055)state;
            class_310 client = class_310.method_1551();
            if (client.field_1687 != null && (class_12972 = client.field_1687.method_8469(playerState.field_53528)) instanceof class_11890 && jd.appliesTo(player = (class_11890)class_12972)) {
                ci2.cancel();
                return;
            }
        }
        PHOBIA_ARMOR_STACK.set(stack);
    }

    @Inject(method={"method_64078(Lnet/minecraft/class_10186$class_10190;Lnet/minecraft/class_5321;Lnet/minecraft/class_3879;Ljava/lang/Object;Lnet/minecraft/class_1799;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;ILnet/minecraft/class_2960;II)V"}, at={@At(value="RETURN")})
    private <S> void phobia$clearArmorStack(class_10186.class_10190 layerType, class_5321<class_10394> asset, class_3879 model, S state, class_1799 stack, class_4587 matrices, class_11659 queue, int light, class_2960 texture, int outlineColor, int order, CallbackInfo ci2) {
        PHOBIA_ARMOR_STACK.remove();
    }

    @Redirect(method={"method_64078(Lnet/minecraft/class_10186$class_10190;Lnet/minecraft/class_5321;Lnet/minecraft/class_3879;Ljava/lang/Object;Lnet/minecraft/class_1799;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;ILnet/minecraft/class_2960;II)V"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_10197;method_64076(Lnet/minecraft/class_10186$class_10189;I)I"))
    private static int phobia$durabilityColor(class_10186.class_10189 layer, int dyeColor) {
        iv module = iv.getInstance();
        if (module != null && module.isState()) {
            return iv.durabilityColor(PHOBIA_ARMOR_STACK.get());
        }
        return z.getOriginalDyeColor(layer, dyeColor);
    }

    @Unique
    private static int getOriginalDyeColor(class_10186.class_10189 layer, int dyeColor) {
        return layer.comp_3172().map(dyeable -> dyeColor != 0 ? dyeColor : dyeable.comp_3170().orElse(0)).orElse(-1);
    }
}
