/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import jnr.posix.POSIXHandler;

public class ExecIt {
    protected final POSIXHandler handler;

    public int runAndWait(OutputStream output, String ... args2) throws InterruptedException, IOException {
        return this.runAndWait(output, this.handler.getErrorStream(), args2);
    }

    public int runAndWait(String ... args2) throws InterruptedException, IOException {
        return this.runAndWait((OutputStream)this.handler.getOutputStream(), args2);
    }

    public ExecIt(POSIXHandler handler) {
        this.handler = handler;
    }

    public int runAndWait(OutputStream output, OutputStream error, String ... args2) throws InterruptedException, IOException {
        Process process = this.run(args2);
        this.handleStreams(process, this.handler.getInputStream(), output, error);
        return process.waitFor();
    }

    public Process run(String ... args2) throws IOException {
        File cwd = this.handler.getCurrentWorkingDirectory();
        return Runtime.getRuntime().exec(args2, this.handler.getEnv(), cwd);
    }

    private void handleStreams(Process p, InputStream in, OutputStream out, OutputStream err) throws IOException {
        InputStream pOut = p.getInputStream();
        InputStream pErr = p.getErrorStream();
        OutputStream pIn = p.getOutputStream();
        StreamPumper t1 = new StreamPumper(pOut, out, false);
        StreamPumper t2 = new StreamPumper(pErr, err, false);
        StreamPumper t3 = new StreamPumper(in, pIn, true);
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        try {
            t2.join();
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        t3.quit();
        try {
            err.flush();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        try {
            out.flush();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        try {
            pIn.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        try {
            pOut.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        try {
            pErr.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    private static class StreamPumper
    extends Thread {
        private OutputStream out;
        private volatile boolean quit;
        private final Object waitLock = new Object();
        private boolean onlyIfAvailable;
        private InputStream in;

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        public void quit() {
            this.quit = true;
            Object object = this.waitLock;
            synchronized (object) {
                this.waitLock.notify();
            }
        }

        StreamPumper(InputStream in, OutputStream out, boolean avail) {
            this.in = in;
            this.out = out;
            this.onlyIfAvailable = avail;
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void run() {
            byte[] buf = new byte[1024];
            boolean hasReadSomething = false;
            try {
                while (!this.quit) {
                    if (this.onlyIfAvailable) {
                        if (!hasReadSomething) {
                            if (this.in.available() == 0) {
                                Object object = this.waitLock;
                                synchronized (object) {
                                    this.waitLock.wait(10L);
                                    continue;
                                }
                            }
                            hasReadSomething = true;
                        }
                    }
                    int numRead = this.in.read(buf);
                    if (numRead == -1) {
                        break;
                    }
                    this.out.write(buf, 0, numRead);
                }
            }
            catch (Exception exception) {
            }
            finally {
                if (this.onlyIfAvailable) {
                    try {
                        this.out.close();
                    }
                    catch (IOException iOException) {}
                }
            }
        }
    }
}

