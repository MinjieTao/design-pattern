package org.example.pipeline.sample;

import org.example.pipeline.Pipeline;
import org.example.pipeline.Step;

import java.util.Arrays;
import java.util.List;

/**
 * @author minjie
 *
 */
public class SamplePipeline extends Pipeline<SampleContext> {

    @Override
    protected List<Step<SampleContext>> initSteps() {
        return Arrays.asList(
                new SampleStep1(),
                new SampleStep2()
        );
    }

    @Override
    protected void beforeInvoke(SampleContext context) {
        System.out.println("SamplePipeline.beforeInvoke");
        System.out.println("context = " + context);
    }

    @Override
    protected void afterInvoke(SampleContext context) {
        System.out.println("SamplePipeline.afterInvoke");
        System.out.println("context = " + context);
    }
}
