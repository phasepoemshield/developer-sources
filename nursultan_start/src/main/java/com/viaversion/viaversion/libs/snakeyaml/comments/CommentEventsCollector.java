/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.snakeyaml.comments.CommentLine
 *  com.viaversion.viaversion.libs.snakeyaml.events.CommentEvent
 */
package com.viaversion.viaversion.libs.snakeyaml.comments;

import com.viaversion.viaversion.libs.snakeyaml.comments.CommentLine;
import com.viaversion.viaversion.libs.snakeyaml.comments.CommentType;
import com.viaversion.viaversion.libs.snakeyaml.events.CommentEvent;
import com.viaversion.viaversion.libs.snakeyaml.events.Event;
import com.viaversion.viaversion.libs.snakeyaml.parser.Parser;
import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public class CommentEventsCollector {
    private List<CommentLine> commentLineList;
    private final Queue<Event> eventSource;
    private final CommentType[] expectedCommentTypes;

    public List<CommentLine> consume() {
        try {
            List<CommentLine> list = this.commentLineList;
            return list;
        }
        finally {
            this.commentLineList = new ArrayList<CommentLine>();
        }
    }

    public CommentEventsCollector(final Parser parser, CommentType ... expectedCommentTypes) {
        this.eventSource = new AbstractQueue<Event>(){

            @Override
            public int size() {
                throw new UnsupportedOperationException();
            }

            @Override
            public Iterator<Event> iterator() {
                throw new UnsupportedOperationException();
            }

            @Override
            public Event peek() {
                return parser.peekEvent();
            }

            @Override
            public Event poll() {
                return parser.getEvent();
            }

            @Override
            public boolean offer(Event e) {
                throw new UnsupportedOperationException();
            }
        };
        this.expectedCommentTypes = expectedCommentTypes;
        this.commentLineList = new ArrayList<CommentLine>();
    }

    public CommentEventsCollector(Queue<Event> eventSource, CommentType ... expectedCommentTypes) {
        this.eventSource = eventSource;
        this.expectedCommentTypes = expectedCommentTypes;
        this.commentLineList = new ArrayList<CommentLine>();
    }

    public boolean isEmpty() {
        return this.commentLineList.isEmpty();
    }

    public Event collectEventsAndPoll(Event event) {
        Event nextEvent = this.collectEvents(event);
        return nextEvent != null ? nextEvent : this.eventSource.poll();
    }

    private boolean isEventExpected(Event event) {
        if (event == null || !event.is(Event.ID.Comment)) {
            return false;
        }
        CommentEvent commentEvent = (CommentEvent)event;
        for (CommentType type : this.expectedCommentTypes) {
            if (commentEvent.getCommentType() != type) continue;
            return true;
        }
        return false;
    }

    public Event collectEvents(Event event) {
        if (event != null) {
            if (this.isEventExpected(event)) {
                this.commentLineList.add(new CommentLine((CommentEvent)event));
            } else {
                return event;
            }
        }
        while (this.isEventExpected(this.eventSource.peek())) {
            this.commentLineList.add(new CommentLine((CommentEvent)this.eventSource.poll()));
        }
        return null;
    }

    public CommentEventsCollector collectEvents() {
        this.collectEvents(null);
        return this;
    }
}

