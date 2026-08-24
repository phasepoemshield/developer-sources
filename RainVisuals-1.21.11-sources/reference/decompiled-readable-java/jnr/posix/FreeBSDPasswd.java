/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;
import jnr.posix.NativePasswd;
import jnr.posix.Passwd;

public class FreeBSDPasswd
extends NativePasswd
implements Passwd {
    private static final Layout layout = new Layout(Runtime.getSystemRuntime());

    @Override
    public String getShell() {
        return FreeBSDPasswd.layout.pw_shell.get(this.memory);
    }

    @Override
    public String getGECOS() {
        return FreeBSDPasswd.layout.pw_gecos.get(this.memory);
    }

    @Override
    public long getUID() {
        return FreeBSDPasswd.layout.pw_uid.get(this.memory);
    }

    FreeBSDPasswd(Pointer memory) {
        super(memory);
    }

    @Override
    public String getPassword() {
        return FreeBSDPasswd.layout.pw_passwd.get(this.memory);
    }

    @Override
    public String getAccessClass() {
        return FreeBSDPasswd.layout.pw_class.get(this.memory);
    }

    @Override
    public int getExpire() {
        return FreeBSDPasswd.layout.pw_expire.intValue(this.memory);
    }

    @Override
    public String getLoginName() {
        return FreeBSDPasswd.layout.pw_name.get(this.memory);
    }

    @Override
    public int getPasswdChangeTime() {
        return FreeBSDPasswd.layout.pw_change.intValue(this.memory);
    }

    @Override
    public long getGID() {
        return FreeBSDPasswd.layout.pw_gid.get(this.memory);
    }

    @Override
    public String getHome() {
        return FreeBSDPasswd.layout.pw_dir.get(this.memory);
    }

    private static final class Layout
    extends StructLayout {
        public final StructLayout.SignedLong pw_change;
        public final StructLayout.Signed32 pw_fields;
        public final StructLayout.UTF8StringRef pw_shell;
        public final StructLayout.Signed32 pw_uid;
        public final StructLayout.UTF8StringRef pw_dir;
        public final StructLayout.SignedLong pw_expire;
        public final StructLayout.UTF8StringRef pw_passwd;
        public final StructLayout.UTF8StringRef pw_name = new StructLayout.UTF8StringRef();
        public final StructLayout.UTF8StringRef pw_gecos;
        public final StructLayout.Signed32 pw_gid;
        public final StructLayout.UTF8StringRef pw_class;

        private Layout(Runtime runtime) {
            super(runtime);
            this.pw_passwd = new StructLayout.UTF8StringRef();
            this.pw_uid = new StructLayout.Signed32();
            this.pw_gid = new StructLayout.Signed32();
            this.pw_change = new StructLayout.SignedLong();
            this.pw_class = new StructLayout.UTF8StringRef();
            this.pw_gecos = new StructLayout.UTF8StringRef();
            this.pw_dir = new StructLayout.UTF8StringRef();
            this.pw_shell = new StructLayout.UTF8StringRef();
            this.pw_expire = new StructLayout.SignedLong();
            this.pw_fields = new StructLayout.Signed32();
        }
    }
}

