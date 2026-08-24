/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;
import jnr.posix.BaseIovec;
import jnr.posix.CmsgHdr;
import jnr.posix.MsgHdr;
import jnr.posix.NativePOSIX;

public abstract class BaseMsgHdr
implements MsgHdr {
    protected final NativePOSIX posix;
    protected final Pointer memory;

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuffer[] getIov() {
        void var2_2;
        int len = this.getIovLen();
        ByteBuffer[] buffers = new ByteBuffer[len];
        Pointer iov = this.getIovPointer();
        for (int i = 0; i < len; ++i) {
            Pointer eachPtr = iov.slice(BaseIovec.layout.size() * i);
            BaseIovec eachIov = new BaseIovec(this.posix, eachPtr);
            buffers[i] = eachIov.get();
        }
        return var2_2;
    }

    abstract CmsgHdr allocateCmsgHdrInternal(NativePOSIX var1, Pointer var2, int var3);

    abstract void setControlLen(int var1);

    /*
     * WARNING - void declaration
     */
    @Override
    public void setName(String name) {
        void var2_2;
        if (name == null) {
            this.setNamePointer(null);
            this.setNameLen(0);
            return;
        }
        byte[] nameBytes = name.getBytes(Charset.forName("US-ASCII"));
        Pointer p = Runtime.getSystemRuntime().getMemoryManager().allocateTemporary(nameBytes.length, true);
        p.put(0L, nameBytes, 0, nameBytes.length);
        this.setNamePointer(p);
        this.setNameLen(((void)var2_2).length);
    }

    abstract Pointer getIovPointer();

    @Override
    public CmsgHdr[] getControls() {
        CmsgHdr each;
        int len = this.getControlLen();
        if (len == 0) {
            return new CmsgHdr[0];
        }
        ArrayList<CmsgHdr> control = new ArrayList<CmsgHdr>();
        Pointer controlPtr = this.getControlPointer();
        for (int offset = 0; offset < len; offset += this.posix.socketMacros().CMSG_SPACE(each.getLen())) {
            each = this.allocateCmsgHdrInternal(this.posix, controlPtr.slice(offset), -1);
            control.add(each);
        }
        return control.toArray(new CmsgHdr[control.size()]);
    }

    @Override
    public CmsgHdr allocateControl(int dataLength) {
        int[] nArray = new int[1];
        nArray[0] = dataLength;
        CmsgHdr[] controls = this.allocateControls(nArray);
        return controls[0];
    }

    abstract void setNameLen(int var1);

    abstract void setIovLen(int var1);

    abstract int getNameLen();

    abstract Pointer getNamePointer();

    /*
     * WARNING - void declaration
     */
    @Override
    public CmsgHdr[] allocateControls(int[] dataLengths) {
        void var2_2;
        void var3_3;
        CmsgHdr[] cmsgs = new CmsgHdr[dataLengths.length];
        int totalSize = 0;
        for (int i = 0; i < dataLengths.length; ++i) {
            totalSize += this.posix.socketMacros().CMSG_SPACE(dataLengths[i]);
        }
        Pointer ptr = this.posix.getRuntime().getMemoryManager().allocateDirect(totalSize);
        int offset = 0;
        int i = 0;
        while (i < dataLengths.length) {
            void var6_7;
            void var7_8;
            int eachSpace = this.posix.socketMacros().CMSG_SPACE(dataLengths[i]);
            int len = this.posix.socketMacros().CMSG_LEN(dataLengths[i]);
            CmsgHdr each = this.allocateCmsgHdrInternal(this.posix, ptr.slice(offset, eachSpace), len);
            cmsgs[i] = each;
            offset += var7_8;
            ++var6_7;
        }
        this.setControlPointer(ptr);
        this.setControlLen((int)var3_3);
        return var2_2;
    }

    @Override
    public String getName() {
        Pointer ptr = this.getNamePointer();
        if (ptr == null) {
            return null;
        }
        return ptr.getString(0L, this.getNameLen(), Charset.forName("US-ASCII"));
    }

    abstract int getIovLen();

    protected BaseMsgHdr(NativePOSIX posix, StructLayout layout) {
        this.posix = posix;
        this.memory = posix.getRuntime().getMemoryManager().allocateTemporary(layout.size(), true);
    }

    abstract void setIovPointer(Pointer var1);

    abstract void setNamePointer(Pointer var1);

    abstract void setControlPointer(Pointer var1);

    abstract Pointer getControlPointer();

    /*
     * WARNING - void declaration
     */
    @Override
    public void setIov(ByteBuffer[] buffers) {
        void var1_1;
        Pointer iov = Runtime.getSystemRuntime().getMemoryManager().allocateDirect(BaseIovec.layout.size() * buffers.length);
        int i = 0;
        while (i < buffers.length) {
            void var3_3;
            Pointer eachIovecPtr = iov.slice(BaseIovec.layout.size() * i);
            BaseIovec eachIovec = new BaseIovec(this.posix, eachIovecPtr);
            eachIovec.set(buffers[i]);
            ++var3_3;
        }
        this.setIovPointer(iov);
        this.setIovLen(((void)var1_1).length);
    }
}

