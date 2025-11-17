package dev.dyko.paylab.core.service;

import dev.dyko.paylab.core.entity.ApiCallLog;
import dev.dyko.paylab.core.repository.ApiCallLogRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ApiCallLogService {
    private final ApiCallLogRepository repository;

    public List<ApiCallLog> getLatest10Logs() {
        return repository.findTop10ByOrderByCreatedAtDesc();
    }
}
