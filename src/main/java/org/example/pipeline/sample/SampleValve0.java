package org.example.pipeline.sample;

import org.example.pipeline.Valve;

/**
 * @author minjie
 *
 */
public class SampleValve0 extends Valve<SampleContext> {
    @Override
    public void invoke(final SampleContext context) {
        try {
            System.out.println("context = " + context);
            this.invokeNext(context);
        } finally {
            System.out.println("context = " + context);
        }
    }
}
