package org.example.pipeline.sample;

import org.example.pipeline.Valve;

/**
 * @author minjie
 *
 */
public class SampleValve2 extends Valve<SampleContext> {
    @Override
    public void invoke(final SampleContext context) {
        context.setOutput(context.getOutput() + context.getInput());
        this.invokeNext(context);
    }
}
