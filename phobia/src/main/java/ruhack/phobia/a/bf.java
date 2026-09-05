/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10444$class_10445
 *  net.minecraft.class_1058
 *  net.minecraft.class_11661
 *  net.minecraft.class_11683$class_11792
 *  net.minecraft.class_12249
 *  net.minecraft.class_1921
 *  net.minecraft.class_2960
 *  net.minecraft.class_3879
 *  net.minecraft.class_4587
 *  net.minecraft.class_630
 *  net.minecraft.class_777
 *  net.minecraft.class_811
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import java.util.List;
import net.minecraft.class_10444;
import net.minecraft.class_1058;
import net.minecraft.class_11661;
import net.minecraft.class_11683;
import net.minecraft.class_12249;
import net.minecraft.class_1921;
import net.minecraft.class_2960;
import net.minecraft.class_3879;
import net.minecraft.class_4587;
import net.minecraft.class_630;
import net.minecraft.class_777;
import net.minecraft.class_811;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.jc;
import ruhack.phobia.jg;
import ruhack.phobia.jn;
import ruhack.phobia.oj;

@Mixin(value={class_11661.class})
public class bf {
    private static class_1921 phobia$haloLayer(jn shaderHands, class_2960 texture, boolean trail) {
        if (shaderHands.isItemColorMode()) {
            return (trail ? oj.SHADER_HANDS_TRAIL_ITEM_COLOR_HALO : oj.SHADER_HANDS_ITEM_COLOR_HALO).apply(texture);
        }
        return (trail ? oj.SHADER_HANDS_TRAIL_HALO : oj.SHADER_HANDS_HALO).apply(texture);
    }

    private static class_1921 phobia$gradientLayer(jn shaderHands, class_2960 texture) {
        return oj.SHADER_HANDS_GRADIENT.apply(texture);
    }

    @Inject(method={"method_73480"}, at={@At(value="HEAD")}, cancellable=true)
    private void onSubmitItem(class_4587 matrices, class_811 displayContext, int light, int overlay, int outlineColor, int[] tints, List<class_777> quads, class_1921 layer, class_10444.class_10445 glint, CallbackInfo ci2) {
        class_1058 sprite;
        if (jg.isGhostRenderPass() && !quads.isEmpty() && (sprite = quads.get(0).comp_3724()) != null) {
            ci2.cancel();
            class_11661 self = (class_11661)this;
            self.method_73531(0).method_73480(matrices, displayContext, light, overlay, 0, jg.ghostTints(tints), quads, class_12249.method_76000((class_2960)sprite.method_45852()), class_10444.class_10445.field_55341);
            return;
        }
        jn shaderHands = jn.getInstance();
        if (shaderHands == null || !shaderHands.isState() || quads.isEmpty()) {
            return;
        }
        if (!jn.firstPersonItemContext && !displayContext.method_29998()) {
            return;
        }
        class_1058 sprite2 = quads.get(0).comp_3724();
        if (sprite2 == null) {
            return;
        }
        class_2960 atlas = sprite2.method_45852();
        class_11661 self = (class_11661)this;
        if (shaderHands.isGlowMode()) {
            class_1921 trailHaloLayer;
            boolean trailPass = shaderHands.isTrailEnabled() && (jn.firstPersonItemContext || displayContext.method_29998());
            class_1921 haloLayer = bf.phobia$haloLayer(shaderHands, atlas, false);
            if (!trailPass) {
                shaderHands.forEachItemHaloOutlinePass(quads.size(), false, (haloLight, haloOverlay) -> self.method_73531(1).method_73480(matrices, displayContext, haloLight, haloOverlay, 0, tints, quads, haloLayer, class_10444.class_10445.field_55341));
            }
            class_1921 class_19212 = trailHaloLayer = trailPass ? bf.phobia$haloLayer(shaderHands, atlas, true) : null;
            if (trailPass) {
                shaderHands.forEachItemHaloOutlinePass(quads.size(), true, (haloLight, haloOverlay) -> self.method_73531(1).method_73480(matrices, displayContext, haloLight, haloOverlay, 0, tints, quads, trailHaloLayer, class_10444.class_10445.field_55341));
            }
            if (trailPass && shaderHands.isTrailModelEnabled()) {
                self.method_73531(1).method_73480(matrices, displayContext, shaderHands.packTrailModelColor(), shaderHands.packTrailModelOverlay(), 0, tints, quads, trailHaloLayer, class_10444.class_10445.field_55341);
            }
            if (shaderHands.fillFraction() > 0.01f) {
                self.method_73531(1).method_73480(matrices, displayContext, light, shaderHands.packBakedItemFill(), 0, tints, quads, oj.SHADER_HANDS_BAKED_ITEM_FILL.apply(atlas), class_10444.class_10445.field_55341);
                if (trailPass) {
                    self.method_73531(1).method_73480(matrices, displayContext, light, shaderHands.packBakedItemFill(), 0, tints, quads, oj.SHADER_HANDS_TRAIL_BAKED_ITEM_FILL.apply(atlas), class_10444.class_10445.field_55341);
                }
            }
        } else {
            ci2.cancel();
            self.method_73531(0).method_73480(matrices, displayContext, shaderHands.packColor1(), shaderHands.packColor2Speed(), 0, tints, quads, bf.phobia$gradientLayer(shaderHands, atlas), glint);
        }
    }

