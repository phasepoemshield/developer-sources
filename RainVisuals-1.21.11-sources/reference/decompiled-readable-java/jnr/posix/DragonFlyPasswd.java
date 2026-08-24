/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;
import jnr.posix.NativePasswd;
import jnr.posix.Passwd;

public class DragonFlyPasswd
extends NativePasswd
implements Passwd {
    private static final Layout layout = new Layout(Runtime.getSystemRuntime());

    @Override
    public String getGECOS() {
        return DragonFlyPasswd.layout.pw_gecos.get(this.memory);
    }

    @Override
    public String getAccessClass() {
        return DragonFlyPasswd.layout.pw_class.get(this.memory);
    }

    @Override
    public String getLoginName() {
        return DragonFlyPasswd.layout.pw_name.get(this.memory);
    }

    @Override
    public String getHome() {
        return DragonFlyPasswd.layout.pw_dir.get(this.memory);
    }

    @Override
    public String getPassword() {
        return DragonFlyPasswd.layout.pw_passwd.get(this.memory);
    }

    @Override
    public long getUID() {
        return DragonFlyPasswd.layout.pw_uid.get(this.memory);
    }

    @Override
    public int getPasswdChangeTime() {
        return DragonFlyPasswd.layout.pw_change.intValue(this.memory);
    }

    DragonFlyPasswd(Pointer memory) {
        super(memory);
    }

    @Override
    public String getShell() {
        return DragonFlyPasswd.layout.pw_shell.get(this.memory);
    }

    @Override
    public long getGID() {
        return DragonFlyPasswd.layout.pw_gid.get(this.memory);
    }

    @Override
    public int getExpire() {
        return DragonFlyPasswd.layout.pw_expire.intValue(this.memory);
    }

    private static final class Layout
    extends StructLayout {
        public final StructLayout.Signed32 pw_gid;
        public final StructLayout.Signed32 pw_fields;
        public final StructLayout.SignedLong pw_expire;
        public final StructLayout.UTF8StringRef pw_passwd;
        public final StructLayout.SignedLong pw_change;
        public final StructLayout.Signed32 pw_uid;
        public final StructLayout.UTF8StringRef pw_class;
        public final StructLayout.UTF8StringRef pw_gecos;
        public final StructLayout.UTF8StringRef pw_name = new StructLayout.UTF8StringRef();
        public final StructLayout.UTF8StringRef pw_dir;
        public final StructLayout.UTF8StringRef pw_shell;

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

