package cn.xxm.springcloud.dao;

import cn.xxm.springcloud.pojo.Brand;
import cn.xxm.springcloud.pojo.BrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandDao {
    int countByExample(BrandExample example);

    int deleteByExample(BrandExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Brand record);

    int insertSelective(Brand record);

    List<Brand> selectByExample(BrandExample example);

    Brand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Brand record, @Param("example") BrandExample example);

    int updateByExample(@Param("record") Brand record, @Param("example") BrandExample example);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);
}