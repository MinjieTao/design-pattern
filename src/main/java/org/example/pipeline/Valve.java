package org.example.pipeline;

import lombok.Getter;
import lombok.Setter;

/**
 * @author minjie
 *
 */
public abstract class Valve<T extends Context> {
    @Setter
    @Getter
    private Valve<T> next;

    protected void invokeNext(T context) {
        if (next != null) {
            next.invoke(context);
        }
    }

    public abstract void invoke(T context);
}
