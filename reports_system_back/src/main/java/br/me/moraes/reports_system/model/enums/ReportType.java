package br.me.moraes.reports_system.model.enums;


import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ReportType {

    ROMPIMENTO(),
    ATIVIDADE_PROGRAMADA(),
    ATIVIDADE_PENDENTE();

}
