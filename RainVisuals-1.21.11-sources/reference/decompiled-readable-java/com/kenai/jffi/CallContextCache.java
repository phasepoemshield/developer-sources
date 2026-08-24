/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

import com.kenai.jffi.CallContext;
import com.kenai.jffi.CallingConvention;
import com.kenai.jffi.Type;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CallContextCache {
    private final ReferenceQueue<CallContext> contextReferenceQueue;
    private final Map<Signature, CallContextRef> contextCache = new ConcurrentHashMap<Signature, CallContextRef>();

    public final CallContext getCallContext(Type returnType, int fixedParamCount, Type[] parameterTypes, CallingConvention convention, boolean saveErrno) {
        return this.getCallContext(returnType, fixedParamCount, parameterTypes, convention, saveErrno, false);
    }

    public final CallContext getCallContext(Type returnType, Type[] parameterTypes, CallingConvention convention, boolean saveErrno) {
        return this.getCallContext(returnType, parameterTypes, convention, saveErrno, false);
    }

    private CallContextCache() {
        this.contextReferenceQueue = new ReferenceQueue();
    }

    public static CallContextCache getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public final CallContext getCallContext(Type returnType, Type[] parameterTypes, CallingConvention convention) {
        return this.getCallContext(returnType, parameterTypes, convention, true, false);
    }

    public final CallContext getCallContext(Type returnType, Type[] parameterTypes, CallingConvention convention, boolean saveErrno, boolean faultProtect) {
        return this.getCallContext(returnType, parameterTypes.length, parameterTypes, convention, saveErrno, faultProtect);
    }

    /*
     * WARNING - void declaration
     */
    public final CallContext getCallContext(Type returnType, int fixedParamCount, Type[] parameterTypes, CallingConvention convention, boolean saveErrno, boolean faultProtect) {
        void var9_9;
        CallContext ctx;
        Signature signature = new Signature(returnType, parameterTypes, convention, saveErrno, faultProtect);
        CallContextRef ref = this.contextCache.get(signature);
        if (ref != null && (ctx = (CallContext)ref.get()) != null) {
            return ctx;
        }
        while ((ref = (CallContextRef)this.contextReferenceQueue.poll()) != null) {
            this.contextCache.remove(ref.signature);
        }
        ctx = new CallContext(returnType, fixedParamCount, (Type[])parameterTypes.clone(), convention, saveErrno, faultProtect);
        this.contextCache.put(signature, new CallContextRef(signature, ctx, this.contextReferenceQueue));
        return var9_9;
    }

    private static final class Signature {
        private final CallingConvention convention;
        private int hashCode;
        private final Type returnType;
        private final boolean faultProtect;
        private final Type[] parameterTypes;
        private final boolean saveErrno;

        /*
         * WARNING - void declaration
         */
        public boolean equals(Object obj) {
            block16: {
                Signature other;
                block15: {
                    block14: {
                        block13: {
                            block12: {
                                if (obj == null) break block12;
                                if (this.getClass() == obj.getClass()) break block13;
                            }
                            return false;
                        }
                        other = (Signature)obj;
                        if (this.convention != other.convention) break block14;
                        if (this.saveErrno != other.saveErrno) break block14;
                        if (this.faultProtect == other.faultProtect) break block15;
                    }
                    return false;
                }
                if (this.returnType != other.returnType) {
                    if (!this.returnType.equals(other.returnType)) {
                        return false;
                    }
                }
                if (this.parameterTypes.length != other.parameterTypes.length) break block16;
                int i = 0;
                while (i < this.parameterTypes.length) {
                    void var3_3;
                    block17: {
                        block18: {
                            if (this.parameterTypes[i] == other.parameterTypes[i]) break block17;
                            if (this.parameterTypes[i] == null) break block18;
                            if (this.parameterTypes[i].equals(other.parameterTypes[var3_3])) break block17;
                        }
                        return false;
                    }
                    ++var3_3;
                }
                return true;
            }
            return false;
        }

        public Signature(Type returnType, Type[] parameterTypes, CallingConvention convention, boolean saveErrno, boolean faultProtect) {
            block3: {
                block2: {
                    this.hashCode = 0;
                    if (returnType == null) break block2;
                    if (parameterTypes != null) break block3;
                }
                throw new NullPointerException("null return type or parameter types array");
            }
            this.returnType = returnType;
            this.parameterTypes = parameterTypes;
            this.convention = convention;
            this.saveErrno = saveErrno;
            this.faultProtect = faultProtect;
        }

        public int hashCode() {
            return this.hashCode != 0 ? this.hashCode : (this.hashCode = this.calculateHashCode());
        }

        /*
         * WARNING - void declaration
         */
        private final int calculateHashCode() {
            int hash = 7;
            hash = 53 * hash + (this.returnType != null ? this.returnType.hashCode() : 0);
            int paramHash = 1;
            int i = 0;
            while (i < this.parameterTypes.length) {
                void var3_3;
                paramHash = 31 * paramHash + this.parameterTypes[i].hashCode();
                ++var3_3;
            }
            hash = 53 * hash + paramHash;
            hash = 53 * hash + this.convention.hashCode();
            hash = 53 * hash + (this.saveErrno ? 1 : 0);
            int n = 53 * hash + (this.faultProtect ? 1 : 0);
            return n;
        }
    }

    private static final class CallContextRef
    extends SoftReference<CallContext> {
        final Signature signature;

        public CallContextRef(Signature signature, CallContext ctx, ReferenceQueue<CallContext> queue) {
            super(ctx, queue);
            this.signature = signature;
        }
    }

    private static final class SingletonHolder {
        static final CallContextCache INSTANCE = new CallContextCache();

        private SingletonHolder() {
        }
    }
}

