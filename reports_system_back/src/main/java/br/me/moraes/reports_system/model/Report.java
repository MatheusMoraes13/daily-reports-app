package br.me.moraes.reports_system.model;

import br.me.moraes.reports_system.model.enums.ReportType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    ReportType reportType;
    String name;
    String content;
}
