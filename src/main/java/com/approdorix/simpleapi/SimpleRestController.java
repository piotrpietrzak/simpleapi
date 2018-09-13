package com.approdorix.simpleapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

    @GetMapping("/api/status")
    public Status status() {
        return new Status("Working", "OK");
    }

    private class Status {
        private String description;
        private String status;

        public Status() {
        }

        public Status(String description, String status) {
            this.description = description;
            this.status = status;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
