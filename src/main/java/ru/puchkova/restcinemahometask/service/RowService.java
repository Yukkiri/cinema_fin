package ru.puchkova.restcinemahometask.service;

import ru.puchkova.restcinemahometask.data.entity.RowEntity;

import java.util.List;

public interface RowService {

    List<RowEntity> getAllRow();

    RowEntity addRow(RowEntity row);

}
