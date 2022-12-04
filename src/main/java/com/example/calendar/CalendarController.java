package com.example.calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="/calendar")
public class CalendarController {
    @Autowired
    CalendarServiceImpl calendarService;

    @RequestMapping(value="/list", method = RequestMethod.GET)
    public String calendarlist(Model model) {
        model.addAttribute("list",calendarService.getCalendarList());
        return "list";
    }

    @RequestMapping(value="/add", method = RequestMethod.GET)
    public String addPost() {
        return "addpostform";
    }

    @RequestMapping(value = "/addok", method = RequestMethod.POST)
    public String addPostOK(CalendarVO vo) {
        if(calendarService.insertCalendar(vo) == 0) System.out.println("데이터 추가 실패");
        else System.out.println("데이터 추가 성공 !!");
        return "redirect:list";
    }

    @RequestMapping(value = "/editform/{id}", method = RequestMethod.GET)
    public String editPost(@PathVariable("id") int id, Model model) {
        CalendarVO calendarVO = calendarService.getCalendar(id);
        model.addAttribute("u", calendarVO);
        return "editform";
    }

    @RequestMapping(value = "/editok", method = RequestMethod.POST)
    public String editPostOK(CalendarVO vo) {
        if(calendarService.updateCalendar(vo) == 0) System.out.println("데이터 수정 실패");
        else System.out.println("데이터 수정 성공 !!");
        return "redirect:list";
    }

    @RequestMapping(value = "/deleteok/{id}", method = RequestMethod.GET)
    public String deletePostOK(@PathVariable("id") int id) {
        if(calendarService.deleteCalendar(id) == 0) System.out.println("데이터 삭제 실패");
        else System.out.println("데이터 삭제 성공 !!");
        return "redirect:../list";
    }
}
