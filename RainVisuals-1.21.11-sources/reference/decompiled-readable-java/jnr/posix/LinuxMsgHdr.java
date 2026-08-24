/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import java.util.ArrayList;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;
import jnr.posix.BaseIovec;
import jnr.posix.BaseMsgHdr;
import jnr.posix.CmsgHdr;
import jnr.posix.LinuxCmsgHdr;
import jnr.posix.LinuxSocketMacros;
import jnr.posix.NativePOSIX;

class LinuxMsgHdr
extends BaseMsgHdr {
    private static final Layout layout = new Layout(Runtime.getSystemRuntime());

    @Override
    void setControlLen(int len) {
        LinuxMsgHdr.layout.msg_controllen.set(this.memory, len);
    }

    @Override
    Pointer getControlPointer() {
        return LinuxMsgHdr.layout.msg_control.get(this.memory);
    }

    @Override
    public CmsgHdr[] getControls() {
        CmsgHdr each;
        int len = this.getControlLen();
        if (len == 0) {
            return new CmsgHdr[0];
        }
        ArrayList<CmsgHdr> control = new ArrayList<CmsgHdr>();
        Pointer controlPtr = this.getControlPointer();
        for (int offset = 0; offset < len; offset += LinuxSocketMacros.INSTANCE.CMSG_ALIGN(each.getLen())) {
            each = this.allocateCmsgHdrInternal(this.posix, controlPtr.slice(offset), -1);
            control.add(each);
        }
        return control.toArray(new CmsgHdr[control.size()]);
    }

    @Override
    CmsgHdr allocateCmsgHdrInternal(NativePOSIX posix, Pointer pointer, int len) {
        if (len > 0) {
            return new LinuxCmsgHdr(posix, pointer, len);
        }
        return new LinuxCmsgHdr(posix, pointer);
    }

    @Override
    void setNamePointer(Pointer name) {
        LinuxMsgHdr.layout.msg_name.set(this.memory, name);
    }

    @Override
    public int getControlLen() {
        return (int)LinuxMsgHdr.layout.msg_controllen.get(this.memory);
    }

    @Override
    Pointer getIovPointer() {
        return LinuxMsgHdr.layout.msg_iov.get(this.memory);
    }

    @Override
    Pointer getNamePointer() {
        return LinuxMsgHdr.layout.msg_name.get(this.memory);
    }

    @Override
    public int getFlags() {
        return LinuxMsgHdr.layout.msg_flags.get(this.memory);
    }

    @Override
    int getNameLen() {
        return (int)LinuxMsgHdr.layout.msg_namelen.get(this.memory);
    }

    @Override
    void setIovPointer(Pointer iov) {
        LinuxMsgHdr.layout.msg_iov.set(this.memory, iov);
    }

    /*
     * WARNING - void declaration
     */
    public String toString() {
        void var1_1;
        StringBuffer buf = new StringBuffer();
        buf.append("msghdr {\n");
        buf.append("  msg_name=").append(this.getName()).append(",\n");
        buf.append("  msg_namelen=").append(this.getNameLen()).append(",\n");
        buf.append("  msg_iov=[\n");
        Pointer iovp = LinuxMsgHdr.layout.msg_iov.get(this.memory);
        int numIov = this.getIovLen();
        for (int i = 0; i < numIov; ++i) {
            Pointer eachp = iovp.slice(i * BaseIovec.layout.size());
            buf.append(new BaseIovec(this.posix, eachp).toString("    "));
            if (i < numIov + -1) {
                buf.append(",\n");
                continue;
            }
            buf.append("\n");
        }
        buf.append("  ],\n");
        buf.append("  msg_control=[\n");
        CmsgHdr[] controls = this.getControls();
        int i = 0;
        while (i < controls.length) {
            void var5_7;
            buf.append(((LinuxCmsgHdr)controls[i]).toString("    "));
            if (i < controls.length - 1) {
                buf.append(",\n");
            } else {
                buf.append("\n");
            }
            ++var5_7;
        }
        buf.append("  ],\n");
        buf.append("  msg_controllen=").append(LinuxMsgHdr.layout.msg_controllen.get(this.memory)).append("\n");
        buf.append("  msg_iovlen=").append(this.getIovLen()).append(",\n");
        buf.append("  msg_flags=").append(this.getFlags()).append(",\n");
        buf.append("}");
        return var1_1.toString();
    }

    @Override
    void setControlPointer(Pointer control) {
        LinuxMsgHdr.layout.msg_control.set(this.memory, control);
    }

    @Override
    int getIovLen() {
        return (int)LinuxMsgHdr.layout.msg_iovlen.get(this.memory);
    }

    @Override
    public void setFlags(int flags) {
        LinuxMsgHdr.layout.msg_flags.set(this.memory, flags);
    }

    @Override
    void setIovLen(int len) {
        LinuxMsgHdr.layout.msg_iovlen.set(this.memory, len);
    }

    protected LinuxMsgHdr(NativePOSIX posix) {
        super(posix, layout);
        this.setName(null);
    }

    @Override
    void setNameLen(int len) {
        LinuxMsgHdr.layout.msg_namelen.set(this.memory, len);
    }

    public static class Layout
    extends StructLayout {
        public final StructLayout.Pointer msg_control;
        public final StructLayout.size_t msg_iovlen;
        public final StructLayout.Pointer msg_name = new StructLayout.Pointer();
        public final StructLayout.Pointer msg_iov;
        public final StructLayout.socklen_t msg_namelen = new StructLayout.socklen_t();
        public final StructLayout.Signed32 msg_flags;
        public final StructLayout.size_t msg_controllen;

        protected Layout(Runtime runtime) {
            super(runtime);
            this.msg_iov = new StructLayout.Pointer();
            this.msg_iovlen = new StructLayout.size_t();
            this.msg_control = new StructLayout.Pointer();
            this.msg_controllen = new StructLayout.size_t();
            this.msg_flags = new StructLayout.Signed32();
        }
    }
}

