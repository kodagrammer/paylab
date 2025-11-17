package dev.dyko.paylab.core.repository;

import dev.dyko.paylab.core.entity.ApiCallLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApiCallLogRepository extends JpaRepository<ApiCallLog, Long> {
    List<ApiCallLog> findTop10ByOrderByCreatedAtDesc();
}
