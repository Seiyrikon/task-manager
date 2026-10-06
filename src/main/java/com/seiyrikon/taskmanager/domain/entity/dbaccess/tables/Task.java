package com.seiyrikon.taskmanager.domain.entity.dbaccess.tables;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@Data
@Entity
//@Cacheable
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "task", schema = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    @Column(name = "added_by")
    private String addedBy;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "added_at")
    private Timestamp addedAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    private String status;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) && Objects.equals(name, task.name) && Objects.equals(description, task.description) && Objects.equals(addedBy, task.addedBy) && Objects.equals(updatedBy, task.updatedBy) && Objects.equals(addedAt, task.addedAt) && Objects.equals(updatedAt, task.updatedAt) && Objects.equals(status, task.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, addedBy, updatedBy, addedAt, updatedAt, status);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", addedBy='" + addedBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", addedAt=" + addedAt +
                ", updatedAt=" + updatedAt +
                ", status='" + status + '\'' +
                '}';
    }
}
