package com.serviceexchange.repository;

import com.serviceexchange.domain.Ban;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BanRepository extends JpaRepository<Ban, UUID> {
}
