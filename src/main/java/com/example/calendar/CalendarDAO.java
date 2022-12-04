package com.example.calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CalendarDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    // 일정 추가
    public int insertCalendar(CalendarVO vo) {
        System.out.println("===> JDBCTemplate로 insert() 기능 처리");
        String sql = "insert into CALENDAR (name, writer, organization, start) values ("
                + "'" + vo.getName() + "', "
                + "'" + vo.getWriter() + "', "
                + "'" + vo.getOrganization() + "', "
                + "'" + vo.getStart() + "')";
        return jdbcTemplate.update(sql);
    }

    // 일정 삭제
    public int deleteCalendar(int seq) {
        System.out.println("===> JDBCTemplate로 delete() 기능 처리");
        String sql = "delete from CALENDAR where seq = " + seq;
        return jdbcTemplate.update(sql);
    }

    public int updateCalendar(CalendarVO vo) {
        System.out.println("===> JDBCTemplate로 update() 기능 처리");
        String sql = "update CALENDAR set name='" + vo.getName() + "', "
                + " writer='" + vo.getWriter() + "', "
                + " organization='" + vo.getOrganization() + "', "
                + " start='" + vo.getStart()
                + "' where seq=" + vo.getSeq();
        return jdbcTemplate.update(sql);
    }

    class CalendarRowMapper implements RowMapper<CalendarVO> {
        @Override
        public CalendarVO mapRow(ResultSet rs, int rowNum) throws SQLException {
            CalendarVO vo = new CalendarVO();
            vo.setSeq(rs.getInt("seq"));
            vo.setName(rs.getString("name"));
            vo.setWriter(rs.getString("writer"));
            vo.setOrganization(rs.getString("organization"));
            vo.setStart(rs.getDate("start"));
            return vo;
        }
    }
    public CalendarVO getCalendar(int seq) {
        String sql = "select * from CALENDAR where seq=" + seq;
        return jdbcTemplate.queryForObject(sql, new CalendarRowMapper());
    }

    public List<CalendarVO> getCalendarList() {
        String sql = "select * from CALENDAR order by start desc";
        return jdbcTemplate.query(sql, new CalendarRowMapper());
    }
}
