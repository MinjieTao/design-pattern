package org.example.pipeline.sample;

import org.example.pipeline.Step;

/**
 * @author minjie
 *
 */
public class SampleStep2 implements Step<SampleContext> {
    @Override
    public void invoke(final SampleContext context) {
        context.setOutput(context.getOutput() + context.getInput());
    }
}