    @Inject(method={"method_73490"}, at={@At(value="HEAD")}, cancellable=true)
    private void chamsModel(class_3879 model, Object state, class_4587 matrices, class_1921 layer, int light, int overlay, int color, class_1058 sprite, int outlineColor, class_11683.class_11792 crumbling, CallbackInfo ci2) {
        class_2960 texture;
        if (jg.isGhostRenderPass()) {
            class_2960 ghostTexture = oj.layerTextureOf(layer);
            if (ghostTexture == null) {
                return;
            }
            ci2.cancel();
            class_11661 self = (class_11661)this;
            self.method_73531(0).method_73490(model, state, matrices, class_12249.method_76000((class_2960)ghostTexture), light, overlay, jg.ghostColor(color), sprite, 0, crumbling);
            return;
        }
        jn shaderHands = jn.getInstance();
        if (jn.firstPersonItemContext && shaderHands != null && shaderHands.isState() && (texture = oj.layerTextureOf(layer)) != null) {
            class_11661 self = (class_11661)this;
            if (shaderHands.isGlowMode()) {
                class_1921 trailHaloLayer;
                boolean trailPass = shaderHands.isTrailEnabled();
                class_1921 haloLayer = bf.phobia$haloLayer(shaderHands, texture, false);
                if (!trailPass) {
                    shaderHands.forEachHaloOutlinePass((haloLight, haloOverlay) -> self.method_73531(1).method_73490(model, state, matrices, haloLayer, haloLight, haloOverlay, color, sprite, 0, crumbling));
                }
                class_1921 class_19212 = trailHaloLayer = trailPass ? bf.phobia$haloLayer(shaderHands, texture, true) : null;
                if (trailPass) {
                    shaderHands.forEachHaloOutlinePass((haloLight, haloOverlay) -> self.method_73531(1).method_73490(model, state, matrices, trailHaloLayer, haloLight, haloOverlay, color, sprite, 0, crumbling));
                }
                if (trailPass && shaderHands.isTrailModelEnabled()) {
                    self.method_73531(1).method_73490(model, state, matrices, trailHaloLayer, shaderHands.packTrailModelColor(), shaderHands.packTrailModelOverlay(), color, sprite, 0, crumbling);
                }
                if (shaderHands.fillFraction() > 0.01f) {
                    self.method_73531(1).method_73490(model, state, matrices, oj.SHADER_HANDS_ITEMGLOW.apply(texture), shaderHands.packItemFillColor(), shaderHands.packColor2Speed(), color, sprite, 0, crumbling);
                    if (trailPass) {
                        self.method_73531(1).method_73490(model, state, matrices, oj.SHADER_HANDS_TRAIL_ITEMGLOW.apply(texture), shaderHands.packItemFillColor(), shaderHands.packColor2Speed(), color, sprite, 0, crumbling);
                    }
                }
            } else {
                ci2.cancel();
                self.method_73531(0).method_73490(model, state, matrices, bf.phobia$gradientLayer(shaderHands, texture), shaderHands.packColor1(), shaderHands.packColor2Speed(), color, sprite, 0, crumbling);
            }
            return;
        }
        if (!jc.renderContext) {
            return;
        }
        texture = oj.layerTextureOf(layer);
        if (texture == null) {
            return;
        }
        jc chams = jc.getInstance();
        if (chams != null && chams.isNormalMode()) {
            class_11661 self = (class_11661)this;
            self.method_73531(0).method_73490(model, state, matrices, oj.CHAMS_NORMAL_WALL.apply(texture), light, overlay, color, sprite, outlineColor, crumbling);
            return;
        }
        ci2.cancel();
        class_11661 self = (class_11661)this;
        self.method_73531(0).method_73490(model, state, matrices, oj.CHAMS.apply(texture), jc.visibleLight, jc.visibleOverlay, -1, sprite, outlineColor, crumbling);
        if (jc.wallContext) {
            self.method_73531(1).method_73490(model, state, matrices, oj.CHAMS_WALL.apply(texture), jc.wallLight, jc.wallOverlay, -1, sprite, outlineColor, crumbling);
        }
    }

