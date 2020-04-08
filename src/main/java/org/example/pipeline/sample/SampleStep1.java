package org.example.pipeline.sample;

import org.example.pipeline.Step;

/**
 * @author minjie
 *
 */
public class SampleStep1 implements Step<SampleContext> {
    @Override
    public void invoke(final SampleContext context) {
        context.setOutput(context.getInput() * 10);
    }
}
