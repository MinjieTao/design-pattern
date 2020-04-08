package org.example.pipeline.sample;

import org.example.pipeline.Valve;

/**
 * @author minjie
 *
 */
public class SampleValve1 extends Valve<SampleContext> {
    @Override
    public void invoke(final SampleContext context) {
        context.setOutput(context.getInput() * 10);
        this.invokeNext(context);
    }
}
