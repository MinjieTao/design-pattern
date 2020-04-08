package org.example.pipeline;

/**
 * @author minjie
 *
 */
public abstract class Pipeline<T extends Context> {

    private Valve<T> first;

    public Pipeline() {
        this.first = initValve();
        assert this.first != null;
        assert !detectCycle(this.first);
    }

    private boolean detectCycle(Valve<T> valve) {
        Valve<T> walker = valve;
        Valve<T> runner = valve;
        while (runner != null && walker != null) {
            walker = walker.getNext();
            if (runner.getNext() == null) {
                return false;
            }
            runner = runner.getNext().getNext();
            if (walker == runner) {
                return true;
            }
        }
        return false;
    }

    protected abstract Valve<T> initValve();

    public void invoke(final T context) {
        this.first.invoke(context);
    }
}
