package com.app.coffee.entity;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import com.app.coffee.audit.Auditable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@Entity(name="branch")
public class Branch extends Auditable<String>{
    @Id
    @Column(nullable = false, updatable = false)
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator = "uuid")
    private UUID id;
    
    @Column(nullable = false, unique = true, length = 100)
    private String name;

    @Column(nullable = false)
    private String address;
    
    @Column
    private String description;
}
