package com.seiyrikon.taskmanager.domain.entity.dbaccess.tables;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
@Table(name = "user", schema = "task")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "added_by")
    private String addedBy;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "added_at")
    private Timestamp addedAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(addedBy, user.addedBy) && Objects.equals(updatedBy, user.updatedBy) && Objects.equals(addedAt, user.addedAt) && Objects.equals(updatedAt, user.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, addedBy, updatedBy, addedAt, updatedAt);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", addedBy='" + addedBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", addedAt=" + addedAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
