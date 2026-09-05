/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class08394
 *  org.joml.Matrix3x2fStack
 */
package de.maxhenkel.voicechat.gui.audiodevice;

import de.maxhenkel.voicechat.gui.widgets.ListScreenEntryBase;
import java.util.Objects;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class08394;
import org.joml.Matrix3x2fStack;

public class AudioDeviceEntry
extends ListScreenEntryBase<AudioDeviceEntry> {
    protected static final class01894 SELECTED = class01894.N((String)"voicechat", (String)"icons/device_selected");
    protected static final int PADDING = 4;
    protected static final int BG_FILL = class02566.y((int)255, (int)74, (int)74, (int)74);
    protected static final int BG_FILL_HOVERED = class02566.y((int)255, (int)90, (int)90, (int)90);
    protected static final int BG_FILL_SELECTED = class02566.y((int)255, (int)40, (int)40, (int)40);
    protected static final int DEVICE_NAME_COLOR = class02566.y((int)255, (int)255, (int)255, (int)255);
    protected final class06202 minecraft;
    protected final String device;
    protected final class00392 name;
    @Nullable
    protected final class01894 icon;
    protected final Supplier<Boolean> isSelected;

    public AudioDeviceEntry(String string, class00392 class003922, @Nullable class01894 class018942, Supplier<Boolean> supplier) {
        this.device = string;
        this.icon = class018942;
        this.isSelected = supplier;
        this.name = class003922;
        this.minecraft = class06202.Nq();
    }

    public String getDevice() {
        return this.device;
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3 = this.method_73380();
        int n4 = this.method_73382();
        int n5 = this.method_73387();
        int n6 = this.method_73384();
        boolean bl2 = this.isSelected.get();
        if (bl2) {
            class010542.N(n3, n4, n3 + n5, n4 + n6, BG_FILL_SELECTED);
        } else if (bl) {
            class010542.N(n3, n4, n3 + n5, n4 + n6, BG_FILL_HOVERED);
        } else {
            class010542.N(n3, n4, n3 + n5, n4 + n6, BG_FILL);
        }
        if (this.icon != null) {
            class010542.N(class08394.Na, this.icon, n3 + 4, n4 + n6 / 2 - 8, 16, 16);
        }
        if (bl2) {
            class010542.N(class08394.Na, SELECTED, n3 + 4, n4 + n6 / 2 - 8, 16, 16);
        }
        float f2 = ((class01590)this.minecraft.i_3).N((class05936)this.name);
        float f3 = n5 - 4 - 16 - 4 - 4;
        float f4 = Math.min(f3 / f2, 1.0f);
        class010542.i().pushMatrix();
        Matrix3x2fStack matrix3x2fStack = class010542.i();
        float f5 = n3 + 4 + 16 + 4;
        float f6 = n4 + n6 / 2;
        Objects.requireNonNull((class01590)this.minecraft.i_3);
        matrix3x2fStack.translate(f5, f6 - 9.0f * f4 / 2.0f);
        class010542.i().scale(f4, f4);
        class010542.N((class01590)this.minecraft.i_3, this.name, 0, 0, DEVICE_NAME_COLOR, false);
        class010542.i().popMatrix();
    }
}

