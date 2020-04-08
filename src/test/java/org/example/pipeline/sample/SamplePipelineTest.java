package org.example.pipeline.sample;

import org.junit.Test;

/**
 * @author minjie
 *
 */
public class SamplePipelineTest {

    @Test
    public void test() {
        SamplePipeline samplePipeline = new SamplePipeline();
        SampleContext context = new SampleContext();
        context.setInput(1);

        samplePipeline.invoke(context);
    }
}