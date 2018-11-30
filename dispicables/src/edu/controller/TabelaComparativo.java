package edu.controller;

import edu.controller.dto.ComparativoDTO;
import edu.view.lecomparativos.TelaComparativo;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.List;

public class TabelaComparativo implements TableModel {
    public List<ComparativoDTO> comparativoDTO;

    public TabelaComparativo(List<ComparativoDTO> comparativoDTO) {
        this.comparativoDTO = comparativoDTO;
    }

    @Override
    public int getRowCount() {
        return comparativoDTO.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0: return "Nome do deputado";
            case 1: return "Votos iguais";
            case 2: return "Votos totais";
        }
        return "";
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0: return String.class;
            case 1: return Integer.class;
            case 2: return Integer.class;
        }
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ComparativoDTO c = comparativoDTO.get(rowIndex);
        switch (columnIndex) {
            case 0: return c.getNomeDeputado();
            case 1: return c.getQtdVotosIguais();
            case 2: return c.getQtdVotosTotais();
        }
        return "";
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
}