    @Inject(method={"method_73494"}, at={@At(value="HEAD")}, cancellable=true)
    private void chamsModelPart(class_630 part, class_4587 matrices, class_1921 layer, int light, int overlay, class_1058 sprite, boolean sheeted, boolean hasGlint, int color, class_11683.class_11792 crumbling, int outlineColor, CallbackInfo ci2) {
        class_2960 texture;
        if (jg.isGhostRenderPass()) {
            class_2960 ghostTexture = oj.layerTextureOf(layer);
            if (ghostTexture == null) {
                return;
            }
            ci2.cancel();
            class_11661 self = (class_11661)this;
            self.method_73531(0).method_73494(part, matrices, class_12249.method_76000((class_2960)ghostTexture), light, overlay, sprite, false, false, jg.ghostColor(color), null, 0);
            return;
        }
        jn shaderHands = jn.getInstance();
        if ((jn.firstPersonArmContext || jn.firstPersonItemContext) && shaderHands != null && shaderHands.isState() && (texture = oj.layerTextureOf(layer)) != null) {
            class_11661 self = (class_11661)this;
            if (shaderHands.isGlowMode()) {
                class_1921 trailHaloLayer;
                boolean trailPass = shaderHands.isTrailEnabled();
                class_1921 haloLayer = bf.phobia$haloLayer(shaderHands, texture, false);
                if (trailPass) {
                    shaderHands.forEachHaloFillPass((haloLight, haloOverlay) -> self.method_73531(1).method_73494(part, matrices, haloLayer, haloLight, haloOverlay, sprite, false, false, -1, null, 0));
                } else {
                    shaderHands.forEachHaloPass((haloLight, haloOverlay) -> self.method_73531(1).method_73494(part, matrices, haloLayer, haloLight, haloOverlay, sprite, false, false, -1, null, 0));
                }
                class_1921 class_19212 = trailHaloLayer = trailPass ? bf.phobia$haloLayer(shaderHands, texture, true) : null;
                if (trailPass) {
                    shaderHands.forEachHaloPass((haloLight, haloOverlay) -> self.method_73531(1).method_73494(part, matrices, trailHaloLayer, haloLight, haloOverlay, sprite, false, false, -1, null, 0));
                }
                if (shaderHands.isTrailModelEnabled()) {
                    self.method_73531(1).method_73494(part, matrices, trailHaloLayer, shaderHands.packTrailModelColor(), shaderHands.packTrailModelOverlay(), sprite, false, false, -1, null, 0);
                }
            } else {
                ci2.cancel();
                self.method_73531(0).method_73494(part, matrices, bf.phobia$gradientLayer(shaderHands, texture), shaderHands.packColor1(), shaderHands.packColor2Speed(), sprite, false, false, -1, null, 0);
            }
            return;
        }
        if (!jc.renderContext) {
            return;
        }
        texture = oj.layerTextureOf(layer);
        if (texture == null) {
            return;
        }
        jc chams = jc.getInstance();
        if (chams != null && chams.isNormalMode()) {
            class_11661 self = (class_11661)this;
            self.method_73531(0).method_73494(part, matrices, oj.CHAMS_NORMAL_WALL.apply(texture), light, overlay, sprite, false, false, color, crumbling, outlineColor);
            return;
        }
        ci2.cancel();
        class_11661 self = (class_11661)this;
        self.method_73531(0).method_73494(part, matrices, oj.CHAMS.apply(texture), jc.visibleLight, jc.visibleOverlay, sprite, false, false, -1, null, 0);
        if (jc.wallContext) {
            self.method_73531(1).method_73494(part, matrices, oj.CHAMS_WALL.apply(texture), jc.wallLight, jc.wallOverlay, sprite, false, false, -1, null, 0);
        }
    }
}

