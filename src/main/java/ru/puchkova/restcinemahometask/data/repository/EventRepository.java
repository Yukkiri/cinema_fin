package ru.puchkova.restcinemahometask.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.puchkova.restcinemahometask.data.entity.EventEntity;

@Repository
public interface EventRepository extends JpaRepository<EventEntity, Long> {
}
