package clue.services.push;

import clue.dao.ClUtilDao;
import clue.model.ClClue;
import clue.model.ClUtil;
import clue.model.ClUtilExample;
import clue.services.ClueSrv;
import org.joda.time.DateTime;
import org.springframework.boot.autoconfigure.cassandra.ClusterBuilderCustomizer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


public abstract class BasePusher {

    /**
     * 检查重复
     * @param clClue
     * @return
     */
    public abstract boolean CheckDuplication(ClClue clClue);

    /**
     * 执行推送
     * @param clClue
     */
    public abstract void Push(ClClue clClue);


}



