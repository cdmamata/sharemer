package sharemer.business.api.master.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import sharemer.business.api.master.po.MusicList;
import sharemer.business.api.master.utils.Page;

import java.util.List;

/**
 * Created by 18073 on 2017/5/28.
 */
@Mapper
public interface MusicListMapper {

    MusicList one(@Param("id") Integer id);

    MusicList getOneByWyId(@Param("wy_id") Integer wy_id);

    void insert(@Param("pojo") MusicList musicList);

    void update(@Param("pojo") MusicList musicList);

    void updateByWyId(@Param("pojo") MusicList musicList);

    List<MusicList> getAll(Page<MusicList> page);

}
