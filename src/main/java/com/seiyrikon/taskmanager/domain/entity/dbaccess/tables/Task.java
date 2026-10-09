package com.seiyrikon.taskmanager.domain.entity.dbaccess.tables;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
//@Cacheable
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "task",
        schema = "task",
        indexes = @Index(name = "idx_task_user_id", columnList = "user_id"))
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ToString.Include
    private Long id;

    private String name;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ToString.Include
    @Column(name = "added_by")
    private String addedBy;

    @ToString.Include
    @Column(name = "updated_by")
    private String updatedBy;

    @ToString.Include
    @Column(name = "added_at")
    private LocalDateTime addedAt;

    @ToString.Include
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    private String status;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
