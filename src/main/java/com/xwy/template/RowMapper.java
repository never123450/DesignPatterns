package com.xwy.template;

import java.sql.ResultSet;

/**
 * @Description
 * @author xwy
 * @date 2021/3/15
 * @param  
 * @return 
 */
public interface RowMapper<T> {

    public T mapRow(ResultSet rs, int rowNum) throws Exception;

}
