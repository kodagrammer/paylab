package dev.dyko.paylab.core.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "api_call_log")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ApiCallLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "api_name", nullable = false, length = 200)
    private String apiName;

    @Column(name = "http_method", nullable = false, length = 10)
    private String httpMethod;

    @Column(name = "request_uri", nullable = false, length = 500)
    private String requestUri;

    @Column(name = "http_status", nullable = false)
    private Integer httpStatus;

    @Column(name = "success", nullable = false)
    private Boolean success = true;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;
}