package org.example.pipeline;

/**
 * @author minjie
 *
 */
public interface Step<T extends Context> {
    void invoke(T context);
}
