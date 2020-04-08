package org.example.pipeline.sample;

import lombok.Data;
import org.example.pipeline.Context;

/**
 * @author minjie
 *
 */
@Data
public class SampleContext implements Context {
    private int input;
    private int output;
}
