package com.synesisit.courseManagement.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class AuditingConfig {
    // That's all here for now. Will add more auditing configurations later.
}
