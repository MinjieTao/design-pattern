package org.example.pipeline;

import java.util.List;

/**
 * @author minjie
 *
 */
public abstract class Pipeline<T extends Context> {

    private List<Step<T>> steps;

    public Pipeline() {
        this.steps = initSteps();
    }

    protected abstract List<Step<T>> initSteps();

    protected void beforeInvoke(T context) {
    }

    public void invoke(final T context) {
        try {
            beforeInvoke(context);
            steps.forEach(step -> step.invoke(context));
        } finally {
            afterInvoke(context);
        }
    }

    protected void afterInvoke(T context) {
    }
}
