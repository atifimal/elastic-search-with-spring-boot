package com.atifimal.basic.elasticsearch.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

@Document(indexName = "employee")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    private Integer id;
    private String first_name;
    private String last_name;
    private String email;
    private String gender;
    private String ip_address;
    private LocalDate creation_date;
    private String department;
    private Integer salary;
    private BigDecimal performance;
    private Boolean active;
}
