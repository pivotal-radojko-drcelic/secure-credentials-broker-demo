package org.springframework.credhub.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class DemoResults extends ArrayList<Map<String, Object>> {

    public static void saveResults(DemoResults results, String message, Object details) {
        results.add(Collections.singletonMap(message, details));
    }
}
