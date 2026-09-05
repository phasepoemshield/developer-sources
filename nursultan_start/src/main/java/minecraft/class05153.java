/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10496
 *  com.mojang.logging.LogUtils
 *  com.mojang.text2speech.Narrator
 *  minecraft.class00392
 *  minecraft.class01299
 *  minecraft.class04911
 *  minecraft.class05220
 *  minecraft.class05630
 *  minecraft.class06086
 *  minecraft.class06095
 *  minecraft.class06132
 *  minecraft.class06202
 *  minecraft.class07529
 *  org.lwjgl.util.tinyfd.TinyFileDialogs
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10496;
import com.mojang.logging.LogUtils;
import com.mojang.text2speech.Narrator;
import minecraft.class00392;
import minecraft.class01299;
import minecraft.class04911;
import minecraft.class05220;
import minecraft.class05630;
import minecraft.class06086;
import minecraft.class06095;
import minecraft.class06132;
import minecraft.class06202;
import minecraft.class07529;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class class05153 {
    public static final class00392 N = class05220.N;
    private static final Logger y = LogUtils.getLogger();
    private final class06202 L;
    private final Narrator u = Narrator.getNarrator();

    public void L(class00392 class003922) {
        if (this.u().u()) {
            this.i(class003922);
        }
    }

    public void L() {
        this.u.destroy();
    }

    public class05153(class06202 class062022) {
        this.L = class062022;
    }

    private void i(class00392 class003922) {
        String string = class003922.getString();
        if (!string.isEmpty()) {
            this.y(string);
            this.N(string, false);
        }
    }

    private class01299 u() {
        return (class01299)((class05630)this.L.i_7).NV().method_41753();
    }

    public void u(class00392 class003922) {
        this.N(class003922.getString());
    }

    public void y() {
        if (this.u() == class01299.field_18176 || !this.u.active()) {
            return;
        }
        this.u.clear();
    }

    public void y(class00392 class003922) {
        if (this.u().i()) {
            this.i(class003922);
        }
    }

    private void y(String string) {
        if (class07529.ND) {
            y.debug("Narrating: {}", (Object)string.replaceAll("\n", "\\\\n"));
        }
    }

    public void N(class01299 class012992) {
        this.y();
        this.N(class00392.L((String)"options.narrator").i(" : ").y(class012992.y()).getString(), true);
        class06086 class060862 = class06202.Nq().m();
        if (this.u.active()) {
            if (class012992 == class01299.field_18176) {
                class06132.y((class06086)class060862, (class06095)class06095.N, (class00392)class00392.L((String)"narrator.toast.disabled"), null);
            } else {
                class06132.y((class06086)class060862, (class06095)class06095.N, (class00392)class00392.L((String)"narrator.toast.enabled"), (class00392)class012992.y());
            }
        } else {
            class06132.y((class06086)class060862, (class06095)class06095.N, (class00392)class00392.L((String)"narrator.toast.disabled"), (class00392)class00392.L((String)"options.narrator.notavailable"));
        }
    }

    public void N(class00392 class003922) {
        if (this.u().L()) {
            this.i(class003922);
        }
    }

    public void N(boolean bl) {
        if (bl && !this.N() && !TinyFileDialogs.tinyfd_messageBox((CharSequence)"Minecraft", (CharSequence)"Failed to initialize text-to-speech library. Do you want to continue?\nIf this problem persists, please report it at bugs.mojang.com", (CharSequence)"yesno", (CharSequence)"error", (boolean)true)) {
            throw new class10496("Narrator library is not active");
        }
    }

    public boolean N() {
        return this.u.active();
    }

    private void N(String string, boolean bl) {
        this.u.say(string, bl, ((class05630)this.L.i_7).N(class04911.field_15246));
    }

    public void N(String string) {
        if (this.u().u() && !string.isEmpty()) {
            this.y(string);
            if (this.u.active()) {
                this.u.clear();
                this.N(string, true);
            }
        }
    }
}

