package com.Liv2Train.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainingCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "CenterName is mandatory")
    @Size(max = 40, message = "CenterName must be less than 40 characters")
    private String centerName;

    @NotBlank(message = "CenterCode is mandatory")
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "CenterCode must be exactly 12 alphanumeric characters")
    private String centerCode;

    @Embedded
    private Address address;

    @Positive(message = "Student Capacity should be positive")
    private int studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;

    @Column(nullable = false, updatable = false)
    private long createdOn;

    @Email(message = "Invalid email format")
    private String contactEmail;

    @NotBlank(message = "ContactPhone is mandatory")
    @Pattern(regexp = "^\\d{10}$", message = "ContactPhone must be exactly 10 digits")
    private String contactPhone;

    @PrePersist
    public void prePersist() {
        this.createdOn = System.currentTimeMillis();
    }

  
}

