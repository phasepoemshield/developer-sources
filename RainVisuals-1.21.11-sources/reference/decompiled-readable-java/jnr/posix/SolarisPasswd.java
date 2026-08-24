/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;
import jnr.posix.NativePasswd;
import jnr.posix.Passwd;

public class SolarisPasswd
extends NativePasswd
implements Passwd {
    private static final Layout layout = new Layout(Runtime.getSystemRuntime());

    @Override
    public int getPasswdChangeTime() {
        return 0;
    }

    @Override
    public long getGID() {
        return SolarisPasswd.layout.pw_gid.get(this.memory);
    }

    public SolarisPasswd(Pointer memory) {
        super(memory);
    }

    @Override
    public String getShell() {
        return SolarisPasswd.layout.pw_shell.get(this.memory);
    }

    @Override
    public String getLoginName() {
        return SolarisPasswd.layout.pw_name.get(this.memory);
    }

    @Override
    public long getUID() {
        return SolarisPasswd.layout.pw_uid.get(this.memory);
    }

    @Override
    public String getGECOS() {
        return SolarisPasswd.layout.pw_gecos.get(this.memory);
    }

    @Override
    public String getHome() {
        return SolarisPasswd.layout.pw_dir.get(this.memory);
    }

    @Override
    public String getPassword() {
        return SolarisPasswd.layout.pw_passwd.get(this.memory);
    }

    @Override
    public String getAccessClass() {
        return "unknown";
    }

    @Override
    public int getExpire() {
        return Integer.MAX_VALUE;
    }

    static final class Layout
    extends StructLayout {
        public final StructLayout.UTF8StringRef pw_gecos;
        public final StructLayout.UTF8StringRef pw_name = new StructLayout.UTF8StringRef();
        public final StructLayout.Pointer pw_comment;
        public final StructLayout.Signed32 pw_uid;
        public final StructLayout.UTF8StringRef pw_shell;
        public final StructLayout.UTF8StringRef pw_dir;
        public final StructLayout.Pointer pw_age;
        public final StructLayout.UTF8StringRef pw_passwd = new StructLayout.UTF8StringRef();
        public final StructLayout.Signed32 pw_gid;

        private Layout(Runtime runtime) {
            super(runtime);
            this.pw_uid = new StructLayout.Signed32();
            this.pw_gid = new StructLayout.Signed32();
            this.pw_age = new StructLayout.Pointer();
            this.pw_comment = new StructLayout.Pointer();
            this.pw_gecos = new StructLayout.UTF8StringRef();
            this.pw_dir = new StructLayout.UTF8StringRef();
            this.pw_shell = new StructLayout.UTF8StringRef();
        }
    }
}

