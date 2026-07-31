package fun.wonderful.api.storages.implement;

import fun.wonderful.api.QClient;
import fun.wonderful.api.events.EventInvoker;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventLook;
import fun.wonderful.api.events.implement.EventRotation;
import lombok.Generated;
import net.minecraft.util.math.MathHelper;

public class FreeLookStorage
implements QClient {
    private static boolean active;
    private static float freeYaw;
    private static float freePitch;

    public FreeLookStorage() {
        EventInvoker.register(this);
    }

    public static boolean isActive() {
        return active;
    }

    @EventLink
    public void onLook(EventLook event) {
        if (active) {
            this.rotateTowards(event.getYaw(), event.getPitch());
            event.cancel();
        }
    }

    @EventLink
    public void onRotation(EventRotation event) {
        if (active) {
            event.setYaw(freeYaw);
            event.setPitch(freePitch);
        } else {
            freeYaw = event.getYaw();
            freePitch = event.getPitch();
        }
    }

    private void rotateTowards(double targetYaw, double targetPitch) {
        freePitch = MathHelper.clamp((float)((float)((double)freePitch + targetPitch * 0.15)), (float)-89.9f, (float)89.9f);
        freeYaw = (float)((double)freeYaw + targetYaw * 0.15);
    }

    @Generated
    public static void setActive(boolean active) {
        FreeLookStorage.active = active;
    }

    @Generated
    public static float getFreeYaw() {
        return freeYaw;
    }

    @Generated
    public static float getFreePitch() {
        return freePitch;
    }

    @Generated
    public static void setFreeYaw(float freeYaw) {
        FreeLookStorage.freeYaw = freeYaw;
    }

    @Generated
    public static void setFreePitch(float freePitch) {
        FreeLookStorage.freePitch = freePitch;
    }
}