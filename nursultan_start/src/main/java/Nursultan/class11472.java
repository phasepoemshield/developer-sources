/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11802
 *  fun.crashsystem.jdrpc.entity.User
 */
package Nursultan;

import Nursultan.class11802;
import fun.crashsystem.jdrpc.entity.User;

public class class11472 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;

    public void L(int n) {
        this.y_1 = n;
    }

    public int L() {
        return (Integer)this.y_1;
    }

    public void L(String string) {
        this.N_2 = string;
    }

    public int M() {
        return (Integer)this.N_0;
    }

    public class11472() {
        this.m();
        this.y_1 = -1;
        this.y_2 = -1;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof class11472)) {
            return false;
        }
        class11472 class114722 = (class11472)object;
        if (!class114722.N(this)) {
            return false;
        }
        if (this.M() != class114722.M()) {
            return false;
        }
        if (this.R() != class114722.R()) {
            return false;
        }
        if (this.z() != class114722.z()) {
            return false;
        }
        if (this.L() != class114722.L()) {
            return false;
        }
        if (this.U() != class114722.U()) {
            return false;
        }
        String string = this.Z();
        String string2 = class114722.Z();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        String string3 = this.B();
        String string4 = class114722.B();
        if (string3 == null ? string4 != null : !string3.equals(string4)) {
            return false;
        }
        String string5 = this.y();
        String string6 = class114722.y();
        if (string5 == null ? string6 != null : !string5.equals(string6)) {
            return false;
        }
        class11802 class118022 = this.i();
        class11802 class118023 = class114722.i();
        if (class118022 == null ? class118023 != null : !class118022.equals(class118023)) {
            return false;
        }
        String string7 = this.u();
        String string8 = class114722.u();
        if (string7 == null ? string8 != null : !string7.equals(string8)) {
            return false;
        }
        User user = this.N();
        User user2 = class114722.N();
        return !(user == null ? user2 != null : !user.equals(user2));
    }

    public String toString() {
        return "ClientUser(uid=" + this.M() + ", username=" + this.Z() + ", apiToken=" + this.B() + ", hasPremium=" + this.R() + ", subscribeTimeMinutes=" + this.z() + ", hash=" + this.y() + ", role=" + String.valueOf(this.i()) + ", prefixIndex=" + this.L() + ", avatarTextureId=" + this.U() + ", avatarBase64=" + this.u() + ", discordUser=" + String.valueOf(this.N()) + ")";
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.M();
        n2 = n2 * 59 + (this.R() ? 79 : 97);
        long l = this.z();
        n2 = n2 * 59 + (int)(l >>> 32 ^ l);
        n2 = n2 * 59 + this.L();
        n2 = n2 * 59 + this.U();
        String string = this.Z();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        String string2 = this.B();
        n2 = n2 * 59 + (string2 == null ? 43 : string2.hashCode());
        String string3 = this.y();
        n2 = n2 * 59 + (string3 == null ? 43 : string3.hashCode());
        class11802 class118022 = this.i();
        n2 = n2 * 59 + (class118022 == null ? 43 : class118022.hashCode());
        String string4 = this.u();
        n2 = n2 * 59 + (string4 == null ? 43 : string4.hashCode());
        User user = this.N();
        n2 = n2 * 59 + (user == null ? 43 : user.hashCode());
        return n2;
    }

    public String B() {
        return (String)this.N_2;
    }

    public String Z() {
        return (String)this.N_1;
    }

    public class11802 i() {
        return (class11802)this.y_0;
    }

    private void m() {
        this.N_0 = 0;
        this.y_1 = 0;
        this.N_3 = false;
        this.y_2 = 0;
        this.N_4 = 0L;
    }

    public int U() {
        return (Integer)this.y_2;
    }

    public long z() {
        return 999999999L;
    }

    public void u(String string) {
        this.N_5 = string;
    }

    public String u() {
        return (String)this.y_3;
    }

    public void y(int n) {
        this.N_0 = n;
    }

    public String y() {
        return (String)this.N_5;
    }

    public void y(String string) {
        this.y_3 = string;
    }

    public void N(long l) {
        this.N_4 = l;
    }

    public void N(User user) {
        this.y_4 = user;
    }

    public void N(int n) {
        this.y_2 = n;
    }

    public void N(String string) {
        this.N_1 = string;
    }

    public void N(boolean bl) {
        this.N_3 = bl;
    }

    public boolean N(Object object) {
        return object instanceof class11472;
    }

    public User N() {
        return (User)this.y_4;
    }

    public void N(class11802 class118022) {
        this.y_0 = class118022;
    }

    public boolean R() {
        return true;
    }
}

