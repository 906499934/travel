package com.hand.travel.dao.impl;

import com.hand.travel.dao.RouteImgDao;
import com.hand.travel.domain.RouteImg;
import com.hand.travel.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @Author: Admin-han
 * @DateTime: 2020/4/30 17:29
 */
public class RouteImgDaoImpl implements RouteImgDao {
    private final JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     * 根据route对象中的id查询图片
     *
     * @param rid
     * @return
     */
    @Override
    public List<RouteImg> findByRid(int rid) {
        String sql = "select * from tab_route_img where rid = ?";
        return template.query(sql, new BeanPropertyRowMapper<RouteImg>(RouteImg.class), rid);
    }
}
