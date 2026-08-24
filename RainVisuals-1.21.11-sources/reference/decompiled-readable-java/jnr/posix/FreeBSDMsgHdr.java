/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;
import jnr.posix.BaseIovec;
import jnr.posix.BaseMsgHdr;
import jnr.posix.CmsgHdr;
import jnr.posix.FreeBSDCmsgHdr;
import jnr.posix.NativePOSIX;

class FreeBSDMsgHdr
extends BaseMsgHdr {
    private static final Layout layout = new Layout(Runtime.getSystemRuntime());

    @Override
    int getNameLen() {
        return (int)FreeBSDMsgHdr.layout.msg_namelen.get(this.memory);
    }

    @Override
    public void setFlags(int flags) {
        FreeBSDMsgHdr.layout.msg_flags.set(this.memory, flags);
    }

    @Override
    void setIovPointer(Pointer iov) {
        FreeBSDMsgHdr.layout.msg_iov.set(this.memory, iov);
    }

    @Override
    Pointer getControlPointer() {
        return FreeBSDMsgHdr.layout.msg_control.get(this.memory);
    }

    @Override
    void setNamePointer(Pointer name) {
        FreeBSDMsgHdr.layout.msg_name.set(this.memory, name);
    }

    @Override
    void setNameLen(int len) {
        FreeBSDMsgHdr.layout.msg_namelen.set(this.memory, len);
    }

    @Override
    public int getFlags() {
        return FreeBSDMsgHdr.layout.msg_flags.get(this.memory);
    }

    @Override
    void setControlPointer(Pointer control) {
        FreeBSDMsgHdr.layout.msg_control.set(this.memory, control);
    }

    @Override
    int getIovLen() {
        return FreeBSDMsgHdr.layout.msg_iovlen.get(this.memory);
    }

    protected FreeBSDMsgHdr(NativePOSIX posix) {
        super(posix, layout);
        this.setName(null);
    }

    @Override
    public int getControlLen() {
        return (int)FreeBSDMsgHdr.layout.msg_controllen.get(this.memory);
    }

    @Override
    void setIovLen(int len) {
        FreeBSDMsgHdr.layout.msg_iovlen.set(this.memory, len);
    }

    @Override
    Pointer getNamePointer() {
        return FreeBSDMsgHdr.layout.msg_name.get(this.memory);
    }

    @Override
    CmsgHdr allocateCmsgHdrInternal(NativePOSIX posix, Pointer pointer, int len) {
        if (len > 0) {
            return new FreeBSDCmsgHdr(posix, pointer, len);
        }
        return new FreeBSDCmsgHdr(posix, pointer);
    }

    @Override
    Pointer getIovPointer() {
        return FreeBSDMsgHdr.layout.msg_iov.get(this.memory);
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
        Pointer iovp = FreeBSDMsgHdr.layout.msg_iov.get(this.memory);
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
            buf.append(((FreeBSDCmsgHdr)controls[i]).toString("    "));
            if (i < controls.length - 1) {
                buf.append(",\n");
            } else {
                buf.append("\n");
            }
            ++var5_7;
        }
        buf.append("  ],\n");
        buf.append("  msg_controllen=").append(FreeBSDMsgHdr.layout.msg_controllen.get(this.memory)).append("\n");
        buf.append("  msg_iovlen=").append(this.getIovLen()).append(",\n");
        buf.append("  msg_flags=").append(this.getFlags()).append(",\n");
        buf.append("}");
        return var1_1.toString();
    }

    @Override
    void setControlLen(int len) {
        FreeBSDMsgHdr.layout.msg_controllen.set(this.memory, len);
    }

    public static class Layout
    extends StructLayout {
        public final StructLayout.Pointer msg_control;
        public final StructLayout.Signed32 msg_iovlen;
        public final StructLayout.Signed32 msg_flags;
        public final StructLayout.Pointer msg_iov;
        public final StructLayout.socklen_t msg_namelen;
        public final StructLayout.socklen_t msg_controllen;
        public final StructLayout.Pointer msg_name = new StructLayout.Pointer();

        protected Layout(Runtime runtime) {
            super(runtime);
            this.msg_namelen = new StructLayout.socklen_t();
            this.msg_iov = new StructLayout.Pointer();
            this.msg_iovlen = new StructLayout.Signed32();
            this.msg_control = new StructLayout.Pointer();
            this.msg_controllen = new StructLayout.socklen_t();
            this.msg_flags = new StructLayout.Signed32();
        }
    }
}

