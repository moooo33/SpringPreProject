package com.example.calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarServiceImpl implements CalendarService{
    @Autowired
    CalendarDAO calendarDAO;

    @Override
    public int insertCalendar(CalendarVO vo) {
        return calendarDAO.insertCalendar(vo);
    }

    @Override
    public int deleteCalendar(int seq) {
        return calendarDAO.deleteCalendar(seq);
    }

    @Override
    public int updateCalendar(CalendarVO vo) {
        return calendarDAO.updateCalendar(vo);
    }

    @Override
    public CalendarVO getCalendar(int seq) {
        return calendarDAO.getCalendar(seq);
    }

    @Override
    public List<CalendarVO> getCalendarList() {
        return calendarDAO.getCalendarList();
    }
}
