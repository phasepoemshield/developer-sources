/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.Dim2iAccess
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.Point2iAccess
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package net.caffeinemc.mods.sodium.client.util;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import me.flashyreese.mods.reeses_sodium_options.client.gui.Dim2iAccess;
import me.flashyreese.mods.reeses_sodium_options.client.gui.Point2iAccess;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Dim2i
extends Record
implements Dim2iAccess,
Point2iAccess {
    private int x;
    private int y;
    private int width;
    private int height;
    private Point2iAccess point2i;

    public int width() {
        return this.width;
    }

    public Dim2i(int n, int n2, int n3, int n4) {
        this.x = n;
        this.y = n2;
        this.width = n3;
        this.height = n4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Dim2i.class, "x;y;width;height", "x", "y", "width", "height"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Dim2i.class, "x;y;width;height", "x", "y", "width", "height"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Dim2i.class, "x;y;width;height", "x", "y", "width", "height"}, this);
    }

    public int x() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$cjh000$reeses-sodium-options$x(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        return this.x;
    }

    public int y() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$cjh000$reeses-sodium-options$y(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        return this.y;
    }

    public void setX(int n) {
        this.x = n;
    }

    public void setY(int n) {
        this.y = n;
    }

    public int getY() {
        return this.y();
    }

    public int getX() {
        return this.x();
    }

    public int height() {
        return this.height;
    }

    public void setWidth(int n) {
        this.width = n;
    }

    public void handler$cjh000$reeses-sodium-options$y(CallbackInfoReturnable callbackInfoReturnable) {
        if (this.point2i != null) {
            callbackInfoReturnable.setReturnValue((Object)(this.y + this.point2i.getY()));
        }
    }

    public void handler$cjh000$reeses-sodium-options$x(CallbackInfoReturnable callbackInfoReturnable) {
        if (this.point2i != null) {
            callbackInfoReturnable.setReturnValue((Object)(this.x + this.point2i.getX()));
        }
    }

    public Dim2i insetBottom(int n) {
        return this.inset(0, 0, 0, n);
    }

    public Dim2i insetX(int n) {
        return this.inset(n, n, 0, 0);
    }

    public Dim2i insetY(int n) {
        return this.inset(0, 0, n, n);
    }

    public Dim2i insetLeft(int n) {
        return this.inset(n, 0, 0, 0);
    }

    public Dim2i insetRight(int n) {
        return this.inset(0, n, 0, 0);
    }

    public Dim2i inset(int n, int n2, int n3, int n4) {
        return new Dim2i(this.x + n, this.y + n3, this.width - n - n2, this.height - n3 - n4);
    }

    public Dim2i insetTop(int n) {
        return this.inset(0, 0, n, 0);
    }

    public void handler$cjh000$reeses-sodium-options$containsCursor(double d, double d2, CallbackInfoReturnable callbackInfoReturnable) {
        callbackInfoReturnable.setReturnValue((Object)(d >= (double)this.x() && d < (double)this.getLimitX() && d2 >= (double)this.y() && d2 < (double)this.getLimitY() ? 1 : 0));
    }

    public void handler$cjh000$reeses-sodium-options$redirectGetCenterX(CallbackInfoReturnable callbackInfoReturnable) {
        callbackInfoReturnable.setReturnValue((Object)(this.x() + this.width() / 2));
    }

    public void handler$cjh000$reeses-sodium-options$redirectGetCenterY(CallbackInfoReturnable callbackInfoReturnable) {
        callbackInfoReturnable.setReturnValue((Object)(this.y() + this.height() / 2));
    }

    public void handler$cjh000$reeses-sodium-options$redirectGetLimitX(CallbackInfoReturnable callbackInfoReturnable) {
        callbackInfoReturnable.setReturnValue((Object)(this.x() + this.width()));
    }

    public void handler$cjh000$reeses-sodium-options$redirectGetLimitY(CallbackInfoReturnable callbackInfoReturnable) {
        callbackInfoReturnable.setReturnValue((Object)(this.y() + this.height()));
    }

    public int getLimitX() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$cjh000$reeses-sodium-options$redirectGetLimitX(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        return this.x + this.width;
    }

    public int getCenterY() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$cjh000$reeses-sodium-options$redirectGetCenterY(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        return this.y + this.height / 2;
    }

    public void setPoint2i(Point2iAccess point2iAccess) {
        this.point2i = point2iAccess;
    }

    public int getLimitY() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$cjh000$reeses-sodium-options$redirectGetLimitY(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        return this.y + this.height;
    }

    public int getCenterX() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$cjh000$reeses-sodium-options$redirectGetCenterX(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        return this.x + this.width / 2;
    }

    public boolean canFitDimension(Dim2i dim2i) {
        return this.x() <= dim2i.x() && this.y() <= dim2i.y() && this.getLimitX() >= dim2i.getLimitX() && this.getLimitY() >= dim2i.getLimitY();
    }

    public boolean overlapWith(Dim2i dim2i) {
        return this.x() < dim2i.getLimitX() && this.getLimitX() > dim2i.x() && this.y() < dim2i.getLimitY() && this.getLimitY() > dim2i.y();
    }

    public boolean containsCursor(double d, double d2) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$cjh000$reeses-sodium-options$containsCursor(d, d2, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return d >= (double)this.x && d < (double)this.getLimitX() && d2 >= (double)this.y && d2 < (double)this.getLimitY();
    }

    public void setHeight(int n) {
        this.height = n;
    }
}

