/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class01062
 *  minecraft.class02003
 *  minecraft.class02796
 *  minecraft.class02969
 *  minecraft.class06633
 *  minecraft.class07842
 *  minecraft.class08774
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import minecraft.class01062;
import minecraft.class02003;
import minecraft.class02796;
import minecraft.class02969;
import minecraft.class05623;
import minecraft.class06633;
import minecraft.class07842;
import minecraft.class08774;
import org.slf4j.Logger;

public class class05607
extends class01062 {
    private static final Logger M = LogUtils.getLogger();

    private void w() {
        try {
            this.M().M();
        }
        catch (IOException iOException) {
            M.warn("Failed to load user banlist: ", (Throwable)iOException);
        }
    }

    private void Q() {
        try {
            this.z().M();
        }
        catch (Exception exception) {
            M.warn("Failed to load white-list: ", (Throwable)exception);
        }
    }

    public class05607(class05623 class056232, class02003<class02969> class020032, class07842 class078422) {
        super((class02796)class056232, class020032, class078422, (class06633)class056232.Nt());
        this.N(class056232.V());
        this.y(class056232.e());
        this.w();
        this.l();
        this.d();
        this.G();
        this.k();
        this.Q();
        this.Y();
        if (!this.z().L().exists()) {
            this.O();
        }
    }

    private void l() {
        try {
            this.M().R();
        }
        catch (IOException iOException) {
            M.warn("Failed to save user banlist: ", (Throwable)iOException);
        }
    }

    private void d() {
        try {
            this.B().M();
        }
        catch (IOException iOException) {
            M.warn("Failed to load ip banlist: ", (Throwable)iOException);
        }
    }

    private void k() {
        try {
            this.E().M();
        }
        catch (Exception exception) {
            M.warn("Failed to load operators list: ", (Throwable)exception);
        }
    }

    public boolean y(class08774 class087742) {
        return this.E().y(class087742);
    }

    public boolean N(class08774 class087742) {
        return !this.s() || this.R(class087742) || this.z().N(class087742);
    }

    private void O() {
        try {
            this.z().R();
        }
        catch (Exception exception) {
            M.warn("Failed to save white-list: ", (Throwable)exception);
        }
    }

    private void G() {
        try {
            this.B().R();
        }
        catch (IOException iOException) {
            M.warn("Failed to save ip banlist: ", (Throwable)iOException);
        }
    }

    public void x_() {
        this.Q();
    }

    private void Y() {
        try {
            this.E().R();
        }
        catch (Exception exception) {
            M.warn("Failed to save operators list: ", (Throwable)exception);
        }
    }
}

