package org.example.pipeline.sample;

import org.example.pipeline.Pipeline;
import org.example.pipeline.Valve;

/**
 * @author minjie
 *
 */
public class SamplePipeline extends Pipeline<SampleContext> {

    @Override
    protected Valve<SampleContext> initValve() {
        Valve<SampleContext> first = new SampleValve0();
        Valve<SampleContext> second = new SampleValve1();
        Valve<SampleContext> third = new SampleValve2();
        first.setNext(second);
        second.setNext(third);
        return first;
    }


}
