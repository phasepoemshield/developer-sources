/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  minecraft.class00392
 *  minecraft.class03054
 *  minecraft.class05216
 *  minecraft.class06202
 *  minecraft.class06541
 */
package baritone.api.utils;

import baritone.api.BaritoneAPI;
import baritone.api.utils.Helper$1;
import java.util.Arrays;
import java.util.Calendar;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class03054;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06541;

public interface Helper {
    public static final Helper HELPER = new Helper$1();
    @Deprecated
    public static final class06202 mc = class06202.Nq();
    public static final class03054 MESSAGE_TAG = new class03054(0xFF55FF, null, (class00392)class00392.y((String)"Baritone message."), "Baritone");

    default public void logDebug(String string) {
        if (!((Boolean)BaritoneAPI.getSettings().chatDebug.value).booleanValue()) {
            return;
        }
        this.logDirect(string, false);
    }

    public static class00392 getPrefix() {
        boolean bl;
        Calendar calendar = Calendar.getInstance();
        boolean bl2 = bl = calendar.get(2) == 3 && calendar.get(5) <= 3;
        class05216 class052162 = class00392.y((String)(bl ? "Baritoe" : ((Boolean)BaritoneAPI.getSettings().shortBaritonePrefix.value != false ? "B" : "Baritone")));
        class052162.y(class052162.method_10866().N(class06541.field_1076));
        class05216 class052163 = class00392.y((String)"");
        class052163.y(class052162.method_10866().N(class06541.field_1064));
        class052163.i("[");
        class052163.y((class00392)class052162);
        class052163.i("]");
        return class052163;
    }

    default public void logToast(String string, String string2) {
        this.logToast((class00392)class00392.y((String)string), (class00392)class00392.y((String)string2));
    }

    default public void logToast(class00392 class003922, class00392 class003923) {
        class06202.Nq().execute(() -> ((BiConsumer)BaritoneAPI.getSettings().toaster.value).accept(class003922, class003923));
    }

    default public void logToast(String string) {
        this.logToast(Helper.getPrefix(), (class00392)class00392.y((String)string));
    }

    default public void logDirect(String string) {
        this.logDirect(string, (Boolean)BaritoneAPI.getSettings().logAsToast.value);
    }

    default public void logDirect(String string2, class06541 class065412, boolean bl) {
        Stream.of(string2.split("\n")).forEach(string -> {
            class05216 class052162 = class00392.y((String)string.replace("\t", "    "));
            class052162.y(class052162.method_10866().N(class065412));
            this.logDirect(bl, new class00392[]{class052162});
        });
    }

    default public void logDirect(String string, class06541 class065412) {
        this.logDirect(string, class065412, (Boolean)BaritoneAPI.getSettings().logAsToast.value);
    }

    default public void logDirect(class00392 ... class00392Array) {
        this.logDirect((Boolean)BaritoneAPI.getSettings().logAsToast.value, class00392Array);
    }

    default public void logDirect(String string, boolean bl) {
        this.logDirect(string, class06541.field_1080, bl);
    }

    default public void logDirect(boolean bl, class00392 ... class00392Array) {
        class05216 class052162 = class00392.y((String)"");
        if (!bl && !((Boolean)BaritoneAPI.getSettings().useMessageTag.value).booleanValue()) {
            class052162.y(Helper.getPrefix());
            class052162.y((class00392)class00392.y((String)" "));
        }
        Arrays.asList(class00392Array).forEach(arg_0 -> ((class05216)class052162).y(arg_0));
        if (bl) {
            this.logToast(Helper.getPrefix(), (class00392)class052162);
        } else {
            class06202.Nq().execute(() -> ((Consumer)BaritoneAPI.getSettings().logger.value).accept(class052162));
        }
    }

    default public void logNotification(String string) {
        this.logNotification(string, false);
    }

    default public void logNotification(String string, boolean bl) {
        if (((Boolean)BaritoneAPI.getSettings().desktopNotifications.value).booleanValue()) {
            this.logNotificationDirect(string, bl);
        }
    }

    default public void logNotificationDirect(String string, boolean bl) {
        class06202.Nq().execute(() -> ((BiConsumer)BaritoneAPI.getSettings().notifier.value).accept(string, bl));
    }

    default public void logNotificationDirect(String string) {
        this.logNotificationDirect(string, false);
    }

    default public void logUnhandledException(Throwable throwable) {
        HELPER.logDirect("An unhandled exception occurred. The error is in your game's log, please report this at https://github.com/cabaletta/baritone/issues", class06541.field_1061);
        throwable.printStackTrace();
    }
}

