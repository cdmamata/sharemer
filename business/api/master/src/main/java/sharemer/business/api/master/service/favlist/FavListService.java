package sharemer.business.api.master.service.favlist;

import sharemer.business.api.master.po.FavList;
import sharemer.business.api.master.utils.Page;
import sharemer.business.api.master.vo.FavListInfoVo;

import java.util.List;

/**
 * Created by 18073 on 2017/9/30.
 */
public interface FavListService {

    void addFavList(FavList favList);

    FavList getFavListById(Integer fid);

    List<FavList> getFavsByUserId(Integer userId, boolean isSelf);

    void addAllFavListToMedia(Integer oid, Integer otype, List<Integer> favIds);

    boolean isFaved(Integer otype, Integer oid, Integer userId);

    Page<FavList> getFavsByTag(Integer tagId, Integer page, Integer pageSize);

    FavListInfoVo getFavListInfo(Integer favId);

    Page getMusicsByFavId(Integer favId, Integer pageNo, Integer pageSize);

    Page getVideosByFavId(Integer favId, Integer pageNo, Integer pageSize);

    Page getArchivesByFavId(Integer favId, Integer pageNo, Integer pageSize);

    List<FavList> getFavsByKey(String key, Integer sort, Integer cp);

}
