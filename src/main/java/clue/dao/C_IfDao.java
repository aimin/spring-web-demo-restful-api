package clue.dao;

import clue.model.ClClue;
import clue.model.ClClueExample;

import java.util.List;

public interface C_IfDao<O,E>  {
    public List<O> selectByExample(E example);
    public long countByExample(E example);


}
