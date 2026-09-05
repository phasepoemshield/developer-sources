/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class02233
 *  minecraft.class04453
 *  minecraft.class05216
 *  minecraft.class05630
 *  minecraft.class05731
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06889
 */
package me.flashyreese.mods.sodiumextra.client.gui;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Objects;
import me.flashyreese.mods.sodiumextra.client.FrameCounter;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import me.flashyreese.mods.sodiumextra.client.config.SodiumExtraGameOptions$OverlayCorner;
import me.flashyreese.mods.sodiumextra.client.config.SodiumExtraGameOptions$TextContrast;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class02233;
import minecraft.class04453;
import minecraft.class05216;
import minecraft.class05630;
import minecraft.class05731;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06889;

public class SodiumExtraHud {
    private final List<class00392> textList = new ObjectArrayList();
    private final class06202 client = class06202.Nq();
    private final FrameCounter stats = FrameCounter.getInstance();

    public void onHudRender(class01054 class010542, class02233 class022332) {
        if (!((class05731)this.client.L_0).u() && !((class05630)this.client.i_7).NG) {
            int n;
            SodiumExtraGameOptions$OverlayCorner sodiumExtraGameOptions$OverlayCorner = SodiumExtraClientMod.options().extraSettings.overlayCorner;
            if (sodiumExtraGameOptions$OverlayCorner == SodiumExtraGameOptions$OverlayCorner.BOTTOM_LEFT || sodiumExtraGameOptions$OverlayCorner == SodiumExtraGameOptions$OverlayCorner.BOTTOM_RIGHT) {
                int n2 = this.client.Nt().s();
                Objects.requireNonNull((class01590)this.client.i_3);
                n = n2 - 9 - 2;
            } else {
                n = 2;
            }
            int n3 = n;
            for (class00392 class003922 : this.textList) {
                int n4 = sodiumExtraGameOptions$OverlayCorner == SodiumExtraGameOptions$OverlayCorner.TOP_RIGHT || sodiumExtraGameOptions$OverlayCorner == SodiumExtraGameOptions$OverlayCorner.BOTTOM_RIGHT ? this.client.Nt().P() - ((class01590)this.client.i_3).N((class05936)class003922) - 2 : 2;
                this.drawString(class010542, class003922, n4, n3);
                if (sodiumExtraGameOptions$OverlayCorner == SodiumExtraGameOptions$OverlayCorner.BOTTOM_LEFT || sodiumExtraGameOptions$OverlayCorner == SodiumExtraGameOptions$OverlayCorner.BOTTOM_RIGHT) {
                    Objects.requireNonNull((class01590)this.client.i_3);
                    n3 -= 9 + 2;
                    continue;
                }
                Objects.requireNonNull((class01590)this.client.i_3);
                n3 += 9 + 2;
            }
        }
    }

    private void drawString(class01054 class010542, class00392 class003922, int n, int n2) {
        int n3 = -1;
        if (SodiumExtraClientMod.options().extraSettings.textContrast == SodiumExtraGameOptions$TextContrast.BACKGROUND) {
            int n4 = n + ((class01590)this.client.i_3).N((class05936)class003922) + 1;
            Objects.requireNonNull((class01590)this.client.i_3);
            class010542.N(n - 1, n2 - 1, n4, n2 + 9 + 1, -1873784752);
        }
        class010542.N((class01590)this.client.i_3, class003922, n, n2, n3, SodiumExtraClientMod.options().extraSettings.textContrast == SodiumExtraGameOptions$TextContrast.SHADOW);
    }

    public void onStartTick(class06202 class062022) {
        class05216 class052162;
        this.textList.clear();
        if (SodiumExtraClientMod.options().extraSettings.showFps) {
            int n = FrameCounter.getInstance().getSmoothFps();
            class052162 = class00392.N((String)"sodium-extra.overlay.fps", (Object[])new Object[]{n});
            if (SodiumExtraClientMod.options().extraSettings.showFPSExtended) {
                class052162 = class00392.y((String)String.format("%s %s", class052162.getString(), class00392.N((String)"sodium-extra.overlay.fps_extended", (Object[])new Object[]{this.stats.getAverageFps(), this.stats.getOnePercentLowFps(), this.stats.getPointOnePercentLowFps()}).getString()));
            }
            this.textList.add((class00392)class052162);
        }
        if (SodiumExtraClientMod.options().extraSettings.showCoords && (class04453)this.client.T_4 != null) {
            class06889 class068892 = ((class04453)this.client.T_4).method_73189();
            class052162 = class00392.N((String)"sodium-extra.overlay.coordinates", (Object[])new Object[]{String.format("%.2f", class068892.M), String.format("%.2f", class068892.B), String.format("%.2f", class068892.Z)});
            if (this.client.h()) {
                class052162 = class00392.L((String)"sodium-extra.overlay.coordinates_unavailable");
            }
            this.textList.add((class00392)class052162);
        }
        if (!SodiumExtraClientMod.options().renderSettings.lightUpdates) {
            class05216 class052163 = class00392.L((String)"sodium-extra.overlay.light_updates");
            this.textList.add((class00392)class052163);
        }
    }
}

