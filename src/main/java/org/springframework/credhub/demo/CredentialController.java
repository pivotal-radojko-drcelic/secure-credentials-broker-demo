package org.springframework.credhub.demo;

import io.vavr.collection.HashMap;
import io.vavr.collection.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
public class CredentialController {

    @Value("${app.configurations.username}")
    private String username;
    @Value("${app.configurations.password}")
    private String password;
    @Value("${app.configurations.url}")
    private String url;

    @GetMapping(path = "/test")
    public DemoResults testCredentials() {
        DemoResults results = new DemoResults();
        DemoResults.saveResults(results, "sucessfully retrived credentials: ",
                HashMap.ofEntries(
                        Map.entry("username", username),
                        Map.entry("password", password),
                        Map.entry("url", url)).toJavaMap());

        return results;
    }
}
