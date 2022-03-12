package br.com.lucolimac.ministerialscaleapi.models;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public final class Scale {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @NotNull
    @JsonFormat(pattern = "HH:mm")
    private LocalTime hour;
    @NotNull
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;
    @NotNull
    private String minister;
    @NotNull
    private String place;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Scale scale = (Scale) o;
        return id != null && Objects.equals(id, scale.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
